package bridge;

public class Bus extends Automobile{

	public Bus(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2, workShop1, workShop2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void manufacture() {
		System.out.println("Bus is ");
		workShop1.work();
		workShop2.work();
	}

}
