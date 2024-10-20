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

@ObfuscatedName("bs")
public class class69 {

    @ObfuscatedName("bs.i")
    public static int field887 = 0;

    @ObfuscatedName("bs.y")
    public static int field891 = field887 + 202;

    @ObfuscatedName("bs.e")
    public static int field892 = 10;

    @ObfuscatedName("bs.z")
    public static String field911 = "";

    @ObfuscatedName("bs.au")
    public static int field902 = -1;

    @ObfuscatedName("bs.ai")
    public static int field896 = 1;

    @ObfuscatedName("bs.az")
    public static int field897 = 0;

    @ObfuscatedName("bs.as")
    public static String field898 = "";

    @ObfuscatedName("bs.aa")
    public static String field899 = "";

    @ObfuscatedName("bs.bj")
    public static String field900 = "";

    @ObfuscatedName("bs.bm")
    public static String field903 = "";

    @ObfuscatedName("bs.br")
    public static String field914 = "";

    @ObfuscatedName("bs.bo")
    public static String field895 = "";

    @ObfuscatedName("bs.be")
    public static int field904 = 0;

    @ObfuscatedName("bs.bh")
    public static String[] field905 = new String[8];

    @ObfuscatedName("bs.by")
    public static boolean field910 = false;

    @ObfuscatedName("bs.bt")
    public static boolean field907 = false;

    @ObfuscatedName("bs.bp")
    public static boolean field908 = true;

    @ObfuscatedName("bs.bi")
    public static int field909 = 0;

    @ObfuscatedName("bs.bu")
    public static String field893 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bs.bz")
    public static String field889 = "1234567890";

    @ObfuscatedName("bs.cm")
    public static boolean field886 = false;

    @ObfuscatedName("bs.cb")
    public static int field913 = -1;

    @ObfuscatedName("bs.cp")
    public static int field901 = 0;

    @ObfuscatedName("bs.co")
    public static int field915 = 0;

    @ObfuscatedName("bs.ci")
    public static long field916;

    @ObfuscatedName("bs.cy")
    public static long field917;

    @ObfuscatedName("bs.cr")
    public static String[] field918;

    @ObfuscatedName("bs.cq")
    public static String[] field919;

    static {
        new DecimalFormat("##0.00");
        new class121();
        field916 = -1L;
        field917 = -1L;
        field918 = new String[] { "title.jpg" };
        field919 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.v(Lln;Lln;ZIB)V")
    public static void method2816(class316 arg0, class316 arg1, boolean arg2, int arg3) {
        if (!Statics.field885) {
            if (arg3 == 0) {
                method5911(arg2);
            } else {
                method6209(arg3);
            }
            class447.method7315();
            byte[] var4 = arg0.method5314("title.jpg", "");
            Statics.field90 = class29.method1805(var4);
            Statics.field2810 = Statics.field90.method7357();
            Statics.method4662(arg1, client.field668);
            Statics.field894 = class452.method6221(arg1, "titlebox", "");
            Statics.field890 = class452.method6221(arg1, "titlebutton", "");
            Statics.field3497 = class452.method6221(arg1, "titlebutton_large", "");
            Statics.field2888 = class452.method6221(arg1, "play_now_text", "");
            class452.method6221(arg1, "titlebutton_wide42,1", "");
            Statics.field888 = class452.method2276(arg1, "runes", "");
            Statics.field1247 = class452.method2276(arg1, "title_mute", "");
            Statics.field2224 = class452.method6221(arg1, "options_radio_buttons,0", "");
            Statics.field1255 = class452.method6221(arg1, "options_radio_buttons,4", "");
            Statics.field442 = class452.method6221(arg1, "options_radio_buttons,2", "");
            Statics.field1984 = class452.method6221(arg1, "options_radio_buttons,6", "");
            Statics.field4276 = Statics.field2224.field4703;
            Statics.field2688 = Statics.field2224.field4704;
            Statics.field4102 = new class89(Statics.field888);
            if (arg2) {
                field914 = "";
                field895 = "";
                field905 = new String[8];
                field904 = 0;
            }
            Statics.field2387 = 0;
            Statics.field1233 = "";
            field908 = true;
            field886 = false;
            if (Statics.field1541.method2175()) {
                Statics.method2080(2);
            } else {
                class314 var5 = Statics.field80;
                int var6 = var5.method5293("scape main");
                int var7 = var5.method5312(var6, "");
                class274.method3196(2, var5, var6, var7, 255, false);
            }
            if (Statics.field4001 != null) {
                try {
                    class438 var8 = new class438(4);
                    var8.method6954(3);
                    var8.method6956(0);
                    Statics.field4001.method2992(var8.field4618, 0, 4);
                } catch (IOException var12) {
                    try {
                        Statics.field4001.method2972();
                    } catch (Exception var11) {
                    }
                    class317.field3985++;
                    Statics.field4001 = null;
                }
            }
            Statics.field885 = true;
            field887 = (Statics.field1798 - 765) / 2;
            field891 = field887 + 202;
            Statics.field1873 = field891 + 180;
            Statics.field90.method7361(field887, 0);
            Statics.field2810.method7361(field887 + 382, 0);
            Statics.field400.method7333(field887 + 382 - Statics.field400.field4703 / 2, 18);
        } else if (arg3 == 4) {
            method6209(4);
        }
    }

    @ObfuscatedName("o.c(ZZI)Lqq;")
    public static class450 method68(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1984 : Statics.field442) : (arg1 ? Statics.field1255 : Statics.field2224);
    }

    @ObfuscatedName("cg.i(I)V")
    public static void method2304() {
        if (field914 != null && field914.length() > 0) {
            return;
        }
        if (Statics.field1541.method2143() == null) {
            client.field539 = false;
        } else {
            field914 = Statics.field1541.method2143();
            client.field539 = true;
        }
    }

    @ObfuscatedName("hn.f(B)V")
    public static void method3936() {
        if (!Statics.field885) {
            return;
        }
        Statics.field894 = null;
        Statics.field890 = null;
        Statics.field888 = null;
        Statics.field90 = null;
        Statics.field2810 = null;
        Statics.field400 = null;
        Statics.field1247 = null;
        Statics.field2224 = null;
        Statics.field442 = null;
        Statics.field4377 = null;
        Statics.field4386 = null;
        Statics.field1513 = null;
        Statics.field1269 = null;
        Statics.field1570 = null;
        Statics.field4102.method2089();
        Statics.method2080(2);
        if (Statics.field4001 != null) {
            try {
                class438 var0 = new class438(4);
                var0.method6954(2);
                var0.method6956(0);
                Statics.field4001.method2992(var0.field4618, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field4001.method2972();
                } catch (Exception var3) {
                }
                class317.field3985++;
                Statics.field4001 = null;
            }
        }
        Statics.field885 = false;
    }

    @ObfuscatedName("w.n(I)V")
    public static void method152() {
        if (client.field539 && field914 != null && field914.length() > 0) {
            field909 = 1;
        } else {
            field909 = 0;
        }
    }

