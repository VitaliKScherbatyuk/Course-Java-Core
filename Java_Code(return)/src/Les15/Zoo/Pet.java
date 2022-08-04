/*
 * @author Scherbatyuk
 */

package Les15.Zoo;

import java.util.Objects;

public class Pet {

	public String type;
	public String name_pet;

	public Pet(String type, String name) {
		super();
		this.type = type;
		this.name_pet = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name_pet;
	}

	public void setName(String name) {
		this.name_pet = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name_pet, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(name_pet, other.name_pet) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name_pet + "]";
	}

}
