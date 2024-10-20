package deob;

@ObfuscatedName("fb")
public class class159 {

    @ObfuscatedName("fb.p")
    public static int[] field2707 = new int[32];

    @ObfuscatedName("fb.i")
    public static int[] field2702;

    @ObfuscatedName("fb.o")
    public static int[] field2703;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2707[var1] = var0 - 1;
            var0 += var0;
        }
        field2702 = new int[2000];
        field2703 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.p(II)I")
    public static int method1349(int arg0) {
        class38 var1 = class38.method137(arg0);
        int var2 = var1.field963;
        int var3 = var1.field962;
        int var4 = var1.field969;
        int var5 = field2707[var4 - var3];
        return field2703[var2] >> var3 & var5;
    }
}
