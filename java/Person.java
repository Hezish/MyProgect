import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Person {


    private String name;
    private String LastName;


public void ptintPerson(){

    System.out.println(this.name + " " + this.LastName);

}
}
