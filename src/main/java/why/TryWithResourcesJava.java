package why;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author kostas.kougios
 * Date: 30/05/15
 */
public class TryWithResourcesJava {
	public static void main(String[] args) {
		int data;
		try (FileInputStream in = new FileInputStream("/tmp/x")) {
			// do something with the stream
			data = in.read();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// .. do something with data
		System.out.println(data);
	}
}
