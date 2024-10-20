package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("is")
public class class246 {

    @ObfuscatedName("is.s")
    public static int field3308 = 0;

    @ObfuscatedName("is.g")
    public static class198 field3319 = new class198(4096);

    @ObfuscatedName("is.x")
    public static int field3309 = 0;

    @ObfuscatedName("is.f")
    public static class198 field3310 = new class198(32);

    @ObfuscatedName("is.u")
    public static int field3311 = 0;

    @ObfuscatedName("is.t")
    public static class192 field3306 = new class192();

    @ObfuscatedName("is.k")
    public static class198 field3314 = new class198(4096);

    @ObfuscatedName("is.n")
    public static int field3323 = 0;

    @ObfuscatedName("is.d")
    public static class198 field3315 = new class198(4096);

    @ObfuscatedName("is.o")
    public static int field3316 = 0;

    @ObfuscatedName("is.j")
    public static class181 field3318 = new class181(8);

    @ObfuscatedName("is.h")
    public static int field3312 = 0;

    @ObfuscatedName("is.y")
    public static CRC32 field3320 = new CRC32();

    @ObfuscatedName("is.i")
    public static class245[] field3322 = new class245[256];

    @ObfuscatedName("is.l")
    public static byte field3321 = 0;

    @ObfuscatedName("is.z")
    public static int field3324 = 0;

    @ObfuscatedName("is.e")
    public static int field3325 = 0;

