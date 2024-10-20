package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ig")
public class class253 {

    @ObfuscatedName("ig.c")
    public static int field3244 = 0;

    @ObfuscatedName("ig.u")
    public static class205 field3241 = new class205(4096);

    @ObfuscatedName("ig.i")
    public static int field3242 = 0;

    @ObfuscatedName("ig.r")
    public static class205 field3243 = new class205(32);

    @ObfuscatedName("ig.j")
    public static int field3256 = 0;

    @ObfuscatedName("ig.p")
    public static class197 field3238 = new class197();

    @ObfuscatedName("ig.e")
    public static class205 field3239 = new class205(4096);

    @ObfuscatedName("ig.s")
    public static int field3247 = 0;

    @ObfuscatedName("ig.v")
    public static class205 field3252 = new class205(4096);

    @ObfuscatedName("ig.k")
    public static int field3249 = 0;

    @ObfuscatedName("ig.l")
    public static class185 field3248 = new class185(8);

    @ObfuscatedName("ig.z")
    public static int field3245 = 0;

    @ObfuscatedName("ig.x")
    public static CRC32 field3253 = new CRC32();

    @ObfuscatedName("ig.w")
    public static class252[] field3254 = new class252[256];

    @ObfuscatedName("ig.g")
    public static byte field3255 = 0;

    @ObfuscatedName("ig.d")
    public static int field3246 = 0;

