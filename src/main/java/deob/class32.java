package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("am")
public class class32 {

    @ObfuscatedName("am.f")
    public static int field717 = 0;

    @ObfuscatedName("am.w")
    public static int field730 = field717 + 202;

    @ObfuscatedName("am.z")
    public static int[] field726 = new int[256];

    @ObfuscatedName("am.n")
    public static int field746 = 0;

    @ObfuscatedName("am.c")
    public static int field716 = 0;

    @ObfuscatedName("am.ac")
    public static int field729 = 0;

    @ObfuscatedName("am.ah")
    public static int field720 = 0;

    @ObfuscatedName("am.al")
    public static int field728 = 0;

    @ObfuscatedName("am.am")
    public static int field727 = 0;

    @ObfuscatedName("am.ae")
    public static int field733 = 10;

    @ObfuscatedName("am.ai")
    public static String field734 = "";

    @ObfuscatedName("am.aa")
    public static int field735 = 0;

    @ObfuscatedName("am.ag")
    public static String field736 = "";

    @ObfuscatedName("am.an")
    public static String field737 = "";

    @ObfuscatedName("am.ap")
    public static String field749 = "";

    @ObfuscatedName("am.ay")
    public static String field739 = "";

    @ObfuscatedName("am.ax")
    public static String field740 = "";

    @ObfuscatedName("am.af")
    public static class159 field741 = class159.field2591;

    @ObfuscatedName("am.ad")
    public static boolean field742 = true;

    @ObfuscatedName("am.ab")
    public static int field743 = 0;

    @ObfuscatedName("am.ao")
    public static String field738 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("am.az")
    public static String field721 = "1234567890";

    @ObfuscatedName("am.ak")
    public static boolean field744 = false;

