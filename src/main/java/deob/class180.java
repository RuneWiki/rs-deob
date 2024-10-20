package deob;

@ObfuscatedName("fk")
public class class180 {

    @ObfuscatedName("fk.k")
    public static int[] field2954 = new int[32];

    @ObfuscatedName("fk.q")
    public static int[] field2951;

    @ObfuscatedName("fk.f")
    public static int[] field2953;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2954[var1] = var0 - 1;
            var0 += var0;
        }
        field2951 = new int[2000];
        field2953 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.k(II)I")
    public static int method3744(int arg0) {
        class51 var1 = class51.method3717(arg0);
        int var2 = var1.field1104;
        int var3 = var1.field1102;
        int var4 = var1.field1106;
        int var5 = field2954[var4 - var3];
        return field2953[var2] >> var3 & var5;
    }

    @ObfuscatedName("ah.q(III)V")
    public static void method980(int arg0, int arg1) {
        class51 var2 = class51.method3717(arg0);
        int var3 = var2.field1104;
        int var4 = var2.field1102;
        int var5 = var2.field1106;
        int var6 = field2954[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2953[var3] = field2953[var3] & ~var7 | arg1 << var4 & var7;
    }
}
