package tp_composite.ejercicio4;

public interface FileSystem {
	
	public int totalSize();
	//Retorna el total ocupado en disco del receptor. Expresado en bytes 
	
	public void printStructure();
	//Imprime en consola el contenido indicando el nombre del elemento e indentandolo con tantos espacios como profundidad en la estructura 
	
	public FileSystem lastModified();
	//Elemento mas nuevo
	
	public FileSystem oldestElement();
	//Elemento mas antiguo 
	
	/*Para saber el archivo mas viejo, hay que expandir la interfaz, asi se mantiene el polimorfismo
	 * ya que ambas clases tienen registros temporales que representan distintas cosas
	 * */
	
}
