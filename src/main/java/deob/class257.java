package deob;

@ObfuscatedName("ia")
public class class257 {

    @ObfuscatedName("ia.n")
    public static int[] field3003 = new int[32];

    @ObfuscatedName("ia.c")
    public static int[] field3000;

    @ObfuscatedName("ia.m")
    public static int[] field3001;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3003[var1] = var0 - 1;
            var0 += var0;
        }
        field3000 = new int[4000];
        field3001 = new int[4000];
    }

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("is.n(IB)I")
    public static int method4239(int arg0) {
        class165 var1 = Statics.method3466(arg0);
        int var2 = var1.field1785;
        int var3 = var1.field1780;
        int var4 = var1.field1781;
        int var5 = field3003[var4 - var3];
        return field3001[var2] >> var3 & var5;
    }

    @ObfuscatedName("af.c(III)V")
    public static void method976(int arg0, int arg1) {
        class165 var2 = Statics.method3466(arg0);
        int var3 = var2.field1785;
        int var4 = var2.field1780;
        int var5 = var2.field1781;
        int var6 = field3003[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3001[var3] = field3001[var3] & ~var7 | arg1 << var4 & var7;
    }
}
