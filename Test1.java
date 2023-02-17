package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        
        list.add("IT");
        list.add("Chab Chay");
        list.add("M4");
        
        System.out.println(list);
        
        //Insert
        String var1;
        System.out.print("Search value for insert = ");
        var1=sc.nextLine();
        for(int i=0;i<list.size();i++)
        {
            if(var1.equalsIgnoreCase(list.get(i)))
            {
                System.out.print("Enter new data = ");String data=sc.nextLine();
                list.add(i, data);
                break;
            }
        }
        System.out.println(list);
        
        //Update
        String var2;
        System.out.print("Search value for update = ");
        var2=sc.nextLine();
        for(int i=0;i<list.size();i++)
        {
            if(var2.equalsIgnoreCase(list.get(i)))
            {
                System.out.print("Enter new data = ");String data=sc.nextLine();
                list.set(i, data);
            }
        }
        System.out.println(list);
        
        //Remove
        String var3;
        System.out.print("Search value for remove = ");
        var3=sc.nextLine();
        for(int i=0;i<list.size();i++)
        {
            if(var3.equalsIgnoreCase(list.get(i)))
            {
                list.remove(i);
            }
        }
        System.out.println(list);
        
        //Sort by A -> Z
        Collections.sort(list);
        System.out.println(list);
        
        //Sort by Z -> A
        Collections.reverse(list);
        System.out.println(list);
        
    }
}
