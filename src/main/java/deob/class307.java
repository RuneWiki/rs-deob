package deob;

@ObfuscatedName("le")
public class class307 {

    @ObfuscatedName("le.af")
    public static int[] field3483 = new int[32];

    @ObfuscatedName("le.an")
    public static int[] field3481;

    @ObfuscatedName("le.aw")
    public static int[] field3482;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3483[var1] = var0 - 1;
            var0 += var0;
        }
        field3481 = new int[4000];
        field3482 = new int[4000];
    }

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jy.af(II)I")
    public static int method4941(int arg0) {
        class197 var1 = class197.method3150(arg0);
        int var2 = var1.field2107;
        int var3 = var1.field2106;
        int var4 = var1.field2103;
        int var5 = field3483[var4 - var3];
        return field3482[var2] >> var3 & var5;
    }

    @ObfuscatedName("kn.an(III)V")
    public static void method5133(int arg0, int arg1) {
        class197 var2 = class197.method3150(arg0);
        int var3 = var2.field2107;
        int var4 = var2.field2106;
        int var5 = var2.field2103;
        int var6 = field3483[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3482[var3] = field3482[var3] & ~var7 | arg1 << var4 & var7;
    }
}
