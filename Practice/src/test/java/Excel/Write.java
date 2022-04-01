package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Write {

	public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiomart.com/c/groceries/fruits-vegetables/219");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav_link_219\"]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"sort_container\"]/button[5]")).click();
		List<WebElement> Links = driver.findElements(By.xpath("//*[@class=\"clsgetname\"]"));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		List<WebElement> Links1 = driver.findElements(By.xpath("//*[@id=\"final_price\"]"));

		System.out.println(Links.size());
		System.out.println(Links1.size());
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		// Row row = sheet.createRow(1);
		// Cell cell = (Cell) row.createCell(1);

		
		//XSSFWorkbook workbook = new XSSFWorkbook();
		//XSSFSheet sheet = workbook.createSheet("sampledata");
Thread.sleep(2000);
		for (int i = 0; i < Links.size(); i++) {
			 String lin1 = Links.get(i).getText();
             String real = lin1.replaceAll("[^a-zA-Z0-9]", ",");
            // String real1 = lin1.replace("[","").replace("]",""); 

			  //  System.out.println(jsonobject.getInt("id"));

            String lin2 = Links1.get(i).getText();		
             String reall = lin2.replaceAll("[^a-zA-Z0-9]", "");

           

		     String exx =real+reall;
         //  String reall = lin1.replaceAll("[^a-zA-Z0-9]", ",");
           // String ex = str.replace("[","").replace("]",""); 
		  //  String s = exx.toString();
		    System.out.println(exx.toString());
		    FileWriter writter = new FileWriter("C:\\\\Users\\\\karthick\\\\Documents\\\\data\\\\PWA Register.xlsx",true);
	    

		    writer.append("LastName");
		}
		wb.close();

		System.out.println("file created");
	}
}


