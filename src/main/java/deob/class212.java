package deob;

@ObfuscatedName("hp")
public class class212 {

    @ObfuscatedName("hp.i")
    public static int[] field2598 = new int[32];

    @ObfuscatedName("hp.h")
    public static int[] field2596;

    @ObfuscatedName("hp.u")
    public static int[] field2597;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2598[var1] = var0 - 1;
            var0 += var0;
        }
        field2596 = new int[2000];
        field2597 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.i(IB)I")
    public static int method1417(int arg0) {
        class251 var1 = class251.method53(arg0);
        int var2 = var1.field3375;
        int var3 = var1.field3376;
        int var4 = var1.field3377;
        int var5 = field2598[var4 - var3];
        return field2597[var2] >> var3 & var5;
    }
}
