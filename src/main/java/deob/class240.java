package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ip")
public class class240 {

    @ObfuscatedName("ip.h")
    public static int field3238 = 0;

    @ObfuscatedName("ip.p")
    public static class192 field3251 = new class192(4096);

    @ObfuscatedName("ip.x")
    public static int field3241 = 0;

    @ObfuscatedName("ip.g")
    public static class192 field3242 = new class192(32);

    @ObfuscatedName("ip.c")
    public static int field3243 = 0;

    @ObfuscatedName("ip.l")
    public static class186 field3244 = new class186();

    @ObfuscatedName("ip.w")
    public static class192 field3240 = new class192(4096);

    @ObfuscatedName("ip.b")
    public static int field3246 = 0;

    @ObfuscatedName("ip.o")
    public static class192 field3254 = new class192(4096);

    @ObfuscatedName("ip.m")
    public static int field3248 = 0;

    @ObfuscatedName("ip.r")
    public static class175 field3239 = new class175(8);

    @ObfuscatedName("ip.a")
    public static int field3252 = 0;

    @ObfuscatedName("ip.t")
    public static CRC32 field3250 = new CRC32();

    @ObfuscatedName("ip.z")
    public static class239[] field3237 = new class239[256];

    @ObfuscatedName("ip.u")
    public static byte field3255 = 0;

    @ObfuscatedName("ip.k")
    public static int field3256 = 0;

    @ObfuscatedName("ip.q")
    public static int field3257 = 0;

    public class240() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.j(ZI)V")
    public static void method564(boolean arg0) {
        if (Statics.field3247 == null) {
            return;
        }
        try {
            class175 var1 = new class175(4);
            var1.method2888(arg0 ? 2 : 3);
            var1.method3053(0);
            Statics.field3247.method2749(var1.field2390, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3247.method2745();
            } catch (Exception var4) {
            }
            field3257++;
            Statics.field3247 = null;
        }
    }

    @ObfuscatedName("fk.h(Lil;IIIBZI)V")
    public static void method3118(class239 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class236 var8 = (class236) field3251.method3281(var6);
        if (var8 != null) {
            return;
        }
        class236 var9 = (class236) field3242.method3281(var6);
        if (var9 != null) {
            return;
        }
        class236 var10 = (class236) field3240.method3281(var6);
        if (var10 == null) {
            if (!arg5) {
                class236 var11 = (class236) field3254.method3281(var6);
                if (var11 != null) {
                    return;
                }
            }
            class236 var12 = new class236();
            var12.field3200 = arg0;
            var12.field3199 = arg3;
            var12.field3201 = arg4;
            if (arg5) {
                field3251.method3274(var12, var6);
                field3241++;
            } else {
                field3244.method3220(var12);
                field3240.method3274(var12, var6);
                field3246++;
            }
        } else if (arg5) {
            var10.method3350();
            field3251.method3274(var10, var6);
            field3246--;
            field3241++;
        }
    }

    @ObfuscatedName("ec.f(I)V")
    public static void method2476() {
        if (Statics.field3247 != null) {
            Statics.field3247.method2745();
        }
    }
}
