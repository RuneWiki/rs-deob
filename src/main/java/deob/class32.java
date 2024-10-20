package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("aq")
public class class32 {

    @ObfuscatedName("aq.q")
    public static int field695 = 0;

    @ObfuscatedName("aq.p")
    public static int field727 = field695 + 202;

    @ObfuscatedName("aq.t")
    public static int[] field704 = new int[256];

    @ObfuscatedName("aq.x")
    public static int field706 = 0;

    @ObfuscatedName("aq.y")
    public static int field707 = 0;

    @ObfuscatedName("aq.ab")
    public static int field709 = 0;

    @ObfuscatedName("aq.al")
    public static int field713 = 0;

    @ObfuscatedName("aq.ay")
    public static int field731 = 0;

    @ObfuscatedName("aq.aq")
    public static int field708 = 0;

    @ObfuscatedName("aq.ac")
    public static int field712 = 10;

    @ObfuscatedName("aq.ak")
    public static String field714 = "";

    @ObfuscatedName("aq.am")
    public static int field715 = 0;

    @ObfuscatedName("aq.aj")
    public static String field716 = "";

    @ObfuscatedName("aq.au")
    public static String field717 = "";

    @ObfuscatedName("aq.av")
    public static String field710 = "";

    @ObfuscatedName("aq.ad")
    public static String field719 = "";

    @ObfuscatedName("aq.ae")
    public static String field720 = "";

    @ObfuscatedName("aq.ai")
    public static class159 field721 = class159.field2587;

    @ObfuscatedName("aq.ao")
    public static boolean field718 = true;

    @ObfuscatedName("aq.aa")
    public static int field724 = 0;

    @ObfuscatedName("aq.ax")
    public static String field725 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aq.as")
    public static String field726 = "1234567890";

    @ObfuscatedName("aq.ap")
    public static boolean field694 = false;

    @ObfuscatedName("aq.bw")
    public static int field728 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.z(I)I")
    public static int method164() {
        return 9;
    }

