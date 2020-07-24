package com.code.TDDJUNIT;

public class RemoveAtest {
	RemoveA removea=new RemoveA();
//	@Test
	public void testFirstA() {
		assertEquals("BCD",removea.removeA("ABCD"));
	}
	private void assertEquals(String string, String removeA2) {
		// TODO Auto-generated method stub
		
	}

	public void test2As(){
		assertEquals("CD",removea.removeA("AACD"));
	}
//	@Test
	public void testSecondA(){
		assertEquals("BCD",removea.removeA("BACD"));
	}
	//@Test
	public void testNoAs(){
		assertEquals("BBAA",removea.removeA("BBAA"));
	}
//	@Test
	public void testOneA(){
		assertEquals("",removea.removeA("A"));
	}
	//@Test
	public void testEmpty(){
		assertEquals("",removea.removeA(""));
	}
//	@Test
	public void test(){
		assertEquals("BBAA",removea.removeA("AABBAA"));
	}
}