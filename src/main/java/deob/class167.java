package deob;

@ObfuscatedName("fv")
public class class167 {

    @ObfuscatedName("fv.n")
    public static int[] field2804 = new int[32];

    @ObfuscatedName("fv.d")
    public static int[] field2799;

    @ObfuscatedName("fv.z")
    public static int[] field2801;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2804[var1] = var0 - 1;
            var0 += var0;
        }
        field2799 = new int[2000];
        field2801 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.n(IB)I")
    public static int method175(int arg0) {
        class44 var1 = class44.method2618(arg0);
        int var2 = var1.field1008;
        int var3 = var1.field1010;
        int var4 = var1.field1011;
        int var5 = field2804[var4 - var3];
        return field2801[var2] >> var3 & var5;
    }
}
