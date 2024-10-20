package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ep")
public class class153 {

    @ObfuscatedName("ep.x")
    public static int field2523 = 0;

    @ObfuscatedName("ep.r")
    public static class175 field2518 = new class175(4096);

    @ObfuscatedName("ep.p")
    public static int field2519 = 0;

    @ObfuscatedName("ep.n")
    public static class175 field2516 = new class175(32);

    @ObfuscatedName("ep.o")
    public static int field2532 = 0;

    @ObfuscatedName("ep.l")
    public static class172 field2522 = new class172();

    @ObfuscatedName("ep.t")
    public static class175 field2524 = new class175(4096);

    @ObfuscatedName("ep.q")
    public static int field2529 = 0;

    @ObfuscatedName("ep.c")
    public static class175 field2515 = new class175(4096);

    @ObfuscatedName("ep.z")
    public static int field2526 = 0;

    @ObfuscatedName("ep.f")
    public static class127 field2528 = new class127(8);

    @ObfuscatedName("ep.d")
    public static int field2534 = 0;

    @ObfuscatedName("ep.g")
    public static CRC32 field2530 = new CRC32();

    @ObfuscatedName("ep.b")
    public static class154[] field2531 = new class154[256];

    @ObfuscatedName("ep.j")
    public static byte field2520 = 0;

    @ObfuscatedName("ep.m")
    public static int field2533 = 0;

