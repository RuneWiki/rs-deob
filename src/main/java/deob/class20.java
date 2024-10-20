package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("s")
public class class20 {

    @ObfuscatedName("s.j")
    public static boolean field310 = false;

    @ObfuscatedName("s.c")
    public static int[] field312 = new int[256];

    @ObfuscatedName("s.s")
    public static int field340 = 0;

    @ObfuscatedName("s.f")
    public static int field315 = 0;

    @ObfuscatedName("s.o")
    public static int field316 = 0;

    @ObfuscatedName("s.ax")
    public static int field309 = 0;

    @ObfuscatedName("s.aa")
    public static int field318 = 0;

    @ObfuscatedName("s.af")
    public static int field319 = 0;

    @ObfuscatedName("s.al")
    public static int field320 = 10;

    @ObfuscatedName("s.av")
    public static String field317 = "";

    @ObfuscatedName("s.ab")
    public static int field314 = 0;

    @ObfuscatedName("s.ad")
    public static String field323 = "";

    @ObfuscatedName("s.ai")
    public static String field324 = "";

    @ObfuscatedName("s.ak")
    public static String field342 = "";

    @ObfuscatedName("s.ao")
    public static String field322 = "";

    @ObfuscatedName("s.aq")
    public static String field343 = "";

    @ObfuscatedName("s.aj")
    public static int field328 = 0;

    @ObfuscatedName("s.ag")
    public static String field329 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("s.an")
    public static boolean field330 = false;

    @ObfuscatedName("s.az")
    public static int field326 = 0;

