package tp_composite.ejercicio4;

import java.time.LocalDate;

public class Archive implements FileSystem{
	private String name; 
	private int fileSize; 
	private LocalDate lastModified; 
	
	public String getName() {
		return this.name;
	}
	public int getFileSize() {
		return this.fileSize;
	}
	public LocalDate getDate() {
		return this.lastModified;
	}
	@Override 
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.getFileSize();
	}
	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public FileSystem lastModified() {
		// TODO Auto-generated method stub
		return this; 
		
	}
	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return this; 
		
	}
	
}
