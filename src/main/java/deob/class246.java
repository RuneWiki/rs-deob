package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ir")
public class class246 {

    @ObfuscatedName("ir.x")
    public static int field3337 = 0;

    @ObfuscatedName("ir.z")
    public static class198 field3324 = new class198(4096);

    @ObfuscatedName("ir.v")
    public static int field3342 = 0;

    @ObfuscatedName("ir.m")
    public static class198 field3339 = new class198(32);

    @ObfuscatedName("ir.b")
    public static int field3329 = 0;

    @ObfuscatedName("ir.t")
    public static class192 field3330 = new class192();

    @ObfuscatedName("ir.p")
    public static class198 field3331 = new class198(4096);

    @ObfuscatedName("ir.r")
    public static int field3332 = 0;

    @ObfuscatedName("ir.l")
    public static class198 field3333 = new class198(4096);

    @ObfuscatedName("ir.u")
    public static int field3334 = 0;

    @ObfuscatedName("ir.y")
    public static class181 field3323 = new class181(8);

    @ObfuscatedName("ir.f")
    public static int field3327 = 0;

    @ObfuscatedName("ir.e")
    public static CRC32 field3338 = new CRC32();

    @ObfuscatedName("ir.h")
    public static class245[] field3325 = new class245[256];

    @ObfuscatedName("ir.i")
    public static byte field3341 = 0;

    @ObfuscatedName("ir.o")
    public static int field3326 = 0;

    @ObfuscatedName("ir.w")
    public static int field3343 = 0;

    public class246() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.d(ZI)V")
    public static void method2850(boolean arg0) {
        if (Statics.field3328 == null) {
            return;
        }
        try {
            class181 var1 = new class181(4);
            var1.method3020(arg0 ? 2 : 3);
            var1.method3137(0);
            Statics.field3328.method2871(var1.field2496, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3328.method2867();
            } catch (Exception var4) {
            }
            field3343++;
            Statics.field3328 = null;
        }
    }

    @ObfuscatedName("hx.x(Liv;IIIBZB)V")
    public static void method3888(class245 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class242 var8 = (class242) field3324.method3438(var6);
        if (var8 != null) {
            return;
        }
        class242 var9 = (class242) field3339.method3438(var6);
        if (var9 != null) {
            return;
        }
        class242 var10 = (class242) field3331.method3438(var6);
        if (var10 == null) {
            if (!arg5) {
                class242 var11 = (class242) field3333.method3438(var6);
                if (var11 != null) {
                    return;
                }
            }
            class242 var12 = new class242();
            var12.field3286 = arg0;
            var12.field3288 = arg3;
            var12.field3287 = arg4;
            if (arg5) {
                field3324.method3431(var12, var6);
                field3342++;
            } else {
                field3330.method3373(var12);
                field3331.method3431(var12, var6);
                field3332++;
            }
        } else if (arg5) {
            var10.method3514();
            field3324.method3431(var10, var6);
            field3332--;
            field3342++;
        }
    }

    @ObfuscatedName("cz.k(IIB)I")
    public static int method1685(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3464 != null && Statics.field3464.field2564 == var2 ? Statics.field3336.field2498 * 99 / (Statics.field3336.field2496.length - Statics.field3464.field3287) + 1 : 0;
    }

    @ObfuscatedName("do.z(ZZI)I")
    public static int method1984(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3342 + field3329;
        }
        if (arg1) {
            var2 += field3334 + field3332;
        }
        return var2;
    }
}
