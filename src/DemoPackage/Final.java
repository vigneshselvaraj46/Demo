package DemoPackage;
class power {
    power(String A) {
        System.out.println("Animal makes a sound");
    }
}

class shower extends power {
   shower() {
	   super("money");
        System.out.println("Dog barks");
    }

   
}

public class Final {
    public static void main(String[] args) {

      
        	shower dog = new shower();
        
     
    }
}

