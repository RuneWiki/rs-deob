package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@ObfuscatedName("bq")
public class class69 {

    @ObfuscatedName("bq.s")
    public static int field892 = 0;

    @ObfuscatedName("bq.g")
    public static int field897 = field892 + 202;

    @ObfuscatedName("bq.k")
    public static int field900 = 10;

    @ObfuscatedName("bq.b")
    public static String field899 = "";

    @ObfuscatedName("bq.au")
    public static int field915 = -1;

    @ObfuscatedName("bq.an")
    public static int field919 = 1;

    @ObfuscatedName("bq.ah")
    public static int field904 = 0;

    @ObfuscatedName("bq.ai")
    public static String field905 = "";

    @ObfuscatedName("bq.am")
    public static String field906 = "";

    @ObfuscatedName("bq.be")
    public static String field893 = "";

    @ObfuscatedName("bq.bt")
    public static String field908 = "";

    @ObfuscatedName("bq.bn")
    public static String field902 = "";

    @ObfuscatedName("bq.bz")
    public static String field910 = "";

    @ObfuscatedName("bq.bd")
    public static int field911 = 0;

    @ObfuscatedName("bq.bg")
    public static String[] field912 = new String[8];

    @ObfuscatedName("bq.ba")
    public static boolean field913 = false;

    @ObfuscatedName("bq.bv")
    public static boolean field914 = false;

    @ObfuscatedName("bq.bj")
    public static boolean field894 = true;

    @ObfuscatedName("bq.bo")
    public static int field916 = 0;

    @ObfuscatedName("bq.by")
    public static String field917 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bq.bk")
    public static String field901 = "1234567890";

    @ObfuscatedName("bq.ch")
    public static boolean field927 = false;

    @ObfuscatedName("bq.cc")
    public static int field903 = -1;

    @ObfuscatedName("bq.cs")
    public static int field921 = 0;

    @ObfuscatedName("bq.cl")
    public static int field922 = 0;

    @ObfuscatedName("bq.cy")
    public static long field923;

    @ObfuscatedName("bq.cn")
    public static long field924;

    @ObfuscatedName("bq.cr")
    public static String[] field925;

    @ObfuscatedName("bq.co")
    public static String[] field926;

