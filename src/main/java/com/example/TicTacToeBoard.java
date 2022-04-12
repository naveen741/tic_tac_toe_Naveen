package com.example;
public class TicTacToeBoard {
	String str;
	public TicTacToeBoard(String board) {
		this.str=board.toLowerCase(); 
	}
	public Evaluation evaluate() {
		int i;
		if(str.length()!=9){
			return Evaluation.UNREACHABLESTATE;
		}
		int xCount=0;
		int oCount=0;
		for( i=0;i<str.length();i++) {
			if(str.charAt(i)=='x')
				xCount++;
			else if(str.charAt(i)=='o')
				oCount++;
		}
		if(Math.abs(xCount-oCount)>1)
			return Evaluation.UNREACHABLESTATE;
		if(rowCheck() != null)
			return rowCheck();
		else if(colCheck() != null)
			return colCheck();
		else if(diaCheck() != null)
			return diaCheck();
		return Evaluation.NOWINNER;
	}
	public Evaluation rowCheck() {
		for( int j=0;j<str.length();j+=3){
			if(str.charAt(j)!='.'&&(str.charAt(j)==str.charAt(j+1)&&str.charAt(j+1)==str.charAt(j+2))) {
				if(str.charAt(j)=='x') 
					return Evaluation.XWINS;
				else
					return Evaluation.OWINS;
			}
		}
		return null;
	}
	public Evaluation colCheck() {
		for(int j=0;j<3;j++){
			if(str.charAt(j)!='.'&&(str.charAt(j)==str.charAt(j+3)&&str.charAt(j+3)==str.charAt(j+6))){
				if(str.charAt(j)=='x') 
					return Evaluation.XWINS;
				else
					return Evaluation.OWINS;
			}
		}
		return null;
		
	}
	public Evaluation diaCheck() {
		if(str.charAt(0)!='.'&&(str.charAt(0)==str.charAt(4)&&str.charAt(4)==str.charAt(8))){
			if(str.charAt(0)=='x') 
				return Evaluation.XWINS;
			else
				return Evaluation.OWINS;
		}
		if(str.charAt(2)!='.'&&(str.charAt(2)==str.charAt(4)&&str.charAt(4)==str.charAt(6))){
			if(str.charAt(2)=='x') 
				return Evaluation.XWINS;
			else	
				return Evaluation.OWINS;
		}
		return null;
		
	}
}
