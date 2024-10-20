package deob;

@ObfuscatedName("hs")
public class class234 {

    @ObfuscatedName("hs.a")
    public static int[] field2646 = new int[32];

    @ObfuscatedName("hs.s")
    public static int[] field2647;

    @ObfuscatedName("hs.g")
    public static int[] field2648;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2646[var1] = var0 - 1;
            var0 += var0;
        }
        field2647 = new int[4000];
        field2648 = new int[4000];
    }

    public class234() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.a(IB)I")
    public static int method1611(int arg0) {
        class270 var1 = Statics.method2302(arg0);
        int var2 = var1.field3407;
        int var3 = var1.field3406;
        int var4 = var1.field3403;
        int var5 = field2646[var4 - var3];
        return field2648[var2] >> var3 & var5;
    }

    @ObfuscatedName("eu.s(III)V")
    public static void method3171(int arg0, int arg1) {
        class270 var2 = Statics.method2302(arg0);
        int var3 = var2.field3407;
        int var4 = var2.field3406;
        int var5 = var2.field3403;
        int var6 = field2646[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2648[var3] = field2648[var3] & ~var7 | arg1 << var4 & var7;
    }
}
