package deob;

@ObfuscatedName("fg")
public class class160 {

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.b(IIII)I")
    public static int method479(int arg0, int arg1, int arg2) {
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
