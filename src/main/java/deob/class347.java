package deob;

@ObfuscatedName("no")
public class class347 {

    @ObfuscatedName("no.aq")
    public static int[] field3730 = new int[32];

    @ObfuscatedName("no.ag")
    public static int[] field3729;

    @ObfuscatedName("no.ak")
    public static int[] field3731;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3730[var1] = var0 - 1;
            var0 += var0;
        }
        field3729 = new int[5000];
        field3731 = new int[5000];
    }

    public class347() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.aq(IB)I")
    public static int method3186(int arg0) {
        class201 var1 = class201.method2256(arg0);
        int var2 = var1.field2110;
        int var3 = var1.field2106;
        int var4 = var1.field2107;
        int var5 = field3730[var4 - var3];
        return field3731[var2] >> var3 & var5;
    }

    @ObfuscatedName("ia.ad(III)V")
    public static void method3989(int arg0, int arg1) {
        class201 var2 = class201.method2256(arg0);
        int var3 = var2.field2110;
        int var4 = var2.field2106;
        int var5 = var2.field2107;
        int var6 = field3730[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3731[var3] = field3731[var3] & ~var7 | arg1 << var4 & var7;
    }
}
