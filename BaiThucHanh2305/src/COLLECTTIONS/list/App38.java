package COLLECTTIONS.list;
import java.util.LinkedList;
//slide 38 va 39
public class App38 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll:");
        System.out.println("---------------------------------");

        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.print("ListA:");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll");
        System.out.println("---------------------------------");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        
        listA.retainAll(listB);
        System.out.println("list A: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll:");
        System.out.println("---------------------------------");
        
        listA.removeAll(listB);
        showList(listA);
    }

    public static void showList(LinkedList<String> list){
        for(String obj : list) {
            System.out.print("\t" + obj + ", ");
        }

        System.out.println();
    }
}