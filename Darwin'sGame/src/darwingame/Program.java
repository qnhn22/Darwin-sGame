package darwingame;
import java.util.ArrayList;

/** 
 * Darwin's world programs are lists of Instruction objects (contained
 * in an ArrayList).
 * 
 * @author (Quan, Mackenzie)
 * @version (2/14/2022) 
 */
   
public class Program {
    // declare your fields here
	private ArrayList<Instruction> instructionList;
	
    /** 
     * create an empty program 
     */
    public Program() {
        // add your code here
    	instructionList = new ArrayList<Instruction>();
    }

    /** add the specified instruction to the end of the program
      * @param instr the instruction */
    public void addInstruction(Instruction instr) {
        // add your code here
    	instructionList.add(instr);
    }
    
    /** get the specified instruction by number.  Note that instructions
     *  are numbered starting from 0.  If the instruction number is invalid,
     *  print an error message and return null.
     *  @param index the instruction to fetch */
    public Instruction getInstruction(int index) {
        // replace with your own code
    	Instruction instruction;
    	if (index >= 0 && index < instructionList.size())
    	{
    		instruction = instructionList.get(index);
    	}
    	else
    	{
    		System.out.println("Invalid index");
    		return null;
    	}
        return instruction;
    }

    /** return the number of instructions in the program
        @return the number of instructions */
    public int size() {
        // replace with your own code
    	int instructionSize = instructionList.size();
        return instructionSize;
    }
    
    /** print all instructions in the program to the terminal window.
     *  Note that class Instruction does have a print method of its own.
     */
    public void print() {
        // add your code here
    	for (int i = 0; i < instructionList.size(); i++)
    	{
    		Instruction instruction = instructionList.get(i);
    		instruction.print();
    	}
    }
}
