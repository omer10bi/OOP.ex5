package DirectoryProcessor.filters;

import java.io.File;

public class SuffixFilter extends DirectoryProcessor.filters.NameFilter {
	public static String name = "suffix";


	SuffixFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return file.getName().endsWith(word);
	}
}
