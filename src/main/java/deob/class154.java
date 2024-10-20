package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class154 {

    @ObfuscatedName("eo.l")
    public static int field2544 = 0;

    @ObfuscatedName("eo.x")
    public static class175 field2546 = new class175(4096);

    @ObfuscatedName("eo.o")
    public static int field2547 = 0;

    @ObfuscatedName("eo.a")
    public static class175 field2548 = new class175(32);

    @ObfuscatedName("eo.w")
    public static int field2549 = 0;

    @ObfuscatedName("eo.i")
    public static class172 field2562 = new class172();

    @ObfuscatedName("eo.y")
    public static class175 field2551 = new class175(4096);

    @ObfuscatedName("eo.m")
    public static int field2552 = 0;

    @ObfuscatedName("eo.u")
    public static class175 field2553 = new class175(4096);

    @ObfuscatedName("eo.s")
    public static int field2554 = 0;

    @ObfuscatedName("eo.n")
    public static class127 field2555 = new class127(8);

    @ObfuscatedName("eo.c")
    public static int field2556 = 0;

    @ObfuscatedName("eo.b")
    public static CRC32 field2558 = new CRC32();

    @ObfuscatedName("eo.t")
    public static class155[] field2543 = new class155[256];

    @ObfuscatedName("eo.f")
    public static byte field2559 = 0;

    @ObfuscatedName("eo.h")
    public static int field2560 = 0;

    @ObfuscatedName("eo.j")
    public static int field2561 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.p(I)Z")
    public static boolean method242() {
        long var0 = class121.method548();
        int var2 = (int) (var0 - Statics.field2550);
        Statics.field2550 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2544 += var2;
        if (field2554 == 0 && field2549 == 0 && field2552 == 0 && field2547 == 0) {
            return true;
        } else if (Statics.field2557 == null) {
            return false;
        } else {
            try {
                if (field2544 > 30000) {
                    throw new IOException();
                }
                while (field2549 < 20 && field2547 > 0) {
                    class156 var3 = (class156) field2546.method3408();
                    class127 var4 = new class127(4);
                    var4.method2484(1);
                    var4.method2486((int) var3.field2821);
                    Statics.field2557.method1448(var4.field2036, 0, 4);
                    field2548.method3406(var3, var3.field2821);
                    field2547--;
                    field2549++;
                }
                while (field2554 < 20 && field2552 > 0) {
                    class156 var5 = (class156) field2562.method3383();
                    class127 var6 = new class127(4);
                    var6.method2484(0);
                    var6.method2486((int) var5.field2821);
                    Statics.field2557.method1448(var6.field2036, 0, 4);
                    var5.method3401();
                    field2553.method3406(var5, var5.field2821);
                    field2552--;
                    field2554++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2557.method1429();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2544 = 0;
                    byte var9 = 0;
                    if (Statics.field1518 == null) {
                        var9 = 8;
                    } else if (field2556 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2555.field2030;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2557.method1433(field2555.field2036, field2555.field2030, var10);
                        if (field2559 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2555.field2036[field2555.field2030 + var11] ^= field2559;
                            }
                        }
                        field2555.field2030 += var10;
                        if (field2555.field2030 < var9) {
                            break;
                        }
                        if (Statics.field1518 == null) {
                            field2555.field2030 = 0;
                            int var12 = field2555.method2498();
                            int var13 = field2555.method2581();
                            int var14 = field2555.method2498();
                            int var15 = field2555.method2489();
                            long var16 = (long) ((var12 << 16) + var13);
                            class156 var18 = (class156) field2548.method3405(var16);
                            Statics.field1364 = true;
                            if (var18 == null) {
                                var18 = (class156) field2553.method3405(var16);
                                Statics.field1364 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1518 = var18;
                            Statics.field949 = new class127(var15 + var19 + Statics.field1518.field2576);
                            Statics.field949.method2484(var14);
                            Statics.field949.method2487(var15);
                            field2556 = 8;
                            field2555.field2030 = 0;
                        } else if (field2556 == 0) {
                            if (field2555.field2036[0] == -1) {
                                field2556 = 1;
                                field2555.field2030 = 0;
                            } else {
                                Statics.field1518 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field949.field2036.length - Statics.field1518.field2576;
                        int var21 = 512 - field2556;
                        if (var21 > var20 - Statics.field949.field2030) {
                            var21 = var20 - Statics.field949.field2030;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2557.method1433(Statics.field949.field2036, Statics.field949.field2030, var21);
                        if (field2559 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field949.field2036[Statics.field949.field2030 + var22] ^= field2559;
                            }
                        }
                        Statics.field949.field2030 += var21;
                        field2556 += var21;
                        if (Statics.field949.field2030 == var20) {
                            if (Statics.field1518.field2821 == 16711935L) {
                                Statics.field206 = Statics.field949;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class155 var24 = field2543[var23];
                                    if (var24 != null) {
                                        Statics.field206.field2030 = var23 * 8 + 5;
                                        int var25 = Statics.field206.method2489();
                                        int var26 = Statics.field206.method2489();
                                        var24.method3203(var25, var26);
                                    }
                                }
                            } else {
                                field2558.reset();
                                field2558.update(Statics.field949.field2036, 0, var20);
                                int var27 = (int) field2558.getValue();
                                if (Statics.field1518.field2573 != var27) {
                                    try {
                                        Statics.field2557.method1430();
                                    } catch (Exception var32) {
                                    }
                                    field2560++;
                                    Statics.field2557 = null;
                                    field2559 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2560 = 0;
                                field2561 = 0;
                                Statics.field1518.field2574.method3183((int) (Statics.field1518.field2821 & 0xFFFFL), Statics.field949.field2036, (Statics.field1518.field2821 & 0xFF0000L) == 16711680L, Statics.field1364);
                            }
                            Statics.field1518.method3455();
                            if (Statics.field1364) {
                                field2549--;
                            } else {
                                field2554--;
                            }
                            field2556 = 0;
                            Statics.field1518 = null;
                            Statics.field949 = null;
                        } else {
                            if (field2556 != 512) {
                                break;
                            }
                            field2556 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2557.method1430();
                } catch (Exception var31) {
                }
                field2561++;
                Statics.field2557 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("v.l(ZB)V")
    public static void method147(boolean arg0) {
        if (Statics.field2557 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2484(arg0 ? 2 : 3);
            var1.method2486(0);
            Statics.field2557.method1448(var1.field2036, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2557.method1430();
            } catch (Exception var4) {
            }
            field2561++;
            Statics.field2557 = null;
        }
    }

    @ObfuscatedName("f.d(Lbk;ZI)V")
    public static void method197(class70 arg0, boolean arg1) {
        if (Statics.field2557 != null) {
            try {
                Statics.field2557.method1430();
            } catch (Exception var10) {
            }
            Statics.field2557 = null;
        }
        Statics.field2557 = arg0;
        method147(arg1);
        field2555.field2030 = 0;
        Statics.field1518 = null;
        Statics.field949 = null;
        field2556 = 0;
        while (true) {
            class156 var3 = (class156) field2548.method3408();
            if (var3 == null) {
                while (true) {
                    class156 var4 = (class156) field2553.method3408();
                    if (var4 == null) {
                        if (field2559 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2484(4);
                                var5.method2484(field2559);
                                var5.method2485(0);
                                Statics.field2557.method1448(var5.field2036, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2557.method1430();
                                } catch (Exception var8) {
                                }
                                field2561++;
                                Statics.field2557 = null;
                            }
                        }
                        field2544 = 0;
                        Statics.field2550 = class121.method548();
                        return;
                    }
                    field2562.method3372(var4);
                    field2551.method3406(var4, var4.field2821);
                    field2552++;
                    field2554--;
                }
            }
            field2546.method3406(var3, var3.field2821);
            field2547++;
            field2549--;
        }
    }

    @ObfuscatedName("ai.x(Leu;IIIBZB)V")
    public static void method744(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2546.method3405(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2548.method3405(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2551.method3405(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2553.method3405(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2574 = arg0;
            var12.field2573 = arg3;
            var12.field2576 = arg4;
            if (arg5) {
                field2546.method3406(var12, var6);
                field2547++;
            } else {
                field2562.method3373(var12);
                field2551.method3406(var12, var6);
                field2552++;
            }
        } else if (arg5) {
            var10.method3401();
            field2546.method3406(var10, var6);
            field2552--;
            field2547++;
        }
    }

    @ObfuscatedName("ek.o(III)I")
    public static int method2937(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1518 != null && Statics.field1518.field2821 == var2 ? Statics.field949.field2030 * 99 / (Statics.field949.field2036.length - Statics.field1518.field2576) + 1 : 0;
    }

    @ObfuscatedName("de.a(I)V")
    public static void method2339() {
        if (Statics.field2557 != null) {
            Statics.field2557.method1430();
        }
    }
}
