package core;

import java.util.Iterator;

public interface IElement {
	public IElement getParent();
	
	public void setParent(IElement parent);
	
	public IElements getChildren();
	
	public void appendChild(IElement child);
	
	public String getType();
	
	public void setType(String type);
	
	public Iterator<String> getAttributes();
	
	public String getAttrValue(String attr);
	
	public void SetAttr(String attr, String value);
	
	public String getText();
	
	public void setText(String text);
	
	public void print();
}
