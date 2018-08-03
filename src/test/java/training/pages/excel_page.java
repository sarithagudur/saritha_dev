package training.pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class excel_page {





public void excel() throws IOException {

String file_name = System.getProperty("user.dir")+"/src/test/java/training/testData/Remortgage.xlsx";
    FileInputStream excelfile = new FileInputStream(new File (file_name));
    Workbook workBook = new XSSFWorkbook(excelfile);
    Sheet sheet1 = workBook.getSheetAt(0);
    Iterator<Row> iterator = sheet1.iterator();

    while(iterator.hasNext()){
            Row currentRow = iterator.next();
        Iterator<Cell> Citerator = currentRow.iterator();

        while (Citerator.hasNext()){

            Cell currentCell = Citerator.next();
            if(currentCell.getCellTypeEnum().equals(CellType.STRING)){
                System.out.println(currentCell.getStringCellValue());

            }

            else{

                System.out.println(currentCell.getNumericCellValue());
            }

        }




    }





}


}