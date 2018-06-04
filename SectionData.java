import java.util.Arrays;

public class SectionData {
    private String filterType;
    private String orderType;
    private String filterData;
    private String orderData;
    private String[] filterSplit ;
    private String[] orderSplit ;
    private String[] filterParam ;
    private String[] orderParam ;
    private int filterLine;
    private int orderLine;
    private boolean isNot = false;
    private boolean isReverse = false;



    SectionData(String filter, String order, int filterParamLine, int orderParamLine){
        filterData = filter;
        orderData = order;
        filterLine = filterParamLine;
        orderLine = orderParamLine;
        separateFilterData();
        separateOrderData();
        setTypes();
        setIsNot();
        setReverse();
        setFilterParam();
    }

    private void separateFilterData(){
        filterSplit = filterData.split("#");
    }
    private void separateOrderData(){
        orderSplit = orderData.split("#");
    }

    private void setTypes(){
        filterType = filterSplit[0];
        orderType = orderSplit[0];
    }
    private void setIsNot(){
        isNot = (filterSplit[filterSplit.length - 1].equals("NOT"));
    }

    public boolean isFilterNot(){
        return isNot;
    }

    private void setReverse(){
        isReverse = (orderSplit[orderSplit.length - 1].equals("REVERSE"));
    }

    public boolean isOrderReverse(){
        return isReverse;
    }

    private void setFilterParam(){
        if(isNot){
            filterParam = Arrays.copyOfRange(filterSplit,1,filterSplit.length-1);
        }else{
            filterParam = Arrays.copyOfRange(filterSplit,1,filterSplit.length);
        }
    }






    public int getFilterLine(){
        return filterLine;
    }
    public int getOrderLine(){
        return orderLine;
    }


    @Override
    public String toString() {
        for(String string: filterSplit) {
            System.out.print(" " +string+" ");
        }
        for(String string: orderSplit) {
            System.out.print(" " +string+ " ");
        }
        System.out.println("filter in line " + filterLine + " order in line " + orderLine);
        return null;
    }
}
