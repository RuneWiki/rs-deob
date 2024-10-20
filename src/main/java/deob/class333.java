package deob;

@ObfuscatedName("mg")
public class class333 {

    @ObfuscatedName("mg.at")
    public static int[] field3555 = new int[32];

    @ObfuscatedName("mg.ar")
    public static int[] field3551;

    @ObfuscatedName("mg.ao")
    public static int[] field3554;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3555[var1] = var0 - 1;
            var0 += var0;
        }
        field3551 = new int[5000];
        field3554 = new int[5000];
    }

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.at(II)I")
    public static int method2521(int arg0) {
        class197 var1 = class197.method2516(arg0);
        int var2 = var1.field2030;
        int var3 = var1.field2027;
        int var4 = var1.field2028;
        int var5 = field3555[var4 - var3];
        return field3554[var2] >> var3 & var5;
    }

    @ObfuscatedName("ly.ah(III)V")
    public static void method5310(int arg0, int arg1) {
        class197 var2 = class197.method2516(arg0);
        int var3 = var2.field2030;
        int var4 = var2.field2027;
        int var5 = var2.field2028;
        int var6 = field3555[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3554[var3] = field3554[var3] & ~var7 | arg1 << var4 & var7;
    }
}
