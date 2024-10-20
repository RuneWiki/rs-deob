package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ep")
public class class146 {

    @ObfuscatedName("ep.n")
    public static int field2472 = 0;

    @ObfuscatedName("ep.t")
    public static class169 field2457 = new class169(4096);

    @ObfuscatedName("ep.e")
    public static int field2458 = 0;

    @ObfuscatedName("ep.a")
    public static class169 field2459 = new class169(32);

    @ObfuscatedName("ep.l")
    public static int field2460 = 0;

    @ObfuscatedName("ep.v")
    public static class173 field2461 = new class173();

    @ObfuscatedName("ep.j")
    public static class169 field2462 = new class169(4096);

    @ObfuscatedName("ep.k")
    public static int field2473 = 0;

    @ObfuscatedName("ep.g")
    public static class169 field2455 = new class169(4096);

    @ObfuscatedName("ep.d")
    public static int field2469 = 0;

    @ObfuscatedName("ep.o")
    public static class104 field2466 = new class104(8);

    @ObfuscatedName("ep.m")
    public static int field2468 = 0;

    @ObfuscatedName("ep.q")
    public static CRC32 field2474 = new CRC32();

    @ObfuscatedName("ep.h")
    public static class143[] field2470 = new class143[256];

    @ObfuscatedName("ep.y")
    public static byte field2471 = 0;

    @ObfuscatedName("ep.r")
    public static int field2465 = 0;

    @ObfuscatedName("ep.w")
    public static int field2463 = 0;

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.z(ZI)V")
    public static void method2696(boolean arg0) {
        if (Statics.field2464 == null) {
            return;
        }
        try {
            class104 var1 = new class104(4);
            var1.method2113(arg0 ? 2 : 3);
            var1.method2115(0);
            Statics.field2464.method2600(var1.field1819, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2464.method2613();
            } catch (Exception var4) {
            }
            field2463++;
            Statics.field2464 = null;
        }
    }

    @ObfuscatedName("h.n(Lda;ZI)V")
    public static void method535(class127 arg0, boolean arg1) {
        if (Statics.field2464 != null) {
            try {
                Statics.field2464.method2613();
            } catch (Exception var10) {
            }
            Statics.field2464 = null;
        }
        Statics.field2464 = arg0;
        method2696(arg1);
        field2466.field1815 = 0;
        Statics.field1411 = null;
        Statics.field2467 = null;
        field2468 = 0;
        while (true) {
            class147 var3 = (class147) field2459.method3211();
            if (var3 == null) {
                while (true) {
                    class147 var4 = (class147) field2455.method3211();
                    if (var4 == null) {
                        if (field2471 != 0) {
                            try {
                                class104 var5 = new class104(4);
                                var5.method2113(4);
                                var5.method2113(field2471);
                                var5.method2114(0);
                                Statics.field2464.method2600(var5.field1819, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2464.method2613();
                                } catch (Exception var8) {
                                }
                                field2463++;
                                Statics.field2464 = null;
                            }
                        }
                        field2472 = 0;
                        Statics.field143 = class100.method496();
                        return;
                    }
                    field2461.method3262(var4);
                    field2462.method3210(var4, var4.field2817);
                    field2473++;
                    field2469--;
                }
            }
            field2457.method3210(var3, var3.field2817);
            field2458++;
            field2460--;
        }
    }

    @ObfuscatedName("client.u(Leh;IIIBZI)V")
    public static void method494(class143 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class147 var8 = (class147) field2457.method3208(var6);
        if (var8 != null) {
            return;
        }
        class147 var9 = (class147) field2459.method3208(var6);
        if (var9 != null) {
            return;
        }
        class147 var10 = (class147) field2462.method3208(var6);
        if (var10 == null) {
            if (!arg5) {
                class147 var11 = (class147) field2455.method3208(var6);
                if (var11 != null) {
                    return;
                }
            }
            class147 var12 = new class147();
            var12.field2479 = arg0;
            var12.field2478 = arg3;
            var12.field2481 = arg4;
            if (arg5) {
                field2457.method3210(var12, var6);
                field2458++;
            } else {
                field2461.method3265(var12);
                field2462.method3210(var12, var6);
                field2473++;
            }
        } else if (arg5) {
            var10.method3282();
            field2457.method3210(var10, var6);
            field2473--;
            field2458++;
        }
    }

    @ObfuscatedName("v.t(B)V")
    public static void method122() {
        if (Statics.field2464 != null) {
            Statics.field2464.method2613();
        }
    }
}
