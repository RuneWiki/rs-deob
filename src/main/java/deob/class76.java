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

@ObfuscatedName("cx")
public class class76 {

    @ObfuscatedName("cx.av")
    public static int field920 = 0;

    @ObfuscatedName("cx.aq")
    public static int field925 = field920 + 202;

    @ObfuscatedName("cx.ay")
    public static int field956 = 10;

    @ObfuscatedName("cx.al")
    public static String field923 = "";

    @ObfuscatedName("cx.bz")
    public static int field926 = -1;

    @ObfuscatedName("cx.bu")
    public static int field930 = 1;

    @ObfuscatedName("cx.cs")
    public static int field951 = 0;

    @ObfuscatedName("cx.cu")
    public static String field932 = "";

    @ObfuscatedName("cx.ca")
    public static String field933 = "";

    @ObfuscatedName("cx.cf")
    public static String field952 = "";

    @ObfuscatedName("cx.cw")
    public static String field935 = "";

    @ObfuscatedName("cx.ch")
    public static String field941 = "";

    @ObfuscatedName("cx.cp")
    public static String field937 = "";

    @ObfuscatedName("cx.cd")
    public static int field936 = 0;

    @ObfuscatedName("cx.cv")
    public static String[] field939 = new String[8];

    @ObfuscatedName("cx.cb")
    public static String field940 = "";

    @ObfuscatedName("cx.cn")
    public static boolean field948 = false;

    @ObfuscatedName("cx.ct")
    public static boolean field942 = false;

    @ObfuscatedName("cx.cz")
    public static boolean field943 = true;

    @ObfuscatedName("cx.dd")
    public static int field929 = 0;

    @ObfuscatedName("cx.dl")
    public static String field945 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cx.dm")
    public static String field946 = "1234567890";

    @ObfuscatedName("cx.dt")
    public static boolean field947 = false;

    @ObfuscatedName("cx.dq")
    public static int field955 = -1;

    @ObfuscatedName("cx.dh")
    public static int field949 = 0;

    @ObfuscatedName("cx.dp")
    public static int field927 = 0;

    @ObfuscatedName("cx.di")
    public static long field950;

    @ObfuscatedName("cx.dj")
    public static long field931;

    @ObfuscatedName("cx.dk")
    public static String[] field953;

    @ObfuscatedName("cx.dy")
    public static String[] field954;

    @ObfuscatedName("cx.dg")
    public static String[] field934;

