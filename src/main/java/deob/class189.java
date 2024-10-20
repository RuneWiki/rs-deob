package deob;

@ObfuscatedName("gl")
public class class189 {

    @ObfuscatedName("gl.c")
    public static int[] field2316;

    static {
        new Object();
        field2316 = new int[33];
        field2316[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field2316[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.x(III)I")
    public static int method477(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("iy.t(III)I")
    public static int method4315(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }
}
