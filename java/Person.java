import lombok.*;

@Getter
@Setter
public class Person {


    private String name;
    private String LastName;


public void ptintPerson(){

    System.out.println(this.name + " " + this.LastName);

}
}
