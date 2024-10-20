package deob;

@ObfuscatedName("fq")
public class class166 {

    @ObfuscatedName("fq.x")
    public static int[] field2157 = new int[32];

    @ObfuscatedName("fq.j")
    public static int[] field2153;

    @ObfuscatedName("fq.c")
    public static int[] field2154;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2157[var1] = var0 - 1;
            var0 += var0;
        }
        field2153 = new int[2000];
        field2154 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.x(IS)I")
    public static int method1852(int arg0) {
        class195 var1 = class195.method2993(arg0);
        int var2 = var1.field2845;
        int var3 = var1.field2848;
        int var4 = var1.field2849;
        int var5 = field2157[var4 - var3];
        return field2154[var2] >> var3 & var5;
    }
}
