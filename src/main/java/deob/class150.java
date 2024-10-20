package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class150 {

    @ObfuscatedName("et.z")
    public static int field2502 = 0;

    @ObfuscatedName("et.h")
    public static class174 field2504 = new class174(4096);

    @ObfuscatedName("et.r")
    public static int field2508 = 0;

    @ObfuscatedName("et.e")
    public static class174 field2506 = new class174(32);

    @ObfuscatedName("et.k")
    public static int field2501 = 0;

    @ObfuscatedName("et.b")
    public static class180 field2518 = new class180();

    @ObfuscatedName("et.n")
    public static class174 field2509 = new class174(4096);

    @ObfuscatedName("et.a")
    public static int field2510 = 0;

    @ObfuscatedName("et.q")
    public static class174 field2511 = new class174(4096);

    @ObfuscatedName("et.i")
    public static int field2503 = 0;

    @ObfuscatedName("et.t")
    public static class107 field2514 = new class107(8);

    @ObfuscatedName("et.d")
    public static int field2512 = 0;

    @ObfuscatedName("et.s")
    public static CRC32 field2516 = new CRC32();

    @ObfuscatedName("et.v")
    public static class147[] field2517 = new class147[256];

    @ObfuscatedName("et.u")
    public static byte field2520 = 0;

    @ObfuscatedName("et.p")
    public static int field2519 = 0;

    @ObfuscatedName("et.l")
    public static int field2507 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.j(I)Z")
    public static boolean method1892() {
        long var0 = class103.method553();
        int var2 = (int) (var0 - Statics.field2505);
        Statics.field2505 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2502 += var2;
        if (field2503 == 0 && field2501 == 0 && field2510 == 0 && field2508 == 0) {
            return true;
        } else if (Statics.field2515 == null) {
            return false;
        } else {
            try {
                if (field2502 > 30000) {
                    throw new IOException();
                }
                while (field2501 < 20 && field2508 > 0) {
                    class151 var3 = (class151) field2504.method3210();
                    class107 var4 = new class107(4);
                    var4.method2116(1);
                    var4.method2118((int) var3.field2861);
                    Statics.field2515.method2613(var4.field1849, 0, 4);
                    field2506.method3208(var3, var3.field2861);
                    field2508--;
                    field2501++;
                }
                while (field2503 < 20 && field2510 > 0) {
                    class151 var5 = (class151) field2518.method3291();
                    class107 var6 = new class107(4);
                    var6.method2116(0);
                    var6.method2118((int) var5.field2861);
                    Statics.field2515.method2613(var6.field1849, 0, 4);
                    var5.method3294();
                    field2511.method3208(var5, var5.field2861);
                    field2510--;
                    field2503++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2515.method2607();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2502 = 0;
                    byte var9 = 0;
                    if (Statics.field2103 == null) {
                        var9 = 8;
                    } else if (field2512 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2514.field1847;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2515.method2608(field2514.field1849, field2514.field1847, var10);
                        if (field2520 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2514.field1849[field2514.field1847 + var11] ^= field2520;
                            }
                        }
                        field2514.field1847 += var10;
                        if (field2514.field1847 < var9) {
                            break;
                        }
                        if (Statics.field2103 == null) {
                            field2514.field1847 = 0;
                            int var12 = field2514.method2130();
                            int var13 = field2514.method2132();
                            int var14 = field2514.method2130();
                            int var15 = field2514.method2135();
                            long var16 = (long) ((var12 << 16) + var13);
                            class151 var18 = (class151) field2506.method3214(var16);
                            Statics.field2513 = true;
                            if (var18 == null) {
                                var18 = (class151) field2511.method3214(var16);
                                Statics.field2513 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2103 = var18;
                            Statics.field1914 = new class107(var15 + var19 + Statics.field2103.field2524);
                            Statics.field1914.method2116(var14);
                            Statics.field1914.method2119(var15);
                            field2512 = 8;
                            field2514.field1847 = 0;
                        } else if (field2512 == 0) {
                            if (field2514.field1849[0] == -1) {
                                field2512 = 1;
                                field2514.field1847 = 0;
                            } else {
                                Statics.field2103 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1914.field1849.length - Statics.field2103.field2524;
                        int var21 = 512 - field2512;
                        if (var21 > var20 - Statics.field1914.field1847) {
                            var21 = var20 - Statics.field1914.field1847;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2515.method2608(Statics.field1914.field1849, Statics.field1914.field1847, var21);
                        if (field2520 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1914.field1849[Statics.field1914.field1847 + var22] ^= field2520;
                            }
                        }
                        Statics.field1914.field1847 += var21;
                        field2512 += var21;
                        if (Statics.field1914.field1847 == var20) {
                            if (Statics.field2103.field2861 == 16711935L) {
                                Statics.field566 = Statics.field1914;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class147 var24 = field2517[var23];
                                    if (var24 != null) {
                                        Statics.field566.field1847 = var23 * 8 + 5;
                                        int var25 = Statics.field566.method2135();
                                        int var26 = Statics.field566.method2135();
                                        var24.method2831(var25, var26);
                                    }
                                }
                            } else {
                                field2516.reset();
                                field2516.update(Statics.field1914.field1849, 0, var20);
                                int var27 = (int) field2516.getValue();
                                if (Statics.field2103.field2526 != var27) {
                                    try {
                                        Statics.field2515.method2627();
                                    } catch (Exception var32) {
                                    }
                                    field2519++;
                                    Statics.field2515 = null;
                                    field2520 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2519 = 0;
                                field2507 = 0;
                                Statics.field2103.field2525.method2838((int) (Statics.field2103.field2861 & 0xFFFFL), Statics.field1914.field1849, (Statics.field2103.field2861 & 0xFF0000L) == 16711680L, Statics.field2513);
                            }
                            Statics.field2103.method3309();
                            if (Statics.field2513) {
                                field2501--;
                            } else {
                                field2503--;
                            }
                            field2512 = 0;
                            Statics.field2103 = null;
                            Statics.field1914 = null;
                        } else {
                            if (field2512 != 512) {
                                break;
                            }
                            field2512 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2515.method2627();
                } catch (Exception var31) {
                }
                field2507++;
                Statics.field2515 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("e.z(ZI)V")
    public static void method80(boolean arg0) {
        if (Statics.field2515 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2116(arg0 ? 2 : 3);
            var1.method2118(0);
            Statics.field2515.method2613(var1.field1849, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2515.method2627();
            } catch (Exception var4) {
            }
            field2507++;
            Statics.field2515 = null;
        }
    }

    @ObfuscatedName("av.y(Ldf;ZB)V")
    public static void method665(class130 arg0, boolean arg1) {
        if (Statics.field2515 != null) {
            try {
                Statics.field2515.method2627();
            } catch (Exception var10) {
            }
            Statics.field2515 = null;
        }
        Statics.field2515 = arg0;
        method80(arg1);
        field2514.field1847 = 0;
        Statics.field2103 = null;
        Statics.field1914 = null;
        field2512 = 0;
        while (true) {
            class151 var3 = (class151) field2506.method3210();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2511.method3210();
                    if (var4 == null) {
                        if (field2520 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2116(4);
                                var5.method2116(field2520);
                                var5.method2270(0);
                                Statics.field2515.method2613(var5.field1849, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2515.method2627();
                                } catch (Exception var8) {
                                }
                                field2507++;
                                Statics.field2515 = null;
                            }
                        }
                        field2502 = 0;
                        Statics.field2505 = class103.method553();
                        return;
                    }
                    field2518.method3279(var4);
                    field2509.method3208(var4, var4.field2861);
                    field2510++;
                    field2503--;
                }
            }
            field2504.method3208(var3, var3.field2861);
            field2508++;
            field2501--;
        }
    }

    @ObfuscatedName("dz.h(Lei;IB)V")
    public static void method2435(class147 arg0, int arg1) {
        if (Statics.field566 == null) {
            method486((class147) null, 255, 255, 0, (byte) 0, true);
            field2517[arg1] = arg0;
        } else {
            Statics.field566.field1847 = arg1 * 8 + 5;
            int var2 = Statics.field566.method2135();
            int var3 = Statics.field566.method2135();
            arg0.method2831(var2, var3);
        }
    }

    @ObfuscatedName("l.r(Lei;IIIBZI)V")
    public static void method486(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2504.method3214(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2506.method3214(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2509.method3214(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2511.method3214(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2525 = arg0;
            var12.field2526 = arg3;
            var12.field2524 = arg4;
            if (arg5) {
                field2504.method3208(var12, var6);
                field2508++;
            } else {
                field2518.method3284(var12);
                field2509.method3208(var12, var6);
                field2510++;
            }
        } else if (arg5) {
            var10.method3294();
            field2504.method3208(var10, var6);
            field2510--;
            field2508++;
        }
    }

    @ObfuscatedName("dz.e(III)I")
    public static int method2432(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2103 != null && Statics.field2103.field2861 == var2 ? Statics.field1914.field1847 * 99 / (Statics.field1914.field1849.length - Statics.field2103.field2524) + 1 : 0;
    }
}
