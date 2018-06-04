package DirectoryProcessor.filters;

import java.io.File;

public class GreaterThanFilter extends DirectoryProcessor.filters.Filter {
	public static String name = "greater_than";
	private double lowerBound;

	static void isValid(String[] args){
		if(args.length != 1){}
		double a = Double.parseDouble(args[0]);
		if(a < 0){}
	}
	GreaterThanFilter(String[] args){
		try {
			isValid(args);
			lowerBound = Double.parseDouble(args[0])*1024;
		}catch (Exception Exception){}

	}

	public boolean isPass(File file){
		return file.length() > lowerBound;
	}
}