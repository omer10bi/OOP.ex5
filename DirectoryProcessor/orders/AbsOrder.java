package DirectoryProcessor.orders;

import DirectoryProcessor.Order;

import java.io.File;

public class AbsOrder extends Order {
	public static String name = "abs";


	AbsOrder(){}

	int compareFiles(File file1, File file2){
		return file1.getName().compareTo(file2.getName());
	}

}
