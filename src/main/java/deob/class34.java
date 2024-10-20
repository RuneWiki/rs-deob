package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ak")
public class class34 {

    @ObfuscatedName("ak.g")
    public static int field742 = 0;

    @ObfuscatedName("ak.d")
    public static int field778 = field742 + 202;

    @ObfuscatedName("ak.z")
    public static int[] field743 = new int[256];

    @ObfuscatedName("ak.t")
    public static int field750 = 0;

    @ObfuscatedName("ak.y")
    public static int field753 = 0;

    @ObfuscatedName("ak.ac")
    public static int field754 = 0;

    @ObfuscatedName("ak.ah")
    public static int field760 = 0;

    @ObfuscatedName("ak.am")
    public static int field776 = 0;

    @ObfuscatedName("ak.aq")
    public static int field757 = 0;

    @ObfuscatedName("ak.az")
    public static int field758 = 10;

    @ObfuscatedName("ak.ak")
    public static String field759 = "";

    @ObfuscatedName("ak.ag")
    public static int field762 = 0;

    @ObfuscatedName("ak.af")
    public static String field741 = "";

    @ObfuscatedName("ak.ab")
    public static String field749 = "";

    @ObfuscatedName("ak.ap")
    public static String field763 = "";

    @ObfuscatedName("ak.ao")
    public static String field756 = "";

    @ObfuscatedName("ak.ay")
    public static String field765 = "";

    @ObfuscatedName("ak.ai")
    public static String field766 = "";

    @ObfuscatedName("ak.aj")
    public static class163 field767 = class163.field2662;

    @ObfuscatedName("ak.at")
    public static boolean field769 = true;

    @ObfuscatedName("ak.av")
    public static int field770 = 0;

    @ObfuscatedName("ak.aw")
    public static String field771 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ak.au")
    public static String field772 = "1234567890";

    @ObfuscatedName("ak.al")
    public static boolean field773 = false;

