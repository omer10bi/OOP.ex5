package DirectoryProcessor.filters;

import DirectoryProcessor.filters.PermissionFilter;

import java.io.File;

public class HiddenFilter extends PermissionFilter {
	public static String name = "writable";


	HiddenFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return file.isHidden() == flag;
	}
}
