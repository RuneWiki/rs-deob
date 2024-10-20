package deob;

@ObfuscatedName("fj")
public class class159 {

    @ObfuscatedName("fj.p")
    public static int[] field2679 = new int[32];

    @ObfuscatedName("fj.y")
    public static int[] field2681;

    @ObfuscatedName("fj.d")
    public static int[] field2680;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2679[var1] = var0 - 1;
            var0 += var0;
        }
        field2681 = new int[2000];
        field2680 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.p(II)I")
    public static int method2859(int arg0) {
        class43 var1 = class43.method2849(arg0);
        int var2 = var1.field955;
        int var3 = var1.field964;
        int var4 = var1.field957;
        int var5 = field2679[var4 - var3];
        return field2680[var2] >> var3 & var5;
    }

    @ObfuscatedName("aa.y(IIB)V")
    public static void method1043(int arg0, int arg1) {
        class43 var2 = class43.method2849(arg0);
        int var3 = var2.field955;
        int var4 = var2.field964;
        int var5 = var2.field957;
        int var6 = field2679[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2680[var3] = field2680[var3] & ~var7 | arg1 << var4 & var7;
    }
}
