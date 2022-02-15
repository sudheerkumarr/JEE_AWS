/*
 * * // IO
 * sharing data between systems
 * java.io pkg
 * read - file required
 *      - FileNotFoundException
 * write - file is optional
 *       - if file exists, data will be override
 *       - if file not exists, new file will be created and add data in it.
 * source - console, file, socket
 * target - console, file, socket
 * 
 * Source ----> App  ------> Target
 * 
 * Source ---Channels ---> Target
 * Types of channels - data transferring medium
 *   1. Byte oriented channels - bytes - binary files 
 *   2. Character oriented channels - char - text
 * 
 * Steps:
 *   1. Create channels
 *   2. read file char by char or line by line
 *   3. write data char by char or line by line
 *   
 * Byte Oriented channels
 * Read 
 * java.io.FileInputStream - byte oriented channel
 * java.io.FileReader      - char oriented channel
 * Write
 * java.io.FileOutputStream - byte oriented channel
 * java.io.FileWriter       - char oriented channel
 * 
 * * Read or write line by line
 * BufferedInputStream - byte oriented
 * BufferedOutputStream - byte oriented
 * BufferedReader - char oriented
 * BufferedWriter - char oriented
 */
package day5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		/*
		// creating byte channel, read and write byte by byte
		
		try {
			// read
			//C:\Users\rskum\OneDrive\Desktop
			fis = new FileInputStream("F:\\abc.txt");
			
			// write
			fos = new FileOutputStream("F:\\xyz.txt");

			int num;
			while ((num = fis.read()) != -1) {
				System.out.println((char) num);
				fos.write(num);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if(fos!=null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// Case 2:
		// Read & write line by line using byte stream channels
		try {
			// read
			//C:\Users\rskum\OneDrive\Desktop
			fis = new FileInputStream("F:\\abc.txt");
			 bis = new BufferedInputStream(fis);
			
			// write
			fos = new FileOutputStream("F:\\xyz.txt");
			bos = new BufferedOutputStream(fos);

			int num;
			while ((num = bis.read()) != -1) {
				System.out.println((char) num);
				bos.write(num);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(fis!=null) {
					fis.close();
				}
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if(bos!=null) {
					bos.close();
				}
				if(fos!=null) {
					fos.close();
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
