package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

@ObfuscatedName("cu")
public class class86 {

    @ObfuscatedName("cu.q")
    public static int field1151 = 0;

    @ObfuscatedName("cu.y")
    public static int field1172 = field1151 + 202;

    @ObfuscatedName("cu.b")
    public static int field1149 = 10;

    @ObfuscatedName("cu.c")
    public static String field1158 = "";

    @ObfuscatedName("cu.aj")
    public static int field1159 = -1;

    @ObfuscatedName("cu.ac")
    public static int field1160 = 1;

    @ObfuscatedName("cu.aw")
    public static int field1161 = 0;

    @ObfuscatedName("cu.al")
    public static String field1162 = "";

    @ObfuscatedName("cu.ab")
    public static String field1163 = "";

    @ObfuscatedName("cu.ae")
    public static String field1173 = "";

    @ObfuscatedName("cu.at")
    public static String field1165 = "";

    @ObfuscatedName("cu.ad")
    public static String field1166 = "";

    @ObfuscatedName("cu.ap")
    public static String field1155 = "";

    @ObfuscatedName("cu.aa")
    public static boolean field1168 = false;

    @ObfuscatedName("cu.ax")
    public static boolean field1169 = false;

    @ObfuscatedName("cu.ba")
    public static boolean field1171 = true;

    @ObfuscatedName("cu.bb")
    public static int field1181 = 0;

    @ObfuscatedName("cu.bs")
    public static String field1152 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cu.bq")
    public static String field1174 = "1234567890";

    @ObfuscatedName("cu.bk")
    public static boolean field1175 = false;

    @ObfuscatedName("cu.bl")
    public static int field1176 = -1;

    @ObfuscatedName("cu.br")
    public static int field1177 = 0;

    @ObfuscatedName("cu.bj")
    public static int field1178 = 0;

    @ObfuscatedName("cu.bi")
    public static long field1179;

    @ObfuscatedName("cu.bz")
    public static long field1180;

