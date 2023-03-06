package Sublime_Text_Exercises.Day1;

public class Basic1 {
	public static void main(String[] args) {
		System.out.println("hello");
		Bag bag = new Bag(2, 10);
     	while(bag.canNext()){
			System.out.println(bag.from);
			bag.Next();
			
		}	
	}

	public static class Bag{
		int from;
		int to;

		Bag(int x, int y) {
			this.from = x;
			this.to = y;
		}
	public void Next(){
		this.from = this.from+1;
	}

	boolean canNext(){
		return this.from < this.to;
	}

	}
}
