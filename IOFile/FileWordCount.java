import java.io.*;
import java.util.*;
public class FileWordCount {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileWordCountNoMap inputFile outputFile");
            return;
        }
        String inputFile = args[0];
        String outputFile = args[1];

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            List<String> wordsList = new ArrayList<>();
            List<Integer> counts = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        int index = wordsList.indexOf(word);
                        if (index == -1) { 
                            wordsList.add(word);
                            counts.add(1);
                        } else { 
                            counts.set(index, counts.get(index) + 1);
                        }
                    }
                }
            }
            br.close();
           
            for (int i = 0; i < wordsList.size() - 1; i++) {
                for (int j = i + 1; j < wordsList.size(); j++) {
                    if (wordsList.get(i).compareTo(wordsList.get(j)) > 0) {
                        String tempWord = wordsList.get(i);
                        wordsList.set(i, wordsList.get(j));
                        wordsList.set(j, tempWord);
                        int tempCount = counts.get(i);
                        counts.set(i, counts.get(j));
                        counts.set(j, tempCount);
                    }
                }
            }
            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));
            for (int i = 0; i < wordsList.size(); i++) {
                pw.println(wordsList.get(i) + " : " + counts.get(i));
            }
            pw.close();
            System.out.println("Word count written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
