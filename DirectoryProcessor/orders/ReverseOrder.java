package DirectoryProcessor.orders;

import java.io.File;

public class ReverseOrder extends Order{
	private Order order;

	ReverseOrder(Order order){
		this.order = order;
	}

	public File[] sort(File[] files){
		return reverseFileArray(order.sort(files));
	}

	private File[] reverseFileArray(File[] files){
		File[] reversed = new File[files.length];
		for(int i=0; i < files.length; i++){
			reversed[i] = files[files.length-i-1];
		}
		return reversed;
	}

	int compareFiles(File file1, File file2){
		return 0;
	}
}
