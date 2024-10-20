package deob;

@ObfuscatedName("kb")
public class class290 {

    @ObfuscatedName("kb.c")
    public static int[] field3344 = new int[32];

    @ObfuscatedName("kb.p")
    public static int[] field3347;

    @ObfuscatedName("kb.f")
    public static int[] field3346;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3344[var1] = var0 - 1;
            var0 += var0;
        }
        field3347 = new int[4000];
        field3346 = new int[4000];
    }

    public class290() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.c(II)I")
    public static int method2609(int arg0) {
        class184 var1 = (class184) class184.field2021.method4789((long) arg0);
        class184 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2026.method5499(14, arg0);
            class184 var4 = new class184();
            if (var3 != null) {
                var4.method3338(new class445(var3));
            }
            class184.field2021.method4781(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2022;
        int var7 = var2.field2023;
        int var8 = var2.field2024;
        int var9 = field3344[var8 - var7];
        return field3346[var6] >> var7 & var9;
    }

    @ObfuscatedName("p.p(IIB)V")
    public static void method10(int arg0, int arg1) {
        class184 var2 = (class184) class184.field2021.method4789((long) arg0);
        class184 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2026.method5499(14, arg0);
            class184 var5 = new class184();
            if (var4 != null) {
                var5.method3338(new class445(var4));
            }
            class184.field2021.method4781(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2022;
        int var8 = var3.field2023;
        int var9 = var3.field2024;
        int var10 = field3344[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3346[var7] = field3346[var7] & ~var11 | arg1 << var8 & var11;
    }
}
