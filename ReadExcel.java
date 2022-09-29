import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;




public class ReadExcel{
	@Test
	public void ReadExcel() throws Exception{
		String excelPath = "/TestData/Test.xlsx";
		String fileNameString = "TestData";
		String SheetName = "Test";
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(SheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.print("Total=" +rowCount);
		
		
		String data = sheet.getRow(1).getCell(1).getStringCellValue().toString();
		System.out.print(data);
		
		Row row;
		for(int i=0; i<=rowCount; i++) {
			row = sheet.getRow(i);
			for(int j =0; j<=row.getLastCellNum(); j++) {
				String data1 = sheet.getRow(i).getCell(j).getStringCellValue().toString();
				System.out.print(data1+"");
				
			}
			System.out.println();
		}
		
	}
}