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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("cf")
public class class77 {

    @ObfuscatedName("cf.al")
    public static int field942 = 0;

    @ObfuscatedName("cf.ae")
    public static int field949 = field942 + 202;

    @ObfuscatedName("cf.ab")
    public static int field951 = 10;

    @ObfuscatedName("cf.av")
    public static String field977 = "";

    @ObfuscatedName("cf.bc")
    public static int field953 = -1;

    @ObfuscatedName("cf.bs")
    public static int field978 = 1;

    @ObfuscatedName("cf.cs")
    public static int field971 = 0;

    @ObfuscatedName("cf.ch")
    public static String field944 = "";

    @ObfuscatedName("cf.co")
    public static String field957 = "";

    @ObfuscatedName("cf.cd")
    public static String field958 = "";

    @ObfuscatedName("cf.cg")
    public static String field959 = "";

    @ObfuscatedName("cf.cn")
    public static String field940 = "";

    @ObfuscatedName("cf.cz")
    public static String field961 = "";

    @ObfuscatedName("cf.cl")
    public static int field962 = 0;

    @ObfuscatedName("cf.cm")
    public static String[] field963 = new String[8];

    @ObfuscatedName("cf.ce")
    public static String field964 = "";

    @ObfuscatedName("cf.cc")
    public static boolean field980 = false;

    @ObfuscatedName("cf.cb")
    public static boolean field966 = false;

    @ObfuscatedName("cf.cr")
    public static boolean field967 = true;

    @ObfuscatedName("cf.dg")
    public static int field968 = 0;

    @ObfuscatedName("cf.dc")
    public static String field969 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cf.do")
    public static String field970 = "1234567890";

    @ObfuscatedName("cf.dl")
    public static boolean field956 = false;

    @ObfuscatedName("cf.dd")
    public static int field972 = -1;

    @ObfuscatedName("cf.dh")
    public static int field973 = 0;

    @ObfuscatedName("cf.dj")
    public static int field974 = 0;

    @ObfuscatedName("cf.ds")
    public static long field975;

    @ObfuscatedName("cf.dy")
    public static long field976;

    @ObfuscatedName("cf.dz")
    public static String[] field950;

    @ObfuscatedName("cf.dp")
    public static String[] field946;

    @ObfuscatedName("cf.de")
    public static String[] field947;

