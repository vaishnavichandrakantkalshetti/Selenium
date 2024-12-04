package Com.Crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static String property(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\selenium\\Com.Crm.VTigerE4\\src\\test\\resources\\VTigerProperties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}
	
}