    @ObfuscatedName("am.bb")
    public static int field748 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.o(Ljava/awt/Component;Lfd;Lfd;ZII)V")
    public static void method2715(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field725) {
            field735 = arg4;
            class80.method1637();
            byte[] var5 = arg1.method2986("title.jpg", "");
            Statics.field136 = new class79(var5, arg0);
            Statics.field745 = Statics.field136.method1608();
            if ((client.field289 & 0x20000000) == 0) {
                Statics.field722 = class77.method814(arg2, "logo", "");
            } else {
                Statics.field722 = class77.method814(arg2, "logo_deadman_mode", "");
            }
            Statics.field718 = class77.method814(arg2, "titlebox", "");
            Statics.field719 = class77.method814(arg2, "titlebutton", "");
            Statics.field747 = class77.method610(arg2, "runes", "");
            Statics.field1345 = class77.method610(arg2, "title_mute", "");
            Statics.field723 = class77.method814(arg2, "options_radio_buttons,0", "");
            Statics.field2908 = class77.method814(arg2, "options_radio_buttons,2", "");
            Statics.field581 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field581[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field581[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field581[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field581[var9 + 192] = 16777215;
            }
            Statics.field2118 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2118[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2118[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2118[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2118[var13 + 192] = 16777215;
            }
            Statics.field2017 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2017[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2017[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2017[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2017[var17 + 192] = 16777215;
            }
            Statics.field2163 = new int[256];
            Statics.field262 = new int[32768];
            Statics.field179 = new int[32768];
            method786((class81) null);
            Statics.field2253 = new int[32768];
            Statics.field1867 = new int[32768];
            if (arg3) {
                field739 = "";
                field740 = "";
            }
            Statics.field751 = 0;
            Statics.field1020 = "";
            field742 = true;
            field744 = false;
            if (Statics.field1030.field154) {
                class183.field2946 = 1;
                Statics.field714 = null;
                Statics.field2943 = -1;
                Statics.field2024 = -1;
                Statics.field2948 = 0;
                Statics.field2061 = false;
                Statics.field72 = 2;
            } else {
                class168 var18 = Statics.field2658;
                int var19 = var18.method2989("scape main");
                int var20 = var18.method2990(var19, "");
                class183.method2169(2, var18, var19, var20, 255, false);
            }
            class171.method2822(false);
            Statics.field725 = true;
            field717 = (Statics.field2178 - client.field502) / 2;
            field730 = field717 + 202;
            Statics.field136.method1545(field717, 0);
            Statics.field745.method1545(field717 + 382, 0);
            Statics.field722.method1699(field717 + 382 - Statics.field722.field1410 / 2, 18);
        } else if (arg4 == 4) {
            field735 = 4;
        }
    }

    @ObfuscatedName("b.f(I)V")
    public static void method534() {
        if (!Statics.field725) {
            return;
        }
        Statics.field718 = null;
        Statics.field719 = null;
        Statics.field747 = null;
        Statics.field136 = null;
        Statics.field745 = null;
        Statics.field722 = null;
        Statics.field1345 = null;
        Statics.field723 = null;
        Statics.field2908 = null;
        Statics.field2102 = null;
        Statics.field242 = null;
        Statics.field1787 = null;
        Statics.field1064 = null;
        Statics.field732 = null;
        Statics.field581 = null;
        Statics.field2118 = null;
        Statics.field2017 = null;
        Statics.field2163 = null;
        Statics.field262 = null;
        Statics.field179 = null;
        Statics.field2253 = null;
        Statics.field1867 = null;
        class183.field2946 = 1;
        Statics.field714 = null;
        Statics.field2943 = -1;
        Statics.field2024 = -1;
        Statics.field2948 = 0;
        Statics.field2061 = false;
        Statics.field72 = 2;
        class171.method2822(true);
        Statics.field725 = false;
    }

    @ObfuscatedName("m.i(Lef;I)V")
    public static void method84(class144 arg0) {
        if (field744) {
            Statics.method939(arg0);
            return;
        }
        if ((class140.field2144 == 1 || !Statics.field1037 && class140.field2144 == 4) && class140.field2145 >= field717 + 765 - 50 && class140.field2146 >= 453) {
            Statics.field1030.field154 = !Statics.field1030.field154;
            class9.method2599();
            if (Statics.field1030.field154) {
                Statics.field3197.method3320();
                class183.field2946 = 1;
                Statics.field714 = null;
            } else {
                class183.method134(Statics.field2658, "scape main", "", 255, false);
            }
        }
        if (client.field297 == 5) {
            return;
        }
        field728++;
        if (client.field297 != 10 && client.field297 != 11) {
            return;
        }
        if (client.field294 == 0) {
            if (class140.field2144 == 1 || !Statics.field1037 && class140.field2144 == 4) {
                int var1 = field717 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class140.field2145 >= var1 && class140.field2145 <= var1 + var3 && class140.field2146 >= var2 && class140.field2146 <= var2 + var4) {
                    if (class26.method548()) {
                        field744 = true;
                    }
                    return;
                }
            }
            if (Statics.field2654 != null && class26.method548()) {
                field744 = true;
            }
        }
        int var5 = class140.field2144;
        int var6 = class140.field2145;
        int var7 = class140.field2146;
        if (!Statics.field1037 && var5 == 4) {
            var5 = 1;
        }
        if (field735 == 0) {
            int var8 = field730 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class138.method3425(client.method156("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field730 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field289 & 0x4) != 0) {
                    if ((client.field289 & 0x400) == 0) {
                        field736 = class157.field2489;
                        field737 = class157.field2515;
                        field749 = class157.field2516;
                    } else {
                        field736 = class157.field2520;
                        field737 = class157.field2338;
                        field749 = class157.field2463;
                    }
                    field735 = 1;
                    field743 = 0;
                } else if ((client.field289 & 0x400) == 0) {
                    field736 = class157.field2378;
                    field737 = class157.field2511;
                    field749 = class157.field2497;
                    field735 = 2;
                    field743 = 0;
                } else {
                    field736 = class157.field2517;
                    field737 = class157.field2518;
                    field749 = class157.field2519;
                    field735 = 1;
                    field743 = 0;
                }
            }
        } else if (field735 == 1) {
            while (class137.method2213()) {
                if (Statics.field2103 == 84) {
                    field736 = class157.field2378;
                    field737 = class157.field2511;
                    field749 = class157.field2497;
                    field735 = 2;
                    field743 = 0;
                } else if (Statics.field2103 == 13) {
                    field735 = 0;
                }
            }
            int var11 = field730 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field736 = class157.field2378;
                field737 = class157.field2511;
                field749 = class157.field2497;
                field735 = 2;
                field743 = 0;
            }
            int var13 = field730 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field735 = 0;
            }
        } else if (field735 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field743 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field743 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method149(class157.field2522, class157.field2450, class157.field2543);
                field735 = 5;
                return;
            }
            int var16 = field730 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field739 = field739.trim();
                if (field739.length() == 0) {
                    method149(class157.field2416, class157.field2417, class157.field2367);
                    return;
                }
                if (field740.length() == 0) {
                    method149(class157.field2311, class157.field2420, class157.field2421);
                    return;
                }
                method149(class157.field2525, class157.field2526, class157.field2333);
                field741 = Statics.field1030.field150.containsKey(class163.method2763(field739)) ? class159.field2586 : class159.field2591;
                client.method908(20);
                return;
            }
            int var18 = field730 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field735 = 0;
                field739 = "";
                field740 = "";
                Statics.field751 = 0;
                Statics.field1020 = "";
                field742 = true;
            }
            while (true) {
                while (class137.method2213()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field738.length(); var20++) {
                        if (Statics.field2265 == field738.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field2103 == 13) {
                        field735 = 0;
                        field739 = "";
                        field740 = "";
                        Statics.field751 = 0;
                        Statics.field1020 = "";
                        field742 = true;
                    } else if (field743 == 0) {
                        if (Statics.field2103 == 85 && field739.length() > 0) {
                            field739 = field739.substring(0, field739.length() - 1);
                        }
                        if (Statics.field2103 == 84 || Statics.field2103 == 80) {
                            field743 = 1;
                        }
                        if (var19 && field739.length() < 320) {
                            field739 = field739 + Statics.field2265;
                        }
                    } else if (field743 == 1) {
                        if (Statics.field2103 == 85 && field740.length() > 0) {
                            field740 = field740.substring(0, field740.length() - 1);
                        }
                        if (Statics.field2103 == 84 || Statics.field2103 == 80) {
                            field743 = 0;
                        }
                        if (Statics.field2103 == 84) {
                            field739 = field739.trim();
                            if (field739.length() == 0) {
                                method149(class157.field2416, class157.field2417, class157.field2367);
                                return;
                            }
                            if (field740.length() == 0) {
                                method149(class157.field2311, class157.field2420, class157.field2421);
                                return;
                            }
                            method149(class157.field2525, class157.field2526, class157.field2333);
                            field741 = Statics.field1030.field150.containsKey(class163.method2763(field739)) ? class159.field2586 : class159.field2591;
                            client.method908(20);
                            return;
                        }
                        if (var19 && field740.length() < 20) {
                            field740 = field740 + Statics.field2265;
                        }
                    }
                }
                return;
            }
        } else if (field735 == 4) {
            int var21 = field730 + 180 - 80;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field1020.trim();
                if (Statics.field1020.length() != 6) {
                    method149(class157.field2332, class157.field2372, class157.field2334);
                    return;
                }
                Statics.field751 = Integer.parseInt(Statics.field1020);
                Statics.field1020 = "";
                field741 = field742 ? class159.field2588 : class159.field2587;
                method149(class157.field2525, class157.field2526, class157.field2333);
                client.method908(20);
                return;
            }
            if (var5 == 1 && var6 >= field730 + 180 - 9 && var6 <= field730 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field742 = !field742;
            }
            if (var5 == 1 && var6 >= field730 + 180 - 34 && var6 <= field730 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class138.method3425(client.method156("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var23 = field730 + 180 + 80;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field735 = 0;
                field739 = "";
                field740 = "";
                Statics.field751 = 0;
                Statics.field1020 = "";
            }
            while (class137.method2213()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field721.length(); var25++) {
                    if (Statics.field2265 == field721.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field2103 == 13) {
                    field735 = 0;
                    field739 = "";
                    field740 = "";
                    Statics.field751 = 0;
                    Statics.field1020 = "";
                } else {
                    if (Statics.field2103 == 85 && Statics.field1020.length() > 0) {
                        Statics.field1020 = Statics.field1020.substring(0, Statics.field1020.length() - 1);
                    }
                    if (Statics.field2103 == 84) {
                        Statics.field1020.trim();
                        if (Statics.field1020.length() != 6) {
                            method149(class157.field2332, class157.field2372, class157.field2334);
                            return;
                        }
                        Statics.field751 = Integer.parseInt(Statics.field1020);
                        Statics.field1020 = "";
                        field741 = field742 ? class159.field2588 : class159.field2587;
                        method149(class157.field2525, class157.field2526, class157.field2333);
                        client.method908(20);
                        return;
                    }
                    if (var24 && Statics.field1020.length() < 6) {
                        Statics.field1020 = Statics.field1020 + Statics.field2265;
                    }
                }
            }
        } else if (field735 == 5) {
            int var26 = field730 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method550();
                return;
            }
            int var28 = field730 + 180 + 80;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field736 = class157.field2378;
                field737 = class157.field2511;
                field749 = class157.field2497;
                field735 = 2;
                field743 = 0;
                field740 = "";
            }
            while (class137.method2213()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field738.length(); var30++) {
                    if (Statics.field2265 == field738.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field2103 == 13) {
                    field736 = class157.field2378;
                    field737 = class157.field2511;
                    field749 = class157.field2497;
                    field735 = 2;
                    field743 = 0;
                    field740 = "";
                } else {
                    if (Statics.field2103 == 85 && field739.length() > 0) {
                        field739 = field739.substring(0, field739.length() - 1);
                    }
                    if (Statics.field2103 == 84) {
                        method550();
                        return;
                    }
                    if (var29 && field739.length() < 320) {
                        field739 = field739 + Statics.field2265;
                    }
                }
            }
        } else if (field735 == 6) {
            while (true) {
                do {
                    if (!class137.method2213()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field736 = class157.field2378;
                            field737 = class157.field2511;
                            field749 = class157.field2497;
                            field735 = 2;
                            field743 = 0;
                            field740 = "";
                        }
                        return;
                    }
                } while (Statics.field2103 != 84 && Statics.field2103 != 13);
                field736 = class157.field2378;
                field737 = class157.field2511;
                field749 = class157.field2497;
                field735 = 2;
                field743 = 0;
                field740 = "";
            }
        }
    }

    @ObfuscatedName("r.h(I)V")
    public static void method550() {
        field739 = field739.trim();
        if (field739.length() == 0) {
            method149(class157.field2522, class157.field2450, class157.field2543);
            return;
        }
        long var0 = class10.method2716();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field739;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2347(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2278(var4.nextInt());
            }
            var5.method2278(var7[0]);
            var5.method2278(var7[1]);
            var5.method2415(var0);
            var5.method2415(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2278(var4.nextInt());
            }
            var5.method2310(class10.field159, class10.field158);
            var6.method2347(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2278(var4.nextInt());
            }
            var6.method2415(var4.nextLong());
            var6.method2279(var4.nextLong());
            class149.method169(var6);
            var6.method2415(var4.nextLong());
            var6.method2310(class10.field159, class10.field158);
            int var11 = class119.method2219(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class119 var12 = new class119(var11);
            var12.method2281(var3);
            var12.field1984 = var11;
            var12.method2306(var7);
            class119 var13 = new class119(var12.field1984 + var6.field1984 + var5.field1984 + 5);
            var13.method2347(2);
            var13.method2347(var5.field1984);
            var13.method2392(var5.field1989, 0, var5.field1984);
            var13.method2347(var6.field1984);
            var13.method2392(var6.field1989, 0, var6.field1984);
            var13.method2318(var12.field1984);
            var13.method2392(var12.field1989, 0, var12.field1984);
            String var14 = class161.method2241(var13.field1989);
            byte var21;
            try {
                URL var15 = new URL(client.method156("services", false) + "m=accountappeal/login.ws");
                URLConnection var16 = var15.openConnection();
                var16.setDoInput(true);
                var16.setDoOutput(true);
                var16.setConnectTimeout(5000);
                OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                var17.write("data2=" + class226.method3667(var14) + "&dest=" + class226.method3667("passwordchoice.ws"));
                var17.flush();
                InputStream var18 = var16.getInputStream();
                class119 var19 = new class119(new byte[1000]);
                while (true) {
                    int var20 = var18.read(var19.field1989, var19.field1984, 1000 - var19.field1984);
                    if (var20 == -1) {
                        var17.close();
                        var18.close();
                        String var22 = new String(var19.field1989);
                        if (var22.startsWith("OFFLINE")) {
                            var21 = 4;
                        } else if (var22.startsWith("WRONG")) {
                            var21 = 7;
                        } else if (var22.startsWith("RELOAD")) {
                            var21 = 3;
                        } else if (var22.startsWith("Not permitted for social network accounts.")) {
                            var21 = 6;
                        } else {
                            var19.method2307(var7);
                            while (var19.field1984 > 0 && var19.field1989[var19.field1984 - 1] == 0) {
                                var19.field1984--;
                            }
                            String var23 = new String(var19.field1989, 0, var19.field1984);
                            if (class10.method2707(var23)) {
                                class138.method3425(var23, true, false);
                                var21 = 2;
                            } else {
                                var21 = 5;
                            }
                        }
                        break;
                    }
                    var19.field1984 += var20;
                    if (var19.field1984 >= 1000) {
                        var21 = 5;
                        break;
                    }
                }
            } catch (Throwable var25) {
                var25.printStackTrace();
                var21 = 5;
            }
            var2 = var21;
        }
        switch(var2) {
            case 2:
                method149(class157.field2385, class157.field2390, class157.field2546);
                field735 = 6;
                break;
            case 3:
                method149(class157.field2547, class157.field2548, class157.field2549);
                break;
            case 4:
                method149(class157.field2550, class157.field2551, class157.field2345);
                break;
            case 5:
                method149(class157.field2363, class157.field2411, class157.field2418);
                break;
            case 6:
                method149(class157.field2481, class157.field2314, class157.field2558);
                break;
            case 7:
                method149(class157.field2321, class157.field2556, class157.field2561);
        }
    }

    @ObfuscatedName("bs.q(Lhf;Lhf;Lhf;ZI)V")
    public static void method1425(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field717 = (Statics.field2178 - client.field502) / 2;
            field730 = field717 + 202;
        }
        if (field744) {
            if (Statics.field2102 == null) {
                Statics.field2102 = class77.method1526(Statics.field1553, "sl_back", "");
            }
            if (Statics.field242 == null) {
                Statics.field242 = class77.method610(Statics.field1553, "sl_flags", "");
            }
            if (Statics.field1787 == null) {
                Statics.field1787 = class77.method610(Statics.field1553, "sl_arrows", "");
            }
            if (Statics.field1064 == null) {
                Statics.field1064 = class77.method610(Statics.field1553, "sl_stars", "");
            }
            class80.method1665(field717, 23, 765, 480, 0);
            class80.method1640(field717, 0, 125, 23, 12425273, 9135624);
            class80.method1640(field717 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3794(class157.field2419, field717 + 62, 15, 0, -1);
            if (Statics.field1064 != null) {
                Statics.field1064[1].method1699(field717 + 140, 1);
                arg1.method3723(class157.field2542, field717 + 152, 10, 16777215, -1);
                Statics.field1064[0].method1699(field717 + 140, 12);
                arg1.method3723(class157.field2564, field717 + 152, 21, 16777215, -1);
            }
            if (Statics.field1787 != null) {
                int var4 = field717 + 280;
                if (class26.field651[0] == 0 && class26.field650[0] == 0) {
                    Statics.field1787[2].method1699(var4, 4);
                } else {
                    Statics.field1787[0].method1699(var4, 4);
                }
                if (class26.field651[0] == 0 && class26.field650[0] == 1) {
                    Statics.field1787[3].method1699(var4 + 15, 4);
                } else {
                    Statics.field1787[1].method1699(var4 + 15, 4);
                }
                arg0.method3723(class157.field2394, var4 + 32, 17, 16777215, -1);
                int var5 = field717 + 390;
                if (class26.field651[0] == 1 && class26.field650[0] == 0) {
                    Statics.field1787[2].method1699(var5, 4);
                } else {
                    Statics.field1787[0].method1699(var5, 4);
                }
                if (class26.field651[0] == 1 && class26.field650[0] == 1) {
                    Statics.field1787[3].method1699(var5 + 15, 4);
                } else {
                    Statics.field1787[1].method1699(var5 + 15, 4);
                }
                arg0.method3723(class157.field2566, var5 + 32, 17, 16777215, -1);
                int var6 = field717 + 500;
                if (class26.field651[0] == 2 && class26.field650[0] == 0) {
                    Statics.field1787[2].method1699(var6, 4);
                } else {
                    Statics.field1787[0].method1699(var6, 4);
                }
                if (class26.field651[0] == 2 && class26.field650[0] == 1) {
                    Statics.field1787[3].method1699(var6 + 15, 4);
                } else {
                    Statics.field1787[1].method1699(var6 + 15, 4);
                }
                arg0.method3723(class157.field2567, var6 + 32, 17, 16777215, -1);
                int var7 = field717 + 610;
                if (class26.field651[0] == 3 && class26.field650[0] == 0) {
                    Statics.field1787[2].method1699(var7, 4);
                } else {
                    Statics.field1787[0].method1699(var7, 4);
                }
                if (class26.field651[0] == 3 && class26.field650[0] == 1) {
                    Statics.field1787[3].method1699(var7 + 15, 4);
                } else {
                    Statics.field1787[1].method1699(var7 + 15, 4);
                }
                arg0.method3723(class157.field2568, var7 + 32, 17, 16777215, -1);
            }
            class80.method1665(field717 + 708, 4, 50, 16, 0);
            arg1.method3794(class157.field2535, field717 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field289 & var9;
            for (int var11 = 0; var11 < class26.field648; var11++) {
                class26 var12 = Statics.field647[var11];
                if ((var12.field643 & var9) == var10 || (var12.field643 & var9) == 0) {
                    var8++;
                }
            }
            field748 = -1;
            if (Statics.field2102 != null) {
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
                int var24 = field717 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field648; var27++) {
                    class26 var28 = Statics.field647[var27];
                    if ((var28.field643 & var9) == var10 || (var28.field643 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field655);
                        if (var28.field655 == -1) {
                            var30 = class157.field2569;
                            var29 = false;
                        } else if (var28.field655 > 1980) {
                            var30 = class157.field2469;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method578()) {
                            if (var28.method576()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method576()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class140.field2150 >= var24 && class140.field2139 * -432201367 >= var23 && class140.field2150 < var13 + var24 && class140.field2139 * -432201367 < var14 + var23 && var29) {
                            field748 = var27;
                            Statics.field2102[var31].method1551(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field2102[var31].method1545(var24, var23);
                        }
                        if (Statics.field242 != null) {
                            Statics.field242[(var28.method576() ? 8 : 0) + var28.field657].method1699(var24 + 29, var23);
                        }
                        arg0.method3794(Integer.toString(var28.field652), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3794(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var32 = arg1.method3775(Statics.field647[field748].field656) + 6;
                    int var33 = arg1.field3175 + 8;
                    class80.method1665(class140.field2150 - var32 / 2, class140.field2139 * -432201367 + 20 + 5, var32, var33, 16777120);
                    class80.method1641(class140.field2150 - var32 / 2, class140.field2139 * -432201367 + 20 + 5, var32, var33, 0);
                    arg1.method3794(Statics.field647[field748].field656, class140.field2150, class140.field2139 * -432201367 + 20 + 5 + arg1.field3175 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1038.getGraphics();
                Statics.field3103.method1458(var34, 0, 0);
            } catch (Exception var102) {
                Statics.field1038.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field136.method1545(field717, 0);
            Statics.field745.method1545(field717 + 382, 0);
            Statics.field722.method1699(field717 + 382 - Statics.field722.field1410 / 2, 18);
        }
        if (client.field297 == 0 || client.field297 == 5) {
            byte var36 = 20;
            arg0.method3794(class157.field2509, field730 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class80.method1641(field730 + 180 - 152, var37, 304, 34, 9179409);
            class80.method1641(field730 + 180 - 151, var37 + 1, 302, 32, 0);
            class80.method1665(field730 + 180 - 150, var37 + 2, field733 * 3, 30, 9179409);
            class80.method1665(field733 * 3 + (field730 + 180 - 150), var37 + 2, 300 - field733 * 3, 30, 0);
            arg0.method3794(field734, field730 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field297 == 20) {
            Statics.field718.method1699(field730 + 180 - Statics.field718.field1410 / 2, 271 - Statics.field718.field1407 / 2);
            short var38 = 211;
            arg0.method3794(field736, field730 + 180, var38, 16776960, 0);
            int var104 = var38 + 15;
            arg0.method3794(field737, field730 + 180, var104, 16776960, 0);
            int var105 = var104 + 15;
            arg0.method3794(field749, field730 + 180, var105, 16776960, 0);
            int var106 = var105 + 15;
            int var107 = var106 + 10;
            if (field735 != 4) {
                arg0.method3723(class157.field2528, field730 + 180 - 110, var107, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field739; arg0.method3775(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3723(class223.method3722(var40), field730 + 180 - 70, var107, 16777215, 0);
                var104 = var107 + 15;
                String var42 = class157.field2529;
                String var43 = field740;
                int var44 = var43.length();
                char[] var45 = new char[var44];
                for (int var46 = 0; var46 < var44; var46++) {
                    var45[var46] = '*';
                }
                String var47 = new String(var45);
                arg0.method3723(var42 + var47, field730 + 180 - 108, var104, 16777215, 0);
                var104 += 15;
            }
        }
        if (client.field297 == 10 || client.field297 == 11) {
            Statics.field718.method1699(field730, 171);
            if (field735 == 0) {
                short var49 = 251;
                arg0.method3794(class157.field2531, field730 + 180, var49, 16776960, 0);
                int var108 = var49 + 30;
                int var50 = field730 + 180 - 80;
                short var51 = 291;
                Statics.field719.method1699(var50 - 73, var51 - 20);
                arg0.method3797(class157.field2532, var50 - 73, var51 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var52 = field730 + 180 + 80;
                Statics.field719.method1699(var52 - 73, var51 - 20);
                arg0.method3797(class157.field2533, var52 - 73, var51 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field735 == 1) {
                arg0.method3794(class157.field2513, field730 + 180, 211, 16776960, 0);
                short var53 = 236;
                arg0.method3794(field736, field730 + 180, var53, 16777215, 0);
                int var109 = var53 + 15;
                arg0.method3794(field737, field730 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                arg0.method3794(field749, field730 + 180, var110, 16777215, 0);
                int var111 = var110 + 15;
                int var54 = field730 + 180 - 80;
                short var55 = 321;
                Statics.field719.method1699(var54 - 73, var55 - 20);
                arg0.method3794(class157.field2304, var54, var55 + 5, 16777215, 0);
                int var56 = field730 + 180 + 80;
                Statics.field719.method1699(var56 - 73, var55 - 20);
                arg0.method3794(class157.field2535, var56, var55 + 5, 16777215, 0);
            } else if (field735 == 2) {
                short var57 = 211;
                arg0.method3794(field736, field730 + 180, var57, 16776960, 0);
                int var112 = var57 + 15;
                arg0.method3794(field737, field730 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg0.method3794(field749, field730 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var115 = var114 + 10;
                arg0.method3723(class157.field2528, field730 + 180 - 110, var115, 16777215, 0);
                short var58 = 200;
                String var59;
                for (var59 = field739; arg0.method3775(var59) > var58; var59 = var59.substring(1)) {
                }
                arg0.method3723(class223.method3722(var59) + (field743 == 0 & client.field299 % 40 < 20 ? class2.method2244(16776960) + class2.field23 : ""), field730 + 180 - 70, var115, 16777215, 0);
                var112 = var115 + 15;
                String var61 = class157.field2529;
                String var62 = field740;
                int var63 = var62.length();
                char[] var64 = new char[var63];
                for (int var65 = 0; var65 < var63; var65++) {
                    var64[var65] = '*';
                }
                String var66 = new String(var64);
                arg0.method3723(var61 + var66 + (field743 == 1 & client.field299 % 40 < 20 ? class2.method2244(16776960) + class2.field23 : ""), field730 + 180 - 108, var112, 16777215, 0);
                var112 += 15;
                int var68 = field730 + 180 - 80;
                short var69 = 321;
                Statics.field719.method1699(var68 - 73, var69 - 20);
                arg0.method3794(class157.field2534, var68, var69 + 5, 16777215, 0);
                int var70 = field730 + 180 + 80;
                Statics.field719.method1699(var70 - 73, var69 - 20);
                arg0.method3794(class157.field2535, var70, var69 + 5, 16777215, 0);
                short var71 = 357;
                arg1.method3794(class157.field2536, field730 + 180, var71, 16776960, 0);
            } else if (field735 == 4) {
                arg0.method3794(class157.field2523, field730 + 180, 211, 16776960, 0);
                short var72 = 236;
                arg0.method3794(field736, field730 + 180, var72, 16777215, 0);
                int var116 = var72 + 15;
                arg0.method3794(field737, field730 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                arg0.method3794(field749, field730 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                String var74 = class157.field2530;
                String var75 = Statics.field1020;
                int var76 = var75.length();
                char[] var77 = new char[var76];
                for (int var78 = 0; var78 < var76; var78++) {
                    var77[var78] = '*';
                }
                String var79 = new String(var77);
                arg0.method3723(var74 + var79 + (client.field299 % 40 < 20 ? class2.method2244(16776960) + class2.field23 : ""), field730 + 180 - 108, var118, 16777215, 0);
                var116 = var118 - 8;
                arg0.method3723(class157.field2306, field730 + 180 - 9, var116, 16776960, 0);
                var116 += 15;
                arg0.method3723(class157.field2307, field730 + 180 - 9, var116, 16776960, 0);
                int var81 = field730 + 180 - 9 + arg0.method3775(class157.field2307) + 15;
                int var82 = var116 - arg0.field3175;
                class81 var83;
                if (field742) {
                    var83 = Statics.field2908;
                } else {
                    var83 = Statics.field723;
                }
                var83.method1699(var81, var82);
                var116 += 15;
                int var84 = field730 + 180 - 80;
                short var85 = 321;
                Statics.field719.method1699(var84 - 73, var85 - 20);
                arg0.method3794(class157.field2304, var84, var85 + 5, 16777215, 0);
                int var86 = field730 + 180 + 80;
                Statics.field719.method1699(var86 - 73, var85 - 20);
                arg0.method3794(class157.field2535, var86, var85 + 5, 16777215, 0);
                arg1.method3794(class157.field2524, field730 + 180, var85 + 36, 255, 0);
            } else if (field735 == 5) {
                arg0.method3794(class157.field2537, field730 + 180, 201, 16776960, 0);
                short var87 = 221;
                arg2.method3794(field736, field730 + 180, var87, 16776960, 0);
                int var119 = var87 + 15;
                arg2.method3794(field737, field730 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                arg2.method3794(field749, field730 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                int var122 = var121 + 14;
                arg0.method3723(class157.field2538, field730 + 180 - 145, var122, 16777215, 0);
                short var88 = 174;
                String var89;
                for (var89 = field739; arg0.method3775(var89) > var88; var89 = var89.substring(1)) {
                }
                arg0.method3723(class223.method3722(var89) + (client.field299 % 40 < 20 ? class2.method2244(16776960) + class2.field23 : ""), field730 + 180 - 34, var122, 16777215, 0);
                var119 = var122 + 15;
                int var90 = field730 + 180 - 80;
                short var91 = 321;
                Statics.field719.method1699(var90 - 73, var91 - 20);
                arg0.method3794(class157.field2539, var90, var91 + 5, 16777215, 0);
                int var92 = field730 + 180 + 80;
                Statics.field719.method1699(var92 - 73, var91 - 20);
                arg0.method3794(class157.field2540, var92, var91 + 5, 16777215, 0);
            } else if (field735 == 6) {
                short var93 = 211;
                arg0.method3794(field736, field730 + 180, var93, 16776960, 0);
                int var123 = var93 + 15;
                arg0.method3794(field737, field730 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg0.method3794(field749, field730 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var94 = field730 + 180;
                short var95 = 321;
                Statics.field719.method1699(var94 - 73, var95 - 20);
                arg0.method3794(class157.field2540, var94, var95 + 5, 16777215, 0);
            }
        }
        if (field728 > 0) {
            method1422(field728);
            field728 = 0;
        }
        method2174();
        Statics.field1345[Statics.field1030.field154 ? 1 : 0].method1699(field717 + 765 - 40, 463);
        if (client.field297 > 5 && client.field294 == 0) {
            if (Statics.field732 == null) {
                Statics.field732 = class77.method814(Statics.field1553, "sl_button", "");
            } else {
                int var96 = field717 + 5;
                short var97 = 463;
                byte var98 = 100;
                byte var99 = 35;
                Statics.field732.method1699(var96, var97);
                arg0.method3794(class157.field2464 + " " + client.field288, var98 / 2 + var96, var99 / 2 + var97 - 2, 16777215, 0);
                if (Statics.field2654 == null) {
                    arg1.method3794(class157.field2572, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
                } else {
                    arg1.method3794(class157.field2571, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var100 = Statics.field1038.getGraphics();
            Statics.field3103.method1458(var100, 0, 0);
        } catch (Exception var103) {
            Statics.field1038.repaint();
        }
    }

    @ObfuscatedName("a.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method149(String arg0, String arg1, String arg2) {
        field736 = arg0;
        field737 = arg1;
        field749 = arg2;
    }

    @ObfuscatedName("af.m(Lcj;I)V")
    public static final void method786(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field262.length; var2++) {
            Statics.field262[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field262[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field179[var8] = (Statics.field262[var8 - 1] + Statics.field262[var8 + 1] + Statics.field262[var8 - 128] + Statics.field262[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field262;
            Statics.field262 = Statics.field179;
            Statics.field179 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1407; var11++) {
            for (int var12 = 0; var12 < arg0.field1410; var12++) {
                if (arg0.field1411[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1408;
                    int var14 = var11 + 16 + arg0.field1409;
                    int var15 = (var14 << 7) + var13;
                    Statics.field262[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bs.y(IB)V")
    public static final void method1422(int arg0) {
        short var1 = 256;
        field729 += arg0 * 128;
        if (field729 > Statics.field262.length) {
            field729 -= Statics.field262.length;
            int var2 = (int) (Math.random() * 12.0D);
            method786(Statics.field747[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2253[var3 + var4] - Statics.field262[field729 + var3 & Statics.field262.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2253[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2253[var9 + var10] = 255;
                } else {
                    Statics.field2253[var9 + var10] = 0;
                }
            }
        }
        if (field746 > 0) {
            field746 -= arg0 * 4;
        }
        if (field716 > 0) {
            field716 -= arg0 * 4;
        }
        if (field746 == 0 && field716 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field746 = 1024;
            }
            if (var12 == 1) {
                field716 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field726[var13] = field726[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field726[var14] = (int) (Math.sin((double) field727 / 14.0D) * 16.0D + Math.sin((double) field727 / 15.0D) * 14.0D + Math.sin((double) field727 / 16.0D) * 12.0D);
            field727++;
        }
        field720 += arg0 * -1751152967;
        int var15 = ((client.field299 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field720 * -905031292; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2253[(var18 << 7) + var17] = 192;
        }
        field720 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2253[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2253[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1867[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1867[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1867[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2253[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("aj.p(IIII)I")
    public static final int method930(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dz.t(I)V")
    public static final void method2174() {
        short var0 = 256;
        if (field746 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field746 > 768) {
                    Statics.field2163[var1] = method930(Statics.field581[var1], Statics.field2118[var1], 1024 - field746);
                } else if (field746 > 256) {
                    Statics.field2163[var1] = Statics.field2118[var1];
                } else {
                    Statics.field2163[var1] = method930(Statics.field2118[var1], Statics.field581[var1], 256 - field746);
                }
            }
        } else if (field716 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field716 > 768) {
                    Statics.field2163[var2] = method930(Statics.field581[var2], Statics.field2017[var2], 1024 - field716);
                } else if (field716 > 256) {
                    Statics.field2163[var2] = Statics.field2017[var2];
                } else {
                    Statics.field2163[var2] = method930(Statics.field2017[var2], Statics.field581[var2], 256 - field716);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2163[var3] = Statics.field581[var3];
            }
        }
        class80.method1633(field717, 9, field717 + 128, var0 + 7);
        Statics.field136.method1545(field717, 0);
        class80.method1642();
        int var4 = 0;
        int var5 = field717 + Statics.field3103.field1378 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field726[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2253[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2163[var10];
                    int var14 = Statics.field3103.field1377[var5];
                    Statics.field3103.field1377[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field3103.field1378 + var8 - 128;
        }
        class80.method1633(field717 + 765 - 128, 9, field717 + 765, var0 + 7);
        Statics.field745.method1545(field717 + 382, 0);
        class80.method1642();
        int var15 = 0;
        int var16 = field717 + Statics.field3103.field1378 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field726[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2253[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2163[var22];
                    int var26 = Statics.field3103.field1377[var20];
                    Statics.field3103.field1377[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field3103.field1378 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("aa.v(Lx;B)V")
    public static void method711(class26 arg0) {
        if (arg0.method576() != client.field292) {
            client.field292 = arg0.method576();
            class52.method713(arg0.method576());
        }
        Statics.field1517 = arg0.field654;
        client.field288 = arg0.field652;
        client.field289 = arg0.field643;
        Statics.field1514 = client.field290 == 0 ? 43594 : arg0.field652 + 40000;
        Statics.field1351 = client.field290 == 0 ? 443 : arg0.field652 + 50000;
        Statics.field1080 = Statics.field1514;
    }
}
