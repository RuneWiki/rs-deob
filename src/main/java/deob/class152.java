package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("el")
public class class152 {

    @ObfuscatedName("el.f")
    public static int field2510 = 0;

    @ObfuscatedName("el.c")
    public static class174 field2512 = new class174(4096);

    @ObfuscatedName("el.r")
    public static int field2513 = 0;

    @ObfuscatedName("el.k")
    public static class174 field2514 = new class174(32);

    @ObfuscatedName("el.e")
    public static int field2527 = 0;

    @ObfuscatedName("el.q")
    public static class171 field2516 = new class171();

    @ObfuscatedName("el.u")
    public static class174 field2517 = new class174(4096);

    @ObfuscatedName("el.s")
    public static int field2518 = 0;

    @ObfuscatedName("el.l")
    public static class174 field2522 = new class174(4096);

    @ObfuscatedName("el.o")
    public static int field2520 = 0;

    @ObfuscatedName("el.d")
    public static class126 field2521 = new class126(8);

    @ObfuscatedName("el.z")
    public static int field2523 = 0;

    @ObfuscatedName("el.i")
    public static CRC32 field2511 = new CRC32();

    @ObfuscatedName("el.a")
    public static class153[] field2525 = new class153[256];

    @ObfuscatedName("el.g")
    public static byte field2526 = 0;

    @ObfuscatedName("el.x")
    public static int field2519 = 0;

    @ObfuscatedName("el.b")
    public static int field2528 = 0;

