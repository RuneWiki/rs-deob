package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("ci")
public class class80 {

    @ObfuscatedName("ci.l")
    public static int field1171 = 0;

    @ObfuscatedName("ci.u")
    public static int field1152 = field1171 + 202;

    @ObfuscatedName("ci.h")
    public static int[] field1143 = new int[256];

    @ObfuscatedName("ci.y")
    public static int field1144 = 0;

    @ObfuscatedName("ci.av")
    public static int field1149 = 0;

    @ObfuscatedName("ci.ac")
    public static int field1146 = 0;

    @ObfuscatedName("ci.am")
    public static int field1147 = 0;

    @ObfuscatedName("ci.aw")
    public static int field1148 = 0;

    @ObfuscatedName("ci.aa")
    public static int field1137 = 0;

    @ObfuscatedName("ci.as")
    public static int field1139 = 10;

    @ObfuscatedName("ci.al")
    public static String field1151 = "";

    @ObfuscatedName("ci.ar")
    public static int field1135 = -1;

    @ObfuscatedName("ci.au")
    public static int field1153 = 1;

    @ObfuscatedName("ci.ai")
    public static int field1162 = 0;

    @ObfuscatedName("ci.an")
    public static String field1155 = "";

    @ObfuscatedName("ci.ay")
    public static String field1156 = "";

    @ObfuscatedName("ci.ak")
    public static String field1157 = "";

    @ObfuscatedName("ci.be")
    public static String field1158 = "";

    @ObfuscatedName("ci.bo")
    public static String field1150 = "";

    @ObfuscatedName("ci.bx")
    public static String field1160 = "";

    @ObfuscatedName("ci.bw")
    public static boolean field1161 = false;

    @ObfuscatedName("ci.bq")
    public static boolean field1136 = false;

    @ObfuscatedName("ci.bv")
    public static boolean field1163 = true;

    @ObfuscatedName("ci.bu")
    public static int field1164 = 0;

    @ObfuscatedName("ci.bk")
    public static String field1165 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.bt")
    public static String field1166 = "1234567890";

    @ObfuscatedName("ci.bj")
    public static boolean field1167 = false;

    @ObfuscatedName("ci.bh")
    public static int field1168 = -1;

    @ObfuscatedName("ci.bp")
    public static long field1169;

