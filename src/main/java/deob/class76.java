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

@ObfuscatedName("cy")
public class class76 {

    @ObfuscatedName("cy.ar")
    public static int field924 = 0;

    @ObfuscatedName("cy.ae")
    public static int field904 = field924 + 202;

    @ObfuscatedName("cy.ag")
    public static int field905 = 10;

    @ObfuscatedName("cy.ad")
    public static String field906 = "";

    @ObfuscatedName("cy.bc")
    public static int field895 = -1;

    @ObfuscatedName("cy.bb")
    public static int field932 = 1;

    @ObfuscatedName("cy.cf")
    public static int field937 = 0;

    @ObfuscatedName("cy.cg")
    public static String field910 = "";

    @ObfuscatedName("cy.cv")
    public static String field911 = "";

    @ObfuscatedName("cy.cx")
    public static String field912 = "";

    @ObfuscatedName("cy.cp")
    public static String field913 = "";

    @ObfuscatedName("cy.ce")
    public static String field914 = "";

    @ObfuscatedName("cy.ci")
    public static String field915 = "";

    @ObfuscatedName("cy.cw")
    public static int field916 = 0;

    @ObfuscatedName("cy.cq")
    public static String[] field908 = new String[8];

    @ObfuscatedName("cy.cn")
    public static String field918 = "";

    @ObfuscatedName("cy.cb")
    public static boolean field917 = false;

    @ObfuscatedName("cy.cz")
    public static boolean field920 = false;

    @ObfuscatedName("cy.cd")
    public static boolean field921 = true;

    @ObfuscatedName("cy.dt")
    public static int field922 = 0;

    @ObfuscatedName("cy.di")
    public static String field909 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cy.dk")
    public static String field902 = "1234567890";

    @ObfuscatedName("cy.dx")
    public static boolean field925 = false;

    @ObfuscatedName("cy.dr")
    public static int field930 = -1;

    @ObfuscatedName("cy.ds")
    public static int field927 = 0;

    @ObfuscatedName("cy.da")
    public static int field928 = 0;

    @ObfuscatedName("cy.dp")
    public static long field929;

    @ObfuscatedName("cy.df")
    public static long field907;

    @ObfuscatedName("cy.dv")
    public static String[] field896;

    @ObfuscatedName("cy.dz")
    public static String[] field931;

    @ObfuscatedName("cy.dl")
    public static String[] field933;

