package deob;

@ObfuscatedName("hv")
public class class222 {

    @ObfuscatedName("hv.z")
    public static int[] field2556 = new int[32];

    @ObfuscatedName("hv.k")
    public static int[] field2562;

    @ObfuscatedName("hv.s")
    public static int[] field2558;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2556[var1] = var0 - 1;
            var0 += var0;
        }
        field2562 = new int[4000];
        field2558 = new int[4000];
    }

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.z(II)I")
    public static int method552(int arg0) {
        class259 var1 = class259.method3285(arg0);
        int var2 = var1.field3325;
        int var3 = var1.field3323;
        int var4 = var1.field3324;
        int var5 = field2556[var4 - var3];
        return field2558[var2] >> var3 & var5;
    }

    @ObfuscatedName("ht.k(III)V")
    public static void method3701(int arg0, int arg1) {
        class259 var2 = class259.method3285(arg0);
        int var3 = var2.field3325;
        int var4 = var2.field3323;
        int var5 = var2.field3324;
        int var6 = field2556[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2558[var3] = field2558[var3] & ~var7 | arg1 << var4 & var7;
    }
}
