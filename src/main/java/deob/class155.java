package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eu")
public class class155 {

    @ObfuscatedName("eu.b")
    public static int field2544 = 0;

    @ObfuscatedName("eu.w")
    public static class176 field2546 = new class176(4096);

    @ObfuscatedName("eu.r")
    public static int field2547 = 0;

    @ObfuscatedName("eu.k")
    public static class176 field2557 = new class176(32);

    @ObfuscatedName("eu.z")
    public static int field2549 = 0;

    @ObfuscatedName("eu.g")
    public static class173 field2550 = new class173();

    @ObfuscatedName("eu.n")
    public static class176 field2551 = new class176(4096);

    @ObfuscatedName("eu.j")
    public static int field2554 = 0;

    @ObfuscatedName("eu.c")
    public static class176 field2553 = new class176(4096);

    @ObfuscatedName("eu.m")
    public static int field2552 = 0;

    @ObfuscatedName("eu.q")
    public static class127 field2556 = new class127(8);

    @ObfuscatedName("eu.v")
    public static int field2558 = 0;

    @ObfuscatedName("eu.u")
    public static CRC32 field2543 = new CRC32();

    @ObfuscatedName("eu.i")
    public static class156[] field2561 = new class156[256];

    @ObfuscatedName("eu.p")
    public static byte field2562 = 0;

    @ObfuscatedName("eu.h")
    public static int field2545 = 0;

    @ObfuscatedName("eu.f")
    public static int field2564 = 0;

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.l(ZI)V")
    public static void method49(boolean arg0) {
        if (Statics.field2560 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2493(arg0 ? 2 : 3);
            var1.method2425(0);
            Statics.field2560.method1421(var1.field2024, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2560.method1402();
            } catch (Exception var4) {
            }
            field2564++;
            Statics.field2560 = null;
        }
    }

    @ObfuscatedName("ca.b(Lee;IIIBZI)V")
    public static void method2016(class156 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class157 var8 = (class157) field2546.method3300(var6);
        if (var8 != null) {
            return;
        }
        class157 var9 = (class157) field2557.method3300(var6);
        if (var9 != null) {
            return;
        }
        class157 var10 = (class157) field2551.method3300(var6);
        if (var10 == null) {
            if (!arg5) {
                class157 var11 = (class157) field2553.method3300(var6);
                if (var11 != null) {
                    return;
                }
            }
            class157 var12 = new class157();
            var12.field2590 = arg0;
            var12.field2584 = arg3;
            var12.field2586 = arg4;
            if (arg5) {
                field2546.method3301(var12, var6);
                field2547++;
            } else {
                field2550.method3265(var12);
                field2551.method3301(var12, var6);
                field2554++;
            }
        } else if (arg5) {
            var10.method3298();
            field2546.method3301(var10, var6);
            field2554--;
            field2547++;
        }
    }

    @ObfuscatedName("et.o(IIB)V")
    public static void method2963(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class157 var4 = (class157) field2551.method3300(var2);
        if (var4 != null) {
            field2550.method3264(var4);
        }
    }

    @ObfuscatedName("bu.w(ZZI)I")
    public static int method1387(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2549 + field2547;
        }
        if (arg1) {
            var2 += field2554 + field2552;
        }
        return var2;
    }

    @ObfuscatedName("w.r(B)V")
    public static void method26() {
        if (Statics.field2560 != null) {
            Statics.field2560.method1402();
        }
    }
}
