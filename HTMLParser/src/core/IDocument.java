package core;

public interface IDocument {
	public boolean Parse(String text);
	
	public IElements getElements(String pattern);
	
	public void printTree();
}
