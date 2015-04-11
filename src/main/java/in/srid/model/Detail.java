package in.srid.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Detail {

    private String name;
    private int age;
    private int random;

    public Detail() {
        // needed for jackson
    }

    public Detail(final String name, final int age, final int random) {
        this.name = name;
        this.age = age;
        this.random = random;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(final int random) {
        this.random = random;
    }
}
