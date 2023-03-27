package Exercise;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        String path = "Files/Test1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Test1");

        int NOR = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < NOR; i++) {
            Row row = sheet.getRow(i);


            int cell = row.getPhysicalNumberOfCells();
            for (int j = 0; j < cell; j++) {
                Cell cel = row.getCell(j);
                System.out.print(cel+ " ");

            }
            System.out.println();

        }


    }
}
