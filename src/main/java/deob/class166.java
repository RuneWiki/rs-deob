package deob;

@ObfuscatedName("fl")
public class class166 {

    @ObfuscatedName("fl.b")
    public static int[] field2156 = new int[32];

    @ObfuscatedName("fl.e")
    public static int[] field2157;

    @ObfuscatedName("fl.c")
    public static int[] field2158;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2156[var1] = var0 - 1;
            var0 += var0;
        }
        field2157 = new int[2000];
        field2158 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.b(IB)I")
    public static int method916(int arg0) {
        class195 var1 = class195.method623(arg0);
        int var2 = var1.field2857;
        int var3 = var1.field2863;
        int var4 = var1.field2859;
        int var5 = field2156[var4 - var3];
        return field2158[var2] >> var3 & var5;
    }
}
