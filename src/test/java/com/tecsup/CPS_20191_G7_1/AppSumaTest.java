package com.tecsup.CPS_20191_G7_1;

import org.junit.Assert;
import org.junit.Test;



public class AppSumaTest {
  
	  @Test
	   public void testSuma() {
		   
		   int valor_es= 9;
		  
		   int a=5;
		   int b=4;
		 
		   AppSuma p =new AppSuma();
		  int r= p.suma(a,b);
		   
		   //si la condicion es 
		   Assert.assertEquals(valor_es,r);
		  
	   }
	
	  public void testResta() {
		   
		   int valor_es= 1;
		  
		   int a=5;
		   int b=4;
		 
		   AppSuma p =new AppSuma();
		  int r= p.resta(a,b);
		   
		   //si la condicion es 
		   Assert.assertEquals(valor_es,r);
		  
	   }



}
