package deob;

@ObfuscatedName("fx")
public class class157 {

    @ObfuscatedName("fx.x")
    public static int[] field2673 = new int[32];

    @ObfuscatedName("fx.v")
    public static int[] field2671;

    @ObfuscatedName("fx.m")
    public static int[] field2672;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2673[var1] = var0 - 1;
            var0 += var0;
        }
        field2671 = new int[2000];
        field2672 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.x(II)I")
    public static int method2401(int arg0) {
        class43 var1 = class43.method118(arg0);
        int var2 = var1.field984;
        int var3 = var1.field986;
        int var4 = var1.field987;
        int var5 = field2673[var4 - var3];
        return field2672[var2] >> var3 & var5;
    }
}
