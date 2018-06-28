import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        Person person = new Person();
        person.setName("koko");

        for (int i = 0; i < 20; i++) {

            myList.add("koko" + i);

        }

        for (String s : myList) {
            System.out.println(s);

        }

    }
}