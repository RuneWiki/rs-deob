package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ec")
public class class153 {

    @ObfuscatedName("ec.r")
    public static int field2511 = 0;

    @ObfuscatedName("ec.p")
    public static class175 field2513 = new class175(4096);

    @ObfuscatedName("ec.e")
    public static int field2531 = 0;

    @ObfuscatedName("ec.d")
    public static class175 field2526 = new class175(32);

    @ObfuscatedName("ec.y")
    public static int field2516 = 0;

    @ObfuscatedName("ec.x")
    public static class172 field2524 = new class172();

    @ObfuscatedName("ec.t")
    public static class175 field2518 = new class175(4096);

    @ObfuscatedName("ec.i")
    public static int field2510 = 0;

    @ObfuscatedName("ec.z")
    public static class175 field2525 = new class175(4096);

    @ObfuscatedName("ec.o")
    public static int field2521 = 0;

    @ObfuscatedName("ec.k")
    public static class127 field2523 = new class127(8);

    @ObfuscatedName("ec.a")
    public static int field2514 = 0;

    @ObfuscatedName("ec.g")
    public static CRC32 field2515 = new CRC32();

    @ObfuscatedName("ec.m")
    public static class154[] field2527 = new class154[256];

    @ObfuscatedName("ec.b")
    public static byte field2528 = 0;

    @ObfuscatedName("ec.h")
    public static int field2529 = 0;

