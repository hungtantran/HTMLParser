package core;

import java.util.ArrayList;
import java.util.List;

public class HTMLElements implements IElements {
	private List<IElement> elems;
	
	public HTMLElements()
	{
		elems = new ArrayList<IElement>();
	}
	
	@Override
	public int size() {
		return elems.size();
	}

	@Override
	public IElement getElement(int index) {
		return elems.get(index);
	}

	@Override
	public void append(IElement elem) {
		elems.add(elem);
	}

}
