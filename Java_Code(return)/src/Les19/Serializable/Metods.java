/*
 *@author Scherbatyuk
 */

package Les19.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Metods implements Serializable {

	/** Метод для проведення сереалізації
	 * @throws IOException */
	void serialize( File file, Serializable object) throws IOException {
		OutputStream out = new FileOutputStream(file);
		ObjectOutputStream objout = new ObjectOutputStream(out);
		objout.writeObject(object);
		objout.close();
	}

	/** Метод для проведення десереалізації
	 * @throws IOException 
	 * @throws ClassNotFoundException */
	Serializable deserealize( File file) throws IOException, ClassNotFoundException {
		InputStream in = new FileInputStream(file);
		ObjectInputStream objin = new ObjectInputStream(in);
		Serializable object = (Serializable) objin.readObject();
		objin.close();
		in.close();
		return object;
	}
}
