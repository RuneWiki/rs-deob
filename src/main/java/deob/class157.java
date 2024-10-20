package deob;

@ObfuscatedName("fa")
public class class157 {

    @ObfuscatedName("fa.e")
    public static int[] field2683 = new int[32];

    @ObfuscatedName("fa.v")
    public static int[] field2677;

    @ObfuscatedName("fa.k")
    public static int[] field2678;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2683[var1] = var0 - 1;
            var0 += var0;
        }
        field2677 = new int[2000];
        field2678 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.e(II)I")
    public static int method82(int arg0) {
        class43 var1 = class43.method534(arg0);
        int var2 = var1.field998;
        int var3 = var1.field1000;
        int var4 = var1.field995;
        int var5 = field2683[var4 - var3];
        return field2678[var2] >> var3 & var5;
    }
}
