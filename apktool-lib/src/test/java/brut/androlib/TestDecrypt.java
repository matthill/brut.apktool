package brut.androlib;

import java.io.File;

import brut.androlib.res.data.ResTable;
import brut.androlib.res.util.ExtFile;

public class TestDecrypt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			Androlib apkLib = new Androlib();
		
			ExtFile file = new ExtFile("/home/mhill/projects/Android/OPNET ARX.apk");
			
			ResTable rt = apkLib.getResTable(file);
			apkLib.decodeManifestFull(file, new File("/tmp/1/"), rt);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
