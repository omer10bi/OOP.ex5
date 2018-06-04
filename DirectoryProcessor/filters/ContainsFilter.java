package DirectoryProcessor.filters;

import DirectoryProcessor.NameFilter;

import java.io.File;

public class ContainsFilter extends NameFilter {
	public static String name = "contains";


	ContainsFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return file.getName().contains(word);
	}
}
