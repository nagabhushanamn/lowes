package com.example.demo.categories;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

interface FastTests {
	/* category marker */ }

interface SlowTests {
	/* category marker */ }

class A {
	@Test
	public void a() {
		fail();
	}

	@Category(SlowTests.class)
	@Test
	public void b() {
	}
}

@Category({ SlowTests.class, FastTests.class })
class B {
	@Test
	public void c() {

	}
}



 @RunWith(Categories.class)
 @IncludeCategory(SlowTests.class)
 @SuiteClasses({ A.class, B.class }) // Note that Categories is a kind Suite
 public class Demo {
 // Will run A.b and B.c, but not A.a
 }
//
//@RunWith(Categories.class)
//@IncludeCategory(SlowTests.class)
//@ExcludeCategory(FastTests.class)
//@SuiteClasses({ A.class, B.class }) // Note that Categories is a kind of Suite
//public class Demo {
//	// Will run A.b, but not A.a or B.c
//}
