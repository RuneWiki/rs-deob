package deob;

@ObfuscatedName("fi")
public class class167 {

    @ObfuscatedName("fi.b")
    public static int[] field2790 = new int[32];

    @ObfuscatedName("fi.e")
    public static int[] field2785;

    @ObfuscatedName("fi.a")
    public static int[] field2786;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2790[var1] = var0 - 1;
            var0 += var0;
        }
        field2785 = new int[2000];
        field2786 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.b(II)I")
    public static int method931(int arg0) {
        class44 var1 = class44.method110(arg0);
        int var2 = var1.field989;
        int var3 = var1.field991;
        int var4 = var1.field998;
        int var5 = field2790[var4 - var3];
        return field2786[var2] >> var3 & var5;
    }
}
