package deob;

@ObfuscatedName("fe")
public class class168 {

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.n(IIII)I")
    public static int method600(int arg0, int arg1, int arg2) {
        int var3 = arg2 & 0x3;
        if (var3 == 0) {
            return arg1;
        } else if (var3 == 1) {
            return 7 - arg0;
        } else if (var3 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }
}
