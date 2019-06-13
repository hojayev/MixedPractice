package Repl;

import java.awt.print.Book;

public class Repl222 {

	
	String title;
	String author;
	String tableOfContents;
	int nextPage = 1; 
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;

		
	}
	
	
	public void addChapter(String titleChapter, int chapterPages ) {
		
		nextPage+=chapterPages;
		tableOfContents += titleChapter + "..."+ nextPage + "\n";
		
	}
	
	public int getPages () {
		return nextPage;
	}
	
	public String getTableOfContents() {
		return tableOfContents;
	}
	
	public String toString() {
		return title +"\n" + author;
	}
	
	
}
