package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ao")
public class class29 {

    @ObfuscatedName("ao.q")
    public static int[] field658 = new int[256];

    @ObfuscatedName("ao.i")
    public static int field680 = 0;

    @ObfuscatedName("ao.w")
    public static int field685 = 0;

    @ObfuscatedName("ao.ad")
    public static int field659 = 0;

    @ObfuscatedName("ao.ah")
    public static int field662 = 0;

    @ObfuscatedName("ao.ao")
    public static int field663 = 0;

    @ObfuscatedName("ao.as")
    public static int field664 = 0;

    @ObfuscatedName("ao.at")
    public static int field665 = 10;

    @ObfuscatedName("ao.ai")
    public static String field679 = "";

    @ObfuscatedName("ao.aj")
    public static int field667 = 0;

    @ObfuscatedName("ao.aq")
    public static String field684 = "";

    @ObfuscatedName("ao.an")
    public static String field650 = "";

    @ObfuscatedName("ao.ac")
    public static String field670 = "";

    @ObfuscatedName("ao.ap")
    public static String field686 = "";

    @ObfuscatedName("ao.az")
    public static String field673 = "";

    @ObfuscatedName("ao.ax")
    public static class149 field682 = class149.field2421;

    @ObfuscatedName("ao.av")
    public static boolean field674 = true;

    @ObfuscatedName("ao.ar")
    public static int field675 = 0;

    @ObfuscatedName("ao.ak")
    public static String field676 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ao.aw")
    public static String field677 = "1234567890";

    @ObfuscatedName("ao.ay")
    public static boolean field678 = false;

    @ObfuscatedName("ao.bj")
    public static int field668 = 0;

    @ObfuscatedName("ao.bt")
    public static int[] field681 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ao.bc")
    public static int[] field661 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ao.bn")
    public static int field683 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.v(I)I")
    public static int method530() {
        return 8;
    }

