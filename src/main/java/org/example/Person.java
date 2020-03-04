package org.example;

public class Person {
    private String name;
    private String sname;
    private int age;
    private String id;

    public Person(String name, String sname, int age, String id) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.id = id;
    }

    //GETTERS
    public String getName() {
        return name;
    }
    public String getSname() {
        return sname;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(String id) {
        this.id = id;
    }
}
