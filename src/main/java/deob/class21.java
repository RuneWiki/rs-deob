package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("g")
public class class21 {

    @ObfuscatedName("g.u")
    public static boolean field326 = false;

    @ObfuscatedName("g.w")
    public static int[] field329 = new int[256];

    @ObfuscatedName("g.s")
    public static int field330 = 0;

    @ObfuscatedName("g.g")
    public static int field355 = 0;

    @ObfuscatedName("g.e")
    public static int field345 = 0;

    @ObfuscatedName("g.ar")
    public static int field334 = 0;

    @ObfuscatedName("g.ak")
    public static int field335 = 0;

    @ObfuscatedName("g.ap")
    public static int field336 = 0;

    @ObfuscatedName("g.aa")
    public static int field337 = 10;

    @ObfuscatedName("g.av")
    public static String field324 = "";

    @ObfuscatedName("g.aq")
    public static int field331 = 0;

    @ObfuscatedName("g.an")
    public static String field340 = "";

    @ObfuscatedName("g.al")
    public static String field341 = "";

    @ObfuscatedName("g.ax")
    public static String field342 = "";

    @ObfuscatedName("g.as")
    public static String field353 = "";

    @ObfuscatedName("g.ah")
    public static String field344 = "";

    @ObfuscatedName("g.ae")
    public static int field343 = 0;

    @ObfuscatedName("g.ac")
    public static String field346 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("g.aj")
    public static boolean field347 = false;

    @ObfuscatedName("g.ai")
    public static int field349 = 0;

