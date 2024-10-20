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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@ObfuscatedName("ci")
public class class76 {

    @ObfuscatedName("ci.ar")
    public static int field940 = 0;

    @ObfuscatedName("ci.ak")
    public static int field927 = field940 + 202;

    @ObfuscatedName("ci.af")
    public static int field943 = 10;

    @ObfuscatedName("ci.ai")
    public static String field929 = "";

    @ObfuscatedName("ci.bh")
    public static int field930 = -1;

    @ObfuscatedName("ci.bt")
    public static int field931 = 1;

    @ObfuscatedName("ci.ct")
    public static int field932 = 0;

    @ObfuscatedName("ci.cf")
    public static String field933 = "";

    @ObfuscatedName("ci.cz")
    public static String field947 = "";

    @ObfuscatedName("ci.cb")
    public static String field928 = "";

    @ObfuscatedName("ci.cs")
    public static String field936 = "";

    @ObfuscatedName("ci.cj")
    public static String field934 = "";

    @ObfuscatedName("ci.cn")
    public static String field938 = "";

    @ObfuscatedName("ci.ce")
    public static int field939 = 0;

    @ObfuscatedName("ci.cq")
    public static String[] field954 = new String[8];

    @ObfuscatedName("ci.cu")
    public static String field941 = "";

    @ObfuscatedName("ci.ch")
    public static boolean field956 = false;

    @ObfuscatedName("ci.cg")
    public static boolean field948 = false;

    @ObfuscatedName("ci.cc")
    public static boolean field944 = true;

    @ObfuscatedName("ci.dc")
    public static int field945 = 0;

    @ObfuscatedName("ci.dq")
    public static String field946 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.dg")
    public static String field937 = "1234567890";

    @ObfuscatedName("ci.dy")
    public static boolean field950 = false;

    @ObfuscatedName("ci.dt")
    public static int field949 = -1;

    @ObfuscatedName("ci.df")
    public static int field942 = 0;

    @ObfuscatedName("ci.dm")
    public static int field951 = 0;

    @ObfuscatedName("ci.dz")
    public static long field952;

    @ObfuscatedName("ci.dx")
    public static long field953;

    @ObfuscatedName("ci.dp")
    public static String[] field920;

    @ObfuscatedName("ci.ds")
    public static String[] field955;

    @ObfuscatedName("ci.da")
    public static String[] field935;

