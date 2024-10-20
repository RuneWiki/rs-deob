package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fa")
public class class162 {

    @ObfuscatedName("fa.k")
    public static int field2618 = 0;

    @ObfuscatedName("fa.f")
    public static class187 field2620 = new class187(4096);

    @ObfuscatedName("fa.w")
    public static int field2617 = 0;

    @ObfuscatedName("fa.t")
    public static class187 field2637 = new class187(32);

    @ObfuscatedName("fa.s")
    public static int field2623 = 0;

    @ObfuscatedName("fa.c")
    public static class194 field2622 = new class194();

    @ObfuscatedName("fa.d")
    public static class187 field2625 = new class187(4096);

    @ObfuscatedName("fa.v")
    public static int field2626 = 0;

    @ObfuscatedName("fa.m")
    public static class187 field2621 = new class187(4096);

    @ObfuscatedName("fa.h")
    public static int field2628 = 0;

    @ObfuscatedName("fa.o")
    public static class111 field2630 = new class111(8);

    @ObfuscatedName("fa.y")
    public static int field2631 = 0;

    @ObfuscatedName("fa.q")
    public static CRC32 field2638 = new CRC32();

    @ObfuscatedName("fa.l")
    public static class159[] field2635 = new class159[256];

    @ObfuscatedName("fa.u")
    public static byte field2624 = 0;

    @ObfuscatedName("fa.j")
    public static int field2636 = 0;

