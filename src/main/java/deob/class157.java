package deob;

@ObfuscatedName("fc")
public class class157 {

    @ObfuscatedName("fc.f")
    public static int[] field2682 = new int[32];

    @ObfuscatedName("fc.k")
    public static int[] field2679;

    @ObfuscatedName("fc.y")
    public static int[] field2680;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2682[var1] = var0 - 1;
            var0 += var0;
        }
        field2679 = new int[2000];
        field2680 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.f(II)I")
    public static int method33(int arg0) {
        class43 var1 = (class43) class43.field991.method3207((long) arg0);
        class43 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1001.method2763(14, arg0);
            class43 var4 = new class43();
            if (var3 != null) {
                var4.method860(new class108(var3));
            }
            class43.field991.method3209(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field992;
        int var7 = var2.field1000;
        int var8 = var2.field994;
        int var9 = field2682[var8 - var7];
        return field2680[var6] >> var7 & var9;
    }

    @ObfuscatedName("ak.k(IIB)V")
    public static void method728(int arg0, int arg1) {
        class43 var2 = (class43) class43.field991.method3207((long) arg0);
        class43 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1001.method2763(14, arg0);
            class43 var5 = new class43();
            if (var4 != null) {
                var5.method860(new class108(var4));
            }
            class43.field991.method3209(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field992;
        int var8 = var3.field1000;
        int var9 = var3.field994;
        int var10 = field2682[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2680[var7] = field2680[var7] & ~var11 | arg1 << var8 & var11;
    }
}
