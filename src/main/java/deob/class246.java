package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ix")
public class class246 {

    @ObfuscatedName("ix.p")
    public static int field3315 = 0;

    @ObfuscatedName("ix.j")
    public static class198 field3323 = new class198(4096);

    @ObfuscatedName("ix.v")
    public static int field3321 = 0;

    @ObfuscatedName("ix.x")
    public static class198 field3319 = new class198(32);

    @ObfuscatedName("ix.e")
    public static int field3324 = 0;

    @ObfuscatedName("ix.l")
    public static class192 field3327 = new class192();

    @ObfuscatedName("ix.b")
    public static class198 field3322 = new class198(4096);

    @ObfuscatedName("ix.n")
    public static int field3328 = 0;

    @ObfuscatedName("ix.c")
    public static class198 field3314 = new class198(4096);

    @ObfuscatedName("ix.a")
    public static int field3325 = 0;

    @ObfuscatedName("ix.k")
    public static class181 field3326 = new class181(8);

    @ObfuscatedName("ix.h")
    public static int field3318 = 0;

    @ObfuscatedName("ix.r")
    public static CRC32 field3320 = new CRC32();

    @ObfuscatedName("ix.z")
    public static class245[] field3329 = new class245[256];

    @ObfuscatedName("ix.o")
    public static byte field3330 = 0;

    @ObfuscatedName("ix.d")
    public static int field3331 = 0;

    @ObfuscatedName("ix.s")
    public static int field3332 = 0;

