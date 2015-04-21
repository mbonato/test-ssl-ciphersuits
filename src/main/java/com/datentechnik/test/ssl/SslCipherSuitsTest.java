package com.datentechnik.test.ssl;

import java.net.URL;
import java.net.URLConnection;
import java.security.Provider;
import java.security.Security;

import javax.net.ssl.HttpsURLConnection;

public class SslCipherSuitsTest {
	
	public static String[] systemProperties = {"java.vendor", "java.version", "os.arch", "os.name", "os.version"};

	public static void main(String[] args) throws Exception {
		URLConnection urlConnection = new URL(args[0]).openConnection();
		urlConnection.getLastModified();
		if (urlConnection instanceof HttpsURLConnection) {
//			System.out.println(((HttpsURLConnection) urlConnection).getCipherSuite());
			for (String systemProperty : systemProperties) {
				System.out.println(systemProperty + ": " + System.getProperty(systemProperty));
			}
			System.out.println("Registered Security Providers:");
			Provider[] providers = Security.getProviders();
			for (int i = 0; i < providers.length; i++) {
				System.out.println((i + 1) + ": " + providers[i].getName() + " (" + providers[i].getVersion() + ")");
			}
		}
	}

}
