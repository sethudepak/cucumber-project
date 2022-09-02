package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		
		public static WebDriver driver;

		public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public String getDataFromExcel(String path, String sheetName, int rowNumber, int cellNumber) throws IOException {

			String res = null;
			File file = new File(path);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(inputStream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNumber);
			Cell cell = row.getCell(cellNumber);
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				res = cell.getStringCellValue();

				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
					res = sdf.format(dateCellValue);

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					Long val = Long.valueOf(l);
					res = val.toString();

				}
				break;
			default:
				break;
			}
			return res;
		}

		public static void getUrl(String url) {

			driver.get(url);
		}

		public WebElement findElementById(String idText) {
			WebElement element = driver.findElement(By.id(idText));
			return element;
		}

		public WebElement findElementByName(String nameText) {
			WebElement element = driver.findElement(By.name(nameText));
			return element;
		}

		public WebElement findElementByClass(String classText) {
			WebElement element = driver.findElement(By.className(classText));
			return element;
		}

		public WebElement findElementByXpath(String xpathExpression) {
			WebElement element = driver.findElement(By.xpath(xpathExpression));
			return element;
		}

		public void findElementByPartialText() {

		}

		public void loginClick(WebElement element) {
			element.click();

		}
		public void radioButton(WebElement element) {
			Select s = new Select (element);
			

		}

		public void sendkeys(WebElement element, String sendText) {
			element.sendKeys(sendText);

		}

		public void selectByIndex(WebElement element, int indexNumber) {

			Select s = new Select(element);
			s.selectByIndex(indexNumber);

		}
	public void selectByVisualText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}
		public static void quit() {
			driver.quit();

		}

		public String getAttributeValue(WebElement element, String attributeName) {

			String attribute = element.getAttribute(attributeName);
			return attribute;

		}

		public String getTitle() {
			String title = driver.getTitle();
			return title;

		}

		public String getText(WebElement element) {
			String text = element.getText();
			return text;

		}

		public void getFileOutputStream(String path, String sheetName, int rowNumber, int cellNumber, WebElement element,
				String text) throws IOException {
			String res = null;
			File file = new File(path);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(inputStream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNumber);
			Cell createCell = row.createCell(cellNumber);
			String attribute = element.getAttribute(text);
			createCell.setCellValue(attribute);
			FileOutputStream out = new FileOutputStream(file);
			book.write(out);

		}

		public void implecitlyWait(long number, TimeUnit type) {

			driver.manage().timeouts().implicitlyWait(number, type);

		}

		public void elementClear(WebElement element) {
			element.clear();

		}

		public String getDataexcell(String path, String sheetName, int rowNumber, int cellNumber) throws IOException {
			String res = null;
			File file = new File(path);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(inputStream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNumber);
			Cell cell = row.getCell(cellNumber);
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();
				res = stringCellValue;

				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String format = sdf.format(dateCellValue);

					res = format;

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					Long val = Long.valueOf(l);
					String string = val.toString();
					res = string;

				}
				break;
			default:
				break;
			}
			return res;
		}

		public void clearSendKeys(String idText, String keytext) {
			WebElement text = driver.findElement(By.id(idText));
			text.clear();
			text.sendKeys(keytext);

		}
		
		public void clear(WebElement element) {
			
			element.clear();

		}
	public void roboEnter() throws AWTException {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		}

	public void confirmAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	}
