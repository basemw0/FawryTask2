
public class ShippingService {
	 public static void sendItems(Shippable item, String address) {
        System.out.println("Shipping "  + item.getTitle() + " to address: " + address);
    }
}
