package cloneExample;

public class DemoShallowCopyUseingClone implements Cloneable {

   int x=10;
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
