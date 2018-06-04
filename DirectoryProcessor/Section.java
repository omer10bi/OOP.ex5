package DirectoryProcessor;

import DirectoryProcessor.filters.Filter;
import DirectoryProcessor.filters.FilterFactory;
import DirectoryProcessor.orders.Order;
import DirectoryProcessor.orders.OrderFactory;

public class Section {
	private Filter myFilter;
	private Order myOrder;
	private String filterCommands;
	private String orderCommands;

	public Section(String[] commands){
		filterCommands = commands[0];
		orderCommands = commands[1];
	}

	public void doAction(){
		myFilter = FilterFactory.getFilter(filterCommands);
		myOrder = OrderFactory.getOrder(orderCommands);
	}
}
