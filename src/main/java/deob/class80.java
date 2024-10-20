package deob;

import java.text.DecimalFormat;

@ObfuscatedName("co")
public class class80 {

    @ObfuscatedName("co.c")
    public static int field1172 = 0;

    @ObfuscatedName("co.a")
    public static int field1141 = field1172 + 202;

    @ObfuscatedName("co.w")
    public static int[] field1142 = new int[256];

    @ObfuscatedName("co.h")
    public static int field1143 = 0;

    @ObfuscatedName("co.an")
    public static int field1170 = 0;

    @ObfuscatedName("co.ag")
    public static int field1146 = 0;

    @ObfuscatedName("co.av")
    public static int field1147 = 0;

    @ObfuscatedName("co.am")
    public static int field1161 = 0;

    @ObfuscatedName("co.ap")
    public static int field1165 = 0;

    @ObfuscatedName("co.au")
    public static int field1148 = 10;

    @ObfuscatedName("co.ae")
    public static String field1154 = "";

    @ObfuscatedName("co.az")
    public static int field1152 = -1;

    @ObfuscatedName("co.ak")
    public static int field1153 = 1;

    @ObfuscatedName("co.ar")
    public static int field1133 = 0;

    @ObfuscatedName("co.at")
    public static String field1155 = "";

    @ObfuscatedName("co.aj")
    public static String field1156 = "";

    @ObfuscatedName("co.as")
    public static String field1171 = "";

    @ObfuscatedName("co.br")
    public static String field1138 = "";

    @ObfuscatedName("co.bd")
    public static String field1159 = "";

    @ObfuscatedName("co.bp")
    public static String field1157 = "";

    @ObfuscatedName("co.bg")
    public static boolean field1162 = false;

    @ObfuscatedName("co.bx")
    public static boolean field1136 = false;

    @ObfuscatedName("co.bj")
    public static boolean field1164 = true;

    @ObfuscatedName("co.bl")
    public static int field1151 = 0;

    @ObfuscatedName("co.bv")
    public static String field1166 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("co.bz")
    public static String field1167 = "1234567890";

    @ObfuscatedName("co.bs")
    public static boolean field1150 = false;

    @ObfuscatedName("co.bt")
    public static int field1169 = -1;

    @ObfuscatedName("co.by")
    public static long field1160;