    public class246() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.b(B)Z")
    public static boolean method2663() {
        long var0 = class183.method1711();
        int var2 = (int) (var0 - Statics.field3307);
        Statics.field3307 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3308 += var2;
        if (field3316 == 0 && field3311 == 0 && field3323 == 0 && field3309 == 0) {
            return true;
        } else if (Statics.field300 == null) {
            return false;
        } else {
            try {
                if (field3308 > 30000) {
                    throw new IOException();
                }
                while (field3311 < 20 && field3309 > 0) {
                    class242 var3 = (class242) field3319.method3343();
                    class181 var4 = new class181(4);
                    var4.method2929(1);
                    var4.method2931((int) var3.field2557);
                    Statics.field300.method2768(var4.field2495, 0, 4);
                    field3310.method3352(var3, var3.field2557);
                    field3309--;
                    field3311++;
                }
                while (field3316 < 20 && field3323 > 0) {
                    class242 var5 = (class242) field3306.method3289();
                    class181 var6 = new class181(4);
                    var6.method2929(0);
                    var6.method2931((int) var5.field2557);
                    Statics.field300.method2768(var6.field2495, 0, 4);
                    var5.method3428();
                    field3315.method3352(var5, var5.field2557);
                    field3323--;
                    field3316++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field300.method2765();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3308 = 0;
                    byte var9 = 0;
                    if (Statics.field1691 == null) {
                        var9 = 8;
                    } else if (field3312 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3318.field2488;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field300.method2783(field3318.field2495, field3318.field2488, var10);
                        if (field3321 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3318.field2495[field3318.field2488 + var11] ^= field3321;
                            }
                        }
                        field3318.field2488 += var10;
                        if (field3318.field2488 < var9) {
                            break;
                        }
                        if (Statics.field1691 == null) {
                            field3318.field2488 = 0;
                            int var12 = field3318.method2945();
                            int var13 = field3318.method3081();
                            int var14 = field3318.method2945();
                            int var15 = field3318.method2996();
                            long var16 = (long) ((var12 << 16) + var13);
                            class242 var18 = (class242) field3310.method3340(var16);
                            Statics.field3317 = true;
                            if (var18 == null) {
                                var18 = (class242) field3315.method3340(var16);
                                Statics.field3317 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1691 = var18;
                            Statics.field1575 = new class181(var15 + var19 + Statics.field1691.field3269);
                            Statics.field1575.method2929(var14);
                            Statics.field1575.method2977(var15);
                            field3312 = 8;
                            field3318.field2488 = 0;
                        } else if (field3312 == 0) {
                            if (field3318.field2495[0] == -1) {
                                field3312 = 1;
                                field3318.field2488 = 0;
                            } else {
                                Statics.field1691 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1575.field2495.length - Statics.field1691.field3269;
                        int var21 = 512 - field3312;
                        if (var21 > var20 - Statics.field1575.field2488) {
                            var21 = var20 - Statics.field1575.field2488;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field300.method2783(Statics.field1575.field2495, Statics.field1575.field2488, var21);
                        if (field3321 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1575.field2495[Statics.field1575.field2488 + var22] ^= field3321;
                            }
                        }
                        Statics.field1575.field2488 += var21;
                        field3312 += var21;
                        if (Statics.field1575.field2488 == var20) {
                            if (Statics.field1691.field2557 == 16711935L) {
                                Statics.field474 = Statics.field1575;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class245 var24 = field3322[var23];
                                    if (var24 != null) {
                                        Statics.field474.field2488 = var23 * 8 + 5;
                                        int var25 = Statics.field474.method2996();
                                        int var26 = Statics.field474.method2996();
                                        var24.method3924(var25, var26);
                                    }
                                }
                            } else {
                                field3320.reset();
                                field3320.update(Statics.field1575.field2495, 0, var20);
                                int var27 = (int) field3320.getValue();
                                if (Statics.field1691.field3267 != var27) {
                                    try {
                                        Statics.field300.method2763();
                                    } catch (Exception var32) {
                                    }
                                    field3324++;
                                    Statics.field300 = null;
                                    field3321 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3324 = 0;
                                field3325 = 0;
                                Statics.field1691.field3266.method3920((int) (Statics.field1691.field2557 & 0xFFFFL), Statics.field1575.field2495, (Statics.field1691.field2557 & 0xFF0000L) == 16711680L, Statics.field3317);
                            }
                            Statics.field1691.method3392();
                            if (Statics.field3317) {
                                field3311--;
                            } else {
                                field3316--;
                            }
                            field3312 = 0;
                            Statics.field1691 = null;
                            Statics.field1575 = null;
                        } else {
                            if (field3312 != 512) {
                                break;
                            }
                            field3312 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field300.method2763();
                } catch (Exception var31) {
                }
                field3325++;
                Statics.field300 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("q.r(Lfx;ZI)V")
    public static void method65(class161 arg0, boolean arg1) {
        if (Statics.field300 != null) {
            try {
                Statics.field300.method2763();
            } catch (Exception var10) {
            }
            Statics.field300 = null;
        }
        Statics.field300 = arg0;
        Statics.method5(arg1);
        field3318.field2488 = 0;
        Statics.field1691 = null;
        Statics.field1575 = null;
        field3312 = 0;
        while (true) {
            class242 var3 = (class242) field3310.method3343();
            if (var3 == null) {
                while (true) {
                    class242 var4 = (class242) field3315.method3343();
                    if (var4 == null) {
                        if (field3321 != 0) {
                            try {
                                class181 var5 = new class181(4);
                                var5.method2929(4);
                                var5.method2929(field3321);
                                var5.method2930(0);
                                Statics.field300.method2768(var5.field2495, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field300.method2763();
                                } catch (Exception var8) {
                                }
                                field3325++;
                                Statics.field300 = null;
                            }
                        }
                        field3308 = 0;
                        Statics.field3307 = class183.method1711();
                        return;
                    }
                    field3306.method3297(var4);
                    field3314.method3352(var4, var4.field2557);
                    field3323++;
                    field3316--;
                }
            }
            field3319.method3352(var3, var3.field2557);
            field3309++;
            field3311--;
        }
    }

    @ObfuscatedName("cd.g(Liu;IIIBZI)V")
    public static void method1552(class245 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class242 var8 = (class242) field3319.method3340(var6);
        if (var8 != null) {
            return;
        }
        class242 var9 = (class242) field3310.method3340(var6);
        if (var9 != null) {
            return;
        }
        class242 var10 = (class242) field3314.method3340(var6);
        if (var10 == null) {
            if (!arg5) {
                class242 var11 = (class242) field3315.method3340(var6);
                if (var11 != null) {
                    return;
                }
            }
            class242 var12 = new class242();
            var12.field3266 = arg0;
            var12.field3267 = arg3;
            var12.field3269 = arg4;
            if (arg5) {
                field3319.method3352(var12, var6);
                field3309++;
            } else {
                field3306.method3286(var12);
                field3314.method3352(var12, var6);
                field3323++;
            }
        } else if (arg5) {
            var10.method3428();
            field3319.method3352(var10, var6);
            field3323--;
            field3309++;
        }
    }

    @ObfuscatedName("i.x(III)V")
    public static void method139(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class242 var4 = (class242) field3314.method3340(var2);
        if (var4 != null) {
            field3306.method3297(var4);
        }
    }

    @ObfuscatedName("bn.f(III)I")
    public static int method970(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1691 != null && Statics.field1691.field2557 == var2 ? Statics.field1575.field2488 * 99 / (Statics.field1575.field2495.length - Statics.field1691.field3269) + 1 : 0;
    }

    @ObfuscatedName("ao.u(I)V")
    public static void method443() {
        if (Statics.field300 != null) {
            Statics.field300.method2763();
        }
    }
}
