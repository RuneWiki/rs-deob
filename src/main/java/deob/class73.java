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

@ObfuscatedName("bu")
public class class73 {

    @ObfuscatedName("bu.v")
    public static int field918 = 0;

    @ObfuscatedName("bu.p")
    public static int field942 = field918 + 202;

    @ObfuscatedName("bu.y")
    public static int field926 = 10;

    @ObfuscatedName("bu.z")
    public static String field927 = "";

    @ObfuscatedName("bu.ah")
    public static int field925 = -1;

    @ObfuscatedName("bu.aq")
    public static int field929 = 1;

    @ObfuscatedName("bu.ac")
    public static int field945 = 0;

    @ObfuscatedName("bu.bh")
    public static String field932 = "";

    @ObfuscatedName("bu.be")
    public static String field917 = "";

    @ObfuscatedName("bu.bf")
    public static String field934 = "";

    @ObfuscatedName("bu.bo")
    public static String field955 = "";

    @ObfuscatedName("bu.by")
    public static String field941 = "";

    @ObfuscatedName("bu.bw")
    public static String field937 = "";

    @ObfuscatedName("bu.bc")
    public static int field939 = 0;

    @ObfuscatedName("bu.bl")
    public static String[] field916 = new String[8];

    @ObfuscatedName("bu.bt")
    public static boolean field940 = false;

    @ObfuscatedName("bu.bu")
    public static boolean field956 = false;

    @ObfuscatedName("bu.bm")
    public static boolean field931 = true;

    @ObfuscatedName("bu.bk")
    public static int field943 = 0;

    @ObfuscatedName("bu.bd")
    public static String field944 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bu.cf")
    public static String field953 = "1234567890";

    @ObfuscatedName("bu.cq")
    public static boolean field946 = false;

    @ObfuscatedName("bu.cj")
    public static int field947 = -1;

    @ObfuscatedName("bu.cn")
    public static int field948 = 0;

    @ObfuscatedName("bu.cm")
    public static int field949 = 0;

    @ObfuscatedName("bu.cu")
    public static long field938;

    @ObfuscatedName("bu.co")
    public static long field951;

    @ObfuscatedName("bu.ch")
    public static String[] field935;

    @ObfuscatedName("bu.ce")
    public static String[] field933;

    @ObfuscatedName("bu.cg")
    public static String[] field954;

