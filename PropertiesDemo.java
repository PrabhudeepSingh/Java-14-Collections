import java.util.*;
import java.io.*;

class PropertiesDemo
{
	public static void main(String[] args) throws Exception
	{
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("prabhu.properties");
		properties.load(fis);
		System.out.println(properties);
		
		String str = properties.getProperty("Prabhu");
		System.out.println(str);
		
		properties.setProperty("Deep","08");
		FileOutputStream fos = new FileOutputStream("prabhu.properties");
		
		properties.store(fos, "Updated by Prabhudeep.");
	}
}