    static {
        new DecimalFormat("##0.00");
        new class136();
        field929 = -1L;
        field907 = -1L;
        field896 = new String[] { "title.jpg" };
        field931 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field933 = new String[] { "logo_speedrunning" };
    }

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rf.at(Lol;Lol;S)I")
    public static int method7425(class371 arg0, class371 arg1) {
        int var2 = 0;
        String[] var3 = field896;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method6304(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field931;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method6304(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field933;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method6300(var11) != -1 && arg1.method6304(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("hj.ah(Lol;I)I")
    public static int method3436(class371 arg0) {
        int var1 = field931.length + field896.length;
        String[] var2 = field933;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6300(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.ar(Lol;Lol;ZII)V")
    public static void method40(class371 arg0, class371 arg1, boolean arg2, int arg3) {
        if (!Statics.field4398) {
            if (arg3 == 0) {
                method2517(arg2);
            } else {
                method2815(arg3);
            }
            class537.method8826();
            byte[] var4 = arg0.method6303("title.jpg", "");
            Statics.field2602 = class31.method7894(var4);
            Statics.field900 = Statics.field2602.method8903();
            method2034(arg1, client.field485);
            Statics.field923 = class542.method5344(arg1, "titlebox", "");
            Statics.field898 = class542.method5344(arg1, "titlebutton", "");
            Statics.field899 = class542.method5344(arg1, "titlebutton_large", "");
            Statics.field48 = class542.method5344(arg1, "play_now_text", "");
            class542.method5344(arg1, "titlebutton_wide42,1", "");
            Statics.field1581 = class542.method6197(arg1, "runes", "");
            Statics.field897 = class542.method6197(arg1, "title_mute", "");
            Statics.field3387 = class542.method5344(arg1, "options_radio_buttons,0", "");
            Statics.field903 = class542.method5344(arg1, "options_radio_buttons,4", "");
            Statics.field4666 = class542.method5344(arg1, "options_radio_buttons,2", "");
            Statics.field4345 = class542.method5344(arg1, "options_radio_buttons,6", "");
            Statics.field1967 = Statics.field3387.field5229;
            Statics.field1427 = Statics.field3387.field5230;
            Statics.field1894 = new class98(Statics.field1581);
            if (arg2) {
                field914 = "";
                field915 = "";
                field908 = new String[8];
                field916 = 0;
            }
            Statics.field351 = 0;
            Statics.field1911 = "";
            field921 = true;
            field925 = false;
            if (Statics.field2450.method2503()) {
                class317.method4392(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class329(Statics.field5060, "scape main", "", 255, false));
                class317.method2334(var5, 0, 0, 0, 100, false);
            }
            class317.method7786();
            client.method3151().method6367(false);
            Statics.field4398 = true;
            field924 = (Statics.field4410 - 765) / 2;
            field904 = field924 + 202;
            Statics.field1737 = field904 + 180;
            Statics.field2602.method8883(field924, 0);
            Statics.field900.method8883(field924 + 382, 0);
            Statics.field901.method8853(field924 + 382 - Statics.field901.field5229 / 2, 18);
        } else if (arg3 == 4) {
            method2815(4);
        }
    }

    @ObfuscatedName("ko.ao(B)V")
    public static void method4983() {
        if (field914 != null && field914.length() > 0) {
            return;
        }
        if (Statics.field2450.method2465() == null) {
            client.field540 = false;
        } else {
            field914 = Statics.field2450.method2465();
            client.field540 = true;
        }
    }

    @ObfuscatedName("ay.ab(B)V")
    public static void method183() {
        if (!Statics.field4398) {
            return;
        }
        Statics.field923 = null;
        Statics.field898 = null;
        Statics.field1581 = null;
        Statics.field2602 = null;
        Statics.field900 = null;
        Statics.field901 = null;
        Statics.field897 = null;
        Statics.field3387 = null;
        Statics.field4666 = null;
        Statics.field1388 = null;
        Statics.field1523 = null;
        Statics.field1663 = null;
        Statics.field2412 = null;
        Statics.field4548 = null;
        Statics.field1894.method2378();
        class317.method4392(0, 100);
        client.method3151().method6367(true);
        Statics.field4398 = false;
    }

    @ObfuscatedName("cb.au(Lol;II)V")
    public static void method2034(class371 arg0, int arg1) {
        if ((arg1 & class523.field5123.method41()) != 0) {
            Statics.field901 = class542.method5344(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class523.field5124.method41()) != 0) {
            Statics.field901 = class542.method5344(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class523.field5095.method41()) == 0) {
            Statics.field901 = class542.method5344(arg0, "logo", "");
        } else {
            Statics.field901 = class542.method5344(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("fz.aa(I)V")
    public static void method3072() {
        if (client.field540 && field914 != null && field914.length() > 0) {
            field922 = 1;
        } else {
            field922 = 0;
        }
    }

    @ObfuscatedName("df.ac(Lbm;Lpf;Lpf;I)V")
    public static void method2368(class35 arg0, class406 arg1, class406 arg2) {
        if (field925) {
            class224 var3 = client.field725;
            class224 var4 = var3;
            while (true) {
                if (!var4.method3956()) {
                    if (class36.field229 != 1 && (Statics.field96 || class36.field229 != 4)) {
                        break;
                    }
                    int var5 = field924 + 280;
                    if (class36.field214 >= var5 && class36.field214 <= var5 + 14 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(0, 0);
                        break;
                    }
                    if (class36.field214 >= var5 + 15 && class36.field214 <= var5 + 80 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(0, 1);
                        break;
                    }
                    int var6 = field924 + 390;
                    if (class36.field214 >= var6 && class36.field214 <= var6 + 14 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(1, 0);
                        break;
                    }
                    if (class36.field214 >= var6 + 15 && class36.field214 <= var6 + 80 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(1, 1);
                        break;
                    }
                    int var7 = field924 + 500;
                    if (class36.field214 >= var7 && class36.field214 <= var7 + 14 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(2, 0);
                        break;
                    }
                    if (class36.field214 >= var7 + 15 && class36.field214 <= var7 + 80 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(2, 1);
                        break;
                    }
                    int var8 = field924 + 610;
                    if (class36.field214 >= var8 && class36.field214 <= var8 + 14 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(3, 0);
                        break;
                    }
                    if (class36.field214 >= var8 + 15 && class36.field214 <= var8 + 80 && class36.field210 >= 4 && class36.field210 <= 18) {
                        class68.method3289(3, 1);
                        break;
                    }
                    if (class36.field214 >= field924 + 708 && class36.field210 >= 4 && class36.field214 <= field924 + 708 + 50 && class36.field210 <= 20) {
                        field925 = false;
                        Statics.field2602.method8883(field924, 0);
                        Statics.field900.method8883(field924 + 382, 0);
                        Statics.field901.method8853(field924 + 382 - Statics.field901.field5229 / 2, 18);
                        break;
                    }
                    if (field930 == -1) {
                        if (field927 > 0 && Statics.field3558 != null && class36.field214 >= 0 && class36.field214 <= Statics.field3558.field5229 && class36.field210 >= Statics.field321 / 2 - 50 && class36.field210 <= Statics.field321 / 2 + 50) {
                            field927--;
                        }
                        if (field927 < field928 && Statics.field1349 != null && class36.field214 >= Statics.field4410 - Statics.field1349.field5229 - 5 && class36.field214 <= Statics.field4410 && class36.field210 >= Statics.field321 / 2 - 50 && class36.field210 <= Statics.field321 / 2 + 50) {
                            field927++;
                        }
                    } else {
                        class68 var9 = Statics.field3921[field930];
                        if (var9.method1746()) {
                            var9.field809 = "beta";
                        }
                        boolean var10 = false;
                        if (client.field485 != var9.field810) {
                            boolean var11 = (client.field485 & class523.field5110.method41()) != 0;
                            boolean var12 = var9.method1746();
                            if (var11 && !var12 || !var11 && var12) {
                                var10 = true;
                            }
                        }
                        method443(var9);
                        field925 = false;
                        Statics.field2602.method8883(field924, 0);
                        Statics.field900.method8883(field924 + 382, 0);
                        Statics.field901.method8853(field924 + 382 - Statics.field901.field5229 / 2, 18);
                        if (var10) {
                            client.method7205();
                        }
                    }
                    break;
                }
                if (var4.field2361 == 13) {
                    field925 = false;
                    Statics.field2602.method8883(field924, 0);
                    Statics.field900.method8883(field924 + 382, 0);
                    Statics.field901.method8853(field924 + 382 - Statics.field901.field5229 / 2, 18);
                    break;
                }
                if (var4.field2361 == 96) {
                    if (field927 > 0 && Statics.field3558 != null) {
                        field927--;
                    }
                } else if (var4.field2361 == 97 && field927 < field928 && Statics.field1349 != null) {
                    field927++;
                }
            }
            return;
        }
        if ((class36.field229 == 1 || !Statics.field96 && class36.field229 == 4) && class36.field214 >= field924 + 765 - 50 && class36.field210 >= 453) {
            Statics.field2450.method2443(!Statics.field2450.method2503());
            if (Statics.field2450.method2503()) {
                class317.method4392(0, 0);
            } else {
                ArrayList var13 = new ArrayList();
                var13.add(new class329(Statics.field5060, "scape main", "", 255, false));
                class317.method2334(var13, 0, 0, 0, 100, false);
            }
            class317.method7786();
        }
        if (client.field525 == 5) {
            return;
        }
        if (field929 == -1L) {
            field929 = class313.method3460() + 1000L;
        }
        long var14 = class313.method3460();
        boolean var16;
        if (client.field787 == null || client.field767 >= client.field787.size()) {
            var16 = true;
        } else {
            while (true) {
                if (client.field767 >= client.field787.size()) {
                    var16 = true;
                    break;
                }
                class84 var17 = (class84) client.field787.get(client.field767);
                if (!var17.method2211()) {
                    var16 = false;
                    break;
                }
                client.field767++;
            }
        }
        if (var16 && field907 == -1L) {
            field907 = var14;
            if (field907 > field929) {
                field929 = field907;
            }
        }
        if (client.field525 != 10 && client.field525 != 11) {
            return;
        }
        if (Statics.field1043 == class386.field4406) {
            if (class36.field229 == 1 || !Statics.field96 && class36.field229 == 4) {
                int var18 = field924 + 5;
                short var19 = 463;
                byte var20 = 100;
                byte var21 = 35;
                if (class36.field214 >= var18 && class36.field214 <= var18 + var20 && class36.field210 >= var19 && class36.field210 <= var19 + var21) {
                    if (class68.method4422()) {
                        field925 = true;
                        field927 = 0;
                        field928 = 0;
                    }
                    return;
                }
            }
            if (Statics.field5254 != null && class68.method4422()) {
                field925 = true;
                field927 = 0;
                field928 = 0;
            }
        }
        int var22 = class36.field229;
        int var23 = class36.field214;
        int var24 = class36.field210;
        if (var22 == 0) {
            var23 = class36.field217;
            var24 = class36.field218;
        }
        if (!Statics.field96 && var22 == 4) {
            var22 = 1;
        }
        class224 var25 = client.field725;
        class224 var26 = var25;
        if (field937 == 0) {
            boolean var27 = false;
            while (var26.method3956()) {
                if (var26.field2361 == 84) {
                    var27 = true;
                }
            }
            int var28 = Statics.field1737 - 80;
            short var29 = 291;
            if (var22 == 1 && var23 >= var28 - 75 && var23 <= var28 + 75 && var24 >= var29 - 20 && var24 <= var29 + 20) {
                class32.method2529(client.method4479("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var30 = Statics.field1737 + 80;
            if (var22 == 1 && var23 >= var30 - 75 && var23 <= var30 + 75 && var24 >= var29 - 20 && var24 <= var29 + 20 || var27) {
                if ((client.field485 & class523.field5112.method41()) != 0) {
                    field910 = "";
                    field911 = class364.field3926;
                    field912 = class364.field4150;
                    field913 = class364.field4151;
                    method2815(1);
                    method3072();
                } else if ((client.field485 & class523.field5096.method41()) != 0) {
                    if ((client.field485 & class523.field5104.method41()) == 0) {
                        field911 = class364.field4154;
                        field912 = class364.field4095;
                        field913 = class364.field4142;
                    } else {
                        field911 = class364.field4146;
                        field912 = class364.field4147;
                        field913 = class364.field4099;
                    }
                    field910 = class364.field3965;
                    method2815(1);
                    method3072();
                } else if ((client.field485 & class523.field5104.method41()) == 0) {
                    method841(false);
                } else {
                    field911 = class364.field4143;
                    field912 = class364.field3933;
                    field913 = class364.field4086;
                    field910 = class364.field3965;
                    method2815(1);
                    method3072();
                }
            }
        } else if (field937 == 1) {
            while (true) {
                if (!var26.method3956()) {
                    int var31 = Statics.field1737 - 80;
                    short var32 = 321;
                    if (var22 == 1 && var23 >= var31 - 75 && var23 <= var31 + 75 && var24 >= var32 - 20 && var24 <= var32 + 20) {
                        method841(false);
                    }
                    int var33 = Statics.field1737 + 80;
                    if (var22 == 1 && var23 >= var33 - 75 && var23 <= var33 + 75 && var24 >= var32 - 20 && var24 <= var32 + 20) {
                        method2815(0);
                    }
                    break;
                }
                if (var26.field2361 == 84) {
                    method841(false);
                } else if (var26.field2361 == 13) {
                    method2815(0);
                }
            }
        } else if (field937 == 2) {
            short var34 = 201;
            int var202 = var34 + 52;
            if (var22 == 1 && var24 >= var202 - 12 && var24 < var202 + 2) {
                field922 = 0;
            }
            var202 += 15;
            if (var22 == 1 && var24 >= var202 - 12 && var24 < var202 + 2) {
                field922 = 1;
            }
            var202 += 15;
            short var35 = 361;
            if (Statics.field919 != null) {
                int var36 = Statics.field919.field4755 / 2;
                if (var22 == 1 && var23 >= Statics.field919.field4756 - var36 && var23 <= Statics.field919.field4756 + var36 && var24 >= var35 - 15 && var24 < var35) {
                    switch(field932) {
                        case 1:
                            class32.method2529(class364.field4236, true, false);
                            return;
                        case 2:
                            class32.method2529("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var37 = Statics.field1737 - 80;
            short var38 = 321;
            if (var22 == 1 && var23 >= var37 - 75 && var23 <= var37 + 75 && var24 >= var38 - 20 && var24 <= var38 + 20) {
                method7819();
                return;
            }
            int var39 = field904 + 180 + 80;
            if (var22 == 1 && var23 >= var39 - 75 && var23 <= var39 + 75 && var24 >= var38 - 20 && var24 <= var38 + 20) {
                method2815(0);
                field914 = "";
                field915 = "";
                Statics.field351 = 0;
                Statics.field1911 = "";
                field921 = true;
            }
            int var40 = Statics.field1737 + -117;
            short var41 = 277;
            field917 = var23 >= var40 && var23 < Statics.field1967 + var40 && var24 >= var41 && var24 < Statics.field1427 + var41;
            if (var22 == 1 && field917) {
                client.field540 = !client.field540;
                if (!client.field540 && Statics.field2450.method2465() != null) {
                    Statics.field2450.method2458((String) null);
                }
            }
            int var42 = Statics.field1737 + 24;
            short var43 = 277;
            field920 = var23 >= var42 && var23 < Statics.field1967 + var42 && var24 >= var43 && var24 < Statics.field1427 + var43;
            if (var22 == 1 && field920) {
                Statics.field2450.method2455(!Statics.field2450.method2415());
                if (!Statics.field2450.method2415()) {
                    field914 = "";
                    Statics.field2450.method2458((String) null);
                    method3072();
                }
            }
            while (true) {
                Transferable var47;
                int var48;
                do {
                    while (true) {
                        label1419: do {
                            while (true) {
                                while (var26.method3956()) {
                                    if (var26.field2361 == 13) {
                                        method2815(0);
                                        field914 = "";
                                        field915 = "";
                                        Statics.field351 = 0;
                                        Statics.field1911 = "";
                                        field921 = true;
                                    } else {
                                        if (field922 != 0) {
                                            continue label1419;
                                        }
                                        char var44 = var26.field2364;
                                        for (int var45 = 0; var45 < field909.length() && var44 != field909.charAt(var45); var45++) {
                                        }
                                        if (var26.field2361 == 85 && field914.length() > 0) {
                                            field914 = field914.substring(0, field914.length() - 1);
                                        }
                                        if (var26.field2361 == 84 || var26.field2361 == 80) {
                                            field922 = 1;
                                        }
                                        if (method4529(var26.field2364) && field914.length() < 320) {
                                            field914 = field914 + var26.field2364;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field922 != 1);
                        if (var26.field2361 == 85 && field915.length() > 0) {
                            field915 = field915.substring(0, field915.length() - 1);
                        } else if (var26.field2361 == 84 || var26.field2361 == 80) {
                            field922 = 0;
                            if (var26.field2361 == 84) {
                                field914 = field914.trim();
                                if (field914.length() == 0) {
                                    method3022(class364.field4047, class364.field4075, class364.field4094);
                                    return;
                                }
                                if (field915.length() == 0) {
                                    method3022(class364.field4193, class364.field4051, class364.field4052);
                                    return;
                                }
                                method3022(class364.field4156, class364.field4110, class364.field4191);
                                client.method3439(false);
                                client.method4139(20);
                                return;
                            }
                        }
                        if ((var26.method3952(82) || var26.method3952(87)) && var26.field2361 == 67) {
                            Clipboard var46 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var47 = var46.getContents(Statics.field3544);
                            var48 = 20 - field915.length();
                            break;
                        }
                        if (class397.method6174(var26.field2364) && method4529(var26.field2364) && field915.length() < 20) {
                            field915 = field915 + var26.field2364;
                        }
                    }
                } while (var48 <= 0);
                try {
                    String var49 = (String) var47.getTransferData(DataFlavor.stringFlavor);
                    int var50 = Math.min(var48, var49.length());
                    for (int var51 = 0; var51 < var50; var51++) {
                        if (!class397.method6174(var49.charAt(var51)) || !method4529(var49.charAt(var51))) {
                            method2815(3);
                            return;
                        }
                    }
                    field915 = field915 + var49.substring(0, var50);
                } catch (UnsupportedFlavorException var200) {
                } catch (IOException var201) {
                }
            }
        } else if (field937 == 3) {
            int var54 = field904 + 180;
            short var55 = 241;
            class458 var56 = arg1.method6984(25, class364.field4018.length() - 34, class364.field4018, var54, var55);
            if (var22 == 1 && var56.method7602(var23, var24)) {
                class32.method2529(class364.field4235, true, false);
            }
            int var57 = field904 + 180;
            short var58 = 276;
            if (var22 == 1 && var23 >= var57 - 75 && var23 <= var57 + 75 && var24 >= var58 - 20 && var24 <= var58 + 20) {
                method2517(false);
            }
            int var59 = field904 + 180;
            short var60 = 326;
            if (var22 == 1 && var23 >= var59 - 75 && var23 <= var59 + 75 && var24 >= var60 - 20 && var24 <= var60 + 20) {
                class32.method2529(class364.field4236, true, false);
                return;
            }
        } else if (field937 == 4) {
            int var61 = field904 + 180 - 80;
            short var62 = 321;
            if (var22 == 1 && var23 >= var61 - 75 && var23 <= var61 + 75 && var24 >= var62 - 20 && var24 <= var62 + 20) {
                Statics.field1911.trim();
                if (Statics.field1911.length() != 6) {
                    method3022(class364.field3966, class364.field4200, class364.field4116);
                    return;
                }
                Statics.field351 = Integer.parseInt(Statics.field1911);
                Statics.field1911 = "";
                client.method3439(true);
                method3022(class364.field4156, class364.field4110, class364.field4191);
                client.method4139(20);
                return;
            }
            if (var22 == 1 && var23 >= field904 + 180 - 9 && var23 <= field904 + 180 + 130 && var24 >= 263 && var24 <= 296) {
                field921 = !field921;
            }
            if (var22 == 1 && var23 >= field904 + 180 - 34 && var23 <= field904 + 180 + 34 && var24 >= 351 && var24 <= 363) {
                class32.method2529(class364.field4236, true, false);
            }
            int var63 = field904 + 180 + 80;
            if (var22 == 1 && var23 >= var63 - 75 && var23 <= var63 + 75 && var24 >= var62 - 20 && var24 <= var62 + 20) {
                method2815(0);
                field914 = "";
                field915 = "";
                Statics.field351 = 0;
                Statics.field1911 = "";
            }
            while (var26.method3956()) {
                boolean var64 = false;
                for (int var65 = 0; var65 < field902.length(); var65++) {
                    if (var26.field2364 == field902.charAt(var65)) {
                        var64 = true;
                        break;
                    }
                }
                if (var26.field2361 == 13) {
                    method2815(0);
                    field914 = "";
                    field915 = "";
                    Statics.field351 = 0;
                    Statics.field1911 = "";
                } else {
                    if (var26.field2361 == 85 && Statics.field1911.length() > 0) {
                        Statics.field1911 = Statics.field1911.substring(0, Statics.field1911.length() - 1);
                    }
                    if (var26.field2361 == 84) {
                        Statics.field1911.trim();
                        if (Statics.field1911.length() != 6) {
                            method3022(class364.field3966, class364.field4200, class364.field4116);
                            return;
                        }
                        Statics.field351 = Integer.parseInt(Statics.field1911);
                        Statics.field1911 = "";
                        client.method3439(true);
                        method3022(class364.field4156, class364.field4110, class364.field4191);
                        client.method4139(20);
                        return;
                    }
                    if (var64 && Statics.field1911.length() < 6) {
                        Statics.field1911 = Statics.field1911 + var26.field2364;
                    }
                }
            }
        } else if (field937 == 5) {
            int var66 = field904 + 180 - 80;
            short var67 = 321;
            if (var22 == 1 && var23 >= var66 - 75 && var23 <= var66 + 75 && var24 >= var67 - 20 && var24 <= var67 + 20) {
                field914 = field914.trim();
                if (field914.length() == 0) {
                    method3022(class364.field4187, class364.field3930, class364.field4189);
                } else {
                    long var74;
                    try {
                        URL var68 = new URL(client.method4479("services", false) + "m=accountappeal/login.ws");
                        URLConnection var69 = var68.openConnection();
                        var69.setRequestProperty("connection", "close");
                        var69.setDoInput(true);
                        var69.setDoOutput(true);
                        var69.setConnectTimeout(5000);
                        OutputStreamWriter var70 = new OutputStreamWriter(var69.getOutputStream());
                        var70.write("data1=req");
                        var70.flush();
                        InputStream var71 = var69.getInputStream();
                        class527 var72 = new class527(new byte[1000]);
                        while (true) {
                            int var73 = var71.read(var72.field5140, var72.field5137, 1000 - var72.field5137);
                            if (var73 == -1) {
                                var72.field5137 = 0;
                                long var76 = var72.method8417();
                                var74 = var76;
                                break;
                            }
                            var72.field5137 += var73;
                            if (var72.field5137 >= 1000) {
                                var74 = 0L;
                                break;
                            }
                        }
                    } catch (Exception var196) {
                        var74 = 0L;
                    }
                    byte var81;
                    if (var74 == 0L) {
                        var81 = 5;
                    } else {
                        String var82 = field914;
                        Random var83 = new Random();
                        class527 var84 = new class527(128);
                        class527 var85 = new class527(128);
                        int[] var86 = new int[] { var83.nextInt(), var83.nextInt(), (int) (var74 >> 32), (int) var74 };
                        var84.method8393(10);
                        for (int var87 = 0; var87 < 4; var87++) {
                            var84.method8396(var83.nextInt());
                        }
                        var84.method8396(var86[0]);
                        var84.method8396(var86[1]);
                        var84.method8398(var74);
                        var84.method8398(0L);
                        for (int var88 = 0; var88 < 4; var88++) {
                            var84.method8396(var83.nextInt());
                        }
                        var84.method8567(class73.field871, class73.field872);
                        var85.method8393(10);
                        for (int var89 = 0; var89 < 3; var89++) {
                            var85.method8396(var83.nextInt());
                        }
                        var85.method8398(var83.nextLong());
                        var85.method8397(var83.nextLong());
                        client.method6198(var85);
                        var85.method8398(var83.nextLong());
                        var85.method8567(class73.field871, class73.field872);
                        int var90 = class527.method3196(var82);
                        if (var90 % 8 != 0) {
                            var90 += 8 - var90 % 8;
                        }
                        class527 var91 = new class527(var90);
                        var91.method8400(var82);
                        var91.field5137 = var90;
                        var91.method8433(var86);
                        class527 var92 = new class527(var91.field5137 + var85.field5137 + var84.field5137 + 5);
                        var92.method8393(2);
                        var92.method8393(var84.field5137);
                        var92.method8575(var84.field5140, 0, var84.field5137);
                        var92.method8393(var85.field5137);
                        var92.method8575(var85.field5140, 0, var85.field5137);
                        var92.method8394(var91.field5137);
                        var92.method8575(var91.field5140, 0, var91.field5137);
                        String var93 = class398.method7123(var92.field5140);
                        byte var100;
                        try {
                            URL var94 = new URL(client.method4479("services", false) + "m=accountappeal/login.ws");
                            URLConnection var95 = var94.openConnection();
                            var95.setDoInput(true);
                            var95.setDoOutput(true);
                            var95.setConnectTimeout(5000);
                            OutputStreamWriter var96 = new OutputStreamWriter(var95.getOutputStream());
                            var96.write("data2=" + class552.method4106(var93) + "&dest=" + class552.method4106("passwordchoice.ws"));
                            var96.flush();
                            InputStream var97 = var95.getInputStream();
                            class527 var98 = new class527(new byte[1000]);
                            while (true) {
                                int var99 = var97.read(var98.field5140, var98.field5137, 1000 - var98.field5137);
                                if (var99 == -1) {
                                    var96.close();
                                    var97.close();
                                    String var101 = new String(var98.field5140);
                                    if (var101.startsWith("OFFLINE")) {
                                        var100 = 4;
                                    } else if (var101.startsWith("WRONG")) {
                                        var100 = 7;
                                    } else if (var101.startsWith("RELOAD")) {
                                        var100 = 3;
                                    } else if (var101.startsWith("Not permitted for social network accounts.")) {
                                        var100 = 6;
                                    } else {
                                        var98.method8434(var86);
                                        while (var98.field5137 > 0 && var98.field5140[var98.field5137 - 1] == 0) {
                                            var98.field5137--;
                                        }
                                        String var102 = new String(var98.field5140, 0, var98.field5137);
                                        boolean var103;
                                        if (var102 == null) {
                                            var103 = false;
                                        } else {
                                            label1588: {
                                                try {
                                                    new URL(var102);
                                                } catch (MalformedURLException var194) {
                                                    var103 = false;
                                                    break label1588;
                                                }
                                                var103 = true;
                                            }
                                        }
                                        if (var103) {
                                            class32.method2529(var102, true, false);
                                            var100 = 2;
                                        } else {
                                            var100 = 5;
                                        }
                                    }
                                    break;
                                }
                                var98.field5137 += var99;
                                if (var98.field5137 >= 1000) {
                                    var100 = 5;
                                    break;
                                }
                            }
                        } catch (Throwable var195) {
                            var195.printStackTrace();
                            var100 = 5;
                        }
                        var81 = var100;
                    }
                    switch(var81) {
                        case 2:
                            method3022(class364.field4190, class364.field4119, class364.field4192);
                            method2815(6);
                            break;
                        case 3:
                            method3022(class364.field4006, class364.field4194, class364.field4195);
                            break;
                        case 4:
                            method3022(class364.field3958, class364.field4197, class364.field4198);
                            break;
                        case 5:
                            method3022(class364.field4199, class364.field4106, class364.field4072);
                            break;
                        case 6:
                            method3022(class364.field4202, class364.field4203, class364.field4204);
                            break;
                        case 7:
                            method3022(class364.field3974, class364.field4206, class364.field4207);
                    }
                }
                return;
            }
            int var106 = field904 + 180 + 80;
            if (var22 == 1 && var23 >= var106 - 75 && var23 <= var106 + 75 && var24 >= var67 - 20 && var24 <= var67 + 20) {
                method841(true);
            }
            short var107 = 361;
            if (Statics.field22 != null) {
                int var108 = Statics.field22.field4755 / 2;
                if (var22 == 1 && var23 >= Statics.field22.field4756 - var108 && var23 <= Statics.field22.field4756 + var108 && var24 >= var107 - 15 && var24 < var107) {
                    class32.method2529(client.method4479("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var26.method3956()) {
                boolean var109 = false;
                for (int var110 = 0; var110 < field909.length(); var110++) {
                    if (var26.field2364 == field909.charAt(var110)) {
                        var109 = true;
                        break;
                    }
                }
                if (var26.field2361 == 13) {
                    method841(true);
                } else {
                    if (var26.field2361 == 85 && field914.length() > 0) {
                        field914 = field914.substring(0, field914.length() - 1);
                    }
                    if (var26.field2361 == 84) {
                        field914 = field914.trim();
                        if (field914.length() == 0) {
                            method3022(class364.field4187, class364.field3930, class364.field4189);
                        } else {
                            long var117;
                            try {
                                URL var111 = new URL(client.method4479("services", false) + "m=accountappeal/login.ws");
                                URLConnection var112 = var111.openConnection();
                                var112.setRequestProperty("connection", "close");
                                var112.setDoInput(true);
                                var112.setDoOutput(true);
                                var112.setConnectTimeout(5000);
                                OutputStreamWriter var113 = new OutputStreamWriter(var112.getOutputStream());
                                var113.write("data1=req");
                                var113.flush();
                                InputStream var114 = var112.getInputStream();
                                class527 var115 = new class527(new byte[1000]);
                                while (true) {
                                    int var116 = var114.read(var115.field5140, var115.field5137, 1000 - var115.field5137);
                                    if (var116 == -1) {
                                        var115.field5137 = 0;
                                        long var119 = var115.method8417();
                                        var117 = var119;
                                        break;
                                    }
                                    var115.field5137 += var116;
                                    if (var115.field5137 >= 1000) {
                                        var117 = 0L;
                                        break;
                                    }
                                }
                            } catch (Exception var199) {
                                var117 = 0L;
                            }
                            byte var124;
                            if (var117 == 0L) {
                                var124 = 5;
                            } else {
                                String var125 = field914;
                                Random var126 = new Random();
                                class527 var127 = new class527(128);
                                class527 var128 = new class527(128);
                                int[] var129 = new int[] { var126.nextInt(), var126.nextInt(), (int) (var117 >> 32), (int) var117 };
                                var127.method8393(10);
                                for (int var130 = 0; var130 < 4; var130++) {
                                    var127.method8396(var126.nextInt());
                                }
                                var127.method8396(var129[0]);
                                var127.method8396(var129[1]);
                                var127.method8398(var117);
                                var127.method8398(0L);
                                for (int var131 = 0; var131 < 4; var131++) {
                                    var127.method8396(var126.nextInt());
                                }
                                var127.method8567(class73.field871, class73.field872);
                                var128.method8393(10);
                                for (int var132 = 0; var132 < 3; var132++) {
                                    var128.method8396(var126.nextInt());
                                }
                                var128.method8398(var126.nextLong());
                                var128.method8397(var126.nextLong());
                                client.method6198(var128);
                                var128.method8398(var126.nextLong());
                                var128.method8567(class73.field871, class73.field872);
                                int var133 = class527.method3196(var125);
                                if (var133 % 8 != 0) {
                                    var133 += 8 - var133 % 8;
                                }
                                class527 var134 = new class527(var133);
                                var134.method8400(var125);
                                var134.field5137 = var133;
                                var134.method8433(var129);
                                class527 var135 = new class527(var134.field5137 + var128.field5137 + var127.field5137 + 5);
                                var135.method8393(2);
                                var135.method8393(var127.field5137);
                                var135.method8575(var127.field5140, 0, var127.field5137);
                                var135.method8393(var128.field5137);
                                var135.method8575(var128.field5140, 0, var128.field5137);
                                var135.method8394(var134.field5137);
                                var135.method8575(var134.field5140, 0, var134.field5137);
                                String var136 = class398.method7123(var135.field5140);
                                byte var143;
                                try {
                                    URL var137 = new URL(client.method4479("services", false) + "m=accountappeal/login.ws");
                                    URLConnection var138 = var137.openConnection();
                                    var138.setDoInput(true);
                                    var138.setDoOutput(true);
                                    var138.setConnectTimeout(5000);
                                    OutputStreamWriter var139 = new OutputStreamWriter(var138.getOutputStream());
                                    var139.write("data2=" + class552.method4106(var136) + "&dest=" + class552.method4106("passwordchoice.ws"));
                                    var139.flush();
                                    InputStream var140 = var138.getInputStream();
                                    class527 var141 = new class527(new byte[1000]);
                                    while (true) {
                                        int var142 = var140.read(var141.field5140, var141.field5137, 1000 - var141.field5137);
                                        if (var142 == -1) {
                                            var139.close();
                                            var140.close();
                                            String var144 = new String(var141.field5140);
                                            if (var144.startsWith("OFFLINE")) {
                                                var143 = 4;
                                            } else if (var144.startsWith("WRONG")) {
                                                var143 = 7;
                                            } else if (var144.startsWith("RELOAD")) {
                                                var143 = 3;
                                            } else if (var144.startsWith("Not permitted for social network accounts.")) {
                                                var143 = 6;
                                            } else {
                                                var141.method8434(var129);
                                                while (var141.field5137 > 0 && var141.field5140[var141.field5137 - 1] == 0) {
                                                    var141.field5137--;
                                                }
                                                String var145 = new String(var141.field5140, 0, var141.field5137);
                                                boolean var146;
                                                if (var145 == null) {
                                                    var146 = false;
                                                } else {
                                                    label1590: {
                                                        try {
                                                            new URL(var145);
                                                        } catch (MalformedURLException var197) {
                                                            var146 = false;
                                                            break label1590;
                                                        }
                                                        var146 = true;
                                                    }
                                                }
                                                if (var146) {
                                                    class32.method2529(var145, true, false);
                                                    var143 = 2;
                                                } else {
                                                    var143 = 5;
                                                }
                                            }
                                            break;
                                        }
                                        var141.field5137 += var142;
                                        if (var141.field5137 >= 1000) {
                                            var143 = 5;
                                            break;
                                        }
                                    }
                                } catch (Throwable var198) {
                                    var198.printStackTrace();
                                    var143 = 5;
                                }
                                var124 = var143;
                            }
                            switch(var124) {
                                case 2:
                                    method3022(class364.field4190, class364.field4119, class364.field4192);
                                    method2815(6);
                                    break;
                                case 3:
                                    method3022(class364.field4006, class364.field4194, class364.field4195);
                                    break;
                                case 4:
                                    method3022(class364.field3958, class364.field4197, class364.field4198);
                                    break;
                                case 5:
                                    method3022(class364.field4199, class364.field4106, class364.field4072);
                                    break;
                                case 6:
                                    method3022(class364.field4202, class364.field4203, class364.field4204);
                                    break;
                                case 7:
                                    method3022(class364.field3974, class364.field4206, class364.field4207);
                            }
                        }
                        return;
                    }
                    if (var109 && field914.length() < 320) {
                        field914 = field914 + var26.field2364;
                    }
                }
            }
        } else if (field937 == 6) {
            while (true) {
                do {
                    if (!var26.method3956()) {
                        short var149 = 321;
                        if (var22 == 1 && var24 >= var149 - 20 && var24 <= var149 + 20) {
                            method841(true);
                        }
                        return;
                    }
                } while (var26.field2361 != 84 && var26.field2361 != 13);
                method841(true);
            }
        } else if (field937 == 7) {
            if (Statics.field1170 && !client.field492) {
                int var150 = Statics.field1737 - 150;
                int var151 = var150 + 240 + 25 + 40;
                short var152 = 231;
                int var153 = var152 + 40;
                if (var22 == 1 && var23 >= var150 && var23 <= var151 && var24 >= var152 && var24 <= var153) {
                    field916 = Statics.method1872(var150, var23);
                }
                int var154 = field904 + 180 - 80;
                short var155 = 321;
                if (var22 == 1 && var23 >= var154 - 75 && var23 <= var154 + 75 && var24 >= var155 - 20 && var24 <= var155 + 20) {
                    boolean var156 = Statics.method703();
                    if (var156) {
                        client.method4139(50);
                        return;
                    }
                }
                int var157 = field904 + 180 + 80;
                if (var22 == 1 && var23 >= var157 - 75 && var23 <= var157 + 75 && var24 >= var155 - 20 && var24 <= var155 + 20) {
                    field908 = new String[8];
                    method841(true);
                }
                while (var26.method3956()) {
                    if (var26.field2361 == 101) {
                        field908[field916] = null;
                    }
                    if (var26.field2361 == 85) {
                        if (field908[field916] == null && field916 > 0) {
                            field916--;
                        }
                        field908[field916] = null;
                    }
                    if (var26.field2364 >= '0' && var26.field2364 <= '9') {
                        field908[field916] = "" + var26.field2364;
                        if (field916 < 7) {
                            field916++;
                        }
                    }
                    if (var26.field2361 == 84) {
                        boolean var158 = Statics.method703();
                        if (var158) {
                            client.method4139(50);
                        }
                        return;
                    }
                }
            } else {
                int var159 = field904 + 180 - 80;
                short var160 = 321;
                if (var22 == 1 && var23 >= var159 - 75 && var23 <= var159 + 75 && var24 >= var160 - 20 && var24 <= var160 + 20) {
                    class32.method2529(client.method4479("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3022(class364.field4184, class364.field4185, class364.field4186);
                    method2815(6);
                    return;
                }
                int var161 = field904 + 180 + 80;
                if (var22 == 1 && var23 >= var161 - 75 && var23 <= var161 + 75 && var24 >= var160 - 20 && var24 <= var160 + 20) {
                    method841(true);
                }
            }
        } else if (field937 == 8) {
            int var162 = field904 + 180 - 80;
            short var163 = 321;
            if (var22 == 1 && var23 >= var162 - 75 && var23 <= var162 + 75 && var24 >= var163 - 20 && var24 <= var163 + 20) {
                class32.method2529("https://www.jagex.com/terms/privacy", true, false);
                method3022(class364.field4184, class364.field4185, class364.field4186);
                method2815(6);
                return;
            }
            int var164 = field904 + 180 + 80;
            if (var22 == 1 && var23 >= var164 - 75 && var23 <= var164 + 75 && var24 >= var163 - 20 && var24 <= var163 + 20) {
                method841(true);
            }
        } else if (field937 == 9) {
            int var165 = field904 + 180;
            short var166 = 311;
            if (var25.field2361 == 84 || var25.field2361 == 13 || var22 == 1 && var23 >= var165 - 75 && var23 <= var165 + 75 && var24 >= var166 - 20 && var24 <= var166 + 20) {
                method2517(false);
            }
        } else if (field937 == 10) {
            int var167 = field904 + 180;
            short var168 = 209;
            if (var25.field2361 == 84 || var22 == 1 && var23 >= var167 - 109 && var23 <= var167 + 109 && var24 >= var168 && var24 <= var168 + 68) {
                method3022(class364.field4156, class364.field4110, class364.field4191);
                client.field527 = class532.field5193;
                client.method3439(false);
                client.method4139(20);
            }
        } else if (field937 == 12) {
            int var169 = Statics.field1737;
            short var170 = 233;
            class458 var171 = arg2.method6984(0, 30, class364.field4165, var169, var170);
            class458 var172 = arg2.method6984(32, 32, class364.field4165, var169, var170);
            class458 var173 = arg2.method6984(70, 34, class364.field4165, var169, var170);
            int var203 = var170 + 17;
            class458 var174 = arg2.method6984(0, 34, class364.field4217, var169, var203);
            if (var22 == 1) {
                if (var171.method7602(var23, var24)) {
                    class32.method2529("https://www.jagex.com/terms", true, false);
                } else if (var172.method7602(var23, var24)) {
                    class32.method2529("https://www.jagex.com/terms/privacy", true, false);
                } else if (var173.method7602(var23, var24) || var174.method7602(var23, var24)) {
                    class32.method2529("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var175 = Statics.field1737 - 80;
            short var176 = 311;
            if (var22 == 1 && var23 >= var175 - 75 && var23 <= var175 + 75 && var24 >= var176 - 20 && var24 <= var176 + 20) {
                Statics.field2450.method2433(client.field489);
                method2517(true);
            }
            int var177 = Statics.field1737 + 80;
            if (var22 == 1 && var23 >= var177 - 75 && var23 <= var177 + 75 && var24 >= var176 - 20 && var24 <= var176 + 20) {
                field937 = 13;
            }
        } else if (field937 == 13) {
            int var178 = Statics.field1737;
            short var179 = 321;
            if (var22 == 1 && var23 >= var178 - 75 && var23 <= var178 + 75 && var24 >= var179 - 20 && var24 <= var179 + 20) {
                method2517(true);
            }
        } else if (field937 == 14) {
            String var180 = "";
            switch(field895) {
                case 0:
                    var180 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var180 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var180 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method841(false);
            }
            int var181 = field904 + 180;
            short var182 = 276;
            if (var22 == 1 && var23 >= var181 - 75 && var23 <= var181 + 75 && var24 >= var182 - 20 && var24 <= var182 + 20) {
                class32.method2529(var180, true, false);
                method3022(class364.field4184, class364.field4185, class364.field4186);
                method2815(6);
                return;
            }
            int var183 = field904 + 180;
            short var184 = 326;
            if (var22 == 1 && var23 >= var183 - 75 && var23 <= var183 + 75 && var24 >= var184 - 20 && var24 <= var184 + 20) {
                method841(false);
            }
        } else if (field937 == 24) {
            int var185 = field904 + 180;
            short var186 = 301;
            if (var22 == 1 && var23 >= var185 - 75 && var23 <= var185 + 75 && var24 >= var186 - 20 && var24 <= var186 + 20) {
                method2517(false);
            }
        } else if (field937 == 32) {
            int var187 = field904 + 180 - 80;
            short var188 = 321;
            if (var22 == 1 && var23 >= var187 - 75 && var23 <= var187 + 75 && var24 >= var188 - 20 && var24 <= var188 + 20) {
                class32.method2529(client.method4479("secure", true) + "m=dob/set_dob.ws", true, false);
                method3022(class364.field4184, class364.field4185, class364.field4186);
                method2815(6);
                return;
            }
            int var189 = field904 + 180 + 80;
            if (var22 == 1 && var23 >= var189 - 75 && var23 <= var189 + 75 && var24 >= var188 - 20 && var24 <= var188 + 20) {
                method841(true);
            }
        } else if (field937 == 33) {
            int var190 = field904 + 180;
            short var191 = 276;
            if (var22 == 1 && var23 >= var190 - 75 && var23 <= var190 + 75 && var24 >= var191 - 20 && var24 <= var191 + 20) {
                class32.method2529(class364.field4235, true, false);
            }
            int var192 = field904 + 180;
            short var193 = 326;
            if (var22 == 1 && var23 >= var192 - 75 && var23 <= var192 + 75 && var24 >= var193 - 20 && var24 <= var193 + 20) {
                method841(true);
            }
        }
    }

    @ObfuscatedName("ss.al(I)V")
    public static void method7819() {
        field914 = field914.trim();
        if (field914.length() == 0) {
            method3022(class364.field4047, class364.field4075, class364.field4094);
        } else if (field915.length() == 0) {
            method3022(class364.field4193, class364.field4051, class364.field4052);
        } else {
            method3022(class364.field4156, class364.field4110, class364.field4191);
            client.method3439(false);
            client.method4139(20);
        }
    }

    @ObfuscatedName("jr.ap(Ljava/util/Date;I)Z")
    public static boolean method4423(Date arg0) {
        Calendar var1 = Calendar.getInstance();
        var1.set(2, 0);
        var1.set(5, 1);
        var1.set(1, 1900);
        Date var2 = var1.getTime();
        return arg0.after(var2);
    }

    @ObfuscatedName("pr.av(I)Ljava/util/Date;")
    public static Date method6718() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field908;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method2815(7);
                method3022("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("ja.as(CI)Z")
    public static boolean method4529(char arg0) {
        return field909.indexOf(arg0) != -1;
    }

    @ObfuscatedName("bz.ay(ZI)V")
    public static void method841(boolean arg0) {
        if (Statics.field3544.method1257() || Statics.field3544.method1253() || Statics.field3544.method1186()) {
            method2815(10);
            return;
        }
        field911 = class364.field4136;
        field912 = class364.field4137;
        field913 = class364.field3964;
        method2815(2);
        if (arg0) {
            field915 = "";
        }
        method4983();
        method3072();
    }

    @ObfuscatedName("dl.ak(ZB)V")
    public static void method2517(boolean arg0) {
        byte var1 = 0;
        if (!client.method17()) {
            var1 = 12;
        } else if (Statics.field3544.method1257() || Statics.field3544.method1253() || Statics.field3544.method1186()) {
            var1 = 10;
        }
        method2815(var1);
        if (arg0) {
            field914 = "";
            field915 = "";
            Statics.field351 = 0;
            Statics.field1911 = "";
        }
        method4983();
        method3072();
    }

    @ObfuscatedName("ea.aj(Lpf;Lpf;Lpf;I)V")
    public static void method2769(class406 arg0, class406 arg1, class406 arg2) {
        field924 = (Statics.field4410 - 765) / 2;
        field904 = field924 + 202;
        Statics.field1737 = field904 + 180;
        if (field925) {
            method3515(arg0, arg1);
            return;
        }
        Statics.field2602.method8883(field924, 0);
        Statics.field900.method8883(field924 + 382, 0);
        Statics.field901.method8853(field924 + 382 - Statics.field901.field5229 / 2, 18);
        if (client.field525 == 0 || client.field525 == 5) {
            byte var3 = 20;
            arg0.method6987(class364.field4135, field904 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class537.method8767(field904 + 180 - 152, var4, 304, 34, 9179409);
            class537.method8767(field904 + 180 - 151, var4 + 1, 302, 32, 0);
            class537.method8837(field904 + 180 - 150, var4 + 2, field905 * 3, 30, 9179409);
            class537.method8837(field905 * 3 + (field904 + 180 - 150), var4 + 2, 300 - field905 * 3, 30, 0);
            arg0.method6987(field906, field904 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field525 == 20) {
            Statics.field923.method8853(field904 + 180 - Statics.field923.field5229 / 2, 271 - Statics.field923.field5230 / 2);
            short var5 = 201;
            arg0.method6987(field911, field904 + 180, var5, 16776960, 0);
            int var116 = var5 + 15;
            arg0.method6987(field912, field904 + 180, var116, 16776960, 0);
            int var117 = var116 + 15;
            arg0.method6987(field913, field904 + 180, var117, 16776960, 0);
            int var118 = var117 + 15;
            int var119 = var118 + 7;
            if (field937 != 4 && field937 != 10) {
                arg0.method6981(class364.field4024, field904 + 180 - 110, var119, 16777215, 0);
                short var6 = 200;
                String var7 = Statics.field2450.method2415() ? class399.method5580(field914) : field914;
                String var8;
                for (var8 = var7; arg0.method7018(var8) > var6; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method6981(class410.method7025(var8), field904 + 180 - 70, var119, 16777215, 0);
                var116 = var119 + 15;
                String var9;
                for (var9 = class399.method5580(field915); arg0.method7018(var9) > var6; var9 = var9.substring(1)) {
                }
                arg0.method6981(class364.field4163 + var9, field904 + 180 - 108, var116, 16777215, 0);
                var116 += 15;
            }
        }
        if (client.field525 == 10 || client.field525 == 11 || client.field525 == 50) {
            Statics.field923.method8853(field904, 171);
            if (field937 == 0) {
                short var10 = 251;
                arg0.method6987(class364.field3954, field904 + 180, var10, 16776960, 0);
                int var120 = var10 + 30;
                int var11 = field904 + 180 - 80;
                short var12 = 291;
                Statics.field898.method8853(var11 - 73, var12 - 20);
                arg0.method7060(class364.field4166, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field904 + 180 + 80;
                Statics.field898.method8853(var13 - 73, var12 - 20);
                arg0.method7060(class364.field4167, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field937 == 1) {
                arg0.method6987(field910, field904 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method6987(field911, field904 + 180, var14, 16777215, 0);
                int var121 = var14 + 15;
                arg0.method6987(field912, field904 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method6987(field913, field904 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                int var15 = field904 + 180 - 80;
                short var16 = 321;
                Statics.field898.method8853(var15 - 73, var16 - 20);
                arg0.method6987(class364.field3932, var15, var16 + 5, 16777215, 0);
                int var17 = field904 + 180 + 80;
                Statics.field898.method8853(var17 - 73, var16 - 20);
                arg0.method6987(class364.field4181, var17, var16 + 5, 16777215, 0);
            } else if (field937 == 2) {
                short var18 = 201;
                arg0.method6987(field911, Statics.field1737, var18, 16776960, 0);
                int var124 = var18 + 15;
                arg0.method6987(field912, Statics.field1737, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method6987(field913, Statics.field1737, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 7;
                arg0.method6981(class364.field4024, Statics.field1737 - 110, var127, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field2450.method2415() ? class399.method5580(field914) : field914;
                String var21;
                for (var21 = var20; arg0.method7018(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method6981(class410.method7025(var21) + (field922 == 0 & client.field500 % 40 < 20 ? class102.method3201(16776960) + class102.field1318 : ""), Statics.field1737 - 70, var127, 16777215, 0);
                var124 = var127 + 15;
                String var22;
                for (var22 = class399.method5580(field915); arg0.method7018(var22) > var19; var22 = var22.substring(1)) {
                }
                arg0.method6981(class364.field4163 + var22 + (field922 == 1 & client.field500 % 40 < 20 ? class102.method3201(16776960) + class102.field1318 : ""), Statics.field1737 - 108, var124, 16777215, 0);
                var124 += 15;
                short var23 = 277;
                int var24 = Statics.field1737 + -117;
                boolean var25 = client.field540;
                boolean var26 = field917;
                class540 var27 = var25 ? (var26 ? Statics.field4345 : Statics.field4666) : (var26 ? Statics.field903 : Statics.field3387);
                var27.method8853(var24, var23);
                int var29 = var27.field5229 + 5 + var24;
                arg1.method6981(class364.field3938, var29, var23 + 13, 16776960, 0);
                int var30 = Statics.field1737 + 24;
                boolean var31 = Statics.field2450.method2415();
                boolean var32 = field920;
                class540 var33 = var31 ? (var32 ? Statics.field4345 : Statics.field4666) : (var32 ? Statics.field903 : Statics.field3387);
                var33.method8853(var30, var23);
                int var35 = var33.field5229 + 5 + var30;
                arg1.method6981(class364.field4171, var35, var23 + 13, 16776960, 0);
                int var128 = var23 + 15;
                int var36 = Statics.field1737 - 80;
                short var37 = 321;
                Statics.field898.method8853(var36 - 73, var37 - 20);
                arg0.method6987(class364.field3934, var36, var37 + 5, 16777215, 0);
                int var38 = Statics.field1737 + 80;
                Statics.field898.method8853(var38 - 73, var37 - 20);
                arg0.method6987(class364.field4181, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                switch(field932) {
                    case 2:
                        Statics.field4427 = class364.field4183;
                        break;
                    default:
                        Statics.field4427 = class364.field4196;
                }
                Statics.field919 = new class458(Statics.field1737, var39, arg1.method7018(Statics.field4427), 11);
                Statics.field22 = new class458(Statics.field1737, var39, arg1.method7018(class364.field4084), 11);
                arg1.method6987(Statics.field4427, Statics.field1737, var39, 16777215, 0);
            } else if (field937 == 3) {
                short var40 = 201;
                arg0.method6987(class364.field4172, field904 + 180, var40, 16776960, 0);
                int var129 = var40 + 20;
                arg1.method6987(class364.field4173, field904 + 180, var129, 16776960, 0);
                int var130 = var129 + 20;
                arg1.method6987(class364.field4018, field904 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                int var41 = field904 + 180;
                short var42 = 276;
                Statics.field898.method8853(var41 - 73, var42 - 20);
                arg2.method6987(class364.field4175, var41, var42 + 5, 16777215, 0);
                int var43 = field904 + 180;
                short var44 = 326;
                Statics.field898.method8853(var43 - 73, var44 - 20);
                arg2.method6987(class364.field4176, var43, var44 + 5, 16777215, 0);
            } else if (field937 == 4) {
                arg0.method6987(class364.field4152, field904 + 180, 201, 16776960, 0);
                short var45 = 236;
                arg0.method6987(field911, field904 + 180, var45, 16777215, 0);
                int var132 = var45 + 15;
                arg0.method6987(field912, field904 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method6987(field913, field904 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                arg0.method6981(class364.field4164 + class399.method5580(Statics.field1911) + (client.field500 % 40 < 20 ? class102.method3201(16776960) + class102.field1318 : ""), field904 + 180 - 108, var134, 16777215, 0);
                int var135 = var134 - 8;
                arg0.method6981(class364.field3935, field904 + 180 - 9, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method6981(class364.field3936, field904 + 180 - 9, var136, 16776960, 0);
                int var46 = field904 + 180 - 9 + arg0.method7018(class364.field3936) + 15;
                int var47 = var136 - arg0.field4520;
                class540 var48;
                if (field921) {
                    var48 = Statics.field4666;
                } else {
                    var48 = Statics.field3387;
                }
                var48.method8853(var46, var47);
                var132 = var136 + 15;
                int var49 = field904 + 180 - 80;
                short var50 = 321;
                Statics.field898.method8853(var49 - 73, var50 - 20);
                arg0.method6987(class364.field3932, var49, var50 + 5, 16777215, 0);
                int var51 = field904 + 180 + 80;
                Statics.field898.method8853(var51 - 73, var50 - 20);
                arg0.method6987(class364.field4181, var51, var50 + 5, 16777215, 0);
                arg1.method6987(class364.field4196, field904 + 180, var50 + 36, 16777215, 0);
            } else if (field937 == 5) {
                arg0.method6987(class364.field4177, field904 + 180, 201, 16776960, 0);
                short var52 = 221;
                arg2.method6987(field911, field904 + 180, var52, 16776960, 0);
                int var137 = var52 + 15;
                arg2.method6987(field912, field904 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg2.method6987(field913, field904 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var140 = var139 + 14;
                arg0.method6981(class364.field4170, field904 + 180 - 145, var140, 16777215, 0);
                short var53 = 174;
                String var54 = Statics.field2450.method2415() ? class399.method5580(field914) : field914;
                String var55;
                for (var55 = var54; arg0.method7018(var55) > var53; var55 = var55.substring(1)) {
                }
                arg0.method6981(class410.method7025(var55) + (client.field500 % 40 < 20 ? class102.method3201(16776960) + class102.field1318 : ""), field904 + 180 - 34, var140, 16777215, 0);
                var137 = var140 + 15;
                int var56 = field904 + 180 - 80;
                short var57 = 321;
                Statics.field898.method8853(var56 - 73, var57 - 20);
                arg0.method6987(class364.field4179, var56, var57 + 5, 16777215, 0);
                int var58 = field904 + 180 + 80;
                Statics.field898.method8853(var58 - 73, var57 - 20);
                arg0.method6987(class364.field4180, var58, var57 + 5, 16777215, 0);
                short var59 = 356;
                arg1.method6987(class364.field4084, Statics.field1737, var59, 268435455, 0);
            } else if (field937 == 6) {
                short var60 = 201;
                arg0.method6987(field911, field904 + 180, var60, 16776960, 0);
                int var141 = var60 + 15;
                arg0.method6987(field912, field904 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method6987(field913, field904 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var61 = field904 + 180;
                short var62 = 321;
                Statics.field898.method8853(var61 - 73, var62 - 20);
                arg0.method6987(class364.field4180, var61, var62 + 5, 16777215, 0);
            } else if (field937 == 7) {
                if (Statics.field1170 && !client.field492) {
                    short var63 = 201;
                    arg0.method6987(field911, Statics.field1737, var63, 16776960, 0);
                    int var144 = var63 + 15;
                    arg0.method6987(field912, Statics.field1737, var144, 16776960, 0);
                    int var145 = var144 + 15;
                    arg0.method6987(field913, Statics.field1737, var145, 16776960, 0);
                    int var64 = Statics.field1737 - 150;
                    int var146 = var145 + 10;
                    for (int var65 = 0; var65 < 8; var65++) {
                        Statics.field898.method8855(var64, var146, 30, 40);
                        boolean var66 = field916 == var65 & client.field500 % 40 < 20;
                        arg0.method6981((field908[var65] == null ? "" : field908[var65]) + (var66 ? class102.method3201(16776960) + class102.field1318 : ""), var64 + 10, var146 + 27, 16777215, 0);
                        if (var65 == 1 || var65 == 3) {
                            var64 += 50;
                            arg0.method6981(class410.method7025("/"), var64 - 13, var146 + 27, 16777215, 0);
                        } else {
                            var64 += 35;
                        }
                    }
                    int var67 = Statics.field1737 - 80;
                    short var68 = 321;
                    Statics.field898.method8853(var67 - 73, var68 - 20);
                    arg0.method6987("Submit", var67, var68 + 5, 16777215, 0);
                    int var69 = Statics.field1737 + 80;
                    Statics.field898.method8853(var69 - 73, var68 - 20);
                    arg0.method6987(class364.field4181, var69, var68 + 5, 16777215, 0);
                } else {
                    short var70 = 216;
                    arg0.method6987(class364.field4208, field904 + 180, var70, 16776960, 0);
                    int var147 = var70 + 15;
                    arg2.method6987(class364.field4209, field904 + 180, var147, 16776960, 0);
                    int var148 = var147 + 15;
                    arg2.method6987(class364.field4213, field904 + 180, var148, 16776960, 0);
                    int var149 = var148 + 15;
                    int var71 = field904 + 180 - 80;
                    short var72 = 321;
                    Statics.field898.method8853(var71 - 73, var72 - 20);
                    arg0.method6987(class364.field4211, var71, var72 + 5, 16777215, 0);
                    int var73 = field904 + 180 + 80;
                    Statics.field898.method8853(var73 - 73, var72 - 20);
                    arg0.method6987(class364.field4180, var73, var72 + 5, 16777215, 0);
                }
            } else if (field937 == 8) {
                short var74 = 216;
                arg0.method6987(class364.field4065, field904 + 180, var74, 16776960, 0);
                int var150 = var74 + 15;
                arg2.method6987(class364.field4066, field904 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg2.method6987(class364.field4067, field904 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var75 = field904 + 180 - 80;
                short var76 = 321;
                Statics.field898.method8853(var75 - 73, var76 - 20);
                arg0.method6987(class364.field4068, var75, var76 + 5, 16777215, 0);
                int var77 = field904 + 180 + 80;
                Statics.field898.method8853(var77 - 73, var76 - 20);
                arg0.method6987(class364.field4180, var77, var76 + 5, 16777215, 0);
            } else if (field937 == 9) {
                short var78 = 221;
                arg0.method6987(field911, field904 + 180, var78, 16776960, 0);
                int var153 = var78 + 25;
                arg0.method6987(field912, field904 + 180, var153, 16776960, 0);
                int var154 = var153 + 25;
                arg0.method6987(field913, field904 + 180, var154, 16776960, 0);
                int var79 = field904 + 180;
                short var80 = 311;
                Statics.field898.method8853(var79 - 73, var80 - 20);
                arg0.method6987(class364.field4175, var79, var80 + 5, 16777215, 0);
            } else if (field937 == 10) {
                int var81 = field904 + 180;
                short var82 = 209;
                arg0.method6987(class364.field3954, field904 + 180, var82, 16776960, 0);
                int var155 = var82 + 20;
                Statics.field899.method8853(var81 - 109, var155);
                if (field918.isEmpty()) {
                    Statics.field48.method8853(var81 - 48, var155 + 18);
                } else {
                    Statics.field48.method8853(var81 - 48, var155 + 5);
                    arg0.method6987(field918, var81, var155 + 68 - 15, 16776960, 0);
                }
            } else if (field937 == 12) {
                int var83 = Statics.field1737;
                short var84 = 216;
                arg2.method6987(class364.field4215, var83, var84, 16777215, 0);
                int var156 = var84 + 17;
                arg2.method6987(class364.field4165, var83, var156, 16777215, 0);
                int var157 = var156 + 17;
                arg2.method6987(class364.field4217, var83, var157, 16777215, 0);
                int var158 = var157 + 17;
                arg2.method6987(class364.field4218, var83, var158, 16777215, 0);
                int var85 = Statics.field1737 - 80;
                short var86 = 311;
                Statics.field898.method8853(var85 - 73, var86 - 20);
                arg0.method6987(class364.field3987, var85, var86 + 5, 16777215, 0);
                int var87 = Statics.field1737 + 80;
                Statics.field898.method8853(var87 - 73, var86 - 20);
                arg0.method6987(class364.field4222, var87, var86 + 5, 16777215, 0);
            } else if (field937 == 13) {
                short var88 = 231;
                arg2.method6987(class364.field4219, field904 + 180, var88, 16777215, 0);
                int var159 = var88 + 20;
                arg2.method6987(class364.field3990, field904 + 180, var159, 16777215, 0);
                int var89 = field904 + 180;
                short var90 = 311;
                Statics.field898.method8853(var89 - 73, var90 - 20);
                arg0.method6987(class364.field4180, var89, var90 + 5, 16777215, 0);
            } else if (field937 == 14) {
                short var91 = 201;
                String var92 = "";
                String var93 = "";
                String var94 = "";
                switch(field895) {
                    case 0:
                        var92 = class364.field3981;
                        var93 = class364.field4144;
                        var94 = class364.field3983;
                        break;
                    case 1:
                        var92 = class364.field4020;
                        var93 = class364.field3996;
                        var94 = class364.field4022;
                        break;
                    case 2:
                        var92 = class364.field4056;
                        var93 = class364.field4057;
                        var94 = class364.field4058;
                        break;
                    default:
                        method841(false);
                }
                arg0.method6987(var92, field904 + 180, var91, 16776960, 0);
                int var160 = var91 + 20;
                arg0.method6987(var93, field904 + 180, var160, 16776960, 0);
                int var161 = var160 + 20;
                arg0.method6987(var94, field904 + 180, var161, 16776960, 0);
                int var95 = field904 + 180;
                short var96 = 276;
                Statics.field898.method8853(var95 - 73, var96 - 20);
                if (field895 == 1) {
                    arg0.method6987(class364.field4013, var95, var96 + 5, 16777215, 0);
                } else {
                    arg0.method6987(class364.field4133, var95, var96 + 5, 16777215, 0);
                }
                int var97 = field904 + 180;
                short var98 = 326;
                Statics.field898.method8853(var97 - 73, var98 - 20);
                arg0.method6987(class364.field4180, var97, var98 + 5, 16777215, 0);
            } else if (field937 == 24) {
                short var99 = 221;
                arg0.method6987(field911, field904 + 180, var99, 16777215, 0);
                int var162 = var99 + 15;
                arg0.method6987(field912, field904 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method6987(field913, field904 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                int var100 = field904 + 180;
                short var101 = 301;
                Statics.field898.method8853(var100 - 73, var101 - 20);
                arg0.method6987(class364.field4145, var100, var101 + 5, 16777215, 0);
            } else if (field937 == 32) {
                short var102 = 216;
                arg0.method6987(class364.field4208, field904 + 180, var102, 16776960, 0);
                int var165 = var102 + 15;
                arg2.method6987(class364.field4209, field904 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                arg2.method6987(class364.field4213, field904 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                int var103 = field904 + 180 - 80;
                short var104 = 321;
                Statics.field898.method8853(var103 - 73, var104 - 20);
                arg0.method6987(class364.field4211, var103, var104 + 5, 16777215, 0);
                int var105 = field904 + 180 + 80;
                Statics.field898.method8853(var105 - 73, var104 - 20);
                arg0.method6987(class364.field4180, var105, var104 + 5, 16777215, 0);
            } else if (field937 == 33) {
                short var106 = 201;
                arg0.method6987(field911, field904 + 180, var106, 16776960, 0);
                int var168 = var106 + 20;
                arg1.method6987(field912, field904 + 180, var168, 16776960, 0);
                int var169 = var168 + 20;
                arg1.method6987(field913, field904 + 180, var169, 16776960, 0);
                int var170 = var169 + 15;
                int var107 = field904 + 180;
                short var108 = 276;
                Statics.field898.method8853(var107 - 73, var108 - 20);
                arg2.method6987(class364.field4234, var107, var108 + 5, 16777215, 0);
                int var109 = field904 + 180;
                short var110 = 326;
                Statics.field898.method8853(var109 - 73, var110 - 20);
                arg2.method6987(class364.field4180, var109, var110 + 5, 16777215, 0);
            }
        }
        if (client.field525 >= 10) {
            int[] var111 = new int[4];
            class537.method8757(var111);
            class537.method8755(field924, 0, field924 + 765, Statics.field321);
            Statics.field1894.method2377(field924 - 22, client.field500);
            Statics.field1894.method2377(field924 + 765 + 22 - 128, client.field500);
            class537.method8775(var111);
        }
        Statics.field897[Statics.field2450.method2503() ? 1 : 0].method8853(field924 + 765 - 40, 463);
        if (client.field525 <= 5 || Statics.field1043 != class386.field4406) {
            return;
        }
        if (Statics.field4548 == null) {
            Statics.field4548 = class542.method5344(Statics.field482, "sl_button", "");
            return;
        }
        int var112 = field924 + 5;
        short var113 = 463;
        byte var114 = 100;
        byte var115 = 35;
        Statics.field4548.method8853(var112, var113);
        arg0.method6987(class364.field4105 + " " + client.field591, var114 / 2 + var112, var115 / 2 + var113 - 2, 16777215, 0);
        if (Statics.field5254 == null) {
            arg1.method6987(class364.field4233, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
        } else {
            arg1.method6987(class364.field4232, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("fo.am(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3022(String arg0, String arg1, String arg2) {
        field911 = arg0;
        field912 = arg1;
        field913 = arg2;
    }

    @ObfuscatedName("hr.aq(Lpf;Lpf;B)V")
    public static void method3515(class406 arg0, class406 arg1) {
        if (Statics.field1388 == null) {
            Statics.field1388 = class542.method2631(Statics.field482, "sl_back", "");
        }
        if (Statics.field1523 == null) {
            Statics.field1523 = class542.method6197(Statics.field482, "sl_flags", "");
        }
        if (Statics.field1663 == null) {
            Statics.field1663 = class542.method6197(Statics.field482, "sl_arrows", "");
        }
        if (Statics.field2412 == null) {
            Statics.field2412 = class542.method6197(Statics.field482, "sl_stars", "");
        }
        if (Statics.field3558 == null) {
            Statics.field3558 = class542.method5344(Statics.field482, "leftarrow", "");
        }
        if (Statics.field1349 == null) {
            Statics.field1349 = class542.method5344(Statics.field482, "rightarrow", "");
        }
        class537.method8837(field924, 23, 765, 480, 0);
        class537.method8764(field924, 0, 125, 23, 12425273, 9135624);
        class537.method8764(field924 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6987(class364.field4223, field924 + 62, 15, 0, -1);
        if (Statics.field2412 != null) {
            Statics.field2412[1].method8853(field924 + 140, 1);
            arg1.method6981(class364.field4077, field924 + 152, 10, 16777215, -1);
            Statics.field2412[0].method8853(field924 + 140, 12);
            arg1.method6981(class364.field4060, field924 + 152, 21, 16777215, -1);
        }
        if (Statics.field1663 != null) {
            int var2 = field924 + 280;
            if (class68.field801[0] == 0 && class68.field800[0] == 0) {
                Statics.field1663[2].method8853(var2, 4);
            } else {
                Statics.field1663[0].method8853(var2, 4);
            }
            if (class68.field801[0] == 0 && class68.field800[0] == 1) {
                Statics.field1663[3].method8853(var2 + 15, 4);
            } else {
                Statics.field1663[1].method8853(var2 + 15, 4);
            }
            arg0.method6981(class364.field4226, var2 + 32, 17, 16777215, -1);
            int var3 = field924 + 390;
            if (class68.field801[0] == 1 && class68.field800[0] == 0) {
                Statics.field1663[2].method8853(var3, 4);
            } else {
                Statics.field1663[0].method8853(var3, 4);
            }
            if (class68.field801[0] == 1 && class68.field800[0] == 1) {
                Statics.field1663[3].method8853(var3 + 15, 4);
            } else {
                Statics.field1663[1].method8853(var3 + 15, 4);
            }
            arg0.method6981(class364.field4227, var3 + 32, 17, 16777215, -1);
            int var4 = field924 + 500;
            if (class68.field801[0] == 2 && class68.field800[0] == 0) {
                Statics.field1663[2].method8853(var4, 4);
            } else {
                Statics.field1663[0].method8853(var4, 4);
            }
            if (class68.field801[0] == 2 && class68.field800[0] == 1) {
                Statics.field1663[3].method8853(var4 + 15, 4);
            } else {
                Statics.field1663[1].method8853(var4 + 15, 4);
            }
            arg0.method6981(class364.field4138, var4 + 32, 17, 16777215, -1);
            int var5 = field924 + 610;
            if (class68.field801[0] == 3 && class68.field800[0] == 0) {
                Statics.field1663[2].method8853(var5, 4);
            } else {
                Statics.field1663[0].method8853(var5, 4);
            }
            if (class68.field801[0] == 3 && class68.field800[0] == 1) {
                Statics.field1663[3].method8853(var5 + 15, 4);
            } else {
                Statics.field1663[1].method8853(var5 + 15, 4);
            }
            arg0.method6981(class364.field4178, var5 + 32, 17, 16777215, -1);
        }
        class537.method8837(field924 + 708, 4, 50, 16, 0);
        arg1.method6987(class364.field4181, field924 + 708 + 25, 16, 16777215, -1);
        field930 = -1;
        if (Statics.field1388 == null) {
            return;
        }
        byte var6 = 88;
        byte var7 = 19;
        int var8 = 765 / (var6 + 1) - 1;
        int var9 = 480 / (var7 + 1);
        int var10;
        int var11;
        do {
            var10 = var9;
            var11 = var8;
            if ((var8 - 1) * var9 >= class68.field798) {
                var8--;
            }
            if ((var9 - 1) * var8 >= class68.field798) {
                var9--;
            }
            if ((var9 - 1) * var8 >= class68.field798) {
                var9--;
            }
        } while (var9 != var10 || var8 != var11);
        int var12 = (765 - var6 * var8) / (var8 + 1);
        if (var12 > 5) {
            var12 = 5;
        }
        int var13 = (480 - var7 * var9) / (var9 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
        int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
        int var16 = (class68.field798 + var9 - 1) / var9;
        field928 = var16 - var8;
        if (Statics.field3558 != null && field927 > 0) {
            Statics.field3558.method8853(8, Statics.field321 / 2 - Statics.field3558.field5230 / 2);
        }
        if (Statics.field1349 != null && field927 < field928) {
            Statics.field1349.method8853(Statics.field4410 - Statics.field1349.field5229 - 8, Statics.field321 / 2 - Statics.field1349.field5230 / 2);
        }
        int var17 = var15 + 23;
        int var18 = field924 + var14;
        int var19 = 0;
        boolean var20 = false;
        int var21 = field927;
        for (int var22 = var9 * var21; var22 < class68.field798 && var21 - field927 < var8; var22++) {
            class68 var23 = Statics.field3921[var22];
            boolean var24 = true;
            String var25 = Integer.toString(var23.field807);
            if (var23.field807 == -1) {
                var25 = class364.field4230;
                var24 = false;
            } else if (var23.field807 > 1980) {
                var25 = class364.field4231;
                var24 = false;
            }
            class109 var26 = null;
            int var27 = 0;
            if (var23.method1785()) {
                var26 = var23.method1745() ? class109.field1375 : class109.field1377;
            } else if (var23.method1746()) {
                var26 = var23.method1745() ? class109.field1386 : class109.field1385;
            } else if (var23.method1750()) {
                var27 = 16711680;
                var26 = var23.method1745() ? class109.field1378 : class109.field1383;
            } else if (var23.method1752()) {
                var26 = var23.method1745() ? class109.field1373 : class109.field1379;
            } else if (var23.method1748()) {
                var26 = var23.method1745() ? class109.field1374 : class109.field1371;
            } else if (var23.method1753()) {
                var26 = var23.method1745() ? class109.field1382 : class109.field1381;
            } else if (var23.method1763()) {
                var26 = var23.method1745() ? class109.field1384 : class109.field1376;
            }
            if (var26 == null || var26.field1387 >= Statics.field1388.length) {
                var26 = var23.method1745() ? class109.field1372 : class109.field1380;
            }
            if (class36.field217 >= var18 && class36.field218 >= var17 && class36.field217 < var6 + var18 && class36.field218 < var7 + var17 && var24) {
                field930 = var22;
                Statics.field1388[var26.field1387].method8889(var18, var17, 128, 16777215);
                var20 = true;
            } else {
                Statics.field1388[var26.field1387].method8883(var18, var17);
            }
            if (Statics.field1523 != null) {
                Statics.field1523[(var23.method1745() ? 8 : 0) + var23.field803].method8853(var18 + 29, var17);
            }
            arg0.method6987(Integer.toString(var23.field802), var18 + 15, var7 / 2 + var17 + 5, var27, -1);
            arg1.method6987(var25, var18 + 60, var7 / 2 + var17 + 5, 268435455, -1);
            var17 += var7 + var13;
            var19++;
            if (var19 >= var9) {
                var17 = var15 + 23;
                var18 += var6 + var12;
                var19 = 0;
                var21++;
            }
        }
        if (!var20) {
            return;
        }
        int var28 = arg1.method7018(Statics.field3921[field930].field806) + 6;
        int var29 = arg1.field4520 + 8;
        int var30 = class36.field218 + 25;
        if (var29 + var30 > 480) {
            var30 = class36.field218 - 25 - var29;
        }
        class537.method8837(class36.field217 - var28 / 2, var30, var28, var29, 16777120);
        class537.method8767(class36.field217 - var28 / 2, var30, var28, var29, 0);
        arg1.method6987(Statics.field3921[field930].field806, class36.field217, arg1.field4520 + var30 + 4, 0, -1);
    }

    @ObfuscatedName("bl.ai(Lcr;I)V")
    public static void method443(class68 arg0) {
        if (arg0.method1745() != client.field487) {
            client.field487 = arg0.method1745();
            boolean var1 = arg0.method1745();
            if (Statics.field1518 != var1) {
                class203.field2169.method5292();
                class203.field2161.method5292();
                class203.field2136.method5292();
                Statics.field1518 = var1;
            }
        }
        if (client.field485 != arg0.field810) {
            class369 var2 = Statics.field482;
            int var3 = arg0.field810;
            if ((var3 & class523.field5123.method41()) != 0) {
                Statics.field901 = class542.method5344(var2, "logo_deadman_mode", "");
            } else if ((var3 & class523.field5124.method41()) != 0) {
                Statics.field901 = class542.method5344(var2, "logo_seasonal_mode", "");
            } else if ((var3 & class523.field5095.method41()) == 0) {
                Statics.field901 = class542.method5344(var2, "logo", "");
            } else {
                Statics.field901 = class542.method5344(var2, "logo_speedrunning", "");
            }
        }
        Statics.field4681 = arg0.field805;
        client.field591 = arg0.field802;
        client.field485 = arg0.field810;
        Statics.field2656 = arg0.field809;
        Statics.field2633 = client.field652 == 0 ? 43594 : arg0.field802 + 40000;
        Statics.field4708 = client.field652 == 0 ? 443 : arg0.field802 + 50000;
        Statics.field2613 = Statics.field2633;
    }

    @ObfuscatedName("ep.aw(II)V")
    public static void method2932(int arg0) {
        method2815(14);
        field895 = arg0;
    }

    @ObfuscatedName("iw.ae(I)V")
    public static void method3982() {
        method2815(24);
        method3022(class364.field4079, class364.field4111, class364.field4158);
    }

    @ObfuscatedName("ei.an(IB)V")
    public static void method2815(int arg0) {
        if (field937 != arg0) {
            field937 = arg0;
        }
    }
}