    static {
        new DecimalFormat("##0.00");
        new class137();
        field975 = -1L;
        field976 = -1L;
        field950 = new String[] { "title.jpg" };
        field946 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field947 = new String[] { "logo_speedrunning" };
    }

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.aq(Lof;Lof;I)I")
    public static int method4178(class378 arg0, class378 arg1) {
        int var2 = 0;
        String[] var3 = field950;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method6430(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field946;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method6430(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field947;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method6435(var11) != -1 && arg1.method6430(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("bw.aw(Lof;I)I")
    public static int method624(class378 arg0) {
        int var1 = field950.length + field946.length;
        String[] var2 = field947;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6435(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("nm.al(Lof;Lof;ZII)V")
    public static void method5804(class378 arg0, class378 arg1, boolean arg2, int arg3) {
        if (!Statics.field941) {
            if (arg3 == 0) {
                method5444(arg2);
            } else {
                method3891(arg3);
            }
            class544.method8956();
            byte[] var4 = arg0.method6438("title.jpg", "");
            Statics.field952 = class31.method3587(var4);
            Statics.field2495 = Statics.field952.method9001();
            method3872(arg1, client.field588);
            Statics.field1730 = class549.method3219(arg1, "titlebox", "");
            Statics.field965 = class549.method3219(arg1, "titlebutton", "");
            Statics.field945 = class549.method3219(arg1, "titlebutton_large", "");
            Statics.field1122 = class549.method3219(arg1, "play_now_text", "");
            class549.method3219(arg1, "titlebutton_wide42,1", "");
            Statics.field943 = class549.method3698(arg1, "runes", "");
            Statics.field1829 = class549.method3698(arg1, "title_mute", "");
            Statics.field1509 = class549.method3219(arg1, "options_radio_buttons,0", "");
            Statics.field5266 = class549.method3219(arg1, "options_radio_buttons,4", "");
            Statics.field4869 = class549.method3219(arg1, "options_radio_buttons,2", "");
            Statics.field5359 = class549.method3219(arg1, "options_radio_buttons,6", "");
            Statics.field860 = Statics.field1509.field5290;
            Statics.field3449 = Statics.field1509.field5295;
            Statics.field3545 = new class99(Statics.field943);
            if (arg2) {
                field940 = "";
                field961 = "";
                field963 = new String[8];
                field962 = 0;
            }
            Statics.field248 = 0;
            Statics.field933 = "";
            field967 = true;
            field956 = false;
            if (Statics.field156.method2463()) {
                class322.method3196(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class334(Statics.field2922, "scape main", "", 255, false));
                class322.method2753(var5, 0, 0, 0, 100, false);
            }
            class322.method1122();
            client.method8267().method6514(false);
            Statics.field941 = true;
            field942 = (Statics.field199 - 765) / 2;
            field949 = field942 + 202;
            Statics.field955 = field949 + 180;
            Statics.field952.method9051(field942, 0);
            Statics.field2495.method9051(field942 + 382, 0);
            Statics.field960.method8984(field942 + 382 - Statics.field960.field5290 / 2, 18);
        } else if (arg3 == 4) {
            method3891(4);
        }
    }

    @ObfuscatedName("ey.ai(ZZI)Lvg;")
    public static class547 method2647(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field5359 : Statics.field4869) : (arg1 ? Statics.field5266 : Statics.field1509);
    }

    @ObfuscatedName("hz.ar(I)Ljava/lang/String;")
    public static String method3774() {
        return Statics.field156.method2416() ? class406.method6339(field940) : field940;
    }

    @ObfuscatedName("fx.as(B)V")
    public static void method3037() {
        if (field940 != null && field940.length() > 0) {
            return;
        }
        if (Statics.field156.method2512() == null) {
            client.field579 = false;
        } else {
            field940 = Statics.field156.method2512();
            client.field579 = true;
        }
    }

    @ObfuscatedName("jk.aa(I)V")
    public static void method4556() {
        if (!Statics.field941) {
            return;
        }
        Statics.field1730 = null;
        Statics.field965 = null;
        Statics.field943 = null;
        Statics.field952 = null;
        Statics.field2495 = null;
        Statics.field960 = null;
        Statics.field1829 = null;
        Statics.field1509 = null;
        Statics.field4869 = null;
        Statics.field4675 = null;
        Statics.field1791 = null;
        Statics.field853 = null;
        Statics.field2929 = null;
        Statics.field4515 = null;
        Statics.field3545.method2397();
        class322.method3196(0, 100);
        client.method8267().method6514(true);
        Statics.field941 = false;
    }

    @ObfuscatedName("ib.az(Lof;IB)V")
    public static void method3872(class378 arg0, int arg1) {
        if ((arg1 & class530.field5188.method35()) != 0) {
            Statics.field960 = class549.method3219(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class530.field5159.method35()) != 0) {
            Statics.field960 = class549.method3219(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class530.field5170.method35()) == 0) {
            Statics.field960 = class549.method3219(arg0, "logo", "");
        } else {
            Statics.field960 = class549.method3219(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("cy.ao(I)V")
    public static void method1112() {
        if (client.field579 && field940 != null && field940.length() > 0) {
            field968 = 1;
        } else {
            field968 = 0;
        }
    }

    @ObfuscatedName("qc.au(Lbm;Lpb;Lpb;I)V")
    public static void method7343(class35 arg0, class413 arg1, class413 arg2) {
        if (field956) {
            Statics.method3586(arg0);
            return;
        }
        if ((class36.field227 == 1 || !Statics.field5137 && class36.field227 == 4) && class36.field225 >= field942 + 765 - 50 && class36.field238 >= 453) {
            Statics.field156.method2417(!Statics.field156.method2463());
            if (Statics.field156.method2463()) {
                class322.method3196(0, 0);
            } else {
                ArrayList var3 = new ArrayList();
                var3.add(new class334(Statics.field2922, "scape main", "", 255, false));
                class322.method2753(var3, 0, 0, 0, 100, false);
            }
            class322.method1122();
        }
        if (client.field532 == 5) {
            return;
        }
        if (field975 == -1L) {
            field975 = class318.method2218() + 1000L;
        }
        long var4 = class318.method2218();
        boolean var6;
        if (client.field597 == null || client.field624 >= client.field597.size()) {
            var6 = true;
        } else {
            while (true) {
                if (client.field624 >= client.field597.size()) {
                    var6 = true;
                    break;
                }
                class85 var7 = (class85) client.field597.get(client.field624);
                if (!var7.method2221()) {
                    var6 = false;
                    break;
                }
                client.field624++;
            }
        }
        if (var6 && field976 == -1L) {
            field976 = var4;
            if (field976 > field975) {
                field975 = field976;
            }
        }
        if (client.field532 != 10 && client.field532 != 11) {
            return;
        }
        if (Statics.field2689 == class393.field4493) {
            if (class36.field227 == 1 || !Statics.field5137 && class36.field227 == 4) {
                int var8 = field942 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class36.field225 >= var8 && class36.field225 <= var8 + var10 && class36.field238 >= var9 && class36.field238 <= var9 + var11) {
                    if (class69.method3898()) {
                        field956 = true;
                        field973 = 0;
                        field974 = 0;
                    }
                    return;
                }
            }
            if (Statics.field3296 != null && class69.method3898()) {
                field956 = true;
                field973 = 0;
                field974 = 0;
            }
        }
        int var12 = class36.field227;
        int var13 = class36.field225;
        int var14 = class36.field238;
        if (var12 == 0) {
            var13 = class36.field229;
            var14 = class36.field230;
        }
        if (!Statics.field5137 && var12 == 4) {
            var12 = 1;
        }
        class229 var15 = client.method5445();
        if (field971 == 0) {
            boolean var16 = false;
            while (var15.method4043()) {
                if (var15.field2435 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field955 - 80;
            short var18 = 291;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var18 - 20 && var14 <= var18 + 20) {
                class32.method2989(client.method5467("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field955 + 80;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var18 - 20 && var14 <= var18 + 20 || var16) {
                method7980();
            }
        } else if (field971 == 1) {
            while (true) {
                if (!var15.method4043()) {
                    int var20 = Statics.field955 - 80;
                    short var21 = 321;
                    if (var12 == 1 && var13 >= var20 - 75 && var13 <= var20 + 75 && var14 >= var21 - 20 && var14 <= var21 + 20) {
                        method3055(false);
                    }
                    int var22 = Statics.field955 + 80;
                    if (var12 == 1 && var13 >= var22 - 75 && var13 <= var22 + 75 && var14 >= var21 - 20 && var14 <= var21 + 20) {
                        method3891(0);
                    }
                    break;
                }
                if (var15.field2435 == 84) {
                    method3055(false);
                } else if (var15.field2435 == 13) {
                    method3891(0);
                }
            }
        } else if (field971 == 2) {
            short var23 = 201;
            int var167 = var23 + 52;
            if (var12 == 1 && var14 >= var167 - 12 && var14 < var167 + 2) {
                field968 = 0;
            }
            var167 += 15;
            if (var12 == 1 && var14 >= var167 - 12 && var14 < var167 + 2) {
                field968 = 1;
            }
            var167 += 15;
            short var24 = 361;
            if (Statics.field36 != null) {
                int var25 = Statics.field36.field4826 / 2;
                if (var12 == 1 && var13 >= Statics.field36.field4827 - var25 && var13 <= Statics.field36.field4827 + var25 && var14 >= var24 - 15 && var14 < var24) {
                    switch(field978) {
                        case 1:
                            class32.method2989(class370.field4319, true, false);
                            return;
                        case 2:
                            class32.method2989("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field955 - 80;
            short var27 = 321;
            if (var12 == 1 && var13 >= var26 - 75 && var13 <= var26 + 75 && var14 >= var27 - 20 && var14 <= var27 + 20) {
                method2658();
                return;
            }
            int var28 = field949 + 180 + 80;
            if (var12 == 1 && var13 >= var28 - 75 && var13 <= var28 + 75 && var14 >= var27 - 20 && var14 <= var27 + 20) {
                method3891(0);
                field940 = "";
                field961 = "";
                Statics.field248 = 0;
                Statics.field933 = "";
                field967 = true;
            }
            int var29 = Statics.field955 + -117;
            short var30 = 277;
            field980 = var13 >= var29 && var13 < Statics.field860 + var29 && var14 >= var30 && var14 < Statics.field3449 + var30;
            if (var12 == 1 && field980) {
                client.field579 = !client.field579;
                if (!client.field579 && Statics.field156.method2512() != null) {
                    Statics.field156.method2431((String) null);
                }
            }
            int var31 = Statics.field955 + 24;
            short var32 = 277;
            field966 = var13 >= var31 && var13 < Statics.field860 + var31 && var14 >= var32 && var14 < Statics.field3449 + var32;
            if (var12 == 1 && field966) {
                Statics.field156.method2415(!Statics.field156.method2416());
                if (!Statics.field156.method2416()) {
                    field940 = "";
                    Statics.field156.method2431((String) null);
                    method1112();
                }
            }
            while (true) {
                Transferable var36;
                int var37;
                do {
                    while (true) {
                        label1059: do {
                            while (true) {
                                while (var15.method4043()) {
                                    if (var15.field2435 == 13) {
                                        method3891(0);
                                        field940 = "";
                                        field961 = "";
                                        Statics.field248 = 0;
                                        Statics.field933 = "";
                                        field967 = true;
                                    } else {
                                        if (field968 != 0) {
                                            continue label1059;
                                        }
                                        char var33 = var15.field2429;
                                        for (int var34 = 0; var34 < field969.length() && var33 != field969.charAt(var34); var34++) {
                                        }
                                        if (var15.field2435 == 85 && field940.length() > 0) {
                                            field940 = field940.substring(0, field940.length() - 1);
                                        }
                                        if (var15.field2435 == 84 || var15.field2435 == 80) {
                                            field968 = 1;
                                        }
                                        if (method3360(var15.field2429) && field940.length() < 320) {
                                            field940 = field940 + var15.field2429;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field968 != 1);
                        if (var15.field2435 == 85 && field961.length() > 0) {
                            field961 = field961.substring(0, field961.length() - 1);
                        } else if (var15.field2435 == 84 || var15.field2435 == 80) {
                            field968 = 0;
                            if (var15.field2435 == 84) {
                                method2658();
                                return;
                            }
                        }
                        if ((var15.method4065(82) || var15.method4065(87)) && var15.field2435 == 67) {
                            Clipboard var35 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var36 = var35.getContents(Statics.field2033);
                            var37 = 20 - field961.length();
                            break;
                        }
                        if (class404.method5811(var15.field2429) && method3360(var15.field2429) && field961.length() < 20) {
                            field961 = field961 + var15.field2429;
                        }
                    }
                } while (var37 <= 0);
                try {
                    String var38 = (String) var36.getTransferData(DataFlavor.stringFlavor);
                    int var39 = Math.min(var37, var38.length());
                    for (int var40 = 0; var40 < var39; var40++) {
                        if (!class404.method5811(var38.charAt(var40)) || !method3360(var38.charAt(var40))) {
                            method3891(3);
                            return;
                        }
                    }
                    field961 = field961 + var38.substring(0, var39);
                } catch (UnsupportedFlavorException var165) {
                } catch (IOException var166) {
                }
            }
        } else if (field971 == 3) {
            int var43 = field949 + 180;
            short var44 = 241;
            class465 var45 = arg1.method7166(25, class370.field4234.length() - 34, class370.field4234, var43, var44);
            if (var12 == 1 && var45.method7745(var13, var14)) {
                class32.method2989(class370.field4318, true, false);
            }
            int var46 = field949 + 180;
            short var47 = 276;
            if (var12 == 1 && var13 >= var46 - 75 && var13 <= var46 + 75 && var14 >= var47 - 20 && var14 <= var47 + 20) {
                method5444(false);
            }
            int var48 = field949 + 180;
            short var49 = 326;
            if (var12 == 1 && var13 >= var48 - 75 && var13 <= var48 + 75 && var14 >= var49 - 20 && var14 <= var49 + 20) {
                class32.method2989(class370.field4319, true, false);
                return;
            }
        } else if (field971 == 4) {
            int var50 = field949 + 180 - 80;
            short var51 = 321;
            if (var12 == 1 && var13 >= var50 - 75 && var13 <= var50 + 75 && var14 >= var51 - 20 && var14 <= var51 + 20) {
                method2147();
                return;
            }
            if (var12 == 1 && var13 >= field949 + 180 - 9 && var13 <= field949 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field967 = !field967;
            }
            if (var12 == 1 && var13 >= field949 + 180 - 34 && var13 <= field949 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class32.method2989(class370.field4319, true, false);
            }
            int var52 = field949 + 180 + 80;
            if (var12 == 1 && var13 >= var52 - 75 && var13 <= var52 + 75 && var14 >= var51 - 20 && var14 <= var51 + 20) {
                method3891(0);
                field940 = "";
                field961 = "";
                Statics.field248 = 0;
                Statics.field933 = "";
            }
            while (var15.method4043()) {
                boolean var53 = false;
                for (int var54 = 0; var54 < field970.length(); var54++) {
                    if (var15.field2429 == field970.charAt(var54)) {
                        var53 = true;
                        break;
                    }
                }
                if (var15.field2435 == 13) {
                    method3891(0);
                    field940 = "";
                    field961 = "";
                    Statics.field248 = 0;
                    Statics.field933 = "";
                } else {
                    if (var15.field2435 == 85 && Statics.field933.length() > 0) {
                        Statics.field933 = Statics.field933.substring(0, Statics.field933.length() - 1);
                    }
                    if (var15.field2435 == 84) {
                        method2147();
                        return;
                    }
                    if (var53 && Statics.field933.length() < 6) {
                        Statics.field933 = Statics.field933 + var15.field2429;
                    }
                }
            }
        } else if (field971 == 5) {
            int var55 = field949 + 180 - 80;
            short var56 = 321;
            if (var12 == 1 && var13 >= var55 - 75 && var13 <= var55 + 75 && var14 >= var56 - 20 && var14 <= var56 + 20) {
                field940 = field940.trim();
                if (field940.length() == 0) {
                    method2776(class370.field4270, class370.field4026, class370.field4272);
                } else {
                    long var63;
                    try {
                        URL var57 = new URL(client.method5467("services", false) + "m=accountappeal/login.ws");
                        URLConnection var58 = var57.openConnection();
                        var58.setRequestProperty("connection", "close");
                        var58.setDoInput(true);
                        var58.setDoOutput(true);
                        var58.setConnectTimeout(5000);
                        OutputStreamWriter var59 = new OutputStreamWriter(var58.getOutputStream());
                        var59.write("data1=req");
                        var59.flush();
                        InputStream var60 = var58.getInputStream();
                        class534 var61 = new class534(new byte[1000]);
                        while (true) {
                            int var62 = var60.read(var61.field5199, var61.field5200, 1000 - var61.field5200);
                            if (var62 == -1) {
                                var61.field5200 = 0;
                                long var65 = var61.method8598();
                                var63 = var65;
                                break;
                            }
                            var61.field5200 += var62;
                            if (var61.field5200 >= 1000) {
                                var63 = 0L;
                                break;
                            }
                        }
                    } catch (Exception var161) {
                        var63 = 0L;
                    }
                    int var70;
                    if (var63 == 0L) {
                        var70 = 5;
                    } else {
                        var70 = class74.method3484(var63, field940);
                    }
                    switch(var70) {
                        case 2:
                            method2776(class370.field4273, class370.field4089, class370.field4275);
                            method3891(6);
                            break;
                        case 3:
                            method2776(class370.field4032, class370.field4277, class370.field4290);
                            break;
                        case 4:
                            method2776(class370.field4279, class370.field4280, class370.field4075);
                            break;
                        case 5:
                            method2776(class370.field4282, class370.field4283, class370.field4284);
                            break;
                        case 6:
                            method2776(class370.field4109, class370.field4286, class370.field4054);
                            break;
                        case 7:
                            method2776(class370.field4288, class370.field4289, class370.field4034);
                    }
                }
                return;
            }
            int var71 = field949 + 180 + 80;
            if (var12 == 1 && var13 >= var71 - 75 && var13 <= var71 + 75 && var14 >= var56 - 20 && var14 <= var56 + 20) {
                method3055(true);
            }
            short var72 = 361;
            if (Statics.field3614 != null) {
                int var73 = Statics.field3614.field4826 / 2;
                if (var12 == 1 && var13 >= Statics.field3614.field4827 - var73 && var13 <= Statics.field3614.field4827 + var73 && var14 >= var72 - 15 && var14 < var72) {
                    class32.method2989(client.method5467("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var15.method4043()) {
                boolean var74 = false;
                for (int var75 = 0; var75 < field969.length(); var75++) {
                    if (var15.field2429 == field969.charAt(var75)) {
                        var74 = true;
                        break;
                    }
                }
                if (var15.field2435 == 13) {
                    method3055(true);
                } else {
                    if (var15.field2435 == 85 && field940.length() > 0) {
                        field940 = field940.substring(0, field940.length() - 1);
                    }
                    if (var15.field2435 == 84) {
                        field940 = field940.trim();
                        if (field940.length() == 0) {
                            method2776(class370.field4270, class370.field4026, class370.field4272);
                        } else {
                            long var82;
                            try {
                                URL var76 = new URL(client.method5467("services", false) + "m=accountappeal/login.ws");
                                URLConnection var77 = var76.openConnection();
                                var77.setRequestProperty("connection", "close");
                                var77.setDoInput(true);
                                var77.setDoOutput(true);
                                var77.setConnectTimeout(5000);
                                OutputStreamWriter var78 = new OutputStreamWriter(var77.getOutputStream());
                                var78.write("data1=req");
                                var78.flush();
                                InputStream var79 = var77.getInputStream();
                                class534 var80 = new class534(new byte[1000]);
                                while (true) {
                                    int var81 = var79.read(var80.field5199, var80.field5200, 1000 - var80.field5200);
                                    if (var81 == -1) {
                                        var80.field5200 = 0;
                                        long var84 = var80.method8598();
                                        var82 = var84;
                                        break;
                                    }
                                    var80.field5200 += var81;
                                    if (var80.field5200 >= 1000) {
                                        var82 = 0L;
                                        break;
                                    }
                                }
                            } catch (Exception var162) {
                                var82 = 0L;
                            }
                            int var89;
                            if (var82 == 0L) {
                                var89 = 5;
                            } else {
                                var89 = class74.method3484(var82, field940);
                            }
                            switch(var89) {
                                case 2:
                                    method2776(class370.field4273, class370.field4089, class370.field4275);
                                    method3891(6);
                                    break;
                                case 3:
                                    method2776(class370.field4032, class370.field4277, class370.field4290);
                                    break;
                                case 4:
                                    method2776(class370.field4279, class370.field4280, class370.field4075);
                                    break;
                                case 5:
                                    method2776(class370.field4282, class370.field4283, class370.field4284);
                                    break;
                                case 6:
                                    method2776(class370.field4109, class370.field4286, class370.field4054);
                                    break;
                                case 7:
                                    method2776(class370.field4288, class370.field4289, class370.field4034);
                            }
                        }
                        return;
                    }
                    if (var74 && field940.length() < 320) {
                        field940 = field940 + var15.field2429;
                    }
                }
            }
        } else if (field971 == 6) {
            while (true) {
                do {
                    if (!var15.method4043()) {
                        short var90 = 321;
                        if (var12 == 1 && var14 >= var90 - 20 && var14 <= var90 + 20) {
                            method3055(true);
                        }
                        return;
                    }
                } while (var15.field2435 != 84 && var15.field2435 != 13);
                method3055(true);
            }
        } else if (field971 == 7) {
            if (Statics.field3132 && !client.field530) {
                int var91 = Statics.field955 - 150;
                int var92 = var91 + 240 + 25 + 40;
                short var93 = 231;
                int var94 = var93 + 40;
                if (var12 == 1 && var13 >= var91 && var13 <= var92 && var14 >= var93 && var14 <= var94) {
                    field962 = method2327(var91, var13);
                }
                int var95 = field949 + 180 - 80;
                short var96 = 321;
                if (var12 == 1 && var13 >= var95 - 75 && var13 <= var95 + 75 && var14 >= var96 - 20 && var14 <= var96 + 20) {
                    boolean var105;
                    label954: {
                        Date var103;
                        try {
                            SimpleDateFormat var97 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var97.setLenient(false);
                            StringBuilder var98 = new StringBuilder();
                            String[] var99 = field963;
                            int var100 = 0;
                            Date var102;
                            while (true) {
                                if (var100 >= var99.length) {
                                    var98.append("12");
                                    var102 = var97.parse(var98.toString());
                                    break;
                                }
                                String var101 = var99[var100];
                                if (var101 == null) {
                                    method654("Date not valid.", "Please ensure all characters are populated.", "");
                                    var102 = null;
                                    break;
                                }
                                var98.append(var101);
                                var100++;
                            }
                            var103 = var102;
                        } catch (ParseException var164) {
                            method654("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var105 = false;
                            break label954;
                        }
                        if (var103 == null) {
                            var105 = false;
                        } else {
                            boolean var106 = method3790(var103);
                            Date var107 = method187();
                            boolean var108 = var103.after(var107);
                            if (var108) {
                                if (var106) {
                                    Statics.field3458 = (int) (var103.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field3458 = 8388607;
                                }
                                var105 = true;
                            } else {
                                method654("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var105 = false;
                            }
                        }
                    }
                    if (var105) {
                        client.method2012(50);
                        return;
                    }
                }
                int var111 = field949 + 180 + 80;
                if (var12 == 1 && var13 >= var111 - 75 && var13 <= var111 + 75 && var14 >= var96 - 20 && var14 <= var96 + 20) {
                    field963 = new String[8];
                    method3055(true);
                }
                while (var15.method4043()) {
                    if (var15.field2435 == 101) {
                        field963[field962] = null;
                    }
                    if (var15.field2435 == 85) {
                        if (field963[field962] == null && field962 > 0) {
                            field962--;
                        }
                        field963[field962] = null;
                    }
                    if (var15.field2429 >= '0' && var15.field2429 <= '9') {
                        field963[field962] = "" + var15.field2429;
                        if (field962 < 7) {
                            field962++;
                        }
                    }
                    if (var15.field2435 == 84) {
                        boolean var120;
                        label882: {
                            Date var118;
                            try {
                                SimpleDateFormat var112 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var112.setLenient(false);
                                StringBuilder var113 = new StringBuilder();
                                String[] var114 = field963;
                                int var115 = 0;
                                while (true) {
                                    Date var117;
                                    if (var115 < var114.length) {
                                        String var116 = var114[var115];
                                        if (var116 != null) {
                                            var113.append(var116);
                                            var115++;
                                            continue;
                                        }
                                        method654("Date not valid.", "Please ensure all characters are populated.", "");
                                        var117 = null;
                                    } else {
                                        var113.append("12");
                                        var117 = var112.parse(var113.toString());
                                    }
                                    var118 = var117;
                                    break;
                                }
                            } catch (ParseException var163) {
                                method654("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var120 = false;
                                break label882;
                            }
                            if (var118 == null) {
                                var120 = false;
                            } else {
                                boolean var121 = method3790(var118);
                                Date var122 = method187();
                                boolean var123 = var118.after(var122);
                                if (var123) {
                                    if (var121) {
                                        Statics.field3458 = (int) (var118.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field3458 = 8388607;
                                    }
                                    var120 = true;
                                } else {
                                    method654("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var120 = false;
                                }
                            }
                        }
                        if (var120) {
                            client.method2012(50);
                        }
                        return;
                    }
                }
            } else {
                int var126 = field949 + 180 - 80;
                short var127 = 321;
                if (var12 == 1 && var13 >= var126 - 75 && var13 <= var126 + 75 && var14 >= var127 - 20 && var14 <= var127 + 20) {
                    class32.method2989(client.method5467("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2776(class370.field4232, class370.field4268, class370.field4269);
                    method3891(6);
                    return;
                }
                int var128 = field949 + 180 + 80;
                if (var12 == 1 && var13 >= var128 - 75 && var13 <= var128 + 75 && var14 >= var127 - 20 && var14 <= var127 + 20) {
                    method3055(true);
                }
            }
        } else if (field971 == 8) {
            int var129 = field949 + 180 - 80;
            short var130 = 321;
            if (var12 == 1 && var13 >= var129 - 75 && var13 <= var129 + 75 && var14 >= var130 - 20 && var14 <= var130 + 20) {
                class32.method2989("https://www.jagex.com/terms/privacy", true, false);
                method2776(class370.field4232, class370.field4268, class370.field4269);
                method3891(6);
                return;
            }
            int var131 = field949 + 180 + 80;
            if (var12 == 1 && var13 >= var131 - 75 && var13 <= var131 + 75 && var14 >= var130 - 20 && var14 <= var130 + 20) {
                method3055(true);
            }
        } else if (field971 == 9) {
            int var132 = field949 + 180;
            short var133 = 311;
            if (var15.field2435 == 84 || var15.field2435 == 13 || var12 == 1 && var13 >= var132 - 75 && var13 <= var132 + 75 && var14 >= var133 - 20 && var14 <= var133 + 20) {
                method5444(false);
            }
        } else if (field971 == 10) {
            int var134 = field949 + 180;
            short var135 = 209;
            if (var15.field2435 == 84 || var12 == 1 && var13 >= var134 - 109 && var13 <= var134 + 109 && var14 >= var135 && var14 <= var135 + 68) {
                method2776(class370.field4236, class370.field4237, class370.field4238);
                client.field564 = class539.field5254;
                client.method2259(false);
                client.method2012(20);
            }
        } else if (field971 == 12) {
            int var136 = Statics.field955;
            short var137 = 233;
            class465 var138 = arg2.method7166(0, 30, class370.field4189, var136, var137);
            class465 var139 = arg2.method7166(32, 32, class370.field4189, var136, var137);
            class465 var140 = arg2.method7166(70, 34, class370.field4189, var136, var137);
            int var168 = var137 + 17;
            class465 var141 = arg2.method7166(0, 34, class370.field4140, var136, var168);
            if (var12 == 1) {
                if (var138.method7745(var13, var14)) {
                    class32.method2989("https://www.jagex.com/terms", true, false);
                } else if (var139.method7745(var13, var14)) {
                    class32.method2989("https://www.jagex.com/terms/privacy", true, false);
                } else if (var140.method7745(var13, var14) || var141.method7745(var13, var14)) {
                    class32.method2989("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var142 = Statics.field955 - 80;
            short var143 = 311;
            if (var12 == 1 && var13 >= var142 - 75 && var13 <= var142 + 75 && var14 >= var143 - 20 && var14 <= var143 + 20) {
                client.method653();
                method5444(true);
            }
            int var144 = Statics.field955 + 80;
            if (var12 == 1 && var13 >= var144 - 75 && var13 <= var144 + 75 && var14 >= var143 - 20 && var14 <= var143 + 20) {
                field971 = 13;
            }
        } else if (field971 == 13) {
            int var145 = Statics.field955;
            short var146 = 321;
            if (var12 == 1 && var13 >= var145 - 75 && var13 <= var145 + 75 && var14 >= var146 - 20 && var14 <= var146 + 20) {
                method5444(true);
            }
        } else if (field971 == 14) {
            String var147 = "";
            switch(field953) {
                case 0:
                    var147 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var147 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var147 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method3055(false);
            }
            int var148 = field949 + 180;
            short var149 = 276;
            if (var12 == 1 && var13 >= var148 - 75 && var13 <= var148 + 75 && var14 >= var149 - 20 && var14 <= var149 + 20) {
                class32.method2989(var147, true, false);
                method2776(class370.field4232, class370.field4268, class370.field4269);
                method3891(6);
                return;
            }
            int var150 = field949 + 180;
            short var151 = 326;
            if (var12 == 1 && var13 >= var150 - 75 && var13 <= var150 + 75 && var14 >= var151 - 20 && var14 <= var151 + 20) {
                method3055(false);
            }
        } else if (field971 == 24) {
            int var152 = field949 + 180;
            short var153 = 301;
            if (var12 == 1 && var13 >= var152 - 75 && var13 <= var152 + 75 && var14 >= var153 - 20 && var14 <= var153 + 20) {
                method5444(false);
            }
        } else if (field971 == 32) {
            int var154 = field949 + 180 - 80;
            short var155 = 321;
            if (var12 == 1 && var13 >= var154 - 75 && var13 <= var154 + 75 && var14 >= var155 - 20 && var14 <= var155 + 20) {
                class32.method2989(client.method5467("secure", true) + "m=dob/set_dob.ws", true, false);
                method2776(class370.field4232, class370.field4268, class370.field4269);
                method3891(6);
                return;
            }
            int var156 = field949 + 180 + 80;
            if (var12 == 1 && var13 >= var156 - 75 && var13 <= var156 + 75 && var14 >= var155 - 20 && var14 <= var155 + 20) {
                method3055(true);
            }
        } else if (field971 == 33) {
            int var157 = field949 + 180;
            short var158 = 276;
            if (var12 == 1 && var13 >= var157 - 75 && var13 <= var157 + 75 && var14 >= var158 - 20 && var14 <= var158 + 20) {
                class32.method2989(class370.field4318, true, false);
            }
            int var159 = field949 + 180;
            short var160 = 326;
            if (var12 == 1 && var13 >= var159 - 75 && var13 <= var159 + 75 && var14 >= var160 - 20 && var14 <= var160 + 20) {
                method3055(true);
            }
        }
    }

    @ObfuscatedName("dv.ak(I)V")
    public static void method2147() {
        Statics.field933.trim();
        if (Statics.field933.length() != 6) {
            method2776(class370.field4261, class370.field4047, class370.field4048);
            return;
        }
        Statics.field248 = Integer.parseInt(Statics.field933);
        Statics.field933 = "";
        client.method2259(true);
        method2776(class370.field4236, class370.field4237, class370.field4238);
        client.method2012(20);
    }

    @ObfuscatedName("ex.ah(B)V")
    public static void method2658() {
        field940 = field940.trim();
        if (field940.length() == 0) {
            method2776(class370.field4127, class370.field4181, class370.field4229);
        } else if (field961.length() == 0) {
            method2776(class370.field4214, class370.field4131, class370.field4132);
        } else {
            method2776(class370.field4236, class370.field4237, class370.field4238);
            client.method2259(false);
            client.method2012(20);
        }
    }

    @ObfuscatedName("sl.aj(I)V")
    public static void method7980() {
        if ((client.field588 & class530.field5184.method35()) != 0) {
            field944 = "";
            field957 = class370.field4055;
            field958 = class370.field4233;
            field959 = class370.field4317;
            method3891(1);
            method1112();
        } else if ((client.field588 & class530.field5161.method35()) != 0) {
            if ((client.field588 & class530.field5163.method35()) == 0) {
                field957 = class370.field4223;
                field958 = class370.field4224;
                field959 = class370.field4169;
            } else {
                field957 = class370.field4028;
                field958 = class370.field4230;
                field959 = class370.field4231;
            }
            field944 = class370.field4166;
            method3891(1);
            method1112();
        } else if ((client.field588 & class530.field5163.method35()) == 0) {
            method3055(false);
        } else {
            field957 = class370.field4226;
            field958 = class370.field4227;
            field959 = class370.field4228;
            field944 = class370.field4166;
            method3891(1);
            method1112();
        }
    }

    @ObfuscatedName("ag.af(I)Ljava/util/Date;")
    public static Date method187() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("if.ax(Ljava/util/Date;B)Z")
    public static boolean method3790(Date arg0) {
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

    @ObfuscatedName("bv.an(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method654(String arg0, String arg1, String arg2) {
        method3891(7);
        method2776(arg0, arg1, arg2);
    }

    @ObfuscatedName("di.ag(III)I")
    public static int method2327(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("hj.am(CI)Z")
    public static boolean method3360(char arg0) {
        return field969.indexOf(arg0) != -1;
    }

    @ObfuscatedName("fg.ad(ZI)V")
    public static void method3055(boolean arg0) {
        if (Statics.field2033.method1144() || Statics.field2033.method1146() || Statics.field2033.method1145()) {
            method3891(10);
            return;
        }
        field957 = class370.field4219;
        field958 = class370.field4274;
        field959 = class370.field4221;
        method3891(2);
        if (arg0) {
            field961 = "";
        }
        method3037();
        method1112();
    }

    @ObfuscatedName("mn.at(ZI)V")
    public static void method5444(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field156.method2422() >= client.field689;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field2033.method1144() || Statics.field2033.method1146() || Statics.field2033.method1145()) {
            var1 = 10;
        }
        method3891(var1);
        if (arg0) {
            field940 = "";
            field961 = "";
            Statics.field248 = 0;
            Statics.field933 = "";
        }
        method3037();
        method1112();
    }

    @ObfuscatedName("cf.ay(Lpb;Lpb;Lpb;I)V")
    public static void method2102(class413 arg0, class413 arg1, class413 arg2) {
        field942 = (Statics.field199 - 765) / 2;
        field949 = field942 + 202;
        Statics.field955 = field949 + 180;
        if (field956) {
            if (Statics.field4675 == null) {
                Statics.field4675 = class549.method3544(Statics.field3275, "sl_back", "");
            }
            if (Statics.field1791 == null) {
                Statics.field1791 = class549.method3698(Statics.field3275, "sl_flags", "");
            }
            if (Statics.field853 == null) {
                Statics.field853 = class549.method3698(Statics.field3275, "sl_arrows", "");
            }
            if (Statics.field2929 == null) {
                Statics.field2929 = class549.method3698(Statics.field3275, "sl_stars", "");
            }
            if (Statics.field2611 == null) {
                Statics.field2611 = class549.method3219(Statics.field3275, "leftarrow", "");
            }
            if (Statics.field5118 == null) {
                Statics.field5118 = class549.method3219(Statics.field3275, "rightarrow", "");
            }
            class544.method8900(field942, 23, 765, 480, 0);
            class544.method8901(field942, 0, 125, 23, 12425273, 9135624);
            class544.method8901(field942 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method7130(class370.field4306, field942 + 62, 15, 0, -1);
            if (Statics.field2929 != null) {
                Statics.field2929[1].method8984(field942 + 140, 1);
                arg1.method7170(class370.field4077, field942 + 152, 10, 16777215, -1);
                Statics.field2929[0].method8984(field942 + 140, 12);
                arg1.method7170(class370.field4308, field942 + 152, 21, 16777215, -1);
            }
            if (Statics.field853 != null) {
                int var3 = field942 + 280;
                if (class69.field843[0] == 0 && class69.field842[0] == 0) {
                    Statics.field853[2].method8984(var3, 4);
                } else {
                    Statics.field853[0].method8984(var3, 4);
                }
                if (class69.field843[0] == 0 && class69.field842[0] == 1) {
                    Statics.field853[3].method8984(var3 + 15, 4);
                } else {
                    Statics.field853[1].method8984(var3 + 15, 4);
                }
                arg0.method7170(class370.field4309, var3 + 32, 17, 16777215, -1);
                int var4 = field942 + 390;
                if (class69.field843[0] == 1 && class69.field842[0] == 0) {
                    Statics.field853[2].method8984(var4, 4);
                } else {
                    Statics.field853[0].method8984(var4, 4);
                }
                if (class69.field843[0] == 1 && class69.field842[0] == 1) {
                    Statics.field853[3].method8984(var4 + 15, 4);
                } else {
                    Statics.field853[1].method8984(var4 + 15, 4);
                }
                arg0.method7170(class370.field4310, var4 + 32, 17, 16777215, -1);
                int var5 = field942 + 500;
                if (class69.field843[0] == 2 && class69.field842[0] == 0) {
                    Statics.field853[2].method8984(var5, 4);
                } else {
                    Statics.field853[0].method8984(var5, 4);
                }
                if (class69.field843[0] == 2 && class69.field842[0] == 1) {
                    Statics.field853[3].method8984(var5 + 15, 4);
                } else {
                    Statics.field853[1].method8984(var5 + 15, 4);
                }
                arg0.method7170(class370.field4092, var5 + 32, 17, 16777215, -1);
                int var6 = field942 + 610;
                if (class69.field843[0] == 3 && class69.field842[0] == 0) {
                    Statics.field853[2].method8984(var6, 4);
                } else {
                    Statics.field853[0].method8984(var6, 4);
                }
                if (class69.field843[0] == 3 && class69.field842[0] == 1) {
                    Statics.field853[3].method8984(var6 + 15, 4);
                } else {
                    Statics.field853[1].method8984(var6 + 15, 4);
                }
                arg0.method7170(class370.field4072, var6 + 32, 17, 16777215, -1);
            }
            class544.method8900(field942 + 708, 4, 50, 16, 0);
            arg1.method7130(class370.field4235, field942 + 708 + 25, 16, 16777215, -1);
            field972 = -1;
            if (Statics.field4675 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class69.field840) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class69.field840) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class69.field840) {
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
                int var17 = (class69.field840 + var10 - 1) / var10;
                field974 = var17 - var9;
                if (Statics.field2611 != null && field973 > 0) {
                    Statics.field2611.method8984(8, Statics.field2531 / 2 - Statics.field2611.field5295 / 2);
                }
                if (Statics.field5118 != null && field973 < field974) {
                    Statics.field5118.method8984(Statics.field199 - Statics.field5118.field5290 - 8, Statics.field2531 / 2 - Statics.field5118.field5295 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field942 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field973;
                for (int var23 = var10 * var22; var23 < class69.field840 && var22 - field973 < var9; var23++) {
                    class69 var24 = Statics.field2661[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field846);
                    if (var24.field846 == -1) {
                        var26 = class370.field4313;
                        var25 = false;
                    } else if (var24.field846 > 1980) {
                        var26 = class370.field4314;
                        var25 = false;
                    }
                    class110 var27 = null;
                    int var28 = 0;
                    if (var24.method1737()) {
                        var27 = var24.method1718() ? class110.field1405 : class110.field1398;
                    } else if (var24.method1719()) {
                        var27 = var24.method1718() ? class110.field1407 : class110.field1406;
                    } else if (var24.method1735()) {
                        var28 = 16711680;
                        var27 = var24.method1718() ? class110.field1397 : class110.field1396;
                    } else if (var24.method1725()) {
                        var27 = var24.method1718() ? class110.field1402 : class110.field1400;
                    } else if (var24.method1721()) {
                        var27 = var24.method1718() ? class110.field1395 : class110.field1394;
                    } else if (var24.method1726()) {
                        var27 = var24.method1718() ? class110.field1401 : class110.field1403;
                    } else if (var24.method1744()) {
                        var27 = var24.method1718() ? class110.field1399 : class110.field1404;
                    }
                    if (var27 == null || var27.field1408 >= Statics.field4675.length) {
                        var27 = var24.method1718() ? class110.field1393 : class110.field1392;
                    }
                    if (class36.field229 >= var19 && class36.field230 >= var18 && class36.field229 < var7 + var19 && class36.field230 < var8 + var18 && var25) {
                        field972 = var23;
                        Statics.field4675[var27.field1408].method9016(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field4675[var27.field1408].method9051(var19, var18);
                    }
                    if (Statics.field1791 != null) {
                        Statics.field1791[(var24.method1718() ? 8 : 0) + var24.field849].method8984(var19 + 29, var18);
                    }
                    arg0.method7130(Integer.toString(var24.field837), var19 + 15, var8 / 2 + var18 + 5, var28, -1);
                    arg1.method7130(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
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
                    int var29 = arg1.method7128(Statics.field2661[field972].field839) + 6;
                    int var30 = arg1.field4594 + 8;
                    int var31 = class36.field230 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class36.field230 - 25 - var30;
                    }
                    class544.method8900(class36.field229 - var29 / 2, var31, var29, var30, 16777120);
                    class544.method8945(class36.field229 - var29 / 2, var31, var29, var30, 0);
                    arg1.method7130(Statics.field2661[field972].field839, class36.field229, arg1.field4594 + var31 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field952.method9051(field942, 0);
        Statics.field2495.method9051(field942 + 382, 0);
        Statics.field960.method8984(field942 + 382 - Statics.field960.field5290 / 2, 18);
        if (client.field532 == 0 || client.field532 == 5) {
            byte var32 = 20;
            arg0.method7130(class370.field4218, field949 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class544.method8945(field949 + 180 - 152, var33, 304, 34, 9179409);
            class544.method8945(field949 + 180 - 151, var33 + 1, 302, 32, 0);
            class544.method8900(field949 + 180 - 150, var33 + 2, field951 * 3, 30, 9179409);
            class544.method8900(field951 * 3 + (field949 + 180 - 150), var33 + 2, 300 - field951 * 3, 30, 0);
            arg0.method7130(field977, field949 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field532 == 20) {
            Statics.field1730.method8984(field949 + 180 - Statics.field1730.field5290 / 2, 271 - Statics.field1730.field5295 / 2);
            short var34 = 201;
            arg0.method7130(field957, field949 + 180, var34, 16776960, 0);
            int var136 = var34 + 15;
            arg0.method7130(field958, field949 + 180, var136, 16776960, 0);
            int var137 = var136 + 15;
            arg0.method7130(field959, field949 + 180, var137, 16776960, 0);
            int var138 = var137 + 15;
            int var139 = var138 + 7;
            if (field971 != 4 && field971 != 10) {
                arg0.method7170(class370.field4157, field949 + 180 - 110, var139, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method3774(); arg0.method7128(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method7170(class417.method7131(var36), field949 + 180 - 70, var139, 16777215, 0);
                var136 = var139 + 15;
                String var37;
                for (var37 = class406.method6339(field961); arg0.method7128(var37) > var35; var37 = var37.substring(1)) {
                }
                arg0.method7170(class370.field4202 + var37, field949 + 180 - 108, var136, 16777215, 0);
                var136 += 15;
            }
        }
        if (client.field532 == 10 || client.field532 == 11 || client.field532 == 50) {
            Statics.field1730.method8984(field949, 171);
            if (field971 == 0) {
                short var38 = 251;
                arg0.method7130(class370.field4225, field949 + 180, var38, 16776960, 0);
                int var140 = var38 + 30;
                int var39 = field949 + 180 - 80;
                short var40 = 291;
                Statics.field965.method8984(var39 - 73, var40 - 20);
                arg0.method7208(class370.field4249, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var41 = field949 + 180 + 80;
                Statics.field965.method8984(var41 - 73, var40 - 20);
                arg0.method7208(class370.field4250, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field971 == 1) {
                arg0.method7130(field944, field949 + 180, 201, 16776960, 0);
                short var42 = 236;
                arg0.method7130(field957, field949 + 180, var42, 16777215, 0);
                int var141 = var42 + 15;
                arg0.method7130(field958, field949 + 180, var141, 16777215, 0);
                int var142 = var141 + 15;
                arg0.method7130(field959, field949 + 180, var142, 16777215, 0);
                int var143 = var142 + 15;
                int var43 = field949 + 180 - 80;
                short var44 = 321;
                Statics.field965.method8984(var43 - 73, var44 - 20);
                arg0.method7130(class370.field4045, var43, var44 + 5, 16777215, 0);
                int var45 = field949 + 180 + 80;
                Statics.field965.method8984(var45 - 73, var44 - 20);
                arg0.method7130(class370.field4235, var45, var44 + 5, 16777215, 0);
            } else if (field971 == 2) {
                short var46 = 201;
                arg0.method7130(field957, Statics.field955, var46, 16776960, 0);
                int var144 = var46 + 15;
                arg0.method7130(field958, Statics.field955, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg0.method7130(field959, Statics.field955, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var147 = var146 + 7;
                arg0.method7170(class370.field4157, Statics.field955 - 110, var147, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = method3774(); arg0.method7128(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method7170(class417.method7131(var48) + (field968 == 0 & client.field536 % 40 < 20 ? class103.method6341(16776960) + class103.field1344 : ""), Statics.field955 - 70, var147, 16777215, 0);
                var144 = var147 + 15;
                String var49;
                for (var49 = class406.method6339(field961); arg0.method7128(var49) > var47; var49 = var49.substring(1)) {
                }
                arg0.method7170(class370.field4202 + var49 + (field968 == 1 & client.field536 % 40 < 20 ? class103.method6341(16776960) + class103.field1344 : ""), Statics.field955 - 108, var144, 16777215, 0);
                var144 += 15;
                short var50 = 277;
                int var51 = Statics.field955 + -117;
                class547 var52 = method2647(client.field579, field980);
                var52.method8984(var51, var50);
                int var53 = var52.field5290 + 5 + var51;
                arg1.method7170(class370.field4253, var53, var50 + 13, 16776960, 0);
                int var54 = Statics.field955 + 24;
                class547 var55 = method2647(Statics.field156.method2416(), field966);
                var55.method8984(var54, var50);
                int var56 = var55.field5290 + 5 + var54;
                arg1.method7170(class370.field4254, var56, var50 + 13, 16776960, 0);
                int var148 = var50 + 15;
                int var57 = Statics.field955 - 80;
                short var58 = 321;
                Statics.field965.method8984(var57 - 73, var58 - 20);
                arg0.method7130(class370.field4251, var57, var58 + 5, 16777215, 0);
                int var59 = Statics.field955 + 80;
                Statics.field965.method8984(var59 - 73, var58 - 20);
                arg0.method7130(class370.field4235, var59, var58 + 5, 16777215, 0);
                short var60 = 357;
                switch(field978) {
                    case 2:
                        Statics.field218 = class370.field4266;
                        break;
                    default:
                        Statics.field218 = class370.field4177;
                }
                Statics.field36 = new class465(Statics.field955, var60, arg1.method7128(Statics.field218), 11);
                Statics.field3614 = new class465(Statics.field955, var60, arg1.method7128(class370.field4265), 11);
                arg1.method7130(Statics.field218, Statics.field955, var60, 16777215, 0);
            } else if (field971 == 3) {
                short var61 = 201;
                arg0.method7130(class370.field4255, field949 + 180, var61, 16776960, 0);
                int var149 = var61 + 20;
                arg1.method7130(class370.field4256, field949 + 180, var149, 16776960, 0);
                int var150 = var149 + 20;
                arg1.method7130(class370.field4234, field949 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                int var62 = field949 + 180;
                short var63 = 276;
                Statics.field965.method8984(var62 - 73, var63 - 20);
                arg2.method7130(class370.field4258, var62, var63 + 5, 16777215, 0);
                int var64 = field949 + 180;
                short var65 = 326;
                Statics.field965.method8984(var64 - 73, var65 - 20);
                arg2.method7130(class370.field4259, var64, var65 + 5, 16777215, 0);
            } else if (field971 == 4) {
                arg0.method7130(class370.field4242, field949 + 180, 201, 16776960, 0);
                short var66 = 236;
                arg0.method7130(field957, field949 + 180, var66, 16777215, 0);
                int var152 = var66 + 15;
                arg0.method7130(field958, field949 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                arg0.method7130(field959, field949 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                arg0.method7170(class370.field4247 + class406.method6339(Statics.field933) + (client.field536 % 40 < 20 ? class103.method6341(16776960) + class103.field1344 : ""), field949 + 180 - 108, var154, 16777215, 0);
                int var155 = var154 - 8;
                arg0.method7170(class370.field4044, field949 + 180 - 9, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method7170(class370.field4171, field949 + 180 - 9, var156, 16776960, 0);
                int var67 = field949 + 180 - 9 + arg0.method7128(class370.field4171) + 15;
                int var68 = var156 - arg0.field4594;
                class547 var69;
                if (field967) {
                    var69 = Statics.field4869;
                } else {
                    var69 = Statics.field1509;
                }
                var69.method8984(var67, var68);
                var152 = var156 + 15;
                int var70 = field949 + 180 - 80;
                short var71 = 321;
                Statics.field965.method8984(var70 - 73, var71 - 20);
                arg0.method7130(class370.field4045, var70, var71 + 5, 16777215, 0);
                int var72 = field949 + 180 + 80;
                Statics.field965.method8984(var72 - 73, var71 - 20);
                arg0.method7130(class370.field4235, var72, var71 + 5, 16777215, 0);
                arg1.method7130(class370.field4177, field949 + 180, var71 + 36, 16777215, 0);
            } else if (field971 == 5) {
                arg0.method7130(class370.field4260, field949 + 180, 201, 16776960, 0);
                short var73 = 221;
                arg2.method7130(field957, field949 + 180, var73, 16776960, 0);
                int var157 = var73 + 15;
                arg2.method7130(field958, field949 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                arg2.method7130(field959, field949 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                int var160 = var159 + 14;
                arg0.method7170(class370.field4294, field949 + 180 - 145, var160, 16777215, 0);
                short var74 = 174;
                String var75;
                for (var75 = method3774(); arg0.method7128(var75) > var74; var75 = var75.substring(1)) {
                }
                arg0.method7170(class417.method7131(var75) + (client.field536 % 40 < 20 ? class103.method6341(16776960) + class103.field1344 : ""), field949 + 180 - 34, var160, 16777215, 0);
                var157 = var160 + 15;
                int var76 = field949 + 180 - 80;
                short var77 = 321;
                Statics.field965.method8984(var76 - 73, var77 - 20);
                arg0.method7130(class370.field4262, var76, var77 + 5, 16777215, 0);
                int var78 = field949 + 180 + 80;
                Statics.field965.method8984(var78 - 73, var77 - 20);
                arg0.method7130(class370.field4263, var78, var77 + 5, 16777215, 0);
                short var79 = 356;
                arg1.method7130(class370.field4265, Statics.field955, var79, 268435455, 0);
            } else if (field971 == 6) {
                short var80 = 201;
                arg0.method7130(field957, field949 + 180, var80, 16776960, 0);
                int var161 = var80 + 15;
                arg0.method7130(field958, field949 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                arg0.method7130(field959, field949 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                int var81 = field949 + 180;
                short var82 = 321;
                Statics.field965.method8984(var81 - 73, var82 - 20);
                arg0.method7130(class370.field4263, var81, var82 + 5, 16777215, 0);
            } else if (field971 == 7) {
                if (Statics.field3132 && !client.field530) {
                    short var83 = 201;
                    arg0.method7130(field957, Statics.field955, var83, 16776960, 0);
                    int var164 = var83 + 15;
                    arg0.method7130(field958, Statics.field955, var164, 16776960, 0);
                    int var165 = var164 + 15;
                    arg0.method7130(field959, Statics.field955, var165, 16776960, 0);
                    int var84 = Statics.field955 - 150;
                    int var166 = var165 + 10;
                    for (int var85 = 0; var85 < 8; var85++) {
                        Statics.field965.method8986(var84, var166, 30, 40);
                        boolean var86 = field962 == var85 & client.field536 % 40 < 20;
                        arg0.method7170((field963[var85] == null ? "" : field963[var85]) + (var86 ? class103.method6341(16776960) + class103.field1344 : ""), var84 + 10, var166 + 27, 16777215, 0);
                        if (var85 == 1 || var85 == 3) {
                            var84 += 50;
                            arg0.method7170(class417.method7131("/"), var84 - 13, var166 + 27, 16777215, 0);
                        } else {
                            var84 += 35;
                        }
                    }
                    int var87 = Statics.field955 - 80;
                    short var88 = 321;
                    Statics.field965.method8984(var87 - 73, var88 - 20);
                    arg0.method7130("Submit", var87, var88 + 5, 16777215, 0);
                    int var89 = Statics.field955 + 80;
                    Statics.field965.method8984(var89 - 73, var88 - 20);
                    arg0.method7130(class370.field4235, var89, var88 + 5, 16777215, 0);
                } else {
                    short var90 = 216;
                    arg0.method7130(class370.field4291, field949 + 180, var90, 16776960, 0);
                    int var167 = var90 + 15;
                    arg2.method7130(class370.field4292, field949 + 180, var167, 16776960, 0);
                    int var168 = var167 + 15;
                    arg2.method7130(class370.field4293, field949 + 180, var168, 16776960, 0);
                    int var169 = var168 + 15;
                    int var91 = field949 + 180 - 80;
                    short var92 = 321;
                    Statics.field965.method8984(var91 - 73, var92 - 20);
                    arg0.method7130(class370.field4039, var91, var92 + 5, 16777215, 0);
                    int var93 = field949 + 180 + 80;
                    Statics.field965.method8984(var93 - 73, var92 - 20);
                    arg0.method7130(class370.field4263, var93, var92 + 5, 16777215, 0);
                }
            } else if (field971 == 8) {
                short var94 = 216;
                arg0.method7130(class370.field4123, field949 + 180, var94, 16776960, 0);
                int var170 = var94 + 15;
                arg2.method7130(class370.field4245, field949 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg2.method7130(class370.field4150, field949 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var95 = field949 + 180 - 80;
                short var96 = 321;
                Statics.field965.method8984(var95 - 73, var96 - 20);
                arg0.method7130(class370.field4182, var95, var96 + 5, 16777215, 0);
                int var97 = field949 + 180 + 80;
                Statics.field965.method8984(var97 - 73, var96 - 20);
                arg0.method7130(class370.field4263, var97, var96 + 5, 16777215, 0);
            } else if (field971 == 9) {
                short var98 = 221;
                arg0.method7130(field957, field949 + 180, var98, 16776960, 0);
                int var173 = var98 + 25;
                arg0.method7130(field958, field949 + 180, var173, 16776960, 0);
                int var174 = var173 + 25;
                arg0.method7130(field959, field949 + 180, var174, 16776960, 0);
                int var99 = field949 + 180;
                short var100 = 311;
                Statics.field965.method8984(var99 - 73, var100 - 20);
                arg0.method7130(class370.field4258, var99, var100 + 5, 16777215, 0);
            } else if (field971 == 10) {
                int var101 = field949 + 180;
                short var102 = 209;
                arg0.method7130(class370.field4225, field949 + 180, var102, 16776960, 0);
                int var175 = var102 + 20;
                Statics.field945.method8984(var101 - 109, var175);
                if (field964.isEmpty()) {
                    Statics.field1122.method8984(var101 - 48, var175 + 18);
                } else {
                    Statics.field1122.method8984(var101 - 48, var175 + 5);
                    arg0.method7130(field964, var101, var175 + 68 - 15, 16776960, 0);
                }
            } else if (field971 == 12) {
                int var103 = Statics.field955;
                short var104 = 216;
                arg2.method7130(class370.field4013, var103, var104, 16777215, 0);
                int var176 = var104 + 17;
                arg2.method7130(class370.field4189, var103, var176, 16777215, 0);
                int var177 = var176 + 17;
                arg2.method7130(class370.field4140, var103, var177, 16777215, 0);
                int var178 = var177 + 17;
                arg2.method7130(class370.field4301, var103, var178, 16777215, 0);
                int var105 = Statics.field955 - 80;
                short var106 = 311;
                Statics.field965.method8984(var105 - 73, var106 - 20);
                arg0.method7130(class370.field4091, var105, var106 + 5, 16777215, 0);
                int var107 = Statics.field955 + 80;
                Statics.field965.method8984(var107 - 73, var106 - 20);
                arg0.method7130(class370.field4305, var107, var106 + 5, 16777215, 0);
            } else if (field971 == 13) {
                short var108 = 231;
                arg2.method7130(class370.field4302, field949 + 180, var108, 16777215, 0);
                int var179 = var108 + 20;
                arg2.method7130(class370.field4248, field949 + 180, var179, 16777215, 0);
                int var109 = field949 + 180;
                short var110 = 311;
                Statics.field965.method8984(var109 - 73, var110 - 20);
                arg0.method7130(class370.field4263, var109, var110 + 5, 16777215, 0);
            } else if (field971 == 14) {
                short var111 = 201;
                String var112 = "";
                String var113 = "";
                String var114 = "";
                switch(field953) {
                    case 0:
                        var112 = class370.field4061;
                        var113 = class370.field4062;
                        var114 = class370.field4063;
                        break;
                    case 1:
                        var112 = class370.field4100;
                        var113 = class370.field4080;
                        var114 = class370.field4102;
                        break;
                    case 2:
                        var112 = class370.field4136;
                        var113 = class370.field4137;
                        var114 = class370.field4011;
                        break;
                    default:
                        method3055(false);
                }
                arg0.method7130(var112, field949 + 180, var111, 16776960, 0);
                int var180 = var111 + 20;
                arg0.method7130(var113, field949 + 180, var180, 16776960, 0);
                int var181 = var180 + 20;
                arg0.method7130(var114, field949 + 180, var181, 16776960, 0);
                int var115 = field949 + 180;
                short var116 = 276;
                Statics.field965.method8984(var115 - 73, var116 - 20);
                if (field953 == 1) {
                    arg0.method7130(class370.field4207, var115, var116 + 5, 16777215, 0);
                } else {
                    arg0.method7130(class370.field4133, var115, var116 + 5, 16777215, 0);
                }
                int var117 = field949 + 180;
                short var118 = 326;
                Statics.field965.method8984(var117 - 73, var118 - 20);
                arg0.method7130(class370.field4263, var117, var118 + 5, 16777215, 0);
            } else if (field971 == 24) {
                short var119 = 221;
                arg0.method7130(field957, field949 + 180, var119, 16777215, 0);
                int var182 = var119 + 15;
                arg0.method7130(field958, field949 + 180, var182, 16777215, 0);
                int var183 = var182 + 15;
                arg0.method7130(field959, field949 + 180, var183, 16777215, 0);
                int var184 = var183 + 15;
                int var120 = field949 + 180;
                short var121 = 301;
                Statics.field965.method8984(var120 - 73, var121 - 20);
                arg0.method7130(class370.field4021, var120, var121 + 5, 16777215, 0);
            } else if (field971 == 32) {
                short var122 = 216;
                arg0.method7130(class370.field4291, field949 + 180, var122, 16776960, 0);
                int var185 = var122 + 15;
                arg2.method7130(class370.field4292, field949 + 180, var185, 16776960, 0);
                int var186 = var185 + 15;
                arg2.method7130(class370.field4293, field949 + 180, var186, 16776960, 0);
                int var187 = var186 + 15;
                int var123 = field949 + 180 - 80;
                short var124 = 321;
                Statics.field965.method8984(var123 - 73, var124 - 20);
                arg0.method7130(class370.field4039, var123, var124 + 5, 16777215, 0);
                int var125 = field949 + 180 + 80;
                Statics.field965.method8984(var125 - 73, var124 - 20);
                arg0.method7130(class370.field4263, var125, var124 + 5, 16777215, 0);
            } else if (field971 == 33) {
                short var126 = 201;
                arg0.method7130(field957, field949 + 180, var126, 16776960, 0);
                int var188 = var126 + 20;
                arg1.method7130(field958, field949 + 180, var188, 16776960, 0);
                int var189 = var188 + 20;
                arg1.method7130(field959, field949 + 180, var189, 16776960, 0);
                int var190 = var189 + 15;
                int var127 = field949 + 180;
                short var128 = 276;
                Statics.field965.method8984(var127 - 73, var128 - 20);
                arg2.method7130(class370.field4128, var127, var128 + 5, 16777215, 0);
                int var129 = field949 + 180;
                short var130 = 326;
                Statics.field965.method8984(var129 - 73, var130 - 20);
                arg2.method7130(class370.field4263, var129, var130 + 5, 16777215, 0);
            }
        }
        if (client.field532 >= 10) {
            int[] var131 = new int[4];
            class544.method8890(var131);
            class544.method8892(field942, 0, field942 + 765, Statics.field2531);
            Statics.field3545.method2396(field942 - 22, client.field536);
            Statics.field3545.method2396(field942 + 765 + 22 - 128, client.field536);
            class544.method8895(var131);
        }
        Statics.field1829[Statics.field156.method2463() ? 1 : 0].method8984(field942 + 765 - 40, 463);
        if (client.field532 <= 5 || Statics.field2689 != class393.field4493) {
            return;
        }
        if (Statics.field4515 == null) {
            Statics.field4515 = class549.method3219(Statics.field3275, "sl_button", "");
            return;
        }
        int var132 = field942 + 5;
        short var133 = 463;
        byte var134 = 100;
        byte var135 = 35;
        Statics.field4515.method8984(var132, var133);
        arg0.method7130(class370.field4188 + " " + client.field522, var134 / 2 + var132, var135 / 2 + var133 - 2, 16777215, 0);
        if (Statics.field3296 == null) {
            arg1.method7130(class370.field4172, var134 / 2 + var132, var135 / 2 + var133 + 12, 16777215, 0);
        } else {
            arg1.method7130(class370.field4315, var134 / 2 + var132, var135 / 2 + var133 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("eg.ae(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2776(String arg0, String arg1, String arg2) {
        field957 = arg0;
        field958 = arg1;
        field959 = arg2;
    }

    @ObfuscatedName("jl.ab(Lcj;I)V")
    public static void method4517(class69 arg0) {
        if (arg0.method1718() != client.field525) {
            client.field525 = arg0.method1718();
            boolean var1 = arg0.method1718();
            if (Statics.field1288 != var1) {
                class205.method3444();
                Statics.field1288 = var1;
            }
        }
        if (client.field588 != arg0.field852) {
            method3872(Statics.field3275, arg0.field852);
        }
        Statics.field1931 = arg0.field850;
        client.field522 = arg0.field837;
        client.field588 = arg0.field852;
        Statics.field153 = arg0.field851;
        Statics.field2313 = client.field821 == 0 ? 43594 : arg0.field837 + 40000;
        Statics.field1706 = client.field821 == 0 ? 443 : arg0.field837 + 50000;
        Statics.field3447 = Statics.field2313;
    }

    @ObfuscatedName("fw.av(II)V")
    public static void method3058(int arg0) {
        method3891(14);
        field953 = arg0;
    }

    @ObfuscatedName("jo.ap(B)V")
    public static void method4530() {
        field956 = false;
        Statics.field952.method9051(field942, 0);
        Statics.field2495.method9051(field942 + 382, 0);
        Statics.field960.method8984(field942 + 382 - Statics.field960.field5290 / 2, 18);
    }

    @ObfuscatedName("cq.bu(B)V")
    public static void method2028() {
        method3891(24);
        method2776(class370.field4239, class370.field4240, class370.field4241);
    }

    @ObfuscatedName("ik.bo(II)V")
    public static void method3891(int arg0) {
        if (field971 != arg0) {
            field971 = arg0;
        }
    }

    @ObfuscatedName("be.bd(I)I")
    public static int method781() {
        return field971;
    }

    @ObfuscatedName("nr.bi(Ljava/lang/String;I)V")
    public static void method6319(String arg0) {
        field964 = Statics.method6325(arg0);
    }
}
