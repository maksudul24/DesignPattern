package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.addNumbers;
import main.chainPattern;
import main.divNumbers;
import main.multifyNumbers;
import main.subNumbers;

class TestClass {
	chainPattern ch1=new addNumbers();
	chainPattern ch2=new subNumbers();
	chainPattern ch3=new multifyNumbers();
	chainPattern ch4=new divNumbers();
	ch1.setNextChain(ch2);
	ch2.setNextChain(ch3);
	ch3.setNextChain(ch4);
	
	numberClass requests = new numberClass(2,3,"add");
	
	@Test
	void test() {
		assertEquals(3 + 2 = 5, (3, 2,"add"),"");
	}

}
