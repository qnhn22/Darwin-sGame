package darwingame;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import darwingame.Creature;

public class CreatureTest {
	Creature c1;
	Creature c2;
	Creature c3;
	Creature c4;
	
	Program p1;
	Instruction i1;
	Instruction i2;
	Instruction i3;
	
	
	

	@Before
	public void setUp() throws Exception {
		p1 = new Program();
		
		
		c1 = new Creature("bird", 5, 5, 0, "blue", p1);
		c2 = new Creature("bird", 5, 5, 1, "blue", p1);
		c3 = new Creature("bird", 5, 5, 2, "blue", p1);
		c4 = new Creature("bird", 5, 5, 3, "blue", p1);
		
		i1 = new Instruction("A", 0);
		i2 = new Instruction("B", 1);
		i3 = new Instruction("C", 2);
		
	}

	@Test
	public void testConstructor() {
		assertEquals("bird", c1.getSpecies());
		assertEquals(5, c1.getXPos());
		assertEquals(5, c1.getYPos());
		assertEquals("up", c1.getDirection());
		assertEquals("blue", c1.getColor());
		assertEquals(p1, c1.getProgram());
		assertEquals(0, c1.getCounter());
	}
	
	@Test
	public void testGetDirection()
	{
		assertEquals("right", c2.getDirection());
		
		assertEquals("down", c3.getDirection());
		
		assertEquals("left", c4.getDirection());
	}
	
	@Test
	public void testPrint()
	{
		c1.print();
	}
	
	@Test
	public void testSetCounter()
	{
		assertEquals(0, c1.getCounter());
		p1.addInstruction(i1);
		p1.addInstruction(i2);
		p1.addInstruction(i3);
		c1.setCounter(2);
		assertEquals(2, c1.getCounter());
		
	}
	
	@Test 
	public void testSetCounterInvalidNewValue()
	{
		assertEquals(0, c1.getCounter());
		p1.addInstruction(i1);
		p1.addInstruction(i2);
		p1.addInstruction(i3);
		c1.setCounter(5);
		assertEquals(0, c1.getCounter());
		
	}
	
	@Test
	public void testGetCurrentInstructor()
	{
		c1.setCounter(3);
		assertEquals(p1.getInstruction(3), c1.getCurrentInstruction());
		c1.setCounter(0);
		assertEquals(null, c1.getCurrentInstruction());
	}
	
	@Test
	public void testTurnLeft()
	{
		c1.turnLeft();
		assertEquals("left", c1.getDirection());
		c2.turnLeft();
		assertEquals("up", c2.getDirection());
		c3.turnLeft();
		assertEquals("right", c3.getDirection());
		c4.turnLeft();
		assertEquals("down", c4.getDirection());
	}
	
	@Test
	public void testTurnRight()
	{
		c1.turnRight();
		assertEquals("right", c1.getDirection());
		c2.turnRight();
		assertEquals("down", c2.getDirection());
		c3.turnRight();
		assertEquals("left", c3.getDirection());
		c4.turnRight();
		assertEquals("up", c4.getDirection());
	}
	
	@Test 
	public void testGetXFront()
	{
		assertEquals(6, c2.getXFront());
		assertEquals(4, c4.getXFront());
		
	}
	
	@Test 
	public void testGetYFront()
	{
		assertEquals(4, c1.getYFront());
		assertEquals(6, c3.getYFront());
		
	}
	
	@Test
	public void testHop()
	{
		c1.hop();
		assertEquals(5, c1.getXPos());
		assertEquals(4, c1.getYPos());
		c2.hop();
		assertEquals(6, c2.getXPos());
		assertEquals(5, c2.getYPos());
		c3.hop();
		assertEquals(5, c3.getXPos());
		assertEquals(6, c3.getYPos());
		c4.hop();
		assertEquals(4, c4.getXPos());
		assertEquals(5, c4.getYPos());
	}

}

