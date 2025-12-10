
interface ElectricalAppliances{
	void showTradeMark();
}


class PC implements ElectricalAppliances{
	public void showTradeMark(){
		System.out.println("PC");
	}
}

class TV implements ElectricalAppliances{
	public void showTradeMark(){
		System.out.println("TV");
	}
}


public class note5_4{
	public static void main(String[] args){
		ElectricalAppliances ea;
		ea = new TV();
		ea.showTradeMark();
		ea = new PC();
		ea.showTradeMark();
	}
}


