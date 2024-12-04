package Com.Crm.FileUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFactory {

	FileInputStream fis=new FileInputStream("D:\\selenium\\DwsLogin.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	
}
