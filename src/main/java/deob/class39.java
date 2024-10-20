package deob;

@ObfuscatedName("ae")
public class class39 {

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.c(IIII)I")
    public static int method2119(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
