import java.util.LinkedList;
public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("java");
        list.add("c++");
        list.add("php");
        list.add("java");

        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("----------------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("ListA:");
        showList(listA);

        System.out.println("\nVi du su dung phuong thuc retainAll()");
        System.out.println("---------------------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("ListA:");
        showList(listA);

        System.out.println("\nVi du su dung phuong thuc removeAll()");
        System.out.println("---------------------------------------");
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for(String obj : list)
            System.out.print("\t" + obj + ", ");
        System.out.println();
    }
}