    @ObfuscatedName("co.cv")
    public static long field1144;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1160 = -1L;
        field1144 = -1L;
    }

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jf.y(Liu;Liu;B)I")
    public static int method4858(class250 arg0, class250 arg1) {
        int var2 = 0;
        if (arg0.method4337("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4337("logo", "")) {
            var2++;
        }
        if (arg1.method4337("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4337("titlebox", "")) {
            var2++;
        }
        if (arg1.method4337("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4337("runes", "")) {
            var2++;
        }
        if (arg1.method4337("title_mute", "")) {
            var2++;
        }
        if (arg1.method4337("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4337("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4337("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4337("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4337("sl_back", "");
        arg1.method4337("sl_flags", "");
        arg1.method4337("sl_arrows", "");
        arg1.method4337("sl_stars", "");
        arg1.method4337("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bi.c(I)I")
    public static int method1015() {
        return 11;
    }

    @ObfuscatedName("ay.n(Liu;Liu;ZII)V")
    public static void method667(class250 arg0, class250 arg1, boolean arg2, int arg3) {
        if (!Statics.field1139) {
            field1133 = arg3;
            class320.method5361();
            byte[] var4 = arg0.method4314("title.jpg", "");
            Statics.field3755 = class44.method4061(var4);
            Statics.field2629 = Statics.field3755.method5473();
            if ((client.field628 & 0x20000000) == 0) {
                Statics.field1137 = class325.method2983(arg1, "logo", "");
            } else {
                Statics.field1137 = class325.method2983(arg1, "logo_deadman_mode", "");
            }
            Statics.field1135 = class325.method2983(arg1, "titlebox", "");
            Statics.field1149 = class325.method2983(arg1, "titlebutton", "");
            Statics.field621 = class325.method5059(arg1, "runes", "");
            Statics.field414 = class325.method5059(arg1, "title_mute", "");
            Statics.field1168 = class325.method2983(arg1, "options_radio_buttons,0", "");
            Statics.field527 = class325.method2983(arg1, "options_radio_buttons,4", "");
            Statics.field2333 = class325.method2983(arg1, "options_radio_buttons,2", "");
            Statics.field1158 = class325.method2983(arg1, "options_radio_buttons,6", "");
            Statics.field1388 = Statics.field1168.field3838;
            Statics.field1036 = Statics.field1168.field3840;
            Statics.field549 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field549[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field549[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field549[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field549[var8 + 192] = 16777215;
            }
            Statics.field63 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field63[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field63[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field63[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field63[var12 + 192] = 16777215;
            }
            Statics.field625 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field625[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field625[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field625[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field625[var16 + 192] = 16777215;
            }
            Statics.field43 = new int[256];
            Statics.field3629 = new int[32768];
            Statics.field254 = new int[32768];
            method5353((class323) null);
            Statics.field40 = new int[32768];
            Statics.field1145 = new int[32768];
            if (arg2) {
                field1159 = "";
                field1157 = "";
            }
            Statics.field1627 = 0;
            Statics.field1129 = "";
            field1164 = true;
            field1150 = false;
            if (Statics.field257.field1009) {
                class220.method3165(2);
            } else {
                class252 var17 = Statics.field397;
                int var18 = var17.method4274("scape main");
                int var19 = var17.method4275(var18, "");
                class220.field2510 = 1;
                Statics.field2507 = var17;
                Statics.field2433 = var18;
                Statics.field407 = var19;
                Statics.field1756 = 255;
                Statics.field2511 = false;
                Statics.field2327 = 2;
            }
            class253.method1452(false);
            Statics.field1139 = true;
            field1172 = (Statics.field226 - 765) / 2;
            field1141 = field1172 + 202;
            Statics.field85 = field1141 + 180;
            Statics.field3755.method5482(field1172, 0);
            Statics.field2629.method5482(field1172 + 382, 0);
            Statics.field1137.method5452(field1172 + 382 - Statics.field1137.field3838 / 2, 18);
        } else if (arg3 == 4) {
            field1133 = 4;
        }
    }

    @ObfuscatedName("hg.u(ZZI)Llb;")
    public static class323 method4128(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1158 : Statics.field2333) : (arg1 ? Statics.field527 : Statics.field1168);
    }

    @ObfuscatedName("p.i(S)Ljava/lang/String;")
    public static String method91() {
        return Statics.field257.field1012 ? class308.method1453(field1159) : field1159;
    }

    @ObfuscatedName("ki.p(I)V")
    public static void method5301() {
        if (client.field664 && field1159 != null && field1159.length() > 0) {
            field1151 = 1;
        } else {
            field1151 = 0;
        }
    }

    @ObfuscatedName("ci.e(Lax;I)V")
    public static void method1840(class48 arg0) {
        if (!field1150) {
            if ((class49.field472 == 1 || !Statics.field246 && class49.field472 == 4) && class49.field457 >= field1172 + 765 - 50 && class49.field468 >= 453) {
                Statics.field257.field1009 = !Statics.field257.field1009;
                class68.method3057();
                if (Statics.field257.field1009) {
                    Statics.field2509.method3901();
                    class220.field2510 = 1;
                    Statics.field2507 = null;
                } else {
                    class220.method90(Statics.field397, "scape main", "", 255, false);
                }
            }
            if (client.field825 != 5) {
                if (field1160 == -1L) {
                    field1160 = class187.method1700() + 1000L;
                }
                long var6 = class187.method1700();
                boolean var9;
                if (client.field893 == null || client.field884 >= client.field893.size()) {
                    var9 = true;
                } else {
                    while (true) {
                        if (client.field884 >= client.field893.size()) {
                            var9 = true;
                            break;
                        }
                        class54 var8 = (class54) client.field893.get(client.field884);
                        if (!var8.method971()) {
                            var9 = false;
                            break;
                        }
                        client.field884++;
                    }
                }
                if (var9 && field1144 == -1L) {
                    field1144 = var6;
                    if (field1144 > field1160) {
                        field1160 = field1144;
                    }
                }
                field1161++;
                if (client.field825 == 10 || client.field825 == 11) {
                    if (client.field856 == 0) {
                        if (class49.field472 == 1 || !Statics.field246 && class49.field472 == 4) {
                            int var10 = field1172 + 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class49.field457 >= var10 && class49.field457 <= var10 + var12 && class49.field468 >= var11 && class49.field468 <= var11 + var13) {
                                if (class67.method105()) {
                                    field1150 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field997 != null && class67.method105()) {
                            field1150 = true;
                        }
                    }
                    int var14 = class49.field472;
                    int var15 = class49.field457;
                    int var16 = class49.field468;
                    if (var14 == 0) {
                        var15 = class49.field465;
                        var16 = class49.field458;
                    }
                    if (!Statics.field246 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field1133 == 0) {
                        boolean var17 = false;
                        while (class40.method25()) {
                            if (Statics.field180 == 84) {
                                var17 = true;
                            }
                        }
                        int var18 = Statics.field85 - 80;
                        short var19 = 291;
                        if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                            class46.method4230(Statics.method1005("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var20 = Statics.field85 + 80;
                        if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                            if ((client.field628 & 0x2000000) != 0) {
                                field1155 = "";
                                field1156 = class240.field2940;
                                field1171 = class240.field3083;
                                field1138 = class240.field3062;
                                field1133 = 1;
                                method5301();
                            } else if ((client.field628 & 0x4) != 0) {
                                if ((client.field628 & 0x400) == 0) {
                                    field1156 = class240.field3105;
                                    field1171 = class240.field3036;
                                    field1138 = class240.field2982;
                                } else {
                                    field1156 = class240.field3057;
                                    field1171 = class240.field3058;
                                    field1138 = class240.field3059;
                                }
                                field1155 = class240.field2977;
                                field1133 = 1;
                                method5301();
                            } else if ((client.field628 & 0x400) == 0) {
                                method428(false);
                            } else {
                                field1156 = class240.field3113;
                                field1171 = class240.field3055;
                                field1138 = class240.field3056;
                                field1155 = class240.field2977;
                                field1133 = 1;
                                method5301();
                            }
                        }
                    } else if (field1133 == 1) {
                        while (class40.method25()) {
                            if (Statics.field180 == 84) {
                                method428(false);
                            } else if (Statics.field180 == 13) {
                                field1133 = 0;
                            }
                        }
                        int var21 = Statics.field85 - 80;
                        short var22 = 321;
                        if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            method428(false);
                        }
                        int var23 = Statics.field85 + 80;
                        if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            field1133 = 0;
                        }
                    } else if (field1133 == 2) {
                        short var24 = 201;
                        int var62 = var24 + 52;
                        if (var14 == 1 && var16 >= var62 - 12 && var16 < var62 + 2) {
                            field1151 = 0;
                        }
                        var62 += 15;
                        if (var14 == 1 && var16 >= var62 - 12 && var16 < var62 + 2) {
                            field1151 = 1;
                        }
                        var62 += 15;
                        short var25 = 361;
                        int var26 = Statics.field193.field3804 / 2;
                        if (var14 == 1 && var15 >= Statics.field193.field3805 - var26 && var15 <= Statics.field193.field3805 + var26 && var16 >= var25 - 15 && var16 < var25) {
                            switch(field1153) {
                                case 1:
                                    method94(class240.field3092, class240.field3093, class240.field3094);
                                    field1133 = 5;
                                    return;
                                case 2:
                                    class46.method4230("https://support.runescape.com/hc/en-gb", true, false);
                            }
                        }
                        int var27 = Statics.field85 - 80;
                        short var28 = 321;
                        if (var14 == 1 && var15 >= var27 - 75 && var15 <= var27 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                            field1159 = field1159.trim();
                            if (field1159.length() == 0) {
                                method94(class240.field2886, class240.field3028, class240.field2954);
                                return;
                            }
                            if (field1157.length() == 0) {
                                method94(class240.field2955, class240.field2956, class240.field2957);
                                return;
                            }
                            method94(class240.field3065, class240.field3066, class240.field3067);
                            client.method988(false);
                            client.method181(20);
                            return;
                        }
                        int var29 = field1141 + 180 + 80;
                        if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                            field1133 = 0;
                            field1159 = "";
                            field1157 = "";
                            Statics.field1627 = 0;
                            Statics.field1129 = "";
                            field1164 = true;
                        }
                        int var30 = Statics.field85 + -117;
                        short var31 = 277;
                        field1162 = var15 >= var30 && var15 < Statics.field1388 + var30 && var16 >= var31 && var16 < Statics.field1036 + var31;
                        if (var14 == 1 && field1162) {
                            client.field664 = !client.field664;
                            if (!client.field664 && Statics.field257.field1015 != null) {
                                Statics.field257.field1015 = null;
                                class68.method3057();
                            }
                        }
                        int var32 = Statics.field85 + 24;
                        short var33 = 277;
                        field1136 = var15 >= var32 && var15 < Statics.field1388 + var32 && var16 >= var33 && var16 < Statics.field1036 + var33;
                        if (var14 == 1 && field1136) {
                            Statics.field257.field1012 = !Statics.field257.field1012;
                            if (!Statics.field257.field1012) {
                                field1159 = "";
                                Statics.field257.field1015 = null;
                                method5301();
                            }
                            class68.method3057();
                        }
                        while (true) {
                            while (class40.method25()) {
                                boolean var34 = false;
                                for (int var35 = 0; var35 < field1166.length(); var35++) {
                                    if (Statics.field200 == field1166.charAt(var35)) {
                                        var34 = true;
                                        break;
                                    }
                                }
                                if (Statics.field180 == 13) {
                                    field1133 = 0;
                                    field1159 = "";
                                    field1157 = "";
                                    Statics.field1627 = 0;
                                    Statics.field1129 = "";
                                    field1164 = true;
                                } else if (field1151 == 0) {
                                    if (Statics.field180 == 85 && field1159.length() > 0) {
                                        field1159 = field1159.substring(0, field1159.length() - 1);
                                    }
                                    if (Statics.field180 == 84 || Statics.field180 == 80) {
                                        field1151 = 1;
                                    }
                                    if (var34 && field1159.length() < 320) {
                                        field1159 = field1159 + Statics.field200;
                                    }
                                } else if (field1151 == 1) {
                                    if (Statics.field180 == 85 && field1157.length() > 0) {
                                        field1157 = field1157.substring(0, field1157.length() - 1);
                                    }
                                    if (Statics.field180 == 84 || Statics.field180 == 80) {
                                        field1151 = 0;
                                    }
                                    if (Statics.field180 == 84) {
                                        field1159 = field1159.trim();
                                        if (field1159.length() == 0) {
                                            method94(class240.field2886, class240.field3028, class240.field2954);
                                            return;
                                        }
                                        if (field1157.length() == 0) {
                                            method94(class240.field2955, class240.field2956, class240.field2957);
                                            return;
                                        }
                                        method94(class240.field3065, class240.field3066, class240.field3067);
                                        client.method988(false);
                                        client.method181(20);
                                        return;
                                    }
                                    if (var34 && field1157.length() < 20) {
                                        field1157 = field1157 + Statics.field200;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1133 == 3) {
                        int var36 = field1141 + 180;
                        short var37 = 276;
                        if (var14 == 1 && var15 >= var36 - 75 && var15 <= var36 + 75 && var16 >= var37 - 20 && var16 <= var37 + 20) {
                            method428(false);
                        }
                        int var38 = field1141 + 180;
                        short var39 = 326;
                        if (var14 == 1 && var15 >= var38 - 75 && var15 <= var38 + 75 && var16 >= var39 - 20 && var16 <= var39 + 20) {
                            method94(class240.field3092, class240.field3093, class240.field3094);
                            field1133 = 5;
                            return;
                        }
                    } else if (field1133 == 4) {
                        int var40 = field1141 + 180 - 80;
                        short var41 = 321;
                        if (var14 == 1 && var15 >= var40 - 75 && var15 <= var40 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                            Statics.field1129.trim();
                            if (Statics.field1129.length() != 6) {
                                method94(class240.field2871, class240.field2870, class240.field2873);
                                return;
                            }
                            Statics.field1627 = Integer.parseInt(Statics.field1129);
                            Statics.field1129 = "";
                            client.method988(true);
                            method94(class240.field3065, class240.field3066, class240.field3067);
                            client.method181(20);
                            return;
                        }
                        if (var14 == 1 && var15 >= field1141 + 180 - 9 && var15 <= field1141 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                            field1164 = !field1164;
                        }
                        if (var14 == 1 && var15 >= field1141 + 180 - 34 && var15 <= field1141 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                            class46.method4230(Statics.method1005("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var42 = field1141 + 180 + 80;
                        if (var14 == 1 && var15 >= var42 - 75 && var15 <= var42 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                            field1133 = 0;
                            field1159 = "";
                            field1157 = "";
                            Statics.field1627 = 0;
                            Statics.field1129 = "";
                        }
                        while (class40.method25()) {
                            boolean var43 = false;
                            for (int var44 = 0; var44 < field1167.length(); var44++) {
                                if (Statics.field200 == field1167.charAt(var44)) {
                                    var43 = true;
                                    break;
                                }
                            }
                            if (Statics.field180 == 13) {
                                field1133 = 0;
                                field1159 = "";
                                field1157 = "";
                                Statics.field1627 = 0;
                                Statics.field1129 = "";
                            } else {
                                if (Statics.field180 == 85 && Statics.field1129.length() > 0) {
                                    Statics.field1129 = Statics.field1129.substring(0, Statics.field1129.length() - 1);
                                }
                                if (Statics.field180 == 84) {
                                    Statics.field1129.trim();
                                    if (Statics.field1129.length() != 6) {
                                        method94(class240.field2871, class240.field2870, class240.field2873);
                                        return;
                                    }
                                    Statics.field1627 = Integer.parseInt(Statics.field1129);
                                    Statics.field1129 = "";
                                    client.method988(true);
                                    method94(class240.field3065, class240.field3066, class240.field3067);
                                    client.method181(20);
                                    return;
                                }
                                if (var43 && Statics.field1129.length() < 6) {
                                    Statics.field1129 = Statics.field1129 + Statics.field200;
                                }
                            }
                        }
                    } else if (field1133 == 5) {
                        int var45 = field1141 + 180 - 80;
                        short var46 = 321;
                        if (var14 == 1 && var15 >= var45 - 75 && var15 <= var45 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                            method423();
                            return;
                        }
                        int var47 = field1141 + 180 + 80;
                        if (var14 == 1 && var15 >= var47 - 75 && var15 <= var47 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                            method428(true);
                        }
                        while (class40.method25()) {
                            boolean var48 = false;
                            for (int var49 = 0; var49 < field1166.length(); var49++) {
                                if (Statics.field200 == field1166.charAt(var49)) {
                                    var48 = true;
                                    break;
                                }
                            }
                            if (Statics.field180 == 13) {
                                method428(true);
                            } else {
                                if (Statics.field180 == 85 && field1159.length() > 0) {
                                    field1159 = field1159.substring(0, field1159.length() - 1);
                                }
                                if (Statics.field180 == 84) {
                                    method423();
                                    return;
                                }
                                if (var48 && field1159.length() < 320) {
                                    field1159 = field1159 + Statics.field200;
                                }
                            }
                        }
                    } else if (field1133 == 6) {
                        while (true) {
                            do {
                                if (!class40.method25()) {
                                    short var50 = 321;
                                    if (var14 == 1 && var16 >= var50 - 20 && var16 <= var50 + 20) {
                                        method428(true);
                                    }
                                    return;
                                }
                            } while (Statics.field180 != 84 && Statics.field180 != 13);
                            method428(true);
                        }
                    } else if (field1133 == 7) {
                        int var51 = field1141 + 180 - 80;
                        short var52 = 321;
                        if (var14 == 1 && var15 >= var51 - 75 && var15 <= var51 + 75 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                            class46.method4230(Statics.method1005("secure", true) + "m=dob/set_dob.ws", true, false);
                            method94(class240.field2879, class240.field2924, class240.field3091);
                            field1133 = 6;
                            return;
                        }
                        int var53 = field1141 + 180 + 80;
                        if (var14 == 1 && var15 >= var53 - 75 && var15 <= var53 + 75 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                            method428(true);
                        }
                    } else if (field1133 == 8) {
                        int var54 = field1141 + 180 - 80;
                        short var55 = 321;
                        if (var14 == 1 && var15 >= var54 - 75 && var15 <= var54 + 75 && var16 >= var55 - 20 && var16 <= var55 + 20) {
                            class46.method4230("https://www.jagex.com/terms/privacy/#eight", true, false);
                            method94(class240.field2879, class240.field2924, class240.field3091);
                            field1133 = 6;
                            return;
                        }
                        int var56 = field1141 + 180 + 80;
                        if (var14 == 1 && var15 >= var56 - 75 && var15 <= var56 + 75 && var16 >= var55 - 20 && var16 <= var55 + 20) {
                            method428(true);
                        }
                    } else if (field1133 == 12) {
                        String var57 = "";
                        switch(field1152) {
                            case 0:
                                var57 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                break;
                            case 1:
                                var57 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                break;
                            default:
                                method428(false);
                        }
                        int var58 = field1141 + 180;
                        short var59 = 276;
                        if (var14 == 1 && var15 >= var58 - 75 && var15 <= var58 + 75 && var16 >= var59 - 20 && var16 <= var59 + 20) {
                            class46.method4230(var57, true, false);
                            method94(class240.field2879, class240.field2924, class240.field3091);
                            field1133 = 6;
                            return;
                        }
                        int var60 = field1141 + 180;
                        short var61 = 326;
                        if (var14 == 1 && var15 >= var60 - 75 && var15 <= var60 + 75 && var16 >= var61 - 20 && var16 <= var61 + 20) {
                            method428(false);
                        }
                    }
                }
            }
        } else if (class49.field472 == 1 || !Statics.field246 && class49.field472 == 4) {
            int var1 = field1172 + 280;
            if (class49.field457 >= var1 && class49.field457 <= var1 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                class67.method1473(0, 0);
            } else if (class49.field457 >= var1 + 15 && class49.field457 <= var1 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                class67.method1473(0, 1);
            } else {
                int var2 = field1172 + 390;
                if (class49.field457 >= var2 && class49.field457 <= var2 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                    class67.method1473(1, 0);
                } else if (class49.field457 >= var2 + 15 && class49.field457 <= var2 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                    class67.method1473(1, 1);
                } else {
                    int var3 = field1172 + 500;
                    if (class49.field457 >= var3 && class49.field457 <= var3 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                        class67.method1473(2, 0);
                    } else if (class49.field457 >= var3 + 15 && class49.field457 <= var3 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                        class67.method1473(2, 1);
                    } else {
                        int var4 = field1172 + 610;
                        if (class49.field457 >= var4 && class49.field457 <= var4 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                            class67.method1473(3, 0);
                        } else if (class49.field457 >= var4 + 15 && class49.field457 <= var4 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                            class67.method1473(3, 1);
                        } else if (class49.field457 >= field1172 + 708 && class49.field468 >= 4 && class49.field457 <= field1172 + 708 + 50 && class49.field468 <= 20) {
                            field1150 = false;
                            Statics.field3755.method5482(field1172, 0);
                            Statics.field2629.method5482(field1172 + 382, 0);
                            Statics.field1137.method5452(field1172 + 382 - Statics.field1137.field3838 / 2, 18);
                        } else if (field1169 != -1) {
                            class67 var5 = Statics.field990[field1169];
                            method1898(var5);
                            field1150 = false;
                            Statics.field3755.method5482(field1172, 0);
                            Statics.field2629.method5482(field1172 + 382, 0);
                            Statics.field1137.method5452(field1172 + 382 - Statics.field1137.field3838 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.s(ZI)V")
    public static void method428(boolean arg0) {
        field1156 = class240.field2863;
        field1171 = class240.field3048;
        field1138 = class240.field2972;
        field1133 = 2;
        if (arg0) {
            field1157 = "";
        }
        if (field1159 == null || field1159.length() <= 0) {
            if (Statics.field257.field1015 == null) {
                client.field664 = false;
            } else {
                field1159 = Statics.field257.field1015;
                client.field664 = true;
            }
        }
        method5301();
    }

    @ObfuscatedName("m.v(B)V")
    public static void method423() {
        field1159 = field1159.trim();
        if (field1159.length() == 0) {
            method94(class240.field3092, class240.field3093, class240.field3094);
            return;
        }
        long var0 = class75.method2866();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class75.method3028(var0, field1159);
        }
        switch(var2) {
            case 2:
                method94(class240.field3049, class240.field3096, class240.field3097);
                field1133 = 6;
                break;
            case 3:
                method94(class240.field3098, class240.field3099, class240.field2997);
                break;
            case 4:
                method94(class240.field3101, class240.field3102, class240.field3116);
                break;
            case 5:
                method94(class240.field3104, class240.field2899, class240.field2905);
                break;
            case 6:
                method94(class240.field3107, class240.field3108, class240.field3109);
                break;
            case 7:
                method94(class240.field3110, class240.field3111, class240.field3112);
        }
    }

    @ObfuscatedName("bu.k(Lkt;Lkt;Lkt;ZI)V")
    public static void method1469(class301 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg3) {
            field1172 = (Statics.field226 - 765) / 2;
            field1141 = field1172 + 202;
            Statics.field85 = field1141 + 180;
        }
        if (field1150) {
            method639(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3755.method5482(field1172, 0);
            Statics.field2629.method5482(field1172 + 382, 0);
            Statics.field1137.method5452(field1172 + 382 - Statics.field1137.field3838 / 2, 18);
        }
        if (client.field825 == 0 || client.field825 == 5) {
            byte var4 = 20;
            arg0.method5147(class240.field3046, field1141 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class320.method5428(field1141 + 180 - 152, var5, 304, 34, 9179409);
            class320.method5428(field1141 + 180 - 151, var5 + 1, 302, 32, 0);
            class320.method5372(field1141 + 180 - 150, var5 + 2, field1148 * 3, 30, 9179409);
            class320.method5372(field1148 * 3 + (field1141 + 180 - 150), var5 + 2, 300 - field1148 * 3, 30, 0);
            arg0.method5147(field1154, field1141 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field825 == 20) {
            Statics.field1135.method5452(field1141 + 180 - Statics.field1135.field3838 / 2, 271 - Statics.field1135.field3840 / 2);
            short var6 = 201;
            arg0.method5147(field1156, field1141 + 180, var6, 16776960, 0);
            int var129 = var6 + 15;
            arg0.method5147(field1171, field1141 + 180, var129, 16776960, 0);
            int var130 = var129 + 15;
            arg0.method5147(field1138, field1141 + 180, var130, 16776960, 0);
            int var131 = var130 + 15;
            int var132 = var131 + 7;
            if (field1133 != 4) {
                arg0.method5144(class240.field3068, field1141 + 180 - 110, var132, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = method91(); arg0.method5139(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method5144(class302.method5143(var8), field1141 + 180 - 70, var132, 16777215, 0);
                var129 = var132 + 15;
                arg0.method5144(class240.field3069 + class308.method1453(field1157), field1141 + 180 - 108, var129, 16777215, 0);
                var129 += 15;
            }
        }
        if (client.field825 == 10 || client.field825 == 11) {
            Statics.field1135.method5452(field1141, 171);
            if (field1133 == 0) {
                short var9 = 251;
                arg0.method5147(class240.field2994, field1141 + 180, var9, 16776960, 0);
                int var133 = var9 + 30;
                int var10 = field1141 + 180 - 80;
                short var11 = 291;
                Statics.field1149.method5452(var10 - 73, var11 - 20);
                arg0.method5196(class240.field3072, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1141 + 180 + 80;
                Statics.field1149.method5452(var12 - 73, var11 - 20);
                arg0.method5196(class240.field3014, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1133 == 1) {
                arg0.method5147(field1155, field1141 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method5147(field1156, field1141 + 180, var13, 16777215, 0);
                int var134 = var13 + 15;
                arg0.method5147(field1171, field1141 + 180, var134, 16777215, 0);
                int var135 = var134 + 15;
                arg0.method5147(field1138, field1141 + 180, var135, 16777215, 0);
                int var136 = var135 + 15;
                int var14 = field1141 + 180 - 80;
                short var15 = 321;
                Statics.field1149.method5452(var14 - 73, var15 - 20);
                arg0.method5147(class240.field2838, var14, var15 + 5, 16777215, 0);
                int var16 = field1141 + 180 + 80;
                Statics.field1149.method5452(var16 - 73, var15 - 20);
                arg0.method5147(class240.field3075, var16, var15 + 5, 16777215, 0);
            } else if (field1133 == 2) {
                short var17 = 201;
                arg0.method5147(field1156, Statics.field85, var17, 16776960, 0);
                int var137 = var17 + 15;
                arg0.method5147(field1171, Statics.field85, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg0.method5147(field1138, Statics.field85, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var140 = var139 + 7;
                arg0.method5144(class240.field3068, Statics.field85 - 110, var140, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method91(); arg0.method5139(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method5144(class302.method5143(var19) + (field1151 == 0 & client.field637 % 40 < 20 ? class76.method3066(16776960) + class76.field1105 : ""), Statics.field85 - 70, var140, 16777215, 0);
                var137 = var140 + 15;
                arg0.method5144(class240.field3069 + class308.method1453(field1157) + (field1151 == 1 & client.field637 % 40 < 20 ? class76.method3066(16776960) + class76.field1105 : ""), Statics.field85 - 108, var137, 16777215, 0);
                var137 += 15;
                short var20 = 277;
                int var21 = Statics.field85 + -117;
                class323 var22 = method4128(client.field664, field1162);
                var22.method5452(var21, var20);
                int var23 = var22.field3838 + 5 + var21;
                arg1.method5144(class240.field3084, var23, var20 + 13, 16776960, 0);
                int var24 = Statics.field85 + 24;
                boolean var25 = Statics.field257.field1012;
                boolean var26 = field1136;
                class323 var27 = var25 ? (var26 ? Statics.field1158 : Statics.field2333) : (var26 ? Statics.field527 : Statics.field1168);
                var27.method5452(var24, var20);
                int var29 = var27.field3838 + 5 + var24;
                arg1.method5144(class240.field3077, var29, var20 + 13, 16776960, 0);
                int var141 = var20 + 15;
                int var30 = Statics.field85 - 80;
                short var31 = 321;
                Statics.field1149.method5452(var30 - 73, var31 - 20);
                arg0.method5147(class240.field3074, var30, var31 + 5, 16777215, 0);
                int var32 = Statics.field85 + 80;
                Statics.field1149.method5452(var32 - 73, var31 - 20);
                arg0.method5147(class240.field3075, var32, var31 + 5, 16777215, 0);
                short var33 = 357;
                switch(field1153) {
                    case 2:
                        Statics.field67 = class240.field3088;
                        break;
                    default:
                        Statics.field67 = class240.field3087;
                }
                Statics.field193 = new class316(Statics.field85, var33, arg1.method5139(Statics.field67), 11);
                arg1.method5147(Statics.field67, Statics.field85, var33, 16777215, 0);
            } else if (field1133 == 3) {
                short var34 = 201;
                arg0.method5147(class240.field3002, field1141 + 180, var34, 16776960, 0);
                int var142 = var34 + 20;
                arg1.method5147(class240.field3079, field1141 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg1.method5147(class240.field3080, field1141 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                int var35 = field1141 + 180;
                short var36 = 276;
                Statics.field1149.method5452(var35 - 73, var36 - 20);
                arg2.method5147(class240.field3081, var35, var36 + 5, 16777215, 0);
                int var37 = field1141 + 180;
                short var38 = 326;
                Statics.field1149.method5452(var37 - 73, var38 - 20);
                arg2.method5147(class240.field2913, var37, var38 + 5, 16777215, 0);
            } else if (field1133 == 4) {
                arg0.method5147(class240.field3063, field1141 + 180, 201, 16776960, 0);
                short var39 = 236;
                arg0.method5147(field1156, field1141 + 180, var39, 16777215, 0);
                int var145 = var39 + 15;
                arg0.method5147(field1171, field1141 + 180, var145, 16777215, 0);
                int var146 = var145 + 15;
                arg0.method5147(field1138, field1141 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method5144(class240.field3070 + class308.method1453(Statics.field1129) + (client.field637 % 40 < 20 ? class76.method3066(16776960) + class76.field1105 : ""), field1141 + 180 - 108, var147, 16777215, 0);
                int var148 = var147 - 8;
                arg0.method5144(class240.field2893, field1141 + 180 - 9, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg0.method5144(class240.field3052, field1141 + 180 - 9, var149, 16776960, 0);
                int var40 = field1141 + 180 - 9 + arg0.method5139(class240.field3052) + 15;
                int var41 = var149 - arg0.field3737;
                class323 var42;
                if (field1164) {
                    var42 = Statics.field2333;
                } else {
                    var42 = Statics.field1168;
                }
                var42.method5452(var40, var41);
                var145 = var149 + 15;
                int var43 = field1141 + 180 - 80;
                short var44 = 321;
                Statics.field1149.method5452(var43 - 73, var44 - 20);
                arg0.method5147(class240.field2838, var43, var44 + 5, 16777215, 0);
                int var45 = field1141 + 180 + 80;
                Statics.field1149.method5452(var45 - 73, var44 - 20);
                arg0.method5147(class240.field3075, var45, var44 + 5, 16777215, 0);
                arg1.method5147(class240.field3040, field1141 + 180, var44 + 36, 255, 0);
            } else if (field1133 == 5) {
                arg0.method5147(class240.field3078, field1141 + 180, 201, 16776960, 0);
                short var46 = 221;
                arg2.method5147(field1156, field1141 + 180, var46, 16776960, 0);
                int var150 = var46 + 15;
                arg2.method5147(field1171, field1141 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg2.method5147(field1138, field1141 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var153 = var152 + 14;
                arg0.method5144(class240.field3064, field1141 + 180 - 145, var153, 16777215, 0);
                short var47 = 174;
                String var48;
                for (var48 = method91(); arg0.method5139(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method5144(class302.method5143(var48) + (client.field637 % 40 < 20 ? class76.method3066(16776960) + class76.field1105 : ""), field1141 + 180 - 34, var153, 16777215, 0);
                var150 = var153 + 15;
                int var49 = field1141 + 180 - 80;
                short var50 = 321;
                Statics.field1149.method5452(var49 - 73, var50 - 20);
                arg0.method5147(class240.field3047, var49, var50 + 5, 16777215, 0);
                int var51 = field1141 + 180 + 80;
                Statics.field1149.method5452(var51 - 73, var50 - 20);
                arg0.method5147(class240.field3086, var51, var50 + 5, 16777215, 0);
            } else if (field1133 == 6) {
                short var52 = 201;
                arg0.method5147(field1156, field1141 + 180, var52, 16776960, 0);
                int var154 = var52 + 15;
                arg0.method5147(field1171, field1141 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg0.method5147(field1138, field1141 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var53 = field1141 + 180;
                short var54 = 321;
                Statics.field1149.method5452(var53 - 73, var54 - 20);
                arg0.method5147(class240.field3086, var53, var54 + 5, 16777215, 0);
            } else if (field1133 == 7) {
                short var55 = 216;
                arg0.method5147(class240.field2964, field1141 + 180, var55, 16776960, 0);
                int var157 = var55 + 15;
                arg2.method5147(class240.field3114, field1141 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                arg2.method5147(class240.field2842, field1141 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                int var56 = field1141 + 180 - 80;
                short var57 = 321;
                Statics.field1149.method5452(var56 - 73, var57 - 20);
                arg0.method5147(class240.field2875, var56, var57 + 5, 16777215, 0);
                int var58 = field1141 + 180 + 80;
                Statics.field1149.method5452(var58 - 73, var57 - 20);
                arg0.method5147(class240.field3086, var58, var57 + 5, 16777215, 0);
            } else if (field1133 == 8) {
                short var59 = 216;
                arg0.method5147(class240.field2970, field1141 + 180, var59, 16776960, 0);
                int var160 = var59 + 15;
                arg2.method5147(class240.field2971, field1141 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg2.method5147(class240.field2928, field1141 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                int var60 = field1141 + 180 - 80;
                short var61 = 321;
                Statics.field1149.method5452(var60 - 73, var61 - 20);
                arg0.method5147(class240.field2973, var60, var61 + 5, 16777215, 0);
                int var62 = field1141 + 180 + 80;
                Statics.field1149.method5452(var62 - 73, var61 - 20);
                arg0.method5147(class240.field3086, var62, var61 + 5, 16777215, 0);
            } else if (field1133 == 12) {
                short var63 = 201;
                String var64 = "";
                String var65 = "";
                String var66 = "";
                switch(field1152) {
                    case 0:
                        var64 = class240.field2850;
                        var65 = class240.field2887;
                        var66 = class240.field2888;
                        break;
                    case 1:
                        var64 = class240.field2925;
                        var65 = class240.field2926;
                        var66 = class240.field2927;
                        break;
                    default:
                        method428(false);
                }
                arg0.method5147(var64, field1141 + 180, var63, 16776960, 0);
                int var163 = var63 + 15;
                arg2.method5147(var65, field1141 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                arg2.method5147(var66, field1141 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                int var67 = field1141 + 180;
                short var68 = 276;
                Statics.field1149.method5452(var67 - 73, var68 - 20);
                arg0.method5147(class240.field2990, var67, var68 + 5, 16777215, 0);
                int var69 = field1141 + 180;
                short var70 = 326;
                Statics.field1149.method5452(var69 - 73, var70 - 20);
                arg0.method5147(class240.field3086, var69, var70 + 5, 16777215, 0);
            }
        }
        if (field1161 > 0) {
            int var71 = field1161;
            short var72 = 256;
            field1146 += var71 * 128;
            if (field1146 > Statics.field3629.length) {
                field1146 -= Statics.field3629.length;
                int var73 = (int) (Math.random() * 12.0D);
                method5353(Statics.field621[var73]);
            }
            int var74 = 0;
            int var75 = var71 * 128;
            int var76 = (var72 - var71) * 128;
            for (int var77 = 0; var77 < var76; var77++) {
                int var78 = Statics.field40[var74 + var75] - Statics.field3629[field1146 + var74 & Statics.field3629.length - 1] * var71 / 6;
                if (var78 < 0) {
                    var78 = 0;
                }
                Statics.field40[var74++] = var78;
            }
            for (int var79 = var72 - var71; var79 < var72; var79++) {
                int var80 = var79 * 128;
                for (int var81 = 0; var81 < 128; var81++) {
                    int var82 = (int) (Math.random() * 100.0D);
                    if (var82 < 50 && var81 > 10 && var81 < 118) {
                        Statics.field40[var80 + var81] = 255;
                    } else {
                        Statics.field40[var80 + var81] = 0;
                    }
                }
            }
            if (field1143 > 0) {
                field1143 -= var71 * 4;
            }
            if (field1170 > 0) {
                field1170 -= var71 * 4;
            }
            if (field1143 == 0 && field1170 == 0) {
                int var83 = (int) (Math.random() * (double) (2000 / var71));
                if (var83 == 0) {
                    field1143 = 1024;
                }
                if (var83 == 1) {
                    field1170 = 1024;
                }
            }
            for (int var84 = 0; var84 < var72 - var71; var84++) {
                field1142[var84] = field1142[var71 + var84];
            }
            for (int var85 = var72 - var71; var85 < var72; var85++) {
                field1142[var85] = (int) (Math.sin((double) field1165 / 14.0D) * 16.0D + Math.sin((double) field1165 / 15.0D) * 14.0D + Math.sin((double) field1165 / 16.0D) * 12.0D);
                field1165++;
            }
            field1147 += var71 * -1121352379;
            int var86 = ((client.field637 & 0x1) + var71) / 2;
            if (var86 > 0) {
                for (int var87 = 0; var87 < field1147 * -2108478700; var87++) {
                    int var88 = (int) (Math.random() * 124.0D) + 2;
                    int var89 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field40[(var89 << 7) + var88] = 192;
                }
                field1147 = 0;
                int var90 = 0;
                label343: while (true) {
                    if (var90 >= var72) {
                        int var94 = 0;
                        while (true) {
                            if (var94 >= 128) {
                                break label343;
                            }
                            int var95 = 0;
                            for (int var96 = -var86; var96 < var72; var96++) {
                                int var97 = var96 * 128;
                                if (var86 + var96 < var72) {
                                    var95 += Statics.field1145[var86 * 128 + var94 + var97];
                                }
                                if (var96 - (var86 + 1) >= 0) {
                                    var95 -= Statics.field1145[var94 + var97 - (var86 + 1) * 128];
                                }
                                if (var96 >= 0) {
                                    Statics.field40[var94 + var97] = var95 / (var86 * 2 + 1);
                                }
                            }
                            var94++;
                        }
                    }
                    int var91 = 0;
                    int var92 = var90 * 128;
                    for (int var93 = -var86; var93 < 128; var93++) {
                        if (var86 + var93 < 128) {
                            var91 += Statics.field40[var92 + var93 + var86];
                        }
                        if (var93 - (var86 + 1) >= 0) {
                            var91 -= Statics.field40[var92 + var93 - (var86 + 1)];
                        }
                        if (var93 >= 0) {
                            Statics.field1145[var92 + var93] = var91 / (var86 * 2 + 1);
                        }
                    }
                    var90++;
                }
            }
            field1161 = 0;
        }
        short var98 = 256;
        if (field1143 > 0) {
            for (int var99 = 0; var99 < 256; var99++) {
                if (field1143 > 768) {
                    Statics.field43[var99] = method1682(Statics.field549[var99], Statics.field63[var99], 1024 - field1143);
                } else if (field1143 > 256) {
                    Statics.field43[var99] = Statics.field63[var99];
                } else {
                    Statics.field43[var99] = method1682(Statics.field63[var99], Statics.field549[var99], 256 - field1143);
                }
            }
        } else if (field1170 > 0) {
            for (int var100 = 0; var100 < 256; var100++) {
                if (field1170 > 768) {
                    Statics.field43[var100] = method1682(Statics.field549[var100], Statics.field625[var100], 1024 - field1170);
                } else if (field1170 > 256) {
                    Statics.field43[var100] = Statics.field625[var100];
                } else {
                    Statics.field43[var100] = method1682(Statics.field625[var100], Statics.field549[var100], 256 - field1170);
                }
            }
        } else {
            for (int var101 = 0; var101 < 256; var101++) {
                Statics.field43[var101] = Statics.field549[var101];
            }
        }
        class320.method5364(field1172, 9, field1172 + 128, var98 + 7);
        Statics.field3755.method5482(field1172, 0);
        class320.method5363();
        int var102 = 0;
        int var103 = field1172 + Statics.field448.field3827 * 9;
        for (int var104 = 1; var104 < var98 - 1; var104++) {
            int var105 = (var98 - var104) * field1142[var104] / var98;
            int var106 = var105 + 22;
            if (var106 < 0) {
                var106 = 0;
            }
            var102 += var106;
            for (int var107 = var106; var107 < 128; var107++) {
                int var108 = Statics.field40[var102++];
                if (var108 == 0) {
                    var103++;
                } else {
                    int var110 = 256 - var108;
                    int var111 = Statics.field43[var108];
                    int var112 = Statics.field448.field3828[var103];
                    Statics.field448.field3828[var103++] = ((var111 & 0xFF00) * var108 + (var112 & 0xFF00) * var110 & 0xFF0000) + ((var111 & 0xFF00FF) * var108 + (var112 & 0xFF00FF) * var110 & 0xFF00FF00) >> 8;
                }
            }
            var103 += Statics.field448.field3827 + var106 - 128;
        }
        class320.method5364(field1172 + 765 - 128, 9, field1172 + 765, var98 + 7);
        Statics.field2629.method5482(field1172 + 382, 0);
        class320.method5363();
        int var113 = 0;
        int var114 = field1172 + Statics.field448.field3827 * 9 + 24 + 637;
        for (int var115 = 1; var115 < var98 - 1; var115++) {
            int var116 = (var98 - var115) * field1142[var115] / var98;
            int var117 = 103 - var116;
            int var118 = var114 + var116;
            for (int var119 = 0; var119 < var117; var119++) {
                int var120 = Statics.field40[var113++];
                if (var120 == 0) {
                    var118++;
                } else {
                    int var122 = 256 - var120;
                    int var123 = Statics.field43[var120];
                    int var124 = Statics.field448.field3828[var118];
                    Statics.field448.field3828[var118++] = ((var123 & 0xFF00FF) * var120 + (var124 & 0xFF00FF) * var122 & 0xFF00FF00) + ((var123 & 0xFF00) * var120 + (var124 & 0xFF00) * var122 & 0xFF0000) >> 8;
                }
            }
            var113 += 128 - var117;
            var114 = Statics.field448.field3827 - var117 - var116 + var118;
        }
        Statics.field414[Statics.field257.field1009 ? 1 : 0].method5452(field1172 + 765 - 40, 463);
        if (client.field825 <= 5 || client.field856 != 0) {
            return;
        }
        if (Statics.field1972 == null) {
            Statics.field1972 = class325.method2983(Statics.field1260, "sl_button", "");
            return;
        }
        int var125 = field1172 + 5;
        short var126 = 463;
        byte var127 = 100;
        byte var128 = 35;
        Statics.field1972.method5452(var125, var126);
        arg0.method5147(class240.field3001 + " " + client.field627, var127 / 2 + var125, var128 / 2 + var126 - 2, 16777215, 0);
        if (Statics.field997 == null) {
            arg1.method5147(class240.field3127, var127 / 2 + var125, var128 / 2 + var126 + 12, 16777215, 0);
        } else {
            arg1.method5147(class240.field3053, var127 / 2 + var125, var128 / 2 + var126 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("s.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method94(String arg0, String arg1, String arg2) {
        field1156 = arg0;
        field1171 = arg1;
        field1138 = arg2;
    }

    @ObfuscatedName("lj.q(Llb;I)V")
    public static final void method5353(class323 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3629.length; var2++) {
            Statics.field3629[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3629[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field254[var8] = (Statics.field3629[var8 - 1] + Statics.field3629[var8 + 1] + Statics.field3629[var8 - 128] + Statics.field3629[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3629;
            Statics.field3629 = Statics.field254;
            Statics.field254 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3840; var11++) {
            for (int var12 = 0; var12 < arg0.field3838; var12++) {
                if (arg0.field3842[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3841;
                    int var14 = var11 + 16 + arg0.field3839;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3629[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ba.l(IIII)I")
    public static final int method1682(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ac.f(Lkt;Lkt;B)V")
    public static void method639(class301 arg0, class301 arg1) {
        if (Statics.field1716 == null) {
            Statics.field1716 = class325.method3232(Statics.field1260, "sl_back", "");
        }
        if (Statics.field176 == null) {
            Statics.field176 = class325.method5059(Statics.field1260, "sl_flags", "");
        }
        if (Statics.field2789 == null) {
            Statics.field2789 = class325.method5059(Statics.field1260, "sl_arrows", "");
        }
        if (Statics.field2630 == null) {
            Statics.field2630 = class325.method5059(Statics.field1260, "sl_stars", "");
        }
        class320.method5372(field1172, 23, 765, 480, 0);
        class320.method5390(field1172, 0, 125, 23, 12425273, 9135624);
        class320.method5390(field1172 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5147(class240.field3117, field1172 + 62, 15, 0, -1);
        if (Statics.field2630 != null) {
            Statics.field2630[1].method5452(field1172 + 140, 1);
            arg1.method5144(class240.field3118, field1172 + 152, 10, 16777215, -1);
            Statics.field2630[0].method5452(field1172 + 140, 12);
            arg1.method5144(class240.field3119, field1172 + 152, 21, 16777215, -1);
        }
        if (Statics.field2789 != null) {
            int var2 = field1172 + 280;
            if (class67.field996[0] == 0 && class67.field1004[0] == 0) {
                Statics.field2789[2].method5452(var2, 4);
            } else {
                Statics.field2789[0].method5452(var2, 4);
            }
            if (class67.field996[0] == 0 && class67.field1004[0] == 1) {
                Statics.field2789[3].method5452(var2 + 15, 4);
            } else {
                Statics.field2789[1].method5452(var2 + 15, 4);
            }
            arg0.method5144(class240.field3120, var2 + 32, 17, 16777215, -1);
            int var3 = field1172 + 390;
            if (class67.field996[0] == 1 && class67.field1004[0] == 0) {
                Statics.field2789[2].method5452(var3, 4);
            } else {
                Statics.field2789[0].method5452(var3, 4);
            }
            if (class67.field996[0] == 1 && class67.field1004[0] == 1) {
                Statics.field2789[3].method5452(var3 + 15, 4);
            } else {
                Statics.field2789[1].method5452(var3 + 15, 4);
            }
            arg0.method5144(class240.field3121, var3 + 32, 17, 16777215, -1);
            int var4 = field1172 + 500;
            if (class67.field996[0] == 2 && class67.field1004[0] == 0) {
                Statics.field2789[2].method5452(var4, 4);
            } else {
                Statics.field2789[0].method5452(var4, 4);
            }
            if (class67.field996[0] == 2 && class67.field1004[0] == 1) {
                Statics.field2789[3].method5452(var4 + 15, 4);
            } else {
                Statics.field2789[1].method5452(var4 + 15, 4);
            }
            arg0.method5144(class240.field2923, var4 + 32, 17, 16777215, -1);
            int var5 = field1172 + 610;
            if (class67.field996[0] == 3 && class67.field1004[0] == 0) {
                Statics.field2789[2].method5452(var5, 4);
            } else {
                Statics.field2789[0].method5452(var5, 4);
            }
            if (class67.field996[0] == 3 && class67.field1004[0] == 1) {
                Statics.field2789[3].method5452(var5 + 15, 4);
            } else {
                Statics.field2789[1].method5452(var5 + 15, 4);
            }
            arg0.method5144(class240.field3123, var5 + 32, 17, 16777215, -1);
        }
        class320.method5372(field1172 + 708, 4, 50, 16, 0);
        arg1.method5147(class240.field3075, field1172 + 708 + 25, 16, 16777215, -1);
        field1169 = -1;
        if (Statics.field1716 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class67.field995) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class67.field995) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class67.field995) {
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
            int var16 = var15 + 23;
            int var17 = field1172 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class67.field995; var20++) {
                class67 var21 = Statics.field990[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1001);
                if (var21.field1001 == -1) {
                    var23 = class240.field2912;
                    var22 = false;
                } else if (var21.field1001 > 1980) {
                    var23 = class240.field3125;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1502()) {
                    if (var21.method1475()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1479()) {
                    var24 = 16711680;
                    if (var21.method1475()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1477()) {
                    if (var21.method1475()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1475()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class49.field465 >= var17 && class49.field458 >= var16 && class49.field465 < var6 + var17 && class49.field458 < var7 + var16 && var22) {
                    field1169 = var20;
                    Statics.field1716[var25].method5496(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1716[var25].method5482(var17, var16);
                }
                if (Statics.field176 != null) {
                    Statics.field176[(var21.method1475() ? 8 : 0) + var21.field1003].method5452(var17 + 29, var16);
                }
                arg0.method5147(Integer.toString(var21.field998), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method5147(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method5139(Statics.field990[field1169].field1002) + 6;
                int var27 = arg1.field3737 + 8;
                class320.method5372(class49.field465 - var26 / 2, class49.field458 + 20 + 5, var26, var27, 16777120);
                class320.method5428(class49.field465 - var26 / 2, class49.field458 + 20 + 5, var26, var27, 0);
                arg1.method5147(Statics.field990[field1169].field1002, class49.field465, class49.field458 + 20 + 5 + arg1.field3737 + 4, 0, -1);
            }
        }
        Statics.field448.method712(0, 0);
    }

    @ObfuscatedName("cw.z(Lbl;I)V")
    public static void method1898(class67 arg0) {
        if (arg0.method1475() != client.field871) {
            client.field871 = arg0.method1475();
            class272.method4233(arg0.method1475());
        }
        Statics.field1912 = arg0.field992;
        client.field627 = arg0.field998;
        client.field628 = arg0.field999;
        Statics.field914 = client.field710 == 0 ? 43594 : arg0.field998 + 40000;
        Statics.field2308 = client.field710 == 0 ? 443 : arg0.field998 + 50000;
        Statics.field900 = Statics.field914;
    }

    @ObfuscatedName("dq.a(II)V")
    public static void method2375(int arg0) {
        field1133 = 12;
        field1152 = arg0;
    }
}
