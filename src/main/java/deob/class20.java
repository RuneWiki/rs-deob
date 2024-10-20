package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("y")
public class class20 {

    @ObfuscatedName("y.g")
    public static boolean field331 = false;

    @ObfuscatedName("y.f")
    public static int[] field306 = new int[256];

    @ObfuscatedName("y.y")
    public static int field308 = 0;

    @ObfuscatedName("y.a")
    public static int field321 = 0;

    @ObfuscatedName("y.s")
    public static int field310 = 0;

    @ObfuscatedName("y.au")
    public static int field320 = 0;

    @ObfuscatedName("y.ay")
    public static int field312 = 0;

    @ObfuscatedName("y.ar")
    public static int field313 = 0;

    @ObfuscatedName("y.aj")
    public static int field300 = 10;

    @ObfuscatedName("y.ad")
    public static String field315 = "";

    @ObfuscatedName("y.at")
    public static int field316 = 0;

    @ObfuscatedName("y.as")
    public static String field317 = "";

    @ObfuscatedName("y.aw")
    public static String field318 = "";

    @ObfuscatedName("y.ax")
    public static String field309 = "";

    @ObfuscatedName("y.am")
    public static String field323 = "";

    @ObfuscatedName("y.an")
    public static String field307 = "";

    @ObfuscatedName("y.ap")
    public static int field322 = 0;

    @ObfuscatedName("y.ae")
    public static String field327 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("y.ac")
    public static boolean field314 = false;

    @ObfuscatedName("y.ab")
    public static int field325 = 0;

