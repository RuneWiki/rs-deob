package deob;

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.n")
    public static int[] field2616 = new int[32];

    @ObfuscatedName("he.p")
    public static int[] field2613;

    @ObfuscatedName("he.i")
    public static int[] field2615;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2616[var1] = var0 - 1;
            var0 += var0;
        }
        field2613 = new int[2000];
        field2615 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.n(II)I")
    public static int method3578(int arg0) {
        class251 var1 = class251.method110(arg0);
        int var2 = var1.field3383;
        int var3 = var1.field3381;
        int var4 = var1.field3384;
        int var5 = field2616[var4 - var3];
        return field2615[var2] >> var3 & var5;
    }
}
