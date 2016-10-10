import java.io.*;
import java.util.*;
import java.util.Scanner;
class MyFilter implements FileFilter{
       public boolean accept(File g){
          if(g.getName().endsWith(".exe"))                                                                       //.exe is the extension of virus that is to be detected
            return true;
          else
           return false;
      }
 }
class antivirus {
      public static void main(String... args) throws Exception{
         System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t WELCOME TO ANTIVIRUS SOFTWARE \t\t\t\t\t\t\t\t\t\t\t\t");
         File f=new File ("C:");                                                                                  //checking the virus in C drive
         if(f.isDirectory()){ 
            File [] Virus=f.listFiles(new MyFilter());
            if(Virus == null)
            {
            System.out.println("no virus detected");
            }
            else{
                 System.out.println("VIRUS DETECTED");
                 System.out.println("enter your choice:YES for deleting the file OR NO for not deleting the file");
                // System.out.println("enter YES for deleting the file");
                // System.out.println("enter NO for not deleting the file");
                 Scanner sc= new Scanner(System.in);
                 String choice = sc.next();
                 switch(choice)
                 {
                  case "YES":
                             f.delete();
                             System.out.println("file has been deleted");
                             break;
                  
                  case "NO":
                            break;
                   
                  default: 
                          break;
                  }
              }
         for(File f1:Virus){
              System.out.println(f1.getName());                                                                 //get the name of the virus
             }
         }
     }  
 }

