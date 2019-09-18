import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int x;
		House [] house = new House [3]; 
		for(x=0;x<3;x++) {
			
			House houses = new House();
			Photo image = new Photo();
			 
			String hID = JOptionPane.showInputDialog("Enter the ID number of the house: ");
			int hid = Integer.parseInt(hID);
			houses.setId(hid);
			
			String hP = JOptionPane.showInputDialog("Enter the price of the house: ");
			float hp = Float.parseFloat(hP);
			houses.setPrice(hp);
			
			String loc = JOptionPane.showInputDialog("Enter the location of the house: ");
			houses.setLocation(loc);
			
			String adv = JOptionPane.showInputDialog("Enter the advertiser of the house: ");
			houses.setAdvertiser(adv);

			String URL = JOptionPane.showInputDialog("Enter the url of the house: ");
			image.setUrl(URL);
			
			houses.setImage(image);
			
			house[x] = houses;
			
		}
	}

}
