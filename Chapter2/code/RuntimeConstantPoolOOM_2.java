package Chapter2.code;

import java.util.HashSet;
import java.util.Set;

public class RuntimeConstantPoolOOM_2 {
    public static void main(String[] args){
        String str1 = new StringBuilder("컴퓨터").append(" 소프트웨어").toString();
        System.out.println(str1.intern() == str1);
    }
}
