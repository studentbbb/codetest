import java.util.HashSet;
import java.util.Set;

/**
 * @author bitj
 * @description
 * @create 2020/2/24 13:27
 **/
public class Stage2 {

    private static Set<String> dict = new HashSet<String>(){{
        add("i");
        add("like");
        add("sam");
        add("sung");
        add("mobile");
        add("icecream");
        add("man go");
        add("mango");
    }};

    public static void main(String[] args) {
        String input1 = "ilikesamsungmobile";
        String input2 = "ilikeicecreamandmango";

        wordSplit(input1,"");
        wordSplit(input2,"");
    }

    private static void wordSplit(String word, String result){

        for (int i = 1; i <= word.length(); i++){
            String tmp = word.substring(0,i);
            if (dict.contains(tmp)) {
                if (i == word.length()) {
                    result += tmp;
                    System.out.println(result);
                    return;
                }
                wordSplit(word.substring(i), result + tmp + " ");
            }
        }
    }
}
