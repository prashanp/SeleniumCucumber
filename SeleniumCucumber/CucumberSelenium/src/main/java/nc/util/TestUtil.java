package nc.util;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.*;

import com.nc.SanveoBase;


public class TestUtil extends SanveoBase {

    static String DatabaseURL = prop.getProperty("databaseurl","databasename");
	static String DatabaseName = prop.getProperty("databasename");
	static String UserName = prop.getProperty("username");
	static String Password = prop.getProperty("password");
	public static String TESTDATA_SHEET_PATH = "D:/repos/various/eclipse-workspace/Catalystone/src/main/java/catalystone/testdata/CatalystoneTestData.xlsx";
	static Workbook book;
	static Sheet sheet;


//	// create an excel sheet
//	public static Object[][] getTestData(String sheetName) {
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			book = WorkbookFactory.create(file);
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//			}
//		}
//		return data;
//	}

	public static void SqlConnection() throws ClassNotFoundException, SQLException{

		String DB = (DatabaseURL + ";"+ DatabaseName);

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("driver loaded");
		Connection con = DriverManager.getConnection(DB,UserName,Password);
		smt = con.createStatement();
        System.out.println("Statement created");
	}

	public static Connection SQLConnection() throws ClassNotFoundException, SQLException
	{
		String DB = (DatabaseURL + ";"+ DatabaseName);
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(DB,UserName,Password);
	}

	 public static void takeScreenshotAtEndOfTest() throws IOException {
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String currentDir = System.getProperty("user.dir");
		 FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	 }
}
	
