package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("b")
public class class20 {

    @ObfuscatedName("b.g")
    public static boolean field287 = false;

    @ObfuscatedName("b.m")
    public static int[] field293 = new int[256];

    @ObfuscatedName("b.b")
    public static int field296 = 0;

    @ObfuscatedName("b.p")
    public static int field297 = 0;

    @ObfuscatedName("b.h")
    public static int field298 = 0;

    @ObfuscatedName("b.az")
    public static int field314 = 0;

    @ObfuscatedName("b.ao")
    public static int field300 = 0;

    @ObfuscatedName("b.au")
    public static int field294 = 0;

    @ObfuscatedName("b.aw")
    public static int field302 = 10;

    @ObfuscatedName("b.ad")
    public static String field303 = "";

    @ObfuscatedName("b.av")
    public static int field304 = 0;

    @ObfuscatedName("b.am")
    public static String field301 = "";

    @ObfuscatedName("b.an")
    public static String field306 = "";

    @ObfuscatedName("b.ac")
    public static String field319 = "";

    @ObfuscatedName("b.at")
    public static String field308 = "";

    @ObfuscatedName("b.ax")
    public static String field320 = "";

    @ObfuscatedName("b.aj")
    public static int field310 = 0;

    @ObfuscatedName("b.ai")
    public static String field311 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("b.ag")
    public static boolean field307 = false;

    @ObfuscatedName("b.al")
    public static int field309 = 0;

