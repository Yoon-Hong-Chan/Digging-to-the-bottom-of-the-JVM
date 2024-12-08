package Chapter3.code;

public class TestPretenureSizeThreshold {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM 매개 변수: -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     * -Xlog:gc* -XX:PretenureSizeThreshold=3M
     */

    public static void main(String[] args)  {
        byte[] alloc1;
        alloc1 = new byte[4 * _1MB];
    }
}
