package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ap")
public class class34 {

    @ObfuscatedName("ap.l")
    public static int field759 = 0;

    @ObfuscatedName("ap.x")
    public static int field766 = field759 + 202;

    @ObfuscatedName("ap.t")
    public static int[] field768 = new int[256];

    @ObfuscatedName("ap.k")
    public static int field770 = 0;

    @ObfuscatedName("ap.n")
    public static int field784 = 0;

    @ObfuscatedName("ap.as")
    public static int field769 = 0;

    @ObfuscatedName("ap.ae")
    public static int field767 = 0;

    @ObfuscatedName("ap.ao")
    public static int field775 = 0;

    @ObfuscatedName("ap.av")
    public static int field776 = 0;

    @ObfuscatedName("ap.al")
    public static int field777 = 10;

    @ObfuscatedName("ap.ap")
    public static String field778 = "";

    @ObfuscatedName("ap.an")
    public static int field779 = 0;

    @ObfuscatedName("ap.aw")
    public static String field780 = "";

    @ObfuscatedName("ap.ad")
    public static String field773 = "";

    @ObfuscatedName("ap.aa")
    public static String field782 = "";

    @ObfuscatedName("ap.at")
    public static String field792 = "";

    @ObfuscatedName("ap.ag")
    public static String field785 = "";

    @ObfuscatedName("ap.aq")
    public static String field781 = "";

    @ObfuscatedName("ap.af")
    public static class163 field771 = class163.field2650;

    @ObfuscatedName("ap.ar")
    public static boolean field788 = true;

    @ObfuscatedName("ap.ab")
    public static int field789 = 0;

    @ObfuscatedName("ap.aj")
    public static String field790 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ap.au")
    public static String field791 = "1234567890";

    @ObfuscatedName("ap.az")
    public static boolean field758 = false;

