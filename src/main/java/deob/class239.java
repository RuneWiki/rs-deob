package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ig")
public class class239 {

    @ObfuscatedName("ig.o")
    public static int field3230 = 0;

    @ObfuscatedName("ig.u")
    public static class191 field3225 = new class191(4096);

    @ObfuscatedName("ig.g")
    public static int field3226 = 0;

    @ObfuscatedName("ig.m")
    public static class191 field3234 = new class191(32);

    @ObfuscatedName("ig.s")
    public static int field3239 = 0;

    @ObfuscatedName("ig.x")
    public static class185 field3233 = new class185();

    @ObfuscatedName("ig.p")
    public static class191 field3228 = new class191(4096);

    @ObfuscatedName("ig.k")
    public static int field3222 = 0;

    @ObfuscatedName("ig.r")
    public static class191 field3232 = new class191(4096);

    @ObfuscatedName("ig.w")
    public static int field3229 = 0;

    @ObfuscatedName("ig.t")
    public static class174 field3235 = new class174(8);

    @ObfuscatedName("ig.e")
    public static int field3236 = 0;

    @ObfuscatedName("ig.l")
    public static CRC32 field3223 = new CRC32();

    @ObfuscatedName("ig.f")
    public static class238[] field3243 = new class238[256];

    @ObfuscatedName("ig.j")
    public static byte field3240 = 0;

    @ObfuscatedName("ig.n")
    public static int field3241 = 0;

    @ObfuscatedName("ig.z")
    public static int field3242 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.c(ZB)V")
    public static void method1512(boolean arg0) {
        if (Statics.field3227 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2922(arg0 ? 2 : 3);
            var1.method2847(0);
            Statics.field3227.method2689(var1.field2355, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3227.method2684();
            } catch (Exception var4) {
            }
            field3242++;
            Statics.field3227 = null;
        }
    }

    @ObfuscatedName("hh.o(Lix;IIIBZI)V")
    public static void method3698(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3225.method3251(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3234.method3251(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3228.method3251(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3232.method3251(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3177 = arg0;
            var12.field3179 = arg3;
            var12.field3178 = arg4;
            if (arg5) {
                field3225.method3239(var12, var6);
                field3226++;
            } else {
                field3233.method3186(var12);
                field3228.method3239(var12, var6);
                field3222++;
            }
        } else if (arg5) {
            var10.method3320();
            field3225.method3239(var10, var6);
            field3222--;
            field3226++;
        }
    }

    @ObfuscatedName("aq.i(III)V")
    public static void method597(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3228.method3251(var2);
        if (var4 != null) {
            field3233.method3178(var4);
        }
    }

    @ObfuscatedName("bm.u(IIB)I")
    public static int method941(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3238 != null && Statics.field3238.field2437 == var2 ? Statics.field2155.field2357 * 99 / (Statics.field2155.field2355.length - Statics.field3238.field3178) + 1 : 0;
    }

    @ObfuscatedName("bu.g(ZZI)I")
    public static int method662(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3239 + field3226;
        }
        if (arg1) {
            var2 += field3229 + field3222;
        }
        return var2;
    }

    @ObfuscatedName("cv.m(I)V")
    public static void method1653() {
        if (Statics.field3227 != null) {
            Statics.field3227.method2684();
        }
    }
}
