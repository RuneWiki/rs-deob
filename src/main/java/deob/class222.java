package deob;

@ObfuscatedName("hj")
public class class222 {

    @ObfuscatedName("hj.n")
    public static int[] field2557 = new int[32];

    @ObfuscatedName("hj.v")
    public static int[] field2555;

    @ObfuscatedName("hj.d")
    public static int[] field2556;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2557[var1] = var0 - 1;
            var0 += var0;
        }
        field2555 = new int[4000];
        field2556 = new int[4000];
    }

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kq.n(II)I")
    public static int method5065(int arg0) {
        class260 var1 = class260.method1081(arg0);
        int var2 = var1.field3327;
        int var3 = var1.field3328;
        int var4 = var1.field3329;
        int var5 = field2557[var4 - var3];
        return field2556[var2] >> var3 & var5;
    }

    @ObfuscatedName("at.v(III)V")
    public static void method334(int arg0, int arg1) {
        class260 var2 = class260.method1081(arg0);
        int var3 = var2.field3327;
        int var4 = var2.field3328;
        int var5 = var2.field3329;
        int var6 = field2557[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2556[var3] = field2556[var3] & ~var7 | arg1 << var4 & var7;
    }
}
