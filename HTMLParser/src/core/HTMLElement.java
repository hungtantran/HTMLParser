package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HTMLElement implements IElement {
	private String text;
	private String type;
	private Map<String, String> attrs;
	private List<String> attrNames;
	
	private IElement parent;
	private IElements children;
	
	public HTMLElement()
	{
		children = new HTMLElements();
		attrs = new HashMap<String, String>();
		attrNames = null;
	}

	@Override
	public IElement getParent() {
		return parent;
	}

	@Override
	public void setParent(IElement parent) {
		this.parent = parent; 
	}

	@Override
	public IElements getChildren() {
		return children;
	}

	@Override
	public void appendChild(IElement child) {
		children.append(child);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Iterator<String> getAttributes() {
		if (attrNames == null)
		{
			attrNames = new ArrayList<String>();
			for(Entry<String, String> attr : attrs.entrySet())
			{
				attrNames.add(attr.getKey());
			}
		}
		
		return attrNames.iterator();
	}

	@Override
	public String getAttrValue(String attr) {
		return this.attrs.get(attr);
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
	}
}
