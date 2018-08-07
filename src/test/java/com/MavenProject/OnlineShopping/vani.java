package com.MavenProject.OnlineShopping;

import org.testng.annotations.Test;

public class vani extends OpenBowser {
	
	 @Test 
     public void appl() throws InterruptedException
     {
	     driver.get("https://www.ebay.co.uk/");
	     Thread.sleep(1000);
	     System.out.println("Sucessfully launch the application");
     }

}
