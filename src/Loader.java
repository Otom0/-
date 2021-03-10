import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей, Сергей - 880, Алексей 7 рублей";
        Pattern pattern = Pattern.compile("[0-9]+"); // регулярное выражение на числа
        Matcher matcher = pattern.matcher(text);

        int sum = 0;
        while(matcher.find()) {
            sum += Integer.parseInt(matcher.group()); //конвертируем найденные строки в числа и суммируем их
        }
        System.out.println("Все вместе заработали: " + sum);
//        System.out.println(text);
    }
}