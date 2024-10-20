package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("cd")
public class class86 {

    @ObfuscatedName("cd.v")
    public static int field1180 = 0;

    @ObfuscatedName("cd.h")
    public static int field1166 = field1180 + 202;

    @ObfuscatedName("cd.f")
    public static int field1167 = 10;

    @ObfuscatedName("cd.j")
    public static String field1162 = "";

    @ObfuscatedName("cd.aa")
    public static int field1175 = -1;

    @ObfuscatedName("cd.ab")
    public static int field1172 = 1;

    @ObfuscatedName("cd.al")
    public static int field1173 = 0;

    @ObfuscatedName("cd.ad")
    public static String field1174 = "";

    @ObfuscatedName("cd.an")
    public static String field1191 = "";

    @ObfuscatedName("cd.ai")
    public static String field1176 = "";

    @ObfuscatedName("cd.ak")
    public static String field1170 = "";

    @ObfuscatedName("cd.aq")
    public static String field1181 = "";

    @ObfuscatedName("cd.am")
    public static String field1179 = "";

    @ObfuscatedName("cd.au")
    public static boolean field1177 = false;

    @ObfuscatedName("cd.af")
    public static boolean field1193 = false;

    @ObfuscatedName("cd.bh")
    public static boolean field1184 = true;

    @ObfuscatedName("cd.bd")
    public static int field1195 = 0;

    @ObfuscatedName("cd.bm")
    public static String field1160 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cd.bv")
    public static String field1185 = "1234567890";

    @ObfuscatedName("cd.bs")
    public static boolean field1186 = false;

    @ObfuscatedName("cd.bi")
    public static int field1187 = -1;

    @ObfuscatedName("cd.bb")
    public static int field1188 = 0;

    @ObfuscatedName("cd.bt")
    public static int field1189 = 0;

    @ObfuscatedName("cd.by")
    public static long field1182;

    @ObfuscatedName("cd.bq")
    public static long field1178;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1182 = -1L;
        field1178 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.z(Lhp;Lhp;ZII)V")
    public static void method371(class234 arg0, class234 arg1, boolean arg2, int arg3) {
        if (!Statics.field1161) {
            field1173 = arg3;
            class321.method5442();
            byte[] var4 = arg0.method3789("title.jpg", "");
            Statics.field261 = class50.method652(var4);
            Statics.field413 = Statics.field261.method5543();
            if ((client.field636 & 0x20000000) == 0) {
                Statics.field3656 = class326.method268(arg1, "logo", "");
            } else {
                Statics.field3656 = class326.method268(arg1, "logo_deadman_mode", "");
            }
            Statics.field267 = class326.method268(arg1, "titlebox", "");
            Statics.field3852 = class326.method268(arg1, "titlebutton", "");
            Statics.field1163 = Statics.method208(arg1, "runes", "");
            Statics.field1963 = Statics.method208(arg1, "title_mute", "");
            Statics.field2373 = class326.method268(arg1, "options_radio_buttons,0", "");
            Statics.field1047 = class326.method268(arg1, "options_radio_buttons,4", "");
            Statics.field351 = class326.method268(arg1, "options_radio_buttons,2", "");
            Statics.field1164 = class326.method268(arg1, "options_radio_buttons,6", "");
            Statics.field1146 = Statics.field2373.field3863;
            Statics.field287 = Statics.field2373.field3864;
            Statics.field3776 = new class73(Statics.field1163);
            if (arg2) {
                field1181 = "";
                field1179 = "";
            }
            Statics.field2306 = 0;
            Statics.field3897 = "";
            field1184 = true;
            field1186 = false;
            if (Statics.field3112.field1038) {
                class198.field2387 = 1;
                Statics.field2388 = null;
                Statics.field2324 = -1;
                Statics.field401 = -1;
                Statics.field1224 = 0;
                Statics.field152 = false;
                Statics.field2383 = 2;
            } else {
                class198.method180(2, Statics.field3047, "scape main", "", 255, false);
            }
            class237.method3550(false);
            Statics.field1161 = true;
            field1180 = (Statics.field1578 - 765) / 2;
            field1166 = field1180 + 202;
            Statics.field64 = field1166 + 180;
            Statics.field261.method5548(field1180, 0);
            Statics.field413.method5548(field1180 + 382, 0);
            Statics.field3656.method5515(field1180 + 382 - Statics.field3656.field3863 / 2, 18);
        } else if (arg3 == 4) {
            field1173 = 4;
        }
    }

