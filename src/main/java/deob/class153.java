package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ed")
public class class153 {

    @ObfuscatedName("ed.m")
    public static int field2512 = 0;

    @ObfuscatedName("ed.r")
    public static class175 field2513 = new class175(4096);

    @ObfuscatedName("ed.n")
    public static int field2511 = 0;

    @ObfuscatedName("ed.i")
    public static class175 field2515 = new class175(32);

    @ObfuscatedName("ed.s")
    public static int field2516 = 0;

    @ObfuscatedName("ed.w")
    public static class172 field2520 = new class172();

    @ObfuscatedName("ed.d")
    public static class175 field2518 = new class175(4096);

    @ObfuscatedName("ed.t")
    public static int field2519 = 0;

    @ObfuscatedName("ed.f")
    public static class175 field2517 = new class175(4096);

    @ObfuscatedName("ed.b")
    public static int field2521 = 0;

    @ObfuscatedName("ed.e")
    public static class127 field2522 = new class127(8);

    @ObfuscatedName("ed.o")
    public static int field2526 = 0;

    @ObfuscatedName("ed.j")
    public static CRC32 field2524 = new CRC32();

    @ObfuscatedName("ed.k")
    public static class154[] field2531 = new class154[256];

    @ObfuscatedName("ed.a")
    public static byte field2527 = 0;

    @ObfuscatedName("ed.y")
    public static int field2528 = 0;

    @ObfuscatedName("ed.q")
    public static int field2514 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.g(B)Z")
    public static boolean method2289() {
        long var0 = class121.method131();
        int var2 = (int) (var0 - Statics.field2441);
        Statics.field2441 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2512 += var2;
        if (field2521 == 0 && field2516 == 0 && field2519 == 0 && field2511 == 0) {
            return true;
        } else if (Statics.field2523 == null) {
            return false;
        } else {
            try {
                if (field2512 > 30000) {
                    throw new IOException();
                }
                while (field2516 < 20 && field2511 > 0) {
                    class155 var3 = (class155) field2513.method3312();
                    class127 var4 = new class127(4);
                    var4.method2498(1);
                    var4.method2402((int) var3.field2814);
                    Statics.field2523.method1395(var4.field2028, 0, 4);
                    field2515.method3303(var3, var3.field2814);
                    field2511--;
                    field2516++;
                }
                while (field2521 < 20 && field2519 > 0) {
                    class155 var5 = (class155) field2520.method3262();
                    class127 var6 = new class127(4);
                    var6.method2498(0);
                    var6.method2402((int) var5.field2814);
                    Statics.field2523.method1395(var6.field2028, 0, 4);
                    var5.method3289();
                    field2517.method3303(var5, var5.field2814);
                    field2519--;
                    field2521++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2523.method1388();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2512 = 0;
                    byte var9 = 0;
                    if (Statics.field371 == null) {
                        var9 = 8;
                    } else if (field2526 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2522.field2023;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2523.method1389(field2522.field2028, field2522.field2023, var10);
                        if (field2527 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2522.field2028[field2522.field2023 + var11] ^= field2527;
                            }
                        }
                        field2522.field2023 += var10;
                        if (field2522.field2023 < var9) {
                            break;
                        }
                        if (Statics.field371 == null) {
                            field2522.field2023 = 0;
                            int var12 = field2522.method2414();
                            int var13 = field2522.method2416();
                            int var14 = field2522.method2414();
                            int var15 = field2522.method2430();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2515.method3293(var16);
                            Statics.field2816 = true;
                            if (var18 == null) {
                                var18 = (class155) field2517.method3293(var16);
                                Statics.field2816 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field371 = var18;
                            Statics.field1808 = new class127(var15 + var19 + Statics.field371.field2549);
                            Statics.field1808.method2498(var14);
                            Statics.field1808.method2448(var15);
                            field2526 = 8;
                            field2522.field2023 = 0;
                        } else if (field2526 == 0) {
                            if (field2522.field2028[0] == -1) {
                                field2526 = 1;
                                field2522.field2023 = 0;
                            } else {
                                Statics.field371 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1808.field2028.length - Statics.field371.field2549;
                        int var21 = 512 - field2526;
                        if (var21 > var20 - Statics.field1808.field2023) {
                            var21 = var20 - Statics.field1808.field2023;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2523.method1389(Statics.field1808.field2028, Statics.field1808.field2023, var21);
                        if (field2527 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1808.field2028[Statics.field1808.field2023 + var22] ^= field2527;
                            }
                        }
                        Statics.field1808.field2023 += var21;
                        field2526 += var21;
                        if (Statics.field1808.field2023 == var20) {
                            if (Statics.field371.field2814 == 16711935L) {
                                Statics.field2525 = Statics.field1808;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2531[var23];
                                    if (var24 != null) {
                                        Statics.field2525.field2023 = var23 * 8 + 5;
                                        int var25 = Statics.field2525.method2430();
                                        int var26 = Statics.field2525.method2430();
                                        var24.method3057(var25, var26);
                                    }
                                }
                            } else {
                                field2524.reset();
                                field2524.update(Statics.field1808.field2028, 0, var20);
                                int var27 = (int) field2524.getValue();
                                if (Statics.field371.field2547 != var27) {
                                    try {
                                        Statics.field2523.method1410();
                                    } catch (Exception var32) {
                                    }
                                    field2528++;
                                    Statics.field2523 = null;
                                    field2527 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2528 = 0;
                                field2514 = 0;
                                Statics.field371.field2548.method3058((int) (Statics.field371.field2814 & 0xFFFFL), Statics.field1808.field2028, (Statics.field371.field2814 & 0xFF0000L) == 16711680L, Statics.field2816);
                            }
                            Statics.field371.method3346();
                            if (Statics.field2816) {
                                field2516--;
                            } else {
                                field2521--;
                            }
                            field2526 = 0;
                            Statics.field371 = null;
                            Statics.field1808 = null;
                        } else {
                            if (field2526 != 512) {
                                break;
                            }
                            field2526 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2523.method1410();
                } catch (Exception var31) {
                }
                field2514++;
                Statics.field2523 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bf.m(Lek;IIIBZB)V")
    public static void method1377(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2513.method3293(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2515.method3293(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2518.method3293(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2517.method3293(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2548 = arg0;
            var12.field2547 = arg3;
            var12.field2549 = arg4;
            if (arg5) {
                field2513.method3303(var12, var6);
                field2511++;
            } else {
                field2520.method3256(var12);
                field2518.method3303(var12, var6);
                field2519++;
            }
        } else if (arg5) {
            var10.method3289();
            field2513.method3303(var10, var6);
            field2519--;
            field2511++;
        }
    }

    @ObfuscatedName("bl.v(III)V")
    public static void method1425(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class155 var4 = (class155) field2518.method3293(var2);
        if (var4 != null) {
            field2520.method3257(var4);
        }
    }

    @ObfuscatedName("dy.r(III)I")
    public static int method2167(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field371 != null && Statics.field371.field2814 == var2 ? Statics.field1808.field2023 * 99 / (Statics.field1808.field2028.length - Statics.field371.field2549) + 1 : 0;
    }
}