    public class152() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.v(I)Z")
    public static boolean method2244() {
        long var0 = class120.method1383();
        int var2 = (int) (var0 - Statics.field2515);
        Statics.field2515 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2510 += var2;
        if (field2520 == 0 && field2527 == 0 && field2518 == 0 && field2513 == 0) {
            return true;
        } else if (Statics.field2509 == null) {
            return false;
        } else {
            try {
                if (field2510 > 30000) {
                    throw new IOException();
                }
                while (field2527 < 20 && field2513 > 0) {
                    class154 var3 = (class154) field2512.method3275();
                    class126 var4 = new class126(4);
                    var4.method2452(1);
                    var4.method2568((int) var3.field2814);
                    Statics.field2509.method1416(var4.field2029, 0, 4);
                    field2514.method3284(var3, var3.field2814);
                    field2513--;
                    field2527++;
                }
                while (field2520 < 20 && field2518 > 0) {
                    class154 var5 = (class154) field2516.method3234();
                    class126 var6 = new class126(4);
                    var6.method2452(0);
                    var6.method2568((int) var5.field2814);
                    Statics.field2509.method1416(var6.field2029, 0, 4);
                    var5.method3265();
                    field2522.method3284(var5, var5.field2814);
                    field2518--;
                    field2520++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2509.method1414();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2510 = 0;
                    byte var9 = 0;
                    if (Statics.field376 == null) {
                        var9 = 8;
                    } else if (field2523 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2521.field2027;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2509.method1415(field2521.field2029, field2521.field2027, var10);
                        if (field2526 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2521.field2029[field2521.field2027 + var11] ^= field2526;
                            }
                        }
                        field2521.field2027 += var10;
                        if (field2521.field2027 < var9) {
                            break;
                        }
                        if (Statics.field376 == null) {
                            field2521.field2027 = 0;
                            int var12 = field2521.method2466();
                            int var13 = field2521.method2468();
                            int var14 = field2521.method2466();
                            int var15 = field2521.method2500();
                            long var16 = (long) ((var12 << 16) + var13);
                            class154 var18 = (class154) field2514.method3270(var16);
                            Statics.field27 = true;
                            if (var18 == null) {
                                var18 = (class154) field2522.method3270(var16);
                                Statics.field27 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field376 = var18;
                            Statics.field854 = new class126(var15 + var19 + Statics.field376.field2542);
                            Statics.field854.method2452(var14);
                            Statics.field854.method2455(var15);
                            field2523 = 8;
                            field2521.field2027 = 0;
                        } else if (field2523 == 0) {
                            if (field2521.field2029[0] == -1) {
                                field2523 = 1;
                                field2521.field2027 = 0;
                            } else {
                                Statics.field376 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field854.field2029.length - Statics.field376.field2542;
                        int var21 = 512 - field2523;
                        if (var21 > var20 - Statics.field854.field2027) {
                            var21 = var20 - Statics.field854.field2027;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2509.method1415(Statics.field854.field2029, Statics.field854.field2027, var21);
                        if (field2526 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field854.field2029[Statics.field854.field2027 + var22] ^= field2526;
                            }
                        }
                        Statics.field854.field2027 += var21;
                        field2523 += var21;
                        if (Statics.field854.field2027 == var20) {
                            if (Statics.field376.field2814 == 16711935L) {
                                Statics.field2524 = Statics.field854;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class153 var24 = field2525[var23];
                                    if (var24 != null) {
                                        Statics.field2524.field2027 = var23 * 8 + 5;
                                        int var25 = Statics.field2524.method2500();
                                        int var26 = Statics.field2524.method2500();
                                        var24.method3057(var25, var26);
                                    }
                                }
                            } else {
                                field2511.reset();
                                field2511.update(Statics.field854.field2029, 0, var20);
                                int var27 = (int) field2511.getValue();
                                if (Statics.field376.field2541 != var27) {
                                    try {
                                        Statics.field2509.method1413();
                                    } catch (Exception var32) {
                                    }
                                    field2519++;
                                    Statics.field2509 = null;
                                    field2526 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2519 = 0;
                                field2528 = 0;
                                Statics.field376.field2543.method3058((int) (Statics.field376.field2814 & 0xFFFFL), Statics.field854.field2029, (Statics.field376.field2814 & 0xFF0000L) == 16711680L, Statics.field27);
                            }
                            Statics.field376.method3320();
                            if (Statics.field27) {
                                field2527--;
                            } else {
                                field2520--;
                            }
                            field2523 = 0;
                            Statics.field376 = null;
                            Statics.field854 = null;
                        } else {
                            if (field2523 != 512) {
                                break;
                            }
                            field2523 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2509.method1413();
                } catch (Exception var31) {
                }
                field2528++;
                Statics.field2509 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bp.f(ZI)V")
    public static void method1310(boolean arg0) {
        if (Statics.field2509 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2452(arg0 ? 2 : 3);
            var1.method2568(0);
            Statics.field2509.method1416(var1.field2029, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2509.method1413();
            } catch (Exception var4) {
            }
            field2528++;
            Statics.field2509 = null;
        }
    }

    @ObfuscatedName("du.n(Leq;IB)V")
    public static void method2398(class153 arg0, int arg1) {
        if (Statics.field2524 == null) {
            method122((class153) null, 255, 255, 0, (byte) 0, true);
            field2525[arg1] = arg0;
        } else {
            Statics.field2524.field2027 = arg1 * 8 + 5;
            int var2 = Statics.field2524.method2500();
            int var3 = Statics.field2524.method2500();
            arg0.method3057(var2, var3);
        }
    }

    @ObfuscatedName("p.c(Leq;IIIBZB)V")
    public static void method122(class153 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2512.method3270(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2514.method3270(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2517.method3270(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2522.method3270(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2543 = arg0;
            var12.field2541 = arg3;
            var12.field2542 = arg4;
            if (arg5) {
                field2512.method3284(var12, var6);
                field2513++;
            } else {
                field2516.method3235(var12);
                field2517.method3284(var12, var6);
                field2518++;
            }
        } else if (arg5) {
            var10.method3265();
            field2512.method3284(var10, var6);
            field2518--;
            field2513++;
        }
    }

    @ObfuscatedName("cg.r(III)V")
    public static void method2205(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class154 var4 = (class154) field2517.method3270(var2);
        if (var4 != null) {
            field2516.method3236(var4);
        }
    }

    @ObfuscatedName("dl.k(IIB)I")
    public static int method2675(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field376 != null && Statics.field376.field2814 == var2 ? Statics.field854.field2027 * 99 / (Statics.field854.field2029.length - Statics.field376.field2542) + 1 : 0;
    }

    @ObfuscatedName("t.e(I)V")
    public static void method151() {
        if (Statics.field2509 != null) {
            Statics.field2509.method1413();
        }
    }
}
