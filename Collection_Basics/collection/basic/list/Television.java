package collection.basic.list;

public class Television {
	String company;
	boolean Threedenabled;
	int price;
	String type;

	// Constructor
	public Television(String company, boolean threedenabled, int price, String type) {
		this.company = company;
		Threedenabled = threedenabled;
		this.price = price;
		this.type = type;
	}
	//hashcode and equals method together used to compare objects
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", Threedenabled=" + Threedenabled + ", price=" + price + ", type="
				+ type + "]";
	}

}
