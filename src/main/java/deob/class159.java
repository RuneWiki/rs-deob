package deob;

@ObfuscatedName("fu")
public class class159 {

    @ObfuscatedName("fu.x")
    public static int[] field2695 = new int[32];

    @ObfuscatedName("fu.p")
    public static int[] field2691;

    @ObfuscatedName("fu.k")
    public static int[] field2696;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2695[var1] = var0 - 1;
            var0 += var0;
        }
        field2691 = new int[2000];
        field2696 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.x(II)I")
    public static int method1498(int arg0) {
        class38 var1 = class38.method1545(arg0);
        int var2 = var1.field932;
        int var3 = var1.field934;
        int var4 = var1.field933;
        int var5 = field2695[var4 - var3];
        return field2696[var2] >> var3 & var5;
    }
}
