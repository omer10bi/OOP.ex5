package DirectoryProcessor.filters;

public abstract class PermissionFilter extends DirectoryProcessor.filters.Filter {

	boolean flag;
	static void isValid(String[] args){
		if(args.length != 1){}
		if( !(args[0].equals("YES") || args[0].equals("NO")) ){}
	}

	PermissionFilter(String[] args){
		flag = args[0].equals("YES");
	}
}
