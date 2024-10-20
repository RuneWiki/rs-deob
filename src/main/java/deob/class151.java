package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eg")
public class class151 {

    @ObfuscatedName("eg.h")
    public static int field2450 = 0;

    @ObfuscatedName("eg.p")
    public static class173 field2452 = new class173(4096);

    @ObfuscatedName("eg.i")
    public static int field2453 = 0;

    @ObfuscatedName("eg.v")
    public static class173 field2458 = new class173(32);

    @ObfuscatedName("eg.l")
    public static int field2455 = 0;

    @ObfuscatedName("eg.m")
    public static class170 field2456 = new class170();

    @ObfuscatedName("eg.g")
    public static class173 field2451 = new class173(4096);

    @ObfuscatedName("eg.t")
    public static int field2457 = 0;

    @ObfuscatedName("eg.o")
    public static class173 field2465 = new class173(4096);

    @ObfuscatedName("eg.b")
    public static int field2459 = 0;

    @ObfuscatedName("eg.f")
    public static class126 field2461 = new class126(8);

    @ObfuscatedName("eg.u")
    public static int field2460 = 0;

    @ObfuscatedName("eg.q")
    public static CRC32 field2463 = new CRC32();

    @ObfuscatedName("eg.a")
    public static class152[] field2464 = new class152[256];

    @ObfuscatedName("eg.r")
    public static byte field2466 = 0;

    @ObfuscatedName("eg.x")
    public static int field2467 = 0;

    @ObfuscatedName("eg.w")
    public static int field2468 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.z(ZB)V")
    public static void method2666(boolean arg0) {
        if (Statics.field2454 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2462(arg0 ? 2 : 3);
            var1.method2439(0);
            Statics.field2454.method1363(var1.field2007, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2454.method1359();
            } catch (Exception var4) {
            }
            field2468++;
            Statics.field2454 = null;
        }
    }

    @ObfuscatedName("cb.h(Lbg;ZI)V")
    public static void method1649(class69 arg0, boolean arg1) {
        if (Statics.field2454 != null) {
            try {
                Statics.field2454.method1359();
            } catch (Exception var10) {
            }
            Statics.field2454 = null;
        }
        Statics.field2454 = arg0;
        method2666(arg1);
        field2461.field2003 = 0;
        Statics.field82 = null;
        Statics.field352 = null;
        field2460 = 0;
        while (true) {
            class153 var3 = (class153) field2458.method3285();
            if (var3 == null) {
                while (true) {
                    class153 var4 = (class153) field2465.method3285();
                    if (var4 == null) {
                        if (field2466 != 0) {
                            try {
                                class126 var5 = new class126(4);
                                var5.method2462(4);
                                var5.method2462(field2466);
                                var5.method2438(0);
                                Statics.field2454.method1363(var5.field2007, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2454.method1359();
                                } catch (Exception var8) {
                                }
                                field2468++;
                                Statics.field2454 = null;
                            }
                        }
                        field2450 = 0;
                        Statics.field2462 = class120.method228();
                        return;
                    }
                    field2456.method3249(var4);
                    field2451.method3283(var4, var4.field2755);
                    field2457++;
                    field2459--;
                }
            }
            field2452.method3283(var3, var3.field2755);
            field2453++;
            field2455--;
        }
    }

    @ObfuscatedName("dp.c(Leu;IIIBZI)V")
    public static void method2369(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class153 var8 = (class153) field2452.method3281(var6);
        if (var8 != null) {
            return;
        }
        class153 var9 = (class153) field2458.method3281(var6);
        if (var9 != null) {
            return;
        }
        class153 var10 = (class153) field2451.method3281(var6);
        if (var10 == null) {
            if (!arg5) {
                class153 var11 = (class153) field2465.method3281(var6);
                if (var11 != null) {
                    return;
                }
            }
            class153 var12 = new class153();
            var12.field2485 = arg0;
            var12.field2484 = arg3;
            var12.field2486 = arg4;
            if (arg5) {
                field2452.method3283(var12, var6);
                field2453++;
            } else {
                field2456.method3248(var12);
                field2451.method3283(var12, var6);
                field2457++;
            }
        } else if (arg5) {
            var10.method3280();
            field2452.method3283(var10, var6);
            field2457--;
            field2453++;
        }
    }

    @ObfuscatedName("ed.p(III)I")
    public static int method2835(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field82 != null && Statics.field82.field2755 == var2 ? Statics.field352.field2003 * 99 / (Statics.field352.field2007.length - Statics.field82.field2486) + 1 : 0;
    }

    @ObfuscatedName("cz.i(B)V")
    public static void method2102() {
        if (Statics.field2454 != null) {
            Statics.field2454.method1359();
        }
    }
}
