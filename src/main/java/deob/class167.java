package deob;

@ObfuscatedName("fm")
public class class167 {

    @ObfuscatedName("fm.n")
    public static int[] field2800 = new int[32];

    @ObfuscatedName("fm.w")
    public static int[] field2799;

    @ObfuscatedName("fm.i")
    public static int[] field2805;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2800[var1] = var0 - 1;
            var0 += var0;
        }
        field2799 = new int[2000];
        field2805 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.n(II)I")
    public static int method1895(int arg0) {
        class44 var1 = (class44) class44.field1004.method3315((long) arg0);
        class44 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field753.method2859(14, arg0);
            class44 var4 = new class44();
            if (var3 != null) {
                var4.method855(new class111(var3));
            }
            class44.field1004.method3317(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1003;
        int var7 = var2.field1005;
        int var8 = var2.field1006;
        int var9 = field2800[var8 - var7];
        return field2805[var6] >> var7 & var9;
    }
}
