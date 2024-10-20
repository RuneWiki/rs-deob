package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("be")
public class class69 {

    @ObfuscatedName("be.f")
    public static int field913 = 0;

    @ObfuscatedName("be.y")
    public static int field898 = field913 + 202;

    @ObfuscatedName("be.r")
    public static int field906 = 10;

    @ObfuscatedName("be.z")
    public static String field900 = "";

    @ObfuscatedName("be.ae")
    public static int field903 = -1;

    @ObfuscatedName("be.aw")
    public static int field904 = 1;

    @ObfuscatedName("be.au")
    public static int field905 = 0;

    @ObfuscatedName("be.bg")
    public static String field927 = "";

    @ObfuscatedName("be.bw")
    public static String field907 = "";

    @ObfuscatedName("be.bc")
    public static String field916 = "";

    @ObfuscatedName("be.bv")
    public static String field909 = "";

    @ObfuscatedName("be.bi")
    public static String field910 = "";

    @ObfuscatedName("be.bj")
    public static String field912 = "";

    @ObfuscatedName("be.bz")
    public static int field892 = 0;

    @ObfuscatedName("be.bo")
    public static String[] field908 = new String[8];

    @ObfuscatedName("be.bt")
    public static boolean field926 = false;

    @ObfuscatedName("be.bb")
    public static boolean field921 = false;

    @ObfuscatedName("be.bq")
    public static boolean field917 = true;

    @ObfuscatedName("be.bu")
    public static int field918 = 0;

    @ObfuscatedName("be.bs")
    public static String field894 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("be.cy")
    public static String field920 = "1234567890";

    @ObfuscatedName("be.cf")
    public static boolean field899 = false;

    @ObfuscatedName("be.cu")
    public static int field922 = -1;

    @ObfuscatedName("be.cz")
    public static int field923 = 0;

    @ObfuscatedName("be.cr")
    public static int field924 = 0;

    @ObfuscatedName("be.ca")
    public static long field925;

    @ObfuscatedName("be.cx")
    public static long field919;

    @ObfuscatedName("be.cq")
    public static String[] field897;

    @ObfuscatedName("be.cp")
    public static String[] field928;

