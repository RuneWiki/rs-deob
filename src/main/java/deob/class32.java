package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("au")
public class class32 {

    @ObfuscatedName("au.v")
    public static int field730 = 0;

    @ObfuscatedName("au.g")
    public static int field729 = field730 + 202;

    @ObfuscatedName("au.o")
    public static int[] field742 = new int[256];

    @ObfuscatedName("au.u")
    public static int field752 = 0;

    @ObfuscatedName("au.y")
    public static int field733 = 0;

    @ObfuscatedName("au.al")
    public static int field731 = 0;

    @ObfuscatedName("au.ab")
    public static int field735 = 0;

    @ObfuscatedName("au.at")
    public static int field736 = 0;

    @ObfuscatedName("au.au")
    public static int field720 = 0;

    @ObfuscatedName("au.ae")
    public static int field746 = 2;

    @ObfuscatedName("au.ax")
    public static String field739 = "";

    @ObfuscatedName("au.aq")
    public static int field740 = 0;

    @ObfuscatedName("au.az")
    public static String field741 = "";

    @ObfuscatedName("au.ac")
    public static String field737 = "";

    @ObfuscatedName("au.ai")
    public static String field743 = "";

    @ObfuscatedName("au.ay")
    public static String field744 = "";

    @ObfuscatedName("au.aj")
    public static String field745 = "";

    @ObfuscatedName("au.af")
    public static class159 field732 = class159.field2594;

    @ObfuscatedName("au.ah")
    public static boolean field747 = true;

    @ObfuscatedName("au.am")
    public static int field748 = 0;

    @ObfuscatedName("au.aa")
    public static String field749 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("au.aw")
    public static String field750 = "1234567890";

    @ObfuscatedName("au.as")
    public static boolean field751 = false;

    @ObfuscatedName("au.bp")
    public static int field724 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.i(I)I")
    public static int method954() {
        return 9;
    }

