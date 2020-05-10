package project;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {
		location fremontLoc = new location();
		File file = new File("fremontLocation.txt");
		String FremontAbsolute = file.getAbsolutePath();
		fremontLoc.loadInformation(FremontAbsolute);
		
		location sanFranLoc = new location();
		File sfFile = new File("sanFranLocation.txt");
		String SFAbsolute = sfFile.getAbsolutePath();
		sanFranLoc.loadInformation(SFAbsolute);
		
		location OaklandLoc = new location();
		File OakFile = new File("OaklandLocation.txt");
		String oakAbsolute = OakFile.getAbsolutePath();
		OaklandLoc.loadInformation(oakAbsolute);
		Gui start = new Gui();

	}

}
