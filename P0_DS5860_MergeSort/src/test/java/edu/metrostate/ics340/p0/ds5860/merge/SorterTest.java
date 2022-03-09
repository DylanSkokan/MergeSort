/* Copyright © 2022. Ralph A Foy. All Rights Reserved. 
 * Provided for students registered in ICS340-50 at Metropolitan State University.
 */
package edu.metrostate.ics340.p0.ds5860.merge;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SorterTest {

	@Test
	public void test0() {
		String [] items = {};
		String [] exp = {};
		
		Sorter.sort(items);
		assertArrayEquals(exp, items);
	}

	@Test
	public void test1() {
		String [] items = {"A"};
		String [] exp = {"A"};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}

	@Test
	public void test2a() {
		String [] items = {"A", "B"};
		String [] exp = {"A", "B"};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}

	@Test
	public void test2b() {
		String [] items = {"B", "A"};
		String [] exp = {"A", "B"};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}
	
	@Test
	public void moreLetters1() {
		String [] items = {"E", "B", "A", "C", "D"};
		String [] exp = {"A", "B", "C", "D", "E"};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}
	
	@Test
	public void moreLetters2() {
		String [] items = {"E", "B", "F", "A", "C", "D"};
		String [] exp = {"A", "B", "C", "D", "E", "F"};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}
	
	@Test
	public void words1() {
		String [] items = {"Apple", "Grape", "Orange", "Banana", "Blueberry", "Strawberry"};
		String [] exp = {"Apple", "Banana", "Blueberry", "Grape", "Orange", "Strawberry"};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}
	
	@Test
	public void nums1() {
		Integer [] items = {1, 3, 9, 2, 5, 4};
		Integer [] exp = {1, 2, 3 , 4, 5, 9};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}
	
	@Test
	public void nums2() {
		Integer [] items = {38, 27, 43, 3, 9, 82, 10};
		Integer [] exp = {3, 9, 10, 27, 38, 43, 82};

		Sorter.sort(items);
		assertArrayEquals(exp, items);	
	}
}