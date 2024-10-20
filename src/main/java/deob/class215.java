package deob;

@ObfuscatedName("hr")
public class class215 {

    @ObfuscatedName("hr.w")
    public static int[] field2615 = new int[32];

    @ObfuscatedName("hr.o")
    public static int[] field2619;

    @ObfuscatedName("hr.x")
    public static int[] field2616;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2615[var1] = var0 - 1;
            var0 += var0;
        }
        field2619 = new int[2000];
        field2616 = new int[2000];
    }

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.w(II)I")
    public static int method2867(int arg0) {
        class254 var1 = class254.method2346(arg0);
        int var2 = var1.field3389;
        int var3 = var1.field3392;
        int var4 = var1.field3391;
        int var5 = field2615[var4 - var3];
        return field2616[var2] >> var3 & var5;
    }
}
