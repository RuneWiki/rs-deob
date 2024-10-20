package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eb")
public class class151 {

    @ObfuscatedName("eb.e")
    public static int field2458 = 0;

    @ObfuscatedName("eb.j")
    public static class173 field2460 = new class173(4096);

    @ObfuscatedName("eb.i")
    public static int field2461 = 0;

    @ObfuscatedName("eb.o")
    public static class173 field2462 = new class173(32);

    @ObfuscatedName("eb.l")
    public static int field2463 = 0;

    @ObfuscatedName("eb.p")
    public static class170 field2481 = new class170();

    @ObfuscatedName("eb.t")
    public static class173 field2465 = new class173(4096);

    @ObfuscatedName("eb.w")
    public static int field2466 = 0;

    @ObfuscatedName("eb.r")
    public static class173 field2480 = new class173(4096);

    @ObfuscatedName("eb.a")
    public static int field2468 = 0;

    @ObfuscatedName("eb.d")
    public static class126 field2470 = new class126(8);

    @ObfuscatedName("eb.s")
    public static int field2459 = 0;

    @ObfuscatedName("eb.y")
    public static CRC32 field2464 = new CRC32();

    @ObfuscatedName("eb.h")
    public static class152[] field2472 = new class152[256];

    @ObfuscatedName("eb.f")
    public static byte field2469 = 0;

    @ObfuscatedName("eb.v")
    public static int field2474 = 0;

