/*
*Calculator
*
*(1.1)
*
*(Abdullah Salem Al-otaibi)
*
*( The class do the mathematics operations on two variable)
*/


public class Calculator {

  private int value1; //The value of the first variable.
  
  private int value2; //The value of the second variable.
  
  private int result; // The result of the math operator

  public void setValue (int val1 , int val2) { 
	  
	 this.value1= val1;			   //values setter
	 this.value2= val2;
	 
  }
 
  public int add ( ) { 
	
	result = value1 + value2;     // addition operator
	
	return result;
  }
 
  public int substract (int value1, int value2) { 
	
	result = value1 - value2;		// substract operator
	return result; 
	
  }
 
  public int multiply (int value1, int value2) {
	
	 result = value1 * value2;       // multply operator
	 return result;
	 
  }
 
  public int division (int value1, int value2) {
	
	 result = value1 / value2;       // division operator
	 return result;
	 
  }
}