    @ObfuscatedName("ig.m")
    public static int field3257 = 0;

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.y(I)Z")
    public static boolean method2846() {
        long var0 = class187.method1700();
        int var2 = (int) (var0 - Statics.field3240);
        Statics.field3240 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3244 += var2;
        if (field3249 == 0 && field3256 == 0 && field3247 == 0 && field3242 == 0) {
            return true;
        } else if (Statics.field3251 == null) {
            return false;
        } else {
            try {
                if (field3244 > 30000) {
                    throw new IOException();
                }
                while (field3256 < 200 && field3242 > 0) {
                    class249 var3 = (class249) field3241.method3720();
                    class185 var4 = new class185(4);
                    var4.method3253(1);
                    var4.method3255((int) var3.field2470);
                    Statics.field3251.method3031(var4.field2373, 0, 4);
                    field3243.method3718(var3, var3.field2470);
                    field3242--;
                    field3256++;
                }
                while (field3249 < 200 && field3247 > 0) {
                    class249 var5 = (class249) field3238.method3627();
                    class185 var6 = new class185(4);
                    var6.method3253(0);
                    var6.method3255((int) var5.field2470);
                    Statics.field3251.method3031(var6.field2373, 0, 4);
                    var5.method3809();
                    field3252.method3718(var5, var5.field2470);
                    field3247--;
                    field3249++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3251.method3041();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3244 = 0;
                    byte var9 = 0;
                    if (Statics.field511 == null) {
                        var9 = 8;
                    } else if (field3245 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3248.field2374;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3251.method3050(field3248.field2373, field3248.field2374, var10);
                        if (field3255 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3248.field2373[field3248.field2374 + var11] ^= field3255;
                            }
                        }
                        field3248.field2374 += var10;
                        if (field3248.field2374 < var9) {
                            break;
                        }
                        if (Statics.field511 == null) {
                            field3248.field2374 = 0;
                            int var12 = field3248.method3299();
                            int var13 = field3248.method3280();
                            int var14 = field3248.method3299();
                            int var15 = field3248.method3374();
                            long var16 = (long) ((var12 << 16) + var13);
                            class249 var18 = (class249) field3243.method3734(var16);
                            Statics.field3250 = true;
                            if (var18 == null) {
                                var18 = (class249) field3252.method3734(var16);
                                Statics.field3250 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field511 = var18;
                            Statics.field3771 = new class185(var15 + var19 + Statics.field511.field3200);
                            Statics.field3771.method3253(var14);
                            Statics.field3771.method3256(var15);
                            field3245 = 8;
                            field3248.field2374 = 0;
                        } else if (field3245 == 0) {
                            if (field3248.field2373[0] == -1) {
                                field3245 = 1;
                                field3248.field2374 = 0;
                            } else {
                                Statics.field511 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3771.field2373.length - Statics.field511.field3200;
                        int var21 = 512 - field3245;
                        if (var21 > var20 - Statics.field3771.field2374) {
                            var21 = var20 - Statics.field3771.field2374;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3251.method3050(Statics.field3771.field2373, Statics.field3771.field2374, var21);
                        if (field3255 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3771.field2373[Statics.field3771.field2374 + var22] ^= field3255;
                            }
                        }
                        Statics.field3771.field2374 += var21;
                        field3245 += var21;
                        if (Statics.field3771.field2374 == var20) {
                            if (Statics.field511.field2470 == 16711935L) {
                                Statics.field59 = Statics.field3771;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class252 var24 = field3254[var23];
                                    if (var24 != null) {
                                        Statics.field59.field2374 = var23 * 8 + 5;
                                        int var25 = Statics.field59.method3374();
                                        int var26 = Statics.field59.method3374();
                                        var24.method4359(var25, var26);
                                    }
                                }
                            } else {
                                field3253.reset();
                                field3253.update(Statics.field3771.field2373, 0, var20);
                                int var27 = (int) field3253.getValue();
                                if (Statics.field511.field3199 != var27) {
                                    try {
                                        Statics.field3251.method3035();
                                    } catch (Exception var32) {
                                    }
                                    field3246++;
                                    Statics.field3251 = null;
                                    field3255 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3246 = 0;
                                field3257 = 0;
                                Statics.field511.field3198.method4377((int) (Statics.field511.field2470 & 0xFFFFL), Statics.field3771.field2373, (Statics.field511.field2470 & 0xFF0000L) == 16711680L, Statics.field3250);
                            }
                            Statics.field511.method3766();
                            if (Statics.field3250) {
                                field3256--;
                            } else {
                                field3249--;
                            }
                            field3245 = 0;
                            Statics.field511 = null;
                            Statics.field3771 = null;
                        } else {
                            if (field3245 != 512) {
                                break;
                            }
                            field3245 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3251.method3035();
                } catch (Exception var31) {
                }
                field3257++;
                Statics.field3251 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("client.c(ZI)V")
    public static void method1452(boolean arg0) {
        if (Statics.field3251 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3253(arg0 ? 2 : 3);
            var1.method3255(0);
            Statics.field3251.method3031(var1.field2373, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3251.method3035();
            } catch (Exception var4) {
            }
            field3257++;
            Statics.field3251 = null;
        }
    }

    @ObfuscatedName("bc.n(Liv;II)V")
    public static void method1006(class252 arg0, int arg1) {
        if (Statics.field59 == null) {
            method446((class252) null, 255, 255, 0, (byte) 0, true);
            field3254[arg1] = arg0;
        } else {
            Statics.field59.field2374 = arg1 * 8 + 5;
            int var2 = Statics.field59.method3374();
            int var3 = Statics.field59.method3374();
            arg0.method4359(var2, var3);
        }
    }

    @ObfuscatedName("al.u(Liv;IIIBZI)V")
    public static void method446(class252 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class249 var8 = (class249) field3241.method3734(var6);
        if (var8 != null) {
            return;
        }
        class249 var9 = (class249) field3243.method3734(var6);
        if (var9 != null) {
            return;
        }
        class249 var10 = (class249) field3239.method3734(var6);
        if (var10 == null) {
            if (!arg5) {
                class249 var11 = (class249) field3252.method3734(var6);
                if (var11 != null) {
                    return;
                }
            }
            class249 var12 = new class249();
            var12.field3198 = arg0;
            var12.field3199 = arg3;
            var12.field3200 = arg4;
            if (arg5) {
                field3241.method3718(var12, var6);
                field3242++;
            } else {
                field3238.method3624(var12);
                field3239.method3718(var12, var6);
                field3247++;
            }
        } else if (arg5) {
            var10.method3809();
            field3241.method3718(var10, var6);
            field3247--;
            field3242++;
        }
    }

    @ObfuscatedName("eb.i(IIB)V")
    public static void method2851(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class249 var4 = (class249) field3239.method3734(var2);
        if (var4 != null) {
            field3238.method3634(var4);
        }
    }

    @ObfuscatedName("an.e(I)V")
    public static void method431() {
        if (Statics.field3251 != null) {
            Statics.field3251.method3035();
        }
    }
}
