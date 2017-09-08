package com.java.highlighter;

public class TestStyles{

public static void main(String[] args) {

	String str1 = "If we write a program and compile it, then we can run the program to get output";
	String str2 = "[red][bold]if[bold][red] we write a program [red][bold]AND[bold][red] compile it, [green]then[green] [blue]AS[blue] we run the program";

	AddStyle test = new AddStyle();
//	String s =test.setBlue(str1);
//	String s =test.setColor(str1);
//	String s =test.setCase(str1);
	String s =test.setView(str1);
	
	System.out.println(s);
	
	
	}

}
