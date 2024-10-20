package deob;

@ObfuscatedName("fn")
public class class176 {

    @ObfuscatedName("fn.n")
    public static int[] field2887 = new int[32];

    @ObfuscatedName("fn.d")
    public static int[] field2885;

    @ObfuscatedName("fn.s")
    public static int[] field2886;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2887[var1] = var0 - 1;
            var0 += var0;
        }
        field2885 = new int[2000];
        field2886 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.n(IB)I")
    public static int method3086(int arg0) {
        class48 var1 = (class48) class48.field1047.method3478((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1054.method3010(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method934(new class119(var3));
            }
            class48.field1047.method3481(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1053;
        int var7 = var2.field1049;
        int var8 = var2.field1050;
        int var9 = field2887[var8 - var7];
        return field2886[var6] >> var7 & var9;
    }
}
