package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ek")
public class class153 {

    @ObfuscatedName("ek.p")
    public static int field2533 = 0;

    @ObfuscatedName("ek.l")
    public static class175 field2552 = new class175(4096);

    @ObfuscatedName("ek.q")
    public static int field2535 = 0;

    @ObfuscatedName("ek.b")
    public static class175 field2536 = new class175(32);

    @ObfuscatedName("ek.u")
    public static int field2546 = 0;

    @ObfuscatedName("ek.d")
    public static class172 field2538 = new class172();

    @ObfuscatedName("ek.m")
    public static class175 field2539 = new class175(4096);

    @ObfuscatedName("ek.v")
    public static int field2540 = 0;

    @ObfuscatedName("ek.j")
    public static class175 field2541 = new class175(4096);

    @ObfuscatedName("ek.f")
    public static int field2542 = 0;

    @ObfuscatedName("ek.z")
    public static class127 field2547 = new class127(8);

    @ObfuscatedName("ek.y")
    public static int field2534 = 0;

    @ObfuscatedName("ek.e")
    public static CRC32 field2549 = new CRC32();

    @ObfuscatedName("ek.t")
    public static class154[] field2553 = new class154[256];

    @ObfuscatedName("ek.r")
    public static byte field2537 = 0;

    @ObfuscatedName("ek.w")
    public static int field2545 = 0;

    @ObfuscatedName("ek.x")
    public static int field2551 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.i(ZI)V")
    public static void method2657(boolean arg0) {
        if (Statics.field2548 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2397(arg0 ? 2 : 3);
            var1.method2399(0);
            Statics.field2548.method1350(var1.field2039, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2548.method1332();
            } catch (Exception var4) {
            }
            field2551++;
            Statics.field2548 = null;
        }
    }

    @ObfuscatedName("ak.p(Let;II)V")
    public static void method750(class154 arg0, int arg1) {
        if (Statics.field2323 == null) {
            method2656((class154) null, 255, 255, 0, (byte) 0, true);
            field2553[arg1] = arg0;
        } else {
            Statics.field2323.field2037 = arg1 * 8 + 5;
            int var2 = Statics.field2323.method2416();
            int var3 = Statics.field2323.method2416();
            arg0.method3036(var2, var3);
        }
    }

    @ObfuscatedName("ex.a(Let;IIIBZI)V")
    public static void method2656(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2552.method3268(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2536.method3268(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2539.method3268(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2541.method3268(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2567 = arg0;
            var12.field2565 = arg3;
            var12.field2568 = arg4;
            if (arg5) {
                field2552.method3269(var12, var6);
                field2535++;
            } else {
                field2538.method3235(var12);
                field2539.method3269(var12, var6);
                field2540++;
            }
        } else if (arg5) {
            var10.method3264();
            field2552.method3269(var10, var6);
            field2540--;
            field2535++;
        }
    }

    @ObfuscatedName("x.l(III)I")
    public static int method243(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2544 != null && Statics.field2544.field2818 == var2 ? Statics.field983.field2037 * 99 / (Statics.field983.field2039.length - Statics.field2544.field2568) + 1 : 0;
    }
}
