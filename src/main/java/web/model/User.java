package web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String surname;
    private Integer age;

    public User(Long id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
