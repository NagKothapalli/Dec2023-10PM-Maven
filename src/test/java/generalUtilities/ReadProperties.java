package generalUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties
{
	
	String filePath;
	
	public ReadProperties(String filePath)
	{
		this.filePath = filePath;
	}
	Properties prop; //null
	FileInputStream myfile;
	public String readData(String mykey) //throws IOException
	{		
		//FileInputStream myfile = new FileInputStream("TestData//DevEnv.properties");	// news paper	
		try {
			myfile = new FileInputStream(filePath);
			prop = new Properties();  
			prop.load(myfile); //handover the news paper to
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		String myval = prop.getProperty(mykey);
		return myval;
	}

}
