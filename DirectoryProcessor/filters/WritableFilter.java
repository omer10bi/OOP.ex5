package DirectoryProcessor.filters;

import java.io.File;

public class WritableFilter extends DirectoryProcessor.filters.PermissionFilter {
	public static String name = "writable";

	WritableFilter(String[] args){
		super(args);
	}

	public boolean isPass(File file){
		return file.canWrite() == flag;
	}
}
