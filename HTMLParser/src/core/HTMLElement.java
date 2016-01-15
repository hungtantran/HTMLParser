package core;

import java.util.Iterator;
import java.util.List;

public class HTMLElement implements IElement {
	private String text;
	private HTMLElement parent;
	private List<HTMLElement> children;
	
	public HTMLElement()
	{
		
	}

	@Override
	public IElement getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParent(IElement parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IElements getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void appendChild(IElement child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<String> getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttrValue(String attr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