    @ObfuscatedName("ca.q(Ljava/awt/Component;Lfl;Lfl;ZII)V")
    public static void method1968(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field703) {
            field715 = arg4;
            class80.method1639();
            byte[] var5 = arg1.method3003("title.jpg", "");
            Statics.field699 = new class79(var5, arg0);
            Statics.field701 = Statics.field699.method1541();
            if ((client.field480 & 0x20000000) == 0) {
                Statics.field571 = class77.method616(arg2, "logo", "");
            } else {
                Statics.field571 = class77.method616(arg2, "logo_deadman_mode", "");
            }
            Statics.field696 = class77.method616(arg2, "titlebox", "");
            Statics.field700 = class77.method616(arg2, "titlebutton", "");
            Statics.field698 = class77.method3119(arg2, "runes", "");
            Statics.field711 = class77.method3119(arg2, "title_mute", "");
            Statics.field2883 = class77.method616(arg2, "options_radio_buttons,0", "");
            Statics.field702 = class77.method616(arg2, "options_radio_buttons,2", "");
            Statics.field705 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field705[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field705[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field705[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field705[var9 + 192] = 16777215;
            }
            Statics.field3131 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3131[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3131[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3131[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field3131[var13 + 192] = 16777215;
            }
            Statics.field61 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field61[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field61[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field61[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field61[var17 + 192] = 16777215;
            }
            Statics.field575 = new int[256];
            Statics.field2143 = new int[32768];
            Statics.field1626 = new int[32768];
            method52((class81) null);
            Statics.field723 = new int[32768];
            Statics.field1086 = new int[32768];
            if (arg3) {
                field719 = "";
                field720 = "";
            }
            Statics.field158 = 0;
            Statics.field722 = "";
            field718 = true;
            field694 = false;
            if (Statics.field2026.field141) {
                class183.method2916(2);
            } else {
                class183.method50(2, Statics.field1608, "scape main", "", 255, false);
            }
            class171.method2901(false);
            Statics.field703 = true;
            field695 = (Statics.field2056 - client.field494) / 2;
            field727 = field695 + 202;
            Statics.field699.method1551(field695, 0);
            Statics.field701.method1551(field695 + 382, 0);
            Statics.field571.method1693(field695 + 382 - Statics.field571.field1417 / 2, 18);
        } else if (arg4 == 4) {
            field715 = 4;
        }
    }

    @ObfuscatedName("c.k(I)V")
    public static void method166() {
        if (!Statics.field703) {
            return;
        }
        Statics.field696 = null;
        Statics.field700 = null;
        Statics.field698 = null;
        Statics.field699 = null;
        Statics.field701 = null;
        Statics.field571 = null;
        Statics.field711 = null;
        Statics.field2883 = null;
        Statics.field702 = null;
        Statics.field2235 = null;
        Statics.field2639 = null;
        Statics.field165 = null;
        Statics.field208 = null;
        Statics.field101 = null;
        Statics.field705 = null;
        Statics.field3131 = null;
        Statics.field61 = null;
        Statics.field575 = null;
        Statics.field2143 = null;
        Statics.field1626 = null;
        Statics.field723 = null;
        Statics.field1086 = null;
        class183.method2916(2);
        class171.method2901(true);
        Statics.field703 = false;
    }

    @ObfuscatedName("y.f(Led;I)V")
    public static void method561(class144 arg0) {
        if (field694) {
            method161(arg0);
            return;
        }
        if ((class140.field2151 == 1 || !Statics.field215 && class140.field2151 == 4) && class140.field2154 >= field695 + 765 - 50 && class140.field2163 >= 453) {
            Statics.field2026.field141 = !Statics.field2026.field141;
            class9.method3591();
            if (Statics.field2026.field141) {
                Statics.field2943.method3302();
                class183.field2944 = 1;
                Statics.field2945 = null;
            } else {
                class183.method684(Statics.field1608, "scape main", "", 255, false);
            }
        }
        if (client.field288 == 5) {
            return;
        }
        field731++;
        if (client.field288 != 10 && client.field288 != 11) {
            return;
        }
        if (client.field456 == 0) {
            if (class140.field2151 == 1 || !Statics.field215 && class140.field2151 == 4) {
                int var1 = field695 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class140.field2154 >= var1 && class140.field2154 <= var1 + var3 && class140.field2163 >= var2 && class140.field2163 <= var2 + var4) {
                    if (class26.method2762()) {
                        field694 = true;
                    }
                    return;
                }
            }
            if (Statics.field622 != null && class26.method2762()) {
                field694 = true;
            }
        }
        int var5 = class140.field2151;
        int var6 = class140.field2154;
        int var7 = class140.field2163;
        if (!Statics.field215 && var5 == 4) {
            var5 = 1;
        }
        if (field715 == 0) {
            int var8 = field727 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class138.method2096(client.method2099("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field727 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field480 & 0x4) != 0) {
                    if ((client.field480 & 0x400) == 0) {
                        field716 = class157.field2521;
                        field717 = class157.field2561;
                        field710 = class157.field2523;
                    } else {
                        field716 = class157.field2317;
                        field717 = class157.field2310;
                        field710 = class157.field2529;
                    }
                    field715 = 1;
                    field724 = 0;
                } else if ((client.field480 & 0x400) == 0) {
                    field716 = class157.field2517;
                    field717 = class157.field2518;
                    field710 = class157.field2437;
                    field715 = 2;
                    field724 = 0;
                } else {
                    field716 = class157.field2524;
                    field717 = class157.field2525;
                    field710 = class157.field2526;
                    field715 = 1;
                    field724 = 0;
                }
            }
        } else if (field715 == 1) {
            while (Statics.method601()) {
                if (Statics.field2288 == 84) {
                    field716 = class157.field2517;
                    field717 = class157.field2518;
                    field710 = class157.field2437;
                    field715 = 2;
                    field724 = 0;
                } else if (Statics.field2288 == 13) {
                    field715 = 0;
                }
            }
            int var11 = field727 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field716 = class157.field2517;
                field717 = class157.field2518;
                field710 = class157.field2437;
                field715 = 2;
                field724 = 0;
            }
            int var13 = field727 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field715 = 0;
            }
        } else if (field715 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field724 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field724 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method163(class157.field2548, class157.field2447, class157.field2550);
                field715 = 5;
                return;
            }
            int var16 = field727 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field719 = field719.trim();
                if (field719.length() == 0) {
                    method163(class157.field2423, class157.field2363, class157.field2380);
                    return;
                }
                if (field720.length() == 0) {
                    method163(class157.field2342, class157.field2427, class157.field2428);
                    return;
                }
                method163(class157.field2350, class157.field2514, class157.field2443);
                field721 = Statics.field2026.field145.containsKey(class163.method1890(field719)) ? class159.field2591 : class159.field2587;
                client.method162(20);
                return;
            }
            int var18 = field727 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field715 = 0;
                field719 = "";
                field720 = "";
                Statics.field158 = 0;
                Statics.field722 = "";
                field718 = true;
            }
            while (true) {
                while (Statics.method601()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field725.length(); var20++) {
                        if (Statics.field730 == field725.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field2288 == 13) {
                        field715 = 0;
                        field719 = "";
                        field720 = "";
                        Statics.field158 = 0;
                        Statics.field722 = "";
                        field718 = true;
                    } else if (field724 == 0) {
                        if (Statics.field2288 == 85 && field719.length() > 0) {
                            field719 = field719.substring(0, field719.length() - 1);
                        }
                        if (Statics.field2288 == 84 || Statics.field2288 == 80) {
                            field724 = 1;
                        }
                        if (var19 && field719.length() < 320) {
                            field719 = field719 + Statics.field730;
                        }
                    } else if (field724 == 1) {
                        if (Statics.field2288 == 85 && field720.length() > 0) {
                            field720 = field720.substring(0, field720.length() - 1);
                        }
                        if (Statics.field2288 == 84 || Statics.field2288 == 80) {
                            field724 = 0;
                        }
                        if (Statics.field2288 == 84) {
                            field719 = field719.trim();
                            if (field719.length() == 0) {
                                method163(class157.field2423, class157.field2363, class157.field2380);
                                return;
                            }
                            if (field720.length() == 0) {
                                method163(class157.field2342, class157.field2427, class157.field2428);
                                return;
                            }
                            method163(class157.field2350, class157.field2514, class157.field2443);
                            field721 = Statics.field2026.field145.containsKey(class163.method1890(field719)) ? class159.field2591 : class159.field2587;
                            client.method162(20);
                            return;
                        }
                        if (var19 && field720.length() < 20) {
                            field720 = field720 + Statics.field730;
                        }
                    }
                }
                return;
            }
        } else if (field715 == 4) {
            int var21 = field727 + 180 - 80;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field722.trim();
                if (Statics.field722.length() != 6) {
                    method163(class157.field2354, class157.field2340, class157.field2341);
                    return;
                }
                Statics.field158 = Integer.parseInt(Statics.field722);
                Statics.field722 = "";
                field721 = field718 ? class159.field2586 : class159.field2588;
                method163(class157.field2350, class157.field2514, class157.field2443);
                client.method162(20);
                return;
            }
            if (var5 == 1 && var6 >= field727 + 180 - 9 && var6 <= field727 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field718 = !field718;
            }
            if (var5 == 1 && var6 >= field727 + 180 - 34 && var6 <= field727 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class138.method2096(client.method2099("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var23 = field727 + 180 + 80;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field715 = 0;
                field719 = "";
                field720 = "";
                Statics.field158 = 0;
                Statics.field722 = "";
            }
            while (Statics.method601()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field726.length(); var25++) {
                    if (Statics.field730 == field726.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field2288 == 13) {
                    field715 = 0;
                    field719 = "";
                    field720 = "";
                    Statics.field158 = 0;
                    Statics.field722 = "";
                } else {
                    if (Statics.field2288 == 85 && Statics.field722.length() > 0) {
                        Statics.field722 = Statics.field722.substring(0, Statics.field722.length() - 1);
                    }
                    if (Statics.field2288 == 84) {
                        Statics.field722.trim();
                        if (Statics.field722.length() != 6) {
                            method163(class157.field2354, class157.field2340, class157.field2341);
                            return;
                        }
                        Statics.field158 = Integer.parseInt(Statics.field722);
                        Statics.field722 = "";
                        field721 = field718 ? class159.field2586 : class159.field2588;
                        method163(class157.field2350, class157.field2514, class157.field2443);
                        client.method162(20);
                        return;
                    }
                    if (var24 && Statics.field722.length() < 6) {
                        Statics.field722 = Statics.field722 + Statics.field730;
                    }
                }
            }
        } else if (field715 == 5) {
            int var26 = field727 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method900();
                return;
            }
            int var28 = field727 + 180 + 80;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field716 = class157.field2517;
                field717 = class157.field2518;
                field710 = class157.field2437;
                field715 = 2;
                field724 = 0;
                field720 = "";
            }
            while (Statics.method601()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field725.length(); var30++) {
                    if (Statics.field730 == field725.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field2288 == 13) {
                    field716 = class157.field2517;
                    field717 = class157.field2518;
                    field710 = class157.field2437;
                    field715 = 2;
                    field724 = 0;
                    field720 = "";
                } else {
                    if (Statics.field2288 == 85 && field719.length() > 0) {
                        field719 = field719.substring(0, field719.length() - 1);
                    }
                    if (Statics.field2288 == 84) {
                        method900();
                        return;
                    }
                    if (var29 && field719.length() < 320) {
                        field719 = field719 + Statics.field730;
                    }
                }
            }
        } else if (field715 == 6) {
            while (true) {
                do {
                    if (!Statics.method601()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field716 = class157.field2517;
                            field717 = class157.field2518;
                            field710 = class157.field2437;
                            field715 = 2;
                            field724 = 0;
                            field720 = "";
                        }
                        return;
                    }
                } while (Statics.field2288 != 84 && Statics.field2288 != 13);
                field716 = class157.field2517;
                field717 = class157.field2518;
                field710 = class157.field2437;
                field715 = 2;
                field724 = 0;
                field720 = "";
            }
        }
    }

    @ObfuscatedName("aa.d(B)V")
    public static void method900() {
        field719 = field719.trim();
        if (field719.length() == 0) {
            method163(class157.field2548, class157.field2447, class157.field2550);
            return;
        }
        long var0 = class10.method698();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method168(var0, field719);
        }
        switch(var2) {
            case 2:
                method163(class157.field2471, class157.field2552, class157.field2553);
                field715 = 6;
                break;
            case 3:
                method163(class157.field2420, class157.field2555, class157.field2527);
                break;
            case 4:
                method163(class157.field2455, class157.field2558, class157.field2466);
                break;
            case 5:
                method163(class157.field2560, class157.field2498, class157.field2562);
                break;
            case 6:
                method163(class157.field2563, class157.field2564, class157.field2565);
                break;
            case 7:
                method163(class157.field2566, class157.field2567, class157.field2441);
        }
    }

    @ObfuscatedName("fm.l(Lhi;Lhi;Lhi;ZI)V")
    public static void method3174(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field695 = (Statics.field2056 - client.field494) / 2;
            field727 = field695 + 202;
        }
        if (field694) {
            if (Statics.field2235 == null) {
                Statics.field2235 = class77.method106(Statics.field2723, "sl_back", "");
            }
            if (Statics.field2639 == null) {
                Statics.field2639 = class77.method3119(Statics.field2723, "sl_flags", "");
            }
            if (Statics.field165 == null) {
                Statics.field165 = class77.method3119(Statics.field2723, "sl_arrows", "");
            }
            if (Statics.field208 == null) {
                Statics.field208 = class77.method3119(Statics.field2723, "sl_stars", "");
            }
            class80.method1640(field695, 23, 765, 480, 0);
            class80.method1637(field695, 0, 125, 23, 12425273, 9135624);
            class80.method1637(field695 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3692(class157.field2442, field695 + 62, 15, 0, -1);
            if (Statics.field208 != null) {
                Statics.field208[1].method1693(field695 + 140, 1);
                arg1.method3683(class157.field2396, field695 + 152, 10, 16777215, -1);
                Statics.field208[0].method1693(field695 + 140, 12);
                arg1.method3683(class157.field2571, field695 + 152, 21, 16777215, -1);
            }
            if (Statics.field165 != null) {
                int var4 = field695 + 280;
                if (class26.field630[0] == 0 && class26.field629[0] == 0) {
                    Statics.field165[2].method1693(var4, 4);
                } else {
                    Statics.field165[0].method1693(var4, 4);
                }
                if (class26.field630[0] == 0 && class26.field629[0] == 1) {
                    Statics.field165[3].method1693(var4 + 15, 4);
                } else {
                    Statics.field165[1].method1693(var4 + 15, 4);
                }
                arg0.method3683(class157.field2572, var4 + 32, 17, 16777215, -1);
                int var5 = field695 + 390;
                if (class26.field630[0] == 1 && class26.field629[0] == 0) {
                    Statics.field165[2].method1693(var5, 4);
                } else {
                    Statics.field165[0].method1693(var5, 4);
                }
                if (class26.field630[0] == 1 && class26.field629[0] == 1) {
                    Statics.field165[3].method1693(var5 + 15, 4);
                } else {
                    Statics.field165[1].method1693(var5 + 15, 4);
                }
                arg0.method3683(class157.field2351, var5 + 32, 17, 16777215, -1);
                int var6 = field695 + 500;
                if (class26.field630[0] == 2 && class26.field629[0] == 0) {
                    Statics.field165[2].method1693(var6, 4);
                } else {
                    Statics.field165[0].method1693(var6, 4);
                }
                if (class26.field630[0] == 2 && class26.field629[0] == 1) {
                    Statics.field165[3].method1693(var6 + 15, 4);
                } else {
                    Statics.field165[1].method1693(var6 + 15, 4);
                }
                arg0.method3683(class157.field2574, var6 + 32, 17, 16777215, -1);
                int var7 = field695 + 610;
                if (class26.field630[0] == 3 && class26.field629[0] == 0) {
                    Statics.field165[2].method1693(var7, 4);
                } else {
                    Statics.field165[0].method1693(var7, 4);
                }
                if (class26.field630[0] == 3 && class26.field629[0] == 1) {
                    Statics.field165[3].method1693(var7 + 15, 4);
                } else {
                    Statics.field165[1].method1693(var7 + 15, 4);
                }
                arg0.method3683(class157.field2575, var7 + 32, 17, 16777215, -1);
            }
            class80.method1640(field695 + 708, 4, 50, 16, 0);
            arg1.method3692(class157.field2542, field695 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field480 & var9;
            for (int var11 = 0; var11 < class26.field627; var11++) {
                class26 var12 = Statics.field626[var11];
                if ((var12.field638 & var9) == var10 || (var12.field638 & var9) == 0) {
                    var8++;
                }
            }
            field728 = -1;
            if (Statics.field2235 != null) {
                byte var13 = 88;
                byte var14 = 19;
                int var15 = 765 / (var13 + 1);
                int var16 = 480 / (var14 + 1);
                int var17;
                int var18;
                do {
                    var17 = var16;
                    var18 = var15;
                    if ((var15 - 1) * var16 >= var8) {
                        var15--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                } while (var16 != var17 || var15 != var18);
                int var19 = (765 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (480 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (765 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = (480 - var14 * var16 - (var16 - 1) * var20) / 2;
                int var23 = var22 + 23;
                int var24 = field695 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field627; var27++) {
                    class26 var28 = Statics.field626[var27];
                    if ((var28.field638 & var9) == var10 || (var28.field638 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field628);
                        if (var28.field628 == -1) {
                            var30 = class157.field2576;
                            var29 = false;
                        } else if (var28.field628 > 1980) {
                            var30 = class157.field2577;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method594()) {
                            if (var28.method591()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method591()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class140.field2152 >= var24 && class140.field2156 * 121255813 >= var23 && class140.field2152 < var13 + var24 && class140.field2156 * 121255813 < var14 + var23 && var29) {
                            field728 = var27;
                            Statics.field2235[var31].method1557(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field2235[var31].method1551(var24, var23);
                        }
                        if (Statics.field2639 != null) {
                            Statics.field2639[(var28.method591() ? 8 : 0) + var28.field637].method1693(var24 + 29, var23);
                        }
                        arg0.method3692(Integer.toString(var28.field632), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3692(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
                        var23 += var14 + var20;
                        var25++;
                        if (var25 >= var16) {
                            var23 = var22 + 23;
                            var24 += var13 + var19;
                            var25 = 0;
                        }
                    }
                }
                if (var26) {
                    int var32 = arg1.method3724(Statics.field626[field728].field636) + 6;
                    int var33 = arg1.field3176 + 8;
                    class80.method1640(class140.field2152 - var32 / 2, class140.field2156 * 121255813 + 20 + 5, var32, var33, 16777120);
                    class80.method1638(class140.field2152 - var32 / 2, class140.field2156 * 121255813 + 20 + 5, var32, var33, 0);
                    arg1.method3692(Statics.field626[field728].field636, class140.field2152, class140.field2156 * 121255813 + 20 + 5 + arg1.field3176 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field147.getGraphics();
                Statics.field2003.method1490(var34, 0, 0);
            } catch (Exception var78) {
                Statics.field147.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field699.method1551(field695, 0);
            Statics.field701.method1551(field695 + 382, 0);
            Statics.field571.method1693(field695 + 382 - Statics.field571.field1417 / 2, 18);
        }
        if (client.field288 == 0 || client.field288 == 5) {
            byte var36 = 20;
            arg0.method3692(class157.field2516, field727 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class80.method1638(field727 + 180 - 152, var37, 304, 34, 9179409);
            class80.method1638(field727 + 180 - 151, var37 + 1, 302, 32, 0);
            class80.method1640(field727 + 180 - 150, var37 + 2, field712 * 3, 30, 9179409);
            class80.method1640(field712 * 3 + (field727 + 180 - 150), var37 + 2, 300 - field712 * 3, 30, 0);
            arg0.method3692(field714, field727 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field288 == 20) {
            Statics.field696.method1693(field727 + 180 - Statics.field696.field1417 / 2, 271 - Statics.field696.field1422 / 2);
            short var38 = 211;
            arg0.method3692(field716, field727 + 180, var38, 16776960, 0);
            int var80 = var38 + 15;
            arg0.method3692(field717, field727 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            arg0.method3692(field710, field727 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            int var83 = var82 + 10;
            if (field715 != 4) {
                arg0.method3683(class157.field2535, field727 + 180 - 110, var83, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field719; arg0.method3724(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3683(class223.method3717(var40), field727 + 180 - 70, var83, 16777215, 0);
                var80 = var83 + 15;
                arg0.method3683(class157.field2536 + class163.method570(field720), field727 + 180 - 108, var80, 16777215, 0);
                var80 += 15;
            }
        }
        if (client.field288 == 10 || client.field288 == 11) {
            Statics.field696.method1693(field727, 171);
            if (field715 == 0) {
                short var41 = 251;
                arg0.method3692(class157.field2538, field727 + 180, var41, 16776960, 0);
                int var84 = var41 + 30;
                int var42 = field727 + 180 - 80;
                short var43 = 291;
                Statics.field700.method1693(var42 - 73, var43 - 20);
                arg0.method3730(class157.field2539, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field727 + 180 + 80;
                Statics.field700.method1693(var44 - 73, var43 - 20);
                arg0.method3730(class157.field2379, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field715 == 1) {
                arg0.method3692(class157.field2520, field727 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3692(field716, field727 + 180, var45, 16777215, 0);
                int var85 = var45 + 15;
                arg0.method3692(field717, field727 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                arg0.method3692(field710, field727 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                int var46 = field727 + 180 - 80;
                short var47 = 321;
                Statics.field700.method1693(var46 - 73, var47 - 20);
                arg0.method3692(class157.field2415, var46, var47 + 5, 16777215, 0);
                int var48 = field727 + 180 + 80;
                Statics.field700.method1693(var48 - 73, var47 - 20);
                arg0.method3692(class157.field2542, var48, var47 + 5, 16777215, 0);
            } else if (field715 == 2) {
                short var49 = 211;
                arg0.method3692(field716, field727 + 180, var49, 16776960, 0);
                int var88 = var49 + 15;
                arg0.method3692(field717, field727 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg0.method3692(field710, field727 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var91 = var90 + 10;
                arg0.method3683(class157.field2535, field727 + 180 - 110, var91, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field719; arg0.method3724(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3683(class223.method3717(var51) + (field724 == 0 & client.field290 % 40 < 20 ? class2.method968(16776960) + class2.field20 : ""), field727 + 180 - 70, var91, 16777215, 0);
                var88 = var91 + 15;
                arg0.method3683(class157.field2536 + class163.method570(field720) + (field724 == 1 & client.field290 % 40 < 20 ? class2.method968(16776960) + class2.field20 : ""), field727 + 180 - 108, var88, 16777215, 0);
                var88 += 15;
                int var52 = field727 + 180 - 80;
                short var53 = 321;
                Statics.field700.method1693(var52 - 73, var53 - 20);
                arg0.method3692(class157.field2541, var52, var53 + 5, 16777215, 0);
                int var54 = field727 + 180 + 80;
                Statics.field700.method1693(var54 - 73, var53 - 20);
                arg0.method3692(class157.field2542, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3692(class157.field2473, field727 + 180, var55, 16776960, 0);
            } else if (field715 == 4) {
                arg0.method3692(class157.field2530, field727 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3692(field716, field727 + 180, var56, 16777215, 0);
                int var92 = var56 + 15;
                arg0.method3692(field717, field727 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method3692(field710, field727 + 180, var93, 16777215, 0);
                int var94 = var93 + 15;
                arg0.method3683(class157.field2345 + class163.method570(Statics.field722) + (client.field290 % 40 < 20 ? class2.method968(16776960) + class2.field20 : ""), field727 + 180 - 108, var94, 16777215, 0);
                int var95 = var94 - 8;
                arg0.method3683(class157.field2313, field727 + 180 - 9, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method3683(class157.field2314, field727 + 180 - 9, var96, 16776960, 0);
                int var57 = field727 + 180 - 9 + arg0.method3724(class157.field2314) + 15;
                int var58 = var96 - arg0.field3176;
                class81 var59;
                if (field718) {
                    var59 = Statics.field702;
                } else {
                    var59 = Statics.field2883;
                }
                var59.method1693(var57, var58);
                var92 = var96 + 15;
                int var60 = field727 + 180 - 80;
                short var61 = 321;
                Statics.field700.method1693(var60 - 73, var61 - 20);
                arg0.method3692(class157.field2415, var60, var61 + 5, 16777215, 0);
                int var62 = field727 + 180 + 80;
                Statics.field700.method1693(var62 - 73, var61 - 20);
                arg0.method3692(class157.field2542, var62, var61 + 5, 16777215, 0);
                arg1.method3692(class157.field2531, field727 + 180, var61 + 36, 255, 0);
            } else if (field715 == 5) {
                arg0.method3692(class157.field2544, field727 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3692(field716, field727 + 180, var63, 16776960, 0);
                int var97 = var63 + 15;
                arg2.method3692(field717, field727 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg2.method3692(field710, field727 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                int var100 = var99 + 14;
                arg0.method3683(class157.field2481, field727 + 180 - 145, var100, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field719; arg0.method3724(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3683(class223.method3717(var65) + (client.field290 % 40 < 20 ? class2.method968(16776960) + class2.field20 : ""), field727 + 180 - 34, var100, 16777215, 0);
                var97 = var100 + 15;
                int var66 = field727 + 180 - 80;
                short var67 = 321;
                Statics.field700.method1693(var66 - 73, var67 - 20);
                arg0.method3692(class157.field2546, var66, var67 + 5, 16777215, 0);
                int var68 = field727 + 180 + 80;
                Statics.field700.method1693(var68 - 73, var67 - 20);
                arg0.method3692(class157.field2547, var68, var67 + 5, 16777215, 0);
            } else if (field715 == 6) {
                short var69 = 211;
                arg0.method3692(field716, field727 + 180, var69, 16776960, 0);
                int var101 = var69 + 15;
                arg0.method3692(field717, field727 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3692(field710, field727 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var70 = field727 + 180;
                short var71 = 321;
                Statics.field700.method1693(var70 - 73, var71 - 20);
                arg0.method3692(class157.field2547, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field731 > 0) {
            method2245(field731);
            field731 = 0;
        }
        method3229();
        Statics.field711[Statics.field2026.field141 ? 1 : 0].method1693(field695 + 765 - 40, 463);
        if (client.field288 > 5 && client.field456 == 0) {
            if (Statics.field101 == null) {
                Statics.field101 = class77.method616(Statics.field2723, "sl_button", "");
            } else {
                int var72 = field695 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field101.method1693(var72, var73);
                arg0.method3692(class157.field2367 + " " + client.field524, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field622 == null) {
                    arg1.method3692(class157.field2579, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3692(class157.field2578, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field147.getGraphics();
            Statics.field2003.method1490(var76, 0, 0);
        } catch (Exception var79) {
            Statics.field147.repaint();
        }
    }

    @ObfuscatedName("b.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method163(String arg0, String arg1, String arg2) {
        field716 = arg0;
        field717 = arg1;
        field710 = arg2;
    }

    @ObfuscatedName("d.g(Lcl;I)V")
    public static final void method52(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2143.length; var2++) {
            Statics.field2143[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2143[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1626[var8] = (Statics.field2143[var8 - 1] + Statics.field2143[var8 + 1] + Statics.field2143[var8 - 128] + Statics.field2143[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2143;
            Statics.field2143 = Statics.field1626;
            Statics.field1626 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1422; var11++) {
            for (int var12 = 0; var12 < arg0.field1417; var12++) {
                if (arg0.field1419[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1421;
                    int var14 = var11 + 16 + arg0.field1424;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2143[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("de.h(IB)V")
    public static final void method2245(int arg0) {
        short var1 = 256;
        field709 += arg0 * 128;
        if (field709 > Statics.field2143.length) {
            field709 -= Statics.field2143.length;
            int var2 = (int) (Math.random() * 12.0D);
            method52(Statics.field698[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field723[var3 + var4] - Statics.field2143[field709 + var3 & Statics.field2143.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field723[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field723[var9 + var10] = 255;
                } else {
                    Statics.field723[var9 + var10] = 0;
                }
            }
        }
        if (field706 > 0) {
            field706 -= arg0 * 4;
        }
        if (field707 > 0) {
            field707 -= arg0 * 4;
        }
        if (field706 == 0 && field707 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field706 = 1024;
            }
            if (var12 == 1) {
                field707 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field704[var13] = field704[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field704[var14] = (int) (Math.sin((double) field708 / 14.0D) * 16.0D + Math.sin((double) field708 / 15.0D) * 14.0D + Math.sin((double) field708 / 16.0D) * 12.0D);
            field708++;
        }
        field713 += arg0 * 1654316813;
        int var15 = ((client.field290 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field713 * -531166988; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field723[(var18 << 7) + var17] = 192;
        }
        field713 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field723[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field723[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1086[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1086[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1086[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field723[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("df.n(IIII)I")
    public static final int method2178(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fp.j(I)V")
    public static final void method3229() {
        short var0 = 256;
        if (field706 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field706 > 768) {
                    Statics.field575[var1] = method2178(Statics.field705[var1], Statics.field3131[var1], 1024 - field706);
                } else if (field706 > 256) {
                    Statics.field575[var1] = Statics.field3131[var1];
                } else {
                    Statics.field575[var1] = method2178(Statics.field3131[var1], Statics.field705[var1], 256 - field706);
                }
            }
        } else if (field707 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field707 > 768) {
                    Statics.field575[var2] = method2178(Statics.field705[var2], Statics.field61[var2], 1024 - field707);
                } else if (field707 > 256) {
                    Statics.field575[var2] = Statics.field61[var2];
                } else {
                    Statics.field575[var2] = method2178(Statics.field61[var2], Statics.field705[var2], 256 - field707);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field575[var3] = Statics.field705[var3];
            }
        }
        class80.method1635(field695, 9, field695 + 128, var0 + 7);
        Statics.field699.method1551(field695, 0);
        class80.method1665();
        int var4 = 0;
        int var5 = field695 + Statics.field2003.field1397 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field704[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field723[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field575[var10];
                    int var14 = Statics.field2003.field1391[var5];
                    Statics.field2003.field1391[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field2003.field1397 + var8 - 128;
        }
        class80.method1635(field695 + 765 - 128, 9, field695 + 765, var0 + 7);
        Statics.field701.method1551(field695 + 382, 0);
        class80.method1665();
        int var15 = 0;
        int var16 = field695 + Statics.field2003.field1397 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field704[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field723[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field575[var22];
                    int var26 = Statics.field2003.field1391[var20];
                    Statics.field2003.field1391[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2003.field1397 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("a.a(Led;B)V")
    public static void method161(class144 arg0) {
        if (class140.field2151 != 1 && Statics.field215 || class140.field2151 != 4) {
            return;
        }
        int var1 = field695 + 280;
        if (class140.field2154 >= var1 && class140.field2154 <= var1 + 14 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(0, 0);
            return;
        }
        if (class140.field2154 >= var1 + 15 && class140.field2154 <= var1 + 80 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(0, 1);
            return;
        }
        int var2 = field695 + 390;
        if (class140.field2154 >= var2 && class140.field2154 <= var2 + 14 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(1, 0);
            return;
        }
        if (class140.field2154 >= var2 + 15 && class140.field2154 <= var2 + 80 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(1, 1);
            return;
        }
        int var3 = field695 + 500;
        if (class140.field2154 >= var3 && class140.field2154 <= var3 + 14 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(2, 0);
            return;
        }
        if (class140.field2154 >= var3 + 15 && class140.field2154 <= var3 + 80 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(2, 1);
            return;
        }
        int var4 = field695 + 610;
        if (class140.field2154 >= var4 && class140.field2154 <= var4 + 14 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(3, 0);
            return;
        }
        if (class140.field2154 >= var4 + 15 && class140.field2154 <= var4 + 80 && class140.field2163 >= 4 && class140.field2163 <= 18) {
            class26.method13(3, 1);
            return;
        }
        if (class140.field2154 >= field695 + 708 && class140.field2163 >= 4 && class140.field2154 <= field695 + 708 + 50 && class140.field2163 <= 20) {
            field694 = false;
            Statics.field699.method1551(field695, 0);
            Statics.field701.method1551(field695 + 382, 0);
            Statics.field571.method1693(field695 + 382 - Statics.field571.field1417 / 2, 18);
            return;
        }
        if (field728 == -1) {
            return;
        }
        class26 var5 = Statics.field626[field728];
        method2892(var5);
        field694 = false;
        Statics.field699.method1551(field695, 0);
        Statics.field701.method1551(field695 + 382, 0);
        Statics.field571.method1693(field695 + 382 - Statics.field571.field1417 / 2, 18);
        return;
    }

    @ObfuscatedName("ei.b(Lo;I)V")
    public static void method2892(class26 arg0) {
        if (arg0.method591() != client.field536) {
            client.field536 = arg0.method591();
            class52.method1533(arg0.method591());
        }
        Statics.field1552 = arg0.field635;
        client.field524 = arg0.field632;
        client.field480 = arg0.field638;
        Statics.field2157 = client.field468 == 0 ? 43594 : arg0.field632 + 40000;
        Statics.field2043 = client.field468 == 0 ? 443 : arg0.field632 + 50000;
        Statics.field262 = Statics.field2157;
    }
}
