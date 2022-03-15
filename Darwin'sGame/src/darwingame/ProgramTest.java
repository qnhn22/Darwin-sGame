package darwingame;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import darwingame.Instruction;
import darwingame.Program;

public class ProgramTest {
	Program p1;
	

	@Before
	public void setUp() throws Exception {
		p1 = new Program();
		
	}

	@Test
	public void testConstructor() {
		assertEquals(0, p1.size());
	}
	
	@Test
	public void testAddInstruction()
	{
		assertEquals(0, p1.size());
		Instruction instruction1 = new Instruction("CCC", 29);
		Instruction instruction2 = new Instruction("BBB", 22);
		p1.addInstruction(instruction1);
		p1.addInstruction(instruction2);
		assertEquals(2, p1.size());
		assertEquals(instruction1, p1.getInstruction(0));
		assertEquals(instruction2, p1.getInstruction(1));
	}
	
	@Test
	public void testGetInstruction() {
		Instruction instruction1 = new Instruction("CCC", 29);
		p1.addInstruction(instruction1);
		assertEquals(instruction1, p1.getInstruction(0));
		assertEquals(null, p1.getInstruction(-5));
	}
	
	@Test
	public void testPrint()
	{
		p1.print();
	}

}
