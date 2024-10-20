package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eg")
public class class155 {

    @ObfuscatedName("eg.t")
    public static int field2517 = 0;

    @ObfuscatedName("eg.j")
    public static class179 field2527 = new class179(4096);

    @ObfuscatedName("eg.l")
    public static int field2520 = 0;

    @ObfuscatedName("eg.g")
    public static class179 field2531 = new class179(32);

    @ObfuscatedName("eg.k")
    public static int field2522 = 0;

    @ObfuscatedName("eg.p")
    public static class186 field2523 = new class186();

    @ObfuscatedName("eg.y")
    public static class179 field2524 = new class179(4096);

    @ObfuscatedName("eg.m")
    public static int field2525 = 0;

    @ObfuscatedName("eg.o")
    public static class179 field2518 = new class179(4096);

    @ObfuscatedName("eg.c")
    public static int field2516 = 0;

    @ObfuscatedName("eg.n")
    public static class110 field2529 = new class110(8);

    @ObfuscatedName("eg.e")
    public static int field2528 = 0;

    @ObfuscatedName("eg.b")
    public static CRC32 field2532 = new CRC32();

    @ObfuscatedName("eg.i")
    public static class152[] field2533 = new class152[256];

    @ObfuscatedName("eg.w")
    public static byte field2534 = 0;

    @ObfuscatedName("eg.x")
    public static int field2519 = 0;

    @ObfuscatedName("eg.h")
    public static int field2521 = 0;

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.v(ZI)V")
    public static void method2509(boolean arg0) {
        if (Statics.field2536 == null) {
            return;
        }
        try {
            class110 var1 = new class110(4);
            var1.method2263(arg0 ? 2 : 3);
            var1.method2149(0);
            Statics.field2536.method2628(var1.field1853, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2536.method2625();
            } catch (Exception var4) {
            }
            field2521++;
            Statics.field2536 = null;
        }
    }

    @ObfuscatedName("ca.t(Ley;ZI)V")
    public static void method1997(class134 arg0, boolean arg1) {
        if (Statics.field2536 != null) {
            try {
                Statics.field2536.method2625();
            } catch (Exception var10) {
            }
            Statics.field2536 = null;
        }
        Statics.field2536 = arg0;
        method2509(arg1);
        field2529.field1847 = 0;
        Statics.field2084 = null;
        Statics.field2530 = null;
        field2528 = 0;
        while (true) {
            class156 var3 = (class156) field2531.method3269();
            if (var3 == null) {
                while (true) {
                    class156 var4 = (class156) field2518.method3269();
                    if (var4 == null) {
                        if (field2534 != 0) {
                            try {
                                class110 var5 = new class110(4);
                                var5.method2263(4);
                                var5.method2263(field2534);
                                var5.method2148(0);
                                Statics.field2536.method2628(var5.field1853, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2536.method2625();
                                } catch (Exception var8) {
                                }
                                field2521++;
                                Statics.field2536 = null;
                            }
                        }
                        field2517 = 0;
                        Statics.field2535 = class106.method487();
                        return;
                    }
                    field2523.method3362(var4);
                    field2524.method3282(var4, var4.field2911);
                    field2525++;
                    field2516--;
                }
            }
            field2527.method3282(var3, var3.field2911);
            field2520++;
            field2522--;
        }
    }

    @ObfuscatedName("du.f(Lei;IIIBZI)V")
    public static void method2447(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2527.method3274(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2531.method3274(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2524.method3274(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2518.method3274(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2540 = arg0;
            var12.field2538 = arg3;
            var12.field2541 = arg4;
            if (arg5) {
                field2527.method3282(var12, var6);
                field2520++;
            } else {
                field2523.method3352(var12);
                field2524.method3282(var12, var6);
                field2525++;
            }
        } else if (arg5) {
            var10.method3371();
            field2527.method3282(var10, var6);
            field2525--;
            field2520++;
        }
    }

    @ObfuscatedName("x.j(IIB)I")
    public static int method510(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2084 != null && Statics.field2084.field2911 == var2 ? Statics.field2530.field1847 * 99 / (Statics.field2530.field1853.length - Statics.field2084.field2541) + 1 : 0;
    }
}
