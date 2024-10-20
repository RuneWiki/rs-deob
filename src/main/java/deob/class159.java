package deob;

@ObfuscatedName("fu")
public class class159 {

    @ObfuscatedName("fu.v")
    public static int[] field2679 = new int[32];

    @ObfuscatedName("fu.t")
    public static int[] field2681;

    @ObfuscatedName("fu.f")
    public static int[] field2680;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2679[var1] = var0 - 1;
            var0 += var0;
        }
        field2681 = new int[2000];
        field2680 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.v(II)I")
    public static int method127(int arg0) {
        class43 var1 = (class43) class43.field978.method3231((long) arg0);
        class43 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field984.method2852(14, arg0);
            class43 var4 = new class43();
            if (var3 != null) {
                var4.method822(new class110(var3));
            }
            class43.field978.method3228(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field979;
        int var7 = var2.field981;
        int var8 = var2.field983;
        int var9 = field2679[var8 - var7];
        return field2680[var6] >> var7 & var9;
    }
}
