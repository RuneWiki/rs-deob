package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ex")
public class class151 {

    @ObfuscatedName("ex.i")
    public static int field2530 = 0;

    @ObfuscatedName("ex.e")
    public static class175 field2518 = new class175(4096);

    @ObfuscatedName("ex.w")
    public static int field2522 = 0;

    @ObfuscatedName("ex.m")
    public static class175 field2521 = new class175(32);

    @ObfuscatedName("ex.u")
    public static int field2524 = 0;

    @ObfuscatedName("ex.j")
    public static class182 field2527 = new class182();

    @ObfuscatedName("ex.o")
    public static class175 field2526 = new class175(4096);

    @ObfuscatedName("ex.h")
    public static int field2519 = 0;

    @ObfuscatedName("ex.b")
    public static class175 field2523 = new class175(4096);

    @ObfuscatedName("ex.r")
    public static int field2529 = 0;

    @ObfuscatedName("ex.q")
    public static class107 field2537 = new class107(8);

    @ObfuscatedName("ex.y")
    public static int field2531 = 0;

    @ObfuscatedName("ex.z")
    public static CRC32 field2532 = new CRC32();

    @ObfuscatedName("ex.v")
    public static class148[] field2533 = new class148[256];

    @ObfuscatedName("ex.f")
    public static byte field2534 = 0;

    @ObfuscatedName("ex.a")
    public static int field2535 = 0;

