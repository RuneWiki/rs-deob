package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eu")
public class class149 {

    @ObfuscatedName("eu.p")
    public static int field2480 = 0;

    @ObfuscatedName("eu.g")
    public static class173 field2481 = new class173(4096);

    @ObfuscatedName("eu.u")
    public static int field2496 = 0;

    @ObfuscatedName("eu.k")
    public static class173 field2483 = new class173(32);

    @ObfuscatedName("eu.m")
    public static int field2488 = 0;

    @ObfuscatedName("eu.t")
    public static class179 field2485 = new class179();

    @ObfuscatedName("eu.l")
    public static class173 field2501 = new class173(4096);

    @ObfuscatedName("eu.f")
    public static int field2495 = 0;

    @ObfuscatedName("eu.c")
    public static class173 field2497 = new class173(4096);

    @ObfuscatedName("eu.i")
    public static int field2489 = 0;

    @ObfuscatedName("eu.b")
    public static class107 field2491 = new class107(8);

    @ObfuscatedName("eu.n")
    public static int field2492 = 0;

    @ObfuscatedName("eu.z")
    public static CRC32 field2493 = new CRC32();

    @ObfuscatedName("eu.q")
    public static class146[] field2482 = new class146[256];

    @ObfuscatedName("eu.s")
    public static byte field2486 = 0;

    @ObfuscatedName("eu.j")
    public static int field2479 = 0;

