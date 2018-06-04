package DirectoryProcessor.filters;

import java.io.File;

public abstract class Filter {

	/**
	 * check if the input is valid and can be worked with. if not, raise exception
	 * should be overridden in each filter
	 * @param args strings extracted from the command
	 * @return true/warning
	 */
	static void isValid(String[] args) throws FilterException{}

	/**
	 * check if the filter will pass the file
	 * @param file the file we check
	 * @return true if the file passed, false otherwise
	 */
	public abstract boolean isPass(File file);
}
