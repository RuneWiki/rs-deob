package deob;

@ObfuscatedName("fy")
public class class176 {

    @ObfuscatedName("fy.d")
    public static int[] field2889 = new int[32];

    @ObfuscatedName("fy.p")
    public static int[] field2888;

    @ObfuscatedName("fy.v")
    public static int[] field2893;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2889[var1] = var0 - 1;
            var0 += var0;
        }
        field2888 = new int[2000];
        field2893 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.d(II)I")
    public static int method3020(int arg0) {
        class48 var1 = class48.method3172(arg0);
        int var2 = var1.field1071;
        int var3 = var1.field1069;
        int var4 = var1.field1078;
        int var5 = field2889[var4 - var3];
        return field2893[var2] >> var3 & var5;
    }

    @ObfuscatedName("ev.p(IIB)V")
    public static void method2980(int arg0, int arg1) {
        class48 var2 = class48.method3172(arg0);
        int var3 = var2.field1071;
        int var4 = var2.field1069;
        int var5 = var2.field1078;
        int var6 = field2889[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2893[var3] = field2893[var3] & ~var7 | arg1 << var4 & var7;
    }
}
