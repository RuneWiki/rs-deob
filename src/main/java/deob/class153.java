package deob;

@ObfuscatedName("et")
public class class153 {

    @ObfuscatedName("et.y")
    public static int[] field2630 = new int[32];

    @ObfuscatedName("et.u")
    public static int[] field2629;

    @ObfuscatedName("et.k")
    public static int[] field2628;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2630[var1] = var0 - 1;
            var0 += var0;
        }
        field2629 = new int[2000];
        field2628 = new int[2000];
    }

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.y(IB)I")
    public static int method1769(int arg0) {
        class42 var1 = (class42) class42.field960.method3145((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field964.method2704(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method797(new class107(var3));
            }
            class42.field960.method3147(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field961;
        int var7 = var2.field962;
        int var8 = var2.field959;
        int var9 = field2630[var8 - var7];
        return field2628[var6] >> var7 & var9;
    }

    @ObfuscatedName("ao.u(IIB)V")
    public static void method727(int arg0, int arg1) {
        class42 var2 = (class42) class42.field960.method3145((long) arg0);
        class42 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field964.method2704(14, arg0);
            class42 var5 = new class42();
            if (var4 != null) {
                var5.method797(new class107(var4));
            }
            class42.field960.method3147(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field961;
        int var8 = var3.field962;
        int var9 = var3.field959;
        int var10 = field2630[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2628[var7] = field2628[var7] & ~var11 | arg1 << var8 & var11;
    }
}
