package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iw")
public class class239 {

    @ObfuscatedName("iw.o")
    public static int field3225 = 0;

    @ObfuscatedName("iw.g")
    public static class191 field3227 = new class191(4096);

    @ObfuscatedName("iw.d")
    public static int field3237 = 0;

    @ObfuscatedName("iw.b")
    public static class191 field3235 = new class191(32);

    @ObfuscatedName("iw.k")
    public static int field3230 = 0;

    @ObfuscatedName("iw.f")
    public static class185 field3231 = new class185();

    @ObfuscatedName("iw.j")
    public static class191 field3232 = new class191(4096);

    @ObfuscatedName("iw.q")
    public static int field3233 = 0;

    @ObfuscatedName("iw.h")
    public static class191 field3234 = new class191(4096);

    @ObfuscatedName("iw.i")
    public static int field3239 = 0;

    @ObfuscatedName("iw.c")
    public static class174 field3245 = new class174(8);

    @ObfuscatedName("iw.u")
    public static int field3238 = 0;

    @ObfuscatedName("iw.z")
    public static CRC32 field3228 = new CRC32();

    @ObfuscatedName("iw.p")
    public static class238[] field3240 = new class238[256];

    @ObfuscatedName("iw.l")
    public static byte field3241 = 0;

    @ObfuscatedName("iw.x")
    public static int field3242 = 0;

