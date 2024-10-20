package deob;

@ObfuscatedName("fy")
public class class166 {

    @ObfuscatedName("fy.f")
    public static int[] field2183 = new int[32];

    @ObfuscatedName("fy.i")
    public static int[] field2180;

    @ObfuscatedName("fy.u")
    public static int[] field2181;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2183[var1] = var0 - 1;
            var0 += var0;
        }
        field2180 = new int[2000];
        field2181 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.f(II)I")
    public static int method561(int arg0) {
        class195 var1 = Statics.method202(arg0);
        int var2 = var1.field2860;
        int var3 = var1.field2859;
        int var4 = var1.field2856;
        int var5 = field2183[var4 - var3];
        return field2181[var2] >> var3 & var5;
    }
}
