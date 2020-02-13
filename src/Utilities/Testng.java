package Utilities;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonFunLibrary.ERP_Functions;

public class Testng {
	ERP_Functions fun=new ERP_Functions();
	
	@BeforeMethod
	public void launch() throws Exception{
		
		fun.launchbrowser("http://webapp.qedge.com/login.php");
		Thread.sleep(5000);
		fun.login("admin", "master");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void regiestration() throws Exception{
		ExcelFileUtil exll=new ExcelFileUtil();
		 int rows=exll.rowCount("supplier");
		
		 
		for(int i=1;i<=rows;i++){
        	String sname=exll.getData("supplier", i, 0);
        	String address=exll.getData("supplier", i, 1);
        	String city=exll.getData("supplier", i, 2);
        	String country=exll.getData("supplier", i, 3);
        	String cperson=exll.getData("supplier", i, 4);
        	String pnumber=exll.getData("supplier", i, 5);
        	String mail=exll.getData("supplier", i, 6);
        	String mnumber=exll.getData("supplier", i, 7);
        	String note=exll.getData("supplier", i, 8);
        	String result=fun.supplier(sname,address,city,country,cperson,pnumber,mail,mnumber,note);
        	exll.setData("supplier", i, 9, result);
        	
		
	}
	}
	@AfterMethod()
	public void close(){
		fun.closebrw();
	}
	
	
}
