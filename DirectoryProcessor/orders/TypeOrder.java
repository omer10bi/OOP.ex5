package DirectoryProcessor.orders;

import java.io.File;


public class TypeOrder extends DirectoryProcessor.orders.Order {
	public static String name = "type";



	TypeOrder(){}

	/*
	return the type of the file
	 */
	private String getType(File file){
		String fileName = file.getName();
		if(fileName.endsWith(".")){
			return ""; // the file name ends with a dot
		}
		for(int i=fileName.length()-2; i >= 0; i--){
			if(fileName.charAt(i) == '.'){
				return fileName.substring(i+1); // return the string after the last dot
			}
		}
		return ""; // there wasn't a dot
	}

	int compareFiles(File file1, File file2){
		int balance = getType(file1).compareTo(getType(file2));
		if(balance != 0){
			return balance;
		}
		else{ // the file types are the same, compare absolute names
			return file1.getName().compareTo(file2.getName());
		}
	}



}
