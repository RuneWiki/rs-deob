package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ee")
public class class153 {

    @ObfuscatedName("ee.i")
    public static int field2524 = 0;

    @ObfuscatedName("ee.n")
    public static class175 field2533 = new class175(4096);

    @ObfuscatedName("ee.l")
    public static int field2527 = 0;

    @ObfuscatedName("ee.v")
    public static class175 field2528 = new class175(32);

    @ObfuscatedName("ee.g")
    public static int field2530 = 0;

    @ObfuscatedName("ee.x")
    public static class172 field2537 = new class172();

    @ObfuscatedName("ee.c")
    public static class175 field2531 = new class175(4096);

    @ObfuscatedName("ee.f")
    public static int field2532 = 0;

    @ObfuscatedName("ee.r")
    public static class175 field2523 = new class175(4096);

    @ObfuscatedName("ee.d")
    public static int field2534 = 0;

    @ObfuscatedName("ee.u")
    public static class127 field2535 = new class127(8);

    @ObfuscatedName("ee.s")
    public static int field2536 = 0;

    @ObfuscatedName("ee.b")
    public static CRC32 field2529 = new CRC32();

    @ObfuscatedName("ee.h")
    public static class154[] field2538 = new class154[256];

    @ObfuscatedName("ee.m")
    public static byte field2541 = 0;

    @ObfuscatedName("ee.y")
    public static int field2540 = 0;