    @ObfuscatedName("s.bu")
    public static int[] field333 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("s.bh")
    public static int[] field334 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("s.bt")
    public static int field341 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.u(Leb;Leb;I)I")
    public static int method10(class151 arg0, class151 arg1) {
        int var2 = 0;
        if (arg0.method3011("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3011("logo", "")) {
            var2++;
        }
        if (arg1.method3011("titlebox", "")) {
            var2++;
        }
        if (arg1.method3011("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3011("runes", "")) {
            var2++;
        }
        if (arg1.method3011("title_mute", "")) {
            var2++;
        }
        arg1.method3011("sl_back", "");
        arg1.method3011("sl_flags", "");
        arg1.method3011("sl_arrows", "");
        arg1.method3011("sl_stars", "");
        arg1.method3011("sl_button", "");
        return var2;
    }

    @ObfuscatedName("df.k(I)V")
    public static void method2426() {
        if (!Statics.field325) {
            return;
        }
        Statics.field1904 = null;
        Statics.field327 = null;
        Statics.field307 = null;
        Statics.field2536 = null;
        Statics.field308 = null;
        Statics.field335 = null;
        Statics.field1320 = null;
        Statics.field297 = null;
        Statics.field942 = null;
        Statics.field59 = null;
        Statics.field2688 = null;
        Statics.field1648 = null;
        Statics.field57 = null;
        Statics.field30 = null;
        Statics.field313 = null;
        Statics.field1791 = null;
        Statics.field1796 = null;
        Statics.field1783 = null;
        Statics.field1798 = null;
        Statics.field1973 = null;
        class137.field2324 = 1;
        Statics.field2554 = null;
        Statics.field2325 = -1;
        Statics.field2321 = -1;
        Statics.field2322 = 0;
        Statics.field1263 = false;
        Statics.field76 = 2;
        class152.method2712(true);
        Statics.field325 = false;
    }

    @ObfuscatedName("ev.x(Lbx;I)V")
    public static void method2879(class72 arg0) {
        if (!field330) {
            if (class76.field1373 == 1 && class76.field1374 >= 715 && class76.field1377 >= 453) {
                field310 = !field310;
                if (field310) {
                    Statics.field2323.method2723();
                    class137.field2324 = 1;
                    Statics.field2554 = null;
                } else {
                    class153 var9 = Statics.field618;
                    int var10 = var9.method2980("scape main");
                    int var11 = var9.method3014(var10, "");
                    class137.method2042(var9, var10, var11, 255, false);
                }
            }
            if (client.field475 != 5) {
                field318++;
                if (client.field475 == 10) {
                    if (client.field473 == 0) {
                        if (class76.field1373 == 1) {
                            byte var12 = 5;
                            short var13 = 463;
                            byte var14 = 100;
                            byte var15 = 35;
                            if (class76.field1374 >= var12 && class76.field1374 <= var12 + var14 && class76.field1377 >= var13 && class76.field1377 <= var13 + var15) {
                                method2370();
                                return;
                            }
                        }
                        if (Statics.field2537 != null) {
                            method2370();
                        }
                    }
                    int var16 = class76.field1373;
                    int var17 = class76.field1374;
                    int var18 = class76.field1377;
                    if (field314 == 0) {
                        short var19 = 302;
                        short var20 = 291;
                        if (var16 == 1 && var17 >= var19 - 75 && var17 <= var19 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field314 = 3;
                            field328 = 0;
                        }
                        short var21 = 462;
                        if (var16 == 1 && var17 >= var21 - 75 && var17 <= var21 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field323 = class133.field2267;
                            field324 = class133.field2268;
                            field342 = class133.field2269;
                            field314 = 2;
                            field328 = 0;
                        }
                    } else if (field314 == 2) {
                        short var22 = 231;
                        int var35 = var22 + 30;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field328 = 0;
                        }
                        var35 += 15;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field328 = 1;
                        }
                        var35 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var16 == 1 && var17 >= var23 - 75 && var17 <= var23 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field322 = field322.trim();
                            if (field322.length() == 0) {
                                method44(class133.field2163, class133.field2116, class133.field2226);
                                return;
                            }
                            if (field343.length() == 0) {
                                method44(class133.field2071, class133.field2181, class133.field2182);
                                return;
                            }
                            method44(class133.field2270, class133.field2271, class133.field2272);
                            client.method138(20);
                            return;
                        }
                        short var25 = 462;
                        if (var16 == 1 && var17 >= var25 - 75 && var17 <= var25 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field314 = 0;
                            field322 = "";
                            field343 = "";
                        }
                        while (true) {
                            while (true) {
                                class74 var26 = class74.field1335;
                                boolean var27;
                                synchronized (class74.field1335) {
                                    if (class74.field1352 == class74.field1350) {
                                        var27 = false;
                                    } else {
                                        Statics.field249 = class74.field1349[class74.field1350];
                                        Statics.field266 = class74.field1331[class74.field1350];
                                        class74.field1350 = class74.field1350 + 1 & 0x7F;
                                        var27 = true;
                                    }
                                }
                                if (!var27) {
                                    return;
                                }
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field329.length(); var30++) {
                                    if (Statics.field266 == field329.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (field328 == 0) {
                                    if (Statics.field249 == 85 && field322.length() > 0) {
                                        field322 = field322.substring(0, field322.length() - 1);
                                    }
                                    if (Statics.field249 == 84 || Statics.field249 == 80) {
                                        field328 = 1;
                                    }
                                    if (var29 && field322.length() < 320) {
                                        field322 = field322 + Statics.field266;
                                    }
                                } else if (field328 == 1) {
                                    if (Statics.field249 == 85 && field343.length() > 0) {
                                        field343 = field343.substring(0, field343.length() - 1);
                                    }
                                    if (Statics.field249 == 84 || Statics.field249 == 80) {
                                        field328 = 0;
                                    }
                                    if (client.field469 == 2 && Statics.field249 == 84) {
                                        field322 = field322.trim();
                                        if (field322.length() == 0) {
                                            method44(class133.field2163, class133.field2116, class133.field2226);
                                            return;
                                        }
                                        if (field343.length() == 0) {
                                            method44(class133.field2071, class133.field2181, class133.field2182);
                                            return;
                                        }
                                        method44(class133.field2270, class133.field2271, class133.field2272);
                                        client.method138(20);
                                        return;
                                    }
                                    if (var29 && field343.length() < 20) {
                                        field343 = field343 + Statics.field266;
                                    }
                                }
                            }
                        }
                    } else if (field314 == 3) {
                        short var31 = 382;
                        short var32 = 321;
                        if (var16 == 1 && var17 >= var31 - 75 && var17 <= var31 + 75 && var18 >= var32 - 20 && var18 <= var32 + 20) {
                            field314 = 0;
                        }
                    }
                }
            }
        } else if (class76.field1373 == 1) {
            short var1 = 280;
            if (class76.field1374 >= var1 && class76.field1374 <= var1 + 14 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                method2038(0, 0);
            } else if (class76.field1374 >= var1 + 15 && class76.field1374 <= var1 + 80 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                method2038(0, 1);
            } else {
                short var2 = 390;
                if (class76.field1374 >= var2 && class76.field1374 <= var2 + 14 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                    method2038(1, 0);
                } else if (class76.field1374 >= var2 + 15 && class76.field1374 <= var2 + 80 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                    method2038(1, 1);
                } else {
                    short var3 = 500;
                    if (class76.field1374 >= var3 && class76.field1374 <= var3 + 14 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                        method2038(2, 0);
                    } else if (class76.field1374 >= var3 + 15 && class76.field1374 <= var3 + 80 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                        method2038(2, 1);
                    } else {
                        short var4 = 610;
                        if (class76.field1374 >= var4 && class76.field1374 <= var4 + 14 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                            method2038(3, 0);
                        } else if (class76.field1374 >= var4 + 15 && class76.field1374 <= var4 + 80 && class76.field1377 >= 4 && class76.field1377 <= 18) {
                            method2038(3, 1);
                        } else if (class76.field1374 >= 708 && class76.field1377 >= 4 && class76.field1374 <= 758 && class76.field1377 <= 20) {
                            field330 = false;
                            Statics.field2536.method1684(0, 0);
                            Statics.field308.method1684(382, 0);
                            Statics.field335.method1777(382 - Statics.field335.field1456 / 2, 18);
                        } else if (field341 != -1) {
                            class12 var5 = Statics.field216[field341];
                            if (client.field471 == var5.field197) {
                                Statics.field2019 = var5.field205;
                                client.field467 = var5.field204;
                                Statics.field119 = client.field469 == 0 ? 43594 : var5.field204 + 40000;
                                Statics.field253 = client.field469 == 0 ? 443 : var5.field204 + 50000;
                                Statics.field2302 = Statics.field119;
                                field330 = false;
                                Statics.field2536.method1684(0, 0);
                                Statics.field308.method1684(382, 0);
                                Statics.field335.method1777(382 - Statics.field335.field1456 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field469 != 0) {
                                    var6 = ":" + (var5.field204 + 7000);
                                }
                                String var7 = "http://" + var5.field205 + var6 + "/j" + client.field714;
                                try {
                                    arg0.getAppletContext().showDocument(new URL(var7), "_self");
                                } catch (Exception var33) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.m(Lfk;Lfk;I)V")
    public static void method2035(class182 arg0, class182 arg1) {
        if (!field330) {
            if (client.field475 == 0 || client.field475 == 5) {
                byte var25 = 20;
                arg0.method3433(class133.field2193, 382, 245 - var25, 16777215, -1);
                int var26 = 253 - var25;
                class88.method1807(230, var26, 304, 34, 9179409);
                class88.method1807(231, var26 + 1, 302, 32, 0);
                class88.method1797(232, var26 + 2, field320 * 3, 30, 9179409);
                class88.method1797(field320 * 3 + 232, var26 + 2, 300 - field320 * 3, 30, 0);
                arg0.method3433(field317, 382, 276 - var25, 16777215, -1);
            }
            if (client.field475 == 20) {
                Statics.field1904.method1777(382 - Statics.field1904.field1456 / 2, 271 - Statics.field1904.field1457 / 2);
                short var27 = 211;
                arg0.method3433(field323, 382, var27, 16776960, 0);
                int var51 = var27 + 15;
                arg0.method3433(field324, 382, var51, 16776960, 0);
                int var52 = var51 + 15;
                arg0.method3433(field342, 382, var52, 16776960, 0);
                int var53 = var52 + 15;
                int var54 = var53 + 10;
                arg0.method3438(class133.field2273, 272, var54, 16777215, 0);
                short var28 = 200;
                String var29;
                for (var29 = field322; arg0.method3389(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
                }
                arg0.method3438(class184.method3404(var29), 312, var54, 16777215, 0);
                var51 = var54 + 15;
                arg0.method3438(class133.field2274 + Statics.method1628(field343), 274, var51, 16777215, 0);
                var51 += 15;
            }
            if (client.field475 == 10) {
                Statics.field1904.method1777(202, 171);
                if (field314 == 0) {
                    short var30 = 251;
                    arg0.method3433(class133.field2223, 382, var30, 16776960, 0);
                    int var55 = var30 + 30;
                    short var31 = 302;
                    short var32 = 291;
                    Statics.field327.method1777(var31 - 73, var32 - 20);
                    arg0.method3397(class133.field2204, var31 - 73, var32 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var33 = 462;
                    Statics.field327.method1777(var33 - 73, var32 - 20);
                    arg0.method3397(class133.field2277, var33 - 73, var32 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field314 == 2) {
                    short var34 = 211;
                    arg0.method3433(field323, 382, var34, 16776960, 0);
                    int var56 = var34 + 15;
                    arg0.method3433(field324, 382, var56, 16776960, 0);
                    int var57 = var56 + 15;
                    arg0.method3433(field342, 382, var57, 16776960, 0);
                    int var58 = var57 + 15;
                    int var59 = var58 + 10;
                    arg0.method3438(class133.field2273, 272, var59, 16777215, 0);
                    short var35 = 200;
                    String var36;
                    for (var36 = field322; arg0.method3389(var36) > var35; var36 = var36.substring(1)) {
                    }
                    arg0.method3438(class184.method3404(var36) + (field328 == 0 & client.field477 % 40 < 20 ? class2.method877(16776960) + class2.field19 : ""), 312, var59, 16777215, 0);
                    var56 = var59 + 15;
                    arg0.method3438(class133.field2274 + Statics.method1628(field343) + (field328 == 1 & client.field477 % 40 < 20 ? class2.method877(16776960) + class2.field19 : ""), 274, var56, 16777215, 0);
                    var56 += 15;
                    short var37 = 302;
                    short var38 = 321;
                    Statics.field327.method1777(var37 - 73, var38 - 20);
                    arg0.method3433(class133.field2278, var37, var38 + 5, 16777215, 0);
                    short var39 = 462;
                    Statics.field327.method1777(var39 - 73, var38 - 20);
                    arg0.method3433(class133.field2279, var39, var38 + 5, 16777215, 0);
                } else if (field314 == 3) {
                    arg0.method3433(class133.field2280, 382, 211, 16776960, 0);
                    short var40 = 236;
                    arg0.method3433(class133.field2281, 382, var40, 16777215, 0);
                    int var60 = var40 + 15;
                    arg0.method3433(class133.field2282, 382, var60, 16777215, 0);
                    int var61 = var60 + 15;
                    arg0.method3433(class133.field2283, 382, var61, 16777215, 0);
                    int var62 = var61 + 15;
                    arg0.method3433(class133.field2284, 382, var62, 16777215, 0);
                    int var63 = var62 + 15;
                    short var41 = 382;
                    short var42 = 321;
                    Statics.field327.method1777(var41 - 73, var42 - 20);
                    arg0.method3433(class133.field2279, var41, var42 + 5, 16777215, 0);
                }
            }
            if (field318 > 0) {
                method117(field318);
                field318 = 0;
            }
            method669();
            Statics.field1320[field310 ? 1 : 0].method1777(725, 463);
            if (client.field475 > 5 && client.field473 == 0) {
                if (Statics.field1648 == null) {
                    Statics.field1648 = class83.method1627(Statics.field2013, "sl_button", "");
                } else {
                    byte var43 = 5;
                    short var44 = 463;
                    byte var45 = 100;
                    byte var46 = 35;
                    Statics.field1648.method1777(var43, var44);
                    arg0.method3433(class133.field2221 + " " + client.field467, var45 / 2 + var43, var46 / 2 + var44 - 2, 16777215, 0);
                    if (Statics.field2537 == null) {
                        arg1.method3433(class133.field2206, var45 / 2 + var43, var46 / 2 + var44 + 12, 16777215, 0);
                    } else {
                        arg1.method3433(class133.field2294, var45 / 2 + var43, var46 / 2 + var44 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var47 = Statics.field2431.getGraphics();
                Statics.field1415.method1603(var47, 0, 0);
            } catch (Exception var50) {
                Statics.field2431.repaint();
            }
            return;
        }
        if (Statics.field297 == null) {
            Statics.field297 = class83.method114(Statics.field2013, "sl_back", "");
        }
        if (Statics.field942 == null) {
            Statics.field942 = class83.method1570(Statics.field2013, "sl_flags", "");
        }
        if (Statics.field59 == null) {
            Statics.field59 = class83.method1570(Statics.field2013, "sl_arrows", "");
        }
        if (Statics.field2688 == null) {
            Statics.field2688 = class83.method1570(Statics.field2013, "sl_stars", "");
        }
        class88.method1797(0, 23, 765, 480, 0);
        class88.method1814(0, 0, 125, 23, 12425273, 9135624);
        class88.method1814(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3433(class133.field2167, 62, 15, 0, -1);
        if (Statics.field2688 != null) {
            Statics.field2688[1].method1777(140, 1);
            arg1.method3438(class133.field2202, 152, 10, 16777215, -1);
            Statics.field2688[0].method1777(140, 12);
            arg1.method3438(class133.field2152, 152, 21, 16777215, -1);
        }
        if (Statics.field59 != null) {
            short var2 = 280;
            if (field333[0] == 0 && field334[0] == 0) {
                Statics.field59[2].method1777(var2, 4);
            } else {
                Statics.field59[0].method1777(var2, 4);
            }
            if (field333[0] == 0 && field334[0] == 1) {
                Statics.field59[3].method1777(var2 + 15, 4);
            } else {
                Statics.field59[1].method1777(var2 + 15, 4);
            }
            arg0.method3438(class133.field2173, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field333[0] == 1 && field334[0] == 0) {
                Statics.field59[2].method1777(var3, 4);
            } else {
                Statics.field59[0].method1777(var3, 4);
            }
            if (field333[0] == 1 && field334[0] == 1) {
                Statics.field59[3].method1777(var3 + 15, 4);
            } else {
                Statics.field59[1].method1777(var3 + 15, 4);
            }
            arg0.method3438(class133.field2289, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field333[0] == 2 && field334[0] == 0) {
                Statics.field59[2].method1777(var4, 4);
            } else {
                Statics.field59[0].method1777(var4, 4);
            }
            if (field333[0] == 2 && field334[0] == 1) {
                Statics.field59[3].method1777(var4 + 15, 4);
            } else {
                Statics.field59[1].method1777(var4 + 15, 4);
            }
            arg0.method3438(class133.field2290, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field333[0] == 3 && field334[0] == 0) {
                Statics.field59[2].method1777(var5, 4);
            } else {
                Statics.field59[0].method1777(var5, 4);
            }
            if (field333[0] == 3 && field334[0] == 1) {
                Statics.field59[3].method1777(var5 + 15, 4);
            } else {
                Statics.field59[1].method1777(var5 + 15, 4);
            }
            arg0.method3438(class133.field2291, var5 + 32, 17, 16777215, -1);
        }
        class88.method1797(708, 4, 50, 16, 0);
        arg1.method3433(class133.field2279, 733, 16, 16777215, -1);
        field341 = -1;
        if (Statics.field297 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field326) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field326) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field326) {
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
            for (int var19 = 0; var19 < field326; var19++) {
                class12 var20 = Statics.field216[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field193);
                if (var20.field193 == -1) {
                    var22 = class133.field2292;
                    var21 = false;
                } else if (var20.field193 > 1980) {
                    var22 = class133.field2293;
                    var21 = false;
                }
                if (class76.field1367 >= var17 && class76.field1378 >= var16 && class76.field1367 < var6 + var17 && class76.field1378 < var7 + var16 && var21) {
                    field341 = var19;
                    Statics.field297[var20.field197 ? 1 : 0].method1690(var17, var16, 128, 16777215);
                } else {
                    Statics.field297[var20.field197 ? 1 : 0].method1684(var17, var16);
                }
                if (Statics.field942 != null) {
                    Statics.field942[(var20.field197 ? 8 : 0) + var20.field195].method1777(var17 + 29, var16);
                }
                arg0.method3433(Integer.toString(var20.field204), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3433(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
            Graphics var23 = Statics.field2431.getGraphics();
            Statics.field1415.method1603(var23, 0, 0);
        } catch (Exception var49) {
            Statics.field2431.repaint();
        }
    }

    @ObfuscatedName("q.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method44(String arg0, String arg1, String arg2) {
        field323 = arg0;
        field324 = arg1;
        field342 = arg2;
    }

    @ObfuscatedName("db.q(Lcv;I)V")
    public static final void method2386(class86 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1796.length; var2++) {
            Statics.field1796[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1796[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1783[var8] = (Statics.field1796[var8 - 1] + Statics.field1796[var8 + 1] + Statics.field1796[var8 - 128] + Statics.field1796[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1796;
            Statics.field1796 = Statics.field1783;
            Statics.field1783 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1457; var11++) {
            for (int var12 = 0; var12 < arg0.field1456; var12++) {
                if (arg0.field1455[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1461;
                    int var14 = var11 + 16 + arg0.field1459;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1796[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("l.a(IB)V")
    public static final void method117(int arg0) {
        short var1 = 256;
        field316 += arg0 * 128;
        if (field316 > Statics.field1796.length) {
            field316 -= Statics.field1796.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2386(Statics.field307[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1798[var3 + var4] - Statics.field1796[field316 + var3 & Statics.field1796.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1798[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1798[var9 + var10] = 255;
                } else {
                    Statics.field1798[var9 + var10] = 0;
                }
            }
        }
        if (field340 > 0) {
            field340 -= arg0 * 4;
        }
        if (field315 > 0) {
            field315 -= arg0 * 4;
        }
        if (field340 == 0 && field315 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field340 = 1024;
            }
            if (var12 == 1) {
                field315 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field312[var13] = field312[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field312[var14] = (int) (Math.sin((double) field319 / 14.0D) * 16.0D + Math.sin((double) field319 / 15.0D) * 14.0D + Math.sin((double) field319 / 16.0D) * 12.0D);
            field319++;
        }
        field309 += arg0 * 284768357;
        int var15 = ((client.field477 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field309 * 535850644; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1798[(var18 << 7) + var17] = 192;
        }
        field309 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1798[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1798[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1973[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1973[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1973[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1798[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ab.j(I)V")
    public static final void method669() {
        short var0 = 256;
        if (field340 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field340 > 768) {
                    Statics.field1791[var1] = Statics.method1160(Statics.field57[var1], Statics.field30[var1], 1024 - field340);
                } else if (field340 > 256) {
                    Statics.field1791[var1] = Statics.field30[var1];
                } else {
                    Statics.field1791[var1] = Statics.method1160(Statics.field30[var1], Statics.field57[var1], 256 - field340);
                }
            }
        } else if (field315 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field315 > 768) {
                    Statics.field1791[var2] = Statics.method1160(Statics.field57[var2], Statics.field313[var2], 1024 - field315);
                } else if (field315 > 256) {
                    Statics.field1791[var2] = Statics.field313[var2];
                } else {
                    Statics.field1791[var2] = Statics.method1160(Statics.field313[var2], Statics.field57[var2], 256 - field315);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1791[var3] = Statics.field57[var3];
            }
        }
        class88.method1791(0, 9, 128, var0 + 7);
        Statics.field2536.method1684(0, 0);
        class88.method1790();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field312[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1798[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1791[var10];
                    int var14 = Statics.field1415.field1437[var5];
                    Statics.field1415.field1437[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class88.method1791(637, 9, 765, var0 + 7);
        Statics.field308.method1684(382, 0);
        class88.method1790();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field312[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1798[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1791[var22];
                    int var26 = Statics.field1415.field1437[var20];
                    Statics.field1415.field1437[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ds.l(I)V")
    public static void method2370() {
        try {
            if (Statics.field2537 == null) {
                Statics.field2537 = new class23(Statics.field108, new URL(Statics.field1289));
            } else {
                byte[] var0 = Statics.field2537.method206();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field326 = var1.method2450();
                    Statics.field216 = new class12[field326];
                    int var2 = 0;
                    while (var2 < field326) {
                        class12 var3 = Statics.field216[var2] = new class12();
                        int var4 = var1.method2450();
                        var3.field204 = var4 & 0x7FFF;
                        var3.field197 = (var4 & 0x8000) != 0;
                        var3.field205 = var1.method2630();
                        var3.field195 = var1.method2559();
                        var3.field193 = var1.method2487();
                        var3.field196 = var2++;
                    }
                    method154(Statics.field216, 0, Statics.field216.length - 1, field333, field334);
                    field330 = true;
                    Statics.field2537 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field2537 = null;
        }
    }

    @ObfuscatedName("cq.w(III)V")
    public static void method2038(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field333[var5] != arg0) {
                var2[var4] = field333[var5];
                var3[var4] = field334[var5];
                var4++;
            }
        }
        field333 = var2;
        field334 = var3;
        method154(Statics.field216, 0, Statics.field216.length - 1, field333, field334);
    }

    @ObfuscatedName("i.z([Lz;II[I[II)V")
    public static void method154(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field196;
                        var12 = var8.field196;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field193;
                        var12 = var8.field193;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field197 ? 1 : 0;
                        var12 = var8.field197 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field204;
                        var12 = var8.field204;
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
                        var15 = arg0[var5].field196;
                        var16 = var8.field196;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field193;
                        var16 = var8.field193;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field197 ? 1 : 0;
                        var16 = var8.field197 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field204;
                        var16 = var8.field204;
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
        method154(arg0, arg1, var6, arg3, arg4);
        method154(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
