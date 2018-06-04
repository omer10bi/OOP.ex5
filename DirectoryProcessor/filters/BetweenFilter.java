package DirectoryProcessor.filters;

import DirectoryProcessor.Filter;

import java.io.File;

public class BetweenFilter extends Filter {
	public static String name = "between";
	private double lowerBound;
	private double upperBound;

	static void isValid(String[] args){
		if(args.length != 2){}
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		if(a > b){}
		if(a < 0 || b < 0){}
	}

	BetweenFilter(String[] args){
		try {
			isValid(args);
			lowerBound = Double.parseDouble(args[0])*1024;
			upperBound = Double.parseDouble(args[1])*1024;
		}catch (Exception Exception){}
	}

	public boolean isPass(File file){
		return lowerBound <= file.length() && file.length() <= upperBound;
	}
}
