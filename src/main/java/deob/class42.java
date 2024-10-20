package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("ak")
public class class42 {

    @ObfuscatedName("ak.d")
    public static int field840 = 0;

    @ObfuscatedName("ak.f")
    public static int field846 = field840 + 202;

    @ObfuscatedName("ak.t")
    public static int[] field847 = new int[256];

    @ObfuscatedName("ak.l")
    public static int field849 = 0;

    @ObfuscatedName("ak.x")
    public static int field850 = 0;

    @ObfuscatedName("ak.at")
    public static int field853 = 0;

    @ObfuscatedName("ak.au")
    public static int field854 = 0;

    @ObfuscatedName("ak.am")
    public static int field839 = 0;

    @ObfuscatedName("ak.ad")
    public static int field856 = 0;

    @ObfuscatedName("ak.ai")
    public static int field852 = 10;

    @ObfuscatedName("ak.ac")
    public static String field877 = "";

    @ObfuscatedName("ak.ao")
    public static int field859 = 0;

    @ObfuscatedName("ak.as")
    public static String field860 = "";

    @ObfuscatedName("ak.aa")
    public static String field861 = "";

    @ObfuscatedName("ak.ah")
    public static String field862 = "";

    @ObfuscatedName("ak.aj")
    public static String field871 = "";

    @ObfuscatedName("ak.aw")
    public static String field864 = "";

    @ObfuscatedName("ak.ap")
    public static String field865 = "";

    @ObfuscatedName("ak.ak")
    public static class98 field866 = class98.field1635;

    @ObfuscatedName("ak.an")
    public static boolean field867 = true;

    @ObfuscatedName("ak.ar")
    public static int field868 = 0;

    @ObfuscatedName("ak.ab")
    public static String field857 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ak.az")
    public static String field870 = "1234567890";

    @ObfuscatedName("ak.av")
    public static boolean field851 = false;

