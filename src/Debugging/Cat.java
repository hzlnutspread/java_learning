package Debugging;

public class Cat {

    String name;
    String litterPreference;
    int age;

    Cat(String name) {
        this.name = name;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
