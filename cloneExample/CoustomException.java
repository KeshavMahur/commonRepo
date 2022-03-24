package cloneExample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

class A1{
    {
        System.out.println("Class a");
    }
}
class B extends A1{
    {
        System.out.println("Class b");
    }
}
class C extends B{
    {
        System.out.println("Class c");
    }
}

public class CoustomException {
     void overload(A1 aa){
         System.out.println("One");
     }
     void overload(B b){
         System.out.println("Two");
     }
     void overload(Object obj){
         System.out.println("Three");
     }
    public static void main(String[] args) throws IOException {
         CoustomException oo = new CoustomException();
         oo.overload(new C());
         oo.overload(new B());
         oo.overload(new A1());
         oo.overload(null);
     }
}
