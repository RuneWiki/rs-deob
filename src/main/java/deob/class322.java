package deob;

@ObfuscatedName("mz")
public class class322 {

    @ObfuscatedName("mz.au")
    public static int[] field3538 = new int[32];

    @ObfuscatedName("mz.ae")
    public static int[] field3542;

    @ObfuscatedName("mz.ao")
    public static int[] field3540;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3538[var1] = var0 - 1;
            var0 += var0;
        }
        field3542 = new int[4000];
        field3540 = new int[4000];
    }

    public class322() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.au(II)I")
    public static int method2448(int arg0) {
        class202 var1 = class202.method6559(arg0);
        int var2 = var1.field2126;
        int var3 = var1.field2127;
        int var4 = var1.field2131;
        int var5 = field3538[var4 - var3];
        return field3540[var2] >> var3 & var5;
    }
}
