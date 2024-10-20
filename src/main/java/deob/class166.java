package deob;

@ObfuscatedName("fe")
public class class166 {

    @ObfuscatedName("fe.s")
    public static int[] field2174 = new int[32];

    @ObfuscatedName("fe.c")
    public static int[] field2175;

    @ObfuscatedName("fe.f")
    public static int[] field2176;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2174[var1] = var0 - 1;
            var0 += var0;
        }
        field2175 = new int[2000];
        field2176 = new int[2000];
    }

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.s(IB)I")
    public static int method175(int arg0) {
        class195 var1 = Statics.method1913(arg0);
        int var2 = var1.field2854;
        int var3 = var1.field2852;
        int var4 = var1.field2856;
        int var5 = field2174[var4 - var3];
        return field2176[var2] >> var3 & var5;
    }
}
