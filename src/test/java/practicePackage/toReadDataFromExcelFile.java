package practicePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class toReadDataFromExcelFile {
	public static void main(String[] args) throws Throwable {

		// step 1
		FileInputStream fis = new FileInputStream("./\\src\\test\\resources\\resources\\Campaign.xlsx");

		// step 2
		Workbook wb = WorkbookFactory.create(fis);

		// step 3
		Sheet sh = wb.getSheet("Campaign");
//
//		// step 4
//		Row rr = sh.getRow(1);
//
//		// step 5
//		Cell sell = rr.getCell(0);
//
//		// step 6
//		String val = sell.getStringCellValue();
//		
//		System.out.println(val);
	

		String cName = sh.getRow(1).getCell(0).getStringCellValue();
		String status = sh.getRow(1).getCell(1).getStringCellValue();
		String tarSize = sh.getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(cName);
		System.out.println(status);
		System.out.println(tarSize);


		// step 7
		wb.close();

		
	}
}
