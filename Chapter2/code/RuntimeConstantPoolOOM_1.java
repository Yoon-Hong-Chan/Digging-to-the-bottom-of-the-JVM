package Chapter2.code;

import java.util.HashSet;
import java.util.Set;

public class RuntimeConstantPoolOOM_1 {
    public static void main(String[] args) throws IllegalAccessException {
        Set<String> set = new HashSet<String>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
