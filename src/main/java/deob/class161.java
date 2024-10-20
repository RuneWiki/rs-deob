package deob;

@ObfuscatedName("fs")
public class class161 {

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.b(IIII)I")
    public static int method1370(int arg0, int arg1, int arg2) {
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
