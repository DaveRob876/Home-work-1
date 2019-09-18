
public class House extends Photo{

	private int id;
	private float price;
	private String location,advertiser;
	private Photo image;
	
	
	public House() {
		this.id = 0;
		this.price = 0.0f;
		this.location = " ";
		this.advertiser = " ";
		this.image.pixels = 0;
		this.image.type = " ";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	public Photo getImage() {
		return image;
	}
	public void setImage(Photo image) {
		this.image = image;
	}
	
	
	
	
}
