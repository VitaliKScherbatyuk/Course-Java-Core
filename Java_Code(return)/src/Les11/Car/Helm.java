package Les11.Car;

public class Helm {

	private int diamert;
	String material;
	
	public Helm(int diamert, String string) {
		this.diamert = diamert;
		this.material = string;
	}

	public int getDiamert() {
		return diamert;
	}

	public void setDiamert(int diamert) {
		this.diamert = diamert;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [diamert=" + diamert + ", material=" + material + "]";
	}

	
}
