package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class155 {

    @ObfuscatedName("et.y")
    public static int field2523 = 0;

    @ObfuscatedName("et.c")
    public static class179 field2536 = new class179(4096);

    @ObfuscatedName("et.r")
    public static int field2522 = 0;

    @ObfuscatedName("et.f")
    public static class179 field2520 = new class179(32);

    @ObfuscatedName("et.z")
    public static int field2529 = 0;

    @ObfuscatedName("et.o")
    public static class186 field2532 = new class186();

    @ObfuscatedName("et.k")
    public static class179 field2521 = new class179(4096);

    @ObfuscatedName("et.s")
    public static int field2524 = 0;

    @ObfuscatedName("et.h")
    public static class179 field2525 = new class179(4096);

    @ObfuscatedName("et.m")
    public static int field2526 = 0;

    @ObfuscatedName("et.u")
    public static class110 field2528 = new class110(8);

    @ObfuscatedName("et.b")
    public static int field2516 = 0;

    @ObfuscatedName("et.j")
    public static CRC32 field2530 = new CRC32();

    @ObfuscatedName("et.x")
    public static class152[] field2531 = new class152[256];

    @ObfuscatedName("et.n")
    public static byte field2519 = 0;

    @ObfuscatedName("et.v")
    public static int field2533 = 0;

    @ObfuscatedName("et.l")
    public static int field2534 = 0;

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.p(ZB)V")
    public static void method1876(boolean arg0) {
        if (Statics.field2687 == null) {
            return;
        }
        try {
            class110 var1 = new class110(4);
            var1.method2110(arg0 ? 2 : 3);
            var1.method2112(0);
            Statics.field2687.method2599(var1.field1844, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2687.method2611();
            } catch (Exception var4) {
            }
            field2534++;
            Statics.field2687 = null;
        }
    }

    @ObfuscatedName("ap.y(Les;IIIBZI)V")
    public static void method776(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2536.method3224(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2520.method3224(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2521.method3224(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2525.method3224(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2537 = arg0;
            var12.field2538 = arg3;
            var12.field2539 = arg4;
            if (arg5) {
                field2536.method3225(var12, var6);
                field2522++;
            } else {
                field2532.method3315(var12);
                field2521.method3225(var12, var6);
                field2524++;
            }
        } else if (arg5) {
            var10.method3331();
            field2536.method3225(var10, var6);
            field2524--;
            field2522++;
        }
    }

    @ObfuscatedName("eq.d(III)V")
    public static void method2724(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2521.method3224(var2);
        if (var4 != null) {
            field2532.method3316(var4);
        }
    }

    @ObfuscatedName("cs.c(ZZI)I")
    public static int method1979(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2529 + field2522;
        }
        if (arg1) {
            var2 += field2526 + field2524;
        }
        return var2;
    }
}
