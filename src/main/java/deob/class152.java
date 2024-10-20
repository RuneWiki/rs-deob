package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class152 {

    @ObfuscatedName("ei.j")
    public static int field2516 = 0;

    @ObfuscatedName("ei.h")
    public static class174 field2518 = new class174(4096);

    @ObfuscatedName("ei.v")
    public static int field2535 = 0;

    @ObfuscatedName("ei.k")
    public static class174 field2520 = new class174(32);

    @ObfuscatedName("ei.g")
    public static int field2522 = 0;

    @ObfuscatedName("ei.n")
    public static class171 field2532 = new class171();

    @ObfuscatedName("ei.c")
    public static class174 field2523 = new class174(4096);

    @ObfuscatedName("ei.o")
    public static int field2534 = 0;

    @ObfuscatedName("ei.u")
    public static class174 field2525 = new class174(4096);

    @ObfuscatedName("ei.z")
    public static int field2530 = 0;

    @ObfuscatedName("ei.m")
    public static class126 field2527 = new class126(8);

    @ObfuscatedName("ei.i")
    public static int field2528 = 0;

    @ObfuscatedName("ei.d")
    public static CRC32 field2515 = new CRC32();

    @ObfuscatedName("ei.a")
    public static class153[] field2531 = new class153[256];

    @ObfuscatedName("ei.x")
    public static byte field2526 = 0;

    @ObfuscatedName("ei.r")
    public static int field2533 = 0;

    @ObfuscatedName("ei.t")
    public static int field2519 = 0;

    public class152() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.p(I)Z")
    public static boolean method743() {
        long var0 = class120.method1322();
        int var2 = (int) (var0 - Statics.field2517);
        Statics.field2517 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2516 += var2;
        if (field2530 == 0 && field2522 == 0 && field2534 == 0 && field2535 == 0) {
            return true;
        } else if (Statics.field2524 == null) {
            return false;
        } else {
            try {
                if (field2516 > 30000) {
                    throw new IOException();
                }
                while (field2522 < 20 && field2535 > 0) {
                    class154 var3 = (class154) field2518.method3277();
                    class126 var4 = new class126(4);
                    var4.method2362(1);
                    var4.method2364((int) var3.field2809);
                    Statics.field2524.method1339(var4.field2047, 0, 4);
                    field2520.method3262(var3, var3.field2809);
                    field2535--;
                    field2522++;
                }
                while (field2530 < 20 && field2534 > 0) {
                    class154 var5 = (class154) field2532.method3235();
                    class126 var6 = new class126(4);
                    var6.method2362(0);
                    var6.method2364((int) var5.field2809);
                    Statics.field2524.method1339(var6.field2047, 0, 4);
                    var5.method3260();
                    field2525.method3262(var5, var5.field2809);
                    field2534--;
                    field2530++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2524.method1355();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2516 = 0;
                    byte var9 = 0;
                    if (Statics.field1256 == null) {
                        var9 = 8;
                    } else if (field2528 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2527.field2043;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2524.method1338(field2527.field2047, field2527.field2043, var10);
                        if (field2526 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2527.field2047[field2527.field2043 + var11] ^= field2526;
                            }
                        }
                        field2527.field2043 += var10;
                        if (field2527.field2043 < var9) {
                            break;
                        }
                        if (Statics.field1256 == null) {
                            field2527.field2043 = 0;
                            int var12 = field2527.method2544();
                            int var13 = field2527.method2489();
                            int var14 = field2527.method2544();
                            int var15 = field2527.method2380();
                            long var16 = (long) ((var12 << 16) + var13);
                            class154 var18 = (class154) field2520.method3261(var16);
                            Statics.field2359 = true;
                            if (var18 == null) {
                                var18 = (class154) field2525.method3261(var16);
                                Statics.field2359 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1256 = var18;
                            Statics.field2005 = new class126(var15 + var19 + Statics.field1256.field2552);
                            Statics.field2005.method2362(var14);
                            Statics.field2005.method2365(var15);
                            field2528 = 8;
                            field2527.field2043 = 0;
                        } else if (field2528 == 0) {
                            if (field2527.field2047[0] == -1) {
                                field2528 = 1;
                                field2527.field2043 = 0;
                            } else {
                                Statics.field1256 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2005.field2047.length - Statics.field1256.field2552;
                        int var21 = 512 - field2528;
                        if (var21 > var20 - Statics.field2005.field2043) {
                            var21 = var20 - Statics.field2005.field2043;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2524.method1338(Statics.field2005.field2047, Statics.field2005.field2043, var21);
                        if (field2526 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2005.field2047[Statics.field2005.field2043 + var22] ^= field2526;
                            }
                        }
                        Statics.field2005.field2043 += var21;
                        field2528 += var21;
                        if (Statics.field2005.field2043 == var20) {
                            if (Statics.field1256.field2809 == 16711935L) {
                                Statics.field1303 = Statics.field2005;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class153 var24 = field2531[var23];
                                    if (var24 != null) {
                                        Statics.field1303.field2043 = var23 * 8 + 5;
                                        int var25 = Statics.field1303.method2380();
                                        int var26 = Statics.field1303.method2380();
                                        var24.method2998(var25, var26);
                                    }
                                }
                            } else {
                                field2515.reset();
                                field2515.update(Statics.field2005.field2047, 0, var20);
                                int var27 = (int) field2515.getValue();
                                if (Statics.field1256.field2550 != var27) {
                                    try {
                                        Statics.field2524.method1335();
                                    } catch (Exception var32) {
                                    }
                                    field2533++;
                                    Statics.field2524 = null;
                                    field2526 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2533 = 0;
                                field2519 = 0;
                                Statics.field1256.field2553.method2999((int) (Statics.field1256.field2809 & 0xFFFFL), Statics.field2005.field2047, (Statics.field1256.field2809 & 0xFF0000L) == 16711680L, Statics.field2359);
                            }
                            Statics.field1256.method3327();
                            if (Statics.field2359) {
                                field2522--;
                            } else {
                                field2530--;
                            }
                            field2528 = 0;
                            Statics.field1256 = null;
                            Statics.field2005 = null;
                        } else {
                            if (field2528 != 512) {
                                break;
                            }
                            field2528 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2524.method1335();
                } catch (Exception var31) {
                }
                field2519++;
                Statics.field2524 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("x.j(ZI)V")
    public static void method212(boolean arg0) {
        if (Statics.field2524 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2362(arg0 ? 2 : 3);
            var1.method2364(0);
            Statics.field2524.method1339(var1.field2047, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2524.method1335();
            } catch (Exception var4) {
            }
            field2519++;
            Statics.field2524 = null;
        }
    }

    @ObfuscatedName("z.w(Let;II)V")
    public static void method127(class153 arg0, int arg1) {
        if (Statics.field1303 == null) {
            method668((class153) null, 255, 255, 0, (byte) 0, true);
            field2531[arg1] = arg0;
        } else {
            Statics.field1303.field2043 = arg1 * 8 + 5;
            int var2 = Statics.field1303.method2380();
            int var3 = Statics.field1303.method2380();
            arg0.method2998(var2, var3);
        }
    }

    @ObfuscatedName("az.h(Let;IIIBZB)V")
    public static void method668(class153 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2518.method3261(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2520.method3261(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2523.method3261(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2525.method3261(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2553 = arg0;
            var12.field2550 = arg3;
            var12.field2552 = arg4;
            if (arg5) {
                field2518.method3262(var12, var6);
                field2535++;
            } else {
                field2532.method3232(var12);
                field2523.method3262(var12, var6);
                field2534++;
            }
        } else if (arg5) {
            var10.method3260();
            field2518.method3262(var10, var6);
            field2534--;
            field2535++;
        }
    }

    @ObfuscatedName("eo.v(III)V")
    public static void method2624(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class154 var4 = (class154) field2523.method3261(var2);
        if (var4 != null) {
            field2532.method3233(var4);
        }
    }

    @ObfuscatedName("h.k(III)I")
    public static int method36(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1256 != null && Statics.field1256.field2809 == var2 ? Statics.field2005.field2043 * 99 / (Statics.field2005.field2047.length - Statics.field1256.field2552) + 1 : 0;
    }
}
