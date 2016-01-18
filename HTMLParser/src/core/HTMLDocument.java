package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLDocument implements IDocument {
	private HTMLElement rootElem;
	private final static Pattern tagPattern = Pattern.compile("\\Q<\\E(.+)\\Q>\\E");
	
	public HTMLDocument()
	{
		rootElem = new HTMLElement();
		rootElem.setParent(null);
	}
	
	@Override
	public boolean Parse(String text) {
		HTMLElement curElem = rootElem;
		
		while (true)
		{
			break;
		}
		
		return false;
	}

	@Override
	public IElements getElements(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printTree() {
		// TODO Auto-generated method stub
	}

	private int findNextTag(String html, HTMLTag nextTag)
	{
		Matcher match = tagPattern.matcher(html);
		if (!match.find())
		{
			return -1;
		}

		nextTag = HTMLTag.Parse(match.group());
		
		return match.start();
	}
}
