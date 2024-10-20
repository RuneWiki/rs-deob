package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ii")
public class class248 {

    @ObfuscatedName("ii.v")
    public static int field3206 = 0;

    @ObfuscatedName("ii.c")
    public static class329 field3218 = new class329(4096);

    @ObfuscatedName("ii.y")
    public static int field3207 = 0;

    @ObfuscatedName("ii.h")
    public static class329 field3208 = new class329(32);

    @ObfuscatedName("ii.z")
    public static int field3209 = 0;

    @ObfuscatedName("ii.e")
    public static class271 field3210 = new class271();

    @ObfuscatedName("ii.q")
    public static class329 field3211 = new class329(4096);

    @ObfuscatedName("ii.l")
    public static int field3217 = 0;

    @ObfuscatedName("ii.s")
    public static class329 field3213 = new class329(4096);

    @ObfuscatedName("ii.b")
    public static int field3216 = 0;

    @ObfuscatedName("ii.k")
    public static class311 field3215 = new class311(8);

    @ObfuscatedName("ii.x")
    public static int field3220 = 0;

    @ObfuscatedName("ii.g")
    public static CRC32 field3204 = new CRC32();

    @ObfuscatedName("ii.t")
    public static class247[] field3219 = new class247[256];

    @ObfuscatedName("ii.p")
    public static byte field3214 = 0;

    @ObfuscatedName("ii.m")
    public static int field3221 = 0;

    @ObfuscatedName("ii.r")
    public static int field3222 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.v(Liy;IIIBZI)V")
    public static void method293(class247 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class244 var8 = (class244) field3218.method5682(var6);
        if (var8 != null) {
            return;
        }
        class244 var9 = (class244) field3208.method5682(var6);
        if (var9 != null) {
            return;
        }
        class244 var10 = (class244) field3211.method5682(var6);
        if (var10 == null) {
            if (!arg5) {
                class244 var11 = (class244) field3213.method5682(var6);
                if (var11 != null) {
                    return;
                }
            }
            class244 var12 = new class244();
            var12.field3164 = arg0;
            var12.field3163 = arg3;
            var12.field3165 = arg4;
            if (arg5) {
                field3218.method5683(var12, var6);
                field3207++;
            } else {
                field3210.method4618(var12);
                field3211.method5683(var12, var6);
                field3217++;
            }
        } else if (arg5) {
            var10.method3481();
            field3218.method5683(var10, var6);
            field3217--;
            field3207++;
        }
    }

    @ObfuscatedName("au.c(B)V")
    public static void method667() {
        if (Statics.field3678 != null) {
            Statics.field3678.method3413();
        }
    }
}
