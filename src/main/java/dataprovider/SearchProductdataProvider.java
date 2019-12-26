package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SearchProductdataProvider {
	public String path = "./TestData.xlsx";
	public XSSFWorkbook workbook;
	FileInputStream fis;
	/*public LogindataProvider(String path) {
		this.path = path;
	}*/
	
	public List<String> getProducts(){
		
		List<String> productDetails = new ArrayList<String>();;
		
		try{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("PoductDetails");
			int n = worksheet.getLastRowNum();
			System.out.println("Total number of rows :"+n);
			
			Random random = new Random();
			int generatedNumberRandom = random.nextInt(n)+1;
			//productDetails = worksheet.getRow(generatedNumberRandom).getCell(0).getStringCellValue();
			
			DataFormatter formatter = new DataFormatter();
			String val = formatter.formatCellValue(worksheet.getRow(generatedNumberRandom).getCell(0));
			
			productDetails.add(val);
			System.out.println(productDetails);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return productDetails;
		
	}
	
}
