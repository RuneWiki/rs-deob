package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("bu")
public class class69 {

    @ObfuscatedName("bu.l")
    public static int field879 = 0;

    @ObfuscatedName("bu.d")
    public static int field909 = field879 + 202;

    @ObfuscatedName("bu.z")
    public static int field886 = 10;

    @ObfuscatedName("bu.i")
    public static String field887 = "";

    @ObfuscatedName("bu.aw")
    public static int field888 = -1;

    @ObfuscatedName("bu.av")
    public static int field908 = 1;

    @ObfuscatedName("bu.ax")
    public static int field890 = 0;

    @ObfuscatedName("bu.at")
    public static String field891 = "";

    @ObfuscatedName("bu.br")
    public static String field892 = "";

    @ObfuscatedName("bu.ba")
    public static String field893 = "";

    @ObfuscatedName("bu.bk")
    public static String field894 = "";

    @ObfuscatedName("bu.bi")
    public static String field900 = "";

    @ObfuscatedName("bu.bc")
    public static String field899 = "";

    @ObfuscatedName("bu.bl")
    public static int field897 = 0;

    @ObfuscatedName("bu.bs")
    public static String[] field877 = new String[8];

    @ObfuscatedName("bu.bh")
    public static boolean field880 = false;

    @ObfuscatedName("bu.bb")
    public static boolean field882 = false;

    @ObfuscatedName("bu.bn")
    public static boolean field901 = true;

    @ObfuscatedName("bu.bg")
    public static int field902 = 0;

    @ObfuscatedName("bu.bp")
    public static String field903 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bu.bw")
    public static String field904 = "1234567890";

    @ObfuscatedName("bu.ck")
    public static boolean field905 = false;

    @ObfuscatedName("bu.cn")
    public static int field896 = -1;

    @ObfuscatedName("bu.cc")
    public static int field907 = 0;

    @ObfuscatedName("bu.cy")
    public static int field906 = 0;

    @ObfuscatedName("bu.cd")
    public static long field884;

    @ObfuscatedName("bu.cw")
    public static long field910;

    @ObfuscatedName("bu.cf")
    public static String[] field911;

    @ObfuscatedName("bu.cq")
    public static String[] field912;

