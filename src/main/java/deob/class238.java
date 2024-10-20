package deob;

@ObfuscatedName("ih")
public class class238 {

    @ObfuscatedName("ih.c")
    public static int[] field2772 = new int[32];

    @ObfuscatedName("ih.i")
    public static int[] field2773;

    @ObfuscatedName("ih.o")
    public static int[] field2771;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2772[var1] = var0 - 1;
            var0 += var0;
        }
        field2773 = new int[2000];
        field2771 = new int[2000];
    }

    public class238() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.c(II)I")
    public static int method1710(int arg0) {
        class278 var1 = class278.method4830(arg0);
        int var2 = var1.field3536;
        int var3 = var1.field3539;
        int var4 = var1.field3540;
        int var5 = field2772[var4 - var3];
        return field2771[var2] >> var3 & var5;
    }

    @ObfuscatedName("bj.i(III)V")
    public static void method714(int arg0, int arg1) {
        class278 var2 = class278.method4830(arg0);
        int var3 = var2.field3536;
        int var4 = var2.field3539;
        int var5 = var2.field3540;
        int var6 = field2772[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2771[var3] = field2771[var3] & ~var7 | arg1 << var4 & var7;
    }
}
