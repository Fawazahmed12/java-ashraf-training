package ImperativeApproach_FunctionalApproach;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("fawaz");
        nameList.add("nabeel");
        nameList.add("reyaaz");
        nameList.add("salmaan");

        printname(nameList);

        //with Lambda
        nameList.forEach((name) -> System.out.println(name));

    }

    public static void printname(List<String> nameList){
        for (int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }
    }
}
