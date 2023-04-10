package JavaOops;

public class AustralianTrafic implements centralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		centralTraffic a= new AustralianTrafic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		AustralianTrafic at=new AustralianTrafic();
		at.walkonsymbol();
		
		ContinentalTraffic ct=new AustralianTrafic();
		ct.Trainsymbol();
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
	}

	public void walkonsymbol()
	{
	System.out.println("walking");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train");
	}

}
