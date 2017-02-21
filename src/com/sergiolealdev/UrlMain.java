package com.sergiolealdev;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlMain {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URI uri = new URI("http://as.com");
		 URL url = uri.toURL();
		 InputStream in = url.openStream();
		 int i;
		 char c;
		 StringBuffer sb = new StringBuffer();
		 while((i=in.read())!=-1){
			 c=(char)i;
			 System.out.print(c);
			 sb.append(c);
		 }
		 
		 String result = sb.toString();
		 String cristianoString = "Cristiano";
		 String messiString = "Messi";
		 int cristianoOccurences = 0;
		 int messiOccurences = 0;
		  for (int index = result.indexOf(cristianoString);index >= 0; index = result.indexOf(cristianoString, index + 1)) {
			  cristianoOccurences++;
		    }
		  for (int index = result.indexOf(messiString);index >= 0; index = result.indexOf(messiString, index + 1)) {
			  messiOccurences++;
		    }
		  System.out.println("Found " + cristianoOccurences + " Cristiano Occurrences");
		 System.out.println("Found " + messiOccurences + " Messi Occurrences");

	}

}
