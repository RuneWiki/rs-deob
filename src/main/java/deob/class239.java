package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ia")
public class class239 {

    @ObfuscatedName("ia.p")
    public static int field3252 = 0;

    @ObfuscatedName("ia.j")
    public static class191 field3256 = new class191(4096);

    @ObfuscatedName("ia.f")
    public static int field3255 = 0;

    @ObfuscatedName("ia.m")
    public static class191 field3269 = new class191(32);

    @ObfuscatedName("ia.c")
    public static int field3257 = 0;

    @ObfuscatedName("ia.z")
    public static class185 field3254 = new class185();

    @ObfuscatedName("ia.h")
    public static class191 field3259 = new class191(4096);

    @ObfuscatedName("ia.g")
    public static int field3260 = 0;

    @ObfuscatedName("ia.e")
    public static class191 field3261 = new class191(4096);

    @ObfuscatedName("ia.o")
    public static int field3262 = 0;

    @ObfuscatedName("ia.y")
    public static class174 field3263 = new class174(8);

    @ObfuscatedName("ia.b")
    public static int field3264 = 0;

    @ObfuscatedName("ia.v")
    public static CRC32 field3265 = new CRC32();

    @ObfuscatedName("ia.w")
    public static class238[] field3266 = new class238[256];

    @ObfuscatedName("ia.l")
    public static byte field3267 = 0;

    @ObfuscatedName("ia.q")
    public static int field3268 = 0;

    @ObfuscatedName("ia.k")
    public static int field3272 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hm.n(ZB)V")
    public static void method3806(boolean arg0) {
        if (Statics.field3273 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2906(arg0 ? 2 : 3);
            var1.method2908(0);
            Statics.field3273.method2759(var1.field2401, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3273.method2755();
            } catch (Exception var4) {
            }
            field3272++;
            Statics.field3273 = null;
        }
    }

    @ObfuscatedName("fx.p(Lit;IIIBZI)V")
    public static void method2834(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3256.method3295(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3269.method3295(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3259.method3295(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3261.method3295(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3214 = arg0;
            var12.field3213 = arg3;
            var12.field3211 = arg4;
            if (arg5) {
                field3256.method3296(var12, var6);
                field3255++;
            } else {
                field3254.method3222(var12);
                field3259.method3296(var12, var6);
                field3260++;
            }
        } else if (arg5) {
            var10.method3391();
            field3256.method3296(var10, var6);
            field3260--;
            field3255++;
        }
    }

    @ObfuscatedName("cg.i(III)V")
    public static void method1473(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3259.method3295(var2);
        if (var4 != null) {
            field3254.method3224(var4);
        }
    }

    @ObfuscatedName("dg.j(ZZB)I")
    public static int method2194(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3257 + field3255;
        }
        if (arg1) {
            var2 += field3262 + field3260;
        }
        return var2;
    }

    @ObfuscatedName("fn.f(I)V")
    public static void method2904() {
        if (Statics.field3273 != null) {
            Statics.field3273.method2755();
        }
    }
}
