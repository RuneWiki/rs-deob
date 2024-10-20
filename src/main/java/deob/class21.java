package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("m")
public class class21 {

    @ObfuscatedName("m.t")
    public static boolean field327 = false;

    @ObfuscatedName("m.k")
    public static int[] field306 = new int[256];

    @ObfuscatedName("m.l")
    public static int field314 = 0;

    @ObfuscatedName("m.m")
    public static int field309 = 0;

    @ObfuscatedName("m.c")
    public static int field315 = 0;

    @ObfuscatedName("m.am")
    public static int field311 = 0;

    @ObfuscatedName("m.ap")
    public static int field312 = 0;

    @ObfuscatedName("m.au")
    public static int field298 = 0;

    @ObfuscatedName("m.ab")
    public static int field313 = 10;

    @ObfuscatedName("m.ae")
    public static String field323 = "";

    @ObfuscatedName("m.as")
    public static int field316 = 0;

    @ObfuscatedName("m.av")
    public static String field317 = "";

    @ObfuscatedName("m.ar")
    public static String field318 = "";

    @ObfuscatedName("m.ad")
    public static String field319 = "";

    @ObfuscatedName("m.ac")
    public static String field320 = "";

    @ObfuscatedName("m.ax")
    public static String field321 = "";

    @ObfuscatedName("m.ao")
    public static int field322 = 0;

    @ObfuscatedName("m.aj")
    public static String field310 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("m.ak")
    public static boolean field324 = false;

    @ObfuscatedName("m.aw")
    public static int field325 = 0;