    static {
        new DecimalFormat("##0.00");
        new class133();
        field950 = -1L;
        field931 = -1L;
        field953 = new String[] { "title.jpg" };
        field954 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field934 = new String[] { "logo_speedrunning" };
    }

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ko.at(Lnq;Lnq;S)I")
    public static int method5082(class357 arg0, class357 arg1) {
        int var2 = 0;
        String[] var3 = field953;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method6101(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field954;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method6101(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field934;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method6097(var11) != -1 && arg1.method6101(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("hw.an(Lnq;Lnq;ZIB)V")
    public static void method3364(class357 arg0, class357 arg1, boolean arg2, int arg3) {
        if (!Statics.field919) {
            if (arg3 == 0) {
                method3089(arg2);
            } else {
                Statics.method6605(arg3);
            }
            class511.method8464();
            byte[] var4 = arg0.method6100("title.jpg", "");
            Statics.field416 = Statics.method1943(var4);
            Statics.field944 = Statics.field416.method8581();
            int var5 = client.field505;
            if ((var5 & 0x20000000) != 0) {
                Statics.field68 = class516.method4989(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) != 0) {
                Statics.field68 = class516.method4989(arg1, "logo_seasonal_mode", "");
            } else if ((var5 & 0x100) == 0) {
                Statics.field68 = class516.method4989(arg1, "logo", "");
            } else {
                Statics.field68 = class516.method4989(arg1, "logo_speedrunning", "");
            }
            Statics.field4940 = class516.method4989(arg1, "titlebox", "");
            Statics.field922 = class516.method4989(arg1, "titlebutton", "");
            Statics.field2111 = class516.method4989(arg1, "titlebutton_large", "");
            Statics.field1417 = class516.method4989(arg1, "play_now_text", "");
            class516.method4989(arg1, "titlebutton_wide42,1", "");
            Statics.field921 = class516.method4990(arg1, "runes", "");
            Statics.field3509 = class516.method4990(arg1, "title_mute", "");
            Statics.field1323 = class516.method4989(arg1, "options_radio_buttons,0", "");
            Statics.field1009 = class516.method4989(arg1, "options_radio_buttons,4", "");
            Statics.field1857 = class516.method4989(arg1, "options_radio_buttons,2", "");
            Statics.field1291 = class516.method4989(arg1, "options_radio_buttons,6", "");
            Statics.field2859 = Statics.field1323.field5108;
            Statics.field444 = Statics.field1323.field5109;
            Statics.field2681 = new class97(Statics.field921);
            if (arg2) {
                field941 = "";
                field937 = "";
                field939 = new String[8];
                field936 = 0;
            }
            Statics.field3522 = 0;
            Statics.field315 = "";
            field943 = true;
            field947 = false;
            if (Statics.field48.method2319()) {
                class305.field3390 = 1;
                Statics.field1437 = null;
                Statics.field2103 = -1;
                Statics.field3395 = -1;
                Statics.field3385 = 0;
                Statics.field1566 = false;
                Statics.field1735 = 2;
            } else {
                class305.method5149(2, Statics.field255, "scape main", "", 255, false);
            }
            if (Statics.field4271 != null) {
                try {
                    class501 var6 = new class501(4);
                    var6.method8113(3);
                    var6.method8115(0);
                    Statics.field4271.method7262(var6.field5016, 0, 4);
                } catch (IOException var10) {
                    try {
                        Statics.field4271.method7263();
                    } catch (Exception var9) {
                    }
                    class358.field4286++;
                    Statics.field4271 = null;
                }
            }
            Statics.field919 = true;
            field920 = (Statics.field4720 - 765) / 2;
            field925 = field920 + 202;
            Statics.field4961 = field925 + 180;
            Statics.field416.method8591(field920, 0);
            Statics.field944.method8591(field920 + 382, 0);
            Statics.field68.method8564(field920 + 382 - Statics.field68.field5108 / 2, 18);
        } else if (arg3 == 4) {
            Statics.method6605(4);
        }
    }

    @ObfuscatedName("eb.av(B)Ljava/lang/String;")
    public static String method2735() {
        String var2;
        if (Statics.field48.method2354()) {
            String var0 = field941;
            String var1 = class385.method6206('*', var0.length());
            var2 = var1;
        } else {
            var2 = field941;
        }
        return var2;
    }

    @ObfuscatedName("ez.as(B)V")
    public static void method2630() {
        if (field941 != null && field941.length() > 0) {
            return;
        }
        if (Statics.field48.method2411() == null) {
            client.field557 = false;
        } else {
            field941 = Statics.field48.method2411();
            client.field557 = true;
        }
    }

    @ObfuscatedName("bx.ax(B)V")
    public static void method662() {
        if (!Statics.field919) {
            return;
        }
        Statics.field4940 = null;
        Statics.field922 = null;
        Statics.field921 = null;
        Statics.field416 = null;
        Statics.field944 = null;
        Statics.field68 = null;
        Statics.field3509 = null;
        Statics.field1323 = null;
        Statics.field1857 = null;
        Statics.field83 = null;
        Statics.field1570 = null;
        Statics.field2 = null;
        Statics.field3836 = null;
        Statics.field98 = null;
        Statics.field2681.method2284();
        class305.field3390 = 1;
        Statics.field1437 = null;
        Statics.field2103 = -1;
        Statics.field3395 = -1;
        Statics.field3385 = 0;
        Statics.field1566 = false;
        Statics.field1735 = 2;
        if (Statics.field4271 != null) {
            try {
                class501 var0 = new class501(4);
                var0.method8113(2);
                var0.method8115(0);
                Statics.field4271.method7262(var0.field5016, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field4271.method7263();
                } catch (Exception var3) {
                }
                class358.field4286++;
                Statics.field4271 = null;
            }
        }
        Statics.field919 = false;
    }

    @ObfuscatedName("ka.ap(I)V")
    public static void method4956() {
        if (client.field557 && field941 != null && field941.length() > 0) {
            field929 = 1;
        } else {
            field929 = 0;
        }
    }

    @ObfuscatedName("rg.ab(Lba;Lph;Lph;I)V")
    public static void method7514(class35 arg0, class392 arg1, class392 arg2) {
        if (field947) {
            method98(arg0);
            return;
        }
        if ((class36.field232 == 1 || !Statics.field3402 && class36.field232 == 4) && class36.field233 >= field920 + 765 - 50 && class36.field234 >= 453) {
            Statics.field48.method2318(!Statics.field48.method2319());
            if (Statics.field48.method2319()) {
                Statics.field3388.method5212();
                class305.field3390 = 1;
                Statics.field1437 = null;
            } else {
                class355 var3 = Statics.field255;
                if (var3.method6099("scape main", "")) {
                    int var4 = var3.method6097("scape main");
                    int var5 = var3.method6098(var4, "");
                    Statics.method6266(var3, var4, var5, 255, false);
                }
            }
        }
        if (client.field514 == 5) {
            return;
        }
        if (field950 == -1L) {
            field950 = class301.method4630() + 1000L;
        }
        long var6 = class301.method4630();
        if (client.method2936() && field931 == -1L) {
            field931 = var6;
            if (field931 > field950) {
                field950 = field931;
            }
        }
        if (client.field514 != 10 && client.field514 != 11) {
            return;
        }
        if (Statics.field4618 == class372.field4341) {
            if (class36.field232 == 1 || !Statics.field3402 && class36.field232 == 4) {
                int var8 = field920 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class36.field233 >= var8 && class36.field233 <= var8 + var10 && class36.field234 >= var9 && class36.field234 <= var9 + var11) {
                    if (class68.method8069()) {
                        field947 = true;
                        field949 = 0;
                        field927 = 0;
                    }
                    return;
                }
            }
            if (Statics.field809 != null && class68.method8069()) {
                field947 = true;
                field949 = 0;
                field927 = 0;
            }
        }
        int var12 = class36.field232;
        int var13 = class36.field233;
        int var14 = class36.field234;
        if (var12 == 0) {
            var13 = class36.field221;
            var14 = class36.field229;
        }
        if (!Statics.field3402 && var12 == 4) {
            var12 = 1;
        }
        class212 var15 = client.method6015();
        if (field951 == 0) {
            boolean var16 = false;
            while (var15.method3790()) {
                if (var15.field2350 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field4961 - 80;
            short var18 = 291;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var18 - 20 && var14 <= var18 + 20) {
                class32.method400(client.method5932("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field4961 + 80;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var18 - 20 && var14 <= var18 + 20 || var16) {
                if ((client.field505 & 0x2000000) != 0) {
                    field932 = "";
                    field933 = class350.field4088;
                    field952 = class350.field4103;
                    field935 = class350.field4104;
                    Statics.method6605(1);
                    method4956();
                } else if ((client.field505 & 0x4) != 0) {
                    if ((client.field505 & 0x400) == 0) {
                        field933 = class350.field4093;
                        field952 = class350.field4094;
                        field935 = class350.field3901;
                    } else {
                        field933 = class350.field4160;
                        field952 = class350.field4100;
                        field935 = class350.field3936;
                    }
                    field932 = class350.field4092;
                    Statics.method6605(1);
                    method4956();
                } else if ((client.field505 & 0x400) == 0) {
                    Statics.method4550(false);
                } else {
                    field933 = class350.field4096;
                    field952 = class350.field4097;
                    field935 = class350.field4098;
                    field932 = class350.field4092;
                    Statics.method6605(1);
                    method4956();
                }
            }
        } else if (field951 == 1) {
            while (true) {
                if (!var15.method3790()) {
                    int var20 = Statics.field4961 - 80;
                    short var21 = 321;
                    if (var12 == 1 && var13 >= var20 - 75 && var13 <= var20 + 75 && var14 >= var21 - 20 && var14 <= var21 + 20) {
                        Statics.method4550(false);
                    }
                    int var22 = Statics.field4961 + 80;
                    if (var12 == 1 && var13 >= var22 - 75 && var13 <= var22 + 75 && var14 >= var21 - 20 && var14 <= var21 + 20) {
                        Statics.method6605(0);
                    }
                    break;
                }
                if (var15.field2350 == 84) {
                    Statics.method4550(false);
                } else if (var15.field2350 == 13) {
                    Statics.method6605(0);
                }
            }
        } else if (field951 == 2) {
            short var23 = 201;
            int var158 = var23 + 52;
            if (var12 == 1 && var14 >= var158 - 12 && var14 < var158 + 2) {
                field929 = 0;
            }
            var158 += 15;
            if (var12 == 1 && var14 >= var158 - 12 && var14 < var158 + 2) {
                field929 = 1;
            }
            var158 += 15;
            short var24 = 361;
            if (Statics.field4573 != null) {
                int var25 = Statics.field4573.field4667 / 2;
                if (var12 == 1 && var13 >= Statics.field4573.field4668 - var25 && var13 <= Statics.field4573.field4668 + var25 && var14 >= var24 - 15 && var14 < var24) {
                    switch(field930) {
                        case 1:
                            method7895(class350.field4051, class350.field4143, class350.field4144);
                            Statics.method6605(5);
                            return;
                        case 2:
                            class32.method400("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field4961 - 80;
            short var27 = 321;
            if (var12 == 1 && var13 >= var26 - 75 && var13 <= var26 + 75 && var14 >= var27 - 20 && var14 <= var27 + 20) {
                field941 = field941.trim();
                if (field941.length() == 0) {
                    method7895(class350.field4139, class350.field3978, class350.field4002);
                    return;
                }
                if (field937.length() == 0) {
                    method7895(class350.field4003, class350.field4007, class350.field4101);
                    return;
                }
                method7895(class350.field4107, class350.field4108, class350.field4030);
                client.method2970(false);
                client.method2711(20);
                return;
            }
            int var28 = field925 + 180 + 80;
            if (var12 == 1 && var13 >= var28 - 75 && var13 <= var28 + 75 && var14 >= var27 - 20 && var14 <= var27 + 20) {
                Statics.method6605(0);
                field941 = "";
                field937 = "";
                Statics.field3522 = 0;
                Statics.field315 = "";
                field943 = true;
            }
            int var29 = Statics.field4961 + -117;
            short var30 = 277;
            field948 = var13 >= var29 && var13 < Statics.field2859 + var29 && var14 >= var30 && var14 < Statics.field444 + var30;
            if (var12 == 1 && field948) {
                client.field557 = !client.field557;
                if (!client.field557 && Statics.field48.method2411() != null) {
                    Statics.field48.method2314((String) null);
                }
            }
            int var31 = Statics.field4961 + 24;
            short var32 = 277;
            field942 = var13 >= var31 && var13 < Statics.field2859 + var31 && var14 >= var32 && var14 < Statics.field444 + var32;
            if (var12 == 1 && field942) {
                Statics.field48.method2406(!Statics.field48.method2354());
                if (!Statics.field48.method2354()) {
                    field941 = "";
                    Statics.field48.method2314((String) null);
                    method4956();
                }
            }
            label1096: while (true) {
                Transferable var38;
                int var39;
                do {
                    while (true) {
                        label1037: do {
                            while (true) {
                                while (var15.method3790()) {
                                    if (var15.field2350 == 13) {
                                        Statics.method6605(0);
                                        field941 = "";
                                        field937 = "";
                                        Statics.field3522 = 0;
                                        Statics.field315 = "";
                                        field943 = true;
                                    } else {
                                        if (field929 != 0) {
                                            continue label1037;
                                        }
                                        char var33 = var15.field2349;
                                        for (int var34 = 0; var34 < field945.length() && var33 != field945.charAt(var34); var34++) {
                                        }
                                        if (var15.field2350 == 85 && field941.length() > 0) {
                                            field941 = field941.substring(0, field941.length() - 1);
                                        }
                                        if (var15.field2350 == 84 || var15.field2350 == 80) {
                                            field929 = 1;
                                        }
                                        char var35 = var15.field2349;
                                        boolean var36 = field945.indexOf(var35) != -1;
                                        if (var36 && field941.length() < 320) {
                                            field941 = field941 + var15.field2349;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field929 != 1);
                        if (var15.field2350 == 85 && field937.length() > 0) {
                            field937 = field937.substring(0, field937.length() - 1);
                        } else if (var15.field2350 == 84 || var15.field2350 == 80) {
                            field929 = 0;
                            if (var15.field2350 == 84) {
                                field941 = field941.trim();
                                if (field941.length() == 0) {
                                    method7895(class350.field4139, class350.field3978, class350.field4002);
                                    return;
                                }
                                if (field937.length() == 0) {
                                    method7895(class350.field4003, class350.field4007, class350.field4101);
                                    return;
                                }
                                method7895(class350.field4107, class350.field4108, class350.field4030);
                                client.method2970(false);
                                client.method2711(20);
                                return;
                            }
                        }
                        if ((var15.method3791(82) || var15.method3791(87)) && var15.field2350 == 67) {
                            Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var38 = var37.getContents(Statics.field3874);
                            var39 = 20 - field937.length();
                            break;
                        }
                        if (class383.method2941(var15.field2349)) {
                            char var52 = var15.field2349;
                            boolean var53 = field945.indexOf(var52) != -1;
                            if (var53 && field937.length() < 20) {
                                field937 = field937 + var15.field2349;
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
                            field937 = field937 + var40.substring(0, var41);
                            continue label1096;
                        }
                        char var43 = var40.charAt(var42);
                        boolean var44;
                        if ((var43 < ' ' || var43 >= 127) && (var43 <= 127 || var43 >= 160) && (var43 <= 160 || var43 > 255)) {
                            label1220: {
                                if (var43 != 0) {
                                    char[] var45 = class383.field4391;
                                    for (int var46 = 0; var46 < var45.length; var46++) {
                                        char var47 = var45[var46];
                                        if (var43 == var47) {
                                            var44 = true;
                                            break label1220;
                                        }
                                    }
                                }
                                var44 = false;
                            }
                        } else {
                            var44 = true;
                        }
                        if (!var44) {
                            break;
                        }
                        char var48 = var40.charAt(var42);
                        boolean var49 = field945.indexOf(var48) != -1;
                        if (!var49) {
                            break;
                        }
                        var42++;
                    }
                    Statics.method6605(3);
                    return;
                } catch (UnsupportedFlavorException var156) {
                } catch (IOException var157) {
                }
            }
        } else if (field951 == 3) {
            int var54 = field925 + 180;
            short var55 = 241;
            class434 var56 = arg1.method6780(25, class350.field3991.length() - 34, class350.field3991, var54, var55);
            if (var12 == 1 && var56.method7331(var13, var14)) {
                class32.method400(class350.field4190, true, false);
            }
            int var57 = field925 + 180;
            short var58 = 276;
            if (var12 == 1 && var13 >= var57 - 75 && var13 <= var57 + 75 && var14 >= var58 - 20 && var14 <= var58 + 20) {
                method3089(false);
            }
            int var59 = field925 + 180;
            short var60 = 326;
            if (var12 == 1 && var13 >= var59 - 75 && var13 <= var59 + 75 && var14 >= var60 - 20 && var14 <= var60 + 20) {
                method7895(class350.field4051, class350.field4143, class350.field4144);
                Statics.method6605(5);
                return;
            }
        } else if (field951 == 4) {
            int var61 = field925 + 180 - 80;
            short var62 = 321;
            if (var12 == 1 && var13 >= var61 - 75 && var13 <= var61 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                Statics.field315.trim();
                if (Statics.field315.length() != 6) {
                    method7895(class350.field3882, class350.field4187, class350.field3921);
                    return;
                }
                Statics.field3522 = Integer.parseInt(Statics.field315);
                Statics.field315 = "";
                client.method2970(true);
                method7895(class350.field4107, class350.field4108, class350.field4030);
                client.method2711(20);
                return;
            }
            if (var12 == 1 && var13 >= field925 + 180 - 9 && var13 <= field925 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field943 = !field943;
            }
            if (var12 == 1 && var13 >= field925 + 180 - 34 && var13 <= field925 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class32.method400(client.method5932("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var63 = field925 + 180 + 80;
            if (var12 == 1 && var13 >= var63 - 75 && var13 <= var63 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                Statics.method6605(0);
                field941 = "";
                field937 = "";
                Statics.field3522 = 0;
                Statics.field315 = "";
            }
            while (var15.method3790()) {
                boolean var64 = false;
                for (int var65 = 0; var65 < field946.length(); var65++) {
                    if (var15.field2349 == field946.charAt(var65)) {
                        var64 = true;
                        break;
                    }
                }
                if (var15.field2350 == 13) {
                    Statics.method6605(0);
                    field941 = "";
                    field937 = "";
                    Statics.field3522 = 0;
                    Statics.field315 = "";
                } else {
                    if (var15.field2350 == 85 && Statics.field315.length() > 0) {
                        Statics.field315 = Statics.field315.substring(0, Statics.field315.length() - 1);
                    }
                    if (var15.field2350 == 84) {
                        Statics.field315.trim();
                        if (Statics.field315.length() != 6) {
                            method7895(class350.field3882, class350.field4187, class350.field3921);
                            return;
                        }
                        Statics.field3522 = Integer.parseInt(Statics.field315);
                        Statics.field315 = "";
                        client.method2970(true);
                        method7895(class350.field4107, class350.field4108, class350.field4030);
                        client.method2711(20);
                        return;
                    }
                    if (var64 && Statics.field315.length() < 6) {
                        Statics.field315 = Statics.field315 + var15.field2349;
                    }
                }
            }
        } else if (field951 == 5) {
            int var66 = field925 + 180 - 80;
            short var67 = 321;
            if (var12 == 1 && var13 >= var66 - 75 && var13 <= var66 + 75 && var14 >= var67 - 20 && var14 <= var67 + 20) {
                method7985();
                return;
            }
            int var68 = field925 + 180 + 80;
            if (var12 == 1 && var13 >= var68 - 75 && var13 <= var68 + 75 && var14 >= var67 - 20 && var14 <= var67 + 20) {
                Statics.method4550(true);
            }
            short var69 = 361;
            if (Statics.field3771 != null) {
                int var70 = Statics.field3771.field4667 / 2;
                if (var12 == 1 && var13 >= Statics.field3771.field4668 - var70 && var13 <= Statics.field3771.field4668 + var70 && var14 >= var69 - 15 && var14 < var69) {
                    class32.method400(client.method5932("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var15.method3790()) {
                boolean var71 = false;
                for (int var72 = 0; var72 < field945.length(); var72++) {
                    if (var15.field2349 == field945.charAt(var72)) {
                        var71 = true;
                        break;
                    }
                }
                if (var15.field2350 == 13) {
                    Statics.method4550(true);
                } else {
                    if (var15.field2350 == 85 && field941.length() > 0) {
                        field941 = field941.substring(0, field941.length() - 1);
                    }
                    if (var15.field2350 == 84) {
                        method7985();
                        return;
                    }
                    if (var71 && field941.length() < 320) {
                        field941 = field941 + var15.field2349;
                    }
                }
            }
        } else if (field951 == 6) {
            while (true) {
                do {
                    if (!var15.method3790()) {
                        short var73 = 321;
                        if (var12 == 1 && var14 >= var73 - 20 && var14 <= var73 + 20) {
                            Statics.method4550(true);
                        }
                        return;
                    }
                } while (var15.field2350 != 84 && var15.field2350 != 13);
                Statics.method4550(true);
            }
        } else if (field951 == 7) {
            if (Statics.field1402 && !client.field804) {
                int var74 = Statics.field4961 - 150;
                int var75 = var74 + 240 + 25 + 40;
                short var76 = 231;
                int var77 = var76 + 40;
                if (var12 == 1 && var13 >= var74 && var13 <= var75 && var14 >= var76 && var14 <= var77) {
                    field936 = method2123(var74, var13);
                }
                int var78 = field925 + 180 - 80;
                short var79 = 321;
                if (var12 == 1 && var13 >= var78 - 75 && var13 <= var78 + 75 && var14 >= var79 - 20 && var14 <= var79 + 20) {
                    boolean var88;
                    label932: {
                        Date var86;
                        try {
                            SimpleDateFormat var80 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var80.setLenient(false);
                            StringBuilder var81 = new StringBuilder();
                            String[] var82 = field939;
                            int var83 = 0;
                            while (true) {
                                Date var85;
                                if (var83 < var82.length) {
                                    String var84 = var82[var83];
                                    if (var84 != null) {
                                        var81.append(var84);
                                        var83++;
                                        continue;
                                    }
                                    Statics.method6605(7);
                                    method7895("Date not valid.", "Please ensure all characters are populated.", "");
                                    var85 = null;
                                } else {
                                    var81.append("12");
                                    var85 = var80.parse(var81.toString());
                                }
                                var86 = var85;
                                break;
                            }
                        } catch (ParseException var155) {
                            Statics.method6605(7);
                            method7895("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var88 = false;
                            break label932;
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
                            Calendar var93 = Calendar.getInstance();
                            var93.set(2, 0);
                            var93.set(5, 1);
                            var93.set(1, 1900);
                            Date var94 = var93.getTime();
                            boolean var96 = var86.after(var94);
                            if (var96) {
                                if (var91) {
                                    Statics.field2851 = (int) (var86.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field2851 = 8388607;
                                }
                                var88 = true;
                            } else {
                                Statics.method6605(7);
                                method7895("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var88 = false;
                            }
                        }
                    }
                    if (var88) {
                        client.method2711(50);
                        return;
                    }
                }
                int var99 = field925 + 180 + 80;
                if (var12 == 1 && var13 >= var99 - 75 && var13 <= var99 + 75 && var14 >= var79 - 20 && var14 <= var79 + 20) {
                    field939 = new String[8];
                    Statics.method4550(true);
                }
                while (var15.method3790()) {
                    if (var15.field2350 == 101) {
                        field939[field936] = null;
                    }
                    if (var15.field2350 == 85) {
                        if (field939[field936] == null && field936 > 0) {
                            field936--;
                        }
                        field939[field936] = null;
                    }
                    if (var15.field2349 >= '0' && var15.field2349 <= '9') {
                        field939[field936] = "" + var15.field2349;
                        if (field936 < 7) {
                            field936++;
                        }
                    }
                    if (var15.field2350 == 84) {
                        boolean var108;
                        label861: {
                            Date var106;
                            try {
                                SimpleDateFormat var100 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var100.setLenient(false);
                                StringBuilder var101 = new StringBuilder();
                                String[] var102 = field939;
                                int var103 = 0;
                                while (true) {
                                    Date var105;
                                    if (var103 < var102.length) {
                                        String var104 = var102[var103];
                                        if (var104 != null) {
                                            var101.append(var104);
                                            var103++;
                                            continue;
                                        }
                                        Statics.method6605(7);
                                        method7895("Date not valid.", "Please ensure all characters are populated.", "");
                                        var105 = null;
                                    } else {
                                        var101.append("12");
                                        var105 = var100.parse(var101.toString());
                                    }
                                    var106 = var105;
                                    break;
                                }
                            } catch (ParseException var154) {
                                Statics.method6605(7);
                                method7895("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var108 = false;
                                break label861;
                            }
                            if (var106 == null) {
                                var108 = false;
                            } else {
                                Calendar var109 = Calendar.getInstance();
                                var109.set(1, var109.get(1) - 13);
                                var109.set(5, var109.get(5) + 1);
                                var109.set(11, 0);
                                var109.set(12, 0);
                                var109.set(13, 0);
                                var109.set(14, 0);
                                Date var110 = var109.getTime();
                                boolean var111 = var106.before(var110);
                                Calendar var113 = Calendar.getInstance();
                                var113.set(2, 0);
                                var113.set(5, 1);
                                var113.set(1, 1900);
                                Date var114 = var113.getTime();
                                boolean var116 = var106.after(var114);
                                if (var116) {
                                    if (var111) {
                                        Statics.field2851 = (int) (var106.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field2851 = 8388607;
                                    }
                                    var108 = true;
                                } else {
                                    Statics.method6605(7);
                                    method7895("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var108 = false;
                                }
                            }
                        }
                        if (var108) {
                            client.method2711(50);
                        }
                        return;
                    }
                }
            } else {
                int var119 = field925 + 180 - 80;
                short var120 = 321;
                if (var12 == 1 && var13 >= var119 - 75 && var13 <= var119 + 75 && var14 >= var120 - 20 && var14 <= var120 + 20) {
                    class32.method400(client.method5932("secure", true) + "m=dob/set_dob.ws", true, false);
                    method7895(class350.field4004, class350.field4142, class350.field3996);
                    Statics.method6605(6);
                    return;
                }
                int var121 = field925 + 180 + 80;
                if (var12 == 1 && var13 >= var121 - 75 && var13 <= var121 + 75 && var14 >= var120 - 20 && var14 <= var120 + 20) {
                    Statics.method4550(true);
                }
            }
        } else if (field951 == 8) {
            int var122 = field925 + 180 - 80;
            short var123 = 321;
            if (var12 == 1 && var13 >= var122 - 75 && var13 <= var122 + 75 && var14 >= var123 - 20 && var14 <= var123 + 20) {
                class32.method400("https://www.jagex.com/terms/privacy", true, false);
                method7895(class350.field4004, class350.field4142, class350.field3996);
                Statics.method6605(6);
                return;
            }
            int var124 = field925 + 180 + 80;
            if (var12 == 1 && var13 >= var124 - 75 && var13 <= var124 + 75 && var14 >= var123 - 20 && var14 <= var123 + 20) {
                Statics.method4550(true);
            }
        } else if (field951 == 9) {
            int var125 = field925 + 180;
            short var126 = 311;
            if (var15.field2350 == 84 || var15.field2350 == 13 || var12 == 1 && var13 >= var125 - 75 && var13 <= var125 + 75 && var14 >= var126 - 20 && var14 <= var126 + 20) {
                method3089(false);
            }
        } else if (field951 == 10) {
            int var127 = field925 + 180;
            short var128 = 209;
            if (var15.field2350 == 84 || var12 == 1 && var13 >= var127 - 109 && var13 <= var127 + 109 && var14 >= var128 && var14 <= var128 + 68) {
                method7895(class350.field4107, class350.field4108, class350.field4030);
                client.field634 = class506.field5074;
                client.method2970(false);
                client.method2711(20);
            }
        } else if (field951 == 12) {
            int var129 = Statics.field4961;
            short var130 = 233;
            class434 var131 = arg2.method6780(0, 30, class350.field4171, var129, var130);
            class434 var132 = arg2.method6780(32, 32, class350.field4171, var129, var130);
            class434 var133 = arg2.method6780(70, 34, class350.field4171, var129, var130);
            int var159 = var130 + 17;
            class434 var134 = arg2.method6780(0, 34, class350.field4127, var129, var159);
            if (var12 == 1) {
                if (var131.method7331(var13, var14)) {
                    class32.method400("https://www.jagex.com/terms", true, false);
                } else if (var132.method7331(var13, var14)) {
                    class32.method400("https://www.jagex.com/terms/privacy", true, false);
                } else if (var133.method7331(var13, var14) || var134.method7331(var13, var14)) {
                    class32.method400("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var135 = Statics.field4961 - 80;
            short var136 = 311;
            if (var12 == 1 && var13 >= var135 - 75 && var13 <= var135 + 75 && var14 >= var136 - 20 && var14 <= var136 + 20) {
                Statics.field48.method2348(client.field509);
                method3089(true);
            }
            int var137 = Statics.field4961 + 80;
            if (var12 == 1 && var13 >= var137 - 75 && var13 <= var137 + 75 && var14 >= var136 - 20 && var14 <= var136 + 20) {
                field951 = 13;
            }
        } else if (field951 == 13) {
            int var138 = Statics.field4961;
            short var139 = 321;
            if (var12 == 1 && var13 >= var138 - 75 && var13 <= var138 + 75 && var14 >= var139 - 20 && var14 <= var139 + 20) {
                method3089(true);
            }
        } else if (field951 == 14) {
            String var140 = "";
            switch(field926) {
                case 0:
                    var140 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var140 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var140 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    Statics.method4550(false);
            }
            int var141 = field925 + 180;
            short var142 = 276;
            if (var12 == 1 && var13 >= var141 - 75 && var13 <= var141 + 75 && var14 >= var142 - 20 && var14 <= var142 + 20) {
                class32.method400(var140, true, false);
                method7895(class350.field4004, class350.field4142, class350.field3996);
                Statics.method6605(6);
                return;
            }
            int var143 = field925 + 180;
            short var144 = 326;
            if (var12 == 1 && var13 >= var143 - 75 && var13 <= var143 + 75 && var14 >= var144 - 20 && var14 <= var144 + 20) {
                Statics.method4550(false);
            }
        } else if (field951 == 24) {
            int var145 = field925 + 180;
            short var146 = 301;
            if (var12 == 1 && var13 >= var145 - 75 && var13 <= var145 + 75 && var14 >= var146 - 20 && var14 <= var146 + 20) {
                method3089(false);
            }
        } else if (field951 == 32) {
            int var147 = field925 + 180 - 80;
            short var148 = 321;
            if (var12 == 1 && var13 >= var147 - 75 && var13 <= var147 + 75 && var14 >= var148 - 20 && var14 <= var148 + 20) {
                class32.method400(client.method5932("secure", true) + "m=dob/set_dob.ws", true, false);
                method7895(class350.field4004, class350.field4142, class350.field3996);
                Statics.method6605(6);
                return;
            }
            int var149 = field925 + 180 + 80;
            if (var12 == 1 && var13 >= var149 - 75 && var13 <= var149 + 75 && var14 >= var148 - 20 && var14 <= var148 + 20) {
                Statics.method4550(true);
            }
        } else if (field951 == 33) {
            int var150 = field925 + 180;
            short var151 = 276;
            if (var12 == 1 && var13 >= var150 - 75 && var13 <= var150 + 75 && var14 >= var151 - 20 && var14 <= var151 + 20) {
                class32.method400(class350.field4190, true, false);
            }
            int var152 = field925 + 180;
            short var153 = 326;
            if (var12 == 1 && var13 >= var152 - 75 && var13 <= var152 + 75 && var14 >= var153 - 20 && var14 <= var153 + 20) {
                Statics.method4550(true);
            }
        }
    }

    @ObfuscatedName("dn.ak(III)I")
    public static int method2123(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("gk.af(ZI)V")
    public static void method3089(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field48.method2336() >= client.field509;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field3874.method1132() || Statics.field3874.method1422() || Statics.field3874.method1133()) {
            var1 = 10;
        }
        Statics.method6605(var1);
        if (arg0) {
            field941 = "";
            field937 = "";
            Statics.field3522 = 0;
            Statics.field315 = "";
        }
        method2630();
        method4956();
    }

    @ObfuscatedName("sk.ao(I)V")
    public static void method7985() {
        field941 = field941.trim();
        if (field941.length() == 0) {
            method7895(class350.field4051, class350.field4143, class350.field4144);
            return;
        }
        long var0 = class73.method3427();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class73.method4675(var0, field941);
        }
        switch(var2) {
            case 2:
                method7895(class350.field4053, class350.field4129, class350.field4147);
                Statics.method6605(6);
                break;
            case 3:
                method7895(class350.field4148, class350.field4149, class350.field4150);
                break;
            case 4:
                method7895(class350.field4151, class350.field4056, class350.field4052);
                break;
            case 5:
                method7895(class350.field4055, class350.field4155, class350.field4156);
                break;
            case 6:
                method7895(class350.field4157, class350.field4158, class350.field4005);
                break;
            case 7:
                method7895(class350.field4000, class350.field4161, class350.field4162);
        }
    }

    @ObfuscatedName("hk.aa(Lph;Lph;Lph;I)V")
    public static void method3248(class392 arg0, class392 arg1, class392 arg2) {
        field920 = (Statics.field4720 - 765) / 2;
        field925 = field920 + 202;
        Statics.field4961 = field925 + 180;
        if (field947) {
            method2315(arg0, arg1);
            return;
        }
        Statics.field416.method8591(field920, 0);
        Statics.field944.method8591(field920 + 382, 0);
        Statics.field68.method8564(field920 + 382 - Statics.field68.field5108 / 2, 18);
        if (client.field514 == 0 || client.field514 == 5) {
            byte var3 = 20;
            arg0.method6784(class350.field4026, field925 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class511.method8472(field925 + 180 - 152, var4, 304, 34, 9179409);
            class511.method8472(field925 + 180 - 151, var4 + 1, 302, 32, 0);
            class511.method8468(field925 + 180 - 150, var4 + 2, field956 * 3, 30, 9179409);
            class511.method8468(field956 * 3 + (field925 + 180 - 150), var4 + 2, 300 - field956 * 3, 30, 0);
            arg0.method6784(field923, field925 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field514 == 20) {
            Statics.field4940.method8564(field925 + 180 - Statics.field4940.field5108 / 2, 271 - Statics.field4940.field5109 / 2);
            short var5 = 201;
            arg0.method6784(field933, field925 + 180, var5, 16776960, 0);
            int var121 = var5 + 15;
            arg0.method6784(field952, field925 + 180, var121, 16776960, 0);
            int var122 = var121 + 15;
            arg0.method6784(field935, field925 + 180, var122, 16776960, 0);
            int var123 = var122 + 15;
            int var124 = var123 + 7;
            if (field951 != 4 && field951 != 10) {
                arg0.method6828(class350.field4116, field925 + 180 - 110, var124, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method2735(); arg0.method6775(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method6828(class396.method6779(var7), field925 + 180 - 70, var124, 16777215, 0);
                var121 = var124 + 15;
                String var8 = field937;
                String var9 = class385.method6206('*', var8.length());
                String var10;
                for (var10 = var9; arg0.method6775(var10) > var6; var10 = var10.substring(1)) {
                }
                arg0.method6828(class350.field4117 + var10, field925 + 180 - 108, var121, 16777215, 0);
                var121 += 15;
            }
        }
        if (client.field514 == 10 || client.field514 == 11 || client.field514 == 50) {
            Statics.field4940.method8564(field925, 171);
            if (field951 == 0) {
                short var11 = 251;
                arg0.method6784(class350.field4113, field925 + 180, var11, 16776960, 0);
                int var125 = var11 + 30;
                int var12 = field925 + 180 - 80;
                short var13 = 291;
                Statics.field922.method8564(var12 - 73, var13 - 20);
                arg0.method6785(class350.field4120, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var14 = field925 + 180 + 80;
                Statics.field922.method8564(var14 - 73, var13 - 20);
                arg0.method6785(class350.field4154, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field951 == 1) {
                arg0.method6784(field932, field925 + 180, 201, 16776960, 0);
                short var15 = 236;
                arg0.method6784(field933, field925 + 180, var15, 16777215, 0);
                int var126 = var15 + 15;
                arg0.method6784(field952, field925 + 180, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method6784(field935, field925 + 180, var127, 16777215, 0);
                int var128 = var127 + 15;
                int var16 = field925 + 180 - 80;
                short var17 = 321;
                Statics.field922.method8564(var16 - 73, var17 - 20);
                arg0.method6784(class350.field3885, var16, var17 + 5, 16777215, 0);
                int var18 = field925 + 180 + 80;
                Statics.field922.method8564(var18 - 73, var17 - 20);
                arg0.method6784(class350.field4123, var18, var17 + 5, 16777215, 0);
            } else if (field951 == 2) {
                short var19 = 201;
                arg0.method6784(field933, Statics.field4961, var19, 16776960, 0);
                int var129 = var19 + 15;
                arg0.method6784(field952, Statics.field4961, var129, 16776960, 0);
                int var130 = var129 + 15;
                arg0.method6784(field935, Statics.field4961, var130, 16776960, 0);
                int var131 = var130 + 15;
                int var132 = var131 + 7;
                arg0.method6828(class350.field4116, Statics.field4961 - 110, var132, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = method2735(); arg0.method6775(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method6828(class396.method6779(var21) + (field929 == 0 & client.field506 % 40 < 20 ? class101.method6013(16776960) + class101.field1295 : ""), Statics.field4961 - 70, var132, 16777215, 0);
                var129 = var132 + 15;
                String var22 = field937;
                String var23 = class385.method6206('*', var22.length());
                String var24;
                for (var24 = var23; arg0.method6775(var24) > var20; var24 = var24.substring(1)) {
                }
                arg0.method6828(class350.field4117 + var24 + (field929 == 1 & client.field506 % 40 < 20 ? class101.method6013(16776960) + class101.field1295 : ""), Statics.field4961 - 108, var129, 16777215, 0);
                var129 += 15;
                short var25 = 277;
                int var26 = Statics.field4961 + -117;
                boolean var27 = client.field557;
                boolean var28 = field948;
                class514 var29 = var27 ? (var28 ? Statics.field1291 : Statics.field1857) : (var28 ? Statics.field1009 : Statics.field1323);
                var29.method8564(var26, var25);
                int var31 = var29.field5108 + 5 + var26;
                arg1.method6828(class350.field4124, var31, var25 + 13, 16776960, 0);
                int var32 = Statics.field4961 + 24;
                boolean var33 = Statics.field48.method2354();
                boolean var34 = field942;
                class514 var35 = var33 ? (var34 ? Statics.field1291 : Statics.field1857) : (var34 ? Statics.field1009 : Statics.field1323);
                var35.method8564(var32, var25);
                int var37 = var35.field5108 + 5 + var32;
                arg1.method6828(class350.field4125, var37, var25 + 13, 16776960, 0);
                int var133 = var25 + 15;
                int var38 = Statics.field4961 - 80;
                short var39 = 321;
                Statics.field922.method8564(var38 - 73, var39 - 20);
                arg0.method6784(class350.field4186, var38, var39 + 5, 16777215, 0);
                int var40 = Statics.field4961 + 80;
                Statics.field922.method8564(var40 - 73, var39 - 20);
                arg0.method6784(class350.field4123, var40, var39 + 5, 16777215, 0);
                short var41 = 357;
                switch(field930) {
                    case 2:
                        Statics.field3788 = class350.field4025;
                        break;
                    default:
                        Statics.field3788 = class350.field4070;
                }
                Statics.field4573 = new class434(Statics.field4961, var41, arg1.method6775(Statics.field3788), 11);
                Statics.field3771 = new class434(Statics.field4961, var41, arg1.method6775(class350.field4137), 11);
                arg1.method6784(Statics.field3788, Statics.field4961, var41, 16777215, 0);
            } else if (field951 == 3) {
                short var42 = 201;
                arg0.method6784(class350.field3958, field925 + 180, var42, 16776960, 0);
                int var134 = var42 + 20;
                arg1.method6784(class350.field4133, field925 + 180, var134, 16776960, 0);
                int var135 = var134 + 20;
                arg1.method6784(class350.field3991, field925 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var43 = field925 + 180;
                short var44 = 276;
                Statics.field922.method8564(var43 - 73, var44 - 20);
                arg2.method6784(class350.field4130, var43, var44 + 5, 16777215, 0);
                int var45 = field925 + 180;
                short var46 = 326;
                Statics.field922.method8564(var45 - 73, var46 - 20);
                arg2.method6784(class350.field4131, var45, var46 + 5, 16777215, 0);
            } else if (field951 == 4) {
                arg0.method6784(class350.field3989, field925 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method6784(field933, field925 + 180, var47, 16777215, 0);
                int var137 = var47 + 15;
                arg0.method6784(field952, field925 + 180, var137, 16777215, 0);
                int var138 = var137 + 15;
                arg0.method6784(field935, field925 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                String var49 = class350.field3968;
                String var50 = Statics.field315;
                String var51 = class385.method6206('*', var50.length());
                arg0.method6828(var49 + var51 + (client.field506 % 40 < 20 ? class101.method6013(16776960) + class101.field1295 : ""), field925 + 180 - 108, var139, 16777215, 0);
                int var140 = var139 - 8;
                arg0.method6828(class350.field3888, field925 + 180 - 9, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg0.method6828(class350.field3889, field925 + 180 - 9, var141, 16776960, 0);
                int var52 = field925 + 180 - 9 + arg0.method6775(class350.field3889) + 15;
                int var53 = var141 - arg0.field4447;
                class514 var54;
                if (field943) {
                    var54 = Statics.field1857;
                } else {
                    var54 = Statics.field1323;
                }
                var54.method8564(var52, var53);
                var137 = var141 + 15;
                int var55 = field925 + 180 - 80;
                short var56 = 321;
                Statics.field922.method8564(var55 - 73, var56 - 20);
                arg0.method6784(class350.field3885, var55, var56 + 5, 16777215, 0);
                int var57 = field925 + 180 + 80;
                Statics.field922.method8564(var57 - 73, var56 - 20);
                arg0.method6784(class350.field4123, var57, var56 + 5, 16777215, 0);
                arg1.method6784(class350.field4121, field925 + 180, var56 + 36, 255, 0);
            } else if (field951 == 5) {
                arg0.method6784(class350.field3911, field925 + 180, 201, 16776960, 0);
                short var58 = 221;
                arg2.method6784(field933, field925 + 180, var58, 16776960, 0);
                int var142 = var58 + 15;
                arg2.method6784(field952, field925 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg2.method6784(field935, field925 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                int var145 = var144 + 14;
                arg0.method6828(class350.field3896, field925 + 180 - 145, var145, 16777215, 0);
                short var59 = 174;
                String var60;
                for (var60 = method2735(); arg0.method6775(var60) > var59; var60 = var60.substring(1)) {
                }
                arg0.method6828(class396.method6779(var60) + (client.field506 % 40 < 20 ? class101.method6013(16776960) + class101.field1295 : ""), field925 + 180 - 34, var145, 16777215, 0);
                var142 = var145 + 15;
                int var61 = field925 + 180 - 80;
                short var62 = 321;
                Statics.field922.method8564(var61 - 73, var62 - 20);
                arg0.method6784(class350.field4001, var61, var62 + 5, 16777215, 0);
                int var63 = field925 + 180 + 80;
                Statics.field922.method8564(var63 - 73, var62 - 20);
                arg0.method6784(class350.field4064, var63, var62 + 5, 16777215, 0);
                short var64 = 356;
                arg1.method6784(class350.field4137, Statics.field4961, var64, 268435455, 0);
            } else if (field951 == 6) {
                short var65 = 201;
                arg0.method6784(field933, field925 + 180, var65, 16776960, 0);
                int var146 = var65 + 15;
                arg0.method6784(field952, field925 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg0.method6784(field935, field925 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                int var66 = field925 + 180;
                short var67 = 321;
                Statics.field922.method8564(var66 - 73, var67 - 20);
                arg0.method6784(class350.field4064, var66, var67 + 5, 16777215, 0);
            } else if (field951 == 7) {
                if (Statics.field1402 && !client.field804) {
                    short var68 = 201;
                    arg0.method6784(field933, Statics.field4961, var68, 16776960, 0);
                    int var149 = var68 + 15;
                    arg0.method6784(field952, Statics.field4961, var149, 16776960, 0);
                    int var150 = var149 + 15;
                    arg0.method6784(field935, Statics.field4961, var150, 16776960, 0);
                    int var69 = Statics.field4961 - 150;
                    int var151 = var150 + 10;
                    for (int var70 = 0; var70 < 8; var70++) {
                        Statics.field922.method8566(var69, var151, 30, 40);
                        boolean var71 = field936 == var70 & client.field506 % 40 < 20;
                        arg0.method6828((field939[var70] == null ? "" : field939[var70]) + (var71 ? class101.method6013(16776960) + class101.field1295 : ""), var69 + 10, var151 + 27, 16777215, 0);
                        if (var70 == 1 || var70 == 3) {
                            var69 += 50;
                            arg0.method6828(class396.method6779("/"), var69 - 13, var151 + 27, 16777215, 0);
                        } else {
                            var69 += 35;
                        }
                    }
                    int var72 = Statics.field4961 - 80;
                    short var73 = 321;
                    Statics.field922.method8564(var72 - 73, var73 - 20);
                    arg0.method6784("Submit", var72, var73 + 5, 16777215, 0);
                    int var74 = Statics.field4961 + 80;
                    Statics.field922.method8564(var74 - 73, var73 - 20);
                    arg0.method6784(class350.field4123, var74, var73 + 5, 16777215, 0);
                } else {
                    short var75 = 216;
                    arg0.method6784(class350.field4163, field925 + 180, var75, 16776960, 0);
                    int var152 = var75 + 15;
                    arg2.method6784(class350.field4164, field925 + 180, var152, 16776960, 0);
                    int var153 = var152 + 15;
                    arg2.method6784(class350.field4165, field925 + 180, var153, 16776960, 0);
                    int var154 = var153 + 15;
                    int var76 = field925 + 180 - 80;
                    short var77 = 321;
                    Statics.field922.method8564(var76 - 73, var77 - 20);
                    arg0.method6784(class350.field4166, var76, var77 + 5, 16777215, 0);
                    int var78 = field925 + 180 + 80;
                    Statics.field922.method8564(var78 - 73, var77 - 20);
                    arg0.method6784(class350.field4064, var78, var77 + 5, 16777215, 0);
                }
            } else if (field951 == 8) {
                short var79 = 216;
                arg0.method6784(class350.field4018, field925 + 180, var79, 16776960, 0);
                int var155 = var79 + 15;
                arg2.method6784(class350.field4019, field925 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg2.method6784(class350.field4020, field925 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var80 = field925 + 180 - 80;
                short var81 = 321;
                Statics.field922.method8564(var80 - 73, var81 - 20);
                arg0.method6784(class350.field4021, var80, var81 + 5, 16777215, 0);
                int var82 = field925 + 180 + 80;
                Statics.field922.method8564(var82 - 73, var81 - 20);
                arg0.method6784(class350.field4064, var82, var81 + 5, 16777215, 0);
            } else if (field951 == 9) {
                short var83 = 221;
                arg0.method6784(field933, field925 + 180, var83, 16776960, 0);
                int var158 = var83 + 25;
                arg0.method6784(field952, field925 + 180, var158, 16776960, 0);
                int var159 = var158 + 25;
                arg0.method6784(field935, field925 + 180, var159, 16776960, 0);
                int var84 = field925 + 180;
                short var85 = 311;
                Statics.field922.method8564(var84 - 73, var85 - 20);
                arg0.method6784(class350.field4130, var84, var85 + 5, 16777215, 0);
            } else if (field951 == 10) {
                int var86 = field925 + 180;
                short var87 = 209;
                arg0.method6784(class350.field4113, field925 + 180, var87, 16776960, 0);
                int var160 = var87 + 20;
                Statics.field2111.method8564(var86 - 109, var160);
                if (field940.isEmpty()) {
                    Statics.field1417.method8564(var86 - 48, var160 + 18);
                } else {
                    Statics.field1417.method8564(var86 - 48, var160 + 5);
                    arg0.method6784(field940, var86, var160 + 68 - 15, 16776960, 0);
                }
            } else if (field951 == 12) {
                int var88 = Statics.field4961;
                short var89 = 216;
                arg2.method6784(class350.field4076, var88, var89, 16777215, 0);
                int var161 = var89 + 17;
                arg2.method6784(class350.field4171, var88, var161, 16777215, 0);
                int var162 = var161 + 17;
                arg2.method6784(class350.field4127, var88, var162, 16777215, 0);
                int var163 = var162 + 17;
                arg2.method6784(class350.field4173, var88, var163, 16777215, 0);
                int var90 = Statics.field4961 - 80;
                short var91 = 311;
                Statics.field922.method8564(var90 - 73, var91 - 20);
                arg0.method6784(class350.field4008, var90, var91 + 5, 16777215, 0);
                int var92 = Statics.field4961 + 80;
                Statics.field922.method8564(var92 - 73, var91 - 20);
                arg0.method6784(class350.field4177, var92, var91 + 5, 16777215, 0);
            } else if (field951 == 13) {
                short var93 = 231;
                arg2.method6784(class350.field3903, field925 + 180, var93, 16777215, 0);
                int var164 = var93 + 20;
                arg2.method6784(class350.field4175, field925 + 180, var164, 16777215, 0);
                int var94 = field925 + 180;
                short var95 = 311;
                Statics.field922.method8564(var94 - 73, var95 - 20);
                arg0.method6784(class350.field4064, var94, var95 + 5, 16777215, 0);
            } else if (field951 == 14) {
                short var96 = 201;
                String var97 = "";
                String var98 = "";
                String var99 = "";
                switch(field926) {
                    case 0:
                        var97 = class350.field3929;
                        var98 = class350.field3977;
                        var99 = class350.field3902;
                        break;
                    case 1:
                        var97 = class350.field3973;
                        var98 = class350.field3974;
                        var99 = class350.field3975;
                        break;
                    case 2:
                        var97 = class350.field3976;
                        var98 = class350.field3982;
                        var99 = class350.field4011;
                        break;
                    default:
                        Statics.method4550(false);
                }
                arg0.method6784(var97, field925 + 180, var96, 16776960, 0);
                int var165 = var96 + 20;
                arg0.method6784(var98, field925 + 180, var165, 16776960, 0);
                int var166 = var165 + 20;
                arg0.method6784(var99, field925 + 180, var166, 16776960, 0);
                int var100 = field925 + 180;
                short var101 = 276;
                Statics.field922.method8564(var100 - 73, var101 - 20);
                if (field926 == 1) {
                    arg0.method6784(class350.field3918, var100, var101 + 5, 16777215, 0);
                } else {
                    arg0.method6784(class350.field3917, var100, var101 + 5, 16777215, 0);
                }
                int var102 = field925 + 180;
                short var103 = 326;
                Statics.field922.method8564(var102 - 73, var103 - 20);
                arg0.method6784(class350.field4064, var102, var103 + 5, 16777215, 0);
            } else if (field951 == 24) {
                short var104 = 221;
                arg0.method6784(field933, field925 + 180, var104, 16777215, 0);
                int var167 = var104 + 15;
                arg0.method6784(field952, field925 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                arg0.method6784(field935, field925 + 180, var168, 16777215, 0);
                int var169 = var168 + 15;
                int var105 = field925 + 180;
                short var106 = 301;
                Statics.field922.method8564(var105 - 73, var106 - 20);
                arg0.method6784(class350.field3895, var105, var106 + 5, 16777215, 0);
            } else if (field951 == 32) {
                short var107 = 216;
                arg0.method6784(class350.field4163, field925 + 180, var107, 16776960, 0);
                int var170 = var107 + 15;
                arg2.method6784(class350.field4164, field925 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg2.method6784(class350.field4165, field925 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var108 = field925 + 180 - 80;
                short var109 = 321;
                Statics.field922.method8564(var108 - 73, var109 - 20);
                arg0.method6784(class350.field4166, var108, var109 + 5, 16777215, 0);
                int var110 = field925 + 180 + 80;
                Statics.field922.method8564(var110 - 73, var109 - 20);
                arg0.method6784(class350.field4064, var110, var109 + 5, 16777215, 0);
            } else if (field951 == 33) {
                short var111 = 201;
                arg0.method6784(field933, field925 + 180, var111, 16776960, 0);
                int var173 = var111 + 20;
                arg1.method6784(field952, field925 + 180, var173, 16776960, 0);
                int var174 = var173 + 20;
                arg1.method6784(field935, field925 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                int var112 = field925 + 180;
                short var113 = 276;
                Statics.field922.method8564(var112 - 73, var113 - 20);
                arg2.method6784(class350.field4189, var112, var113 + 5, 16777215, 0);
                int var114 = field925 + 180;
                short var115 = 326;
                Statics.field922.method8564(var114 - 73, var115 - 20);
                arg2.method6784(class350.field4064, var114, var115 + 5, 16777215, 0);
            }
        }
        if (client.field514 >= 10) {
            int[] var116 = new int[4];
            class511.method8462(var116);
            class511.method8523(field920, 0, field920 + 765, Statics.field3024);
            Statics.field2681.method2285(field920 - 22, client.field506);
            Statics.field2681.method2285(field920 + 765 + 22 - 128, client.field506);
            class511.method8463(var116);
        }
        Statics.field3509[Statics.field48.method2319() ? 1 : 0].method8564(field920 + 765 - 40, 463);
        if (client.field514 <= 5 || Statics.field4618 != class372.field4341) {
            return;
        }
        if (Statics.field98 == null) {
            Statics.field98 = class516.method4989(Statics.field1874, "sl_button", "");
            return;
        }
        int var117 = field920 + 5;
        short var118 = 463;
        byte var119 = 100;
        byte var120 = 35;
        Statics.field98.method8564(var117, var118);
        arg0.method6784(class350.field4058 + " " + client.field504, var119 / 2 + var117, var120 / 2 + var118 - 2, 16777215, 0);
        if (Statics.field809 == null) {
            arg1.method6784(class350.field4122, var119 / 2 + var117, var120 / 2 + var118 + 12, 16777215, 0);
        } else {
            arg1.method6784(class350.field3879, var119 / 2 + var117, var120 / 2 + var118 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("sy.aj(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method7895(String arg0, String arg1, String arg2) {
        field933 = arg0;
        field952 = arg1;
        field935 = arg2;
    }

    @ObfuscatedName("dy.ad(Lph;Lph;I)V")
    public static void method2315(class392 arg0, class392 arg1) {
        if (Statics.field83 == null) {
            Statics.field83 = class516.method3857(Statics.field1874, "sl_back", "");
        }
        if (Statics.field1570 == null) {
            Statics.field1570 = class516.method4990(Statics.field1874, "sl_flags", "");
        }
        if (Statics.field2 == null) {
            Statics.field2 = class516.method4990(Statics.field1874, "sl_arrows", "");
        }
        if (Statics.field3836 == null) {
            Statics.field3836 = class516.method4990(Statics.field1874, "sl_stars", "");
        }
        if (Statics.field3360 == null) {
            Statics.field3360 = class516.method4989(Statics.field1874, "leftarrow", "");
        }
        if (Statics.field1504 == null) {
            Statics.field1504 = class516.method4989(Statics.field1874, "rightarrow", "");
        }
        class511.method8468(field920, 23, 765, 480, 0);
        class511.method8469(field920, 0, 125, 23, 12425273, 9135624);
        class511.method8469(field920 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6784(class350.field4135, field920 + 62, 15, 0, -1);
        if (Statics.field3836 != null) {
            Statics.field3836[1].method8564(field920 + 140, 1);
            arg1.method6828(class350.field4179, field920 + 152, 10, 16777215, -1);
            Statics.field3836[0].method8564(field920 + 140, 12);
            arg1.method6828(class350.field4180, field920 + 152, 21, 16777215, -1);
        }
        if (Statics.field2 != null) {
            int var2 = field920 + 280;
            if (class68.field810[0] == 0 && class68.field815[0] == 0) {
                Statics.field2[2].method8564(var2, 4);
            } else {
                Statics.field2[0].method8564(var2, 4);
            }
            if (class68.field810[0] == 0 && class68.field815[0] == 1) {
                Statics.field2[3].method8564(var2 + 15, 4);
            } else {
                Statics.field2[1].method8564(var2 + 15, 4);
            }
            arg0.method6828(class350.field4181, var2 + 32, 17, 16777215, -1);
            int var3 = field920 + 390;
            if (class68.field810[0] == 1 && class68.field815[0] == 0) {
                Statics.field2[2].method8564(var3, 4);
            } else {
                Statics.field2[0].method8564(var3, 4);
            }
            if (class68.field810[0] == 1 && class68.field815[0] == 1) {
                Statics.field2[3].method8564(var3 + 15, 4);
            } else {
                Statics.field2[1].method8564(var3 + 15, 4);
            }
            arg0.method6828(class350.field4182, var3 + 32, 17, 16777215, -1);
            int var4 = field920 + 500;
            if (class68.field810[0] == 2 && class68.field815[0] == 0) {
                Statics.field2[2].method8564(var4, 4);
            } else {
                Statics.field2[0].method8564(var4, 4);
            }
            if (class68.field810[0] == 2 && class68.field815[0] == 1) {
                Statics.field2[3].method8564(var4 + 15, 4);
            } else {
                Statics.field2[1].method8564(var4 + 15, 4);
            }
            arg0.method6828(class350.field4183, var4 + 32, 17, 16777215, -1);
            int var5 = field920 + 610;
            if (class68.field810[0] == 3 && class68.field815[0] == 0) {
                Statics.field2[2].method8564(var5, 4);
            } else {
                Statics.field2[0].method8564(var5, 4);
            }
            if (class68.field810[0] == 3 && class68.field815[0] == 1) {
                Statics.field2[3].method8564(var5 + 15, 4);
            } else {
                Statics.field2[1].method8564(var5 + 15, 4);
            }
            arg0.method6828(class350.field4184, var5 + 32, 17, 16777215, -1);
        }
        class511.method8468(field920 + 708, 4, 50, 16, 0);
        arg1.method6784(class350.field4123, field920 + 708 + 25, 16, 16777215, -1);
        field955 = -1;
        if (Statics.field83 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1) - 1;
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class68.field813) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class68.field813) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class68.field813) {
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
            int var16 = (class68.field813 + var9 - 1) / var9;
            field927 = var16 - var8;
            if (Statics.field3360 != null && field949 > 0) {
                Statics.field3360.method8564(8, Statics.field3024 / 2 - Statics.field3360.field5109 / 2);
            }
            if (Statics.field1504 != null && field949 < field927) {
                Statics.field1504.method8564(Statics.field4720 - Statics.field1504.field5108 - 8, Statics.field3024 / 2 - Statics.field1504.field5109 / 2);
            }
            int var17 = var15 + 23;
            int var18 = field920 + var14;
            int var19 = 0;
            boolean var20 = false;
            int var21 = field949;
            for (int var22 = var9 * var21; var22 < class68.field813 && var21 - field949 < var8; var22++) {
                class68 var23 = Statics.field812[var22];
                boolean var24 = true;
                String var25 = Integer.toString(var23.field821);
                if (var23.field821 == -1) {
                    var25 = class350.field4185;
                    var24 = false;
                } else if (var23.field821 > 1980) {
                    var25 = class350.field4063;
                    var24 = false;
                }
                class108 var26 = null;
                int var27 = 0;
                if (var23.method1708()) {
                    var26 = var23.method1659() ? class108.field1349 : class108.field1354;
                } else if (var23.method1682()) {
                    var26 = var23.method1659() ? class108.field1363 : class108.field1362;
                } else if (var23.method1658()) {
                    var27 = 16711680;
                    var26 = var23.method1659() ? class108.field1358 : class108.field1352;
                } else if (var23.method1666()) {
                    var26 = var23.method1659() ? class108.field1357 : class108.field1356;
                } else if (var23.method1662()) {
                    var26 = var23.method1659() ? class108.field1351 : class108.field1350;
                } else if (var23.method1667()) {
                    var26 = var23.method1659() ? class108.field1359 : class108.field1353;
                } else if (var23.method1668()) {
                    var26 = var23.method1659() ? class108.field1361 : class108.field1355;
                }
                if (var26 == null || var26.field1364 >= Statics.field83.length) {
                    var26 = var23.method1659() ? class108.field1348 : class108.field1360;
                }
                if (class36.field221 >= var18 && class36.field229 >= var17 && class36.field221 < var6 + var18 && class36.field229 < var7 + var17 && var24) {
                    field955 = var22;
                    Statics.field83[var26.field1364].method8603(var18, var17, 128, 16777215);
                    var20 = true;
                } else {
                    Statics.field83[var26.field1364].method8591(var18, var17);
                }
                if (Statics.field1570 != null) {
                    Statics.field1570[(var23.method1659() ? 8 : 0) + var23.field823].method8564(var18 + 29, var17);
                }
                arg0.method6784(Integer.toString(var23.field818), var18 + 15, var7 / 2 + var17 + 5, var27, -1);
                arg1.method6784(var25, var18 + 60, var7 / 2 + var17 + 5, 268435455, -1);
                var17 += var7 + var13;
                var19++;
                if (var19 >= var9) {
                    var17 = var15 + 23;
                    var18 += var6 + var12;
                    var19 = 0;
                    var21++;
                }
            }
            if (var20) {
                int var28 = arg1.method6775(Statics.field812[field955].field822) + 6;
                int var29 = arg1.field4447 + 8;
                int var30 = class36.field229 + 25;
                if (var29 + var30 > 480) {
                    var30 = class36.field229 - 25 - var29;
                }
                class511.method8468(class36.field221 - var28 / 2, var30, var28, var29, 16777120);
                class511.method8472(class36.field221 - var28 / 2, var30, var28, var29, 0);
                arg1.method6784(Statics.field812[field955].field822, class36.field221, arg1.field4447 + var30 + 4, 0, -1);
            }
        }
        Statics.field2978.method433(0, 0);
    }

    @ObfuscatedName("aa.ac(Lba;I)V")
    public static void method98(class35 arg0) {
        class212 var1 = client.method6015();
        while (var1.method3790()) {
            if (var1.field2350 == 13) {
                method64();
                return;
            }
            if (var1.field2350 == 96) {
                if (field949 > 0 && Statics.field3360 != null) {
                    field949--;
                }
            } else if (var1.field2350 == 97 && field949 < field927 && Statics.field1504 != null) {
                field949++;
            }
        }
        if (class36.field232 != 1 && Statics.field3402 || class36.field232 != 4) {
            return;
        }
        int var2 = field920 + 280;
        if (class36.field233 >= var2 && class36.field233 <= var2 + 14 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(0, 0);
            return;
        }
        if (class36.field233 >= var2 + 15 && class36.field233 <= var2 + 80 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(0, 1);
            return;
        }
        int var3 = field920 + 390;
        if (class36.field233 >= var3 && class36.field233 <= var3 + 14 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(1, 0);
            return;
        }
        if (class36.field233 >= var3 + 15 && class36.field233 <= var3 + 80 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(1, 1);
            return;
        }
        int var4 = field920 + 500;
        if (class36.field233 >= var4 && class36.field233 <= var4 + 14 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(2, 0);
            return;
        }
        if (class36.field233 >= var4 + 15 && class36.field233 <= var4 + 80 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(2, 1);
            return;
        }
        int var5 = field920 + 610;
        if (class36.field233 >= var5 && class36.field233 <= var5 + 14 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(3, 0);
            return;
        }
        if (class36.field233 >= var5 + 15 && class36.field233 <= var5 + 80 && class36.field234 >= 4 && class36.field234 <= 18) {
            class68.method1079(3, 1);
            return;
        }
        if (class36.field233 >= field920 + 708 && class36.field234 >= 4 && class36.field233 <= field920 + 708 + 50 && class36.field234 <= 20) {
            method64();
            return;
        }
        if (field955 != -1) {
            class68 var6 = Statics.field812[field955];
            method177(var6);
            method64();
            return;
        }
        if (field949 > 0 && Statics.field3360 != null && class36.field233 >= 0 && class36.field233 <= Statics.field3360.field5108 && class36.field234 >= Statics.field3024 / 2 - 50 && class36.field234 <= Statics.field3024 / 2 + 50) {
            field949--;
        }
        if (field949 < field927 && Statics.field1504 != null && class36.field233 >= Statics.field4720 - Statics.field1504.field5108 - 5 && class36.field233 <= Statics.field4720 && class36.field234 >= Statics.field3024 / 2 - 50 && class36.field234 <= Statics.field3024 / 2 + 50) {
            field949++;
        }
    }

    @ObfuscatedName("ac.ag(Lcc;I)V")
    public static void method177(class68 arg0) {
        if (arg0.method1659() != client.field507) {
            client.field507 = arg0.method1659();
            class206.method3820(arg0.method1659());
        }
        if (client.field505 != arg0.field819) {
            class355 var1 = Statics.field1874;
            int var2 = arg0.field819;
            if ((var2 & 0x20000000) != 0) {
                Statics.field68 = class516.method4989(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) != 0) {
                Statics.field68 = class516.method4989(var1, "logo_seasonal_mode", "");
            } else if ((var2 & 0x100) == 0) {
                Statics.field68 = class516.method4989(var1, "logo", "");
            } else {
                Statics.field68 = class516.method4989(var1, "logo_speedrunning", "");
            }
        }
        Statics.field87 = arg0.field817;
        client.field504 = arg0.field818;
        client.field505 = arg0.field819;
        Statics.field300 = client.field566 == 0 ? 43594 : arg0.field818 + 40000;
        Statics.field985 = client.field566 == 0 ? 443 : arg0.field818 + 50000;
        Statics.field1418 = Statics.field300;
    }

    @ObfuscatedName("af.ar(B)V")
    public static void method64() {
        field947 = false;
        Statics.field416.method8591(field920, 0);
        Statics.field944.method8591(field920 + 382, 0);
        Statics.field68.method8564(field920 + 382 - Statics.field68.field5108 / 2, 18);
    }

    @ObfuscatedName("br.ah(I)V")
    public static void method820() {
        Statics.method6605(24);
        method7895(class350.field4110, class350.field4111, class350.field3934);
    }

    @ObfuscatedName("ee.az(I)V")
    public static void method2535() {
        Statics.method6605(24);
        method7895(class350.field3914, class350.field4114, class350.field4115);
    }

    @ObfuscatedName("fe.ai(I)I")
    public static int method2886() {
        return field951;
    }
}
