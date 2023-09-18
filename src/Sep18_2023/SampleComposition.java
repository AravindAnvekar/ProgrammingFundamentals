package Sep18_2023;

import java.util.ArrayList;
import java.util.List;

class MobileObject {
	public String name;
	public String ram;
	public String rom;

	MobileObject(String name, String ram, String rom) {
		this.name = name;
		this.ram = ram;
		this.rom = rom;
	}
	
	
}

class MobileStore {
	private final List<MobileObject> mobiles;

	MobileStore(List<MobileObject> mobiles) {
		this.mobiles = mobiles;
	}

	public List<MobileObject> getTotalMobileInStore() {
		return mobiles;
	}
}

public class SampleComposition {

	public static void main(String[] args) {
		MobileObject mob1 = new MobileObject("Realme6", "8GB", "128GB");
		MobileObject mob2 = new MobileObject("SAMSUNG A21S", "4GB", "128");
		MobileObject mob3 = new MobileObject("SAMSUNG M10", "4GB", "64GB");
		List<MobileObject> mobiles = new ArrayList<MobileObject>();
		mobiles.add(mob1);
		mobiles.add(mob2);
		mobiles.add(mob3);
		MobileStore store = new MobileStore(mobiles);
		List<MobileObject> mob = store.getTotalMobileInStore();
		for (MobileObject mb : mob) {
			System.out.println("Name : " + mb.name + " RAM :" + mb.ram + " and " + " ROM : " + mb.rom);
		}

	}

}
