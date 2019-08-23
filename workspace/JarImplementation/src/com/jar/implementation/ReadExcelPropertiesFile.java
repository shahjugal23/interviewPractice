package com.jar.implementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.print.attribute.HashAttributeSet;

import org.apache.poi.hpsf.Array;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPropertiesFile {

	public static void main(String[] args) throws IOException {

		readProperties();
		readExcel();
		readCSVFile(); //PENDING https://stackoverflow.com/questions/20068383/convert-csv-values-to-a-hashmap-key-value-pairs-in-java
	}


	private static void readCSVFile() throws IOException {
		String sourceFile = System.getProperty("user.dir")+"/LoginFile.csv";
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(sourceFile));
		String line ="";
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		System.out.println("The list elements are: ");
		while((line = br.readLine())!= null){
			String user[] = line.split(",");
			for (int i = 0; i < user.length; i++) {
				System.out.print(" "+user[i]);
				if(hm.get(user[i]) == null){
					hm.put(user[i], 1);
				}
				else
				{
					hm.put(user[i], ( hm.get(user[i]) + 1) );
				}
			}
		}
	Iterator<String> itr = hm.keySet().iterator();
	System.out.println("\nThe count is: ");
	while(itr.hasNext())
	{
		String userName = itr.next();
		System.out.println(" "+userName+" : "+hm.get(userName));
	}
	
	}


	public static void readProperties() throws FileNotFoundException, IOException {
		System.out.println( System.getProperty("user.dir"));
		String source = System.getProperty("user.dir")+ "/myproperties.properties";

		File file = new File(source);
		FileInputStream stream = new FileInputStream(file); // WE DO THIS SINCE LOAD METHOD TAKES A STREAM
		
		Properties prop = new Properties();
		prop.load(stream); // LOAD METHOD TAKES A STREAM
		
		System.out.println("Name: "+ prop.getProperty("Address"));
	}

	private static void readExcel() throws IOException {
	
		String source = System.getProperty("user.dir") + "/Book1.xlsx";
		
		File file = new File(source);
		FileInputStream stream = new FileInputStream(file);
		
		System.out.println("File is present? - " + file.exists());
		
		String filename = file.getName();
		System.out.println("File Name: "+filename);
		String extension = filename.substring(filename.indexOf("."));
		
		Workbook myWkBook =null;
		
		if(extension.equals(".xlsx")){
			myWkBook= new XSSFWorkbook(stream);
		}
		else if(extension.equals(".xls"))
			myWkBook = new HSSFWorkbook(stream);
		
		
		Sheet sh = myWkBook.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		System.out.println("No of rows is :"+rowcount);
		System.out.println("LastRow Num: "+sh.getLastRowNum());
		System.out.println("FirstRow Num: "+sh.getFirstRowNum());
		for (int i = 0; i <= rowcount; i++) {
			Row row = sh.getRow(i);
			for(int j=0 ; j<row.getLastCellNum();j++)
			{
				try{
				System.out.print(" "+ row.getCell(j).getStringCellValue()+" ");
				}
				catch(Exception e){
					System.out.print(" "+row.getCell(j).getNumericCellValue()+" ");
				}
			}
			System.out.println();
		}
	}

}
