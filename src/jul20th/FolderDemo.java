package jul20th;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		String dirpath=System.getProperty("user.dir")+"\\Screenshots";
		File srcDir=new File(dirpath);
		srcDir.mkdir();
	}

}
