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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("cw")
public class class76 {

    @ObfuscatedName("cw.af")
    public static int field906 = 0;

    @ObfuscatedName("cw.ah")
    public static int field911 = field906 + 202;

    @ObfuscatedName("cw.ac")
    public static int field912 = 10;

    @ObfuscatedName("cw.al")
    public static String field913 = "";

    @ObfuscatedName("cw.bi")
    public static int field920 = -1;

    @ObfuscatedName("cw.bs")
    public static int field917 = 1;

    @ObfuscatedName("cw.cg")
    public static int field918 = 0;

    @ObfuscatedName("cw.cb")
    public static String field919 = "";

    @ObfuscatedName("cw.ci")
    public static String field931 = "";

    @ObfuscatedName("cw.cv")
    public static String field921 = "";

    @ObfuscatedName("cw.ct")
    public static String field905 = "";

    @ObfuscatedName("cw.cp")
    public static String field904 = "";

    @ObfuscatedName("cw.cq")
    public static String field924 = "";

    @ObfuscatedName("cw.cs")
    public static int field925 = 0;

    @ObfuscatedName("cw.cc")
    public static String[] field935 = new String[8];

    @ObfuscatedName("cw.cn")
    public static String field927 = "";

    @ObfuscatedName("cw.cj")
    public static boolean field929 = false;

    @ObfuscatedName("cw.cf")
    public static boolean field930 = false;

    @ObfuscatedName("cw.ca")
    public static boolean field914 = true;

    @ObfuscatedName("cw.dd")
    public static int field932 = 0;

    @ObfuscatedName("cw.dc")
    public static String field922 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cw.dg")
    public static String field908 = "1234567890";

    @ObfuscatedName("cw.dt")
    public static boolean field928 = false;

    @ObfuscatedName("cw.de")
    public static int field937 = -1;

    @ObfuscatedName("cw.dn")
    public static int field938 = 0;

    @ObfuscatedName("cw.dp")
    public static int field939 = 0;

    @ObfuscatedName("cw.dk")
    public static long field940;

    @ObfuscatedName("cw.df")
    public static long field941;

    @ObfuscatedName("cw.do")
    public static String[] field942;

    @ObfuscatedName("cw.dx")
    public static String[] field943;

    @ObfuscatedName("cw.dh")
    public static String[] field944;

