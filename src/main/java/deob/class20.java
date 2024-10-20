package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("a")
public class class20 {

    @ObfuscatedName("a.p")
    public static boolean field304 = false;

    @ObfuscatedName("a.h")
    public static int[] field322 = new int[256];

    @ObfuscatedName("a.a")
    public static int field303 = 0;

    @ObfuscatedName("a.v")
    public static int field309 = 0;

    @ObfuscatedName("a.u")
    public static int field311 = 0;

    @ObfuscatedName("a.ap")
    public static int field312 = 0;

    @ObfuscatedName("a.ad")
    public static int field330 = 0;

    @ObfuscatedName("a.ao")
    public static int field314 = 0;

    @ObfuscatedName("a.av")
    public static int field334 = 10;

    @ObfuscatedName("a.af")
    public static String field305 = "";

    @ObfuscatedName("a.ae")
    public static int field317 = 0;

    @ObfuscatedName("a.ax")
    public static String field319 = "";

    @ObfuscatedName("a.aw")
    public static String field331 = "";

    @ObfuscatedName("a.an")
    public static String field320 = "";

    @ObfuscatedName("a.az")
    public static String field321 = "";

    @ObfuscatedName("a.as")
    public static String field307 = "";

    @ObfuscatedName("a.ag")
    public static int field323 = 0;

    @ObfuscatedName("a.am")
    public static String field324 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("a.aj")
    public static boolean field325 = false;

    @ObfuscatedName("a.aq")
    public static int field326 = 0;

