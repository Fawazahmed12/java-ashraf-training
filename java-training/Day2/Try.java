public class Try {
	public static void main(String[] args) {
		Circle c = new Circle(2);
		int c =  c.type();
		System.out.println(c);

	}

	public static class Circle {
		int radius;

		Circle(int radius) {
			this.radius = radius;
		}

		int type() {
			return radius = radius + 2;
		}

	}
}

// public class Try {
// 	public static void main(String[] args) {
// 		Circle c = new Circle();
// 		c.radius = 2
// 		c.type();

// 	}

// 	public static class Circle {
// 		int radius;


// 		int type() {
// 			return radius = radius + 2;
// 		}

// 	}
// }