package deob;

@ObfuscatedName("fs")
public class class176 {

    @ObfuscatedName("fs.n")
    public static int[] field2900 = new int[32];

    @ObfuscatedName("fs.q")
    public static int[] field2898;

    @ObfuscatedName("fs.c")
    public static int[] field2896;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2900[var1] = var0 - 1;
            var0 += var0;
        }
        field2898 = new int[2000];
        field2896 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.n(IB)I")
    public static int method2038(int arg0) {
        class48 var1 = class48.method3228(arg0);
        int var2 = var1.field1070;
        int var3 = var1.field1071;
        int var4 = var1.field1072;
        int var5 = field2900[var4 - var3];
        return field2896[var2] >> var3 & var5;
    }

    @ObfuscatedName("ci.q(III)V")
    public static void method2042(int arg0, int arg1) {
        class48 var2 = class48.method3228(arg0);
        int var3 = var2.field1070;
        int var4 = var2.field1071;
        int var5 = var2.field1072;
        int var6 = field2900[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2896[var3] = field2896[var3] & ~var7 | arg1 << var4 & var7;
    }
}
