import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*Есть  текстовый файл.  Написать метод,  читающий файл и
возвращающий строку, состоящую из строчек этого файла,
разделенных пробелом.Переписать первую задачу из вчерашнего
задания с использованием StringBuilder: Есть текстовый файл.
Написать метод, читающий файл и возвращающий строку,
состоящую из строчек этого файла.
Write a method to read a text file into a String
using StringBuilder class
Пример текстового файла:
aaa
bbbbbbb
cc              результат : aaa bbbbbbb cc  */


        File filename = new File("input.txt");
        //String fileContents =
        System.out.println(readToString(filename));

        String input = "The weather today is great";
        String reversed = reverseWords(input);
        System.out.println(reversed); // "great is today weather The"



    }

    public static StringBuilder readToString(File filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
                //sb.append(" ");
            }
            return sb;
        }
    }

    /* 2Написать метод, возвращающий слова в строке в обратном порядке. Использовать StringBuilder. Слова разделяются пробелом.
            Пример: "The weather today is great" -> "great is today weather The "
    Write a method to reverse words in a String. Use StringBuilder */


    public static String reverseWords(String input) {

        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        // Добавляем каждое слово в начало StringBuilder'а
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
               reversed.append(" ");
            }
        }

        return reversed.toString();

    }
}
