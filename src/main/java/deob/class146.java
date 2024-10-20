package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ec")
public class class146 {

    @ObfuscatedName("ec.k")
    public static int field2446 = 0;

    @ObfuscatedName("ec.g")
    public static class169 field2448 = new class169(4096);

    @ObfuscatedName("ec.r")
    public static int field2449 = 0;

    @ObfuscatedName("ec.i")
    public static class169 field2453 = new class169(32);

    @ObfuscatedName("ec.f")
    public static int field2460 = 0;

    @ObfuscatedName("ec.a")
    public static class173 field2452 = new class173();

    @ObfuscatedName("ec.w")
    public static class169 field2447 = new class169(4096);

    @ObfuscatedName("ec.u")
    public static int field2451 = 0;

    @ObfuscatedName("ec.d")
    public static class169 field2455 = new class169(4096);

    @ObfuscatedName("ec.t")
    public static int field2454 = 0;

    @ObfuscatedName("ec.p")
    public static class104 field2458 = new class104(8);

    @ObfuscatedName("ec.n")
    public static int field2459 = 0;

    @ObfuscatedName("ec.c")
    public static CRC32 field2450 = new CRC32();

    @ObfuscatedName("ec.s")
    public static class143[] field2461 = new class143[256];

    @ObfuscatedName("ec.o")
    public static byte field2445 = 0;

    @ObfuscatedName("ec.h")
    public static int field2463 = 0;

    @ObfuscatedName("ec.x")
    public static int field2464 = 0;

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.m(ZI)V")
    public static void method484(boolean arg0) {
        if (Statics.field2456 == null) {
            return;
        }
        try {
            class104 var1 = new class104(4);
            var1.method2133(arg0 ? 2 : 3);
            var1.method2118(0);
            Statics.field2456.method2564(var1.field1808, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2456.method2560();
            } catch (Exception var4) {
            }
            field2464++;
            Statics.field2456 = null;
        }
    }

    @ObfuscatedName("ah.k(Ldc;ZI)V")
    public static void method575(class127 arg0, boolean arg1) {
        if (Statics.field2456 != null) {
            try {
                Statics.field2456.method2560();
            } catch (Exception var10) {
            }
            Statics.field2456 = null;
        }
        Statics.field2456 = arg0;
        method484(arg1);
        field2458.field1806 = 0;
        Statics.field1911 = null;
        Statics.field861 = null;
        field2459 = 0;
        while (true) {
            class147 var3 = (class147) field2453.method3156();
            if (var3 == null) {
                while (true) {
                    class147 var4 = (class147) field2455.method3156();
                    if (var4 == null) {
                        if (field2445 != 0) {
                            try {
                                class104 var5 = new class104(4);
                                var5.method2133(4);
                                var5.method2133(field2445);
                                var5.method2117(0);
                                Statics.field2456.method2564(var5.field1808, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2456.method2560();
                                } catch (Exception var8) {
                                }
                                field2464++;
                                Statics.field2456 = null;
                            }
                        }
                        field2446 = 0;
                        Statics.field2462 = class100.method100();
                        return;
                    }
                    field2452.method3203(var4);
                    field2447.method3165(var4, var4.field2812);
                    field2451++;
                    field2454--;
                }
            }
            field2448.method3165(var3, var3.field2812);
            field2449++;
            field2460--;
        }
    }

    @ObfuscatedName("dr.y(Ler;IIIBZI)V")
    public static void method2518(class143 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class147 var8 = (class147) field2448.method3159(var6);
        if (var8 != null) {
            return;
        }
        class147 var9 = (class147) field2453.method3159(var6);
        if (var9 != null) {
            return;
        }
        class147 var10 = (class147) field2447.method3159(var6);
        if (var10 == null) {
            if (!arg5) {
                class147 var11 = (class147) field2455.method3159(var6);
                if (var11 != null) {
                    return;
                }
            }
            class147 var12 = new class147();
            var12.field2467 = arg0;
            var12.field2468 = arg3;
            var12.field2466 = arg4;
            if (arg5) {
                field2448.method3165(var12, var6);
                field2449++;
            } else {
                field2452.method3209(var12);
                field2447.method3165(var12, var6);
                field2451++;
            }
        } else if (arg5) {
            var10.method3216();
            field2448.method3165(var10, var6);
            field2451--;
            field2449++;
        }
    }
}