    @ObfuscatedName("a.bt")
    public static int[] field302 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("a.bh")
    public static int[] field299 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("a.bl")
    public static int field332 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.c(Lew;Lew;B)I")
    public static int method1265(class150 arg0, class150 arg1) {
        int var2 = 0;
        if (arg0.method2822("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2822("logo", "")) {
            var2++;
        }
        if (arg1.method2822("titlebox", "")) {
            var2++;
        }
        if (arg1.method2822("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2822("runes", "")) {
            var2++;
        }
        if (arg1.method2822("title_mute", "")) {
            var2++;
        }
        arg1.method2822("sl_back", "");
        arg1.method2822("sl_flags", "");
        arg1.method2822("sl_arrows", "");
        arg1.method2822("sl_stars", "");
        arg1.method2822("sl_button", "");
        return var2;
    }

    @ObfuscatedName("r.j(B)I")
    public static int method116() {
        return 6;
    }

    @ObfuscatedName("ax.f(Ljava/awt/Component;Lew;Lew;I)V")
    public static void method661(Component arg0, class150 arg1, class150 arg2) {
        if (Statics.field316) {
            return;
        }
        class88.method1697();
        byte[] var3 = arg1.method2850("title.jpg", "");
        Statics.field301 = new class85(var3, arg0);
        Statics.field2439 = Statics.field301.method1597();
        Statics.field1901 = class83.method49(arg2, "logo", "");
        Statics.field300 = class83.method49(arg2, "titlebox", "");
        Statics.field318 = class83.method49(arg2, "titlebutton", "");
        Statics.field313 = class83.method1559(arg2, "runes", "");
        Statics.field1497 = class83.method1559(arg2, "title_mute", "");
        Statics.field1651 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field1651[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field1651[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field1651[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field1651[var7 + 192] = 16777215;
        }
        Statics.field306 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field306[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field306[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field306[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field306[var11 + 192] = 16777215;
        }
        Statics.field335 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field335[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field335[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field335[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field335[var15 + 192] = 16777215;
        }
        Statics.field2712 = new int[256];
        Statics.field927 = new int[32768];
        Statics.field310 = new int[32768];
        method1522((class86) null);
        Statics.field2035 = new int[32768];
        Statics.field238 = new int[32768];
        field317 = 0;
        field321 = "";
        field307 = "";
        field325 = false;
        if (client.field538 == 0) {
            field304 = true;
        } else {
            field304 = false;
        }
        if (field304) {
            class137.field2312 = 1;
            Statics.field2318 = null;
            Statics.field2426 = -1;
            Statics.field253 = -1;
            Statics.field2320 = 0;
            Statics.field2315 = false;
            Statics.field1242 = 2;
        } else {
            class152 var16 = Statics.field984;
            int var17 = var16.method2836("scape main");
            int var18 = var16.method2844(var17, "");
            class137.method549(2, var16, var17, var18, 255, false);
        }
        class151.method1274(false);
        Statics.field316 = true;
        Statics.field301.method1595(0, 0);
        Statics.field2439.method1595(382, 0);
        Statics.field1901.method1686(382 - Statics.field1901.field1452 / 2, 18);
    }

    @ObfuscatedName("as.y(Lbe;I)V")
    public static void method770(class72 arg0) {
        if (field325) {
            method1305(arg0);
            return;
        }
        if (class76.field1374 == 1 && class76.field1372 >= 715 && class76.field1373 >= 453) {
            field304 = !field304;
            if (field304) {
                Statics.field2012.method2610();
                class137.field2312 = 1;
                Statics.field2318 = null;
            } else {
                class152 var1 = Statics.field984;
                int var2 = var1.method2836("scape main");
                int var3 = var1.method2844(var2, "");
                class137.method2564(var1, var2, var3, 255, false);
            }
        }
        if (client.field474 == 5) {
            return;
        }
        field330++;
        if (client.field474 != 10) {
            return;
        }
        if (client.field571 == 0) {
            if (class76.field1374 == 1) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class76.field1372 >= var4 && class76.field1372 <= var4 + var6 && class76.field1373 >= var5 && class76.field1373 <= var5 + var7) {
                    method109();
                    return;
                }
            }
            if (Statics.field19 != null) {
                method109();
            }
        }
        int var8 = class76.field1374;
        int var9 = class76.field1372;
        int var10 = class76.field1373;
        if (field317 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field317 = 3;
                field323 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field319 = class133.field2257;
                field331 = class133.field2110;
                field320 = class133.field2259;
                field317 = 2;
                field323 = 0;
            }
        } else if (field317 == 2) {
            short var14 = 231;
            int var22 = var14 + 30;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field323 = 0;
            }
            var22 += 15;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field323 = 1;
            }
            var22 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field321 = field321.trim();
                if (field321.length() == 0) {
                    method4(class133.field2167, class133.field2168, class133.field2169);
                    return;
                }
                if (field307.length() == 0) {
                    method4(class133.field2170, class133.field2129, class133.field2172);
                    return;
                }
                method4(class133.field2260, class133.field2278, class133.field2262);
                client.method119(20);
                return;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field317 = 0;
                field321 = "";
                field307 = "";
            }
            while (true) {
                while (class74.method203()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field324.length(); var19++) {
                        if (Statics.field1957 == field324.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (field323 == 0) {
                        if (Statics.field1643 == 85 && field321.length() > 0) {
                            field321 = field321.substring(0, field321.length() - 1);
                        }
                        if (Statics.field1643 == 84 || Statics.field1643 == 80) {
                            field323 = 1;
                        }
                        if (var18 && field321.length() < 320) {
                            field321 = field321 + Statics.field1957;
                        }
                    } else if (field323 == 1) {
                        if (Statics.field1643 == 85 && field307.length() > 0) {
                            field307 = field307.substring(0, field307.length() - 1);
                        }
                        if (Statics.field1643 == 84 || Statics.field1643 == 80) {
                            field323 = 0;
                        }
                        if (client.field468 == 2 && Statics.field1643 == 84) {
                            field321 = field321.trim();
                            if (field321.length() == 0) {
                                method4(class133.field2167, class133.field2168, class133.field2169);
                                return;
                            }
                            if (field307.length() == 0) {
                                method4(class133.field2170, class133.field2129, class133.field2172);
                                return;
                            }
                            method4(class133.field2260, class133.field2278, class133.field2262);
                            client.method119(20);
                            return;
                        }
                        if (var18 && field307.length() < 20) {
                            field307 = field307 + Statics.field1957;
                        }
                    }
                }
                return;
            }
        } else if (field317 == 3) {
            short var20 = 382;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field317 = 0;
            }
        }
    }

    @ObfuscatedName("ac.x(Lfx;Lfx;I)V")
    public static void method1140(class181 arg0, class181 arg1) {
        if (field325) {
            if (Statics.field65 == null) {
                Statics.field65 = class83.method11(Statics.field2505, "sl_back", "");
            }
            if (Statics.field203 == null) {
                Statics.field203 = class83.method1559(Statics.field2505, "sl_flags", "");
            }
            if (Statics.field1953 == null) {
                Statics.field1953 = class83.method1559(Statics.field2505, "sl_arrows", "");
            }
            if (Statics.field2005 == null) {
                Statics.field2005 = class83.method1559(Statics.field2505, "sl_stars", "");
            }
            class88.method1699(0, 23, 765, 480, 0);
            class88.method1704(0, 0, 125, 23, 12425273, 9135624);
            class88.method1704(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3289(class133.field2275, 62, 15, 0, -1);
            if (Statics.field2005 != null) {
                Statics.field2005[1].method1686(140, 1);
                arg1.method3230(class133.field2137, 152, 10, 16777215, -1);
                Statics.field2005[0].method1686(140, 12);
                arg1.method3230(class133.field2277, 152, 21, 16777215, -1);
            }
            if (Statics.field1953 != null) {
                short var2 = 280;
                if (field302[0] == 0 && field299[0] == 0) {
                    Statics.field1953[2].method1686(var2, 4);
                } else {
                    Statics.field1953[0].method1686(var2, 4);
                }
                if (field302[0] == 0 && field299[0] == 1) {
                    Statics.field1953[3].method1686(var2 + 15, 4);
                } else {
                    Statics.field1953[1].method1686(var2 + 15, 4);
                }
                arg0.method3230(class133.field2263, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field302[0] == 1 && field299[0] == 0) {
                    Statics.field1953[2].method1686(var3, 4);
                } else {
                    Statics.field1953[0].method1686(var3, 4);
                }
                if (field302[0] == 1 && field299[0] == 1) {
                    Statics.field1953[3].method1686(var3 + 15, 4);
                } else {
                    Statics.field1953[1].method1686(var3 + 15, 4);
                }
                arg0.method3230(class133.field2073, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field302[0] == 2 && field299[0] == 0) {
                    Statics.field1953[2].method1686(var4, 4);
                } else {
                    Statics.field1953[0].method1686(var4, 4);
                }
                if (field302[0] == 2 && field299[0] == 1) {
                    Statics.field1953[3].method1686(var4 + 15, 4);
                } else {
                    Statics.field1953[1].method1686(var4 + 15, 4);
                }
                arg0.method3230(class133.field2070, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field302[0] == 3 && field299[0] == 0) {
                    Statics.field1953[2].method1686(var5, 4);
                } else {
                    Statics.field1953[0].method1686(var5, 4);
                }
                if (field302[0] == 3 && field299[0] == 1) {
                    Statics.field1953[3].method1686(var5 + 15, 4);
                } else {
                    Statics.field1953[1].method1686(var5 + 15, 4);
                }
                arg0.method3230(class133.field2281, var5 + 32, 17, 16777215, -1);
            }
            class88.method1699(708, 4, 50, 16, 0);
            arg1.method3289(class133.field2059, 733, 16, 16777215, -1);
            field332 = -1;
            if (Statics.field65 != null) {
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
                    class12 var20 = Statics.field327[var19];
                    boolean var21 = true;
                    String var22 = Integer.toString(var20.field197);
                    if (var20.field197 == -1) {
                        var22 = class133.field2273;
                        var21 = false;
                    } else if (var20.field197 > 1980) {
                        var22 = class133.field2283;
                        var21 = false;
                    }
                    if (class76.field1365 >= var17 && class76.field1369 >= var16 && class76.field1365 < var6 + var17 && class76.field1369 < var7 + var16 && var21) {
                        field332 = var19;
                        Statics.field65[var20.field196 ? 1 : 0].method1611(var17, var16, 128, 16777215);
                    } else {
                        Statics.field65[var20.field196 ? 1 : 0].method1595(var17, var16);
                    }
                    if (Statics.field203 != null) {
                        Statics.field203[(var20.field196 ? 8 : 0) + var20.field199].method1686(var17 + 29, var16);
                    }
                    arg0.method3289(Integer.toString(var20.field209), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3289(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
                Graphics var23 = Statics.field67.getGraphics();
                Statics.field1277.method1551(var23, 0, 0);
            } catch (Exception var92) {
                Statics.field67.repaint();
            }
            return;
        }
        if (client.field474 == 0 || client.field474 == 5) {
            byte var25 = 20;
            arg0.method3289(class133.field2256, 382, 245 - var25, 16777215, -1);
            int var26 = 253 - var25;
            class88.method1701(230, var26, 304, 34, 9179409);
            class88.method1701(231, var26 + 1, 302, 32, 0);
            class88.method1699(232, var26 + 2, field334 * 3, 30, 9179409);
            class88.method1699(field334 * 3 + 232, var26 + 2, 300 - field334 * 3, 30, 0);
            arg0.method3289(field305, 382, 276 - var25, 16777215, -1);
        }
        if (client.field474 == 20) {
            Statics.field300.method1686(382 - Statics.field300.field1452 / 2, 271 - Statics.field300.field1450 / 2);
            short var27 = 211;
            arg0.method3289(field319, 382, var27, 16776960, 0);
            int var94 = var27 + 15;
            arg0.method3289(field331, 382, var94, 16776960, 0);
            int var95 = var94 + 15;
            arg0.method3289(field320, 382, var95, 16776960, 0);
            int var96 = var95 + 15;
            int var97 = var96 + 10;
            arg0.method3230(class133.field2190, 272, var97, 16777215, 0);
            short var28 = 200;
            String var29;
            for (var29 = field321; arg0.method3225(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
            }
            arg0.method3230(class183.method3229(var29), 312, var97, 16777215, 0);
            var94 = var97 + 15;
            String var31 = class133.field2264;
            String var32 = field307;
            int var33 = var32.length();
            char[] var34 = new char[var33];
            for (int var35 = 0; var35 < var33; var35++) {
                var34[var35] = '*';
            }
            String var36 = new String(var34);
            arg0.method3230(var31 + var36, 274, var94, 16777215, 0);
            var94 += 15;
        }
        if (client.field474 == 10) {
            Statics.field300.method1686(202, 171);
            if (field317 == 0) {
                short var38 = 251;
                arg0.method3289(class133.field2197, 382, var38, 16776960, 0);
                int var98 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field318.method1686(var39 - 73, var40 - 20);
                arg0.method3233(class133.field2249, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field318.method1686(var41 - 73, var40 - 20);
                arg0.method3233(class133.field2072, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field317 == 2) {
                short var42 = 211;
                arg0.method3289(field319, 382, var42, 16776960, 0);
                int var99 = var42 + 15;
                arg0.method3289(field331, 382, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3289(field320, 382, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 10;
                arg0.method3230(class133.field2190, 272, var102, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field321; arg0.method3225(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3230(class183.method3229(var44) + (field323 == 0 & client.field516 % 40 < 20 ? class2.method1139(16776960) + class2.field38 : ""), 312, var102, 16777215, 0);
                var99 = var102 + 15;
                String var46 = class133.field2264;
                String var47 = field307;
                int var48 = var47.length();
                char[] var49 = new char[var48];
                for (int var50 = 0; var50 < var48; var50++) {
                    var49[var50] = '*';
                }
                String var51 = new String(var49);
                arg0.method3230(var46 + var51 + (field323 == 1 & client.field516 % 40 < 20 ? class2.method1139(16776960) + class2.field38 : ""), 274, var99, 16777215, 0);
                var99 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field318.method1686(var53 - 73, var54 - 20);
                arg0.method3289(class133.field2268, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field318.method1686(var55 - 73, var54 - 20);
                arg0.method3289(class133.field2059, var55, var54 + 5, 16777215, 0);
            } else if (field317 == 3) {
                arg0.method3289(class133.field2244, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3289(class133.field2271, 382, var56, 16777215, 0);
                int var103 = var56 + 15;
                arg0.method3289(class133.field2267, 382, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3289(class133.field2092, 382, var104, 16777215, 0);
                int var105 = var104 + 15;
                arg0.method3289(class133.field2192, 382, var105, 16777215, 0);
                int var106 = var105 + 15;
                short var57 = 382;
                short var58 = 321;
                Statics.field318.method1686(var57 - 73, var58 - 20);
                arg0.method3289(class133.field2059, var57, var58 + 5, 16777215, 0);
            }
        }
        if (field330 > 0) {
            int var59 = field330;
            short var60 = 256;
            field311 += var59 * 128;
            if (field311 > Statics.field927.length) {
                field311 -= Statics.field927.length;
                int var61 = (int) (Math.random() * 12.0D);
                method1522(Statics.field313[var61]);
            }
            int var62 = 0;
            int var63 = var59 * 128;
            int var64 = (var60 - var59) * 128;
            for (int var65 = 0; var65 < var64; var65++) {
                int var66 = Statics.field2035[var62 + var63] - Statics.field927[field311 + var62 & Statics.field927.length - 1] * var59 / 6;
                if (var66 < 0) {
                    var66 = 0;
                }
                Statics.field2035[var62++] = var66;
            }
            for (int var67 = var60 - var59; var67 < var60; var67++) {
                int var68 = var67 * 128;
                for (int var69 = 0; var69 < 128; var69++) {
                    int var70 = (int) (Math.random() * 100.0D);
                    if (var70 < 50 && var69 > 10 && var69 < 118) {
                        Statics.field2035[var68 + var69] = 255;
                    } else {
                        Statics.field2035[var68 + var69] = 0;
                    }
                }
            }
            if (field303 > 0) {
                field303 -= var59 * 4;
            }
            if (field309 > 0) {
                field309 -= var59 * 4;
            }
            if (field303 == 0 && field309 == 0) {
                int var71 = (int) (Math.random() * (double) (2000 / var59));
                if (var71 == 0) {
                    field303 = 1024;
                }
                if (var71 == 1) {
                    field309 = 1024;
                }
            }
            for (int var72 = 0; var72 < var60 - var59; var72++) {
                field322[var72] = field322[var59 + var72];
            }
            for (int var73 = var60 - var59; var73 < var60; var73++) {
                field322[var73] = (int) (Math.sin((double) field314 / 14.0D) * 16.0D + Math.sin((double) field314 / 15.0D) * 14.0D + Math.sin((double) field314 / 16.0D) * 12.0D);
                field314++;
            }
            field312 += var59 * -330845375;
            int var74 = ((client.field516 & 0x1) + var59) / 2;
            if (var74 > 0) {
                for (int var75 = 0; var75 < field312 * -131187868; var75++) {
                    int var76 = (int) (Math.random() * 124.0D) + 2;
                    int var77 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2035[(var77 << 7) + var76] = 192;
                }
                field312 = 0;
                int var78 = 0;
                label388: while (true) {
                    if (var78 >= var60) {
                        int var82 = 0;
                        while (true) {
                            if (var82 >= 128) {
                                break label388;
                            }
                            int var83 = 0;
                            for (int var84 = -var74; var84 < var60; var84++) {
                                int var85 = var84 * 128;
                                if (var74 + var84 < var60) {
                                    var83 += Statics.field238[var74 * 128 + var82 + var85];
                                }
                                if (var84 - (var74 + 1) >= 0) {
                                    var83 -= Statics.field238[var82 + var85 - (var74 + 1) * 128];
                                }
                                if (var84 >= 0) {
                                    Statics.field2035[var82 + var85] = var83 / (var74 * 2 + 1);
                                }
                            }
                            var82++;
                        }
                    }
                    int var79 = 0;
                    int var80 = var78 * 128;
                    for (int var81 = -var74; var81 < 128; var81++) {
                        if (var74 + var81 < 128) {
                            var79 += Statics.field2035[var80 + var81 + var74];
                        }
                        if (var81 - (var74 + 1) >= 0) {
                            var79 -= Statics.field2035[var80 + var81 - (var74 + 1)];
                        }
                        if (var81 >= 0) {
                            Statics.field238[var80 + var81] = var79 / (var74 * 2 + 1);
                        }
                    }
                    var78++;
                }
            }
            field330 = 0;
        }
        Statics.method1270();
        Statics.field1497[field304 ? 1 : 0].method1686(725, 463);
        if (client.field474 > 5 && client.field571 == 0) {
            if (Statics.field220 == null) {
                Statics.field220 = class83.method49(Statics.field2505, "sl_button", "");
            } else {
                byte var86 = 5;
                short var87 = 463;
                byte var88 = 100;
                byte var89 = 35;
                Statics.field220.method1686(var86, var87);
                arg0.method3289(class133.field2148 + " " + client.field467, var88 / 2 + var86, var89 / 2 + var87 - 2, 16777215, 0);
                if (Statics.field19 == null) {
                    arg1.method3289(class133.field2285, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                } else {
                    arg1.method3289(class133.field2224, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var90 = Statics.field67.getGraphics();
            Statics.field1277.method1551(var90, 0, 0);
        } catch (Exception var93) {
            Statics.field67.repaint();
        }
    }

    @ObfuscatedName("j.e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4(String arg0, String arg1, String arg2) {
        field319 = arg0;
        field331 = arg1;
        field320 = arg2;
    }

    @ObfuscatedName("cv.m(Lcq;I)V")
    public static final void method1522(class86 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field927.length; var2++) {
            Statics.field927[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field927[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field310[var8] = (Statics.field927[var8 - 1] + Statics.field927[var8 + 1] + Statics.field927[var8 - 128] + Statics.field927[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field927;
            Statics.field927 = Statics.field310;
            Statics.field310 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1450; var11++) {
            for (int var12 = 0; var12 < arg0.field1452; var12++) {
                if (arg0.field1453[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1455;
                    int var14 = var11 + 16 + arg0.field1457;
                    int var15 = (var14 << 7) + var13;
                    Statics.field927[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("co.s(IIII)I")
    public static final int method1923(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bb.w(Lbe;B)V")
    public static void method1305(class72 arg0) {
        if (class76.field1374 != 1) {
            return;
        }
        short var1 = 280;
        if (class76.field1372 >= var1 && class76.field1372 <= var1 + 14 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(0, 0);
            return;
        }
        if (class76.field1372 >= var1 + 15 && class76.field1372 <= var1 + 80 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(0, 1);
            return;
        }
        short var2 = 390;
        if (class76.field1372 >= var2 && class76.field1372 <= var2 + 14 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(1, 0);
            return;
        }
        if (class76.field1372 >= var2 + 15 && class76.field1372 <= var2 + 80 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(1, 1);
            return;
        }
        short var3 = 500;
        if (class76.field1372 >= var3 && class76.field1372 <= var3 + 14 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(2, 0);
            return;
        }
        if (class76.field1372 >= var3 + 15 && class76.field1372 <= var3 + 80 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(2, 1);
            return;
        }
        short var4 = 610;
        if (class76.field1372 >= var4 && class76.field1372 <= var4 + 14 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(3, 0);
            return;
        }
        if (class76.field1372 >= var4 + 15 && class76.field1372 <= var4 + 80 && class76.field1373 >= 4 && class76.field1373 <= 18) {
            method9(3, 1);
            return;
        }
        if (class76.field1372 >= 708 && class76.field1373 >= 4 && class76.field1372 <= 758 && class76.field1373 <= 20) {
            field325 = false;
            Statics.field301.method1595(0, 0);
            Statics.field2439.method1595(382, 0);
            Statics.field1901.method1686(382 - Statics.field1901.field1452 / 2, 18);
            return;
        }
        if (field332 == -1) {
            return;
        }
        class12 var5 = Statics.field327[field332];
        if (client.field470 == var5.field196) {
            Statics.field204 = var5.field201;
            client.field467 = var5.field209;
            Statics.field98 = client.field468 == 0 ? 43594 : var5.field209 + 40000;
            Statics.field914 = client.field468 == 0 ? 443 : var5.field209 + 50000;
            Statics.field2297 = Statics.field98;
            field325 = false;
            Statics.field301.method1595(0, 0);
            Statics.field2439.method1595(382, 0);
            Statics.field1901.method1686(382 - Statics.field1901.field1452 / 2, 18);
            return;
        }
        String var6 = "";
        if (client.field468 != 0) {
            var6 = ":" + (var5.field209 + 7000);
        }
        String var7 = "http://" + var5.field201 + var6 + "/j" + client.field541;
        try {
            arg0.getAppletContext().showDocument(new URL(var7), "_self");
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("w.r(B)V")
    public static void method109() {
        try {
            if (Statics.field19 == null) {
                Statics.field19 = new class23(Statics.field1010, new URL(Statics.field1413));
            } else {
                byte[] var0 = Statics.field19.method214();
                if (var0 != null) {
                    class125 var1 = new class125(var0);
                    field326 = var1.method2328();
                    Statics.field327 = new class12[field326];
                    int var2 = 0;
                    while (var2 < field326) {
                        class12 var3 = Statics.field327[var2] = new class12();
                        int var4 = var1.method2328();
                        var3.field209 = var4 & 0x7FFF;
                        var3.field196 = (var4 & 0x8000) != 0;
                        var3.field201 = var1.method2515();
                        var3.field199 = var1.method2326();
                        var3.field197 = var1.method2329();
                        var3.field200 = var2++;
                    }
                    method855(Statics.field327, 0, Statics.field327.length - 1, field302, field299);
                    field325 = true;
                    Statics.field19 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field19 = null;
        }
    }

    @ObfuscatedName("j.n(IIB)V")
    public static void method9(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field302[var5] != arg0) {
                var2[var4] = field302[var5];
                var3[var4] = field299[var5];
                var4++;
            }
        }
        field302 = var2;
        field299 = var3;
        method855(Statics.field327, 0, Statics.field327.length - 1, field302, field299);
    }

    @ObfuscatedName("aj.b([Ln;II[I[IB)V")
    public static void method855(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field200;
                        var12 = var8.field200;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field197;
                        var12 = var8.field197;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field196 ? 1 : 0;
                        var12 = var8.field196 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field209;
                        var12 = var8.field209;
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
                        var15 = arg0[var5].field200;
                        var16 = var8.field200;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field197;
                        var16 = var8.field197;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field196 ? 1 : 0;
                        var16 = var8.field196 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field209;
                        var16 = var8.field209;
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
        method855(arg0, arg1, var6, arg3, arg4);
        method855(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
