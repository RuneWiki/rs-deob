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
import java.util.Random;

@ObfuscatedName("cz")
public class class72 {

    @ObfuscatedName("cz.aw")
    public static int field907 = 0;

    @ObfuscatedName("cz.ak")
    public static int field896 = field907 + 202;

    @ObfuscatedName("cz.ad")
    public static int field897 = 10;

    @ObfuscatedName("cz.ae")
    public static String field902 = "";

    @ObfuscatedName("cz.ba")
    public static int field899 = -1;

    @ObfuscatedName("cz.bp")
    public static int field917 = 1;

    @ObfuscatedName("cz.ce")
    public static int field898 = 0;

    @ObfuscatedName("cz.ci")
    public static String field904 = "";

    @ObfuscatedName("cz.cs")
    public static String field905 = "";

    @ObfuscatedName("cz.cc")
    public static String field906 = "";

    @ObfuscatedName("cz.cn")
    public static String field890 = "";

    @ObfuscatedName("cz.ca")
    public static String field930 = "";

    @ObfuscatedName("cz.cu")
    public static String field909 = "";

    @ObfuscatedName("cz.cq")
    public static int field910 = 0;

    @ObfuscatedName("cz.cm")
    public static String[] field911 = new String[8];

    @ObfuscatedName("cz.cy")
    public static String field912 = "";

    @ObfuscatedName("cz.cj")
    public static boolean field891 = false;

    @ObfuscatedName("cz.ch")
    public static boolean field903 = false;

    @ObfuscatedName("cz.cd")
    public static boolean field915 = true;

    @ObfuscatedName("cz.dm")
    public static int field923 = 0;

    @ObfuscatedName("cz.dw")
    public static String field918 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cz.dc")
    public static String field892 = "1234567890";

    @ObfuscatedName("cz.di")
    public static boolean field919 = false;

    @ObfuscatedName("cz.de")
    public static int field920 = -1;

    @ObfuscatedName("cz.dh")
    public static int field921 = 0;

    @ObfuscatedName("cz.dp")
    public static int field922 = 0;

    @ObfuscatedName("cz.db")
    public static long field895;

    @ObfuscatedName("cz.df")
    public static long field924;

    @ObfuscatedName("cz.dq")
    public static String[] field925;

    @ObfuscatedName("cz.dd")
    public static String[] field926;

    @ObfuscatedName("cz.dj")
    public static String[] field927;

