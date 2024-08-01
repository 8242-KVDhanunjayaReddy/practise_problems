import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
         List<Integer> list =new ArrayList<Integer>();
         LinkedList<Integer> list1 =new LinkedList<Integer>();
         list.add(2);
         list.add(4);
         list.add(5);
        // for (Object num : list) {
             System.out.println(list);
             System.out.println(list.get(1));//we can get index values
             list.set(1,3);// we can set and change the values in index
             System.out.println(list);
             System.out.println(list.size());//size of arraylist
        System.out.println(list.contains(4));//to check whether the value is present or not
        System.out.println(list.indexOf(5));//to get the index of the value
        list.remove(2);//to remove the value
        System.out.println(list);
         }
    }