    static {
        new DecimalFormat("##0.00");
        new class129();
        field938 = -1L;
        field951 = -1L;
        field935 = new String[] { "title.jpg" };
        field933 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field954 = new String[] { "logo_speedrunning" };
    }

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.h(Lly;Lly;I)I")
    public static int method2887(class333 arg0, class333 arg1) {
        int var2 = 0;
        String[] var3 = field935;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5865(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field933;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5865(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field954;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method5861(var11) != -1 && arg1.method5865(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("dk.e(Lly;Lly;ZII)V")
    public static void method2687(class333 arg0, class333 arg1, boolean arg2, int arg3) {
        if (!Statics.field936) {
            if (arg3 == 0) {
                method2792(arg2);
            } else {
                method146(arg3);
            }
            class477.method8116();
            byte[] var4 = arg0.method5864("title.jpg", "");
            Statics.field1045 = class32.method6061(var4);
            Statics.field39 = Statics.field1045.method8225();
            int var5 = client.field596;
            if ((var5 & 0x20000000) != 0) {
                Statics.field920 = class482.method1995(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) != 0) {
                Statics.field920 = class482.method1995(arg1, "logo_seasonal_mode", "");
            } else if ((var5 & 0x100) == 0) {
                Statics.field920 = class482.method1995(arg1, "logo", "");
            } else {
                Statics.field920 = class482.method1995(arg1, "logo_speedrunning", "");
            }
            Statics.field2775 = class482.method1995(arg1, "titlebox", "");
            Statics.field2612 = class482.method1995(arg1, "titlebutton", "");
            Statics.field3458 = class482.method1995(arg1, "titlebutton_large", "");
            Statics.field1757 = class482.method1995(arg1, "play_now_text", "");
            class482.method1995(arg1, "titlebutton_wide42,1", "");
            int var6 = arg1.method5861("runes");
            int var7 = arg1.method5868(var6, "");
            class480[] var8 = class482.method4765(arg1, var6, var7);
            Statics.field919 = var8;
            int var9 = arg1.method5861("title_mute");
            int var10 = arg1.method5868(var9, "");
            class480[] var11 = class482.method4765(arg1, var9, var10);
            Statics.field1444 = var11;
            Statics.field2976 = class482.method1995(arg1, "options_radio_buttons,0", "");
            Statics.field950 = class482.method1995(arg1, "options_radio_buttons,4", "");
            Statics.field1155 = class482.method1995(arg1, "options_radio_buttons,2", "");
            Statics.field928 = class482.method1995(arg1, "options_radio_buttons,6", "");
            Statics.field1570 = Statics.field2976.field5008;
            Statics.field2999 = Statics.field2976.field5005;
            Statics.field1783 = new class94(Statics.field919);
            if (arg2) {
                field941 = "";
                field937 = "";
                field916 = new String[8];
                field939 = 0;
            }
            Statics.field1698 = 0;
            Statics.field1686 = "";
            field931 = true;
            field946 = false;
            if (Statics.field2126.method2301()) {
                class287.method6730(2);
            } else {
                class331 var12 = Statics.field1825;
                int var13 = var12.method5861("scape main");
                int var14 = var12.method5868(var13, "");
                class287.field3347 = 1;
                Statics.field3520 = var12;
                Statics.field1446 = var13;
                Statics.field3350 = var14;
                Statics.field4918 = 255;
                Statics.field1706 = false;
                Statics.field3349 = 2;
            }
            if (Statics.field4236 != null) {
                try {
                    class467 var15 = new class467(4);
                    var15.method7789(3);
                    var15.method7982(0);
                    Statics.field4236.method6944(var15.field4917, 0, 4);
                } catch (IOException var19) {
                    try {
                        Statics.field4236.method6948();
                    } catch (Exception var18) {
                    }
                    class334.field4224++;
                    Statics.field4236 = null;
                }
            }
            Statics.field936 = true;
            field918 = (Statics.field2331 - 765) / 2;
            field942 = field918 + 202;
            Statics.field1453 = field942 + 180;
            Statics.field1045.method8235(field918, 0);
            Statics.field39.method8235(field918 + 382, 0);
            Statics.field920.method8196(field918 + 382 - Statics.field920.field5008 / 2, 18);
        } else if (arg3 == 4) {
            method146(4);
        }
    }

    @ObfuscatedName("ec.v(ZZI)Lra;")
    public static class480 method2921(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field928 : Statics.field1155) : (arg1 ? Statics.field950 : Statics.field2976);
    }

    @ObfuscatedName("hp.x(I)V")
    public static void method4423() {
        if (field941 != null && field941.length() > 0) {
            return;
        }
        if (Statics.field2126.method2303() == null) {
            client.field556 = false;
        } else {
            field941 = Statics.field2126.method2303();
            client.field556 = true;
        }
    }

    @ObfuscatedName("pt.m(I)V")
    public static void method7481() {
        if (!Statics.field936) {
            return;
        }
        Statics.field2775 = null;
        Statics.field2612 = null;
        Statics.field919 = null;
        Statics.field1045 = null;
        Statics.field39 = null;
        Statics.field920 = null;
        Statics.field1444 = null;
        Statics.field2976 = null;
        Statics.field1155 = null;
        Statics.field502 = null;
        Statics.field1120 = null;
        Statics.field2430 = null;
        Statics.field3311 = null;
        Statics.field1341 = null;
        Statics.field1783.method2254();
        class287.method6730(2);
        if (Statics.field4236 != null) {
            try {
                class467 var0 = new class467(4);
                var0.method7789(2);
                var0.method7982(0);
                Statics.field4236.method6944(var0.field4917, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field4236.method6948();
                } catch (Exception var3) {
                }
                class334.field4224++;
                Statics.field4236 = null;
            }
        }
        Statics.field936 = false;
    }

    @ObfuscatedName("aw.q(I)V")
    public static void method836() {
        if (client.field556 && field941 != null && field941.length() > 0) {
            field943 = 1;
        } else {
            field943 = 0;
        }
    }

    @ObfuscatedName("fx.f(Lan;Lnv;B)V")
    public static void method3183(class36 arg0, class368 arg1) {
        if (field946) {
            class202 var2 = client.field748;
            class202 var3 = var2;
            while (true) {
                if (!var3.method3742()) {
                    if (class37.field261 != 1 && (Statics.field2773 || class37.field261 != 4)) {
                        break;
                    }
                    int var4 = field918 + 280;
                    if (class37.field262 >= var4 && class37.field262 <= var4 + 14 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(0, 0);
                        break;
                    }
                    if (class37.field262 >= var4 + 15 && class37.field262 <= var4 + 80 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(0, 1);
                        break;
                    }
                    int var5 = field918 + 390;
                    if (class37.field262 >= var5 && class37.field262 <= var5 + 14 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(1, 0);
                        break;
                    }
                    if (class37.field262 >= var5 + 15 && class37.field262 <= var5 + 80 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(1, 1);
                        break;
                    }
                    int var6 = field918 + 500;
                    if (class37.field262 >= var6 && class37.field262 <= var6 + 14 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(2, 0);
                        break;
                    }
                    if (class37.field262 >= var6 + 15 && class37.field262 <= var6 + 80 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(2, 1);
                        break;
                    }
                    int var7 = field918 + 610;
                    if (class37.field262 >= var7 && class37.field262 <= var7 + 14 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(3, 0);
                        break;
                    }
                    if (class37.field262 >= var7 + 15 && class37.field262 <= var7 + 80 && class37.field258 >= 4 && class37.field258 <= 18) {
                        class65.method68(3, 1);
                        break;
                    }
                    if (class37.field262 >= field918 + 708 && class37.field258 >= 4 && class37.field262 <= field918 + 708 + 50 && class37.field258 <= 20) {
                        field946 = false;
                        Statics.field1045.method8235(field918, 0);
                        Statics.field39.method8235(field918 + 382, 0);
                        Statics.field920.method8196(field918 + 382 - Statics.field920.field5008 / 2, 18);
                        break;
                    }
                    if (field947 == -1) {
                        if (field948 > 0 && Statics.field4555 != null && class37.field262 >= 0 && class37.field262 <= Statics.field4555.field5008 && class37.field258 >= Statics.field4300 / 2 - 50 && class37.field258 <= Statics.field4300 / 2 + 50) {
                            field948--;
                        }
                        if (field948 < field949 && Statics.field1680 != null && class37.field262 >= Statics.field2331 - Statics.field1680.field5008 - 5 && class37.field262 <= Statics.field2331 && class37.field258 >= Statics.field4300 / 2 - 50 && class37.field258 <= Statics.field4300 / 2 + 50) {
                            field948++;
                        }
                    } else {
                        class65 var8 = Statics.field814[field947];
                        method2739(var8);
                        field946 = false;
                        Statics.field1045.method8235(field918, 0);
                        Statics.field39.method8235(field918 + 382, 0);
                        Statics.field920.method8196(field918 + 382 - Statics.field920.field5008 / 2, 18);
                    }
                    break;
                }
                if (var3.field2329 == 13) {
                    field946 = false;
                    Statics.field1045.method8235(field918, 0);
                    Statics.field39.method8235(field918 + 382, 0);
                    Statics.field920.method8196(field918 + 382 - Statics.field920.field5008 / 2, 18);
                    break;
                }
                if (var3.field2329 == 96) {
                    if (field948 > 0 && Statics.field4555 != null) {
                        field948--;
                    }
                } else if (var3.field2329 == 97 && field948 < field949 && Statics.field1680 != null) {
                    field948++;
                }
            }
            return;
        }
        if ((class37.field261 == 1 || !Statics.field2773 && class37.field261 == 4) && class37.field262 >= field918 + 765 - 50 && class37.field258 >= 453) {
            Statics.field2126.method2321(!Statics.field2126.method2301());
            if (Statics.field2126.method2301()) {
                class287.method34();
            } else {
                class331 var9 = Statics.field1825;
                int var10 = var9.method5861("scape main");
                int var11 = var9.method5868(var10, "");
                class287.method417(var9, var10, var11, 255, false);
            }
        }
        if (client.field517 == 5) {
            return;
        }
        if (field938 == -1L) {
            field938 = Statics.method1118() + 1000L;
        }
        long var12 = Statics.method1118();
        if (client.method3475() && field951 == -1L) {
            field951 = var12;
            if (field951 > field938) {
                field938 = field951;
            }
        }
        if (client.field517 != 10 && client.field517 != 11) {
            return;
        }
        if (Statics.field1905 == class348.field4294) {
            if (class37.field261 == 1 || !Statics.field2773 && class37.field261 == 4) {
                int var14 = field918 + 5;
                short var15 = 463;
                byte var16 = 100;
                byte var17 = 35;
                if (class37.field262 >= var14 && class37.field262 <= var14 + var16 && class37.field258 >= var15 && class37.field258 <= var15 + var17) {
                    method4759();
                    return;
                }
            }
            if (Statics.field1 != null) {
                method4759();
            }
        }
        int var18 = class37.field261;
        int var19 = class37.field262;
        int var20 = class37.field258;
        if (var18 == 0) {
            var19 = class37.field254;
            var20 = class37.field249;
        }
        if (!Statics.field2773 && var18 == 4) {
            var18 = 1;
        }
        class202 var21 = client.field748;
        class202 var22 = var21;
        if (field945 == 0) {
            boolean var23 = false;
            while (var22.method3742()) {
                if (var22.field2329 == 84) {
                    var23 = true;
                }
            }
            int var24 = Statics.field1453 - 80;
            short var25 = 291;
            if (var18 == 1 && var19 >= var24 - 75 && var19 <= var24 + 75 && var20 >= var25 - 20 && var20 <= var25 + 20) {
                class33.method6066(Statics.method1090("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var26 = Statics.field1453 + 80;
            if (var18 == 1 && var19 >= var26 - 75 && var19 <= var26 + 75 && var20 >= var25 - 20 && var20 <= var25 + 20 || var23) {
                if ((client.field596 & 0x2000000) != 0) {
                    field932 = "";
                    field917 = class326.field4037;
                    field934 = class326.field4055;
                    field955 = class326.field4125;
                    method146(1);
                    method836();
                } else if ((client.field596 & 0x4) != 0) {
                    if ((client.field596 & 0x400) == 0) {
                        field917 = class326.field4045;
                        field934 = class326.field4035;
                        field955 = class326.field4047;
                    } else {
                        field917 = class326.field3826;
                        field934 = class326.field4052;
                        field955 = class326.field4053;
                    }
                    field932 = class326.field4044;
                    method146(1);
                    method836();
                } else if ((client.field596 & 0x400) == 0) {
                    method6048(false);
                } else {
                    field917 = class326.field4048;
                    field934 = class326.field4049;
                    field955 = class326.field4021;
                    field932 = class326.field4044;
                    method146(1);
                    method836();
                }
            }
        } else if (field945 == 1) {
            while (true) {
                if (!var22.method3742()) {
                    int var27 = Statics.field1453 - 80;
                    short var28 = 321;
                    if (var18 == 1 && var19 >= var27 - 75 && var19 <= var27 + 75 && var20 >= var28 - 20 && var20 <= var28 + 20) {
                        method6048(false);
                    }
                    int var29 = Statics.field1453 + 80;
                    if (var18 == 1 && var19 >= var29 - 75 && var19 <= var29 + 75 && var20 >= var28 - 20 && var20 <= var28 + 20) {
                        method146(0);
                    }
                    break;
                }
                if (var22.field2329 == 84) {
                    method6048(false);
                } else if (var22.field2329 == 13) {
                    method146(0);
                }
            }
        } else if (field945 == 2) {
            short var30 = 201;
            int var238 = var30 + 52;
            if (var18 == 1 && var20 >= var238 - 12 && var20 < var238 + 2) {
                field943 = 0;
            }
            var238 += 15;
            if (var18 == 1 && var20 >= var238 - 12 && var20 < var238 + 2) {
                field943 = 1;
            }
            var238 += 15;
            short var31 = 361;
            if (Statics.field4468 != null) {
                int var32 = Statics.field4468.field4597 / 2;
                if (var18 == 1 && var19 >= Statics.field4468.field4596 - var32 && var19 <= Statics.field4468.field4596 + var32 && var20 >= var31 - 15 && var20 < var31) {
                    switch(field929) {
                        case 1:
                            method3133(class326.field4093, class326.field4094, class326.field4089);
                            method146(5);
                            return;
                        case 2:
                            class33.method6066("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var33 = Statics.field1453 - 80;
            short var34 = 321;
            if (var18 == 1 && var19 >= var33 - 75 && var19 <= var33 + 75 && var20 >= var34 - 20 && var20 <= var34 + 20) {
                field941 = field941.trim();
                if (field941.length() == 0) {
                    method3133(class326.field3937, class326.field3906, class326.field3965);
                    return;
                }
                if (field937.length() == 0) {
                    method3133(class326.field3964, class326.field3899, class326.field3942);
                    return;
                }
                method3133(class326.field4059, class326.field3914, class326.field4061);
                client.method2137(false);
                client.method2906(20);
                return;
            }
            int var35 = field942 + 180 + 80;
            if (var18 == 1 && var19 >= var35 - 75 && var19 <= var35 + 75 && var20 >= var34 - 20 && var20 <= var34 + 20) {
                method146(0);
                field941 = "";
                field937 = "";
                Statics.field1698 = 0;
                Statics.field1686 = "";
                field931 = true;
            }
            int var36 = Statics.field1453 + -117;
            short var37 = 277;
            field940 = var19 >= var36 && var19 < Statics.field1570 + var36 && var20 >= var37 && var20 < Statics.field2999 + var37;
            if (var18 == 1 && field940) {
                client.field556 = !client.field556;
                if (!client.field556 && Statics.field2126.method2303() != null) {
                    Statics.field2126.method2302((String) null);
                }
            }
            int var38 = Statics.field1453 + 24;
            short var39 = 277;
            field956 = var19 >= var38 && var19 < Statics.field1570 + var38 && var20 >= var39 && var20 < Statics.field2999 + var39;
            if (var18 == 1 && field956) {
                Statics.field2126.method2334(!Statics.field2126.method2286());
                if (!Statics.field2126.method2286()) {
                    field941 = "";
                    Statics.field2126.method2302((String) null);
                    method836();
                }
            }
            while (true) {
                Transferable var43;
                int var44;
                do {
                    while (true) {
                        label1521: do {
                            while (true) {
                                while (var22.method3742()) {
                                    if (var22.field2329 == 13) {
                                        method146(0);
                                        field941 = "";
                                        field937 = "";
                                        Statics.field1698 = 0;
                                        Statics.field1686 = "";
                                        field931 = true;
                                    } else {
                                        if (field943 != 0) {
                                            continue label1521;
                                        }
                                        char var40 = var22.field2316;
                                        for (int var41 = 0; var41 < field944.length() && var40 != field944.charAt(var41); var41++) {
                                        }
                                        if (var22.field2329 == 85 && field941.length() > 0) {
                                            field941 = field941.substring(0, field941.length() - 1);
                                        }
                                        if (var22.field2329 == 84 || var22.field2329 == 80) {
                                            field943 = 1;
                                        }
                                        if (method17(var22.field2316) && field941.length() < 320) {
                                            field941 = field941 + var22.field2316;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field943 != 1);
                        if (var22.field2329 == 85 && field937.length() > 0) {
                            field937 = field937.substring(0, field937.length() - 1);
                        } else if (var22.field2329 == 84 || var22.field2329 == 80) {
                            field943 = 0;
                            if (var22.field2329 == 84) {
                                field941 = field941.trim();
                                if (field941.length() == 0) {
                                    method3133(class326.field3937, class326.field3906, class326.field3965);
                                    return;
                                }
                                if (field937.length() == 0) {
                                    method3133(class326.field3964, class326.field3899, class326.field3942);
                                    return;
                                }
                                method3133(class326.field4059, class326.field3914, class326.field4061);
                                client.method2137(false);
                                client.method2906(20);
                                return;
                            }
                        }
                        if ((var22.method3737(82) || var22.method3737(87)) && var22.field2329 == 67) {
                            Clipboard var42 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var43 = var42.getContents(Statics.field1488);
                            var44 = 20 - field937.length();
                            break;
                        }
                        if (class359.method1763(var22.field2316) && method17(var22.field2316) && field937.length() < 20) {
                            field937 = field937 + var22.field2316;
                        }
                    }
                } while (var44 <= 0);
                try {
                    String var45 = (String) var43.getTransferData(DataFlavor.stringFlavor);
                    int var46 = Math.min(var44, var45.length());
                    for (int var47 = 0; var47 < var46; var47++) {
                        if (!class359.method1763(var45.charAt(var47)) || !method17(var45.charAt(var47))) {
                            method146(3);
                            return;
                        }
                    }
                    field937 = field937 + var45.substring(0, var46);
                } catch (UnsupportedFlavorException var236) {
                } catch (IOException var237) {
                }
            }
        } else if (field945 == 3) {
            int var50 = field942 + 180;
            short var51 = 276;
            if (var18 == 1 && var19 >= var50 - 75 && var19 <= var50 + 75 && var20 >= var51 - 20 && var20 <= var51 + 20) {
                method2792(false);
            }
            int var52 = field942 + 180;
            short var53 = 326;
            if (var18 == 1 && var19 >= var52 - 75 && var19 <= var52 + 75 && var20 >= var53 - 20 && var20 <= var53 + 20) {
                method3133(class326.field4093, class326.field4094, class326.field4089);
                method146(5);
                return;
            }
        } else if (field945 == 4) {
            int var54 = field942 + 180 - 80;
            short var55 = 321;
            if (var18 == 1 && var19 >= var54 - 75 && var19 <= var54 + 75 && var20 >= var55 - 20 && var20 <= var55 + 20) {
                Statics.field1686.trim();
                if (Statics.field1686.length() != 6) {
                    method3133(class326.field3856, class326.field3857, class326.field3858);
                    return;
                }
                Statics.field1698 = Integer.parseInt(Statics.field1686);
                Statics.field1686 = "";
                client.method2137(true);
                method3133(class326.field4059, class326.field3914, class326.field4061);
                client.method2906(20);
                return;
            }
            if (var18 == 1 && var19 >= field942 + 180 - 9 && var19 <= field942 + 180 + 130 && var20 >= 263 && var20 <= 296) {
                field931 = !field931;
            }
            if (var18 == 1 && var19 >= field942 + 180 - 34 && var19 <= field942 + 180 + 34 && var20 >= 351 && var20 <= 363) {
                class33.method6066(Statics.method1090("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var56 = field942 + 180 + 80;
            if (var18 == 1 && var19 >= var56 - 75 && var19 <= var56 + 75 && var20 >= var55 - 20 && var20 <= var55 + 20) {
                method146(0);
                field941 = "";
                field937 = "";
                Statics.field1698 = 0;
                Statics.field1686 = "";
            }
            while (var22.method3742()) {
                boolean var57 = false;
                for (int var58 = 0; var58 < field953.length(); var58++) {
                    if (var22.field2316 == field953.charAt(var58)) {
                        var57 = true;
                        break;
                    }
                }
                if (var22.field2329 == 13) {
                    method146(0);
                    field941 = "";
                    field937 = "";
                    Statics.field1698 = 0;
                    Statics.field1686 = "";
                } else {
                    if (var22.field2329 == 85 && Statics.field1686.length() > 0) {
                        Statics.field1686 = Statics.field1686.substring(0, Statics.field1686.length() - 1);
                    }
                    if (var22.field2329 == 84) {
                        Statics.field1686.trim();
                        if (Statics.field1686.length() != 6) {
                            method3133(class326.field3856, class326.field3857, class326.field3858);
                            return;
                        }
                        Statics.field1698 = Integer.parseInt(Statics.field1686);
                        Statics.field1686 = "";
                        client.method2137(true);
                        method3133(class326.field4059, class326.field3914, class326.field4061);
                        client.method2906(20);
                        return;
                    }
                    if (var57 && Statics.field1686.length() < 6) {
                        Statics.field1686 = Statics.field1686 + var22.field2316;
                    }
                }
            }
        } else if (field945 == 5) {
            int var59 = field942 + 180 - 80;
            short var60 = 321;
            if (var18 == 1 && var19 >= var59 - 75 && var19 <= var59 + 75 && var20 >= var60 - 20 && var20 <= var60 + 20) {
                field941 = field941.trim();
                if (field941.length() == 0) {
                    method3133(class326.field4093, class326.field4094, class326.field4089);
                } else {
                    long var67;
                    try {
                        URL var61 = new URL(Statics.method1090("services", false) + "m=accountappeal/login.ws");
                        URLConnection var62 = var61.openConnection();
                        var62.setRequestProperty("connection", "close");
                        var62.setDoInput(true);
                        var62.setDoOutput(true);
                        var62.setConnectTimeout(5000);
                        OutputStreamWriter var63 = new OutputStreamWriter(var62.getOutputStream());
                        var63.write("data1=req");
                        var63.flush();
                        InputStream var64 = var62.getInputStream();
                        class467 var65 = new class467(new byte[1000]);
                        while (true) {
                            int var66 = var64.read(var65.field4917, var65.field4915, 1000 - var65.field4915);
                            if (var66 == -1) {
                                var65.field4915 = 0;
                                long var69 = var65.method7958();
                                var67 = var69;
                                break;
                            }
                            var65.field4915 += var66;
                            if (var65.field4915 >= 1000) {
                                var67 = 0L;
                                break;
                            }
                        }
                    } catch (Exception var229) {
                        var67 = 0L;
                    }
                    byte var74;
                    if (var67 == 0L) {
                        var74 = 5;
                    } else {
                        String var75 = field941;
                        Random var76 = new Random();
                        class467 var77 = new class467(128);
                        class467 var78 = new class467(128);
                        int[] var79 = new int[] { var76.nextInt(), var76.nextInt(), (int) (var67 >> 32), (int) var67 };
                        var77.method7789(10);
                        for (int var80 = 0; var80 < 4; var80++) {
                            var77.method7778(var76.nextInt());
                        }
                        var77.method7778(var79[0]);
                        var77.method7778(var79[1]);
                        var77.method7780(var67);
                        var77.method7780(0L);
                        for (int var81 = 0; var81 < 4; var81++) {
                            var77.method7778(var76.nextInt());
                        }
                        var77.method7817(class70.field890, class70.field888);
                        var78.method7789(10);
                        for (int var82 = 0; var82 < 3; var82++) {
                            var78.method7778(var76.nextInt());
                        }
                        var78.method7780(var76.nextLong());
                        var78.method7779(var76.nextLong());
                        if (client.field561 == null) {
                            byte[] var83 = new byte[24];
                            try {
                                class166.field1859.method7598(0L);
                                class166.field1859.method7582(var83);
                                int var84;
                                for (var84 = 0; var84 < 24 && var83[var84] == 0; var84++) {
                                }
                                if (var84 >= 24) {
                                    throw new IOException();
                                }
                            } catch (Exception var228) {
                                for (int var86 = 0; var86 < 24; var86++) {
                                    var83[var86] = -1;
                                }
                            }
                            var78.method7785(var83, 0, var83.length);
                        } else {
                            var78.method7785(client.field561, 0, client.field561.length);
                        }
                        var78.method7780(var76.nextLong());
                        var78.method7817(class70.field890, class70.field888);
                        int var89 = class467.method155(var75);
                        if (var89 % 8 != 0) {
                            var89 += 8 - var89 % 8;
                        }
                        class467 var90 = new class467(var89);
                        var90.method7782(var75);
                        var90.field4915 = var89;
                        var90.method7930(var79);
                        class467 var91 = new class467(var90.field4915 + var78.field4915 + var77.field4915 + 5);
                        var91.method7789(2);
                        var91.method7789(var77.field4915);
                        var91.method7785(var77.field4917, 0, var77.field4915);
                        var91.method7789(var78.field4915);
                        var91.method7785(var78.field4917, 0, var78.field4915);
                        var91.method7776(var90.field4915);
                        var91.method7785(var90.field4917, 0, var90.field4915);
                        String var92 = class360.method3309(var91.field4917);
                        byte var99;
                        try {
                            URL var93 = new URL(Statics.method1090("services", false) + "m=accountappeal/login.ws");
                            URLConnection var94 = var93.openConnection();
                            var94.setDoInput(true);
                            var94.setDoOutput(true);
                            var94.setConnectTimeout(5000);
                            OutputStreamWriter var95 = new OutputStreamWriter(var94.getOutputStream());
                            var95.write("data2=" + class492.method7677(var92) + "&dest=" + class492.method7677("passwordchoice.ws"));
                            var95.flush();
                            InputStream var96 = var94.getInputStream();
                            class467 var97 = new class467(new byte[1000]);
                            while (true) {
                                int var98 = var96.read(var97.field4917, var97.field4915, 1000 - var97.field4915);
                                if (var98 == -1) {
                                    var95.close();
                                    var96.close();
                                    String var100 = new String(var97.field4917);
                                    if (var100.startsWith("OFFLINE")) {
                                        var99 = 4;
                                    } else if (var100.startsWith("WRONG")) {
                                        var99 = 7;
                                    } else if (var100.startsWith("RELOAD")) {
                                        var99 = 3;
                                    } else if (var100.startsWith("Not permitted for social network accounts.")) {
                                        var99 = 6;
                                    } else {
                                        var97.method7814(var79);
                                        while (var97.field4915 > 0 && var97.field4917[var97.field4915 - 1] == 0) {
                                            var97.field4915--;
                                        }
                                        String var101 = new String(var97.field4917, 0, var97.field4915);
                                        boolean var102;
                                        if (var101 == null) {
                                            var102 = false;
                                        } else {
                                            label1682: {
                                                try {
                                                    new URL(var101);
                                                } catch (MalformedURLException var226) {
                                                    var102 = false;
                                                    break label1682;
                                                }
                                                var102 = true;
                                            }
                                        }
                                        if (var102) {
                                            class33.method6066(var101, true, false);
                                            var99 = 2;
                                        } else {
                                            var99 = 5;
                                        }
                                    }
                                    break;
                                }
                                var97.field4915 += var98;
                                if (var97.field4915 >= 1000) {
                                    var99 = 5;
                                    break;
                                }
                            }
                        } catch (Throwable var227) {
                            var227.printStackTrace();
                            var99 = 5;
                        }
                        var74 = var99;
                    }
                    switch(var74) {
                        case 2:
                            method3133(class326.field4096, class326.field4097, class326.field3833);
                            method146(6);
                            break;
                        case 3:
                            method3133(class326.field3960, class326.field4100, class326.field4101);
                            break;
                        case 4:
                            method3133(class326.field4102, class326.field4103, class326.field4104);
                            break;
                        case 5:
                            method3133(class326.field4118, class326.field4106, class326.field4107);
                            break;
                        case 6:
                            method3133(class326.field3958, class326.field4109, class326.field4110);
                            break;
                        case 7:
                            method3133(class326.field4136, class326.field4112, class326.field3983);
                    }
                }
                return;
            }
            int var105 = field942 + 180 + 80;
            if (var18 == 1 && var19 >= var105 - 75 && var19 <= var105 + 75 && var20 >= var60 - 20 && var20 <= var60 + 20) {
                method6048(true);
            }
            short var106 = 361;
            if (Statics.field1764 != null) {
                int var107 = Statics.field1764.field4597 / 2;
                if (var18 == 1 && var19 >= Statics.field1764.field4596 - var107 && var19 <= Statics.field1764.field4596 + var107 && var20 >= var106 - 15 && var20 < var106) {
                    class33.method6066(Statics.method1090("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var22.method3742()) {
                boolean var108 = false;
                for (int var109 = 0; var109 < field944.length(); var109++) {
                    if (var22.field2316 == field944.charAt(var109)) {
                        var108 = true;
                        break;
                    }
                }
                if (var22.field2329 == 13) {
                    method6048(true);
                } else {
                    if (var22.field2329 == 85 && field941.length() > 0) {
                        field941 = field941.substring(0, field941.length() - 1);
                    }
                    if (var22.field2329 == 84) {
                        field941 = field941.trim();
                        if (field941.length() == 0) {
                            method3133(class326.field4093, class326.field4094, class326.field4089);
                        } else {
                            long var116;
                            try {
                                URL var110 = new URL(Statics.method1090("services", false) + "m=accountappeal/login.ws");
                                URLConnection var111 = var110.openConnection();
                                var111.setRequestProperty("connection", "close");
                                var111.setDoInput(true);
                                var111.setDoOutput(true);
                                var111.setConnectTimeout(5000);
                                OutputStreamWriter var112 = new OutputStreamWriter(var111.getOutputStream());
                                var112.write("data1=req");
                                var112.flush();
                                InputStream var113 = var111.getInputStream();
                                class467 var114 = new class467(new byte[1000]);
                                while (true) {
                                    int var115 = var113.read(var114.field4917, var114.field4915, 1000 - var114.field4915);
                                    if (var115 == -1) {
                                        var114.field4915 = 0;
                                        long var118 = var114.method7958();
                                        var116 = var118;
                                        break;
                                    }
                                    var114.field4915 += var115;
                                    if (var114.field4915 >= 1000) {
                                        var116 = 0L;
                                        break;
                                    }
                                }
                            } catch (Exception var233) {
                                var116 = 0L;
                            }
                            byte var123;
                            if (var116 == 0L) {
                                var123 = 5;
                            } else {
                                String var124 = field941;
                                Random var125 = new Random();
                                class467 var126 = new class467(128);
                                class467 var127 = new class467(128);
                                int[] var128 = new int[] { var125.nextInt(), var125.nextInt(), (int) (var116 >> 32), (int) var116 };
                                var126.method7789(10);
                                for (int var129 = 0; var129 < 4; var129++) {
                                    var126.method7778(var125.nextInt());
                                }
                                var126.method7778(var128[0]);
                                var126.method7778(var128[1]);
                                var126.method7780(var116);
                                var126.method7780(0L);
                                for (int var130 = 0; var130 < 4; var130++) {
                                    var126.method7778(var125.nextInt());
                                }
                                var126.method7817(class70.field890, class70.field888);
                                var127.method7789(10);
                                for (int var131 = 0; var131 < 3; var131++) {
                                    var127.method7778(var125.nextInt());
                                }
                                var127.method7780(var125.nextLong());
                                var127.method7779(var125.nextLong());
                                if (client.field561 == null) {
                                    byte[] var132 = new byte[24];
                                    try {
                                        class166.field1859.method7598(0L);
                                        class166.field1859.method7582(var132);
                                        int var133;
                                        for (var133 = 0; var133 < 24 && var132[var133] == 0; var133++) {
                                        }
                                        if (var133 >= 24) {
                                            throw new IOException();
                                        }
                                    } catch (Exception var232) {
                                        for (int var135 = 0; var135 < 24; var135++) {
                                            var132[var135] = -1;
                                        }
                                    }
                                    var127.method7785(var132, 0, var132.length);
                                } else {
                                    var127.method7785(client.field561, 0, client.field561.length);
                                }
                                var127.method7780(var125.nextLong());
                                var127.method7817(class70.field890, class70.field888);
                                int var138 = class467.method155(var124);
                                if (var138 % 8 != 0) {
                                    var138 += 8 - var138 % 8;
                                }
                                class467 var139 = new class467(var138);
                                var139.method7782(var124);
                                var139.field4915 = var138;
                                var139.method7930(var128);
                                class467 var140 = new class467(var139.field4915 + var127.field4915 + var126.field4915 + 5);
                                var140.method7789(2);
                                var140.method7789(var126.field4915);
                                var140.method7785(var126.field4917, 0, var126.field4915);
                                var140.method7789(var127.field4915);
                                var140.method7785(var127.field4917, 0, var127.field4915);
                                var140.method7776(var139.field4915);
                                var140.method7785(var139.field4917, 0, var139.field4915);
                                String var141 = class360.method3309(var140.field4917);
                                byte var148;
                                try {
                                    URL var142 = new URL(Statics.method1090("services", false) + "m=accountappeal/login.ws");
                                    URLConnection var143 = var142.openConnection();
                                    var143.setDoInput(true);
                                    var143.setDoOutput(true);
                                    var143.setConnectTimeout(5000);
                                    OutputStreamWriter var144 = new OutputStreamWriter(var143.getOutputStream());
                                    var144.write("data2=" + class492.method7677(var141) + "&dest=" + class492.method7677("passwordchoice.ws"));
                                    var144.flush();
                                    InputStream var145 = var143.getInputStream();
                                    class467 var146 = new class467(new byte[1000]);
                                    while (true) {
                                        int var147 = var145.read(var146.field4917, var146.field4915, 1000 - var146.field4915);
                                        if (var147 == -1) {
                                            var144.close();
                                            var145.close();
                                            String var149 = new String(var146.field4917);
                                            if (var149.startsWith("OFFLINE")) {
                                                var148 = 4;
                                            } else if (var149.startsWith("WRONG")) {
                                                var148 = 7;
                                            } else if (var149.startsWith("RELOAD")) {
                                                var148 = 3;
                                            } else if (var149.startsWith("Not permitted for social network accounts.")) {
                                                var148 = 6;
                                            } else {
                                                var146.method7814(var128);
                                                while (var146.field4915 > 0 && var146.field4917[var146.field4915 - 1] == 0) {
                                                    var146.field4915--;
                                                }
                                                String var150 = new String(var146.field4917, 0, var146.field4915);
                                                boolean var151;
                                                if (var150 == null) {
                                                    var151 = false;
                                                } else {
                                                    label1684: {
                                                        try {
                                                            new URL(var150);
                                                        } catch (MalformedURLException var230) {
                                                            var151 = false;
                                                            break label1684;
                                                        }
                                                        var151 = true;
                                                    }
                                                }
                                                if (var151) {
                                                    class33.method6066(var150, true, false);
                                                    var148 = 2;
                                                } else {
                                                    var148 = 5;
                                                }
                                            }
                                            break;
                                        }
                                        var146.field4915 += var147;
                                        if (var146.field4915 >= 1000) {
                                            var148 = 5;
                                            break;
                                        }
                                    }
                                } catch (Throwable var231) {
                                    var231.printStackTrace();
                                    var148 = 5;
                                }
                                var123 = var148;
                            }
                            switch(var123) {
                                case 2:
                                    method3133(class326.field4096, class326.field4097, class326.field3833);
                                    method146(6);
                                    break;
                                case 3:
                                    method3133(class326.field3960, class326.field4100, class326.field4101);
                                    break;
                                case 4:
                                    method3133(class326.field4102, class326.field4103, class326.field4104);
                                    break;
                                case 5:
                                    method3133(class326.field4118, class326.field4106, class326.field4107);
                                    break;
                                case 6:
                                    method3133(class326.field3958, class326.field4109, class326.field4110);
                                    break;
                                case 7:
                                    method3133(class326.field4136, class326.field4112, class326.field3983);
                            }
                        }
                        return;
                    }
                    if (var108 && field941.length() < 320) {
                        field941 = field941 + var22.field2316;
                    }
                }
            }
        } else if (field945 == 6) {
            while (true) {
                do {
                    if (!var22.method3742()) {
                        short var154 = 321;
                        if (var18 == 1 && var20 >= var154 - 20 && var20 <= var154 + 20) {
                            method6048(true);
                        }
                        return;
                    }
                } while (var22.field2329 != 84 && var22.field2329 != 13);
                method6048(true);
            }
        } else if (field945 == 7) {
            if (Statics.field1786 && !client.field749) {
                int var155 = Statics.field1453 - 150;
                int var156 = var155 + 240 + 25 + 40;
                short var157 = 231;
                int var158 = var157 + 40;
                if (var18 == 1 && var19 >= var155 && var19 <= var156 && var20 >= var157 && var20 <= var158) {
                    int var159 = var155;
                    int var160 = 0;
                    int var161;
                    while (true) {
                        if (var160 >= 8) {
                            var161 = 0;
                            break;
                        }
                        if (var19 <= var159 + 30) {
                            var161 = var160;
                            break;
                        }
                        var159 += 30;
                        var159 += var160 == 1 || var160 == 3 ? 20 : 5;
                        var160++;
                    }
                    field939 = var161;
                }
                int var162 = field942 + 180 - 80;
                short var163 = 321;
                if (var18 == 1 && var19 >= var162 - 75 && var19 <= var162 + 75 && var20 >= var163 - 20 && var20 <= var163 + 20) {
                    boolean var172;
                    label1392: {
                        Date var170;
                        try {
                            SimpleDateFormat var164 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var164.setLenient(false);
                            StringBuilder var165 = new StringBuilder();
                            String[] var166 = field916;
                            int var167 = 0;
                            while (true) {
                                Date var169;
                                if (var167 < var166.length) {
                                    String var168 = var166[var167];
                                    if (var168 != null) {
                                        var165.append(var168);
                                        var167++;
                                        continue;
                                    }
                                    method2204("Date not valid.", "Please ensure all characters are populated.", "");
                                    var169 = null;
                                } else {
                                    var165.append("12");
                                    var169 = var164.parse(var165.toString());
                                }
                                var170 = var169;
                                break;
                            }
                        } catch (ParseException var235) {
                            method2204("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var172 = false;
                            break label1392;
                        }
                        if (var170 == null) {
                            var172 = false;
                        } else {
                            Calendar var173 = Calendar.getInstance();
                            var173.set(1, var173.get(1) - 13);
                            var173.set(5, var173.get(5) + 1);
                            var173.set(11, 0);
                            var173.set(12, 0);
                            var173.set(13, 0);
                            var173.set(14, 0);
                            Date var174 = var173.getTime();
                            boolean var175 = var170.before(var174);
                            boolean var177 = method7131(var170);
                            if (var177) {
                                if (var175) {
                                    Statics.field173 = (int) (var170.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field173 = 8388607;
                                }
                                var172 = true;
                            } else {
                                method2204("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var172 = false;
                            }
                        }
                    }
                    if (var172) {
                        client.method2906(50);
                        return;
                    }
                }
                int var179 = field942 + 180 + 80;
                if (var18 == 1 && var19 >= var179 - 75 && var19 <= var179 + 75 && var20 >= var163 - 20 && var20 <= var163 + 20) {
                    field916 = new String[8];
                    method6048(true);
                }
                while (var22.method3742()) {
                    if (var22.field2329 == 101) {
                        field916[field939] = null;
                    }
                    if (var22.field2329 == 85) {
                        if (field916[field939] == null && field939 > 0) {
                            field939--;
                        }
                        field916[field939] = null;
                    }
                    if (var22.field2316 >= '0' && var22.field2316 <= '9') {
                        field916[field939] = "" + var22.field2316;
                        if (field939 < 7) {
                            field939++;
                        }
                    }
                    if (var22.field2329 == 84) {
                        boolean var188;
                        label1321: {
                            Date var186;
                            try {
                                SimpleDateFormat var180 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var180.setLenient(false);
                                StringBuilder var181 = new StringBuilder();
                                String[] var182 = field916;
                                int var183 = 0;
                                while (true) {
                                    Date var185;
                                    if (var183 < var182.length) {
                                        String var184 = var182[var183];
                                        if (var184 != null) {
                                            var181.append(var184);
                                            var183++;
                                            continue;
                                        }
                                        method2204("Date not valid.", "Please ensure all characters are populated.", "");
                                        var185 = null;
                                    } else {
                                        var181.append("12");
                                        var185 = var180.parse(var181.toString());
                                    }
                                    var186 = var185;
                                    break;
                                }
                            } catch (ParseException var234) {
                                method2204("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var188 = false;
                                break label1321;
                            }
                            if (var186 == null) {
                                var188 = false;
                            } else {
                                Calendar var189 = Calendar.getInstance();
                                var189.set(1, var189.get(1) - 13);
                                var189.set(5, var189.get(5) + 1);
                                var189.set(11, 0);
                                var189.set(12, 0);
                                var189.set(13, 0);
                                var189.set(14, 0);
                                Date var190 = var189.getTime();
                                boolean var191 = var186.before(var190);
                                boolean var193 = method7131(var186);
                                if (var193) {
                                    if (var191) {
                                        Statics.field173 = (int) (var186.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field173 = 8388607;
                                    }
                                    var188 = true;
                                } else {
                                    method2204("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var188 = false;
                                }
                            }
                        }
                        if (var188) {
                            client.method2906(50);
                        }
                        return;
                    }
                }
            } else {
                int var195 = field942 + 180 - 80;
                short var196 = 321;
                if (var18 == 1 && var19 >= var195 - 75 && var19 <= var195 + 75 && var20 >= var196 - 20 && var20 <= var196 + 20) {
                    class33.method6066(Statics.method1090("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3133(class326.field4090, class326.field4091, class326.field4092);
                    method146(6);
                    return;
                }
                int var197 = field942 + 180 + 80;
                if (var18 == 1 && var19 >= var197 - 75 && var19 <= var197 + 75 && var20 >= var196 - 20 && var20 <= var196 + 20) {
                    method6048(true);
                }
            }
        } else if (field945 == 8) {
            int var198 = field942 + 180 - 80;
            short var199 = 321;
            if (var18 == 1 && var19 >= var198 - 75 && var19 <= var198 + 75 && var20 >= var199 - 20 && var20 <= var199 + 20) {
                class33.method6066("https://www.jagex.com/terms/privacy", true, false);
                method3133(class326.field4090, class326.field4091, class326.field4092);
                method146(6);
                return;
            }
            int var200 = field942 + 180 + 80;
            if (var18 == 1 && var19 >= var200 - 75 && var19 <= var200 + 75 && var20 >= var199 - 20 && var20 <= var199 + 20) {
                method6048(true);
            }
        } else if (field945 == 9) {
            int var201 = field942 + 180;
            short var202 = 311;
            if (var21.field2329 == 84 || var21.field2329 == 13 || var18 == 1 && var19 >= var201 - 75 && var19 <= var201 + 75 && var20 >= var202 - 20 && var20 <= var202 + 20) {
                method2792(false);
            }
        } else if (field945 == 10) {
            int var203 = field942 + 180;
            short var204 = 209;
            if (var21.field2329 == 84 || var18 == 1 && var19 >= var203 - 109 && var19 <= var203 + 109 && var20 >= var204 && var20 <= var204 + 68) {
                method3133(class326.field4059, class326.field3914, class326.field4061);
                client.field641 = class472.field4970;
                client.method2137(false);
                client.method2906(20);
            }
        } else if (field945 == 12) {
            int var205 = Statics.field1453;
            short var206 = 233;
            class407 var207 = arg1.method6533(0, 30, class326.field3847, var205, var206);
            class407 var208 = arg1.method6533(32, 32, class326.field3847, var205, var206);
            class407 var209 = arg1.method6533(70, 34, class326.field3847, var205, var206);
            int var239 = var206 + 17;
            class407 var210 = arg1.method6533(0, 34, class326.field4123, var205, var239);
            if (var18 == 1) {
                if (var207.method7022(var19, var20)) {
                    class33.method6066("https://www.jagex.com/terms", true, false);
                } else if (var208.method7022(var19, var20)) {
                    class33.method6066("https://www.jagex.com/terms/privacy", true, false);
                } else if (var209.method7022(var19, var20) || var210.method7022(var19, var20)) {
                    class33.method6066("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var211 = Statics.field1453 - 80;
            short var212 = 311;
            if (var18 == 1 && var19 >= var211 - 75 && var19 <= var211 + 75 && var20 >= var212 - 20 && var20 <= var212 + 20) {
                client.method4440();
                method2792(true);
            }
            int var213 = Statics.field1453 + 80;
            if (var18 == 1 && var19 >= var213 - 75 && var19 <= var213 + 75 && var20 >= var212 - 20 && var20 <= var212 + 20) {
                field945 = 13;
            }
        } else if (field945 == 13) {
            int var214 = Statics.field1453;
            short var215 = 321;
            if (var18 == 1 && var19 >= var214 - 75 && var19 <= var214 + 75 && var20 >= var215 - 20 && var20 <= var215 + 20) {
                method2792(true);
            }
        } else if (field945 == 14) {
            String var216 = "";
            switch(field925) {
                case 0:
                    var216 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var216 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                case 2:
                    var216 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method6048(false);
            }
            int var217 = field942 + 180;
            short var218 = 276;
            if (var18 == 1 && var19 >= var217 - 75 && var19 <= var217 + 75 && var20 >= var218 - 20 && var20 <= var218 + 20) {
                class33.method6066(var216, true, false);
                method3133(class326.field4090, class326.field4091, class326.field4092);
                method146(6);
                return;
            }
            int var219 = field942 + 180;
            short var220 = 326;
            if (var18 == 1 && var19 >= var219 - 75 && var19 <= var219 + 75 && var20 >= var220 - 20 && var20 <= var220 + 20) {
                method6048(false);
            }
        } else if (field945 == 24) {
            int var221 = field942 + 180;
            short var222 = 301;
            if (var18 == 1 && var19 >= var221 - 75 && var19 <= var221 + 75 && var20 >= var222 - 20 && var20 <= var222 + 20) {
                method2792(false);
            }
        } else if (field945 == 26) {
            int var223 = field942 + 180 - 80;
            short var224 = 321;
            if (var18 == 1 && var19 >= var223 - 75 && var19 <= var223 + 75 && var20 >= var224 - 20 && var20 <= var224 + 20) {
                class33.method6066(Statics.method1090("secure", true) + "m=dob/set_dob.ws", true, false);
                method3133(class326.field4090, class326.field4091, class326.field4092);
                method146(6);
                return;
            }
            int var225 = field942 + 180 + 80;
            if (var18 == 1 && var19 >= var225 - 75 && var19 <= var225 + 75 && var20 >= var224 - 20 && var20 <= var224 + 20) {
                method6048(true);
            }
        }
    }

    @ObfuscatedName("oj.r(Ljava/util/Date;B)Z")
    public static boolean method7131(Date arg0) {
        Date var1 = method3728();
        return arg0.after(var1);
    }

    @ObfuscatedName("gt.u(I)Ljava/util/Date;")
    public static Date method3728() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("cj.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2204(String arg0, String arg1, String arg2) {
        method146(7);
        method3133(arg0, arg1, arg2);
    }

    @ObfuscatedName("m.j(CS)Z")
    public static boolean method17(char arg0) {
        return field944.indexOf(arg0) != -1;
    }

    @ObfuscatedName("ms.g(ZI)V")
    public static void method6048(boolean arg0) {
        if (Statics.field1488.method1150() || Statics.field1488.method1151()) {
            method146(10);
            return;
        }
        field917 = class326.field3824;
        field934 = class326.field3988;
        field955 = class326.field4043;
        method146(2);
        if (arg0) {
            field937 = "";
        }
        method4423();
        method836();
    }

    @ObfuscatedName("dp.i(ZI)V")
    public static void method2792(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field2126.method2297() >= client.field512;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field1488.method1150() || Statics.field1488.method1151()) {
            var1 = 10;
        }
        method146(var1);
        if (arg0) {
            field941 = "";
            field937 = "";
            Statics.field1698 = 0;
            Statics.field1686 = "";
        }
        method4423();
        method836();
    }

    @ObfuscatedName("gb.o(Lnv;Lnv;Lnv;I)V")
    public static void method3727(class368 arg0, class368 arg1, class368 arg2) {
        field918 = (Statics.field2331 - 765) / 2;
        field942 = field918 + 202;
        Statics.field1453 = field942 + 180;
        if (field946) {
            if (Statics.field502 == null) {
                class331 var3 = Statics.field1292;
                int var4 = var3.method5861("sl_back");
                int var5 = var3.method5868(var4, "");
                class481[] var6 = class482.method3715(var3, var4, var5);
                Statics.field502 = var6;
            }
            if (Statics.field1120 == null) {
                class331 var7 = Statics.field1292;
                int var8 = var7.method5861("sl_flags");
                int var9 = var7.method5868(var8, "");
                class480[] var10 = class482.method4765(var7, var8, var9);
                Statics.field1120 = var10;
            }
            if (Statics.field2430 == null) {
                class331 var11 = Statics.field1292;
                int var12 = var11.method5861("sl_arrows");
                int var13 = var11.method5868(var12, "");
                class480[] var14 = class482.method4765(var11, var12, var13);
                Statics.field2430 = var14;
            }
            if (Statics.field3311 == null) {
                class331 var15 = Statics.field1292;
                int var16 = var15.method5861("sl_stars");
                int var17 = var15.method5868(var16, "");
                class480[] var18 = class482.method4765(var15, var16, var17);
                Statics.field3311 = var18;
            }
            if (Statics.field4555 == null) {
                Statics.field4555 = class482.method1995(Statics.field1292, "leftarrow", "");
            }
            if (Statics.field1680 == null) {
                Statics.field1680 = class482.method1995(Statics.field1292, "rightarrow", "");
            }
            class477.method8120(field918, 23, 765, 480, 0);
            class477.method8121(field918, 0, 125, 23, 12425273, 9135624);
            class477.method8121(field918 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method6528(class326.field4129, field918 + 62, 15, 0, -1);
            if (Statics.field3311 != null) {
                Statics.field3311[1].method8196(field918 + 140, 1);
                arg1.method6525(class326.field4051, field918 + 152, 10, 16777215, -1);
                Statics.field3311[0].method8196(field918 + 140, 12);
                arg1.method6525(class326.field4131, field918 + 152, 21, 16777215, -1);
            }
            if (Statics.field2430 != null) {
                int var19 = field918 + 280;
                if (class65.field816[0] == 0 && class65.field817[0] == 0) {
                    Statics.field2430[2].method8196(var19, 4);
                } else {
                    Statics.field2430[0].method8196(var19, 4);
                }
                if (class65.field816[0] == 0 && class65.field817[0] == 1) {
                    Statics.field2430[3].method8196(var19 + 15, 4);
                } else {
                    Statics.field2430[1].method8196(var19 + 15, 4);
                }
                arg0.method6525(class326.field3866, var19 + 32, 17, 16777215, -1);
                int var20 = field918 + 390;
                if (class65.field816[0] == 1 && class65.field817[0] == 0) {
                    Statics.field2430[2].method8196(var20, 4);
                } else {
                    Statics.field2430[0].method8196(var20, 4);
                }
                if (class65.field816[0] == 1 && class65.field817[0] == 1) {
                    Statics.field2430[3].method8196(var20 + 15, 4);
                } else {
                    Statics.field2430[1].method8196(var20 + 15, 4);
                }
                arg0.method6525(class326.field3846, var20 + 32, 17, 16777215, -1);
                int var21 = field918 + 500;
                if (class65.field816[0] == 2 && class65.field817[0] == 0) {
                    Statics.field2430[2].method8196(var21, 4);
                } else {
                    Statics.field2430[0].method8196(var21, 4);
                }
                if (class65.field816[0] == 2 && class65.field817[0] == 1) {
                    Statics.field2430[3].method8196(var21 + 15, 4);
                } else {
                    Statics.field2430[1].method8196(var21 + 15, 4);
                }
                arg0.method6525(class326.field4134, var21 + 32, 17, 16777215, -1);
                int var22 = field918 + 610;
                if (class65.field816[0] == 3 && class65.field817[0] == 0) {
                    Statics.field2430[2].method8196(var22, 4);
                } else {
                    Statics.field2430[0].method8196(var22, 4);
                }
                if (class65.field816[0] == 3 && class65.field817[0] == 1) {
                    Statics.field2430[3].method8196(var22 + 15, 4);
                } else {
                    Statics.field2430[1].method8196(var22 + 15, 4);
                }
                arg0.method6525(class326.field4135, var22 + 32, 17, 16777215, -1);
            }
            class477.method8120(field918 + 708, 4, 50, 16, 0);
            arg1.method6528(class326.field3900, field918 + 708 + 25, 16, 16777215, -1);
            field947 = -1;
            if (Statics.field502 != null) {
                byte var23 = 88;
                byte var24 = 19;
                int var25 = 765 / (var23 + 1) - 1;
                int var26 = 480 / (var24 + 1);
                int var27;
                int var28;
                do {
                    var27 = var26;
                    var28 = var25;
                    if ((var25 - 1) * var26 >= class65.field813) {
                        var25--;
                    }
                    if ((var26 - 1) * var25 >= class65.field813) {
                        var26--;
                    }
                    if ((var26 - 1) * var25 >= class65.field813) {
                        var26--;
                    }
                } while (var26 != var27 || var25 != var28);
                int var29 = (765 - var23 * var25) / (var25 + 1);
                if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = (480 - var24 * var26) / (var26 + 1);
                if (var30 > 5) {
                    var30 = 5;
                }
                int var31 = (765 - var23 * var25 - (var25 - 1) * var29) / 2;
                int var32 = (480 - var24 * var26 - (var26 - 1) * var30) / 2;
                int var33 = (class65.field813 + var26 - 1) / var26;
                field949 = var33 - var25;
                if (Statics.field4555 != null && field948 > 0) {
                    Statics.field4555.method8196(8, Statics.field4300 / 2 - Statics.field4555.field5005 / 2);
                }
                if (Statics.field1680 != null && field948 < field949) {
                    Statics.field1680.method8196(Statics.field2331 - Statics.field1680.field5008 - 8, Statics.field4300 / 2 - Statics.field1680.field5005 / 2);
                }
                int var34 = var32 + 23;
                int var35 = field918 + var31;
                int var36 = 0;
                boolean var37 = false;
                int var38 = field948;
                for (int var39 = var26 * var38; var39 < class65.field813 && var38 - field948 < var25; var39++) {
                    class65 var40 = Statics.field814[var39];
                    boolean var41 = true;
                    String var42 = Integer.toString(var40.field819);
                    if (var40.field819 == -1) {
                        var42 = class326.field3838;
                        var41 = false;
                    } else if (var40.field819 > 1980) {
                        var42 = class326.field4137;
                        var41 = false;
                    }
                    int var43 = -1;
                    int var44 = 0;
                    if (var40.method1642()) {
                        if (var40.method1637()) {
                            var43 = class105.field1391.field1398;
                        } else {
                            var43 = class105.field1390.field1398;
                        }
                    } else if (var40.method1682()) {
                        var44 = 16711680;
                        if (var40.method1637()) {
                            var43 = class105.field1389.field1398;
                        } else {
                            var43 = class105.field1392.field1398;
                        }
                    } else if (var40.method1698()) {
                        if (var40.method1637()) {
                            var43 = class105.field1393.field1398;
                        } else {
                            var43 = class105.field1396.field1398;
                        }
                    } else if (var40.method1639()) {
                        if (var40.method1637()) {
                            var43 = class105.field1387.field1398;
                        } else {
                            var43 = class105.field1386.field1398;
                        }
                    } else if (var40.method1696()) {
                        if (var40.method1637()) {
                            var43 = class105.field1388.field1398;
                        } else {
                            var43 = class105.field1395.field1398;
                        }
                    } else if (var40.method1645()) {
                        if (var40.method1637()) {
                            var43 = class105.field1397.field1398;
                        } else {
                            var43 = class105.field1394.field1398;
                        }
                    }
                    if (var43 == -1 || var43 >= Statics.field502.length) {
                        if (var40.method1637()) {
                            var43 = class105.field1384.field1398;
                        } else {
                            var43 = class105.field1401.field1398;
                        }
                    }
                    if (class37.field254 >= var35 && class37.field249 >= var34 && class37.field254 < var23 + var35 && class37.field249 < var24 + var34 && var41) {
                        field947 = var39;
                        Statics.field502[var43].method8222(var35, var34, 128, 16777215);
                        var37 = true;
                    } else {
                        Statics.field502[var43].method8235(var35, var34);
                    }
                    if (Statics.field1120 != null) {
                        Statics.field1120[(var40.method1637() ? 8 : 0) + var40.field821].method8196(var35 + 29, var34);
                    }
                    arg0.method6528(Integer.toString(var40.field812), var35 + 15, var24 / 2 + var34 + 5, var44, -1);
                    arg1.method6528(var42, var35 + 60, var24 / 2 + var34 + 5, 268435455, -1);
                    var34 += var24 + var30;
                    var36++;
                    if (var36 >= var26) {
                        var34 = var32 + 23;
                        var35 += var23 + var29;
                        var36 = 0;
                        var38++;
                    }
                }
                if (var37) {
                    int var45 = arg1.method6568(Statics.field814[field947].field815) + 6;
                    int var46 = arg1.field4408 + 8;
                    int var47 = class37.field249 + 25;
                    if (var46 + var47 > 480) {
                        var47 = class37.field249 - 25 - var46;
                    }
                    class477.method8120(class37.field254 - var45 / 2, var47, var45, var46, 16777120);
                    class477.method8111(class37.field254 - var45 / 2, var47, var45, var46, 0);
                    arg1.method6528(Statics.field814[field947].field815, class37.field254, arg1.field4408 + var47 + 4, 0, -1);
                }
            }
            Statics.field2354.method463(0, 0);
            return;
        }
        Statics.field1045.method8235(field918, 0);
        Statics.field39.method8235(field918 + 382, 0);
        Statics.field920.method8196(field918 + 382 - Statics.field920.field5008 / 2, 18);
        if (client.field517 == 0 || client.field517 == 5) {
            byte var48 = 20;
            arg0.method6528(class326.field4040, field942 + 180, 245 - var48, 16777215, -1);
            int var49 = 253 - var48;
            class477.method8111(field942 + 180 - 152, var49, 304, 34, 9179409);
            class477.method8111(field942 + 180 - 151, var49 + 1, 302, 32, 0);
            class477.method8120(field942 + 180 - 150, var49 + 2, field926 * 3, 30, 9179409);
            class477.method8120(field926 * 3 + (field942 + 180 - 150), var49 + 2, 300 - field926 * 3, 30, 0);
            arg0.method6528(field927, field942 + 180, 276 - var48, 16777215, -1);
        }
        if (client.field517 == 20) {
            Statics.field2775.method8196(field942 + 180 - Statics.field2775.field5008 / 2, 271 - Statics.field2775.field5005 / 2);
            short var50 = 201;
            arg0.method6528(field917, field942 + 180, var50, 16776960, 0);
            int var150 = var50 + 15;
            arg0.method6528(field934, field942 + 180, var150, 16776960, 0);
            int var151 = var150 + 15;
            arg0.method6528(field955, field942 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            int var153 = var152 + 7;
            if (field945 != 4 && field945 != 10) {
                arg0.method6525(class326.field4068, field942 + 180 - 110, var153, 16777215, 0);
                short var51 = 200;
                String var52 = Statics.field2126.method2286() ? class361.method3134(field941) : field941;
                String var53;
                for (var53 = var52; arg0.method6568(var53) > var51; var53 = var53.substring(0, var53.length() - 1)) {
                }
                arg0.method6525(class372.method6553(var53), field942 + 180 - 70, var153, 16777215, 0);
                var150 = var153 + 15;
                String var54;
                for (var54 = class361.method3134(field937); arg0.method6568(var54) > var51; var54 = var54.substring(1)) {
                }
                arg0.method6525(class326.field3818 + var54, field942 + 180 - 108, var150, 16777215, 0);
                var150 += 15;
            }
        }
        if (client.field517 == 10 || client.field517 == 11 || client.field517 == 50) {
            Statics.field2775.method8196(field942, 171);
            if (field945 == 0) {
                short var55 = 251;
                arg0.method6528(class326.field4071, field942 + 180, var55, 16776960, 0);
                int var154 = var55 + 30;
                int var56 = field942 + 180 - 80;
                short var57 = 291;
                Statics.field2612.method8196(var56 - 73, var57 - 20);
                arg0.method6529(class326.field4072, var56 - 73, var57 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var58 = field942 + 180 + 80;
                Statics.field2612.method8196(var58 - 73, var57 - 20);
                arg0.method6529(class326.field4073, var58 - 73, var57 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field945 == 1) {
                arg0.method6528(field932, field942 + 180, 201, 16776960, 0);
                short var59 = 236;
                arg0.method6528(field917, field942 + 180, var59, 16777215, 0);
                int var155 = var59 + 15;
                arg0.method6528(field934, field942 + 180, var155, 16777215, 0);
                int var156 = var155 + 15;
                arg0.method6528(field955, field942 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                int var60 = field942 + 180 - 80;
                short var61 = 321;
                Statics.field2612.method8196(var60 - 73, var61 - 20);
                arg0.method6528(class326.field3823, var60, var61 + 5, 16777215, 0);
                int var62 = field942 + 180 + 80;
                Statics.field2612.method8196(var62 - 73, var61 - 20);
                arg0.method6528(class326.field3900, var62, var61 + 5, 16777215, 0);
            } else if (field945 == 2) {
                short var63 = 201;
                arg0.method6528(field917, Statics.field1453, var63, 16776960, 0);
                int var158 = var63 + 15;
                arg0.method6528(field934, Statics.field1453, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg0.method6528(field955, Statics.field1453, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var161 = var160 + 7;
                arg0.method6525(class326.field4068, Statics.field1453 - 110, var161, 16777215, 0);
                short var64 = 200;
                String var65 = Statics.field2126.method2286() ? class361.method3134(field941) : field941;
                String var66;
                for (var66 = var65; arg0.method6568(var66) > var64; var66 = var66.substring(1)) {
                }
                arg0.method6525(class372.method6553(var66) + (field943 == 0 & client.field519 % 40 < 20 ? class98.method2153(16776960) + class98.field1329 : ""), Statics.field1453 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                String var67;
                for (var67 = class361.method3134(field937); arg0.method6568(var67) > var64; var67 = var67.substring(1)) {
                }
                arg0.method6525(class326.field3818 + var67 + (field943 == 1 & client.field519 % 40 < 20 ? class98.method2153(16776960) + class98.field1329 : ""), Statics.field1453 - 108, var158, 16777215, 0);
                var158 += 15;
                short var68 = 277;
                int var69 = Statics.field1453 + -117;
                class480 var70 = method2921(client.field556, field940);
                var70.method8196(var69, var68);
                int var71 = var70.field5008 + 5 + var69;
                arg1.method6525(class326.field4076, var71, var68 + 13, 16776960, 0);
                int var72 = Statics.field1453 + 24;
                class480 var73 = method2921(Statics.field2126.method2286(), field956);
                var73.method8196(var72, var68);
                int var74 = var73.field5008 + 5 + var72;
                arg1.method6525(class326.field4077, var74, var68 + 13, 16776960, 0);
                int var162 = var68 + 15;
                int var75 = Statics.field1453 - 80;
                short var76 = 321;
                Statics.field2612.method8196(var75 - 73, var76 - 20);
                arg0.method6528(class326.field4126, var75, var76 + 5, 16777215, 0);
                int var77 = Statics.field1453 + 80;
                Statics.field2612.method8196(var77 - 73, var76 - 20);
                arg0.method6528(class326.field3900, var77, var76 + 5, 16777215, 0);
                short var78 = 357;
                switch(field929) {
                    case 2:
                        Statics.field930 = class326.field3849;
                        break;
                    default:
                        Statics.field930 = class326.field4087;
                }
                Statics.field4468 = new class407(Statics.field1453, var78, arg1.method6568(Statics.field930), 11);
                Statics.field1764 = new class407(Statics.field1453, var78, arg1.method6568(class326.field4088), 11);
                arg1.method6528(Statics.field930, Statics.field1453, var78, 16777215, 0);
            } else if (field945 == 3) {
                short var79 = 201;
                arg0.method6528(class326.field4078, field942 + 180, var79, 16776960, 0);
                int var163 = var79 + 20;
                arg1.method6528(class326.field4079, field942 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                arg1.method6528(class326.field4080, field942 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                int var80 = field942 + 180;
                short var81 = 276;
                Statics.field2612.method8196(var80 - 73, var81 - 20);
                arg2.method6528(class326.field4081, var80, var81 + 5, 16777215, 0);
                int var82 = field942 + 180;
                short var83 = 326;
                Statics.field2612.method8196(var82 - 73, var83 - 20);
                arg2.method6528(class326.field4082, var82, var83 + 5, 16777215, 0);
            } else if (field945 == 4) {
                arg0.method6528(class326.field4057, field942 + 180, 201, 16776960, 0);
                short var84 = 236;
                arg0.method6528(field917, field942 + 180, var84, 16777215, 0);
                int var166 = var84 + 15;
                arg0.method6528(field934, field942 + 180, var166, 16777215, 0);
                int var167 = var166 + 15;
                arg0.method6528(field955, field942 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                arg0.method6525(class326.field3943 + class361.method3134(Statics.field1686) + (client.field519 % 40 < 20 ? class98.method2153(16776960) + class98.field1329 : ""), field942 + 180 - 108, var168, 16777215, 0);
                int var169 = var168 - 8;
                arg0.method6525(class326.field3851, field942 + 180 - 9, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg0.method6525(class326.field4004, field942 + 180 - 9, var170, 16776960, 0);
                int var85 = field942 + 180 - 9 + arg0.method6568(class326.field4004) + 15;
                int var86 = var170 - arg0.field4408;
                class480 var87;
                if (field931) {
                    var87 = Statics.field1155;
                } else {
                    var87 = Statics.field2976;
                }
                var87.method8196(var85, var86);
                var166 = var170 + 15;
                int var88 = field942 + 180 - 80;
                short var89 = 321;
                Statics.field2612.method8196(var88 - 73, var89 - 20);
                arg0.method6528(class326.field3823, var88, var89 + 5, 16777215, 0);
                int var90 = field942 + 180 + 80;
                Statics.field2612.method8196(var90 - 73, var89 - 20);
                arg0.method6528(class326.field3900, var90, var89 + 5, 16777215, 0);
                arg1.method6528(class326.field4058, field942 + 180, var89 + 36, 255, 0);
            } else if (field945 == 5) {
                arg0.method6528(class326.field4083, field942 + 180, 201, 16776960, 0);
                short var91 = 221;
                arg2.method6528(field917, field942 + 180, var91, 16776960, 0);
                int var171 = var91 + 15;
                arg2.method6528(field934, field942 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg2.method6528(field955, field942 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var174 = var173 + 14;
                arg0.method6525(class326.field4084, field942 + 180 - 145, var174, 16777215, 0);
                short var92 = 174;
                String var93 = Statics.field2126.method2286() ? class361.method3134(field941) : field941;
                String var94;
                for (var94 = var93; arg0.method6568(var94) > var92; var94 = var94.substring(1)) {
                }
                arg0.method6525(class372.method6553(var94) + (client.field519 % 40 < 20 ? class98.method2153(16776960) + class98.field1329 : ""), field942 + 180 - 34, var174, 16777215, 0);
                var171 = var174 + 15;
                int var95 = field942 + 180 - 80;
                short var96 = 321;
                Statics.field2612.method8196(var95 - 73, var96 - 20);
                arg0.method6528(class326.field4085, var95, var96 + 5, 16777215, 0);
                int var97 = field942 + 180 + 80;
                Statics.field2612.method8196(var97 - 73, var96 - 20);
                arg0.method6528(class326.field4086, var97, var96 + 5, 16777215, 0);
                short var98 = 356;
                arg1.method6528(class326.field4088, Statics.field1453, var98, 268435455, 0);
            } else if (field945 == 6) {
                short var99 = 201;
                arg0.method6528(field917, field942 + 180, var99, 16776960, 0);
                int var175 = var99 + 15;
                arg0.method6528(field934, field942 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg0.method6528(field955, field942 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var100 = field942 + 180;
                short var101 = 321;
                Statics.field2612.method8196(var100 - 73, var101 - 20);
                arg0.method6528(class326.field4086, var100, var101 + 5, 16777215, 0);
            } else if (field945 == 7) {
                if (Statics.field1786 && !client.field749) {
                    short var102 = 201;
                    arg0.method6528(field917, Statics.field1453, var102, 16776960, 0);
                    int var178 = var102 + 15;
                    arg0.method6528(field934, Statics.field1453, var178, 16776960, 0);
                    int var179 = var178 + 15;
                    arg0.method6528(field955, Statics.field1453, var179, 16776960, 0);
                    int var103 = Statics.field1453 - 150;
                    int var180 = var179 + 10;
                    for (int var104 = 0; var104 < 8; var104++) {
                        Statics.field2612.method8217(var103, var180, 30, 40);
                        boolean var105 = field939 == var104 & client.field519 % 40 < 20;
                        arg0.method6525((field916[var104] == null ? "" : field916[var104]) + (var105 ? class98.method2153(16776960) + class98.field1329 : ""), var103 + 10, var180 + 27, 16777215, 0);
                        if (var104 == 1 || var104 == 3) {
                            var103 += 50;
                            arg0.method6525(class372.method6553("/"), var103 - 13, var180 + 27, 16777215, 0);
                        } else {
                            var103 += 35;
                        }
                    }
                    int var106 = Statics.field1453 - 80;
                    short var107 = 321;
                    Statics.field2612.method8196(var106 - 73, var107 - 20);
                    arg0.method6528("Submit", var106, var107 + 5, 16777215, 0);
                    int var108 = Statics.field1453 + 80;
                    Statics.field2612.method8196(var108 - 73, var107 - 20);
                    arg0.method6528(class326.field3900, var108, var107 + 5, 16777215, 0);
                } else {
                    short var109 = 216;
                    arg0.method6528(class326.field4114, field942 + 180, var109, 16776960, 0);
                    int var181 = var109 + 15;
                    arg2.method6528(class326.field3984, field942 + 180, var181, 16776960, 0);
                    int var182 = var181 + 15;
                    arg2.method6528(class326.field4116, field942 + 180, var182, 16776960, 0);
                    int var183 = var182 + 15;
                    int var110 = field942 + 180 - 80;
                    short var111 = 321;
                    Statics.field2612.method8196(var110 - 73, var111 - 20);
                    arg0.method6528(class326.field4133, var110, var111 + 5, 16777215, 0);
                    int var112 = field942 + 180 + 80;
                    Statics.field2612.method8196(var112 - 73, var111 - 20);
                    arg0.method6528(class326.field4086, var112, var111 + 5, 16777215, 0);
                }
            } else if (field945 == 8) {
                short var113 = 216;
                arg0.method6528(class326.field3955, field942 + 180, var113, 16776960, 0);
                int var184 = var113 + 15;
                arg2.method6528(class326.field3956, field942 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                arg2.method6528(class326.field3944, field942 + 180, var185, 16776960, 0);
                int var186 = var185 + 15;
                int var114 = field942 + 180 - 80;
                short var115 = 321;
                Statics.field2612.method8196(var114 - 73, var115 - 20);
                arg0.method6528(class326.field4070, var114, var115 + 5, 16777215, 0);
                int var116 = field942 + 180 + 80;
                Statics.field2612.method8196(var116 - 73, var115 - 20);
                arg0.method6528(class326.field4086, var116, var115 + 5, 16777215, 0);
            } else if (field945 == 9) {
                short var117 = 221;
                arg0.method6528(field917, field942 + 180, var117, 16776960, 0);
                int var187 = var117 + 25;
                arg0.method6528(field934, field942 + 180, var187, 16776960, 0);
                int var188 = var187 + 25;
                arg0.method6528(field955, field942 + 180, var188, 16776960, 0);
                int var118 = field942 + 180;
                short var119 = 311;
                Statics.field2612.method8196(var118 - 73, var119 - 20);
                arg0.method6528(class326.field4081, var118, var119 + 5, 16777215, 0);
            } else if (field945 == 10) {
                int var120 = field942 + 180;
                short var121 = 209;
                arg0.method6528(class326.field4071, field942 + 180, var121, 16776960, 0);
                int var189 = var121 + 20;
                Statics.field3458.method8196(var120 - 109, var189);
                Statics.field1757.method8196(var120 - 48, var189 + 18);
            } else if (field945 == 12) {
                int var122 = Statics.field1453;
                short var123 = 216;
                arg2.method6528(class326.field3828, var122, var123, 16777215, 0);
                int var190 = var123 + 17;
                arg2.method6528(class326.field3847, var122, var190, 16777215, 0);
                int var191 = var190 + 17;
                arg2.method6528(class326.field4123, var122, var191, 16777215, 0);
                int var192 = var191 + 17;
                arg2.method6528(class326.field4069, var122, var192, 16777215, 0);
                int var124 = Statics.field1453 - 80;
                short var125 = 311;
                Statics.field2612.method8196(var124 - 73, var125 - 20);
                arg0.method6528(class326.field4127, var124, var125 + 5, 16777215, 0);
                int var126 = Statics.field1453 + 80;
                Statics.field2612.method8196(var126 - 73, var125 - 20);
                arg0.method6528(class326.field4128, var126, var125 + 5, 16777215, 0);
            } else if (field945 == 13) {
                short var127 = 231;
                arg2.method6528(class326.field3976, field942 + 180, var127, 16777215, 0);
                int var193 = var127 + 20;
                arg2.method6528(class326.field3872, field942 + 180, var193, 16777215, 0);
                int var128 = field942 + 180;
                short var129 = 311;
                Statics.field2612.method8196(var128 - 73, var129 - 20);
                arg0.method6528(class326.field4086, var128, var129 + 5, 16777215, 0);
            } else if (field945 == 14) {
                short var130 = 201;
                String var131 = "";
                String var132 = "";
                String var133 = "";
                switch(field925) {
                    case 0:
                        var131 = class326.field3871;
                        var132 = class326.field3837;
                        var133 = class326.field3873;
                        break;
                    case 1:
                        var131 = class326.field3910;
                        var132 = class326.field3911;
                        var133 = class326.field3912;
                        break;
                    case 2:
                        var131 = class326.field3946;
                        var132 = class326.field3947;
                        var133 = class326.field3948;
                        break;
                    default:
                        method6048(false);
                }
                arg0.method6528(var131, field942 + 180, var130, 16776960, 0);
                int var194 = var130 + 20;
                arg0.method6528(var132, field942 + 180, var194, 16776960, 0);
                int var195 = var194 + 20;
                arg0.method6528(var133, field942 + 180, var195, 16776960, 0);
                int var134 = field942 + 180;
                short var135 = 276;
                Statics.field2612.method8196(var134 - 73, var135 - 20);
                arg0.method6528(class326.field3907, var134, var135 + 5, 16777215, 0);
                int var136 = field942 + 180;
                short var137 = 326;
                Statics.field2612.method8196(var136 - 73, var137 - 20);
                arg0.method6528(class326.field4086, var136, var137 + 5, 16777215, 0);
            } else if (field945 == 24) {
                short var138 = 221;
                arg0.method6528(field917, field942 + 180, var138, 16777215, 0);
                int var196 = var138 + 15;
                arg0.method6528(field934, field942 + 180, var196, 16777215, 0);
                int var197 = var196 + 15;
                arg0.method6528(field955, field942 + 180, var197, 16777215, 0);
                int var198 = var197 + 15;
                int var139 = field942 + 180;
                short var140 = 301;
                Statics.field2612.method8196(var139 - 73, var140 - 20);
                arg0.method6528(class326.field3821, var139, var140 + 5, 16777215, 0);
            } else if (field945 == 26) {
                short var141 = 216;
                arg0.method6528(class326.field4114, field942 + 180, var141, 16776960, 0);
                int var199 = var141 + 15;
                arg2.method6528(class326.field3984, field942 + 180, var199, 16776960, 0);
                int var200 = var199 + 15;
                arg2.method6528(class326.field4116, field942 + 180, var200, 16776960, 0);
                int var201 = var200 + 15;
                int var142 = field942 + 180 - 80;
                short var143 = 321;
                Statics.field2612.method8196(var142 - 73, var143 - 20);
                arg0.method6528(class326.field4133, var142, var143 + 5, 16777215, 0);
                int var144 = field942 + 180 + 80;
                Statics.field2612.method8196(var144 - 73, var143 - 20);
                arg0.method6528(class326.field4086, var144, var143 + 5, 16777215, 0);
            }
        }
        if (client.field517 >= 10) {
            int[] var145 = new int[4];
            class477.method8114(var145);
            class477.method8112(field918, 0, field918 + 765, Statics.field4300);
            Statics.field1783.method2245(field918 - 22, client.field519);
            Statics.field1783.method2245(field918 + 765 + 22 - 128, client.field519);
            class477.method8115(var145);
        }
        Statics.field1444[Statics.field2126.method2301() ? 1 : 0].method8196(field918 + 765 - 40, 463);
        if (client.field517 <= 5 || Statics.field1905 != class348.field4294) {
            return;
        }
        if (Statics.field1341 == null) {
            Statics.field1341 = class482.method1995(Statics.field1292, "sl_button", "");
            return;
        }
        int var146 = field918 + 5;
        short var147 = 463;
        byte var148 = 100;
        byte var149 = 35;
        Statics.field1341.method8196(var146, var147);
        arg0.method6528(class326.field3995 + " " + client.field683, var148 / 2 + var146, var149 / 2 + var147 - 2, 16777215, 0);
        if (Statics.field1 == null) {
            arg1.method6528(class326.field4139, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        } else {
            arg1.method6528(class326.field4138, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("fp.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3133(String arg0, String arg1, String arg2) {
        field917 = arg0;
        field934 = arg1;
        field955 = arg2;
    }

    @ObfuscatedName("dd.k(Lbz;I)V")
    public static void method2739(class65 arg0) {
        if (arg0.method1637() != client.field510) {
            client.field510 = arg0.method1637();
            class197.method6051(arg0.method1637());
        }
        if (client.field596 != arg0.field818) {
            class331 var1 = Statics.field1292;
            int var2 = arg0.field818;
            if ((var2 & 0x20000000) != 0) {
                Statics.field920 = class482.method1995(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) != 0) {
                Statics.field920 = class482.method1995(var1, "logo_seasonal_mode", "");
            } else if ((var2 & 0x100) == 0) {
                Statics.field920 = class482.method1995(var1, "logo", "");
            } else {
                Statics.field920 = class482.method1995(var1, "logo_speedrunning", "");
            }
        }
        Statics.field1668 = arg0.field820;
        client.field683 = arg0.field812;
        client.field596 = arg0.field818;
        Statics.field1793 = client.field509 == 0 ? 43594 : arg0.field812 + 40000;
        Statics.field1654 = client.field509 == 0 ? 443 : arg0.field812 + 50000;
        Statics.field180 = Statics.field1793;
    }

    @ObfuscatedName("y.a(IB)V")
    public static void method311(int arg0) {
        method146(14);
        field925 = arg0;
    }

    @ObfuscatedName("ia.s(I)V")
    public static void method4759() {
        if (class65.method422()) {
            field946 = true;
            field948 = 0;
            field949 = 0;
        }
    }

    @ObfuscatedName("nw.l(I)V")
    public static void method6687() {
        method146(24);
        method3133(class326.field4054, class326.field4066, class326.field4023);
    }

    @ObfuscatedName("i.t(II)V")
    public static void method146(int arg0) {
        if (field945 != arg0) {
            field945 = arg0;
        }
    }

    @ObfuscatedName("bn.c(I)I")
    public static int method1916() {
        return field945;
    }
}
