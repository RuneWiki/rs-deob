package deob;

import java.text.DecimalFormat;

@ObfuscatedName("cy")
public class class79 {

    @ObfuscatedName("cy.w")
    public static int field1083 = 0;

    @ObfuscatedName("cy.t")
    public static int field1091 = field1083 + 202;

    @ObfuscatedName("cy.a")
    public static int[] field1094 = new int[256];

    @ObfuscatedName("cy.v")
    public static int field1089 = 0;

    @ObfuscatedName("cy.af")
    public static int field1095 = 0;

    @ObfuscatedName("cy.as")
    public static int field1096 = 0;

    @ObfuscatedName("cy.an")
    public static int field1097 = 0;

    @ObfuscatedName("cy.ao")
    public static int field1098 = 0;

    @ObfuscatedName("cy.at")
    public static int field1115 = 0;

    @ObfuscatedName("cy.ai")
    public static int field1100 = 10;

    @ObfuscatedName("cy.ac")
    public static String field1101 = "";

    @ObfuscatedName("cy.ar")
    public static int field1082 = 0;

    @ObfuscatedName("cy.au")
    public static String field1099 = "";

    @ObfuscatedName("cy.av")
    public static String field1104 = "";

    @ObfuscatedName("cy.al")
    public static String field1113 = "";

    @ObfuscatedName("cy.ae")
    public static String field1106 = "";

    @ObfuscatedName("cy.az")
    public static String field1107 = "";

    @ObfuscatedName("cy.aq")
    public static String field1087 = "";

    @ObfuscatedName("cy.ad")
    public static boolean field1109 = false;

    @ObfuscatedName("cy.bp")
    public static boolean field1111 = false;

    @ObfuscatedName("cy.bi")
    public static boolean field1116 = false;

    @ObfuscatedName("cy.bq")
    public static boolean field1105 = true;

    @ObfuscatedName("cy.bh")
    public static int field1103 = 0;

    @ObfuscatedName("cy.bz")
    public static String field1114 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cy.bu")
    public static String field1086 = "1234567890";

    @ObfuscatedName("cy.bl")
    public static boolean field1108 = false;

    @ObfuscatedName("cy.bs")
    public static int field1117 = -1;

    @ObfuscatedName("cy.be")
    public static long field1110;

    @ObfuscatedName("cy.by")
    public static long field1119;

