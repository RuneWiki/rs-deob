package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class153 {

    @ObfuscatedName("ei.k")
    public static int field2518 = 0;

    @ObfuscatedName("ei.e")
    public static class177 field2520 = new class177(4096);

    @ObfuscatedName("ei.r")
    public static int field2517 = 0;

    @ObfuscatedName("ei.a")
    public static class177 field2522 = new class177(32);

    @ObfuscatedName("ei.n")
    public static int field2523 = 0;

    @ObfuscatedName("ei.x")
    public static class184 field2524 = new class184();

    @ObfuscatedName("ei.g")
    public static class177 field2525 = new class177(4096);

    @ObfuscatedName("ei.o")
    public static int field2533 = 0;

    @ObfuscatedName("ei.p")
    public static class177 field2527 = new class177(4096);

    @ObfuscatedName("ei.v")
    public static int field2526 = 0;

    @ObfuscatedName("ei.s")
    public static class108 field2529 = new class108(8);

    @ObfuscatedName("ei.u")
    public static int field2532 = 0;

    @ObfuscatedName("ei.d")
    public static CRC32 field2531 = new CRC32();

    @ObfuscatedName("ei.m")
    public static class150[] field2528 = new class150[256];

    @ObfuscatedName("ei.q")
    public static byte field2530 = 0;

    @ObfuscatedName("ei.h")
    public static int field2534 = 0;

    @ObfuscatedName("ei.c")
    public static int field2535 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.f(I)Z")
    public static boolean method142() {
        long var0 = class104.method1417();
        int var2 = (int) (var0 - Statics.field2519);
        Statics.field2519 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2518 += var2;
        if (field2526 == 0 && field2523 == 0 && field2533 == 0 && field2517 == 0) {
            return true;
        } else if (Statics.field2521 == null) {
            return false;
        } else {
            try {
                if (field2518 > 30000) {
                    throw new IOException();
                }
                while (field2523 < 20 && field2517 > 0) {
                    class154 var3 = (class154) field2520.method3254();
                    class108 var4 = new class108(4);
                    var4.method2144(1);
                    var4.method2146((int) var3.field2882);
                    Statics.field2521.method2634(var4.field1854, 0, 4);
                    field2522.method3245(var3, var3.field2882);
                    field2517--;
                    field2523++;
                }
                while (field2526 < 20 && field2533 > 0) {
                    class154 var5 = (class154) field2524.method3345();
                    class108 var6 = new class108(4);
                    var6.method2144(0);
                    var6.method2146((int) var5.field2882);
                    Statics.field2521.method2634(var6.field1854, 0, 4);
                    var5.method3347();
                    field2527.method3245(var5, var5.field2882);
                    field2533--;
                    field2526++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2521.method2611();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2518 = 0;
                    byte var9 = 0;
                    if (Statics.field517 == null) {
                        var9 = 8;
                    } else if (field2532 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2529.field1859;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2521.method2612(field2529.field1854, field2529.field1859, var10);
                        if (field2530 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2529.field1854[field2529.field1859 + var11] ^= field2530;
                            }
                        }
                        field2529.field1859 += var10;
                        if (field2529.field1859 < var9) {
                            break;
                        }
                        if (Statics.field517 == null) {
                            field2529.field1859 = 0;
                            int var12 = field2529.method2158();
                            int var13 = field2529.method2160();
                            int var14 = field2529.method2158();
                            int var15 = field2529.method2256();
                            long var16 = (long) ((var12 << 16) + var13);
                            class154 var18 = (class154) field2522.method3244(var16);
                            Statics.field1440 = true;
                            if (var18 == null) {
                                var18 = (class154) field2527.method3244(var16);
                                Statics.field1440 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field517 = var18;
                            Statics.field2896 = new class108(var15 + var19 + Statics.field517.field2538);
                            Statics.field2896.method2144(var14);
                            Statics.field2896.method2147(var15);
                            field2532 = 8;
                            field2529.field1859 = 0;
                        } else if (field2532 == 0) {
                            if (field2529.field1854[0] == -1) {
                                field2532 = 1;
                                field2529.field1859 = 0;
                            } else {
                                Statics.field517 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2896.field1854.length - Statics.field517.field2538;
                        int var21 = 512 - field2532;
                        if (var21 > var20 - Statics.field2896.field1859) {
                            var21 = var20 - Statics.field2896.field1859;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2521.method2612(Statics.field2896.field1854, Statics.field2896.field1859, var21);
                        if (field2530 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2896.field1854[Statics.field2896.field1859 + var22] ^= field2530;
                            }
                        }
                        Statics.field2896.field1859 += var21;
                        field2532 += var21;
                        if (Statics.field2896.field1859 == var20) {
                            if (Statics.field517.field2882 == 16711935L) {
                                Statics.field13 = Statics.field2896;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class150 var24 = field2528[var23];
                                    if (var24 != null) {
                                        Statics.field13.field1859 = var23 * 8 + 5;
                                        int var25 = Statics.field13.method2256();
                                        int var26 = Statics.field13.method2256();
                                        var24.method2855(var25, var26);
                                    }
                                }
                            } else {
                                field2531.reset();
                                field2531.update(Statics.field2896.field1854, 0, var20);
                                int var27 = (int) field2531.getValue();
                                if (Statics.field517.field2537 != var27) {
                                    try {
                                        Statics.field2521.method2609();
                                    } catch (Exception var32) {
                                    }
                                    field2534++;
                                    Statics.field2521 = null;
                                    field2530 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2534 = 0;
                                field2535 = 0;
                                Statics.field517.field2540.method2844((int) (Statics.field517.field2882 & 0xFFFFL), Statics.field2896.field1854, (Statics.field517.field2882 & 0xFF0000L) == 16711680L, Statics.field1440);
                            }
                            Statics.field517.method3367();
                            if (Statics.field1440) {
                                field2523--;
                            } else {
                                field2526--;
                            }
                            field2532 = 0;
                            Statics.field517 = null;
                            Statics.field2896 = null;
                        } else {
                            if (field2532 != 512) {
                                break;
                            }
                            field2532 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2521.method2609();
                } catch (Exception var31) {
                }
                field2535++;
                Statics.field2521 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("i.k(ZI)V")
    public static void method550(boolean arg0) {
        if (Statics.field2521 == null) {
            return;
        }
        try {
            class108 var1 = new class108(4);
            var1.method2144(arg0 ? 2 : 3);
            var1.method2146(0);
            Statics.field2521.method2634(var1.field1854, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2521.method2609();
            } catch (Exception var4) {
            }
            field2535++;
            Statics.field2521 = null;
        }
    }

    @ObfuscatedName("fo.y(Les;IIIBZB)V")
    public static void method3203(class150 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2520.method3244(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2522.method3244(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2525.method3244(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2527.method3244(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2540 = arg0;
            var12.field2537 = arg3;
            var12.field2538 = arg4;
            if (arg5) {
                field2520.method3245(var12, var6);
                field2517++;
            } else {
                field2524.method3328(var12);
                field2525.method3245(var12, var6);
                field2533++;
            }
        } else if (arg5) {
            var10.method3347();
            field2520.method3245(var10, var6);
            field2533--;
            field2517++;
        }
    }

    @ObfuscatedName("t.e(IIB)I")
    public static int method166(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field517 != null && Statics.field517.field2882 == var2 ? Statics.field2896.field1859 * 99 / (Statics.field2896.field1854.length - Statics.field517.field2538) + 1 : 0;
    }

    @ObfuscatedName("ed.r(ZZI)I")
    public static int method2733(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2523 + field2517;
        }
        if (arg1) {
            var2 += field2533 + field2526;
        }
        return var2;
    }
}
