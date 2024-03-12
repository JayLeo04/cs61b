import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListExercises {
    public static int sum(List<Integer> L){
        int total = 0;
        for(int number: L){
            total += number;
        }
        return total;
    }

    public static List<Integer> evens(List<Integer> L){
        List<Integer> evenList = new ArrayList<>();
        for(int number: L){
            if(number % 2 == 0){
                evenList.add(number);
            }
        }
        return evenList;
    }

    public static List<Integer> common(List<Integer> L1, List<Integer> L2){
        List<Integer> commonList = new ArrayList<>();
        for(int number: L1){
            if(L2.contains(number) && !commonList.contains(number)){
                commonList.add(number);
            }
        }
        return commonList;
    }

    public static int countNumberOfc(List<String> L, char c){
        int count = 0;
        for(String str: L){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == c ){
                    count++;
                }
            }
        }
        return count;
    }
}
