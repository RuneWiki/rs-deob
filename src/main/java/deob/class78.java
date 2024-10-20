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

@ObfuscatedName("cx")
public class class78 {

    @ObfuscatedName("cx.aj")
    public static int field942 = 0;

    @ObfuscatedName("cx.ai")
    public static int field977 = field942 + 202;

    @ObfuscatedName("cx.am")
    public static int field949 = 10;

    @ObfuscatedName("cx.ar")
    public static String field963 = "";

    @ObfuscatedName("cx.bq")
    public static int field948 = -1;

    @ObfuscatedName("cx.bz")
    public static int field950 = 1;

    @ObfuscatedName("cx.cw")
    public static int field953 = 0;

    @ObfuscatedName("cx.ck")
    public static String field954 = "";

    @ObfuscatedName("cx.cn")
    public static String field951 = "";

    @ObfuscatedName("cx.ch")
    public static String field956 = "";

    @ObfuscatedName("cx.cp")
    public static String field972 = "";

    @ObfuscatedName("cx.cd")
    public static String field976 = "";

    @ObfuscatedName("cx.cs")
    public static String field959 = "";

    @ObfuscatedName("cx.ci")
    public static int field974 = 0;

    @ObfuscatedName("cx.cc")
    public static String[] field961 = new String[8];

    @ObfuscatedName("cx.ce")
    public static String field962 = "";

    @ObfuscatedName("cx.cg")
    public static boolean field968 = false;

    @ObfuscatedName("cx.cv")
    public static boolean field964 = false;

    @ObfuscatedName("cx.cx")
    public static boolean field965 = true;

    @ObfuscatedName("cx.dj")
    public static int field966 = 0;

    @ObfuscatedName("cx.dq")
    public static String field967 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cx.dm")
    public static String field973 = "1234567890";

    @ObfuscatedName("cx.db")
    public static boolean field955 = false;

    @ObfuscatedName("cx.dg")
    public static int field970 = -1;

    @ObfuscatedName("cx.du")
    public static int field971 = 0;

    @ObfuscatedName("cx.dc")
    public static int field960 = 0;

    @ObfuscatedName("cx.dn")
    public static long field952;

    @ObfuscatedName("cx.dl")
    public static long field940;

    @ObfuscatedName("cx.dk")
    public static String[] field975;

    @ObfuscatedName("cx.dh")
    public static String[] field957;

    @ObfuscatedName("cx.dy")
    public static String[] field943;