    public class246() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.m(I)Z")
    public static boolean method3() {
        long var0 = class183.method4541();
        int var2 = (int) (var0 - Statics.field3316);
        Statics.field3316 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3315 += var2;
        if (field3325 == 0 && field3324 == 0 && field3328 == 0 && field3321 == 0) {
            return true;
        } else if (Statics.field3317 == null) {
            return false;
        } else {
            try {
                if (field3315 > 30000) {
                    throw new IOException();
                }
                while (field3324 < 20 && field3321 > 0) {
                    class242 var3 = (class242) field3323.method3433();
                    class181 var4 = new class181(4);
                    var4.method2996(1);
                    var4.method2998((int) var3.field2563);
                    Statics.field3317.method2828(var4.field2499, 0, 4);
                    field3319.method3431(var3, var3.field2563);
                    field3321--;
                    field3324++;
                }
                while (field3325 < 20 && field3328 > 0) {
                    class242 var5 = (class242) field3327.method3372();
                    class181 var6 = new class181(4);
                    var6.method2996(0);
                    var6.method2998((int) var5.field2563);
                    Statics.field3317.method2828(var6.field2499, 0, 4);
                    var5.method3513();
                    field3314.method3431(var5, var5.field2563);
                    field3328--;
                    field3325++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3317.method2829();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3315 = 0;
                    byte var9 = 0;
                    if (Statics.field2113 == null) {
                        var9 = 8;
                    } else if (field3318 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3326.field2498;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3317.method2833(field3326.field2499, field3326.field2498, var10);
                        if (field3330 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3326.field2499[field3326.field2498 + var11] ^= field3330;
                            }
                        }
                        field3326.field2498 += var10;
                        if (field3326.field2498 < var9) {
                            break;
                        }
                        if (Statics.field2113 == null) {
                            field3326.field2498 = 0;
                            int var12 = field3326.method3012();
                            int var13 = field3326.method3009();
                            int var14 = field3326.method3012();
                            int var15 = field3326.method3017();
                            long var16 = (long) ((var12 << 16) + var13);
                            class242 var18 = (class242) field3319.method3444(var16);
                            Statics.field451 = true;
                            if (var18 == null) {
                                var18 = (class242) field3314.method3444(var16);
                                Statics.field451 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2113 = var18;
                            Statics.field2079 = new class181(var15 + var19 + Statics.field2113.field3276);
                            Statics.field2079.method2996(var14);
                            Statics.field2079.method2999(var15);
                            field3318 = 8;
                            field3326.field2498 = 0;
                        } else if (field3318 == 0) {
                            if (field3326.field2499[0] == -1) {
                                field3318 = 1;
                                field3326.field2498 = 0;
                            } else {
                                Statics.field2113 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2079.field2499.length - Statics.field2113.field3276;
                        int var21 = 512 - field3318;
                        if (var21 > var20 - Statics.field2079.field2498) {
                            var21 = var20 - Statics.field2079.field2498;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3317.method2833(Statics.field2079.field2499, Statics.field2079.field2498, var21);
                        if (field3330 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2079.field2499[Statics.field2079.field2498 + var22] ^= field3330;
                            }
                        }
                        Statics.field2079.field2498 += var21;
                        field3318 += var21;
                        if (Statics.field2079.field2498 == var20) {
                            if (Statics.field2113.field2563 == 16711935L) {
                                Statics.field641 = Statics.field2079;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class245 var24 = field3329[var23];
                                    if (var24 != null) {
                                        Statics.field641.field2498 = var23 * 8 + 5;
                                        int var25 = Statics.field641.method3017();
                                        int var26 = Statics.field641.method3017();
                                        var24.method4037(var25, var26);
                                    }
                                }
                            } else {
                                field3320.reset();
                                field3320.update(Statics.field2079.field2499, 0, var20);
                                int var27 = (int) field3320.getValue();
                                if (Statics.field2113.field3275 != var27) {
                                    try {
                                        Statics.field3317.method2851();
                                    } catch (Exception var32) {
                                    }
                                    field3331++;
                                    Statics.field3317 = null;
                                    field3330 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3331 = 0;
                                field3332 = 0;
                                Statics.field2113.field3274.method4051((int) (Statics.field2113.field2563 & 0xFFFFL), Statics.field2079.field2499, (Statics.field2113.field2563 & 0xFF0000L) == 16711680L, Statics.field451);
                            }
                            Statics.field2113.method3476();
                            if (Statics.field451) {
                                field3324--;
                            } else {
                                field3325--;
                            }
                            field3318 = 0;
                            Statics.field2113 = null;
                            Statics.field2079 = null;
                        } else {
                            if (field3318 != 512) {
                                break;
                            }
                            field3318 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3317.method2851();
                } catch (Exception var31) {
                }
                field3332++;
                Statics.field3317 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ab.p(ZI)V")
    public static void method255(boolean arg0) {
        if (Statics.field3317 == null) {
            return;
        }
        try {
            class181 var1 = new class181(4);
            var1.method2996(arg0 ? 2 : 3);
            var1.method2998(0);
            Statics.field3317.method2828(var1.field2499, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3317.method2851();
            } catch (Exception var4) {
            }
            field3332++;
            Statics.field3317 = null;
        }
    }

    @ObfuscatedName("ao.i(Liy;II)V")
    public static void method227(class245 arg0, int arg1) {
        if (Statics.field641 == null) {
            method1108((class245) null, 255, 255, 0, (byte) 0, true);
            field3329[arg1] = arg0;
        } else {
            Statics.field641.field2498 = arg1 * 8 + 5;
            int var2 = Statics.field641.method3017();
            int var3 = Statics.field641.method3017();
            arg0.method4037(var2, var3);
        }
    }

    @ObfuscatedName("bs.j(Liy;IIIBZI)V")
    public static void method1108(class245 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class242 var8 = (class242) field3323.method3444(var6);
        if (var8 != null) {
            return;
        }
        class242 var9 = (class242) field3319.method3444(var6);
        if (var9 != null) {
            return;
        }
        class242 var10 = (class242) field3322.method3444(var6);
        if (var10 == null) {
            if (!arg5) {
                class242 var11 = (class242) field3314.method3444(var6);
                if (var11 != null) {
                    return;
                }
            }
            class242 var12 = new class242();
            var12.field3274 = arg0;
            var12.field3275 = arg3;
            var12.field3276 = arg4;
            if (arg5) {
                field3323.method3431(var12, var6);
                field3321++;
            } else {
                field3327.method3369(var12);
                field3322.method3431(var12, var6);
                field3328++;
            }
        } else if (arg5) {
            var10.method3513();
            field3323.method3431(var10, var6);
            field3328--;
            field3321++;
        }
    }

    @ObfuscatedName("el.v(IIB)I")
    public static int method2735(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2113 != null && Statics.field2113.field2563 == var2 ? Statics.field2079.field2498 * 99 / (Statics.field2079.field2499.length - Statics.field2113.field3276) + 1 : 0;
    }

    @ObfuscatedName("ig.x(ZZI)I")
    public static int method3925(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3324 + field3321;
        }
        if (arg1) {
            var2 += field3328 + field3325;
        }
        return var2;
    }

    @ObfuscatedName("cr.e(I)V")
    public static void method1578() {
        if (Statics.field3317 != null) {
            Statics.field3317.method2851();
        }
    }
}
