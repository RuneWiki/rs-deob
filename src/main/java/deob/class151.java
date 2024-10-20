package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("em")
public class class151 {

    @ObfuscatedName("em.y")
    public static int field2463 = 0;

    @ObfuscatedName("em.z")
    public static class173 field2465 = new class173(4096);

    @ObfuscatedName("em.c")
    public static int field2466 = 0;

    @ObfuscatedName("em.e")
    public static class173 field2482 = new class173(32);

    @ObfuscatedName("em.s")
    public static int field2468 = 0;

    @ObfuscatedName("em.i")
    public static class170 field2462 = new class170();

    @ObfuscatedName("em.g")
    public static class173 field2470 = new class173(4096);

    @ObfuscatedName("em.q")
    public static int field2471 = 0;

    @ObfuscatedName("em.w")
    public static class173 field2472 = new class173(4096);

    @ObfuscatedName("em.k")
    public static int field2476 = 0;

    @ObfuscatedName("em.m")
    public static class126 field2467 = new class126(8);

    @ObfuscatedName("em.r")
    public static int field2481 = 0;

    @ObfuscatedName("em.n")
    public static CRC32 field2477 = new CRC32();

    @ObfuscatedName("em.p")
    public static class152[] field2480 = new class152[256];

    @ObfuscatedName("em.t")
    public static byte field2479 = 0;

    @ObfuscatedName("em.l")
    public static int field2473 = 0;

