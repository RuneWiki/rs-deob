package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ai")
public class class28 {

    @ObfuscatedName("ai.h")
    public static int[] field646 = new int[256];

    @ObfuscatedName("ai.x")
    public static int field647 = 0;

    @ObfuscatedName("ai.e")
    public static int field648 = 0;

    @ObfuscatedName("ai.ab")
    public static int field651 = 0;

    @ObfuscatedName("ai.ai")
    public static int field645 = 0;

    @ObfuscatedName("ai.aj")
    public static int field653 = 0;

    @ObfuscatedName("ai.as")
    public static int field654 = 0;

    @ObfuscatedName("ai.ax")
    public static int field655 = 10;

    @ObfuscatedName("ai.ac")
    public static String field657 = "";

    @ObfuscatedName("ai.az")
    public static int field672 = 0;

    @ObfuscatedName("ai.au")
    public static String field671 = "";

    @ObfuscatedName("ai.av")
    public static String field673 = "";

    @ObfuscatedName("ai.am")
    public static String field656 = "";

    @ObfuscatedName("ai.ao")
    public static String field661 = "";

    @ObfuscatedName("ai.aq")
    public static String field662 = "";

    @ObfuscatedName("ai.ay")
    public static class145 field663 = class145.field2423;

    @ObfuscatedName("ai.ae")
    public static boolean field664 = true;

    @ObfuscatedName("ai.ad")
    public static int field659 = 0;

    @ObfuscatedName("ai.aw")
    public static String field658 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ai.ah")
    public static String field650 = "1234567890";

    @ObfuscatedName("ai.aa")
    public static boolean field668 = false;

    @ObfuscatedName("ai.bc")
    public static int field669 = 0;

