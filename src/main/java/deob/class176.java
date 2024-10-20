package deob;

@ObfuscatedName("fo")
public class class176 {

    @ObfuscatedName("fo.j")
    public static int[] field2906 = new int[32];

    @ObfuscatedName("fo.l")
    public static int[] field2905;

    @ObfuscatedName("fo.a")
    public static int[] field2907;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2906[var1] = var0 - 1;
            var0 += var0;
        }
        field2905 = new int[2000];
        field2907 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.j(IB)I")
    public static int method2248(int arg0) {
        class48 var1 = class48.method781(arg0);
        int var2 = var1.field1068;
        int var3 = var1.field1069;
        int var4 = var1.field1070;
        int var5 = field2906[var4 - var3];
        return field2907[var2] >> var3 & var5;
    }

    @ObfuscatedName("ck.l(III)V")
    public static void method2115(int arg0, int arg1) {
        class48 var2 = class48.method781(arg0);
        int var3 = var2.field1068;
        int var4 = var2.field1069;
        int var5 = var2.field1070;
        int var6 = field2906[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2907[var3] = field2907[var3] & ~var7 | arg1 << var4 & var7;
    }
}
