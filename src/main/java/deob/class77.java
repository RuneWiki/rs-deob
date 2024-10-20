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

@ObfuscatedName("cq")
public class class77 {

    @ObfuscatedName("cq.af")
    public static int field928 = 0;

    @ObfuscatedName("cq.aq")
    public static int field930 = field928 + 202;

    @ObfuscatedName("cq.ac")
    public static int field934 = 10;

    @ObfuscatedName("cq.ae")
    public static String field935 = "";

    @ObfuscatedName("cq.bq")
    public static int field958 = -1;

    @ObfuscatedName("cq.bm")
    public static int field939 = 1;

    @ObfuscatedName("cq.cb")
    public static int field959 = 0;

    @ObfuscatedName("cq.cj")
    public static String field941 = "";

    @ObfuscatedName("cq.cr")
    public static String field938 = "";

    @ObfuscatedName("cq.cy")
    public static String field948 = "";

    @ObfuscatedName("cq.cg")
    public static String field944 = "";

    @ObfuscatedName("cq.cl")
    public static String field945 = "";

    @ObfuscatedName("cq.cw")
    public static String field946 = "";

    @ObfuscatedName("cq.ct")
    public static int field947 = 0;

    @ObfuscatedName("cq.cm")
    public static String[] field932 = new String[8];

    @ObfuscatedName("cq.cp")
    public static String field954 = "";

    @ObfuscatedName("cq.ch")
    public static boolean field950 = false;

    @ObfuscatedName("cq.cf")
    public static boolean field951 = false;

    @ObfuscatedName("cq.ca")
    public static boolean field952 = true;

    @ObfuscatedName("cq.dj")
    public static int field953 = 0;

    @ObfuscatedName("cq.dn")
    public static String field929 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cq.dl")
    public static String field955 = "1234567890";

    @ObfuscatedName("cq.dm")
    public static boolean field957 = false;

    @ObfuscatedName("cq.dg")
    public static int field940 = -1;

    @ObfuscatedName("cq.db")
    public static int field943 = 0;

    @ObfuscatedName("cq.di")
    public static int field933 = 0;

    @ObfuscatedName("cq.dy")
    public static long field960;

    @ObfuscatedName("cq.dt")
    public static long field961;

    @ObfuscatedName("cq.de")
    public static String[] field962;

    @ObfuscatedName("cq.dz")
    public static String[] field963;

    @ObfuscatedName("cq.dh")
    public static String[] field964;