    @ObfuscatedName("b.bz")
    public static int[] field316 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("b.ba")
    public static int[] field305 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("b.br")
    public static int field318 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.j(Leh;Leh;I)I")
    public static int method162(class150 arg0, class150 arg1) {
        int var2 = 0;
        if (arg0.method2921("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2921("logo", "")) {
            var2++;
        }
        if (arg1.method2921("titlebox", "")) {
            var2++;
        }
        if (arg1.method2921("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2921("runes", "")) {
            var2++;
        }
        if (arg1.method2921("title_mute", "")) {
            var2++;
        }
        arg1.method2921("sl_back", "");
        arg1.method2921("sl_flags", "");
        arg1.method2921("sl_arrows", "");
        arg1.method2921("sl_stars", "");
        arg1.method2921("sl_button", "");
        return var2;
    }

    @ObfuscatedName("m.y(I)I")
    public static int method131() {
        return 6;
    }

    @ObfuscatedName("r.x(Ljava/awt/Component;Leh;Leh;I)V")
    public static void method142(Component arg0, class150 arg1, class150 arg2) {
        if (Statics.field321) {
            return;
        }
        class88.method1759();
        byte[] var3 = arg1.method2904("title.jpg", "");
        Statics.field289 = new class85(var3, arg0);
        Statics.field1438 = Statics.field289.method1643();
        Statics.field1249 = class83.method1608(arg2, "logo", "");
        Statics.field286 = class83.method1608(arg2, "titlebox", "");
        Statics.field312 = class83.method1608(arg2, "titlebutton", "");
        Statics.field250 = class83.method1381(arg2, "runes", "");
        Statics.field735 = class83.method1381(arg2, "title_mute", "");
        Statics.field295 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field295[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field295[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field295[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field295[var7 + 192] = 16777215;
        }
        Statics.field366 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field366[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field366[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field366[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field366[var11 + 192] = 16777215;
        }
        Statics.field1917 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1917[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1917[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1917[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1917[var15 + 192] = 16777215;
        }
        Statics.field317 = new int[256];
        Statics.field1241 = new int[32768];
        Statics.field209 = new int[32768];
        method782((class86) null);
        Statics.field1432 = new int[32768];
        Statics.field894 = new int[32768];
        field304 = 0;
        field308 = "";
        field320 = "";
        field307 = false;
        if (client.field691 == 0) {
            field287 = true;
        } else {
            field287 = false;
        }
        if (field287) {
            class137.method1825(2);
        } else {
            class137.method1161(2, Statics.field488, "scape main", "", 255, false);
        }
        class151.method2632(false);
        Statics.field321 = true;
        Statics.field289.method1710(0, 0);
        Statics.field1438.method1710(382, 0);
        Statics.field1249.method1738(382 - Statics.field1249.field1466 / 2, 18);
    }

    @ObfuscatedName("v.c(Lbc;S)V")
    public static void method121(class72 arg0) {
        if (!field307) {
            if (class76.field1384 == 1 && class76.field1386 >= 715 && class76.field1383 >= 453) {
                field287 = !field287;
                if (field287) {
                    Statics.method50();
                } else {
                    class137.method152(Statics.field488, "scape main", "", 255, false);
                }
            }
            if (client.field464 != 5) {
                field300++;
                if (client.field464 == 10) {
                    if (client.field700 == 0) {
                        if (class76.field1384 == 1) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class76.field1386 >= var9 && class76.field1386 <= var9 + var11 && class76.field1383 >= var10 && class76.field1383 <= var10 + var12) {
                                method762();
                                return;
                            }
                        }
                        if (Statics.field1599 != null) {
                            method762();
                        }
                    }
                    int var13 = class76.field1384;
                    int var14 = class76.field1386;
                    int var15 = class76.field1383;
                    if (field304 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field304 = 3;
                            field310 = 0;
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field301 = class133.field2265;
                            field306 = class133.field2135;
                            field319 = class133.field2263;
                            field304 = 2;
                            field310 = 0;
                        }
                    } else if (field304 == 2) {
                        short var19 = 231;
                        int var28 = var19 + 30;
                        if (var13 == 1 && var15 >= var28 - 15 && var15 < var28) {
                            field310 = 0;
                        }
                        var28 += 15;
                        if (var13 == 1 && var15 >= var28 - 15 && var15 < var28) {
                            field310 = 1;
                        }
                        var28 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field308 = field308.trim();
                            if (field308.length() == 0) {
                                method2883(class133.field2171, class133.field2172, class133.field2173);
                                return;
                            }
                            if (field320.length() == 0) {
                                method2883(class133.field2174, class133.field2175, class133.field2176);
                                return;
                            }
                            method2883(class133.field2220, class133.field2278, class133.field2092);
                            client.method242(20);
                            return;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field304 = 0;
                            field308 = "";
                            field320 = "";
                        }
                        while (true) {
                            while (class74.method504()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field311.length(); var24++) {
                                    if (Statics.field1957 == field311.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (field310 == 0) {
                                    if (Statics.field2319 == 85 && field308.length() > 0) {
                                        field308 = field308.substring(0, field308.length() - 1);
                                    }
                                    if (Statics.field2319 == 84 || Statics.field2319 == 80) {
                                        field310 = 1;
                                    }
                                    if (var23 && field308.length() < 320) {
                                        field308 = field308 + Statics.field1957;
                                    }
                                } else if (field310 == 1) {
                                    if (Statics.field2319 == 85 && field320.length() > 0) {
                                        field320 = field320.substring(0, field320.length() - 1);
                                    }
                                    if (Statics.field2319 == 84 || Statics.field2319 == 80) {
                                        field310 = 0;
                                    }
                                    if (client.field459 == 2 && Statics.field2319 == 84) {
                                        field308 = field308.trim();
                                        if (field308.length() == 0) {
                                            method2883(class133.field2171, class133.field2172, class133.field2173);
                                            return;
                                        }
                                        if (field320.length() == 0) {
                                            method2883(class133.field2174, class133.field2175, class133.field2176);
                                            return;
                                        }
                                        method2883(class133.field2220, class133.field2278, class133.field2092);
                                        client.method242(20);
                                        return;
                                    }
                                    if (var23 && field320.length() < 20) {
                                        field320 = field320 + Statics.field1957;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field304 == 3) {
                        short var25 = 382;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field304 = 0;
                        }
                    }
                }
            }
        } else if (class76.field1384 == 1) {
            short var1 = 280;
            if (class76.field1386 >= var1 && class76.field1386 <= var1 + 14 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                Statics.method129(0, 0);
            } else if (class76.field1386 >= var1 + 15 && class76.field1386 <= var1 + 80 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                Statics.method129(0, 1);
            } else {
                short var2 = 390;
                if (class76.field1386 >= var2 && class76.field1386 <= var2 + 14 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                    Statics.method129(1, 0);
                } else if (class76.field1386 >= var2 + 15 && class76.field1386 <= var2 + 80 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                    Statics.method129(1, 1);
                } else {
                    short var3 = 500;
                    if (class76.field1386 >= var3 && class76.field1386 <= var3 + 14 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                        Statics.method129(2, 0);
                    } else if (class76.field1386 >= var3 + 15 && class76.field1386 <= var3 + 80 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                        Statics.method129(2, 1);
                    } else {
                        short var4 = 610;
                        if (class76.field1386 >= var4 && class76.field1386 <= var4 + 14 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                            Statics.method129(3, 0);
                        } else if (class76.field1386 >= var4 + 15 && class76.field1386 <= var4 + 80 && class76.field1383 >= 4 && class76.field1383 <= 18) {
                            Statics.method129(3, 1);
                        } else if (class76.field1386 >= 708 && class76.field1383 >= 4 && class76.field1386 <= 758 && class76.field1383 <= 20) {
                            field307 = false;
                            Statics.field289.method1710(0, 0);
                            Statics.field1438.method1710(382, 0);
                            Statics.field1249.method1738(382 - Statics.field1249.field1466 / 2, 18);
                        } else if (field318 != -1) {
                            class12 var5 = Statics.field1367[field318];
                            if (client.field624 == var5.field186) {
                                Statics.field142 = var5.field193;
                                client.field714 = var5.field181;
                                Statics.field2298 = client.field459 == 0 ? 43594 : var5.field181 + 40000;
                                Statics.field1002 = client.field459 == 0 ? 443 : var5.field181 + 50000;
                                Statics.field2041 = Statics.field2298;
                                field307 = false;
                                Statics.field289.method1710(0, 0);
                                Statics.field1438.method1710(382, 0);
                                Statics.field1249.method1738(382 - Statics.field1249.field1466 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field459 != 0) {
                                    var6 = ":" + (var5.field181 + 7000);
                                }
                                String var7 = "http://" + var5.field193 + var6 + "/j" + client.field463;
                                try {
                                    arg0.getAppletContext().showDocument(new URL(var7), "_self");
                                } catch (Exception var27) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.e(Lfd;Lfd;I)V")
    public static void method2300(class181 arg0, class181 arg1) {
        if (!field307) {
            if (client.field464 == 0 || client.field464 == 5) {
                byte var25 = 20;
                arg0.method3324(class133.field2068, 382, 245 - var25, 16777215, -1);
                int var26 = 253 - var25;
                class88.method1755(230, var26, 304, 34, 9179409);
                class88.method1755(231, var26 + 1, 302, 32, 0);
                class88.method1776(232, var26 + 2, field302 * 3, 30, 9179409);
                class88.method1776(field302 * 3 + 232, var26 + 2, 300 - field302 * 3, 30, 0);
                arg0.method3324(field303, 382, 276 - var25, 16777215, -1);
            }
            if (client.field464 == 20) {
                Statics.field286.method1738(382 - Statics.field286.field1466 / 2, 271 - Statics.field286.field1467 / 2);
                short var27 = 211;
                arg0.method3324(field301, 382, var27, 16776960, 0);
                int var67 = var27 + 15;
                arg0.method3324(field306, 382, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method3324(field319, 382, var68, 16776960, 0);
                int var69 = var68 + 15;
                int var70 = var69 + 10;
                arg0.method3322(class133.field2267, 272, var70, 16777215, 0);
                short var28 = 200;
                String var29;
                for (var29 = field308; arg0.method3349(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
                }
                arg0.method3322(class183.method3321(var29), 312, var70, 16777215, 0);
                var67 = var70 + 15;
                String var31 = class133.field2268;
                String var32 = field320;
                int var33 = var32.length();
                char[] var34 = new char[var33];
                for (int var35 = 0; var35 < var33; var35++) {
                    var34[var35] = '*';
                }
                String var36 = new String(var34);
                arg0.method3322(var31 + var36, 274, var67, 16777215, 0);
                var67 += 15;
            }
            if (client.field464 == 10) {
                Statics.field286.method1738(202, 171);
                if (field304 == 0) {
                    short var38 = 251;
                    arg0.method3324(class133.field2104, 382, var38, 16776960, 0);
                    int var71 = var38 + 30;
                    short var39 = 302;
                    short var40 = 291;
                    Statics.field312.method1738(var39 - 73, var40 - 20);
                    arg0.method3325(class133.field2270, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var41 = 462;
                    Statics.field312.method1738(var41 - 73, var40 - 20);
                    arg0.method3325(class133.field2271, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field304 == 2) {
                    short var42 = 211;
                    arg0.method3324(field301, 382, var42, 16776960, 0);
                    int var72 = var42 + 15;
                    arg0.method3324(field306, 382, var72, 16776960, 0);
                    int var73 = var72 + 15;
                    arg0.method3324(field319, 382, var73, 16776960, 0);
                    int var74 = var73 + 15;
                    int var75 = var74 + 10;
                    arg0.method3322(class133.field2267, 272, var75, 16777215, 0);
                    short var43 = 200;
                    String var44;
                    for (var44 = field308; arg0.method3349(var44) > var43; var44 = var44.substring(1)) {
                    }
                    arg0.method3322(class183.method3321(var44) + (field310 == 0 & client.field636 % 40 < 20 ? class2.method1507(16776960) + class2.field19 : ""), 312, var75, 16777215, 0);
                    var72 = var75 + 15;
                    String var46 = class133.field2268;
                    String var47 = field320;
                    int var48 = var47.length();
                    char[] var49 = new char[var48];
                    for (int var50 = 0; var50 < var48; var50++) {
                        var49[var50] = '*';
                    }
                    String var51 = new String(var49);
                    arg0.method3322(var46 + var51 + (field310 == 1 & client.field636 % 40 < 20 ? class2.method1507(16776960) + class2.field19 : ""), 274, var72, 16777215, 0);
                    var72 += 15;
                    short var53 = 302;
                    short var54 = 321;
                    Statics.field312.method1738(var53 - 73, var54 - 20);
                    arg0.method3324(class133.field2272, var53, var54 + 5, 16777215, 0);
                    short var55 = 462;
                    Statics.field312.method1738(var55 - 73, var54 - 20);
                    arg0.method3324(class133.field2105, var55, var54 + 5, 16777215, 0);
                } else if (field304 == 3) {
                    arg0.method3324(class133.field2071, 382, 211, 16776960, 0);
                    short var56 = 236;
                    arg0.method3324(class133.field2275, 382, var56, 16777215, 0);
                    int var76 = var56 + 15;
                    arg0.method3324(class133.field2276, 382, var76, 16777215, 0);
                    int var77 = var76 + 15;
                    arg0.method3324(class133.field2266, 382, var77, 16777215, 0);
                    int var78 = var77 + 15;
                    arg0.method3324(class133.field2191, 382, var78, 16777215, 0);
                    int var79 = var78 + 15;
                    short var57 = 382;
                    short var58 = 321;
                    Statics.field312.method1738(var57 - 73, var58 - 20);
                    arg0.method3324(class133.field2105, var57, var58 + 5, 16777215, 0);
                }
            }
            if (field300 > 0) {
                method2628(field300);
                field300 = 0;
            }
            method139();
            Statics.field735[field287 ? 1 : 0].method1738(725, 463);
            if (client.field464 > 5 && client.field700 == 0) {
                if (Statics.field348 == null) {
                    Statics.field348 = class83.method1608(Statics.field1000, "sl_button", "");
                } else {
                    byte var59 = 5;
                    short var60 = 463;
                    byte var61 = 100;
                    byte var62 = 35;
                    Statics.field348.method1738(var59, var60);
                    arg0.method3324(class133.field2215 + " " + client.field714, var61 / 2 + var59, var62 / 2 + var60 - 2, 16777215, 0);
                    if (Statics.field1599 == null) {
                        arg1.method3324(class133.field2289, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    } else {
                        arg1.method3324(class133.field2288, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var63 = Statics.field1997.getGraphics();
                Statics.field1532.method1584(var63, 0, 0);
            } catch (Exception var66) {
                Statics.field1997.repaint();
            }
            return;
        }
        if (Statics.field1434 == null) {
            Statics.field1434 = class83.method134(Statics.field1000, "sl_back", "");
        }
        if (Statics.field87 == null) {
            Statics.field87 = class83.method1381(Statics.field1000, "sl_flags", "");
        }
        if (Statics.field790 == null) {
            Statics.field790 = class83.method1381(Statics.field1000, "sl_arrows", "");
        }
        if (Statics.field313 == null) {
            Statics.field313 = class83.method1381(Statics.field1000, "sl_stars", "");
        }
        class88.method1776(0, 23, 765, 480, 0);
        class88.method1754(0, 0, 125, 23, 12425273, 9135624);
        class88.method1754(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3324(class133.field2279, 62, 15, 0, -1);
        if (Statics.field313 != null) {
            Statics.field313[1].method1738(140, 1);
            arg1.method3322(class133.field2231, 152, 10, 16777215, -1);
            Statics.field313[0].method1738(140, 12);
            arg1.method3322(class133.field2281, 152, 21, 16777215, -1);
        }
        if (Statics.field790 != null) {
            short var2 = 280;
            if (field316[0] == 0 && field305[0] == 0) {
                Statics.field790[2].method1738(var2, 4);
            } else {
                Statics.field790[0].method1738(var2, 4);
            }
            if (field316[0] == 0 && field305[0] == 1) {
                Statics.field790[3].method1738(var2 + 15, 4);
            } else {
                Statics.field790[1].method1738(var2 + 15, 4);
            }
            arg0.method3322(class133.field2282, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field316[0] == 1 && field305[0] == 0) {
                Statics.field790[2].method1738(var3, 4);
            } else {
                Statics.field790[0].method1738(var3, 4);
            }
            if (field316[0] == 1 && field305[0] == 1) {
                Statics.field790[3].method1738(var3 + 15, 4);
            } else {
                Statics.field790[1].method1738(var3 + 15, 4);
            }
            arg0.method3322(class133.field2164, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field316[0] == 2 && field305[0] == 0) {
                Statics.field790[2].method1738(var4, 4);
            } else {
                Statics.field790[0].method1738(var4, 4);
            }
            if (field316[0] == 2 && field305[0] == 1) {
                Statics.field790[3].method1738(var4 + 15, 4);
            } else {
                Statics.field790[1].method1738(var4 + 15, 4);
            }
            arg0.method3322(class133.field2284, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field316[0] == 3 && field305[0] == 0) {
                Statics.field790[2].method1738(var5, 4);
            } else {
                Statics.field790[0].method1738(var5, 4);
            }
            if (field316[0] == 3 && field305[0] == 1) {
                Statics.field790[3].method1738(var5 + 15, 4);
            } else {
                Statics.field790[1].method1738(var5 + 15, 4);
            }
            arg0.method3322(class133.field2113, var5 + 32, 17, 16777215, -1);
        }
        class88.method1776(708, 4, 50, 16, 0);
        arg1.method3324(class133.field2105, 733, 16, 16777215, -1);
        field318 = -1;
        if (Statics.field1434 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field309) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field309) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field309) {
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
            for (int var19 = 0; var19 < field309; var19++) {
                class12 var20 = Statics.field1367[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field182);
                if (var20.field182 == -1) {
                    var22 = class133.field2062;
                    var21 = false;
                } else if (var20.field182 > 1980) {
                    var22 = class133.field2262;
                    var21 = false;
                }
                if (class76.field1378 >= var17 && class76.field1379 >= var16 && class76.field1378 < var6 + var17 && class76.field1379 < var7 + var16 && var21) {
                    field318 = var19;
                    Statics.field1434[var20.field186 ? 1 : 0].method1660(var17, var16, 128, 16777215);
                } else {
                    Statics.field1434[var20.field186 ? 1 : 0].method1710(var17, var16);
                }
                if (Statics.field87 != null) {
                    Statics.field87[var20.field190 + (var20.field186 ? 8 : 0)].method1738(var17 + 29, var16);
                }
                arg0.method3324(Integer.toString(var20.field181), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3324(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
            Graphics var23 = Statics.field1997.getGraphics();
            Statics.field1532.method1584(var23, 0, 0);
        } catch (Exception var65) {
            Statics.field1997.repaint();
        }
    }

    @ObfuscatedName("es.s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2883(String arg0, String arg1, String arg2) {
        field301 = arg0;
        field306 = arg1;
        field319 = arg2;
    }

    @ObfuscatedName("at.i(Lcb;I)V")
    public static final void method782(class86 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1241.length; var2++) {
            Statics.field1241[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1241[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field209[var8] = (Statics.field1241[var8 - 1] + Statics.field1241[var8 + 1] + Statics.field1241[var8 - 128] + Statics.field1241[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1241;
            Statics.field1241 = Statics.field209;
            Statics.field209 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1467; var11++) {
            for (int var12 = 0; var12 < arg0.field1466; var12++) {
                if (arg0.field1465[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1464;
                    int var14 = var11 + 16 + arg0.field1469;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1241[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ej.g(II)V")
    public static final void method2628(int arg0) {
        short var1 = 256;
        field298 += arg0 * 128;
        if (field298 > Statics.field1241.length) {
            field298 -= Statics.field1241.length;
            int var2 = (int) (Math.random() * 12.0D);
            method782(Statics.field250[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1432[var3 + var4] - Statics.field1241[field298 + var3 & Statics.field1241.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1432[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1432[var9 + var10] = 255;
                } else {
                    Statics.field1432[var9 + var10] = 0;
                }
            }
        }
        if (field296 > 0) {
            field296 -= arg0 * 4;
        }
        if (field297 > 0) {
            field297 -= arg0 * 4;
        }
        if (field296 == 0 && field297 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field296 = 1024;
            }
            if (var12 == 1) {
                field297 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field293[var13] = field293[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field293[var14] = (int) (Math.sin((double) field294 / 14.0D) * 16.0D + Math.sin((double) field294 / 15.0D) * 14.0D + Math.sin((double) field294 / 16.0D) * 12.0D);
            field294++;
        }
        field314 += arg0 * -2144591743;
        int var15 = ((client.field636 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field314 * -1898164636; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1432[(var18 << 7) + var17] = 192;
        }
        field314 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1432[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1432[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field894[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field894[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field894[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1432[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("k.q(IIIB)I")
    public static final int method118(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("r.w(I)V")
    public static final void method139() {
        short var0 = 256;
        if (field296 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field296 > 768) {
                    Statics.field317[var1] = method118(Statics.field295[var1], Statics.field366[var1], 1024 - field296);
                } else if (field296 > 256) {
                    Statics.field317[var1] = Statics.field366[var1];
                } else {
                    Statics.field317[var1] = method118(Statics.field366[var1], Statics.field295[var1], 256 - field296);
                }
            }
        } else if (field297 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field297 > 768) {
                    Statics.field317[var2] = method118(Statics.field295[var2], Statics.field1917[var2], 1024 - field297);
                } else if (field297 > 256) {
                    Statics.field317[var2] = Statics.field1917[var2];
                } else {
                    Statics.field317[var2] = method118(Statics.field1917[var2], Statics.field295[var2], 256 - field297);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field317[var3] = Statics.field295[var3];
            }
        }
        class88.method1794(0, 9, 128, var0 + 7);
        Statics.field289.method1710(0, 0);
        class88.method1768();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field293[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1432[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field317[var10];
                    int var14 = Statics.field1532.field1445[var5];
                    Statics.field1532.field1445[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class88.method1794(637, 9, 765, var0 + 7);
        Statics.field1438.method1710(382, 0);
        class88.method1768();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field293[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1432[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field317[var22];
                    int var26 = Statics.field1532.field1445[var20];
                    Statics.field1532.field1445[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ac.k(I)V")
    public static void method762() {
        try {
            if (Statics.field1599 == null) {
                Statics.field1599 = new class23(Statics.field16, new URL(Statics.field105));
            } else {
                byte[] var0 = Statics.field1599.method216();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field309 = var1.method2405();
                    Statics.field1367 = new class12[field309];
                    int var2 = 0;
                    while (var2 < field309) {
                        class12 var3 = Statics.field1367[var2] = new class12();
                        int var4 = var1.method2405();
                        var3.field181 = var4 & 0x7FFF;
                        var3.field186 = (var4 & 0x8000) != 0;
                        var3.field193 = var1.method2390();
                        var3.field190 = var1.method2399();
                        var3.field182 = var1.method2385();
                        var3.field185 = var2++;
                    }
                    method732(Statics.field1367, 0, Statics.field1367.length - 1, field316, field305);
                    field307 = true;
                    Statics.field1599 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1599 = null;
        }
    }

    @ObfuscatedName("an.o([Lk;II[I[II)V")
    public static void method732(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class12 var8 = arg0[var7];
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
                        var11 = arg0[var6].field185;
                        var12 = var8.field185;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field182;
                        var12 = var8.field182;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field186 ? 1 : 0;
                        var12 = var8.field186 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field181;
                        var12 = var8.field181;
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
                        var15 = arg0[var5].field185;
                        var16 = var8.field185;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field182;
                        var16 = var8.field182;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field186 ? 1 : 0;
                        var16 = var8.field186 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field181;
                        var16 = var8.field181;
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
                class12 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method732(arg0, arg1, var6, arg3, arg4);
        method732(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
