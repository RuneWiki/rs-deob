package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eb")
public class class150 {

    @ObfuscatedName("eb.o")
    public static int field2474 = 0;

    @ObfuscatedName("eb.p")
    public static class174 field2476 = new class174(4096);

    @ObfuscatedName("eb.c")
    public static int field2477 = 0;

    @ObfuscatedName("eb.y")
    public static class174 field2478 = new class174(32);

    @ObfuscatedName("eb.g")
    public static int field2490 = 0;

    @ObfuscatedName("eb.l")
    public static class181 field2482 = new class181();

    @ObfuscatedName("eb.h")
    public static class174 field2481 = new class174(4096);

    @ObfuscatedName("eb.n")
    public static int field2495 = 0;

    @ObfuscatedName("eb.w")
    public static class174 field2483 = new class174(4096);

    @ObfuscatedName("eb.m")
    public static int field2484 = 0;

    @ObfuscatedName("eb.u")
    public static class107 field2486 = new class107(8);

    @ObfuscatedName("eb.z")
    public static int field2473 = 0;

    @ObfuscatedName("eb.k")
    public static CRC32 field2488 = new CRC32();

    @ObfuscatedName("eb.d")
    public static class147[] field2489 = new class147[256];

    @ObfuscatedName("eb.j")
    public static byte field2485 = 0;

    @ObfuscatedName("eb.s")
    public static int field2491 = 0;

