package mockitoframework;

public interface CalculatorService {
	  public double add(double input1, double input2);
	   public double subtract(double input1, double input2);
	   public double multiply(double input1, double input2);
	   public double divide(double input1, double input2);

}

package mockitoframework;

public class MainApplication 
{
	   private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   
	   public double add(double input1, double input2){
	      return calcService.add(input1, input2);
	   }
	   
	   public double subtract(double input1, double input2){
	      return calcService.subtract(input1, input2);
	   }
	   
	   public double multiply(double input1, double input2){
	      return calcService.multiply(input1, input2);
	   }
	   
	   public double divide(double input1, double input2){
	      return calcService.divide(input1, input2);
	   }


}

package mockitoframework;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainApplicationTester {
	@InjectMocks 
	MainApplication mathApplication = new MainApplication();
	  @Mock
	   CalculatorService calcService;

	  @Test
	   public void testAdd(){
	      //add the behavior of calc service to add two numbers
	      //when(calcService.add(10.0,20.0)).thenReturn(30.00);
			
	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);

}}

package mockitoframework;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MainApplicationTester.class);
	      
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      
	      System.out.println(result.wasSuccessful());


	}

}
