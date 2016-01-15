package core;

import java.util.Iterator;

public interface IElement {
	public IElement getParent();
	
	public IElements getChildren();
	
	public String getType();
	
	public Iterator<String> getProperties();
	
	public String getValue(String property);
	
	public void print();
}