    @ObfuscatedName("fa.z")
    public static int field2634 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.p(I)Z")
    public static boolean method2477() {
        long var0 = class107.method579();
        int var2 = (int) (var0 - Statics.field2619);
        Statics.field2619 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2618 += var2;
        if (field2628 == 0 && field2623 == 0 && field2626 == 0 && field2617 == 0) {
            return true;
        } else if (Statics.field2627 == null) {
            return false;
        } else {
            try {
                if (field2618 > 30000) {
                    throw new IOException();
                }
                while (field2623 < 20 && field2617 > 0) {
                    class163 var3 = (class163) field2620.method3412();
                    class111 var4 = new class111(4);
                    var4.method2160(1);
                    var4.method2260((int) var3.field3015);
                    Statics.field2627.method2658(var4.field1889, 0, 4);
                    field2637.method3406(var3, var3.field3015);
                    field2617--;
                    field2623++;
                }
                while (field2628 < 20 && field2626 > 0) {
                    class163 var5 = (class163) field2622.method3502();
                    class111 var6 = new class111(4);
                    var6.method2160(0);
                    var6.method2260((int) var5.field3015);
                    Statics.field2627.method2658(var6.field1889, 0, 4);
                    var5.method3519();
                    field2621.method3406(var5, var5.field3015);
                    field2626--;
                    field2628++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2627.method2656();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2618 = 0;
                    byte var9 = 0;
                    if (Statics.field1856 == null) {
                        var9 = 8;
                    } else if (field2631 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2630.field1885;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2627.method2646(field2630.field1889, field2630.field1885, var10);
                        if (field2624 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2630.field1889[field2630.field1885 + var11] ^= field2624;
                            }
                        }
                        field2630.field1885 += var10;
                        if (field2630.field1885 < var9) {
                            break;
                        }
                        if (Statics.field1856 == null) {
                            field2630.field1885 = 0;
                            int var12 = field2630.method2314();
                            int var13 = field2630.method2177();
                            int var14 = field2630.method2314();
                            int var15 = field2630.method2350();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2637.method3405(var16);
                            Statics.field2629 = true;
                            if (var18 == null) {
                                var18 = (class163) field2621.method3405(var16);
                                Statics.field2629 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1856 = var18;
                            Statics.field2075 = new class111(var15 + var19 + Statics.field1856.field2641);
                            Statics.field2075.method2160(var14);
                            Statics.field2075.method2161(var15);
                            field2631 = 8;
                            field2630.field1885 = 0;
                        } else if (field2631 == 0) {
                            if (field2630.field1889[0] == -1) {
                                field2631 = 1;
                                field2630.field1885 = 0;
                            } else {
                                Statics.field1856 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2075.field1889.length - Statics.field1856.field2641;
                        int var21 = 512 - field2631;
                        if (var21 > var20 - Statics.field2075.field1885) {
                            var21 = var20 - Statics.field2075.field1885;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2627.method2646(Statics.field2075.field1889, Statics.field2075.field1885, var21);
                        if (field2624 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2075.field1889[Statics.field2075.field1885 + var22] ^= field2624;
                            }
                        }
                        Statics.field2075.field1885 += var21;
                        field2631 += var21;
                        if (Statics.field2075.field1885 == var20) {
                            if (Statics.field1856.field3015 == 16711935L) {
                                Statics.field1530 = Statics.field2075;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2635[var23];
                                    if (var24 != null) {
                                        Statics.field1530.field1885 = var23 * 8 + 5;
                                        int var25 = Statics.field1530.method2350();
                                        int var26 = Statics.field1530.method2350();
                                        var24.method2981(var25, var26);
                                    }
                                }
                            } else {
                                field2638.reset();
                                field2638.update(Statics.field2075.field1889, 0, var20);
                                int var27 = (int) field2638.getValue();
                                if (Statics.field1856.field2640 != var27) {
                                    try {
                                        Statics.field2627.method2643();
                                    } catch (Exception var32) {
                                    }
                                    field2636++;
                                    Statics.field2627 = null;
                                    field2624 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2636 = 0;
                                field2634 = 0;
                                Statics.field1856.field2639.method2979((int) (Statics.field1856.field3015 & 0xFFFFL), Statics.field2075.field1889, (Statics.field1856.field3015 & 0xFF0000L) == 16711680L, Statics.field2629);
                            }
                            Statics.field1856.method3533();
                            if (Statics.field2629) {
                                field2623--;
                            } else {
                                field2628--;
                            }
                            field2631 = 0;
                            Statics.field1856 = null;
                            Statics.field2075 = null;
                        } else {
                            if (field2631 != 512) {
                                break;
                            }
                            field2631 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2627.method2643();
                } catch (Exception var31) {
                }
                field2634++;
                Statics.field2627 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("dl.k(ZB)V")
    public static void method2497(boolean arg0) {
        if (Statics.field2627 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2160(arg0 ? 2 : 3);
            var1.method2260(0);
            Statics.field2627.method2658(var1.field1889, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2627.method2643();
            } catch (Exception var4) {
            }
            field2634++;
            Statics.field2627 = null;
        }
    }

    @ObfuscatedName("do.e(Lep;ZI)V")
    public static void method2407(class135 arg0, boolean arg1) {
        if (Statics.field2627 != null) {
            try {
                Statics.field2627.method2643();
            } catch (Exception var10) {
            }
            Statics.field2627 = null;
        }
        Statics.field2627 = arg0;
        method2497(arg1);
        field2630.field1885 = 0;
        Statics.field1856 = null;
        Statics.field2075 = null;
        field2631 = 0;
        while (true) {
            class163 var3 = (class163) field2637.method3412();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2621.method3412();
                    if (var4 == null) {
                        if (field2624 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2160(4);
                                var5.method2160(field2624);
                                var5.method2365(0);
                                Statics.field2627.method2658(var5.field1889, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2627.method2643();
                                } catch (Exception var8) {
                                }
                                field2634++;
                                Statics.field2627 = null;
                            }
                        }
                        field2618 = 0;
                        Statics.field2619 = class107.method579();
                        return;
                    }
                    field2622.method3501(var4);
                    field2625.method3406(var4, var4.field3015);
                    field2626++;
                    field2628--;
                }
            }
            field2620.method3406(var3, var3.field3015);
            field2617++;
            field2623--;
        }
    }

    @ObfuscatedName("b.f(Lft;IIIBZS)V")
    public static void method563(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2620.method3405(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2637.method3405(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2625.method3405(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2621.method3405(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2639 = arg0;
            var12.field2640 = arg3;
            var12.field2641 = arg4;
            if (arg5) {
                field2620.method3406(var12, var6);
                field2617++;
            } else {
                field2622.method3498(var12);
                field2625.method3406(var12, var6);
                field2626++;
            }
        } else if (arg5) {
            var10.method3519();
            field2620.method3406(var10, var6);
            field2626--;
            field2617++;
        }
    }

    @ObfuscatedName("ew.w(IIS)V")
    public static void method2823(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class163 var4 = (class163) field2625.method3405(var2);
        if (var4 != null) {
            field2622.method3501(var4);
        }
    }

    @ObfuscatedName("ep.t(III)I")
    public static int method2666(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1856 != null && Statics.field1856.field3015 == var2 ? Statics.field2075.field1885 * 99 / (Statics.field2075.field1889.length - Statics.field1856.field2641) + 1 : 0;
    }

    @ObfuscatedName("dh.s(B)V")
    public static void method2452() {
        if (Statics.field2627 != null) {
            Statics.field2627.method2643();
        }
    }
}
