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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cy")
public class class76 {

    @ObfuscatedName("cy.ao")
    public static int field931 = 0;

    @ObfuscatedName("cy.ay")
    public static int field937 = field931 + 202;

    @ObfuscatedName("cy.av")
    public static int field938 = 10;

    @ObfuscatedName("cy.aw")
    public static String field939 = "";

    @ObfuscatedName("cy.bi")
    public static int field943 = -1;

    @ObfuscatedName("cy.bn")
    public static int field944 = 1;

    @ObfuscatedName("cy.cw")
    public static int field945 = 0;

    @ObfuscatedName("cy.cf")
    public static String field971 = "";

    @ObfuscatedName("cy.cm")
    public static String field951 = "";

    @ObfuscatedName("cy.cn")
    public static String field948 = "";

    @ObfuscatedName("cy.cs")
    public static String field949 = "";

    @ObfuscatedName("cy.cx")
    public static String field960 = "";

    @ObfuscatedName("cy.cr")
    public static String field953 = "";

    @ObfuscatedName("cy.ce")
    public static int field952 = 0;

    @ObfuscatedName("cy.cq")
    public static String[] field955 = new String[8];

    @ObfuscatedName("cy.cu")
    public static String field954 = "";

    @ObfuscatedName("cy.cz")
    public static boolean field936 = false;

    @ObfuscatedName("cy.ct")
    public static boolean field964 = false;

    @ObfuscatedName("cy.cc")
    public static boolean field957 = true;

    @ObfuscatedName("cy.dh")
    public static int field958 = 0;

    @ObfuscatedName("cy.dj")
    public static String field959 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cy.di")
    public static String field966 = "1234567890";

    @ObfuscatedName("cy.dn")
    public static boolean field961 = false;

    @ObfuscatedName("cy.dk")
    public static int field962 = -1;

    @ObfuscatedName("cy.df")
    public static int field963 = 0;

    @ObfuscatedName("cy.dz")
    public static int field969 = 0;

    @ObfuscatedName("cy.dv")
    public static long field956;

    @ObfuscatedName("cy.dr")
    public static long field967;

    @ObfuscatedName("cy.do")
    public static String[] field947;

    @ObfuscatedName("cy.db")
    public static String[] field968;

    @ObfuscatedName("cy.dp")
    public static String[] field972;

    static {
        new DecimalFormat("##0.00");
        new class134();
        field956 = -1L;
        field967 = -1L;
        field947 = new String[] { "title.jpg" };
        field968 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field972 = new String[] { "logo_speedrunning" };
    }

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("py.au(Lnu;Lnu;ZII)V")
    public static void method7067(class359 arg0, class359 arg1, boolean arg2, int arg3) {
        if (!Statics.field4516) {
            if (arg3 == 0) {
                method5094(arg2);
            } else {
                method816(arg3);
            }
            class525.method8608();
            byte[] var4 = arg0.method6146("title.jpg", "");
            Statics.field935 = class31.method4968(var4);
            Statics.field4721 = Statics.field935.method8712();
            int var5 = client.field528;
            if ((var5 & class511.field5091.method30()) != 0) {
                Statics.field330 = class530.method3216(arg1, "logo_deadman_mode", "");
            } else if ((var5 & class511.field5092.method30()) != 0) {
                Statics.field330 = class530.method3216(arg1, "logo_seasonal_mode", "");
            } else if ((var5 & class511.field5070.method30()) == 0) {
                Statics.field330 = class530.method3216(arg1, "logo", "");
            } else {
                Statics.field330 = class530.method3216(arg1, "logo_speedrunning", "");
            }
            Statics.field933 = class530.method3216(arg1, "titlebox", "");
            Statics.field2418 = class530.method3216(arg1, "titlebutton", "");
            Statics.field934 = class530.method3216(arg1, "titlebutton_large", "");
            Statics.field1069 = class530.method3216(arg1, "play_now_text", "");
            class530.method3216(arg1, "titlebutton_wide42,1", "");
            Statics.field932 = class530.method3937(arg1, "runes", "");
            Statics.field68 = class530.method3937(arg1, "title_mute", "");
            Statics.field930 = class530.method3216(arg1, "options_radio_buttons,0", "");
            Statics.field3851 = class530.method3216(arg1, "options_radio_buttons,4", "");
            Statics.field1492 = class530.method3216(arg1, "options_radio_buttons,2", "");
            Statics.field2084 = class530.method3216(arg1, "options_radio_buttons,6", "");
            Statics.field1616 = Statics.field930.field5201;
            Statics.field4658 = Statics.field930.field5202;
            Statics.field1650 = new class98(Statics.field932);
            if (arg2) {
                field960 = "";
                field953 = "";
                field955 = new String[8];
                field952 = 0;
            }
            Statics.field5040 = 0;
            Statics.field4369 = "";
            field957 = true;
            field961 = false;
            if (Statics.field4737.method2379()) {
                class306.method2092(0, 0);
            } else {
                ArrayList var6 = new ArrayList();
                var6.add(new class318(Statics.field4431, "scape main", "", 255, false));
                class306.method1037(var6, 0, 0, 0, 100, false);
            }
            Statics.method2707();
            Statics.method3862().method6216(false);
            Statics.field4516 = true;
            field931 = (Statics.field1450 - 765) / 2;
            field937 = field931 + 202;
            Statics.field4761 = field937 + 180;
            Statics.field935.method8722(field931, 0);
            Statics.field4721.method8722(field931 + 382, 0);
            Statics.field330.method8705(field931 + 382 - Statics.field330.field5201 / 2, 18);
        } else if (arg3 == 4) {
            method816(4);
        }
    }

    @ObfuscatedName("je.ae(B)Ljava/lang/String;")
    public static String method4440() {
        String var2;
        if (Statics.field4737.method2349()) {
            String var0 = field960;
            String var1 = class387.method5054('*', var0.length());
            var2 = var1;
        } else {
            var2 = field960;
        }
        return var2;
    }

    @ObfuscatedName("hv.ao(I)V")
    public static void method3649() {
        if (client.field581 && field960 != null && field960.length() > 0) {
            field958 = 1;
        } else {
            field958 = 0;
        }
    }

