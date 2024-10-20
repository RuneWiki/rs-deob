package deob;

@ObfuscatedName("fq")
public class class159 {

    @ObfuscatedName("fq.a")
    public static int[] field2704 = new int[32];

    @ObfuscatedName("fq.x")
    public static int[] field2702;

    @ObfuscatedName("fq.e")
    public static int[] field2701;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2704[var1] = var0 - 1;
            var0 += var0;
        }
        field2702 = new int[2000];
        field2701 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.a(II)I")
    public static int method2341(int arg0) {
        class38 var1 = class38.method2642(arg0);
        int var2 = var1.field974;
        int var3 = var1.field973;
        int var4 = var1.field970;
        int var5 = field2704[var4 - var3];
        return field2701[var2] >> var3 & var5;
    }
}
