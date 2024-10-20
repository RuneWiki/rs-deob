package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ea")
public class class153 {

    @ObfuscatedName("ea.w")
    public static int field2521 = 0;

    @ObfuscatedName("ea.e")
    public static class175 field2523 = new class175(4096);

    @ObfuscatedName("ea.t")
    public static int field2524 = 0;

    @ObfuscatedName("ea.d")
    public static class175 field2525 = new class175(32);

    @ObfuscatedName("ea.p")
    public static int field2539 = 0;

    @ObfuscatedName("ea.k")
    public static class172 field2530 = new class172();

    @ObfuscatedName("ea.r")
    public static class175 field2528 = new class175(4096);

    @ObfuscatedName("ea.l")
    public static int field2529 = 0;

    @ObfuscatedName("ea.a")
    public static class175 field2533 = new class175(4096);

    @ObfuscatedName("ea.z")
    public static int field2527 = 0;

    @ObfuscatedName("ea.u")
    public static class127 field2532 = new class127(8);

    @ObfuscatedName("ea.o")
    public static int field2534 = 0;

    @ObfuscatedName("ea.j")
    public static CRC32 field2535 = new CRC32();

    @ObfuscatedName("ea.q")
    public static class154[] field2536 = new class154[256];

    @ObfuscatedName("ea.c")
    public static byte field2537 = 0;

    @ObfuscatedName("ea.h")
    public static int field2538 = 0;

    @ObfuscatedName("ea.b")
    public static int field2531 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.i(ZI)V")
    public static void method2942(boolean arg0) {
        if (Statics.field2526 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2438(arg0 ? 2 : 3);
            var1.method2527(0);
            Statics.field2526.method1366(var1.field2049, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2526.method1363();
            } catch (Exception var4) {
            }
            field2531++;
            Statics.field2526 = null;
        }
    }

    @ObfuscatedName("ai.w(Lbq;ZI)V")
    public static void method814(class70 arg0, boolean arg1) {
        if (Statics.field2526 != null) {
            try {
                Statics.field2526.method1363();
            } catch (Exception var10) {
            }
            Statics.field2526 = null;
        }
        Statics.field2526 = arg0;
        method2942(arg1);
        field2532.field2045 = 0;
        Statics.field2407 = null;
        Statics.field1276 = null;
        field2534 = 0;
        while (true) {
            class155 var3 = (class155) field2525.method3276();
            if (var3 == null) {
                while (true) {
                    class155 var4 = (class155) field2533.method3276();
                    if (var4 == null) {
                        if (field2537 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2438(4);
                                var5.method2438(field2537);
                                var5.method2585(0);
                                Statics.field2526.method1366(var5.field2049, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2526.method1363();
                                } catch (Exception var8) {
                                }
                                field2531++;
                                Statics.field2526 = null;
                            }
                        }
                        field2521 = 0;
                        Statics.field2522 = class121.method145();
                        return;
                    }
                    field2530.method3247(var4);
                    field2528.method3278(var4, var4.field2817);
                    field2529++;
                    field2527--;
                }
            }
            field2523.method3278(var3, var3.field2817);
            field2524++;
            field2539--;
        }
    }

    @ObfuscatedName("at.f(Lez;II)V")
    public static void method828(class154 arg0, int arg1) {
        if (Statics.field1821 == null) {
            method2939((class154) null, 255, 255, 0, (byte) 0, true);
            field2536[arg1] = arg0;
        } else {
            Statics.field1821.field2045 = arg1 * 8 + 5;
            int var2 = Statics.field1821.method2457();
            int var3 = Statics.field1821.method2457();
            arg0.method3063(var2, var3);
        }
    }

    @ObfuscatedName("ef.e(Lez;IIIBZI)V")
    public static void method2939(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2523.method3273(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2525.method3273(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2528.method3273(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2533.method3273(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2556 = arg0;
            var12.field2553 = arg3;
            var12.field2554 = arg4;
            if (arg5) {
                field2523.method3278(var12, var6);
                field2524++;
            } else {
                field2530.method3246(var12);
                field2528.method3278(var12, var6);
                field2529++;
            }
        } else if (arg5) {
            var10.method3270();
            field2523.method3278(var10, var6);
            field2529--;
            field2524++;
        }
    }

    @ObfuscatedName("a.t(III)V")
    public static void method126(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class155 var4 = (class155) field2528.method3273(var2);
        if (var4 != null) {
            field2530.method3247(var4);
        }
    }

    @ObfuscatedName("bp.d(IIB)I")
    public static int method1308(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2407 != null && Statics.field2407.field2817 == var2 ? Statics.field1276.field2045 * 99 / (Statics.field1276.field2049.length - Statics.field2407.field2554) + 1 : 0;
    }

    @ObfuscatedName("ep.p(ZZB)I")
    public static int method2669(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2539 + field2524;
        }
        if (arg1) {
            var2 += field2529 + field2527;
        }
        return var2;
    }
}
