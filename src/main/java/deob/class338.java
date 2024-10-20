package deob;

@ObfuscatedName("mz")
public class class338 {

    public class338() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.at(IIII)I")
    public static int method463(int arg0, int arg1, int arg2) {
        int var3 = arg2 & 0x3;
        if (var3 == 0) {
            return arg0;
        } else if (var3 == 1) {
            return arg1;
        } else if (var3 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }
}
