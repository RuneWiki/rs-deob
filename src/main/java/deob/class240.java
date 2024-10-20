package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("it")
public class class240 {

    @ObfuscatedName("it.j")
    public static int field3266 = 0;

    @ObfuscatedName("it.r")
    public static class192 field3257 = new class192(4096);

    @ObfuscatedName("it.o")
    public static int field3258 = 0;

    @ObfuscatedName("it.n")
    public static class192 field3274 = new class192(32);

    @ObfuscatedName("it.q")
    public static int field3260 = 0;

    @ObfuscatedName("it.b")
    public static class186 field3259 = new class186();

    @ObfuscatedName("it.k")
    public static class192 field3265 = new class192(4096);

    @ObfuscatedName("it.s")
    public static int field3255 = 0;

    @ObfuscatedName("it.d")
    public static class192 field3264 = new class192(4096);

    @ObfuscatedName("it.l")
    public static int field3267 = 0;

    @ObfuscatedName("it.v")
    public static class175 field3262 = new class175(8);

    @ObfuscatedName("it.z")
    public static int field3261 = 0;

    @ObfuscatedName("it.e")
    public static CRC32 field3268 = new CRC32();

    @ObfuscatedName("it.m")
    public static class239[] field3269 = new class239[256];

    @ObfuscatedName("it.x")
    public static byte field3270 = 0;

    @ObfuscatedName("it.h")
    public static int field3271 = 0;

    @ObfuscatedName("it.f")
    public static int field3275 = 0;

    public class240() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.i(ZI)V")
    public static void method146(boolean arg0) {
        if (Statics.field3905 == null) {
            return;
        }
        try {
            class175 var1 = new class175(4);
            var1.method3102(arg0 ? 2 : 3);
            var1.method3196(0);
            Statics.field3905.method2813(var1.field2392, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3905.method2810();
            } catch (Exception var4) {
            }
            field3275++;
            Statics.field3905 = null;
        }
    }

    @ObfuscatedName("bv.j(Lff;ZI)V")
    public static void method755(class161 arg0, boolean arg1) {
        if (Statics.field3905 != null) {
            try {
                Statics.field3905.method2810();
            } catch (Exception var10) {
            }
            Statics.field3905 = null;
        }
        Statics.field3905 = arg0;
        method146(arg1);
        field3262.field2395 = 0;
        Statics.field429 = null;
        Statics.field3191 = null;
        field3261 = 0;
        while (true) {
            class236 var3 = (class236) field3274.method3365();
            if (var3 == null) {
                while (true) {
                    class236 var4 = (class236) field3264.method3365();
                    if (var4 == null) {
                        if (field3270 != 0) {
                            try {
                                class175 var5 = new class175(4);
                                var5.method3102(4);
                                var5.method3102(field3270);
                                var5.method2978(0);
                                Statics.field3905.method2813(var5.field2392, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3905.method2810();
                                } catch (Exception var8) {
                                }
                                field3275++;
                                Statics.field3905 = null;
                            }
                        }
                        field3266 = 0;
                        Statics.field3256 = class177.method608();
                        return;
                    }
                    field3259.method3303(var4);
                    field3265.method3359(var4, var4.field2475);
                    field3255++;
                    field3267--;
                }
            }
            field3257.method3359(var3, var3.field2475);
            field3258++;
            field3260--;
        }
    }

    @ObfuscatedName("cx.a(Lib;IIIBZI)V")
    public static void method1573(class239 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class236 var8 = (class236) field3257.method3358(var6);
        if (var8 != null) {
            return;
        }
        class236 var9 = (class236) field3274.method3358(var6);
        if (var9 != null) {
            return;
        }
        class236 var10 = (class236) field3265.method3358(var6);
        if (var10 == null) {
            if (!arg5) {
                class236 var11 = (class236) field3264.method3358(var6);
                if (var11 != null) {
                    return;
                }
            }
            class236 var12 = new class236();
            var12.field3209 = arg0;
            var12.field3214 = arg3;
            var12.field3210 = arg4;
            if (arg5) {
                field3257.method3359(var12, var6);
                field3258++;
            } else {
                field3259.method3308(var12);
                field3265.method3359(var12, var6);
                field3255++;
            }
        } else if (arg5) {
            var10.method3445();
            field3257.method3359(var10, var6);
            field3255--;
            field3258++;
        }
    }

    @ObfuscatedName("fk.r(III)V")
    public static void method2896(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class236 var4 = (class236) field3265.method3358(var2);
        if (var4 != null) {
            field3259.method3303(var4);
        }
    }

    @ObfuscatedName("bv.o(ZZB)I")
    public static int method756(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3260 + field3258;
        }
        if (arg1) {
            var2 += field3267 + field3255;
        }
        return var2;
    }

    @ObfuscatedName("hn.n(S)V")
    public static void method3802() {
        if (Statics.field3905 != null) {
            Statics.field3905.method2810();
        }
    }
}
