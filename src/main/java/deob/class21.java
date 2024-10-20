package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("p")
public class class21 {

    @ObfuscatedName("p.t")
    public static int[] field306 = new int[256];

    @ObfuscatedName("p.y")
    public static int field309 = 0;

    @ObfuscatedName("p.k")
    public static int field311 = 0;

    @ObfuscatedName("p.i")
    public static int field312 = 0;

    @ObfuscatedName("p.u")
    public static int field323 = 0;

    @ObfuscatedName("p.at")
    public static int field314 = 0;

    @ObfuscatedName("p.as")
    public static int field315 = 0;

    @ObfuscatedName("p.ax")
    public static int field303 = 10;

    @ObfuscatedName("p.ao")
    public static String field317 = "";

    @ObfuscatedName("p.aq")
    public static int field318 = 0;

    @ObfuscatedName("p.am")
    public static String field319 = "";

    @ObfuscatedName("p.al")
    public static String field320 = "";

    @ObfuscatedName("p.ab")
    public static String field334 = "";

    @ObfuscatedName("p.aw")
    public static String field321 = "";

    @ObfuscatedName("p.ah")
    public static String field304 = "";

    @ObfuscatedName("p.aa")
    public static int field324 = 0;

    @ObfuscatedName("p.ay")
    public static String field325 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("p.az")
    public static boolean field322 = false;

    @ObfuscatedName("p.ae")
    public static int field333 = 0;