    static {
        new DecimalFormat("##0.00");
        new class121();
        field884 = -1L;
        field910 = -1L;
        field911 = new String[] { "title.jpg" };
        field912 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.o(Llp;Llp;I)I")
    public static int method331(class316 arg0, class316 arg1) {
        int var2 = 0;
        String[] var3 = field911;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5203(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field912;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5203(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("ib.q(Llp;Llp;ZII)V")
    public static void method4431(class316 arg0, class316 arg1, boolean arg2, int arg3) {
        if (!Statics.field878) {
            if (arg3 == 0) {
                method4381(arg2);
            } else {
                method2643(arg3);
            }
            class449.method7196();
            byte[] var4 = arg0.method5208("title.jpg", "");
            Statics.field1420 = class29.method3909(var4);
            Statics.field1005 = Statics.field1420.method7310();
            int var5 = client.field480;
            if ((var5 & 0x20000000) != 0) {
                Statics.field1842 = class454.method2897(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field1842 = class454.method2897(arg1, "logo", "");
            } else {
                Statics.field1842 = class454.method2897(arg1, "logo_seasonal_mode", "");
            }
            Statics.field895 = class454.method2897(arg1, "titlebox", "");
            Statics.field898 = class454.method2897(arg1, "titlebutton", "");
            Statics.field1840 = class454.method2897(arg1, "titlebutton_large", "");
            Statics.field883 = class454.method2897(arg1, "play_now_text", "");
            class454.method2897(arg1, "titlebutton_wide42,1", "");
            int var6 = arg1.method5206("runes");
            int var7 = arg1.method5207(var6, "");
            class452[] var8 = class454.method1957(arg1, var6, var7);
            Statics.field885 = var8;
            int var9 = arg1.method5206("title_mute");
            int var10 = arg1.method5207(var9, "");
            class452[] var11 = class454.method1957(arg1, var9, var10);
            Statics.field4261 = var11;
            Statics.field873 = class454.method2897(arg1, "options_radio_buttons,0", "");
            Statics.field889 = class454.method2897(arg1, "options_radio_buttons,4", "");
            Statics.field1361 = class454.method2897(arg1, "options_radio_buttons,2", "");
            Statics.field1355 = class454.method2897(arg1, "options_radio_buttons,6", "");
            Statics.field82 = Statics.field873.field4759;
            Statics.field3213 = Statics.field873.field4762;
            Statics.field2254 = new class89(Statics.field885);
            if (arg2) {
                field900 = "";
                field899 = "";
                field877 = new String[8];
                field897 = 0;
            }
            Statics.field2913 = 0;
            Statics.field1272 = "";
            field901 = true;
            field905 = false;
            if (Statics.field65.method2107()) {
                class274.method2403(2);
            } else {
                class314 var12 = Statics.field4325;
                int var13 = var12.method5206("scape main");
                int var14 = var12.method5207(var13, "");
                class274.method2434(2, var12, var13, var14, 255, false);
            }
            class317.method1983(false);
            Statics.field878 = true;
            field879 = (Statics.field841 - 765) / 2;
            field909 = field879 + 202;
            Statics.field409 = field909 + 180;
            Statics.field1420.method7394(field879, 0);
            Statics.field1005.method7394(field879 + 382, 0);
            Statics.field1842.method7287(field879 + 382 - Statics.field1842.field4759 / 2, 18);
        } else if (arg3 == 4) {
            method2643(4);
        }
    }

    @ObfuscatedName("fn.l(I)Ljava/lang/String;")
    public static String method2964() {
        String var6;
        if (Statics.field65.method2138()) {
            String var0 = field900;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field900;
        }
        return var6;
    }

    @ObfuscatedName("er.k(Laj;Lmx;I)V")
    public static void method2674(class32 arg0, class350 arg1) {
        if (field905) {
            method2659(arg0);
            return;
        }
        if ((class33.field238 == 1 || !Statics.field914 && class33.field238 == 4) && class33.field235 >= field879 + 765 - 50 && class33.field240 >= 453) {
            Statics.field65.method2186(!Statics.field65.method2107());
            if (Statics.field65.method2107()) {
                class274.method1041();
            } else {
                class274.method2588(Statics.field4325, "scape main", "", 255, false);
            }
        }
        if (client.field510 == 5) {
            return;
        }
        if (field884 == -1L) {
            field884 = class270.method2485() + 1000L;
        }
        long var2 = class270.method2485();
        if (client.method2600() && field910 == -1L) {
            field910 = var2;
            if (field910 > field884) {
                field884 = field910;
            }
        }
        if (client.field510 != 10 && client.field510 != 11) {
            return;
        }
        if (Statics.field3066 == class331.field4120) {
            if (class33.field238 == 1 || !Statics.field914 && class33.field238 == 4) {
                int var4 = field879 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class33.field235 >= var4 && class33.field235 <= var4 + var6 && class33.field240 >= var5 && class33.field240 <= var5 + var7) {
                    method2021();
                    return;
                }
            }
            if (Statics.field1258 != null) {
                method2021();
            }
        }
        int var8 = class33.field238;
        int var9 = class33.field235;
        int var10 = class33.field240;
        if (var8 == 0) {
            var9 = class33.field227;
            var10 = class33.field228;
        }
        if (!Statics.field914 && var8 == 4) {
            var8 = 1;
        }
        if (field890 == 0) {
            boolean var11 = false;
            while (class24.method2886()) {
                if (Statics.field62 == 84) {
                    var11 = true;
                }
            }
            int var12 = Statics.field409 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                class30.method1979(client.method4382("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var14 = Statics.field409 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field480 & 0x2000000) != 0) {
                    field891 = "";
                    field892 = class309.field3887;
                    field893 = class309.field3888;
                    field894 = class309.field3942;
                    method2643(1);
                    if (client.field528 && field900 != null && field900.length() > 0) {
                        field902 = 1;
                    } else {
                        field902 = 0;
                    }
                } else if ((client.field480 & 0x4) != 0) {
                    if ((client.field480 & 0x400) == 0) {
                        field892 = class309.field3933;
                        field893 = class309.field3879;
                        field894 = class309.field3723;
                    } else {
                        field892 = class309.field3884;
                        field893 = class309.field3831;
                        field894 = class309.field3865;
                    }
                    field891 = class309.field3686;
                    method2643(1);
                    if (client.field528 && field900 != null && field900.length() > 0) {
                        field902 = 1;
                    } else {
                        field902 = 0;
                    }
                } else if ((client.field480 & 0x400) == 0) {
                    method728(false);
                } else {
                    field892 = class309.field3881;
                    field893 = class309.field3882;
                    field894 = class309.field3883;
                    field891 = class309.field3686;
                    method2643(1);
                    if (client.field528 && field900 != null && field900.length() > 0) {
                        field902 = 1;
                    } else {
                        field902 = 0;
                    }
                }
            }
        } else if (field890 == 1) {
            while (true) {
                if (!class24.method2886()) {
                    int var15 = Statics.field409 - 80;
                    short var16 = 321;
                    if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                        method728(false);
                    }
                    int var17 = Statics.field409 + 80;
                    if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                        method2643(0);
                    }
                    break;
                }
                if (Statics.field62 == 84) {
                    method728(false);
                } else if (Statics.field62 == 13) {
                    method2643(0);
                }
            }
        } else if (field890 == 2) {
            short var18 = 201;
            int var113 = var18 + 52;
            if (var8 == 1 && var10 >= var113 - 12 && var10 < var113 + 2) {
                field902 = 0;
            }
            var113 += 15;
            if (var8 == 1 && var10 >= var113 - 12 && var10 < var113 + 2) {
                field902 = 1;
            }
            var113 += 15;
            short var19 = 361;
            if (Statics.field977 != null) {
                int var20 = Statics.field977.field4387 / 2;
                if (var8 == 1 && var9 >= Statics.field977.field4385 - var20 && var9 <= Statics.field977.field4385 + var20 && var10 >= var19 - 15 && var10 < var19) {
                    switch(field908) {
                        case 1:
                            method5664(class309.field3768, class309.field3927, class309.field3928);
                            method2643(5);
                            return;
                        case 2:
                            class30.method1979("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var21 = Statics.field409 - 80;
            short var22 = 321;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var22 - 20 && var10 <= var22 + 20) {
                field900 = field900.trim();
                if (field900.length() == 0) {
                    method5664(class309.field3770, class309.field3771, class309.field3772);
                    return;
                }
                if (field899.length() == 0) {
                    method5664(class309.field3773, class309.field3839, class309.field3802);
                    return;
                }
                method5664(class309.field3651, class309.field3893, class309.field3894);
                client.method1635(false);
                client.method2046(20);
                return;
            }
            int var23 = field909 + 180 + 80;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var22 - 20 && var10 <= var22 + 20) {
                method2643(0);
                field900 = "";
                field899 = "";
                Statics.field2913 = 0;
                Statics.field1272 = "";
                field901 = true;
            }
            int var24 = Statics.field409 + -117;
            short var25 = 277;
            field880 = var9 >= var24 && var9 < Statics.field82 + var24 && var10 >= var25 && var10 < Statics.field3213 + var25;
            if (var8 == 1 && field880) {
                client.field528 = !client.field528;
                if (!client.field528 && Statics.field65.method2122() != null) {
                    Statics.field65.method2178((String) null);
                }
            }
            int var26 = Statics.field409 + 24;
            short var27 = 277;
            field882 = var9 >= var26 && var9 < Statics.field82 + var26 && var10 >= var27 && var10 < Statics.field3213 + var27;
            if (var8 == 1 && field882) {
                Statics.field65.method2104(!Statics.field65.method2138());
                if (!Statics.field65.method2138()) {
                    field900 = "";
                    Statics.field65.method2178((String) null);
                    if (client.field528 && field900 != null && field900.length() > 0) {
                        field902 = 1;
                    } else {
                        field902 = 0;
                    }
                }
            }
            label1048: while (true) {
                Transferable var33;
                int var34;
                do {
                    while (true) {
                        label964: do {
                            while (true) {
                                while (class24.method2886()) {
                                    if (Statics.field62 == 13) {
                                        method2643(0);
                                        field900 = "";
                                        field899 = "";
                                        Statics.field2913 = 0;
                                        Statics.field1272 = "";
                                        field901 = true;
                                    } else {
                                        if (field902 != 0) {
                                            continue label964;
                                        }
                                        char var28 = Statics.field1851;
                                        for (int var29 = 0; var29 < field903.length() && var28 != field903.charAt(var29); var29++) {
                                        }
                                        if (Statics.field62 == 85 && field900.length() > 0) {
                                            field900 = field900.substring(0, field900.length() - 1);
                                        }
                                        if (Statics.field62 == 84 || Statics.field62 == 80) {
                                            field902 = 1;
                                        }
                                        char var30 = Statics.field1851;
                                        boolean var31 = field903.indexOf(var30) != -1;
                                        if (var31 && field900.length() < 320) {
                                            field900 = field900 + Statics.field1851;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field902 != 1);
                        if (Statics.field62 == 85 && field899.length() > 0) {
                            field899 = field899.substring(0, field899.length() - 1);
                        } else if (Statics.field62 == 84 || Statics.field62 == 80) {
                            field902 = 0;
                            if (Statics.field62 == 84) {
                                field900 = field900.trim();
                                if (field900.length() == 0) {
                                    method5664(class309.field3770, class309.field3771, class309.field3772);
                                    return;
                                }
                                if (field899.length() == 0) {
                                    method5664(class309.field3773, class309.field3839, class309.field3802);
                                    return;
                                }
                                method5664(class309.field3651, class309.field3893, class309.field3894);
                                client.method1635(false);
                                client.method2046(20);
                                return;
                            }
                        }
                        if ((class24.field131[82] || class24.field131[87]) && Statics.field62 == 67) {
                            Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var33 = var32.getContents(Statics.field1075);
                            var34 = 20 - field899.length();
                            break;
                        }
                        char var47 = Statics.field1851;
                        boolean var48;
                        if (var47 >= ' ' && var47 < 127 || var47 > 127 && var47 < 160 || var47 > 160 && var47 <= 255) {
                            var48 = true;
                        } else {
                            label1194: {
                                if (var47 != 0) {
                                    char[] var49 = class342.field4158;
                                    for (int var50 = 0; var50 < var49.length; var50++) {
                                        char var51 = var49[var50];
                                        if (var47 == var51) {
                                            var48 = true;
                                            break label1194;
                                        }
                                    }
                                }
                                var48 = false;
                            }
                        }
                        if (var48) {
                            char var52 = Statics.field1851;
                            boolean var53 = field903.indexOf(var52) != -1;
                            if (var53 && field899.length() < 20) {
                                field899 = field899 + Statics.field1851;
                            }
                        }
                    }
                } while (var34 <= 0);
                try {
                    String var35 = (String) var33.getTransferData(DataFlavor.stringFlavor);
                    int var36 = Math.min(var34, var35.length());
                    int var37 = 0;
                    while (true) {
                        if (var37 >= var36) {
                            field899 = field899 + var35.substring(0, var36);
                            continue label1048;
                        }
                        char var38 = var35.charAt(var37);
                        boolean var39;
                        if ((var38 < ' ' || var38 >= 127) && (var38 <= 127 || var38 >= 160) && (var38 <= 160 || var38 > 255)) {
                            label1178: {
                                if (var38 != 0) {
                                    char[] var40 = class342.field4158;
                                    for (int var41 = 0; var41 < var40.length; var41++) {
                                        char var42 = var40[var41];
                                        if (var38 == var42) {
                                            var39 = true;
                                            break label1178;
                                        }
                                    }
                                }
                                var39 = false;
                            }
                        } else {
                            var39 = true;
                        }
                        if (!var39) {
                            break;
                        }
                        char var43 = var35.charAt(var37);
                        boolean var44 = field903.indexOf(var43) != -1;
                        if (!var44) {
                            break;
                        }
                        var37++;
                    }
                    method2643(3);
                    return;
                } catch (UnsupportedFlavorException var111) {
                } catch (IOException var112) {
                }
            }
        } else if (field890 == 3) {
            int var54 = field909 + 180;
            short var55 = 276;
            if (var8 == 1 && var9 >= var54 - 75 && var9 <= var54 + 75 && var10 >= var55 - 20 && var10 <= var55 + 20) {
                method4381(false);
            }
            int var56 = field909 + 180;
            short var57 = 326;
            if (var8 == 1 && var9 >= var56 - 75 && var9 <= var56 + 75 && var10 >= var57 - 20 && var10 <= var57 + 20) {
                method5664(class309.field3768, class309.field3927, class309.field3928);
                method2643(5);
                return;
            }
        } else if (field890 == 4) {
            int var58 = field909 + 180 - 80;
            short var59 = 321;
            if (var8 == 1 && var9 >= var58 - 75 && var9 <= var58 + 75 && var10 >= var59 - 20 && var10 <= var59 + 20) {
                Statics.field1272.trim();
                if (Statics.field1272.length() != 6) {
                    method5664(class309.field3653, class309.field3695, class309.field3691);
                    return;
                }
                Statics.field2913 = Integer.parseInt(Statics.field1272);
                Statics.field1272 = "";
                client.method1635(true);
                method5664(class309.field3651, class309.field3893, class309.field3894);
                client.method2046(20);
                return;
            }
            if (var8 == 1 && var9 >= field909 + 180 - 9 && var9 <= field909 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field901 = !field901;
            }
            if (var8 == 1 && var9 >= field909 + 180 - 34 && var9 <= field909 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class30.method1979(client.method4382("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var60 = field909 + 180 + 80;
            if (var8 == 1 && var9 >= var60 - 75 && var9 <= var60 + 75 && var10 >= var59 - 20 && var10 <= var59 + 20) {
                method2643(0);
                field900 = "";
                field899 = "";
                Statics.field2913 = 0;
                Statics.field1272 = "";
            }
            while (class24.method2886()) {
                boolean var61 = false;
                for (int var62 = 0; var62 < field904.length(); var62++) {
                    if (Statics.field1851 == field904.charAt(var62)) {
                        var61 = true;
                        break;
                    }
                }
                if (Statics.field62 == 13) {
                    method2643(0);
                    field900 = "";
                    field899 = "";
                    Statics.field2913 = 0;
                    Statics.field1272 = "";
                } else {
                    if (Statics.field62 == 85 && Statics.field1272.length() > 0) {
                        Statics.field1272 = Statics.field1272.substring(0, Statics.field1272.length() - 1);
                    }
                    if (Statics.field62 == 84) {
                        Statics.field1272.trim();
                        if (Statics.field1272.length() != 6) {
                            method5664(class309.field3653, class309.field3695, class309.field3691);
                            return;
                        }
                        Statics.field2913 = Integer.parseInt(Statics.field1272);
                        Statics.field1272 = "";
                        client.method1635(true);
                        method5664(class309.field3651, class309.field3893, class309.field3894);
                        client.method2046(20);
                        return;
                    }
                    if (var61 && Statics.field1272.length() < 6) {
                        Statics.field1272 = Statics.field1272 + Statics.field1851;
                    }
                }
            }
        } else if (field890 == 5) {
            int var63 = field909 + 180 - 80;
            short var64 = 321;
            if (var8 == 1 && var9 >= var63 - 75 && var9 <= var63 + 75 && var10 >= var64 - 20 && var10 <= var64 + 20) {
                method273();
                return;
            }
            int var65 = field909 + 180 + 80;
            if (var8 == 1 && var9 >= var65 - 75 && var9 <= var65 + 75 && var10 >= var64 - 20 && var10 <= var64 + 20) {
                method728(true);
            }
            short var66 = 361;
            if (Statics.field978 != null) {
                int var67 = Statics.field978.field4387 / 2;
                if (var8 == 1 && var9 >= Statics.field978.field4385 - var67 && var9 <= Statics.field978.field4385 + var67 && var10 >= var66 - 15 && var10 < var66) {
                    class30.method1979(client.method4382("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method2886()) {
                boolean var68 = false;
                for (int var69 = 0; var69 < field903.length(); var69++) {
                    if (Statics.field1851 == field903.charAt(var69)) {
                        var68 = true;
                        break;
                    }
                }
                if (Statics.field62 == 13) {
                    method728(true);
                } else {
                    if (Statics.field62 == 85 && field900.length() > 0) {
                        field900 = field900.substring(0, field900.length() - 1);
                    }
                    if (Statics.field62 == 84) {
                        method273();
                        return;
                    }
                    if (var68 && field900.length() < 320) {
                        field900 = field900 + Statics.field1851;
                    }
                }
            }
        } else if (field890 == 6) {
            while (true) {
                do {
                    if (!class24.method2886()) {
                        short var70 = 321;
                        if (var8 == 1 && var10 >= var70 - 20 && var10 <= var70 + 20) {
                            method728(true);
                        }
                        return;
                    }
                } while (Statics.field62 != 84 && Statics.field62 != 13);
                method728(true);
            }
        } else if (field890 == 7) {
            if (Statics.field1274 && !client.field491) {
                int var71 = Statics.field409 - 150;
                int var72 = var71 + 240 + 25 + 40;
                short var73 = 231;
                int var74 = var73 + 40;
                if (var8 == 1 && var9 >= var71 && var9 <= var72 && var10 >= var73 && var10 <= var74) {
                    field897 = method686(var71, var9);
                }
                int var75 = field909 + 180 - 80;
                short var76 = 321;
                if (var8 == 1 && var9 >= var75 - 75 && var9 <= var75 + 75 && var10 >= var76 - 20 && var10 <= var76 + 20) {
                    boolean var77 = method1772();
                    if (var77) {
                        client.method2046(50);
                        return;
                    }
                }
                int var78 = field909 + 180 + 80;
                if (var8 == 1 && var9 >= var78 - 75 && var9 <= var78 + 75 && var10 >= var76 - 20 && var10 <= var76 + 20) {
                    field877 = new String[8];
                    method728(true);
                }
                while (class24.method2886()) {
                    if (Statics.field62 == 101) {
                        field877[field897] = null;
                    }
                    if (Statics.field62 == 85) {
                        if (field877[field897] == null && field897 > 0) {
                            field897--;
                        }
                        field877[field897] = null;
                    }
                    if (Statics.field1851 >= '0' && Statics.field1851 <= '9') {
                        field877[field897] = "" + Statics.field1851;
                        if (field897 < 7) {
                            field897++;
                        }
                    }
                    if (Statics.field62 == 84) {
                        boolean var79 = method1772();
                        if (var79) {
                            client.method2046(50);
                        }
                        return;
                    }
                }
            } else {
                int var80 = field909 + 180 - 80;
                short var81 = 321;
                if (var8 == 1 && var9 >= var80 - 75 && var9 <= var80 + 75 && var10 >= var81 - 20 && var10 <= var81 + 20) {
                    class30.method1979(client.method4382("secure", true) + "m=dob/set_dob.ws", true, false);
                    method5664(class309.field3935, class309.field3924, class309.field3925);
                    method2643(6);
                    return;
                }
                int var82 = field909 + 180 + 80;
                if (var8 == 1 && var9 >= var82 - 75 && var9 <= var82 + 75 && var10 >= var81 - 20 && var10 <= var81 + 20) {
                    method728(true);
                }
            }
        } else if (field890 == 8) {
            int var83 = field909 + 180 - 80;
            short var84 = 321;
            if (var8 == 1 && var9 >= var83 - 75 && var9 <= var83 + 75 && var10 >= var84 - 20 && var10 <= var84 + 20) {
                class30.method1979("https://www.jagex.com/terms/privacy", true, false);
                method5664(class309.field3935, class309.field3924, class309.field3925);
                method2643(6);
                return;
            }
            int var85 = field909 + 180 + 80;
            if (var8 == 1 && var9 >= var85 - 75 && var9 <= var85 + 75 && var10 >= var84 - 20 && var10 <= var84 + 20) {
                method728(true);
            }
        } else if (field890 == 9) {
            int var86 = field909 + 180;
            short var87 = 311;
            if (Statics.field62 == 84 || Statics.field62 == 13 || var8 == 1 && var9 >= var86 - 75 && var9 <= var86 + 75 && var10 >= var87 - 20 && var10 <= var87 + 20) {
                method4381(false);
            }
        } else if (field890 == 10) {
            int var88 = field909 + 180;
            short var89 = 209;
            if (Statics.field62 == 84 || var8 == 1 && var9 >= var88 - 109 && var9 <= var88 + 109 && var10 >= var89 && var10 <= var89 + 68) {
                method5664(class309.field3651, class309.field3893, class309.field3894);
                client.field518 = class444.field4731;
                client.method1635(false);
                client.method2046(20);
            }
        } else if (field890 == 12) {
            int var90 = Statics.field409;
            short var91 = 233;
            class385 var92 = arg1.method5728(0, 30, class309.field3955, var90, var91);
            class385 var93 = arg1.method5728(32, 32, class309.field3955, var90, var91);
            class385 var94 = arg1.method5728(70, 34, class309.field3955, var90, var91);
            int var114 = var91 + 17;
            class385 var95 = arg1.method5728(0, 34, class309.field3956, var90, var114);
            if (var8 == 1) {
                if (var92.method6169(var9, var10)) {
                    class30.method1979("https://www.jagex.com/terms", true, false);
                } else if (var93.method6169(var9, var10)) {
                    class30.method1979("https://www.jagex.com/terms/privacy", true, false);
                } else if (var94.method6169(var9, var10) || var95.method6169(var9, var10)) {
                    class30.method1979("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var96 = Statics.field409 - 80;
            short var97 = 311;
            if (var8 == 1 && var9 >= var96 - 75 && var9 <= var96 + 75 && var10 >= var97 - 20 && var10 <= var97 + 20) {
                Statics.field65.method2187(client.field485);
                method4381(true);
            }
            int var98 = Statics.field409 + 80;
            if (var8 == 1 && var9 >= var98 - 75 && var9 <= var98 + 75 && var10 >= var97 - 20 && var10 <= var97 + 20) {
                field890 = 13;
            }
        } else if (field890 == 13) {
            int var99 = Statics.field409;
            short var100 = 321;
            if (var8 == 1 && var9 >= var99 - 75 && var9 <= var99 + 75 && var10 >= var100 - 20 && var10 <= var100 + 20) {
                method4381(true);
            }
        } else if (field890 == 14) {
            String var101 = "";
            switch(field888) {
                case 0:
                    var101 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var101 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method728(false);
            }
            int var102 = field909 + 180;
            short var103 = 276;
            if (var8 == 1 && var9 >= var102 - 75 && var9 <= var102 + 75 && var10 >= var103 - 20 && var10 <= var103 + 20) {
                class30.method1979(var101, true, false);
                method5664(class309.field3935, class309.field3924, class309.field3925);
                method2643(6);
                return;
            }
            int var104 = field909 + 180;
            short var105 = 326;
            if (var8 == 1 && var9 >= var104 - 75 && var9 <= var104 + 75 && var10 >= var105 - 20 && var10 <= var105 + 20) {
                method728(false);
            }
        } else if (field890 == 24) {
            int var106 = field909 + 180;
            short var107 = 301;
            if (var8 == 1 && var9 >= var106 - 75 && var9 <= var106 + 75 && var10 >= var107 - 20 && var10 <= var107 + 20) {
                method4381(false);
            }
        } else if (field890 == 26) {
            int var108 = field909 + 180 - 80;
            short var109 = 321;
            if (var8 == 1 && var9 >= var108 - 75 && var9 <= var108 + 75 && var10 >= var109 - 20 && var10 <= var109 + 20) {
                class30.method1979(client.method4382("secure", true) + "m=dob/set_dob.ws", true, false);
                method5664(class309.field3935, class309.field3924, class309.field3925);
                method2643(6);
                return;
            }
            int var110 = field909 + 180 + 80;
            if (var8 == 1 && var9 >= var110 - 75 && var9 <= var110 + 75 && var10 >= var109 - 20 && var10 <= var109 + 20) {
                method728(true);
            }
        }
    }

    @ObfuscatedName("bf.a(I)Z")
    public static boolean method1772() {
        Date var0;
        try {
            var0 = method2540();
        } catch (ParseException var8) {
            method2643(7);
            method5664("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        boolean var2 = method4606(var0);
        Calendar var3 = Calendar.getInstance();
        var3.set(2, 0);
        var3.set(5, 1);
        var3.set(1, 1900);
        Date var4 = var3.getTime();
        boolean var6 = var0.after(var4);
        if (!var6) {
            method2643(7);
            method5664("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var2) {
            Statics.field27 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field27 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("ju.m(Ljava/util/Date;I)Z")
    public static boolean method4606(Date arg0) {
        Calendar var1 = Calendar.getInstance();
        var1.set(1, var1.get(1) - 13);
        var1.set(5, var1.get(5) + 1);
        var1.set(11, 0);
        var1.set(12, 0);
        var1.set(13, 0);
        var1.set(14, 0);
        Date var2 = var1.getTime();
        return arg0.before(var2);
    }

    @ObfuscatedName("db.p(B)Ljava/util/Date;")
    public static Date method2540() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field877;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method2643(7);
                method5664("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("al.s(IIS)I")
    public static int method686(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("al.r(ZI)V")
    public static void method728(boolean arg0) {
        if (Statics.field1075.method1059() || Statics.field1075.method1427()) {
            method2643(10);
            return;
        }
        field892 = class309.field3874;
        field893 = class309.field3875;
        field894 = class309.field3876;
        method2643(2);
        if (arg0) {
            field899 = "";
        }
        if (field900 == null || field900.length() <= 0) {
            if (Statics.field65.method2122() == null) {
                client.field528 = false;
            } else {
                field900 = Statics.field65.method2122();
                client.field528 = true;
            }
        }
        if (client.field528 && field900 != null && field900.length() > 0) {
            field902 = 1;
        } else {
            field902 = 0;
        }
    }

    @ObfuscatedName("hj.v(ZI)V")
    public static void method4381(boolean arg0) {
        byte var1 = 0;
        if (!client.method2578()) {
            var1 = 12;
        } else if (Statics.field1075.method1059() || Statics.field1075.method1427()) {
            var1 = 10;
        }
        method2643(var1);
        if (arg0) {
            field900 = "";
            field899 = "";
            Statics.field2913 = 0;
            Statics.field1272 = "";
        }
        if (field900 == null || field900.length() <= 0) {
            if (Statics.field65.method2122() == null) {
                client.field528 = false;
            } else {
                field900 = Statics.field65.method2122();
                client.field528 = true;
            }
        }
        if (client.field528 && field900 != null && field900.length() > 0) {
            field902 = 1;
        } else {
            field902 = 0;
        }
    }

    @ObfuscatedName("d.y(I)V")
    public static void method273() {
        field900 = field900.trim();
        if (field900.length() == 0) {
            method5664(class309.field3768, class309.field3927, class309.field3928);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method4382("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class440 var4 = new class440(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4679, var4.field4678, 1000 - var4.field4678);
                if (var5 == -1) {
                    var4.field4678 = 0;
                    long var8 = var4.method7014();
                    var6 = var8;
                    break;
                }
                var4.field4678 += var5;
                if (var4.field4678 >= 1000) {
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
            var13 = class66.method2748(var6, field900);
        }
        switch(var13) {
            case 2:
                method5664(class309.field3713, class309.field3930, class309.field3707);
                method2643(6);
                break;
            case 3:
                method5664(class309.field3932, class309.field3684, class309.field3830);
                break;
            case 4:
                method5664(class309.field3810, class309.field3821, class309.field3937);
                break;
            case 5:
                method5664(class309.field3938, class309.field3796, class309.field3940);
                break;
            case 6:
                method5664(class309.field3941, class309.field3706, class309.field3943);
                break;
            case 7:
                method5664(class309.field3944, class309.field3702, class309.field3946);
        }
    }

    @ObfuscatedName("an.c(Lmx;Lmx;Lmx;I)V")
    public static void method764(class350 arg0, class350 arg1, class350 arg2) {
        field879 = (Statics.field841 - 765) / 2;
        field909 = field879 + 202;
        Statics.field409 = field909 + 180;
        if (field905) {
            method5397(arg0, arg1);
            return;
        }
        Statics.field1420.method7394(field879, 0);
        Statics.field1005.method7394(field879 + 382, 0);
        Statics.field1842.method7287(field879 + 382 - Statics.field1842.field4759 / 2, 18);
        if (client.field510 == 0 || client.field510 == 5) {
            byte var3 = 20;
            arg0.method5731(class309.field3873, field909 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class449.method7208(field909 + 180 - 152, var4, 304, 34, 9179409);
            class449.method7208(field909 + 180 - 151, var4 + 1, 302, 32, 0);
            class449.method7204(field909 + 180 - 150, var4 + 2, field886 * 3, 30, 9179409);
            class449.method7204(field886 * 3 + (field909 + 180 - 150), var4 + 2, 300 - field886 * 3, 30, 0);
            arg0.method5731(field887, field909 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field510 == 20) {
            Statics.field895.method7287(field909 + 180 - Statics.field895.field4759 / 2, 271 - Statics.field895.field4762 / 2);
            short var5 = 201;
            arg0.method5731(field892, field909 + 180, var5, 16776960, 0);
            int var128 = var5 + 15;
            arg0.method5731(field893, field909 + 180, var128, 16776960, 0);
            int var129 = var128 + 15;
            arg0.method5731(field894, field909 + 180, var129, 16776960, 0);
            int var130 = var129 + 15;
            int var131 = var130 + 7;
            if (field890 != 4 && field890 != 10) {
                arg0.method5729(class309.field3901, field909 + 180 - 110, var131, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method2964(); arg0.method5723(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method5729(class351.method5790(var7), field909 + 180 - 70, var131, 16777215, 0);
                var128 = var131 + 15;
                String var8 = field899;
                int var9 = var8.length();
                char[] var10 = new char[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var10[var11] = '*';
                }
                String var12 = new String(var10);
                String var14;
                for (var14 = var12; arg0.method5723(var14) > var6; var14 = var14.substring(1)) {
                }
                arg0.method5729(class309.field3659 + var14, field909 + 180 - 108, var128, 16777215, 0);
                var128 += 15;
            }
        }
        if (client.field510 == 10 || client.field510 == 11 || client.field510 == 50) {
            Statics.field895.method7287(field909, 171);
            if (field890 == 0) {
                short var15 = 251;
                arg0.method5731(class309.field3904, field909 + 180, var15, 16776960, 0);
                int var132 = var15 + 30;
                int var16 = field909 + 180 - 80;
                short var17 = 291;
                Statics.field898.method7287(var16 - 73, var17 - 20);
                arg0.method5732(class309.field3905, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var18 = field909 + 180 + 80;
                Statics.field898.method7287(var18 - 73, var17 - 20);
                arg0.method5732(class309.field3824, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field890 == 1) {
                arg0.method5731(field891, field909 + 180, 201, 16776960, 0);
                short var19 = 236;
                arg0.method5731(field892, field909 + 180, var19, 16777215, 0);
                int var133 = var19 + 15;
                arg0.method5731(field893, field909 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                arg0.method5731(field894, field909 + 180, var134, 16777215, 0);
                int var135 = var134 + 15;
                int var20 = field909 + 180 - 80;
                short var21 = 321;
                Statics.field898.method7287(var20 - 73, var21 - 20);
                arg0.method5731(class309.field3779, var20, var21 + 5, 16777215, 0);
                int var22 = field909 + 180 + 80;
                Statics.field898.method7287(var22 - 73, var21 - 20);
                arg0.method5731(class309.field3908, var22, var21 + 5, 16777215, 0);
            } else if (field890 == 2) {
                short var23 = 201;
                arg0.method5731(field892, Statics.field409, var23, 16776960, 0);
                int var136 = var23 + 15;
                arg0.method5731(field893, Statics.field409, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg0.method5731(field894, Statics.field409, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var139 = var138 + 7;
                arg0.method5729(class309.field3901, Statics.field409 - 110, var139, 16777215, 0);
                short var24 = 200;
                String var25;
                for (var25 = method2964(); arg0.method5723(var25) > var24; var25 = var25.substring(1)) {
                }
                arg0.method5729(class351.method5790(var25) + (field902 == 0 & client.field631 % 40 < 20 ? class93.method2957(16776960) + class93.field1266 : ""), Statics.field409 - 70, var139, 16777215, 0);
                var136 = var139 + 15;
                String var26 = field899;
                int var27 = var26.length();
                char[] var28 = new char[var27];
                for (int var29 = 0; var29 < var27; var29++) {
                    var28[var29] = '*';
                }
                String var30 = new String(var28);
                String var32;
                for (var32 = var30; arg0.method5723(var32) > var24; var32 = var32.substring(1)) {
                }
                arg0.method5729(class309.field3659 + var32 + (field902 == 1 & client.field631 % 40 < 20 ? class93.method2957(16776960) + class93.field1266 : ""), Statics.field409 - 108, var136, 16777215, 0);
                var136 += 15;
                short var33 = 277;
                int var34 = Statics.field409 + -117;
                boolean var35 = client.field528;
                boolean var36 = field880;
                class452 var37 = var35 ? (var36 ? Statics.field1355 : Statics.field1361) : (var36 ? Statics.field889 : Statics.field873);
                var37.method7287(var34, var33);
                int var39 = var37.field4759 + 5 + var34;
                arg1.method5729(class309.field3909, var39, var33 + 13, 16776960, 0);
                int var40 = Statics.field409 + 24;
                boolean var41 = Statics.field65.method2138();
                boolean var42 = field882;
                class452 var43 = var41 ? (var42 ? Statics.field1355 : Statics.field1361) : (var42 ? Statics.field889 : Statics.field873);
                var43.method7287(var40, var33);
                int var45 = var43.field4759 + 5 + var40;
                arg1.method5729(class309.field3748, var45, var33 + 13, 16776960, 0);
                int var140 = var33 + 15;
                int var46 = Statics.field409 - 80;
                short var47 = 321;
                Statics.field898.method7287(var46 - 73, var47 - 20);
                arg0.method5731(class309.field3869, var46, var47 + 5, 16777215, 0);
                int var48 = Statics.field409 + 80;
                Statics.field898.method7287(var48 - 73, var47 - 20);
                arg0.method5731(class309.field3908, var48, var47 + 5, 16777215, 0);
                short var49 = 357;
                switch(field908) {
                    case 2:
                        Statics.field90 = class309.field3878;
                        break;
                    default:
                        Statics.field90 = class309.field3920;
                }
                Statics.field977 = new class385(Statics.field409, var49, arg1.method5723(Statics.field90), 11);
                Statics.field978 = new class385(Statics.field409, var49, arg1.method5723(class309.field3921), 11);
                arg1.method5731(Statics.field90, Statics.field409, var49, 16777215, 0);
            } else if (field890 == 3) {
                short var50 = 201;
                arg0.method5731(class309.field3692, field909 + 180, var50, 16776960, 0);
                int var141 = var50 + 20;
                arg1.method5731(class309.field3912, field909 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg1.method5731(class309.field3913, field909 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var51 = field909 + 180;
                short var52 = 276;
                Statics.field898.method7287(var51 - 73, var52 - 20);
                arg2.method5731(class309.field3914, var51, var52 + 5, 16777215, 0);
                int var53 = field909 + 180;
                short var54 = 326;
                Statics.field898.method7287(var53 - 73, var54 - 20);
                arg2.method5731(class309.field3915, var53, var54 + 5, 16777215, 0);
            } else if (field890 == 4) {
                arg0.method5731(class309.field3890, field909 + 180, 201, 16776960, 0);
                short var55 = 236;
                arg0.method5731(field892, field909 + 180, var55, 16777215, 0);
                int var144 = var55 + 15;
                arg0.method5731(field893, field909 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                arg0.method5731(field894, field909 + 180, var145, 16777215, 0);
                int var146 = var145 + 15;
                String var57 = class309.field3774;
                String var58 = Statics.field1272;
                int var59 = var58.length();
                char[] var60 = new char[var59];
                for (int var61 = 0; var61 < var59; var61++) {
                    var60[var61] = '*';
                }
                String var62 = new String(var60);
                arg0.method5729(var57 + var62 + (client.field631 % 40 < 20 ? class93.method2957(16776960) + class93.field1266 : ""), field909 + 180 - 108, var146, 16777215, 0);
                var144 = var146 - 8;
                arg0.method5729(class309.field3782, field909 + 180 - 9, var144, 16776960, 0);
                var144 += 15;
                arg0.method5729(class309.field3660, field909 + 180 - 9, var144, 16776960, 0);
                int var64 = field909 + 180 - 9 + arg0.method5723(class309.field3660) + 15;
                int var65 = var144 - arg0.field4189;
                class452 var66;
                if (field901) {
                    var66 = Statics.field1361;
                } else {
                    var66 = Statics.field873;
                }
                var66.method7287(var64, var65);
                var144 += 15;
                int var67 = field909 + 180 - 80;
                short var68 = 321;
                Statics.field898.method7287(var67 - 73, var68 - 20);
                arg0.method5731(class309.field3779, var67, var68 + 5, 16777215, 0);
                int var69 = field909 + 180 + 80;
                Statics.field898.method7287(var69 - 73, var68 - 20);
                arg0.method5731(class309.field3908, var69, var68 + 5, 16777215, 0);
                arg1.method5731(class309.field3806, field909 + 180, var68 + 36, 255, 0);
            } else if (field890 == 5) {
                arg0.method5731(class309.field3916, field909 + 180, 201, 16776960, 0);
                short var70 = 221;
                arg2.method5731(field892, field909 + 180, var70, 16776960, 0);
                int var147 = var70 + 15;
                arg2.method5731(field893, field909 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg2.method5731(field894, field909 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var150 = var149 + 14;
                arg0.method5729(class309.field3917, field909 + 180 - 145, var150, 16777215, 0);
                short var71 = 174;
                String var72;
                for (var72 = method2964(); arg0.method5723(var72) > var71; var72 = var72.substring(1)) {
                }
                arg0.method5729(class351.method5790(var72) + (client.field631 % 40 < 20 ? class93.method2957(16776960) + class93.field1266 : ""), field909 + 180 - 34, var150, 16777215, 0);
                var147 = var150 + 15;
                int var73 = field909 + 180 - 80;
                short var74 = 321;
                Statics.field898.method7287(var73 - 73, var74 - 20);
                arg0.method5731(class309.field3918, var73, var74 + 5, 16777215, 0);
                int var75 = field909 + 180 + 80;
                Statics.field898.method7287(var75 - 73, var74 - 20);
                arg0.method5731(class309.field3710, var75, var74 + 5, 16777215, 0);
                short var76 = 356;
                arg1.method5731(class309.field3921, Statics.field409, var76, 268435455, 0);
            } else if (field890 == 6) {
                short var77 = 201;
                arg0.method5731(field892, field909 + 180, var77, 16776960, 0);
                int var151 = var77 + 15;
                arg0.method5731(field893, field909 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg0.method5731(field894, field909 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var78 = field909 + 180;
                short var79 = 321;
                Statics.field898.method7287(var78 - 73, var79 - 20);
                arg0.method5731(class309.field3710, var78, var79 + 5, 16777215, 0);
            } else if (field890 == 7) {
                if (Statics.field1274 && !client.field491) {
                    short var80 = 201;
                    arg0.method5731(field892, Statics.field409, var80, 16776960, 0);
                    int var154 = var80 + 15;
                    arg0.method5731(field893, Statics.field409, var154, 16776960, 0);
                    int var155 = var154 + 15;
                    arg0.method5731(field894, Statics.field409, var155, 16776960, 0);
                    int var81 = Statics.field409 - 150;
                    int var156 = var155 + 10;
                    for (int var82 = 0; var82 < 8; var82++) {
                        Statics.field898.method7289(var81, var156, 30, 40);
                        boolean var83 = field897 == var82 & client.field631 % 40 < 20;
                        arg0.method5729((field877[var82] == null ? "" : field877[var82]) + (var83 ? class93.method2957(16776960) + class93.field1266 : ""), var81 + 10, var156 + 27, 16777215, 0);
                        if (var82 == 1 || var82 == 3) {
                            var81 += 50;
                            arg0.method5729(class351.method5790("/"), var81 - 13, var156 + 27, 16777215, 0);
                        } else {
                            var81 += 35;
                        }
                    }
                    int var84 = Statics.field409 - 80;
                    short var85 = 321;
                    Statics.field898.method7287(var84 - 73, var85 - 20);
                    arg0.method5731("Submit", var84, var85 + 5, 16777215, 0);
                    int var86 = Statics.field409 + 80;
                    Statics.field898.method7287(var86 - 73, var85 - 20);
                    arg0.method5731(class309.field3908, var86, var85 + 5, 16777215, 0);
                } else {
                    short var87 = 216;
                    arg0.method5731(class309.field3947, field909 + 180, var87, 16776960, 0);
                    int var157 = var87 + 15;
                    arg2.method5731(class309.field3814, field909 + 180, var157, 16776960, 0);
                    int var158 = var157 + 15;
                    arg2.method5731(class309.field3949, field909 + 180, var158, 16776960, 0);
                    int var159 = var158 + 15;
                    int var88 = field909 + 180 - 80;
                    short var89 = 321;
                    Statics.field898.method7287(var88 - 73, var89 - 20);
                    arg0.method5731(class309.field3950, var88, var89 + 5, 16777215, 0);
                    int var90 = field909 + 180 + 80;
                    Statics.field898.method7287(var90 - 73, var89 - 20);
                    arg0.method5731(class309.field3710, var90, var89 + 5, 16777215, 0);
                }
            } else if (field890 == 8) {
                short var91 = 216;
                arg0.method5731(class309.field3788, field909 + 180, var91, 16776960, 0);
                int var160 = var91 + 15;
                arg2.method5731(class309.field3789, field909 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg2.method5731(class309.field3790, field909 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                int var92 = field909 + 180 - 80;
                short var93 = 321;
                Statics.field898.method7287(var92 - 73, var93 - 20);
                arg0.method5731(class309.field3791, var92, var93 + 5, 16777215, 0);
                int var94 = field909 + 180 + 80;
                Statics.field898.method7287(var94 - 73, var93 - 20);
                arg0.method5731(class309.field3710, var94, var93 + 5, 16777215, 0);
            } else if (field890 == 9) {
                short var95 = 221;
                arg0.method5731(field892, field909 + 180, var95, 16776960, 0);
                int var163 = var95 + 25;
                arg0.method5731(field893, field909 + 180, var163, 16776960, 0);
                int var164 = var163 + 25;
                arg0.method5731(field894, field909 + 180, var164, 16776960, 0);
                int var96 = field909 + 180;
                short var97 = 311;
                Statics.field898.method7287(var96 - 73, var97 - 20);
                arg0.method5731(class309.field3914, var96, var97 + 5, 16777215, 0);
            } else if (field890 == 10) {
                int var98 = field909 + 180;
                short var99 = 209;
                arg0.method5731(class309.field3904, field909 + 180, var99, 16776960, 0);
                int var165 = var99 + 20;
                Statics.field1840.method7287(var98 - 109, var165);
                Statics.field883.method7287(var98 - 48, var165 + 18);
            } else if (field890 == 12) {
                int var100 = Statics.field409;
                short var101 = 216;
                arg2.method5731(class309.field3712, var100, var101, 16777215, 0);
                int var166 = var101 + 17;
                arg2.method5731(class309.field3955, var100, var166, 16777215, 0);
                int var167 = var166 + 17;
                arg2.method5731(class309.field3956, var100, var167, 16777215, 0);
                int var168 = var167 + 17;
                arg2.method5731(class309.field3726, var100, var168, 16777215, 0);
                int var102 = Statics.field409 - 80;
                short var103 = 311;
                Statics.field898.method7287(var102 - 73, var103 - 20);
                arg0.method5731(class309.field3919, var102, var103 + 5, 16777215, 0);
                int var104 = Statics.field409 + 80;
                Statics.field898.method7287(var104 - 73, var103 - 20);
                arg0.method5731(class309.field3961, var104, var103 + 5, 16777215, 0);
            } else if (field890 == 13) {
                short var105 = 231;
                arg2.method5731(class309.field3958, field909 + 180, var105, 16777215, 0);
                int var169 = var105 + 20;
                arg2.method5731(class309.field3929, field909 + 180, var169, 16777215, 0);
                int var106 = field909 + 180;
                short var107 = 311;
                Statics.field898.method7287(var106 - 73, var107 - 20);
                arg0.method5731(class309.field3710, var106, var107 + 5, 16777215, 0);
            } else if (field890 == 14) {
                short var108 = 201;
                String var109 = "";
                String var110 = "";
                String var111 = "";
                switch(field888) {
                    case 0:
                        var109 = class309.field3704;
                        var110 = class309.field3690;
                        var111 = class309.field3856;
                        break;
                    case 1:
                        var109 = class309.field3678;
                        var110 = class309.field3744;
                        var111 = class309.field3745;
                        break;
                    default:
                        method728(false);
                }
                arg0.method5731(var109, field909 + 180, var108, 16776960, 0);
                int var170 = var108 + 15;
                arg2.method5731(var110, field909 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg2.method5731(var111, field909 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var112 = field909 + 180;
                short var113 = 276;
                Statics.field898.method7287(var112 - 73, var113 - 20);
                arg0.method5731(class309.field3688, var112, var113 + 5, 16777215, 0);
                int var114 = field909 + 180;
                short var115 = 326;
                Statics.field898.method7287(var114 - 73, var115 - 20);
                arg0.method5731(class309.field3710, var114, var115 + 5, 16777215, 0);
            } else if (field890 == 24) {
                short var116 = 221;
                arg0.method5731(field892, field909 + 180, var116, 16777215, 0);
                int var173 = var116 + 15;
                arg0.method5731(field893, field909 + 180, var173, 16777215, 0);
                int var174 = var173 + 15;
                arg0.method5731(field894, field909 + 180, var174, 16777215, 0);
                int var175 = var174 + 15;
                int var117 = field909 + 180;
                short var118 = 301;
                Statics.field898.method7287(var117 - 73, var118 - 20);
                arg0.method5731(class309.field3654, var117, var118 + 5, 16777215, 0);
            } else if (field890 == 26) {
                short var119 = 216;
                arg0.method5731(class309.field3947, field909 + 180, var119, 16776960, 0);
                int var176 = var119 + 15;
                arg2.method5731(class309.field3814, field909 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                arg2.method5731(class309.field3949, field909 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                int var120 = field909 + 180 - 80;
                short var121 = 321;
                Statics.field898.method7287(var120 - 73, var121 - 20);
                arg0.method5731(class309.field3950, var120, var121 + 5, 16777215, 0);
                int var122 = field909 + 180 + 80;
                Statics.field898.method7287(var122 - 73, var121 - 20);
                arg0.method5731(class309.field3710, var122, var121 + 5, 16777215, 0);
            }
        }
        if (client.field510 >= 10) {
            int[] var123 = new int[4];
            class449.method7198(var123);
            class449.method7259(field879, 0, field879 + 765, Statics.field4663);
            Statics.field2254.method2069(field879 - 22, client.field631);
            Statics.field2254.method2069(field879 + 765 + 22 - 128, client.field631);
            class449.method7253(var123);
        }
        Statics.field4261[Statics.field65.method2107() ? 1 : 0].method7287(field879 + 765 - 40, 463);
        if (client.field510 <= 5 || Statics.field3066 != class331.field4120) {
            return;
        }
        if (Statics.field3998 == null) {
            Statics.field3998 = class454.method2897(Statics.field3638, "sl_button", "");
            return;
        }
        int var124 = field879 + 5;
        short var125 = 463;
        byte var126 = 100;
        byte var127 = 35;
        Statics.field3998.method7287(var124, var125);
        arg0.method5731(class309.field3828 + " " + client.field539, var126 / 2 + var124, var127 / 2 + var125 - 2, 16777215, 0);
        if (Statics.field1258 == null) {
            arg1.method5731(class309.field3972, var126 / 2 + var124, var127 / 2 + var125 + 12, 16777215, 0);
        } else {
            arg1.method5731(class309.field3732, var126 / 2 + var124, var127 / 2 + var125 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("me.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5664(String arg0, String arg1, String arg2) {
        field892 = arg0;
        field893 = arg1;
        field894 = arg2;
    }

    @ObfuscatedName("lq.b(Lmx;Lmx;I)V")
    public static void method5397(class350 arg0, class350 arg1) {
        if (Statics.field214 == null) {
            Statics.field214 = class454.method3910(Statics.field3638, "sl_back", "");
        }
        if (Statics.field2945 == null) {
            class314 var2 = Statics.field3638;
            int var3 = var2.method5206("sl_flags");
            int var4 = var2.method5207(var3, "");
            class452[] var5 = class454.method1957(var2, var3, var4);
            Statics.field2945 = var5;
        }
        if (Statics.field1445 == null) {
            class314 var6 = Statics.field3638;
            int var7 = var6.method5206("sl_arrows");
            int var8 = var6.method5207(var7, "");
            class452[] var9 = class454.method1957(var6, var7, var8);
            Statics.field1445 = var9;
        }
        if (Statics.field3203 == null) {
            class314 var10 = Statics.field3638;
            int var11 = var10.method5206("sl_stars");
            int var12 = var10.method5207(var11, "");
            class452[] var13 = class454.method1957(var10, var11, var12);
            Statics.field3203 = var13;
        }
        if (Statics.field1566 == null) {
            Statics.field1566 = class454.method2897(Statics.field3638, "leftarrow", "");
        }
        if (Statics.field4621 == null) {
            Statics.field4621 = class454.method2897(Statics.field3638, "rightarrow", "");
        }
        class449.method7204(field879, 23, 765, 480, 0);
        class449.method7200(field879, 0, 125, 23, 12425273, 9135624);
        class449.method7200(field879 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5731(class309.field3760, field879 + 62, 15, 0, -1);
        if (Statics.field3203 != null) {
            Statics.field3203[1].method7287(field879 + 140, 1);
            arg1.method5729(class309.field3963, field879 + 152, 10, 16777215, -1);
            Statics.field3203[0].method7287(field879 + 140, 12);
            arg1.method5729(class309.field3964, field879 + 152, 21, 16777215, -1);
        }
        if (Statics.field1445 != null) {
            int var14 = field879 + 280;
            if (class61.field786[0] == 0 && class61.field781[0] == 0) {
                Statics.field1445[2].method7287(var14, 4);
            } else {
                Statics.field1445[0].method7287(var14, 4);
            }
            if (class61.field786[0] == 0 && class61.field781[0] == 1) {
                Statics.field1445[3].method7287(var14 + 15, 4);
            } else {
                Statics.field1445[1].method7287(var14 + 15, 4);
            }
            arg0.method5729(class309.field3858, var14 + 32, 17, 16777215, -1);
            int var15 = field879 + 390;
            if (class61.field786[0] == 1 && class61.field781[0] == 0) {
                Statics.field1445[2].method7287(var15, 4);
            } else {
                Statics.field1445[0].method7287(var15, 4);
            }
            if (class61.field786[0] == 1 && class61.field781[0] == 1) {
                Statics.field1445[3].method7287(var15 + 15, 4);
            } else {
                Statics.field1445[1].method7287(var15 + 15, 4);
            }
            arg0.method5729(class309.field3818, var15 + 32, 17, 16777215, -1);
            int var16 = field879 + 500;
            if (class61.field786[0] == 2 && class61.field781[0] == 0) {
                Statics.field1445[2].method7287(var16, 4);
            } else {
                Statics.field1445[0].method7287(var16, 4);
            }
            if (class61.field786[0] == 2 && class61.field781[0] == 1) {
                Statics.field1445[3].method7287(var16 + 15, 4);
            } else {
                Statics.field1445[1].method7287(var16 + 15, 4);
            }
            arg0.method5729(class309.field3967, var16 + 32, 17, 16777215, -1);
            int var17 = field879 + 610;
            if (class61.field786[0] == 3 && class61.field781[0] == 0) {
                Statics.field1445[2].method7287(var17, 4);
            } else {
                Statics.field1445[0].method7287(var17, 4);
            }
            if (class61.field786[0] == 3 && class61.field781[0] == 1) {
                Statics.field1445[3].method7287(var17 + 15, 4);
            } else {
                Statics.field1445[1].method7287(var17 + 15, 4);
            }
            arg0.method5729(class309.field3968, var17 + 32, 17, 16777215, -1);
        }
        class449.method7204(field879 + 708, 4, 50, 16, 0);
        arg1.method5731(class309.field3908, field879 + 708 + 25, 16, 16777215, -1);
        field896 = -1;
        if (Statics.field214 != null) {
            byte var18 = 88;
            byte var19 = 19;
            int var20 = 765 / (var18 + 1) - 1;
            int var21 = 480 / (var19 + 1);
            int var22;
            int var23;
            do {
                var22 = var21;
                var23 = var20;
                if ((var20 - 1) * var21 >= class61.field783) {
                    var20--;
                }
                if ((var21 - 1) * var20 >= class61.field783) {
                    var21--;
                }
                if ((var21 - 1) * var20 >= class61.field783) {
                    var21--;
                }
            } while (var21 != var22 || var20 != var23);
            int var24 = (765 - var18 * var20) / (var20 + 1);
            if (var24 > 5) {
                var24 = 5;
            }
            int var25 = (480 - var19 * var21) / (var21 + 1);
            if (var25 > 5) {
                var25 = 5;
            }
            int var26 = (765 - var18 * var20 - (var20 - 1) * var24) / 2;
            int var27 = (480 - var19 * var21 - (var21 - 1) * var25) / 2;
            int var28 = (class61.field783 + var21 - 1) / var21;
            field906 = var28 - var20;
            if (Statics.field1566 != null && field907 > 0) {
                Statics.field1566.method7287(8, Statics.field4663 / 2 - Statics.field1566.field4762 / 2);
            }
            if (Statics.field4621 != null && field907 < field906) {
                Statics.field4621.method7287(Statics.field841 - Statics.field4621.field4759 - 8, Statics.field4663 / 2 - Statics.field4621.field4762 / 2);
            }
            int var29 = var27 + 23;
            int var30 = field879 + var26;
            int var31 = 0;
            boolean var32 = false;
            int var33 = field907;
            for (int var34 = var21 * var33; var34 < class61.field783 && var33 - field907 < var20; var34++) {
                class61 var35 = Statics.field785[var34];
                boolean var36 = true;
                String var37 = Integer.toString(var35.field779);
                if (var35.field779 == -1) {
                    var37 = class309.field3969;
                    var36 = false;
                } else if (var35.field779 > 1980) {
                    var37 = class309.field3970;
                    var36 = false;
                }
                int var38 = 0;
                byte var39;
                if (var35.method1523()) {
                    if (var35.method1551()) {
                        var39 = 7;
                    } else {
                        var39 = 6;
                    }
                } else if (var35.method1522()) {
                    var38 = 16711680;
                    if (var35.method1551()) {
                        var39 = 5;
                    } else {
                        var39 = 4;
                    }
                } else if (var35.method1524()) {
                    if (var35.method1551()) {
                        var39 = 9;
                    } else {
                        var39 = 8;
                    }
                } else if (var35.method1521()) {
                    if (var35.method1551()) {
                        var39 = 3;
                    } else {
                        var39 = 2;
                    }
                } else if (var35.method1551()) {
                    var39 = 1;
                } else {
                    var39 = 0;
                }
                if (class33.field227 >= var30 && class33.field228 >= var29 && class33.field227 < var18 + var30 && class33.field228 < var19 + var29 && var36) {
                    field896 = var34;
                    Statics.field214[var39].method7326(var30, var29, 128, 16777215);
                    var32 = true;
                } else {
                    Statics.field214[var39].method7394(var30, var29);
                }
                if (Statics.field2945 != null) {
                    Statics.field2945[(var35.method1551() ? 8 : 0) + var35.field792].method7287(var30 + 29, var29);
                }
                arg0.method5731(Integer.toString(var35.field787), var30 + 15, var19 / 2 + var29 + 5, var38, -1);
                arg1.method5731(var37, var30 + 60, var19 / 2 + var29 + 5, 268435455, -1);
                var29 += var19 + var25;
                var31++;
                if (var31 >= var21) {
                    var29 = var27 + 23;
                    var30 += var18 + var24;
                    var31 = 0;
                    var33++;
                }
            }
            if (var32) {
                int var40 = arg1.method5723(Statics.field785[field896].field782) + 6;
                int var41 = arg1.field4189 + 8;
                int var42 = class33.field228 + 25;
                if (var41 + var42 > 480) {
                    var42 = class33.field228 - 25 - var41;
                }
                class449.method7204(class33.field227 - var40 / 2, var42, var40, var41, 16777120);
                class449.method7208(class33.field227 - var40 / 2, var42, var40, var41, 0);
                arg1.method5731(Statics.field785[field896].field782, class33.field227, arg1.field4189 + var42 + 4, 0, -1);
            }
        }
        Statics.field153.method385(0, 0);
    }

    @ObfuscatedName("ej.t(Laj;I)V")
    public static void method2659(class32 arg0) {
        while (class24.method2886()) {
            if (Statics.field62 == 13) {
                method4519();
                return;
            }
            if (Statics.field62 == 96) {
                if (field907 > 0 && Statics.field1566 != null) {
                    field907--;
                }
            } else if (Statics.field62 == 97 && field907 < field906 && Statics.field4621 != null) {
                field907++;
            }
        }
        if (class33.field238 != 1 && Statics.field914 || class33.field238 != 4) {
            return;
        }
        int var1 = field879 + 280;
        if (class33.field235 >= var1 && class33.field235 <= var1 + 14 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(0, 0);
            return;
        }
        if (class33.field235 >= var1 + 15 && class33.field235 <= var1 + 80 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(0, 1);
            return;
        }
        int var2 = field879 + 390;
        if (class33.field235 >= var2 && class33.field235 <= var2 + 14 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(1, 0);
            return;
        }
        if (class33.field235 >= var2 + 15 && class33.field235 <= var2 + 80 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(1, 1);
            return;
        }
        int var3 = field879 + 500;
        if (class33.field235 >= var3 && class33.field235 <= var3 + 14 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(2, 0);
            return;
        }
        if (class33.field235 >= var3 + 15 && class33.field235 <= var3 + 80 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(2, 1);
            return;
        }
        int var4 = field879 + 610;
        if (class33.field235 >= var4 && class33.field235 <= var4 + 14 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(3, 0);
            return;
        }
        if (class33.field235 >= var4 + 15 && class33.field235 <= var4 + 80 && class33.field240 >= 4 && class33.field240 <= 18) {
            class61.method5126(3, 1);
            return;
        }
        if (class33.field235 >= field879 + 708 && class33.field240 >= 4 && class33.field235 <= field879 + 708 + 50 && class33.field240 <= 20) {
            method4519();
            return;
        }
        if (field896 != -1) {
            class61 var5 = Statics.field785[field896];
            method2969(var5);
            method4519();
            return;
        }
        if (field907 > 0 && Statics.field1566 != null && class33.field235 >= 0 && class33.field235 <= Statics.field1566.field4759 && class33.field240 >= Statics.field4663 / 2 - 50 && class33.field240 <= Statics.field4663 / 2 + 50) {
            field907--;
        }
        if (field907 < field906 && Statics.field4621 != null && class33.field235 >= Statics.field841 - Statics.field4621.field4759 - 5 && class33.field235 <= Statics.field841 && class33.field240 >= Statics.field4663 / 2 - 50 && class33.field240 <= Statics.field4663 / 2 + 50) {
            field907++;
        }
    }

    @ObfuscatedName("ft.g(Lbx;I)V")
    public static void method2969(class61 arg0) {
        if (arg0.method1551() != client.field482) {
            client.field482 = arg0.method1551();
            boolean var1 = arg0.method1551();
            if (Statics.field1081 != var1) {
                class189.method2243();
                Statics.field1081 = var1;
            }
        }
        if (client.field480 != arg0.field788) {
            class314 var2 = Statics.field3638;
            int var3 = arg0.field788;
            if ((var3 & 0x20000000) != 0) {
                Statics.field1842 = class454.method2897(var2, "logo_deadman_mode", "");
            } else if ((var3 & 0x40000000) == 0) {
                Statics.field1842 = class454.method2897(var2, "logo", "");
            } else {
                Statics.field1842 = class454.method2897(var2, "logo_seasonal_mode", "");
            }
        }
        Statics.field4246 = arg0.field789;
        client.field539 = arg0.field787;
        client.field480 = arg0.field788;
        Statics.field997 = client.field597 == 0 ? 43594 : arg0.field787 + 40000;
        Statics.field4091 = client.field597 == 0 ? 443 : arg0.field787 + 50000;
        Statics.field2763 = Statics.field997;
    }

    @ObfuscatedName("oh.x(IB)V")
    public static void method6375(int arg0) {
        method2643(14);
        field888 = arg0;
    }

    @ObfuscatedName("ca.n(I)V")
    public static void method2021() {
        if (class61.method2200()) {
            field905 = true;
            field907 = 0;
            field906 = 0;
        }
    }

    @ObfuscatedName("ii.e(I)V")
    public static void method4519() {
        field905 = false;
        Statics.field1420.method7394(field879, 0);
        Statics.field1005.method7394(field879 + 382, 0);
        Statics.field1842.method7287(field879 + 382 - Statics.field1842.field4759 / 2, 18);
    }

    @ObfuscatedName("dq.h(II)V")
    public static void method2643(int arg0) {
        if (field890 != arg0) {
            field890 = arg0;
        }
    }
}
