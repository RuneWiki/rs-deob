package deob;

@ObfuscatedName("fh")
public class class167 {

    @ObfuscatedName("fh.y")
    public static int[] field2818 = new int[32];

    @ObfuscatedName("fh.k")
    public static int[] field2817;

    @ObfuscatedName("fh.g")
    public static int[] field2816;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2818[var1] = var0 - 1;
            var0 += var0;
        }
        field2817 = new int[2000];
        field2816 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.y(II)I")
    public static int method14(int arg0) {
        class44 var1 = Statics.method3527(arg0);
        int var2 = var1.field1011;
        int var3 = var1.field1008;
        int var4 = var1.field1009;
        int var5 = field2818[var4 - var3];
        return field2816[var2] >> var3 & var5;
    }
}
