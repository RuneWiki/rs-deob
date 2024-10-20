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
import java.util.Random;

@ObfuscatedName("ca")
public class class78 {

    @ObfuscatedName("ca.an")
    public static int field925 = 0;

    @ObfuscatedName("ca.ap")
    public static int field912 = field925 + 202;

    @ObfuscatedName("ca.ai")
    public static int field913 = 10;

    @ObfuscatedName("ca.at")
    public static String field914 = "";

    @ObfuscatedName("ca.bn")
    public static int field905 = -1;

    @ObfuscatedName("ca.bs")
    public static int field942 = 1;

    @ObfuscatedName("ca.cx")
    public static int field918 = 0;

    @ObfuscatedName("ca.cu")
    public static String field919 = "";

    @ObfuscatedName("ca.cz")
    public static String field920 = "";

    @ObfuscatedName("ca.cm")
    public static String field921 = "";

    @ObfuscatedName("ca.ct")
    public static String field922 = "";

    @ObfuscatedName("ca.cl")
    public static String field923 = "";

    @ObfuscatedName("ca.cb")
    public static String field902 = "";

    @ObfuscatedName("ca.cj")
    public static int field916 = 0;

    @ObfuscatedName("ca.cg")
    public static String[] field926 = new String[8];

    @ObfuscatedName("ca.cn")
    public static String field927 = "";

    @ObfuscatedName("ca.ck")
    public static boolean field928 = false;

    @ObfuscatedName("ca.ch")
    public static boolean field915 = false;

    @ObfuscatedName("ca.ca")
    public static boolean field930 = true;

    @ObfuscatedName("ca.dv")
    public static int field939 = 0;

    @ObfuscatedName("ca.da")
    public static String field932 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ca.dp")
    public static String field938 = "1234567890";

    @ObfuscatedName("ca.dl")
    public static boolean field934 = false;

    @ObfuscatedName("ca.ds")
    public static int field917 = -1;

    @ObfuscatedName("ca.dh")
    public static int field906 = 0;

    @ObfuscatedName("ca.do")
    public static int field937 = 0;

    @ObfuscatedName("ca.dq")
    public static long field935;

    @ObfuscatedName("ca.dr")
    public static long field940;

    @ObfuscatedName("ca.dg")
    public static String[] field936;

    @ObfuscatedName("ca.dt")
    public static String[] field941;

    @ObfuscatedName("ca.du")
    public static String[] field924;

    static {
        new DecimalFormat("##0.00");
        new class139();
        field935 = -1L;
        field940 = -1L;
        field936 = new String[] { "title.jpg" };
        field941 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field924 = new String[] { "logo_speedrunning" };
    }

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.ab(Lob;Lob;ZII)V")
    public static void method3284(class389 arg0, class389 arg1, boolean arg2, int arg3) {
        if (!Statics.field933) {
            if (arg3 == 0) {
                method1307(arg2);
            } else {
                method8645(arg3);
            }
            class559.method9196();
            byte[] var4 = arg0.method6657("title.jpg", "");
            Statics.field3988 = class31.method4354(var4);
            Statics.field1373 = Statics.field3988.method9243();
            method6574(arg1, client.field719);
            Statics.field910 = class564.method2731(arg1, "titlebox", "");
            Statics.field3233 = class564.method2731(arg1, "titlebutton", "");
            Statics.field931 = class564.method2731(arg1, "titlebutton_large", "");
            Statics.field1495 = class564.method2731(arg1, "play_now_text", "");
            class564.method2731(arg1, "titlebutton_wide42,1", "");
            Statics.field3545 = class564.method8730(arg1, "runes", "");
            Statics.field907 = class564.method8730(arg1, "title_mute", "");
            Statics.field4671 = class564.method2731(arg1, "options_radio_buttons,0", "");
            Statics.field908 = class564.method2731(arg1, "options_radio_buttons,4", "");
            Statics.field4667 = class564.method2731(arg1, "options_radio_buttons,2", "");
            Statics.field903 = class564.method2731(arg1, "options_radio_buttons,6", "");
            Statics.field215 = Statics.field4671.field5476;
            Statics.field2424 = Statics.field4671.field5472;
            Statics.field121 = new class100(Statics.field3545);
            if (arg2) {
                field923 = "";
                field902 = "";
                field926 = new String[8];
                field916 = 0;
            }
            Statics.field4783 = 0;
            Statics.field1592 = "";
            field930 = true;
            field934 = false;
            if (Statics.field1385.method2506()) {
                Statics.method2347(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class345(Statics.field156, "scape main", "", 255, false));
                class333.method996(var5, 0, 0, 0, 100, false);
            }
            class333.method3178();
            client.method9().method6741(false);
            Statics.field933 = true;
            field925 = (Statics.field1345 - 765) / 2;
            field912 = field925 + 202;
            Statics.field2625 = field912 + 180;
            Statics.field3988.method9360(field925, 0);
            Statics.field1373.method9360(field925 + 382, 0);
            Statics.field5467.method9218(field925 + 382 - Statics.field5467.field5476 / 2, 18);
        } else if (arg3 == 4) {
            method8645(4);
        }
    }

