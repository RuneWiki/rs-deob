package deob;

import java.util.Arrays;

@ObfuscatedName("nm")
public class class346 {

    @ObfuscatedName("nm.ak")
    public static int[] field3712 = new int[32];

    @ObfuscatedName("nm.aj")
    public static int[] field3709;

    @ObfuscatedName("nm.az")
    public static int[] field3710;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3712[var1] = var0 - 1;
            var0 += var0;
        }
        field3709 = new int[5000];
        field3710 = new int[5000];
    }

    public class346() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mc.ak(IB)I")
    public static int method5576(int arg0) {
        class218 var1 = class218.method685(arg0);
        int var2 = var1.field2224;
        int var3 = var1.field2225;
        int var4 = var1.field2226;
        int var5 = field3712[var4 - var3];
        return field3710[var2] >> var3 & var5;
    }

    @ObfuscatedName("dr.al(III)V")
    public static void method2130(int arg0, int arg1) {
        class218 var2 = class218.method685(arg0);
        int var3 = var2.field2224;
        int var4 = var2.field2225;
        int var5 = var2.field2226;
        int var6 = field3712[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3710[var3] = field3710[var3] & ~var7 | arg1 << var4 & var7;
    }

    @ObfuscatedName("it.aj(I)V")
    public static void method3770() {
        Arrays.fill(field3709, 0);
        Arrays.fill(field3710, 0);
    }
}
