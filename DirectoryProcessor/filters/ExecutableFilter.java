package DirectoryProcessor.filters;

import DirectoryProcessor.PermissionFilter;

import java.io.File;

public class ExecutableFilter extends PermissionFilter {
	public static String name = "executable";

	ExecutableFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return file.canExecute() == flag;
	}
}
