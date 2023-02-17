package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        People people=new People();
        ArrayList<People> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int i,n=0,op=0;
        do
        {
            System.out.println("------------- E M P L O Y E E ----------------");
            System.out.println("\t 1,   Add");
            System.out.println("\t 2,   Output");
            System.out.println("\t 3,   Search");
            System.out.println("\t 4,   Update");
            System.out.println("\t 5,   Insert");
            System.out.println("\t 6,   Remove");
            System.out.println("\t 7,   Sort");
            System.out.println("\t 8,   Add more");
            System.out.println("\t 9,   Clear");
            System.out.println("\t 10,   Exit");
            System.out.print("Choose option on the menu = ");op=sc.nextInt();
            switch(op)
            {
                case 1:{
                    System.out.print("Input number of employee = ");
                    n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        people=new People();
                        people.Input();
                        list.add(people);
                    }
                }break;
                case 2:{
                    
                    for(i=0;i<list.size();i++)
                    {
                        list.get(i).Output();
                    }
                    if(list.isEmpty()){
                        System.out.println("Non data !");
                    }
                }break;
                case 3:{
                    int var;
                    System.out.print("Search by id = ");var=sc.nextInt();
                    for(i=0;i<list.size();i++)
                    {
                        if(var==list.get(i).getId())
                        {
                            list.get(i).Output();
                        }
                    }
                }break;
                case 4:{
                    int var;
                    System.out.print("Search by id = ");var=sc.nextInt();
                    for(i=0;i<list.size();i++)
                    {
                        if(var==list.get(i).getId())
                        {
                            people=new People();
                            people.Input();
                            list.set(i,people);
                        }
                    }
                }break;
                case 5:{
                    int var;
                    System.out.print("Search by id = ");var=sc.nextInt();
                    for(i=0;i<list.size();i++)
                    {
                        if(var==list.get(i).getId())
                        {
                            people=new People();
                            people.Input();
                            list.add(i,people);
                            break;
                        }
                    }
                }break;
                case 6:{
                    int var;
                    System.out.print("Search by id = ");var=sc.nextInt();
                    for(i=0;i<list.size();i++)
                    {
                        if(var==list.get(i).getId())
                        {
                            list.remove(i);
                        }
                    }
                }break;
                case 7:{
                    Collections.sort(list,Comparator.comparing(People::getSalary));
                }break;
                case 8:{
                    int add;
                    System.out.print("Add more data = ");add=sc.nextInt();
                    for(i=n;i<n+add;i++)
                    {
                        people=new People();
                        people.Input();
                        list.add(n, people);
                    }
                    n +=add;
                }break;
                case 9:{
                    list.clear();
                }break;
            }
        }while(op!=10);
    }
 
}
