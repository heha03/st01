package st1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangle {
	private Triangle tri;
	//private int testCases[][3]={{-2,2,3}};
	@Test
	public void testTriangles1(){
		tri=new Triangle(2,2,3);
		assertFalse(tri.isEquilateral());
		assertTrue(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}
	@Test
	public void testTriangles2(){
		tri=new Triangle(2, 2, 2);
		assertTrue(tri.isEquilateral());
		assertTrue(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}
	@Test
	public void testTriangles3(){
		tri=new Triangle(2, 3, 4);
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertTrue(tri.isScalene());
	}
}