    static {
        new DecimalFormat("##0.00");
        new class162();
        field1179 = -1L;
        field1180 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.m(Lir;Lir;I)I")
    public static int method2602(class245 arg0, class245 arg1) {
        int var2 = 0;
        if (arg0.method4178("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4178("logo", "")) {
            var2++;
        }
        if (arg1.method4178("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4178("titlebox", "")) {
            var2++;
        }
        if (arg1.method4178("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4178("runes", "")) {
            var2++;
        }
        if (arg1.method4178("title_mute", "")) {
            var2++;
        }
        if (arg1.method4178("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4178("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4178("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4178("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4178("sl_back", "");
        arg1.method4178("sl_flags", "");
        arg1.method4178("sl_arrows", "");
        arg1.method4178("sl_stars", "");
        arg1.method4178("sl_button", "");
        return var2;
    }

    @ObfuscatedName("w.f(I)I")
    public static int method25() {
        return 11;
    }

    @ObfuscatedName("q.q(Lir;Lir;ZII)V")
    public static void method17(class245 arg0, class245 arg1, boolean arg2, int arg3) {
        if (!Statics.field1150) {
            field1161 = arg3;
            class324.method5464();
            byte[] var4 = arg0.method4163("title.jpg", "");
            Statics.field1153 = class49.method381(var4);
            Statics.field3748 = Statics.field1153.method5572();
            if ((client.field623 & 0x20000000) == 0) {
                Statics.field141 = class329.method1850(arg1, "logo", "");
            } else {
                Statics.field141 = class329.method1850(arg1, "logo_deadman_mode", "");
            }
            Statics.field1157 = class329.method1850(arg1, "titlebox", "");
            Statics.field511 = class329.method1850(arg1, "titlebutton", "");
            int var5 = arg1.method4174("runes");
            int var6 = arg1.method4175(var5, "");
            class327[] var7;
            if (class329.method3998(arg1, var5, var6)) {
                var7 = class329.method387();
            } else {
                var7 = null;
            }
            Statics.field337 = var7;
            int var9 = arg1.method4174("title_mute");
            int var10 = arg1.method4175(var9, "");
            class327[] var11;
            if (class329.method3998(arg1, var9, var10)) {
                var11 = class329.method387();
            } else {
                var11 = null;
            }
            Statics.field381 = var11;
            Statics.field1164 = class329.method1850(arg1, "options_radio_buttons,0", "");
            Statics.field1089 = class329.method1850(arg1, "options_radio_buttons,4", "");
            Statics.field3798 = class329.method1850(arg1, "options_radio_buttons,2", "");
            Statics.field382 = class329.method1850(arg1, "options_radio_buttons,6", "");
            Statics.field2051 = Statics.field1164.field3892;
            Statics.field1513 = Statics.field1164.field3888;
            Statics.field86 = new class73(Statics.field337);
            if (arg2) {
                field1166 = "";
                field1155 = "";
            }
            Statics.field70 = 0;
            Statics.field1170 = "";
            field1171 = true;
            field1175 = false;
            if (Statics.field3868.field1029) {
                class215.method3196(2);
            } else {
                class215.method720(2, Statics.field1968, "scape main", "", 255, false);
            }
            class248.method3061(false);
            Statics.field1150 = true;
            field1151 = (Statics.field1402 - 765) / 2;
            field1172 = field1151 + 202;
            Statics.field2599 = field1172 + 180;
            Statics.field1153.method5581(field1151, 0);
            Statics.field3748.method5581(field1151 + 382, 0);
            Statics.field141.method5552(field1151 + 382 - Statics.field141.field3892 / 2, 18);
        } else if (arg3 == 4) {
            field1161 = 4;
        }
    }

    @ObfuscatedName("cw.w(I)V")
    public static void method2016() {
        if (field1166 != null && field1166.length() > 0) {
            return;
        }
        if (Statics.field3868.field1026 == null) {
            client.field752 = false;
        } else {
            field1166 = Statics.field3868.field1026;
            client.field752 = true;
        }
    }

    @ObfuscatedName("ce.o(I)V")
    public static void method1840() {
        if (!Statics.field1150) {
            return;
        }
        Statics.field1157 = null;
        Statics.field511 = null;
        Statics.field337 = null;
        Statics.field1153 = null;
        Statics.field3748 = null;
        Statics.field141 = null;
        Statics.field381 = null;
        Statics.field1164 = null;
        Statics.field3798 = null;
        Statics.field253 = null;
        Statics.field1869 = null;
        Statics.field1145 = null;
        Statics.field1930 = null;
        Statics.field3616 = null;
        Statics.field86.method1597();
        class215.method3196(2);
        class248.method3061(true);
        Statics.field1150 = false;
    }

    @ObfuscatedName("gy.u(B)V")
    public static void method3389() {
        if (client.field752 && field1166 != null && field1166.length() > 0) {
            field1181 = 1;
        } else {
            field1181 = 0;
        }
    }

    @ObfuscatedName("bs.g(Lba;I)V")
    public static void method954(class53 arg0) {
        if (field1175) {
            while (true) {
                if (!class45.method2277()) {
                    if (class54.field469 != 1 && (Statics.field3880 || class54.field469 != 4)) {
                        break;
                    }
                    int var1 = field1151 + 280;
                    if (class54.field462 >= var1 && class54.field462 <= var1 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(0, 0);
                        break;
                    }
                    if (class54.field462 >= var1 + 15 && class54.field462 <= var1 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(0, 1);
                        break;
                    }
                    int var2 = field1151 + 390;
                    if (class54.field462 >= var2 && class54.field462 <= var2 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(1, 0);
                        break;
                    }
                    if (class54.field462 >= var2 + 15 && class54.field462 <= var2 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(1, 1);
                        break;
                    }
                    int var3 = field1151 + 500;
                    if (class54.field462 >= var3 && class54.field462 <= var3 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(2, 0);
                        break;
                    }
                    if (class54.field462 >= var3 + 15 && class54.field462 <= var3 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(2, 1);
                        break;
                    }
                    int var4 = field1151 + 610;
                    if (class54.field462 >= var4 && class54.field462 <= var4 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(3, 0);
                        break;
                    }
                    if (class54.field462 >= var4 + 15 && class54.field462 <= var4 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
                        class72.method1810(3, 1);
                        break;
                    }
                    if (class54.field462 >= field1151 + 708 && class54.field475 >= 4 && class54.field462 <= field1151 + 708 + 50 && class54.field475 <= 20) {
                        method5178();
                        break;
                    }
                    if (field1176 == -1) {
                        if (field1177 > 0 && Statics.field1217 != null && class54.field462 >= 0 && class54.field462 <= Statics.field1217.field3892 && class54.field475 >= Statics.field2370 / 2 - 50 && class54.field475 <= Statics.field2370 / 2 + 50) {
                            field1177--;
                        }
                        if (field1177 < field1178 && Statics.field2068 != null && class54.field462 >= Statics.field1402 - Statics.field2068.field3892 - 5 && class54.field462 <= Statics.field1402 && class54.field475 >= Statics.field2370 / 2 - 50 && class54.field475 <= Statics.field2370 / 2 + 50) {
                            field1177++;
                        }
                    } else {
                        class72 var5 = Statics.field517[field1176];
                        method515(var5);
                        method5178();
                    }
                    break;
                }
                if (Statics.field3192 == 13) {
                    method5178();
                    break;
                }
                if (Statics.field3192 == 96) {
                    if (field1177 > 0 && Statics.field1217 != null) {
                        field1177--;
                    }
                } else if (Statics.field3192 == 97 && field1177 < field1178 && Statics.field2068 != null) {
                    field1177++;
                }
            }
            return;
        }
        if ((class54.field469 == 1 || !Statics.field3880 && class54.field469 == 4) && class54.field462 >= field1151 + 765 - 50 && class54.field475 >= 453) {
            Statics.field3868.field1029 = !Statics.field3868.field1029;
            class74.method230();
            if (Statics.field3868.field1029) {
                Statics.field2506.method3806();
                class215.field2503 = 1;
                Statics.field2505 = null;
            } else {
                class215.method3660(Statics.field1968, "scape main", "", 255, false);
            }
        }
        if (client.field630 == 5) {
            return;
        }
        if (field1179 == -1L) {
            field1179 = class204.method3658() + 1000L;
        }
        long var6 = class204.method3658();
        if (client.method4182() && field1180 == -1L) {
            field1180 = var6;
            if (field1180 > field1179) {
                field1179 = field1180;
            }
        }
        if (client.field630 != 10 && client.field630 != 11) {
            return;
        }
        if (client.field671 == 0) {
            if (class54.field469 == 1 || !Statics.field3880 && class54.field469 == 4) {
                int var8 = field1151 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class54.field462 >= var8 && class54.field462 <= var8 + var10 && class54.field475 >= var9 && class54.field475 <= var9 + var11) {
                    if (class72.method4944()) {
                        field1175 = true;
                        field1177 = 0;
                        field1178 = 0;
                    }
                    return;
                }
            }
            if (Statics.field3729 != null && class72.method4944()) {
                field1175 = true;
                field1177 = 0;
                field1178 = 0;
            }
        }
        int var12 = class54.field469;
        int var13 = class54.field462;
        int var14 = class54.field475;
        if (var12 == 0) {
            var13 = class54.field456;
            var14 = class54.field463;
        }
        if (!Statics.field3880 && var12 == 4) {
            var12 = 1;
        }
        if (field1161 == 0) {
            boolean var15 = false;
            while (class45.method2277()) {
                if (Statics.field3192 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field2599 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class51.method544(client.method1089("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field2599 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field623 & 0x2000000) != 0) {
                    field1162 = "";
                    field1163 = class236.field3069;
                    field1173 = class236.field3070;
                    field1165 = class236.field2849;
                    field1161 = 1;
                    method3389();
                } else if ((client.field623 & 0x4) != 0) {
                    if ((client.field623 & 0x400) == 0) {
                        field1163 = class236.field3060;
                        field1173 = class236.field2847;
                        field1165 = class236.field3062;
                    } else {
                        field1163 = class236.field3080;
                        field1173 = class236.field3067;
                        field1165 = class236.field2887;
                    }
                    field1162 = class236.field3059;
                    field1161 = 1;
                    method3389();
                } else if ((client.field623 & 0x400) == 0) {
                    method946(false);
                } else {
                    field1163 = class236.field3063;
                    field1173 = class236.field3038;
                    field1165 = class236.field3065;
                    field1162 = class236.field3059;
                    field1161 = 1;
                    method3389();
                }
            }
        } else if (field1161 == 1) {
            while (class45.method2277()) {
                if (Statics.field3192 == 84) {
                    method946(false);
                } else if (Statics.field3192 == 13) {
                    field1161 = 0;
                }
            }
            int var19 = Statics.field2599 - 80;
            short var20 = 321;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                method946(false);
            }
            int var21 = Statics.field2599 + 80;
            if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field1161 = 0;
            }
        } else if (field1161 == 2) {
            short var22 = 201;
            int var62 = var22 + 52;
            if (var12 == 1 && var14 >= var62 - 12 && var14 < var62 + 2) {
                field1181 = 0;
            }
            var62 += 15;
            if (var12 == 1 && var14 >= var62 - 12 && var14 < var62 + 2) {
                field1181 = 1;
            }
            var62 += 15;
            short var23 = 361;
            if (Statics.field1770 != null) {
                int var24 = Statics.field1770.field3855 / 2;
                if (var12 == 1 && var13 >= Statics.field1770.field3856 - var24 && var13 <= Statics.field1770.field3856 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(field1160) {
                        case 1:
                            method951(class236.field2919, class236.field3103, class236.field3096);
                            field1161 = 5;
                            return;
                        case 2:
                            class51.method544("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field2599 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1166 = field1166.trim();
                if (field1166.length() == 0) {
                    method951(class236.field2961, class236.field2962, class236.field3134);
                    return;
                }
                if (field1155.length() == 0) {
                    method951(class236.field2964, class236.field2850, class236.field2966);
                    return;
                }
                method951(class236.field3074, class236.field3075, class236.field3076);
                client.method167(false);
                client.method906(20);
                return;
            }
            int var27 = field1172 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1161 = 0;
                field1166 = "";
                field1155 = "";
                Statics.field70 = 0;
                Statics.field1170 = "";
                field1171 = true;
            }
            int var28 = Statics.field2599 + -117;
            short var29 = 277;
            field1168 = var13 >= var28 && var13 < Statics.field2051 + var28 && var14 >= var29 && var14 < Statics.field1513 + var29;
            if (var12 == 1 && field1168) {
                client.field752 = !client.field752;
                if (!client.field752 && Statics.field3868.field1026 != null) {
                    Statics.field3868.field1026 = null;
                    class74.method230();
                }
            }
            int var30 = Statics.field2599 + 24;
            short var31 = 277;
            field1169 = var13 >= var30 && var13 < Statics.field2051 + var30 && var14 >= var31 && var14 < Statics.field1513 + var31;
            if (var12 == 1 && field1169) {
                Statics.field3868.field1020 = !Statics.field3868.field1020;
                if (!Statics.field3868.field1020) {
                    field1166 = "";
                    Statics.field3868.field1026 = null;
                    method3389();
                }
                class74.method230();
            }
            while (true) {
                while (class45.method2277()) {
                    boolean var32 = false;
                    for (int var33 = 0; var33 < field1152.length(); var33++) {
                        if (Statics.field2380 == field1152.charAt(var33)) {
                            var32 = true;
                            break;
                        }
                    }
                    if (Statics.field3192 == 13) {
                        field1161 = 0;
                        field1166 = "";
                        field1155 = "";
                        Statics.field70 = 0;
                        Statics.field1170 = "";
                        field1171 = true;
                    } else if (field1181 == 0) {
                        if (Statics.field3192 == 85 && field1166.length() > 0) {
                            field1166 = field1166.substring(0, field1166.length() - 1);
                        }
                        if (Statics.field3192 == 84 || Statics.field3192 == 80) {
                            field1181 = 1;
                        }
                        if (var32 && field1166.length() < 320) {
                            field1166 = field1166 + Statics.field2380;
                        }
                    } else if (field1181 == 1) {
                        if (Statics.field3192 == 85 && field1155.length() > 0) {
                            field1155 = field1155.substring(0, field1155.length() - 1);
                        }
                        if (Statics.field3192 == 84 || Statics.field3192 == 80) {
                            field1181 = 0;
                        }
                        if (Statics.field3192 == 84) {
                            field1166 = field1166.trim();
                            if (field1166.length() == 0) {
                                method951(class236.field2961, class236.field2962, class236.field3134);
                                return;
                            }
                            if (field1155.length() == 0) {
                                method951(class236.field2964, class236.field2850, class236.field2966);
                                return;
                            }
                            method951(class236.field3074, class236.field3075, class236.field3076);
                            client.method167(false);
                            client.method906(20);
                            return;
                        }
                        if (var32 && field1155.length() < 20) {
                            field1155 = field1155 + Statics.field2380;
                        }
                    }
                }
                return;
            }
        } else if (field1161 == 3) {
            int var34 = field1172 + 180;
            short var35 = 276;
            if (var12 == 1 && var13 >= var34 - 75 && var13 <= var34 + 75 && var14 >= var35 - 20 && var14 <= var35 + 20) {
                method946(false);
            }
            int var36 = field1172 + 180;
            short var37 = 326;
            if (var12 == 1 && var13 >= var36 - 75 && var13 <= var36 + 75 && var14 >= var37 - 20 && var14 <= var37 + 20) {
                method951(class236.field2919, class236.field3103, class236.field3096);
                field1161 = 5;
                return;
            }
        } else if (field1161 == 4) {
            int var38 = field1172 + 180 - 80;
            short var39 = 321;
            if (var12 == 1 && var13 >= var38 - 75 && var13 <= var38 + 75 && var14 >= var39 - 20 && var14 <= var39 + 20) {
                Statics.field1170.trim();
                if (Statics.field1170.length() != 6) {
                    method951(class236.field2880, class236.field2881, class236.field2882);
                    return;
                }
                Statics.field70 = Integer.parseInt(Statics.field1170);
                Statics.field1170 = "";
                client.method167(true);
                method951(class236.field3074, class236.field3075, class236.field3076);
                client.method906(20);
                return;
            }
            if (var12 == 1 && var13 >= field1172 + 180 - 9 && var13 <= field1172 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field1171 = !field1171;
            }
            if (var12 == 1 && var13 >= field1172 + 180 - 34 && var13 <= field1172 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class51.method544(client.method1089("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var40 = field1172 + 180 + 80;
            if (var12 == 1 && var13 >= var40 - 75 && var13 <= var40 + 75 && var14 >= var39 - 20 && var14 <= var39 + 20) {
                field1161 = 0;
                field1166 = "";
                field1155 = "";
                Statics.field70 = 0;
                Statics.field1170 = "";
            }
            while (class45.method2277()) {
                boolean var41 = false;
                for (int var42 = 0; var42 < field1174.length(); var42++) {
                    if (Statics.field2380 == field1174.charAt(var42)) {
                        var41 = true;
                        break;
                    }
                }
                if (Statics.field3192 == 13) {
                    field1161 = 0;
                    field1166 = "";
                    field1155 = "";
                    Statics.field70 = 0;
                    Statics.field1170 = "";
                } else {
                    if (Statics.field3192 == 85 && Statics.field1170.length() > 0) {
                        Statics.field1170 = Statics.field1170.substring(0, Statics.field1170.length() - 1);
                    }
                    if (Statics.field3192 == 84) {
                        Statics.field1170.trim();
                        if (Statics.field1170.length() != 6) {
                            method951(class236.field2880, class236.field2881, class236.field2882);
                            return;
                        }
                        Statics.field70 = Integer.parseInt(Statics.field1170);
                        Statics.field1170 = "";
                        client.method167(true);
                        method951(class236.field3074, class236.field3075, class236.field3076);
                        client.method906(20);
                        return;
                    }
                    if (var41 && Statics.field1170.length() < 6) {
                        Statics.field1170 = Statics.field1170 + Statics.field2380;
                    }
                }
            }
        } else if (field1161 == 5) {
            int var43 = field1172 + 180 - 80;
            short var44 = 321;
            if (var12 == 1 && var13 >= var43 - 75 && var13 <= var43 + 75 && var14 >= var44 - 20 && var14 <= var44 + 20) {
                method4745();
                return;
            }
            int var45 = field1172 + 180 + 80;
            if (var12 == 1 && var13 >= var45 - 75 && var13 <= var45 + 75 && var14 >= var44 - 20 && var14 <= var44 + 20) {
                method946(true);
            }
            short var46 = 361;
            if (Statics.field1922 != null) {
                int var47 = Statics.field1922.field3855 / 2;
                if (var12 == 1 && var13 >= Statics.field1922.field3856 - var47 && var13 <= Statics.field1922.field3856 + var47 && var14 >= var46 - 15 && var14 < var46) {
                    class51.method544(client.method1089("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class45.method2277()) {
                boolean var48 = false;
                for (int var49 = 0; var49 < field1152.length(); var49++) {
                    if (Statics.field2380 == field1152.charAt(var49)) {
                        var48 = true;
                        break;
                    }
                }
                if (Statics.field3192 == 13) {
                    method946(true);
                } else {
                    if (Statics.field3192 == 85 && field1166.length() > 0) {
                        field1166 = field1166.substring(0, field1166.length() - 1);
                    }
                    if (Statics.field3192 == 84) {
                        method4745();
                        return;
                    }
                    if (var48 && field1166.length() < 320) {
                        field1166 = field1166 + Statics.field2380;
                    }
                }
            }
        } else if (field1161 == 6) {
            while (true) {
                do {
                    if (!class45.method2277()) {
                        short var50 = 321;
                        if (var12 == 1 && var14 >= var50 - 20 && var14 <= var50 + 20) {
                            method946(true);
                        }
                        return;
                    }
                } while (Statics.field3192 != 84 && Statics.field3192 != 13);
                method946(true);
            }
        } else if (field1161 == 7) {
            int var51 = field1172 + 180 - 80;
            short var52 = 321;
            if (var12 == 1 && var13 >= var51 - 75 && var13 <= var51 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                class51.method544(client.method1089("secure", true) + "m=dob/set_dob.ws", true, false);
                method951(class236.field3099, class236.field3000, class236.field3101);
                field1161 = 6;
                return;
            }
            int var53 = field1172 + 180 + 80;
            if (var12 == 1 && var13 >= var53 - 75 && var13 <= var53 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                method946(true);
            }
        } else if (field1161 == 8) {
            int var54 = field1172 + 180 - 80;
            short var55 = 321;
            if (var12 == 1 && var13 >= var54 - 75 && var13 <= var54 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                class51.method544("https://www.jagex.com/terms/privacy/#eight", true, false);
                method951(class236.field3099, class236.field3000, class236.field3101);
                field1161 = 6;
                return;
            }
            int var56 = field1172 + 180 + 80;
            if (var12 == 1 && var13 >= var56 - 75 && var13 <= var56 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                method946(true);
            }
        } else if (field1161 == 12) {
            String var57 = "";
            switch(field1159) {
                case 0:
                    var57 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var57 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method946(false);
            }
            int var58 = field1172 + 180;
            short var59 = 276;
            if (var12 == 1 && var13 >= var58 - 75 && var13 <= var58 + 75 && var14 >= var59 - 20 && var14 <= var59 + 20) {
                class51.method544(var57, true, false);
                method951(class236.field3099, class236.field3000, class236.field3101);
                field1161 = 6;
                return;
            }
            int var60 = field1172 + 180;
            short var61 = 326;
            if (var12 == 1 && var13 >= var60 - 75 && var13 <= var60 + 75 && var14 >= var61 - 20 && var14 <= var61 + 20) {
                method946(false);
            }
        }
    }

    @ObfuscatedName("bb.l(ZI)V")
    public static void method946(boolean arg0) {
        field1163 = class236.field2865;
        field1173 = class236.field3057;
        field1165 = class236.field3058;
        field1161 = 2;
        if (arg0) {
            field1155 = "";
        }
        method2016();
        method3389();
    }

    @ObfuscatedName("jz.e(I)V")
    public static void method4745() {
        field1166 = field1166.trim();
        if (field1166.length() == 0) {
            method951(class236.field2919, class236.field3103, class236.field3096);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1089("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class202 var4 = new class202(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2440, var4.field2439, 1000 - var4.field2439);
                if (var5 == -1) {
                    var4.field2439 = 0;
                    long var8 = var4.method3423();
                    var6 = var8;
                    break;
                }
                var4.field2439 += var5;
                if (var4.field2439 >= 1000) {
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
            var13 = class81.method1613(var6, field1166);
        }
        switch(var13) {
            case 2:
                method951(class236.field3105, class236.field3054, class236.field3107);
                field1161 = 6;
                break;
            case 3:
                method951(class236.field3030, class236.field3109, class236.field3110);
                break;
            case 4:
                method951(class236.field3111, class236.field3112, class236.field3113);
                break;
            case 5:
                method951(class236.field3114, class236.field3115, class236.field3116);
                break;
            case 6:
                method951(class236.field3061, class236.field2886, class236.field3119);
                break;
            case 7:
                method951(class236.field3120, class236.field3121, class236.field2995);
        }
    }

    @ObfuscatedName("bd.x(Lkk;Lkk;Lkk;I)V")
    public static void method1010(class302 arg0, class302 arg1, class302 arg2) {
        field1151 = (Statics.field1402 - 765) / 2;
        field1172 = field1151 + 202;
        Statics.field2599 = field1172 + 180;
        if (field1175) {
            if (Statics.field253 == null) {
                Statics.field253 = Statics.method15(Statics.field194, "sl_back", "");
            }
            if (Statics.field1869 == null) {
                class247 var3 = Statics.field194;
                int var4 = var3.method4174("sl_flags");
                int var5 = var3.method4175(var4, "");
                class327[] var6;
                if (class329.method3998(var3, var4, var5)) {
                    var6 = class329.method387();
                } else {
                    var6 = null;
                }
                Statics.field1869 = var6;
            }
            if (Statics.field1145 == null) {
                class247 var8 = Statics.field194;
                int var9 = var8.method4174("sl_arrows");
                int var10 = var8.method4175(var9, "");
                class327[] var11;
                if (class329.method3998(var8, var9, var10)) {
                    var11 = class329.method387();
                } else {
                    var11 = null;
                }
                Statics.field1145 = var11;
            }
            if (Statics.field1930 == null) {
                class247 var13 = Statics.field194;
                int var14 = var13.method4174("sl_stars");
                int var15 = var13.method4175(var14, "");
                class327[] var16;
                if (class329.method3998(var13, var14, var15)) {
                    var16 = class329.method387();
                } else {
                    var16 = null;
                }
                Statics.field1930 = var16;
            }
            if (Statics.field1217 == null) {
                Statics.field1217 = class329.method1850(Statics.field194, "leftarrow", "");
            }
            if (Statics.field2068 == null) {
                Statics.field2068 = class329.method1850(Statics.field194, "rightarrow", "");
            }
            class324.method5468(field1151, 23, 765, 480, 0);
            class324.method5469(field1151, 0, 125, 23, 12425273, 9135624);
            class324.method5469(field1151 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5210(class236.field3127, field1151 + 62, 15, 0, -1);
            if (Statics.field1930 != null) {
                Statics.field1930[1].method5552(field1151 + 140, 1);
                arg1.method5207(class236.field3128, field1151 + 152, 10, 16777215, -1);
                Statics.field1930[0].method5552(field1151 + 140, 12);
                arg1.method5207(class236.field3129, field1151 + 152, 21, 16777215, -1);
            }
            if (Statics.field1145 != null) {
                int var18 = field1151 + 280;
                if (class72.field989[0] == 0 && class72.field993[0] == 0) {
                    Statics.field1145[2].method5552(var18, 4);
                } else {
                    Statics.field1145[0].method5552(var18, 4);
                }
                if (class72.field989[0] == 0 && class72.field993[0] == 1) {
                    Statics.field1145[3].method5552(var18 + 15, 4);
                } else {
                    Statics.field1145[1].method5552(var18 + 15, 4);
                }
                arg0.method5207(class236.field2891, var18 + 32, 17, 16777215, -1);
                int var19 = field1151 + 390;
                if (class72.field989[0] == 1 && class72.field993[0] == 0) {
                    Statics.field1145[2].method5552(var19, 4);
                } else {
                    Statics.field1145[0].method5552(var19, 4);
                }
                if (class72.field989[0] == 1 && class72.field993[0] == 1) {
                    Statics.field1145[3].method5552(var19 + 15, 4);
                } else {
                    Statics.field1145[1].method5552(var19 + 15, 4);
                }
                arg0.method5207(class236.field3131, var19 + 32, 17, 16777215, -1);
                int var20 = field1151 + 500;
                if (class72.field989[0] == 2 && class72.field993[0] == 0) {
                    Statics.field1145[2].method5552(var20, 4);
                } else {
                    Statics.field1145[0].method5552(var20, 4);
                }
                if (class72.field989[0] == 2 && class72.field993[0] == 1) {
                    Statics.field1145[3].method5552(var20 + 15, 4);
                } else {
                    Statics.field1145[1].method5552(var20 + 15, 4);
                }
                arg0.method5207(class236.field2901, var20 + 32, 17, 16777215, -1);
                int var21 = field1151 + 610;
                if (class72.field989[0] == 3 && class72.field993[0] == 0) {
                    Statics.field1145[2].method5552(var21, 4);
                } else {
                    Statics.field1145[0].method5552(var21, 4);
                }
                if (class72.field989[0] == 3 && class72.field993[0] == 1) {
                    Statics.field1145[3].method5552(var21 + 15, 4);
                } else {
                    Statics.field1145[1].method5552(var21 + 15, 4);
                }
                arg0.method5207(class236.field3133, var21 + 32, 17, 16777215, -1);
            }
            class324.method5468(field1151 + 708, 4, 50, 16, 0);
            arg1.method5210(class236.field3084, field1151 + 708 + 25, 16, 16777215, -1);
            field1176 = -1;
            if (Statics.field253 != null) {
                byte var22 = 88;
                byte var23 = 19;
                int var24 = 765 / (var22 + 1) - 1;
                int var25 = 480 / (var23 + 1);
                int var26;
                int var27;
                do {
                    var26 = var25;
                    var27 = var24;
                    if ((var24 - 1) * var25 >= class72.field991) {
                        var24--;
                    }
                    if ((var25 - 1) * var24 >= class72.field991) {
                        var25--;
                    }
                    if ((var25 - 1) * var24 >= class72.field991) {
                        var25--;
                    }
                } while (var25 != var26 || var24 != var27);
                int var28 = (765 - var22 * var24) / (var24 + 1);
                if (var28 > 5) {
                    var28 = 5;
                }
                int var29 = (480 - var23 * var25) / (var25 + 1);
                if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = (765 - var22 * var24 - (var24 - 1) * var28) / 2;
                int var31 = (480 - var23 * var25 - (var25 - 1) * var29) / 2;
                int var32 = (class72.field991 + var25 - 1) / var25;
                field1178 = var32 - var24;
                if (Statics.field1217 != null && field1177 > 0) {
                    Statics.field1217.method5552(8, Statics.field2370 / 2 - Statics.field1217.field3888 / 2);
                }
                if (Statics.field2068 != null && field1177 < field1178) {
                    Statics.field2068.method5552(Statics.field1402 - Statics.field2068.field3892 - 8, Statics.field2370 / 2 - Statics.field2068.field3888 / 2);
                }
                int var33 = var31 + 23;
                int var34 = field1151 + var30;
                int var35 = 0;
                boolean var36 = false;
                int var37 = field1177;
                for (int var38 = var25 * var37; var38 < class72.field991 && var37 - field1177 < var24; var38++) {
                    class72 var39 = Statics.field517[var38];
                    boolean var40 = true;
                    String var41 = Integer.toString(var39.field992);
                    if (var39.field992 == -1) {
                        var41 = class236.field2845;
                        var40 = false;
                    } else if (var39.field992 > 1980) {
                        var41 = class236.field2976;
                        var40 = false;
                    }
                    int var42 = 0;
                    byte var43;
                    if (var39.method1575()) {
                        if (var39.method1558()) {
                            var43 = 7;
                        } else {
                            var43 = 6;
                        }
                    } else if (var39.method1562()) {
                        var42 = 16711680;
                        if (var39.method1558()) {
                            var43 = 5;
                        } else {
                            var43 = 4;
                        }
                    } else if (var39.method1560()) {
                        if (var39.method1558()) {
                            var43 = 3;
                        } else {
                            var43 = 2;
                        }
                    } else if (var39.method1558()) {
                        var43 = 1;
                    } else {
                        var43 = 0;
                    }
                    if (class54.field456 >= var34 && class54.field463 >= var33 && class54.field456 < var22 + var34 && class54.field463 < var23 + var33 && var40) {
                        field1176 = var38;
                        Statics.field253[var43].method5587(var34, var33, 128, 16777215);
                        var36 = true;
                    } else {
                        Statics.field253[var43].method5581(var34, var33);
                    }
                    if (Statics.field1869 != null) {
                        Statics.field1869[(var39.method1558() ? 8 : 0) + var39.field995].method5552(var34 + 29, var33);
                    }
                    arg0.method5210(Integer.toString(var39.field990), var34 + 15, var23 / 2 + var33 + 5, var42, -1);
                    arg1.method5210(var41, var34 + 60, var23 / 2 + var33 + 5, 268435455, -1);
                    var33 += var23 + var29;
                    var35++;
                    if (var35 >= var25) {
                        var33 = var31 + 23;
                        var34 += var22 + var28;
                        var35 = 0;
                        var37++;
                    }
                }
                if (var36) {
                    int var44 = arg1.method5202(Statics.field517[field1176].field994) + 6;
                    int var45 = arg1.field3762 + 8;
                    int var46 = class54.field463 + 25;
                    if (var45 + var46 > 480) {
                        var46 = class54.field463 - 25 - var45;
                    }
                    class324.method5468(class54.field456 - var44 / 2, var46, var44, var45, 16777120);
                    class324.method5466(class54.field456 - var44 / 2, var46, var44, var45, 0);
                    arg1.method5210(Statics.field517[field1176].field994, class54.field456, arg1.field3762 + var46 + 4, 0, -1);
                }
            }
            Statics.field2396.method767(0, 0);
            return;
        }
        Statics.field1153.method5581(field1151, 0);
        Statics.field3748.method5581(field1151 + 382, 0);
        Statics.field141.method5552(field1151 + 382 - Statics.field141.field3892 / 2, 18);
        if (client.field630 == 0 || client.field630 == 5) {
            byte var47 = 20;
            arg0.method5210(class236.field3055, field1172 + 180, 245 - var47, 16777215, -1);
            int var48 = 253 - var47;
            class324.method5466(field1172 + 180 - 152, var48, 304, 34, 9179409);
            class324.method5466(field1172 + 180 - 151, var48 + 1, 302, 32, 0);
            class324.method5468(field1172 + 180 - 150, var48 + 2, field1149 * 3, 30, 9179409);
            class324.method5468(field1149 * 3 + (field1172 + 180 - 150), var48 + 2, 300 - field1149 * 3, 30, 0);
            arg0.method5210(field1158, field1172 + 180, 276 - var47, 16777215, -1);
        }
        if (client.field630 == 20) {
            Statics.field1157.method5552(field1172 + 180 - Statics.field1157.field3892 / 2, 271 - Statics.field1157.field3888 / 2);
            short var49 = 201;
            arg0.method5210(field1163, field1172 + 180, var49, 16776960, 0);
            int var147 = var49 + 15;
            arg0.method5210(field1173, field1172 + 180, var147, 16776960, 0);
            int var148 = var147 + 15;
            arg0.method5210(field1165, field1172 + 180, var148, 16776960, 0);
            int var149 = var148 + 15;
            int var150 = var149 + 7;
            if (field1161 != 4) {
                arg0.method5207(class236.field3077, field1172 + 180 - 110, var150, 16777215, 0);
                short var50 = 200;
                String var53;
                if (Statics.field3868.field1020) {
                    String var51 = field1166;
                    String var52 = class309.method3161('*', var51.length());
                    var53 = var52;
                } else {
                    var53 = field1166;
                }
                String var55;
                for (var55 = var53; arg0.method5202(var55) > var50; var55 = var55.substring(0, var55.length() - 1)) {
                }
                arg0.method5207(class303.method5206(var55), field1172 + 180 - 70, var150, 16777215, 0);
                var147 = var150 + 15;
                String var57 = class236.field3078;
                String var58 = field1155;
                String var59 = class309.method3161('*', var58.length());
                arg0.method5207(var57 + var59, field1172 + 180 - 108, var147, 16777215, 0);
                var147 += 15;
            }
        }
        if (client.field630 == 10 || client.field630 == 11) {
            Statics.field1157.method5552(field1172, 171);
            if (field1161 == 0) {
                short var60 = 251;
                arg0.method5210(class236.field2977, field1172 + 180, var60, 16776960, 0);
                int var151 = var60 + 30;
                int var61 = field1172 + 180 - 80;
                short var62 = 291;
                Statics.field511.method5552(var61 - 73, var62 - 20);
                arg0.method5211(class236.field3081, var61 - 73, var62 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var63 = field1172 + 180 + 80;
                Statics.field511.method5552(var63 - 73, var62 - 20);
                arg0.method5211(class236.field3082, var63 - 73, var62 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1161 == 1) {
                arg0.method5210(field1162, field1172 + 180, 201, 16776960, 0);
                short var64 = 236;
                arg0.method5210(field1163, field1172 + 180, var64, 16777215, 0);
                int var152 = var64 + 15;
                arg0.method5210(field1173, field1172 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                arg0.method5210(field1165, field1172 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                int var65 = field1172 + 180 - 80;
                short var66 = 321;
                Statics.field511.method5552(var65 - 73, var66 - 20);
                arg0.method5210(class236.field3130, var65, var66 + 5, 16777215, 0);
                int var67 = field1172 + 180 + 80;
                Statics.field511.method5552(var67 - 73, var66 - 20);
                arg0.method5210(class236.field3084, var67, var66 + 5, 16777215, 0);
            } else if (field1161 == 2) {
                short var68 = 201;
                arg0.method5210(field1163, Statics.field2599, var68, 16776960, 0);
                int var155 = var68 + 15;
                arg0.method5210(field1173, Statics.field2599, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method5210(field1165, Statics.field2599, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var158 = var157 + 7;
                arg0.method5207(class236.field3077, Statics.field2599 - 110, var158, 16777215, 0);
                short var69 = 200;
                String var72;
                if (Statics.field3868.field1020) {
                    String var70 = field1166;
                    String var71 = class309.method3161('*', var70.length());
                    var72 = var71;
                } else {
                    var72 = field1166;
                }
                String var74;
                for (var74 = var72; arg0.method5202(var74) > var69; var74 = var74.substring(1)) {
                }
                arg0.method5207(class303.method5206(var74) + (field1181 == 0 & client.field633 % 40 < 20 ? class82.method2442(16776960) + class82.field1115 : ""), Statics.field2599 - 70, var158, 16777215, 0);
                var155 = var158 + 15;
                String var76 = class236.field3078;
                String var77 = field1155;
                String var78 = class309.method3161('*', var77.length());
                arg0.method5207(var76 + var78 + (field1181 == 1 & client.field633 % 40 < 20 ? class82.method2442(16776960) + class82.field1115 : ""), Statics.field2599 - 108, var155, 16777215, 0);
                var155 += 15;
                short var79 = 277;
                int var80 = Statics.field2599 + -117;
                boolean var81 = client.field752;
                boolean var82 = field1168;
                class327 var83 = var81 ? (var82 ? Statics.field382 : Statics.field3798) : (var82 ? Statics.field1089 : Statics.field1164);
                var83.method5552(var80, var79);
                int var85 = var83.field3892 + 5 + var80;
                arg1.method5207(class236.field3085, var85, var79 + 13, 16776960, 0);
                int var86 = Statics.field2599 + 24;
                boolean var87 = Statics.field3868.field1020;
                boolean var88 = field1169;
                class327 var89 = var87 ? (var88 ? Statics.field382 : Statics.field3798) : (var88 ? Statics.field1089 : Statics.field1164);
                var89.method5552(var86, var79);
                int var91 = var89.field3892 + 5 + var86;
                arg1.method5207(class236.field3086, var91, var79 + 13, 16776960, 0);
                int var159 = var79 + 15;
                int var92 = Statics.field2599 - 80;
                short var93 = 321;
                Statics.field511.method5552(var92 - 73, var93 - 20);
                arg0.method5210(class236.field3083, var92, var93 + 5, 16777215, 0);
                int var94 = Statics.field2599 + 80;
                Statics.field511.method5552(var94 - 73, var93 - 20);
                arg0.method5210(class236.field3084, var94, var93 + 5, 16777215, 0);
                short var95 = 357;
                switch(field1160) {
                    case 2:
                        Statics.field1143 = class236.field2946;
                        break;
                    default:
                        Statics.field1143 = class236.field2877;
                }
                Statics.field1770 = new class320(Statics.field2599, var95, arg1.method5202(Statics.field1143), 11);
                Statics.field1922 = new class320(Statics.field2599, var95, arg1.method5202(class236.field3097), 11);
                arg1.method5210(Statics.field1143, Statics.field2599, var95, 16777215, 0);
            } else if (field1161 == 3) {
                short var96 = 201;
                arg0.method5210(class236.field3087, field1172 + 180, var96, 16776960, 0);
                int var160 = var96 + 20;
                arg1.method5210(class236.field3088, field1172 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg1.method5210(class236.field2855, field1172 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                int var97 = field1172 + 180;
                short var98 = 276;
                Statics.field511.method5552(var97 - 73, var98 - 20);
                arg2.method5210(class236.field3090, var97, var98 + 5, 16777215, 0);
                int var99 = field1172 + 180;
                short var100 = 326;
                Statics.field511.method5552(var99 - 73, var100 - 20);
                arg2.method5210(class236.field2972, var99, var100 + 5, 16777215, 0);
            } else if (field1161 == 4) {
                arg0.method5210(class236.field3091, field1172 + 180, 201, 16776960, 0);
                short var101 = 236;
                arg0.method5210(field1163, field1172 + 180, var101, 16777215, 0);
                int var163 = var101 + 15;
                arg0.method5210(field1173, field1172 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                arg0.method5210(field1165, field1172 + 180, var164, 16777215, 0);
                int var165 = var164 + 15;
                String var103 = class236.field3079;
                String var104 = Statics.field1170;
                String var105 = class309.method3161('*', var104.length());
                arg0.method5207(var103 + var105 + (client.field633 % 40 < 20 ? class82.method2442(16776960) + class82.field1115 : ""), field1172 + 180 - 108, var165, 16777215, 0);
                int var166 = var165 - 8;
                arg0.method5207(class236.field3106, field1172 + 180 - 9, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg0.method5207(class236.field2851, field1172 + 180 - 9, var167, 16776960, 0);
                int var106 = field1172 + 180 - 9 + arg0.method5202(class236.field2851) + 15;
                int var107 = var167 - arg0.field3762;
                class327 var108;
                if (field1171) {
                    var108 = Statics.field3798;
                } else {
                    var108 = Statics.field1164;
                }
                var108.method5552(var106, var107);
                var163 = var167 + 15;
                int var109 = field1172 + 180 - 80;
                short var110 = 321;
                Statics.field511.method5552(var109 - 73, var110 - 20);
                arg0.method5210(class236.field3130, var109, var110 + 5, 16777215, 0);
                int var111 = field1172 + 180 + 80;
                Statics.field511.method5552(var111 - 73, var110 - 20);
                arg0.method5210(class236.field3084, var111, var110 + 5, 16777215, 0);
                arg1.method5210(class236.field3073, field1172 + 180, var110 + 36, 255, 0);
            } else if (field1161 == 5) {
                arg0.method5210(class236.field3052, field1172 + 180, 201, 16776960, 0);
                short var112 = 221;
                arg2.method5210(field1163, field1172 + 180, var112, 16776960, 0);
                int var168 = var112 + 15;
                arg2.method5210(field1173, field1172 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                arg2.method5210(field1165, field1172 + 180, var169, 16776960, 0);
                int var170 = var169 + 15;
                int var171 = var170 + 14;
                arg0.method5207(class236.field3093, field1172 + 180 - 145, var171, 16777215, 0);
                short var113 = 174;
                String var116;
                if (Statics.field3868.field1020) {
                    String var114 = field1166;
                    String var115 = class309.method3161('*', var114.length());
                    var116 = var115;
                } else {
                    var116 = field1166;
                }
                String var118;
                for (var118 = var116; arg0.method5202(var118) > var113; var118 = var118.substring(1)) {
                }
                arg0.method5207(class303.method5206(var118) + (client.field633 % 40 < 20 ? class82.method2442(16776960) + class82.field1115 : ""), field1172 + 180 - 34, var171, 16777215, 0);
                var168 = var171 + 15;
                int var119 = field1172 + 180 - 80;
                short var120 = 321;
                Statics.field511.method5552(var119 - 73, var120 - 20);
                arg0.method5210(class236.field3094, var119, var120 + 5, 16777215, 0);
                int var121 = field1172 + 180 + 80;
                Statics.field511.method5552(var121 - 73, var120 - 20);
                arg0.method5210(class236.field2899, var121, var120 + 5, 16777215, 0);
                short var122 = 356;
                arg1.method5210(class236.field3097, Statics.field2599, var122, 268435455, 0);
            } else if (field1161 == 6) {
                short var123 = 201;
                arg0.method5210(field1163, field1172 + 180, var123, 16776960, 0);
                int var172 = var123 + 15;
                arg0.method5210(field1173, field1172 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                arg0.method5210(field1165, field1172 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                int var124 = field1172 + 180;
                short var125 = 321;
                Statics.field511.method5552(var124 - 73, var125 - 20);
                arg0.method5210(class236.field2899, var124, var125 + 5, 16777215, 0);
            } else if (field1161 == 7) {
                short var126 = 216;
                arg0.method5210(class236.field3123, field1172 + 180, var126, 16776960, 0);
                int var175 = var126 + 15;
                arg2.method5210(class236.field3124, field1172 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg2.method5210(class236.field3125, field1172 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var127 = field1172 + 180 - 80;
                short var128 = 321;
                Statics.field511.method5552(var127 - 73, var128 - 20);
                arg0.method5210(class236.field2963, var127, var128 + 5, 16777215, 0);
                int var129 = field1172 + 180 + 80;
                Statics.field511.method5552(var129 - 73, var128 - 20);
                arg0.method5210(class236.field2899, var129, var128 + 5, 16777215, 0);
            } else if (field1161 == 8) {
                short var130 = 216;
                arg0.method5210(class236.field2979, field1172 + 180, var130, 16776960, 0);
                int var178 = var130 + 15;
                arg2.method5210(class236.field2990, field1172 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                arg2.method5210(class236.field2981, field1172 + 180, var179, 16776960, 0);
                int var180 = var179 + 15;
                int var131 = field1172 + 180 - 80;
                short var132 = 321;
                Statics.field511.method5552(var131 - 73, var132 - 20);
                arg0.method5210(class236.field2982, var131, var132 + 5, 16777215, 0);
                int var133 = field1172 + 180 + 80;
                Statics.field511.method5552(var133 - 73, var132 - 20);
                arg0.method5210(class236.field2899, var133, var132 + 5, 16777215, 0);
            } else if (field1161 == 12) {
                short var134 = 201;
                String var135 = "";
                String var136 = "";
                String var137 = "";
                switch(field1159) {
                    case 0:
                        var135 = class236.field2895;
                        var136 = class236.field2896;
                        var137 = class236.field2897;
                        break;
                    case 1:
                        var135 = class236.field2934;
                        var136 = class236.field2935;
                        var137 = class236.field2936;
                        break;
                    default:
                        method946(false);
                }
                arg0.method5210(var135, field1172 + 180, var134, 16776960, 0);
                int var181 = var134 + 15;
                arg2.method5210(var136, field1172 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                arg2.method5210(var137, field1172 + 180, var182, 16776960, 0);
                int var183 = var182 + 15;
                int var138 = field1172 + 180;
                short var139 = 276;
                Statics.field511.method5552(var138 - 73, var139 - 20);
                arg0.method5210(class236.field2978, var138, var139 + 5, 16777215, 0);
                int var140 = field1172 + 180;
                short var141 = 326;
                Statics.field511.method5552(var140 - 73, var141 - 20);
                arg0.method5210(class236.field2899, var140, var141 + 5, 16777215, 0);
            }
        }
        if (client.field630 >= 10) {
            int[] var142 = new int[4];
            class324.method5476(var142);
            class324.method5506(field1151, 0, field1151 + 765, Statics.field2370);
            Statics.field86.method1617(field1151 - 22, client.field633);
            Statics.field86.method1617(field1151 + 765 + 22 - 128, client.field633);
            class324.method5463(var142);
        }
        Statics.field381[Statics.field3868.field1029 ? 1 : 0].method5552(field1151 + 765 - 40, 463);
        if (client.field630 <= 5 || client.field671 != 0) {
            return;
        }
        if (Statics.field3616 == null) {
            Statics.field3616 = class329.method1850(Statics.field194, "sl_button", "");
            return;
        }
        int var143 = field1151 + 5;
        short var144 = 463;
        byte var145 = 100;
        byte var146 = 35;
        Statics.field3616.method5552(var143, var144);
        arg0.method5210(class236.field3010 + " " + client.field622, var145 / 2 + var143, var146 / 2 + var144 - 2, 16777215, 0);
        if (Statics.field3729 == null) {
            arg1.method5210(class236.field3137, var145 / 2 + var143, var146 / 2 + var144 + 12, 16777215, 0);
        } else {
            arg1.method5210(class236.field3029, var145 / 2 + var143, var146 / 2 + var144 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bs.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method951(String arg0, String arg1, String arg2) {
        field1163 = arg0;
        field1173 = arg1;
        field1165 = arg2;
    }

    @ObfuscatedName("ac.a(Lbt;I)V")
    public static void method515(class72 arg0) {
        if (arg0.method1558() != client.field625) {
            client.field625 = arg0.method1558();
            boolean var1 = arg0.method1558();
            if (Statics.field250 != var1) {
                class266.method1615();
                Statics.field250 = var1;
            }
        }
        Statics.field413 = arg0.field988;
        client.field622 = arg0.field990;
        client.field623 = arg0.field996;
        Statics.field13 = client.field753 == 0 ? 43594 : arg0.field990 + 40000;
        Statics.field216 = client.field753 == 0 ? 443 : arg0.field990 + 50000;
        Statics.field2451 = Statics.field13;
    }

    @ObfuscatedName("ay.z(II)V")
    public static void method521(int arg0) {
        field1161 = 12;
        field1159 = arg0;
    }

    @ObfuscatedName("kx.j(I)V")
    public static void method5178() {
        field1175 = false;
        Statics.field1153.method5581(field1151, 0);
        Statics.field3748.method5581(field1151 + 382, 0);
        Statics.field141.method5552(field1151 + 382 - Statics.field141.field3892 / 2, 18);
    }
}
