package com.lesson.les11;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExeleWriteDemo {
    public static void main(String[] args) throws IOException {
        String pathOut = "D:\\курс/excel-names.xlsx";
    FileOutputStream fos = new FileOutputStream (new File(pathOut));

    XSSFWorkbook workbook = new XSSFWorkbook();
    // Налним данными
    XSSFSheet sheet = workbook.createSheet();
    XSSFRow row = sheet.createRow(0);
    XSSFCell cell = row.createCell(0);
    cell.setCellValue("Ашот");

    // Физически запись в файл
    workbook. write(fos);
}}
