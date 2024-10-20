package deob;

@ObfuscatedName("iv")
public class class257 {

    @ObfuscatedName("iv.l")
    public static int[] field3006 = new int[32];

    @ObfuscatedName("iv.q")
    public static int[] field3007;

    @ObfuscatedName("iv.f")
    public static int[] field3009;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3006[var1] = var0 - 1;
            var0 += var0;
        }
        field3007 = new int[4000];
        field3009 = new int[4000];
    }

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.l(II)I")
    public static int method2185(int arg0) {
        class165 var1 = class165.method2158(arg0);
        int var2 = var1.field1782;
        int var3 = var1.field1783;
        int var4 = var1.field1780;
        int var5 = field3006[var4 - var3];
        return field3009[var2] >> var3 & var5;
    }

    @ObfuscatedName("cg.q(III)V")
    public static void method1987(int arg0, int arg1) {
        class165 var2 = class165.method2158(arg0);
        int var3 = var2.field1782;
        int var4 = var2.field1783;
        int var5 = var2.field1780;
        int var6 = field3006[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3009[var3] = field3009[var3] & ~var7 | arg1 << var4 & var7;
    }
}
