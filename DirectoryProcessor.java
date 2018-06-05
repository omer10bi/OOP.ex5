import java.io.FileReader;

public class DirectoryProcessor {
    private static Parse parse;
    private static SectionData[] sectionData;

    public static void main(String args[]) throws Type2Errors{
        if(args.length !=2){
            throw new Type2Errors("there is less or more then 2 files in the argument");
        }else {
            parse = new Parse(args[1]);
            sectionData = parse.getSectionArray();
        }

    }
}
