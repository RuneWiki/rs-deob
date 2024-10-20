package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eb")
public class class151 {

    @ObfuscatedName("eb.g")
    public static int field2498 = 0;

    @ObfuscatedName("eb.c")
    public static class175 field2513 = new class175(4096);

    @ObfuscatedName("eb.n")
    public static int field2512 = 0;

    @ObfuscatedName("eb.s")
    public static class175 field2505 = new class175(32);

    @ObfuscatedName("eb.r")
    public static int field2503 = 0;

    @ObfuscatedName("eb.w")
    public static class182 field2504 = new class182();

    @ObfuscatedName("eb.u")
    public static class175 field2502 = new class175(4096);

    @ObfuscatedName("eb.d")
    public static int field2506 = 0;

    @ObfuscatedName("eb.h")
    public static class175 field2507 = new class175(4096);

    @ObfuscatedName("eb.a")
    public static int field2508 = 0;

    @ObfuscatedName("eb.e")
    public static class107 field2509 = new class107(8);

    @ObfuscatedName("eb.z")
    public static int field2510 = 0;

    @ObfuscatedName("eb.t")
    public static CRC32 field2511 = new CRC32();

    @ObfuscatedName("eb.j")
    public static class148[] field2501 = new class148[256];

    @ObfuscatedName("eb.o")
    public static byte field2514 = 0;

    @ObfuscatedName("eb.i")
    public static int field2515 = 0;

    @ObfuscatedName("eb.m")
    public static int field2516 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.p(ZB)V")
    public static void method2491(boolean arg0) {
        if (Statics.field2500 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2159(arg0 ? 2 : 3);
            var1.method2161(0);
            Statics.field2500.method2636(var1.field1838, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2500.method2648();
            } catch (Exception var4) {
            }
            field2516++;
            Statics.field2500 = null;
        }
    }

    @ObfuscatedName("z.g(Lek;II)V")
    public static void method162(class148 arg0, int arg1) {
        if (Statics.field2497 == null) {
            method1941((class148) null, 255, 255, 0, (byte) 0, true);
            field2501[arg1] = arg0;
        } else {
            Statics.field2497.field1837 = arg1 * 8 + 5;
            int var2 = Statics.field2497.method2305();
            int var3 = Statics.field2497.method2305();
            arg0.method2863(var2, var3);
        }
    }

    @ObfuscatedName("cx.x(Lek;IIIBZI)V")
    public static void method1941(class148 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class152 var8 = (class152) field2513.method3263(var6);
        if (var8 != null) {
            return;
        }
        class152 var9 = (class152) field2505.method3263(var6);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) field2502.method3263(var6);
        if (var10 == null) {
            if (!arg5) {
                class152 var11 = (class152) field2507.method3263(var6);
                if (var11 != null) {
                    return;
                }
            }
            class152 var12 = new class152();
            var12.field2525 = arg0;
            var12.field2521 = arg3;
            var12.field2520 = arg4;
            if (arg5) {
                field2513.method3264(var12, var6);
                field2512++;
            } else {
                field2504.method3341(var12);
                field2502.method3264(var12, var6);
                field2506++;
            }
        } else if (arg5) {
            var10.method3356();
            field2513.method3264(var10, var6);
            field2506--;
            field2512++;
        }
    }

    @ObfuscatedName("cu.c(IIB)V")
    public static void method1831(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class152 var4 = (class152) field2502.method3263(var2);
        if (var4 != null) {
            field2504.method3342(var4);
        }
    }

    @ObfuscatedName("k.n(III)I")
    public static int method546(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1764 != null && Statics.field1764.field2881 == var2 ? Statics.field1857.field1837 * 99 / (Statics.field1857.field1838.length - Statics.field1764.field2520) + 1 : 0;
    }
}
