package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class CodeGenerator extends VisitorAdaptor {

	int mainPc;
	int varDataSize;
	
	int getMainPc(){
		return mainPc;
	}
}
