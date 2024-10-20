package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eg")
public class class155 {

    @ObfuscatedName("eg.e")
    public static int field2522 = 0;

    @ObfuscatedName("eg.k")
    public static class179 field2524 = new class179(4096);

    @ObfuscatedName("eg.h")
    public static int field2525 = 0;

    @ObfuscatedName("eg.p")
    public static class179 field2526 = new class179(32);

    @ObfuscatedName("eg.n")
    public static int field2527 = 0;

    @ObfuscatedName("eg.o")
    public static class186 field2528 = new class186();

    @ObfuscatedName("eg.g")
    public static class179 field2529 = new class179(4096);

    @ObfuscatedName("eg.z")
    public static int field2541 = 0;

    @ObfuscatedName("eg.t")
    public static class179 field2531 = new class179(4096);

    @ObfuscatedName("eg.y")
    public static int field2532 = 0;

    @ObfuscatedName("eg.v")
    public static class110 field2534 = new class110(8);

    @ObfuscatedName("eg.f")
    public static int field2530 = 0;

    @ObfuscatedName("eg.a")
    public static CRC32 field2536 = new CRC32();

    @ObfuscatedName("eg.c")
    public static class152[] field2521 = new class152[256];

    @ObfuscatedName("eg.j")
    public static byte field2538 = 0;

    @ObfuscatedName("eg.d")
    public static int field2539 = 0;

    @ObfuscatedName("eg.l")
    public static int field2540 = 0;

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.b(ZI)V")
    public static void method2606(boolean arg0) {
        if (Statics.field2535 == null) {
            return;
        }
        try {
            class110 var1 = new class110(4);
            var1.method2203(arg0 ? 2 : 3);
            var1.method2130(0);
            Statics.field2535.method2613(var1.field1862, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2535.method2608();
            } catch (Exception var4) {
            }
            field2540++;
            Statics.field2535 = null;
        }
    }

    @ObfuscatedName("bv.e(Len;II)V")
    public static void method1595(class152 arg0, int arg1) {
        if (Statics.field2689 == null) {
            method2712((class152) null, 255, 255, 0, (byte) 0, true);
            field2521[arg1] = arg0;
        } else {
            Statics.field2689.field1855 = arg1 * 8 + 5;
            int var2 = Statics.field2689.method2195();
            int var3 = Statics.field2689.method2195();
            arg0.method2847(var2, var3);
        }
    }

    @ObfuscatedName("eb.i(Len;IIIBZB)V")
    public static void method2712(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2524.method3257(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2526.method3257(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2529.method3257(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2531.method3257(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2551 = arg0;
            var12.field2544 = arg3;
            var12.field2546 = arg4;
            if (arg5) {
                field2524.method3258(var12, var6);
                field2525++;
            } else {
                field2528.method3359(var12);
                field2529.method3258(var12, var6);
                field2541++;
            }
        } else if (arg5) {
            var10.method3367();
            field2524.method3258(var10, var6);
            field2541--;
            field2525++;
        }
    }

    @ObfuscatedName("dx.k(IIB)V")
    public static void method2402(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2529.method3257(var2);
        if (var4 != null) {
            field2528.method3355(var4);
        }
    }

    @ObfuscatedName("ag.h(ZZI)I")
    public static int method582(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2527 + field2525;
        }
        if (arg1) {
            var2 += field2541 + field2532;
        }
        return var2;
    }
}
