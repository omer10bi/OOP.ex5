package DirectoryProcessor.filters;

import java.io.File;

public class NotFilter extends DirectoryProcessor.filters.Filter {
	private DirectoryProcessor.filters.Filter filter;

	NotFilter(DirectoryProcessor.filters.Filter filter){
		this.filter = filter;
	}

	@Override
	public boolean isPass(File file) {
		return !filter.isPass(file);
	}
}