    @ObfuscatedName("em.a")
    public static int field2469 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.j(I)Z")
    public static boolean method2359() {
        long var0 = class120.method2616();
        int var2 = (int) (var0 - Statics.field2464);
        Statics.field2464 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2463 += var2;
        if (field2476 == 0 && field2468 == 0 && field2471 == 0 && field2466 == 0) {
            return true;
        } else if (Statics.field2475 == null) {
            return false;
        } else {
            try {
                if (field2463 > 30000) {
                    throw new IOException();
                }
                while (field2468 < 20 && field2466 > 0) {
                    class153 var3 = (class153) field2465.method3225();
                    class126 var4 = new class126(4);
                    var4.method2369(1);
                    var4.method2371((int) var3.field2758);
                    Statics.field2475.method1355(var4.field2025, 0, 4);
                    field2482.method3223(var3, var3.field2758);
                    field2466--;
                    field2468++;
                }
                while (field2476 < 20 && field2471 > 0) {
                    class153 var5 = (class153) field2462.method3199();
                    class126 var6 = new class126(4);
                    var6.method2369(0);
                    var6.method2371((int) var5.field2758);
                    Statics.field2475.method1355(var6.field2025, 0, 4);
                    var5.method3219();
                    field2472.method3223(var5, var5.field2758);
                    field2471--;
                    field2476++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2475.method1353();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2463 = 0;
                    byte var9 = 0;
                    if (Statics.field1983 == null) {
                        var9 = 8;
                    } else if (field2481 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2467.field2020;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2475.method1354(field2467.field2025, field2467.field2020, var10);
                        if (field2479 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2467.field2025[field2467.field2020 + var11] ^= field2479;
                            }
                        }
                        field2467.field2020 += var10;
                        if (field2467.field2020 < var9) {
                            break;
                        }
                        if (Statics.field1983 == null) {
                            field2467.field2020 = 0;
                            int var12 = field2467.method2399();
                            int var13 = field2467.method2405();
                            int var14 = field2467.method2399();
                            int var15 = field2467.method2387();
                            long var16 = (long) ((var12 << 16) + var13);
                            class153 var18 = (class153) field2482.method3222(var16);
                            Statics.field2478 = true;
                            if (var18 == null) {
                                var18 = (class153) field2472.method3222(var16);
                                Statics.field2478 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1983 = var18;
                            Statics.field195 = new class126(var15 + var19 + Statics.field1983.field2498);
                            Statics.field195.method2369(var14);
                            Statics.field195.method2372(var15);
                            field2481 = 8;
                            field2467.field2020 = 0;
                        } else if (field2481 == 0) {
                            if (field2467.field2025[0] == -1) {
                                field2481 = 1;
                                field2467.field2020 = 0;
                            } else {
                                Statics.field1983 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field195.field2025.length - Statics.field1983.field2498;
                        int var21 = 512 - field2481;
                        if (var21 > var20 - Statics.field195.field2020) {
                            var21 = var20 - Statics.field195.field2020;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2475.method1354(Statics.field195.field2025, Statics.field195.field2020, var21);
                        if (field2479 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field195.field2025[Statics.field195.field2020 + var22] ^= field2479;
                            }
                        }
                        Statics.field195.field2020 += var21;
                        field2481 += var21;
                        if (Statics.field195.field2020 == var20) {
                            if (Statics.field1983.field2758 == 16711935L) {
                                Statics.field883 = Statics.field195;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class152 var24 = field2480[var23];
                                    if (var24 != null) {
                                        Statics.field883.field2020 = var23 * 8 + 5;
                                        int var25 = Statics.field883.method2387();
                                        int var26 = Statics.field883.method2387();
                                        var24.method2996(var25, var26);
                                    }
                                }
                            } else {
                                field2477.reset();
                                field2477.update(Statics.field195.field2025, 0, var20);
                                int var27 = (int) field2477.getValue();
                                if (Statics.field1983.field2496 != var27) {
                                    try {
                                        Statics.field2475.method1350();
                                    } catch (Exception var32) {
                                    }
                                    field2473++;
                                    Statics.field2475 = null;
                                    field2479 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2473 = 0;
                                field2469 = 0;
                                Statics.field1983.field2497.method2997((int) (Statics.field1983.field2758 & 0xFFFFL), Statics.field195.field2025, (Statics.field1983.field2758 & 0xFF0000L) == 16711680L, Statics.field2478);
                            }
                            Statics.field1983.method3289();
                            if (Statics.field2478) {
                                field2468--;
                            } else {
                                field2476--;
                            }
                            field2481 = 0;
                            Statics.field1983 = null;
                            Statics.field195 = null;
                        } else {
                            if (field2481 != 512) {
                                break;
                            }
                            field2481 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2475.method1350();
                } catch (Exception var31) {
                }
                field2469++;
                Statics.field2475 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ec.y(ZI)V")
    public static void method2632(boolean arg0) {
        if (Statics.field2475 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2369(arg0 ? 2 : 3);
            var1.method2371(0);
            Statics.field2475.method1355(var1.field2025, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2475.method1350();
            } catch (Exception var4) {
            }
            field2469++;
            Statics.field2475 = null;
        }
    }

    @ObfuscatedName("f.x(Led;II)V")
    public static void method222(class152 arg0, int arg1) {
        if (Statics.field883 == null) {
            method2275((class152) null, 255, 255, 0, (byte) 0, true);
            field2480[arg1] = arg0;
        } else {
            Statics.field883.field2020 = arg1 * 8 + 5;
            int var2 = Statics.field883.method2387();
            int var3 = Statics.field883.method2387();
            arg0.method2996(var2, var3);
        }
    }

    @ObfuscatedName("dj.z(Led;IIIBZI)V")
    public static void method2275(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class153 var8 = (class153) field2465.method3222(var6);
        if (var8 != null) {
            return;
        }
        class153 var9 = (class153) field2482.method3222(var6);
        if (var9 != null) {
            return;
        }
        class153 var10 = (class153) field2470.method3222(var6);
        if (var10 == null) {
            if (!arg5) {
                class153 var11 = (class153) field2472.method3222(var6);
                if (var11 != null) {
                    return;
                }
            }
            class153 var12 = new class153();
            var12.field2497 = arg0;
            var12.field2496 = arg3;
            var12.field2498 = arg4;
            if (arg5) {
                field2465.method3223(var12, var6);
                field2466++;
            } else {
                field2462.method3196(var12);
                field2470.method3223(var12, var6);
                field2471++;
            }
        } else if (arg5) {
            var10.method3219();
            field2465.method3223(var10, var6);
            field2471--;
            field2466++;
        }
    }
}
