package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ec")
public class class156 {

    @ObfuscatedName("ec.i")
    public static int field2565 = 0;

    @ObfuscatedName("ec.q")
    public static class177 field2567 = new class177(4096);

    @ObfuscatedName("ec.j")
    public static int field2579 = 0;

    @ObfuscatedName("ec.z")
    public static class177 field2569 = new class177(32);

    @ObfuscatedName("ec.m")
    public static int field2570 = 0;

    @ObfuscatedName("ec.w")
    public static class174 field2571 = new class174();

    @ObfuscatedName("ec.a")
    public static class177 field2568 = new class177(4096);

    @ObfuscatedName("ec.d")
    public static int field2573 = 0;

    @ObfuscatedName("ec.u")
    public static class177 field2574 = new class177(4096);

    @ObfuscatedName("ec.p")
    public static int field2575 = 0;

    @ObfuscatedName("ec.o")
    public static class128 field2576 = new class128(8);

    @ObfuscatedName("ec.c")
    public static int field2578 = 0;

    @ObfuscatedName("ec.f")
    public static CRC32 field2586 = new CRC32();

    @ObfuscatedName("ec.y")
    public static class157[] field2581 = new class157[256];

    @ObfuscatedName("ec.r")
    public static byte field2582 = 0;

    @ObfuscatedName("ec.l")
    public static int field2583 = 0;

    @ObfuscatedName("ec.n")
    public static int field2584 = 0;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.e(ZI)V")
    public static void method3257(boolean arg0) {
        if (Statics.field2577 == null) {
            return;
        }
        try {
            class128 var1 = new class128(4);
            var1.method2634(arg0 ? 2 : 3);
            var1.method2486(0);
            Statics.field2577.method1437(var1.field2043, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2577.method1434();
            } catch (Exception var4) {
            }
            field2584++;
            Statics.field2577 = null;
        }
    }

    @ObfuscatedName("eg.i(Lfh;IIIBZS)V")
    public static void method3000(class157 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class158 var8 = (class158) field2567.method3314(var6);
        if (var8 != null) {
            return;
        }
        class158 var9 = (class158) field2569.method3314(var6);
        if (var9 != null) {
            return;
        }
        class158 var10 = (class158) field2568.method3314(var6);
        if (var10 == null) {
            if (!arg5) {
                class158 var11 = (class158) field2574.method3314(var6);
                if (var11 != null) {
                    return;
                }
            }
            class158 var12 = new class158();
            var12.field2598 = arg0;
            var12.field2601 = arg3;
            var12.field2600 = arg4;
            if (arg5) {
                field2567.method3311(var12, var6);
                field2579++;
            } else {
                field2571.method3275(var12);
                field2568.method3311(var12, var6);
                field2573++;
            }
        } else if (arg5) {
            var10.method3306();
            field2567.method3311(var10, var6);
            field2573--;
            field2579++;
        }
    }

    @ObfuscatedName("v.k(III)I")
    public static int method259(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field281 != null && Statics.field281.field2839 == var2 ? Statics.field2572.field2045 * 99 / (Statics.field2572.field2043.length - Statics.field281.field2600) + 1 : 0;
    }

    @ObfuscatedName("et.q(ZZB)I")
    public static int method2710(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2579 + field2570;
        }
        if (arg1) {
            var2 += field2575 + field2573;
        }
        return var2;
    }
}
