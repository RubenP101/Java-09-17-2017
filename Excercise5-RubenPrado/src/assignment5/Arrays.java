// Ruben Prado
//CST-105
//October 01, 2017
//Excercise 5
//This Program will generate a 2d array that is 20x45 and replace any blanks with the @ symbol.
//This program was my first attempt at programming an array and has been uploaded to my personal git repository.

package assignment5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arrays {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String Text = "";
		char[][] textArray;
		//try&catch for reading from a file
		try {
			//Scanner type
			BufferedReader Reader = new BufferedReader(
					new FileReader("arrays.txt"));
			
			String readLine = "";
	
			while((readLine = Reader.readLine()) != null){
				Text += readLine;
			}
			Reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Created an array
		textArray = fillArray(Text);
		
		//Printed in order
		arrayOutput(textArray);
	}
	
	//Attempt to read in column order
	private static void arrayOutput(char[][] textArray) {
		StringBuilder outputValue = new StringBuilder();
		
		for (int f = 0; f < 45; f++){
			for (int e = 0; e < 1
					
				; e++){
				char temp = textArray[e][f];
				outputValue.append(temp);
			}
		}
		
		System.out.println(outputValue);
		
	}
	
	//Arrangeed by row and added requested blank @ fill
	public static char[][] fillArray(String entireText){
		char[][] arrayOut = new char[20][45];
		int count = 0;
		
		for (int g = 0; g < 20; g++){
			for (int j = 0; j < 45; j++){
				if (count < entireText.length()){
					arrayOut[g][j] = entireText.charAt(count);
					count++;
				}else{
					arrayOut[g][j] = '@';
				}
				
			}
		}
		
		return arrayOut;
		
	}
	
	
	
	
}