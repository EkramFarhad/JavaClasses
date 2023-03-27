package Class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet2 = xssfWorkbook.getSheet("Sheet2");


        int noOFRows = sheet2.getPhysicalNumberOfRows();
       // System.out.println(noOFRows);

        for (int i = 0; i < noOFRows; i++) {
            Row row = sheet2.getRow(i);
            // System.out.println(row.getCell(0)+" "+ row.getCell(1));
            int noOFCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOFCells; j++) {
                System.out.print(row.getCell(j) + " <=> ");

            } System.out.println();


        }


    }

}


