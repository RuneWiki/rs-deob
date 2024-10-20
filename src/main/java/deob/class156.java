package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class156 {

    @ObfuscatedName("et.b")
    public static int field2580 = 0;

    @ObfuscatedName("et.l")
    public static class177 field2560 = new class177(4096);

    @ObfuscatedName("et.s")
    public static int field2563 = 0;

    @ObfuscatedName("et.d")
    public static class177 field2564 = new class177(32);

    @ObfuscatedName("et.e")
    public static int field2559 = 0;

    @ObfuscatedName("et.u")
    public static class174 field2566 = new class174();

    @ObfuscatedName("et.q")
    public static class177 field2567 = new class177(4096);

    @ObfuscatedName("et.o")
    public static int field2561 = 0;

    @ObfuscatedName("et.v")
    public static class177 field2569 = new class177(4096);

    @ObfuscatedName("et.m")
    public static int field2565 = 0;

    @ObfuscatedName("et.p")
    public static class128 field2572 = new class128(8);

    @ObfuscatedName("et.h")
    public static int field2568 = 0;

    @ObfuscatedName("et.c")
    public static CRC32 field2573 = new CRC32();

    @ObfuscatedName("et.n")
    public static class157[] field2575 = new class157[256];

    @ObfuscatedName("et.t")
    public static byte field2576 = 0;

    @ObfuscatedName("et.y")
    public static int field2577 = 0;

    @ObfuscatedName("et.g")
    public static int field2562 = 0;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.i(ZB)V")
    public static void method2052(boolean arg0) {
        if (Statics.field2570 == null) {
            return;
        }
        try {
            class128 var1 = new class128(4);
            var1.method2449(arg0 ? 2 : 3);
            var1.method2501(0);
            Statics.field2570.method1372(var1.field2050, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2570.method1371();
            } catch (Exception var4) {
            }
            field2562++;
            Statics.field2570 = null;
        }
    }

    @ObfuscatedName("eu.r(Lfv;IB)V")
    public static void method2902(class157 arg0, int arg1) {
        if (Statics.field208 == null) {
            method1543((class157) null, 255, 255, 0, (byte) 0, true);
            field2575[arg1] = arg0;
        } else {
            Statics.field208.field2048 = arg1 * 8 + 5;
            int var2 = Statics.field208.method2468();
            int var3 = Statics.field208.method2468();
            arg0.method3141(var2, var3);
        }
    }

    @ObfuscatedName("bj.l(Lfv;IIIBZI)V")
    public static void method1543(class157 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class158 var8 = (class158) field2560.method3315(var6);
        if (var8 != null) {
            return;
        }
        class158 var9 = (class158) field2564.method3315(var6);
        if (var9 != null) {
            return;
        }
        class158 var10 = (class158) field2567.method3315(var6);
        if (var10 == null) {
            if (!arg5) {
                class158 var11 = (class158) field2569.method3315(var6);
                if (var11 != null) {
                    return;
                }
            }
            class158 var12 = new class158();
            var12.field2593 = arg0;
            var12.field2596 = arg3;
            var12.field2592 = arg4;
            if (arg5) {
                field2560.method3329(var12, var6);
                field2563++;
            } else {
                field2566.method3302(var12);
                field2567.method3329(var12, var6);
                field2561++;
            }
        } else if (arg5) {
            var10.method3311();
            field2560.method3329(var10, var6);
            field2561--;
            field2563++;
        }
    }

    @ObfuscatedName("cn.s(I)V")
    public static void method1684() {
        if (Statics.field2570 != null) {
            Statics.field2570.method1371();
        }
    }
}
