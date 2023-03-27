package Exercise;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelReader1 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        int noOfRows = sheet1.getPhysicalNumberOfRows();

       var exelData = new ArrayList<>();
       for (int i =1;i<noOfRows;i++){

       }



    }
}
