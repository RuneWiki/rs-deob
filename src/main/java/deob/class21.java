package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("f")
public class class21 {

    @ObfuscatedName("f.t")
    public static int[] field304 = new int[256];

    @ObfuscatedName("f.o")
    public static int field321 = 0;

    @ObfuscatedName("f.a")
    public static int field313 = 0;

    @ObfuscatedName("f.j")
    public static int field315 = 0;

    @ObfuscatedName("f.i")
    public static int field314 = 0;

    @ObfuscatedName("f.ap")
    public static int field317 = 0;

    @ObfuscatedName("f.am")
    public static int field322 = 0;

    @ObfuscatedName("f.ao")
    public static int field319 = 10;

    @ObfuscatedName("f.af")
    public static String field320 = "";

    @ObfuscatedName("f.ae")
    public static int field312 = 0;

    @ObfuscatedName("f.az")
    public static String field306 = "";

    @ObfuscatedName("f.al")
    public static String field331 = "";

    @ObfuscatedName("f.ak")
    public static String field323 = "";

    @ObfuscatedName("f.ac")
    public static String field325 = "";

    @ObfuscatedName("f.an")
    public static String field326 = "";

    @ObfuscatedName("f.ai")
    public static int field327 = 0;

    @ObfuscatedName("f.aa")
    public static String field328 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("f.aj")
    public static boolean field329 = false;

    @ObfuscatedName("f.ah")
    public static int field330 = 0;

