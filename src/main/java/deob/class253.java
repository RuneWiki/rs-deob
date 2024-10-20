package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("is")
public class class253 {

    @ObfuscatedName("is.q")
    public static int field3229 = 0;

    @ObfuscatedName("is.j")
    public static class205 field3243 = new class205(4096);

    @ObfuscatedName("is.g")
    public static int field3231 = 0;

    @ObfuscatedName("is.i")
    public static class205 field3232 = new class205(32);

    @ObfuscatedName("is.h")
    public static int field3233 = 0;

    @ObfuscatedName("is.l")
    public static class197 field3234 = new class197();

    @ObfuscatedName("is.d")
    public static class205 field3235 = new class205(4096);

    @ObfuscatedName("is.o")
    public static int field3236 = 0;

    @ObfuscatedName("is.s")
    public static class205 field3238 = new class205(4096);

    @ObfuscatedName("is.k")
    public static int field3244 = 0;

    @ObfuscatedName("is.n")
    public static class185 field3239 = new class185(8);

    @ObfuscatedName("is.r")
    public static int field3230 = 0;

    @ObfuscatedName("is.b")
    public static CRC32 field3241 = new CRC32();

    @ObfuscatedName("is.e")
    public static class252[] field3242 = new class252[256];

    @ObfuscatedName("is.a")
    public static byte field3228 = 0;

    @ObfuscatedName("is.z")
    public static int field3246 = 0;