    @ObfuscatedName("ai.bm")
    public static int[] field670 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ai.ba")
    public static int[] field639 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ai.be")
    public static int field643 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.g(Ljava/awt/Component;Let;Let;ZII)V")
    public static void method120(Component arg0, class147 arg1, class147 arg2, boolean arg3, int arg4) {
        if (!Statics.field666) {
            field672 = arg4;
            class73.method1480();
            byte[] var5 = arg1.method2676("title.jpg", "");
            Statics.field642 = new class72(var5, arg0);
            Statics.field644 = Statics.field642.method1384();
            Statics.field242 = class70.method478(arg2, "logo", "");
            Statics.field640 = class70.method478(arg2, "titlebox", "");
            Statics.field641 = class70.method478(arg2, "titlebutton", "");
            Statics.field652 = class70.method2784(arg2, "runes", "");
            Statics.field608 = class70.method2784(arg2, "title_mute", "");
            Statics.field2015 = class70.method478(arg2, "options_radio_buttons,0", "");
            Statics.field175 = class70.method478(arg2, "options_radio_buttons,2", "");
            Statics.field567 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field567[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field567[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field567[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field567[var9 + 192] = 16777215;
            }
            Statics.field1505 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1505[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1505[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1505[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1505[var13 + 192] = 16777215;
            }
            Statics.field237 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field237[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field237[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field237[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field237[var17 + 192] = 16777215;
            }
            Statics.field92 = new int[256];
            Statics.field602 = new int[32768];
            Statics.field649 = new int[32768];
            method2303((class74) null);
            Statics.field2534 = new int[32768];
            Statics.field665 = new int[32768];
            if (arg3) {
                field661 = "";
                field662 = "";
            }
            Statics.field2427 = 0;
            Statics.field1818 = "";
            field664 = true;
            field668 = false;
            if (Statics.field939.field137) {
                class162.method1736(2);
            } else {
                class162.method1352(2, Statics.field558, "scape main", "", 255, false);
            }
            class151.method610(false);
            Statics.field666 = true;
            Statics.field642.method1383(0, 0);
            Statics.field644.method1383(382, 0);
            Statics.field242.method1543(382 - Statics.field242.field1326 / 2, 18);
        } else if (arg4 == 4) {
            field672 = 4;
        }
    }

    @ObfuscatedName("c.s(I)V")
    public static void method138() {
        if (!Statics.field666) {
            return;
        }
        Statics.field640 = null;
        Statics.field641 = null;
        Statics.field652 = null;
        Statics.field642 = null;
        Statics.field644 = null;
        Statics.field242 = null;
        Statics.field608 = null;
        Statics.field2015 = null;
        Statics.field175 = null;
        Statics.field127 = null;
        Statics.field1930 = null;
        Statics.field2769 = null;
        Statics.field2976 = null;
        Statics.field1581 = null;
        Statics.field567 = null;
        Statics.field1505 = null;
        Statics.field237 = null;
        Statics.field92 = null;
        Statics.field602 = null;
        Statics.field649 = null;
        Statics.field2534 = null;
        Statics.field665 = null;
        class162.method1736(2);
        class151.method610(true);
        Statics.field666 = false;
    }

    @ObfuscatedName("cs.v(Leq;I)V")
    public static void method1733(class131 arg0) {
        if (field668) {
            method64(arg0);
            return;
        }
        if ((class127.field2034 == 1 || !Statics.field2146 && class127.field2034 == 4) && class127.field2028 >= 715 && class127.field2036 >= 453) {
            Statics.field939.field137 = !Statics.field939.field137;
            class9.method680();
            if (Statics.field939.field137) {
                class162.method2843();
            } else {
                class162.method2834(Statics.field558, "scape main", "", 255, false);
            }
        }
        if (client.field270 == 5) {
            return;
        }
        field653++;
        if (client.field270 != 10 && client.field270 != 11) {
            return;
        }
        if (client.field268 == 0) {
            if (class127.field2034 == 1 || !Statics.field2146 && class127.field2034 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class127.field2028 >= var1 && class127.field2028 <= var1 + var3 && class127.field2036 >= var2 && class127.field2036 <= var2 + var4) {
                    method1737();
                    return;
                }
            }
            if (Statics.field125 != null) {
                method1737();
            }
        }
        int var5 = class127.field2034;
        int var6 = class127.field2028;
        int var7 = class127.field2036;
        if (!Statics.field2146 && var5 == 4) {
            var5 = 1;
        }
        if (field672 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class125.method800(client.method463("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field331 & 0x4) != 0) {
                    if ((client.field331 & 0x400) == 0) {
                        field671 = class143.field2380;
                        field673 = class143.field2381;
                        field656 = class143.field2382;
                    } else {
                        field671 = class143.field2405;
                        field673 = class143.field2304;
                        field656 = class143.field2388;
                    }
                    field672 = 1;
                    field659 = 0;
                } else if ((client.field331 & 0x400) == 0) {
                    field671 = class143.field2376;
                    field673 = class143.field2377;
                    field656 = class143.field2378;
                    field672 = 2;
                    field659 = 0;
                } else {
                    field671 = class143.field2383;
                    field673 = class143.field2384;
                    field656 = class143.field2385;
                    field672 = 1;
                    field659 = 0;
                }
            }
        } else if (field672 == 1) {
            while (class124.method2556()) {
                if (Statics.field1884 == 84) {
                    field671 = class143.field2376;
                    field673 = class143.field2377;
                    field656 = class143.field2378;
                    field672 = 2;
                    field659 = 0;
                } else if (Statics.field1884 == 13) {
                    field672 = 0;
                }
            }
            short var11 = 302;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field671 = class143.field2376;
                field673 = class143.field2377;
                field656 = class143.field2378;
                field672 = 2;
                field659 = 0;
            }
            short var13 = 462;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field672 = 0;
            }
        } else if (field672 == 2) {
            short var14 = 231;
            int var25 = var14 + 30;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field659 = 0;
            }
            var25 += 15;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field659 = 1;
            }
            var25 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field661 = field661.trim();
                if (field661.length() == 0) {
                    method2349(class143.field2389, class143.field2283, class143.field2293);
                    return;
                }
                if (field662.length() == 0) {
                    method2349(class143.field2285, class143.field2225, class143.field2287);
                    return;
                }
                method2349(class143.field2302, class143.field2291, class143.field2393);
                field663 = Statics.field939.field138.containsKey(class200.method2616(field661)) ? class145.field2422 : class145.field2423;
                client.method1376(20);
                return;
            }
            short var17 = 462;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field672 = 0;
                field661 = "";
                field662 = "";
                Statics.field2427 = 0;
                Statics.field1818 = "";
                field664 = true;
            }
            while (true) {
                while (class124.method2556()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field658.length(); var19++) {
                        if (Statics.field1891 == field658.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (Statics.field1884 == 13) {
                        field672 = 0;
                        field661 = "";
                        field662 = "";
                        Statics.field2427 = 0;
                        Statics.field1818 = "";
                        field664 = true;
                    } else if (field659 == 0) {
                        if (Statics.field1884 == 85 && field661.length() > 0) {
                            field661 = field661.substring(0, field661.length() - 1);
                        }
                        if (Statics.field1884 == 84 || Statics.field1884 == 80) {
                            field659 = 1;
                        }
                        if (var18 && field661.length() < 320) {
                            field661 = field661 + Statics.field1891;
                        }
                    } else if (field659 == 1) {
                        if (Statics.field1884 == 85 && field662.length() > 0) {
                            field662 = field662.substring(0, field662.length() - 1);
                        }
                        if (Statics.field1884 == 84 || Statics.field1884 == 80) {
                            field659 = 0;
                        }
                        if (Statics.field1884 == 84) {
                            field661 = field661.trim();
                            if (field661.length() == 0) {
                                method2349(class143.field2389, class143.field2283, class143.field2293);
                                return;
                            }
                            if (field662.length() == 0) {
                                method2349(class143.field2285, class143.field2225, class143.field2287);
                                return;
                            }
                            method2349(class143.field2302, class143.field2291, class143.field2393);
                            field663 = Statics.field939.field138.containsKey(class200.method2616(field661)) ? class145.field2422 : class145.field2423;
                            client.method1376(20);
                            return;
                        }
                        if (var18 && field662.length() < 20) {
                            field662 = field662 + Statics.field1891;
                        }
                    }
                }
                return;
            }
        } else if (field672 == 4) {
            short var20 = 302;
            short var21 = 321;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                Statics.field1818.trim();
                if (Statics.field1818.length() != 6) {
                    method2349(class143.field2194, class143.field2165, class143.field2200);
                    return;
                }
                Statics.field2427 = Integer.parseInt(Statics.field1818);
                Statics.field1818 = "";
                field663 = field664 ? class145.field2430 : class145.field2428;
                method2349(class143.field2302, class143.field2291, class143.field2393);
                client.method1376(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field664 = !field664;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                class125.method800(client.method463("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var22 = 462;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                field672 = 0;
                field661 = "";
                field662 = "";
                Statics.field2427 = 0;
                Statics.field1818 = "";
            }
            while (class124.method2556()) {
                boolean var23 = false;
                for (int var24 = 0; var24 < field650.length(); var24++) {
                    if (Statics.field1891 == field650.charAt(var24)) {
                        var23 = true;
                        break;
                    }
                }
                if (Statics.field1884 == 13) {
                    field672 = 0;
                    field661 = "";
                    field662 = "";
                    Statics.field2427 = 0;
                    Statics.field1818 = "";
                } else {
                    if (Statics.field1884 == 85 && Statics.field1818.length() > 0) {
                        Statics.field1818 = Statics.field1818.substring(0, Statics.field1818.length() - 1);
                    }
                    if (Statics.field1884 == 84) {
                        Statics.field1818.trim();
                        if (Statics.field1818.length() != 6) {
                            method2349(class143.field2194, class143.field2165, class143.field2200);
                            return;
                        }
                        Statics.field2427 = Integer.parseInt(Statics.field1818);
                        Statics.field1818 = "";
                        field663 = field664 ? class145.field2430 : class145.field2428;
                        method2349(class143.field2302, class143.field2291, class143.field2393);
                        client.method1376(20);
                        return;
                    }
                    if (var23 && Statics.field1818.length() < 6) {
                        Statics.field1818 = Statics.field1818 + Statics.field1891;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.o(Lgn;Lgn;I)V")
    public static void method1734(class194 arg0, class194 arg1) {
        if (field668) {
            method2778(arg0, arg1);
            return;
        }
        if (client.field270 == 0 || client.field270 == 5) {
            byte var2 = 20;
            arg0.method3373(class143.field2375, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1537(230, var3, 304, 34, 9179409);
            class73.method1537(231, var3 + 1, 302, 32, 0);
            class73.method1474(232, var3 + 2, field655 * 3, 30, 9179409);
            class73.method1474(field655 * 3 + 232, var3 + 2, 300 - field655 * 3, 30, 0);
            arg0.method3373(field657, 382, 276 - var2, 16777215, -1);
        }
        if (client.field270 == 20) {
            Statics.field640.method1543(382 - Statics.field640.field1326 / 2, 271 - Statics.field640.field1327 / 2);
            short var4 = 211;
            arg0.method3373(field671, 382, var4, 16776960, 0);
            int var62 = var4 + 15;
            arg0.method3373(field673, 382, var62, 16776960, 0);
            int var63 = var62 + 15;
            arg0.method3373(field656, 382, var63, 16776960, 0);
            int var64 = var63 + 15;
            int var65 = var64 + 10;
            if (field672 != 4) {
                arg0.method3396(class143.field2167, 272, var65, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field661; arg0.method3318(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3396(class193.method3315(var6), 312, var65, 16777215, 0);
                var62 = var65 + 15;
                arg0.method3396(class143.field2392 + class200.method2893(field662), 274, var62, 16777215, 0);
                var62 += 15;
            }
        }
        if (client.field270 == 10 || client.field270 == 11) {
            Statics.field640.method1543(202, 171);
            if (field672 == 0) {
                short var7 = 251;
                arg0.method3373(class143.field2397, 382, var7, 16776960, 0);
                int var66 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field641.method1543(var8 - 73, var9 - 20);
                arg0.method3316(class143.field2196, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field641.method1543(var10 - 73, var9 - 20);
                arg0.method3316(class143.field2399, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field672 == 1) {
                arg0.method3373(class143.field2199, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3373(field671, 382, var11, 16777215, 0);
                int var67 = var11 + 15;
                arg0.method3373(field673, 382, var67, 16777215, 0);
                int var68 = var67 + 15;
                arg0.method3373(field656, 382, var68, 16777215, 0);
                int var69 = var68 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field641.method1543(var12 - 73, var13 - 20);
                arg0.method3373(class143.field2171, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field641.method1543(var14 - 73, var13 - 20);
                arg0.method3373(class143.field2401, var14, var13 + 5, 16777215, 0);
            } else if (field672 == 2) {
                short var15 = 211;
                arg0.method3373(field671, 382, var15, 16776960, 0);
                int var70 = var15 + 15;
                arg0.method3373(field673, 382, var70, 16776960, 0);
                int var71 = var70 + 15;
                arg0.method3373(field656, 382, var71, 16776960, 0);
                int var72 = var71 + 15;
                int var73 = var72 + 10;
                arg0.method3396(class143.field2167, 272, var73, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field661; arg0.method3318(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3396(class193.method3315(var17) + (field659 == 0 & client.field316 % 40 < 20 ? class2.method1382(16776960) + class2.field22 : ""), 312, var73, 16777215, 0);
                var70 = var73 + 15;
                arg0.method3396(class143.field2392 + class200.method2893(field662) + (field659 == 1 & client.field316 % 40 < 20 ? class2.method1382(16776960) + class2.field22 : ""), 274, var70, 16777215, 0);
                var70 += 15;
                short var18 = 302;
                short var19 = 321;
                Statics.field641.method1543(var18 - 73, var19 - 20);
                arg0.method3373(class143.field2400, var18, var19 + 5, 16777215, 0);
                short var20 = 462;
                Statics.field641.method1543(var20 - 73, var19 - 20);
                arg0.method3373(class143.field2401, var20, var19 + 5, 16777215, 0);
            } else if (field672 == 4) {
                arg0.method3373(class143.field2374, 382, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3373(field671, 382, var21, 16777215, 0);
                int var74 = var21 + 15;
                arg0.method3373(field673, 382, var74, 16777215, 0);
                int var75 = var74 + 15;
                arg0.method3373(field656, 382, var75, 16777215, 0);
                int var76 = var75 + 15;
                arg0.method3396(class143.field2396 + class200.method2893(Statics.field1818) + (client.field316 % 40 < 20 ? class2.method1382(16776960) + class2.field22 : ""), 274, var76, 16777215, 0);
                int var77 = var76 - 8;
                arg0.method3396(class143.field2233, 373, var77, 16776960, 0);
                int var78 = var77 + 15;
                arg0.method3396(class143.field2173, 373, var78, 16776960, 0);
                int var22 = 373 + arg0.method3318(class143.field2173) + 15;
                int var23 = var78 - arg0.field2926;
                class74 var24;
                if (field664) {
                    var24 = Statics.field175;
                } else {
                    var24 = Statics.field2015;
                }
                var24.method1543(var22, var23);
                var74 = var78 + 15;
                short var25 = 302;
                short var26 = 321;
                Statics.field641.method1543(var25 - 73, var26 - 20);
                arg0.method3373(class143.field2171, var25, var26 + 5, 16777215, 0);
                short var27 = 462;
                Statics.field641.method1543(var27 - 73, var26 - 20);
                arg0.method3373(class143.field2401, var27, var26 + 5, 16777215, 0);
                arg1.method3373(class143.field2390, 382, var26 + 36, 255, 0);
            }
        }
        if (field653 > 0) {
            method2764(field653);
            field653 = 0;
        }
        short var28 = 256;
        if (field647 > 0) {
            for (int var29 = 0; var29 < 256; var29++) {
                if (field647 > 768) {
                    Statics.field92[var29] = method14(Statics.field567[var29], Statics.field1505[var29], 1024 - field647);
                } else if (field647 > 256) {
                    Statics.field92[var29] = Statics.field1505[var29];
                } else {
                    Statics.field92[var29] = method14(Statics.field1505[var29], Statics.field567[var29], 256 - field647);
                }
            }
        } else if (field648 > 0) {
            for (int var30 = 0; var30 < 256; var30++) {
                if (field648 > 768) {
                    Statics.field92[var30] = method14(Statics.field567[var30], Statics.field237[var30], 1024 - field648);
                } else if (field648 > 256) {
                    Statics.field92[var30] = Statics.field237[var30];
                } else {
                    Statics.field92[var30] = method14(Statics.field237[var30], Statics.field567[var30], 256 - field648);
                }
            }
        } else {
            for (int var31 = 0; var31 < 256; var31++) {
                Statics.field92[var31] = Statics.field567[var31];
            }
        }
        class73.method1530(0, 9, 128, var28 + 7);
        Statics.field642.method1383(0, 0);
        class73.method1521();
        int var32 = 0;
        int var33 = 6885;
        for (int var34 = 1; var34 < var28 - 1; var34++) {
            int var35 = (var28 - var34) * field646[var34] / var28;
            int var36 = var35 + 22;
            if (var36 < 0) {
                var36 = 0;
            }
            var32 += var36;
            for (int var37 = var36; var37 < 128; var37++) {
                int var38 = Statics.field2534[var32++];
                if (var38 == 0) {
                    var33++;
                } else {
                    int var40 = 256 - var38;
                    int var41 = Statics.field92[var38];
                    int var42 = Statics.field94.field1299[var33];
                    Statics.field94.field1299[var33++] = ((var41 & 0xFF00) * var38 + (var42 & 0xFF00) * var40 & 0xFF0000) + ((var41 & 0xFF00FF) * var38 + (var42 & 0xFF00FF) * var40 & 0xFF00FF00) >> 8;
                }
            }
            var33 += var36 + 765 - 128;
        }
        class73.method1530(637, 9, 765, var28 + 7);
        Statics.field644.method1383(382, 0);
        class73.method1521();
        int var43 = 0;
        int var44 = 7546;
        for (int var45 = 1; var45 < var28 - 1; var45++) {
            int var46 = (var28 - var45) * field646[var45] / var28;
            int var47 = 103 - var46;
            int var48 = var44 + var46;
            for (int var49 = 0; var49 < var47; var49++) {
                int var50 = Statics.field2534[var43++];
                if (var50 == 0) {
                    var48++;
                } else {
                    int var52 = 256 - var50;
                    int var53 = Statics.field92[var50];
                    int var54 = Statics.field94.field1299[var48];
                    Statics.field94.field1299[var48++] = ((var53 & 0xFF00FF) * var50 + (var54 & 0xFF00FF) * var52 & 0xFF00FF00) + ((var53 & 0xFF00) * var50 + (var54 & 0xFF00) * var52 & 0xFF0000) >> 8;
                }
            }
            var43 += 128 - var47;
            var44 = 765 - var47 - var46 + var48;
        }
        Statics.field608[Statics.field939.field137 ? 1 : 0].method1543(725, 463);
        if (client.field270 > 5 && client.field268 == 0) {
            if (Statics.field1581 == null) {
                Statics.field1581 = class70.method478(Statics.field679, "sl_button", "");
            } else {
                byte var55 = 5;
                short var56 = 463;
                byte var57 = 100;
                byte var58 = 35;
                Statics.field1581.method1543(var55, var56);
                arg0.method3373(class143.field2330 + " " + client.field262, var57 / 2 + var55, var58 / 2 + var56 - 2, 16777215, 0);
                if (Statics.field125 == null) {
                    arg1.method3373(class143.field2412, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                } else {
                    arg1.method3373(class143.field2411, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var59 = Statics.field61.getGraphics();
            Statics.field94.method1318(var59, 0, 0);
        } catch (Exception var61) {
            Statics.field61.repaint();
        }
    }

    @ObfuscatedName("da.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2349(String arg0, String arg1, String arg2) {
        field671 = arg0;
        field673 = arg1;
        field656 = arg2;
    }

    @ObfuscatedName("dw.m(Lbb;I)V")
    public static final void method2303(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field602.length; var2++) {
            Statics.field602[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field602[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field649[var8] = (Statics.field602[var8 - 1] + Statics.field602[var8 + 1] + Statics.field602[var8 - 128] + Statics.field602[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field602;
            Statics.field602 = Statics.field649;
            Statics.field649 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1327; var11++) {
            for (int var12 = 0; var12 < arg0.field1326; var12++) {
                if (arg0.field1329[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1324;
                    int var14 = var11 + 16 + arg0.field1325;
                    int var15 = (var14 << 7) + var13;
                    Statics.field602[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ek.i(II)V")
    public static final void method2764(int arg0) {
        short var1 = 256;
        field651 += arg0 * 128;
        if (field651 > Statics.field602.length) {
            field651 -= Statics.field602.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2303(Statics.field652[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2534[var3 + var4] - Statics.field602[field651 + var3 & Statics.field602.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2534[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2534[var9 + var10] = 255;
                } else {
                    Statics.field2534[var9 + var10] = 0;
                }
            }
        }
        if (field647 > 0) {
            field647 -= arg0 * 4;
        }
        if (field648 > 0) {
            field648 -= arg0 * 4;
        }
        if (field647 == 0 && field648 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field647 = 1024;
            }
            if (var12 == 1) {
                field648 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field646[var13] = field646[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field646[var14] = (int) (Math.sin((double) field654 / 14.0D) * 16.0D + Math.sin((double) field654 / 15.0D) * 14.0D + Math.sin((double) field654 / 16.0D) * 12.0D);
            field654++;
        }
        field645 += arg0 * 1739878513;
        int var15 = ((client.field316 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field645 * -2140964700; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2534[(var18 << 7) + var17] = 192;
        }
        field645 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2534[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2534[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field665[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field665[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field665[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2534[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("s.t(IIII)I")
    public static final int method14(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ew.l(Lgn;Lgn;I)V")
    public static void method2778(class194 arg0, class194 arg1) {
        if (Statics.field127 == null) {
            Statics.field127 = class70.method2638(Statics.field679, "sl_back", "");
        }
        if (Statics.field1930 == null) {
            Statics.field1930 = class70.method2784(Statics.field679, "sl_flags", "");
        }
        if (Statics.field2769 == null) {
            Statics.field2769 = class70.method2784(Statics.field679, "sl_arrows", "");
        }
        if (Statics.field2976 == null) {
            Statics.field2976 = class70.method2784(Statics.field679, "sl_stars", "");
        }
        class73.method1474(0, 23, 765, 480, 0);
        class73.method1475(0, 0, 125, 23, 12425273, 9135624);
        class73.method1475(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3373(class143.field2402, 62, 15, 0, -1);
        if (Statics.field2976 != null) {
            Statics.field2976[1].method1543(140, 1);
            arg1.method3396(class143.field2403, 152, 10, 16777215, -1);
            Statics.field2976[0].method1543(140, 12);
            arg1.method3396(class143.field2404, 152, 21, 16777215, -1);
        }
        if (Statics.field2769 != null) {
            short var2 = 280;
            if (field670[0] == 0 && field639[0] == 0) {
                Statics.field2769[2].method1543(var2, 4);
            } else {
                Statics.field2769[0].method1543(var2, 4);
            }
            if (field670[0] == 0 && field639[0] == 1) {
                Statics.field2769[3].method1543(var2 + 15, 4);
            } else {
                Statics.field2769[1].method1543(var2 + 15, 4);
            }
            arg0.method3396(class143.field2297, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field670[0] == 1 && field639[0] == 0) {
                Statics.field2769[2].method1543(var3, 4);
            } else {
                Statics.field2769[0].method1543(var3, 4);
            }
            if (field670[0] == 1 && field639[0] == 1) {
                Statics.field2769[3].method1543(var3 + 15, 4);
            } else {
                Statics.field2769[1].method1543(var3 + 15, 4);
            }
            arg0.method3396(class143.field2338, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field670[0] == 2 && field639[0] == 0) {
                Statics.field2769[2].method1543(var4, 4);
            } else {
                Statics.field2769[0].method1543(var4, 4);
            }
            if (field670[0] == 2 && field639[0] == 1) {
                Statics.field2769[3].method1543(var4 + 15, 4);
            } else {
                Statics.field2769[1].method1543(var4 + 15, 4);
            }
            arg0.method3396(class143.field2407, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field670[0] == 3 && field639[0] == 0) {
                Statics.field2769[2].method1543(var5, 4);
            } else {
                Statics.field2769[0].method1543(var5, 4);
            }
            if (field670[0] == 3 && field639[0] == 1) {
                Statics.field2769[3].method1543(var5 + 15, 4);
            } else {
                Statics.field2769[1].method1543(var5 + 15, 4);
            }
            arg0.method3396(class143.field2408, var5 + 32, 17, 16777215, -1);
        }
        class73.method1474(708, 4, 50, 16, 0);
        arg1.method3373(class143.field2401, 733, 16, 16777215, -1);
        field643 = -1;
        if (Statics.field127 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field669) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field669) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field669) {
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
            for (int var20 = 0; var20 < field669; var20++) {
                class22 var21 = Statics.field2784[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field573);
                if (var21.field573 == -1) {
                    var23 = class143.field2409;
                    var22 = false;
                } else if (var21.field573 > 1980) {
                    var23 = class143.field2410;
                    var22 = false;
                }
                byte var24;
                if (var21.method483()) {
                    if (var21.method482()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method482()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field2035 >= var17 && class127.field2029 >= var16 && class127.field2035 < var6 + var17 && class127.field2029 < var7 + var16 && var22) {
                    field643 = var20;
                    Statics.field127[var24].method1396(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field127[var24].method1383(var17, var16);
                }
                if (Statics.field1930 != null) {
                    Statics.field1930[(var21.method482() ? 8 : 0) + var21.field576].method1543(var17 + 29, var16);
                }
                arg0.method3373(Integer.toString(var21.field577), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3373(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3318(Statics.field2784[field643].field575) + 6;
                int var26 = arg1.field2926 + 8;
                class73.method1474(class127.field2035 - var25 / 2, class127.field2029 + 20 + 5, var25, var26, 16777120);
                class73.method1537(class127.field2035 - var25 / 2, class127.field2029 + 20 + 5, var25, var26, 0);
                arg1.method3373(Statics.field2784[field643].field575, class127.field2035, class127.field2029 + 20 + 5 + arg1.field2926 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field61.getGraphics();
            Statics.field94.method1318(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field61.repaint();
        }
    }

    @ObfuscatedName("m.p(Leq;I)V")
    public static void method64(class131 arg0) {
        if (class127.field2034 != 1 && Statics.field2146 || class127.field2034 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2028 >= var1 && class127.field2028 <= var1 + 14 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(0, 0);
            return;
        }
        if (class127.field2028 >= var1 + 15 && class127.field2028 <= var1 + 80 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2028 >= var2 && class127.field2028 <= var2 + 14 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(1, 0);
            return;
        }
        if (class127.field2028 >= var2 + 15 && class127.field2028 <= var2 + 80 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2028 >= var3 && class127.field2028 <= var3 + 14 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(2, 0);
            return;
        }
        if (class127.field2028 >= var3 + 15 && class127.field2028 <= var3 + 80 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2028 >= var4 && class127.field2028 <= var4 + 14 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(3, 0);
            return;
        }
        if (class127.field2028 >= var4 + 15 && class127.field2028 <= var4 + 80 && class127.field2036 >= 4 && class127.field2036 <= 18) {
            method2440(3, 1);
            return;
        }
        if (class127.field2028 >= 708 && class127.field2036 >= 4 && class127.field2028 <= 758 && class127.field2036 <= 20) {
            field668 = false;
            Statics.field642.method1383(0, 0);
            Statics.field644.method1383(382, 0);
            Statics.field242.method1543(382 - Statics.field242.field1326 / 2, 18);
            return;
        }
        if (field643 == -1) {
            return;
        }
        class22 var5 = Statics.field2784[field643];
        method139(var5);
        field668 = false;
        Statics.field642.method1383(0, 0);
        Statics.field644.method1383(382, 0);
        Statics.field242.method1543(382 - Statics.field242.field1326 / 2, 18);
        return;
    }

    @ObfuscatedName("c.r(Le;S)V")
    public static void method139(class22 arg0) {
        if (arg0.method482() != client.field458) {
            client.field458 = arg0.method482();
            class45.method495(arg0.method482());
        }
        Statics.field1896 = arg0.field574;
        client.field262 = arg0.field577;
        client.field331 = arg0.field572;
        Statics.field299 = client.field264 == 0 ? 43594 : arg0.field577 + 40000;
        Statics.field1968 = client.field264 == 0 ? 443 : arg0.field577 + 50000;
        Statics.field1914 = Statics.field299;
    }

    @ObfuscatedName("co.j(B)V")
    public static void method1737() {
        try {
            if (Statics.field125 == null) {
                Statics.field125 = new class17(Statics.field1953, new URL(Statics.field342));
            } else {
                byte[] var0 = Statics.field125.method163();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field669 = var1.method2094();
                    Statics.field2784 = new class22[field669];
                    int var2 = 0;
                    while (var2 < field669) {
                        class22 var3 = Statics.field2784[var2] = new class22();
                        var3.field577 = var1.method2094();
                        var3.field572 = var1.method2097();
                        var3.field574 = var1.method2100();
                        var3.field575 = var1.method2100();
                        var3.field576 = var1.method2116();
                        var3.field573 = var1.method2095();
                        var3.field579 = var2++;
                    }
                    method2615(Statics.field2784, 0, Statics.field2784.length - 1, field670, field639);
                    field668 = true;
                    Statics.field125 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field125 = null;
        }
    }

    @ObfuscatedName("dd.c(III)V")
    public static void method2440(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field670[var5] != arg0) {
                var2[var4] = field670[var5];
                var3[var4] = field639[var5];
                var4++;
            }
        }
        field670 = var2;
        field639 = var3;
        method2615(Statics.field2784, 0, Statics.field2784.length - 1, field670, field639);
    }

    @ObfuscatedName("eh.q([Le;II[I[IB)V")
    public static void method2615(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
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
                        var11 = arg0[var6].field579;
                        var12 = var8.field579;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field573;
                        var12 = var8.field573;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method482() ? 1 : 0;
                        var12 = var8.method482() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field577;
                        var12 = var8.field577;
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
                        var15 = arg0[var5].field579;
                        var16 = var8.field579;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field573;
                        var16 = var8.field573;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method482() ? 1 : 0;
                        var16 = var8.method482() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field577;
                        var16 = var8.field577;
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
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2615(arg0, arg1, var6, arg3, arg4);
        method2615(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
