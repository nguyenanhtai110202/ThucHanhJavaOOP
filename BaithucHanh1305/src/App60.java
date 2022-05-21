import java.util.LinkedHashSet;
import java.util.Set;
public class App60 {
    public static void main(String[] args) throws Exception {
        Set<String> linkHashSet = new LinkedHashSet<String>();
        linkHashSet.add("Java");
        linkHashSet.add("C++");
        linkHashSet.add("PHP");
        linkHashSet.add("Java");

        for (String str : linkHashSet){
            System.out.println(str);
        }

    }
    }
    
    
    

