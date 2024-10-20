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

@ObfuscatedName("ax")
public class class32 {

    @ObfuscatedName("ax.p")
    public static int field739 = 0;

    @ObfuscatedName("ax.j")
    public static int field731 = field739 + 202;

    @ObfuscatedName("ax.z")
    public static int[] field752 = new int[256];

    @ObfuscatedName("ax.s")
    public static int field745 = 0;

    @ObfuscatedName("ax.g")
    public static int field732 = 0;

    @ObfuscatedName("ax.ak")
    public static int field717 = 0;

    @ObfuscatedName("ax.ah")
    public static int field734 = 0;

    @ObfuscatedName("ax.al")
    public static int field747 = 0;

    @ObfuscatedName("ax.ax")
    public static int field736 = 0;

    @ObfuscatedName("ax.az")
    public static int field727 = 10;

    @ObfuscatedName("ax.ad")
    public static String field738 = "";

    @ObfuscatedName("ax.aw")
    public static int field719 = 0;

    @ObfuscatedName("ax.as")
    public static String field740 = "";

    @ObfuscatedName("ax.ai")
    public static String field741 = "";

    @ObfuscatedName("ax.aj")
    public static String field742 = "";

    @ObfuscatedName("ax.ap")
    public static String field743 = "";

    @ObfuscatedName("ax.ar")
    public static String field728 = "";

    @ObfuscatedName("ax.ac")
    public static class159 field722 = class159.field2567;

    @ObfuscatedName("ax.aa")
    public static boolean field746 = true;

    @ObfuscatedName("ax.ab")
    public static int field718 = 0;

    @ObfuscatedName("ax.av")
    public static String field748 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ax.au")
    public static String field733 = "1234567890";

    @ObfuscatedName("ax.ag")
    public static boolean field750 = false;

