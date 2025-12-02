package practicePackage;

import com.comcast.crm.geniricUtility.ExcelUtility;
import com.comcast.crm.geniricUtility.FileUtility;

public class HAgh {
public static void main(String[] args) throws Throwable {
	
	FileUtility flib = new FileUtility();
	String BROWSER = flib.toReadDatFromPropFiles("browser");
	String URL = flib.toReadDatFromPropFiles("url");
	String UN = flib.toReadDatFromPropFiles("un");
	String PW = flib.toReadDatFromPropFiles("pw");
//	
//	System.out.println(BROWSER);
//	System.out.println(URL);
//	System.out.println(UN);
//	System.out.println(PW);
	
	ExcelUtility elib = new ExcelUtility();
	
	String val1 = elib.toReadDataFromExcel("Campaign", 1, 0);
	String val2 = elib.toReadDataFromExcel("Campaign", 1, 1);
	String val3 = elib.toReadDataFromExcel("Campaign", 1, 2);
	String val4 = elib.toReadDataFromExcel("Campaign", 1, 3);
	
	System.out.println(val1);
	System.out.println(val2);
	System.out.println(val3);
	System.out.println(val4);
	
	
}
}
