package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class SplitAndGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitAndGroup sg = new SplitAndGroup();
		sg.readCSV();

	}
	
	public void readCSV(){
		String csvFile = "C:\\Users\\POO\\Downloads\\test.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine())!=null) {
				String[] gett = line.split(csvSplitBy);
				System.out.println("CSV FILE date["+gett[0]+"]-Open["+gett[1]+"]");
				System.out.println(gett[0]+gett[1]+gett[2]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

}
