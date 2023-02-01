package Try;

import java.util.ArrayList;
import java.util.List;

class UniqueElementsExample2 {
    //main() method starts
    public static void main (String[] args)
    {
        //create an integer array having some duplicate elements
        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

        int[] distinctArray = new int[arrayWithDuplicates.length];

        int index = 0;

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arrayWithDuplicates.length; i++) {

            int temp = 0;
            for (int j = 0; j < i; j++){
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]){
                    temp = 1;
                    break;
                }
                if (arrayList.contains(distinctArray)) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0){
                distinctArray[index] = arrayWithDuplicates[i];
                index++;
            }
        }
        for(int i = 0; i < index; i++)
            arrayList.add(distinctArray[i]);
        System.out.println("PrintUniqueElements = " + arrayList);
    }

}
