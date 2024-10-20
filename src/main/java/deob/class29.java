package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ar")
public class class29 {

    @ObfuscatedName("ar.b")
    public static int[] field656 = new int[256];

    @ObfuscatedName("ar.m")
    public static int field691 = 0;

    @ObfuscatedName("ar.q")
    public static int field667 = 0;

    @ObfuscatedName("ar.ah")
    public static int field677 = 0;

    @ObfuscatedName("ar.aj")
    public static int field653 = 0;

    @ObfuscatedName("ar.ar")
    public static int field671 = 0;

    @ObfuscatedName("ar.al")
    public static int field672 = 0;

    @ObfuscatedName("ar.aw")
    public static int field673 = 10;

    @ObfuscatedName("ar.ao")
    public static String field674 = "";

    @ObfuscatedName("ar.ax")
    public static int field675 = 0;

    @ObfuscatedName("ar.au")
    public static String field670 = "";

    @ObfuscatedName("ar.av")
    public static String field694 = "";

    @ObfuscatedName("ar.ae")
    public static String field678 = "";

    @ObfuscatedName("ar.ak")
    public static String field664 = "";

    @ObfuscatedName("ar.ay")
    public static String field680 = "";

    @ObfuscatedName("ar.at")
    public static class147 field681 = class147.field2429;

    @ObfuscatedName("ar.ad")
    public static boolean field682 = true;

    @ObfuscatedName("ar.ag")
    public static int field683 = 0;

    @ObfuscatedName("ar.am")
    public static String field689 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.ai")
    public static String field685 = "1234567890";

    @ObfuscatedName("ar.af")
    public static boolean field666 = false;

    @ObfuscatedName("ar.br")
    public static int field688 = 0;

