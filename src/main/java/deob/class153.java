package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class153 {

    @ObfuscatedName("ew.p")
    public static int field2514 = 0;

    @ObfuscatedName("ew.a")
    public static class175 field2516 = new class175(4096);

    @ObfuscatedName("ew.q")
    public static int field2517 = 0;

    @ObfuscatedName("ew.j")
    public static class175 field2527 = new class175(32);

    @ObfuscatedName("ew.v")
    public static int field2526 = 0;

    @ObfuscatedName("ew.w")
    public static class172 field2520 = new class172();

    @ObfuscatedName("ew.l")
    public static class175 field2519 = new class175(4096);

    @ObfuscatedName("ew.s")
    public static int field2522 = 0;

    @ObfuscatedName("ew.n")
    public static class175 field2523 = new class175(4096);

    @ObfuscatedName("ew.c")
    public static int field2524 = 0;

    @ObfuscatedName("ew.y")
    public static class127 field2513 = new class127(8);

    @ObfuscatedName("ew.t")
    public static int field2528 = 0;

    @ObfuscatedName("ew.g")
    public static CRC32 field2529 = new CRC32();

    @ObfuscatedName("ew.o")
    public static class154[] field2530 = new class154[256];

    @ObfuscatedName("ew.e")
    public static byte field2521 = 0;

    @ObfuscatedName("ew.f")
    public static int field2532 = 0;

    @ObfuscatedName("ew.i")
    public static int field2515 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.x(I)Z")
    public static boolean method23() {
        long var0 = class121.method2636();
        int var2 = (int) (var0 - Statics.field2533);
        Statics.field2533 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2514 += var2;
        if (field2524 == 0 && field2526 == 0 && field2522 == 0 && field2517 == 0) {
            return true;
        } else if (Statics.field2531 == null) {
            return false;
        } else {
            try {
                if (field2514 > 30000) {
                    throw new IOException();
                }
                while (field2526 < 20 && field2517 > 0) {
                    class155 var3 = (class155) field2516.method3248();
                    class127 var4 = new class127(4);
                    var4.method2396(1);
                    var4.method2398((int) var3.field2816);
                    Statics.field2531.method1357(var4.field2015, 0, 4);
                    field2527.method3253(var3, var3.field2816);
                    field2517--;
                    field2526++;
                }
                while (field2524 < 20 && field2522 > 0) {
                    class155 var5 = (class155) field2520.method3209();
                    class127 var6 = new class127(4);
                    var6.method2396(0);
                    var6.method2398((int) var5.field2816);
                    Statics.field2531.method1357(var6.field2015, 0, 4);
                    var5.method3239();
                    field2523.method3253(var5, var5.field2816);
                    field2522--;
                    field2524++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2531.method1355();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2514 = 0;
                    byte var9 = 0;
                    if (Statics.field366 == null) {
                        var9 = 8;
                    } else if (field2528 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2513.field2008;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2531.method1369(field2513.field2015, field2513.field2008, var10);
                        if (field2521 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2513.field2015[field2513.field2008 + var11] ^= field2521;
                            }
                        }
                        field2513.field2008 += var10;
                        if (field2513.field2008 < var9) {
                            break;
                        }
                        if (Statics.field366 == null) {
                            field2513.field2008 = 0;
                            int var12 = field2513.method2484();
                            int var13 = field2513.method2539();
                            int var14 = field2513.method2484();
                            int var15 = field2513.method2415();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2527.method3259(var16);
                            Statics.field2525 = true;
                            if (var18 == null) {
                                var18 = (class155) field2523.method3259(var16);
                                Statics.field2525 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field366 = var18;
                            Statics.field2518 = new class127(var15 + var19 + Statics.field366.field2547);
                            Statics.field2518.method2396(var14);
                            Statics.field2518.method2470(var15);
                            field2528 = 8;
                            field2513.field2008 = 0;
                        } else if (field2528 == 0) {
                            if (field2513.field2015[0] == -1) {
                                field2528 = 1;
                                field2513.field2008 = 0;
                            } else {
                                Statics.field366 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2518.field2015.length - Statics.field366.field2547;
                        int var21 = 512 - field2528;
                        if (var21 > var20 - Statics.field2518.field2008) {
                            var21 = var20 - Statics.field2518.field2008;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2531.method1369(Statics.field2518.field2015, Statics.field2518.field2008, var21);
                        if (field2521 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2518.field2015[Statics.field2518.field2008 + var22] ^= field2521;
                            }
                        }
                        Statics.field2518.field2008 += var21;
                        field2528 += var21;
                        if (Statics.field2518.field2008 == var20) {
                            if (Statics.field366.field2816 == 16711935L) {
                                Statics.field2445 = Statics.field2518;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2530[var23];
                                    if (var24 != null) {
                                        Statics.field2445.field2008 = var23 * 8 + 5;
                                        int var25 = Statics.field2445.method2415();
                                        int var26 = Statics.field2445.method2415();
                                        var24.method3006(var25, var26);
                                    }
                                }
                            } else {
                                field2529.reset();
                                field2529.update(Statics.field2518.field2015, 0, var20);
                                int var27 = (int) field2529.getValue();
                                if (Statics.field366.field2546 != var27) {
                                    try {
                                        Statics.field2531.method1352();
                                    } catch (Exception var32) {
                                    }
                                    field2532++;
                                    Statics.field2531 = null;
                                    field2521 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2532 = 0;
                                field2515 = 0;
                                Statics.field366.field2548.method3016((int) (Statics.field366.field2816 & 0xFFFFL), Statics.field2518.field2015, (Statics.field366.field2816 & 0xFF0000L) == 16711680L, Statics.field2525);
                            }
                            Statics.field366.method3301();
                            if (Statics.field2525) {
                                field2526--;
                            } else {
                                field2524--;
                            }
                            field2528 = 0;
                            Statics.field366 = null;
                            Statics.field2518 = null;
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
                    Statics.field2531.method1352();
                } catch (Exception var31) {
                }
                field2515++;
                Statics.field2531 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ep.p(Leq;II)V")
    public static void method2899(class154 arg0, int arg1) {
        if (Statics.field2445 == null) {
            method106((class154) null, 255, 255, 0, (byte) 0, true);
            field2530[arg1] = arg0;
        } else {
            Statics.field2445.field2008 = arg1 * 8 + 5;
            int var2 = Statics.field2445.method2415();
            int var3 = Statics.field2445.method2415();
            arg0.method3006(var2, var3);
        }
    }

    @ObfuscatedName("s.k(Leq;IIIBZI)V")
    public static void method106(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2516.method3259(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2527.method3259(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2519.method3259(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2523.method3259(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2548 = arg0;
            var12.field2546 = arg3;
            var12.field2547 = arg4;
            if (arg5) {
                field2516.method3253(var12, var6);
                field2517++;
            } else {
                field2520.method3212(var12);
                field2519.method3253(var12, var6);
                field2522++;
            }
        } else if (arg5) {
            var10.method3239();
            field2516.method3253(var10, var6);
            field2522--;
            field2517++;
        }
    }

    @ObfuscatedName("el.a(III)V")
    public static void method2891(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class155 var4 = (class155) field2519.method3259(var2);
        if (var4 != null) {
            field2520.method3211(var4);
        }
    }

    @ObfuscatedName("s.q(ZZI)I")
    public static int method107(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2526 + field2517;
        }
        if (arg1) {
            var2 += field2524 + field2522;
        }
        return var2;
    }
}