    @ObfuscatedName("m.by")
    public static int[] field329 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("m.bp")
    public static int[] field304 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("m.bg")
    public static int field328 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.j(Lez;Lez;I)I")
    public static int method1587(class152 arg0, class152 arg1) {
        int var2 = 0;
        if (arg0.method2977("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2977("logo", "")) {
            var2++;
        }
        if (arg1.method2977("titlebox", "")) {
            var2++;
        }
        if (arg1.method2977("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2977("runes", "")) {
            var2++;
        }
        if (arg1.method2977("title_mute", "")) {
            var2++;
        }
        arg1.method2977("sl_back", "");
        arg1.method2977("sl_flags", "");
        arg1.method2977("sl_arrows", "");
        arg1.method2977("sl_stars", "");
        arg1.method2977("sl_button", "");
        return var2;
    }

    @ObfuscatedName("p.r(I)I")
    public static int method35() {
        return 6;
    }

    @ObfuscatedName("s.v(B)V")
    public static void method244() {
        if (!Statics.field333) {
            return;
        }
        Statics.field299 = null;
        Statics.field300 = null;
        Statics.field301 = null;
        Statics.field326 = null;
        Statics.field173 = null;
        Statics.field1999 = null;
        Statics.field303 = null;
        Statics.field334 = null;
        Statics.field780 = null;
        Statics.field1781 = null;
        Statics.field244 = null;
        Statics.field253 = null;
        Statics.field1442 = null;
        Statics.field302 = null;
        Statics.field363 = null;
        Statics.field294 = null;
        Statics.field909 = null;
        Statics.field2311 = null;
        Statics.field187 = null;
        Statics.field1907 = null;
        class138.method33(2);
        class153.method1589(true);
        Statics.field333 = false;
    }

    @ObfuscatedName("dl.p(Lbv;I)V")
    public static void method2316(class73 arg0) {
        if (!field324) {
            if (class77.field1374 == 1 && class77.field1381 >= 715 && class77.field1373 >= 453) {
                field327 = !field327;
                if (field327) {
                    class138.method777();
                } else {
                    class138.method149(Statics.field98, "scape main", "", 255, false);
                }
            }
            if (client.field480 != 5) {
                field312++;
                if (client.field480 == 10) {
                    if (client.field601 == 0) {
                        if (class77.field1374 == 1) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class77.field1381 >= var9 && class77.field1381 <= var9 + var11 && class77.field1373 >= var10 && class77.field1373 <= var10 + var12) {
                                method44();
                                return;
                            }
                        }
                        if (Statics.field1499 != null) {
                            method44();
                        }
                    }
                    int var13 = class77.field1374;
                    int var14 = class77.field1381;
                    int var15 = class77.field1373;
                    if (field316 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field316 = 3;
                            field322 = 0;
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field317 = class134.field2104;
                            field318 = class134.field2274;
                            field319 = class134.field2275;
                            field316 = 2;
                            field322 = 0;
                        }
                    } else if (field316 == 2) {
                        short var19 = 231;
                        int var28 = var19 + 30;
                        if (var13 == 1 && var15 >= var28 - 15 && var15 < var28) {
                            field322 = 0;
                        }
                        var28 += 15;
                        if (var13 == 1 && var15 >= var28 - 15 && var15 < var28) {
                            field322 = 1;
                        }
                        var28 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field320 = field320.trim();
                            if (field320.length() == 0) {
                                method800(class134.field2123, class134.field2296, class134.field2134);
                                return;
                            }
                            if (field321.length() == 0) {
                                method800(class134.field2186, class134.field2187, class134.field2188);
                                return;
                            }
                            method800(class134.field2144, class134.field2288, class134.field2278);
                            client.method62(20);
                            return;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field316 = 0;
                            field320 = "";
                            field321 = "";
                        }
                        while (true) {
                            while (class75.method595()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field310.length(); var24++) {
                                    if (Statics.field1261 == field310.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (field322 == 0) {
                                    if (Statics.field1289 == 85 && field320.length() > 0) {
                                        field320 = field320.substring(0, field320.length() - 1);
                                    }
                                    if (Statics.field1289 == 84 || Statics.field1289 == 80) {
                                        field322 = 1;
                                    }
                                    if (var23 && field320.length() < 320) {
                                        field320 = field320 + Statics.field1261;
                                    }
                                } else if (field322 == 1) {
                                    if (Statics.field1289 == 85 && field321.length() > 0) {
                                        field321 = field321.substring(0, field321.length() - 1);
                                    }
                                    if (Statics.field1289 == 84 || Statics.field1289 == 80) {
                                        field322 = 0;
                                    }
                                    if (Statics.field1289 == 84) {
                                        field320 = field320.trim();
                                        if (field320.length() == 0) {
                                            method800(class134.field2123, class134.field2296, class134.field2134);
                                            return;
                                        }
                                        if (field321.length() == 0) {
                                            method800(class134.field2186, class134.field2187, class134.field2188);
                                            return;
                                        }
                                        method800(class134.field2144, class134.field2288, class134.field2278);
                                        client.method62(20);
                                        return;
                                    }
                                    if (var23 && field321.length() < 20) {
                                        field321 = field321 + Statics.field1261;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field316 == 3) {
                        short var25 = 382;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field316 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1374 == 1) {
            short var1 = 280;
            if (class77.field1381 >= var1 && class77.field1381 <= var1 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                method601(0, 0);
            } else if (class77.field1381 >= var1 + 15 && class77.field1381 <= var1 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                method601(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1381 >= var2 && class77.field1381 <= var2 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                    method601(1, 0);
                } else if (class77.field1381 >= var2 + 15 && class77.field1381 <= var2 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                    method601(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1381 >= var3 && class77.field1381 <= var3 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                        method601(2, 0);
                    } else if (class77.field1381 >= var3 + 15 && class77.field1381 <= var3 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                        method601(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1381 >= var4 && class77.field1381 <= var4 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                            method601(3, 0);
                        } else if (class77.field1381 >= var4 + 15 && class77.field1381 <= var4 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
                            method601(3, 1);
                        } else if (class77.field1381 >= 708 && class77.field1373 >= 4 && class77.field1381 <= 758 && class77.field1373 <= 20) {
                            field324 = false;
                            Statics.field326.method1681(0, 0);
                            Statics.field173.method1681(382, 0);
                            Statics.field1999.method1765(382 - Statics.field1999.field1459 / 2, 18);
                        } else if (field328 != -1) {
                            class13 var5 = Statics.field193[field328];
                            if (client.field476 == var5.field189) {
                                Statics.field2553 = var5.field188;
                                client.field473 = var5.field195;
                                Statics.field134 = client.field474 == 0 ? 43594 : var5.field195 + 40000;
                                Statics.field746 = client.field474 == 0 ? 443 : var5.field195 + 50000;
                                Statics.field1312 = Statics.field134;
                                field324 = false;
                                Statics.field326.method1681(0, 0);
                                Statics.field173.method1681(382, 0);
                                Statics.field1999.method1765(382 - Statics.field1999.field1459 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field474 != 0) {
                                    var6 = ":" + (var5.field195 + 7000);
                                }
                                String var7 = "http://" + var5.field188 + var6 + "/j" + client.field607;
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

    @ObfuscatedName("b.e(Lgt;Lgt;B)V")
    public static void method228(class183 arg0, class183 arg1) {
        if (field324) {
            if (Statics.field334 == null) {
                Statics.field334 = class84.method165(Statics.field1911, "sl_back", "");
            }
            if (Statics.field780 == null) {
                Statics.field780 = class84.method197(Statics.field1911, "sl_flags", "");
            }
            if (Statics.field1781 == null) {
                Statics.field1781 = class84.method197(Statics.field1911, "sl_arrows", "");
            }
            if (Statics.field244 == null) {
                Statics.field244 = class84.method197(Statics.field1911, "sl_stars", "");
            }
            class89.method1787(0, 23, 765, 480, 0);
            class89.method1788(0, 0, 125, 23, 12425273, 9135624);
            class89.method1788(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3411(class134.field2291, 62, 15, 0, -1);
            if (Statics.field244 != null) {
                Statics.field244[1].method1765(140, 1);
                arg1.method3409(class134.field2189, 152, 10, 16777215, -1);
                Statics.field244[0].method1765(140, 12);
                arg1.method3409(class134.field2293, 152, 21, 16777215, -1);
            }
            if (Statics.field1781 != null) {
                short var2 = 280;
                if (field329[0] == 0 && field304[0] == 0) {
                    Statics.field1781[2].method1765(var2, 4);
                } else {
                    Statics.field1781[0].method1765(var2, 4);
                }
                if (field329[0] == 0 && field304[0] == 1) {
                    Statics.field1781[3].method1765(var2 + 15, 4);
                } else {
                    Statics.field1781[1].method1765(var2 + 15, 4);
                }
                arg0.method3409(class134.field2076, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field329[0] == 1 && field304[0] == 0) {
                    Statics.field1781[2].method1765(var3, 4);
                } else {
                    Statics.field1781[0].method1765(var3, 4);
                }
                if (field329[0] == 1 && field304[0] == 1) {
                    Statics.field1781[3].method1765(var3 + 15, 4);
                } else {
                    Statics.field1781[1].method1765(var3 + 15, 4);
                }
                arg0.method3409(class134.field2295, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field329[0] == 2 && field304[0] == 0) {
                    Statics.field1781[2].method1765(var4, 4);
                } else {
                    Statics.field1781[0].method1765(var4, 4);
                }
                if (field329[0] == 2 && field304[0] == 1) {
                    Statics.field1781[3].method1765(var4 + 15, 4);
                } else {
                    Statics.field1781[1].method1765(var4 + 15, 4);
                }
                arg0.method3409(class134.field2168, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field329[0] == 3 && field304[0] == 0) {
                    Statics.field1781[2].method1765(var5, 4);
                } else {
                    Statics.field1781[0].method1765(var5, 4);
                }
                if (field329[0] == 3 && field304[0] == 1) {
                    Statics.field1781[3].method1765(var5 + 15, 4);
                } else {
                    Statics.field1781[1].method1765(var5 + 15, 4);
                }
                arg0.method3409(class134.field2297, var5 + 32, 17, 16777215, -1);
            }
            class89.method1787(708, 4, 50, 16, 0);
            arg1.method3411(class134.field2285, 733, 16, 16777215, -1);
            field328 = -1;
            if (Statics.field334 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field325) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field325) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field325) {
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
                for (int var19 = 0; var19 < field325; var19++) {
                    class13 var20 = Statics.field193[var19];
                    boolean var21 = true;
                    String var22 = Integer.toString(var20.field190);
                    if (var20.field190 == -1) {
                        var22 = class134.field2298;
                        var21 = false;
                    } else if (var20.field190 > 1980) {
                        var22 = class134.field2299;
                        var21 = false;
                    }
                    if (class77.field1382 >= var17 && class77.field1375 >= var16 && class77.field1382 < var6 + var17 && class77.field1375 < var7 + var16 && var21) {
                        field328 = var19;
                        Statics.field334[var20.field189 ? 1 : 0].method1686(var17, var16, 128, 16777215);
                    } else {
                        Statics.field334[var20.field189 ? 1 : 0].method1681(var17, var16);
                    }
                    if (Statics.field780 != null) {
                        Statics.field780[(var20.field189 ? 8 : 0) + var20.field191].method1765(var17 + 29, var16);
                    }
                    arg0.method3411(Integer.toString(var20.field195), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3411(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
                Graphics var23 = Statics.field1494.getGraphics();
                Statics.field468.method1594(var23, 0, 0);
            } catch (Exception var92) {
                Statics.field1494.repaint();
            }
            return;
        }
        if (client.field480 == 0 || client.field480 == 5) {
            byte var25 = 20;
            arg0.method3411(class134.field2272, 382, 245 - var25, 16777215, -1);
            int var26 = 253 - var25;
            class89.method1831(230, var26, 304, 34, 9179409);
            class89.method1831(231, var26 + 1, 302, 32, 0);
            class89.method1787(232, var26 + 2, field313 * 3, 30, 9179409);
            class89.method1787(field313 * 3 + 232, var26 + 2, 300 - field313 * 3, 30, 0);
            arg0.method3411(field323, 382, 276 - var25, 16777215, -1);
        }
        if (client.field480 == 20) {
            Statics.field299.method1765(382 - Statics.field299.field1459 / 2, 271 - Statics.field299.field1458 / 2);
            short var27 = 211;
            arg0.method3411(field317, 382, var27, 16776960, 0);
            int var94 = var27 + 15;
            arg0.method3411(field318, 382, var94, 16776960, 0);
            int var95 = var94 + 15;
            arg0.method3411(field319, 382, var95, 16776960, 0);
            int var96 = var95 + 15;
            int var97 = var96 + 10;
            arg0.method3409(class134.field2246, 272, var97, 16777215, 0);
            short var28 = 200;
            String var29;
            for (var29 = field320; arg0.method3394(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
            }
            arg0.method3409(class185.method3398(var29), 312, var97, 16777215, 0);
            var94 = var97 + 15;
            String var31 = class134.field2190;
            String var32 = field321;
            int var33 = var32.length();
            char[] var34 = new char[var33];
            for (int var35 = 0; var35 < var33; var35++) {
                var34[var35] = '*';
            }
            String var36 = new String(var34);
            arg0.method3409(var31 + var36, 274, var94, 16777215, 0);
            var94 += 15;
        }
        if (client.field480 == 10) {
            Statics.field299.method1765(202, 171);
            if (field316 == 0) {
                short var38 = 251;
                arg0.method3411(class134.field2155, 382, var38, 16776960, 0);
                int var98 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field300.method1765(var39 - 73, var40 - 20);
                arg0.method3401(class134.field2282, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field300.method1765(var41 - 73, var40 - 20);
                arg0.method3401(class134.field2195, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field316 == 2) {
                short var42 = 211;
                arg0.method3411(field317, 382, var42, 16776960, 0);
                int var99 = var42 + 15;
                arg0.method3411(field318, 382, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3411(field319, 382, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 10;
                arg0.method3409(class134.field2246, 272, var102, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field320; arg0.method3394(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3409(class185.method3398(var44) + (field322 == 0 & client.field482 % 40 < 20 ? class2.method1661(16776960) + class2.field18 : ""), 312, var102, 16777215, 0);
                var99 = var102 + 15;
                String var46 = class134.field2190;
                String var47 = field321;
                int var48 = var47.length();
                char[] var49 = new char[var48];
                for (int var50 = 0; var50 < var48; var50++) {
                    var49[var50] = '*';
                }
                String var51 = new String(var49);
                arg0.method3409(var46 + var51 + (field322 == 1 & client.field482 % 40 < 20 ? class2.method1661(16776960) + class2.field18 : ""), 274, var99, 16777215, 0);
                var99 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field300.method1765(var53 - 73, var54 - 20);
                arg0.method3411(class134.field2265, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field300.method1765(var55 - 73, var54 - 20);
                arg0.method3411(class134.field2285, var55, var54 + 5, 16777215, 0);
            } else if (field316 == 3) {
                arg0.method3411(class134.field2139, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3411(class134.field2287, 382, var56, 16777215, 0);
                int var103 = var56 + 15;
                arg0.method3411(class134.field2100, 382, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3411(class134.field2292, 382, var104, 16777215, 0);
                int var105 = var104 + 15;
                arg0.method3411(class134.field2198, 382, var105, 16777215, 0);
                int var106 = var105 + 15;
                short var57 = 382;
                short var58 = 321;
                Statics.field300.method1765(var57 - 73, var58 - 20);
                arg0.method3411(class134.field2285, var57, var58 + 5, 16777215, 0);
            }
        }
        if (field312 > 0) {
            method188(field312);
            field312 = 0;
        }
        short var59 = 256;
        if (field314 > 0) {
            for (int var60 = 0; var60 < 256; var60++) {
                if (field314 > 768) {
                    Statics.field294[var60] = method38(Statics.field1442[var60], Statics.field302[var60], 1024 - field314);
                } else if (field314 > 256) {
                    Statics.field294[var60] = Statics.field302[var60];
                } else {
                    Statics.field294[var60] = method38(Statics.field302[var60], Statics.field1442[var60], 256 - field314);
                }
            }
        } else if (field309 > 0) {
            for (int var61 = 0; var61 < 256; var61++) {
                if (field309 > 768) {
                    Statics.field294[var61] = method38(Statics.field1442[var61], Statics.field363[var61], 1024 - field309);
                } else if (field309 > 256) {
                    Statics.field294[var61] = Statics.field363[var61];
                } else {
                    Statics.field294[var61] = method38(Statics.field363[var61], Statics.field1442[var61], 256 - field309);
                }
            }
        } else {
            for (int var62 = 0; var62 < 256; var62++) {
                Statics.field294[var62] = Statics.field1442[var62];
            }
        }
        class89.method1781(0, 9, 128, var59 + 7);
        Statics.field326.method1681(0, 0);
        class89.method1813();
        int var63 = 0;
        int var64 = 6885;
        for (int var65 = 1; var65 < var59 - 1; var65++) {
            int var66 = (var59 - var65) * field306[var65] / var59;
            int var67 = var66 + 22;
            if (var67 < 0) {
                var67 = 0;
            }
            var63 += var67;
            for (int var68 = var67; var68 < 128; var68++) {
                int var69 = Statics.field187[var63++];
                if (var69 == 0) {
                    var64++;
                } else {
                    int var71 = 256 - var69;
                    int var72 = Statics.field294[var69];
                    int var73 = Statics.field468.field1443[var64];
                    Statics.field468.field1443[var64++] = ((var72 & 0xFF00FF) * var69 + (var73 & 0xFF00FF) * var71 & 0xFF00FF00) + ((var72 & 0xFF00) * var69 + (var73 & 0xFF00) * var71 & 0xFF0000) >> 8;
                }
            }
            var64 += var67 + 765 - 128;
        }
        class89.method1781(637, 9, 765, var59 + 7);
        Statics.field173.method1681(382, 0);
        class89.method1813();
        int var74 = 0;
        int var75 = 7546;
        for (int var76 = 1; var76 < var59 - 1; var76++) {
            int var77 = (var59 - var76) * field306[var76] / var59;
            int var78 = 103 - var77;
            int var79 = var75 + var77;
            for (int var80 = 0; var80 < var78; var80++) {
                int var81 = Statics.field187[var74++];
                if (var81 == 0) {
                    var79++;
                } else {
                    int var83 = 256 - var81;
                    int var84 = Statics.field294[var81];
                    int var85 = Statics.field468.field1443[var79];
                    Statics.field468.field1443[var79++] = ((var84 & 0xFF00FF) * var81 + (var85 & 0xFF00FF) * var83 & 0xFF00FF00) + ((var84 & 0xFF00) * var81 + (var85 & 0xFF00) * var83 & 0xFF0000) >> 8;
                }
            }
            var74 += 128 - var78;
            var75 = 765 - var78 - var77 + var79;
        }
        Statics.field303[field327 ? 1 : 0].method1765(725, 463);
        if (client.field480 > 5 && client.field601 == 0) {
            if (Statics.field253 == null) {
                Statics.field253 = class84.method40(Statics.field1911, "sl_button", "");
            } else {
                byte var86 = 5;
                short var87 = 463;
                byte var88 = 100;
                byte var89 = 35;
                Statics.field253.method1765(var86, var87);
                arg0.method3411(class134.field2227 + " " + client.field473, var88 / 2 + var86, var89 / 2 + var87 - 2, 16777215, 0);
                if (Statics.field1499 == null) {
                    arg1.method3411(class134.field2231, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                } else {
                    arg1.method3411(class134.field2300, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var90 = Statics.field1494.getGraphics();
            Statics.field468.method1594(var90, 0, 0);
        } catch (Exception var93) {
            Statics.field1494.repaint();
        }
    }

    @ObfuscatedName("ao.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method800(String arg0, String arg1, String arg2) {
        field317 = arg0;
        field318 = arg1;
        field319 = arg2;
    }

    @ObfuscatedName("cg.y(Lcl;I)V")
    public static final void method1670(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field909.length; var2++) {
            Statics.field909[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field909[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2311[var8] = (Statics.field909[var8 - 1] + Statics.field909[var8 + 1] + Statics.field909[var8 - 128] + Statics.field909[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field909;
            Statics.field909 = Statics.field2311;
            Statics.field2311 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1458; var11++) {
            for (int var12 = 0; var12 < arg0.field1459; var12++) {
                if (arg0.field1460[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1461;
                    int var14 = var11 + 16 + arg0.field1462;
                    int var15 = (var14 << 7) + var13;
                    Statics.field909[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("l.x(II)V")
    public static final void method188(int arg0) {
        short var1 = 256;
        field315 += arg0 * 128;
        if (field315 > Statics.field909.length) {
            field315 -= Statics.field909.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1670(Statics.field301[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field187[var3 + var4] - Statics.field909[field315 + var3 & Statics.field909.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field187[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field187[var9 + var10] = 255;
                } else {
                    Statics.field187[var9 + var10] = 0;
                }
            }
        }
        if (field314 > 0) {
            field314 -= arg0 * 4;
        }
        if (field309 > 0) {
            field309 -= arg0 * 4;
        }
        if (field314 == 0 && field309 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field314 = 1024;
            }
            if (var12 == 1) {
                field309 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field306[var13] = field306[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field306[var14] = (int) (Math.sin((double) field298 / 14.0D) * 16.0D + Math.sin((double) field298 / 15.0D) * 14.0D + Math.sin((double) field298 / 16.0D) * 12.0D);
            field298++;
        }
        field311 += arg0 * 1673973789;
        int var15 = ((client.field482 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field311 * 1102355636; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field187[(var18 << 7) + var17] = 192;
        }
        field311 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field187[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field187[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1907[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1907[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1907[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field187[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("e.t(IIIB)I")
    public static final int method38(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("d.i(B)V")
    public static void method44() {
        try {
            if (Statics.field1499 == null) {
                Statics.field1499 = new class24(Statics.field2333, new URL(Statics.field952));
            } else {
                byte[] var0 = Statics.field1499.method234();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field325 = var1.method2609();
                    Statics.field193 = new class13[field325];
                    int var2 = 0;
                    while (var2 < field325) {
                        class13 var3 = Statics.field193[var2] = new class13();
                        int var4 = var1.method2609();
                        var3.field195 = var4 & 0x7FFF;
                        var3.field189 = (var4 & 0x8000) != 0;
                        var3.field188 = var1.method2449();
                        var3.field191 = var1.method2441();
                        var3.field190 = var1.method2495();
                        var3.field186 = var2++;
                    }
                    method2039(Statics.field193, 0, Statics.field193.length - 1, field329, field304);
                    field324 = true;
                    Statics.field1499 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1499 = null;
        }
    }

    @ObfuscatedName("ab.z(IIB)V")
    public static void method601(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field329[var5] != arg0) {
                var2[var4] = field329[var5];
                var3[var4] = field304[var5];
                var4++;
            }
        }
        field329 = var2;
        field304 = var3;
        method2039(Statics.field193, 0, Statics.field193.length - 1, field329, field304);
    }

    @ObfuscatedName("cr.o([Lu;II[I[II)V")
    public static void method2039(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field186;
                        var12 = var8.field186;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field190;
                        var12 = var8.field190;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field189 ? 1 : 0;
                        var12 = var8.field189 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field195;
                        var12 = var8.field195;
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
                        var15 = arg0[var5].field186;
                        var16 = var8.field186;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field190;
                        var16 = var8.field190;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field189 ? 1 : 0;
                        var16 = var8.field189 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field195;
                        var16 = var8.field195;
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
        method2039(arg0, arg1, var6, arg3, arg4);
        method2039(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