    @ObfuscatedName("ar.bx")
    public static int[] field661 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ar.bh")
    public static int[] field690 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ar.bj")
    public static int field669 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.f(Lev;Lev;I)I")
    public static int method85(class149 arg0, class149 arg1) {
        int var2 = 0;
        if (arg0.method2781("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2781("logo", "")) {
            var2++;
        }
        if (arg1.method2781("titlebox", "")) {
            var2++;
        }
        if (arg1.method2781("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2781("runes", "")) {
            var2++;
        }
        if (arg1.method2781("title_mute", "")) {
            var2++;
        }
        if (arg1.method2770("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2770("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2781("sl_back", "");
        arg1.method2781("sl_flags", "");
        arg1.method2781("sl_arrows", "");
        arg1.method2781("sl_stars", "");
        arg1.method2781("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ec.k(Ljava/awt/Component;Lev;Lev;ZII)V")
    public static void method2716(Component arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (!Statics.field662) {
            field675 = arg4;
            class74.method1573();
            byte[] var5 = arg1.method2780("title.jpg", "");
            Statics.field3010 = new class73(var5, arg0);
            Statics.field1924 = Statics.field3010.method1459();
            Statics.field657 = class71.method143(arg2, "logo", "");
            Statics.field659 = class71.method143(arg2, "titlebox", "");
            Statics.field655 = class71.method143(arg2, "titlebutton", "");
            Statics.field654 = class71.method563(arg2, "runes", "");
            Statics.field658 = class71.method563(arg2, "title_mute", "");
            Statics.field1282 = class71.method143(arg2, "options_radio_buttons,0", "");
            Statics.field660 = class71.method143(arg2, "options_radio_buttons,2", "");
            Statics.field58 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field58[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field58[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field58[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field58[var9 + 192] = 16777215;
            }
            Statics.field584 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field584[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field584[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field584[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field584[var13 + 192] = 16777215;
            }
            Statics.field1268 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1268[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1268[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1268[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1268[var17 + 192] = 16777215;
            }
            Statics.field665 = new int[256];
            Statics.field617 = new int[32768];
            Statics.field608 = new int[32768];
            method490((class75) null);
            Statics.field2137 = new int[32768];
            Statics.field668 = new int[32768];
            if (arg3) {
                field664 = "";
                field680 = "";
            }
            Statics.field1951 = 0;
            Statics.field194 = "";
            field682 = true;
            field666 = false;
            if (Statics.field184.field134) {
                class164.method173(2);
            } else {
                class164.method889(2, Statics.field1012, "scape main", "", 255, false);
            }
            class153.method550(false);
            Statics.field662 = true;
            Statics.field3010.method1468(0, 0);
            Statics.field1924.method1468(382, 0);
            Statics.field657.method1621(382 - Statics.field657.field1332 / 2, 18);
        } else if (arg4 == 4) {
            field675 = 4;
        }
    }

    @ObfuscatedName("r.y(Lep;I)V")
    public static void method36(class133 arg0) {
        if (field666) {
            method2727(arg0);
            return;
        }
        if ((class129.field2022 == 1 || !Statics.field1264 && class129.field2022 == 4) && class129.field2030 >= 715 && class129.field2011 >= 453) {
            Statics.field184.field134 = !Statics.field184.field134;
            class9.method2715();
            if (Statics.field184.field134) {
                class164.method533();
            } else {
                class150 var1 = Statics.field1012;
                int var2 = var1.method2778("scape main");
                int var3 = var1.method2809(var2, "");
                class164.method118(var1, var2, var3, 255, false);
            }
        }
        if (client.field259 == 5) {
            return;
        }
        field671++;
        if (client.field259 != 10 && client.field259 != 11) {
            return;
        }
        if (client.field333 == 0) {
            if (class129.field2022 == 1 || !Statics.field1264 && class129.field2022 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class129.field2030 >= var4 && class129.field2030 <= var4 + var6 && class129.field2011 >= var5 && class129.field2011 <= var5 + var7) {
                    method2748();
                    return;
                }
            }
            if (Statics.field687 != null) {
                method2748();
            }
        }
        int var8 = class129.field2022;
        int var9 = class129.field2030;
        int var10 = class129.field2011;
        if (!Statics.field1264 && var8 == 4) {
            var8 = 1;
        }
        if (field675 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                String var13 = client.method184("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class127.method1644(var13, true, "openjs", false);
            }
            short var14 = 462;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field254 & 0x4) != 0) {
                    if ((client.field254 & 0x400) == 0) {
                        field670 = class145.field2385;
                        field694 = class145.field2401;
                        field678 = class145.field2387;
                    } else {
                        field670 = class145.field2190;
                        field694 = class145.field2252;
                        field678 = class145.field2326;
                    }
                    field675 = 1;
                    field683 = 0;
                } else if ((client.field254 & 0x400) == 0) {
                    field670 = class145.field2381;
                    field694 = class145.field2303;
                    field678 = class145.field2383;
                    field675 = 2;
                    field683 = 0;
                } else {
                    field670 = class145.field2388;
                    field694 = class145.field2389;
                    field678 = class145.field2344;
                    field675 = 1;
                    field683 = 0;
                }
            }
        } else if (field675 == 1) {
            while (class126.method516()) {
                if (Statics.field521 == 84) {
                    field670 = class145.field2381;
                    field694 = class145.field2303;
                    field678 = class145.field2383;
                    field675 = 2;
                    field683 = 0;
                } else if (Statics.field521 == 13) {
                    field675 = 0;
                }
            }
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field670 = class145.field2381;
                field694 = class145.field2303;
                field678 = class145.field2383;
                field675 = 2;
                field683 = 0;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field675 = 0;
            }
        } else if (field675 == 2) {
            short var18 = 231;
            int var30 = var18 + 30;
            if (var8 == 1 && var10 >= var30 - 15 && var10 < var30) {
                field683 = 0;
            }
            var30 += 15;
            if (var8 == 1 && var10 >= var30 - 15 && var10 < var30) {
                field683 = 1;
            }
            var30 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field664 = field664.trim();
                if (field664.length() == 0) {
                    method486(class145.field2287, class145.field2288, class145.field2298);
                    return;
                }
                if (field680.length() == 0) {
                    method486(class145.field2290, class145.field2291, class145.field2292);
                    return;
                }
                method486(class145.field2219, class145.field2397, class145.field2398);
                field681 = Statics.field184.field136.containsKey(class211.method3453(field664)) ? class147.field2433 : class147.field2429;
                client.method559(20);
                return;
            }
            short var21 = 462;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field675 = 0;
                field664 = "";
                field680 = "";
                Statics.field1951 = 0;
                Statics.field194 = "";
                field682 = true;
            }
            while (true) {
                while (class126.method516()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field689.length(); var23++) {
                        if (Statics.field1470 == field689.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field521 == 13) {
                        field675 = 0;
                        field664 = "";
                        field680 = "";
                        Statics.field1951 = 0;
                        Statics.field194 = "";
                        field682 = true;
                    } else if (field683 == 0) {
                        if (Statics.field521 == 85 && field664.length() > 0) {
                            field664 = field664.substring(0, field664.length() - 1);
                        }
                        if (Statics.field521 == 84 || Statics.field521 == 80) {
                            field683 = 1;
                        }
                        if (var22 && field664.length() < 320) {
                            field664 = field664 + Statics.field1470;
                        }
                    } else if (field683 == 1) {
                        if (Statics.field521 == 85 && field680.length() > 0) {
                            field680 = field680.substring(0, field680.length() - 1);
                        }
                        if (Statics.field521 == 84 || Statics.field521 == 80) {
                            field683 = 0;
                        }
                        if (Statics.field521 == 84) {
                            field664 = field664.trim();
                            if (field664.length() == 0) {
                                method486(class145.field2287, class145.field2288, class145.field2298);
                                return;
                            }
                            if (field680.length() == 0) {
                                method486(class145.field2290, class145.field2291, class145.field2292);
                                return;
                            }
                            method486(class145.field2219, class145.field2397, class145.field2398);
                            field681 = Statics.field184.field136.containsKey(class211.method3453(field664)) ? class147.field2433 : class147.field2429;
                            client.method559(20);
                            return;
                        }
                        if (var22 && field680.length() < 20) {
                            field680 = field680 + Statics.field1470;
                        }
                    }
                }
                return;
            }
        } else if (field675 == 4) {
            short var24 = 302;
            short var25 = 321;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                Statics.field194.trim();
                if (Statics.field194.length() != 6) {
                    method486(class145.field2377, class145.field2414, class145.field2313);
                    return;
                }
                Statics.field1951 = Integer.parseInt(Statics.field194);
                Statics.field194 = "";
                field681 = field682 ? class147.field2428 : class147.field2427;
                method486(class145.field2219, class145.field2397, class145.field2398);
                client.method559(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field682 = !field682;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                String var26 = client.method184("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class127.method1644(var26, true, "openjs", false);
            }
            short var27 = 462;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field675 = 0;
                field664 = "";
                field680 = "";
                Statics.field1951 = 0;
                Statics.field194 = "";
            }
            while (class126.method516()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field685.length(); var29++) {
                    if (Statics.field1470 == field685.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field521 == 13) {
                    field675 = 0;
                    field664 = "";
                    field680 = "";
                    Statics.field1951 = 0;
                    Statics.field194 = "";
                } else {
                    if (Statics.field521 == 85 && Statics.field194.length() > 0) {
                        Statics.field194 = Statics.field194.substring(0, Statics.field194.length() - 1);
                    }
                    if (Statics.field521 == 84) {
                        Statics.field194.trim();
                        if (Statics.field194.length() != 6) {
                            method486(class145.field2377, class145.field2414, class145.field2313);
                            return;
                        }
                        Statics.field1951 = Integer.parseInt(Statics.field194);
                        Statics.field194 = "";
                        field681 = field682 ? class147.field2428 : class147.field2427;
                        method486(class145.field2219, class145.field2397, class145.field2398);
                        client.method559(20);
                        return;
                    }
                    if (var28 && Statics.field194.length() < 6) {
                        Statics.field194 = Statics.field194 + Statics.field1470;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.e(Lgc;Lgc;I)V")
    public static void method2472(class205 arg0, class205 arg1) {
        if (field666) {
            method531(arg0, arg1);
            return;
        }
        if (client.field259 == 0 || client.field259 == 5) {
            byte var2 = 20;
            arg0.method3466(class145.field2265, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class74.method1607(230, var3, 304, 34, 9179409);
            class74.method1607(231, var3 + 1, 302, 32, 0);
            class74.method1555(232, var3 + 2, field673 * 3, 30, 9179409);
            class74.method1555(field673 * 3 + 232, var3 + 2, 300 - field673 * 3, 30, 0);
            arg0.method3466(field674, 382, 276 - var2, 16777215, -1);
        }
        if (client.field259 == 20) {
            Statics.field659.method1621(382 - Statics.field659.field1332 / 2, 271 - Statics.field659.field1334 / 2);
            short var4 = 211;
            arg0.method3466(field670, 382, var4, 16776960, 0);
            int var89 = var4 + 15;
            arg0.method3466(field694, 382, var89, 16776960, 0);
            int var90 = var89 + 15;
            arg0.method3466(field678, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            int var92 = var91 + 10;
            if (field675 != 4) {
                arg0.method3544(class145.field2399, 272, var92, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field664; arg0.method3459(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3544(class204.method3463(var6), 312, var92, 16777215, 0);
                var89 = var92 + 15;
                arg0.method3544(class145.field2400 + class211.method2736(field680), 274, var89, 16777215, 0);
                var89 += 15;
            }
        }
        if (client.field259 == 10 || client.field259 == 11) {
            Statics.field659.method1621(202, 171);
            if (field675 == 0) {
                short var7 = 251;
                arg0.method3466(class145.field2355, 382, var7, 16776960, 0);
                int var93 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field655.method1621(var8 - 73, var9 - 20);
                arg0.method3487(class145.field2321, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field655.method1621(var10 - 73, var9 - 20);
                arg0.method3487(class145.field2404, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field675 == 1) {
                arg0.method3466(class145.field2212, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3466(field670, 382, var11, 16777215, 0);
                int var94 = var11 + 15;
                arg0.method3466(field694, 382, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3466(field678, 382, var95, 16777215, 0);
                int var96 = var95 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field655.method1621(var12 - 73, var13 - 20);
                arg0.method3466(class145.field2176, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field655.method1621(var14 - 73, var13 - 20);
                arg0.method3466(class145.field2406, var14, var13 + 5, 16777215, 0);
            } else if (field675 == 2) {
                short var15 = 211;
                arg0.method3466(field670, 382, var15, 16776960, 0);
                int var97 = var15 + 15;
                arg0.method3466(field694, 382, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3466(field678, 382, var98, 16776960, 0);
                int var99 = var98 + 15;
                int var100 = var99 + 10;
                arg0.method3544(class145.field2399, 272, var100, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field664; arg0.method3459(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3544(class204.method3463(var17) + (field683 == 0 & client.field372 % 40 < 20 ? class2.method679(16776960) + class2.field16 : ""), 312, var100, 16777215, 0);
                var97 = var100 + 15;
                arg0.method3544(class145.field2400 + class211.method2736(field680) + (field683 == 1 & client.field372 % 40 < 20 ? class2.method679(16776960) + class2.field16 : ""), 274, var97, 16777215, 0);
                var97 += 15;
                short var18 = 302;
                short var19 = 321;
                Statics.field655.method1621(var18 - 73, var19 - 20);
                arg0.method3466(class145.field2174, var18, var19 + 5, 16777215, 0);
                short var20 = 462;
                Statics.field655.method1621(var20 - 73, var19 - 20);
                arg0.method3466(class145.field2406, var20, var19 + 5, 16777215, 0);
            } else if (field675 == 4) {
                arg0.method3466(class145.field2394, 382, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3466(field670, 382, var21, 16777215, 0);
                int var101 = var21 + 15;
                arg0.method3466(field694, 382, var101, 16777215, 0);
                int var102 = var101 + 15;
                arg0.method3466(field678, 382, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method3544(class145.field2340 + class211.method2736(Statics.field194) + (client.field372 % 40 < 20 ? class2.method679(16776960) + class2.field16 : ""), 274, var103, 16777215, 0);
                int var104 = var103 - 8;
                arg0.method3544(class145.field2177, 373, var104, 16776960, 0);
                int var105 = var104 + 15;
                arg0.method3544(class145.field2178, 373, var105, 16776960, 0);
                int var22 = 373 + arg0.method3459(class145.field2178) + 15;
                int var23 = var105 - arg0.field2963;
                class75 var24;
                if (field682) {
                    var24 = Statics.field660;
                } else {
                    var24 = Statics.field1282;
                }
                var24.method1621(var22, var23);
                var101 = var105 + 15;
                short var25 = 302;
                short var26 = 321;
                Statics.field655.method1621(var25 - 73, var26 - 20);
                arg0.method3466(class145.field2176, var25, var26 + 5, 16777215, 0);
                short var27 = 462;
                Statics.field655.method1621(var27 - 73, var26 - 20);
                arg0.method3466(class145.field2406, var27, var26 + 5, 16777215, 0);
                arg1.method3466(class145.field2395, 382, var26 + 36, 255, 0);
            }
        }
        if (field671 > 0) {
            int var28 = field671;
            short var29 = 256;
            field677 += var28 * 128;
            if (field677 > Statics.field617.length) {
                field677 -= Statics.field617.length;
                int var30 = (int) (Math.random() * 12.0D);
                method490(Statics.field654[var30]);
            }
            int var31 = 0;
            int var32 = var28 * 128;
            int var33 = (var29 - var28) * 128;
            for (int var34 = 0; var34 < var33; var34++) {
                int var35 = Statics.field2137[var31 + var32] - Statics.field617[field677 + var31 & Statics.field617.length - 1] * var28 / 6;
                if (var35 < 0) {
                    var35 = 0;
                }
                Statics.field2137[var31++] = var35;
            }
            for (int var36 = var29 - var28; var36 < var29; var36++) {
                int var37 = var36 * 128;
                for (int var38 = 0; var38 < 128; var38++) {
                    int var39 = (int) (Math.random() * 100.0D);
                    if (var39 < 50 && var38 > 10 && var38 < 118) {
                        Statics.field2137[var37 + var38] = 255;
                    } else {
                        Statics.field2137[var37 + var38] = 0;
                    }
                }
            }
            if (field691 > 0) {
                field691 -= var28 * 4;
            }
            if (field667 > 0) {
                field667 -= var28 * 4;
            }
            if (field691 == 0 && field667 == 0) {
                int var40 = (int) (Math.random() * (double) (2000 / var28));
                if (var40 == 0) {
                    field691 = 1024;
                }
                if (var40 == 1) {
                    field667 = 1024;
                }
            }
            for (int var41 = 0; var41 < var29 - var28; var41++) {
                field656[var41] = field656[var28 + var41];
            }
            for (int var42 = var29 - var28; var42 < var29; var42++) {
                field656[var42] = (int) (Math.sin((double) field672 / 14.0D) * 16.0D + Math.sin((double) field672 / 15.0D) * 14.0D + Math.sin((double) field672 / 16.0D) * 12.0D);
                field672++;
            }
            field653 += var28 * 1264731513;
            int var43 = ((client.field372 & 0x1) + var28) / 2;
            if (var43 > 0) {
                for (int var44 = 0; var44 < field653 * 716185220; var44++) {
                    int var45 = (int) (Math.random() * 124.0D) + 2;
                    int var46 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2137[(var46 << 7) + var45] = 192;
                }
                field653 = 0;
                int var47 = 0;
                label300: while (true) {
                    if (var47 >= var29) {
                        int var51 = 0;
                        while (true) {
                            if (var51 >= 128) {
                                break label300;
                            }
                            int var52 = 0;
                            for (int var53 = -var43; var53 < var29; var53++) {
                                int var54 = var53 * 128;
                                if (var43 + var53 < var29) {
                                    var52 += Statics.field668[var43 * 128 + var51 + var54];
                                }
                                if (var53 - (var43 + 1) >= 0) {
                                    var52 -= Statics.field668[var51 + var54 - (var43 + 1) * 128];
                                }
                                if (var53 >= 0) {
                                    Statics.field2137[var51 + var54] = var52 / (var43 * 2 + 1);
                                }
                            }
                            var51++;
                        }
                    }
                    int var48 = 0;
                    int var49 = var47 * 128;
                    for (int var50 = -var43; var50 < 128; var50++) {
                        if (var43 + var50 < 128) {
                            var48 += Statics.field2137[var49 + var50 + var43];
                        }
                        if (var50 - (var43 + 1) >= 0) {
                            var48 -= Statics.field2137[var49 + var50 - (var43 + 1)];
                        }
                        if (var50 >= 0) {
                            Statics.field668[var49 + var50] = var48 / (var43 * 2 + 1);
                        }
                    }
                    var47++;
                }
            }
            field671 = 0;
        }
        short var55 = 256;
        if (field691 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (field691 > 768) {
                    Statics.field665[var56] = method183(Statics.field58[var56], Statics.field584[var56], 1024 - field691);
                } else if (field691 > 256) {
                    Statics.field665[var56] = Statics.field584[var56];
                } else {
                    Statics.field665[var56] = method183(Statics.field584[var56], Statics.field58[var56], 256 - field691);
                }
            }
        } else if (field667 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (field667 > 768) {
                    Statics.field665[var57] = method183(Statics.field58[var57], Statics.field1268[var57], 1024 - field667);
                } else if (field667 > 256) {
                    Statics.field665[var57] = Statics.field1268[var57];
                } else {
                    Statics.field665[var57] = method183(Statics.field1268[var57], Statics.field58[var57], 256 - field667);
                }
            }
        } else {
            for (int var58 = 0; var58 < 256; var58++) {
                Statics.field665[var58] = Statics.field58[var58];
            }
        }
        class74.method1549(0, 9, 128, var55 + 7);
        Statics.field3010.method1468(0, 0);
        class74.method1605();
        int var59 = 0;
        int var60 = 6885;
        for (int var61 = 1; var61 < var55 - 1; var61++) {
            int var62 = (var55 - var61) * field656[var61] / var55;
            int var63 = var62 + 22;
            if (var63 < 0) {
                var63 = 0;
            }
            var59 += var63;
            for (int var64 = var63; var64 < 128; var64++) {
                int var65 = Statics.field2137[var59++];
                if (var65 == 0) {
                    var60++;
                } else {
                    int var67 = 256 - var65;
                    int var68 = Statics.field665[var65];
                    int var69 = Statics.field1824.field1307[var60];
                    Statics.field1824.field1307[var60++] = ((var68 & 0xFF00) * var65 + (var69 & 0xFF00) * var67 & 0xFF0000) + ((var68 & 0xFF00FF) * var65 + (var69 & 0xFF00FF) * var67 & 0xFF00FF00) >> 8;
                }
            }
            var60 += var63 + 765 - 128;
        }
        class74.method1549(637, 9, 765, var55 + 7);
        Statics.field1924.method1468(382, 0);
        class74.method1605();
        int var70 = 0;
        int var71 = 7546;
        for (int var72 = 1; var72 < var55 - 1; var72++) {
            int var73 = (var55 - var72) * field656[var72] / var55;
            int var74 = 103 - var73;
            int var75 = var71 + var73;
            for (int var76 = 0; var76 < var74; var76++) {
                int var77 = Statics.field2137[var70++];
                if (var77 == 0) {
                    var75++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field665[var77];
                    int var81 = Statics.field1824.field1307[var75];
                    Statics.field1824.field1307[var75++] = ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) + ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) >> 8;
                }
            }
            var70 += 128 - var74;
            var71 = 765 - var74 - var73 + var75;
        }
        Statics.field658[Statics.field184.field134 ? 1 : 0].method1621(725, 463);
        if (client.field259 > 5 && client.field333 == 0) {
            if (Statics.field541 == null) {
                Statics.field541 = class71.method143(Statics.field282, "sl_button", "");
            } else {
                byte var82 = 5;
                short var83 = 463;
                byte var84 = 100;
                byte var85 = 35;
                Statics.field541.method1621(var82, var83);
                arg0.method3466(class145.field2335 + " " + client.field253, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
                if (Statics.field687 == null) {
                    arg1.method3466(class145.field2276, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                } else {
                    arg1.method3466(class145.field2416, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var86 = Statics.field543.getGraphics();
            Statics.field1824.method1404(var86, 0, 0);
        } catch (Exception var88) {
            Statics.field543.repaint();
        }
    }

    @ObfuscatedName("d.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method486(String arg0, String arg1, String arg2) {
        field670 = arg0;
        field694 = arg1;
        field678 = arg2;
    }

    @ObfuscatedName("l.a(Lbg;I)V")
    public static final void method490(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field617.length; var2++) {
            Statics.field617[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field617[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field608[var8] = (Statics.field617[var8 - 1] + Statics.field617[var8 + 1] + Statics.field617[var8 - 128] + Statics.field617[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field617;
            Statics.field617 = Statics.field608;
            Statics.field608 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1334; var11++) {
            for (int var12 = 0; var12 < arg0.field1332; var12++) {
                if (arg0.field1333[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1336;
                    int var14 = var11 + 16 + arg0.field1337;
                    int var15 = (var14 << 7) + var13;
                    Statics.field617[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("u.n(IIIB)I")
    public static final int method183(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("c.x(Lgc;Lgc;I)V")
    public static void method531(class205 arg0, class205 arg1) {
        if (Statics.field650 == null) {
            Statics.field650 = class71.method2745(Statics.field282, "sl_back", "");
        }
        if (Statics.field1891 == null) {
            Statics.field1891 = class71.method563(Statics.field282, "sl_flags", "");
        }
        if (Statics.field2714 == null) {
            Statics.field2714 = class71.method563(Statics.field282, "sl_arrows", "");
        }
        if (Statics.field988 == null) {
            Statics.field988 = class71.method563(Statics.field282, "sl_stars", "");
        }
        class74.method1555(0, 23, 765, 480, 0);
        class74.method1556(0, 0, 125, 23, 12425273, 9135624);
        class74.method1556(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3466(class145.field2229, 62, 15, 0, -1);
        if (Statics.field988 != null) {
            Statics.field988[1].method1621(140, 1);
            arg1.method3544(class145.field2408, 152, 10, 16777215, -1);
            Statics.field988[0].method1621(140, 12);
            arg1.method3544(class145.field2409, 152, 21, 16777215, -1);
        }
        if (Statics.field2714 != null) {
            short var2 = 280;
            if (field661[0] == 0 && field690[0] == 0) {
                Statics.field2714[2].method1621(var2, 4);
            } else {
                Statics.field2714[0].method1621(var2, 4);
            }
            if (field661[0] == 0 && field690[0] == 1) {
                Statics.field2714[3].method1621(var2 + 15, 4);
            } else {
                Statics.field2714[1].method1621(var2 + 15, 4);
            }
            arg0.method3544(class145.field2410, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field661[0] == 1 && field690[0] == 0) {
                Statics.field2714[2].method1621(var3, 4);
            } else {
                Statics.field2714[0].method1621(var3, 4);
            }
            if (field661[0] == 1 && field690[0] == 1) {
                Statics.field2714[3].method1621(var3 + 15, 4);
            } else {
                Statics.field2714[1].method1621(var3 + 15, 4);
            }
            arg0.method3544(class145.field2411, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field661[0] == 2 && field690[0] == 0) {
                Statics.field2714[2].method1621(var4, 4);
            } else {
                Statics.field2714[0].method1621(var4, 4);
            }
            if (field661[0] == 2 && field690[0] == 1) {
                Statics.field2714[3].method1621(var4 + 15, 4);
            } else {
                Statics.field2714[1].method1621(var4 + 15, 4);
            }
            arg0.method3544(class145.field2412, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field661[0] == 3 && field690[0] == 0) {
                Statics.field2714[2].method1621(var5, 4);
            } else {
                Statics.field2714[0].method1621(var5, 4);
            }
            if (field661[0] == 3 && field690[0] == 1) {
                Statics.field2714[3].method1621(var5 + 15, 4);
            } else {
                Statics.field2714[1].method1621(var5 + 15, 4);
            }
            arg0.method3544(class145.field2413, var5 + 32, 17, 16777215, -1);
        }
        class74.method1555(708, 4, 50, 16, 0);
        arg1.method3466(class145.field2406, 733, 16, 16777215, -1);
        field669 = -1;
        if (Statics.field650 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field688) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field688) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field688) {
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
            for (int var20 = 0; var20 < field688; var20++) {
                class23 var21 = Statics.field1060[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field583);
                if (var21.field583 == -1) {
                    var23 = class145.field2334;
                    var22 = false;
                } else if (var21.field583 > 1980) {
                    var23 = class145.field2415;
                    var22 = false;
                }
                byte var24;
                if (var21.method522()) {
                    if (var21.method519()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method519()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class129.field2017 >= var17 && class129.field2018 >= var16 && class129.field2017 < var6 + var17 && class129.field2018 < var7 + var16 && var22) {
                    field669 = var20;
                    Statics.field650[var24].method1474(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field650[var24].method1468(var17, var16);
                }
                if (Statics.field1891 != null) {
                    Statics.field1891[(var21.method519() ? 8 : 0) + var21.field588].method1621(var17 + 29, var16);
                }
                arg0.method3466(Integer.toString(var21.field582), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3466(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3459(Statics.field1060[field669].field589) + 6;
                int var26 = arg1.field2963 + 8;
                class74.method1555(class129.field2017 - var25 / 2, class129.field2018 + 20 + 5, var25, var26, 16777120);
                class74.method1607(class129.field2017 - var25 / 2, class129.field2018 + 20 + 5, var25, var26, 0);
                arg1.method3466(Statics.field1060[field669].field589, class129.field2017, class129.field2018 + 20 + 5 + arg1.field2963 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field543.getGraphics();
            Statics.field1824.method1404(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field543.repaint();
        }
    }

    @ObfuscatedName("ed.g(Lep;I)V")
    public static void method2727(class133 arg0) {
        if (class129.field2022 != 1 && Statics.field1264 || class129.field2022 != 4) {
            return;
        }
        short var1 = 280;
        if (class129.field2030 >= var1 && class129.field2030 <= var1 + 14 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(0, 0);
            return;
        }
        if (class129.field2030 >= var1 + 15 && class129.field2030 <= var1 + 80 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(0, 1);
            return;
        }
        short var2 = 390;
        if (class129.field2030 >= var2 && class129.field2030 <= var2 + 14 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(1, 0);
            return;
        }
        if (class129.field2030 >= var2 + 15 && class129.field2030 <= var2 + 80 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(1, 1);
            return;
        }
        short var3 = 500;
        if (class129.field2030 >= var3 && class129.field2030 <= var3 + 14 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(2, 0);
            return;
        }
        if (class129.field2030 >= var3 + 15 && class129.field2030 <= var3 + 80 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(2, 1);
            return;
        }
        short var4 = 610;
        if (class129.field2030 >= var4 && class129.field2030 <= var4 + 14 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(3, 0);
            return;
        }
        if (class129.field2030 >= var4 + 15 && class129.field2030 <= var4 + 80 && class129.field2011 >= 4 && class129.field2011 <= 18) {
            Statics.method484(3, 1);
            return;
        }
        if (class129.field2030 >= 708 && class129.field2011 >= 4 && class129.field2030 <= 758 && class129.field2011 <= 20) {
            field666 = false;
            Statics.field3010.method1468(0, 0);
            Statics.field1924.method1468(382, 0);
            Statics.field657.method1621(382 - Statics.field657.field1332 / 2, 18);
            return;
        }
        if (field669 == -1) {
            return;
        }
        class23 var5 = Statics.field1060[field669];
        method1815(var5);
        field666 = false;
        Statics.field3010.method1468(0, 0);
        Statics.field1924.method1468(382, 0);
        Statics.field657.method1621(382 - Statics.field657.field1332 / 2, 18);
        return;
    }

    @ObfuscatedName("ct.o(Lh;B)V")
    public static void method1815(class23 arg0) {
        if (arg0.method519() != client.field250) {
            client.field250 = arg0.method519();
            class46.method154(arg0.method519());
        }
        Statics.field2468 = arg0.field586;
        client.field253 = arg0.field582;
        client.field254 = arg0.field585;
        Statics.field601 = client.field480 == 0 ? 43594 : arg0.field582 + 40000;
        Statics.field201 = client.field480 == 0 ? 443 : arg0.field582 + 50000;
        Statics.field571 = Statics.field601;
    }

    @ObfuscatedName("el.p(I)V")
    public static void method2748() {
        try {
            if (Statics.field687 == null) {
                Statics.field687 = new class17(Statics.field29, new URL(Statics.field907));
            } else {
                byte[] var0 = Statics.field687.method176();
                if (var0 != null) {
                    class108 var1 = new class108(var0);
                    field688 = var1.method2160();
                    Statics.field1060 = new class23[field688];
                    int var2 = 0;
                    while (var2 < field688) {
                        class23 var3 = Statics.field1060[var2] = new class23();
                        var3.field582 = var1.method2160();
                        var3.field585 = var1.method2256();
                        var3.field586 = var1.method2275();
                        var3.field589 = var1.method2275();
                        var3.field588 = var1.method2158();
                        var3.field583 = var1.method2161();
                        var3.field587 = var2++;
                    }
                    method2005(Statics.field1060, 0, Statics.field1060.length - 1, field661, field690);
                    field666 = true;
                    Statics.field687 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field687 = null;
        }
    }

    @ObfuscatedName("ce.w([Lh;II[I[II)V")
    public static void method2005(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class23 var8 = arg0[var7];
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
                        var11 = arg0[var6].field587;
                        var12 = var8.field587;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field583;
                        var12 = var8.field583;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method519() ? 1 : 0;
                        var12 = var8.method519() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field582;
                        var12 = var8.field582;
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
                        var15 = arg0[var5].field587;
                        var16 = var8.field587;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field583;
                        var16 = var8.field583;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method519() ? 1 : 0;
                        var16 = var8.method519() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field582;
                        var16 = var8.field582;
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
                class23 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2005(arg0, arg1, var6, arg3, arg4);
        method2005(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
