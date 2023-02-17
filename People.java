package ArrayList;

import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class People {
    private int id;
    private String name;
    private float salary;
    
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id     = ");id=sc.nextInt();sc.nextLine();
        System.out.print("Enter name   = ");name=sc.nextLine();
        System.out.print("Enter salary = ");salary=sc.nextFloat();
    }
    public void Output()
    {
        System.out.println("\t"+id
                           +"\t"+name
                           +"\t"+salary);
    }
}