    @ObfuscatedName("is.y")
    public static int field3245 = 0;

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.c(I)Z")
    public static boolean method4451() {
        long var0 = class187.method918();
        int var2 = (int) (var0 - Statics.field1086);
        Statics.field1086 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3229 += var2;
        if (field3244 == 0 && field3233 == 0 && field3236 == 0 && field3231 == 0) {
            return true;
        } else if (Statics.field3240 == null) {
            return false;
        } else {
            try {
                if (field3229 > 30000) {
                    throw new IOException();
                }
                while (field3233 < 200 && field3231 > 0) {
                    class249 var3 = (class249) field3243.method3690();
                    class185 var4 = new class185(4);
                    var4.method3227(1);
                    var4.method3260((int) var3.field2466);
                    Statics.field3240.method3013(var4.field2388, 0, 4);
                    field3232.method3691(var3, var3.field2466);
                    field3231--;
                    field3233++;
                }
                while (field3244 < 200 && field3236 > 0) {
                    class249 var5 = (class249) field3234.method3605();
                    class185 var6 = new class185(4);
                    var6.method3227(0);
                    var6.method3260((int) var5.field2466);
                    Statics.field3240.method3013(var6.field2388, 0, 4);
                    var5.method3765();
                    field3238.method3691(var5, var5.field2466);
                    field3236--;
                    field3244++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3240.method3012();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3229 = 0;
                    byte var9 = 0;
                    if (Statics.field179 == null) {
                        var9 = 8;
                    } else if (field3230 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3239.field2386;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3240.method3014(field3239.field2388, field3239.field2386, var10);
                        if (field3228 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3239.field2388[field3239.field2386 + var11] ^= field3228;
                            }
                        }
                        field3239.field2386 += var10;
                        if (field3239.field2386 < var9) {
                            break;
                        }
                        if (Statics.field179 == null) {
                            field3239.field2386 = 0;
                            int var12 = field3239.method3243();
                            int var13 = field3239.method3245();
                            int var14 = field3239.method3243();
                            int var15 = field3239.method3323();
                            long var16 = (long) ((var12 << 16) + var13);
                            class249 var18 = (class249) field3232.method3687(var16);
                            Statics.field418 = true;
                            if (var18 == null) {
                                var18 = (class249) field3238.method3687(var16);
                                Statics.field418 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field179 = var18;
                            Statics.field1951 = new class185(var15 + var19 + Statics.field179.field3187);
                            Statics.field1951.method3227(var14);
                            Statics.field1951.method3230(var15);
                            field3230 = 8;
                            field3239.field2386 = 0;
                        } else if (field3230 == 0) {
                            if (field3239.field2388[0] == -1) {
                                field3230 = 1;
                                field3239.field2386 = 0;
                            } else {
                                Statics.field179 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1951.field2388.length - Statics.field179.field3187;
                        int var21 = 512 - field3230;
                        if (var21 > var20 - Statics.field1951.field2386) {
                            var21 = var20 - Statics.field1951.field2386;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3240.method3014(Statics.field1951.field2388, Statics.field1951.field2386, var21);
                        if (field3228 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1951.field2388[Statics.field1951.field2386 + var22] ^= field3228;
                            }
                        }
                        Statics.field1951.field2386 += var21;
                        field3230 += var21;
                        if (Statics.field1951.field2386 == var20) {
                            if (Statics.field179.field2466 == 16711935L) {
                                Statics.field279 = Statics.field1951;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class252 var24 = field3242[var23];
                                    if (var24 != null) {
                                        Statics.field279.field2386 = var23 * 8 + 5;
                                        int var25 = Statics.field279.method3323();
                                        int var26 = Statics.field279.method3323();
                                        var24.method4316(var25, var26);
                                    }
                                }
                            } else {
                                field3241.reset();
                                field3241.update(Statics.field1951.field2388, 0, var20);
                                int var27 = (int) field3241.getValue();
                                if (Statics.field179.field3186 != var27) {
                                    try {
                                        Statics.field3240.method3034();
                                    } catch (Exception var32) {
                                    }
                                    field3246++;
                                    Statics.field3240 = null;
                                    field3228 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3246 = 0;
                                field3245 = 0;
                                Statics.field179.field3190.method4317((int) (Statics.field179.field2466 & 0xFFFFL), Statics.field1951.field2388, (Statics.field179.field2466 & 0xFF0000L) == 16711680L, Statics.field418);
                            }
                            Statics.field179.method3733();
                            if (Statics.field418) {
                                field3233--;
                            } else {
                                field3244--;
                            }
                            field3230 = 0;
                            Statics.field179 = null;
                            Statics.field1951 = null;
                        } else {
                            if (field3230 != 512) {
                                break;
                            }
                            field3230 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3240.method3034();
                } catch (Exception var31) {
                }
                field3245++;
                Statics.field3240 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ik.q(ZI)V")
    public static void method4196(boolean arg0) {
        if (Statics.field3240 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3227(arg0 ? 2 : 3);
            var1.method3260(0);
            Statics.field3240.method3013(var1.field2388, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3240.method3034();
            } catch (Exception var4) {
            }
            field3245++;
            Statics.field3240 = null;
        }
    }

    @ObfuscatedName("t.m(Liz;IIIBZI)V")
    public static void method164(class252 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class249 var8 = (class249) field3243.method3687(var6);
        if (var8 != null) {
            return;
        }
        class249 var9 = (class249) field3232.method3687(var6);
        if (var9 != null) {
            return;
        }
        class249 var10 = (class249) field3235.method3687(var6);
        if (var10 == null) {
            if (!arg5) {
                class249 var11 = (class249) field3238.method3687(var6);
                if (var11 != null) {
                    return;
                }
            }
            class249 var12 = new class249();
            var12.field3190 = arg0;
            var12.field3186 = arg3;
            var12.field3187 = arg4;
            if (arg5) {
                field3243.method3691(var12, var6);
                field3231++;
            } else {
                field3234.method3598(var12);
                field3235.method3691(var12, var6);
                field3236++;
            }
        } else if (arg5) {
            var10.method3765();
            field3243.method3691(var10, var6);
            field3236--;
            field3231++;
        }
    }

    @ObfuscatedName("cn.j(IIB)I")
    public static int method1729(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field179 != null && Statics.field179.field2466 == var2 ? Statics.field1951.field2386 * 99 / (Statics.field1951.field2388.length - Statics.field179.field3187) + 1 : 0;
    }
}