    @ObfuscatedName("ax.ba")
    public static int field751 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.d(Lfn;Lfn;I)I")
    public static int method185(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3109("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3109("logo", "")) {
            var2++;
        }
        if (arg1.method3109("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3109("titlebox", "")) {
            var2++;
        }
        if (arg1.method3109("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3109("runes", "")) {
            var2++;
        }
        if (arg1.method3109("title_mute", "")) {
            var2++;
        }
        if (arg1.method3110("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3110("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3109("sl_back", "");
        arg1.method3109("sl_flags", "");
        arg1.method3109("sl_arrows", "");
        arg1.method3109("sl_stars", "");
        arg1.method3109("sl_button", "");
        return var2;
    }

    @ObfuscatedName("dq.p(B)I")
    public static int method2612() {
        return 9;
    }

    @ObfuscatedName("x.v(Ljava/awt/Component;Lfn;Lfn;ZII)V")
    public static void method156(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field749) {
            field719 = arg4;
            class80.method1729();
            byte[] var5 = arg1.method3114("title.jpg", "");
            Statics.field2025 = new class79(var5, arg0);
            Statics.field744 = Statics.field2025.method1586();
            if ((client.field289 & 0x20000000) == 0) {
                Statics.field134 = class77.method848(arg2, "logo", "");
            } else {
                Statics.field134 = class77.method848(arg2, "logo_deadman_mode", "");
            }
            Statics.field754 = class77.method848(arg2, "titlebox", "");
            Statics.field720 = class77.method848(arg2, "titlebutton", "");
            Statics.field721 = class77.method809(arg2, "runes", "");
            Statics.field256 = class77.method809(arg2, "title_mute", "");
            Statics.field723 = class77.method848(arg2, "options_radio_buttons,0", "");
            Statics.field724 = class77.method848(arg2, "options_radio_buttons,2", "");
            Statics.field1593 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1593[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1593[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1593[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1593[var9 + 192] = 16777215;
            }
            Statics.field3216 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3216[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3216[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3216[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field3216[var13 + 192] = 16777215;
            }
            Statics.field730 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field730[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field730[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field730[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field730[var17 + 192] = 16777215;
            }
            Statics.field729 = new int[256];
            Statics.field214 = new int[32768];
            Statics.field2230 = new int[32768];
            method970((class81) null);
            Statics.field3131 = new int[32768];
            Statics.field716 = new int[32768];
            if (arg3) {
                field743 = "";
                field728 = "";
            }
            Statics.field3165 = 0;
            Statics.field582 = "";
            field746 = true;
            field750 = false;
            if (Statics.field1752.field149) {
                class183.method2993(2);
            } else {
                class183.method3022(2, Statics.field670, "scape main", "", 255, false);
            }
            class171.method3(false);
            Statics.field749 = true;
            field739 = (Statics.field1778 - client.field569 * 765) / 2;
            field731 = field739 + 202;
            Statics.field2025.method1619(field739, 0);
            Statics.field744.method1619(field739 + 382, 0);
            Statics.field134.method1744(field739 + 382 - Statics.field134.field1419 / 2, 18);
        } else if (arg4 == 4) {
            field719 = 4;
        }
    }

    @ObfuscatedName("bs.l(Lea;I)V")
    public static void method1494(class144 arg0) {
        if (field750) {
            method2043(arg0);
            return;
        }
        if ((class140.field2134 == 1 || !Statics.field627 && class140.field2134 == 4) && class140.field2135 >= field739 + 765 - 50 && class140.field2136 >= 453) {
            Statics.field1752.field149 = !Statics.field1752.field149;
            class9.method2975();
            if (Statics.field1752.field149) {
                Statics.field2948.method3516();
                class183.field2946 = 1;
                Statics.field2947 = null;
            } else {
                class183.method3345(Statics.field670, "scape main", "", 255, false);
            }
        }
        if (client.field423 == 5) {
            return;
        }
        field747++;
        if (client.field423 != 10 && client.field423 != 11) {
            return;
        }
        if (client.field294 == 0) {
            if (class140.field2134 == 1 || !Statics.field627 && class140.field2134 == 4) {
                int var1 = field739 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class140.field2135 >= var1 && class140.field2135 <= var1 + var3 && class140.field2136 >= var2 && class140.field2136 <= var2 + var4) {
                    if (class26.method161()) {
                        field750 = true;
                    }
                    return;
                }
            }
            if (Statics.field2249 != null && class26.method161()) {
                field750 = true;
            }
        }
        int var5 = class140.field2134;
        int var6 = class140.field2135;
        int var7 = class140.field2136;
        if (!Statics.field627 && var5 == 4) {
            var5 = 1;
        }
        if (field719 == 0) {
            int var8 = field731 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                String var10 = client.method564("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class138.method727(var10, true, "openjs", false);
            }
            int var11 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field289 & 0x4) != 0) {
                    if ((client.field289 & 0x400) == 0) {
                        field740 = class157.field2495;
                        field741 = class157.field2496;
                        field742 = class157.field2376;
                    } else {
                        field740 = class157.field2361;
                        field741 = class157.field2502;
                        field742 = class157.field2503;
                    }
                    field719 = 1;
                    field718 = 0;
                } else if ((client.field289 & 0x400) == 0) {
                    field740 = class157.field2279;
                    field741 = class157.field2492;
                    field742 = class157.field2354;
                    field719 = 2;
                    field718 = 0;
                } else {
                    field740 = class157.field2497;
                    field741 = class157.field2499;
                    field742 = class157.field2500;
                    field719 = 1;
                    field718 = 0;
                }
            }
        } else if (field719 == 1) {
            while (Statics.method2232()) {
                if (Statics.field678 == 84) {
                    field740 = class157.field2279;
                    field741 = class157.field2492;
                    field742 = class157.field2354;
                    field719 = 2;
                    field718 = 0;
                } else if (Statics.field678 == 13) {
                    field719 = 0;
                }
            }
            int var12 = field731 + 180 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field740 = class157.field2279;
                field741 = class157.field2492;
                field742 = class157.field2354;
                field719 = 2;
                field718 = 0;
            }
            int var14 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field719 = 0;
            }
        } else if (field719 == 2) {
            short var15 = 231;
            int var34 = var15 + 30;
            if (var5 == 1 && var7 >= var34 - 15 && var7 < var34) {
                field718 = 0;
            }
            var34 += 15;
            if (var5 == 1 && var7 >= var34 - 15 && var7 < var34) {
                field718 = 1;
            }
            var34 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method685(class157.field2522, class157.field2523, class157.field2524);
                field719 = 5;
                return;
            }
            int var17 = field731 + 180 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field743 = field743.trim();
                if (field743.length() == 0) {
                    method685(class157.field2427, class157.field2539, class157.field2399);
                    return;
                }
                if (field728.length() == 0) {
                    method685(class157.field2400, class157.field2318, class157.field2402);
                    return;
                }
                method685(class157.field2506, class157.field2507, class157.field2508);
                field722 = Statics.field1752.field146.containsKey(class163.method3019(field743)) ? class159.field2565 : class159.field2567;
                client.method187(20);
                return;
            }
            int var19 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field719 = 0;
                field743 = "";
                field728 = "";
                Statics.field3165 = 0;
                Statics.field582 = "";
                field746 = true;
            }
            while (true) {
                while (Statics.method2232()) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < field748.length(); var21++) {
                        if (Statics.field671 == field748.charAt(var21)) {
                            var20 = true;
                            break;
                        }
                    }
                    if (Statics.field678 == 13) {
                        field719 = 0;
                        field743 = "";
                        field728 = "";
                        Statics.field3165 = 0;
                        Statics.field582 = "";
                        field746 = true;
                    } else if (field718 == 0) {
                        if (Statics.field678 == 85 && field743.length() > 0) {
                            field743 = field743.substring(0, field743.length() - 1);
                        }
                        if (Statics.field678 == 84 || Statics.field678 == 80) {
                            field718 = 1;
                        }
                        if (var20 && field743.length() < 320) {
                            field743 = field743 + Statics.field671;
                        }
                    } else if (field718 == 1) {
                        if (Statics.field678 == 85 && field728.length() > 0) {
                            field728 = field728.substring(0, field728.length() - 1);
                        }
                        if (Statics.field678 == 84 || Statics.field678 == 80) {
                            field718 = 0;
                        }
                        if (Statics.field678 == 84) {
                            field743 = field743.trim();
                            if (field743.length() == 0) {
                                method685(class157.field2427, class157.field2539, class157.field2399);
                                return;
                            }
                            if (field728.length() == 0) {
                                method685(class157.field2400, class157.field2318, class157.field2402);
                                return;
                            }
                            method685(class157.field2506, class157.field2507, class157.field2508);
                            field722 = Statics.field1752.field146.containsKey(class163.method3019(field743)) ? class159.field2565 : class159.field2567;
                            client.method187(20);
                            return;
                        }
                        if (var20 && field728.length() < 20) {
                            field728 = field728 + Statics.field671;
                        }
                    }
                }
                return;
            }
        } else if (field719 == 4) {
            int var22 = field731 + 180 - 80;
            short var23 = 321;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                Statics.field582.trim();
                if (Statics.field582.length() != 6) {
                    method685(class157.field2351, class157.field2314, class157.field2458);
                    return;
                }
                Statics.field3165 = Integer.parseInt(Statics.field582);
                Statics.field582 = "";
                field722 = field746 ? class159.field2570 : class159.field2568;
                method685(class157.field2506, class157.field2507, class157.field2508);
                client.method187(20);
                return;
            }
            if (var5 == 1 && var6 >= field731 + 180 - 9 && var6 <= field731 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field746 = !field746;
            }
            if (var5 == 1 && var6 >= field731 + 180 - 34 && var6 <= field731 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                String var24 = client.method564("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class138.method727(var24, true, "openjs", false);
            }
            int var25 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                field719 = 0;
                field743 = "";
                field728 = "";
                Statics.field3165 = 0;
                Statics.field582 = "";
            }
            while (Statics.method2232()) {
                boolean var26 = false;
                for (int var27 = 0; var27 < field733.length(); var27++) {
                    if (Statics.field671 == field733.charAt(var27)) {
                        var26 = true;
                        break;
                    }
                }
                if (Statics.field678 == 13) {
                    field719 = 0;
                    field743 = "";
                    field728 = "";
                    Statics.field3165 = 0;
                    Statics.field582 = "";
                } else {
                    if (Statics.field678 == 85 && Statics.field582.length() > 0) {
                        Statics.field582 = Statics.field582.substring(0, Statics.field582.length() - 1);
                    }
                    if (Statics.field678 == 84) {
                        Statics.field582.trim();
                        if (Statics.field582.length() != 6) {
                            method685(class157.field2351, class157.field2314, class157.field2458);
                            return;
                        }
                        Statics.field3165 = Integer.parseInt(Statics.field582);
                        Statics.field582 = "";
                        field722 = field746 ? class159.field2570 : class159.field2568;
                        method685(class157.field2506, class157.field2507, class157.field2508);
                        client.method187(20);
                        return;
                    }
                    if (var26 && Statics.field582.length() < 6) {
                        Statics.field582 = Statics.field582 + Statics.field671;
                    }
                }
            }
        } else if (field719 == 5) {
            int var28 = field731 + 180 - 80;
            short var29 = 321;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var29 - 20 && var7 <= var29 + 20) {
                method2690();
                return;
            }
            int var30 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var29 - 20 && var7 <= var29 + 20) {
                field740 = class157.field2279;
                field741 = class157.field2492;
                field742 = class157.field2354;
                field719 = 2;
                field718 = 0;
                field728 = "";
            }
            while (Statics.method2232()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field748.length(); var32++) {
                    if (Statics.field671 == field748.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field678 == 13) {
                    field740 = class157.field2279;
                    field741 = class157.field2492;
                    field742 = class157.field2354;
                    field719 = 2;
                    field718 = 0;
                    field728 = "";
                } else {
                    if (Statics.field678 == 85 && field743.length() > 0) {
                        field743 = field743.substring(0, field743.length() - 1);
                    }
                    if (Statics.field678 == 84) {
                        method2690();
                        return;
                    }
                    if (var31 && field743.length() < 320) {
                        field743 = field743 + Statics.field671;
                    }
                }
            }
        } else if (field719 == 6) {
            while (true) {
                do {
                    if (!Statics.method2232()) {
                        short var33 = 321;
                        if (var5 == 1 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                            field740 = class157.field2279;
                            field741 = class157.field2492;
                            field742 = class157.field2354;
                            field719 = 2;
                            field718 = 0;
                            field728 = "";
                        }
                        return;
                    }
                } while (Statics.field678 != 84 && Statics.field678 != 13);
                field740 = class157.field2279;
                field741 = class157.field2492;
                field742 = class157.field2354;
                field719 = 2;
                field718 = 0;
                field728 = "";
            }
        }
    }

    @ObfuscatedName("da.y(I)V")
    public static void method2690() {
        field743 = field743.trim();
        if (field743.length() == 0) {
            method685(class157.field2522, class157.field2523, class157.field2524);
            return;
        }
        long var0 = class10.method1156();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field743;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2388(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2345(var4.nextInt());
            }
            var5.method2345(var7[0]);
            var5.method2345(var7[1]);
            var5.method2347(var0);
            var5.method2347(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2345(var4.nextInt());
            }
            var5.method2354(class10.field159, class10.field160);
            var6.method2388(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2345(var4.nextInt());
            }
            var6.method2347(var4.nextLong());
            var6.method2346(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class149.field2209.method3942(0L);
                class149.field2209.method3936(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var33) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2463(var11, 0, 24);
            var6.method2347(var4.nextLong());
            var6.method2354(class10.field159, class10.field160);
            int var15 = class119.method2041(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class119 var16 = new class119(var15);
            var16.method2348(var3);
            var16.field1966 = var15;
            var16.method2373(var7);
            class119 var17 = new class119(var16.field1966 + var6.field1966 + var5.field1966 + 5);
            var17.method2388(2);
            var17.method2388(var5.field1966);
            var17.method2463(var5.field1973, 0, var5.field1966);
            var17.method2388(var6.field1966);
            var17.method2463(var6.field1973, 0, var6.field1966);
            var17.method2343(var16.field1966);
            var17.method2463(var16.field1973, 0, var16.field1966);
            String var18 = class161.method717(var17.field1973);
            byte var25;
            try {
                URL var19 = new URL(client.method564("services", false) + "m=accountappeal/login.ws");
                URLConnection var20 = var19.openConnection();
                var20.setDoInput(true);
                var20.setDoOutput(true);
                var20.setConnectTimeout(5000);
                OutputStreamWriter var21 = new OutputStreamWriter(var20.getOutputStream());
                var21.write("data2=" + class226.method2230(var18) + "&dest=" + class226.method2230("passwordchoice.ws"));
                var21.flush();
                InputStream var22 = var20.getInputStream();
                class119 var23 = new class119(new byte[1000]);
                while (true) {
                    int var24 = var22.read(var23.field1973, var23.field1966, 1000 - var23.field1966);
                    if (var24 == -1) {
                        var21.close();
                        var22.close();
                        String var26 = new String(var23.field1973);
                        if (var26.startsWith("OFFLINE")) {
                            var25 = 4;
                        } else if (var26.startsWith("WRONG")) {
                            var25 = 7;
                        } else if (var26.startsWith("RELOAD")) {
                            var25 = 3;
                        } else if (var26.startsWith("Not permitted for social network accounts.")) {
                            var25 = 6;
                        } else {
                            var23.method2374(var7);
                            while (var23.field1966 > 0 && var23.field1973[var23.field1966 - 1] == 0) {
                                var23.field1966--;
                            }
                            String var27 = new String(var23.field1973, 0, var23.field1966);
                            boolean var28;
                            if (var27 == null) {
                                var28 = false;
                            } else {
                                label103: {
                                    try {
                                        new URL(var27);
                                    } catch (MalformedURLException var31) {
                                        var28 = false;
                                        break label103;
                                    }
                                    var28 = true;
                                }
                            }
                            if (var28) {
                                class138.method727(var27, true, "openjs", false);
                                var25 = 2;
                            } else {
                                var25 = 5;
                            }
                        }
                        break;
                    }
                    var23.field1966 += var24;
                    if (var23.field1966 >= 1000) {
                        var25 = 5;
                        break;
                    }
                }
            } catch (Throwable var32) {
                var32.printStackTrace();
                var25 = 5;
            }
            var2 = var25;
        }
        switch(var2) {
            case 2:
                method685(class157.field2525, class157.field2526, class157.field2527);
                field719 = 6;
                break;
            case 3:
                method685(class157.field2528, class157.field2529, class157.field2395);
                break;
            case 4:
                method685(class157.field2450, class157.field2532, class157.field2338);
                break;
            case 5:
                method685(class157.field2534, class157.field2326, class157.field2536);
                break;
            case 6:
                method685(class157.field2304, class157.field2538, class157.field2493);
                break;
            case 7:
                method685(class157.field2540, class157.field2541, class157.field2542);
        }
    }

    @ObfuscatedName("fm.w(Lhb;Lhb;Lhb;ZB)V")
    public static void method3088(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field739 = (Statics.field1778 - client.field569 * 765) / 2;
            field731 = field739 + 202;
        }
        if (field750) {
            if (Statics.field2561 == null) {
                Statics.field2561 = class77.method157(Statics.field1754, "sl_back", "");
            }
            if (Statics.field668 == null) {
                Statics.field668 = class77.method809(Statics.field1754, "sl_flags", "");
            }
            if (Statics.field179 == null) {
                Statics.field179 = class77.method809(Statics.field1754, "sl_arrows", "");
            }
            if (Statics.field241 == null) {
                Statics.field241 = class77.method809(Statics.field1754, "sl_stars", "");
            }
            class80.method1715(field739, 23, 765, 480, 0);
            class80.method1684(field739, 0, 125, 23, 12425273, 9135624);
            class80.method1684(field739 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3859(class157.field2543, field739 + 62, 15, 0, -1);
            if (Statics.field241 != null) {
                Statics.field241[1].method1744(field739 + 140, 1);
                arg1.method3848(class157.field2350, field739 + 152, 10, 16777215, -1);
                Statics.field241[0].method1744(field739 + 140, 12);
                arg1.method3848(class157.field2467, field739 + 152, 21, 16777215, -1);
            }
            if (Statics.field179 != null) {
                int var4 = field739 + 280;
                if (class26.field646[0] == 0 && class26.field651[0] == 0) {
                    Statics.field179[2].method1744(var4, 4);
                } else {
                    Statics.field179[0].method1744(var4, 4);
                }
                if (class26.field646[0] == 0 && class26.field651[0] == 1) {
                    Statics.field179[3].method1744(var4 + 15, 4);
                } else {
                    Statics.field179[1].method1744(var4 + 15, 4);
                }
                arg0.method3848(class157.field2295, var4 + 32, 17, 16777215, -1);
                int var5 = field739 + 390;
                if (class26.field646[0] == 1 && class26.field651[0] == 0) {
                    Statics.field179[2].method1744(var5, 4);
                } else {
                    Statics.field179[0].method1744(var5, 4);
                }
                if (class26.field646[0] == 1 && class26.field651[0] == 1) {
                    Statics.field179[3].method1744(var5 + 15, 4);
                } else {
                    Statics.field179[1].method1744(var5 + 15, 4);
                }
                arg0.method3848(class157.field2322, var5 + 32, 17, 16777215, -1);
                int var6 = field739 + 500;
                if (class26.field646[0] == 2 && class26.field651[0] == 0) {
                    Statics.field179[2].method1744(var6, 4);
                } else {
                    Statics.field179[0].method1744(var6, 4);
                }
                if (class26.field646[0] == 2 && class26.field651[0] == 1) {
                    Statics.field179[3].method1744(var6 + 15, 4);
                } else {
                    Statics.field179[1].method1744(var6 + 15, 4);
                }
                arg0.method3848(class157.field2548, var6 + 32, 17, 16777215, -1);
                int var7 = field739 + 610;
                if (class26.field646[0] == 3 && class26.field651[0] == 0) {
                    Statics.field179[2].method1744(var7, 4);
                } else {
                    Statics.field179[0].method1744(var7, 4);
                }
                if (class26.field646[0] == 3 && class26.field651[0] == 1) {
                    Statics.field179[3].method1744(var7 + 15, 4);
                } else {
                    Statics.field179[1].method1744(var7 + 15, 4);
                }
                arg0.method3848(class157.field2509, var7 + 32, 17, 16777215, -1);
            }
            class80.method1715(field739 + 708, 4, 50, 16, 0);
            arg1.method3859(class157.field2516, field739 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field289 & var9;
            for (int var11 = 0; var11 < class26.field647; var11++) {
                class26 var12 = Statics.field642[var11];
                if ((var12.field648 & var9) == var10 || (var12.field648 & var9) == 0) {
                    var8++;
                }
            }
            field751 = -1;
            if (Statics.field2561 != null) {
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
                int var24 = field739 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field647; var27++) {
                    class26 var28 = Statics.field642[var27];
                    if ((var28.field648 & var9) == var10 || (var28.field648 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field649);
                        if (var28.field649 == -1) {
                            var30 = class157.field2550;
                            var29 = false;
                        } else if (var28.field649 > 1980) {
                            var30 = class157.field2551;
                            var29 = false;
                        }
                        int var31 = 0;
                        byte var32;
                        if (var28.method585()) {
                            var31 = 16711680;
                            if (var28.method581()) {
                                var32 = 5;
                            } else {
                                var32 = 4;
                            }
                        } else if (var28.method583()) {
                            if (var28.method581()) {
                                var32 = 3;
                            } else {
                                var32 = 2;
                            }
                        } else if (var28.method581()) {
                            var32 = 1;
                        } else {
                            var32 = 0;
                        }
                        if (class140.field2128 >= var24 && class140.field2129 >= var23 && class140.field2128 < var13 + var24 && class140.field2129 < var14 + var23 && var29) {
                            field751 = var27;
                            Statics.field2561[var32].method1602(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field2561[var32].method1619(var24, var23);
                        }
                        if (Statics.field668 != null) {
                            Statics.field668[(var28.method581() ? 8 : 0) + var28.field653].method1744(var24 + 29, var23);
                        }
                        arg0.method3859(Integer.toString(var28.field656), var24 + 15, var14 / 2 + var23 + 5, var31, -1);
                        arg1.method3859(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var33 = arg1.method3822(Statics.field642[field751].field639) + 6;
                    int var34 = arg1.field3176 + 8;
                    class80.method1715(class140.field2128 - var33 / 2, class140.field2129 + 20 + 5, var33, var34, 16777120);
                    class80.method1685(class140.field2128 - var33 / 2, class140.field2129 + 20 + 5, var33, var34, 0);
                    arg1.method3859(Statics.field642[field751].field639, class140.field2128, class140.field2129 + 20 + 5 + arg1.field3176 + 4, 0, -1);
                }
            }
            try {
                Graphics var35 = Statics.field1745.getGraphics();
                Statics.field2052.method1507(var35, 0, 0);
            } catch (Exception var103) {
                Statics.field1745.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2025.method1619(field739, 0);
            Statics.field744.method1619(field739 + 382, 0);
            Statics.field134.method1744(field739 + 382 - Statics.field134.field1419 / 2, 18);
        }
        if (client.field423 == 0 || client.field423 == 5) {
            byte var37 = 20;
            arg0.method3859(class157.field2298, field731 + 180, 245 - var37, 16777215, -1);
            int var38 = 253 - var37;
            class80.method1685(field731 + 180 - 152, var38, 304, 34, 9179409);
            class80.method1685(field731 + 180 - 151, var38 + 1, 302, 32, 0);
            class80.method1715(field731 + 180 - 150, var38 + 2, field727 * 3, 30, 9179409);
            class80.method1715(field727 * 3 + (field731 + 180 - 150), var38 + 2, 300 - field727 * 3, 30, 0);
            arg0.method3859(field738, field731 + 180, 276 - var37, 16777215, -1);
        }
        if (client.field423 == 20) {
            Statics.field754.method1744(field731 + 180 - Statics.field754.field1419 / 2, 271 - Statics.field754.field1420 / 2);
            short var39 = 211;
            arg0.method3859(field740, field731 + 180, var39, 16776960, 0);
            int var105 = var39 + 15;
            arg0.method3859(field741, field731 + 180, var105, 16776960, 0);
            int var106 = var105 + 15;
            arg0.method3859(field742, field731 + 180, var106, 16776960, 0);
            int var107 = var106 + 15;
            int var108 = var107 + 10;
            if (field719 != 4) {
                arg0.method3848(class157.field2313, field731 + 180 - 110, var108, 16777215, 0);
                short var40 = 200;
                String var41;
                for (var41 = field743; arg0.method3822(var41) > var40; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method3848(class223.method3826(var41), field731 + 180 - 70, var108, 16777215, 0);
                var105 = var108 + 15;
                String var43 = class157.field2489;
                String var44 = field728;
                int var45 = var44.length();
                char[] var46 = new char[var45];
                for (int var47 = 0; var47 < var45; var47++) {
                    var46[var47] = '*';
                }
                String var48 = new String(var46);
                arg0.method3848(var43 + var48, field731 + 180 - 108, var105, 16777215, 0);
                var105 += 15;
            }
        }
        if (client.field423 == 10 || client.field423 == 11) {
            Statics.field754.method1744(field731, 171);
            if (field719 == 0) {
                short var50 = 251;
                arg0.method3859(class157.field2512, field731 + 180, var50, 16776960, 0);
                int var109 = var50 + 30;
                int var51 = field731 + 180 - 80;
                short var52 = 291;
                Statics.field720.method1744(var51 - 73, var52 - 20);
                arg0.method3904(class157.field2513, var51 - 73, var52 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var53 = field731 + 180 + 80;
                Statics.field720.method1744(var53 - 73, var52 - 20);
                arg0.method3904(class157.field2514, var53 - 73, var52 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field719 == 1) {
                arg0.method3859(class157.field2383, field731 + 180, 211, 16776960, 0);
                short var54 = 236;
                arg0.method3859(field740, field731 + 180, var54, 16777215, 0);
                int var110 = var54 + 15;
                arg0.method3859(field741, field731 + 180, var110, 16777215, 0);
                int var111 = var110 + 15;
                arg0.method3859(field742, field731 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                int var55 = field731 + 180 - 80;
                short var56 = 321;
                Statics.field720.method1744(var55 - 73, var56 - 20);
                arg0.method3859(class157.field2285, var55, var56 + 5, 16777215, 0);
                int var57 = field731 + 180 + 80;
                Statics.field720.method1744(var57 - 73, var56 - 20);
                arg0.method3859(class157.field2516, var57, var56 + 5, 16777215, 0);
            } else if (field719 == 2) {
                short var58 = 211;
                arg0.method3859(field740, field731 + 180, var58, 16776960, 0);
                int var113 = var58 + 15;
                arg0.method3859(field741, field731 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg0.method3859(field742, field731 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var116 = var115 + 10;
                arg0.method3848(class157.field2313, field731 + 180 - 110, var116, 16777215, 0);
                short var59 = 200;
                String var60;
                for (var60 = field743; arg0.method3822(var60) > var59; var60 = var60.substring(1)) {
                }
                arg0.method3848(class223.method3826(var60) + (field718 == 0 & client.field299 % 40 < 20 ? class2.method134(16776960) + class2.field19 : ""), field731 + 180 - 70, var116, 16777215, 0);
                var113 = var116 + 15;
                String var62 = class157.field2489;
                String var63 = field728;
                int var64 = var63.length();
                char[] var65 = new char[var64];
                for (int var66 = 0; var66 < var64; var66++) {
                    var65[var66] = '*';
                }
                String var67 = new String(var65);
                arg0.method3848(var62 + var67 + (field718 == 1 & client.field299 % 40 < 20 ? class2.method134(16776960) + class2.field19 : ""), field731 + 180 - 108, var113, 16777215, 0);
                var113 += 15;
                int var69 = field731 + 180 - 80;
                short var70 = 321;
                Statics.field720.method1744(var69 - 73, var70 - 20);
                arg0.method3859(class157.field2504, var69, var70 + 5, 16777215, 0);
                int var71 = field731 + 180 + 80;
                Statics.field720.method1744(var71 - 73, var70 - 20);
                arg0.method3859(class157.field2516, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                arg1.method3859(class157.field2517, field731 + 180, var72, 16776960, 0);
            } else if (field719 == 4) {
                arg0.method3859(class157.field2553, field731 + 180, 211, 16776960, 0);
                short var73 = 236;
                arg0.method3859(field740, field731 + 180, var73, 16777215, 0);
                int var117 = var73 + 15;
                arg0.method3859(field741, field731 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method3859(field742, field731 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                String var75 = class157.field2511;
                String var76 = Statics.field582;
                int var77 = var76.length();
                char[] var78 = new char[var77];
                for (int var79 = 0; var79 < var77; var79++) {
                    var78[var79] = '*';
                }
                String var80 = new String(var78);
                arg0.method3848(var75 + var80 + (client.field299 % 40 < 20 ? class2.method134(16776960) + class2.field19 : ""), field731 + 180 - 108, var119, 16777215, 0);
                var117 = var119 - 8;
                arg0.method3848(class157.field2464, field731 + 180 - 9, var117, 16776960, 0);
                var117 += 15;
                arg0.method3848(class157.field2364, field731 + 180 - 9, var117, 16776960, 0);
                int var82 = field731 + 180 - 9 + arg0.method3822(class157.field2364) + 15;
                int var83 = var117 - arg0.field3176;
                class81 var84;
                if (field746) {
                    var84 = Statics.field724;
                } else {
                    var84 = Statics.field723;
                }
                var84.method1744(var82, var83);
                var117 += 15;
                int var85 = field731 + 180 - 80;
                short var86 = 321;
                Statics.field720.method1744(var85 - 73, var86 - 20);
                arg0.method3859(class157.field2285, var85, var86 + 5, 16777215, 0);
                int var87 = field731 + 180 + 80;
                Statics.field720.method1744(var87 - 73, var86 - 20);
                arg0.method3859(class157.field2516, var87, var86 + 5, 16777215, 0);
                arg1.method3859(class157.field2505, field731 + 180, var86 + 36, 255, 0);
            } else if (field719 == 5) {
                arg0.method3859(class157.field2518, field731 + 180, 201, 16776960, 0);
                short var88 = 221;
                arg2.method3859(field740, field731 + 180, var88, 16776960, 0);
                int var120 = var88 + 15;
                arg2.method3859(field741, field731 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg2.method3859(field742, field731 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var123 = var122 + 14;
                arg0.method3848(class157.field2519, field731 + 180 - 145, var123, 16777215, 0);
                short var89 = 174;
                String var90;
                for (var90 = field743; arg0.method3822(var90) > var89; var90 = var90.substring(1)) {
                }
                arg0.method3848(class223.method3826(var90) + (client.field299 % 40 < 20 ? class2.method134(16776960) + class2.field19 : ""), field731 + 180 - 34, var123, 16777215, 0);
                var120 = var123 + 15;
                int var91 = field731 + 180 - 80;
                short var92 = 321;
                Statics.field720.method1744(var91 - 73, var92 - 20);
                arg0.method3859(class157.field2520, var91, var92 + 5, 16777215, 0);
                int var93 = field731 + 180 + 80;
                Statics.field720.method1744(var93 - 73, var92 - 20);
                arg0.method3859(class157.field2432, var93, var92 + 5, 16777215, 0);
            } else if (field719 == 6) {
                short var94 = 211;
                arg0.method3859(field740, field731 + 180, var94, 16776960, 0);
                int var124 = var94 + 15;
                arg0.method3859(field741, field731 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method3859(field742, field731 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var95 = field731 + 180;
                short var96 = 321;
                Statics.field720.method1744(var95 - 73, var96 - 20);
                arg0.method3859(class157.field2432, var95, var96 + 5, 16777215, 0);
            }
        }
        if (field747 > 0) {
            method687(field747);
            field747 = 0;
        }
        method1228();
        Statics.field256[Statics.field1752.field149 ? 1 : 0].method1744(field739 + 765 - 40, 463);
        if (client.field423 > 5 && client.field294 == 0) {
            if (Statics.field687 == null) {
                Statics.field687 = class77.method848(Statics.field1754, "sl_button", "");
            } else {
                int var97 = field739 + 5;
                short var98 = 463;
                byte var99 = 100;
                byte var100 = 35;
                Statics.field687.method1744(var97, var98);
                arg0.method3859(class157.field2445 + " " + client.field471, var99 / 2 + var97, var100 / 2 + var98 - 2, 16777215, 0);
                if (Statics.field2249 == null) {
                    arg1.method3859(class157.field2366, var99 / 2 + var97, var100 / 2 + var98 + 12, 16777215, 0);
                } else {
                    arg1.method3859(class157.field2552, var99 / 2 + var97, var100 / 2 + var98 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var101 = Statics.field1745.getGraphics();
            Statics.field2052.method1507(var101, 0, 0);
        } catch (Exception var104) {
            Statics.field1745.repaint();
        }
    }

    @ObfuscatedName("az.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method685(String arg0, String arg1, String arg2) {
        field740 = arg0;
        field741 = arg1;
        field742 = arg2;
    }

    @ObfuscatedName("ay.a(Lcx;I)V")
    public static final void method970(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field214.length; var2++) {
            Statics.field214[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field214[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2230[var8] = (Statics.field214[var8 - 1] + Statics.field214[var8 + 1] + Statics.field214[var8 - 128] + Statics.field214[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field214;
            Statics.field214 = Statics.field2230;
            Statics.field2230 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1420; var11++) {
            for (int var12 = 0; var12 < arg0.field1419; var12++) {
                if (arg0.field1418[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1422;
                    int var14 = var11 + 16 + arg0.field1421;
                    int var15 = (var14 << 7) + var13;
                    Statics.field214[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ad.e(II)V")
    public static final void method687(int arg0) {
        short var1 = 256;
        field717 += arg0 * 128;
        if (field717 > Statics.field214.length) {
            field717 -= Statics.field214.length;
            int var2 = (int) (Math.random() * 12.0D);
            method970(Statics.field721[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field3131[var3 + var4] - Statics.field214[field717 + var3 & Statics.field214.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field3131[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field3131[var9 + var10] = 255;
                } else {
                    Statics.field3131[var9 + var10] = 0;
                }
            }
        }
        if (field745 > 0) {
            field745 -= arg0 * 4;
        }
        if (field732 > 0) {
            field732 -= arg0 * 4;
        }
        if (field745 == 0 && field732 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field745 = 1024;
            }
            if (var12 == 1) {
                field732 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field752[var13] = field752[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field752[var14] = (int) (Math.sin((double) field736 / 14.0D) * 16.0D + Math.sin((double) field736 / 15.0D) * 14.0D + Math.sin((double) field736 / 16.0D) * 12.0D);
            field736++;
        }
        field734 += arg0 * -809494109;
        int var15 = ((client.field299 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field734 * 1962167372; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field3131[(var18 << 7) + var17] = 192;
        }
        field734 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field3131[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field3131[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field716[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field716[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field716[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field3131[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("df.b(IIII)I")
    public static final int method2503(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bm.o(B)V")
    public static final void method1228() {
        short var0 = 256;
        if (field745 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field745 > 768) {
                    Statics.field729[var1] = method2503(Statics.field1593[var1], Statics.field3216[var1], 1024 - field745);
                } else if (field745 > 256) {
                    Statics.field729[var1] = Statics.field3216[var1];
                } else {
                    Statics.field729[var1] = method2503(Statics.field3216[var1], Statics.field1593[var1], 256 - field745);
                }
            }
        } else if (field732 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field732 > 768) {
                    Statics.field729[var2] = method2503(Statics.field1593[var2], Statics.field730[var2], 1024 - field732);
                } else if (field732 > 256) {
                    Statics.field729[var2] = Statics.field730[var2];
                } else {
                    Statics.field729[var2] = method2503(Statics.field730[var2], Statics.field1593[var2], 256 - field732);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field729[var3] = Statics.field1593[var3];
            }
        }
        class80.method1689(field739, 9, field739 + 128, var0 + 7);
        Statics.field2025.method1619(field739, 0);
        class80.method1676();
        int var4 = 0;
        int var5 = field739 + Statics.field2052.field1393 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field752[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field3131[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field729[var10];
                    int var14 = Statics.field2052.field1394[var5];
                    Statics.field2052.field1394[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field2052.field1393 + var8 - 128;
        }
        class80.method1689(field739 + 765 - 128, 9, field739 + 765, var0 + 7);
        Statics.field744.method1619(field739 + 382, 0);
        class80.method1676();
        int var15 = 0;
        int var16 = field739 + Statics.field2052.field1393 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field752[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field3131[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field729[var22];
                    int var26 = Statics.field2052.field1394[var20];
                    Statics.field2052.field1394[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2052.field1393 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cj.m(Lea;I)V")
    public static void method2043(class144 arg0) {
        if (class140.field2134 != 1 && Statics.field627 || class140.field2134 != 4) {
            return;
        }
        int var1 = field739 + 280;
        if (class140.field2135 >= var1 && class140.field2135 <= var1 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(0, 0);
            return;
        }
        if (class140.field2135 >= var1 + 15 && class140.field2135 <= var1 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(0, 1);
            return;
        }
        int var2 = field739 + 390;
        if (class140.field2135 >= var2 && class140.field2135 <= var2 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(1, 0);
            return;
        }
        if (class140.field2135 >= var2 + 15 && class140.field2135 <= var2 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(1, 1);
            return;
        }
        int var3 = field739 + 500;
        if (class140.field2135 >= var3 && class140.field2135 <= var3 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(2, 0);
            return;
        }
        if (class140.field2135 >= var3 + 15 && class140.field2135 <= var3 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(2, 1);
            return;
        }
        int var4 = field739 + 610;
        if (class140.field2135 >= var4 && class140.field2135 <= var4 + 14 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(3, 0);
            return;
        }
        if (class140.field2135 >= var4 + 15 && class140.field2135 <= var4 + 80 && class140.field2136 >= 4 && class140.field2136 <= 18) {
            class26.method823(3, 1);
            return;
        }
        if (class140.field2135 >= field739 + 708 && class140.field2136 >= 4 && class140.field2135 <= field739 + 708 + 50 && class140.field2136 <= 20) {
            field750 = false;
            Statics.field2025.method1619(field739, 0);
            Statics.field744.method1619(field739 + 382, 0);
            Statics.field134.method1744(field739 + 382 - Statics.field134.field1419 / 2, 18);
            return;
        }
        if (field751 == -1) {
            return;
        }
        class26 var5 = Statics.field642[field751];
        method3011(var5);
        field750 = false;
        Statics.field2025.method1619(field739, 0);
        Statics.field744.method1619(field739 + 382, 0);
        Statics.field134.method1744(field739 + 382 - Statics.field134.field1419 / 2, 18);
        return;
    }

    @ObfuscatedName("fo.x(Lc;I)V")
    public static void method3011(class26 arg0) {
        if (arg0.method581() != client.field292) {
            client.field292 = arg0.method581();
            boolean var1 = arg0.method581();
            if (Statics.field2890 != var1) {
                class52.field1113.method3556();
                class52.field1114.method3556();
                class52.field1133.method3556();
                Statics.field2890 = var1;
            }
        }
        Statics.field654 = arg0.field650;
        client.field471 = arg0.field656;
        client.field289 = arg0.field648;
        Statics.field2624 = client.field376 == 0 ? 43594 : arg0.field656 + 40000;
        Statics.field2030 = client.field376 == 0 ? 443 : arg0.field656 + 50000;
        Statics.field144 = Statics.field2624;
    }
}
