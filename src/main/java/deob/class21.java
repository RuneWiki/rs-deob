package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("t")
public class class21 {

    @ObfuscatedName("t.r")
    public static int[] field297 = new int[256];

    @ObfuscatedName("t.b")
    public static int field298 = 0;

    @ObfuscatedName("t.k")
    public static int field326 = 0;

    @ObfuscatedName("t.q")
    public static int field302 = 0;

    @ObfuscatedName("t.z")
    public static int field303 = 0;

    @ObfuscatedName("t.af")
    public static int field299 = 0;

    @ObfuscatedName("t.ap")
    public static int field305 = 0;

    @ObfuscatedName("t.ah")
    public static int field290 = 10;

    @ObfuscatedName("t.at")
    public static String field307 = "";

    @ObfuscatedName("t.aa")
    public static int field308 = 0;

    @ObfuscatedName("t.ae")
    public static String field309 = "";

    @ObfuscatedName("t.aw")
    public static String field310 = "";

    @ObfuscatedName("t.ar")
    public static String field311 = "";

    @ObfuscatedName("t.ai")
    public static String field317 = "";

    @ObfuscatedName("t.au")
    public static String field313 = "";

    @ObfuscatedName("t.ay")
    public static int field314 = 0;

    @ObfuscatedName("t.an")
    public static String field315 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("t.as")
    public static boolean field316 = false;

    @ObfuscatedName("t.ab")
    public static int field304 = 0;

