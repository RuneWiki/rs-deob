package deob;

import java.awt.Graphics;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("o")
public class class21 {

    @ObfuscatedName("o.l")
    public static boolean field296 = false;

    @ObfuscatedName("o.y")
    public static int[] field309 = new int[256];

    @ObfuscatedName("o.m")
    public static int field285 = 0;

    @ObfuscatedName("o.o")
    public static int field287 = 0;

    @ObfuscatedName("o.z")
    public static int field286 = 0;

    @ObfuscatedName("o.ai")
    public static int field290 = 0;

    @ObfuscatedName("o.ag")
    public static int field291 = 0;

    @ObfuscatedName("o.as")
    public static int field292 = 0;

    @ObfuscatedName("o.al")
    public static int field308 = 10;

    @ObfuscatedName("o.aj")
    public static String field301 = "";

    @ObfuscatedName("o.am")
    public static int field295 = 0;

    @ObfuscatedName("o.ab")
    public static String field280 = "";

    @ObfuscatedName("o.ao")
    public static String field297 = "";

    @ObfuscatedName("o.ac")
    public static String field304 = "";

    @ObfuscatedName("o.ap")
    public static String field299 = "";

    @ObfuscatedName("o.at")
    public static String field300 = "";

    @ObfuscatedName("o.az")
    public static int field289 = 0;

    @ObfuscatedName("o.ae")
    public static String field302 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("o.aw")
    public static boolean field303 = false;

    @ObfuscatedName("o.au")
    public static int field305 = 0;

    @ObfuscatedName("o.bz")
    public static int[] field298 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("o.bl")
    public static int[] field293 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("o.bc")
    public static int field283 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.x(B)V")
    public static void method573() {
        if (!Statics.field294) {
            return;
        }
        Statics.field278 = null;
        Statics.field279 = null;
        Statics.field281 = null;
        Statics.field277 = null;
        Statics.field2555 = null;
        Statics.field1897 = null;
        Statics.field282 = null;
        Statics.field219 = null;
        Statics.field307 = null;
        Statics.field72 = null;
        Statics.field1236 = null;
        Statics.field1175 = null;
        Statics.field1976 = null;
        Statics.field1007 = null;
        Statics.field2322 = null;
        Statics.field190 = null;
        Statics.field1790 = null;
        Statics.field10 = null;
        Statics.field288 = null;
        Statics.field1413 = null;
        class138.method2327(2);
        if (Statics.field2531 != null) {
            try {
                class127 var0 = new class127(4);
                var0.method2396(2);
                var0.method2398(0);
                Statics.field2531.method1357(var0.field2015, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field2531.method1352();
                } catch (Exception var3) {
                }
                class153.field2515++;
                Statics.field2531 = null;
            }
        }
        Statics.field294 = false;
    }

