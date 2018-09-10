import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties pt = new Properties();
		FileInputStream fis = new FileInputStream("config.ini");
		pt.load(fis);
		
		System.out.println(pt.getProperty("username"));
		System.out.println(pt.getProperty("pwd"));
		System.out.println(pt.getProperty("dob"));

		
	}

}
