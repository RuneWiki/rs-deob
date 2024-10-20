package deob;

@ObfuscatedName("fp")
public class class157 {

    @ObfuscatedName("fp.j")
    public static int[] field2645 = new int[32];

    @ObfuscatedName("fp.y")
    public static int[] field2646;

    @ObfuscatedName("fp.x")
    public static int[] field2647;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2645[var1] = var0 - 1;
            var0 += var0;
        }
        field2646 = new int[2000];
        field2647 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.j(IB)I")
    public static int method1999(int arg0) {
        class37 var1 = (class37) class37.field935.method3191((long) arg0);
        class37 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field940.method2903(14, arg0);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method787(new class126(var3));
            }
            class37.field935.method3181(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field936;
        int var7 = var2.field934;
        int var8 = var2.field938;
        int var9 = field2645[var8 - var7];
        return field2647[var6] >> var7 & var9;
    }

    @ObfuscatedName("bz.y(III)V")
    public static void method1205(int arg0, int arg1) {
        class37 var2 = (class37) class37.field935.method3191((long) arg0);
        class37 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field940.method2903(14, arg0);
            class37 var5 = new class37();
            if (var4 != null) {
                var5.method787(new class126(var4));
            }
            class37.field935.method3181(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field936;
        int var8 = var3.field934;
        int var9 = var3.field938;
        int var10 = field2645[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2647[var7] = field2647[var7] & ~var11 | arg1 << var8 & var11;
    }
}
