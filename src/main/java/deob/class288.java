package deob;

@ObfuscatedName("kr")
public class class288 {

    @ObfuscatedName("kr.c")
    public static int[] field3324 = new int[32];

    @ObfuscatedName("kr.v")
    public static int[] field3325;

    @ObfuscatedName("kr.q")
    public static int[] field3326;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3324[var1] = var0 - 1;
            var0 += var0;
        }
        field3325 = new int[4000];
        field3326 = new int[4000];
    }

    public class288() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nu.c(IB)I")
    public static int method6395(int arg0) {
        class183 var1 = class183.method4608(arg0);
        int var2 = var1.field1995;
        int var3 = var1.field2003;
        int var4 = var1.field1998;
        int var5 = field3324[var4 - var3];
        return field3326[var2] >> var3 & var5;
    }

    @ObfuscatedName("jt.v(III)V")
    public static void method4715(int arg0, int arg1) {
        class183 var2 = class183.method4608(arg0);
        int var3 = var2.field1995;
        int var4 = var2.field2003;
        int var5 = var2.field1998;
        int var6 = field3324[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3326[var3] = field3326[var3] & ~var7 | arg1 << var4 & var7;
    }
}
