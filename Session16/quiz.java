package Session16;
import java.util.ArrayList;
public class quiz {
    public static void main(String[] args) {
        //empty
    }
    static ArrayList<Integer> intersection( ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i:list1)    {
            for(int j:list2){
                if (i==j)   {
                    answer.add(i);
                }
            }
        }
        return answer;
    }
}
 