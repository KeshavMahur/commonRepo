public class TestDemo extends Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Demo d = new Demo();
        System.out.println(d.x);
        Demo d1 = (Demo) d.clone();
        d1.x = 50;
        System.out.println(d1.x);

        System.out.println("Anas");

        System.out.println("cherry pick demo");
    }
}
