package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ij")
public class class253 {

    @ObfuscatedName("ij.l")
    public static int field3264 = 0;

    @ObfuscatedName("ij.s")
    public static class205 field3266 = new class205(4096);

    @ObfuscatedName("ij.e")
    public static int field3258 = 0;

    @ObfuscatedName("ij.a")
    public static class205 field3260 = new class205(32);

    @ObfuscatedName("ij.c")
    public static int field3256 = 0;

    @ObfuscatedName("ij.p")
    public static class197 field3262 = new class197();

    @ObfuscatedName("ij.r")
    public static class205 field3261 = new class205(4096);

    @ObfuscatedName("ij.m")
    public static int field3267 = 0;

    @ObfuscatedName("ij.d")
    public static class205 field3265 = new class205(4096);

    @ObfuscatedName("ij.z")
    public static int field3257 = 0;

    @ObfuscatedName("ij.g")
    public static class185 field3259 = new class185(8);

    @ObfuscatedName("ij.b")
    public static int field3270 = 0;

    @ObfuscatedName("ij.t")
    public static CRC32 field3271 = new CRC32();

    @ObfuscatedName("ij.h")
    public static class252[] field3272 = new class252[256];

    @ObfuscatedName("ij.o")
    public static byte field3273 = 0;

    @ObfuscatedName("ij.i")
    public static int field3263 = 0;

    @ObfuscatedName("ij.k")
    public static int field3275 = 0;

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.l(Lim;IIIBZI)V")
    public static void method1756(class252 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class249 var8 = (class249) field3266.method3774(var6);
        if (var8 != null) {
            return;
        }
        class249 var9 = (class249) field3260.method3774(var6);
        if (var9 != null) {
            return;
        }
        class249 var10 = (class249) field3261.method3774(var6);
        if (var10 == null) {
            if (!arg5) {
                class249 var11 = (class249) field3265.method3774(var6);
                if (var11 != null) {
                    return;
                }
            }
            class249 var12 = new class249();
            var12.field3219 = arg0;
            var12.field3218 = arg3;
            var12.field3220 = arg4;
            if (arg5) {
                field3266.method3773(var12, var6);
                field3258++;
            } else {
                field3262.method3685(var12);
                field3261.method3773(var12, var6);
                field3267++;
            }
        } else if (arg5) {
            var10.method3851();
            field3266.method3773(var10, var6);
            field3267--;
            field3258++;
        }
    }

    @ObfuscatedName("bj.w(B)V")
    public static void method1735() {
        if (Statics.field3269 != null) {
            Statics.field3269.method3113();
        }
    }
}
