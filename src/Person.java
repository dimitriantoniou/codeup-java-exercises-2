public class Person {
    private String name;
    public String getName(){
    //TODO: return the person's name
    System.out.println(name);
    return name;
    }
    //
    public void setName(String name){
    ////TODO: change the name property to the passed value
    this.name=name;
    }
    public void sayHello(){
    ////TODO: print a message to the console using the person's name
    System.out.println("Hello, "+name);
    }

    //The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    public Person(String name) {
        this.name = name;
    }
    public static void main (String[] args){
    Person Dimitri = new Person("Dimitri");
    Dimitri.sayHello();
    }

}
