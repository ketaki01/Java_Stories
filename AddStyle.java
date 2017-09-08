package com.java.highlighter;


import java.util.HashMap;
import java.util.Map;

public class AddStyle {

	public Map addMap() {
		Map<String, Styles> myMap = new HashMap();
		
		Styles s1 = new Styles("blue", "capital", "normal");
		Styles s2 = new Styles("red", "lower", "bold");
		Styles s3 = new Styles("red", "capital", "bold");
		Styles s4 = new Styles("green", "lower", "normal");
		Styles s5 = new Styles("blue", "lower", "normal");

		myMap.put("as", s1);
		myMap.put("if", s2);
		myMap.put("and", s3);
		myMap.put("then", s4);
		myMap.put("when", s5);

		return myMap;
	}
	
	public String setBlue(String input) {
		String[] words = { "as", "if", "and", "then", "when" };
// condition to check if input string is already set to blue or need to be set.
		input=input.toLowerCase();
		if(!input.contains("[blue]")){
		for (int i = 0; i < words.length; i++) {
			if (input.toLowerCase().contains(words[i])) {
				input = input.replaceAll(words[i], "[blue]" + words[i] + "[blue]");
			}
		}
	}
		return input;
	}

	public String setColor(String input) {
		Map<String, Styles> inputMap = addMap();
		// condition to check if input string is already set to respective colors or need to be set.
		if(!(input.contains("[red]"))||!(input.contains("[blue]"))||!(input.contains("[green]")))
		{
			input=input.toLowerCase();
			for (Map.Entry<String, Styles> entry : inputMap.entrySet()) {
			String key = entry.getKey();
			Styles s = entry.getValue();
				if (input.contains(key)) {
				input = input.replaceAll(key, "[" + s.$color + "]" + key + "[" + s.$color + "]");
				}
			}
		}
		return input;
	}

	public String setCase(String input) {
		Map<String, Styles> inputMap = addMap();
		input = setColor(input);
		for (Map.Entry<String, Styles> entry : inputMap.entrySet()) {
			String key = entry.getKey();
			Styles s = entry.getValue();
			if (s.$case.contains("capital")) {
				input = input.replaceAll(key, key.toUpperCase());
			} else {
				input = input.replaceAll(key, key.toLowerCase());
			}
		}
		return input;
	}

	public String setView(String input) {
		Map<String, Styles> inputMap = addMap();
		// condition to check if input string is already set to bold or need to be set.
		if(!input.contains("[bold]")){
			input=input.toLowerCase();
			for (Map.Entry<String, Styles> entry : inputMap.entrySet()) {
			String key = entry.getKey();
			Styles s = entry.getValue();
			if (s.$view.contains("bold")) {
				input = input.replaceAll(key, "["+s.$view+"]" + key + "["+s.$view+"]");
			}
		}
	}
		input = setCase(input);
		return input;
	}
}
