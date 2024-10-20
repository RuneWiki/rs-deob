package deob;

@ObfuscatedName("cv")
public class class89 {

    @ObfuscatedName("cv.t")
    public static int[] field1204 = new int[32];

    @ObfuscatedName("cv.n")
    public static int[] field1203;

    @ObfuscatedName("cv.q")
    public static int[] field1205;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1204[var1] = var0 - 1;
            var0 += var0;
        }
        field1203 = new int[2000];
        field1205 = new int[2000];
    }

    public class89() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.n(III)V")
    public static void method1316(int arg0, int arg1) {
        class159 var2 = (class159) class159.field2410.method1231((long) arg0);
        class159 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2411.method1015(14, arg0);
            class159 var5 = new class159();
            if (var4 != null) {
                var5.method2477(new class135(var4));
            }
            class159.field2410.method1232(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2412;
        int var8 = var3.field2415;
        int var9 = var3.field2414;
        int var10 = field1204[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field1205[var7] = field1205[var7] & ~var11 | arg1 << var8 & var11;
    }
}
