package Alien;

import javax.persistence.*;

@Entity
public class Alien {
    @Id
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
