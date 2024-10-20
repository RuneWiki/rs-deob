package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("an")
public class class32 {

    @ObfuscatedName("an.u")
    public static int field726 = 0;

    @ObfuscatedName("an.h")
    public static int field732 = field726 + 202;

    @ObfuscatedName("an.t")
    public static int[] field722 = new int[256];

    @ObfuscatedName("an.i")
    public static int field715 = 0;

    @ObfuscatedName("an.a")
    public static int field724 = 0;

    @ObfuscatedName("an.ao")
    public static int field736 = 0;

    @ObfuscatedName("an.ac")
    public static int field748 = 0;

    @ObfuscatedName("an.aj")
    public static int field727 = 0;

    @ObfuscatedName("an.an")
    public static int field743 = 0;

    @ObfuscatedName("an.al")
    public static int field729 = 10;

    @ObfuscatedName("an.as")
    public static String field741 = "";

    @ObfuscatedName("an.av")
    public static int field725 = 0;

    @ObfuscatedName("an.am")
    public static String field721 = "";

    @ObfuscatedName("an.az")
    public static String field731 = "";

    @ObfuscatedName("an.ai")
    public static String field734 = "";

    @ObfuscatedName("an.aq")
    public static String field735 = "";

    @ObfuscatedName("an.ah")
    public static String field730 = "";

    @ObfuscatedName("an.ap")
    public static String field737 = "";

    @ObfuscatedName("an.af")
    public static class160 field728 = class160.field2594;

    @ObfuscatedName("an.aw")
    public static boolean field739 = true;

    @ObfuscatedName("an.ak")
    public static int field740 = 0;

    @ObfuscatedName("an.ae")
    public static String field716 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("an.ad")
    public static String field742 = "1234567890";

    @ObfuscatedName("an.ar")
    public static boolean field723 = false;

