package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("y")
public class class21 {

    @ObfuscatedName("y.q")
    public static int[] field313 = new int[256];

    @ObfuscatedName("y.a")
    public static int field320 = 0;

    @ObfuscatedName("y.f")
    public static int field326 = 0;

    @ObfuscatedName("y.i")
    public static int field319 = 0;

    @ObfuscatedName("y.c")
    public static int field346 = 0;

    @ObfuscatedName("y.af")
    public static int field321 = 0;

    @ObfuscatedName("y.aq")
    public static int field322 = 0;

    @ObfuscatedName("y.at")
    public static int field323 = 10;

    @ObfuscatedName("y.aw")
    public static String field324 = "";

    @ObfuscatedName("y.ax")
    public static int field325 = 0;

    @ObfuscatedName("y.ak")
    public static String field341 = "";

    @ObfuscatedName("y.ar")
    public static String field334 = "";

    @ObfuscatedName("y.az")
    public static String field333 = "";

    @ObfuscatedName("y.ai")
    public static String field329 = "";

    @ObfuscatedName("y.aj")
    public static String field331 = "";

    @ObfuscatedName("y.ap")
    public static int field311 = 0;

    @ObfuscatedName("y.av")
    public static String field332 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("y.ae")
    public static boolean field316 = false;

    @ObfuscatedName("y.aa")
    public static int field335 = 0;

