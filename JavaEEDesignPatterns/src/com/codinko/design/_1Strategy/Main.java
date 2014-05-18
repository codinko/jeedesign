package com.codinko.design._1Strategy;

/**
 * The strategy pattern (also known as the policy pattern) is a software design
 * pattern that enables an algorithm's behavior to be selected at runtime.
 * 
 * Strategy lets the algorithm vary independently from clients that use it
 * 
 * For instance, a class that performs validation on incoming data may use a
 * strategy pattern to select a validation algorithm based on the type of data,
 * the source of the data, user choice, or other discriminating factors. These
 * factors are not known for each case until run-time, and may require radically
 * "different validation" [different implementation for validation] to be
 * performed. The validation strategies, encapsulated separately from the
 * validating object, may be used by other validating objects in different areas
 * of the system (or even different systems) without code duplication.
 * 
 */

public class Main {
	public static void main(String... args) {
		System.out
				.println("Main: -------------------------------------------------------------");
		new FileSystem().compressFiles(new String[] { "File 1", "File 2",
				"File 3" });
		System.out
				.println("Main: -------------------------------------------------------------");
		new FileSystem(new ZipCompresser()).compressFiles(new String[] {
				"File 1", "File 2", "File 3" });
		System.out
				.println("Main: -------------------------------------------------------------");
		new FileSystem(new RarCompresser()).compressFiles(new String[] {
				"File 1", "File 2", "File 3" });
		System.out
				.println("Main: -------------------------------------------------------------");
	}
}
/**
 * OUTPUT:
 * 
 * Main: -------------------------------------------------------------
FileSystem: File System Pre-processing
FileSystem: File System Compressing
DefaultCompresser: Compression Strategy DEFAULT - Begin
DefaultCompresser: defaultCompressing File File 1
DefaultCompresser: defaultCompressing File File 2
DefaultCompresser: defaultCompressing File File 3
DefaultCompresser: Compression Strategy DEFAULT - End
FileSystem: File System Post-processing
Main: -------------------------------------------------------------
FileSystem: File System Pre-processing
FileSystem: File System Compressing
ZipCompresser: Compression Strategy ZIP - Begin
ZipCompresser: Zipping File File 1
ZipCompresser: Zipping File File 2
ZipCompresser: Zipping File File 3
ZipCompresser: Compression Strategy ZIP - End
FileSystem: File System Post-processing
Main: -------------------------------------------------------------
FileSystem: File System Pre-processing
FileSystem: File System Compressing
RarCompresser: Compression Strategy RAR - Begin
RarCompresser: Raring File File 1
RarCompresser: Raring File File 2
RarCompresser: Raring File File 3
RarCompresser: Compression Strategy RAR - End
FileSystem: File System Post-processing
Main: -------------------------------------------------------------

 * 
 * */
