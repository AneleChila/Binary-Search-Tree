import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintIt
{
    public static void main(String[] args)
    {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
	//BinaryTree<String> BT = new BinaryTree<String>();
        BinarySearchTree<String> BST = new BinarySearchTree<String>();
        
        try
        {
            inputStream = new Scanner(new FileInputStream("testdata"));
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
            BST.insert(line.substring(line.lastIndexOf("|")+1),line);
	    //System.out.println(line.substring(line.lastIndexOf("|")+1));
            count++;
	    //System.out.println(line);
            
        }
        inputStream.close();

	BST.inOrder();
        
	
        
        
    }

}
