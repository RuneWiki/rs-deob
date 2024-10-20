package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ez")
public class class153 {

    @ObfuscatedName("ez.v")
    public static int field2516 = 0;

    @ObfuscatedName("ez.j")
    public static class175 field2518 = new class175(4096);

    @ObfuscatedName("ez.o")
    public static int field2519 = 0;

    @ObfuscatedName("ez.l")
    public static class175 field2520 = new class175(32);

    @ObfuscatedName("ez.g")
    public static int field2532 = 0;

    @ObfuscatedName("ez.w")
    public static class172 field2522 = new class172();

    @ObfuscatedName("ez.c")
    public static class175 field2530 = new class175(4096);

    @ObfuscatedName("ez.z")
    public static int field2524 = 0;

    @ObfuscatedName("ez.f")
    public static class175 field2525 = new class175(4096);

    @ObfuscatedName("ez.a")
    public static int field2526 = 0;

    @ObfuscatedName("ez.y")
    public static class127 field2529 = new class127(8);

    @ObfuscatedName("ez.h")
    public static int field2539 = 0;

    @ObfuscatedName("ez.b")
    public static CRC32 field2517 = new CRC32();

    @ObfuscatedName("ez.q")
    public static class154[] field2523 = new class154[256];

    @ObfuscatedName("ez.r")
    public static byte field2533 = 0;

    @ObfuscatedName("ez.u")
    public static int field2534 = 0;

    @ObfuscatedName("ez.p")
    public static int field2535 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.i(I)Z")
    public static boolean method1534() {
        long var0 = class121.method142();
        int var2 = (int) (var0 - Statics.field2440);
        Statics.field2440 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2516 += var2;
        if (field2526 == 0 && field2532 == 0 && field2524 == 0 && field2519 == 0) {
            return true;
        } else if (Statics.field2521 == null) {
            return false;
        } else {
            try {
                if (field2516 > 30000) {
                    throw new IOException();
                }
                while (field2532 < 20 && field2519 > 0) {
                    class155 var3 = (class155) field2518.method3351();
                    class127 var4 = new class127(4);
                    var4.method2477(1);
                    var4.method2574((int) var3.field2818);
                    Statics.field2521.method1411(var4.field2041, 0, 4);
                    field2520.method3349(var3, var3.field2818);
                    field2519--;
                    field2532++;
                }
                while (field2526 < 20 && field2524 > 0) {
                    class155 var5 = (class155) field2522.method3321();
                    class127 var6 = new class127(4);
                    var6.method2477(0);
                    var6.method2574((int) var5.field2818);
                    Statics.field2521.method1411(var6.field2041, 0, 4);
                    var5.method3345();
                    field2525.method3349(var5, var5.field2818);
                    field2524--;
                    field2526++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2521.method1409();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2516 = 0;
                    byte var9 = 0;
                    if (Statics.field2528 == null) {
                        var9 = 8;
                    } else if (field2539 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2529.field2039;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2521.method1410(field2529.field2041, field2529.field2039, var10);
                        if (field2533 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2529.field2041[field2529.field2039 + var11] ^= field2533;
                            }
                        }
                        field2529.field2039 += var10;
                        if (field2529.field2039 < var9) {
                            break;
                        }
                        if (Statics.field2528 == null) {
                            field2529.field2039 = 0;
                            int var12 = field2529.method2491();
                            int var13 = field2529.method2493();
                            int var14 = field2529.method2491();
                            int var15 = field2529.method2668();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2520.method3348(var16);
                            Statics.field2527 = true;
                            if (var18 == null) {
                                var18 = (class155) field2525.method3348(var16);
                                Statics.field2527 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2528 = var18;
                            Statics.field2326 = new class127(var15 + var19 + Statics.field2528.field2553);
                            Statics.field2326.method2477(var14);
                            Statics.field2326.method2480(var15);
                            field2539 = 8;
                            field2529.field2039 = 0;
                        } else if (field2539 == 0) {
                            if (field2529.field2041[0] == -1) {
                                field2539 = 1;
                                field2529.field2039 = 0;
                            } else {
                                Statics.field2528 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2326.field2041.length - Statics.field2528.field2553;
                        int var21 = 512 - field2539;
                        if (var21 > var20 - Statics.field2326.field2039) {
                            var21 = var20 - Statics.field2326.field2039;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2521.method1410(Statics.field2326.field2041, Statics.field2326.field2039, var21);
                        if (field2533 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2326.field2041[Statics.field2326.field2039 + var22] ^= field2533;
                            }
                        }
                        Statics.field2326.field2039 += var21;
                        field2539 += var21;
                        if (Statics.field2326.field2039 == var20) {
                            if (Statics.field2528.field2818 == 16711935L) {
                                Statics.field1522 = Statics.field2326;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2523[var23];
                                    if (var24 != null) {
                                        Statics.field1522.field2039 = var23 * 8 + 5;
                                        int var25 = Statics.field1522.method2668();
                                        int var26 = Statics.field1522.method2668();
                                        var24.method3145(var25, var26);
                                    }
                                }
                            } else {
                                field2517.reset();
                                field2517.update(Statics.field2326.field2041, 0, var20);
                                int var27 = (int) field2517.getValue();
                                if (Statics.field2528.field2552 != var27) {
                                    try {
                                        Statics.field2521.method1406();
                                    } catch (Exception var32) {
                                    }
                                    field2534++;
                                    Statics.field2521 = null;
                                    field2533 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2534 = 0;
                                field2535 = 0;
                                Statics.field2528.field2554.method3144((int) (Statics.field2528.field2818 & 0xFFFFL), Statics.field2326.field2041, (Statics.field2528.field2818 & 0xFF0000L) == 16711680L, Statics.field2527);
                            }
                            Statics.field2528.method3409();
                            if (Statics.field2527) {
                                field2532--;
                            } else {
                                field2526--;
                            }
                            field2539 = 0;
                            Statics.field2528 = null;
                            Statics.field2326 = null;
                        } else {
                            if (field2539 != 512) {
                                break;
                            }
                            field2539 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2521.method1406();
                } catch (Exception var31) {
                }
                field2535++;
                Statics.field2521 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ds.v(ZB)V")
    public static void method2427(boolean arg0) {
        if (Statics.field2521 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2477(arg0 ? 2 : 3);
            var1.method2574(0);
            Statics.field2521.method1411(var1.field2041, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2521.method1406();
            } catch (Exception var4) {
            }
            field2535++;
            Statics.field2521 = null;
        }
    }

    @ObfuscatedName("i.m(Leh;IIIBZI)V")
    public static void method1(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2518.method3348(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2520.method3348(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2530.method3348(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2525.method3348(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2554 = arg0;
            var12.field2552 = arg3;
            var12.field2553 = arg4;
            if (arg5) {
                field2518.method3349(var12, var6);
                field2519++;
            } else {
                field2522.method3319(var12);
                field2530.method3349(var12, var6);
                field2524++;
            }
        } else if (arg5) {
            var10.method3345();
            field2518.method3349(var10, var6);
            field2524--;
            field2519++;
        }
    }

    @ObfuscatedName("ar.j(ZZI)I")
    public static int method566(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2532 + field2519;
        }
        if (arg1) {
            var2 += field2526 + field2524;
        }
        return var2;
    }

    @ObfuscatedName("k.o(S)V")
    public static void method136() {
        if (Statics.field2521 != null) {
            Statics.field2521.method1406();
        }
    }
}