    @ObfuscatedName("fn.ay(ZZI)Lvb;")
    public static class562 method2981(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field903 : Statics.field4667) : (arg1 ? Statics.field908 : Statics.field4671);
    }

    @ObfuscatedName("fm.an(I)V")
    public static void method3041() {
        if (field923 != null && field923.length() > 0) {
            return;
        }
        if (Statics.field1385.method2521() == null) {
            client.field560 = false;
        } else {
            field923 = Statics.field1385.method2521();
            client.field560 = true;
        }
    }

    @ObfuscatedName("el.au(B)V")
    public static void method2883() {
        if (!Statics.field933) {
            return;
        }
        Statics.field910 = null;
        Statics.field3233 = null;
        Statics.field3545 = null;
        Statics.field3988 = null;
        Statics.field1373 = null;
        Statics.field5467 = null;
        Statics.field907 = null;
        Statics.field4671 = null;
        Statics.field4667 = null;
        Statics.field1777 = null;
        Statics.field867 = null;
        Statics.field1696 = null;
        Statics.field4640 = null;
        Statics.field1283 = null;
        Statics.field121.method2475();
        Statics.method2347(0, 100);
        client.method9().method6741(true);
        Statics.field933 = false;
    }

    @ObfuscatedName("oy.ax(Lob;IS)V")
    public static void method6574(class389 arg0, int arg1) {
        if ((arg1 & class544.field5358.method33()) != 0) {
            Statics.field5467 = class564.method2731(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class544.field5359.method33()) != 0) {
            Statics.field5467 = class564.method2731(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class544.field5337.method33()) == 0) {
            Statics.field5467 = class564.method2731(arg0, "logo", "");
        } else {
            Statics.field5467 = class564.method2731(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("bh.ao(I)V")
    public static void method448() {
        if (client.field560 && field923 != null && field923.length() > 0) {
            field939 = 1;
        } else {
            field939 = 0;
        }
    }

    @ObfuscatedName("oc.am(Lbx;Lqe;Lqe;I)V")
    public static void method6550(class35 arg0, class433 arg1, class433 arg2) {
        if (field934) {
            method3436(arg0);
            return;
        }
        if ((class36.field211 == 1 || !Statics.field4709 && class36.field211 == 4) && class36.field216 >= field925 + 765 - 50 && class36.field213 >= 453) {
            Statics.field1385.method2505(!Statics.field1385.method2506());
            if (Statics.field1385.method2506()) {
                Statics.method2347(0, 0);
            } else {
                ArrayList var3 = new ArrayList();
                var3.add(new class345(Statics.field156, "scape main", "", 255, false));
                class333.method996(var3, 0, 0, 0, 100, false);
            }
            class333.method3178();
        }
        if (client.field609 == 5) {
            return;
        }
        if (field935 == -1L) {
            field935 = class329.method5009() + 1000L;
        }
        long var4 = class329.method5009();
        boolean var6;
        if (client.field740 == null || client.field799 >= client.field740.size()) {
            var6 = true;
        } else {
            while (true) {
                if (client.field799 >= client.field740.size()) {
                    var6 = true;
                    break;
                }
                class86 var7 = (class86) client.field740.get(client.field799);
                if (!var7.method2293()) {
                    var6 = false;
                    break;
                }
                client.field799++;
            }
        }
        if (var6 && field940 == -1L) {
            field940 = var4;
            if (field940 > field935) {
                field935 = field940;
            }
        }
        if (client.field609 != 10 && client.field609 != 11) {
            return;
        }
        if (Statics.field62 == class404.field4594) {
            if (class36.field211 == 1 || !Statics.field4709 && class36.field211 == 4) {
                int var8 = field925 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class36.field216 >= var8 && class36.field216 <= var8 + var10 && class36.field213 >= var9 && class36.field213 <= var9 + var11) {
                    if (class70.method4329()) {
                        field934 = true;
                        field906 = 0;
                        field937 = 0;
                    }
                    return;
                }
            }
            if (Statics.field294 != null && class70.method4329()) {
                field934 = true;
                field906 = 0;
                field937 = 0;
            }
        }
        int var12 = class36.field211;
        int var13 = class36.field216;
        int var14 = class36.field213;
        if (var12 == 0) {
            var13 = class36.field204;
            var14 = class36.field205;
        }
        if (!Statics.field4709 && var12 == 4) {
            var12 = 1;
        }
        class268 var15 = client.method4380();
        if (field918 == 0) {
            boolean var16 = false;
            while (var15.method4948()) {
                if (var15.field2931 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field2625 - 80;
            short var18 = 291;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var18 - 20 && var14 <= var18 + 20) {
                class32.method4914(client.method5631("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field2625 + 80;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var18 - 20 && var14 <= var18 + 20 || var16) {
                method1137();
            }
        } else if (field918 == 1) {
            while (true) {
                if (!var15.method4948()) {
                    int var20 = Statics.field2625 - 80;
                    short var21 = 321;
                    if (var12 == 1 && var13 >= var20 - 75 && var13 <= var20 + 75 && var14 >= var21 - 20 && var14 <= var21 + 20) {
                        method92(false);
                    }
                    int var22 = Statics.field2625 + 80;
                    if (var12 == 1 && var13 >= var22 - 75 && var13 <= var22 + 75 && var14 >= var21 - 20 && var14 <= var21 + 20) {
                        method8645(0);
                    }
                    break;
                }
                if (var15.field2931 == 84) {
                    method92(false);
                } else if (var15.field2931 == 13) {
                    method8645(0);
                }
            }
        } else if (field918 == 2) {
            short var23 = 201;
            int var130 = var23 + 52;
            if (var12 == 1 && var14 >= var130 - 12 && var14 < var130 + 2) {
                field939 = 0;
            }
            var130 += 15;
            if (var12 == 1 && var14 >= var130 - 12 && var14 < var130 + 2) {
                field939 = 1;
            }
            var130 += 15;
            short var24 = 361;
            if (Statics.field4549 != null) {
                int var25 = Statics.field4549.field4661 / 2;
                if (var12 == 1 && var13 >= Statics.field4549.field4663 - var25 && var13 <= Statics.field4549.field4663 + var25 && var14 >= var24 - 15 && var14 < var24) {
                    switch(field942) {
                        case 1:
                            class32.method4914(class380.field4401, true, false);
                            return;
                        case 2:
                            class32.method4914("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field2625 - 80;
            short var27 = 321;
            if (var12 == 1 && var13 >= var26 - 75 && var13 <= var26 + 75 && var14 >= var27 - 20 && var14 <= var27 + 20) {
                field923 = field923.trim();
                if (field923.length() == 0) {
                    method2997(class380.field4209, class380.field4210, class380.field4347);
                } else if (field902.length() == 0) {
                    method2997(class380.field4212, class380.field4213, class380.field4214);
                } else {
                    method2997(class380.field4318, class380.field4319, class380.field4241);
                    client.field545 = Statics.field1385.method2527(field923) ? class145.field1653 : class145.field1654;
                    client.method2936(20);
                }
                return;
            }
            int var28 = field912 + 180 + 80;
            if (var12 == 1 && var13 >= var28 - 75 && var13 <= var28 + 75 && var14 >= var27 - 20 && var14 <= var27 + 20) {
                method8645(0);
                field923 = "";
                field902 = "";
                Statics.field4783 = 0;
                Statics.field1592 = "";
                field930 = true;
            }
            int var29 = Statics.field2625 + -117;
            short var30 = 277;
            field928 = var13 >= var29 && var13 < Statics.field215 + var29 && var14 >= var30 && var14 < Statics.field2424 + var30;
            if (var12 == 1 && field928) {
                client.field560 = !client.field560;
                if (!client.field560 && Statics.field1385.method2521() != null) {
                    Statics.field1385.method2498((String) null);
                }
            }
            int var31 = Statics.field2625 + 24;
            short var32 = 277;
            field915 = var13 >= var31 && var13 < Statics.field215 + var31 && var14 >= var32 && var14 < Statics.field2424 + var32;
            if (var12 == 1 && field915) {
                Statics.field1385.method2503(!Statics.field1385.method2504());
                if (!Statics.field1385.method2504()) {
                    field923 = "";
                    Statics.field1385.method2498((String) null);
                    method448();
                }
            }
            label1062: while (true) {
                Transferable var38;
                int var39;
                do {
                    while (true) {
                        label1026: do {
                            while (true) {
                                while (var15.method4948()) {
                                    if (var15.field2931 == 13) {
                                        method8645(0);
                                        field923 = "";
                                        field902 = "";
                                        Statics.field4783 = 0;
                                        Statics.field1592 = "";
                                        field930 = true;
                                    } else {
                                        if (field939 != 0) {
                                            continue label1026;
                                        }
                                        char var33 = var15.field2932;
                                        for (int var34 = 0; var34 < field932.length() && var33 != field932.charAt(var34); var34++) {
                                        }
                                        if (var15.field2931 == 85 && field923.length() > 0) {
                                            field923 = field923.substring(0, field923.length() - 1);
                                        }
                                        if (var15.field2931 == 84 || var15.field2931 == 80) {
                                            field939 = 1;
                                        }
                                        char var35 = var15.field2932;
                                        boolean var36 = field932.indexOf(var35) != -1;
                                        if (var36 && field923.length() < 320) {
                                            field923 = field923 + var15.field2932;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field939 != 1);
                        if (var15.field2931 == 85 && field902.length() > 0) {
                            field902 = field902.substring(0, field902.length() - 1);
                        } else if (var15.field2931 == 84 || var15.field2931 == 80) {
                            field939 = 0;
                            if (var15.field2931 == 84) {
                                field923 = field923.trim();
                                if (field923.length() == 0) {
                                    method2997(class380.field4209, class380.field4210, class380.field4347);
                                } else if (field902.length() == 0) {
                                    method2997(class380.field4212, class380.field4213, class380.field4214);
                                } else {
                                    method2997(class380.field4318, class380.field4319, class380.field4241);
                                    client.field545 = Statics.field1385.method2527(field923) ? class145.field1653 : class145.field1654;
                                    client.method2936(20);
                                }
                                return;
                            }
                        }
                        if ((var15.method4940(82) || var15.method4940(87)) && var15.field2931 == 67) {
                            Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var38 = var37.getContents(Statics.field997);
                            var39 = 20 - field902.length();
                            break;
                        }
                        if (Statics.method6769(var15.field2932)) {
                            char var47 = var15.field2932;
                            boolean var48 = field932.indexOf(var47) != -1;
                            if (var48 && field902.length() < 20) {
                                field902 = field902 + var15.field2932;
                            }
                        }
                    }
                } while (var39 <= 0);
                try {
                    String var40 = (String) var38.getTransferData(DataFlavor.stringFlavor);
                    int var41 = Math.min(var39, var40.length());
                    int var42 = 0;
                    while (true) {
                        if (var42 >= var41) {
                            field902 = field902 + var40.substring(0, var41);
                            continue label1062;
                        }
                        if (!Statics.method6769(var40.charAt(var42))) {
                            break;
                        }
                        char var43 = var40.charAt(var42);
                        boolean var44 = field932.indexOf(var43) != -1;
                        if (!var44) {
                            break;
                        }
                        var42++;
                    }
                    method8645(3);
                    return;
                } catch (UnsupportedFlavorException var128) {
                } catch (IOException var129) {
                }
            }
        } else if (field918 == 3) {
            int var49 = field912 + 180;
            short var50 = 241;
            class421 var51 = arg1.method7533(25, class380.field4339.length() - 34, class380.field4339, var49, var50);
            if (var12 == 1 && var51.method7144(var13, var14)) {
                class32.method4914(class380.field4400, true, false);
            }
            int var52 = field912 + 180;
            short var53 = 276;
            if (var12 == 1 && var13 >= var52 - 75 && var13 <= var52 + 75 && var14 >= var53 - 20 && var14 <= var53 + 20) {
                method1307(false);
            }
            int var54 = field912 + 180;
            short var55 = 326;
            if (var12 == 1 && var13 >= var54 - 75 && var13 <= var54 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                class32.method4914(class380.field4401, true, false);
                return;
            }
        } else if (field918 == 4) {
            int var56 = field912 + 180 - 80;
            short var57 = 321;
            if (var12 == 1 && var13 >= var56 - 75 && var13 <= var56 + 75 && var14 >= var57 - 20 && var14 <= var57 + 20) {
                method73();
                return;
            }
            if (var12 == 1 && var13 >= field912 + 180 - 9 && var13 <= field912 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field930 = !field930;
            }
            if (var12 == 1 && var13 >= field912 + 180 - 34 && var13 <= field912 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class32.method4914(class380.field4401, true, false);
            }
            int var58 = field912 + 180 + 80;
            if (var12 == 1 && var13 >= var58 - 75 && var13 <= var58 + 75 && var14 >= var57 - 20 && var14 <= var57 + 20) {
                method8645(0);
                field923 = "";
                field902 = "";
                Statics.field4783 = 0;
                Statics.field1592 = "";
            }
            while (var15.method4948()) {
                boolean var59 = false;
                for (int var60 = 0; var60 < field938.length(); var60++) {
                    if (var15.field2932 == field938.charAt(var60)) {
                        var59 = true;
                        break;
                    }
                }
                if (var15.field2931 == 13) {
                    method8645(0);
                    field923 = "";
                    field902 = "";
                    Statics.field4783 = 0;
                    Statics.field1592 = "";
                } else {
                    if (var15.field2931 == 85 && Statics.field1592.length() > 0) {
                        Statics.field1592 = Statics.field1592.substring(0, Statics.field1592.length() - 1);
                    }
                    if (var15.field2931 == 84) {
                        method73();
                        return;
                    }
                    if (var59 && Statics.field1592.length() < 6) {
                        Statics.field1592 = Statics.field1592 + var15.field2932;
                    }
                }
            }
        } else if (field918 == 5) {
            int var61 = field912 + 180 - 80;
            short var62 = 321;
            if (var12 == 1 && var13 >= var61 - 75 && var13 <= var61 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                method3183();
                return;
            }
            int var63 = field912 + 180 + 80;
            if (var12 == 1 && var13 >= var63 - 75 && var13 <= var63 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                method92(true);
            }
            short var64 = 361;
            if (Statics.field1672 != null) {
                int var65 = Statics.field1672.field4661 / 2;
                if (var12 == 1 && var13 >= Statics.field1672.field4663 - var65 && var13 <= Statics.field1672.field4663 + var65 && var14 >= var64 - 15 && var14 < var64) {
                    class32.method4914(client.method5631("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var15.method4948()) {
                boolean var66 = false;
                for (int var67 = 0; var67 < field932.length(); var67++) {
                    if (var15.field2932 == field932.charAt(var67)) {
                        var66 = true;
                        break;
                    }
                }
                if (var15.field2931 == 13) {
                    method92(true);
                } else {
                    if (var15.field2931 == 85 && field923.length() > 0) {
                        field923 = field923.substring(0, field923.length() - 1);
                    }
                    if (var15.field2931 == 84) {
                        method3183();
                        return;
                    }
                    if (var66 && field923.length() < 320) {
                        field923 = field923 + var15.field2932;
                    }
                }
            }
        } else if (field918 == 6) {
            while (true) {
                do {
                    if (!var15.method4948()) {
                        short var68 = 321;
                        if (var12 == 1 && var14 >= var68 - 20 && var14 <= var68 + 20) {
                            method92(true);
                        }
                        return;
                    }
                } while (var15.field2931 != 84 && var15.field2931 != 13);
                method92(true);
            }
        } else if (field918 == 7) {
            if (Statics.field3119 && !client.field642) {
                int var69 = Statics.field2625 - 150;
                int var70 = var69 + 240 + 25 + 40;
                short var71 = 231;
                int var72 = var71 + 40;
                if (var12 == 1 && var13 >= var69 && var13 <= var70 && var14 >= var71 && var14 <= var72) {
                    int var73 = var69;
                    int var74 = 0;
                    int var75;
                    while (true) {
                        if (var74 >= 8) {
                            var75 = 0;
                            break;
                        }
                        if (var13 <= var73 + 30) {
                            var75 = var74;
                            break;
                        }
                        var73 += 30;
                        var73 += var74 == 1 || var74 == 3 ? 20 : 5;
                        var74++;
                    }
                    field916 = var75;
                }
                int var76 = field912 + 180 - 80;
                short var77 = 321;
                if (var12 == 1 && var13 >= var76 - 75 && var13 <= var76 + 75 && var14 >= var77 - 20 && var14 <= var77 + 20) {
                    boolean var80;
                    label897: {
                        Date var78;
                        try {
                            var78 = method663();
                        } catch (ParseException var127) {
                            method8037("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var80 = false;
                            break label897;
                        }
                        if (var78 == null) {
                            var80 = false;
                        } else {
                            boolean var81 = method2634(var78);
                            boolean var82 = method4277(var78);
                            if (var82) {
                                if (var81) {
                                    Statics.field5019 = (int) (var78.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field5019 = 8388607;
                                }
                                var80 = true;
                            } else {
                                method8037("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var80 = false;
                            }
                        }
                    }
                    if (var80) {
                        client.method2936(50);
                        return;
                    }
                }
                int var84 = field912 + 180 + 80;
                if (var12 == 1 && var13 >= var84 - 75 && var13 <= var84 + 75 && var14 >= var77 - 20 && var14 <= var77 + 20) {
                    field926 = new String[8];
                    method92(true);
                }
                while (var15.method4948()) {
                    if (var15.field2931 == 101) {
                        field926[field916] = null;
                    }
                    if (var15.field2931 == 85) {
                        if (field926[field916] == null && field916 > 0) {
                            field916--;
                        }
                        field926[field916] = null;
                    }
                    if (var15.field2932 >= '0' && var15.field2932 <= '9') {
                        field926[field916] = "" + var15.field2932;
                        if (field916 < 7) {
                            field916++;
                        }
                    }
                    if (var15.field2931 == 84) {
                        boolean var87;
                        label833: {
                            Date var85;
                            try {
                                var85 = method663();
                            } catch (ParseException var126) {
                                method8037("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var87 = false;
                                break label833;
                            }
                            if (var85 == null) {
                                var87 = false;
                            } else {
                                boolean var88 = method2634(var85);
                                boolean var89 = method4277(var85);
                                if (var89) {
                                    if (var88) {
                                        Statics.field5019 = (int) (var85.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field5019 = 8388607;
                                    }
                                    var87 = true;
                                } else {
                                    method8037("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var87 = false;
                                }
                            }
                        }
                        if (var87) {
                            client.method2936(50);
                        }
                        return;
                    }
                }
            } else {
                int var91 = field912 + 180 - 80;
                short var92 = 321;
                if (var12 == 1 && var13 >= var91 - 75 && var13 <= var91 + 75 && var14 >= var92 - 20 && var14 <= var92 + 20) {
                    class32.method4914(client.method5631("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2997(class380.field4349, class380.field4350, class380.field4351);
                    method8645(6);
                    return;
                }
                int var93 = field912 + 180 + 80;
                if (var12 == 1 && var13 >= var93 - 75 && var13 <= var93 + 75 && var14 >= var92 - 20 && var14 <= var92 + 20) {
                    method92(true);
                }
            }
        } else if (field918 == 8) {
            int var94 = field912 + 180 - 80;
            short var95 = 321;
            if (var12 == 1 && var13 >= var94 - 75 && var13 <= var94 + 75 && var14 >= var95 - 20 && var14 <= var95 + 20) {
                class32.method4914("https://www.jagex.com/terms/privacy", true, false);
                method2997(class380.field4349, class380.field4350, class380.field4351);
                method8645(6);
                return;
            }
            int var96 = field912 + 180 + 80;
            if (var12 == 1 && var13 >= var96 - 75 && var13 <= var96 + 75 && var14 >= var95 - 20 && var14 <= var95 + 20) {
                method92(true);
            }
        } else if (field918 == 9) {
            int var97 = field912 + 180;
            short var98 = 311;
            if (var15.field2931 == 84 || var15.field2931 == 13 || var12 == 1 && var13 >= var97 - 75 && var13 <= var97 + 75 && var14 >= var98 - 20 && var14 <= var98 + 20) {
                method1307(false);
            }
        } else if (field918 == 10) {
            int var99 = field912 + 180;
            short var100 = 209;
            if (var15.field2931 == 84 || var12 == 1 && var13 >= var99 - 109 && var13 <= var99 + 109 && var14 >= var100 && var14 <= var100 + 68) {
                method2997(class380.field4318, class380.field4319, class380.field4241);
                client.field546 = class554.field5435;
                client.field545 = Statics.field1385.method2527(field923) ? class145.field1653 : class145.field1654;
                client.method2936(20);
            }
        } else if (field918 == 12) {
            int var101 = Statics.field2625;
            short var102 = 233;
            class421 var103 = arg2.method7533(0, 30, class380.field4127, var101, var102);
            class421 var104 = arg2.method7533(32, 32, class380.field4127, var101, var102);
            class421 var105 = arg2.method7533(70, 34, class380.field4127, var101, var102);
            int var131 = var102 + 17;
            class421 var106 = arg2.method7533(0, 34, class380.field4382, var101, var131);
            if (var12 == 1) {
                if (var103.method7144(var13, var14)) {
                    class32.method4914("https://www.jagex.com/terms", true, false);
                } else if (var104.method7144(var13, var14)) {
                    class32.method4914("https://www.jagex.com/terms/privacy", true, false);
                } else if (var105.method7144(var13, var14) || var106.method7144(var13, var14)) {
                    class32.method4914("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var107 = Statics.field2625 - 80;
            short var108 = 311;
            if (var12 == 1 && var13 >= var107 - 75 && var13 <= var107 + 75 && var14 >= var108 - 20 && var14 <= var108 + 20) {
                client.method293();
                method1307(true);
            }
            int var109 = Statics.field2625 + 80;
            if (var12 == 1 && var13 >= var109 - 75 && var13 <= var109 + 75 && var14 >= var108 - 20 && var14 <= var108 + 20) {
                field918 = 13;
            }
        } else if (field918 == 13) {
            int var110 = Statics.field2625;
            short var111 = 321;
            if (var12 == 1 && var13 >= var110 - 75 && var13 <= var110 + 75 && var14 >= var111 - 20 && var14 <= var111 + 20) {
                method1307(true);
            }
        } else if (field918 == 14) {
            String var112 = "";
            switch(field905) {
                case 0:
                    var112 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var112 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var112 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method92(false);
            }
            int var113 = field912 + 180;
            short var114 = 276;
            if (var12 == 1 && var13 >= var113 - 75 && var13 <= var113 + 75 && var14 >= var114 - 20 && var14 <= var114 + 20) {
                class32.method4914(var112, true, false);
                method2997(class380.field4349, class380.field4350, class380.field4351);
                method8645(6);
                return;
            }
            int var115 = field912 + 180;
            short var116 = 326;
            if (var12 == 1 && var13 >= var115 - 75 && var13 <= var115 + 75 && var14 >= var116 - 20 && var14 <= var116 + 20) {
                method92(false);
            }
        } else if (field918 == 24) {
            int var117 = field912 + 180;
            short var118 = 301;
            if (var12 == 1 && var13 >= var117 - 75 && var13 <= var117 + 75 && var14 >= var118 - 20 && var14 <= var118 + 20) {
                method1307(false);
            }
        } else if (field918 == 32) {
            int var119 = field912 + 180 - 80;
            short var120 = 321;
            if (var12 == 1 && var13 >= var119 - 75 && var13 <= var119 + 75 && var14 >= var120 - 20 && var14 <= var120 + 20) {
                class32.method4914(client.method5631("secure", true) + "m=dob/set_dob.ws", true, false);
                method2997(class380.field4349, class380.field4350, class380.field4351);
                method8645(6);
                return;
            }
            int var121 = field912 + 180 + 80;
            if (var12 == 1 && var13 >= var121 - 75 && var13 <= var121 + 75 && var14 >= var120 - 20 && var14 <= var120 + 20) {
                method92(true);
            }
        } else if (field918 == 33) {
            int var122 = field912 + 180;
            short var123 = 276;
            if (var12 == 1 && var13 >= var122 - 75 && var13 <= var122 + 75 && var14 >= var123 - 20 && var14 <= var123 + 20) {
                class32.method4914(class380.field4400, true, false);
            }
            int var124 = field912 + 180;
            short var125 = 326;
            if (var12 == 1 && var13 >= var124 - 75 && var13 <= var124 + 75 && var14 >= var125 - 20 && var14 <= var125 + 20) {
                method92(true);
            }
        }
    }

    @ObfuscatedName("ad.ac(B)V")
    public static void method73() {
        Statics.field1592.trim();
        if (Statics.field1592.length() != 6) {
            method2997(class380.field4128, class380.field4129, class380.field4117);
            return;
        }
        Statics.field4783 = Integer.parseInt(Statics.field1592);
        Statics.field1592 = "";
        client.field545 = field930 ? class145.field1652 : class145.field1655;
        method2997(class380.field4318, class380.field4319, class380.field4241);
        client.method2936(20);
    }

    @ObfuscatedName("co.ae(B)V")
    public static void method1137() {
        if ((client.field719 & class544.field5354.method33()) != 0) {
            field919 = "";
            field920 = class380.field4314;
            field921 = class380.field4375;
            field922 = class380.field4316;
            method8645(1);
            method448();
        } else if ((client.field719 & class544.field5356.method33()) != 0) {
            if ((client.field719 & class544.field5339.method33()) == 0) {
                field920 = class380.field4370;
                field921 = class380.field4165;
                field922 = class380.field4307;
            } else {
                field920 = class380.field4311;
                field921 = class380.field4312;
                field922 = class380.field4313;
            }
            field919 = class380.field4304;
            method8645(1);
            method448();
        } else if ((client.field719 & class544.field5339.method33()) == 0) {
            method92(false);
        } else {
            field920 = class380.field4308;
            field921 = class380.field4265;
            field922 = class380.field4310;
            field919 = class380.field4304;
            method8645(1);
            method448();
        }
    }

    @ObfuscatedName("it.ad(Ljava/util/Date;I)Z")
    public static boolean method4277(Date arg0) {
        Date var1 = method37();
        return arg0.after(var1);
    }

    @ObfuscatedName("am.aq(B)Ljava/util/Date;")
    public static Date method37() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("dz.al(Ljava/util/Date;B)Z")
    public static boolean method2634(Date arg0) {
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

    @ObfuscatedName("sc.aj(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method8037(String arg0, String arg1, String arg2) {
        method8645(7);
        method2997(arg0, arg1, arg2);
    }

    @ObfuscatedName("bu.as(I)Ljava/util/Date;")
    public static Date method663() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field926;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method8037("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("aq.aw(ZB)V")
    public static void method92(boolean arg0) {
        if (Statics.field997.method1164() || Statics.field997.method1651() || Statics.field997.method1489()) {
            method8645(10);
            return;
        }
        field920 = class380.field4301;
        field921 = class380.field4302;
        field922 = class380.field4303;
        method8645(2);
        if (arg0) {
            field902 = "";
        }
        method3041();
        method448();
    }

    @ObfuscatedName("client.af(ZI)V")
    public static void method1307(boolean arg0) {
        byte var1 = 0;
        if (!client.method2289()) {
            var1 = 12;
        } else if (Statics.field997.method1164() || Statics.field997.method1651() || Statics.field997.method1489()) {
            var1 = 10;
        }
        method8645(var1);
        if (arg0) {
            field923 = "";
            field902 = "";
            Statics.field4783 = 0;
            Statics.field1592 = "";
        }
        method3041();
        method448();
    }

    @ObfuscatedName("fa.aa(I)V")
    public static void method3183() {
        field923 = field923.trim();
        if (field923.length() == 0) {
            method2997(class380.field4257, class380.field4353, class380.field4354);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method5631("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class549 var4 = new class549(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field5381, var4.field5378, 1000 - var4.field5378);
                if (var5 == -1) {
                    var4.field5378 = 0;
                    long var8 = var4.method8804();
                    var6 = var8;
                    break;
                }
                var4.field5378 += var5;
                if (var4.field5378 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var37) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field923;
            Random var15 = new Random();
            class549 var16 = new class549(128);
            class549 var17 = new class549(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method8781(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method9045(var15.nextInt());
            }
            var16.method9045(var18[0]);
            var16.method9045(var18[1]);
            var16.method8786(var6);
            var16.method8786(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method9045(var15.nextInt());
            }
            var16.method8970(class75.field883, class75.field884);
            var17.method8781(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method9045(var15.nextInt());
            }
            var17.method8786(var15.nextLong());
            var17.method8785(var15.nextLong());
            client.method398(var17);
            var17.method8786(var15.nextLong());
            var17.method8970(class75.field883, class75.field884);
            int var22 = class549.method8571(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class549 var23 = new class549(var22);
            var23.method8869(var14);
            var23.field5378 = var22;
            var23.method8820(var18);
            class549 var24 = new class549(var23.field5378 + var17.field5378 + var16.field5378 + 5);
            var24.method8781(2);
            var24.method8781(var16.field5378);
            var24.method8790(var16.field5381, 0, var16.field5378);
            var24.method8781(var17.field5378);
            var24.method8790(var17.field5381, 0, var17.field5378);
            var24.method8782(var23.field5378);
            var24.method8790(var23.field5381, 0, var23.field5378);
            String var25 = class416.method6803(var24.field5381);
            byte var32;
            try {
                URL var26 = new URL(client.method5631("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class574.method8140(var25) + "&dest=" + class574.method8140("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class549 var30 = new class549(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field5381, var30.field5378, 1000 - var30.field5378);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field5381);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method8821(var18);
                            while (var30.field5378 > 0 && var30.field5381[var30.field5378 - 1] == 0) {
                                var30.field5378--;
                            }
                            String var34 = new String(var30.field5381, 0, var30.field5378);
                            if (class75.method6559(var34)) {
                                class32.method4914(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field5378 += var31;
                    if (var30.field5378 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var36) {
                var36.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method2997(class380.field4123, class380.field4356, class380.field4378);
                method8645(6);
                break;
            case 3:
                method2997(class380.field4243, class380.field4359, class380.field4360);
                break;
            case 4:
                method2997(class380.field4361, class380.field4205, class380.field4357);
                break;
            case 5:
                method2997(class380.field4364, class380.field4365, class380.field4115);
                break;
            case 6:
                method2997(class380.field4367, class380.field4368, class380.field4369);
                break;
            case 7:
                method2997(class380.field4095, class380.field4146, class380.field4372);
        }
    }

    @ObfuscatedName("ai.ah(Lqe;Lqe;Lqe;B)V")
    public static void method285(class433 arg0, class433 arg1, class433 arg2) {
        field925 = (Statics.field1345 - 765) / 2;
        field912 = field925 + 202;
        Statics.field2625 = field912 + 180;
        if (field934) {
            if (Statics.field1777 == null) {
                Statics.field1777 = class564.method4569(Statics.field408, "sl_back", "");
            }
            if (Statics.field867 == null) {
                Statics.field867 = class564.method8730(Statics.field408, "sl_flags", "");
            }
            if (Statics.field1696 == null) {
                Statics.field1696 = class564.method8730(Statics.field408, "sl_arrows", "");
            }
            if (Statics.field4640 == null) {
                Statics.field4640 = class564.method8730(Statics.field408, "sl_stars", "");
            }
            if (Statics.field2562 == null) {
                Statics.field2562 = class564.method2731(Statics.field408, "leftarrow", "");
            }
            if (Statics.field2904 == null) {
                Statics.field2904 = class564.method2731(Statics.field408, "rightarrow", "");
            }
            class559.method9145(field925, 23, 765, 480, 0);
            class559.method9124(field925, 0, 125, 23, 12425273, 9135624);
            class559.method9124(field925 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method7592(class380.field4381, field925 + 62, 15, 0, -1);
            if (Statics.field4640 != null) {
                Statics.field4640[1].method9218(field925 + 140, 1);
                arg1.method7565(class380.field4352, field925 + 152, 10, 16777215, -1);
                Statics.field4640[0].method9218(field925 + 140, 12);
                arg1.method7565(class380.field4390, field925 + 152, 21, 16777215, -1);
            }
            if (Statics.field1696 != null) {
                int var3 = field925 + 280;
                if (class70.field810[0] == 0 && class70.field809[0] == 0) {
                    Statics.field1696[2].method9218(var3, 4);
                } else {
                    Statics.field1696[0].method9218(var3, 4);
                }
                if (class70.field810[0] == 0 && class70.field809[0] == 1) {
                    Statics.field1696[3].method9218(var3 + 15, 4);
                } else {
                    Statics.field1696[1].method9218(var3 + 15, 4);
                }
                arg0.method7565(class380.field4196, var3 + 32, 17, 16777215, -1);
                int var4 = field925 + 390;
                if (class70.field810[0] == 1 && class70.field809[0] == 0) {
                    Statics.field1696[2].method9218(var4, 4);
                } else {
                    Statics.field1696[0].method9218(var4, 4);
                }
                if (class70.field810[0] == 1 && class70.field809[0] == 1) {
                    Statics.field1696[3].method9218(var4 + 15, 4);
                } else {
                    Statics.field1696[1].method9218(var4 + 15, 4);
                }
                arg0.method7565(class380.field4261, var4 + 32, 17, 16777215, -1);
                int var5 = field925 + 500;
                if (class70.field810[0] == 2 && class70.field809[0] == 0) {
                    Statics.field1696[2].method9218(var5, 4);
                } else {
                    Statics.field1696[0].method9218(var5, 4);
                }
                if (class70.field810[0] == 2 && class70.field809[0] == 1) {
                    Statics.field1696[3].method9218(var5 + 15, 4);
                } else {
                    Statics.field1696[1].method9218(var5 + 15, 4);
                }
                arg0.method7565(class380.field4393, var5 + 32, 17, 16777215, -1);
                int var6 = field925 + 610;
                if (class70.field810[0] == 3 && class70.field809[0] == 0) {
                    Statics.field1696[2].method9218(var6, 4);
                } else {
                    Statics.field1696[0].method9218(var6, 4);
                }
                if (class70.field810[0] == 3 && class70.field809[0] == 1) {
                    Statics.field1696[3].method9218(var6 + 15, 4);
                } else {
                    Statics.field1696[1].method9218(var6 + 15, 4);
                }
                arg0.method7565(class380.field4249, var6 + 32, 17, 16777215, -1);
            }
            class559.method9145(field925 + 708, 4, 50, 16, 0);
            arg1.method7592(class380.field4334, field925 + 708 + 25, 16, 16777215, -1);
            field917 = -1;
            if (Statics.field1777 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class70.field818) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class70.field818) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class70.field818) {
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
                int var17 = (class70.field818 + var10 - 1) / var10;
                field937 = var17 - var9;
                if (Statics.field2562 != null && field906 > 0) {
                    Statics.field2562.method9218(8, Statics.field467 / 2 - Statics.field2562.field5472 / 2);
                }
                if (Statics.field2904 != null && field906 < field937) {
                    Statics.field2904.method9218(Statics.field1345 - Statics.field2904.field5476 - 8, Statics.field467 / 2 - Statics.field2904.field5472 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field925 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field906;
                for (int var23 = var10 * var22; var23 < class70.field818 && var22 - field906 < var9; var23++) {
                    class70 var24 = Statics.field3255[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field812);
                    if (var24.field812 == -1) {
                        var26 = class380.field4395;
                        var25 = false;
                    } else if (var24.field812 > 1980) {
                        var26 = class380.field4396;
                        var25 = false;
                    }
                    class112 var27 = null;
                    int var28 = 0;
                    if (var24.method1803()) {
                        var27 = var24.method1797() ? class112.field1413 : class112.field1419;
                    } else if (var24.method1798()) {
                        var27 = var24.method1797() ? class112.field1421 : class112.field1427;
                    } else if (var24.method1834()) {
                        var28 = 16711680;
                        var27 = var24.method1797() ? class112.field1418 : class112.field1417;
                    } else if (var24.method1804()) {
                        var27 = var24.method1797() ? class112.field1430 : class112.field1426;
                    } else if (var24.method1800()) {
                        var27 = var24.method1797() ? class112.field1416 : class112.field1429;
                    } else if (var24.method1832()) {
                        var27 = var24.method1797() ? class112.field1415 : class112.field1423;
                    } else if (var24.method1828()) {
                        var27 = var24.method1797() ? class112.field1422 : class112.field1425;
                    }
                    if (var27 == null || var27.field1424 >= Statics.field1777.length) {
                        var27 = var24.method1797() ? class112.field1414 : class112.field1428;
                    }
                    if (class36.field204 >= var19 && class36.field205 >= var18 && class36.field204 < var7 + var19 && class36.field205 < var8 + var18 && var25) {
                        field917 = var23;
                        Statics.field1777[var27.field1424].method9261(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1777[var27.field1424].method9360(var19, var18);
                    }
                    if (Statics.field867 != null) {
                        Statics.field867[(var24.method1797() ? 8 : 0) + var24.field816].method9218(var19 + 29, var18);
                    }
                    arg0.method7592(Integer.toString(var24.field817), var19 + 15, var8 / 2 + var18 + 5, var28, -1);
                    arg1.method7592(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
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
                    int var29 = arg1.method7586(Statics.field3255[field917].field805) + 6;
                    int var30 = arg1.field4756 + 8;
                    int var31 = class36.field205 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class36.field205 - 25 - var30;
                    }
                    class559.method9145(class36.field204 - var29 / 2, var31, var29, var30, 16777120);
                    class559.method9127(class36.field204 - var29 / 2, var31, var29, var30, 0);
                    arg1.method7592(Statics.field3255[field917].field805, class36.field204, arg1.field4756 + var31 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field3988.method9360(field925, 0);
        Statics.field1373.method9360(field925 + 382, 0);
        Statics.field5467.method9218(field925 + 382 - Statics.field5467.field5476 / 2, 18);
        if (client.field609 == 0 || client.field609 == 5) {
            byte var32 = 20;
            arg0.method7592(class380.field4300, field912 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class559.method9127(field912 + 180 - 152, var33, 304, 34, 9179409);
            class559.method9127(field912 + 180 - 151, var33 + 1, 302, 32, 0);
            class559.method9145(field912 + 180 - 150, var33 + 2, field913 * 3, 30, 9179409);
            class559.method9145(field913 * 3 + (field912 + 180 - 150), var33 + 2, 300 - field913 * 3, 30, 0);
            arg0.method7592(field914, field912 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field609 == 20) {
            Statics.field910.method9218(field912 + 180 - Statics.field910.field5476 / 2, 271 - Statics.field910.field5472 / 2);
            short var34 = 201;
            arg0.method7592(field920, field912 + 180, var34, 16776960, 0);
            int var139 = var34 + 15;
            arg0.method7592(field921, field912 + 180, var139, 16776960, 0);
            int var140 = var139 + 15;
            arg0.method7592(field922, field912 + 180, var140, 16776960, 0);
            int var141 = var140 + 15;
            int var142 = var141 + 7;
            if (field918 != 4 && field918 != 10) {
                arg0.method7565(class380.field4342, field912 + 180 - 110, var142, 16777215, 0);
                short var35 = 200;
                String var36 = Statics.field1385.method2504() ? class417.method4916(field923) : field923;
                String var37;
                for (var37 = var36; arg0.method7586(var37) > var35; var37 = var37.substring(0, var37.length() - 1)) {
                }
                arg0.method7565(class437.method7594(var37), field912 + 180 - 70, var142, 16777215, 0);
                var139 = var142 + 15;
                String var38;
                for (var38 = class417.method4916(field902); arg0.method7586(var38) > var35; var38 = var38.substring(1)) {
                }
                arg0.method7565(class380.field4283 + var38, field912 + 180 - 108, var139, 16777215, 0);
                var139 += 15;
            }
        }
        if (client.field609 == 10 || client.field609 == 11 || client.field609 == 50) {
            Statics.field910.method9218(field912, 171);
            if (field918 == 0) {
                short var39 = 251;
                arg0.method7592(class380.field4269, field912 + 180, var39, 16776960, 0);
                int var143 = var39 + 30;
                int var40 = field912 + 180 - 80;
                short var41 = 291;
                Statics.field3233.method9218(var40 - 73, var41 - 20);
                arg0.method7538(class380.field4331, var40 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var42 = field912 + 180 + 80;
                Statics.field3233.method9218(var42 - 73, var41 - 20);
                arg0.method7538(class380.field4332, var42 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field918 == 1) {
                arg0.method7592(field919, field912 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method7592(field920, field912 + 180, var43, 16777215, 0);
                int var144 = var43 + 15;
                arg0.method7592(field921, field912 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                arg0.method7592(field922, field912 + 180, var145, 16777215, 0);
                int var146 = var145 + 15;
                int var44 = field912 + 180 - 80;
                short var45 = 321;
                Statics.field3233.method9218(var44 - 73, var45 - 20);
                arg0.method7592(class380.field4348, var44, var45 + 5, 16777215, 0);
                int var46 = field912 + 180 + 80;
                Statics.field3233.method9218(var46 - 73, var45 - 20);
                arg0.method7592(class380.field4334, var46, var45 + 5, 16777215, 0);
            } else if (field918 == 2) {
                short var47 = 201;
                arg0.method7592(field920, Statics.field2625, var47, 16776960, 0);
                int var147 = var47 + 15;
                arg0.method7592(field921, Statics.field2625, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg0.method7592(field922, Statics.field2625, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var150 = var149 + 7;
                arg0.method7565(class380.field4342, Statics.field2625 - 110, var150, 16777215, 0);
                short var48 = 200;
                String var49 = Statics.field1385.method2504() ? class417.method4916(field923) : field923;
                String var50;
                for (var50 = var49; arg0.method7586(var50) > var48; var50 = var50.substring(1)) {
                }
                arg0.method7565(class437.method7594(var50) + (field939 == 0 & client.field519 % 40 < 20 ? class105.method7315(16776960) + class105.field1349 : ""), Statics.field2625 - 70, var150, 16777215, 0);
                var147 = var150 + 15;
                String var51;
                for (var51 = class417.method4916(field902); arg0.method7586(var51) > var48; var51 = var51.substring(1)) {
                }
                arg0.method7565(class380.field4283 + var51 + (field939 == 1 & client.field519 % 40 < 20 ? class105.method7315(16776960) + class105.field1349 : ""), Statics.field2625 - 108, var147, 16777215, 0);
                var147 += 15;
                short var52 = 277;
                int var53 = Statics.field2625 + -117;
                class562 var54 = method2981(client.field560, field928);
                var54.method9218(var53, var52);
                int var55 = var54.field5476 + 5 + var53;
                arg1.method7565(class380.field4335, var55, var52 + 13, 16776960, 0);
                int var56 = Statics.field2625 + 24;
                class562 var57 = method2981(Statics.field1385.method2504(), field915);
                var57.method9218(var56, var52);
                int var58 = var57.field5476 + 5 + var56;
                arg1.method7565(class380.field4336, var58, var52 + 13, 16776960, 0);
                int var151 = var52 + 15;
                int var59 = Statics.field2625 - 80;
                short var60 = 321;
                Statics.field3233.method9218(var59 - 73, var60 - 20);
                arg0.method7592(class380.field4156, var59, var60 + 5, 16777215, 0);
                int var61 = Statics.field2625 + 80;
                Statics.field3233.method9218(var61 - 73, var60 - 20);
                arg0.method7592(class380.field4334, var61, var60 + 5, 16777215, 0);
                short var62 = 357;
                switch(field942) {
                    case 2:
                        Statics.field1420 = class380.field4256;
                        break;
                    default:
                        Statics.field1420 = class380.field4346;
                }
                Statics.field4549 = new class421(Statics.field2625, var62, arg1.method7586(Statics.field1420), 11);
                Statics.field1672 = new class421(Statics.field2625, var62, arg1.method7586(class380.field4178), 11);
                arg1.method7592(Statics.field1420, Statics.field2625, var62, 16777215, 0);
            } else if (field918 == 3) {
                short var63 = 201;
                arg0.method7592(class380.field4337, field912 + 180, var63, 16776960, 0);
                int var152 = var63 + 20;
                arg1.method7592(class380.field4338, field912 + 180, var152, 16776960, 0);
                int var153 = var152 + 20;
                arg1.method7592(class380.field4339, field912 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                int var64 = field912 + 180;
                short var65 = 276;
                Statics.field3233.method9218(var64 - 73, var65 - 20);
                arg2.method7592(class380.field4340, var64, var65 + 5, 16777215, 0);
                int var66 = field912 + 180;
                short var67 = 326;
                Statics.field3233.method9218(var66 - 73, var67 - 20);
                arg2.method7592(class380.field4130, var66, var67 + 5, 16777215, 0);
            } else if (field918 == 4) {
                arg0.method7592(class380.field4317, field912 + 180, 201, 16776960, 0);
                short var68 = 236;
                arg0.method7592(field920, field912 + 180, var68, 16777215, 0);
                int var155 = var68 + 15;
                arg0.method7592(field921, field912 + 180, var155, 16777215, 0);
                int var156 = var155 + 15;
                arg0.method7592(field922, field912 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                arg0.method7565(class380.field4329 + class417.method4916(Statics.field1592) + (client.field519 % 40 < 20 ? class105.method7315(16776960) + class105.field1349 : ""), field912 + 180 - 108, var157, 16777215, 0);
                int var158 = var157 - 8;
                arg0.method7565(class380.field4098, field912 + 180 - 9, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg0.method7565(class380.field4099, field912 + 180 - 9, var159, 16776960, 0);
                int var69 = field912 + 180 - 9 + arg0.method7586(class380.field4099) + 15;
                int var70 = var159 - arg0.field4756;
                class562 var71;
                if (field930) {
                    var71 = Statics.field4667;
                } else {
                    var71 = Statics.field4671;
                }
                var71.method9218(var69, var70);
                var155 = var159 + 15;
                int var72 = field912 + 180 - 80;
                short var73 = 321;
                Statics.field3233.method9218(var72 - 73, var73 - 20);
                arg0.method7592(class380.field4348, var72, var73 + 5, 16777215, 0);
                int var74 = field912 + 180 + 80;
                Statics.field3233.method9218(var74 - 73, var73 - 20);
                arg0.method7592(class380.field4334, var74, var73 + 5, 16777215, 0);
                arg1.method7592(class380.field4346, field912 + 180, var73 + 36, 16777215, 0);
            } else if (field918 == 5) {
                arg0.method7592(class380.field4397, field912 + 180, 201, 16776960, 0);
                short var75 = 221;
                arg2.method7592(field920, field912 + 180, var75, 16776960, 0);
                int var160 = var75 + 15;
                arg2.method7592(field921, field912 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg2.method7592(field922, field912 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                int var163 = var162 + 14;
                arg0.method7565(class380.field4343, field912 + 180 - 145, var163, 16777215, 0);
                short var76 = 174;
                String var77 = Statics.field1385.method2504() ? class417.method4916(field923) : field923;
                String var78;
                for (var78 = var77; arg0.method7586(var78) > var76; var78 = var78.substring(1)) {
                }
                arg0.method7565(class437.method7594(var78) + (client.field519 % 40 < 20 ? class105.method7315(16776960) + class105.field1349 : ""), field912 + 180 - 34, var163, 16777215, 0);
                var160 = var163 + 15;
                int var79 = field912 + 180 - 80;
                short var80 = 321;
                Statics.field3233.method9218(var79 - 73, var80 - 20);
                arg0.method7592(class380.field4299, var79, var80 + 5, 16777215, 0);
                int var81 = field912 + 180 + 80;
                Statics.field3233.method9218(var81 - 73, var80 - 20);
                arg0.method7592(class380.field4109, var81, var80 + 5, 16777215, 0);
                short var82 = 356;
                arg1.method7592(class380.field4178, Statics.field2625, var82, 268435455, 0);
            } else if (field918 == 6) {
                short var83 = 201;
                arg0.method7592(field920, field912 + 180, var83, 16776960, 0);
                int var164 = var83 + 15;
                arg0.method7592(field921, field912 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                arg0.method7592(field922, field912 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var84 = field912 + 180;
                short var85 = 321;
                Statics.field3233.method9218(var84 - 73, var85 - 20);
                arg0.method7592(class380.field4109, var84, var85 + 5, 16777215, 0);
            } else if (field918 == 7) {
                if (Statics.field3119 && !client.field642) {
                    short var86 = 201;
                    arg0.method7592(field920, Statics.field2625, var86, 16776960, 0);
                    int var167 = var86 + 15;
                    arg0.method7592(field921, Statics.field2625, var167, 16776960, 0);
                    int var168 = var167 + 15;
                    arg0.method7592(field922, Statics.field2625, var168, 16776960, 0);
                    int var87 = Statics.field2625 - 150;
                    int var169 = var168 + 10;
                    for (int var88 = 0; var88 < 8; var88++) {
                        Statics.field3233.method9220(var87, var169, 30, 40);
                        boolean var89 = field916 == var88 & client.field519 % 40 < 20;
                        arg0.method7565((field926[var88] == null ? "" : field926[var88]) + (var89 ? class105.method7315(16776960) + class105.field1349 : ""), var87 + 10, var169 + 27, 16777215, 0);
                        if (var88 == 1 || var88 == 3) {
                            var87 += 50;
                            arg0.method7565(class437.method7594("/"), var87 - 13, var169 + 27, 16777215, 0);
                        } else {
                            var87 += 35;
                        }
                    }
                    int var90 = Statics.field2625 - 80;
                    short var91 = 321;
                    Statics.field3233.method9218(var90 - 73, var91 - 20);
                    arg0.method7592("Submit", var90, var91 + 5, 16777215, 0);
                    int var92 = Statics.field2625 + 80;
                    Statics.field3233.method9218(var92 - 73, var91 - 20);
                    arg0.method7592(class380.field4334, var92, var91 + 5, 16777215, 0);
                } else {
                    short var93 = 216;
                    arg0.method7592(class380.field4373, field912 + 180, var93, 16776960, 0);
                    int var170 = var93 + 15;
                    arg2.method7592(class380.field4374, field912 + 180, var170, 16776960, 0);
                    int var171 = var170 + 15;
                    arg2.method7592(class380.field4175, field912 + 180, var171, 16776960, 0);
                    int var172 = var171 + 15;
                    int var94 = field912 + 180 - 80;
                    short var95 = 321;
                    Statics.field3233.method9218(var94 - 73, var95 - 20);
                    arg0.method7592(class380.field4358, var94, var95 + 5, 16777215, 0);
                    int var96 = field912 + 180 + 80;
                    Statics.field3233.method9218(var96 - 73, var95 - 20);
                    arg0.method7592(class380.field4109, var96, var95 + 5, 16777215, 0);
                }
            } else if (field918 == 8) {
                short var97 = 216;
                arg0.method7592(class380.field4230, field912 + 180, var97, 16776960, 0);
                int var173 = var97 + 15;
                arg2.method7592(class380.field4363, field912 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                arg2.method7592(class380.field4232, field912 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                int var98 = field912 + 180 - 80;
                short var99 = 321;
                Statics.field3233.method9218(var98 - 73, var99 - 20);
                arg0.method7592(class380.field4237, var98, var99 + 5, 16777215, 0);
                int var100 = field912 + 180 + 80;
                Statics.field3233.method9218(var100 - 73, var99 - 20);
                arg0.method7592(class380.field4109, var100, var99 + 5, 16777215, 0);
            } else if (field918 == 9) {
                short var101 = 221;
                arg0.method7592(field920, field912 + 180, var101, 16776960, 0);
                int var176 = var101 + 25;
                arg0.method7592(field921, field912 + 180, var176, 16776960, 0);
                int var177 = var176 + 25;
                arg0.method7592(field922, field912 + 180, var177, 16776960, 0);
                int var102 = field912 + 180;
                short var103 = 311;
                Statics.field3233.method9218(var102 - 73, var103 - 20);
                arg0.method7592(class380.field4340, var102, var103 + 5, 16777215, 0);
            } else if (field918 == 10) {
                int var104 = field912 + 180;
                short var105 = 209;
                arg0.method7592(class380.field4269, field912 + 180, var105, 16776960, 0);
                int var178 = var105 + 20;
                Statics.field931.method9218(var104 - 109, var178);
                if (field927.isEmpty()) {
                    Statics.field1495.method9218(var104 - 48, var178 + 18);
                } else {
                    Statics.field1495.method9218(var104 - 48, var178 + 5);
                    arg0.method7592(field927, var104, var178 + 68 - 15, 16776960, 0);
                }
            } else if (field918 == 12) {
                int var106 = Statics.field2625;
                short var107 = 216;
                arg2.method7592(class380.field4380, var106, var107, 16777215, 0);
                int var179 = var107 + 17;
                arg2.method7592(class380.field4127, var106, var179, 16777215, 0);
                int var180 = var179 + 17;
                arg2.method7592(class380.field4382, var106, var180, 16777215, 0);
                int var181 = var180 + 17;
                arg2.method7592(class380.field4383, var106, var181, 16777215, 0);
                int var108 = Statics.field2625 - 80;
                short var109 = 311;
                Statics.field3233.method9218(var108 - 73, var109 - 20);
                arg0.method7592(class380.field4154, var108, var109 + 5, 16777215, 0);
                int var110 = Statics.field2625 + 80;
                Statics.field3233.method9218(var110 - 73, var109 - 20);
                arg0.method7592(class380.field4387, var110, var109 + 5, 16777215, 0);
            } else if (field918 == 13) {
                short var111 = 231;
                arg2.method7592(class380.field4384, field912 + 180, var111, 16777215, 0);
                int var182 = var111 + 20;
                arg2.method7592(class380.field4385, field912 + 180, var182, 16777215, 0);
                int var112 = field912 + 180;
                short var113 = 311;
                Statics.field3233.method9218(var112 - 73, var113 - 20);
                arg0.method7592(class380.field4109, var112, var113 + 5, 16777215, 0);
            } else if (field918 == 14) {
                short var114 = 201;
                String var115 = "";
                String var116 = "";
                String var117 = "";
                switch(field905) {
                    case 0:
                        var115 = class380.field4394;
                        var116 = class380.field4144;
                        var117 = class380.field4145;
                        break;
                    case 1:
                        var115 = class380.field4216;
                        var116 = class380.field4183;
                        var117 = class380.field4333;
                        break;
                    case 2:
                        var115 = class380.field4218;
                        var116 = class380.field4219;
                        var117 = class380.field4220;
                        break;
                    default:
                        method92(false);
                }
                arg0.method7592(var115, field912 + 180, var114, 16776960, 0);
                int var183 = var114 + 20;
                arg0.method7592(var116, field912 + 180, var183, 16776960, 0);
                int var184 = var183 + 20;
                arg0.method7592(var117, field912 + 180, var184, 16776960, 0);
                int var118 = field912 + 180;
                short var119 = 276;
                Statics.field3233.method9218(var118 - 73, var119 - 20);
                if (field905 == 1) {
                    arg0.method7592(class380.field4179, var118, var119 + 5, 16777215, 0);
                } else {
                    arg0.method7592(class380.field4126, var118, var119 + 5, 16777215, 0);
                }
                int var120 = field912 + 180;
                short var121 = 326;
                Statics.field3233.method9218(var120 - 73, var121 - 20);
                arg0.method7592(class380.field4109, var120, var121 + 5, 16777215, 0);
            } else if (field918 == 24) {
                short var122 = 221;
                arg0.method7592(field920, field912 + 180, var122, 16777215, 0);
                int var185 = var122 + 15;
                arg0.method7592(field921, field912 + 180, var185, 16777215, 0);
                int var186 = var185 + 15;
                arg0.method7592(field922, field912 + 180, var186, 16777215, 0);
                int var187 = var186 + 15;
                int var123 = field912 + 180;
                short var124 = 301;
                Statics.field3233.method9218(var123 - 73, var124 - 20);
                arg0.method7592(class380.field4093, var123, var124 + 5, 16777215, 0);
            } else if (field918 == 32) {
                short var125 = 216;
                arg0.method7592(class380.field4373, field912 + 180, var125, 16776960, 0);
                int var188 = var125 + 15;
                arg2.method7592(class380.field4374, field912 + 180, var188, 16776960, 0);
                int var189 = var188 + 15;
                arg2.method7592(class380.field4175, field912 + 180, var189, 16776960, 0);
                int var190 = var189 + 15;
                int var126 = field912 + 180 - 80;
                short var127 = 321;
                Statics.field3233.method9218(var126 - 73, var127 - 20);
                arg0.method7592(class380.field4358, var126, var127 + 5, 16777215, 0);
                int var128 = field912 + 180 + 80;
                Statics.field3233.method9218(var128 - 73, var127 - 20);
                arg0.method7592(class380.field4109, var128, var127 + 5, 16777215, 0);
            } else if (field918 == 33) {
                short var129 = 201;
                arg0.method7592(field920, field912 + 180, var129, 16776960, 0);
                int var191 = var129 + 20;
                arg1.method7592(field921, field912 + 180, var191, 16776960, 0);
                int var192 = var191 + 20;
                arg1.method7592(field922, field912 + 180, var192, 16776960, 0);
                int var193 = var192 + 15;
                int var130 = field912 + 180;
                short var131 = 276;
                Statics.field3233.method9218(var130 - 73, var131 - 20);
                arg2.method7592(class380.field4280, var130, var131 + 5, 16777215, 0);
                int var132 = field912 + 180;
                short var133 = 326;
                Statics.field3233.method9218(var132 - 73, var133 - 20);
                arg2.method7592(class380.field4109, var132, var133 + 5, 16777215, 0);
            }
        }
        if (client.field609 >= 10) {
            int[] var134 = new int[4];
            class559.method9143(var134);
            class559.method9119(field925, 0, field925 + 765, Statics.field467);
            Statics.field121.method2476(field925 - 22, client.field519);
            Statics.field121.method2476(field925 + 765 + 22 - 128, client.field519);
            class559.method9178(var134);
        }
        Statics.field907[Statics.field1385.method2506() ? 1 : 0].method9218(field925 + 765 - 40, 463);
        if (client.field609 <= 5 || Statics.field62 != class404.field4594) {
            return;
        }
        if (Statics.field1283 == null) {
            Statics.field1283 = class564.method2731(Statics.field408, "sl_button", "");
            return;
        }
        int var135 = field925 + 5;
        short var136 = 463;
        byte var137 = 100;
        byte var138 = 35;
        Statics.field1283.method9218(var135, var136);
        arg0.method7592(class380.field4270 + " " + client.field798, var137 / 2 + var135, var138 / 2 + var136 - 2, 16777215, 0);
        if (Statics.field294 == null) {
            arg1.method7592(class380.field4398, var137 / 2 + var135, var138 / 2 + var136 + 12, 16777215, 0);
        } else {
            arg1.method7592(class380.field4202, var137 / 2 + var135, var138 / 2 + var136 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("fn.ag(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2997(String arg0, String arg1, String arg2) {
        field920 = arg0;
        field921 = arg1;
        field922 = arg2;
    }

    @ObfuscatedName("go.av(Lbx;B)V")
    public static void method3436(class35 arg0) {
        class268 var1 = client.method4380();
        while (var1.method4948()) {
            if (var1.field2931 == 13) {
                method6635();
                return;
            }
            if (var1.field2931 == 96) {
                if (field906 > 0 && Statics.field2562 != null) {
                    field906--;
                }
            } else if (var1.field2931 == 97 && field906 < field937 && Statics.field2904 != null) {
                field906++;
            }
        }
        if (class36.field211 != 1 && Statics.field4709 || class36.field211 != 4) {
            return;
        }
        int var2 = field925 + 280;
        if (class36.field216 >= var2 && class36.field216 <= var2 + 14 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(0, 0);
            return;
        }
        if (class36.field216 >= var2 + 15 && class36.field216 <= var2 + 80 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(0, 1);
            return;
        }
        int var3 = field925 + 390;
        if (class36.field216 >= var3 && class36.field216 <= var3 + 14 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(1, 0);
            return;
        }
        if (class36.field216 >= var3 + 15 && class36.field216 <= var3 + 80 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(1, 1);
            return;
        }
        int var4 = field925 + 500;
        if (class36.field216 >= var4 && class36.field216 <= var4 + 14 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(2, 0);
            return;
        }
        if (class36.field216 >= var4 + 15 && class36.field216 <= var4 + 80 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(2, 1);
            return;
        }
        int var5 = field925 + 610;
        if (class36.field216 >= var5 && class36.field216 <= var5 + 14 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(3, 0);
            return;
        }
        if (class36.field216 >= var5 + 15 && class36.field216 <= var5 + 80 && class36.field213 >= 4 && class36.field213 <= 18) {
            class70.method5466(3, 1);
            return;
        }
        if (class36.field216 >= field925 + 708 && class36.field213 >= 4 && class36.field216 <= field925 + 708 + 50 && class36.field213 <= 20) {
            method6635();
            return;
        }
        if (field917 != -1) {
            class70 var6 = Statics.field3255[field917];
            boolean var7 = class545.method7767(client.field719, class544.field5345);
            boolean var8 = var6.method1798();
            Statics.field4408 = var8;
            var6.field811 = var8 ? "beta" : var6.field811;
            method3042(var6);
            method6635();
            if (var7 != var8) {
                client.method5036();
            }
            return;
        }
        if (field906 > 0 && Statics.field2562 != null && class36.field216 >= 0 && class36.field216 <= Statics.field2562.field5476 && class36.field213 >= Statics.field467 / 2 - 50 && class36.field213 <= Statics.field467 / 2 + 50) {
            field906--;
        }
        if (field906 < field937 && Statics.field2904 != null && class36.field216 >= Statics.field1345 - Statics.field2904.field5476 - 5 && class36.field216 <= Statics.field1345 && class36.field213 >= Statics.field467 / 2 - 50 && class36.field213 <= Statics.field467 / 2 + 50) {
            field906++;
        }
    }

    @ObfuscatedName("fk.ar(Lcf;I)V")
    public static void method3042(class70 arg0) {
        if (arg0.method1797() != client.field601) {
            client.field601 = arg0.method1797();
            class262.method2730(arg0.method1797());
        }
        if (client.field719 != arg0.field813) {
            class386 var1 = Statics.field408;
            int var2 = arg0.field813;
            if ((var2 & class544.field5358.method33()) != 0) {
                Statics.field5467 = class564.method2731(var1, "logo_deadman_mode", "");
            } else if ((var2 & class544.field5359.method33()) != 0) {
                Statics.field5467 = class564.method2731(var1, "logo_seasonal_mode", "");
            } else if ((var2 & class544.field5337.method33()) == 0) {
                Statics.field5467 = class564.method2731(var1, "logo", "");
            } else {
                Statics.field5467 = class564.method2731(var1, "logo_speedrunning", "");
            }
        }
        Statics.field5054 = arg0.field814;
        client.field798 = arg0.field817;
        client.field719 = arg0.field813;
        Statics.field2949 = arg0.field811;
        Statics.field300 = client.field505 == 0 ? 43594 : arg0.field817 + 40000;
        Statics.field2679 = client.field505 == 0 ? 443 : arg0.field817 + 50000;
        Statics.field2457 = Statics.field300;
    }

    @ObfuscatedName("ds.ap(II)V")
    public static void method2340(int arg0) {
        method8645(14);
        field905 = arg0;
    }

    @ObfuscatedName("on.ak(I)V")
    public static void method6635() {
        field934 = false;
        Statics.field3988.method9360(field925, 0);
        Statics.field1373.method9360(field925 + 382, 0);
        Statics.field5467.method9218(field925 + 382 - Statics.field5467.field5476 / 2, 18);
    }

    @ObfuscatedName("uy.ai(I)V")
    public static void method8665() {
        method8645(24);
        method2997(class380.field4321, class380.field4322, class380.field4323);
    }

    @ObfuscatedName("ut.at(IB)V")
    public static void method8645(int arg0) {
        if (field918 != arg0) {
            field918 = arg0;
        }
    }

    @ObfuscatedName("jo.az(I)I")
    public static int method4632() {
        return field918;
    }

    @ObfuscatedName("ij.bg(Ljava/lang/String;I)V")
    public static void method4375(String arg0) {
        String var1;
        if (arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#') {
            var1 = "";
        } else {
            var1 = arg0;
        }
        field927 = var1;
    }

    @ObfuscatedName("mc.bz(ILjava/lang/String;I)V")
    public static void method5603(int arg0, String arg1) {
        field914 = arg1;
        field913 = arg0;
    }
}
