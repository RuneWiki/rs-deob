package deob;

import java.text.DecimalFormat;

@ObfuscatedName("co")
public class class80 {

    @ObfuscatedName("co.h")
    public static int field1122 = 0;

    @ObfuscatedName("co.o")
    public static int field1157 = field1122 + 202;

    @ObfuscatedName("co.p")
    public static int[] field1150 = new int[256];

    @ObfuscatedName("co.y")
    public static int field1132 = 0;

    @ObfuscatedName("co.av")
    public static int field1131 = 0;

    @ObfuscatedName("co.aa")
    public static int field1133 = 0;

    @ObfuscatedName("co.ag")
    public static int field1134 = 0;

    @ObfuscatedName("co.aj")
    public static int field1135 = 0;

    @ObfuscatedName("co.an")
    public static int field1136 = 0;

    @ObfuscatedName("co.ap")
    public static int field1156 = 10;

    @ObfuscatedName("co.am")
    public static String field1148 = "";

    @ObfuscatedName("co.ab")
    public static int field1139 = -1;

    @ObfuscatedName("co.at")
    public static int field1140 = 1;

    @ObfuscatedName("co.ak")
    public static int field1141 = 0;

    @ObfuscatedName("co.au")
    public static String field1142 = "";

    @ObfuscatedName("co.az")
    public static String field1143 = "";

    @ObfuscatedName("co.aw")
    public static String field1144 = "";

    @ObfuscatedName("co.bv")
    public static String field1127 = "";

    @ObfuscatedName("co.bh")
    public static String field1146 = "";

    @ObfuscatedName("co.bq")
    public static String field1149 = "";

    @ObfuscatedName("co.bo")
    public static boolean field1137 = false;

    @ObfuscatedName("co.bt")
    public static boolean field1151 = false;

    @ObfuscatedName("co.be")
    public static boolean field1138 = true;

    @ObfuscatedName("co.bs")
    public static int field1152 = 0;

    @ObfuscatedName("co.bc")
    public static String field1153 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("co.bx")
    public static String field1154 = "1234567890";

    @ObfuscatedName("co.bj")
    public static boolean field1155 = false;

    @ObfuscatedName("co.bl")
    public static int field1145 = -1;

    @ObfuscatedName("co.bk")
    public static long field1121;

