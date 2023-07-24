package com.example.demo;

//Java Program to rename a file
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileRenameEg {
	public static void main(String[] args)
	{
		/*
		 * File file = new
		 * File("C:\\Users\\susmitha.selvan\\Documents\\sampledocuments.txt"); File
		 * rename = new File("C:\\Users\\susmitha.selvan\\Documents\\sampledoc.txt");
		 * boolean flag = file.renameTo(rename); if (flag == true) {
		 * System.out.println("File Successfully Rename"); }
		 * 
		 * else { System.out.println("Operation Failed"); }
		 */
		
		/*
		 * Path source =
		 * Paths.get("C:\\Users\\susmitha.selvan\\Documents\\sampledoc.txt");
		 * 
		 * try{
		 * 
		 * // rename a file in the same directory Files.move(source,
		 * source.resolveSibling("newName.txt"));
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */
		
		String str = null;
	   System.out.println(String.valueOf(str));  // This will print a String equal to "null"        
	   System.out.println(str.toString());
	}
}

