package CommonFunLibrary;

public class dummy {

	public static void main(String[] args) throws Exception {
		ERP_Functions fun=new ERP_Functions();
		String result=fun.launchbrowser("http://webapp.qedge.com/login.php");
		System.out.println(result);
		fun.login("admin", "master");
		String raj=fun.supplier("raj", "hnk", "wgl", "india", "rajkamla1", "65465464", "hhdf@gmail.com", "958565", "testing");
	System.out.println(raj);
	

	}

}
