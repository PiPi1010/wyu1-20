package HomeWork9_18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReadAndWrite {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\GBA\\IO" + File.separator + "homework.txt");
		// Ð´
		Writer out = new FileWriter(f, true);
		System.out.println("Ð´½øÈ¥µÄÄÚÈÝ£ºÐÇÐÇÐÇÐÇ");
		String str = "ÐÇÐÇÐÇÐÇ\n";
		out.write(str);
		out.close();
		// ¶Á
		Reader input = new FileReader(f);
		char[] c = new char[1024];
		int temp = 0;
		int len = 0;
		while ((temp = input.read()) != -1) {
			c[len] = (char) temp;
			len++;
		}
		input.close();
		System.out.println("¶Á³öµÄÄÚÈÝ£º");
		System.out.println(new String(c, 0, len));

	}

}
