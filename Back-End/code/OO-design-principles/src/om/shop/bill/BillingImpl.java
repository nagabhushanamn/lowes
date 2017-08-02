package om.shop.bill;

import java.util.List;

import om.shop.pm.PriceMatrix;
import om.shop.pm.PriceMatrixImpl_v1;

/*
 *  design & performance issues
 *  --------------------------
 *  
 *  -> too many dependencies created/destructed on repeated operation
 *  	    => slow, memory usage...
 *  -> tight-coupling
 *  	    => maintainance issues
 *  -> unit-testing is difficult
 *      => dev/bug-fix slow 
 * 
 *  ----------------------------------------------
 *  
 *  reason for these issues
 *  
 *  --> creating own dependency in dependent's class
 *  
 *  soln :
 *  
 *  --> don't create , do lookup
 *  
 *  limitation on lookup: ==> location tight-coupling
 *  
 *  better soln :
 *  
 *  -> don't create/lookup dependency , inject thru 'some-one' ( IOC )
 *  
 *  how to implement IOC ?
 *  
 *  thru 'Dependency Injection ' ( DI )
 *  
 *   --> constructor
 *   --> setter
 *   
 *   ------------------------------------
 *  
 *  
 * 
 */

public class BillingImpl implements Billing {

	// private PriceMatrixImpl_v1 priceMatrix = null;
	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/* (non-Javadoc)
	 * @see om.shop.bill.Billing#getTotalPrice(java.util.List)
	 */
	@Override
	public double getTotalPrice(List<String> cart) {
		double total = 0.0;
		// priceMatrix = new PriceMatrixImpl_v1();
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}
	
	

}
