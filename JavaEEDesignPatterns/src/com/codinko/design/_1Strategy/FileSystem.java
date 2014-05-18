package com.codinko.design._1Strategy;

public class FileSystem {

	private FileCompresser compresser;
	
	public FileCompresser getCompresser() {
		return compresser;
	}

	public void setCompresser(FileCompresser compresser) {
		this.compresser = compresser;
	}

	public FileSystem(){
		this.compresser = new DefaultCompresser();
	}

	public FileSystem(FileCompresser compresser){
		this.compresser = compresser;
	}
	
	public void compressFiles(String... fileNames){
		System.out.println("FileSystem: File System Pre-processing");
		System.out.println("FileSystem: File System Compressing");
		this.getCompresser().compressFiles(fileNames);
		System.out.println("FileSystem: File System Post-processing");
	}
}
