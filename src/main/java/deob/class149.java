package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class149 {

    @ObfuscatedName("eo.u")
    public static int field2468 = 0;

    @ObfuscatedName("eo.v")
    public static class173 field2470 = new class173(4096);

    @ObfuscatedName("eo.l")
    public static int field2480 = 0;

    @ObfuscatedName("eo.g")
    public static class173 field2472 = new class173(32);

    @ObfuscatedName("eo.a")
    public static int field2467 = 0;

    @ObfuscatedName("eo.x")
    public static class179 field2474 = new class179();

    @ObfuscatedName("eo.r")
    public static class173 field2471 = new class173(4096);

    @ObfuscatedName("eo.w")
    public static int field2476 = 0;

    @ObfuscatedName("eo.c")
    public static class173 field2477 = new class173(4096);

    @ObfuscatedName("eo.f")
    public static int field2478 = 0;

    @ObfuscatedName("eo.n")
    public static class107 field2483 = new class107(8);

    @ObfuscatedName("eo.s")
    public static int field2473 = 0;

    @ObfuscatedName("eo.j")
    public static CRC32 field2487 = new CRC32();

    @ObfuscatedName("eo.i")
    public static class146[] field2484 = new class146[256];

    @ObfuscatedName("eo.h")
    public static byte field2490 = 0;

    @ObfuscatedName("eo.q")
    public static int field2486 = 0;

    @ObfuscatedName("eo.d")
    public static int field2485 = 0;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.y(B)Z")
    public static boolean method886() {
        long var0 = class103.method790();
        int var2 = (int) (var0 - Statics.field2469);
        Statics.field2469 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2468 += var2;
        if (field2478 == 0 && field2467 == 0 && field2476 == 0 && field2480 == 0) {
            return true;
        } else if (Statics.field2481 == null) {
            return false;
        } else {
            try {
                if (field2468 > 30000) {
                    throw new IOException();
                }
                while (field2467 < 20 && field2480 > 0) {
                    class150 var3 = (class150) field2470.method3170();
                    class107 var4 = new class107(4);
                    var4.method2278(1);
                    var4.method2097((int) var3.field2830);
                    Statics.field2481.method2566(var4.field1856, 0, 4);
                    field2472.method3172(var3, var3.field2830);
                    field2480--;
                    field2467++;
                }
                while (field2478 < 20 && field2476 > 0) {
                    class150 var5 = (class150) field2474.method3252();
                    class107 var6 = new class107(4);
                    var6.method2278(0);
                    var6.method2097((int) var5.field2830);
                    Statics.field2481.method2566(var6.field1856, 0, 4);
                    var5.method3260();
                    field2477.method3172(var5, var5.field2830);
                    field2476--;
                    field2478++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2481.method2564();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2468 = 0;
                    byte var9 = 0;
                    if (Statics.field2479 == null) {
                        var9 = 8;
                    } else if (field2473 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2483.field1854;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2481.method2565(field2483.field1856, field2483.field1854, var10);
                        if (field2490 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2483.field1856[field2483.field1854 + var11] ^= field2490;
                            }
                        }
                        field2483.field1854 += var10;
                        if (field2483.field1854 < var9) {
                            break;
                        }
                        if (Statics.field2479 == null) {
                            field2483.field1854 = 0;
                            int var12 = field2483.method2109();
                            int var13 = field2483.method2111();
                            int var14 = field2483.method2109();
                            int var15 = field2483.method2114();
                            long var16 = (long) ((var12 << 16) + var13);
                            class150 var18 = (class150) field2472.method3171(var16);
                            Statics.field1878 = true;
                            if (var18 == null) {
                                var18 = (class150) field2477.method3171(var16);
                                Statics.field1878 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2479 = var18;
                            Statics.field2685 = new class107(var15 + var19 + Statics.field2479.field2496);
                            Statics.field2685.method2278(var14);
                            Statics.field2685.method2232(var15);
                            field2473 = 8;
                            field2483.field1854 = 0;
                        } else if (field2473 == 0) {
                            if (field2483.field1856[0] == -1) {
                                field2473 = 1;
                                field2483.field1854 = 0;
                            } else {
                                Statics.field2479 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2685.field1856.length - Statics.field2479.field2496;
                        int var21 = 512 - field2473;
                        if (var21 > var20 - Statics.field2685.field1854) {
                            var21 = var20 - Statics.field2685.field1854;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2481.method2565(Statics.field2685.field1856, Statics.field2685.field1854, var21);
                        if (field2490 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2685.field1856[Statics.field2685.field1854 + var22] ^= field2490;
                            }
                        }
                        Statics.field2685.field1854 += var21;
                        field2473 += var21;
                        if (Statics.field2685.field1854 == var20) {
                            if (Statics.field2479.field2830 == 16711935L) {
                                Statics.field1256 = Statics.field2685;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class146 var24 = field2484[var23];
                                    if (var24 != null) {
                                        Statics.field1256.field1854 = var23 * 8 + 5;
                                        int var25 = Statics.field1256.method2114();
                                        int var26 = Statics.field1256.method2114();
                                        var24.method2777(var25, var26);
                                    }
                                }
                            } else {
                                field2487.reset();
                                field2487.update(Statics.field2685.field1856, 0, var20);
                                int var27 = (int) field2487.getValue();
                                if (Statics.field2479.field2492 != var27) {
                                    try {
                                        Statics.field2481.method2562();
                                    } catch (Exception var32) {
                                    }
                                    field2486++;
                                    Statics.field2481 = null;
                                    field2490 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2486 = 0;
                                field2485 = 0;
                                Statics.field2479.field2494.method2778((int) (Statics.field2479.field2830 & 0xFFFFL), Statics.field2685.field1856, (Statics.field2479.field2830 & 0xFF0000L) == 16711680L, Statics.field1878);
                            }
                            Statics.field2479.method3268();
                            if (Statics.field1878) {
                                field2467--;
                            } else {
                                field2478--;
                            }
                            field2473 = 0;
                            Statics.field2479 = null;
                            Statics.field2685 = null;
                        } else {
                            if (field2473 != 512) {
                                break;
                            }
                            field2473 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2481.method2562();
                } catch (Exception var31) {
                }
                field2485++;
                Statics.field2481 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("gk.u(ZI)V")
    public static void method3378(boolean arg0) {
        if (Statics.field2481 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2278(arg0 ? 2 : 3);
            var1.method2097(0);
            Statics.field2481.method2566(var1.field1856, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2481.method2562();
            } catch (Exception var4) {
            }
            field2485++;
            Statics.field2481 = null;
        }
    }

    @ObfuscatedName("ao.k(Ldj;ZS)V")
    public static void method734(class130 arg0, boolean arg1) {
        if (Statics.field2481 != null) {
            try {
                Statics.field2481.method2562();
            } catch (Exception var10) {
            }
            Statics.field2481 = null;
        }
        Statics.field2481 = arg0;
        method3378(arg1);
        field2483.field1854 = 0;
        Statics.field2479 = null;
        Statics.field2685 = null;
        field2473 = 0;
        while (true) {
            class150 var3 = (class150) field2472.method3170();
            if (var3 == null) {
                while (true) {
                    class150 var4 = (class150) field2477.method3170();
                    if (var4 == null) {
                        if (field2490 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2278(4);
                                var5.method2278(field2490);
                                var5.method2096(0);
                                Statics.field2481.method2566(var5.field1856, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2481.method2562();
                                } catch (Exception var8) {
                                }
                                field2485++;
                                Statics.field2481 = null;
                            }
                        }
                        field2468 = 0;
                        Statics.field2469 = class103.method790();
                        return;
                    }
                    field2474.method3257(var4);
                    field2471.method3172(var4, var4.field2830);
                    field2476++;
                    field2478--;
                }
            }
            field2470.method3172(var3, var3.field2830);
            field2480++;
            field2467--;
        }
    }

    @ObfuscatedName("cn.v(Ler;II)V")
    public static void method1767(class146 arg0, int arg1) {
        if (Statics.field1256 == null) {
            method2405((class146) null, 255, 255, 0, (byte) 0, true);
            field2484[arg1] = arg0;
        } else {
            Statics.field1256.field1854 = arg1 * 8 + 5;
            int var2 = Statics.field1256.method2114();
            int var3 = Statics.field1256.method2114();
            arg0.method2777(var2, var3);
        }
    }

    @ObfuscatedName("dq.l(Ler;IIIBZI)V")
    public static void method2405(class146 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class150 var8 = (class150) field2470.method3171(var6);
        if (var8 != null) {
            return;
        }
        class150 var9 = (class150) field2472.method3171(var6);
        if (var9 != null) {
            return;
        }
        class150 var10 = (class150) field2471.method3171(var6);
        if (var10 == null) {
            if (!arg5) {
                class150 var11 = (class150) field2477.method3171(var6);
                if (var11 != null) {
                    return;
                }
            }
            class150 var12 = new class150();
            var12.field2494 = arg0;
            var12.field2492 = arg3;
            var12.field2496 = arg4;
            if (arg5) {
                field2470.method3172(var12, var6);
                field2480++;
            } else {
                field2474.method3248(var12);
                field2471.method3172(var12, var6);
                field2476++;
            }
        } else if (arg5) {
            var10.method3260();
            field2470.method3172(var10, var6);
            field2476--;
            field2480++;
        }
    }

    @ObfuscatedName("u.g(III)V")
    public static void method10(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class150 var4 = (class150) field2471.method3171(var2);
        if (var4 != null) {
            field2474.method3257(var4);
        }
    }

    @ObfuscatedName("g.a(B)V")
    public static void method73() {
        if (Statics.field2481 != null) {
            Statics.field2481.method2562();
        }
    }
}