    @ObfuscatedName("eb.f")
    public static int field2496 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.t(B)Z")
    public static boolean method819() {
        long var0 = class103.method1861();
        int var2 = (int) (var0 - Statics.field2492);
        Statics.field2492 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2474 += var2;
        if (field2484 == 0 && field2490 == 0 && field2495 == 0 && field2477 == 0) {
            return true;
        } else if (Statics.field2475 == null) {
            return false;
        } else {
            try {
                if (field2474 > 30000) {
                    throw new IOException();
                }
                while (field2490 < 20 && field2477 > 0) {
                    class151 var3 = (class151) field2476.method3134();
                    class107 var4 = new class107(4);
                    var4.method2168(1);
                    var4.method2106((int) var3.field2866);
                    Statics.field2475.method2557(var4.field1826, 0, 4);
                    field2478.method3132(var3, var3.field2866);
                    field2477--;
                    field2490++;
                }
                while (field2484 < 20 && field2495 > 0) {
                    class151 var5 = (class151) field2482.method3227();
                    class107 var6 = new class107(4);
                    var6.method2168(0);
                    var6.method2106((int) var5.field2866);
                    Statics.field2475.method2557(var6.field1826, 0, 4);
                    var5.method3242();
                    field2483.method3132(var5, var5.field2866);
                    field2495--;
                    field2484++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2475.method2555();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2474 = 0;
                    byte var9 = 0;
                    if (Statics.field189 == null) {
                        var9 = 8;
                    } else if (field2473 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2486.field1827;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2475.method2559(field2486.field1826, field2486.field1827, var10);
                        if (field2485 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2486.field1826[field2486.field1827 + var11] ^= field2485;
                            }
                        }
                        field2486.field1827 += var10;
                        if (field2486.field1827 < var9) {
                            break;
                        }
                        if (Statics.field189 == null) {
                            field2486.field1827 = 0;
                            int var12 = field2486.method2118();
                            int var13 = field2486.method2120();
                            int var14 = field2486.method2118();
                            int var15 = field2486.method2152();
                            long var16 = (long) ((var12 << 16) + var13);
                            class151 var18 = (class151) field2478.method3138(var16);
                            Statics.field1062 = true;
                            if (var18 == null) {
                                var18 = (class151) field2483.method3138(var16);
                                Statics.field1062 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field189 = var18;
                            Statics.field2487 = new class107(var15 + var19 + Statics.field189.field2501);
                            Statics.field2487.method2168(var14);
                            Statics.field2487.method2174(var15);
                            field2473 = 8;
                            field2486.field1827 = 0;
                        } else if (field2473 == 0) {
                            if (field2486.field1826[0] == -1) {
                                field2473 = 1;
                                field2486.field1827 = 0;
                            } else {
                                Statics.field189 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2487.field1826.length - Statics.field189.field2501;
                        int var21 = 512 - field2473;
                        if (var21 > var20 - Statics.field2487.field1827) {
                            var21 = var20 - Statics.field2487.field1827;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2475.method2559(Statics.field2487.field1826, Statics.field2487.field1827, var21);
                        if (field2485 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2487.field1826[Statics.field2487.field1827 + var22] ^= field2485;
                            }
                        }
                        Statics.field2487.field1827 += var21;
                        field2473 += var21;
                        if (Statics.field2487.field1827 == var20) {
                            if (Statics.field189.field2866 == 16711935L) {
                                Statics.field2384 = Statics.field2487;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class147 var24 = field2489[var23];
                                    if (var24 != null) {
                                        Statics.field2384.field1827 = var23 * 8 + 5;
                                        int var25 = Statics.field2384.method2152();
                                        int var26 = Statics.field2384.method2152();
                                        var24.method2757(var25, var26);
                                    }
                                }
                            } else {
                                field2488.reset();
                                field2488.update(Statics.field2487.field1826, 0, var20);
                                int var27 = (int) field2488.getValue();
                                if (Statics.field189.field2500 != var27) {
                                    try {
                                        Statics.field2475.method2554();
                                    } catch (Exception var32) {
                                    }
                                    field2491++;
                                    Statics.field2475 = null;
                                    field2485 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2491 = 0;
                                field2496 = 0;
                                Statics.field189.field2503.method2746((int) (Statics.field189.field2866 & 0xFFFFL), Statics.field2487.field1826, (Statics.field189.field2866 & 0xFF0000L) == 16711680L, Statics.field1062);
                            }
                            Statics.field189.method3261();
                            if (Statics.field1062) {
                                field2490--;
                            } else {
                                field2484--;
                            }
                            field2473 = 0;
                            Statics.field189 = null;
                            Statics.field2487 = null;
                        } else {
                            if (field2473 != 512) {
                                break;
                            }
                            field2473 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2475.method2554();
                } catch (Exception var31) {
                }
                field2496++;
                Statics.field2475 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("et.o(ZI)V")
    public static void method2636(boolean arg0) {
        if (Statics.field2475 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2168(arg0 ? 2 : 3);
            var1.method2106(0);
            Statics.field2475.method2557(var1.field1826, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2475.method2554();
            } catch (Exception var4) {
            }
            field2496++;
            Statics.field2475 = null;
        }
    }

    @ObfuscatedName("cc.i(Leh;II)V")
    public static void method1766(class147 arg0, int arg1) {
        if (Statics.field2384 == null) {
            method2067((class147) null, 255, 255, 0, (byte) 0, true);
            field2489[arg1] = arg0;
        } else {
            Statics.field2384.field1827 = arg1 * 8 + 5;
            int var2 = Statics.field2384.method2152();
            int var3 = Statics.field2384.method2152();
            arg0.method2757(var2, var3);
        }
    }

    @ObfuscatedName("cw.p(Leh;IIIBZI)V")
    public static void method2067(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2476.method3138(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2478.method3138(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2481.method3138(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2483.method3138(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2503 = arg0;
            var12.field2500 = arg3;
            var12.field2501 = arg4;
            if (arg5) {
                field2476.method3132(var12, var6);
                field2477++;
            } else {
                field2482.method3224(var12);
                field2481.method3132(var12, var6);
                field2495++;
            }
        } else if (arg5) {
            var10.method3242();
            field2476.method3132(var10, var6);
            field2495--;
            field2477++;
        }
    }

    @ObfuscatedName("aj.c(III)V")
    public static void method622(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2481.method3138(var2);
        if (var4 != null) {
            field2482.method3225(var4);
        }
    }

    @ObfuscatedName("dw.y(ZZI)I")
    public static int method2399(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2490 + field2477;
        }
        if (arg1) {
            var2 += field2495 + field2484;
        }
        return var2;
    }

    @ObfuscatedName("aw.g(I)V")
    public static void method604() {
        if (Statics.field2475 != null) {
            Statics.field2475.method2554();
        }
    }
}
