package assignement;

public class AlphaCheck {

    static void m1(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("print ch is vowel:" + ch);
        } else {
            System.out.println("print ch is consonant:" + ch);
        }
    }
    static void m2(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("value is vowel:"+ch);
                break;

            default:
                System.out.println("value is a consonant:"+ch);
        }
    }
    public static void main(String[] args){
            m1('a');
            m1('b');

            m2('e');
            m2('g');
        }


}
