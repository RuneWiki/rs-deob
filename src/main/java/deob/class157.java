package deob;

@ObfuscatedName("fu")
public class class157 {

    @ObfuscatedName("fu.c")
    public static int[] field2647 = new int[32];

    @ObfuscatedName("fu.j")
    public static int[] field2645;

    @ObfuscatedName("fu.f")
    public static int[] field2649;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2647[var1] = var0 - 1;
            var0 += var0;
        }
        field2645 = new int[2000];
        field2649 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.c(II)I")
    public static int method125(int arg0) {
        class37 var1 = (class37) class37.field940.method3087((long) arg0);
        class37 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field934.method2821(14, arg0);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method762(new class125(var3));
            }
            class37.field940.method3089(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field936;
        int var7 = var2.field935;
        int var8 = var2.field938;
        int var9 = field2647[var8 - var7];
        return field2649[var6] >> var7 & var9;
    }

    @ObfuscatedName("bt.j(IIB)V")
    public static void method1188(int arg0, int arg1) {
        class37 var2 = (class37) class37.field940.method3087((long) arg0);
        class37 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field934.method2821(14, arg0);
            class37 var5 = new class37();
            if (var4 != null) {
                var5.method762(new class125(var4));
            }
            class37.field940.method3089(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field936;
        int var8 = var3.field935;
        int var9 = var3.field938;
        int var10 = field2647[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2649[var7] = field2649[var7] & ~var11 | arg1 << var8 & var11;
    }
}
