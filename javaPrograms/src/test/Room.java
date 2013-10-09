package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Room {
	String roomNo;
	String roomType;
	String roomArea;
	String acMachine;

	public String getRoomType() {
		return "Room Type : "+roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomArea() {
		return "Room Area : "+roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}
	public String getAcMachine() {
		return "AC Machine : "+acMachine;
	}
	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}
	public void setRoomNo(String roomNo){
		this.roomNo = roomNo;
	}
	public String getRoomNo(){
		return "Room No : "+this.roomNo;
	}
	
	public String DiplayData(){
		//System.out.println(getRoomNo()+"\n"+getRoomType()+"\n"+getRoomArea()+"\n"+getAcMachine());
		return getRoomNo()+", "+getRoomType()+", "+getRoomArea()+", "+getAcMachine()+"\n";
	}
	public void addCar(){
		Scanner sn = new Scanner(System.in);
		System.out.println("Please enter Room No:");
		// getting values
		setRoomNo(sn.nextLine());
		System.out.println("Please enter Room Type:");
		setRoomType(sn.nextLine());
		System.out.println("Please enter Room Area:");
		setRoomArea(sn.nextLine());
		System.out.println("Please enter AC Machine:");
		setAcMachine(sn.nextLine());
		
		DiplayData();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Class initilize
		Room rm = new Room();
		File fl = new File("E:\\Room.txt");
		if(!fl.exists()){
			try {
				fl.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileReader fr;
		try {
			fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null){
				System.out.println("Reading : "+line);	
			}
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/**
		 * this below code is working file
		 */
		Scanner scn = new Scanner(System.in);
		String strContinue = "Y", strStop = "N", strAnswer=null;
		List storeValues = new ArrayList();
		
		do{
			
			System.out.println("Please enter Room No:");
			// getting values
			rm.setRoomNo(scn.nextLine());
			System.out.println("Please enter Room Type:");
			rm.setRoomType(scn.nextLine());
			System.out.println("Please enter Room Area:");
			rm.setRoomArea(scn.nextLine());
			System.out.println("Please enter AC Machine:");
			rm.setAcMachine(scn.nextLine());
			//String str = rm.DiplayData();
			//System.out.println(rm.DiplayData());
			
			storeValues.add(rm.DiplayData());
			
			System.out.println("Do you want to add another room? (Y/N)");
			strAnswer = scn.nextLine();
			
		}while(strAnswer.equalsIgnoreCase(strContinue));
		
		System.out.println("Thanks for providing the informations...");
		System.out.println(storeValues.toString());
		
		/*
		 * this below code used for switch case with do while loop 
		 
		
		int choice = 0;
		String redo = "n";
		do {   
	        System.out.println("Enter your choice:");
	        System.out.println("1. Add a car \n 2. Exit");
	        choice = scn.nextInt();
	        
			switch (choice) {
			case 1: rm.addCar();
				System.out.println("Do you want to continue? (Y or N)?");
				redo = scn.nextLine();
			case 2:
				redo = "n";
				break;
			default:
				break;
			}
		}while(redo == "Y" || redo == "y");
				*/
		
		try {
			File f = new File("E:\\Room.txt");
			if(!f.exists()){
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new  BufferedWriter(fw);
			//	bw.write(rm.DiplayData());
			bw.append(rm.DiplayData());
			bw.close();
			System.out.println("Done!!!");
			PrintWriter writer = new PrintWriter("E:\\Room.txt");
			//writer.print(rm.DiplayData());
			Iterator itr = storeValues.iterator();
			while(itr.hasNext()){
				//System.out.println((CharSequence) itr.next());
				writer.append((CharSequence) itr.next());
			}
			//writer.append(storeValues.toString());
			System.out.println("Done Iterator!!!");
			writer.flush();
			writer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		
	}
}