    @ObfuscatedName("om.at(Lbm;Lpi;Lpi;I)V")
    public static void method6283(class35 arg0, class394 arg1, class394 arg2) {
        if (field961) {
            class213 var3 = client.method5038();
            while (true) {
                if (!var3.method3812()) {
                    if (class36.field249 != 1 && (Statics.field1924 || class36.field249 != 4)) {
                        break;
                    }
                    int var4 = field931 + 280;
                    if (class36.field250 >= var4 && class36.field250 <= var4 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(0, 0);
                        break;
                    }
                    if (class36.field250 >= var4 + 15 && class36.field250 <= var4 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(0, 1);
                        break;
                    }
                    int var5 = field931 + 390;
                    if (class36.field250 >= var5 && class36.field250 <= var5 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(1, 0);
                        break;
                    }
                    if (class36.field250 >= var5 + 15 && class36.field250 <= var5 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(1, 1);
                        break;
                    }
                    int var6 = field931 + 500;
                    if (class36.field250 >= var6 && class36.field250 <= var6 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(2, 0);
                        break;
                    }
                    if (class36.field250 >= var6 + 15 && class36.field250 <= var6 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(2, 1);
                        break;
                    }
                    int var7 = field931 + 610;
                    if (class36.field250 >= var7 && class36.field250 <= var7 + 14 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(3, 0);
                        break;
                    }
                    if (class36.field250 >= var7 + 15 && class36.field250 <= var7 + 80 && class36.field251 >= 4 && class36.field251 <= 18) {
                        class68.method2984(3, 1);
                        break;
                    }
                    if (class36.field250 >= field931 + 708 && class36.field251 >= 4 && class36.field250 <= field931 + 708 + 50 && class36.field251 <= 20) {
                        method4991();
                        break;
                    }
                    if (field962 == -1) {
                        if (field963 > 0 && Statics.field1078 != null && class36.field250 >= 0 && class36.field250 <= Statics.field1078.field5201 && class36.field251 >= Statics.field1890 / 2 - 50 && class36.field251 <= Statics.field1890 / 2 + 50) {
                            field963--;
                        }
                        if (field963 < field969 && Statics.field2562 != null && class36.field250 >= Statics.field1450 - Statics.field2562.field5201 - 5 && class36.field250 <= Statics.field1450 && class36.field251 >= Statics.field1890 / 2 - 50 && class36.field251 <= Statics.field1890 / 2 + 50) {
                            field963++;
                        }
                    } else {
                        class68 var8 = Statics.field1879[field962];
                        if (var8.method1719()) {
                            var8.field848 = "beta";
                        }
                        boolean var9 = false;
                        if (client.field528 != var8.field837) {
                            boolean var10 = (client.field528 & class511.field5078.method30()) != 0;
                            boolean var11 = var8.method1719();
                            if (var10 && !var11 || !var10 && var11) {
                                var9 = true;
                            }
                        }
                        method6375(var8);
                        method4991();
                        if (var9) {
                            client.method7087();
                        }
                    }
                    break;
                }
                if (var3.field2370 == 13) {
                    method4991();
                    break;
                }
                if (var3.field2370 == 96) {
                    if (field963 > 0 && Statics.field1078 != null) {
                        field963--;
                    }
                } else if (var3.field2370 == 97 && field963 < field969 && Statics.field2562 != null) {
                    field963++;
                }
            }
            return;
        }
        if ((class36.field249 == 1 || !Statics.field1924 && class36.field249 == 4) && class36.field250 >= field931 + 765 - 50 && class36.field251 >= 453) {
            Statics.field4737.method2369(!Statics.field4737.method2379());
            if (Statics.field4737.method2379()) {
                class306.method2092(0, 0);
            } else {
                ArrayList var12 = new ArrayList();
                var12.add(new class318(Statics.field4431, "scape main", "", 255, false));
                class306.method1037(var12, 0, 0, 0, 100, false);
            }
            Statics.method2707();
        }
        if (client.field611 == 5) {
            return;
        }
        if (field956 == -1L) {
            field956 = class302.method655() + 1000L;
        }
        long var13 = class302.method655();
        if (client.method2099() && field967 == -1L) {
            field967 = var13;
            if (field967 > field956) {
                field956 = field967;
            }
        }
        if (client.field611 != 10 && client.field611 != 11) {
            return;
        }
        if (Statics.field1676 == class374.field4384) {
            if (class36.field249 == 1 || !Statics.field1924 && class36.field249 == 4) {
                int var15 = field931 + 5;
                short var16 = 463;
                byte var17 = 100;
                byte var18 = 35;
                if (class36.field250 >= var15 && class36.field250 <= var15 + var17 && class36.field251 >= var16 && class36.field251 <= var16 + var18) {
                    if (class68.method2802()) {
                        field961 = true;
                        field963 = 0;
                        field969 = 0;
                    }
                    return;
                }
            }
            if (Statics.field2886 != null) {
                method1035();
            }
        }
        int var19 = class36.field249;
        int var20 = class36.field250;
        int var21 = class36.field251;
        if (var19 == 0) {
            var20 = class36.field255;
            var21 = class36.field233;
        }
        if (!Statics.field1924 && var19 == 4) {
            var19 = 1;
        }
        class213 var22 = client.method5038();
        if (field945 == 0) {
            boolean var23 = false;
            while (var22.method3812()) {
                if (var22.field2370 == 84) {
                    var23 = true;
                }
            }
            int var24 = Statics.field4761 - 80;
            short var25 = 291;
            if (var19 == 1 && var20 >= var24 - 75 && var20 <= var24 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20) {
                class32.method446(client.method3400("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var26 = Statics.field4761 + 80;
            if (var19 == 1 && var20 >= var26 - 75 && var20 <= var26 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20 || var23) {
                if ((client.field528 & class511.field5087.method30()) != 0) {
                    field971 = "";
                    field951 = class352.field4146;
                    field948 = class352.field4137;
                    field949 = class352.field4138;
                    method816(1);
                    method3649();
                } else if ((client.field528 & class511.field5072.method30()) != 0) {
                    if ((client.field528 & class511.field5093.method30()) == 0) {
                        field951 = class352.field4127;
                        field948 = class352.field4128;
                        field949 = class352.field3929;
                    } else {
                        field951 = class352.field4133;
                        field948 = class352.field4134;
                        field949 = class352.field4135;
                    }
                    field971 = class352.field3942;
                    method816(1);
                    method3649();
                } else if ((client.field528 & class511.field5093.method30()) == 0) {
                    method5095(false);
                } else {
                    field951 = class352.field4218;
                    field948 = class352.field4152;
                    field949 = class352.field4212;
                    field971 = class352.field3942;
                    method816(1);
                    method3649();
                }
            }
        } else if (field945 == 1) {
            while (true) {
                if (!var22.method3812()) {
                    int var27 = Statics.field4761 - 80;
                    short var28 = 321;
                    if (var19 == 1 && var20 >= var27 - 75 && var20 <= var27 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method5095(false);
                    }
                    int var29 = Statics.field4761 + 80;
                    if (var19 == 1 && var20 >= var29 - 75 && var20 <= var29 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method816(0);
                    }
                    break;
                }
                if (var22.field2370 == 84) {
                    method5095(false);
                } else if (var22.field2370 == 13) {
                    method816(0);
                }
            }
        } else if (field945 == 2) {
            short var30 = 201;
            int var127 = var30 + 52;
            if (var19 == 1 && var21 >= var127 - 12 && var21 < var127 + 2) {
                field958 = 0;
            }
            var127 += 15;
            if (var19 == 1 && var21 >= var127 - 12 && var21 < var127 + 2) {
                field958 = 1;
            }
            var127 += 15;
            short var31 = 361;
            if (Statics.field1344 != null) {
                int var32 = Statics.field1344.field4719 / 2;
                if (var19 == 1 && var20 >= Statics.field1344.field4720 - var32 && var20 <= Statics.field1344.field4720 + var32 && var21 >= var31 - 15 && var21 < var31) {
                    switch(field944) {
                        case 1:
                            class32.method446(class352.field4107, true, false);
                            return;
                        case 2:
                            class32.method446("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var33 = Statics.field4761 - 80;
            short var34 = 321;
            if (var19 == 1 && var20 >= var33 - 75 && var20 <= var33 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                field960 = field960.trim();
                if (field960.length() == 0) {
                    method5478(class352.field4034, class352.field3949, class352.field4036);
                    return;
                }
                if (field953.length() == 0) {
                    method5478(class352.field4037, class352.field4038, class352.field3962);
                    return;
                }
                method5478(class352.field4140, class352.field4141, class352.field4126);
                client.method2268(false);
                client.method5473(20);
                return;
            }
            int var35 = field937 + 180 + 80;
            if (var19 == 1 && var20 >= var35 - 75 && var20 <= var35 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                method816(0);
                field960 = "";
                field953 = "";
                Statics.field5040 = 0;
                Statics.field4369 = "";
                field957 = true;
            }
            int var36 = Statics.field4761 + -117;
            short var37 = 277;
            field936 = var20 >= var36 && var20 < Statics.field1616 + var36 && var21 >= var37 && var21 < Statics.field4658 + var37;
            if (var19 == 1 && field936) {
                client.field581 = !client.field581;
                if (!client.field581 && Statics.field4737.method2361() != null) {
                    Statics.field4737.method2360((String) null);
                }
            }
            int var38 = Statics.field4761 + 24;
            short var39 = 277;
            field964 = var20 >= var38 && var20 < Statics.field1616 + var38 && var21 >= var39 && var21 < Statics.field4658 + var39;
            if (var19 == 1 && field964) {
                Statics.field4737.method2389(!Statics.field4737.method2349());
                if (!Statics.field4737.method2349()) {
                    field960 = "";
                    Statics.field4737.method2360((String) null);
                    method3649();
                }
            }
            while (true) {
                Transferable var41;
                int var42;
                do {
                    while (true) {
                        label1169: do {
                            while (true) {
                                while (var22.method3812()) {
                                    if (var22.field2370 == 13) {
                                        method816(0);
                                        field960 = "";
                                        field953 = "";
                                        Statics.field5040 = 0;
                                        Statics.field4369 = "";
                                        field957 = true;
                                    } else {
                                        if (field958 != 0) {
                                            continue label1169;
                                        }
                                        method2974(var22.field2357);
                                        if (var22.field2370 == 85 && field960.length() > 0) {
                                            field960 = field960.substring(0, field960.length() - 1);
                                        }
                                        if (var22.field2370 == 84 || var22.field2370 == 80) {
                                            field958 = 1;
                                        }
                                        if (method3054(var22.field2357) && field960.length() < 320) {
                                            field960 = field960 + var22.field2357;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field958 != 1);
                        if (var22.field2370 == 85 && field953.length() > 0) {
                            field953 = field953.substring(0, field953.length() - 1);
                        } else if (var22.field2370 == 84 || var22.field2370 == 80) {
                            field958 = 0;
                            if (var22.field2370 == 84) {
                                field960 = field960.trim();
                                if (field960.length() == 0) {
                                    method5478(class352.field4034, class352.field3949, class352.field4036);
                                    return;
                                }
                                if (field953.length() == 0) {
                                    method5478(class352.field4037, class352.field4038, class352.field3962);
                                    return;
                                }
                                method5478(class352.field4140, class352.field4141, class352.field4126);
                                client.method2268(false);
                                client.method5473(20);
                                return;
                            }
                        }
                        if ((var22.method3811(82) || var22.method3811(87)) && var22.field2370 == 67) {
                            Clipboard var40 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var41 = var40.getContents(Statics.field2415);
                            var42 = 20 - field953.length();
                            break;
                        }
                        char var53 = var22.field2357;
                        boolean var54;
                        if (var53 >= ' ' && var53 < 127 || var53 > 127 && var53 < 160 || var53 > 160 && var53 <= 255) {
                            var54 = true;
                        } else {
                            label1408: {
                                if (var53 != 0) {
                                    char[] var55 = class385.field4425;
                                    for (int var56 = 0; var56 < var55.length; var56++) {
                                        char var57 = var55[var56];
                                        if (var53 == var57) {
                                            var54 = true;
                                            break label1408;
                                        }
                                    }
                                }
                                var54 = false;
                            }
                        }
                        if (var54 && method3054(var22.field2357) && field953.length() < 20) {
                            field953 = field953 + var22.field2357;
                        }
                    }
                } while (var42 <= 0);
                try {
                    String var43 = (String) var41.getTransferData(DataFlavor.stringFlavor);
                    int var44 = Math.min(var42, var43.length());
                    for (int var45 = 0; var45 < var44; var45++) {
                        char var46 = var43.charAt(var45);
                        boolean var47;
                        if ((var46 < ' ' || var46 >= 127) && (var46 <= 127 || var46 >= 160) && (var46 <= 160 || var46 > 255)) {
                            label1388: {
                                if (var46 != 0) {
                                    char[] var48 = class385.field4425;
                                    for (int var49 = 0; var49 < var48.length; var49++) {
                                        char var50 = var48[var49];
                                        if (var46 == var50) {
                                            var47 = true;
                                            break label1388;
                                        }
                                    }
                                }
                                var47 = false;
                            }
                        } else {
                            var47 = true;
                        }
                        if (!var47 || !method3054(var43.charAt(var45))) {
                            method816(3);
                            return;
                        }
                    }
                    field953 = field953 + var43.substring(0, var44);
                } catch (UnsupportedFlavorException var125) {
                } catch (IOException var126) {
                }
            }
        } else if (field945 == 3) {
            int var58 = field937 + 180;
            short var59 = 241;
            class446 var60 = arg1.method6843(25, class352.field4161.length() - 34, class352.field4161, var58, var59);
            if (var19 == 1 && var60.method7448(var20, var21)) {
                class32.method446(class352.field4222, true, false);
            }
            int var61 = field937 + 180;
            short var62 = 276;
            if (var19 == 1 && var20 >= var61 - 75 && var20 <= var61 + 75 && var21 >= var62 - 20 && var21 <= var62 + 20) {
                method5094(false);
            }
            int var63 = field937 + 180;
            short var64 = 326;
            if (var19 == 1 && var20 >= var63 - 75 && var20 <= var63 + 75 && var21 >= var64 - 20 && var21 <= var64 + 20) {
                class32.method446(class352.field4107, true, false);
                return;
            }
        } else if (field945 == 4) {
            int var65 = field937 + 180 - 80;
            short var66 = 321;
            if (var19 == 1 && var20 >= var65 - 75 && var20 <= var65 + 75 && var21 >= var66 - 20 && var21 <= var66 + 20) {
                Statics.field4369.trim();
                if (Statics.field4369.length() != 6) {
                    method5478(class352.field4070, class352.field3954, class352.field4033);
                    return;
                }
                Statics.field5040 = Integer.parseInt(Statics.field4369);
                Statics.field4369 = "";
                client.method2268(true);
                method5478(class352.field4140, class352.field4141, class352.field4126);
                client.method5473(20);
                return;
            }
            if (var19 == 1 && var20 >= field937 + 180 - 9 && var20 <= field937 + 180 + 130 && var21 >= 263 && var21 <= 296) {
                field957 = !field957;
            }
            if (var19 == 1 && var20 >= field937 + 180 - 34 && var20 <= field937 + 180 + 34 && var21 >= 351 && var21 <= 363) {
                class32.method446(class352.field4107, true, false);
            }
            int var67 = field937 + 180 + 80;
            if (var19 == 1 && var20 >= var67 - 75 && var20 <= var67 + 75 && var21 >= var66 - 20 && var21 <= var66 + 20) {
                method816(0);
                field960 = "";
                field953 = "";
                Statics.field5040 = 0;
                Statics.field4369 = "";
            }
            while (var22.method3812()) {
                boolean var68 = false;
                for (int var69 = 0; var69 < field966.length(); var69++) {
                    if (var22.field2357 == field966.charAt(var69)) {
                        var68 = true;
                        break;
                    }
                }
                if (var22.field2370 == 13) {
                    method816(0);
                    field960 = "";
                    field953 = "";
                    Statics.field5040 = 0;
                    Statics.field4369 = "";
                } else {
                    if (var22.field2370 == 85 && Statics.field4369.length() > 0) {
                        Statics.field4369 = Statics.field4369.substring(0, Statics.field4369.length() - 1);
                    }
                    if (var22.field2370 == 84) {
                        Statics.field4369.trim();
                        if (Statics.field4369.length() != 6) {
                            method5478(class352.field4070, class352.field3954, class352.field4033);
                            return;
                        }
                        Statics.field5040 = Integer.parseInt(Statics.field4369);
                        Statics.field4369 = "";
                        client.method2268(true);
                        method5478(class352.field4140, class352.field4141, class352.field4126);
                        client.method5473(20);
                        return;
                    }
                    if (var68 && Statics.field4369.length() < 6) {
                        Statics.field4369 = Statics.field4369 + var22.field2357;
                    }
                }
            }
        } else if (field945 == 5) {
            int var70 = field937 + 180 - 80;
            short var71 = 321;
            if (var19 == 1 && var20 >= var70 - 75 && var20 <= var70 + 75 && var21 >= var71 - 20 && var21 <= var71 + 20) {
                method2593();
                return;
            }
            int var72 = field937 + 180 + 80;
            if (var19 == 1 && var20 >= var72 - 75 && var20 <= var72 + 75 && var21 >= var71 - 20 && var21 <= var71 + 20) {
                method5095(true);
            }
            short var73 = 361;
            if (Statics.field1118 != null) {
                int var74 = Statics.field1118.field4719 / 2;
                if (var19 == 1 && var20 >= Statics.field1118.field4720 - var74 && var20 <= Statics.field1118.field4720 + var74 && var21 >= var73 - 15 && var21 < var73) {
                    class32.method446(client.method3400("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var22.method3812()) {
                boolean var75 = false;
                for (int var76 = 0; var76 < field959.length(); var76++) {
                    if (var22.field2357 == field959.charAt(var76)) {
                        var75 = true;
                        break;
                    }
                }
                if (var22.field2370 == 13) {
                    method5095(true);
                } else {
                    if (var22.field2370 == 85 && field960.length() > 0) {
                        field960 = field960.substring(0, field960.length() - 1);
                    }
                    if (var22.field2370 == 84) {
                        method2593();
                        return;
                    }
                    if (var75 && field960.length() < 320) {
                        field960 = field960 + var22.field2357;
                    }
                }
            }
        } else if (field945 == 6) {
            while (true) {
                do {
                    if (!var22.method3812()) {
                        short var77 = 321;
                        if (var19 == 1 && var21 >= var77 - 20 && var21 <= var77 + 20) {
                            method5095(true);
                        }
                        return;
                    }
                } while (var22.field2370 != 84 && var22.field2370 != 13);
                method5095(true);
            }
        } else if (field945 == 7) {
            if (Statics.field4405 && !client.field762) {
                int var78 = Statics.field4761 - 150;
                int var79 = var78 + 240 + 25 + 40;
                short var80 = 231;
                int var81 = var80 + 40;
                if (var19 == 1 && var20 >= var78 && var20 <= var79 && var21 >= var80 && var21 <= var81) {
                    int var82 = var78;
                    int var83 = 0;
                    int var84;
                    while (true) {
                        if (var83 >= 8) {
                            var84 = 0;
                            break;
                        }
                        if (var20 <= var82 + 30) {
                            var84 = var83;
                            break;
                        }
                        var82 += 30;
                        var82 += var83 == 1 || var83 == 3 ? 20 : 5;
                        var83++;
                    }
                    field952 = var84;
                }
                int var85 = field937 + 180 - 80;
                short var86 = 321;
                if (var19 == 1 && var20 >= var85 - 75 && var20 <= var85 + 75 && var21 >= var86 - 20 && var21 <= var86 + 20) {
                    boolean var87 = method2798();
                    if (var87) {
                        client.method5473(50);
                        return;
                    }
                }
                int var88 = field937 + 180 + 80;
                if (var19 == 1 && var20 >= var88 - 75 && var20 <= var88 + 75 && var21 >= var86 - 20 && var21 <= var86 + 20) {
                    field955 = new String[8];
                    method5095(true);
                }
                while (var22.method3812()) {
                    if (var22.field2370 == 101) {
                        field955[field952] = null;
                    }
                    if (var22.field2370 == 85) {
                        if (field955[field952] == null && field952 > 0) {
                            field952--;
                        }
                        field955[field952] = null;
                    }
                    if (var22.field2357 >= '0' && var22.field2357 <= '9') {
                        field955[field952] = "" + var22.field2357;
                        if (field952 < 7) {
                            field952++;
                        }
                    }
                    if (var22.field2370 == 84) {
                        boolean var89 = method2798();
                        if (var89) {
                            client.method5473(50);
                        }
                        return;
                    }
                }
            } else {
                int var90 = field937 + 180 - 80;
                short var91 = 321;
                if (var19 == 1 && var20 >= var90 - 75 && var20 <= var90 + 75 && var21 >= var91 - 20 && var21 <= var91 + 20) {
                    class32.method446(client.method3400("secure", true) + "m=dob/set_dob.ws", true, false);
                    method5478(class352.field4171, class352.field4172, class352.field4056);
                    method816(6);
                    return;
                }
                int var92 = field937 + 180 + 80;
                if (var19 == 1 && var20 >= var92 - 75 && var20 <= var92 + 75 && var21 >= var91 - 20 && var21 <= var91 + 20) {
                    method5095(true);
                }
            }
        } else if (field945 == 8) {
            int var93 = field937 + 180 - 80;
            short var94 = 321;
            if (var19 == 1 && var20 >= var93 - 75 && var20 <= var93 + 75 && var21 >= var94 - 20 && var21 <= var94 + 20) {
                class32.method446("https://www.jagex.com/terms/privacy", true, false);
                method5478(class352.field4171, class352.field4172, class352.field4056);
                method816(6);
                return;
            }
            int var95 = field937 + 180 + 80;
            if (var19 == 1 && var20 >= var95 - 75 && var20 <= var95 + 75 && var21 >= var94 - 20 && var21 <= var94 + 20) {
                method5095(true);
            }
        } else if (field945 == 9) {
            int var96 = field937 + 180;
            short var97 = 311;
            if (var22.field2370 == 84 || var22.field2370 == 13 || var19 == 1 && var20 >= var96 - 75 && var20 <= var96 + 75 && var21 >= var97 - 20 && var21 <= var97 + 20) {
                method5094(false);
            }
        } else if (field945 == 10) {
            int var98 = field937 + 180;
            short var99 = 209;
            if (var22.field2370 == 84 || var19 == 1 && var20 >= var98 - 109 && var20 <= var98 + 109 && var21 >= var99 && var21 <= var99 + 68) {
                method5478(class352.field4140, class352.field4141, class352.field4126);
                client.field572 = class520.field5165;
                client.method2268(false);
                client.method5473(20);
            }
        } else if (field945 == 12) {
            int var100 = Statics.field4761;
            short var101 = 233;
            class446 var102 = arg2.method6843(0, 30, class352.field4203, var100, var101);
            class446 var103 = arg2.method6843(32, 32, class352.field4203, var100, var101);
            class446 var104 = arg2.method6843(70, 34, class352.field4203, var100, var101);
            int var128 = var101 + 17;
            class446 var105 = arg2.method6843(0, 34, class352.field4204, var100, var128);
            if (var19 == 1) {
                if (var102.method7448(var20, var21)) {
                    class32.method446("https://www.jagex.com/terms", true, false);
                } else if (var103.method7448(var20, var21)) {
                    class32.method446("https://www.jagex.com/terms/privacy", true, false);
                } else if (var104.method7448(var20, var21) || var105.method7448(var20, var21)) {
                    class32.method446("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var106 = Statics.field4761 - 80;
            short var107 = 311;
            if (var19 == 1 && var20 >= var106 - 75 && var20 <= var106 + 75 && var21 >= var107 - 20 && var21 <= var107 + 20) {
                client.method69();
                method5094(true);
            }
            int var108 = Statics.field4761 + 80;
            if (var19 == 1 && var20 >= var108 - 75 && var20 <= var108 + 75 && var21 >= var107 - 20 && var21 <= var107 + 20) {
                field945 = 13;
            }
        } else if (field945 == 13) {
            int var109 = Statics.field4761;
            short var110 = 321;
            if (var19 == 1 && var20 >= var109 - 75 && var20 <= var109 + 75 && var21 >= var110 - 20 && var21 <= var110 + 20) {
                method5094(true);
            }
        } else if (field945 == 14) {
            String var111 = "";
            switch(field943) {
                case 0:
                    var111 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var111 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var111 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method5095(false);
            }
            int var112 = field937 + 180;
            short var113 = 276;
            if (var19 == 1 && var20 >= var112 - 75 && var20 <= var112 + 75 && var21 >= var113 - 20 && var21 <= var113 + 20) {
                class32.method446(var111, true, false);
                method5478(class352.field4171, class352.field4172, class352.field4056);
                method816(6);
                return;
            }
            int var114 = field937 + 180;
            short var115 = 326;
            if (var19 == 1 && var20 >= var114 - 75 && var20 <= var114 + 75 && var21 >= var115 - 20 && var21 <= var115 + 20) {
                method5095(false);
            }
        } else if (field945 == 24) {
            int var116 = field937 + 180;
            short var117 = 301;
            if (var19 == 1 && var20 >= var116 - 75 && var20 <= var116 + 75 && var21 >= var117 - 20 && var21 <= var117 + 20) {
                method5094(false);
            }
        } else if (field945 == 32) {
            int var118 = field937 + 180 - 80;
            short var119 = 321;
            if (var19 == 1 && var20 >= var118 - 75 && var20 <= var118 + 75 && var21 >= var119 - 20 && var21 <= var119 + 20) {
                class32.method446(client.method3400("secure", true) + "m=dob/set_dob.ws", true, false);
                method5478(class352.field4171, class352.field4172, class352.field4056);
                method816(6);
                return;
            }
            int var120 = field937 + 180 + 80;
            if (var19 == 1 && var20 >= var120 - 75 && var20 <= var120 + 75 && var21 >= var119 - 20 && var21 <= var119 + 20) {
                method5095(true);
            }
        } else if (field945 == 33) {
            int var121 = field937 + 180;
            short var122 = 276;
            if (var19 == 1 && var20 >= var121 - 75 && var20 <= var121 + 75 && var21 >= var122 - 20 && var21 <= var122 + 20) {
                class32.method446(class352.field4222, true, false);
            }
            int var123 = field937 + 180;
            short var124 = 326;
            if (var19 == 1 && var20 >= var123 - 75 && var20 <= var123 + 75 && var21 >= var124 - 20 && var21 <= var124 + 20) {
                method5095(true);
            }
        }
    }

    @ObfuscatedName("ec.ac(I)Z")
    public static boolean method2798() {
        Date var0;
        try {
            var0 = Statics.method3478();
        } catch (ParseException var6) {
            method5137("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        boolean var2 = method4662(var0);
        Date var3 = method5446();
        boolean var4 = var0.after(var3);
        if (!var4) {
            method816(7);
            method5478("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var2) {
            Statics.field907 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field907 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("md.ai(I)Ljava/util/Date;")
    public static Date method5446() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("jq.az(Ljava/util/Date;I)Z")
    public static boolean method4662(Date arg0) {
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

    @ObfuscatedName("ku.ap(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5137(String arg0, String arg1, String arg2) {
        method816(7);
        method5478(arg0, arg1, arg2);
    }

    @ObfuscatedName("ff.af(CI)Z")
    public static boolean method2974(char arg0) {
        for (int var1 = 0; var1 < field959.length(); var1++) {
            if (arg0 == field959.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gc.ad(CS)Z")
    public static boolean method3054(char arg0) {
        return field959.indexOf(arg0) != -1;
    }

    @ObfuscatedName("kv.aq(ZI)V")
    public static void method5095(boolean arg0) {
        if (Statics.field2415.method1185() || Statics.field2415.method1187() || Statics.field2415.method1347()) {
            method816(10);
            return;
        }
        field951 = class352.field4123;
        field948 = class352.field4124;
        field949 = class352.field4086;
        method816(2);
        if (arg0) {
            field953 = "";
        }
        if (field960 == null || field960.length() <= 0) {
            if (Statics.field4737.method2361() == null) {
                client.field581 = false;
            } else {
                field960 = Statics.field4737.method2361();
                client.field581 = true;
            }
        }
        method3649();
    }

    @ObfuscatedName("kv.al(ZB)V")
    public static void method5094(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field4737.method2363() >= client.field532;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field2415.method1185() || Statics.field2415.method1187() || Statics.field2415.method1347()) {
            var1 = 10;
        }
        method816(var1);
        if (arg0) {
            field960 = "";
            field953 = "";
            Statics.field5040 = 0;
            Statics.field4369 = "";
        }
        if (field960 == null || field960.length() <= 0) {
            if (Statics.field4737.method2361() == null) {
                client.field581 = false;
            } else {
                field960 = Statics.field4737.method2361();
                client.field581 = true;
            }
        }
        if (client.field581 && field960 != null && field960.length() > 0) {
            field958 = 1;
        } else {
            field958 = 0;
        }
    }

    @ObfuscatedName("eq.an(B)V")
    public static void method2593() {
        field960 = field960.trim();
        if (field960.length() == 0) {
            method5478(class352.field4174, class352.field4175, class352.field4176);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method3400("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class515 var4 = new class515(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field5108, var4.field5111, 1000 - var4.field5111);
                if (var5 == -1) {
                    var4.field5111 = 0;
                    long var8 = var4.method8307();
                    var6 = var8;
                    break;
                }
                var4.field5111 += var5;
                if (var4.field5111 >= 1000) {
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
            var13 = class73.method5477(var6, field960);
        }
        switch(var13) {
            case 2:
                method5478(class352.field4177, class352.field4178, class352.field4179);
                method816(6);
                break;
            case 3:
                method5478(class352.field4211, class352.field4181, class352.field3986);
                break;
            case 4:
                method5478(class352.field4183, class352.field4184, class352.field4168);
                break;
            case 5:
                method5478(class352.field4186, class352.field4187, class352.field4180);
                break;
            case 6:
                method5478(class352.field4189, class352.field3950, class352.field4053);
                break;
            case 7:
                method5478(class352.field3918, class352.field4193, class352.field4017);
        }
    }

    @ObfuscatedName("eh.ar(Lpi;Lpi;Lpi;B)V")
    public static void method2569(class394 arg0, class394 arg1, class394 arg2) {
        field931 = (Statics.field1450 - 765) / 2;
        field937 = field931 + 202;
        Statics.field4761 = field937 + 180;
        if (field961) {
            if (Statics.field925 == null) {
                Statics.field925 = class530.method297(Statics.field305, "sl_back", "");
            }
            if (Statics.field340 == null) {
                Statics.field340 = class530.method3937(Statics.field305, "sl_flags", "");
            }
            if (Statics.field3484 == null) {
                Statics.field3484 = class530.method3937(Statics.field305, "sl_arrows", "");
            }
            if (Statics.field1057 == null) {
                Statics.field1057 = class530.method3937(Statics.field305, "sl_stars", "");
            }
            if (Statics.field1078 == null) {
                Statics.field1078 = class530.method3216(Statics.field305, "leftarrow", "");
            }
            if (Statics.field2562 == null) {
                Statics.field2562 = class530.method3216(Statics.field305, "rightarrow", "");
            }
            class525.method8612(field931, 23, 765, 480, 0);
            class525.method8613(field931, 0, 125, 23, 12425273, 9135624);
            class525.method8613(field931 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method6846(class352.field4210, field931 + 62, 15, 0, -1);
            if (Statics.field1057 != null) {
                Statics.field1057[1].method8705(field931 + 140, 1);
                arg1.method6925(class352.field3938, field931 + 152, 10, 16777215, -1);
                Statics.field1057[0].method8705(field931 + 140, 12);
                arg1.method6925(class352.field3996, field931 + 152, 21, 16777215, -1);
            }
            if (Statics.field3484 != null) {
                int var3 = field931 + 280;
                if (class68.field840[0] == 0 && class68.field839[0] == 0) {
                    Statics.field3484[2].method8705(var3, 4);
                } else {
                    Statics.field3484[0].method8705(var3, 4);
                }
                if (class68.field840[0] == 0 && class68.field839[0] == 1) {
                    Statics.field3484[3].method8705(var3 + 15, 4);
                } else {
                    Statics.field3484[1].method8705(var3 + 15, 4);
                }
                arg0.method6925(class352.field4213, var3 + 32, 17, 16777215, -1);
                int var4 = field931 + 390;
                if (class68.field840[0] == 1 && class68.field839[0] == 0) {
                    Statics.field3484[2].method8705(var4, 4);
                } else {
                    Statics.field3484[0].method8705(var4, 4);
                }
                if (class68.field840[0] == 1 && class68.field839[0] == 1) {
                    Statics.field3484[3].method8705(var4 + 15, 4);
                } else {
                    Statics.field3484[1].method8705(var4 + 15, 4);
                }
                arg0.method6925(class352.field4214, var4 + 32, 17, 16777215, -1);
                int var5 = field931 + 500;
                if (class68.field840[0] == 2 && class68.field839[0] == 0) {
                    Statics.field3484[2].method8705(var5, 4);
                } else {
                    Statics.field3484[0].method8705(var5, 4);
                }
                if (class68.field840[0] == 2 && class68.field839[0] == 1) {
                    Statics.field3484[3].method8705(var5 + 15, 4);
                } else {
                    Statics.field3484[1].method8705(var5 + 15, 4);
                }
                arg0.method6925(class352.field4215, var5 + 32, 17, 16777215, -1);
                int var6 = field931 + 610;
                if (class68.field840[0] == 3 && class68.field839[0] == 0) {
                    Statics.field3484[2].method8705(var6, 4);
                } else {
                    Statics.field3484[0].method8705(var6, 4);
                }
                if (class68.field840[0] == 3 && class68.field839[0] == 1) {
                    Statics.field3484[3].method8705(var6 + 15, 4);
                } else {
                    Statics.field3484[1].method8705(var6 + 15, 4);
                }
                arg0.method6925(class352.field4216, var6 + 32, 17, 16777215, -1);
            }
            class525.method8612(field931 + 708, 4, 50, 16, 0);
            arg1.method6846(class352.field4156, field931 + 708 + 25, 16, 16777215, -1);
            field962 = -1;
            if (Statics.field925 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class68.field842) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class68.field842) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class68.field842) {
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
                int var17 = (class68.field842 + var10 - 1) / var10;
                field969 = var17 - var9;
                if (Statics.field1078 != null && field963 > 0) {
                    Statics.field1078.method8705(8, Statics.field1890 / 2 - Statics.field1078.field5202 / 2);
                }
                if (Statics.field2562 != null && field963 < field969) {
                    Statics.field2562.method8705(Statics.field1450 - Statics.field2562.field5201 - 8, Statics.field1890 / 2 - Statics.field2562.field5202 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field931 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field963;
                for (int var23 = var10 * var22; var23 < class68.field842 && var22 - field963 < var9; var23++) {
                    class68 var24 = Statics.field1879[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field843);
                    if (var24.field843 == -1) {
                        var26 = class352.field4217;
                        var25 = false;
                    } else if (var24.field843 > 1980) {
                        var26 = class352.field4112;
                        var25 = false;
                    }
                    class109 var27 = null;
                    int var28 = 0;
                    if (var24.method1727()) {
                        var27 = var24.method1718() ? class109.field1398 : class109.field1408;
                    } else if (var24.method1719()) {
                        var27 = var24.method1718() ? class109.field1407 : class109.field1400;
                    } else if (var24.method1723()) {
                        var28 = 16711680;
                        var27 = var24.method1718() ? class109.field1397 : class109.field1392;
                    } else if (var24.method1724()) {
                        var27 = var24.method1718() ? class109.field1396 : class109.field1401;
                    } else if (var24.method1768()) {
                        var27 = var24.method1718() ? class109.field1395 : class109.field1399;
                    } else if (var24.method1758()) {
                        var27 = var24.method1718() ? class109.field1403 : class109.field1402;
                    } else if (var24.method1726()) {
                        var27 = var24.method1718() ? class109.field1405 : class109.field1404;
                    }
                    if (var27 == null || var27.field1406 >= Statics.field925.length) {
                        var27 = var24.method1718() ? class109.field1393 : class109.field1394;
                    }
                    if (class36.field255 >= var19 && class36.field233 >= var18 && class36.field255 < var7 + var19 && class36.field233 < var8 + var18 && var25) {
                        field962 = var23;
                        Statics.field925[var27.field1406].method8728(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field925[var27.field1406].method8722(var19, var18);
                    }
                    if (Statics.field340 != null) {
                        Statics.field340[(var24.method1718() ? 8 : 0) + var24.field846].method8705(var19 + 29, var18);
                    }
                    arg0.method6846(Integer.toString(var24.field841), var19 + 15, var8 / 2 + var18 + 5, var28, -1);
                    arg1.method6846(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
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
                    int var29 = arg1.method6838(Statics.field1879[field962].field845) + 6;
                    int var30 = arg1.field4484 + 8;
                    int var31 = class36.field233 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class36.field233 - 25 - var30;
                    }
                    class525.method8612(class36.field255 - var29 / 2, var31, var29, var30, 16777120);
                    class525.method8616(class36.field255 - var29 / 2, var31, var29, var30, 0);
                    arg1.method6846(Statics.field1879[field962].field845, class36.field255, arg1.field4484 + var31 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field935.method8722(field931, 0);
        Statics.field4721.method8722(field931 + 382, 0);
        Statics.field330.method8705(field931 + 382 - Statics.field330.field5201 / 2, 18);
        if (client.field611 == 0 || client.field611 == 5) {
            byte var32 = 20;
            arg0.method6846(class352.field4103, field937 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class525.method8616(field937 + 180 - 152, var33, 304, 34, 9179409);
            class525.method8616(field937 + 180 - 151, var33 + 1, 302, 32, 0);
            class525.method8612(field937 + 180 - 150, var33 + 2, field938 * 3, 30, 9179409);
            class525.method8612(field938 * 3 + (field937 + 180 - 150), var33 + 2, 300 - field938 * 3, 30, 0);
            arg0.method6846(field939, field937 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field611 == 20) {
            Statics.field933.method8705(field937 + 180 - Statics.field933.field5201 / 2, 271 - Statics.field933.field5202 / 2);
            short var34 = 201;
            arg0.method6846(field951, field937 + 180, var34, 16776960, 0);
            int var150 = var34 + 15;
            arg0.method6846(field948, field937 + 180, var150, 16776960, 0);
            int var151 = var150 + 15;
            arg0.method6846(field949, field937 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            int var153 = var152 + 7;
            if (field945 != 4 && field945 != 10) {
                arg0.method6925(class352.field4149, field937 + 180 - 110, var153, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method4440(); arg0.method6838(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method6925(class398.method6856(var36), field937 + 180 - 70, var153, 16777215, 0);
                var150 = var153 + 15;
                String var37 = field953;
                String var38 = class387.method5054('*', var37.length());
                String var39;
                for (var39 = var38; arg0.method6838(var39) > var35; var39 = var39.substring(1)) {
                }
                arg0.method6925(class352.field4150 + var39, field937 + 180 - 108, var150, 16777215, 0);
                var150 += 15;
            }
        }
        if (client.field611 == 10 || client.field611 == 11 || client.field611 == 50) {
            Statics.field933.method8705(field937, 171);
            if (field945 == 0) {
                short var40 = 251;
                arg0.method6846(class352.field4194, field937 + 180, var40, 16776960, 0);
                int var154 = var40 + 30;
                int var41 = field937 + 180 - 80;
                short var42 = 291;
                Statics.field2418.method8705(var41 - 73, var42 - 20);
                arg0.method6837(class352.field4153, var41 - 73, var42 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var43 = field937 + 180 + 80;
                Statics.field2418.method8705(var43 - 73, var42 - 20);
                arg0.method6837(class352.field4154, var43 - 73, var42 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field945 == 1) {
                arg0.method6846(field971, field937 + 180, 201, 16776960, 0);
                short var44 = 236;
                arg0.method6846(field951, field937 + 180, var44, 16777215, 0);
                int var155 = var44 + 15;
                arg0.method6846(field948, field937 + 180, var155, 16777215, 0);
                int var156 = var155 + 15;
                arg0.method6846(field949, field937 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                int var45 = field937 + 180 - 80;
                short var46 = 321;
                Statics.field2418.method8705(var45 - 73, var46 - 20);
                arg0.method6846(class352.field3919, var45, var46 + 5, 16777215, 0);
                int var47 = field937 + 180 + 80;
                Statics.field2418.method8705(var47 - 73, var46 - 20);
                arg0.method6846(class352.field4156, var47, var46 + 5, 16777215, 0);
            } else if (field945 == 2) {
                short var48 = 201;
                arg0.method6846(field951, Statics.field4761, var48, 16776960, 0);
                int var158 = var48 + 15;
                arg0.method6846(field948, Statics.field4761, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg0.method6846(field949, Statics.field4761, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var161 = var160 + 7;
                arg0.method6925(class352.field4149, Statics.field4761 - 110, var161, 16777215, 0);
                short var49 = 200;
                String var50;
                for (var50 = method4440(); arg0.method6838(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method6925(class398.method6856(var50) + (field958 == 0 & client.field833 % 40 < 20 ? class102.method3915(16776960) + class102.field1338 : ""), Statics.field4761 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                String var51 = field953;
                String var52 = class387.method5054('*', var51.length());
                String var53;
                for (var53 = var52; arg0.method6838(var53) > var49; var53 = var53.substring(1)) {
                }
                arg0.method6925(class352.field4150 + var53 + (field958 == 1 & client.field833 % 40 < 20 ? class102.method3915(16776960) + class102.field1338 : ""), Statics.field4761 - 108, var158, 16777215, 0);
                var158 += 15;
                short var54 = 277;
                int var55 = Statics.field4761 + -117;
                boolean var56 = client.field581;
                boolean var57 = field936;
                class528 var58 = var56 ? (var57 ? Statics.field2084 : Statics.field1492) : (var57 ? Statics.field3851 : Statics.field930);
                var58.method8705(var55, var54);
                int var60 = var58.field5201 + 5 + var55;
                arg1.method6925(class352.field4157, var60, var54 + 13, 16776960, 0);
                int var61 = Statics.field4761 + 24;
                boolean var62 = Statics.field4737.method2349();
                boolean var63 = field964;
                class528 var64 = var62 ? (var63 ? Statics.field2084 : Statics.field1492) : (var63 ? Statics.field3851 : Statics.field930);
                var64.method8705(var61, var54);
                int var66 = var64.field5201 + 5 + var61;
                arg1.method6925(class352.field4111, var66, var54 + 13, 16776960, 0);
                int var162 = var54 + 15;
                int var67 = Statics.field4761 - 80;
                short var68 = 321;
                Statics.field2418.method8705(var67 - 73, var68 - 20);
                arg0.method6846(class352.field4110, var67, var68 + 5, 16777215, 0);
                int var69 = Statics.field4761 + 80;
                Statics.field2418.method8705(var69 - 73, var68 - 20);
                arg0.method6846(class352.field4156, var69, var68 + 5, 16777215, 0);
                short var70 = 357;
                switch(field944) {
                    case 2:
                        Statics.field1715 = class352.field4170;
                        break;
                    default:
                        Statics.field1715 = class352.field4121;
                }
                Statics.field1344 = new class446(Statics.field4761, var70, arg1.method6838(Statics.field1715), 11);
                Statics.field1118 = new class446(Statics.field4761, var70, arg1.method6838(class352.field4169), 11);
                arg1.method6846(Statics.field1715, Statics.field4761, var70, 16777215, 0);
            } else if (field945 == 3) {
                short var71 = 201;
                arg0.method6846(class352.field4164, field937 + 180, var71, 16776960, 0);
                int var163 = var71 + 20;
                arg1.method6846(class352.field3976, field937 + 180, var163, 16776960, 0);
                int var164 = var163 + 20;
                arg1.method6846(class352.field4161, field937 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                int var72 = field937 + 180;
                short var73 = 276;
                Statics.field2418.method8705(var72 - 73, var73 - 20);
                arg2.method6846(class352.field4162, var72, var73 + 5, 16777215, 0);
                int var74 = field937 + 180;
                short var75 = 326;
                Statics.field2418.method8705(var74 - 73, var75 - 20);
                arg2.method6846(class352.field4163, var74, var75 + 5, 16777215, 0);
            } else if (field945 == 4) {
                arg0.method6846(class352.field4139, field937 + 180, 201, 16776960, 0);
                short var76 = 236;
                arg0.method6846(field951, field937 + 180, var76, 16777215, 0);
                int var166 = var76 + 15;
                arg0.method6846(field948, field937 + 180, var166, 16777215, 0);
                int var167 = var166 + 15;
                arg0.method6846(field949, field937 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                String var78 = class352.field4151;
                String var79 = Statics.field4369;
                String var80 = class387.method5054('*', var79.length());
                arg0.method6925(var78 + var80 + (client.field833 % 40 < 20 ? class102.method3915(16776960) + class102.field1338 : ""), field937 + 180 - 108, var168, 16777215, 0);
                int var169 = var168 - 8;
                arg0.method6925(class352.field3922, field937 + 180 - 9, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg0.method6925(class352.field4039, field937 + 180 - 9, var170, 16776960, 0);
                int var81 = field937 + 180 - 9 + arg0.method6838(class352.field4039) + 15;
                int var82 = var170 - arg0.field4484;
                class528 var83;
                if (field957) {
                    var83 = Statics.field1492;
                } else {
                    var83 = Statics.field930;
                }
                var83.method8705(var81, var82);
                var166 = var170 + 15;
                int var84 = field937 + 180 - 80;
                short var85 = 321;
                Statics.field2418.method8705(var84 - 73, var85 - 20);
                arg0.method6846(class352.field3919, var84, var85 + 5, 16777215, 0);
                int var86 = field937 + 180 + 80;
                Statics.field2418.method8705(var86 - 73, var85 - 20);
                arg0.method6846(class352.field4156, var86, var85 + 5, 16777215, 0);
                arg1.method6846(class352.field4121, field937 + 180, var85 + 36, 16777215, 0);
            } else if (field945 == 5) {
                arg0.method6846(class352.field4113, field937 + 180, 201, 16776960, 0);
                short var87 = 221;
                arg2.method6846(field951, field937 + 180, var87, 16776960, 0);
                int var171 = var87 + 15;
                arg2.method6846(field948, field937 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg2.method6846(field949, field937 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var174 = var173 + 14;
                arg0.method6925(class352.field4035, field937 + 180 - 145, var174, 16777215, 0);
                short var88 = 174;
                String var89;
                for (var89 = method4440(); arg0.method6838(var89) > var88; var89 = var89.substring(1)) {
                }
                arg0.method6925(class398.method6856(var89) + (client.field833 % 40 < 20 ? class102.method3915(16776960) + class102.field1338 : ""), field937 + 180 - 34, var174, 16777215, 0);
                var171 = var174 + 15;
                int var90 = field937 + 180 - 80;
                short var91 = 321;
                Statics.field2418.method8705(var90 - 73, var91 - 20);
                arg0.method6846(class352.field4166, var90, var91 + 5, 16777215, 0);
                int var92 = field937 + 180 + 80;
                Statics.field2418.method8705(var92 - 73, var91 - 20);
                arg0.method6846(class352.field4206, var92, var91 + 5, 16777215, 0);
                short var93 = 356;
                arg1.method6846(class352.field4169, Statics.field4761, var93, 268435455, 0);
            } else if (field945 == 6) {
                short var94 = 201;
                arg0.method6846(field951, field937 + 180, var94, 16776960, 0);
                int var175 = var94 + 15;
                arg0.method6846(field948, field937 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg0.method6846(field949, field937 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var95 = field937 + 180;
                short var96 = 321;
                Statics.field2418.method8705(var95 - 73, var96 - 20);
                arg0.method6846(class352.field4206, var95, var96 + 5, 16777215, 0);
            } else if (field945 == 7) {
                if (Statics.field4405 && !client.field762) {
                    short var97 = 201;
                    arg0.method6846(field951, Statics.field4761, var97, 16776960, 0);
                    int var178 = var97 + 15;
                    arg0.method6846(field948, Statics.field4761, var178, 16776960, 0);
                    int var179 = var178 + 15;
                    arg0.method6846(field949, Statics.field4761, var179, 16776960, 0);
                    int var98 = Statics.field4761 - 150;
                    int var180 = var179 + 10;
                    for (int var99 = 0; var99 < 8; var99++) {
                        Statics.field2418.method8702(var98, var180, 30, 40);
                        boolean var100 = field952 == var99 & client.field833 % 40 < 20;
                        arg0.method6925((field955[var99] == null ? "" : field955[var99]) + (var100 ? class102.method3915(16776960) + class102.field1338 : ""), var98 + 10, var180 + 27, 16777215, 0);
                        if (var99 == 1 || var99 == 3) {
                            var98 += 50;
                            arg0.method6925(class398.method6856("/"), var98 - 13, var180 + 27, 16777215, 0);
                        } else {
                            var98 += 35;
                        }
                    }
                    int var101 = Statics.field4761 - 80;
                    short var102 = 321;
                    Statics.field2418.method8705(var101 - 73, var102 - 20);
                    arg0.method6846("Submit", var101, var102 + 5, 16777215, 0);
                    int var103 = Statics.field4761 + 80;
                    Statics.field2418.method8705(var103 - 73, var102 - 20);
                    arg0.method6846(class352.field4156, var103, var102 + 5, 16777215, 0);
                } else {
                    short var104 = 216;
                    arg0.method6846(class352.field4191, field937 + 180, var104, 16776960, 0);
                    int var181 = var104 + 15;
                    arg2.method6846(class352.field4196, field937 + 180, var181, 16776960, 0);
                    int var182 = var181 + 15;
                    arg2.method6846(class352.field4197, field937 + 180, var182, 16776960, 0);
                    int var183 = var182 + 15;
                    int var105 = field937 + 180 - 80;
                    short var106 = 321;
                    Statics.field2418.method8705(var105 - 73, var106 - 20);
                    arg0.method6846(class352.field4198, var105, var106 + 5, 16777215, 0);
                    int var107 = field937 + 180 + 80;
                    Statics.field2418.method8705(var107 - 73, var106 - 20);
                    arg0.method6846(class352.field4206, var107, var106 + 5, 16777215, 0);
                }
            } else if (field945 == 8) {
                short var108 = 216;
                arg0.method6846(class352.field4052, field937 + 180, var108, 16776960, 0);
                int var184 = var108 + 15;
                arg2.method6846(class352.field4094, field937 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                arg2.method6846(class352.field4063, field937 + 180, var185, 16776960, 0);
                int var186 = var185 + 15;
                int var109 = field937 + 180 - 80;
                short var110 = 321;
                Statics.field2418.method8705(var109 - 73, var110 - 20);
                arg0.method6846(class352.field4167, var109, var110 + 5, 16777215, 0);
                int var111 = field937 + 180 + 80;
                Statics.field2418.method8705(var111 - 73, var110 - 20);
                arg0.method6846(class352.field4206, var111, var110 + 5, 16777215, 0);
            } else if (field945 == 9) {
                short var112 = 221;
                arg0.method6846(field951, field937 + 180, var112, 16776960, 0);
                int var187 = var112 + 25;
                arg0.method6846(field948, field937 + 180, var187, 16776960, 0);
                int var188 = var187 + 25;
                arg0.method6846(field949, field937 + 180, var188, 16776960, 0);
                int var113 = field937 + 180;
                short var114 = 311;
                Statics.field2418.method8705(var113 - 73, var114 - 20);
                arg0.method6846(class352.field4162, var113, var114 + 5, 16777215, 0);
            } else if (field945 == 10) {
                int var115 = field937 + 180;
                short var116 = 209;
                arg0.method6846(class352.field4194, field937 + 180, var116, 16776960, 0);
                int var189 = var116 + 20;
                Statics.field934.method8705(var115 - 109, var189);
                if (field954.isEmpty()) {
                    Statics.field1069.method8705(var115 - 48, var189 + 18);
                } else {
                    Statics.field1069.method8705(var115 - 48, var189 + 5);
                    arg0.method6846(field954, var115, var189 + 68 - 15, 16776960, 0);
                }
            } else if (field945 == 12) {
                int var117 = Statics.field4761;
                short var118 = 216;
                arg2.method6846(class352.field4202, var117, var118, 16777215, 0);
                int var190 = var118 + 17;
                arg2.method6846(class352.field4203, var117, var190, 16777215, 0);
                int var191 = var190 + 17;
                arg2.method6846(class352.field4204, var117, var191, 16777215, 0);
                int var192 = var191 + 17;
                arg2.method6846(class352.field4205, var117, var192, 16777215, 0);
                int var119 = Statics.field4761 - 80;
                short var120 = 311;
                Statics.field2418.method8705(var119 - 73, var120 - 20);
                arg0.method6846(class352.field4024, var119, var120 + 5, 16777215, 0);
                int var121 = Statics.field4761 + 80;
                Statics.field2418.method8705(var121 - 73, var120 - 20);
                arg0.method6846(class352.field4209, var121, var120 + 5, 16777215, 0);
            } else if (field945 == 13) {
                short var122 = 231;
                arg2.method6846(class352.field3969, field937 + 180, var122, 16777215, 0);
                int var193 = var122 + 20;
                arg2.method6846(class352.field4207, field937 + 180, var193, 16777215, 0);
                int var123 = field937 + 180;
                short var124 = 311;
                Statics.field2418.method8705(var123 - 73, var124 - 20);
                arg0.method6846(class352.field4206, var123, var124 + 5, 16777215, 0);
            } else if (field945 == 14) {
                short var125 = 201;
                String var126 = "";
                String var127 = "";
                String var128 = "";
                switch(field943) {
                    case 0:
                        var126 = class352.field4018;
                        var127 = class352.field3958;
                        var128 = class352.field3970;
                        break;
                    case 1:
                        var126 = class352.field4007;
                        var127 = class352.field4008;
                        var128 = class352.field4009;
                        break;
                    case 2:
                        var126 = class352.field4003;
                        var127 = class352.field4011;
                        var128 = class352.field4045;
                        break;
                    default:
                        method5095(false);
                }
                arg0.method6846(var126, field937 + 180, var125, 16776960, 0);
                int var194 = var125 + 20;
                arg0.method6846(var127, field937 + 180, var194, 16776960, 0);
                int var195 = var194 + 20;
                arg0.method6846(var128, field937 + 180, var195, 16776960, 0);
                int var129 = field937 + 180;
                short var130 = 276;
                Statics.field2418.method8705(var129 - 73, var130 - 20);
                if (field943 == 1) {
                    arg0.method6846(class352.field3952, var129, var130 + 5, 16777215, 0);
                } else {
                    arg0.method6846(class352.field4029, var129, var130 + 5, 16777215, 0);
                }
                int var131 = field937 + 180;
                short var132 = 326;
                Statics.field2418.method8705(var131 - 73, var132 - 20);
                arg0.method6846(class352.field4206, var131, var132 + 5, 16777215, 0);
            } else if (field945 == 24) {
                short var133 = 221;
                arg0.method6846(field951, field937 + 180, var133, 16777215, 0);
                int var196 = var133 + 15;
                arg0.method6846(field948, field937 + 180, var196, 16777215, 0);
                int var197 = var196 + 15;
                arg0.method6846(field949, field937 + 180, var197, 16777215, 0);
                int var198 = var197 + 15;
                int var134 = field937 + 180;
                short var135 = 301;
                Statics.field2418.method8705(var134 - 73, var135 - 20);
                arg0.method6846(class352.field3917, var134, var135 + 5, 16777215, 0);
            } else if (field945 == 32) {
                short var136 = 216;
                arg0.method6846(class352.field4191, field937 + 180, var136, 16776960, 0);
                int var199 = var136 + 15;
                arg2.method6846(class352.field4196, field937 + 180, var199, 16776960, 0);
                int var200 = var199 + 15;
                arg2.method6846(class352.field4197, field937 + 180, var200, 16776960, 0);
                int var201 = var200 + 15;
                int var137 = field937 + 180 - 80;
                short var138 = 321;
                Statics.field2418.method8705(var137 - 73, var138 - 20);
                arg0.method6846(class352.field4198, var137, var138 + 5, 16777215, 0);
                int var139 = field937 + 180 + 80;
                Statics.field2418.method8705(var139 - 73, var138 - 20);
                arg0.method6846(class352.field4206, var139, var138 + 5, 16777215, 0);
            } else if (field945 == 33) {
                short var140 = 201;
                arg0.method6846(field951, field937 + 180, var140, 16776960, 0);
                int var202 = var140 + 20;
                arg1.method6846(field948, field937 + 180, var202, 16776960, 0);
                int var203 = var202 + 20;
                arg1.method6846(field949, field937 + 180, var203, 16776960, 0);
                int var204 = var203 + 15;
                int var141 = field937 + 180;
                short var142 = 276;
                Statics.field2418.method8705(var141 - 73, var142 - 20);
                arg2.method6846(class352.field4221, var141, var142 + 5, 16777215, 0);
                int var143 = field937 + 180;
                short var144 = 326;
                Statics.field2418.method8705(var143 - 73, var144 - 20);
                arg2.method6846(class352.field4206, var143, var144 + 5, 16777215, 0);
            }
        }
        if (client.field611 >= 10) {
            int[] var145 = new int[4];
            class525.method8606(var145);
            class525.method8621(field931, 0, field931 + 765, Statics.field1890);
            Statics.field1650.method2331(field931 - 22, client.field833);
            Statics.field1650.method2331(field931 + 765 + 22 - 128, client.field833);
            class525.method8673(var145);
        }
        Statics.field68[Statics.field4737.method2379() ? 1 : 0].method8705(field931 + 765 - 40, 463);
        if (client.field611 <= 5 || Statics.field1676 != class374.field4384) {
            return;
        }
        if (Statics.field1967 == null) {
            Statics.field1967 = class530.method3216(Statics.field305, "sl_button", "");
            return;
        }
        int var146 = field931 + 5;
        short var147 = 463;
        byte var148 = 100;
        byte var149 = 35;
        Statics.field1967.method8705(var146, var147);
        arg0.method6846(class352.field4092 + " " + client.field527, var148 / 2 + var146, var149 / 2 + var147 - 2, 16777215, 0);
        if (Statics.field2886 == null) {
            arg1.method6846(class352.field4220, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        } else {
            arg1.method6846(class352.field4062, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("mk.ab(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5478(String arg0, String arg1, String arg2) {
        field951 = arg0;
        field948 = arg1;
        field949 = arg2;
    }

    @ObfuscatedName("oe.ag(Lch;I)V")
    public static void method6375(class68 arg0) {
        if (arg0.method1718() != client.field554) {
            client.field554 = arg0.method1718();
            boolean var1 = arg0.method1718();
            if (Statics.field2229 != var1) {
                class207.field2230.method5175();
                class207.field2277.method5175();
                class207.field2232.method5175();
                Statics.field2229 = var1;
            }
        }
        if (client.field528 != arg0.field837) {
            class357 var2 = Statics.field305;
            int var3 = arg0.field837;
            if ((var3 & class511.field5091.method30()) != 0) {
                Statics.field330 = class530.method3216(var2, "logo_deadman_mode", "");
            } else if ((var3 & class511.field5092.method30()) != 0) {
                Statics.field330 = class530.method3216(var2, "logo_seasonal_mode", "");
            } else if ((var3 & class511.field5070.method30()) == 0) {
                Statics.field330 = class530.method3216(var2, "logo", "");
            } else {
                Statics.field330 = class530.method3216(var2, "logo_speedrunning", "");
            }
        }
        Statics.field3106 = arg0.field844;
        client.field527 = arg0.field841;
        client.field528 = arg0.field837;
        Statics.field167 = arg0.field848;
        Statics.field4880 = client.field552 == 0 ? 43594 : arg0.field841 + 40000;
        Statics.field1547 = client.field552 == 0 ? 443 : arg0.field841 + 50000;
        Statics.field7 = Statics.field4880;
    }

    @ObfuscatedName("cf.am(B)V")
    public static void method1035() {
        if (class68.method2802()) {
            field961 = true;
            field963 = 0;
            field969 = 0;
        }
    }

    @ObfuscatedName("jh.ax(I)V")
    public static void method4991() {
        field961 = false;
        Statics.field935.method8722(field931, 0);
        Statics.field4721.method8722(field931 + 382, 0);
        Statics.field330.method8705(field931 + 382 - Statics.field330.field5201 / 2, 18);
    }

    @ObfuscatedName("rt.ah(B)V")
    public static void method7658() {
        method816(24);
        method5478(class352.field4160, class352.field4147, class352.field4148);
    }

    @ObfuscatedName("bb.as(II)V")
    public static void method816(int arg0) {
        if (field945 != arg0) {
            field945 = arg0;
        }
    }

    @ObfuscatedName("sy.aj(Ljava/lang/String;I)V")
    public static void method7749(String arg0) {
        field954 = class494.method3395(arg0);
    }
}
