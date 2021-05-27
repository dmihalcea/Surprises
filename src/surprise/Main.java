package surprise;

public class Main {

public static void main(String[] args) {
			
		GiveSurpriseAndApplause surpriza1 = new GiveSurpriseAndApplause("FIFO", 1);
		surpriza1.put(GatherSurprises.gather(4));
		System.out.println(surpriza1);
		surpriza1.giveAll();
		
		for (int i = 0; i < 5; i++) {
			surpriza1.put(GatherSurprises.gather());
		}
		System.out.println(surpriza1);
		for (int i = 0; i < 5; i++) {
			surpriza1.give();;
		}
		System.out.println(surpriza1);
	
		GiveSurpriseAndHug surpriza2 = new GiveSurpriseAndHug("LIFO", 3);
		surpriza2.put(GatherSurprises.gather(5));
		System.out.println(surpriza2);
		surpriza2.giveAll();
		System.out.println(surpriza2);
		
		GiveSurpriseAndSing surpriza3 = new GiveSurpriseAndSing("RANDOM", 2);
		surpriza3.put(GatherSurprises.gather(3));
		System.out.println(surpriza3);
		surpriza3.giveAll();
		System.out.println(surpriza3);
		
	}
}
