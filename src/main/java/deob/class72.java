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

@ObfuscatedName("bu")
public class class72 {

    @ObfuscatedName("bu.v")
    public static int field925 = 0;

    @ObfuscatedName("bu.q")
    public static int field923 = field925 + 202;

    @ObfuscatedName("bu.e")
    public static int field914 = 10;

    @ObfuscatedName("bu.g")
    public static String field915 = "";

    @ObfuscatedName("bu.ae")
    public static int field917 = -1;

    @ObfuscatedName("bu.ab")
    public static int field918 = 1;

    @ObfuscatedName("bu.ao")
    public static int field919 = 0;

    @ObfuscatedName("bu.bj")
    public static String field920 = "";

    @ObfuscatedName("bu.bf")
    public static String field921 = "";

    @ObfuscatedName("bu.bz")
    public static String field930 = "";

    @ObfuscatedName("bu.br")
    public static String field916 = "";

    @ObfuscatedName("bu.bm")
    public static String field924 = "";

    @ObfuscatedName("bu.be")
    public static String field913 = "";

    @ObfuscatedName("bu.bl")
    public static int field926 = 0;

    @ObfuscatedName("bu.bq")
    public static String[] field927 = new String[8];

    @ObfuscatedName("bu.bd")
    public static String field928 = "";

    @ObfuscatedName("bu.bp")
    public static boolean field940 = false;

    @ObfuscatedName("bu.bc")
    public static boolean field935 = false;

    @ObfuscatedName("bu.bx")
    public static boolean field931 = true;

    @ObfuscatedName("bu.bv")
    public static int field932 = 0;

    @ObfuscatedName("bu.cu")
    public static String field908 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bu.cr")
    public static String field934 = "1234567890";

    @ObfuscatedName("bu.cp")
    public static boolean field910 = false;

    @ObfuscatedName("bu.ct")
    public static int field937 = -1;

    @ObfuscatedName("bu.cb")
    public static int field938 = 0;

    @ObfuscatedName("bu.cz")
    public static int field946 = 0;

    @ObfuscatedName("bu.cy")
    public static long field922;

    @ObfuscatedName("bu.cv")
    public static long field905;

    @ObfuscatedName("bu.cf")
    public static String[] field942;

    @ObfuscatedName("bu.cm")
    public static String[] field943;

    @ObfuscatedName("bu.ce")
    public static String[] field903;

