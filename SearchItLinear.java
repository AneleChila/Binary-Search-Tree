import java.io.*;
import java.util.*;

public class SearchItLinear 
{

public static void main(String arg[]) throws FileNotFoundException
{
   ArrayList<String> list = new ArrayList<String>();
   ArrayList<String> lt = new ArrayList<String>();
   File file = new File("testdata");
   Scanner scan = new Scanner(file);
   String words = "";
   File qfile = new File("queryfile");
   Scanner scan2 = new Scanner(qfile);
   String wd = ""; 

   while(scan.hasNextLine()){
      words = scan.nextLine();
      list.add(words);
   }
   while (scan2.hasNextLine()){
      wd = scan2.nextLine();
      lt.add(wd);
   }
   int number;

   for (String i: lt/*int i = 0; i<lt.size(); i++*/)
   {
         number = 0;
         for (String n: list/*int n  = 0; n<list.size(); n++*/)
         {
            if (n.contains(i))
            {
               System.out.println(n);
               number += 1;
            }
         }
      if (number == 0)
            System.out.println("Not found");
      number = 0;
   }
         
}
}
