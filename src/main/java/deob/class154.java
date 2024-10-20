package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class154 {

    @ObfuscatedName("eq.t")
    public static int field2531 = 0;

    @ObfuscatedName("eq.e")
    public static class175 field2532 = new class175(4096);

    @ObfuscatedName("eq.l")
    public static int field2529 = 0;

    @ObfuscatedName("eq.d")
    public static class175 field2539 = new class175(32);

    @ObfuscatedName("eq.r")
    public static int field2542 = 0;

    @ObfuscatedName("eq.k")
    public static class172 field2536 = new class172();

    @ObfuscatedName("eq.u")
    public static class175 field2537 = new class175(4096);

    @ObfuscatedName("eq.o")
    public static int field2538 = 0;

    @ObfuscatedName("eq.g")
    public static class175 field2543 = new class175(4096);

    @ObfuscatedName("eq.s")
    public static int field2540 = 0;

    @ObfuscatedName("eq.j")
    public static class127 field2535 = new class127(8);

    @ObfuscatedName("eq.a")
    public static int field2530 = 0;

    @ObfuscatedName("eq.m")
    public static CRC32 field2544 = new CRC32();

    @ObfuscatedName("eq.w")
    public static class155[] field2545 = new class155[256];

    @ObfuscatedName("eq.h")
    public static byte field2546 = 0;

    @ObfuscatedName("eq.y")
    public static int field2547 = 0;

    @ObfuscatedName("eq.x")
    public static int field2548 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.f(ZI)V")
    public static void method36(boolean arg0) {
        if (Statics.field2534 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2536(arg0 ? 2 : 3);
            var1.method2446(0);
            Statics.field2534.method1396(var1.field2030, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2534.method1397();
            } catch (Exception var4) {
            }
            field2548++;
            Statics.field2534 = null;
        }
    }

    @ObfuscatedName("dd.t(Lep;IIIBZI)V")
    public static void method2384(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2532.method3312(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2539.method3312(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2537.method3312(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2543.method3312(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2570 = arg0;
            var12.field2565 = arg3;
            var12.field2567 = arg4;
            if (arg5) {
                field2532.method3329(var12, var6);
                field2529++;
            } else {
                field2536.method3285(var12);
                field2537.method3329(var12, var6);
                field2538++;
            }
        } else if (arg5) {
            var10.method3309();
            field2532.method3329(var10, var6);
            field2538--;
            field2529++;
        }
    }

    @ObfuscatedName("el.n(III)V")
    public static void method2747(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2537.method3312(var2);
        if (var4 != null) {
            field2536.method3281(var4);
        }
    }

    @ObfuscatedName("cb.e(III)I")
    public static int method2139(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2541 != null && Statics.field2541.field2812 == var2 ? Statics.field2335.field2033 * 99 / (Statics.field2335.field2030.length - Statics.field2541.field2567) + 1 : 0;
    }
}