    @ObfuscatedName("ak.bt")
    public static int field744 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ho.l(Lfp;Lfp;I)I")
    public static int method3881(class171 arg0, class171 arg1) {
        int var2 = 0;
        if (arg0.method3212("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3212("logo", "")) {
            var2++;
        }
        if (arg1.method3212("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3212("titlebox", "")) {
            var2++;
        }
        if (arg1.method3212("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3212("runes", "")) {
            var2++;
        }
        if (arg1.method3212("title_mute", "")) {
            var2++;
        }
        if (arg1.method3213("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3213("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3212("sl_back", "");
        arg1.method3212("sl_flags", "");
        arg1.method3212("sl_arrows", "");
        arg1.method3212("sl_stars", "");
        arg1.method3212("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bl.g(I)I")
    public static int method1619() {
        return 9;
    }

    @ObfuscatedName("eg.r(Ljava/awt/Component;Lfp;Lfp;ZII)V")
    public static void method2925(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field755) {
            field762 = arg4;
            class83.method1788();
            byte[] var5 = arg1.method3211("title.jpg", "");
            Statics.field746 = new class82(var5, arg0);
            Statics.field747 = Statics.field746.method1697();
            if ((client.field562 & 0x20000000) == 0) {
                Statics.field1848 = class80.method2861(arg2, "logo", "");
            } else {
                Statics.field1848 = class80.method2861(arg2, "logo_deadman_mode", "");
            }
            Statics.field761 = class80.method2861(arg2, "titlebox", "");
            Statics.field764 = class80.method2861(arg2, "titlebutton", "");
            Statics.field745 = class80.method752(arg2, "runes", "");
            Statics.field748 = class80.method752(arg2, "title_mute", "");
            Statics.field1076 = class80.method2861(arg2, "options_radio_buttons,0", "");
            Statics.field597 = class80.method2861(arg2, "options_radio_buttons,2", "");
            Statics.field2311 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2311[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2311[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2311[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2311[var9 + 192] = 16777215;
            }
            Statics.field270 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field270[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field270[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field270[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field270[var13 + 192] = 16777215;
            }
            Statics.field751 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field751[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field751[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field751[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field751[var17 + 192] = 16777215;
            }
            Statics.field2142 = new int[256];
            Statics.field650 = new int[32768];
            Statics.field2227 = new int[32768];
            method973((class84) null);
            Statics.field700 = new int[32768];
            Statics.field2971 = new int[32768];
            if (arg3) {
                field765 = "";
                field766 = "";
            }
            Statics.field2789 = 0;
            Statics.field768 = "";
            field769 = true;
            field773 = false;
            if (Statics.field2124.field149) {
                class187.method740(2);
            } else {
                class172 var18 = Statics.field3052;
                int var19 = var18.method3209("scape main");
                int var20 = var18.method3258(var19, "");
                class187.method3173(2, var18, var19, var20, 255, false);
            }
            class175.method3117(false);
            Statics.field755 = true;
            field742 = (Statics.field3057 - client.field509 * 765) / 2;
            field778 = field742 + 202;
            Statics.field746.method1754(field742, 0);
            Statics.field747.method1754(field742 + 382, 0);
            Statics.field1848.method1857(field742 + 382 - Statics.field1848.field1499 / 2, 18);
        } else if (arg4 == 4) {
            field762 = 4;
        }
    }

    @ObfuscatedName("v.e(I)V")
    public static void method219() {
        if (!Statics.field755) {
            return;
        }
        Statics.field761 = null;
        Statics.field764 = null;
        Statics.field745 = null;
        Statics.field746 = null;
        Statics.field747 = null;
        Statics.field1848 = null;
        Statics.field748 = null;
        Statics.field1076 = null;
        Statics.field597 = null;
        Statics.field732 = null;
        Statics.field2790 = null;
        Statics.field774 = null;
        Statics.field1082 = null;
        Statics.field775 = null;
        Statics.field2311 = null;
        Statics.field270 = null;
        Statics.field751 = null;
        Statics.field2142 = null;
        Statics.field650 = null;
        Statics.field2227 = null;
        Statics.field700 = null;
        Statics.field2971 = null;
        class187.method740(2);
        class175.method3117(true);
        Statics.field755 = false;
    }

    @ObfuscatedName("d.h(Lem;I)V")
    public static void method194(class148 arg0) {
        if (field773) {
            method210(arg0);
            return;
        }
        if ((class144.field2218 == 1 || !Statics.field3189 && class144.field2218 == 4) && class144.field2216 >= field742 + 765 - 50 && class144.field2217 >= 453) {
            Statics.field2124.field149 = !Statics.field2124.field149;
            class9.method861();
            if (Statics.field2124.field149) {
                Statics.field1267.method3544();
                class187.field3011 = 1;
                Statics.field1971 = null;
            } else {
                class187.method742(Statics.field3052, "scape main", "", 255, false);
            }
        }
        if (client.field304 == 5) {
            return;
        }
        field776++;
        if (client.field304 != 10 && client.field304 != 11) {
            return;
        }
        if (client.field327 == 0) {
            if (class144.field2218 == 1 || !Statics.field3189 && class144.field2218 == 4) {
                int var1 = field742 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class144.field2216 >= var1 && class144.field2216 <= var1 + var3 && class144.field2217 >= var2 && class144.field2217 <= var2 + var4) {
                    if (class28.method39()) {
                        field773 = true;
                    }
                    return;
                }
            }
            if (Statics.field2028 != null && class28.method39()) {
                field773 = true;
            }
        }
        int var5 = class144.field2218;
        int var6 = class144.field2216;
        int var7 = class144.field2217;
        if (!Statics.field3189 && var5 == 4) {
            var5 = 1;
        }
        if (field762 == 0) {
            int var8 = field778 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class142.method2252(client.method2874("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field778 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field562 & 0x2000000) != 0) {
                    field741 = "";
                    field749 = class161.field2629;
                    field763 = class161.field2595;
                    field756 = class161.field2596;
                    field762 = 1;
                    field770 = 0;
                } else if ((client.field562 & 0x4) != 0) {
                    if ((client.field562 & 0x400) == 0) {
                        field749 = class161.field2585;
                        field763 = class161.field2586;
                        field756 = class161.field2587;
                    } else {
                        field749 = class161.field2591;
                        field763 = class161.field2592;
                        field756 = class161.field2626;
                    }
                    field741 = class161.field2495;
                    field762 = 1;
                    field770 = 0;
                } else if ((client.field562 & 0x400) == 0) {
                    field749 = class161.field2581;
                    field763 = class161.field2604;
                    field756 = class161.field2573;
                    field762 = 2;
                    field770 = 0;
                } else {
                    field749 = class161.field2588;
                    field763 = class161.field2589;
                    field756 = class161.field2590;
                    field741 = class161.field2495;
                    field762 = 1;
                    field770 = 0;
                }
            }
        } else if (field762 == 1) {
            while (class141.method3086()) {
                if (Statics.field644 == 84) {
                    field749 = class161.field2581;
                    field763 = class161.field2604;
                    field756 = class161.field2573;
                    field762 = 2;
                    field770 = 0;
                } else if (Statics.field644 == 13) {
                    field762 = 0;
                }
            }
            int var11 = field778 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field749 = class161.field2581;
                field763 = class161.field2604;
                field756 = class161.field2573;
                field762 = 2;
                field770 = 0;
            }
            int var13 = field778 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field762 = 0;
            }
        } else if (field762 == 2) {
            short var14 = 231;
            int var36 = var14 + 30;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field770 = 0;
            }
            var36 += 15;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field770 = 1;
            }
            var36 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method759(class161.field2507, class161.field2621, class161.field2622);
                field762 = 5;
                return;
            }
            int var16 = field778 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field765 = field765.trim();
                if (field765.length() == 0) {
                    method759(class161.field2487, class161.field2594, class161.field2607);
                    return;
                }
                if (field766.length() == 0) {
                    method759(class161.field2490, class161.field2491, class161.field2492);
                    return;
                }
                method759(class161.field2599, class161.field2600, class161.field2601);
                field767 = Statics.field2124.field148.containsKey(class167.method1209(field765)) ? class163.field2665 : class163.field2662;
                client.method2875(20);
                return;
            }
            int var18 = field778 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field762 = 0;
                field765 = "";
                field766 = "";
                Statics.field2789 = 0;
                Statics.field768 = "";
                field769 = true;
            }
            while (true) {
                while (class141.method3086()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field771.length(); var20++) {
                        if (Statics.field1147 == field771.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field644 == 13) {
                        field762 = 0;
                        field765 = "";
                        field766 = "";
                        Statics.field2789 = 0;
                        Statics.field768 = "";
                        field769 = true;
                    } else if (field770 == 0) {
                        if (Statics.field644 == 85 && field765.length() > 0) {
                            field765 = field765.substring(0, field765.length() - 1);
                        }
                        if (Statics.field644 == 84 || Statics.field644 == 80) {
                            field770 = 1;
                        }
                        if (var19 && field765.length() < 320) {
                            field765 = field765 + Statics.field1147;
                        }
                    } else if (field770 == 1) {
                        if (Statics.field644 == 85 && field766.length() > 0) {
                            field766 = field766.substring(0, field766.length() - 1);
                        }
                        if (Statics.field644 == 84 || Statics.field644 == 80) {
                            field770 = 0;
                        }
                        if (Statics.field644 == 84) {
                            field765 = field765.trim();
                            if (field765.length() == 0) {
                                method759(class161.field2487, class161.field2594, class161.field2607);
                                return;
                            }
                            if (field766.length() == 0) {
                                method759(class161.field2490, class161.field2491, class161.field2492);
                                return;
                            }
                            method759(class161.field2599, class161.field2600, class161.field2601);
                            field767 = Statics.field2124.field148.containsKey(class167.method1209(field765)) ? class163.field2665 : class163.field2662;
                            client.method2875(20);
                            return;
                        }
                        if (var19 && field766.length() < 20) {
                            field766 = field766 + Statics.field1147;
                        }
                    }
                }
                return;
            }
        } else if (field762 == 3) {
            int var21 = field778 + 180;
            short var22 = 276;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field749 = class161.field2581;
                field763 = class161.field2604;
                field756 = class161.field2573;
                field762 = 2;
                field770 = 0;
            }
            int var23 = field778 + 180;
            short var24 = 326;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                method759(class161.field2507, class161.field2621, class161.field2622);
                field762 = 5;
                return;
            }
        } else if (field762 == 4) {
            int var25 = field778 + 180 - 80;
            short var26 = 321;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                Statics.field768.trim();
                if (Statics.field768.length() != 6) {
                    method759(class161.field2406, class161.field2407, class161.field2408);
                    return;
                }
                Statics.field2789 = Integer.parseInt(Statics.field768);
                Statics.field768 = "";
                field767 = field769 ? class163.field2661 : class163.field2663;
                method759(class161.field2599, class161.field2600, class161.field2601);
                client.method2875(20);
                return;
            }
            if (var5 == 1 && var6 >= field778 + 180 - 9 && var6 <= field778 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field769 = !field769;
            }
            if (var5 == 1 && var6 >= field778 + 180 - 34 && var6 <= field778 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class142.method2252(client.method2874("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var27 = field778 + 180 + 80;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                field762 = 0;
                field765 = "";
                field766 = "";
                Statics.field2789 = 0;
                Statics.field768 = "";
            }
            while (class141.method3086()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field772.length(); var29++) {
                    if (Statics.field1147 == field772.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field644 == 13) {
                    field762 = 0;
                    field765 = "";
                    field766 = "";
                    Statics.field2789 = 0;
                    Statics.field768 = "";
                } else {
                    if (Statics.field644 == 85 && Statics.field768.length() > 0) {
                        Statics.field768 = Statics.field768.substring(0, Statics.field768.length() - 1);
                    }
                    if (Statics.field644 == 84) {
                        Statics.field768.trim();
                        if (Statics.field768.length() != 6) {
                            method759(class161.field2406, class161.field2407, class161.field2408);
                            return;
                        }
                        Statics.field2789 = Integer.parseInt(Statics.field768);
                        Statics.field768 = "";
                        field767 = field769 ? class163.field2661 : class163.field2663;
                        method759(class161.field2599, class161.field2600, class161.field2601);
                        client.method2875(20);
                        return;
                    }
                    if (var28 && Statics.field768.length() < 6) {
                        Statics.field768 = Statics.field768 + Statics.field1147;
                    }
                }
            }
        } else if (field762 == 5) {
            int var30 = field778 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method2340();
                return;
            }
            int var32 = field778 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field749 = class161.field2581;
                field763 = class161.field2604;
                field756 = class161.field2573;
                field762 = 2;
                field770 = 0;
                field766 = "";
            }
            while (class141.method3086()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field771.length(); var34++) {
                    if (Statics.field1147 == field771.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field644 == 13) {
                    field749 = class161.field2581;
                    field763 = class161.field2604;
                    field756 = class161.field2573;
                    field762 = 2;
                    field770 = 0;
                    field766 = "";
                } else {
                    if (Statics.field644 == 85 && field765.length() > 0) {
                        field765 = field765.substring(0, field765.length() - 1);
                    }
                    if (Statics.field644 == 84) {
                        method2340();
                        return;
                    }
                    if (var33 && field765.length() < 320) {
                        field765 = field765 + Statics.field1147;
                    }
                }
            }
        } else if (field762 == 6) {
            while (true) {
                do {
                    if (!class141.method3086()) {
                        short var35 = 321;
                        if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                            field749 = class161.field2581;
                            field763 = class161.field2604;
                            field756 = class161.field2573;
                            field762 = 2;
                            field770 = 0;
                            field766 = "";
                        }
                        return;
                    }
                } while (Statics.field644 != 84 && Statics.field644 != 13);
                field749 = class161.field2581;
                field763 = class161.field2604;
                field756 = class161.field2573;
                field762 = 2;
                field770 = 0;
                field766 = "";
            }
        }
    }

    @ObfuscatedName("dw.s(I)V")
    public static void method2340() {
        field765 = field765.trim();
        if (field765.length() == 0) {
            method759(class161.field2507, class161.field2621, class161.field2622);
            return;
        }
        long var0 = class10.method2928();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field765;
            Random var4 = new Random();
            class123 var5 = new class123(128);
            class123 var6 = new class123(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2640(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2585(var4.nextInt());
            }
            var5.method2585(var7[0]);
            var5.method2585(var7[1]);
            var5.method2480(var0);
            var5.method2480(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2585(var4.nextInt());
            }
            var5.method2638(class10.field158, class10.field164);
            var6.method2640(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2585(var4.nextInt());
            }
            var6.method2480(var4.nextLong());
            var6.method2479(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class153.field2302.method4034(0L);
                class153.field2302.method4038(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var30) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2484(var11, 0, 24);
            var6.method2480(var4.nextLong());
            var6.method2638(class10.field158, class10.field164);
            int var15 = Statics.method1140(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class123 var16 = new class123(var15);
            var16.method2560(var3);
            var16.field2051 = var15;
            var16.method2507(var7);
            class123 var17 = new class123(var16.field2051 + var6.field2051 + var5.field2051 + 5);
            var17.method2640(2);
            var17.method2640(var5.field2051);
            var17.method2484(var5.field2052, 0, var5.field2051);
            var17.method2640(var6.field2051);
            var17.method2484(var6.field2052, 0, var6.field2051);
            var17.method2476(var16.field2051);
            var17.method2484(var16.field2052, 0, var16.field2051);
            String var18 = class165.method211(var17.field2052);
            byte var25;
            try {
                URL var19 = new URL(client.method2874("services", false) + "m=accountappeal/login.ws");
                URLConnection var20 = var19.openConnection();
                var20.setDoInput(true);
                var20.setDoOutput(true);
                var20.setConnectTimeout(5000);
                OutputStreamWriter var21 = new OutputStreamWriter(var20.getOutputStream());
                var21.write("data2=" + class230.method2822(var18) + "&dest=" + class230.method2822("passwordchoice.ws"));
                var21.flush();
                InputStream var22 = var20.getInputStream();
                class123 var23 = new class123(new byte[1000]);
                while (true) {
                    int var24 = var22.read(var23.field2052, var23.field2051, 1000 - var23.field2051);
                    if (var24 == -1) {
                        var21.close();
                        var22.close();
                        String var26 = new String(var23.field2052);
                        if (var26.startsWith("OFFLINE")) {
                            var25 = 4;
                        } else if (var26.startsWith("WRONG")) {
                            var25 = 7;
                        } else if (var26.startsWith("RELOAD")) {
                            var25 = 3;
                        } else if (var26.startsWith("Not permitted for social network accounts.")) {
                            var25 = 6;
                        } else {
                            var23.method2508(var7);
                            while (var23.field2051 > 0 && var23.field2052[var23.field2051 - 1] == 0) {
                                var23.field2051--;
                            }
                            String var27 = new String(var23.field2052, 0, var23.field2051);
                            if (class10.method3338(var27)) {
                                class142.method2252(var27, true, false);
                                var25 = 2;
                            } else {
                                var25 = 5;
                            }
                        }
                        break;
                    }
                    var23.field2051 += var24;
                    if (var23.field2051 >= 1000) {
                        var25 = 5;
                        break;
                    }
                }
            } catch (Throwable var29) {
                var29.printStackTrace();
                var25 = 5;
            }
            var2 = var25;
        }
        switch(var2) {
            case 2:
                method759(class161.field2636, class161.field2488, class161.field2625);
                field762 = 6;
                break;
            case 3:
                method759(class161.field2611, class161.field2537, class161.field2628);
                break;
            case 4:
                method759(class161.field2639, class161.field2630, class161.field2422);
                break;
            case 5:
                method759(class161.field2632, class161.field2633, class161.field2647);
                break;
            case 6:
                method759(class161.field2635, class161.field2436, class161.field2416);
                break;
            case 7:
                method759(class161.field2405, class161.field2375, class161.field2527);
        }
    }

    @ObfuscatedName("eh.k(Lhc;Lhc;Lhc;ZB)V")
    public static void method2969(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field742 = (Statics.field3057 - client.field509 * 765) / 2;
            field778 = field742 + 202;
        }
        if (field773) {
            if (Statics.field732 == null) {
                Statics.field732 = class80.method1142(Statics.field452, "sl_back", "");
            }
            if (Statics.field2790 == null) {
                Statics.field2790 = class80.method752(Statics.field452, "sl_flags", "");
            }
            if (Statics.field774 == null) {
                Statics.field774 = class80.method752(Statics.field452, "sl_arrows", "");
            }
            if (Statics.field1082 == null) {
                Statics.field1082 = class80.method752(Statics.field452, "sl_stars", "");
            }
            class83.method1810(field742, 23, 765, 480, 0);
            class83.method1795(field742, 0, 125, 23, 12425273, 9135624);
            class83.method1795(field742 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3921(class161.field2641, field742 + 62, 15, 0, -1);
            if (Statics.field1082 != null) {
                Statics.field1082[1].method1857(field742 + 140, 1);
                arg1.method3918(class161.field2525, field742 + 152, 10, 16777215, -1);
                Statics.field1082[0].method1857(field742 + 140, 12);
                arg1.method3918(class161.field2429, field742 + 152, 21, 16777215, -1);
            }
            if (Statics.field774 != null) {
                int var4 = field742 + 280;
                if (class28.field667[0] == 0 && class28.field666[0] == 0) {
                    Statics.field774[2].method1857(var4, 4);
                } else {
                    Statics.field774[0].method1857(var4, 4);
                }
                if (class28.field667[0] == 0 && class28.field666[0] == 1) {
                    Statics.field774[3].method1857(var4 + 15, 4);
                } else {
                    Statics.field774[1].method1857(var4 + 15, 4);
                }
                arg0.method3918(class161.field2379, var4 + 32, 17, 16777215, -1);
                int var5 = field742 + 390;
                if (class28.field667[0] == 1 && class28.field666[0] == 0) {
                    Statics.field774[2].method1857(var5, 4);
                } else {
                    Statics.field774[0].method1857(var5, 4);
                }
                if (class28.field667[0] == 1 && class28.field666[0] == 1) {
                    Statics.field774[3].method1857(var5 + 15, 4);
                } else {
                    Statics.field774[1].method1857(var5 + 15, 4);
                }
                arg0.method3918(class161.field2645, var5 + 32, 17, 16777215, -1);
                int var6 = field742 + 500;
                if (class28.field667[0] == 2 && class28.field666[0] == 0) {
                    Statics.field774[2].method1857(var6, 4);
                } else {
                    Statics.field774[0].method1857(var6, 4);
                }
                if (class28.field667[0] == 2 && class28.field666[0] == 1) {
                    Statics.field774[3].method1857(var6 + 15, 4);
                } else {
                    Statics.field774[1].method1857(var6 + 15, 4);
                }
                arg0.method3918(class161.field2646, var6 + 32, 17, 16777215, -1);
                int var7 = field742 + 610;
                if (class28.field667[0] == 3 && class28.field666[0] == 0) {
                    Statics.field774[2].method1857(var7, 4);
                } else {
                    Statics.field774[0].method1857(var7, 4);
                }
                if (class28.field667[0] == 3 && class28.field666[0] == 1) {
                    Statics.field774[3].method1857(var7 + 15, 4);
                } else {
                    Statics.field774[1].method1857(var7 + 15, 4);
                }
                arg0.method3918(class161.field2519, var7 + 32, 17, 16777215, -1);
            }
            class83.method1810(field742 + 708, 4, 50, 16, 0);
            arg1.method3921(class161.field2609, field742 + 708 + 25, 16, 16777215, -1);
            field744 = -1;
            if (Statics.field732 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class28.field664) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class28.field664) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class28.field664) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field742 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class28.field664; var22++) {
                    class28 var23 = Statics.field663[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field670);
                    if (var23.field670 == -1) {
                        var25 = class161.field2648;
                        var24 = false;
                    } else if (var23.field670 > 1980) {
                        var25 = class161.field2649;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method630()) {
                        if (var23.method625()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method629()) {
                        var26 = 16711680;
                        if (var23.method625()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method627()) {
                        if (var23.method625()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method625()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class144.field2207 >= var19 && class144.field2210 >= var18 && class144.field2207 < var8 + var19 && class144.field2210 < var9 + var18 && var24) {
                        field744 = var22;
                        Statics.field732[var27].method1713(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field732[var27].method1754(var19, var18);
                    }
                    if (Statics.field2790 != null) {
                        Statics.field2790[(var23.method625() ? 8 : 0) + var23.field673].method1857(var19 + 29, var18);
                    }
                    arg0.method3921(Integer.toString(var23.field668), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3921(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3913(Statics.field663[field744].field681) + 6;
                    int var29 = arg1.field3236 + 8;
                    class83.method1810(class144.field2207 - var28 / 2, class144.field2210 + 20 + 5, var28, var29, 16777120);
                    class83.method1796(class144.field2207 - var28 / 2, class144.field2210 + 20 + 5, var28, var29, 0);
                    arg1.method3921(Statics.field663[field744].field681, class144.field2207, class144.field2210 + 20 + 5 + arg1.field3236 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field1868.getGraphics();
                Statics.field1174.method1622(var30, 0, 0);
            } catch (Exception var106) {
                Statics.field1868.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field746.method1754(field742, 0);
            Statics.field747.method1754(field742 + 382, 0);
            Statics.field1848.method1857(field742 + 382 - Statics.field1848.field1499 / 2, 18);
        }
        if (client.field304 == 0 || client.field304 == 5) {
            byte var32 = 20;
            arg0.method3921(class161.field2617, field778 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class83.method1796(field778 + 180 - 152, var33, 304, 34, 9179409);
            class83.method1796(field778 + 180 - 151, var33 + 1, 302, 32, 0);
            class83.method1810(field778 + 180 - 150, var33 + 2, field758 * 3, 30, 9179409);
            class83.method1810(field758 * 3 + (field778 + 180 - 150), var33 + 2, 300 - field758 * 3, 30, 0);
            arg0.method3921(field759, field778 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field304 == 20) {
            Statics.field761.method1857(field778 + 180 - Statics.field761.field1499 / 2, 271 - Statics.field761.field1504 / 2);
            short var34 = 211;
            arg0.method3921(field749, field778 + 180, var34, 16776960, 0);
            int var108 = var34 + 15;
            arg0.method3921(field763, field778 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            arg0.method3921(field756, field778 + 180, var109, 16776960, 0);
            int var110 = var109 + 15;
            int var111 = var110 + 10;
            if (field762 != 4) {
                arg0.method3918(class161.field2602, field778 + 180 - 110, var111, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field765; arg0.method3913(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3918(class227.method3917(var36), field778 + 180 - 70, var111, 16777215, 0);
                var108 = var111 + 15;
                arg0.method3918(class161.field2603 + class167.method2869(field766), field778 + 180 - 108, var108, 16777215, 0);
                var108 += 15;
            }
        }
        if (client.field304 == 10 || client.field304 == 11) {
            Statics.field761.method1857(field778, 171);
            if (field762 == 0) {
                short var37 = 251;
                arg0.method3921(class161.field2634, field778 + 180, var37, 16776960, 0);
                int var112 = var37 + 30;
                int var38 = field778 + 180 - 80;
                short var39 = 291;
                Statics.field764.method1857(var38 - 73, var39 - 20);
                arg0.method3922(class161.field2606, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var40 = field778 + 180 + 80;
                Statics.field764.method1857(var40 - 73, var39 - 20);
                arg0.method3922(class161.field2479, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field762 == 1) {
                arg0.method3921(field741, field778 + 180, 211, 16776960, 0);
                short var41 = 236;
                arg0.method3921(field749, field778 + 180, var41, 16777215, 0);
                int var113 = var41 + 15;
                arg0.method3921(field763, field778 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3921(field756, field778 + 180, var114, 16777215, 0);
                int var115 = var114 + 15;
                int var42 = field778 + 180 - 80;
                short var43 = 321;
                Statics.field764.method1857(var42 - 73, var43 - 20);
                arg0.method3921(class161.field2554, var42, var43 + 5, 16777215, 0);
                int var44 = field778 + 180 + 80;
                Statics.field764.method1857(var44 - 73, var43 - 20);
                arg0.method3921(class161.field2609, var44, var43 + 5, 16777215, 0);
            } else if (field762 == 2) {
                short var45 = 211;
                arg0.method3921(field749, field778 + 180, var45, 16776960, 0);
                int var116 = var45 + 15;
                arg0.method3921(field763, field778 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method3921(field756, field778 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                int var119 = var118 + 10;
                arg0.method3918(class161.field2602, field778 + 180 - 110, var119, 16777215, 0);
                short var46 = 200;
                String var47;
                for (var47 = field765; arg0.method3913(var47) > var46; var47 = var47.substring(1)) {
                }
                arg0.method3918(class227.method3917(var47) + (field770 == 0 & client.field306 % 40 < 20 ? class2.method198(16776960) + class2.field18 : ""), field778 + 180 - 70, var119, 16777215, 0);
                var116 = var119 + 15;
                arg0.method3918(class161.field2603 + class167.method2869(field766) + (field770 == 1 & client.field306 % 40 < 20 ? class2.method198(16776960) + class2.field18 : ""), field778 + 180 - 108, var116, 16777215, 0);
                var116 += 15;
                int var48 = field778 + 180 - 80;
                short var49 = 321;
                Statics.field764.method1857(var48 - 73, var49 - 20);
                arg0.method3921(class161.field2608, var48, var49 + 5, 16777215, 0);
                int var50 = field778 + 180 + 80;
                Statics.field764.method1857(var50 - 73, var49 - 20);
                arg0.method3921(class161.field2609, var50, var49 + 5, 16777215, 0);
                short var51 = 357;
                arg1.method3921(class161.field2615, field778 + 180, var51, 16776960, 0);
            } else if (field762 == 3) {
                short var52 = 201;
                arg0.method3921(class161.field2610, field778 + 180, var52, 16776960, 0);
                int var120 = var52 + 20;
                arg1.method3921(class161.field2460, field778 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg1.method3921(class161.field2612, field778 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var53 = field778 + 180;
                short var54 = 276;
                Statics.field764.method1857(var53 - 73, var54 - 20);
                arg2.method3921(class161.field2547, var53, var54 + 5, 16777215, 0);
                int var55 = field778 + 180;
                short var56 = 326;
                Statics.field764.method1857(var55 - 73, var56 - 20);
                arg2.method3921(class161.field2614, var55, var56 + 5, 16777215, 0);
            } else if (field762 == 4) {
                arg0.method3921(class161.field2597, field778 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3921(field749, field778 + 180, var57, 16777215, 0);
                int var123 = var57 + 15;
                arg0.method3921(field763, field778 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                arg0.method3921(field756, field778 + 180, var124, 16777215, 0);
                int var125 = var124 + 15;
                arg0.method3918(class161.field2389 + class167.method2869(Statics.field768) + (client.field306 % 40 < 20 ? class2.method198(16776960) + class2.field18 : ""), field778 + 180 - 108, var125, 16777215, 0);
                int var126 = var125 - 8;
                arg0.method3918(class161.field2380, field778 + 180 - 9, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg0.method3918(class161.field2524, field778 + 180 - 9, var127, 16776960, 0);
                int var58 = field778 + 180 - 9 + arg0.method3913(class161.field2524) + 15;
                int var59 = var127 - arg0.field3236;
                class84 var60;
                if (field769) {
                    var60 = Statics.field597;
                } else {
                    var60 = Statics.field1076;
                }
                var60.method1857(var58, var59);
                var123 = var127 + 15;
                int var61 = field778 + 180 - 80;
                short var62 = 321;
                Statics.field764.method1857(var61 - 73, var62 - 20);
                arg0.method3921(class161.field2554, var61, var62 + 5, 16777215, 0);
                int var63 = field778 + 180 + 80;
                Statics.field764.method1857(var63 - 73, var62 - 20);
                arg0.method3921(class161.field2609, var63, var62 + 5, 16777215, 0);
                arg1.method3921(class161.field2598, field778 + 180, var62 + 36, 255, 0);
            } else if (field762 == 5) {
                arg0.method3921(class161.field2616, field778 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3921(field749, field778 + 180, var64, 16776960, 0);
                int var128 = var64 + 15;
                arg2.method3921(field763, field778 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg2.method3921(field756, field778 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var131 = var130 + 14;
                arg0.method3918(class161.field2593, field778 + 180 - 145, var131, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field765; arg0.method3913(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3918(class227.method3917(var66) + (client.field306 % 40 < 20 ? class2.method198(16776960) + class2.field18 : ""), field778 + 180 - 34, var131, 16777215, 0);
                var128 = var131 + 15;
                int var67 = field778 + 180 - 80;
                short var68 = 321;
                Statics.field764.method1857(var67 - 73, var68 - 20);
                arg0.method3921(class161.field2618, var67, var68 + 5, 16777215, 0);
                int var69 = field778 + 180 + 80;
                Statics.field764.method1857(var69 - 73, var68 - 20);
                arg0.method3921(class161.field2619, var69, var68 + 5, 16777215, 0);
            } else if (field762 == 6) {
                short var70 = 211;
                arg0.method3921(field749, field778 + 180, var70, 16776960, 0);
                int var132 = var70 + 15;
                arg0.method3921(field763, field778 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method3921(field756, field778 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var71 = field778 + 180;
                short var72 = 321;
                Statics.field764.method1857(var71 - 73, var72 - 20);
                arg0.method3921(class161.field2619, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field776 > 0) {
            method164(field776);
            field776 = 0;
        }
        short var73 = 256;
        if (field750 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field750 > 768) {
                    Statics.field2142[var74] = method2903(Statics.field2311[var74], Statics.field270[var74], 1024 - field750);
                } else if (field750 > 256) {
                    Statics.field2142[var74] = Statics.field270[var74];
                } else {
                    Statics.field2142[var74] = method2903(Statics.field270[var74], Statics.field2311[var74], 256 - field750);
                }
            }
        } else if (field753 > 0) {
            for (int var75 = 0; var75 < 256; var75++) {
                if (field753 > 768) {
                    Statics.field2142[var75] = method2903(Statics.field2311[var75], Statics.field751[var75], 1024 - field753);
                } else if (field753 > 256) {
                    Statics.field2142[var75] = Statics.field751[var75];
                } else {
                    Statics.field2142[var75] = method2903(Statics.field751[var75], Statics.field2311[var75], 256 - field753);
                }
            }
        } else {
            for (int var76 = 0; var76 < 256; var76++) {
                Statics.field2142[var76] = Statics.field2311[var76];
            }
        }
        class83.method1811(field742, 9, field742 + 128, var73 + 7);
        Statics.field746.method1754(field742, 0);
        class83.method1783();
        int var77 = 0;
        int var78 = field742 + Statics.field1174.field1471 * 9;
        for (int var79 = 1; var79 < var73 - 1; var79++) {
            int var80 = (var73 - var79) * field743[var79] / var73;
            int var81 = var80 + 22;
            if (var81 < 0) {
                var81 = 0;
            }
            var77 += var81;
            for (int var82 = var81; var82 < 128; var82++) {
                int var83 = Statics.field700[var77++];
                if (var83 == 0) {
                    var78++;
                } else {
                    int var85 = 256 - var83;
                    int var86 = Statics.field2142[var83];
                    int var87 = Statics.field1174.field1475[var78];
                    Statics.field1174.field1475[var78++] = ((var86 & 0xFF00FF) * var83 + (var87 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var86 & 0xFF00) * var83 + (var87 & 0xFF00) * var85 & 0xFF0000) >> 8;
                }
            }
            var78 += Statics.field1174.field1471 + var81 - 128;
        }
        class83.method1811(field742 + 765 - 128, 9, field742 + 765, var73 + 7);
        Statics.field747.method1754(field742 + 382, 0);
        class83.method1783();
        int var88 = 0;
        int var89 = field742 + Statics.field1174.field1471 * 9 + 24 + 637;
        for (int var90 = 1; var90 < var73 - 1; var90++) {
            int var91 = (var73 - var90) * field743[var90] / var73;
            int var92 = 103 - var91;
            int var93 = var89 + var91;
            for (int var94 = 0; var94 < var92; var94++) {
                int var95 = Statics.field700[var88++];
                if (var95 == 0) {
                    var93++;
                } else {
                    int var97 = 256 - var95;
                    int var98 = Statics.field2142[var95];
                    int var99 = Statics.field1174.field1475[var93];
                    Statics.field1174.field1475[var93++] = ((var98 & 0xFF00) * var95 + (var99 & 0xFF00) * var97 & 0xFF0000) + ((var98 & 0xFF00FF) * var95 + (var99 & 0xFF00FF) * var97 & 0xFF00FF00) >> 8;
                }
            }
            var88 += 128 - var92;
            var89 = Statics.field1174.field1471 - var92 - var91 + var93;
        }
        Statics.field748[Statics.field2124.field149 ? 1 : 0].method1857(field742 + 765 - 40, 463);
        if (client.field304 > 5 && client.field327 == 0) {
            if (Statics.field775 == null) {
                Statics.field775 = class80.method2861(Statics.field452, "sl_button", "");
            } else {
                int var100 = field742 + 5;
                short var101 = 463;
                byte var102 = 100;
                byte var103 = 35;
                Statics.field775.method1857(var100, var101);
                arg0.method3921(class161.field2472 + " " + client.field408, var102 / 2 + var100, var103 / 2 + var101 - 2, 16777215, 0);
                if (Statics.field2028 == null) {
                    arg1.method3921(class161.field2642, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                } else {
                    arg1.method3921(class161.field2650, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var104 = Statics.field1868.getGraphics();
            Statics.field1174.method1622(var104, 0, 0);
        } catch (Exception var107) {
            Statics.field1868.repaint();
        }
    }

    @ObfuscatedName("ap.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method759(String arg0, String arg1, String arg2) {
        field749 = arg0;
        field763 = arg1;
        field756 = arg2;
    }

    @ObfuscatedName("au.n(Lcf;I)V")
    public static final void method973(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field650.length; var2++) {
            Statics.field650[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field650[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2227[var8] = (Statics.field650[var8 - 1] + Statics.field650[var8 + 1] + Statics.field650[var8 - 128] + Statics.field650[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field650;
            Statics.field650 = Statics.field2227;
            Statics.field2227 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1504; var11++) {
            for (int var12 = 0; var12 < arg0.field1499; var12++) {
                if (arg0.field1500[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1501;
                    int var14 = var11 + 16 + arg0.field1502;
                    int var15 = (var14 << 7) + var13;
                    Statics.field650[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("p.b(II)V")
    public static final void method164(int arg0) {
        short var1 = 256;
        field754 += arg0 * 128;
        if (field754 > Statics.field650.length) {
            field754 -= Statics.field650.length;
            int var2 = (int) (Math.random() * 12.0D);
            method973(Statics.field745[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field700[var3 + var4] - Statics.field650[field754 + var3 & Statics.field650.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field700[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field700[var9 + var10] = 255;
                } else {
                    Statics.field700[var9 + var10] = 0;
                }
            }
        }
        if (field750 > 0) {
            field750 -= arg0 * 4;
        }
        if (field753 > 0) {
            field753 -= arg0 * 4;
        }
        if (field750 == 0 && field753 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field750 = 1024;
            }
            if (var12 == 1) {
                field753 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field743[var13] = field743[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field743[var14] = (int) (Math.sin((double) field757 / 14.0D) * 16.0D + Math.sin((double) field757 / 15.0D) * 14.0D + Math.sin((double) field757 / 16.0D) * 12.0D);
            field757++;
        }
        field760 += arg0 * 16443017;
        int var15 = ((client.field306 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field760 * 1502848068; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field700[(var18 << 7) + var17] = 192;
        }
        field760 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field700[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field700[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2971[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2971[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2971[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field700[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ew.m(IIII)I")
    public static final int method2903(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("i.q(Lem;B)V")
    public static void method210(class148 arg0) {
        if (class144.field2218 != 1 && Statics.field3189 || class144.field2218 != 4) {
            return;
        }
        int var1 = field742 + 280;
        if (class144.field2216 >= var1 && class144.field2216 <= var1 + 14 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(0, 0);
            return;
        }
        if (class144.field2216 >= var1 + 15 && class144.field2216 <= var1 + 80 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(0, 1);
            return;
        }
        int var2 = field742 + 390;
        if (class144.field2216 >= var2 && class144.field2216 <= var2 + 14 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(1, 0);
            return;
        }
        if (class144.field2216 >= var2 + 15 && class144.field2216 <= var2 + 80 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(1, 1);
            return;
        }
        int var3 = field742 + 500;
        if (class144.field2216 >= var3 && class144.field2216 <= var3 + 14 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(2, 0);
            return;
        }
        if (class144.field2216 >= var3 + 15 && class144.field2216 <= var3 + 80 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(2, 1);
            return;
        }
        int var4 = field742 + 610;
        if (class144.field2216 >= var4 && class144.field2216 <= var4 + 14 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(3, 0);
            return;
        }
        if (class144.field2216 >= var4 + 15 && class144.field2216 <= var4 + 80 && class144.field2217 >= 4 && class144.field2217 <= 18) {
            class28.method2975(3, 1);
            return;
        }
        if (class144.field2216 >= field742 + 708 && class144.field2217 >= 4 && class144.field2216 <= field742 + 708 + 50 && class144.field2217 <= 20) {
            field773 = false;
            Statics.field746.method1754(field742, 0);
            Statics.field747.method1754(field742 + 382, 0);
            Statics.field1848.method1857(field742 + 382 - Statics.field1848.field1499 / 2, 18);
            return;
        }
        if (field744 == -1) {
            return;
        }
        class28 var5 = Statics.field663[field744];
        method3109(var5);
        field773 = false;
        Statics.field746.method1754(field742, 0);
        Statics.field747.method1754(field742 + 382, 0);
        Statics.field1848.method1857(field742 + 382 - Statics.field1848.field1499 / 2, 18);
        return;
    }

    @ObfuscatedName("fc.p(Las;I)V")
    public static void method3109(class28 arg0) {
        if (arg0.method625() != client.field521) {
            client.field521 = arg0.method625();
            class56.method1043(arg0.method625());
        }
        Statics.field1843 = arg0.field671;
        client.field408 = arg0.field668;
        client.field562 = arg0.field669;
        Statics.field199 = client.field298 == 0 ? 43594 : arg0.field668 + 40000;
        Statics.field1236 = client.field298 == 0 ? 443 : arg0.field668 + 50000;
        Statics.field1944 = Statics.field199;
    }
}
