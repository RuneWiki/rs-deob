package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iw")
public class class250 {

    @ObfuscatedName("iw.v")
    public static int field3360 = 0;

    @ObfuscatedName("iw.r")
    public static class202 field3358 = new class202(4096);

    @ObfuscatedName("iw.h")
    public static int field3349 = 0;

    @ObfuscatedName("iw.d")
    public static class202 field3350 = new class202(32);

    @ObfuscatedName("iw.s")
    public static int field3351 = 0;

    @ObfuscatedName("iw.b")
    public static class196 field3352 = new class196();

    @ObfuscatedName("iw.e")
    public static class202 field3353 = new class202(4096);

    @ObfuscatedName("iw.f")
    public static int field3354 = 0;

    @ObfuscatedName("iw.z")
    public static class202 field3355 = new class202(4096);

    @ObfuscatedName("iw.u")
    public static int field3346 = 0;

    @ObfuscatedName("iw.t")
    public static class185 field3348 = new class185(8);

    @ObfuscatedName("iw.a")
    public static int field3361 = 0;

    @ObfuscatedName("iw.m")
    public static CRC32 field3359 = new CRC32();

    @ObfuscatedName("iw.l")
    public static class249[] field3345 = new class249[256];

    @ObfuscatedName("iw.j")
    public static byte field3365 = 0;

    @ObfuscatedName("iw.g")
    public static int field3362 = 0;

    @ObfuscatedName("iw.c")
    public static int field3363 = 0;

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.v(Lfl;ZI)V")
    public static void method309(class160 arg0, boolean arg1) {
        if (Statics.field3357 != null) {
            try {
                Statics.field3357.method2826();
            } catch (Exception var10) {
            }
            Statics.field3357 = null;
        }
        Statics.field3357 = arg0;
        Statics.method4472(arg1);
        field3348.field2529 = 0;
        Statics.field406 = null;
        Statics.field2919 = null;
        field3361 = 0;
        while (true) {
            class246 var3 = (class246) field3350.method3419();
            if (var3 == null) {
                while (true) {
                    class246 var4 = (class246) field3355.method3419();
                    if (var4 == null) {
                        if (field3365 != 0) {
                            try {
                                class185 var5 = new class185(4);
                                var5.method3157(4);
                                var5.method3157(field3365);
                                var5.method3006(0);
                                Statics.field3357.method2811(var5.field2528, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3357.method2826();
                                } catch (Exception var8) {
                                }
                                field3363++;
                                Statics.field3357 = null;
                            }
                        }
                        field3360 = 0;
                        Statics.field3347 = class187.method938();
                        return;
                    }
                    field3352.method3360(var4);
                    field3353.method3417(var4, var4.field2597);
                    field3354++;
                    field3346--;
                }
            }
            field3358.method3417(var3, var3.field2597);
            field3349++;
            field3351--;
        }
    }

    @ObfuscatedName("ei.y(Lif;II)V")
    public static void method2517(class249 arg0, int arg1) {
        if (Statics.field1297 == null) {
            method705((class249) null, 255, 255, 0, (byte) 0, true);
            field3345[arg1] = arg0;
        } else {
            Statics.field1297.field2529 = arg1 * 8 + 5;
            int var2 = Statics.field1297.method3026();
            int var3 = Statics.field1297.method3026();
            arg0.method4031(var2, var3);
        }
    }

    @ObfuscatedName("bz.r(Lif;IIIBZI)V")
    public static void method705(class249 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class246 var8 = (class246) field3358.method3416(var6);
        if (var8 != null) {
            return;
        }
        class246 var9 = (class246) field3350.method3416(var6);
        if (var9 != null) {
            return;
        }
        class246 var10 = (class246) field3353.method3416(var6);
        if (var10 == null) {
            if (!arg5) {
                class246 var11 = (class246) field3355.method3416(var6);
                if (var11 != null) {
                    return;
                }
            }
            class246 var12 = new class246();
            var12.field3304 = arg0;
            var12.field3305 = arg3;
            var12.field3306 = arg4;
            if (arg5) {
                field3358.method3417(var12, var6);
                field3349++;
            } else {
                field3352.method3372(var12);
                field3353.method3417(var12, var6);
                field3354++;
            }
        } else if (arg5) {
            var10.method3515();
            field3358.method3417(var10, var6);
            field3354--;
            field3349++;
        }
    }

    @ObfuscatedName("g.h(III)I")
    public static int method157(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field406 != null && Statics.field406.field2597 == var2 ? Statics.field2919.field2529 * 99 / (Statics.field2919.field2528.length - Statics.field406.field3306) + 1 : 0;
    }

    @ObfuscatedName("bl.d(ZZI)I")
    public static int method1018(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3351 + field3349;
        }
        if (arg1) {
            var2 += field3354 + field3346;
        }
        return var2;
    }

    @ObfuscatedName("fy.s(I)V")
    public static void method2935() {
        if (Statics.field3357 != null) {
            Statics.field3357.method2826();
        }
    }
}
