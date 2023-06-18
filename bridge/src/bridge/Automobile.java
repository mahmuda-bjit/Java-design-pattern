package bridge;

public abstract class Automobile {

	protected Workshop workShop1;
	protected Workshop workShop2;
	
	protected Automobile(Workshop workshop1, Workshop workshop2, Workshop workShop1, Workshop workShop2) {
		this.workShop1=workShop1;
		this.workShop2=workShop2;
	}
	
	abstract public void manufacture();
}