    @ObfuscatedName("eu.y")
    public static int field2498 = 0;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.e(I)Z")
    public static boolean method2700() {
        long var0 = class103.method527();
        int var2 = (int) (var0 - Statics.field79);
        Statics.field79 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2480 += var2;
        if (field2489 == 0 && field2488 == 0 && field2495 == 0 && field2496 == 0) {
            return true;
        } else if (Statics.field2484 == null) {
            return false;
        } else {
            try {
                if (field2480 > 30000) {
                    throw new IOException();
                }
                while (field2488 < 20 && field2496 > 0) {
                    class150 var3 = (class150) field2481.method3196();
                    class107 var4 = new class107(4);
                    var4.method2249(1);
                    var4.method2129((int) var3.field2843);
                    Statics.field2484.method2576(var4.field1845, 0, 4);
                    field2483.method3191(var3, var3.field2843);
                    field2496--;
                    field2488++;
                }
                while (field2489 < 20 && field2495 > 0) {
                    class150 var5 = (class150) field2485.method3274();
                    class107 var6 = new class107(4);
                    var6.method2249(0);
                    var6.method2129((int) var5.field2843);
                    Statics.field2484.method2576(var6.field1845, 0, 4);
                    var5.method3287();
                    field2497.method3191(var5, var5.field2843);
                    field2495--;
                    field2489++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2484.method2578();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2480 = 0;
                    byte var9 = 0;
                    if (Statics.field1969 == null) {
                        var9 = 8;
                    } else if (field2492 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2491.field1841;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2484.method2579(field2491.field1845, field2491.field1841, var10);
                        if (field2486 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2491.field1845[field2491.field1841 + var11] ^= field2486;
                            }
                        }
                        field2491.field1841 += var10;
                        if (field2491.field1841 < var9) {
                            break;
                        }
                        if (Statics.field1969 == null) {
                            field2491.field1841 = 0;
                            int var12 = field2491.method2125();
                            int var13 = field2491.method2182();
                            int var14 = field2491.method2125();
                            int var15 = field2491.method2146();
                            long var16 = (long) ((var12 << 16) + var13);
                            class150 var18 = (class150) field2483.method3192(var16);
                            Statics.field2490 = true;
                            if (var18 == null) {
                                var18 = (class150) field2497.method3192(var16);
                                Statics.field2490 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1969 = var18;
                            Statics.field2132 = new class107(var15 + var19 + Statics.field1969.field2504);
                            Statics.field2132.method2249(var14);
                            Statics.field2132.method2130(var15);
                            field2492 = 8;
                            field2491.field1841 = 0;
                        } else if (field2492 == 0) {
                            if (field2491.field1845[0] == -1) {
                                field2492 = 1;
                                field2491.field1841 = 0;
                            } else {
                                Statics.field1969 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2132.field1845.length - Statics.field1969.field2504;
                        int var21 = 512 - field2492;
                        if (var21 > var20 - Statics.field2132.field1841) {
                            var21 = var20 - Statics.field2132.field1841;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2484.method2579(Statics.field2132.field1845, Statics.field2132.field1841, var21);
                        if (field2486 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2132.field1845[Statics.field2132.field1841 + var22] ^= field2486;
                            }
                        }
                        Statics.field2132.field1841 += var21;
                        field2492 += var21;
                        if (Statics.field2132.field1841 == var20) {
                            if (Statics.field1969.field2843 == 16711935L) {
                                Statics.field2494 = Statics.field2132;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class146 var24 = field2482[var23];
                                    if (var24 != null) {
                                        Statics.field2494.field1841 = var23 * 8 + 5;
                                        int var25 = Statics.field2494.method2146();
                                        int var26 = Statics.field2494.method2146();
                                        var24.method2792(var25, var26);
                                    }
                                }
                            } else {
                                field2493.reset();
                                field2493.update(Statics.field2132.field1845, 0, var20);
                                int var27 = (int) field2493.getValue();
                                if (Statics.field1969.field2503 != var27) {
                                    try {
                                        Statics.field2484.method2577();
                                    } catch (Exception var32) {
                                    }
                                    field2479++;
                                    Statics.field2484 = null;
                                    field2486 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2479 = 0;
                                field2498 = 0;
                                Statics.field1969.field2506.method2795((int) (Statics.field1969.field2843 & 0xFFFFL), Statics.field2132.field1845, (Statics.field1969.field2843 & 0xFF0000L) == 16711680L, Statics.field2490);
                            }
                            Statics.field1969.method3307();
                            if (Statics.field2490) {
                                field2488--;
                            } else {
                                field2489--;
                            }
                            field2492 = 0;
                            Statics.field1969 = null;
                            Statics.field2132 = null;
                        } else {
                            if (field2492 != 512) {
                                break;
                            }
                            field2492 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2484.method2577();
                } catch (Exception var31) {
                }
                field2498++;
                Statics.field2484 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cp.p(ZI)V")
    public static void method1979(boolean arg0) {
        if (Statics.field2484 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2249(arg0 ? 2 : 3);
            var1.method2129(0);
            Statics.field2484.method2576(var1.field1845, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2484.method2577();
            } catch (Exception var4) {
            }
            field2498++;
            Statics.field2484 = null;
        }
    }

    @ObfuscatedName("ci.a(Ldh;ZI)V")
    public static void method1886(class130 arg0, boolean arg1) {
        if (Statics.field2484 != null) {
            try {
                Statics.field2484.method2577();
            } catch (Exception var10) {
            }
            Statics.field2484 = null;
        }
        Statics.field2484 = arg0;
        method1979(arg1);
        field2491.field1841 = 0;
        Statics.field1969 = null;
        Statics.field2132 = null;
        field2492 = 0;
        while (true) {
            class150 var3 = (class150) field2483.method3196();
            if (var3 == null) {
                while (true) {
                    class150 var4 = (class150) field2497.method3196();
                    if (var4 == null) {
                        if (field2486 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2249(4);
                                var5.method2249(field2486);
                                var5.method2128(0);
                                Statics.field2484.method2576(var5.field1845, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2484.method2577();
                                } catch (Exception var8) {
                                }
                                field2498++;
                                Statics.field2484 = null;
                            }
                        }
                        field2480 = 0;
                        Statics.field79 = class103.method527();
                        return;
                    }
                    field2485.method3286(var4);
                    field2501.method3191(var4, var4.field2843);
                    field2495++;
                    field2489--;
                }
            }
            field2481.method3191(var3, var3.field2843);
            field2496++;
            field2488--;
        }
    }

    @ObfuscatedName("br.g(Leb;IIIBZI)V")
    public static void method1324(class146 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class150 var8 = (class150) field2481.method3192(var6);
        if (var8 != null) {
            return;
        }
        class150 var9 = (class150) field2483.method3192(var6);
        if (var9 != null) {
            return;
        }
        class150 var10 = (class150) field2501.method3192(var6);
        if (var10 == null) {
            if (!arg5) {
                class150 var11 = (class150) field2497.method3192(var6);
                if (var11 != null) {
                    return;
                }
            }
            class150 var12 = new class150();
            var12.field2506 = arg0;
            var12.field2503 = arg3;
            var12.field2504 = arg4;
            if (arg5) {
                field2481.method3191(var12, var6);
                field2496++;
            } else {
                field2485.method3273(var12);
                field2501.method3191(var12, var6);
                field2495++;
            }
        } else if (arg5) {
            var10.method3287();
            field2481.method3191(var10, var6);
            field2495--;
            field2496++;
        }
    }

    @ObfuscatedName("db.u(ZZB)I")
    public static int method2500(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2496 + field2488;
        }
        if (arg1) {
            var2 += field2495 + field2489;
        }
        return var2;
    }

    @ObfuscatedName("a.k(I)V")
    public static void method23() {
        if (Statics.field2484 != null) {
            Statics.field2484.method2577();
        }
    }
}
