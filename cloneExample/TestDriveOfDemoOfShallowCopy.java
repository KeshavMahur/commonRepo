package cloneExample;

public class TestDriveOfDemoOfShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
      /*  *//*DemoOfShallowCopy demo = new DemoOfShallowCopy();
        System.out.println(demo.x);
        DemoOfShallowCopy d = demo;
        d.x = 10;
        System.out.println(demo.x);*//*
        DemoShallowCopyUseingClone d1 = new DemoShallowCopyUseingClone();
        System.out.println(d1.x);
        d1.x = 50;
        DemoShallowCopyUseingClone d2 = (DemoShallowCopyUseingClone) d1.clone();
        System.out.println(d2.x);*/
        SounuImmutable s = new SounuImmutable("Sonu");
       SounuImmutable s1 = s.modify("sonu");
        System.out.println(s.hashCode()+"|||"+s1.hashCode());
    }
}
