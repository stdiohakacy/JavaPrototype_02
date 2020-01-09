package creational.Prototype._02;

public class Shape implements Cloneable {
	protected String id;
	protected String type;

	public void draw() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}
}

class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Square drawing ... ");
	}

	@Override
	public String toString() {
		return "Square [id=" + id + ", type=" + type + "]";
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle drawing ... ");
	}

	@Override
	public String toString() {
		return "Square [id=" + id + ", type=" + type + "]";
	}

}