    @ObfuscatedName("ap.bp")
    public static int field793 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.e(Lfe;Lfe;S)I")
    public static int method755(class171 arg0, class171 arg1) {
        int var2 = 0;
        if (arg0.method3131("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3131("logo", "")) {
            var2++;
        }
        if (arg1.method3131("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3131("titlebox", "")) {
            var2++;
        }
        if (arg1.method3131("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3131("runes", "")) {
            var2++;
        }
        if (arg1.method3131("title_mute", "")) {
            var2++;
        }
        if (arg1.method3150("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3150("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3131("sl_back", "");
        arg1.method3131("sl_flags", "");
        arg1.method3131("sl_arrows", "");
        arg1.method3131("sl_stars", "");
        arg1.method3131("sl_button", "");
        return var2;
    }

    @ObfuscatedName("n.l(B)I")
    public static int method563() {
        return 9;
    }

    @ObfuscatedName("er.c(Ljava/awt/Component;Lfe;Lfe;ZII)V")
    public static void method2968(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field774) {
            field779 = arg4;
            class83.method1789();
            byte[] var5 = arg1.method3148("title.jpg", "");
            Statics.field762 = new class82(var5, arg0);
            Statics.field152 = Statics.field762.method1756();
            if ((client.field293 & 0x20000000) == 0) {
                Statics.field763 = class80.method571(arg2, "logo", "");
            } else {
                Statics.field763 = class80.method571(arg2, "logo_deadman_mode", "");
            }
            Statics.field760 = class80.method571(arg2, "titlebox", "");
            Statics.field761 = class80.method571(arg2, "titlebutton", "");
            Statics.field819 = class80.method3322(arg2, "runes", "");
            Statics.field713 = class80.method3322(arg2, "title_mute", "");
            Statics.field3096 = class80.method571(arg2, "options_radio_buttons,0", "");
            Statics.field62 = class80.method571(arg2, "options_radio_buttons,2", "");
            Statics.field1457 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1457[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1457[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1457[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1457[var9 + 192] = 16777215;
            }
            Statics.field786 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field786[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field786[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field786[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field786[var13 + 192] = 16777215;
            }
            Statics.field1745 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1745[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1745[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1745[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1745[var17 + 192] = 16777215;
            }
            Statics.field1955 = new int[256];
            Statics.field607 = new int[32768];
            Statics.field2211 = new int[32768];
            method735((class84) null);
            Statics.field772 = new int[32768];
            Statics.field7 = new int[32768];
            if (arg3) {
                field785 = "";
                field781 = "";
            }
            Statics.field2949 = 0;
            Statics.field787 = "";
            field788 = true;
            field758 = false;
            if (Statics.field572.field145) {
                class187.method3383(2);
            } else {
                class172 var18 = Statics.field1949;
                int var19 = var18.method3132("scape main");
                int var20 = var18.method3147(var19, "");
                class187.method1880(2, var18, var19, var20, 255, false);
            }
            class175.method1337(false);
            Statics.field774 = true;
            field759 = (Statics.field2192 - client.field511) / 2;
            field766 = field759 + 202;
            Statics.field762.method1702(field759, 0);
            Statics.field152.method1702(field759 + 382, 0);
            Statics.field763.method1854(field759 + 382 - Statics.field763.field1487 / 2, 18);
        } else if (arg4 == 4) {
            field779 = 4;
        }
    }

    @ObfuscatedName("g.h(B)V")
    public static void method136() {
        if (!Statics.field774) {
            return;
        }
        Statics.field760 = null;
        Statics.field761 = null;
        Statics.field819 = null;
        Statics.field762 = null;
        Statics.field152 = null;
        Statics.field763 = null;
        Statics.field713 = null;
        Statics.field3096 = null;
        Statics.field62 = null;
        Statics.field709 = null;
        Statics.field155 = null;
        Statics.field3042 = null;
        Statics.field1437 = null;
        Statics.field661 = null;
        Statics.field1457 = null;
        Statics.field786 = null;
        Statics.field1745 = null;
        Statics.field1955 = null;
        Statics.field607 = null;
        Statics.field2211 = null;
        Statics.field772 = null;
        Statics.field7 = null;
        class187.method3383(2);
        class175.method1337(true);
        Statics.field774 = false;
    }

    @ObfuscatedName("f.r(Ler;I)V")
    public static void method155(class148 arg0) {
        if (!field758) {
            if ((class144.field2209 == 1 || !Statics.field470 && class144.field2209 == 4) && class144.field2208 >= field759 + 765 - 50 && class144.field2214 >= 453) {
                Statics.field572.field145 = !Statics.field572.field145;
                class9.method1030();
                if (Statics.field572.field145) {
                    class187.method2055();
                } else {
                    class172 var6 = Statics.field1949;
                    int var7 = var6.method3132("scape main");
                    int var8 = var6.method3147(var7, "");
                    class187.method2758(var6, var7, var8, 255, false);
                }
            }
            if (client.field302 != 5) {
                field775++;
                if (client.field302 == 10 || client.field302 == 11) {
                    if (client.field300 == 0) {
                        if (class144.field2209 == 1 || !Statics.field470 && class144.field2209 == 4) {
                            int var9 = field759 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class144.field2208 >= var9 && class144.field2208 <= var9 + var11 && class144.field2214 >= var10 && class144.field2214 <= var10 + var12) {
                                method530();
                                return;
                            }
                        }
                        if (Statics.field673 != null) {
                            method530();
                        }
                    }
                    int var13 = class144.field2209;
                    int var14 = class144.field2208;
                    int var15 = class144.field2214;
                    if (!Statics.field470 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field779 == 0) {
                        int var16 = field766 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            String var18 = client.method1028("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class142.method2707(var18, true, "openjs", false);
                        }
                        int var19 = field766 + 180 + 80;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field293 & 0x2000000) != 0) {
                                field780 = "";
                                field773 = class161.field2581;
                                field782 = class161.field2582;
                                field792 = class161.field2583;
                                field779 = 1;
                                field789 = 0;
                            } else if ((client.field293 & 0x4) != 0) {
                                if ((client.field293 & 0x400) == 0) {
                                    field773 = class161.field2572;
                                    field782 = class161.field2451;
                                    field792 = class161.field2574;
                                } else {
                                    field773 = class161.field2578;
                                    field782 = class161.field2503;
                                    field792 = class161.field2580;
                                }
                                field780 = class161.field2571;
                                field779 = 1;
                                field789 = 0;
                            } else if ((client.field293 & 0x400) == 0) {
                                field773 = class161.field2568;
                                field782 = class161.field2616;
                                field792 = class161.field2570;
                                field779 = 2;
                                field789 = 0;
                            } else {
                                field773 = class161.field2465;
                                field782 = class161.field2576;
                                field792 = class161.field2577;
                                field780 = class161.field2571;
                                field779 = 1;
                                field789 = 0;
                            }
                        }
                    } else if (field779 == 1) {
                        while (class141.method2666()) {
                            if (Statics.field1163 == 84) {
                                field773 = class161.field2568;
                                field782 = class161.field2616;
                                field792 = class161.field2570;
                                field779 = 2;
                                field789 = 0;
                            } else if (Statics.field1163 == 13) {
                                field779 = 0;
                            }
                        }
                        int var20 = field766 + 180 - 80;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field773 = class161.field2568;
                            field782 = class161.field2616;
                            field792 = class161.field2570;
                            field779 = 2;
                            field789 = 0;
                        }
                        int var22 = field766 + 180 + 80;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field779 = 0;
                        }
                    } else if (field779 == 2) {
                        short var23 = 231;
                        int var46 = var23 + 30;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field789 = 0;
                        }
                        var46 += 15;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field789 = 1;
                        }
                        var46 += 15;
                        short var24 = 361;
                        if (var13 == 1 && var15 >= var24 - 15 && var15 < var24) {
                            method2383(class161.field2607, class161.field2608, class161.field2609);
                            field779 = 5;
                            return;
                        }
                        int var25 = field766 + 180 - 80;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field785 = field785.trim();
                            if (field785.length() == 0) {
                                method2383(class161.field2402, class161.field2553, class161.field2476);
                                return;
                            }
                            if (field781.length() == 0) {
                                method2383(class161.field2477, class161.field2478, class161.field2416);
                                return;
                            }
                            method2383(class161.field2440, class161.field2562, class161.field2588);
                            field771 = Statics.field572.field148.containsKey(class167.method560(field785)) ? class163.field2647 : class163.field2650;
                            client.method2058(20);
                            return;
                        }
                        int var27 = field766 + 180 + 80;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field779 = 0;
                            field785 = "";
                            field781 = "";
                            Statics.field2949 = 0;
                            Statics.field787 = "";
                            field788 = true;
                        }
                        while (true) {
                            while (class141.method2666()) {
                                boolean var28 = false;
                                for (int var29 = 0; var29 < field790.length(); var29++) {
                                    if (Statics.field1869 == field790.charAt(var29)) {
                                        var28 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1163 == 13) {
                                    field779 = 0;
                                    field785 = "";
                                    field781 = "";
                                    Statics.field2949 = 0;
                                    Statics.field787 = "";
                                    field788 = true;
                                } else if (field789 == 0) {
                                    if (Statics.field1163 == 85 && field785.length() > 0) {
                                        field785 = field785.substring(0, field785.length() - 1);
                                    }
                                    if (Statics.field1163 == 84 || Statics.field1163 == 80) {
                                        field789 = 1;
                                    }
                                    if (var28 && field785.length() < 320) {
                                        field785 = field785 + Statics.field1869;
                                    }
                                } else if (field789 == 1) {
                                    if (Statics.field1163 == 85 && field781.length() > 0) {
                                        field781 = field781.substring(0, field781.length() - 1);
                                    }
                                    if (Statics.field1163 == 84 || Statics.field1163 == 80) {
                                        field789 = 0;
                                    }
                                    if (Statics.field1163 == 84) {
                                        field785 = field785.trim();
                                        if (field785.length() == 0) {
                                            method2383(class161.field2402, class161.field2553, class161.field2476);
                                            return;
                                        }
                                        if (field781.length() == 0) {
                                            method2383(class161.field2477, class161.field2478, class161.field2416);
                                            return;
                                        }
                                        method2383(class161.field2440, class161.field2562, class161.field2588);
                                        field771 = Statics.field572.field148.containsKey(class167.method560(field785)) ? class163.field2647 : class163.field2650;
                                        client.method2058(20);
                                        return;
                                    }
                                    if (var28 && field781.length() < 20) {
                                        field781 = field781 + Statics.field1869;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field779 == 3) {
                        int var30 = field766 + 180;
                        short var31 = 276;
                        if (var13 == 1 && var14 >= var30 - 75 && var14 <= var30 + 75 && var15 >= var31 - 20 && var15 <= var31 + 20) {
                            field773 = class161.field2568;
                            field782 = class161.field2616;
                            field792 = class161.field2570;
                            field779 = 2;
                            field789 = 0;
                        }
                        int var32 = field766 + 180;
                        short var33 = 326;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var33 - 20 && var15 <= var33 + 20) {
                            method2383(class161.field2607, class161.field2608, class161.field2609);
                            field779 = 5;
                            return;
                        }
                    } else if (field779 == 4) {
                        int var34 = field766 + 180 - 80;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            Statics.field787.trim();
                            if (Statics.field787.length() != 6) {
                                method2383(class161.field2382, class161.field2394, class161.field2458);
                                return;
                            }
                            Statics.field2949 = Integer.parseInt(Statics.field787);
                            Statics.field787 = "";
                            field771 = field788 ? class163.field2646 : class163.field2648;
                            method2383(class161.field2440, class161.field2562, class161.field2588);
                            client.method2058(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field766 + 180 - 9 && var14 <= field766 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field788 = !field788;
                        }
                        if (var13 == 1 && var14 >= field766 + 180 - 34 && var14 <= field766 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            String var36 = client.method1028("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class142.method2707(var36, true, "openjs", false);
                        }
                        int var37 = field766 + 180 + 80;
                        if (var13 == 1 && var14 >= var37 - 75 && var14 <= var37 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field779 = 0;
                            field785 = "";
                            field781 = "";
                            Statics.field2949 = 0;
                            Statics.field787 = "";
                        }
                        while (class141.method2666()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field791.length(); var39++) {
                                if (Statics.field1869 == field791.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field1163 == 13) {
                                field779 = 0;
                                field785 = "";
                                field781 = "";
                                Statics.field2949 = 0;
                                Statics.field787 = "";
                            } else {
                                if (Statics.field1163 == 85 && Statics.field787.length() > 0) {
                                    Statics.field787 = Statics.field787.substring(0, Statics.field787.length() - 1);
                                }
                                if (Statics.field1163 == 84) {
                                    Statics.field787.trim();
                                    if (Statics.field787.length() != 6) {
                                        method2383(class161.field2382, class161.field2394, class161.field2458);
                                        return;
                                    }
                                    Statics.field2949 = Integer.parseInt(Statics.field787);
                                    Statics.field787 = "";
                                    field771 = field788 ? class163.field2646 : class163.field2648;
                                    method2383(class161.field2440, class161.field2562, class161.field2588);
                                    client.method2058(20);
                                    return;
                                }
                                if (var38 && Statics.field787.length() < 6) {
                                    Statics.field787 = Statics.field787 + Statics.field1869;
                                }
                            }
                        }
                    } else if (field779 == 5) {
                        int var40 = field766 + 180 - 80;
                        short var41 = 321;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var41 - 20 && var15 <= var41 + 20) {
                            method2522();
                            return;
                        }
                        int var42 = field766 + 180 + 80;
                        if (var13 == 1 && var14 >= var42 - 75 && var14 <= var42 + 75 && var15 >= var41 - 20 && var15 <= var41 + 20) {
                            field773 = class161.field2568;
                            field782 = class161.field2616;
                            field792 = class161.field2570;
                            field779 = 2;
                            field789 = 0;
                            field781 = "";
                        }
                        while (class141.method2666()) {
                            boolean var43 = false;
                            for (int var44 = 0; var44 < field790.length(); var44++) {
                                if (Statics.field1869 == field790.charAt(var44)) {
                                    var43 = true;
                                    break;
                                }
                            }
                            if (Statics.field1163 == 13) {
                                field773 = class161.field2568;
                                field782 = class161.field2616;
                                field792 = class161.field2570;
                                field779 = 2;
                                field789 = 0;
                                field781 = "";
                            } else {
                                if (Statics.field1163 == 85 && field785.length() > 0) {
                                    field785 = field785.substring(0, field785.length() - 1);
                                }
                                if (Statics.field1163 == 84) {
                                    method2522();
                                    return;
                                }
                                if (var43 && field785.length() < 320) {
                                    field785 = field785 + Statics.field1869;
                                }
                            }
                        }
                    } else if (field779 == 6) {
                        while (true) {
                            do {
                                if (!class141.method2666()) {
                                    short var45 = 321;
                                    if (var13 == 1 && var15 >= var45 - 20 && var15 <= var45 + 20) {
                                        field773 = class161.field2568;
                                        field782 = class161.field2616;
                                        field792 = class161.field2570;
                                        field779 = 2;
                                        field789 = 0;
                                        field781 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field1163 != 84 && Statics.field1163 != 13);
                            field773 = class161.field2568;
                            field782 = class161.field2616;
                            field792 = class161.field2570;
                            field779 = 2;
                            field789 = 0;
                            field781 = "";
                        }
                    }
                }
            }
        } else if (class144.field2209 == 1 || !Statics.field470 && class144.field2209 == 4) {
            int var1 = field759 + 280;
            if (class144.field2208 >= var1 && class144.field2208 <= var1 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                class28.method2386(0, 0);
            } else if (class144.field2208 >= var1 + 15 && class144.field2208 <= var1 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                class28.method2386(0, 1);
            } else {
                int var2 = field759 + 390;
                if (class144.field2208 >= var2 && class144.field2208 <= var2 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                    class28.method2386(1, 0);
                } else if (class144.field2208 >= var2 + 15 && class144.field2208 <= var2 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                    class28.method2386(1, 1);
                } else {
                    int var3 = field759 + 500;
                    if (class144.field2208 >= var3 && class144.field2208 <= var3 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                        class28.method2386(2, 0);
                    } else if (class144.field2208 >= var3 + 15 && class144.field2208 <= var3 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                        class28.method2386(2, 1);
                    } else {
                        int var4 = field759 + 610;
                        if (class144.field2208 >= var4 && class144.field2208 <= var4 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                            class28.method2386(3, 0);
                        } else if (class144.field2208 >= var4 + 15 && class144.field2208 <= var4 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
                            class28.method2386(3, 1);
                        } else if (class144.field2208 >= field759 + 708 && class144.field2214 >= 4 && class144.field2208 <= field759 + 708 + 50 && class144.field2214 <= 20) {
                            field758 = false;
                            Statics.field762.method1702(field759, 0);
                            Statics.field152.method1702(field759 + 382, 0);
                            Statics.field763.method1854(field759 + 382 - Statics.field763.field1487 / 2, 18);
                        } else if (field793 != -1) {
                            class28 var5 = Statics.field2033[field793];
                            method3027(var5);
                            field758 = false;
                            Statics.field762.method1702(field759, 0);
                            Statics.field152.method1702(field759 + 382, 0);
                            Statics.field763.method1854(field759 + 382 - Statics.field763.field1487 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.a(I)V")
    public static void method2522() {
        field785 = field785.trim();
        if (field785.length() == 0) {
            method2383(class161.field2607, class161.field2608, class161.field2609);
            return;
        }
        long var0 = class10.method740();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field785;
            Random var4 = new Random();
            class123 var5 = new class123(128);
            class123 var6 = new class123(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2649(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2452(var4.nextInt());
            }
            var5.method2452(var7[0]);
            var5.method2452(var7[1]);
            var5.method2563(var0);
            var5.method2563(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2452(var4.nextInt());
            }
            var5.method2600(class10.field165, class10.field171);
            var6.method2649(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2452(var4.nextInt());
            }
            var6.method2563(var4.nextLong());
            var6.method2453(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class153.field2284.method4001(0L);
                class153.field2284.method3983(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var32) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2458(var11, 0, 24);
            var6.method2563(var4.nextLong());
            var6.method2600(class10.field165, class10.field171);
            int var15 = class123.method641(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class123 var16 = new class123(var15);
            var16.method2455(var3);
            var16.field2062 = var15;
            var16.method2480(var7);
            class123 var17 = new class123(var16.field2062 + var6.field2062 + var5.field2062 + 5);
            var17.method2649(2);
            var17.method2649(var5.field2062);
            var17.method2458(var5.field2055, 0, var5.field2062);
            var17.method2649(var6.field2062);
            var17.method2458(var6.field2055, 0, var6.field2062);
            var17.method2635(var16.field2062);
            var17.method2458(var16.field2055, 0, var16.field2062);
            byte[] var18 = var17.field2055;
            String var19 = class165.method929(var18, 0, var18.length);
            String var20 = var19;
            byte var27;
            try {
                URL var21 = new URL(client.method1028("services", false) + "m=accountappeal/login.ws");
                URLConnection var22 = var21.openConnection();
                var22.setDoInput(true);
                var22.setDoOutput(true);
                var22.setConnectTimeout(5000);
                OutputStreamWriter var23 = new OutputStreamWriter(var22.getOutputStream());
                var23.write("data2=" + class230.method113(var20) + "&dest=" + class230.method113("passwordchoice.ws"));
                var23.flush();
                InputStream var24 = var22.getInputStream();
                class123 var25 = new class123(new byte[1000]);
                while (true) {
                    int var26 = var24.read(var25.field2055, var25.field2062, 1000 - var25.field2062);
                    if (var26 == -1) {
                        var23.close();
                        var24.close();
                        String var28 = new String(var25.field2055);
                        if (var28.startsWith("OFFLINE")) {
                            var27 = 4;
                        } else if (var28.startsWith("WRONG")) {
                            var27 = 7;
                        } else if (var28.startsWith("RELOAD")) {
                            var27 = 3;
                        } else if (var28.startsWith("Not permitted for social network accounts.")) {
                            var27 = 6;
                        } else {
                            var25.method2481(var7);
                            while (var25.field2062 > 0 && var25.field2055[var25.field2062 - 1] == 0) {
                                var25.field2062--;
                            }
                            String var29 = new String(var25.field2055, 0, var25.field2062);
                            if (Statics.method2765(var29)) {
                                class142.method2707(var29, true, "openjs", false);
                                var27 = 2;
                            } else {
                                var27 = 5;
                            }
                        }
                        break;
                    }
                    var25.field2062 += var26;
                    if (var25.field2062 >= 1000) {
                        var27 = 5;
                        break;
                    }
                }
            } catch (Throwable var31) {
                var31.printStackTrace();
                var27 = 5;
            }
            var2 = var27;
        }
        switch(var2) {
            case 2:
                method2383(class161.field2610, class161.field2611, class161.field2612);
                field779 = 6;
                break;
            case 3:
                method2383(class161.field2492, class161.field2614, class161.field2615);
                break;
            case 4:
                method2383(class161.field2370, class161.field2617, class161.field2618);
                break;
            case 5:
                method2383(class161.field2619, class161.field2620, class161.field2621);
                break;
            case 6:
                method2383(class161.field2622, class161.field2623, class161.field2472);
                break;
            case 7:
                method2383(class161.field2625, class161.field2626, class161.field2489);
        }
    }

    @ObfuscatedName("w.b(Lhu;Lhu;Lhu;ZI)V")
    public static void method147(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field759 = (Statics.field2192 - client.field511) / 2;
            field766 = field759 + 202;
        }
        if (field758) {
            method655(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field762.method1702(field759, 0);
            Statics.field152.method1702(field759 + 382, 0);
            Statics.field763.method1854(field759 + 382 - Statics.field763.field1487 / 2, 18);
        }
        if (client.field302 == 0 || client.field302 == 5) {
            byte var4 = 20;
            arg0.method3874(class161.field2534, field766 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class83.method1827(field766 + 180 - 152, var5, 304, 34, 9179409);
            class83.method1827(field766 + 180 - 151, var5 + 1, 302, 32, 0);
            class83.method1813(field766 + 180 - 150, var5 + 2, field777 * 3, 30, 9179409);
            class83.method1813(field777 * 3 + (field766 + 180 - 150), var5 + 2, 300 - field777 * 3, 30, 0);
            arg0.method3874(field778, field766 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field302 == 20) {
            Statics.field760.method1854(field766 + 180 - Statics.field760.field1487 / 2, 271 - Statics.field760.field1490 / 2);
            short var6 = 211;
            arg0.method3874(field773, field766 + 180, var6, 16776960, 0);
            int var76 = var6 + 15;
            arg0.method3874(field782, field766 + 180, var76, 16776960, 0);
            int var77 = var76 + 15;
            arg0.method3874(field792, field766 + 180, var77, 16776960, 0);
            int var78 = var77 + 15;
            int var79 = var78 + 10;
            if (field779 != 4) {
                arg0.method3932(class161.field2421, field766 + 180 - 110, var79, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field785; arg0.method3934(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3932(class227.method3894(var8), field766 + 180 - 70, var79, 16777215, 0);
                var76 = var79 + 15;
                String var10 = class161.field2590;
                String var11 = field781;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3932(var10 + var15, field766 + 180 - 108, var76, 16777215, 0);
                var76 += 15;
            }
        }
        if (client.field302 == 10 || client.field302 == 11) {
            Statics.field760.method1854(field766, 171);
            if (field779 == 0) {
                short var17 = 251;
                arg0.method3874(class161.field2592, field766 + 180, var17, 16776960, 0);
                int var80 = var17 + 30;
                int var18 = field766 + 180 - 80;
                short var19 = 291;
                Statics.field761.method1854(var18 - 73, var19 - 20);
                arg0.method3871(class161.field2593, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field766 + 180 + 80;
                Statics.field761.method1854(var20 - 73, var19 - 20);
                arg0.method3871(class161.field2594, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field779 == 1) {
                arg0.method3874(field780, field766 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3874(field773, field766 + 180, var21, 16777215, 0);
                int var81 = var21 + 15;
                arg0.method3874(field782, field766 + 180, var81, 16777215, 0);
                int var82 = var81 + 15;
                arg0.method3874(field792, field766 + 180, var82, 16777215, 0);
                int var83 = var82 + 15;
                int var22 = field766 + 180 - 80;
                short var23 = 321;
                Statics.field761.method1854(var22 - 73, var23 - 20);
                arg0.method3874(class161.field2365, var22, var23 + 5, 16777215, 0);
                int var24 = field766 + 180 + 80;
                Statics.field761.method1854(var24 - 73, var23 - 20);
                arg0.method3874(class161.field2579, var24, var23 + 5, 16777215, 0);
            } else if (field779 == 2) {
                short var25 = 211;
                arg0.method3874(field773, field766 + 180, var25, 16776960, 0);
                int var84 = var25 + 15;
                arg0.method3874(field782, field766 + 180, var84, 16776960, 0);
                int var85 = var84 + 15;
                arg0.method3874(field792, field766 + 180, var85, 16776960, 0);
                int var86 = var85 + 15;
                int var87 = var86 + 10;
                arg0.method3932(class161.field2421, field766 + 180 - 110, var87, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field785; arg0.method3934(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3932(class227.method3894(var27) + (field789 == 0 & client.field568 % 40 < 20 ? class2.method2384(16776960) + class2.field20 : ""), field766 + 180 - 70, var87, 16777215, 0);
                var84 = var87 + 15;
                String var29 = class161.field2590;
                String var30 = field781;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3932(var29 + var34 + (field789 == 1 & client.field568 % 40 < 20 ? class2.method2384(16776960) + class2.field20 : ""), field766 + 180 - 108, var84, 16777215, 0);
                var84 += 15;
                int var36 = field766 + 180 - 80;
                short var37 = 321;
                Statics.field761.method1854(var36 - 73, var37 - 20);
                arg0.method3874(class161.field2445, var36, var37 + 5, 16777215, 0);
                int var38 = field766 + 180 + 80;
                Statics.field761.method1854(var38 - 73, var37 - 20);
                arg0.method3874(class161.field2579, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3874(class161.field2384, field766 + 180, var39, 16776960, 0);
            } else if (field779 == 3) {
                short var40 = 201;
                arg0.method3874(class161.field2420, field766 + 180, var40, 16776960, 0);
                int var88 = var40 + 20;
                arg1.method3874(class161.field2598, field766 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg1.method3874(class161.field2515, field766 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var41 = field766 + 180;
                short var42 = 276;
                Statics.field761.method1854(var41 - 73, var42 - 20);
                arg2.method3874(class161.field2600, var41, var42 + 5, 16777215, 0);
                int var43 = field766 + 180;
                short var44 = 326;
                Statics.field761.method1854(var43 - 73, var44 - 20);
                arg2.method3874(class161.field2633, var43, var44 + 5, 16777215, 0);
            } else if (field779 == 4) {
                arg0.method3874(class161.field2584, field766 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3874(field773, field766 + 180, var45, 16777215, 0);
                int var91 = var45 + 15;
                arg0.method3874(field782, field766 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3874(field792, field766 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                String var47 = class161.field2591;
                String var48 = Statics.field787;
                int var49 = var48.length();
                char[] var50 = new char[var49];
                for (int var51 = 0; var51 < var49; var51++) {
                    var50[var51] = '*';
                }
                String var52 = new String(var50);
                arg0.method3932(var47 + var52 + (client.field568 % 40 < 20 ? class2.method2384(16776960) + class2.field20 : ""), field766 + 180 - 108, var93, 16777215, 0);
                var91 = var93 - 8;
                arg0.method3932(class161.field2367, field766 + 180 - 9, var91, 16776960, 0);
                var91 += 15;
                arg0.method3932(class161.field2380, field766 + 180 - 9, var91, 16776960, 0);
                int var54 = field766 + 180 - 9 + arg0.method3934(class161.field2380) + 15;
                int var55 = var91 - arg0.field3243;
                class84 var56;
                if (field788) {
                    var56 = Statics.field62;
                } else {
                    var56 = Statics.field3096;
                }
                var56.method1854(var54, var55);
                var91 += 15;
                int var57 = field766 + 180 - 80;
                short var58 = 321;
                Statics.field761.method1854(var57 - 73, var58 - 20);
                arg0.method3874(class161.field2365, var57, var58 + 5, 16777215, 0);
                int var59 = field766 + 180 + 80;
                Statics.field761.method1854(var59 - 73, var58 - 20);
                arg0.method3874(class161.field2579, var59, var58 + 5, 16777215, 0);
                arg1.method3874(class161.field2613, field766 + 180, var58 + 36, 255, 0);
            } else if (field779 == 5) {
                arg0.method3874(class161.field2603, field766 + 180, 201, 16776960, 0);
                short var60 = 221;
                arg2.method3874(field773, field766 + 180, var60, 16776960, 0);
                int var94 = var60 + 15;
                arg2.method3874(field782, field766 + 180, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg2.method3874(field792, field766 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 14;
                arg0.method3932(class161.field2499, field766 + 180 - 145, var97, 16777215, 0);
                short var61 = 174;
                String var62;
                for (var62 = field785; arg0.method3934(var62) > var61; var62 = var62.substring(1)) {
                }
                arg0.method3932(class227.method3894(var62) + (client.field568 % 40 < 20 ? class2.method2384(16776960) + class2.field20 : ""), field766 + 180 - 34, var97, 16777215, 0);
                var94 = var97 + 15;
                int var63 = field766 + 180 - 80;
                short var64 = 321;
                Statics.field761.method1854(var63 - 73, var64 - 20);
                arg0.method3874(class161.field2635, var63, var64 + 5, 16777215, 0);
                int var65 = field766 + 180 + 80;
                Statics.field761.method1854(var65 - 73, var64 - 20);
                arg0.method3874(class161.field2606, var65, var64 + 5, 16777215, 0);
            } else if (field779 == 6) {
                short var66 = 211;
                arg0.method3874(field773, field766 + 180, var66, 16776960, 0);
                int var98 = var66 + 15;
                arg0.method3874(field782, field766 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg0.method3874(field792, field766 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var67 = field766 + 180;
                short var68 = 321;
                Statics.field761.method1854(var67 - 73, var68 - 20);
                arg0.method3874(class161.field2606, var67, var68 + 5, 16777215, 0);
            }
        }
        if (field775 > 0) {
            method165(field775);
            field775 = 0;
        }
        method575();
        Statics.field713[Statics.field572.field145 ? 1 : 0].method1854(field759 + 765 - 40, 463);
        if (client.field302 > 5 && client.field300 == 0) {
            if (Statics.field661 == null) {
                Statics.field661 = class80.method571(Statics.field3264, "sl_button", "");
            } else {
                int var69 = field759 + 5;
                short var70 = 463;
                byte var71 = 100;
                byte var72 = 35;
                Statics.field661.method1854(var69, var70);
                arg0.method3874(class161.field2522 + " " + client.field469, var71 / 2 + var69, var72 / 2 + var70 - 2, 16777215, 0);
                if (Statics.field673 == null) {
                    arg1.method3874(class161.field2638, var71 / 2 + var69, var72 / 2 + var70 + 12, 16777215, 0);
                } else {
                    arg1.method3874(class161.field2637, var71 / 2 + var69, var72 / 2 + var70 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var73 = Statics.field2347.getGraphics();
            Statics.field1040.method1610(var73, 0, 0);
        } catch (Exception var75) {
            Statics.field2347.repaint();
        }
    }

    @ObfuscatedName("dl.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2383(String arg0, String arg1, String arg2) {
        field773 = arg0;
        field782 = arg1;
        field792 = arg2;
    }

    @ObfuscatedName("ad.o(Lcc;B)V")
    public static final void method735(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field607.length; var2++) {
            Statics.field607[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field607[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2211[var8] = (Statics.field607[var8 - 1] + Statics.field607[var8 + 1] + Statics.field607[var8 - 128] + Statics.field607[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field607;
            Statics.field607 = Statics.field2211;
            Statics.field2211 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1490; var11++) {
            for (int var12 = 0; var12 < arg0.field1487; var12++) {
                if (arg0.field1491[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1489;
                    int var14 = var11 + 16 + arg0.field1492;
                    int var15 = (var14 << 7) + var13;
                    Statics.field607[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("z.p(II)V")
    public static final void method165(int arg0) {
        short var1 = 256;
        field769 += arg0 * 128;
        if (field769 > Statics.field607.length) {
            field769 -= Statics.field607.length;
            int var2 = (int) (Math.random() * 12.0D);
            method735(Statics.field819[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field772[var3 + var4] - Statics.field607[field769 + var3 & Statics.field607.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field772[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field772[var9 + var10] = 255;
                } else {
                    Statics.field772[var9 + var10] = 0;
                }
            }
        }
        if (field770 > 0) {
            field770 -= arg0 * 4;
        }
        if (field784 > 0) {
            field784 -= arg0 * 4;
        }
        if (field770 == 0 && field784 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field770 = 1024;
            }
            if (var12 == 1) {
                field784 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field768[var13] = field768[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field768[var14] = (int) (Math.sin((double) field776 / 14.0D) * 16.0D + Math.sin((double) field776 / 15.0D) * 14.0D + Math.sin((double) field776 / 16.0D) * 12.0D);
            field776++;
        }
        field767 += arg0 * -1167286997;
        int var15 = ((client.field568 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field767 * 567441196; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field772[(var18 << 7) + var17] = 192;
        }
        field767 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field772[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field772[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field7[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field7[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field7[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field772[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cb.i(IIII)I")
    public static final int method1651(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("s.q(I)V")
    public static final void method575() {
        short var0 = 256;
        if (field770 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field770 > 768) {
                    Statics.field1955[var1] = method1651(Statics.field1457[var1], Statics.field786[var1], 1024 - field770);
                } else if (field770 > 256) {
                    Statics.field1955[var1] = Statics.field786[var1];
                } else {
                    Statics.field1955[var1] = method1651(Statics.field786[var1], Statics.field1457[var1], 256 - field770);
                }
            }
        } else if (field784 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field784 > 768) {
                    Statics.field1955[var2] = method1651(Statics.field1457[var2], Statics.field1745[var2], 1024 - field784);
                } else if (field784 > 256) {
                    Statics.field1955[var2] = Statics.field1745[var2];
                } else {
                    Statics.field1955[var2] = method1651(Statics.field1745[var2], Statics.field1457[var2], 256 - field784);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1955[var3] = Statics.field1457[var3];
            }
        }
        class83.method1836(field759, 9, field759 + 128, var0 + 7);
        Statics.field762.method1702(field759, 0);
        class83.method1784();
        int var4 = 0;
        int var5 = field759 + Statics.field1040.field1460 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field768[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field772[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1955[var10];
                    int var14 = Statics.field1040.field1465[var5];
                    Statics.field1040.field1465[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field1040.field1460 + var8 - 128;
        }
        class83.method1836(field759 + 765 - 128, 9, field759 + 765, var0 + 7);
        Statics.field152.method1702(field759 + 382, 0);
        class83.method1784();
        int var15 = 0;
        int var16 = field759 + Statics.field1040.field1460 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field768[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field772[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1955[var22];
                    int var26 = Statics.field1040.field1465[var20];
                    Statics.field1040.field1465[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1040.field1460 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ao.g(Lhu;Lhu;B)V")
    public static void method655(class228 arg0, class228 arg1) {
        if (Statics.field709 == null) {
            Statics.field709 = Statics.method1867(Statics.field3264, "sl_back", "");
        }
        if (Statics.field155 == null) {
            Statics.field155 = class80.method3322(Statics.field3264, "sl_flags", "");
        }
        if (Statics.field3042 == null) {
            Statics.field3042 = class80.method3322(Statics.field3264, "sl_arrows", "");
        }
        if (Statics.field1437 == null) {
            Statics.field1437 = class80.method3322(Statics.field3264, "sl_stars", "");
        }
        class83.method1813(field759, 23, 765, 480, 0);
        class83.method1796(field759, 0, 125, 23, 12425273, 9135624);
        class83.method1796(field759 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3874(class161.field2628, field759 + 62, 15, 0, -1);
        if (Statics.field1437 != null) {
            Statics.field1437[1].method1854(field759 + 140, 1);
            arg1.method3932(class161.field2573, field759 + 152, 10, 16777215, -1);
            Statics.field1437[0].method1854(field759 + 140, 12);
            arg1.method3932(class161.field2630, field759 + 152, 21, 16777215, -1);
        }
        if (Statics.field3042 != null) {
            int var2 = field759 + 280;
            if (class28.field682[0] == 0 && class28.field676[0] == 0) {
                Statics.field3042[2].method1854(var2, 4);
            } else {
                Statics.field3042[0].method1854(var2, 4);
            }
            if (class28.field682[0] == 0 && class28.field676[0] == 1) {
                Statics.field3042[3].method1854(var2 + 15, 4);
            } else {
                Statics.field3042[1].method1854(var2 + 15, 4);
            }
            arg0.method3932(class161.field2631, var2 + 32, 17, 16777215, -1);
            int var3 = field759 + 390;
            if (class28.field682[0] == 1 && class28.field676[0] == 0) {
                Statics.field3042[2].method1854(var3, 4);
            } else {
                Statics.field3042[0].method1854(var3, 4);
            }
            if (class28.field682[0] == 1 && class28.field676[0] == 1) {
                Statics.field3042[3].method1854(var3 + 15, 4);
            } else {
                Statics.field3042[1].method1854(var3 + 15, 4);
            }
            arg0.method3932(class161.field2632, var3 + 32, 17, 16777215, -1);
            int var4 = field759 + 500;
            if (class28.field682[0] == 2 && class28.field676[0] == 0) {
                Statics.field3042[2].method1854(var4, 4);
            } else {
                Statics.field3042[0].method1854(var4, 4);
            }
            if (class28.field682[0] == 2 && class28.field676[0] == 1) {
                Statics.field3042[3].method1854(var4 + 15, 4);
            } else {
                Statics.field3042[1].method1854(var4 + 15, 4);
            }
            arg0.method3932(class161.field2392, var4 + 32, 17, 16777215, -1);
            int var5 = field759 + 610;
            if (class28.field682[0] == 3 && class28.field676[0] == 0) {
                Statics.field3042[2].method1854(var5, 4);
            } else {
                Statics.field3042[0].method1854(var5, 4);
            }
            if (class28.field682[0] == 3 && class28.field676[0] == 1) {
                Statics.field3042[3].method1854(var5 + 15, 4);
            } else {
                Statics.field3042[1].method1854(var5 + 15, 4);
            }
            arg0.method3932(class161.field2634, var5 + 32, 17, 16777215, -1);
        }
        class83.method1813(field759 + 708, 4, 50, 16, 0);
        arg1.method3874(class161.field2579, field759 + 708 + 25, 16, 16777215, -1);
        field793 = -1;
        if (Statics.field709 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class28.field674) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class28.field674) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class28.field674) {
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
            int var17 = field759 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class28.field674; var20++) {
                class28 var21 = Statics.field2033[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field678);
                if (var21.field678 == -1) {
                    var23 = class161.field2425;
                    var22 = false;
                } else if (var21.field678 > 1980) {
                    var23 = class161.field2636;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method600()) {
                    if (var21.method595()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method599()) {
                    var24 = 16711680;
                    if (var21.method595()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method597()) {
                    if (var21.method595()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method595()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class144.field2199 >= var17 && class144.field2202 >= var16 && class144.field2199 < var6 + var17 && class144.field2202 < var7 + var16 && var22) {
                    field793 = var20;
                    Statics.field709[var25].method1734(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field709[var25].method1702(var17, var16);
                }
                if (Statics.field155 != null) {
                    Statics.field155[(var21.method595() ? 8 : 0) + var21.field684].method1854(var17 + 29, var16);
                }
                arg0.method3874(Integer.toString(var21.field675), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3874(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3934(Statics.field2033[field793].field683) + 6;
                int var27 = arg1.field3243 + 8;
                class83.method1813(class144.field2199 - var26 / 2, class144.field2202 + 20 + 5, var26, var27, 16777120);
                class83.method1827(class144.field2199 - var26 / 2, class144.field2202 + 20 + 5, var26, var27, 0);
                arg1.method3874(Statics.field2033[field793].field683, class144.field2199, class144.field2202 + 20 + 5 + arg1.field3243 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field2347.getGraphics();
            Statics.field1040.method1610(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field2347.repaint();
        }
    }

    @ObfuscatedName("ev.j(Lak;B)V")
    public static void method3027(class28 arg0) {
        if (arg0.method595() != client.field389) {
            client.field389 = arg0.method595();
            boolean var1 = arg0.method595();
            if (Statics.field722 != var1) {
                class56.method1039();
                Statics.field722 = var1;
            }
        }
        Statics.field331 = arg0.field686;
        client.field469 = arg0.field675;
        client.field293 = arg0.field677;
        Statics.field1281 = client.field400 == 0 ? 43594 : arg0.field675 + 40000;
        Statics.field912 = client.field400 == 0 ? 443 : arg0.field675 + 50000;
        Statics.field1746 = Statics.field1281;
    }

    @ObfuscatedName("m.w(I)V")
    public static void method530() {
        if (class28.method3958()) {
            field758 = true;
        }
    }
}
