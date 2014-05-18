package com.codinko.design._1Strategy;

public class RarCompresser implements FileCompresser {

	@Override
	public void compressFiles(String... fileNames) {
		System.out.println("RarCompresser: Compression Strategy RAR - Begin");
		for(String fileName: fileNames){
			System.out.println("RarCompresser: Raring File " + fileName);
		}
		System.out.println("RarCompresser: Compression Strategy RAR - End");
	}

}