    static {
        new DecimalFormat("##0.00");
        new class135();
        field960 = -1L;
        field961 = -1L;
        field962 = new String[] { "title.jpg" };
        field963 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field964 = new String[] { "logo_speedrunning" };
    }

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.az(Loc;Loc;I)I")
    public static int method250(class379 arg0, class379 arg1) {
        int var2 = 0;
        String[] var3 = field962;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method6348(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field963;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method6348(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field964;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method6386(var11) != -1 && arg1.method6348(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("kq.ah(Loc;B)I")
    public static int method5158(class379 arg0) {
        int var1 = field963.length + field962.length;
        String[] var2 = field964;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6386(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("le.af(Loc;Loc;ZII)V")
    public static void method5348(class379 arg0, class379 arg1, boolean arg2, int arg3) {
        if (!Statics.field927) {
            if (arg3 == 0) {
                method3203(arg2);
            } else {
                method3602(arg3);
            }
            class545.method8788();
            byte[] var4 = arg0.method6347("title.jpg", "");
            Statics.field4666 = class31.method6516(var4);
            Statics.field931 = Statics.field4666.method8888();
            method6449(arg1, client.field510);
            Statics.field937 = class550.method3016(arg1, "titlebox", "");
            Statics.field926 = class550.method3016(arg1, "titlebutton", "");
            Statics.field1066 = class550.method3016(arg1, "titlebutton_large", "");
            Statics.field1902 = class550.method3016(arg1, "play_now_text", "");
            class550.method3016(arg1, "titlebutton_wide42,1", "");
            Statics.field942 = class550.method7006(arg1, "runes", "");
            Statics.field476 = class550.method7006(arg1, "title_mute", "");
            Statics.field126 = class550.method3016(arg1, "options_radio_buttons,0", "");
            Statics.field4812 = class550.method3016(arg1, "options_radio_buttons,4", "");
            Statics.field1659 = class550.method3016(arg1, "options_radio_buttons,2", "");
            Statics.field4752 = class550.method3016(arg1, "options_radio_buttons,6", "");
            Statics.field229 = Statics.field126.field5321;
            Statics.field2428 = Statics.field126.field5324;
            Statics.field421 = new class99(Statics.field942);
            if (arg2) {
                field945 = "";
                field946 = "";
                field932 = new String[8];
                field947 = 0;
            }
            Statics.field3629 = 0;
            Statics.field130 = "";
            field952 = true;
            field957 = false;
            if (Statics.field1336.method2351()) {
                class322.method104(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class334(Statics.field1509, "scape main", "", 255, false));
                class322.method4517(var5, 0, 0, 0, 100, false);
            }
            class322.method2763();
            client.method5699().method6419(false);
            Statics.field927 = true;
            field928 = (Statics.field1700 - 765) / 2;
            field930 = field928 + 202;
            Statics.field236 = field930 + 180;
            Statics.field4666.method8898(field928, 0);
            Statics.field931.method8898(field928 + 382, 0);
            Statics.field4503.method8868(field928 + 382 - Statics.field4503.field5321 / 2, 18);
        } else if (arg3 == 4) {
            method3602(4);
        }
    }

    @ObfuscatedName("eq.at(I)Ljava/lang/String;")
    public static String method2792() {
        return Statics.field1336.method2349() ? class407.method2917(field945) : field945;
    }

    @ObfuscatedName("aw.an(I)V")
    public static void method43() {
        if (field945 != null && field945.length() > 0) {
            return;
        }
        if (Statics.field1336.method2435() == null) {
            client.field643 = false;
        } else {
            field945 = Statics.field1336.method2435();
            client.field643 = true;
        }
    }

    @ObfuscatedName("ou.ao(Loc;II)V")
    public static void method6449(class379 arg0, int arg1) {
        if ((arg1 & class531.field5202.method38()) != 0) {
            Statics.field4503 = class550.method3016(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class531.field5193.method38()) != 0) {
            Statics.field4503 = class550.method3016(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class531.field5198.method38()) == 0) {
            Statics.field4503 = class550.method3016(arg0, "logo", "");
        } else {
            Statics.field4503 = class550.method3016(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("rh.ab(I)V")
    public static void method7413() {
        if (client.field643 && field945 != null && field945.length() > 0) {
            field953 = 1;
        } else {
            field953 = 0;
        }
    }

    @ObfuscatedName("nk.aw(Lbx;Lpx;Lpx;I)V")
    public static void method6208(class35 arg0, class414 arg1, class414 arg2) {
        if (field957) {
            class229 var3 = client.method8333();
            while (true) {
                if (!var3.method3986()) {
                    if (class36.field224 != 1 && (Statics.field4580 || class36.field224 != 4)) {
                        break;
                    }
                    int var4 = field928 + 280;
                    if (class36.field212 >= var4 && class36.field212 <= var4 + 14 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(0, 0);
                        break;
                    }
                    if (class36.field212 >= var4 + 15 && class36.field212 <= var4 + 80 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(0, 1);
                        break;
                    }
                    int var5 = field928 + 390;
                    if (class36.field212 >= var5 && class36.field212 <= var5 + 14 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(1, 0);
                        break;
                    }
                    if (class36.field212 >= var5 + 15 && class36.field212 <= var5 + 80 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(1, 1);
                        break;
                    }
                    int var6 = field928 + 500;
                    if (class36.field212 >= var6 && class36.field212 <= var6 + 14 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(2, 0);
                        break;
                    }
                    if (class36.field212 >= var6 + 15 && class36.field212 <= var6 + 80 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(2, 1);
                        break;
                    }
                    int var7 = field928 + 610;
                    if (class36.field212 >= var7 && class36.field212 <= var7 + 14 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(3, 0);
                        break;
                    }
                    if (class36.field212 >= var7 + 15 && class36.field212 <= var7 + 80 && class36.field228 >= 4 && class36.field228 <= 18) {
                        class69.method2108(3, 1);
                        break;
                    }
                    if (class36.field212 >= field928 + 708 && class36.field228 >= 4 && class36.field212 <= field928 + 708 + 50 && class36.field228 <= 20) {
                        method5659();
                        break;
                    }
                    if (field940 == -1) {
                        if (field943 > 0 && Statics.field5298 != null && class36.field212 >= 0 && class36.field212 <= Statics.field5298.field5321 && class36.field228 >= Statics.field3661 / 2 - 50 && class36.field228 <= Statics.field3661 / 2 + 50) {
                            field943--;
                        }
                        if (field943 < field933 && Statics.field3913 != null && class36.field212 >= Statics.field1700 - Statics.field3913.field5321 - 5 && class36.field212 <= Statics.field1700 && class36.field228 >= Statics.field3661 / 2 - 50 && class36.field228 <= Statics.field3661 / 2 + 50) {
                            field943++;
                        }
                    } else {
                        class69 var8 = Statics.field820[field940];
                        int var9 = client.field510;
                        class531 var10 = class531.field5204;
                        boolean var11 = (var9 & var10.method38()) != 0;
                        boolean var13 = var8.method1735();
                        Statics.field461 = var13;
                        var8.field832 = var13 ? "beta" : var8.field832;
                        method424(var8);
                        method5659();
                        if (var11 != var13) {
                            client.method7320();
                        }
                    }
                    break;
                }
                if (var3.field2441 == 13) {
                    method5659();
                    break;
                }
                if (var3.field2441 == 96) {
                    if (field943 > 0 && Statics.field5298 != null) {
                        field943--;
                    }
                } else if (var3.field2441 == 97 && field943 < field933 && Statics.field3913 != null) {
                    field943++;
                }
            }
            return;
        }
        if ((class36.field224 == 1 || !Statics.field4580 && class36.field224 == 4) && class36.field212 >= field928 + 765 - 50 && class36.field228 >= 453) {
            Statics.field1336.method2408(!Statics.field1336.method2351());
            if (Statics.field1336.method2351()) {
                class322.method104(0, 0);
            } else {
                ArrayList var14 = new ArrayList();
                var14.add(new class334(Statics.field1509, "scape main", "", 255, false));
                class322.method4517(var14, 0, 0, 0, 100, false);
            }
            class322.method2763();
        }
        if (client.field519 == 5) {
            return;
        }
        if (field960 == -1L) {
            field960 = class318.method3596() + 1000L;
        }
        long var15 = class318.method3596();
        boolean var17;
        if (client.field812 == null || client.field813 >= client.field812.size()) {
            var17 = true;
        } else {
            while (true) {
                if (client.field813 >= client.field812.size()) {
                    var17 = true;
                    break;
                }
                class85 var18 = (class85) client.field812.get(client.field813);
                if (!var18.method2179()) {
                    var17 = false;
                    break;
                }
                client.field813++;
            }
        }
        if (var17 && field961 == -1L) {
            field961 = var15;
            if (field961 > field960) {
                field960 = field961;
            }
        }
        if (client.field519 != 10 && client.field519 != 11) {
            return;
        }
        if (Statics.field896 == class394.field4520) {
            if (class36.field224 == 1 || !Statics.field4580 && class36.field224 == 4) {
                int var19 = field928 + 5;
                short var20 = 463;
                byte var21 = 100;
                byte var22 = 35;
                if (class36.field212 >= var19 && class36.field212 <= var19 + var21 && class36.field228 >= var20 && class36.field228 <= var20 + var22) {
                    method2824();
                    return;
                }
            }
            if (Statics.field5188 != null) {
                method2824();
            }
        }
        int var23 = class36.field224;
        int var24 = class36.field212;
        int var25 = class36.field228;
        if (var23 == 0) {
            var24 = class36.field217;
            var25 = class36.field218;
        }
        if (!Statics.field4580 && var23 == 4) {
            var23 = 1;
        }
        class229 var26 = client.method8333();
        if (field959 == 0) {
            boolean var27 = false;
            while (var26.method3986()) {
                if (var26.field2441 == 84) {
                    var27 = true;
                }
            }
            int var28 = Statics.field236 - 80;
            short var29 = 291;
            if (var23 == 1 && var24 >= var28 - 75 && var24 <= var28 + 75 && var25 >= var29 - 20 && var25 <= var29 + 20) {
                class32.method2865(client.method4827("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var30 = Statics.field236 + 80;
            if (var23 == 1 && var24 >= var30 - 75 && var24 <= var30 + 75 && var25 >= var29 - 20 && var25 <= var29 + 20 || var27) {
                method3996();
            }
        } else if (field959 == 1) {
            while (true) {
                if (!var26.method3986()) {
                    int var31 = Statics.field236 - 80;
                    short var32 = 321;
                    if (var23 == 1 && var24 >= var31 - 75 && var24 <= var31 + 75 && var25 >= var32 - 20 && var25 <= var32 + 20) {
                        method2876(false);
                    }
                    int var33 = Statics.field236 + 80;
                    if (var23 == 1 && var24 >= var33 - 75 && var24 <= var33 + 75 && var25 >= var32 - 20 && var25 <= var32 + 20) {
                        method3602(0);
                    }
                    break;
                }
                if (var26.field2441 == 84) {
                    method2876(false);
                } else if (var26.field2441 == 13) {
                    method3602(0);
                }
            }
        } else if (field959 == 2) {
            short var34 = 201;
            int var129 = var34 + 52;
            if (var23 == 1 && var25 >= var129 - 12 && var25 < var129 + 2) {
                field953 = 0;
            }
            var129 += 15;
            if (var23 == 1 && var25 >= var129 - 12 && var25 < var129 + 2) {
                field953 = 1;
            }
            var129 += 15;
            short var35 = 361;
            if (Statics.field1382 != null) {
                int var36 = Statics.field1382.field4855 / 2;
                if (var23 == 1 && var24 >= Statics.field1382.field4857 - var36 && var24 <= Statics.field1382.field4857 + var36 && var25 >= var35 - 15 && var25 < var35) {
                    switch(field939) {
                        case 1:
                            class32.method2865(class370.field4319, true, false);
                            return;
                        case 2:
                            class32.method2865("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var37 = Statics.field236 - 80;
            short var38 = 321;
            if (var23 == 1 && var24 >= var37 - 75 && var24 <= var37 + 75 && var25 >= var38 - 20 && var25 <= var38 + 20) {
                field945 = field945.trim();
                if (field945.length() == 0) {
                    method1056(class370.field4127, class370.field4055, class370.field4090);
                } else if (field946.length() == 0) {
                    method1056(class370.field4258, class370.field4131, class370.field4132);
                } else {
                    method1056(class370.field4236, class370.field4237, class370.field4223);
                    client.method395(false);
                    client.method4521(20);
                }
                return;
            }
            int var39 = field930 + 180 + 80;
            if (var23 == 1 && var24 >= var39 - 75 && var24 <= var39 + 75 && var25 >= var38 - 20 && var25 <= var38 + 20) {
                method3602(0);
                field945 = "";
                field946 = "";
                Statics.field3629 = 0;
                Statics.field130 = "";
                field952 = true;
            }
            int var40 = Statics.field236 + -117;
            short var41 = 277;
            field950 = var24 >= var40 && var24 < Statics.field229 + var40 && var25 >= var41 && var25 < Statics.field2428 + var41;
            if (var23 == 1 && field950) {
                client.field643 = !client.field643;
                if (!client.field643 && Statics.field1336.method2435() != null) {
                    Statics.field1336.method2364((String) null);
                }
            }
            int var42 = Statics.field236 + 24;
            short var43 = 277;
            field951 = var24 >= var42 && var24 < Statics.field229 + var42 && var25 >= var43 && var25 < Statics.field2428 + var43;
            if (var23 == 1 && field951) {
                Statics.field1336.method2426(!Statics.field1336.method2349());
                if (!Statics.field1336.method2349()) {
                    field945 = "";
                    Statics.field1336.method2364((String) null);
                    method7413();
                }
            }
            label1181: while (true) {
                Transferable var49;
                int var50;
                do {
                    while (true) {
                        label1145: do {
                            while (true) {
                                while (var26.method3986()) {
                                    if (var26.field2441 == 13) {
                                        method3602(0);
                                        field945 = "";
                                        field946 = "";
                                        Statics.field3629 = 0;
                                        Statics.field130 = "";
                                        field952 = true;
                                    } else {
                                        if (field953 != 0) {
                                            continue label1145;
                                        }
                                        char var44 = var26.field2429;
                                        for (int var45 = 0; var45 < field929.length() && var44 != field929.charAt(var45); var45++) {
                                        }
                                        if (var26.field2441 == 85 && field945.length() > 0) {
                                            field945 = field945.substring(0, field945.length() - 1);
                                        }
                                        if (var26.field2441 == 84 || var26.field2441 == 80) {
                                            field953 = 1;
                                        }
                                        char var46 = var26.field2429;
                                        boolean var47 = field929.indexOf(var46) != -1;
                                        if (var47 && field945.length() < 320) {
                                            field945 = field945 + var26.field2429;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field953 != 1);
                        if (var26.field2441 == 85 && field946.length() > 0) {
                            field946 = field946.substring(0, field946.length() - 1);
                        } else if (var26.field2441 == 84 || var26.field2441 == 80) {
                            field953 = 0;
                            if (var26.field2441 == 84) {
                                field945 = field945.trim();
                                if (field945.length() == 0) {
                                    method1056(class370.field4127, class370.field4055, class370.field4090);
                                } else if (field946.length() == 0) {
                                    method1056(class370.field4258, class370.field4131, class370.field4132);
                                } else {
                                    method1056(class370.field4236, class370.field4237, class370.field4223);
                                    client.method395(false);
                                    client.method4521(20);
                                }
                                return;
                            }
                        }
                        if ((var26.method3974(82) || var26.method3974(87)) && var26.field2441 == 67) {
                            Clipboard var48 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var49 = var48.getContents(Statics.field1468);
                            var50 = 20 - field946.length();
                            break;
                        }
                        if (class405.method2464(var26.field2429)) {
                            char var58 = var26.field2429;
                            boolean var59 = field929.indexOf(var58) != -1;
                            if (var59 && field946.length() < 20) {
                                field946 = field946 + var26.field2429;
                            }
                        }
                    }
                } while (var50 <= 0);
                try {
                    String var51 = (String) var49.getTransferData(DataFlavor.stringFlavor);
                    int var52 = Math.min(var50, var51.length());
                    int var53 = 0;
                    while (true) {
                        if (var53 >= var52) {
                            field946 = field946 + var51.substring(0, var52);
                            continue label1181;
                        }
                        if (!class405.method2464(var51.charAt(var53))) {
                            break;
                        }
                        char var54 = var51.charAt(var53);
                        boolean var55 = field929.indexOf(var54) != -1;
                        if (!var55) {
                            break;
                        }
                        var53++;
                    }
                    method3602(3);
                    return;
                } catch (UnsupportedFlavorException var127) {
                } catch (IOException var128) {
                }
            }
        } else if (field959 == 3) {
            int var60 = field930 + 180;
            short var61 = 241;
            class466 var62 = arg1.method7019(25, class370.field4071.length() - 34, class370.field4071, var60, var61);
            if (var23 == 1 && var62.method7622(var24, var25)) {
                class32.method2865(class370.field4300, true, false);
            }
            int var63 = field930 + 180;
            short var64 = 276;
            if (var23 == 1 && var24 >= var63 - 75 && var24 <= var63 + 75 && var25 >= var64 - 20 && var25 <= var64 + 20) {
                method3203(false);
            }
            int var65 = field930 + 180;
            short var66 = 326;
            if (var23 == 1 && var24 >= var65 - 75 && var24 <= var65 + 75 && var25 >= var66 - 20 && var25 <= var66 + 20) {
                class32.method2865(class370.field4319, true, false);
                return;
            }
        } else if (field959 == 4) {
            int var67 = field930 + 180 - 80;
            short var68 = 321;
            if (var23 == 1 && var24 >= var67 - 75 && var24 <= var67 + 75 && var25 >= var68 - 20 && var25 <= var68 + 20) {
                Statics.field130.trim();
                if (Statics.field130.length() == 6) {
                    Statics.field3629 = Integer.parseInt(Statics.field130);
                    Statics.field130 = "";
                    client.method395(true);
                    method1056(class370.field4236, class370.field4237, class370.field4223);
                    client.method4521(20);
                } else {
                    method1056(class370.field4046, class370.field4318, class370.field4027);
                }
                return;
            }
            if (var23 == 1 && var24 >= field930 + 180 - 9 && var24 <= field930 + 180 + 130 && var25 >= 263 && var25 <= 296) {
                field952 = !field952;
            }
            if (var23 == 1 && var24 >= field930 + 180 - 34 && var24 <= field930 + 180 + 34 && var25 >= 351 && var25 <= 363) {
                class32.method2865(class370.field4319, true, false);
            }
            int var69 = field930 + 180 + 80;
            if (var23 == 1 && var24 >= var69 - 75 && var24 <= var69 + 75 && var25 >= var68 - 20 && var25 <= var68 + 20) {
                method3602(0);
                field945 = "";
                field946 = "";
                Statics.field3629 = 0;
                Statics.field130 = "";
            }
            while (var26.method3986()) {
                boolean var70 = false;
                for (int var71 = 0; var71 < field955.length(); var71++) {
                    if (var26.field2429 == field955.charAt(var71)) {
                        var70 = true;
                        break;
                    }
                }
                if (var26.field2441 == 13) {
                    method3602(0);
                    field945 = "";
                    field946 = "";
                    Statics.field3629 = 0;
                    Statics.field130 = "";
                } else {
                    if (var26.field2441 == 85 && Statics.field130.length() > 0) {
                        Statics.field130 = Statics.field130.substring(0, Statics.field130.length() - 1);
                    }
                    if (var26.field2441 == 84) {
                        Statics.field130.trim();
                        if (Statics.field130.length() == 6) {
                            Statics.field3629 = Integer.parseInt(Statics.field130);
                            Statics.field130 = "";
                            client.method395(true);
                            method1056(class370.field4236, class370.field4237, class370.field4223);
                            client.method4521(20);
                        } else {
                            method1056(class370.field4046, class370.field4318, class370.field4027);
                        }
                        return;
                    }
                    if (var70 && Statics.field130.length() < 6) {
                        Statics.field130 = Statics.field130 + var26.field2429;
                    }
                }
            }
        } else if (field959 == 5) {
            int var72 = field930 + 180 - 80;
            short var73 = 321;
            if (var23 == 1 && var24 >= var72 - 75 && var24 <= var72 + 75 && var25 >= var73 - 20 && var25 <= var73 + 20) {
                method5161();
                return;
            }
            int var74 = field930 + 180 + 80;
            if (var23 == 1 && var24 >= var74 - 75 && var24 <= var74 + 75 && var25 >= var73 - 20 && var25 <= var73 + 20) {
                method2876(true);
            }
            short var75 = 361;
            if (Statics.field1627 != null) {
                int var76 = Statics.field1627.field4855 / 2;
                if (var23 == 1 && var24 >= Statics.field1627.field4857 - var76 && var24 <= Statics.field1627.field4857 + var76 && var25 >= var75 - 15 && var25 < var75) {
                    class32.method2865(client.method4827("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var26.method3986()) {
                boolean var77 = false;
                for (int var78 = 0; var78 < field929.length(); var78++) {
                    if (var26.field2429 == field929.charAt(var78)) {
                        var77 = true;
                        break;
                    }
                }
                if (var26.field2441 == 13) {
                    method2876(true);
                } else {
                    if (var26.field2441 == 85 && field945.length() > 0) {
                        field945 = field945.substring(0, field945.length() - 1);
                    }
                    if (var26.field2441 == 84) {
                        method5161();
                        return;
                    }
                    if (var77 && field945.length() < 320) {
                        field945 = field945 + var26.field2429;
                    }
                }
            }
        } else if (field959 == 6) {
            while (true) {
                do {
                    if (!var26.method3986()) {
                        short var79 = 321;
                        if (var23 == 1 && var25 >= var79 - 20 && var25 <= var79 + 20) {
                            method2876(true);
                        }
                        return;
                    }
                } while (var26.field2441 != 84 && var26.field2441 != 13);
                method2876(true);
            }
        } else if (field959 == 7) {
            if (Statics.field3109 && !client.field517) {
                int var80 = Statics.field236 - 150;
                int var81 = var80 + 240 + 25 + 40;
                short var82 = 231;
                int var83 = var82 + 40;
                if (var23 == 1 && var24 >= var80 && var24 <= var81 && var25 >= var82 && var25 <= var83) {
                    int var84 = var80;
                    int var85 = 0;
                    int var86;
                    while (true) {
                        if (var85 >= 8) {
                            var86 = 0;
                            break;
                        }
                        if (var24 <= var84 + 30) {
                            var86 = var85;
                            break;
                        }
                        var84 += 30;
                        var84 += var85 == 1 || var85 == 3 ? 20 : 5;
                        var85++;
                    }
                    field947 = var86;
                }
                int var87 = field930 + 180 - 80;
                short var88 = 321;
                if (var23 == 1 && var24 >= var87 - 75 && var24 <= var87 + 75 && var25 >= var88 - 20 && var25 <= var88 + 20) {
                    boolean var89 = method2874();
                    if (var89) {
                        client.method4521(50);
                        return;
                    }
                }
                int var90 = field930 + 180 + 80;
                if (var23 == 1 && var24 >= var90 - 75 && var24 <= var90 + 75 && var25 >= var88 - 20 && var25 <= var88 + 20) {
                    field932 = new String[8];
                    method2876(true);
                }
                while (var26.method3986()) {
                    if (var26.field2441 == 101) {
                        field932[field947] = null;
                    }
                    if (var26.field2441 == 85) {
                        if (field932[field947] == null && field947 > 0) {
                            field947--;
                        }
                        field932[field947] = null;
                    }
                    if (var26.field2429 >= '0' && var26.field2429 <= '9') {
                        field932[field947] = "" + var26.field2429;
                        if (field947 < 7) {
                            field947++;
                        }
                    }
                    if (var26.field2441 == 84) {
                        boolean var91 = method2874();
                        if (var91) {
                            client.method4521(50);
                        }
                        return;
                    }
                }
            } else {
                int var92 = field930 + 180 - 80;
                short var93 = 321;
                if (var23 == 1 && var24 >= var92 - 75 && var24 <= var92 + 75 && var25 >= var93 - 20 && var25 <= var93 + 20) {
                    class32.method2865(client.method4827("secure", true) + "m=dob/set_dob.ws", true, false);
                    method1056(class370.field4267, class370.field4238, class370.field4269);
                    method3602(6);
                    return;
                }
                int var94 = field930 + 180 + 80;
                if (var23 == 1 && var24 >= var94 - 75 && var24 <= var94 + 75 && var25 >= var93 - 20 && var25 <= var93 + 20) {
                    method2876(true);
                }
            }
        } else if (field959 == 8) {
            int var95 = field930 + 180 - 80;
            short var96 = 321;
            if (var23 == 1 && var24 >= var95 - 75 && var24 <= var95 + 75 && var25 >= var96 - 20 && var25 <= var96 + 20) {
                class32.method2865("https://www.jagex.com/terms/privacy", true, false);
                method1056(class370.field4267, class370.field4238, class370.field4269);
                method3602(6);
                return;
            }
            int var97 = field930 + 180 + 80;
            if (var23 == 1 && var24 >= var97 - 75 && var24 <= var97 + 75 && var25 >= var96 - 20 && var25 <= var96 + 20) {
                method2876(true);
            }
        } else if (field959 == 9) {
            int var98 = field930 + 180;
            short var99 = 311;
            if (var26.field2441 == 84 || var26.field2441 == 13 || var23 == 1 && var24 >= var98 - 75 && var24 <= var98 + 75 && var25 >= var99 - 20 && var25 <= var99 + 20) {
                method3203(false);
            }
        } else if (field959 == 10) {
            int var100 = field930 + 180;
            short var101 = 209;
            if (var26.field2441 == 84 || var23 == 1 && var24 >= var100 - 109 && var24 <= var100 + 109 && var25 >= var101 && var25 <= var101 + 68) {
                method1056(class370.field4236, class370.field4237, class370.field4223);
                client.field811 = class540.field5286;
                client.method395(false);
                client.method4521(20);
            }
        } else if (field959 == 12) {
            int var102 = Statics.field236;
            short var103 = 233;
            class466 var104 = arg2.method7019(0, 30, class370.field4299, var102, var103);
            class466 var105 = arg2.method7019(32, 32, class370.field4299, var102, var103);
            class466 var106 = arg2.method7019(70, 34, class370.field4299, var102, var103);
            int var130 = var103 + 17;
            class466 var107 = arg2.method7019(0, 34, class370.field4281, var102, var130);
            if (var23 == 1) {
                if (var104.method7622(var24, var25)) {
                    class32.method2865("https://www.jagex.com/terms", true, false);
                } else if (var105.method7622(var24, var25)) {
                    class32.method2865("https://www.jagex.com/terms/privacy", true, false);
                } else if (var106.method7622(var24, var25) || var107.method7622(var24, var25)) {
                    class32.method2865("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var108 = Statics.field236 - 80;
            short var109 = 311;
            if (var23 == 1 && var24 >= var108 - 75 && var24 <= var108 + 75 && var25 >= var109 - 20 && var25 <= var109 + 20) {
                Statics.field1336.method2366(client.field514);
                method3203(true);
            }
            int var110 = Statics.field236 + 80;
            if (var23 == 1 && var24 >= var110 - 75 && var24 <= var110 + 75 && var25 >= var109 - 20 && var25 <= var109 + 20) {
                field959 = 13;
            }
        } else if (field959 == 13) {
            int var111 = Statics.field236;
            short var112 = 321;
            if (var23 == 1 && var24 >= var111 - 75 && var24 <= var111 + 75 && var25 >= var112 - 20 && var25 <= var112 + 20) {
                method3203(true);
            }
        } else if (field959 == 14) {
            String var113 = "";
            switch(field958) {
                case 0:
                    var113 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var113 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var113 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method2876(false);
            }
            int var114 = field930 + 180;
            short var115 = 276;
            if (var23 == 1 && var24 >= var114 - 75 && var24 <= var114 + 75 && var25 >= var115 - 20 && var25 <= var115 + 20) {
                class32.method2865(var113, true, false);
                method1056(class370.field4267, class370.field4238, class370.field4269);
                method3602(6);
                return;
            }
            int var116 = field930 + 180;
            short var117 = 326;
            if (var23 == 1 && var24 >= var116 - 75 && var24 <= var116 + 75 && var25 >= var117 - 20 && var25 <= var117 + 20) {
                method2876(false);
            }
        } else if (field959 == 24) {
            int var118 = field930 + 180;
            short var119 = 301;
            if (var23 == 1 && var24 >= var118 - 75 && var24 <= var118 + 75 && var25 >= var119 - 20 && var25 <= var119 + 20) {
                method3203(false);
            }
        } else if (field959 == 32) {
            int var120 = field930 + 180 - 80;
            short var121 = 321;
            if (var23 == 1 && var24 >= var120 - 75 && var24 <= var120 + 75 && var25 >= var121 - 20 && var25 <= var121 + 20) {
                class32.method2865(client.method4827("secure", true) + "m=dob/set_dob.ws", true, false);
                method1056(class370.field4267, class370.field4238, class370.field4269);
                method3602(6);
                return;
            }
            int var122 = field930 + 180 + 80;
            if (var23 == 1 && var24 >= var122 - 75 && var24 <= var122 + 75 && var25 >= var121 - 20 && var25 <= var121 + 20) {
                method2876(true);
            }
        } else if (field959 == 33) {
            int var123 = field930 + 180;
            short var124 = 276;
            if (var23 == 1 && var24 >= var123 - 75 && var24 <= var123 + 75 && var25 >= var124 - 20 && var25 <= var124 + 20) {
                class32.method2865(class370.field4300, true, false);
            }
            int var125 = field930 + 180;
            short var126 = 326;
            if (var23 == 1 && var24 >= var125 - 75 && var24 <= var125 + 75 && var25 >= var126 - 20 && var25 <= var126 + 20) {
                method2876(true);
            }
        }
    }

    @ObfuscatedName("ia.ad(I)V")
    public static void method3996() {
        if ((client.field510 & class531.field5215.method38()) != 0) {
            field941 = "";
            field938 = class370.field4232;
            field948 = class370.field4233;
            field944 = class370.field4234;
            method3602(1);
            method7413();
        } else if ((client.field510 & class531.field5222.method38()) != 0) {
            if ((client.field510 & class531.field5200.method38()) == 0) {
                field938 = class370.field4190;
                field948 = class370.field4224;
                field944 = class370.field4225;
            } else {
                field938 = class370.field4150;
                field948 = class370.field4230;
                field944 = class370.field4308;
            }
            field941 = class370.field4222;
            method3602(1);
            method7413();
        } else if ((client.field510 & class531.field5200.method38()) == 0) {
            method2876(false);
        } else {
            field938 = class370.field4017;
            field948 = class370.field4265;
            field944 = class370.field4228;
            field941 = class370.field4222;
            method3602(1);
            method7413();
        }
    }

    @ObfuscatedName("ff.al(I)Z")
    public static boolean method2874() {
        Date var0;
        try {
            var0 = method651();
        } catch (ParseException var4) {
            Statics.method2986("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        boolean var2 = method3097(var0);
        boolean var3 = method6044(var0);
        if (!var3) {
            Statics.method2986("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var2) {
            Statics.field3604 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field3604 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("nz.as(Ljava/util/Date;I)Z")
    public static boolean method6044(Date arg0) {
        Date var1 = method8391();
        return arg0.after(var1);
    }

    @ObfuscatedName("uu.ag(I)Ljava/util/Date;")
    public static Date method8391() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("gb.ai(Ljava/util/Date;I)Z")
    public static boolean method3097(Date arg0) {
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

    @ObfuscatedName("bl.ar(B)Ljava/util/Date;")
    public static Date method651() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field932;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                Statics.method2986("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("ff.aj(ZI)V")
    public static void method2876(boolean arg0) {
        if (Statics.field1468.method1442() || Statics.field1468.method1146() || Statics.field1468.method1145()) {
            method3602(10);
            return;
        }
        field938 = class370.field4219;
        field948 = class370.field4220;
        field944 = class370.field4221;
        method3602(2);
        if (arg0) {
            field946 = "";
        }
        method43();
        method7413();
    }

    @ObfuscatedName("gy.au(ZB)V")
    public static void method3203(boolean arg0) {
        byte var1 = 0;
        if (!Statics.method97()) {
            var1 = 12;
        } else if (Statics.field1468.method1442() || Statics.field1468.method1146() || Statics.field1468.method1145()) {
            var1 = 10;
        }
        method3602(var1);
        if (arg0) {
            field945 = "";
            field946 = "";
            Statics.field3629 = 0;
            Statics.field130 = "";
        }
        method43();
        method7413();
    }

    @ObfuscatedName("kq.ay(I)V")
    public static void method5161() {
        field945 = field945.trim();
        if (field945.length() == 0) {
            method1056(class370.field4107, class370.field4271, class370.field4312);
            return;
        }
        long var0 = class74.method5654();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field945;
            Random var4 = new Random();
            class535 var5 = new class535(128);
            class535 var6 = new class535(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method8445(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method8448(var4.nextInt());
            }
            var5.method8448(var7[0]);
            var5.method8448(var7[1]);
            var5.method8450(var0);
            var5.method8450(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method8448(var4.nextInt());
            }
            var5.method8489(class74.field899, class74.field903);
            var6.method8445(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method8448(var4.nextInt());
            }
            var6.method8450(var4.nextLong());
            var6.method8442(var4.nextLong());
            if (client.field595 == null) {
                byte[] var11 = class176.method2226();
                var6.method8455(var11, 0, var11.length);
            } else {
                var6.method8455(client.field595, 0, client.field595.length);
            }
            var6.method8450(var4.nextLong());
            var6.method8489(class74.field899, class74.field903);
            int var12 = class535.method3943(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class535 var13 = new class535(var12);
            var13.method8452(var3);
            var13.field5233 = var12;
            var13.method8485(var7);
            class535 var14 = new class535(var13.field5233 + var6.field5233 + var5.field5233 + 5);
            var14.method8445(2);
            var14.method8445(var5.field5233);
            var14.method8455(var5.field5231, 0, var5.field5233);
            var14.method8445(var6.field5233);
            var14.method8455(var6.field5231, 0, var6.field5233);
            var14.method8446(var13.field5233);
            var14.method8455(var13.field5231, 0, var13.field5233);
            String var15 = class406.method2875(var14.field5231);
            byte var22;
            try {
                URL var16 = new URL(client.method4827("services", false) + "m=accountappeal/login.ws");
                URLConnection var17 = var16.openConnection();
                var17.setDoInput(true);
                var17.setDoOutput(true);
                var17.setConnectTimeout(5000);
                OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
                var18.write("data2=" + class560.method4037(var15) + "&dest=" + class560.method4037("passwordchoice.ws"));
                var18.flush();
                InputStream var19 = var17.getInputStream();
                class535 var20 = new class535(new byte[1000]);
                while (true) {
                    int var21 = var19.read(var20.field5231, var20.field5233, 1000 - var20.field5233);
                    if (var21 == -1) {
                        var18.close();
                        var19.close();
                        String var23 = new String(var20.field5231);
                        if (var23.startsWith("OFFLINE")) {
                            var22 = 4;
                        } else if (var23.startsWith("WRONG")) {
                            var22 = 7;
                        } else if (var23.startsWith("RELOAD")) {
                            var22 = 3;
                        } else if (var23.startsWith("Not permitted for social network accounts.")) {
                            var22 = 6;
                        } else {
                            var20.method8486(var7);
                            while (var20.field5233 > 0 && var20.field5231[var20.field5233 - 1] == 0) {
                                var20.field5233--;
                            }
                            String var24 = new String(var20.field5231, 0, var20.field5233);
                            if (class74.method2585(var24)) {
                                class32.method2865(var24, true, false);
                                var22 = 2;
                            } else {
                                var22 = 5;
                            }
                        }
                        break;
                    }
                    var20.field5233 += var21;
                    if (var20.field5233 >= 1000) {
                        var22 = 5;
                        break;
                    }
                }
            } catch (Throwable var26) {
                var26.printStackTrace();
                var22 = 5;
            }
            var2 = var22;
        }
        switch(var2) {
            case 2:
                method1056(class370.field4128, class370.field4274, class370.field4275);
                method3602(6);
                break;
            case 3:
                method1056(class370.field4276, class370.field4277, class370.field4278);
                break;
            case 4:
                method1056(class370.field4279, class370.field4280, class370.field4197);
                break;
            case 5:
                method1056(class370.field4282, class370.field4283, class370.field4250);
                break;
            case 6:
                method1056(class370.field4285, class370.field4286, class370.field4009);
                break;
            case 7:
                method1056(class370.field4288, class370.field4037, class370.field4199);
        }
    }

    @ObfuscatedName("og.ap(Lpx;Lpx;Lpx;B)V")
    public static void method6495(class414 arg0, class414 arg1, class414 arg2) {
        field928 = (Statics.field1700 - 765) / 2;
        field930 = field928 + 202;
        Statics.field236 = field930 + 180;
        if (field957) {
            if (Statics.field3553 == null) {
                class376 var3 = Statics.field202;
                class549[] var4;
                if (var3.method6411("sl_back", "")) {
                    int var5 = var3.method6386("sl_back");
                    int var6 = var3.method6345(var5, "");
                    var4 = class550.method2272(var3, var5, var6);
                } else {
                    var4 = null;
                }
                Statics.field3553 = var4;
            }
            if (Statics.field8 == null) {
                Statics.field8 = class550.method7006(Statics.field202, "sl_flags", "");
            }
            if (Statics.field1628 == null) {
                Statics.field1628 = class550.method7006(Statics.field202, "sl_arrows", "");
            }
            if (Statics.field22 == null) {
                Statics.field22 = class550.method7006(Statics.field202, "sl_stars", "");
            }
            if (Statics.field5298 == null) {
                Statics.field5298 = class550.method3016(Statics.field202, "leftarrow", "");
            }
            if (Statics.field3913 == null) {
                Statics.field3913 = class550.method3016(Statics.field202, "rightarrow", "");
            }
            class545.method8784(field928, 23, 765, 480, 0);
            class545.method8785(field928, 0, 125, 23, 12425273, 9135624);
            class545.method8785(field928 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method7104(class370.field4306, field928 + 62, 15, 0, -1);
            if (Statics.field22 != null) {
                Statics.field22[1].method8868(field928 + 140, 1);
                arg1.method7017(class370.field4307, field928 + 152, 10, 16777215, -1);
                Statics.field22[0].method8868(field928 + 140, 12);
                arg1.method7017(class370.field4211, field928 + 152, 21, 16777215, -1);
            }
            if (Statics.field1628 != null) {
                int var7 = field928 + 280;
                if (class69.field824[0] == 0 && class69.field823[0] == 0) {
                    Statics.field1628[2].method8868(var7, 4);
                } else {
                    Statics.field1628[0].method8868(var7, 4);
                }
                if (class69.field824[0] == 0 && class69.field823[0] == 1) {
                    Statics.field1628[3].method8868(var7 + 15, 4);
                } else {
                    Statics.field1628[1].method8868(var7 + 15, 4);
                }
                arg0.method7017(class370.field4309, var7 + 32, 17, 16777215, -1);
                int var8 = field928 + 390;
                if (class69.field824[0] == 1 && class69.field823[0] == 0) {
                    Statics.field1628[2].method8868(var8, 4);
                } else {
                    Statics.field1628[0].method8868(var8, 4);
                }
                if (class69.field824[0] == 1 && class69.field823[0] == 1) {
                    Statics.field1628[3].method8868(var8 + 15, 4);
                } else {
                    Statics.field1628[1].method8868(var8 + 15, 4);
                }
                arg0.method7017(class370.field4054, var8 + 32, 17, 16777215, -1);
                int var9 = field928 + 500;
                if (class69.field824[0] == 2 && class69.field823[0] == 0) {
                    Statics.field1628[2].method8868(var9, 4);
                } else {
                    Statics.field1628[0].method8868(var9, 4);
                }
                if (class69.field824[0] == 2 && class69.field823[0] == 1) {
                    Statics.field1628[3].method8868(var9 + 15, 4);
                } else {
                    Statics.field1628[1].method8868(var9 + 15, 4);
                }
                arg0.method7017(class370.field4155, var9 + 32, 17, 16777215, -1);
                int var10 = field928 + 610;
                if (class69.field824[0] == 3 && class69.field823[0] == 0) {
                    Statics.field1628[2].method8868(var10, 4);
                } else {
                    Statics.field1628[0].method8868(var10, 4);
                }
                if (class69.field824[0] == 3 && class69.field823[0] == 1) {
                    Statics.field1628[3].method8868(var10 + 15, 4);
                } else {
                    Statics.field1628[1].method8868(var10 + 15, 4);
                }
                arg0.method7017(class370.field4117, var10 + 32, 17, 16777215, -1);
            }
            class545.method8784(field928 + 708, 4, 50, 16, 0);
            arg1.method7104(class370.field4252, field928 + 708 + 25, 16, 16777215, -1);
            field940 = -1;
            if (Statics.field3553 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class69.field822) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class69.field822) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class69.field822) {
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
                int var21 = (class69.field822 + var14 - 1) / var14;
                field933 = var21 - var13;
                if (Statics.field5298 != null && field943 > 0) {
                    Statics.field5298.method8868(8, Statics.field3661 / 2 - Statics.field5298.field5324 / 2);
                }
                if (Statics.field3913 != null && field943 < field933) {
                    Statics.field3913.method8868(Statics.field1700 - Statics.field3913.field5321 - 8, Statics.field3661 / 2 - Statics.field3913.field5324 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field928 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field943;
                for (int var27 = var14 * var26; var27 < class69.field822 && var26 - field943 < var13; var27++) {
                    class69 var28 = Statics.field820[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field827);
                    if (var28.field827 == -1) {
                        var30 = class370.field4313;
                        var29 = false;
                    } else if (var28.field827 > 1980) {
                        var30 = class370.field4314;
                        var29 = false;
                    }
                    class110 var31 = null;
                    int var32 = 0;
                    if (var28.method1708()) {
                        var31 = var28.method1703() ? class110.field1406 : class110.field1417;
                    } else if (var28.method1735()) {
                        var31 = var28.method1703() ? class110.field1414 : class110.field1399;
                    } else if (var28.method1729()) {
                        var32 = 16711680;
                        var31 = var28.method1703() ? class110.field1404 : class110.field1413;
                    } else if (var28.method1707()) {
                        var31 = var28.method1703() ? class110.field1408 : class110.field1405;
                    } else if (var28.method1705()) {
                        var31 = var28.method1703() ? class110.field1402 : class110.field1401;
                    } else if (var28.method1712()) {
                        var31 = var28.method1703() ? class110.field1410 : class110.field1409;
                    } else if (var28.method1706()) {
                        var31 = var28.method1703() ? class110.field1412 : class110.field1407;
                    }
                    if (var31 == null || var31.field1415 >= Statics.field3553.length) {
                        var31 = var28.method1703() ? class110.field1418 : class110.field1411;
                    }
                    if (class36.field217 >= var23 && class36.field218 >= var22 && class36.field217 < var11 + var23 && class36.field218 < var12 + var22 && var29) {
                        field940 = var27;
                        Statics.field3553[var31.field1415].method8968(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field3553[var31.field1415].method8898(var23, var22);
                    }
                    if (Statics.field8 != null) {
                        Statics.field8[(var28.method1703() ? 8 : 0) + var28.field830].method8868(var23 + 29, var22);
                    }
                    arg0.method7104(Integer.toString(var28.field818), var23 + 15, var12 / 2 + var22 + 5, var32, -1);
                    arg1.method7104(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
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
                    int var33 = arg1.method7062(Statics.field820[field940].field829) + 6;
                    int var34 = arg1.field4617 + 8;
                    int var35 = class36.field218 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class36.field218 - 25 - var34;
                    }
                    class545.method8784(class36.field217 - var33 / 2, var35, var33, var34, 16777120);
                    class545.method8825(class36.field217 - var33 / 2, var35, var33, var34, 0);
                    arg1.method7104(Statics.field820[field940].field829, class36.field217, arg1.field4617 + var35 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field4666.method8898(field928, 0);
        Statics.field931.method8898(field928 + 382, 0);
        Statics.field4503.method8868(field928 + 382 - Statics.field4503.field5321 / 2, 18);
        if (client.field519 == 0 || client.field519 == 5) {
            byte var36 = 20;
            arg0.method7104(class370.field4291, field930 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class545.method8825(field930 + 180 - 152, var37, 304, 34, 9179409);
            class545.method8825(field930 + 180 - 151, var37 + 1, 302, 32, 0);
            class545.method8784(field930 + 180 - 150, var37 + 2, field934 * 3, 30, 9179409);
            class545.method8784(field934 * 3 + (field930 + 180 - 150), var37 + 2, 300 - field934 * 3, 30, 0);
            arg0.method7104(field935, field930 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field519 == 20) {
            Statics.field937.method8868(field930 + 180 - Statics.field937.field5321 / 2, 271 - Statics.field937.field5324 / 2);
            short var38 = 201;
            arg0.method7104(field938, field930 + 180, var38, 16776960, 0);
            int var146 = var38 + 15;
            arg0.method7104(field948, field930 + 180, var146, 16776960, 0);
            int var147 = var146 + 15;
            arg0.method7104(field944, field930 + 180, var147, 16776960, 0);
            int var148 = var147 + 15;
            int var149 = var148 + 7;
            if (field959 != 4 && field959 != 10) {
                arg0.method7017(class370.field4245, field930 + 180 - 110, var149, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = method2792(); arg0.method7062(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method7017(class418.method7015(var40), field930 + 180 - 70, var149, 16777215, 0);
                var146 = var149 + 15;
                String var41;
                for (var41 = class407.method2917(field946); arg0.method7062(var41) > var39; var41 = var41.substring(1)) {
                }
                arg0.method7017(class370.field4246 + var41, field930 + 180 - 108, var146, 16777215, 0);
                var146 += 15;
            }
        }
        if (client.field519 == 10 || client.field519 == 11 || client.field519 == 50) {
            Statics.field937.method8868(field930, 171);
            if (field959 == 0) {
                short var42 = 251;
                arg0.method7104(class370.field4248, field930 + 180, var42, 16776960, 0);
                int var150 = var42 + 30;
                int var43 = field930 + 180 - 80;
                short var44 = 291;
                Statics.field926.method8868(var43 - 73, var44 - 20);
                arg0.method7021(class370.field4303, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var45 = field930 + 180 + 80;
                Statics.field926.method8868(var45 - 73, var44 - 20);
                arg0.method7021(class370.field4075, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field959 == 1) {
                arg0.method7104(field941, field930 + 180, 201, 16776960, 0);
                short var46 = 236;
                arg0.method7104(field938, field930 + 180, var46, 16777215, 0);
                int var151 = var46 + 15;
                arg0.method7104(field948, field930 + 180, var151, 16777215, 0);
                int var152 = var151 + 15;
                arg0.method7104(field944, field930 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                int var47 = field930 + 180 - 80;
                short var48 = 321;
                Statics.field926.method8868(var47 - 73, var48 - 20);
                arg0.method7104(class370.field4013, var47, var48 + 5, 16777215, 0);
                int var49 = field930 + 180 + 80;
                Statics.field926.method8868(var49 - 73, var48 - 20);
                arg0.method7104(class370.field4252, var49, var48 + 5, 16777215, 0);
            } else if (field959 == 2) {
                short var50 = 201;
                arg0.method7104(field938, Statics.field236, var50, 16776960, 0);
                int var154 = var50 + 15;
                arg0.method7104(field948, Statics.field236, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg0.method7104(field944, Statics.field236, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var157 = var156 + 7;
                arg0.method7017(class370.field4245, Statics.field236 - 110, var157, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = method2792(); arg0.method7062(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method7017(class418.method7015(var52) + (field953 == 0 & client.field523 % 40 < 20 ? class103.method1026(16776960) + class103.field1343 : ""), Statics.field236 - 70, var157, 16777215, 0);
                var154 = var157 + 15;
                String var53;
                for (var53 = class407.method2917(field946); arg0.method7062(var53) > var51; var53 = var53.substring(1)) {
                }
                arg0.method7017(class370.field4246 + var53 + (field953 == 1 & client.field523 % 40 < 20 ? class103.method1026(16776960) + class103.field1343 : ""), Statics.field236 - 108, var154, 16777215, 0);
                var154 += 15;
                short var54 = 277;
                int var55 = Statics.field236 + -117;
                boolean var56 = client.field643;
                boolean var57 = field950;
                class548 var58 = var56 ? (var57 ? Statics.field4752 : Statics.field1659) : (var57 ? Statics.field4812 : Statics.field126);
                var58.method8868(var55, var54);
                int var60 = var58.field5321 + 5 + var55;
                arg1.method7017(class370.field4253, var60, var54 + 13, 16776960, 0);
                int var61 = Statics.field236 + 24;
                boolean var62 = Statics.field1336.method2349();
                boolean var63 = field951;
                class548 var64 = var62 ? (var63 ? Statics.field4752 : Statics.field1659) : (var63 ? Statics.field4812 : Statics.field126);
                var64.method8868(var61, var54);
                int var66 = var64.field5321 + 5 + var61;
                arg1.method7017(class370.field4254, var66, var54 + 13, 16776960, 0);
                int var158 = var54 + 15;
                int var67 = Statics.field236 - 80;
                short var68 = 321;
                Statics.field926.method8868(var67 - 73, var68 - 20);
                arg0.method7104(class370.field4021, var67, var68 + 5, 16777215, 0);
                int var69 = Statics.field236 + 80;
                Statics.field926.method8868(var69 - 73, var68 - 20);
                arg0.method7104(class370.field4252, var69, var68 + 5, 16777215, 0);
                short var70 = 357;
                switch(field939) {
                    case 2:
                        Statics.field1172 = class370.field4178;
                        break;
                    default:
                        Statics.field1172 = class370.field4264;
                }
                Statics.field1382 = new class466(Statics.field236, var70, arg1.method7062(Statics.field1172), 11);
                Statics.field1627 = new class466(Statics.field236, var70, arg1.method7062(class370.field4115), 11);
                arg1.method7104(Statics.field1172, Statics.field236, var70, 16777215, 0);
            } else if (field959 == 3) {
                short var71 = 201;
                arg0.method7104(class370.field4255, field930 + 180, var71, 16776960, 0);
                int var159 = var71 + 20;
                arg1.method7104(class370.field4256, field930 + 180, var159, 16776960, 0);
                int var160 = var159 + 20;
                arg1.method7104(class370.field4071, field930 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var72 = field930 + 180;
                short var73 = 276;
                Statics.field926.method8868(var72 - 73, var73 - 20);
                arg2.method7104(class370.field4249, var72, var73 + 5, 16777215, 0);
                int var74 = field930 + 180;
                short var75 = 326;
                Statics.field926.method8868(var74 - 73, var75 - 20);
                arg2.method7104(class370.field4266, var74, var75 + 5, 16777215, 0);
            } else if (field959 == 4) {
                arg0.method7104(class370.field4257, field930 + 180, 201, 16776960, 0);
                short var76 = 236;
                arg0.method7104(field938, field930 + 180, var76, 16777215, 0);
                int var162 = var76 + 15;
                arg0.method7104(field948, field930 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method7104(field944, field930 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                arg0.method7017(class370.field4247 + class407.method2917(Statics.field130) + (client.field523 % 40 < 20 ? class103.method1026(16776960) + class103.field1343 : ""), field930 + 180 - 108, var164, 16777215, 0);
                int var165 = var164 - 8;
                arg0.method7017(class370.field4016, field930 + 180 - 9, var165, 16776960, 0);
                int var166 = var165 + 15;
                arg0.method7017(class370.field4193, field930 + 180 - 9, var166, 16776960, 0);
                int var77 = field930 + 180 - 9 + arg0.method7062(class370.field4193) + 15;
                int var78 = var166 - arg0.field4617;
                class548 var79;
                if (field952) {
                    var79 = Statics.field1659;
                } else {
                    var79 = Statics.field126;
                }
                var79.method8868(var77, var78);
                var162 = var166 + 15;
                int var80 = field930 + 180 - 80;
                short var81 = 321;
                Statics.field926.method8868(var80 - 73, var81 - 20);
                arg0.method7104(class370.field4013, var80, var81 + 5, 16777215, 0);
                int var82 = field930 + 180 + 80;
                Statics.field926.method8868(var82 - 73, var81 - 20);
                arg0.method7104(class370.field4252, var82, var81 + 5, 16777215, 0);
                arg1.method7104(class370.field4264, field930 + 180, var81 + 36, 16777215, 0);
            } else if (field959 == 5) {
                arg0.method7104(class370.field4105, field930 + 180, 201, 16776960, 0);
                short var83 = 221;
                arg2.method7104(field938, field930 + 180, var83, 16776960, 0);
                int var167 = var83 + 15;
                arg2.method7104(field948, field930 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                arg2.method7104(field944, field930 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                int var170 = var169 + 14;
                arg0.method7017(class370.field4051, field930 + 180 - 145, var170, 16777215, 0);
                short var84 = 174;
                String var85;
                for (var85 = method2792(); arg0.method7062(var85) > var84; var85 = var85.substring(1)) {
                }
                arg0.method7017(class418.method7015(var85) + (client.field523 % 40 < 20 ? class103.method1026(16776960) + class103.field1343 : ""), field930 + 180 - 34, var170, 16777215, 0);
                var167 = var170 + 15;
                int var86 = field930 + 180 - 80;
                short var87 = 321;
                Statics.field926.method8868(var86 - 73, var87 - 20);
                arg0.method7104(class370.field4262, var86, var87 + 5, 16777215, 0);
                int var88 = field930 + 180 + 80;
                Statics.field926.method8868(var88 - 73, var87 - 20);
                arg0.method7104(class370.field4263, var88, var87 + 5, 16777215, 0);
                short var89 = 356;
                arg1.method7104(class370.field4115, Statics.field236, var89, 268435455, 0);
            } else if (field959 == 6) {
                short var90 = 201;
                arg0.method7104(field938, field930 + 180, var90, 16776960, 0);
                int var171 = var90 + 15;
                arg0.method7104(field948, field930 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg0.method7104(field944, field930 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var91 = field930 + 180;
                short var92 = 321;
                Statics.field926.method8868(var91 - 73, var92 - 20);
                arg0.method7104(class370.field4263, var91, var92 + 5, 16777215, 0);
            } else if (field959 == 7) {
                if (Statics.field3109 && !client.field517) {
                    short var93 = 201;
                    arg0.method7104(field938, Statics.field236, var93, 16776960, 0);
                    int var174 = var93 + 15;
                    arg0.method7104(field948, Statics.field236, var174, 16776960, 0);
                    int var175 = var174 + 15;
                    arg0.method7104(field944, Statics.field236, var175, 16776960, 0);
                    int var94 = Statics.field236 - 150;
                    int var176 = var175 + 10;
                    for (int var95 = 0; var95 < 8; var95++) {
                        Statics.field926.method8871(var94, var176, 30, 40);
                        boolean var96 = field947 == var95 & client.field523 % 40 < 20;
                        arg0.method7017((field932[var95] == null ? "" : field932[var95]) + (var96 ? class103.method1026(16776960) + class103.field1343 : ""), var94 + 10, var176 + 27, 16777215, 0);
                        if (var95 == 1 || var95 == 3) {
                            var94 += 50;
                            arg0.method7017(class418.method7015("/"), var94 - 13, var176 + 27, 16777215, 0);
                        } else {
                            var94 += 35;
                        }
                    }
                    int var97 = Statics.field236 - 80;
                    short var98 = 321;
                    Statics.field926.method8868(var97 - 73, var98 - 20);
                    arg0.method7104("Submit", var97, var98 + 5, 16777215, 0);
                    int var99 = Statics.field236 + 80;
                    Statics.field926.method8868(var99 - 73, var98 - 20);
                    arg0.method7104(class370.field4252, var99, var98 + 5, 16777215, 0);
                } else {
                    short var100 = 216;
                    arg0.method7104(class370.field4179, field930 + 180, var100, 16776960, 0);
                    int var177 = var100 + 15;
                    arg2.method7104(class370.field4292, field930 + 180, var177, 16776960, 0);
                    int var178 = var177 + 15;
                    arg2.method7104(class370.field4293, field930 + 180, var178, 16776960, 0);
                    int var179 = var178 + 15;
                    int var101 = field930 + 180 - 80;
                    short var102 = 321;
                    Statics.field926.method8868(var101 - 73, var102 - 20);
                    arg0.method7104(class370.field4294, var101, var102 + 5, 16777215, 0);
                    int var103 = field930 + 180 + 80;
                    Statics.field926.method8868(var103 - 73, var102 - 20);
                    arg0.method7104(class370.field4263, var103, var102 + 5, 16777215, 0);
                }
            } else if (field959 == 8) {
                short var104 = 216;
                arg0.method7104(class370.field4148, field930 + 180, var104, 16776960, 0);
                int var180 = var104 + 15;
                arg2.method7104(class370.field4261, field930 + 180, var180, 16776960, 0);
                int var181 = var180 + 15;
                arg2.method7104(class370.field4049, field930 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                int var105 = field930 + 180 - 80;
                short var106 = 321;
                Statics.field926.method8868(var105 - 73, var106 - 20);
                arg0.method7104(class370.field4151, var105, var106 + 5, 16777215, 0);
                int var107 = field930 + 180 + 80;
                Statics.field926.method8868(var107 - 73, var106 - 20);
                arg0.method7104(class370.field4263, var107, var106 + 5, 16777215, 0);
            } else if (field959 == 9) {
                short var108 = 221;
                arg0.method7104(field938, field930 + 180, var108, 16776960, 0);
                int var183 = var108 + 25;
                arg0.method7104(field948, field930 + 180, var183, 16776960, 0);
                int var184 = var183 + 25;
                arg0.method7104(field944, field930 + 180, var184, 16776960, 0);
                int var109 = field930 + 180;
                short var110 = 311;
                Statics.field926.method8868(var109 - 73, var110 - 20);
                arg0.method7104(class370.field4249, var109, var110 + 5, 16777215, 0);
            } else if (field959 == 10) {
                int var111 = field930 + 180;
                short var112 = 209;
                arg0.method7104(class370.field4248, field930 + 180, var112, 16776960, 0);
                int var185 = var112 + 20;
                Statics.field1066.method8868(var111 - 109, var185);
                if (field954.isEmpty()) {
                    Statics.field1902.method8868(var111 - 48, var185 + 18);
                } else {
                    Statics.field1902.method8868(var111 - 48, var185 + 5);
                    arg0.method7104(field954, var111, var185 + 68 - 15, 16776960, 0);
                }
            } else if (field959 == 12) {
                int var113 = Statics.field236;
                short var114 = 216;
                arg2.method7104(class370.field4298, var113, var114, 16777215, 0);
                int var186 = var114 + 17;
                arg2.method7104(class370.field4299, var113, var186, 16777215, 0);
                int var187 = var186 + 17;
                arg2.method7104(class370.field4281, var113, var187, 16777215, 0);
                int var188 = var187 + 17;
                arg2.method7104(class370.field4301, var113, var188, 16777215, 0);
                int var115 = Statics.field236 - 80;
                short var116 = 311;
                Statics.field926.method8868(var115 - 73, var116 - 20);
                arg0.method7104(class370.field4297, var115, var116 + 5, 16777215, 0);
                int var117 = Statics.field236 + 80;
                Statics.field926.method8868(var117 - 73, var116 - 20);
                arg0.method7104(class370.field4305, var117, var116 + 5, 16777215, 0);
            } else if (field959 == 13) {
                short var118 = 231;
                arg2.method7104(class370.field4302, field930 + 180, var118, 16777215, 0);
                int var189 = var118 + 20;
                arg2.method7104(class370.field4316, field930 + 180, var189, 16777215, 0);
                int var119 = field930 + 180;
                short var120 = 311;
                Statics.field926.method8868(var119 - 73, var120 - 20);
                arg0.method7104(class370.field4263, var119, var120 + 5, 16777215, 0);
            } else if (field959 == 14) {
                short var121 = 201;
                String var122 = "";
                String var123 = "";
                String var124 = "";
                switch(field958) {
                    case 0:
                        var122 = class370.field4061;
                        var123 = class370.field4062;
                        var124 = class370.field4124;
                        break;
                    case 1:
                        var122 = class370.field4100;
                        var123 = class370.field4101;
                        var124 = class370.field4102;
                        break;
                    case 2:
                        var122 = class370.field4136;
                        var123 = class370.field4270;
                        var124 = class370.field4138;
                        break;
                    default:
                        method2876(false);
                }
                arg0.method7104(var122, field930 + 180, var121, 16776960, 0);
                int var190 = var121 + 20;
                arg0.method7104(var123, field930 + 180, var190, 16776960, 0);
                int var191 = var190 + 20;
                arg0.method7104(var124, field930 + 180, var191, 16776960, 0);
                int var125 = field930 + 180;
                short var126 = 276;
                Statics.field926.method8868(var125 - 73, var126 - 20);
                if (field958 == 1) {
                    arg0.method7104(class370.field4045, var125, var126 + 5, 16777215, 0);
                } else {
                    arg0.method7104(class370.field4226, var125, var126 + 5, 16777215, 0);
                }
                int var127 = field930 + 180;
                short var128 = 326;
                Statics.field926.method8868(var127 - 73, var128 - 20);
                arg0.method7104(class370.field4263, var127, var128 + 5, 16777215, 0);
            } else if (field959 == 24) {
                short var129 = 221;
                arg0.method7104(field938, field930 + 180, var129, 16777215, 0);
                int var192 = var129 + 15;
                arg0.method7104(field948, field930 + 180, var192, 16777215, 0);
                int var193 = var192 + 15;
                arg0.method7104(field944, field930 + 180, var193, 16777215, 0);
                int var194 = var193 + 15;
                int var130 = field930 + 180;
                short var131 = 301;
                Statics.field926.method8868(var130 - 73, var131 - 20);
                arg0.method7104(class370.field4011, var130, var131 + 5, 16777215, 0);
            } else if (field959 == 32) {
                short var132 = 216;
                arg0.method7104(class370.field4179, field930 + 180, var132, 16776960, 0);
                int var195 = var132 + 15;
                arg2.method7104(class370.field4292, field930 + 180, var195, 16776960, 0);
                int var196 = var195 + 15;
                arg2.method7104(class370.field4293, field930 + 180, var196, 16776960, 0);
                int var197 = var196 + 15;
                int var133 = field930 + 180 - 80;
                short var134 = 321;
                Statics.field926.method8868(var133 - 73, var134 - 20);
                arg0.method7104(class370.field4294, var133, var134 + 5, 16777215, 0);
                int var135 = field930 + 180 + 80;
                Statics.field926.method8868(var135 - 73, var134 - 20);
                arg0.method7104(class370.field4263, var135, var134 + 5, 16777215, 0);
            } else if (field959 == 33) {
                short var136 = 201;
                arg0.method7104(field938, field930 + 180, var136, 16776960, 0);
                int var198 = var136 + 20;
                arg1.method7104(field948, field930 + 180, var198, 16776960, 0);
                int var199 = var198 + 20;
                arg1.method7104(field944, field930 + 180, var199, 16776960, 0);
                int var200 = var199 + 15;
                int var137 = field930 + 180;
                short var138 = 276;
                Statics.field926.method8868(var137 - 73, var138 - 20);
                arg2.method7104(class370.field4317, var137, var138 + 5, 16777215, 0);
                int var139 = field930 + 180;
                short var140 = 326;
                Statics.field926.method8868(var139 - 73, var140 - 20);
                arg2.method7104(class370.field4263, var139, var140 + 5, 16777215, 0);
            }
        }
        if (client.field519 >= 10) {
            int[] var141 = new int[4];
            class545.method8790(var141);
            class545.method8801(field928, 0, field928 + 765, Statics.field3661);
            Statics.field421.method2323(field928 - 22, client.field523);
            Statics.field421.method2323(field928 + 765 + 22 - 128, client.field523);
            class545.method8842(var141);
        }
        Statics.field476[Statics.field1336.method2351() ? 1 : 0].method8868(field928 + 765 - 40, 463);
        if (client.field519 <= 5 || Statics.field896 != class394.field4520) {
            return;
        }
        if (Statics.field4 == null) {
            Statics.field4 = class550.method3016(Statics.field202, "sl_button", "");
            return;
        }
        int var142 = field928 + 5;
        short var143 = 463;
        byte var144 = 100;
        byte var145 = 35;
        Statics.field4.method8868(var142, var143);
        arg0.method7104(class370.field4188 + " " + client.field509, var144 / 2 + var142, var145 / 2 + var143 - 2, 16777215, 0);
        if (Statics.field5188 == null) {
            arg1.method7104(class370.field4192, var144 / 2 + var142, var145 / 2 + var143 + 12, 16777215, 0);
        } else {
            arg1.method7104(class370.field4022, var144 / 2 + var142, var145 / 2 + var143 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ci.av(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1056(String arg0, String arg1, String arg2) {
        field938 = arg0;
        field948 = arg1;
        field944 = arg2;
    }

    @ObfuscatedName("be.aa(Lck;B)V")
    public static void method424(class69 arg0) {
        if (arg0.method1703() != client.field512) {
            client.field512 = arg0.method1703();
            class223.method1020(arg0.method1703());
        }
        if (client.field510 != arg0.field826) {
            method6449(Statics.field202, arg0.field826);
        }
        Statics.field1815 = arg0.field828;
        client.field509 = arg0.field818;
        client.field510 = arg0.field826;
        Statics.field4670 = arg0.field832;
        Statics.field48 = client.field511 == 0 ? 43594 : arg0.field818 + 40000;
        Statics.field307 = client.field511 == 0 ? 443 : arg0.field818 + 50000;
        Statics.field4958 = Statics.field48;
    }

    @ObfuscatedName("ki.aq(II)V")
    public static void method4832(int arg0) {
        method3602(14);
        field958 = arg0;
    }

    @ObfuscatedName("ev.am(I)V")
    public static void method2824() {
        if (class69.method101()) {
            field957 = true;
            field943 = 0;
            field933 = 0;
        }
    }

    @ObfuscatedName("mt.ac(I)V")
    public static void method5659() {
        field957 = false;
        Statics.field4666.method8898(field928, 0);
        Statics.field931.method8898(field928 + 382, 0);
        Statics.field4503.method8868(field928 + 382 - Statics.field4503.field5321 / 2, 18);
    }

    @ObfuscatedName("ii.ae(II)V")
    public static void method3602(int arg0) {
        if (field959 != arg0) {
            field959 = arg0;
        }
    }

    @ObfuscatedName("hn.ak(ILjava/lang/String;I)V")
    public static void method3528(int arg0, String arg1) {
        field935 = arg1;
        field934 = arg0;
    }
}
