import java.io.*;
import java.util.zip.GZIPInputStream;

public class decompressor {

	public static void decompress(File file) throws IOException{
		
	
	String filepath = file.getParent();
	
	FileInputStream fi = new FileInputStream(file);
	GZIPInputStream gz = new GZIPInputStream(fi);
	FileOutputStream fo = new FileOutputStream(filepath+"/Decompressed");
	
	
	byte[] buffer = new byte[1026];
	int len;
	
	while((len = gz.read(buffer)) != -1){
		fo.write(buffer,0,len);
	}
	
	gz.close();
	fo.close();
	fi.close();
	
	}
}
