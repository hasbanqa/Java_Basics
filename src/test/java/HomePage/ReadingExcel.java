package HomePage;




//File-->Workbook-->Sheets--->Rows-->Cells

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcel {

    public static void main(String[] args) throws IOException {

////        FileInputStream file = new FileInputStream("C:\\Users\\hasba\\IdeaProjects\\com.OrangeHRM\\testdata\\data.xlsx");
//        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
//
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet=workbook.getSheet("Sheet1");
//
//        int totalrows=sheet.getLastRowNum();
//        int totalcells=sheet.getRow(1).getLastCellNum();
//
//        System.out.println(totalrows);
//        System.out.println(totalcells);

        File src= new File(".\\testdata\\data.xlsx");

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook xsf = new XSSFWorkbook(fis);
        XSSFSheet sheet = xsf.getSheetAt(0);
        String entry1= sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(entry1);




    }








}
