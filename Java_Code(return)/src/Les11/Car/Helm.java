package Les11.Car;

public class Helm {

	private int diamert;
	Material material;
	
	public Helm(int diamert, Material material) {
		this.diamert = diamert;
		this.material = material;
	}

	public int getDiamert() {
		return diamert;
	}

	public void setDiamert(int diamert) {
		this.diamert = diamert;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [diamert=" + diamert + ", material=" + material + "]";
	}	
	
}
