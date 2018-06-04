package DirectoryProcessor.orders;

import java.io.File;

public class SizeOrder extends DirectoryProcessor.orders.Order {
	public static String name = "size";

	SizeOrder(){}

	int compareFiles(File file1, File file2){
		int balance = Long.compare(file1.length(), file2.length());
		if(balance != 0){
			return balance;
		}
		else{ // the files are of the same size, compare absolute names
			return file1.getName().compareTo(file2.getName());
		}
	}
}