    @ObfuscatedName("g.bt")
    public static int[] field350 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("g.bn")
    public static int[] field351 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("g.bk")
    public static int field327 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.t(Lev;Lev;I)I")
    public static int method1640(class152 arg0, class152 arg1) {
        int var2 = 0;
        if (arg0.method3045("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3045("logo", "")) {
            var2++;
        }
        if (arg1.method3045("titlebox", "")) {
            var2++;
        }
        if (arg1.method3045("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3045("runes", "")) {
            var2++;
        }
        if (arg1.method3045("title_mute", "")) {
            var2++;
        }
        arg1.method3045("sl_back", "");
        arg1.method3045("sl_flags", "");
        arg1.method3045("sl_arrows", "");
        arg1.method3045("sl_stars", "");
        arg1.method3045("sl_button", "");
        return var2;
    }

    @ObfuscatedName("c.l(B)I")
    public static int method16() {
        return 6;
    }

    @ObfuscatedName("b.c(Ljava/awt/Component;Lev;Lev;I)V")
    public static void method50(Component arg0, class152 arg1, class152 arg2) {
        if (Statics.field338) {
            return;
        }
        class89.method1798();
        byte[] var3 = arg1.method3052("title.jpg", "");
        Statics.field2478 = new class86(var3, arg0);
        Statics.field339 = Statics.field2478.method1759();
        Statics.field1361 = class84.method2640(arg2, "logo", "");
        Statics.field333 = class84.method2640(arg2, "titlebox", "");
        Statics.field407 = class84.method2640(arg2, "titlebutton", "");
        Statics.field356 = class84.method628(arg2, "runes", "");
        Statics.field352 = class84.method628(arg2, "title_mute", "");
        Statics.field257 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field257[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field257[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field257[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field257[var7 + 192] = 16777215;
        }
        Statics.field128 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field128[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field128[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field128[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field128[var11 + 192] = 16777215;
        }
        Statics.field2097 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field2097[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field2097[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field2097[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field2097[var15 + 192] = 16777215;
        }
        Statics.field2822 = new int[256];
        Statics.field893 = new int[32768];
        Statics.field332 = new int[32768];
        method2955((class87) null);
        Statics.field85 = new int[32768];
        Statics.field771 = new int[32768];
        field331 = 0;
        field353 = "";
        field344 = "";
        field347 = false;
        if (client.field731 == 0) {
            field326 = true;
        } else {
            field326 = false;
        }
        if (field326) {
            class138.field2360 = 1;
            Statics.field1469 = null;
            Statics.field2362 = -1;
            Statics.field2361 = -1;
            Statics.field286 = 0;
            Statics.field427 = false;
            Statics.field2359 = 2;
        } else {
            class154 var16 = Statics.field758;
            int var17 = var16.method3023("scape main");
            int var18 = var16.method3003(var17, "");
            class138.field2360 = 1;
            Statics.field1469 = var16;
            Statics.field2362 = var17;
            Statics.field2361 = var18;
            Statics.field286 = 255;
            Statics.field427 = false;
            Statics.field2359 = 2;
        }
        class153.method769(false);
        Statics.field338 = true;
        Statics.field2478.method1727(0, 0);
        Statics.field339.method1727(382, 0);
        Statics.field1361.method1780(382 - Statics.field1361.field1517 / 2, 18);
    }

    @ObfuscatedName("t.d(I)V")
    public static void method4() {
        if (!Statics.field338) {
            return;
        }
        Statics.field333 = null;
        Statics.field407 = null;
        Statics.field356 = null;
        Statics.field2478 = null;
        Statics.field339 = null;
        Statics.field1361 = null;
        Statics.field352 = null;
        Statics.field348 = null;
        Statics.field1865 = null;
        Statics.field2031 = null;
        Statics.field232 = null;
        Statics.field2364 = null;
        Statics.field257 = null;
        Statics.field128 = null;
        Statics.field2097 = null;
        Statics.field2822 = null;
        Statics.field893 = null;
        Statics.field332 = null;
        Statics.field85 = null;
        Statics.field771 = null;
        class138.field2360 = 1;
        Statics.field1469 = null;
        Statics.field2362 = -1;
        Statics.field2361 = -1;
        Statics.field286 = 0;
        Statics.field427 = false;
        Statics.field2359 = 2;
        class153.method769(true);
        Statics.field338 = false;
    }

    @ObfuscatedName("ao.b(Lba;S)V")
    public static void method929(class73 arg0) {
        if (field347) {
            method2983(arg0);
            return;
        }
        if (class77.field1439 == 1 && class77.field1428 >= 715 && class77.field1429 >= 453) {
            field326 = !field326;
            if (field326) {
                class138.method2686();
            } else {
                Statics.method2682(Statics.field758, "scape main", "", 255, false);
            }
        }
        if (client.field699 == 5) {
            return;
        }
        field335++;
        if (client.field699 != 10) {
            return;
        }
        if (client.field702 == 0) {
            if (class77.field1439 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class77.field1428 >= var1 && class77.field1428 <= var1 + var3 && class77.field1429 >= var2 && class77.field1429 <= var2 + var4) {
                    method851();
                    return;
                }
            }
            if (Statics.field1406 != null) {
                method851();
            }
        }
        int var5 = class77.field1439;
        int var6 = class77.field1428;
        int var7 = class77.field1429;
        if (field331 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field331 = 3;
                field343 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field340 = class134.field2229;
                field341 = class134.field2301;
                field342 = class134.field2302;
                field331 = 2;
                field343 = 0;
            }
        } else if (field331 == 2) {
            short var11 = 231;
            int var23 = var11 + 30;
            if (var5 == 1 && var7 >= var23 - 15 && var7 < var23) {
                field343 = 0;
            }
            var23 += 15;
            if (var5 == 1 && var7 >= var23 - 15 && var7 < var23) {
                field343 = 1;
            }
            var23 += 15;
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field353 = field353.trim();
                if (field353.length() == 0) {
                    Statics.method3157(class134.field2196, class134.field2211, class134.field2212);
                    return;
                }
                if (field344.length() == 0) {
                    Statics.method3157(class134.field2213, class134.field2299, class134.field2215);
                    return;
                }
                Statics.method3157(class134.field2303, class134.field2304, class134.field2199);
                client.method2341(20);
                return;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field331 = 0;
                field353 = "";
                field344 = "";
            }
            while (true) {
                while (true) {
                    class75 var15 = class75.field1387;
                    boolean var16;
                    synchronized (class75.field1387) {
                        if (class75.field1402 == class75.field1400) {
                            var16 = false;
                        } else {
                            Statics.field1344 = class75.field1397[class75.field1400];
                            Statics.field954 = class75.field1396[class75.field1400];
                            class75.field1400 = class75.field1400 + 1 & 0x7F;
                            var16 = true;
                        }
                    }
                    if (!var16) {
                        return;
                    }
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field346.length(); var19++) {
                        if (Statics.field954 == field346.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (field343 == 0) {
                        if (Statics.field1344 == 85 && field353.length() > 0) {
                            field353 = field353.substring(0, field353.length() - 1);
                        }
                        if (Statics.field1344 == 84 || Statics.field1344 == 80) {
                            field343 = 1;
                        }
                        if (var18 && field353.length() < 320) {
                            field353 = field353 + Statics.field954;
                        }
                    } else if (field343 == 1) {
                        if (Statics.field1344 == 85 && field344.length() > 0) {
                            field344 = field344.substring(0, field344.length() - 1);
                        }
                        if (Statics.field1344 == 84 || Statics.field1344 == 80) {
                            field343 = 0;
                        }
                        if (Statics.field1344 == 84) {
                            field353 = field353.trim();
                            if (field353.length() == 0) {
                                Statics.method3157(class134.field2196, class134.field2211, class134.field2212);
                                return;
                            }
                            if (field344.length() == 0) {
                                Statics.method3157(class134.field2213, class134.field2299, class134.field2215);
                                return;
                            }
                            Statics.method3157(class134.field2303, class134.field2304, class134.field2199);
                            client.method2341(20);
                            return;
                        }
                        if (var18 && field344.length() < 20) {
                            field344 = field344 + Statics.field954;
                        }
                    }
                }
            }
        } else if (field331 == 3) {
            short var20 = 382;
            short var21 = 321;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                field331 = 0;
            }
        }
    }

    @ObfuscatedName("bw.i(Lgc;Lgc;I)V")
    public static void method1328(class183 arg0, class183 arg1) {
        if (field347) {
            method2936(arg0, arg1);
            return;
        }
        if (client.field699 == 0 || client.field699 == 5) {
            byte var2 = 20;
            arg0.method3438(class134.field2102, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1802(230, var3, 304, 34, 9179409);
            class89.method1802(231, var3 + 1, 302, 32, 0);
            class89.method1800(232, var3 + 2, field337 * 3, 30, 9179409);
            class89.method1800(field337 * 3 + 232, var3 + 2, 300 - field337 * 3, 30, 0);
            arg0.method3438(field324, 382, 276 - var2, 16777215, -1);
        }
        if (client.field699 == 20) {
            Statics.field333.method1780(382 - Statics.field333.field1517 / 2, 271 - Statics.field333.field1518 / 2);
            short var4 = 211;
            arg0.method3438(field340, 382, var4, 16776960, 0);
            int var54 = var4 + 15;
            arg0.method3438(field341, 382, var54, 16776960, 0);
            int var55 = var54 + 15;
            arg0.method3438(field342, 382, var55, 16776960, 0);
            int var56 = var55 + 15;
            int var57 = var56 + 10;
            arg0.method3442(class134.field2155, 272, var57, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field353; arg0.method3389(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3442(class185.method3392(var6), 312, var57, 16777215, 0);
            var54 = var57 + 15;
            arg0.method3442(class134.field2307 + class147.method838(field344), 274, var54, 16777215, 0);
            var54 += 15;
        }
        if (client.field699 == 10) {
            Statics.field333.method1780(202, 171);
            if (field331 == 0) {
                short var7 = 251;
                arg0.method3438(class134.field2318, 382, var7, 16776960, 0);
                int var58 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field407.method1780(var8 - 73, var9 - 20);
                arg0.method3454(class134.field2309, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field407.method1780(var10 - 73, var9 - 20);
                arg0.method3454(class134.field2310, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field331 == 2) {
                short var11 = 211;
                arg0.method3438(field340, 382, var11, 16776960, 0);
                int var59 = var11 + 15;
                arg0.method3438(field341, 382, var59, 16776960, 0);
                int var60 = var59 + 15;
                arg0.method3438(field342, 382, var60, 16776960, 0);
                int var61 = var60 + 15;
                int var62 = var61 + 10;
                arg0.method3442(class134.field2155, 272, var62, 16777215, 0);
                short var12 = 200;
                String var13;
                for (var13 = field353; arg0.method3389(var13) > var12; var13 = var13.substring(1)) {
                }
                arg0.method3442(class185.method3392(var13) + (field343 == 0 & client.field652 % 40 < 20 ? class2.method2042(16776960) + class2.field33 : ""), 312, var62, 16777215, 0);
                var59 = var62 + 15;
                arg0.method3442(class134.field2307 + class147.method838(field344) + (field343 == 1 & client.field652 % 40 < 20 ? class2.method2042(16776960) + class2.field33 : ""), 274, var59, 16777215, 0);
                var59 += 15;
                short var14 = 302;
                short var15 = 321;
                Statics.field407.method1780(var14 - 73, var15 - 20);
                arg0.method3438(class134.field2311, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                Statics.field407.method1780(var16 - 73, var15 - 20);
                arg0.method3438(class134.field2312, var16, var15 + 5, 16777215, 0);
            } else if (field331 == 3) {
                arg0.method3438(class134.field2313, 382, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3438(class134.field2314, 382, var17, 16777215, 0);
                int var63 = var17 + 15;
                arg0.method3438(class134.field2315, 382, var63, 16777215, 0);
                int var64 = var63 + 15;
                arg0.method3438(class134.field2316, 382, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method3438(class134.field2263, 382, var65, 16777215, 0);
                int var66 = var65 + 15;
                short var18 = 382;
                short var19 = 321;
                Statics.field407.method1780(var18 - 73, var19 - 20);
                arg0.method3438(class134.field2312, var18, var19 + 5, 16777215, 0);
            }
        }
        if (field335 > 0) {
            method2691(field335);
            field335 = 0;
        }
        short var20 = 256;
        if (field330 > 0) {
            for (int var21 = 0; var21 < 256; var21++) {
                if (field330 > 768) {
                    Statics.field2822[var21] = method2683(Statics.field257[var21], Statics.field128[var21], 1024 - field330);
                } else if (field330 > 256) {
                    Statics.field2822[var21] = Statics.field128[var21];
                } else {
                    Statics.field2822[var21] = method2683(Statics.field128[var21], Statics.field257[var21], 256 - field330);
                }
            }
        } else if (field355 > 0) {
            for (int var22 = 0; var22 < 256; var22++) {
                if (field355 > 768) {
                    Statics.field2822[var22] = method2683(Statics.field257[var22], Statics.field2097[var22], 1024 - field355);
                } else if (field355 > 256) {
                    Statics.field2822[var22] = Statics.field2097[var22];
                } else {
                    Statics.field2822[var22] = method2683(Statics.field2097[var22], Statics.field257[var22], 256 - field355);
                }
            }
        } else {
            for (int var23 = 0; var23 < 256; var23++) {
                Statics.field2822[var23] = Statics.field257[var23];
            }
        }
        class89.method1794(0, 9, 128, var20 + 7);
        Statics.field2478.method1727(0, 0);
        class89.method1838();
        int var24 = 0;
        int var25 = 6885;
        for (int var26 = 1; var26 < var20 - 1; var26++) {
            int var27 = (var20 - var26) * field329[var26] / var20;
            int var28 = var27 + 22;
            if (var28 < 0) {
                var28 = 0;
            }
            var24 += var28;
            for (int var29 = var28; var29 < 128; var29++) {
                int var30 = Statics.field85[var24++];
                if (var30 == 0) {
                    var25++;
                } else {
                    int var32 = 256 - var30;
                    int var33 = Statics.field2822[var30];
                    int var34 = Statics.field83.field1500[var25];
                    Statics.field83.field1500[var25++] = ((var33 & 0xFF00FF) * var30 + (var34 & 0xFF00FF) * var32 & 0xFF00FF00) + ((var33 & 0xFF00) * var30 + (var34 & 0xFF00) * var32 & 0xFF0000) >> 8;
                }
            }
            var25 += var28 + 765 - 128;
        }
        class89.method1794(637, 9, 765, var20 + 7);
        Statics.field339.method1727(382, 0);
        class89.method1838();
        int var35 = 0;
        int var36 = 7546;
        for (int var37 = 1; var37 < var20 - 1; var37++) {
            int var38 = (var20 - var37) * field329[var37] / var20;
            int var39 = 103 - var38;
            int var40 = var36 + var38;
            for (int var41 = 0; var41 < var39; var41++) {
                int var42 = Statics.field85[var35++];
                if (var42 == 0) {
                    var40++;
                } else {
                    int var44 = 256 - var42;
                    int var45 = Statics.field2822[var42];
                    int var46 = Statics.field83.field1500[var40];
                    Statics.field83.field1500[var40++] = ((var45 & 0xFF00) * var42 + (var46 & 0xFF00) * var44 & 0xFF0000) + ((var45 & 0xFF00FF) * var42 + (var46 & 0xFF00FF) * var44 & 0xFF00FF00) >> 8;
                }
            }
            var35 += 128 - var39;
            var36 = 765 - var39 - var38 + var40;
        }
        Statics.field352[field326 ? 1 : 0].method1780(725, 463);
        if (client.field699 > 5 && client.field702 == 0) {
            if (Statics.field2364 == null) {
                Statics.field2364 = class84.method2640(Statics.field1377, "sl_button", "");
            } else {
                byte var47 = 5;
                short var48 = 463;
                byte var49 = 100;
                byte var50 = 35;
                Statics.field2364.method1780(var47, var48);
                arg0.method3438(class134.field2244 + " " + client.field494, var49 / 2 + var47, var50 / 2 + var48 - 2, 16777215, 0);
                if (Statics.field1406 == null) {
                    arg1.method3438(class134.field2328, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                } else {
                    arg1.method3438(class134.field2327, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var51 = Statics.field775.getGraphics();
            Statics.field83.method1611(var51, 0, 0);
        } catch (Exception var53) {
            Statics.field775.repaint();
        }
    }

    @ObfuscatedName("er.y(Lci;B)V")
    public static final void method2955(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field893.length; var2++) {
            Statics.field893[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field893[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field332[var8] = (Statics.field893[var8 - 1] + Statics.field893[var8 + 1] + Statics.field893[var8 - 128] + Statics.field893[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field893;
            Statics.field893 = Statics.field332;
            Statics.field332 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1518; var11++) {
            for (int var12 = 0; var12 < arg0.field1517; var12++) {
                if (arg0.field1521[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1519;
                    int var14 = var11 + 16 + arg0.field1515;
                    int var15 = (var14 << 7) + var13;
                    Statics.field893[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ea.u(IB)V")
    public static final void method2691(int arg0) {
        short var1 = 256;
        field345 += arg0 * 128;
        if (field345 > Statics.field893.length) {
            field345 -= Statics.field893.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2955(Statics.field356[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field85[var3 + var4] - Statics.field893[field345 + var3 & Statics.field893.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field85[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field85[var9 + var10] = 255;
                } else {
                    Statics.field85[var9 + var10] = 0;
                }
            }
        }
        if (field330 > 0) {
            field330 -= arg0 * 4;
        }
        if (field355 > 0) {
            field355 -= arg0 * 4;
        }
        if (field330 == 0 && field355 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field330 = 1024;
            }
            if (var12 == 1) {
                field355 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field329[var13] = field329[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field329[var14] = (int) (Math.sin((double) field336 / 14.0D) * 16.0D + Math.sin((double) field336 / 15.0D) * 14.0D + Math.sin((double) field336 / 16.0D) * 12.0D);
            field336++;
        }
        field334 += arg0 * 1029530055;
        int var15 = ((client.field652 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field334 * 492190844; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field85[(var18 << 7) + var17] = 192;
        }
        field334 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field85[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field85[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field771[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field771[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field771[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field85[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("el.z(IIII)I")
    public static final int method2683(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ei.j(Lgc;Lgc;I)V")
    public static void method2936(class183 arg0, class183 arg1) {
        if (Statics.field348 == null) {
            Statics.field348 = class84.method40(Statics.field1377, "sl_back", "");
        }
        if (Statics.field1865 == null) {
            Statics.field1865 = class84.method628(Statics.field1377, "sl_flags", "");
        }
        if (Statics.field2031 == null) {
            Statics.field2031 = class84.method628(Statics.field1377, "sl_arrows", "");
        }
        if (Statics.field232 == null) {
            Statics.field232 = class84.method628(Statics.field1377, "sl_stars", "");
        }
        class89.method1800(0, 23, 765, 480, 0);
        class89.method1801(0, 0, 125, 23, 12425273, 9135624);
        class89.method1801(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3438(class134.field2323, 62, 15, 0, -1);
        if (Statics.field232 != null) {
            Statics.field232[1].method1780(140, 1);
            arg1.method3442(class134.field2206, 152, 10, 16777215, -1);
            Statics.field232[0].method1780(140, 12);
            arg1.method3442(class134.field2292, 152, 21, 16777215, -1);
        }
        if (Statics.field2031 != null) {
            short var2 = 280;
            if (field350[0] == 0 && field351[0] == 0) {
                Statics.field2031[2].method1780(var2, 4);
            } else {
                Statics.field2031[0].method1780(var2, 4);
            }
            if (field350[0] == 0 && field351[0] == 1) {
                Statics.field2031[3].method1780(var2 + 15, 4);
            } else {
                Statics.field2031[1].method1780(var2 + 15, 4);
            }
            arg0.method3442(class134.field2321, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field350[0] == 1 && field351[0] == 0) {
                Statics.field2031[2].method1780(var3, 4);
            } else {
                Statics.field2031[0].method1780(var3, 4);
            }
            if (field350[0] == 1 && field351[0] == 1) {
                Statics.field2031[3].method1780(var3 + 15, 4);
            } else {
                Statics.field2031[1].method1780(var3 + 15, 4);
            }
            arg0.method3442(class134.field2322, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field350[0] == 2 && field351[0] == 0) {
                Statics.field2031[2].method1780(var4, 4);
            } else {
                Statics.field2031[0].method1780(var4, 4);
            }
            if (field350[0] == 2 && field351[0] == 1) {
                Statics.field2031[3].method1780(var4 + 15, 4);
            } else {
                Statics.field2031[1].method1780(var4 + 15, 4);
            }
            arg0.method3442(class134.field2126, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field350[0] == 3 && field351[0] == 0) {
                Statics.field2031[2].method1780(var5, 4);
            } else {
                Statics.field2031[0].method1780(var5, 4);
            }
            if (field350[0] == 3 && field351[0] == 1) {
                Statics.field2031[3].method1780(var5 + 15, 4);
            } else {
                Statics.field2031[1].method1780(var5 + 15, 4);
            }
            arg0.method3442(class134.field2324, var5 + 32, 17, 16777215, -1);
        }
        class89.method1800(708, 4, 50, 16, 0);
        arg1.method3438(class134.field2312, 733, 16, 16777215, -1);
        field327 = -1;
        if (Statics.field348 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field349) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field349) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field349) {
                    var9--;
                }
            } while (var9 != var10 || var8 != var11);
            int var12 = (765 - var6 * var8) / (var8 + 1);
            if (var12 > 5) {
                var12 = 5;
            }
            int var13 = (480 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
            int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
            int var16 = var15 + 23;
            int var17 = var14;
            int var18 = 0;
            for (int var19 = 0; var19 < field349; var19++) {
                class13 var20 = Statics.field71[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field212);
                if (var20.field212 == -1) {
                    var22 = class134.field2319;
                    var21 = false;
                } else if (var20.field212 > 1980) {
                    var22 = class134.field2326;
                    var21 = false;
                }
                if (class77.field1419 >= var17 && class77.field1422 >= var16 && class77.field1419 < var6 + var17 && class77.field1422 < var7 + var16 && var21) {
                    field327 = var19;
                    Statics.field348[var20.field216 ? 1 : 0].method1700(var17, var16, 128, 16777215);
                } else {
                    Statics.field348[var20.field216 ? 1 : 0].method1727(var17, var16);
                }
                if (Statics.field1865 != null) {
                    Statics.field1865[(var20.field216 ? 8 : 0) + var20.field214].method1780(var17 + 29, var16);
                }
                arg0.method3438(Integer.toString(var20.field222), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3438(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var23 = Statics.field775.getGraphics();
            Statics.field83.method1611(var23, 0, 0);
        } catch (Exception var25) {
            Statics.field775.repaint();
        }
    }

    @ObfuscatedName("ed.h(Lba;I)V")
    public static void method2983(class73 arg0) {
        if (class77.field1439 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1428 >= var1 && class77.field1428 <= var1 + 14 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(0, 0);
            return;
        }
        if (class77.field1428 >= var1 + 15 && class77.field1428 <= var1 + 80 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1428 >= var2 && class77.field1428 <= var2 + 14 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(1, 0);
            return;
        }
        if (class77.field1428 >= var2 + 15 && class77.field1428 <= var2 + 80 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1428 >= var3 && class77.field1428 <= var3 + 14 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(2, 0);
            return;
        }
        if (class77.field1428 >= var3 + 15 && class77.field1428 <= var3 + 80 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1428 >= var4 && class77.field1428 <= var4 + 14 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(3, 0);
            return;
        }
        if (class77.field1428 >= var4 + 15 && class77.field1428 <= var4 + 80 && class77.field1429 >= 4 && class77.field1429 <= 18) {
            method703(3, 1);
            return;
        }
        if (class77.field1428 >= 708 && class77.field1429 >= 4 && class77.field1428 <= 758 && class77.field1429 <= 20) {
            field347 = false;
            Statics.field2478.method1727(0, 0);
            Statics.field339.method1727(382, 0);
            Statics.field1361.method1780(382 - Statics.field1361.field1517 / 2, 18);
            return;
        }
        if (field327 == -1) {
            return;
        }
        class13 var5 = Statics.field71[field327];
        if (client.field582 == var5.field216) {
            Statics.field371 = var5.field218;
            client.field494 = var5.field222;
            Statics.field886 = client.field495 == 0 ? 43594 : var5.field222 + 40000;
            Statics.field2479 = client.field495 == 0 ? 443 : var5.field222 + 50000;
            Statics.field282 = Statics.field886;
            field347 = false;
            Statics.field2478.method1727(0, 0);
            Statics.field339.method1727(382, 0);
            Statics.field1361.method1780(382 - Statics.field1361.field1517 / 2, 18);
            return;
        }
        String var6 = "";
        if (client.field495 != 0) {
            var6 = ":" + (var5.field222 + 7000);
        }
        String var7 = "http://" + var5.field218 + var6 + "/j" + client.field515;
        try {
            arg0.getAppletContext().showDocument(new URL(var7), "_self");
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("ac.x(B)V")
    public static void method851() {
        try {
            if (Statics.field1406 == null) {
                Statics.field1406 = new class24(Statics.field1405, new URL(Statics.field501));
            } else {
                byte[] var0 = Statics.field1406.method235();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field349 = var1.method2440();
                    Statics.field71 = new class13[field349];
                    int var2 = 0;
                    while (var2 < field349) {
                        class13 var3 = Statics.field71[var2] = new class13();
                        int var4 = var1.method2440();
                        var3.field222 = var4 & 0x7FFF;
                        var3.field216 = (var4 & 0x8000) != 0;
                        var3.field218 = var1.method2627();
                        var3.field214 = var1.method2438();
                        var3.field212 = var1.method2441();
                        var3.field220 = var2++;
                    }
                    method806(Statics.field71, 0, Statics.field71.length - 1, field350, field351);
                    field347 = true;
                    Statics.field1406 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1406 = null;
        }
    }

    @ObfuscatedName("aq.q(III)V")
    public static void method703(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field350[var5] != arg0) {
                var2[var4] = field350[var5];
                var3[var4] = field351[var5];
                var4++;
            }
        }
        field350 = var2;
        field351 = var3;
        method806(Statics.field71, 0, Statics.field71.length - 1, field350, field351);
    }

    @ObfuscatedName("as.w([Lx;II[I[II)V")
    public static void method806(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class13 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field220;
                        var12 = var8.field220;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field212;
                        var12 = var8.field212;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field216 ? 1 : 0;
                        var12 = var8.field216 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field222;
                        var12 = var8.field222;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field220;
                        var16 = var8.field220;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field212;
                        var16 = var8.field212;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field216 ? 1 : 0;
                        var16 = var8.field216 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field222;
                        var16 = var8.field222;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class13 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method806(arg0, arg1, var6, arg3, arg4);
        method806(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
