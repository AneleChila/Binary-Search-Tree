# Binary Search Tree

An Electronic Telephone Directory application in Java, using a Binary Search Tree (BST) as an internal data structure.

The data given has the following format:

51850 Kianna Squares, Terre Haute|552.531.3674|Gislason Kenna
17386 Stephanie Parks, Palm Springs|018-594-2935 x716|Hickle Leone
97354 Queen Squares, Birmingham|(332)985-4036|Moore Gilbert

The fields are: address, telephone number, name. 
Every full name has a last name and a first name. 
The fields are separated by "|". 
The lines of the file are unsorted.

Each record will therefore contain: {full_name, full_entry}, with Full_Name as Key.

PROBLEM DESCRIPTION:

The problem at hand is to write an Electronic Telephone Directory application in Java. A Binary Search Tree(BST) will be used as an internal data structure which will help to store data, add data, search for and delete data if needs be. Already given is a datafile containing details of a people (i.e adress, telephone numberand full name ) . The file is an unsorted datafile with details(fields) seperated by vertical bars, "|" . The directory needs to be loaded by full names as keys and full entry as data .

Specific applications to be included are : 
 
PrintIt to load the data from datafile to a BST, traverses the data and print out a sorted list in order of full names, starting with name. Duplicates are to be arranged in any order in the listing , and not treated as one person .

SearchIt seeks to find an entry based on a full name . The application reads a list of queries from a queryfile . If the names on query file are not found , applications returns , "Not found". However if the name is found , full entry returned.

SearchItLinear has the same functionality as SearchIt, it   however replaces the BST with an array .

The SearchIt and SearchItLinear applications are then compared on speed differences on Unix time application to see which is actualy Faster.

