package lfkimura;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
	public static void main(String[] arguments) throws IOException {
		System.out.println("hello");

		//Normal Zip
		//ZipUtil.zipDir("testdata/SWT", "testdata/temp.zip");
		//ZipUtil.zipDir("testdata/SWT", null);

		//Zip with Password
		ZipUtil.zipFileWithPassword("package.json",  "temp.zip","abcd1234");
		//ZipUtil.zipDirWithPassword("testdata/SWT", null,"abcd1234");

		//Normal Unzip
		//ZipUtil.unzipDir("testdata/temp.zip", "tempdata");
//		ZipUtil.unzipDirWithPassword("testdata/temp.zip", "tempdata", "abcd1234");

    }


}
