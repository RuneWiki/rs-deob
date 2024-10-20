package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ep")
public class class154 {

    @ObfuscatedName("ep.q")
    public static int field2547 = 0;

    @ObfuscatedName("ep.v")
    public static class175 field2563 = new class175(4096);

    @ObfuscatedName("ep.g")
    public static int field2550 = 0;

    @ObfuscatedName("ep.x")
    public static class175 field2566 = new class175(32);

    @ObfuscatedName("ep.u")
    public static int field2552 = 0;

    @ObfuscatedName("ep.l")
    public static class172 field2553 = new class172();

    @ObfuscatedName("ep.a")
    public static class175 field2546 = new class175(4096);

    @ObfuscatedName("ep.h")
    public static int field2549 = 0;

    @ObfuscatedName("ep.t")
    public static class175 field2554 = new class175(4096);

    @ObfuscatedName("ep.m")
    public static int field2557 = 0;

    @ObfuscatedName("ep.b")
    public static class127 field2560 = new class127(8);

    @ObfuscatedName("ep.z")
    public static int field2561 = 0;

    @ObfuscatedName("ep.f")
    public static CRC32 field2562 = new CRC32();

    @ObfuscatedName("ep.r")
    public static class155[] field2551 = new class155[256];

    @ObfuscatedName("ep.k")
    public static byte field2564 = 0;

    @ObfuscatedName("ep.w")
    public static int field2565 = 0;

    @ObfuscatedName("ep.e")
    public static int field2548 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.c(ZI)V")
    public static void method2957(boolean arg0) {
        if (Statics.field2556 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2333(arg0 ? 2 : 3);
            var1.method2406(0);
            Statics.field2556.method1347(var1.field2057, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2556.method1330();
            } catch (Exception var4) {
            }
            field2548++;
            Statics.field2556 = null;
        }
    }

    @ObfuscatedName("y.q(Leq;II)V")
    public static void method27(class155 arg0, int arg1) {
        if (Statics.field1396 == null) {
            method161((class155) null, 255, 255, 0, (byte) 0, true);
            field2551[arg1] = arg0;
        } else {
            Statics.field1396.field2052 = arg1 * 8 + 5;
            int var2 = Statics.field1396.method2323();
            int var3 = Statics.field1396.method2323();
            arg0.method2975(var2, var3);
        }
    }

    @ObfuscatedName("o.y(Leq;IIIBZI)V")
    public static void method161(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2563.method3138(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2566.method3138(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2546.method3138(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2554.method3138(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2586 = arg0;
            var12.field2585 = arg3;
            var12.field2588 = arg4;
            if (arg5) {
                field2563.method3136(var12, var6);
                field2550++;
            } else {
                field2553.method3106(var12);
                field2546.method3136(var12, var6);
                field2549++;
            }
        } else if (arg5) {
            var10.method3133();
            field2563.method3136(var10, var6);
            field2549--;
            field2550++;
        }
    }

    @ObfuscatedName("d.v(III)V")
    public static void method147(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2546.method3138(var2);
        if (var4 != null) {
            field2553.method3108(var4);
        }
    }

    @ObfuscatedName("i.g(III)I")
    public static int method226(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2559 != null && Statics.field2559.field2824 == var2 ? Statics.field92.field2052 * 99 / (Statics.field92.field2057.length - Statics.field2559.field2588) + 1 : 0;
    }

    @ObfuscatedName("r.x(ZZI)I")
    public static int method195(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2552 + field2550;
        }
        if (arg1) {
            var2 += field2557 + field2549;
        }
        return var2;
    }

    @ObfuscatedName("bk.u(I)V")
    public static void method1349() {
        if (Statics.field2556 != null) {
            Statics.field2556.method1330();
        }
    }
}