    @ObfuscatedName("ec.n")
    public static int field2530 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.j(B)Z")
    public static boolean method2047() {
        long var0 = Statics.method2045();
        int var2 = (int) (var0 - Statics.field2512);
        Statics.field2512 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2511 += var2;
        if (field2521 == 0 && field2516 == 0 && field2510 == 0 && field2531 == 0) {
            return true;
        } else if (Statics.field2517 == null) {
            return false;
        } else {
            try {
                if (field2511 > 30000) {
                    throw new IOException();
                }
                while (field2516 < 20 && field2531 > 0) {
                    class155 var3 = (class155) field2513.method3316();
                    class127 var4 = new class127(4);
                    var4.method2482(1);
                    var4.method2625((int) var3.field2809);
                    Statics.field2517.method1380(var4.field2025, 0, 4);
                    field2526.method3318(var3, var3.field2809);
                    field2531--;
                    field2516++;
                }
                while (field2521 < 20 && field2510 > 0) {
                    class155 var5 = (class155) field2524.method3273();
                    class127 var6 = new class127(4);
                    var6.method2482(0);
                    var6.method2625((int) var5.field2809);
                    Statics.field2517.method1380(var6.field2025, 0, 4);
                    var5.method3299();
                    field2525.method3318(var5, var5.field2809);
                    field2510--;
                    field2521++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2517.method1379();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2511 = 0;
                    byte var9 = 0;
                    if (Statics.field2027 == null) {
                        var9 = 8;
                    } else if (field2514 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2523.field2022;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2517.method1390(field2523.field2025, field2523.field2022, var10);
                        if (field2528 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2523.field2025[field2523.field2022 + var11] ^= field2528;
                            }
                        }
                        field2523.field2022 += var10;
                        if (field2523.field2022 < var9) {
                            break;
                        }
                        if (Statics.field2027 == null) {
                            field2523.field2022 = 0;
                            int var12 = field2523.method2441();
                            int var13 = field2523.method2609();
                            int var14 = field2523.method2441();
                            int var15 = field2523.method2446();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2526.method3302(var16);
                            Statics.field2522 = true;
                            if (var18 == null) {
                                var18 = (class155) field2525.method3302(var16);
                                Statics.field2522 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2027 = var18;
                            Statics.field1801 = new class127(var15 + var19 + Statics.field2027.field2546);
                            Statics.field1801.method2482(var14);
                            Statics.field1801.method2430(var15);
                            field2514 = 8;
                            field2523.field2022 = 0;
                        } else if (field2514 == 0) {
                            if (field2523.field2025[0] == -1) {
                                field2514 = 1;
                                field2523.field2022 = 0;
                            } else {
                                Statics.field2027 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1801.field2025.length - Statics.field2027.field2546;
                        int var21 = 512 - field2514;
                        if (var21 > var20 - Statics.field1801.field2022) {
                            var21 = var20 - Statics.field1801.field2022;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2517.method1390(Statics.field1801.field2025, Statics.field1801.field2022, var21);
                        if (field2528 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1801.field2025[Statics.field1801.field2022 + var22] ^= field2528;
                            }
                        }
                        Statics.field1801.field2022 += var21;
                        field2514 += var21;
                        if (Statics.field1801.field2022 == var20) {
                            if (Statics.field2027.field2809 == 16711935L) {
                                Statics.field2519 = Statics.field1801;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2527[var23];
                                    if (var24 != null) {
                                        Statics.field2519.field2022 = var23 * 8 + 5;
                                        int var25 = Statics.field2519.method2446();
                                        int var26 = Statics.field2519.method2446();
                                        var24.method3053(var25, var26);
                                    }
                                }
                            } else {
                                field2515.reset();
                                field2515.update(Statics.field1801.field2025, 0, var20);
                                int var27 = (int) field2515.getValue();
                                if (Statics.field2027.field2545 != var27) {
                                    try {
                                        Statics.field2517.method1375();
                                    } catch (Exception var32) {
                                    }
                                    field2529++;
                                    Statics.field2517 = null;
                                    field2528 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2529 = 0;
                                field2530 = 0;
                                Statics.field2027.field2547.method3049((int) (Statics.field2027.field2809 & 0xFFFFL), Statics.field1801.field2025, (Statics.field2027.field2809 & 0xFF0000L) == 16711680L, Statics.field2522);
                            }
                            Statics.field2027.method3359();
                            if (Statics.field2522) {
                                field2516--;
                            } else {
                                field2521--;
                            }
                            field2514 = 0;
                            Statics.field2027 = null;
                            Statics.field1801 = null;
                        } else {
                            if (field2514 != 512) {
                                break;
                            }
                            field2514 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2517.method1375();
                } catch (Exception var31) {
                }
                field2530++;
                Statics.field2517 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cn.r(ZI)V")
    public static void method1589(boolean arg0) {
        if (Statics.field2517 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2482(arg0 ? 2 : 3);
            var1.method2625(0);
            Statics.field2517.method1380(var1.field2025, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2517.method1375();
            } catch (Exception var4) {
            }
            field2530++;
            Statics.field2517 = null;
        }
    }

    @ObfuscatedName("bw.v(Lba;ZB)V")
    public static void method1499(class70 arg0, boolean arg1) {
        if (Statics.field2517 != null) {
            try {
                Statics.field2517.method1375();
            } catch (Exception var10) {
            }
            Statics.field2517 = null;
        }
        Statics.field2517 = arg0;
        method1589(arg1);
        field2523.field2022 = 0;
        Statics.field2027 = null;
        Statics.field1801 = null;
        field2514 = 0;
        while (true) {
            class155 var3 = (class155) field2526.method3316();
            if (var3 == null) {
                while (true) {
                    class155 var4 = (class155) field2525.method3316();
                    if (var4 == null) {
                        if (field2528 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2482(4);
                                var5.method2482(field2528);
                                var5.method2428(0);
                                Statics.field2517.method1380(var5.field2025, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2517.method1375();
                                } catch (Exception var8) {
                                }
                                field2530++;
                                Statics.field2517 = null;
                            }
                        }
                        field2511 = 0;
                        Statics.field2512 = Statics.method2045();
                        return;
                    }
                    field2524.method3271(var4);
                    field2518.method3318(var4, var4.field2809);
                    field2510++;
                    field2521--;
                }
            }
            field2513.method3318(var3, var3.field2809);
            field2531++;
            field2516--;
        }
    }

    @ObfuscatedName("dr.p(Lei;IIIBZI)V")
    public static void method2308(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2513.method3302(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2526.method3302(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2518.method3302(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2525.method3302(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2547 = arg0;
            var12.field2545 = arg3;
            var12.field2546 = arg4;
            if (arg5) {
                field2513.method3318(var12, var6);
                field2531++;
            } else {
                field2524.method3274(var12);
                field2518.method3318(var12, var6);
                field2510++;
            }
        } else if (arg5) {
            var10.method3299();
            field2513.method3318(var10, var6);
            field2510--;
            field2531++;
        }
    }

    @ObfuscatedName("bj.e(III)I")
    public static int method1533(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2027 != null && Statics.field2027.field2809 == var2 ? Statics.field1801.field2022 * 99 / (Statics.field1801.field2025.length - Statics.field2027.field2546) + 1 : 0;
    }

    @ObfuscatedName("cn.d(ZZI)I")
    public static int method1572(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2531 + field2516;
        }
        if (arg1) {
            var2 += field2521 + field2510;
        }
        return var2;
    }
}
