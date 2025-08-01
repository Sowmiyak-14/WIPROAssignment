package Wipro_string;
import java.util.*;
public class JoinNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        StringJoiner sj = new StringJoiner(",","{","}");
        names.forEach(sj::add);
        System.out.println(sj.toString()); 
    }
}
