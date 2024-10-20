package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("ci")
public class class80 {

    @ObfuscatedName("ci.s")
    public static int field1158 = 0;

    @ObfuscatedName("ci.j")
    public static int field1130 = field1158 + 202;

    @ObfuscatedName("ci.h")
    public static int[] field1131 = new int[256];

    @ObfuscatedName("ci.g")
    public static int field1132 = 0;

    @ObfuscatedName("ci.ac")
    public static int field1159 = 0;

    @ObfuscatedName("ci.av")
    public static int field1134 = 0;

    @ObfuscatedName("ci.af")
    public static int field1135 = 0;

    @ObfuscatedName("ci.ar")
    public static int field1136 = 0;

    @ObfuscatedName("ci.am")
    public static int field1137 = 0;

    @ObfuscatedName("ci.aj")
    public static int field1138 = 10;

    @ObfuscatedName("ci.aq")
    public static String field1139 = "";

    @ObfuscatedName("ci.aw")
    public static int field1127 = 0;

    @ObfuscatedName("ci.au")
    public static String field1141 = "";

    @ObfuscatedName("ci.ad")
    public static String field1142 = "";

    @ObfuscatedName("ci.ah")
    public static String field1143 = "";

    @ObfuscatedName("ci.as")
    public static String field1144 = "";

    @ObfuscatedName("ci.ag")
    public static String field1151 = "";

    @ObfuscatedName("ci.at")
    public static String field1146 = "";

    @ObfuscatedName("ci.ae")
    public static boolean field1125 = false;

    @ObfuscatedName("ci.br")
    public static boolean field1148 = false;

    @ObfuscatedName("ci.bi")
    public static boolean field1155 = false;

    @ObfuscatedName("ci.bw")
    public static boolean field1150 = true;

    @ObfuscatedName("ci.bx")
    public static int field1128 = 0;

    @ObfuscatedName("ci.bh")
    public static String field1152 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.bk")
    public static String field1126 = "1234567890";

    @ObfuscatedName("ci.bf")
    public static boolean field1154 = false;

    @ObfuscatedName("ci.bq")
    public static int field1156 = -1;

    @ObfuscatedName("ci.bt")
    public static long field1147;

