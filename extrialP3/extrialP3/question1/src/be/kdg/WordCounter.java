package be.kdg;

import java.io.*;
import java.util.*;

public class WordCounter {

  // TODO: initialise wordCounts
  private Map<String,Integer> wordCounts = new LinkedHashMap<>();

  public Map<String, Integer> getWordCounts() {
    return wordCounts;
  }

  public  void countWordsInFile(String fileName) throws IOException{
    // TODO add number of times each word appears in file with name fielName to wordCounts
    //  any exception is wrapped in an IOException

  }

  public void countWordsInString(String line) {
    // TODO add number of times each word appears in line to wordCounts
    //  words are in alphabetical order
    String[] words = line.split(" ");
    for (String word: words) {
        if (wordCounts.containsKey(word)){
          wordCounts.put(word, wordCounts.get(word)+1);
        }
        else {
          wordCounts.put(word, 1);
        }
    }
  }




  public Map<Integer,List<String>> wordsByCount(Map<String,Integer> countByWords) {
    // TODO replace the statement below, returning a map, with for each frequency a list of words that appear that many times
    //    lower frequencies come first
    Map<Integer, List<String>> wordsByCount = new LinkedHashMap<>();

    for (Map.Entry<String, Integer> entry:countByWords.entrySet()) {
      if (wordsByCount.containsKey(entry.getValue())){
        List list = wordsByCount.get(entry.getValue());
        list.add(entry.getKey());
        wordsByCount.put(entry.getValue(), list);
      }
      else {
        List list = new ArrayList<>();
        list.add(entry.getKey());
        wordsByCount.put(entry.getValue(), list);
      }
    }
    return wordsByCount;
  }
}
