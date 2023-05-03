package com.jspiders.casestudemusicplayer;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.casestudemusicplayer.main.MusicPlayer;


public class Operations    {
	private static ArrayList<Song> playList=new ArrayList<>();
	 private static Scanner s=new Scanner(System.in);
	Song song=new Song();
	 private static int j;
	
	
	public static void addOrRemo(){
		System.out.println("-----Menu-----");
		System.out.println("1.Add Song");
		System.out.println("2.Remove  Song");
		System.out.println("3.Back");
        System.out.println("----Choose The Option-------");
        int ip2=s.nextInt();
        switch (ip2)
  	  {
  	  case 1:{
  		addSong();
  		break;
  	  }
  	  case 2:{
        removeSong();
        break;
  	  }
  	case 3:{
  		editSong();
  		break;
  	  }
  	  case 4:{
  		back();
  		break;
  	  }
  	  
  		
  	}
    }
	
	public static void editSong() {
		System.out.println("Following Songs Are Present For Edit");
		displayAllSongs();
		
		
		
		
	}
  	public static void playSong(){
  		System.out.println("-----Menu-----");
  		System.out.println("1.Play All Songs");
  		System.out.println("2.Choose Songs");
  		//System.out.println("3.Shuffle");
  		System.out.println("3.Back");
          System.out.println("----Choose The Option-------");
          int ip3=s.nextInt();
  		switch (ip3)
  	  {
  	  case 1:{
  		playAllSongs();
  		
  	  break;
  	  }
  	  
  	  case 2:{
  	 chooseSongs();
  	  break;
  	  }
  	  
  	  //case 3:{
  		//shuffle();
  		// break;

  	 // }
  	 
  	case 3:{
  		 back();
  	  break;
  	  }
  	  
  	  
  		
  	}
   }
  	
  	
  	
  
	

  	public static void exit(){
  		MusicPlayer.bool=false;
  		System.out.println("You Are Exited Succesfully");
  		
  	}
  	
  	public static void addSong(){

  		System.out.println("How Many Songs You Want To Add");
  		int ip4=s.nextInt();
  		for(int i=1;i<=ip4;i++) {
  			Song song=new Song();
  	  		System.out.println("Enter Id For Song");
  	  		
  	  	    song.setId(s.nextInt());
  	  		System.out.println("Enter Name For Song");
  	  	    song.setName(s.next());
  	  		System.out.println("EnterMovie/Album Of Song");
  	  	    song.setMovieOrAlbum(s.next());
  	  	    
  	  		System.out.println("Enter Singer Of Song");
  	  	    song.setSinger(s.next());
  	  	    
  	  		System.out.println("Enter Lyricist Of Song");
  	  	    song.setLyricist(s.next());
  	  	    
  	  		System.out.println("Enter Duration Of Song");
  	  		song.setDuration(s.next());
  	  		
  	  	    playList.add(song);
  	  	    System.out.println("Song is Added Succesfully");
  	  	   
  		}
  		
  		
  		
    
  }
    
  	
  	
  	public static void removeSong(){
  		System.out.println("Select Songs  You Want To Remove");
  		displayAllSongs();
  		
  		
  		
  	}
  	
	public static void displayAllSongs(){
		for(j=0;j<playList.size();j++) {
  			System.out.println(j+1+"."+playList.get(j).getName()); //for accesing getName() first it should be created.
  		}
		
		
	}
			
      
  		
  	
    public static void playAllSongs() {
    	
    	for(int i=1;i<playList.size();i++) {
  			System.out.println(playList.get(i).getName()+"  " +" is now playing"); //for accesing getName() first it should be created.
  			
  	    break;
  		}
		
	}
  	public static void chooseSongs(){
  		displayAllSongs();
  	}
  	public static void back() {
  		MusicPlayer.menu();
  		
  	}
  	
	
	 
	}