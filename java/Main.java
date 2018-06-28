import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        ArrayList<Person> persons = new ArrayList<Person>();
        Person p = new Person();

        for (int i = 0; i < 20; i++) {

            persons.add(new Person());

        }


        p = persons.get(0);

        p.setLastName("koko");
        p.setName("lolo");
        p.ptintPerson();

        p = persons.get(2);
        p.ptintPerson();



    }
}