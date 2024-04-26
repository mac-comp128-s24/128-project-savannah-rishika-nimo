import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File(
                "/Users/nimomohamed/Documents/Comp 128 /128-project-savannah-rishika-nimo/src/input.txt");
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String content = myReader.nextLine(); // before compression 
                System.out.println(content);
            }
            myReader.close();

            // perform the compression algorithm
            // write the output to output.txt
            //


            System.out.println("File size in bytes " + myFile.length());
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


// type input in gui
// take input and write it into a file "input.txt"
// calculate the size of the input file -> size before compression
// save size before compression as a variablwe

// run the compression algorithm
// find the output as a string
// write that to 'output.txt'
// find the size of output.txt
// save size after compression as a variablwe

// calculate percentage change or anything