    @ObfuscatedName("ee.t")
    public static int field2525 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.p(I)Z")
    public static boolean method1291() {
        long var0 = class121.method711();
        int var2 = (int) (var0 - Statics.field2539);
        Statics.field2539 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2524 += var2;
        if (field2534 == 0 && field2530 == 0 && field2532 == 0 && field2527 == 0) {
            return true;
        } else if (Statics.field2526 == null) {
            return false;
        } else {
            try {
                if (field2524 > 30000) {
                    throw new IOException();
                }
                while (field2530 < 20 && field2527 > 0) {
                    class155 var3 = (class155) field2533.method3326();
                    class127 var4 = new class127(4);
                    var4.method2474(1);
                    var4.method2476((int) var3.field2820);
                    Statics.field2526.method1414(var4.field2037, 0, 4);
                    field2528.method3313(var3, var3.field2820);
                    field2527--;
                    field2530++;
                }
                while (field2534 < 20 && field2532 > 0) {
                    class155 var5 = (class155) field2537.method3287();
                    class127 var6 = new class127(4);
                    var6.method2474(0);
                    var6.method2476((int) var5.field2820);
                    Statics.field2526.method1414(var6.field2037, 0, 4);
                    var5.method3310();
                    field2523.method3313(var5, var5.field2820);
                    field2532--;
                    field2534++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2526.method1409();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2524 = 0;
                    byte var9 = 0;
                    if (Statics.field1935 == null) {
                        var9 = 8;
                    } else if (field2536 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2535.field2038;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2526.method1430(field2535.field2037, field2535.field2038, var10);
                        if (field2541 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2535.field2037[field2535.field2038 + var11] ^= field2541;
                            }
                        }
                        field2535.field2038 += var10;
                        if (field2535.field2038 < var9) {
                            break;
                        }
                        if (Statics.field1935 == null) {
                            field2535.field2038 = 0;
                            int var12 = field2535.method2659();
                            int var13 = field2535.method2652();
                            int var14 = field2535.method2659();
                            int var15 = field2535.method2551();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2528.method3312(var16);
                            Statics.field2472 = true;
                            if (var18 == null) {
                                var18 = (class155) field2523.method3312(var16);
                                Statics.field2472 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1935 = var18;
                            Statics.field1517 = new class127(var15 + var19 + Statics.field1935.field2558);
                            Statics.field1517.method2474(var14);
                            Statics.field1517.method2606(var15);
                            field2536 = 8;
                            field2535.field2038 = 0;
                        } else if (field2536 == 0) {
                            if (field2535.field2037[0] == -1) {
                                field2536 = 1;
                                field2535.field2038 = 0;
                            } else {
                                Statics.field1935 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1517.field2037.length - Statics.field1935.field2558;
                        int var21 = 512 - field2536;
                        if (var21 > var20 - Statics.field1517.field2038) {
                            var21 = var20 - Statics.field1517.field2038;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2526.method1430(Statics.field1517.field2037, Statics.field1517.field2038, var21);
                        if (field2541 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1517.field2037[Statics.field1517.field2038 + var22] ^= field2541;
                            }
                        }
                        Statics.field1517.field2038 += var21;
                        field2536 += var21;
                        if (Statics.field1517.field2038 == var20) {
                            if (Statics.field1935.field2820 == 16711935L) {
                                Statics.field1996 = Statics.field1517;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2538[var23];
                                    if (var24 != null) {
                                        Statics.field1996.field2038 = var23 * 8 + 5;
                                        int var25 = Statics.field1996.method2551();
                                        int var26 = Statics.field1996.method2551();
                                        var24.method3084(var25, var26);
                                    }
                                }
                            } else {
                                field2529.reset();
                                field2529.update(Statics.field1517.field2037, 0, var20);
                                int var27 = (int) field2529.getValue();
                                if (Statics.field1935.field2557 != var27) {
                                    try {
                                        Statics.field2526.method1410();
                                    } catch (Exception var32) {
                                    }
                                    field2540++;
                                    Statics.field2526 = null;
                                    field2541 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2540 = 0;
                                field2525 = 0;
                                Statics.field1935.field2559.method3100((int) (Statics.field1935.field2820 & 0xFFFFL), Statics.field1517.field2037, (Statics.field1935.field2820 & 0xFF0000L) == 16711680L, Statics.field2472);
                            }
                            Statics.field1935.method3360();
                            if (Statics.field2472) {
                                field2530--;
                            } else {
                                field2534--;
                            }
                            field2536 = 0;
                            Statics.field1935 = null;
                            Statics.field1517 = null;
                        } else {
                            if (field2536 != 512) {
                                break;
                            }
                            field2536 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2526.method1410();
                } catch (Exception var31) {
                }
                field2525++;
                Statics.field2526 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("dy.i(Lbm;ZI)V")
    public static void method2344(class70 arg0, boolean arg1) {
        if (Statics.field2526 != null) {
            try {
                Statics.field2526.method1410();
            } catch (Exception var15) {
            }
            Statics.field2526 = null;
        }
        Statics.field2526 = arg0;
        if (Statics.field2526 != null) {
            try {
                class127 var3 = new class127(4);
                var3.method2474(arg1 ? 2 : 3);
                var3.method2476(0);
                Statics.field2526.method1414(var3.field2037, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field2526.method1410();
                } catch (Exception var13) {
                }
                field2525++;
                Statics.field2526 = null;
            }
        }
        field2535.field2038 = 0;
        Statics.field1935 = null;
        Statics.field1517 = null;
        field2536 = 0;
        while (true) {
            class155 var6 = (class155) field2528.method3326();
            if (var6 == null) {
                while (true) {
                    class155 var7 = (class155) field2523.method3326();
                    if (var7 == null) {
                        if (field2541 != 0) {
                            try {
                                class127 var8 = new class127(4);
                                var8.method2474(4);
                                var8.method2474(field2541);
                                var8.method2475(0);
                                Statics.field2526.method1414(var8.field2037, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field2526.method1410();
                                } catch (Exception var11) {
                                }
                                field2525++;
                                Statics.field2526 = null;
                            }
                        }
                        field2524 = 0;
                        Statics.field2539 = class121.method711();
                        return;
                    }
                    field2537.method3282(var7);
                    field2531.method3313(var7, var7.field2820);
                    field2532++;
                    field2534--;
                }
            }
            field2533.method3313(var6, var6.field2820);
            field2527++;
            field2530--;
        }
    }

    @ObfuscatedName("ao.o(Leo;II)V")
    public static void method664(class154 arg0, int arg1) {
        if (Statics.field1996 == null) {
            Statics.method2352((class154) null, 255, 255, 0, (byte) 0, true);
            field2538[arg1] = arg0;
        } else {
            Statics.field1996.field2038 = arg1 * 8 + 5;
            int var2 = Statics.field1996.method2551();
            int var3 = Statics.field1996.method2551();
            arg0.method3084(var2, var3);
        }
    }
}