    static {
        new DecimalFormat("##0.00");
        new class135();
        field940 = -1L;
        field941 = -1L;
        field942 = new String[] { "title.jpg" };
        field943 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field944 = new String[] { "logo_speedrunning" };
    }

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oi.am(Low;I)I")
    public static int method6393(class375 arg0) {
        int var1 = field943.length + field942.length;
        String[] var2 = field944;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6412(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("ea.ap(Low;Low;ZII)V")
    public static void method2883(class375 arg0, class375 arg1, boolean arg2, int arg3) {
        if (!Statics.field923) {
            if (arg3 == 0) {
                method6939(arg2);
            } else {
                method2388(arg3);
            }
            class541.method8880();
            byte[] var4 = arg0.method6415("title.jpg", "");
            Statics.field4740 = class31.method3375(var4);
            Statics.field1024 = Statics.field4740.method9033();
            method2151(arg1, client.field500);
            Statics.field909 = class546.method3314(arg1, "titlebox", "");
            Statics.field1905 = class546.method3314(arg1, "titlebutton", "");
            Statics.field926 = class546.method3314(arg1, "titlebutton_large", "");
            Statics.field4840 = class546.method3314(arg1, "play_now_text", "");
            class546.method3314(arg1, "titlebutton_wide42,1", "");
            Statics.field907 = class546.method7095(arg1, "runes", "");
            Statics.field2384 = class546.method7095(arg1, "title_mute", "");
            Statics.field1909 = class546.method3314(arg1, "options_radio_buttons,0", "");
            Statics.field4806 = class546.method3314(arg1, "options_radio_buttons,4", "");
            Statics.field4501 = class546.method3314(arg1, "options_radio_buttons,2", "");
            Statics.field411 = class546.method3314(arg1, "options_radio_buttons,6", "");
            Statics.field169 = Statics.field1909.field5269;
            Statics.field3912 = Statics.field1909.field5270;
            Statics.field3596 = new class98(Statics.field907);
            if (arg2) {
                field904 = "";
                field924 = "";
                field935 = new String[8];
                field925 = 0;
            }
            Statics.field1526 = 0;
            Statics.field1664 = "";
            field914 = true;
            field928 = false;
            if (Statics.field1155.method2445()) {
                class320.method2387(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class332(Statics.field2588, "scape main", "", 255, false));
                class320.method2427(var5, 0, 0, 0, 100, false);
            }
            class320.method8258();
            client.method4010().method6482(false);
            Statics.field923 = true;
            field906 = (Statics.field5134 - 765) / 2;
            field911 = field906 + 202;
            Statics.field4662 = field911 + 180;
            Statics.field4740.method9080(field906, 0);
            Statics.field1024.method9080(field906 + 382, 0);
            Statics.field4406.method8966(field906 + 382 - Statics.field4406.field5269 / 2, 18);
        } else if (arg3 == 4) {
            method2388(4);
        }
    }

    @ObfuscatedName("mh.af(B)V")
    public static void method5429() {
        if (field904 != null && field904.length() > 0) {
            return;
        }
        if (Statics.field1155.method2452() == null) {
            client.field551 = false;
        } else {
            field904 = Statics.field1155.method2452();
            client.field551 = true;
        }
    }

    @ObfuscatedName("be.aj(B)V")
    public static void method887() {
        if (!Statics.field923) {
            return;
        }
        Statics.field909 = null;
        Statics.field1905 = null;
        Statics.field907 = null;
        Statics.field4740 = null;
        Statics.field1024 = null;
        Statics.field4406 = null;
        Statics.field2384 = null;
        Statics.field1909 = null;
        Statics.field4501 = null;
        Statics.field1793 = null;
        Statics.field1552 = null;
        Statics.field805 = null;
        Statics.field3535 = null;
        Statics.field1726 = null;
        Statics.field3596.method2408();
        class320.method2387(0, 100);
        client.method4010().method6482(true);
        Statics.field923 = false;
    }

    @ObfuscatedName("ca.aq(Low;II)V")
    public static void method2151(class375 arg0, int arg1) {
        if ((arg1 & class527.field5164.method34()) != 0) {
            Statics.field4406 = class546.method3314(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class527.field5165.method34()) != 0) {
            Statics.field4406 = class546.method3314(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class527.field5143.method34()) == 0) {
            Statics.field4406 = class546.method3314(arg0, "logo", "");
        } else {
            Statics.field4406 = class546.method3314(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("gd.ar(Lby;Lpv;Lpv;B)V")
    public static void method3353(class35 arg0, class410 arg1, class410 arg2) {
        if (field928) {
            class227 var3 = client.method853();
            while (true) {
                if (!var3.method4051()) {
                    if (class36.field238 != 1 && (Statics.field320 || class36.field238 != 4)) {
                        break;
                    }
                    int var4 = field906 + 280;
                    if (class36.field232 >= var4 && class36.field232 <= var4 + 14 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(0, 0);
                        break;
                    }
                    if (class36.field232 >= var4 + 15 && class36.field232 <= var4 + 80 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(0, 1);
                        break;
                    }
                    int var5 = field906 + 390;
                    if (class36.field232 >= var5 && class36.field232 <= var5 + 14 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(1, 0);
                        break;
                    }
                    if (class36.field232 >= var5 + 15 && class36.field232 <= var5 + 80 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(1, 1);
                        break;
                    }
                    int var6 = field906 + 500;
                    if (class36.field232 >= var6 && class36.field232 <= var6 + 14 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(2, 0);
                        break;
                    }
                    if (class36.field232 >= var6 + 15 && class36.field232 <= var6 + 80 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(2, 1);
                        break;
                    }
                    int var7 = field906 + 610;
                    if (class36.field232 >= var7 && class36.field232 <= var7 + 14 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(3, 0);
                        break;
                    }
                    if (class36.field232 >= var7 + 15 && class36.field232 <= var7 + 80 && class36.field242 >= 4 && class36.field242 <= 18) {
                        class68.method3110(3, 1);
                        break;
                    }
                    if (class36.field232 >= field906 + 708 && class36.field242 >= 4 && class36.field232 <= field906 + 708 + 50 && class36.field242 <= 20) {
                        field928 = false;
                        Statics.field4740.method9080(field906, 0);
                        Statics.field1024.method9080(field906 + 382, 0);
                        Statics.field4406.method8966(field906 + 382 - Statics.field4406.field5269 / 2, 18);
                        break;
                    }
                    if (field937 == -1) {
                        if (field938 > 0 && Statics.field1825 != null && class36.field232 >= 0 && class36.field232 <= Statics.field1825.field5269 && class36.field242 >= Statics.field199 / 2 - 50 && class36.field242 <= Statics.field199 / 2 + 50) {
                            field938--;
                        }
                        if (field938 < field939 && Statics.field934 != null && class36.field232 >= Statics.field5134 - Statics.field934.field5269 - 5 && class36.field232 <= Statics.field5134 && class36.field242 >= Statics.field199 / 2 - 50 && class36.field242 <= Statics.field199 / 2 + 50) {
                            field938++;
                        }
                    } else {
                        class68 var8 = Statics.field820[field937];
                        if (var8.method1786()) {
                            var8.field822 = "beta";
                        }
                        boolean var9 = false;
                        if (client.field500 != var8.field816) {
                            boolean var10 = (client.field500 & class527.field5161.method34()) != 0;
                            boolean var11 = var8.method1786();
                            if (var10 && !var11 || !var10 && var11) {
                                var9 = true;
                            }
                        }
                        method7781(var8);
                        field928 = false;
                        Statics.field4740.method9080(field906, 0);
                        Statics.field1024.method9080(field906 + 382, 0);
                        Statics.field4406.method8966(field906 + 382 - Statics.field4406.field5269 / 2, 18);
                        if (var9) {
                            client.method5115();
                        }
                    }
                    break;
                }
                if (var3.field2394 == 13) {
                    field928 = false;
                    Statics.field4740.method9080(field906, 0);
                    Statics.field1024.method9080(field906 + 382, 0);
                    Statics.field4406.method8966(field906 + 382 - Statics.field4406.field5269 / 2, 18);
                    break;
                }
                if (var3.field2394 == 96) {
                    if (field938 > 0 && Statics.field1825 != null) {
                        field938--;
                    }
                } else if (var3.field2394 == 97 && field938 < field939 && Statics.field934 != null) {
                    field938++;
                }
            }
            return;
        }
        if ((class36.field238 == 1 || !Statics.field320 && class36.field238 == 4) && class36.field232 >= field906 + 765 - 50 && class36.field242 >= 453) {
            Statics.field1155.method2488(!Statics.field1155.method2445());
            if (Statics.field1155.method2445()) {
                class320.method2387(0, 0);
            } else {
                ArrayList var12 = new ArrayList();
                var12.add(new class332(Statics.field2588, "scape main", "", 255, false));
                class320.method2427(var12, 0, 0, 0, 100, false);
            }
            class320.method8258();
        }
        if (client.field508 == 5) {
            return;
        }
        if (field940 == -1L) {
            field940 = Statics.method2852() + 1000L;
        }
        long var13 = Statics.method2852();
        if (client.method94() && field941 == -1L) {
            field941 = var13;
            if (field941 > field940) {
                field940 = field941;
            }
        }
        if (client.field508 != 10 && client.field508 != 11) {
            return;
        }
        if (Statics.field1147 == class390.field4458) {
            if (class36.field238 == 1 || !Statics.field320 && class36.field238 == 4) {
                int var15 = field906 + 5;
                short var16 = 463;
                byte var17 = 100;
                byte var18 = 35;
                if (class36.field232 >= var15 && class36.field232 <= var15 + var17 && class36.field242 >= var16 && class36.field242 <= var16 + var18) {
                    method2262();
                    return;
                }
            }
            if (Statics.field1313 != null) {
                method2262();
            }
        }
        int var19 = class36.field238;
        int var20 = class36.field232;
        int var21 = class36.field242;
        if (var19 == 0) {
            var20 = class36.field231;
            var21 = class36.field239;
        }
        if (!Statics.field320 && var19 == 4) {
            var19 = 1;
        }
        class227 var22 = client.method853();
        if (field918 == 0) {
            boolean var23 = false;
            while (var22.method4051()) {
                if (var22.field2394 == 84) {
                    var23 = true;
                }
            }
            int var24 = Statics.field4662 - 80;
            short var25 = 291;
            if (var19 == 1 && var20 >= var24 - 75 && var20 <= var24 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20) {
                class32.method3975(client.method2283("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var26 = Statics.field4662 + 80;
            if (var19 == 1 && var20 >= var26 - 75 && var20 <= var26 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20 || var23) {
                if ((client.field500 & class527.field5152.method34()) != 0) {
                    field919 = "";
                    field931 = class367.field4267;
                    field921 = class367.field4200;
                    field905 = class367.field4286;
                    method2388(1);
                    if (client.field551 && field904 != null && field904.length() > 0) {
                        field932 = 1;
                    } else {
                        field932 = 0;
                    }
                } else if ((client.field500 & class527.field5137.method34()) != 0) {
                    if ((client.field500 & class527.field5136.method34()) == 0) {
                        field931 = class367.field4205;
                        field921 = class367.field4191;
                        field905 = class367.field4192;
                    } else {
                        field931 = class367.field4196;
                        field921 = class367.field4197;
                        field905 = class367.field4198;
                    }
                    field919 = class367.field4189;
                    method2388(1);
                    if (client.field551 && field904 != null && field904.length() > 0) {
                        field932 = 1;
                    } else {
                        field932 = 0;
                    }
                } else if ((client.field500 & class527.field5136.method34()) == 0) {
                    method6604(false);
                } else {
                    field931 = class367.field4268;
                    field921 = class367.field4194;
                    field905 = class367.field4169;
                    field919 = class367.field4189;
                    method2388(1);
                    if (client.field551 && field904 != null && field904.length() > 0) {
                        field932 = 1;
                    } else {
                        field932 = 0;
                    }
                }
            }
        } else if (field918 == 1) {
            while (true) {
                if (!var22.method4051()) {
                    int var27 = Statics.field4662 - 80;
                    short var28 = 321;
                    if (var19 == 1 && var20 >= var27 - 75 && var20 <= var27 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method6604(false);
                    }
                    int var29 = Statics.field4662 + 80;
                    if (var19 == 1 && var20 >= var29 - 75 && var20 <= var29 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method2388(0);
                    }
                    break;
                }
                if (var22.field2394 == 84) {
                    method6604(false);
                } else if (var22.field2394 == 13) {
                    method2388(0);
                }
            }
        } else if (field918 == 2) {
            short var30 = 201;
            int var140 = var30 + 52;
            if (var19 == 1 && var21 >= var140 - 12 && var21 < var140 + 2) {
                field932 = 0;
            }
            var140 += 15;
            if (var19 == 1 && var21 >= var140 - 12 && var21 < var140 + 2) {
                field932 = 1;
            }
            var140 += 15;
            short var31 = 361;
            if (Statics.field2594 != null) {
                int var32 = Statics.field2594.field4791 / 2;
                if (var19 == 1 && var20 >= Statics.field2594.field4789 - var32 && var20 <= Statics.field2594.field4789 + var32 && var21 >= var31 - 15 && var21 < var31) {
                    switch(field917) {
                        case 1:
                            class32.method3975(class367.field4016, true, false);
                            return;
                        case 2:
                            class32.method3975("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var33 = Statics.field4662 - 80;
            short var34 = 321;
            if (var19 == 1 && var20 >= var33 - 75 && var20 <= var33 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                field904 = field904.trim();
                if (field904.length() == 0) {
                    method3074(class367.field4097, class367.field4098, class367.field4245);
                } else if (field924.length() == 0) {
                    method3074(class367.field4235, class367.field4101, class367.field4102);
                } else {
                    method3074(class367.field4265, class367.field4057, class367.field4082);
                    Statics.method3548(false);
                    Statics.method2960(20);
                }
                return;
            }
            int var35 = field911 + 180 + 80;
            if (var19 == 1 && var20 >= var35 - 75 && var20 <= var35 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                method2388(0);
                field904 = "";
                field924 = "";
                Statics.field1526 = 0;
                Statics.field1664 = "";
                field914 = true;
            }
            int var36 = Statics.field4662 + -117;
            short var37 = 277;
            field929 = var20 >= var36 && var20 < Statics.field169 + var36 && var21 >= var37 && var21 < Statics.field3912 + var37;
            if (var19 == 1 && field929) {
                client.field551 = !client.field551;
                if (!client.field551 && Statics.field1155.method2452() != null) {
                    Statics.field1155.method2503((String) null);
                }
            }
            int var38 = Statics.field4662 + 24;
            short var39 = 277;
            field930 = var20 >= var38 && var20 < Statics.field169 + var38 && var21 >= var39 && var21 < Statics.field3912 + var39;
            if (var19 == 1 && field930) {
                Statics.field1155.method2435(!Statics.field1155.method2518());
                if (!Statics.field1155.method2518()) {
                    field904 = "";
                    Statics.field1155.method2503((String) null);
                    if (client.field551 && field904 != null && field904.length() > 0) {
                        field932 = 1;
                    } else {
                        field932 = 0;
                    }
                }
            }
            label1302: while (true) {
                Transferable var43;
                int var44;
                do {
                    while (true) {
                        label1220: do {
                            while (true) {
                                while (var22.method4051()) {
                                    if (var22.field2394 == 13) {
                                        method2388(0);
                                        field904 = "";
                                        field924 = "";
                                        Statics.field1526 = 0;
                                        Statics.field1664 = "";
                                        field914 = true;
                                    } else {
                                        if (field932 != 0) {
                                            continue label1220;
                                        }
                                        method5700(var22.field2403);
                                        if (var22.field2394 == 85 && field904.length() > 0) {
                                            field904 = field904.substring(0, field904.length() - 1);
                                        }
                                        if (var22.field2394 == 84 || var22.field2394 == 80) {
                                            field932 = 1;
                                        }
                                        char var40 = var22.field2403;
                                        boolean var41 = field922.indexOf(var40) != -1;
                                        if (var41 && field904.length() < 320) {
                                            field904 = field904 + var22.field2403;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field932 != 1);
                        if (var22.field2394 == 85 && field924.length() > 0) {
                            field924 = field924.substring(0, field924.length() - 1);
                        } else if (var22.field2394 == 84 || var22.field2394 == 80) {
                            field932 = 0;
                            if (var22.field2394 == 84) {
                                field904 = field904.trim();
                                if (field904.length() == 0) {
                                    method3074(class367.field4097, class367.field4098, class367.field4245);
                                    return;
                                }
                                if (field924.length() == 0) {
                                    method3074(class367.field4235, class367.field4101, class367.field4102);
                                    return;
                                }
                                method3074(class367.field4265, class367.field4057, class367.field4082);
                                Statics.method3548(false);
                                Statics.method2960(20);
                                return;
                            }
                        }
                        if ((var22.method4053(82) || var22.method4053(87)) && var22.field2394 == 67) {
                            Clipboard var42 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var43 = var42.getContents(Statics.field3067);
                            var44 = 20 - field924.length();
                            break;
                        }
                        char var57 = var22.field2403;
                        boolean var58;
                        if ((var57 < ' ' || var57 >= 127) && (var57 <= 127 || var57 >= 160) && (var57 <= 160 || var57 > 255)) {
                            label1447: {
                                if (var57 != 0) {
                                    char[] var59 = class401.field4492;
                                    for (int var60 = 0; var60 < var59.length; var60++) {
                                        char var61 = var59[var60];
                                        if (var57 == var61) {
                                            var58 = true;
                                            break label1447;
                                        }
                                    }
                                }
                                var58 = false;
                            }
                        } else {
                            var58 = true;
                        }
                        if (var58 && method701(var22.field2403) && field924.length() < 20) {
                            field924 = field924 + var22.field2403;
                        }
                    }
                } while (var44 <= 0);
                try {
                    String var45 = (String) var43.getTransferData(DataFlavor.stringFlavor);
                    int var46 = Math.min(var44, var45.length());
                    int var47 = 0;
                    while (true) {
                        if (var47 >= var46) {
                            field924 = field924 + var45.substring(0, var46);
                            continue label1302;
                        }
                        char var48 = var45.charAt(var47);
                        boolean var49;
                        if ((var48 < ' ' || var48 >= 127) && (var48 <= 127 || var48 >= 160) && (var48 <= 160 || var48 > 255)) {
                            label1450: {
                                if (var48 != 0) {
                                    char[] var50 = class401.field4492;
                                    for (int var51 = 0; var51 < var50.length; var51++) {
                                        char var52 = var50[var51];
                                        if (var48 == var52) {
                                            var49 = true;
                                            break label1450;
                                        }
                                    }
                                }
                                var49 = false;
                            }
                        } else {
                            var49 = true;
                        }
                        if (!var49) {
                            break;
                        }
                        char var53 = var45.charAt(var47);
                        boolean var54 = field922.indexOf(var53) != -1;
                        if (!var54) {
                            break;
                        }
                        var47++;
                    }
                    method2388(3);
                    return;
                } catch (UnsupportedFlavorException var138) {
                } catch (IOException var139) {
                }
            }
        } else if (field918 == 3) {
            int var62 = field911 + 180;
            short var63 = 241;
            class462 var64 = arg1.method7108(25, class367.field4050.length() - 34, class367.field4050, var62, var63);
            if (var19 == 1 && var64.method7738(var20, var21)) {
                class32.method3975(class367.field4285, true, false);
            }
            int var65 = field911 + 180;
            short var66 = 276;
            if (var19 == 1 && var20 >= var65 - 75 && var20 <= var65 + 75 && var21 >= var66 - 20 && var21 <= var66 + 20) {
                method6939(false);
            }
            int var67 = field911 + 180;
            short var68 = 326;
            if (var19 == 1 && var20 >= var67 - 75 && var20 <= var67 + 75 && var21 >= var68 - 20 && var21 <= var68 + 20) {
                class32.method3975(class367.field4016, true, false);
                return;
            }
        } else if (field918 == 4) {
            int var69 = field911 + 180 - 80;
            short var70 = 321;
            if (var19 == 1 && var20 >= var69 - 75 && var20 <= var69 + 75 && var21 >= var70 - 20 && var21 <= var70 + 20) {
                Statics.field1664.trim();
                if (Statics.field1664.length() != 6) {
                    method3074(class367.field4255, class367.field4190, class367.field4018);
                    return;
                }
                Statics.field1526 = Integer.parseInt(Statics.field1664);
                Statics.field1664 = "";
                Statics.method3548(true);
                method3074(class367.field4265, class367.field4057, class367.field4082);
                Statics.method2960(20);
                return;
            }
            if (var19 == 1 && var20 >= field911 + 180 - 9 && var20 <= field911 + 180 + 130 && var21 >= 263 && var21 <= 296) {
                field914 = !field914;
            }
            if (var19 == 1 && var20 >= field911 + 180 - 34 && var20 <= field911 + 180 + 34 && var21 >= 351 && var21 <= 363) {
                class32.method3975(class367.field4016, true, false);
            }
            int var71 = field911 + 180 + 80;
            if (var19 == 1 && var20 >= var71 - 75 && var20 <= var71 + 75 && var21 >= var70 - 20 && var21 <= var70 + 20) {
                method2388(0);
                field904 = "";
                field924 = "";
                Statics.field1526 = 0;
                Statics.field1664 = "";
            }
            while (var22.method4051()) {
                boolean var72 = false;
                for (int var73 = 0; var73 < field908.length(); var73++) {
                    if (var22.field2403 == field908.charAt(var73)) {
                        var72 = true;
                        break;
                    }
                }
                if (var22.field2394 == 13) {
                    method2388(0);
                    field904 = "";
                    field924 = "";
                    Statics.field1526 = 0;
                    Statics.field1664 = "";
                } else {
                    if (var22.field2394 == 85 && Statics.field1664.length() > 0) {
                        Statics.field1664 = Statics.field1664.substring(0, Statics.field1664.length() - 1);
                    }
                    if (var22.field2394 == 84) {
                        Statics.field1664.trim();
                        if (Statics.field1664.length() != 6) {
                            method3074(class367.field4255, class367.field4190, class367.field4018);
                            return;
                        }
                        Statics.field1526 = Integer.parseInt(Statics.field1664);
                        Statics.field1664 = "";
                        Statics.method3548(true);
                        method3074(class367.field4265, class367.field4057, class367.field4082);
                        Statics.method2960(20);
                        return;
                    }
                    if (var72 && Statics.field1664.length() < 6) {
                        Statics.field1664 = Statics.field1664 + var22.field2403;
                    }
                }
            }
        } else if (field918 == 5) {
            int var74 = field911 + 180 - 80;
            short var75 = 321;
            if (var19 == 1 && var20 >= var74 - 75 && var20 <= var74 + 75 && var21 >= var75 - 20 && var21 <= var75 + 20) {
                method5470();
                return;
            }
            int var76 = field911 + 180 + 80;
            if (var19 == 1 && var20 >= var76 - 75 && var20 <= var76 + 75 && var21 >= var75 - 20 && var21 <= var75 + 20) {
                method6604(true);
            }
            short var77 = 361;
            if (Statics.field1487 != null) {
                int var78 = Statics.field1487.field4791 / 2;
                if (var19 == 1 && var20 >= Statics.field1487.field4789 - var78 && var20 <= Statics.field1487.field4789 + var78 && var21 >= var77 - 15 && var21 < var77) {
                    class32.method3975(client.method2283("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var22.method4051()) {
                boolean var79 = false;
                for (int var80 = 0; var80 < field922.length(); var80++) {
                    if (var22.field2403 == field922.charAt(var80)) {
                        var79 = true;
                        break;
                    }
                }
                if (var22.field2394 == 13) {
                    method6604(true);
                } else {
                    if (var22.field2394 == 85 && field904.length() > 0) {
                        field904 = field904.substring(0, field904.length() - 1);
                    }
                    if (var22.field2394 == 84) {
                        method5470();
                        return;
                    }
                    if (var79 && field904.length() < 320) {
                        field904 = field904 + var22.field2403;
                    }
                }
            }
        } else if (field918 == 6) {
            while (true) {
                do {
                    if (!var22.method4051()) {
                        short var81 = 321;
                        if (var19 == 1 && var21 >= var81 - 20 && var21 <= var81 + 20) {
                            method6604(true);
                        }
                        return;
                    }
                } while (var22.field2394 != 84 && var22.field2394 != 13);
                method6604(true);
            }
        } else if (field918 == 7) {
            if (Statics.field4356 && !client.field507) {
                int var82 = Statics.field4662 - 150;
                int var83 = var82 + 240 + 25 + 40;
                short var84 = 231;
                int var85 = var84 + 40;
                if (var19 == 1 && var20 >= var82 && var20 <= var83 && var21 >= var84 && var21 <= var85) {
                    field925 = method2783(var82, var20);
                }
                int var86 = field911 + 180 - 80;
                short var87 = 321;
                if (var19 == 1 && var20 >= var86 - 75 && var20 <= var86 + 75 && var21 >= var87 - 20 && var21 <= var87 + 20) {
                    boolean var90;
                    label1104: {
                        Date var88;
                        try {
                            var88 = method3424();
                        } catch (ParseException var137) {
                            method2273("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var90 = false;
                            break label1104;
                        }
                        if (var88 == null) {
                            var90 = false;
                        } else {
                            boolean var91 = method5438(var88);
                            boolean var92 = method3106(var88);
                            if (var92) {
                                if (var91) {
                                    Statics.field1341 = (int) (var88.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field1341 = 8388607;
                                }
                                var90 = true;
                            } else {
                                method2273("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var90 = false;
                            }
                        }
                    }
                    if (var90) {
                        Statics.method2960(50);
                        return;
                    }
                }
                int var94 = field911 + 180 + 80;
                if (var19 == 1 && var20 >= var94 - 75 && var20 <= var94 + 75 && var21 >= var87 - 20 && var21 <= var87 + 20) {
                    field935 = new String[8];
                    method6604(true);
                }
                while (var22.method4051()) {
                    if (var22.field2394 == 101) {
                        field935[field925] = null;
                    }
                    if (var22.field2394 == 85) {
                        if (field935[field925] == null && field925 > 0) {
                            field925--;
                        }
                        field935[field925] = null;
                    }
                    if (var22.field2403 >= '0' && var22.field2403 <= '9') {
                        field935[field925] = "" + var22.field2403;
                        if (field925 < 7) {
                            field925++;
                        }
                    }
                    if (var22.field2394 == 84) {
                        boolean var97;
                        label1040: {
                            Date var95;
                            try {
                                var95 = method3424();
                            } catch (ParseException var136) {
                                method2273("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var97 = false;
                                break label1040;
                            }
                            if (var95 == null) {
                                var97 = false;
                            } else {
                                boolean var98 = method5438(var95);
                                boolean var99 = method3106(var95);
                                if (var99) {
                                    if (var98) {
                                        Statics.field1341 = (int) (var95.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field1341 = 8388607;
                                    }
                                    var97 = true;
                                } else {
                                    method2273("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var97 = false;
                                }
                            }
                        }
                        if (var97) {
                            Statics.method2960(50);
                        }
                        return;
                    }
                }
            } else {
                int var101 = field911 + 180 - 80;
                short var102 = 321;
                if (var19 == 1 && var20 >= var101 - 75 && var20 <= var101 + 75 && var21 >= var102 - 20 && var21 <= var102 + 20) {
                    class32.method3975(client.method2283("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3074(class367.field4272, class367.field4144, class367.field4207);
                    method2388(6);
                    return;
                }
                int var103 = field911 + 180 + 80;
                if (var19 == 1 && var20 >= var103 - 75 && var20 <= var103 + 75 && var21 >= var102 - 20 && var21 <= var102 + 20) {
                    method6604(true);
                }
            }
        } else if (field918 == 8) {
            int var104 = field911 + 180 - 80;
            short var105 = 321;
            if (var19 == 1 && var20 >= var104 - 75 && var20 <= var104 + 75 && var21 >= var105 - 20 && var21 <= var105 + 20) {
                class32.method3975("https://www.jagex.com/terms/privacy", true, false);
                method3074(class367.field4272, class367.field4144, class367.field4207);
                method2388(6);
                return;
            }
            int var106 = field911 + 180 + 80;
            if (var19 == 1 && var20 >= var106 - 75 && var20 <= var106 + 75 && var21 >= var105 - 20 && var21 <= var105 + 20) {
                method6604(true);
            }
        } else if (field918 == 9) {
            int var107 = field911 + 180;
            short var108 = 311;
            if (var22.field2394 == 84 || var22.field2394 == 13 || var19 == 1 && var20 >= var107 - 75 && var20 <= var107 + 75 && var21 >= var108 - 20 && var21 <= var108 + 20) {
                method6939(false);
            }
        } else if (field918 == 10) {
            int var109 = field911 + 180;
            short var110 = 209;
            if (var22.field2394 == 84 || var19 == 1 && var20 >= var109 - 109 && var20 <= var109 + 109 && var21 >= var110 && var21 <= var110 + 68) {
                method3074(class367.field4265, class367.field4057, class367.field4082);
                client.field627 = class536.field5234;
                Statics.method3548(false);
                Statics.method2960(20);
            }
        } else if (field918 == 12) {
            int var111 = Statics.field4662;
            short var112 = 233;
            class462 var113 = arg2.method7108(0, 30, class367.field4266, var111, var112);
            class462 var114 = arg2.method7108(32, 32, class367.field4266, var111, var112);
            class462 var115 = arg2.method7108(70, 34, class367.field4266, var111, var112);
            int var141 = var112 + 17;
            class462 var116 = arg2.method7108(0, 34, class367.field4199, var111, var141);
            if (var19 == 1) {
                if (var113.method7738(var20, var21)) {
                    class32.method3975("https://www.jagex.com/terms", true, false);
                } else if (var114.method7738(var20, var21)) {
                    class32.method3975("https://www.jagex.com/terms/privacy", true, false);
                } else if (var115.method7738(var20, var21) || var116.method7738(var20, var21)) {
                    class32.method3975("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var117 = Statics.field4662 - 80;
            short var118 = 311;
            if (var19 == 1 && var20 >= var117 - 75 && var20 <= var117 + 75 && var21 >= var118 - 20 && var21 <= var118 + 20) {
                client.method4565();
                method6939(true);
            }
            int var119 = Statics.field4662 + 80;
            if (var19 == 1 && var20 >= var119 - 75 && var20 <= var119 + 75 && var21 >= var118 - 20 && var21 <= var118 + 20) {
                field918 = 13;
            }
        } else if (field918 == 13) {
            int var120 = Statics.field4662;
            short var121 = 321;
            if (var19 == 1 && var20 >= var120 - 75 && var20 <= var120 + 75 && var21 >= var121 - 20 && var21 <= var121 + 20) {
                method6939(true);
            }
        } else if (field918 == 14) {
            String var122 = "";
            switch(field920) {
                case 0:
                    var122 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var122 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var122 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method6604(false);
            }
            int var123 = field911 + 180;
            short var124 = 276;
            if (var19 == 1 && var20 >= var123 - 75 && var20 <= var123 + 75 && var21 >= var124 - 20 && var21 <= var124 + 20) {
                class32.method3975(var122, true, false);
                method3074(class367.field4272, class367.field4144, class367.field4207);
                method2388(6);
                return;
            }
            int var125 = field911 + 180;
            short var126 = 326;
            if (var19 == 1 && var20 >= var125 - 75 && var20 <= var125 + 75 && var21 >= var126 - 20 && var21 <= var126 + 20) {
                method6604(false);
            }
        } else if (field918 == 24) {
            int var127 = field911 + 180;
            short var128 = 301;
            if (var19 == 1 && var20 >= var127 - 75 && var20 <= var127 + 75 && var21 >= var128 - 20 && var21 <= var128 + 20) {
                method6939(false);
            }
        } else if (field918 == 32) {
            int var129 = field911 + 180 - 80;
            short var130 = 321;
            if (var19 == 1 && var20 >= var129 - 75 && var20 <= var129 + 75 && var21 >= var130 - 20 && var21 <= var130 + 20) {
                class32.method3975(client.method2283("secure", true) + "m=dob/set_dob.ws", true, false);
                method3074(class367.field4272, class367.field4144, class367.field4207);
                method2388(6);
                return;
            }
            int var131 = field911 + 180 + 80;
            if (var19 == 1 && var20 >= var131 - 75 && var20 <= var131 + 75 && var21 >= var130 - 20 && var21 <= var130 + 20) {
                method6604(true);
            }
        } else if (field918 == 33) {
            int var132 = field911 + 180;
            short var133 = 276;
            if (var19 == 1 && var20 >= var132 - 75 && var20 <= var132 + 75 && var21 >= var133 - 20 && var21 <= var133 + 20) {
                class32.method3975(class367.field4285, true, false);
            }
            int var134 = field911 + 180;
            short var135 = 326;
            if (var19 == 1 && var20 >= var134 - 75 && var20 <= var134 + 75 && var21 >= var135 - 20 && var21 <= var135 + 20) {
                method6604(true);
            }
        }
    }

    @ObfuscatedName("fy.ag(Ljava/util/Date;B)Z")
    public static boolean method3106(Date arg0) {
        Calendar var1 = Calendar.getInstance();
        var1.set(2, 0);
        var1.set(5, 1);
        var1.set(1, 1900);
        Date var2 = var1.getTime();
        return arg0.after(var2);
    }

    @ObfuscatedName("md.ao(Ljava/util/Date;B)Z")
    public static boolean method5438(Date arg0) {
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

    @ObfuscatedName("dr.ae(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2273(String arg0, String arg1, String arg2) {
        method2388(7);
        method3074(arg0, arg1, arg2);
    }

    @ObfuscatedName("ho.aa(B)Ljava/util/Date;")
    public static Date method3424() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field935;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method2273("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("eg.au(III)I")
    public static int method2783(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("ma.an(CB)Z")
    public static boolean method5700(char arg0) {
        for (int var1 = 0; var1 < field922.length(); var1++) {
            if (arg0 == field922.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bc.ad(CI)Z")
    public static boolean method701(char arg0) {
        return field922.indexOf(arg0) != -1;
    }

    @ObfuscatedName("od.ax(ZI)V")
    public static void method6604(boolean arg0) {
        if (Statics.field3067.method1711() || Statics.field3067.method1292() || Statics.field3067.method1197()) {
            method2388(10);
            return;
        }
        field931 = class367.field4186;
        field921 = class367.field4033;
        field905 = class367.field4188;
        method2388(2);
        if (arg0) {
            field924 = "";
        }
        method5429();
        if (client.field551 && field904 != null && field904.length() > 0) {
            field932 = 1;
        } else {
            field932 = 0;
        }
    }

    @ObfuscatedName("pn.aw(ZB)V")
    public static void method6939(boolean arg0) {
        byte var1 = 0;
        if (!client.method6597()) {
            var1 = 12;
        } else if (Statics.field3067.method1711() || Statics.field3067.method1292() || Statics.field3067.method1197()) {
            var1 = 10;
        }
        method2388(var1);
        if (arg0) {
            field904 = "";
            field924 = "";
            Statics.field1526 = 0;
            Statics.field1664 = "";
        }
        method5429();
        if (client.field551 && field904 != null && field904.length() > 0) {
            field932 = 1;
        } else {
            field932 = 0;
        }
    }

    @ObfuscatedName("mx.az(B)V")
    public static void method5470() {
        field904 = field904.trim();
        if (field904.length() == 0) {
            method3074(class367.field4237, class367.field4238, class367.field4239);
            return;
        }
        long var0 = class73.method3394();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class73.method96(var0, field904);
        }
        switch(var2) {
            case 2:
                method3074(class367.field4240, class367.field4066, class367.field4242);
                method2388(6);
                break;
            case 3:
                method3074(class367.field4204, class367.field4095, class367.field4017);
                break;
            case 4:
                method3074(class367.field4246, class367.field4031, class367.field4103);
                break;
            case 5:
                method3074(class367.field4249, class367.field4250, class367.field4251);
                break;
            case 6:
                method3074(class367.field4252, class367.field4282, class367.field4254);
                break;
            case 7:
                method3074(class367.field4157, class367.field4256, class367.field4257);
        }
    }

    @ObfuscatedName("ha.av(Lpv;Lpv;Lpv;I)V")
    public static void method3818(class410 arg0, class410 arg1, class410 arg2) {
        field906 = (Statics.field5134 - 765) / 2;
        field911 = field906 + 202;
        Statics.field4662 = field911 + 180;
        if (field928) {
            if (Statics.field1793 == null) {
                class373 var3 = Statics.field95;
                class545[] var4;
                if (var3.method6414("sl_back", "")) {
                    int var5 = var3.method6412("sl_back");
                    int var6 = var3.method6413(var5, "");
                    var4 = class546.method3951(var3, var5, var6);
                } else {
                    var4 = null;
                }
                Statics.field1793 = var4;
            }
            if (Statics.field1552 == null) {
                Statics.field1552 = class546.method7095(Statics.field95, "sl_flags", "");
            }
            if (Statics.field805 == null) {
                Statics.field805 = class546.method7095(Statics.field95, "sl_arrows", "");
            }
            if (Statics.field3535 == null) {
                Statics.field3535 = class546.method7095(Statics.field95, "sl_stars", "");
            }
            if (Statics.field1825 == null) {
                Statics.field1825 = class546.method3314(Statics.field95, "leftarrow", "");
            }
            if (Statics.field934 == null) {
                Statics.field934 = class546.method3314(Statics.field95, "rightarrow", "");
            }
            class541.method8884(field906, 23, 765, 480, 0);
            class541.method8888(field906, 0, 125, 23, 12425273, 9135624);
            class541.method8888(field906 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method7112(class367.field4027, field906 + 62, 15, 0, -1);
            if (Statics.field3535 != null) {
                Statics.field3535[1].method8966(field906 + 140, 1);
                arg1.method7109(class367.field4274, field906 + 152, 10, 16777215, -1);
                Statics.field3535[0].method8966(field906 + 140, 12);
                arg1.method7109(class367.field4275, field906 + 152, 21, 16777215, -1);
            }
            if (Statics.field805 != null) {
                int var7 = field906 + 280;
                if (class68.field814[0] == 0 && class68.field813[0] == 0) {
                    Statics.field805[2].method8966(var7, 4);
                } else {
                    Statics.field805[0].method8966(var7, 4);
                }
                if (class68.field814[0] == 0 && class68.field813[0] == 1) {
                    Statics.field805[3].method8966(var7 + 15, 4);
                } else {
                    Statics.field805[1].method8966(var7 + 15, 4);
                }
                arg0.method7109(class367.field4099, var7 + 32, 17, 16777215, -1);
                int var8 = field906 + 390;
                if (class68.field814[0] == 1 && class68.field813[0] == 0) {
                    Statics.field805[2].method8966(var8, 4);
                } else {
                    Statics.field805[0].method8966(var8, 4);
                }
                if (class68.field814[0] == 1 && class68.field813[0] == 1) {
                    Statics.field805[3].method8966(var8 + 15, 4);
                } else {
                    Statics.field805[1].method8966(var8 + 15, 4);
                }
                arg0.method7109(class367.field4277, var8 + 32, 17, 16777215, -1);
                int var9 = field906 + 500;
                if (class68.field814[0] == 2 && class68.field813[0] == 0) {
                    Statics.field805[2].method8966(var9, 4);
                } else {
                    Statics.field805[0].method8966(var9, 4);
                }
                if (class68.field814[0] == 2 && class68.field813[0] == 1) {
                    Statics.field805[3].method8966(var9 + 15, 4);
                } else {
                    Statics.field805[1].method8966(var9 + 15, 4);
                }
                arg0.method7109(class367.field4278, var9 + 32, 17, 16777215, -1);
                int var10 = field906 + 610;
                if (class68.field814[0] == 3 && class68.field813[0] == 0) {
                    Statics.field805[2].method8966(var10, 4);
                } else {
                    Statics.field805[0].method8966(var10, 4);
                }
                if (class68.field814[0] == 3 && class68.field813[0] == 1) {
                    Statics.field805[3].method8966(var10 + 15, 4);
                } else {
                    Statics.field805[1].method8966(var10 + 15, 4);
                }
                arg0.method7109(class367.field4279, var10 + 32, 17, 16777215, -1);
            }
            class541.method8884(field906 + 708, 4, 50, 16, 0);
            arg1.method7112(class367.field4219, field906 + 708 + 25, 16, 16777215, -1);
            field937 = -1;
            if (Statics.field1793 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class68.field811) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class68.field811) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class68.field811) {
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
                int var21 = (class68.field811 + var14 - 1) / var14;
                field939 = var21 - var13;
                if (Statics.field1825 != null && field938 > 0) {
                    Statics.field1825.method8966(8, Statics.field199 / 2 - Statics.field1825.field5270 / 2);
                }
                if (Statics.field934 != null && field938 < field939) {
                    Statics.field934.method8966(Statics.field5134 - Statics.field934.field5269 - 8, Statics.field199 / 2 - Statics.field934.field5270 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field906 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field938;
                for (int var27 = var14 * var26; var27 < class68.field811 && var26 - field938 < var13; var27++) {
                    class68 var28 = Statics.field820[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field817);
                    if (var28.field817 == -1) {
                        var30 = class367.field4280;
                        var29 = false;
                    } else if (var28.field817 > 1980) {
                        var30 = class367.field4281;
                        var29 = false;
                    }
                    class109 var31 = null;
                    int var32 = 0;
                    if (var28.method1763()) {
                        var31 = var28.method1814() ? class109.field1370 : class109.field1363;
                    } else if (var28.method1786()) {
                        var31 = var28.method1814() ? class109.field1365 : class109.field1376;
                    } else if (var28.method1762()) {
                        var32 = 16711680;
                        var31 = var28.method1814() ? class109.field1366 : class109.field1377;
                    } else if (var28.method1764()) {
                        var31 = var28.method1814() ? class109.field1372 : class109.field1371;
                    } else if (var28.method1767()) {
                        var31 = var28.method1814() ? class109.field1383 : class109.field1369;
                    } else if (var28.method1813()) {
                        var31 = var28.method1814() ? class109.field1374 : class109.field1373;
                    } else if (var28.method1778()) {
                        var31 = var28.method1814() ? class109.field1368 : class109.field1375;
                    }
                    if (var31 == null || var31.field1379 >= Statics.field1793.length) {
                        var31 = var28.method1814() ? class109.field1364 : class109.field1378;
                    }
                    if (class36.field231 >= var23 && class36.field239 >= var22 && class36.field231 < var11 + var23 && class36.field239 < var12 + var22 && var29) {
                        field937 = var27;
                        Statics.field1793[var31.field1379].method8999(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field1793[var31.field1379].method9080(var23, var22);
                    }
                    if (Statics.field1552 != null) {
                        Statics.field1552[(var28.method1814() ? 8 : 0) + var28.field812].method8966(var23 + 29, var22);
                    }
                    arg0.method7112(Integer.toString(var28.field807), var23 + 15, var12 / 2 + var22 + 5, var32, -1);
                    arg1.method7112(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
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
                    int var33 = arg1.method7103(Statics.field820[field937].field819) + 6;
                    int var34 = arg1.field4556 + 8;
                    int var35 = class36.field239 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class36.field239 - 25 - var34;
                    }
                    class541.method8884(class36.field231 - var33 / 2, var35, var33, var34, 16777120);
                    class541.method8874(class36.field231 - var33 / 2, var35, var33, var34, 0);
                    arg1.method7112(Statics.field820[field937].field819, class36.field231, arg1.field4556 + var35 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field4740.method9080(field906, 0);
        Statics.field1024.method9080(field906 + 382, 0);
        Statics.field4406.method8966(field906 + 382 - Statics.field4406.field5269 / 2, 18);
        if (client.field508 == 0 || client.field508 == 5) {
            byte var36 = 20;
            arg0.method7112(class367.field4185, field911 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class541.method8874(field911 + 180 - 152, var37, 304, 34, 9179409);
            class541.method8874(field911 + 180 - 151, var37 + 1, 302, 32, 0);
            class541.method8884(field911 + 180 - 150, var37 + 2, field912 * 3, 30, 9179409);
            class541.method8884(field912 * 3 + (field911 + 180 - 150), var37 + 2, 300 - field912 * 3, 30, 0);
            arg0.method7112(field913, field911 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field508 == 20) {
            Statics.field909.method8966(field911 + 180 - Statics.field909.field5269 / 2, 271 - Statics.field909.field5270 / 2);
            short var38 = 201;
            arg0.method7112(field931, field911 + 180, var38, 16776960, 0);
            int var149 = var38 + 15;
            arg0.method7112(field921, field911 + 180, var149, 16776960, 0);
            int var150 = var149 + 15;
            arg0.method7112(field905, field911 + 180, var150, 16776960, 0);
            int var151 = var150 + 15;
            int var152 = var151 + 7;
            if (field918 != 4 && field918 != 10) {
                arg0.method7109(class367.field4212, field911 + 180 - 110, var152, 16777215, 0);
                short var39 = 200;
                String var40 = Statics.field1155.method2518() ? class403.method5432(field904) : field904;
                String var41;
                for (var41 = var40; arg0.method7103(var41) > var39; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method7109(class414.method7167(var41), field911 + 180 - 70, var152, 16777215, 0);
                var149 = var152 + 15;
                String var42;
                for (var42 = class403.method5432(field924); arg0.method7103(var42) > var39; var42 = var42.substring(1)) {
                }
                arg0.method7109(class367.field4241 + var42, field911 + 180 - 108, var149, 16777215, 0);
                var149 += 15;
            }
        }
        if (client.field508 == 10 || client.field508 == 11 || client.field508 == 50) {
            Statics.field909.method8966(field911, 171);
            if (field918 == 0) {
                short var43 = 251;
                arg0.method7112(class367.field4215, field911 + 180, var43, 16776960, 0);
                int var153 = var43 + 30;
                int var44 = field911 + 180 - 80;
                short var45 = 291;
                Statics.field1905.method8966(var44 - 73, var45 - 20);
                arg0.method7113(class367.field4216, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field911 + 180 + 80;
                Statics.field1905.method8966(var46 - 73, var45 - 20);
                arg0.method7113(class367.field4217, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field918 == 1) {
                arg0.method7112(field919, field911 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method7112(field931, field911 + 180, var47, 16777215, 0);
                int var154 = var47 + 15;
                arg0.method7112(field921, field911 + 180, var154, 16777215, 0);
                int var155 = var154 + 15;
                arg0.method7112(field905, field911 + 180, var155, 16777215, 0);
                int var156 = var155 + 15;
                int var48 = field911 + 180 - 80;
                short var49 = 321;
                Statics.field1905.method8966(var48 - 73, var49 - 20);
                arg0.method7112(class367.field3982, var48, var49 + 5, 16777215, 0);
                int var50 = field911 + 180 + 80;
                Statics.field1905.method8966(var50 - 73, var49 - 20);
                arg0.method7112(class367.field4219, var50, var49 + 5, 16777215, 0);
            } else if (field918 == 2) {
                short var51 = 201;
                arg0.method7112(field931, Statics.field4662, var51, 16776960, 0);
                int var157 = var51 + 15;
                arg0.method7112(field921, Statics.field4662, var157, 16776960, 0);
                int var158 = var157 + 15;
                arg0.method7112(field905, Statics.field4662, var158, 16776960, 0);
                int var159 = var158 + 15;
                int var160 = var159 + 7;
                arg0.method7109(class367.field4212, Statics.field4662 - 110, var160, 16777215, 0);
                short var52 = 200;
                String var53 = Statics.field1155.method2518() ? class403.method5432(field904) : field904;
                String var54;
                for (var54 = var53; arg0.method7103(var54) > var52; var54 = var54.substring(1)) {
                }
                arg0.method7109(class414.method7167(var54) + (field932 == 0 & client.field677 % 40 < 20 ? class102.method3860(16776960) + class102.field1311 : ""), Statics.field4662 - 70, var160, 16777215, 0);
                var157 = var160 + 15;
                String var55;
                for (var55 = class403.method5432(field924); arg0.method7103(var55) > var52; var55 = var55.substring(1)) {
                }
                arg0.method7109(class367.field4241 + var55 + (field932 == 1 & client.field677 % 40 < 20 ? class102.method3860(16776960) + class102.field1311 : ""), Statics.field4662 - 108, var157, 16777215, 0);
                var157 += 15;
                short var56 = 277;
                int var57 = Statics.field4662 + -117;
                boolean var58 = client.field551;
                boolean var59 = field929;
                class544 var60 = var58 ? (var59 ? Statics.field411 : Statics.field4501) : (var59 ? Statics.field4806 : Statics.field1909);
                var60.method8966(var57, var56);
                int var62 = var60.field5269 + 5 + var57;
                arg1.method7109(class367.field4220, var62, var56 + 13, 16776960, 0);
                int var63 = Statics.field4662 + 24;
                boolean var64 = Statics.field1155.method2518();
                boolean var65 = field930;
                class544 var66 = var64 ? (var65 ? Statics.field411 : Statics.field4501) : (var65 ? Statics.field4806 : Statics.field1909);
                var66.method8966(var63, var56);
                int var68 = var66.field5269 + 5 + var63;
                arg1.method7109(class367.field4148, var68, var56 + 13, 16776960, 0);
                int var161 = var56 + 15;
                int var69 = Statics.field4662 - 80;
                short var70 = 321;
                Statics.field1905.method8966(var69 - 73, var70 - 20);
                arg0.method7112(class367.field4218, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field4662 + 80;
                Statics.field1905.method8966(var71 - 73, var70 - 20);
                arg0.method7112(class367.field4219, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                switch(field917) {
                    case 2:
                        Statics.field1636 = class367.field4096;
                        break;
                    default:
                        Statics.field1636 = class367.field4081;
                }
                Statics.field2594 = new class462(Statics.field4662, var72, arg1.method7103(Statics.field1636), 11);
                Statics.field1487 = new class462(Statics.field4662, var72, arg1.method7103(class367.field4232), 11);
                arg1.method7112(Statics.field1636, Statics.field4662, var72, 16777215, 0);
            } else if (field918 == 3) {
                short var73 = 201;
                arg0.method7112(class367.field4222, field911 + 180, var73, 16776960, 0);
                int var162 = var73 + 20;
                arg1.method7112(class367.field4106, field911 + 180, var162, 16776960, 0);
                int var163 = var162 + 20;
                arg1.method7112(class367.field4050, field911 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                int var74 = field911 + 180;
                short var75 = 276;
                Statics.field1905.method8966(var74 - 73, var75 - 20);
                arg2.method7112(class367.field3984, var74, var75 + 5, 16777215, 0);
                int var76 = field911 + 180;
                short var77 = 326;
                Statics.field1905.method8966(var76 - 73, var77 - 20);
                arg2.method7112(class367.field4226, var76, var77 + 5, 16777215, 0);
            } else if (field918 == 4) {
                arg0.method7112(class367.field4202, field911 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method7112(field931, field911 + 180, var78, 16777215, 0);
                int var165 = var78 + 15;
                arg0.method7112(field921, field911 + 180, var165, 16777215, 0);
                int var166 = var165 + 15;
                arg0.method7112(field905, field911 + 180, var166, 16777215, 0);
                int var167 = var166 + 15;
                arg0.method7109(class367.field4214 + class403.method5432(Statics.field1664) + (client.field677 % 40 < 20 ? class102.method3860(16776960) + class102.field1311 : ""), field911 + 180 - 108, var167, 16777215, 0);
                int var168 = var167 - 8;
                arg0.method7109(class367.field3985, field911 + 180 - 9, var168, 16776960, 0);
                int var169 = var168 + 15;
                arg0.method7109(class367.field3986, field911 + 180 - 9, var169, 16776960, 0);
                int var79 = field911 + 180 - 9 + arg0.method7103(class367.field3986) + 15;
                int var80 = var169 - arg0.field4556;
                class544 var81;
                if (field914) {
                    var81 = Statics.field4501;
                } else {
                    var81 = Statics.field1909;
                }
                var81.method8966(var79, var80);
                var165 = var169 + 15;
                int var82 = field911 + 180 - 80;
                short var83 = 321;
                Statics.field1905.method8966(var82 - 73, var83 - 20);
                arg0.method7112(class367.field3982, var82, var83 + 5, 16777215, 0);
                int var84 = field911 + 180 + 80;
                Statics.field1905.method8966(var84 - 73, var83 - 20);
                arg0.method7112(class367.field4219, var84, var83 + 5, 16777215, 0);
                arg1.method7112(class367.field4081, field911 + 180, var83 + 36, 16777215, 0);
            } else if (field918 == 5) {
                arg0.method7112(class367.field4227, field911 + 180, 201, 16776960, 0);
                short var85 = 221;
                arg2.method7112(field931, field911 + 180, var85, 16776960, 0);
                int var170 = var85 + 15;
                arg2.method7112(field921, field911 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg2.method7112(field905, field911 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var173 = var172 + 14;
                arg0.method7109(class367.field4228, field911 + 180 - 145, var173, 16777215, 0);
                short var86 = 174;
                String var87 = Statics.field1155.method2518() ? class403.method5432(field904) : field904;
                String var88;
                for (var88 = var87; arg0.method7103(var88) > var86; var88 = var88.substring(1)) {
                }
                arg0.method7109(class414.method7167(var88) + (client.field677 % 40 < 20 ? class102.method3860(16776960) + class102.field1311 : ""), field911 + 180 - 34, var173, 16777215, 0);
                var170 = var173 + 15;
                int var89 = field911 + 180 - 80;
                short var90 = 321;
                Statics.field1905.method8966(var89 - 73, var90 - 20);
                arg0.method7112(class367.field4229, var89, var90 + 5, 16777215, 0);
                int var91 = field911 + 180 + 80;
                Statics.field1905.method8966(var91 - 73, var90 - 20);
                arg0.method7112(class367.field4011, var91, var90 + 5, 16777215, 0);
                short var92 = 356;
                arg1.method7112(class367.field4232, Statics.field4662, var92, 268435455, 0);
            } else if (field918 == 6) {
                short var93 = 201;
                arg0.method7112(field931, field911 + 180, var93, 16776960, 0);
                int var174 = var93 + 15;
                arg0.method7112(field921, field911 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                arg0.method7112(field905, field911 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                int var94 = field911 + 180;
                short var95 = 321;
                Statics.field1905.method8966(var94 - 73, var95 - 20);
                arg0.method7112(class367.field4011, var94, var95 + 5, 16777215, 0);
            } else if (field918 == 7) {
                if (Statics.field4356 && !client.field507) {
                    short var96 = 201;
                    arg0.method7112(field931, Statics.field4662, var96, 16776960, 0);
                    int var177 = var96 + 15;
                    arg0.method7112(field921, Statics.field4662, var177, 16776960, 0);
                    int var178 = var177 + 15;
                    arg0.method7112(field905, Statics.field4662, var178, 16776960, 0);
                    int var97 = Statics.field4662 - 150;
                    int var179 = var178 + 10;
                    for (int var98 = 0; var98 < 8; var98++) {
                        Statics.field1905.method8968(var97, var179, 30, 40);
                        boolean var99 = field925 == var98 & client.field677 % 40 < 20;
                        arg0.method7109((field935[var98] == null ? "" : field935[var98]) + (var99 ? class102.method3860(16776960) + class102.field1311 : ""), var97 + 10, var179 + 27, 16777215, 0);
                        if (var98 == 1 || var98 == 3) {
                            var97 += 50;
                            arg0.method7109(class414.method7167("/"), var97 - 13, var179 + 27, 16777215, 0);
                        } else {
                            var97 += 35;
                        }
                    }
                    int var100 = Statics.field4662 - 80;
                    short var101 = 321;
                    Statics.field1905.method8966(var100 - 73, var101 - 20);
                    arg0.method7112("Submit", var100, var101 + 5, 16777215, 0);
                    int var102 = Statics.field4662 + 80;
                    Statics.field1905.method8966(var102 - 73, var101 - 20);
                    arg0.method7112(class367.field4219, var102, var101 + 5, 16777215, 0);
                } else {
                    short var103 = 216;
                    arg0.method7112(class367.field4258, field911 + 180, var103, 16776960, 0);
                    int var180 = var103 + 15;
                    arg2.method7112(class367.field4259, field911 + 180, var180, 16776960, 0);
                    int var181 = var180 + 15;
                    arg2.method7112(class367.field4260, field911 + 180, var181, 16776960, 0);
                    int var182 = var181 + 15;
                    int var104 = field911 + 180 - 80;
                    short var105 = 321;
                    Statics.field1905.method8966(var104 - 73, var105 - 20);
                    arg0.method7112(class367.field4261, var104, var105 + 5, 16777215, 0);
                    int var106 = field911 + 180 + 80;
                    Statics.field1905.method8966(var106 - 73, var105 - 20);
                    arg0.method7112(class367.field4011, var106, var105 + 5, 16777215, 0);
                }
            } else if (field918 == 8) {
                short var107 = 216;
                arg0.method7112(class367.field4115, field911 + 180, var107, 16776960, 0);
                int var183 = var107 + 15;
                arg2.method7112(class367.field4116, field911 + 180, var183, 16776960, 0);
                int var184 = var183 + 15;
                arg2.method7112(class367.field4000, field911 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                int var108 = field911 + 180 - 80;
                short var109 = 321;
                Statics.field1905.method8966(var108 - 73, var109 - 20);
                arg0.method7112(class367.field4178, var108, var109 + 5, 16777215, 0);
                int var110 = field911 + 180 + 80;
                Statics.field1905.method8966(var110 - 73, var109 - 20);
                arg0.method7112(class367.field4011, var110, var109 + 5, 16777215, 0);
            } else if (field918 == 9) {
                short var111 = 221;
                arg0.method7112(field931, field911 + 180, var111, 16776960, 0);
                int var186 = var111 + 25;
                arg0.method7112(field921, field911 + 180, var186, 16776960, 0);
                int var187 = var186 + 25;
                arg0.method7112(field905, field911 + 180, var187, 16776960, 0);
                int var112 = field911 + 180;
                short var113 = 311;
                Statics.field1905.method8966(var112 - 73, var113 - 20);
                arg0.method7112(class367.field3984, var112, var113 + 5, 16777215, 0);
            } else if (field918 == 10) {
                int var114 = field911 + 180;
                short var115 = 209;
                arg0.method7112(class367.field4215, field911 + 180, var115, 16776960, 0);
                int var188 = var115 + 20;
                Statics.field926.method8966(var114 - 109, var188);
                if (field927.isEmpty()) {
                    Statics.field4840.method8966(var114 - 48, var188 + 18);
                } else {
                    Statics.field4840.method8966(var114 - 48, var188 + 5);
                    arg0.method7112(field927, var114, var188 + 68 - 15, 16776960, 0);
                }
            } else if (field918 == 12) {
                int var116 = Statics.field4662;
                short var117 = 216;
                arg2.method7112(class367.field4112, var116, var117, 16777215, 0);
                int var189 = var117 + 17;
                arg2.method7112(class367.field4266, var116, var189, 16777215, 0);
                int var190 = var189 + 17;
                arg2.method7112(class367.field4199, var116, var190, 16777215, 0);
                int var191 = var190 + 17;
                arg2.method7112(class367.field4038, var116, var191, 16777215, 0);
                int var118 = Statics.field4662 - 80;
                short var119 = 311;
                Statics.field1905.method8966(var118 - 73, var119 - 20);
                arg0.method7112(class367.field4271, var118, var119 + 5, 16777215, 0);
                int var120 = Statics.field4662 + 80;
                Statics.field1905.method8966(var120 - 73, var119 - 20);
                arg0.method7112(class367.field4276, var120, var119 + 5, 16777215, 0);
            } else if (field918 == 13) {
                short var121 = 231;
                arg2.method7112(class367.field4139, field911 + 180, var121, 16777215, 0);
                int var192 = var121 + 20;
                arg2.method7112(class367.field4270, field911 + 180, var192, 16777215, 0);
                int var122 = field911 + 180;
                short var123 = 311;
                Statics.field1905.method8966(var122 - 73, var123 - 20);
                arg0.method7112(class367.field4011, var122, var123 + 5, 16777215, 0);
            } else if (field918 == 14) {
                short var124 = 201;
                String var125 = "";
                String var126 = "";
                String var127 = "";
                switch(field920) {
                    case 0:
                        var125 = class367.field4248;
                        var126 = class367.field4032;
                        var127 = class367.field4059;
                        break;
                    case 1:
                        var125 = class367.field4070;
                        var126 = class367.field4071;
                        var127 = class367.field4072;
                        break;
                    case 2:
                        var125 = class367.field4210;
                        var126 = class367.field4107;
                        var127 = class367.field4108;
                        break;
                    default:
                        method6604(false);
                }
                arg0.method7112(var125, field911 + 180, var124, 16776960, 0);
                int var193 = var124 + 20;
                arg0.method7112(var126, field911 + 180, var193, 16776960, 0);
                int var194 = var193 + 20;
                arg0.method7112(var127, field911 + 180, var194, 16776960, 0);
                int var128 = field911 + 180;
                short var129 = 276;
                Statics.field1905.method8966(var128 - 73, var129 - 20);
                if (field920 == 1) {
                    arg0.method7112(class367.field4015, var128, var129 + 5, 16777215, 0);
                } else {
                    arg0.method7112(class367.field4014, var128, var129 + 5, 16777215, 0);
                }
                int var130 = field911 + 180;
                short var131 = 326;
                Statics.field1905.method8966(var130 - 73, var131 - 20);
                arg0.method7112(class367.field4011, var130, var131 + 5, 16777215, 0);
            } else if (field918 == 24) {
                short var132 = 221;
                arg0.method7112(field931, field911 + 180, var132, 16777215, 0);
                int var195 = var132 + 15;
                arg0.method7112(field921, field911 + 180, var195, 16777215, 0);
                int var196 = var195 + 15;
                arg0.method7112(field905, field911 + 180, var196, 16777215, 0);
                int var197 = var196 + 15;
                int var133 = field911 + 180;
                short var134 = 301;
                Statics.field1905.method8966(var133 - 73, var134 - 20);
                arg0.method7112(class367.field3980, var133, var134 + 5, 16777215, 0);
            } else if (field918 == 32) {
                short var135 = 216;
                arg0.method7112(class367.field4258, field911 + 180, var135, 16776960, 0);
                int var198 = var135 + 15;
                arg2.method7112(class367.field4259, field911 + 180, var198, 16776960, 0);
                int var199 = var198 + 15;
                arg2.method7112(class367.field4260, field911 + 180, var199, 16776960, 0);
                int var200 = var199 + 15;
                int var136 = field911 + 180 - 80;
                short var137 = 321;
                Statics.field1905.method8966(var136 - 73, var137 - 20);
                arg0.method7112(class367.field4261, var136, var137 + 5, 16777215, 0);
                int var138 = field911 + 180 + 80;
                Statics.field1905.method8966(var138 - 73, var137 - 20);
                arg0.method7112(class367.field4011, var138, var137 + 5, 16777215, 0);
            } else if (field918 == 33) {
                short var139 = 201;
                arg0.method7112(field931, field911 + 180, var139, 16776960, 0);
                int var201 = var139 + 20;
                arg1.method7112(field921, field911 + 180, var201, 16776960, 0);
                int var202 = var201 + 20;
                arg1.method7112(field905, field911 + 180, var202, 16776960, 0);
                int var203 = var202 + 15;
                int var140 = field911 + 180;
                short var141 = 276;
                Statics.field1905.method8966(var140 - 73, var141 - 20);
                arg2.method7112(class367.field4284, var140, var141 + 5, 16777215, 0);
                int var142 = field911 + 180;
                short var143 = 326;
                Statics.field1905.method8966(var142 - 73, var143 - 20);
                arg2.method7112(class367.field4011, var142, var143 + 5, 16777215, 0);
            }
        }
        if (client.field508 >= 10) {
            int[] var144 = new int[4];
            class541.method8937(var144);
            class541.method8876(field906, 0, field906 + 765, Statics.field199);
            Statics.field3596.method2407(field906 - 22, client.field677);
            Statics.field3596.method2407(field906 + 765 + 22 - 128, client.field677);
            class541.method8879(var144);
        }
        Statics.field2384[Statics.field1155.method2445() ? 1 : 0].method8966(field906 + 765 - 40, 463);
        if (client.field508 <= 5 || Statics.field1147 != class390.field4458) {
            return;
        }
        if (Statics.field1726 == null) {
            Statics.field1726 = class546.method3314(Statics.field95, "sl_button", "");
            return;
        }
        int var145 = field906 + 5;
        short var146 = 463;
        byte var147 = 100;
        byte var148 = 35;
        Statics.field1726.method8966(var145, var146);
        arg0.method7112(class367.field4155 + " " + client.field499, var147 / 2 + var145, var148 / 2 + var146 - 2, 16777215, 0);
        if (Statics.field1313 == null) {
            arg1.method7112(class367.field4091, var147 / 2 + var145, var148 / 2 + var146 + 12, 16777215, 0);
        } else {
            arg1.method7112(class367.field4170, var147 / 2 + var145, var148 / 2 + var146 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("fo.ak(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3074(String arg0, String arg1, String arg2) {
        field931 = arg0;
        field921 = arg1;
        field905 = arg2;
    }

    @ObfuscatedName("ro.ay(Lch;I)V")
    public static void method7781(class68 arg0) {
        if (arg0.method1814() != client.field680) {
            client.field680 = arg0.method1814();
            boolean var1 = arg0.method1814();
            if (Statics.field5062 != var1) {
                class203.field2149.method5403();
                class203.field2205.method5403();
                class203.field2151.method5403();
                Statics.field5062 = var1;
            }
        }
        if (client.field500 != arg0.field816) {
            class373 var2 = Statics.field95;
            int var3 = arg0.field816;
            if ((var3 & class527.field5164.method34()) != 0) {
                Statics.field4406 = class546.method3314(var2, "logo_deadman_mode", "");
            } else if ((var3 & class527.field5165.method34()) != 0) {
                Statics.field4406 = class546.method3314(var2, "logo_seasonal_mode", "");
            } else if ((var3 & class527.field5143.method34()) == 0) {
                Statics.field4406 = class546.method3314(var2, "logo", "");
            } else {
                Statics.field4406 = class546.method3314(var2, "logo_speedrunning", "");
            }
        }
        Statics.field1807 = arg0.field818;
        client.field499 = arg0.field807;
        client.field500 = arg0.field816;
        Statics.field2677 = arg0.field822;
        Statics.field1029 = client.field638 == 0 ? 43594 : arg0.field807 + 40000;
        Statics.field60 = client.field638 == 0 ? 443 : arg0.field807 + 50000;
        Statics.field491 = Statics.field1029;
    }

    @ObfuscatedName("da.as(I)V")
    public static void method2262() {
        if (class68.method5125()) {
            field928 = true;
            field938 = 0;
            field939 = 0;
        }
    }

    @ObfuscatedName("bg.ab(B)V")
    public static void method429() {
        method2388(24);
        method3074(class367.field4149, class367.field4247, class367.field4174);
    }

    @ObfuscatedName("ja.ah(S)V")
    public static void method4585() {
        method2388(24);
        method3074(class367.field4209, class367.field4056, class367.field4211);
    }

    @ObfuscatedName("df.ai(II)V")
    public static void method2388(int arg0) {
        if (field918 != arg0) {
            field918 = arg0;
        }
    }
}
