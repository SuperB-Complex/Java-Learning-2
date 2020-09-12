package self.explore;

import java.util.*; 

public class GenericsAndArray { 
   static class Fruit {}
   static class  Apple extends Fruit {}
   static class Jonathan extends Apple {}
   static class Orange extends Fruit {}
  
    public static void main(String[] args) throws Exception { 
        Fruit[] fruit = new Apple[10];
        // Runtime type is Apple[], not Fruit[] or Orange[]:
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
        
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch(Exception e) { 
            System.out.println(e); 
        }

        try {
            // Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch(Exception e) { 
            System.out.println(e); 
        }

        try {
            // Compiler allows you to add Fruit:
            fruit[1] = new Fruit(); // ArrayStoreException
        } catch(Exception e) { 
            System.out.println(e); 
        }

        try {
            // Compiler allows you to add Oranges:
            fruit[1] = new Orange(); // ArrayStoreException
        } catch(Exception e) { 
            System.out.println(e); 
        }

        try {
            // Compiler allows you to add Fruit:
            fruit[1] = new Apple(); // ArrayStoreException
        } catch(Exception e) { 
            System.out.println(e); 
        }
    } 
} 