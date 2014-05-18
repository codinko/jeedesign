package com.codinko.design._1Strategy;

public class ZipCompresser implements FileCompresser {

	@Override
	public void compressFiles(String... fileNames) {
		System.out.println("ZipCompresser: Compression Strategy ZIP - Begin");
		for (String fileName : fileNames) {
			System.out.println("ZipCompresser: Zipping File " + fileName);
		}
		System.out.println("ZipCompresser: Compression Strategy ZIP - End");
	}

}
