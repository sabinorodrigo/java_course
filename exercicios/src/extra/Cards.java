package extra;

public class Cards {

	private String name;
	private double atk;
	private double def;
	
	public Cards() {}
	
	public Cards(String name, double atk, double def) {
		this.name = name;
		this.atk = atk;
		this.def = def;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s%nAttack: %.0f%nDefense: %.0f%n", name, atk, def);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAtk() {
		return atk;
	}

	public void setAtk(double atk) {
		this.atk = atk;
	}

	public double getDef() {
		return def;
	}

	public void setDef(double def) {
		this.def = def;
	}
	
	
}
