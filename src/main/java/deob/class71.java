package deob;

@ObfuscatedName("fd")
public class class71 {

    @ObfuscatedName("fd.b")
    public static int[] field796 = new int[32];

    @ObfuscatedName("fd.k")
    public static int[] field800;

    @ObfuscatedName("fd.h")
    public static int[] field797;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field796[var1] = var0 - 1;
            var0 += var0;
        }
        field797 = new int[2000];
        field800 = new int[2000];
    }

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fh.h(IIB)V")
    public static void method166(int arg0, int arg1) {
        class169 var2 = (class169) class169.field2507.method1((long) arg0);
        class169 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2511.method1266(14, arg0);
            class169 var5 = new class169();
            if (var4 != null) {
                var5.method2932(new class50(var4));
            }
            class169.field2507.method4(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2508;
        int var8 = var3.field2509;
        int var9 = var3.field2510;
        int var10 = field796[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field800[var7] = field800[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("bv.b(II)I")
    public static int method2005(int arg0) {
        class169 var1 = (class169) class169.field2507.method1((long) arg0);
        class169 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2511.method1266(14, arg0);
            class169 var4 = new class169();
            if (var3 != null) {
                var4.method2932(new class50(var3));
            }
            class169.field2507.method4(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2508;
        int var7 = var2.field2509;
        int var8 = var2.field2510;
        int var9 = field796[var8 - var7];
        return field800[var6] >> var7 & var9;
    }
}
