package DirectoryProcessor.filters;

import java.io.File;

public class SmallerThanFilter extends DirectoryProcessor.filters.Filter {
	public static String name = "smaller_than";
	private double upperBound;

	static void isValid(String[] args){
		if(args.length != 1){}
		double a = Double.parseDouble(args[0]);
		if(a < 0){}
	}
	SmallerThanFilter(String[] args){
		try {
			isValid(args);
			upperBound = Double.parseDouble(args[0])*1024;
		}catch (Exception Exception){}

	}

	public boolean isPass(File file){
		return file.length() < upperBound;
	}
}
