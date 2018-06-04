package DirectoryProcessor.filters;

import java.io.File;

public abstract class NameFilter extends DirectoryProcessor.filters.Filter {

	String word;

	static void isValid(String[] args){
		if(args.length != 1){}
	}
	NameFilter(String[] args){
		try {
			isValid(args);
			word = args[0];
		}catch (Exception Exception){}
	}

	public abstract boolean isPass(File file);
}
