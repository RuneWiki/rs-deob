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

@ObfuscatedName("bw")
public class class73 {

    @ObfuscatedName("bw.c")
    public static int field898 = 0;

    @ObfuscatedName("bw.i")
    public static int field907 = field898 + 202;

    @ObfuscatedName("bw.g")
    public static int field902 = 10;

    @ObfuscatedName("bw.k")
    public static String field903 = "";

    @ObfuscatedName("bw.ai")
    public static int field908 = -1;

    @ObfuscatedName("bw.at")
    public static int field926 = 1;

    @ObfuscatedName("bw.aa")
    public static int field899 = 0;

    @ObfuscatedName("bw.bx")
    public static String field928 = "";

    @ObfuscatedName("bw.bh")
    public static String field904 = "";

    @ObfuscatedName("bw.bm")
    public static String field910 = "";

    @ObfuscatedName("bw.bp")
    public static String field911 = "";

    @ObfuscatedName("bw.bl")
    public static String field913 = "";

    @ObfuscatedName("bw.bo")
    public static String field930 = "";

    @ObfuscatedName("bw.bd")
    public static int field914 = 0;

    @ObfuscatedName("bw.bq")
    public static String[] field915 = new String[8];

    @ObfuscatedName("bw.bj")
    public static boolean field917 = false;

    @ObfuscatedName("bw.bw")
    public static boolean field918 = false;

    @ObfuscatedName("bw.bz")
    public static boolean field901 = true;

    @ObfuscatedName("bw.bi")
    public static int field920 = 0;

    @ObfuscatedName("bw.bs")
    public static String field921 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bw.cd")
    public static String field922 = "1234567890";

    @ObfuscatedName("bw.cs")
    public static boolean field923 = false;

    @ObfuscatedName("bw.co")
    public static int field906 = -1;

    @ObfuscatedName("bw.cw")
    public static int field925 = 0;

    @ObfuscatedName("bw.cl")
    public static int field896 = 0;

    @ObfuscatedName("bw.ch")
    public static long field927;

    @ObfuscatedName("bw.ce")
    public static long field919;

    @ObfuscatedName("bw.cm")
    public static String[] field929;

    @ObfuscatedName("bw.cc")
    public static String[] field912;

