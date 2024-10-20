package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("i")
public class class21 {

    @ObfuscatedName("i.e")
    public static int[] field319 = new int[256];

    @ObfuscatedName("i.u")
    public static int field317 = 0;

    @ObfuscatedName("i.d")
    public static int field302 = 0;

    @ObfuscatedName("i.t")
    public static int field309 = 0;

    @ObfuscatedName("i.x")
    public static int field310 = 0;

    @ObfuscatedName("i.ar")
    public static int field311 = 0;

    @ObfuscatedName("i.au")
    public static int field312 = 0;

    @ObfuscatedName("i.an")
    public static int field318 = 10;

    @ObfuscatedName("i.ad")
    public static String field308 = "";

    @ObfuscatedName("i.at")
    public static int field315 = 0;

    @ObfuscatedName("i.ay")
    public static String field316 = "";

    @ObfuscatedName("i.ac")
    public static String field306 = "";

    @ObfuscatedName("i.av")
    public static String field335 = "";

    @ObfuscatedName("i.ae")
    public static String field314 = "";

    @ObfuscatedName("i.ah")
    public static String field320 = "";

    @ObfuscatedName("i.aq")
    public static int field330 = 0;

    @ObfuscatedName("i.ax")
    public static String field322 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("i.af")
    public static boolean field323 = false;

    @ObfuscatedName("i.al")
    public static int field327 = 0;

