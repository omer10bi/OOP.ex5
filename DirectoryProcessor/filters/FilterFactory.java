package DirectoryProcessor.filters;

import DirectoryProcessor.GreaterThanFilter;

public class FilterFactory {

	public static DirectoryProcessor.filters.Filter getFilter(String type, String[] args, boolean isNot)
			throws FilterException{
		DirectoryProcessor.filters.Filter newFilter;
		try {
			switch (type){
				case "greater_than":
					newFilter = new GreaterThanFilter(args);
				case "between":
					newFilter = new DirectoryProcessor.filters.BetweenFilter(args);
				case "smaller_than":

				case "file":
				case "contains":
				case "prefix":
				case "suffix":
				case "writable":
				case "executable":
				case "hidden":
				case "all":
			}
		} catch (FilterException exception){}

	}
}
