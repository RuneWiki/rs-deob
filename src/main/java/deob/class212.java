package deob;

@ObfuscatedName("hu")
public class class212 {

    @ObfuscatedName("hu.c")
    public static int[] field2577 = new int[32];

    @ObfuscatedName("hu.o")
    public static int[] field2575;

    @ObfuscatedName("hu.i")
    public static int[] field2573;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2577[var1] = var0 - 1;
            var0 += var0;
        }
        field2575 = new int[2000];
        field2573 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.c(II)I")
    public static int method117(int arg0) {
        class251 var1 = class251.method2672(arg0);
        int var2 = var1.field3356;
        int var3 = var1.field3357;
        int var4 = var1.field3358;
        int var5 = field2577[var4 - var3];
        return field2573[var2] >> var3 & var5;
    }
}