    @ObfuscatedName("gy.n(ZZI)Llp;")
    public static class324 method3255(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1164 : Statics.field351) : (arg1 ? Statics.field1047 : Statics.field2373);
    }

    @ObfuscatedName("bk.v(I)V")
    public static void method1041() {
        if (field1181 != null && field1181.length() > 0) {
            return;
        }
        if (Statics.field3112.field1035 == null) {
            client.field674 = false;
        } else {
            field1181 = Statics.field3112.field1035;
            client.field674 = true;
        }
    }

    @ObfuscatedName("ge.u(Lbh;S)V")
    public static void method3264(class54 arg0) {
        if (field1186) {
            while (true) {
                if (!class46.method2020()) {
                    if (class55.field473 != 1 && (Statics.field183 || class55.field473 != 4)) {
                        break;
                    }
                    int var1 = field1180 + 280;
                    if (class55.field474 >= var1 && class55.field474 <= var1 + 14 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(0, 0);
                        break;
                    }
                    if (class55.field474 >= var1 + 15 && class55.field474 <= var1 + 80 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(0, 1);
                        break;
                    }
                    int var2 = field1180 + 390;
                    if (class55.field474 >= var2 && class55.field474 <= var2 + 14 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(1, 0);
                        break;
                    }
                    if (class55.field474 >= var2 + 15 && class55.field474 <= var2 + 80 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(1, 1);
                        break;
                    }
                    int var3 = field1180 + 500;
                    if (class55.field474 >= var3 && class55.field474 <= var3 + 14 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(2, 0);
                        break;
                    }
                    if (class55.field474 >= var3 + 15 && class55.field474 <= var3 + 80 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(2, 1);
                        break;
                    }
                    int var4 = field1180 + 610;
                    if (class55.field474 >= var4 && class55.field474 <= var4 + 14 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(3, 0);
                        break;
                    }
                    if (class55.field474 >= var4 + 15 && class55.field474 <= var4 + 80 && class55.field475 >= 4 && class55.field475 <= 18) {
                        class72.method3315(3, 1);
                        break;
                    }
                    if (class55.field474 >= field1180 + 708 && class55.field475 >= 4 && class55.field474 <= field1180 + 708 + 50 && class55.field475 <= 20) {
                        method3598();
                        break;
                    }
                    if (field1187 == -1) {
                        if (field1188 > 0 && Statics.field119 != null && class55.field474 >= 0 && class55.field474 <= Statics.field119.field3863 && class55.field475 >= Statics.field1904 / 2 - 50 && class55.field475 <= Statics.field1904 / 2 + 50) {
                            field1188--;
                        }
                        if (field1188 < field1189 && Statics.field1113 != null && class55.field474 >= Statics.field1578 - Statics.field1113.field3863 - 5 && class55.field474 <= Statics.field1578 && class55.field475 >= Statics.field1904 / 2 - 50 && class55.field475 <= Statics.field1904 / 2 + 50) {
                            field1188++;
                        }
                    } else {
                        class72 var5 = Statics.field1000[field1187];
                        method44(var5);
                        method3598();
                    }
                    break;
                }
                if (Statics.field1231 == 13) {
                    method3598();
                    break;
                }
                if (Statics.field1231 == 96) {
                    if (field1188 > 0 && Statics.field119 != null) {
                        field1188--;
                    }
                } else if (Statics.field1231 == 97 && field1188 < field1189 && Statics.field1113 != null) {
                    field1188++;
                }
            }
            return;
        }
        if ((class55.field473 == 1 || !Statics.field183 && class55.field473 == 4) && class55.field474 >= field1180 + 765 - 50 && class55.field475 >= 453) {
            Statics.field3112.field1038 = !Statics.field3112.field1038;
            class74.method3302();
            if (Statics.field3112.field1038) {
                class198.method2695();
            } else {
                class198.method3048(Statics.field3047, "scape main", "", 255, false);
            }
        }
        if (client.field642 == 5) {
            return;
        }
        if (field1182 == -1L) {
            field1182 = class297.method502() + 1000L;
        }
        long var6 = class297.method502();
        boolean var9;
        if (client.field907 == null || client.field714 >= client.field907.size()) {
            var9 = true;
        } else {
            while (true) {
                if (client.field714 >= client.field907.size()) {
                    var9 = true;
                    break;
                }
                class59 var8 = (class59) client.field907.get(client.field714);
                if (!var8.method1012()) {
                    var9 = false;
                    break;
                }
                client.field714++;
            }
        }
        if (var9 && field1178 == -1L) {
            field1178 = var6;
            if (field1178 > field1182) {
                field1182 = field1178;
            }
        }
        if (client.field642 != 10 && client.field642 != 11) {
            return;
        }
        if (Statics.field112 == class191.field2338) {
            if (class55.field473 == 1 || !Statics.field183 && class55.field473 == 4) {
                int var10 = field1180 + 5;
                short var11 = 463;
                byte var12 = 100;
                byte var13 = 35;
                if (class55.field474 >= var10 && class55.field474 <= var10 + var12 && class55.field475 >= var11 && class55.field475 <= var11 + var13) {
                    if (class72.method5273()) {
                        field1186 = true;
                        field1188 = 0;
                        field1189 = 0;
                    }
                    return;
                }
            }
            if (Statics.field415 != null && class72.method5273()) {
                field1186 = true;
                field1188 = 0;
                field1189 = 0;
            }
        }
        int var14 = class55.field473;
        int var15 = class55.field474;
        int var16 = class55.field475;
        if (var14 == 0) {
            var15 = class55.field466;
            var16 = class55.field467;
        }
        if (!Statics.field183 && var14 == 4) {
            var14 = 1;
        }
        if (field1173 == 0) {
            boolean var17 = false;
            while (class46.method2020()) {
                if (Statics.field1231 == 84) {
                    var17 = true;
                }
            }
            int var18 = Statics.field64 - 80;
            short var19 = 291;
            if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                class52.method3830(client.method2957("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var20 = Statics.field64 + 80;
            if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                if ((client.field636 & 0x2000000) != 0) {
                    field1174 = "";
                    field1191 = class225.field2967;
                    field1176 = class225.field2968;
                    field1170 = class225.field2960;
                    field1173 = 1;
                    if (client.field674 && field1181 != null && field1181.length() > 0) {
                        field1195 = 1;
                    } else {
                        field1195 = 0;
                    }
                } else if ((client.field636 & 0x4) != 0) {
                    if ((client.field636 & 0x400) == 0) {
                        field1191 = class225.field2958;
                        field1176 = class225.field2959;
                        field1170 = class225.field2806;
                    } else {
                        field1191 = class225.field2876;
                        field1176 = class225.field2965;
                        field1170 = class225.field2966;
                    }
                    field1174 = class225.field2957;
                    field1173 = 1;
                    if (client.field674 && field1181 != null && field1181.length() > 0) {
                        field1195 = 1;
                    } else {
                        field1195 = 0;
                    }
                } else if ((client.field636 & 0x400) == 0) {
                    method2778(false);
                } else {
                    field1191 = class225.field2961;
                    field1176 = class225.field2888;
                    field1170 = class225.field2963;
                    field1174 = class225.field2957;
                    field1173 = 1;
                    if (client.field674 && field1181 != null && field1181.length() > 0) {
                        field1195 = 1;
                    } else {
                        field1195 = 0;
                    }
                }
            }
        } else if (field1173 == 1) {
            while (class46.method2020()) {
                if (Statics.field1231 == 84) {
                    method2778(false);
                } else if (Statics.field1231 == 13) {
                    field1173 = 0;
                }
            }
            int var21 = Statics.field64 - 80;
            short var22 = 321;
            if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                method2778(false);
            }
            int var23 = Statics.field64 + 80;
            if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                field1173 = 0;
            }
        } else if (field1173 == 2) {
            short var24 = 201;
            int var66 = var24 + 52;
            if (var14 == 1 && var16 >= var66 - 12 && var16 < var66 + 2) {
                field1195 = 0;
            }
            var66 += 15;
            if (var14 == 1 && var16 >= var66 - 12 && var16 < var66 + 2) {
                field1195 = 1;
            }
            var66 += 15;
            short var25 = 361;
            if (Statics.field1033 != null) {
                int var26 = Statics.field1033.field3837 / 2;
                if (var14 == 1 && var15 >= Statics.field1033.field3839 - var26 && var15 <= Statics.field1033.field3839 + var26 && var16 >= var25 - 15 && var16 < var25) {
                    switch(field1172) {
                        case 1:
                            method3714(class225.field3006, class225.field3007, class225.field3008);
                            field1173 = 5;
                            return;
                        case 2:
                            class52.method3830("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var27 = Statics.field64 - 80;
            short var28 = 321;
            if (var14 == 1 && var15 >= var27 - 75 && var15 <= var27 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1181 = field1181.trim();
                if (field1181.length() == 0) {
                    method3714(class225.field2859, class225.field2981, class225.field2861);
                    return;
                }
                if (field1179.length() == 0) {
                    method3714(class225.field2862, class225.field2833, class225.field2925);
                    return;
                }
                method3714(class225.field2972, class225.field2834, class225.field2974);
                client.method3718(false);
                client.method1056(20);
                return;
            }
            int var29 = field1166 + 180 + 80;
            if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1173 = 0;
                field1181 = "";
                field1179 = "";
                Statics.field2306 = 0;
                Statics.field3897 = "";
                field1184 = true;
            }
            int var30 = Statics.field64 + -117;
            short var31 = 277;
            field1177 = var15 >= var30 && var15 < Statics.field1146 + var30 && var16 >= var31 && var16 < Statics.field287 + var31;
            if (var14 == 1 && field1177) {
                client.field674 = !client.field674;
                if (!client.field674 && Statics.field3112.field1035 != null) {
                    Statics.field3112.field1035 = null;
                    class74.method3302();
                }
            }
            int var32 = Statics.field64 + 24;
            short var33 = 277;
            field1193 = var15 >= var32 && var15 < Statics.field1146 + var32 && var16 >= var33 && var16 < Statics.field287 + var33;
            if (var14 == 1 && field1193) {
                Statics.field3112.field1041 = !Statics.field3112.field1041;
                if (!Statics.field3112.field1041) {
                    field1181 = "";
                    Statics.field3112.field1035 = null;
                    if (client.field674 && field1181 != null && field1181.length() > 0) {
                        field1195 = 1;
                    } else {
                        field1195 = 0;
                    }
                }
                class74.method3302();
            }
            while (true) {
                while (class46.method2020()) {
                    boolean var34 = false;
                    for (int var35 = 0; var35 < field1160.length(); var35++) {
                        if (Statics.field382 == field1160.charAt(var35)) {
                            var34 = true;
                            break;
                        }
                    }
                    if (Statics.field1231 == 13) {
                        field1173 = 0;
                        field1181 = "";
                        field1179 = "";
                        Statics.field2306 = 0;
                        Statics.field3897 = "";
                        field1184 = true;
                    } else if (field1195 == 0) {
                        if (Statics.field1231 == 85 && field1181.length() > 0) {
                            field1181 = field1181.substring(0, field1181.length() - 1);
                        }
                        if (Statics.field1231 == 84 || Statics.field1231 == 80) {
                            field1195 = 1;
                        }
                        if (var34 && field1181.length() < 320) {
                            field1181 = field1181 + Statics.field382;
                        }
                    } else if (field1195 == 1) {
                        if (Statics.field1231 == 85 && field1179.length() > 0) {
                            field1179 = field1179.substring(0, field1179.length() - 1);
                        }
                        if (Statics.field1231 == 84 || Statics.field1231 == 80) {
                            field1195 = 0;
                        }
                        if (Statics.field1231 == 84) {
                            field1181 = field1181.trim();
                            if (field1181.length() == 0) {
                                method3714(class225.field2859, class225.field2981, class225.field2861);
                                return;
                            }
                            if (field1179.length() == 0) {
                                method3714(class225.field2862, class225.field2833, class225.field2925);
                                return;
                            }
                            method3714(class225.field2972, class225.field2834, class225.field2974);
                            client.method3718(false);
                            client.method1056(20);
                            return;
                        }
                        if (var34 && field1179.length() < 20) {
                            field1179 = field1179 + Statics.field382;
                        }
                    }
                }
                return;
            }
        } else if (field1173 == 3) {
            int var36 = field1166 + 180;
            short var37 = 276;
            if (var14 == 1 && var15 >= var36 - 75 && var15 <= var36 + 75 && var16 >= var37 - 20 && var16 <= var37 + 20) {
                method2778(false);
            }
            int var38 = field1166 + 180;
            short var39 = 326;
            if (var14 == 1 && var15 >= var38 - 75 && var15 <= var38 + 75 && var16 >= var39 - 20 && var16 <= var39 + 20) {
                method3714(class225.field3006, class225.field3007, class225.field3008);
                field1173 = 5;
                return;
            }
        } else if (field1173 == 4) {
            int var40 = field1166 + 180 - 80;
            short var41 = 321;
            if (var14 == 1 && var15 >= var40 - 75 && var15 <= var40 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                Statics.field3897.trim();
                if (Statics.field3897.length() != 6) {
                    method3714(class225.field2802, class225.field2955, class225.field2780);
                    return;
                }
                Statics.field2306 = Integer.parseInt(Statics.field3897);
                Statics.field3897 = "";
                client.method3718(true);
                method3714(class225.field2972, class225.field2834, class225.field2974);
                client.method1056(20);
                return;
            }
            if (var14 == 1 && var15 >= field1166 + 180 - 9 && var15 <= field1166 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                field1184 = !field1184;
            }
            if (var14 == 1 && var15 >= field1166 + 180 - 34 && var15 <= field1166 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                class52.method3830(client.method2957("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var42 = field1166 + 180 + 80;
            if (var14 == 1 && var15 >= var42 - 75 && var15 <= var42 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                field1173 = 0;
                field1181 = "";
                field1179 = "";
                Statics.field2306 = 0;
                Statics.field3897 = "";
            }
            while (class46.method2020()) {
                boolean var43 = false;
                for (int var44 = 0; var44 < field1185.length(); var44++) {
                    if (Statics.field382 == field1185.charAt(var44)) {
                        var43 = true;
                        break;
                    }
                }
                if (Statics.field1231 == 13) {
                    field1173 = 0;
                    field1181 = "";
                    field1179 = "";
                    Statics.field2306 = 0;
                    Statics.field3897 = "";
                } else {
                    if (Statics.field1231 == 85 && Statics.field3897.length() > 0) {
                        Statics.field3897 = Statics.field3897.substring(0, Statics.field3897.length() - 1);
                    }
                    if (Statics.field1231 == 84) {
                        Statics.field3897.trim();
                        if (Statics.field3897.length() != 6) {
                            method3714(class225.field2802, class225.field2955, class225.field2780);
                            return;
                        }
                        Statics.field2306 = Integer.parseInt(Statics.field3897);
                        Statics.field3897 = "";
                        client.method3718(true);
                        method3714(class225.field2972, class225.field2834, class225.field2974);
                        client.method1056(20);
                        return;
                    }
                    if (var43 && Statics.field3897.length() < 6) {
                        Statics.field3897 = Statics.field3897 + Statics.field382;
                    }
                }
            }
        } else if (field1173 == 5) {
            int var45 = field1166 + 180 - 80;
            short var46 = 321;
            if (var14 == 1 && var15 >= var45 - 75 && var15 <= var45 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                method153();
                return;
            }
            int var47 = field1166 + 180 + 80;
            if (var14 == 1 && var15 >= var47 - 75 && var15 <= var47 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                method2778(true);
            }
            short var48 = 361;
            if (Statics.field1989 != null) {
                int var49 = Statics.field1989.field3837 / 2;
                if (var14 == 1 && var15 >= Statics.field1989.field3839 - var49 && var15 <= Statics.field1989.field3839 + var49 && var16 >= var48 - 15 && var16 < var48) {
                    class52.method3830(client.method2957("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method2020()) {
                boolean var50 = false;
                for (int var51 = 0; var51 < field1160.length(); var51++) {
                    if (Statics.field382 == field1160.charAt(var51)) {
                        var50 = true;
                        break;
                    }
                }
                if (Statics.field1231 == 13) {
                    method2778(true);
                } else {
                    if (Statics.field1231 == 85 && field1181.length() > 0) {
                        field1181 = field1181.substring(0, field1181.length() - 1);
                    }
                    if (Statics.field1231 == 84) {
                        method153();
                        return;
                    }
                    if (var50 && field1181.length() < 320) {
                        field1181 = field1181 + Statics.field382;
                    }
                }
            }
        } else if (field1173 == 6) {
            while (true) {
                do {
                    if (!class46.method2020()) {
                        short var52 = 321;
                        if (var14 == 1 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                            method2778(true);
                        }
                        return;
                    }
                } while (Statics.field1231 != 84 && Statics.field1231 != 13);
                method2778(true);
            }
        } else if (field1173 == 7) {
            int var53 = field1166 + 180 - 80;
            short var54 = 321;
            if (var14 == 1 && var15 >= var53 - 75 && var15 <= var53 + 75 && var16 >= var54 - 20 && var16 <= var54 + 20) {
                class52.method3830(client.method2957("secure", true) + "m=dob/set_dob.ws", true, false);
                method3714(class225.field3003, class225.field2947, class225.field3005);
                field1173 = 6;
                return;
            }
            int var55 = field1166 + 180 + 80;
            if (var14 == 1 && var15 >= var55 - 75 && var15 <= var55 + 75 && var16 >= var54 - 20 && var16 <= var54 + 20) {
                method2778(true);
            }
        } else if (field1173 == 8) {
            int var56 = field1166 + 180 - 80;
            short var57 = 321;
            if (var14 == 1 && var15 >= var56 - 75 && var15 <= var56 + 75 && var16 >= var57 - 20 && var16 <= var57 + 20) {
                class52.method3830("https://www.jagex.com/terms/privacy/#eight", true, false);
                method3714(class225.field3003, class225.field2947, class225.field3005);
                field1173 = 6;
                return;
            }
            int var58 = field1166 + 180 + 80;
            if (var14 == 1 && var15 >= var58 - 75 && var15 <= var58 + 75 && var16 >= var57 - 20 && var16 <= var57 + 20) {
                method2778(true);
            }
        } else if (field1173 == 12) {
            String var59 = "";
            switch(field1175) {
                case 0:
                    var59 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var59 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method2778(false);
            }
            int var60 = field1166 + 180;
            short var61 = 276;
            if (var14 == 1 && var15 >= var60 - 75 && var15 <= var60 + 75 && var16 >= var61 - 20 && var16 <= var61 + 20) {
                class52.method3830(var59, true, false);
                method3714(class225.field3003, class225.field2947, class225.field3005);
                field1173 = 6;
                return;
            }
            int var62 = field1166 + 180;
            short var63 = 326;
            if (var14 == 1 && var15 >= var62 - 75 && var15 <= var62 + 75 && var16 >= var63 - 20 && var16 <= var63 + 20) {
                method2778(false);
            }
        } else if (field1173 == 24) {
            int var64 = field1166 + 180;
            short var65 = 301;
            if (var14 == 1 && var15 >= var64 - 75 && var15 <= var64 + 75 && var16 >= var65 - 20 && var16 <= var65 + 20) {
                method2778(false);
            }
        }
    }

    @ObfuscatedName("ef.r(ZI)V")
    public static void method2778(boolean arg0) {
        field1191 = class225.field2975;
        field1176 = class225.field2746;
        field1170 = class225.field2956;
        field1173 = 2;
        if (arg0) {
            field1179 = "";
        }
        method1041();
        if (client.field674 && field1181 != null && field1181.length() > 0) {
            field1195 = 1;
        } else {
            field1195 = 0;
        }
    }

    @ObfuscatedName("o.p(I)V")
    public static void method153() {
        field1181 = field1181.trim();
        if (field1181.length() == 0) {
            method3714(class225.field3006, class225.field3007, class225.field3008);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2957("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class300 var4 = new class300(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field3699, var4.field3702, 1000 - var4.field3702);
                if (var5 == -1) {
                    var4.field3702 = 0;
                    long var8 = var4.method4996();
                    var6 = var8;
                    break;
                }
                var4.field3702 += var5;
                if (var4.field3702 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var65) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1181;
            Random var15 = new Random();
            class300 var16 = new class300(128);
            class300 var17 = new class300(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method5065(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method4977(var15.nextInt());
            }
            var16.method4977(var18[0]);
            var16.method4977(var18[1]);
            var16.method4979(var6);
            var16.method4979(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method4977(var15.nextInt());
            }
            var16.method5012(class81.field1120, class81.field1121);
            var17.method5065(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method4977(var15.nextInt());
            }
            var17.method4979(var15.nextLong());
            var17.method4978(var15.nextLong());
            if (client.field676 == null) {
                byte[] var22 = new byte[24];
                try {
                    class168.field2028.method5953(0L);
                    class168.field2028.method5962(var22);
                    int var23;
                    for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                    }
                    if (var23 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var64) {
                    for (int var25 = 0; var25 < 24; var25++) {
                        var22[var25] = -1;
                    }
                }
                var17.method4984(var22, 0, var22.length);
            } else {
                var17.method4984(client.field676, 0, client.field676.length);
            }
            var17.method4979(var15.nextLong());
            var17.method5012(class81.field1120, class81.field1121);
            int var28 = class300.method4526(var14);
            if (var28 % 8 != 0) {
                var28 += 8 - var28 % 8;
            }
            class300 var29 = new class300(var28);
            var29.method4981(var14);
            var29.field3702 = var28;
            var29.method5177(var18);
            class300 var30 = new class300(var29.field3702 + var17.field3702 + var16.field3702 + 5);
            var30.method5065(2);
            var30.method5065(var16.field3702);
            var30.method4984(var16.field3699, 0, var16.field3702);
            var30.method5065(var17.field3702);
            var30.method4984(var17.field3699, 0, var17.field3702);
            var30.method4975(var29.field3702);
            var30.method4984(var29.field3699, 0, var29.field3702);
            byte[] var31 = var30.field3699;
            String var32 = Statics.method43(var31, 0, var31.length);
            String var33 = var32;
            byte var59;
            try {
                URL var34 = new URL(client.method2957("services", false) + "m=accountappeal/login.ws");
                URLConnection var35 = var34.openConnection();
                var35.setDoInput(true);
                var35.setDoOutput(true);
                var35.setConnectTimeout(5000);
                OutputStreamWriter var36 = new OutputStreamWriter(var35.getOutputStream());
                int var38 = var33.length();
                StringBuilder var39 = new StringBuilder(var38);
                for (int var40 = 0; var40 < var38; var40++) {
                    char var41 = var33.charAt(var40);
                    if (!(var41 < 'a' || var41 > 'z') || !(var41 < 'A' || var41 > 'Z') || !(var41 < '0' || var41 > '9') || var41 == '.' || var41 == '-' || var41 == '*' || var41 == '_') {
                        var39.append(var41);
                    } else if (var41 == ' ') {
                        var39.append('+');
                    } else {
                        byte var42 = class288.method2952(var41);
                        var39.append('%');
                        int var43 = var42 >> 4 & 0xF;
                        if (var43 >= 10) {
                            var39.append((char) (var43 + 55));
                        } else {
                            var39.append((char) (var43 + 48));
                        }
                        int var44 = var42 & 0xF;
                        if (var44 >= 10) {
                            var39.append((char) (var44 + 55));
                        } else {
                            var39.append((char) (var44 + 48));
                        }
                    }
                }
                String var45 = var39.toString();
                String var47 = "data2=" + var45 + "&dest=";
                int var48 = "passwordchoice.ws".length();
                StringBuilder var49 = new StringBuilder(var48);
                for (int var50 = 0; var50 < var48; var50++) {
                    char var51 = "passwordchoice.ws".charAt(var50);
                    if (!(var51 < 'a' || var51 > 'z') || !(var51 < 'A' || var51 > 'Z') || !(var51 < '0' || var51 > '9') || var51 == '.' || var51 == '-' || var51 == '*' || var51 == '_') {
                        var49.append(var51);
                    } else if (var51 == ' ') {
                        var49.append('+');
                    } else {
                        byte var52 = class288.method2952(var51);
                        var49.append('%');
                        int var53 = var52 >> 4 & 0xF;
                        if (var53 >= 10) {
                            var49.append((char) (var53 + 55));
                        } else {
                            var49.append((char) (var53 + 48));
                        }
                        int var54 = var52 & 0xF;
                        if (var54 >= 10) {
                            var49.append((char) (var54 + 55));
                        } else {
                            var49.append((char) (var54 + 48));
                        }
                    }
                }
                String var55 = var49.toString();
                var36.write(var47 + var55);
                var36.flush();
                InputStream var56 = var35.getInputStream();
                class300 var57 = new class300(new byte[1000]);
                while (true) {
                    int var58 = var56.read(var57.field3699, var57.field3702, 1000 - var57.field3702);
                    if (var58 == -1) {
                        var36.close();
                        var56.close();
                        String var60 = new String(var57.field3699);
                        if (var60.startsWith("OFFLINE")) {
                            var59 = 4;
                        } else if (var60.startsWith("WRONG")) {
                            var59 = 7;
                        } else if (var60.startsWith("RELOAD")) {
                            var59 = 3;
                        } else if (var60.startsWith("Not permitted for social network accounts.")) {
                            var59 = 6;
                        } else {
                            var57.method5010(var18);
                            while (var57.field3702 > 0 && var57.field3699[var57.field3702 - 1] == 0) {
                                var57.field3702--;
                            }
                            String var61 = new String(var57.field3699, 0, var57.field3702);
                            if (class81.method1660(var61)) {
                                class52.method3830(var61, true, false);
                                var59 = 2;
                            } else {
                                var59 = 5;
                            }
                        }
                        break;
                    }
                    var57.field3702 += var58;
                    if (var57.field3702 >= 1000) {
                        var59 = 5;
                        break;
                    }
                }
            } catch (Throwable var63) {
                var63.printStackTrace();
                var59 = 5;
            }
            var13 = var59;
        }
        switch(var13) {
            case 2:
                method3714(class225.field3009, class225.field3010, class225.field3011);
                field1173 = 6;
                break;
            case 3:
                method3714(class225.field3012, class225.field3013, class225.field3014);
                break;
            case 4:
                method3714(class225.field3015, class225.field3016, class225.field3017);
                break;
            case 5:
                method3714(class225.field2826, class225.field2790, class225.field3020);
                break;
            case 6:
                method3714(class225.field2855, class225.field3022, class225.field3023);
                break;
            case 7:
                method3714(class225.field3024, class225.field2948, class225.field3001);
        }
    }

    @ObfuscatedName("id.q(Lkn;Lkn;Lkn;I)V")
    public static void method4056(class295 arg0, class295 arg1, class295 arg2) {
        field1180 = (Statics.field1578 - 765) / 2;
        field1166 = field1180 + 202;
        Statics.field64 = field1166 + 180;
        if (field1186) {
            if (Statics.field523 == null) {
                class236 var3 = Statics.field73;
                int var4 = var3.method3765("sl_back");
                int var5 = var3.method3745(var4, "");
                class325[] var6 = Statics.method734(var3, var4, var5);
                Statics.field523 = var6;
            }
            if (Statics.field2342 == null) {
                Statics.field2342 = Statics.method208(Statics.field73, "sl_flags", "");
            }
            if (Statics.field52 == null) {
                Statics.field52 = Statics.method208(Statics.field73, "sl_arrows", "");
            }
            if (Statics.field1867 == null) {
                Statics.field1867 = Statics.method208(Statics.field73, "sl_stars", "");
            }
            if (Statics.field119 == null) {
                Statics.field119 = class326.method268(Statics.field73, "leftarrow", "");
            }
            if (Statics.field1113 == null) {
                Statics.field1113 = class326.method268(Statics.field73, "rightarrow", "");
            }
            class321.method5497(field1180, 23, 765, 480, 0);
            class321.method5447(field1180, 0, 125, 23, 12425273, 9135624);
            class321.method5447(field1180 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4855(class225.field3031, field1180 + 62, 15, 0, -1);
            if (Statics.field1867 != null) {
                Statics.field1867[1].method5515(field1180 + 140, 1);
                arg1.method4852(class225.field2932, field1180 + 152, 10, 16777215, -1);
                Statics.field1867[0].method5515(field1180 + 140, 12);
                arg1.method4852(class225.field3033, field1180 + 152, 21, 16777215, -1);
            }
            if (Statics.field52 != null) {
                int var7 = field1180 + 280;
                if (class72.field996[0] == 0 && class72.field1003[0] == 0) {
                    Statics.field52[2].method5515(var7, 4);
                } else {
                    Statics.field52[0].method5515(var7, 4);
                }
                if (class72.field996[0] == 0 && class72.field1003[0] == 1) {
                    Statics.field52[3].method5515(var7 + 15, 4);
                } else {
                    Statics.field52[1].method5515(var7 + 15, 4);
                }
                arg0.method4852(class225.field2781, var7 + 32, 17, 16777215, -1);
                int var8 = field1180 + 390;
                if (class72.field996[0] == 1 && class72.field1003[0] == 0) {
                    Statics.field52[2].method5515(var8, 4);
                } else {
                    Statics.field52[0].method5515(var8, 4);
                }
                if (class72.field996[0] == 1 && class72.field1003[0] == 1) {
                    Statics.field52[3].method5515(var8 + 15, 4);
                } else {
                    Statics.field52[1].method5515(var8 + 15, 4);
                }
                arg0.method4852(class225.field3035, var8 + 32, 17, 16777215, -1);
                int var9 = field1180 + 500;
                if (class72.field996[0] == 2 && class72.field1003[0] == 0) {
                    Statics.field52[2].method5515(var9, 4);
                } else {
                    Statics.field52[0].method5515(var9, 4);
                }
                if (class72.field996[0] == 2 && class72.field1003[0] == 1) {
                    Statics.field52[3].method5515(var9 + 15, 4);
                } else {
                    Statics.field52[1].method5515(var9 + 15, 4);
                }
                arg0.method4852(class225.field3036, var9 + 32, 17, 16777215, -1);
                int var10 = field1180 + 610;
                if (class72.field996[0] == 3 && class72.field1003[0] == 0) {
                    Statics.field52[2].method5515(var10, 4);
                } else {
                    Statics.field52[0].method5515(var10, 4);
                }
                if (class72.field996[0] == 3 && class72.field1003[0] == 1) {
                    Statics.field52[3].method5515(var10 + 15, 4);
                } else {
                    Statics.field52[1].method5515(var10 + 15, 4);
                }
                arg0.method4852(class225.field3037, var10 + 32, 17, 16777215, -1);
            }
            class321.method5497(field1180 + 708, 4, 50, 16, 0);
            arg1.method4855(class225.field2988, field1180 + 708 + 25, 16, 16777215, -1);
            field1187 = -1;
            if (Statics.field523 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class72.field1001) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class72.field1001) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class72.field1001) {
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
                int var21 = (class72.field1001 + var14 - 1) / var14;
                field1189 = var21 - var13;
                if (Statics.field119 != null && field1188 > 0) {
                    Statics.field119.method5515(8, Statics.field1904 / 2 - Statics.field119.field3864 / 2);
                }
                if (Statics.field1113 != null && field1188 < field1189) {
                    Statics.field1113.method5515(Statics.field1578 - Statics.field1113.field3863 - 8, Statics.field1904 / 2 - Statics.field1113.field3864 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field1180 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field1188;
                for (int var27 = var14 * var26; var27 < class72.field1001 && var26 - field1188 < var13; var27++) {
                    class72 var28 = Statics.field1000[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field1007);
                    if (var28.field1007 == -1) {
                        var30 = class225.field3038;
                        var29 = false;
                    } else if (var28.field1007 > 1980) {
                        var30 = class225.field3018;
                        var29 = false;
                    }
                    int var31 = 0;
                    byte var32;
                    if (var28.method1614()) {
                        if (var28.method1592()) {
                            var32 = 7;
                        } else {
                            var32 = 6;
                        }
                    } else if (var28.method1594()) {
                        var31 = 16711680;
                        if (var28.method1592()) {
                            var32 = 5;
                        } else {
                            var32 = 4;
                        }
                    } else if (var28.method1627()) {
                        if (var28.method1592()) {
                            var32 = 3;
                        } else {
                            var32 = 2;
                        }
                    } else if (var28.method1592()) {
                        var32 = 1;
                    } else {
                        var32 = 0;
                    }
                    if (class55.field466 >= var23 && class55.field467 >= var22 && class55.field466 < var11 + var23 && class55.field467 < var12 + var22 && var29) {
                        field1187 = var27;
                        Statics.field523[var32].method5558(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field523[var32].method5548(var23, var22);
                    }
                    if (Statics.field2342 != null) {
                        Statics.field2342[(var28.method1592() ? 8 : 0) + var28.field1010].method5515(var23 + 29, var22);
                    }
                    arg0.method4855(Integer.toString(var28.field1002), var23 + 15, var12 / 2 + var22 + 5, var31, -1);
                    arg1.method4855(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
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
                    int var33 = arg1.method4847(Statics.field1000[field1187].field1009) + 6;
                    int var34 = arg1.field3670 + 8;
                    int var35 = class55.field467 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class55.field467 - 25 - var34;
                    }
                    class321.method5497(class55.field466 - var33 / 2, var35, var33, var34, 16777120);
                    class321.method5450(class55.field466 - var33 / 2, var35, var33, var34, 0);
                    arg1.method4855(Statics.field1000[field1187].field1009, class55.field466, arg1.field3670 + var35 + 4, 0, -1);
                }
            }
            Statics.field349.method768(0, 0);
            return;
        }
        Statics.field261.method5548(field1180, 0);
        Statics.field413.method5548(field1180 + 382, 0);
        Statics.field3656.method5515(field1180 + 382 - Statics.field3656.field3863 / 2, 18);
        if (client.field642 == 0 || client.field642 == 5) {
            byte var36 = 20;
            arg0.method4855(class225.field2953, field1166 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class321.method5450(field1166 + 180 - 152, var37, 304, 34, 9179409);
            class321.method5450(field1166 + 180 - 151, var37 + 1, 302, 32, 0);
            class321.method5497(field1166 + 180 - 150, var37 + 2, field1167 * 3, 30, 9179409);
            class321.method5497(field1167 * 3 + (field1166 + 180 - 150), var37 + 2, 300 - field1167 * 3, 30, 0);
            arg0.method4855(field1162, field1166 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field642 == 20) {
            Statics.field267.method5515(field1166 + 180 - Statics.field267.field3863 / 2, 271 - Statics.field267.field3864 / 2);
            short var38 = 201;
            arg0.method4855(field1191, field1166 + 180, var38, 16776960, 0);
            int var157 = var38 + 15;
            arg0.method4855(field1176, field1166 + 180, var157, 16776960, 0);
            int var158 = var157 + 15;
            arg0.method4855(field1170, field1166 + 180, var158, 16776960, 0);
            int var159 = var158 + 15;
            int var160 = var159 + 7;
            if (field1173 != 4) {
                arg0.method4852(class225.field2739, field1166 + 180 - 110, var160, 16777215, 0);
                short var39 = 200;
                String var46;
                if (Statics.field3112.field1041) {
                    String var40 = field1181;
                    int var41 = var40.length();
                    char[] var42 = new char[var41];
                    for (int var43 = 0; var43 < var41; var43++) {
                        var42[var43] = '*';
                    }
                    String var44 = new String(var42);
                    var46 = var44;
                } else {
                    var46 = field1181;
                }
                String var48;
                for (var48 = var46; arg0.method4847(var48) > var39; var48 = var48.substring(0, var48.length() - 1)) {
                }
                arg0.method4852(class296.method4851(var48), field1166 + 180 - 70, var160, 16777215, 0);
                var157 = var160 + 15;
                String var50 = class225.field2938;
                String var51 = field1179;
                int var52 = var51.length();
                char[] var53 = new char[var52];
                for (int var54 = 0; var54 < var52; var54++) {
                    var53[var54] = '*';
                }
                String var55 = new String(var53);
                arg0.method4852(var50 + var55, field1166 + 180 - 108, var157, 16777215, 0);
                var157 += 15;
            }
        }
        if (client.field642 == 10 || client.field642 == 11) {
            Statics.field267.method5515(field1166, 171);
            if (field1173 == 0) {
                short var57 = 251;
                arg0.method4855(class225.field2984, field1166 + 180, var57, 16776960, 0);
                int var161 = var57 + 30;
                int var58 = field1166 + 180 - 80;
                short var59 = 291;
                Statics.field3852.method5515(var58 - 73, var59 - 20);
                arg0.method4856(class225.field2985, var58 - 73, var59 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var60 = field1166 + 180 + 80;
                Statics.field3852.method5515(var60 - 73, var59 - 20);
                arg0.method4856(class225.field2853, var60 - 73, var59 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1173 == 1) {
                arg0.method4855(field1174, field1166 + 180, 201, 16776960, 0);
                short var61 = 236;
                arg0.method4855(field1191, field1166 + 180, var61, 16777215, 0);
                int var162 = var61 + 15;
                arg0.method4855(field1176, field1166 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method4855(field1170, field1166 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                int var62 = field1166 + 180 - 80;
                short var63 = 321;
                Statics.field3852.method5515(var62 - 73, var63 - 20);
                arg0.method4855(class225.field2745, var62, var63 + 5, 16777215, 0);
                int var64 = field1166 + 180 + 80;
                Statics.field3852.method5515(var64 - 73, var63 - 20);
                arg0.method4855(class225.field2988, var64, var63 + 5, 16777215, 0);
            } else if (field1173 == 2) {
                short var65 = 201;
                arg0.method4855(field1191, Statics.field64, var65, 16776960, 0);
                int var165 = var65 + 15;
                arg0.method4855(field1176, Statics.field64, var165, 16776960, 0);
                int var166 = var165 + 15;
                arg0.method4855(field1170, Statics.field64, var166, 16776960, 0);
                int var167 = var166 + 15;
                int var168 = var167 + 7;
                arg0.method4852(class225.field2739, Statics.field64 - 110, var168, 16777215, 0);
                short var66 = 200;
                String var73;
                if (Statics.field3112.field1041) {
                    String var67 = field1181;
                    int var68 = var67.length();
                    char[] var69 = new char[var68];
                    for (int var70 = 0; var70 < var68; var70++) {
                        var69[var70] = '*';
                    }
                    String var71 = new String(var69);
                    var73 = var71;
                } else {
                    var73 = field1181;
                }
                String var75;
                for (var75 = var73; arg0.method4847(var75) > var66; var75 = var75.substring(1)) {
                }
                arg0.method4852(class296.method4851(var75) + (field1195 == 0 & client.field645 % 40 < 20 ? class82.method1631(16776960) + class82.field1130 : ""), Statics.field64 - 70, var168, 16777215, 0);
                var165 = var168 + 15;
                String var77 = class225.field2938;
                String var78 = field1179;
                int var79 = var78.length();
                char[] var80 = new char[var79];
                for (int var81 = 0; var81 < var79; var81++) {
                    var80[var81] = '*';
                }
                String var82 = new String(var80);
                arg0.method4852(var77 + var82 + (field1195 == 1 & client.field645 % 40 < 20 ? class82.method1631(16776960) + class82.field1130 : ""), Statics.field64 - 108, var165, 16777215, 0);
                var165 += 15;
                short var84 = 277;
                int var85 = Statics.field64 + -117;
                class324 var86 = method3255(client.field674, field1177);
                var86.method5515(var85, var84);
                int var87 = var86.field3863 + 5 + var85;
                arg1.method4852(class225.field2909, var87, var84 + 13, 16776960, 0);
                int var88 = Statics.field64 + 24;
                class324 var89 = method3255(Statics.field3112.field1041, field1193);
                var89.method5515(var88, var84);
                int var90 = var89.field3863 + 5 + var88;
                arg1.method4852(class225.field3034, var90, var84 + 13, 16776960, 0);
                int var169 = var84 + 15;
                int var91 = Statics.field64 - 80;
                short var92 = 321;
                Statics.field3852.method5515(var91 - 73, var92 - 20);
                arg0.method4855(class225.field2881, var91, var92 + 5, 16777215, 0);
                int var93 = Statics.field64 + 80;
                Statics.field3852.method5515(var93 - 73, var92 - 20);
                arg0.method4855(class225.field2988, var93, var92 + 5, 16777215, 0);
                short var94 = 357;
                switch(field1172) {
                    case 2:
                        Statics.field19 = class225.field2822;
                        break;
                    default:
                        Statics.field19 = class225.field3000;
                }
                Statics.field1033 = new class319(Statics.field64, var94, arg1.method4847(Statics.field19), 11);
                Statics.field1989 = new class319(Statics.field64, var94, arg1.method4847(class225.field2950), 11);
                arg1.method4855(Statics.field19, Statics.field64, var94, 16777215, 0);
            } else if (field1173 == 3) {
                short var95 = 201;
                arg0.method4855(class225.field2991, field1166 + 180, var95, 16776960, 0);
                int var170 = var95 + 20;
                arg1.method4855(class225.field2992, field1166 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg1.method4855(class225.field2993, field1166 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var96 = field1166 + 180;
                short var97 = 276;
                Statics.field3852.method5515(var96 - 73, var97 - 20);
                arg2.method4855(class225.field2779, var96, var97 + 5, 16777215, 0);
                int var98 = field1166 + 180;
                short var99 = 326;
                Statics.field3852.method5515(var98 - 73, var99 - 20);
                arg2.method4855(class225.field3025, var98, var99 + 5, 16777215, 0);
            } else if (field1173 == 4) {
                arg0.method4855(class225.field2863, field1166 + 180, 201, 16776960, 0);
                short var100 = 236;
                arg0.method4855(field1191, field1166 + 180, var100, 16777215, 0);
                int var173 = var100 + 15;
                arg0.method4855(field1176, field1166 + 180, var173, 16777215, 0);
                int var174 = var173 + 15;
                arg0.method4855(field1170, field1166 + 180, var174, 16777215, 0);
                int var175 = var174 + 15;
                String var102 = class225.field2983;
                String var103 = Statics.field3897;
                int var104 = var103.length();
                char[] var105 = new char[var104];
                for (int var106 = 0; var106 < var104; var106++) {
                    var105[var106] = '*';
                }
                String var107 = new String(var105);
                arg0.method4852(var102 + var107 + (client.field645 % 40 < 20 ? class82.method1631(16776960) + class82.field1130 : ""), field1166 + 180 - 108, var175, 16777215, 0);
                var173 = var175 - 8;
                arg0.method4852(class225.field2748, field1166 + 180 - 9, var173, 16776960, 0);
                var173 += 15;
                arg0.method4852(class225.field2749, field1166 + 180 - 9, var173, 16776960, 0);
                int var109 = field1166 + 180 - 9 + arg0.method4847(class225.field2749) + 15;
                int var110 = var173 - arg0.field3670;
                class324 var111;
                if (field1184) {
                    var111 = Statics.field351;
                } else {
                    var111 = Statics.field2373;
                }
                var111.method5515(var109, var110);
                var173 += 15;
                int var112 = field1166 + 180 - 80;
                short var113 = 321;
                Statics.field3852.method5515(var112 - 73, var113 - 20);
                arg0.method4855(class225.field2745, var112, var113 + 5, 16777215, 0);
                int var114 = field1166 + 180 + 80;
                Statics.field3852.method5515(var114 - 73, var113 - 20);
                arg0.method4855(class225.field2988, var114, var113 + 5, 16777215, 0);
                arg1.method4855(class225.field2971, field1166 + 180, var113 + 36, 255, 0);
            } else if (field1173 == 5) {
                arg0.method4855(class225.field2996, field1166 + 180, 201, 16776960, 0);
                short var115 = 221;
                arg2.method4855(field1191, field1166 + 180, var115, 16776960, 0);
                int var176 = var115 + 15;
                arg2.method4855(field1176, field1166 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                arg2.method4855(field1170, field1166 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                int var179 = var178 + 14;
                arg0.method4852(class225.field2997, field1166 + 180 - 145, var179, 16777215, 0);
                short var116 = 174;
                String var123;
                if (Statics.field3112.field1041) {
                    String var117 = field1181;
                    int var118 = var117.length();
                    char[] var119 = new char[var118];
                    for (int var120 = 0; var120 < var118; var120++) {
                        var119[var120] = '*';
                    }
                    String var121 = new String(var119);
                    var123 = var121;
                } else {
                    var123 = field1181;
                }
                String var125;
                for (var125 = var123; arg0.method4847(var125) > var116; var125 = var125.substring(1)) {
                }
                arg0.method4852(class296.method4851(var125) + (client.field645 % 40 < 20 ? class82.method1631(16776960) + class82.field1130 : ""), field1166 + 180 - 34, var179, 16777215, 0);
                var176 = var179 + 15;
                int var126 = field1166 + 180 - 80;
                short var127 = 321;
                Statics.field3852.method5515(var126 - 73, var127 - 20);
                arg0.method4855(class225.field2864, var126, var127 + 5, 16777215, 0);
                int var128 = field1166 + 180 + 80;
                Statics.field3852.method5515(var128 - 73, var127 - 20);
                arg0.method4855(class225.field2999, var128, var127 + 5, 16777215, 0);
                short var129 = 356;
                arg1.method4855(class225.field2950, Statics.field64, var129, 268435455, 0);
            } else if (field1173 == 6) {
                short var130 = 201;
                arg0.method4855(field1191, field1166 + 180, var130, 16776960, 0);
                int var180 = var130 + 15;
                arg0.method4855(field1176, field1166 + 180, var180, 16776960, 0);
                int var181 = var180 + 15;
                arg0.method4855(field1170, field1166 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                int var131 = field1166 + 180;
                short var132 = 321;
                Statics.field3852.method5515(var131 - 73, var132 - 20);
                arg0.method4855(class225.field2999, var131, var132 + 5, 16777215, 0);
            } else if (field1173 == 7) {
                short var133 = 216;
                arg0.method4855(class225.field3027, field1166 + 180, var133, 16776960, 0);
                int var183 = var133 + 15;
                arg2.method4855(class225.field3028, field1166 + 180, var183, 16776960, 0);
                int var184 = var183 + 15;
                arg2.method4855(class225.field3029, field1166 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                int var134 = field1166 + 180 - 80;
                short var135 = 321;
                Statics.field3852.method5515(var134 - 73, var135 - 20);
                arg0.method4855(class225.field3030, var134, var135 + 5, 16777215, 0);
                int var136 = field1166 + 180 + 80;
                Statics.field3852.method5515(var136 - 73, var135 - 20);
                arg0.method4855(class225.field2999, var136, var135 + 5, 16777215, 0);
            } else if (field1173 == 8) {
                short var137 = 216;
                arg0.method4855(class225.field2877, field1166 + 180, var137, 16776960, 0);
                int var186 = var137 + 15;
                arg2.method4855(class225.field2986, field1166 + 180, var186, 16776960, 0);
                int var187 = var186 + 15;
                arg2.method4855(class225.field2879, field1166 + 180, var187, 16776960, 0);
                int var188 = var187 + 15;
                int var138 = field1166 + 180 - 80;
                short var139 = 321;
                Statics.field3852.method5515(var138 - 73, var139 - 20);
                arg0.method4855(class225.field2923, var138, var139 + 5, 16777215, 0);
                int var140 = field1166 + 180 + 80;
                Statics.field3852.method5515(var140 - 73, var139 - 20);
                arg0.method4855(class225.field2999, var140, var139 + 5, 16777215, 0);
            } else if (field1173 == 12) {
                short var141 = 201;
                String var142 = "";
                String var143 = "";
                String var144 = "";
                switch(field1175) {
                    case 0:
                        var142 = class225.field2808;
                        var143 = class225.field2794;
                        var144 = class225.field2795;
                        break;
                    case 1:
                        var142 = class225.field2969;
                        var143 = class225.field2784;
                        var144 = class225.field3032;
                        break;
                    default:
                        method2778(false);
                }
                arg0.method4855(var142, field1166 + 180, var141, 16776960, 0);
                int var189 = var141 + 15;
                arg2.method4855(var143, field1166 + 180, var189, 16776960, 0);
                int var190 = var189 + 15;
                arg2.method4855(var144, field1166 + 180, var190, 16776960, 0);
                int var191 = var190 + 15;
                int var145 = field1166 + 180;
                short var146 = 276;
                Statics.field3852.method5515(var145 - 73, var146 - 20);
                arg0.method4855(class225.field2777, var145, var146 + 5, 16777215, 0);
                int var147 = field1166 + 180;
                short var148 = 326;
                Statics.field3852.method5515(var147 - 73, var148 - 20);
                arg0.method4855(class225.field2999, var147, var148 + 5, 16777215, 0);
            } else if (field1173 == 24) {
                short var149 = 221;
                arg0.method4855(field1191, field1166 + 180, var149, 16777215, 0);
                int var192 = var149 + 15;
                arg0.method4855(field1176, field1166 + 180, var192, 16777215, 0);
                int var193 = var192 + 15;
                arg0.method4855(field1170, field1166 + 180, var193, 16777215, 0);
                int var194 = var193 + 15;
                int var150 = field1166 + 180;
                short var151 = 301;
                Statics.field3852.method5515(var150 - 73, var151 - 20);
                arg0.method4855(class225.field2850, var150, var151 + 5, 16777215, 0);
            }
        }
        if (client.field642 >= 10) {
            int[] var152 = new int[4];
            class321.method5440(var152);
            class321.method5502(field1180, 0, field1180 + 765, Statics.field1904);
            Statics.field3776.method1637(field1180 - 22, client.field645);
            Statics.field3776.method1637(field1180 + 765 + 22 - 128, client.field645);
            class321.method5457(var152);
        }
        Statics.field1963[Statics.field3112.field1038 ? 1 : 0].method5515(field1180 + 765 - 40, 463);
        if (client.field642 <= 5 || Statics.field112 != class191.field2338) {
            return;
        }
        if (Statics.field1768 == null) {
            Statics.field1768 = class326.method268(Statics.field73, "sl_button", "");
            return;
        }
        int var153 = field1180 + 5;
        short var154 = 463;
        byte var155 = 100;
        byte var156 = 35;
        Statics.field1768.method5515(var153, var154);
        arg0.method4855(class225.field2908 + " " + client.field856, var155 / 2 + var153, var156 / 2 + var154 - 2, 16777215, 0);
        if (Statics.field415 == null) {
            arg1.method4855(class225.field3041, var155 / 2 + var153, var156 / 2 + var154 + 12, 16777215, 0);
        } else {
            arg1.method4855(class225.field2811, var155 / 2 + var153, var156 / 2 + var154 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("hj.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3714(String arg0, String arg1, String arg2) {
        field1191 = arg0;
        field1176 = arg1;
        field1170 = arg2;
    }

    @ObfuscatedName("r.y(Lbo;I)V")
    public static void method44(class72 arg0) {
        if (arg0.method1592() != client.field638) {
            client.field638 = arg0.method1592();
            class255.method12(arg0.method1592());
        }
        Statics.field1979 = arg0.field1004;
        client.field856 = arg0.field1002;
        client.field636 = arg0.field1006;
        Statics.field3327 = client.field791 == 0 ? 43594 : arg0.field1002 + 40000;
        Statics.field3753 = client.field791 == 0 ? 443 : arg0.field1002 + 50000;
        Statics.field1117 = Statics.field3327;
    }

    @ObfuscatedName("hb.i(I)V")
    public static void method3598() {
        field1186 = false;
        Statics.field261.method5548(field1180, 0);
        Statics.field413.method5548(field1180 + 382, 0);
        Statics.field3656.method5515(field1180 + 382 - Statics.field3656.field3863 / 2, 18);
    }

    @ObfuscatedName("u.c(I)V")
    public static void method39() {
        field1173 = 24;
        method3714(class225.field2883, class225.field2976, class225.field2761);
    }
}
