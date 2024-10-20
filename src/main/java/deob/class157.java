package deob;

@ObfuscatedName("fm")
public class class157 {

    @ObfuscatedName("fm.g")
    public static int[] field2671 = new int[32];

    @ObfuscatedName("fm.j")
    public static int[] field2675;

    @ObfuscatedName("fm.z")
    public static int[] field2672;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2671[var1] = var0 - 1;
            var0 += var0;
        }
        field2675 = new int[2000];
        field2672 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.g(II)I")
    public static int method671(int arg0) {
        class43 var1 = (class43) class43.field981.method3097((long) arg0);
        class43 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field984.method2660(14, arg0);
            class43 var4 = new class43();
            if (var3 != null) {
                var4.method777(new class108(var3));
            }
            class43.field981.method3099(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field982;
        int var7 = var2.field983;
        int var8 = var2.field989;
        int var9 = field2671[var8 - var7];
        return field2672[var6] >> var7 & var9;
    }
}
