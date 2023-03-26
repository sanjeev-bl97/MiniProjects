import java.io.*;
import java.util.zip.GZIPOutputStream;


public class compressor {
	
	public static void compress(File file) throws IOException{
		
		String filepath = file.getParent();
		
		FileInputStream fi = new FileInputStream(file);
		FileOutputStream fo = new FileOutputStream(filepath+"/compressed.gz");
		GZIPOutputStream gz = new GZIPOutputStream(fo);
		
		byte[] buffer = new byte[1026];
		int len;
		
		while((len = fi.read(buffer)) != -1){
			gz.write(buffer,0,len);
		}
		
		gz.close();
		fo.close();
		fi.close();
		
	}

}
