package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room rm = new Room();
		rm.setRoomNo("12");
		rm.setRoomType("Single");
		rm.setRoomArea("A Block");
		rm.setAcMachine("LG");
		rm.DiplayData();
		
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
			/*PrintWriter writer = new PrintWriter("E:\\Room.txt");
			//writer.print(rm.DiplayData());
			writer.append(rm.DiplayData());
			writer.close();*/
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		
	}

}