    static {
        new DecimalFormat("##0.00");
        new class138();
        field952 = -1L;
        field940 = -1L;
        field975 = new String[] { "title.jpg" };
        field957 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field943 = new String[] { "logo_speedrunning" };
    }

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ks.ak(Lor;B)I")
    public static int method5268(class387 arg0) {
        int var1 = field975.length + field957.length;
        String[] var2 = field943;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6587(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("mo.al(Lor;Lor;ZII)V")
    public static void method5601(class387 arg0, class387 arg1, boolean arg2, int arg3) {
        if (!Statics.field941) {
            if (arg3 == 0) {
                method2309(arg2);
            } else {
                method3803(arg3);
            }
            class556.method9120();
            byte[] var4 = arg0.method6620("title.jpg", "");
            Statics.field1985 = class31.method7694(var4);
            Statics.field946 = Statics.field1985.method9215();
            method2783(arg1, client.field718);
            Statics.field944 = class561.method7880(arg1, "titlebox", "");
            Statics.field945 = class561.method7880(arg1, "titlebutton", "");
            Statics.field4777 = class561.method7880(arg1, "titlebutton_large", "");
            Statics.field2241 = class561.method7880(arg1, "play_now_text", "");
            class561.method7880(arg1, "titlebutton_wide42,1", "");
            Statics.field958 = class561.method3364(arg1, "runes", "");
            Statics.field4749 = class561.method3364(arg1, "title_mute", "");
            Statics.field4579 = class561.method7880(arg1, "options_radio_buttons,0", "");
            Statics.field947 = class561.method7880(arg1, "options_radio_buttons,4", "");
            Statics.field2099 = class561.method7880(arg1, "options_radio_buttons,2", "");
            Statics.field3711 = class561.method7880(arg1, "options_radio_buttons,6", "");
            Statics.field5197 = Statics.field4579.field5432;
            Statics.field867 = Statics.field4579.field5435;
            Statics.field2546 = new class100(Statics.field958);
            if (arg2) {
                field976 = "";
                field959 = "";
                field961 = new String[8];
                field974 = 0;
            }
            Statics.field4658 = 0;
            Statics.field3141 = "";
            field965 = true;
            field955 = false;
            if (Statics.field4879.method2394()) {
                class330.method6481(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class342(Statics.field3033, "scape main", "", 255, false));
                class330.method1099(var5, 0, 0, 0, 100, false);
            }
            class330.method821();
            class388 var6 = Statics.field33;
            var6.method6670(false);
            Statics.field941 = true;
            field942 = (Statics.field190 - 765) / 2;
            field977 = field942 + 202;
            Statics.field133 = field977 + 180;
            Statics.field1985.method9225(field942, 0);
            Statics.field946.method9225(field942 + 382, 0);
            Statics.field1124.method9196(field942 + 382 - Statics.field1124.field5432 / 2, 18);
        } else if (arg3 == 4) {
            method3803(4);
        }
    }

    @ObfuscatedName("fo.aj(ZZI)Lvl;")
    public static class559 method3035(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3711 : Statics.field2099) : (arg1 ? Statics.field947 : Statics.field4579);
    }

    @ObfuscatedName("ff.az(I)Ljava/lang/String;")
    public static String method3093() {
        String var2;
        if (Statics.field4879.method2392()) {
            String var0 = field976;
            String var1 = class415.method4235('*', var0.length());
            var2 = var1;
        } else {
            var2 = field976;
        }
        return var2;
    }

    @ObfuscatedName("as.af(I)V")
    public static void method245() {
        if (field976 != null && field976.length() > 0) {
            return;
        }
        if (Statics.field4879.method2409() == null) {
            client.field583 = false;
        } else {
            field976 = Statics.field4879.method2409();
            client.field583 = true;
        }
    }

    @ObfuscatedName("fi.aa(B)V")
    public static void method3099() {
        if (!Statics.field941) {
            return;
        }
        Statics.field944 = null;
        Statics.field945 = null;
        Statics.field958 = null;
        Statics.field1985 = null;
        Statics.field946 = null;
        Statics.field1124 = null;
        Statics.field4749 = null;
        Statics.field4579 = null;
        Statics.field2099 = null;
        Statics.field335 = null;
        Statics.field4719 = null;
        Statics.field1703 = null;
        Statics.field4019 = null;
        Statics.field2216 = null;
        Statics.field2546.method2355();
        class330.method6481(0, 100);
        class388 var0 = Statics.field33;
        var0.method6670(true);
        Statics.field941 = false;
    }

    @ObfuscatedName("eb.at(Lor;II)V")
    public static void method2783(class387 arg0, int arg1) {
        if ((arg1 & class542.field5327.method34()) != 0) {
            Statics.field1124 = class561.method7880(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class542.field5328.method34()) != 0) {
            Statics.field1124 = class561.method7880(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class542.field5301.method34()) == 0) {
            Statics.field1124 = class561.method7880(arg0, "logo", "");
        } else {
            Statics.field1124 = class561.method7880(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("sq.ab(B)V")
    public static void method8016() {
        if (client.field583 && field976 != null && field976.length() > 0) {
            field966 = 1;
        } else {
            field966 = 0;
        }
    }

    @ObfuscatedName("am.ac(Lbe;Lqb;Lqb;I)V")
    public static void method298(class35 arg0, class431 arg1, class431 arg2) {
        if (field955) {
            class231 var3 = client.field764;
            class231 var4 = var3;
            while (true) {
                if (!var4.method4098()) {
                    if (class36.field238 != 1 && (Statics.field1379 || class36.field238 != 4)) {
                        break;
                    }
                    int var5 = field942 + 280;
                    if (class36.field239 >= var5 && class36.field239 <= var5 + 14 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(0, 0);
                        break;
                    }
                    if (class36.field239 >= var5 + 15 && class36.field239 <= var5 + 80 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(0, 1);
                        break;
                    }
                    int var6 = field942 + 390;
                    if (class36.field239 >= var6 && class36.field239 <= var6 + 14 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(1, 0);
                        break;
                    }
                    if (class36.field239 >= var6 + 15 && class36.field239 <= var6 + 80 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(1, 1);
                        break;
                    }
                    int var7 = field942 + 500;
                    if (class36.field239 >= var7 && class36.field239 <= var7 + 14 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(2, 0);
                        break;
                    }
                    if (class36.field239 >= var7 + 15 && class36.field239 <= var7 + 80 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(2, 1);
                        break;
                    }
                    int var8 = field942 + 610;
                    if (class36.field239 >= var8 && class36.field239 <= var8 + 14 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(3, 0);
                        break;
                    }
                    if (class36.field239 >= var8 + 15 && class36.field239 <= var8 + 80 && class36.field240 >= 4 && class36.field240 <= 18) {
                        class70.method4430(3, 1);
                        break;
                    }
                    if (class36.field239 >= field942 + 708 && class36.field240 >= 4 && class36.field239 <= field942 + 708 + 50 && class36.field240 <= 20) {
                        field955 = false;
                        Statics.field1985.method9225(field942, 0);
                        Statics.field946.method9225(field942 + 382, 0);
                        Statics.field1124.method9196(field942 + 382 - Statics.field1124.field5432 / 2, 18);
                        break;
                    }
                    if (field970 == -1) {
                        if (field971 > 0 && Statics.field3701 != null && class36.field239 >= 0 && class36.field239 <= Statics.field3701.field5432 && class36.field240 >= Statics.field5283 / 2 - 50 && class36.field240 <= Statics.field5283 / 2 + 50) {
                            field971--;
                        }
                        if (field971 < field960 && Statics.field1820 != null && class36.field239 >= Statics.field190 - Statics.field1820.field5432 - 5 && class36.field239 <= Statics.field190 && class36.field240 >= Statics.field5283 / 2 - 50 && class36.field240 <= Statics.field5283 / 2 + 50) {
                            field971++;
                        }
                    } else {
                        class70 var9 = Statics.field4663[field970];
                        boolean var10 = class543.method5035(client.field718, class542.field5314);
                        boolean var11 = var9.method1743();
                        Statics.field903 = var11;
                        var9.field833 = var11 ? "beta" : var9.field833;
                        method8255(var9);
                        field955 = false;
                        Statics.field1985.method9225(field942, 0);
                        Statics.field946.method9225(field942 + 382, 0);
                        Statics.field1124.method9196(field942 + 382 - Statics.field1124.field5432 / 2, 18);
                        if (var10 != var11) {
                            client.method273();
                        }
                    }
                    break;
                }
                if (var4.field2477 == 13) {
                    field955 = false;
                    Statics.field1985.method9225(field942, 0);
                    Statics.field946.method9225(field942 + 382, 0);
                    Statics.field1124.method9196(field942 + 382 - Statics.field1124.field5432 / 2, 18);
                    break;
                }
                if (var4.field2477 == 96) {
                    if (field971 > 0 && Statics.field3701 != null) {
                        field971--;
                    }
                } else if (var4.field2477 == 97 && field971 < field960 && Statics.field1820 != null) {
                    field971++;
                }
            }
            return;
        }
        if ((class36.field238 == 1 || !Statics.field1379 && class36.field238 == 4) && class36.field239 >= field942 + 765 - 50 && class36.field240 >= 453) {
            Statics.field4879.method2503(!Statics.field4879.method2394());
            if (Statics.field4879.method2394()) {
                class330.method6481(0, 0);
            } else {
                ArrayList var12 = new ArrayList();
                var12.add(new class342(Statics.field3033, "scape main", "", 255, false));
                class330.method1099(var12, 0, 0, 0, 100, false);
            }
            class330.method821();
        }
        if (client.field598 == 5) {
            return;
        }
        if (field952 == -1L) {
            field952 = class326.method2895() + 1000L;
        }
        long var13 = class326.method2895();
        if (client.method7589() && field940 == -1L) {
            field940 = var13;
            if (field940 > field952) {
                field952 = field940;
            }
        }
        if (client.field598 != 10 && client.field598 != 11) {
            return;
        }
        if (Statics.field1965 == class402.field4605) {
            if (class36.field238 == 1 || !Statics.field1379 && class36.field238 == 4) {
                int var15 = field942 + 5;
                short var16 = 463;
                byte var17 = 100;
                byte var18 = 35;
                if (class36.field239 >= var15 && class36.field239 <= var15 + var17 && class36.field240 >= var16 && class36.field240 <= var16 + var18) {
                    method2023();
                    return;
                }
            }
            if (Statics.field120 != null) {
                method2023();
            }
        }
        int var19 = class36.field238;
        int var20 = class36.field239;
        int var21 = class36.field240;
        if (var19 == 0) {
            var20 = class36.field230;
            var21 = class36.field221;
        }
        if (!Statics.field1379 && var19 == 4) {
            var19 = 1;
        }
        class231 var22 = client.method6569();
        if (field953 == 0) {
            boolean var23 = false;
            while (var22.method4098()) {
                if (var22.field2477 == 84) {
                    var23 = true;
                }
            }
            int var24 = Statics.field133 - 80;
            short var25 = 291;
            if (var19 == 1 && var20 >= var24 - 75 && var20 <= var24 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20) {
                class32.method6508(client.method7671("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var26 = Statics.field133 + 80;
            if (var19 == 1 && var20 >= var26 - 75 && var20 <= var26 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20 || var23) {
                if ((client.field718 & class542.field5323.method34()) != 0) {
                    field954 = "";
                    field951 = class378.field4314;
                    field956 = class378.field4315;
                    field972 = class378.field4320;
                    method3803(1);
                    method8016();
                } else if ((client.field718 & class542.field5300.method34()) != 0) {
                    if ((client.field718 & class542.field5325.method34()) == 0) {
                        field951 = class378.field4305;
                        field956 = class378.field4390;
                        field972 = class378.field4102;
                    } else {
                        field951 = class378.field4311;
                        field956 = class378.field4312;
                        field972 = class378.field4313;
                    }
                    field954 = class378.field4104;
                    method3803(1);
                    method8016();
                } else if ((client.field718 & class542.field5325.method34()) == 0) {
                    method5391(false);
                } else {
                    field951 = class378.field4308;
                    field956 = class378.field4309;
                    field972 = class378.field4310;
                    field954 = class378.field4104;
                    method3803(1);
                    method8016();
                }
            }
        } else if (field953 == 1) {
            while (true) {
                if (!var22.method4098()) {
                    int var27 = Statics.field133 - 80;
                    short var28 = 321;
                    if (var19 == 1 && var20 >= var27 - 75 && var20 <= var27 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method5391(false);
                    }
                    int var29 = Statics.field133 + 80;
                    if (var19 == 1 && var20 >= var29 - 75 && var20 <= var29 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method3803(0);
                    }
                    break;
                }
                if (var22.field2477 == 84) {
                    method5391(false);
                } else if (var22.field2477 == 13) {
                    method3803(0);
                }
            }
        } else if (field953 == 2) {
            short var30 = 201;
            int var145 = var30 + 52;
            if (var19 == 1 && var21 >= var145 - 12 && var21 < var145 + 2) {
                field966 = 0;
            }
            var145 += 15;
            if (var19 == 1 && var21 >= var145 - 12 && var21 < var145 + 2) {
                field966 = 1;
            }
            var145 += 15;
            short var31 = 361;
            if (Statics.field3983 != null) {
                int var32 = Statics.field3983.field4673 / 2;
                if (var19 == 1 && var20 >= Statics.field3983.field4674 - var32 && var20 <= Statics.field3983.field4674 + var32 && var21 >= var31 - 15 && var21 < var31) {
                    switch(field950) {
                        case 1:
                            class32.method6508(class378.field4401, true, false);
                            return;
                        case 2:
                            class32.method6508("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var33 = Statics.field133 - 80;
            short var34 = 321;
            if (var19 == 1 && var20 >= var33 - 75 && var20 <= var33 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                field976 = field976.trim();
                if (field976.length() == 0) {
                    method5108(class378.field4209, class378.field4296, class378.field4193);
                } else if (field959.length() == 0) {
                    method5108(class378.field4297, class378.field4213, class378.field4214);
                } else {
                    method5108(class378.field4318, class378.field4319, class378.field4298);
                    client.method5453(false);
                    Statics.method2625(20);
                }
                return;
            }
            int var35 = field977 + 180 + 80;
            if (var19 == 1 && var20 >= var35 - 75 && var20 <= var35 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                method3803(0);
                field976 = "";
                field959 = "";
                Statics.field4658 = 0;
                Statics.field3141 = "";
                field965 = true;
            }
            int var36 = Statics.field133 + -117;
            short var37 = 277;
            field968 = var20 >= var36 && var20 < Statics.field5197 + var36 && var21 >= var37 && var21 < Statics.field867 + var37;
            if (var19 == 1 && field968) {
                client.field583 = !client.field583;
                if (!client.field583 && Statics.field4879.method2409() != null) {
                    Statics.field4879.method2408((String) null);
                }
            }
            int var38 = Statics.field133 + 24;
            short var39 = 277;
            field964 = var20 >= var38 && var20 < Statics.field5197 + var38 && var21 >= var39 && var21 < Statics.field867 + var39;
            if (var19 == 1 && field964) {
                Statics.field4879.method2398(!Statics.field4879.method2392());
                if (!Statics.field4879.method2392()) {
                    field976 = "";
                    Statics.field4879.method2408((String) null);
                    method8016();
                }
            }
            label1205: while (true) {
                Transferable var43;
                int var44;
                do {
                    while (true) {
                        label1169: do {
                            while (true) {
                                while (var22.method4098()) {
                                    if (var22.field2477 == 13) {
                                        method3803(0);
                                        field976 = "";
                                        field959 = "";
                                        Statics.field4658 = 0;
                                        Statics.field3141 = "";
                                        field965 = true;
                                    } else {
                                        if (field966 != 0) {
                                            continue label1169;
                                        }
                                        method2515(var22.field2465);
                                        if (var22.field2477 == 85 && field976.length() > 0) {
                                            field976 = field976.substring(0, field976.length() - 1);
                                        }
                                        if (var22.field2477 == 84 || var22.field2477 == 80) {
                                            field966 = 1;
                                        }
                                        char var40 = var22.field2465;
                                        boolean var41 = field967.indexOf(var40) != -1;
                                        if (var41 && field976.length() < 320) {
                                            field976 = field976 + var22.field2465;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field966 != 1);
                        if (var22.field2477 == 85 && field959.length() > 0) {
                            field959 = field959.substring(0, field959.length() - 1);
                        } else if (var22.field2477 == 84 || var22.field2477 == 80) {
                            field966 = 0;
                            if (var22.field2477 == 84) {
                                field976 = field976.trim();
                                if (field976.length() == 0) {
                                    method5108(class378.field4209, class378.field4296, class378.field4193);
                                } else if (field959.length() == 0) {
                                    method5108(class378.field4297, class378.field4213, class378.field4214);
                                } else {
                                    method5108(class378.field4318, class378.field4319, class378.field4298);
                                    client.method5453(false);
                                    Statics.method2625(20);
                                }
                                return;
                            }
                        }
                        if ((var22.method4087(82) || var22.method4087(87)) && var22.field2477 == 67) {
                            Clipboard var42 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var43 = var42.getContents(Statics.field1971);
                            var44 = 20 - field959.length();
                            break;
                        }
                        if (class413.method8689(var22.field2465)) {
                            char var52 = var22.field2465;
                            boolean var53 = field967.indexOf(var52) != -1;
                            if (var53 && field959.length() < 20) {
                                field959 = field959 + var22.field2465;
                            }
                        }
                    }
                } while (var44 <= 0);
                try {
                    String var45 = (String) var43.getTransferData(DataFlavor.stringFlavor);
                    int var46 = Math.min(var44, var45.length());
                    int var47 = 0;
                    while (true) {
                        if (var47 >= var46) {
                            field959 = field959 + var45.substring(0, var46);
                            continue label1205;
                        }
                        if (!class413.method8689(var45.charAt(var47))) {
                            break;
                        }
                        char var48 = var45.charAt(var47);
                        boolean var49 = field967.indexOf(var48) != -1;
                        if (!var49) {
                            break;
                        }
                        var47++;
                    }
                    method3803(3);
                    return;
                } catch (UnsupportedFlavorException var143) {
                } catch (IOException var144) {
                }
            }
        } else if (field953 == 3) {
            int var54 = field977 + 180;
            short var55 = 241;
            class419 var56 = arg1.method7462(25, class378.field4231.length() - 34, class378.field4231, var54, var55);
            if (var19 == 1 && var56.method7099(var20, var21)) {
                class32.method6508(class378.field4400, true, false);
            }
            int var57 = field977 + 180;
            short var58 = 276;
            if (var19 == 1 && var20 >= var57 - 75 && var20 <= var57 + 75 && var21 >= var58 - 20 && var21 <= var58 + 20) {
                method2309(false);
            }
            int var59 = field977 + 180;
            short var60 = 326;
            if (var19 == 1 && var20 >= var59 - 75 && var20 <= var59 + 75 && var21 >= var60 - 20 && var21 <= var60 + 20) {
                class32.method6508(class378.field4401, true, false);
                return;
            }
        } else if (field953 == 4) {
            int var61 = field977 + 180 - 80;
            short var62 = 321;
            if (var19 == 1 && var20 >= var61 - 75 && var20 <= var61 + 75 && var21 >= var62 - 20 && var21 <= var62 + 20) {
                Statics.field3141.trim();
                if (Statics.field3141.length() == 6) {
                    Statics.field4658 = Integer.parseInt(Statics.field3141);
                    Statics.field3141 = "";
                    client.method5453(true);
                    method5108(class378.field4318, class378.field4319, class378.field4298);
                    Statics.method2625(20);
                } else {
                    method5108(class378.field4128, class378.field4129, class378.field4328);
                }
                return;
            }
            if (var19 == 1 && var20 >= field977 + 180 - 9 && var20 <= field977 + 180 + 130 && var21 >= 263 && var21 <= 296) {
                field965 = !field965;
            }
            if (var19 == 1 && var20 >= field977 + 180 - 34 && var20 <= field977 + 180 + 34 && var21 >= 351 && var21 <= 363) {
                class32.method6508(class378.field4401, true, false);
            }
            int var63 = field977 + 180 + 80;
            if (var19 == 1 && var20 >= var63 - 75 && var20 <= var63 + 75 && var21 >= var62 - 20 && var21 <= var62 + 20) {
                method3803(0);
                field976 = "";
                field959 = "";
                Statics.field4658 = 0;
                Statics.field3141 = "";
            }
            while (var22.method4098()) {
                boolean var64 = false;
                for (int var65 = 0; var65 < field973.length(); var65++) {
                    if (var22.field2465 == field973.charAt(var65)) {
                        var64 = true;
                        break;
                    }
                }
                if (var22.field2477 == 13) {
                    method3803(0);
                    field976 = "";
                    field959 = "";
                    Statics.field4658 = 0;
                    Statics.field3141 = "";
                } else {
                    if (var22.field2477 == 85 && Statics.field3141.length() > 0) {
                        Statics.field3141 = Statics.field3141.substring(0, Statics.field3141.length() - 1);
                    }
                    if (var22.field2477 == 84) {
                        Statics.field3141.trim();
                        if (Statics.field3141.length() == 6) {
                            Statics.field4658 = Integer.parseInt(Statics.field3141);
                            Statics.field3141 = "";
                            client.method5453(true);
                            method5108(class378.field4318, class378.field4319, class378.field4298);
                            Statics.method2625(20);
                        } else {
                            method5108(class378.field4128, class378.field4129, class378.field4328);
                        }
                        return;
                    }
                    if (var64 && Statics.field3141.length() < 6) {
                        Statics.field3141 = Statics.field3141 + var22.field2465;
                    }
                }
            }
        } else if (field953 == 5) {
            int var66 = field977 + 180 - 80;
            short var67 = 321;
            if (var19 == 1 && var20 >= var66 - 75 && var20 <= var66 + 75 && var21 >= var67 - 20 && var21 <= var67 + 20) {
                field976 = field976.trim();
                if (field976.length() == 0) {
                    method5108(class378.field4364, class378.field4353, class378.field4354);
                } else {
                    long var68 = class75.method6507();
                    int var70;
                    if (var68 == 0L) {
                        var70 = 5;
                    } else {
                        var70 = class75.method11(var68, field976);
                    }
                    switch(var70) {
                        case 2:
                            method5108(class378.field4355, class378.field4159, class378.field4357);
                            method3803(6);
                            break;
                        case 3:
                            method5108(class378.field4358, class378.field4359, class378.field4360);
                            break;
                        case 4:
                            method5108(class378.field4361, class378.field4123, class378.field4113);
                            break;
                        case 5:
                            method5108(class378.field4206, class378.field4365, class378.field4162);
                            break;
                        case 6:
                            method5108(class378.field4367, class378.field4368, class378.field4369);
                            break;
                        case 7:
                            method5108(class378.field4370, class378.field4117, class378.field4381);
                    }
                }
                return;
            }
            int var71 = field977 + 180 + 80;
            if (var19 == 1 && var20 >= var71 - 75 && var20 <= var71 + 75 && var21 >= var67 - 20 && var21 <= var67 + 20) {
                method5391(true);
            }
            short var72 = 361;
            if (Statics.field4656 != null) {
                int var73 = Statics.field4656.field4673 / 2;
                if (var19 == 1 && var20 >= Statics.field4656.field4674 - var73 && var20 <= Statics.field4656.field4674 + var73 && var21 >= var72 - 15 && var21 < var72) {
                    class32.method6508(client.method7671("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var22.method4098()) {
                boolean var74 = false;
                for (int var75 = 0; var75 < field967.length(); var75++) {
                    if (var22.field2465 == field967.charAt(var75)) {
                        var74 = true;
                        break;
                    }
                }
                if (var22.field2477 == 13) {
                    method5391(true);
                } else {
                    if (var22.field2477 == 85 && field976.length() > 0) {
                        field976 = field976.substring(0, field976.length() - 1);
                    }
                    if (var22.field2477 == 84) {
                        method7753();
                        return;
                    }
                    if (var74 && field976.length() < 320) {
                        field976 = field976 + var22.field2465;
                    }
                }
            }
        } else if (field953 == 6) {
            while (true) {
                do {
                    if (!var22.method4098()) {
                        short var76 = 321;
                        if (var19 == 1 && var21 >= var76 - 20 && var21 <= var76 + 20) {
                            method5391(true);
                        }
                        return;
                    }
                } while (var22.field2477 != 84 && var22.field2477 != 13);
                method5391(true);
            }
        } else if (field953 == 7) {
            if (Statics.field3977 && !client.field608) {
                int var77 = Statics.field133 - 150;
                int var78 = var77 + 240 + 25 + 40;
                short var79 = 231;
                int var80 = var79 + 40;
                if (var19 == 1 && var20 >= var77 && var20 <= var78 && var21 >= var79 && var21 <= var80) {
                    field974 = method447(var77, var20);
                }
                int var81 = field977 + 180 - 80;
                short var82 = 321;
                if (var19 == 1 && var20 >= var81 - 75 && var20 <= var81 + 75 && var21 >= var82 - 20 && var21 <= var82 + 20) {
                    boolean var85;
                    label1072: {
                        Date var83;
                        try {
                            var83 = method3058();
                        } catch (ParseException var142) {
                            method5422("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var85 = false;
                            break label1072;
                        }
                        if (var83 == null) {
                            var85 = false;
                        } else {
                            Calendar var86 = Calendar.getInstance();
                            var86.set(1, var86.get(1) - 13);
                            var86.set(5, var86.get(5) + 1);
                            var86.set(11, 0);
                            var86.set(12, 0);
                            var86.set(13, 0);
                            var86.set(14, 0);
                            Date var87 = var86.getTime();
                            boolean var88 = var83.before(var87);
                            Date var90 = method3306();
                            boolean var91 = var83.after(var90);
                            if (var91) {
                                if (var88) {
                                    Statics.field1027 = (int) (var83.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field1027 = 8388607;
                                }
                                var85 = true;
                            } else {
                                method5422("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var85 = false;
                            }
                        }
                    }
                    if (var85) {
                        Statics.method2625(50);
                        return;
                    }
                }
                int var94 = field977 + 180 + 80;
                if (var19 == 1 && var20 >= var94 - 75 && var20 <= var94 + 75 && var21 >= var82 - 20 && var21 <= var82 + 20) {
                    field961 = new String[8];
                    method5391(true);
                }
                while (var22.method4098()) {
                    if (var22.field2477 == 101) {
                        field961[field974] = null;
                    }
                    if (var22.field2477 == 85) {
                        if (field961[field974] == null && field974 > 0) {
                            field974--;
                        }
                        field961[field974] = null;
                    }
                    if (var22.field2465 >= '0' && var22.field2465 <= '9') {
                        field961[field974] = "" + var22.field2465;
                        if (field974 < 7) {
                            field974++;
                        }
                    }
                    if (var22.field2477 == 84) {
                        boolean var97;
                        label1008: {
                            Date var95;
                            try {
                                var95 = method3058();
                            } catch (ParseException var141) {
                                method5422("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var97 = false;
                                break label1008;
                            }
                            if (var95 == null) {
                                var97 = false;
                            } else {
                                Calendar var98 = Calendar.getInstance();
                                var98.set(1, var98.get(1) - 13);
                                var98.set(5, var98.get(5) + 1);
                                var98.set(11, 0);
                                var98.set(12, 0);
                                var98.set(13, 0);
                                var98.set(14, 0);
                                Date var99 = var98.getTime();
                                boolean var100 = var95.before(var99);
                                Date var102 = method3306();
                                boolean var103 = var95.after(var102);
                                if (var103) {
                                    if (var100) {
                                        Statics.field1027 = (int) (var95.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field1027 = 8388607;
                                    }
                                    var97 = true;
                                } else {
                                    method5422("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var97 = false;
                                }
                            }
                        }
                        if (var97) {
                            Statics.method2625(50);
                        }
                        return;
                    }
                }
            } else {
                int var106 = field977 + 180 - 80;
                short var107 = 321;
                if (var19 == 1 && var20 >= var106 - 75 && var20 <= var106 + 75 && var21 >= var107 - 20 && var21 <= var107 + 20) {
                    class32.method6508(client.method7671("secure", true) + "m=dob/set_dob.ws", true, false);
                    method5108(class378.field4349, class378.field4350, class378.field4351);
                    method3803(6);
                    return;
                }
                int var108 = field977 + 180 + 80;
                if (var19 == 1 && var20 >= var108 - 75 && var20 <= var108 + 75 && var21 >= var107 - 20 && var21 <= var107 + 20) {
                    method5391(true);
                }
            }
        } else if (field953 == 8) {
            int var109 = field977 + 180 - 80;
            short var110 = 321;
            if (var19 == 1 && var20 >= var109 - 75 && var20 <= var109 + 75 && var21 >= var110 - 20 && var21 <= var110 + 20) {
                class32.method6508("https://www.jagex.com/terms/privacy", true, false);
                method5108(class378.field4349, class378.field4350, class378.field4351);
                method3803(6);
                return;
            }
            int var111 = field977 + 180 + 80;
            if (var19 == 1 && var20 >= var111 - 75 && var20 <= var111 + 75 && var21 >= var110 - 20 && var21 <= var110 + 20) {
                method5391(true);
            }
        } else if (field953 == 9) {
            int var112 = field977 + 180;
            short var113 = 311;
            if (var22.field2477 == 84 || var22.field2477 == 13 || var19 == 1 && var20 >= var112 - 75 && var20 <= var112 + 75 && var21 >= var113 - 20 && var21 <= var113 + 20) {
                method2309(false);
            }
        } else if (field953 == 10) {
            int var114 = field977 + 180;
            short var115 = 209;
            if (var22.field2477 == 84 || var19 == 1 && var20 >= var114 - 109 && var20 <= var114 + 109 && var21 >= var115 && var21 <= var115 + 68) {
                method5108(class378.field4318, class378.field4319, class378.field4298);
                client.field570 = class551.field5397;
                client.method5453(false);
                Statics.method2625(20);
            }
        } else if (field953 == 12) {
            int var116 = Statics.field133;
            short var117 = 233;
            class419 var118 = arg2.method7462(0, 30, class378.field4251, var116, var117);
            class419 var119 = arg2.method7462(32, 32, class378.field4251, var116, var117);
            class419 var120 = arg2.method7462(70, 34, class378.field4251, var116, var117);
            int var146 = var117 + 17;
            class419 var121 = arg2.method7462(0, 34, class378.field4105, var116, var146);
            if (var19 == 1) {
                if (var118.method7099(var20, var21)) {
                    class32.method6508("https://www.jagex.com/terms", true, false);
                } else if (var119.method7099(var20, var21)) {
                    class32.method6508("https://www.jagex.com/terms/privacy", true, false);
                } else if (var120.method7099(var20, var21) || var121.method7099(var20, var21)) {
                    class32.method6508("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var122 = Statics.field133 - 80;
            short var123 = 311;
            if (var19 == 1 && var20 >= var122 - 75 && var20 <= var122 + 75 && var21 >= var123 - 20 && var21 <= var123 + 20) {
                client.method6427();
                method2309(true);
            }
            int var124 = Statics.field133 + 80;
            if (var19 == 1 && var20 >= var124 - 75 && var20 <= var124 + 75 && var21 >= var123 - 20 && var21 <= var123 + 20) {
                field953 = 13;
            }
        } else if (field953 == 13) {
            int var125 = Statics.field133;
            short var126 = 321;
            if (var19 == 1 && var20 >= var125 - 75 && var20 <= var125 + 75 && var21 >= var126 - 20 && var21 <= var126 + 20) {
                method2309(true);
            }
        } else if (field953 == 14) {
            String var127 = "";
            switch(field948) {
                case 0:
                    var127 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var127 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var127 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method5391(false);
            }
            int var128 = field977 + 180;
            short var129 = 276;
            if (var19 == 1 && var20 >= var128 - 75 && var20 <= var128 + 75 && var21 >= var129 - 20 && var21 <= var129 + 20) {
                class32.method6508(var127, true, false);
                method5108(class378.field4349, class378.field4350, class378.field4351);
                method3803(6);
                return;
            }
            int var130 = field977 + 180;
            short var131 = 326;
            if (var19 == 1 && var20 >= var130 - 75 && var20 <= var130 + 75 && var21 >= var131 - 20 && var21 <= var131 + 20) {
                method5391(false);
            }
        } else if (field953 == 24) {
            int var132 = field977 + 180;
            short var133 = 301;
            if (var19 == 1 && var20 >= var132 - 75 && var20 <= var132 + 75 && var21 >= var133 - 20 && var21 <= var133 + 20) {
                method2309(false);
            }
        } else if (field953 == 32) {
            int var134 = field977 + 180 - 80;
            short var135 = 321;
            if (var19 == 1 && var20 >= var134 - 75 && var20 <= var134 + 75 && var21 >= var135 - 20 && var21 <= var135 + 20) {
                class32.method6508(client.method7671("secure", true) + "m=dob/set_dob.ws", true, false);
                method5108(class378.field4349, class378.field4350, class378.field4351);
                method3803(6);
                return;
            }
            int var136 = field977 + 180 + 80;
            if (var19 == 1 && var20 >= var136 - 75 && var20 <= var136 + 75 && var21 >= var135 - 20 && var21 <= var135 + 20) {
                method5391(true);
            }
        } else if (field953 == 33) {
            int var137 = field977 + 180;
            short var138 = 276;
            if (var19 == 1 && var20 >= var137 - 75 && var20 <= var137 + 75 && var21 >= var138 - 20 && var21 <= var138 + 20) {
                class32.method6508(class378.field4400, true, false);
            }
            int var139 = field977 + 180;
            short var140 = 326;
            if (var19 == 1 && var20 >= var139 - 75 && var20 <= var139 + 75 && var21 >= var140 - 20 && var21 <= var140 + 20) {
                method5391(true);
            }
        }
    }

    @ObfuscatedName("ge.ao(I)Ljava/util/Date;")
    public static Date method3306() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("lq.ah(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method5422(String arg0, String arg1, String arg2) {
        method3803(7);
        method5108(arg0, arg1, arg2);
    }

    @ObfuscatedName("fp.av(I)Ljava/util/Date;")
    public static Date method3058() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field961;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method5422("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("bn.aq(III)I")
    public static int method447(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("dt.ap(CB)Z")
    public static boolean method2515(char arg0) {
        for (int var1 = 0; var1 < field967.length(); var1++) {
            if (arg0 == field967.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("lb.ae(ZB)V")
    public static void method5391(boolean arg0) {
        if (Statics.field1971.method1162() || Statics.field1971.method1244() || Statics.field1971.method1684()) {
            method3803(10);
            return;
        }
        field951 = class378.field4301;
        field956 = class378.field4156;
        field972 = class378.field4303;
        method3803(2);
        if (arg0) {
            field959 = "";
        }
        method245();
        method8016();
    }

    @ObfuscatedName("dk.ax(ZI)V")
    public static void method2309(boolean arg0) {
        byte var1 = 0;
        if (!client.method260()) {
            var1 = 12;
        } else if (Statics.field1971.method1162() || Statics.field1971.method1244() || Statics.field1971.method1684()) {
            var1 = 10;
        }
        method3803(var1);
        if (arg0) {
            field976 = "";
            field959 = "";
            Statics.field4658 = 0;
            Statics.field3141 = "";
        }
        method245();
        method8016();
    }

    @ObfuscatedName("rl.ay(I)V")
    public static void method7753() {
        field976 = field976.trim();
        if (field976.length() == 0) {
            method5108(class378.field4364, class378.field4353, class378.field4354);
            return;
        }
        long var0 = class75.method6507();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class75.method11(var0, field976);
        }
        switch(var2) {
            case 2:
                method5108(class378.field4355, class378.field4159, class378.field4357);
                method3803(6);
                break;
            case 3:
                method5108(class378.field4358, class378.field4359, class378.field4360);
                break;
            case 4:
                method5108(class378.field4361, class378.field4123, class378.field4113);
                break;
            case 5:
                method5108(class378.field4206, class378.field4365, class378.field4162);
                break;
            case 6:
                method5108(class378.field4367, class378.field4368, class378.field4369);
                break;
            case 7:
                method5108(class378.field4370, class378.field4117, class378.field4381);
        }
    }

    @ObfuscatedName("eu.au(Lqb;Lqb;Lqb;S)V")
    public static void method2849(class431 arg0, class431 arg1, class431 arg2) {
        field942 = (Statics.field190 - 765) / 2;
        field977 = field942 + 202;
        Statics.field133 = field977 + 180;
        if (field955) {
            if (Statics.field335 == null) {
                class384 var3 = Statics.field1885;
                class560[] var4;
                if (var3.method6589("sl_back", "")) {
                    int var5 = var3.method6587("sl_back");
                    int var6 = var3.method6647(var5, "");
                    var4 = class561.method5445(var3, var5, var6);
                } else {
                    var4 = null;
                }
                Statics.field335 = var4;
            }
            if (Statics.field4719 == null) {
                Statics.field4719 = class561.method3364(Statics.field1885, "sl_flags", "");
            }
            if (Statics.field1703 == null) {
                Statics.field1703 = class561.method3364(Statics.field1885, "sl_arrows", "");
            }
            if (Statics.field4019 == null) {
                Statics.field4019 = class561.method3364(Statics.field1885, "sl_stars", "");
            }
            if (Statics.field3701 == null) {
                Statics.field3701 = class561.method7880(Statics.field1885, "leftarrow", "");
            }
            if (Statics.field1820 == null) {
                Statics.field1820 = class561.method7880(Statics.field1885, "rightarrow", "");
            }
            class556.method9112(field942, 23, 765, 480, 0);
            class556.method9181(field942, 0, 125, 23, 12425273, 9135624);
            class556.method9181(field942 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method7468(class378.field4292, field942 + 62, 15, 0, -1);
            if (Statics.field4019 != null) {
                Statics.field4019[1].method9196(field942 + 140, 1);
                arg1.method7488(class378.field4389, field942 + 152, 10, 16777215, -1);
                Statics.field4019[0].method9196(field942 + 140, 12);
                arg1.method7488(class378.field4339, field942 + 152, 21, 16777215, -1);
            }
            if (Statics.field1703 != null) {
                int var7 = field942 + 280;
                if (class70.field838[0] == 0 && class70.field837[0] == 0) {
                    Statics.field1703[2].method9196(var7, 4);
                } else {
                    Statics.field1703[0].method9196(var7, 4);
                }
                if (class70.field838[0] == 0 && class70.field837[0] == 1) {
                    Statics.field1703[3].method9196(var7 + 15, 4);
                } else {
                    Statics.field1703[1].method9196(var7 + 15, 4);
                }
                arg0.method7488(class378.field4212, var7 + 32, 17, 16777215, -1);
                int var8 = field942 + 390;
                if (class70.field838[0] == 1 && class70.field837[0] == 0) {
                    Statics.field1703[2].method9196(var8, 4);
                } else {
                    Statics.field1703[0].method9196(var8, 4);
                }
                if (class70.field838[0] == 1 && class70.field837[0] == 1) {
                    Statics.field1703[3].method9196(var8 + 15, 4);
                } else {
                    Statics.field1703[1].method9196(var8 + 15, 4);
                }
                arg0.method7488(class378.field4378, var8 + 32, 17, 16777215, -1);
                int var9 = field942 + 500;
                if (class70.field838[0] == 2 && class70.field837[0] == 0) {
                    Statics.field1703[2].method9196(var9, 4);
                } else {
                    Statics.field1703[0].method9196(var9, 4);
                }
                if (class70.field838[0] == 2 && class70.field837[0] == 1) {
                    Statics.field1703[3].method9196(var9 + 15, 4);
                } else {
                    Statics.field1703[1].method9196(var9 + 15, 4);
                }
                arg0.method7488(class378.field4393, var9 + 32, 17, 16777215, -1);
                int var10 = field942 + 610;
                if (class70.field838[0] == 3 && class70.field837[0] == 0) {
                    Statics.field1703[2].method9196(var10, 4);
                } else {
                    Statics.field1703[0].method9196(var10, 4);
                }
                if (class70.field838[0] == 3 && class70.field837[0] == 1) {
                    Statics.field1703[3].method9196(var10 + 15, 4);
                } else {
                    Statics.field1703[1].method9196(var10 + 15, 4);
                }
                arg0.method7488(class378.field4167, var10 + 32, 17, 16777215, -1);
            }
            class556.method9112(field942 + 708, 4, 50, 16, 0);
            arg1.method7468(class378.field4153, field942 + 708 + 25, 16, 16777215, -1);
            field970 = -1;
            if (Statics.field335 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class70.field835) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class70.field835) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class70.field835) {
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
                int var21 = (class70.field835 + var14 - 1) / var14;
                field960 = var21 - var13;
                if (Statics.field3701 != null && field971 > 0) {
                    Statics.field3701.method9196(8, Statics.field5283 / 2 - Statics.field3701.field5435 / 2);
                }
                if (Statics.field1820 != null && field971 < field960) {
                    Statics.field1820.method9196(Statics.field190 - Statics.field1820.field5432 - 8, Statics.field5283 / 2 - Statics.field1820.field5435 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field942 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field971;
                for (int var27 = var14 * var26; var27 < class70.field835 && var26 - field971 < var13; var27++) {
                    class70 var28 = Statics.field4663[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field841);
                    if (var28.field841 == -1) {
                        var30 = class378.field4344;
                        var29 = false;
                    } else if (var28.field841 > 1980) {
                        var30 = class378.field4388;
                        var29 = false;
                    }
                    class112 var31 = null;
                    int var32 = 0;
                    if (var28.method1748()) {
                        var31 = var28.method1779() ? class112.field1431 : class112.field1434;
                    } else if (var28.method1743()) {
                        var31 = var28.method1779() ? class112.field1443 : class112.field1442;
                    } else if (var28.method1747()) {
                        var32 = 16711680;
                        var31 = var28.method1779() ? class112.field1433 : class112.field1444;
                    } else if (var28.method1793()) {
                        var31 = var28.method1779() ? class112.field1437 : class112.field1435;
                    } else if (var28.method1751()) {
                        var31 = var28.method1779() ? class112.field1439 : class112.field1430;
                    } else if (var28.method1750()) {
                        var31 = var28.method1779() ? class112.field1436 : class112.field1438;
                    } else if (var28.method1791()) {
                        var31 = var28.method1779() ? class112.field1441 : class112.field1440;
                    }
                    if (var31 == null || var31.field1428 >= Statics.field335.length) {
                        var31 = var28.method1779() ? class112.field1446 : class112.field1429;
                    }
                    if (class36.field230 >= var23 && class36.field221 >= var22 && class36.field230 < var11 + var23 && class36.field221 < var12 + var22 && var29) {
                        field970 = var27;
                        Statics.field335[var31.field1428].method9247(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field335[var31.field1428].method9225(var23, var22);
                    }
                    if (Statics.field4719 != null) {
                        Statics.field4719[(var28.method1779() ? 8 : 0) + var28.field848].method9196(var23 + 29, var22);
                    }
                    arg0.method7468(Integer.toString(var28.field839), var23 + 15, var12 / 2 + var22 + 5, var32, -1);
                    arg1.method7468(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
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
                    int var33 = arg1.method7547(Statics.field4663[field970].field843) + 6;
                    int var34 = arg1.field4760 + 8;
                    int var35 = class36.field221 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class36.field221 - 25 - var34;
                    }
                    class556.method9112(class36.field230 - var33 / 2, var35, var33, var34, 16777120);
                    class556.method9116(class36.field230 - var33 / 2, var35, var33, var34, 0);
                    arg1.method7468(Statics.field4663[field970].field843, class36.field230, arg1.field4760 + var35 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field1985.method9225(field942, 0);
        Statics.field946.method9225(field942 + 382, 0);
        Statics.field1124.method9196(field942 + 382 - Statics.field1124.field5432 / 2, 18);
        if (client.field598 == 0 || client.field598 == 5) {
            byte var36 = 20;
            arg0.method7468(class378.field4334, field977 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class556.method9116(field977 + 180 - 152, var37, 304, 34, 9179409);
            class556.method9116(field977 + 180 - 151, var37 + 1, 302, 32, 0);
            class556.method9112(field977 + 180 - 150, var37 + 2, field949 * 3, 30, 9179409);
            class556.method9112(field949 * 3 + (field977 + 180 - 150), var37 + 2, 300 - field949 * 3, 30, 0);
            arg0.method7468(field963, field977 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field598 == 20) {
            Statics.field944.method9196(field977 + 180 - Statics.field944.field5432 / 2, 271 - Statics.field944.field5435 / 2);
            short var38 = 201;
            arg0.method7468(field951, field977 + 180, var38, 16776960, 0);
            int var151 = var38 + 15;
            arg0.method7468(field956, field977 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            arg0.method7468(field972, field977 + 180, var152, 16776960, 0);
            int var153 = var152 + 15;
            int var154 = var153 + 7;
            if (field953 != 4 && field953 != 10) {
                arg0.method7488(class378.field4327, field977 + 180 - 110, var154, 16777215, 0);
                short var39 = 200;
                String var42;
                if (Statics.field4879.method2392()) {
                    String var40 = field976;
                    String var41 = class415.method4235('*', var40.length());
                    var42 = var41;
                } else {
                    var42 = field976;
                }
                String var44;
                for (var44 = var42; arg0.method7547(var44) > var39; var44 = var44.substring(0, var44.length() - 1)) {
                }
                arg0.method7488(class435.method7464(var44), field977 + 180 - 70, var154, 16777215, 0);
                var151 = var154 + 15;
                String var45 = field959;
                String var46 = class415.method4235('*', var45.length());
                String var47;
                for (var47 = var46; arg0.method7547(var47) > var39; var47 = var47.substring(1)) {
                }
                arg0.method7488(class378.field4300 + var47, field977 + 180 - 108, var151, 16777215, 0);
                var151 += 15;
            }
        }
        if (client.field598 == 10 || client.field598 == 11 || client.field598 == 50) {
            Statics.field944.method9196(field977, 171);
            if (field953 == 0) {
                short var48 = 251;
                arg0.method7468(class378.field4330, field977 + 180, var48, 16776960, 0);
                int var155 = var48 + 30;
                int var49 = field977 + 180 - 80;
                short var50 = 291;
                Statics.field945.method9196(var49 - 73, var50 - 20);
                arg0.method7483(class378.field4331, var49 - 73, var50 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var51 = field977 + 180 + 80;
                Statics.field945.method9196(var51 - 73, var50 - 20);
                arg0.method7483(class378.field4332, var51 - 73, var50 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field953 == 1) {
                arg0.method7468(field954, field977 + 180, 201, 16776960, 0);
                short var52 = 236;
                arg0.method7468(field951, field977 + 180, var52, 16777215, 0);
                int var156 = var52 + 15;
                arg0.method7468(field956, field977 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                arg0.method7468(field972, field977 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                int var53 = field977 + 180 - 80;
                short var54 = 321;
                Statics.field945.method9196(var53 - 73, var54 - 20);
                arg0.method7468(class378.field4371, var53, var54 + 5, 16777215, 0);
                int var55 = field977 + 180 + 80;
                Statics.field945.method9196(var55 - 73, var54 - 20);
                arg0.method7468(class378.field4153, var55, var54 + 5, 16777215, 0);
            } else if (field953 == 2) {
                short var56 = 201;
                arg0.method7468(field951, Statics.field133, var56, 16776960, 0);
                int var159 = var56 + 15;
                arg0.method7468(field956, Statics.field133, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg0.method7468(field972, Statics.field133, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var162 = var161 + 7;
                arg0.method7488(class378.field4327, Statics.field133 - 110, var162, 16777215, 0);
                short var57 = 200;
                String var58 = Statics.field4879.method2392() ? class415.method3072(field976) : field976;
                String var59;
                for (var59 = var58; arg0.method7547(var59) > var57; var59 = var59.substring(1)) {
                }
                arg0.method7488(class435.method7464(var59) + (field966 == 0 & client.field821 % 40 < 20 ? class105.method7700(16776960) + class105.field1373 : ""), Statics.field133 - 70, var162, 16777215, 0);
                var159 = var162 + 15;
                String var60;
                for (var60 = class415.method3072(field959); arg0.method7547(var60) > var57; var60 = var60.substring(1)) {
                }
                arg0.method7488(class378.field4300 + var60 + (field966 == 1 & client.field821 % 40 < 20 ? class105.method7700(16776960) + class105.field1373 : ""), Statics.field133 - 108, var159, 16777215, 0);
                var159 += 15;
                short var61 = 277;
                int var62 = Statics.field133 + -117;
                class559 var63 = method3035(client.field583, field968);
                var63.method9196(var62, var61);
                int var64 = var63.field5432 + 5 + var62;
                arg1.method7488(class378.field4295, var64, var61 + 13, 16776960, 0);
                int var65 = Statics.field133 + 24;
                class559 var66 = method3035(Statics.field4879.method2392(), field964);
                var66.method9196(var65, var61);
                int var67 = var66.field5432 + 5 + var65;
                arg1.method7488(class378.field4336, var67, var61 + 13, 16776960, 0);
                int var163 = var61 + 15;
                int var68 = Statics.field133 - 80;
                short var69 = 321;
                Statics.field945.method9196(var68 - 73, var69 - 20);
                arg0.method7468(class378.field4170, var68, var69 + 5, 16777215, 0);
                int var70 = Statics.field133 + 80;
                Statics.field945.method9196(var70 - 73, var69 - 20);
                arg0.method7468(class378.field4153, var70, var69 + 5, 16777215, 0);
                short var71 = 357;
                switch(field950) {
                    case 2:
                        Statics.field1702 = class378.field4348;
                        break;
                    default:
                        Statics.field1702 = class378.field4346;
                }
                Statics.field3983 = new class419(Statics.field133, var71, arg1.method7547(Statics.field1702), 11);
                Statics.field4656 = new class419(Statics.field133, var71, arg1.method7547(class378.field4347), 11);
                arg1.method7468(Statics.field1702, Statics.field133, var71, 16777215, 0);
            } else if (field953 == 3) {
                short var72 = 201;
                arg0.method7468(class378.field4337, field977 + 180, var72, 16776960, 0);
                int var164 = var72 + 20;
                arg1.method7468(class378.field4338, field977 + 180, var164, 16776960, 0);
                int var165 = var164 + 20;
                arg1.method7468(class378.field4231, field977 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var73 = field977 + 180;
                short var74 = 276;
                Statics.field945.method9196(var73 - 73, var74 - 20);
                arg2.method7468(class378.field4340, var73, var74 + 5, 16777215, 0);
                int var75 = field977 + 180;
                short var76 = 326;
                Statics.field945.method9196(var75 - 73, var76 - 20);
                arg2.method7468(class378.field4335, var75, var76 + 5, 16777215, 0);
            } else if (field953 == 4) {
                arg0.method7468(class378.field4317, field977 + 180, 201, 16776960, 0);
                short var77 = 236;
                arg0.method7468(field951, field977 + 180, var77, 16777215, 0);
                int var167 = var77 + 15;
                arg0.method7468(field956, field977 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                arg0.method7468(field972, field977 + 180, var168, 16777215, 0);
                int var169 = var168 + 15;
                String var79 = class378.field4329;
                String var80 = Statics.field3141;
                String var81 = class415.method4235('*', var80.length());
                arg0.method7488(var79 + var81 + (client.field821 % 40 < 20 ? class105.method7700(16776960) + class105.field1373 : ""), field977 + 180 - 108, var169, 16777215, 0);
                int var170 = var169 - 8;
                arg0.method7488(class378.field4098, field977 + 180 - 9, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg0.method7488(class378.field4099, field977 + 180 - 9, var171, 16776960, 0);
                int var82 = field977 + 180 - 9 + arg0.method7547(class378.field4099) + 15;
                int var83 = var171 - arg0.field4760;
                class559 var84;
                if (field965) {
                    var84 = Statics.field2099;
                } else {
                    var84 = Statics.field4579;
                }
                var84.method9196(var82, var83);
                var167 = var171 + 15;
                int var85 = field977 + 180 - 80;
                short var86 = 321;
                Statics.field945.method9196(var85 - 73, var86 - 20);
                arg0.method7468(class378.field4371, var85, var86 + 5, 16777215, 0);
                int var87 = field977 + 180 + 80;
                Statics.field945.method9196(var87 - 73, var86 - 20);
                arg0.method7468(class378.field4153, var87, var86 + 5, 16777215, 0);
                arg1.method7468(class378.field4346, field977 + 180, var86 + 36, 16777215, 0);
            } else if (field953 == 5) {
                arg0.method7468(class378.field4362, field977 + 180, 201, 16776960, 0);
                short var88 = 221;
                arg2.method7468(field951, field977 + 180, var88, 16776960, 0);
                int var172 = var88 + 15;
                arg2.method7468(field956, field977 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                arg2.method7468(field972, field977 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                int var175 = var174 + 14;
                arg0.method7488(class378.field4121, field977 + 180 - 145, var175, 16777215, 0);
                short var89 = 174;
                String var90;
                for (var90 = method3093(); arg0.method7547(var90) > var89; var90 = var90.substring(1)) {
                }
                arg0.method7488(class435.method7464(var90) + (client.field821 % 40 < 20 ? class105.method7700(16776960) + class105.field1373 : ""), field977 + 180 - 34, var175, 16777215, 0);
                var172 = var175 + 15;
                int var91 = field977 + 180 - 80;
                short var92 = 321;
                Statics.field945.method9196(var91 - 73, var92 - 20);
                arg0.method7468(class378.field4198, var91, var92 + 5, 16777215, 0);
                int var93 = field977 + 180 + 80;
                Statics.field945.method9196(var93 - 73, var92 - 20);
                arg0.method7468(class378.field4345, var93, var92 + 5, 16777215, 0);
                short var94 = 356;
                arg1.method7468(class378.field4347, Statics.field133, var94, 268435455, 0);
            } else if (field953 == 6) {
                short var95 = 201;
                arg0.method7468(field951, field977 + 180, var95, 16776960, 0);
                int var176 = var95 + 15;
                arg0.method7468(field956, field977 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                arg0.method7468(field972, field977 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                int var96 = field977 + 180;
                short var97 = 321;
                Statics.field945.method9196(var96 - 73, var97 - 20);
                arg0.method7468(class378.field4345, var96, var97 + 5, 16777215, 0);
            } else if (field953 == 7) {
                if (Statics.field3977 && !client.field608) {
                    short var98 = 201;
                    arg0.method7468(field951, Statics.field133, var98, 16776960, 0);
                    int var179 = var98 + 15;
                    arg0.method7468(field956, Statics.field133, var179, 16776960, 0);
                    int var180 = var179 + 15;
                    arg0.method7468(field972, Statics.field133, var180, 16776960, 0);
                    int var99 = Statics.field133 - 150;
                    int var181 = var180 + 10;
                    for (int var100 = 0; var100 < 8; var100++) {
                        Statics.field945.method9198(var99, var181, 30, 40);
                        boolean var101 = field974 == var100 & client.field821 % 40 < 20;
                        arg0.method7488((field961[var100] == null ? "" : field961[var100]) + (var101 ? class105.method7700(16776960) + class105.field1373 : ""), var99 + 10, var181 + 27, 16777215, 0);
                        if (var100 == 1 || var100 == 3) {
                            var99 += 50;
                            arg0.method7488(class435.method7464("/"), var99 - 13, var181 + 27, 16777215, 0);
                        } else {
                            var99 += 35;
                        }
                    }
                    int var102 = Statics.field133 - 80;
                    short var103 = 321;
                    Statics.field945.method9196(var102 - 73, var103 - 20);
                    arg0.method7468("Submit", var102, var103 + 5, 16777215, 0);
                    int var104 = Statics.field133 + 80;
                    Statics.field945.method9196(var104 - 73, var103 - 20);
                    arg0.method7468(class378.field4153, var104, var103 + 5, 16777215, 0);
                } else {
                    short var105 = 216;
                    arg0.method7468(class378.field4373, field977 + 180, var105, 16776960, 0);
                    int var182 = var105 + 15;
                    arg2.method7468(class378.field4374, field977 + 180, var182, 16776960, 0);
                    int var183 = var182 + 15;
                    arg2.method7468(class378.field4375, field977 + 180, var183, 16776960, 0);
                    int var184 = var183 + 15;
                    int var106 = field977 + 180 - 80;
                    short var107 = 321;
                    Statics.field945.method9196(var106 - 73, var107 - 20);
                    arg0.method7468(class378.field4376, var106, var107 + 5, 16777215, 0);
                    int var108 = field977 + 180 + 80;
                    Statics.field945.method9196(var108 - 73, var107 - 20);
                    arg0.method7468(class378.field4345, var108, var107 + 5, 16777215, 0);
                }
            } else if (field953 == 8) {
                short var109 = 216;
                arg0.method7468(class378.field4230, field977 + 180, var109, 16776960, 0);
                int var185 = var109 + 15;
                arg2.method7468(class378.field4363, field977 + 180, var185, 16776960, 0);
                int var186 = var185 + 15;
                arg2.method7468(class378.field4232, field977 + 180, var186, 16776960, 0);
                int var187 = var186 + 15;
                int var110 = field977 + 180 - 80;
                short var111 = 321;
                Statics.field945.method9196(var110 - 73, var111 - 20);
                arg0.method7468(class378.field4087, var110, var111 + 5, 16777215, 0);
                int var112 = field977 + 180 + 80;
                Statics.field945.method9196(var112 - 73, var111 - 20);
                arg0.method7468(class378.field4345, var112, var111 + 5, 16777215, 0);
            } else if (field953 == 9) {
                short var113 = 221;
                arg0.method7468(field951, field977 + 180, var113, 16776960, 0);
                int var188 = var113 + 25;
                arg0.method7468(field956, field977 + 180, var188, 16776960, 0);
                int var189 = var188 + 25;
                arg0.method7468(field972, field977 + 180, var189, 16776960, 0);
                int var114 = field977 + 180;
                short var115 = 311;
                Statics.field945.method9196(var114 - 73, var115 - 20);
                arg0.method7468(class378.field4340, var114, var115 + 5, 16777215, 0);
            } else if (field953 == 10) {
                int var116 = field977 + 180;
                short var117 = 209;
                arg0.method7468(class378.field4330, field977 + 180, var117, 16776960, 0);
                int var190 = var117 + 20;
                Statics.field4777.method9196(var116 - 109, var190);
                if (field962.isEmpty()) {
                    Statics.field2241.method9196(var116 - 48, var190 + 18);
                } else {
                    Statics.field2241.method9196(var116 - 48, var190 + 5);
                    arg0.method7468(field962, var116, var190 + 68 - 15, 16776960, 0);
                }
            } else if (field953 == 12) {
                int var118 = Statics.field133;
                short var119 = 216;
                arg2.method7468(class378.field4380, var118, var119, 16777215, 0);
                int var191 = var119 + 17;
                arg2.method7468(class378.field4251, var118, var191, 16777215, 0);
                int var192 = var191 + 17;
                arg2.method7468(class378.field4105, var118, var192, 16777215, 0);
                int var193 = var192 + 17;
                arg2.method7468(class378.field4383, var118, var193, 16777215, 0);
                int var120 = Statics.field133 - 80;
                short var121 = 311;
                Statics.field945.method9196(var120 - 73, var121 - 20);
                arg0.method7468(class378.field4386, var120, var121 + 5, 16777215, 0);
                int var122 = Statics.field133 + 80;
                Statics.field945.method9196(var122 - 73, var121 - 20);
                arg0.method7468(class378.field4387, var122, var121 + 5, 16777215, 0);
            } else if (field953 == 13) {
                short var123 = 231;
                arg2.method7468(class378.field4240, field977 + 180, var123, 16777215, 0);
                int var194 = var123 + 20;
                arg2.method7468(class378.field4385, field977 + 180, var194, 16777215, 0);
                int var124 = field977 + 180;
                short var125 = 311;
                Statics.field945.method9196(var124 - 73, var125 - 20);
                arg0.method7468(class378.field4345, var124, var125 + 5, 16777215, 0);
            } else if (field953 == 14) {
                short var126 = 201;
                String var127 = "";
                String var128 = "";
                String var129 = "";
                switch(field948) {
                    case 0:
                        var127 = class378.field4143;
                        var128 = class378.field4144;
                        var129 = class378.field4145;
                        break;
                    case 1:
                        var127 = class378.field4127;
                        var128 = class378.field4183;
                        var129 = class378.field4384;
                        break;
                    case 2:
                        var127 = class378.field4218;
                        var128 = class378.field4219;
                        var129 = class378.field4220;
                        break;
                    default:
                        method5391(false);
                }
                arg0.method7468(var127, field977 + 180, var126, 16776960, 0);
                int var195 = var126 + 20;
                arg0.method7468(var128, field977 + 180, var195, 16776960, 0);
                int var196 = var195 + 20;
                arg0.method7468(var129, field977 + 180, var196, 16776960, 0);
                int var130 = field977 + 180;
                short var131 = 276;
                Statics.field945.method9196(var130 - 73, var131 - 20);
                if (field948 == 1) {
                    arg0.method7468(class378.field4382, var130, var131 + 5, 16777215, 0);
                } else {
                    arg0.method7468(class378.field4126, var130, var131 + 5, 16777215, 0);
                }
                int var132 = field977 + 180;
                short var133 = 326;
                Statics.field945.method9196(var132 - 73, var133 - 20);
                arg0.method7468(class378.field4345, var132, var133 + 5, 16777215, 0);
            } else if (field953 == 24) {
                short var134 = 221;
                arg0.method7468(field951, field977 + 180, var134, 16777215, 0);
                int var197 = var134 + 15;
                arg0.method7468(field956, field977 + 180, var197, 16777215, 0);
                int var198 = var197 + 15;
                arg0.method7468(field972, field977 + 180, var198, 16777215, 0);
                int var199 = var198 + 15;
                int var135 = field977 + 180;
                short var136 = 301;
                Statics.field945.method9196(var135 - 73, var136 - 20);
                arg0.method7468(class378.field4279, var135, var136 + 5, 16777215, 0);
            } else if (field953 == 32) {
                short var137 = 216;
                arg0.method7468(class378.field4373, field977 + 180, var137, 16776960, 0);
                int var200 = var137 + 15;
                arg2.method7468(class378.field4374, field977 + 180, var200, 16776960, 0);
                int var201 = var200 + 15;
                arg2.method7468(class378.field4375, field977 + 180, var201, 16776960, 0);
                int var202 = var201 + 15;
                int var138 = field977 + 180 - 80;
                short var139 = 321;
                Statics.field945.method9196(var138 - 73, var139 - 20);
                arg0.method7468(class378.field4376, var138, var139 + 5, 16777215, 0);
                int var140 = field977 + 180 + 80;
                Statics.field945.method9196(var140 - 73, var139 - 20);
                arg0.method7468(class378.field4345, var140, var139 + 5, 16777215, 0);
            } else if (field953 == 33) {
                short var141 = 201;
                arg0.method7468(field951, field977 + 180, var141, 16776960, 0);
                int var203 = var141 + 20;
                arg1.method7468(field956, field977 + 180, var203, 16776960, 0);
                int var204 = var203 + 20;
                arg1.method7468(field972, field977 + 180, var204, 16776960, 0);
                int var205 = var204 + 15;
                int var142 = field977 + 180;
                short var143 = 276;
                Statics.field945.method9196(var142 - 73, var143 - 20);
                arg2.method7468(class378.field4399, var142, var143 + 5, 16777215, 0);
                int var144 = field977 + 180;
                short var145 = 326;
                Statics.field945.method9196(var144 - 73, var145 - 20);
                arg2.method7468(class378.field4345, var144, var145 + 5, 16777215, 0);
            }
        }
        if (client.field598 >= 10) {
            int[] var146 = new int[4];
            class556.method9155(var146);
            class556.method9104(field942, 0, field942 + 765, Statics.field5283);
            Statics.field2546.method2365(field942 - 22, client.field821);
            Statics.field2546.method2365(field942 + 765 + 22 - 128, client.field821);
            class556.method9107(var146);
        }
        Statics.field4749[Statics.field4879.method2394() ? 1 : 0].method9196(field942 + 765 - 40, 463);
        if (client.field598 <= 5 || Statics.field1965 != class402.field4605) {
            return;
        }
        if (Statics.field2216 == null) {
            Statics.field2216 = class561.method7880(Statics.field1885, "sl_button", "");
            return;
        }
        int var147 = field942 + 5;
        short var148 = 463;
        byte var149 = 100;
        byte var150 = 35;
        Statics.field2216.method9196(var147, var148);
        arg0.method7468(class378.field4270 + " " + client.field600, var149 / 2 + var147, var150 / 2 + var148 - 2, 16777215, 0);
        if (Statics.field120 == null) {
            arg1.method7468(class378.field4398, var149 / 2 + var147, var150 / 2 + var148 + 12, 16777215, 0);
        } else {
            arg1.method7468(class378.field4397, var149 / 2 + var147, var150 / 2 + var148 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ky.as(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5108(String arg0, String arg1, String arg2) {
        field951 = arg0;
        field956 = arg1;
        field972 = arg2;
    }

    @ObfuscatedName("th.aw(Lcl;I)V")
    public static void method8255(class70 arg0) {
        if (arg0.method1779() != client.field571) {
            client.field571 = arg0.method1779();
            boolean var1 = arg0.method1779();
            if (Statics.field3240 != var1) {
                class225.field2343.method5572();
                class225.field2334.method5572();
                class225.field2329.method5572();
                Statics.field3240 = var1;
            }
        }
        if (client.field718 != arg0.field846) {
            method2783(Statics.field1885, arg0.field846);
        }
        Statics.field60 = arg0.field842;
        client.field600 = arg0.field839;
        client.field718 = arg0.field846;
        Statics.field4076 = arg0.field833;
        Statics.field490 = client.field575 == 0 ? 43594 : arg0.field839 + 40000;
        Statics.field3208 = client.field575 == 0 ? 443 : arg0.field839 + 50000;
        Statics.field3050 = Statics.field490;
    }

    @ObfuscatedName("cv.ad(I)V")
    public static void method2023() {
        if (class70.method6725()) {
            field955 = true;
            field971 = 0;
            field960 = 0;
        }
    }

    @ObfuscatedName("ie.ai(I)V")
    public static void method3722() {
        method3803(24);
        method5108(class378.field4321, class378.field4252, class378.field4352);
    }

    @ObfuscatedName("lg.an(B)V")
    public static void method5429() {
        method3803(24);
        method5108(class378.field4324, class378.field4194, class378.field4326);
    }

    @ObfuscatedName("ii.am(II)V")
    public static void method3803(int arg0) {
        if (field953 != arg0) {
            field953 = arg0;
        }
    }

    @ObfuscatedName("ew.ar(Ljava/lang/String;B)V")
    public static void method2828(String arg0) {
        field962 = class525.method3069(arg0);
    }

    @ObfuscatedName("ge.ag(ILjava/lang/String;I)V")
    public static void method3303(int arg0, String arg1) {
        field963 = arg1;
        field949 = arg0;
    }
}
