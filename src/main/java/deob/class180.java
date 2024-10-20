package deob;

@ObfuscatedName("fd")
public class class180 {

    @ObfuscatedName("fd.i")
    public static int[] field2956 = new int[32];

    @ObfuscatedName("fd.h")
    public static int[] field2957;

    @ObfuscatedName("fd.e")
    public static int[] field2955;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2956[var1] = var0 - 1;
            var0 += var0;
        }
        field2957 = new int[2000];
        field2955 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.i(II)I")
    public static int method123(int arg0) {
        class51 var1 = class51.method3522(arg0);
        int var2 = var1.field1096;
        int var3 = var1.field1095;
        int var4 = var1.field1098;
        int var5 = field2956[var4 - var3];
        return field2955[var2] >> var3 & var5;
    }

    @ObfuscatedName("ex.h(III)V")
    public static void method2865(int arg0, int arg1) {
        class51 var2 = class51.method3522(arg0);
        int var3 = var2.field1096;
        int var4 = var2.field1095;
        int var5 = var2.field1098;
        int var6 = field2956[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2955[var3] = field2955[var3] & ~var7 | arg1 << var4 & var7;
    }
}
