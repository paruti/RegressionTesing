import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class File {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream f = new FileInputStream("C:\\Users\\Parthi Rajan\\Desktop\\Book1");
		Workbook wrkbk = new HSSFWorkbook();
		Sheet sheet = wrkbk.getSheetAt(0);
		Iterator<Row> rowIterator=sheet.iterator();
		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			System.out.println(rowValue);
			
		}
		
	}

}
