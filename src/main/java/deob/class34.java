package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ap")
public class class34 {

    @ObfuscatedName("ap.r")
    public static int field746 = 0;

    @ObfuscatedName("ap.s")
    public static int field728 = field746 + 202;

    @ObfuscatedName("ap.u")
    public static int[] field730 = new int[256];

    @ObfuscatedName("ap.y")
    public static int field743 = 0;

    @ObfuscatedName("ap.k")
    public static int field733 = 0;

    @ObfuscatedName("ap.ag")
    public static int field751 = 0;

    @ObfuscatedName("ap.as")
    public static int field750 = 0;

    @ObfuscatedName("ap.aq")
    public static int field752 = 0;

    @ObfuscatedName("ap.ax")
    public static int field737 = 0;

    @ObfuscatedName("ap.az")
    public static int field738 = 10;

    @ObfuscatedName("ap.ap")
    public static String field739 = "";

    @ObfuscatedName("ap.ao")
    public static int field721 = 0;

    @ObfuscatedName("ap.af")
    public static String field741 = "";

    @ObfuscatedName("ap.au")
    public static String field742 = "";

    @ObfuscatedName("ap.ab")
    public static String field744 = "";

    @ObfuscatedName("ap.at")
    public static String field748 = "";

    @ObfuscatedName("ap.ay")
    public static String field745 = "";

    @ObfuscatedName("ap.ad")
    public static String field734 = "";

    @ObfuscatedName("ap.am")
    public static class163 field747 = class163.field2663;

    @ObfuscatedName("ap.ak")
    public static boolean field732 = true;

    @ObfuscatedName("ap.ar")
    public static int field749 = 0;

    @ObfuscatedName("ap.aa")
    public static String field729 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ap.av")
    public static String field755 = "1234567890";

    @ObfuscatedName("ap.al")
    public static boolean field735 = false;

