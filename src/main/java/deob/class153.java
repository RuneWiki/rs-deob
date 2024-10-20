package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ex")
public class class153 {

    @ObfuscatedName("ex.l")
    public static int field2531 = 0;

    @ObfuscatedName("ex.d")
    public static class175 field2533 = new class175(4096);

    @ObfuscatedName("ex.b")
    public static int field2534 = 0;

    @ObfuscatedName("ex.i")
    public static class175 field2535 = new class175(32);

    @ObfuscatedName("ex.p")
    public static int field2536 = 0;

    @ObfuscatedName("ex.y")
    public static class172 field2544 = new class172();

    @ObfuscatedName("ex.u")
    public static class175 field2542 = new class175(4096);

    @ObfuscatedName("ex.z")
    public static int field2538 = 0;

    @ObfuscatedName("ex.j")
    public static class175 field2540 = new class175(4096);

    @ObfuscatedName("ex.h")
    public static int field2541 = 0;

    @ObfuscatedName("ex.w")
    public static class127 field2543 = new class127(8);

    @ObfuscatedName("ex.o")
    public static int field2545 = 0;

    @ObfuscatedName("ex.r")
    public static CRC32 field2546 = new CRC32();

    @ObfuscatedName("ex.g")
    public static class154[] field2547 = new class154[256];

    @ObfuscatedName("ex.m")
    public static byte field2548 = 0;

    @ObfuscatedName("ex.a")
    public static int field2549 = 0;

    @ObfuscatedName("ex.n")
    public static int field2550 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.t(S)Z")
    public static boolean method2700() {
        long var0 = class121.method2693();
        int var2 = (int) (var0 - Statics.field2530);
        Statics.field2530 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2531 += var2;
        if (field2541 == 0 && field2536 == 0 && field2538 == 0 && field2534 == 0) {
            return true;
        } else if (Statics.field2539 == null) {
            return false;
        } else {
            try {
                if (field2531 > 30000) {
                    throw new IOException();
                }
                while (field2536 < 20 && field2534 > 0) {
                    class155 var3 = (class155) field2533.method3310();
                    class127 var4 = new class127(4);
                    var4.method2424(1);
                    var4.method2431((int) var3.field2821);
                    Statics.field2539.method1397(var4.field2061, 0, 4);
                    field2535.method3302(var3, var3.field2821);
                    field2534--;
                    field2536++;
                }
                while (field2541 < 20 && field2538 > 0) {
                    class155 var5 = (class155) field2544.method3276();
                    class127 var6 = new class127(4);
                    var6.method2424(0);
                    var6.method2431((int) var5.field2821);
                    Statics.field2539.method1397(var6.field2061, 0, 4);
                    var5.method3297();
                    field2540.method3302(var5, var5.field2821);
                    field2538--;
                    field2541++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2539.method1395();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2531 = 0;
                    byte var9 = 0;
                    if (Statics.field1486 == null) {
                        var9 = 8;
                    } else if (field2545 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2543.field2059;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2539.method1396(field2543.field2061, field2543.field2059, var10);
                        if (field2548 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2543.field2061[field2543.field2059 + var11] ^= field2548;
                            }
                        }
                        field2543.field2059 += var10;
                        if (field2543.field2059 < var9) {
                            break;
                        }
                        if (Statics.field1486 == null) {
                            field2543.field2059 = 0;
                            int var12 = field2543.method2438();
                            int var13 = field2543.method2440();
                            int var14 = field2543.method2438();
                            int var15 = field2543.method2448();
                            long var16 = (long) ((var12 << 16) + var13);
                            class155 var18 = (class155) field2535.method3301(var16);
                            Statics.field2532 = true;
                            if (var18 == null) {
                                var18 = (class155) field2540.method3301(var16);
                                Statics.field2532 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1486 = var18;
                            Statics.field1552 = new class127(var15 + var19 + Statics.field1486.field2567);
                            Statics.field1552.method2424(var14);
                            Statics.field1552.method2633(var15);
                            field2545 = 8;
                            field2543.field2059 = 0;
                        } else if (field2545 == 0) {
                            if (field2543.field2061[0] == -1) {
                                field2545 = 1;
                                field2543.field2059 = 0;
                            } else {
                                Statics.field1486 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1552.field2061.length - Statics.field1486.field2567;
                        int var21 = 512 - field2545;
                        if (var21 > var20 - Statics.field1552.field2059) {
                            var21 = var20 - Statics.field1552.field2059;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2539.method1396(Statics.field1552.field2061, Statics.field1552.field2059, var21);
                        if (field2548 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1552.field2061[Statics.field1552.field2059 + var22] ^= field2548;
                            }
                        }
                        Statics.field1552.field2059 += var21;
                        field2545 += var21;
                        if (Statics.field1552.field2059 == var20) {
                            if (Statics.field1486.field2821 == 16711935L) {
                                Statics.field982 = Statics.field1552;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class154 var24 = field2547[var23];
                                    if (var24 != null) {
                                        Statics.field982.field2059 = var23 * 8 + 5;
                                        int var25 = Statics.field982.method2448();
                                        int var26 = Statics.field982.method2448();
                                        var24.method3092(var25, var26);
                                    }
                                }
                            } else {
                                field2546.reset();
                                field2546.update(Statics.field1552.field2061, 0, var20);
                                int var27 = (int) field2546.getValue();
                                if (Statics.field1486.field2569 != var27) {
                                    try {
                                        Statics.field2539.method1394();
                                    } catch (Exception var32) {
                                    }
                                    field2549++;
                                    Statics.field2539 = null;
                                    field2548 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2549 = 0;
                                field2550 = 0;
                                Statics.field1486.field2568.method3100((int) (Statics.field1486.field2821 & 0xFFFFL), Statics.field1552.field2061, (Statics.field1486.field2821 & 0xFF0000L) == 16711680L, Statics.field2532);
                            }
                            Statics.field1486.method3361();
                            if (Statics.field2532) {
                                field2536--;
                            } else {
                                field2541--;
                            }
                            field2545 = 0;
                            Statics.field1486 = null;
                            Statics.field1552 = null;
                        } else {
                            if (field2545 != 512) {
                                break;
                            }
                            field2545 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2539.method1394();
                } catch (Exception var31) {
                }
                field2550++;
                Statics.field2539 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("al.l(ZI)V")
    public static void method769(boolean arg0) {
        if (Statics.field2539 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2424(arg0 ? 2 : 3);
            var1.method2431(0);
            Statics.field2539.method1397(var1.field2061, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2539.method1394();
            } catch (Exception var4) {
            }
            field2550++;
            Statics.field2539 = null;
        }
    }

    @ObfuscatedName("ex.c(Ley;IIIBZI)V")
    public static void method3073(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2533.method3301(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2535.method3301(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2542.method3301(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2540.method3301(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2568 = arg0;
            var12.field2569 = arg3;
            var12.field2567 = arg4;
            if (arg5) {
                field2533.method3302(var12, var6);
                field2534++;
            } else {
                field2544.method3273(var12);
                field2542.method3302(var12, var6);
                field2538++;
            }
        } else if (arg5) {
            var10.method3297();
            field2533.method3302(var10, var6);
            field2538--;
            field2534++;
        }
    }

    @ObfuscatedName("client.d(IIB)I")
    public static int method560(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1486 != null && Statics.field1486.field2821 == var2 ? Statics.field1552.field2059 * 99 / (Statics.field1552.field2061.length - Statics.field1486.field2567) + 1 : 0;
    }
}