    static {
        new DecimalFormat("##0.00");
        new class130();
        field895 = -1L;
        field924 = -1L;
        field925 = new String[] { "title.jpg" };
        field926 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field927 = new String[] { "logo_speedrunning" };
    }

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.af(Lnm;I)I")
    public static int method1158(class344 arg0) {
        int var1 = field926.length + field925.length;
        String[] var2 = field927;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6086(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.an(Lnm;Lnm;ZIB)V")
    public static void method359(class344 arg0, class344 arg1, boolean arg2, int arg3) {
        if (!Statics.field63) {
            if (arg3 == 0) {
                method2004(arg2);
            } else {
                method2964(arg3);
            }
            class499.method8576();
            byte[] var4 = arg0.method6089("title.jpg", "");
            Statics.field1498 = class31.method5990(var4);
            Statics.field2125 = Statics.field1498.method8678();
            int var5 = client.field489;
            if ((var5 & 0x20000000) != 0) {
                Statics.field123 = Statics.method5194(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) != 0) {
                Statics.field123 = Statics.method5194(arg1, "logo_seasonal_mode", "");
            } else if ((var5 & 0x100) == 0) {
                Statics.field123 = Statics.method5194(arg1, "logo", "");
            } else {
                Statics.field123 = Statics.method5194(arg1, "logo_speedrunning", "");
            }
            Statics.field914 = Statics.method5194(arg1, "titlebox", "");
            Statics.field3362 = Statics.method5194(arg1, "titlebutton", "");
            Statics.field4718 = Statics.method5194(arg1, "titlebutton_large", "");
            Statics.field4399 = Statics.method5194(arg1, "play_now_text", "");
            Statics.method5194(arg1, "titlebutton_wide42,1", "");
            Statics.field4534 = class504.method5758(arg1, "runes", "");
            Statics.field1704 = class504.method5758(arg1, "title_mute", "");
            Statics.field893 = Statics.method5194(arg1, "options_radio_buttons,0", "");
            Statics.field894 = Statics.method5194(arg1, "options_radio_buttons,4", "");
            Statics.field1767 = Statics.method5194(arg1, "options_radio_buttons,2", "");
            Statics.field908 = Statics.method5194(arg1, "options_radio_buttons,6", "");
            Statics.field993 = Statics.field893.field5081;
            Statics.field2097 = Statics.field893.field5082;
            Statics.field1471 = new class93(Statics.field4534);
            if (arg2) {
                field930 = "";
                field909 = "";
                field911 = new String[8];
                field910 = 0;
            }
            Statics.field2331 = 0;
            Statics.field1374 = "";
            field915 = true;
            field919 = false;
            if (Statics.field112.method2412()) {
                class298.field3389 = 1;
                Statics.field3388 = null;
                Statics.field4411 = -1;
                Statics.field1913 = -1;
                Statics.field1324 = 0;
                Statics.field1459 = false;
                Statics.field1789 = 2;
            } else {
                class298.method5132(2, Statics.field4548, "scape main", "", 255, false);
            }
            class345.method3314(false);
            Statics.field63 = true;
            field907 = (Statics.field211 - 765) / 2;
            field896 = field907 + 202;
            Statics.field1671 = field896 + 180;
            Statics.field1498.method8688(field907, 0);
            Statics.field2125.method8688(field907 + 382, 0);
            Statics.field123.method8656(field907 + 382 - Statics.field123.field5081 / 2, 18);
        } else if (arg3 == 4) {
            method2964(4);
        }
    }

    @ObfuscatedName("am.aw(I)Ljava/lang/String;")
    public static String method280() {
        return Statics.field112.method2328() ? class372.method5966(field930) : field930;
    }

    @ObfuscatedName("je.ac(I)V")
    public static void method4619() {
        if (field930 != null && field930.length() > 0) {
            return;
        }
        if (Statics.field112.method2351() == null) {
            client.field540 = false;
        } else {
            field930 = Statics.field112.method2351();
            client.field540 = true;
        }
    }

    @ObfuscatedName("dv.au(I)V")
    public static void method2237() {
        if (!Statics.field63) {
            return;
        }
        Statics.field914 = null;
        Statics.field3362 = null;
        Statics.field4534 = null;
        Statics.field1498 = null;
        Statics.field2125 = null;
        Statics.field123 = null;
        Statics.field1704 = null;
        Statics.field893 = null;
        Statics.field1767 = null;
        Statics.field4945 = null;
        Statics.field88 = null;
        Statics.field120 = null;
        Statics.field803 = null;
        Statics.field3727 = null;
        Statics.field1471.method2320();
        class298.field3389 = 1;
        Statics.field3388 = null;
        Statics.field4411 = -1;
        Statics.field1913 = -1;
        Statics.field1324 = 0;
        Statics.field1459 = false;
        Statics.field1789 = 2;
        class345.method3314(true);
        Statics.field63 = false;
    }

    @ObfuscatedName("hx.ab(Lbm;Lon;Lon;I)V")
    public static void method3442(class35 arg0, class379 arg1, class379 arg2) {
        if (field919) {
            method503(arg0);
            return;
        }
        if ((class36.field252 == 1 || !Statics.field4941 && class36.field252 == 4) && class36.field250 >= field907 + 765 - 50 && class36.field251 >= 453) {
            Statics.field112.method2409(!Statics.field112.method2412());
            if (Statics.field112.method2412()) {
                class298.method3547();
            } else {
                Statics.method8108(Statics.field4548, "scape main", "", 255, false);
            }
        }
        if (client.field499 == 5) {
            return;
        }
        if (field895 == -1L) {
            field895 = class294.method2504() + 1000L;
        }
        long var3 = class294.method2504();
        boolean var5;
        if (client.field784 == null || client.field785 >= client.field784.size()) {
            var5 = true;
        } else {
            while (true) {
                if (client.field785 >= client.field784.size()) {
                    var5 = true;
                    break;
                }
                class80 var6 = (class80) client.field784.get(client.field785);
                if (!var6.method2122()) {
                    var5 = false;
                    break;
                }
                client.field785++;
            }
        }
        if (var5 && field924 == -1L) {
            field924 = var3;
            if (field924 > field895) {
                field895 = field924;
            }
        }
        if (client.field499 != 10 && client.field499 != 11) {
            return;
        }
        if (Statics.field1736 == class359.field4317) {
            if (class36.field252 == 1 || !Statics.field4941 && class36.field252 == 4) {
                int var7 = field907 + 5;
                short var8 = 463;
                byte var9 = 100;
                byte var10 = 35;
                if (class36.field250 >= var7 && class36.field250 <= var7 + var9 && class36.field251 >= var8 && class36.field251 <= var8 + var10) {
                    method2006();
                    return;
                }
            }
            if (Statics.field60 != null) {
                method2006();
            }
        }
        int var11 = class36.field252;
        int var12 = class36.field250;
        int var13 = class36.field251;
        if (var11 == 0) {
            var12 = class36.field242;
            var13 = class36.field243;
        }
        if (!Statics.field4941 && var11 == 4) {
            var11 = 1;
        }
        class208 var14 = client.field722;
        class208 var15 = var14;
        if (field898 == 0) {
            boolean var16 = false;
            while (var15.method3883()) {
                if (var15.field2363 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field1671 - 80;
            short var18 = 291;
            if (var11 == 1 && var12 >= var17 - 75 && var12 <= var17 + 75 && var13 >= var18 - 20 && var13 <= var18 + 20) {
                class32.method7266(client.method3335("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field1671 + 80;
            if (var11 == 1 && var12 >= var19 - 75 && var12 <= var19 + 75 && var13 >= var18 - 20 && var13 <= var18 + 20 || var16) {
                if ((client.field489 & 0x2000000) != 0) {
                    field904 = "";
                    field905 = class337.field3871;
                    field906 = class337.field4075;
                    field890 = class337.field4076;
                    method2964(1);
                    if (client.field540 && field930 != null && field930.length() > 0) {
                        field923 = 1;
                    } else {
                        field923 = 0;
                    }
                } else if ((client.field489 & 0x4) != 0) {
                    if ((client.field489 & 0x400) == 0) {
                        field905 = class337.field3872;
                        field906 = class337.field3909;
                        field890 = class337.field3908;
                    } else {
                        field905 = class337.field4093;
                        field906 = class337.field3935;
                        field890 = class337.field4073;
                    }
                    field904 = class337.field4074;
                    method2964(1);
                    if (client.field540 && field930 != null && field930.length() > 0) {
                        field923 = 1;
                    } else {
                        field923 = 0;
                    }
                } else if ((client.field489 & 0x400) == 0) {
                    method42(false);
                } else {
                    field905 = class337.field4068;
                    field906 = class337.field4072;
                    field890 = class337.field4083;
                    field904 = class337.field4074;
                    method2964(1);
                    if (client.field540 && field930 != null && field930.length() > 0) {
                        field923 = 1;
                    } else {
                        field923 = 0;
                    }
                }
            }
        } else if (field898 == 1) {
            while (true) {
                if (!var15.method3883()) {
                    int var20 = Statics.field1671 - 80;
                    short var21 = 321;
                    if (var11 == 1 && var12 >= var20 - 75 && var12 <= var20 + 75 && var13 >= var21 - 20 && var13 <= var21 + 20) {
                        method42(false);
                    }
                    int var22 = Statics.field1671 + 80;
                    if (var11 == 1 && var12 >= var22 - 75 && var12 <= var22 + 75 && var13 >= var21 - 20 && var13 <= var21 + 20) {
                        method2964(0);
                    }
                    break;
                }
                if (var15.field2363 == 84) {
                    method42(false);
                } else if (var15.field2363 == 13) {
                    method2964(0);
                }
            }
        } else if (field898 == 2) {
            short var23 = 201;
            int var198 = var23 + 52;
            if (var11 == 1 && var13 >= var198 - 12 && var13 < var198 + 2) {
                field923 = 0;
            }
            var198 += 15;
            if (var11 == 1 && var13 >= var198 - 12 && var13 < var198 + 2) {
                field923 = 1;
            }
            var198 += 15;
            short var24 = 361;
            if (Statics.field1296 != null) {
                int var25 = Statics.field1296.field4648 / 2;
                if (var11 == 1 && var12 >= Statics.field1296.field4650 - var25 && var12 <= Statics.field1296.field4650 + var25 && var13 >= var24 - 15 && var13 < var24) {
                    switch(field917) {
                        case 1:
                            method3873(class337.field3915, class337.field4067, class337.field4115);
                            method2964(5);
                            return;
                        case 2:
                            class32.method7266("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field1671 - 80;
            short var27 = 321;
            if (var11 == 1 && var12 >= var26 - 75 && var12 <= var26 + 75 && var13 >= var27 - 20 && var13 <= var27 + 20) {
                field930 = field930.trim();
                if (field930.length() == 0) {
                    method3873(class337.field3957, class337.field3958, class337.field3959);
                    return;
                }
                if (field909.length() == 0) {
                    method3873(class337.field3984, class337.field4087, class337.field3962);
                    return;
                }
                method3873(class337.field4079, class337.field3910, class337.field3890);
                client.method173(false);
                client.method3032(20);
                return;
            }
            int var28 = field896 + 180 + 80;
            if (var11 == 1 && var12 >= var28 - 75 && var12 <= var28 + 75 && var13 >= var27 - 20 && var13 <= var27 + 20) {
                method2964(0);
                field930 = "";
                field909 = "";
                Statics.field2331 = 0;
                Statics.field1374 = "";
                field915 = true;
            }
            int var29 = Statics.field1671 + -117;
            short var30 = 277;
            field891 = var12 >= var29 && var12 < Statics.field993 + var29 && var13 >= var30 && var13 < Statics.field2097 + var30;
            if (var11 == 1 && field891) {
                client.field540 = !client.field540;
                if (!client.field540 && Statics.field112.method2351() != null) {
                    Statics.field112.method2344((String) null);
                }
            }
            int var31 = Statics.field1671 + 24;
            short var32 = 277;
            field903 = var12 >= var31 && var12 < Statics.field993 + var31 && var13 >= var32 && var13 < Statics.field2097 + var32;
            if (var11 == 1 && field903) {
                Statics.field112.method2327(!Statics.field112.method2328());
                if (!Statics.field112.method2328()) {
                    field930 = "";
                    Statics.field112.method2344((String) null);
                    if (client.field540 && field930 != null && field930.length() > 0) {
                        field923 = 1;
                    } else {
                        field923 = 0;
                    }
                }
            }
            label1336: while (true) {
                Transferable var38;
                int var39;
                do {
                    while (true) {
                        label1300: do {
                            while (true) {
                                while (var15.method3883()) {
                                    if (var15.field2363 == 13) {
                                        method2964(0);
                                        field930 = "";
                                        field909 = "";
                                        Statics.field2331 = 0;
                                        Statics.field1374 = "";
                                        field915 = true;
                                    } else {
                                        if (field923 != 0) {
                                            continue label1300;
                                        }
                                        char var33 = var15.field2362;
                                        for (int var34 = 0; var34 < field918.length() && var33 != field918.charAt(var34); var34++) {
                                        }
                                        if (var15.field2363 == 85 && field930.length() > 0) {
                                            field930 = field930.substring(0, field930.length() - 1);
                                        }
                                        if (var15.field2363 == 84 || var15.field2363 == 80) {
                                            field923 = 1;
                                        }
                                        char var35 = var15.field2362;
                                        boolean var36 = field918.indexOf(var35) != -1;
                                        if (var36 && field930.length() < 320) {
                                            field930 = field930 + var15.field2362;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field923 != 1);
                        if (var15.field2363 == 85 && field909.length() > 0) {
                            field909 = field909.substring(0, field909.length() - 1);
                        } else if (var15.field2363 == 84 || var15.field2363 == 80) {
                            field923 = 0;
                            if (var15.field2363 == 84) {
                                field930 = field930.trim();
                                if (field930.length() == 0) {
                                    method3873(class337.field3957, class337.field3958, class337.field3959);
                                    return;
                                }
                                if (field909.length() == 0) {
                                    method3873(class337.field3984, class337.field4087, class337.field3962);
                                    return;
                                }
                                method3873(class337.field4079, class337.field3910, class337.field3890);
                                client.method173(false);
                                client.method3032(20);
                                return;
                            }
                        }
                        if ((var15.method3888(82) || var15.method3888(87)) && var15.field2363 == 67) {
                            Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var38 = var37.getContents(Statics.field466);
                            var39 = 20 - field909.length();
                            break;
                        }
                        if (class370.method707(var15.field2362)) {
                            char var47 = var15.field2362;
                            boolean var48 = field918.indexOf(var47) != -1;
                            if (var48 && field909.length() < 20) {
                                field909 = field909 + var15.field2362;
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
                            field909 = field909 + var40.substring(0, var41);
                            continue label1336;
                        }
                        if (!class370.method707(var40.charAt(var42))) {
                            break;
                        }
                        char var43 = var40.charAt(var42);
                        boolean var44 = field918.indexOf(var43) != -1;
                        if (!var44) {
                            break;
                        }
                        var42++;
                    }
                    method2964(3);
                    return;
                } catch (UnsupportedFlavorException var196) {
                } catch (IOException var197) {
                }
            }
        } else if (field898 == 3) {
            int var49 = field896 + 180;
            short var50 = 241;
            class421 var51 = arg1.method6766(25, class337.field4100.length() - 34, class337.field4100, var49, var50);
            if (var11 == 1 && var51.method7372(var12, var13)) {
                class32.method7266(class337.field4161, true, false);
            }
            int var52 = field896 + 180;
            short var53 = 276;
            if (var11 == 1 && var12 >= var52 - 75 && var12 <= var52 + 75 && var13 >= var53 - 20 && var13 <= var53 + 20) {
                method2004(false);
            }
            int var54 = field896 + 180;
            short var55 = 326;
            if (var11 == 1 && var12 >= var54 - 75 && var12 <= var54 + 75 && var13 >= var55 - 20 && var13 <= var55 + 20) {
                method3873(class337.field3915, class337.field4067, class337.field4115);
                method2964(5);
                return;
            }
        } else if (field898 == 4) {
            int var56 = field896 + 180 - 80;
            short var57 = 321;
            if (var11 == 1 && var12 >= var56 - 75 && var12 <= var56 + 75 && var13 >= var57 - 20 && var13 <= var57 + 20) {
                Statics.field1374.trim();
                if (Statics.field1374.length() != 6) {
                    method3873(class337.field3850, class337.field3877, class337.field3878);
                    return;
                }
                Statics.field2331 = Integer.parseInt(Statics.field1374);
                Statics.field1374 = "";
                client.method173(true);
                method3873(class337.field4079, class337.field3910, class337.field3890);
                client.method3032(20);
                return;
            }
            if (var11 == 1 && var12 >= field896 + 180 - 9 && var12 <= field896 + 180 + 130 && var13 >= 263 && var13 <= 296) {
                field915 = !field915;
            }
            if (var11 == 1 && var12 >= field896 + 180 - 34 && var12 <= field896 + 180 + 34 && var13 >= 351 && var13 <= 363) {
                class32.method7266(client.method3335("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var58 = field896 + 180 + 80;
            if (var11 == 1 && var12 >= var58 - 75 && var12 <= var58 + 75 && var13 >= var57 - 20 && var13 <= var57 + 20) {
                method2964(0);
                field930 = "";
                field909 = "";
                Statics.field2331 = 0;
                Statics.field1374 = "";
            }
            while (var15.method3883()) {
                boolean var59 = false;
                for (int var60 = 0; var60 < field892.length(); var60++) {
                    if (var15.field2362 == field892.charAt(var60)) {
                        var59 = true;
                        break;
                    }
                }
                if (var15.field2363 == 13) {
                    method2964(0);
                    field930 = "";
                    field909 = "";
                    Statics.field2331 = 0;
                    Statics.field1374 = "";
                } else {
                    if (var15.field2363 == 85 && Statics.field1374.length() > 0) {
                        Statics.field1374 = Statics.field1374.substring(0, Statics.field1374.length() - 1);
                    }
                    if (var15.field2363 == 84) {
                        Statics.field1374.trim();
                        if (Statics.field1374.length() != 6) {
                            method3873(class337.field3850, class337.field3877, class337.field3878);
                            return;
                        }
                        Statics.field2331 = Integer.parseInt(Statics.field1374);
                        Statics.field1374 = "";
                        client.method173(true);
                        method3873(class337.field4079, class337.field3910, class337.field3890);
                        client.method3032(20);
                        return;
                    }
                    if (var59 && Statics.field1374.length() < 6) {
                        Statics.field1374 = Statics.field1374 + var15.field2362;
                    }
                }
            }
        } else if (field898 == 5) {
            int var61 = field896 + 180 - 80;
            short var62 = 321;
            if (var11 == 1 && var12 >= var61 - 75 && var12 <= var61 + 75 && var13 >= var62 - 20 && var13 <= var62 + 20) {
                field930 = field930.trim();
                if (field930.length() == 0) {
                    method3873(class337.field3915, class337.field4067, class337.field4115);
                } else {
                    long var63 = class69.method5002();
                    byte var65;
                    if (var63 == 0L) {
                        var65 = 5;
                    } else {
                        String var66 = field930;
                        Random var67 = new Random();
                        class489 var68 = new class489(128);
                        class489 var69 = new class489(128);
                        int[] var70 = new int[] { var67.nextInt(), var67.nextInt(), (int) (var63 >> 32), (int) var63 };
                        var68.method8285(10);
                        for (int var71 = 0; var71 < 4; var71++) {
                            var68.method8234(var67.nextInt());
                        }
                        var68.method8234(var70[0]);
                        var68.method8234(var70[1]);
                        var68.method8230(var63);
                        var68.method8230(0L);
                        for (int var72 = 0; var72 < 4; var72++) {
                            var68.method8234(var67.nextInt());
                        }
                        var68.method8275(class69.field875, class69.field872);
                        var69.method8285(10);
                        for (int var73 = 0; var73 < 3; var73++) {
                            var69.method8234(var67.nextInt());
                        }
                        var69.method8230(var67.nextLong());
                        var69.method8444(var67.nextLong());
                        client.method6891(var69);
                        var69.method8230(var67.nextLong());
                        var69.method8275(class69.field875, class69.field872);
                        int var74 = class489.method2043(var66);
                        if (var74 % 8 != 0) {
                            var74 += 8 - var74 % 8;
                        }
                        class489 var75 = new class489(var74);
                        var75.method8238(var66);
                        var75.field4989 = var74;
                        var75.method8491(var70);
                        class489 var76 = new class489(var75.field4989 + var69.field4989 + var68.field4989 + 5);
                        var76.method8285(2);
                        var76.method8285(var68.field4989);
                        var76.method8476(var68.field4991, 0, var68.field4989);
                        var76.method8285(var69.field4989);
                        var76.method8476(var69.field4991, 0, var69.field4989);
                        var76.method8232(var75.field4989);
                        var76.method8476(var75.field4991, 0, var75.field4989);
                        String var77 = class371.method4953(var76.field4991);
                        byte var84;
                        try {
                            URL var78 = new URL(client.method3335("services", false) + "m=accountappeal/login.ws");
                            URLConnection var79 = var78.openConnection();
                            var79.setDoInput(true);
                            var79.setDoOutput(true);
                            var79.setConnectTimeout(5000);
                            OutputStreamWriter var80 = new OutputStreamWriter(var79.getOutputStream());
                            var80.write("data2=" + class515.method7046(var77) + "&dest=" + class515.method7046("passwordchoice.ws"));
                            var80.flush();
                            InputStream var81 = var79.getInputStream();
                            class489 var82 = new class489(new byte[1000]);
                            while (true) {
                                int var83 = var81.read(var82.field4991, var82.field4989, 1000 - var82.field4989);
                                if (var83 == -1) {
                                    var80.close();
                                    var81.close();
                                    String var85 = new String(var82.field4991);
                                    if (var85.startsWith("OFFLINE")) {
                                        var84 = 4;
                                    } else if (var85.startsWith("WRONG")) {
                                        var84 = 7;
                                    } else if (var85.startsWith("RELOAD")) {
                                        var84 = 3;
                                    } else if (var85.startsWith("Not permitted for social network accounts.")) {
                                        var84 = 6;
                                    } else {
                                        var82.method8272(var70);
                                        while (var82.field4989 > 0 && var82.field4991[var82.field4989 - 1] == 0) {
                                            var82.field4989--;
                                        }
                                        String var86 = new String(var82.field4991, 0, var82.field4989);
                                        if (class69.method2524(var86)) {
                                            class32.method7266(var86, true, false);
                                            var84 = 2;
                                        } else {
                                            var84 = 5;
                                        }
                                    }
                                    break;
                                }
                                var82.field4989 += var83;
                                if (var82.field4989 >= 1000) {
                                    var84 = 5;
                                    break;
                                }
                            }
                        } catch (Throwable var192) {
                            var192.printStackTrace();
                            var84 = 5;
                        }
                        var65 = var84;
                    }
                    switch(var65) {
                        case 2:
                            method3873(class337.field4009, class337.field4033, class337.field4118);
                            method2964(6);
                            break;
                        case 3:
                            method3873(class337.field4119, class337.field4120, class337.field3992);
                            break;
                        case 4:
                            method3873(class337.field4122, class337.field4123, class337.field4124);
                            break;
                        case 5:
                            method3873(class337.field4125, class337.field4126, class337.field4127);
                            break;
                        case 6:
                            method3873(class337.field4086, class337.field3963, class337.field4130);
                            break;
                        case 7:
                            method3873(class337.field4131, class337.field4132, class337.field4133);
                    }
                }
                return;
            }
            int var88 = field896 + 180 + 80;
            if (var11 == 1 && var12 >= var88 - 75 && var12 <= var88 + 75 && var13 >= var62 - 20 && var13 <= var62 + 20) {
                method42(true);
            }
            short var89 = 361;
            if (Statics.field104 != null) {
                int var90 = Statics.field104.field4648 / 2;
                if (var11 == 1 && var12 >= Statics.field104.field4650 - var90 && var12 <= Statics.field104.field4650 + var90 && var13 >= var89 - 15 && var13 < var89) {
                    class32.method7266(client.method3335("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var15.method3883()) {
                boolean var91 = false;
                for (int var92 = 0; var92 < field918.length(); var92++) {
                    if (var15.field2362 == field918.charAt(var92)) {
                        var91 = true;
                        break;
                    }
                }
                if (var15.field2363 == 13) {
                    method42(true);
                } else {
                    if (var15.field2363 == 85 && field930.length() > 0) {
                        field930 = field930.substring(0, field930.length() - 1);
                    }
                    if (var15.field2363 == 84) {
                        field930 = field930.trim();
                        if (field930.length() == 0) {
                            method3873(class337.field3915, class337.field4067, class337.field4115);
                        } else {
                            long var93 = class69.method5002();
                            byte var95;
                            if (var93 == 0L) {
                                var95 = 5;
                            } else {
                                String var96 = field930;
                                Random var97 = new Random();
                                class489 var98 = new class489(128);
                                class489 var99 = new class489(128);
                                int[] var100 = new int[] { var97.nextInt(), var97.nextInt(), (int) (var93 >> 32), (int) var93 };
                                var98.method8285(10);
                                for (int var101 = 0; var101 < 4; var101++) {
                                    var98.method8234(var97.nextInt());
                                }
                                var98.method8234(var100[0]);
                                var98.method8234(var100[1]);
                                var98.method8230(var93);
                                var98.method8230(0L);
                                for (int var102 = 0; var102 < 4; var102++) {
                                    var98.method8234(var97.nextInt());
                                }
                                var98.method8275(class69.field875, class69.field872);
                                var99.method8285(10);
                                for (int var103 = 0; var103 < 3; var103++) {
                                    var99.method8234(var97.nextInt());
                                }
                                var99.method8230(var97.nextLong());
                                var99.method8444(var97.nextLong());
                                client.method6891(var99);
                                var99.method8230(var97.nextLong());
                                var99.method8275(class69.field875, class69.field872);
                                int var104 = class489.method2043(var96);
                                if (var104 % 8 != 0) {
                                    var104 += 8 - var104 % 8;
                                }
                                class489 var105 = new class489(var104);
                                var105.method8238(var96);
                                var105.field4989 = var104;
                                var105.method8491(var100);
                                class489 var106 = new class489(var105.field4989 + var99.field4989 + var98.field4989 + 5);
                                var106.method8285(2);
                                var106.method8285(var98.field4989);
                                var106.method8476(var98.field4991, 0, var98.field4989);
                                var106.method8285(var99.field4989);
                                var106.method8476(var99.field4991, 0, var99.field4989);
                                var106.method8232(var105.field4989);
                                var106.method8476(var105.field4991, 0, var105.field4989);
                                String var107 = class371.method4953(var106.field4991);
                                byte var114;
                                try {
                                    URL var108 = new URL(client.method3335("services", false) + "m=accountappeal/login.ws");
                                    URLConnection var109 = var108.openConnection();
                                    var109.setDoInput(true);
                                    var109.setDoOutput(true);
                                    var109.setConnectTimeout(5000);
                                    OutputStreamWriter var110 = new OutputStreamWriter(var109.getOutputStream());
                                    var110.write("data2=" + class515.method7046(var107) + "&dest=" + class515.method7046("passwordchoice.ws"));
                                    var110.flush();
                                    InputStream var111 = var109.getInputStream();
                                    class489 var112 = new class489(new byte[1000]);
                                    while (true) {
                                        int var113 = var111.read(var112.field4991, var112.field4989, 1000 - var112.field4989);
                                        if (var113 == -1) {
                                            var110.close();
                                            var111.close();
                                            String var115 = new String(var112.field4991);
                                            if (var115.startsWith("OFFLINE")) {
                                                var114 = 4;
                                            } else if (var115.startsWith("WRONG")) {
                                                var114 = 7;
                                            } else if (var115.startsWith("RELOAD")) {
                                                var114 = 3;
                                            } else if (var115.startsWith("Not permitted for social network accounts.")) {
                                                var114 = 6;
                                            } else {
                                                var112.method8272(var100);
                                                while (var112.field4989 > 0 && var112.field4991[var112.field4989 - 1] == 0) {
                                                    var112.field4989--;
                                                }
                                                String var116 = new String(var112.field4991, 0, var112.field4989);
                                                if (class69.method2524(var116)) {
                                                    class32.method7266(var116, true, false);
                                                    var114 = 2;
                                                } else {
                                                    var114 = 5;
                                                }
                                            }
                                            break;
                                        }
                                        var112.field4989 += var113;
                                        if (var112.field4989 >= 1000) {
                                            var114 = 5;
                                            break;
                                        }
                                    }
                                } catch (Throwable var193) {
                                    var193.printStackTrace();
                                    var114 = 5;
                                }
                                var95 = var114;
                            }
                            switch(var95) {
                                case 2:
                                    method3873(class337.field4009, class337.field4033, class337.field4118);
                                    method2964(6);
                                    break;
                                case 3:
                                    method3873(class337.field4119, class337.field4120, class337.field3992);
                                    break;
                                case 4:
                                    method3873(class337.field4122, class337.field4123, class337.field4124);
                                    break;
                                case 5:
                                    method3873(class337.field4125, class337.field4126, class337.field4127);
                                    break;
                                case 6:
                                    method3873(class337.field4086, class337.field3963, class337.field4130);
                                    break;
                                case 7:
                                    method3873(class337.field4131, class337.field4132, class337.field4133);
                            }
                        }
                        return;
                    }
                    if (var91 && field930.length() < 320) {
                        field930 = field930 + var15.field2362;
                    }
                }
            }
        } else if (field898 == 6) {
            while (true) {
                do {
                    if (!var15.method3883()) {
                        short var118 = 321;
                        if (var11 == 1 && var13 >= var118 - 20 && var13 <= var118 + 20) {
                            method42(true);
                        }
                        return;
                    }
                } while (var15.field2363 != 84 && var15.field2363 != 13);
                method42(true);
            }
        } else if (field898 == 7) {
            if (Statics.field2984 && !client.field562) {
                int var119 = Statics.field1671 - 150;
                int var120 = var119 + 240 + 25 + 40;
                short var121 = 231;
                int var122 = var121 + 40;
                if (var11 == 1 && var12 >= var119 && var12 <= var120 && var13 >= var121 && var13 <= var122) {
                    int var123 = var119;
                    int var124 = 0;
                    int var125;
                    while (true) {
                        if (var124 >= 8) {
                            var125 = 0;
                            break;
                        }
                        if (var12 <= var123 + 30) {
                            var125 = var124;
                            break;
                        }
                        var123 += 30;
                        var123 += var124 == 1 || var124 == 3 ? 20 : 5;
                        var124++;
                    }
                    field910 = var125;
                }
                int var126 = field896 + 180 - 80;
                short var127 = 321;
                if (var11 == 1 && var12 >= var126 - 75 && var12 <= var126 + 75 && var13 >= var127 - 20 && var13 <= var127 + 20) {
                    boolean var136;
                    label1152: {
                        Date var134;
                        try {
                            SimpleDateFormat var128 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var128.setLenient(false);
                            StringBuilder var129 = new StringBuilder();
                            String[] var130 = field911;
                            int var131 = 0;
                            while (true) {
                                Date var133;
                                if (var131 < var130.length) {
                                    String var132 = var130[var131];
                                    if (var132 != null) {
                                        var129.append(var132);
                                        var131++;
                                        continue;
                                    }
                                    method4987("Date not valid.", "Please ensure all characters are populated.", "");
                                    var133 = null;
                                } else {
                                    var129.append("12");
                                    var133 = var128.parse(var129.toString());
                                }
                                var134 = var133;
                                break;
                            }
                        } catch (ParseException var195) {
                            method4987("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var136 = false;
                            break label1152;
                        }
                        if (var134 == null) {
                            var136 = false;
                        } else {
                            boolean var137 = method2141(var134);
                            Date var138 = method2603();
                            boolean var139 = var134.after(var138);
                            if (var139) {
                                if (var137) {
                                    Statics.field4479 = (int) (var134.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field4479 = 8388607;
                                }
                                var136 = true;
                            } else {
                                method4987("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var136 = false;
                            }
                        }
                    }
                    if (var136) {
                        client.method3032(50);
                        return;
                    }
                }
                int var142 = field896 + 180 + 80;
                if (var11 == 1 && var12 >= var142 - 75 && var12 <= var142 + 75 && var13 >= var127 - 20 && var13 <= var127 + 20) {
                    field911 = new String[8];
                    method42(true);
                }
                while (var15.method3883()) {
                    if (var15.field2363 == 101) {
                        field911[field910] = null;
                    }
                    if (var15.field2363 == 85) {
                        if (field911[field910] == null && field910 > 0) {
                            field910--;
                        }
                        field911[field910] = null;
                    }
                    if (var15.field2362 >= '0' && var15.field2362 <= '9') {
                        field911[field910] = "" + var15.field2362;
                        if (field910 < 7) {
                            field910++;
                        }
                    }
                    if (var15.field2363 == 84) {
                        boolean var151;
                        label1081: {
                            Date var149;
                            try {
                                SimpleDateFormat var143 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var143.setLenient(false);
                                StringBuilder var144 = new StringBuilder();
                                String[] var145 = field911;
                                int var146 = 0;
                                while (true) {
                                    Date var148;
                                    if (var146 < var145.length) {
                                        String var147 = var145[var146];
                                        if (var147 != null) {
                                            var144.append(var147);
                                            var146++;
                                            continue;
                                        }
                                        method4987("Date not valid.", "Please ensure all characters are populated.", "");
                                        var148 = null;
                                    } else {
                                        var144.append("12");
                                        var148 = var143.parse(var144.toString());
                                    }
                                    var149 = var148;
                                    break;
                                }
                            } catch (ParseException var194) {
                                method4987("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var151 = false;
                                break label1081;
                            }
                            if (var149 == null) {
                                var151 = false;
                            } else {
                                boolean var152 = method2141(var149);
                                Date var153 = method2603();
                                boolean var154 = var149.after(var153);
                                if (var154) {
                                    if (var152) {
                                        Statics.field4479 = (int) (var149.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field4479 = 8388607;
                                    }
                                    var151 = true;
                                } else {
                                    method4987("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var151 = false;
                                }
                            }
                        }
                        if (var151) {
                            client.method3032(50);
                        }
                        return;
                    }
                }
            } else {
                int var157 = field896 + 180 - 80;
                short var158 = 321;
                if (var11 == 1 && var12 >= var157 - 75 && var12 <= var157 + 75 && var13 >= var158 - 20 && var13 <= var158 + 20) {
                    class32.method7266(client.method3335("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3873(class337.field4110, class337.field4111, class337.field4112);
                    method2964(6);
                    return;
                }
                int var159 = field896 + 180 + 80;
                if (var11 == 1 && var12 >= var159 - 75 && var12 <= var159 + 75 && var13 >= var158 - 20 && var13 <= var158 + 20) {
                    method42(true);
                }
            }
        } else if (field898 == 8) {
            int var160 = field896 + 180 - 80;
            short var161 = 321;
            if (var11 == 1 && var12 >= var160 - 75 && var12 <= var160 + 75 && var13 >= var161 - 20 && var13 <= var161 + 20) {
                class32.method7266("https://www.jagex.com/terms/privacy", true, false);
                method3873(class337.field4110, class337.field4111, class337.field4112);
                method2964(6);
                return;
            }
            int var162 = field896 + 180 + 80;
            if (var11 == 1 && var12 >= var162 - 75 && var12 <= var162 + 75 && var13 >= var161 - 20 && var13 <= var161 + 20) {
                method42(true);
            }
        } else if (field898 == 9) {
            int var163 = field896 + 180;
            short var164 = 311;
            if (var14.field2363 == 84 || var14.field2363 == 13 || var11 == 1 && var12 >= var163 - 75 && var12 <= var163 + 75 && var13 >= var164 - 20 && var13 <= var164 + 20) {
                method2004(false);
            }
        } else if (field898 == 10) {
            int var165 = field896 + 180;
            short var166 = 209;
            if (var14.field2363 == 84 || var11 == 1 && var12 >= var165 - 109 && var12 <= var165 + 109 && var13 >= var166 && var13 <= var166 + 68) {
                method3873(class337.field4079, class337.field3910, class337.field3890);
                client.field528 = class494.field5045;
                client.method173(false);
                client.method3032(20);
            }
        } else if (field898 == 12) {
            int var167 = Statics.field1671;
            short var168 = 233;
            class421 var169 = arg2.method6766(0, 30, class337.field3932, var167, var168);
            class421 var170 = arg2.method6766(32, 32, class337.field3932, var167, var168);
            class421 var171 = arg2.method6766(70, 34, class337.field3932, var167, var168);
            int var199 = var168 + 17;
            class421 var172 = arg2.method6766(0, 34, class337.field4143, var167, var199);
            if (var11 == 1) {
                if (var169.method7372(var12, var13)) {
                    class32.method7266("https://www.jagex.com/terms", true, false);
                } else if (var170.method7372(var12, var13)) {
                    class32.method7266("https://www.jagex.com/terms/privacy", true, false);
                } else if (var171.method7372(var12, var13) || var172.method7372(var12, var13)) {
                    class32.method7266("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var173 = Statics.field1671 - 80;
            short var174 = 311;
            if (var11 == 1 && var12 >= var173 - 75 && var12 <= var173 + 75 && var13 >= var174 - 20 && var13 <= var174 + 20) {
                Statics.field112.method2346(client.field494);
                method2004(true);
            }
            int var175 = Statics.field1671 + 80;
            if (var11 == 1 && var12 >= var175 - 75 && var12 <= var175 + 75 && var13 >= var174 - 20 && var13 <= var174 + 20) {
                field898 = 13;
            }
        } else if (field898 == 13) {
            int var176 = Statics.field1671;
            short var177 = 321;
            if (var11 == 1 && var12 >= var176 - 75 && var12 <= var176 + 75 && var13 >= var177 - 20 && var13 <= var177 + 20) {
                method2004(true);
            }
        } else if (field898 == 14) {
            String var178 = "";
            switch(field899) {
                case 0:
                    var178 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var178 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var178 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method42(false);
            }
            int var179 = field896 + 180;
            short var180 = 276;
            if (var11 == 1 && var12 >= var179 - 75 && var12 <= var179 + 75 && var13 >= var180 - 20 && var13 <= var180 + 20) {
                class32.method7266(var178, true, false);
                method3873(class337.field4110, class337.field4111, class337.field4112);
                method2964(6);
                return;
            }
            int var181 = field896 + 180;
            short var182 = 326;
            if (var11 == 1 && var12 >= var181 - 75 && var12 <= var181 + 75 && var13 >= var182 - 20 && var13 <= var182 + 20) {
                method42(false);
            }
        } else if (field898 == 24) {
            int var183 = field896 + 180;
            short var184 = 301;
            if (var11 == 1 && var12 >= var183 - 75 && var12 <= var183 + 75 && var13 >= var184 - 20 && var13 <= var184 + 20) {
                method2004(false);
            }
        } else if (field898 == 32) {
            int var185 = field896 + 180 - 80;
            short var186 = 321;
            if (var11 == 1 && var12 >= var185 - 75 && var12 <= var185 + 75 && var13 >= var186 - 20 && var13 <= var186 + 20) {
                class32.method7266(client.method3335("secure", true) + "m=dob/set_dob.ws", true, false);
                method3873(class337.field4110, class337.field4111, class337.field4112);
                method2964(6);
                return;
            }
            int var187 = field896 + 180 + 80;
            if (var11 == 1 && var12 >= var187 - 75 && var12 <= var187 + 75 && var13 >= var186 - 20 && var13 <= var186 + 20) {
                method42(true);
            }
        } else if (field898 == 33) {
            int var188 = field896 + 180;
            short var189 = 276;
            if (var11 == 1 && var12 >= var188 - 75 && var12 <= var188 + 75 && var13 >= var189 - 20 && var13 <= var189 + 20) {
                class32.method7266(class337.field4161, true, false);
            }
            int var190 = field896 + 180;
            short var191 = 326;
            if (var11 == 1 && var12 >= var190 - 75 && var12 <= var190 + 75 && var13 >= var191 - 20 && var13 <= var191 + 20) {
                method42(true);
            }
        }
    }

    @ObfuscatedName("ep.aq(I)Ljava/util/Date;")
    public static Date method2603() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("do.al(Ljava/util/Date;I)Z")
    public static boolean method2141(Date arg0) {
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

    @ObfuscatedName("ju.at(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4987(String arg0, String arg1, String arg2) {
        method2964(7);
        method3873(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.aa(ZI)V")
    public static void method42(boolean arg0) {
        if (Statics.field466.method1344() || Statics.field466.method1164() || Statics.field466.method1163()) {
            method2964(10);
            return;
        }
        field905 = class337.field4061;
        field906 = class337.field4062;
        field890 = class337.field4063;
        method2964(2);
        if (arg0) {
            field909 = "";
        }
        method4619();
        if (client.field540 && field930 != null && field930.length() > 0) {
            field923 = 1;
        } else {
            field923 = 0;
        }
    }

    @ObfuscatedName("cz.ay(ZI)V")
    public static void method2004(boolean arg0) {
        byte var1 = 0;
        if (!client.method3014()) {
            var1 = 12;
        } else if (Statics.field466.method1344() || Statics.field466.method1164() || Statics.field466.method1163()) {
            var1 = 10;
        }
        method2964(var1);
        if (arg0) {
            field930 = "";
            field909 = "";
            Statics.field2331 = 0;
            Statics.field1374 = "";
        }
        method4619();
        if (client.field540 && field930 != null && field930.length() > 0) {
            field923 = 1;
        } else {
            field923 = 0;
        }
    }

    @ObfuscatedName("aq.ao(Lon;Lon;Lon;I)V")
    public static void method38(class379 arg0, class379 arg1, class379 arg2) {
        field907 = (Statics.field211 - 765) / 2;
        field896 = field907 + 202;
        Statics.field1671 = field896 + 180;
        if (field919) {
            method1056(arg0, arg1);
            return;
        }
        Statics.field1498.method8688(field907, 0);
        Statics.field2125.method8688(field907 + 382, 0);
        Statics.field123.method8656(field907 + 382 - Statics.field123.field5081 / 2, 18);
        if (client.field499 == 0 || client.field499 == 5) {
            byte var3 = 20;
            arg0.method6770(class337.field4060, field896 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class499.method8632(field896 + 180 - 152, var4, 304, 34, 9179409);
            class499.method8632(field896 + 180 - 151, var4 + 1, 302, 32, 0);
            class499.method8603(field896 + 180 - 150, var4 + 2, field897 * 3, 30, 9179409);
            class499.method8603(field897 * 3 + (field896 + 180 - 150), var4 + 2, 300 - field897 * 3, 30, 0);
            arg0.method6770(field902, field896 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field499 == 20) {
            Statics.field914.method8656(field896 + 180 - Statics.field914.field5081 / 2, 271 - Statics.field914.field5082 / 2);
            short var5 = 201;
            arg0.method6770(field905, field896 + 180, var5, 16776960, 0);
            int var113 = var5 + 15;
            arg0.method6770(field906, field896 + 180, var113, 16776960, 0);
            int var114 = var113 + 15;
            arg0.method6770(field890, field896 + 180, var114, 16776960, 0);
            int var115 = var114 + 15;
            int var116 = var115 + 7;
            if (field898 != 4 && field898 != 10) {
                arg0.method6837(class337.field3869, field896 + 180 - 110, var116, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method280(); arg0.method6761(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method6837(class383.method6854(var7), field896 + 180 - 70, var116, 16777215, 0);
                var113 = var116 + 15;
                String var8;
                for (var8 = class372.method5966(field909); arg0.method6761(var8) > var6; var8 = var8.substring(1)) {
                }
                arg0.method6837(class337.field4089 + var8, field896 + 180 - 108, var113, 16777215, 0);
                var113 += 15;
            }
        }
        if (client.field499 == 10 || client.field499 == 11 || client.field499 == 50) {
            Statics.field914.method8656(field896, 171);
            if (field898 == 0) {
                short var9 = 251;
                arg0.method6770(class337.field4091, field896 + 180, var9, 16776960, 0);
                int var117 = var9 + 30;
                int var10 = field896 + 180 - 80;
                short var11 = 291;
                Statics.field3362.method8656(var10 - 73, var11 - 20);
                arg0.method6771(class337.field4092, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field896 + 180 + 80;
                Statics.field3362.method8656(var12 - 73, var11 - 20);
                arg0.method6771(class337.field4034, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field898 == 1) {
                arg0.method6770(field904, field896 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method6770(field905, field896 + 180, var13, 16777215, 0);
                int var118 = var13 + 15;
                arg0.method6770(field906, field896 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method6770(field890, field896 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                int var14 = field896 + 180 - 80;
                short var15 = 321;
                Statics.field3362.method8656(var14 - 73, var15 - 20);
                arg0.method6770(class337.field3842, var14, var15 + 5, 16777215, 0);
                int var16 = field896 + 180 + 80;
                Statics.field3362.method8656(var16 - 73, var15 - 20);
                arg0.method6770(class337.field4095, var16, var15 + 5, 16777215, 0);
            } else if (field898 == 2) {
                short var17 = 201;
                arg0.method6770(field905, Statics.field1671, var17, 16776960, 0);
                int var121 = var17 + 15;
                arg0.method6770(field906, Statics.field1671, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg0.method6770(field890, Statics.field1671, var122, 16776960, 0);
                int var123 = var122 + 15;
                int var124 = var123 + 7;
                arg0.method6837(class337.field3869, Statics.field1671 - 110, var124, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method280(); arg0.method6761(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method6837(class383.method6854(var19) + (field923 == 0 & client.field602 % 40 < 20 ? class97.method6893(16776960) + class97.field1286 : ""), Statics.field1671 - 70, var124, 16777215, 0);
                var121 = var124 + 15;
                String var20;
                for (var20 = class372.method5966(field909); arg0.method6761(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method6837(class337.field4089 + var20 + (field923 == 1 & client.field602 % 40 < 20 ? class97.method6893(16776960) + class97.field1286 : ""), Statics.field1671 - 108, var121, 16777215, 0);
                var121 += 15;
                short var21 = 277;
                int var22 = Statics.field1671 + -117;
                boolean var23 = client.field540;
                boolean var24 = field891;
                class502 var25 = var23 ? (var24 ? Statics.field908 : Statics.field1767) : (var24 ? Statics.field894 : Statics.field893);
                var25.method8656(var22, var21);
                int var27 = var25.field5081 + 5 + var22;
                arg1.method6837(class337.field4096, var27, var21 + 13, 16776960, 0);
                int var28 = Statics.field1671 + 24;
                boolean var29 = Statics.field112.method2328();
                boolean var30 = field903;
                class502 var31 = var29 ? (var30 ? Statics.field908 : Statics.field1767) : (var30 ? Statics.field894 : Statics.field893);
                var31.method8656(var28, var21);
                int var33 = var31.field5081 + 5 + var28;
                arg1.method6837(class337.field4097, var33, var21 + 13, 16776960, 0);
                int var125 = var21 + 15;
                int var34 = Statics.field1671 - 80;
                short var35 = 321;
                Statics.field3362.method8656(var34 - 73, var35 - 20);
                arg0.method6770(class337.field4094, var34, var35 + 5, 16777215, 0);
                int var36 = Statics.field1671 + 80;
                Statics.field3362.method8656(var36 - 73, var35 - 20);
                arg0.method6770(class337.field4095, var36, var35 + 5, 16777215, 0);
                short var37 = 357;
                switch(field917) {
                    case 2:
                        Statics.field98 = class337.field4109;
                        break;
                    default:
                        Statics.field98 = class337.field4107;
                }
                Statics.field1296 = new class421(Statics.field1671, var37, arg1.method6761(Statics.field98), 11);
                Statics.field104 = new class421(Statics.field1671, var37, arg1.method6761(class337.field4108), 11);
                arg1.method6770(Statics.field98, Statics.field1671, var37, 16777215, 0);
            } else if (field898 == 3) {
                short var38 = 201;
                arg0.method6770(class337.field4098, field896 + 180, var38, 16776960, 0);
                int var126 = var38 + 20;
                arg1.method6770(class337.field4066, field896 + 180, var126, 16776960, 0);
                int var127 = var126 + 20;
                arg1.method6770(class337.field4100, field896 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var39 = field896 + 180;
                short var40 = 276;
                Statics.field3362.method8656(var39 - 73, var40 - 20);
                arg2.method6770(class337.field4101, var39, var40 + 5, 16777215, 0);
                int var41 = field896 + 180;
                short var42 = 326;
                Statics.field3362.method8656(var41 - 73, var42 - 20);
                arg2.method6770(class337.field4102, var41, var42 + 5, 16777215, 0);
            } else if (field898 == 4) {
                arg0.method6770(class337.field4077, field896 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method6770(field905, field896 + 180, var43, 16777215, 0);
                int var129 = var43 + 15;
                arg0.method6770(field906, field896 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                arg0.method6770(field890, field896 + 180, var130, 16777215, 0);
                int var131 = var130 + 15;
                arg0.method6837(class337.field4090 + class372.method5966(Statics.field1374) + (client.field602 % 40 < 20 ? class97.method6893(16776960) + class97.field1286 : ""), field896 + 180 - 108, var131, 16777215, 0);
                int var132 = var131 - 8;
                arg0.method6837(class337.field3845, field896 + 180 - 9, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method6837(class337.field3846, field896 + 180 - 9, var133, 16776960, 0);
                int var44 = field896 + 180 - 9 + arg0.method6761(class337.field3846) + 15;
                int var45 = var133 - arg0.field4439;
                class502 var46;
                if (field915) {
                    var46 = Statics.field1767;
                } else {
                    var46 = Statics.field893;
                }
                var46.method8656(var44, var45);
                var129 = var133 + 15;
                int var47 = field896 + 180 - 80;
                short var48 = 321;
                Statics.field3362.method8656(var47 - 73, var48 - 20);
                arg0.method6770(class337.field3842, var47, var48 + 5, 16777215, 0);
                int var49 = field896 + 180 + 80;
                Statics.field3362.method8656(var49 - 73, var48 - 20);
                arg0.method6770(class337.field4095, var49, var48 + 5, 16777215, 0);
                arg1.method6770(class337.field4078, field896 + 180, var48 + 36, 255, 0);
            } else if (field898 == 5) {
                arg0.method6770(class337.field3953, field896 + 180, 201, 16776960, 0);
                short var50 = 221;
                arg2.method6770(field905, field896 + 180, var50, 16776960, 0);
                int var134 = var50 + 15;
                arg2.method6770(field906, field896 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg2.method6770(field890, field896 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 14;
                arg0.method6837(class337.field4104, field896 + 180 - 145, var137, 16777215, 0);
                short var51 = 174;
                String var52;
                for (var52 = method280(); arg0.method6761(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method6837(class383.method6854(var52) + (client.field602 % 40 < 20 ? class97.method6893(16776960) + class97.field1286 : ""), field896 + 180 - 34, var137, 16777215, 0);
                var134 = var137 + 15;
                int var53 = field896 + 180 - 80;
                short var54 = 321;
                Statics.field3362.method8656(var53 - 73, var54 - 20);
                arg0.method6770(class337.field4070, var53, var54 + 5, 16777215, 0);
                int var55 = field896 + 180 + 80;
                Statics.field3362.method8656(var55 - 73, var54 - 20);
                arg0.method6770(class337.field4106, var55, var54 + 5, 16777215, 0);
                short var56 = 356;
                arg1.method6770(class337.field4108, Statics.field1671, var56, 268435455, 0);
            } else if (field898 == 6) {
                short var57 = 201;
                arg0.method6770(field905, field896 + 180, var57, 16776960, 0);
                int var138 = var57 + 15;
                arg0.method6770(field906, field896 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method6770(field890, field896 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var58 = field896 + 180;
                short var59 = 321;
                Statics.field3362.method8656(var58 - 73, var59 - 20);
                arg0.method6770(class337.field4106, var58, var59 + 5, 16777215, 0);
            } else if (field898 == 7) {
                if (Statics.field2984 && !client.field562) {
                    short var60 = 201;
                    arg0.method6770(field905, Statics.field1671, var60, 16776960, 0);
                    int var141 = var60 + 15;
                    arg0.method6770(field906, Statics.field1671, var141, 16776960, 0);
                    int var142 = var141 + 15;
                    arg0.method6770(field890, Statics.field1671, var142, 16776960, 0);
                    int var61 = Statics.field1671 - 150;
                    int var143 = var142 + 10;
                    for (int var62 = 0; var62 < 8; var62++) {
                        Statics.field3362.method8667(var61, var143, 30, 40);
                        boolean var63 = field910 == var62 & client.field602 % 40 < 20;
                        arg0.method6837((field911[var62] == null ? "" : field911[var62]) + (var63 ? class97.method6893(16776960) + class97.field1286 : ""), var61 + 10, var143 + 27, 16777215, 0);
                        if (var62 == 1 || var62 == 3) {
                            var61 += 50;
                            arg0.method6837(class383.method6854("/"), var61 - 13, var143 + 27, 16777215, 0);
                        } else {
                            var61 += 35;
                        }
                    }
                    int var64 = Statics.field1671 - 80;
                    short var65 = 321;
                    Statics.field3362.method8656(var64 - 73, var65 - 20);
                    arg0.method6770("Submit", var64, var65 + 5, 16777215, 0);
                    int var66 = Statics.field1671 + 80;
                    Statics.field3362.method8656(var66 - 73, var65 - 20);
                    arg0.method6770(class337.field4095, var66, var65 + 5, 16777215, 0);
                } else {
                    short var67 = 216;
                    arg0.method6770(class337.field4134, field896 + 180, var67, 16776960, 0);
                    int var144 = var67 + 15;
                    arg2.method6770(class337.field3894, field896 + 180, var144, 16776960, 0);
                    int var145 = var144 + 15;
                    arg2.method6770(class337.field4136, field896 + 180, var145, 16776960, 0);
                    int var146 = var145 + 15;
                    int var68 = field896 + 180 - 80;
                    short var69 = 321;
                    Statics.field3362.method8656(var68 - 73, var69 - 20);
                    arg0.method6770(class337.field4064, var68, var69 + 5, 16777215, 0);
                    int var70 = field896 + 180 + 80;
                    Statics.field3362.method8656(var70 - 73, var69 - 20);
                    arg0.method6770(class337.field4106, var70, var69 + 5, 16777215, 0);
                }
            } else if (field898 == 8) {
                short var71 = 216;
                arg0.method6770(class337.field3975, field896 + 180, var71, 16776960, 0);
                int var147 = var71 + 15;
                arg2.method6770(class337.field4069, field896 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg2.method6770(class337.field3977, field896 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var72 = field896 + 180 - 80;
                short var73 = 321;
                Statics.field3362.method8656(var72 - 73, var73 - 20);
                arg0.method6770(class337.field3895, var72, var73 + 5, 16777215, 0);
                int var74 = field896 + 180 + 80;
                Statics.field3362.method8656(var74 - 73, var73 - 20);
                arg0.method6770(class337.field4106, var74, var73 + 5, 16777215, 0);
            } else if (field898 == 9) {
                short var75 = 221;
                arg0.method6770(field905, field896 + 180, var75, 16776960, 0);
                int var150 = var75 + 25;
                arg0.method6770(field906, field896 + 180, var150, 16776960, 0);
                int var151 = var150 + 25;
                arg0.method6770(field890, field896 + 180, var151, 16776960, 0);
                int var76 = field896 + 180;
                short var77 = 311;
                Statics.field3362.method8656(var76 - 73, var77 - 20);
                arg0.method6770(class337.field4101, var76, var77 + 5, 16777215, 0);
            } else if (field898 == 10) {
                int var78 = field896 + 180;
                short var79 = 209;
                arg0.method6770(class337.field4091, field896 + 180, var79, 16776960, 0);
                int var152 = var79 + 20;
                Statics.field4718.method8656(var78 - 109, var152);
                if (field912.isEmpty()) {
                    Statics.field4399.method8656(var78 - 48, var152 + 18);
                } else {
                    Statics.field4399.method8656(var78 - 48, var152 + 5);
                    arg0.method6770(field912, var78, var152 + 68 - 15, 16776960, 0);
                }
            } else if (field898 == 12) {
                int var80 = Statics.field1671;
                short var81 = 216;
                arg2.method6770(class337.field3973, var80, var81, 16777215, 0);
                int var153 = var81 + 17;
                arg2.method6770(class337.field3932, var80, var153, 16777215, 0);
                int var154 = var153 + 17;
                arg2.method6770(class337.field4143, var80, var154, 16777215, 0);
                int var155 = var154 + 17;
                arg2.method6770(class337.field4144, var80, var155, 16777215, 0);
                int var82 = Statics.field1671 - 80;
                short var83 = 311;
                Statics.field3362.method8656(var82 - 73, var83 - 20);
                arg0.method6770(class337.field4147, var82, var83 + 5, 16777215, 0);
                int var84 = Statics.field1671 + 80;
                Statics.field3362.method8656(var84 - 73, var83 - 20);
                arg0.method6770(class337.field4148, var84, var83 + 5, 16777215, 0);
            } else if (field898 == 13) {
                short var85 = 231;
                arg2.method6770(class337.field3867, field896 + 180, var85, 16777215, 0);
                int var156 = var85 + 20;
                arg2.method6770(class337.field4146, field896 + 180, var156, 16777215, 0);
                int var86 = field896 + 180;
                short var87 = 311;
                Statics.field3362.method8656(var86 - 73, var87 - 20);
                arg0.method6770(class337.field4106, var86, var87 + 5, 16777215, 0);
            } else if (field898 == 14) {
                short var88 = 201;
                String var89 = "";
                String var90 = "";
                String var91 = "";
                switch(field899) {
                    case 0:
                        var89 = class337.field3891;
                        var90 = class337.field4005;
                        var91 = class337.field3893;
                        break;
                    case 1:
                        var89 = class337.field3930;
                        var90 = class337.field4099;
                        var91 = class337.field3945;
                        break;
                    case 2:
                        var89 = class337.field3978;
                        var90 = class337.field4156;
                        var91 = class337.field3968;
                        break;
                    default:
                        method42(false);
                }
                arg0.method6770(var89, field896 + 180, var88, 16776960, 0);
                int var157 = var88 + 20;
                arg0.method6770(var90, field896 + 180, var157, 16776960, 0);
                int var158 = var157 + 20;
                arg0.method6770(var91, field896 + 180, var158, 16776960, 0);
                int var92 = field896 + 180;
                short var93 = 276;
                Statics.field3362.method8656(var92 - 73, var93 - 20);
                if (field899 == 1) {
                    arg0.method6770(class337.field3875, var92, var93 + 5, 16777215, 0);
                } else {
                    arg0.method6770(class337.field4055, var92, var93 + 5, 16777215, 0);
                }
                int var94 = field896 + 180;
                short var95 = 326;
                Statics.field3362.method8656(var94 - 73, var95 - 20);
                arg0.method6770(class337.field4106, var94, var95 + 5, 16777215, 0);
            } else if (field898 == 24) {
                short var96 = 221;
                arg0.method6770(field905, field896 + 180, var96, 16777215, 0);
                int var159 = var96 + 15;
                arg0.method6770(field906, field896 + 180, var159, 16777215, 0);
                int var160 = var159 + 15;
                arg0.method6770(field890, field896 + 180, var160, 16777215, 0);
                int var161 = var160 + 15;
                int var97 = field896 + 180;
                short var98 = 301;
                Statics.field3362.method8656(var97 - 73, var98 - 20);
                arg0.method6770(class337.field4135, var97, var98 + 5, 16777215, 0);
            } else if (field898 == 32) {
                short var99 = 216;
                arg0.method6770(class337.field4134, field896 + 180, var99, 16776960, 0);
                int var162 = var99 + 15;
                arg2.method6770(class337.field3894, field896 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                arg2.method6770(class337.field4136, field896 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                int var100 = field896 + 180 - 80;
                short var101 = 321;
                Statics.field3362.method8656(var100 - 73, var101 - 20);
                arg0.method6770(class337.field4064, var100, var101 + 5, 16777215, 0);
                int var102 = field896 + 180 + 80;
                Statics.field3362.method8656(var102 - 73, var101 - 20);
                arg0.method6770(class337.field4106, var102, var101 + 5, 16777215, 0);
            } else if (field898 == 33) {
                short var103 = 201;
                arg0.method6770(field905, field896 + 180, var103, 16776960, 0);
                int var165 = var103 + 20;
                arg1.method6770(field906, field896 + 180, var165, 16776960, 0);
                int var166 = var165 + 20;
                arg1.method6770(field890, field896 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                int var104 = field896 + 180;
                short var105 = 276;
                Statics.field3362.method8656(var104 - 73, var105 - 20);
                arg2.method6770(class337.field4160, var104, var105 + 5, 16777215, 0);
                int var106 = field896 + 180;
                short var107 = 326;
                Statics.field3362.method8656(var106 - 73, var107 - 20);
                arg2.method6770(class337.field4106, var106, var107 + 5, 16777215, 0);
            }
        }
        if (client.field499 >= 10) {
            int[] var108 = new int[4];
            class499.method8574(var108);
            class499.method8572(field907, 0, field907 + 765, Statics.field3026);
            Statics.field1471.method2290(field907 - 22, client.field602);
            Statics.field1471.method2290(field907 + 765 + 22 - 128, client.field602);
            class499.method8575(var108);
        }
        Statics.field1704[Statics.field112.method2412() ? 1 : 0].method8656(field907 + 765 - 40, 463);
        if (client.field499 <= 5 || Statics.field1736 != class359.field4317) {
            return;
        }
        if (Statics.field3727 == null) {
            Statics.field3727 = Statics.method5194(Statics.field4788, "sl_button", "");
            return;
        }
        int var109 = field907 + 5;
        short var110 = 463;
        byte var111 = 100;
        byte var112 = 35;
        Statics.field3727.method8656(var109, var110);
        arg0.method6770(class337.field4057 + " " + client.field579, var111 / 2 + var109, var112 / 2 + var110 - 2, 16777215, 0);
        if (Statics.field60 == null) {
            arg1.method6770(class337.field4159, var111 / 2 + var109, var112 / 2 + var110 + 12, 16777215, 0);
        } else {
            arg1.method6770(class337.field4158, var111 / 2 + var109, var112 / 2 + var110 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("he.ax(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3873(String arg0, String arg1, String arg2) {
        field905 = arg0;
        field906 = arg1;
        field890 = arg2;
    }

    @ObfuscatedName("cc.ai(Lon;Lon;B)V")
    public static void method1056(class379 arg0, class379 arg1) {
        if (Statics.field4945 == null) {
            class342 var2 = Statics.field4788;
            class503[] var3;
            if (var2.method6088("sl_back", "")) {
                int var4 = var2.method6086("sl_back");
                int var5 = var2.method6075(var4, "");
                var3 = class504.method2775(var2, var4, var5);
            } else {
                var3 = null;
            }
            Statics.field4945 = var3;
        }
        if (Statics.field88 == null) {
            Statics.field88 = class504.method5758(Statics.field4788, "sl_flags", "");
        }
        if (Statics.field120 == null) {
            Statics.field120 = class504.method5758(Statics.field4788, "sl_arrows", "");
        }
        if (Statics.field803 == null) {
            Statics.field803 = class504.method5758(Statics.field4788, "sl_stars", "");
        }
        if (Statics.field4189 == null) {
            Statics.field4189 = Statics.method5194(Statics.field4788, "leftarrow", "");
        }
        if (Statics.field71 == null) {
            Statics.field71 = Statics.method5194(Statics.field4788, "rightarrow", "");
        }
        class499.method8603(field907, 23, 765, 480, 0);
        class499.method8581(field907, 0, 125, 23, 12425273, 9135624);
        class499.method8581(field907 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6770(class337.field4149, field907 + 62, 15, 0, -1);
        if (Statics.field803 != null) {
            Statics.field803[1].method8656(field907 + 140, 1);
            arg1.method6837(class337.field4150, field907 + 152, 10, 16777215, -1);
            Statics.field803[0].method8656(field907 + 140, 12);
            arg1.method6837(class337.field4151, field907 + 152, 21, 16777215, -1);
        }
        if (Statics.field120 != null) {
            int var6 = field907 + 280;
            if (class64.field794[0] == 0 && class64.field793[0] == 0) {
                Statics.field120[2].method8656(var6, 4);
            } else {
                Statics.field120[0].method8656(var6, 4);
            }
            if (class64.field794[0] == 0 && class64.field793[0] == 1) {
                Statics.field120[3].method8656(var6 + 15, 4);
            } else {
                Statics.field120[1].method8656(var6 + 15, 4);
            }
            arg0.method6837(class337.field4152, var6 + 32, 17, 16777215, -1);
            int var7 = field907 + 390;
            if (class64.field794[0] == 1 && class64.field793[0] == 0) {
                Statics.field120[2].method8656(var7, 4);
            } else {
                Statics.field120[0].method8656(var7, 4);
            }
            if (class64.field794[0] == 1 && class64.field793[0] == 1) {
                Statics.field120[3].method8656(var7 + 15, 4);
            } else {
                Statics.field120[1].method8656(var7 + 15, 4);
            }
            arg0.method6837(class337.field4153, var7 + 32, 17, 16777215, -1);
            int var8 = field907 + 500;
            if (class64.field794[0] == 2 && class64.field793[0] == 0) {
                Statics.field120[2].method8656(var8, 4);
            } else {
                Statics.field120[0].method8656(var8, 4);
            }
            if (class64.field794[0] == 2 && class64.field793[0] == 1) {
                Statics.field120[3].method8656(var8 + 15, 4);
            } else {
                Statics.field120[1].method8656(var8 + 15, 4);
            }
            arg0.method6837(class337.field4154, var8 + 32, 17, 16777215, -1);
            int var9 = field907 + 610;
            if (class64.field794[0] == 3 && class64.field793[0] == 0) {
                Statics.field120[2].method8656(var9, 4);
            } else {
                Statics.field120[0].method8656(var9, 4);
            }
            if (class64.field794[0] == 3 && class64.field793[0] == 1) {
                Statics.field120[3].method8656(var9 + 15, 4);
            } else {
                Statics.field120[1].method8656(var9 + 15, 4);
            }
            arg0.method6837(class337.field4155, var9 + 32, 17, 16777215, -1);
        }
        class499.method8603(field907 + 708, 4, 50, 16, 0);
        arg1.method6770(class337.field4095, field907 + 708 + 25, 16, 16777215, -1);
        field920 = -1;
        if (Statics.field4945 != null) {
            byte var10 = 88;
            byte var11 = 19;
            int var12 = 765 / (var10 + 1) - 1;
            int var13 = 480 / (var11 + 1);
            int var14;
            int var15;
            do {
                var14 = var13;
                var15 = var12;
                if ((var12 - 1) * var13 >= class64.field792) {
                    var12--;
                }
                if ((var13 - 1) * var12 >= class64.field792) {
                    var13--;
                }
                if ((var13 - 1) * var12 >= class64.field792) {
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
            int var20 = (class64.field792 + var13 - 1) / var13;
            field922 = var20 - var12;
            if (Statics.field4189 != null && field921 > 0) {
                Statics.field4189.method8656(8, Statics.field3026 / 2 - Statics.field4189.field5082 / 2);
            }
            if (Statics.field71 != null && field921 < field922) {
                Statics.field71.method8656(Statics.field211 - Statics.field71.field5081 - 8, Statics.field3026 / 2 - Statics.field71.field5082 / 2);
            }
            int var21 = var19 + 23;
            int var22 = field907 + var18;
            int var23 = 0;
            boolean var24 = false;
            int var25 = field921;
            for (int var26 = var13 * var25; var26 < class64.field792 && var25 - field921 < var12; var26++) {
                class64 var27 = Statics.field179[var26];
                boolean var28 = true;
                String var29 = Integer.toString(var27.field798);
                if (var27.field798 == -1) {
                    var29 = class337.field3982;
                    var28 = false;
                } else if (var27.field798 > 1980) {
                    var29 = class337.field4157;
                    var28 = false;
                }
                class104 var30 = null;
                int var31 = 0;
                if (var27.method1683()) {
                    var30 = var27.method1677() ? class104.field1353 : class104.field1355;
                } else if (var27.method1678()) {
                    var30 = var27.method1677() ? class104.field1364 : class104.field1363;
                } else if (var27.method1710()) {
                    var31 = 16711680;
                    var30 = var27.method1677() ? class104.field1354 : class104.field1351;
                } else if (var27.method1684()) {
                    var30 = var27.method1677() ? class104.field1365 : class104.field1356;
                } else if (var27.method1680()) {
                    var30 = var27.method1677() ? class104.field1352 : class104.field1360;
                } else if (var27.method1685()) {
                    var30 = var27.method1677() ? class104.field1357 : class104.field1359;
                } else if (var27.method1686()) {
                    var30 = var27.method1677() ? class104.field1362 : class104.field1361;
                }
                if (var30 == null || var30.field1349 >= Statics.field4945.length) {
                    var30 = var27.method1677() ? class104.field1350 : class104.field1358;
                }
                if (class36.field242 >= var22 && class36.field243 >= var21 && class36.field242 < var10 + var22 && class36.field243 < var11 + var21 && var28) {
                    field920 = var26;
                    Statics.field4945[var30.field1349].method8704(var22, var21, 128, 16777215);
                    var24 = true;
                } else {
                    Statics.field4945[var30.field1349].method8688(var22, var21);
                }
                if (Statics.field88 != null) {
                    Statics.field88[(var27.method1677() ? 8 : 0) + var27.field801].method8656(var22 + 29, var21);
                }
                arg0.method6770(Integer.toString(var27.field802), var22 + 15, var11 / 2 + var21 + 5, var31, -1);
                arg1.method6770(var29, var22 + 60, var11 / 2 + var21 + 5, 268435455, -1);
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
                int var32 = arg1.method6761(Statics.field179[field920].field800) + 6;
                int var33 = arg1.field4439 + 8;
                int var34 = class36.field243 + 25;
                if (var33 + var34 > 480) {
                    var34 = class36.field243 - 25 - var33;
                }
                class499.method8603(class36.field242 - var32 / 2, var34, var32, var33, 16777120);
                class499.method8632(class36.field242 - var32 / 2, var34, var32, var33, 0);
                arg1.method6770(Statics.field179[field920].field800, class36.field242, arg1.field4439 + var34 + 4, 0, -1);
            }
        }
        Statics.field2381.method476(0, 0);
    }

    @ObfuscatedName("bz.ag(Lbm;I)V")
    public static void method503(class35 arg0) {
        class208 var1 = client.field722;
        class208 var2 = var1;
        while (var2.method3883()) {
            if (var2.field2363 == 13) {
                method3033();
                return;
            }
            if (var2.field2363 == 96) {
                if (field921 > 0 && Statics.field4189 != null) {
                    field921--;
                }
            } else if (var2.field2363 == 97 && field921 < field922 && Statics.field71 != null) {
                field921++;
            }
        }
        if (class36.field252 != 1 && Statics.field4941 || class36.field252 != 4) {
            return;
        }
        int var3 = field907 + 280;
        if (class36.field250 >= var3 && class36.field250 <= var3 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(0, 0);
            return;
        }
        if (class36.field250 >= var3 + 15 && class36.field250 <= var3 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(0, 1);
            return;
        }
        int var4 = field907 + 390;
        if (class36.field250 >= var4 && class36.field250 <= var4 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(1, 0);
            return;
        }
        if (class36.field250 >= var4 + 15 && class36.field250 <= var4 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(1, 1);
            return;
        }
        int var5 = field907 + 500;
        if (class36.field250 >= var5 && class36.field250 <= var5 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(2, 0);
            return;
        }
        if (class36.field250 >= var5 + 15 && class36.field250 <= var5 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(2, 1);
            return;
        }
        int var6 = field907 + 610;
        if (class36.field250 >= var6 && class36.field250 <= var6 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(3, 0);
            return;
        }
        if (class36.field250 >= var6 + 15 && class36.field250 <= var6 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
            class64.method8647(3, 1);
            return;
        }
        if (class36.field250 >= field907 + 708 && class36.field251 >= 4 && class36.field250 <= field907 + 708 + 50 && class36.field251 <= 20) {
            method3033();
            return;
        }
        if (field920 != -1) {
            class64 var7 = Statics.field179[field920];
            method3786(var7);
            method3033();
            return;
        }
        if (field921 > 0 && Statics.field4189 != null && class36.field250 >= 0 && class36.field250 <= Statics.field4189.field5081 && class36.field251 >= Statics.field3026 / 2 - 50 && class36.field251 <= Statics.field3026 / 2 + 50) {
            field921--;
        }
        if (field921 < field922 && Statics.field71 != null && class36.field250 >= Statics.field211 - Statics.field71.field5081 - 5 && class36.field250 <= Statics.field211 && class36.field251 >= Statics.field3026 / 2 - 50 && class36.field251 <= Statics.field3026 / 2 + 50) {
            field921++;
        }
    }

    @ObfuscatedName("hk.ah(Lcl;I)V")
    public static void method3786(class64 arg0) {
        if (arg0.method1677() != client.field492) {
            client.field492 = arg0.method1677();
            boolean var1 = arg0.method1677();
            if (Statics.field1844 != var1) {
                class202.method6751();
                Statics.field1844 = var1;
            }
        }
        if (client.field489 != arg0.field797) {
            class342 var2 = Statics.field4788;
            int var3 = arg0.field797;
            if ((var3 & 0x20000000) != 0) {
                Statics.field123 = Statics.method5194(var2, "logo_deadman_mode", "");
            } else if ((var3 & 0x40000000) != 0) {
                Statics.field123 = Statics.method5194(var2, "logo_seasonal_mode", "");
            } else if ((var3 & 0x100) == 0) {
                Statics.field123 = Statics.method5194(var2, "logo", "");
            } else {
                Statics.field123 = Statics.method5194(var2, "logo_speedrunning", "");
            }
        }
        Statics.field1420 = arg0.field799;
        client.field579 = arg0.field802;
        client.field489 = arg0.field797;
        Statics.field4569 = client.field490 == 0 ? 43594 : arg0.field802 + 40000;
        Statics.field1566 = client.field490 == 0 ? 443 : arg0.field802 + 50000;
        Statics.field1024 = Statics.field4569;
    }

    @ObfuscatedName("ag.av(II)V")
    public static void method180(int arg0) {
        method2964(14);
        field899 = arg0;
    }

    @ObfuscatedName("cz.ar(I)V")
    public static void method2006() {
        if (Statics.method2559()) {
            field919 = true;
            field921 = 0;
            field922 = 0;
        }
    }

    @ObfuscatedName("fd.am(B)V")
    public static void method3033() {
        field919 = false;
        Statics.field1498.method8688(field907, 0);
        Statics.field2125.method8688(field907 + 382, 0);
        Statics.field123.method8656(field907 + 382 - Statics.field123.field5081 / 2, 18);
    }

    @ObfuscatedName("ez.as(I)V")
    public static void method2719() {
        method2964(24);
        method3873(class337.field4082, class337.field3960, class337.field4084);
    }

    @ObfuscatedName("ii.aj(B)V")
    public static void method4162() {
        method2964(24);
        method3873(class337.field4085, class337.field4080, class337.field4142);
    }

    @ObfuscatedName("ee.ak(IB)V")
    public static void method2964(int arg0) {
        if (field898 != arg0) {
            field898 = arg0;
        }
    }

    @ObfuscatedName("mi.az(B)I")
    public static int method5975() {
        return field898;
    }
}
