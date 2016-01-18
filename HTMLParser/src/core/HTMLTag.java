package core;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLTag {
	private String type;
	private boolean opened;
	private Map<String, String> attrMap;
	
	private HTMLTag()
	{
		attrMap = new HashMap<String, String>();
	}
	
	public static HTMLTag Parse(String tagText)
	{
		if (tagText == null || !tagText.startsWith("<") || !tagText.endsWith(">"))
		{
			return null;
		}
		
		tagText = tagText.substring(1, tagText.length() - 1).trim();
		
		// Find the type of html tag like "html", "body", "div"
		Pattern typePattern = Pattern.compile("/?[^\\s]+");
		Matcher typeMatcher = typePattern.matcher(tagText);
		if (!typeMatcher.find())
		{
			return null;
		}
		
		HTMLTag tag = new HTMLTag();
		
		tag.type = typeMatcher.group();
		tag.opened = tag.type.charAt(0) != '/';
		if (!tag.opened)
		{
			tag.type = tag.type.substring(1);
		}
		
		// Close tag doesn't have attributes
		if (tag.opened)
		{
			Pattern attrPattern = Pattern.compile("[^=\\s]+=((\"[^\"]+\")|([^\"\\s]+))");
			Matcher attrMatcher = attrPattern.matcher(tagText);
			while(attrMatcher.find())
			{
				String attrGroup = attrMatcher.group();
				int index = attrGroup.indexOf('=');
				String attrName = attrGroup.substring(0, index);
				String attrValue = attrGroup.substring(index + 1);
				if (attrValue.startsWith("\"") && attrValue.endsWith("\""))
				{
					attrValue = attrValue.substring(1, attrValue.length() - 1);
				}
				
				tag.attrMap.put(attrName, attrValue);
			}
		}
		
		return tag;
	}

	public String getType() {
		return type;
	}

	public boolean isOpened() {
		return opened;
	}

	public Map<String, String> getAttrMap() {
		return attrMap;
	}
}
