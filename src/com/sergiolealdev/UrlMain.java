package com.sergiolealdev;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlMain {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URI uri = new URI("http://java.sun.com/");
		 URL url = uri.toURL();
		 InputStream in = url.openStream();
		 int i;
		 char c;
		 while((i=in.read())!=-1){
			 c=(char)i;
			 System.out.print(c);
		 }

	}

}
