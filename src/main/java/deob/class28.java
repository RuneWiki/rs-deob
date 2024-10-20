package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ae")
public class class28 {

    @ObfuscatedName("ae.n")
    public static int[] field665 = new int[256];

    @ObfuscatedName("ae.z")
    public static int field666 = 0;

    @ObfuscatedName("ae.t")
    public static int field667 = 0;

    @ObfuscatedName("ae.ay")
    public static int field664 = 0;

    @ObfuscatedName("ae.ae")
    public static int field674 = 0;

    @ObfuscatedName("ae.af")
    public static int field670 = 0;

    @ObfuscatedName("ae.ab")
    public static int field683 = 0;

    @ObfuscatedName("ae.ao")
    public static int field672 = 10;

    @ObfuscatedName("ae.ak")
    public static String field673 = "";

    @ObfuscatedName("ae.ah")
    public static int field671 = 0;

    @ObfuscatedName("ae.ai")
    public static String field675 = "";

    @ObfuscatedName("ae.al")
    public static String field676 = "";

    @ObfuscatedName("ae.av")
    public static String field677 = "";

    @ObfuscatedName("ae.ap")
    public static String field668 = "";

    @ObfuscatedName("ae.ar")
    public static String field684 = "";

    @ObfuscatedName("ae.au")
    public static class144 field688 = class144.field2399;

    @ObfuscatedName("ae.ag")
    public static boolean field682 = true;

    @ObfuscatedName("ae.am")
    public static int field690 = 0;

    @ObfuscatedName("ae.aw")
    public static String field659 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ae.ac")
    public static String field679 = "1234567890";

    @ObfuscatedName("ae.az")
    public static boolean field686 = false;

    @ObfuscatedName("ae.br")
    public static int field662 = 0;

