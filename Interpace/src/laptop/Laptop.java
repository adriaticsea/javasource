package laptop;

public interface Laptop extends Usb, Bluetooth, GraphicCard {
    public static final String company = "Samsung";
}

interface Usb{
	public static final String usbType ="usb";
	public static final String version ="3.0";
	public static final String capacity ="16GB";
	
	public abstract void getUsbType();
	public abstract void getVersion();
	public abstract void getCapacity();
}


interface Bluetooth{
	public static final String bluetoothType ="usb";
	public static final String bluetoothversion ="4.0";
	public static final String connDevice ="Laptop";
	
	public abstract void getbluetoothType();
	public abstract void getbluetoothVersion();
	public abstract void getconnDevice();
}

interface GraphicCard{
	public static final String GCType ="PCI";
	public static final String GCversion ="1080";
	
	
	public abstract void GCUsbType();
	public abstract void GCtVersion();
	
}