    static {
        new DecimalFormat("##0.00");
        new class119();
        field923 = -1L;
        field924 = -1L;
        field925 = new String[] { "title.jpg" };
        field926 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fg.c(Lkq;Lkq;B)I")
    public static int method3182(class307 arg0, class307 arg1) {
        int var2 = 0;
        String[] var3 = field925;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5050(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field926;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5050(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("cd.l(Lkq;Lkq;ZIB)V")
    public static void method2073(class307 arg0, class307 arg1, boolean arg2, int arg3) {
        if (!Statics.field918) {
            if (arg3 == 0) {
                method1926(arg2);
            } else {
                method2054(arg3);
            }
            class430.method6988();
            byte[] var4 = arg0.method5049("title.jpg", "");
            Statics.field3080 = class29.method2590(var4);
            Statics.field810 = Statics.field3080.method7126();
            method2612(arg1, client.field770);
            Statics.field891 = class435.method2155(arg1, "titlebox", "");
            Statics.field3076 = class435.method2155(arg1, "titlebutton", "");
            Statics.field895 = class435.method2155(arg1, "titlebutton_large", "");
            Statics.field1614 = class435.method2155(arg1, "play_now_text", "");
            class435.method2155(arg1, "titlebutton_wide42,1", "");
            Statics.field907 = class435.method4753(arg1, "runes", "");
            Statics.field4245 = class435.method4753(arg1, "title_mute", "");
            Statics.field976 = class435.method2155(arg1, "options_radio_buttons,0", "");
            Statics.field1639 = class435.method2155(arg1, "options_radio_buttons,4", "");
            Statics.field2 = class435.method2155(arg1, "options_radio_buttons,2", "");
            Statics.field4221 = class435.method2155(arg1, "options_radio_buttons,6", "");
            Statics.field813 = Statics.field976.field4595;
            Statics.field1561 = Statics.field976.field4600;
            Statics.field896 = new class87(Statics.field907);
            if (arg2) {
                field902 = "";
                field910 = "";
            }
            Statics.field2589 = 0;
            Statics.field1653 = "";
            field894 = true;
            field927 = false;
            if (Statics.field4567.field1222) {
                class266.method4511(2);
            } else {
                class305 var5 = Statics.field2607;
                int var6 = var5.method5046("scape main");
                int var7 = var5.method5047(var6, "");
                class266.method4510(2, var5, var6, var7, 255, false);
            }
            class308.method2310(false);
            Statics.field918 = true;
            field892 = (Statics.field3209 - 765) / 2;
            field897 = field892 + 202;
            Statics.field17 = field897 + 180;
            Statics.field3080.method7064(field892, 0);
            Statics.field810.method7064(field892 + 382, 0);
            Statics.field171.method7034(field892 + 382 - Statics.field171.field4595 / 2, 18);
        } else if (arg3 == 4) {
            method2054(4);
        }
    }

    @ObfuscatedName("nt.s(ZZI)Lpg;")
    public static class433 method6132(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field4221 : Statics.field2) : (arg1 ? Statics.field1639 : Statics.field976);
    }

    @ObfuscatedName("fm.e(I)Ljava/lang/String;")
    public static String method3257() {
        String var6;
        if (Statics.field4567.field1227) {
            String var0 = field902;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field902;
        }
        return var6;
    }

    @ObfuscatedName("bc.r(I)V")
    public static void method1899() {
        if (field902 != null && field902.length() > 0) {
            return;
        }
        if (Statics.field4567.field1226 == null) {
            client.field720 = false;
        } else {
            field902 = Statics.field4567.field1226;
            client.field720 = true;
        }
    }

    @ObfuscatedName("ll.o(S)V")
    public static void method5252() {
        if (!Statics.field918) {
            return;
        }
        Statics.field891 = null;
        Statics.field3076 = null;
        Statics.field907 = null;
        Statics.field3080 = null;
        Statics.field810 = null;
        Statics.field171 = null;
        Statics.field4245 = null;
        Statics.field976 = null;
        Statics.field2 = null;
        Statics.field2748 = null;
        Statics.field2385 = null;
        Statics.field2536 = null;
        Statics.field3886 = null;
        Statics.field3231 = null;
        Statics.field896.method2099();
        class266.method4511(2);
        class308.method2310(true);
        Statics.field918 = false;
    }

    @ObfuscatedName("ep.i(Lkq;IB)V")
    public static void method2612(class307 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field171 = class435.method2155(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) == 0) {
            Statics.field171 = class435.method2155(arg0, "logo", "");
        } else {
            Statics.field171 = class435.method2155(arg0, "logo_seasonal_mode", "");
        }
    }

    @ObfuscatedName("hh.w(I)V")
    public static void method3969() {
        if (client.field720 && field902 != null && field902.length() > 0) {
            field916 = 1;
        } else {
            field916 = 0;
        }
    }

    @ObfuscatedName("cv.v(Lal;Llv;B)V")
    public static void method2341(class32 arg0, class332 arg1) {
        if (field927) {
            while (true) {
                if (!class24.method6010()) {
                    if (class33.field235 != 1 && (Statics.field4238 || class33.field235 != 4)) {
                        break;
                    }
                    int var2 = field892 + 280;
                    if (class33.field236 >= var2 && class33.field236 <= var2 + 14 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(0, 0);
                        break;
                    }
                    if (class33.field236 >= var2 + 15 && class33.field236 <= var2 + 80 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(0, 1);
                        break;
                    }
                    int var3 = field892 + 390;
                    if (class33.field236 >= var3 && class33.field236 <= var3 + 14 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(1, 0);
                        break;
                    }
                    if (class33.field236 >= var3 + 15 && class33.field236 <= var3 + 80 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(1, 1);
                        break;
                    }
                    int var4 = field892 + 500;
                    if (class33.field236 >= var4 && class33.field236 <= var4 + 14 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(2, 0);
                        break;
                    }
                    if (class33.field236 >= var4 + 15 && class33.field236 <= var4 + 80 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(2, 1);
                        break;
                    }
                    int var5 = field892 + 610;
                    if (class33.field236 >= var5 && class33.field236 <= var5 + 14 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(3, 0);
                        break;
                    }
                    if (class33.field236 >= var5 + 15 && class33.field236 <= var5 + 80 && class33.field237 >= 4 && class33.field237 <= 18) {
                        class61.method1019(3, 1);
                        break;
                    }
                    if (class33.field236 >= field892 + 708 && class33.field237 >= 4 && class33.field236 <= field892 + 708 + 50 && class33.field237 <= 20) {
                        method2566();
                        break;
                    }
                    if (field903 == -1) {
                        if (field921 > 0 && Statics.field2145 != null && class33.field236 >= 0 && class33.field236 <= Statics.field2145.field4595 && class33.field237 >= Statics.field1246 / 2 - 50 && class33.field237 <= Statics.field1246 / 2 + 50) {
                            field921--;
                        }
                        if (field921 < field922 && Statics.field3206 != null && class33.field236 >= Statics.field3209 - Statics.field3206.field4595 - 5 && class33.field236 <= Statics.field3209 && class33.field237 >= Statics.field1246 / 2 - 50 && class33.field237 <= Statics.field1246 / 2 + 50) {
                            field921++;
                        }
                    } else {
                        class61 var6 = Statics.field246[field903];
                        method1984(var6);
                        method2566();
                    }
                    break;
                }
                if (Statics.field1750 == 13) {
                    method2566();
                    break;
                }
                if (Statics.field1750 == 96) {
                    if (field921 > 0 && Statics.field2145 != null) {
                        field921--;
                    }
                } else if (Statics.field1750 == 97 && field921 < field922 && Statics.field3206 != null) {
                    field921++;
                }
            }
            return;
        }
        if ((class33.field235 == 1 || !Statics.field4238 && class33.field235 == 4) && class33.field236 >= field892 + 765 - 50 && class33.field237 >= 453) {
            Statics.field4567.field1222 = !Statics.field4567.field1222;
            class89.method450();
            if (Statics.field4567.field1222) {
                Statics.field3109.method4552();
                class266.field3108 = 1;
                Statics.field3105 = null;
            } else {
                class305 var7 = Statics.field2607;
                int var8 = var7.method5046("scape main");
                int var9 = var7.method5047(var8, "");
                class266.method1801(var7, var8, var9, 255, false);
            }
        }
        if (client.field731 == 5) {
            return;
        }
        if (field923 == -1L) {
            field923 = class262.method4787() + 1000L;
        }
        long var10 = class262.method4787();
        boolean var12;
        if (client.field779 == null || client.field780 >= client.field779.size()) {
            var12 = true;
        } else {
            while (true) {
                if (client.field780 >= client.field779.size()) {
                    var12 = true;
                    break;
                }
                class77 var13 = (class77) client.field779.get(client.field780);
                if (!var13.method1959()) {
                    var12 = false;
                    break;
                }
                client.field780++;
            }
        }
        if (var12 && field924 == -1L) {
            field924 = var10;
            if (field924 > field923) {
                field923 = field924;
            }
        }
        if (client.field731 != 10 && client.field731 != 11) {
            return;
        }
        if (Statics.field1503 == class322.field3989) {
            if (class33.field235 == 1 || !Statics.field4238 && class33.field235 == 4) {
                int var14 = field892 + 5;
                short var15 = 463;
                byte var16 = 100;
                byte var17 = 35;
                if (class33.field236 >= var14 && class33.field236 <= var14 + var16 && class33.field237 >= var15 && class33.field237 <= var15 + var17) {
                    method6583();
                    return;
                }
            }
            if (Statics.field2773 != null) {
                method6583();
            }
        }
        int var18 = class33.field235;
        int var19 = class33.field236;
        int var20 = class33.field237;
        if (var18 == 0) {
            var19 = class33.field223;
            var20 = class33.field229;
        }
        if (!Statics.field4238 && var18 == 4) {
            var18 = 1;
        }
        if (field904 == 0) {
            boolean var21 = false;
            while (class24.method6010()) {
                if (Statics.field1750 == 84) {
                    var21 = true;
                }
            }
            int var22 = Statics.field17 - 80;
            short var23 = 291;
            if (var18 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                class30.method2812(client.method3071("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var24 = Statics.field17 + 80;
            if (var18 == 1 && var19 >= var24 - 75 && var19 <= var24 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20 || var21) {
                if ((client.field770 & 0x2000000) != 0) {
                    field905 = "";
                    field906 = class300.field3761;
                    field893 = class300.field3762;
                    field908 = class300.field3763;
                    method2054(1);
                    method3969();
                } else if ((client.field770 & 0x4) != 0) {
                    if ((client.field770 & 0x400) == 0) {
                        field906 = class300.field3752;
                        field893 = class300.field3753;
                        field908 = class300.field3754;
                    } else {
                        field906 = class300.field3586;
                        field893 = class300.field3769;
                        field908 = class300.field3760;
                    }
                    field905 = class300.field3805;
                    method2054(1);
                    method3969();
                } else if ((client.field770 & 0x400) == 0) {
                    method5019(false);
                } else {
                    field906 = class300.field3696;
                    field893 = class300.field3756;
                    field908 = class300.field3815;
                    field905 = class300.field3805;
                    method2054(1);
                    method3969();
                }
            }
        } else if (field904 == 1) {
            while (true) {
                if (!class24.method6010()) {
                    int var25 = Statics.field17 - 80;
                    short var26 = 321;
                    if (var18 == 1 && var19 >= var25 - 75 && var19 <= var25 + 75 && var20 >= var26 - 20 && var20 <= var26 + 20) {
                        method5019(false);
                    }
                    int var27 = Statics.field17 + 80;
                    if (var18 == 1 && var19 >= var27 - 75 && var19 <= var27 + 75 && var20 >= var26 - 20 && var20 <= var26 + 20) {
                        method2054(0);
                    }
                    break;
                }
                if (Statics.field1750 == 84) {
                    method5019(false);
                } else if (Statics.field1750 == 13) {
                    method2054(0);
                }
            }
        } else if (field904 == 2) {
            short var28 = 201;
            int var153 = var28 + 52;
            if (var18 == 1 && var20 >= var153 - 12 && var20 < var153 + 2) {
                field916 = 0;
            }
            var153 += 15;
            if (var18 == 1 && var20 >= var153 - 12 && var20 < var153 + 2) {
                field916 = 1;
            }
            var153 += 15;
            short var29 = 361;
            if (Statics.field26 != null) {
                int var30 = Statics.field26.field4223 / 2;
                if (var18 == 1 && var19 >= Statics.field26.field4225 - var30 && var19 <= Statics.field26.field4225 + var30 && var20 >= var29 - 15 && var20 < var29) {
                    switch(field919) {
                        case 1:
                            method2337(class300.field3800, class300.field3801, class300.field3802);
                            method2054(5);
                            return;
                        case 2:
                            class30.method2812("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var31 = Statics.field17 - 80;
            short var32 = 321;
            if (var18 == 1 && var19 >= var31 - 75 && var19 <= var31 + 75 && var20 >= var32 - 20 && var20 <= var32 + 20) {
                field902 = field902.trim();
                if (field902.length() == 0) {
                    method2337(class300.field3530, class300.field3797, class300.field3597);
                    return;
                }
                if (field910.length() == 0) {
                    method2337(class300.field3718, class300.field3648, class300.field3799);
                    return;
                }
                method2337(class300.field3642, class300.field3767, class300.field3768);
                client.method5711(false);
                client.method2405(20);
                return;
            }
            int var33 = field897 + 180 + 80;
            if (var18 == 1 && var19 >= var33 - 75 && var19 <= var33 + 75 && var20 >= var32 - 20 && var20 <= var32 + 20) {
                method2054(0);
                field902 = "";
                field910 = "";
                Statics.field2589 = 0;
                Statics.field1653 = "";
                field894 = true;
            }
            int var34 = Statics.field17 + -117;
            short var35 = 277;
            field913 = var19 >= var34 && var19 < Statics.field813 + var34 && var20 >= var35 && var20 < Statics.field1561 + var35;
            if (var18 == 1 && field913) {
                client.field720 = !client.field720;
                if (!client.field720 && Statics.field4567.field1226 != null) {
                    Statics.field4567.field1226 = null;
                    class89.method450();
                }
            }
            int var36 = Statics.field17 + 24;
            short var37 = 277;
            field914 = var19 >= var36 && var19 < Statics.field813 + var36 && var20 >= var37 && var20 < Statics.field1561 + var37;
            if (var18 == 1 && field914) {
                Statics.field4567.field1227 = !Statics.field4567.field1227;
                if (!Statics.field4567.field1227) {
                    field902 = "";
                    Statics.field4567.field1226 = null;
                    method3969();
                }
                class89.method450();
            }
            while (true) {
                Transferable var39;
                int var40;
                do {
                    while (true) {
                        label1156: do {
                            while (true) {
                                while (class24.method6010()) {
                                    if (Statics.field1750 == 13) {
                                        method2054(0);
                                        field902 = "";
                                        field910 = "";
                                        Statics.field2589 = 0;
                                        Statics.field1653 = "";
                                        field894 = true;
                                    } else {
                                        if (field916 != 0) {
                                            continue label1156;
                                        }
                                        method2184(Statics.field1611);
                                        if (Statics.field1750 == 85 && field902.length() > 0) {
                                            field902 = field902.substring(0, field902.length() - 1);
                                        }
                                        if (Statics.field1750 == 84 || Statics.field1750 == 80) {
                                            field916 = 1;
                                        }
                                        if (method284(Statics.field1611) && field902.length() < 320) {
                                            field902 = field902 + Statics.field1611;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field916 != 1);
                        if (Statics.field1750 == 85 && field910.length() > 0) {
                            field910 = field910.substring(0, field910.length() - 1);
                        } else if (Statics.field1750 == 84 || Statics.field1750 == 80) {
                            field916 = 0;
                            if (Statics.field1750 == 84) {
                                field902 = field902.trim();
                                if (field902.length() == 0) {
                                    method2337(class300.field3530, class300.field3797, class300.field3597);
                                    return;
                                }
                                if (field910.length() == 0) {
                                    method2337(class300.field3718, class300.field3648, class300.field3799);
                                    return;
                                }
                                method2337(class300.field3642, class300.field3767, class300.field3768);
                                client.method5711(false);
                                client.method2405(20);
                                return;
                            }
                        }
                        if ((class24.field131[82] || class24.field131[87]) && Statics.field1750 == 67) {
                            Clipboard var38 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var39 = var38.getContents(Statics.field4489);
                            var40 = 20 - field910.length();
                            break;
                        }
                        char var51 = Statics.field1611;
                        boolean var52;
                        if ((var51 < ' ' || var51 >= 127) && (var51 <= 127 || var51 >= 160) && (var51 <= 160 || var51 > 255)) {
                            label1383: {
                                if (var51 != 0) {
                                    char[] var53 = class334.field4049;
                                    for (int var54 = 0; var54 < var53.length; var54++) {
                                        char var55 = var53[var54];
                                        if (var51 == var55) {
                                            var52 = true;
                                            break label1383;
                                        }
                                    }
                                }
                                var52 = false;
                            }
                        } else {
                            var52 = true;
                        }
                        if (var52 && method284(Statics.field1611) && field910.length() < 20) {
                            field910 = field910 + Statics.field1611;
                        }
                    }
                } while (var40 <= 0);
                try {
                    String var41 = (String) var39.getTransferData(DataFlavor.stringFlavor);
                    int var42 = Math.min(var40, var41.length());
                    for (int var43 = 0; var43 < var42; var43++) {
                        char var44 = var41.charAt(var43);
                        boolean var45;
                        if (var44 >= ' ' && var44 < 127 || var44 > 127 && var44 < 160 || var44 > 160 && var44 <= 255) {
                            var45 = true;
                        } else {
                            label1405: {
                                if (var44 != 0) {
                                    char[] var46 = class334.field4049;
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        char var48 = var46[var47];
                                        if (var44 == var48) {
                                            var45 = true;
                                            break label1405;
                                        }
                                    }
                                }
                                var45 = false;
                            }
                        }
                        if (!var45 || !method284(var41.charAt(var43))) {
                            method2054(3);
                            return;
                        }
                    }
                    field910 = field910 + var41.substring(0, var42);
                } catch (UnsupportedFlavorException var151) {
                } catch (IOException var152) {
                }
            }
        } else if (field904 == 3) {
            int var56 = field897 + 180;
            short var57 = 276;
            if (var18 == 1 && var19 >= var56 - 75 && var19 <= var56 + 75 && var20 >= var57 - 20 && var20 <= var57 + 20) {
                method1926(false);
            }
            int var58 = field897 + 180;
            short var59 = 326;
            if (var18 == 1 && var19 >= var58 - 75 && var19 <= var58 + 75 && var20 >= var59 - 20 && var20 <= var59 + 20) {
                method2337(class300.field3800, class300.field3801, class300.field3802);
                method2054(5);
                return;
            }
        } else if (field904 == 4) {
            int var60 = field897 + 180 - 80;
            short var61 = 321;
            if (var18 == 1 && var19 >= var60 - 75 && var19 <= var60 + 75 && var20 >= var61 - 20 && var20 <= var61 + 20) {
                Statics.field1653.trim();
                if (Statics.field1653.length() != 6) {
                    method2337(class300.field3644, class300.field3564, class300.field3565);
                    return;
                }
                Statics.field2589 = Integer.parseInt(Statics.field1653);
                Statics.field1653 = "";
                client.method5711(true);
                method2337(class300.field3642, class300.field3767, class300.field3768);
                client.method2405(20);
                return;
            }
            if (var18 == 1 && var19 >= field897 + 180 - 9 && var19 <= field897 + 180 + 130 && var20 >= 263 && var20 <= 296) {
                field894 = !field894;
            }
            if (var18 == 1 && var19 >= field897 + 180 - 34 && var19 <= field897 + 180 + 34 && var20 >= 351 && var20 <= 363) {
                class30.method2812(client.method3071("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var62 = field897 + 180 + 80;
            if (var18 == 1 && var19 >= var62 - 75 && var19 <= var62 + 75 && var20 >= var61 - 20 && var20 <= var61 + 20) {
                method2054(0);
                field902 = "";
                field910 = "";
                Statics.field2589 = 0;
                Statics.field1653 = "";
            }
            while (class24.method6010()) {
                boolean var63 = false;
                for (int var64 = 0; var64 < field901.length(); var64++) {
                    if (Statics.field1611 == field901.charAt(var64)) {
                        var63 = true;
                        break;
                    }
                }
                if (Statics.field1750 == 13) {
                    method2054(0);
                    field902 = "";
                    field910 = "";
                    Statics.field2589 = 0;
                    Statics.field1653 = "";
                } else {
                    if (Statics.field1750 == 85 && Statics.field1653.length() > 0) {
                        Statics.field1653 = Statics.field1653.substring(0, Statics.field1653.length() - 1);
                    }
                    if (Statics.field1750 == 84) {
                        Statics.field1653.trim();
                        if (Statics.field1653.length() != 6) {
                            method2337(class300.field3644, class300.field3564, class300.field3565);
                            return;
                        }
                        Statics.field2589 = Integer.parseInt(Statics.field1653);
                        Statics.field1653 = "";
                        client.method5711(true);
                        method2337(class300.field3642, class300.field3767, class300.field3768);
                        client.method2405(20);
                        return;
                    }
                    if (var63 && Statics.field1653.length() < 6) {
                        Statics.field1653 = Statics.field1653 + Statics.field1611;
                    }
                }
            }
        } else if (field904 == 5) {
            int var65 = field897 + 180 - 80;
            short var66 = 321;
            if (var18 == 1 && var19 >= var65 - 75 && var19 <= var65 + 75 && var20 >= var66 - 20 && var20 <= var66 + 20) {
                method2592();
                return;
            }
            int var67 = field897 + 180 + 80;
            if (var18 == 1 && var19 >= var67 - 75 && var19 <= var67 + 75 && var20 >= var66 - 20 && var20 <= var66 + 20) {
                method5019(true);
            }
            short var68 = 361;
            if (Statics.field1108 != null) {
                int var69 = Statics.field1108.field4223 / 2;
                if (var18 == 1 && var19 >= Statics.field1108.field4225 - var69 && var19 <= Statics.field1108.field4225 + var69 && var20 >= var68 - 15 && var20 < var68) {
                    class30.method2812(client.method3071("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method6010()) {
                boolean var70 = false;
                for (int var71 = 0; var71 < field917.length(); var71++) {
                    if (Statics.field1611 == field917.charAt(var71)) {
                        var70 = true;
                        break;
                    }
                }
                if (Statics.field1750 == 13) {
                    method5019(true);
                } else {
                    if (Statics.field1750 == 85 && field902.length() > 0) {
                        field902 = field902.substring(0, field902.length() - 1);
                    }
                    if (Statics.field1750 == 84) {
                        method2592();
                        return;
                    }
                    if (var70 && field902.length() < 320) {
                        field902 = field902 + Statics.field1611;
                    }
                }
            }
        } else if (field904 == 6) {
            while (true) {
                do {
                    if (!class24.method6010()) {
                        short var72 = 321;
                        if (var18 == 1 && var20 >= var72 - 20 && var20 <= var72 + 20) {
                            method5019(true);
                        }
                        return;
                    }
                } while (Statics.field1750 != 84 && Statics.field1750 != 13);
                method5019(true);
            }
        } else if (field904 == 7) {
            if (Statics.field3086 && !client.field544) {
                int var73 = Statics.field17 - 150;
                int var74 = var73 + 240 + 25 + 40;
                short var75 = 231;
                int var76 = var75 + 40;
                if (var18 == 1 && var19 >= var73 && var19 <= var74 && var20 >= var75 && var20 <= var76) {
                    int var77 = var73;
                    int var78 = 0;
                    int var79;
                    while (true) {
                        if (var78 >= 8) {
                            var79 = 0;
                            break;
                        }
                        if (var19 <= var77 + 30) {
                            var79 = var78;
                            break;
                        }
                        var77 += 30;
                        var77 += var78 == 1 || var78 == 3 ? 20 : 5;
                        var78++;
                    }
                    field911 = var79;
                }
                int var80 = field897 + 180 - 80;
                short var81 = 321;
                if (var18 == 1 && var19 >= var80 - 75 && var19 <= var80 + 75 && var20 >= var81 - 20 && var20 <= var81 + 20) {
                    boolean var90;
                    label1035: {
                        Date var88;
                        try {
                            SimpleDateFormat var82 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var82.setLenient(false);
                            StringBuilder var83 = new StringBuilder();
                            String[] var84 = field912;
                            int var85 = 0;
                            Date var87;
                            while (true) {
                                if (var85 >= var84.length) {
                                    var83.append("12");
                                    var87 = var82.parse(var83.toString());
                                    break;
                                }
                                String var86 = var84[var85];
                                if (var86 == null) {
                                    method5930("Date not valid.", "Please ensure all characters are populated.", "");
                                    var87 = null;
                                    break;
                                }
                                var83.append(var86);
                                var85++;
                            }
                            var88 = var87;
                        } catch (ParseException var150) {
                            method5930("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var90 = false;
                            break label1035;
                        }
                        if (var88 == null) {
                            var90 = false;
                        } else {
                            Calendar var91 = Calendar.getInstance();
                            var91.set(1, var91.get(1) - 13);
                            Date var92 = var91.getTime();
                            boolean var93 = var88.before(var92);
                            Calendar var95 = Calendar.getInstance();
                            var95.set(2, 0);
                            var95.set(5, 1);
                            var95.set(1, 1900);
                            Date var96 = var95.getTime();
                            boolean var98 = var88.after(var96);
                            if (var98) {
                                if (var93) {
                                    Statics.field2400 = (int) (var88.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field2400 = 8388607;
                                }
                                var90 = true;
                            } else {
                                method5930("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var90 = false;
                            }
                        }
                    }
                    if (var90) {
                        client.method2405(50);
                        return;
                    }
                }
                int var101 = field897 + 180 + 80;
                if (var18 == 1 && var19 >= var101 - 75 && var19 <= var101 + 75 && var20 >= var81 - 20 && var20 <= var81 + 20) {
                    field912 = new String[8];
                    method5019(true);
                }
                while (class24.method6010()) {
                    if (Statics.field1750 == 101) {
                        field912[field911] = null;
                    }
                    if (Statics.field1750 == 85) {
                        if (field912[field911] == null && field911 > 0) {
                            field911--;
                        }
                        field912[field911] = null;
                    }
                    if (Statics.field1611 >= '0' && Statics.field1611 <= '9') {
                        field912[field911] = "" + Statics.field1611;
                        if (field911 < 7) {
                            field911++;
                        }
                    }
                    if (Statics.field1750 == 84) {
                        boolean var110;
                        label963: {
                            Date var108;
                            try {
                                SimpleDateFormat var102 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var102.setLenient(false);
                                StringBuilder var103 = new StringBuilder();
                                String[] var104 = field912;
                                int var105 = 0;
                                while (true) {
                                    Date var107;
                                    if (var105 < var104.length) {
                                        String var106 = var104[var105];
                                        if (var106 != null) {
                                            var103.append(var106);
                                            var105++;
                                            continue;
                                        }
                                        method5930("Date not valid.", "Please ensure all characters are populated.", "");
                                        var107 = null;
                                    } else {
                                        var103.append("12");
                                        var107 = var102.parse(var103.toString());
                                    }
                                    var108 = var107;
                                    break;
                                }
                            } catch (ParseException var149) {
                                method5930("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var110 = false;
                                break label963;
                            }
                            if (var108 == null) {
                                var110 = false;
                            } else {
                                Calendar var111 = Calendar.getInstance();
                                var111.set(1, var111.get(1) - 13);
                                Date var112 = var111.getTime();
                                boolean var113 = var108.before(var112);
                                Calendar var115 = Calendar.getInstance();
                                var115.set(2, 0);
                                var115.set(5, 1);
                                var115.set(1, 1900);
                                Date var116 = var115.getTime();
                                boolean var118 = var108.after(var116);
                                if (var118) {
                                    if (var113) {
                                        Statics.field2400 = (int) (var108.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field2400 = 8388607;
                                    }
                                    var110 = true;
                                } else {
                                    method5930("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var110 = false;
                                }
                            }
                        }
                        if (var110) {
                            client.method2405(50);
                        }
                        return;
                    }
                }
            } else {
                int var121 = field897 + 180 - 80;
                short var122 = 321;
                if (var18 == 1 && var19 >= var121 - 75 && var19 <= var121 + 75 && var20 >= var122 - 20 && var20 <= var122 + 20) {
                    class30.method2812(client.method3071("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2337(class300.field3639, class300.field3798, class300.field3728);
                    method2054(6);
                    return;
                }
                int var123 = field897 + 180 + 80;
                if (var18 == 1 && var19 >= var123 - 75 && var19 <= var123 + 75 && var20 >= var122 - 20 && var20 <= var122 + 20) {
                    method5019(true);
                }
            }
        } else if (field904 == 8) {
            int var124 = field897 + 180 - 80;
            short var125 = 321;
            if (var18 == 1 && var19 >= var124 - 75 && var19 <= var124 + 75 && var20 >= var125 - 20 && var20 <= var125 + 20) {
                class30.method2812("https://www.jagex.com/terms/privacy", true, false);
                method2337(class300.field3639, class300.field3798, class300.field3728);
                method2054(6);
                return;
            }
            int var126 = field897 + 180 + 80;
            if (var18 == 1 && var19 >= var126 - 75 && var19 <= var126 + 75 && var20 >= var125 - 20 && var20 <= var125 + 20) {
                method5019(true);
            }
        } else if (field904 == 9) {
            int var127 = field897 + 180;
            short var128 = 311;
            if (Statics.field1750 == 84 || Statics.field1750 == 13 || var18 == 1 && var19 >= var127 - 75 && var19 <= var127 + 75 && var20 >= var128 - 20 && var20 <= var128 + 20) {
                method1926(false);
            }
        } else if (field904 == 10) {
            int var129 = field897 + 180;
            short var130 = 209;
            if (Statics.field1750 == 84 || var18 == 1 && var19 >= var129 - 109 && var19 <= var129 + 109 && var20 >= var130 && var20 <= var130 + 68) {
                method2337(class300.field3642, class300.field3767, class300.field3768);
                client.field535 = class425.field4562;
                client.method5711(false);
                client.method2405(20);
            }
        } else if (field904 == 12) {
            int var131 = Statics.field17;
            short var132 = 233;
            class368 var133 = arg1.method5445(0, 30, class300.field3826, var131, var132);
            class368 var134 = arg1.method5445(32, 32, class300.field3826, var131, var132);
            class368 var135 = arg1.method5445(70, 34, class300.field3826, var131, var132);
            int var154 = var132 + 17;
            class368 var136 = arg1.method5445(0, 34, class300.field3827, var131, var154);
            if (var18 == 1) {
                if (var133.method5939(var19, var20)) {
                    class30.method2812("https://www.jagex.com/terms", true, false);
                } else if (var134.method5939(var19, var20)) {
                    class30.method2812("https://www.jagex.com/terms/privacy", true, false);
                } else if (var135.method5939(var19, var20) || var136.method5939(var19, var20)) {
                    class30.method2812("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var137 = Statics.field17 - 80;
            short var138 = 311;
            if (var18 == 1 && var19 >= var137 - 75 && var19 <= var137 + 75 && var20 >= var138 - 20 && var20 <= var138 + 20) {
                client.method1802();
                method1926(true);
            }
            int var139 = Statics.field17 + 80;
            if (var18 == 1 && var19 >= var139 - 75 && var19 <= var139 + 75 && var20 >= var138 - 20 && var20 <= var138 + 20) {
                field904 = 13;
            }
        } else if (field904 == 13) {
            int var140 = Statics.field17;
            short var141 = 321;
            if (var18 == 1 && var19 >= var140 - 75 && var19 <= var140 + 75 && var20 >= var141 - 20 && var20 <= var141 + 20) {
                method1926(true);
            }
        } else if (field904 == 14) {
            String var142 = "";
            switch(field915) {
                case 0:
                    var142 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var142 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method5019(false);
            }
            int var143 = field897 + 180;
            short var144 = 276;
            if (var18 == 1 && var19 >= var143 - 75 && var19 <= var143 + 75 && var20 >= var144 - 20 && var20 <= var144 + 20) {
                class30.method2812(var142, true, false);
                method2337(class300.field3639, class300.field3798, class300.field3728);
                method2054(6);
                return;
            }
            int var145 = field897 + 180;
            short var146 = 326;
            if (var18 == 1 && var19 >= var145 - 75 && var19 <= var145 + 75 && var20 >= var146 - 20 && var20 <= var146 + 20) {
                method5019(false);
            }
        } else if (field904 == 24) {
            int var147 = field897 + 180;
            short var148 = 301;
            if (var18 == 1 && var19 >= var147 - 75 && var19 <= var147 + 75 && var20 >= var148 - 20 && var20 <= var148 + 20) {
                method1926(false);
            }
        }
    }

    @ObfuscatedName("nc.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method5930(String arg0, String arg1, String arg2) {
        method2054(7);
        method2337(arg0, arg1, arg2);
    }

    @ObfuscatedName("ci.y(CI)Z")
    public static boolean method2184(char arg0) {
        for (int var1 = 0; var1 < field917.length(); var1++) {
            if (arg0 == field917.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.u(CB)Z")
    public static boolean method284(char arg0) {
        return field917.indexOf(arg0) != -1;
    }

    @ObfuscatedName("kz.h(ZB)V")
    public static void method5019(boolean arg0) {
        field906 = class300.field3748;
        field893 = class300.field3749;
        field908 = class300.field3750;
        method2054(2);
        if (arg0) {
            field910 = "";
        }
        method1899();
        method3969();
    }

    @ObfuscatedName("bo.q(ZI)V")
    public static void method1926(boolean arg0) {
        byte var1 = 0;
        if (!client.method3568()) {
            var1 = 12;
        } else if (Statics.field4489.method1217() || Statics.field4489.method1132()) {
            var1 = 10;
        }
        method2054(var1);
        if (arg0) {
            field902 = "";
            field910 = "";
            Statics.field2589 = 0;
            Statics.field1653 = "";
        }
        method1899();
        method3969();
    }

    @ObfuscatedName("dn.x(I)V")
    public static void method2592() {
        field902 = field902.trim();
        if (field902.length() == 0) {
            method2337(class300.field3800, class300.field3801, class300.field3802);
            return;
        }
        long var0 = class66.method3940();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field902;
            Random var4 = new Random();
            class421 var5 = new class421(128);
            class421 var6 = new class421(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method6644(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method6650(var4.nextInt());
            }
            var5.method6650(var7[0]);
            var5.method6650(var7[1]);
            var5.method6778(var0);
            var5.method6778(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method6650(var4.nextInt());
            }
            var5.method6677(class66.field870, class66.field869);
            var6.method6644(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method6650(var4.nextInt());
            }
            var6.method6778(var4.nextLong());
            var6.method6652(var4.nextLong());
            if (client.field545 == null) {
                byte[] var11 = class154.method328();
                var6.method6657(var11, 0, var11.length);
            } else {
                var6.method6657(client.field545, 0, client.field545.length);
            }
            var6.method6778(var4.nextLong());
            var6.method6677(class66.field870, class66.field869);
            int var12 = class421.method5127(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class421 var13 = new class421(var12);
            var13.method6654(var3);
            var13.field4512 = var12;
            var13.method6684(var7);
            class421 var14 = new class421(var13.field4512 + var6.field4512 + var5.field4512 + 5);
            var14.method6644(2);
            var14.method6644(var5.field4512);
            var14.method6657(var5.field4511, 0, var5.field4512);
            var14.method6644(var6.field4512);
            var14.method6657(var6.field4511, 0, var6.field4512);
            var14.method6757(var13.field4512);
            var14.method6657(var13.field4511, 0, var13.field4512);
            byte[] var15 = var14.field4511;
            String var16 = class335.method2629(var15, 0, var15.length);
            String var17 = var16;
            byte var24;
            try {
                URL var18 = new URL(client.method3071("services", false) + "m=accountappeal/login.ws");
                URLConnection var19 = var18.openConnection();
                var19.setDoInput(true);
                var19.setDoOutput(true);
                var19.setConnectTimeout(5000);
                OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
                var20.write("data2=" + class444.method2175(var17) + "&dest=" + class444.method2175("passwordchoice.ws"));
                var20.flush();
                InputStream var21 = var19.getInputStream();
                class421 var22 = new class421(new byte[1000]);
                while (true) {
                    int var23 = var21.read(var22.field4511, var22.field4512, 1000 - var22.field4512);
                    if (var23 == -1) {
                        var20.close();
                        var21.close();
                        String var25 = new String(var22.field4511);
                        if (var25.startsWith("OFFLINE")) {
                            var24 = 4;
                        } else if (var25.startsWith("WRONG")) {
                            var24 = 7;
                        } else if (var25.startsWith("RELOAD")) {
                            var24 = 3;
                        } else if (var25.startsWith("Not permitted for social network accounts.")) {
                            var24 = 6;
                        } else {
                            var22.method6685(var7);
                            while (var22.field4512 > 0 && var22.field4511[var22.field4512 - 1] == 0) {
                                var22.field4512--;
                            }
                            String var26 = new String(var22.field4511, 0, var22.field4512);
                            boolean var27;
                            if (var26 == null) {
                                var27 = false;
                            } else {
                                label93: {
                                    try {
                                        new URL(var26);
                                    } catch (MalformedURLException var30) {
                                        var27 = false;
                                        break label93;
                                    }
                                    var27 = true;
                                }
                            }
                            if (var27) {
                                class30.method2812(var26, true, false);
                                var24 = 2;
                            } else {
                                var24 = 5;
                            }
                        }
                        break;
                    }
                    var22.field4512 += var23;
                    if (var22.field4512 >= 1000) {
                        var24 = 5;
                        break;
                    }
                }
            } catch (Throwable var31) {
                var31.printStackTrace();
                var24 = 5;
            }
            var2 = var24;
        }
        switch(var2) {
            case 2:
                method2337(class300.field3803, class300.field3570, class300.field3717);
                method2054(6);
                break;
            case 3:
                method2337(class300.field3806, class300.field3807, class300.field3808);
                break;
            case 4:
                method2337(class300.field3809, class300.field3810, class300.field3661);
                break;
            case 5:
                method2337(class300.field3812, class300.field3599, class300.field3814);
                break;
            case 6:
                method2337(class300.field3615, class300.field3816, class300.field3693);
                break;
            case 7:
                method2337(class300.field3818, class300.field3819, class300.field3820);
        }
    }

    @ObfuscatedName("bu.p(Llv;Llv;Llv;B)V")
    public static void method1649(class332 arg0, class332 arg1, class332 arg2) {
        field892 = (Statics.field3209 - 765) / 2;
        field897 = field892 + 202;
        Statics.field17 = field897 + 180;
        if (field927) {
            if (Statics.field2748 == null) {
                Statics.field2748 = class435.method1960(Statics.field481, "sl_back", "");
            }
            if (Statics.field2385 == null) {
                Statics.field2385 = class435.method4753(Statics.field481, "sl_flags", "");
            }
            if (Statics.field2536 == null) {
                Statics.field2536 = class435.method4753(Statics.field481, "sl_arrows", "");
            }
            if (Statics.field3886 == null) {
                Statics.field3886 = class435.method4753(Statics.field481, "sl_stars", "");
            }
            if (Statics.field2145 == null) {
                Statics.field2145 = class435.method2155(Statics.field481, "leftarrow", "");
            }
            if (Statics.field3206 == null) {
                Statics.field3206 = class435.method2155(Statics.field481, "rightarrow", "");
            }
            class430.method6958(field892, 23, 765, 480, 0);
            class430.method6992(field892, 0, 125, 23, 12425273, 9135624);
            class430.method6992(field892 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5449(class300.field3833, field892 + 62, 15, 0, -1);
            if (Statics.field3886 != null) {
                Statics.field3886[1].method7034(field892 + 140, 1);
                arg1.method5446(class300.field3708, field892 + 152, 10, 16777215, -1);
                Statics.field3886[0].method7034(field892 + 140, 12);
                arg1.method5446(class300.field3835, field892 + 152, 21, 16777215, -1);
            }
            if (Statics.field2536 != null) {
                int var3 = field892 + 280;
                if (class61.field794[0] == 0 && class61.field793[0] == 0) {
                    Statics.field2536[2].method7034(var3, 4);
                } else {
                    Statics.field2536[0].method7034(var3, 4);
                }
                if (class61.field794[0] == 0 && class61.field793[0] == 1) {
                    Statics.field2536[3].method7034(var3 + 15, 4);
                } else {
                    Statics.field2536[1].method7034(var3 + 15, 4);
                }
                arg0.method5446(class300.field3836, var3 + 32, 17, 16777215, -1);
                int var4 = field892 + 390;
                if (class61.field794[0] == 1 && class61.field793[0] == 0) {
                    Statics.field2536[2].method7034(var4, 4);
                } else {
                    Statics.field2536[0].method7034(var4, 4);
                }
                if (class61.field794[0] == 1 && class61.field793[0] == 1) {
                    Statics.field2536[3].method7034(var4 + 15, 4);
                } else {
                    Statics.field2536[1].method7034(var4 + 15, 4);
                }
                arg0.method5446(class300.field3837, var4 + 32, 17, 16777215, -1);
                int var5 = field892 + 500;
                if (class61.field794[0] == 2 && class61.field793[0] == 0) {
                    Statics.field2536[2].method7034(var5, 4);
                } else {
                    Statics.field2536[0].method7034(var5, 4);
                }
                if (class61.field794[0] == 2 && class61.field793[0] == 1) {
                    Statics.field2536[3].method7034(var5 + 15, 4);
                } else {
                    Statics.field2536[1].method7034(var5 + 15, 4);
                }
                arg0.method5446(class300.field3647, var5 + 32, 17, 16777215, -1);
                int var6 = field892 + 610;
                if (class61.field794[0] == 3 && class61.field793[0] == 0) {
                    Statics.field2536[2].method7034(var6, 4);
                } else {
                    Statics.field2536[0].method7034(var6, 4);
                }
                if (class61.field794[0] == 3 && class61.field793[0] == 1) {
                    Statics.field2536[3].method7034(var6 + 15, 4);
                } else {
                    Statics.field2536[1].method7034(var6 + 15, 4);
                }
                arg0.method5446(class300.field3839, var6 + 32, 17, 16777215, -1);
            }
            class430.method6958(field892 + 708, 4, 50, 16, 0);
            arg1.method5449(class300.field3782, field892 + 708 + 25, 16, 16777215, -1);
            field903 = -1;
            if (Statics.field2748 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class61.field801) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class61.field801) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class61.field801) {
                        var10--;
                    }
                } while (var10 != var11 || var9 != var12);
                int var13 = (765 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (480 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (class61.field801 + var10 - 1) / var10;
                field922 = var17 - var9;
                if (Statics.field2145 != null && field921 > 0) {
                    Statics.field2145.method7034(8, Statics.field1246 / 2 - Statics.field2145.field4600 / 2);
                }
                if (Statics.field3206 != null && field921 < field922) {
                    Statics.field3206.method7034(Statics.field3209 - Statics.field3206.field4595 - 8, Statics.field1246 / 2 - Statics.field3206.field4600 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field892 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field921;
                for (int var23 = var10 * var22; var23 < class61.field801 && var22 - field921 < var9; var23++) {
                    class61 var24 = Statics.field246[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field797);
                    if (var24.field797 == -1) {
                        var26 = class300.field3730;
                        var25 = false;
                    } else if (var24.field797 > 1980) {
                        var26 = class300.field3841;
                        var25 = false;
                    }
                    int var27 = 0;
                    byte var28;
                    if (var24.method1572()) {
                        if (var24.method1542()) {
                            var28 = 7;
                        } else {
                            var28 = 6;
                        }
                    } else if (var24.method1544()) {
                        var27 = 16711680;
                        if (var24.method1542()) {
                            var28 = 5;
                        } else {
                            var28 = 4;
                        }
                    } else if (var24.method1547()) {
                        if (var24.method1542()) {
                            var28 = 9;
                        } else {
                            var28 = 8;
                        }
                    } else if (var24.method1565()) {
                        if (var24.method1542()) {
                            var28 = 3;
                        } else {
                            var28 = 2;
                        }
                    } else if (var24.method1542()) {
                        var28 = 1;
                    } else {
                        var28 = 0;
                    }
                    if (class33.field223 >= var19 && class33.field229 >= var18 && class33.field223 < var7 + var19 && class33.field229 < var8 + var18 && var25) {
                        field903 = var23;
                        Statics.field2748[var28].method7070(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field2748[var28].method7064(var19, var18);
                    }
                    if (Statics.field2385 != null) {
                        Statics.field2385[(var24.method1542() ? 8 : 0) + var24.field800].method7034(var19 + 29, var18);
                    }
                    arg0.method5449(Integer.toString(var24.field795), var19 + 15, var8 / 2 + var18 + 5, var27, -1);
                    arg1.method5449(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
                    var18 += var8 + var14;
                    var20++;
                    if (var20 >= var10) {
                        var18 = var16 + 23;
                        var19 += var7 + var13;
                        var20 = 0;
                        var22++;
                    }
                }
                if (var21) {
                    int var29 = arg1.method5441(Statics.field246[field903].field799) + 6;
                    int var30 = arg1.field4045 + 8;
                    int var31 = class33.field229 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class33.field229 - 25 - var30;
                    }
                    class430.method6958(class33.field223 - var29 / 2, var31, var29, var30, 16777120);
                    class430.method6959(class33.field223 - var29 / 2, var31, var29, var30, 0);
                    arg1.method5449(Statics.field246[field903].field799, class33.field223, arg1.field4045 + var31 + 4, 0, -1);
                }
            }
            Statics.field309.method427(0, 0);
            return;
        }
        Statics.field3080.method7064(field892, 0);
        Statics.field810.method7064(field892 + 382, 0);
        Statics.field171.method7034(field892 + 382 - Statics.field171.field4595 / 2, 18);
        if (client.field731 == 0 || client.field731 == 5) {
            byte var32 = 20;
            arg0.method5449(class300.field3687, field897 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class430.method6959(field897 + 180 - 152, var33, 304, 34, 9179409);
            class430.method6959(field897 + 180 - 151, var33 + 1, 302, 32, 0);
            class430.method6958(field897 + 180 - 150, var33 + 2, field900 * 3, 30, 9179409);
            class430.method6958(field900 * 3 + (field897 + 180 - 150), var33 + 2, 300 - field900 * 3, 30, 0);
            arg0.method5449(field899, field897 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field731 == 20) {
            Statics.field891.method7034(field897 + 180 - Statics.field891.field4595 / 2, 271 - Statics.field891.field4600 / 2);
            short var34 = 201;
            arg0.method5449(field906, field897 + 180, var34, 16776960, 0);
            int var150 = var34 + 15;
            arg0.method5449(field893, field897 + 180, var150, 16776960, 0);
            int var151 = var150 + 15;
            arg0.method5449(field908, field897 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            int var153 = var152 + 7;
            if (field904 != 4 && field904 != 10) {
                arg0.method5446(class300.field3653, field897 + 180 - 110, var153, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method3257(); arg0.method5441(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method5446(class333.method5477(var36), field897 + 180 - 70, var153, 16777215, 0);
                var150 = var153 + 15;
                String var37 = field910;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                String var43;
                for (var43 = var41; arg0.method5441(var43) > var35; var43 = var43.substring(1)) {
                }
                arg0.method5446(class300.field3541 + var43, field897 + 180 - 108, var150, 16777215, 0);
                var150 += 15;
            }
        }
        if (client.field731 == 10 || client.field731 == 11 || client.field731 == 50) {
            Statics.field891.method7034(field897, 171);
            if (field904 == 0) {
                short var44 = 251;
                arg0.method5449(class300.field3778, field897 + 180, var44, 16776960, 0);
                int var154 = var44 + 30;
                int var45 = field897 + 180 - 80;
                short var46 = 291;
                Statics.field3076.method7034(var45 - 73, var46 - 20);
                arg0.method5519(class300.field3579, var45 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var47 = field897 + 180 + 80;
                Statics.field3076.method7034(var47 - 73, var46 - 20);
                arg0.method5519(class300.field3780, var47 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field904 == 1) {
                arg0.method5449(field905, field897 + 180, 201, 16776960, 0);
                short var48 = 236;
                arg0.method5449(field906, field897 + 180, var48, 16777215, 0);
                int var155 = var48 + 15;
                arg0.method5449(field893, field897 + 180, var155, 16777215, 0);
                int var156 = var155 + 15;
                arg0.method5449(field908, field897 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                int var49 = field897 + 180 - 80;
                short var50 = 321;
                Statics.field3076.method7034(var49 - 73, var50 - 20);
                arg0.method5449(class300.field3817, var49, var50 + 5, 16777215, 0);
                int var51 = field897 + 180 + 80;
                Statics.field3076.method7034(var51 - 73, var50 - 20);
                arg0.method5449(class300.field3782, var51, var50 + 5, 16777215, 0);
            } else if (field904 == 2) {
                short var52 = 201;
                arg0.method5449(field906, Statics.field17, var52, 16776960, 0);
                int var158 = var52 + 15;
                arg0.method5449(field893, Statics.field17, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg0.method5449(field908, Statics.field17, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var161 = var160 + 7;
                arg0.method5446(class300.field3653, Statics.field17 - 110, var161, 16777215, 0);
                short var53 = 200;
                String var54;
                for (var54 = method3257(); arg0.method5441(var54) > var53; var54 = var54.substring(1)) {
                }
                arg0.method5446(class333.method5477(var54) + (field916 == 0 & client.field682 % 40 < 20 ? Statics.method2088(16776960) + class92.field1250 : ""), Statics.field17 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                String var55 = field910;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                String var61;
                for (var61 = var59; arg0.method5441(var61) > var53; var61 = var61.substring(1)) {
                }
                arg0.method5446(class300.field3541 + var61 + (field916 == 1 & client.field682 % 40 < 20 ? Statics.method2088(16776960) + class92.field1250 : ""), Statics.field17 - 108, var158, 16777215, 0);
                var158 += 15;
                short var62 = 277;
                int var63 = Statics.field17 + -117;
                class433 var64 = method6132(client.field720, field913);
                var64.method7034(var63, var62);
                int var65 = var64.field4595 + 5 + var63;
                arg1.method5446(class300.field3619, var65, var62 + 13, 16776960, 0);
                int var66 = Statics.field17 + 24;
                boolean var67 = Statics.field4567.field1227;
                boolean var68 = field914;
                class433 var69 = var67 ? (var68 ? Statics.field4221 : Statics.field2) : (var68 ? Statics.field1639 : Statics.field976);
                var69.method7034(var66, var62);
                int var71 = var69.field4595 + 5 + var66;
                arg1.method5446(class300.field3784, var71, var62 + 13, 16776960, 0);
                int var162 = var62 + 15;
                int var72 = Statics.field17 - 80;
                short var73 = 321;
                Statics.field3076.method7034(var72 - 73, var73 - 20);
                arg0.method5449(class300.field3804, var72, var73 + 5, 16777215, 0);
                int var74 = Statics.field17 + 80;
                Statics.field3076.method7034(var74 - 73, var73 - 20);
                arg0.method5449(class300.field3782, var74, var73 + 5, 16777215, 0);
                short var75 = 357;
                switch(field919) {
                    case 2:
                        Statics.field4267 = class300.field3796;
                        break;
                    default:
                        Statics.field4267 = class300.field3559;
                }
                Statics.field26 = new class368(Statics.field17, var75, arg1.method5441(Statics.field4267), 11);
                Statics.field1108 = new class368(Statics.field17, var75, arg1.method5441(class300.field3795), 11);
                arg1.method5449(Statics.field4267, Statics.field17, var75, 16777215, 0);
            } else if (field904 == 3) {
                short var76 = 201;
                arg0.method5449(class300.field3785, field897 + 180, var76, 16776960, 0);
                int var163 = var76 + 20;
                arg1.method5449(class300.field3786, field897 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                arg1.method5449(class300.field3787, field897 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                int var77 = field897 + 180;
                short var78 = 276;
                Statics.field3076.method7034(var77 - 73, var78 - 20);
                arg2.method5449(class300.field3788, var77, var78 + 5, 16777215, 0);
                int var79 = field897 + 180;
                short var80 = 326;
                Statics.field3076.method7034(var79 - 73, var80 - 20);
                arg2.method5449(class300.field3628, var79, var80 + 5, 16777215, 0);
            } else if (field904 == 4) {
                arg0.method5449(class300.field3751, field897 + 180, 201, 16776960, 0);
                short var81 = 236;
                arg0.method5449(field906, field897 + 180, var81, 16777215, 0);
                int var166 = var81 + 15;
                arg0.method5449(field893, field897 + 180, var166, 16777215, 0);
                int var167 = var166 + 15;
                arg0.method5449(field908, field897 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                String var83 = class300.field3777;
                String var84 = Statics.field1653;
                int var85 = var84.length();
                char[] var86 = new char[var85];
                for (int var87 = 0; var87 < var85; var87++) {
                    var86[var87] = '*';
                }
                String var88 = new String(var86);
                arg0.method5446(var83 + var88 + (client.field682 % 40 < 20 ? Statics.method2088(16776960) + class92.field1250 : ""), field897 + 180 - 108, var168, 16777215, 0);
                var166 = var168 - 8;
                arg0.method5446(class300.field3533, field897 + 180 - 9, var166, 16776960, 0);
                var166 += 15;
                arg0.method5446(class300.field3534, field897 + 180 - 9, var166, 16776960, 0);
                int var90 = field897 + 180 - 9 + arg0.method5441(class300.field3534) + 15;
                int var91 = var166 - arg0.field4045;
                class433 var92;
                if (field894) {
                    var92 = Statics.field2;
                } else {
                    var92 = Statics.field976;
                }
                var92.method7034(var90, var91);
                var166 += 15;
                int var93 = field897 + 180 - 80;
                short var94 = 321;
                Statics.field3076.method7034(var93 - 73, var94 - 20);
                arg0.method5449(class300.field3817, var93, var94 + 5, 16777215, 0);
                int var95 = field897 + 180 + 80;
                Statics.field3076.method7034(var95 - 73, var94 - 20);
                arg0.method5449(class300.field3782, var95, var94 + 5, 16777215, 0);
                arg1.method5449(class300.field3765, field897 + 180, var94 + 36, 255, 0);
            } else if (field904 == 5) {
                arg0.method5449(class300.field3790, field897 + 180, 201, 16776960, 0);
                short var96 = 221;
                arg2.method5449(field906, field897 + 180, var96, 16776960, 0);
                int var169 = var96 + 15;
                arg2.method5449(field893, field897 + 180, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg2.method5449(field908, field897 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                int var172 = var171 + 14;
                arg0.method5446(class300.field3791, field897 + 180 - 145, var172, 16777215, 0);
                short var97 = 174;
                String var98;
                for (var98 = method3257(); arg0.method5441(var98) > var97; var98 = var98.substring(1)) {
                }
                arg0.method5446(class333.method5477(var98) + (client.field682 % 40 < 20 ? Statics.method2088(16776960) + class92.field1250 : ""), field897 + 180 - 34, var172, 16777215, 0);
                var169 = var172 + 15;
                int var99 = field897 + 180 - 80;
                short var100 = 321;
                Statics.field3076.method7034(var99 - 73, var100 - 20);
                arg0.method5449(class300.field3603, var99, var100 + 5, 16777215, 0);
                int var101 = field897 + 180 + 80;
                Statics.field3076.method7034(var101 - 73, var100 - 20);
                arg0.method5449(class300.field3828, var101, var100 + 5, 16777215, 0);
                short var102 = 356;
                arg1.method5449(class300.field3795, Statics.field17, var102, 268435455, 0);
            } else if (field904 == 6) {
                short var103 = 201;
                arg0.method5449(field906, field897 + 180, var103, 16776960, 0);
                int var173 = var103 + 15;
                arg0.method5449(field893, field897 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                arg0.method5449(field908, field897 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                int var104 = field897 + 180;
                short var105 = 321;
                Statics.field3076.method7034(var104 - 73, var105 - 20);
                arg0.method5449(class300.field3828, var104, var105 + 5, 16777215, 0);
            } else if (field904 == 7) {
                if (Statics.field3086 && !client.field544) {
                    short var106 = 201;
                    arg0.method5449(field906, Statics.field17, var106, 16776960, 0);
                    int var176 = var106 + 15;
                    arg0.method5449(field893, Statics.field17, var176, 16776960, 0);
                    int var177 = var176 + 15;
                    arg0.method5449(field908, Statics.field17, var177, 16776960, 0);
                    int var107 = Statics.field17 - 150;
                    int var178 = var177 + 10;
                    for (int var108 = 0; var108 < 8; var108++) {
                        Statics.field3076.method7036(var107, var178, 30, 40);
                        boolean var109 = field911 == var108 & client.field682 % 40 < 20;
                        arg0.method5446((field912[var108] == null ? "" : field912[var108]) + (var109 ? Statics.method2088(16776960) + class92.field1250 : ""), var107 + 10, var178 + 27, 16777215, 0);
                        if (var108 == 1 || var108 == 3) {
                            var107 += 50;
                            arg0.method5446(class333.method5477("/"), var107 - 13, var178 + 27, 16777215, 0);
                        } else {
                            var107 += 35;
                        }
                    }
                    int var110 = Statics.field17 - 80;
                    short var111 = 321;
                    Statics.field3076.method7034(var110 - 73, var111 - 20);
                    arg0.method5449("Submit", var110, var111 + 5, 16777215, 0);
                    int var112 = Statics.field17 + 80;
                    Statics.field3076.method7034(var112 - 73, var111 - 20);
                    arg0.method5449(class300.field3782, var112, var111 + 5, 16777215, 0);
                } else {
                    short var113 = 216;
                    arg0.method5449(class300.field3548, field897 + 180, var113, 16776960, 0);
                    int var179 = var113 + 15;
                    arg2.method5449(class300.field3822, field897 + 180, var179, 16776960, 0);
                    int var180 = var179 + 15;
                    arg2.method5449(class300.field3823, field897 + 180, var180, 16776960, 0);
                    int var181 = var180 + 15;
                    int var114 = field897 + 180 - 80;
                    short var115 = 321;
                    Statics.field3076.method7034(var114 - 73, var115 - 20);
                    arg0.method5449(class300.field3824, var114, var115 + 5, 16777215, 0);
                    int var116 = field897 + 180 + 80;
                    Statics.field3076.method7034(var116 - 73, var115 - 20);
                    arg0.method5449(class300.field3828, var116, var115 + 5, 16777215, 0);
                }
            } else if (field904 == 8) {
                short var117 = 216;
                arg0.method5449(class300.field3783, field897 + 180, var117, 16776960, 0);
                int var182 = var117 + 15;
                arg2.method5449(class300.field3663, field897 + 180, var182, 16776960, 0);
                int var183 = var182 + 15;
                arg2.method5449(class300.field3664, field897 + 180, var183, 16776960, 0);
                int var184 = var183 + 15;
                int var118 = field897 + 180 - 80;
                short var119 = 321;
                Statics.field3076.method7034(var118 - 73, var119 - 20);
                arg0.method5449(class300.field3634, var118, var119 + 5, 16777215, 0);
                int var120 = field897 + 180 + 80;
                Statics.field3076.method7034(var120 - 73, var119 - 20);
                arg0.method5449(class300.field3828, var120, var119 + 5, 16777215, 0);
            } else if (field904 == 9) {
                short var121 = 221;
                arg0.method5449(field906, field897 + 180, var121, 16776960, 0);
                int var185 = var121 + 25;
                arg0.method5449(field893, field897 + 180, var185, 16776960, 0);
                int var186 = var185 + 25;
                arg0.method5449(field908, field897 + 180, var186, 16776960, 0);
                int var122 = field897 + 180;
                short var123 = 311;
                Statics.field3076.method7034(var122 - 73, var123 - 20);
                arg0.method5449(class300.field3788, var122, var123 + 5, 16777215, 0);
            } else if (field904 == 10) {
                int var124 = field897 + 180;
                short var125 = 209;
                arg0.method5449(class300.field3778, field897 + 180, var125, 16776960, 0);
                int var187 = var125 + 20;
                Statics.field895.method7034(var124 - 109, var187);
                Statics.field1614.method7034(var124 - 48, var187 + 18);
            } else if (field904 == 12) {
                int var126 = Statics.field17;
                short var127 = 216;
                arg2.method5449(class300.field3825, var126, var127, 16777215, 0);
                int var188 = var127 + 17;
                arg2.method5449(class300.field3826, var126, var188, 16777215, 0);
                int var189 = var188 + 17;
                arg2.method5449(class300.field3827, var126, var189, 16777215, 0);
                int var190 = var189 + 17;
                arg2.method5449(class300.field3557, var126, var190, 16777215, 0);
                int var128 = Statics.field17 - 80;
                short var129 = 311;
                Statics.field3076.method7034(var128 - 73, var129 - 20);
                arg0.method5449(class300.field3831, var128, var129 + 5, 16777215, 0);
                int var130 = Statics.field17 + 80;
                Statics.field3076.method7034(var130 - 73, var129 - 20);
                arg0.method5449(class300.field3832, var130, var129 + 5, 16777215, 0);
            } else if (field904 == 13) {
                short var131 = 231;
                arg2.method5449(class300.field3625, field897 + 180, var131, 16777215, 0);
                int var191 = var131 + 20;
                arg2.method5449(class300.field3830, field897 + 180, var191, 16777215, 0);
                int var132 = field897 + 180;
                short var133 = 311;
                Statics.field3076.method7034(var132 - 73, var133 - 20);
                arg0.method5449(class300.field3828, var132, var133 + 5, 16777215, 0);
            } else if (field904 == 14) {
                short var134 = 201;
                String var135 = "";
                String var136 = "";
                String var137 = "";
                switch(field915) {
                    case 0:
                        var135 = class300.field3665;
                        var136 = class300.field3635;
                        var137 = class300.field3776;
                        break;
                    case 1:
                        var135 = class300.field3617;
                        var136 = class300.field3764;
                        var137 = class300.field3712;
                        break;
                    default:
                        method5019(false);
                }
                arg0.method5449(var135, field897 + 180, var134, 16776960, 0);
                int var192 = var134 + 15;
                arg2.method5449(var136, field897 + 180, var192, 16776960, 0);
                int var193 = var192 + 15;
                arg2.method5449(var137, field897 + 180, var193, 16776960, 0);
                int var194 = var193 + 15;
                int var138 = field897 + 180;
                short var139 = 276;
                Statics.field3076.method7034(var138 - 73, var139 - 20);
                arg0.method5449(class300.field3562, var138, var139 + 5, 16777215, 0);
                int var140 = field897 + 180;
                short var141 = 326;
                Statics.field3076.method7034(var140 - 73, var141 - 20);
                arg0.method5449(class300.field3828, var140, var141 + 5, 16777215, 0);
            } else if (field904 == 24) {
                short var142 = 221;
                arg0.method5449(field906, field897 + 180, var142, 16777215, 0);
                int var195 = var142 + 15;
                arg0.method5449(field893, field897 + 180, var195, 16777215, 0);
                int var196 = var195 + 15;
                arg0.method5449(field908, field897 + 180, var196, 16777215, 0);
                int var197 = var196 + 15;
                int var143 = field897 + 180;
                short var144 = 301;
                Statics.field3076.method7034(var143 - 73, var144 - 20);
                arg0.method5449(class300.field3528, var143, var144 + 5, 16777215, 0);
            }
        }
        if (client.field731 >= 10) {
            int[] var145 = new int[4];
            class430.method6990(var145);
            class430.method6950(field892, 0, field892 + 765, Statics.field1246);
            Statics.field896.method2077(field892 - 22, client.field682);
            Statics.field896.method2077(field892 + 765 + 22 - 128, client.field682);
            class430.method6957(var145);
        }
        Statics.field4245[Statics.field4567.field1222 ? 1 : 0].method7034(field892 + 765 - 40, 463);
        if (client.field731 <= 5 || Statics.field1503 != class322.field3989) {
            return;
        }
        if (Statics.field3231 == null) {
            Statics.field3231 = class435.method2155(Statics.field481, "sl_button", "");
            return;
        }
        int var146 = field892 + 5;
        short var147 = 463;
        byte var148 = 100;
        byte var149 = 35;
        Statics.field3231.method7034(var146, var147);
        arg0.method5449(class300.field3702 + " " + client.field496, var148 / 2 + var146, var149 / 2 + var147 - 2, 16777215, 0);
        if (Statics.field2773 == null) {
            arg1.method5449(class300.field3779, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        } else {
            arg1.method5449(class300.field3662, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cv.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2337(String arg0, String arg1, String arg2) {
        field906 = arg0;
        field893 = arg1;
        field908 = arg2;
    }

    @ObfuscatedName("cf.m(Lbi;B)V")
    public static void method1984(class61 arg0) {
        if (arg0.method1542() != client.field669) {
            client.field669 = arg0.method1542();
            class181.method2511(arg0.method1542());
        }
        if (client.field770 != arg0.field796) {
            method2612(Statics.field481, arg0.field796);
        }
        Statics.field1243 = arg0.field798;
        client.field496 = arg0.field795;
        client.field770 = arg0.field796;
        Statics.field4124 = client.field539 == 0 ? 43594 : arg0.field795 + 40000;
        Statics.field3517 = client.field539 == 0 ? 443 : arg0.field795 + 50000;
        Statics.field3198 = Statics.field4124;
    }

    @ObfuscatedName("oi.d(I)V")
    public static void method6583() {
        if (class61.method40()) {
            field927 = true;
            field921 = 0;
            field922 = 0;
        }
    }

    @ObfuscatedName("dw.j(I)V")
    public static void method2566() {
        field927 = false;
        Statics.field3080.method7064(field892, 0);
        Statics.field810.method7064(field892 + 382, 0);
        Statics.field171.method7034(field892 + 382 - Statics.field171.field4595 / 2, 18);
    }

    @ObfuscatedName("nz.f(B)V")
    public static void method6113() {
        method2054(24);
        method2337(class300.field3685, class300.field3773, class300.field3618);
    }

    @ObfuscatedName("cw.g(IB)V")
    public static void method2054(int arg0) {
        if (field904 != arg0) {
            field904 = arg0;
        }
    }
}