    @ObfuscatedName("y.bh")
    public static int[] field299 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("y.bp")
    public static int[] field328 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("y.bt")
    public static int field329 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.z(Len;Len;I)I")
    public static int method2101(class150 arg0, class150 arg1) {
        int var2 = 0;
        if (arg0.method2969("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2969("logo", "")) {
            var2++;
        }
        if (arg1.method2969("titlebox", "")) {
            var2++;
        }
        if (arg1.method2969("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2969("runes", "")) {
            var2++;
        }
        if (arg1.method2969("title_mute", "")) {
            var2++;
        }
        arg1.method2969("sl_back", "");
        arg1.method2969("sl_flags", "");
        arg1.method2969("sl_arrows", "");
        arg1.method2969("sl_stars", "");
        arg1.method2969("sl_button", "");
        return var2;
    }

    @ObfuscatedName("an.h(Lbn;I)V")
    public static void method805(class72 arg0) {
        if (field314) {
            method574(arg0);
            return;
        }
        if (class76.field1385 == 1 && class76.field1393 >= 715 && class76.field1397 >= 453) {
            field331 = !field331;
            if (field331) {
                Statics.method145();
            } else {
                class137.method141(Statics.field1979, "scape main", "", 255, false);
            }
        }
        if (client.field479 == 5) {
            return;
        }
        field312++;
        if (client.field479 != 10) {
            return;
        }
        if (client.field476 == 0) {
            if (class76.field1385 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class76.field1393 >= var1 && class76.field1393 <= var1 + var3 && class76.field1397 >= var2 && class76.field1397 <= var2 + var4) {
                    method169();
                    return;
                }
            }
            if (Statics.field231 != null) {
                method169();
            }
        }
        int var5 = class76.field1385;
        int var6 = class76.field1393;
        int var7 = class76.field1397;
        if (field316 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field316 = 3;
                field322 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field317 = class133.field2211;
                field318 = class133.field2243;
                field309 = class133.field2244;
                field316 = 2;
                field322 = 0;
            }
        } else if (field316 == 2) {
            short var11 = 231;
            int var19 = var11 + 30;
            if (var5 == 1 && var7 >= var19 - 15 && var7 < var19) {
                field322 = 0;
            }
            var19 += 15;
            if (var5 == 1 && var7 >= var19 - 15 && var7 < var19) {
                field322 = 1;
            }
            var19 += 15;
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field323 = field323.trim();
                if (field323.length() == 0) {
                    method2888(class133.field2152, class133.field2153, class133.field2154);
                    return;
                }
                if (field307.length() == 0) {
                    method2888(class133.field2155, class133.field2256, class133.field2157);
                    return;
                }
                method2888(class133.field2245, class133.field2144, class133.field2082);
                client.method2(20);
                return;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field316 = 0;
                field323 = "";
                field307 = "";
            }
            while (true) {
                while (class74.method212()) {
                    boolean var15 = false;
                    for (int var16 = 0; var16 < field327.length(); var16++) {
                        if (Statics.field383 == field327.charAt(var16)) {
                            var15 = true;
                            break;
                        }
                    }
                    if (field322 == 0) {
                        if (Statics.field181 == 85 && field323.length() > 0) {
                            field323 = field323.substring(0, field323.length() - 1);
                        }
                        if (Statics.field181 == 84 || Statics.field181 == 80) {
                            field322 = 1;
                        }
                        if (var15 && field323.length() < 320) {
                            field323 = field323 + Statics.field383;
                        }
                    } else if (field322 == 1) {
                        if (Statics.field181 == 85 && field307.length() > 0) {
                            field307 = field307.substring(0, field307.length() - 1);
                        }
                        if (Statics.field181 == 84 || Statics.field181 == 80) {
                            field322 = 0;
                        }
                        if (client.field636 == 2 && Statics.field181 == 84) {
                            field323 = field323.trim();
                            if (field323.length() == 0) {
                                method2888(class133.field2152, class133.field2153, class133.field2154);
                                return;
                            }
                            if (field307.length() == 0) {
                                method2888(class133.field2155, class133.field2256, class133.field2157);
                                return;
                            }
                            method2888(class133.field2245, class133.field2144, class133.field2082);
                            client.method2(20);
                            return;
                        }
                        if (var15 && field307.length() < 20) {
                            field307 = field307 + Statics.field383;
                        }
                    }
                }
                return;
            }
        } else if (field316 == 3) {
            short var17 = 382;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field316 = 0;
            }
        }
    }

    @ObfuscatedName("z.c(Lfd;Lfd;I)V")
    public static void method5(class181 arg0, class181 arg1) {
        if (!field314) {
            if (client.field479 == 0 || client.field479 == 5) {
                byte var25 = 20;
                arg0.method3394(class133.field2241, 382, 245 - var25, 16777215, -1);
                int var26 = 253 - var25;
                class88.method1763(230, var26, 304, 34, 9179409);
                class88.method1763(231, var26 + 1, 302, 32, 0);
                class88.method1761(232, var26 + 2, field300 * 3, 30, 9179409);
                class88.method1761(field300 * 3 + 232, var26 + 2, 300 - field300 * 3, 30, 0);
                arg0.method3394(field315, 382, 276 - var25, 16777215, -1);
            }
            if (client.field479 == 20) {
                Statics.field298.method1742(382 - Statics.field298.field1468 / 2, 271 - Statics.field298.field1473 / 2);
                short var27 = 211;
                arg0.method3394(field317, 382, var27, 16776960, 0);
                int var67 = var27 + 15;
                arg0.method3394(field318, 382, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method3394(field309, 382, var68, 16776960, 0);
                int var69 = var68 + 15;
                int var70 = var69 + 10;
                arg0.method3408(class133.field2168, 272, var70, 16777215, 0);
                short var28 = 200;
                String var29;
                for (var29 = field323; arg0.method3409(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
                }
                arg0.method3408(class183.method3391(var29), 312, var70, 16777215, 0);
                var67 = var70 + 15;
                String var31 = class133.field2249;
                String var32 = field307;
                int var33 = var32.length();
                char[] var34 = new char[var33];
                for (int var35 = 0; var35 < var33; var35++) {
                    var34[var35] = '*';
                }
                String var36 = new String(var34);
                arg0.method3408(var31 + var36, 274, var67, 16777215, 0);
                var67 += 15;
            }
            if (client.field479 == 10) {
                Statics.field298.method1742(202, 171);
                if (field316 == 0) {
                    short var38 = 251;
                    arg0.method3394(class133.field2203, 382, var38, 16776960, 0);
                    int var71 = var38 + 30;
                    short var39 = 302;
                    short var40 = 291;
                    Statics.field1800.method1742(var39 - 73, var40 - 20);
                    arg0.method3395(class133.field2247, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var41 = 462;
                    Statics.field1800.method1742(var41 - 73, var40 - 20);
                    arg0.method3395(class133.field2252, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field316 == 2) {
                    short var42 = 211;
                    arg0.method3394(field317, 382, var42, 16776960, 0);
                    int var72 = var42 + 15;
                    arg0.method3394(field318, 382, var72, 16776960, 0);
                    int var73 = var72 + 15;
                    arg0.method3394(field309, 382, var73, 16776960, 0);
                    int var74 = var73 + 15;
                    int var75 = var74 + 10;
                    arg0.method3408(class133.field2168, 272, var75, 16777215, 0);
                    short var43 = 200;
                    String var44;
                    for (var44 = field323; arg0.method3409(var44) > var43; var44 = var44.substring(1)) {
                    }
                    arg0.method3408(class183.method3391(var44) + (field322 == 0 & client.field481 % 40 < 20 ? class2.method644(16776960) + class2.field23 : ""), 312, var75, 16777215, 0);
                    var72 = var75 + 15;
                    String var46 = class133.field2249;
                    String var47 = field307;
                    int var48 = var47.length();
                    char[] var49 = new char[var48];
                    for (int var50 = 0; var50 < var48; var50++) {
                        var49[var50] = '*';
                    }
                    String var51 = new String(var49);
                    arg0.method3408(var46 + var51 + (field322 == 1 & client.field481 % 40 < 20 ? class2.method644(16776960) + class2.field23 : ""), 274, var72, 16777215, 0);
                    var72 += 15;
                    short var53 = 302;
                    short var54 = 321;
                    Statics.field1800.method1742(var53 - 73, var54 - 20);
                    arg0.method3394(class133.field2248, var53, var54 + 5, 16777215, 0);
                    short var55 = 462;
                    Statics.field1800.method1742(var55 - 73, var54 - 20);
                    arg0.method3394(class133.field2254, var55, var54 + 5, 16777215, 0);
                } else if (field316 == 3) {
                    arg0.method3394(class133.field2255, 382, 211, 16776960, 0);
                    short var56 = 236;
                    arg0.method3394(class133.field2197, 382, var56, 16777215, 0);
                    int var76 = var56 + 15;
                    arg0.method3394(class133.field2257, 382, var76, 16777215, 0);
                    int var77 = var76 + 15;
                    arg0.method3394(class133.field2258, 382, var77, 16777215, 0);
                    int var78 = var77 + 15;
                    arg0.method3394(class133.field2196, 382, var78, 16777215, 0);
                    int var79 = var78 + 15;
                    short var57 = 382;
                    short var58 = 321;
                    Statics.field1800.method1742(var57 - 73, var58 - 20);
                    arg0.method3394(class133.field2254, var57, var58 + 5, 16777215, 0);
                }
            }
            if (field312 > 0) {
                method3064(field312);
                field312 = 0;
            }
            method2185();
            Statics.field302[field331 ? 1 : 0].method1742(725, 463);
            if (client.field479 > 5 && client.field476 == 0) {
                if (Statics.field1357 == null) {
                    Statics.field1357 = class83.method4(Statics.field1288, "sl_button", "");
                } else {
                    byte var59 = 5;
                    short var60 = 463;
                    byte var61 = 100;
                    byte var62 = 35;
                    Statics.field1357.method1742(var59, var60);
                    arg0.method3394(class133.field2135 + " " + client.field470, var61 / 2 + var59, var62 / 2 + var60 - 2, 16777215, 0);
                    if (Statics.field231 == null) {
                        arg1.method3394(class133.field2270, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    } else {
                        arg1.method3394(class133.field2269, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var63 = Statics.field1780.getGraphics();
                Statics.field87.method1592(var63, 0, 0);
            } catch (Exception var66) {
                Statics.field1780.repaint();
            }
            return;
        }
        if (Statics.field1198 == null) {
            Statics.field1198 = class83.method2190(Statics.field1288, "sl_back", "");
        }
        if (Statics.field182 == null) {
            Statics.field182 = class83.method144(Statics.field1288, "sl_flags", "");
        }
        if (Statics.field2635 == null) {
            Statics.field2635 = class83.method144(Statics.field1288, "sl_arrows", "");
        }
        if (Statics.field1038 == null) {
            Statics.field1038 = class83.method144(Statics.field1288, "sl_stars", "");
        }
        class88.method1761(0, 23, 765, 480, 0);
        class88.method1772(0, 0, 125, 23, 12425273, 9135624);
        class88.method1772(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3394(class133.field2260, 62, 15, 0, -1);
        if (Statics.field1038 != null) {
            Statics.field1038[1].method1742(140, 1);
            arg1.method3408(class133.field2261, 152, 10, 16777215, -1);
            Statics.field1038[0].method1742(140, 12);
            arg1.method3408(class133.field2262, 152, 21, 16777215, -1);
        }
        if (Statics.field2635 != null) {
            short var2 = 280;
            if (field299[0] == 0 && field328[0] == 0) {
                Statics.field2635[2].method1742(var2, 4);
            } else {
                Statics.field2635[0].method1742(var2, 4);
            }
            if (field299[0] == 0 && field328[0] == 1) {
                Statics.field2635[3].method1742(var2 + 15, 4);
            } else {
                Statics.field2635[1].method1742(var2 + 15, 4);
            }
            arg0.method3408(class133.field2263, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field299[0] == 1 && field328[0] == 0) {
                Statics.field2635[2].method1742(var3, 4);
            } else {
                Statics.field2635[0].method1742(var3, 4);
            }
            if (field299[0] == 1 && field328[0] == 1) {
                Statics.field2635[3].method1742(var3 + 15, 4);
            } else {
                Statics.field2635[1].method1742(var3 + 15, 4);
            }
            arg0.method3408(class133.field2264, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field299[0] == 2 && field328[0] == 0) {
                Statics.field2635[2].method1742(var4, 4);
            } else {
                Statics.field2635[0].method1742(var4, 4);
            }
            if (field299[0] == 2 && field328[0] == 1) {
                Statics.field2635[3].method1742(var4 + 15, 4);
            } else {
                Statics.field2635[1].method1742(var4 + 15, 4);
            }
            arg0.method3408(class133.field2265, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field299[0] == 3 && field328[0] == 0) {
                Statics.field2635[2].method1742(var5, 4);
            } else {
                Statics.field2635[0].method1742(var5, 4);
            }
            if (field299[0] == 3 && field328[0] == 1) {
                Statics.field2635[3].method1742(var5 + 15, 4);
            } else {
                Statics.field2635[1].method1742(var5 + 15, 4);
            }
            arg0.method3408(class133.field2266, var5 + 32, 17, 16777215, -1);
        }
        class88.method1761(708, 4, 50, 16, 0);
        arg1.method3394(class133.field2254, 733, 16, 16777215, -1);
        field329 = -1;
        if (Statics.field1198 != null) {
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
                class12 var20 = Statics.field273[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field186);
                if (var20.field186 == -1) {
                    var22 = class133.field2267;
                    var21 = false;
                } else if (var20.field186 > 1980) {
                    var22 = class133.field2268;
                    var21 = false;
                }
                if (class76.field1389 >= var17 && class76.field1390 >= var16 && class76.field1389 < var6 + var17 && class76.field1390 < var7 + var16 && var21) {
                    field329 = var19;
                    Statics.field1198[var20.field191 ? 1 : 0].method1716(var17, var16, 128, 16777215);
                } else {
                    Statics.field1198[var20.field191 ? 1 : 0].method1673(var17, var16);
                }
                if (Statics.field182 != null) {
                    Statics.field182[var20.field189 + (var20.field191 ? 8 : 0)].method1742(var17 + 29, var16);
                }
                arg0.method3394(Integer.toString(var20.field194), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3394(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
            Graphics var23 = Statics.field1780.getGraphics();
            Statics.field87.method1592(var23, 0, 0);
        } catch (Exception var65) {
            Statics.field1780.repaint();
        }
    }

    @ObfuscatedName("es.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2888(String arg0, String arg1, String arg2) {
        field317 = arg0;
        field318 = arg1;
        field309 = arg2;
    }

    @ObfuscatedName("b.i(Lci;I)V")
    public static final void method123(class86 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field345.length; var2++) {
            Statics.field345[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field345[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1911[var8] = (Statics.field345[var8 - 1] + Statics.field345[var8 + 1] + Statics.field345[var8 - 128] + Statics.field345[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field345;
            Statics.field345 = Statics.field1911;
            Statics.field1911 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1473; var11++) {
            for (int var12 = 0; var12 < arg0.field1468; var12++) {
                if (arg0.field1466[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1470;
                    int var14 = var11 + 16 + arg0.field1471;
                    int var15 = (var14 << 7) + var13;
                    Statics.field345[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ek.v(IB)V")
    public static final void method3064(int arg0) {
        short var1 = 256;
        field310 += arg0 * 128;
        if (field310 > Statics.field345.length) {
            field310 -= Statics.field345.length;
            int var2 = (int) (Math.random() * 12.0D);
            method123(Statics.field319[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field403[var3 + var4] - Statics.field345[field310 + var3 & Statics.field345.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field403[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field403[var9 + var10] = 255;
                } else {
                    Statics.field403[var9 + var10] = 0;
                }
            }
        }
        if (field308 > 0) {
            field308 -= arg0 * 4;
        }
        if (field321 > 0) {
            field321 -= arg0 * 4;
        }
        if (field308 == 0 && field321 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field308 = 1024;
            }
            if (var12 == 1) {
                field321 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field306[var13] = field306[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field306[var14] = (int) (Math.sin((double) field313 / 14.0D) * 16.0D + Math.sin((double) field313 / 15.0D) * 14.0D + Math.sin((double) field313 / 16.0D) * 12.0D);
            field313++;
        }
        field320 += arg0 * 1921390687;
        int var15 = ((client.field481 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field320 * 1300392476; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field403[(var18 << 7) + var17] = 192;
        }
        field320 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field403[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field403[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1339[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1339[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1339[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field403[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("q.l(IIII)I")
    public static final int method165(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dw.m(I)V")
    public static final void method2185() {
        short var0 = 256;
        if (field308 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field308 > 768) {
                    Statics.field1786[var1] = method165(Statics.field371[var1], Statics.field1995[var1], 1024 - field308);
                } else if (field308 > 256) {
                    Statics.field1786[var1] = Statics.field1995[var1];
                } else {
                    Statics.field1786[var1] = method165(Statics.field1995[var1], Statics.field371[var1], 256 - field308);
                }
            }
        } else if (field321 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field321 > 768) {
                    Statics.field1786[var2] = method165(Statics.field371[var2], Statics.field336[var2], 1024 - field321);
                } else if (field321 > 256) {
                    Statics.field1786[var2] = Statics.field336[var2];
                } else {
                    Statics.field1786[var2] = method165(Statics.field336[var2], Statics.field371[var2], 256 - field321);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1786[var3] = Statics.field371[var3];
            }
        }
        class88.method1755(0, 9, 128, var0 + 7);
        Statics.field1768.method1673(0, 0);
        class88.method1754();
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
                int var10 = Statics.field403[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1786[var10];
                    int var14 = Statics.field87.field1449[var5];
                    Statics.field87.field1449[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class88.method1755(637, 9, 765, var0 + 7);
        Statics.field324.method1673(382, 0);
        class88.method1754();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field306[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field403[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1786[var22];
                    int var26 = Statics.field87.field1449[var20];
                    Statics.field87.field1449[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ay.g(Lbn;B)V")
    public static void method574(class72 arg0) {
        if (class76.field1385 != 1) {
            return;
        }
        short var1 = 280;
        if (class76.field1393 >= var1 && class76.field1393 <= var1 + 14 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(0, 0);
            return;
        }
        if (class76.field1393 >= var1 + 15 && class76.field1393 <= var1 + 80 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(0, 1);
            return;
        }
        short var2 = 390;
        if (class76.field1393 >= var2 && class76.field1393 <= var2 + 14 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(1, 0);
            return;
        }
        if (class76.field1393 >= var2 + 15 && class76.field1393 <= var2 + 80 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(1, 1);
            return;
        }
        short var3 = 500;
        if (class76.field1393 >= var3 && class76.field1393 <= var3 + 14 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(2, 0);
            return;
        }
        if (class76.field1393 >= var3 + 15 && class76.field1393 <= var3 + 80 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(2, 1);
            return;
        }
        short var4 = 610;
        if (class76.field1393 >= var4 && class76.field1393 <= var4 + 14 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(3, 0);
            return;
        }
        if (class76.field1393 >= var4 + 15 && class76.field1393 <= var4 + 80 && class76.field1397 >= 4 && class76.field1397 <= 18) {
            method2295(3, 1);
            return;
        }
        if (class76.field1393 >= 708 && class76.field1397 >= 4 && class76.field1393 <= 758 && class76.field1397 <= 20) {
            field314 = false;
            Statics.field1768.method1673(0, 0);
            Statics.field324.method1673(382, 0);
            Statics.field301.method1742(382 - Statics.field301.field1468 / 2, 18);
            return;
        }
        if (field329 == -1) {
            return;
        }
        class12 var5 = Statics.field273[field329];
        if (client.field474 == var5.field191) {
            Statics.field508 = var5.field188;
            client.field470 = var5.field194;
            Statics.field2022 = client.field636 == 0 ? 43594 : var5.field194 + 40000;
            Statics.field736 = client.field636 == 0 ? 443 : var5.field194 + 50000;
            Statics.field1269 = Statics.field2022;
            field314 = false;
            Statics.field1768.method1673(0, 0);
            Statics.field324.method1673(382, 0);
            Statics.field301.method1742(382 - Statics.field301.field1468 / 2, 18);
            return;
        }
        String var6 = "";
        if (client.field636 != 0) {
            var6 = ":" + (var5.field194 + 7000);
        }
        String var7 = "http://" + var5.field188 + var6 + "/j" + client.field614;
        try {
            arg0.getAppletContext().showDocument(new URL(var7), "_self");
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("q.t(I)V")
    public static void method169() {
        try {
            if (Statics.field231 == null) {
                Statics.field231 = new class23(Statics.field1445, new URL(Statics.field494));
            } else {
                byte[] var0 = Statics.field231.method220();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field325 = var1.method2627();
                    Statics.field273 = new class12[field325];
                    int var2 = 0;
                    while (var2 < field325) {
                        class12 var3 = Statics.field273[var2] = new class12();
                        int var4 = var1.method2627();
                        var3.field194 = var4 & 0x7FFF;
                        var3.field191 = (var4 & 0x8000) != 0;
                        var3.field188 = var1.method2603();
                        var3.field189 = var1.method2450();
                        var3.field186 = var1.method2513();
                        var3.field190 = var2++;
                    }
                    method1623(Statics.field273, 0, Statics.field273.length - 1, field299, field328);
                    field314 = true;
                    Statics.field231 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field231 = null;
        }
    }

    @ObfuscatedName("dj.o(III)V")
    public static void method2295(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field299[var5] != arg0) {
                var2[var4] = field299[var5];
                var3[var4] = field328[var5];
                var4++;
            }
        }
        field299 = var2;
        field328 = var3;
        method1623(Statics.field273, 0, Statics.field273.length - 1, field299, field328);
    }

    @ObfuscatedName("cw.b([Lb;II[I[II)V")
    public static void method1623(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field190;
                        var12 = var8.field190;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field186;
                        var12 = var8.field186;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field191 ? 1 : 0;
                        var12 = var8.field191 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field194;
                        var12 = var8.field194;
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
                        var15 = arg0[var5].field190;
                        var16 = var8.field190;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field186;
                        var16 = var8.field186;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field191 ? 1 : 0;
                        var16 = var8.field191 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field194;
                        var16 = var8.field194;
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
        method1623(arg0, arg1, var6, arg3, arg4);
        method1623(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
