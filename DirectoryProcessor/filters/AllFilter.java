package DirectoryProcessor.filters;

import DirectoryProcessor.Filter;
import DirectoryProcessor.Type1Exception;

import java.io.File;

public class AllFilter extends Filter {
	public static String name = "all";

	static void isValid(String[] args)throws FilterException{
		if(args.length != 0){
			throw new FilterException();
		}
	}

	AllFilter(String[] args){
		try {
			isValid(args);
		}catch (FilterException exception){
			throw exception;
		}
	}

	public boolean isPass(File file){
		return true;
	}
}
