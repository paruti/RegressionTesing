package com.org;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Read {
	public static void main(String[] args) throws Throwable  {
		String path = "C:\\Users\\Parthi Rajan\\Desktop\\parthi.txt";
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		String rdlne = reader.readLine();
		System.out.println(rdlne);
	}

}