    @ObfuscatedName("an.p(Lbo;B)V")
    public static void method880(class73 arg0) {
        if (!field303) {
            if (class77.field1370 == 1 && class77.field1372 >= 715 && class77.field1369 >= 453) {
                field296 = !field296;
                if (field296) {
                    class138.method1323();
                } else {
                    class154 var6 = Statics.field474;
                    int var7 = var6.method2934("scape main");
                    int var8 = var6.method2972(var7, "");
                    class138.method2342(var6, var7, var8, 255, false);
                }
            }
            if (client.field452 != 5) {
                field291++;
                if (client.field452 == 10) {
                    if (client.field451 == 0) {
                        if (class77.field1370 == 1) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class77.field1372 >= var9 && class77.field1372 <= var9 + var11 && class77.field1369 >= var10 && class77.field1369 <= var10 + var12) {
                                method142();
                                return;
                            }
                        }
                        if (Statics.field273 != null) {
                            method142();
                        }
                    }
                    int var13 = class77.field1370;
                    int var14 = class77.field1372;
                    int var15 = class77.field1369;
                    if (field295 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field295 = 3;
                            field289 = 0;
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field280 = class134.field2270;
                            field297 = class134.field2257;
                            field304 = class134.field2258;
                            field295 = 2;
                            field289 = 0;
                        }
                    } else if (field295 == 2) {
                        short var19 = 231;
                        int var31 = var19 + 30;
                        if (var13 == 1 && var15 >= var31 - 15 && var15 < var31) {
                            field289 = 0;
                        }
                        var31 += 15;
                        if (var13 == 1 && var15 >= var31 - 15 && var15 < var31) {
                            field289 = 1;
                        }
                        var31 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field299 = field299.trim();
                            if (field299.length() == 0) {
                                method139(class134.field2166, class134.field2167, class134.field2201);
                                return;
                            }
                            if (field300.length() == 0) {
                                method139(class134.field2169, class134.field2154, class134.field2230);
                                return;
                            }
                            method139(class134.field2259, class134.field2260, class134.field2261);
                            Statics.method2148(20);
                            return;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field295 = 0;
                            field299 = "";
                            field300 = "";
                        }
                        while (true) {
                            while (true) {
                                class75 var23 = class75.field1338;
                                boolean var24;
                                synchronized (class75.field1338) {
                                    if (class75.field1345 == class75.field1343) {
                                        var24 = false;
                                    } else {
                                        Statics.field1230 = class75.field1341[class75.field1343];
                                        Statics.field1017 = class75.field1339[class75.field1343];
                                        class75.field1343 = class75.field1343 + 1 & 0x7F;
                                        var24 = true;
                                    }
                                }
                                if (!var24) {
                                    return;
                                }
                                boolean var26 = false;
                                for (int var27 = 0; var27 < field302.length(); var27++) {
                                    if (Statics.field1017 == field302.charAt(var27)) {
                                        var26 = true;
                                        break;
                                    }
                                }
                                if (field289 == 0) {
                                    if (Statics.field1230 == 85 && field299.length() > 0) {
                                        field299 = field299.substring(0, field299.length() - 1);
                                    }
                                    if (Statics.field1230 == 84 || Statics.field1230 == 80) {
                                        field289 = 1;
                                    }
                                    if (var26 && field299.length() < 320) {
                                        field299 = field299 + Statics.field1017;
                                    }
                                } else if (field289 == 1) {
                                    if (Statics.field1230 == 85 && field300.length() > 0) {
                                        field300 = field300.substring(0, field300.length() - 1);
                                    }
                                    if (Statics.field1230 == 84 || Statics.field1230 == 80) {
                                        field289 = 0;
                                    }
                                    if (Statics.field1230 == 84) {
                                        field299 = field299.trim();
                                        if (field299.length() == 0) {
                                            method139(class134.field2166, class134.field2167, class134.field2201);
                                            return;
                                        }
                                        if (field300.length() == 0) {
                                            method139(class134.field2169, class134.field2154, class134.field2230);
                                            return;
                                        }
                                        method139(class134.field2259, class134.field2260, class134.field2261);
                                        Statics.method2148(20);
                                        return;
                                    }
                                    if (var26 && field300.length() < 20) {
                                        field300 = field300 + Statics.field1017;
                                    }
                                }
                            }
                        }
                    } else if (field295 == 3) {
                        short var28 = 382;
                        short var29 = 321;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var29 - 20 && var15 <= var29 + 20) {
                            field295 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1370 == 1) {
            short var1 = 280;
            if (class77.field1372 >= var1 && class77.field1372 <= var1 + 14 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                method1461(0, 0);
            } else if (class77.field1372 >= var1 + 15 && class77.field1372 <= var1 + 80 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                method1461(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1372 >= var2 && class77.field1372 <= var2 + 14 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                    method1461(1, 0);
                } else if (class77.field1372 >= var2 + 15 && class77.field1372 <= var2 + 80 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                    method1461(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1372 >= var3 && class77.field1372 <= var3 + 14 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                        method1461(2, 0);
                    } else if (class77.field1372 >= var3 + 15 && class77.field1372 <= var3 + 80 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                        method1461(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1372 >= var4 && class77.field1372 <= var4 + 14 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                            method1461(3, 0);
                        } else if (class77.field1372 >= var4 + 15 && class77.field1372 <= var4 + 80 && class77.field1369 >= 4 && class77.field1369 <= 18) {
                            method1461(3, 1);
                        } else if (class77.field1372 >= 708 && class77.field1369 >= 4 && class77.field1372 <= 758 && class77.field1369 <= 20) {
                            field303 = false;
                            Statics.field277.method1633(0, 0);
                            Statics.field2555.method1633(382, 0);
                            Statics.field1897.method1721(382 - Statics.field1897.field1454 / 2, 18);
                        } else if (field283 != -1) {
                            class13 var5 = Statics.field306[field283];
                            if (client.field449 != var5.field183) {
                                client.field449 = var5.field183;
                                class40.method649(var5.field183);
                            }
                            Statics.field375 = var5.field184;
                            client.field446 = var5.field193;
                            Statics.field443 = client.field459 == 0 ? 43594 : var5.field193 + 40000;
                            Statics.field227 = client.field459 == 0 ? 443 : var5.field193 + 50000;
                            Statics.field618 = Statics.field443;
                            field303 = false;
                            Statics.field277.method1633(0, 0);
                            Statics.field2555.method1633(382, 0);
                            Statics.field1897.method1721(382 - Statics.field1897.field1454 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.k(Lgh;Lgh;I)V")
    public static void method50(class183 arg0, class183 arg1) {
        if (field303) {
            if (Statics.field219 == null) {
                Statics.field219 = class84.method612(Statics.field336, "sl_back", "");
            }
            if (Statics.field307 == null) {
                Statics.field307 = class84.method676(Statics.field336, "sl_flags", "");
            }
            if (Statics.field72 == null) {
                Statics.field72 = class84.method676(Statics.field336, "sl_arrows", "");
            }
            if (Statics.field1236 == null) {
                Statics.field1236 = class84.method676(Statics.field336, "sl_stars", "");
            }
            class89.method1767(0, 23, 765, 480, 0);
            class89.method1738(0, 0, 125, 23, 12425273, 9135624);
            class89.method1738(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3366(class134.field2274, 62, 15, 0, -1);
            if (Statics.field1236 != null) {
                Statics.field1236[1].method1721(140, 1);
                arg1.method3327(class134.field2275, 152, 10, 16777215, -1);
                Statics.field1236[0].method1721(140, 12);
                arg1.method3327(class134.field2276, 152, 21, 16777215, -1);
            }
            if (Statics.field72 != null) {
                short var2 = 280;
                if (field298[0] == 0 && field293[0] == 0) {
                    Statics.field72[2].method1721(var2, 4);
                } else {
                    Statics.field72[0].method1721(var2, 4);
                }
                if (field298[0] == 0 && field293[0] == 1) {
                    Statics.field72[3].method1721(var2 + 15, 4);
                } else {
                    Statics.field72[1].method1721(var2 + 15, 4);
                }
                arg0.method3327(class134.field2102, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field298[0] == 1 && field293[0] == 0) {
                    Statics.field72[2].method1721(var3, 4);
                } else {
                    Statics.field72[0].method1721(var3, 4);
                }
                if (field298[0] == 1 && field293[0] == 1) {
                    Statics.field72[3].method1721(var3 + 15, 4);
                } else {
                    Statics.field72[1].method1721(var3 + 15, 4);
                }
                arg0.method3327(class134.field2065, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field298[0] == 2 && field293[0] == 0) {
                    Statics.field72[2].method1721(var4, 4);
                } else {
                    Statics.field72[0].method1721(var4, 4);
                }
                if (field298[0] == 2 && field293[0] == 1) {
                    Statics.field72[3].method1721(var4 + 15, 4);
                } else {
                    Statics.field72[1].method1721(var4 + 15, 4);
                }
                arg0.method3327(class134.field2279, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field298[0] == 3 && field293[0] == 0) {
                    Statics.field72[2].method1721(var5, 4);
                } else {
                    Statics.field72[0].method1721(var5, 4);
                }
                if (field298[0] == 3 && field293[0] == 1) {
                    Statics.field72[3].method1721(var5 + 15, 4);
                } else {
                    Statics.field72[1].method1721(var5 + 15, 4);
                }
                arg0.method3327(class134.field2232, var5 + 32, 17, 16777215, -1);
            }
            class89.method1767(708, 4, 50, 16, 0);
            arg1.method3366(class134.field2268, 733, 16, 16777215, -1);
            field283 = -1;
            if (Statics.field219 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field305) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field305) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field305) {
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
                for (int var19 = 0; var19 < field305; var19++) {
                    class13 var20 = Statics.field306[var19];
                    boolean var21 = true;
                    String var22 = Integer.toString(var20.field195);
                    if (var20.field195 == -1) {
                        var22 = class134.field2281;
                        var21 = false;
                    } else if (var20.field195 > 1980) {
                        var22 = class134.field2103;
                        var21 = false;
                    }
                    if (class77.field1373 >= var17 && class77.field1366 >= var16 && class77.field1373 < var6 + var17 && class77.field1366 < var7 + var16 && var21) {
                        field283 = var19;
                        Statics.field219[var20.field183 ? 1 : 0].method1636(var17, var16, 128, 16777215);
                    } else {
                        Statics.field219[var20.field183 ? 1 : 0].method1633(var17, var16);
                    }
                    if (Statics.field307 != null) {
                        Statics.field307[(var20.field183 ? 8 : 0) + var20.field185].method1721(var17 + 29, var16);
                    }
                    arg0.method3366(Integer.toString(var20.field193), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3366(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
                Graphics var23 = Statics.field831.getGraphics();
                Statics.field778.method1568(var23, 0, 0);
            } catch (Exception var103) {
                Statics.field831.repaint();
            }
            return;
        }
        if (client.field452 == 0 || client.field452 == 5) {
            byte var25 = 20;
            arg0.method3366(class134.field2255, 382, 245 - var25, 16777215, -1);
            int var26 = 253 - var25;
            class89.method1739(230, var26, 304, 34, 9179409);
            class89.method1739(231, var26 + 1, 302, 32, 0);
            class89.method1767(232, var26 + 2, field308 * 3, 30, 9179409);
            class89.method1767(field308 * 3 + 232, var26 + 2, 300 - field308 * 3, 30, 0);
            arg0.method3366(field301, 382, 276 - var25, 16777215, -1);
        }
        if (client.field452 == 20) {
            Statics.field278.method1721(382 - Statics.field278.field1454 / 2, 271 - Statics.field278.field1452 / 2);
            short var27 = 211;
            arg0.method3366(field280, 382, var27, 16776960, 0);
            int var105 = var27 + 15;
            arg0.method3366(field297, 382, var105, 16776960, 0);
            int var106 = var105 + 15;
            arg0.method3366(field304, 382, var106, 16776960, 0);
            int var107 = var106 + 15;
            int var108 = var107 + 10;
            arg0.method3327(class134.field2262, 272, var108, 16777215, 0);
            short var28 = 200;
            String var29;
            for (var29 = field299; arg0.method3323(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
            }
            arg0.method3327(class185.method3326(var29), 312, var108, 16777215, 0);
            var105 = var108 + 15;
            arg0.method3327(class134.field2225 + class147.method733(field300), 274, var105, 16777215, 0);
            var105 += 15;
        }
        if (client.field452 == 10) {
            Statics.field278.method1721(202, 171);
            if (field295 == 0) {
                short var30 = 251;
                arg0.method3366(class134.field2171, 382, var30, 16776960, 0);
                int var109 = var30 + 30;
                short var31 = 302;
                short var32 = 291;
                Statics.field279.method1721(var31 - 73, var32 - 20);
                arg0.method3329(class134.field2243, var31 - 73, var32 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var33 = 462;
                Statics.field279.method1721(var33 - 73, var32 - 20);
                arg0.method3329(class134.field2266, var33 - 73, var32 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field295 == 2) {
                short var34 = 211;
                arg0.method3366(field280, 382, var34, 16776960, 0);
                int var110 = var34 + 15;
                arg0.method3366(field297, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method3366(field304, 382, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var113 = var112 + 10;
                arg0.method3327(class134.field2262, 272, var113, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field299; arg0.method3323(var36) > var35; var36 = var36.substring(1)) {
                }
                arg0.method3327(class185.method3326(var36) + (field289 == 0 & client.field668 % 40 < 20 ? class2.method2892(16776960) + class2.field22 : ""), 312, var113, 16777215, 0);
                var110 = var113 + 15;
                arg0.method3327(class134.field2225 + class147.method733(field300) + (field289 == 1 & client.field668 % 40 < 20 ? class2.method2892(16776960) + class2.field22 : ""), 274, var110, 16777215, 0);
                var110 += 15;
                short var37 = 302;
                short var38 = 321;
                Statics.field279.method1721(var37 - 73, var38 - 20);
                arg0.method3366(class134.field2267, var37, var38 + 5, 16777215, 0);
                short var39 = 462;
                Statics.field279.method1721(var39 - 73, var38 - 20);
                arg0.method3366(class134.field2268, var39, var38 + 5, 16777215, 0);
            } else if (field295 == 3) {
                arg0.method3366(class134.field2269, 382, 211, 16776960, 0);
                short var40 = 236;
                arg0.method3366(class134.field2107, 382, var40, 16777215, 0);
                int var114 = var40 + 15;
                arg0.method3366(class134.field2271, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3366(class134.field2272, 382, var115, 16777215, 0);
                int var116 = var115 + 15;
                arg0.method3366(class134.field2159, 382, var116, 16777215, 0);
                int var117 = var116 + 15;
                short var41 = 382;
                short var42 = 321;
                Statics.field279.method1721(var41 - 73, var42 - 20);
                arg0.method3366(class134.field2268, var41, var42 + 5, 16777215, 0);
            }
        }
        if (field291 > 0) {
            int var43 = field291;
            short var44 = 256;
            field286 += var43 * 128;
            if (field286 > Statics.field1790.length) {
                field286 -= Statics.field1790.length;
                int var45 = (int) (Math.random() * 12.0D);
                method210(Statics.field281[var45]);
            }
            int var46 = 0;
            int var47 = var43 * 128;
            int var48 = (var44 - var43) * 128;
            for (int var49 = 0; var49 < var48; var49++) {
                int var50 = Statics.field288[var46 + var47] - Statics.field1790[field286 + var46 & Statics.field1790.length - 1] * var43 / 6;
                if (var50 < 0) {
                    var50 = 0;
                }
                Statics.field288[var46++] = var50;
            }
            for (int var51 = var44 - var43; var51 < var44; var51++) {
                int var52 = var51 * 128;
                for (int var53 = 0; var53 < 128; var53++) {
                    int var54 = (int) (Math.random() * 100.0D);
                    if (var54 < 50 && var53 > 10 && var53 < 118) {
                        Statics.field288[var52 + var53] = 255;
                    } else {
                        Statics.field288[var52 + var53] = 0;
                    }
                }
            }
            if (field285 > 0) {
                field285 -= var43 * 4;
            }
            if (field287 > 0) {
                field287 -= var43 * 4;
            }
            if (field285 == 0 && field287 == 0) {
                int var55 = (int) (Math.random() * (double) (2000 / var43));
                if (var55 == 0) {
                    field285 = 1024;
                }
                if (var55 == 1) {
                    field287 = 1024;
                }
            }
            for (int var56 = 0; var56 < var44 - var43; var56++) {
                field309[var56] = field309[var43 + var56];
            }
            for (int var57 = var44 - var43; var57 < var44; var57++) {
                field309[var57] = (int) (Math.sin((double) field292 / 14.0D) * 16.0D + Math.sin((double) field292 / 15.0D) * 14.0D + Math.sin((double) field292 / 16.0D) * 12.0D);
                field292++;
            }
            field290 += var43 * -1197217371;
            int var58 = ((client.field668 & 0x1) + var43) / 2;
            if (var58 > 0) {
                for (int var59 = 0; var59 < field290 * 1171499412; var59++) {
                    int var60 = (int) (Math.random() * 124.0D) + 2;
                    int var61 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field288[(var61 << 7) + var60] = 192;
                }
                field290 = 0;
                int var62 = 0;
                label475: while (true) {
                    if (var62 >= var44) {
                        int var66 = 0;
                        while (true) {
                            if (var66 >= 128) {
                                break label475;
                            }
                            int var67 = 0;
                            for (int var68 = -var58; var68 < var44; var68++) {
                                int var69 = var68 * 128;
                                if (var58 + var68 < var44) {
                                    var67 += Statics.field1413[var58 * 128 + var66 + var69];
                                }
                                if (var68 - (var58 + 1) >= 0) {
                                    var67 -= Statics.field1413[var66 + var69 - (var58 + 1) * 128];
                                }
                                if (var68 >= 0) {
                                    Statics.field288[var66 + var69] = var67 / (var58 * 2 + 1);
                                }
                            }
                            var66++;
                        }
                    }
                    int var63 = 0;
                    int var64 = var62 * 128;
                    for (int var65 = -var58; var65 < 128; var65++) {
                        if (var58 + var65 < 128) {
                            var63 += Statics.field288[var64 + var65 + var58];
                        }
                        if (var65 - (var58 + 1) >= 0) {
                            var63 -= Statics.field288[var64 + var65 - (var58 + 1)];
                        }
                        if (var65 >= 0) {
                            Statics.field1413[var64 + var65] = var63 / (var58 * 2 + 1);
                        }
                    }
                    var62++;
                }
            }
            field291 = 0;
        }
        short var70 = 256;
        if (field285 > 0) {
            for (int var71 = 0; var71 < 256; var71++) {
                if (field285 > 768) {
                    Statics.field190[var71] = method2188(Statics.field1976[var71], Statics.field1007[var71], 1024 - field285);
                } else if (field285 > 256) {
                    Statics.field190[var71] = Statics.field1007[var71];
                } else {
                    Statics.field190[var71] = method2188(Statics.field1007[var71], Statics.field1976[var71], 256 - field285);
                }
            }
        } else if (field287 > 0) {
            for (int var72 = 0; var72 < 256; var72++) {
                if (field287 > 768) {
                    Statics.field190[var72] = method2188(Statics.field1976[var72], Statics.field2322[var72], 1024 - field287);
                } else if (field287 > 256) {
                    Statics.field190[var72] = Statics.field2322[var72];
                } else {
                    Statics.field190[var72] = method2188(Statics.field2322[var72], Statics.field1976[var72], 256 - field287);
                }
            }
        } else {
            for (int var73 = 0; var73 < 256; var73++) {
                Statics.field190[var73] = Statics.field1976[var73];
            }
        }
        class89.method1731(0, 9, 128, var70 + 7);
        Statics.field277.method1633(0, 0);
        class89.method1730();
        int var74 = 0;
        int var75 = 6885;
        for (int var76 = 1; var76 < var70 - 1; var76++) {
            int var77 = (var70 - var76) * field309[var76] / var70;
            int var78 = var77 + 22;
            if (var78 < 0) {
                var78 = 0;
            }
            var74 += var78;
            for (int var79 = var78; var79 < 128; var79++) {
                int var80 = Statics.field288[var74++];
                if (var80 == 0) {
                    var75++;
                } else {
                    int var82 = 256 - var80;
                    int var83 = Statics.field190[var80];
                    int var84 = Statics.field778.field1435[var75];
                    Statics.field778.field1435[var75++] = ((var83 & 0xFF00FF) * var80 + (var84 & 0xFF00FF) * var82 & 0xFF00FF00) + ((var83 & 0xFF00) * var80 + (var84 & 0xFF00) * var82 & 0xFF0000) >> 8;
                }
            }
            var75 += var78 + 765 - 128;
        }
        class89.method1731(637, 9, 765, var70 + 7);
        Statics.field2555.method1633(382, 0);
        class89.method1730();
        int var85 = 0;
        int var86 = 7546;
        for (int var87 = 1; var87 < var70 - 1; var87++) {
            int var88 = (var70 - var87) * field309[var87] / var70;
            int var89 = 103 - var88;
            int var90 = var86 + var88;
            for (int var91 = 0; var91 < var89; var91++) {
                int var92 = Statics.field288[var85++];
                if (var92 == 0) {
                    var90++;
                } else {
                    int var94 = 256 - var92;
                    int var95 = Statics.field190[var92];
                    int var96 = Statics.field778.field1435[var90];
                    Statics.field778.field1435[var90++] = ((var95 & 0xFF00) * var92 + (var96 & 0xFF00) * var94 & 0xFF0000) + ((var95 & 0xFF00FF) * var92 + (var96 & 0xFF00FF) * var94 & 0xFF00FF00) >> 8;
                }
            }
            var85 += 128 - var89;
            var86 = 765 - var89 - var88 + var90;
        }
        Statics.field282[field296 ? 1 : 0].method1721(725, 463);
        if (client.field452 > 5 && client.field451 == 0) {
            if (Statics.field1175 == null) {
                Statics.field1175 = class84.method145(Statics.field336, "sl_button", "");
            } else {
                byte var97 = 5;
                short var98 = 463;
                byte var99 = 100;
                byte var100 = 35;
                Statics.field1175.method1721(var97, var98);
                arg0.method3366(class134.field2210 + " " + client.field446, var99 / 2 + var97, var100 / 2 + var98 - 2, 16777215, 0);
                if (Statics.field273 == null) {
                    arg1.method3366(class134.field2284, var99 / 2 + var97, var100 / 2 + var98 + 12, 16777215, 0);
                } else {
                    arg1.method3366(class134.field2264, var99 / 2 + var97, var100 / 2 + var98 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var101 = Statics.field831.getGraphics();
            Statics.field778.method1568(var101, 0, 0);
        } catch (Exception var104) {
            Statics.field831.repaint();
        }
    }

    @ObfuscatedName("b.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method139(String arg0, String arg1, String arg2) {
        field280 = arg0;
        field297 = arg1;
        field304 = arg2;
    }

    @ObfuscatedName("i.q(Lci;I)V")
    public static final void method210(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1790.length; var2++) {
            Statics.field1790[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1790[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field10[var8] = (Statics.field1790[var8 - 1] + Statics.field1790[var8 + 1] + Statics.field1790[var8 - 128] + Statics.field1790[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1790;
            Statics.field1790 = Statics.field10;
            Statics.field10 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1452; var11++) {
            for (int var12 = 0; var12 < arg0.field1454; var12++) {
                if (arg0.field1453[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1456;
                    int var14 = var11 + 16 + arg0.field1458;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1790[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dn.j(IIII)I")
    public static final int method2188(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("r.v(I)V")
    public static void method142() {
        try {
            if (Statics.field273 == null) {
                Statics.field273 = new class24(Statics.field1301, new URL(Statics.field1256));
            } else {
                byte[] var0 = Statics.field273.method208();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field305 = var1.method2539();
                    Statics.field306 = new class13[field305];
                    int var2 = 0;
                    while (var2 < field305) {
                        class13 var3 = Statics.field306[var2] = new class13();
                        int var4 = var1.method2539();
                        var3.field193 = var4 & 0x7FFF;
                        var3.field183 = (var4 & 0x8000) != 0;
                        var3.field184 = var1.method2571();
                        var3.field185 = var1.method2484();
                        var3.field195 = var1.method2517();
                        var3.field186 = var2++;
                    }
                    Statics.method34(Statics.field306, 0, Statics.field306.length - 1, field298, field293);
                    field303 = true;
                    Statics.field273 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field273 = null;
        }
    }

    @ObfuscatedName("bp.w(IIB)V")
    public static void method1461(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field298[var5] != arg0) {
                var2[var4] = field298[var5];
                var3[var4] = field293[var5];
                var4++;
            }
        }
        field298 = var2;
        field293 = var3;
        Statics.method34(Statics.field306, 0, Statics.field306.length - 1, field298, field293);
    }
}
