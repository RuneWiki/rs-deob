package deob;

@ObfuscatedName("iq")
public class class257 {

    @ObfuscatedName("iq.i")
    public static int[] field3013 = new int[32];

    @ObfuscatedName("iq.w")
    public static int[] field3012;

    @ObfuscatedName("iq.s")
    public static int[] field3015;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3013[var1] = var0 - 1;
            var0 += var0;
        }
        field3012 = new int[4000];
        field3015 = new int[4000];
    }

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.i(II)I")
    public static int method2410(int arg0) {
        class165 var1 = class165.method2655(arg0);
        int var2 = var1.field1777;
        int var3 = var1.field1778;
        int var4 = var1.field1779;
        int var5 = field3013[var4 - var3];
        return field3015[var2] >> var3 & var5;
    }

    @ObfuscatedName("dz.w(III)V")
    public static void method2423(int arg0, int arg1) {
        class165 var2 = class165.method2655(arg0);
        int var3 = var2.field1777;
        int var4 = var2.field1778;
        int var5 = var2.field1779;
        int var6 = field3013[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3015[var3] = field3015[var3] & ~var7 | arg1 << var4 & var7;
    }
}
