package cloneExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@FunctionalInterface
interface Function {
    void init();
    static Function demo(){
        return ()->{};
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Function f1 = () -> {};
        Function f2 = () -> {};
        Function f3 = Function.demo();
        Function f4 = Function.demo();
        HashMap m1 = new LinkedHashMap();
        m1.put(f1,"Keshav");
        m1.put(f2,"Mahur");
        HashMap m2 = new LinkedHashMap();
    }
}
