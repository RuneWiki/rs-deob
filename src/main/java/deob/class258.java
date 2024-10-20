package deob;

import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class258 {

    @ObfuscatedName("io.s")
    public static int field3290 = 0;

    @ObfuscatedName("io.x")
    public static class210 field3278 = new class210(4096);

    @ObfuscatedName("io.h")
    public static int field3279 = 0;

    @ObfuscatedName("io.f")
    public static class210 field3294 = new class210(32);

    @ObfuscatedName("io.p")
    public static int field3281 = 0;

    @ObfuscatedName("io.m")
    public static class202 field3282 = new class202();

    @ObfuscatedName("io.q")
    public static class210 field3283 = new class210(4096);

    @ObfuscatedName("io.b")
    public static int field3284 = 0;

    @ObfuscatedName("io.n")
    public static class210 field3280 = new class210(4096);

    @ObfuscatedName("io.e")
    public static int field3286 = 0;

    @ObfuscatedName("io.l")
    public static class190 field3288 = new class190(8);

    @ObfuscatedName("io.u")
    public static int field3276 = 0;

    @ObfuscatedName("io.k")
    public static CRC32 field3291 = new CRC32();

    @ObfuscatedName("io.d")
    public static class257[] field3287 = new class257[256];

    @ObfuscatedName("io.w")
    public static byte field3292 = 0;

    @ObfuscatedName("io.i")
    public static int field3289 = 0;

    @ObfuscatedName("io.c")
    public static int field3295 = 0;

    public class258() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.a(Lin;II)V")
    public static void method1607(class257 arg0, int arg1) {
        if (Statics.field59 == null) {
            method378((class257) null, 255, 255, 0, (byte) 0, true);
            field3287[arg1] = arg0;
        } else {
            Statics.field59.field2419 = arg1 * 8 + 5;
            int var2 = Statics.field59.method3460();
            int var3 = Statics.field59.method3460();
            arg0.method4535(var2, var3);
        }
    }

    @ObfuscatedName("ay.s(Lin;IIIBZI)V")
    public static void method378(class257 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class254 var8 = (class254) field3278.method3911(var6);
        if (var8 != null) {
            return;
        }
        class254 var9 = (class254) field3294.method3911(var6);
        if (var9 != null) {
            return;
        }
        class254 var10 = (class254) field3283.method3911(var6);
        if (var10 == null) {
            if (!arg5) {
                class254 var11 = (class254) field3280.method3911(var6);
                if (var11 != null) {
                    return;
                }
            }
            class254 var12 = new class254();
            var12.field3238 = arg0;
            var12.field3233 = arg3;
            var12.field3235 = arg4;
            if (arg5) {
                field3278.method3920(var12, var6);
                field3279++;
            } else {
                field3282.method3818(var12);
                field3283.method3920(var12, var6);
                field3284++;
            }
        } else if (arg5) {
            var10.method3997();
            field3278.method3920(var10, var6);
            field3284--;
            field3279++;
        }
    }

    @ObfuscatedName("cx.g(III)V")
    public static void method1930(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class254 var4 = (class254) field3283.method3911(var2);
        if (var4 != null) {
            field3282.method3820(var4);
        }
    }
}
