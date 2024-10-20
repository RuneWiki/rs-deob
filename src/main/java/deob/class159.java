package deob;

@ObfuscatedName("fu")
public class class159 {

    @ObfuscatedName("fu.a")
    public static int[] field2702 = new int[32];

    @ObfuscatedName("fu.v")
    public static int[] field2699;

    @ObfuscatedName("fu.i")
    public static int[] field2701;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2702[var1] = var0 - 1;
            var0 += var0;
        }
        field2699 = new int[2000];
        field2701 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.a(II)I")
    public static int method2538(int arg0) {
        class43 var1 = class43.method552(arg0);
        int var2 = var1.field980;
        int var3 = var1.field981;
        int var4 = var1.field982;
        int var5 = field2702[var4 - var3];
        return field2701[var2] >> var3 & var5;
    }
}
