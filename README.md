# File Compressor Program

Info about your project goes here

File Compressor Program

- Overview
  This project is designed to compress text files using the Huffman coding algorithm. Huffman coding is a popular method used to compress files. The program takes an input string, creates a tree according to each character and its frequency, compresses it using Huffman coding, and then displays the compressed size along with the Huffman codes for each character.

- FileGUI:

The FileGui class, is responsible for interrtcting with the user. This class allows the user to input the string they need to compress. It also allows the user to see how much space they used before the algorithm and after. This file opens a window that displays the resulting Huffman codes for individual characters in the input string to the user. These codes are not only imporatatnt for the user to see the process of the algorithm but also are essential for decoding the text back to its original form. The Huffman codes are displayed alongside their corresponding characters.

- Huffman file
  The Huffman file is responsible for creating the main huffman code algorithms. It has a readfile method, that reads the input string. Then it creates a frequency map, that maps the character and how frequent that character appears in the string. It also has a createQueue method that creates a priority queue. This queue is passed on to the constructTree method which takes the characters with the lowest frequcy and combines them together making a parentnode. This parentnode is then added to the queue. This is repeatedly done until there is one node left. That node becomes the parent node. The encode method then generates huffman code for each characters depending on where it is in the tree.
