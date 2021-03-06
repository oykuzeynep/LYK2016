
public abstract class Weapon extends Item{
	double damageAmount;
	
	public Weapon(double price, double weight, double damage){
		super(price, weight);
		if(damageAmount < 0) {
			damageAmount = 0;
		}
		else
			this.damageAmount = damage;
	}

	public double getDamageAmount() {
		return damageAmount;
	}

	@Override
	public String toString() {
		return "Weapon [damageAmount=" + damageAmount + " Price=" + itemPrice + " Weight=" + itemWeight +"]";
	}
	

}
