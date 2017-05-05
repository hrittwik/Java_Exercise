Java Assignments 4: I/O Streams and Introducing GUI Programming

Concept: I/O Streams 

Objective: At the end of the assignments, participants will be able to understand and write code for IO operations 



1. Write a program which take source file and destination file as input as command line arguments. It copies the source file contents to destination file. If source file does not exist, it should give appropriate message to use. If destination file does not exist, it should be created. If it exists, program should ask that, “whether you want to overwrite?(Yes/No”. 

On the basis of user choice, appropriate action should be taken.  

Note: Files may be any type of files like bitmap files, exe files, text files etc.	
	
    
2.Write a stream based program which will accept Roll Number, Name, Age and Address from user 
Age and Roll-no should be numeric.  Handle with built-in exception.
None of the field should be blank. Handle with custom exception,
    
Ask user ,whether to write the data in the file 

If answer is yes then data is saved into a file as an object(User can write many records in the file), otherwise terminate the current program
Write another program to display all the records saved into the file

3. Write a program using java file system to copy the contents of one file into another. 
(This is Self Study Assignment.  Refer Java API documentation.)
	
4. Write a program which will accept an input String from user 
(This is Self Study Assignment.  Refer Java API documentation.)

Write the input in the file io.txt
Show size of the file
Read contets from the  file  and display them on console
Delete io.txt file using File class

5. Accept a directory name in form of String from user using proper IO stream.  Store it in a variable.  (This is Self Study Assignment.  Refer Java API documentation.)
Search if it exists in your system.If it exists then show all the files present in the directory otherwise print the message that directory Does not Exists

6. Create a class “CDR” with the following members:

A_Number
B_Number
duration
calculatedCharge
     
Write a program which will accept the A_Number, B_Number and duration of Call from user(Duration is in minutes). Rate that call using  1 Rupee per min rate and store the calculated charge in “calculatedCharge.txt” file. Write this object to “rated_cdr.txt”.  
 
Note : CDR means Call Details Record	

