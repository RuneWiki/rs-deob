package deob;

@ObfuscatedName("ea")
public class class147 {

    @ObfuscatedName("ea.k")
    public static int[] field2014 = new int[32];

    @ObfuscatedName("ea.y")
    public static int[] field2010;

    @ObfuscatedName("ea.o")
    public static int[] field2012;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2014[var1] = var0 - 1;
            var0 += var0;
        }
        field2010 = new int[2000];
        field2012 = new int[2000];
    }

    public class147() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.k(II)I")
    public static int method128(int arg0) {
        class195 var1 = class195.method14(arg0);
        int var2 = var1.field2832;
        int var3 = var1.field2833;
        int var4 = var1.field2837;
        int var5 = field2014[var4 - var3];
        return field2012[var2] >> var3 & var5;
    }
}
