package com.jspiders.casestudemusicplayer.main;

import java.util.Scanner;

import com.jspiders.casestudemusicplayer.Operations;


public class MusicPlayer {
	
	MusicPlayer musicPlayer=new MusicPlayer();
	
	static Scanner scanner=new Scanner(System.in);
	
	public static boolean bool=true;
	private static Operations operations;
	
	public static void menu() {
		
			  //for changing the option we must have o use while loop.
			  while(bool){ 
				  System.out.println("1.Add/Remove Song");
					System.out.println("2.Play Song"); 
					System.out.println("3.Edit Song");
					System.out.println("4.Exit");
						int choose=scanner.nextInt();
				  switch(choose)
				  {
				  case 1:{
					Operations.addOrRemo();
					break;
				  }
				  
				  case 2:{
					Operations.playSong();
					break;
				  }
				  
				  case 3:{
					Operations.editSong();
					break;
				  }
				  case 4:{
						Operations.exit();
						break;
					  }
				  
				 
				 
				  }
			  }
		}
		 
	
	 public static void main(String[] args) {
			menu();
			
			
			
		}
}
		  
			