    @ObfuscatedName("t.bo")
    public static int[] field320 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("t.bj")
    public static int[] field321 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("t.bg")
    public static int field322 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.p(Lba;I)V")
    public static void method599(class73 arg0) {
        if (field316) {
            method834(arg0);
            return;
        }
        if (class77.field1386 == 1 && class77.field1387 >= 715 && class77.field1385 >= 453) {
            Statics.field948.field174 = !Statics.field948.field174;
            class12.method198();
            if (Statics.field948.field174) {
                class139.method593();
            } else {
                class139.method41(Statics.field743, "scape main", "", 255, false);
            }
        }
        if (client.field693 == 5) {
            return;
        }
        field299++;
        if (client.field693 != 10) {
            return;
        }
        if (client.field654 == 0) {
            if (class77.field1386 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class77.field1387 >= var1 && class77.field1387 <= var1 + var3 && class77.field1385 >= var2 && class77.field1385 <= var2 + var4) {
                    method1238();
                    return;
                }
            }
            if (Statics.field1272 != null) {
                method1238();
            }
        }
        int var5 = class77.field1386;
        int var6 = class77.field1387;
        int var7 = class77.field1385;
        if (field308 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field308 = 3;
                field314 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field456 & 0x4) != 0) {
                    if ((client.field456 & 0x400) == 0) {
                        field309 = class135.field2279;
                        field310 = class135.field2181;
                        field311 = class135.field2139;
                    } else {
                        field309 = class135.field2301;
                        field310 = class135.field2302;
                        field311 = class135.field2244;
                    }
                    field308 = 1;
                    field314 = 0;
                } else if ((client.field456 & 0x400) == 0) {
                    field309 = class135.field2291;
                    field310 = class135.field2292;
                    field311 = class135.field2293;
                    field308 = 2;
                    field314 = 0;
                } else {
                    field309 = class135.field2249;
                    field310 = class135.field2299;
                    field311 = class135.field2300;
                    field308 = 1;
                    field314 = 0;
                }
            }
        } else if (field308 == 1) {
            while (true) {
                class75 var11 = class75.field1363;
                boolean var12;
                synchronized (class75.field1363) {
                    if (class75.field1356 == class75.field1345) {
                        var12 = false;
                    } else {
                        Statics.field78 = class75.field1353[class75.field1356];
                        Statics.field1405 = class75.field1333[class75.field1356];
                        class75.field1356 = class75.field1356 + 1 & 0x7F;
                        var12 = true;
                    }
                }
                if (!var12) {
                    short var14 = 302;
                    short var15 = 321;
                    if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                        field309 = class135.field2291;
                        field310 = class135.field2292;
                        field311 = class135.field2293;
                        field308 = 2;
                        field314 = 0;
                    }
                    short var16 = 462;
                    if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                        field308 = 0;
                    }
                    break;
                }
                if (Statics.field78 == 84) {
                    field309 = class135.field2291;
                    field310 = class135.field2292;
                    field311 = class135.field2293;
                    field308 = 2;
                    field314 = 0;
                } else if (Statics.field78 == 13) {
                    field308 = 0;
                }
            }
        } else if (field308 == 2) {
            short var17 = 231;
            int var30 = var17 + 30;
            if (var5 == 1 && var7 >= var30 - 15 && var7 < var30) {
                field314 = 0;
            }
            var30 += 15;
            if (var5 == 1 && var7 >= var30 - 15 && var7 < var30) {
                field314 = 1;
            }
            var30 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field317 = field317.trim();
                if (field317.length() == 0) {
                    method1452(class135.field2113, class135.field2202, class135.field2167);
                    return;
                }
                if (field313.length() == 0) {
                    method1452(class135.field2204, class135.field2108, class135.field2154);
                    return;
                }
                method1452(class135.field2240, class135.field2305, class135.field2306);
                client.method1(20);
                return;
            }
            short var20 = 462;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field308 = 0;
                field317 = "";
                field313 = "";
            }
            while (true) {
                while (true) {
                    class75 var21 = class75.field1363;
                    boolean var22;
                    synchronized (class75.field1363) {
                        if (class75.field1356 == class75.field1345) {
                            var22 = false;
                        } else {
                            Statics.field78 = class75.field1353[class75.field1356];
                            Statics.field1405 = class75.field1333[class75.field1356];
                            class75.field1356 = class75.field1356 + 1 & 0x7F;
                            var22 = true;
                        }
                    }
                    if (!var22) {
                        return;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < field315.length(); var25++) {
                        if (Statics.field1405 == field315.charAt(var25)) {
                            var24 = true;
                            break;
                        }
                    }
                    if (Statics.field78 == 13) {
                        field308 = 0;
                        field317 = "";
                        field313 = "";
                    } else if (field314 == 0) {
                        if (Statics.field78 == 85 && field317.length() > 0) {
                            field317 = field317.substring(0, field317.length() - 1);
                        }
                        if (Statics.field78 == 84 || Statics.field78 == 80) {
                            field314 = 1;
                        }
                        if (var24 && field317.length() < 320) {
                            field317 = field317 + Statics.field1405;
                        }
                    } else if (field314 == 1) {
                        if (Statics.field78 == 85 && field313.length() > 0) {
                            field313 = field313.substring(0, field313.length() - 1);
                        }
                        if (Statics.field78 == 84 || Statics.field78 == 80) {
                            field314 = 0;
                        }
                        if (Statics.field78 == 84) {
                            field317 = field317.trim();
                            if (field317.length() == 0) {
                                method1452(class135.field2113, class135.field2202, class135.field2167);
                                return;
                            }
                            if (field313.length() == 0) {
                                method1452(class135.field2204, class135.field2108, class135.field2154);
                                return;
                            }
                            method1452(class135.field2240, class135.field2305, class135.field2306);
                            client.method1(20);
                            return;
                        }
                        if (var24 && field313.length() < 20) {
                            field313 = field313 + Statics.field1405;
                        }
                    }
                }
            }
        } else if (field308 == 3) {
            short var26 = 382;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field308 = 0;
            }
        }
    }

    @ObfuscatedName("b.l(Lgg;Lgg;I)V")
    public static void method148(class183 arg0, class183 arg1) {
        if (field316) {
            if (Statics.field741 == null) {
                Statics.field741 = class84.method2338(Statics.field1179, "sl_back", "");
            }
            if (Statics.field1651 == null) {
                Statics.field1651 = class84.method2(Statics.field1179, "sl_flags", "");
            }
            if (Statics.field1031 == null) {
                Statics.field1031 = class84.method2(Statics.field1179, "sl_arrows", "");
            }
            if (Statics.field197 == null) {
                Statics.field197 = class84.method2(Statics.field1179, "sl_stars", "");
            }
            class89.method1831(0, 23, 765, 480, 0);
            class89.method1832(0, 0, 125, 23, 12425273, 9135624);
            class89.method1832(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3505(class135.field2129, 62, 15, 0, -1);
            if (Statics.field197 != null) {
                Statics.field197[1].method1819(140, 1);
                arg1.method3540(class135.field2320, 152, 10, 16777215, -1);
                Statics.field197[0].method1819(140, 12);
                arg1.method3540(class135.field2309, 152, 21, 16777215, -1);
            }
            if (Statics.field1031 != null) {
                short var2 = 280;
                if (field320[0] == 0 && field321[0] == 0) {
                    Statics.field1031[2].method1819(var2, 4);
                } else {
                    Statics.field1031[0].method1819(var2, 4);
                }
                if (field320[0] == 0 && field321[0] == 1) {
                    Statics.field1031[3].method1819(var2 + 15, 4);
                } else {
                    Statics.field1031[1].method1819(var2 + 15, 4);
                }
                arg0.method3540(class135.field2322, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field320[0] == 1 && field321[0] == 0) {
                    Statics.field1031[2].method1819(var3, 4);
                } else {
                    Statics.field1031[0].method1819(var3, 4);
                }
                if (field320[0] == 1 && field321[0] == 1) {
                    Statics.field1031[3].method1819(var3 + 15, 4);
                } else {
                    Statics.field1031[1].method1819(var3 + 15, 4);
                }
                arg0.method3540(class135.field2212, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field320[0] == 2 && field321[0] == 0) {
                    Statics.field1031[2].method1819(var4, 4);
                } else {
                    Statics.field1031[0].method1819(var4, 4);
                }
                if (field320[0] == 2 && field321[0] == 1) {
                    Statics.field1031[3].method1819(var4 + 15, 4);
                } else {
                    Statics.field1031[1].method1819(var4 + 15, 4);
                }
                arg0.method3540(class135.field2261, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field320[0] == 3 && field321[0] == 0) {
                    Statics.field1031[2].method1819(var5, 4);
                } else {
                    Statics.field1031[0].method1819(var5, 4);
                }
                if (field320[0] == 3 && field321[0] == 1) {
                    Statics.field1031[3].method1819(var5 + 15, 4);
                } else {
                    Statics.field1031[1].method1819(var5 + 15, 4);
                }
                arg0.method3540(class135.field2187, var5 + 32, 17, 16777215, -1);
            }
            class89.method1831(708, 4, 50, 16, 0);
            arg1.method3505(class135.field2313, 733, 16, 16777215, -1);
            field322 = -1;
            if (Statics.field741 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field304) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field304) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field304) {
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
                for (int var20 = 0; var20 < field304; var20++) {
                    class13 var21 = Statics.field259[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field185);
                    if (var21.field185 == -1) {
                        var23 = class135.field2326;
                        var22 = false;
                    } else if (var21.field185 > 1980) {
                        var23 = class135.field2327;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method118()) {
                        if (var21.method119()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method119()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class77.field1377 >= var17 && class77.field1381 >= var16 && class77.field1377 < var6 + var17 && class77.field1381 < var7 + var16 && var22) {
                        field322 = var20;
                        Statics.field741[var24].method1735(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field741[var24].method1729(var17, var16);
                    }
                    if (Statics.field1651 != null) {
                        Statics.field1651[(var21.method119() ? 8 : 0) + var21.field186].method1819(var17 + 29, var16);
                    }
                    arg0.method3505(Integer.toString(var21.field188), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3505(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3553(Statics.field259[field322].field190) + 6;
                    int var26 = arg1.field2843 + 8;
                    class89.method1831(class77.field1377 - var25 / 2, class77.field1381 + 20 + 5, var25, var26, 16777120);
                    class89.method1833(class77.field1377 - var25 / 2, class77.field1381 + 20 + 5, var25, var26, 0);
                    arg1.method3505(Statics.field259[field322].field190, class77.field1377, class77.field1381 + 20 + 5 + arg1.field2843 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1425.getGraphics();
                Statics.field1514.method1686(var27, 0, 0);
            } catch (Exception var92) {
                Statics.field1425.repaint();
            }
            return;
        }
        if (client.field693 == 0 || client.field693 == 5) {
            byte var29 = 20;
            arg0.method3505(class135.field2290, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class89.method1833(230, var30, 304, 34, 9179409);
            class89.method1833(231, var30 + 1, 302, 32, 0);
            class89.method1831(232, var30 + 2, field290 * 3, 30, 9179409);
            class89.method1831(field290 * 3 + 232, var30 + 2, 300 - field290 * 3, 30, 0);
            arg0.method3505(field307, 382, 276 - var29, 16777215, -1);
        }
        if (client.field693 == 20) {
            Statics.field306.method1819(382 - Statics.field306.field1474 / 2, 271 - Statics.field306.field1475 / 2);
            short var31 = 211;
            arg0.method3505(field309, 382, var31, 16776960, 0);
            int var94 = var31 + 15;
            arg0.method3505(field310, 382, var94, 16776960, 0);
            int var95 = var94 + 15;
            arg0.method3505(field311, 382, var95, 16776960, 0);
            int var96 = var95 + 15;
            int var97 = var96 + 10;
            arg0.method3540(class135.field2307, 272, var97, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field317; arg0.method3553(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3540(class185.method3485(var33), 312, var97, 16777215, 0);
            var94 = var97 + 15;
            String var35 = class135.field2114;
            String var36 = field313;
            String var37 = class148.method2352('*', var36.length());
            arg0.method3540(var35 + var37, 274, var94, 16777215, 0);
            var94 += 15;
        }
        if (client.field693 == 10) {
            Statics.field306.method1819(202, 171);
            if (field308 == 0) {
                short var38 = 251;
                arg0.method3505(class135.field2282, 382, var38, 16776960, 0);
                int var98 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field291.method1819(var39 - 73, var40 - 20);
                arg0.method3506(class135.field2310, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field291.method1819(var41 - 73, var40 - 20);
                arg0.method3506(class135.field2311, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field308 == 1) {
                arg0.method3505(class135.field2294, 382, 211, 16776960, 0);
                short var42 = 236;
                arg0.method3505(field309, 382, var42, 16777215, 0);
                int var99 = var42 + 15;
                arg0.method3505(field310, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method3505(field311, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var43 = 302;
                short var44 = 321;
                Statics.field291.method1819(var43 - 73, var44 - 20);
                arg0.method3505(class135.field2308, var43, var44 + 5, 16777215, 0);
                short var45 = 462;
                Statics.field291.method1819(var45 - 73, var44 - 20);
                arg0.method3505(class135.field2313, var45, var44 + 5, 16777215, 0);
            } else if (field308 == 2) {
                short var46 = 211;
                arg0.method3505(field309, 382, var46, 16776960, 0);
                int var102 = var46 + 15;
                arg0.method3505(field310, 382, var102, 16776960, 0);
                int var103 = var102 + 15;
                arg0.method3505(field311, 382, var103, 16776960, 0);
                int var104 = var103 + 15;
                int var105 = var104 + 10;
                arg0.method3540(class135.field2307, 272, var105, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = field317; arg0.method3553(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method3540(class185.method3485(var48) + (field314 == 0 & client.field465 % 40 < 20 ? class2.method3035(16776960) + class2.field19 : ""), 312, var105, 16777215, 0);
                var102 = var105 + 15;
                String var50 = class135.field2114;
                String var51 = field313;
                String var52 = class148.method2352('*', var51.length());
                arg0.method3540(var50 + var52 + (field314 == 1 & client.field465 % 40 < 20 ? class2.method3035(16776960) + class2.field19 : ""), 274, var102, 16777215, 0);
                var102 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field291.method1819(var53 - 73, var54 - 20);
                arg0.method3505(class135.field2324, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field291.method1819(var55 - 73, var54 - 20);
                arg0.method3505(class135.field2313, var55, var54 + 5, 16777215, 0);
            } else if (field308 == 3) {
                arg0.method3505(class135.field2314, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3505(class135.field2315, 382, var56, 16777215, 0);
                int var106 = var56 + 15;
                arg0.method3505(class135.field2316, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3505(class135.field2237, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method3505(class135.field2318, 382, var108, 16777215, 0);
                int var109 = var108 + 15;
                short var57 = 382;
                short var58 = 321;
                Statics.field291.method1819(var57 - 73, var58 - 20);
                arg0.method3505(class135.field2313, var57, var58 + 5, 16777215, 0);
            }
        }
        if (field299 > 0) {
            method2343(field299);
            field299 = 0;
        }
        short var59 = 256;
        if (field298 > 0) {
            for (int var60 = 0; var60 < 256; var60++) {
                if (field298 > 768) {
                    Statics.field1785[var60] = method2230(Statics.field1669[var60], Statics.field899[var60], 1024 - field298);
                } else if (field298 > 256) {
                    Statics.field1785[var60] = Statics.field899[var60];
                } else {
                    Statics.field1785[var60] = method2230(Statics.field899[var60], Statics.field1669[var60], 256 - field298);
                }
            }
        } else if (field326 > 0) {
            for (int var61 = 0; var61 < 256; var61++) {
                if (field326 > 768) {
                    Statics.field1785[var61] = method2230(Statics.field1669[var61], Statics.field2085[var61], 1024 - field326);
                } else if (field326 > 256) {
                    Statics.field1785[var61] = Statics.field2085[var61];
                } else {
                    Statics.field1785[var61] = method2230(Statics.field2085[var61], Statics.field1669[var61], 256 - field326);
                }
            }
        } else {
            for (int var62 = 0; var62 < 256; var62++) {
                Statics.field1785[var62] = Statics.field1669[var62];
            }
        }
        class89.method1825(0, 9, 128, var59 + 7);
        Statics.field2054.method1729(0, 0);
        class89.method1824();
        int var63 = 0;
        int var64 = 6885;
        for (int var65 = 1; var65 < var59 - 1; var65++) {
            int var66 = (var59 - var65) * field297[var65] / var59;
            int var67 = var66 + 22;
            if (var67 < 0) {
                var67 = 0;
            }
            var63 += var67;
            for (int var68 = var67; var68 < 128; var68++) {
                int var69 = Statics.field301[var63++];
                if (var69 == 0) {
                    var64++;
                } else {
                    int var71 = 256 - var69;
                    int var72 = Statics.field1785[var69];
                    int var73 = Statics.field1514.field1455[var64];
                    Statics.field1514.field1455[var64++] = ((var72 & 0xFF00) * var69 + (var73 & 0xFF00) * var71 & 0xFF0000) + ((var72 & 0xFF00FF) * var69 + (var73 & 0xFF00FF) * var71 & 0xFF00FF00) >> 8;
                }
            }
            var64 += var67 + 765 - 128;
        }
        class89.method1825(637, 9, 765, var59 + 7);
        Statics.field293.method1729(382, 0);
        class89.method1824();
        int var74 = 0;
        int var75 = 7546;
        for (int var76 = 1; var76 < var59 - 1; var76++) {
            int var77 = (var59 - var76) * field297[var76] / var59;
            int var78 = 103 - var77;
            int var79 = var75 + var77;
            for (int var80 = 0; var80 < var78; var80++) {
                int var81 = Statics.field301[var74++];
                if (var81 == 0) {
                    var79++;
                } else {
                    int var83 = 256 - var81;
                    int var84 = Statics.field1785[var81];
                    int var85 = Statics.field1514.field1455[var79];
                    Statics.field1514.field1455[var79++] = ((var84 & 0xFF00) * var81 + (var85 & 0xFF00) * var83 & 0xFF0000) + ((var84 & 0xFF00FF) * var81 + (var85 & 0xFF00FF) * var83 & 0xFF00FF00) >> 8;
                }
            }
            var74 += 128 - var78;
            var75 = 765 - var78 - var77 + var79;
        }
        Statics.field323[Statics.field948.field174 ? 1 : 0].method1819(725, 463);
        if (client.field693 > 5 && client.field654 == 0) {
            if (Statics.field257 == null) {
                Statics.field257 = class84.method1593(Statics.field1179, "sl_button", "");
            } else {
                byte var86 = 5;
                short var87 = 463;
                byte var88 = 100;
                byte var89 = 35;
                Statics.field257.method1819(var86, var87);
                arg0.method3505(class135.field2127 + " " + client.field657, var88 / 2 + var86, var89 / 2 + var87 - 2, 16777215, 0);
                if (Statics.field1272 == null) {
                    arg1.method3505(class135.field2329, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                } else {
                    arg1.method3505(class135.field2328, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var90 = Statics.field1425.getGraphics();
            Statics.field1514.method1686(var90, 0, 0);
        } catch (Exception var93) {
            Statics.field1425.repaint();
        }
    }

    @ObfuscatedName("bk.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1452(String arg0, String arg1, String arg2) {
        field309 = arg0;
        field310 = arg1;
        field311 = arg2;
    }

    @ObfuscatedName("de.x(Lct;B)V")
    public static final void method2340(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field923.length; var2++) {
            Statics.field923[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field923[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field300[var8] = (Statics.field923[var8 - 1] + Statics.field923[var8 + 1] + Statics.field923[var8 - 128] + Statics.field923[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field923;
            Statics.field923 = Statics.field300;
            Statics.field300 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1475; var11++) {
            for (int var12 = 0; var12 < arg0.field1474; var12++) {
                if (arg0.field1476[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1471;
                    int var14 = var11 + 16 + arg0.field1473;
                    int var15 = (var14 << 7) + var13;
                    Statics.field923[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("da.o(IB)V")
    public static final void method2343(int arg0) {
        short var1 = 256;
        field302 += arg0 * 128;
        if (field302 > Statics.field923.length) {
            field302 -= Statics.field923.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2340(Statics.field312[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field301[var3 + var4] - Statics.field923[field302 + var3 & Statics.field923.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field301[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field301[var9 + var10] = 255;
                } else {
                    Statics.field301[var9 + var10] = 0;
                }
            }
        }
        if (field298 > 0) {
            field298 -= arg0 * 4;
        }
        if (field326 > 0) {
            field326 -= arg0 * 4;
        }
        if (field298 == 0 && field326 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field298 = 1024;
            }
            if (var12 == 1) {
                field326 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field297[var13] = field297[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field297[var14] = (int) (Math.sin((double) field305 / 14.0D) * 16.0D + Math.sin((double) field305 / 15.0D) * 14.0D + Math.sin((double) field305 / 16.0D) * 12.0D);
            field305++;
        }
        field303 += arg0 * -1073399285;
        int var15 = ((client.field465 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field303 * -694639700; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field301[(var18 << 7) + var17] = 192;
        }
        field303 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field301[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field301[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2003[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2003[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2003[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field301[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dg.a(IIII)I")
    public static final int method2230(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("al.w(Lba;I)V")
    public static void method834(class73 arg0) {
        if (class77.field1386 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1387 >= var1 && class77.field1387 <= var1 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(0, 0);
            return;
        }
        if (class77.field1387 >= var1 + 15 && class77.field1387 <= var1 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1387 >= var2 && class77.field1387 <= var2 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(1, 0);
            return;
        }
        if (class77.field1387 >= var2 + 15 && class77.field1387 <= var2 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1387 >= var3 && class77.field1387 <= var3 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(2, 0);
            return;
        }
        if (class77.field1387 >= var3 + 15 && class77.field1387 <= var3 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1387 >= var4 && class77.field1387 <= var4 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(3, 0);
            return;
        }
        if (class77.field1387 >= var4 + 15 && class77.field1387 <= var4 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2246(3, 1);
            return;
        }
        if (class77.field1387 >= 708 && class77.field1385 >= 4 && class77.field1387 <= 758 && class77.field1385 <= 20) {
            field316 = false;
            Statics.field2054.method1729(0, 0);
            Statics.field293.method1729(382, 0);
            Statics.field1991.method1819(382 - Statics.field1991.field1474 / 2, 18);
            return;
        }
        if (field322 == -1) {
            return;
        }
        class13 var5 = Statics.field259[field322];
        if (var5.method119() != client.field460) {
            client.field460 = var5.method119();
            boolean var6 = var5.method119();
            if (Statics.field245 != var6) {
                class40.method10();
                Statics.field245 = var6;
            }
        }
        Statics.field263 = var5.field191;
        client.field657 = var5.field188;
        client.field456 = var5.field184;
        Statics.field1658 = client.field458 == 0 ? 43594 : var5.field188 + 40000;
        Statics.field2406 = client.field458 == 0 ? 443 : var5.field188 + 50000;
        Statics.field1262 = Statics.field1658;
        field316 = false;
        Statics.field2054.method1729(0, 0);
        Statics.field293.method1729(382, 0);
        Statics.field1991.method1819(382 - Statics.field1991.field1474 / 2, 18);
        return;
    }

    @ObfuscatedName("ao.i(I)V")
    public static void method1238() {
        try {
            if (Statics.field1272 == null) {
                Statics.field1272 = new class24(Statics.field2345, new URL(Statics.field372));
            } else {
                byte[] var0 = Statics.field1272.method201();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field304 = var1.method2581();
                    Statics.field259 = new class13[field304];
                    int var2 = 0;
                    while (var2 < field304) {
                        class13 var3 = Statics.field259[var2] = new class13();
                        var3.field188 = var1.method2581();
                        var3.field184 = var1.method2489();
                        var3.field191 = var1.method2506();
                        var3.field190 = var1.method2506();
                        var3.field186 = var1.method2498();
                        var3.field185 = var1.method2542();
                        var3.field189 = var2++;
                    }
                    Statics.method634(Statics.field259, 0, Statics.field259.length - 1, field320, field321);
                    field316 = true;
                    Statics.field1272 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1272 = null;
        }
    }

    @ObfuscatedName("dm.y(IIB)V")
    public static void method2246(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field320[var5] != arg0) {
                var2[var4] = field320[var5];
                var3[var4] = field321[var5];
                var4++;
            }
        }
        field320 = var2;
        field321 = var3;
        Statics.method634(Statics.field259, 0, Statics.field259.length - 1, field320, field321);
    }
}
