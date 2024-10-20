package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class154 {

    @ObfuscatedName("ew.c")
    public static int field2553 = 0;

    @ObfuscatedName("ew.z")
    public static class175 field2555 = new class175(4096);

    @ObfuscatedName("ew.m")
    public static int field2562 = 0;

    @ObfuscatedName("ew.k")
    public static class175 field2557 = new class175(32);

    @ObfuscatedName("ew.v")
    public static int field2565 = 0;

    @ObfuscatedName("ew.y")
    public static class172 field2559 = new class172();

    @ObfuscatedName("ew.d")
    public static class175 field2561 = new class175(4096);

    @ObfuscatedName("ew.l")
    public static int field2566 = 0;

    @ObfuscatedName("ew.h")
    public static class175 field2573 = new class175(4096);

    @ObfuscatedName("ew.b")
    public static int field2563 = 0;

    @ObfuscatedName("ew.u")
    public static class127 field2567 = new class127(8);

    @ObfuscatedName("ew.e")
    public static int field2558 = 0;

    @ObfuscatedName("ew.o")
    public static CRC32 field2560 = new CRC32();

    @ObfuscatedName("ew.f")
    public static class155[] field2568 = new class155[256];

    @ObfuscatedName("ew.s")
    public static byte field2569 = 0;

    @ObfuscatedName("ew.w")
    public static int field2570 = 0;

    @ObfuscatedName("ew.x")
    public static int field2571 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.q(ZI)V")
    public static void method2878(boolean arg0) {
        if (Statics.field2556 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2411(arg0 ? 2 : 3);
            var1.method2413(0);
            Statics.field2556.method1403(var1.field2042, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2556.method1400();
            } catch (Exception var4) {
            }
            field2571++;
            Statics.field2556 = null;
        }
    }

    @ObfuscatedName("l.c(Ler;II)V")
    public static void method88(class155 arg0, int arg1) {
        if (Statics.field260 == null) {
            method2204((class155) null, 255, 255, 0, (byte) 0, true);
            field2568[arg1] = arg0;
        } else {
            Statics.field260.field2039 = arg1 * 8 + 5;
            int var2 = Statics.field260.method2430();
            int var3 = Statics.field260.method2430();
            arg0.method3051(var2, var3);
        }
    }

    @ObfuscatedName("dz.p(Ler;IIIBZI)V")
    public static void method2204(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2555.method3260(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2557.method3260(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2561.method3260(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2573.method3260(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2587 = arg0;
            var12.field2590 = arg3;
            var12.field2589 = arg4;
            if (arg5) {
                field2555.method3261(var12, var6);
                field2562++;
            } else {
                field2559.method3227(var12);
                field2561.method3261(var12, var6);
                field2566++;
            }
        } else if (arg5) {
            var10.method3255();
            field2555.method3261(var10, var6);
            field2566--;
            field2562++;
        }
    }

    @ObfuscatedName("cm.z(III)V")
    public static void method1596(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2561.method3260(var2);
        if (var4 != null) {
            field2559.method3228(var4);
        }
    }

    @ObfuscatedName("bd.m(ZZB)I")
    public static int method1557(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2565 + field2562;
        }
        if (arg1) {
            var2 += field2566 + field2563;
        }
        return var2;
    }
}