    @ObfuscatedName("ep.k")
    public static int field2525 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.a(I)Z")
    public static boolean method2895() {
        long var0 = class121.method245();
        int var2 = (int) (var0 - Statics.field2517);
        Statics.field2517 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2523 += var2;
        if (field2526 == 0 && field2532 == 0 && field2529 == 0 && field2519 == 0) {
            return true;
        } else if (Statics.field2521 == null) {
            return false;
        } else {
            try {
                if (field2523 > 30000) {
                    throw new IOException();
                }
                while (field2532 < 20 && field2519 > 0) {
                    class155 var3 = (class155) field2518.method3232();
                    class127 var4 = new class127(4);
                    var4.method2455(1);
                    var4.method2399((int) var3.field2816);
                    Statics.field2521.method1362(var4.field2036, 0, 4);
                    field2516.method3234(var3, var3.field2816);
                    field2519--;
                    field2532++;
                }
                while (field2526 < 20 && field2529 > 0) {
                    class155 var5 = (class155) field2522.method3203();
                    class127 var6 = new class127(4);
                    var6.method2455(0);
                    var6.method2399((int) var5.field2816);
                    Statics.field2521.method1362(var6.field2036, 0, 4);
                    var5.method3227();
                    field2515.method3234(var5, var5.field2816);
                    field2529--;
                    field2526++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2521.method1360();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2523 = 0;
                    byte var9 = 0;
                    if (Statics.field2527 == null) {
                        var9 = 8;
                    } else if (field2534 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2528.field2035;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2521.method1361(field2528.field2036, field2528.field2035, var10);
                        if (field2520 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2528.field2036[field2528.field2035 + var11] ^= field2520;
                            }
                        }
                        field2528.field2035 += var10;
                        if (field2528.field2035 < var9) {
                            break;
                        }
                        if (Statics.field2527 == null) {
                            field2528.field2035 = 0;
                            int var12 = field2528.method2411();
                            int var13 = field2528.method2413();
                            int var14 = field2528.method2411();
                            int var15 = field2528.method2416();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2516.method3242(var16);
                            Statics.field2456 = true;
                            if (var18 == null) {
                                var18 = (class155) field2515.method3242(var16);
                                Statics.field2456 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2527 = var18;
                            Statics.field199 = new class127(var15 + var19 + Statics.field2527.field2554);
                            Statics.field199.method2455(var14);
                            Statics.field199.method2400(var15);
                            field2534 = 8;
                            field2528.field2035 = 0;
                        } else if (field2534 == 0) {
                            if (field2528.field2036[0] == -1) {
                                field2534 = 1;
                                field2528.field2035 = 0;
                            } else {
                                Statics.field2527 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field199.field2036.length - Statics.field2527.field2554;
                        int var21 = 512 - field2534;
                        if (var21 > var20 - Statics.field199.field2035) {
                            var21 = var20 - Statics.field199.field2035;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2521.method1361(Statics.field199.field2036, Statics.field199.field2035, var21);
                        if (field2520 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field199.field2036[Statics.field199.field2035 + var22] ^= field2520;
                            }
                        }
                        Statics.field199.field2035 += var21;
                        field2534 += var21;
                        if (Statics.field199.field2035 == var20) {
                            if (Statics.field2527.field2816 == 16711935L) {
                                Statics.field756 = Statics.field199;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2531[var23];
                                    if (var24 != null) {
                                        Statics.field756.field2035 = var23 * 8 + 5;
                                        int var25 = Statics.field756.method2416();
                                        int var26 = Statics.field756.method2416();
                                        var24.method3029(var25, var26);
                                    }
                                }
                            } else {
                                field2530.reset();
                                field2530.update(Statics.field199.field2036, 0, var20);
                                int var27 = (int) field2530.getValue();
                                if (Statics.field2527.field2549 != var27) {
                                    try {
                                        Statics.field2521.method1357();
                                    } catch (Exception var32) {
                                    }
                                    field2533++;
                                    Statics.field2521 = null;
                                    field2520 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2533 = 0;
                                field2525 = 0;
                                Statics.field2527.field2555.method3032((int) (Statics.field2527.field2816 & 0xFFFFL), Statics.field199.field2036, (Statics.field2527.field2816 & 0xFF0000L) == 16711680L, Statics.field2456);
                            }
                            Statics.field2527.method3288();
                            if (Statics.field2456) {
                                field2532--;
                            } else {
                                field2526--;
                            }
                            field2534 = 0;
                            Statics.field2527 = null;
                            Statics.field199 = null;
                        } else {
                            if (field2534 != 512) {
                                break;
                            }
                            field2534 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2521.method1357();
                } catch (Exception var31) {
                }
                field2525++;
                Statics.field2521 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ds.x(ZI)V")
    public static void method2267(boolean arg0) {
        if (Statics.field2521 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2455(arg0 ? 2 : 3);
            var1.method2399(0);
            Statics.field2521.method1362(var1.field2036, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2521.method1357();
            } catch (Exception var4) {
            }
            field2525++;
            Statics.field2521 = null;
        }
    }

    @ObfuscatedName("cv.e(Ler;IB)V")
    public static void method1594(class154 arg0, int arg1) {
        if (Statics.field756 == null) {
            method862((class154) null, 255, 255, 0, (byte) 0, true);
            field2531[arg1] = arg0;
        } else {
            Statics.field756.field2035 = arg1 * 8 + 5;
            int var2 = Statics.field756.method2416();
            int var3 = Statics.field756.method2416();
            arg0.method3029(var2, var3);
        }
    }

    @ObfuscatedName("aj.r(Ler;IIIBZI)V")
    public static void method862(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2518.method3242(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2516.method3242(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2524.method3242(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2515.method3242(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2555 = arg0;
            var12.field2549 = arg3;
            var12.field2554 = arg4;
            if (arg5) {
                field2518.method3234(var12, var6);
                field2519++;
            } else {
                field2522.method3211(var12);
                field2524.method3234(var12, var6);
                field2529++;
            }
        } else if (arg5) {
            var10.method3227();
            field2518.method3234(var10, var6);
            field2529--;
            field2519++;
        }
    }

    @ObfuscatedName("bm.p(ZZI)I")
    public static int method1511(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2532 + field2519;
        }
        if (arg1) {
            var2 += field2529 + field2526;
        }
        return var2;
    }
}