    @ObfuscatedName("i.bi")
    public static int[] field328 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("i.bd")
    public static int[] field329 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("i.bb")
    public static int field307 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.l(Lem;Lem;I)I")
    public static int method158(class154 arg0, class154 arg1) {
        int var2 = 0;
        if (arg0.method3047("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3047("logo", "")) {
            var2++;
        }
        if (arg1.method3047("titlebox", "")) {
            var2++;
        }
        if (arg1.method3047("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3047("runes", "")) {
            var2++;
        }
        if (arg1.method3047("title_mute", "")) {
            var2++;
        }
        arg1.method3047("sl_back", "");
        arg1.method3047("sl_flags", "");
        arg1.method3047("sl_arrows", "");
        arg1.method3047("sl_stars", "");
        arg1.method3047("sl_button", "");
        return var2;
    }

    @ObfuscatedName("g.b(Ljava/awt/Component;Lem;Lem;I)V")
    public static void method50(Component arg0, class154 arg1, class154 arg2) {
        if (Statics.field304) {
            return;
        }
        class89.method1780();
        byte[] var3 = arg1.method3046("title.jpg", "");
        Statics.field300 = new class86(var3, arg0);
        Statics.field301 = Statics.field300.method1720();
        Statics.field243 = class84.method168(arg2, "logo", "");
        Statics.field297 = class84.method168(arg2, "titlebox", "");
        Statics.field298 = class84.method168(arg2, "titlebutton", "");
        Statics.field299 = class84.method1561(arg2, "runes", "");
        Statics.field102 = class84.method1561(arg2, "title_mute", "");
        Statics.field331 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field331[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field331[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field331[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field331[var7 + 192] = 16777215;
        }
        Statics.field1433 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1433[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1433[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field1433[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field1433[var11 + 192] = 16777215;
        }
        Statics.field2808 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field2808[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field2808[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field2808[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field2808[var15 + 192] = 16777215;
        }
        Statics.field2048 = new int[256];
        Statics.field2333 = new int[32768];
        Statics.field1763 = new int[32768];
        method3131((class87) null);
        Statics.field2420 = new int[32768];
        Statics.field339 = new int[32768];
        field315 = 0;
        field314 = "";
        field320 = "";
        field323 = false;
        if (Statics.field2592.field182) {
            class140.method2363(2);
        } else {
            class156 var16 = Statics.field544;
            int var17 = var16.method3062("scape main");
            int var18 = var16.method3044(var17, "");
            class140.field2352 = 1;
            Statics.field2353 = var16;
            Statics.field2355 = var17;
            Statics.field2358 = var18;
            Statics.field2356 = 255;
            Statics.field2334 = false;
            Statics.field2357 = 2;
        }
        class155.method49(false);
        Statics.field304 = true;
        Statics.field300.method1686(0, 0);
        Statics.field301.method1686(382, 0);
        Statics.field243.method1765(382 - Statics.field243.field1473 / 2, 18);
    }

    @ObfuscatedName("o.o(I)V")
    public static void method18() {
        if (!Statics.field304) {
            return;
        }
        Statics.field297 = null;
        Statics.field298 = null;
        Statics.field299 = null;
        Statics.field300 = null;
        Statics.field301 = null;
        Statics.field243 = null;
        Statics.field102 = null;
        Statics.field324 = null;
        Statics.field313 = null;
        Statics.field326 = null;
        Statics.field1198 = null;
        Statics.field351 = null;
        Statics.field331 = null;
        Statics.field1433 = null;
        Statics.field2808 = null;
        Statics.field2048 = null;
        Statics.field2333 = null;
        Statics.field1763 = null;
        Statics.field2420 = null;
        Statics.field339 = null;
        class140.method2363(2);
        class155.method49(true);
        Statics.field304 = false;
    }

    @ObfuscatedName("r.w(Lbf;I)V")
    public static void method34(class73 arg0) {
        if (field323) {
            method2421(arg0);
            return;
        }
        if ((class77.field1384 == 1 || !Statics.field249 && class77.field1384 == 4) && class77.field1372 >= 715 && class77.field1376 >= 453) {
            Statics.field2592.field182 = !Statics.field2592.field182;
            class29 var1 = null;
            try {
                var1 = class82.method1563("", Statics.field2747.field2078, true);
                class127 var2 = Statics.field2592.method120();
                var1.method564(var2.field2024, 0, var2.field2022);
            } catch (Exception var30) {
            }
            try {
                if (var1 != null) {
                    var1.method578();
                }
            } catch (Exception var29) {
            }
            if (Statics.field2592.field182) {
                class140.method805();
            } else {
                class156 var5 = Statics.field544;
                int var6 = var5.method3062("scape main");
                int var7 = var5.method3044(var6, "");
                class140.method2313(var5, var6, var7, 255, false);
            }
        }
        if (client.field481 == 5) {
            return;
        }
        field311++;
        if (client.field481 != 10) {
            return;
        }
        if (client.field503 == 0) {
            if (class77.field1384 == 1 || !Statics.field249 && class77.field1384 == 4) {
                byte var8 = 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class77.field1372 >= var8 && class77.field1372 <= var8 + var10 && class77.field1376 >= var9 && class77.field1376 <= var9 + var11) {
                    method149();
                    return;
                }
            }
            if (Statics.field1326 != null) {
                method149();
            }
        }
        int var12 = class77.field1384;
        int var13 = class77.field1372;
        int var14 = class77.field1376;
        if (!Statics.field249 && var12 == 4) {
            var12 = 1;
        }
        if (field315 == 0) {
            short var15 = 302;
            short var16 = 291;
            if (var12 == 1 && var13 >= var15 - 75 && var13 <= var15 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                field315 = 3;
                field330 = 0;
            }
            short var17 = 462;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                if ((client.field602 & 0x4) != 0) {
                    if ((client.field602 & 0x400) == 0) {
                        field316 = class136.field2294;
                        field306 = class136.field2295;
                        field335 = class136.field2328;
                    } else {
                        field316 = class136.field2300;
                        field306 = class136.field2134;
                        field335 = class136.field2302;
                    }
                    field315 = 1;
                    field330 = 0;
                } else if ((client.field602 & 0x400) == 0) {
                    field316 = class136.field2290;
                    field306 = class136.field2291;
                    field335 = class136.field2292;
                    field315 = 2;
                    field330 = 0;
                } else {
                    field316 = class136.field2297;
                    field306 = class136.field2327;
                    field335 = class136.field2299;
                    field315 = 1;
                    field330 = 0;
                }
            }
        } else if (field315 == 1) {
            while (class75.method36()) {
                if (Statics.field1971 == 84) {
                    field316 = class136.field2290;
                    field306 = class136.field2291;
                    field335 = class136.field2292;
                    field315 = 2;
                    field330 = 0;
                } else if (Statics.field1971 == 13) {
                    field315 = 0;
                }
            }
            short var18 = 302;
            short var19 = 321;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var19 - 20 && var14 <= var19 + 20) {
                field316 = class136.field2290;
                field306 = class136.field2291;
                field335 = class136.field2292;
                field315 = 2;
                field330 = 0;
            }
            short var20 = 462;
            if (var12 == 1 && var13 >= var20 - 75 && var13 <= var20 + 75 && var14 >= var19 - 20 && var14 <= var19 + 20) {
                field315 = 0;
            }
        } else if (field315 == 2) {
            short var21 = 231;
            int var31 = var21 + 30;
            if (var12 == 1 && var14 >= var31 - 15 && var14 < var31) {
                field330 = 0;
            }
            var31 += 15;
            if (var12 == 1 && var14 >= var31 - 15 && var14 < var31) {
                field330 = 1;
            }
            var31 += 15;
            short var22 = 302;
            short var23 = 321;
            if (var12 == 1 && var13 >= var22 - 75 && var13 <= var22 + 75 && var14 >= var23 - 20 && var14 <= var23 + 20) {
                field314 = field314.trim();
                if (field314.length() == 0) {
                    method112(class136.field2202, class136.field2282, class136.field2172);
                    return;
                }
                if (field320.length() == 0) {
                    method112(class136.field2212, class136.field2195, class136.field2284);
                    return;
                }
                method112(class136.field2293, class136.field2304, class136.field2237);
                client.method10(20);
                return;
            }
            short var24 = 462;
            if (var12 == 1 && var13 >= var24 - 75 && var13 <= var24 + 75 && var14 >= var23 - 20 && var14 <= var23 + 20) {
                field315 = 0;
                field314 = "";
                field320 = "";
            }
            while (true) {
                while (class75.method36()) {
                    boolean var25 = false;
                    for (int var26 = 0; var26 < field322.length(); var26++) {
                        if (Statics.field1796 == field322.charAt(var26)) {
                            var25 = true;
                            break;
                        }
                    }
                    if (Statics.field1971 == 13) {
                        field315 = 0;
                        field314 = "";
                        field320 = "";
                    } else if (field330 == 0) {
                        if (Statics.field1971 == 85 && field314.length() > 0) {
                            field314 = field314.substring(0, field314.length() - 1);
                        }
                        if (Statics.field1971 == 84 || Statics.field1971 == 80) {
                            field330 = 1;
                        }
                        if (var25 && field314.length() < 320) {
                            field314 = field314 + Statics.field1796;
                        }
                    } else if (field330 == 1) {
                        if (Statics.field1971 == 85 && field320.length() > 0) {
                            field320 = field320.substring(0, field320.length() - 1);
                        }
                        if (Statics.field1971 == 84 || Statics.field1971 == 80) {
                            field330 = 0;
                        }
                        if (Statics.field1971 == 84) {
                            field314 = field314.trim();
                            if (field314.length() == 0) {
                                method112(class136.field2202, class136.field2282, class136.field2172);
                                return;
                            }
                            if (field320.length() == 0) {
                                method112(class136.field2212, class136.field2195, class136.field2284);
                                return;
                            }
                            method112(class136.field2293, class136.field2304, class136.field2237);
                            client.method10(20);
                            return;
                        }
                        if (var25 && field320.length() < 20) {
                            field320 = field320 + Statics.field1796;
                        }
                    }
                }
                return;
            }
        } else if (field315 == 3) {
            short var27 = 382;
            short var28 = 321;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var28 - 20 && var14 <= var28 + 20) {
                field315 = 0;
            }
        }
    }

    @ObfuscatedName("dw.r(Lgv;Lgv;B)V")
    public static void method2181(class184 arg0, class184 arg1) {
        if (field323) {
            method19(arg0, arg1);
            return;
        }
        if (client.field481 == 0 || client.field481 == 5) {
            byte var2 = 20;
            arg0.method3397(class136.field2289, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1784(230, var3, 304, 34, 9179409);
            class89.method1784(231, var3 + 1, 302, 32, 0);
            class89.method1782(232, var3 + 2, field318 * 3, 30, 9179409);
            class89.method1782(field318 * 3 + 232, var3 + 2, 300 - field318 * 3, 30, 0);
            arg0.method3397(field308, 382, 276 - var2, 16777215, -1);
        }
        if (client.field481 == 20) {
            Statics.field297.method1765(382 - Statics.field297.field1473 / 2, 271 - Statics.field297.field1472 / 2);
            short var4 = 211;
            arg0.method3397(field316, 382, var4, 16776960, 0);
            int var66 = var4 + 15;
            arg0.method3397(field306, 382, var66, 16776960, 0);
            int var67 = var66 + 15;
            arg0.method3397(field335, 382, var67, 16776960, 0);
            int var68 = var67 + 15;
            int var69 = var68 + 10;
            arg0.method3467(class136.field2218, 272, var69, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field314; arg0.method3390(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3467(class186.method3446(var6), 312, var69, 16777215, 0);
            var66 = var69 + 15;
            String var8 = class136.field2307;
            String var9 = field320;
            String var10 = class149.method2726('*', var9.length());
            arg0.method3467(var8 + var10, 274, var66, 16777215, 0);
            var66 += 15;
        }
        if (client.field481 == 10) {
            Statics.field297.method1765(202, 171);
            if (field315 == 0) {
                short var11 = 251;
                arg0.method3397(class136.field2092, 382, var11, 16776960, 0);
                int var70 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field298.method1765(var12 - 73, var13 - 20);
                arg0.method3398(class136.field2169, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field298.method1765(var14 - 73, var13 - 20);
                arg0.method3398(class136.field2100, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field315 == 1) {
                arg0.method3397(class136.field2305, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3397(field316, 382, var15, 16777215, 0);
                int var71 = var15 + 15;
                arg0.method3397(field306, 382, var71, 16777215, 0);
                int var72 = var71 + 15;
                arg0.method3397(field335, 382, var72, 16777215, 0);
                int var73 = var72 + 15;
                short var16 = 302;
                short var17 = 321;
                Statics.field298.method1765(var16 - 73, var17 - 20);
                arg0.method3397(class136.field2096, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                Statics.field298.method1765(var18 - 73, var17 - 20);
                arg0.method3397(class136.field2264, var18, var17 + 5, 16777215, 0);
            } else if (field315 == 2) {
                short var19 = 211;
                arg0.method3397(field316, 382, var19, 16776960, 0);
                int var74 = var19 + 15;
                arg0.method3397(field306, 382, var74, 16776960, 0);
                int var75 = var74 + 15;
                arg0.method3397(field335, 382, var75, 16776960, 0);
                int var76 = var75 + 15;
                int var77 = var76 + 10;
                arg0.method3467(class136.field2218, 272, var77, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = field314; arg0.method3390(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3467(class186.method3446(var21) + (field330 == 0 & client.field723 % 40 < 20 ? class2.method2414(16776960) + class2.field23 : ""), 312, var77, 16777215, 0);
                var74 = var77 + 15;
                String var23 = class136.field2307;
                String var24 = field320;
                String var25 = class149.method2726('*', var24.length());
                arg0.method3467(var23 + var25 + (field330 == 1 & client.field723 % 40 < 20 ? class2.method2414(16776960) + class2.field23 : ""), 274, var74, 16777215, 0);
                var74 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field298.method1765(var26 - 73, var27 - 20);
                arg0.method3397(class136.field2249, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field298.method1765(var28 - 73, var27 - 20);
                arg0.method3397(class136.field2264, var28, var27 + 5, 16777215, 0);
            } else if (field315 == 3) {
                arg0.method3397(class136.field2313, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3397(class136.field2314, 382, var29, 16777215, 0);
                int var78 = var29 + 15;
                arg0.method3397(class136.field2118, 382, var78, 16777215, 0);
                int var79 = var78 + 15;
                arg0.method3397(class136.field2131, 382, var79, 16777215, 0);
                int var80 = var79 + 15;
                arg0.method3397(class136.field2317, 382, var80, 16777215, 0);
                int var81 = var80 + 15;
                short var30 = 382;
                short var31 = 321;
                Statics.field298.method1765(var30 - 73, var31 - 20);
                arg0.method3397(class136.field2264, var30, var31 + 5, 16777215, 0);
            }
        }
        if (field311 > 0) {
            int var32 = field311;
            short var33 = 256;
            field309 += var32 * 128;
            if (field309 > Statics.field2333.length) {
                field309 -= Statics.field2333.length;
                int var34 = (int) (Math.random() * 12.0D);
                method3131(Statics.field299[var34]);
            }
            int var35 = 0;
            int var36 = var32 * 128;
            int var37 = (var33 - var32) * 128;
            for (int var38 = 0; var38 < var37; var38++) {
                int var39 = Statics.field2420[var35 + var36] - Statics.field2333[field309 + var35 & Statics.field2333.length - 1] * var32 / 6;
                if (var39 < 0) {
                    var39 = 0;
                }
                Statics.field2420[var35++] = var39;
            }
            for (int var40 = var33 - var32; var40 < var33; var40++) {
                int var41 = var40 * 128;
                for (int var42 = 0; var42 < 128; var42++) {
                    int var43 = (int) (Math.random() * 100.0D);
                    if (var43 < 50 && var42 > 10 && var42 < 118) {
                        Statics.field2420[var41 + var42] = 255;
                    } else {
                        Statics.field2420[var41 + var42] = 0;
                    }
                }
            }
            if (field317 > 0) {
                field317 -= var32 * 4;
            }
            if (field302 > 0) {
                field302 -= var32 * 4;
            }
            if (field317 == 0 && field302 == 0) {
                int var44 = (int) (Math.random() * (double) (2000 / var32));
                if (var44 == 0) {
                    field317 = 1024;
                }
                if (var44 == 1) {
                    field302 = 1024;
                }
            }
            for (int var45 = 0; var45 < var33 - var32; var45++) {
                field319[var45] = field319[var32 + var45];
            }
            for (int var46 = var33 - var32; var46 < var33; var46++) {
                field319[var46] = (int) (Math.sin((double) field312 / 14.0D) * 16.0D + Math.sin((double) field312 / 15.0D) * 14.0D + Math.sin((double) field312 / 16.0D) * 12.0D);
                field312++;
            }
            field310 += var32 * -746327389;
            int var47 = ((client.field723 & 0x1) + var32) / 2;
            if (var47 > 0) {
                for (int var48 = 0; var48 < field310 * 781428812; var48++) {
                    int var49 = (int) (Math.random() * 124.0D) + 2;
                    int var50 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2420[(var50 << 7) + var49] = 192;
                }
                field310 = 0;
                int var51 = 0;
                label195: while (true) {
                    if (var51 >= var33) {
                        int var55 = 0;
                        while (true) {
                            if (var55 >= 128) {
                                break label195;
                            }
                            int var56 = 0;
                            for (int var57 = -var47; var57 < var33; var57++) {
                                int var58 = var57 * 128;
                                if (var47 + var57 < var33) {
                                    var56 += Statics.field339[var47 * 128 + var55 + var58];
                                }
                                if (var57 - (var47 + 1) >= 0) {
                                    var56 -= Statics.field339[var55 + var58 - (var47 + 1) * 128];
                                }
                                if (var57 >= 0) {
                                    Statics.field2420[var55 + var58] = var56 / (var47 * 2 + 1);
                                }
                            }
                            var55++;
                        }
                    }
                    int var52 = 0;
                    int var53 = var51 * 128;
                    for (int var54 = -var47; var54 < 128; var54++) {
                        if (var47 + var54 < 128) {
                            var52 += Statics.field2420[var53 + var54 + var47];
                        }
                        if (var54 - (var47 + 1) >= 0) {
                            var52 -= Statics.field2420[var53 + var54 - (var47 + 1)];
                        }
                        if (var54 >= 0) {
                            Statics.field339[var53 + var54] = var52 / (var47 * 2 + 1);
                        }
                    }
                    var51++;
                }
            }
            field311 = 0;
        }
        method172();
        Statics.field102[Statics.field2592.field182 ? 1 : 0].method1765(725, 463);
        if (client.field481 > 5 && client.field503 == 0) {
            if (Statics.field351 == null) {
                Statics.field351 = class84.method168(Statics.field1998, "sl_button", "");
            } else {
                byte var59 = 5;
                short var60 = 463;
                byte var61 = 100;
                byte var62 = 35;
                Statics.field351.method1765(var59, var60);
                arg0.method3397(class136.field2244 + " " + client.field474, var61 / 2 + var59, var62 / 2 + var60 - 2, 16777215, 0);
                if (Statics.field1326 == null) {
                    arg1.method3397(class136.field2201, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                } else {
                    arg1.method3397(class136.field2120, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var63 = Statics.field1984.getGraphics();
            Statics.field79.method1605(var63, 0, 0);
        } catch (Exception var65) {
            Statics.field1984.repaint();
        }
    }

    @ObfuscatedName("j.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method112(String arg0, String arg1, String arg2) {
        field316 = arg0;
        field306 = arg1;
        field335 = arg2;
    }

    @ObfuscatedName("fn.z(Lcv;I)V")
    public static final void method3131(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2333.length; var2++) {
            Statics.field2333[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2333[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1763[var8] = (Statics.field2333[var8 - 1] + Statics.field2333[var8 + 1] + Statics.field2333[var8 - 128] + Statics.field2333[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2333;
            Statics.field2333 = Statics.field1763;
            Statics.field1763 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1472; var11++) {
            for (int var12 = 0; var12 < arg0.field1473; var12++) {
                if (arg0.field1475[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1474;
                    int var14 = var11 + 16 + arg0.field1469;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2333[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ek.g(IIIB)I")
    public static final int method2988(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("d.n(I)V")
    public static final void method172() {
        short var0 = 256;
        if (field317 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field317 > 768) {
                    Statics.field2048[var1] = method2988(Statics.field331[var1], Statics.field1433[var1], 1024 - field317);
                } else if (field317 > 256) {
                    Statics.field2048[var1] = Statics.field1433[var1];
                } else {
                    Statics.field2048[var1] = method2988(Statics.field1433[var1], Statics.field331[var1], 256 - field317);
                }
            }
        } else if (field302 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field302 > 768) {
                    Statics.field2048[var2] = method2988(Statics.field331[var2], Statics.field2808[var2], 1024 - field302);
                } else if (field302 > 256) {
                    Statics.field2048[var2] = Statics.field2808[var2];
                } else {
                    Statics.field2048[var2] = method2988(Statics.field2808[var2], Statics.field331[var2], 256 - field302);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2048[var3] = Statics.field331[var3];
            }
        }
        class89.method1776(0, 9, 128, var0 + 7);
        Statics.field300.method1686(0, 0);
        class89.method1795();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field319[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2420[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2048[var10];
                    int var14 = Statics.field79.field1455[var5];
                    Statics.field79.field1455[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1776(637, 9, 765, var0 + 7);
        Statics.field301.method1686(382, 0);
        class89.method1795();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field319[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2420[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2048[var22];
                    int var26 = Statics.field79.field1455[var20];
                    Statics.field79.field1455[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("o.j(Lgv;Lgv;I)V")
    public static void method19(class184 arg0, class184 arg1) {
        if (Statics.field324 == null) {
            Statics.field324 = class84.method3386(Statics.field1998, "sl_back", "");
        }
        if (Statics.field313 == null) {
            Statics.field313 = class84.method1561(Statics.field1998, "sl_flags", "");
        }
        if (Statics.field326 == null) {
            Statics.field326 = class84.method1561(Statics.field1998, "sl_arrows", "");
        }
        if (Statics.field1198 == null) {
            Statics.field1198 = class84.method1561(Statics.field1998, "sl_stars", "");
        }
        class89.method1782(0, 23, 765, 480, 0);
        class89.method1783(0, 0, 125, 23, 12425273, 9135624);
        class89.method1783(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3397(class136.field2318, 62, 15, 0, -1);
        if (Statics.field1198 != null) {
            Statics.field1198[1].method1765(140, 1);
            arg1.method3467(class136.field2319, 152, 10, 16777215, -1);
            Statics.field1198[0].method1765(140, 12);
            arg1.method3467(class136.field2320, 152, 21, 16777215, -1);
        }
        if (Statics.field326 != null) {
            short var2 = 280;
            if (field328[0] == 0 && field329[0] == 0) {
                Statics.field326[2].method1765(var2, 4);
            } else {
                Statics.field326[0].method1765(var2, 4);
            }
            if (field328[0] == 0 && field329[0] == 1) {
                Statics.field326[3].method1765(var2 + 15, 4);
            } else {
                Statics.field326[1].method1765(var2 + 15, 4);
            }
            arg0.method3467(class136.field2271, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field328[0] == 1 && field329[0] == 0) {
                Statics.field326[2].method1765(var3, 4);
            } else {
                Statics.field326[0].method1765(var3, 4);
            }
            if (field328[0] == 1 && field329[0] == 1) {
                Statics.field326[3].method1765(var3 + 15, 4);
            } else {
                Statics.field326[1].method1765(var3 + 15, 4);
            }
            arg0.method3467(class136.field2322, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field328[0] == 2 && field329[0] == 0) {
                Statics.field326[2].method1765(var4, 4);
            } else {
                Statics.field326[0].method1765(var4, 4);
            }
            if (field328[0] == 2 && field329[0] == 1) {
                Statics.field326[3].method1765(var4 + 15, 4);
            } else {
                Statics.field326[1].method1765(var4 + 15, 4);
            }
            arg0.method3467(class136.field2323, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field328[0] == 3 && field329[0] == 0) {
                Statics.field326[2].method1765(var5, 4);
            } else {
                Statics.field326[0].method1765(var5, 4);
            }
            if (field328[0] == 3 && field329[0] == 1) {
                Statics.field326[3].method1765(var5 + 15, 4);
            } else {
                Statics.field326[1].method1765(var5 + 15, 4);
            }
            arg0.method3467(class136.field2136, var5 + 32, 17, 16777215, -1);
        }
        class89.method1782(708, 4, 50, 16, 0);
        arg1.method3397(class136.field2264, 733, 16, 16777215, -1);
        field307 = -1;
        if (Statics.field324 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field327) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field327) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field327) {
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
            for (int var20 = 0; var20 < field327; var20++) {
                class13 var21 = Statics.field1012[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field198);
                if (var21.field198 == -1) {
                    var23 = class136.field2325;
                    var22 = false;
                } else if (var21.field198 > 1980) {
                    var23 = class136.field2326;
                    var22 = false;
                }
                byte var24;
                if (var21.method129()) {
                    if (var21.method130()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method130()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class77.field1378 >= var17 && class77.field1379 * -1108917615 >= var16 && class77.field1378 < var6 + var17 && class77.field1379 * -1108917615 < var7 + var16 && var22) {
                    field307 = var20;
                    Statics.field324[var24].method1692(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field324[var24].method1686(var17, var16);
                }
                if (Statics.field313 != null) {
                    Statics.field313[(var21.method130() ? 8 : 0) + var21.field190].method1765(var17 + 29, var16);
                }
                arg0.method3397(Integer.toString(var21.field187), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3397(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3390(Statics.field1012[field307].field185) + 6;
                int var26 = arg1.field2858 + 8;
                class89.method1782(class77.field1378 - var25 / 2, class77.field1379 * -1108917615 + 20 + 5, var25, var26, 16777120);
                class89.method1784(class77.field1378 - var25 / 2, class77.field1379 * -1108917615 + 20 + 5, var25, var26, 0);
                arg1.method3397(Statics.field1012[field307].field185, class77.field1378, class77.field1379 * -1108917615 + 20 + 5 + arg1.field2858 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1984.getGraphics();
            Statics.field79.method1605(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1984.repaint();
        }
    }

    @ObfuscatedName("dz.c(Lbf;I)V")
    public static void method2421(class73 arg0) {
        if (class77.field1384 != 1 && Statics.field249 || class77.field1384 != 4) {
            return;
        }
        short var1 = 280;
        if (class77.field1372 >= var1 && class77.field1372 <= var1 + 14 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(0, 0);
            return;
        }
        if (class77.field1372 >= var1 + 15 && class77.field1372 <= var1 + 80 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1372 >= var2 && class77.field1372 <= var2 + 14 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(1, 0);
            return;
        }
        if (class77.field1372 >= var2 + 15 && class77.field1372 <= var2 + 80 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1372 >= var3 && class77.field1372 <= var3 + 14 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(2, 0);
            return;
        }
        if (class77.field1372 >= var3 + 15 && class77.field1372 <= var3 + 80 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1372 >= var4 && class77.field1372 <= var4 + 14 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(3, 0);
            return;
        }
        if (class77.field1372 >= var4 + 15 && class77.field1372 <= var4 + 80 && class77.field1376 >= 4 && class77.field1376 <= 18) {
            method30(3, 1);
            return;
        }
        if (class77.field1372 >= 708 && class77.field1376 >= 4 && class77.field1372 <= 758 && class77.field1376 <= 20) {
            field323 = false;
            Statics.field300.method1686(0, 0);
            Statics.field301.method1686(382, 0);
            Statics.field243.method1765(382 - Statics.field243.field1473 / 2, 18);
            return;
        }
        if (field307 == -1) {
            return;
        }
        class13 var5 = Statics.field1012[field307];
        method155(var5);
        field323 = false;
        Statics.field300.method1686(0, 0);
        Statics.field301.method1686(382, 0);
        Statics.field243.method1765(382 - Statics.field243.field1473 / 2, 18);
        return;
    }

    @ObfuscatedName("v.m(La;B)V")
    public static void method155(class13 arg0) {
        if (arg0.method130() != client.field478) {
            client.field478 = arg0.method130();
            boolean var1 = arg0.method130();
            if (Statics.field971 != var1) {
                Statics.method222();
                Statics.field971 = var1;
            }
        }
        Statics.field1733 = arg0.field188;
        client.field474 = arg0.field187;
        client.field602 = arg0.field186;
        Statics.field1983 = client.field477 == 0 ? 43594 : arg0.field187 + 40000;
        Statics.field290 = client.field477 == 0 ? 443 : arg0.field187 + 50000;
        Statics.field2887 = Statics.field1983;
    }

    @ObfuscatedName("y.a(I)V")
    public static void method149() {
        try {
            if (Statics.field1326 == null) {
                Statics.field1326 = new class24(Statics.field1172, new URL(Statics.field1774));
            } else {
                byte[] var0 = Statics.field1326.method228();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field327 = var1.method2442();
                    Statics.field1012 = new class13[field327];
                    int var2 = 0;
                    while (var2 < field327) {
                        class13 var3 = Statics.field1012[var2] = new class13();
                        var3.field187 = var1.method2442();
                        var3.field186 = var1.method2586();
                        var3.field188 = var1.method2471();
                        var3.field185 = var1.method2471();
                        var3.field190 = var1.method2440();
                        var3.field198 = var1.method2606();
                        var3.field191 = var2++;
                    }
                    method1396(Statics.field1012, 0, Statics.field1012.length - 1, field328, field329);
                    field323 = true;
                    Statics.field1326 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1326 = null;
        }
    }

    @ObfuscatedName("r.e(III)V")
    public static void method30(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field328[var5] != arg0) {
                var2[var4] = field328[var5];
                var3[var4] = field329[var5];
                var4++;
            }
        }
        field328 = var2;
        field329 = var3;
        method1396(Statics.field1012, 0, Statics.field1012.length - 1, field328, field329);
    }

    @ObfuscatedName("bo.q([La;II[I[IB)V")
    public static void method1396(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field191;
                        var12 = var8.field191;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field198;
                        var12 = var8.field198;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method130() ? 1 : 0;
                        var12 = var8.method130() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field187;
                        var12 = var8.field187;
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
                        var15 = arg0[var5].field191;
                        var16 = var8.field191;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field198;
                        var16 = var8.field198;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method130() ? 1 : 0;
                        var16 = var8.method130() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field187;
                        var16 = var8.field187;
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
        method1396(arg0, arg1, var6, arg3, arg4);
        method1396(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
