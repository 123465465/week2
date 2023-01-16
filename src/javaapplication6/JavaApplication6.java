/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaApplication6;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        student[] list = new student[3];
        student s1 = new student();
        s1.setname("peter");
        s1.setage(23);
        student s2 = new student();
        s2.setname("ram");
        s2.setage(25);
        list[0]=s1;
        list[1]=s2;
        for(i=0; i<list.length; i++)
        {
            System.out.println(list(i).getname()+ list(i).getage());
        }
    }
    
}
