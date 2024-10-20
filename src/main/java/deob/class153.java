package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ek")
public class class153 {

    @ObfuscatedName("ek.v")
    public static int field2519 = 0;

    @ObfuscatedName("ek.e")
    public static class177 field2504 = new class177(4096);

    @ObfuscatedName("ek.h")
    public static int field2505 = 0;

    @ObfuscatedName("ek.p")
    public static class177 field2506 = new class177(32);

    @ObfuscatedName("ek.j")
    public static int field2507 = 0;

    @ObfuscatedName("ek.i")
    public static class184 field2508 = new class184();

    @ObfuscatedName("ek.u")
    public static class177 field2524 = new class177(4096);

    @ObfuscatedName("ek.l")
    public static int field2510 = 0;

    @ObfuscatedName("ek.k")
    public static class177 field2511 = new class177(4096);

    @ObfuscatedName("ek.q")
    public static int field2502 = 0;

    @ObfuscatedName("ek.g")
    public static class108 field2513 = new class108(8);

    @ObfuscatedName("ek.c")
    public static int field2514 = 0;

    @ObfuscatedName("ek.f")
    public static CRC32 field2515 = new CRC32();

    @ObfuscatedName("ek.o")
    public static class150[] field2512 = new class150[256];

    @ObfuscatedName("ek.z")
    public static byte field2518 = 0;

    @ObfuscatedName("ek.d")
    public static int field2523 = 0;

    @ObfuscatedName("ek.y")
    public static int field2520 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.x(B)Z")
    public static boolean method516() {
        long var0 = class104.method27();
        int var2 = (int) (var0 - Statics.field2503);
        Statics.field2503 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2519 += var2;
        if (field2502 == 0 && field2507 == 0 && field2510 == 0 && field2505 == 0) {
            return true;
        } else if (Statics.field2924 == null) {
            return false;
        } else {
            try {
                if (field2519 > 30000) {
                    throw new IOException();
                }
                while (field2507 < 20 && field2505 > 0) {
                    class154 var3 = (class154) field2504.method3217();
                    class108 var4 = new class108(4);
                    var4.method2113(1);
                    var4.method2147((int) var3.field2882);
                    Statics.field2924.method2601(var4.field1839, 0, 4);
                    field2506.method3215(var3, var3.field2882);
                    field2505--;
                    field2507++;
                }
                while (field2502 < 20 && field2510 > 0) {
                    class154 var5 = (class154) field2508.method3309();
                    class108 var6 = new class108(4);
                    var6.method2113(0);
                    var6.method2147((int) var5.field2882);
                    Statics.field2924.method2601(var6.field1839, 0, 4);
                    var5.method3321();
                    field2511.method3215(var5, var5.field2882);
                    field2510--;
                    field2502++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2924.method2595();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2519 = 0;
                    byte var9 = 0;
                    if (Statics.field1882 == null) {
                        var9 = 8;
                    } else if (field2514 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2513.field1841;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2924.method2596(field2513.field1839, field2513.field1841, var10);
                        if (field2518 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2513.field1839[field2513.field1841 + var11] ^= field2518;
                            }
                        }
                        field2513.field1841 += var10;
                        if (field2513.field1841 < var9) {
                            break;
                        }
                        if (Statics.field1882 == null) {
                            field2513.field1841 = 0;
                            int var12 = field2513.method2299();
                            int var13 = field2513.method2129();
                            int var14 = field2513.method2299();
                            int var15 = field2513.method2132();
                            long var16 = (long) ((var12 << 16) + var13);
                            class154 var18 = (class154) field2506.method3214(var16);
                            Statics.field616 = true;
                            if (var18 == null) {
                                var18 = (class154) field2511.method3214(var16);
                                Statics.field616 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1882 = var18;
                            Statics.field2136 = new class108(var15 + var19 + Statics.field1882.field2528);
                            Statics.field2136.method2113(var14);
                            Statics.field2136.method2233(var15);
                            field2514 = 8;
                            field2513.field1841 = 0;
                        } else if (field2514 == 0) {
                            if (field2513.field1839[0] == -1) {
                                field2514 = 1;
                                field2513.field1841 = 0;
                            } else {
                                Statics.field1882 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2136.field1839.length - Statics.field1882.field2528;
                        int var21 = 512 - field2514;
                        if (var21 > var20 - Statics.field2136.field1841) {
                            var21 = var20 - Statics.field2136.field1841;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2924.method2596(Statics.field2136.field1839, Statics.field2136.field1841, var21);
                        if (field2518 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2136.field1839[Statics.field2136.field1841 + var22] ^= field2518;
                            }
                        }
                        Statics.field2136.field1841 += var21;
                        field2514 += var21;
                        if (Statics.field2136.field1841 == var20) {
                            if (Statics.field1882.field2882 == 16711935L) {
                                Statics.field2516 = Statics.field2136;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class150 var24 = field2512[var23];
                                    if (var24 != null) {
                                        Statics.field2516.field1841 = var23 * 8 + 5;
                                        int var25 = Statics.field2516.method2132();
                                        int var26 = Statics.field2516.method2132();
                                        var24.method2825(var25, var26);
                                    }
                                }
                            } else {
                                field2515.reset();
                                field2515.update(Statics.field2136.field1839, 0, var20);
                                int var27 = (int) field2515.getValue();
                                if (Statics.field1882.field2526 != var27) {
                                    try {
                                        Statics.field2924.method2593();
                                    } catch (Exception var32) {
                                    }
                                    field2523++;
                                    Statics.field2924 = null;
                                    field2518 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2523 = 0;
                                field2520 = 0;
                                Statics.field1882.field2525.method2821((int) (Statics.field1882.field2882 & 0xFFFFL), Statics.field2136.field1839, (Statics.field1882.field2882 & 0xFF0000L) == 16711680L, Statics.field616);
                            }
                            Statics.field1882.method3352();
                            if (Statics.field616) {
                                field2507--;
                            } else {
                                field2502--;
                            }
                            field2514 = 0;
                            Statics.field1882 = null;
                            Statics.field2136 = null;
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
                    Statics.field2924.method2593();
                } catch (Exception var31) {
                }
                field2520++;
                Statics.field2924 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("q.v(ZI)V")
    public static void method123(boolean arg0) {
        if (Statics.field2924 == null) {
            return;
        }
        try {
            class108 var1 = new class108(4);
            var1.method2113(arg0 ? 2 : 3);
            var1.method2147(0);
            Statics.field2924.method2601(var1.field1839, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2924.method2593();
            } catch (Exception var4) {
            }
            field2520++;
            Statics.field2924 = null;
        }
    }

    @ObfuscatedName("dg.e(Lec;IIIBZB)V")
    public static void method2522(class150 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2504.method3214(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2506.method3214(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2524.method3214(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2511.method3214(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2525 = arg0;
            var12.field2526 = arg3;
            var12.field2528 = arg4;
            if (arg5) {
                field2504.method3215(var12, var6);
                field2505++;
            } else {
                field2508.method3301(var12);
                field2524.method3215(var12, var6);
                field2510++;
            }
        } else if (arg5) {
            var10.method3321();
            field2504.method3215(var10, var6);
            field2510--;
            field2505++;
        }
    }

    @ObfuscatedName("ah.h(I)V")
    public static void method686() {
        if (Statics.field2924 != null) {
            Statics.field2924.method2593();
        }
    }
}
