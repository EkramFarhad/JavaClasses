package Exercise;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) throws IOException {

        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        int noOfRow = sheet1.getPhysicalNumberOfRows();

        for (int i = 1; i < noOfRow; i++) {

            Row row = sheet1.getRow(i);

            int noOfCell = row.getPhysicalNumberOfCells();

            for (int j = 0; j < noOfCell; j++) {

                Cell cell = row.getCell(j);
                System.out.println(cell);

            }
            System.out.println();


        }


    }
}
