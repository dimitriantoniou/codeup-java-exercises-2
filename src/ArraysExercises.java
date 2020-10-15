public class ArraysExercises {
    public static void main (String[] args){
        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] people = new Person[3];
        Person dimitri = new Person("Dimitri");
        Person eleanna = new Person("Eleanna");
        Person mike = new Person("Mike");

        people[0]= dimitri;
        people[1]= eleanna;
        people[2]= mike;
        System.out.println(people);

        for (Person person:people){
            System.out.println(person);
        }

        //Create a static method named addPerson.
        // It should accept an array of Person objects,
        // as well as a single person object to add to the passed array.
        // It should return an array whose length is 1 greater than the passed array,
        // with the passed person object at the end of the array.
    }
}
