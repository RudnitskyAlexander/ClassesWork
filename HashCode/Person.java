package HashCode;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person peson = (Person) o;
        return Objects.equals(name, peson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
