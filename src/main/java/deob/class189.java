package deob;

@ObfuscatedName("gn")
public class class189 {

    @ObfuscatedName("gn.a")
    public static int[] field2314;

    static {
        new Object();
        field2314 = new int[33];
        field2314[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field2314[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.a(II)I")
    public static int method1947(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("fe.n(III)I")
    public static int method3229(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }
}
