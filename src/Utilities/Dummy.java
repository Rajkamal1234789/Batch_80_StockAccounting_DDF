package Utilities;

public class Dummy {

	public static void main(String[] args) throws Exception {
		
		ExcelFileUtil exl=new ExcelFileUtil();
		int rowcount=exl.rowCount("supplier");
		System.out.println("no.of rows are:"+rowcount);
		
		int columncount=exl.colCount("supplier");
		System.out.println("no.of rows are:"+columncount);
		
		String celldata=exl.getData("supplier", 0,0);
		System.out.println("celldata is:"+celldata);
		
		exl.setData("supplier", 3, 9, "Fail");
		
		

	}

}
