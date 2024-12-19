package DemoPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("papaya");
        arrayList.add(2, "test"); // Inserts "Orange" at index 1
       System.out.println(arrayList.size()) ;
       System.out.println(arrayList) ;
       arrayList.remove(1);
       System.out.println(arrayList) ;
       
       for(int i=0;i<arrayList.size();i++) {
    	   
           System.out.println(arrayList.get(i)) ;

    	    }
       
       for (Object x:arrayList) {
    	   System.out.println(x);
    	   
       }
       Iterator<String> it = arrayList.iterator();
       while (it.hasNext()) {
           
           System.out.println( it.next());
       }
      
       System.out.println("hello Vignesh");
       System.out.println("hello Vijay");

       
       
       
    }

	
}
