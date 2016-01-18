package test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import core.HTMLTag;

public class HTMLTagUnitTest {

	@Test
	public void test()
	{
		testWellFormattedOpenTag();
		testWellFormattedCloseTag();
	}
	
	public void testWellFormattedOpenTag()
	{
		String tagText = "<body attr1=2 attr2 attr3=\"asdasd:=\">";
		HTMLTag htmlTag = HTMLTag.Parse(tagText);
		
		assertEquals("body", htmlTag.getType());
		assertTrue(htmlTag.isOpened());
		
		Map<String, String> attrMap = htmlTag.getAttrMap();
		assertEquals(2, attrMap.size());
		assertEquals("2", attrMap.get("attr1"));
		assertEquals("asdasd:=", attrMap.get("attr3"));
	}
	
	public void testWellFormattedCloseTag()
	{
		// Close tag
		String tagText = "</body>";
		HTMLTag htmlTag = HTMLTag.Parse(tagText);
		
		assertEquals("body", htmlTag.getType());
		assertFalse(htmlTag.isOpened());
		
		Map<String, String> attrMap = htmlTag.getAttrMap();
		assertEquals(0, attrMap.size());
	}
}
