import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SearchIt
{
    public static void main(String[] args)
    {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
	//BinarySearchTree<String> BT = new BinarySearchTree<String>();
        BinarySearchTree<String> BST = new BinarySearchTree<String>();
        
        try
        {
            inputStream = new Scanner(new FileInputStream("queryfile"));
        }
        
        catch(FileNotFoundException e)
        {
            System.exit(0);
        }
        String line = null;
        int count = 0;
        while(inputStream.hasNextLine())
        {
            line = inputStream.nextLine();
            System.out.println(BST.find(line,line));
	

	    //System.out.println(line.substring(line.lastIndexOf("|")+1));
            count++;
	    //System.out.println(line);
            
        }
        inputStream.close();

    }
}
