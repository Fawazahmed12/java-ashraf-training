package sessionCodingByElvin;

public class Person {
    int id;
    String name;
    float age;



    Person(int id, String name, float age ){
        this.id =id;
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public float getAge() {
        return age;
    }

    public int getId(){
        return this.id;
    }
}