    @ObfuscatedName("ak.bj")
    public static int field869 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.q(Lgj;Lgj;B)I")
    public static int method218(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3134("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3134("logo", "")) {
            var2++;
        }
        if (arg1.method3134("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3134("titlebox", "")) {
            var2++;
        }
        if (arg1.method3134("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3134("runes", "")) {
            var2++;
        }
        if (arg1.method3134("title_mute", "")) {
            var2++;
        }
        if (arg1.method3135("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3135("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3134("sl_back", "");
        arg1.method3134("sl_flags", "");
        arg1.method3134("sl_arrows", "");
        arg1.method3134("sl_stars", "");
        arg1.method3134("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bv.d(S)I")
    public static int method1445() {
        return 9;
    }

    @ObfuscatedName("k.h(Ljava/awt/Component;Lgj;Lgj;ZIB)V")
    public static void method217(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field842) {
            field859 = arg4;
            class220.method3845();
            byte[] var5 = arg1.method3151("title.jpg", "");
            Statics.field61 = new class225(var5, arg0);
            Statics.field58 = Statics.field61.method3929();
            if ((client.field304 & 0x20000000) == 0) {
                Statics.field47 = class226.method1366(arg2, "logo", "");
            } else {
                Statics.field47 = class226.method1366(arg2, "logo_deadman_mode", "");
            }
            Statics.field872 = class226.method1366(arg2, "titlebox", "");
            Statics.field3077 = class226.method1366(arg2, "titlebutton", "");
            Statics.field990 = class226.method1887(arg2, "runes", "");
            Statics.field875 = class226.method1887(arg2, "title_mute", "");
            Statics.field814 = class226.method1366(arg2, "options_radio_buttons,0", "");
            Statics.field843 = class226.method1366(arg2, "options_radio_buttons,2", "");
            Statics.field3129 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field3129[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field3129[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field3129[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field3129[var9 + 192] = 16777215;
            }
            Statics.field723 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field723[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field723[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field723[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field723[var13 + 192] = 16777215;
            }
            Statics.field62 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field62[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field62[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field62[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field62[var17 + 192] = 16777215;
            }
            Statics.field848 = new int[256];
            Statics.field855 = new int[32768];
            Statics.field243 = new int[32768];
            method100((class223) null);
            Statics.field873 = new int[32768];
            Statics.field1444 = new int[32768];
            if (arg3) {
                field864 = "";
                field865 = "";
            }
            Statics.field1729 = 0;
            Statics.field719 = "";
            field867 = true;
            field851 = false;
            if (Statics.field2736.field721) {
                class139.method2199(2);
            } else {
                class139.method168(2, Statics.field128, "scape main", "", 255, false);
            }
            class186.method2036(false);
            Statics.field842 = true;
            field840 = (Statics.field759 - client.field564) / 2;
            field846 = field840 + 202;
            Statics.field61.method3939(field840, 0);
            Statics.field58.method3939(field840 + 382, 0);
            Statics.field47.method3904(field840 + 382 - Statics.field47.field3211 / 2, 18);
        } else if (arg4 == 4) {
            field859 = 4;
        }
    }

    @ObfuscatedName("g.p(Lde;B)V")
    public static void method253(class114 arg0) {
        if (field851) {
            method2881(arg0);
            return;
        }
        if ((class116.field1805 == 1 || !Statics.field174 && class116.field1805 == 4) && class116.field1797 >= field840 + 765 - 50 && class116.field1807 >= 453) {
            Statics.field2736.field721 = !Statics.field2736.field721;
            class31.method1906();
            if (Statics.field2736.field721) {
                Statics.field1917.method2469();
                class139.field1920 = 1;
                Statics.field2183 = null;
            } else {
                class185 var1 = Statics.field128;
                int var2 = var1.method3148("scape main");
                int var3 = var1.method3132(var2, "");
                class139.method1399(var1, var2, var3, 255, false);
            }
        }
        if (client.field313 == 5) {
            return;
        }
        field839++;
        if (client.field313 != 10 && client.field313 != 11) {
            return;
        }
        if (client.field310 == 0) {
            if (class116.field1805 == 1 || !Statics.field174 && class116.field1805 == 4) {
                int var4 = field840 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class116.field1797 >= var4 && class116.field1797 <= var4 + var6 && class116.field1807 >= var5 && class116.field1807 <= var5 + var7) {
                    if (class30.method3269()) {
                        field851 = true;
                    }
                    return;
                }
            }
            if (Statics.field221 != null && class30.method3269()) {
                field851 = true;
            }
        }
        int var8 = class116.field1805;
        int var9 = class116.field1797;
        int var10 = class116.field1807;
        if (!Statics.field174 && var8 == 4) {
            var8 = 1;
        }
        if (field859 == 0) {
            boolean var11 = false;
            while (class106.method2941()) {
                if (Statics.field73 == 84) {
                    var11 = true;
                }
            }
            int var12 = field846 + 180 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                String var14 = client.method863("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class115.method1442(var14, true, "openjs", false);
            }
            int var15 = field846 + 180 + 80;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field304 & 0x2000000) != 0) {
                    field860 = "";
                    field861 = class174.field2583;
                    field862 = class174.field2584;
                    field871 = class174.field2596;
                    field859 = 1;
                    field868 = 0;
                } else if ((client.field304 & 0x4) != 0) {
                    if ((client.field304 & 0x400) == 0) {
                        field861 = class174.field2574;
                        field862 = class174.field2575;
                        field871 = class174.field2564;
                    } else {
                        field861 = class174.field2580;
                        field862 = class174.field2576;
                        field871 = class174.field2476;
                    }
                    field860 = class174.field2573;
                    field859 = 1;
                    field868 = 0;
                } else if ((client.field304 & 0x400) == 0) {
                    field861 = class174.field2431;
                    field862 = class174.field2571;
                    field871 = class174.field2421;
                    field859 = 2;
                    field868 = 0;
                } else {
                    field861 = class174.field2514;
                    field862 = class174.field2578;
                    field871 = class174.field2567;
                    field860 = class174.field2573;
                    field859 = 1;
                    field868 = 0;
                }
            }
        } else if (field859 == 1) {
            while (class106.method2941()) {
                if (Statics.field73 == 84) {
                    field861 = class174.field2431;
                    field862 = class174.field2571;
                    field871 = class174.field2421;
                    field859 = 2;
                    field868 = 0;
                } else if (Statics.field73 == 13) {
                    field859 = 0;
                }
            }
            int var16 = field846 + 180 - 80;
            short var17 = 321;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var17 - 20 && var10 <= var17 + 20) {
                field861 = class174.field2431;
                field862 = class174.field2571;
                field871 = class174.field2421;
                field859 = 2;
                field868 = 0;
            }
            int var18 = field846 + 180 + 80;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var17 - 20 && var10 <= var17 + 20) {
                field859 = 0;
            }
        } else if (field859 == 2) {
            short var19 = 231;
            int var42 = var19 + 30;
            if (var8 == 1 && var10 >= var42 - 15 && var10 < var42) {
                field868 = 0;
            }
            var42 += 15;
            if (var8 == 1 && var10 >= var42 - 15 && var10 < var42) {
                field868 = 1;
            }
            var42 += 15;
            short var20 = 361;
            if (var8 == 1 && var10 >= var20 - 15 && var10 < var20) {
                method2397(class174.field2609, class174.field2528, class174.field2611);
                field859 = 5;
                return;
            }
            int var21 = field846 + 180 - 80;
            short var22 = 321;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var22 - 20 && var10 <= var22 + 20) {
                field864 = field864.trim();
                if (field864.length() == 0) {
                    method2397(class174.field2523, class174.field2477, class174.field2478);
                    return;
                }
                if (field865.length() == 0) {
                    method2397(class174.field2479, class174.field2565, class174.field2481);
                    return;
                }
                method2397(class174.field2588, class174.field2589, class174.field2539);
                field866 = Statics.field2736.field718.containsKey(class208.method251(field864)) ? class98.field1642 : class98.field1635;
                client.method101(20);
                return;
            }
            int var23 = field846 + 180 + 80;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var22 - 20 && var10 <= var22 + 20) {
                field859 = 0;
                field864 = "";
                field865 = "";
                Statics.field1729 = 0;
                Statics.field719 = "";
                field867 = true;
            }
            while (true) {
                while (class106.method2941()) {
                    boolean var24 = false;
                    for (int var25 = 0; var25 < field857.length(); var25++) {
                        if (Statics.field773 == field857.charAt(var25)) {
                            var24 = true;
                            break;
                        }
                    }
                    if (Statics.field73 == 13) {
                        field859 = 0;
                        field864 = "";
                        field865 = "";
                        Statics.field1729 = 0;
                        Statics.field719 = "";
                        field867 = true;
                    } else if (field868 == 0) {
                        if (Statics.field73 == 85 && field864.length() > 0) {
                            field864 = field864.substring(0, field864.length() - 1);
                        }
                        if (Statics.field73 == 84 || Statics.field73 == 80) {
                            field868 = 1;
                        }
                        if (var24 && field864.length() < 320) {
                            field864 = field864 + Statics.field773;
                        }
                    } else if (field868 == 1) {
                        if (Statics.field73 == 85 && field865.length() > 0) {
                            field865 = field865.substring(0, field865.length() - 1);
                        }
                        if (Statics.field73 == 84 || Statics.field73 == 80) {
                            field868 = 0;
                        }
                        if (Statics.field73 == 84) {
                            field864 = field864.trim();
                            if (field864.length() == 0) {
                                method2397(class174.field2523, class174.field2477, class174.field2478);
                                return;
                            }
                            if (field865.length() == 0) {
                                method2397(class174.field2479, class174.field2565, class174.field2481);
                                return;
                            }
                            method2397(class174.field2588, class174.field2589, class174.field2539);
                            field866 = Statics.field2736.field718.containsKey(class208.method251(field864)) ? class98.field1642 : class98.field1635;
                            client.method101(20);
                            return;
                        }
                        if (var24 && field865.length() < 20) {
                            field865 = field865 + Statics.field773;
                        }
                    }
                }
                return;
            }
        } else if (field859 == 3) {
            int var26 = field846 + 180;
            short var27 = 276;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                field861 = class174.field2431;
                field862 = class174.field2571;
                field871 = class174.field2421;
                field859 = 2;
                field868 = 0;
            }
            int var28 = field846 + 180;
            short var29 = 326;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                method2397(class174.field2609, class174.field2528, class174.field2611);
                field859 = 5;
                return;
            }
        } else if (field859 == 4) {
            int var30 = field846 + 180 - 80;
            short var31 = 321;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var31 - 20 && var10 <= var31 + 20) {
                Statics.field719.trim();
                if (Statics.field719.length() != 6) {
                    method2397(class174.field2395, class174.field2396, class174.field2397);
                    return;
                }
                Statics.field1729 = Integer.parseInt(Statics.field719);
                Statics.field719 = "";
                field866 = field867 ? class98.field1634 : class98.field1637;
                method2397(class174.field2588, class174.field2589, class174.field2539);
                client.method101(20);
                return;
            }
            if (var8 == 1 && var9 >= field846 + 180 - 9 && var9 <= field846 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field867 = !field867;
            }
            if (var8 == 1 && var9 >= field846 + 180 - 34 && var9 <= field846 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                String var32 = client.method863("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class115.method1442(var32, true, "openjs", false);
            }
            int var33 = field846 + 180 + 80;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var31 - 20 && var10 <= var31 + 20) {
                field859 = 0;
                field864 = "";
                field865 = "";
                Statics.field1729 = 0;
                Statics.field719 = "";
            }
            while (class106.method2941()) {
                boolean var34 = false;
                for (int var35 = 0; var35 < field870.length(); var35++) {
                    if (Statics.field773 == field870.charAt(var35)) {
                        var34 = true;
                        break;
                    }
                }
                if (Statics.field73 == 13) {
                    field859 = 0;
                    field864 = "";
                    field865 = "";
                    Statics.field1729 = 0;
                    Statics.field719 = "";
                } else {
                    if (Statics.field73 == 85 && Statics.field719.length() > 0) {
                        Statics.field719 = Statics.field719.substring(0, Statics.field719.length() - 1);
                    }
                    if (Statics.field73 == 84) {
                        Statics.field719.trim();
                        if (Statics.field719.length() != 6) {
                            method2397(class174.field2395, class174.field2396, class174.field2397);
                            return;
                        }
                        Statics.field1729 = Integer.parseInt(Statics.field719);
                        Statics.field719 = "";
                        field866 = field867 ? class98.field1634 : class98.field1637;
                        method2397(class174.field2588, class174.field2589, class174.field2539);
                        client.method101(20);
                        return;
                    }
                    if (var34 && Statics.field719.length() < 6) {
                        Statics.field719 = Statics.field719 + Statics.field773;
                    }
                }
            }
        } else if (field859 == 5) {
            int var36 = field846 + 180 - 80;
            short var37 = 321;
            if (var8 == 1 && var9 >= var36 - 75 && var9 <= var36 + 75 && var10 >= var37 - 20 && var10 <= var37 + 20) {
                method1896();
                return;
            }
            int var38 = field846 + 180 + 80;
            if (var8 == 1 && var9 >= var38 - 75 && var9 <= var38 + 75 && var10 >= var37 - 20 && var10 <= var37 + 20) {
                field861 = class174.field2431;
                field862 = class174.field2571;
                field871 = class174.field2421;
                field859 = 2;
                field868 = 0;
                field865 = "";
            }
            while (class106.method2941()) {
                boolean var39 = false;
                for (int var40 = 0; var40 < field857.length(); var40++) {
                    if (Statics.field773 == field857.charAt(var40)) {
                        var39 = true;
                        break;
                    }
                }
                if (Statics.field73 == 13) {
                    field861 = class174.field2431;
                    field862 = class174.field2571;
                    field871 = class174.field2421;
                    field859 = 2;
                    field868 = 0;
                    field865 = "";
                } else {
                    if (Statics.field73 == 85 && field864.length() > 0) {
                        field864 = field864.substring(0, field864.length() - 1);
                    }
                    if (Statics.field73 == 84) {
                        method1896();
                        return;
                    }
                    if (var39 && field864.length() < 320) {
                        field864 = field864 + Statics.field773;
                    }
                }
            }
        } else if (field859 == 6) {
            while (true) {
                do {
                    if (!class106.method2941()) {
                        short var41 = 321;
                        if (var8 == 1 && var10 >= var41 - 20 && var10 <= var41 + 20) {
                            field861 = class174.field2431;
                            field862 = class174.field2571;
                            field871 = class174.field2421;
                            field859 = 2;
                            field868 = 0;
                            field865 = "";
                        }
                        return;
                    }
                } while (Statics.field73 != 84 && Statics.field73 != 13);
                field861 = class174.field2431;
                field862 = class174.field2571;
                field871 = class174.field2421;
                field859 = 2;
                field868 = 0;
                field865 = "";
            }
        }
    }

    @ObfuscatedName("cr.j(B)V")
    public static void method1896() {
        field864 = field864.trim();
        if (field864.length() == 0) {
            method2397(class174.field2609, class174.field2528, class174.field2611);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method863("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class154 var4 = new class154(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2092, var4.field2091, 1000 - var4.field2091);
                if (var5 == -1) {
                    var4.field2091 = 0;
                    long var8 = var4.method2652();
                    var6 = var8;
                    break;
                }
                var4.field2091 += var5;
                if (var4.field2091 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class37.method11(var6, field864);
        }
        switch(var13) {
            case 2:
                method2397(class174.field2561, class174.field2444, class174.field2614);
                field859 = 6;
                break;
            case 3:
                method2397(class174.field2615, class174.field2616, class174.field2569);
                break;
            case 4:
                method2397(class174.field2618, class174.field2619, class174.field2570);
                break;
            case 5:
                method2397(class174.field2621, class174.field2622, class174.field2623);
                break;
            case 6:
                method2397(class174.field2595, class174.field2434, class174.field2613);
                break;
            case 7:
                method2397(class174.field2627, class174.field2628, class174.field2425);
        }
    }

    @ObfuscatedName("ag.n(Lhk;Lhk;Lhk;ZI)V")
    public static void method861(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field840 = (Statics.field759 - client.field564) / 2;
            field846 = field840 + 202;
        }
        if (field851) {
            method199(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field61.method3939(field840, 0);
            Statics.field58.method3939(field840 + 382, 0);
            Statics.field47.method3904(field840 + 382 - Statics.field47.field3211 / 2, 18);
        }
        if (client.field313 == 0 || client.field313 == 5) {
            byte var4 = 20;
            arg0.method3708(class174.field2369, field846 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class220.method3818(field846 + 180 - 152, var5, 304, 34, 9179409);
            class220.method3818(field846 + 180 - 151, var5 + 1, 302, 32, 0);
            class220.method3812(field846 + 180 - 150, var5 + 2, field852 * 3, 30, 9179409);
            class220.method3812(field852 * 3 + (field846 + 180 - 150), var5 + 2, 300 - field852 * 3, 30, 0);
            arg0.method3708(field877, field846 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field313 == 20) {
            Statics.field872.method3904(field846 + 180 - Statics.field872.field3211 / 2, 271 - Statics.field872.field3209 / 2);
            short var6 = 211;
            arg0.method3708(field861, field846 + 180, var6, 16776960, 0);
            int var91 = var6 + 15;
            arg0.method3708(field862, field846 + 180, var91, 16776960, 0);
            int var92 = var91 + 15;
            arg0.method3708(field871, field846 + 180, var92, 16776960, 0);
            int var93 = var92 + 15;
            int var94 = var93 + 10;
            if (field859 != 4) {
                arg0.method3705(class174.field2591, field846 + 180 - 110, var94, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field864; arg0.method3724(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3705(class210.method3761(var8), field846 + 180 - 70, var94, 16777215, 0);
                var91 = var94 + 15;
                String var10 = class174.field2592;
                String var11 = field865;
                String var12 = class208.method71('*', var11.length());
                arg0.method3705(var10 + var12, field846 + 180 - 108, var91, 16777215, 0);
                var91 += 15;
            }
        }
        if (client.field313 == 10 || client.field313 == 11) {
            Statics.field872.method3904(field846, 171);
            if (field859 == 0) {
                short var13 = 251;
                arg0.method3708(class174.field2594, field846 + 180, var13, 16776960, 0);
                int var95 = var13 + 30;
                int var14 = field846 + 180 - 80;
                short var15 = 291;
                Statics.field3077.method3904(var14 - 73, var15 - 20);
                arg0.method3709(class174.field2483, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field846 + 180 + 80;
                Statics.field3077.method3904(var16 - 73, var15 - 20);
                arg0.method3709(class174.field2634, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field859 == 1) {
                arg0.method3708(field860, field846 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3708(field861, field846 + 180, var17, 16777215, 0);
                int var96 = var17 + 15;
                arg0.method3708(field862, field846 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method3708(field871, field846 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                int var18 = field846 + 180 - 80;
                short var19 = 321;
                Statics.field3077.method3904(var18 - 73, var19 - 20);
                arg0.method3708(class174.field2367, var18, var19 + 5, 16777215, 0);
                int var20 = field846 + 180 + 80;
                Statics.field3077.method3904(var20 - 73, var19 - 20);
                arg0.method3708(class174.field2598, var20, var19 + 5, 16777215, 0);
            } else if (field859 == 2) {
                short var21 = 211;
                arg0.method3708(field861, field846 + 180, var21, 16776960, 0);
                int var99 = var21 + 15;
                arg0.method3708(field862, field846 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3708(field871, field846 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 10;
                arg0.method3705(class174.field2591, field846 + 180 - 110, var102, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field864; arg0.method3724(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3705(class210.method3761(var23) + (field868 == 0 & client.field450 % 40 < 20 ? class38.method200(16776960) + class38.field807 : ""), field846 + 180 - 70, var102, 16777215, 0);
                var99 = var102 + 15;
                String var25 = class174.field2592;
                String var26 = field865;
                String var27 = class208.method71('*', var26.length());
                arg0.method3705(var25 + var27 + (field868 == 1 & client.field450 % 40 < 20 ? class38.method200(16776960) + class38.field807 : ""), field846 + 180 - 108, var99, 16777215, 0);
                var99 += 15;
                int var28 = field846 + 180 - 80;
                short var29 = 321;
                Statics.field3077.method3904(var28 - 73, var29 - 20);
                arg0.method3708(class174.field2597, var28, var29 + 5, 16777215, 0);
                int var30 = field846 + 180 + 80;
                Statics.field3077.method3904(var30 - 73, var29 - 20);
                arg0.method3708(class174.field2598, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3708(class174.field2604, field846 + 180, var31, 16776960, 0);
            } else if (field859 == 3) {
                short var32 = 201;
                arg0.method3708(class174.field2599, field846 + 180, var32, 16776960, 0);
                int var103 = var32 + 20;
                arg1.method3708(class174.field2600, field846 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg1.method3708(class174.field2601, field846 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var33 = field846 + 180;
                short var34 = 276;
                Statics.field3077.method3904(var33 - 73, var34 - 20);
                arg2.method3708(class174.field2542, var33, var34 + 5, 16777215, 0);
                int var35 = field846 + 180;
                short var36 = 326;
                Statics.field3077.method3904(var35 - 73, var36 - 20);
                arg2.method3708(class174.field2603, var35, var36 + 5, 16777215, 0);
            } else if (field859 == 4) {
                arg0.method3708(class174.field2586, field846 + 180, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3708(field861, field846 + 180, var37, 16777215, 0);
                int var106 = var37 + 15;
                arg0.method3708(field862, field846 + 180, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3708(field871, field846 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                String var39 = class174.field2593;
                String var40 = Statics.field719;
                String var41 = class208.method71('*', var40.length());
                arg0.method3705(var39 + var41 + (client.field450 % 40 < 20 ? class38.method200(16776960) + class38.field807 : ""), field846 + 180 - 108, var108, 16777215, 0);
                int var109 = var108 - 8;
                arg0.method3705(class174.field2506, field846 + 180 - 9, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3705(class174.field2370, field846 + 180 - 9, var110, 16776960, 0);
                int var42 = field846 + 180 - 9 + arg0.method3724(class174.field2370) + 15;
                int var43 = var110 - arg0.field3106;
                class223 var44;
                if (field867) {
                    var44 = Statics.field843;
                } else {
                    var44 = Statics.field814;
                }
                var44.method3904(var42, var43);
                var106 = var110 + 15;
                int var45 = field846 + 180 - 80;
                short var46 = 321;
                Statics.field3077.method3904(var45 - 73, var46 - 20);
                arg0.method3708(class174.field2367, var45, var46 + 5, 16777215, 0);
                int var47 = field846 + 180 + 80;
                Statics.field3077.method3904(var47 - 73, var46 - 20);
                arg0.method3708(class174.field2598, var47, var46 + 5, 16777215, 0);
                arg1.method3708(class174.field2409, field846 + 180, var46 + 36, 255, 0);
            } else if (field859 == 5) {
                arg0.method3708(class174.field2522, field846 + 180, 201, 16776960, 0);
                short var48 = 221;
                arg2.method3708(field861, field846 + 180, var48, 16776960, 0);
                int var111 = var48 + 15;
                arg2.method3708(field862, field846 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg2.method3708(field871, field846 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 14;
                arg0.method3705(class174.field2408, field846 + 180 - 145, var114, 16777215, 0);
                short var49 = 174;
                String var50;
                for (var50 = field864; arg0.method3724(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method3705(class210.method3761(var50) + (client.field450 % 40 < 20 ? class38.method200(16776960) + class38.field807 : ""), field846 + 180 - 34, var114, 16777215, 0);
                var111 = var114 + 15;
                int var51 = field846 + 180 - 80;
                short var52 = 321;
                Statics.field3077.method3904(var51 - 73, var52 - 20);
                arg0.method3708(class174.field2608, var51, var52 + 5, 16777215, 0);
                int var53 = field846 + 180 + 80;
                Statics.field3077.method3904(var53 - 73, var52 - 20);
                arg0.method3708(class174.field2631, var53, var52 + 5, 16777215, 0);
            } else if (field859 == 6) {
                short var54 = 211;
                arg0.method3708(field861, field846 + 180, var54, 16776960, 0);
                int var115 = var54 + 15;
                arg0.method3708(field862, field846 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3708(field871, field846 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var55 = field846 + 180;
                short var56 = 321;
                Statics.field3077.method3904(var55 - 73, var56 - 20);
                arg0.method3708(class174.field2631, var55, var56 + 5, 16777215, 0);
            }
        }
        if (field839 > 0) {
            int var57 = field839;
            short var58 = 256;
            field853 += var57 * 128;
            if (field853 > Statics.field855.length) {
                field853 -= Statics.field855.length;
                int var59 = (int) (Math.random() * 12.0D);
                method100(Statics.field990[var59]);
            }
            int var60 = 0;
            int var61 = var57 * 128;
            int var62 = (var58 - var57) * 128;
            for (int var63 = 0; var63 < var62; var63++) {
                int var64 = Statics.field873[var60 + var61] - Statics.field855[field853 + var60 & Statics.field855.length - 1] * var57 / 6;
                if (var64 < 0) {
                    var64 = 0;
                }
                Statics.field873[var60++] = var64;
            }
            for (int var65 = var58 - var57; var65 < var58; var65++) {
                int var66 = var65 * 128;
                for (int var67 = 0; var67 < 128; var67++) {
                    int var68 = (int) (Math.random() * 100.0D);
                    if (var68 < 50 && var67 > 10 && var67 < 118) {
                        Statics.field873[var66 + var67] = 255;
                    } else {
                        Statics.field873[var66 + var67] = 0;
                    }
                }
            }
            if (field849 > 0) {
                field849 -= var57 * 4;
            }
            if (field850 > 0) {
                field850 -= var57 * 4;
            }
            if (field849 == 0 && field850 == 0) {
                int var69 = (int) (Math.random() * (double) (2000 / var57));
                if (var69 == 0) {
                    field849 = 1024;
                }
                if (var69 == 1) {
                    field850 = 1024;
                }
            }
            for (int var70 = 0; var70 < var58 - var57; var70++) {
                field847[var70] = field847[var57 + var70];
            }
            for (int var71 = var58 - var57; var71 < var58; var71++) {
                field847[var71] = (int) (Math.sin((double) field856 / 14.0D) * 16.0D + Math.sin((double) field856 / 15.0D) * 14.0D + Math.sin((double) field856 / 16.0D) * 12.0D);
                field856++;
            }
            field854 += var57 * -452692613;
            int var72 = ((client.field450 & 0x1) + var57) / 2;
            if (var72 > 0) {
                for (int var73 = 0; var73 < field854 * 726215148; var73++) {
                    int var74 = (int) (Math.random() * 124.0D) + 2;
                    int var75 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field873[(var75 << 7) + var74] = 192;
                }
                field854 = 0;
                int var76 = 0;
                label226: while (true) {
                    if (var76 >= var58) {
                        int var80 = 0;
                        while (true) {
                            if (var80 >= 128) {
                                break label226;
                            }
                            int var81 = 0;
                            for (int var82 = -var72; var82 < var58; var82++) {
                                int var83 = var82 * 128;
                                if (var72 + var82 < var58) {
                                    var81 += Statics.field1444[var72 * 128 + var80 + var83];
                                }
                                if (var82 - (var72 + 1) >= 0) {
                                    var81 -= Statics.field1444[var80 + var83 - (var72 + 1) * 128];
                                }
                                if (var82 >= 0) {
                                    Statics.field873[var80 + var83] = var81 / (var72 * 2 + 1);
                                }
                            }
                            var80++;
                        }
                    }
                    int var77 = 0;
                    int var78 = var76 * 128;
                    for (int var79 = -var72; var79 < 128; var79++) {
                        if (var72 + var79 < 128) {
                            var77 += Statics.field873[var78 + var79 + var72];
                        }
                        if (var79 - (var72 + 1) >= 0) {
                            var77 -= Statics.field873[var78 + var79 - (var72 + 1)];
                        }
                        if (var79 >= 0) {
                            Statics.field1444[var78 + var79] = var77 / (var72 * 2 + 1);
                        }
                    }
                    var76++;
                }
            }
            field839 = 0;
        }
        method3195();
        Statics.field875[Statics.field2736.field721 ? 1 : 0].method3904(field840 + 765 - 40, 463);
        if (client.field313 > 5 && client.field310 == 0) {
            if (Statics.field85 == null) {
                Statics.field85 = class226.method1366(Statics.field2168, "sl_button", "");
            } else {
                int var84 = field840 + 5;
                short var85 = 463;
                byte var86 = 100;
                byte var87 = 35;
                Statics.field85.method3904(var84, var85);
                arg0.method3708(class174.field2524 + " " + client.field303, var86 / 2 + var84, var87 / 2 + var85 - 2, 16777215, 0);
                if (Statics.field221 == null) {
                    arg1.method3708(class174.field2640, var86 / 2 + var84, var87 / 2 + var85 + 12, 16777215, 0);
                } else {
                    arg1.method3708(class174.field2639, var86 / 2 + var84, var87 / 2 + var85 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var88 = Statics.field1631.getGraphics();
            Statics.field691.method3802(var88, 0, 0);
        } catch (Exception var90) {
            Statics.field1631.repaint();
        }
    }

    @ObfuscatedName("ev.c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2397(String arg0, String arg1, String arg2) {
        field861 = arg0;
        field862 = arg1;
        field871 = arg2;
    }

    @ObfuscatedName("i.o(Lhg;I)V")
    public static final void method100(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field855.length; var2++) {
            Statics.field855[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field855[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field243[var8] = (Statics.field855[var8 - 1] + Statics.field855[var8 + 1] + Statics.field855[var8 - 128] + Statics.field855[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field855;
            Statics.field855 = Statics.field243;
            Statics.field243 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3209; var11++) {
            for (int var12 = 0; var12 < arg0.field3211; var12++) {
                if (arg0.field3212[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3213;
                    int var14 = var11 + 16 + arg0.field3214;
                    int var15 = (var14 << 7) + var13;
                    Statics.field855[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("br.s(IIII)I")
    public static final int method1400(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ga.u(I)V")
    public static final void method3195() {
        short var0 = 256;
        if (field849 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field849 > 768) {
                    Statics.field848[var1] = method1400(Statics.field3129[var1], Statics.field723[var1], 1024 - field849);
                } else if (field849 > 256) {
                    Statics.field848[var1] = Statics.field723[var1];
                } else {
                    Statics.field848[var1] = method1400(Statics.field723[var1], Statics.field3129[var1], 256 - field849);
                }
            }
        } else if (field850 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field850 > 768) {
                    Statics.field848[var2] = method1400(Statics.field3129[var2], Statics.field62[var2], 1024 - field850);
                } else if (field850 > 256) {
                    Statics.field848[var2] = Statics.field62[var2];
                } else {
                    Statics.field848[var2] = method1400(Statics.field62[var2], Statics.field3129[var2], 256 - field850);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field848[var3] = Statics.field3129[var3];
            }
        }
        class220.method3832(field840, 9, field840 + 128, var0 + 7);
        Statics.field61.method3939(field840, 0);
        class220.method3859();
        int var4 = 0;
        int var5 = field840 + Statics.field691.field3199 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field847[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field873[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field848[var10];
                    int var14 = Statics.field691.field3197[var5];
                    Statics.field691.field3197[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field691.field3199 + var8 - 128;
        }
        class220.method3832(field840 + 765 - 128, 9, field840 + 765, var0 + 7);
        Statics.field58.method3939(field840 + 382, 0);
        class220.method3859();
        int var15 = 0;
        int var16 = field840 + Statics.field691.field3199 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field847[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field873[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field848[var22];
                    int var26 = Statics.field691.field3197[var20];
                    Statics.field691.field3197[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field691.field3199 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("y.b(Lhk;Lhk;I)V")
    public static void method199(class209 arg0, class209 arg1) {
        if (Statics.field745 == null) {
            Statics.field745 = class226.method708(Statics.field2168, "sl_back", "");
        }
        if (Statics.field222 == null) {
            Statics.field222 = class226.method1887(Statics.field2168, "sl_flags", "");
        }
        if (Statics.field798 == null) {
            Statics.field798 = class226.method1887(Statics.field2168, "sl_arrows", "");
        }
        if (Statics.field102 == null) {
            Statics.field102 = class226.method1887(Statics.field2168, "sl_stars", "");
        }
        class220.method3812(field840, 23, 765, 480, 0);
        class220.method3817(field840, 0, 125, 23, 12425273, 9135624);
        class220.method3817(field840 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3708(class174.field2418, field840 + 62, 15, 0, -1);
        if (Statics.field102 != null) {
            Statics.field102[1].method3904(field840 + 140, 1);
            arg1.method3705(class174.field2566, field840 + 152, 10, 16777215, -1);
            Statics.field102[0].method3904(field840 + 140, 12);
            arg1.method3705(class174.field2632, field840 + 152, 21, 16777215, -1);
        }
        if (Statics.field798 != null) {
            int var2 = field840 + 280;
            if (class30.field699[0] == 0 && class30.field698[0] == 0) {
                Statics.field798[2].method3904(var2, 4);
            } else {
                Statics.field798[0].method3904(var2, 4);
            }
            if (class30.field699[0] == 0 && class30.field698[0] == 1) {
                Statics.field798[3].method3904(var2 + 15, 4);
            } else {
                Statics.field798[1].method3904(var2 + 15, 4);
            }
            arg0.method3705(class174.field2546, var2 + 32, 17, 16777215, -1);
            int var3 = field840 + 390;
            if (class30.field699[0] == 1 && class30.field698[0] == 0) {
                Statics.field798[2].method3904(var3, 4);
            } else {
                Statics.field798[0].method3904(var3, 4);
            }
            if (class30.field699[0] == 1 && class30.field698[0] == 1) {
                Statics.field798[3].method3904(var3 + 15, 4);
            } else {
                Statics.field798[1].method3904(var3 + 15, 4);
            }
            arg0.method3705(class174.field2629, var3 + 32, 17, 16777215, -1);
            int var4 = field840 + 500;
            if (class30.field699[0] == 2 && class30.field698[0] == 0) {
                Statics.field798[2].method3904(var4, 4);
            } else {
                Statics.field798[0].method3904(var4, 4);
            }
            if (class30.field699[0] == 2 && class30.field698[0] == 1) {
                Statics.field798[3].method3904(var4 + 15, 4);
            } else {
                Statics.field798[1].method3904(var4 + 15, 4);
            }
            arg0.method3705(class174.field2515, var4 + 32, 17, 16777215, -1);
            int var5 = field840 + 610;
            if (class30.field699[0] == 3 && class30.field698[0] == 0) {
                Statics.field798[2].method3904(var5, 4);
            } else {
                Statics.field798[0].method3904(var5, 4);
            }
            if (class30.field699[0] == 3 && class30.field698[0] == 1) {
                Statics.field798[3].method3904(var5 + 15, 4);
            } else {
                Statics.field798[1].method3904(var5 + 15, 4);
            }
            arg0.method3705(class174.field2636, var5 + 32, 17, 16777215, -1);
        }
        class220.method3812(field840 + 708, 4, 50, 16, 0);
        arg1.method3708(class174.field2598, field840 + 708 + 25, 16, 16777215, -1);
        field869 = -1;
        if (Statics.field745 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field704) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field704) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field704) {
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
            int var17 = field840 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field704; var20++) {
                class30 var21 = Statics.field695[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field702);
                if (var21.field702 == -1) {
                    var23 = class174.field2637;
                    var22 = false;
                } else if (var21.field702 > 1980) {
                    var23 = class174.field2638;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method645()) {
                    if (var21.method665()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method644()) {
                    var24 = 16711680;
                    if (var21.method665()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method642()) {
                    if (var21.method665()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method665()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1793 >= var17 && class116.field1800 >= var16 && class116.field1793 < var6 + var17 && class116.field1800 < var7 + var16 && var22) {
                    field869 = var20;
                    Statics.field745[var25].method3945(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field745[var25].method3939(var17, var16);
                }
                if (Statics.field222 != null) {
                    Statics.field222[(var21.method665() ? 8 : 0) + var21.field705].method3904(var17 + 29, var16);
                }
                arg0.method3708(Integer.toString(var21.field700), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3708(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3724(Statics.field695[field869].field692) + 6;
                int var27 = arg1.field3106 + 8;
                class220.method3812(class116.field1793 - var26 / 2, class116.field1800 + 20 + 5, var26, var27, 16777120);
                class220.method3818(class116.field1793 - var26 / 2, class116.field1800 + 20 + 5, var26, var27, 0);
                arg1.method3708(Statics.field695[field869].field692, class116.field1793, class116.field1800 + 20 + 5 + arg1.field3106 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1631.getGraphics();
            Statics.field691.method3802(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1631.repaint();
        }
    }

    @ObfuscatedName("fq.v(Lde;I)V")
    public static void method2881(class114 arg0) {
        if (class116.field1805 != 1 && Statics.field174 || class116.field1805 != 4) {
            return;
        }
        int var1 = field840 + 280;
        if (class116.field1797 >= var1 && class116.field1797 <= var1 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(0, 0);
            return;
        }
        if (class116.field1797 >= var1 + 15 && class116.field1797 <= var1 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(0, 1);
            return;
        }
        int var2 = field840 + 390;
        if (class116.field1797 >= var2 && class116.field1797 <= var2 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(1, 0);
            return;
        }
        if (class116.field1797 >= var2 + 15 && class116.field1797 <= var2 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(1, 1);
            return;
        }
        int var3 = field840 + 500;
        if (class116.field1797 >= var3 && class116.field1797 <= var3 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(2, 0);
            return;
        }
        if (class116.field1797 >= var3 + 15 && class116.field1797 <= var3 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(2, 1);
            return;
        }
        int var4 = field840 + 610;
        if (class116.field1797 >= var4 && class116.field1797 <= var4 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(3, 0);
            return;
        }
        if (class116.field1797 >= var4 + 15 && class116.field1797 <= var4 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
            class30.method94(3, 1);
            return;
        }
        if (class116.field1797 >= field840 + 708 && class116.field1807 >= 4 && class116.field1797 <= field840 + 708 + 50 && class116.field1807 <= 20) {
            field851 = false;
            Statics.field61.method3939(field840, 0);
            Statics.field58.method3939(field840 + 382, 0);
            Statics.field47.method3904(field840 + 382 - Statics.field47.field3211 / 2, 18);
            return;
        }
        if (field869 == -1) {
            return;
        }
        class30 var5 = Statics.field695[field869];
        method3289(var5);
        field851 = false;
        Statics.field61.method3939(field840, 0);
        Statics.field58.method3939(field840 + 382, 0);
        Statics.field47.method3904(field840 + 382 - Statics.field47.field3211 / 2, 18);
        return;
    }

    @ObfuscatedName("gy.f(Lau;B)V")
    public static void method3289(class30 arg0) {
        if (arg0.method665() != client.field308) {
            client.field308 = arg0.method665();
            class199.method782(arg0.method665());
        }
        Statics.field1662 = arg0.field696;
        client.field303 = arg0.field700;
        client.field304 = arg0.field703;
        Statics.field188 = client.field306 == 0 ? 43594 : arg0.field700 + 40000;
        Statics.field2159 = client.field306 == 0 ? 443 : arg0.field700 + 50000;
        Statics.field2000 = Statics.field188;
    }
}
