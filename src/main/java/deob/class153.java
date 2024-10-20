package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ey")
public class class153 {

    @ObfuscatedName("ey.r")
    public static int field2516 = 0;

    @ObfuscatedName("ey.t")
    public static class175 field2526 = new class175(4096);

    @ObfuscatedName("ey.k")
    public static int field2517 = 0;

    @ObfuscatedName("ey.x")
    public static class175 field2532 = new class175(32);

    @ObfuscatedName("ey.v")
    public static int field2519 = 0;

    @ObfuscatedName("ey.g")
    public static class172 field2520 = new class172();

    @ObfuscatedName("ey.n")
    public static class175 field2521 = new class175(4096);

    @ObfuscatedName("ey.q")
    public static int field2522 = 0;

    @ObfuscatedName("ey.i")
    public static class175 field2523 = new class175(4096);

    @ObfuscatedName("ey.p")
    public static int field2524 = 0;

    @ObfuscatedName("ey.j")
    public static class126 field2530 = new class126(8);

    @ObfuscatedName("ey.b")
    public static int field2525 = 0;

    @ObfuscatedName("ey.m")
    public static CRC32 field2527 = new CRC32();

    @ObfuscatedName("ey.h")
    public static class154[] field2528 = new class154[256];

    @ObfuscatedName("ey.f")
    public static byte field2518 = 0;

    @ObfuscatedName("ey.w")
    public static int field2513 = 0;

    @ObfuscatedName("ey.l")
    public static int field2531 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.a(I)Z")
    public static boolean method1302() {
        long var0 = class121.method1471();
        int var2 = (int) (var0 - Statics.field2529);
        Statics.field2529 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2516 += var2;
        if (field2524 == 0 && field2519 == 0 && field2522 == 0 && field2517 == 0) {
            return true;
        } else if (Statics.field2514 == null) {
            return false;
        } else {
            try {
                if (field2516 > 30000) {
                    throw new IOException();
                }
                while (field2519 < 20 && field2517 > 0) {
                    class155 var3 = (class155) field2526.method3255();
                    class126 var4 = new class126(4);
                    var4.method2364(1);
                    var4.method2366((int) var3.field2817);
                    Statics.field2514.method1341(var4.field2015, 0, 4);
                    field2532.method3254(var3, var3.field2817);
                    field2517--;
                    field2519++;
                }
                while (field2524 < 20 && field2522 > 0) {
                    class155 var5 = (class155) field2520.method3226();
                    class126 var6 = new class126(4);
                    var6.method2364(0);
                    var6.method2366((int) var5.field2817);
                    Statics.field2514.method1341(var6.field2015, 0, 4);
                    var5.method3248();
                    field2523.method3254(var5, var5.field2817);
                    field2522--;
                    field2524++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2514.method1325();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2516 = 0;
                    byte var9 = 0;
                    if (Statics.field2774 == null) {
                        var9 = 8;
                    } else if (field2525 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2530.field2016;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2514.method1322(field2530.field2015, field2530.field2016, var10);
                        if (field2518 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2530.field2015[field2530.field2016 + var11] ^= field2518;
                            }
                        }
                        field2530.field2016 += var10;
                        if (field2530.field2016 < var9) {
                            break;
                        }
                        if (Statics.field2774 == null) {
                            field2530.field2016 = 0;
                            int var12 = field2530.method2481();
                            int var13 = field2530.method2373();
                            int var14 = field2530.method2481();
                            int var15 = field2530.method2383();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2532.method3252(var16);
                            Statics.field1636 = true;
                            if (var18 == null) {
                                var18 = (class155) field2523.method3252(var16);
                                Statics.field1636 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2774 = var18;
                            Statics.field2701 = new class126(var15 + var19 + Statics.field2774.field2550);
                            Statics.field2701.method2364(var14);
                            Statics.field2701.method2367(var15);
                            field2525 = 8;
                            field2530.field2016 = 0;
                        } else if (field2525 == 0) {
                            if (field2530.field2015[0] == -1) {
                                field2525 = 1;
                                field2530.field2016 = 0;
                            } else {
                                Statics.field2774 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2701.field2015.length - Statics.field2774.field2550;
                        int var21 = 512 - field2525;
                        if (var21 > var20 - Statics.field2701.field2016) {
                            var21 = var20 - Statics.field2701.field2016;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2514.method1322(Statics.field2701.field2015, Statics.field2701.field2016, var21);
                        if (field2518 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2701.field2015[Statics.field2701.field2016 + var22] ^= field2518;
                            }
                        }
                        Statics.field2701.field2016 += var21;
                        field2525 += var21;
                        if (Statics.field2701.field2016 == var20) {
                            if (Statics.field2774.field2817 == 16711935L) {
                                Statics.field357 = Statics.field2701;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2528[var23];
                                    if (var24 != null) {
                                        Statics.field357.field2016 = var23 * 8 + 5;
                                        int var25 = Statics.field357.method2383();
                                        int var26 = Statics.field357.method2383();
                                        var24.method3029(var25, var26);
                                    }
                                }
                            } else {
                                field2527.reset();
                                field2527.update(Statics.field2701.field2015, 0, var20);
                                int var27 = (int) field2527.getValue();
                                if (Statics.field2774.field2553 != var27) {
                                    try {
                                        Statics.field2514.method1333();
                                    } catch (Exception var32) {
                                    }
                                    field2513++;
                                    Statics.field2514 = null;
                                    field2518 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2513 = 0;
                                field2531 = 0;
                                Statics.field2774.field2547.method3030((int) (Statics.field2774.field2817 & 0xFFFFL), Statics.field2701.field2015, (Statics.field2774.field2817 & 0xFF0000L) == 16711680L, Statics.field1636);
                            }
                            Statics.field2774.method3311();
                            if (Statics.field1636) {
                                field2519--;
                            } else {
                                field2524--;
                            }
                            field2525 = 0;
                            Statics.field2774 = null;
                            Statics.field2701 = null;
                        } else {
                            if (field2525 != 512) {
                                break;
                            }
                            field2525 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2514.method1333();
                } catch (Exception var31) {
                }
                field2531++;
                Statics.field2514 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cr.r(ZI)V")
    public static void method1528(boolean arg0) {
        if (Statics.field2514 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2364(arg0 ? 2 : 3);
            var1.method2366(0);
            Statics.field2514.method1341(var1.field2015, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2514.method1333();
            } catch (Exception var4) {
            }
            field2531++;
            Statics.field2514 = null;
        }
    }

    @ObfuscatedName("i.u(Led;IIIBZB)V")
    public static void method93(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2526.method3252(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2532.method3252(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2521.method3252(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2523.method3252(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2547 = arg0;
            var12.field2553 = arg3;
            var12.field2550 = arg4;
            if (arg5) {
                field2526.method3254(var12, var6);
                field2517++;
            } else {
                field2520.method3223(var12);
                field2521.method3254(var12, var6);
                field2522++;
            }
        } else if (arg5) {
            var10.method3248();
            field2526.method3254(var10, var6);
            field2522--;
            field2517++;
        }
    }

    @ObfuscatedName("be.t(IIB)V")
    public static void method1205(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class155 var4 = (class155) field2521.method3252(var2);
        if (var4 != null) {
            field2520.method3224(var4);
        }
    }

    @ObfuscatedName("p.k(ZZI)I")
    public static int method99(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2519 + field2517;
        }
        if (arg1) {
            var2 += field2524 + field2522;
        }
        return var2;
    }

    @ObfuscatedName("cd.x(B)V")
    public static void method1990() {
        if (Statics.field2514 != null) {
            Statics.field2514.method1333();
        }
    }
}
