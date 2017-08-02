package com.example.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.example.demo.assertthat.SampleTest;
import com.example.demo.calc.CalculatorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CalculatorTest.class,SampleTest.class })
public class FeatureTestSuite {
	// the class remains empty,
	// used only as a holder for the above annotations
}
