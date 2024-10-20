package deob;

@ObfuscatedName("fl")
public class class166 {

    @ObfuscatedName("fl.e")
    public static int[] field2751 = new int[32];

    @ObfuscatedName("fl.a")
    public static int[] field2752;

    @ObfuscatedName("fl.l")
    public static int[] field2753;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2751[var1] = var0 - 1;
            var0 += var0;
        }
        field2752 = new int[2000];
        field2753 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.e(II)I")
    public static int method40(int arg0) {
        class44 var1 = class44.method838(arg0);
        int var2 = var1.field964;
        int var3 = var1.field967;
        int var4 = var1.field968;
        int var5 = field2751[var4 - var3];
        return field2753[var2] >> var3 & var5;
    }
}