    static {
        new DecimalFormat("##0.00");
        new class134();
        field952 = -1L;
        field953 = -1L;
        field920 = new String[] { "title.jpg" };
        field955 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field935 = new String[] { "logo_speedrunning" };
    }

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ni.aw(Lnd;B)I")
    public static int method6031(class360 arg0) {
        int var1 = field955.length + field920.length;
        String[] var2 = field935;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6129(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("bk.ar(ZZI)Luu;")
    public static class527 method773(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field505 : Statics.field64) : (arg1 ? Statics.field11 : Statics.field2863);
    }

    @ObfuscatedName("aa.am(I)Ljava/lang/String;")
    public static String method179() {
        String var6;
        if (Statics.field1686.method2356()) {
            String var0 = field934;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field934;
        }
        return var6;
    }

    @ObfuscatedName("jn.as(I)V")
    public static void method4664() {
        if (!Statics.field922) {
            return;
        }
        Statics.field923 = null;
        Statics.field924 = null;
        Statics.field921 = null;
        Statics.field4532 = null;
        Statics.field493 = null;
        Statics.field958 = null;
        Statics.field3378 = null;
        Statics.field2863 = null;
        Statics.field64 = null;
        Statics.field1559 = null;
        Statics.field3089 = null;
        Statics.field171 = null;
        Statics.field2383 = null;
        Statics.field4785 = null;
        Statics.field1787.method2348();
        class307.method3865(0, 100);
        class361 var0 = Statics.field1701;
        var0.method6200(true);
        Statics.field922 = false;
    }

    @ObfuscatedName("qr.aj(Lnd;IB)V")
    public static void method7161(class360 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field958 = class529.method7552(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) != 0) {
            Statics.field958 = class529.method7552(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & 0x100) == 0) {
            Statics.field958 = class529.method7552(arg0, "logo", "");
        } else {
            Statics.field958 = class529.method7552(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("pt.ag(I)V")
    public static void method6671() {
        if (client.field568 && field934 != null && field934.length() > 0) {
            field945 = 1;
        } else {
            field945 = 0;
        }
    }

    @ObfuscatedName("gk.az(Lbq;Lpc;Lpc;I)V")
    public static void method3236(class35 arg0, class395 arg1, class395 arg2) {
        if (field950) {
            method280(arg0);
            return;
        }
        if ((class36.field252 == 1 || !Statics.field170 && class36.field252 == 4) && class36.field253 >= field940 + 765 - 50 && class36.field254 >= 453) {
            Statics.field1686.method2357(!Statics.field1686.method2358());
            if (Statics.field1686.method2358()) {
                class307.method3865(0, 0);
            } else {
                ArrayList var3 = new ArrayList();
                var3.add(new class319(Statics.field70, "scape main", "", 255, false));
                class307.method2728(var3, 0, 0, 0, 100, false);
            }
            class307.field3399.clear();
        }
        if (client.field813 == 5) {
            return;
        }
        if (field952 == -1L) {
            field952 = class303.method2705() + 1000L;
        }
        long var4 = class303.method2705();
        if (client.method423() && field953 == -1L) {
            field953 = var4;
            if (field953 > field952) {
                field952 = field953;
            }
        }
        if (client.field813 != 10 && client.field813 != 11) {
            return;
        }
        if (Statics.field884 == class375.field4384) {
            if (class36.field252 == 1 || !Statics.field170 && class36.field252 == 4) {
                int var6 = field940 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class36.field253 >= var6 && class36.field253 <= var6 + var8 && class36.field254 >= var7 && class36.field254 <= var7 + var9) {
                    if (class68.method2080()) {
                        field950 = true;
                        field942 = 0;
                        field951 = 0;
                    }
                    return;
                }
            }
            if (Statics.field823 != null && class68.method2080()) {
                field950 = true;
                field942 = 0;
                field951 = 0;
            }
        }
        int var10 = class36.field252;
        int var11 = class36.field253;
        int var12 = class36.field254;
        if (var10 == 0) {
            var11 = class36.field245;
            var12 = class36.field246;
        }
        if (!Statics.field170 && var10 == 4) {
            var10 = 1;
        }
        class214 var13 = client.method4579();
        if (field932 == 0) {
            boolean var14 = false;
            while (var13.method3802()) {
                if (var13.field2331 == 84) {
                    var14 = true;
                }
            }
            int var15 = Statics.field1003 - 80;
            short var16 = 291;
            if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var16 - 20 && var12 <= var16 + 20) {
                class32.method2478(client.method2720("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var17 = Statics.field1003 + 80;
            if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var16 - 20 && var12 <= var16 + 20 || var14) {
                if ((client.field518 & 0x2000000) != 0) {
                    field933 = "";
                    field947 = class353.field4121;
                    field928 = class353.field4122;
                    field936 = class353.field4169;
                    method5513(1);
                    method6671();
                } else if ((client.field518 & 0x4) != 0) {
                    if ((client.field518 & 0x400) == 0) {
                        field947 = class353.field4184;
                        field928 = class353.field4163;
                        field936 = class353.field4114;
                    } else {
                        field947 = class353.field4118;
                        field928 = class353.field4119;
                        field936 = class353.field4161;
                    }
                    field933 = class353.field4111;
                    method5513(1);
                    method6671();
                } else if ((client.field518 & 0x400) == 0) {
                    Statics.method5527(false);
                } else {
                    field947 = class353.field4109;
                    field928 = class353.field4102;
                    field936 = class353.field3914;
                    field933 = class353.field4111;
                    method5513(1);
                    method6671();
                }
            }
        } else if (field932 == 1) {
            while (true) {
                if (!var13.method3802()) {
                    int var18 = Statics.field1003 - 80;
                    short var19 = 321;
                    if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                        Statics.method5527(false);
                    }
                    int var20 = Statics.field1003 + 80;
                    if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                        method5513(0);
                    }
                    break;
                }
                if (var13.field2331 == 84) {
                    Statics.method5527(false);
                } else if (var13.field2331 == 13) {
                    method5513(0);
                }
            }
        } else if (field932 == 2) {
            short var21 = 201;
            int var134 = var21 + 52;
            if (var10 == 1 && var12 >= var134 - 12 && var12 < var134 + 2) {
                field945 = 0;
            }
            var134 += 15;
            if (var10 == 1 && var12 >= var134 - 12 && var12 < var134 + 2) {
                field945 = 1;
            }
            var134 += 15;
            short var22 = 361;
            if (Statics.field3841 != null) {
                int var23 = Statics.field3841.field4724 / 2;
                if (var10 == 1 && var11 >= Statics.field3841.field4723 - var23 && var11 <= Statics.field3841.field4723 + var23 && var12 >= var22 - 15 && var12 < var22) {
                    switch(field931) {
                        case 1:
                            method2306(class353.field4160, class353.field4120, class353.field4096);
                            method5513(5);
                            return;
                        case 2:
                            class32.method2478("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var24 = Statics.field1003 - 80;
            short var25 = 321;
            if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                field934 = field934.trim();
                if (field934.length() == 0) {
                    method2306(class353.field3983, class353.field4020, class353.field4125);
                    return;
                }
                if (field938.length() == 0) {
                    method2306(class353.field3924, class353.field4137, class353.field4024);
                    return;
                }
                method2306(class353.field4194, class353.field4127, class353.field4170);
                client.method6247(false);
                client.method2854(20);
                return;
            }
            int var26 = field927 + 180 + 80;
            if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                method5513(0);
                field934 = "";
                field938 = "";
                Statics.field4623 = 0;
                Statics.field959 = "";
                field944 = true;
            }
            int var27 = Statics.field1003 + -117;
            short var28 = 277;
            field956 = var11 >= var27 && var11 < Statics.field1628 + var27 && var12 >= var28 && var12 < Statics.field4761 + var28;
            if (var10 == 1 && field956) {
                client.field568 = !client.field568;
                if (!client.field568 && Statics.field1686.method2372() != null) {
                    Statics.field1686.method2371((String) null);
                }
            }
            int var29 = Statics.field1003 + 24;
            short var30 = 277;
            field948 = var11 >= var29 && var11 < Statics.field1628 + var29 && var12 >= var30 && var12 < Statics.field4761 + var30;
            if (var10 == 1 && field948) {
                Statics.field1686.method2418(!Statics.field1686.method2356());
                if (!Statics.field1686.method2356()) {
                    field934 = "";
                    Statics.field1686.method2371((String) null);
                    method6671();
                }
            }
            label1056: while (true) {
                Transferable var34;
                int var35;
                do {
                    while (true) {
                        label997: do {
                            while (true) {
                                while (var13.method3802()) {
                                    if (var13.field2331 == 13) {
                                        method5513(0);
                                        field934 = "";
                                        field938 = "";
                                        Statics.field4623 = 0;
                                        Statics.field959 = "";
                                        field944 = true;
                                    } else {
                                        if (field945 != 0) {
                                            continue label997;
                                        }
                                        method1113(var13.field2330);
                                        if (var13.field2331 == 85 && field934.length() > 0) {
                                            field934 = field934.substring(0, field934.length() - 1);
                                        }
                                        if (var13.field2331 == 84 || var13.field2331 == 80) {
                                            field945 = 1;
                                        }
                                        char var31 = var13.field2330;
                                        boolean var32 = field946.indexOf(var31) != -1;
                                        if (var32 && field934.length() < 320) {
                                            field934 = field934 + var13.field2330;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field945 != 1);
                        if (var13.field2331 == 85 && field938.length() > 0) {
                            field938 = field938.substring(0, field938.length() - 1);
                        } else if (var13.field2331 == 84 || var13.field2331 == 80) {
                            field945 = 0;
                            if (var13.field2331 == 84) {
                                field934 = field934.trim();
                                if (field934.length() == 0) {
                                    method2306(class353.field3983, class353.field4020, class353.field4125);
                                    return;
                                }
                                if (field938.length() == 0) {
                                    method2306(class353.field3924, class353.field4137, class353.field4024);
                                    return;
                                }
                                method2306(class353.field4194, class353.field4127, class353.field4170);
                                client.method6247(false);
                                client.method2854(20);
                                return;
                            }
                        }
                        if ((var13.method3796(82) || var13.method3796(87)) && var13.field2331 == 67) {
                            Clipboard var33 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var34 = var33.getContents(Statics.field1352);
                            var35 = 20 - field938.length();
                            break;
                        }
                        if (class386.method2076(var13.field2330)) {
                            char var48 = var13.field2330;
                            boolean var49 = field946.indexOf(var48) != -1;
                            if (var49 && field938.length() < 20) {
                                field938 = field938 + var13.field2330;
                            }
                        }
                    }
                } while (var35 <= 0);
                try {
                    String var36 = (String) var34.getTransferData(DataFlavor.stringFlavor);
                    int var37 = Math.min(var35, var36.length());
                    int var38 = 0;
                    while (true) {
                        if (var38 >= var37) {
                            field938 = field938 + var36.substring(0, var37);
                            continue label1056;
                        }
                        char var39 = var36.charAt(var38);
                        boolean var40;
                        if ((var39 < ' ' || var39 >= 127) && (var39 <= 127 || var39 >= 160) && (var39 <= 160 || var39 > 255)) {
                            label1180: {
                                if (var39 != 0) {
                                    char[] var41 = class386.field4430;
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        char var43 = var41[var42];
                                        if (var39 == var43) {
                                            var40 = true;
                                            break label1180;
                                        }
                                    }
                                }
                                var40 = false;
                            }
                        } else {
                            var40 = true;
                        }
                        if (!var40) {
                            break;
                        }
                        char var44 = var36.charAt(var38);
                        boolean var45 = field946.indexOf(var44) != -1;
                        if (!var45) {
                            break;
                        }
                        var38++;
                    }
                    method5513(3);
                    return;
                } catch (UnsupportedFlavorException var132) {
                } catch (IOException var133) {
                }
            }
        } else if (field932 == 3) {
            int var50 = field927 + 180;
            short var51 = 241;
            class447 var52 = arg1.method6809(25, class353.field4043.length() - 34, class353.field4043, var50, var51);
            if (var10 == 1 && var52.method7445(var11, var12)) {
                class32.method2478(class353.field4208, true, false);
            }
            int var53 = field927 + 180;
            short var54 = 276;
            if (var10 == 1 && var11 >= var53 - 75 && var11 <= var53 + 75 && var12 >= var54 - 20 && var12 <= var54 + 20) {
                method5989(false);
            }
            int var55 = field927 + 180;
            short var56 = 326;
            if (var10 == 1 && var11 >= var55 - 75 && var11 <= var55 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                method2306(class353.field4160, class353.field4120, class353.field4096);
                method5513(5);
                return;
            }
        } else if (field932 == 4) {
            int var57 = field927 + 180 - 80;
            short var58 = 321;
            if (var10 == 1 && var11 >= var57 - 75 && var11 <= var57 + 75 && var12 >= var58 - 20 && var12 <= var58 + 20) {
                Statics.field959.trim();
                if (Statics.field959.length() != 6) {
                    method2306(class353.field3938, class353.field3939, class353.field3940);
                    return;
                }
                Statics.field4623 = Integer.parseInt(Statics.field959);
                Statics.field959 = "";
                client.method6247(true);
                method2306(class353.field4194, class353.field4127, class353.field4170);
                client.method2854(20);
                return;
            }
            if (var10 == 1 && var11 >= field927 + 180 - 9 && var11 <= field927 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field944 = !field944;
            }
            if (var10 == 1 && var11 >= field927 + 180 - 34 && var11 <= field927 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                class32.method2478(client.method2720("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var59 = field927 + 180 + 80;
            if (var10 == 1 && var11 >= var59 - 75 && var11 <= var59 + 75 && var12 >= var58 - 20 && var12 <= var58 + 20) {
                method5513(0);
                field934 = "";
                field938 = "";
                Statics.field4623 = 0;
                Statics.field959 = "";
            }
            while (var13.method3802()) {
                boolean var60 = false;
                for (int var61 = 0; var61 < field937.length(); var61++) {
                    if (var13.field2330 == field937.charAt(var61)) {
                        var60 = true;
                        break;
                    }
                }
                if (var13.field2331 == 13) {
                    method5513(0);
                    field934 = "";
                    field938 = "";
                    Statics.field4623 = 0;
                    Statics.field959 = "";
                } else {
                    if (var13.field2331 == 85 && Statics.field959.length() > 0) {
                        Statics.field959 = Statics.field959.substring(0, Statics.field959.length() - 1);
                    }
                    if (var13.field2331 == 84) {
                        Statics.field959.trim();
                        if (Statics.field959.length() != 6) {
                            method2306(class353.field3938, class353.field3939, class353.field3940);
                            return;
                        }
                        Statics.field4623 = Integer.parseInt(Statics.field959);
                        Statics.field959 = "";
                        client.method6247(true);
                        method2306(class353.field4194, class353.field4127, class353.field4170);
                        client.method2854(20);
                        return;
                    }
                    if (var60 && Statics.field959.length() < 6) {
                        Statics.field959 = Statics.field959 + var13.field2330;
                    }
                }
            }
        } else if (field932 == 5) {
            int var62 = field927 + 180 - 80;
            short var63 = 321;
            if (var10 == 1 && var11 >= var62 - 75 && var11 <= var62 + 75 && var12 >= var63 - 20 && var12 <= var63 + 20) {
                method1753();
                return;
            }
            int var64 = field927 + 180 + 80;
            if (var10 == 1 && var11 >= var64 - 75 && var11 <= var64 + 75 && var12 >= var63 - 20 && var12 <= var63 + 20) {
                Statics.method5527(true);
            }
            short var65 = 361;
            if (Statics.field3476 != null) {
                int var66 = Statics.field3476.field4724 / 2;
                if (var10 == 1 && var11 >= Statics.field3476.field4723 - var66 && var11 <= Statics.field3476.field4723 + var66 && var12 >= var65 - 15 && var12 < var65) {
                    class32.method2478(client.method2720("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var13.method3802()) {
                boolean var67 = false;
                for (int var68 = 0; var68 < field946.length(); var68++) {
                    if (var13.field2330 == field946.charAt(var68)) {
                        var67 = true;
                        break;
                    }
                }
                if (var13.field2331 == 13) {
                    Statics.method5527(true);
                } else {
                    if (var13.field2331 == 85 && field934.length() > 0) {
                        field934 = field934.substring(0, field934.length() - 1);
                    }
                    if (var13.field2331 == 84) {
                        method1753();
                        return;
                    }
                    if (var67 && field934.length() < 320) {
                        field934 = field934 + var13.field2330;
                    }
                }
            }
        } else if (field932 == 6) {
            while (true) {
                do {
                    if (!var13.method3802()) {
                        short var69 = 321;
                        if (var10 == 1 && var12 >= var69 - 20 && var12 <= var69 + 20) {
                            Statics.method5527(true);
                        }
                        return;
                    }
                } while (var13.field2331 != 84 && var13.field2331 != 13);
                Statics.method5527(true);
            }
        } else if (field932 == 7) {
            if (Statics.field507 && !client.field525) {
                int var70 = Statics.field1003 - 150;
                int var71 = var70 + 240 + 25 + 40;
                short var72 = 231;
                int var73 = var72 + 40;
                if (var10 == 1 && var11 >= var70 && var11 <= var71 && var12 >= var72 && var12 <= var73) {
                    field939 = method2993(var70, var11);
                }
                int var74 = field927 + 180 - 80;
                short var75 = 321;
                if (var10 == 1 && var11 >= var74 - 75 && var11 <= var74 + 75 && var12 >= var75 - 20 && var12 <= var75 + 20) {
                    boolean var78;
                    label900: {
                        Date var76;
                        try {
                            var76 = method208();
                        } catch (ParseException var131) {
                            method5513(7);
                            method2306("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var78 = false;
                            break label900;
                        }
                        if (var76 == null) {
                            var78 = false;
                        } else {
                            Calendar var79 = Calendar.getInstance();
                            var79.set(1, var79.get(1) - 13);
                            var79.set(5, var79.get(5) + 1);
                            var79.set(11, 0);
                            var79.set(12, 0);
                            var79.set(13, 0);
                            var79.set(14, 0);
                            Date var80 = var79.getTime();
                            boolean var81 = var76.before(var80);
                            boolean var83 = method7581(var76);
                            if (var83) {
                                if (var81) {
                                    Statics.field836 = (int) (var76.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field836 = 8388607;
                                }
                                var78 = true;
                            } else {
                                method5513(7);
                                method2306("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var78 = false;
                            }
                        }
                    }
                    if (var78) {
                        client.method2854(50);
                        return;
                    }
                }
                int var85 = field927 + 180 + 80;
                if (var10 == 1 && var11 >= var85 - 75 && var11 <= var85 + 75 && var12 >= var75 - 20 && var12 <= var75 + 20) {
                    field954 = new String[8];
                    Statics.method5527(true);
                }
                while (var13.method3802()) {
                    if (var13.field2331 == 101) {
                        field954[field939] = null;
                    }
                    if (var13.field2331 == 85) {
                        if (field954[field939] == null && field939 > 0) {
                            field939--;
                        }
                        field954[field939] = null;
                    }
                    if (var13.field2330 >= '0' && var13.field2330 <= '9') {
                        field954[field939] = "" + var13.field2330;
                        if (field939 < 7) {
                            field939++;
                        }
                    }
                    if (var13.field2331 == 84) {
                        boolean var88;
                        label836: {
                            Date var86;
                            try {
                                var86 = method208();
                            } catch (ParseException var130) {
                                method5513(7);
                                method2306("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var88 = false;
                                break label836;
                            }
                            if (var86 == null) {
                                var88 = false;
                            } else {
                                Calendar var89 = Calendar.getInstance();
                                var89.set(1, var89.get(1) - 13);
                                var89.set(5, var89.get(5) + 1);
                                var89.set(11, 0);
                                var89.set(12, 0);
                                var89.set(13, 0);
                                var89.set(14, 0);
                                Date var90 = var89.getTime();
                                boolean var91 = var86.before(var90);
                                boolean var93 = method7581(var86);
                                if (var93) {
                                    if (var91) {
                                        Statics.field836 = (int) (var86.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field836 = 8388607;
                                    }
                                    var88 = true;
                                } else {
                                    method5513(7);
                                    method2306("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var88 = false;
                                }
                            }
                        }
                        if (var88) {
                            client.method2854(50);
                        }
                        return;
                    }
                }
            } else {
                int var95 = field927 + 180 - 80;
                short var96 = 321;
                if (var10 == 1 && var11 >= var95 - 75 && var11 <= var95 + 75 && var12 >= var96 - 20 && var12 <= var96 + 20) {
                    class32.method2478(client.method2720("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2306(class353.field4157, class353.field4158, class353.field4159);
                    method5513(6);
                    return;
                }
                int var97 = field927 + 180 + 80;
                if (var10 == 1 && var11 >= var97 - 75 && var11 <= var97 + 75 && var12 >= var96 - 20 && var12 <= var96 + 20) {
                    Statics.method5527(true);
                }
            }
        } else if (field932 == 8) {
            int var98 = field927 + 180 - 80;
            short var99 = 321;
            if (var10 == 1 && var11 >= var98 - 75 && var11 <= var98 + 75 && var12 >= var99 - 20 && var12 <= var99 + 20) {
                class32.method2478("https://www.jagex.com/terms/privacy", true, false);
                method2306(class353.field4157, class353.field4158, class353.field4159);
                method5513(6);
                return;
            }
            int var100 = field927 + 180 + 80;
            if (var10 == 1 && var11 >= var100 - 75 && var11 <= var100 + 75 && var12 >= var99 - 20 && var12 <= var99 + 20) {
                Statics.method5527(true);
            }
        } else if (field932 == 9) {
            int var101 = field927 + 180;
            short var102 = 311;
            if (var13.field2331 == 84 || var13.field2331 == 13 || var10 == 1 && var11 >= var101 - 75 && var11 <= var101 + 75 && var12 >= var102 - 20 && var12 <= var102 + 20) {
                method5989(false);
            }
        } else if (field932 == 10) {
            int var103 = field927 + 180;
            short var104 = 209;
            if (var13.field2331 == 84 || var10 == 1 && var11 >= var103 - 109 && var11 <= var103 + 109 && var12 >= var104 && var12 <= var104 + 68) {
                method2306(class353.field4194, class353.field4127, class353.field4170);
                client.field557 = class519.field5123;
                client.method6247(false);
                client.method2854(20);
            }
        } else if (field932 == 12) {
            int var105 = Statics.field1003;
            short var106 = 233;
            class447 var107 = arg2.method6809(0, 30, class353.field4189, var105, var106);
            class447 var108 = arg2.method6809(32, 32, class353.field4189, var105, var106);
            class447 var109 = arg2.method6809(70, 34, class353.field4189, var105, var106);
            int var135 = var106 + 17;
            class447 var110 = arg2.method6809(0, 34, class353.field4190, var105, var135);
            if (var10 == 1) {
                if (var107.method7445(var11, var12)) {
                    class32.method2478("https://www.jagex.com/terms", true, false);
                } else if (var108.method7445(var11, var12)) {
                    class32.method2478("https://www.jagex.com/terms/privacy", true, false);
                } else if (var109.method7445(var11, var12) || var110.method7445(var11, var12)) {
                    class32.method2478("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var111 = Statics.field1003 - 80;
            short var112 = 311;
            if (var10 == 1 && var11 >= var111 - 75 && var11 <= var111 + 75 && var12 >= var112 - 20 && var12 <= var112 + 20) {
                Statics.field1686.method2373(client.field522);
                method5989(true);
            }
            int var113 = Statics.field1003 + 80;
            if (var10 == 1 && var11 >= var113 - 75 && var11 <= var113 + 75 && var12 >= var112 - 20 && var12 <= var112 + 20) {
                field932 = 13;
            }
        } else if (field932 == 13) {
            int var114 = Statics.field1003;
            short var115 = 321;
            if (var10 == 1 && var11 >= var114 - 75 && var11 <= var114 + 75 && var12 >= var115 - 20 && var12 <= var115 + 20) {
                method5989(true);
            }
        } else if (field932 == 14) {
            String var116 = "";
            switch(field930) {
                case 0:
                    var116 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var116 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var116 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    Statics.method5527(false);
            }
            int var117 = field927 + 180;
            short var118 = 276;
            if (var10 == 1 && var11 >= var117 - 75 && var11 <= var117 + 75 && var12 >= var118 - 20 && var12 <= var118 + 20) {
                class32.method2478(var116, true, false);
                method2306(class353.field4157, class353.field4158, class353.field4159);
                method5513(6);
                return;
            }
            int var119 = field927 + 180;
            short var120 = 326;
            if (var10 == 1 && var11 >= var119 - 75 && var11 <= var119 + 75 && var12 >= var120 - 20 && var12 <= var120 + 20) {
                Statics.method5527(false);
            }
        } else if (field932 == 24) {
            int var121 = field927 + 180;
            short var122 = 301;
            if (var10 == 1 && var11 >= var121 - 75 && var11 <= var121 + 75 && var12 >= var122 - 20 && var12 <= var122 + 20) {
                method5989(false);
            }
        } else if (field932 == 32) {
            int var123 = field927 + 180 - 80;
            short var124 = 321;
            if (var10 == 1 && var11 >= var123 - 75 && var11 <= var123 + 75 && var12 >= var124 - 20 && var12 <= var124 + 20) {
                class32.method2478(client.method2720("secure", true) + "m=dob/set_dob.ws", true, false);
                method2306(class353.field4157, class353.field4158, class353.field4159);
                method5513(6);
                return;
            }
            int var125 = field927 + 180 + 80;
            if (var10 == 1 && var11 >= var125 - 75 && var11 <= var125 + 75 && var12 >= var124 - 20 && var12 <= var124 + 20) {
                Statics.method5527(true);
            }
        } else if (field932 == 33) {
            int var126 = field927 + 180;
            short var127 = 276;
            if (var10 == 1 && var11 >= var126 - 75 && var11 <= var126 + 75 && var12 >= var127 - 20 && var12 <= var127 + 20) {
                class32.method2478(class353.field4208, true, false);
            }
            int var128 = field927 + 180;
            short var129 = 326;
            if (var10 == 1 && var11 >= var128 - 75 && var11 <= var128 + 75 && var12 >= var129 - 20 && var12 <= var129 + 20) {
                Statics.method5527(true);
            }
        }
    }

    @ObfuscatedName("rp.av(Ljava/util/Date;I)Z")
    public static boolean method7581(Date arg0) {
        Date var1 = method3300();
        return arg0.after(var1);
    }

    @ObfuscatedName("ho.ap(I)Ljava/util/Date;")
    public static Date method3300() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("ae.aq(I)Ljava/util/Date;")
    public static Date method208() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field954;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method5513(7);
                method2306("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("fe.at(III)I")
    public static int method2993(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("ce.ah(CI)Z")
    public static boolean method1113(char arg0) {
        for (int var1 = 0; var1 < field946.length(); var1++) {
            if (arg0 == field946.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("mk.aa(ZB)V")
    public static void method5989(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field1686.method2428() >= client.field522;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field1352.method1196() || Statics.field1352.method1686() || Statics.field1352.method1385()) {
            var1 = 10;
        }
        method5513(var1);
        if (arg0) {
            field934 = "";
            field938 = "";
            Statics.field4623 = 0;
            Statics.field959 = "";
        }
        if (field934 == null || field934.length() <= 0) {
            if (Statics.field1686.method2372() == null) {
                client.field568 = false;
            } else {
                field934 = Statics.field1686.method2372();
                client.field568 = true;
            }
        }
        method6671();
    }

    @ObfuscatedName("cr.au(I)V")
    public static void method1753() {
        field934 = field934.trim();
        if (field934.length() == 0) {
            method2306(class353.field4160, class353.field4120, class353.field4096);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2720("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class514 var4 = new class514(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field5070, var4.field5072, 1000 - var4.field5072);
                if (var5 == -1) {
                    var4.field5072 = 0;
                    long var8 = var4.method8251();
                    var6 = var8;
                    break;
                }
                var4.field5072 += var5;
                if (var4.field5072 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var40) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field934;
            Random var15 = new Random();
            class514 var16 = new class514(128);
            class514 var17 = new class514(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method8227(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method8230(var15.nextInt());
            }
            var16.method8230(var18[0]);
            var16.method8230(var18[1]);
            var16.method8232(var6);
            var16.method8232(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method8230(var15.nextInt());
            }
            var16.method8326(class73.field903, class73.field904);
            var17.method8227(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method8230(var15.nextInt());
            }
            var17.method8232(var15.nextLong());
            var17.method8231(var15.nextLong());
            client.method4578(var17);
            var17.method8232(var15.nextLong());
            var17.method8326(class73.field903, class73.field904);
            int var22 = class514.method8096(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class514 var23 = new class514(var22);
            var23.method8234(var14);
            var23.field5072 = var22;
            var23.method8267(var18);
            class514 var24 = new class514(var23.field5072 + var17.field5072 + var16.field5072 + 5);
            var24.method8227(2);
            var24.method8227(var16.field5072);
            var24.method8237(var16.field5070, 0, var16.field5072);
            var24.method8227(var17.field5072);
            var24.method8237(var17.field5070, 0, var17.field5072);
            var24.method8228(var23.field5072);
            var24.method8237(var23.field5070, 0, var23.field5072);
            String var25 = class387.method6026(var24.field5070);
            byte var32;
            try {
                URL var26 = new URL(client.method2720("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class540.method8073(var25) + "&dest=" + class540.method8073("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class514 var30 = new class514(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field5070, var30.field5072, 1000 - var30.field5072);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field5070);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method8330(var18);
                            while (var30.field5072 > 0 && var30.field5070[var30.field5072 - 1] == 0) {
                                var30.field5072--;
                            }
                            String var34 = new String(var30.field5070, 0, var30.field5072);
                            boolean var35;
                            if (var34 == null) {
                                var35 = false;
                            } else {
                                label100: {
                                    try {
                                        new URL(var34);
                                    } catch (MalformedURLException var38) {
                                        var35 = false;
                                        break label100;
                                    }
                                    var35 = true;
                                }
                            }
                            if (var35) {
                                class32.method2478(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field5072 += var31;
                    if (var30.field5072 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var39) {
                var39.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method2306(class353.field3909, class353.field4164, class353.field4035);
                method5513(6);
                break;
            case 3:
                method2306(class353.field4166, class353.field4167, class353.field4168);
                break;
            case 4:
                method2306(class353.field4113, class353.field4097, class353.field4181);
                break;
            case 5:
                method2306(class353.field4172, class353.field4173, class353.field4174);
                break;
            case 6:
                method2306(class353.field4175, class353.field4176, class353.field4177);
                break;
            case 7:
                method2306(class353.field4178, class353.field4062, class353.field4180);
        }
    }

    @ObfuscatedName("pt.ae(Lpc;Lpc;Lpc;I)V")
    public static void method6795(class395 arg0, class395 arg1, class395 arg2) {
        field940 = (Statics.field4328 - 765) / 2;
        field927 = field940 + 202;
        Statics.field1003 = field927 + 180;
        if (field950) {
            method4666(arg0, arg1);
            return;
        }
        Statics.field4532.method8707(field940, 0);
        Statics.field493.method8707(field940 + 382, 0);
        Statics.field958.method8673(field940 + 382 - Statics.field958.field5157 / 2, 18);
        if (client.field813 == 0 || client.field813 == 5) {
            byte var3 = 20;
            arg0.method6813(class353.field4077, field927 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class524.method8574(field927 + 180 - 152, var4, 304, 34, 9179409);
            class524.method8574(field927 + 180 - 151, var4 + 1, 302, 32, 0);
            class524.method8582(field927 + 180 - 150, var4 + 2, field943 * 3, 30, 9179409);
            class524.method8582(field943 * 3 + (field927 + 180 - 150), var4 + 2, 300 - field943 * 3, 30, 0);
            arg0.method6813(field929, field927 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field813 == 20) {
            Statics.field923.method8673(field927 + 180 - Statics.field923.field5157 / 2, 271 - Statics.field923.field5155 / 2);
            short var5 = 201;
            arg0.method6813(field947, field927 + 180, var5, 16776960, 0);
            int var127 = var5 + 15;
            arg0.method6813(field928, field927 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            arg0.method6813(field936, field927 + 180, var128, 16776960, 0);
            int var129 = var128 + 15;
            int var130 = var129 + 7;
            if (field932 != 4 && field932 != 10) {
                arg0.method6810(class353.field4135, field927 + 180 - 110, var130, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method179(); arg0.method6864(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method6810(class399.method6808(var7), field927 + 180 - 70, var130, 16777215, 0);
                var127 = var130 + 15;
                String var8 = field938;
                int var9 = var8.length();
                char[] var10 = new char[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var10[var11] = '*';
                }
                String var12 = new String(var10);
                String var14;
                for (var14 = var12; arg0.method6864(var14) > var6; var14 = var14.substring(1)) {
                }
                arg0.method6810(class353.field4136 + var14, field927 + 180 - 108, var127, 16777215, 0);
                var127 += 15;
            }
        }
        if (client.field813 == 10 || client.field813 == 11 || client.field813 == 50) {
            Statics.field923.method8673(field927, 171);
            if (field932 == 0) {
                short var15 = 251;
                arg0.method6813(class353.field4138, field927 + 180, var15, 16776960, 0);
                int var131 = var15 + 30;
                int var16 = field927 + 180 - 80;
                short var17 = 291;
                Statics.field924.method8673(var16 - 73, var17 - 20);
                arg0.method6877(class353.field4139, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var18 = field927 + 180 + 80;
                Statics.field924.method8673(var18 - 73, var17 - 20);
                arg0.method6877(class353.field4140, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field932 == 1) {
                arg0.method6813(field933, field927 + 180, 201, 16776960, 0);
                short var19 = 236;
                arg0.method6813(field947, field927 + 180, var19, 16777215, 0);
                int var132 = var19 + 15;
                arg0.method6813(field928, field927 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method6813(field936, field927 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                int var20 = field927 + 180 - 80;
                short var21 = 321;
                Statics.field924.method8673(var20 - 73, var21 - 20);
                arg0.method6813(class353.field4105, var20, var21 + 5, 16777215, 0);
                int var22 = field927 + 180 + 80;
                Statics.field924.method8673(var22 - 73, var21 - 20);
                arg0.method6813(class353.field4055, var22, var21 + 5, 16777215, 0);
            } else if (field932 == 2) {
                short var23 = 201;
                arg0.method6813(field947, Statics.field1003, var23, 16776960, 0);
                int var135 = var23 + 15;
                arg0.method6813(field928, Statics.field1003, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method6813(field936, Statics.field1003, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var138 = var137 + 7;
                arg0.method6810(class353.field4135, Statics.field1003 - 110, var138, 16777215, 0);
                short var24 = 200;
                String var25;
                for (var25 = method179(); arg0.method6864(var25) > var24; var25 = var25.substring(1)) {
                }
                arg0.method6810(class399.method6808(var25) + (field945 == 0 & client.field530 % 40 < 20 ? class102.method5443(16776960) + class102.field1327 : ""), Statics.field1003 - 70, var138, 16777215, 0);
                var135 = var138 + 15;
                String var26 = field938;
                int var27 = var26.length();
                char[] var28 = new char[var27];
                for (int var29 = 0; var29 < var27; var29++) {
                    var28[var29] = '*';
                }
                String var30 = new String(var28);
                String var32;
                for (var32 = var30; arg0.method6864(var32) > var24; var32 = var32.substring(1)) {
                }
                arg0.method6810(class353.field4136 + var32 + (field945 == 1 & client.field530 % 40 < 20 ? class102.method5443(16776960) + class102.field1327 : ""), Statics.field1003 - 108, var135, 16777215, 0);
                var135 += 15;
                short var33 = 277;
                int var34 = Statics.field1003 + -117;
                class527 var35 = method773(client.field568, field956);
                var35.method8673(var34, var33);
                int var36 = var35.field5157 + 5 + var34;
                arg1.method6810(class353.field4143, var36, var33 + 13, 16776960, 0);
                int var37 = Statics.field1003 + 24;
                class527 var38 = method773(Statics.field1686.method2356(), field948);
                var38.method8673(var37, var33);
                int var39 = var38.field5157 + 5 + var37;
                arg1.method6810(class353.field4144, var39, var33 + 13, 16776960, 0);
                int var139 = var33 + 15;
                int var40 = Statics.field1003 - 80;
                short var41 = 321;
                Statics.field924.method8673(var40 - 73, var41 - 20);
                arg0.method6813(class353.field4141, var40, var41 + 5, 16777215, 0);
                int var42 = Statics.field1003 + 80;
                Statics.field924.method8673(var42 - 73, var41 - 20);
                arg0.method6813(class353.field4055, var42, var41 + 5, 16777215, 0);
                short var43 = 357;
                switch(field931) {
                    case 2:
                        Statics.field235 = class353.field4156;
                        break;
                    default:
                        Statics.field235 = class353.field4154;
                }
                Statics.field3841 = new class447(Statics.field1003, var43, arg1.method6864(Statics.field235), 11);
                Statics.field3476 = new class447(Statics.field1003, var43, arg1.method6864(class353.field4075), 11);
                arg1.method6813(Statics.field235, Statics.field1003, var43, 16777215, 0);
            } else if (field932 == 3) {
                short var44 = 201;
                arg0.method6813(class353.field3916, field927 + 180, var44, 16776960, 0);
                int var140 = var44 + 20;
                arg1.method6813(class353.field4146, field927 + 180, var140, 16776960, 0);
                int var141 = var140 + 20;
                arg1.method6813(class353.field4043, field927 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var45 = field927 + 180;
                short var46 = 276;
                Statics.field924.method8673(var45 - 73, var46 - 20);
                arg2.method6813(class353.field4148, var45, var46 + 5, 16777215, 0);
                int var47 = field927 + 180;
                short var48 = 326;
                Statics.field924.method8673(var47 - 73, var48 - 20);
                arg2.method6813(class353.field4098, var47, var48 + 5, 16777215, 0);
            } else if (field932 == 4) {
                arg0.method6813(class353.field4124, field927 + 180, 201, 16776960, 0);
                short var49 = 236;
                arg0.method6813(field947, field927 + 180, var49, 16777215, 0);
                int var143 = var49 + 15;
                arg0.method6813(field928, field927 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                arg0.method6813(field936, field927 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                String var51 = class353.field4027;
                String var52 = Statics.field959;
                int var53 = var52.length();
                char[] var54 = new char[var53];
                for (int var55 = 0; var55 < var53; var55++) {
                    var54[var55] = '*';
                }
                String var56 = new String(var54);
                arg0.method6810(var51 + var56 + (client.field530 % 40 < 20 ? class102.method5443(16776960) + class102.field1327 : ""), field927 + 180 - 108, var145, 16777215, 0);
                var143 = var145 - 8;
                arg0.method6810(class353.field4022, field927 + 180 - 9, var143, 16776960, 0);
                var143 += 15;
                arg0.method6810(class353.field3981, field927 + 180 - 9, var143, 16776960, 0);
                int var58 = field927 + 180 - 9 + arg0.method6864(class353.field3981) + 15;
                int var59 = var143 - arg0.field4493;
                class527 var60;
                if (field944) {
                    var60 = Statics.field64;
                } else {
                    var60 = Statics.field2863;
                }
                var60.method8673(var58, var59);
                var143 += 15;
                int var61 = field927 + 180 - 80;
                short var62 = 321;
                Statics.field924.method8673(var61 - 73, var62 - 20);
                arg0.method6813(class353.field4105, var61, var62 + 5, 16777215, 0);
                int var63 = field927 + 180 + 80;
                Statics.field924.method8673(var63 - 73, var62 - 20);
                arg0.method6813(class353.field4055, var63, var62 + 5, 16777215, 0);
                arg1.method6813(class353.field4080, field927 + 180, var62 + 36, 255, 0);
            } else if (field932 == 5) {
                arg0.method6813(class353.field4150, field927 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method6813(field947, field927 + 180, var64, 16776960, 0);
                int var146 = var64 + 15;
                arg2.method6813(field928, field927 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg2.method6813(field936, field927 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                int var149 = var148 + 14;
                arg0.method6810(class353.field4151, field927 + 180 - 145, var149, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = method179(); arg0.method6864(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method6810(class399.method6808(var66) + (client.field530 % 40 < 20 ? class102.method5443(16776960) + class102.field1327 : ""), field927 + 180 - 34, var149, 16777215, 0);
                var146 = var149 + 15;
                int var67 = field927 + 180 - 80;
                short var68 = 321;
                Statics.field924.method8673(var67 - 73, var68 - 20);
                arg0.method6813(class353.field4152, var67, var68 + 5, 16777215, 0);
                int var69 = field927 + 180 + 80;
                Statics.field924.method8673(var69 - 73, var68 - 20);
                arg0.method6813(class353.field4153, var69, var68 + 5, 16777215, 0);
                short var70 = 356;
                arg1.method6813(class353.field4075, Statics.field1003, var70, 268435455, 0);
            } else if (field932 == 6) {
                short var71 = 201;
                arg0.method6813(field947, field927 + 180, var71, 16776960, 0);
                int var150 = var71 + 15;
                arg0.method6813(field928, field927 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg0.method6813(field936, field927 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var72 = field927 + 180;
                short var73 = 321;
                Statics.field924.method8673(var72 - 73, var73 - 20);
                arg0.method6813(class353.field4153, var72, var73 + 5, 16777215, 0);
            } else if (field932 == 7) {
                if (Statics.field507 && !client.field525) {
                    short var74 = 201;
                    arg0.method6813(field947, Statics.field1003, var74, 16776960, 0);
                    int var153 = var74 + 15;
                    arg0.method6813(field928, Statics.field1003, var153, 16776960, 0);
                    int var154 = var153 + 15;
                    arg0.method6813(field936, Statics.field1003, var154, 16776960, 0);
                    int var75 = Statics.field1003 - 150;
                    int var155 = var154 + 10;
                    for (int var76 = 0; var76 < 8; var76++) {
                        Statics.field924.method8683(var75, var155, 30, 40);
                        boolean var77 = field939 == var76 & client.field530 % 40 < 20;
                        arg0.method6810((field954[var76] == null ? "" : field954[var76]) + (var77 ? class102.method5443(16776960) + class102.field1327 : ""), var75 + 10, var155 + 27, 16777215, 0);
                        if (var76 == 1 || var76 == 3) {
                            var75 += 50;
                            arg0.method6810(class399.method6808("/"), var75 - 13, var155 + 27, 16777215, 0);
                        } else {
                            var75 += 35;
                        }
                    }
                    int var78 = Statics.field1003 - 80;
                    short var79 = 321;
                    Statics.field924.method8673(var78 - 73, var79 - 20);
                    arg0.method6813("Submit", var78, var79 + 5, 16777215, 0);
                    int var80 = Statics.field1003 + 80;
                    Statics.field924.method8673(var80 - 73, var79 - 20);
                    arg0.method6813(class353.field4055, var80, var79 + 5, 16777215, 0);
                } else {
                    short var81 = 216;
                    arg0.method6813(class353.field3919, field927 + 180, var81, 16776960, 0);
                    int var156 = var81 + 15;
                    arg2.method6813(class353.field4182, field927 + 180, var156, 16776960, 0);
                    int var157 = var156 + 15;
                    arg2.method6813(class353.field4183, field927 + 180, var157, 16776960, 0);
                    int var158 = var157 + 15;
                    int var82 = field927 + 180 - 80;
                    short var83 = 321;
                    Statics.field924.method8673(var82 - 73, var83 - 20);
                    arg0.method6813(class353.field3987, var82, var83 + 5, 16777215, 0);
                    int var84 = field927 + 180 + 80;
                    Statics.field924.method8673(var84 - 73, var83 - 20);
                    arg0.method6813(class353.field4153, var84, var83 + 5, 16777215, 0);
                }
            } else if (field932 == 8) {
                short var85 = 216;
                arg0.method6813(class353.field4037, field927 + 180, var85, 16776960, 0);
                int var159 = var85 + 15;
                arg2.method6813(class353.field4038, field927 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg2.method6813(class353.field4039, field927 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var86 = field927 + 180 - 80;
                short var87 = 321;
                Statics.field924.method8673(var86 - 73, var87 - 20);
                arg0.method6813(class353.field4061, var86, var87 + 5, 16777215, 0);
                int var88 = field927 + 180 + 80;
                Statics.field924.method8673(var88 - 73, var87 - 20);
                arg0.method6813(class353.field4153, var88, var87 + 5, 16777215, 0);
            } else if (field932 == 9) {
                short var89 = 221;
                arg0.method6813(field947, field927 + 180, var89, 16776960, 0);
                int var162 = var89 + 25;
                arg0.method6813(field928, field927 + 180, var162, 16776960, 0);
                int var163 = var162 + 25;
                arg0.method6813(field936, field927 + 180, var163, 16776960, 0);
                int var90 = field927 + 180;
                short var91 = 311;
                Statics.field924.method8673(var90 - 73, var91 - 20);
                arg0.method6813(class353.field4148, var90, var91 + 5, 16777215, 0);
            } else if (field932 == 10) {
                int var92 = field927 + 180;
                short var93 = 209;
                arg0.method6813(class353.field4138, field927 + 180, var93, 16776960, 0);
                int var164 = var93 + 20;
                Statics.field925.method8673(var92 - 109, var164);
                if (field941.isEmpty()) {
                    Statics.field3793.method8673(var92 - 48, var164 + 18);
                } else {
                    Statics.field3793.method8673(var92 - 48, var164 + 5);
                    arg0.method6813(field941, var92, var164 + 68 - 15, 16776960, 0);
                }
            } else if (field932 == 12) {
                int var94 = Statics.field1003;
                short var95 = 216;
                arg2.method6813(class353.field4188, var94, var95, 16777215, 0);
                int var165 = var95 + 17;
                arg2.method6813(class353.field4189, var94, var165, 16777215, 0);
                int var166 = var165 + 17;
                arg2.method6813(class353.field4190, var94, var166, 16777215, 0);
                int var167 = var166 + 17;
                arg2.method6813(class353.field4191, var94, var167, 16777215, 0);
                int var96 = Statics.field1003 - 80;
                short var97 = 311;
                Statics.field924.method8673(var96 - 73, var97 - 20);
                arg0.method6813(class353.field4085, var96, var97 + 5, 16777215, 0);
                int var98 = Statics.field1003 + 80;
                Statics.field924.method8673(var98 - 73, var97 - 20);
                arg0.method6813(class353.field4195, var98, var97 + 5, 16777215, 0);
            } else if (field932 == 13) {
                short var99 = 231;
                arg2.method6813(class353.field4192, field927 + 180, var99, 16777215, 0);
                int var168 = var99 + 20;
                arg2.method6813(class353.field4193, field927 + 180, var168, 16777215, 0);
                int var100 = field927 + 180;
                short var101 = 311;
                Statics.field924.method8673(var100 - 73, var101 - 20);
                arg0.method6813(class353.field4153, var100, var101 + 5, 16777215, 0);
            } else if (field932 == 14) {
                short var102 = 201;
                String var103 = "";
                String var104 = "";
                String var105 = "";
                switch(field930) {
                    case 0:
                        var103 = class353.field3953;
                        var104 = class353.field4145;
                        var105 = class353.field3955;
                        break;
                    case 1:
                        var103 = class353.field3992;
                        var104 = class353.field3900;
                        var105 = class353.field3994;
                        break;
                    case 2:
                        var103 = class353.field3908;
                        var104 = class353.field3963;
                        var105 = class353.field4147;
                        break;
                    default:
                        Statics.method5527(false);
                }
                arg0.method6813(var103, field927 + 180, var102, 16776960, 0);
                int var169 = var102 + 20;
                arg0.method6813(var104, field927 + 180, var169, 16776960, 0);
                int var170 = var169 + 20;
                arg0.method6813(var105, field927 + 180, var170, 16776960, 0);
                int var106 = field927 + 180;
                short var107 = 276;
                Statics.field924.method8673(var106 - 73, var107 - 20);
                if (field930 == 1) {
                    arg0.method6813(class353.field3937, var106, var107 + 5, 16777215, 0);
                } else {
                    arg0.method6813(class353.field4092, var106, var107 + 5, 16777215, 0);
                }
                int var108 = field927 + 180;
                short var109 = 326;
                Statics.field924.method8673(var108 - 73, var109 - 20);
                arg0.method6813(class353.field4153, var108, var109 + 5, 16777215, 0);
            } else if (field932 == 24) {
                short var110 = 221;
                arg0.method6813(field947, field927 + 180, var110, 16777215, 0);
                int var171 = var110 + 15;
                arg0.method6813(field928, field927 + 180, var171, 16777215, 0);
                int var172 = var171 + 15;
                arg0.method6813(field936, field927 + 180, var172, 16777215, 0);
                int var173 = var172 + 15;
                int var111 = field927 + 180;
                short var112 = 301;
                Statics.field924.method8673(var111 - 73, var112 - 20);
                arg0.method6813(class353.field4117, var111, var112 + 5, 16777215, 0);
            } else if (field932 == 32) {
                short var113 = 216;
                arg0.method6813(class353.field3919, field927 + 180, var113, 16776960, 0);
                int var174 = var113 + 15;
                arg2.method6813(class353.field4182, field927 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                arg2.method6813(class353.field4183, field927 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                int var114 = field927 + 180 - 80;
                short var115 = 321;
                Statics.field924.method8673(var114 - 73, var115 - 20);
                arg0.method6813(class353.field3987, var114, var115 + 5, 16777215, 0);
                int var116 = field927 + 180 + 80;
                Statics.field924.method8673(var116 - 73, var115 - 20);
                arg0.method6813(class353.field4153, var116, var115 + 5, 16777215, 0);
            } else if (field932 == 33) {
                short var117 = 201;
                arg0.method6813(field947, field927 + 180, var117, 16776960, 0);
                int var177 = var117 + 20;
                arg1.method6813(field928, field927 + 180, var177, 16776960, 0);
                int var178 = var177 + 20;
                arg1.method6813(field936, field927 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                int var118 = field927 + 180;
                short var119 = 276;
                Statics.field924.method8673(var118 - 73, var119 - 20);
                arg2.method6813(class353.field4207, var118, var119 + 5, 16777215, 0);
                int var120 = field927 + 180;
                short var121 = 326;
                Statics.field924.method8673(var120 - 73, var121 - 20);
                arg2.method6813(class353.field4153, var120, var121 + 5, 16777215, 0);
            }
        }
        if (client.field813 >= 10) {
            int[] var122 = new int[4];
            class524.method8591(var122);
            class524.method8655(field940, 0, field940 + 765, Statics.field4883);
            Statics.field1787.method2343(field940 - 22, client.field530);
            Statics.field1787.method2343(field940 + 765 + 22 - 128, client.field530);
            class524.method8577(var122);
        }
        Statics.field3378[Statics.field1686.method2358() ? 1 : 0].method8673(field940 + 765 - 40, 463);
        if (client.field813 <= 5 || Statics.field884 != class375.field4384) {
            return;
        }
        if (Statics.field4785 == null) {
            Statics.field4785 = class529.method7552(Statics.field4437, "sl_button", "");
            return;
        }
        int var123 = field940 + 5;
        short var124 = 463;
        byte var125 = 100;
        byte var126 = 35;
        Statics.field4785.method8673(var123, var124);
        arg0.method6813(class353.field3936 + " " + client.field517, var125 / 2 + var123, var126 / 2 + var124 - 2, 16777215, 0);
        if (Statics.field823 == null) {
            arg1.method6813(class353.field4206, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        } else {
            arg1.method6813(class353.field3912, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("dx.ab(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2306(String arg0, String arg1, String arg2) {
        field947 = arg0;
        field928 = arg1;
        field936 = arg2;
    }

    @ObfuscatedName("jn.ad(Lpc;Lpc;I)V")
    public static void method4666(class395 arg0, class395 arg1) {
        if (Statics.field1559 == null) {
            class358 var2 = Statics.field4437;
            class528[] var3;
            if (var2.method6135("sl_back", "")) {
                int var4 = var2.method6129("sl_back");
                int var5 = var2.method6134(var4, "");
                var3 = class529.method7579(var2, var4, var5);
            } else {
                var3 = null;
            }
            Statics.field1559 = var3;
        }
        if (Statics.field3089 == null) {
            Statics.field3089 = class529.method7668(Statics.field4437, "sl_flags", "");
        }
        if (Statics.field171 == null) {
            Statics.field171 = class529.method7668(Statics.field4437, "sl_arrows", "");
        }
        if (Statics.field2383 == null) {
            Statics.field2383 = class529.method7668(Statics.field4437, "sl_stars", "");
        }
        if (Statics.field358 == null) {
            Statics.field358 = class529.method7552(Statics.field4437, "leftarrow", "");
        }
        if (Statics.field4958 == null) {
            Statics.field4958 = class529.method7552(Statics.field4437, "rightarrow", "");
        }
        class524.method8582(field940, 23, 765, 480, 0);
        class524.method8576(field940, 0, 125, 23, 12425273, 9135624);
        class524.method8576(field940 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6813(class353.field4103, field940 + 62, 15, 0, -1);
        if (Statics.field2383 != null) {
            Statics.field2383[1].method8673(field940 + 140, 1);
            arg1.method6810(class353.field4054, field940 + 152, 10, 16777215, -1);
            Statics.field2383[0].method8673(field940 + 140, 12);
            arg1.method6810(class353.field4198, field940 + 152, 21, 16777215, -1);
        }
        if (Statics.field171 != null) {
            int var6 = field940 + 280;
            if (class68.field826[0] == 0 && class68.field838[0] == 0) {
                Statics.field171[2].method8673(var6, 4);
            } else {
                Statics.field171[0].method8673(var6, 4);
            }
            if (class68.field826[0] == 0 && class68.field838[0] == 1) {
                Statics.field171[3].method8673(var6 + 15, 4);
            } else {
                Statics.field171[1].method8673(var6 + 15, 4);
            }
            arg0.method6810(class353.field4199, var6 + 32, 17, 16777215, -1);
            int var7 = field940 + 390;
            if (class68.field826[0] == 1 && class68.field838[0] == 0) {
                Statics.field171[2].method8673(var7, 4);
            } else {
                Statics.field171[0].method8673(var7, 4);
            }
            if (class68.field826[0] == 1 && class68.field838[0] == 1) {
                Statics.field171[3].method8673(var7 + 15, 4);
            } else {
                Statics.field171[1].method8673(var7 + 15, 4);
            }
            arg0.method6810(class353.field4200, var7 + 32, 17, 16777215, -1);
            int var8 = field940 + 500;
            if (class68.field826[0] == 2 && class68.field838[0] == 0) {
                Statics.field171[2].method8673(var8, 4);
            } else {
                Statics.field171[0].method8673(var8, 4);
            }
            if (class68.field826[0] == 2 && class68.field838[0] == 1) {
                Statics.field171[3].method8673(var8 + 15, 4);
            } else {
                Statics.field171[1].method8673(var8 + 15, 4);
            }
            arg0.method6810(class353.field4201, var8 + 32, 17, 16777215, -1);
            int var9 = field940 + 610;
            if (class68.field826[0] == 3 && class68.field838[0] == 0) {
                Statics.field171[2].method8673(var9, 4);
            } else {
                Statics.field171[0].method8673(var9, 4);
            }
            if (class68.field826[0] == 3 && class68.field838[0] == 1) {
                Statics.field171[3].method8673(var9 + 15, 4);
            } else {
                Statics.field171[1].method8673(var9 + 15, 4);
            }
            arg0.method6810(class353.field3898, var9 + 32, 17, 16777215, -1);
        }
        class524.method8582(field940 + 708, 4, 50, 16, 0);
        arg1.method6813(class353.field4055, field940 + 708 + 25, 16, 16777215, -1);
        field949 = -1;
        if (Statics.field1559 != null) {
            byte var10 = 88;
            byte var11 = 19;
            int var12 = 765 / (var10 + 1) - 1;
            int var13 = 480 / (var11 + 1);
            int var14;
            int var15;
            do {
                var14 = var13;
                var15 = var12;
                if ((var12 - 1) * var13 >= class68.field829) {
                    var12--;
                }
                if ((var13 - 1) * var12 >= class68.field829) {
                    var13--;
                }
                if ((var13 - 1) * var12 >= class68.field829) {
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
            int var20 = (class68.field829 + var13 - 1) / var13;
            field951 = var20 - var12;
            if (Statics.field358 != null && field942 > 0) {
                Statics.field358.method8673(8, Statics.field4883 / 2 - Statics.field358.field5155 / 2);
            }
            if (Statics.field4958 != null && field942 < field951) {
                Statics.field4958.method8673(Statics.field4328 - Statics.field4958.field5157 - 8, Statics.field4883 / 2 - Statics.field4958.field5155 / 2);
            }
            int var21 = var19 + 23;
            int var22 = field940 + var18;
            int var23 = 0;
            boolean var24 = false;
            int var25 = field942;
            for (int var26 = var13 * var25; var26 < class68.field829 && var25 - field942 < var12; var26++) {
                class68 var27 = Statics.field4440[var26];
                boolean var28 = true;
                String var29 = Integer.toString(var27.field822);
                if (var27.field822 == -1) {
                    var29 = class353.field3956;
                    var28 = false;
                } else if (var27.field822 > 1980) {
                    var29 = class353.field4021;
                    var28 = false;
                }
                class109 var30 = null;
                int var31 = 0;
                if (var27.method1723()) {
                    var30 = var27.method1760() ? class109.field1385 : class109.field1390;
                } else if (var27.method1718()) {
                    var30 = var27.method1760() ? class109.field1387 : class109.field1392;
                } else if (var27.method1755()) {
                    var31 = 16711680;
                    var30 = var27.method1760() ? class109.field1383 : class109.field1393;
                } else if (var27.method1724()) {
                    var30 = var27.method1760() ? class109.field1382 : class109.field1386;
                } else if (var27.method1745()) {
                    var30 = var27.method1760() ? class109.field1381 : class109.field1380;
                } else if (var27.method1725()) {
                    var30 = var27.method1760() ? class109.field1394 : class109.field1388;
                } else if (var27.method1726()) {
                    var30 = var27.method1760() ? class109.field1391 : class109.field1378;
                }
                if (var30 == null || var30.field1389 >= Statics.field1559.length) {
                    var30 = var27.method1760() ? class109.field1379 : class109.field1384;
                }
                if (class36.field245 >= var22 && class36.field246 >= var21 && class36.field245 < var10 + var22 && class36.field246 < var11 + var21 && var28) {
                    field949 = var26;
                    Statics.field1559[var30.field1389].method8713(var22, var21, 128, 16777215);
                    var24 = true;
                } else {
                    Statics.field1559[var30.field1389].method8707(var22, var21);
                }
                if (Statics.field3089 != null) {
                    Statics.field3089[(var27.method1760() ? 8 : 0) + var27.field833].method8673(var22 + 29, var21);
                }
                arg0.method6813(Integer.toString(var27.field825), var22 + 15, var11 / 2 + var21 + 5, var31, -1);
                arg1.method6813(var29, var22 + 60, var11 / 2 + var21 + 5, 268435455, -1);
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
                int var32 = arg1.method6864(Statics.field4440[field949].field832) + 6;
                int var33 = arg1.field4493 + 8;
                int var34 = class36.field246 + 25;
                if (var33 + var34 > 480) {
                    var34 = class36.field246 - 25 - var33;
                }
                class524.method8582(class36.field245 - var32 / 2, var34, var32, var33, 16777120);
                class524.method8574(class36.field245 - var32 / 2, var34, var32, var33, 0);
                arg1.method6813(Statics.field4440[field949].field832, class36.field245, arg1.field4493 + var34 + 4, 0, -1);
            }
        }
        Statics.field1742.method453(0, 0);
    }

    @ObfuscatedName("ac.ao(Lbq;I)V")
    public static void method280(class35 arg0) {
        class214 var1 = client.method4579();
        while (var1.method3802()) {
            if (var1.field2331 == 13) {
                field950 = false;
                Statics.field4532.method8707(field940, 0);
                Statics.field493.method8707(field940 + 382, 0);
                Statics.field958.method8673(field940 + 382 - Statics.field958.field5157 / 2, 18);
                return;
            }
            if (var1.field2331 == 96) {
                if (field942 > 0 && Statics.field358 != null) {
                    field942--;
                }
            } else if (var1.field2331 == 97 && field942 < field951 && Statics.field4958 != null) {
                field942++;
            }
        }
        if (class36.field252 != 1 && Statics.field170 || class36.field252 != 4) {
            return;
        }
        int var2 = field940 + 280;
        if (class36.field253 >= var2 && class36.field253 <= var2 + 14 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(0, 0);
            return;
        }
        if (class36.field253 >= var2 + 15 && class36.field253 <= var2 + 80 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(0, 1);
            return;
        }
        int var3 = field940 + 390;
        if (class36.field253 >= var3 && class36.field253 <= var3 + 14 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(1, 0);
            return;
        }
        if (class36.field253 >= var3 + 15 && class36.field253 <= var3 + 80 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(1, 1);
            return;
        }
        int var4 = field940 + 500;
        if (class36.field253 >= var4 && class36.field253 <= var4 + 14 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(2, 0);
            return;
        }
        if (class36.field253 >= var4 + 15 && class36.field253 <= var4 + 80 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(2, 1);
            return;
        }
        int var5 = field940 + 610;
        if (class36.field253 >= var5 && class36.field253 <= var5 + 14 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(3, 0);
            return;
        }
        if (class36.field253 >= var5 + 15 && class36.field253 <= var5 + 80 && class36.field254 >= 4 && class36.field254 <= 18) {
            class68.method5181(3, 1);
            return;
        }
        if (class36.field253 >= field940 + 708 && class36.field254 >= 4 && class36.field253 <= field940 + 708 + 50 && class36.field254 <= 20) {
            field950 = false;
            Statics.field4532.method8707(field940, 0);
            Statics.field493.method8707(field940 + 382, 0);
            Statics.field958.method8673(field940 + 382 - Statics.field958.field5157 / 2, 18);
            return;
        }
        if (field949 != -1) {
            class68 var6 = Statics.field4440[field949];
            if (var6.method1718()) {
                var6.field824 = "beta";
            }
            boolean var7 = false;
            if (client.field518 != var6.field828) {
                boolean var8 = (client.field518 & 0x10000) != 0;
                boolean var9 = var6.method1718();
                if (var8 && !var9 || !var8 && var9) {
                    var7 = true;
                }
            }
            method2913(var6);
            field950 = false;
            Statics.field4532.method8707(field940, 0);
            Statics.field493.method8707(field940 + 382, 0);
            Statics.field958.method8673(field940 + 382 - Statics.field958.field5157 / 2, 18);
            if (var7) {
                client.method2182();
            }
            return;
        }
        if (field942 > 0 && Statics.field358 != null && class36.field253 >= 0 && class36.field253 <= Statics.field358.field5157 && class36.field254 >= Statics.field4883 / 2 - 50 && class36.field254 <= Statics.field4883 / 2 + 50) {
            field942--;
        }
        if (field942 < field951 && Statics.field4958 != null && class36.field253 >= Statics.field4328 - Statics.field4958.field5157 - 5 && class36.field253 <= Statics.field4328 && class36.field254 >= Statics.field4883 / 2 - 50 && class36.field254 <= Statics.field4883 / 2 + 50) {
            field942++;
        }
    }

    @ObfuscatedName("fz.ac(Lcr;I)V")
    public static void method2913(class68 arg0) {
        if (arg0.method1760() != client.field520) {
            client.field520 = arg0.method1760();
            class208.method2271(arg0.method1760());
        }
        if (client.field518 != arg0.field828) {
            method7161(Statics.field4437, arg0.field828);
        }
        Statics.field2094 = arg0.field831;
        client.field517 = arg0.field825;
        client.field518 = arg0.field828;
        Statics.field1911 = arg0.field824;
        Statics.field926 = client.field519 == 0 ? 43594 : arg0.field825 + 40000;
        Statics.field60 = client.field519 == 0 ? 443 : arg0.field825 + 50000;
        Statics.field3535 = Statics.field926;
    }

    @ObfuscatedName("mz.ak(II)V")
    public static void method5513(int arg0) {
        if (field932 != arg0) {
            field932 = arg0;
        }
    }

    @ObfuscatedName("du.an(I)I")
    public static int method2263() {
        return field932;
    }
}