    @ObfuscatedName("co.cn")
    public static long field1158;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1121 = -1L;
        field1158 = -1L;
    }

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.f(Lie;Lie;I)I")
    public static int method3068(class250 arg0, class250 arg1) {
        int var2 = 0;
        if (arg0.method4289("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4289("logo", "")) {
            var2++;
        }
        if (arg1.method4289("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4289("titlebox", "")) {
            var2++;
        }
        if (arg1.method4289("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4289("runes", "")) {
            var2++;
        }
        if (arg1.method4289("title_mute", "")) {
            var2++;
        }
        if (arg1.method4289("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4289("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4289("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4289("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4289("sl_back", "");
        arg1.method4289("sl_flags", "");
        arg1.method4289("sl_arrows", "");
        arg1.method4289("sl_stars", "");
        arg1.method4289("sl_button", "");
        return var2;
    }

    @ObfuscatedName("eq.b(B)V")
    public static void method3007() {
        if (client.field648 && field1146 != null && field1146.length() > 0) {
            field1152 = 1;
        } else {
            field1152 = 0;
        }
    }

    @ObfuscatedName("by.l(Lai;I)V")
    public static void method1463(class48 arg0) {
        if (!field1155) {
            if ((class49.field426 == 1 || !Statics.field1754 && class49.field426 == 4) && class49.field443 >= field1122 + 765 - 50 && class49.field444 >= 453) {
                Statics.field1159.field991 = !Statics.field1159.field991;
                class68.method601();
                if (Statics.field1159.field991) {
                    Statics.field2522.method3925();
                    class220.field2525 = 1;
                    Statics.field3278 = null;
                } else {
                    class252 var6 = Statics.field2612;
                    int var7 = var6.method4285("scape main");
                    int var8 = var6.method4286(var7, "");
                    class220.method3559(var6, var7, var8, 255, false);
                }
            }
            if (client.field827 != 5) {
                if (field1121 == -1L) {
                    field1121 = class187.method2864() + 1000L;
                }
                long var9 = class187.method2864();
                if (client.method1724() && field1158 == -1L) {
                    field1158 = var9;
                    if (field1158 > field1121) {
                        field1121 = field1158;
                    }
                }
                field1135++;
                if (client.field827 == 10 || client.field827 == 11) {
                    if (client.field642 == 0) {
                        if (class49.field426 == 1 || !Statics.field1754 && class49.field426 == 4) {
                            int var11 = field1122 + 5;
                            short var12 = 463;
                            byte var13 = 100;
                            byte var14 = 35;
                            if (class49.field443 >= var11 && class49.field443 <= var11 + var13 && class49.field444 >= var12 && class49.field444 <= var12 + var14) {
                                if (Statics.method645()) {
                                    field1155 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field975 != null && Statics.method645()) {
                            field1155 = true;
                        }
                    }
                    int var15 = class49.field426;
                    int var16 = class49.field443;
                    int var17 = class49.field444;
                    if (var15 == 0) {
                        var16 = class49.field437;
                        var17 = class49.field439;
                    }
                    if (!Statics.field1754 && var15 == 4) {
                        var15 = 1;
                    }
                    if (field1141 == 0) {
                        boolean var18 = false;
                        while (class40.method3304()) {
                            if (Statics.field30 == 84) {
                                var18 = true;
                            }
                        }
                        int var19 = Statics.field2438 - 80;
                        short var20 = 291;
                        if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                            class46.method4235(client.method639("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var21 = Statics.field2438 + 80;
                        if (var15 == 1 && var16 >= var21 - 75 && var16 <= var21 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20 || var18) {
                            if ((client.field611 & 0x2000000) != 0) {
                                field1142 = "";
                                field1143 = class240.field3070;
                                field1144 = class240.field3125;
                                field1127 = class240.field3029;
                                field1141 = 1;
                                method3007();
                            } else if ((client.field611 & 0x4) != 0) {
                                if ((client.field611 & 0x400) == 0) {
                                    field1143 = class240.field3061;
                                    field1144 = class240.field3096;
                                    field1127 = class240.field3063;
                                } else {
                                    field1143 = class240.field2876;
                                    field1144 = class240.field2854;
                                    field1127 = class240.field3069;
                                }
                                field1142 = class240.field3060;
                                field1141 = 1;
                                method3007();
                            } else if ((client.field611 & 0x400) == 0) {
                                method2875(false);
                            } else {
                                field1143 = class240.field2878;
                                field1144 = class240.field2904;
                                field1127 = class240.field3066;
                                field1142 = class240.field3060;
                                field1141 = 1;
                                method3007();
                            }
                        }
                    } else if (field1141 == 1) {
                        while (class40.method3304()) {
                            if (Statics.field30 == 84) {
                                method2875(false);
                            } else if (Statics.field30 == 13) {
                                field1141 = 0;
                            }
                        }
                        int var22 = Statics.field2438 - 80;
                        short var23 = 321;
                        if (var15 == 1 && var16 >= var22 - 75 && var16 <= var22 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                            method2875(false);
                        }
                        int var24 = Statics.field2438 + 80;
                        if (var15 == 1 && var16 >= var24 - 75 && var16 <= var24 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                            field1141 = 0;
                        }
                    } else if (field1141 == 2) {
                        short var25 = 201;
                        int var63 = var25 + 52;
                        if (var15 == 1 && var17 >= var63 - 12 && var17 < var63 + 2) {
                            field1152 = 0;
                        }
                        var63 += 15;
                        if (var15 == 1 && var17 >= var63 - 12 && var17 < var63 + 2) {
                            field1152 = 1;
                        }
                        var63 += 15;
                        short var26 = 361;
                        if (Statics.field361 != null) {
                            int var27 = Statics.field361.field3832 / 2;
                            if (var15 == 1 && var16 >= Statics.field361.field3830 - var27 && var16 <= Statics.field361.field3830 + var27 && var17 >= var26 - 15 && var17 < var26) {
                                switch(field1140) {
                                    case 1:
                                        method1005(class240.field2953, class240.field3103, class240.field3104);
                                        field1141 = 5;
                                        return;
                                    case 2:
                                        class46.method4235("https://support.runescape.com/hc/en-gb", true, false);
                                }
                            }
                        }
                        int var28 = Statics.field2438 - 80;
                        short var29 = 321;
                        if (var15 == 1 && var16 >= var28 - 75 && var16 <= var28 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                            field1146 = field1146.trim();
                            if (field1146.length() == 0) {
                                method1005(class240.field2962, class240.field2963, class240.field2964);
                                return;
                            }
                            if (field1149.length() == 0) {
                                method1005(class240.field2965, class240.field3059, class240.field2967);
                                return;
                            }
                            method1005(class240.field2870, class240.field3076, class240.field2861);
                            client.method1013(false);
                            client.method1776(20);
                            return;
                        }
                        int var30 = field1157 + 180 + 80;
                        if (var15 == 1 && var16 >= var30 - 75 && var16 <= var30 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                            field1141 = 0;
                            field1146 = "";
                            field1149 = "";
                            Statics.field1129 = 0;
                            Statics.field2356 = "";
                            field1138 = true;
                        }
                        int var31 = Statics.field2438 + -117;
                        short var32 = 277;
                        field1137 = var16 >= var31 && var16 < Statics.field2067 + var31 && var17 >= var32 && var17 < Statics.field1254 + var32;
                        if (var15 == 1 && field1137) {
                            client.field648 = !client.field648;
                            if (!client.field648 && Statics.field1159.field992 != null) {
                                Statics.field1159.field992 = null;
                                class68.method601();
                            }
                        }
                        int var33 = Statics.field2438 + 24;
                        short var34 = 277;
                        field1151 = var16 >= var33 && var16 < Statics.field2067 + var33 && var17 >= var34 && var17 < Statics.field1254 + var34;
                        if (var15 == 1 && field1151) {
                            Statics.field1159.field993 = !Statics.field1159.field993;
                            if (!Statics.field1159.field993) {
                                field1146 = "";
                                Statics.field1159.field992 = null;
                                method3007();
                            }
                            class68.method601();
                        }
                        while (true) {
                            while (class40.method3304()) {
                                boolean var35 = false;
                                for (int var36 = 0; var36 < field1153.length(); var36++) {
                                    if (Statics.field1062 == field1153.charAt(var36)) {
                                        var35 = true;
                                        break;
                                    }
                                }
                                if (Statics.field30 == 13) {
                                    field1141 = 0;
                                    field1146 = "";
                                    field1149 = "";
                                    Statics.field1129 = 0;
                                    Statics.field2356 = "";
                                    field1138 = true;
                                } else if (field1152 == 0) {
                                    if (Statics.field30 == 85 && field1146.length() > 0) {
                                        field1146 = field1146.substring(0, field1146.length() - 1);
                                    }
                                    if (Statics.field30 == 84 || Statics.field30 == 80) {
                                        field1152 = 1;
                                    }
                                    if (var35 && field1146.length() < 320) {
                                        field1146 = field1146 + Statics.field1062;
                                    }
                                } else if (field1152 == 1) {
                                    if (Statics.field30 == 85 && field1149.length() > 0) {
                                        field1149 = field1149.substring(0, field1149.length() - 1);
                                    }
                                    if (Statics.field30 == 84 || Statics.field30 == 80) {
                                        field1152 = 0;
                                    }
                                    if (Statics.field30 == 84) {
                                        field1146 = field1146.trim();
                                        if (field1146.length() == 0) {
                                            method1005(class240.field2962, class240.field2963, class240.field2964);
                                            return;
                                        }
                                        if (field1149.length() == 0) {
                                            method1005(class240.field2965, class240.field3059, class240.field2967);
                                            return;
                                        }
                                        method1005(class240.field2870, class240.field3076, class240.field2861);
                                        client.method1013(false);
                                        client.method1776(20);
                                        return;
                                    }
                                    if (var35 && field1149.length() < 20) {
                                        field1149 = field1149 + Statics.field1062;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1141 == 3) {
                        int var37 = field1157 + 180;
                        short var38 = 276;
                        if (var15 == 1 && var16 >= var37 - 75 && var16 <= var37 + 75 && var17 >= var38 - 20 && var17 <= var38 + 20) {
                            method2875(false);
                        }
                        int var39 = field1157 + 180;
                        short var40 = 326;
                        if (var15 == 1 && var16 >= var39 - 75 && var16 <= var39 + 75 && var17 >= var40 - 20 && var17 <= var40 + 20) {
                            method1005(class240.field2953, class240.field3103, class240.field3104);
                            field1141 = 5;
                            return;
                        }
                    } else if (field1141 == 4) {
                        int var41 = field1157 + 180 - 80;
                        short var42 = 321;
                        if (var15 == 1 && var16 >= var41 - 75 && var16 <= var41 + 75 && var17 >= var42 - 20 && var17 <= var42 + 20) {
                            Statics.field2356.trim();
                            if (Statics.field2356.length() != 6) {
                                method1005(class240.field2881, class240.field2845, class240.field2883);
                                return;
                            }
                            Statics.field1129 = Integer.parseInt(Statics.field2356);
                            Statics.field2356 = "";
                            client.method1013(true);
                            method1005(class240.field2870, class240.field3076, class240.field2861);
                            client.method1776(20);
                            return;
                        }
                        if (var15 == 1 && var16 >= field1157 + 180 - 9 && var16 <= field1157 + 180 + 130 && var17 >= 263 && var17 <= 296) {
                            field1138 = !field1138;
                        }
                        if (var15 == 1 && var16 >= field1157 + 180 - 34 && var16 <= field1157 + 180 + 34 && var17 >= 351 && var17 <= 363) {
                            class46.method4235(client.method639("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var43 = field1157 + 180 + 80;
                        if (var15 == 1 && var16 >= var43 - 75 && var16 <= var43 + 75 && var17 >= var42 - 20 && var17 <= var42 + 20) {
                            field1141 = 0;
                            field1146 = "";
                            field1149 = "";
                            Statics.field1129 = 0;
                            Statics.field2356 = "";
                        }
                        while (class40.method3304()) {
                            boolean var44 = false;
                            for (int var45 = 0; var45 < field1154.length(); var45++) {
                                if (Statics.field1062 == field1154.charAt(var45)) {
                                    var44 = true;
                                    break;
                                }
                            }
                            if (Statics.field30 == 13) {
                                field1141 = 0;
                                field1146 = "";
                                field1149 = "";
                                Statics.field1129 = 0;
                                Statics.field2356 = "";
                            } else {
                                if (Statics.field30 == 85 && Statics.field2356.length() > 0) {
                                    Statics.field2356 = Statics.field2356.substring(0, Statics.field2356.length() - 1);
                                }
                                if (Statics.field30 == 84) {
                                    Statics.field2356.trim();
                                    if (Statics.field2356.length() != 6) {
                                        method1005(class240.field2881, class240.field2845, class240.field2883);
                                        return;
                                    }
                                    Statics.field1129 = Integer.parseInt(Statics.field2356);
                                    Statics.field2356 = "";
                                    client.method1013(true);
                                    method1005(class240.field2870, class240.field3076, class240.field2861);
                                    client.method1776(20);
                                    return;
                                }
                                if (var44 && Statics.field2356.length() < 6) {
                                    Statics.field2356 = Statics.field2356 + Statics.field1062;
                                }
                            }
                        }
                    } else if (field1141 == 5) {
                        int var46 = field1157 + 180 - 80;
                        short var47 = 321;
                        if (var15 == 1 && var16 >= var46 - 75 && var16 <= var46 + 75 && var17 >= var47 - 20 && var17 <= var47 + 20) {
                            method686();
                            return;
                        }
                        int var48 = field1157 + 180 + 80;
                        if (var15 == 1 && var16 >= var48 - 75 && var16 <= var48 + 75 && var17 >= var47 - 20 && var17 <= var47 + 20) {
                            method2875(true);
                        }
                        while (class40.method3304()) {
                            boolean var49 = false;
                            for (int var50 = 0; var50 < field1153.length(); var50++) {
                                if (Statics.field1062 == field1153.charAt(var50)) {
                                    var49 = true;
                                    break;
                                }
                            }
                            if (Statics.field30 == 13) {
                                method2875(true);
                            } else {
                                if (Statics.field30 == 85 && field1146.length() > 0) {
                                    field1146 = field1146.substring(0, field1146.length() - 1);
                                }
                                if (Statics.field30 == 84) {
                                    method686();
                                    return;
                                }
                                if (var49 && field1146.length() < 320) {
                                    field1146 = field1146 + Statics.field1062;
                                }
                            }
                        }
                    } else if (field1141 == 6) {
                        while (true) {
                            do {
                                if (!class40.method3304()) {
                                    short var51 = 321;
                                    if (var15 == 1 && var17 >= var51 - 20 && var17 <= var51 + 20) {
                                        method2875(true);
                                    }
                                    return;
                                }
                            } while (Statics.field30 != 84 && Statics.field30 != 13);
                            method2875(true);
                        }
                    } else if (field1141 == 7) {
                        int var52 = field1157 + 180 - 80;
                        short var53 = 321;
                        if (var15 == 1 && var16 >= var52 - 75 && var16 <= var52 + 75 && var17 >= var53 - 20 && var17 <= var53 + 20) {
                            class46.method4235(client.method639("secure", true) + "m=dob/set_dob.ws", true, false);
                            method1005(class240.field3071, class240.field2842, class240.field3101);
                            field1141 = 6;
                            return;
                        }
                        int var54 = field1157 + 180 + 80;
                        if (var15 == 1 && var16 >= var54 - 75 && var16 <= var54 + 75 && var17 >= var53 - 20 && var17 <= var53 + 20) {
                            method2875(true);
                        }
                    } else if (field1141 == 8) {
                        int var55 = field1157 + 180 - 80;
                        short var56 = 321;
                        if (var15 == 1 && var16 >= var55 - 75 && var16 <= var55 + 75 && var17 >= var56 - 20 && var17 <= var56 + 20) {
                            class46.method4235("https://www.jagex.com/terms/privacy/#eight", true, false);
                            method1005(class240.field3071, class240.field2842, class240.field3101);
                            field1141 = 6;
                            return;
                        }
                        int var57 = field1157 + 180 + 80;
                        if (var15 == 1 && var16 >= var57 - 75 && var16 <= var57 + 75 && var17 >= var56 - 20 && var17 <= var56 + 20) {
                            method2875(true);
                        }
                    } else if (field1141 == 12) {
                        String var58 = "";
                        switch(field1139) {
                            case 0:
                                var58 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                break;
                            case 1:
                                var58 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                break;
                            default:
                                method2875(false);
                        }
                        int var59 = field1157 + 180;
                        short var60 = 276;
                        if (var15 == 1 && var16 >= var59 - 75 && var16 <= var59 + 75 && var17 >= var60 - 20 && var17 <= var60 + 20) {
                            class46.method4235(var58, true, false);
                            method1005(class240.field3071, class240.field2842, class240.field3101);
                            field1141 = 6;
                            return;
                        }
                        int var61 = field1157 + 180;
                        short var62 = 326;
                        if (var15 == 1 && var16 >= var61 - 75 && var16 <= var61 + 75 && var17 >= var62 - 20 && var17 <= var62 + 20) {
                            method2875(false);
                        }
                    }
                }
            }
        } else if (class49.field426 == 1 || !Statics.field1754 && class49.field426 == 4) {
            int var1 = field1122 + 280;
            if (class49.field443 >= var1 && class49.field443 <= var1 + 14 && class49.field444 >= 4 && class49.field444 <= 18) {
                class67.method1803(0, 0);
            } else if (class49.field443 >= var1 + 15 && class49.field443 <= var1 + 80 && class49.field444 >= 4 && class49.field444 <= 18) {
                class67.method1803(0, 1);
            } else {
                int var2 = field1122 + 390;
                if (class49.field443 >= var2 && class49.field443 <= var2 + 14 && class49.field444 >= 4 && class49.field444 <= 18) {
                    class67.method1803(1, 0);
                } else if (class49.field443 >= var2 + 15 && class49.field443 <= var2 + 80 && class49.field444 >= 4 && class49.field444 <= 18) {
                    class67.method1803(1, 1);
                } else {
                    int var3 = field1122 + 500;
                    if (class49.field443 >= var3 && class49.field443 <= var3 + 14 && class49.field444 >= 4 && class49.field444 <= 18) {
                        class67.method1803(2, 0);
                    } else if (class49.field443 >= var3 + 15 && class49.field443 <= var3 + 80 && class49.field444 >= 4 && class49.field444 <= 18) {
                        class67.method1803(2, 1);
                    } else {
                        int var4 = field1122 + 610;
                        if (class49.field443 >= var4 && class49.field443 <= var4 + 14 && class49.field444 >= 4 && class49.field444 <= 18) {
                            class67.method1803(3, 0);
                        } else if (class49.field443 >= var4 + 15 && class49.field443 <= var4 + 80 && class49.field444 >= 4 && class49.field444 <= 18) {
                            class67.method1803(3, 1);
                        } else if (class49.field443 >= field1122 + 708 && class49.field444 >= 4 && class49.field443 <= field1122 + 708 + 50 && class49.field444 <= 20) {
                            field1155 = false;
                            Statics.field1124.method5458(field1122, 0);
                            Statics.field2296.method5458(field1122 + 382, 0);
                            Statics.field364.method5435(field1122 + 382 - Statics.field364.field3864 / 2, 18);
                        } else if (field1145 != -1) {
                            class67 var5 = Statics.field973[field1145];
                            method1764(var5);
                            field1155 = false;
                            Statics.field1124.method5458(field1122, 0);
                            Statics.field2296.method5458(field1122 + 382, 0);
                            Statics.field364.method5435(field1122 + 382 - Statics.field364.field3864 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.w(ZB)V")
    public static void method2875(boolean arg0) {
        field1143 = class240.field3058;
        field1144 = class240.field3080;
        field1127 = class240.field2933;
        field1141 = 2;
        if (arg0) {
            field1149 = "";
        }
        if (field1146 == null || field1146.length() <= 0) {
            if (Statics.field1159.field992 == null) {
                client.field648 = false;
            } else {
                field1146 = Statics.field1159.field992;
                client.field648 = true;
            }
        }
        method3007();
    }

    @ObfuscatedName("at.d(I)V")
    public static void method686() {
        field1146 = field1146.trim();
        if (field1146.length() == 0) {
            method1005(class240.field2953, class240.field3103, class240.field3104);
            return;
        }
        long var0 = class75.method4784();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class75.method3221(var0, field1146);
        }
        switch(var2) {
            case 2:
                method1005(class240.field3105, class240.field3106, class240.field2929);
                field1141 = 6;
                break;
            case 3:
                method1005(class240.field3108, class240.field3109, class240.field2853);
                break;
            case 4:
                method1005(class240.field3111, class240.field3112, class240.field3113);
                break;
            case 5:
                method1005(class240.field3078, class240.field3115, class240.field2990);
                break;
            case 6:
                method1005(class240.field3117, class240.field3118, class240.field2863);
                break;
            case 7:
                method1005(class240.field3120, class240.field3084, class240.field3001);
        }
    }

    @ObfuscatedName("fp.n(Lka;Lka;Lka;ZB)V")
    public static void method3162(class301 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg3) {
            field1122 = (Statics.field2097 - 765) / 2;
            field1157 = field1122 + 202;
            Statics.field2438 = field1157 + 180;
        }
        if (field1155) {
            method4237(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1124.method5458(field1122, 0);
            Statics.field2296.method5458(field1122 + 382, 0);
            Statics.field364.method5435(field1122 + 382 - Statics.field364.field3864 / 2, 18);
        }
        if (client.field827 == 0 || client.field827 == 5) {
            byte var4 = 20;
            arg0.method5130(class240.field3056, field1157 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class320.method5352(field1157 + 180 - 152, var5, 304, 34, 9179409);
            class320.method5352(field1157 + 180 - 151, var5 + 1, 302, 32, 0);
            class320.method5348(field1157 + 180 - 150, var5 + 2, field1156 * 3, 30, 9179409);
            class320.method5348(field1156 * 3 + (field1157 + 180 - 150), var5 + 2, 300 - field1156 * 3, 30, 0);
            arg0.method5130(field1148, field1157 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field827 == 20) {
            Statics.field94.method5435(field1157 + 180 - Statics.field94.field3864 / 2, 271 - Statics.field94.field3862 / 2);
            short var6 = 201;
            arg0.method5130(field1143, field1157 + 180, var6, 16776960, 0);
            int var132 = var6 + 15;
            arg0.method5130(field1144, field1157 + 180, var132, 16776960, 0);
            int var133 = var132 + 15;
            arg0.method5130(field1127, field1157 + 180, var133, 16776960, 0);
            int var134 = var133 + 15;
            int var135 = var134 + 7;
            if (field1141 != 4) {
                arg0.method5134(class240.field3064, field1157 + 180 - 110, var135, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = Statics.method103(); arg0.method5122(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method5134(class302.method5126(var8), field1157 + 180 - 70, var135, 16777215, 0);
                var132 = var135 + 15;
                arg0.method5134(class240.field2871 + class308.method929(field1149), field1157 + 180 - 108, var132, 16777215, 0);
                var132 += 15;
            }
        }
        if (client.field827 == 10 || client.field827 == 11) {
            Statics.field94.method5435(field1157, 171);
            if (field1141 == 0) {
                short var9 = 251;
                arg0.method5130(class240.field2896, field1157 + 180, var9, 16776960, 0);
                int var136 = var9 + 30;
                int var10 = field1157 + 180 - 80;
                short var11 = 291;
                Statics.field1123.method5435(var10 - 73, var11 - 20);
                arg0.method5127(class240.field3082, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1157 + 180 + 80;
                Statics.field1123.method5435(var12 - 73, var11 - 20);
                arg0.method5127(class240.field3083, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1141 == 1) {
                arg0.method5130(field1142, field1157 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method5130(field1143, field1157 + 180, var13, 16777215, 0);
                int var137 = var13 + 15;
                arg0.method5130(field1144, field1157 + 180, var137, 16777215, 0);
                int var138 = var137 + 15;
                arg0.method5130(field1127, field1157 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                int var14 = field1157 + 180 - 80;
                short var15 = 321;
                Statics.field1123.method5435(var14 - 73, var15 - 20);
                arg0.method5130(class240.field2915, var14, var15 + 5, 16777215, 0);
                int var16 = field1157 + 180 + 80;
                Statics.field1123.method5435(var16 - 73, var15 - 20);
                arg0.method5130(class240.field3121, var16, var15 + 5, 16777215, 0);
            } else if (field1141 == 2) {
                short var17 = 201;
                arg0.method5130(field1143, Statics.field2438, var17, 16776960, 0);
                int var140 = var17 + 15;
                arg0.method5130(field1144, Statics.field2438, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg0.method5130(field1127, Statics.field2438, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var143 = var142 + 7;
                arg0.method5134(class240.field3064, Statics.field2438 - 110, var143, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = Statics.method103(); arg0.method5122(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method5134(class302.method5126(var19) + (field1152 == 0 & client.field633 % 40 < 20 ? class76.method4105(16776960) + class76.field1091 : ""), Statics.field2438 - 70, var143, 16777215, 0);
                var140 = var143 + 15;
                arg0.method5134(class240.field2871 + class308.method929(field1149) + (field1152 == 1 & client.field633 % 40 < 20 ? class76.method4105(16776960) + class76.field1091 : ""), Statics.field2438 - 108, var140, 16777215, 0);
                var140 += 15;
                short var20 = 277;
                int var21 = Statics.field2438 + -117;
                boolean var22 = client.field648;
                boolean var23 = field1137;
                class323 var24 = var22 ? (var23 ? Statics.field1970 : Statics.field485) : (var23 ? Statics.field3697 : Statics.field1126);
                var24.method5435(var21, var20);
                int var26 = var24.field3864 + 5 + var21;
                arg1.method5134(class240.field3086, var26, var20 + 13, 16776960, 0);
                int var27 = Statics.field2438 + 24;
                boolean var28 = Statics.field1159.field993;
                boolean var29 = field1151;
                class323 var30 = var28 ? (var29 ? Statics.field1970 : Statics.field485) : (var29 ? Statics.field3697 : Statics.field1126);
                var30.method5435(var27, var20);
                int var32 = var30.field3864 + 5 + var27;
                arg1.method5134(class240.field2924, var32, var20 + 13, 16776960, 0);
                int var144 = var20 + 15;
                int var33 = Statics.field2438 - 80;
                short var34 = 321;
                Statics.field1123.method5435(var33 - 73, var34 - 20);
                arg0.method5130(class240.field3091, var33, var34 + 5, 16777215, 0);
                int var35 = Statics.field2438 + 80;
                Statics.field1123.method5435(var35 - 73, var34 - 20);
                arg0.method5130(class240.field3121, var35, var34 + 5, 16777215, 0);
                short var36 = 357;
                switch(field1140) {
                    case 2:
                        Statics.field446 = class240.field3134;
                        break;
                    default:
                        Statics.field446 = class240.field3097;
                }
                Statics.field361 = new class316(Statics.field2438, var36, arg1.method5122(Statics.field446), 11);
                arg1.method5130(Statics.field446, Statics.field2438, var36, 16777215, 0);
            } else if (field1141 == 3) {
                short var37 = 201;
                arg0.method5130(class240.field2889, field1157 + 180, var37, 16776960, 0);
                int var145 = var37 + 20;
                arg1.method5130(class240.field3089, field1157 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                arg1.method5130(class240.field3090, field1157 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                int var38 = field1157 + 180;
                short var39 = 276;
                Statics.field1123.method5435(var38 - 73, var39 - 20);
                arg2.method5130(class240.field3079, var38, var39 + 5, 16777215, 0);
                int var40 = field1157 + 180;
                short var41 = 326;
                Statics.field1123.method5435(var40 - 73, var41 - 20);
                arg2.method5130(class240.field3092, var40, var41 + 5, 16777215, 0);
            } else if (field1141 == 4) {
                arg0.method5130(class240.field2995, field1157 + 180, 201, 16776960, 0);
                short var42 = 236;
                arg0.method5130(field1143, field1157 + 180, var42, 16777215, 0);
                int var148 = var42 + 15;
                arg0.method5130(field1144, field1157 + 180, var148, 16777215, 0);
                int var149 = var148 + 15;
                arg0.method5130(field1127, field1157 + 180, var149, 16777215, 0);
                int var150 = var149 + 15;
                arg0.method5134(class240.field3068 + class308.method929(Statics.field2356) + (client.field633 % 40 < 20 ? class76.method4105(16776960) + class76.field1091 : ""), field1157 + 180 - 108, var150, 16777215, 0);
                int var151 = var150 - 8;
                arg0.method5134(class240.field2851, field1157 + 180 - 9, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg0.method5134(class240.field2912, field1157 + 180 - 9, var152, 16776960, 0);
                int var43 = field1157 + 180 - 9 + arg0.method5122(class240.field2912) + 15;
                int var44 = var152 - arg0.field3756;
                class323 var45;
                if (field1138) {
                    var45 = Statics.field485;
                } else {
                    var45 = Statics.field1126;
                }
                var45.method5435(var43, var44);
                var148 = var152 + 15;
                int var46 = field1157 + 180 - 80;
                short var47 = 321;
                Statics.field1123.method5435(var46 - 73, var47 - 20);
                arg0.method5130(class240.field2915, var46, var47 + 5, 16777215, 0);
                int var48 = field1157 + 180 + 80;
                Statics.field1123.method5435(var48 - 73, var47 - 20);
                arg0.method5130(class240.field3121, var48, var47 + 5, 16777215, 0);
                arg1.method5130(class240.field2843, field1157 + 180, var47 + 36, 255, 0);
            } else if (field1141 == 5) {
                arg0.method5130(class240.field2898, field1157 + 180, 201, 16776960, 0);
                short var49 = 221;
                arg2.method5130(field1143, field1157 + 180, var49, 16776960, 0);
                int var153 = var49 + 15;
                arg2.method5130(field1144, field1157 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg2.method5130(field1127, field1157 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                int var156 = var155 + 14;
                arg0.method5134(class240.field3094, field1157 + 180 - 145, var156, 16777215, 0);
                short var50 = 174;
                String var51;
                for (var51 = Statics.method103(); arg0.method5122(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method5134(class302.method5126(var51) + (client.field633 % 40 < 20 ? class76.method4105(16776960) + class76.field1091 : ""), field1157 + 180 - 34, var156, 16777215, 0);
                var153 = var156 + 15;
                int var52 = field1157 + 180 - 80;
                short var53 = 321;
                Statics.field1123.method5435(var52 - 73, var53 - 20);
                arg0.method5130(class240.field2905, var52, var53 + 5, 16777215, 0);
                int var54 = field1157 + 180 + 80;
                Statics.field1123.method5435(var54 - 73, var53 - 20);
                arg0.method5130(class240.field3033, var54, var53 + 5, 16777215, 0);
            } else if (field1141 == 6) {
                short var55 = 201;
                arg0.method5130(field1143, field1157 + 180, var55, 16776960, 0);
                int var157 = var55 + 15;
                arg0.method5130(field1144, field1157 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                arg0.method5130(field1127, field1157 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                int var56 = field1157 + 180;
                short var57 = 321;
                Statics.field1123.method5435(var56 - 73, var57 - 20);
                arg0.method5130(class240.field3033, var56, var57 + 5, 16777215, 0);
            } else if (field1141 == 7) {
                short var58 = 216;
                arg0.method5130(class240.field3123, field1157 + 180, var58, 16776960, 0);
                int var160 = var58 + 15;
                arg2.method5130(class240.field3124, field1157 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg2.method5130(class240.field3038, field1157 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                int var59 = field1157 + 180 - 80;
                short var60 = 321;
                Statics.field1123.method5435(var59 - 73, var60 - 20);
                arg0.method5130(class240.field3126, var59, var60 + 5, 16777215, 0);
                int var61 = field1157 + 180 + 80;
                Statics.field1123.method5435(var61 - 73, var60 - 20);
                arg0.method5130(class240.field3033, var61, var60 + 5, 16777215, 0);
            } else if (field1141 == 8) {
                short var62 = 216;
                arg0.method5130(class240.field2980, field1157 + 180, var62, 16776960, 0);
                int var163 = var62 + 15;
                arg2.method5130(class240.field2950, field1157 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                arg2.method5130(class240.field2982, field1157 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                int var63 = field1157 + 180 - 80;
                short var64 = 321;
                Statics.field1123.method5435(var63 - 73, var64 - 20);
                arg0.method5130(class240.field2983, var63, var64 + 5, 16777215, 0);
                int var65 = field1157 + 180 + 80;
                Statics.field1123.method5435(var65 - 73, var64 - 20);
                arg0.method5130(class240.field3033, var65, var64 + 5, 16777215, 0);
            } else if (field1141 == 12) {
                short var66 = 201;
                String var67 = "";
                String var68 = "";
                String var69 = "";
                switch(field1139) {
                    case 0:
                        var67 = class240.field2919;
                        var68 = class240.field2918;
                        var69 = class240.field2971;
                        break;
                    case 1:
                        var67 = class240.field2935;
                        var68 = class240.field2955;
                        var69 = class240.field2937;
                        break;
                    default:
                        method2875(false);
                }
                arg0.method5130(var67, field1157 + 180, var66, 16776960, 0);
                int var166 = var66 + 15;
                arg2.method5130(var68, field1157 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg2.method5130(var69, field1157 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                int var70 = field1157 + 180;
                short var71 = 276;
                Statics.field1123.method5435(var70 - 73, var71 - 20);
                arg0.method5130(class240.field3077, var70, var71 + 5, 16777215, 0);
                int var72 = field1157 + 180;
                short var73 = 326;
                Statics.field1123.method5435(var72 - 73, var73 - 20);
                arg0.method5130(class240.field3033, var72, var73 + 5, 16777215, 0);
            }
        }
        if (field1135 > 0) {
            int var74 = field1135;
            short var75 = 256;
            field1133 += var74 * 128;
            if (field1133 > Statics.field3199.length) {
                field1133 -= Statics.field3199.length;
                int var76 = (int) (Math.random() * 12.0D);
                method3257(Statics.field3712[var76]);
            }
            int var77 = 0;
            int var78 = var74 * 128;
            int var79 = (var75 - var74) * 128;
            for (int var80 = 0; var80 < var79; var80++) {
                int var81 = Statics.field2619[var77 + var78] - Statics.field3199[field1133 + var77 & Statics.field3199.length - 1] * var74 / 6;
                if (var81 < 0) {
                    var81 = 0;
                }
                Statics.field2619[var77++] = var81;
            }
            for (int var82 = var75 - var74; var82 < var75; var82++) {
                int var83 = var82 * 128;
                for (int var84 = 0; var84 < 128; var84++) {
                    int var85 = (int) (Math.random() * 100.0D);
                    if (var85 < 50 && var84 > 10 && var84 < 118) {
                        Statics.field2619[var83 + var84] = 255;
                    } else {
                        Statics.field2619[var83 + var84] = 0;
                    }
                }
            }
            if (field1132 > 0) {
                field1132 -= var74 * 4;
            }
            if (field1131 > 0) {
                field1131 -= var74 * 4;
            }
            if (field1132 == 0 && field1131 == 0) {
                int var86 = (int) (Math.random() * (double) (2000 / var74));
                if (var86 == 0) {
                    field1132 = 1024;
                }
                if (var86 == 1) {
                    field1131 = 1024;
                }
            }
            for (int var87 = 0; var87 < var75 - var74; var87++) {
                field1150[var87] = field1150[var74 + var87];
            }
            for (int var88 = var75 - var74; var88 < var75; var88++) {
                field1150[var88] = (int) (Math.sin((double) field1136 / 14.0D) * 16.0D + Math.sin((double) field1136 / 15.0D) * 14.0D + Math.sin((double) field1136 / 16.0D) * 12.0D);
                field1136++;
            }
            field1134 += var74 * -666907593;
            int var89 = ((client.field633 & 0x1) + var74) / 2;
            if (var89 > 0) {
                for (int var90 = 0; var90 < field1134 * 1851144380; var90++) {
                    int var91 = (int) (Math.random() * 124.0D) + 2;
                    int var92 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2619[(var92 << 7) + var91] = 192;
                }
                field1134 = 0;
                int var93 = 0;
                label354: while (true) {
                    if (var93 >= var75) {
                        int var97 = 0;
                        while (true) {
                            if (var97 >= 128) {
                                break label354;
                            }
                            int var98 = 0;
                            for (int var99 = -var89; var99 < var75; var99++) {
                                int var100 = var99 * 128;
                                if (var89 + var99 < var75) {
                                    var98 += Statics.field3674[var89 * 128 + var97 + var100];
                                }
                                if (var99 - (var89 + 1) >= 0) {
                                    var98 -= Statics.field3674[var97 + var100 - (var89 + 1) * 128];
                                }
                                if (var99 >= 0) {
                                    Statics.field2619[var97 + var100] = var98 / (var89 * 2 + 1);
                                }
                            }
                            var97++;
                        }
                    }
                    int var94 = 0;
                    int var95 = var93 * 128;
                    for (int var96 = -var89; var96 < 128; var96++) {
                        if (var89 + var96 < 128) {
                            var94 += Statics.field2619[var95 + var96 + var89];
                        }
                        if (var96 - (var89 + 1) >= 0) {
                            var94 -= Statics.field2619[var95 + var96 - (var89 + 1)];
                        }
                        if (var96 >= 0) {
                            Statics.field3674[var95 + var96] = var94 / (var89 * 2 + 1);
                        }
                    }
                    var93++;
                }
            }
            field1135 = 0;
        }
        short var101 = 256;
        if (field1132 > 0) {
            for (int var102 = 0; var102 < 256; var102++) {
                if (field1132 > 768) {
                    Statics.field3698[var102] = method942(Statics.field2450[var102], Statics.field1147[var102], 1024 - field1132);
                } else if (field1132 > 256) {
                    Statics.field3698[var102] = Statics.field1147[var102];
                } else {
                    Statics.field3698[var102] = method942(Statics.field1147[var102], Statics.field2450[var102], 256 - field1132);
                }
            }
        } else if (field1131 > 0) {
            for (int var103 = 0; var103 < 256; var103++) {
                if (field1131 > 768) {
                    Statics.field3698[var103] = method942(Statics.field2450[var103], Statics.field2447[var103], 1024 - field1131);
                } else if (field1131 > 256) {
                    Statics.field3698[var103] = Statics.field2447[var103];
                } else {
                    Statics.field3698[var103] = method942(Statics.field2447[var103], Statics.field2450[var103], 256 - field1131);
                }
            }
        } else {
            for (int var104 = 0; var104 < 256; var104++) {
                Statics.field3698[var104] = Statics.field2450[var104];
            }
        }
        class320.method5408(field1122, 9, field1122 + 128, var101 + 7);
        Statics.field1124.method5458(field1122, 0);
        class320.method5386();
        int var105 = 0;
        int var106 = field1122 + Statics.field3231.field3853 * 9;
        for (int var107 = 1; var107 < var101 - 1; var107++) {
            int var108 = (var101 - var107) * field1150[var107] / var101;
            int var109 = var108 + 22;
            if (var109 < 0) {
                var109 = 0;
            }
            var105 += var109;
            for (int var110 = var109; var110 < 128; var110++) {
                int var111 = Statics.field2619[var105++];
                if (var111 == 0) {
                    var106++;
                } else {
                    int var113 = 256 - var111;
                    int var114 = Statics.field3698[var111];
                    int var115 = Statics.field3231.field3854[var106];
                    Statics.field3231.field3854[var106++] = ((var114 & 0xFF00) * var111 + (var115 & 0xFF00) * var113 & 0xFF0000) + ((var114 & 0xFF00FF) * var111 + (var115 & 0xFF00FF) * var113 & 0xFF00FF00) >> 8;
                }
            }
            var106 += Statics.field3231.field3853 + var109 - 128;
        }
        class320.method5408(field1122 + 765 - 128, 9, field1122 + 765, var101 + 7);
        Statics.field2296.method5458(field1122 + 382, 0);
        class320.method5386();
        int var116 = 0;
        int var117 = field1122 + Statics.field3231.field3853 * 9 + 24 + 637;
        for (int var118 = 1; var118 < var101 - 1; var118++) {
            int var119 = (var101 - var118) * field1150[var118] / var101;
            int var120 = 103 - var119;
            int var121 = var117 + var119;
            for (int var122 = 0; var122 < var120; var122++) {
                int var123 = Statics.field2619[var116++];
                if (var123 == 0) {
                    var121++;
                } else {
                    int var125 = 256 - var123;
                    int var126 = Statics.field3698[var123];
                    int var127 = Statics.field3231.field3854[var121];
                    Statics.field3231.field3854[var121++] = ((var126 & 0xFF00) * var123 + (var127 & 0xFF00) * var125 & 0xFF0000) + ((var126 & 0xFF00FF) * var123 + (var127 & 0xFF00FF) * var125 & 0xFF00FF00) >> 8;
                }
            }
            var116 += 128 - var120;
            var117 = Statics.field3231.field3853 - var120 - var119 + var121;
        }
        Statics.field1125[Statics.field1159.field991 ? 1 : 0].method5435(field1122 + 765 - 40, 463);
        if (client.field827 <= 5 || client.field642 != 0) {
            return;
        }
        if (Statics.field888 == null) {
            Statics.field888 = class325.method1735(Statics.field366, "sl_button", "");
            return;
        }
        int var128 = field1122 + 5;
        short var129 = 463;
        byte var130 = 100;
        byte var131 = 35;
        Statics.field888.method5435(var128, var129);
        arg0.method5130(class240.field3011 + " " + client.field610, var130 / 2 + var128, var131 / 2 + var129 - 2, 16777215, 0);
        if (Statics.field975 == null) {
            arg1.method5130(class240.field3137, var130 / 2 + var128, var131 / 2 + var129 + 12, 16777215, 0);
        } else {
            arg1.method5130(class240.field3136, var130 / 2 + var128, var131 / 2 + var129 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bd.s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1005(String arg0, String arg1, String arg2) {
        field1143 = arg0;
        field1144 = arg1;
        field1127 = arg2;
    }

    @ObfuscatedName("fl.g(Llk;I)V")
    public static final void method3257(class323 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3199.length; var2++) {
            Statics.field3199[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3199[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1128[var8] = (Statics.field3199[var8 - 1] + Statics.field3199[var8 + 1] + Statics.field3199[var8 - 128] + Statics.field3199[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3199;
            Statics.field3199 = Statics.field1128;
            Statics.field1128 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3862; var11++) {
            for (int var12 = 0; var12 < arg0.field3864; var12++) {
                if (arg0.field3866[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3869;
                    int var14 = var11 + 16 + arg0.field3865;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3199[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bh.k(IIII)I")
    public static final int method942(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ia.m(Lka;Lka;B)V")
    public static void method4237(class301 arg0, class301 arg1) {
        if (Statics.field298 == null) {
            class252 var2 = Statics.field366;
            int var3 = var2.method4285("sl_back");
            int var4 = var2.method4286(var3, "");
            class324[] var5 = class325.method2896(var2, var3, var4);
            Statics.field298 = var5;
        }
        if (Statics.field3353 == null) {
            Statics.field3353 = class325.method3236(Statics.field366, "sl_flags", "");
        }
        if (Statics.field2029 == null) {
            Statics.field2029 = class325.method3236(Statics.field366, "sl_arrows", "");
        }
        if (Statics.field135 == null) {
            Statics.field135 = class325.method3236(Statics.field366, "sl_stars", "");
        }
        class320.method5348(field1122, 23, 765, 480, 0);
        class320.method5357(field1122, 0, 125, 23, 12425273, 9135624);
        class320.method5357(field1122 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5130(class240.field3127, field1122 + 62, 15, 0, -1);
        if (Statics.field135 != null) {
            Statics.field135[1].method5435(field1122 + 140, 1);
            arg1.method5134(class240.field3128, field1122 + 152, 10, 16777215, -1);
            Statics.field135[0].method5435(field1122 + 140, 12);
            arg1.method5134(class240.field3129, field1122 + 152, 21, 16777215, -1);
        }
        if (Statics.field2029 != null) {
            int var6 = field1122 + 280;
            if (class67.field977[0] == 0 && class67.field983[0] == 0) {
                Statics.field2029[2].method5435(var6, 4);
            } else {
                Statics.field2029[0].method5435(var6, 4);
            }
            if (class67.field977[0] == 0 && class67.field983[0] == 1) {
                Statics.field2029[3].method5435(var6 + 15, 4);
            } else {
                Statics.field2029[1].method5435(var6 + 15, 4);
            }
            arg0.method5134(class240.field3130, var6 + 32, 17, 16777215, -1);
            int var7 = field1122 + 390;
            if (class67.field977[0] == 1 && class67.field983[0] == 0) {
                Statics.field2029[2].method5435(var7, 4);
            } else {
                Statics.field2029[0].method5435(var7, 4);
            }
            if (class67.field977[0] == 1 && class67.field983[0] == 1) {
                Statics.field2029[3].method5435(var7 + 15, 4);
            } else {
                Statics.field2029[1].method5435(var7 + 15, 4);
            }
            arg0.method5134(class240.field3131, var7 + 32, 17, 16777215, -1);
            int var8 = field1122 + 500;
            if (class67.field977[0] == 2 && class67.field983[0] == 0) {
                Statics.field2029[2].method5435(var8, 4);
            } else {
                Statics.field2029[0].method5435(var8, 4);
            }
            if (class67.field977[0] == 2 && class67.field983[0] == 1) {
                Statics.field2029[3].method5435(var8 + 15, 4);
            } else {
                Statics.field2029[1].method5435(var8 + 15, 4);
            }
            arg0.method5134(class240.field3132, var8 + 32, 17, 16777215, -1);
            int var9 = field1122 + 610;
            if (class67.field977[0] == 3 && class67.field983[0] == 0) {
                Statics.field2029[2].method5435(var9, 4);
            } else {
                Statics.field2029[0].method5435(var9, 4);
            }
            if (class67.field977[0] == 3 && class67.field983[0] == 1) {
                Statics.field2029[3].method5435(var9 + 15, 4);
            } else {
                Statics.field2029[1].method5435(var9 + 15, 4);
            }
            arg0.method5134(class240.field3133, var9 + 32, 17, 16777215, -1);
        }
        class320.method5348(field1122 + 708, 4, 50, 16, 0);
        arg1.method5130(class240.field3121, field1122 + 708 + 25, 16, 16777215, -1);
        field1145 = -1;
        if (Statics.field298 != null) {
            byte var10 = 88;
            byte var11 = 19;
            int var12 = 765 / (var10 + 1);
            int var13 = 480 / (var11 + 1);
            int var14;
            int var15;
            do {
                var14 = var13;
                var15 = var12;
                if ((var12 - 1) * var13 >= class67.field974) {
                    var12--;
                }
                if ((var13 - 1) * var12 >= class67.field974) {
                    var13--;
                }
                if ((var13 - 1) * var12 >= class67.field974) {
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
            int var20 = var19 + 23;
            int var21 = field1122 + var18;
            int var22 = 0;
            boolean var23 = false;
            for (int var24 = 0; var24 < class67.field974; var24++) {
                class67 var25 = Statics.field973[var24];
                boolean var26 = true;
                String var27 = Integer.toString(var25.field981);
                if (var25.field981 == -1) {
                    var27 = class240.field3057;
                    var26 = false;
                } else if (var25.field981 > 1980) {
                    var27 = class240.field2880;
                    var26 = false;
                }
                int var28 = 0;
                byte var29;
                if (var25.method1491()) {
                    if (var25.method1486()) {
                        var29 = 7;
                    } else {
                        var29 = 6;
                    }
                } else if (var25.method1490()) {
                    var28 = 16711680;
                    if (var25.method1486()) {
                        var29 = 5;
                    } else {
                        var29 = 4;
                    }
                } else if (var25.method1488()) {
                    if (var25.method1486()) {
                        var29 = 3;
                    } else {
                        var29 = 2;
                    }
                } else if (var25.method1486()) {
                    var29 = 1;
                } else {
                    var29 = 0;
                }
                if (class49.field437 >= var21 && class49.field439 >= var20 && class49.field437 < var10 + var21 && class49.field439 < var11 + var20 && var26) {
                    field1145 = var24;
                    Statics.field298[var29].method5464(var21, var20, 128, 16777215);
                    var23 = true;
                } else {
                    Statics.field298[var29].method5458(var21, var20);
                }
                if (Statics.field3353 != null) {
                    Statics.field3353[(var25.method1486() ? 8 : 0) + var25.field984].method5435(var21 + 29, var20);
                }
                arg0.method5130(Integer.toString(var25.field985), var21 + 15, var11 / 2 + var20 + 5, var28, -1);
                arg1.method5130(var27, var21 + 60, var11 / 2 + var20 + 5, 268435455, -1);
                var20 += var11 + var17;
                var22++;
                if (var22 >= var13) {
                    var20 = var19 + 23;
                    var21 += var10 + var16;
                    var22 = 0;
                }
            }
            if (var23) {
                int var30 = arg1.method5122(Statics.field973[field1145].field982) + 6;
                int var31 = arg1.field3756 + 8;
                class320.method5348(class49.field437 - var30 / 2, class49.field439 + 20 + 5, var30, var31, 16777120);
                class320.method5352(class49.field437 - var30 / 2, class49.field439 + 20 + 5, var30, var31, 0);
                arg1.method5130(Statics.field973[field1145].field982, class49.field437, class49.field439 + 20 + 5 + arg1.field3756 + 4, 0, -1);
            }
        }
        Statics.field3231.method688(0, 0);
    }

    @ObfuscatedName("co.q(Lbs;B)V")
    public static void method1764(class67 arg0) {
        if (arg0.method1486() != client.field751) {
            client.field751 = arg0.method1486();
            boolean var1 = arg0.method1486();
            if (Statics.field1231 != var1) {
                class272.method4246();
                Statics.field1231 = var1;
            }
        }
        Statics.field398 = arg0.field978;
        client.field610 = arg0.field985;
        client.field611 = arg0.field979;
        Statics.field132 = client.field612 == 0 ? 43594 : arg0.field985 + 40000;
        Statics.field604 = client.field612 == 0 ? 443 : arg0.field985 + 50000;
        Statics.field2089 = Statics.field132;
    }

    @ObfuscatedName("e.x(II)V")
    public static void method28(int arg0) {
        field1141 = 12;
        field1139 = arg0;
    }
}
