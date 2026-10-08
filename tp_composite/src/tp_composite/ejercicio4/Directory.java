package tp_composite.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	private String name; 
	private LocalDate creationDate; 
	private LocalDate lastModified; 
	private List <FileSystem>directories = new ArrayList<FileSystem>(); 
	
	public String getName() {
		return this.name; 
	}
	public LocalDate getCreationDate() {
		return this.creationDate;
	}
	public LocalDate getDate() {
		return this.lastModified; 
	}
	public List<FileSystem> getDirectories(){
		return this.directories; 
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public FileSystem lastModified() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return this.oldestElementBetween(oldestElement());
		
	}
	private FileSystem oldestElementBetween(FileSystem e) {
		return e; //aca va la logica del elemento mas viejo, en teoria usando los mensajes de la interfaz 
	}
}
