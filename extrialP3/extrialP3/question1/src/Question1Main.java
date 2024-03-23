import be.kdg.WordCounter;

import java.io.IOException;

public class Question1Main {

	private static final String[] FILE_NAMES = {"/lovely_day.txt", "/off_day"};
	private static final String TEXT_LINE = "The train to Istanbul stops from two to two to two";


	public static void main(String[] args) {

		WordCounter stringCounter = new WordCounter();
		stringCounter.countWordsInString(TEXT_LINE);
		System.out.println("1. Alphabetical list of words and number of times they appear\n\t" +
			stringCounter.getWordCounts());
		System.out.println("2. ListS of words by frequency in string\n\t" +
			stringCounter.wordsByCount(stringCounter.getWordCounts()));

	}
}


