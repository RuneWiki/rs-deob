package deob;

@ObfuscatedName("fw")
public class class159 {

    @ObfuscatedName("fw.t")
    public static int[] field2712 = new int[32];

    @ObfuscatedName("fw.l")
    public static int[] field2711;

    @ObfuscatedName("fw.c")
    public static int[] field2713;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2712[var1] = var0 - 1;
            var0 += var0;
        }
        field2711 = new int[2000];
        field2713 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.t(IB)I")
    public static int method2232(int arg0) {
        class38 var1 = class38.method43(arg0);
        int var2 = var1.field980;
        int var3 = var1.field974;
        int var4 = var1.field978;
        int var5 = field2712[var4 - var3];
        return field2713[var2] >> var3 & var5;
    }
}
