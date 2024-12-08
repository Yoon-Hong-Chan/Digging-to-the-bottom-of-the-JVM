package Chapter3.code;

public class TestAllocation {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM 매개 변수: -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     * -Xlog:gc*
     */

    public static void main(String[] args)  {
        byte[] alloc1, alloc2, alloc3, alloc4;
        alloc1 = new byte[7 * _1MB];
        alloc2 = new byte[7 * _1MB];
        alloc3 = new byte[7 * _1MB];
        alloc4 = new byte[7 * _1MB]; // 여기서 GC 발생
    }
}
