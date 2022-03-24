package cloneExample;

public class SounuImmutable {
    private final String name;

    public SounuImmutable(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "SounuImmutable{" +
                "name='" + name + '\'' +
                '}';
    }

    public SounuImmutable modify(String name) {
        return this.name.equalsIgnoreCase(name) ? this : new SounuImmutable(name);
    }
}
