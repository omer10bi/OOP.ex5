import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Parse {
    private SectionData[] sectionArray ;
    private ArrayList<SectionData> sectionList = new ArrayList<>();
    private BufferedReader br;
    private String line;
    private String filterData;
    private String orderData;
    private FileReader commandFile;
    private int filterParamLine = 0;
    private int orderParamLine = 0;
    private int lineCounter = 0;


     Parse(String fileName) throws Type2Errors {
        try {
            commandFile = new FileReader(fileName);
        }
        catch (java.io.FileNotFoundException e){
            throw new Type2Errors("problem in IO of commandFile");
        }
        createSectionArray();
    }

    private void createSectionArray() throws Type2Errors{
             br = new BufferedReader(commandFile);
             newLine();
             while (line != null) {
                 sectionList.add(createSection());

             turnList2Array();
         }
    }
    private SectionData createSection()throws Type2Errors{
         if(!line.equals("FILTER")){
             throw new Type2Errors("suc-section dosn't start with FILTER");
         }else {
             newLine();
             if (line.equals("ORDER")) {
                 filterData = "all";
                 newLine();
                 if ((line == null) ||line.equals("FILTER")){
                     orderData = "abs";
                 }else{
                     orderData = line;
                     orderParamLine = lineCounter;
                     newLine();
                 }
             }else{
                 filterData = line;
                 filterParamLine = lineCounter;
                 newLine();
                 if(line.equals("ORDER")){
                     newLine();
                     if(line.equals("FILTER")|| (line==null)){
                         orderData = "abs";
                     }else{
                         orderData = line;
                         orderParamLine = lineCounter;
                         newLine();
                     }
                 }else {
                     throw new Type2Errors("seb-section dosn't include ORDER");
                 }
             }
         }
         SectionData sectionData = new SectionData(filterData,orderData,filterParamLine, orderParamLine);
         return sectionData;
    }
    public SectionData[] getSectionArray(){
         return sectionArray;
    }
    private void turnList2Array(){
         sectionArray= new SectionData[sectionList.size()];
         for(int i = 0; i<sectionList.size();i++){
             sectionArray[i]= sectionList.get(i);
         }
    }

    private void newLine() throws Type2Errors{
         try {
             lineCounter++;
             line = br.readLine();
         }catch (java.io.IOException e){
             throw  new Type2Errors("bad IO");
         }

    }
}
