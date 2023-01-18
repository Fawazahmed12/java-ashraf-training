public class Basic {
     public static void main(String[] args) {
     	System.out.println("Hi");
     	System.out.println("Hi Welcome");
     	Bag bag = new Bag(2, 10);
     	String bagw = bag.Next();
     	// bagw = bag.Next();
     	// bagw = bag.Next();
     	System.out.println(bagw);		
	}

	public static class Bag{
		int from;
		int to;

		Bag(int x, int y) {
			this.from = x;
			this.to = y;
		}

	public void Next(){
		// this.from = this.from+1;
		System.out.println("456");
	}

	}
}