package br.com.caelum.livraria.bean;

import java.io.File;
import java.io.IOException;
public class TestePasta {
	public static void main(String[] args) {
		try {
			System.out.println("/  -> " + new File("/").getCanonicalPath());
			System.out.println(".. -> " + new File("..").getCanonicalPath());
			System.out.println(".  -> " + new File(".").getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
