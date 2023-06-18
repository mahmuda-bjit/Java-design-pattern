package adap;

import abc.PilotPen;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PilotPen pp = new PilotPen();
		Pen p = new PenAdapter();
		
		Assignment aw = new Assignment();
		aw.setP(p); 
		aw.writeAssignment("Bit tired to write assignment");

	}

}