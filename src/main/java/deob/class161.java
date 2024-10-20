package deob;

@ObfuscatedName("fq")
public class class161 {

    @ObfuscatedName("fq.l")
    public static int[] field2737 = new int[32];

    @ObfuscatedName("fq.b")
    public static int[] field2735;

    @ObfuscatedName("fq.o")
    public static int[] field2736;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2737[var1] = var0 - 1;
            var0 += var0;
        }
        field2735 = new int[2000];
        field2736 = new int[2000];
    }

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.l(II)I")
    public static int method3138(int arg0) {
        class38 var1 = class38.method791(arg0);
        int var2 = var1.field948;
        int var3 = var1.field952;
        int var4 = var1.field950;
        int var5 = field2737[var4 - var3];
        return field2736[var2] >> var3 & var5;
    }

    @ObfuscatedName("bk.b(III)V")
    public static void method1525(int arg0, int arg1) {
        class38 var2 = class38.method791(arg0);
        int var3 = var2.field948;
        int var4 = var2.field952;
        int var5 = var2.field950;
        int var6 = field2737[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2736[var3] = field2736[var3] & ~var7 | arg1 << var4 & var7;
    }
}
