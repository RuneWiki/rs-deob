package deob;

@ObfuscatedName("kg")
public class class293 {

    @ObfuscatedName("kg.a")
    public static int[] field3393 = new int[32];

    @ObfuscatedName("kg.f")
    public static int[] field3389;

    @ObfuscatedName("kg.c")
    public static int[] field3391;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3393[var1] = var0 - 1;
            var0 += var0;
        }
        field3389 = new int[4000];
        field3391 = new int[4000];
    }

    public class293() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.a(IB)I")
    public static int method1999(int arg0) {
        class190 var1 = Statics.method7578(arg0);
        int var2 = var1.field2037;
        int var3 = var1.field2038;
        int var4 = var1.field2040;
        int var5 = field3393[var4 - var3];
        return field3391[var2] >> var3 & var5;
    }

    @ObfuscatedName("ot.f(III)V")
    public static void method6846(int arg0, int arg1) {
        class190 var2 = Statics.method7578(arg0);
        int var3 = var2.field2037;
        int var4 = var2.field2038;
        int var5 = var2.field2040;
        int var6 = field3393[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3391[var3] = field3391[var3] & ~var7 | arg1 << var4 & var7;
    }
}
