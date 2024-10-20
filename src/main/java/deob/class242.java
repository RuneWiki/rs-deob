package deob;

@ObfuscatedName("ik")
public class class242 {

    @ObfuscatedName("ik.v")
    public static int[] field2920 = new int[32];

    @ObfuscatedName("ik.n")
    public static int[] field2919;

    @ObfuscatedName("ik.f")
    public static int[] field2918;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2920[var1] = var0 - 1;
            var0 += var0;
        }
        field2919 = new int[4000];
        field2918 = new int[4000];
    }

    public class242() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.v(II)I")
    public static int method3569(int arg0) {
        class150 var1 = class150.method5733(arg0);
        int var2 = var1.field1705;
        int var3 = var1.field1707;
        int var4 = var1.field1706;
        int var5 = field2920[var4 - var3];
        return field2918[var2] >> var3 & var5;
    }

    @ObfuscatedName("ct.n(III)V")
    public static void method1768(int arg0, int arg1) {
        class150 var2 = (class150) class150.field1704.method3948((long) arg0);
        class150 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1708.method4468(14, arg0);
            class150 var5 = new class150();
            if (var4 != null) {
                var5.method2600(new class383(var4));
            }
            class150.field1704.method3947(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1705;
        int var8 = var3.field1707;
        int var9 = var3.field1706;
        int var10 = field2920[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2918[var7] = field2918[var7] & ~var11 | arg1 << var8 & var11;
    }
}