    @ObfuscatedName("ae.bc")
    public static int[] field695 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ae.bn")
    public static int[] field687 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ae.by")
    public static int field692 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.e(Lez;Lez;I)I")
    public static int method478(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2658("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2658("logo", "")) {
            var2++;
        }
        if (arg1.method2658("titlebox", "")) {
            var2++;
        }
        if (arg1.method2658("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2658("runes", "")) {
            var2++;
        }
        if (arg1.method2658("title_mute", "")) {
            var2++;
        }
        if (arg1.method2659("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2659("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2658("sl_back", "");
        arg1.method2658("sl_flags", "");
        arg1.method2658("sl_arrows", "");
        arg1.method2658("sl_stars", "");
        arg1.method2658("sl_button", "");
        return var2;
    }

    @ObfuscatedName("g.o(I)I")
    public static int method521() {
        return 8;
    }

    @ObfuscatedName("client.y(Ljava/awt/Component;Lez;Lez;ZII)V")
    public static void method464(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field691) {
            field671 = arg4;
            class73.method1496();
            byte[] var5 = arg1.method2669("title.jpg", "");
            Statics.field1817 = new class72(var5, arg0);
            Statics.field661 = Statics.field1817.method1389();
            Statics.field660 = class70.method2814(arg2, "logo", "");
            Statics.field655 = class70.method2814(arg2, "titlebox", "");
            Statics.field657 = class70.method2814(arg2, "titlebutton", "");
            Statics.field658 = class70.method2382(arg2, "runes", "");
            Statics.field2655 = class70.method2382(arg2, "title_mute", "");
            Statics.field678 = class70.method2814(arg2, "options_radio_buttons,0", "");
            Statics.field242 = class70.method2814(arg2, "options_radio_buttons,2", "");
            Statics.field706 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field706[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field706[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field706[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field706[var9 + 192] = 16777215;
            }
            Statics.field999 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field999[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field999[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field999[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field999[var13 + 192] = 16777215;
            }
            Statics.field23 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field23[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field23[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field23[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field23[var17 + 192] = 16777215;
            }
            Statics.field1996 = new int[256];
            Statics.field652 = new int[32768];
            Statics.field188 = new int[32768];
            method572((class74) null);
            Statics.field639 = new int[32768];
            Statics.field603 = new int[32768];
            if (arg3) {
                field668 = "";
                field684 = "";
            }
            Statics.field681 = 0;
            Statics.field623 = "";
            field682 = true;
            field686 = false;
            if (Statics.field92.field145) {
                class161.field2700 = 1;
                Statics.field1924 = null;
                Statics.field2705 = -1;
                Statics.field240 = -1;
                Statics.field2706 = 0;
                Statics.field2744 = false;
                Statics.field1015 = 2;
            } else {
                class161.method2717(2, Statics.field1906, "scape main", "", 255, false);
            }
            Statics.method2633(false);
            Statics.field691 = true;
            Statics.field1817.method1413(0, 0);
            Statics.field661.method1413(382, 0);
            Statics.field660.method1544(382 - Statics.field660.field1328 / 2, 18);
        } else if (arg4 == 4) {
            field671 = 4;
        }
    }

    @ObfuscatedName("b.b(I)V")
    public static void method30() {
        if (!Statics.field691) {
            return;
        }
        Statics.field655 = null;
        Statics.field657 = null;
        Statics.field658 = null;
        Statics.field1817 = null;
        Statics.field661 = null;
        Statics.field660 = null;
        Statics.field2655 = null;
        Statics.field678 = null;
        Statics.field242 = null;
        Statics.field2130 = null;
        Statics.field2959 = null;
        Statics.field685 = null;
        Statics.field1917 = null;
        Statics.field645 = null;
        Statics.field706 = null;
        Statics.field999 = null;
        Statics.field23 = null;
        Statics.field1996 = null;
        Statics.field652 = null;
        Statics.field188 = null;
        Statics.field639 = null;
        Statics.field603 = null;
        class161.field2700 = 1;
        Statics.field1924 = null;
        Statics.field2705 = -1;
        Statics.field240 = -1;
        Statics.field2706 = 0;
        Statics.field2744 = false;
        Statics.field1015 = 2;
        Statics.method2633(true);
        Statics.field691 = false;
    }

    @ObfuscatedName("du.w(Lea;I)V")
    public static void method2305(class131 arg0) {
        if (field686) {
            method2343(arg0);
            return;
        }
        if ((class127.field2009 == 1 || !Statics.field1666 && class127.field2009 == 4) && class127.field2010 >= 715 && class127.field2011 >= 453) {
            Statics.field92.field145 = !Statics.field92.field145;
            class9.method819();
            if (Statics.field92.field145) {
                Statics.field2709.method3012();
                class161.field2700 = 1;
                Statics.field1924 = null;
            } else {
                class147 var1 = Statics.field1906;
                int var2 = var1.method2655("scape main");
                int var3 = var1.method2656(var2, "");
                class161.method1920(var1, var2, var3, 255, false);
            }
        }
        if (client.field274 == 5) {
            return;
        }
        field670++;
        if (client.field274 != 10 && client.field274 != 11) {
            return;
        }
        if (client.field273 == 0) {
            if (class127.field2009 == 1 || !Statics.field1666 && class127.field2009 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class127.field2010 >= var4 && class127.field2010 <= var4 + var6 && class127.field2011 >= var5 && class127.field2011 <= var5 + var7) {
                    method149();
                    return;
                }
            }
            if (Statics.field577 != null) {
                method149();
            }
        }
        int var8 = class127.field2009;
        int var9 = class127.field2010;
        int var10 = class127.field2011;
        if (!Statics.field1666 && var8 == 4) {
            var8 = 1;
        }
        if (field671 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class125.method2615(client.method1361("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field267 & 0x4) != 0) {
                    if ((client.field267 & 0x400) == 0) {
                        field675 = class142.field2356;
                        field676 = class142.field2302;
                        field677 = class142.field2358;
                    } else {
                        field675 = class142.field2362;
                        field676 = class142.field2363;
                        field677 = class142.field2364;
                    }
                    field671 = 1;
                    field690 = 0;
                } else if ((client.field267 & 0x400) == 0) {
                    field675 = class142.field2352;
                    field676 = class142.field2247;
                    field677 = class142.field2354;
                    field671 = 2;
                    field690 = 0;
                } else {
                    field675 = class142.field2359;
                    field676 = class142.field2250;
                    field677 = class142.field2361;
                    field671 = 1;
                    field690 = 0;
                }
            }
        } else if (field671 == 1) {
            while (class124.method2339()) {
                if (Statics.field1812 == 84) {
                    field675 = class142.field2352;
                    field676 = class142.field2247;
                    field677 = class142.field2354;
                    field671 = 2;
                    field690 = 0;
                } else if (Statics.field1812 == 13) {
                    field671 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field675 = class142.field2352;
                field676 = class142.field2247;
                field677 = class142.field2354;
                field671 = 2;
                field690 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field671 = 0;
            }
        } else if (field671 == 2) {
            short var17 = 231;
            int var28 = var17 + 30;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field690 = 0;
            }
            var28 += 15;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field690 = 1;
            }
            var28 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field668 = field668.trim();
                if (field668.length() == 0) {
                    method469(class142.field2304, class142.field2259, class142.field2260);
                    return;
                }
                if (field684.length() == 0) {
                    method469(class142.field2261, class142.field2243, class142.field2198);
                    return;
                }
                method469(class142.field2188, class142.field2368, class142.field2369);
                field688 = Statics.field92.field142.containsKey(class199.method2635(field668)) ? class144.field2402 : class144.field2399;
                client.method3054(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field671 = 0;
                field668 = "";
                field684 = "";
                Statics.field681 = 0;
                Statics.field623 = "";
                field682 = true;
            }
            while (true) {
                while (class124.method2339()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field659.length(); var22++) {
                        if (Statics.field2393 == field659.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1812 == 13) {
                        field671 = 0;
                        field668 = "";
                        field684 = "";
                        Statics.field681 = 0;
                        Statics.field623 = "";
                        field682 = true;
                    } else if (field690 == 0) {
                        if (Statics.field1812 == 85 && field668.length() > 0) {
                            field668 = field668.substring(0, field668.length() - 1);
                        }
                        if (Statics.field1812 == 84 || Statics.field1812 == 80) {
                            field690 = 1;
                        }
                        if (var21 && field668.length() < 320) {
                            field668 = field668 + Statics.field2393;
                        }
                    } else if (field690 == 1) {
                        if (Statics.field1812 == 85 && field684.length() > 0) {
                            field684 = field684.substring(0, field684.length() - 1);
                        }
                        if (Statics.field1812 == 84 || Statics.field1812 == 80) {
                            field690 = 0;
                        }
                        if (Statics.field1812 == 84) {
                            field668 = field668.trim();
                            if (field668.length() == 0) {
                                method469(class142.field2304, class142.field2259, class142.field2260);
                                return;
                            }
                            if (field684.length() == 0) {
                                method469(class142.field2261, class142.field2243, class142.field2198);
                                return;
                            }
                            method469(class142.field2188, class142.field2368, class142.field2369);
                            field688 = Statics.field92.field142.containsKey(class199.method2635(field668)) ? class144.field2402 : class144.field2399;
                            client.method3054(20);
                            return;
                        }
                        if (var21 && field684.length() < 20) {
                            field684 = field684 + Statics.field2393;
                        }
                    }
                }
                return;
            }
        } else if (field671 == 4) {
            short var23 = 302;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                Statics.field623.trim();
                if (Statics.field623.length() != 6) {
                    method469(class142.field2258, class142.field2175, class142.field2176);
                    return;
                }
                Statics.field681 = Integer.parseInt(Statics.field623);
                Statics.field623 = "";
                field688 = field682 ? class144.field2398 : class144.field2400;
                method469(class142.field2188, class142.field2368, class142.field2369);
                client.method3054(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field682 = !field682;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                class125.method2615(client.method1361("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var25 = 462;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field671 = 0;
                field668 = "";
                field684 = "";
                Statics.field681 = 0;
                Statics.field623 = "";
            }
            while (class124.method2339()) {
                boolean var26 = false;
                for (int var27 = 0; var27 < field679.length(); var27++) {
                    if (Statics.field2393 == field679.charAt(var27)) {
                        var26 = true;
                        break;
                    }
                }
                if (Statics.field1812 == 13) {
                    field671 = 0;
                    field668 = "";
                    field684 = "";
                    Statics.field681 = 0;
                    Statics.field623 = "";
                } else {
                    if (Statics.field1812 == 85 && Statics.field623.length() > 0) {
                        Statics.field623 = Statics.field623.substring(0, Statics.field623.length() - 1);
                    }
                    if (Statics.field1812 == 84) {
                        Statics.field623.trim();
                        if (Statics.field623.length() != 6) {
                            method469(class142.field2258, class142.field2175, class142.field2176);
                            return;
                        }
                        Statics.field681 = Integer.parseInt(Statics.field623);
                        Statics.field623 = "";
                        field688 = field682 ? class144.field2398 : class144.field2400;
                        method469(class142.field2188, class142.field2368, class142.field2369);
                        client.method3054(20);
                        return;
                    }
                    if (var26 && Statics.field623.length() < 6) {
                        Statics.field623 = Statics.field623 + Statics.field2393;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.r(Lgn;Lgn;B)V")
    public static void method2324(class193 arg0, class193 arg1) {
        if (field686) {
            if (Statics.field2130 == null) {
                Statics.field2130 = Statics.method3010(Statics.field1265, "sl_back", "");
            }
            if (Statics.field2959 == null) {
                Statics.field2959 = class70.method2382(Statics.field1265, "sl_flags", "");
            }
            if (Statics.field685 == null) {
                Statics.field685 = class70.method2382(Statics.field1265, "sl_arrows", "");
            }
            if (Statics.field1917 == null) {
                Statics.field1917 = class70.method2382(Statics.field1265, "sl_stars", "");
            }
            class73.method1475(0, 23, 765, 480, 0);
            class73.method1513(0, 0, 125, 23, 12425273, 9135624);
            class73.method1513(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3245(class142.field2216, 62, 15, 0, -1);
            if (Statics.field1917 != null) {
                Statics.field1917[1].method1544(140, 1);
                arg1.method3239(class142.field2379, 152, 10, 16777215, -1);
                Statics.field1917[0].method1544(140, 12);
                arg1.method3239(class142.field2380, 152, 21, 16777215, -1);
            }
            if (Statics.field685 != null) {
                short var2 = 280;
                if (field695[0] == 0 && field687[0] == 0) {
                    Statics.field685[2].method1544(var2, 4);
                } else {
                    Statics.field685[0].method1544(var2, 4);
                }
                if (field695[0] == 0 && field687[0] == 1) {
                    Statics.field685[3].method1544(var2 + 15, 4);
                } else {
                    Statics.field685[1].method1544(var2 + 15, 4);
                }
                arg0.method3239(class142.field2226, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field695[0] == 1 && field687[0] == 0) {
                    Statics.field685[2].method1544(var3, 4);
                } else {
                    Statics.field685[0].method1544(var3, 4);
                }
                if (field695[0] == 1 && field687[0] == 1) {
                    Statics.field685[3].method1544(var3 + 15, 4);
                } else {
                    Statics.field685[1].method1544(var3 + 15, 4);
                }
                arg0.method3239(class142.field2382, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field695[0] == 2 && field687[0] == 0) {
                    Statics.field685[2].method1544(var4, 4);
                } else {
                    Statics.field685[0].method1544(var4, 4);
                }
                if (field695[0] == 2 && field687[0] == 1) {
                    Statics.field685[3].method1544(var4 + 15, 4);
                } else {
                    Statics.field685[1].method1544(var4 + 15, 4);
                }
                arg0.method3239(class142.field2383, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field695[0] == 3 && field687[0] == 0) {
                    Statics.field685[2].method1544(var5, 4);
                } else {
                    Statics.field685[0].method1544(var5, 4);
                }
                if (field695[0] == 3 && field687[0] == 1) {
                    Statics.field685[3].method1544(var5 + 15, 4);
                } else {
                    Statics.field685[1].method1544(var5 + 15, 4);
                }
                arg0.method3239(class142.field2347, var5 + 32, 17, 16777215, -1);
            }
            class73.method1475(708, 4, 50, 16, 0);
            arg1.method3245(class142.field2377, 733, 16, 16777215, -1);
            field692 = -1;
            if (Statics.field2130 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field662) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field662) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field662) {
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
                for (int var20 = 0; var20 < field662; var20++) {
                    class22 var21 = Statics.field689[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field582);
                    if (var21.field582 == -1) {
                        var23 = class142.field2385;
                        var22 = false;
                    } else if (var21.field582 > 1980) {
                        var23 = class142.field2386;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method492()) {
                        if (var21.method497()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method497()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2003 >= var17 && class127.field2004 >= var16 && class127.field2003 < var6 + var17 && class127.field2004 < var7 + var16 && var22) {
                        field692 = var20;
                        Statics.field2130[var24].method1404(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field2130[var24].method1413(var17, var16);
                    }
                    if (Statics.field2959 != null) {
                        Statics.field2959[(var21.method497() ? 8 : 0) + var21.field585].method1544(var17 + 29, var16);
                    }
                    arg0.method3245(Integer.toString(var21.field583), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3245(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3234(Statics.field689[field692].field586) + 6;
                    int var26 = arg1.field2910 + 8;
                    class73.method1475(class127.field2003 - var25 / 2, class127.field2004 + 20 + 5, var25, var26, 16777120);
                    class73.method1485(class127.field2003 - var25 / 2, class127.field2004 + 20 + 5, var25, var26, 0);
                    arg1.method3245(Statics.field689[field692].field586, class127.field2003, class127.field2004 + 20 + 5 + arg1.field2910 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field128.getGraphics();
                Statics.field574.method1324(var27, 0, 0);
            } catch (Exception var112) {
                Statics.field128.repaint();
            }
            return;
        }
        if (client.field274 == 0 || client.field274 == 5) {
            byte var29 = 20;
            arg0.method3245(class142.field2351, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1485(230, var30, 304, 34, 9179409);
            class73.method1485(231, var30 + 1, 302, 32, 0);
            class73.method1475(232, var30 + 2, field672 * 3, 30, 9179409);
            class73.method1475(field672 * 3 + 232, var30 + 2, 300 - field672 * 3, 30, 0);
            arg0.method3245(field673, 382, 276 - var29, 16777215, -1);
        }
        if (client.field274 == 20) {
            Statics.field655.method1544(382 - Statics.field655.field1328 / 2, 271 - Statics.field655.field1324 / 2);
            short var31 = 211;
            arg0.method3245(field675, 382, var31, 16776960, 0);
            int var114 = var31 + 15;
            arg0.method3245(field676, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3245(field677, 382, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field671 != 4) {
                arg0.method3239(class142.field2314, 272, var117, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field668; arg0.method3234(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3239(class192.method3280(var33), 312, var117, 16777215, 0);
                var114 = var117 + 15;
                String var35 = class142.field2371;
                String var36 = field684;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3239(var35 + var40, 274, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field274 == 10 || client.field274 == 11) {
            Statics.field655.method1544(202, 171);
            if (field671 == 0) {
                short var42 = 251;
                arg0.method3245(class142.field2276, 382, var42, 16776960, 0);
                int var118 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field657.method1544(var43 - 73, var44 - 20);
                arg0.method3242(class142.field2212, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field657.method1544(var45 - 73, var44 - 20);
                arg0.method3242(class142.field2311, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field671 == 1) {
                arg0.method3245(class142.field2171, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3245(field675, 382, var46, 16777215, 0);
                int var119 = var46 + 15;
                arg0.method3245(field676, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3245(field677, 382, var120, 16777215, 0);
                int var121 = var120 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field657.method1544(var47 - 73, var48 - 20);
                arg0.method3245(class142.field2147, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field657.method1544(var49 - 73, var48 - 20);
                arg0.method3245(class142.field2377, var49, var48 + 5, 16777215, 0);
            } else if (field671 == 2) {
                short var50 = 211;
                arg0.method3245(field675, 382, var50, 16776960, 0);
                int var122 = var50 + 15;
                arg0.method3245(field676, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3245(field677, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3239(class142.field2314, 272, var125, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field668; arg0.method3234(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3239(class192.method3280(var52) + (field690 == 0 & client.field318 % 40 < 20 ? class2.method778(16776960) + class2.field16 : ""), 312, var125, 16777215, 0);
                var122 = var125 + 15;
                String var54 = class142.field2371;
                String var55 = field684;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3239(var54 + var59 + (field690 == 1 & client.field318 % 40 < 20 ? class2.method778(16776960) + class2.field16 : ""), 274, var122, 16777215, 0);
                var122 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field657.method1544(var61 - 73, var62 - 20);
                arg0.method3245(class142.field2228, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field657.method1544(var63 - 73, var62 - 20);
                arg0.method3245(class142.field2377, var63, var62 + 5, 16777215, 0);
            } else if (field671 == 4) {
                arg0.method3245(class142.field2365, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3245(field675, 382, var64, 16777215, 0);
                int var126 = var64 + 15;
                arg0.method3245(field676, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3245(field677, 382, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var66 = class142.field2293;
                String var67 = Statics.field623;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3239(var66 + var71 + (client.field318 % 40 < 20 ? class2.method778(16776960) + class2.field16 : ""), 274, var128, 16777215, 0);
                var126 = var128 - 8;
                arg0.method3239(class142.field2148, 373, var126, 16776960, 0);
                var126 += 15;
                arg0.method3239(class142.field2149, 373, var126, 16776960, 0);
                int var73 = 373 + arg0.method3234(class142.field2149) + 15;
                int var74 = var126 - arg0.field2910;
                class74 var75;
                if (field682) {
                    var75 = Statics.field242;
                } else {
                    var75 = Statics.field678;
                }
                var75.method1544(var73, var74);
                var126 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field657.method1544(var76 - 73, var77 - 20);
                arg0.method3245(class142.field2147, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field657.method1544(var78 - 73, var77 - 20);
                arg0.method3245(class142.field2377, var78, var77 + 5, 16777215, 0);
                arg1.method3245(class142.field2366, 382, var77 + 36, 255, 0);
            }
        }
        if (field670 > 0) {
            method584(field670);
            field670 = 0;
        }
        short var79 = 256;
        if (field666 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field666 > 768) {
                    Statics.field1996[var80] = Statics.method500(Statics.field706[var80], Statics.field999[var80], 1024 - field666);
                } else if (field666 > 256) {
                    Statics.field1996[var80] = Statics.field999[var80];
                } else {
                    Statics.field1996[var80] = Statics.method500(Statics.field999[var80], Statics.field706[var80], 256 - field666);
                }
            }
        } else if (field667 > 0) {
            for (int var81 = 0; var81 < 256; var81++) {
                if (field667 > 768) {
                    Statics.field1996[var81] = Statics.method500(Statics.field706[var81], Statics.field23[var81], 1024 - field667);
                } else if (field667 > 256) {
                    Statics.field1996[var81] = Statics.field23[var81];
                } else {
                    Statics.field1996[var81] = Statics.method500(Statics.field23[var81], Statics.field706[var81], 256 - field667);
                }
            }
        } else {
            for (int var82 = 0; var82 < 256; var82++) {
                Statics.field1996[var82] = Statics.field706[var82];
            }
        }
        class73.method1484(0, 9, 128, var79 + 7);
        Statics.field1817.method1413(0, 0);
        class73.method1477();
        int var83 = 0;
        int var84 = 6885;
        for (int var85 = 1; var85 < var79 - 1; var85++) {
            int var86 = (var79 - var85) * field665[var85] / var79;
            int var87 = var86 + 22;
            if (var87 < 0) {
                var87 = 0;
            }
            var83 += var87;
            for (int var88 = var87; var88 < 128; var88++) {
                int var89 = Statics.field639[var83++];
                if (var89 == 0) {
                    var84++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field1996[var89];
                    int var93 = Statics.field574.field1300[var84];
                    Statics.field574.field1300[var84++] = ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) + ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) >> 8;
                }
            }
            var84 += var87 + 765 - 128;
        }
        class73.method1484(637, 9, 765, var79 + 7);
        Statics.field661.method1413(382, 0);
        class73.method1477();
        int var94 = 0;
        int var95 = 7546;
        for (int var96 = 1; var96 < var79 - 1; var96++) {
            int var97 = (var79 - var96) * field665[var96] / var79;
            int var98 = 103 - var97;
            int var99 = var95 + var97;
            for (int var100 = 0; var100 < var98; var100++) {
                int var101 = Statics.field639[var94++];
                if (var101 == 0) {
                    var99++;
                } else {
                    int var103 = 256 - var101;
                    int var104 = Statics.field1996[var101];
                    int var105 = Statics.field574.field1300[var99];
                    Statics.field574.field1300[var99++] = ((var104 & 0xFF00) * var101 + (var105 & 0xFF00) * var103 & 0xFF0000) + ((var104 & 0xFF00FF) * var101 + (var105 & 0xFF00FF) * var103 & 0xFF00FF00) >> 8;
                }
            }
            var94 += 128 - var98;
            var95 = 765 - var98 - var97 + var99;
        }
        Statics.field2655[Statics.field92.field145 ? 1 : 0].method1544(725, 463);
        if (client.field274 > 5 && client.field273 == 0) {
            if (Statics.field645 == null) {
                Statics.field645 = class70.method2814(Statics.field1265, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field645.method1544(var106, var107);
                arg0.method3245(class142.field2248 + " " + client.field336, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field577 == null) {
                    arg1.method3245(class142.field2388, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3245(class142.field2305, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field128.getGraphics();
            Statics.field574.method1324(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field128.repaint();
        }
    }

    @ObfuscatedName("k.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method469(String arg0, String arg1, String arg2) {
        field675 = arg0;
        field676 = arg1;
        field677 = arg2;
    }

    @ObfuscatedName("af.s(Lbi;B)V")
    public static final void method572(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field652.length; var2++) {
            Statics.field652[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field652[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field188[var8] = (Statics.field652[var8 - 1] + Statics.field652[var8 + 1] + Statics.field652[var8 - 128] + Statics.field652[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field652;
            Statics.field652 = Statics.field188;
            Statics.field188 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1324; var11++) {
            for (int var12 = 0; var12 < arg0.field1328; var12++) {
                if (arg0.field1327[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1323;
                    int var14 = var11 + 16 + arg0.field1326;
                    int var15 = (var14 << 7) + var13;
                    Statics.field652[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ak.f(II)V")
    public static final void method584(int arg0) {
        short var1 = 256;
        field664 += arg0 * 128;
        if (field664 > Statics.field652.length) {
            field664 -= Statics.field652.length;
            int var2 = (int) (Math.random() * 12.0D);
            method572(Statics.field658[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field639[var3 + var4] - Statics.field652[field664 + var3 & Statics.field652.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field639[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field639[var9 + var10] = 255;
                } else {
                    Statics.field639[var9 + var10] = 0;
                }
            }
        }
        if (field666 > 0) {
            field666 -= arg0 * 4;
        }
        if (field667 > 0) {
            field667 -= arg0 * 4;
        }
        if (field666 == 0 && field667 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field666 = 1024;
            }
            if (var12 == 1) {
                field667 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field665[var13] = field665[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field665[var14] = (int) (Math.sin((double) field683 / 14.0D) * 16.0D + Math.sin((double) field683 / 15.0D) * 14.0D + Math.sin((double) field683 / 16.0D) * 12.0D);
            field683++;
        }
        field674 += arg0 * -1946793125;
        int var15 = ((client.field318 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field674 * -1849916820; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field639[(var18 << 7) + var17] = 192;
        }
        field674 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field639[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field639[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field603[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field603[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field603[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field639[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dz.h(Lea;I)V")
    public static void method2343(class131 arg0) {
        if (class127.field2009 != 1 && Statics.field1666 || class127.field2009 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2010 >= var1 && class127.field2010 <= var1 + 14 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(0, 0);
            return;
        }
        if (class127.field2010 >= var1 + 15 && class127.field2010 <= var1 + 80 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2010 >= var2 && class127.field2010 <= var2 + 14 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(1, 0);
            return;
        }
        if (class127.field2010 >= var2 + 15 && class127.field2010 <= var2 + 80 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2010 >= var3 && class127.field2010 <= var3 + 14 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(2, 0);
            return;
        }
        if (class127.field2010 >= var3 + 15 && class127.field2010 <= var3 + 80 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2010 >= var4 && class127.field2010 <= var4 + 14 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(3, 0);
            return;
        }
        if (class127.field2010 >= var4 + 15 && class127.field2010 <= var4 + 80 && class127.field2011 >= 4 && class127.field2011 <= 18) {
            method524(3, 1);
            return;
        }
        if (class127.field2010 >= 708 && class127.field2011 >= 4 && class127.field2010 <= 758 && class127.field2011 <= 20) {
            field686 = false;
            Statics.field1817.method1413(0, 0);
            Statics.field661.method1413(382, 0);
            Statics.field660.method1544(382 - Statics.field660.field1328 / 2, 18);
            return;
        }
        if (field692 == -1) {
            return;
        }
        class22 var5 = Statics.field689[field692];
        method1731(var5);
        field686 = false;
        Statics.field1817.method1413(0, 0);
        Statics.field661.method1413(382, 0);
        Statics.field660.method1544(382 - Statics.field660.field1328 / 2, 18);
        return;
    }

    @ObfuscatedName("cw.a(Lt;I)V")
    public static void method1731(class22 arg0) {
        if (arg0.method497() != client.field501) {
            client.field501 = arg0.method497();
            boolean var1 = arg0.method497();
            if (Statics.field1051 != var1) {
                class45.method1387();
                Statics.field1051 = var1;
            }
        }
        Statics.field2096 = arg0.field590;
        client.field336 = arg0.field583;
        client.field267 = arg0.field581;
        Statics.field115 = client.field269 == 0 ? 43594 : arg0.field583 + 40000;
        Statics.field2073 = client.field269 == 0 ? 443 : arg0.field583 + 50000;
        Statics.field912 = Statics.field115;
    }

    @ObfuscatedName("n.u(I)V")
    public static void method149() {
        try {
            if (Statics.field577 == null) {
                Statics.field577 = new class17(Statics.field1450, new URL(Statics.field241));
            } else {
                byte[] var0 = Statics.field577.method152();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field662 = var1.method2232();
                    Statics.field689 = new class22[field662];
                    int var2 = 0;
                    while (var2 < field662) {
                        class22 var3 = Statics.field689[var2] = new class22();
                        var3.field583 = var1.method2232();
                        var3.field581 = var1.method2207();
                        var3.field590 = var1.method2073();
                        var3.field586 = var1.method2073();
                        var3.field585 = var1.method2123();
                        var3.field582 = var1.method2068();
                        var3.field589 = var2++;
                    }
                    method2(Statics.field689, 0, Statics.field689.length - 1, field695, field687);
                    field686 = true;
                    Statics.field577 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field577 = null;
        }
    }

    @ObfuscatedName("m.v(IIB)V")
    public static void method524(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field695[var5] != arg0) {
                var2[var4] = field695[var5];
                var3[var4] = field687[var5];
                var4++;
            }
        }
        field695 = var2;
        field687 = var3;
        method2(Statics.field689, 0, Statics.field689.length - 1, field695, field687);
    }

    @ObfuscatedName("e.i([Lt;II[I[IS)V")
    public static void method2(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field589;
                        var12 = var8.field589;
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
                        var11 = arg0[var6].method497() ? 1 : 0;
                        var12 = var8.method497() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field583;
                        var12 = var8.field583;
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
                        var15 = arg0[var5].field589;
                        var16 = var8.field589;
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
                        var15 = arg0[var5].method497() ? 1 : 0;
                        var16 = var8.method497() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field583;
                        var16 = var8.field583;
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
        method2(arg0, arg1, var6, arg3, arg4);
        method2(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