    @ObfuscatedName("eb.u")
    public static int field2475 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.g(B)Z")
    public static boolean method2249() {
        long var0 = class120.method8();
        int var2 = (int) (var0 - Statics.field2471);
        Statics.field2471 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2458 += var2;
        if (field2468 == 0 && field2463 == 0 && field2466 == 0 && field2461 == 0) {
            return true;
        } else if (Statics.field2473 == null) {
            return false;
        } else {
            try {
                if (field2458 > 30000) {
                    throw new IOException();
                }
                while (field2463 < 20 && field2461 > 0) {
                    class153 var3 = (class153) field2460.method3357();
                    class126 var4 = new class126(4);
                    var4.method2472(1);
                    var4.method2615((int) var3.field2760);
                    Statics.field2473.method1371(var4.field2013, 0, 4);
                    field2462.method3353(var3, var3.field2760);
                    field2461--;
                    field2463++;
                }
                while (field2468 < 20 && field2466 > 0) {
                    class153 var5 = (class153) field2481.method3328();
                    class126 var6 = new class126(4);
                    var6.method2472(0);
                    var6.method2615((int) var5.field2760);
                    Statics.field2473.method1371(var6.field2013, 0, 4);
                    var5.method3351();
                    field2480.method3353(var5, var5.field2760);
                    field2466--;
                    field2468++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2473.method1369();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2458 = 0;
                    byte var9 = 0;
                    if (Statics.field1764 == null) {
                        var9 = 8;
                    } else if (field2459 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2470.field2016;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2473.method1370(field2470.field2013, field2470.field2016, var10);
                        if (field2469 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2470.field2013[field2470.field2016 + var11] ^= field2469;
                            }
                        }
                        field2470.field2016 += var10;
                        if (field2470.field2016 < var9) {
                            break;
                        }
                        if (Statics.field1764 == null) {
                            field2470.field2016 = 0;
                            int var12 = field2470.method2485();
                            int var13 = field2470.method2487();
                            int var14 = field2470.method2485();
                            int var15 = field2470.method2593();
                            long var16 = (long) ((var12 << 16) + var13);
                            class153 var18 = (class153) field2462.method3354(var16);
                            Statics.field2301 = true;
                            if (var18 == null) {
                                var18 = (class153) field2480.method3354(var16);
                                Statics.field2301 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1764 = var18;
                            Statics.field2021 = new class126(var15 + var19 + Statics.field1764.field2495);
                            Statics.field2021.method2472(var14);
                            Statics.field2021.method2475(var15);
                            field2459 = 8;
                            field2470.field2016 = 0;
                        } else if (field2459 == 0) {
                            if (field2470.field2013[0] == -1) {
                                field2459 = 1;
                                field2470.field2016 = 0;
                            } else {
                                Statics.field1764 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2021.field2013.length - Statics.field1764.field2495;
                        int var21 = 512 - field2459;
                        if (var21 > var20 - Statics.field2021.field2016) {
                            var21 = var20 - Statics.field2021.field2016;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2473.method1370(Statics.field2021.field2013, Statics.field2021.field2016, var21);
                        if (field2469 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2021.field2013[Statics.field2021.field2016 + var22] ^= field2469;
                            }
                        }
                        Statics.field2021.field2016 += var21;
                        field2459 += var21;
                        if (Statics.field2021.field2016 == var20) {
                            if (Statics.field1764.field2760 == 16711935L) {
                                Statics.field2478 = Statics.field2021;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class152 var24 = field2472[var23];
                                    if (var24 != null) {
                                        Statics.field2478.field2016 = var23 * 8 + 5;
                                        int var25 = Statics.field2478.method2593();
                                        int var26 = Statics.field2478.method2593();
                                        var24.method3109(var25, var26);
                                    }
                                }
                            } else {
                                field2464.reset();
                                field2464.update(Statics.field2021.field2013, 0, var20);
                                int var27 = (int) field2464.getValue();
                                if (Statics.field1764.field2501 != var27) {
                                    try {
                                        Statics.field2473.method1366();
                                    } catch (Exception var32) {
                                    }
                                    field2474++;
                                    Statics.field2473 = null;
                                    field2469 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2474 = 0;
                                field2475 = 0;
                                Statics.field1764.field2502.method3105((int) (Statics.field1764.field2760 & 0xFFFFL), Statics.field2021.field2013, (Statics.field1764.field2760 & 0xFF0000L) == 16711680L, Statics.field2301);
                            }
                            Statics.field1764.method3415();
                            if (Statics.field2301) {
                                field2463--;
                            } else {
                                field2468--;
                            }
                            field2459 = 0;
                            Statics.field1764 = null;
                            Statics.field2021 = null;
                        } else {
                            if (field2459 != 512) {
                                break;
                            }
                            field2459 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2473.method1366();
                } catch (Exception var31) {
                }
                field2475++;
                Statics.field2473 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("z.e(ZI)V")
    public static void method119(boolean arg0) {
        if (Statics.field2473 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2472(arg0 ? 2 : 3);
            var1.method2615(0);
            Statics.field2473.method1371(var1.field2013, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2473.method1366();
            } catch (Exception var4) {
            }
            field2475++;
            Statics.field2473 = null;
        }
    }

    @ObfuscatedName("d.n(Lbh;ZI)V")
    public static void method122(class69 arg0, boolean arg1) {
        if (Statics.field2473 != null) {
            try {
                Statics.field2473.method1366();
            } catch (Exception var10) {
            }
            Statics.field2473 = null;
        }
        Statics.field2473 = arg0;
        method119(arg1);
        field2470.field2016 = 0;
        Statics.field1764 = null;
        Statics.field2021 = null;
        field2459 = 0;
        while (true) {
            class153 var3 = (class153) field2462.method3357();
            if (var3 == null) {
                while (true) {
                    class153 var4 = (class153) field2480.method3357();
                    if (var4 == null) {
                        if (field2469 != 0) {
                            try {
                                class126 var5 = new class126(4);
                                var5.method2472(4);
                                var5.method2472(field2469);
                                var5.method2473(0);
                                Statics.field2473.method1371(var5.field2013, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2473.method1366();
                                } catch (Exception var8) {
                                }
                                field2475++;
                                Statics.field2473 = null;
                            }
                        }
                        field2458 = 0;
                        Statics.field2471 = class120.method8();
                        return;
                    }
                    field2481.method3326(var4);
                    field2465.method3353(var4, var4.field2760);
                    field2466++;
                    field2468--;
                }
            }
            field2460.method3353(var3, var3.field2760);
            field2461++;
            field2463--;
        }
    }

    @ObfuscatedName("ey.j(Leh;II)V")
    public static void method2889(class152 arg0, int arg1) {
        if (Statics.field2478 == null) {
            method3192((class152) null, 255, 255, 0, (byte) 0, true);
            field2472[arg1] = arg0;
        } else {
            Statics.field2478.field2016 = arg1 * 8 + 5;
            int var2 = Statics.field2478.method2593();
            int var3 = Statics.field2478.method2593();
            arg0.method3109(var2, var3);
        }
    }

    @ObfuscatedName("ef.i(Leh;IIIBZI)V")
    public static void method3192(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class153 var8 = (class153) field2460.method3354(var6);
        if (var8 != null) {
            return;
        }
        class153 var9 = (class153) field2462.method3354(var6);
        if (var9 != null) {
            return;
        }
        class153 var10 = (class153) field2465.method3354(var6);
        if (var10 == null) {
            if (!arg5) {
                class153 var11 = (class153) field2480.method3354(var6);
                if (var11 != null) {
                    return;
                }
            }
            class153 var12 = new class153();
            var12.field2502 = arg0;
            var12.field2501 = arg3;
            var12.field2495 = arg4;
            if (arg5) {
                field2460.method3353(var12, var6);
                field2461++;
            } else {
                field2481.method3331(var12);
                field2465.method3353(var12, var6);
                field2466++;
            }
        } else if (arg5) {
            var10.method3351();
            field2460.method3353(var10, var6);
            field2466--;
            field2461++;
        }
    }

    @ObfuscatedName("a.o(IIB)V")
    public static void method113(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class153 var4 = (class153) field2465.method3354(var2);
        if (var4 != null) {
            field2481.method3326(var4);
        }
    }
}
