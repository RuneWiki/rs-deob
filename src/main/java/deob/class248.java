package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iq")
public class class248 {

    @ObfuscatedName("iq.f")
    public static int field3252 = 0;

    @ObfuscatedName("iq.w")
    public static class319 field3245 = new class319(4096);

    @ObfuscatedName("iq.o")
    public static int field3242 = 0;

    @ObfuscatedName("iq.u")
    public static class319 field3247 = new class319(32);

    @ObfuscatedName("iq.g")
    public static int field3248 = 0;

    @ObfuscatedName("iq.l")
    public static class271 field3249 = new class271();

    @ObfuscatedName("iq.e")
    public static class319 field3250 = new class319(4096);

    @ObfuscatedName("iq.x")
    public static int field3251 = 0;

    @ObfuscatedName("iq.d")
    public static class319 field3259 = new class319(4096);

    @ObfuscatedName("iq.k")
    public static int field3243 = 0;

    @ObfuscatedName("iq.a")
    public static class202 field3254 = new class202(8);

    @ObfuscatedName("iq.j")
    public static int field3255 = 0;

    @ObfuscatedName("iq.t")
    public static CRC32 field3258 = new CRC32();

    @ObfuscatedName("iq.h")
    public static class247[] field3253 = new class247[256];

    @ObfuscatedName("iq.b")
    public static byte field3257 = 0;

    @ObfuscatedName("iq.c")
    public static int field3260 = 0;

    @ObfuscatedName("iq.r")
    public static int field3256 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.m(ZB)V")
    public static void method3061(boolean arg0) {
        if (Statics.field3261 == null) {
            return;
        }
        try {
            class202 var1 = new class202(4);
            var1.method3565(arg0 ? 2 : 3);
            var1.method3419(0);
            Statics.field3261.method3178(var1.field2440, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3261.method3179();
            } catch (Exception var4) {
            }
            field3256++;
            Statics.field3261 = null;
        }
    }

    @ObfuscatedName("hx.f(Lit;IIIBZI)V")
    public static void method3721(class247 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class244 var8 = (class244) field3245.method5416(var6);
        if (var8 != null) {
            return;
        }
        class244 var9 = (class244) field3247.method5416(var6);
        if (var9 != null) {
            return;
        }
        class244 var10 = (class244) field3250.method5416(var6);
        if (var10 == null) {
            if (!arg5) {
                class244 var11 = (class244) field3259.method5416(var6);
                if (var11 != null) {
                    return;
                }
            }
            class244 var12 = new class244();
            var12.field3201 = arg0;
            var12.field3200 = arg3;
            var12.field3202 = arg4;
            if (arg5) {
                field3245.method5412(var12, var6);
                field3242++;
            } else {
                field3249.method4815(var12);
                field3250.method5412(var12, var6);
                field3251++;
            }
        } else if (arg5) {
            var10.method3294();
            field3245.method5412(var10, var6);
            field3251--;
            field3242++;
        }
    }

    @ObfuscatedName("bs.q(III)I")
    public static int method948(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1847 != null && Statics.field1847.field2139 == var2 ? Statics.field172.field2439 * 99 / (Statics.field172.field2440.length - Statics.field1847.field3202) + 1 : 0;
    }
}