    static {
        new DecimalFormat("##0.00");
        new class122();
        field925 = -1L;
        field919 = -1L;
        field897 = new String[] { "title.jpg" };
        field928 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "logo_speedrunning", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.c(Llv;Llv;I)I")
    public static int method636(class317 arg0, class317 arg1) {
        int var2 = 0;
        String[] var3 = field897;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5431(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field928;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5431(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("cu.p(Llv;Llv;ZII)V")
    public static void method2267(class317 arg0, class317 arg1, boolean arg2, int arg3) {
        if (!Statics.field893) {
            if (arg3 == 0) {
                method1759(arg2);
            } else {
                method2876(arg3);
            }
            class454.method7491();
            byte[] var4 = arg0.method5501("title.jpg", "");
            Statics.field2516 = class29.method316(var4);
            Statics.field294 = Statics.field2516.method7592();
            method2218(arg1, client.field494);
            Statics.field895 = class459.method4687(arg1, "titlebox", "");
            Statics.field896 = class459.method4687(arg1, "titlebutton", "");
            Statics.field3332 = class459.method4687(arg1, "titlebutton_large", "");
            Statics.field1694 = class459.method4687(arg1, "play_now_text", "");
            class459.method4687(arg1, "titlebutton_wide42,1", "");
            Statics.field155 = class459.method5114(arg1, "runes", "");
            Statics.field4654 = class459.method5114(arg1, "title_mute", "");
            Statics.field2854 = class459.method4687(arg1, "options_radio_buttons,0", "");
            Statics.field325 = class459.method4687(arg1, "options_radio_buttons,4", "");
            Statics.field1380 = class459.method4687(arg1, "options_radio_buttons,2", "");
            Statics.field1429 = class459.method4687(arg1, "options_radio_buttons,6", "");
            Statics.field257 = Statics.field2854.field4818;
            Statics.field2875 = Statics.field2854.field4819;
            Statics.field2638 = new class89(Statics.field155);
            if (arg2) {
                field910 = "";
                field912 = "";
                field908 = new String[8];
                field892 = 0;
            }
            Statics.field4202 = 0;
            Statics.field167 = "";
            field917 = true;
            field899 = false;
            if (Statics.field1108.method2285()) {
                class275.method3111(2);
            } else {
                class315 var5 = Statics.field77;
                int var6 = var5.method5482("scape main");
                int var7 = var5.method5432(var6, "");
                class275.field3228 = 1;
                Statics.field3225 = var5;
                Statics.field3231 = var6;
                Statics.field2042 = var7;
                Statics.field3197 = 255;
                Statics.field4372 = false;
                Statics.field1871 = 2;
            }
            class318.method2735(false);
            Statics.field893 = true;
            field913 = (Statics.field1514 - 765) / 2;
            field898 = field913 + 202;
            Statics.field4157 = field898 + 180;
            Statics.field2516.method7602(field913, 0);
            Statics.field294.method7602(field913 + 382, 0);
            Statics.field1809.method7573(field913 + 382 - Statics.field1809.field4818 / 2, 18);
        } else if (arg3 == 4) {
            method2876(4);
        }
    }

    @ObfuscatedName("client.f(ZZI)Lqu;")
    public static class457 method1636(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1429 : Statics.field1380) : (arg1 ? Statics.field325 : Statics.field2854);
    }

    @ObfuscatedName("br.n(I)V")
    public static void method1747() {
        if (!Statics.field893) {
            return;
        }
        Statics.field895 = null;
        Statics.field896 = null;
        Statics.field155 = null;
        Statics.field2516 = null;
        Statics.field294 = null;
        Statics.field1809 = null;
        Statics.field4654 = null;
        Statics.field2854 = null;
        Statics.field1380 = null;
        Statics.field1064 = null;
        Statics.field258 = null;
        Statics.field1405 = null;
        Statics.field2018 = null;
        Statics.field46 = null;
        Statics.field2638.method2248();
        class275.method3111(2);
        class318.method2735(true);
        Statics.field893 = false;
    }

    @ObfuscatedName("cl.k(Llv;IS)V")
    public static void method2218(class317 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field1809 = class459.method4687(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) != 0) {
            Statics.field1809 = class459.method4687(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & 0x100) == 0) {
            Statics.field1809 = class459.method4687(arg0, "logo", "");
        } else {
            Statics.field1809 = class459.method4687(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("bk.w(B)V")
    public static void method1940() {
        if (client.field541 && field910 != null && field910.length() > 0) {
            field918 = 1;
        } else {
            field918 = 0;
        }
    }

    @ObfuscatedName("mj.s(Lai;Lmv;I)V")
    public static void method6080(class32 arg0, class351 arg1) {
        if (field899) {
            method2851(arg0);
            return;
        }
        if ((class33.field237 == 1 || !Statics.field2478 && class33.field237 == 4) && class33.field238 >= field913 + 765 - 50 && class33.field239 >= 453) {
            Statics.field1108.method2284(!Statics.field1108.method2285());
            if (Statics.field1108.method2285()) {
                class275.method261();
            } else {
                class315 var2 = Statics.field77;
                int var3 = var2.method5482("scape main");
                int var4 = var2.method5432(var3, "");
                class275.method1097(var2, var3, var4, 255, false);
            }
        }
        if (client.field612 == 5) {
            return;
        }
        if (field925 == -1L) {
            field925 = class271.method5624() + 1000L;
        }
        long var5 = class271.method5624();
        boolean var7;
        if (client.field568 == null || client.field785 >= client.field568.size()) {
            var7 = true;
        } else {
            while (true) {
                if (client.field785 >= client.field568.size()) {
                    var7 = true;
                    break;
                }
                class77 var8 = (class77) client.field568.get(client.field785);
                if (!var8.method2114()) {
                    var7 = false;
                    break;
                }
                client.field785++;
            }
        }
        if (var7 && field919 == -1L) {
            field919 = var5;
            if (field919 > field925) {
                field925 = field919;
            }
        }
        if (client.field612 != 10 && client.field612 != 11) {
            return;
        }
        if (Statics.field3203 == class332.field4149) {
            if (class33.field237 == 1 || !Statics.field2478 && class33.field237 == 4) {
                int var9 = field913 + 5;
                short var10 = 463;
                byte var11 = 100;
                byte var12 = 35;
                if (class33.field238 >= var9 && class33.field238 <= var9 + var11 && class33.field239 >= var10 && class33.field239 <= var10 + var12) {
                    if (class61.method2651()) {
                        field899 = true;
                        field923 = 0;
                        field924 = 0;
                    }
                    return;
                }
            }
            if (Statics.field2485 != null && class61.method2651()) {
                field899 = true;
                field923 = 0;
                field924 = 0;
            }
        }
        int var13 = class33.field237;
        int var14 = class33.field238;
        int var15 = class33.field239;
        if (var13 == 0) {
            var14 = class33.field232;
            var15 = class33.field231;
        }
        if (!Statics.field2478 && var13 == 4) {
            var13 = 1;
        }
        if (field905 == 0) {
            boolean var16 = false;
            while (class24.method402()) {
                if (Statics.field1666 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field4157 - 80;
            short var18 = 291;
            if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                class30.method3656(client.method2110("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field4157 + 80;
            if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                if ((client.field494 & 0x2000000) != 0) {
                    field927 = "";
                    field907 = class310.field3892;
                    field916 = class310.field3898;
                    field909 = class310.field3894;
                    method2876(1);
                    method1940();
                } else if ((client.field494 & 0x4) != 0) {
                    if ((client.field494 & 0x400) == 0) {
                        field907 = class310.field3858;
                        field916 = class310.field3949;
                        field909 = class310.field3885;
                    } else {
                        field907 = class310.field3794;
                        field916 = class310.field3867;
                        field909 = class310.field3891;
                    }
                    field927 = class310.field3882;
                    method2876(1);
                    method1940();
                } else if ((client.field494 & 0x400) == 0) {
                    method5105(false);
                } else {
                    field907 = class310.field3886;
                    field916 = class310.field3887;
                    field909 = class310.field3888;
                    field927 = class310.field3882;
                    method2876(1);
                    method1940();
                }
            }
        } else if (field905 == 1) {
            while (true) {
                if (!class24.method402()) {
                    int var20 = Statics.field4157 - 80;
                    short var21 = 321;
                    if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                        method5105(false);
                    }
                    int var22 = Statics.field4157 + 80;
                    if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                        method2876(0);
                    }
                    break;
                }
                if (Statics.field1666 == 84) {
                    method5105(false);
                } else if (Statics.field1666 == 13) {
                    method2876(0);
                }
            }
        } else if (field905 == 2) {
            short var23 = 201;
            int var118 = var23 + 52;
            if (var13 == 1 && var15 >= var118 - 12 && var15 < var118 + 2) {
                field918 = 0;
            }
            var118 += 15;
            if (var13 == 1 && var15 >= var118 - 12 && var15 < var118 + 2) {
                field918 = 1;
            }
            var118 += 15;
            short var24 = 361;
            if (Statics.field3196 != null) {
                int var25 = Statics.field3196.field4422 / 2;
                if (var13 == 1 && var14 >= Statics.field3196.field4421 - var25 && var14 <= Statics.field3196.field4421 + var25 && var15 >= var24 - 15 && var15 < var24) {
                    switch(field904) {
                        case 1:
                            method2109(class310.field3866, class310.field3964, class310.field3934);
                            method2876(5);
                            return;
                        case 2:
                            class30.method3656("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field4157 - 80;
            short var27 = 321;
            if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                field910 = field910.trim();
                if (field910.length() == 0) {
                    method2109(class310.field3775, class310.field3776, class310.field3777);
                    return;
                }
                if (field912.length() == 0) {
                    method2109(class310.field3778, class310.field3732, class310.field3780);
                    return;
                }
                method2109(class310.field3679, class310.field3709, class310.field3899);
                client.method2552(false);
                client.method5138(20);
                return;
            }
            int var28 = field898 + 180 + 80;
            if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                method2876(0);
                field910 = "";
                field912 = "";
                Statics.field4202 = 0;
                Statics.field167 = "";
                field917 = true;
            }
            int var29 = Statics.field4157 + -117;
            short var30 = 277;
            field926 = var14 >= var29 && var14 < Statics.field257 + var29 && var15 >= var30 && var15 < Statics.field2875 + var30;
            if (var13 == 1 && field926) {
                client.field541 = !client.field541;
                if (!client.field541 && Statics.field1108.method2299() != null) {
                    Statics.field1108.method2298((String) null);
                }
            }
            int var31 = Statics.field4157 + 24;
            short var32 = 277;
            field921 = var14 >= var31 && var14 < Statics.field257 + var31 && var15 >= var32 && var15 < Statics.field2875 + var32;
            if (var13 == 1 && field921) {
                Statics.field1108.method2282(!Statics.field1108.method2289());
                if (!Statics.field1108.method2289()) {
                    field910 = "";
                    Statics.field1108.method2298((String) null);
                    method1940();
                }
            }
            while (true) {
                Transferable var36;
                int var37;
                do {
                    while (true) {
                        label975: do {
                            while (true) {
                                while (class24.method402()) {
                                    if (Statics.field1666 == 13) {
                                        method2876(0);
                                        field910 = "";
                                        field912 = "";
                                        Statics.field4202 = 0;
                                        Statics.field167 = "";
                                        field917 = true;
                                    } else {
                                        if (field918 != 0) {
                                            continue label975;
                                        }
                                        char var33 = Statics.field2795;
                                        for (int var34 = 0; var34 < field894.length() && var33 != field894.charAt(var34); var34++) {
                                        }
                                        if (Statics.field1666 == 85 && field910.length() > 0) {
                                            field910 = field910.substring(0, field910.length() - 1);
                                        }
                                        if (Statics.field1666 == 84 || Statics.field1666 == 80) {
                                            field918 = 1;
                                        }
                                        if (method2766(Statics.field2795) && field910.length() < 320) {
                                            field910 = field910 + Statics.field2795;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field918 != 1);
                        if (Statics.field1666 == 85 && field912.length() > 0) {
                            field912 = field912.substring(0, field912.length() - 1);
                        } else if (Statics.field1666 == 84 || Statics.field1666 == 80) {
                            field918 = 0;
                            if (Statics.field1666 == 84) {
                                field910 = field910.trim();
                                if (field910.length() == 0) {
                                    method2109(class310.field3775, class310.field3776, class310.field3777);
                                    return;
                                }
                                if (field912.length() == 0) {
                                    method2109(class310.field3778, class310.field3732, class310.field3780);
                                    return;
                                }
                                method2109(class310.field3679, class310.field3709, class310.field3899);
                                client.method2552(false);
                                client.method5138(20);
                                return;
                            }
                        }
                        if ((class24.field123[82] || class24.field123[87]) && Statics.field1666 == 67) {
                            Clipboard var35 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var36 = var35.getContents(Statics.field4326);
                            var37 = 20 - field912.length();
                            break;
                        }
                        char var48 = Statics.field2795;
                        boolean var49;
                        if (var48 >= ' ' && var48 < 127 || var48 > 127 && var48 < 160 || var48 > 160 && var48 <= 255) {
                            var49 = true;
                        } else {
                            label1202: {
                                if (var48 != 0) {
                                    char[] var50 = class343.field4184;
                                    for (int var51 = 0; var51 < var50.length; var51++) {
                                        char var52 = var50[var51];
                                        if (var48 == var52) {
                                            var49 = true;
                                            break label1202;
                                        }
                                    }
                                }
                                var49 = false;
                            }
                        }
                        if (var49 && method2766(Statics.field2795) && field912.length() < 20) {
                            field912 = field912 + Statics.field2795;
                        }
                    }
                } while (var37 <= 0);
                try {
                    String var38 = (String) var36.getTransferData(DataFlavor.stringFlavor);
                    int var39 = Math.min(var37, var38.length());
                    for (int var40 = 0; var40 < var39; var40++) {
                        char var41 = var38.charAt(var40);
                        boolean var42;
                        if (var41 >= ' ' && var41 < 127 || var41 > 127 && var41 < 160 || var41 > 160 && var41 <= 255) {
                            var42 = true;
                        } else {
                            label1203: {
                                if (var41 != 0) {
                                    char[] var43 = class343.field4184;
                                    for (int var44 = 0; var44 < var43.length; var44++) {
                                        char var45 = var43[var44];
                                        if (var41 == var45) {
                                            var42 = true;
                                            break label1203;
                                        }
                                    }
                                }
                                var42 = false;
                            }
                        }
                        if (!var42 || !method2766(var38.charAt(var40))) {
                            method2876(3);
                            return;
                        }
                    }
                    field912 = field912 + var38.substring(0, var39);
                } catch (UnsupportedFlavorException var116) {
                } catch (IOException var117) {
                }
            }
        } else if (field905 == 3) {
            int var53 = field898 + 180;
            short var54 = 276;
            if (var13 == 1 && var14 >= var53 - 75 && var14 <= var53 + 75 && var15 >= var54 - 20 && var15 <= var54 + 20) {
                method1759(false);
            }
            int var55 = field898 + 180;
            short var56 = 326;
            if (var13 == 1 && var14 >= var55 - 75 && var14 <= var55 + 75 && var15 >= var56 - 20 && var15 <= var56 + 20) {
                method2109(class310.field3866, class310.field3964, class310.field3934);
                method2876(5);
                return;
            }
        } else if (field905 == 4) {
            int var57 = field898 + 180 - 80;
            short var58 = 321;
            if (var13 == 1 && var14 >= var57 - 75 && var14 <= var57 + 75 && var15 >= var58 - 20 && var15 <= var58 + 20) {
                Statics.field167.trim();
                if (Statics.field167.length() != 6) {
                    method2109(class310.field3725, class310.field3695, class310.field3696);
                    return;
                }
                Statics.field4202 = Integer.parseInt(Statics.field167);
                Statics.field167 = "";
                client.method2552(true);
                method2109(class310.field3679, class310.field3709, class310.field3899);
                client.method5138(20);
                return;
            }
            if (var13 == 1 && var14 >= field898 + 180 - 9 && var14 <= field898 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                field917 = !field917;
            }
            if (var13 == 1 && var14 >= field898 + 180 - 34 && var14 <= field898 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                class30.method3656(client.method2110("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var59 = field898 + 180 + 80;
            if (var13 == 1 && var14 >= var59 - 75 && var14 <= var59 + 75 && var15 >= var58 - 20 && var15 <= var58 + 20) {
                method2876(0);
                field910 = "";
                field912 = "";
                Statics.field4202 = 0;
                Statics.field167 = "";
            }
            while (class24.method402()) {
                boolean var60 = false;
                for (int var61 = 0; var61 < field920.length(); var61++) {
                    if (Statics.field2795 == field920.charAt(var61)) {
                        var60 = true;
                        break;
                    }
                }
                if (Statics.field1666 == 13) {
                    method2876(0);
                    field910 = "";
                    field912 = "";
                    Statics.field4202 = 0;
                    Statics.field167 = "";
                } else {
                    if (Statics.field1666 == 85 && Statics.field167.length() > 0) {
                        Statics.field167 = Statics.field167.substring(0, Statics.field167.length() - 1);
                    }
                    if (Statics.field1666 == 84) {
                        Statics.field167.trim();
                        if (Statics.field167.length() != 6) {
                            method2109(class310.field3725, class310.field3695, class310.field3696);
                            return;
                        }
                        Statics.field4202 = Integer.parseInt(Statics.field167);
                        Statics.field167 = "";
                        client.method2552(true);
                        method2109(class310.field3679, class310.field3709, class310.field3899);
                        client.method5138(20);
                        return;
                    }
                    if (var60 && Statics.field167.length() < 6) {
                        Statics.field167 = Statics.field167 + Statics.field2795;
                    }
                }
            }
        } else if (field905 == 5) {
            int var62 = field898 + 180 - 80;
            short var63 = 321;
            if (var13 == 1 && var14 >= var62 - 75 && var14 <= var62 + 75 && var15 >= var63 - 20 && var15 <= var63 + 20) {
                field910 = field910.trim();
                if (field910.length() == 0) {
                    method2109(class310.field3866, class310.field3964, class310.field3934);
                } else {
                    long var64 = class66.method624();
                    int var66;
                    if (var64 == 0L) {
                        var66 = 5;
                    } else {
                        var66 = class66.method179(var64, field910);
                    }
                    switch(var66) {
                        case 2:
                            method2109(class310.field3935, class310.field3856, class310.field3884);
                            method2876(6);
                            break;
                        case 3:
                            method2109(class310.field3938, class310.field3939, class310.field3940);
                            break;
                        case 4:
                            method2109(class310.field3941, class310.field3942, class310.field3819);
                            break;
                        case 5:
                            method2109(class310.field3944, class310.field3769, class310.field3946);
                            break;
                        case 6:
                            method2109(class310.field3694, class310.field3724, class310.field3824);
                            break;
                        case 7:
                            method2109(class310.field3808, class310.field3936, class310.field3952);
                    }
                }
                return;
            }
            int var67 = field898 + 180 + 80;
            if (var13 == 1 && var14 >= var67 - 75 && var14 <= var67 + 75 && var15 >= var63 - 20 && var15 <= var63 + 20) {
                method5105(true);
            }
            short var68 = 361;
            if (Statics.field958 != null) {
                int var69 = Statics.field958.field4422 / 2;
                if (var13 == 1 && var14 >= Statics.field958.field4421 - var69 && var14 <= Statics.field958.field4421 + var69 && var15 >= var68 - 15 && var15 < var68) {
                    class30.method3656(client.method2110("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method402()) {
                boolean var70 = false;
                for (int var71 = 0; var71 < field894.length(); var71++) {
                    if (Statics.field2795 == field894.charAt(var71)) {
                        var70 = true;
                        break;
                    }
                }
                if (Statics.field1666 == 13) {
                    method5105(true);
                } else {
                    if (Statics.field1666 == 85 && field910.length() > 0) {
                        field910 = field910.substring(0, field910.length() - 1);
                    }
                    if (Statics.field1666 == 84) {
                        field910 = field910.trim();
                        if (field910.length() == 0) {
                            method2109(class310.field3866, class310.field3964, class310.field3934);
                        } else {
                            long var72 = class66.method624();
                            int var74;
                            if (var72 == 0L) {
                                var74 = 5;
                            } else {
                                var74 = class66.method179(var72, field910);
                            }
                            switch(var74) {
                                case 2:
                                    method2109(class310.field3935, class310.field3856, class310.field3884);
                                    method2876(6);
                                    break;
                                case 3:
                                    method2109(class310.field3938, class310.field3939, class310.field3940);
                                    break;
                                case 4:
                                    method2109(class310.field3941, class310.field3942, class310.field3819);
                                    break;
                                case 5:
                                    method2109(class310.field3944, class310.field3769, class310.field3946);
                                    break;
                                case 6:
                                    method2109(class310.field3694, class310.field3724, class310.field3824);
                                    break;
                                case 7:
                                    method2109(class310.field3808, class310.field3936, class310.field3952);
                            }
                        }
                        return;
                    }
                    if (var70 && field910.length() < 320) {
                        field910 = field910 + Statics.field2795;
                    }
                }
            }
        } else if (field905 == 6) {
            while (true) {
                do {
                    if (!class24.method402()) {
                        short var75 = 321;
                        if (var13 == 1 && var15 >= var75 - 20 && var15 <= var75 + 20) {
                            method5105(true);
                        }
                        return;
                    }
                } while (Statics.field1666 != 84 && Statics.field1666 != 13);
                method5105(true);
            }
        } else if (field905 == 7) {
            if (Statics.field1388 && !client.field501) {
                int var76 = Statics.field4157 - 150;
                int var77 = var76 + 240 + 25 + 40;
                short var78 = 231;
                int var79 = var78 + 40;
                if (var13 == 1 && var14 >= var76 && var14 <= var77 && var15 >= var78 && var15 <= var79) {
                    field892 = method2135(var76, var14);
                }
                int var80 = field898 + 180 - 80;
                short var81 = 321;
                if (var13 == 1 && var14 >= var80 - 75 && var14 <= var80 + 75 && var15 >= var81 - 20 && var15 <= var81 + 20) {
                    boolean var82 = method3885();
                    if (var82) {
                        client.method5138(50);
                        return;
                    }
                }
                int var83 = field898 + 180 + 80;
                if (var13 == 1 && var14 >= var83 - 75 && var14 <= var83 + 75 && var15 >= var81 - 20 && var15 <= var81 + 20) {
                    field908 = new String[8];
                    method5105(true);
                }
                while (class24.method402()) {
                    if (Statics.field1666 == 101) {
                        field908[field892] = null;
                    }
                    if (Statics.field1666 == 85) {
                        if (field908[field892] == null && field892 > 0) {
                            field892--;
                        }
                        field908[field892] = null;
                    }
                    if (Statics.field2795 >= '0' && Statics.field2795 <= '9') {
                        field908[field892] = "" + Statics.field2795;
                        if (field892 < 7) {
                            field892++;
                        }
                    }
                    if (Statics.field1666 == 84) {
                        boolean var84 = method3885();
                        if (var84) {
                            client.method5138(50);
                        }
                        return;
                    }
                }
            } else {
                int var85 = field898 + 180 - 80;
                short var86 = 321;
                if (var13 == 1 && var14 >= var85 - 75 && var14 <= var85 + 75 && var15 >= var86 - 20 && var15 <= var86 + 20) {
                    class30.method3656(client.method2110("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2109(class310.field3937, class310.field3930, class310.field3955);
                    method2876(6);
                    return;
                }
                int var87 = field898 + 180 + 80;
                if (var13 == 1 && var14 >= var87 - 75 && var14 <= var87 + 75 && var15 >= var86 - 20 && var15 <= var86 + 20) {
                    method5105(true);
                }
            }
        } else if (field905 == 8) {
            int var88 = field898 + 180 - 80;
            short var89 = 321;
            if (var13 == 1 && var14 >= var88 - 75 && var14 <= var88 + 75 && var15 >= var89 - 20 && var15 <= var89 + 20) {
                class30.method3656("https://www.jagex.com/terms/privacy", true, false);
                method2109(class310.field3937, class310.field3930, class310.field3955);
                method2876(6);
                return;
            }
            int var90 = field898 + 180 + 80;
            if (var13 == 1 && var14 >= var90 - 75 && var14 <= var90 + 75 && var15 >= var89 - 20 && var15 <= var89 + 20) {
                method5105(true);
            }
        } else if (field905 == 9) {
            int var91 = field898 + 180;
            short var92 = 311;
            if (Statics.field1666 == 84 || Statics.field1666 == 13 || var13 == 1 && var14 >= var91 - 75 && var14 <= var91 + 75 && var15 >= var92 - 20 && var15 <= var92 + 20) {
                method1759(false);
            }
        } else if (field905 == 10) {
            int var93 = field898 + 180;
            short var94 = 209;
            if (Statics.field1666 == 84 || var13 == 1 && var14 >= var93 - 109 && var14 <= var93 + 109 && var15 >= var94 && var15 <= var94 + 68) {
                method2109(class310.field3679, class310.field3709, class310.field3899);
                client.field640 = class449.field4786;
                client.method2552(false);
                client.method5138(20);
            }
        } else if (field905 == 12) {
            int var95 = Statics.field4157;
            short var96 = 233;
            class386 var97 = arg1.method5946(0, 30, class310.field3961, var95, var96);
            class386 var98 = arg1.method5946(32, 32, class310.field3961, var95, var96);
            class386 var99 = arg1.method5946(70, 34, class310.field3961, var95, var96);
            int var119 = var96 + 17;
            class386 var100 = arg1.method5946(0, 34, class310.field3962, var95, var119);
            if (var13 == 1) {
                if (var97.method6442(var14, var15)) {
                    class30.method3656("https://www.jagex.com/terms", true, false);
                } else if (var98.method6442(var14, var15)) {
                    class30.method3656("https://www.jagex.com/terms/privacy", true, false);
                } else if (var99.method6442(var14, var15) || var100.method6442(var14, var15)) {
                    class30.method3656("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var101 = Statics.field4157 - 80;
            short var102 = 311;
            if (var13 == 1 && var14 >= var101 - 75 && var14 <= var101 + 75 && var15 >= var102 - 20 && var15 <= var102 + 20) {
                Statics.field1108.method2300(client.field498);
                method1759(true);
            }
            int var103 = Statics.field4157 + 80;
            if (var13 == 1 && var14 >= var103 - 75 && var14 <= var103 + 75 && var15 >= var102 - 20 && var15 <= var102 + 20) {
                field905 = 13;
            }
        } else if (field905 == 13) {
            int var104 = Statics.field4157;
            short var105 = 321;
            if (var13 == 1 && var14 >= var104 - 75 && var14 <= var104 + 75 && var15 >= var105 - 20 && var15 <= var105 + 20) {
                method1759(true);
            }
        } else if (field905 == 14) {
            String var106 = "";
            switch(field903) {
                case 0:
                    var106 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var106 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                case 2:
                    var106 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method5105(false);
            }
            int var107 = field898 + 180;
            short var108 = 276;
            if (var13 == 1 && var14 >= var107 - 75 && var14 <= var107 + 75 && var15 >= var108 - 20 && var15 <= var108 + 20) {
                class30.method3656(var106, true, false);
                method2109(class310.field3937, class310.field3930, class310.field3955);
                method2876(6);
                return;
            }
            int var109 = field898 + 180;
            short var110 = 326;
            if (var13 == 1 && var14 >= var109 - 75 && var14 <= var109 + 75 && var15 >= var110 - 20 && var15 <= var110 + 20) {
                method5105(false);
            }
        } else if (field905 == 24) {
            int var111 = field898 + 180;
            short var112 = 301;
            if (var13 == 1 && var14 >= var111 - 75 && var14 <= var111 + 75 && var15 >= var112 - 20 && var15 <= var112 + 20) {
                method1759(false);
            }
        } else if (field905 == 26) {
            int var113 = field898 + 180 - 80;
            short var114 = 321;
            if (var13 == 1 && var14 >= var113 - 75 && var14 <= var113 + 75 && var15 >= var114 - 20 && var15 <= var114 + 20) {
                class30.method3656(client.method2110("secure", true) + "m=dob/set_dob.ws", true, false);
                method2109(class310.field3937, class310.field3930, class310.field3955);
                method2876(6);
                return;
            }
            int var115 = field898 + 180 + 80;
            if (var13 == 1 && var14 >= var115 - 75 && var14 <= var115 + 75 && var15 >= var114 - 20 && var15 <= var114 + 20) {
                method5105(true);
            }
        }
    }

    @ObfuscatedName("gm.q(I)Z")
    public static boolean method3885() {
        Date var6;
        try {
            SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
            var0.setLenient(false);
            StringBuilder var1 = new StringBuilder();
            String[] var2 = field908;
            int var3 = 0;
            while (true) {
                Date var5;
                if (var3 < var2.length) {
                    String var4 = var2[var3];
                    if (var4 != null) {
                        var1.append(var4);
                        var3++;
                        continue;
                    }
                    method2876(7);
                    method2109("Date not valid.", "Please ensure all characters are populated.", "");
                    var5 = null;
                } else {
                    var1.append("12");
                    var5 = var0.parse(var1.toString());
                }
                var6 = var5;
                break;
            }
        } catch (ParseException var13) {
            method2876(7);
            method2109("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var6 == null) {
            return false;
        }
        Calendar var8 = Calendar.getInstance();
        var8.set(1, var8.get(1) - 13);
        var8.set(5, var8.get(5) + 1);
        var8.set(11, 0);
        var8.set(12, 0);
        var8.set(13, 0);
        var8.set(14, 0);
        Date var9 = var8.getTime();
        boolean var10 = var6.before(var9);
        boolean var12 = method47(var6);
        if (!var12) {
            method2876(7);
            method2109("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var10) {
            Statics.field3224 = (int) (var6.getTime() / 86400000L - 11745L);
        } else {
            Statics.field3224 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("s.m(Ljava/util/Date;B)Z")
    public static boolean method47(Date arg0) {
        Date var1 = method2872();
        return arg0.after(var1);
    }

    @ObfuscatedName("ep.x(B)Ljava/util/Date;")
    public static Date method2872() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("bs.j(III)I")
    public static int method2135(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("di.v(CI)Z")
    public static boolean method2766(char arg0) {
        return field894.indexOf(arg0) != -1;
    }

    @ObfuscatedName("je.h(ZI)V")
    public static void method5105(boolean arg0) {
        if (Statics.field4326.method1123() || Statics.field4326.method1124()) {
            method2876(10);
            return;
        }
        field907 = class310.field3768;
        field916 = class310.field3880;
        field909 = class310.field3881;
        method2876(2);
        if (arg0) {
            field912 = "";
        }
        if (field910 == null || field910.length() <= 0) {
            if (Statics.field1108.method2299() == null) {
                client.field541 = false;
            } else {
                field910 = Statics.field1108.method2299();
                client.field541 = true;
            }
        }
        method1940();
    }

    @ObfuscatedName("bp.t(ZB)V")
    public static void method1759(boolean arg0) {
        byte var1 = 0;
        if (!client.method5880()) {
            var1 = 12;
        } else if (Statics.field4326.method1123() || Statics.field4326.method1124()) {
            var1 = 10;
        }
        method2876(var1);
        if (arg0) {
            field910 = "";
            field912 = "";
            Statics.field4202 = 0;
            Statics.field167 = "";
        }
        if (field910 == null || field910.length() <= 0) {
            if (Statics.field1108.method2299() == null) {
                client.field541 = false;
            } else {
                field910 = Statics.field1108.method2299();
                client.field541 = true;
            }
        }
        method1940();
    }

    @ObfuscatedName("hz.u(Lmv;Lmv;Lmv;I)V")
    public static void method4290(class351 arg0, class351 arg1, class351 arg2) {
        field913 = (Statics.field1514 - 765) / 2;
        field898 = field913 + 202;
        Statics.field4157 = field898 + 180;
        if (field899) {
            if (Statics.field1064 == null) {
                class315 var3 = Statics.field990;
                int var4 = var3.method5482("sl_back");
                int var5 = var3.method5432(var4, "");
                class458[] var6 = class459.method7564(var3, var4, var5);
                Statics.field1064 = var6;
            }
            if (Statics.field258 == null) {
                Statics.field258 = class459.method5114(Statics.field990, "sl_flags", "");
            }
            if (Statics.field1405 == null) {
                Statics.field1405 = class459.method5114(Statics.field990, "sl_arrows", "");
            }
            if (Statics.field2018 == null) {
                Statics.field2018 = class459.method5114(Statics.field990, "sl_stars", "");
            }
            if (Statics.field2863 == null) {
                Statics.field2863 = class459.method4687(Statics.field990, "leftarrow", "");
            }
            if (Statics.field76 == null) {
                Statics.field76 = class459.method4687(Statics.field990, "rightarrow", "");
            }
            class454.method7518(field913, 23, 765, 480, 0);
            class454.method7496(field913, 0, 125, 23, 12425273, 9135624);
            class454.method7496(field913 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5955(class310.field3897, field913 + 62, 15, 0, -1);
            if (Statics.field2018 != null) {
                Statics.field2018[1].method7573(field913 + 140, 1);
                arg1.method5953(class310.field3969, field913 + 152, 10, 16777215, -1);
                Statics.field2018[0].method7573(field913 + 140, 12);
                arg1.method5953(class310.field3970, field913 + 152, 21, 16777215, -1);
            }
            if (Statics.field1405 != null) {
                int var7 = field913 + 280;
                if (class61.field799[0] == 0 && class61.field798[0] == 0) {
                    Statics.field1405[2].method7573(var7, 4);
                } else {
                    Statics.field1405[0].method7573(var7, 4);
                }
                if (class61.field799[0] == 0 && class61.field798[0] == 1) {
                    Statics.field1405[3].method7573(var7 + 15, 4);
                } else {
                    Statics.field1405[1].method7573(var7 + 15, 4);
                }
                arg0.method5953(class310.field3655, var7 + 32, 17, 16777215, -1);
                int var8 = field913 + 390;
                if (class61.field799[0] == 1 && class61.field798[0] == 0) {
                    Statics.field1405[2].method7573(var8, 4);
                } else {
                    Statics.field1405[0].method7573(var8, 4);
                }
                if (class61.field799[0] == 1 && class61.field798[0] == 1) {
                    Statics.field1405[3].method7573(var8 + 15, 4);
                } else {
                    Statics.field1405[1].method7573(var8 + 15, 4);
                }
                arg0.method5953(class310.field3972, var8 + 32, 17, 16777215, -1);
                int var9 = field913 + 500;
                if (class61.field799[0] == 2 && class61.field798[0] == 0) {
                    Statics.field1405[2].method7573(var9, 4);
                } else {
                    Statics.field1405[0].method7573(var9, 4);
                }
                if (class61.field799[0] == 2 && class61.field798[0] == 1) {
                    Statics.field1405[3].method7573(var9 + 15, 4);
                } else {
                    Statics.field1405[1].method7573(var9 + 15, 4);
                }
                arg0.method5953(class310.field3779, var9 + 32, 17, 16777215, -1);
                int var10 = field913 + 610;
                if (class61.field799[0] == 3 && class61.field798[0] == 0) {
                    Statics.field1405[2].method7573(var10, 4);
                } else {
                    Statics.field1405[0].method7573(var10, 4);
                }
                if (class61.field799[0] == 3 && class61.field798[0] == 1) {
                    Statics.field1405[3].method7573(var10 + 15, 4);
                } else {
                    Statics.field1405[1].method7573(var10 + 15, 4);
                }
                arg0.method5953(class310.field3974, var10 + 32, 17, 16777215, -1);
            }
            class454.method7518(field913 + 708, 4, 50, 16, 0);
            arg1.method5955(class310.field3913, field913 + 708 + 25, 16, 16777215, -1);
            field922 = -1;
            if (Statics.field1064 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class61.field796) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class61.field796) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class61.field796) {
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
                int var21 = (class61.field796 + var14 - 1) / var14;
                field924 = var21 - var13;
                if (Statics.field2863 != null && field923 > 0) {
                    Statics.field2863.method7573(8, Statics.field1825 / 2 - Statics.field2863.field4819 / 2);
                }
                if (Statics.field76 != null && field923 < field924) {
                    Statics.field76.method7573(Statics.field1514 - Statics.field76.field4818 - 8, Statics.field1825 / 2 - Statics.field76.field4819 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field913 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field923;
                for (int var27 = var14 * var26; var27 < class61.field796 && var26 - field923 < var13; var27++) {
                    class61 var28 = Statics.field795[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field802);
                    if (var28.field802 == -1) {
                        var30 = class310.field3893;
                        var29 = false;
                    } else if (var28.field802 > 1980) {
                        var30 = class310.field3976;
                        var29 = false;
                    }
                    int var31 = 0;
                    int var32;
                    if (var28.method1644()) {
                        if (var28.method1676()) {
                            var32 = class98.field1306.field1320;
                        } else {
                            var32 = class98.field1313.field1320;
                        }
                    } else if (var28.method1681()) {
                        var31 = 16711680;
                        if (var28.method1676()) {
                            var32 = class98.field1312.field1320;
                        } else {
                            var32 = class98.field1310.field1320;
                        }
                    } else if (var28.method1650()) {
                        if (var28.method1676()) {
                            var32 = class98.field1315.field1320;
                        } else {
                            var32 = class98.field1311.field1320;
                        }
                    } else if (var28.method1641()) {
                        if (var28.method1676()) {
                            var32 = class98.field1314.field1320;
                        } else {
                            var32 = class98.field1309.field1320;
                        }
                    } else if (var28.method1646()) {
                        if (var28.method1676()) {
                            var32 = class98.field1317.field1320;
                        } else {
                            var32 = class98.field1316.field1320;
                        }
                    } else if (var28.method1688()) {
                        if (var28.method1676()) {
                            var32 = class98.field1319.field1320;
                        } else {
                            var32 = class98.field1318.field1320;
                        }
                    } else if (var28.method1676()) {
                        var32 = class98.field1307.field1320;
                    } else {
                        var32 = class98.field1308.field1320;
                    }
                    if (class33.field232 >= var23 && class33.field231 >= var22 && class33.field232 < var11 + var23 && class33.field231 < var12 + var22 && var29) {
                        field922 = var27;
                        Statics.field1064[var32].method7608(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field1064[var32].method7602(var23, var22);
                    }
                    if (Statics.field258 != null) {
                        Statics.field258[(var28.method1676() ? 8 : 0) + var28.field805].method7573(var23 + 29, var22);
                    }
                    arg0.method5955(Integer.toString(var28.field794), var23 + 15, var12 / 2 + var22 + 5, var31, -1);
                    arg1.method5955(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
                    var22 += var12 + var18;
                    var24++;
                    if (var24 >= var14) {
                        var22 = var20 + 23;
                        var23 += var11 + var17;
                        var24 = 0;
                        var26++;
                    }
                }
                if (var25) {
                    int var33 = arg1.method5952(Statics.field795[field922].field792) + 6;
                    int var34 = arg1.field4224 + 8;
                    int var35 = class33.field231 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class33.field231 - 25 - var34;
                    }
                    class454.method7518(class33.field232 - var33 / 2, var35, var33, var34, 16777120);
                    class454.method7499(class33.field232 - var33 / 2, var35, var33, var34, 0);
                    arg1.method5955(Statics.field795[field922].field792, class33.field232, arg1.field4224 + var35 + 4, 0, -1);
                }
            }
            Statics.field114.method421(0, 0);
            return;
        }
        Statics.field2516.method7602(field913, 0);
        Statics.field294.method7602(field913 + 382, 0);
        Statics.field1809.method7573(field913 + 382 - Statics.field1809.field4818 / 2, 18);
        if (client.field612 == 0 || client.field612 == 5) {
            byte var36 = 20;
            arg0.method5955(class310.field3878, field898 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class454.method7499(field898 + 180 - 152, var37, 304, 34, 9179409);
            class454.method7499(field898 + 180 - 151, var37 + 1, 302, 32, 0);
            class454.method7518(field898 + 180 - 150, var37 + 2, field906 * 3, 30, 9179409);
            class454.method7518(field906 * 3 + (field898 + 180 - 150), var37 + 2, 300 - field906 * 3, 30, 0);
            arg0.method5955(field900, field898 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field612 == 20) {
            Statics.field895.method7573(field898 + 180 - Statics.field895.field4818 / 2, 271 - Statics.field895.field4819 / 2);
            short var38 = 201;
            arg0.method5955(field907, field898 + 180, var38, 16776960, 0);
            int var179 = var38 + 15;
            arg0.method5955(field916, field898 + 180, var179, 16776960, 0);
            int var180 = var179 + 15;
            arg0.method5955(field909, field898 + 180, var180, 16776960, 0);
            int var181 = var180 + 15;
            int var182 = var181 + 7;
            if (field905 != 4 && field905 != 10) {
                arg0.method5953(class310.field3906, field898 + 180 - 110, var182, 16777215, 0);
                short var39 = 200;
                String var46;
                if (Statics.field1108.method2289()) {
                    String var40 = field910;
                    int var41 = var40.length();
                    char[] var42 = new char[var41];
                    for (int var43 = 0; var43 < var41; var43++) {
                        var42[var43] = '*';
                    }
                    String var44 = new String(var42);
                    var46 = var44;
                } else {
                    var46 = field910;
                }
                String var48;
                for (var48 = var46; arg0.method5952(var48) > var39; var48 = var48.substring(0, var48.length() - 1)) {
                }
                arg0.method5953(class352.method5951(var48), field898 + 180 - 70, var182, 16777215, 0);
                var179 = var182 + 15;
                String var49 = field912;
                int var50 = var49.length();
                char[] var51 = new char[var50];
                for (int var52 = 0; var52 < var50; var52++) {
                    var51[var52] = '*';
                }
                String var53 = new String(var51);
                String var55;
                for (var55 = var53; arg0.method5952(var55) > var39; var55 = var55.substring(1)) {
                }
                arg0.method5953(class310.field3907 + var55, field898 + 180 - 108, var179, 16777215, 0);
                var179 += 15;
            }
        }
        if (client.field612 == 10 || client.field612 == 11 || client.field612 == 50) {
            Statics.field895.method7573(field898, 171);
            if (field905 == 0) {
                short var56 = 251;
                arg0.method5955(class310.field3909, field898 + 180, var56, 16776960, 0);
                int var183 = var56 + 30;
                int var57 = field898 + 180 - 80;
                short var58 = 291;
                Statics.field896.method7573(var57 - 73, var58 - 20);
                arg0.method5974(class310.field3863, var57 - 73, var58 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var59 = field898 + 180 + 80;
                Statics.field896.method7573(var59 - 73, var58 - 20);
                arg0.method5974(class310.field3911, var59 - 73, var58 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field905 == 1) {
                arg0.method5955(field927, field898 + 180, 201, 16776960, 0);
                short var60 = 236;
                arg0.method5955(field907, field898 + 180, var60, 16777215, 0);
                int var184 = var60 + 15;
                arg0.method5955(field916, field898 + 180, var184, 16777215, 0);
                int var185 = var184 + 15;
                arg0.method5955(field909, field898 + 180, var185, 16777215, 0);
                int var186 = var185 + 15;
                int var61 = field898 + 180 - 80;
                short var62 = 321;
                Statics.field896.method7573(var61 - 73, var62 - 20);
                arg0.method5955(class310.field3933, var61, var62 + 5, 16777215, 0);
                int var63 = field898 + 180 + 80;
                Statics.field896.method7573(var63 - 73, var62 - 20);
                arg0.method5955(class310.field3913, var63, var62 + 5, 16777215, 0);
            } else if (field905 == 2) {
                short var64 = 201;
                arg0.method5955(field907, Statics.field4157, var64, 16776960, 0);
                int var187 = var64 + 15;
                arg0.method5955(field916, Statics.field4157, var187, 16776960, 0);
                int var188 = var187 + 15;
                arg0.method5955(field909, Statics.field4157, var188, 16776960, 0);
                int var189 = var188 + 15;
                int var190 = var189 + 7;
                arg0.method5953(class310.field3906, Statics.field4157 - 110, var190, 16777215, 0);
                short var65 = 200;
                String var72;
                if (Statics.field1108.method2289()) {
                    String var66 = field910;
                    int var67 = var66.length();
                    char[] var68 = new char[var67];
                    for (int var69 = 0; var69 < var67; var69++) {
                        var68[var69] = '*';
                    }
                    String var70 = new String(var68);
                    var72 = var70;
                } else {
                    var72 = field910;
                }
                String var74;
                for (var74 = var72; arg0.method5952(var74) > var65; var74 = var74.substring(1)) {
                }
                arg0.method5953(class352.method5951(var74) + (field918 == 0 & client.field504 % 40 < 20 ? class93.method814(16776960) + class93.field1267 : ""), Statics.field4157 - 70, var190, 16777215, 0);
                var187 = var190 + 15;
                String var75 = field912;
                int var76 = var75.length();
                char[] var77 = new char[var76];
                for (int var78 = 0; var78 < var76; var78++) {
                    var77[var78] = '*';
                }
                String var79 = new String(var77);
                String var81;
                for (var81 = var79; arg0.method5952(var81) > var65; var81 = var81.substring(1)) {
                }
                arg0.method5953(class310.field3907 + var81 + (field918 == 1 & client.field504 % 40 < 20 ? class93.method814(16776960) + class93.field1267 : ""), Statics.field4157 - 108, var187, 16777215, 0);
                var187 += 15;
                short var82 = 277;
                int var83 = Statics.field4157 + -117;
                class457 var84 = method1636(client.field541, field926);
                var84.method7573(var83, var82);
                int var85 = var84.field4818 + 5 + var83;
                arg1.method5953(class310.field3799, var85, var82 + 13, 16776960, 0);
                int var86 = Statics.field4157 + 24;
                class457 var87 = method1636(Statics.field1108.method2289(), field921);
                var87.method7573(var86, var82);
                int var88 = var87.field4818 + 5 + var86;
                arg1.method5953(class310.field3915, var88, var82 + 13, 16776960, 0);
                int var191 = var82 + 15;
                int var89 = Statics.field4157 - 80;
                short var90 = 321;
                Statics.field896.method7573(var89 - 73, var90 - 20);
                arg0.method5955(class310.field3912, var89, var90 + 5, 16777215, 0);
                int var91 = Statics.field4157 + 80;
                Statics.field896.method7573(var91 - 73, var90 - 20);
                arg0.method5955(class310.field3913, var91, var90 + 5, 16777215, 0);
                short var92 = 357;
                switch(field904) {
                    case 2:
                        Statics.field2649 = class310.field3928;
                        break;
                    default:
                        Statics.field2649 = class310.field3926;
                }
                Statics.field3196 = new class386(Statics.field4157, var92, arg1.method5952(Statics.field2649), 11);
                Statics.field958 = new class386(Statics.field4157, var92, arg1.method5952(class310.field3927), 11);
                arg1.method5955(Statics.field2649, Statics.field4157, var92, 16777215, 0);
            } else if (field905 == 3) {
                short var93 = 201;
                arg0.method5955(class310.field3917, field898 + 180, var93, 16776960, 0);
                int var192 = var93 + 20;
                arg1.method5955(class310.field3918, field898 + 180, var192, 16776960, 0);
                int var193 = var192 + 15;
                arg1.method5955(class310.field3919, field898 + 180, var193, 16776960, 0);
                int var194 = var193 + 15;
                int var94 = field898 + 180;
                short var95 = 276;
                Statics.field896.method7573(var94 - 73, var95 - 20);
                arg2.method5955(class310.field3920, var94, var95 + 5, 16777215, 0);
                int var96 = field898 + 180;
                short var97 = 326;
                Statics.field896.method7573(var96 - 73, var97 - 20);
                arg2.method5955(class310.field3921, var96, var97 + 5, 16777215, 0);
            } else if (field905 == 4) {
                arg0.method5955(class310.field3895, field898 + 180, 201, 16776960, 0);
                short var98 = 236;
                arg0.method5955(field907, field898 + 180, var98, 16777215, 0);
                int var195 = var98 + 15;
                arg0.method5955(field916, field898 + 180, var195, 16777215, 0);
                int var196 = var195 + 15;
                arg0.method5955(field909, field898 + 180, var196, 16777215, 0);
                int var197 = var196 + 15;
                String var100 = class310.field3908;
                String var101 = Statics.field167;
                int var102 = var101.length();
                char[] var103 = new char[var102];
                for (int var104 = 0; var104 < var102; var104++) {
                    var103[var104] = '*';
                }
                String var105 = new String(var103);
                arg0.method5953(var100 + var105 + (client.field504 % 40 < 20 ? class93.method814(16776960) + class93.field1267 : ""), field898 + 180 - 108, var197, 16777215, 0);
                var195 = var197 - 8;
                arg0.method5953(class310.field3664, field898 + 180 - 9, var195, 16776960, 0);
                var195 += 15;
                arg0.method5953(class310.field3665, field898 + 180 - 9, var195, 16776960, 0);
                int var107 = field898 + 180 - 9 + arg0.method5952(class310.field3665) + 15;
                int var108 = var195 - arg0.field4224;
                class457 var109;
                if (field917) {
                    var109 = Statics.field1380;
                } else {
                    var109 = Statics.field2854;
                }
                var109.method7573(var107, var108);
                var195 += 15;
                int var110 = field898 + 180 - 80;
                short var111 = 321;
                Statics.field896.method7573(var110 - 73, var111 - 20);
                arg0.method5955(class310.field3933, var110, var111 + 5, 16777215, 0);
                int var112 = field898 + 180 + 80;
                Statics.field896.method7573(var112 - 73, var111 - 20);
                arg0.method5955(class310.field3913, var112, var111 + 5, 16777215, 0);
                arg1.method5955(class310.field3896, field898 + 180, var111 + 36, 255, 0);
            } else if (field905 == 5) {
                arg0.method5955(class310.field3805, field898 + 180, 201, 16776960, 0);
                short var113 = 221;
                arg2.method5955(field907, field898 + 180, var113, 16776960, 0);
                int var198 = var113 + 15;
                arg2.method5955(field916, field898 + 180, var198, 16776960, 0);
                int var199 = var198 + 15;
                arg2.method5955(field909, field898 + 180, var199, 16776960, 0);
                int var200 = var199 + 15;
                int var201 = var200 + 14;
                arg0.method5953(class310.field3923, field898 + 180 - 145, var201, 16777215, 0);
                short var114 = 174;
                String var121;
                if (Statics.field1108.method2289()) {
                    String var115 = field910;
                    int var116 = var115.length();
                    char[] var117 = new char[var116];
                    for (int var118 = 0; var118 < var116; var118++) {
                        var117[var118] = '*';
                    }
                    String var119 = new String(var117);
                    var121 = var119;
                } else {
                    var121 = field910;
                }
                String var123;
                for (var123 = var121; arg0.method5952(var123) > var114; var123 = var123.substring(1)) {
                }
                arg0.method5953(class352.method5951(var123) + (client.field504 % 40 < 20 ? class93.method814(16776960) + class93.field1267 : ""), field898 + 180 - 34, var201, 16777215, 0);
                var198 = var201 + 15;
                int var124 = field898 + 180 - 80;
                short var125 = 321;
                Statics.field896.method7573(var124 - 73, var125 - 20);
                arg0.method5955(class310.field3784, var124, var125 + 5, 16777215, 0);
                int var126 = field898 + 180 + 80;
                Statics.field896.method7573(var126 - 73, var125 - 20);
                arg0.method5955(class310.field3925, var126, var125 + 5, 16777215, 0);
                short var127 = 356;
                arg1.method5955(class310.field3927, Statics.field4157, var127, 268435455, 0);
            } else if (field905 == 6) {
                short var128 = 201;
                arg0.method5955(field907, field898 + 180, var128, 16776960, 0);
                int var202 = var128 + 15;
                arg0.method5955(field916, field898 + 180, var202, 16776960, 0);
                int var203 = var202 + 15;
                arg0.method5955(field909, field898 + 180, var203, 16776960, 0);
                int var204 = var203 + 15;
                int var129 = field898 + 180;
                short var130 = 321;
                Statics.field896.method7573(var129 - 73, var130 - 20);
                arg0.method5955(class310.field3925, var129, var130 + 5, 16777215, 0);
            } else if (field905 == 7) {
                if (Statics.field1388 && !client.field501) {
                    short var131 = 201;
                    arg0.method5955(field907, Statics.field4157, var131, 16776960, 0);
                    int var205 = var131 + 15;
                    arg0.method5955(field916, Statics.field4157, var205, 16776960, 0);
                    int var206 = var205 + 15;
                    arg0.method5955(field909, Statics.field4157, var206, 16776960, 0);
                    int var132 = Statics.field4157 - 150;
                    int var207 = var206 + 10;
                    for (int var133 = 0; var133 < 8; var133++) {
                        Statics.field896.method7575(var132, var207, 30, 40);
                        boolean var134 = field892 == var133 & client.field504 % 40 < 20;
                        arg0.method5953((field908[var133] == null ? "" : field908[var133]) + (var134 ? class93.method814(16776960) + class93.field1267 : ""), var132 + 10, var207 + 27, 16777215, 0);
                        if (var133 == 1 || var133 == 3) {
                            var132 += 50;
                            arg0.method5953(class352.method5951("/"), var132 - 13, var207 + 27, 16777215, 0);
                        } else {
                            var132 += 35;
                        }
                    }
                    int var135 = Statics.field4157 - 80;
                    short var136 = 321;
                    Statics.field896.method7573(var135 - 73, var136 - 20);
                    arg0.method5955("Submit", var135, var136 + 5, 16777215, 0);
                    int var137 = Statics.field4157 + 80;
                    Statics.field896.method7573(var137 - 73, var136 - 20);
                    arg0.method5955(class310.field3913, var137, var136 + 5, 16777215, 0);
                } else {
                    short var138 = 216;
                    arg0.method5955(class310.field3953, field898 + 180, var138, 16776960, 0);
                    int var208 = var138 + 15;
                    arg2.method5955(class310.field3954, field898 + 180, var208, 16776960, 0);
                    int var209 = var208 + 15;
                    arg2.method5955(class310.field3757, field898 + 180, var209, 16776960, 0);
                    int var210 = var209 + 15;
                    int var139 = field898 + 180 - 80;
                    short var140 = 321;
                    Statics.field896.method7573(var139 - 73, var140 - 20);
                    arg0.method5955(class310.field3956, var139, var140 + 5, 16777215, 0);
                    int var141 = field898 + 180 + 80;
                    Statics.field896.method7573(var141 - 73, var140 - 20);
                    arg0.method5955(class310.field3925, var141, var140 + 5, 16777215, 0);
                }
            } else if (field905 == 8) {
                short var142 = 216;
                arg0.method5955(class310.field3793, field898 + 180, var142, 16776960, 0);
                int var211 = var142 + 15;
                arg2.method5955(class310.field3804, field898 + 180, var211, 16776960, 0);
                int var212 = var211 + 15;
                arg2.method5955(class310.field3795, field898 + 180, var212, 16776960, 0);
                int var213 = var212 + 15;
                int var143 = field898 + 180 - 80;
                short var144 = 321;
                Statics.field896.method7573(var143 - 73, var144 - 20);
                arg0.method5955(class310.field3796, var143, var144 + 5, 16777215, 0);
                int var145 = field898 + 180 + 80;
                Statics.field896.method7573(var145 - 73, var144 - 20);
                arg0.method5955(class310.field3925, var145, var144 + 5, 16777215, 0);
            } else if (field905 == 9) {
                short var146 = 221;
                arg0.method5955(field907, field898 + 180, var146, 16776960, 0);
                int var214 = var146 + 25;
                arg0.method5955(field916, field898 + 180, var214, 16776960, 0);
                int var215 = var214 + 25;
                arg0.method5955(field909, field898 + 180, var215, 16776960, 0);
                int var147 = field898 + 180;
                short var148 = 311;
                Statics.field896.method7573(var147 - 73, var148 - 20);
                arg0.method5955(class310.field3920, var147, var148 + 5, 16777215, 0);
            } else if (field905 == 10) {
                int var149 = field898 + 180;
                short var150 = 209;
                arg0.method5955(class310.field3909, field898 + 180, var150, 16776960, 0);
                int var216 = var150 + 20;
                Statics.field3332.method7573(var149 - 109, var216);
                Statics.field1694.method7573(var149 - 48, var216 + 18);
            } else if (field905 == 12) {
                int var151 = Statics.field4157;
                short var152 = 216;
                arg2.method5955(class310.field3960, var151, var152, 16777215, 0);
                int var217 = var152 + 17;
                arg2.method5955(class310.field3961, var151, var217, 16777215, 0);
                int var218 = var217 + 17;
                arg2.method5955(class310.field3962, var151, var218, 16777215, 0);
                int var219 = var218 + 17;
                arg2.method5955(class310.field3836, var151, var219, 16777215, 0);
                int var153 = Statics.field4157 - 80;
                short var154 = 311;
                Statics.field896.method7573(var153 - 73, var154 - 20);
                arg0.method5955(class310.field3662, var153, var154 + 5, 16777215, 0);
                int var155 = Statics.field4157 + 80;
                Statics.field896.method7573(var155 - 73, var154 - 20);
                arg0.method5955(class310.field3967, var155, var154 + 5, 16777215, 0);
            } else if (field905 == 13) {
                short var156 = 231;
                arg2.method5955(class310.field3825, field898 + 180, var156, 16777215, 0);
                int var220 = var156 + 20;
                arg2.method5955(class310.field3965, field898 + 180, var220, 16777215, 0);
                int var157 = field898 + 180;
                short var158 = 311;
                Statics.field896.method7573(var157 - 73, var158 - 20);
                arg0.method5955(class310.field3925, var157, var158 + 5, 16777215, 0);
            } else if (field905 == 14) {
                short var159 = 201;
                String var160 = "";
                String var161 = "";
                String var162 = "";
                switch(field903) {
                    case 0:
                        var160 = class310.field3710;
                        var161 = class310.field3823;
                        var162 = class310.field3711;
                        break;
                    case 1:
                        var160 = class310.field3748;
                        var161 = class310.field3749;
                        var162 = class310.field3750;
                        break;
                    case 2:
                        var160 = class310.field3973;
                        var161 = class310.field3785;
                        var162 = class310.field3966;
                        break;
                    default:
                        method5105(false);
                }
                arg0.method5955(var160, field898 + 180, var159, 16776960, 0);
                int var221 = var159 + 20;
                arg0.method5955(var161, field898 + 180, var221, 16776960, 0);
                int var222 = var221 + 20;
                arg0.method5955(var162, field898 + 180, var222, 16776960, 0);
                int var163 = field898 + 180;
                short var164 = 276;
                Statics.field896.method7573(var163 - 73, var164 - 20);
                arg0.method5955(class310.field3693, var163, var164 + 5, 16777215, 0);
                int var165 = field898 + 180;
                short var166 = 326;
                Statics.field896.method7573(var165 - 73, var166 - 20);
                arg0.method5955(class310.field3925, var165, var166 + 5, 16777215, 0);
            } else if (field905 == 24) {
                short var167 = 221;
                arg0.method5955(field907, field898 + 180, var167, 16777215, 0);
                int var223 = var167 + 15;
                arg0.method5955(field916, field898 + 180, var223, 16777215, 0);
                int var224 = var223 + 15;
                arg0.method5955(field909, field898 + 180, var224, 16777215, 0);
                int var225 = var224 + 15;
                int var168 = field898 + 180;
                short var169 = 301;
                Statics.field896.method7573(var168 - 73, var169 - 20);
                arg0.method5955(class310.field3659, var168, var169 + 5, 16777215, 0);
            } else if (field905 == 26) {
                short var170 = 216;
                arg0.method5955(class310.field3953, field898 + 180, var170, 16776960, 0);
                int var226 = var170 + 15;
                arg2.method5955(class310.field3954, field898 + 180, var226, 16776960, 0);
                int var227 = var226 + 15;
                arg2.method5955(class310.field3757, field898 + 180, var227, 16776960, 0);
                int var228 = var227 + 15;
                int var171 = field898 + 180 - 80;
                short var172 = 321;
                Statics.field896.method7573(var171 - 73, var172 - 20);
                arg0.method5955(class310.field3956, var171, var172 + 5, 16777215, 0);
                int var173 = field898 + 180 + 80;
                Statics.field896.method7573(var173 - 73, var172 - 20);
                arg0.method5955(class310.field3925, var173, var172 + 5, 16777215, 0);
            }
        }
        if (client.field612 >= 10) {
            int[] var174 = new int[4];
            class454.method7485(var174);
            class454.method7487(field913, 0, field913 + 765, Statics.field1825);
            Statics.field2638.method2246(field913 - 22, client.field504);
            Statics.field2638.method2246(field913 + 765 + 22 - 128, client.field504);
            class454.method7529(var174);
        }
        Statics.field4654[Statics.field1108.method2285() ? 1 : 0].method7573(field913 + 765 - 40, 463);
        if (client.field612 <= 5 || Statics.field3203 != class332.field4149) {
            return;
        }
        if (Statics.field46 == null) {
            Statics.field46 = class459.method4687(Statics.field990, "sl_button", "");
            return;
        }
        int var175 = field913 + 5;
        short var176 = 463;
        byte var177 = 100;
        byte var178 = 35;
        Statics.field46.method7573(var175, var176);
        arg0.method5955(class310.field3833 + " " + client.field493, var177 / 2 + var175, var178 / 2 + var176 - 2, 16777215, 0);
        if (Statics.field2485 == null) {
            arg1.method5955(class310.field3844, var177 / 2 + var175, var178 / 2 + var176 + 12, 16777215, 0);
        } else {
            arg1.method5955(class310.field3971, var177 / 2 + var175, var178 / 2 + var176 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bq.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2109(String arg0, String arg1, String arg2) {
        field907 = arg0;
        field916 = arg1;
        field909 = arg2;
    }

    @ObfuscatedName("ea.b(Lai;I)V")
    public static void method2851(class32 arg0) {
        while (class24.method402()) {
            if (Statics.field1666 == 13) {
                field899 = false;
                Statics.field2516.method7602(field913, 0);
                Statics.field294.method7602(field913 + 382, 0);
                Statics.field1809.method7573(field913 + 382 - Statics.field1809.field4818 / 2, 18);
                return;
            }
            if (Statics.field1666 == 96) {
                if (field923 > 0 && Statics.field2863 != null) {
                    field923--;
                }
            } else if (Statics.field1666 == 97 && field923 < field924 && Statics.field76 != null) {
                field923++;
            }
        }
        if (class33.field237 != 1 && Statics.field2478 || class33.field237 != 4) {
            return;
        }
        int var1 = field913 + 280;
        if (class33.field238 >= var1 && class33.field238 <= var1 + 14 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(0, 0);
            return;
        }
        if (class33.field238 >= var1 + 15 && class33.field238 <= var1 + 80 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(0, 1);
            return;
        }
        int var2 = field913 + 390;
        if (class33.field238 >= var2 && class33.field238 <= var2 + 14 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(1, 0);
            return;
        }
        if (class33.field238 >= var2 + 15 && class33.field238 <= var2 + 80 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(1, 1);
            return;
        }
        int var3 = field913 + 500;
        if (class33.field238 >= var3 && class33.field238 <= var3 + 14 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(2, 0);
            return;
        }
        if (class33.field238 >= var3 + 15 && class33.field238 <= var3 + 80 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(2, 1);
            return;
        }
        int var4 = field913 + 610;
        if (class33.field238 >= var4 && class33.field238 <= var4 + 14 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(3, 0);
            return;
        }
        if (class33.field238 >= var4 + 15 && class33.field238 <= var4 + 80 && class33.field239 >= 4 && class33.field239 <= 18) {
            class61.method7063(3, 1);
            return;
        }
        if (class33.field238 >= field913 + 708 && class33.field239 >= 4 && class33.field238 <= field913 + 708 + 50 && class33.field239 <= 20) {
            field899 = false;
            Statics.field2516.method7602(field913, 0);
            Statics.field294.method7602(field913 + 382, 0);
            Statics.field1809.method7573(field913 + 382 - Statics.field1809.field4818 / 2, 18);
            return;
        }
        if (field922 != -1) {
            class61 var5 = Statics.field795[field922];
            method4287(var5);
            field899 = false;
            Statics.field2516.method7602(field913, 0);
            Statics.field294.method7602(field913 + 382, 0);
            Statics.field1809.method7573(field913 + 382 - Statics.field1809.field4818 / 2, 18);
            return;
        }
        if (field923 > 0 && Statics.field2863 != null && class33.field238 >= 0 && class33.field238 <= Statics.field2863.field4818 && class33.field239 >= Statics.field1825 / 2 - 50 && class33.field239 <= Statics.field1825 / 2 + 50) {
            field923--;
        }
        if (field923 < field924 && Statics.field76 != null && class33.field238 >= Statics.field1514 - Statics.field76.field4818 - 5 && class33.field238 <= Statics.field1514 && class33.field239 >= Statics.field1825 / 2 - 50 && class33.field239 <= Statics.field1825 / 2 + 50) {
            field923++;
        }
    }

    @ObfuscatedName("hk.a(Lbo;B)V")
    public static void method4287(class61 arg0) {
        if (arg0.method1676() != client.field685) {
            client.field685 = arg0.method1676();
            Statics.method1118(arg0.method1676());
        }
        if (client.field494 != arg0.field801) {
            method2218(Statics.field990, arg0.field801);
        }
        Statics.field2701 = arg0.field803;
        client.field493 = arg0.field794;
        client.field494 = arg0.field801;
        Statics.field1256 = client.field495 == 0 ? 43594 : arg0.field794 + 40000;
        Statics.field1754 = client.field495 == 0 ? 443 : arg0.field794 + 50000;
        Statics.field1395 = Statics.field1256;
    }

    @ObfuscatedName("q.l(I)V")
    public static void method65() {
        method2876(24);
        method2109(class310.field3903, class310.field3868, class310.field3905);
    }

    @ObfuscatedName("eg.e(II)V")
    public static void method2876(int arg0) {
        if (field905 != arg0) {
            field905 = arg0;
        }
    }

    @ObfuscatedName("hs.g(B)I")
    public static int method4608() {
        return field905;
    }
}
