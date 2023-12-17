
import java.util.*;
import java.util.stream.*;


public class dic {
    List<String> words = new ArrayList<>();
    public void wordsstartwithN()
    {

        this.words.stream().filter(i -> i.charAt(0)=='n' ).forEach(i -> System.out.print(i+" "));

    }
    public void wordswithlength7()
    {

        this.words.stream().filter(i -> i.length()==7 ).forEach(i -> System.out.print(i+" "));

    }
    public void groupbyfirst3letters()
    {
        Map<Object, List<String>> stream=this.words.stream().filter(i-> (i.length()>3)).collect(Collectors.groupingBy(s -> s.substring(0,3)));
        System.out.println(stream);
    }
    public void countvowels()
    {
        String allwords
                = this.words.stream()
                .map(arr -> new String(arr))
                .collect(Collectors.joining());
        long numvowels = allwords.chars().filter(ch ->
                ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch)).count();
        System.out.println(numvowels);
    }

    public void wordsstartwithAH()
    {
        this.words.stream().filter(i -> (i.charAt(0)>='a' && i.charAt(0)<'h')  ).forEach(i -> System.out.print(i+" "));
    }
    public void palindromes()
    {
        List<String> res = this.words.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(res);
    }

    public void startAendZ()
    {
        this.words.stream().filter(i -> (i.charAt(0)=='a' && i.charAt(i.length()-1)=='z' )).forEach(i -> System.out.print(i+" "));
    }
    public void longestword()
    {
        List<Integer> length;
        length = this.words.stream().map(i-> i.length()).collect(Collectors.toList());
        Optional<Integer> max = length.stream().reduce(Integer::max);
        this.words.stream().filter(i -> (i.length()==max.get()) ).forEach(i -> System.out.print(i+" "));

    }

}
