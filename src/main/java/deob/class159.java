package deob;

@ObfuscatedName("fa")
public class class159 {

    @ObfuscatedName("fa.b")
    public static int[] field2693 = new int[32];

    @ObfuscatedName("fa.e")
    public static int[] field2691;

    @ObfuscatedName("fa.i")
    public static int[] field2692;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2693[var1] = var0 - 1;
            var0 += var0;
        }
        field2691 = new int[2000];
        field2692 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.b(II)I")
    public static int method2741(int arg0) {
        class43 var1 = class43.method96(arg0);
        int var2 = var1.field977;
        int var3 = var1.field978;
        int var4 = var1.field984;
        int var5 = field2693[var4 - var3];
        return field2692[var2] >> var3 & var5;
    }
}
