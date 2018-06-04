package DirectoryProcessor.filters;

import java.io.File;

public class PrefixFilter extends DirectoryProcessor.filters.NameFilter {
	public static String name = "prefix";

	PrefixFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return file.getName().startsWith(word);
	}
}
