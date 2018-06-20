package com.assignment.file.io;

import java.io.File;

public class FileRenameDemo {

	public static void main(String[] args) {
		
		File oldF = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestRename");
		
		File renamedF = new File("C:\\Users\\Yang\\Documents\\JavaSession\\JavaSession\\src\\com\\assignment\\file\\io\\TestRenameNew");
		
		if(oldF.renameTo(renamedF)) {
			System.out.println("Renamed successed. The new file name is: " + renamedF.getName());
		}else {
			System.out.println("Renamed failed");
		}

	}

}
