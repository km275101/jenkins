package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LogindataProvider {
	public String path = "./TestData.xlsx";
	public XSSFWorkbook workbook;
	FileInputStream fis;

	
	public List<String> getUserDetails() throws InvalidFormatException{
		
		List<String> userDetails = new ArrayList<String>();
		
		try{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("Login");
			int n = worksheet.getLastRowNum();
			System.out.println("Total number of rows :"+n);
			
			DataFormatter formatter = new DataFormatter();
			String val = formatter.formatCellValue(worksheet.getRow(1).getCell(0));
				userDetails.add(val);
			String val1 = formatter.formatCellValue(worksheet.getRow(1).getCell(1));
				userDetails.add(val1);
			System.out.println(userDetails);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return userDetails;
		
	}
	
}