    @ObfuscatedName("y.bn")
    public static int[] field339 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("y.bl")
    public static int[] field337 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("y.ba")
    public static int field338 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.g(Ljava/awt/Component;Leu;Leu;I)V")
    public static void method225(Component arg0, class153 arg1, class153 arg2) {
        if (Statics.field330) {
            return;
        }
        class89.method1869();
        byte[] var3 = arg1.method3099("title.jpg", "");
        Statics.field2740 = new class86(var3, arg0);
        Statics.field396 = Statics.field2740.method1709();
        Statics.field62 = class84.method163(arg2, "logo", "");
        Statics.field309 = class84.method163(arg2, "titlebox", "");
        Statics.field310 = class84.method163(arg2, "titlebutton", "");
        Statics.field1996 = class84.method2353(arg2, "runes", "");
        Statics.field1986 = class84.method2353(arg2, "title_mute", "");
        Statics.field30 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field30[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field30[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field30[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field30[var7 + 192] = 16777215;
        }
        Statics.field314 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field314[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field314[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field314[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field314[var11 + 192] = 16777215;
        }
        Statics.field1657 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1657[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1657[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1657[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1657[var15 + 192] = 16777215;
        }
        Statics.field2839 = new int[256];
        Statics.field1626 = new int[32768];
        Statics.field1806 = new int[32768];
        method168((class87) null);
        Statics.field328 = new int[32768];
        Statics.field318 = new int[32768];
        field325 = 0;
        field329 = "";
        field331 = "";
        field316 = false;
        if (Statics.field78.field187) {
            class139.field2351 = 1;
            Statics.field2352 = null;
            Statics.field2349 = -1;
            Statics.field2354 = -1;
            Statics.field2355 = 0;
            Statics.field2356 = false;
            Statics.field2020 = 2;
        } else {
            class155 var16 = Statics.field2593;
            int var17 = var16.method3092("scape main");
            int var18 = var16.method3086(var17, "");
            class139.field2351 = 1;
            Statics.field2352 = var16;
            Statics.field2349 = var17;
            Statics.field2354 = var18;
            Statics.field2355 = 255;
            Statics.field2356 = false;
            Statics.field2020 = 2;
        }
        class154.method1419(false);
        Statics.field330 = true;
        Statics.field2740.method1718(0, 0);
        Statics.field396.method1718(382, 0);
        Statics.field62.method1819(382 - Statics.field62.field1471 / 2, 18);
    }

    @ObfuscatedName("cx.h(I)V")
    public static void method1669() {
        if (!Statics.field330) {
            return;
        }
        Statics.field309 = null;
        Statics.field310 = null;
        Statics.field1996 = null;
        Statics.field2740 = null;
        Statics.field396 = null;
        Statics.field62 = null;
        Statics.field1986 = null;
        Statics.field1736 = null;
        Statics.field376 = null;
        Statics.field315 = null;
        Statics.field1734 = null;
        Statics.field1781 = null;
        Statics.field30 = null;
        Statics.field314 = null;
        Statics.field1657 = null;
        Statics.field2839 = null;
        Statics.field1626 = null;
        Statics.field1806 = null;
        Statics.field328 = null;
        Statics.field318 = null;
        class139.field2351 = 1;
        Statics.field2352 = null;
        Statics.field2349 = -1;
        Statics.field2354 = -1;
        Statics.field2355 = 0;
        Statics.field2356 = false;
        Statics.field2020 = 2;
        class154.method1419(true);
        Statics.field330 = false;
    }

    @ObfuscatedName("r.s(Lbi;S)V")
    public static void method63(class73 arg0) {
        if (!field316) {
            if ((class77.field1369 == 1 || !Statics.field876 && class77.field1369 == 4) && class77.field1381 >= 715 && class77.field1382 >= 453) {
                Statics.field78.field187 = !Statics.field78.field187;
                class12.method3258();
                if (Statics.field78.field187) {
                    Statics.field2361.method2863();
                    class139.field2351 = 1;
                    Statics.field2352 = null;
                } else {
                    class155 var7 = Statics.field2593;
                    int var8 = var7.method3092("scape main");
                    int var9 = var7.method3086(var8, "");
                    class139.method3193(var7, var8, var9, 255, false);
                }
            }
            if (client.field492 != 5) {
                field321++;
                if (client.field492 == 10) {
                    if (client.field572 == 0) {
                        if (class77.field1369 == 1 || !Statics.field876 && class77.field1369 == 4) {
                            byte var10 = 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class77.field1381 >= var10 && class77.field1381 <= var10 + var12 && class77.field1382 >= var11 && class77.field1382 <= var11 + var13) {
                                method135();
                                return;
                            }
                        }
                        if (Statics.field1362 != null) {
                            method135();
                        }
                    }
                    int var14 = class77.field1369;
                    int var15 = class77.field1381;
                    int var16 = class77.field1382;
                    if (!Statics.field876 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field325 == 0) {
                        short var17 = 302;
                        short var18 = 291;
                        if (var14 == 1 && var15 >= var17 - 75 && var15 <= var17 + 75 && var16 >= var18 - 20 && var16 <= var18 + 20) {
                            field325 = 3;
                            field311 = 0;
                        }
                        short var19 = 462;
                        if (var14 == 1 && var15 >= var19 - 75 && var15 <= var19 + 75 && var16 >= var18 - 20 && var16 <= var18 + 20) {
                            if ((client.field484 & 0x4) != 0) {
                                if ((client.field484 & 0x400) == 0) {
                                    field341 = class135.field2295;
                                    field334 = class135.field2296;
                                    field333 = class135.field2297;
                                } else {
                                    field341 = class135.field2301;
                                    field334 = class135.field2302;
                                    field333 = class135.field2303;
                                }
                                field325 = 1;
                                field311 = 0;
                            } else if ((client.field484 & 0x400) == 0) {
                                field341 = class135.field2162;
                                field334 = class135.field2292;
                                field333 = class135.field2293;
                                field325 = 2;
                                field311 = 0;
                            } else {
                                field341 = class135.field2298;
                                field334 = class135.field2299;
                                field333 = class135.field2300;
                                field325 = 1;
                                field311 = 0;
                            }
                        }
                    } else if (field325 == 1) {
                        while (class75.method2260()) {
                            if (Statics.field171 == 84) {
                                field341 = class135.field2162;
                                field334 = class135.field2292;
                                field333 = class135.field2293;
                                field325 = 2;
                                field311 = 0;
                            } else if (Statics.field171 == 13) {
                                field325 = 0;
                            }
                        }
                        short var20 = 302;
                        short var21 = 321;
                        if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var21 - 20 && var16 <= var21 + 20) {
                            field341 = class135.field2162;
                            field334 = class135.field2292;
                            field333 = class135.field2293;
                            field325 = 2;
                            field311 = 0;
                        }
                        short var22 = 462;
                        if (var14 == 1 && var15 >= var22 - 75 && var15 <= var22 + 75 && var16 >= var21 - 20 && var16 <= var21 + 20) {
                            field325 = 0;
                        }
                    } else if (field325 == 2) {
                        short var23 = 231;
                        int var31 = var23 + 30;
                        if (var14 == 1 && var16 >= var31 - 15 && var16 < var31) {
                            field311 = 0;
                        }
                        var31 += 15;
                        if (var14 == 1 && var16 >= var31 - 15 && var16 < var31) {
                            field311 = 1;
                        }
                        var31 += 15;
                        short var24 = 302;
                        short var25 = 321;
                        if (var14 == 1 && var15 >= var24 - 75 && var15 <= var24 + 75 && var16 >= var25 - 20 && var16 <= var25 + 20) {
                            field329 = field329.trim();
                            if (field329.length() == 0) {
                                method2430(class135.field2224, class135.field2202, class135.field2256);
                                return;
                            }
                            if (field331.length() == 0) {
                                method2430(class135.field2204, class135.field2205, class135.field2206);
                                return;
                            }
                            method2430(class135.field2304, class135.field2258, class135.field2307);
                            client.method819(20);
                            return;
                        }
                        short var26 = 462;
                        if (var14 == 1 && var15 >= var26 - 75 && var15 <= var26 + 75 && var16 >= var25 - 20 && var16 <= var25 + 20) {
                            field325 = 0;
                            field329 = "";
                            field331 = "";
                        }
                        while (true) {
                            while (class75.method2260()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field332.length(); var28++) {
                                    if (Statics.field360 == field332.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field171 == 13) {
                                    field325 = 0;
                                    field329 = "";
                                    field331 = "";
                                } else if (field311 == 0) {
                                    if (Statics.field171 == 85 && field329.length() > 0) {
                                        field329 = field329.substring(0, field329.length() - 1);
                                    }
                                    if (Statics.field171 == 84 || Statics.field171 == 80) {
                                        field311 = 1;
                                    }
                                    if (var27 && field329.length() < 320) {
                                        field329 = field329 + Statics.field360;
                                    }
                                } else if (field311 == 1) {
                                    if (Statics.field171 == 85 && field331.length() > 0) {
                                        field331 = field331.substring(0, field331.length() - 1);
                                    }
                                    if (Statics.field171 == 84 || Statics.field171 == 80) {
                                        field311 = 0;
                                    }
                                    if (Statics.field171 == 84) {
                                        field329 = field329.trim();
                                        if (field329.length() == 0) {
                                            method2430(class135.field2224, class135.field2202, class135.field2256);
                                            return;
                                        }
                                        if (field331.length() == 0) {
                                            method2430(class135.field2204, class135.field2205, class135.field2206);
                                            return;
                                        }
                                        method2430(class135.field2304, class135.field2258, class135.field2307);
                                        client.method819(20);
                                        return;
                                    }
                                    if (var27 && field331.length() < 20) {
                                        field331 = field331 + Statics.field360;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field325 == 3) {
                        short var29 = 382;
                        short var30 = 321;
                        if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var30 - 20 && var16 <= var30 + 20) {
                            field325 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1369 == 1 || !Statics.field876 && class77.field1369 == 4) {
            short var1 = 280;
            if (class77.field1381 >= var1 && class77.field1381 <= var1 + 14 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                method918(0, 0);
            } else if (class77.field1381 >= var1 + 15 && class77.field1381 <= var1 + 80 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                method918(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1381 >= var2 && class77.field1381 <= var2 + 14 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                    method918(1, 0);
                } else if (class77.field1381 >= var2 + 15 && class77.field1381 <= var2 + 80 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                    method918(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1381 >= var3 && class77.field1381 <= var3 + 14 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                        method918(2, 0);
                    } else if (class77.field1381 >= var3 + 15 && class77.field1381 <= var3 + 80 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                        method918(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1381 >= var4 && class77.field1381 <= var4 + 14 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                            method918(3, 0);
                        } else if (class77.field1381 >= var4 + 15 && class77.field1381 <= var4 + 80 && class77.field1382 >= 4 && class77.field1382 <= 18) {
                            method918(3, 1);
                        } else if (class77.field1381 >= 708 && class77.field1382 >= 4 && class77.field1381 <= 758 && class77.field1382 <= 20) {
                            field316 = false;
                            Statics.field2740.method1718(0, 0);
                            Statics.field396.method1718(382, 0);
                            Statics.field62.method1819(382 - Statics.field62.field1471 / 2, 18);
                        } else if (field338 != -1) {
                            class13 var5 = Statics.field1301[field338];
                            if (var5.method139() != client.field489) {
                                client.field489 = var5.method139();
                                boolean var6 = var5.method139();
                                if (Statics.field983 != var6) {
                                    class40.method119();
                                    Statics.field983 = var6;
                                }
                            }
                            Statics.field59 = var5.field210;
                            client.field740 = var5.field207;
                            client.field484 = var5.field215;
                            Statics.field522 = client.field692 == 0 ? 43594 : var5.field207 + 40000;
                            Statics.field2406 = client.field692 == 0 ? 443 : var5.field207 + 50000;
                            Statics.field1364 = Statics.field522;
                            field316 = false;
                            Statics.field2740.method1718(0, 0);
                            Statics.field396.method1718(382, 0);
                            Statics.field62.method1819(382 - Statics.field62.field1471 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.o(Lgl;Lgl;I)V")
    public static void method186(class183 arg0, class183 arg1) {
        if (field316) {
            method1515(arg0, arg1);
            return;
        }
        if (client.field492 == 0 || client.field492 == 5) {
            byte var2 = 20;
            arg0.method3444(class135.field2272, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1832(230, var3, 304, 34, 9179409);
            class89.method1832(231, var3 + 1, 302, 32, 0);
            class89.method1830(232, var3 + 2, field323 * 3, 30, 9179409);
            class89.method1830(field323 * 3 + 232, var3 + 2, 300 - field323 * 3, 30, 0);
            arg0.method3444(field324, 382, 276 - var2, 16777215, -1);
        }
        if (client.field492 == 20) {
            Statics.field309.method1819(382 - Statics.field309.field1471 / 2, 271 - Statics.field309.field1470 / 2);
            short var4 = 211;
            arg0.method3444(field341, 382, var4, 16776960, 0);
            int var58 = var4 + 15;
            arg0.method3444(field334, 382, var58, 16776960, 0);
            int var59 = var58 + 15;
            arg0.method3444(field333, 382, var59, 16776960, 0);
            int var60 = var59 + 15;
            int var61 = var60 + 10;
            arg0.method3456(class135.field2148, 272, var61, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field329; arg0.method3462(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3456(class185.method3441(var6), 312, var61, 16777215, 0);
            var58 = var61 + 15;
            arg0.method3456(class135.field2308 + class148.method2083(field331), 274, var58, 16777215, 0);
            var58 += 15;
        }
        if (client.field492 == 10) {
            Statics.field309.method1819(202, 171);
            if (field325 == 0) {
                short var7 = 251;
                arg0.method3444(class135.field2309, 382, var7, 16776960, 0);
                int var62 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field310.method1819(var8 - 73, var9 - 20);
                arg0.method3445(class135.field2310, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field310.method1819(var10 - 73, var9 - 20);
                arg0.method3445(class135.field2167, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field325 == 1) {
                arg0.method3444(class135.field2254, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3444(field341, 382, var11, 16777215, 0);
                int var63 = var11 + 15;
                arg0.method3444(field334, 382, var63, 16777215, 0);
                int var64 = var63 + 15;
                arg0.method3444(field333, 382, var64, 16777215, 0);
                int var65 = var64 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field310.method1819(var12 - 73, var13 - 20);
                arg0.method3444(class135.field2263, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field310.method1819(var14 - 73, var13 - 20);
                arg0.method3444(class135.field2313, var14, var13 + 5, 16777215, 0);
            } else if (field325 == 2) {
                short var15 = 211;
                arg0.method3444(field341, 382, var15, 16776960, 0);
                int var66 = var15 + 15;
                arg0.method3444(field334, 382, var66, 16776960, 0);
                int var67 = var66 + 15;
                arg0.method3444(field333, 382, var67, 16776960, 0);
                int var68 = var67 + 15;
                int var69 = var68 + 10;
                arg0.method3456(class135.field2148, 272, var69, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field329; arg0.method3462(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3456(class185.method3441(var17) + (field311 == 0 & client.field496 % 40 < 20 ? class2.method1185(16776960) + class2.field20 : ""), 312, var69, 16777215, 0);
                var66 = var69 + 15;
                arg0.method3456(class135.field2308 + class148.method2083(field331) + (field311 == 1 & client.field496 % 40 < 20 ? class2.method1185(16776960) + class2.field20 : ""), 274, var66, 16777215, 0);
                var66 += 15;
                short var18 = 302;
                short var19 = 321;
                Statics.field310.method1819(var18 - 73, var19 - 20);
                arg0.method3444(class135.field2312, var18, var19 + 5, 16777215, 0);
                short var20 = 462;
                Statics.field310.method1819(var20 - 73, var19 - 20);
                arg0.method3444(class135.field2313, var20, var19 + 5, 16777215, 0);
            } else if (field325 == 3) {
                arg0.method3444(class135.field2314, 382, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3444(class135.field2315, 382, var21, 16777215, 0);
                int var70 = var21 + 15;
                arg0.method3444(class135.field2316, 382, var70, 16777215, 0);
                int var71 = var70 + 15;
                arg0.method3444(class135.field2317, 382, var71, 16777215, 0);
                int var72 = var71 + 15;
                arg0.method3444(class135.field2294, 382, var72, 16777215, 0);
                int var73 = var72 + 15;
                short var22 = 382;
                short var23 = 321;
                Statics.field310.method1819(var22 - 73, var23 - 20);
                arg0.method3444(class135.field2313, var22, var23 + 5, 16777215, 0);
            }
        }
        if (field321 > 0) {
            method2079(field321);
            field321 = 0;
        }
        short var24 = 256;
        if (field320 > 0) {
            for (int var25 = 0; var25 < 256; var25++) {
                if (field320 > 768) {
                    Statics.field2839[var25] = method147(Statics.field30[var25], Statics.field314[var25], 1024 - field320);
                } else if (field320 > 256) {
                    Statics.field2839[var25] = Statics.field314[var25];
                } else {
                    Statics.field2839[var25] = method147(Statics.field314[var25], Statics.field30[var25], 256 - field320);
                }
            }
        } else if (field326 > 0) {
            for (int var26 = 0; var26 < 256; var26++) {
                if (field326 > 768) {
                    Statics.field2839[var26] = method147(Statics.field30[var26], Statics.field1657[var26], 1024 - field326);
                } else if (field326 > 256) {
                    Statics.field2839[var26] = Statics.field1657[var26];
                } else {
                    Statics.field2839[var26] = method147(Statics.field1657[var26], Statics.field30[var26], 256 - field326);
                }
            }
        } else {
            for (int var27 = 0; var27 < 256; var27++) {
                Statics.field2839[var27] = Statics.field30[var27];
            }
        }
        class89.method1824(0, 9, 128, var24 + 7);
        Statics.field2740.method1718(0, 0);
        class89.method1823();
        int var28 = 0;
        int var29 = 6885;
        for (int var30 = 1; var30 < var24 - 1; var30++) {
            int var31 = (var24 - var30) * field313[var30] / var24;
            int var32 = var31 + 22;
            if (var32 < 0) {
                var32 = 0;
            }
            var28 += var32;
            for (int var33 = var32; var33 < 128; var33++) {
                int var34 = Statics.field328[var28++];
                if (var34 == 0) {
                    var29++;
                } else {
                    int var36 = 256 - var34;
                    int var37 = Statics.field2839[var34];
                    int var38 = Statics.field417.field1454[var29];
                    Statics.field417.field1454[var29++] = ((var37 & 0xFF00) * var34 + (var38 & 0xFF00) * var36 & 0xFF0000) + ((var37 & 0xFF00FF) * var34 + (var38 & 0xFF00FF) * var36 & 0xFF00FF00) >> 8;
                }
            }
            var29 += var32 + 765 - 128;
        }
        class89.method1824(637, 9, 765, var24 + 7);
        Statics.field396.method1718(382, 0);
        class89.method1823();
        int var39 = 0;
        int var40 = 7546;
        for (int var41 = 1; var41 < var24 - 1; var41++) {
            int var42 = (var24 - var41) * field313[var41] / var24;
            int var43 = 103 - var42;
            int var44 = var40 + var42;
            for (int var45 = 0; var45 < var43; var45++) {
                int var46 = Statics.field328[var39++];
                if (var46 == 0) {
                    var44++;
                } else {
                    int var48 = 256 - var46;
                    int var49 = Statics.field2839[var46];
                    int var50 = Statics.field417.field1454[var44];
                    Statics.field417.field1454[var44++] = ((var49 & 0xFF00FF) * var46 + (var50 & 0xFF00FF) * var48 & 0xFF00FF00) + ((var49 & 0xFF00) * var46 + (var50 & 0xFF00) * var48 & 0xFF0000) >> 8;
                }
            }
            var39 += 128 - var43;
            var40 = 765 - var43 - var42 + var44;
        }
        Statics.field1986[Statics.field78.field187 ? 1 : 0].method1819(725, 463);
        if (client.field492 > 5 && client.field572 == 0) {
            if (Statics.field1781 == null) {
                Statics.field1781 = class84.method163(Statics.field911, "sl_button", "");
            } else {
                byte var51 = 5;
                short var52 = 463;
                byte var53 = 100;
                byte var54 = 35;
                Statics.field1781.method1819(var51, var52);
                arg0.method3444(class135.field2245 + " " + client.field740, var53 / 2 + var51, var54 / 2 + var52 - 2, 16777215, 0);
                if (Statics.field1362 == null) {
                    arg1.method3444(class135.field2285, var53 / 2 + var51, var54 / 2 + var52 + 12, 16777215, 0);
                } else {
                    arg1.method3444(class135.field2199, var53 / 2 + var51, var54 / 2 + var52 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var55 = Statics.field2789.getGraphics();
            Statics.field417.method1643(var55, 0, 0);
        } catch (Exception var57) {
            Statics.field2789.repaint();
        }
    }

    @ObfuscatedName("db.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2430(String arg0, String arg1, String arg2) {
        field341 = arg0;
        field334 = arg1;
        field333 = arg2;
    }

    @ObfuscatedName("m.x(Lcv;I)V")
    public static final void method168(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1626.length; var2++) {
            Statics.field1626[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1626[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1806[var8] = (Statics.field1626[var8 - 1] + Statics.field1626[var8 + 1] + Statics.field1626[var8 - 128] + Statics.field1626[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1626;
            Statics.field1626 = Statics.field1806;
            Statics.field1806 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1470; var11++) {
            for (int var12 = 0; var12 < arg0.field1471; var12++) {
                if (arg0.field1474[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1469;
                    int var14 = var11 + 16 + arg0.field1472;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1626[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ce.k(IB)V")
    public static final void method2079(int arg0) {
        short var1 = 256;
        field319 += arg0 * 128;
        if (field319 > Statics.field1626.length) {
            field319 -= Statics.field1626.length;
            int var2 = (int) (Math.random() * 12.0D);
            method168(Statics.field1996[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field328[var3 + var4] - Statics.field1626[field319 + var3 & Statics.field1626.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field328[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field328[var9 + var10] = 255;
                } else {
                    Statics.field328[var9 + var10] = 0;
                }
            }
        }
        if (field320 > 0) {
            field320 -= arg0 * 4;
        }
        if (field326 > 0) {
            field326 -= arg0 * 4;
        }
        if (field320 == 0 && field326 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field320 = 1024;
            }
            if (var12 == 1) {
                field326 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field313[var13] = field313[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field313[var14] = (int) (Math.sin((double) field322 / 14.0D) * 16.0D + Math.sin((double) field322 / 15.0D) * 14.0D + Math.sin((double) field322 / 16.0D) * 12.0D);
            field322++;
        }
        field346 += arg0 * 981623023;
        int var15 = ((client.field496 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field346 * -1688175140; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field328[(var18 << 7) + var17] = 192;
        }
        field346 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field328[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field328[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field318[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field318[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field318[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field328[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("t.r(IIII)I")
    public static final int method147(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bf.z(Lgl;Lgl;B)V")
    public static void method1515(class183 arg0, class183 arg1) {
        if (Statics.field1736 == null) {
            Statics.field1736 = class84.method114(Statics.field911, "sl_back", "");
        }
        if (Statics.field376 == null) {
            Statics.field376 = class84.method2353(Statics.field911, "sl_flags", "");
        }
        if (Statics.field315 == null) {
            Statics.field315 = class84.method2353(Statics.field911, "sl_arrows", "");
        }
        if (Statics.field1734 == null) {
            Statics.field1734 = class84.method2353(Statics.field911, "sl_stars", "");
        }
        class89.method1830(0, 23, 765, 480, 0);
        class89.method1868(0, 0, 125, 23, 12425273, 9135624);
        class89.method1868(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3444(class135.field2319, 62, 15, 0, -1);
        if (Statics.field1734 != null) {
            Statics.field1734[1].method1819(140, 1);
            arg1.method3456(class135.field2105, 152, 10, 16777215, -1);
            Statics.field1734[0].method1819(140, 12);
            arg1.method3456(class135.field2156, 152, 21, 16777215, -1);
        }
        if (Statics.field315 != null) {
            short var2 = 280;
            if (field339[0] == 0 && field337[0] == 0) {
                Statics.field315[2].method1819(var2, 4);
            } else {
                Statics.field315[0].method1819(var2, 4);
            }
            if (field339[0] == 0 && field337[0] == 1) {
                Statics.field315[3].method1819(var2 + 15, 4);
            } else {
                Statics.field315[1].method1819(var2 + 15, 4);
            }
            arg0.method3456(class135.field2322, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field339[0] == 1 && field337[0] == 0) {
                Statics.field315[2].method1819(var3, 4);
            } else {
                Statics.field315[0].method1819(var3, 4);
            }
            if (field339[0] == 1 && field337[0] == 1) {
                Statics.field315[3].method1819(var3 + 15, 4);
            } else {
                Statics.field315[1].method1819(var3 + 15, 4);
            }
            arg0.method3456(class135.field2323, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field339[0] == 2 && field337[0] == 0) {
                Statics.field315[2].method1819(var4, 4);
            } else {
                Statics.field315[0].method1819(var4, 4);
            }
            if (field339[0] == 2 && field337[0] == 1) {
                Statics.field315[3].method1819(var4 + 15, 4);
            } else {
                Statics.field315[1].method1819(var4 + 15, 4);
            }
            arg0.method3456(class135.field2259, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field339[0] == 3 && field337[0] == 0) {
                Statics.field315[2].method1819(var5, 4);
            } else {
                Statics.field315[0].method1819(var5, 4);
            }
            if (field339[0] == 3 && field337[0] == 1) {
                Statics.field315[3].method1819(var5 + 15, 4);
            } else {
                Statics.field315[1].method1819(var5 + 15, 4);
            }
            arg0.method3456(class135.field2325, var5 + 32, 17, 16777215, -1);
        }
        class89.method1830(708, 4, 50, 16, 0);
        arg1.method3444(class135.field2313, 733, 16, 16777215, -1);
        field338 = -1;
        if (Statics.field1736 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field335) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field335) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field335) {
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
            boolean var19 = false;
            for (int var20 = 0; var20 < field335; var20++) {
                class13 var21 = Statics.field1301[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field220);
                if (var21.field220 == -1) {
                    var23 = class135.field2189;
                    var22 = false;
                } else if (var21.field220 > 1980) {
                    var23 = class135.field2155;
                    var22 = false;
                }
                byte var24;
                if (var21.method140()) {
                    if (var21.method139()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method139()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class77.field1374 >= var17 && class77.field1375 >= var16 && class77.field1374 < var6 + var17 && class77.field1375 < var7 + var16 && var22) {
                    field338 = var20;
                    Statics.field1736[var24].method1771(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1736[var24].method1718(var17, var16);
                }
                if (Statics.field376 != null) {
                    Statics.field376[(var21.method139() ? 8 : 0) + var21.field212].method1819(var17 + 29, var16);
                }
                arg0.method3444(Integer.toString(var21.field207), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3444(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3462(Statics.field1301[field338].field211) + 6;
                int var26 = arg1.field2847 + 8;
                class89.method1830(class77.field1374 - var25 / 2, class77.field1375 + 20 + 5, var25, var26, 16777120);
                class89.method1832(class77.field1374 - var25 / 2, class77.field1375 + 20 + 5, var25, var26, 0);
                arg1.method3444(Statics.field1301[field338].field211, class77.field1374, class77.field1375 + 20 + 5 + arg1.field2847 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2789.getGraphics();
            Statics.field417.method1643(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2789.repaint();
        }
    }

    @ObfuscatedName("b.n(I)V")
    public static void method135() {
        try {
            if (Statics.field1362 == null) {
                Statics.field1362 = new class24(Statics.field1295, new URL(Statics.field138));
            } else {
                byte[] var0 = Statics.field1362.method227();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field335 = var1.method2501();
                    Statics.field1301 = new class13[field335];
                    int var2 = 0;
                    while (var2 < field335) {
                        class13 var3 = Statics.field1301[var2] = new class13();
                        var3.field207 = var1.method2501();
                        var3.field215 = var1.method2548();
                        var3.field210 = var1.method2507();
                        var3.field211 = var1.method2507();
                        var3.field212 = var1.method2499();
                        var3.field220 = var1.method2511();
                        var3.field213 = var2++;
                    }
                    method116(Statics.field1301, 0, Statics.field1301.length - 1, field339, field337);
                    field316 = true;
                    Statics.field1362 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1362 = null;
        }
    }

    @ObfuscatedName("am.j(III)V")
    public static void method918(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field339[var5] != arg0) {
                var2[var4] = field339[var5];
                var3[var4] = field337[var5];
                var4++;
            }
        }
        field339 = var2;
        field337 = var3;
        method116(Statics.field1301, 0, Statics.field1301.length - 1, field339, field337);
    }

    @ObfuscatedName("j.b([Lt;II[I[IS)V")
    public static void method116(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field213;
                        var12 = var8.field213;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field220;
                        var12 = var8.field220;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method139() ? 1 : 0;
                        var12 = var8.method139() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field207;
                        var12 = var8.field207;
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
                        var15 = arg0[var5].field213;
                        var16 = var8.field213;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field220;
                        var16 = var8.field220;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method139() ? 1 : 0;
                        var16 = var8.method139() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field207;
                        var16 = var8.field207;
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
        method116(arg0, arg1, var6, arg3, arg4);
        method116(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
