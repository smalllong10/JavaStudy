package CommonStudy.StringStudy;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        System.out.println(sb.length());
        String str = sb.toString();
        System.out.println(str);



    }
}
