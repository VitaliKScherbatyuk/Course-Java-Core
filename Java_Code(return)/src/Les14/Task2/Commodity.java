/*
 * @author Scherbatyuk
 */

package Les14.Task2;

public class Commodity {

	public String goods;
	public String name;
	public int length;
	public int weigth;
	public double mass;
	
	public Commodity(String goods, String name, int length, int weigth, double mass) {
		super();
		this.goods = goods;
		this.name = name;
		this.length = length;
		this.weigth = weigth;
		this.mass = mass;
	}

	public String getGoods() {
		return goods;
	}

	public String getName() {
		return name;
	}
	
	public int getLength() {
		return length;
	}

	public int getWeigth() {
		return weigth;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	
	
	public void setGoods(String goods) {
		this.goods = goods;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Commodity [goods=" + goods + ", name=" + name + ", length=" + length + ", weigth=" + weigth + ", mass="
				+ mass + "]";
	}
	
	
}