    @ObfuscatedName("z.t(Ljava/awt/Component;Lem;Lem;ZII)V")
    public static void method515(Component arg0, class151 arg1, class151 arg2, boolean arg3, int arg4) {
        if (!Statics.field672) {
            field667 = arg4;
            class74.method1573();
            byte[] var5 = arg1.method2801("title.jpg", "");
            Statics.field653 = new class73(var5, arg0);
            Statics.field654 = Statics.field653.method1426();
            Statics.field669 = class71.method126(arg2, "logo", "");
            Statics.field651 = class71.method126(arg2, "titlebox", "");
            Statics.field652 = class71.method126(arg2, "titlebutton", "");
            Statics.field1908 = class71.method2462(arg2, "runes", "");
            Statics.field666 = class71.method2462(arg2, "title_mute", "");
            Statics.field521 = class71.method126(arg2, "options_radio_buttons,0", "");
            Statics.field62 = class71.method126(arg2, "options_radio_buttons,2", "");
            Statics.field1291 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1291[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1291[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1291[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1291[var9 + 192] = 16777215;
            }
            Statics.field1963 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1963[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1963[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1963[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1963[var13 + 192] = 16777215;
            }
            Statics.field2938 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2938[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2938[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2938[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2938[var17 + 192] = 16777215;
            }
            Statics.field574 = new int[256];
            Statics.field3034 = new int[32768];
            Statics.field155 = new int[32768];
            method1338((class75) null);
            Statics.field131 = new int[32768];
            Statics.field132 = new int[32768];
            if (arg3) {
                field686 = "";
                field673 = "";
            }
            Statics.field697 = 0;
            Statics.field1920 = "";
            field674 = true;
            field678 = false;
            if (Statics.field152.field143) {
                class166.method2473(2);
            } else {
                class166.method1379(2, Statics.field929, "scape main", "", 255, false);
            }
            class155.method2509(false);
            Statics.field672 = true;
            Statics.field653.method1487(0, 0);
            Statics.field654.method1487(382, 0);
            Statics.field669.method1586(382 - Statics.field669.field1321 / 2, 18);
        } else if (arg4 == 4) {
            field667 = 4;
        }
    }

    @ObfuscatedName("x.f(I)V")
    public static void method503() {
        if (!Statics.field672) {
            return;
        }
        Statics.field651 = null;
        Statics.field652 = null;
        Statics.field1908 = null;
        Statics.field653 = null;
        Statics.field654 = null;
        Statics.field669 = null;
        Statics.field666 = null;
        Statics.field521 = null;
        Statics.field62 = null;
        Statics.field3005 = null;
        Statics.field904 = null;
        Statics.field1895 = null;
        Statics.field191 = null;
        Statics.field599 = null;
        Statics.field1291 = null;
        Statics.field1963 = null;
        Statics.field2938 = null;
        Statics.field574 = null;
        Statics.field3034 = null;
        Statics.field155 = null;
        Statics.field131 = null;
        Statics.field132 = null;
        class166.method2473(2);
        class155.method2509(true);
        Statics.field672 = false;
    }

    @ObfuscatedName("ar.j(Leq;I)V")
    public static void method823(class135 arg0) {
        if (field678) {
            method3485(arg0);
            return;
        }
        if ((class131.field2025 == 1 || !Statics.field927 && class131.field2025 == 4) && class131.field2026 >= 715 && class131.field2027 >= 453) {
            Statics.field152.field143 = !Statics.field152.field143;
            class9.method1794();
            if (Statics.field152.field143) {
                Statics.field2736.method3157();
                class166.field2737 = 1;
                Statics.field1666 = null;
            } else {
                class152 var1 = Statics.field929;
                int var2 = var1.method2799("scape main");
                int var3 = var1.method2841(var2, "");
                class166.method25(var1, var2, var3, 255, false);
            }
        }
        if (client.field255 == 5) {
            return;
        }
        field663++;
        if (client.field255 != 10 && client.field255 != 11) {
            return;
        }
        if (client.field396 == 0) {
            if (class131.field2025 == 1 || !Statics.field927 && class131.field2025 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class131.field2026 >= var4 && class131.field2026 <= var4 + var6 && class131.field2027 >= var5 && class131.field2027 <= var5 + var7) {
                    method582();
                    return;
                }
            }
            if (Statics.field2042 != null) {
                method582();
            }
        }
        int var8 = class131.field2025;
        int var9 = class131.field2026;
        int var10 = class131.field2027;
        if (!Statics.field927 && var8 == 4) {
            var8 = 1;
        }
        if (field667 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class129.method3427(client.method763("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field247 & 0x4) != 0) {
                    if ((client.field247 & 0x400) == 0) {
                        field684 = class147.field2165;
                        field650 = class147.field2377;
                        field670 = class147.field2378;
                    } else {
                        field684 = class147.field2382;
                        field650 = class147.field2317;
                        field670 = class147.field2194;
                    }
                    field667 = 1;
                    field675 = 0;
                } else if ((client.field247 & 0x400) == 0) {
                    field684 = class147.field2372;
                    field650 = class147.field2373;
                    field670 = class147.field2219;
                    field667 = 2;
                    field675 = 0;
                } else {
                    field684 = class147.field2237;
                    field650 = class147.field2380;
                    field670 = class147.field2381;
                    field667 = 1;
                    field675 = 0;
                }
            }
        } else if (field667 == 1) {
            while (Statics.method2526()) {
                if (Statics.field1933 == 84) {
                    field684 = class147.field2372;
                    field650 = class147.field2373;
                    field670 = class147.field2219;
                    field667 = 2;
                    field675 = 0;
                } else if (Statics.field1933 == 13) {
                    field667 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field684 = class147.field2372;
                field650 = class147.field2373;
                field670 = class147.field2219;
                field667 = 2;
                field675 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field667 = 0;
            }
        } else if (field667 == 2) {
            short var17 = 231;
            int var28 = var17 + 30;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field675 = 0;
            }
            var28 += 15;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field675 = 1;
            }
            var28 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field686 = field686.trim();
                if (field686.length() == 0) {
                    method217(class147.field2278, class147.field2279, class147.field2283);
                    return;
                }
                if (field673.length() == 0) {
                    method217(class147.field2281, class147.field2282, class147.field2270);
                    return;
                }
                method217(class147.field2387, class147.field2388, class147.field2389);
                field682 = Statics.field152.field136.containsKey(class213.method2762(field686)) ? class149.field2422 : class149.field2421;
                client.method500(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field667 = 0;
                field686 = "";
                field673 = "";
                Statics.field697 = 0;
                Statics.field1920 = "";
                field674 = true;
            }
            while (true) {
                while (Statics.method2526()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field676.length(); var22++) {
                        if (Statics.field1799 == field676.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1933 == 13) {
                        field667 = 0;
                        field686 = "";
                        field673 = "";
                        Statics.field697 = 0;
                        Statics.field1920 = "";
                        field674 = true;
                    } else if (field675 == 0) {
                        if (Statics.field1933 == 85 && field686.length() > 0) {
                            field686 = field686.substring(0, field686.length() - 1);
                        }
                        if (Statics.field1933 == 84 || Statics.field1933 == 80) {
                            field675 = 1;
                        }
                        if (var21 && field686.length() < 320) {
                            field686 = field686 + Statics.field1799;
                        }
                    } else if (field675 == 1) {
                        if (Statics.field1933 == 85 && field673.length() > 0) {
                            field673 = field673.substring(0, field673.length() - 1);
                        }
                        if (Statics.field1933 == 84 || Statics.field1933 == 80) {
                            field675 = 0;
                        }
                        if (Statics.field1933 == 84) {
                            field686 = field686.trim();
                            if (field686.length() == 0) {
                                method217(class147.field2278, class147.field2279, class147.field2283);
                                return;
                            }
                            if (field673.length() == 0) {
                                method217(class147.field2281, class147.field2282, class147.field2270);
                                return;
                            }
                            method217(class147.field2387, class147.field2388, class147.field2389);
                            field682 = Statics.field152.field136.containsKey(class213.method2762(field686)) ? class149.field2422 : class149.field2421;
                            client.method500(20);
                            return;
                        }
                        if (var21 && field673.length() < 20) {
                            field673 = field673 + Statics.field1799;
                        }
                    }
                }
                return;
            }
        } else if (field667 == 4) {
            short var23 = 302;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                Statics.field1920.trim();
                if (Statics.field1920.length() != 6) {
                    method217(class147.field2172, class147.field2195, class147.field2196);
                    return;
                }
                Statics.field697 = Integer.parseInt(Statics.field1920);
                Statics.field1920 = "";
                field682 = field674 ? class149.field2423 : class149.field2425;
                method217(class147.field2387, class147.field2388, class147.field2389);
                client.method500(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field674 = !field674;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                class129.method3427(client.method763("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var25 = 462;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field667 = 0;
                field686 = "";
                field673 = "";
                Statics.field697 = 0;
                Statics.field1920 = "";
            }
            while (Statics.method2526()) {
                boolean var26 = false;
                for (int var27 = 0; var27 < field677.length(); var27++) {
                    if (Statics.field1799 == field677.charAt(var27)) {
                        var26 = true;
                        break;
                    }
                }
                if (Statics.field1933 == 13) {
                    field667 = 0;
                    field686 = "";
                    field673 = "";
                    Statics.field697 = 0;
                    Statics.field1920 = "";
                } else {
                    if (Statics.field1933 == 85 && Statics.field1920.length() > 0) {
                        Statics.field1920 = Statics.field1920.substring(0, Statics.field1920.length() - 1);
                    }
                    if (Statics.field1933 == 84) {
                        Statics.field1920.trim();
                        if (Statics.field1920.length() != 6) {
                            method217(class147.field2172, class147.field2195, class147.field2196);
                            return;
                        }
                        Statics.field697 = Integer.parseInt(Statics.field1920);
                        Statics.field1920 = "";
                        field682 = field674 ? class149.field2423 : class149.field2425;
                        method217(class147.field2387, class147.field2388, class147.field2389);
                        client.method500(20);
                        return;
                    }
                    if (var26 && Statics.field1920.length() < 6) {
                        Statics.field1920 = Statics.field1920 + Statics.field1799;
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.l(Lgh;Lgh;I)V")
    public static void method845(class207 arg0, class207 arg1) {
        if (field678) {
            method507(arg0, arg1);
            return;
        }
        if (client.field255 == 0 || client.field255 == 5) {
            byte var2 = 20;
            arg0.method3501(class147.field2371, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class74.method1522(230, var3, 304, 34, 9179409);
            class74.method1522(231, var3 + 1, 302, 32, 0);
            class74.method1520(232, var3 + 2, field665 * 3, 30, 9179409);
            class74.method1520(field665 * 3 + 232, var3 + 2, 300 - field665 * 3, 30, 0);
            arg0.method3501(field679, 382, 276 - var2, 16777215, -1);
        }
        if (client.field255 == 20) {
            Statics.field651.method1586(382 - Statics.field651.field1321 / 2, 271 - Statics.field651.field1319 / 2);
            short var4 = 211;
            arg0.method3501(field684, 382, var4, 16776960, 0);
            int var113 = var4 + 15;
            arg0.method3501(field650, 382, var113, 16776960, 0);
            int var114 = var113 + 15;
            arg0.method3501(field670, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            int var116 = var115 + 10;
            if (field667 != 4) {
                arg0.method3499(class147.field2390, 272, var116, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field686; arg0.method3494(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3499(class206.method3513(var6), 312, var116, 16777215, 0);
                var113 = var116 + 15;
                String var8 = class147.field2391;
                String var9 = field673;
                int var10 = var9.length();
                char[] var11 = new char[var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    var11[var12] = '*';
                }
                String var13 = new String(var11);
                arg0.method3499(var8 + var13, 274, var113, 16777215, 0);
                var113 += 15;
            }
        }
        if (client.field255 == 10 || client.field255 == 11) {
            Statics.field651.method1586(202, 171);
            if (field667 == 0) {
                short var15 = 251;
                arg0.method3501(class147.field2231, 382, var15, 16776960, 0);
                int var117 = var15 + 30;
                short var16 = 302;
                short var17 = 291;
                Statics.field652.method1586(var16 - 73, var17 - 20);
                arg0.method3502(class147.field2250, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                Statics.field652.method1586(var18 - 73, var17 - 20);
                arg0.method3502(class147.field2296, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field667 == 1) {
                arg0.method3501(class147.field2284, 382, 211, 16776960, 0);
                short var19 = 236;
                arg0.method3501(field684, 382, var19, 16777215, 0);
                int var118 = var19 + 15;
                arg0.method3501(field650, 382, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method3501(field670, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                short var20 = 302;
                short var21 = 321;
                Statics.field652.method1586(var20 - 73, var21 - 20);
                arg0.method3501(class147.field2167, var20, var21 + 5, 16777215, 0);
                short var22 = 462;
                Statics.field652.method1586(var22 - 73, var21 - 20);
                arg0.method3501(class147.field2397, var22, var21 + 5, 16777215, 0);
            } else if (field667 == 2) {
                short var23 = 211;
                arg0.method3501(field684, 382, var23, 16776960, 0);
                int var121 = var23 + 15;
                arg0.method3501(field650, 382, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg0.method3501(field670, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                int var124 = var123 + 10;
                arg0.method3499(class147.field2390, 272, var124, 16777215, 0);
                short var24 = 200;
                String var25;
                for (var25 = field686; arg0.method3494(var25) > var24; var25 = var25.substring(1)) {
                }
                arg0.method3499(class206.method3513(var25) + (field675 == 0 & client.field257 % 40 < 20 ? class2.method855(16776960) + class2.field20 : ""), 312, var124, 16777215, 0);
                var121 = var124 + 15;
                String var27 = class147.field2391;
                String var28 = field673;
                int var29 = var28.length();
                char[] var30 = new char[var29];
                for (int var31 = 0; var31 < var29; var31++) {
                    var30[var31] = '*';
                }
                String var32 = new String(var30);
                arg0.method3499(var27 + var32 + (field675 == 1 & client.field257 % 40 < 20 ? class2.method855(16776960) + class2.field20 : ""), 274, var121, 16777215, 0);
                var121 += 15;
                short var34 = 302;
                short var35 = 321;
                Statics.field652.method1586(var34 - 73, var35 - 20);
                arg0.method3501(class147.field2396, var34, var35 + 5, 16777215, 0);
                short var36 = 462;
                Statics.field652.method1586(var36 - 73, var35 - 20);
                arg0.method3501(class147.field2397, var36, var35 + 5, 16777215, 0);
            } else if (field667 == 4) {
                arg0.method3501(class147.field2171, 382, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3501(field684, 382, var37, 16777215, 0);
                int var125 = var37 + 15;
                arg0.method3501(field650, 382, var125, 16777215, 0);
                int var126 = var125 + 15;
                arg0.method3501(field670, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                String var39 = class147.field2362;
                String var40 = Statics.field1920;
                int var41 = var40.length();
                char[] var42 = new char[var41];
                for (int var43 = 0; var43 < var41; var43++) {
                    var42[var43] = '*';
                }
                String var44 = new String(var42);
                arg0.method3499(var39 + var44 + (client.field257 % 40 < 20 ? class2.method855(16776960) + class2.field20 : ""), 274, var127, 16777215, 0);
                var125 = var127 - 8;
                arg0.method3499(class147.field2168, 373, var125, 16776960, 0);
                var125 += 15;
                arg0.method3499(class147.field2169, 373, var125, 16776960, 0);
                int var46 = 373 + arg0.method3494(class147.field2169) + 15;
                int var47 = var125 - arg0.field2990;
                class75 var48;
                if (field674) {
                    var48 = Statics.field62;
                } else {
                    var48 = Statics.field521;
                }
                var48.method1586(var46, var47);
                var125 += 15;
                short var49 = 302;
                short var50 = 321;
                Statics.field652.method1586(var49 - 73, var50 - 20);
                arg0.method3501(class147.field2167, var49, var50 + 5, 16777215, 0);
                short var51 = 462;
                Statics.field652.method1586(var51 - 73, var50 - 20);
                arg0.method3501(class147.field2397, var51, var50 + 5, 16777215, 0);
                arg1.method3501(class147.field2256, 382, var50 + 36, 255, 0);
            }
        }
        if (field663 > 0) {
            int var52 = field663;
            short var53 = 256;
            field659 += var52 * 128;
            if (field659 > Statics.field3034.length) {
                field659 -= Statics.field3034.length;
                int var54 = (int) (Math.random() * 12.0D);
                method1338(Statics.field1908[var54]);
            }
            int var55 = 0;
            int var56 = var52 * 128;
            int var57 = (var53 - var52) * 128;
            for (int var58 = 0; var58 < var57; var58++) {
                int var59 = Statics.field131[var55 + var56] - Statics.field3034[field659 + var55 & Statics.field3034.length - 1] * var52 / 6;
                if (var59 < 0) {
                    var59 = 0;
                }
                Statics.field131[var55++] = var59;
            }
            for (int var60 = var53 - var52; var60 < var53; var60++) {
                int var61 = var60 * 128;
                for (int var62 = 0; var62 < 128; var62++) {
                    int var63 = (int) (Math.random() * 100.0D);
                    if (var63 < 50 && var62 > 10 && var62 < 118) {
                        Statics.field131[var61 + var62] = 255;
                    } else {
                        Statics.field131[var61 + var62] = 0;
                    }
                }
            }
            if (field680 > 0) {
                field680 -= var52 * 4;
            }
            if (field685 > 0) {
                field685 -= var52 * 4;
            }
            if (field680 == 0 && field685 == 0) {
                int var64 = (int) (Math.random() * (double) (2000 / var52));
                if (var64 == 0) {
                    field680 = 1024;
                }
                if (var64 == 1) {
                    field685 = 1024;
                }
            }
            for (int var65 = 0; var65 < var53 - var52; var65++) {
                field658[var65] = field658[var52 + var65];
            }
            for (int var66 = var53 - var52; var66 < var53; var66++) {
                field658[var66] = (int) (Math.sin((double) field664 / 14.0D) * 16.0D + Math.sin((double) field664 / 15.0D) * 14.0D + Math.sin((double) field664 / 16.0D) * 12.0D);
                field664++;
            }
            field662 += var52 * -1226241461;
            int var67 = ((client.field257 & 0x1) + var52) / 2;
            if (var67 > 0) {
                for (int var68 = 0; var68 < field662 * 2092532396; var68++) {
                    int var69 = (int) (Math.random() * 124.0D) + 2;
                    int var70 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field131[(var70 << 7) + var69] = 192;
                }
                field662 = 0;
                int var71 = 0;
                label308: while (true) {
                    if (var71 >= var53) {
                        int var75 = 0;
                        while (true) {
                            if (var75 >= 128) {
                                break label308;
                            }
                            int var76 = 0;
                            for (int var77 = -var67; var77 < var53; var77++) {
                                int var78 = var77 * 128;
                                if (var67 + var77 < var53) {
                                    var76 += Statics.field132[var67 * 128 + var75 + var78];
                                }
                                if (var77 - (var67 + 1) >= 0) {
                                    var76 -= Statics.field132[var75 + var78 - (var67 + 1) * 128];
                                }
                                if (var77 >= 0) {
                                    Statics.field131[var75 + var78] = var76 / (var67 * 2 + 1);
                                }
                            }
                            var75++;
                        }
                    }
                    int var72 = 0;
                    int var73 = var71 * 128;
                    for (int var74 = -var67; var74 < 128; var74++) {
                        if (var67 + var74 < 128) {
                            var72 += Statics.field131[var73 + var74 + var67];
                        }
                        if (var74 - (var67 + 1) >= 0) {
                            var72 -= Statics.field131[var73 + var74 - (var67 + 1)];
                        }
                        if (var74 >= 0) {
                            Statics.field132[var73 + var74] = var72 / (var67 * 2 + 1);
                        }
                    }
                    var71++;
                }
            }
            field663 = 0;
        }
        short var79 = 256;
        if (field680 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field680 > 768) {
                    Statics.field574[var80] = method596(Statics.field1291[var80], Statics.field1963[var80], 1024 - field680);
                } else if (field680 > 256) {
                    Statics.field574[var80] = Statics.field1963[var80];
                } else {
                    Statics.field574[var80] = method596(Statics.field1963[var80], Statics.field1291[var80], 256 - field680);
                }
            }
        } else if (field685 > 0) {
            for (int var81 = 0; var81 < 256; var81++) {
                if (field685 > 768) {
                    Statics.field574[var81] = method596(Statics.field1291[var81], Statics.field2938[var81], 1024 - field685);
                } else if (field685 > 256) {
                    Statics.field574[var81] = Statics.field2938[var81];
                } else {
                    Statics.field574[var81] = method596(Statics.field2938[var81], Statics.field1291[var81], 256 - field685);
                }
            }
        } else {
            for (int var82 = 0; var82 < 256; var82++) {
                Statics.field574[var82] = Statics.field1291[var82];
            }
        }
        class74.method1514(0, 9, 128, var79 + 7);
        Statics.field653.method1487(0, 0);
        class74.method1513();
        int var83 = 0;
        int var84 = 6885;
        for (int var85 = 1; var85 < var79 - 1; var85++) {
            int var86 = (var79 - var85) * field658[var85] / var79;
            int var87 = var86 + 22;
            if (var87 < 0) {
                var87 = 0;
            }
            var83 += var87;
            for (int var88 = var87; var88 < 128; var88++) {
                int var89 = Statics.field131[var83++];
                if (var89 == 0) {
                    var84++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field574[var89];
                    int var93 = Statics.field1913.field1295[var84];
                    Statics.field1913.field1295[var84++] = ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) + ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) >> 8;
                }
            }
            var84 += var87 + 765 - 128;
        }
        class74.method1514(637, 9, 765, var79 + 7);
        Statics.field654.method1487(382, 0);
        class74.method1513();
        int var94 = 0;
        int var95 = 7546;
        for (int var96 = 1; var96 < var79 - 1; var96++) {
            int var97 = (var79 - var96) * field658[var96] / var79;
            int var98 = 103 - var97;
            int var99 = var95 + var97;
            for (int var100 = 0; var100 < var98; var100++) {
                int var101 = Statics.field131[var94++];
                if (var101 == 0) {
                    var99++;
                } else {
                    int var103 = 256 - var101;
                    int var104 = Statics.field574[var101];
                    int var105 = Statics.field1913.field1295[var99];
                    Statics.field1913.field1295[var99++] = ((var104 & 0xFF00FF) * var101 + (var105 & 0xFF00FF) * var103 & 0xFF00FF00) + ((var104 & 0xFF00) * var101 + (var105 & 0xFF00) * var103 & 0xFF0000) >> 8;
                }
            }
            var94 += 128 - var98;
            var95 = 765 - var98 - var97 + var99;
        }
        Statics.field666[Statics.field152.field143 ? 1 : 0].method1586(725, 463);
        if (client.field255 > 5 && client.field396 == 0) {
            if (Statics.field599 == null) {
                Statics.field599 = class71.method126(Statics.field504, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field599.method1586(var106, var107);
                arg0.method3501(class147.field2326 + " " + client.field400, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field2042 == null) {
                    arg1.method3501(class147.field2408, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3501(class147.field2407, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field231.getGraphics();
            Statics.field1913.method1346(var110, 0, 0);
        } catch (Exception var112) {
            Statics.field231.repaint();
        }
    }

    @ObfuscatedName("client.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method217(String arg0, String arg1, String arg2) {
        field684 = arg0;
        field650 = arg1;
        field670 = arg2;
    }

    @ObfuscatedName("bv.k(Lbh;I)V")
    public static final void method1338(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3034.length; var2++) {
            Statics.field3034[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3034[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field155[var8] = (Statics.field3034[var8 - 1] + Statics.field3034[var8 + 1] + Statics.field3034[var8 - 128] + Statics.field3034[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3034;
            Statics.field3034 = Statics.field155;
            Statics.field155 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1319; var11++) {
            for (int var12 = 0; var12 < arg0.field1321; var12++) {
                if (arg0.field1318[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1323;
                    int var14 = var11 + 16 + arg0.field1322;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3034[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ai.p(IIII)I")
    public static final int method596(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("x.y(Lgh;Lgh;S)V")
    public static void method507(class207 arg0, class207 arg1) {
        if (Statics.field3005 == null) {
            Statics.field3005 = class71.method1894(Statics.field504, "sl_back", "");
        }
        if (Statics.field904 == null) {
            Statics.field904 = class71.method2462(Statics.field504, "sl_flags", "");
        }
        if (Statics.field1895 == null) {
            Statics.field1895 = class71.method2462(Statics.field504, "sl_arrows", "");
        }
        if (Statics.field191 == null) {
            Statics.field191 = class71.method2462(Statics.field504, "sl_stars", "");
        }
        class74.method1520(0, 23, 765, 480, 0);
        class74.method1521(0, 0, 125, 23, 12425273, 9135624);
        class74.method1521(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3501(class147.field2173, 62, 15, 0, -1);
        if (Statics.field191 != null) {
            Statics.field191[1].method1586(140, 1);
            arg1.method3499(class147.field2399, 152, 10, 16777215, -1);
            Statics.field191[0].method1586(140, 12);
            arg1.method3499(class147.field2355, 152, 21, 16777215, -1);
        }
        if (Statics.field1895 != null) {
            short var2 = 280;
            if (field681[0] == 0 && field661[0] == 0) {
                Statics.field1895[2].method1586(var2, 4);
            } else {
                Statics.field1895[0].method1586(var2, 4);
            }
            if (field681[0] == 0 && field661[0] == 1) {
                Statics.field1895[3].method1586(var2 + 15, 4);
            } else {
                Statics.field1895[1].method1586(var2 + 15, 4);
            }
            arg0.method3499(class147.field2401, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field681[0] == 1 && field661[0] == 0) {
                Statics.field1895[2].method1586(var3, 4);
            } else {
                Statics.field1895[0].method1586(var3, 4);
            }
            if (field681[0] == 1 && field661[0] == 1) {
                Statics.field1895[3].method1586(var3 + 15, 4);
            } else {
                Statics.field1895[1].method1586(var3 + 15, 4);
            }
            arg0.method3499(class147.field2402, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field681[0] == 2 && field661[0] == 0) {
                Statics.field1895[2].method1586(var4, 4);
            } else {
                Statics.field1895[0].method1586(var4, 4);
            }
            if (field681[0] == 2 && field661[0] == 1) {
                Statics.field1895[3].method1586(var4 + 15, 4);
            } else {
                Statics.field1895[1].method1586(var4 + 15, 4);
            }
            arg0.method3499(class147.field2403, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field681[0] == 3 && field661[0] == 0) {
                Statics.field1895[2].method1586(var5, 4);
            } else {
                Statics.field1895[0].method1586(var5, 4);
            }
            if (field681[0] == 3 && field661[0] == 1) {
                Statics.field1895[3].method1586(var5 + 15, 4);
            } else {
                Statics.field1895[1].method1586(var5 + 15, 4);
            }
            arg0.method3499(class147.field2404, var5 + 32, 17, 16777215, -1);
        }
        class74.method1520(708, 4, 50, 16, 0);
        arg1.method3501(class147.field2397, 733, 16, 16777215, -1);
        field683 = -1;
        if (Statics.field3005 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field668) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field668) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field668) {
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
            for (int var20 = 0; var20 < field668; var20++) {
                class23 var21 = Statics.field2142[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field582);
                if (var21.field582 == -1) {
                    var23 = class147.field2405;
                    var22 = false;
                } else if (var21.field582 > 1980) {
                    var23 = class147.field2406;
                    var22 = false;
                }
                byte var24;
                if (var21.method506()) {
                    if (var21.method501()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method501()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class131.field2019 >= var17 && class131.field2020 >= var16 && class131.field2019 < var6 + var17 && class131.field2020 < var7 + var16 && var22) {
                    field683 = var20;
                    Statics.field3005[var24].method1441(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field3005[var24].method1487(var17, var16);
                }
                if (Statics.field904 != null) {
                    Statics.field904[(var21.method501() ? 8 : 0) + var21.field581].method1586(var17 + 29, var16);
                }
                arg0.method3501(Integer.toString(var21.field588), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3501(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3494(Statics.field2142[field683].field585) + 6;
                int var26 = arg1.field2990 + 8;
                class74.method1520(class131.field2019 - var25 / 2, class131.field2020 + 20 + 5, var25, var26, 16777120);
                class74.method1522(class131.field2019 - var25 / 2, class131.field2020 + 20 + 5, var25, var26, 0);
                arg1.method3501(Statics.field2142[field683].field585, class131.field2019, class131.field2020 + 20 + 5 + arg1.field2990 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field231.getGraphics();
            Statics.field1913.method1346(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field231.repaint();
        }
    }

    @ObfuscatedName("gq.m(Leq;I)V")
    public static void method3485(class135 arg0) {
        if (class131.field2025 != 1 && Statics.field927 || class131.field2025 != 4) {
            return;
        }
        short var1 = 280;
        if (class131.field2026 >= var1 && class131.field2026 <= var1 + 14 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(0, 0);
            return;
        }
        if (class131.field2026 >= var1 + 15 && class131.field2026 <= var1 + 80 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(0, 1);
            return;
        }
        short var2 = 390;
        if (class131.field2026 >= var2 && class131.field2026 <= var2 + 14 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(1, 0);
            return;
        }
        if (class131.field2026 >= var2 + 15 && class131.field2026 <= var2 + 80 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(1, 1);
            return;
        }
        short var3 = 500;
        if (class131.field2026 >= var3 && class131.field2026 <= var3 + 14 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(2, 0);
            return;
        }
        if (class131.field2026 >= var3 + 15 && class131.field2026 <= var3 + 80 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(2, 1);
            return;
        }
        short var4 = 610;
        if (class131.field2026 >= var4 && class131.field2026 <= var4 + 14 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(3, 0);
            return;
        }
        if (class131.field2026 >= var4 + 15 && class131.field2026 <= var4 + 80 && class131.field2027 >= 4 && class131.field2027 <= 18) {
            method79(3, 1);
            return;
        }
        if (class131.field2026 >= 708 && class131.field2027 >= 4 && class131.field2026 <= 758 && class131.field2027 <= 20) {
            field678 = false;
            Statics.field653.method1487(0, 0);
            Statics.field654.method1487(382, 0);
            Statics.field669.method1586(382 - Statics.field669.field1321 / 2, 18);
            return;
        }
        if (field683 == -1) {
            return;
        }
        class23 var5 = Statics.field2142[field683];
        method2755(var5);
        field678 = false;
        Statics.field653.method1487(0, 0);
        Statics.field654.method1487(382, 0);
        Statics.field669.method1586(382 - Statics.field669.field1321 / 2, 18);
        return;
    }

    @ObfuscatedName("eu.o(Lx;I)V")
    public static void method2755(class23 arg0) {
        if (arg0.method501() != client.field251) {
            client.field251 = arg0.method501();
            class46.method22(arg0.method501());
        }
        Statics.field2717 = arg0.field583;
        client.field400 = arg0.field588;
        client.field247 = arg0.field584;
        Statics.field240 = client.field249 == 0 ? 43594 : arg0.field588 + 40000;
        Statics.field1932 = client.field249 == 0 ? 443 : arg0.field588 + 50000;
        Statics.field285 = Statics.field240;
    }

    @ObfuscatedName("as.c(B)V")
    public static void method582() {
        try {
            if (Statics.field2042 == null) {
                Statics.field2042 = new class17(Statics.field1950, new URL(Statics.field980));
            } else {
                byte[] var0 = Statics.field2042.method158();
                if (var0 != null) {
                    class110 var1 = new class110(var0);
                    field668 = var1.method2194();
                    Statics.field2142 = new class23[field668];
                    int var2 = 0;
                    while (var2 < field668) {
                        class23 var3 = Statics.field2142[var2] = new class23();
                        var3.field588 = var1.method2194();
                        var3.field584 = var1.method2297();
                        var3.field583 = var1.method2159();
                        var3.field585 = var1.method2159();
                        var3.field581 = var1.method2257();
                        var3.field582 = var1.method2308();
                        var3.field586 = var2++;
                    }
                    method1799(Statics.field2142, 0, Statics.field2142.length - 1, field681, field661);
                    field678 = true;
                    Statics.field2042 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2042 = null;
        }
    }

    @ObfuscatedName("p.r(III)V")
    public static void method79(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field681[var5] != arg0) {
                var2[var4] = field681[var5];
                var3[var4] = field661[var5];
                var4++;
            }
        }
        field681 = var2;
        field661 = var3;
        method1799(Statics.field2142, 0, Statics.field2142.length - 1, field681, field661);
    }

    @ObfuscatedName("cd.s([Lx;II[I[IB)V")
    public static void method1799(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field586;
                        var12 = var8.field586;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field582;
                        var12 = var8.field582;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method501() ? 1 : 0;
                        var12 = var8.method501() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field588;
                        var12 = var8.field588;
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
                        var15 = arg0[var5].field586;
                        var16 = var8.field586;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field582;
                        var16 = var8.field582;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method501() ? 1 : 0;
                        var16 = var8.method501() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field588;
                        var16 = var8.field588;
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
        method1799(arg0, arg1, var6, arg3, arg4);
        method1799(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
