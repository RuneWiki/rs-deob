package deob;

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.i")
    public static int[] field2613 = new int[32];

    @ObfuscatedName("he.c")
    public static int[] field2607;

    @ObfuscatedName("he.e")
    public static int[] field2609;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2613[var1] = var0 - 1;
            var0 += var0;
        }
        field2607 = new int[2000];
        field2609 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.i(IB)I")
    public static int method2144(int arg0) {
        class251 var1 = (class251) class251.field3380.method3220((long) arg0);
        class251 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3381.method3769(14, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method4074(new class174(var3));
            }
            class251.field3380.method3222(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3379;
        int var7 = var2.field3382;
        int var8 = var2.field3383;
        int var9 = field2613[var8 - var7];
        return field2609[var6] >> var7 & var9;
    }
}
