package deob;

@ObfuscatedName("fj")
public class class160 {

    @ObfuscatedName("fj.b")
    public static int[] field2740 = new int[32];

    @ObfuscatedName("fj.c")
    public static int[] field2739;

    @ObfuscatedName("fj.j")
    public static int[] field2742;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2740[var1] = var0 - 1;
            var0 += var0;
        }
        field2739 = new int[2000];
        field2742 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.b(II)I")
    public static int method1338(int arg0) {
        class38 var1 = (class38) class38.field952.method3188((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field957.method2964(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method795(new class127(var3));
            }
            class38.field952.method3190(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field954;
        int var7 = var2.field955;
        int var8 = var2.field956;
        int var9 = field2740[var8 - var7];
        return field2742[var6] >> var7 & var9;
    }

    @ObfuscatedName("ce.c(III)V")
    public static void method1642(int arg0, int arg1) {
        class38 var2 = (class38) class38.field952.method3188((long) arg0);
        class38 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field957.method2964(14, arg0);
            class38 var5 = new class38();
            if (var4 != null) {
                var5.method795(new class127(var4));
            }
            class38.field952.method3190(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field954;
        int var8 = var3.field955;
        int var9 = var3.field956;
        int var10 = field2740[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2742[var7] = field2742[var7] & ~var11 | arg1 << var8 & var11;
    }
}