    @ObfuscatedName("ci.cf")
    public static long field1154;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1169 = -1L;
        field1154 = -1L;
    }

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.f(Lik;Lik;I)I")
    public static int method462(class250 arg0, class250 arg1) {
        int var2 = 0;
        if (arg0.method4310("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4310("logo", "")) {
            var2++;
        }
        if (arg1.method4310("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4310("titlebox", "")) {
            var2++;
        }
        if (arg1.method4310("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4310("runes", "")) {
            var2++;
        }
        if (arg1.method4310("title_mute", "")) {
            var2++;
        }
        if (arg1.method4310("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4310("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4310("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4310("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4310("sl_back", "");
        arg1.method4310("sl_flags", "");
        arg1.method4310("sl_arrows", "");
        arg1.method4310("sl_stars", "");
        arg1.method4310("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ea.l(Lik;Lik;ZII)V")
    public static void method2952(class250 arg0, class250 arg1, boolean arg2, int arg3) {
        if (!Statics.field1159) {
            field1162 = arg3;
            class320.method5453();
            byte[] var4 = arg0.method4309("title.jpg", "");
            Statics.field1170 = class44.method651(var4);
            Statics.field212 = Statics.field1170.method5572();
            if ((client.field631 & 0x20000000) == 0) {
                Statics.field1081 = class325.method2940(arg1, "logo", "");
            } else {
                Statics.field1081 = class325.method2940(arg1, "logo_deadman_mode", "");
            }
            Statics.field1145 = class325.method2940(arg1, "titlebox", "");
            Statics.field1138 = class325.method2940(arg1, "titlebutton", "");
            int var5 = arg1.method4312("runes");
            int var6 = arg1.method4291(var5, "");
            class323[] var7 = class325.method1631(arg1, var5, var6);
            Statics.field24 = var7;
            int var8 = arg1.method4312("title_mute");
            int var9 = arg1.method4291(var8, "");
            class323[] var10 = class325.method1631(arg1, var8, var9);
            Statics.field3843 = var10;
            Statics.field1140 = class325.method2940(arg1, "options_radio_buttons,0", "");
            Statics.field132 = class325.method2940(arg1, "options_radio_buttons,4", "");
            Statics.field517 = class325.method2940(arg1, "options_radio_buttons,2", "");
            Statics.field244 = class325.method2940(arg1, "options_radio_buttons,6", "");
            Statics.field392 = Statics.field1140.field3865;
            Statics.field69 = Statics.field1140.field3868;
            Statics.field273 = new int[256];
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field273[var11] = var11 * 262144;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field273[var12 + 64] = var12 * 1024 + 16711680;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field273[var13 + 128] = var13 * 4 + 16776960;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field273[var14 + 192] = 16777215;
            }
            Statics.field477 = new int[256];
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field477[var15] = var15 * 1024;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field477[var16 + 64] = var16 * 4 + 65280;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field477[var17 + 128] = var17 * 262144 + 65535;
            }
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field477[var18 + 192] = 16777215;
            }
            Statics.field1132 = new int[256];
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field1132[var19] = var19 * 4;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field1132[var20 + 64] = var20 * 262144 + 255;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field1132[var21 + 128] = var21 * 1024 + 16711935;
            }
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field1132[var22 + 192] = 16777215;
            }
            Statics.field515 = new int[256];
            Statics.field1109 = new int[32768];
            Statics.field401 = new int[32768];
            Statics.method441((class323) null);
            Statics.field2120 = new int[32768];
            Statics.field472 = new int[32768];
            if (arg2) {
                field1150 = "";
                field1160 = "";
            }
            Statics.field2344 = 0;
            Statics.field112 = "";
            field1163 = true;
            field1167 = false;
            if (Statics.field141.field1016) {
                class220.method2909(2);
            } else {
                class252 var23 = Statics.field905;
                int var24 = var23.method4312("scape main");
                int var25 = var23.method4291(var24, "");
                class220.method606(2, var23, var24, var25, 255, false);
            }
            Statics.method5182(false);
            Statics.field1159 = true;
            field1171 = (Statics.field2652 - 765) / 2;
            field1152 = field1171 + 202;
            Statics.field2333 = field1152 + 180;
            Statics.field1170.method5565(field1171, 0);
            Statics.field212.method5565(field1171 + 382, 0);
            Statics.field1081.method5539(field1171 + 382 - Statics.field1081.field3865 / 2, 18);
        } else if (arg3 == 4) {
            field1162 = 4;
        }
    }

    @ObfuscatedName("dt.w(I)V")
    public static void method2171() {
        if (field1150 != null && field1150.length() > 0) {
            return;
        }
        if (Statics.field141.field1019 == null) {
            client.field669 = false;
        } else {
            field1150 = Statics.field141.field1019;
            client.field669 = true;
        }
    }

    @ObfuscatedName("ae.s(S)V")
    public static void method653() {
        if (client.field669 && field1150 != null && field1150.length() > 0) {
            field1164 = 1;
        } else {
            field1164 = 0;
        }
    }

    @ObfuscatedName("fa.e(Lah;I)V")
    public static void method3307(class48 arg0) {
        if (field1167) {
            method443(arg0);
            return;
        }
        if ((class49.field468 == 1 || !Statics.field43 && class49.field468 == 4) && class49.field466 >= field1171 + 765 - 50 && class49.field470 >= 453) {
            Statics.field141.field1016 = !Statics.field141.field1016;
            class68.method614();
            if (Statics.field141.field1016) {
                Statics.field2536.method3945();
                class220.field2534 = 1;
                Statics.field2358 = null;
            } else {
                class220.method71(Statics.field905, "scape main", "", 255, false);
            }
        }
        if (client.field638 == 5) {
            return;
        }
        if (field1169 == -1L) {
            field1169 = Statics.method1926() + 1000L;
        }
        long var1 = Statics.method1926();
        boolean var4;
        if (client.field747 == null || client.field901 >= client.field747.size()) {
            var4 = true;
        } else {
            while (true) {
                if (client.field901 >= client.field747.size()) {
                    var4 = true;
                    break;
                }
                class54 var3 = (class54) client.field747.get(client.field901);
                if (!var3.method955()) {
                    var4 = false;
                    break;
                }
                client.field901++;
            }
        }
        if (var4 && field1154 == -1L) {
            field1154 = var1;
            if (field1154 > field1169) {
                field1169 = field1154;
            }
        }
        field1148++;
        if (client.field638 != 10 && client.field638 != 11) {
            return;
        }
        if (client.field635 == 0) {
            if (class49.field468 == 1 || !Statics.field43 && class49.field468 == 4) {
                int var5 = field1171 + 5;
                short var6 = 463;
                byte var7 = 100;
                byte var8 = 35;
                if (class49.field466 >= var5 && class49.field466 <= var5 + var7 && class49.field470 >= var6 && class49.field470 <= var6 + var8) {
                    if (class67.method607()) {
                        field1167 = true;
                    }
                    return;
                }
            }
            if (Statics.field1254 != null && class67.method607()) {
                field1167 = true;
            }
        }
        int var9 = class49.field468;
        int var10 = class49.field466;
        int var11 = class49.field470;
        if (var9 == 0) {
            var10 = class49.field461;
            var11 = class49.field462;
        }
        if (!Statics.field43 && var9 == 4) {
            var9 = 1;
        }
        if (field1162 == 0) {
            boolean var12 = false;
            while (class40.method3233()) {
                if (Statics.field241 == 84) {
                    var12 = true;
                }
            }
            int var13 = Statics.field2333 - 80;
            short var14 = 291;
            if (var9 == 1 && var10 >= var13 - 75 && var10 <= var13 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20) {
                class46.method5698(client.method4110("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var15 = Statics.field2333 + 80;
            if (var9 == 1 && var10 >= var15 - 75 && var10 <= var15 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20 || var12) {
                if ((client.field631 & 0x2000000) != 0) {
                    field1155 = "";
                    field1156 = class240.field3085;
                    field1157 = class240.field3086;
                    field1158 = class240.field3087;
                    field1162 = 1;
                    method653();
                } else if ((client.field631 & 0x4) != 0) {
                    if ((client.field631 & 0x400) == 0) {
                        field1156 = class240.field3076;
                        field1157 = class240.field3077;
                        field1158 = class240.field3044;
                    } else {
                        field1156 = class240.field3082;
                        field1157 = class240.field3083;
                        field1158 = class240.field3084;
                    }
                    field1155 = class240.field2976;
                    field1162 = 1;
                    method653();
                } else if ((client.field631 & 0x400) == 0) {
                    method59(false);
                } else {
                    field1156 = class240.field3079;
                    field1157 = class240.field3067;
                    field1158 = class240.field3107;
                    field1155 = class240.field2976;
                    field1162 = 1;
                    method653();
                }
            }
        } else if (field1162 == 1) {
            while (class40.method3233()) {
                if (Statics.field241 == 84) {
                    method59(false);
                } else if (Statics.field241 == 13) {
                    field1162 = 0;
                }
            }
            int var16 = Statics.field2333 - 80;
            short var17 = 321;
            if (var9 == 1 && var10 >= var16 - 75 && var10 <= var16 + 75 && var11 >= var17 - 20 && var11 <= var17 + 20) {
                method59(false);
            }
            int var18 = Statics.field2333 + 80;
            if (var9 == 1 && var10 >= var18 - 75 && var10 <= var18 + 75 && var11 >= var17 - 20 && var11 <= var17 + 20) {
                field1162 = 0;
            }
        } else if (field1162 == 2) {
            short var19 = 201;
            int var57 = var19 + 52;
            if (var9 == 1 && var11 >= var57 - 12 && var11 < var57 + 2) {
                field1164 = 0;
            }
            var57 += 15;
            if (var9 == 1 && var11 >= var57 - 12 && var11 < var57 + 2) {
                field1164 = 1;
            }
            var57 += 15;
            short var20 = 361;
            if (Statics.field3798 != null) {
                int var21 = Statics.field3798.field3830 / 2;
                if (var9 == 1 && var10 >= Statics.field3798.field3828 - var21 && var10 <= Statics.field3798.field3828 + var21 && var11 >= var20 - 15 && var11 < var20) {
                    switch(field1153) {
                        case 1:
                            method898(class240.field2876, class240.field2857, class240.field3119);
                            field1162 = 5;
                            return;
                        case 2:
                            class46.method5698("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var22 = Statics.field2333 - 80;
            short var23 = 321;
            if (var9 == 1 && var10 >= var22 - 75 && var10 <= var22 + 75 && var11 >= var23 - 20 && var11 <= var23 + 20) {
                field1150 = field1150.trim();
                if (field1150.length() == 0) {
                    method898(class240.field3143, class240.field2978, class240.field2984);
                    return;
                }
                if (field1160.length() == 0) {
                    method898(class240.field2871, class240.field2981, class240.field2925);
                    return;
                }
                method898(class240.field3090, class240.field3091, class240.field3092);
                client.method4990(false);
                client.method34(20);
                return;
            }
            int var24 = field1152 + 180 + 80;
            if (var9 == 1 && var10 >= var24 - 75 && var10 <= var24 + 75 && var11 >= var23 - 20 && var11 <= var23 + 20) {
                field1162 = 0;
                field1150 = "";
                field1160 = "";
                Statics.field2344 = 0;
                Statics.field112 = "";
                field1163 = true;
            }
            int var25 = Statics.field2333 + -117;
            short var26 = 277;
            field1161 = var10 >= var25 && var10 < Statics.field392 + var25 && var11 >= var26 && var11 < Statics.field69 + var26;
            if (var9 == 1 && field1161) {
                client.field669 = !client.field669;
                if (!client.field669 && Statics.field141.field1019 != null) {
                    Statics.field141.field1019 = null;
                    class68.method614();
                }
            }
            int var27 = Statics.field2333 + 24;
            short var28 = 277;
            field1136 = var10 >= var27 && var10 < Statics.field392 + var27 && var11 >= var28 && var11 < Statics.field69 + var28;
            if (var9 == 1 && field1136) {
                Statics.field141.field1022 = !Statics.field141.field1022;
                if (!Statics.field141.field1022) {
                    field1150 = "";
                    Statics.field141.field1019 = null;
                    method653();
                }
                class68.method614();
            }
            while (true) {
                while (class40.method3233()) {
                    boolean var29 = false;
                    for (int var30 = 0; var30 < field1165.length(); var30++) {
                        if (Statics.field3345 == field1165.charAt(var30)) {
                            var29 = true;
                            break;
                        }
                    }
                    if (Statics.field241 == 13) {
                        field1162 = 0;
                        field1150 = "";
                        field1160 = "";
                        Statics.field2344 = 0;
                        Statics.field112 = "";
                        field1163 = true;
                    } else if (field1164 == 0) {
                        if (Statics.field241 == 85 && field1150.length() > 0) {
                            field1150 = field1150.substring(0, field1150.length() - 1);
                        }
                        if (Statics.field241 == 84 || Statics.field241 == 80) {
                            field1164 = 1;
                        }
                        if (var29 && field1150.length() < 320) {
                            field1150 = field1150 + Statics.field3345;
                        }
                    } else if (field1164 == 1) {
                        if (Statics.field241 == 85 && field1160.length() > 0) {
                            field1160 = field1160.substring(0, field1160.length() - 1);
                        }
                        if (Statics.field241 == 84 || Statics.field241 == 80) {
                            field1164 = 0;
                        }
                        if (Statics.field241 == 84) {
                            field1150 = field1150.trim();
                            if (field1150.length() == 0) {
                                method898(class240.field3143, class240.field2978, class240.field2984);
                                return;
                            }
                            if (field1160.length() == 0) {
                                method898(class240.field2871, class240.field2981, class240.field2925);
                                return;
                            }
                            method898(class240.field3090, class240.field3091, class240.field3092);
                            client.method4990(false);
                            client.method34(20);
                            return;
                        }
                        if (var29 && field1160.length() < 20) {
                            field1160 = field1160 + Statics.field3345;
                        }
                    }
                }
                return;
            }
        } else if (field1162 == 3) {
            int var31 = field1152 + 180;
            short var32 = 276;
            if (var9 == 1 && var10 >= var31 - 75 && var10 <= var31 + 75 && var11 >= var32 - 20 && var11 <= var32 + 20) {
                method59(false);
            }
            int var33 = field1152 + 180;
            short var34 = 326;
            if (var9 == 1 && var10 >= var33 - 75 && var10 <= var33 + 75 && var11 >= var34 - 20 && var11 <= var34 + 20) {
                method898(class240.field2876, class240.field2857, class240.field3119);
                field1162 = 5;
                return;
            }
        } else if (field1162 == 4) {
            int var35 = field1152 + 180 - 80;
            short var36 = 321;
            if (var9 == 1 && var10 >= var35 - 75 && var10 <= var35 + 75 && var11 >= var36 - 20 && var11 <= var36 + 20) {
                Statics.field112.trim();
                if (Statics.field112.length() != 6) {
                    method898(class240.field3066, class240.field2897, class240.field2898);
                    return;
                }
                Statics.field2344 = Integer.parseInt(Statics.field112);
                Statics.field112 = "";
                client.method4990(true);
                method898(class240.field3090, class240.field3091, class240.field3092);
                client.method34(20);
                return;
            }
            if (var9 == 1 && var10 >= field1152 + 180 - 9 && var10 <= field1152 + 180 + 130 && var11 >= 263 && var11 <= 296) {
                field1163 = !field1163;
            }
            if (var9 == 1 && var10 >= field1152 + 180 - 34 && var10 <= field1152 + 180 + 34 && var11 >= 351 && var11 <= 363) {
                class46.method5698(client.method4110("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var37 = field1152 + 180 + 80;
            if (var9 == 1 && var10 >= var37 - 75 && var10 <= var37 + 75 && var11 >= var36 - 20 && var11 <= var36 + 20) {
                field1162 = 0;
                field1150 = "";
                field1160 = "";
                Statics.field2344 = 0;
                Statics.field112 = "";
            }
            while (class40.method3233()) {
                boolean var38 = false;
                for (int var39 = 0; var39 < field1166.length(); var39++) {
                    if (Statics.field3345 == field1166.charAt(var39)) {
                        var38 = true;
                        break;
                    }
                }
                if (Statics.field241 == 13) {
                    field1162 = 0;
                    field1150 = "";
                    field1160 = "";
                    Statics.field2344 = 0;
                    Statics.field112 = "";
                } else {
                    if (Statics.field241 == 85 && Statics.field112.length() > 0) {
                        Statics.field112 = Statics.field112.substring(0, Statics.field112.length() - 1);
                    }
                    if (Statics.field241 == 84) {
                        Statics.field112.trim();
                        if (Statics.field112.length() != 6) {
                            method898(class240.field3066, class240.field2897, class240.field2898);
                            return;
                        }
                        Statics.field2344 = Integer.parseInt(Statics.field112);
                        Statics.field112 = "";
                        client.method4990(true);
                        method898(class240.field3090, class240.field3091, class240.field3092);
                        client.method34(20);
                        return;
                    }
                    if (var38 && Statics.field112.length() < 6) {
                        Statics.field112 = Statics.field112 + Statics.field3345;
                    }
                }
            }
        } else if (field1162 == 5) {
            int var40 = field1152 + 180 - 80;
            short var41 = 321;
            if (var9 == 1 && var10 >= var40 - 75 && var10 <= var40 + 75 && var11 >= var41 - 20 && var11 <= var41 + 20) {
                method2938();
                return;
            }
            int var42 = field1152 + 180 + 80;
            if (var9 == 1 && var10 >= var42 - 75 && var10 <= var42 + 75 && var11 >= var41 - 20 && var11 <= var41 + 20) {
                method59(true);
            }
            while (class40.method3233()) {
                boolean var43 = false;
                for (int var44 = 0; var44 < field1165.length(); var44++) {
                    if (Statics.field3345 == field1165.charAt(var44)) {
                        var43 = true;
                        break;
                    }
                }
                if (Statics.field241 == 13) {
                    method59(true);
                } else {
                    if (Statics.field241 == 85 && field1150.length() > 0) {
                        field1150 = field1150.substring(0, field1150.length() - 1);
                    }
                    if (Statics.field241 == 84) {
                        method2938();
                        return;
                    }
                    if (var43 && field1150.length() < 320) {
                        field1150 = field1150 + Statics.field3345;
                    }
                }
            }
        } else if (field1162 == 6) {
            while (true) {
                do {
                    if (!class40.method3233()) {
                        short var45 = 321;
                        if (var9 == 1 && var11 >= var45 - 20 && var11 <= var45 + 20) {
                            method59(true);
                        }
                        return;
                    }
                } while (Statics.field241 != 84 && Statics.field241 != 13);
                method59(true);
            }
        } else if (field1162 == 7) {
            int var46 = field1152 + 180 - 80;
            short var47 = 321;
            if (var9 == 1 && var10 >= var46 - 75 && var10 <= var46 + 75 && var11 >= var47 - 20 && var11 <= var47 + 20) {
                class46.method5698(client.method4110("secure", true) + "m=dob/set_dob.ws", true, false);
                method898(class240.field3114, class240.field3115, class240.field3116);
                field1162 = 6;
                return;
            }
            int var48 = field1152 + 180 + 80;
            if (var9 == 1 && var10 >= var48 - 75 && var10 <= var48 + 75 && var11 >= var47 - 20 && var11 <= var47 + 20) {
                method59(true);
            }
        } else if (field1162 == 8) {
            int var49 = field1152 + 180 - 80;
            short var50 = 321;
            if (var9 == 1 && var10 >= var49 - 75 && var10 <= var49 + 75 && var11 >= var50 - 20 && var11 <= var50 + 20) {
                class46.method5698("https://www.jagex.com/terms/privacy/#eight", true, false);
                method898(class240.field3114, class240.field3115, class240.field3116);
                field1162 = 6;
                return;
            }
            int var51 = field1152 + 180 + 80;
            if (var9 == 1 && var10 >= var51 - 75 && var10 <= var51 + 75 && var11 >= var50 - 20 && var11 <= var50 + 20) {
                method59(true);
            }
        } else if (field1162 == 12) {
            String var52 = "";
            switch(field1135) {
                case 0:
                    var52 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var52 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method59(false);
            }
            int var53 = field1152 + 180;
            short var54 = 276;
            if (var9 == 1 && var10 >= var53 - 75 && var10 <= var53 + 75 && var11 >= var54 - 20 && var11 <= var54 + 20) {
                class46.method5698(var52, true, false);
                method898(class240.field3114, class240.field3115, class240.field3116);
                field1162 = 6;
                return;
            }
            int var55 = field1152 + 180;
            short var56 = 326;
            if (var9 == 1 && var10 >= var55 - 75 && var10 <= var55 + 75 && var11 >= var56 - 20 && var11 <= var56 + 20) {
                method59(false);
            }
        }
    }

    @ObfuscatedName("a.c(ZI)V")
    public static void method59(boolean arg0) {
        field1156 = class240.field3072;
        field1157 = class240.field3118;
        field1158 = class240.field2993;
        field1162 = 2;
        if (arg0) {
            field1160 = "";
        }
        method2171();
        method653();
    }

    @ObfuscatedName("es.p(I)V")
    public static void method2938() {
        field1150 = field1150.trim();
        if (field1150.length() == 0) {
            method898(class240.field2876, class240.field2857, class240.field3119);
            return;
        }
        long var0 = Statics.method978();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1150;
            Random var4 = new Random();
            class185 var5 = new class185(128);
            class185 var6 = new class185(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3376(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3422(var4.nextInt());
            }
            var5.method3422(var7[0]);
            var5.method3422(var7[1]);
            var5.method3334(var0);
            var5.method3334(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3422(var4.nextInt());
            }
            var5.method3367(class75.field1099, class75.field1093);
            var6.method3376(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3422(var4.nextInt());
            }
            var6.method3334(var4.nextLong());
            var6.method3459(var4.nextLong());
            if (client.field731 == null) {
                byte[] var11 = new byte[24];
                try {
                    class158.field2035.method2368(0L);
                    class158.field2035.method2354(var11);
                    int var12;
                    for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                    }
                    if (var12 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var34) {
                    for (int var14 = 0; var14 < 24; var14++) {
                        var11[var14] = -1;
                    }
                }
                var6.method3339(var11, 0, var11.length);
            } else {
                var6.method3339(client.field731, 0, client.field731.length);
            }
            var6.method3334(var4.nextLong());
            var6.method3367(class75.field1099, class75.field1093);
            int var17 = class185.method3075(var3);
            if (var17 % 8 != 0) {
                var17 += 8 - var17 % 8;
            }
            class185 var18 = new class185(var17);
            var18.method3446(var3);
            var18.field2414 = var17;
            var18.method3363(var7);
            class185 var19 = new class185(var18.field2414 + var6.field2414 + var5.field2414 + 5);
            var19.method3376(2);
            var19.method3376(var5.field2414);
            var19.method3339(var5.field2415, 0, var5.field2414);
            var19.method3376(var6.field2414);
            var19.method3339(var6.field2415, 0, var6.field2414);
            var19.method3330(var18.field2414);
            var19.method3339(var18.field2415, 0, var18.field2414);
            byte[] var20 = var19.field2415;
            String var21 = class307.method950(var20, 0, var20.length);
            String var22 = var21;
            byte var29;
            try {
                URL var23 = new URL(client.method4110("services", false) + "m=accountappeal/login.ws");
                URLConnection var24 = var23.openConnection();
                var24.setDoInput(true);
                var24.setDoOutput(true);
                var24.setConnectTimeout(5000);
                OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
                var25.write("data2=" + class333.method3571(var22) + "&dest=" + class333.method3571("passwordchoice.ws"));
                var25.flush();
                InputStream var26 = var24.getInputStream();
                class185 var27 = new class185(new byte[1000]);
                while (true) {
                    int var28 = var26.read(var27.field2415, var27.field2414, 1000 - var27.field2414);
                    if (var28 == -1) {
                        var25.close();
                        var26.close();
                        String var30 = new String(var27.field2415);
                        if (var30.startsWith("OFFLINE")) {
                            var29 = 4;
                        } else if (var30.startsWith("WRONG")) {
                            var29 = 7;
                        } else if (var30.startsWith("RELOAD")) {
                            var29 = 3;
                        } else if (var30.startsWith("Not permitted for social network accounts.")) {
                            var29 = 6;
                        } else {
                            var27.method3364(var7);
                            while (var27.field2414 > 0 && var27.field2415[var27.field2414 - 1] == 0) {
                                var27.field2414--;
                            }
                            String var31 = new String(var27.field2415, 0, var27.field2414);
                            if (Statics.method278(var31)) {
                                class46.method5698(var31, true, false);
                                var29 = 2;
                            } else {
                                var29 = 5;
                            }
                        }
                        break;
                    }
                    var27.field2414 += var28;
                    if (var27.field2414 >= 1000) {
                        var29 = 5;
                        break;
                    }
                }
            } catch (Throwable var33) {
                var33.printStackTrace();
                var29 = 5;
            }
            var2 = var29;
        }
        switch(var2) {
            case 2:
                method898(class240.field3120, class240.field2886, class240.field3122);
                field1162 = 6;
                break;
            case 3:
                method898(class240.field3123, class240.field3124, class240.field2895);
                break;
            case 4:
                method898(class240.field3126, class240.field3127, class240.field3130);
                break;
            case 5:
                method898(class240.field3129, class240.field2954, class240.field3131);
                break;
            case 6:
                method898(class240.field3132, class240.field3040, class240.field3134);
                break;
            case 7:
                method898(class240.field3064, class240.field3136, class240.field2943);
        }
    }

    @ObfuscatedName("z.r(Lkn;Lkn;Lkn;ZI)V")
    public static void method109(class301 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg3) {
            field1171 = (Statics.field2652 - 765) / 2;
            field1152 = field1171 + 202;
            Statics.field2333 = field1152 + 180;
        }
        if (field1167) {
            method1493(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1170.method5565(field1171, 0);
            Statics.field212.method5565(field1171 + 382, 0);
            Statics.field1081.method5539(field1171 + 382 - Statics.field1081.field3865 / 2, 18);
        }
        if (client.field638 == 0 || client.field638 == 5) {
            byte var4 = 20;
            arg0.method5267(class240.field3071, field1152 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class320.method5465(field1152 + 180 - 152, var5, 304, 34, 9179409);
            class320.method5465(field1152 + 180 - 151, var5 + 1, 302, 32, 0);
            class320.method5483(field1152 + 180 - 150, var5 + 2, field1139 * 3, 30, 9179409);
            class320.method5483(field1139 * 3 + (field1152 + 180 - 150), var5 + 2, 300 - field1139 * 3, 30, 0);
            arg0.method5267(field1151, field1152 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field638 == 20) {
            Statics.field1145.method5539(field1152 + 180 - Statics.field1145.field3865 / 2, 271 - Statics.field1145.field3868 / 2);
            short var6 = 201;
            arg0.method5267(field1156, field1152 + 180, var6, 16776960, 0);
            int var126 = var6 + 15;
            arg0.method5267(field1157, field1152 + 180, var126, 16776960, 0);
            int var127 = var126 + 15;
            arg0.method5267(field1158, field1152 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            int var129 = var128 + 7;
            if (field1162 != 4) {
                arg0.method5225(class240.field2911, field1152 + 180 - 110, var129, 16777215, 0);
                short var7 = 200;
                String var14;
                if (Statics.field141.field1022) {
                    String var8 = field1150;
                    int var9 = var8.length();
                    char[] var10 = new char[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = '*';
                    }
                    String var12 = new String(var10);
                    var14 = var12;
                } else {
                    var14 = field1150;
                }
                String var16;
                for (var16 = var14; arg0.method5278(var16) > var7; var16 = var16.substring(0, var16.length() - 1)) {
                }
                arg0.method5225(class302.method5208(var16), field1152 + 180 - 70, var129, 16777215, 0);
                var126 = var129 + 15;
                String var18 = class240.field3094;
                String var19 = field1160;
                int var20 = var19.length();
                char[] var21 = new char[var20];
                for (int var22 = 0; var22 < var20; var22++) {
                    var21[var22] = '*';
                }
                String var23 = new String(var21);
                arg0.method5225(var18 + var23, field1152 + 180 - 108, var126, 16777215, 0);
                var126 += 15;
            }
        }
        if (client.field638 == 10 || client.field638 == 11) {
            Statics.field1145.method5539(field1152, 171);
            if (field1162 == 0) {
                short var25 = 251;
                arg0.method5267(class240.field3096, field1152 + 180, var25, 16776960, 0);
                int var130 = var25 + 30;
                int var26 = field1152 + 180 - 80;
                short var27 = 291;
                Statics.field1138.method5539(var26 - 73, var27 - 20);
                arg0.method5257(class240.field3097, var26 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var28 = field1152 + 180 + 80;
                Statics.field1138.method5539(var28 - 73, var27 - 20);
                arg0.method5257(class240.field3098, var28 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1162 == 1) {
                arg0.method5267(field1155, field1152 + 180, 201, 16776960, 0);
                short var29 = 236;
                arg0.method5267(field1156, field1152 + 180, var29, 16777215, 0);
                int var131 = var29 + 15;
                arg0.method5267(field1157, field1152 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method5267(field1158, field1152 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                int var30 = field1152 + 180 - 80;
                short var31 = 321;
                Statics.field1138.method5539(var30 - 73, var31 - 20);
                arg0.method5267(class240.field2973, var30, var31 + 5, 16777215, 0);
                int var32 = field1152 + 180 + 80;
                Statics.field1138.method5539(var32 - 73, var31 - 20);
                arg0.method5267(class240.field3100, var32, var31 + 5, 16777215, 0);
            } else if (field1162 == 2) {
                short var33 = 201;
                arg0.method5267(field1156, Statics.field2333, var33, 16776960, 0);
                int var134 = var33 + 15;
                arg0.method5267(field1157, Statics.field2333, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method5267(field1158, Statics.field2333, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 7;
                arg0.method5225(class240.field2911, Statics.field2333 - 110, var137, 16777215, 0);
                short var34 = 200;
                String var41;
                if (Statics.field141.field1022) {
                    String var35 = field1150;
                    int var36 = var35.length();
                    char[] var37 = new char[var36];
                    for (int var38 = 0; var38 < var36; var38++) {
                        var37[var38] = '*';
                    }
                    String var39 = new String(var37);
                    var41 = var39;
                } else {
                    var41 = field1150;
                }
                String var43;
                for (var43 = var41; arg0.method5278(var43) > var34; var43 = var43.substring(1)) {
                }
                arg0.method5225(class302.method5208(var43) + (field1164 == 0 & client.field642 % 40 < 20 ? class76.method2910(16776960) + class76.field1110 : ""), Statics.field2333 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                String var45 = class240.field3094;
                String var46 = field1160;
                int var47 = var46.length();
                char[] var48 = new char[var47];
                for (int var49 = 0; var49 < var47; var49++) {
                    var48[var49] = '*';
                }
                String var50 = new String(var48);
                arg0.method5225(var45 + var50 + (field1164 == 1 & client.field642 % 40 < 20 ? class76.method2910(16776960) + class76.field1110 : ""), Statics.field2333 - 108, var134, 16777215, 0);
                var134 += 15;
                short var52 = 277;
                int var53 = Statics.field2333 + -117;
                boolean var54 = client.field669;
                boolean var55 = field1161;
                class323 var56 = var54 ? (var55 ? Statics.field244 : Statics.field517) : (var55 ? Statics.field132 : Statics.field1140);
                var56.method5539(var53, var52);
                int var58 = var56.field3865 + 5 + var53;
                arg1.method5225(class240.field2867, var58, var52 + 13, 16776960, 0);
                int var59 = Statics.field2333 + 24;
                boolean var60 = Statics.field141.field1022;
                boolean var61 = field1136;
                class323 var62 = var60 ? (var61 ? Statics.field244 : Statics.field517) : (var61 ? Statics.field132 : Statics.field1140);
                var62.method5539(var59, var52);
                int var64 = var62.field3865 + 5 + var59;
                arg1.method5225(class240.field3102, var64, var52 + 13, 16776960, 0);
                int var138 = var52 + 15;
                int var65 = Statics.field2333 - 80;
                short var66 = 321;
                Statics.field1138.method5539(var65 - 73, var66 - 20);
                arg0.method5267(class240.field3099, var65, var66 + 5, 16777215, 0);
                int var67 = Statics.field2333 + 80;
                Statics.field1138.method5539(var67 - 73, var66 - 20);
                arg0.method5267(class240.field3100, var67, var66 + 5, 16777215, 0);
                short var68 = 357;
                switch(field1153) {
                    case 2:
                        Statics.field1635 = class240.field3113;
                        break;
                    default:
                        Statics.field1635 = class240.field3112;
                }
                Statics.field3798 = new class316(Statics.field2333, var68, arg1.method5278(Statics.field1635), 11);
                arg1.method5267(Statics.field1635, Statics.field2333, var68, 16777215, 0);
            } else if (field1162 == 3) {
                short var69 = 201;
                arg0.method5267(class240.field3103, field1152 + 180, var69, 16776960, 0);
                int var139 = var69 + 20;
                arg1.method5267(class240.field3058, field1152 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                arg1.method5267(class240.field3105, field1152 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                int var70 = field1152 + 180;
                short var71 = 276;
                Statics.field1138.method5539(var70 - 73, var71 - 20);
                arg2.method5267(class240.field3106, var70, var71 + 5, 16777215, 0);
                int var72 = field1152 + 180;
                short var73 = 326;
                Statics.field1138.method5539(var72 - 73, var73 - 20);
                arg2.method5267(class240.field2946, var72, var73 + 5, 16777215, 0);
            } else if (field1162 == 4) {
                arg0.method5267(class240.field3088, field1152 + 180, 201, 16776960, 0);
                short var74 = 236;
                arg0.method5267(field1156, field1152 + 180, var74, 16777215, 0);
                int var142 = var74 + 15;
                arg0.method5267(field1157, field1152 + 180, var142, 16777215, 0);
                int var143 = var142 + 15;
                arg0.method5267(field1158, field1152 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                String var76 = class240.field3095;
                String var77 = Statics.field112;
                int var78 = var77.length();
                char[] var79 = new char[var78];
                for (int var80 = 0; var80 < var78; var80++) {
                    var79[var80] = '*';
                }
                String var81 = new String(var79);
                arg0.method5225(var76 + var81 + (client.field642 % 40 < 20 ? class76.method2910(16776960) + class76.field1110 : ""), field1152 + 180 - 108, var144, 16777215, 0);
                var142 = var144 - 8;
                arg0.method5225(class240.field2866, field1152 + 180 - 9, var142, 16776960, 0);
                var142 += 15;
                arg0.method5225(class240.field2985, field1152 + 180 - 9, var142, 16776960, 0);
                int var83 = field1152 + 180 - 9 + arg0.method5278(class240.field2985) + 15;
                int var84 = var142 - arg0.field3762;
                class323 var85;
                if (field1163) {
                    var85 = Statics.field517;
                } else {
                    var85 = Statics.field1140;
                }
                var85.method5539(var83, var84);
                var142 += 15;
                int var86 = field1152 + 180 - 80;
                short var87 = 321;
                Statics.field1138.method5539(var86 - 73, var87 - 20);
                arg0.method5267(class240.field2973, var86, var87 + 5, 16777215, 0);
                int var88 = field1152 + 180 + 80;
                Statics.field1138.method5539(var88 - 73, var87 - 20);
                arg0.method5267(class240.field3100, var88, var87 + 5, 16777215, 0);
                arg1.method5267(class240.field2885, field1152 + 180, var87 + 36, 255, 0);
            } else if (field1162 == 5) {
                arg0.method5267(class240.field3055, field1152 + 180, 201, 16776960, 0);
                short var89 = 221;
                arg2.method5267(field1156, field1152 + 180, var89, 16776960, 0);
                int var145 = var89 + 15;
                arg2.method5267(field1157, field1152 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                arg2.method5267(field1158, field1152 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                int var148 = var147 + 14;
                arg0.method5225(class240.field2974, field1152 + 180 - 145, var148, 16777215, 0);
                short var90 = 174;
                String var97;
                if (Statics.field141.field1022) {
                    String var91 = field1150;
                    int var92 = var91.length();
                    char[] var93 = new char[var92];
                    for (int var94 = 0; var94 < var92; var94++) {
                        var93[var94] = '*';
                    }
                    String var95 = new String(var93);
                    var97 = var95;
                } else {
                    var97 = field1150;
                }
                String var99;
                for (var99 = var97; arg0.method5278(var99) > var90; var99 = var99.substring(1)) {
                }
                arg0.method5225(class302.method5208(var99) + (client.field642 % 40 < 20 ? class76.method2910(16776960) + class76.field1110 : ""), field1152 + 180 - 34, var148, 16777215, 0);
                var145 = var148 + 15;
                int var100 = field1152 + 180 - 80;
                short var101 = 321;
                Statics.field1138.method5539(var100 - 73, var101 - 20);
                arg0.method5267(class240.field3110, var100, var101 + 5, 16777215, 0);
                int var102 = field1152 + 180 + 80;
                Statics.field1138.method5539(var102 - 73, var101 - 20);
                arg0.method5267(class240.field3074, var102, var101 + 5, 16777215, 0);
            } else if (field1162 == 6) {
                short var103 = 201;
                arg0.method5267(field1156, field1152 + 180, var103, 16776960, 0);
                int var149 = var103 + 15;
                arg0.method5267(field1157, field1152 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method5267(field1158, field1152 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                int var104 = field1152 + 180;
                short var105 = 321;
                Statics.field1138.method5539(var104 - 73, var105 - 20);
                arg0.method5267(class240.field3074, var104, var105 + 5, 16777215, 0);
            } else if (field1162 == 7) {
                short var106 = 216;
                arg0.method5267(class240.field3138, field1152 + 180, var106, 16776960, 0);
                int var152 = var106 + 15;
                arg2.method5267(class240.field3139, field1152 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                arg2.method5267(class240.field2896, field1152 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                int var107 = field1152 + 180 - 80;
                short var108 = 321;
                Statics.field1138.method5539(var107 - 73, var108 - 20);
                arg0.method5267(class240.field3141, var107, var108 + 5, 16777215, 0);
                int var109 = field1152 + 180 + 80;
                Statics.field1138.method5539(var109 - 73, var108 - 20);
                arg0.method5267(class240.field3074, var109, var108 + 5, 16777215, 0);
            } else if (field1162 == 8) {
                short var110 = 216;
                arg0.method5267(class240.field2995, field1152 + 180, var110, 16776960, 0);
                int var155 = var110 + 15;
                arg2.method5267(class240.field2996, field1152 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg2.method5267(class240.field3093, field1152 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var111 = field1152 + 180 - 80;
                short var112 = 321;
                Statics.field1138.method5539(var111 - 73, var112 - 20);
                arg0.method5267(class240.field2998, var111, var112 + 5, 16777215, 0);
                int var113 = field1152 + 180 + 80;
                Statics.field1138.method5539(var113 - 73, var112 - 20);
                arg0.method5267(class240.field3074, var113, var112 + 5, 16777215, 0);
            } else if (field1162 == 12) {
                short var114 = 201;
                String var115 = "";
                String var116 = "";
                String var117 = "";
                switch(field1135) {
                    case 0:
                        var115 = class240.field2858;
                        var116 = class240.field2912;
                        var117 = class240.field2913;
                        break;
                    case 1:
                        var115 = class240.field2950;
                        var116 = class240.field2951;
                        var117 = class240.field2952;
                        break;
                    default:
                        method59(false);
                }
                arg0.method5267(var115, field1152 + 180, var114, 16776960, 0);
                int var158 = var114 + 15;
                arg2.method5267(var116, field1152 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg2.method5267(var117, field1152 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var118 = field1152 + 180;
                short var119 = 276;
                Statics.field1138.method5539(var118 - 73, var119 - 20);
                arg0.method5267(class240.field2939, var118, var119 + 5, 16777215, 0);
                int var120 = field1152 + 180;
                short var121 = 326;
                Statics.field1138.method5539(var120 - 73, var121 - 20);
                arg0.method5267(class240.field3074, var120, var121 + 5, 16777215, 0);
            }
        }
        if (field1148 > 0) {
            Statics.method519(field1148);
            field1148 = 0;
        }
        method3187();
        Statics.field3843[Statics.field141.field1016 ? 1 : 0].method5539(field1171 + 765 - 40, 463);
        if (client.field638 <= 5 || client.field635 != 0) {
            return;
        }
        if (Statics.field337 == null) {
            Statics.field337 = class325.method2940(Statics.field13, "sl_button", "");
            return;
        }
        int var122 = field1171 + 5;
        short var123 = 463;
        byte var124 = 100;
        byte var125 = 35;
        Statics.field337.method5539(var122, var123);
        arg0.method5267(class240.field2982 + " " + client.field683, var124 / 2 + var122, var125 / 2 + var123 - 2, 16777215, 0);
        if (Statics.field1254 == null) {
            arg1.method5267(class240.field3034, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        } else {
            arg1.method5267(class240.field3151, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ai.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method898(String arg0, String arg1, String arg2) {
        field1156 = arg0;
        field1157 = arg1;
        field1158 = arg2;
    }

    @ObfuscatedName("cf.x(IIII)I")
    public static final int method1779(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fe.v(B)V")
    public static final void method3187() {
        short var0 = 256;
        if (field1144 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1144 > 768) {
                    Statics.field515[var1] = method1779(Statics.field273[var1], Statics.field477[var1], 1024 - field1144);
                } else if (field1144 > 256) {
                    Statics.field515[var1] = Statics.field477[var1];
                } else {
                    Statics.field515[var1] = method1779(Statics.field477[var1], Statics.field273[var1], 256 - field1144);
                }
            }
        } else if (field1149 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1149 > 768) {
                    Statics.field515[var2] = method1779(Statics.field273[var2], Statics.field1132[var2], 1024 - field1149);
                } else if (field1149 > 256) {
                    Statics.field515[var2] = Statics.field1132[var2];
                } else {
                    Statics.field515[var2] = method1779(Statics.field1132[var2], Statics.field273[var2], 256 - field1149);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field515[var3] = Statics.field273[var3];
            }
        }
        class320.method5454(field1171, 9, field1171 + 128, var0 + 7);
        Statics.field1170.method5565(field1171, 0);
        class320.method5467();
        int var4 = 0;
        int var5 = field1171 + Statics.field1916.field3856 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1143[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2120[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field515[var10];
                    int var14 = Statics.field1916.field3857[var5];
                    Statics.field1916.field3857[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field1916.field3856 + var8 - 128;
        }
        class320.method5454(field1171 + 765 - 128, 9, field1171 + 765, var0 + 7);
        Statics.field212.method5565(field1171 + 382, 0);
        class320.method5467();
        int var15 = 0;
        int var16 = field1171 + Statics.field1916.field3856 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1143[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2120[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field515[var22];
                    int var26 = Statics.field1916.field3857[var20];
                    Statics.field1916.field3857[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1916.field3856 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bn.g(Lkn;Lkn;I)V")
    public static void method1493(class301 arg0, class301 arg1) {
        if (Statics.field255 == null) {
            class252 var2 = Statics.field13;
            int var3 = var2.method4312("sl_back");
            int var4 = var2.method4291(var3, "");
            class324[] var5 = class325.method900(var2, var3, var4);
            Statics.field255 = var5;
        }
        if (Statics.field281 == null) {
            class252 var6 = Statics.field13;
            int var7 = var6.method4312("sl_flags");
            int var8 = var6.method4291(var7, "");
            class323[] var9 = class325.method1631(var6, var7, var8);
            Statics.field281 = var9;
        }
        if (Statics.field1515 == null) {
            class252 var10 = Statics.field13;
            int var11 = var10.method4312("sl_arrows");
            int var12 = var10.method4291(var11, "");
            class323[] var13 = class325.method1631(var10, var11, var12);
            Statics.field1515 = var13;
        }
        if (Statics.field1920 == null) {
            class252 var14 = Statics.field13;
            int var15 = var14.method4312("sl_stars");
            int var16 = var14.method4291(var15, "");
            class323[] var17 = class325.method1631(var14, var15, var16);
            Statics.field1920 = var17;
        }
        class320.method5483(field1171, 23, 765, 480, 0);
        class320.method5458(field1171, 0, 125, 23, 12425273, 9135624);
        class320.method5458(field1171 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5267(class240.field3026, field1171 + 62, 15, 0, -1);
        if (Statics.field1920 != null) {
            Statics.field1920[1].method5539(field1171 + 140, 1);
            arg1.method5225(class240.field3063, field1171 + 152, 10, 16777215, -1);
            Statics.field1920[0].method5539(field1171 + 140, 12);
            arg1.method5225(class240.field3144, field1171 + 152, 21, 16777215, -1);
        }
        if (Statics.field1515 != null) {
            int var18 = field1171 + 280;
            if (class67.field1001[0] == 0 && class67.field1000[0] == 0) {
                Statics.field1515[2].method5539(var18, 4);
            } else {
                Statics.field1515[0].method5539(var18, 4);
            }
            if (class67.field1001[0] == 0 && class67.field1000[0] == 1) {
                Statics.field1515[3].method5539(var18 + 15, 4);
            } else {
                Statics.field1515[1].method5539(var18 + 15, 4);
            }
            arg0.method5225(class240.field3145, var18 + 32, 17, 16777215, -1);
            int var19 = field1171 + 390;
            if (class67.field1001[0] == 1 && class67.field1000[0] == 0) {
                Statics.field1515[2].method5539(var19, 4);
            } else {
                Statics.field1515[0].method5539(var19, 4);
            }
            if (class67.field1001[0] == 1 && class67.field1000[0] == 1) {
                Statics.field1515[3].method5539(var19 + 15, 4);
            } else {
                Statics.field1515[1].method5539(var19 + 15, 4);
            }
            arg0.method5225(class240.field3146, var19 + 32, 17, 16777215, -1);
            int var20 = field1171 + 500;
            if (class67.field1001[0] == 2 && class67.field1000[0] == 0) {
                Statics.field1515[2].method5539(var20, 4);
            } else {
                Statics.field1515[0].method5539(var20, 4);
            }
            if (class67.field1001[0] == 2 && class67.field1000[0] == 1) {
                Statics.field1515[3].method5539(var20 + 15, 4);
            } else {
                Statics.field1515[1].method5539(var20 + 15, 4);
            }
            arg0.method5225(class240.field3031, var20 + 32, 17, 16777215, -1);
            int var21 = field1171 + 610;
            if (class67.field1001[0] == 3 && class67.field1000[0] == 0) {
                Statics.field1515[2].method5539(var21, 4);
            } else {
                Statics.field1515[0].method5539(var21, 4);
            }
            if (class67.field1001[0] == 3 && class67.field1000[0] == 1) {
                Statics.field1515[3].method5539(var21 + 15, 4);
            } else {
                Statics.field1515[1].method5539(var21 + 15, 4);
            }
            arg0.method5225(class240.field3148, var21 + 32, 17, 16777215, -1);
        }
        class320.method5483(field1171 + 708, 4, 50, 16, 0);
        arg1.method5267(class240.field3100, field1171 + 708 + 25, 16, 16777215, -1);
        field1168 = -1;
        if (Statics.field255 != null) {
            byte var22 = 88;
            byte var23 = 19;
            int var24 = 765 / (var22 + 1);
            int var25 = 480 / (var23 + 1);
            int var26;
            int var27;
            do {
                var26 = var25;
                var27 = var24;
                if ((var24 - 1) * var25 >= class67.field994) {
                    var24--;
                }
                if ((var25 - 1) * var24 >= class67.field994) {
                    var25--;
                }
                if ((var25 - 1) * var24 >= class67.field994) {
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
            int var32 = var31 + 23;
            int var33 = field1171 + var30;
            int var34 = 0;
            boolean var35 = false;
            for (int var36 = 0; var36 < class67.field994; var36++) {
                class67 var37 = Statics.field997[var36];
                boolean var38 = true;
                String var39 = Integer.toString(var37.field1002);
                if (var37.field1002 == -1) {
                    var39 = class240.field3149;
                    var38 = false;
                } else if (var37.field1002 > 1980) {
                    var39 = class240.field3150;
                    var38 = false;
                }
                int var40 = 0;
                byte var41;
                if (var37.method1516()) {
                    if (var37.method1511()) {
                        var41 = 7;
                    } else {
                        var41 = 6;
                    }
                } else if (var37.method1515()) {
                    var40 = 16711680;
                    if (var37.method1511()) {
                        var41 = 5;
                    } else {
                        var41 = 4;
                    }
                } else if (var37.method1528()) {
                    if (var37.method1511()) {
                        var41 = 3;
                    } else {
                        var41 = 2;
                    }
                } else if (var37.method1511()) {
                    var41 = 1;
                } else {
                    var41 = 0;
                }
                if (class49.field461 >= var33 && class49.field462 >= var32 && class49.field461 < var22 + var33 && class49.field462 < var23 + var32 && var38) {
                    field1168 = var36;
                    Statics.field255[var41].method5639(var33, var32, 128, 16777215);
                    var35 = true;
                } else {
                    Statics.field255[var41].method5565(var33, var32);
                }
                if (Statics.field281 != null) {
                    Statics.field281[(var37.method1511() ? 8 : 0) + var37.field1007].method5539(var33 + 29, var32);
                }
                arg0.method5267(Integer.toString(var37.field1008), var33 + 15, var23 / 2 + var32 + 5, var40, -1);
                arg1.method5267(var39, var33 + 60, var23 / 2 + var32 + 5, 268435455, -1);
                var32 += var23 + var29;
                var34++;
                if (var34 >= var25) {
                    var32 = var31 + 23;
                    var33 += var22 + var28;
                    var34 = 0;
                }
            }
            if (var35) {
                int var42 = arg1.method5278(Statics.field997[field1168].field1006) + 6;
                int var43 = arg1.field3762 + 8;
                class320.method5483(class49.field461 - var42 / 2, class49.field462 + 20 + 5, var42, var43, 16777120);
                class320.method5465(class49.field461 - var42 / 2, class49.field462 + 20 + 5, var42, var43, 0);
                arg1.method5267(Statics.field997[field1168].field1006, class49.field461, class49.field462 + 20 + 5 + arg1.field3762 + 4, 0, -1);
            }
        }
        Statics.field1916.method711(0, 0);
    }

    @ObfuscatedName("av.u(Lah;I)V")
    public static void method443(class48 arg0) {
        if (class49.field468 != 1 && Statics.field43 || class49.field468 != 4) {
            return;
        }
        int var1 = field1171 + 280;
        if (class49.field466 >= var1 && class49.field466 <= var1 + 14 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(0, 0);
            return;
        }
        if (class49.field466 >= var1 + 15 && class49.field466 <= var1 + 80 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(0, 1);
            return;
        }
        int var2 = field1171 + 390;
        if (class49.field466 >= var2 && class49.field466 <= var2 + 14 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(1, 0);
            return;
        }
        if (class49.field466 >= var2 + 15 && class49.field466 <= var2 + 80 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(1, 1);
            return;
        }
        int var3 = field1171 + 500;
        if (class49.field466 >= var3 && class49.field466 <= var3 + 14 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(2, 0);
            return;
        }
        if (class49.field466 >= var3 + 15 && class49.field466 <= var3 + 80 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(2, 1);
            return;
        }
        int var4 = field1171 + 610;
        if (class49.field466 >= var4 && class49.field466 <= var4 + 14 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(3, 0);
            return;
        }
        if (class49.field466 >= var4 + 15 && class49.field466 <= var4 + 80 && class49.field470 >= 4 && class49.field470 <= 18) {
            class67.method3158(3, 1);
            return;
        }
        if (class49.field466 >= field1171 + 708 && class49.field470 >= 4 && class49.field466 <= field1171 + 708 + 50 && class49.field470 <= 20) {
            field1167 = false;
            Statics.field1170.method5565(field1171, 0);
            Statics.field212.method5565(field1171 + 382, 0);
            Statics.field1081.method5539(field1171 + 382 - Statics.field1081.field3865 / 2, 18);
            return;
        }
        if (field1168 == -1) {
            return;
        }
        class67 var5 = Statics.field997[field1168];
        Statics.method5183(var5);
        field1167 = false;
        Statics.field1170.method5565(field1171, 0);
        Statics.field212.method5565(field1171 + 382, 0);
        Statics.field1081.method5539(field1171 + 382 - Statics.field1081.field3865 / 2, 18);
        return;
    }
}
