package deob;

@ObfuscatedName("fz")
public class class177 {

    @ObfuscatedName("fz.t")
    public static int[] field2927 = new int[32];

    @ObfuscatedName("fz.i")
    public static int[] field2925;

    @ObfuscatedName("fz.g")
    public static int[] field2924;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2927[var1] = var0 - 1;
            var0 += var0;
        }
        field2925 = new int[2000];
        field2924 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.t(II)I")
    public static int method135(int arg0) {
        class48 var1 = (class48) class48.field1073.method3453((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1077.method3002(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method918(new class120(var3));
            }
            class48.field1073.method3461(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1074;
        int var7 = var2.field1075;
        int var8 = var2.field1079;
        int var9 = field2927[var8 - var7];
        return field2924[var6] >> var7 & var9;
    }
}