    static {
        new DecimalFormat("##0.00");
        new class130();
        field922 = -1L;
        field905 = -1L;
        field942 = new String[] { "title.jpg" };
        field943 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field903 = new String[] { "logo_speedrunning" };
    }

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.f(Lln;Lln;I)I")
    public static int method4869(class337 arg0, class337 arg1) {
        int var2 = 0;
        String[] var3 = field942;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5991(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field943;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5991(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field903;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method5988(var11) != -1 && arg1.method5991(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("oo.v(I)Ljava/lang/String;")
    public static String method6998() {
        String var2;
        if (Statics.field1404.method2368()) {
            String var0 = field924;
            String var1 = class365.method359('*', var0.length());
            var2 = var1;
        } else {
            var2 = field924;
        }
        return var2;
    }

    @ObfuscatedName("bt.s(I)V")
    public static void method1818() {
        if (field924 != null && field924.length() > 0) {
            return;
        }
        if (Statics.field1404.method2429() == null) {
            client.field549 = false;
        } else {
            field924 = Statics.field1404.method2429();
            client.field549 = true;
        }
    }

    @ObfuscatedName("gp.z(Lln;IB)V")
    public static void method3647(class337 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field199 = class489.method3345(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) != 0) {
            Statics.field199 = class489.method3345(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & 0x100) == 0) {
            Statics.field199 = class489.method3345(arg0, "logo", "");
        } else {
            Statics.field199 = class489.method3345(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("mz.j(I)V")
    public static void method6402() {
        if (client.field549 && field924 != null && field924.length() > 0) {
            field932 = 1;
        } else {
            field932 = 0;
        }
    }

    @ObfuscatedName("db.i(Laj;Lnv;I)V")
    public static void method2705(class35 arg0, class372 arg1) {
        if (field910) {
            method2494(arg0);
            return;
        }
        if ((class36.field262 == 1 || !Statics.field4559 && class36.field262 == 4) && class36.field259 >= field925 + 765 - 50 && class36.field260 >= 453) {
            Statics.field1404.method2447(!Statics.field1404.method2454());
            if (Statics.field1404.method2454()) {
                class291.method3262();
            } else {
                Statics.method4110(Statics.field1761, "scape main", "", 255, false);
            }
        }
        if (client.field508 == 5) {
            return;
        }
        if (field922 == -1L) {
            field922 = class287.method3099() + 1000L;
        }
        long var2 = class287.method3099();
        boolean var4;
        if (client.field653 == null || client.field800 >= client.field653.size()) {
            var4 = true;
        } else {
            while (true) {
                if (client.field800 >= client.field653.size()) {
                    var4 = true;
                    break;
                }
                class80 var5 = (class80) client.field653.get(client.field800);
                if (!var5.method2182()) {
                    var4 = false;
                    break;
                }
                client.field800++;
            }
        }
        if (var4 && field905 == -1L) {
            field905 = var2;
            if (field905 > field922) {
                field922 = field905;
            }
        }
        if (client.field508 != 10 && client.field508 != 11) {
            return;
        }
        if (Statics.field268 == class352.field4316) {
            if (class36.field262 == 1 || !Statics.field4559 && class36.field262 == 4) {
                int var6 = field925 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class36.field259 >= var6 && class36.field259 <= var6 + var8 && class36.field260 >= var7 && class36.field260 <= var7 + var9) {
                    method3971();
                    return;
                }
            }
            if (Statics.field1797 != null) {
                method3971();
            }
        }
        int var10 = class36.field262;
        int var11 = class36.field259;
        int var12 = class36.field260;
        if (var10 == 0) {
            var11 = class36.field251;
            var12 = class36.field252;
        }
        if (!Statics.field4559 && var10 == 4) {
            var10 = 1;
        }
        class206 var13 = client.field703;
        class206 var14 = var13;
        if (field919 == 0) {
            boolean var15 = false;
            while (var14.method3818()) {
                if (var14.field2340 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field1670 - 80;
            short var17 = 291;
            if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                class32.method2581(client.method5826("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field1670 + 80;
            if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20 || var15) {
                if ((client.field498 & 0x2000000) != 0) {
                    field920 = "";
                    field921 = class330.field4076;
                    field930 = class330.field3847;
                    field916 = class330.field4078;
                    method689(1);
                    method6402();
                } else if ((client.field498 & 0x4) != 0) {
                    if ((client.field498 & 0x400) == 0) {
                        field921 = class330.field4067;
                        field930 = class330.field3888;
                        field916 = class330.field4069;
                    } else {
                        field921 = class330.field4073;
                        field930 = class330.field3927;
                        field916 = class330.field4147;
                    }
                    field920 = class330.field4066;
                    method689(1);
                    method6402();
                } else if ((client.field498 & 0x400) == 0) {
                    method2832(false);
                } else {
                    field921 = class330.field4070;
                    field930 = class330.field4071;
                    field916 = class330.field3864;
                    field920 = class330.field4066;
                    method689(1);
                    method6402();
                }
            }
        } else if (field919 == 1) {
            while (true) {
                if (!var14.method3818()) {
                    int var19 = Statics.field1670 - 80;
                    short var20 = 321;
                    if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                        method2832(false);
                    }
                    int var21 = Statics.field1670 + 80;
                    if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                        method689(0);
                    }
                    break;
                }
                if (var14.field2340 == 84) {
                    method2832(false);
                } else if (var14.field2340 == 13) {
                    method689(0);
                }
            }
        } else if (field919 == 2) {
            short var22 = 201;
            int var110 = var22 + 52;
            if (var10 == 1 && var12 >= var110 - 12 && var12 < var110 + 2) {
                field932 = 0;
            }
            var110 += 15;
            if (var10 == 1 && var12 >= var110 - 12 && var12 < var110 + 2) {
                field932 = 1;
            }
            var110 += 15;
            short var23 = 361;
            if (Statics.field3728 != null) {
                int var24 = Statics.field3728.field4626 / 2;
                if (var10 == 1 && var11 >= Statics.field3728.field4628 - var24 && var11 <= Statics.field3728.field4628 + var24 && var12 >= var23 - 15 && var12 < var23) {
                    switch(field918) {
                        case 1:
                            method1996(class330.field4115, class330.field4121, class330.field4117);
                            method689(5);
                            return;
                        case 2:
                            class32.method2581("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field1670 - 80;
            short var26 = 321;
            if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                field924 = field924.trim();
                if (field924.length() == 0) {
                    method1996(class330.field3861, class330.field3960, class330.field3961);
                    return;
                }
                if (field913.length() == 0) {
                    method1996(class330.field3962, class330.field3963, class330.field3964);
                    return;
                }
                method1996(class330.field4081, class330.field4082, class330.field4083);
                client.method6618(false);
                client.method4858(20);
                return;
            }
            int var27 = field923 + 180 + 80;
            if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                method689(0);
                field924 = "";
                field913 = "";
                Statics.field1430 = 0;
                Statics.field1924 = "";
                field931 = true;
            }
            int var28 = Statics.field1670 + -117;
            short var29 = 277;
            field940 = var11 >= var28 && var11 < Statics.field2964 + var28 && var12 >= var29 && var12 < Statics.field1614 + var29;
            if (var10 == 1 && field940) {
                client.field549 = !client.field549;
                if (!client.field549 && Statics.field1404.method2429() != null) {
                    Statics.field1404.method2384((String) null);
                }
            }
            int var30 = Statics.field1670 + 24;
            short var31 = 277;
            field935 = var11 >= var30 && var11 < Statics.field2964 + var30 && var12 >= var31 && var12 < Statics.field1614 + var31;
            if (var10 == 1 && field935) {
                Statics.field1404.method2367(!Statics.field1404.method2368());
                if (!Statics.field1404.method2368()) {
                    field924 = "";
                    Statics.field1404.method2384((String) null);
                    method6402();
                }
            }
            label983: while (true) {
                Transferable var37;
                int var38;
                do {
                    while (true) {
                        label947: do {
                            while (true) {
                                while (var14.method3818()) {
                                    if (var14.field2340 == 13) {
                                        method689(0);
                                        field924 = "";
                                        field913 = "";
                                        Statics.field1430 = 0;
                                        Statics.field1924 = "";
                                        field931 = true;
                                    } else {
                                        if (field932 != 0) {
                                            continue label947;
                                        }
                                        char var32 = var14.field2334;
                                        for (int var33 = 0; var33 < field908.length() && var32 != field908.charAt(var33); var33++) {
                                        }
                                        if (var14.field2340 == 85 && field924.length() > 0) {
                                            field924 = field924.substring(0, field924.length() - 1);
                                        }
                                        if (var14.field2340 == 84 || var14.field2340 == 80) {
                                            field932 = 1;
                                        }
                                        char var34 = var14.field2334;
                                        boolean var35 = field908.indexOf(var34) != -1;
                                        if (var35 && field924.length() < 320) {
                                            field924 = field924 + var14.field2334;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field932 != 1);
                        if (var14.field2340 == 85 && field913.length() > 0) {
                            field913 = field913.substring(0, field913.length() - 1);
                        } else if (var14.field2340 == 84 || var14.field2340 == 80) {
                            field932 = 0;
                            if (var14.field2340 == 84) {
                                field924 = field924.trim();
                                if (field924.length() == 0) {
                                    method1996(class330.field3861, class330.field3960, class330.field3961);
                                    return;
                                }
                                if (field913.length() == 0) {
                                    method1996(class330.field3962, class330.field3963, class330.field3964);
                                    return;
                                }
                                method1996(class330.field4081, class330.field4082, class330.field4083);
                                client.method6618(false);
                                client.method4858(20);
                                return;
                            }
                        }
                        if ((var14.method3820(82) || var14.method3820(87)) && var14.field2340 == 67) {
                            Clipboard var36 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var37 = var36.getContents(Statics.field427);
                            var38 = 20 - field913.length();
                            break;
                        }
                        if (class363.method5278(var14.field2334)) {
                            char var46 = var14.field2334;
                            boolean var47 = field908.indexOf(var46) != -1;
                            if (var47 && field913.length() < 20) {
                                field913 = field913 + var14.field2334;
                            }
                        }
                    }
                } while (var38 <= 0);
                try {
                    String var39 = (String) var37.getTransferData(DataFlavor.stringFlavor);
                    int var40 = Math.min(var38, var39.length());
                    int var41 = 0;
                    while (true) {
                        if (var41 >= var40) {
                            field913 = field913 + var39.substring(0, var40);
                            continue label983;
                        }
                        if (!class363.method5278(var39.charAt(var41))) {
                            break;
                        }
                        char var42 = var39.charAt(var41);
                        boolean var43 = field908.indexOf(var42) != -1;
                        if (!var43) {
                            break;
                        }
                        var41++;
                    }
                    method689(3);
                    return;
                } catch (UnsupportedFlavorException var108) {
                } catch (IOException var109) {
                }
            }
        } else if (field919 == 3) {
            int var48 = field923 + 180;
            short var49 = 276;
            if (var10 == 1 && var11 >= var48 - 75 && var11 <= var48 + 75 && var12 >= var49 - 20 && var12 <= var49 + 20) {
                method6113(false);
            }
            int var50 = field923 + 180;
            short var51 = 326;
            if (var10 == 1 && var11 >= var50 - 75 && var11 <= var50 + 75 && var12 >= var51 - 20 && var12 <= var51 + 20) {
                method1996(class330.field4115, class330.field4121, class330.field4117);
                method689(5);
                return;
            }
        } else if (field919 == 4) {
            int var52 = field923 + 180 - 80;
            short var53 = 321;
            if (var10 == 1 && var11 >= var52 - 75 && var11 <= var52 + 75 && var12 >= var53 - 20 && var12 <= var53 + 20) {
                Statics.field1924.trim();
                if (Statics.field1924.length() != 6) {
                    method1996(class330.field3911, class330.field4150, class330.field4135);
                    return;
                }
                Statics.field1430 = Integer.parseInt(Statics.field1924);
                Statics.field1924 = "";
                client.method6618(true);
                method1996(class330.field4081, class330.field4082, class330.field4083);
                client.method4858(20);
                return;
            }
            if (var10 == 1 && var11 >= field923 + 180 - 9 && var11 <= field923 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field931 = !field931;
            }
            if (var10 == 1 && var11 >= field923 + 180 - 34 && var11 <= field923 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                class32.method2581(client.method5826("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var54 = field923 + 180 + 80;
            if (var10 == 1 && var11 >= var54 - 75 && var11 <= var54 + 75 && var12 >= var53 - 20 && var12 <= var53 + 20) {
                method689(0);
                field924 = "";
                field913 = "";
                Statics.field1430 = 0;
                Statics.field1924 = "";
            }
            while (var14.method3818()) {
                boolean var55 = false;
                for (int var56 = 0; var56 < field934.length(); var56++) {
                    if (var14.field2334 == field934.charAt(var56)) {
                        var55 = true;
                        break;
                    }
                }
                if (var14.field2340 == 13) {
                    method689(0);
                    field924 = "";
                    field913 = "";
                    Statics.field1430 = 0;
                    Statics.field1924 = "";
                } else {
                    if (var14.field2340 == 85 && Statics.field1924.length() > 0) {
                        Statics.field1924 = Statics.field1924.substring(0, Statics.field1924.length() - 1);
                    }
                    if (var14.field2340 == 84) {
                        Statics.field1924.trim();
                        if (Statics.field1924.length() != 6) {
                            method1996(class330.field3911, class330.field4150, class330.field4135);
                            return;
                        }
                        Statics.field1430 = Integer.parseInt(Statics.field1924);
                        Statics.field1924 = "";
                        client.method6618(true);
                        method1996(class330.field4081, class330.field4082, class330.field4083);
                        client.method4858(20);
                        return;
                    }
                    if (var55 && Statics.field1924.length() < 6) {
                        Statics.field1924 = Statics.field1924 + var14.field2334;
                    }
                }
            }
        } else if (field919 == 5) {
            int var57 = field923 + 180 - 80;
            short var58 = 321;
            if (var10 == 1 && var11 >= var57 - 75 && var11 <= var57 + 75 && var12 >= var58 - 20 && var12 <= var58 + 20) {
                method4945();
                return;
            }
            int var59 = field923 + 180 + 80;
            if (var10 == 1 && var11 >= var59 - 75 && var11 <= var59 + 75 && var12 >= var58 - 20 && var12 <= var58 + 20) {
                method2832(true);
            }
            short var60 = 361;
            if (Statics.field3365 != null) {
                int var61 = Statics.field3365.field4626 / 2;
                if (var10 == 1 && var11 >= Statics.field3365.field4628 - var61 && var11 <= Statics.field3365.field4628 + var61 && var12 >= var60 - 15 && var12 < var60) {
                    class32.method2581(client.method5826("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var14.method3818()) {
                boolean var62 = false;
                for (int var63 = 0; var63 < field908.length(); var63++) {
                    if (var14.field2334 == field908.charAt(var63)) {
                        var62 = true;
                        break;
                    }
                }
                if (var14.field2340 == 13) {
                    method2832(true);
                } else {
                    if (var14.field2340 == 85 && field924.length() > 0) {
                        field924 = field924.substring(0, field924.length() - 1);
                    }
                    if (var14.field2340 == 84) {
                        method4945();
                        return;
                    }
                    if (var62 && field924.length() < 320) {
                        field924 = field924 + var14.field2334;
                    }
                }
            }
        } else if (field919 == 6) {
            while (true) {
                do {
                    if (!var14.method3818()) {
                        short var64 = 321;
                        if (var10 == 1 && var12 >= var64 - 20 && var12 <= var64 + 20) {
                            method2832(true);
                        }
                        return;
                    }
                } while (var14.field2340 != 84 && var14.field2340 != 13);
                method2832(true);
            }
        } else if (field919 == 7) {
            if (Statics.field2377 && !client.field661) {
                int var65 = Statics.field1670 - 150;
                int var66 = var65 + 240 + 25 + 40;
                short var67 = 231;
                int var68 = var67 + 40;
                if (var10 == 1 && var11 >= var65 && var11 <= var66 && var12 >= var67 && var12 <= var68) {
                    int var69 = var65;
                    int var70 = 0;
                    int var71;
                    while (true) {
                        if (var70 >= 8) {
                            var71 = 0;
                            break;
                        }
                        if (var11 <= var69 + 30) {
                            var71 = var70;
                            break;
                        }
                        var69 += 30;
                        var69 += var70 == 1 || var70 == 3 ? 20 : 5;
                        var70++;
                    }
                    field926 = var71;
                }
                int var72 = field923 + 180 - 80;
                short var73 = 321;
                if (var10 == 1 && var11 >= var72 - 75 && var11 <= var72 + 75 && var12 >= var73 - 20 && var12 <= var73 + 20) {
                    boolean var74 = method6218();
                    if (var74) {
                        client.method4858(50);
                        return;
                    }
                }
                int var75 = field923 + 180 + 80;
                if (var10 == 1 && var11 >= var75 - 75 && var11 <= var75 + 75 && var12 >= var73 - 20 && var12 <= var73 + 20) {
                    field927 = new String[8];
                    method2832(true);
                }
                while (var14.method3818()) {
                    if (var14.field2340 == 101) {
                        field927[field926] = null;
                    }
                    if (var14.field2340 == 85) {
                        if (field927[field926] == null && field926 > 0) {
                            field926--;
                        }
                        field927[field926] = null;
                    }
                    if (var14.field2334 >= '0' && var14.field2334 <= '9') {
                        field927[field926] = "" + var14.field2334;
                        if (field926 < 7) {
                            field926++;
                        }
                    }
                    if (var14.field2340 == 84) {
                        boolean var76 = method6218();
                        if (var76) {
                            client.method4858(50);
                        }
                        return;
                    }
                }
            } else {
                int var77 = field923 + 180 - 80;
                short var78 = 321;
                if (var10 == 1 && var11 >= var77 - 75 && var11 <= var77 + 75 && var12 >= var78 - 20 && var12 <= var78 + 20) {
                    class32.method2581(client.method5826("secure", true) + "m=dob/set_dob.ws", true, false);
                    method1996(class330.field4112, class330.field4161, class330.field4068);
                    method689(6);
                    return;
                }
                int var79 = field923 + 180 + 80;
                if (var10 == 1 && var11 >= var79 - 75 && var11 <= var79 + 75 && var12 >= var78 - 20 && var12 <= var78 + 20) {
                    method2832(true);
                }
            }
        } else if (field919 == 8) {
            int var80 = field923 + 180 - 80;
            short var81 = 321;
            if (var10 == 1 && var11 >= var80 - 75 && var11 <= var80 + 75 && var12 >= var81 - 20 && var12 <= var81 + 20) {
                class32.method2581("https://www.jagex.com/terms/privacy", true, false);
                method1996(class330.field4112, class330.field4161, class330.field4068);
                method689(6);
                return;
            }
            int var82 = field923 + 180 + 80;
            if (var10 == 1 && var11 >= var82 - 75 && var11 <= var82 + 75 && var12 >= var81 - 20 && var12 <= var81 + 20) {
                method2832(true);
            }
        } else if (field919 == 9) {
            int var83 = field923 + 180;
            short var84 = 311;
            if (var13.field2340 == 84 || var13.field2340 == 13 || var10 == 1 && var11 >= var83 - 75 && var11 <= var83 + 75 && var12 >= var84 - 20 && var12 <= var84 + 20) {
                method6113(false);
            }
        } else if (field919 == 10) {
            int var85 = field923 + 180;
            short var86 = 209;
            if (var13.field2340 == 84 || var10 == 1 && var11 >= var85 - 109 && var11 <= var85 + 109 && var12 >= var86 && var12 <= var86 + 68) {
                method1996(class330.field4081, class330.field4082, class330.field4083);
                client.field537 = class479.field4993;
                client.method6618(false);
                client.method4858(20);
            }
        } else if (field919 == 12) {
            int var87 = Statics.field1670;
            short var88 = 233;
            class414 var89 = arg1.method6690(0, 30, class330.field4091, var87, var88);
            class414 var90 = arg1.method6690(32, 32, class330.field4091, var87, var88);
            class414 var91 = arg1.method6690(70, 34, class330.field4091, var87, var88);
            int var111 = var88 + 17;
            class414 var92 = arg1.method6690(0, 34, class330.field4145, var87, var111);
            if (var10 == 1) {
                if (var89.method7222(var11, var12)) {
                    class32.method2581("https://www.jagex.com/terms", true, false);
                } else if (var90.method7222(var11, var12)) {
                    class32.method2581("https://www.jagex.com/terms/privacy", true, false);
                } else if (var91.method7222(var11, var12) || var92.method7222(var11, var12)) {
                    class32.method2581("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var93 = Statics.field1670 - 80;
            short var94 = 311;
            if (var10 == 1 && var11 >= var93 - 75 && var11 <= var93 + 75 && var12 >= var94 - 20 && var12 <= var94 + 20) {
                client.method6984();
                method6113(true);
            }
            int var95 = Statics.field1670 + 80;
            if (var10 == 1 && var11 >= var95 - 75 && var11 <= var95 + 75 && var12 >= var94 - 20 && var12 <= var94 + 20) {
                field919 = 13;
            }
        } else if (field919 == 13) {
            int var96 = Statics.field1670;
            short var97 = 321;
            if (var10 == 1 && var11 >= var96 - 75 && var11 <= var96 + 75 && var12 >= var97 - 20 && var12 <= var97 + 20) {
                method6113(true);
            }
        } else if (field919 == 14) {
            String var98 = "";
            switch(field917) {
                case 0:
                    var98 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var98 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var98 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method2832(false);
            }
            int var99 = field923 + 180;
            short var100 = 276;
            if (var10 == 1 && var11 >= var99 - 75 && var11 <= var99 + 75 && var12 >= var100 - 20 && var12 <= var100 + 20) {
                class32.method2581(var98, true, false);
                method1996(class330.field4112, class330.field4161, class330.field4068);
                method689(6);
                return;
            }
            int var101 = field923 + 180;
            short var102 = 326;
            if (var10 == 1 && var11 >= var101 - 75 && var11 <= var101 + 75 && var12 >= var102 - 20 && var12 <= var102 + 20) {
                method2832(false);
            }
        } else if (field919 == 24) {
            int var103 = field923 + 180;
            short var104 = 301;
            if (var10 == 1 && var11 >= var103 - 75 && var11 <= var103 + 75 && var12 >= var104 - 20 && var12 <= var104 + 20) {
                method6113(false);
            }
        } else if (field919 == 26) {
            int var105 = field923 + 180 - 80;
            short var106 = 321;
            if (var10 == 1 && var11 >= var105 - 75 && var11 <= var105 + 75 && var12 >= var106 - 20 && var12 <= var106 + 20) {
                class32.method2581(client.method5826("secure", true) + "m=dob/set_dob.ws", true, false);
                method1996(class330.field4112, class330.field4161, class330.field4068);
                method689(6);
                return;
            }
            int var107 = field923 + 180 + 80;
            if (var10 == 1 && var11 >= var107 - 75 && var11 <= var107 + 75 && var12 >= var106 - 20 && var12 <= var106 + 20) {
                method2832(true);
            }
        }
    }

    @ObfuscatedName("mn.n(I)Z")
    public static boolean method6218() {
        Date var0;
        try {
            var0 = method6752();
        } catch (ParseException var4) {
            method2326("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        boolean var2 = method2237(var0);
        boolean var3 = method5908(var0);
        if (!var3) {
            method2326("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var2) {
            Statics.field3357 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field3357 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("lx.l(Ljava/util/Date;I)Z")
    public static boolean method5908(Date arg0) {
        Date var1 = method5899();
        return arg0.after(var1);
    }

    @ObfuscatedName("le.k(I)Ljava/util/Date;")
    public static Date method5899() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("ck.c(Ljava/util/Date;B)Z")
    public static boolean method2237(Date arg0) {
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

    @ObfuscatedName("cz.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2326(String arg0, String arg1, String arg2) {
        method689(7);
        method1996(arg0, arg1, arg2);
    }

    @ObfuscatedName("nm.b(B)Ljava/util/Date;")
    public static Date method6752() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field927;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method2326("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("dh.m(ZI)V")
    public static void method2832(boolean arg0) {
        if (Statics.field427.method1634() || Statics.field427.method1151() || Statics.field427.method1150()) {
            method689(10);
            return;
        }
        field921 = class330.field4063;
        field930 = class330.field4064;
        field916 = class330.field4065;
        method689(2);
        if (arg0) {
            field913 = "";
        }
        method1818();
        method6402();
    }

    @ObfuscatedName("mp.t(ZI)V")
    public static void method6113(boolean arg0) {
        byte var1 = 0;
        if (!client.method3092()) {
            var1 = 12;
        } else if (Statics.field427.method1634() || Statics.field427.method1151() || Statics.field427.method1150()) {
            var1 = 10;
        }
        method689(var1);
        if (arg0) {
            field924 = "";
            field913 = "";
            Statics.field1430 = 0;
            Statics.field1924 = "";
        }
        method1818();
        method6402();
    }

    @ObfuscatedName("je.h(B)V")
    public static void method4945() {
        field924 = field924.trim();
        if (field924.length() == 0) {
            method1996(class330.field4115, class330.field4121, class330.field4117);
            return;
        }
        long var0 = class69.method1995();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class69.method7133(var0, field924);
        }
        switch(var2) {
            case 2:
                method1996(class330.field3944, class330.field4119, class330.field4120);
                method689(6);
                break;
            case 3:
                method1996(class330.field3981, class330.field3951, class330.field3940);
                break;
            case 4:
                method1996(class330.field4000, class330.field4125, class330.field4126);
                break;
            case 5:
                method1996(class330.field4127, class330.field4128, class330.field4129);
                break;
            case 6:
                method1996(class330.field4130, class330.field4131, class330.field4118);
                break;
            case 7:
                method1996(class330.field4133, class330.field4113, class330.field3980);
        }
    }

    @ObfuscatedName("ma.p(Lnv;Lnv;Lnv;I)V")
    public static void method6127(class372 arg0, class372 arg1, class372 arg2) {
        field925 = (Statics.field220 - 765) / 2;
        field923 = field925 + 202;
        Statics.field1670 = field923 + 180;
        if (field910) {
            method4871(arg0, arg1);
            return;
        }
        Statics.field941.method8444(field925, 0);
        Statics.field3053.method8444(field925 + 382, 0);
        Statics.field199.method8374(field925 + 382 - Statics.field199.field5024 / 2, 18);
        if (client.field508 == 0 || client.field508 == 5) {
            byte var3 = 20;
            arg0.method6658(class330.field4062, field923 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class484.method8300(field923 + 180 - 152, var4, 304, 34, 9179409);
            class484.method8300(field923 + 180 - 151, var4 + 1, 302, 32, 0);
            class484.method8296(field923 + 180 - 150, var4 + 2, field914 * 3, 30, 9179409);
            class484.method8296(field914 * 3 + (field923 + 180 - 150), var4 + 2, 300 - field914 * 3, 30, 0);
            arg0.method6658(field915, field923 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field508 == 20) {
            Statics.field1698.method8374(field923 + 180 - Statics.field1698.field5024 / 2, 271 - Statics.field1698.field5026 / 2);
            short var5 = 201;
            arg0.method6658(field921, field923 + 180, var5, 16776960, 0);
            int var116 = var5 + 15;
            arg0.method6658(field930, field923 + 180, var116, 16776960, 0);
            int var117 = var116 + 15;
            arg0.method6658(field916, field923 + 180, var117, 16776960, 0);
            int var118 = var117 + 15;
            int var119 = var118 + 7;
            if (field919 != 4 && field919 != 10) {
                arg0.method6634(class330.field4090, field923 + 180 - 110, var119, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method6998(); arg0.method6629(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method6634(class376.method6713(var7), field923 + 180 - 70, var119, 16777215, 0);
                var116 = var119 + 15;
                String var8 = field913;
                String var9 = class365.method359('*', var8.length());
                String var10;
                for (var10 = var9; arg0.method6629(var10) > var6; var10 = var10.substring(1)) {
                }
                arg0.method6634(class330.field4075 + var10, field923 + 180 - 108, var116, 16777215, 0);
                var116 += 15;
            }
        }
        if (client.field508 == 10 || client.field508 == 11 || client.field508 == 50) {
            Statics.field1698.method8374(field923, 171);
            if (field919 == 0) {
                short var11 = 251;
                arg0.method6658(class330.field4093, field923 + 180, var11, 16776960, 0);
                int var120 = var11 + 30;
                int var12 = field923 + 180 - 80;
                short var13 = 291;
                Statics.field907.method8374(var12 - 73, var13 - 20);
                arg0.method6682(class330.field3968, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var14 = field923 + 180 + 80;
                Statics.field907.method8374(var14 - 73, var13 - 20);
                arg0.method6682(class330.field4095, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field919 == 1) {
                arg0.method6658(field920, field923 + 180, 201, 16776960, 0);
                short var15 = 236;
                arg0.method6658(field921, field923 + 180, var15, 16777215, 0);
                int var121 = var15 + 15;
                arg0.method6658(field930, field923 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method6658(field916, field923 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                int var16 = field923 + 180 - 80;
                short var17 = 321;
                Statics.field907.method8374(var16 - 73, var17 - 20);
                arg0.method6658(class330.field3844, var16, var17 + 5, 16777215, 0);
                int var18 = field923 + 180 + 80;
                Statics.field907.method8374(var18 - 73, var17 - 20);
                arg0.method6658(class330.field4097, var18, var17 + 5, 16777215, 0);
            } else if (field919 == 2) {
                short var19 = 201;
                arg0.method6658(field921, Statics.field1670, var19, 16776960, 0);
                int var124 = var19 + 15;
                arg0.method6658(field930, Statics.field1670, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method6658(field916, Statics.field1670, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 7;
                arg0.method6634(class330.field4090, Statics.field1670 - 110, var127, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = method6998(); arg0.method6629(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method6634(class376.method6713(var21) + (field932 == 0 & client.field511 % 40 < 20 ? class97.method3021(16776960) + class97.field1305 : ""), Statics.field1670 - 70, var127, 16777215, 0);
                var124 = var127 + 15;
                String var22 = field913;
                String var23 = class365.method359('*', var22.length());
                String var24;
                for (var24 = var23; arg0.method6629(var24) > var20; var24 = var24.substring(1)) {
                }
                arg0.method6634(class330.field4075 + var24 + (field932 == 1 & client.field511 % 40 < 20 ? class97.method3021(16776960) + class97.field1305 : ""), Statics.field1670 - 108, var124, 16777215, 0);
                var124 += 15;
                short var25 = 277;
                int var26 = Statics.field1670 + -117;
                boolean var27 = client.field549;
                boolean var28 = field940;
                class487 var29 = var27 ? (var28 ? Statics.field1336 : Statics.field911) : (var28 ? Statics.field1006 : Statics.field933);
                var29.method8374(var26, var25);
                int var31 = var29.field5024 + 5 + var26;
                arg1.method6634(class330.field4098, var31, var25 + 13, 16776960, 0);
                int var32 = Statics.field1670 + 24;
                boolean var33 = Statics.field1404.method2368();
                boolean var34 = field935;
                class487 var35 = var33 ? (var34 ? Statics.field1336 : Statics.field911) : (var34 ? Statics.field1006 : Statics.field933);
                var35.method8374(var32, var25);
                int var37 = var35.field5024 + 5 + var32;
                arg1.method6634(class330.field4114, var37, var25 + 13, 16776960, 0);
                int var128 = var25 + 15;
                int var38 = Statics.field1670 - 80;
                short var39 = 321;
                Statics.field907.method8374(var38 - 73, var39 - 20);
                arg0.method6658(class330.field4096, var38, var39 + 5, 16777215, 0);
                int var40 = Statics.field1670 + 80;
                Statics.field907.method8374(var40 - 73, var39 - 20);
                arg0.method6658(class330.field4097, var40, var39 + 5, 16777215, 0);
                short var41 = 357;
                switch(field918) {
                    case 2:
                        Statics.field2769 = class330.field4111;
                        break;
                    default:
                        Statics.field2769 = class330.field4109;
                }
                Statics.field3728 = new class414(Statics.field1670, var41, arg1.method6629(Statics.field2769), 11);
                Statics.field3365 = new class414(Statics.field1670, var41, arg1.method6629(class330.field3871), 11);
                arg1.method6658(Statics.field2769, Statics.field1670, var41, 16777215, 0);
            } else if (field919 == 3) {
                short var42 = 201;
                arg0.method6658(class330.field3917, field923 + 180, var42, 16776960, 0);
                int var129 = var42 + 20;
                arg1.method6658(class330.field3970, field923 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                arg1.method6658(class330.field4102, field923 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                int var43 = field923 + 180;
                short var44 = 276;
                Statics.field907.method8374(var43 - 73, var44 - 20);
                arg2.method6658(class330.field4103, var43, var44 + 5, 16777215, 0);
                int var45 = field923 + 180;
                short var46 = 326;
                Statics.field907.method8374(var45 - 73, var46 - 20);
                arg2.method6658(class330.field4104, var45, var46 + 5, 16777215, 0);
            } else if (field919 == 4) {
                arg0.method6658(class330.field4079, field923 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method6658(field921, field923 + 180, var47, 16777215, 0);
                int var132 = var47 + 15;
                arg0.method6658(field930, field923 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method6658(field916, field923 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                String var49 = class330.field4092;
                String var50 = Statics.field1924;
                String var51 = class365.method359('*', var50.length());
                arg0.method6634(var49 + var51 + (client.field511 % 40 < 20 ? class97.method3021(16776960) + class97.field1305 : ""), field923 + 180 - 108, var134, 16777215, 0);
                int var135 = var134 - 8;
                arg0.method6634(class330.field3883, field923 + 180 - 9, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method6634(class330.field3945, field923 + 180 - 9, var136, 16776960, 0);
                int var52 = field923 + 180 - 9 + arg0.method6629(class330.field3945) + 15;
                int var53 = var136 - arg0.field4419;
                class487 var54;
                if (field931) {
                    var54 = Statics.field911;
                } else {
                    var54 = Statics.field933;
                }
                var54.method8374(var52, var53);
                var132 = var136 + 15;
                int var55 = field923 + 180 - 80;
                short var56 = 321;
                Statics.field907.method8374(var55 - 73, var56 - 20);
                arg0.method6658(class330.field3844, var55, var56 + 5, 16777215, 0);
                int var57 = field923 + 180 + 80;
                Statics.field907.method8374(var57 - 73, var56 - 20);
                arg0.method6658(class330.field4097, var57, var56 + 5, 16777215, 0);
                arg1.method6658(class330.field4080, field923 + 180, var56 + 36, 255, 0);
            } else if (field919 == 5) {
                arg0.method6658(class330.field4105, field923 + 180, 201, 16776960, 0);
                short var58 = 221;
                arg2.method6658(field921, field923 + 180, var58, 16776960, 0);
                int var137 = var58 + 15;
                arg2.method6658(field930, field923 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg2.method6658(field916, field923 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var140 = var139 + 14;
                arg0.method6634(class330.field3932, field923 + 180 - 145, var140, 16777215, 0);
                short var59 = 174;
                String var60;
                for (var60 = method6998(); arg0.method6629(var60) > var59; var60 = var60.substring(1)) {
                }
                arg0.method6634(class376.method6713(var60) + (client.field511 % 40 < 20 ? class97.method3021(16776960) + class97.field1305 : ""), field923 + 180 - 34, var140, 16777215, 0);
                var137 = var140 + 15;
                int var61 = field923 + 180 - 80;
                short var62 = 321;
                Statics.field907.method8374(var61 - 73, var62 - 20);
                arg0.method6658(class330.field4107, var61, var62 + 5, 16777215, 0);
                int var63 = field923 + 180 + 80;
                Statics.field907.method8374(var63 - 73, var62 - 20);
                arg0.method6658(class330.field3954, var63, var62 + 5, 16777215, 0);
                short var64 = 356;
                arg1.method6658(class330.field3871, Statics.field1670, var64, 268435455, 0);
            } else if (field919 == 6) {
                short var65 = 201;
                arg0.method6658(field921, field923 + 180, var65, 16776960, 0);
                int var141 = var65 + 15;
                arg0.method6658(field930, field923 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method6658(field916, field923 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var66 = field923 + 180;
                short var67 = 321;
                Statics.field907.method8374(var66 - 73, var67 - 20);
                arg0.method6658(class330.field3954, var66, var67 + 5, 16777215, 0);
            } else if (field919 == 7) {
                if (Statics.field2377 && !client.field661) {
                    short var68 = 201;
                    arg0.method6658(field921, Statics.field1670, var68, 16776960, 0);
                    int var144 = var68 + 15;
                    arg0.method6658(field930, Statics.field1670, var144, 16776960, 0);
                    int var145 = var144 + 15;
                    arg0.method6658(field916, Statics.field1670, var145, 16776960, 0);
                    int var69 = Statics.field1670 - 150;
                    int var146 = var145 + 10;
                    for (int var70 = 0; var70 < 8; var70++) {
                        Statics.field907.method8373(var69, var146, 30, 40);
                        boolean var71 = field926 == var70 & client.field511 % 40 < 20;
                        arg0.method6634((field927[var70] == null ? "" : field927[var70]) + (var71 ? class97.method3021(16776960) + class97.field1305 : ""), var69 + 10, var146 + 27, 16777215, 0);
                        if (var70 == 1 || var70 == 3) {
                            var69 += 50;
                            arg0.method6634(class376.method6713("/"), var69 - 13, var146 + 27, 16777215, 0);
                        } else {
                            var69 += 35;
                        }
                    }
                    int var72 = Statics.field1670 - 80;
                    short var73 = 321;
                    Statics.field907.method8374(var72 - 73, var73 - 20);
                    arg0.method6658("Submit", var72, var73 + 5, 16777215, 0);
                    int var74 = Statics.field1670 + 80;
                    Statics.field907.method8374(var74 - 73, var73 - 20);
                    arg0.method6658(class330.field4097, var74, var73 + 5, 16777215, 0);
                } else {
                    short var75 = 216;
                    arg0.method6658(class330.field3892, field923 + 180, var75, 16776960, 0);
                    int var147 = var75 + 15;
                    arg2.method6658(class330.field4137, field923 + 180, var147, 16776960, 0);
                    int var148 = var147 + 15;
                    arg2.method6658(class330.field4160, field923 + 180, var148, 16776960, 0);
                    int var149 = var148 + 15;
                    int var76 = field923 + 180 - 80;
                    short var77 = 321;
                    Statics.field907.method8374(var76 - 73, var77 - 20);
                    arg0.method6658(class330.field3990, var76, var77 + 5, 16777215, 0);
                    int var78 = field923 + 180 + 80;
                    Statics.field907.method8374(var78 - 73, var77 - 20);
                    arg0.method6658(class330.field3954, var78, var77 + 5, 16777215, 0);
                }
            } else if (field919 == 8) {
                short var79 = 216;
                arg0.method6658(class330.field3977, field923 + 180, var79, 16776960, 0);
                int var150 = var79 + 15;
                arg2.method6658(class330.field3978, field923 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg2.method6658(class330.field3979, field923 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var80 = field923 + 180 - 80;
                short var81 = 321;
                Statics.field907.method8374(var80 - 73, var81 - 20);
                arg0.method6658(class330.field4017, var80, var81 + 5, 16777215, 0);
                int var82 = field923 + 180 + 80;
                Statics.field907.method8374(var82 - 73, var81 - 20);
                arg0.method6658(class330.field3954, var82, var81 + 5, 16777215, 0);
            } else if (field919 == 9) {
                short var83 = 221;
                arg0.method6658(field921, field923 + 180, var83, 16776960, 0);
                int var153 = var83 + 25;
                arg0.method6658(field930, field923 + 180, var153, 16776960, 0);
                int var154 = var153 + 25;
                arg0.method6658(field916, field923 + 180, var154, 16776960, 0);
                int var84 = field923 + 180;
                short var85 = 311;
                Statics.field907.method8374(var84 - 73, var85 - 20);
                arg0.method6658(class330.field4103, var84, var85 + 5, 16777215, 0);
            } else if (field919 == 10) {
                int var86 = field923 + 180;
                short var87 = 209;
                arg0.method6658(class330.field4093, field923 + 180, var87, 16776960, 0);
                int var155 = var87 + 20;
                Statics.field110.method8374(var86 - 109, var155);
                if (field928.isEmpty()) {
                    Statics.field141.method8374(var86 - 48, var155 + 18);
                } else {
                    Statics.field141.method8374(var86 - 48, var155 + 5);
                    arg0.method6658(field928, var86, var155 + 68 - 15, 16776960, 0);
                }
            } else if (field919 == 12) {
                int var88 = Statics.field1670;
                short var89 = 216;
                arg2.method6658(class330.field4143, var88, var89, 16777215, 0);
                int var156 = var89 + 17;
                arg2.method6658(class330.field4091, var88, var156, 16777215, 0);
                int var157 = var156 + 17;
                arg2.method6658(class330.field4145, var88, var157, 16777215, 0);
                int var158 = var157 + 17;
                arg2.method6658(class330.field4146, var88, var158, 16777215, 0);
                int var90 = Statics.field1670 - 80;
                short var91 = 311;
                Statics.field907.method8374(var90 - 73, var91 - 20);
                arg0.method6658(class330.field4149, var90, var91 + 5, 16777215, 0);
                int var92 = Statics.field1670 + 80;
                Statics.field907.method8374(var92 - 73, var91 - 20);
                arg0.method6658(class330.field4058, var92, var91 + 5, 16777215, 0);
            } else if (field919 == 13) {
                short var93 = 231;
                arg2.method6658(class330.field4031, field923 + 180, var93, 16777215, 0);
                int var159 = var93 + 20;
                arg2.method6658(class330.field4148, field923 + 180, var159, 16777215, 0);
                int var94 = field923 + 180;
                short var95 = 311;
                Statics.field907.method8374(var94 - 73, var95 - 20);
                arg0.method6658(class330.field3954, var94, var95 + 5, 16777215, 0);
            } else if (field919 == 14) {
                short var96 = 201;
                String var97 = "";
                String var98 = "";
                String var99 = "";
                switch(field917) {
                    case 0:
                        var97 = class330.field3893;
                        var98 = class330.field3894;
                        var99 = class330.field4159;
                        break;
                    case 1:
                        var97 = class330.field4132;
                        var98 = class330.field3906;
                        var99 = class330.field4028;
                        break;
                    case 2:
                        var97 = class330.field4074;
                        var98 = class330.field3969;
                        var99 = class330.field3882;
                        break;
                    default:
                        method2832(false);
                }
                arg0.method6658(var97, field923 + 180, var96, 16776960, 0);
                int var160 = var96 + 20;
                arg0.method6658(var98, field923 + 180, var160, 16776960, 0);
                int var161 = var160 + 20;
                arg0.method6658(var99, field923 + 180, var161, 16776960, 0);
                int var100 = field923 + 180;
                short var101 = 276;
                Statics.field907.method8374(var100 - 73, var101 - 20);
                if (field917 == 1) {
                    arg0.method6658(class330.field3877, var100, var101 + 5, 16777215, 0);
                } else {
                    arg0.method6658(class330.field3840, var100, var101 + 5, 16777215, 0);
                }
                int var102 = field923 + 180;
                short var103 = 326;
                Statics.field907.method8374(var102 - 73, var103 - 20);
                arg0.method6658(class330.field3954, var102, var103 + 5, 16777215, 0);
            } else if (field919 == 24) {
                short var104 = 221;
                arg0.method6658(field921, field923 + 180, var104, 16777215, 0);
                int var162 = var104 + 15;
                arg0.method6658(field930, field923 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method6658(field916, field923 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                int var105 = field923 + 180;
                short var106 = 301;
                Statics.field907.method8374(var105 - 73, var106 - 20);
                arg0.method6658(class330.field3842, var105, var106 + 5, 16777215, 0);
            } else if (field919 == 26) {
                short var107 = 216;
                arg0.method6658(class330.field3892, field923 + 180, var107, 16776960, 0);
                int var165 = var107 + 15;
                arg2.method6658(class330.field4137, field923 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                arg2.method6658(class330.field4160, field923 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                int var108 = field923 + 180 - 80;
                short var109 = 321;
                Statics.field907.method8374(var108 - 73, var109 - 20);
                arg0.method6658(class330.field3990, var108, var109 + 5, 16777215, 0);
                int var110 = field923 + 180 + 80;
                Statics.field907.method8374(var110 - 73, var109 - 20);
                arg0.method6658(class330.field3954, var110, var109 + 5, 16777215, 0);
            }
        }
        if (client.field508 >= 10) {
            int[] var111 = new int[4];
            class484.method8290(var111);
            class484.method8288(field925, 0, field925 + 765, Statics.field1559);
            Statics.field3484.method2333(field925 - 22, client.field511);
            Statics.field3484.method2333(field925 + 765 + 22 - 128, client.field511);
            class484.method8291(var111);
        }
        Statics.field909[Statics.field1404.method2454() ? 1 : 0].method8374(field925 + 765 - 40, 463);
        if (client.field508 <= 5 || Statics.field268 != class352.field4316) {
            return;
        }
        if (Statics.field936 == null) {
            Statics.field936 = class489.method3345(Statics.field3034, "sl_button", "");
            return;
        }
        int var112 = field925 + 5;
        short var113 = 463;
        byte var114 = 100;
        byte var115 = 35;
        Statics.field936.method8374(var112, var113);
        arg0.method6658(class330.field3915 + " " + client.field601, var114 / 2 + var112, var115 / 2 + var113 - 2, 16777215, 0);
        if (Statics.field1797 == null) {
            arg1.method6658(class330.field3993, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
        } else {
            arg1.method6658(class330.field4045, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("by.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1996(String arg0, String arg1, String arg2) {
        field921 = arg0;
        field930 = arg1;
        field916 = arg2;
    }

    @ObfuscatedName("ib.u(Lnv;Lnv;I)V")
    public static void method4871(class372 arg0, class372 arg1) {
        if (Statics.field5070 == null) {
            class335 var2 = Statics.field3034;
            int var3 = var2.method5988("sl_back");
            int var4 = var2.method6057(var3, "");
            class488[] var5 = class489.method4285(var2, var3, var4);
            Statics.field5070 = var5;
        }
        if (Statics.field3531 == null) {
            Statics.field3531 = class489.method2924(Statics.field3034, "sl_flags", "");
        }
        if (Statics.field4528 == null) {
            Statics.field4528 = class489.method2924(Statics.field3034, "sl_arrows", "");
        }
        if (Statics.field155 == null) {
            Statics.field155 = class489.method2924(Statics.field3034, "sl_stars", "");
        }
        if (Statics.field3818 == null) {
            Statics.field3818 = class489.method3345(Statics.field3034, "leftarrow", "");
        }
        if (Statics.field2342 == null) {
            Statics.field2342 = class489.method3345(Statics.field3034, "rightarrow", "");
        }
        class484.method8296(field925, 23, 765, 480, 0);
        class484.method8297(field925, 0, 125, 23, 12425273, 9135624);
        class484.method8297(field925 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6658(class330.field4021, field925 + 62, 15, 0, -1);
        if (Statics.field155 != null) {
            Statics.field155[1].method8374(field925 + 140, 1);
            arg1.method6634(class330.field4085, field925 + 152, 10, 16777215, -1);
            Statics.field155[0].method8374(field925 + 140, 12);
            arg1.method6634(class330.field4153, field925 + 152, 21, 16777215, -1);
        }
        if (Statics.field4528 != null) {
            int var6 = field925 + 280;
            if (class64.field812[0] == 0 && class64.field813[0] == 0) {
                Statics.field4528[2].method8374(var6, 4);
            } else {
                Statics.field4528[0].method8374(var6, 4);
            }
            if (class64.field812[0] == 0 && class64.field813[0] == 1) {
                Statics.field4528[3].method8374(var6 + 15, 4);
            } else {
                Statics.field4528[1].method8374(var6 + 15, 4);
            }
            arg0.method6634(class330.field4154, var6 + 32, 17, 16777215, -1);
            int var7 = field925 + 390;
            if (class64.field812[0] == 1 && class64.field813[0] == 0) {
                Statics.field4528[2].method8374(var7, 4);
            } else {
                Statics.field4528[0].method8374(var7, 4);
            }
            if (class64.field812[0] == 1 && class64.field813[0] == 1) {
                Statics.field4528[3].method8374(var7 + 15, 4);
            } else {
                Statics.field4528[1].method8374(var7 + 15, 4);
            }
            arg0.method6634(class330.field4010, var7 + 32, 17, 16777215, -1);
            int var8 = field925 + 500;
            if (class64.field812[0] == 2 && class64.field813[0] == 0) {
                Statics.field4528[2].method8374(var8, 4);
            } else {
                Statics.field4528[0].method8374(var8, 4);
            }
            if (class64.field812[0] == 2 && class64.field813[0] == 1) {
                Statics.field4528[3].method8374(var8 + 15, 4);
            } else {
                Statics.field4528[1].method8374(var8 + 15, 4);
            }
            arg0.method6634(class330.field4156, var8 + 32, 17, 16777215, -1);
            int var9 = field925 + 610;
            if (class64.field812[0] == 3 && class64.field813[0] == 0) {
                Statics.field4528[2].method8374(var9, 4);
            } else {
                Statics.field4528[0].method8374(var9, 4);
            }
            if (class64.field812[0] == 3 && class64.field813[0] == 1) {
                Statics.field4528[3].method8374(var9 + 15, 4);
            } else {
                Statics.field4528[1].method8374(var9 + 15, 4);
            }
            arg0.method6634(class330.field4157, var9 + 32, 17, 16777215, -1);
        }
        class484.method8296(field925 + 708, 4, 50, 16, 0);
        arg1.method6658(class330.field4097, field925 + 708 + 25, 16, 16777215, -1);
        field937 = -1;
        if (Statics.field5070 != null) {
            byte var10 = 88;
            byte var11 = 19;
            int var12 = 765 / (var10 + 1) - 1;
            int var13 = 480 / (var11 + 1);
            int var14;
            int var15;
            do {
                var14 = var13;
                var15 = var12;
                if ((var12 - 1) * var13 >= class64.field811) {
                    var12--;
                }
                if ((var13 - 1) * var12 >= class64.field811) {
                    var13--;
                }
                if ((var13 - 1) * var12 >= class64.field811) {
                    var13--;
                }
            } while (var13 != var14 || var12 != var15);
            int var16 = (765 - var10 * var12) / (var12 + 1);
            if (var16 > 5) {
                var16 = 5;
            }
            int var17 = (480 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (765 - var10 * var12 - (var12 - 1) * var16) / 2;
            int var19 = (480 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (class64.field811 + var13 - 1) / var13;
            field946 = var20 - var12;
            if (Statics.field3818 != null && field938 > 0) {
                Statics.field3818.method8374(8, Statics.field1559 / 2 - Statics.field3818.field5026 / 2);
            }
            if (Statics.field2342 != null && field938 < field946) {
                Statics.field2342.method8374(Statics.field220 - Statics.field2342.field5024 - 8, Statics.field1559 / 2 - Statics.field2342.field5026 / 2);
            }
            int var21 = var19 + 23;
            int var22 = field925 + var18;
            int var23 = 0;
            boolean var24 = false;
            int var25 = field938;
            for (int var26 = var13 * var25; var26 < class64.field811 && var25 - field938 < var12; var26++) {
                class64 var27 = Statics.field1140[var26];
                boolean var28 = true;
                String var29 = Integer.toString(var27.field817);
                if (var27.field817 == -1) {
                    var29 = class330.field4158;
                    var28 = false;
                } else if (var27.field817 > 1980) {
                    var29 = class330.field4089;
                    var28 = false;
                }
                int var30 = -1;
                int var31 = 0;
                if (var27.method1689()) {
                    if (var27.method1685()) {
                        var30 = class104.field1362.field1369;
                    } else {
                        var30 = class104.field1361.field1369;
                    }
                } else if (var27.method1703()) {
                    var31 = 16711680;
                    if (var27.method1685()) {
                        var30 = class104.field1360.field1369;
                    } else {
                        var30 = class104.field1359.field1369;
                    }
                } else if (var27.method1684()) {
                    if (var27.method1685()) {
                        var30 = class104.field1364.field1369;
                    } else {
                        var30 = class104.field1363.field1369;
                    }
                } else if (var27.method1687()) {
                    if (var27.method1685()) {
                        var30 = class104.field1355.field1369;
                    } else {
                        var30 = class104.field1357.field1369;
                    }
                } else if (var27.method1691()) {
                    if (var27.method1685()) {
                        var30 = class104.field1366.field1369;
                    } else {
                        var30 = class104.field1365.field1369;
                    }
                } else if (var27.method1692()) {
                    if (var27.method1685()) {
                        var30 = class104.field1368.field1369;
                    } else {
                        var30 = class104.field1356.field1369;
                    }
                }
                if (var30 == -1 || var30 >= Statics.field5070.length) {
                    if (var27.method1685()) {
                        var30 = class104.field1372.field1369;
                    } else {
                        var30 = class104.field1371.field1369;
                    }
                }
                if (class36.field251 >= var22 && class36.field252 >= var21 && class36.field251 < var10 + var22 && class36.field252 < var11 + var21 && var28) {
                    field937 = var26;
                    Statics.field5070[var30].method8406(var22, var21, 128, 16777215);
                    var24 = true;
                } else {
                    Statics.field5070[var30].method8444(var22, var21);
                }
                if (Statics.field3531 != null) {
                    Statics.field3531[(var27.method1685() ? 8 : 0) + var27.field807].method8374(var22 + 29, var21);
                }
                arg0.method6658(Integer.toString(var27.field815), var22 + 15, var11 / 2 + var21 + 5, var31, -1);
                arg1.method6658(var29, var22 + 60, var11 / 2 + var21 + 5, 268435455, -1);
                var21 += var11 + var17;
                var23++;
                if (var23 >= var13) {
                    var21 = var19 + 23;
                    var22 += var10 + var16;
                    var23 = 0;
                    var25++;
                }
            }
            if (var24) {
                int var32 = arg1.method6629(Statics.field1140[field937].field819) + 6;
                int var33 = arg1.field4419 + 8;
                int var34 = class36.field252 + 25;
                if (var33 + var34 > 480) {
                    var34 = class36.field252 - 25 - var33;
                }
                class484.method8296(class36.field251 - var32 / 2, var34, var32, var33, 16777120);
                class484.method8300(class36.field251 - var32 / 2, var34, var32, var33, 0);
                arg1.method6658(Statics.field1140[field937].field819, class36.field251, arg1.field4419 + var34 + 4, 0, -1);
            }
        }
        Statics.field153.method467(0, 0);
    }

    @ObfuscatedName("cv.x(Laj;I)V")
    public static void method2494(class35 arg0) {
        class206 var1 = client.field703;
        class206 var2 = var1;
        while (var2.method3818()) {
            if (var2.field2340 == 13) {
                Statics.method263();
                return;
            }
            if (var2.field2340 == 96) {
                if (field938 > 0 && Statics.field3818 != null) {
                    field938--;
                }
            } else if (var2.field2340 == 97 && field938 < field946 && Statics.field2342 != null) {
                field938++;
            }
        }
        if (class36.field262 != 1 && Statics.field4559 || class36.field262 != 4) {
            return;
        }
        int var3 = field925 + 280;
        if (class36.field259 >= var3 && class36.field259 <= var3 + 14 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(0, 0);
            return;
        }
        if (class36.field259 >= var3 + 15 && class36.field259 <= var3 + 80 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(0, 1);
            return;
        }
        int var4 = field925 + 390;
        if (class36.field259 >= var4 && class36.field259 <= var4 + 14 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(1, 0);
            return;
        }
        if (class36.field259 >= var4 + 15 && class36.field259 <= var4 + 80 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(1, 1);
            return;
        }
        int var5 = field925 + 500;
        if (class36.field259 >= var5 && class36.field259 <= var5 + 14 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(2, 0);
            return;
        }
        if (class36.field259 >= var5 + 15 && class36.field259 <= var5 + 80 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(2, 1);
            return;
        }
        int var6 = field925 + 610;
        if (class36.field259 >= var6 && class36.field259 <= var6 + 14 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(3, 0);
            return;
        }
        if (class36.field259 >= var6 + 15 && class36.field259 <= var6 + 80 && class36.field260 >= 4 && class36.field260 <= 18) {
            class64.method6472(3, 1);
            return;
        }
        if (class36.field259 >= field925 + 708 && class36.field260 >= 4 && class36.field259 <= field925 + 708 + 50 && class36.field260 <= 20) {
            Statics.method263();
            return;
        }
        if (field937 != -1) {
            class64 var7 = Statics.field1140[field937];
            method3520(var7);
            Statics.method263();
            return;
        }
        if (field938 > 0 && Statics.field3818 != null && class36.field259 >= 0 && class36.field259 <= Statics.field3818.field5024 && class36.field260 >= Statics.field1559 / 2 - 50 && class36.field260 <= Statics.field1559 / 2 + 50) {
            field938--;
        }
        if (field938 < field946 && Statics.field2342 != null && class36.field259 >= Statics.field220 - Statics.field2342.field5024 - 5 && class36.field259 <= Statics.field220 && class36.field260 >= Statics.field1559 / 2 - 50 && class36.field260 <= Statics.field1559 / 2 + 50) {
            field938++;
        }
    }

    @ObfuscatedName("gh.a(Lbw;B)V")
    public static void method3520(class64 arg0) {
        if (arg0.method1685() != client.field500) {
            client.field500 = arg0.method1685();
            class201.method3567(arg0.method1685());
        }
        if (client.field498 != arg0.field816) {
            method3647(Statics.field3034, arg0.field816);
        }
        Statics.field4260 = arg0.field808;
        client.field601 = arg0.field815;
        client.field498 = arg0.field816;
        Statics.field6 = client.field499 == 0 ? 43594 : arg0.field815 + 40000;
        Statics.field60 = client.field499 == 0 ? 443 : arg0.field815 + 50000;
        Statics.field3727 = Statics.field6;
    }

    @ObfuscatedName("hq.q(I)V")
    public static void method3971() {
        if (class64.method5117()) {
            field910 = true;
            field938 = 0;
            field946 = 0;
        }
    }

    @ObfuscatedName("ii.e(I)V")
    public static void method4635() {
        method689(24);
        method1996(class330.field4087, class330.field4006, class330.field4110);
    }

    @ObfuscatedName("ap.g(II)V")
    public static void method689(int arg0) {
        if (field919 != arg0) {
            field919 = arg0;
        }
    }

    @ObfuscatedName("p.y(B)I")
    public static int method211() {
        return field919;
    }

    @ObfuscatedName("hx.af(Ljava/lang/String;B)V")
    public static void method4299(String arg0) {
        String var1;
        if (arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#') {
            var1 = "";
        } else {
            var1 = arg0;
        }
        field928 = var1;
    }
}
