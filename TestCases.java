//Olubukola Akintoroye
//CSC 5991 - Software Testing
//6/17/18

package testingpackage;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.LinkedList;
public class TestCases {

	@Test
	public void testcase1() {

		
		//precondition - [1,2,3] has been added to both linked list
		LinkedList<Integer> lla = new LinkedList<Integer>();
		LinkedList<Integer> llb = new LinkedList<Integer>();
		
		for(int i = 1; i<4; i++)
		{
			lla.add(i);
			llb.add(i);
		}
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition - assert expected result vs actual result
		assertEquals(true,bol);
	}
	
	@Test
	public void testcase2() {
	
		
		//precondition - [1,2,3] has been added to both linked list, lla is an integer while llbis 
		//a string
		LinkedList<Integer> lla = new LinkedList<Integer>();
		LinkedList<String> llb = new LinkedList<String>();
		
		for(int i = 1; i<4; i++)
		{
			lla.add(i);
			llb.add(Integer.toString(i));
		}
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition - expected to be false because of the different data types
		assertEquals(false,bol);
	}
	
	@Test
	public void testcase3() {
	
		//precondition: lla contains 1,2,3 while llb contains 0,1,2
		LinkedList<Integer> lla = new LinkedList<Integer>();
		LinkedList<Integer> llb = new LinkedList<Integer>();
		
		for(int i = 1; i<4; i++)
		{
			lla.add(i);
			llb.add(i-1);
	
		}
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, although it has two common elements the position is not the same
		assertEquals(false,bol);
		
	}
	
	@Test
	public void testcase4() {
		
		//precondition: lla contains 1,2,3 and the llb contains 3,2,1
		LinkedList<Integer> lla = new LinkedList<Integer>();
		LinkedList<Integer> llb = new LinkedList<Integer>();
		
		for(int i = 1; i<4; i++)
		{
			lla.add(i);
			llb.add(4-i);
	
		}
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, although the same elements are in a different order
		assertEquals(false,bol);
		
	}
	
	@Test
	public void testcase5() {
	
		//precondition: llb contains 1,2,3 (decimal system) and lla contains 1,2,3(hexadecimal system)
		LinkedList<Character> lla = new LinkedList<Character>();
		LinkedList<Integer> llb = new LinkedList<Integer>();
		
		for(int i = 1; i<4; i++)
		{
			lla.add(Character.forDigit(i, 16));
			llb.add(i);
	
		}
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, although the same elements are in a different radix
		assertEquals(false,bol);
		
	}
	@Test
	public void testcase6() {
		
		//precondition: lla contains null nodes, while llb  contains empty string nodes
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
		
		
			lla.add(null);
			lla.add(null);
			lla.add(null);
			llb.add("");
			llb.add("");
			llb.add("");
	
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, null and empty strings are different
		assertEquals(false,bol);
		
	}
	@Test
	public void testcase7() {

		//precondition: lla contains a,b,c and llb contains aaa,bbb,ccc
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
		
		
			lla.add("a");
			lla.add("b");
			lla.add("c");
			llb.add("aaa");
			llb.add("bbb");
			llb.add("ccc");
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, although the same letters there are different amounts of the letter in each linked list
		assertEquals(false,bol);
		
	}
	
	@Test
	public void testcase8() {

		//precondition:lla contains AAA,BBB,CCC and llb contains aaa,bbb,ccc
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
		
		
			lla.add("AAA");
			lla.add("BBB");
			lla.add("CCC");
			llb.add("aaa");
			llb.add("bbb");
			llb.add("ccc");
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, comparing both linked list is case sensitive
		assertEquals(false,bol);
		
	}
	@Test
	public void testcase9() {

		//precondition: lla contains "-, -, -" and llb contains -,-,-
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
		
		
			lla.add("-, -, -");
			llb.add("-");
			llb.add("-");
			llb.add("-");
		
			
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, both strings look similar but are different. one linked list contains 1 node while the other contains 3.
		assertEquals(false,bol);
		
	}
	
	@Test
	public void testcase10() {
	
		//precondition: [1,2,3] is in both linked list but different data types are used
		LinkedList<Double> lla = new LinkedList<Double>();
		LinkedList<Float> llb = new LinkedList<Float>();
		
		
		for(int i = 1; i<4; i++)
		{
			lla.add((double) i);
			llb.add((float) i);
		}
		
			
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false, same numbers different data types
		assertEquals(false,bol);
		
	}
	
	@Test
	public void testcase11() {
	
		//precondition: 1,2,3 is present in both linked list using different adding methods
		LinkedList<Integer> lla = new LinkedList<Integer>();
		LinkedList<Integer> llb = new LinkedList<Integer>();
		
		
		for(int i = 1; i<4; i++)
		{
			lla.addFirst(i);
			llb.addLast(4-i);
		}
		
			
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return true, nodes are entered using two different methods but are equal in both linked lists
		assertEquals(true,bol);
		
	}
	
	@Test
	public void testcase12() {
	
		//precondition: lla contains the character 't' in another language while llb contains 't' the english character 
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
	
		lla.add("տ");
		llb.add("T");
		
		
			
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false because both characters are different
		assertEquals(false,bol);
		
	}
	@Test
	public void testcase13() {
	
		//precondition:  lla contains a tab while llb contains a return
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
	
		lla.add("\t");
		llb.add("\r");
		
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false because two different spacing formats are used 
		assertEquals(false,bol);
		
	}
	
	@Test
	public void testcase14() {
	
		//precondition:  lla contains "a\t" and llb contains "a\t\t"
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
	
		lla.add("a\t");
		llb.add("a\t\t");
		
		
		
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false. although a is the first character in both linked list the number of \t is different for both linked lists
		assertEquals(false,bol);
		
	}
	@Test
	public void testcase15() {

		//precondition: lla contains "$#@!$%$#$@!" and llb contains "$#@!$%$#$@"  
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
	
		lla.add("$#@!$%$#$@!");
		llb.add("$#@!$%$#$@");
		
		
	
		//execution steps - compare both linked list
		boolean bol = lla.equals(llb);
		
		//postcondition: expected to return false. Both linked list are different by one character.
		assertEquals(false,bol);
		
	}
}
