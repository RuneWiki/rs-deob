package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ip")
public class class237 {

    @ObfuscatedName("ip.t")
    public static int field3151 = 0;

    @ObfuscatedName("ip.q")
    public static class318 field3153 = new class318(4096);

    @ObfuscatedName("ip.v")
    public static int field3154 = 0;

    @ObfuscatedName("ip.l")
    public static class318 field3155 = new class318(32);

    @ObfuscatedName("ip.c")
    public static int field3156 = 0;

    @ObfuscatedName("ip.o")
    public static class260 field3157 = new class260();

    @ObfuscatedName("ip.i")
    public static class318 field3158 = new class318(4096);

    @ObfuscatedName("ip.d")
    public static int field3163 = 0;

    @ObfuscatedName("ip.m")
    public static class318 field3169 = new class318(4096);

    @ObfuscatedName("ip.p")
    public static int field3161 = 0;

    @ObfuscatedName("ip.x")
    public static class300 field3152 = new class300(8);

    @ObfuscatedName("ip.r")
    public static int field3162 = 0;

    @ObfuscatedName("ip.s")
    public static CRC32 field3167 = new CRC32();

    @ObfuscatedName("ip.z")
    public static class236[] field3165 = new class236[256];

    @ObfuscatedName("ip.f")
    public static byte field3166 = 0;

    @ObfuscatedName("ip.g")
    public static int field3159 = 0;

    @ObfuscatedName("ip.w")
    public static int field3168 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.a(ZB)V")
    public static void method3110(boolean arg0) {
        if (Statics.field3160 == null) {
            return;
        }
        try {
            class300 var1 = new class300(4);
            var1.method5253(arg0 ? 2 : 3);
            var1.method5109(0);
            Statics.field3160.method3299(var1.field3699, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3160.method3292();
            } catch (Exception var4) {
            }
            field3168++;
            Statics.field3160 = null;
        }
    }

    @ObfuscatedName("ik.t(Lku;ZI)V")
    public static void method4058(class305 arg0, boolean arg1) {
        if (Statics.field3160 != null) {
            try {
                Statics.field3160.method3292();
            } catch (Exception var10) {
            }
            Statics.field3160 = null;
        }
        Statics.field3160 = arg0;
        method3110(arg1);
        field3152.field3694 = 0;
        Statics.field1980 = null;
        Statics.field1869 = null;
        field3162 = 0;
        while (true) {
            class233 var3 = (class233) field3155.method5536();
            if (var3 == null) {
                while (true) {
                    class233 var4 = (class233) field3169.method5536();
                    if (var4 == null) {
                        if (field3166 != 0) {
                            try {
                                class300 var5 = new class300(4);
                                var5.method5253(4);
                                var5.method5253(field3166);
                                var5.method5128(0);
                                Statics.field3160.method3299(var5.field3699, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3160.method3292();
                                } catch (Exception var8) {
                                }
                                field3168++;
                                Statics.field3160 = null;
                            }
                        }
                        field3151 = 0;
                        Statics.field3150 = class297.method3777();
                        return;
                    }
                    field3157.method4496(var4);
                    field3158.method5529(var4, var4.field2091);
                    field3163++;
                    field3161--;
                }
            }
            field3153.method5529(var3, var3.field2091);
            field3154++;
            field3156--;
        }
    }

    @ObfuscatedName("fs.n(Lij;IIIBZI)V")
    public static void method3238(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3153.method5528(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3155.method5528(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3158.method5528(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3169.method5528(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3108 = arg0;
            var12.field3107 = arg3;
            var12.field3109 = arg4;
            if (arg5) {
                field3153.method5529(var12, var6);
                field3154++;
            } else {
                field3157.method4491(var12);
                field3158.method5529(var12, var6);
                field3163++;
            }
        } else if (arg5) {
            var10.method3378();
            field3153.method5529(var10, var6);
            field3163--;
            field3154++;
        }
    }

    @ObfuscatedName("dh.q(III)V")
    public static void method2724(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class233 var4 = (class233) field3158.method5528(var2);
        if (var4 != null) {
            field3157.method4496(var4);
        }
    }

    @ObfuscatedName("dq.v(III)I")
    public static int method2382(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1980 != null && Statics.field1980.field2091 == var2 ? Statics.field1869.field3694 * 99 / (Statics.field1869.field3699.length - Statics.field1980.field3109) + 1 : 0;
    }

    @ObfuscatedName("ge.l(I)V")
    public static void method3413() {
        if (Statics.field3160 != null) {
            Statics.field3160.method3292();
        }
    }
}
