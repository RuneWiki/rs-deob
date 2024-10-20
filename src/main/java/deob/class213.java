package deob;

@ObfuscatedName("hc")
public class class213 {

    @ObfuscatedName("hc.c")
    public static int[] field2492 = new int[32];

    @ObfuscatedName("hc.x")
    public static int[] field2493;

    @ObfuscatedName("hc.t")
    public static int[] field2494;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2492[var1] = var0 - 1;
            var0 += var0;
        }
        field2493 = new int[4000];
        field2494 = new int[4000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.c(II)I")
    public static int method504(int arg0) {
        class249 var1 = class249.method3366(arg0);
        int var2 = var1.field3275;
        int var3 = var1.field3276;
        int var4 = var1.field3274;
        int var5 = field2492[var4 - var3];
        return field2494[var2] >> var3 & var5;
    }

    @ObfuscatedName("ak.x(IIB)V")
    public static void method593(int arg0, int arg1) {
        class249 var2 = class249.method3366(arg0);
        int var3 = var2.field3275;
        int var4 = var2.field3276;
        int var5 = var2.field3274;
        int var6 = field2492[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2494[var3] = field2494[var3] & ~var7 | arg1 << var4 & var7;
    }
}
