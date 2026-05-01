package myFirstSpringBootProject.models;
//Ye User.java hai. Ye sirf ek "shakal" ya "structure" hai ke ek User kaisa dikhta hai (ID, Name, Age).
// Ye khud kuch nahi karta, bas data hold karta hai.
public class user {
    private int id;
    private String name;
    private int age;

    // Constructor
    public user(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}
