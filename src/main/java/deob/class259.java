package deob;

@ObfuscatedName("ia")
public class class259 {

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.l(IIII)I")
    public static int method2751(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("d.q(IIII)I")
    public static int method367(int arg0, int arg1, int arg2) {
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
