package deob;

@ObfuscatedName("hi")
public class class219 {

    @ObfuscatedName("hi.b")
    public static int[] field2681 = new int[32];

    @ObfuscatedName("hi.s")
    public static int[] field2679;

    @ObfuscatedName("hi.r")
    public static int[] field2680;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2681[var1] = var0 - 1;
            var0 += var0;
        }
        field2679 = new int[2000];
        field2680 = new int[2000];
    }

    public class219() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.b(II)I")
    public static int method122(int arg0) {
        class258 var1 = class258.method632(arg0);
        int var2 = var1.field3429;
        int var3 = var1.field3433;
        int var4 = var1.field3431;
        int var5 = field2681[var4 - var3];
        return field2680[var2] >> var3 & var5;
    }
}