    @ObfuscatedName("an.bx")
    public static int field744 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.f(Ljava/awt/Component;Lfl;Lfl;ZII)V")
    public static void method859(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field733) {
            field725 = arg4;
            class80.method1726();
            byte[] var5 = arg1.method3077("title.jpg", "");
            Statics.field718 = new class79(var5, arg0);
            Statics.field2739 = Statics.field718.method1625();
            if ((client.field292 & 0x20000000) == 0) {
                Statics.field2606 = class77.method2948(arg2, "logo", "");
            } else {
                Statics.field2606 = class77.method2948(arg2, "logo_deadman_mode", "");
            }
            Statics.field714 = class77.method2948(arg2, "titlebox", "");
            Statics.field717 = class77.method2948(arg2, "titlebutton", "");
            Statics.field685 = class77.method588(arg2, "runes", "");
            Statics.field2907 = class77.method588(arg2, "title_mute", "");
            Statics.field719 = class77.method2948(arg2, "options_radio_buttons,0", "");
            Statics.field720 = class77.method2948(arg2, "options_radio_buttons,2", "");
            Statics.field2254 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2254[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2254[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2254[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2254[var9 + 192] = 16777215;
            }
            Statics.field645 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field645[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field645[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field645[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field645[var13 + 192] = 16777215;
            }
            Statics.field175 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field175[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field175[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field175[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field175[var17 + 192] = 16777215;
            }
            Statics.field1464 = new int[256];
            Statics.field1975 = new int[32768];
            Statics.field2065 = new int[32768];
            method659((class81) null);
            Statics.field271 = new int[32768];
            Statics.field643 = new int[32768];
            if (arg3) {
                field730 = "";
                field737 = "";
            }
            Statics.field1881 = 0;
            Statics.field1798 = "";
            field739 = true;
            field723 = false;
            if (Statics.field581.field142) {
                class184.method7(2);
            } else {
                class169 var18 = Statics.field262;
                int var19 = var18.method3075("scape main");
                int var20 = var18.method3076(var19, "");
                class184.field2954 = 1;
                Statics.field583 = var18;
                Statics.field590 = var19;
                Statics.field3146 = var20;
                Statics.field2957 = 255;
                Statics.field584 = false;
                Statics.field2958 = 2;
            }
            class172.method3025(false);
            Statics.field733 = true;
            field726 = (Statics.field709 - client.field503) / 2;
            field732 = field726 + 202;
            Statics.field718.method1635(field726, 0);
            Statics.field2739.method1635(field726 + 382, 0);
            Statics.field2606.method1790(field726 + 382 - Statics.field2606.field1429 / 2, 18);
        } else if (arg4 == 4) {
            field725 = 4;
        }
    }

    @ObfuscatedName("c.u(I)V")
    public static void method607() {
        if (!Statics.field733) {
            return;
        }
        Statics.field714 = null;
        Statics.field717 = null;
        Statics.field685 = null;
        Statics.field718 = null;
        Statics.field2739 = null;
        Statics.field2606 = null;
        Statics.field2907 = null;
        Statics.field719 = null;
        Statics.field720 = null;
        Statics.field2690 = null;
        Statics.field15 = null;
        Statics.field2285 = null;
        Statics.field667 = null;
        Statics.field1172 = null;
        Statics.field2254 = null;
        Statics.field645 = null;
        Statics.field175 = null;
        Statics.field1464 = null;
        Statics.field1975 = null;
        Statics.field2065 = null;
        Statics.field271 = null;
        Statics.field643 = null;
        class184.method7(2);
        class172.method3025(true);
        Statics.field733 = false;
    }

    @ObfuscatedName("dh.x(Leq;I)V")
    public static void method2186(class145 arg0) {
        if (field723) {
            method20(arg0);
            return;
        }
        if ((class141.field2157 == 1 || !Statics.field2225 && class141.field2157 == 4) && class141.field2162 >= field726 + 765 - 50 && class141.field2159 >= 453) {
            Statics.field581.field142 = !Statics.field581.field142;
            class9.method606();
            if (Statics.field581.field142) {
                class184.method780();
            } else {
                class169 var1 = Statics.field262;
                int var2 = var1.method3075("scape main");
                int var3 = var1.method3076(var2, "");
                class184.method2099(var1, var2, var3, 255, false);
            }
        }
        if (client.field300 == 5) {
            return;
        }
        field727++;
        if (client.field300 != 10 && client.field300 != 11) {
            return;
        }
        if (client.field298 == 0) {
            if (class141.field2157 == 1 || !Statics.field2225 && class141.field2157 == 4) {
                int var4 = field726 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class141.field2162 >= var4 && class141.field2162 <= var4 + var6 && class141.field2159 >= var5 && class141.field2159 <= var5 + var7) {
                    Statics.method691();
                    return;
                }
            }
            if (Statics.field3051 != null) {
                Statics.method691();
            }
        }
        int var8 = class141.field2157;
        int var9 = class141.field2162;
        int var10 = class141.field2159;
        if (!Statics.field2225 && var8 == 4) {
            var8 = 1;
        }
        if (field725 == 0) {
            int var11 = field732 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class139.method692(client.method1822("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = field732 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field292 & 0x2000000) != 0) {
                    field721 = "";
                    field731 = class158.field2396;
                    field734 = class158.field2357;
                    field735 = class158.field2531;
                    field725 = 1;
                    field740 = 0;
                } else if ((client.field292 & 0x4) != 0) {
                    if ((client.field292 & 0x400) == 0) {
                        field731 = class158.field2520;
                        field734 = class158.field2521;
                        field735 = class158.field2399;
                    } else {
                        field731 = class158.field2526;
                        field734 = class158.field2567;
                        field735 = class158.field2367;
                    }
                    field721 = class158.field2533;
                    field725 = 1;
                    field740 = 0;
                } else if ((client.field292 & 0x400) == 0) {
                    field731 = class158.field2348;
                    field734 = class158.field2517;
                    field735 = class158.field2434;
                    field725 = 2;
                    field740 = 0;
                } else {
                    field731 = class158.field2324;
                    field734 = class158.field2524;
                    field735 = class158.field2525;
                    field721 = class158.field2533;
                    field725 = 1;
                    field740 = 0;
                }
            }
        } else if (field725 == 1) {
            while (class138.method1821()) {
                if (Statics.field1757 == 84) {
                    field731 = class158.field2348;
                    field734 = class158.field2517;
                    field735 = class158.field2434;
                    field725 = 2;
                    field740 = 0;
                } else if (Statics.field1757 == 13) {
                    field725 = 0;
                }
            }
            int var14 = field732 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field731 = class158.field2348;
                field734 = class158.field2517;
                field735 = class158.field2434;
                field725 = 2;
                field740 = 0;
            }
            int var16 = field732 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field725 = 0;
            }
        } else if (field725 == 2) {
            short var17 = 231;
            int var39 = var17 + 30;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field740 = 0;
            }
            var39 += 15;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field740 = 1;
            }
            var39 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                Statics.method2311(class158.field2528, class158.field2436, class158.field2449);
                field725 = 5;
                return;
            }
            int var19 = field732 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field730 = field730.trim();
                if (field730.length() == 0) {
                    Statics.method2311(class158.field2422, class158.field2454, class158.field2477);
                    return;
                }
                if (field737.length() == 0) {
                    Statics.method2311(class158.field2425, class158.field2426, class158.field2427);
                    return;
                }
                Statics.method2311(class158.field2534, class158.field2385, class158.field2378);
                field728 = Statics.field581.field147.containsKey(Statics.method2972(field730)) ? class160.field2601 : class160.field2594;
                client.method153(20);
                return;
            }
            int var21 = field732 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field725 = 0;
                field730 = "";
                field737 = "";
                Statics.field1881 = 0;
                Statics.field1798 = "";
                field739 = true;
            }
            while (true) {
                while (class138.method1821()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field716.length(); var23++) {
                        if (Statics.field199 == field716.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field1757 == 13) {
                        field725 = 0;
                        field730 = "";
                        field737 = "";
                        Statics.field1881 = 0;
                        Statics.field1798 = "";
                        field739 = true;
                    } else if (field740 == 0) {
                        if (Statics.field1757 == 85 && field730.length() > 0) {
                            field730 = field730.substring(0, field730.length() - 1);
                        }
                        if (Statics.field1757 == 84 || Statics.field1757 == 80) {
                            field740 = 1;
                        }
                        if (var22 && field730.length() < 320) {
                            field730 = field730 + Statics.field199;
                        }
                    } else if (field740 == 1) {
                        if (Statics.field1757 == 85 && field737.length() > 0) {
                            field737 = field737.substring(0, field737.length() - 1);
                        }
                        if (Statics.field1757 == 84 || Statics.field1757 == 80) {
                            field740 = 0;
                        }
                        if (Statics.field1757 == 84) {
                            field730 = field730.trim();
                            if (field730.length() == 0) {
                                Statics.method2311(class158.field2422, class158.field2454, class158.field2477);
                                return;
                            }
                            if (field737.length() == 0) {
                                Statics.method2311(class158.field2425, class158.field2426, class158.field2427);
                                return;
                            }
                            Statics.method2311(class158.field2534, class158.field2385, class158.field2378);
                            field728 = Statics.field581.field147.containsKey(Statics.method2972(field730)) ? class160.field2601 : class160.field2594;
                            client.method153(20);
                            return;
                        }
                        if (var22 && field737.length() < 20) {
                            field737 = field737 + Statics.field199;
                        }
                    }
                }
                return;
            }
        } else if (field725 == 3) {
            int var24 = field732 + 180;
            short var25 = 276;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field731 = class158.field2348;
                field734 = class158.field2517;
                field735 = class158.field2434;
                field725 = 2;
                field740 = 0;
            }
            int var26 = field732 + 180;
            short var27 = 326;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                Statics.method2311(class158.field2528, class158.field2436, class158.field2449);
                field725 = 5;
                return;
            }
        } else if (field725 == 4) {
            int var28 = field732 + 180 - 80;
            short var29 = 321;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                Statics.field1798.trim();
                if (Statics.field1798.length() != 6) {
                    Statics.method2311(class158.field2341, class158.field2342, class158.field2343);
                    return;
                }
                Statics.field1881 = Integer.parseInt(Statics.field1798);
                Statics.field1798 = "";
                field728 = field739 ? class160.field2604 : class160.field2595;
                Statics.method2311(class158.field2534, class158.field2385, class158.field2378);
                client.method153(20);
                return;
            }
            if (var8 == 1 && var9 >= field732 + 180 - 9 && var9 <= field732 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field739 = !field739;
            }
            if (var8 == 1 && var9 >= field732 + 180 - 34 && var9 <= field732 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class139.method692(client.method1822("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var30 = field732 + 180 + 80;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                field725 = 0;
                field730 = "";
                field737 = "";
                Statics.field1881 = 0;
                Statics.field1798 = "";
            }
            while (class138.method1821()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field742.length(); var32++) {
                    if (Statics.field199 == field742.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field1757 == 13) {
                    field725 = 0;
                    field730 = "";
                    field737 = "";
                    Statics.field1881 = 0;
                    Statics.field1798 = "";
                } else {
                    if (Statics.field1757 == 85 && Statics.field1798.length() > 0) {
                        Statics.field1798 = Statics.field1798.substring(0, Statics.field1798.length() - 1);
                    }
                    if (Statics.field1757 == 84) {
                        Statics.field1798.trim();
                        if (Statics.field1798.length() != 6) {
                            Statics.method2311(class158.field2341, class158.field2342, class158.field2343);
                            return;
                        }
                        Statics.field1881 = Integer.parseInt(Statics.field1798);
                        Statics.field1798 = "";
                        field728 = field739 ? class160.field2604 : class160.field2595;
                        Statics.method2311(class158.field2534, class158.field2385, class158.field2378);
                        client.method153(20);
                        return;
                    }
                    if (var31 && Statics.field1798.length() < 6) {
                        Statics.field1798 = Statics.field1798 + Statics.field199;
                    }
                }
            }
        } else if (field725 == 5) {
            int var33 = field732 + 180 - 80;
            short var34 = 321;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                method2666();
                return;
            }
            int var35 = field732 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                field731 = class158.field2348;
                field734 = class158.field2517;
                field735 = class158.field2434;
                field725 = 2;
                field740 = 0;
                field737 = "";
            }
            while (class138.method1821()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field716.length(); var37++) {
                    if (Statics.field199 == field716.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field1757 == 13) {
                    field731 = class158.field2348;
                    field734 = class158.field2517;
                    field735 = class158.field2434;
                    field725 = 2;
                    field740 = 0;
                    field737 = "";
                } else {
                    if (Statics.field1757 == 85 && field730.length() > 0) {
                        field730 = field730.substring(0, field730.length() - 1);
                    }
                    if (Statics.field1757 == 84) {
                        method2666();
                        return;
                    }
                    if (var36 && field730.length() < 320) {
                        field730 = field730 + Statics.field199;
                    }
                }
            }
        } else if (field725 == 6) {
            while (true) {
                do {
                    if (!class138.method1821()) {
                        short var38 = 321;
                        if (var8 == 1 && var10 >= var38 - 20 && var10 <= var38 + 20) {
                            field731 = class158.field2348;
                            field734 = class158.field2517;
                            field735 = class158.field2434;
                            field725 = 2;
                            field740 = 0;
                            field737 = "";
                        }
                        return;
                    }
                } while (Statics.field1757 != 84 && Statics.field1757 != 13);
                field731 = class158.field2348;
                field734 = class158.field2517;
                field735 = class158.field2434;
                field725 = 2;
                field740 = 0;
                field737 = "";
            }
        }
    }

    @ObfuscatedName("dc.b(I)V")
    public static void method2666() {
        field730 = field730.trim();
        if (field730.length() == 0) {
            Statics.method2311(class158.field2528, class158.field2436, class158.field2449);
            return;
        }
        long var0 = class10.method3513();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field730;
            Random var4 = new Random();
            class120 var5 = new class120(128);
            class120 var6 = new class120(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2485(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2370(var4.nextInt());
            }
            var5.method2370(var7[0]);
            var5.method2370(var7[1]);
            var5.method2457(var0);
            var5.method2457(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2370(var4.nextInt());
            }
            var5.method2405(class10.field156, class10.field161);
            var6.method2485(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2370(var4.nextInt());
            }
            var6.method2457(var4.nextLong());
            var6.method2395(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class150.field2242.method3892(0L);
                class150.field2242.method3894(var11);
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
            var6.method2422(var11, 0, 24);
            var6.method2457(var4.nextLong());
            var6.method2405(class10.field156, class10.field161);
            int var15 = class120.method622(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class120 var16 = new class120(var15);
            var16.method2376(var3);
            var16.field1999 = var15;
            var16.method2401(var7);
            class120 var17 = new class120(var16.field1999 + var6.field1999 + var5.field1999 + 5);
            var17.method2485(2);
            var17.method2485(var5.field1999);
            var17.method2422(var5.field2001, 0, var5.field1999);
            var17.method2485(var6.field1999);
            var17.method2422(var6.field2001, 0, var6.field1999);
            var17.method2371(var16.field1999);
            var17.method2422(var16.field2001, 0, var16.field1999);
            String var18 = class162.method1807(var17.field2001);
            byte var25;
            try {
                URL var19 = new URL(client.method1822("services", false) + "m=accountappeal/login.ws");
                URLConnection var20 = var19.openConnection();
                var20.setDoInput(true);
                var20.setDoOutput(true);
                var20.setConnectTimeout(5000);
                OutputStreamWriter var21 = new OutputStreamWriter(var20.getOutputStream());
                var21.write("data2=" + class227.method2665(var18) + "&dest=" + class227.method2665("passwordchoice.ws"));
                var21.flush();
                InputStream var22 = var20.getInputStream();
                class120 var23 = new class120(new byte[1000]);
                while (true) {
                    int var24 = var22.read(var23.field2001, var23.field1999, 1000 - var23.field1999);
                    if (var24 == -1) {
                        var21.close();
                        var22.close();
                        String var26 = new String(var23.field2001);
                        if (var26.startsWith("OFFLINE")) {
                            var25 = 4;
                        } else if (var26.startsWith("WRONG")) {
                            var25 = 7;
                        } else if (var26.startsWith("RELOAD")) {
                            var25 = 3;
                        } else if (var26.startsWith("Not permitted for social network accounts.")) {
                            var25 = 6;
                        } else {
                            var23.method2432(var7);
                            while (var23.field1999 > 0 && var23.field2001[var23.field1999 - 1] == 0) {
                                var23.field1999--;
                            }
                            String var27 = new String(var23.field2001, 0, var23.field1999);
                            if (class10.method666(var27)) {
                                class139.method692(var27, true, false);
                                var25 = 2;
                            } else {
                                var25 = 5;
                            }
                        }
                        break;
                    }
                    var23.field1999 += var24;
                    if (var23.field1999 >= 1000) {
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
                Statics.method2311(class158.field2558, class158.field2559, class158.field2404);
                field725 = 6;
                break;
            case 3:
                Statics.method2311(class158.field2561, class158.field2562, class158.field2563);
                break;
            case 4:
                Statics.method2311(class158.field2564, class158.field2565, class158.field2389);
                break;
            case 5:
                Statics.method2311(class158.field2529, class158.field2568, class158.field2569);
                break;
            case 6:
                Statics.method2311(class158.field2570, class158.field2577, class158.field2572);
                break;
            case 7:
                Statics.method2311(class158.field2566, class158.field2574, class158.field2487);
        }
    }

    @ObfuscatedName("fe.l(Lhv;Lhv;Lhv;ZI)V")
    public static void method2965(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field726 = (Statics.field709 - client.field503) / 2;
            field732 = field726 + 202;
        }
        if (field723) {
            method2955(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field718.method1635(field726, 0);
            Statics.field2739.method1635(field726 + 382, 0);
            Statics.field2606.method1790(field726 + 382 - Statics.field2606.field1429 / 2, 18);
        }
        if (client.field300 == 0 || client.field300 == 5) {
            byte var4 = 20;
            arg0.method3806(class158.field2478, field732 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1734(field732 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1734(field732 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1728(field732 + 180 - 150, var5 + 2, field729 * 3, 30, 9179409);
            class80.method1728(field729 * 3 + (field732 + 180 - 150), var5 + 2, 300 - field729 * 3, 30, 0);
            arg0.method3806(field741, field732 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field300 == 20) {
            Statics.field714.method1790(field732 + 180 - Statics.field714.field1429 / 2, 271 - Statics.field714.field1430 / 2);
            short var6 = 211;
            arg0.method3806(field731, field732 + 180, var6, 16776960, 0);
            int var87 = var6 + 15;
            arg0.method3806(field734, field732 + 180, var87, 16776960, 0);
            int var88 = var87 + 15;
            arg0.method3806(field735, field732 + 180, var88, 16776960, 0);
            int var89 = var88 + 15;
            int var90 = var89 + 10;
            if (field725 != 4) {
                arg0.method3799(class158.field2506, field732 + 180 - 110, var90, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field730; arg0.method3776(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3799(class224.method3802(var8), field732 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                String var10 = class158.field2340;
                String var11 = field737;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3799(var10 + var15, field732 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
            }
        }
        if (client.field300 == 10 || client.field300 == 11) {
            Statics.field714.method1790(field732, 171);
            if (field725 == 0) {
                short var17 = 251;
                arg0.method3806(class158.field2540, field732 + 180, var17, 16776960, 0);
                int var91 = var17 + 30;
                int var18 = field732 + 180 - 80;
                short var19 = 291;
                Statics.field717.method1790(var18 - 73, var19 - 20);
                arg0.method3784(class158.field2541, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field732 + 180 + 80;
                Statics.field717.method1790(var20 - 73, var19 - 20);
                arg0.method3784(class158.field2542, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field725 == 1) {
                arg0.method3806(field721, field732 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3806(field731, field732 + 180, var21, 16777215, 0);
                int var92 = var21 + 15;
                arg0.method3806(field734, field732 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method3806(field735, field732 + 180, var93, 16777215, 0);
                int var94 = var93 + 15;
                int var22 = field732 + 180 - 80;
                short var23 = 321;
                Statics.field717.method1790(var22 - 73, var23 - 20);
                arg0.method3806(class158.field2313, var22, var23 + 5, 16777215, 0);
                int var24 = field732 + 180 + 80;
                Statics.field717.method1790(var24 - 73, var23 - 20);
                arg0.method3806(class158.field2544, var24, var23 + 5, 16777215, 0);
            } else if (field725 == 2) {
                short var25 = 211;
                arg0.method3806(field731, field732 + 180, var25, 16776960, 0);
                int var95 = var25 + 15;
                arg0.method3806(field734, field732 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method3806(field735, field732 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                int var98 = var97 + 10;
                arg0.method3799(class158.field2506, field732 + 180 - 110, var98, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field730; arg0.method3776(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3799(class224.method3802(var27) + (field740 == 0 & client.field302 % 40 < 20 ? class2.method3026(16776960) + class2.field21 : ""), field732 + 180 - 70, var98, 16777215, 0);
                var95 = var98 + 15;
                arg0.method3799(class158.field2340 + class164.method2638(field737) + (field740 == 1 & client.field302 % 40 < 20 ? class2.method3026(16776960) + class2.field21 : ""), field732 + 180 - 108, var95, 16777215, 0);
                var95 += 15;
                int var28 = field732 + 180 - 80;
                short var29 = 321;
                Statics.field717.method1790(var28 - 73, var29 - 20);
                arg0.method3806(class158.field2543, var28, var29 + 5, 16777215, 0);
                int var30 = field732 + 180 + 80;
                Statics.field717.method1790(var30 - 73, var29 - 20);
                arg0.method3806(class158.field2544, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3806(class158.field2550, field732 + 180, var31, 16776960, 0);
            } else if (field725 == 3) {
                short var32 = 201;
                arg0.method3806(class158.field2545, field732 + 180, var32, 16776960, 0);
                int var99 = var32 + 20;
                arg1.method3806(class158.field2546, field732 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg1.method3806(class158.field2547, field732 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var33 = field732 + 180;
                short var34 = 276;
                Statics.field717.method1790(var33 - 73, var34 - 20);
                arg2.method3806(class158.field2548, var33, var34 + 5, 16777215, 0);
                int var35 = field732 + 180;
                short var36 = 326;
                Statics.field717.method1790(var35 - 73, var36 - 20);
                arg2.method3806(class158.field2372, var35, var36 + 5, 16777215, 0);
            } else if (field725 == 4) {
                arg0.method3806(class158.field2532, field732 + 180, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3806(field731, field732 + 180, var37, 16777215, 0);
                int var102 = var37 + 15;
                arg0.method3806(field734, field732 + 180, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method3806(field735, field732 + 180, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3799(class158.field2539 + class164.method2638(Statics.field1798) + (client.field302 % 40 < 20 ? class2.method3026(16776960) + class2.field21 : ""), field732 + 180 - 108, var104, 16777215, 0);
                int var105 = var104 - 8;
                arg0.method3799(class158.field2315, field732 + 180 - 9, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method3799(class158.field2316, field732 + 180 - 9, var106, 16776960, 0);
                int var38 = field732 + 180 - 9 + arg0.method3776(class158.field2316) + 15;
                int var39 = var106 - arg0.field3189;
                class81 var40;
                if (field739) {
                    var40 = Statics.field720;
                } else {
                    var40 = Statics.field719;
                }
                var40.method1790(var38, var39);
                var102 = var106 + 15;
                int var41 = field732 + 180 - 80;
                short var42 = 321;
                Statics.field717.method1790(var41 - 73, var42 - 20);
                arg0.method3806(class158.field2313, var41, var42 + 5, 16777215, 0);
                int var43 = field732 + 180 + 80;
                Statics.field717.method1790(var43 - 73, var42 - 20);
                arg0.method3806(class158.field2544, var43, var42 + 5, 16777215, 0);
                arg1.method3806(class158.field2511, field732 + 180, var42 + 36, 255, 0);
            } else if (field725 == 5) {
                arg0.method3806(class158.field2551, field732 + 180, 201, 16776960, 0);
                short var44 = 221;
                arg2.method3806(field731, field732 + 180, var44, 16776960, 0);
                int var107 = var44 + 15;
                arg2.method3806(field734, field732 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg2.method3806(field735, field732 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var110 = var109 + 14;
                arg0.method3799(class158.field2552, field732 + 180 - 145, var110, 16777215, 0);
                short var45 = 174;
                String var46;
                for (var46 = field730; arg0.method3776(var46) > var45; var46 = var46.substring(1)) {
                }
                arg0.method3799(class224.method3802(var46) + (client.field302 % 40 < 20 ? class2.method3026(16776960) + class2.field21 : ""), field732 + 180 - 34, var110, 16777215, 0);
                var107 = var110 + 15;
                int var47 = field732 + 180 - 80;
                short var48 = 321;
                Statics.field717.method1790(var47 - 73, var48 - 20);
                arg0.method3806(class158.field2553, var47, var48 + 5, 16777215, 0);
                int var49 = field732 + 180 + 80;
                Statics.field717.method1790(var49 - 73, var48 - 20);
                arg0.method3806(class158.field2554, var49, var48 + 5, 16777215, 0);
            } else if (field725 == 6) {
                short var50 = 211;
                arg0.method3806(field731, field732 + 180, var50, 16776960, 0);
                int var111 = var50 + 15;
                arg0.method3806(field734, field732 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method3806(field735, field732 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var51 = field732 + 180;
                short var52 = 321;
                Statics.field717.method1790(var51 - 73, var52 - 20);
                arg0.method3806(class158.field2554, var51, var52 + 5, 16777215, 0);
            }
        }
        if (field727 > 0) {
            int var53 = field727;
            short var54 = 256;
            field736 += var53 * 128;
            if (field736 > Statics.field1975.length) {
                field736 -= Statics.field1975.length;
                int var55 = (int) (Math.random() * 12.0D);
                method659(Statics.field685[var55]);
            }
            int var56 = 0;
            int var57 = var53 * 128;
            int var58 = (var54 - var53) * 128;
            for (int var59 = 0; var59 < var58; var59++) {
                int var60 = Statics.field271[var56 + var57] - Statics.field1975[field736 + var56 & Statics.field1975.length - 1] * var53 / 6;
                if (var60 < 0) {
                    var60 = 0;
                }
                Statics.field271[var56++] = var60;
            }
            for (int var61 = var54 - var53; var61 < var54; var61++) {
                int var62 = var61 * 128;
                for (int var63 = 0; var63 < 128; var63++) {
                    int var64 = (int) (Math.random() * 100.0D);
                    if (var64 < 50 && var63 > 10 && var63 < 118) {
                        Statics.field271[var62 + var63] = 255;
                    } else {
                        Statics.field271[var62 + var63] = 0;
                    }
                }
            }
            if (field715 > 0) {
                field715 -= var53 * 4;
            }
            if (field724 > 0) {
                field724 -= var53 * 4;
            }
            if (field715 == 0 && field724 == 0) {
                int var65 = (int) (Math.random() * (double) (2000 / var53));
                if (var65 == 0) {
                    field715 = 1024;
                }
                if (var65 == 1) {
                    field724 = 1024;
                }
            }
            for (int var66 = 0; var66 < var54 - var53; var66++) {
                field722[var66] = field722[var53 + var66];
            }
            for (int var67 = var54 - var53; var67 < var54; var67++) {
                field722[var67] = (int) (Math.sin((double) field743 / 14.0D) * 16.0D + Math.sin((double) field743 / 15.0D) * 14.0D + Math.sin((double) field743 / 16.0D) * 12.0D);
                field743++;
            }
            field748 += var53 * -1067948207;
            int var68 = ((client.field302 & 0x1) + var53) / 2;
            if (var68 > 0) {
                for (int var69 = 0; var69 < field748 * 1145940260; var69++) {
                    int var70 = (int) (Math.random() * 124.0D) + 2;
                    int var71 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field271[(var71 << 7) + var70] = 192;
                }
                field748 = 0;
                int var72 = 0;
                label229: while (true) {
                    if (var72 >= var54) {
                        int var76 = 0;
                        while (true) {
                            if (var76 >= 128) {
                                break label229;
                            }
                            int var77 = 0;
                            for (int var78 = -var68; var78 < var54; var78++) {
                                int var79 = var78 * 128;
                                if (var68 + var78 < var54) {
                                    var77 += Statics.field643[var68 * 128 + var76 + var79];
                                }
                                if (var78 - (var68 + 1) >= 0) {
                                    var77 -= Statics.field643[var76 + var79 - (var68 + 1) * 128];
                                }
                                if (var78 >= 0) {
                                    Statics.field271[var76 + var79] = var77 / (var68 * 2 + 1);
                                }
                            }
                            var76++;
                        }
                    }
                    int var73 = 0;
                    int var74 = var72 * 128;
                    for (int var75 = -var68; var75 < 128; var75++) {
                        if (var68 + var75 < 128) {
                            var73 += Statics.field271[var74 + var75 + var68];
                        }
                        if (var75 - (var68 + 1) >= 0) {
                            var73 -= Statics.field271[var74 + var75 - (var68 + 1)];
                        }
                        if (var75 >= 0) {
                            Statics.field643[var74 + var75] = var73 / (var68 * 2 + 1);
                        }
                    }
                    var72++;
                }
            }
            field727 = 0;
        }
        method2600();
        Statics.field2907[Statics.field581.field142 ? 1 : 0].method1790(field726 + 765 - 40, 463);
        if (client.field300 > 5 && client.field298 == 0) {
            if (Statics.field1172 == null) {
                Statics.field1172 = class77.method2948(Statics.field1910, "sl_button", "");
            } else {
                int var80 = field726 + 5;
                short var81 = 463;
                byte var82 = 100;
                byte var83 = 35;
                Statics.field1172.method1790(var80, var81);
                arg0.method3806(class158.field2470 + " " + client.field387, var82 / 2 + var80, var83 / 2 + var81 - 2, 16777215, 0);
                if (Statics.field3051 == null) {
                    arg1.method3806(class158.field2309, var82 / 2 + var80, var83 / 2 + var81 + 12, 16777215, 0);
                } else {
                    arg1.method3806(class158.field2388, var82 / 2 + var80, var83 / 2 + var81 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var84 = Statics.field1568.getGraphics();
            Statics.field197.method1548(var84, 0, 0);
        } catch (Exception var86) {
            Statics.field1568.repaint();
        }
    }

    @ObfuscatedName("j.n(Lci;I)V")
    public static final void method659(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1975.length; var2++) {
            Statics.field1975[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1975[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2065[var8] = (Statics.field1975[var8 - 1] + Statics.field1975[var8 + 1] + Statics.field1975[var8 - 128] + Statics.field1975[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1975;
            Statics.field1975 = Statics.field2065;
            Statics.field2065 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1430; var11++) {
            for (int var12 = 0; var12 < arg0.field1429; var12++) {
                if (arg0.field1431[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1434;
                    int var14 = var11 + 16 + arg0.field1432;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1975[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("h.m(IIII)I")
    public static final int method172(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dm.g(B)V")
    public static final void method2600() {
        short var0 = 256;
        if (field715 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field715 > 768) {
                    Statics.field1464[var1] = method172(Statics.field2254[var1], Statics.field645[var1], 1024 - field715);
                } else if (field715 > 256) {
                    Statics.field1464[var1] = Statics.field645[var1];
                } else {
                    Statics.field1464[var1] = method172(Statics.field645[var1], Statics.field2254[var1], 256 - field715);
                }
            }
        } else if (field724 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field724 > 768) {
                    Statics.field1464[var2] = method172(Statics.field2254[var2], Statics.field175[var2], 1024 - field724);
                } else if (field724 > 256) {
                    Statics.field1464[var2] = Statics.field175[var2];
                } else {
                    Statics.field1464[var2] = method172(Statics.field175[var2], Statics.field2254[var2], 256 - field724);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1464[var3] = Statics.field2254[var3];
            }
        }
        class80.method1722(field726, 9, field726 + 128, var0 + 7);
        Statics.field718.method1635(field726, 0);
        class80.method1721();
        int var4 = 0;
        int var5 = field726 + Statics.field197.field1403 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field722[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field271[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1464[var10];
                    int var14 = Statics.field197.field1407[var5];
                    Statics.field197.field1407[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field197.field1403 + var8 - 128;
        }
        class80.method1722(field726 + 765 - 128, 9, field726 + 765, var0 + 7);
        Statics.field2739.method1635(field726 + 382, 0);
        class80.method1721();
        int var15 = 0;
        int var16 = field726 + Statics.field197.field1403 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field722[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field271[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1464[var22];
                    int var26 = Statics.field197.field1407[var20];
                    Statics.field197.field1407[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field197.field1403 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ep.s(Lhv;Lhv;I)V")
    public static void method2955(class225 arg0, class225 arg1) {
        if (Statics.field2690 == null) {
            Statics.field2690 = Statics.method125(Statics.field1910, "sl_back", "");
        }
        if (Statics.field15 == null) {
            Statics.field15 = class77.method588(Statics.field1910, "sl_flags", "");
        }
        if (Statics.field2285 == null) {
            Statics.field2285 = class77.method588(Statics.field1910, "sl_arrows", "");
        }
        if (Statics.field667 == null) {
            Statics.field667 = class77.method588(Statics.field1910, "sl_stars", "");
        }
        class80.method1728(field726, 23, 765, 480, 0);
        class80.method1733(field726, 0, 125, 23, 12425273, 9135624);
        class80.method1733(field726 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3806(class158.field2515, field726 + 62, 15, 0, -1);
        if (Statics.field667 != null) {
            Statics.field667[1].method1790(field726 + 140, 1);
            arg1.method3799(class158.field2585, field726 + 152, 10, 16777215, -1);
            Statics.field667[0].method1790(field726 + 140, 12);
            arg1.method3799(class158.field2578, field726 + 152, 21, 16777215, -1);
        }
        if (Statics.field2285 != null) {
            int var2 = field726 + 280;
            if (class26.field640[0] == 0 && class26.field650[0] == 0) {
                Statics.field2285[2].method1790(var2, 4);
            } else {
                Statics.field2285[0].method1790(var2, 4);
            }
            if (class26.field640[0] == 0 && class26.field650[0] == 1) {
                Statics.field2285[3].method1790(var2 + 15, 4);
            } else {
                Statics.field2285[1].method1790(var2 + 15, 4);
            }
            arg0.method3799(class158.field2579, var2 + 32, 17, 16777215, -1);
            int var3 = field726 + 390;
            if (class26.field640[0] == 1 && class26.field650[0] == 0) {
                Statics.field2285[2].method1790(var3, 4);
            } else {
                Statics.field2285[0].method1790(var3, 4);
            }
            if (class26.field640[0] == 1 && class26.field650[0] == 1) {
                Statics.field2285[3].method1790(var3 + 15, 4);
            } else {
                Statics.field2285[1].method1790(var3 + 15, 4);
            }
            arg0.method3799(class158.field2580, var3 + 32, 17, 16777215, -1);
            int var4 = field726 + 500;
            if (class26.field640[0] == 2 && class26.field650[0] == 0) {
                Statics.field2285[2].method1790(var4, 4);
            } else {
                Statics.field2285[0].method1790(var4, 4);
            }
            if (class26.field640[0] == 2 && class26.field650[0] == 1) {
                Statics.field2285[3].method1790(var4 + 15, 4);
            } else {
                Statics.field2285[1].method1790(var4 + 15, 4);
            }
            arg0.method3799(class158.field2401, var4 + 32, 17, 16777215, -1);
            int var5 = field726 + 610;
            if (class26.field640[0] == 3 && class26.field650[0] == 0) {
                Statics.field2285[2].method1790(var5, 4);
            } else {
                Statics.field2285[0].method1790(var5, 4);
            }
            if (class26.field640[0] == 3 && class26.field650[0] == 1) {
                Statics.field2285[3].method1790(var5 + 15, 4);
            } else {
                Statics.field2285[1].method1790(var5 + 15, 4);
            }
            arg0.method3799(class158.field2582, var5 + 32, 17, 16777215, -1);
        }
        class80.method1728(field726 + 708, 4, 50, 16, 0);
        arg1.method3806(class158.field2544, field726 + 708 + 25, 16, 16777215, -1);
        field744 = -1;
        if (Statics.field2690 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field637) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field637) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field637) {
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
            int var17 = field726 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field637; var20++) {
                class26 var21 = Statics.field636[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field639);
                if (var21.field639 == -1) {
                    var23 = class158.field2583;
                    var22 = false;
                } else if (var21.field639 > 1980) {
                    var23 = class158.field2584;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method663()) {
                    if (var21.method639()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method636()) {
                    var24 = 16711680;
                    if (var21.method639()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method628()) {
                    if (var21.method639()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method639()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class141.field2147 >= var17 && class141.field2152 >= var16 && class141.field2147 < var6 + var17 && class141.field2152 < var7 + var16 && var22) {
                    field744 = var20;
                    Statics.field2690[var25].method1714(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2690[var25].method1635(var17, var16);
                }
                if (Statics.field15 != null) {
                    Statics.field15[(var21.method639() ? 8 : 0) + var21.field651].method1790(var17 + 29, var16);
                }
                arg0.method3806(Integer.toString(var21.field641), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3806(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3776(Statics.field636[field744].field632) + 6;
                int var27 = arg1.field3189 + 8;
                class80.method1728(class141.field2147 - var26 / 2, class141.field2152 + 20 + 5, var26, var27, 16777120);
                class80.method1734(class141.field2147 - var26 / 2, class141.field2152 + 20 + 5, var26, var27, 0);
                arg1.method3806(Statics.field636[field744].field632, class141.field2147, class141.field2152 + 20 + 5 + arg1.field3189 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1568.getGraphics();
            Statics.field197.method1548(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1568.repaint();
        }
    }

    @ObfuscatedName("x.r(Leq;B)V")
    public static void method20(class145 arg0) {
        if (class141.field2157 != 1 && Statics.field2225 || class141.field2157 != 4) {
            return;
        }
        int var1 = field726 + 280;
        if (class141.field2162 >= var1 && class141.field2162 <= var1 + 14 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(0, 0);
            return;
        }
        if (class141.field2162 >= var1 + 15 && class141.field2162 <= var1 + 80 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(0, 1);
            return;
        }
        int var2 = field726 + 390;
        if (class141.field2162 >= var2 && class141.field2162 <= var2 + 14 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(1, 0);
            return;
        }
        if (class141.field2162 >= var2 + 15 && class141.field2162 <= var2 + 80 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(1, 1);
            return;
        }
        int var3 = field726 + 500;
        if (class141.field2162 >= var3 && class141.field2162 <= var3 + 14 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(2, 0);
            return;
        }
        if (class141.field2162 >= var3 + 15 && class141.field2162 <= var3 + 80 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(2, 1);
            return;
        }
        int var4 = field726 + 610;
        if (class141.field2162 >= var4 && class141.field2162 <= var4 + 14 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(3, 0);
            return;
        }
        if (class141.field2162 >= var4 + 15 && class141.field2162 <= var4 + 80 && class141.field2159 >= 4 && class141.field2159 <= 18) {
            class26.method2188(3, 1);
            return;
        }
        if (class141.field2162 >= field726 + 708 && class141.field2159 >= 4 && class141.field2162 <= field726 + 708 + 50 && class141.field2159 <= 20) {
            field723 = false;
            Statics.field718.method1635(field726, 0);
            Statics.field2739.method1635(field726 + 382, 0);
            Statics.field2606.method1790(field726 + 382 - Statics.field2606.field1429 / 2, 18);
            return;
        }
        if (field744 == -1) {
            return;
        }
        class26 var5 = Statics.field636[field744];
        method2265(var5);
        field723 = false;
        Statics.field718.method1635(field726, 0);
        Statics.field2739.method1635(field726 + 382, 0);
        Statics.field2606.method1790(field726 + 382 - Statics.field2606.field1429 / 2, 18);
        return;
    }

    @ObfuscatedName("dq.k(Lj;I)V")
    public static void method2265(class26 arg0) {
        if (arg0.method639() != client.field411) {
            client.field411 = arg0.method639();
            boolean var1 = arg0.method639();
            if (Statics.field2067 != var1) {
                class52.method910();
                Statics.field2067 = var1;
            }
        }
        Statics.field67 = arg0.field644;
        client.field387 = arg0.field641;
        client.field292 = arg0.field642;
        Statics.field3231 = client.field294 == 0 ? 43594 : arg0.field641 + 40000;
        Statics.field263 = client.field294 == 0 ? 443 : arg0.field641 + 50000;
        Statics.field225 = Statics.field3231;
    }
}