    static {
        new DecimalFormat("##0.00");
        new class149();
        field1110 = -1L;
        field1119 = -1L;
    }

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hv.z(Lir;Lir;I)I")
    public static int method4060(class248 arg0, class248 arg1) {
        int var2 = 0;
        if (arg0.method4268("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4268("logo", "")) {
            var2++;
        }
        if (arg1.method4268("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4268("titlebox", "")) {
            var2++;
        }
        if (arg1.method4268("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4268("runes", "")) {
            var2++;
        }
        if (arg1.method4268("title_mute", "")) {
            var2++;
        }
        if (arg1.method4268("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4268("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4268("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4268("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4268("sl_back", "");
        arg1.method4268("sl_flags", "");
        arg1.method4268("sl_arrows", "");
        arg1.method4268("sl_stars", "");
        arg1.method4268("sl_button", "");
        return var2;
    }

    @ObfuscatedName("b.w(I)I")
    public static int method100() {
        return 11;
    }

    @ObfuscatedName("cf.s(Lir;Lir;ZII)V")
    public static void method1861(class248 arg0, class248 arg1, boolean arg2, int arg3) {
        if (!Statics.field1102) {
            field1082 = arg3;
            class315.method5292();
            byte[] var4 = arg0.method4306("title.jpg", "");
            Statics.field1093 = Statics.method4930(var4);
            Statics.field1088 = Statics.field1093.method5400();
            if ((client.field633 & 0x20000000) == 0) {
                Statics.field1118 = class320.method4029(arg1, "logo", "");
            } else {
                Statics.field1118 = class320.method4029(arg1, "logo_deadman_mode", "");
            }
            Statics.field1084 = class320.method4029(arg1, "titlebox", "");
            Statics.field1085 = class320.method4029(arg1, "titlebutton", "");
            Statics.field1112 = class320.method114(arg1, "runes", "");
            Statics.field1709 = class320.method114(arg1, "title_mute", "");
            Statics.field2784 = class320.method4029(arg1, "options_radio_buttons,0", "");
            Statics.field1353 = class320.method4029(arg1, "options_radio_buttons,4", "");
            Statics.field1090 = class320.method4029(arg1, "options_radio_buttons,2", "");
            Statics.field473 = class320.method4029(arg1, "options_radio_buttons,6", "");
            Statics.field979 = Statics.field2784.field3781;
            Statics.field967 = Statics.field2784.field3782;
            Statics.field937 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field937[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field937[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field937[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field937[var8 + 192] = 16777215;
            }
            Statics.field2365 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2365[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2365[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2365[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2365[var12 + 192] = 16777215;
            }
            Statics.field70 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field70[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field70[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field70[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field70[var16 + 192] = 16777215;
            }
            Statics.field1078 = new int[256];
            Statics.field2368 = new int[32768];
            Statics.field1170 = new int[32768];
            method1575((class318) null);
            Statics.field358 = new int[32768];
            Statics.field1074 = new int[32768];
            if (arg2) {
                field1107 = "";
                field1087 = "";
            }
            Statics.field105 = 0;
            Statics.field239 = "";
            field1105 = true;
            field1108 = false;
            if (Statics.field62.field959) {
                class218.method408(2);
            } else {
                class218.method403(2, Statics.field1148, "scape main", "", 255, false);
            }
            class251.method4044(false);
            Statics.field1102 = true;
            field1083 = (Statics.field1180 - 765) / 2;
            field1091 = field1083 + 202;
            Statics.field1092 = field1091 + 180;
            Statics.field1093.method5409(field1083, 0);
            Statics.field1088.method5409(field1083 + 382, 0);
            Statics.field1118.method5389(field1083 + 382 - Statics.field1118.field3781 / 2, 18);
        } else if (arg3 == 4) {
            field1082 = 4;
        }
    }

    @ObfuscatedName("bz.l(I)Ljava/lang/String;")
    public static String method997() {
        return Statics.field62.field963 ? class306.method4585(field1107) : field1107;
    }

    @ObfuscatedName("bz.u(I)V")
    public static void method1000() {
        if (!Statics.field1102) {
            return;
        }
        Statics.field1084 = null;
        Statics.field1085 = null;
        Statics.field1112 = null;
        Statics.field1093 = null;
        Statics.field1088 = null;
        Statics.field1118 = null;
        Statics.field1709 = null;
        Statics.field2784 = null;
        Statics.field1090 = null;
        Statics.field2048 = null;
        Statics.field86 = null;
        Statics.field1780 = null;
        Statics.field238 = null;
        Statics.field2753 = null;
        Statics.field937 = null;
        Statics.field2365 = null;
        Statics.field70 = null;
        Statics.field1078 = null;
        Statics.field2368 = null;
        Statics.field1170 = null;
        Statics.field358 = null;
        Statics.field1074 = null;
        class218.method408(2);
        class251.method4044(true);
        Statics.field1102 = false;
    }

    @ObfuscatedName("at.q(I)V")
    public static void method527() {
        if (field1109 && field1107 != null && field1107.length() > 0) {
            field1103 = 1;
        } else {
            field1103 = 0;
        }
    }

    @ObfuscatedName("gv.i(Laj;I)V")
    public static void method3501(class48 arg0) {
        if (!field1108) {
            if ((class49.field432 == 1 || !Statics.field3230 && class49.field432 == 4) && class49.field433 >= field1083 + 765 - 50 && class49.field429 >= 453) {
                Statics.field62.field959 = !Statics.field62.field959;
                class67.method939();
                if (Statics.field62.field959) {
                    class218.method89();
                } else {
                    Statics.method3980(Statics.field1148, "scape main", "", 255, false);
                }
            }
            if (client.field590 != 5) {
                if (field1110 == -1L) {
                    field1110 = class185.method3250() + 1000L;
                }
                long var6 = class185.method3250();
                if (client.method93() && field1119 == -1L) {
                    field1119 = var6;
                    if (field1119 > field1110) {
                        field1110 = field1119;
                    }
                }
                field1098++;
                if (client.field590 == 10 || client.field590 == 11) {
                    if (client.field828 == 0) {
                        if (class49.field432 == 1 || !Statics.field3230 && class49.field432 == 4) {
                            int var8 = field1083 + 5;
                            short var9 = 463;
                            byte var10 = 100;
                            byte var11 = 35;
                            if (class49.field433 >= var8 && class49.field433 <= var8 + var10 && class49.field429 >= var9 && class49.field429 <= var9 + var11) {
                                method999();
                                return;
                            }
                        }
                        if (Statics.field440 != null) {
                            method999();
                        }
                    }
                    int var12 = class49.field432;
                    int var13 = class49.field433;
                    int var14 = class49.field429;
                    if (var12 == 0) {
                        var13 = class49.field426;
                        var14 = class49.field427 * 673804999;
                    }
                    if (!Statics.field3230 && var12 == 4) {
                        var12 = 1;
                    }
                    if (field1082 == 0) {
                        boolean var15 = false;
                        while (class40.method9()) {
                            if (Statics.field2017 == 84) {
                                var15 = true;
                            }
                        }
                        int var16 = Statics.field1092 - 80;
                        short var17 = 291;
                        if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                            class46.method4762(client.method2931("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = Statics.field1092 + 80;
                        if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                            if ((client.field633 & 0x2000000) != 0) {
                                field1099 = "";
                                field1104 = class238.field2942;
                                field1113 = class238.field3017;
                                field1106 = class238.field3018;
                                field1082 = 1;
                                method527();
                            } else if ((client.field633 & 0x4) != 0) {
                                if ((client.field633 & 0x400) == 0) {
                                    field1104 = class238.field3020;
                                    field1113 = class238.field3008;
                                    field1106 = class238.field3009;
                                } else {
                                    field1104 = class238.field2912;
                                    field1113 = class238.field3014;
                                    field1106 = class238.field2872;
                                }
                                field1099 = class238.field2790;
                                field1082 = 1;
                                method527();
                            } else if ((client.field633 & 0x400) == 0) {
                                method951(false);
                            } else {
                                field1104 = class238.field2910;
                                field1113 = class238.field2993;
                                field1106 = class238.field2917;
                                field1099 = class238.field2790;
                                field1082 = 1;
                                method527();
                            }
                        }
                    } else if (field1082 == 1) {
                        while (class40.method9()) {
                            if (Statics.field2017 == 84) {
                                method951(false);
                            } else if (Statics.field2017 == 13) {
                                field1082 = 0;
                            }
                        }
                        int var19 = Statics.field1092 - 80;
                        short var20 = 321;
                        if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                            method951(false);
                        }
                        int var21 = Statics.field1092 + 80;
                        if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                            field1082 = 0;
                        }
                    } else if (field1082 == 2) {
                        short var22 = 201;
                        int var54 = var22 + 52;
                        if (var12 == 1 && var14 >= var54 - 12 && var14 < var54 + 2) {
                            field1103 = 0;
                        }
                        var54 += 15;
                        if (var12 == 1 && var14 >= var54 - 12 && var14 < var54 + 2) {
                            field1103 = 1;
                        }
                        var54 += 15;
                        short var23 = 361;
                        if (var12 == 1 && var14 >= var23 - 15 && var14 < var23) {
                            method23(class238.field3047, class238.field3048, class238.field3049);
                            field1082 = 5;
                            return;
                        }
                        int var24 = Statics.field1092 - 80;
                        short var25 = 321;
                        if (var12 == 1 && var13 >= var24 - 75 && var13 <= var24 + 75 && var14 >= var25 - 20 && var14 <= var25 + 20) {
                            field1107 = field1107.trim();
                            if (field1107.length() == 0) {
                                method23(class238.field2908, class238.field2909, class238.field2871);
                                return;
                            }
                            if (field1087.length() == 0) {
                                method23(class238.field2796, class238.field2792, class238.field2970);
                                return;
                            }
                            method23(class238.field3021, class238.field3022, class238.field3023);
                            client.method1872(false);
                            client.method868(20);
                            return;
                        }
                        int var26 = field1091 + 180 + 80;
                        if (var12 == 1 && var13 >= var26 - 75 && var13 <= var26 + 75 && var14 >= var25 - 20 && var14 <= var25 + 20) {
                            field1082 = 0;
                            field1107 = "";
                            field1087 = "";
                            Statics.field105 = 0;
                            Statics.field239 = "";
                            field1105 = true;
                        }
                        int var27 = Statics.field1092 + -117;
                        short var28 = 277;
                        field1111 = var13 >= var27 && var13 < Statics.field979 + var27 && var14 >= var28 && var14 < Statics.field967 + var28;
                        if (var12 == 1 && field1111) {
                            field1109 = !field1109;
                            if (!field1109 && Statics.field62.field960 != null) {
                                Statics.field62.field960 = null;
                                class67.method939();
                            }
                        }
                        int var29 = Statics.field1092 + 24;
                        short var30 = 277;
                        field1116 = var13 >= var29 && var13 < Statics.field979 + var29 && var14 >= var30 && var14 < Statics.field967 + var30;
                        if (var12 == 1 && field1116) {
                            Statics.field62.field963 = !Statics.field62.field963;
                            if (!Statics.field62.field963) {
                                field1107 = "";
                                Statics.field62.field960 = null;
                                method527();
                            }
                            class67.method939();
                        }
                        while (true) {
                            while (class40.method9()) {
                                boolean var31 = false;
                                for (int var32 = 0; var32 < field1114.length(); var32++) {
                                    if (Statics.field343 == field1114.charAt(var32)) {
                                        var31 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2017 == 13) {
                                    field1082 = 0;
                                    field1107 = "";
                                    field1087 = "";
                                    Statics.field105 = 0;
                                    Statics.field239 = "";
                                    field1105 = true;
                                } else if (field1103 == 0) {
                                    if (Statics.field2017 == 85 && field1107.length() > 0) {
                                        field1107 = field1107.substring(0, field1107.length() - 1);
                                    }
                                    if (Statics.field2017 == 84 || Statics.field2017 == 80) {
                                        field1103 = 1;
                                    }
                                    if (var31 && field1107.length() < 320) {
                                        field1107 = field1107 + Statics.field343;
                                    }
                                } else if (field1103 == 1) {
                                    if (Statics.field2017 == 85 && field1087.length() > 0) {
                                        field1087 = field1087.substring(0, field1087.length() - 1);
                                    }
                                    if (Statics.field2017 == 84 || Statics.field2017 == 80) {
                                        field1103 = 0;
                                    }
                                    if (Statics.field2017 == 84) {
                                        field1107 = field1107.trim();
                                        if (field1107.length() == 0) {
                                            method23(class238.field2908, class238.field2909, class238.field2871);
                                            return;
                                        }
                                        if (field1087.length() == 0) {
                                            method23(class238.field2796, class238.field2792, class238.field2970);
                                            return;
                                        }
                                        method23(class238.field3021, class238.field3022, class238.field3023);
                                        client.method1872(false);
                                        client.method868(20);
                                        return;
                                    }
                                    if (var31 && field1087.length() < 20) {
                                        field1087 = field1087 + Statics.field343;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1082 == 3) {
                        int var33 = field1091 + 180;
                        short var34 = 276;
                        if (var12 == 1 && var13 >= var33 - 75 && var13 <= var33 + 75 && var14 >= var34 - 20 && var14 <= var34 + 20) {
                            method951(false);
                        }
                        int var35 = field1091 + 180;
                        short var36 = 326;
                        if (var12 == 1 && var13 >= var35 - 75 && var13 <= var35 + 75 && var14 >= var36 - 20 && var14 <= var36 + 20) {
                            method23(class238.field3047, class238.field3048, class238.field3049);
                            field1082 = 5;
                            return;
                        }
                    } else if (field1082 == 4) {
                        int var37 = field1091 + 180 - 80;
                        short var38 = 321;
                        if (var12 == 1 && var13 >= var37 - 75 && var13 <= var37 + 75 && var14 >= var38 - 20 && var14 <= var38 + 20) {
                            Statics.field239.trim();
                            if (Statics.field239.length() != 6) {
                                method23(class238.field3006, class238.field2828, class238.field3059);
                                return;
                            }
                            Statics.field105 = Integer.parseInt(Statics.field239);
                            Statics.field239 = "";
                            client.method1872(true);
                            method23(class238.field3021, class238.field3022, class238.field3023);
                            client.method868(20);
                            return;
                        }
                        if (var12 == 1 && var13 >= field1091 + 180 - 9 && var13 <= field1091 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                            field1105 = !field1105;
                        }
                        if (var12 == 1 && var13 >= field1091 + 180 - 34 && var13 <= field1091 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                            class46.method4762(client.method2931("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var39 = field1091 + 180 + 80;
                        if (var12 == 1 && var13 >= var39 - 75 && var13 <= var39 + 75 && var14 >= var38 - 20 && var14 <= var38 + 20) {
                            field1082 = 0;
                            field1107 = "";
                            field1087 = "";
                            Statics.field105 = 0;
                            Statics.field239 = "";
                        }
                        while (class40.method9()) {
                            boolean var40 = false;
                            for (int var41 = 0; var41 < field1086.length(); var41++) {
                                if (Statics.field343 == field1086.charAt(var41)) {
                                    var40 = true;
                                    break;
                                }
                            }
                            if (Statics.field2017 == 13) {
                                field1082 = 0;
                                field1107 = "";
                                field1087 = "";
                                Statics.field105 = 0;
                                Statics.field239 = "";
                            } else {
                                if (Statics.field2017 == 85 && Statics.field239.length() > 0) {
                                    Statics.field239 = Statics.field239.substring(0, Statics.field239.length() - 1);
                                }
                                if (Statics.field2017 == 84) {
                                    Statics.field239.trim();
                                    if (Statics.field239.length() != 6) {
                                        method23(class238.field3006, class238.field2828, class238.field3059);
                                        return;
                                    }
                                    Statics.field105 = Integer.parseInt(Statics.field239);
                                    Statics.field239 = "";
                                    client.method1872(true);
                                    method23(class238.field3021, class238.field3022, class238.field3023);
                                    client.method868(20);
                                    return;
                                }
                                if (var40 && Statics.field239.length() < 6) {
                                    Statics.field239 = Statics.field239 + Statics.field343;
                                }
                            }
                        }
                    } else if (field1082 == 5) {
                        int var42 = field1091 + 180 - 80;
                        short var43 = 321;
                        if (var12 == 1 && var13 >= var42 - 75 && var13 <= var42 + 75 && var14 >= var43 - 20 && var14 <= var43 + 20) {
                            Statics.method4221();
                            return;
                        }
                        int var44 = field1091 + 180 + 80;
                        if (var12 == 1 && var13 >= var44 - 75 && var13 <= var44 + 75 && var14 >= var43 - 20 && var14 <= var43 + 20) {
                            method951(true);
                        }
                        while (class40.method9()) {
                            boolean var45 = false;
                            for (int var46 = 0; var46 < field1114.length(); var46++) {
                                if (Statics.field343 == field1114.charAt(var46)) {
                                    var45 = true;
                                    break;
                                }
                            }
                            if (Statics.field2017 == 13) {
                                method951(true);
                            } else {
                                if (Statics.field2017 == 85 && field1107.length() > 0) {
                                    field1107 = field1107.substring(0, field1107.length() - 1);
                                }
                                if (Statics.field2017 == 84) {
                                    Statics.method4221();
                                    return;
                                }
                                if (var45 && field1107.length() < 320) {
                                    field1107 = field1107 + Statics.field343;
                                }
                            }
                        }
                    } else if (field1082 == 6) {
                        while (true) {
                            do {
                                if (!class40.method9()) {
                                    short var47 = 321;
                                    if (var12 == 1 && var14 >= var47 - 20 && var14 <= var47 + 20) {
                                        method951(true);
                                    }
                                    return;
                                }
                            } while (Statics.field2017 != 84 && Statics.field2017 != 13);
                            method951(true);
                        }
                    } else if (field1082 == 7) {
                        int var48 = field1091 + 180 - 80;
                        short var49 = 321;
                        if (var12 == 1 && var13 >= var48 - 75 && var13 <= var48 + 75 && var14 >= var49 - 20 && var14 <= var49 + 20) {
                            class46.method4762(client.method2931("secure", true) + "m=dob/set_dob.ws", true, false);
                            method23(class238.field2924, class238.field3045, class238.field2928);
                            field1082 = 6;
                            return;
                        }
                        int var50 = field1091 + 180 + 80;
                        if (var12 == 1 && var13 >= var50 - 75 && var13 <= var50 + 75 && var14 >= var49 - 20 && var14 <= var49 + 20) {
                            method951(true);
                        }
                    } else if (field1082 == 8) {
                        int var51 = field1091 + 180 - 80;
                        short var52 = 321;
                        if (var12 == 1 && var13 >= var51 - 75 && var13 <= var51 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                            class46.method4762("https://www.jagex.com/terms/privacy/#eight", true, false);
                            method23(class238.field2924, class238.field3045, class238.field2928);
                            field1082 = 6;
                            return;
                        }
                        int var53 = field1091 + 180 + 80;
                        if (var12 == 1 && var13 >= var53 - 75 && var13 <= var53 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                            method951(true);
                        }
                    }
                }
            }
        } else if (class49.field432 == 1 || !Statics.field3230 && class49.field432 == 4) {
            int var1 = field1083 + 280;
            if (class49.field433 >= var1 && class49.field433 <= var1 + 14 && class49.field429 >= 4 && class49.field429 <= 18) {
                class66.method2962(0, 0);
            } else if (class49.field433 >= var1 + 15 && class49.field433 <= var1 + 80 && class49.field429 >= 4 && class49.field429 <= 18) {
                class66.method2962(0, 1);
            } else {
                int var2 = field1083 + 390;
                if (class49.field433 >= var2 && class49.field433 <= var2 + 14 && class49.field429 >= 4 && class49.field429 <= 18) {
                    class66.method2962(1, 0);
                } else if (class49.field433 >= var2 + 15 && class49.field433 <= var2 + 80 && class49.field429 >= 4 && class49.field429 <= 18) {
                    class66.method2962(1, 1);
                } else {
                    int var3 = field1083 + 500;
                    if (class49.field433 >= var3 && class49.field433 <= var3 + 14 && class49.field429 >= 4 && class49.field429 <= 18) {
                        class66.method2962(2, 0);
                    } else if (class49.field433 >= var3 + 15 && class49.field433 <= var3 + 80 && class49.field429 >= 4 && class49.field429 <= 18) {
                        class66.method2962(2, 1);
                    } else {
                        int var4 = field1083 + 610;
                        if (class49.field433 >= var4 && class49.field433 <= var4 + 14 && class49.field429 >= 4 && class49.field429 <= 18) {
                            class66.method2962(3, 0);
                        } else if (class49.field433 >= var4 + 15 && class49.field433 <= var4 + 80 && class49.field429 >= 4 && class49.field429 <= 18) {
                            class66.method2962(3, 1);
                        } else if (class49.field433 >= field1083 + 708 && class49.field429 >= 4 && class49.field433 <= field1083 + 708 + 50 && class49.field429 <= 20) {
                            field1108 = false;
                            Statics.field1093.method5409(field1083, 0);
                            Statics.field1088.method5409(field1083 + 382, 0);
                            Statics.field1118.method5389(field1083 + 382 - Statics.field1118.field3781 / 2, 18);
                        } else if (field1117 != -1) {
                            class66 var5 = Statics.field950[field1117];
                            method1050(var5);
                            field1108 = false;
                            Statics.field1093.method5409(field1083, 0);
                            Statics.field1088.method5409(field1083 + 382, 0);
                            Statics.field1118.method5389(field1083 + 382 - Statics.field1118.field3781 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.x(ZI)V")
    public static void method951(boolean arg0) {
        field1104 = class238.field3003;
        field1113 = class238.field3004;
        field1106 = class238.field3005;
        field1082 = 2;
        if (arg0) {
            field1087 = "";
        }
        if (field1107 == null || field1107.length() <= 0) {
            if (Statics.field62.field960 == null) {
                field1109 = false;
            } else {
                field1107 = Statics.field62.field960;
                field1109 = true;
            }
        }
        method527();
    }

    @ObfuscatedName("jn.p(Lkj;Lkj;Lkj;ZI)V")
    public static void method4833(class299 arg0, class299 arg1, class299 arg2, boolean arg3) {
        if (arg3) {
            field1083 = (Statics.field1180 - 765) / 2;
            field1091 = field1083 + 202;
            Statics.field1092 = field1091 + 180;
        }
        if (field1108) {
            if (Statics.field2048 == null) {
                Statics.field2048 = class320.method260(Statics.field2271, "sl_back", "");
            }
            if (Statics.field86 == null) {
                Statics.field86 = class320.method114(Statics.field2271, "sl_flags", "");
            }
            if (Statics.field1780 == null) {
                Statics.field1780 = class320.method114(Statics.field2271, "sl_arrows", "");
            }
            if (Statics.field238 == null) {
                Statics.field238 = class320.method114(Statics.field2271, "sl_stars", "");
            }
            class315.method5331(field1083, 23, 765, 480, 0);
            class315.method5316(field1083, 0, 125, 23, 12425273, 9135624);
            class315.method5316(field1083 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5100(class238.field3072, field1083 + 62, 15, 0, -1);
            if (Statics.field238 != null) {
                Statics.field238[1].method5389(field1083 + 140, 1);
                arg1.method5097(class238.field2838, field1083 + 152, 10, 16777215, -1);
                Statics.field238[0].method5389(field1083 + 140, 12);
                arg1.method5097(class238.field3074, field1083 + 152, 21, 16777215, -1);
            }
            if (Statics.field1780 != null) {
                int var4 = field1083 + 280;
                if (class66.field947[0] == 0 && class66.field940[0] == 0) {
                    Statics.field1780[2].method5389(var4, 4);
                } else {
                    Statics.field1780[0].method5389(var4, 4);
                }
                if (class66.field947[0] == 0 && class66.field940[0] == 1) {
                    Statics.field1780[3].method5389(var4 + 15, 4);
                } else {
                    Statics.field1780[1].method5389(var4 + 15, 4);
                }
                arg0.method5097(class238.field3075, var4 + 32, 17, 16777215, -1);
                int var5 = field1083 + 390;
                if (class66.field947[0] == 1 && class66.field940[0] == 0) {
                    Statics.field1780[2].method5389(var5, 4);
                } else {
                    Statics.field1780[0].method5389(var5, 4);
                }
                if (class66.field947[0] == 1 && class66.field940[0] == 1) {
                    Statics.field1780[3].method5389(var5 + 15, 4);
                } else {
                    Statics.field1780[1].method5389(var5 + 15, 4);
                }
                arg0.method5097(class238.field3076, var5 + 32, 17, 16777215, -1);
                int var6 = field1083 + 500;
                if (class66.field947[0] == 2 && class66.field940[0] == 0) {
                    Statics.field1780[2].method5389(var6, 4);
                } else {
                    Statics.field1780[0].method5389(var6, 4);
                }
                if (class66.field947[0] == 2 && class66.field940[0] == 1) {
                    Statics.field1780[3].method5389(var6 + 15, 4);
                } else {
                    Statics.field1780[1].method5389(var6 + 15, 4);
                }
                arg0.method5097(class238.field3077, var6 + 32, 17, 16777215, -1);
                int var7 = field1083 + 610;
                if (class66.field947[0] == 3 && class66.field940[0] == 0) {
                    Statics.field1780[2].method5389(var7, 4);
                } else {
                    Statics.field1780[0].method5389(var7, 4);
                }
                if (class66.field947[0] == 3 && class66.field940[0] == 1) {
                    Statics.field1780[3].method5389(var7 + 15, 4);
                } else {
                    Statics.field1780[1].method5389(var7 + 15, 4);
                }
                arg0.method5097(class238.field3078, var7 + 32, 17, 16777215, -1);
            }
            class315.method5331(field1083 + 708, 4, 50, 16, 0);
            arg1.method5100(class238.field3031, field1083 + 708 + 25, 16, 16777215, -1);
            field1117 = -1;
            if (Statics.field2048 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class66.field946) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class66.field946) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class66.field946) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field1083 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class66.field946; var22++) {
                    class66 var23 = Statics.field950[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field956);
                    if (var23.field956 == -1) {
                        var25 = class238.field3079;
                        var24 = false;
                    } else if (var23.field956 > 1980) {
                        var25 = class238.field3016;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1470()) {
                        if (var23.method1482()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1463()) {
                        var26 = 16711680;
                        if (var23.method1482()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1461()) {
                        if (var23.method1482()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1482()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class49.field426 >= var19 && class49.field427 * 673804999 >= var18 && class49.field426 < var8 + var19 && class49.field427 * 673804999 < var9 + var18 && var24) {
                        field1117 = var22;
                        Statics.field2048[var27].method5415(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field2048[var27].method5409(var19, var18);
                    }
                    if (Statics.field86 != null) {
                        Statics.field86[(var23.method1482() ? 8 : 0) + var23.field953].method5389(var19 + 29, var18);
                    }
                    arg0.method5100(Integer.toString(var23.field948), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method5100(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method5092(Statics.field950[field1117].field952) + 6;
                    int var29 = arg1.field3696 + 8;
                    class315.method5331(class49.field426 - var28 / 2, class49.field427 * 673804999 + 20 + 5, var28, var29, 16777120);
                    class315.method5302(class49.field426 - var28 / 2, class49.field427 * 673804999 + 20 + 5, var28, var29, 0);
                    arg1.method5100(Statics.field950[field1117].field952, class49.field426, class49.field427 * 673804999 + 20 + 5 + arg1.field3696 + 4, 0, -1);
                }
            }
            Statics.field2015.method673(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1093.method5409(field1083, 0);
            Statics.field1088.method5409(field1083 + 382, 0);
            Statics.field1118.method5389(field1083 + 382 - Statics.field1118.field3781 / 2, 18);
        }
        if (client.field590 == 0 || client.field590 == 5) {
            byte var30 = 20;
            arg0.method5100(class238.field3002, field1091 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class315.method5302(field1091 + 180 - 152, var31, 304, 34, 9179409);
            class315.method5302(field1091 + 180 - 151, var31 + 1, 302, 32, 0);
            class315.method5331(field1091 + 180 - 150, var31 + 2, field1100 * 3, 30, 9179409);
            class315.method5331(field1100 * 3 + (field1091 + 180 - 150), var31 + 2, 300 - field1100 * 3, 30, 0);
            arg0.method5100(field1101, field1091 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field590 == 20) {
            Statics.field1084.method5389(field1091 + 180 - Statics.field1084.field3781 / 2, 271 - Statics.field1084.field3782 / 2);
            short var32 = 201;
            arg0.method5100(field1104, field1091 + 180, var32, 16776960, 0);
            int var123 = var32 + 15;
            arg0.method5100(field1113, field1091 + 180, var123, 16776960, 0);
            int var124 = var123 + 15;
            arg0.method5100(field1106, field1091 + 180, var124, 16776960, 0);
            int var125 = var124 + 15;
            int var126 = var125 + 7;
            if (field1082 != 4) {
                arg0.method5097(class238.field2882, field1091 + 180 - 110, var126, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = method997(); arg0.method5092(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method5097(class300.method5096(var34), field1091 + 180 - 70, var126, 16777215, 0);
                var123 = var126 + 15;
                arg0.method5097(class238.field3030 + class306.method4585(field1087), field1091 + 180 - 108, var123, 16777215, 0);
                var123 += 15;
            }
        }
        if (client.field590 == 10 || client.field590 == 11) {
            Statics.field1084.method5389(field1091, 171);
            if (field1082 == 0) {
                short var35 = 251;
                arg0.method5100(class238.field3027, field1091 + 180, var35, 16776960, 0);
                int var127 = var35 + 30;
                int var36 = field1091 + 180 - 80;
                short var37 = 291;
                Statics.field1085.method5389(var36 - 73, var37 - 20);
                arg0.method5101(class238.field2841, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1091 + 180 + 80;
                Statics.field1085.method5389(var38 - 73, var37 - 20);
                arg0.method5101(class238.field3028, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1082 == 1) {
                arg0.method5100(field1099, field1091 + 180, 201, 16776960, 0);
                short var39 = 236;
                arg0.method5100(field1104, field1091 + 180, var39, 16777215, 0);
                int var128 = var39 + 15;
                arg0.method5100(field1113, field1091 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                arg0.method5100(field1106, field1091 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                int var40 = field1091 + 180 - 80;
                short var41 = 321;
                Statics.field1085.method5389(var40 - 73, var41 - 20);
                arg0.method5100(class238.field2937, var40, var41 + 5, 16777215, 0);
                int var42 = field1091 + 180 + 80;
                Statics.field1085.method5389(var42 - 73, var41 - 20);
                arg0.method5100(class238.field3031, var42, var41 + 5, 16777215, 0);
            } else if (field1082 == 2) {
                short var43 = 201;
                arg0.method5100(field1104, Statics.field1092, var43, 16776960, 0);
                int var131 = var43 + 15;
                arg0.method5100(field1113, Statics.field1092, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg0.method5100(field1106, Statics.field1092, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var134 = var133 + 7;
                arg0.method5097(class238.field2882, Statics.field1092 - 110, var134, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = method997(); arg0.method5092(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method5097(class300.method5096(var45) + (field1103 == 0 & client.field592 % 40 < 20 ? class75.method72(16776960) + class75.field1058 : ""), Statics.field1092 - 70, var134, 16777215, 0);
                var131 = var134 + 15;
                arg0.method5097(class238.field3030 + class306.method4585(field1087) + (field1103 == 1 & client.field592 % 40 < 20 ? class75.method72(16776960) + class75.field1058 : ""), Statics.field1092 - 108, var131, 16777215, 0);
                var131 += 15;
                short var46 = 277;
                int var47 = Statics.field1092 + -117;
                boolean var48 = field1109;
                boolean var49 = field1111;
                class318 var50 = var48 ? (var49 ? Statics.field473 : Statics.field1090) : (var49 ? Statics.field1353 : Statics.field2784);
                var50.method5389(var47, var46);
                int var52 = var50.field3781 + 5 + var47;
                arg1.method5097(class238.field3032, var52, var46 + 13, 16776960, 0);
                int var53 = Statics.field1092 + 24;
                boolean var54 = Statics.field62.field963;
                boolean var55 = field1116;
                class318 var56 = var54 ? (var55 ? Statics.field473 : Statics.field1090) : (var55 ? Statics.field1353 : Statics.field2784);
                var56.method5389(var53, var46);
                int var58 = var56.field3781 + 5 + var53;
                arg1.method5097(class238.field3033, var58, var46 + 13, 16776960, 0);
                int var135 = var46 + 15;
                int var59 = Statics.field1092 - 80;
                short var60 = 321;
                Statics.field1085.method5389(var59 - 73, var60 - 20);
                arg0.method5100(class238.field2900, var59, var60 + 5, 16777215, 0);
                int var61 = Statics.field1092 + 80;
                Statics.field1085.method5389(var61 - 73, var60 - 20);
                arg0.method5100(class238.field3031, var61, var60 + 5, 16777215, 0);
                short var62 = 357;
                arg1.method5100(class238.field3039, Statics.field1092, var62, 16776960, 0);
            } else if (field1082 == 3) {
                short var63 = 201;
                arg0.method5100(class238.field2878, field1091 + 180, var63, 16776960, 0);
                int var136 = var63 + 20;
                arg1.method5100(class238.field3035, field1091 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg1.method5100(class238.field3036, field1091 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var64 = field1091 + 180;
                short var65 = 276;
                Statics.field1085.method5389(var64 - 73, var65 - 20);
                arg2.method5100(class238.field3037, var64, var65 + 5, 16777215, 0);
                int var66 = field1091 + 180;
                short var67 = 326;
                Statics.field1085.method5389(var66 - 73, var67 - 20);
                arg2.method5100(class238.field3038, var66, var67 + 5, 16777215, 0);
            } else if (field1082 == 4) {
                arg0.method5100(class238.field3019, field1091 + 180, 201, 16776960, 0);
                short var68 = 236;
                arg0.method5100(field1104, field1091 + 180, var68, 16777215, 0);
                int var139 = var68 + 15;
                arg0.method5100(field1113, field1091 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method5100(field1106, field1091 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                arg0.method5097(class238.field2992 + class306.method4585(Statics.field239) + (client.field592 % 40 < 20 ? class75.method72(16776960) + class75.field1058 : ""), field1091 + 180 - 108, var141, 16777215, 0);
                int var142 = var141 - 8;
                arg0.method5097(class238.field3065, field1091 + 180 - 9, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg0.method5097(class238.field2833, field1091 + 180 - 9, var143, 16776960, 0);
                int var69 = field1091 + 180 - 9 + arg0.method5092(class238.field2833) + 15;
                int var70 = var143 - arg0.field3696;
                class318 var71;
                if (field1105) {
                    var71 = Statics.field1090;
                } else {
                    var71 = Statics.field2784;
                }
                var71.method5389(var69, var70);
                var139 = var143 + 15;
                int var72 = field1091 + 180 - 80;
                short var73 = 321;
                Statics.field1085.method5389(var72 - 73, var73 - 20);
                arg0.method5100(class238.field2937, var72, var73 + 5, 16777215, 0);
                int var74 = field1091 + 180 + 80;
                Statics.field1085.method5389(var74 - 73, var73 - 20);
                arg0.method5100(class238.field3031, var74, var73 + 5, 16777215, 0);
                arg1.method5100(class238.field2971, field1091 + 180, var73 + 36, 255, 0);
            } else if (field1082 == 5) {
                arg0.method5100(class238.field3040, field1091 + 180, 201, 16776960, 0);
                short var75 = 221;
                arg2.method5100(field1104, field1091 + 180, var75, 16776960, 0);
                int var144 = var75 + 15;
                arg2.method5100(field1113, field1091 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg2.method5100(field1106, field1091 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var147 = var146 + 14;
                arg0.method5097(class238.field3041, field1091 + 180 - 145, var147, 16777215, 0);
                short var76 = 174;
                String var77;
                for (var77 = method997(); arg0.method5092(var77) > var76; var77 = var77.substring(1)) {
                }
                arg0.method5097(class300.method5096(var77) + (client.field592 % 40 < 20 ? class75.method72(16776960) + class75.field1058 : ""), field1091 + 180 - 34, var147, 16777215, 0);
                var144 = var147 + 15;
                int var78 = field1091 + 180 - 80;
                short var79 = 321;
                Statics.field1085.method5389(var78 - 73, var79 - 20);
                arg0.method5100(class238.field3042, var78, var79 + 5, 16777215, 0);
                int var80 = field1091 + 180 + 80;
                Statics.field1085.method5389(var80 - 73, var79 - 20);
                arg0.method5100(class238.field3043, var80, var79 + 5, 16777215, 0);
            } else if (field1082 == 6) {
                short var81 = 201;
                arg0.method5100(field1104, field1091 + 180, var81, 16776960, 0);
                int var148 = var81 + 15;
                arg0.method5100(field1113, field1091 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg0.method5100(field1106, field1091 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                int var82 = field1091 + 180;
                short var83 = 321;
                Statics.field1085.method5389(var82 - 73, var83 - 20);
                arg0.method5100(class238.field3043, var82, var83 + 5, 16777215, 0);
            } else if (field1082 == 7) {
                short var84 = 216;
                arg0.method5100(class238.field3068, field1091 + 180, var84, 16776960, 0);
                int var151 = var84 + 15;
                arg2.method5100(class238.field3069, field1091 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg2.method5100(class238.field3070, field1091 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var85 = field1091 + 180 - 80;
                short var86 = 321;
                Statics.field1085.method5389(var85 - 73, var86 - 20);
                arg0.method5100(class238.field3071, var85, var86 + 5, 16777215, 0);
                int var87 = field1091 + 180 + 80;
                Statics.field1085.method5389(var87 - 73, var86 - 20);
                arg0.method5100(class238.field3043, var87, var86 + 5, 16777215, 0);
            } else if (field1082 == 8) {
                short var88 = 216;
                arg0.method5100(class238.field2946, field1091 + 180, var88, 16776960, 0);
                int var154 = var88 + 15;
                arg2.method5100(class238.field3007, field1091 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg2.method5100(class238.field2855, field1091 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var89 = field1091 + 180 - 80;
                short var90 = 321;
                Statics.field1085.method5389(var89 - 73, var90 - 20);
                arg0.method5100(class238.field2929, var89, var90 + 5, 16777215, 0);
                int var91 = field1091 + 180 + 80;
                Statics.field1085.method5389(var91 - 73, var90 - 20);
                arg0.method5100(class238.field3043, var91, var90 + 5, 16777215, 0);
            }
        }
        if (field1098 > 0) {
            int var92 = field1098;
            short var93 = 256;
            field1096 += var92 * 128;
            if (field1096 > Statics.field2368.length) {
                field1096 -= Statics.field2368.length;
                int var94 = (int) (Math.random() * 12.0D);
                method1575(Statics.field1112[var94]);
            }
            int var95 = 0;
            int var96 = var92 * 128;
            int var97 = (var93 - var92) * 128;
            for (int var98 = 0; var98 < var97; var98++) {
                int var99 = Statics.field358[var95 + var96] - Statics.field2368[field1096 + var95 & Statics.field2368.length - 1] * var92 / 6;
                if (var99 < 0) {
                    var99 = 0;
                }
                Statics.field358[var95++] = var99;
            }
            for (int var100 = var93 - var92; var100 < var93; var100++) {
                int var101 = var100 * 128;
                for (int var102 = 0; var102 < 128; var102++) {
                    int var103 = (int) (Math.random() * 100.0D);
                    if (var103 < 50 && var102 > 10 && var102 < 118) {
                        Statics.field358[var101 + var102] = 255;
                    } else {
                        Statics.field358[var101 + var102] = 0;
                    }
                }
            }
            if (field1089 > 0) {
                field1089 -= var92 * 4;
            }
            if (field1095 > 0) {
                field1095 -= var92 * 4;
            }
            if (field1089 == 0 && field1095 == 0) {
                int var104 = (int) (Math.random() * (double) (2000 / var92));
                if (var104 == 0) {
                    field1089 = 1024;
                }
                if (var104 == 1) {
                    field1095 = 1024;
                }
            }
            for (int var105 = 0; var105 < var93 - var92; var105++) {
                field1094[var105] = field1094[var92 + var105];
            }
            for (int var106 = var93 - var92; var106 < var93; var106++) {
                field1094[var106] = (int) (Math.sin((double) field1115 / 14.0D) * 16.0D + Math.sin((double) field1115 / 15.0D) * 14.0D + Math.sin((double) field1115 / 16.0D) * 12.0D);
                field1115++;
            }
            field1097 += var92 * 8251903;
            int var107 = ((client.field592 & 0x1) + var92) / 2;
            if (var107 > 0) {
                for (int var108 = 0; var108 < field1097 * 297834396; var108++) {
                    int var109 = (int) (Math.random() * 124.0D) + 2;
                    int var110 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field358[(var110 << 7) + var109] = 192;
                }
                field1097 = 0;
                int var111 = 0;
                label446: while (true) {
                    if (var111 >= var93) {
                        int var115 = 0;
                        while (true) {
                            if (var115 >= 128) {
                                break label446;
                            }
                            int var116 = 0;
                            for (int var117 = -var107; var117 < var93; var117++) {
                                int var118 = var117 * 128;
                                if (var107 + var117 < var93) {
                                    var116 += Statics.field1074[var107 * 128 + var115 + var118];
                                }
                                if (var117 - (var107 + 1) >= 0) {
                                    var116 -= Statics.field1074[var115 + var118 - (var107 + 1) * 128];
                                }
                                if (var117 >= 0) {
                                    Statics.field358[var115 + var118] = var116 / (var107 * 2 + 1);
                                }
                            }
                            var115++;
                        }
                    }
                    int var112 = 0;
                    int var113 = var111 * 128;
                    for (int var114 = -var107; var114 < 128; var114++) {
                        if (var107 + var114 < 128) {
                            var112 += Statics.field358[var113 + var114 + var107];
                        }
                        if (var114 - (var107 + 1) >= 0) {
                            var112 -= Statics.field358[var113 + var114 - (var107 + 1)];
                        }
                        if (var114 >= 0) {
                            Statics.field1074[var113 + var114] = var112 / (var107 * 2 + 1);
                        }
                    }
                    var111++;
                }
            }
            field1098 = 0;
        }
        method2868();
        Statics.field1709[Statics.field62.field959 ? 1 : 0].method5389(field1083 + 765 - 40, 463);
        if (client.field590 <= 5 || client.field828 != 0) {
            return;
        }
        if (Statics.field2753 == null) {
            Statics.field2753 = class320.method4029(Statics.field2271, "sl_button", "");
            return;
        }
        int var119 = field1083 + 5;
        short var120 = 463;
        byte var121 = 100;
        byte var122 = 35;
        Statics.field2753.method5389(var119, var120);
        arg0.method5100(class238.field2957 + " " + client.field582, var121 / 2 + var119, var122 / 2 + var120 - 2, 16777215, 0);
        if (Statics.field440 == null) {
            arg1.method5100(class238.field3082, var121 / 2 + var119, var122 / 2 + var120 + 12, 16777215, 0);
        } else {
            arg1.method5100(class238.field3081, var121 / 2 + var119, var122 / 2 + var120 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("s.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method23(String arg0, String arg1, String arg2) {
        field1104 = arg0;
        field1113 = arg1;
        field1106 = arg2;
    }

    @ObfuscatedName("bc.n(Lly;B)V")
    public static final void method1575(class318 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2368.length; var2++) {
            Statics.field2368[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2368[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1170[var8] = (Statics.field2368[var8 - 1] + Statics.field2368[var8 + 1] + Statics.field2368[var8 - 128] + Statics.field2368[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2368;
            Statics.field2368 = Statics.field1170;
            Statics.field1170 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3782; var11++) {
            for (int var12 = 0; var12 < arg0.field3781; var12++) {
                if (arg0.field3786[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3783;
                    int var14 = var11 + 16 + arg0.field3779;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2368[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ao.f(IIII)I")
    public static final int method499(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("eo.g(B)V")
    public static final void method2868() {
        short var0 = 256;
        if (field1089 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1089 > 768) {
                    Statics.field1078[var1] = method499(Statics.field937[var1], Statics.field2365[var1], 1024 - field1089);
                } else if (field1089 > 256) {
                    Statics.field1078[var1] = Statics.field2365[var1];
                } else {
                    Statics.field1078[var1] = method499(Statics.field2365[var1], Statics.field937[var1], 256 - field1089);
                }
            }
        } else if (field1095 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1095 > 768) {
                    Statics.field1078[var2] = method499(Statics.field937[var2], Statics.field70[var2], 1024 - field1095);
                } else if (field1095 > 256) {
                    Statics.field1078[var2] = Statics.field70[var2];
                } else {
                    Statics.field1078[var2] = method499(Statics.field70[var2], Statics.field937[var2], 256 - field1095);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1078[var3] = Statics.field937[var3];
            }
        }
        class315.method5288(field1083, 9, field1083 + 128, var0 + 7);
        Statics.field1093.method5409(field1083, 0);
        class315.method5287();
        int var4 = 0;
        int var5 = field1083 + Statics.field2015.field3768 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1094[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field358[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1078[var10];
                    int var14 = Statics.field2015.field3769[var5];
                    Statics.field2015.field3769[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field2015.field3768 + var8 - 128;
        }
        class315.method5288(field1083 + 765 - 128, 9, field1083 + 765, var0 + 7);
        Statics.field1088.method5409(field1083 + 382, 0);
        class315.method5287();
        int var15 = 0;
        int var16 = field1083 + Statics.field2015.field3768 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1094[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field358[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1078[var22];
                    int var26 = Statics.field2015.field3769[var20];
                    Statics.field2015.field3769[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2015.field3768 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bg.m(Lbb;B)V")
    public static void method1050(class66 arg0) {
        if (arg0.method1482() != client.field669) {
            client.field669 = arg0.method1482();
            boolean var1 = arg0.method1482();
            if (Statics.field3427 != var1) {
                class270.method957();
                Statics.field3427 = var1;
            }
        }
        Statics.field486 = arg0.field951;
        client.field582 = arg0.field948;
        client.field633 = arg0.field949;
        Statics.field224 = client.field778 == 0 ? 43594 : arg0.field948 + 40000;
        Statics.field997 = client.field778 == 0 ? 443 : arg0.field948 + 50000;
        Statics.field3637 = Statics.field224;
    }

    @ObfuscatedName("bz.r(S)V")
    public static void method999() {
        if (class66.method37()) {
            field1108 = true;
        }
    }
}