    @ObfuscatedName("f.bc")
    public static int[] field311 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("f.bb")
    public static int[] field318 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("f.bf")
    public static int field333 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.q(Ley;Ley;I)I")
    public static int method1554(class153 arg0, class153 arg1) {
        int var2 = 0;
        if (arg0.method2973("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2973("logo", "")) {
            var2++;
        }
        if (arg1.method2973("titlebox", "")) {
            var2++;
        }
        if (arg1.method2973("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2973("runes", "")) {
            var2++;
        }
        if (arg1.method2973("title_mute", "")) {
            var2++;
        }
        arg1.method2973("sl_back", "");
        arg1.method2973("sl_flags", "");
        arg1.method2973("sl_arrows", "");
        arg1.method2973("sl_stars", "");
        arg1.method2973("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ep.c(Lbl;B)V")
    public static void method2812(class73 arg0) {
        if (field329) {
            method120(arg0);
            return;
        }
        if ((class77.field1402 == 1 || !Statics.field752 && class77.field1402 == 4) && class77.field1403 >= 715 && class77.field1407 >= 453) {
            Statics.field271.field188 = !Statics.field271.field188;
            class29 var1 = null;
            try {
                var1 = class82.method1339("", Statics.field2028.field2097, true);
                class127 var2 = Statics.field271.method105();
                var1.method550(var2.field2042, 0, var2.field2039);
            } catch (Exception var38) {
            }
            try {
                if (var1 != null) {
                    var1.method539();
                }
            } catch (Exception var37) {
            }
            if (Statics.field271.field188) {
                Statics.field2362.method2707();
                class139.field2363 = 1;
                Statics.field2364 = null;
            } else {
                class155 var5 = Statics.field94;
                int var6 = var5.method2967("scape main");
                int var7 = var5.method2968(var6, "");
                class139.method2160(var5, var6, var7, 255, false);
            }
        }
        if (client.field477 == 5) {
            return;
        }
        field317++;
        if (client.field477 != 10) {
            return;
        }
        if (client.field476 == 0) {
            if (class77.field1402 == 1 || !Statics.field752 && class77.field1402 == 4) {
                byte var8 = 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class77.field1403 >= var8 && class77.field1403 <= var8 + var10 && class77.field1407 >= var9 && class77.field1407 <= var9 + var11) {
                    method99();
                    return;
                }
            }
            if (Statics.field61 != null) {
                method99();
            }
        }
        int var12 = class77.field1402;
        int var13 = class77.field1403;
        int var14 = class77.field1407;
        if (!Statics.field752 && var12 == 4) {
            var12 = 1;
        }
        if (field312 == 0) {
            short var15 = 302;
            short var16 = 291;
            if (var12 == 1 && var13 >= var15 - 75 && var13 <= var15 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                field312 = 3;
                field327 = 0;
            }
            short var17 = 462;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                if ((client.field472 & 0x4) != 0) {
                    if ((client.field472 & 0x400) == 0) {
                        field306 = class135.field2311;
                        field331 = class135.field2312;
                        field323 = class135.field2313;
                    } else {
                        field306 = class135.field2317;
                        field331 = class135.field2129;
                        field323 = class135.field2242;
                    }
                    field312 = 1;
                    field327 = 0;
                } else if ((client.field472 & 0x400) == 0) {
                    field306 = class135.field2150;
                    field331 = class135.field2220;
                    field323 = class135.field2171;
                    field312 = 2;
                    field327 = 0;
                } else {
                    field306 = class135.field2314;
                    field331 = class135.field2315;
                    field323 = class135.field2316;
                    field312 = 1;
                    field327 = 0;
                }
            }
        } else if (field312 == 1) {
            while (true) {
                class75 var18 = class75.field1381;
                boolean var19;
                synchronized (class75.field1381) {
                    if (class75.field1377 == class75.field1371) {
                        var19 = false;
                    } else {
                        Statics.field1374 = class75.field1369[class75.field1377];
                        Statics.field758 = class75.field1365[class75.field1377];
                        class75.field1377 = class75.field1377 + 1 & 0x7F;
                        var19 = true;
                    }
                }
                if (!var19) {
                    short var21 = 302;
                    short var22 = 321;
                    if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var22 - 20 && var14 <= var22 + 20) {
                        field306 = class135.field2150;
                        field331 = class135.field2220;
                        field323 = class135.field2171;
                        field312 = 2;
                        field327 = 0;
                    }
                    short var23 = 462;
                    if (var12 == 1 && var13 >= var23 - 75 && var13 <= var23 + 75 && var14 >= var22 - 20 && var14 <= var22 + 20) {
                        field312 = 0;
                    }
                    break;
                }
                if (Statics.field1374 == 84) {
                    field306 = class135.field2150;
                    field331 = class135.field2220;
                    field323 = class135.field2171;
                    field312 = 2;
                    field327 = 0;
                } else if (Statics.field1374 == 13) {
                    field312 = 0;
                }
            }
        } else if (field312 == 2) {
            short var24 = 231;
            int var39 = var24 + 30;
            if (var12 == 1 && var14 >= var39 - 15 && var14 < var39) {
                field327 = 0;
            }
            var39 += 15;
            if (var12 == 1 && var14 >= var39 - 15 && var14 < var39) {
                field327 = 1;
            }
            var39 += 15;
            short var25 = 302;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field325 = field325.trim();
                if (field325.length() == 0) {
                    method2176(class135.field2217, class135.field2135, class135.field2244);
                    return;
                }
                if (field326.length() == 0) {
                    method2176(class135.field2284, class135.field2221, class135.field2222);
                    return;
                }
                method2176(class135.field2320, class135.field2321, class135.field2322);
                client.method126(20);
                return;
            }
            short var27 = 462;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field312 = 0;
                field325 = "";
                field326 = "";
            }
            while (true) {
                while (true) {
                    class75 var28 = class75.field1381;
                    boolean var29;
                    synchronized (class75.field1381) {
                        if (class75.field1377 == class75.field1371) {
                            var29 = false;
                        } else {
                            Statics.field1374 = class75.field1369[class75.field1377];
                            Statics.field758 = class75.field1365[class75.field1377];
                            class75.field1377 = class75.field1377 + 1 & 0x7F;
                            var29 = true;
                        }
                    }
                    if (!var29) {
                        return;
                    }
                    boolean var31 = false;
                    for (int var32 = 0; var32 < field328.length(); var32++) {
                        if (Statics.field758 == field328.charAt(var32)) {
                            var31 = true;
                            break;
                        }
                    }
                    if (Statics.field1374 == 13) {
                        field312 = 0;
                        field325 = "";
                        field326 = "";
                    } else if (field327 == 0) {
                        if (Statics.field1374 == 85 && field325.length() > 0) {
                            field325 = field325.substring(0, field325.length() - 1);
                        }
                        if (Statics.field1374 == 84 || Statics.field1374 == 80) {
                            field327 = 1;
                        }
                        if (var31 && field325.length() < 320) {
                            field325 = field325 + Statics.field758;
                        }
                    } else if (field327 == 1) {
                        if (Statics.field1374 == 85 && field326.length() > 0) {
                            field326 = field326.substring(0, field326.length() - 1);
                        }
                        if (Statics.field1374 == 84 || Statics.field1374 == 80) {
                            field327 = 0;
                        }
                        if (Statics.field1374 == 84) {
                            field325 = field325.trim();
                            if (field325.length() == 0) {
                                method2176(class135.field2217, class135.field2135, class135.field2244);
                                return;
                            }
                            if (field326.length() == 0) {
                                method2176(class135.field2284, class135.field2221, class135.field2222);
                                return;
                            }
                            method2176(class135.field2320, class135.field2321, class135.field2322);
                            client.method126(20);
                            return;
                        }
                        if (var31 && field326.length() < 20) {
                            field326 = field326 + Statics.field758;
                        }
                    }
                }
            }
        } else if (field312 == 3) {
            short var33 = 382;
            short var34 = 321;
            if (var12 == 1 && var13 >= var33 - 75 && var13 <= var33 + 75 && var14 >= var34 - 20 && var14 <= var34 + 20) {
                field312 = 0;
            }
        }
    }

    @ObfuscatedName("ak.p(Lgo;Lgo;I)V")
    public static void method737(class183 arg0, class183 arg1) {
        if (field329) {
            if (Statics.field1980 == null) {
                Statics.field1980 = class84.method125(Statics.field1623, "sl_back", "");
            }
            if (Statics.field70 == null) {
                Statics.field70 = class84.method2181(Statics.field1623, "sl_flags", "");
            }
            if (Statics.field84 == null) {
                Statics.field84 = class84.method2181(Statics.field1623, "sl_arrows", "");
            }
            if (Statics.field107 == null) {
                Statics.field107 = class84.method2181(Statics.field1623, "sl_stars", "");
            }
            class89.method1817(0, 23, 765, 480, 0);
            class89.method1823(0, 0, 125, 23, 12425273, 9135624);
            class89.method1823(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3384(class135.field2335, 62, 15, 0, -1);
            if (Statics.field107 != null) {
                Statics.field107[1].method1771(140, 1);
                arg1.method3350(class135.field2336, 152, 10, 16777215, -1);
                Statics.field107[0].method1771(140, 12);
                arg1.method3350(class135.field2337, 152, 21, 16777215, -1);
            }
            if (Statics.field84 != null) {
                short var2 = 280;
                if (field311[0] == 0 && field318[0] == 0) {
                    Statics.field84[2].method1771(var2, 4);
                } else {
                    Statics.field84[0].method1771(var2, 4);
                }
                if (field311[0] == 0 && field318[0] == 1) {
                    Statics.field84[3].method1771(var2 + 15, 4);
                } else {
                    Statics.field84[1].method1771(var2 + 15, 4);
                }
                arg0.method3350(class135.field2338, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field311[0] == 1 && field318[0] == 0) {
                    Statics.field84[2].method1771(var3, 4);
                } else {
                    Statics.field84[0].method1771(var3, 4);
                }
                if (field311[0] == 1 && field318[0] == 1) {
                    Statics.field84[3].method1771(var3 + 15, 4);
                } else {
                    Statics.field84[1].method1771(var3 + 15, 4);
                }
                arg0.method3350(class135.field2328, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field311[0] == 2 && field318[0] == 0) {
                    Statics.field84[2].method1771(var4, 4);
                } else {
                    Statics.field84[0].method1771(var4, 4);
                }
                if (field311[0] == 2 && field318[0] == 1) {
                    Statics.field84[3].method1771(var4 + 15, 4);
                } else {
                    Statics.field84[1].method1771(var4 + 15, 4);
                }
                arg0.method3350(class135.field2340, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field311[0] == 3 && field318[0] == 0) {
                    Statics.field84[2].method1771(var5, 4);
                } else {
                    Statics.field84[0].method1771(var5, 4);
                }
                if (field311[0] == 3 && field318[0] == 1) {
                    Statics.field84[3].method1771(var5 + 15, 4);
                } else {
                    Statics.field84[1].method1771(var5 + 15, 4);
                }
                arg0.method3350(class135.field2341, var5 + 32, 17, 16777215, -1);
            }
            class89.method1817(708, 4, 50, 16, 0);
            arg1.method3384(class135.field2329, 733, 16, 16777215, -1);
            field333 = -1;
            if (Statics.field1980 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field330) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field330) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field330) {
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
                for (int var20 = 0; var20 < field330; var20++) {
                    class13 var21 = Statics.field268[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field191);
                    if (var21.field191 == -1) {
                        var23 = class135.field2342;
                        var22 = false;
                    } else if (var21.field191 > 1980) {
                        var23 = class135.field2343;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method115()) {
                        if (var21.method114()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method114()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class77.field1396 >= var17 && class77.field1397 >= var16 && class77.field1396 < var6 + var17 && class77.field1397 < var7 + var16 && var22) {
                        field333 = var20;
                        Statics.field1980[var24].method1696(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field1980[var24].method1690(var17, var16);
                    }
                    if (Statics.field70 != null) {
                        Statics.field70[(var21.method114() ? 8 : 0) + var21.field194].method1771(var17 + 29, var16);
                    }
                    arg0.method3384(Integer.toString(var21.field196), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3384(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3345(Statics.field268[field333].field193) + 6;
                    int var26 = arg1.field2850 + 8;
                    class89.method1817(class77.field1396 - var25 / 2, class77.field1397 + 20 + 5, var25, var26, 16777120);
                    class89.method1794(class77.field1396 - var25 / 2, class77.field1397 + 20 + 5, var25, var26, 0);
                    arg1.method3384(Statics.field268[field333].field193, class77.field1396, class77.field1397 + 20 + 5 + arg1.field2850 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1408.getGraphics();
                Statics.field385.method1645(var27, 0, 0);
            } catch (Exception var127) {
                Statics.field1408.repaint();
            }
            return;
        }
        if (client.field477 == 0 || client.field477 == 5) {
            byte var29 = 20;
            arg0.method3384(class135.field2161, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class89.method1794(230, var30, 304, 34, 9179409);
            class89.method1794(231, var30 + 1, 302, 32, 0);
            class89.method1817(232, var30 + 2, field319 * 3, 30, 9179409);
            class89.method1817(field319 * 3 + 232, var30 + 2, 300 - field319 * 3, 30, 0);
            arg0.method3384(field320, 382, 276 - var29, 16777215, -1);
        }
        if (client.field477 == 20) {
            Statics.field332.method1771(382 - Statics.field332.field1489 / 2, 271 - Statics.field332.field1494 / 2);
            short var31 = 211;
            arg0.method3384(field306, 382, var31, 16776960, 0);
            int var129 = var31 + 15;
            arg0.method3384(field331, 382, var129, 16776960, 0);
            int var130 = var129 + 15;
            arg0.method3384(field323, 382, var130, 16776960, 0);
            int var131 = var130 + 15;
            int var132 = var131 + 10;
            arg0.method3350(class135.field2286, 272, var132, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field325; arg0.method3345(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3350(class185.method3349(var33), 312, var132, 16777215, 0);
            var129 = var132 + 15;
            String var35 = class135.field2324;
            String var36 = field326;
            int var37 = var36.length();
            char[] var38 = new char[var37];
            for (int var39 = 0; var39 < var37; var39++) {
                var38[var39] = '*';
            }
            String var40 = new String(var38);
            arg0.method3350(var35 + var40, 274, var129, 16777215, 0);
            var129 += 15;
        }
        if (client.field477 == 10) {
            Statics.field332.method1771(202, 171);
            if (field312 == 0) {
                short var42 = 251;
                arg0.method3384(class135.field2325, 382, var42, 16776960, 0);
                int var133 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field305.method1771(var43 - 73, var44 - 20);
                arg0.method3352(class135.field2326, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field305.method1771(var45 - 73, var44 - 20);
                arg0.method3352(class135.field2200, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field312 == 1) {
                arg0.method3384(class135.field2310, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3384(field306, 382, var46, 16777215, 0);
                int var134 = var46 + 15;
                arg0.method3384(field331, 382, var134, 16777215, 0);
                int var135 = var134 + 15;
                arg0.method3384(field323, 382, var135, 16777215, 0);
                int var136 = var135 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field305.method1771(var47 - 73, var48 - 20);
                arg0.method3384(class135.field2111, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field305.method1771(var49 - 73, var48 - 20);
                arg0.method3384(class135.field2329, var49, var48 + 5, 16777215, 0);
            } else if (field312 == 2) {
                short var50 = 211;
                arg0.method3384(field306, 382, var50, 16776960, 0);
                int var137 = var50 + 15;
                arg0.method3384(field331, 382, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg0.method3384(field323, 382, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var140 = var139 + 10;
                arg0.method3350(class135.field2286, 272, var140, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field325; arg0.method3345(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3350(class185.method3349(var52) + (field327 == 0 & client.field479 % 40 < 20 ? class2.method202(16776960) + class2.field18 : ""), 312, var140, 16777215, 0);
                var137 = var140 + 15;
                String var54 = class135.field2324;
                String var55 = field326;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3350(var54 + var59 + (field327 == 1 & client.field479 % 40 < 20 ? class2.method202(16776960) + class2.field18 : ""), 274, var137, 16777215, 0);
                var137 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field305.method1771(var61 - 73, var62 - 20);
                arg0.method3384(class135.field2155, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field305.method1771(var63 - 73, var62 - 20);
                arg0.method3384(class135.field2329, var63, var62 + 5, 16777215, 0);
            } else if (field312 == 3) {
                arg0.method3384(class135.field2182, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3384(class135.field2245, 382, var64, 16777215, 0);
                int var141 = var64 + 15;
                arg0.method3384(class135.field2332, 382, var141, 16777215, 0);
                int var142 = var141 + 15;
                arg0.method3384(class135.field2333, 382, var142, 16777215, 0);
                int var143 = var142 + 15;
                arg0.method3384(class135.field2334, 382, var143, 16777215, 0);
                int var144 = var143 + 15;
                short var65 = 382;
                short var66 = 321;
                Statics.field305.method1771(var65 - 73, var66 - 20);
                arg0.method3384(class135.field2329, var65, var66 + 5, 16777215, 0);
            }
        }
        if (field317 > 0) {
            int var67 = field317;
            short var68 = 256;
            field315 += var67 * 128;
            if (field315 > Statics.field1986.length) {
                field315 -= Statics.field1986.length;
                int var69 = (int) (Math.random() * 12.0D);
                method877(Statics.field2586[var69]);
            }
            int var70 = 0;
            int var71 = var67 * 128;
            int var72 = (var68 - var67) * 128;
            for (int var73 = 0; var73 < var72; var73++) {
                int var74 = Statics.field897[var70 + var71] - Statics.field1986[field315 + var70 & Statics.field1986.length - 1] * var67 / 6;
                if (var74 < 0) {
                    var74 = 0;
                }
                Statics.field897[var70++] = var74;
            }
            for (int var75 = var68 - var67; var75 < var68; var75++) {
                int var76 = var75 * 128;
                for (int var77 = 0; var77 < 128; var77++) {
                    int var78 = (int) (Math.random() * 100.0D);
                    if (var78 < 50 && var77 > 10 && var77 < 118) {
                        Statics.field897[var76 + var77] = 255;
                    } else {
                        Statics.field897[var76 + var77] = 0;
                    }
                }
            }
            if (field321 > 0) {
                field321 -= var67 * 4;
            }
            if (field313 > 0) {
                field313 -= var67 * 4;
            }
            if (field321 == 0 && field313 == 0) {
                int var79 = (int) (Math.random() * (double) (2000 / var67));
                if (var79 == 0) {
                    field321 = 1024;
                }
                if (var79 == 1) {
                    field313 = 1024;
                }
            }
            for (int var80 = 0; var80 < var68 - var67; var80++) {
                field304[var80] = field304[var67 + var80];
            }
            for (int var81 = var68 - var67; var81 < var68; var81++) {
                field304[var81] = (int) (Math.sin((double) field322 / 14.0D) * 16.0D + Math.sin((double) field322 / 15.0D) * 14.0D + Math.sin((double) field322 / 16.0D) * 12.0D);
                field322++;
            }
            field314 += var67 * 825737407;
            int var82 = ((client.field479 & 0x1) + var67) / 2;
            if (var82 > 0) {
                for (int var83 = 0; var83 < field314 * 1028682908; var83++) {
                    int var84 = (int) (Math.random() * 124.0D) + 2;
                    int var85 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field897[(var85 << 7) + var84] = 192;
                }
                field314 = 0;
                int var86 = 0;
                label488: while (true) {
                    if (var86 >= var68) {
                        int var90 = 0;
                        while (true) {
                            if (var90 >= 128) {
                                break label488;
                            }
                            int var91 = 0;
                            for (int var92 = -var82; var92 < var68; var92++) {
                                int var93 = var92 * 128;
                                if (var82 + var92 < var68) {
                                    var91 += Statics.field308[var82 * 128 + var90 + var93];
                                }
                                if (var92 - (var82 + 1) >= 0) {
                                    var91 -= Statics.field308[var90 + var93 - (var82 + 1) * 128];
                                }
                                if (var92 >= 0) {
                                    Statics.field897[var90 + var93] = var91 / (var82 * 2 + 1);
                                }
                            }
                            var90++;
                        }
                    }
                    int var87 = 0;
                    int var88 = var86 * 128;
                    for (int var89 = -var82; var89 < 128; var89++) {
                        if (var82 + var89 < 128) {
                            var87 += Statics.field897[var88 + var89 + var82];
                        }
                        if (var89 - (var82 + 1) >= 0) {
                            var87 -= Statics.field897[var88 + var89 - (var82 + 1)];
                        }
                        if (var89 >= 0) {
                            Statics.field308[var88 + var89] = var87 / (var82 * 2 + 1);
                        }
                    }
                    var86++;
                }
            }
            field317 = 0;
        }
        short var94 = 256;
        if (field321 > 0) {
            for (int var95 = 0; var95 < 256; var95++) {
                if (field321 > 768) {
                    Statics.field299[var95] = method2286(Statics.field2748[var95], Statics.field360[var95], 1024 - field321);
                } else if (field321 > 256) {
                    Statics.field299[var95] = Statics.field360[var95];
                } else {
                    Statics.field299[var95] = method2286(Statics.field360[var95], Statics.field2748[var95], 256 - field321);
                }
            }
        } else if (field313 > 0) {
            for (int var96 = 0; var96 < 256; var96++) {
                if (field313 > 768) {
                    Statics.field299[var96] = method2286(Statics.field2748[var96], Statics.field1464[var96], 1024 - field313);
                } else if (field313 > 256) {
                    Statics.field299[var96] = Statics.field1464[var96];
                } else {
                    Statics.field299[var96] = method2286(Statics.field1464[var96], Statics.field2748[var96], 256 - field313);
                }
            }
        } else {
            for (int var97 = 0; var97 < 256; var97++) {
                Statics.field299[var97] = Statics.field2748[var97];
            }
        }
        class89.method1814(0, 9, 128, var94 + 7);
        Statics.field335.method1690(0, 0);
        class89.method1785();
        int var98 = 0;
        int var99 = 6885;
        for (int var100 = 1; var100 < var94 - 1; var100++) {
            int var101 = (var94 - var100) * field304[var100] / var94;
            int var102 = var101 + 22;
            if (var102 < 0) {
                var102 = 0;
            }
            var98 += var102;
            for (int var103 = var102; var103 < 128; var103++) {
                int var104 = Statics.field897[var98++];
                if (var104 == 0) {
                    var99++;
                } else {
                    int var106 = 256 - var104;
                    int var107 = Statics.field299[var104];
                    int var108 = Statics.field385.field1470[var99];
                    Statics.field385.field1470[var99++] = ((var107 & 0xFF00) * var104 + (var108 & 0xFF00) * var106 & 0xFF0000) + ((var107 & 0xFF00FF) * var104 + (var108 & 0xFF00FF) * var106 & 0xFF00FF00) >> 8;
                }
            }
            var99 += var102 + 765 - 128;
        }
        class89.method1814(637, 9, 765, var94 + 7);
        Statics.field307.method1690(382, 0);
        class89.method1785();
        int var109 = 0;
        int var110 = 7546;
        for (int var111 = 1; var111 < var94 - 1; var111++) {
            int var112 = (var94 - var111) * field304[var111] / var94;
            int var113 = 103 - var112;
            int var114 = var110 + var112;
            for (int var115 = 0; var115 < var113; var115++) {
                int var116 = Statics.field897[var109++];
                if (var116 == 0) {
                    var114++;
                } else {
                    int var118 = 256 - var116;
                    int var119 = Statics.field299[var116];
                    int var120 = Statics.field385.field1470[var114];
                    Statics.field385.field1470[var114++] = ((var119 & 0xFF00) * var116 + (var120 & 0xFF00) * var118 & 0xFF0000) + ((var119 & 0xFF00FF) * var116 + (var120 & 0xFF00FF) * var118 & 0xFF00FF00) >> 8;
                }
            }
            var109 += 128 - var113;
            var110 = 765 - var113 - var112 + var114;
        }
        Statics.field1799[Statics.field271.field188 ? 1 : 0].method1771(725, 463);
        if (client.field477 > 5 && client.field476 == 0) {
            if (Statics.field266 == null) {
                Statics.field266 = class84.method896(Statics.field1623, "sl_button", "");
            } else {
                byte var121 = 5;
                short var122 = 463;
                byte var123 = 100;
                byte var124 = 35;
                Statics.field266.method1771(var121, var122);
                arg0.method3384(class135.field2261 + " " + client.field471, var123 / 2 + var121, var124 / 2 + var122 - 2, 16777215, 0);
                if (Statics.field61 == null) {
                    arg1.method3384(class135.field2345, var123 / 2 + var121, var124 / 2 + var122 + 12, 16777215, 0);
                } else {
                    arg1.method3384(class135.field2167, var123 / 2 + var121, var124 / 2 + var122 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var125 = Statics.field1408.getGraphics();
            Statics.field385.method1645(var125, 0, 0);
        } catch (Exception var128) {
            Statics.field1408.repaint();
        }
    }

    @ObfuscatedName("ds.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2176(String arg0, String arg1, String arg2) {
        field306 = arg0;
        field331 = arg1;
        field323 = arg2;
    }

    @ObfuscatedName("aj.m(Lcq;B)V")
    public static final void method877(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1986.length; var2++) {
            Statics.field1986[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1986[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1224[var8] = (Statics.field1986[var8 - 1] + Statics.field1986[var8 + 1] + Statics.field1986[var8 - 128] + Statics.field1986[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1986;
            Statics.field1986 = Statics.field1224;
            Statics.field1224 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1494; var11++) {
            for (int var12 = 0; var12 < arg0.field1489; var12++) {
                if (arg0.field1492[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1491;
                    int var14 = var11 + 16 + arg0.field1493;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1986[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dm.k(IIII)I")
    public static final int method2286(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("r.v(Lbl;I)V")
    public static void method120(class73 arg0) {
        if (class77.field1402 != 1 && Statics.field752 || class77.field1402 != 4) {
            return;
        }
        short var1 = 280;
        if (class77.field1403 >= var1 && class77.field1403 <= var1 + 14 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(0, 0);
            return;
        }
        if (class77.field1403 >= var1 + 15 && class77.field1403 <= var1 + 80 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1403 >= var2 && class77.field1403 <= var2 + 14 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(1, 0);
            return;
        }
        if (class77.field1403 >= var2 + 15 && class77.field1403 <= var2 + 80 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1403 >= var3 && class77.field1403 <= var3 + 14 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(2, 0);
            return;
        }
        if (class77.field1403 >= var3 + 15 && class77.field1403 <= var3 + 80 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1403 >= var4 && class77.field1403 <= var4 + 14 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(3, 0);
            return;
        }
        if (class77.field1403 >= var4 + 15 && class77.field1403 <= var4 + 80 && class77.field1407 >= 4 && class77.field1407 <= 18) {
            method95(3, 1);
            return;
        }
        if (class77.field1403 >= 708 && class77.field1407 >= 4 && class77.field1403 <= 758 && class77.field1407 <= 20) {
            field329 = false;
            Statics.field335.method1690(0, 0);
            Statics.field307.method1690(382, 0);
            Statics.field334.method1771(382 - Statics.field334.field1489 / 2, 18);
            return;
        }
        if (field333 == -1) {
            return;
        }
        class13 var5 = Statics.field268[field333];
        method806(var5);
        field329 = false;
        Statics.field335.method1690(0, 0);
        Statics.field307.method1690(382, 0);
        Statics.field334.method1771(382 - Statics.field334.field1489 / 2, 18);
        return;
    }

    @ObfuscatedName("aa.y(Lr;I)V")
    public static void method806(class13 arg0) {
        if (arg0.method114() != client.field474) {
            client.field474 = arg0.method114();
            boolean var1 = arg0.method114();
            if (Statics.field975 != var1) {
                class40.method103();
                Statics.field975 = var1;
            }
        }
        Statics.field1312 = arg0.field192;
        client.field471 = arg0.field196;
        client.field472 = arg0.field190;
        Statics.field1174 = client.field508 == 0 ? 43594 : arg0.field196 + 40000;
        Statics.field2010 = client.field508 == 0 ? 443 : arg0.field196 + 50000;
        Statics.field1995 = Statics.field1174;
    }

    @ObfuscatedName("h.d(I)V")
    public static void method99() {
        try {
            if (Statics.field61 == null) {
                Statics.field61 = new class24(Statics.field751, new URL(Statics.field121));
            } else {
                byte[] var0 = Statics.field61.method211();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field330 = var1.method2427();
                    Statics.field268 = new class13[field330];
                    int var2 = 0;
                    while (var2 < field330) {
                        class13 var3 = Statics.field268[var2] = new class13();
                        var3.field196 = var1.method2427();
                        var3.field190 = var1.method2430();
                        var3.field192 = var1.method2460();
                        var3.field193 = var1.method2460();
                        var3.field194 = var1.method2534();
                        var3.field191 = var1.method2452();
                        var3.field189 = var2++;
                    }
                    method29(Statics.field268, 0, Statics.field268.length - 1, field311, field318);
                    field329 = true;
                    Statics.field61 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field61 = null;
        }
    }

    @ObfuscatedName("l.l(IIB)V")
    public static void method95(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field311[var5] != arg0) {
                var2[var4] = field311[var5];
                var3[var4] = field318[var5];
                var4++;
            }
        }
        field311 = var2;
        field318 = var3;
        method29(Statics.field268, 0, Statics.field268.length - 1, field311, field318);
    }

    @ObfuscatedName("z.h([Lr;II[I[IB)V")
    public static void method29(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field189;
                        var12 = var8.field189;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field191;
                        var12 = var8.field191;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method114() ? 1 : 0;
                        var12 = var8.method114() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field196;
                        var12 = var8.field196;
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
                        var15 = arg0[var5].field189;
                        var16 = var8.field189;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field191;
                        var16 = var8.field191;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method114() ? 1 : 0;
                        var16 = var8.method114() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field196;
                        var16 = var8.field196;
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
        method29(arg0, arg1, var6, arg3, arg4);
        method29(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