    static {
        new DecimalFormat("##0.00");
        new class128();
        field927 = -1L;
        field919 = -1L;
        field929 = new String[] { "title.jpg" };
        field912 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "logo_speedrunning", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("on.a(Llg;Llg;ZII)V")
    public static void method6826(class330 arg0, class330 arg1, boolean arg2, int arg3) {
        if (!Statics.field897) {
            if (arg3 == 0) {
                method5889(arg2);
            } else {
                method1112(arg3);
            }
            class473.method8018();
            byte[] var4 = arg0.method5835("title.jpg", "");
            Statics.field3712 = class32.method389(var4);
            Statics.field1260 = Statics.field3712.method8121();
            int var5 = client.field491;
            if ((var5 & 0x20000000) != 0) {
                Statics.field1056 = class478.method6750(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) != 0) {
                Statics.field1056 = class478.method6750(arg1, "logo_seasonal_mode", "");
            } else if ((var5 & 0x100) == 0) {
                Statics.field1056 = class478.method6750(arg1, "logo", "");
            } else {
                Statics.field1056 = class478.method6750(arg1, "logo_speedrunning", "");
            }
            Statics.field4300 = class478.method6750(arg1, "titlebox", "");
            Statics.field1648 = class478.method6750(arg1, "titlebutton", "");
            Statics.field4315 = class478.method6750(arg1, "titlebutton_large", "");
            Statics.field1610 = class478.method6750(arg1, "play_now_text", "");
            class478.method6750(arg1, "titlebutton_wide42,1", "");
            Statics.field2846 = class478.method7099(arg1, "runes", "");
            Statics.field89 = class478.method7099(arg1, "title_mute", "");
            Statics.field909 = class478.method6750(arg1, "options_radio_buttons,0", "");
            Statics.field1060 = class478.method6750(arg1, "options_radio_buttons,4", "");
            Statics.field1932 = class478.method6750(arg1, "options_radio_buttons,2", "");
            Statics.field4231 = class478.method6750(arg1, "options_radio_buttons,6", "");
            Statics.field4272 = Statics.field909.field4951;
            Statics.field916 = Statics.field909.field4953;
            Statics.field869 = new class93(Statics.field2846);
            if (arg2) {
                field913 = "";
                field930 = "";
                field915 = new String[8];
                field914 = 0;
            }
            Statics.field4309 = 0;
            Statics.field4293 = "";
            field901 = true;
            field923 = false;
            if (Statics.field4526.method2284()) {
                class284.field3294 = 1;
                Statics.field124 = null;
                Statics.field3295 = -1;
                Statics.field3296 = -1;
                Statics.field1364 = 0;
                Statics.field4191 = false;
                Statics.field110 = 2;
            } else {
                class284.method3313(2, Statics.field272, "scape main", "", 255, false);
            }
            class331.method692(false);
            Statics.field897 = true;
            field898 = (Statics.field223 - 765) / 2;
            field907 = field898 + 202;
            Statics.field129 = field907 + 180;
            Statics.field3712.method8131(field898, 0);
            Statics.field1260.method8131(field898 + 382, 0);
            Statics.field1056.method8102(field898 + 382 - Statics.field1056.field4951 / 2, 18);
        } else if (arg3 == 4) {
            method1112(4);
        }
    }

    @ObfuscatedName("ab.f(I)V")
    public static void method805() {
        if (field913 != null && field913.length() > 0) {
            return;
        }
        if (Statics.field4526.method2298() == null) {
            client.field749 = false;
        } else {
            field913 = Statics.field4526.method2298();
            client.field749 = true;
        }
    }

    @ObfuscatedName("lu.c(I)V")
    public static void method5711() {
        if (!Statics.field897) {
            return;
        }
        Statics.field4300 = null;
        Statics.field1648 = null;
        Statics.field2846 = null;
        Statics.field3712 = null;
        Statics.field1260 = null;
        Statics.field1056 = null;
        Statics.field89 = null;
        Statics.field909 = null;
        Statics.field1932 = null;
        Statics.field3653 = null;
        Statics.field2274 = null;
        Statics.field1063 = null;
        Statics.field2023 = null;
        Statics.field2823 = null;
        Statics.field869.method2245();
        class284.field3294 = 1;
        Statics.field124 = null;
        Statics.field3295 = -1;
        Statics.field3296 = -1;
        Statics.field1364 = 0;
        Statics.field4191 = false;
        Statics.field110 = 2;
        class331.method692(true);
        Statics.field897 = false;
    }

    @ObfuscatedName("js.x(I)V")
    public static void method4933() {
        if (client.field749 && field913 != null && field913.length() > 0) {
            field920 = 1;
        } else {
            field920 = 0;
        }
    }

    @ObfuscatedName("pz.h(Lae;Lnl;I)V")
    public static void method7427(class36 arg0, class365 arg1) {
        if (field923) {
            class200 var2 = client.field734;
            class200 var3 = var2;
            while (true) {
                if (!var3.method3642()) {
                    if (class37.field234 != 1 && (Statics.field1024 || class37.field234 != 4)) {
                        break;
                    }
                    int var4 = field898 + 280;
                    if (class37.field240 >= var4 && class37.field240 <= var4 + 14 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(0, 0);
                        break;
                    }
                    if (class37.field240 >= var4 + 15 && class37.field240 <= var4 + 80 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(0, 1);
                        break;
                    }
                    int var5 = field898 + 390;
                    if (class37.field240 >= var5 && class37.field240 <= var5 + 14 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(1, 0);
                        break;
                    }
                    if (class37.field240 >= var5 + 15 && class37.field240 <= var5 + 80 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(1, 1);
                        break;
                    }
                    int var6 = field898 + 500;
                    if (class37.field240 >= var6 && class37.field240 <= var6 + 14 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(2, 0);
                        break;
                    }
                    if (class37.field240 >= var6 + 15 && class37.field240 <= var6 + 80 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(2, 1);
                        break;
                    }
                    int var7 = field898 + 610;
                    if (class37.field240 >= var7 && class37.field240 <= var7 + 14 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(3, 0);
                        break;
                    }
                    if (class37.field240 >= var7 + 15 && class37.field240 <= var7 + 80 && class37.field250 >= 4 && class37.field250 <= 18) {
                        class65.method4888(3, 1);
                        break;
                    }
                    if (class37.field240 >= field898 + 708 && class37.field250 >= 4 && class37.field240 <= field898 + 708 + 50 && class37.field250 <= 20) {
                        method284();
                        break;
                    }
                    if (field906 == -1) {
                        if (field925 > 0 && Statics.field2743 != null && class37.field240 >= 0 && class37.field240 <= Statics.field2743.field4951 && class37.field250 >= Statics.field59 / 2 - 50 && class37.field250 <= Statics.field59 / 2 + 50) {
                            field925--;
                        }
                        if (field925 < field896 && Statics.field119 != null && class37.field240 >= Statics.field223 - Statics.field119.field4951 - 5 && class37.field240 <= Statics.field223 && class37.field250 >= Statics.field59 / 2 - 50 && class37.field250 <= Statics.field59 / 2 + 50) {
                            field925++;
                        }
                    } else {
                        class65 var8 = Statics.field4595[field906];
                        method1316(var8);
                        method284();
                    }
                    break;
                }
                if (var3.field2253 == 13) {
                    method284();
                    break;
                }
                if (var3.field2253 == 96) {
                    if (field925 > 0 && Statics.field2743 != null) {
                        field925--;
                    }
                } else if (var3.field2253 == 97 && field925 < field896 && Statics.field119 != null) {
                    field925++;
                }
            }
            return;
        }
        if ((class37.field234 == 1 || !Statics.field1024 && class37.field234 == 4) && class37.field240 >= field898 + 765 - 50 && class37.field250 >= 453) {
            Statics.field4526.method2283(!Statics.field4526.method2284());
            if (Statics.field4526.method2284()) {
                Statics.field3293.method5029();
                class284.field3294 = 1;
                Statics.field124 = null;
            } else {
                class328 var9 = Statics.field272;
                int var10 = var9.method5813("scape main");
                int var11 = var9.method5854(var10, "");
                class284.method261(var9, var10, var11, 255, false);
            }
        }
        if (client.field624 == 5) {
            return;
        }
        if (field927 == -1L) {
            field927 = class280.method2629() + 1000L;
        }
        long var12 = class280.method2629();
        boolean var14;
        if (client.field788 == null || client.field768 >= client.field788.size()) {
            var14 = true;
        } else {
            while (true) {
                if (client.field768 >= client.field788.size()) {
                    var14 = true;
                    break;
                }
                class81 var15 = (class81) client.field788.get(client.field768);
                if (!var15.method2115()) {
                    var14 = false;
                    break;
                }
                client.field768++;
            }
        }
        if (var14 && field919 == -1L) {
            field919 = var12;
            if (field919 > field927) {
                field927 = field919;
            }
        }
        if (client.field624 != 10 && client.field624 != 11) {
            return;
        }
        if (Statics.field1347 == class345.field4253) {
            if (class37.field234 == 1 || !Statics.field1024 && class37.field234 == 4) {
                int var16 = field898 + 5;
                short var17 = 463;
                byte var18 = 100;
                byte var19 = 35;
                if (class37.field240 >= var16 && class37.field240 <= var16 + var18 && class37.field250 >= var17 && class37.field250 <= var17 + var19) {
                    if (class65.method5927()) {
                        field923 = true;
                        field925 = 0;
                        field896 = 0;
                    }
                    return;
                }
            }
            if (Statics.field1275 != null && class65.method5927()) {
                field923 = true;
                field925 = 0;
                field896 = 0;
            }
        }
        int var20 = class37.field234;
        int var21 = class37.field240;
        int var22 = class37.field250;
        if (var20 == 0) {
            var21 = class37.field241;
            var22 = class37.field242;
        }
        if (!Statics.field1024 && var20 == 4) {
            var20 = 1;
        }
        class200 var23 = client.field734;
        class200 var24 = var23;
        if (field899 == 0) {
            boolean var25 = false;
            while (var24.method3642()) {
                if (var24.field2253 == 84) {
                    var25 = true;
                }
            }
            int var26 = Statics.field129 - 80;
            short var27 = 291;
            if (var20 == 1 && var21 >= var26 - 75 && var21 <= var26 + 75 && var22 >= var27 - 20 && var22 <= var27 + 20) {
                class33.method2572(client.method2840("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var28 = Statics.field129 + 80;
            if (var20 == 1 && var21 >= var28 - 75 && var21 <= var28 + 75 && var22 >= var27 - 20 && var22 <= var27 + 20 || var25) {
                if ((client.field491 & 0x2000000) != 0) {
                    field928 = "";
                    field904 = class323.field4003;
                    field910 = class323.field4004;
                    field911 = class323.field4005;
                    method1112(1);
                    method4933();
                } else if ((client.field491 & 0x4) != 0) {
                    if ((client.field491 & 0x400) == 0) {
                        field904 = class323.field3914;
                        field910 = class323.field3995;
                        field911 = class323.field3996;
                    } else {
                        field904 = class323.field4000;
                        field910 = class323.field4078;
                        field911 = class323.field3908;
                    }
                    field928 = class323.field3993;
                    method1112(1);
                    method4933();
                } else if ((client.field491 & 0x400) == 0) {
                    method6689(false);
                } else {
                    field904 = class323.field3982;
                    field910 = class323.field3797;
                    field911 = class323.field3999;
                    field928 = class323.field3993;
                    method1112(1);
                    method4933();
                }
            }
        } else if (field899 == 1) {
            while (true) {
                if (!var24.method3642()) {
                    int var29 = Statics.field129 - 80;
                    short var30 = 321;
                    if (var20 == 1 && var21 >= var29 - 75 && var21 <= var29 + 75 && var22 >= var30 - 20 && var22 <= var30 + 20) {
                        method6689(false);
                    }
                    int var31 = Statics.field129 + 80;
                    if (var20 == 1 && var21 >= var31 - 75 && var21 <= var31 + 75 && var22 >= var30 - 20 && var22 <= var30 + 20) {
                        method1112(0);
                    }
                    break;
                }
                if (var24.field2253 == 84) {
                    method6689(false);
                } else if (var24.field2253 == 13) {
                    method1112(0);
                }
            }
        } else if (field899 == 2) {
            short var32 = 201;
            int var109 = var32 + 52;
            if (var20 == 1 && var22 >= var109 - 12 && var22 < var109 + 2) {
                field920 = 0;
            }
            var109 += 15;
            if (var20 == 1 && var22 >= var109 - 12 && var22 < var109 + 2) {
                field920 = 1;
            }
            var109 += 15;
            short var33 = 361;
            if (Statics.field4856 != null) {
                int var34 = Statics.field4856.field4549 / 2;
                if (var20 == 1 && var21 >= Statics.field4856.field4547 - var34 && var21 <= Statics.field4856.field4547 + var34 && var22 >= var33 - 15 && var22 < var33) {
                    switch(field926) {
                        case 1:
                            method4925(class323.field4042, class323.field3885, class323.field4044);
                            method1112(5);
                            return;
                        case 2:
                            class33.method2572("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var35 = Statics.field129 - 80;
            short var36 = 321;
            if (var20 == 1 && var21 >= var35 - 75 && var21 <= var35 + 75 && var22 >= var36 - 20 && var22 <= var36 + 20) {
                field913 = field913.trim();
                if (field913.length() == 0) {
                    method4925(class323.field3848, class323.field3840, class323.field3856);
                    return;
                }
                if (field930.length() == 0) {
                    method4925(class323.field3889, class323.field3890, class323.field3863);
                    return;
                }
                method4925(class323.field3949, class323.field4009, class323.field4010);
                client.method848(false);
                client.method300(20);
                return;
            }
            int var37 = field907 + 180 + 80;
            if (var20 == 1 && var21 >= var37 - 75 && var21 <= var37 + 75 && var22 >= var36 - 20 && var22 <= var36 + 20) {
                method1112(0);
                field913 = "";
                field930 = "";
                Statics.field4309 = 0;
                Statics.field4293 = "";
                field901 = true;
            }
            int var38 = Statics.field129 + -117;
            short var39 = 277;
            field917 = var21 >= var38 && var21 < Statics.field4272 + var38 && var22 >= var39 && var22 < Statics.field916 + var39;
            if (var20 == 1 && field917) {
                client.field749 = !client.field749;
                if (!client.field749 && Statics.field4526.method2298() != null) {
                    Statics.field4526.method2286((String) null);
                }
            }
            int var40 = Statics.field129 + 24;
            short var41 = 277;
            field918 = var21 >= var40 && var21 < Statics.field4272 + var40 && var22 >= var41 && var22 < Statics.field916 + var41;
            if (var20 == 1 && field918) {
                Statics.field4526.method2331(!Statics.field4526.method2282());
                if (!Statics.field4526.method2282()) {
                    field913 = "";
                    Statics.field4526.method2286((String) null);
                    method4933();
                }
            }
            while (true) {
                Transferable var43;
                int var44;
                do {
                    while (true) {
                        label1058: do {
                            while (true) {
                                while (var24.method3642()) {
                                    if (var24.field2253 == 13) {
                                        method1112(0);
                                        field913 = "";
                                        field930 = "";
                                        Statics.field4309 = 0;
                                        Statics.field4293 = "";
                                        field901 = true;
                                    } else {
                                        if (field920 != 0) {
                                            continue label1058;
                                        }
                                        method3109(var24.field2257);
                                        if (var24.field2253 == 85 && field913.length() > 0) {
                                            field913 = field913.substring(0, field913.length() - 1);
                                        }
                                        if (var24.field2253 == 84 || var24.field2253 == 80) {
                                            field920 = 1;
                                        }
                                        if (method3657(var24.field2257) && field913.length() < 320) {
                                            field913 = field913 + var24.field2257;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field920 != 1);
                        if (var24.field2253 == 85 && field930.length() > 0) {
                            field930 = field930.substring(0, field930.length() - 1);
                        } else if (var24.field2253 == 84 || var24.field2253 == 80) {
                            field920 = 0;
                            if (var24.field2253 == 84) {
                                field913 = field913.trim();
                                if (field913.length() == 0) {
                                    method4925(class323.field3848, class323.field3840, class323.field3856);
                                    return;
                                }
                                if (field930.length() == 0) {
                                    method4925(class323.field3889, class323.field3890, class323.field3863);
                                    return;
                                }
                                method4925(class323.field3949, class323.field4009, class323.field4010);
                                client.method848(false);
                                client.method300(20);
                                return;
                            }
                        }
                        if ((var24.method3626(82) || var24.method3626(87)) && var24.field2253 == 67) {
                            Clipboard var42 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var43 = var42.getContents(Statics.field1599);
                            var44 = 20 - field930.length();
                            break;
                        }
                        if (class356.method4926(var24.field2257) && method3657(var24.field2257) && field930.length() < 20) {
                            field930 = field930 + var24.field2257;
                        }
                    }
                } while (var44 <= 0);
                try {
                    String var45 = (String) var43.getTransferData(DataFlavor.stringFlavor);
                    int var46 = Math.min(var44, var45.length());
                    for (int var47 = 0; var47 < var46; var47++) {
                        if (!class356.method4926(var45.charAt(var47)) || !method3657(var45.charAt(var47))) {
                            method1112(3);
                            return;
                        }
                    }
                    field930 = field930 + var45.substring(0, var46);
                } catch (UnsupportedFlavorException var107) {
                } catch (IOException var108) {
                }
            }
        } else if (field899 == 3) {
            int var50 = field907 + 180;
            short var51 = 276;
            if (var20 == 1 && var21 >= var50 - 75 && var21 <= var50 + 75 && var22 >= var51 - 20 && var22 <= var51 + 20) {
                method5889(false);
            }
            int var52 = field907 + 180;
            short var53 = 326;
            if (var20 == 1 && var21 >= var52 - 75 && var21 <= var52 + 75 && var22 >= var53 - 20 && var22 <= var53 + 20) {
                method4925(class323.field4042, class323.field3885, class323.field4044);
                method1112(5);
                return;
            }
        } else if (field899 == 4) {
            int var54 = field907 + 180 - 80;
            short var55 = 321;
            if (var20 == 1 && var21 >= var54 - 75 && var21 <= var54 + 75 && var22 >= var55 - 20 && var22 <= var55 + 20) {
                Statics.field4293.trim();
                if (Statics.field4293.length() != 6) {
                    method4925(class323.field3862, class323.field3806, class323.field3814);
                    return;
                }
                Statics.field4309 = Integer.parseInt(Statics.field4293);
                Statics.field4293 = "";
                client.method848(true);
                method4925(class323.field3949, class323.field4009, class323.field4010);
                client.method300(20);
                return;
            }
            if (var20 == 1 && var21 >= field907 + 180 - 9 && var21 <= field907 + 180 + 130 && var22 >= 263 && var22 <= 296) {
                field901 = !field901;
            }
            if (var20 == 1 && var21 >= field907 + 180 - 34 && var21 <= field907 + 180 + 34 && var22 >= 351 && var22 <= 363) {
                class33.method2572(client.method2840("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var56 = field907 + 180 + 80;
            if (var20 == 1 && var21 >= var56 - 75 && var21 <= var56 + 75 && var22 >= var55 - 20 && var22 <= var55 + 20) {
                method1112(0);
                field913 = "";
                field930 = "";
                Statics.field4309 = 0;
                Statics.field4293 = "";
            }
            while (var24.method3642()) {
                boolean var57 = false;
                for (int var58 = 0; var58 < field922.length(); var58++) {
                    if (var24.field2257 == field922.charAt(var58)) {
                        var57 = true;
                        break;
                    }
                }
                if (var24.field2253 == 13) {
                    method1112(0);
                    field913 = "";
                    field930 = "";
                    Statics.field4309 = 0;
                    Statics.field4293 = "";
                } else {
                    if (var24.field2253 == 85 && Statics.field4293.length() > 0) {
                        Statics.field4293 = Statics.field4293.substring(0, Statics.field4293.length() - 1);
                    }
                    if (var24.field2253 == 84) {
                        Statics.field4293.trim();
                        if (Statics.field4293.length() != 6) {
                            method4925(class323.field3862, class323.field3806, class323.field3814);
                            return;
                        }
                        Statics.field4309 = Integer.parseInt(Statics.field4293);
                        Statics.field4293 = "";
                        client.method848(true);
                        method4925(class323.field3949, class323.field4009, class323.field4010);
                        client.method300(20);
                        return;
                    }
                    if (var57 && Statics.field4293.length() < 6) {
                        Statics.field4293 = Statics.field4293 + var24.field2257;
                    }
                }
            }
        } else if (field899 == 5) {
            int var59 = field907 + 180 - 80;
            short var60 = 321;
            if (var20 == 1 && var21 >= var59 - 75 && var21 <= var59 + 75 && var22 >= var60 - 20 && var22 <= var60 + 20) {
                method6260();
                return;
            }
            int var61 = field907 + 180 + 80;
            if (var20 == 1 && var21 >= var61 - 75 && var21 <= var61 + 75 && var22 >= var60 - 20 && var22 <= var60 + 20) {
                method6689(true);
            }
            short var62 = 361;
            if (Statics.field2926 != null) {
                int var63 = Statics.field2926.field4549 / 2;
                if (var20 == 1 && var21 >= Statics.field2926.field4547 - var63 && var21 <= Statics.field2926.field4547 + var63 && var22 >= var62 - 15 && var22 < var62) {
                    class33.method2572(client.method2840("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var24.method3642()) {
                boolean var64 = false;
                for (int var65 = 0; var65 < field921.length(); var65++) {
                    if (var24.field2257 == field921.charAt(var65)) {
                        var64 = true;
                        break;
                    }
                }
                if (var24.field2253 == 13) {
                    method6689(true);
                } else {
                    if (var24.field2253 == 85 && field913.length() > 0) {
                        field913 = field913.substring(0, field913.length() - 1);
                    }
                    if (var24.field2253 == 84) {
                        method6260();
                        return;
                    }
                    if (var64 && field913.length() < 320) {
                        field913 = field913 + var24.field2257;
                    }
                }
            }
        } else if (field899 == 6) {
            while (true) {
                do {
                    if (!var24.method3642()) {
                        short var66 = 321;
                        if (var20 == 1 && var22 >= var66 - 20 && var22 <= var66 + 20) {
                            method6689(true);
                        }
                        return;
                    }
                } while (var24.field2253 != 84 && var24.field2253 != 13);
                method6689(true);
            }
        } else if (field899 == 7) {
            if (Statics.field1021 && !client.field498) {
                int var67 = Statics.field129 - 150;
                int var68 = var67 + 240 + 25 + 40;
                short var69 = 231;
                int var70 = var69 + 40;
                if (var20 == 1 && var21 >= var67 && var21 <= var68 && var22 >= var69 && var22 <= var70) {
                    field914 = method2114(var67, var21);
                }
                int var71 = field907 + 180 - 80;
                short var72 = 321;
                if (var20 == 1 && var21 >= var71 - 75 && var21 <= var71 + 75 && var22 >= var72 - 20 && var22 <= var72 + 20) {
                    boolean var73 = method3312();
                    if (var73) {
                        client.method300(50);
                        return;
                    }
                }
                int var74 = field907 + 180 + 80;
                if (var20 == 1 && var21 >= var74 - 75 && var21 <= var74 + 75 && var22 >= var72 - 20 && var22 <= var72 + 20) {
                    field915 = new String[8];
                    method6689(true);
                }
                while (var24.method3642()) {
                    if (var24.field2253 == 101) {
                        field915[field914] = null;
                    }
                    if (var24.field2253 == 85) {
                        if (field915[field914] == null && field914 > 0) {
                            field914--;
                        }
                        field915[field914] = null;
                    }
                    if (var24.field2257 >= '0' && var24.field2257 <= '9') {
                        field915[field914] = "" + var24.field2257;
                        if (field914 < 7) {
                            field914++;
                        }
                    }
                    if (var24.field2253 == 84) {
                        boolean var75 = method3312();
                        if (var75) {
                            client.method300(50);
                        }
                        return;
                    }
                }
            } else {
                int var76 = field907 + 180 - 80;
                short var77 = 321;
                if (var20 == 1 && var21 >= var76 - 75 && var21 <= var76 + 75 && var22 >= var77 - 20 && var22 <= var77 + 20) {
                    class33.method2572(client.method2840("secure", true) + "m=dob/set_dob.ws", true, false);
                    method4925(class323.field4028, class323.field4040, class323.field4041);
                    method1112(6);
                    return;
                }
                int var78 = field907 + 180 + 80;
                if (var20 == 1 && var21 >= var78 - 75 && var21 <= var78 + 75 && var22 >= var77 - 20 && var22 <= var77 + 20) {
                    method6689(true);
                }
            }
        } else if (field899 == 8) {
            int var79 = field907 + 180 - 80;
            short var80 = 321;
            if (var20 == 1 && var21 >= var79 - 75 && var21 <= var79 + 75 && var22 >= var80 - 20 && var22 <= var80 + 20) {
                class33.method2572("https://www.jagex.com/terms/privacy", true, false);
                method4925(class323.field4028, class323.field4040, class323.field4041);
                method1112(6);
                return;
            }
            int var81 = field907 + 180 + 80;
            if (var20 == 1 && var21 >= var81 - 75 && var21 <= var81 + 75 && var22 >= var80 - 20 && var22 <= var80 + 20) {
                method6689(true);
            }
        } else if (field899 == 9) {
            int var82 = field907 + 180;
            short var83 = 311;
            if (var23.field2253 == 84 || var23.field2253 == 13 || var20 == 1 && var21 >= var82 - 75 && var21 <= var82 + 75 && var22 >= var83 - 20 && var22 <= var83 + 20) {
                method5889(false);
            }
        } else if (field899 == 10) {
            int var84 = field907 + 180;
            short var85 = 209;
            if (var23.field2253 == 84 || var20 == 1 && var21 >= var84 - 109 && var21 <= var84 + 109 && var22 >= var85 && var22 <= var85 + 68) {
                method4925(class323.field3949, class323.field4009, class323.field4010);
                client.field616 = class468.field4920;
                client.method848(false);
                client.method300(20);
            }
        } else if (field899 == 12) {
            int var86 = Statics.field129;
            short var87 = 233;
            class404 var88 = arg1.method6419(0, 30, class323.field4071, var86, var87);
            class404 var89 = arg1.method6419(32, 32, class323.field4071, var86, var87);
            class404 var90 = arg1.method6419(70, 34, class323.field4071, var86, var87);
            int var110 = var87 + 17;
            class404 var91 = arg1.method6419(0, 34, class323.field4072, var86, var110);
            if (var20 == 1) {
                if (var88.method6934(var21, var22)) {
                    class33.method2572("https://www.jagex.com/terms", true, false);
                } else if (var89.method6934(var21, var22)) {
                    class33.method2572("https://www.jagex.com/terms/privacy", true, false);
                } else if (var90.method6934(var21, var22) || var91.method6934(var21, var22)) {
                    class33.method2572("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var92 = Statics.field129 - 80;
            short var93 = 311;
            if (var20 == 1 && var21 >= var92 - 75 && var21 <= var92 + 75 && var22 >= var93 - 20 && var22 <= var93 + 20) {
                client.method1643();
                method5889(true);
            }
            int var94 = Statics.field129 + 80;
            if (var20 == 1 && var21 >= var94 - 75 && var21 <= var94 + 75 && var22 >= var93 - 20 && var22 <= var93 + 20) {
                field899 = 13;
            }
        } else if (field899 == 13) {
            int var95 = Statics.field129;
            short var96 = 321;
            if (var20 == 1 && var21 >= var95 - 75 && var21 <= var95 + 75 && var22 >= var96 - 20 && var22 <= var96 + 20) {
                method5889(true);
            }
        } else if (field899 == 14) {
            String var97 = "";
            switch(field908) {
                case 0:
                    var97 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var97 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                case 2:
                    var97 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method6689(false);
            }
            int var98 = field907 + 180;
            short var99 = 276;
            if (var20 == 1 && var21 >= var98 - 75 && var21 <= var98 + 75 && var22 >= var99 - 20 && var22 <= var99 + 20) {
                class33.method2572(var97, true, false);
                method4925(class323.field4028, class323.field4040, class323.field4041);
                method1112(6);
                return;
            }
            int var100 = field907 + 180;
            short var101 = 326;
            if (var20 == 1 && var21 >= var100 - 75 && var21 <= var100 + 75 && var22 >= var101 - 20 && var22 <= var101 + 20) {
                method6689(false);
            }
        } else if (field899 == 24) {
            int var102 = field907 + 180;
            short var103 = 301;
            if (var20 == 1 && var21 >= var102 - 75 && var21 <= var102 + 75 && var22 >= var103 - 20 && var22 <= var103 + 20) {
                method5889(false);
            }
        } else if (field899 == 26) {
            int var104 = field907 + 180 - 80;
            short var105 = 321;
            if (var20 == 1 && var21 >= var104 - 75 && var21 <= var104 + 75 && var22 >= var105 - 20 && var22 <= var105 + 20) {
                class33.method2572(client.method2840("secure", true) + "m=dob/set_dob.ws", true, false);
                method4925(class323.field4028, class323.field4040, class323.field4041);
                method1112(6);
                return;
            }
            int var106 = field907 + 180 + 80;
            if (var20 == 1 && var21 >= var106 - 75 && var21 <= var106 + 75 && var22 >= var105 - 20 && var22 <= var105 + 20) {
                method6689(true);
            }
        }
    }

    @ObfuscatedName("gc.j(I)Z")
    public static boolean method3312() {
        Date var0;
        try {
            var0 = method3688();
        } catch (ParseException var9) {
            method1112(7);
            method4925("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        Calendar var2 = Calendar.getInstance();
        var2.set(1, var2.get(1) - 13);
        var2.set(5, var2.get(5) + 1);
        var2.set(11, 0);
        var2.set(12, 0);
        var2.set(13, 0);
        var2.set(14, 0);
        Date var3 = var2.getTime();
        boolean var4 = var0.before(var3);
        Date var6 = method2835();
        boolean var7 = var0.after(var6);
        if (!var7) {
            method1112(7);
            method4925("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var4) {
            Statics.field1924 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field1924 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("en.y(I)Ljava/util/Date;")
    public static Date method2835() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("q.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method286(String arg0, String arg1, String arg2) {
        method1112(7);
        method4925(arg0, arg1, arg2);
    }

    @ObfuscatedName("gr.n(I)Ljava/util/Date;")
    public static Date method3688() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field915;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method286("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("cg.r(III)I")
    public static int method2114(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("fv.l(CI)Z")
    public static boolean method3109(char arg0) {
        for (int var1 = 0; var1 < field921.length(); var1++) {
            if (arg0 == field921.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gw.s(CB)Z")
    public static boolean method3657(char arg0) {
        return field921.indexOf(arg0) != -1;
    }

    @ObfuscatedName("nc.p(ZI)V")
    public static void method6689(boolean arg0) {
        if (Statics.field1599.method1124() || Statics.field1599.method1288()) {
            method1112(10);
            return;
        }
        field904 = class323.field3990;
        field910 = class323.field4067;
        field911 = class323.field3986;
        method1112(2);
        if (arg0) {
            field930 = "";
        }
        method805();
        method4933();
    }

    @ObfuscatedName("ly.b(ZI)V")
    public static void method5889(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field4526.method2373() >= client.field495;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field1599.method1124() || Statics.field1599.method1288()) {
            var1 = 10;
        }
        method1112(var1);
        if (arg0) {
            field913 = "";
            field930 = "";
            Statics.field4309 = 0;
            Statics.field4293 = "";
        }
        method805();
        method4933();
    }

    @ObfuscatedName("mn.o(I)V")
    public static void method6260() {
        field913 = field913.trim();
        if (field913.length() == 0) {
            method4925(class323.field4042, class323.field3885, class323.field4044);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2840("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class464 var4 = new class464(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4867, var4.field4864, 1000 - var4.field4864);
                if (var5 == -1) {
                    var4.field4864 = 0;
                    long var8 = var4.method7721();
                    var6 = var8;
                    break;
                }
                var4.field4864 += var5;
                if (var4.field4864 >= 1000) {
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
            var13 = Statics.method6245(var6, field913);
        }
        switch(var13) {
            case 2:
                method4925(class323.field3925, class323.field4046, class323.field4058);
                method1112(6);
                break;
            case 3:
                method4925(class323.field4048, class323.field4037, class323.field4050);
                break;
            case 4:
                method4925(class323.field4079, class323.field4031, class323.field3998);
                break;
            case 5:
                method4925(class323.field3789, class323.field4055, class323.field4059);
                break;
            case 6:
                method4925(class323.field4053, class323.field3808, class323.field3867);
                break;
            case 7:
                method4925(class323.field4060, class323.field4061, class323.field3787);
        }
    }

    @ObfuscatedName("de.u(Lnl;Lnl;Lnl;S)V")
    public static void method2599(class365 arg0, class365 arg1, class365 arg2) {
        field898 = (Statics.field223 - 765) / 2;
        field907 = field898 + 202;
        Statics.field129 = field907 + 180;
        if (field923) {
            method1154(arg0, arg1);
            return;
        }
        Statics.field3712.method8131(field898, 0);
        Statics.field1260.method8131(field898 + 382, 0);
        Statics.field1056.method8102(field898 + 382 - Statics.field1056.field4951 / 2, 18);
        if (client.field624 == 0 || client.field624 == 5) {
            byte var3 = 20;
            arg0.method6507(class323.field3989, field907 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class473.method8026(field907 + 180 - 152, var4, 304, 34, 9179409);
            class473.method8026(field907 + 180 - 151, var4 + 1, 302, 32, 0);
            class473.method8022(field907 + 180 - 150, var4 + 2, field902 * 3, 30, 9179409);
            class473.method8022(field902 * 3 + (field907 + 180 - 150), var4 + 2, 300 - field902 * 3, 30, 0);
            arg0.method6507(field903, field907 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field624 == 20) {
            Statics.field4300.method8102(field907 + 180 - Statics.field4300.field4951 / 2, 271 - Statics.field4300.field4953 / 2);
            short var5 = 201;
            arg0.method6507(field904, field907 + 180, var5, 16776960, 0);
            int var111 = var5 + 15;
            arg0.method6507(field910, field907 + 180, var111, 16776960, 0);
            int var112 = var111 + 15;
            arg0.method6507(field911, field907 + 180, var112, 16776960, 0);
            int var113 = var112 + 15;
            int var114 = var113 + 7;
            if (field899 != 4 && field899 != 10) {
                arg0.method6429(class323.field4017, field907 + 180 - 110, var114, 16777215, 0);
                short var6 = 200;
                String var7 = Statics.field4526.method2282() ? class358.method4856(field913) : field913;
                String var8;
                for (var8 = var7; arg0.method6447(var8) > var6; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method6429(class369.method6418(var8), field907 + 180 - 70, var114, 16777215, 0);
                var111 = var114 + 15;
                String var9;
                for (var9 = class358.method4856(field930); arg0.method6447(var9) > var6; var9 = var9.substring(1)) {
                }
                arg0.method6429(class323.field4018 + var9, field907 + 180 - 108, var111, 16777215, 0);
                var111 += 15;
            }
        }
        if (client.field624 == 10 || client.field624 == 11 || client.field624 == 50) {
            Statics.field4300.method8102(field907, 171);
            if (field899 == 0) {
                short var10 = 251;
                arg0.method6507(class323.field3809, field907 + 180, var10, 16776960, 0);
                int var115 = var10 + 30;
                int var11 = field907 + 180 - 80;
                short var12 = 291;
                Statics.field1648.method8102(var11 - 73, var12 - 20);
                arg0.method6424(class323.field4021, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field907 + 180 + 80;
                Statics.field1648.method8102(var13 - 73, var12 - 20);
                arg0.method6424(class323.field4022, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field899 == 1) {
                arg0.method6507(field928, field907 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method6507(field904, field907 + 180, var14, 16777215, 0);
                int var116 = var14 + 15;
                arg0.method6507(field910, field907 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                arg0.method6507(field911, field907 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                int var15 = field907 + 180 - 80;
                short var16 = 321;
                Statics.field1648.method8102(var15 - 73, var16 - 20);
                arg0.method6507(class323.field3772, var15, var16 + 5, 16777215, 0);
                int var17 = field907 + 180 + 80;
                Statics.field1648.method8102(var17 - 73, var16 - 20);
                arg0.method6507(class323.field4024, var17, var16 + 5, 16777215, 0);
            } else if (field899 == 2) {
                short var18 = 201;
                arg0.method6507(field904, Statics.field129, var18, 16776960, 0);
                int var119 = var18 + 15;
                arg0.method6507(field910, Statics.field129, var119, 16776960, 0);
                int var120 = var119 + 15;
                arg0.method6507(field911, Statics.field129, var120, 16776960, 0);
                int var121 = var120 + 15;
                int var122 = var121 + 7;
                arg0.method6429(class323.field4017, Statics.field129 - 110, var122, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field4526.method2282() ? class358.method4856(field913) : field913;
                String var21;
                for (var21 = var20; arg0.method6447(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method6429(class369.method6418(var21) + (field920 == 0 & client.field503 % 40 < 20 ? class97.method4293(16776960) + class97.field1273 : ""), Statics.field129 - 70, var122, 16777215, 0);
                var119 = var122 + 15;
                String var22;
                for (var22 = class358.method4856(field930); arg0.method6447(var22) > var19; var22 = var22.substring(1)) {
                }
                arg0.method6429(class323.field4018 + var22 + (field920 == 1 & client.field503 % 40 < 20 ? class97.method4293(16776960) + class97.field1273 : ""), Statics.field129 - 108, var119, 16777215, 0);
                var119 += 15;
                short var23 = 277;
                int var24 = Statics.field129 + -117;
                boolean var25 = client.field749;
                boolean var26 = field917;
                class476 var27 = var25 ? (var26 ? Statics.field4231 : Statics.field1932) : (var26 ? Statics.field1060 : Statics.field909);
                var27.method8102(var24, var23);
                int var29 = var27.field4951 + 5 + var24;
                arg1.method6429(class323.field4025, var29, var23 + 13, 16776960, 0);
                int var30 = Statics.field129 + 24;
                boolean var31 = Statics.field4526.method2282();
                boolean var32 = field918;
                class476 var33 = var31 ? (var32 ? Statics.field4231 : Statics.field1932) : (var32 ? Statics.field1060 : Statics.field909);
                var33.method8102(var30, var23);
                int var35 = var33.field4951 + 5 + var30;
                arg1.method6429(class323.field4026, var35, var23 + 13, 16776960, 0);
                int var123 = var23 + 15;
                int var36 = Statics.field129 - 80;
                short var37 = 321;
                Statics.field1648.method8102(var36 - 73, var37 - 20);
                arg0.method6507(class323.field4023, var36, var37 + 5, 16777215, 0);
                int var38 = Statics.field129 + 80;
                Statics.field1648.method8102(var38 - 73, var37 - 20);
                arg0.method6507(class323.field4024, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                switch(field926) {
                    case 2:
                        Statics.field96 = class323.field4038;
                        break;
                    default:
                        Statics.field96 = class323.field3968;
                }
                Statics.field4856 = new class404(Statics.field129, var39, arg1.method6447(Statics.field96), 11);
                Statics.field2926 = new class404(Statics.field129, var39, arg1.method6447(class323.field3767), 11);
                arg1.method6507(Statics.field96, Statics.field129, var39, 16777215, 0);
            } else if (field899 == 3) {
                short var40 = 201;
                arg0.method6507(class323.field4027, field907 + 180, var40, 16776960, 0);
                int var124 = var40 + 20;
                arg1.method6507(class323.field4073, field907 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg1.method6507(class323.field3783, field907 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var41 = field907 + 180;
                short var42 = 276;
                Statics.field1648.method8102(var41 - 73, var42 - 20);
                arg2.method6507(class323.field4030, var41, var42 + 5, 16777215, 0);
                int var43 = field907 + 180;
                short var44 = 326;
                Statics.field1648.method8102(var43 - 73, var44 - 20);
                arg2.method6507(class323.field3911, var43, var44 + 5, 16777215, 0);
            } else if (field899 == 4) {
                arg0.method6507(class323.field4080, field907 + 180, 201, 16776960, 0);
                short var45 = 236;
                arg0.method6507(field904, field907 + 180, var45, 16777215, 0);
                int var127 = var45 + 15;
                arg0.method6507(field910, field907 + 180, var127, 16777215, 0);
                int var128 = var127 + 15;
                arg0.method6507(field911, field907 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                arg0.method6429(class323.field4019 + class358.method4856(Statics.field4293) + (client.field503 % 40 < 20 ? class97.method4293(16776960) + class97.field1273 : ""), field907 + 180 - 108, var129, 16777215, 0);
                int var130 = var129 - 8;
                arg0.method6429(class323.field3775, field907 + 180 - 9, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method6429(class323.field3905, field907 + 180 - 9, var131, 16776960, 0);
                int var46 = field907 + 180 - 9 + arg0.method6447(class323.field3905) + 15;
                int var47 = var131 - arg0.field4355;
                class476 var48;
                if (field901) {
                    var48 = Statics.field1932;
                } else {
                    var48 = Statics.field909;
                }
                var48.method8102(var46, var47);
                var127 = var131 + 15;
                int var49 = field907 + 180 - 80;
                short var50 = 321;
                Statics.field1648.method8102(var49 - 73, var50 - 20);
                arg0.method6507(class323.field3772, var49, var50 + 5, 16777215, 0);
                int var51 = field907 + 180 + 80;
                Statics.field1648.method8102(var51 - 73, var50 - 20);
                arg0.method6507(class323.field4024, var51, var50 + 5, 16777215, 0);
                arg1.method6507(class323.field4007, field907 + 180, var50 + 36, 255, 0);
            } else if (field899 == 5) {
                arg0.method6507(class323.field4032, field907 + 180, 201, 16776960, 0);
                short var52 = 221;
                arg2.method6507(field904, field907 + 180, var52, 16776960, 0);
                int var132 = var52 + 15;
                arg2.method6507(field910, field907 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg2.method6507(field911, field907 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var135 = var134 + 14;
                arg0.method6429(class323.field4033, field907 + 180 - 145, var135, 16777215, 0);
                short var53 = 174;
                String var54 = Statics.field4526.method2282() ? class358.method4856(field913) : field913;
                String var55;
                for (var55 = var54; arg0.method6447(var55) > var53; var55 = var55.substring(1)) {
                }
                arg0.method6429(class369.method6418(var55) + (client.field503 % 40 < 20 ? class97.method4293(16776960) + class97.field1273 : ""), field907 + 180 - 34, var135, 16777215, 0);
                var132 = var135 + 15;
                int var56 = field907 + 180 - 80;
                short var57 = 321;
                Statics.field1648.method8102(var56 - 73, var57 - 20);
                arg0.method6507(class323.field4034, var56, var57 + 5, 16777215, 0);
                int var58 = field907 + 180 + 80;
                Statics.field1648.method8102(var58 - 73, var57 - 20);
                arg0.method6507(class323.field4035, var58, var57 + 5, 16777215, 0);
                short var59 = 356;
                arg1.method6507(class323.field3767, Statics.field129, var59, 268435455, 0);
            } else if (field899 == 6) {
                short var60 = 201;
                arg0.method6507(field904, field907 + 180, var60, 16776960, 0);
                int var136 = var60 + 15;
                arg0.method6507(field910, field907 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg0.method6507(field911, field907 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var61 = field907 + 180;
                short var62 = 321;
                Statics.field1648.method8102(var61 - 73, var62 - 20);
                arg0.method6507(class323.field4035, var61, var62 + 5, 16777215, 0);
            } else if (field899 == 7) {
                if (Statics.field1021 && !client.field498) {
                    short var63 = 201;
                    arg0.method6507(field904, Statics.field129, var63, 16776960, 0);
                    int var139 = var63 + 15;
                    arg0.method6507(field910, Statics.field129, var139, 16776960, 0);
                    int var140 = var139 + 15;
                    arg0.method6507(field911, Statics.field129, var140, 16776960, 0);
                    int var64 = Statics.field129 - 150;
                    int var141 = var140 + 10;
                    for (int var65 = 0; var65 < 8; var65++) {
                        Statics.field1648.method8104(var64, var141, 30, 40);
                        boolean var66 = field914 == var65 & client.field503 % 40 < 20;
                        arg0.method6429((field915[var65] == null ? "" : field915[var65]) + (var66 ? class97.method4293(16776960) + class97.field1273 : ""), var64 + 10, var141 + 27, 16777215, 0);
                        if (var65 == 1 || var65 == 3) {
                            var64 += 50;
                            arg0.method6429(class369.method6418("/"), var64 - 13, var141 + 27, 16777215, 0);
                        } else {
                            var64 += 35;
                        }
                    }
                    int var67 = Statics.field129 - 80;
                    short var68 = 321;
                    Statics.field1648.method8102(var67 - 73, var68 - 20);
                    arg0.method6507("Submit", var67, var68 + 5, 16777215, 0);
                    int var69 = Statics.field129 + 80;
                    Statics.field1648.method8102(var69 - 73, var68 - 20);
                    arg0.method6507(class323.field4024, var69, var68 + 5, 16777215, 0);
                } else {
                    short var70 = 216;
                    arg0.method6507(class323.field4063, field907 + 180, var70, 16776960, 0);
                    int var142 = var70 + 15;
                    arg2.method6507(class323.field4064, field907 + 180, var142, 16776960, 0);
                    int var143 = var142 + 15;
                    arg2.method6507(class323.field4083, field907 + 180, var143, 16776960, 0);
                    int var144 = var143 + 15;
                    int var71 = field907 + 180 - 80;
                    short var72 = 321;
                    Statics.field1648.method8102(var71 - 73, var72 - 20);
                    arg0.method6507(class323.field4086, var71, var72 + 5, 16777215, 0);
                    int var73 = field907 + 180 + 80;
                    Statics.field1648.method8102(var73 - 73, var72 - 20);
                    arg0.method6507(class323.field4035, var73, var72 + 5, 16777215, 0);
                }
            } else if (field899 == 8) {
                short var74 = 216;
                arg0.method6507(class323.field3992, field907 + 180, var74, 16776960, 0);
                int var145 = var74 + 15;
                arg2.method6507(class323.field3985, field907 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                arg2.method6507(class323.field3906, field907 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                int var75 = field907 + 180 - 80;
                short var76 = 321;
                Statics.field1648.method8102(var75 - 73, var76 - 20);
                arg0.method6507(class323.field3907, var75, var76 + 5, 16777215, 0);
                int var77 = field907 + 180 + 80;
                Statics.field1648.method8102(var77 - 73, var76 - 20);
                arg0.method6507(class323.field4035, var77, var76 + 5, 16777215, 0);
            } else if (field899 == 9) {
                short var78 = 221;
                arg0.method6507(field904, field907 + 180, var78, 16776960, 0);
                int var148 = var78 + 25;
                arg0.method6507(field910, field907 + 180, var148, 16776960, 0);
                int var149 = var148 + 25;
                arg0.method6507(field911, field907 + 180, var149, 16776960, 0);
                int var79 = field907 + 180;
                short var80 = 311;
                Statics.field1648.method8102(var79 - 73, var80 - 20);
                arg0.method6507(class323.field4030, var79, var80 + 5, 16777215, 0);
            } else if (field899 == 10) {
                int var81 = field907 + 180;
                short var82 = 209;
                arg0.method6507(class323.field3809, field907 + 180, var82, 16776960, 0);
                int var150 = var82 + 20;
                Statics.field4315.method8102(var81 - 109, var150);
                Statics.field1610.method8102(var81 - 48, var150 + 18);
            } else if (field899 == 12) {
                int var83 = Statics.field129;
                short var84 = 216;
                arg2.method6507(class323.field4070, var83, var84, 16777215, 0);
                int var151 = var84 + 17;
                arg2.method6507(class323.field4071, var83, var151, 16777215, 0);
                int var152 = var151 + 17;
                arg2.method6507(class323.field4072, var83, var152, 16777215, 0);
                int var153 = var152 + 17;
                arg2.method6507(class323.field3888, var83, var153, 16777215, 0);
                int var85 = Statics.field129 - 80;
                short var86 = 311;
                Statics.field1648.method8102(var85 - 73, var86 - 20);
                arg0.method6507(class323.field4076, var85, var86 + 5, 16777215, 0);
                int var87 = Statics.field129 + 80;
                Statics.field1648.method8102(var87 - 73, var86 - 20);
                arg0.method6507(class323.field3868, var87, var86 + 5, 16777215, 0);
            } else if (field899 == 13) {
                short var88 = 231;
                arg2.method6507(class323.field4074, field907 + 180, var88, 16777215, 0);
                int var154 = var88 + 20;
                arg2.method6507(class323.field4075, field907 + 180, var154, 16777215, 0);
                int var89 = field907 + 180;
                short var90 = 311;
                Statics.field1648.method8102(var89 - 73, var90 - 20);
                arg0.method6507(class323.field4035, var89, var90 + 5, 16777215, 0);
            } else if (field899 == 14) {
                short var91 = 201;
                String var92 = "";
                String var93 = "";
                String var94 = "";
                switch(field908) {
                    case 0:
                        var92 = class323.field3820;
                        var93 = class323.field3821;
                        var94 = class323.field3822;
                        break;
                    case 1:
                        var92 = class323.field3859;
                        var93 = class323.field3860;
                        var94 = class323.field3861;
                        break;
                    case 2:
                        var92 = class323.field3895;
                        var93 = class323.field3805;
                        var94 = class323.field3897;
                        break;
                    default:
                        method6689(false);
                }
                arg0.method6507(var92, field907 + 180, var91, 16776960, 0);
                int var155 = var91 + 20;
                arg0.method6507(var93, field907 + 180, var155, 16776960, 0);
                int var156 = var155 + 20;
                arg0.method6507(var94, field907 + 180, var156, 16776960, 0);
                int var95 = field907 + 180;
                short var96 = 276;
                Statics.field1648.method8102(var95 - 73, var96 - 20);
                arg0.method6507(class323.field3804, var95, var96 + 5, 16777215, 0);
                int var97 = field907 + 180;
                short var98 = 326;
                Statics.field1648.method8102(var97 - 73, var98 - 20);
                arg0.method6507(class323.field4035, var97, var98 + 5, 16777215, 0);
            } else if (field899 == 24) {
                short var99 = 221;
                arg0.method6507(field904, field907 + 180, var99, 16777215, 0);
                int var157 = var99 + 15;
                arg0.method6507(field910, field907 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                arg0.method6507(field911, field907 + 180, var158, 16777215, 0);
                int var159 = var158 + 15;
                int var100 = field907 + 180;
                short var101 = 301;
                Statics.field1648.method8102(var100 - 73, var101 - 20);
                arg0.method6507(class323.field3770, var100, var101 + 5, 16777215, 0);
            } else if (field899 == 26) {
                short var102 = 216;
                arg0.method6507(class323.field4063, field907 + 180, var102, 16776960, 0);
                int var160 = var102 + 15;
                arg2.method6507(class323.field4064, field907 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg2.method6507(class323.field4083, field907 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                int var103 = field907 + 180 - 80;
                short var104 = 321;
                Statics.field1648.method8102(var103 - 73, var104 - 20);
                arg0.method6507(class323.field4086, var103, var104 + 5, 16777215, 0);
                int var105 = field907 + 180 + 80;
                Statics.field1648.method8102(var105 - 73, var104 - 20);
                arg0.method6507(class323.field4035, var105, var104 + 5, 16777215, 0);
            }
        }
        if (client.field624 >= 10) {
            int[] var106 = new int[4];
            class473.method8080(var106);
            class473.method8015(field898, 0, field898 + 765, Statics.field59);
            Statics.field869.method2246(field898 - 22, client.field503);
            Statics.field869.method2246(field898 + 765 + 22 - 128, client.field503);
            class473.method8017(var106);
        }
        Statics.field89[Statics.field4526.method2284() ? 1 : 0].method8102(field898 + 765 - 40, 463);
        if (client.field624 <= 5 || Statics.field1347 != class345.field4253) {
            return;
        }
        if (Statics.field2823 == null) {
            Statics.field2823 = class478.method6750(Statics.field1644, "sl_button", "");
            return;
        }
        int var107 = field898 + 5;
        short var108 = 463;
        byte var109 = 100;
        byte var110 = 35;
        Statics.field2823.method8102(var107, var108);
        arg0.method6507(class323.field3944 + " " + client.field726, var109 / 2 + var107, var110 / 2 + var108 - 2, 16777215, 0);
        if (Statics.field1275 == null) {
            arg1.method6507(class323.field4088, var109 / 2 + var107, var110 / 2 + var108 + 12, 16777215, 0);
        } else {
            arg1.method6507(class323.field3836, var109 / 2 + var107, var110 / 2 + var108 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("jz.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method4925(String arg0, String arg1, String arg2) {
        field904 = arg0;
        field910 = arg1;
        field911 = arg2;
    }

    @ObfuscatedName("client.t(Lnl;Lnl;I)V")
    public static void method1154(class365 arg0, class365 arg1) {
        if (Statics.field3653 == null) {
            class328 var2 = Statics.field1644;
            int var3 = var2.method5813("sl_back");
            int var4 = var2.method5854(var3, "");
            class477[] var5 = class478.method6892(var2, var3, var4);
            Statics.field3653 = var5;
        }
        if (Statics.field2274 == null) {
            Statics.field2274 = class478.method7099(Statics.field1644, "sl_flags", "");
        }
        if (Statics.field1063 == null) {
            Statics.field1063 = class478.method7099(Statics.field1644, "sl_arrows", "");
        }
        if (Statics.field2023 == null) {
            Statics.field2023 = class478.method7099(Statics.field1644, "sl_stars", "");
        }
        if (Statics.field2743 == null) {
            Statics.field2743 = class478.method6750(Statics.field1644, "leftarrow", "");
        }
        if (Statics.field119 == null) {
            Statics.field119 = class478.method6750(Statics.field1644, "rightarrow", "");
        }
        class473.method8022(field898, 23, 765, 480, 0);
        class473.method8048(field898, 0, 125, 23, 12425273, 9135624);
        class473.method8048(field898 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6507(class323.field3929, field898 + 62, 15, 0, -1);
        if (Statics.field2023 != null) {
            Statics.field2023[1].method8102(field898 + 140, 1);
            arg1.method6429(class323.field4001, field898 + 152, 10, 16777215, -1);
            Statics.field2023[0].method8102(field898 + 140, 12);
            arg1.method6429(class323.field3934, field898 + 152, 21, 16777215, -1);
        }
        if (Statics.field1063 != null) {
            int var6 = field898 + 280;
            if (class65.field801[0] == 0 && class65.field800[0] == 0) {
                Statics.field1063[2].method8102(var6, 4);
            } else {
                Statics.field1063[0].method8102(var6, 4);
            }
            if (class65.field801[0] == 0 && class65.field800[0] == 1) {
                Statics.field1063[3].method8102(var6 + 15, 4);
            } else {
                Statics.field1063[1].method8102(var6 + 15, 4);
            }
            arg0.method6429(class323.field4081, var6 + 32, 17, 16777215, -1);
            int var7 = field898 + 390;
            if (class65.field801[0] == 1 && class65.field800[0] == 0) {
                Statics.field1063[2].method8102(var7, 4);
            } else {
                Statics.field1063[0].method8102(var7, 4);
            }
            if (class65.field801[0] == 1 && class65.field800[0] == 1) {
                Statics.field1063[3].method8102(var7 + 15, 4);
            } else {
                Statics.field1063[1].method8102(var7 + 15, 4);
            }
            arg0.method6429(class323.field4082, var7 + 32, 17, 16777215, -1);
            int var8 = field898 + 500;
            if (class65.field801[0] == 2 && class65.field800[0] == 0) {
                Statics.field1063[2].method8102(var8, 4);
            } else {
                Statics.field1063[0].method8102(var8, 4);
            }
            if (class65.field801[0] == 2 && class65.field800[0] == 1) {
                Statics.field1063[3].method8102(var8 + 15, 4);
            } else {
                Statics.field1063[1].method8102(var8 + 15, 4);
            }
            arg0.method6429(class323.field3800, var8 + 32, 17, 16777215, -1);
            int var9 = field898 + 610;
            if (class65.field801[0] == 3 && class65.field800[0] == 0) {
                Statics.field1063[2].method8102(var9, 4);
            } else {
                Statics.field1063[0].method8102(var9, 4);
            }
            if (class65.field801[0] == 3 && class65.field800[0] == 1) {
                Statics.field1063[3].method8102(var9 + 15, 4);
            } else {
                Statics.field1063[1].method8102(var9 + 15, 4);
            }
            arg0.method6429(class323.field4077, var9 + 32, 17, 16777215, -1);
        }
        class473.method8022(field898 + 708, 4, 50, 16, 0);
        arg1.method6507(class323.field4024, field898 + 708 + 25, 16, 16777215, -1);
        field906 = -1;
        if (Statics.field3653 != null) {
            byte var10 = 88;
            byte var11 = 19;
            int var12 = 765 / (var10 + 1) - 1;
            int var13 = 480 / (var11 + 1);
            int var14;
            int var15;
            do {
                var14 = var13;
                var15 = var12;
                if ((var12 - 1) * var13 >= class65.field798) {
                    var12--;
                }
                if ((var13 - 1) * var12 >= class65.field798) {
                    var13--;
                }
                if ((var13 - 1) * var12 >= class65.field798) {
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
            int var20 = (class65.field798 + var13 - 1) / var13;
            field896 = var20 - var12;
            if (Statics.field2743 != null && field925 > 0) {
                Statics.field2743.method8102(8, Statics.field59 / 2 - Statics.field2743.field4953 / 2);
            }
            if (Statics.field119 != null && field925 < field896) {
                Statics.field119.method8102(Statics.field223 - Statics.field119.field4951 - 8, Statics.field59 / 2 - Statics.field119.field4953 / 2);
            }
            int var21 = var19 + 23;
            int var22 = field898 + var18;
            int var23 = 0;
            boolean var24 = false;
            int var25 = field925;
            for (int var26 = var13 * var25; var26 < class65.field798 && var25 - field925 < var12; var26++) {
                class65 var27 = Statics.field4595[var26];
                boolean var28 = true;
                String var29 = Integer.toString(var27.field809);
                if (var27.field809 == -1) {
                    var29 = class323.field4085;
                    var28 = false;
                } else if (var27.field809 > 1980) {
                    var29 = class323.field3766;
                    var28 = false;
                }
                int var30 = 0;
                int var31;
                if (var27.method1661()) {
                    if (var27.method1654()) {
                        var31 = class104.field1337.field1344;
                    } else {
                        var31 = class104.field1349.field1344;
                    }
                } else if (var27.method1649()) {
                    var30 = 16711680;
                    if (var27.method1654()) {
                        var31 = class104.field1335.field1344;
                    } else {
                        var31 = class104.field1334.field1344;
                    }
                } else if (var27.method1687()) {
                    if (var27.method1654()) {
                        var31 = class104.field1339.field1344;
                    } else {
                        var31 = class104.field1348.field1344;
                    }
                } else if (var27.method1647()) {
                    if (var27.method1654()) {
                        var31 = class104.field1333.field1344;
                    } else {
                        var31 = class104.field1332.field1344;
                    }
                } else if (var27.method1652()) {
                    if (var27.method1654()) {
                        var31 = class104.field1343.field1344;
                    } else {
                        var31 = class104.field1340.field1344;
                    }
                } else if (var27.method1676()) {
                    if (var27.method1654()) {
                        var31 = class104.field1341.field1344;
                    } else {
                        var31 = class104.field1342.field1344;
                    }
                } else if (var27.method1654()) {
                    var31 = class104.field1331.field1344;
                } else {
                    var31 = class104.field1338.field1344;
                }
                if (class37.field241 >= var22 && class37.field242 >= var21 && class37.field241 < var10 + var22 && class37.field242 < var11 + var21 && var28) {
                    field906 = var26;
                    Statics.field3653[var31].method8137(var22, var21, 128, 16777215);
                    var24 = true;
                } else {
                    Statics.field3653[var31].method8131(var22, var21);
                }
                if (Statics.field2274 != null) {
                    Statics.field2274[(var27.method1654() ? 8 : 0) + var27.field796].method8102(var22 + 29, var21);
                }
                arg0.method6507(Integer.toString(var27.field806), var22 + 15, var11 / 2 + var21 + 5, var30, -1);
                arg1.method6507(var29, var22 + 60, var11 / 2 + var21 + 5, 268435455, -1);
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
                int var32 = arg1.method6447(Statics.field4595[field906].field804) + 6;
                int var33 = arg1.field4355 + 8;
                int var34 = class37.field242 + 25;
                if (var33 + var34 > 480) {
                    var34 = class37.field242 - 25 - var33;
                }
                class473.method8022(class37.field241 - var32 / 2, var34, var32, var33, 16777120);
                class473.method8026(class37.field241 - var32 / 2, var34, var32, var33, 0);
                arg1.method6507(Statics.field4595[field906].field804, class37.field241, arg1.field4355 + var34 + 4, 0, -1);
            }
        }
        Statics.field3.method476(0, 0);
    }

    @ObfuscatedName("client.w(Lbt;B)V")
    public static void method1316(class65 arg0) {
        if (arg0.method1654() != client.field493) {
            client.field493 = arg0.method1654();
            class195.method4851(arg0.method1654());
        }
        if (client.field491 != arg0.field803) {
            class328 var1 = Statics.field1644;
            int var2 = arg0.field803;
            if ((var2 & 0x20000000) != 0) {
                Statics.field1056 = class478.method6750(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) != 0) {
                Statics.field1056 = class478.method6750(var1, "logo_seasonal_mode", "");
            } else if ((var2 & 0x100) == 0) {
                Statics.field1056 = class478.method6750(var1, "logo", "");
            } else {
                Statics.field1056 = class478.method6750(var1, "logo_speedrunning", "");
            }
        }
        Statics.field3121 = arg0.field805;
        client.field726 = arg0.field806;
        client.field491 = arg0.field803;
        Statics.field1759 = client.field769 == 0 ? 43594 : arg0.field806 + 40000;
        Statics.field1566 = client.field769 == 0 ? 443 : arg0.field806 + 50000;
        Statics.field4838 = Statics.field1759;
    }

    @ObfuscatedName("q.m(I)V")
    public static void method284() {
        field923 = false;
        Statics.field3712.method8131(field898, 0);
        Statics.field1260.method8131(field898 + 382, 0);
        Statics.field1056.method8102(field898 + 382 - Statics.field1056.field4951 / 2, 18);
    }

    @ObfuscatedName("b.q(I)V")
    public static void method164() {
        method1112(24);
        method4925(class323.field4011, class323.field4029, class323.field4013);
    }

    @ObfuscatedName("s.i(I)V")
    public static void method97() {
        method1112(24);
        method4925(class323.field4014, class323.field3930, class323.field4068);
    }

    @ObfuscatedName("bv.e(II)V")
    public static void method1112(int arg0) {
        if (field899 != arg0) {
            field899 = arg0;
        }
    }
}