    @ObfuscatedName("iw.r")
    public static int field3243 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.e(B)Z")
    public static boolean method141() {
        long var0 = class176.method218();
        int var2 = (int) (var0 - Statics.field3226);
        Statics.field3226 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3225 += var2;
        if (field3239 == 0 && field3230 == 0 && field3233 == 0 && field3237 == 0) {
            return true;
        } else if (Statics.field3236 == null) {
            return false;
        } else {
            try {
                if (field3225 > 30000) {
                    throw new IOException();
                }
                while (field3230 < 20 && field3237 > 0) {
                    class235 var3 = (class235) field3227.method3262();
                    class174 var4 = new class174(4);
                    var4.method2876(1);
                    var4.method2878((int) var3.field2454);
                    Statics.field3236.method2725(var4.field2373, 0, 4);
                    field3235.method3259(var3, var3.field2454);
                    field3237--;
                    field3230++;
                }
                while (field3239 < 20 && field3233 > 0) {
                    class235 var5 = (class235) field3231.method3202();
                    class174 var6 = new class174(4);
                    var6.method2876(0);
                    var6.method2878((int) var5.field2454);
                    Statics.field3236.method2725(var6.field2373, 0, 4);
                    var5.method3351();
                    field3234.method3259(var5, var5.field2454);
                    field3233--;
                    field3239++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3236.method2723();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3225 = 0;
                    byte var9 = 0;
                    if (Statics.field3229 == null) {
                        var9 = 8;
                    } else if (field3238 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3245.field2370;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3236.method2724(field3245.field2373, field3245.field2370, var10);
                        if (field3241 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3245.field2373[field3245.field2370 + var11] ^= field3241;
                            }
                        }
                        field3245.field2370 += var10;
                        if (field3245.field2370 < var9) {
                            break;
                        }
                        if (Statics.field3229 == null) {
                            field3245.field2370 = 0;
                            int var12 = field3245.method2891();
                            int var13 = field3245.method2930();
                            int var14 = field3245.method2891();
                            int var15 = field3245.method2896();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3235.method3268(var16);
                            Statics.field1993 = true;
                            if (var18 == null) {
                                var18 = (class235) field3234.method3268(var16);
                                Statics.field1993 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3229 = var18;
                            Statics.field877 = new class174(var15 + var19 + Statics.field3229.field3183);
                            Statics.field877.method2876(var14);
                            Statics.field877.method3055(var15);
                            field3238 = 8;
                            field3245.field2370 = 0;
                        } else if (field3238 == 0) {
                            if (field3245.field2373[0] == -1) {
                                field3238 = 1;
                                field3245.field2370 = 0;
                            } else {
                                Statics.field3229 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field877.field2373.length - Statics.field3229.field3183;
                        int var21 = 512 - field3238;
                        if (var21 > var20 - Statics.field877.field2370) {
                            var21 = var20 - Statics.field877.field2370;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3236.method2724(Statics.field877.field2373, Statics.field877.field2370, var21);
                        if (field3241 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field877.field2373[Statics.field877.field2370 + var22] ^= field3241;
                            }
                        }
                        Statics.field877.field2370 += var21;
                        field3238 += var21;
                        if (Statics.field877.field2370 == var20) {
                            if (Statics.field3229.field2454 == 16711935L) {
                                Statics.field1304 = Statics.field877;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3240[var23];
                                    if (var24 != null) {
                                        Statics.field1304.field2370 = var23 * 8 + 5;
                                        int var25 = Statics.field1304.method2896();
                                        int var26 = Statics.field1304.method2896();
                                        var24.method3855(var25, var26);
                                    }
                                }
                            } else {
                                field3228.reset();
                                field3228.update(Statics.field877.field2373, 0, var20);
                                int var27 = (int) field3228.getValue();
                                if (Statics.field3229.field3182 != var27) {
                                    try {
                                        Statics.field3236.method2721();
                                    } catch (Exception var32) {
                                    }
                                    field3242++;
                                    Statics.field3236 = null;
                                    field3241 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3242 = 0;
                                field3243 = 0;
                                Statics.field3229.field3184.method3856((int) (Statics.field3229.field2454 & 0xFFFFL), Statics.field877.field2373, (Statics.field3229.field2454 & 0xFF0000L) == 16711680L, Statics.field1993);
                            }
                            Statics.field3229.method3304();
                            if (Statics.field1993) {
                                field3230--;
                            } else {
                                field3239--;
                            }
                            field3238 = 0;
                            Statics.field3229 = null;
                            Statics.field877 = null;
                        } else {
                            if (field3238 != 512) {
                                break;
                            }
                            field3238 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3236.method2721();
                } catch (Exception var31) {
                }
                field3243++;
                Statics.field3236 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cn.o(ZI)V")
    public static void method1600(boolean arg0) {
        if (Statics.field3236 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2876(arg0 ? 2 : 3);
            var1.method2878(0);
            Statics.field3236.method2725(var1.field2373, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3236.method2721();
            } catch (Exception var4) {
            }
            field3243++;
            Statics.field3236 = null;
        }
    }

    @ObfuscatedName("ew.m(Lik;II)V")
    public static void method2648(class238 arg0, int arg1) {
        if (Statics.field1304 == null) {
            method557((class238) null, 255, 255, 0, (byte) 0, true);
            field3240[arg1] = arg0;
        } else {
            Statics.field1304.field2370 = arg1 * 8 + 5;
            int var2 = Statics.field1304.method2896();
            int var3 = Statics.field1304.method2896();
            arg0.method3855(var2, var3);
        }
    }

    @ObfuscatedName("ac.g(Lik;IIIBZI)V")
    public static void method557(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3227.method3268(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3235.method3268(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3232.method3268(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3234.method3268(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3184 = arg0;
            var12.field3182 = arg3;
            var12.field3183 = arg4;
            if (arg5) {
                field3227.method3259(var12, var6);
                field3237++;
            } else {
                field3231.method3199(var12);
                field3232.method3259(var12, var6);
                field3233++;
            }
        } else if (arg5) {
            var10.method3351();
            field3227.method3259(var10, var6);
            field3233--;
            field3237++;
        }
    }

    @ObfuscatedName("hb.d(III)V")
    public static void method3738(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3232.method3268(var2);
        if (var4 != null) {
            field3231.method3201(var4);
        }
    }

    @ObfuscatedName("cp.b(III)I")
    public static int method1701(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3229 != null && Statics.field3229.field2454 == var2 ? Statics.field877.field2370 * 99 / (Statics.field877.field2373.length - Statics.field3229.field3183) + 1 : 0;
    }

    @ObfuscatedName("t.k(ZZI)I")
    public static int method153(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3237 + field3230;
        }
        if (arg1) {
            var2 += field3239 + field3233;
        }
        return var2;
    }

    @ObfuscatedName("iv.q(I)V")
    public static void method3852() {
        if (Statics.field3236 != null) {
            Statics.field3236.method2721();
        }
    }
}
