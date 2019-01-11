package builder;

public class DeviceBuilder {

	public Device buildPhone() {
		
		Device device = new Device();
		device.addProduct(new SixtyFour());
		return device;
	}
	
	public Device buildTablet() {
		
		Device device = new Device();
		device.addProduct(new FiveTwelve());
		return device;
	}
}