    @ObfuscatedName("bv.v(Ljava/awt/Component;Lfn;Lfn;ZIB)V")
    public static void method1539(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field722) {
            field740 = arg4;
            class80.method1669();
            byte[] var5 = arg1.method3044("title.jpg", "");
            Statics.field738 = new class79(var5, arg0);
            Statics.field725 = Statics.field738.method1542();
            if ((client.field292 & 0x20000000) == 0) {
                Statics.field726 = class77.method156(arg2, "logo", "");
            } else {
                Statics.field726 = class77.method156(arg2, "logo_deadman_mode", "");
            }
            Statics.field721 = class77.method156(arg2, "titlebox", "");
            Statics.field734 = class77.method156(arg2, "titlebutton", "");
            Statics.field723 = class77.method2227(arg2, "runes", "");
            Statics.field3195 = class77.method2227(arg2, "title_mute", "");
            Statics.field727 = class77.method156(arg2, "options_radio_buttons,0", "");
            Statics.field1364 = class77.method156(arg2, "options_radio_buttons,2", "");
            Statics.field1954 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1954[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1954[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1954[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1954[var9 + 192] = 16777215;
            }
            Statics.field626 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field626[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field626[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field626[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field626[var13 + 192] = 16777215;
            }
            Statics.field754 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field754[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field754[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field754[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field754[var17 + 192] = 16777215;
            }
            Statics.field1032 = new int[256];
            Statics.field668 = new int[32768];
            Statics.field228 = new int[32768];
            Statics.method2620((class81) null);
            Statics.field129 = new int[32768];
            Statics.field2881 = new int[32768];
            if (arg3) {
                field744 = "";
                field745 = "";
            }
            Statics.field2199 = 0;
            Statics.field171 = "";
            field747 = true;
            field751 = false;
            if (Statics.field187.field142) {
                class183.field2946 = 1;
                Statics.field2944 = null;
                Statics.field2950 = -1;
                Statics.field2949 = -1;
                Statics.field2031 = 0;
                Statics.field2121 = false;
                Statics.field2129 = 2;
            } else {
                class183.method2770(2, Statics.field159, "scape main", "", 255, false);
            }
            class171.method2993(false);
            Statics.field722 = true;
            field730 = (Statics.field2656 - client.field337) / 2;
            field729 = field730 + 202;
            Statics.field738.method1615(field730, 0);
            Statics.field725.method1615(field730 + 382, 0);
            Statics.field726.method1703(field730 + 382 - Statics.field726.field1421 / 2, 18);
        } else if (arg4 == 4) {
            field740 = 4;
        }
    }

    @ObfuscatedName("et.f(S)V")
    public static void method2664() {
        if (!Statics.field722) {
            return;
        }
        Statics.field721 = null;
        Statics.field734 = null;
        Statics.field723 = null;
        Statics.field738 = null;
        Statics.field725 = null;
        Statics.field726 = null;
        Statics.field3195 = null;
        Statics.field727 = null;
        Statics.field1364 = null;
        Statics.field1677 = null;
        Statics.field630 = null;
        Statics.field2025 = null;
        Statics.field993 = null;
        Statics.field249 = null;
        Statics.field1954 = null;
        Statics.field626 = null;
        Statics.field754 = null;
        Statics.field1032 = null;
        Statics.field668 = null;
        Statics.field228 = null;
        Statics.field129 = null;
        Statics.field2881 = null;
        class183.field2946 = 1;
        Statics.field2944 = null;
        Statics.field2950 = -1;
        Statics.field2949 = -1;
        Statics.field2031 = 0;
        Statics.field2121 = false;
        Statics.field2129 = 2;
        class171.method2993(true);
        Statics.field722 = false;
    }

    @ObfuscatedName("dn.h(Lev;I)V")
    public static void method2248(class144 arg0) {
        if (field751) {
            method849(arg0);
            return;
        }
        if ((class140.field2138 == 1 || !Statics.field1652 && class140.field2138 == 4) && class140.field2145 >= field730 + 765 - 50 && class140.field2136 >= 453) {
            Statics.field187.field142 = !Statics.field187.field142;
            class9.method2088();
            if (Statics.field187.field142) {
                class183.method2222();
            } else {
                class168 var1 = Statics.field159;
                int var2 = var1.method3033("scape main");
                int var3 = var1.method3035(var2, "");
                class183.method152(var1, var2, var3, 255, false);
            }
        }
        if (client.field300 == 5) {
            return;
        }
        field736++;
        if (client.field300 != 10 && client.field300 != 11) {
            return;
        }
        if (client.field367 == 0) {
            if (class140.field2138 == 1 || !Statics.field1652 && class140.field2138 == 4) {
                int var4 = field730 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class140.field2145 >= var4 && class140.field2145 <= var4 + var6 && class140.field2136 >= var5 && class140.field2136 <= var5 + var7) {
                    method1487();
                    return;
                }
            }
            if (Statics.field3140 != null) {
                method1487();
            }
        }
        int var8 = class140.field2138;
        int var9 = class140.field2145;
        int var10 = class140.field2136;
        if (!Statics.field1652 && var8 == 4) {
            var8 = 1;
        }
        if (field740 == 0) {
            int var11 = field729 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                String var13 = client.method1914("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class138.method712(var13, true, "openjs", false);
            }
            int var14 = field729 + 180 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field292 & 0x4) != 0) {
                    if ((client.field292 & 0x400) == 0) {
                        field741 = class157.field2523;
                        field737 = class157.field2524;
                        field743 = class157.field2437;
                    } else {
                        field741 = class157.field2368;
                        field737 = class157.field2530;
                        field743 = class157.field2531;
                    }
                    field740 = 1;
                    field748 = 0;
                } else if ((client.field292 & 0x400) == 0) {
                    field741 = class157.field2349;
                    field737 = class157.field2520;
                    field743 = class157.field2397;
                    field740 = 2;
                    field748 = 0;
                } else {
                    field741 = class157.field2320;
                    field737 = class157.field2396;
                    field743 = class157.field2528;
                    field740 = 1;
                    field748 = 0;
                }
            }
        } else if (field740 == 1) {
            while (class137.method2177()) {
                if (Statics.field1612 == 84) {
                    field741 = class157.field2349;
                    field737 = class157.field2520;
                    field743 = class157.field2397;
                    field740 = 2;
                    field748 = 0;
                } else if (Statics.field1612 == 13) {
                    field740 = 0;
                }
            }
            int var15 = field729 + 180 - 80;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field741 = class157.field2349;
                field737 = class157.field2520;
                field743 = class157.field2397;
                field740 = 2;
                field748 = 0;
            }
            int var17 = field729 + 180 + 80;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field740 = 0;
            }
        } else if (field740 == 2) {
            short var18 = 231;
            int var37 = var18 + 30;
            if (var8 == 1 && var10 >= var37 - 15 && var10 < var37) {
                field748 = 0;
            }
            var37 += 15;
            if (var8 == 1 && var10 >= var37 - 15 && var10 < var37) {
                field748 = 1;
            }
            var37 += 15;
            short var19 = 361;
            if (var8 == 1 && var10 >= var19 - 15 && var10 < var19) {
                method902(class157.field2395, class157.field2551, class157.field2552);
                field740 = 5;
                return;
            }
            int var20 = field729 + 180 - 80;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field744 = field744.trim();
                if (field744.length() == 0) {
                    method902(class157.field2425, class157.field2426, class157.field2433);
                    return;
                }
                if (field745.length() == 0) {
                    method902(class157.field2428, class157.field2429, class157.field2430);
                    return;
                }
                method902(class157.field2494, class157.field2392, class157.field2536);
                field732 = Statics.field187.field144.containsKey(class163.method102(field744)) ? class159.field2598 : class159.field2594;
                client.method605(20);
                return;
            }
            int var22 = field729 + 180 + 80;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field740 = 0;
                field744 = "";
                field745 = "";
                Statics.field2199 = 0;
                Statics.field171 = "";
                field747 = true;
            }
            while (true) {
                while (class137.method2177()) {
                    boolean var23 = false;
                    for (int var24 = 0; var24 < field749.length(); var24++) {
                        if (Statics.field2000 == field749.charAt(var24)) {
                            var23 = true;
                            break;
                        }
                    }
                    if (Statics.field1612 == 13) {
                        field740 = 0;
                        field744 = "";
                        field745 = "";
                        Statics.field2199 = 0;
                        Statics.field171 = "";
                        field747 = true;
                    } else if (field748 == 0) {
                        if (Statics.field1612 == 85 && field744.length() > 0) {
                            field744 = field744.substring(0, field744.length() - 1);
                        }
                        if (Statics.field1612 == 84 || Statics.field1612 == 80) {
                            field748 = 1;
                        }
                        if (var23 && field744.length() < 320) {
                            field744 = field744 + Statics.field2000;
                        }
                    } else if (field748 == 1) {
                        if (Statics.field1612 == 85 && field745.length() > 0) {
                            field745 = field745.substring(0, field745.length() - 1);
                        }
                        if (Statics.field1612 == 84 || Statics.field1612 == 80) {
                            field748 = 0;
                        }
                        if (Statics.field1612 == 84) {
                            field744 = field744.trim();
                            if (field744.length() == 0) {
                                method902(class157.field2425, class157.field2426, class157.field2433);
                                return;
                            }
                            if (field745.length() == 0) {
                                method902(class157.field2428, class157.field2429, class157.field2430);
                                return;
                            }
                            method902(class157.field2494, class157.field2392, class157.field2536);
                            field732 = Statics.field187.field144.containsKey(class163.method102(field744)) ? class159.field2598 : class159.field2594;
                            client.method605(20);
                            return;
                        }
                        if (var23 && field745.length() < 20) {
                            field745 = field745 + Statics.field2000;
                        }
                    }
                }
                return;
            }
        } else if (field740 == 4) {
            int var25 = field729 + 180 - 80;
            short var26 = 321;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                Statics.field171.trim();
                if (Statics.field171.length() != 6) {
                    method902(class157.field2574, class157.field2440, class157.field2343);
                    return;
                }
                Statics.field2199 = Integer.parseInt(Statics.field171);
                Statics.field171 = "";
                field732 = field747 ? class159.field2592 : class159.field2595;
                method902(class157.field2494, class157.field2392, class157.field2536);
                client.method605(20);
                return;
            }
            if (var8 == 1 && var9 >= field729 + 180 - 9 && var9 <= field729 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field747 = !field747;
            }
            if (var8 == 1 && var9 >= field729 + 180 - 34 && var9 <= field729 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                String var27 = client.method1914("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class138.method712(var27, true, "openjs", false);
            }
            int var28 = field729 + 180 + 80;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                field740 = 0;
                field744 = "";
                field745 = "";
                Statics.field2199 = 0;
                Statics.field171 = "";
            }
            while (class137.method2177()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field750.length(); var30++) {
                    if (Statics.field2000 == field750.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field1612 == 13) {
                    field740 = 0;
                    field744 = "";
                    field745 = "";
                    Statics.field2199 = 0;
                    Statics.field171 = "";
                } else {
                    if (Statics.field1612 == 85 && Statics.field171.length() > 0) {
                        Statics.field171 = Statics.field171.substring(0, Statics.field171.length() - 1);
                    }
                    if (Statics.field1612 == 84) {
                        Statics.field171.trim();
                        if (Statics.field171.length() != 6) {
                            method902(class157.field2574, class157.field2440, class157.field2343);
                            return;
                        }
                        Statics.field2199 = Integer.parseInt(Statics.field171);
                        Statics.field171 = "";
                        field732 = field747 ? class159.field2592 : class159.field2595;
                        method902(class157.field2494, class157.field2392, class157.field2536);
                        client.method605(20);
                        return;
                    }
                    if (var29 && Statics.field171.length() < 6) {
                        Statics.field171 = Statics.field171 + Statics.field2000;
                    }
                }
            }
        } else if (field740 == 5) {
            int var31 = field729 + 180 - 80;
            short var32 = 321;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                method2012();
                return;
            }
            int var33 = field729 + 180 + 80;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                field741 = class157.field2349;
                field737 = class157.field2520;
                field743 = class157.field2397;
                field740 = 2;
                field748 = 0;
                field745 = "";
            }
            while (class137.method2177()) {
                boolean var34 = false;
                for (int var35 = 0; var35 < field749.length(); var35++) {
                    if (Statics.field2000 == field749.charAt(var35)) {
                        var34 = true;
                        break;
                    }
                }
                if (Statics.field1612 == 13) {
                    field741 = class157.field2349;
                    field737 = class157.field2520;
                    field743 = class157.field2397;
                    field740 = 2;
                    field748 = 0;
                    field745 = "";
                } else {
                    if (Statics.field1612 == 85 && field744.length() > 0) {
                        field744 = field744.substring(0, field744.length() - 1);
                    }
                    if (Statics.field1612 == 84) {
                        method2012();
                        return;
                    }
                    if (var34 && field744.length() < 320) {
                        field744 = field744 + Statics.field2000;
                    }
                }
            }
        } else if (field740 == 6) {
            while (true) {
                do {
                    if (!class137.method2177()) {
                        short var36 = 321;
                        if (var8 == 1 && var10 >= var36 - 20 && var10 <= var36 + 20) {
                            field741 = class157.field2349;
                            field737 = class157.field2520;
                            field743 = class157.field2397;
                            field740 = 2;
                            field748 = 0;
                            field745 = "";
                        }
                        return;
                    }
                } while (Statics.field1612 != 84 && Statics.field1612 != 13);
                field741 = class157.field2349;
                field737 = class157.field2520;
                field743 = class157.field2397;
                field740 = 2;
                field748 = 0;
                field745 = "";
            }
        }
    }

    @ObfuscatedName("cj.a(I)V")
    public static void method2012() {
        field744 = field744.trim();
        if (field744.length() == 0) {
            method902(class157.field2395, class157.field2551, class157.field2552);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1914("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class119 var4 = new class119(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1988, var4.field1984, 1000 - var4.field1984);
                if (var5 == -1) {
                    var4.field1984 = 0;
                    long var8 = var4.method2316();
                    var6 = var8;
                    break;
                }
                var4.field1984 += var5;
                if (var4.field1984 >= 1000) {
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
            var13 = class10.method1447(var6, field744);
        }
        switch(var13) {
            case 2:
                method902(class157.field2553, class157.field2511, class157.field2555);
                field740 = 6;
                break;
            case 3:
                method902(class157.field2556, class157.field2557, class157.field2558);
                break;
            case 4:
                method902(class157.field2484, class157.field2483, class157.field2521);
                break;
            case 5:
                method902(class157.field2562, class157.field2307, class157.field2498);
                break;
            case 6:
                method902(class157.field2565, class157.field2353, class157.field2567);
                break;
            case 7:
                method902(class157.field2568, class157.field2569, class157.field2577);
        }
    }

    @ObfuscatedName("aj.s(Lhw;Lhw;Lhw;ZB)V")
    public static void method743(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field730 = (Statics.field2656 - client.field337) / 2;
            field729 = field730 + 202;
        }
        if (field751) {
            method541(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field738.method1615(field730, 0);
            Statics.field725.method1615(field730 + 382, 0);
            Statics.field726.method1703(field730 + 382 - Statics.field726.field1421 / 2, 18);
        }
        if (client.field300 == 0 || client.field300 == 5) {
            byte var4 = 20;
            arg0.method3726(class157.field2518, field729 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1688(field729 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1688(field729 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1638(field729 + 180 - 150, var5 + 2, field746 * 15, 30, 9179409);
            class80.method1638(field746 * 15 + (field729 + 180 - 150), var5 + 2, 300 - field746 * 15, 30, 0);
            arg0.method3726(field739, field729 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field300 == 20) {
            Statics.field721.method1703(field729 + 180 - Statics.field721.field1421 / 2, 271 - Statics.field721.field1422 / 2);
            short var6 = 211;
            arg0.method3726(field741, field729 + 180, var6, 16776960, 0);
            int var109 = var6 + 15;
            arg0.method3726(field737, field729 + 180, var109, 16776960, 0);
            int var110 = var109 + 15;
            arg0.method3726(field743, field729 + 180, var110, 16776960, 0);
            int var111 = var110 + 15;
            int var112 = var111 + 10;
            if (field740 != 4) {
                arg0.method3724(class157.field2537, field729 + 180 - 110, var112, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field744; arg0.method3794(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3724(class223.method3742(var8), field729 + 180 - 70, var112, 16777215, 0);
                var109 = var112 + 15;
                String var10 = class157.field2538;
                String var11 = field745;
                String var12 = class163.method862('*', var11.length());
                arg0.method3724(var10 + var12, field729 + 180 - 108, var109, 16777215, 0);
                var109 += 15;
            }
        }
        if (client.field300 == 10 || client.field300 == 11) {
            Statics.field721.method1703(field729, 171);
            if (field740 == 0) {
                short var13 = 251;
                arg0.method3726(class157.field2540, field729 + 180, var13, 16776960, 0);
                int var113 = var13 + 30;
                int var14 = field729 + 180 - 80;
                short var15 = 291;
                Statics.field734.method1703(var14 - 73, var15 - 20);
                arg0.method3772(class157.field2541, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field729 + 180 + 80;
                Statics.field734.method1703(var16 - 73, var15 - 20);
                arg0.method3772(class157.field2542, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field740 == 1) {
                arg0.method3726(class157.field2522, field729 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3726(field741, field729 + 180, var17, 16777215, 0);
                int var114 = var17 + 15;
                arg0.method3726(field737, field729 + 180, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3726(field743, field729 + 180, var115, 16777215, 0);
                int var116 = var115 + 15;
                int var18 = field729 + 180 - 80;
                short var19 = 321;
                Statics.field734.method1703(var18 - 73, var19 - 20);
                arg0.method3726(class157.field2465, var18, var19 + 5, 16777215, 0);
                int var20 = field729 + 180 + 80;
                Statics.field734.method1703(var20 - 73, var19 - 20);
                arg0.method3726(class157.field2544, var20, var19 + 5, 16777215, 0);
            } else if (field740 == 2) {
                short var21 = 211;
                arg0.method3726(field741, field729 + 180, var21, 16776960, 0);
                int var117 = var21 + 15;
                arg0.method3726(field737, field729 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3726(field743, field729 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                int var120 = var119 + 10;
                arg0.method3724(class157.field2537, field729 + 180 - 110, var120, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field744; arg0.method3794(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3724(class223.method3742(var23) + (field748 == 0 & client.field302 % 40 < 20 ? class2.method2892(16776960) + class2.field27 : ""), field729 + 180 - 70, var120, 16777215, 0);
                var117 = var120 + 15;
                String var25 = class157.field2538;
                String var26 = field745;
                String var27 = class163.method862('*', var26.length());
                arg0.method3724(var25 + var27 + (field748 == 1 & client.field302 % 40 < 20 ? class2.method2892(16776960) + class2.field27 : ""), field729 + 180 - 108, var117, 16777215, 0);
                var117 += 15;
                int var28 = field729 + 180 - 80;
                short var29 = 321;
                Statics.field734.method1703(var28 - 73, var29 - 20);
                arg0.method3726(class157.field2543, var28, var29 + 5, 16777215, 0);
                int var30 = field729 + 180 + 80;
                Statics.field734.method1703(var30 - 73, var29 - 20);
                arg0.method3726(class157.field2544, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3726(class157.field2545, field729 + 180, var31, 16776960, 0);
            } else if (field740 == 4) {
                arg0.method3726(class157.field2532, field729 + 180, 211, 16776960, 0);
                short var32 = 236;
                arg0.method3726(field741, field729 + 180, var32, 16777215, 0);
                int var121 = var32 + 15;
                arg0.method3726(field737, field729 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method3726(field743, field729 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method3724(class157.field2478 + class163.method1911(Statics.field171) + (client.field302 % 40 < 20 ? class2.method2892(16776960) + class2.field27 : ""), field729 + 180 - 108, var123, 16777215, 0);
                int var124 = var123 - 8;
                arg0.method3724(class157.field2315, field729 + 180 - 9, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method3724(class157.field2316, field729 + 180 - 9, var125, 16776960, 0);
                int var33 = field729 + 180 - 9 + arg0.method3794(class157.field2316) + 15;
                int var34 = var125 - arg0.field3170;
                class81 var35;
                if (field747) {
                    var35 = Statics.field1364;
                } else {
                    var35 = Statics.field727;
                }
                var35.method1703(var33, var34);
                var121 = var125 + 15;
                int var36 = field729 + 180 - 80;
                short var37 = 321;
                Statics.field734.method1703(var36 - 73, var37 - 20);
                arg0.method3726(class157.field2465, var36, var37 + 5, 16777215, 0);
                int var38 = field729 + 180 + 80;
                Statics.field734.method1703(var38 - 73, var37 - 20);
                arg0.method3726(class157.field2544, var38, var37 + 5, 16777215, 0);
                arg1.method3726(class157.field2533, field729 + 180, var37 + 36, 255, 0);
            } else if (field740 == 5) {
                arg0.method3726(class157.field2546, field729 + 180, 201, 16776960, 0);
                short var39 = 221;
                arg2.method3726(field741, field729 + 180, var39, 16776960, 0);
                int var126 = var39 + 15;
                arg2.method3726(field737, field729 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg2.method3726(field743, field729 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var129 = var128 + 14;
                arg0.method3724(class157.field2547, field729 + 180 - 145, var129, 16777215, 0);
                short var40 = 174;
                String var41;
                for (var41 = field744; arg0.method3794(var41) > var40; var41 = var41.substring(1)) {
                }
                arg0.method3724(class223.method3742(var41) + (client.field302 % 40 < 20 ? class2.method2892(16776960) + class2.field27 : ""), field729 + 180 - 34, var129, 16777215, 0);
                var126 = var129 + 15;
                int var42 = field729 + 180 - 80;
                short var43 = 321;
                Statics.field734.method1703(var42 - 73, var43 - 20);
                arg0.method3726(class157.field2443, var42, var43 + 5, 16777215, 0);
                int var44 = field729 + 180 + 80;
                Statics.field734.method1703(var44 - 73, var43 - 20);
                arg0.method3726(class157.field2549, var44, var43 + 5, 16777215, 0);
            } else if (field740 == 6) {
                short var45 = 211;
                arg0.method3726(field741, field729 + 180, var45, 16776960, 0);
                int var130 = var45 + 15;
                arg0.method3726(field737, field729 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method3726(field743, field729 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var46 = field729 + 180;
                short var47 = 321;
                Statics.field734.method1703(var46 - 73, var47 - 20);
                arg0.method3726(class157.field2549, var46, var47 + 5, 16777215, 0);
            }
        }
        if (field736 > 0) {
            int var48 = field736;
            short var49 = 256;
            field731 += var48 * 128;
            if (field731 > Statics.field668.length) {
                field731 -= Statics.field668.length;
                int var50 = (int) (Math.random() * 12.0D);
                Statics.method2620(Statics.field723[var50]);
            }
            int var51 = 0;
            int var52 = var48 * 128;
            int var53 = (var49 - var48) * 128;
            for (int var54 = 0; var54 < var53; var54++) {
                int var55 = Statics.field129[var51 + var52] - Statics.field668[field731 + var51 & Statics.field668.length - 1] * var48 / 6;
                if (var55 < 0) {
                    var55 = 0;
                }
                Statics.field129[var51++] = var55;
            }
            for (int var56 = var49 - var48; var56 < var49; var56++) {
                int var57 = var56 * 128;
                for (int var58 = 0; var58 < 128; var58++) {
                    int var59 = (int) (Math.random() * 100.0D);
                    if (var59 < 50 && var58 > 10 && var58 < 118) {
                        Statics.field129[var57 + var58] = 255;
                    } else {
                        Statics.field129[var57 + var58] = 0;
                    }
                }
            }
            if (field752 > 0) {
                field752 -= var48 * 4;
            }
            if (field733 > 0) {
                field733 -= var48 * 4;
            }
            if (field752 == 0 && field733 == 0) {
                int var60 = (int) (Math.random() * (double) (2000 / var48));
                if (var60 == 0) {
                    field752 = 1024;
                }
                if (var60 == 1) {
                    field733 = 1024;
                }
            }
            for (int var61 = 0; var61 < var49 - var48; var61++) {
                field742[var61] = field742[var48 + var61];
            }
            for (int var62 = var49 - var48; var62 < var49; var62++) {
                field742[var62] = (int) (Math.sin((double) field720 / 14.0D) * 16.0D + Math.sin((double) field720 / 15.0D) * 14.0D + Math.sin((double) field720 / 16.0D) * 12.0D);
                field720++;
            }
            field735 += var48 * 947294005;
            int var63 = ((client.field302 & 0x1) + var48) / 2;
            if (var63 > 0) {
                for (int var64 = 0; var64 < field735 * -59353260; var64++) {
                    int var65 = (int) (Math.random() * 124.0D) + 2;
                    int var66 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field129[(var66 << 7) + var65] = 192;
                }
                field735 = 0;
                int var67 = 0;
                label317: while (true) {
                    if (var67 >= var49) {
                        int var71 = 0;
                        while (true) {
                            if (var71 >= 128) {
                                break label317;
                            }
                            int var72 = 0;
                            for (int var73 = -var63; var73 < var49; var73++) {
                                int var74 = var73 * 128;
                                if (var63 + var73 < var49) {
                                    var72 += Statics.field2881[var63 * 128 + var71 + var74];
                                }
                                if (var73 - (var63 + 1) >= 0) {
                                    var72 -= Statics.field2881[var71 + var74 - (var63 + 1) * 128];
                                }
                                if (var73 >= 0) {
                                    Statics.field129[var71 + var74] = var72 / (var63 * 2 + 1);
                                }
                            }
                            var71++;
                        }
                    }
                    int var68 = 0;
                    int var69 = var67 * 128;
                    for (int var70 = -var63; var70 < 128; var70++) {
                        if (var63 + var70 < 128) {
                            var68 += Statics.field129[var69 + var70 + var63];
                        }
                        if (var70 - (var63 + 1) >= 0) {
                            var68 -= Statics.field129[var69 + var70 - (var63 + 1)];
                        }
                        if (var70 >= 0) {
                            Statics.field2881[var69 + var70] = var68 / (var63 * 2 + 1);
                        }
                    }
                    var67++;
                }
            }
            field736 = 0;
        }
        short var75 = 256;
        if (field752 > 0) {
            for (int var76 = 0; var76 < 256; var76++) {
                if (field752 > 768) {
                    Statics.field1032[var76] = method3145(Statics.field1954[var76], Statics.field626[var76], 1024 - field752);
                } else if (field752 > 256) {
                    Statics.field1032[var76] = Statics.field626[var76];
                } else {
                    Statics.field1032[var76] = method3145(Statics.field626[var76], Statics.field1954[var76], 256 - field752);
                }
            }
        } else if (field733 > 0) {
            for (int var77 = 0; var77 < 256; var77++) {
                if (field733 > 768) {
                    Statics.field1032[var77] = method3145(Statics.field1954[var77], Statics.field754[var77], 1024 - field733);
                } else if (field733 > 256) {
                    Statics.field1032[var77] = Statics.field754[var77];
                } else {
                    Statics.field1032[var77] = method3145(Statics.field754[var77], Statics.field1954[var77], 256 - field733);
                }
            }
        } else {
            for (int var78 = 0; var78 < 256; var78++) {
                Statics.field1032[var78] = Statics.field1954[var78];
            }
        }
        class80.method1632(field730, 9, field730 + 128, var75 + 7);
        Statics.field738.method1615(field730, 0);
        class80.method1631();
        int var79 = 0;
        int var80 = field730 + Statics.field2029.field1394 * 9;
        for (int var81 = 1; var81 < var75 - 1; var81++) {
            int var82 = (var75 - var81) * field742[var81] / var75;
            int var83 = var82 + 22;
            if (var83 < 0) {
                var83 = 0;
            }
            var79 += var83;
            for (int var84 = var83; var84 < 128; var84++) {
                int var85 = Statics.field129[var79++];
                if (var85 == 0) {
                    var80++;
                } else {
                    int var87 = 256 - var85;
                    int var88 = Statics.field1032[var85];
                    int var89 = Statics.field2029.field1391[var80];
                    Statics.field2029.field1391[var80++] = ((var88 & 0xFF00) * var85 + (var89 & 0xFF00) * var87 & 0xFF0000) + ((var88 & 0xFF00FF) * var85 + (var89 & 0xFF00FF) * var87 & 0xFF00FF00) >> 8;
                }
            }
            var80 += Statics.field2029.field1394 + var83 - 128;
        }
        class80.method1632(field730 + 765 - 128, 9, field730 + 765, var75 + 7);
        Statics.field725.method1615(field730 + 382, 0);
        class80.method1631();
        int var90 = 0;
        int var91 = field730 + Statics.field2029.field1394 * 9 + 24 + 637;
        for (int var92 = 1; var92 < var75 - 1; var92++) {
            int var93 = (var75 - var92) * field742[var92] / var75;
            int var94 = 103 - var93;
            int var95 = var91 + var93;
            for (int var96 = 0; var96 < var94; var96++) {
                int var97 = Statics.field129[var90++];
                if (var97 == 0) {
                    var95++;
                } else {
                    int var99 = 256 - var97;
                    int var100 = Statics.field1032[var97];
                    int var101 = Statics.field2029.field1391[var95];
                    Statics.field2029.field1391[var95++] = ((var100 & 0xFF00FF) * var97 + (var101 & 0xFF00FF) * var99 & 0xFF00FF00) + ((var100 & 0xFF00) * var97 + (var101 & 0xFF00) * var99 & 0xFF0000) >> 8;
                }
            }
            var90 += 128 - var94;
            var91 = Statics.field2029.field1394 - var94 - var93 + var95;
        }
        Statics.field3195[Statics.field187.field142 ? 1 : 0].method1703(field730 + 765 - 40, 463);
        if (client.field300 > 5 && client.field367 == 0) {
            if (Statics.field249 == null) {
                Statics.field249 = class77.method156(Statics.field133, "sl_button", "");
            } else {
                int var102 = field730 + 5;
                short var103 = 463;
                byte var104 = 100;
                byte var105 = 35;
                Statics.field249.method1703(var102, var103);
                arg0.method3726(class157.field2354 + " " + client.field291, var104 / 2 + var102, var105 / 2 + var103 - 2, 16777215, 0);
                if (Statics.field3140 == null) {
                    arg1.method3726(class157.field2581, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
                } else {
                    arg1.method3726(class157.field2417, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var106 = Statics.field773.getGraphics();
            Statics.field2029.method1477(var106, 0, 0);
        } catch (Exception var108) {
            Statics.field773.repaint();
        }
    }

    @ObfuscatedName("aw.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method902(String arg0, String arg1, String arg2) {
        field741 = arg0;
        field737 = arg1;
        field743 = arg2;
    }

    @ObfuscatedName("fe.k(IIII)I")
    public static final int method3145(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("y.d(Lhw;Lhw;B)V")
    public static void method541(class224 arg0, class224 arg1) {
        if (Statics.field1677 == null) {
            Statics.field1677 = class77.method530(Statics.field133, "sl_back", "");
        }
        if (Statics.field630 == null) {
            Statics.field630 = class77.method2227(Statics.field133, "sl_flags", "");
        }
        if (Statics.field2025 == null) {
            Statics.field2025 = class77.method2227(Statics.field133, "sl_arrows", "");
        }
        if (Statics.field993 == null) {
            Statics.field993 = class77.method2227(Statics.field133, "sl_stars", "");
        }
        class80.method1638(field730, 23, 765, 480, 0);
        class80.method1643(field730, 0, 125, 23, 12425273, 9135624);
        class80.method1643(field730 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3726(class157.field2571, field730 + 62, 15, 0, -1);
        if (Statics.field993 != null) {
            Statics.field993[1].method1703(field730 + 140, 1);
            arg1.method3724(class157.field2572, field730 + 152, 10, 16777215, -1);
            Statics.field993[0].method1703(field730 + 140, 12);
            arg1.method3724(class157.field2573, field730 + 152, 21, 16777215, -1);
        }
        if (Statics.field2025 != null) {
            int var2 = field730 + 280;
            if (class26.field633[0] == 0 && class26.field627[0] == 0) {
                Statics.field2025[2].method1703(var2, 4);
            } else {
                Statics.field2025[0].method1703(var2, 4);
            }
            if (class26.field633[0] == 0 && class26.field627[0] == 1) {
                Statics.field2025[3].method1703(var2 + 15, 4);
            } else {
                Statics.field2025[1].method1703(var2 + 15, 4);
            }
            arg0.method3724(class157.field2525, var2 + 32, 17, 16777215, -1);
            int var3 = field730 + 390;
            if (class26.field633[0] == 1 && class26.field627[0] == 0) {
                Statics.field2025[2].method1703(var3, 4);
            } else {
                Statics.field2025[0].method1703(var3, 4);
            }
            if (class26.field633[0] == 1 && class26.field627[0] == 1) {
                Statics.field2025[3].method1703(var3 + 15, 4);
            } else {
                Statics.field2025[1].method1703(var3 + 15, 4);
            }
            arg0.method3724(class157.field2575, var3 + 32, 17, 16777215, -1);
            int var4 = field730 + 500;
            if (class26.field633[0] == 2 && class26.field627[0] == 0) {
                Statics.field2025[2].method1703(var4, 4);
            } else {
                Statics.field2025[0].method1703(var4, 4);
            }
            if (class26.field633[0] == 2 && class26.field627[0] == 1) {
                Statics.field2025[3].method1703(var4 + 15, 4);
            } else {
                Statics.field2025[1].method1703(var4 + 15, 4);
            }
            arg0.method3724(class157.field2576, var4 + 32, 17, 16777215, -1);
            int var5 = field730 + 610;
            if (class26.field633[0] == 3 && class26.field627[0] == 0) {
                Statics.field2025[2].method1703(var5, 4);
            } else {
                Statics.field2025[0].method1703(var5, 4);
            }
            if (class26.field633[0] == 3 && class26.field627[0] == 1) {
                Statics.field2025[3].method1703(var5 + 15, 4);
            } else {
                Statics.field2025[1].method1703(var5 + 15, 4);
            }
            arg0.method3724(class157.field2313, var5 + 32, 17, 16777215, -1);
        }
        class80.method1638(field730 + 708, 4, 50, 16, 0);
        arg1.method3726(class157.field2544, field730 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field292 & var7;
        for (int var9 = 0; var9 < class26.field632; var9++) {
            class26 var10 = Statics.field631[var9];
            if ((var10.field637 & var7) == var8 || (var10.field637 & var7) == 0) {
                var6++;
            }
        }
        field724 = -1;
        if (Statics.field1677 != null) {
            byte var11 = 88;
            byte var12 = 19;
            int var13 = 765 / (var11 + 1);
            int var14 = 480 / (var12 + 1);
            int var15;
            int var16;
            do {
                var15 = var14;
                var16 = var13;
                if ((var13 - 1) * var14 >= var6) {
                    var13--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
            } while (var14 != var15 || var13 != var16);
            int var17 = (765 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (480 - var12 * var14) / (var14 + 1);
            if (var18 > 5) {
                var18 = 5;
            }
            int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
            int var21 = var20 + 23;
            int var22 = field730 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class26.field632; var25++) {
                class26 var26 = Statics.field631[var25];
                if ((var26.field637 & var7) == var8 || (var26.field637 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field638);
                    if (var26.field638 == -1) {
                        var28 = class157.field2554;
                        var27 = false;
                    } else if (var26.field638 > 1980) {
                        var28 = class157.field2579;
                        var27 = false;
                    }
                    byte var29;
                    if (var26.method550()) {
                        if (var26.method551()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var26.method551()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class140.field2143 >= var22 && class140.field2139 * 869381013 >= var21 && class140.field2143 < var11 + var22 && class140.field2139 * 869381013 < var12 + var21 && var27) {
                        field724 = var25;
                        Statics.field1677[var29].method1603(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        Statics.field1677[var29].method1615(var22, var21);
                    }
                    if (Statics.field630 != null) {
                        Statics.field630[(var26.method551() ? 8 : 0) + var26.field642].method1703(var22 + 29, var21);
                    }
                    arg0.method3726(Integer.toString(var26.field636), var22 + 15, var12 / 2 + var21 + 5, 0, -1);
                    arg1.method3726(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
                    var21 += var12 + var18;
                    var23++;
                    if (var23 >= var14) {
                        var21 = var20 + 23;
                        var22 += var11 + var17;
                        var23 = 0;
                    }
                }
            }
            if (var24) {
                int var30 = arg1.method3794(Statics.field631[field724].field640) + 6;
                int var31 = arg1.field3170 + 8;
                class80.method1638(class140.field2143 - var30 / 2, class140.field2139 * 869381013 + 20 + 5, var30, var31, 16777120);
                class80.method1688(class140.field2143 - var30 / 2, class140.field2139 * 869381013 + 20 + 5, var30, var31, 0);
                arg1.method3726(Statics.field631[field724].field640, class140.field2143, class140.field2139 * 869381013 + 20 + 5 + arg1.field3170 + 4, 0, -1);
            }
        }
        try {
            Graphics var32 = Statics.field773.getGraphics();
            Statics.field2029.method1477(var32, 0, 0);
        } catch (Exception var34) {
            Statics.field773.repaint();
        }
    }

    @ObfuscatedName("ah.n(Lev;B)V")
    public static void method849(class144 arg0) {
        if (class140.field2138 != 1 && Statics.field1652 || class140.field2138 != 4) {
            return;
        }
        int var1 = field730 + 280;
        if (class140.field2145 >= var1 && class140.field2145 <= var1 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(0, 0);
            return;
        }
        if (class140.field2145 >= var1 + 15 && class140.field2145 <= var1 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(0, 1);
            return;
        }
        int var2 = field730 + 390;
        if (class140.field2145 >= var2 && class140.field2145 <= var2 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(1, 0);
            return;
        }
        if (class140.field2145 >= var2 + 15 && class140.field2145 <= var2 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(1, 1);
            return;
        }
        int var3 = field730 + 500;
        if (class140.field2145 >= var3 && class140.field2145 <= var3 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(2, 0);
            return;
        }
        if (class140.field2145 >= var3 + 15 && class140.field2145 <= var3 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(2, 1);
            return;
        }
        int var4 = field730 + 610;
        if (class140.field2145 >= var4 && class140.field2145 <= var4 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(3, 0);
            return;
        }
        if (class140.field2145 >= var4 + 15 && class140.field2145 <= var4 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method582(3, 1);
            return;
        }
        if (class140.field2145 >= field730 + 708 && class140.field2136 >= 4 && class140.field2145 <= field730 + 708 + 50 && class140.field2136 <= 20) {
            field751 = false;
            Statics.field738.method1615(field730, 0);
            Statics.field725.method1615(field730 + 382, 0);
            Statics.field726.method1703(field730 + 382 - Statics.field726.field1421 / 2, 18);
            return;
        }
        if (field724 == -1) {
            return;
        }
        class26 var5 = Statics.field631[field724];
        method48(var5);
        field751 = false;
        Statics.field738.method1615(field730, 0);
        Statics.field725.method1615(field730 + 382, 0);
        Statics.field726.method1703(field730 + 382 - Statics.field726.field1421 / 2, 18);
        return;
    }

    @ObfuscatedName("h.z(Lq;I)V")
    public static void method48(class26 arg0) {
        if (arg0.method551() != client.field296) {
            client.field296 = arg0.method551();
            boolean var1 = arg0.method551();
            if (Statics.field1860 != var1) {
                class52.field1113.method3464();
                class52.field1160.method3464();
                class52.field1115.method3464();
                Statics.field1860 = var1;
            }
        }
        Statics.field28 = arg0.field639;
        client.field291 = arg0.field636;
        client.field292 = arg0.field637;
        Statics.field893 = client.field293 == 0 ? 43594 : arg0.field636 + 40000;
        Statics.field327 = client.field293 == 0 ? 443 : arg0.field636 + 50000;
        Statics.field1080 = Statics.field893;
    }

    @ObfuscatedName("bx.c(I)V")
    public static void method1487() {
        if (class26.method874()) {
            field751 = true;
        }
    }
}
