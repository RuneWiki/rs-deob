package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ih")
public class class239 {

    @ObfuscatedName("ih.q")
    public static int field3238 = 0;

    @ObfuscatedName("ih.y")
    public static class191 field3237 = new class191(4096);

    @ObfuscatedName("ih.e")
    public static int field3235 = 0;

    @ObfuscatedName("ih.f")
    public static class191 field3247 = new class191(32);

    @ObfuscatedName("ih.v")
    public static int field3239 = 0;

    @ObfuscatedName("ih.t")
    public static class185 field3241 = new class185();

    @ObfuscatedName("ih.i")
    public static class191 field3242 = new class191(4096);

    @ObfuscatedName("ih.r")
    public static int field3244 = 0;

    @ObfuscatedName("ih.g")
    public static class191 field3234 = new class191(4096);

    @ObfuscatedName("ih.s")
    public static int field3245 = 0;

    @ObfuscatedName("ih.u")
    public static class174 field3240 = new class174(8);

    @ObfuscatedName("ih.w")
    public static int field3248 = 0;

    @ObfuscatedName("ih.n")
    public static CRC32 field3249 = new CRC32();

    @ObfuscatedName("ih.l")
    public static class238[] field3250 = new class238[256];

    @ObfuscatedName("ih.m")
    public static byte field3251 = 0;

    @ObfuscatedName("ih.a")
    public static int field3252 = 0;

    @ObfuscatedName("ih.h")
    public static int field3253 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.d(I)Z")
    public static boolean method1616() {
        long var0 = class176.method3746();
        int var2 = (int) (var0 - Statics.field3243);
        Statics.field3243 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3238 += var2;
        if (field3245 == 0 && field3239 == 0 && field3244 == 0 && field3235 == 0) {
            return true;
        } else if (Statics.field3236 == null) {
            return false;
        } else {
            try {
                if (field3238 > 30000) {
                    throw new IOException();
                }
                while (field3239 < 20 && field3235 > 0) {
                    class235 var3 = (class235) field3237.method3265();
                    class174 var4 = new class174(4);
                    var4.method2899(1);
                    var4.method2901((int) var3.field2441);
                    Statics.field3236.method2739(var4.field2367, 0, 4);
                    field3247.method3269(var3, var3.field2441);
                    field3235--;
                    field3239++;
                }
                while (field3245 < 20 && field3244 > 0) {
                    class235 var5 = (class235) field3241.method3214();
                    class174 var6 = new class174(4);
                    var6.method2899(0);
                    var6.method2901((int) var5.field2441);
                    Statics.field3236.method2739(var6.field2367, 0, 4);
                    var5.method3350();
                    field3234.method3269(var5, var5.field2441);
                    field3244--;
                    field3245++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3236.method2738();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3238 = 0;
                    byte var9 = 0;
                    if (Statics.field2370 == null) {
                        var9 = 8;
                    } else if (field3248 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3240.field2364;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3236.method2735(field3240.field2367, field3240.field2364, var10);
                        if (field3251 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3240.field2367[field3240.field2364 + var11] ^= field3251;
                            }
                        }
                        field3240.field2364 += var10;
                        if (field3240.field2364 < var9) {
                            break;
                        }
                        if (Statics.field2370 == null) {
                            field3240.field2364 = 0;
                            int var12 = field3240.method2921();
                            int var13 = field3240.method2916();
                            int var14 = field3240.method2921();
                            int var15 = field3240.method2935();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3247.method3263(var16);
                            Statics.field3246 = true;
                            if (var18 == null) {
                                var18 = (class235) field3234.method3263(var16);
                                Statics.field3246 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2370 = var18;
                            Statics.field834 = new class174(var15 + var19 + Statics.field2370.field3188);
                            Statics.field834.method2899(var14);
                            Statics.field834.method2902(var15);
                            field3248 = 8;
                            field3240.field2364 = 0;
                        } else if (field3248 == 0) {
                            if (field3240.field2367[0] == -1) {
                                field3248 = 1;
                                field3240.field2364 = 0;
                            } else {
                                Statics.field2370 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field834.field2367.length - Statics.field2370.field3188;
                        int var21 = 512 - field3248;
                        if (var21 > var20 - Statics.field834.field2364) {
                            var21 = var20 - Statics.field834.field2364;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3236.method2735(Statics.field834.field2367, Statics.field834.field2364, var21);
                        if (field3251 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field834.field2367[Statics.field834.field2364 + var22] ^= field3251;
                            }
                        }
                        Statics.field834.field2364 += var21;
                        field3248 += var21;
                        if (Statics.field834.field2364 == var20) {
                            if (Statics.field2370.field2441 == 16711935L) {
                                Statics.field658 = Statics.field834;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3250[var23];
                                    if (var24 != null) {
                                        Statics.field658.field2364 = var23 * 8 + 5;
                                        int var25 = Statics.field658.method2935();
                                        int var26 = Statics.field658.method2935();
                                        var24.method3851(var25, var26);
                                    }
                                }
                            } else {
                                field3249.reset();
                                field3249.update(Statics.field834.field2367, 0, var20);
                                int var27 = (int) field3249.getValue();
                                if (Statics.field2370.field3189 != var27) {
                                    try {
                                        Statics.field3236.method2745();
                                    } catch (Exception var32) {
                                    }
                                    field3252++;
                                    Statics.field3236 = null;
                                    field3251 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3252 = 0;
                                field3253 = 0;
                                Statics.field2370.field3190.method3841((int) (Statics.field2370.field2441 & 0xFFFFL), Statics.field834.field2367, (Statics.field2370.field2441 & 0xFF0000L) == 16711680L, Statics.field3246);
                            }
                            Statics.field2370.method3312();
                            if (Statics.field3246) {
                                field3239--;
                            } else {
                                field3245--;
                            }
                            field3248 = 0;
                            Statics.field2370 = null;
                            Statics.field834 = null;
                        } else {
                            if (field3248 != 512) {
                                break;
                            }
                            field3248 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3236.method2745();
                } catch (Exception var31) {
                }
                field3253++;
                Statics.field3236 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ds.q(ZI)V")
    public static void method2254(boolean arg0) {
        if (Statics.field3236 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2899(arg0 ? 2 : 3);
            var1.method2901(0);
            Statics.field3236.method2739(var1.field2367, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3236.method2745();
            } catch (Exception var4) {
            }
            field3253++;
            Statics.field3236 = null;
        }
    }

    @ObfuscatedName("af.x(Lib;IIIBZI)V")
    public static void method539(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3237.method3263(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3247.method3263(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3242.method3263(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3234.method3263(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3190 = arg0;
            var12.field3189 = arg3;
            var12.field3188 = arg4;
            if (arg5) {
                field3237.method3269(var12, var6);
                field3235++;
            } else {
                field3241.method3211(var12);
                field3242.method3269(var12, var6);
                field3244++;
            }
        } else if (arg5) {
            var10.method3350();
            field3237.method3269(var10, var6);
            field3244--;
            field3235++;
        }
    }
}