    @ObfuscatedName("p.bu")
    public static int[] field329 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("p.bl")
    public static int[] field330 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("p.bj")
    public static int field331 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.b(Lej;Lej;B)I")
    public static int method2962(class153 arg0, class153 arg1) {
        int var2 = 0;
        if (arg0.method3014("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3014("logo", "")) {
            var2++;
        }
        if (arg1.method3014("titlebox", "")) {
            var2++;
        }
        if (arg1.method3014("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3014("runes", "")) {
            var2++;
        }
        if (arg1.method3014("title_mute", "")) {
            var2++;
        }
        arg1.method3014("sl_back", "");
        arg1.method3014("sl_flags", "");
        arg1.method3014("sl_arrows", "");
        arg1.method3014("sl_stars", "");
        arg1.method3014("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bg.e(B)I")
    public static int method1391() {
        return 6;
    }

    @ObfuscatedName("cb.o(S)V")
    public static void method1665() {
        if (!Statics.field310) {
            return;
        }
        Statics.field305 = null;
        Statics.field328 = null;
        Statics.field1986 = null;
        Statics.field1503 = null;
        Statics.field2345 = null;
        Statics.field183 = null;
        Statics.field2585 = null;
        Statics.field2413 = null;
        Statics.field327 = null;
        Statics.field185 = null;
        Statics.field1279 = null;
        Statics.field1737 = null;
        Statics.field1976 = null;
        Statics.field402 = null;
        Statics.field761 = null;
        Statics.field1745 = null;
        Statics.field1912 = null;
        Statics.field265 = null;
        Statics.field88 = null;
        Statics.field852 = null;
        class139.method234(2);
        class154.method2024(true);
        Statics.field310 = false;
    }

    @ObfuscatedName("e.a(Lbc;B)V")
    public static void method4(class73 arg0) {
        if (field322) {
            method138(arg0);
            return;
        }
        if (class77.field1385 == 1 && class77.field1386 >= 715 && class77.field1381 >= 453) {
            Statics.field60.field196 = !Statics.field60.field196;
            class12.method1350();
            if (Statics.field60.field196) {
                Statics.field2353.method2744();
                class139.field2354 = 1;
                Statics.field2586 = null;
            } else {
                class155 var1 = Statics.field1164;
                int var2 = var1.method3011("scape main");
                int var3 = var1.method3012(var2, "");
                class139.method235(var1, var2, var3, 255, false);
            }
        }
        if (client.field652 == 5) {
            return;
        }
        field314++;
        if (client.field652 != 10) {
            return;
        }
        if (client.field474 == 0) {
            if (class77.field1385 == 1) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class77.field1386 >= var4 && class77.field1386 <= var4 + var6 && class77.field1381 >= var5 && class77.field1381 <= var5 + var7) {
                    method5();
                    return;
                }
            }
            if (Statics.field2030 != null) {
                method5();
            }
        }
        int var8 = class77.field1385;
        int var9 = class77.field1386;
        int var10 = class77.field1381;
        if (field318 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field318 = 3;
                field324 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field319 = class135.field2245;
                field320 = class135.field2301;
                field334 = class135.field2257;
                field318 = 2;
                field324 = 0;
            }
        } else if (field318 == 2) {
            short var14 = 231;
            int var22 = var14 + 30;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field324 = 0;
            }
            var22 += 15;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field324 = 1;
            }
            var22 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field321 = field321.trim();
                if (field321.length() == 0) {
                    method2297(class135.field2209, class135.field2210, class135.field2211);
                    return;
                }
                if (field304.length() == 0) {
                    method2297(class135.field2212, class135.field2206, class135.field2214);
                    return;
                }
                method2297(class135.field2290, class135.field2303, class135.field2304);
                client.method3172(20);
                return;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field318 = 0;
                field321 = "";
                field304 = "";
            }
            while (true) {
                while (class75.method556()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field325.length(); var19++) {
                        if (Statics.field1248 == field325.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (field324 == 0) {
                        if (Statics.field1496 == 85 && field321.length() > 0) {
                            field321 = field321.substring(0, field321.length() - 1);
                        }
                        if (Statics.field1496 == 84 || Statics.field1496 == 80) {
                            field324 = 1;
                        }
                        if (var18 && field321.length() < 320) {
                            field321 = field321 + Statics.field1248;
                        }
                    } else if (field324 == 1) {
                        if (Statics.field1496 == 85 && field304.length() > 0) {
                            field304 = field304.substring(0, field304.length() - 1);
                        }
                        if (Statics.field1496 == 84 || Statics.field1496 == 80) {
                            field324 = 0;
                        }
                        if (Statics.field1496 == 84) {
                            field321 = field321.trim();
                            if (field321.length() == 0) {
                                method2297(class135.field2209, class135.field2210, class135.field2211);
                                return;
                            }
                            if (field304.length() == 0) {
                                method2297(class135.field2212, class135.field2206, class135.field2214);
                                return;
                            }
                            method2297(class135.field2290, class135.field2303, class135.field2304);
                            client.method3172(20);
                            return;
                        }
                        if (var18 && field304.length() < 20) {
                            field304 = field304 + Statics.field1248;
                        }
                    }
                }
                return;
            }
        } else if (field318 == 3) {
            short var20 = 382;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field318 = 0;
            }
        }
    }

    @ObfuscatedName("f.h(Lgm;Lgm;I)V")
    public static void method53(class183 arg0, class183 arg1) {
        if (field322) {
            if (Statics.field2413 == null) {
                Statics.field2413 = class84.method1648(Statics.field1734, "sl_back", "");
            }
            if (Statics.field327 == null) {
                Statics.field327 = class84.method2354(Statics.field1734, "sl_flags", "");
            }
            if (Statics.field185 == null) {
                Statics.field185 = class84.method2354(Statics.field1734, "sl_arrows", "");
            }
            if (Statics.field1279 == null) {
                Statics.field1279 = class84.method2354(Statics.field1734, "sl_stars", "");
            }
            class89.method1807(0, 23, 765, 480, 0);
            class89.method1776(0, 0, 125, 23, 12425273, 9135624);
            class89.method1776(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3375(class135.field2317, 62, 15, 0, -1);
            if (Statics.field1279 != null) {
                Statics.field1279[1].method1759(140, 1);
                arg1.method3373(class135.field2318, 152, 10, 16777215, -1);
                Statics.field1279[0].method1759(140, 12);
                arg1.method3373(class135.field2319, 152, 21, 16777215, -1);
            }
            if (Statics.field185 != null) {
                short var2 = 280;
                if (field329[0] == 0 && field330[0] == 0) {
                    Statics.field185[2].method1759(var2, 4);
                } else {
                    Statics.field185[0].method1759(var2, 4);
                }
                if (field329[0] == 0 && field330[0] == 1) {
                    Statics.field185[3].method1759(var2 + 15, 4);
                } else {
                    Statics.field185[1].method1759(var2 + 15, 4);
                }
                arg0.method3373(class135.field2186, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field329[0] == 1 && field330[0] == 0) {
                    Statics.field185[2].method1759(var3, 4);
                } else {
                    Statics.field185[0].method1759(var3, 4);
                }
                if (field329[0] == 1 && field330[0] == 1) {
                    Statics.field185[3].method1759(var3 + 15, 4);
                } else {
                    Statics.field185[1].method1759(var3 + 15, 4);
                }
                arg0.method3373(class135.field2321, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field329[0] == 2 && field330[0] == 0) {
                    Statics.field185[2].method1759(var4, 4);
                } else {
                    Statics.field185[0].method1759(var4, 4);
                }
                if (field329[0] == 2 && field330[0] == 1) {
                    Statics.field185[3].method1759(var4 + 15, 4);
                } else {
                    Statics.field185[1].method1759(var4 + 15, 4);
                }
                arg0.method3373(class135.field2322, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field329[0] == 3 && field330[0] == 0) {
                    Statics.field185[2].method1759(var5, 4);
                } else {
                    Statics.field185[0].method1759(var5, 4);
                }
                if (field329[0] == 3 && field330[0] == 1) {
                    Statics.field185[3].method1759(var5 + 15, 4);
                } else {
                    Statics.field185[1].method1759(var5 + 15, 4);
                }
                arg0.method3373(class135.field2323, var5 + 32, 17, 16777215, -1);
            }
            class89.method1807(708, 4, 50, 16, 0);
            arg1.method3375(class135.field2311, 733, 16, 16777215, -1);
            field331 = -1;
            if (Statics.field2413 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field333) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field333) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field333) {
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
                for (int var20 = 0; var20 < field333; var20++) {
                    class13 var21 = Statics.field119[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field205);
                    if (var21.field205 == -1) {
                        var23 = class135.field2324;
                        var22 = false;
                    } else if (var21.field205 > 1980) {
                        var23 = class135.field2169;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.field199) {
                        if (var21.field206) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.field206) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class77.field1379 >= var17 && class77.field1380 >= var16 && class77.field1379 < var6 + var17 && class77.field1380 < var7 + var16 && var22) {
                        field331 = var20;
                        Statics.field2413[var24].method1681(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field2413[var24].method1675(var17, var16);
                    }
                    if (Statics.field327 != null) {
                        Statics.field327[(var21.field206 ? 8 : 0) + var21.field203].method1759(var17 + 29, var16);
                    }
                    arg0.method3375(Integer.toString(var21.field202), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3375(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3370(Statics.field119[field331].field207) + 6;
                    int var26 = arg1.field2832 + 8;
                    class89.method1807(class77.field1379 - var25 / 2, class77.field1380 + 20 + 5, var25, var26, 16777120);
                    class89.method1784(class77.field1379 - var25 / 2, class77.field1380 + 20 + 5, var25, var26, 0);
                    arg1.method3375(Statics.field119[field331].field207, class77.field1379, class77.field1380 + 20 + 5 + arg1.field2832 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field194.getGraphics();
                Statics.field181.method1616(var27, 0, 0);
            } catch (Exception var80) {
                Statics.field194.repaint();
            }
            return;
        }
        if (client.field652 == 0 || client.field652 == 5) {
            byte var29 = 20;
            arg0.method3375(class135.field2298, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class89.method1784(230, var30, 304, 34, 9179409);
            class89.method1784(231, var30 + 1, 302, 32, 0);
            class89.method1807(232, var30 + 2, field303 * 3, 30, 9179409);
            class89.method1807(field303 * 3 + 232, var30 + 2, 300 - field303 * 3, 30, 0);
            arg0.method3375(field317, 382, 276 - var29, 16777215, -1);
        }
        if (client.field652 == 20) {
            Statics.field305.method1759(382 - Statics.field305.field1462 / 2, 271 - Statics.field305.field1464 / 2);
            short var31 = 211;
            arg0.method3375(field319, 382, var31, 16776960, 0);
            int var82 = var31 + 15;
            arg0.method3375(field320, 382, var82, 16776960, 0);
            int var83 = var82 + 15;
            arg0.method3375(field334, 382, var83, 16776960, 0);
            int var84 = var83 + 15;
            int var85 = var84 + 10;
            arg0.method3373(class135.field2305, 272, var85, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field321; arg0.method3370(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3373(class185.method3423(var33), 312, var85, 16777215, 0);
            var82 = var85 + 15;
            arg0.method3373(class135.field2230 + class148.method1223(field304), 274, var82, 16777215, 0);
            var82 += 15;
        }
        if (client.field652 == 10) {
            Statics.field305.method1759(202, 171);
            if (field318 == 0) {
                short var34 = 251;
                arg0.method3375(class135.field2218, 382, var34, 16776960, 0);
                int var86 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field328.method1759(var35 - 73, var36 - 20);
                arg0.method3430(class135.field2308, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field328.method1759(var37 - 73, var36 - 20);
                arg0.method3430(class135.field2309, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field318 == 2) {
                short var38 = 211;
                arg0.method3375(field319, 382, var38, 16776960, 0);
                int var87 = var38 + 15;
                arg0.method3375(field320, 382, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3375(field334, 382, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3373(class135.field2305, 272, var90, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field321; arg0.method3370(var40) > var39; var40 = var40.substring(1)) {
                }
                arg0.method3373(class185.method3423(var40) + (field324 == 0 & client.field477 % 40 < 20 ? class2.method1496(16776960) + class2.field22 : ""), 312, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3373(class135.field2230 + class148.method1223(field304) + (field324 == 1 & client.field477 % 40 < 20 ? class2.method1496(16776960) + class2.field22 : ""), 274, var87, 16777215, 0);
                var87 += 15;
                short var41 = 302;
                short var42 = 321;
                Statics.field328.method1759(var41 - 73, var42 - 20);
                arg0.method3375(class135.field2310, var41, var42 + 5, 16777215, 0);
                short var43 = 462;
                Statics.field328.method1759(var43 - 73, var42 - 20);
                arg0.method3375(class135.field2311, var43, var42 + 5, 16777215, 0);
            } else if (field318 == 3) {
                arg0.method3375(class135.field2261, 382, 211, 16776960, 0);
                short var44 = 236;
                arg0.method3375(class135.field2313, 382, var44, 16777215, 0);
                int var91 = var44 + 15;
                arg0.method3375(class135.field2314, 382, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3375(class135.field2315, 382, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method3375(class135.field2316, 382, var93, 16777215, 0);
                int var94 = var93 + 15;
                short var45 = 382;
                short var46 = 321;
                Statics.field328.method1759(var45 - 73, var46 - 20);
                arg0.method3375(class135.field2311, var45, var46 + 5, 16777215, 0);
            }
        }
        if (field314 > 0) {
            int var47 = field314;
            short var48 = 256;
            field312 += var47 * 128;
            if (field312 > Statics.field1912.length) {
                field312 -= Statics.field1912.length;
                int var49 = (int) (Math.random() * 12.0D);
                method257(Statics.field1986[var49]);
            }
            int var50 = 0;
            int var51 = var47 * 128;
            int var52 = (var48 - var47) * 128;
            for (int var53 = 0; var53 < var52; var53++) {
                int var54 = Statics.field88[var50 + var51] - Statics.field1912[field312 + var50 & Statics.field1912.length - 1] * var47 / 6;
                if (var54 < 0) {
                    var54 = 0;
                }
                Statics.field88[var50++] = var54;
            }
            for (int var55 = var48 - var47; var55 < var48; var55++) {
                int var56 = var55 * 128;
                for (int var57 = 0; var57 < 128; var57++) {
                    int var58 = (int) (Math.random() * 100.0D);
                    if (var58 < 50 && var57 > 10 && var57 < 118) {
                        Statics.field88[var56 + var57] = 255;
                    } else {
                        Statics.field88[var56 + var57] = 0;
                    }
                }
            }
            if (field309 > 0) {
                field309 -= var47 * 4;
            }
            if (field311 > 0) {
                field311 -= var47 * 4;
            }
            if (field309 == 0 && field311 == 0) {
                int var59 = (int) (Math.random() * (double) (2000 / var47));
                if (var59 == 0) {
                    field309 = 1024;
                }
                if (var59 == 1) {
                    field311 = 1024;
                }
            }
            for (int var60 = 0; var60 < var48 - var47; var60++) {
                field306[var60] = field306[var47 + var60];
            }
            for (int var61 = var48 - var47; var61 < var48; var61++) {
                field306[var61] = (int) (Math.sin((double) field315 / 14.0D) * 16.0D + Math.sin((double) field315 / 15.0D) * 14.0D + Math.sin((double) field315 / 16.0D) * 12.0D);
                field315++;
            }
            field323 += var47 * -617073323;
            int var62 = ((client.field477 & 0x1) + var47) / 2;
            if (var62 > 0) {
                for (int var63 = 0; var63 < field323 * 509902548; var63++) {
                    int var64 = (int) (Math.random() * 124.0D) + 2;
                    int var65 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field88[(var65 << 7) + var64] = 192;
                }
                field323 = 0;
                int var66 = 0;
                label387: while (true) {
                    if (var66 >= var48) {
                        int var70 = 0;
                        while (true) {
                            if (var70 >= 128) {
                                break label387;
                            }
                            int var71 = 0;
                            for (int var72 = -var62; var72 < var48; var72++) {
                                int var73 = var72 * 128;
                                if (var62 + var72 < var48) {
                                    var71 += Statics.field852[var62 * 128 + var70 + var73];
                                }
                                if (var72 - (var62 + 1) >= 0) {
                                    var71 -= Statics.field852[var70 + var73 - (var62 + 1) * 128];
                                }
                                if (var72 >= 0) {
                                    Statics.field88[var70 + var73] = var71 / (var62 * 2 + 1);
                                }
                            }
                            var70++;
                        }
                    }
                    int var67 = 0;
                    int var68 = var66 * 128;
                    for (int var69 = -var62; var69 < 128; var69++) {
                        if (var62 + var69 < 128) {
                            var67 += Statics.field88[var68 + var69 + var62];
                        }
                        if (var69 - (var62 + 1) >= 0) {
                            var67 -= Statics.field88[var68 + var69 - (var62 + 1)];
                        }
                        if (var69 >= 0) {
                            Statics.field852[var68 + var69] = var67 / (var62 * 2 + 1);
                        }
                    }
                    var66++;
                }
            }
            field314 = 0;
        }
        method143();
        Statics.field2585[Statics.field60.field196 ? 1 : 0].method1759(725, 463);
        if (client.field652 > 5 && client.field474 == 0) {
            if (Statics.field1737 == null) {
                Statics.field1737 = class84.method2377(Statics.field1734, "sl_button", "");
            } else {
                byte var74 = 5;
                short var75 = 463;
                byte var76 = 100;
                byte var77 = 35;
                Statics.field1737.method1759(var74, var75);
                arg0.method3375(class135.field2278 + " " + client.field692, var76 / 2 + var74, var77 / 2 + var75 - 2, 16777215, 0);
                if (Statics.field2030 == null) {
                    arg1.method3375(class135.field2192, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
                } else {
                    arg1.method3375(class135.field2326, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var78 = Statics.field194.getGraphics();
            Statics.field181.method1616(var78, 0, 0);
        } catch (Exception var81) {
            Statics.field194.repaint();
        }
    }

    @ObfuscatedName("dy.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2297(String arg0, String arg1, String arg2) {
        field319 = arg0;
        field320 = arg1;
        field334 = arg2;
    }

    @ObfuscatedName("at.f(Lcy;B)V")
    public static final void method257(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1912.length; var2++) {
            Statics.field1912[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1912[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field265[var8] = (Statics.field1912[var8 - 1] + Statics.field1912[var8 + 1] + Statics.field1912[var8 - 128] + Statics.field1912[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1912;
            Statics.field1912 = Statics.field265;
            Statics.field265 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1464; var11++) {
            for (int var12 = 0; var12 < arg0.field1462; var12++) {
                if (arg0.field1468[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1465;
                    int var14 = var11 + 16 + arg0.field1466;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1912[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("y.q(IIII)I")
    public static final int method160(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("v.l(I)V")
    public static final void method143() {
        short var0 = 256;
        if (field309 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field309 > 768) {
                    Statics.field1745[var1] = method160(Statics.field1976[var1], Statics.field402[var1], 1024 - field309);
                } else if (field309 > 256) {
                    Statics.field1745[var1] = Statics.field402[var1];
                } else {
                    Statics.field1745[var1] = method160(Statics.field402[var1], Statics.field1976[var1], 256 - field309);
                }
            }
        } else if (field311 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field311 > 768) {
                    Statics.field1745[var2] = method160(Statics.field1976[var2], Statics.field761[var2], 1024 - field311);
                } else if (field311 > 256) {
                    Statics.field1745[var2] = Statics.field761[var2];
                } else {
                    Statics.field1745[var2] = method160(Statics.field761[var2], Statics.field1976[var2], 256 - field311);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1745[var3] = Statics.field1976[var3];
            }
        }
        class89.method1793(0, 9, 128, var0 + 7);
        Statics.field1503.method1675(0, 0);
        class89.method1781();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field306[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field88[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1745[var10];
                    int var14 = Statics.field181.field1442[var5];
                    Statics.field181.field1442[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1793(637, 9, 765, var0 + 7);
        Statics.field2345.method1675(382, 0);
        class89.method1781();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field306[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field88[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1745[var22];
                    int var26 = Statics.field181.field1442[var20];
                    Statics.field181.field1442[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("r.d(Lbc;B)V")
    public static void method138(class73 arg0) {
        if (class77.field1385 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1386 >= var1 && class77.field1386 <= var1 + 14 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(0, 0);
            return;
        }
        if (class77.field1386 >= var1 + 15 && class77.field1386 <= var1 + 80 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1386 >= var2 && class77.field1386 <= var2 + 14 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(1, 0);
            return;
        }
        if (class77.field1386 >= var2 + 15 && class77.field1386 <= var2 + 80 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1386 >= var3 && class77.field1386 <= var3 + 14 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(2, 0);
            return;
        }
        if (class77.field1386 >= var3 + 15 && class77.field1386 <= var3 + 80 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1386 >= var4 && class77.field1386 <= var4 + 14 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(3, 0);
            return;
        }
        if (class77.field1386 >= var4 + 15 && class77.field1386 <= var4 + 80 && class77.field1381 >= 4 && class77.field1381 <= 18) {
            method1353(3, 1);
            return;
        }
        if (class77.field1386 >= 708 && class77.field1381 >= 4 && class77.field1386 <= 758 && class77.field1381 <= 20) {
            field322 = false;
            Statics.field1503.method1675(0, 0);
            Statics.field2345.method1675(382, 0);
            Statics.field183.method1759(382 - Statics.field183.field1462 / 2, 18);
            return;
        }
        if (field331 == -1) {
            return;
        }
        class13 var5 = Statics.field119[field331];
        if (client.field472 != var5.field206) {
            client.field472 = var5.field206;
            boolean var6 = var5.field206;
            if (Statics.field2772 != var6) {
                class40.field967.method3251();
                class40.field968.method3251();
                class40.field969.method3251();
                Statics.field2772 = var6;
            }
        }
        Statics.field1935 = var5.field201;
        client.field692 = var5.field202;
        Statics.field1244 = client.field469 == 0 ? 43594 : var5.field202 + 40000;
        Statics.field1807 = client.field469 == 0 ? 443 : var5.field202 + 50000;
        Statics.field1292 = Statics.field1244;
        field322 = false;
        Statics.field1503.method1675(0, 0);
        Statics.field2345.method1675(382, 0);
        Statics.field183.method1759(382 - Statics.field183.field1462 / 2, 18);
        return;
    }

    @ObfuscatedName("e.z(I)V")
    public static void method5() {
        try {
            if (Statics.field2030 == null) {
                Statics.field2030 = new class24(Statics.field12, new URL(Statics.field2584));
            } else {
                byte[] var0 = Statics.field2030.method217();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field333 = var1.method2572();
                    Statics.field119 = new class13[field333];
                    int var2 = 0;
                    while (var2 < field333) {
                        class13 var3 = Statics.field119[var2] = new class13();
                        int var4 = var1.method2572();
                        var3.field202 = var4 & 0x3FFF;
                        var3.field206 = (var4 & 0x8000) != 0;
                        var3.field199 = (var4 & 0x4000) != 0;
                        var3.field201 = var1.method2444();
                        var3.field207 = var1.method2444();
                        var3.field203 = var1.method2436();
                        var3.field205 = var1.method2531();
                        var3.field204 = var2++;
                    }
                    method1657(Statics.field119, 0, Statics.field119.length - 1, field329, field330);
                    field322 = true;
                    Statics.field2030 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field2030 = null;
        }
    }

    @ObfuscatedName("ba.n(III)V")
    public static void method1353(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field329[var5] != arg0) {
                var2[var4] = field329[var5];
                var3[var4] = field330[var5];
                var4++;
            }
        }
        field329 = var2;
        field330 = var3;
        method1657(Statics.field119, 0, Statics.field119.length - 1, field329, field330);
    }

    @ObfuscatedName("cs.t([Ln;II[I[II)V")
    public static void method1657(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field204;
                        var12 = var8.field204;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field205;
                        var12 = var8.field205;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field206 ? 1 : 0;
                        var12 = var8.field206 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field202;
                        var12 = var8.field202;
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
                        var15 = arg0[var5].field204;
                        var16 = var8.field204;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field205;
                        var16 = var8.field205;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field206 ? 1 : 0;
                        var16 = var8.field206 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field202;
                        var16 = var8.field202;
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
        method1657(arg0, arg1, var6, arg3, arg4);
        method1657(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
