package com.jspiders.casestudemusicplayer;

public class Song {
    private int Id;
    private String Name;
    private String MovieOrAlbum;
    private String Singer;
    private String Lyricist;
    private String Duration;
    public  int getId() {
		return Id;
	}
    public void setId(int id){
		this.Id=id;
	}
    public  String getName() {
		return Name;
	}
    public void setName(String name){
		Name=name;
	}
    public  String getMovieOrAlbum() {
		return MovieOrAlbum;
	}
	public void setMovieOrAlbum(String movieoralbum){
		MovieOrAlbum=movieoralbum;
	}
	public  String getSinger() {
		return Singer;
	}
	public void setSinger(String singer){
		Singer=singer;
	}
	public  String getLyricist() {
		return Lyricist;
	}
	public void setLyricist(String lyricist){
		Lyricist=lyricist;
	}
	public  String getDuration() {
		return Duration;
	}
	public void setDuration(String duration){
		Duration=duration;
	}
	
   
}
