package deob;

@ObfuscatedName("ew")
public class class147 {

    @ObfuscatedName("ew.n")
    public static int[] field2035 = new int[32];

    @ObfuscatedName("ew.d")
    public static int[] field2030;

    @ObfuscatedName("ew.m")
    public static int[] field2032;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2035[var1] = var0 - 1;
            var0 += var0;
        }
        field2030 = new int[2000];
        field2032 = new int[2000];
    }

    public class147() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.n(IB)I")
    public static int method748(int arg0) {
        class195 var1 = class195.method3079(arg0);
        int var2 = var1.field2851;
        int var3 = var1.field2849;
        int var4 = var1.field2853;
        int var5 = field2035[var4 - var3];
        return field2032[var2] >> var3 & var5;
    }
}
