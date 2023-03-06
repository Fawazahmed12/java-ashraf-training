package Sublime_Text_Exercises.Day3.weekday;// Bad Approach;

// public class MyList {
// 	int values[] = {2,3,5,6,8,90};

// 	public  int indexOf(int indexValue) {

// 		if(indexValue == values[0]) {
// 			return 0;
// 		}
// 		if(indexValue == values[1]) {
// 			return 1;
// 		}
// 		if(indexValue == values[2]) {
// 			return 2;
// 		}
// 		if(indexValue == values[3]) {
// 			return 3;
// 		}
// 		if(indexValue == values[4]) {
// 			return 4;
// 		}
// 		if(indexValue == values[5]) {
// 			return 5;
// 		}
// 		if(indexValue == values[6]) {
// 			return 6;
// 		}
// 		if(indexValue == values[7]) {
// 			return 7;
// 		}

// 		return -1;
		
// 	}

// 	public static void main(String[] args) {
// 	MyList m = new MyList();
// 	int indexAt = m.indexOf(6);
// 	System.out.println(indexAt);

// 	}
// }



//Good Approach;

public class MyList {
	int values[] = {2,3,5,6,8,90};

	public  int indexOf(int indexValue) {

		for (int i=0;i<values.length;i++ ) {
			if(indexValue == values[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	MyList m = new MyList();
	int indexAt = m.indexOf(6);
	System.out.println(indexAt);
	}
}