    @ObfuscatedName("ci.bm")
    public static long field1153;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1147 = -1L;
        field1153 = -1L;
    }

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.v(Lis;Lis;I)I")
    public static int method2930(class250 arg0, class250 arg1) {
        int var2 = 0;
        if (arg0.method4344("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4344("logo", "")) {
            var2++;
        }
        if (arg1.method4344("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4344("titlebox", "")) {
            var2++;
        }
        if (arg1.method4344("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4344("runes", "")) {
            var2++;
        }
        if (arg1.method4344("title_mute", "")) {
            var2++;
        }
        if (arg1.method4344("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4344("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4344("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4344("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4344("sl_back", "");
        arg1.method4344("sl_flags", "");
        arg1.method4344("sl_arrows", "");
        arg1.method4344("sl_stars", "");
        arg1.method4344("sl_button", "");
        return var2;
    }

    @ObfuscatedName("lv.s(Lis;Lis;ZII)V")
    public static void method5356(class250 arg0, class250 arg1, boolean arg2, int arg3) {
        if (!Statics.field1140) {
            field1127 = arg3;
            class318.method5376();
            byte[] var4 = arg0.method4291("title.jpg", "");
            Statics.field1129 = class44.method2465(var4);
            Statics.field1385 = Statics.field1129.method5491();
            if ((client.field782 & 0x20000000) == 0) {
                Statics.field5 = class323.method5307(arg1, "logo", "");
            } else {
                Statics.field5 = class323.method5307(arg1, "logo_deadman_mode", "");
            }
            Statics.field1145 = class323.method5307(arg1, "titlebox", "");
            Statics.field1133 = class323.method5307(arg1, "titlebutton", "");
            Statics.field3785 = class323.method28(arg1, "runes", "");
            Statics.field3786 = class323.method28(arg1, "title_mute", "");
            Statics.field3753 = class323.method5307(arg1, "options_radio_buttons,0", "");
            Statics.field2028 = class323.method5307(arg1, "options_radio_buttons,4", "");
            Statics.field1933 = class323.method5307(arg1, "options_radio_buttons,2", "");
            Statics.field1073 = class323.method5307(arg1, "options_radio_buttons,6", "");
            Statics.field2413 = Statics.field3753.field3817;
            Statics.field2031 = Statics.field3753.field3819;
            Statics.field1500 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field1500[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1500[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1500[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1500[var8 + 192] = 16777215;
            }
            Statics.field1278 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1278[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1278[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1278[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1278[var12 + 192] = 16777215;
            }
            Statics.field977 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field977[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field977[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field977[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field977[var16 + 192] = 16777215;
            }
            Statics.field3287 = new int[256];
            Statics.field172 = new int[32768];
            Statics.field469 = new int[32768];
            method2129((class321) null);
            Statics.field577 = new int[32768];
            Statics.field165 = new int[32768];
            if (arg2) {
                field1151 = "";
                field1146 = "";
            }
            Statics.field547 = 0;
            Statics.field2809 = "";
            field1150 = true;
            field1154 = false;
            if (Statics.field580.field998) {
                class220.method3183(2);
            } else {
                class220.method3160(2, Statics.field1161, "scape main", "", 255, false);
            }
            class253.method3107(false);
            Statics.field1140 = true;
            field1158 = (Statics.field2428 - 765) / 2;
            field1130 = field1158 + 202;
            Statics.field3710 = field1130 + 180;
            Statics.field1129.method5496(field1158, 0);
            Statics.field1385.method5496(field1158 + 382, 0);
            Statics.field5.method5472(field1158 + 382 - Statics.field5.field3817 / 2, 18);
        } else if (arg3 == 4) {
            field1127 = 4;
        }
    }

    @ObfuscatedName("au.o(B)Ljava/lang/String;")
    public static String method657() {
        String var2;
        if (Statics.field580.field995) {
            String var0 = field1151;
            String var1 = class308.method93('*', var0.length());
            var2 = var1;
        } else {
            var2 = field1151;
        }
        return var2;
    }

    @ObfuscatedName("ki.k(I)V")
    public static void method5137() {
        if (!Statics.field1140) {
            return;
        }
        Statics.field1145 = null;
        Statics.field1133 = null;
        Statics.field3785 = null;
        Statics.field1129 = null;
        Statics.field1385 = null;
        Statics.field5 = null;
        Statics.field3786 = null;
        Statics.field3753 = null;
        Statics.field1933 = null;
        Statics.field1187 = null;
        Statics.field2033 = null;
        Statics.field504 = null;
        Statics.field1926 = null;
        Statics.field581 = null;
        Statics.field1500 = null;
        Statics.field1278 = null;
        Statics.field977 = null;
        Statics.field3287 = null;
        Statics.field172 = null;
        Statics.field469 = null;
        Statics.field577 = null;
        Statics.field165 = null;
        class220.method3183(2);
        class253.method3107(true);
        Statics.field1140 = false;
    }

    @ObfuscatedName("gw.u(I)V")
    public static void method3518() {
        if (field1125 && field1151 != null && field1151.length() > 0) {
            field1128 = 1;
        } else {
            field1128 = 0;
        }
    }

    @ObfuscatedName("id.i(Lap;B)V")
    public static void method4260(class48 arg0) {
        if (field1154) {
            method2350(arg0);
            return;
        }
        if ((class49.field464 == 1 || !Statics.field2577 && class49.field464 == 4) && class49.field465 >= field1158 + 765 - 50 && class49.field447 >= 453) {
            Statics.field580.field998 = !Statics.field580.field998;
            class68.method3016();
            if (Statics.field580.field998) {
                class220.method3158();
            } else {
                class252 var1 = Statics.field1161;
                int var2 = var1.method4288("scape main");
                int var3 = var1.method4289(var2, "");
                class220.method210(var1, var2, var3, 255, false);
            }
        }
        if (client.field629 == 5) {
            return;
        }
        if (field1147 == -1L) {
            field1147 = class187.method3154() + 1000L;
        }
        long var4 = class187.method3154();
        if (client.method574() && field1153 == -1L) {
            field1153 = var4;
            if (field1153 > field1147) {
                field1147 = field1153;
            }
        }
        field1136++;
        if (client.field629 != 10 && client.field629 != 11) {
            return;
        }
        if (client.field625 == 0) {
            if (class49.field464 == 1 || !Statics.field2577 && class49.field464 == 4) {
                int var6 = field1158 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class49.field465 >= var6 && class49.field465 <= var6 + var8 && class49.field447 >= var7 && class49.field447 <= var7 + var9) {
                    if (class67.method44()) {
                        field1154 = true;
                    }
                    return;
                }
            }
            if (Statics.field2051 != null && class67.method44()) {
                field1154 = true;
            }
        }
        int var10 = class49.field464;
        int var11 = class49.field465;
        int var12 = class49.field447;
        if (var10 == 0) {
            var11 = class49.field456;
            var12 = class49.field458 * -53945113;
        }
        if (!Statics.field2577 && var10 == 4) {
            var10 = 1;
        }
        if (field1127 == 0) {
            boolean var13 = false;
            while (class40.method2091()) {
                if (Statics.field334 == 84) {
                    var13 = true;
                }
            }
            int var14 = Statics.field3710 - 80;
            short var15 = 291;
            if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                label755: {
                    String var16 = client.method2878("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var16));
                            break label755;
                        } catch (Exception var60) {
                        }
                    }
                    if (class46.field405.startsWith("win")) {
                        class46.method658(var16, 0);
                    } else if (class46.field405.startsWith("mac")) {
                        class46.method292(var16, 1, "openjs");
                    } else {
                        class46.method658(var16, 2);
                    }
                }
            }
            int var18 = Statics.field3710 + 80;
            if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                if ((client.field782 & 0x2000000) != 0) {
                    field1141 = "";
                    field1142 = class240.field2975;
                    field1143 = class240.field3049;
                    field1144 = class240.field3096;
                    field1127 = 1;
                    method3518();
                } else if ((client.field782 & 0x4) != 0) {
                    if ((client.field782 & 0x400) == 0) {
                        field1142 = class240.field3039;
                        field1143 = class240.field2909;
                        field1144 = class240.field3090;
                    } else {
                        field1142 = class240.field3045;
                        field1143 = class240.field3046;
                        field1144 = class240.field3047;
                    }
                    field1141 = class240.field3048;
                    field1127 = 1;
                    method3518();
                } else if ((client.field782 & 0x400) == 0) {
                    method2969(false);
                } else {
                    field1142 = class240.field3085;
                    field1143 = class240.field3043;
                    field1144 = class240.field3044;
                    field1141 = class240.field3048;
                    field1127 = 1;
                    method3518();
                }
            }
        } else if (field1127 == 1) {
            while (class40.method2091()) {
                if (Statics.field334 == 84) {
                    method2969(false);
                } else if (Statics.field334 == 13) {
                    field1127 = 0;
                }
            }
            int var19 = Statics.field3710 - 80;
            short var20 = 321;
            if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                method2969(false);
            }
            int var21 = Statics.field3710 + 80;
            if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                field1127 = 0;
            }
        } else if (field1127 == 2) {
            short var22 = 201;
            int var61 = var22 + 52;
            if (var10 == 1 && var12 >= var61 - 12 && var12 < var61 + 2) {
                field1128 = 0;
            }
            var61 += 15;
            if (var10 == 1 && var12 >= var61 - 12 && var12 < var61 + 2) {
                field1128 = 1;
            }
            var61 += 15;
            short var23 = 361;
            if (var10 == 1 && var12 >= var23 - 15 && var12 < var23) {
                method1882(class240.field3079, class240.field3076, class240.field3081);
                field1127 = 5;
                return;
            }
            int var24 = Statics.field3710 - 80;
            short var25 = 321;
            if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                field1151 = field1151.trim();
                if (field1151.length() == 0) {
                    method1882(class240.field2940, class240.field2928, class240.field2942);
                    return;
                }
                if (field1146.length() == 0) {
                    method1882(class240.field3052, class240.field2944, class240.field3036);
                    return;
                }
                method1882(class240.field3053, class240.field3054, class240.field3055);
                client.method1021(false);
                client.method3061(20);
                return;
            }
            int var26 = field1130 + 180 + 80;
            if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                field1127 = 0;
                field1151 = "";
                field1146 = "";
                Statics.field547 = 0;
                Statics.field2809 = "";
                field1150 = true;
            }
            int var27 = Statics.field3710 + -117;
            short var28 = 277;
            field1148 = var11 >= var27 && var11 < Statics.field2413 + var27 && var12 >= var28 && var12 < Statics.field2031 + var28;
            if (var10 == 1 && field1148) {
                field1125 = !field1125;
                if (!field1125 && Statics.field580.field1000 != null) {
                    Statics.field580.field1000 = null;
                    class68.method3016();
                }
            }
            int var29 = Statics.field3710 + 24;
            short var30 = 277;
            field1155 = var11 >= var29 && var11 < Statics.field2413 + var29 && var12 >= var30 && var12 < Statics.field2031 + var30;
            if (var10 == 1 && field1155) {
                Statics.field580.field995 = !Statics.field580.field995;
                if (!Statics.field580.field995) {
                    field1151 = "";
                    Statics.field580.field1000 = null;
                    method3518();
                }
                class68.method3016();
            }
            while (true) {
                while (class40.method2091()) {
                    boolean var31 = false;
                    for (int var32 = 0; var32 < field1152.length(); var32++) {
                        if (Statics.field1081 == field1152.charAt(var32)) {
                            var31 = true;
                            break;
                        }
                    }
                    if (Statics.field334 == 13) {
                        field1127 = 0;
                        field1151 = "";
                        field1146 = "";
                        Statics.field547 = 0;
                        Statics.field2809 = "";
                        field1150 = true;
                    } else if (field1128 == 0) {
                        if (Statics.field334 == 85 && field1151.length() > 0) {
                            field1151 = field1151.substring(0, field1151.length() - 1);
                        }
                        if (Statics.field334 == 84 || Statics.field334 == 80) {
                            field1128 = 1;
                        }
                        if (var31 && field1151.length() < 320) {
                            field1151 = field1151 + Statics.field1081;
                        }
                    } else if (field1128 == 1) {
                        if (Statics.field334 == 85 && field1146.length() > 0) {
                            field1146 = field1146.substring(0, field1146.length() - 1);
                        }
                        if (Statics.field334 == 84 || Statics.field334 == 80) {
                            field1128 = 0;
                        }
                        if (Statics.field334 == 84) {
                            field1151 = field1151.trim();
                            if (field1151.length() == 0) {
                                method1882(class240.field2940, class240.field2928, class240.field2942);
                                return;
                            }
                            if (field1146.length() == 0) {
                                method1882(class240.field3052, class240.field2944, class240.field3036);
                                return;
                            }
                            method1882(class240.field3053, class240.field3054, class240.field3055);
                            client.method1021(false);
                            client.method3061(20);
                            return;
                        }
                        if (var31 && field1146.length() < 20) {
                            field1146 = field1146 + Statics.field1081;
                        }
                    }
                }
                return;
            }
        } else if (field1127 == 3) {
            int var33 = field1130 + 180;
            short var34 = 276;
            if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                method2969(false);
            }
            int var35 = field1130 + 180;
            short var36 = 326;
            if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                method1882(class240.field3079, class240.field3076, class240.field3081);
                field1127 = 5;
                return;
            }
        } else if (field1127 == 4) {
            int var37 = field1130 + 180 - 80;
            short var38 = 321;
            if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                Statics.field2809.trim();
                if (Statics.field2809.length() != 6) {
                    method1882(class240.field2859, class240.field2860, class240.field2861);
                    return;
                }
                Statics.field547 = Integer.parseInt(Statics.field2809);
                Statics.field2809 = "";
                client.method1021(true);
                method1882(class240.field3053, class240.field3054, class240.field3055);
                client.method3061(20);
                return;
            }
            if (var10 == 1 && var11 >= field1130 + 180 - 9 && var11 <= field1130 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field1150 = !field1150;
            }
            if (var10 == 1 && var11 >= field1130 + 180 - 34 && var11 <= field1130 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                label768: {
                    String var39 = client.method2878("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var39));
                            break label768;
                        } catch (Exception var59) {
                        }
                    }
                    if (class46.field405.startsWith("win")) {
                        class46.method658(var39, 0);
                    } else if (class46.field405.startsWith("mac")) {
                        class46.method292(var39, 1, "openjs");
                    } else {
                        class46.method658(var39, 2);
                    }
                }
            }
            int var41 = field1130 + 180 + 80;
            if (var10 == 1 && var11 >= var41 - 75 && var11 <= var41 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                field1127 = 0;
                field1151 = "";
                field1146 = "";
                Statics.field547 = 0;
                Statics.field2809 = "";
            }
            while (class40.method2091()) {
                boolean var42 = false;
                for (int var43 = 0; var43 < field1126.length(); var43++) {
                    if (Statics.field1081 == field1126.charAt(var43)) {
                        var42 = true;
                        break;
                    }
                }
                if (Statics.field334 == 13) {
                    field1127 = 0;
                    field1151 = "";
                    field1146 = "";
                    Statics.field547 = 0;
                    Statics.field2809 = "";
                } else {
                    if (Statics.field334 == 85 && Statics.field2809.length() > 0) {
                        Statics.field2809 = Statics.field2809.substring(0, Statics.field2809.length() - 1);
                    }
                    if (Statics.field334 == 84) {
                        Statics.field2809.trim();
                        if (Statics.field2809.length() != 6) {
                            method1882(class240.field2859, class240.field2860, class240.field2861);
                            return;
                        }
                        Statics.field547 = Integer.parseInt(Statics.field2809);
                        Statics.field2809 = "";
                        client.method1021(true);
                        method1882(class240.field3053, class240.field3054, class240.field3055);
                        client.method3061(20);
                        return;
                    }
                    if (var42 && Statics.field2809.length() < 6) {
                        Statics.field2809 = Statics.field2809 + Statics.field1081;
                    }
                }
            }
        } else if (field1127 == 5) {
            int var44 = field1130 + 180 - 80;
            short var45 = 321;
            if (var10 == 1 && var11 >= var44 - 75 && var11 <= var44 + 75 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                method1768();
                return;
            }
            int var46 = field1130 + 180 + 80;
            if (var10 == 1 && var11 >= var46 - 75 && var11 <= var46 + 75 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                method2969(true);
            }
            while (class40.method2091()) {
                boolean var47 = false;
                for (int var48 = 0; var48 < field1152.length(); var48++) {
                    if (Statics.field1081 == field1152.charAt(var48)) {
                        var47 = true;
                        break;
                    }
                }
                if (Statics.field334 == 13) {
                    method2969(true);
                } else {
                    if (Statics.field334 == 85 && field1151.length() > 0) {
                        field1151 = field1151.substring(0, field1151.length() - 1);
                    }
                    if (Statics.field334 == 84) {
                        method1768();
                        return;
                    }
                    if (var47 && field1151.length() < 320) {
                        field1151 = field1151 + Statics.field1081;
                    }
                }
            }
        } else if (field1127 == 6) {
            while (true) {
                do {
                    if (!class40.method2091()) {
                        short var49 = 321;
                        if (var10 == 1 && var12 >= var49 - 20 && var12 <= var49 + 20) {
                            method2969(true);
                        }
                        return;
                    }
                } while (Statics.field334 != 84 && Statics.field334 != 13);
                method2969(true);
            }
        } else if (field1127 == 7) {
            int var50 = field1130 + 180 - 80;
            short var51 = 321;
            if (var10 == 1 && var11 >= var50 - 75 && var11 <= var50 + 75 && var12 >= var51 - 20 && var12 <= var51 + 20) {
                label528: {
                    String var52 = client.method2878("secure", true) + "m=dob/set_dob.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var52));
                            break label528;
                        } catch (Exception var58) {
                        }
                    }
                    if (class46.field405.startsWith("win")) {
                        class46.method658(var52, 0);
                    } else if (class46.field405.startsWith("mac")) {
                        class46.method292(var52, 1, "openjs");
                    } else {
                        class46.method658(var52, 2);
                    }
                }
                method1882(class240.field2887, class240.field3077, class240.field3078);
                field1127 = 6;
                return;
            }
            int var54 = field1130 + 180 + 80;
            if (var10 == 1 && var11 >= var54 - 75 && var11 <= var54 + 75 && var12 >= var51 - 20 && var12 <= var51 + 20) {
                method2969(true);
            }
        } else if (field1127 == 8) {
            int var55 = field1130 + 180 - 80;
            short var56 = 321;
            if (var10 == 1 && var11 >= var55 - 75 && var11 <= var55 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                class46.method2377("https://www.jagex.com/terms/privacy/#eight", true, false);
                method1882(class240.field2887, class240.field3077, class240.field3078);
                field1127 = 6;
                return;
            }
            int var57 = field1130 + 180 + 80;
            if (var10 == 1 && var11 >= var57 - 75 && var11 <= var57 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                method2969(true);
            }
        }
    }

    @ObfuscatedName("ec.t(ZI)V")
    public static void method2969(boolean arg0) {
        field1142 = class240.field3035;
        field1143 = class240.field2918;
        field1144 = class240.field2851;
        field1127 = 2;
        if (arg0) {
            field1146 = "";
        }
        if (field1151 == null || field1151.length() <= 0) {
            if (Statics.field580.field1000 == null) {
                field1125 = false;
            } else {
                field1151 = Statics.field580.field1000;
                field1125 = true;
            }
        }
        method3518();
    }

    @ObfuscatedName("cu.c(I)V")
    public static void method1768() {
        field1151 = field1151.trim();
        if (field1151.length() == 0) {
            method1882(class240.field3079, class240.field3076, class240.field3081);
            return;
        }
        long var0 = class75.method4666();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1151;
            Random var4 = new Random();
            class185 var5 = new class185(128);
            class185 var6 = new class185(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3258(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3261(var4.nextInt());
            }
            var5.method3261(var7[0]);
            var5.method3261(var7[1]);
            var5.method3415(var0);
            var5.method3415(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3261(var4.nextInt());
            }
            var5.method3297(class75.field1085, class75.field1086);
            var6.method3258(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3261(var4.nextInt());
            }
            var6.method3415(var4.nextLong());
            var6.method3262(var4.nextLong());
            Statics.method3497(var6);
            var6.method3415(var4.nextLong());
            var6.method3297(class75.field1085, class75.field1086);
            int var11 = class185.method3230(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class185 var12 = new class185(var11);
            var12.method3265(var3);
            var12.field2386 = var11;
            var12.method3458(var7);
            class185 var13 = new class185(var12.field2386 + var6.field2386 + var5.field2386 + 5);
            var13.method3258(2);
            var13.method3258(var5.field2386);
            var13.method3303(var5.field2387, 0, var5.field2386);
            var13.method3258(var6.field2386);
            var13.method3303(var6.field2387, 0, var6.field2386);
            var13.method3259(var12.field2386);
            var13.method3303(var12.field2387, 0, var12.field2386);
            String var14 = class307.method620(var13.field2387);
            byte var21;
            try {
                URL var15 = new URL(client.method2878("services", false) + "m=accountappeal/login.ws");
                URLConnection var16 = var15.openConnection();
                var16.setDoInput(true);
                var16.setDoOutput(true);
                var16.setConnectTimeout(5000);
                OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                var17.write("data2=" + class329.method294(var14) + "&dest=" + class329.method294("passwordchoice.ws"));
                var17.flush();
                InputStream var18 = var16.getInputStream();
                class185 var19 = new class185(new byte[1000]);
                while (true) {
                    int var20 = var18.read(var19.field2387, var19.field2386, 1000 - var19.field2386);
                    if (var20 == -1) {
                        var17.close();
                        var18.close();
                        String var22 = new String(var19.field2387);
                        if (var22.startsWith("OFFLINE")) {
                            var21 = 4;
                        } else if (var22.startsWith("WRONG")) {
                            var21 = 7;
                        } else if (var22.startsWith("RELOAD")) {
                            var21 = 3;
                        } else if (var22.startsWith("Not permitted for social network accounts.")) {
                            var21 = 6;
                        } else {
                            var19.method3294(var7);
                            while (var19.field2386 > 0 && var19.field2387[var19.field2386 - 1] == 0) {
                                var19.field2386--;
                            }
                            String var23 = new String(var19.field2387, 0, var19.field2386);
                            boolean var24;
                            if (var23 == null) {
                                var24 = false;
                            } else {
                                label110: {
                                    try {
                                        new URL(var23);
                                    } catch (MalformedURLException var29) {
                                        var24 = false;
                                        break label110;
                                    }
                                    var24 = true;
                                }
                            }
                            if (var24) {
                                label105: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var23));
                                            break label105;
                                        } catch (Exception var28) {
                                        }
                                    }
                                    if (class46.field405.startsWith("win")) {
                                        class46.method658(var23, 0);
                                    } else if (class46.field405.startsWith("mac")) {
                                        class46.method292(var23, 1, "openjs");
                                    } else {
                                        class46.method658(var23, 2);
                                    }
                                }
                                var21 = 2;
                            } else {
                                var21 = 5;
                            }
                        }
                        break;
                    }
                    var19.field2386 += var20;
                    if (var19.field2386 >= 1000) {
                        var21 = 5;
                        break;
                    }
                }
            } catch (Throwable var30) {
                var30.printStackTrace();
                var21 = 5;
            }
            var2 = var21;
        }
        switch(var2) {
            case 2:
                method1882(class240.field3058, class240.field2829, class240.field3084);
                field1127 = 6;
                break;
            case 3:
                method1882(class240.field2837, class240.field3086, class240.field3087);
                break;
            case 4:
                method1882(class240.field2827, class240.field3089, class240.field2843);
                break;
            case 5:
                method1882(class240.field3091, class240.field3092, class240.field2877);
                break;
            case 6:
                method1882(class240.field3094, class240.field2945, class240.field2986);
                break;
            case 7:
                method1882(class240.field2999, class240.field3083, class240.field3099);
        }
    }

    @ObfuscatedName("h.w(Lkw;Lkw;Lkw;ZB)V")
    public static void method288(class301 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg3) {
            field1158 = (Statics.field2428 - 765) / 2;
            field1130 = field1158 + 202;
            Statics.field3710 = field1130 + 180;
        }
        if (field1154) {
            method1073(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1129.method5496(field1158, 0);
            Statics.field1385.method5496(field1158 + 382, 0);
            Statics.field5.method5472(field1158 + 382 - Statics.field5.field3817 / 2, 18);
        }
        if (client.field629 == 0 || client.field629 == 5) {
            byte var4 = 20;
            arg0.method5162(class240.field3034, field1130 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class318.method5412(field1130 + 180 - 152, var5, 304, 34, 9179409);
            class318.method5412(field1130 + 180 - 151, var5 + 1, 302, 32, 0);
            class318.method5408(field1130 + 180 - 150, var5 + 2, field1138 * 3, 30, 9179409);
            class318.method5408(field1138 * 3 + (field1130 + 180 - 150), var5 + 2, 300 - field1138 * 3, 30, 0);
            arg0.method5162(field1139, field1130 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field629 == 20) {
            Statics.field1145.method5472(field1130 + 180 - Statics.field1145.field3817 / 2, 271 - Statics.field1145.field3819 / 2);
            short var6 = 201;
            arg0.method5162(field1142, field1130 + 180, var6, 16776960, 0);
            int var82 = var6 + 15;
            arg0.method5162(field1143, field1130 + 180, var82, 16776960, 0);
            int var83 = var82 + 15;
            arg0.method5162(field1144, field1130 + 180, var83, 16776960, 0);
            int var84 = var83 + 15;
            int var85 = var84 + 7;
            if (field1127 != 4) {
                arg0.method5159(class240.field3056, field1130 + 180 - 110, var85, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = method657(); arg0.method5154(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method5159(class302.method5237(var8), field1130 + 180 - 70, var85, 16777215, 0);
                var82 = var85 + 15;
                String var10 = class240.field3057;
                String var11 = field1146;
                String var12 = class308.method93('*', var11.length());
                arg0.method5159(var10 + var12, field1130 + 180 - 108, var82, 16777215, 0);
                var82 += 15;
            }
        }
        if (client.field629 == 10 || client.field629 == 11) {
            Statics.field1145.method5472(field1130, 171);
            if (field1127 == 0) {
                short var13 = 251;
                arg0.method5162(class240.field3059, field1130 + 180, var13, 16776960, 0);
                int var86 = var13 + 30;
                int var14 = field1130 + 180 - 80;
                short var15 = 291;
                Statics.field1133.method5472(var14 - 73, var15 - 20);
                arg0.method5209(class240.field3060, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field1130 + 180 + 80;
                Statics.field1133.method5472(var16 - 73, var15 - 20);
                arg0.method5209(class240.field2968, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1127 == 1) {
                arg0.method5162(field1141, field1130 + 180, 201, 16776960, 0);
                short var17 = 236;
                arg0.method5162(field1142, field1130 + 180, var17, 16777215, 0);
                int var87 = var17 + 15;
                arg0.method5162(field1143, field1130 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                arg0.method5162(field1144, field1130 + 180, var88, 16777215, 0);
                int var89 = var88 + 15;
                int var18 = field1130 + 180 - 80;
                short var19 = 321;
                Statics.field1133.method5472(var18 - 73, var19 - 20);
                arg0.method5162(class240.field2923, var18, var19 + 5, 16777215, 0);
                int var20 = field1130 + 180 + 80;
                Statics.field1133.method5472(var20 - 73, var19 - 20);
                arg0.method5162(class240.field3063, var20, var19 + 5, 16777215, 0);
            } else if (field1127 == 2) {
                short var21 = 201;
                arg0.method5162(field1142, Statics.field3710, var21, 16776960, 0);
                int var90 = var21 + 15;
                arg0.method5162(field1143, Statics.field3710, var90, 16776960, 0);
                int var91 = var90 + 15;
                arg0.method5162(field1144, Statics.field3710, var91, 16776960, 0);
                int var92 = var91 + 15;
                int var93 = var92 + 7;
                arg0.method5159(class240.field3056, Statics.field3710 - 110, var93, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = method657(); arg0.method5154(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method5159(class302.method5237(var23) + (field1128 == 0 & client.field631 % 40 < 20 ? class76.method2125(16776960) + class76.field1091 : ""), Statics.field3710 - 70, var93, 16777215, 0);
                var90 = var93 + 15;
                String var25 = class240.field3057;
                String var26 = field1146;
                String var27 = class308.method93('*', var26.length());
                arg0.method5159(var25 + var27 + (field1128 == 1 & client.field631 % 40 < 20 ? class76.method2125(16776960) + class76.field1091 : ""), Statics.field3710 - 108, var90, 16777215, 0);
                var90 += 15;
                short var28 = 277;
                int var29 = Statics.field3710 + -117;
                boolean var30 = field1125;
                boolean var31 = field1148;
                class321 var32 = var30 ? (var31 ? Statics.field1073 : Statics.field1933) : (var31 ? Statics.field2028 : Statics.field3753);
                var32.method5472(var29, var28);
                int var34 = var32.field3817 + 5 + var29;
                arg1.method5159(class240.field3064, var34, var28 + 13, 16776960, 0);
                int var35 = Statics.field3710 + 24;
                boolean var36 = Statics.field580.field995;
                boolean var37 = field1155;
                class321 var38 = var36 ? (var37 ? Statics.field1073 : Statics.field1933) : (var37 ? Statics.field2028 : Statics.field3753);
                var38.method5472(var35, var28);
                int var40 = var38.field3817 + 5 + var35;
                arg1.method5159(class240.field2952, var40, var28 + 13, 16776960, 0);
                int var94 = var28 + 15;
                int var41 = Statics.field3710 - 80;
                short var42 = 321;
                Statics.field1133.method5472(var41 - 73, var42 - 20);
                arg0.method5162(class240.field3062, var41, var42 + 5, 16777215, 0);
                int var43 = Statics.field3710 + 80;
                Statics.field1133.method5472(var43 - 73, var42 - 20);
                arg0.method5162(class240.field3063, var43, var42 + 5, 16777215, 0);
                short var44 = 357;
                arg1.method5162(class240.field3071, Statics.field3710, var44, 16776960, 0);
            } else if (field1127 == 3) {
                short var45 = 201;
                arg0.method5162(class240.field3066, field1130 + 180, var45, 16776960, 0);
                int var95 = var45 + 20;
                arg1.method5162(class240.field3067, field1130 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg1.method5162(class240.field3068, field1130 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                int var46 = field1130 + 180;
                short var47 = 276;
                Statics.field1133.method5472(var46 - 73, var47 - 20);
                arg2.method5162(class240.field3069, var46, var47 + 5, 16777215, 0);
                int var48 = field1130 + 180;
                short var49 = 326;
                Statics.field1133.method5472(var48 - 73, var49 - 20);
                arg2.method5162(class240.field3070, var48, var49 + 5, 16777215, 0);
            } else if (field1127 == 4) {
                arg0.method5162(class240.field3051, field1130 + 180, 201, 16776960, 0);
                short var50 = 236;
                arg0.method5162(field1142, field1130 + 180, var50, 16777215, 0);
                int var98 = var50 + 15;
                arg0.method5162(field1143, field1130 + 180, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method5162(field1144, field1130 + 180, var99, 16777215, 0);
                int var100 = var99 + 15;
                String var52 = class240.field2983;
                String var53 = Statics.field2809;
                String var54 = class308.method93('*', var53.length());
                arg0.method5159(var52 + var54 + (client.field631 % 40 < 20 ? class76.method2125(16776960) + class76.field1091 : ""), field1130 + 180 - 108, var100, 16777215, 0);
                int var101 = var100 - 8;
                arg0.method5159(class240.field2831, field1130 + 180 - 9, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method5159(class240.field3000, field1130 + 180 - 9, var102, 16776960, 0);
                int var55 = field1130 + 180 - 9 + arg0.method5154(class240.field3000) + 15;
                int var56 = var102 - arg0.field3728;
                class321 var57;
                if (field1150) {
                    var57 = Statics.field1933;
                } else {
                    var57 = Statics.field3753;
                }
                var57.method5472(var55, var56);
                var98 = var102 + 15;
                int var58 = field1130 + 180 - 80;
                short var59 = 321;
                Statics.field1133.method5472(var58 - 73, var59 - 20);
                arg0.method5162(class240.field2923, var58, var59 + 5, 16777215, 0);
                int var60 = field1130 + 180 + 80;
                Statics.field1133.method5472(var60 - 73, var59 - 20);
                arg0.method5162(class240.field3063, var60, var59 + 5, 16777215, 0);
                arg1.method5162(class240.field2875, field1130 + 180, var59 + 36, 255, 0);
            } else if (field1127 == 5) {
                arg0.method5162(class240.field3072, field1130 + 180, 201, 16776960, 0);
                short var61 = 221;
                arg2.method5162(field1142, field1130 + 180, var61, 16776960, 0);
                int var103 = var61 + 15;
                arg2.method5162(field1143, field1130 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg2.method5162(field1144, field1130 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var106 = var105 + 14;
                arg0.method5159(class240.field2841, field1130 + 180 - 145, var106, 16777215, 0);
                short var62 = 174;
                String var63;
                for (var63 = method657(); arg0.method5154(var63) > var62; var63 = var63.substring(1)) {
                }
                arg0.method5159(class302.method5237(var63) + (client.field631 % 40 < 20 ? class76.method2125(16776960) + class76.field1091 : ""), field1130 + 180 - 34, var106, 16777215, 0);
                var103 = var106 + 15;
                int var64 = field1130 + 180 - 80;
                short var65 = 321;
                Statics.field1133.method5472(var64 - 73, var65 - 20);
                arg0.method5162(class240.field2901, var64, var65 + 5, 16777215, 0);
                int var66 = field1130 + 180 + 80;
                Statics.field1133.method5472(var66 - 73, var65 - 20);
                arg0.method5162(class240.field3075, var66, var65 + 5, 16777215, 0);
            } else if (field1127 == 6) {
                short var67 = 201;
                arg0.method5162(field1142, field1130 + 180, var67, 16776960, 0);
                int var107 = var67 + 15;
                arg0.method5162(field1143, field1130 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg0.method5162(field1144, field1130 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var68 = field1130 + 180;
                short var69 = 321;
                Statics.field1133.method5472(var68 - 73, var69 - 20);
                arg0.method5162(class240.field3075, var68, var69 + 5, 16777215, 0);
            } else if (field1127 == 7) {
                short var70 = 216;
                arg0.method5162(class240.field2866, field1130 + 180, var70, 16776960, 0);
                int var110 = var70 + 15;
                arg2.method5162(class240.field3101, field1130 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg2.method5162(class240.field3102, field1130 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var71 = field1130 + 180 - 80;
                short var72 = 321;
                Statics.field1133.method5472(var71 - 73, var72 - 20);
                arg0.method5162(class240.field3103, var71, var72 + 5, 16777215, 0);
                int var73 = field1130 + 180 + 80;
                Statics.field1133.method5472(var73 - 73, var72 - 20);
                arg0.method5162(class240.field3075, var73, var72 + 5, 16777215, 0);
            } else if (field1127 == 8) {
                short var74 = 216;
                arg0.method5162(class240.field2958, field1130 + 180, var74, 16776960, 0);
                int var113 = var74 + 15;
                arg2.method5162(class240.field3020, field1130 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg2.method5162(class240.field3041, field1130 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var75 = field1130 + 180 - 80;
                short var76 = 321;
                Statics.field1133.method5472(var75 - 73, var76 - 20);
                arg0.method5162(class240.field2961, var75, var76 + 5, 16777215, 0);
                int var77 = field1130 + 180 + 80;
                Statics.field1133.method5472(var77 - 73, var76 - 20);
                arg0.method5162(class240.field3075, var77, var76 + 5, 16777215, 0);
            }
        }
        if (field1136 > 0) {
            method1746(field1136);
            field1136 = 0;
        }
        method2090();
        Statics.field3786[Statics.field580.field998 ? 1 : 0].method5472(field1158 + 765 - 40, 463);
        if (client.field629 <= 5 || client.field625 != 0) {
            return;
        }
        if (Statics.field581 == null) {
            Statics.field581 = class323.method5307(Statics.field1890, "sl_button", "");
            return;
        }
        int var78 = field1158 + 5;
        short var79 = 463;
        byte var80 = 100;
        byte var81 = 35;
        Statics.field581.method5472(var78, var79);
        arg0.method5162(class240.field2989 + " " + client.field711, var80 / 2 + var78, var81 / 2 + var79 - 2, 16777215, 0);
        if (Statics.field2051 == null) {
            arg1.method5162(class240.field3114, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
        } else {
            arg1.method5162(class240.field3113, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cn.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1882(String arg0, String arg1, String arg2) {
        field1142 = arg0;
        field1143 = arg1;
        field1144 = arg2;
    }

    @ObfuscatedName("dt.z(Lld;B)V")
    public static final void method2129(class321 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field172.length; var2++) {
            Statics.field172[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field172[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field469[var8] = (Statics.field172[var8 - 1] + Statics.field172[var8 + 1] + Statics.field172[var8 - 128] + Statics.field172[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field172;
            Statics.field172 = Statics.field469;
            Statics.field469 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3819; var11++) {
            for (int var12 = 0; var12 < arg0.field3817; var12++) {
                if (arg0.field3821[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3818;
                    int var14 = var11 + 16 + arg0.field3820;
                    int var15 = (var14 << 7) + var13;
                    Statics.field172[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ci.e(II)V")
    public static final void method1746(int arg0) {
        short var1 = 256;
        field1134 += arg0 * 128;
        if (field1134 > Statics.field172.length) {
            field1134 -= Statics.field172.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2129(Statics.field3785[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field577[var3 + var4] - Statics.field172[field1134 + var3 & Statics.field172.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field577[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field577[var9 + var10] = 255;
                } else {
                    Statics.field577[var9 + var10] = 0;
                }
            }
        }
        if (field1132 > 0) {
            field1132 -= arg0 * 4;
        }
        if (field1159 > 0) {
            field1159 -= arg0 * 4;
        }
        if (field1132 == 0 && field1159 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1132 = 1024;
            }
            if (var12 == 1) {
                field1159 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1131[var13] = field1131[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1131[var14] = (int) (Math.sin((double) field1137 / 14.0D) * 16.0D + Math.sin((double) field1137 / 15.0D) * 14.0D + Math.sin((double) field1137 / 16.0D) * 12.0D);
            field1137++;
        }
        field1135 += arg0 * -1154420603;
        int var15 = ((client.field631 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1135 * 810106388; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field577[(var18 << 7) + var17] = 192;
        }
        field1135 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field577[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field577[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field165[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field165[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field165[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field577[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ki.q(IIIB)I")
    public static final int method5135(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cc.j(B)V")
    public static final void method2090() {
        short var0 = 256;
        if (field1132 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1132 > 768) {
                    Statics.field3287[var1] = method5135(Statics.field1500[var1], Statics.field1278[var1], 1024 - field1132);
                } else if (field1132 > 256) {
                    Statics.field3287[var1] = Statics.field1278[var1];
                } else {
                    Statics.field3287[var1] = method5135(Statics.field1278[var1], Statics.field1500[var1], 256 - field1132);
                }
            }
        } else if (field1159 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1159 > 768) {
                    Statics.field3287[var2] = method5135(Statics.field1500[var2], Statics.field977[var2], 1024 - field1159);
                } else if (field1159 > 256) {
                    Statics.field3287[var2] = Statics.field977[var2];
                } else {
                    Statics.field3287[var2] = method5135(Statics.field977[var2], Statics.field1500[var2], 256 - field1159);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field3287[var3] = Statics.field1500[var3];
            }
        }
        class318.method5394(field1158, 9, field1158 + 128, var0 + 7);
        Statics.field1129.method5496(field1158, 0);
        class318.method5367();
        int var4 = 0;
        int var5 = field1158 + Statics.field195.field3805 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1131[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field577[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field3287[var10];
                    int var14 = Statics.field195.field3806[var5];
                    Statics.field195.field3806[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field195.field3805 + var8 - 128;
        }
        class318.method5394(field1158 + 765 - 128, 9, field1158 + 765, var0 + 7);
        Statics.field1385.method5496(field1158 + 382, 0);
        class318.method5367();
        int var15 = 0;
        int var16 = field1158 + Statics.field195.field3805 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1131[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field577[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field3287[var22];
                    int var26 = Statics.field195.field3806[var20];
                    Statics.field195.field3806[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field195.field3805 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bf.y(Lkw;Lkw;I)V")
    public static void method1073(class301 arg0, class301 arg1) {
        if (Statics.field1187 == null) {
            Statics.field1187 = class323.method3166(Statics.field1890, "sl_back", "");
        }
        if (Statics.field2033 == null) {
            Statics.field2033 = class323.method28(Statics.field1890, "sl_flags", "");
        }
        if (Statics.field504 == null) {
            Statics.field504 = class323.method28(Statics.field1890, "sl_arrows", "");
        }
        if (Statics.field1926 == null) {
            Statics.field1926 = class323.method28(Statics.field1890, "sl_stars", "");
        }
        class318.method5408(field1158, 23, 765, 480, 0);
        class318.method5381(field1158, 0, 125, 23, 12425273, 9135624);
        class318.method5381(field1158 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5162(class240.field3104, field1158 + 62, 15, 0, -1);
        if (Statics.field1926 != null) {
            Statics.field1926[1].method5472(field1158 + 140, 1);
            arg1.method5159(class240.field3105, field1158 + 152, 10, 16777215, -1);
            Statics.field1926[0].method5472(field1158 + 140, 12);
            arg1.method5159(class240.field3106, field1158 + 152, 21, 16777215, -1);
        }
        if (Statics.field504 != null) {
            int var2 = field1158 + 280;
            if (class67.field987[0] == 0 && class67.field985[0] == 0) {
                Statics.field504[2].method5472(var2, 4);
            } else {
                Statics.field504[0].method5472(var2, 4);
            }
            if (class67.field987[0] == 0 && class67.field985[0] == 1) {
                Statics.field504[3].method5472(var2 + 15, 4);
            } else {
                Statics.field504[1].method5472(var2 + 15, 4);
            }
            arg0.method5159(class240.field3097, var2 + 32, 17, 16777215, -1);
            int var3 = field1158 + 390;
            if (class67.field987[0] == 1 && class67.field985[0] == 0) {
                Statics.field504[2].method5472(var3, 4);
            } else {
                Statics.field504[0].method5472(var3, 4);
            }
            if (class67.field987[0] == 1 && class67.field985[0] == 1) {
                Statics.field504[3].method5472(var3 + 15, 4);
            } else {
                Statics.field504[1].method5472(var3 + 15, 4);
            }
            arg0.method5159(class240.field2858, var3 + 32, 17, 16777215, -1);
            int var4 = field1158 + 500;
            if (class67.field987[0] == 2 && class67.field985[0] == 0) {
                Statics.field504[2].method5472(var4, 4);
            } else {
                Statics.field504[0].method5472(var4, 4);
            }
            if (class67.field987[0] == 2 && class67.field985[0] == 1) {
                Statics.field504[3].method5472(var4 + 15, 4);
            } else {
                Statics.field504[1].method5472(var4 + 15, 4);
            }
            arg0.method5159(class240.field3109, var4 + 32, 17, 16777215, -1);
            int var5 = field1158 + 610;
            if (class67.field987[0] == 3 && class67.field985[0] == 0) {
                Statics.field504[2].method5472(var5, 4);
            } else {
                Statics.field504[0].method5472(var5, 4);
            }
            if (class67.field987[0] == 3 && class67.field985[0] == 1) {
                Statics.field504[3].method5472(var5 + 15, 4);
            } else {
                Statics.field504[1].method5472(var5 + 15, 4);
            }
            arg0.method5159(class240.field3098, var5 + 32, 17, 16777215, -1);
        }
        class318.method5408(field1158 + 708, 4, 50, 16, 0);
        arg1.method5162(class240.field3063, field1158 + 708 + 25, 16, 16777215, -1);
        field1156 = -1;
        if (Statics.field1187 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class67.field983) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class67.field983) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class67.field983) {
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
            int var17 = field1158 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class67.field983; var20++) {
                class67 var21 = Statics.field982[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field989);
                if (var21.field989 == -1) {
                    var23 = class240.field2992;
                    var22 = false;
                } else if (var21.field989 > 1980) {
                    var23 = class240.field2895;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1474()) {
                    if (var21.method1483()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1476()) {
                    var24 = 16711680;
                    if (var21.method1483()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1475()) {
                    if (var21.method1483()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1483()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class49.field456 >= var17 && class49.field458 * -53945113 >= var16 && class49.field456 < var6 + var17 && class49.field458 * -53945113 < var7 + var16 && var22) {
                    field1156 = var20;
                    Statics.field1187[var25].method5506(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1187[var25].method5496(var17, var16);
                }
                if (Statics.field2033 != null) {
                    Statics.field2033[(var21.method1483() ? 8 : 0) + var21.field984].method5472(var17 + 29, var16);
                }
                arg0.method5162(Integer.toString(var21.field992), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method5162(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method5154(Statics.field982[field1156].field991) + 6;
                int var27 = arg1.field3728 + 8;
                class318.method5408(class49.field456 - var26 / 2, class49.field458 * -53945113 + 20 + 5, var26, var27, 16777120);
                class318.method5412(class49.field456 - var26 / 2, class49.field458 * -53945113 + 20 + 5, var26, var27, 0);
                arg1.method5162(Statics.field982[field1156].field991, class49.field456, class49.field458 * -53945113 + 20 + 5 + arg1.field3728 + 4, 0, -1);
            }
        }
        Statics.field195.method700(0, 0);
    }

    @ObfuscatedName("dv.m(Lap;I)V")
    public static void method2350(class48 arg0) {
        if (class49.field464 != 1 && Statics.field2577 || class49.field464 != 4) {
            return;
        }
        int var1 = field1158 + 280;
        if (class49.field465 >= var1 && class49.field465 <= var1 + 14 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(0, 0);
            return;
        }
        if (class49.field465 >= var1 + 15 && class49.field465 <= var1 + 80 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(0, 1);
            return;
        }
        int var2 = field1158 + 390;
        if (class49.field465 >= var2 && class49.field465 <= var2 + 14 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(1, 0);
            return;
        }
        if (class49.field465 >= var2 + 15 && class49.field465 <= var2 + 80 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(1, 1);
            return;
        }
        int var3 = field1158 + 500;
        if (class49.field465 >= var3 && class49.field465 <= var3 + 14 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(2, 0);
            return;
        }
        if (class49.field465 >= var3 + 15 && class49.field465 <= var3 + 80 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(2, 1);
            return;
        }
        int var4 = field1158 + 610;
        if (class49.field465 >= var4 && class49.field465 <= var4 + 14 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(3, 0);
            return;
        }
        if (class49.field465 >= var4 + 15 && class49.field465 <= var4 + 80 && class49.field447 >= 4 && class49.field447 <= 18) {
            class67.method953(3, 1);
            return;
        }
        if (class49.field465 >= field1158 + 708 && class49.field447 >= 4 && class49.field465 <= field1158 + 708 + 50 && class49.field447 <= 20) {
            field1154 = false;
            Statics.field1129.method5496(field1158, 0);
            Statics.field1385.method5496(field1158 + 382, 0);
            Statics.field5.method5472(field1158 + 382 - Statics.field5.field3817 / 2, 18);
            return;
        }
        if (field1156 == -1) {
            return;
        }
        class67 var5 = Statics.field982[field1156];
        method3017(var5);
        field1154 = false;
        Statics.field1129.method5496(field1158, 0);
        Statics.field1385.method5496(field1158 + 382, 0);
        Statics.field5.method5472(field1158 + 382 - Statics.field5.field3817 / 2, 18);
        return;
    }

    @ObfuscatedName("fu.h(Lbv;I)V")
    public static void method3017(class67 arg0) {
        if (arg0.method1483() != client.field818) {
            client.field818 = arg0.method1483();
            boolean var1 = arg0.method1483();
            if (Statics.field3647 != var1) {
                class272.method2323();
                Statics.field3647 = var1;
            }
        }
        Statics.field315 = arg0.field986;
        client.field711 = arg0.field992;
        client.field782 = arg0.field979;
        Statics.field308 = client.field786 == 0 ? 43594 : arg0.field992 + 40000;
        Statics.field2407 = client.field786 == 0 ? 443 : arg0.field992 + 50000;
        Statics.field166 = Statics.field308;
    }
}