    @ObfuscatedName("ml.s(Lao;Lmd;B)V")
    public static void method5998(class32 arg0, class344 arg1) {
        if (field886) {
            while (true) {
                if (!Statics.method1957()) {
                    if (class33.field220 != 1 && (Statics.field3560 || class33.field220 != 4)) {
                        break;
                    }
                    int var2 = field887 + 280;
                    if (class33.field237 >= var2 && class33.field237 <= var2 + 14 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(0, 0);
                        break;
                    }
                    if (class33.field237 >= var2 + 15 && class33.field237 <= var2 + 80 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(0, 1);
                        break;
                    }
                    int var3 = field887 + 390;
                    if (class33.field237 >= var3 && class33.field237 <= var3 + 14 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(1, 0);
                        break;
                    }
                    if (class33.field237 >= var3 + 15 && class33.field237 <= var3 + 80 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(1, 1);
                        break;
                    }
                    int var4 = field887 + 500;
                    if (class33.field237 >= var4 && class33.field237 <= var4 + 14 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(2, 0);
                        break;
                    }
                    if (class33.field237 >= var4 + 15 && class33.field237 <= var4 + 80 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(2, 1);
                        break;
                    }
                    int var5 = field887 + 610;
                    if (class33.field237 >= var5 && class33.field237 <= var5 + 14 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(3, 0);
                        break;
                    }
                    if (class33.field237 >= var5 + 15 && class33.field237 <= var5 + 80 && class33.field234 >= 4 && class33.field234 <= 18) {
                        class61.method2301(3, 1);
                        break;
                    }
                    if (class33.field237 >= field887 + 708 && class33.field234 >= 4 && class33.field237 <= field887 + 708 + 50 && class33.field234 <= 20) {
                        field886 = false;
                        Statics.field90.method7361(field887, 0);
                        Statics.field2810.method7361(field887 + 382, 0);
                        Statics.field400.method7333(field887 + 382 - Statics.field400.field4703 / 2, 18);
                        break;
                    }
                    if (field913 == -1) {
                        if (field901 > 0 && Statics.field446 != null && class33.field237 >= 0 && class33.field237 <= Statics.field446.field4703 && class33.field234 >= Statics.field4019 / 2 - 50 && class33.field234 <= Statics.field4019 / 2 + 50) {
                            field901--;
                        }
                        if (field901 < field915 && Statics.field1262 != null && class33.field237 >= Statics.field1798 - Statics.field1262.field4703 - 5 && class33.field237 <= Statics.field1798 && class33.field234 >= Statics.field4019 / 2 - 50 && class33.field234 <= Statics.field4019 / 2 + 50) {
                            field901++;
                        }
                    } else {
                        class61 var6 = Statics.field153[field913];
                        method6525(var6);
                        field886 = false;
                        Statics.field90.method7361(field887, 0);
                        Statics.field2810.method7361(field887 + 382, 0);
                        Statics.field400.method7333(field887 + 382 - Statics.field400.field4703 / 2, 18);
                    }
                    break;
                }
                if (Statics.field219 == 13) {
                    field886 = false;
                    Statics.field90.method7361(field887, 0);
                    Statics.field2810.method7361(field887 + 382, 0);
                    Statics.field400.method7333(field887 + 382 - Statics.field400.field4703 / 2, 18);
                    break;
                }
                if (Statics.field219 == 96) {
                    if (field901 > 0 && Statics.field446 != null) {
                        field901--;
                    }
                } else if (Statics.field219 == 97 && field901 < field915 && Statics.field1262 != null) {
                    field901++;
                }
            }
            return;
        }
        if ((class33.field220 == 1 || !Statics.field3560 && class33.field220 == 4) && class33.field237 >= field887 + 765 - 50 && class33.field234 >= 453) {
            Statics.field1541.method2133(!Statics.field1541.method2175());
            if (Statics.field1541.method2175()) {
                Statics.field3172.method4817();
                class274.field3169 = 1;
                Statics.field3174 = null;
            } else {
                class274.method4841(Statics.field80, "scape main", "", 255, false);
            }
        }
        if (client.field501 == 5) {
            return;
        }
        if (field916 == -1L) {
            field916 = class270.method2724() + 1000L;
        }
        long var7 = class270.method2724();
        if (client.method2064() && field917 == -1L) {
            field917 = var7;
            if (field917 > field916) {
                field916 = field917;
            }
        }
        if (client.field501 != 10 && client.field501 != 11) {
            return;
        }
        if (Statics.field3523 == class331.field4055) {
            if (class33.field220 == 1 || !Statics.field3560 && class33.field220 == 4) {
                int var9 = field887 + 5;
                short var10 = 463;
                byte var11 = 100;
                byte var12 = 35;
                if (class33.field237 >= var9 && class33.field237 <= var9 + var11 && class33.field234 >= var10 && class33.field234 <= var10 + var12) {
                    method742();
                    return;
                }
            }
            if (Statics.field3315 != null) {
                method742();
            }
        }
        int var13 = class33.field220;
        int var14 = class33.field237;
        int var15 = class33.field234;
        if (var13 == 0) {
            var14 = class33.field229;
            var15 = class33.field230;
        }
        if (!Statics.field3560 && var13 == 4) {
            var13 = 1;
        }
        if (field897 == 0) {
            boolean var16 = false;
            while (Statics.method1957()) {
                if (Statics.field219 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field1873 - 80;
            short var18 = 291;
            if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                class30.method6446(client.method1971("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field1873 + 80;
            if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                if ((client.field668 & 0x2000000) != 0) {
                    field898 = "";
                    field899 = class309.field3811;
                    field900 = class309.field3829;
                    field903 = class309.field3830;
                    method6209(1);
                    method152();
                } else if ((client.field668 & 0x4) != 0) {
                    if ((client.field668 & 0x400) == 0) {
                        field899 = class309.field3819;
                        field900 = class309.field3820;
                        field903 = class309.field3651;
                    } else {
                        field899 = class309.field3825;
                        field900 = class309.field3826;
                        field903 = class309.field3827;
                    }
                    field898 = class309.field3818;
                    method6209(1);
                    method152();
                } else if ((client.field668 & 0x400) == 0) {
                    method2372(false);
                } else {
                    field899 = class309.field3822;
                    field900 = class309.field3823;
                    field903 = class309.field3824;
                    field898 = class309.field3818;
                    method6209(1);
                    method152();
                }
            }
        } else if (field897 == 1) {
            while (true) {
                if (!Statics.method1957()) {
                    int var20 = Statics.field1873 - 80;
                    short var21 = 321;
                    if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                        method2372(false);
                    }
                    int var22 = Statics.field1873 + 80;
                    if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                        method6209(0);
                    }
                    break;
                }
                if (Statics.field219 == 84) {
                    method2372(false);
                } else if (Statics.field219 == 13) {
                    method6209(0);
                }
            }
        } else if (field897 == 2) {
            short var23 = 201;
            int var134 = var23 + 52;
            if (var13 == 1 && var15 >= var134 - 12 && var15 < var134 + 2) {
                field909 = 0;
            }
            var134 += 15;
            if (var13 == 1 && var15 >= var134 - 12 && var15 < var134 + 2) {
                field909 = 1;
            }
            var134 += 15;
            short var24 = 361;
            if (Statics.field1379 != null) {
                int var25 = Statics.field1379.field4329 / 2;
                if (var13 == 1 && var14 >= Statics.field1379.field4330 - var25 && var14 <= Statics.field1379.field4330 + var25 && var15 >= var24 - 15 && var15 < var24) {
                    switch(field896) {
                        case 1:
                            method13(class309.field3896, class309.field3843, class309.field3869);
                            method6209(5);
                            return;
                        case 2:
                            class30.method6446("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field1873 - 80;
            short var27 = 321;
            if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                field914 = field914.trim();
                if (field914.length() == 0) {
                    method13(class309.field3711, class309.field3732, class309.field3713);
                    return;
                }
                if (field895.length() == 0) {
                    method13(class309.field3835, class309.field3895, class309.field3899);
                    return;
                }
                method13(class309.field3833, class309.field3702, class309.field3625);
                client.method5210(false);
                client.method975(20);
                return;
            }
            int var28 = field891 + 180 + 80;
            if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                method6209(0);
                field914 = "";
                field895 = "";
                Statics.field2387 = 0;
                Statics.field1233 = "";
                field908 = true;
            }
            int var29 = Statics.field1873 + -117;
            short var30 = 277;
            field910 = var14 >= var29 && var14 < Statics.field4276 + var29 && var15 >= var30 && var15 < Statics.field2688 + var30;
            if (var13 == 1 && field910) {
                client.field539 = !client.field539;
                if (!client.field539 && Statics.field1541.method2143() != null) {
                    Statics.field1541.method2182((String) null);
                }
            }
            int var31 = Statics.field1873 + 24;
            short var32 = 277;
            field907 = var14 >= var31 && var14 < Statics.field4276 + var31 && var15 >= var32 && var15 < Statics.field2688 + var32;
            if (var13 == 1 && field907) {
                Statics.field1541.method2126(!Statics.field1541.method2213());
                if (!Statics.field1541.method2213()) {
                    field914 = "";
                    Statics.field1541.method2182((String) null);
                    method152();
                }
            }
            label1156: while (true) {
                Transferable var38;
                int var39;
                do {
                    while (true) {
                        label1120: do {
                            while (true) {
                                while (Statics.method1957()) {
                                    if (Statics.field219 == 13) {
                                        method6209(0);
                                        field914 = "";
                                        field895 = "";
                                        Statics.field2387 = 0;
                                        Statics.field1233 = "";
                                        field908 = true;
                                    } else {
                                        if (field909 != 0) {
                                            continue label1120;
                                        }
                                        char var33 = Statics.field2122;
                                        for (int var34 = 0; var34 < field893.length() && var33 != field893.charAt(var34); var34++) {
                                        }
                                        if (Statics.field219 == 85 && field914.length() > 0) {
                                            field914 = field914.substring(0, field914.length() - 1);
                                        }
                                        if (Statics.field219 == 84 || Statics.field219 == 80) {
                                            field909 = 1;
                                        }
                                        char var35 = Statics.field2122;
                                        boolean var36 = field893.indexOf(var35) != -1;
                                        if (var36 && field914.length() < 320) {
                                            field914 = field914 + Statics.field2122;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field909 != 1);
                        if (Statics.field219 == 85 && field895.length() > 0) {
                            field895 = field895.substring(0, field895.length() - 1);
                        } else if (Statics.field219 == 84 || Statics.field219 == 80) {
                            field909 = 0;
                            if (Statics.field219 == 84) {
                                field914 = field914.trim();
                                if (field914.length() == 0) {
                                    method13(class309.field3711, class309.field3732, class309.field3713);
                                    return;
                                }
                                if (field895.length() == 0) {
                                    method13(class309.field3835, class309.field3895, class309.field3899);
                                    return;
                                }
                                method13(class309.field3833, class309.field3702, class309.field3625);
                                client.method5210(false);
                                client.method975(20);
                                return;
                            }
                        }
                        if ((class24.field130[82] || class24.field130[87]) && Statics.field219 == 67) {
                            Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var38 = var37.getContents(Statics.field1515);
                            var39 = 20 - field895.length();
                            break;
                        }
                        if (class346.method3893(Statics.field2122)) {
                            char var47 = Statics.field2122;
                            boolean var48 = field893.indexOf(var47) != -1;
                            if (var48 && field895.length() < 20) {
                                field895 = field895 + Statics.field2122;
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
                            field895 = field895 + var40.substring(0, var41);
                            continue label1156;
                        }
                        if (!class346.method3893(var40.charAt(var42))) {
                            break;
                        }
                        char var43 = var40.charAt(var42);
                        boolean var44 = field893.indexOf(var43) != -1;
                        if (!var44) {
                            break;
                        }
                        var42++;
                    }
                    method6209(3);
                    return;
                } catch (UnsupportedFlavorException var132) {
                } catch (IOException var133) {
                }
            }
        } else if (field897 == 3) {
            int var49 = field891 + 180;
            short var50 = 276;
            if (var13 == 1 && var14 >= var49 - 75 && var14 <= var49 + 75 && var15 >= var50 - 20 && var15 <= var50 + 20) {
                method5911(false);
            }
            int var51 = field891 + 180;
            short var52 = 326;
            if (var13 == 1 && var14 >= var51 - 75 && var14 <= var51 + 75 && var15 >= var52 - 20 && var15 <= var52 + 20) {
                method13(class309.field3896, class309.field3843, class309.field3869);
                method6209(5);
                return;
            }
        } else if (field897 == 4) {
            int var53 = field891 + 180 - 80;
            short var54 = 321;
            if (var13 == 1 && var14 >= var53 - 75 && var14 <= var53 + 75 && var15 >= var54 - 20 && var15 <= var54 + 20) {
                Statics.field1233.trim();
                if (Statics.field1233.length() != 6) {
                    method13(class309.field3795, class309.field3631, class309.field3632);
                    return;
                }
                Statics.field2387 = Integer.parseInt(Statics.field1233);
                Statics.field1233 = "";
                client.method5210(true);
                method13(class309.field3833, class309.field3702, class309.field3625);
                client.method975(20);
                return;
            }
            if (var13 == 1 && var14 >= field891 + 180 - 9 && var14 <= field891 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                field908 = !field908;
            }
            if (var13 == 1 && var14 >= field891 + 180 - 34 && var14 <= field891 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                class30.method6446(client.method1971("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var55 = field891 + 180 + 80;
            if (var13 == 1 && var14 >= var55 - 75 && var14 <= var55 + 75 && var15 >= var54 - 20 && var15 <= var54 + 20) {
                method6209(0);
                field914 = "";
                field895 = "";
                Statics.field2387 = 0;
                Statics.field1233 = "";
            }
            while (Statics.method1957()) {
                boolean var56 = false;
                for (int var57 = 0; var57 < field889.length(); var57++) {
                    if (Statics.field2122 == field889.charAt(var57)) {
                        var56 = true;
                        break;
                    }
                }
                if (Statics.field219 == 13) {
                    method6209(0);
                    field914 = "";
                    field895 = "";
                    Statics.field2387 = 0;
                    Statics.field1233 = "";
                } else {
                    if (Statics.field219 == 85 && Statics.field1233.length() > 0) {
                        Statics.field1233 = Statics.field1233.substring(0, Statics.field1233.length() - 1);
                    }
                    if (Statics.field219 == 84) {
                        Statics.field1233.trim();
                        if (Statics.field1233.length() != 6) {
                            method13(class309.field3795, class309.field3631, class309.field3632);
                            return;
                        }
                        Statics.field2387 = Integer.parseInt(Statics.field1233);
                        Statics.field1233 = "";
                        client.method5210(true);
                        method13(class309.field3833, class309.field3702, class309.field3625);
                        client.method975(20);
                        return;
                    }
                    if (var56 && Statics.field1233.length() < 6) {
                        Statics.field1233 = Statics.field1233 + Statics.field2122;
                    }
                }
            }
        } else if (field897 == 5) {
            int var58 = field891 + 180 - 80;
            short var59 = 321;
            if (var13 == 1 && var14 >= var58 - 75 && var14 <= var58 + 75 && var15 >= var59 - 20 && var15 <= var59 + 20) {
                method1911();
                return;
            }
            int var60 = field891 + 180 + 80;
            if (var13 == 1 && var14 >= var60 - 75 && var14 <= var60 + 75 && var15 >= var59 - 20 && var15 <= var59 + 20) {
                method2372(true);
            }
            short var61 = 361;
            if (Statics.field2893 != null) {
                int var62 = Statics.field2893.field4329 / 2;
                if (var13 == 1 && var14 >= Statics.field2893.field4330 - var62 && var14 <= Statics.field2893.field4330 + var62 && var15 >= var61 - 15 && var15 < var61) {
                    class30.method6446(client.method1971("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (Statics.method1957()) {
                boolean var63 = false;
                for (int var64 = 0; var64 < field893.length(); var64++) {
                    if (Statics.field2122 == field893.charAt(var64)) {
                        var63 = true;
                        break;
                    }
                }
                if (Statics.field219 == 13) {
                    method2372(true);
                } else {
                    if (Statics.field219 == 85 && field914.length() > 0) {
                        field914 = field914.substring(0, field914.length() - 1);
                    }
                    if (Statics.field219 == 84) {
                        method1911();
                        return;
                    }
                    if (var63 && field914.length() < 320) {
                        field914 = field914 + Statics.field2122;
                    }
                }
            }
        } else if (field897 == 6) {
            while (true) {
                do {
                    if (!Statics.method1957()) {
                        short var65 = 321;
                        if (var13 == 1 && var15 >= var65 - 20 && var15 <= var65 + 20) {
                            method2372(true);
                        }
                        return;
                    }
                } while (Statics.field219 != 84 && Statics.field219 != 13);
                method2372(true);
            }
        } else if (field897 == 7) {
            if (Statics.field505 && !client.field500) {
                int var66 = Statics.field1873 - 150;
                int var67 = var66 + 240 + 25 + 40;
                short var68 = 231;
                int var69 = var68 + 40;
                if (var13 == 1 && var14 >= var66 && var14 <= var67 && var15 >= var68 && var15 <= var69) {
                    int var70 = var66;
                    int var71 = 0;
                    int var72;
                    while (true) {
                        if (var71 >= 8) {
                            var72 = 0;
                            break;
                        }
                        if (var14 <= var70 + 30) {
                            var72 = var71;
                            break;
                        }
                        var70 += 30;
                        var70 += var71 == 1 || var71 == 3 ? 20 : 5;
                        var71++;
                    }
                    field904 = var72;
                }
                int var73 = field891 + 180 - 80;
                short var74 = 321;
                if (var13 == 1 && var14 >= var73 - 75 && var14 <= var73 + 75 && var15 >= var74 - 20 && var15 <= var74 + 20) {
                    boolean var77;
                    label991: {
                        Date var75;
                        try {
                            var75 = method5847();
                        } catch (ParseException var131) {
                            method6209(7);
                            method13("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var77 = false;
                            break label991;
                        }
                        if (var75 == null) {
                            var77 = false;
                        } else {
                            Calendar var78 = Calendar.getInstance();
                            var78.set(1, var78.get(1) - 13);
                            Date var79 = var78.getTime();
                            boolean var80 = var75.before(var79);
                            Calendar var82 = Calendar.getInstance();
                            var82.set(2, 0);
                            var82.set(5, 1);
                            var82.set(1, 1900);
                            Date var83 = var82.getTime();
                            boolean var85 = var75.after(var83);
                            if (var85) {
                                if (var80) {
                                    Statics.field2322 = (int) (var75.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field2322 = 8388607;
                                }
                                var77 = true;
                            } else {
                                method6209(7);
                                method13("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var77 = false;
                            }
                        }
                    }
                    if (var77) {
                        client.method975(50);
                        return;
                    }
                }
                int var88 = field891 + 180 + 80;
                if (var13 == 1 && var14 >= var88 - 75 && var14 <= var88 + 75 && var15 >= var74 - 20 && var15 <= var74 + 20) {
                    field905 = new String[8];
                    method2372(true);
                }
                while (Statics.method1957()) {
                    if (Statics.field219 == 101) {
                        field905[field904] = null;
                    }
                    if (Statics.field219 == 85) {
                        if (field905[field904] == null && field904 > 0) {
                            field904--;
                        }
                        field905[field904] = null;
                    }
                    if (Statics.field2122 >= '0' && Statics.field2122 <= '9') {
                        field905[field904] = "" + Statics.field2122;
                        if (field904 < 7) {
                            field904++;
                        }
                    }
                    if (Statics.field219 == 84) {
                        boolean var91;
                        label927: {
                            Date var89;
                            try {
                                var89 = method5847();
                            } catch (ParseException var130) {
                                method6209(7);
                                method13("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var91 = false;
                                break label927;
                            }
                            if (var89 == null) {
                                var91 = false;
                            } else {
                                Calendar var92 = Calendar.getInstance();
                                var92.set(1, var92.get(1) - 13);
                                Date var93 = var92.getTime();
                                boolean var94 = var89.before(var93);
                                Calendar var96 = Calendar.getInstance();
                                var96.set(2, 0);
                                var96.set(5, 1);
                                var96.set(1, 1900);
                                Date var97 = var96.getTime();
                                boolean var99 = var89.after(var97);
                                if (var99) {
                                    if (var94) {
                                        Statics.field2322 = (int) (var89.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field2322 = 8388607;
                                    }
                                    var91 = true;
                                } else {
                                    method6209(7);
                                    method13("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var91 = false;
                                }
                            }
                        }
                        if (var91) {
                            client.method975(50);
                        }
                        return;
                    }
                }
            } else {
                int var102 = field891 + 180 - 80;
                short var103 = 321;
                if (var13 == 1 && var14 >= var102 - 75 && var14 <= var102 + 75 && var15 >= var103 - 20 && var15 <= var103 + 20) {
                    class30.method6446(client.method1971("secure", true) + "m=dob/set_dob.ws", true, false);
                    method13(class309.field3773, class309.field3760, class309.field3866);
                    method6209(6);
                    return;
                }
                int var104 = field891 + 180 + 80;
                if (var13 == 1 && var14 >= var104 - 75 && var14 <= var104 + 75 && var15 >= var103 - 20 && var15 <= var103 + 20) {
                    method2372(true);
                }
            }
        } else if (field897 == 8) {
            int var105 = field891 + 180 - 80;
            short var106 = 321;
            if (var13 == 1 && var14 >= var105 - 75 && var14 <= var105 + 75 && var15 >= var106 - 20 && var15 <= var106 + 20) {
                class30.method6446("https://www.jagex.com/terms/privacy", true, false);
                method13(class309.field3773, class309.field3760, class309.field3866);
                method6209(6);
                return;
            }
            int var107 = field891 + 180 + 80;
            if (var13 == 1 && var14 >= var107 - 75 && var14 <= var107 + 75 && var15 >= var106 - 20 && var15 <= var106 + 20) {
                method2372(true);
            }
        } else if (field897 == 9) {
            int var108 = field891 + 180;
            short var109 = 311;
            if (Statics.field219 == 84 || Statics.field219 == 13 || var13 == 1 && var14 >= var108 - 75 && var14 <= var108 + 75 && var15 >= var109 - 20 && var15 <= var109 + 20) {
                method5911(false);
            }
        } else if (field897 == 10) {
            int var110 = field891 + 180;
            short var111 = 209;
            if (Statics.field219 == 84 || var13 == 1 && var14 >= var110 - 109 && var14 <= var110 + 109 && var15 >= var111 && var15 <= var111 + 68) {
                method13(class309.field3833, class309.field3702, class309.field3625);
                client.field533 = class442.field4672;
                client.method5210(false);
                client.method975(20);
            }
        } else if (field897 == 12) {
            int var112 = Statics.field1873;
            short var113 = 233;
            class384 var114 = arg1.method5746(0, 30, class309.field3893, var112, var113);
            class384 var115 = arg1.method5746(32, 32, class309.field3893, var112, var113);
            class384 var116 = arg1.method5746(70, 34, class309.field3893, var112, var113);
            int var135 = var113 + 17;
            class384 var117 = arg1.method5746(0, 34, class309.field3894, var112, var135);
            if (var13 == 1) {
                if (var114.method6283(var14, var15)) {
                    class30.method6446("https://www.jagex.com/terms", true, false);
                } else if (var115.method6283(var14, var15)) {
                    class30.method6446("https://www.jagex.com/terms/privacy", true, false);
                } else if (var116.method6283(var14, var15) || var117.method6283(var14, var15)) {
                    class30.method6446("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var118 = Statics.field1873 - 80;
            short var119 = 311;
            if (var13 == 1 && var14 >= var118 - 75 && var14 <= var118 + 75 && var15 >= var119 - 20 && var15 <= var119 + 20) {
                Statics.field1541.method2144(client.field618);
                method5911(true);
            }
            int var120 = Statics.field1873 + 80;
            if (var13 == 1 && var14 >= var120 - 75 && var14 <= var120 + 75 && var15 >= var119 - 20 && var15 <= var119 + 20) {
                field897 = 13;
            }
        } else if (field897 == 13) {
            int var121 = Statics.field1873;
            short var122 = 321;
            if (var13 == 1 && var14 >= var121 - 75 && var14 <= var121 + 75 && var15 >= var122 - 20 && var15 <= var122 + 20) {
                method5911(true);
            }
        } else if (field897 == 14) {
            String var123 = "";
            switch(field902) {
                case 0:
                    var123 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var123 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method2372(false);
            }
            int var124 = field891 + 180;
            short var125 = 276;
            if (var13 == 1 && var14 >= var124 - 75 && var14 <= var124 + 75 && var15 >= var125 - 20 && var15 <= var125 + 20) {
                class30.method6446(var123, true, false);
                method13(class309.field3773, class309.field3760, class309.field3866);
                method6209(6);
                return;
            }
            int var126 = field891 + 180;
            short var127 = 326;
            if (var13 == 1 && var14 >= var126 - 75 && var14 <= var126 + 75 && var15 >= var127 - 20 && var15 <= var127 + 20) {
                method2372(false);
            }
        } else if (field897 == 24) {
            int var128 = field891 + 180;
            short var129 = 301;
            if (var13 == 1 && var14 >= var128 - 75 && var14 <= var128 + 75 && var15 >= var129 - 20 && var15 <= var129 + 20) {
                method5911(false);
            }
        }
    }

    @ObfuscatedName("ma.l(B)Ljava/util/Date;")
    public static Date method5847() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field905;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method6209(7);
                method13("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("ce.q(ZI)V")
    public static void method2372(boolean arg0) {
        field899 = class309.field3724;
        field900 = class309.field3759;
        field903 = class309.field3817;
        method6209(2);
        if (arg0) {
            field895 = "";
        }
        method2304();
        method152();
    }

    @ObfuscatedName("mo.o(ZS)V")
    public static void method5911(boolean arg0) {
        byte var1 = 0;
        if (!client.method6228()) {
            var1 = 12;
        } else if (Statics.field1515.method1449() || Statics.field1515.method1393()) {
            var1 = 10;
        }
        method6209(var1);
        if (arg0) {
            field914 = "";
            field895 = "";
            Statics.field2387 = 0;
            Statics.field1233 = "";
        }
        method2304();
        method152();
    }

    @ObfuscatedName("bc.r(B)V")
    public static void method1911() {
        field914 = field914.trim();
        if (field914.length() == 0) {
            method13(class309.field3896, class309.field3843, class309.field3869);
            return;
        }
        long var0 = class66.method1594();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class66.method3899(var0, field914);
        }
        switch(var2) {
            case 2:
                method13(class309.field3629, class309.field3871, class309.field3647);
                method6209(6);
                break;
            case 3:
                method13(class309.field3637, class309.field3874, class309.field3875);
                break;
            case 4:
                method13(class309.field3876, class309.field3877, class309.field3878);
                break;
            case 5:
                method13(class309.field3758, class309.field3880, class309.field3881);
                break;
            case 6:
                method13(class309.field3882, class309.field3883, class309.field3884);
                break;
            case 7:
                method13(class309.field3714, class309.field3886, class309.field3676);
        }
    }

    @ObfuscatedName("dq.p(Lmd;Lmd;Lmd;I)V")
    public static void method2689(class344 arg0, class344 arg1, class344 arg2) {
        field887 = (Statics.field1798 - 765) / 2;
        field891 = field887 + 202;
        Statics.field1873 = field891 + 180;
        if (field886) {
            if (Statics.field4377 == null) {
                class314 var3 = Statics.field1639;
                int var4 = var3.method5293("sl_back");
                int var5 = var3.method5312(var4, "");
                class451[] var6 = class452.method6880(var3, var4, var5);
                Statics.field4377 = var6;
            }
            if (Statics.field4386 == null) {
                Statics.field4386 = class452.method2276(Statics.field1639, "sl_flags", "");
            }
            if (Statics.field1513 == null) {
                Statics.field1513 = class452.method2276(Statics.field1639, "sl_arrows", "");
            }
            if (Statics.field1269 == null) {
                Statics.field1269 = class452.method2276(Statics.field1639, "sl_stars", "");
            }
            if (Statics.field446 == null) {
                Statics.field446 = class452.method6221(Statics.field1639, "leftarrow", "");
            }
            if (Statics.field1262 == null) {
                Statics.field1262 = class452.method6221(Statics.field1639, "rightarrow", "");
            }
            class447.method7249(field887, 23, 765, 480, 0);
            class447.method7259(field887, 0, 125, 23, 12425273, 9135624);
            class447.method7259(field887 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5750(class309.field3900, field887 + 62, 15, 0, -1);
            if (Statics.field1269 != null) {
                Statics.field1269[1].method7333(field887 + 140, 1);
                arg1.method5782(class309.field3901, field887 + 152, 10, 16777215, -1);
                Statics.field1269[0].method7333(field887 + 140, 12);
                arg1.method5782(class309.field3715, field887 + 152, 21, 16777215, -1);
            }
            if (Statics.field1513 != null) {
                int var7 = field887 + 280;
                if (class61.field788[0] == 0 && class61.field793[0] == 0) {
                    Statics.field1513[2].method7333(var7, 4);
                } else {
                    Statics.field1513[0].method7333(var7, 4);
                }
                if (class61.field788[0] == 0 && class61.field793[0] == 1) {
                    Statics.field1513[3].method7333(var7 + 15, 4);
                } else {
                    Statics.field1513[1].method7333(var7 + 15, 4);
                }
                arg0.method5782(class309.field3903, var7 + 32, 17, 16777215, -1);
                int var8 = field887 + 390;
                if (class61.field788[0] == 1 && class61.field793[0] == 0) {
                    Statics.field1513[2].method7333(var8, 4);
                } else {
                    Statics.field1513[0].method7333(var8, 4);
                }
                if (class61.field788[0] == 1 && class61.field793[0] == 1) {
                    Statics.field1513[3].method7333(var8 + 15, 4);
                } else {
                    Statics.field1513[1].method7333(var8 + 15, 4);
                }
                arg0.method5782(class309.field3828, var8 + 32, 17, 16777215, -1);
                int var9 = field887 + 500;
                if (class61.field788[0] == 2 && class61.field793[0] == 0) {
                    Statics.field1513[2].method7333(var9, 4);
                } else {
                    Statics.field1513[0].method7333(var9, 4);
                }
                if (class61.field788[0] == 2 && class61.field793[0] == 1) {
                    Statics.field1513[3].method7333(var9 + 15, 4);
                } else {
                    Statics.field1513[1].method7333(var9 + 15, 4);
                }
                arg0.method5782(class309.field3905, var9 + 32, 17, 16777215, -1);
                int var10 = field887 + 610;
                if (class61.field788[0] == 3 && class61.field793[0] == 0) {
                    Statics.field1513[2].method7333(var10, 4);
                } else {
                    Statics.field1513[0].method7333(var10, 4);
                }
                if (class61.field788[0] == 3 && class61.field793[0] == 1) {
                    Statics.field1513[3].method7333(var10 + 15, 4);
                } else {
                    Statics.field1513[1].method7333(var10 + 15, 4);
                }
                arg0.method5782(class309.field3906, var10 + 32, 17, 16777215, -1);
            }
            class447.method7249(field887 + 708, 4, 50, 16, 0);
            arg1.method5750(class309.field3849, field887 + 708 + 25, 16, 16777215, -1);
            field913 = -1;
            if (Statics.field4377 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class61.field791) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class61.field791) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class61.field791) {
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
                int var21 = (class61.field791 + var14 - 1) / var14;
                field915 = var21 - var13;
                if (Statics.field446 != null && field901 > 0) {
                    Statics.field446.method7333(8, Statics.field4019 / 2 - Statics.field446.field4704 / 2);
                }
                if (Statics.field1262 != null && field901 < field915) {
                    Statics.field1262.method7333(Statics.field1798 - Statics.field1262.field4703 - 8, Statics.field4019 / 2 - Statics.field1262.field4704 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field887 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field901;
                for (int var27 = var14 * var26; var27 < class61.field791 && var26 - field901 < var13; var27++) {
                    class61 var28 = Statics.field153[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field797);
                    if (var28.field797 == -1) {
                        var30 = class309.field3907;
                        var29 = false;
                    } else if (var28.field797 > 1980) {
                        var30 = class309.field3908;
                        var29 = false;
                    }
                    int var31 = 0;
                    byte var32;
                    if (var28.method1579()) {
                        if (var28.method1552()) {
                            var32 = 7;
                        } else {
                            var32 = 6;
                        }
                    } else if (var28.method1556()) {
                        var31 = 16711680;
                        if (var28.method1552()) {
                            var32 = 5;
                        } else {
                            var32 = 4;
                        }
                    } else if (var28.method1558()) {
                        if (var28.method1552()) {
                            var32 = 9;
                        } else {
                            var32 = 8;
                        }
                    } else if (var28.method1560()) {
                        if (var28.method1552()) {
                            var32 = 3;
                        } else {
                            var32 = 2;
                        }
                    } else if (var28.method1552()) {
                        var32 = 1;
                    } else {
                        var32 = 0;
                    }
                    if (class33.field229 >= var23 && class33.field230 >= var22 && class33.field229 < var11 + var23 && class33.field230 < var12 + var22 && var29) {
                        field913 = var27;
                        Statics.field4377[var32].method7414(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field4377[var32].method7361(var23, var22);
                    }
                    if (Statics.field4386 != null) {
                        Statics.field4386[(var28.method1552() ? 8 : 0) + var28.field787].method7333(var23 + 29, var22);
                    }
                    arg0.method5750(Integer.toString(var28.field796), var23 + 15, var12 / 2 + var22 + 5, var31, -1);
                    arg1.method5750(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
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
                    int var33 = arg1.method5741(Statics.field153[field913].field799) + 6;
                    int var34 = arg1.field4117 + 8;
                    int var35 = class33.field230 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class33.field230 - 25 - var34;
                    }
                    class447.method7249(class33.field229 - var33 / 2, var35, var33, var34, 16777120);
                    class447.method7262(class33.field229 - var33 / 2, var35, var33, var34, 0);
                    arg1.method5750(Statics.field153[field913].field799, class33.field229, arg1.field4117 + var35 + 4, 0, -1);
                }
            }
            Statics.field4530.method402(0, 0);
            return;
        }
        Statics.field90.method7361(field887, 0);
        Statics.field2810.method7361(field887 + 382, 0);
        Statics.field400.method7333(field887 + 382 - Statics.field400.field4703 / 2, 18);
        if (client.field501 == 0 || client.field501 == 5) {
            byte var36 = 20;
            arg0.method5750(class309.field3887, field891 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class447.method7262(field891 + 180 - 152, var37, 304, 34, 9179409);
            class447.method7262(field891 + 180 - 151, var37 + 1, 302, 32, 0);
            class447.method7249(field891 + 180 - 150, var37 + 2, field892 * 3, 30, 9179409);
            class447.method7249(field892 * 3 + (field891 + 180 - 150), var37 + 2, 300 - field892 * 3, 30, 0);
            arg0.method5750(field911, field891 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field501 == 20) {
            Statics.field894.method7333(field891 + 180 - Statics.field894.field4703 / 2, 271 - Statics.field894.field4704 / 2);
            short var38 = 201;
            arg0.method5750(field899, field891 + 180, var38, 16776960, 0);
            int var151 = var38 + 15;
            arg0.method5750(field900, field891 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            arg0.method5750(field903, field891 + 180, var152, 16776960, 0);
            int var153 = var152 + 15;
            int var154 = var153 + 7;
            if (field897 != 4 && field897 != 10) {
                arg0.method5782(class309.field3842, field891 + 180 - 110, var154, 16777215, 0);
                short var39 = 200;
                String var42;
                if (Statics.field1541.method2213()) {
                    String var40 = field914;
                    String var41 = class348.method2812('*', var40.length());
                    var42 = var41;
                } else {
                    var42 = field914;
                }
                String var44;
                for (var44 = var42; arg0.method5741(var44) > var39; var44 = var44.substring(0, var44.length() - 1)) {
                }
                arg0.method5782(class345.method5745(var44), field891 + 180 - 70, var154, 16777215, 0);
                var151 = var154 + 15;
                String var45 = field895;
                String var46 = class348.method2812('*', var45.length());
                String var47;
                for (var47 = var46; arg0.method5741(var47) > var39; var47 = var47.substring(1)) {
                }
                arg0.method5782(class309.field3633 + var47, field891 + 180 - 108, var151, 16777215, 0);
                var151 += 15;
            }
        }
        if (client.field501 == 10 || client.field501 == 11 || client.field501 == 50) {
            Statics.field894.method7333(field891, 171);
            if (field897 == 0) {
                short var48 = 251;
                arg0.method5750(class309.field3845, field891 + 180, var48, 16776960, 0);
                int var155 = var48 + 30;
                int var49 = field891 + 180 - 80;
                short var50 = 291;
                Statics.field890.method7333(var49 - 73, var50 - 20);
                arg0.method5751(class309.field3846, var49 - 73, var50 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var51 = field891 + 180 + 80;
                Statics.field890.method7333(var51 - 73, var50 - 20);
                arg0.method5751(class309.field3847, var51 - 73, var50 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field897 == 1) {
                arg0.method5750(field898, field891 + 180, 201, 16776960, 0);
                short var52 = 236;
                arg0.method5750(field899, field891 + 180, var52, 16777215, 0);
                int var156 = var52 + 15;
                arg0.method5750(field900, field891 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                arg0.method5750(field903, field891 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                int var53 = field891 + 180 - 80;
                short var54 = 321;
                Statics.field890.method7333(var53 - 73, var54 - 20);
                arg0.method5750(class309.field3597, var53, var54 + 5, 16777215, 0);
                int var55 = field891 + 180 + 80;
                Statics.field890.method7333(var55 - 73, var54 - 20);
                arg0.method5750(class309.field3849, var55, var54 + 5, 16777215, 0);
            } else if (field897 == 2) {
                short var56 = 201;
                arg0.method5750(field899, Statics.field1873, var56, 16776960, 0);
                int var159 = var56 + 15;
                arg0.method5750(field900, Statics.field1873, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg0.method5750(field903, Statics.field1873, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var162 = var161 + 7;
                arg0.method5782(class309.field3842, Statics.field1873 - 110, var162, 16777215, 0);
                short var57 = 200;
                String var60;
                if (Statics.field1541.method2213()) {
                    String var58 = field914;
                    String var59 = class348.method2812('*', var58.length());
                    var60 = var59;
                } else {
                    var60 = field914;
                }
                String var62;
                for (var62 = var60; arg0.method5741(var62) > var57; var62 = var62.substring(1)) {
                }
                arg0.method5782(class345.method5745(var62) + (field909 == 0 & client.field507 % 40 < 20 ? class93.method2498(16776960) + class93.field1246 : ""), Statics.field1873 - 70, var162, 16777215, 0);
                var159 = var162 + 15;
                String var63 = field895;
                String var64 = class348.method2812('*', var63.length());
                String var65;
                for (var65 = var64; arg0.method5741(var65) > var57; var65 = var65.substring(1)) {
                }
                arg0.method5782(class309.field3633 + var65 + (field909 == 1 & client.field507 % 40 < 20 ? class93.method2498(16776960) + class93.field1246 : ""), Statics.field1873 - 108, var159, 16777215, 0);
                var159 += 15;
                short var66 = 277;
                int var67 = Statics.field1873 + -117;
                class450 var68 = method68(client.field539, field910);
                var68.method7333(var67, var66);
                int var69 = var68.field4703 + 5 + var67;
                arg1.method5782(class309.field3850, var69, var66 + 13, 16776960, 0);
                int var70 = Statics.field1873 + 24;
                class450 var71 = method68(Statics.field1541.method2213(), field907);
                var71.method7333(var70, var66);
                int var72 = var71.field4703 + 5 + var70;
                arg1.method5782(class309.field3592, var72, var66 + 13, 16776960, 0);
                int var163 = var66 + 15;
                int var73 = Statics.field1873 - 80;
                short var74 = 321;
                Statics.field890.method7333(var73 - 73, var74 - 20);
                arg0.method5750(class309.field3848, var73, var74 + 5, 16777215, 0);
                int var75 = Statics.field1873 + 80;
                Statics.field890.method7333(var75 - 73, var74 - 20);
                arg0.method5750(class309.field3849, var75, var74 + 5, 16777215, 0);
                short var76 = 357;
                switch(field896) {
                    case 2:
                        Statics.field1574 = class309.field3844;
                        break;
                    default:
                        Statics.field1574 = class309.field3861;
                }
                Statics.field1379 = new class384(Statics.field1873, var76, arg1.method5741(Statics.field1574), 11);
                Statics.field2893 = new class384(Statics.field1873, var76, arg1.method5741(class309.field3862), 11);
                arg1.method5750(Statics.field1574, Statics.field1873, var76, 16777215, 0);
            } else if (field897 == 3) {
                short var77 = 201;
                arg0.method5750(class309.field3852, field891 + 180, var77, 16776960, 0);
                int var164 = var77 + 20;
                arg1.method5750(class309.field3853, field891 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                arg1.method5750(class309.field3891, field891 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var78 = field891 + 180;
                short var79 = 276;
                Statics.field890.method7333(var78 - 73, var79 - 20);
                arg2.method5750(class309.field3666, var78, var79 + 5, 16777215, 0);
                int var80 = field891 + 180;
                short var81 = 326;
                Statics.field890.method7333(var80 - 73, var81 - 20);
                arg2.method5750(class309.field3856, var80, var81 + 5, 16777215, 0);
            } else if (field897 == 4) {
                arg0.method5750(class309.field3665, field891 + 180, 201, 16776960, 0);
                short var82 = 236;
                arg0.method5750(field899, field891 + 180, var82, 16777215, 0);
                int var167 = var82 + 15;
                arg0.method5750(field900, field891 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                arg0.method5750(field903, field891 + 180, var168, 16777215, 0);
                int var169 = var168 + 15;
                String var84 = class309.field3808;
                String var85 = Statics.field1233;
                String var86 = class348.method2812('*', var85.length());
                arg0.method5782(var84 + var86 + (client.field507 % 40 < 20 ? class93.method2498(16776960) + class93.field1246 : ""), field891 + 180 - 108, var169, 16777215, 0);
                int var170 = var169 - 8;
                arg0.method5782(class309.field3669, field891 + 180 - 9, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg0.method5782(class309.field3601, field891 + 180 - 9, var171, 16776960, 0);
                int var87 = field891 + 180 - 9 + arg0.method5741(class309.field3601) + 15;
                int var88 = var171 - arg0.field4117;
                class450 var89;
                if (field908) {
                    var89 = Statics.field442;
                } else {
                    var89 = Statics.field2224;
                }
                var89.method7333(var87, var88);
                var167 = var171 + 15;
                int var90 = field891 + 180 - 80;
                short var91 = 321;
                Statics.field890.method7333(var90 - 73, var91 - 20);
                arg0.method5750(class309.field3597, var90, var91 + 5, 16777215, 0);
                int var92 = field891 + 180 + 80;
                Statics.field890.method7333(var92 - 73, var91 - 20);
                arg0.method5750(class309.field3849, var92, var91 + 5, 16777215, 0);
                arg1.method5750(class309.field3832, field891 + 180, var91 + 36, 255, 0);
            } else if (field897 == 5) {
                arg0.method5750(class309.field3857, field891 + 180, 201, 16776960, 0);
                short var93 = 221;
                arg2.method5750(field899, field891 + 180, var93, 16776960, 0);
                int var172 = var93 + 15;
                arg2.method5750(field900, field891 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                arg2.method5750(field903, field891 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                int var175 = var174 + 14;
                arg0.method5782(class309.field3909, field891 + 180 - 145, var175, 16777215, 0);
                short var94 = 174;
                String var97;
                if (Statics.field1541.method2213()) {
                    String var95 = field914;
                    String var96 = class348.method2812('*', var95.length());
                    var97 = var96;
                } else {
                    var97 = field914;
                }
                String var99;
                for (var99 = var97; arg0.method5741(var99) > var94; var99 = var99.substring(1)) {
                }
                arg0.method5782(class345.method5745(var99) + (client.field507 % 40 < 20 ? class93.method2498(16776960) + class93.field1246 : ""), field891 + 180 - 34, var175, 16777215, 0);
                var172 = var175 + 15;
                int var100 = field891 + 180 - 80;
                short var101 = 321;
                Statics.field890.method7333(var100 - 73, var101 - 20);
                arg0.method5750(class309.field3859, var100, var101 + 5, 16777215, 0);
                int var102 = field891 + 180 + 80;
                Statics.field890.method7333(var102 - 73, var101 - 20);
                arg0.method5750(class309.field3860, var102, var101 + 5, 16777215, 0);
                short var103 = 356;
                arg1.method5750(class309.field3862, Statics.field1873, var103, 268435455, 0);
            } else if (field897 == 6) {
                short var104 = 201;
                arg0.method5750(field899, field891 + 180, var104, 16776960, 0);
                int var176 = var104 + 15;
                arg0.method5750(field900, field891 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                arg0.method5750(field903, field891 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                int var105 = field891 + 180;
                short var106 = 321;
                Statics.field890.method7333(var105 - 73, var106 - 20);
                arg0.method5750(class309.field3860, var105, var106 + 5, 16777215, 0);
            } else if (field897 == 7) {
                if (Statics.field505 && !client.field500) {
                    short var107 = 201;
                    arg0.method5750(field899, Statics.field1873, var107, 16776960, 0);
                    int var179 = var107 + 15;
                    arg0.method5750(field900, Statics.field1873, var179, 16776960, 0);
                    int var180 = var179 + 15;
                    arg0.method5750(field903, Statics.field1873, var180, 16776960, 0);
                    int var108 = Statics.field1873 - 150;
                    int var181 = var180 + 10;
                    for (int var109 = 0; var109 < 8; var109++) {
                        Statics.field890.method7336(var108, var181, 30, 40);
                        boolean var110 = field904 == var109 & client.field507 % 40 < 20;
                        arg0.method5782((field905[var109] == null ? "" : field905[var109]) + (var110 ? class93.method2498(16776960) + class93.field1246 : ""), var108 + 10, var181 + 27, 16777215, 0);
                        if (var109 == 1 || var109 == 3) {
                            var108 += 50;
                            arg0.method5782(class345.method5745("/"), var108 - 13, var181 + 27, 16777215, 0);
                        } else {
                            var108 += 35;
                        }
                    }
                    int var111 = Statics.field1873 - 80;
                    short var112 = 321;
                    Statics.field890.method7333(var111 - 73, var112 - 20);
                    arg0.method5750("Submit", var111, var112 + 5, 16777215, 0);
                    int var113 = Statics.field1873 + 80;
                    Statics.field890.method7333(var113 - 73, var112 - 20);
                    arg0.method5750(class309.field3849, var113, var112 + 5, 16777215, 0);
                } else {
                    short var114 = 216;
                    arg0.method5750(class309.field3888, field891 + 180, var114, 16776960, 0);
                    int var182 = var114 + 15;
                    arg2.method5750(class309.field3794, field891 + 180, var182, 16776960, 0);
                    int var183 = var182 + 15;
                    arg2.method5750(class309.field3890, field891 + 180, var183, 16776960, 0);
                    int var184 = var183 + 15;
                    int var115 = field891 + 180 - 80;
                    short var116 = 321;
                    Statics.field890.method7333(var115 - 73, var116 - 20);
                    arg0.method5750(class309.field3889, var115, var116 + 5, 16777215, 0);
                    int var117 = field891 + 180 + 80;
                    Statics.field890.method7333(var117 - 73, var116 - 20);
                    arg0.method5750(class309.field3860, var117, var116 + 5, 16777215, 0);
                }
            } else if (field897 == 8) {
                short var118 = 216;
                arg0.method5750(class309.field3729, field891 + 180, var118, 16776960, 0);
                int var185 = var118 + 15;
                arg2.method5750(class309.field3793, field891 + 180, var185, 16776960, 0);
                int var186 = var185 + 15;
                arg2.method5750(class309.field3731, field891 + 180, var186, 16776960, 0);
                int var187 = var186 + 15;
                int var119 = field891 + 180 - 80;
                short var120 = 321;
                Statics.field890.method7333(var119 - 73, var120 - 20);
                arg0.method5750(class309.field3591, var119, var120 + 5, 16777215, 0);
                int var121 = field891 + 180 + 80;
                Statics.field890.method7333(var121 - 73, var120 - 20);
                arg0.method5750(class309.field3860, var121, var120 + 5, 16777215, 0);
            } else if (field897 == 9) {
                short var122 = 221;
                arg0.method5750(field899, field891 + 180, var122, 16776960, 0);
                int var188 = var122 + 25;
                arg0.method5750(field900, field891 + 180, var188, 16776960, 0);
                int var189 = var188 + 25;
                arg0.method5750(field903, field891 + 180, var189, 16776960, 0);
                int var123 = field891 + 180;
                short var124 = 311;
                Statics.field890.method7333(var123 - 73, var124 - 20);
                arg0.method5750(class309.field3666, var123, var124 + 5, 16777215, 0);
            } else if (field897 == 10) {
                int var125 = field891 + 180;
                short var126 = 209;
                arg0.method5750(class309.field3845, field891 + 180, var126, 16776960, 0);
                int var190 = var126 + 20;
                Statics.field3497.method7333(var125 - 109, var190);
                Statics.field2888.method7333(var125 - 48, var190 + 18);
            } else if (field897 == 12) {
                int var127 = Statics.field1873;
                short var128 = 216;
                arg2.method5750(class309.field3892, var127, var128, 16777215, 0);
                int var191 = var128 + 17;
                arg2.method5750(class309.field3893, var127, var191, 16777215, 0);
                int var192 = var191 + 17;
                arg2.method5750(class309.field3894, var127, var192, 16777215, 0);
                int var193 = var192 + 17;
                arg2.method5750(class309.field3692, var127, var193, 16777215, 0);
                int var129 = Statics.field1873 - 80;
                short var130 = 311;
                Statics.field890.method7333(var129 - 73, var130 - 20);
                arg0.method5750(class309.field3898, var129, var130 + 5, 16777215, 0);
                int var131 = Statics.field1873 + 80;
                Statics.field890.method7333(var131 - 73, var130 - 20);
                arg0.method5750(class309.field3816, var131, var130 + 5, 16777215, 0);
            } else if (field897 == 13) {
                short var132 = 231;
                arg2.method5750(class309.field3718, field891 + 180, var132, 16777215, 0);
                int var194 = var132 + 20;
                arg2.method5750(class309.field3662, field891 + 180, var194, 16777215, 0);
                int var133 = field891 + 180;
                short var134 = 311;
                Statics.field890.method7333(var133 - 73, var134 - 20);
                arg0.method5750(class309.field3860, var133, var134 + 5, 16777215, 0);
            } else if (field897 == 14) {
                short var135 = 201;
                String var136 = "";
                String var137 = "";
                String var138 = "";
                switch(field902) {
                    case 0:
                        var136 = class309.field3645;
                        var137 = class309.field3646;
                        var138 = class309.field3694;
                        break;
                    case 1:
                        var136 = class309.field3684;
                        var137 = class309.field3685;
                        var138 = class309.field3686;
                        break;
                    default:
                        method2372(false);
                }
                arg0.method5750(var136, field891 + 180, var135, 16776960, 0);
                int var195 = var135 + 15;
                arg2.method5750(var137, field891 + 180, var195, 16776960, 0);
                int var196 = var195 + 15;
                arg2.method5750(var138, field891 + 180, var196, 16776960, 0);
                int var197 = var196 + 15;
                int var139 = field891 + 180;
                short var140 = 276;
                Statics.field890.method7333(var139 - 73, var140 - 20);
                arg0.method5750(class309.field3904, var139, var140 + 5, 16777215, 0);
                int var141 = field891 + 180;
                short var142 = 326;
                Statics.field890.method7333(var141 - 73, var142 - 20);
                arg0.method5750(class309.field3860, var141, var142 + 5, 16777215, 0);
            } else if (field897 == 24) {
                short var143 = 221;
                arg0.method5750(field899, field891 + 180, var143, 16777215, 0);
                int var198 = var143 + 15;
                arg0.method5750(field900, field891 + 180, var198, 16777215, 0);
                int var199 = var198 + 15;
                arg0.method5750(field903, field891 + 180, var199, 16777215, 0);
                int var200 = var199 + 15;
                int var144 = field891 + 180;
                short var145 = 301;
                Statics.field890.method7333(var144 - 73, var145 - 20);
                arg0.method5750(class309.field3595, var144, var145 + 5, 16777215, 0);
            }
        }
        if (client.field501 >= 10) {
            int[] var146 = new int[4];
            class447.method7313(var146);
            class447.method7250(field887, 0, field887 + 765, Statics.field4019);
            Statics.field4102.method2105(field887 - 22, client.field507);
            Statics.field4102.method2105(field887 + 765 + 22 - 128, client.field507);
            class447.method7253(var146);
        }
        Statics.field1247[Statics.field1541.method2175() ? 1 : 0].method7333(field887 + 765 - 40, 463);
        if (client.field501 <= 5 || Statics.field3523 != class331.field4055) {
            return;
        }
        if (Statics.field1570 == null) {
            Statics.field1570 = class452.method6221(Statics.field1639, "sl_button", "");
            return;
        }
        int var147 = field887 + 5;
        short var148 = 463;
        byte var149 = 100;
        byte var150 = 35;
        Statics.field1570.method7333(var147, var148);
        arg0.method5750(class309.field3769 + " " + client.field723, var149 / 2 + var147, var150 / 2 + var148 - 2, 16777215, 0);
        if (Statics.field3315 == null) {
            arg1.method5750(class309.field3910, var149 / 2 + var147, var150 / 2 + var148 + 12, 16777215, 0);
        } else {
            arg1.method5750(class309.field3851, var149 / 2 + var147, var150 / 2 + var148 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("b.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method13(String arg0, String arg1, String arg2) {
        field899 = arg0;
        field900 = arg1;
        field903 = arg2;
    }

    @ObfuscatedName("oj.k(Lbb;B)V")
    public static void method6525(class61 arg0) {
        if (arg0.method1552() != client.field495) {
            client.field495 = arg0.method1552();
            class189.method2808(arg0.method1552());
        }
        if (client.field668 != arg0.field792) {
            Statics.method4662(Statics.field1639, arg0.field792);
        }
        Statics.field86 = arg0.field795;
        client.field723 = arg0.field796;
        client.field668 = arg0.field792;
        Statics.field951 = client.field494 == 0 ? 43594 : arg0.field796 + 40000;
        Statics.field1358 = client.field494 == 0 ? 443 : arg0.field796 + 50000;
        Statics.field4046 = Statics.field951;
    }

    @ObfuscatedName("jo.d(II)V")
    public static void method4684(int arg0) {
        method6209(14);
        field902 = arg0;
    }

    @ObfuscatedName("ac.m(I)V")
    public static void method742() {
        if (class61.method2282()) {
            field886 = true;
            field901 = 0;
            field915 = 0;
        }
    }

    @ObfuscatedName("ng.u(IB)V")
    public static void method6209(int arg0) {
        if (field897 != arg0) {
            field897 = arg0;
        }
    }
}
