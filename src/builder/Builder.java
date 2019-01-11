package builder;

public class Builder {

	public static void main(String[] args) {
		
		DeviceBuilder deviceBuilder = new DeviceBuilder();
		
		Device phone = deviceBuilder.buildPhone();
		System.out.println("Phone");
		phone.showProducts();
		System.out.println("Total Cost : $" + phone.getCost());
		
		Device tablet = deviceBuilder.buildTablet();
		System.out.println("\n\nTablet");
		tablet.showProducts();
		System.out.println("Total Cost : $" + tablet.getCost());
	}
}