    @ObfuscatedName("ex.p")
    public static int field2536 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.g(B)Z")
    public static boolean method1573() {
        long var0 = class103.method98();
        int var2 = (int) (var0 - Statics.field2520);
        Statics.field2520 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2530 += var2;
        if (field2529 == 0 && field2524 == 0 && field2519 == 0 && field2522 == 0) {
            return true;
        } else if (Statics.field2525 == null) {
            return false;
        } else {
            try {
                if (field2530 > 30000) {
                    throw new IOException();
                }
                while (field2524 < 20 && field2522 > 0) {
                    class152 var3 = (class152) field2518.method3182();
                    class107 var4 = new class107(4);
                    var4.method2079(1);
                    var4.method2080((int) var3.field2885);
                    Statics.field2525.method2568(var4.field1843, 0, 4);
                    field2521.method3177(var3, var3.field2885);
                    field2522--;
                    field2524++;
                }
                while (field2529 < 20 && field2519 > 0) {
                    class152 var5 = (class152) field2527.method3254();
                    class107 var6 = new class107(4);
                    var6.method2079(0);
                    var6.method2080((int) var5.field2885);
                    Statics.field2525.method2568(var6.field1843, 0, 4);
                    var5.method3272();
                    field2523.method3177(var5, var5.field2885);
                    field2519--;
                    field2529++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2525.method2551();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2530 = 0;
                    byte var9 = 0;
                    if (Statics.field2910 == null) {
                        var9 = 8;
                    } else if (field2531 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2537.field1844;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2525.method2557(field2537.field1843, field2537.field1844, var10);
                        if (field2534 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2537.field1843[field2537.field1844 + var11] ^= field2534;
                            }
                        }
                        field2537.field1844 += var10;
                        if (field2537.field1844 < var9) {
                            break;
                        }
                        if (Statics.field2910 == null) {
                            field2537.field1844 = 0;
                            int var12 = field2537.method2092();
                            int var13 = field2537.method2094();
                            int var14 = field2537.method2092();
                            int var15 = field2537.method2112();
                            long var16 = (long) ((var12 << 16) + var13);
                            class152 var18 = (class152) field2521.method3174(var16);
                            Statics.field1850 = true;
                            if (var18 == null) {
                                var18 = (class152) field2523.method3174(var16);
                                Statics.field1850 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2910 = var18;
                            Statics.field1855 = new class107(var15 + var19 + Statics.field2910.field2545);
                            Statics.field1855.method2079(var14);
                            Statics.field1855.method2247(var15);
                            field2531 = 8;
                            field2537.field1844 = 0;
                        } else if (field2531 == 0) {
                            if (field2537.field1843[0] == -1) {
                                field2531 = 1;
                                field2537.field1844 = 0;
                            } else {
                                Statics.field2910 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1855.field1843.length - Statics.field2910.field2545;
                        int var21 = 512 - field2531;
                        if (var21 > var20 - Statics.field1855.field1844) {
                            var21 = var20 - Statics.field1855.field1844;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2525.method2557(Statics.field1855.field1843, Statics.field1855.field1844, var21);
                        if (field2534 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1855.field1843[Statics.field1855.field1844 + var22] ^= field2534;
                            }
                        }
                        Statics.field1855.field1844 += var21;
                        field2531 += var21;
                        if (Statics.field1855.field1844 == var20) {
                            if (Statics.field2910.field2885 == 16711935L) {
                                Statics.field1995 = Statics.field1855;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class148 var24 = field2533[var23];
                                    if (var24 != null) {
                                        Statics.field1995.field1844 = var23 * 8 + 5;
                                        int var25 = Statics.field1995.method2112();
                                        int var26 = Statics.field1995.method2112();
                                        var24.method2771(var25, var26);
                                    }
                                }
                            } else {
                                field2532.reset();
                                field2532.update(Statics.field1855.field1843, 0, var20);
                                int var27 = (int) field2532.getValue();
                                if (Statics.field2910.field2543 != var27) {
                                    try {
                                        Statics.field2525.method2553();
                                    } catch (Exception var32) {
                                    }
                                    field2535++;
                                    Statics.field2525 = null;
                                    field2534 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2535 = 0;
                                field2536 = 0;
                                Statics.field2910.field2542.method2767((int) (Statics.field2910.field2885 & 0xFFFFL), Statics.field1855.field1843, (Statics.field2910.field2885 & 0xFF0000L) == 16711680L, Statics.field1850);
                            }
                            Statics.field2910.method3304();
                            if (Statics.field1850) {
                                field2524--;
                            } else {
                                field2529--;
                            }
                            field2531 = 0;
                            Statics.field2910 = null;
                            Statics.field1855 = null;
                        } else {
                            if (field2531 != 512) {
                                break;
                            }
                            field2531 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2525.method2553();
                } catch (Exception var31) {
                }
                field2536++;
                Statics.field2525 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cv.i(ZB)V")
    public static void method1851(boolean arg0) {
        if (Statics.field2525 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2079(arg0 ? 2 : 3);
            var1.method2080(0);
            Statics.field2525.method2568(var1.field1843, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2525.method2553();
            } catch (Exception var4) {
            }
            field2536++;
            Statics.field2525 = null;
        }
    }

    @ObfuscatedName("az.k(Leb;IIIBZI)V")
    public static void method730(class148 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class152 var8 = (class152) field2518.method3174(var6);
        if (var8 != null) {
            return;
        }
        class152 var9 = (class152) field2521.method3174(var6);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) field2526.method3174(var6);
        if (var10 == null) {
            if (!arg5) {
                class152 var11 = (class152) field2523.method3174(var6);
                if (var11 != null) {
                    return;
                }
            }
            class152 var12 = new class152();
            var12.field2542 = arg0;
            var12.field2543 = arg3;
            var12.field2545 = arg4;
            if (arg5) {
                field2518.method3177(var12, var6);
                field2522++;
            } else {
                field2527.method3252(var12);
                field2526.method3177(var12, var6);
                field2519++;
            }
        } else if (arg5) {
            var10.method3272();
            field2518.method3177(var10, var6);
            field2519--;
            field2522++;
        }
    }

    @ObfuscatedName("dm.e(IIB)V")
    public static void method2395(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class152 var4 = (class152) field2526.method3174(var2);
        if (var4 != null) {
            field2527.method3268(var4);
        }
    }

    @ObfuscatedName("da.w(IIS)I")
    public static int method2372(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2910 != null && Statics.field2910.field2885 == var2 ? Statics.field1855.field1844 * 99 / (Statics.field1855.field1843.length - Statics.field2910.field2545) + 1 : 0;
    }
}
