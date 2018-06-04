package DirectoryProcessor.filters;

import DirectoryProcessor.NameFilter;

import java.io.File;

public class FileFilter extends NameFilter {
	public static String name = "file";


	FileFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return word.equals(file.getName());
	}
}
