package workouts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CSVReaderTest {

	public static final String delimiter = ",";
	   public static void read(String csvFile) {
	      try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         int index = 0;
	         List<String> headerList = new LinkedList();
	         List<String> datasetList = new LinkedList();
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	            	
	            	if(index == 0) {
	            		headerList.add(tempStr);
	            	}else {
	            		datasetList.add(tempStr);
	            	}
	               System.out.print(tempStr + " ");
	            }
	            System.out.println();
	            ++index;
	         }
	         System.out.println(headerList);
	         System.out.println(datasetList);
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
	   public static void main(String[] args) {
	      // csv file to read
	      String csvFile = "D:\\TemplateInsert.csv";
	       CSVReaderTest.read(csvFile);
	   }
	}