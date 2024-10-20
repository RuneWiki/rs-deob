package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("jv")
public class class265 {

    @ObfuscatedName("jv.z")
    public static int field3408 = 0;

    @ObfuscatedName("jv.r")
    public static class215 field3409 = new class215(4096);

    @ObfuscatedName("jv.e")
    public static int field3410 = 0;

    @ObfuscatedName("jv.y")
    public static class215 field3411 = new class215(32);

    @ObfuscatedName("jv.k")
    public static int field3407 = 0;

    @ObfuscatedName("jv.s")
    public static class207 field3412 = new class207();

    @ObfuscatedName("jv.p")
    public static class215 field3414 = new class215(4096);

    @ObfuscatedName("jv.x")
    public static int field3406 = 0;

    @ObfuscatedName("jv.m")
    public static class215 field3416 = new class215(4096);

    @ObfuscatedName("jv.h")
    public static int field3417 = 0;

    @ObfuscatedName("jv.u")
    public static class195 field3418 = new class195(8);

    @ObfuscatedName("jv.v")
    public static int field3413 = 0;

    @ObfuscatedName("jv.b")
    public static CRC32 field3421 = new CRC32();

    @ObfuscatedName("jv.j")
    public static class264[] field3425 = new class264[256];

    @ObfuscatedName("jv.l")
    public static byte field3423 = 0;

    @ObfuscatedName("jv.g")
    public static int field3424 = 0;

    @ObfuscatedName("jv.w")
    public static int field3422 = 0;

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.d(ZI)V")
    public static void method467(boolean arg0) {
        if (Statics.field3420 == null) {
            return;
        }
        try {
            class195 var1 = new class195(4);
            var1.method3243(arg0 ? 2 : 3);
            var1.method3325(0);
            Statics.field3420.method3050(var1.field2569, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3420.method3049();
            } catch (Exception var4) {
            }
            field3422++;
            Statics.field3420 = null;
        }
    }

    @ObfuscatedName("ep.z(Ljs;IB)V")
    public static void method2907(class264 arg0, int arg1) {
        if (Statics.field334 == null) {
            method3888((class264) null, 255, 255, 0, (byte) 0, true);
            field3425[arg1] = arg0;
        } else {
            Statics.field334.field2568 = arg1 * 8 + 5;
            int var2 = Statics.field334.method3264();
            int var3 = Statics.field334.method3264();
            arg0.method4380(var2, var3);
        }
    }

    @ObfuscatedName("hc.n(Ljs;IIIBZI)V")
    public static void method3888(class264 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class261 var8 = (class261) field3409.method3736(var6);
        if (var8 != null) {
            return;
        }
        class261 var9 = (class261) field3411.method3736(var6);
        if (var9 != null) {
            return;
        }
        class261 var10 = (class261) field3414.method3736(var6);
        if (var10 == null) {
            if (!arg5) {
                class261 var11 = (class261) field3416.method3736(var6);
                if (var11 != null) {
                    return;
                }
            }
            class261 var12 = new class261();
            var12.field3366 = arg0;
            var12.field3368 = arg3;
            var12.field3367 = arg4;
            if (arg5) {
                field3409.method3745(var12, var6);
                field3410++;
            } else {
                field3412.method3637(var12);
                field3414.method3745(var12, var6);
                field3406++;
            }
        } else if (arg5) {
            var10.method3828();
            field3409.method3745(var10, var6);
            field3406--;
            field3410++;
        }
    }
}
