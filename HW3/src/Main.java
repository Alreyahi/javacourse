import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input = """
            lorem ipsum is simply 
            dummy text of the printing and 
            typysetting industry lorem ipsum has been 
            the industry standard dummy text ever 
            since the when unknown printer 
            took a galley of type and 
            scrambled it to make a type specimen book 
            it has survived not only five centuries 
            but also the leap into electronic you 
            remaining essentially unchanged 
            it was popularised in the with the""";


        List<String> allWords = new ArrayList<>(List.of(input.trim().split("\\W+")));
        // п1 - подсчитайте количество различных слов в файле
        Set<String> uniqueWords = new HashSet<>(allWords);
        System.out.println("Different words in the file: " + uniqueWords.size());
        System.out.println();
        // п2 - отсортировать список по длине, а потом по алфавиту
        System.out.println("Sorted words: ");
        Comparator<String> comparator = Comparator.comparing(String::length).thenComparing(String::toString);
        List<String> uniqueWordsList = new ArrayList<>(uniqueWords);
        uniqueWordsList.sort(comparator);
        for (String word: uniqueWordsList) {
            System.out.println(word);
        }
        System.out.println();
        // п3 - встречаемость каждого слова в файле
        System.out.println("Occurrences of each word: ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word: allWords) {
            if (wordsCount.get(word) == null) {
                wordsCount.put(word, 1);
            } else {
                wordsCount.put(word, wordsCount.get(word)+1);
            }
        }
        for (Map.Entry<String, Integer> pair: wordsCount.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println();
        // п4 - строки файла в обратном порядке
        System.out.println("Display the lines in reverse order: ");
        List<String> fileLines = new ArrayList<>(List.of(input.split("\n")));
        for (int i = fileLines.size()-1; i >= 0; i--) {
            System.out.println(fileLines.get(i));
        }
        System.out.println();
        // п5 - итератор для реверсивного прохода, пример использования реализованного task1.ReverseIterator
        System.out.println("Traverse the list in reverse order: ");
        ReverseIterator<String> linesReverseIterator = new ReverseIterator<>(fileLines);
        while (linesReverseIterator.hasNext()) {
            System.out.println(linesReverseIterator.next());
        }
        System.out.println();
        // п6 - вывод строк, запрошенных пользователем
        System.out.println("Display the lines whose numbers are set by the user: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lines numbers separated by a space: ");
        String userInput = in.nextLine();
        for (String n: userInput.split(" ")) {
            try {
                int lineNum = Integer.parseInt(n) - 1;
                System.out.println("Line " + (lineNum+1) + ": " + fileLines.get(lineNum));
            } catch (NumberFormatException e) {
                System.out.println(n + " isn't considered a number");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("There's no line that has number: " + n);
            }
        }
    }
}