package com.lesson.les11.less10;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ExeleReadeDemo {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String pathIn ="D:/курс/excel-names.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(new File(pathIn));
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);
        String name = cell.getStringCellValue();
        System.out.println(name);

        workbook.close();

    }
}
