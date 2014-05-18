package com.codinko.design._1Strategy;

public class DefaultCompresser implements FileCompresser {

	@Override
	public void compressFiles(String... fileNames) {
		System.out.println("DefaultCompresser: Compression Strategy DEFAULT - Begin");
		for(String fileName: fileNames){
			System.out.println("DefaultCompresser: defaultCompressing File " + fileName);
		}
		System.out.println("DefaultCompresser: Compression Strategy DEFAULT - End");
	}

}
