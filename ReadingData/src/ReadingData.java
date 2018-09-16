import java.util.Hashtable;


public class ReadingData {

	public static void main(String[] args) {
	  Xls_Reader xls=new Xls_Reader("E:\\Data.xlsx");
	 int rowcount=xls.getRowCount("Login");
	 System.out.println("Total rows are : "+rowcount);
	 int cols=xls.getColumnCount("Login");
	 System.out.println("The total cols are :"+cols);
	 
	 
	 String data=xls.getCellData("Login", "Password", 3);
	 System.out.println(data);
	 data=xls.getCellData("Login", 0, 3);
	 System.out.println(data);
	 
	 xls.setCellData("Login", "Password", 20, "appium/selenium");
	 
	 Hashtable table = new Hashtable();
	 table.put("name", "Automation");
	 table.put("City","london");
	 System.out.println(table.get("name"));
	 
	}
	


}