    @ObfuscatedName("ap.bw")
    public static int field753 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.x(Lfp;Lfp;S)I")
    public static int method157(class171 arg0, class171 arg1) {
        int var2 = 0;
        if (arg0.method3083("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3083("logo", "")) {
            var2++;
        }
        if (arg1.method3083("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3083("titlebox", "")) {
            var2++;
        }
        if (arg1.method3083("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3083("runes", "")) {
            var2++;
        }
        if (arg1.method3083("title_mute", "")) {
            var2++;
        }
        if (arg1.method3096("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3096("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3083("sl_back", "");
        arg1.method3083("sl_flags", "");
        arg1.method3083("sl_arrows", "");
        arg1.method3083("sl_stars", "");
        arg1.method3083("sl_button", "");
        return var2;
    }

    @ObfuscatedName("cr.r(Ljava/awt/Component;Lfp;Lfp;ZIB)V")
    public static void method2120(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field1616) {
            field721 = arg4;
            class83.method1726();
            byte[] var5 = arg1.method3085("title.jpg", "");
            Statics.field884 = new class82(var5, arg0);
            Statics.field196 = Statics.field884.method1625();
            if ((client.field284 & 0x20000000) == 0) {
                Statics.field2661 = class80.method642(arg2, "logo", "");
            } else {
                Statics.field2661 = class80.method642(arg2, "logo_deadman_mode", "");
            }
            Statics.field3277 = class80.method642(arg2, "titlebox", "");
            Statics.field722 = class80.method642(arg2, "titlebutton", "");
            Statics.field723 = class80.method867(arg2, "runes", "");
            Statics.field277 = class80.method867(arg2, "title_mute", "");
            Statics.field577 = class80.method642(arg2, "options_radio_buttons,0", "");
            Statics.field724 = class80.method642(arg2, "options_radio_buttons,2", "");
            Statics.field13 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field13[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field13[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field13[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field13[var9 + 192] = 16777215;
            }
            Statics.field1735 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1735[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1735[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1735[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1735[var13 + 192] = 16777215;
            }
            Statics.field1817 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1817[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1817[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1817[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1817[var17 + 192] = 16777215;
            }
            Statics.field731 = new int[256];
            Statics.field2099 = new int[32768];
            Statics.field660 = new int[32768];
            method2349((class84) null);
            Statics.field271 = new int[32768];
            Statics.field1836 = new int[32768];
            if (arg3) {
                field745 = "";
                field734 = "";
            }
            Statics.field2363 = 0;
            Statics.field1415 = "";
            field732 = true;
            field735 = false;
            if (Statics.field2660.field137) {
                class187.method740(2);
            } else {
                class187.method706(2, Statics.field3109, "scape main", "", 255, false);
            }
            class175.method551(false);
            Statics.field1616 = true;
            field746 = (Statics.field1500 - client.field334) / 2;
            field728 = field746 + 202;
            Statics.field884.method1635(field746, 0);
            Statics.field196.method1635(field746 + 382, 0);
            Statics.field2661.method1793(field746 + 382 - Statics.field2661.field1459 / 2, 18);
        } else if (arg4 == 4) {
            field721 = 4;
        }
    }

    @ObfuscatedName("bg.j(Lep;I)V")
    public static void method1145(class148 arg0) {
        if (field735) {
            method2728(arg0);
            return;
        }
        if ((class144.field2199 == 1 || !Statics.field2118 && class144.field2199 == 4) && class144.field2212 >= field746 + 765 - 50 && class144.field2214 >= 453) {
            Statics.field2660.field137 = !Statics.field2660.field137;
            class9.method81();
            if (Statics.field2660.field137) {
                Statics.field3009.method3444();
                class187.field3010 = 1;
                Statics.field3011 = null;
            } else {
                class187.method1548(Statics.field3109, "scape main", "", 255, false);
            }
        }
        if (client.field289 == 5) {
            return;
        }
        field752++;
        if (client.field289 != 10 && client.field289 != 11) {
            return;
        }
        if (client.field282 == 0) {
            if (class144.field2199 == 1 || !Statics.field2118 && class144.field2199 == 4) {
                int var1 = field746 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class144.field2212 >= var1 && class144.field2212 <= var1 + var3 && class144.field2214 >= var2 && class144.field2214 <= var2 + var4) {
                    method2795();
                    return;
                }
            }
            if (Statics.field2768 != null) {
                method2795();
            }
        }
        int var5 = class144.field2199;
        int var6 = class144.field2212;
        int var7 = class144.field2214;
        if (!Statics.field2118 && var5 == 4) {
            var5 = 1;
        }
        if (field721 == 0) {
            int var8 = field728 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class142.method2338(client.method2699("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field728 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field284 & 0x2000000) != 0) {
                    field741 = "";
                    field742 = class161.field2594;
                    field744 = class161.field2595;
                    field748 = class161.field2553;
                    field721 = 1;
                    field749 = 0;
                } else if ((client.field284 & 0x4) != 0) {
                    if ((client.field284 & 0x400) == 0) {
                        field742 = class161.field2585;
                        field744 = class161.field2586;
                        field748 = class161.field2509;
                    } else {
                        field742 = class161.field2544;
                        field744 = class161.field2592;
                        field748 = class161.field2593;
                    }
                    field741 = class161.field2584;
                    field721 = 1;
                    field749 = 0;
                } else if ((client.field284 & 0x400) == 0) {
                    field742 = class161.field2581;
                    field744 = class161.field2494;
                    field748 = class161.field2501;
                    field721 = 2;
                    field749 = 0;
                } else {
                    field742 = class161.field2588;
                    field744 = class161.field2617;
                    field748 = class161.field2590;
                    field741 = class161.field2584;
                    field721 = 1;
                    field749 = 0;
                }
            }
        } else if (field721 == 1) {
            while (class141.method126()) {
                if (Statics.field2103 == 84) {
                    field742 = class161.field2581;
                    field744 = class161.field2494;
                    field748 = class161.field2501;
                    field721 = 2;
                    field749 = 0;
                } else if (Statics.field2103 == 13) {
                    field721 = 0;
                }
            }
            int var11 = field728 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field742 = class161.field2581;
                field744 = class161.field2494;
                field748 = class161.field2501;
                field721 = 2;
                field749 = 0;
            }
            int var13 = field728 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field721 = 0;
            }
        } else if (field721 == 2) {
            short var14 = 231;
            int var36 = var14 + 30;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field749 = 0;
            }
            var36 += 15;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field749 = 1;
            }
            var36 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method539(class161.field2404, class161.field2621, class161.field2622);
                field721 = 5;
                return;
            }
            int var16 = field728 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field745 = field745.trim();
                if (field745.length() == 0) {
                    method539(class161.field2487, class161.field2488, class161.field2417);
                    return;
                }
                if (field734.length() == 0) {
                    method539(class161.field2574, class161.field2518, class161.field2492);
                    return;
                }
                method539(class161.field2599, class161.field2600, class161.field2601);
                field747 = Statics.field2660.field138.containsKey(class167.method573(field745)) ? class163.field2668 : class163.field2663;
                client.method2720(20);
                return;
            }
            int var18 = field728 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field721 = 0;
                field745 = "";
                field734 = "";
                Statics.field2363 = 0;
                Statics.field1415 = "";
                field732 = true;
            }
            while (true) {
                while (class141.method126()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field729.length(); var20++) {
                        if (Statics.field2010 == field729.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field2103 == 13) {
                        field721 = 0;
                        field745 = "";
                        field734 = "";
                        Statics.field2363 = 0;
                        Statics.field1415 = "";
                        field732 = true;
                    } else if (field749 == 0) {
                        if (Statics.field2103 == 85 && field745.length() > 0) {
                            field745 = field745.substring(0, field745.length() - 1);
                        }
                        if (Statics.field2103 == 84 || Statics.field2103 == 80) {
                            field749 = 1;
                        }
                        if (var19 && field745.length() < 320) {
                            field745 = field745 + Statics.field2010;
                        }
                    } else if (field749 == 1) {
                        if (Statics.field2103 == 85 && field734.length() > 0) {
                            field734 = field734.substring(0, field734.length() - 1);
                        }
                        if (Statics.field2103 == 84 || Statics.field2103 == 80) {
                            field749 = 0;
                        }
                        if (Statics.field2103 == 84) {
                            field745 = field745.trim();
                            if (field745.length() == 0) {
                                method539(class161.field2487, class161.field2488, class161.field2417);
                                return;
                            }
                            if (field734.length() == 0) {
                                method539(class161.field2574, class161.field2518, class161.field2492);
                                return;
                            }
                            method539(class161.field2599, class161.field2600, class161.field2601);
                            field747 = Statics.field2660.field138.containsKey(class167.method573(field745)) ? class163.field2668 : class163.field2663;
                            client.method2720(20);
                            return;
                        }
                        if (var19 && field734.length() < 20) {
                            field734 = field734 + Statics.field2010;
                        }
                    }
                }
                return;
            }
        } else if (field721 == 3) {
            int var21 = field728 + 180;
            short var22 = 276;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field742 = class161.field2581;
                field744 = class161.field2494;
                field748 = class161.field2501;
                field721 = 2;
                field749 = 0;
            }
            int var23 = field728 + 180;
            short var24 = 326;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                method539(class161.field2404, class161.field2621, class161.field2622);
                field721 = 5;
                return;
            }
        } else if (field721 == 4) {
            int var25 = field728 + 180 - 80;
            short var26 = 321;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                Statics.field1415.trim();
                if (Statics.field1415.length() != 6) {
                    method539(class161.field2406, class161.field2628, class161.field2408);
                    return;
                }
                Statics.field2363 = Integer.parseInt(Statics.field1415);
                Statics.field1415 = "";
                field747 = field732 ? class163.field2662 : class163.field2670;
                method539(class161.field2599, class161.field2600, class161.field2601);
                client.method2720(20);
                return;
            }
            if (var5 == 1 && var6 >= field728 + 180 - 9 && var6 <= field728 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field732 = !field732;
            }
            if (var5 == 1 && var6 >= field728 + 180 - 34 && var6 <= field728 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class142.method2338(client.method2699("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var27 = field728 + 180 + 80;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                field721 = 0;
                field745 = "";
                field734 = "";
                Statics.field2363 = 0;
                Statics.field1415 = "";
            }
            while (class141.method126()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field755.length(); var29++) {
                    if (Statics.field2010 == field755.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field2103 == 13) {
                    field721 = 0;
                    field745 = "";
                    field734 = "";
                    Statics.field2363 = 0;
                    Statics.field1415 = "";
                } else {
                    if (Statics.field2103 == 85 && Statics.field1415.length() > 0) {
                        Statics.field1415 = Statics.field1415.substring(0, Statics.field1415.length() - 1);
                    }
                    if (Statics.field2103 == 84) {
                        Statics.field1415.trim();
                        if (Statics.field1415.length() != 6) {
                            method539(class161.field2406, class161.field2628, class161.field2408);
                            return;
                        }
                        Statics.field2363 = Integer.parseInt(Statics.field1415);
                        Statics.field1415 = "";
                        field747 = field732 ? class163.field2662 : class163.field2670;
                        method539(class161.field2599, class161.field2600, class161.field2601);
                        client.method2720(20);
                        return;
                    }
                    if (var28 && Statics.field1415.length() < 6) {
                        Statics.field1415 = Statics.field1415 + Statics.field2010;
                    }
                }
            }
        } else if (field721 == 5) {
            int var30 = field728 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method159();
                return;
            }
            int var32 = field728 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field742 = class161.field2581;
                field744 = class161.field2494;
                field748 = class161.field2501;
                field721 = 2;
                field749 = 0;
                field734 = "";
            }
            while (class141.method126()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field729.length(); var34++) {
                    if (Statics.field2010 == field729.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field2103 == 13) {
                    field742 = class161.field2581;
                    field744 = class161.field2494;
                    field748 = class161.field2501;
                    field721 = 2;
                    field749 = 0;
                    field734 = "";
                } else {
                    if (Statics.field2103 == 85 && field745.length() > 0) {
                        field745 = field745.substring(0, field745.length() - 1);
                    }
                    if (Statics.field2103 == 84) {
                        method159();
                        return;
                    }
                    if (var33 && field745.length() < 320) {
                        field745 = field745 + Statics.field2010;
                    }
                }
            }
        } else if (field721 == 6) {
            while (true) {
                do {
                    if (!class141.method126()) {
                        short var35 = 321;
                        if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                            field742 = class161.field2581;
                            field744 = class161.field2494;
                            field748 = class161.field2501;
                            field721 = 2;
                            field749 = 0;
                            field734 = "";
                        }
                        return;
                    }
                } while (Statics.field2103 != 84 && Statics.field2103 != 13);
                field742 = class161.field2581;
                field744 = class161.field2494;
                field748 = class161.field2501;
                field721 = 2;
                field749 = 0;
                field734 = "";
            }
        }
    }

    @ObfuscatedName("g.z(I)V")
    public static void method159() {
        field745 = field745.trim();
        if (field745.length() == 0) {
            method539(class161.field2404, class161.field2621, class161.field2622);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2699("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class123 var4 = new class123(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2056, var4.field2057, 1000 - var4.field2057);
                if (var5 == -1) {
                    var4.field2057 = 0;
                    long var8 = var4.method2414();
                    var6 = var8;
                    break;
                }
                var4.field2057 += var5;
                if (var4.field2057 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var54) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field745;
            Random var15 = new Random();
            class123 var16 = new class123(128);
            class123 var17 = new class123(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2567(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2396(var15.nextInt());
            }
            var16.method2396(var18[0]);
            var16.method2396(var18[1]);
            var16.method2398(var6);
            var16.method2398(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2396(var15.nextInt());
            }
            var16.method2429(class10.field150, class10.field147);
            var17.method2567(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2396(var15.nextInt());
            }
            var17.method2398(var15.nextLong());
            var17.method2397(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class153.field2287.method3903(0L);
                class153.field2287.method3905(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var53) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2402(var22, 0, 24);
            var17.method2398(var15.nextLong());
            var17.method2429(class10.field150, class10.field147);
            int var26 = class123.method826(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class123 var27 = new class123(var26);
            var27.method2468(var14);
            var27.field2057 = var26;
            var27.method2425(var18);
            class123 var28 = new class123(var27.field2057 + var17.field2057 + var16.field2057 + 5);
            var28.method2567(2);
            var28.method2567(var16.field2057);
            var28.method2402(var16.field2056, 0, var16.field2057);
            var28.method2567(var17.field2057);
            var28.method2402(var17.field2056, 0, var17.field2057);
            var28.method2394(var27.field2057);
            var28.method2402(var27.field2056, 0, var27.field2057);
            byte[] var29 = var28.field2056;
            int var30 = var29.length;
            StringBuilder var31 = new StringBuilder();
            for (int var32 = 0; var32 < var30; var32 += 3) {
                int var33 = var29[var32] & 0xFF;
                var31.append(class165.field2706[var33 >>> 2]);
                if (var32 < var30 - 1) {
                    int var34 = var29[var32 + 1] & 0xFF;
                    var31.append(class165.field2706[(var33 & 0x3) << 4 | var34 >>> 4]);
                    if (var32 < var30 - 2) {
                        int var35 = var29[var32 + 2] & 0xFF;
                        var31.append(class165.field2706[(var34 & 0xF) << 2 | var35 >>> 6]).append(class165.field2706[var35 & 0x3F]);
                    } else {
                        var31.append(class165.field2706[(var34 & 0xF) << 2]).append("=");
                    }
                } else {
                    var31.append(class165.field2706[(var33 & 0x3) << 4]).append("==");
                }
            }
            String var36 = var31.toString();
            String var38 = var36;
            byte var45;
            try {
                URL var39 = new URL(client.method2699("services", false) + "m=accountappeal/login.ws");
                URLConnection var40 = var39.openConnection();
                var40.setDoInput(true);
                var40.setDoOutput(true);
                var40.setConnectTimeout(5000);
                OutputStreamWriter var41 = new OutputStreamWriter(var40.getOutputStream());
                var41.write("data2=" + class230.method613(var38) + "&dest=" + class230.method613("passwordchoice.ws"));
                var41.flush();
                InputStream var42 = var40.getInputStream();
                class123 var43 = new class123(new byte[1000]);
                while (true) {
                    int var44 = var42.read(var43.field2056, var43.field2057, 1000 - var43.field2057);
                    if (var44 == -1) {
                        var41.close();
                        var42.close();
                        String var46 = new String(var43.field2056);
                        if (var46.startsWith("OFFLINE")) {
                            var45 = 4;
                        } else if (var46.startsWith("WRONG")) {
                            var45 = 7;
                        } else if (var46.startsWith("RELOAD")) {
                            var45 = 3;
                        } else if (var46.startsWith("Not permitted for social network accounts.")) {
                            var45 = 6;
                        } else {
                            var43.method2426(var18);
                            while (var43.field2057 > 0 && var43.field2056[var43.field2057 - 1] == 0) {
                                var43.field2057--;
                            }
                            String var47 = new String(var43.field2056, 0, var43.field2057);
                            boolean var48;
                            if (var47 == null) {
                                var48 = false;
                            } else {
                                label128: {
                                    try {
                                        new URL(var47);
                                    } catch (MalformedURLException var51) {
                                        var48 = false;
                                        break label128;
                                    }
                                    var48 = true;
                                }
                            }
                            if (var48) {
                                class142.method2338(var47, true, false);
                                var45 = 2;
                            } else {
                                var45 = 5;
                            }
                        }
                        break;
                    }
                    var43.field2057 += var44;
                    if (var43.field2057 >= 1000) {
                        var45 = 5;
                        break;
                    }
                }
            } catch (Throwable var52) {
                var52.printStackTrace();
                var45 = 5;
            }
            var13 = var45;
        }
        switch(var13) {
            case 2:
                method539(class161.field2407, class161.field2403, class161.field2625);
                field721 = 6;
                break;
            case 3:
                method539(class161.field2626, class161.field2627, class161.field2528);
                break;
            case 4:
                method539(class161.field2629, class161.field2630, class161.field2567);
                break;
            case 5:
                method539(class161.field2632, class161.field2633, class161.field2634);
                break;
            case 6:
                method539(class161.field2463, class161.field2636, class161.field2605);
                break;
            case 7:
                method539(class161.field2517, class161.field2639, class161.field2464);
        }
    }

    @ObfuscatedName("co.i(Lhy;Lhy;Lhy;ZB)V")
    public static void method2116(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field746 = (Statics.field1500 - client.field334) / 2;
            field728 = field746 + 202;
        }
        if (field735) {
            if (Statics.field2323 == null) {
                Statics.field2323 = class80.method125(Statics.field1923, "sl_back", "");
            }
            if (Statics.field1740 == null) {
                Statics.field1740 = class80.method867(Statics.field1923, "sl_flags", "");
            }
            if (Statics.field93 == null) {
                Statics.field93 = class80.method867(Statics.field1923, "sl_arrows", "");
            }
            if (Statics.field638 == null) {
                Statics.field638 = class80.method867(Statics.field1923, "sl_stars", "");
            }
            class83.method1728(field746, 23, 765, 480, 0);
            class83.method1733(field746, 0, 125, 23, 12425273, 9135624);
            class83.method1733(field746 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3796(class161.field2507, field746 + 62, 15, 0, -1);
            if (Statics.field638 != null) {
                Statics.field638[1].method1793(field746 + 140, 1);
                arg1.method3829(class161.field2461, field746 + 152, 10, 16777215, -1);
                Statics.field638[0].method1793(field746 + 140, 12);
                arg1.method3829(class161.field2643, field746 + 152, 21, 16777215, -1);
            }
            if (Statics.field93 != null) {
                int var4 = field746 + 280;
                if (class28.field650[0] == 0 && class28.field653[0] == 0) {
                    Statics.field93[2].method1793(var4, 4);
                } else {
                    Statics.field93[0].method1793(var4, 4);
                }
                if (class28.field650[0] == 0 && class28.field653[0] == 1) {
                    Statics.field93[3].method1793(var4 + 15, 4);
                } else {
                    Statics.field93[1].method1793(var4 + 15, 4);
                }
                arg0.method3829(class161.field2644, var4 + 32, 17, 16777215, -1);
                int var5 = field746 + 390;
                if (class28.field650[0] == 1 && class28.field653[0] == 0) {
                    Statics.field93[2].method1793(var5, 4);
                } else {
                    Statics.field93[0].method1793(var5, 4);
                }
                if (class28.field650[0] == 1 && class28.field653[0] == 1) {
                    Statics.field93[3].method1793(var5 + 15, 4);
                } else {
                    Statics.field93[1].method1793(var5 + 15, 4);
                }
                arg0.method3829(class161.field2645, var5 + 32, 17, 16777215, -1);
                int var6 = field746 + 500;
                if (class28.field650[0] == 2 && class28.field653[0] == 0) {
                    Statics.field93[2].method1793(var6, 4);
                } else {
                    Statics.field93[0].method1793(var6, 4);
                }
                if (class28.field650[0] == 2 && class28.field653[0] == 1) {
                    Statics.field93[3].method1793(var6 + 15, 4);
                } else {
                    Statics.field93[1].method1793(var6 + 15, 4);
                }
                arg0.method3829(class161.field2646, var6 + 32, 17, 16777215, -1);
                int var7 = field746 + 610;
                if (class28.field650[0] == 3 && class28.field653[0] == 0) {
                    Statics.field93[2].method1793(var7, 4);
                } else {
                    Statics.field93[0].method1793(var7, 4);
                }
                if (class28.field650[0] == 3 && class28.field653[0] == 1) {
                    Statics.field93[3].method1793(var7 + 15, 4);
                } else {
                    Statics.field93[1].method1793(var7 + 15, 4);
                }
                arg0.method3829(class161.field2647, var7 + 32, 17, 16777215, -1);
            }
            class83.method1728(field746 + 708, 4, 50, 16, 0);
            arg1.method3796(class161.field2609, field746 + 708 + 25, 16, 16777215, -1);
            field753 = -1;
            if (Statics.field2323 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class28.field647) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class28.field647) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class28.field647) {
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
                int var19 = field746 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class28.field647; var22++) {
                    class28 var23 = Statics.field777[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field646);
                    if (var23.field646 == -1) {
                        var25 = class161.field2648;
                        var24 = false;
                    } else if (var23.field646 > 1980) {
                        var25 = class161.field2649;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method590()) {
                        if (var23.method586()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method612()) {
                        var26 = 16711680;
                        if (var23.method586()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method587()) {
                        if (var23.method586()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method586()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class144.field2205 >= var19 && class144.field2211 * -117362325 >= var18 && class144.field2205 < var8 + var19 && class144.field2211 * -117362325 < var9 + var18 && var24) {
                        field753 = var22;
                        Statics.field2323[var27].method1641(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field2323[var27].method1635(var19, var18);
                    }
                    if (Statics.field1740 != null) {
                        Statics.field1740[(var23.method586() ? 8 : 0) + var23.field656].method1793(var19 + 29, var18);
                    }
                    arg0.method3796(Integer.toString(var23.field655), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3796(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3849(Statics.field777[field753].field648) + 6;
                    int var29 = arg1.field3241 + 8;
                    class83.method1728(class144.field2205 - var28 / 2, class144.field2211 * -117362325 + 20 + 5, var28, var29, 16777120);
                    class83.method1734(class144.field2205 - var28 / 2, class144.field2211 * -117362325 + 20 + 5, var28, var29, 0);
                    arg1.method3796(Statics.field777[field753].field648, class144.field2205, class144.field2211 * -117362325 + 20 + 5 + arg1.field3241 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field2094.getGraphics();
                Statics.field883.method1550(var30, 0, 0);
            } catch (Exception var145) {
                Statics.field2094.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field884.method1635(field746, 0);
            Statics.field196.method1635(field746 + 382, 0);
            Statics.field2661.method1793(field746 + 382 - Statics.field2661.field1459 / 2, 18);
        }
        if (client.field289 == 0 || client.field289 == 5) {
            byte var32 = 20;
            arg0.method3796(class161.field2580, field728 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class83.method1734(field728 + 180 - 152, var33, 304, 34, 9179409);
            class83.method1734(field728 + 180 - 151, var33 + 1, 302, 32, 0);
            class83.method1728(field728 + 180 - 150, var33 + 2, field738 * 3, 30, 9179409);
            class83.method1728(field738 * 3 + (field728 + 180 - 150), var33 + 2, 300 - field738 * 3, 30, 0);
            arg0.method3796(field739, field728 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field289 == 20) {
            Statics.field3277.method1793(field728 + 180 - Statics.field3277.field1459 / 2, 271 - Statics.field3277.field1458 / 2);
            short var34 = 211;
            arg0.method3796(field742, field728 + 180, var34, 16776960, 0);
            int var147 = var34 + 15;
            arg0.method3796(field744, field728 + 180, var147, 16776960, 0);
            int var148 = var147 + 15;
            arg0.method3796(field748, field728 + 180, var148, 16776960, 0);
            int var149 = var148 + 15;
            int var150 = var149 + 10;
            if (field721 != 4) {
                arg0.method3829(class161.field2602, field728 + 180 - 110, var150, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field745; arg0.method3849(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3829(class227.method3832(var36), field728 + 180 - 70, var150, 16777215, 0);
                var147 = var150 + 15;
                String var38 = class161.field2620;
                String var39 = field734;
                String var40 = class167.method2869('*', var39.length());
                arg0.method3829(var38 + var40, field728 + 180 - 108, var147, 16777215, 0);
                var147 += 15;
            }
        }
        if (client.field289 == 10 || client.field289 == 11) {
            Statics.field3277.method1793(field728, 171);
            if (field721 == 0) {
                short var41 = 251;
                arg0.method3796(class161.field2563, field728 + 180, var41, 16776960, 0);
                int var151 = var41 + 30;
                int var42 = field728 + 180 - 80;
                short var43 = 291;
                Statics.field722.method1793(var42 - 73, var43 - 20);
                arg0.method3850(class161.field2606, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field728 + 180 + 80;
                Statics.field722.method1793(var44 - 73, var43 - 20);
                arg0.method3850(class161.field2607, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field721 == 1) {
                arg0.method3796(field741, field728 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3796(field742, field728 + 180, var45, 16777215, 0);
                int var152 = var45 + 15;
                arg0.method3796(field744, field728 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                arg0.method3796(field748, field728 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                int var46 = field728 + 180 - 80;
                short var47 = 321;
                Statics.field722.method1793(var46 - 73, var47 - 20);
                arg0.method3796(class161.field2378, var46, var47 + 5, 16777215, 0);
                int var48 = field728 + 180 + 80;
                Statics.field722.method1793(var48 - 73, var47 - 20);
                arg0.method3796(class161.field2609, var48, var47 + 5, 16777215, 0);
            } else if (field721 == 2) {
                short var49 = 211;
                arg0.method3796(field742, field728 + 180, var49, 16776960, 0);
                int var155 = var49 + 15;
                arg0.method3796(field744, field728 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method3796(field748, field728 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var158 = var157 + 10;
                arg0.method3829(class161.field2602, field728 + 180 - 110, var158, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field745; arg0.method3849(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3829(class227.method3832(var51) + (field749 == 0 & client.field291 % 40 < 20 ? class2.method2986(16776960) + class2.field17 : ""), field728 + 180 - 70, var158, 16777215, 0);
                var155 = var158 + 15;
                String var53 = class161.field2620;
                String var54 = field734;
                String var55 = class167.method2869('*', var54.length());
                arg0.method3829(var53 + var55 + (field749 == 1 & client.field291 % 40 < 20 ? class2.method2986(16776960) + class2.field17 : ""), field728 + 180 - 108, var155, 16777215, 0);
                var155 += 15;
                int var56 = field728 + 180 - 80;
                short var57 = 321;
                Statics.field722.method1793(var56 - 73, var57 - 20);
                arg0.method3796(class161.field2477, var56, var57 + 5, 16777215, 0);
                int var58 = field728 + 180 + 80;
                Statics.field722.method1793(var58 - 73, var57 - 20);
                arg0.method3796(class161.field2609, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                arg1.method3796(class161.field2615, field728 + 180, var59, 16776960, 0);
            } else if (field721 == 3) {
                short var60 = 201;
                arg0.method3796(class161.field2610, field728 + 180, var60, 16776960, 0);
                int var159 = var60 + 20;
                arg1.method3796(class161.field2611, field728 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg1.method3796(class161.field2612, field728 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var61 = field728 + 180;
                short var62 = 276;
                Statics.field722.method1793(var61 - 73, var62 - 20);
                arg2.method3796(class161.field2433, var61, var62 + 5, 16777215, 0);
                int var63 = field728 + 180;
                short var64 = 326;
                Statics.field722.method1793(var63 - 73, var64 - 20);
                arg2.method3796(class161.field2614, var63, var64 + 5, 16777215, 0);
            } else if (field721 == 4) {
                arg0.method3796(class161.field2429, field728 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3796(field742, field728 + 180, var65, 16777215, 0);
                int var162 = var65 + 15;
                arg0.method3796(field744, field728 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method3796(field748, field728 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                String var67 = class161.field2440;
                String var68 = Statics.field1415;
                String var69 = class167.method2869('*', var68.length());
                arg0.method3829(var67 + var69 + (client.field291 % 40 < 20 ? class2.method2986(16776960) + class2.field17 : ""), field728 + 180 - 108, var164, 16777215, 0);
                int var165 = var164 - 8;
                arg0.method3829(class161.field2460, field728 + 180 - 9, var165, 16776960, 0);
                int var166 = var165 + 15;
                arg0.method3829(class161.field2381, field728 + 180 - 9, var166, 16776960, 0);
                int var70 = field728 + 180 - 9 + arg0.method3849(class161.field2381) + 15;
                int var71 = var166 - arg0.field3241;
                class84 var72;
                if (field732) {
                    var72 = Statics.field724;
                } else {
                    var72 = Statics.field577;
                }
                var72.method1793(var70, var71);
                var162 = var166 + 15;
                int var73 = field728 + 180 - 80;
                short var74 = 321;
                Statics.field722.method1793(var73 - 73, var74 - 20);
                arg0.method3796(class161.field2378, var73, var74 + 5, 16777215, 0);
                int var75 = field728 + 180 + 80;
                Statics.field722.method1793(var75 - 73, var74 - 20);
                arg0.method3796(class161.field2609, var75, var74 + 5, 16777215, 0);
                arg1.method3796(class161.field2598, field728 + 180, var74 + 36, 255, 0);
            } else if (field721 == 5) {
                arg0.method3796(class161.field2619, field728 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3796(field742, field728 + 180, var76, 16776960, 0);
                int var167 = var76 + 15;
                arg2.method3796(field744, field728 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                arg2.method3796(field748, field728 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                int var170 = var169 + 14;
                arg0.method3829(class161.field2470, field728 + 180 - 145, var170, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field745; arg0.method3849(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3829(class227.method3832(var78) + (client.field291 % 40 < 20 ? class2.method2986(16776960) + class2.field17 : ""), field728 + 180 - 34, var170, 16777215, 0);
                var167 = var170 + 15;
                int var79 = field728 + 180 - 80;
                short var80 = 321;
                Statics.field722.method1793(var79 - 73, var80 - 20);
                arg0.method3796(class161.field2618, var79, var80 + 5, 16777215, 0);
                int var81 = field728 + 180 + 80;
                Statics.field722.method1793(var81 - 73, var80 - 20);
                arg0.method3796(class161.field2442, var81, var80 + 5, 16777215, 0);
            } else if (field721 == 6) {
                short var82 = 211;
                arg0.method3796(field742, field728 + 180, var82, 16776960, 0);
                int var171 = var82 + 15;
                arg0.method3796(field744, field728 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg0.method3796(field748, field728 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var83 = field728 + 180;
                short var84 = 321;
                Statics.field722.method1793(var83 - 73, var84 - 20);
                arg0.method3796(class161.field2442, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field752 > 0) {
            int var85 = field752;
            short var86 = 256;
            field751 += var85 * 128;
            if (field751 > Statics.field2099.length) {
                field751 -= Statics.field2099.length;
                int var87 = (int) (Math.random() * 12.0D);
                method2349(Statics.field723[var87]);
            }
            int var88 = 0;
            int var89 = var85 * 128;
            int var90 = (var86 - var85) * 128;
            for (int var91 = 0; var91 < var90; var91++) {
                int var92 = Statics.field271[var88 + var89] - Statics.field2099[field751 + var88 & Statics.field2099.length - 1] * var85 / 6;
                if (var92 < 0) {
                    var92 = 0;
                }
                Statics.field271[var88++] = var92;
            }
            for (int var93 = var86 - var85; var93 < var86; var93++) {
                int var94 = var93 * 128;
                for (int var95 = 0; var95 < 128; var95++) {
                    int var96 = (int) (Math.random() * 100.0D);
                    if (var96 < 50 && var95 > 10 && var95 < 118) {
                        Statics.field271[var94 + var95] = 255;
                    } else {
                        Statics.field271[var94 + var95] = 0;
                    }
                }
            }
            if (field743 > 0) {
                field743 -= var85 * 4;
            }
            if (field733 > 0) {
                field733 -= var85 * 4;
            }
            if (field743 == 0 && field733 == 0) {
                int var97 = (int) (Math.random() * (double) (2000 / var85));
                if (var97 == 0) {
                    field743 = 1024;
                }
                if (var97 == 1) {
                    field733 = 1024;
                }
            }
            for (int var98 = 0; var98 < var86 - var85; var98++) {
                field730[var98] = field730[var85 + var98];
            }
            for (int var99 = var86 - var85; var99 < var86; var99++) {
                field730[var99] = (int) (Math.sin((double) field737 / 14.0D) * 16.0D + Math.sin((double) field737 / 15.0D) * 14.0D + Math.sin((double) field737 / 16.0D) * 12.0D);
                field737++;
            }
            field750 += var85 * -417038661;
            int var100 = ((client.field291 & 0x1) + var85) / 2;
            if (var100 > 0) {
                for (int var101 = 0; var101 < field750 * 951895276; var101++) {
                    int var102 = (int) (Math.random() * 124.0D) + 2;
                    int var103 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field271[(var103 << 7) + var102] = 192;
                }
                field750 = 0;
                int var104 = 0;
                label525: while (true) {
                    if (var104 >= var86) {
                        int var108 = 0;
                        while (true) {
                            if (var108 >= 128) {
                                break label525;
                            }
                            int var109 = 0;
                            for (int var110 = -var100; var110 < var86; var110++) {
                                int var111 = var110 * 128;
                                if (var100 + var110 < var86) {
                                    var109 += Statics.field1836[var100 * 128 + var108 + var111];
                                }
                                if (var110 - (var100 + 1) >= 0) {
                                    var109 -= Statics.field1836[var108 + var111 - (var100 + 1) * 128];
                                }
                                if (var110 >= 0) {
                                    Statics.field271[var108 + var111] = var109 / (var100 * 2 + 1);
                                }
                            }
                            var108++;
                        }
                    }
                    int var105 = 0;
                    int var106 = var104 * 128;
                    for (int var107 = -var100; var107 < 128; var107++) {
                        if (var100 + var107 < 128) {
                            var105 += Statics.field271[var106 + var107 + var100];
                        }
                        if (var107 - (var100 + 1) >= 0) {
                            var105 -= Statics.field271[var106 + var107 - (var100 + 1)];
                        }
                        if (var107 >= 0) {
                            Statics.field1836[var106 + var107] = var105 / (var100 * 2 + 1);
                        }
                    }
                    var104++;
                }
            }
            field752 = 0;
        }
        short var112 = 256;
        if (field743 > 0) {
            for (int var113 = 0; var113 < 256; var113++) {
                if (field743 > 768) {
                    Statics.field731[var113] = Statics.method210(Statics.field13[var113], Statics.field1735[var113], 1024 - field743);
                } else if (field743 > 256) {
                    Statics.field731[var113] = Statics.field1735[var113];
                } else {
                    Statics.field731[var113] = Statics.method210(Statics.field1735[var113], Statics.field13[var113], 256 - field743);
                }
            }
        } else if (field733 > 0) {
            for (int var114 = 0; var114 < 256; var114++) {
                if (field733 > 768) {
                    Statics.field731[var114] = Statics.method210(Statics.field13[var114], Statics.field1817[var114], 1024 - field733);
                } else if (field733 > 256) {
                    Statics.field731[var114] = Statics.field1817[var114];
                } else {
                    Statics.field731[var114] = Statics.method210(Statics.field1817[var114], Statics.field13[var114], 256 - field733);
                }
            }
        } else {
            for (int var115 = 0; var115 < 256; var115++) {
                Statics.field731[var115] = Statics.field13[var115];
            }
        }
        class83.method1722(field746, 9, field746 + 128, var112 + 7);
        Statics.field884.method1635(field746, 0);
        class83.method1721();
        int var116 = 0;
        int var117 = field746 + Statics.field883.field1429 * 9;
        for (int var118 = 1; var118 < var112 - 1; var118++) {
            int var119 = (var112 - var118) * field730[var118] / var112;
            int var120 = var119 + 22;
            if (var120 < 0) {
                var120 = 0;
            }
            var116 += var120;
            for (int var121 = var120; var121 < 128; var121++) {
                int var122 = Statics.field271[var116++];
                if (var122 == 0) {
                    var117++;
                } else {
                    int var124 = 256 - var122;
                    int var125 = Statics.field731[var122];
                    int var126 = Statics.field883.field1430[var117];
                    Statics.field883.field1430[var117++] = ((var125 & 0xFF00FF) * var122 + (var126 & 0xFF00FF) * var124 & 0xFF00FF00) + ((var125 & 0xFF00) * var122 + (var126 & 0xFF00) * var124 & 0xFF0000) >> 8;
                }
            }
            var117 += Statics.field883.field1429 + var120 - 128;
        }
        class83.method1722(field746 + 765 - 128, 9, field746 + 765, var112 + 7);
        Statics.field196.method1635(field746 + 382, 0);
        class83.method1721();
        int var127 = 0;
        int var128 = field746 + Statics.field883.field1429 * 9 + 24 + 637;
        for (int var129 = 1; var129 < var112 - 1; var129++) {
            int var130 = (var112 - var129) * field730[var129] / var112;
            int var131 = 103 - var130;
            int var132 = var128 + var130;
            for (int var133 = 0; var133 < var131; var133++) {
                int var134 = Statics.field271[var127++];
                if (var134 == 0) {
                    var132++;
                } else {
                    int var136 = 256 - var134;
                    int var137 = Statics.field731[var134];
                    int var138 = Statics.field883.field1430[var132];
                    Statics.field883.field1430[var132++] = ((var137 & 0xFF00) * var134 + (var138 & 0xFF00) * var136 & 0xFF0000) + ((var137 & 0xFF00FF) * var134 + (var138 & 0xFF00FF) * var136 & 0xFF00FF00) >> 8;
                }
            }
            var127 += 128 - var131;
            var128 = Statics.field883.field1429 - var131 - var130 + var132;
        }
        Statics.field277[Statics.field2660.field137 ? 1 : 0].method1793(field746 + 765 - 40, 463);
        if (client.field289 > 5 && client.field282 == 0) {
            if (Statics.field278 == null) {
                Statics.field278 = class80.method642(Statics.field1923, "sl_button", "");
            } else {
                int var139 = field746 + 5;
                short var140 = 463;
                byte var141 = 100;
                byte var142 = 35;
                Statics.field278.method1793(var139, var140);
                arg0.method3796(class161.field2535 + " " + client.field283, var141 / 2 + var139, var142 / 2 + var140 - 2, 16777215, 0);
                if (Statics.field2768 == null) {
                    arg1.method3796(class161.field2383, var141 / 2 + var139, var142 / 2 + var140 + 12, 16777215, 0);
                } else {
                    arg1.method3796(class161.field2650, var141 / 2 + var139, var142 / 2 + var140 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var143 = Statics.field2094.getGraphics();
            Statics.field883.method1550(var143, 0, 0);
        } catch (Exception var146) {
            Statics.field2094.repaint();
        }
    }

    @ObfuscatedName("c.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method539(String arg0, String arg1, String arg2) {
        field742 = arg0;
        field744 = arg1;
        field748 = arg2;
    }

    @ObfuscatedName("dt.l(Lcj;I)V")
    public static final void method2349(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2099.length; var2++) {
            Statics.field2099[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2099[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field660[var8] = (Statics.field2099[var8 - 1] + Statics.field2099[var8 + 1] + Statics.field2099[var8 - 128] + Statics.field2099[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2099;
            Statics.field2099 = Statics.field660;
            Statics.field660 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1458; var11++) {
            for (int var12 = 0; var12 < arg0.field1459; var12++) {
                if (arg0.field1455[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1462;
                    int var14 = var11 + 16 + arg0.field1460;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2099[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ez.p(Lep;I)V")
    public static void method2728(class148 arg0) {
        if (class144.field2199 != 1 && Statics.field2118 || class144.field2199 != 4) {
            return;
        }
        int var1 = field746 + 280;
        if (class144.field2212 >= var1 && class144.field2212 <= var1 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(0, 0);
            return;
        }
        if (class144.field2212 >= var1 + 15 && class144.field2212 <= var1 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(0, 1);
            return;
        }
        int var2 = field746 + 390;
        if (class144.field2212 >= var2 && class144.field2212 <= var2 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(1, 0);
            return;
        }
        if (class144.field2212 >= var2 + 15 && class144.field2212 <= var2 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(1, 1);
            return;
        }
        int var3 = field746 + 500;
        if (class144.field2212 >= var3 && class144.field2212 <= var3 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(2, 0);
            return;
        }
        if (class144.field2212 >= var3 + 15 && class144.field2212 <= var3 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(2, 1);
            return;
        }
        int var4 = field746 + 610;
        if (class144.field2212 >= var4 && class144.field2212 <= var4 + 14 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(3, 0);
            return;
        }
        if (class144.field2212 >= var4 + 15 && class144.field2212 <= var4 + 80 && class144.field2214 >= 4 && class144.field2214 <= 18) {
            class28.method696(3, 1);
            return;
        }
        if (class144.field2212 >= field746 + 708 && class144.field2214 >= 4 && class144.field2212 <= field746 + 708 + 50 && class144.field2214 <= 20) {
            field735 = false;
            Statics.field884.method1635(field746, 0);
            Statics.field196.method1635(field746 + 382, 0);
            Statics.field2661.method1793(field746 + 382 - Statics.field2661.field1459 / 2, 18);
            return;
        }
        if (field753 == -1) {
            return;
        }
        class28 var5 = Statics.field777[field753];
        method1801(var5);
        field735 = false;
        Statics.field884.method1635(field746, 0);
        Statics.field196.method1635(field746 + 382, 0);
        Statics.field2661.method1793(field746 + 382 - Statics.field2661.field1459 / 2, 18);
        return;
    }

    @ObfuscatedName("cq.f(Lan;I)V")
    public static void method1801(class28 arg0) {
        if (arg0.method586() != client.field286) {
            client.field286 = arg0.method586();
            class56.method2868(arg0.method586());
        }
        Statics.field1244 = arg0.field654;
        client.field283 = arg0.field655;
        client.field284 = arg0.field652;
        Statics.field921 = client.field561 == 0 ? 43594 : arg0.field655 + 40000;
        Statics.field208 = client.field561 == 0 ? 443 : arg0.field655 + 50000;
        Statics.field318 = Statics.field921;
    }

    @ObfuscatedName("et.d(I)V")
    public static void method2795() {
        if (class28.method2341()) {
            field735 = true;
        }
    }
}
