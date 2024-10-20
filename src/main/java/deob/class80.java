package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;
import javax.imageio.ImageIO;

@ObfuscatedName("ci")
public class class80 {

    @ObfuscatedName("ci.q")
    public static int field1132 = 0;

    @ObfuscatedName("ci.x")
    public static int field1142 = field1132 + 202;

    @ObfuscatedName("ci.e")
    public static int[] field1143 = new int[256];

    @ObfuscatedName("ci.f")
    public static int field1144 = 0;

    @ObfuscatedName("ci.at")
    public static int field1171 = 0;

    @ObfuscatedName("ci.af")
    public static int field1146 = 0;

    @ObfuscatedName("ci.ah")
    public static int field1147 = 0;

    @ObfuscatedName("ci.ab")
    public static int field1160 = 0;

    @ObfuscatedName("ci.aa")
    public static int field1149 = 0;

    @ObfuscatedName("ci.ac")
    public static int field1150 = 10;

    @ObfuscatedName("ci.ad")
    public static String field1151 = "";

    @ObfuscatedName("ci.aw")
    public static int field1152 = -1;

    @ObfuscatedName("ci.au")
    public static int field1153 = 1;

    @ObfuscatedName("ci.ao")
    public static int field1154 = 0;

    @ObfuscatedName("ci.ai")
    public static String field1140 = "";

    @ObfuscatedName("ci.ae")
    public static String field1141 = "";

    @ObfuscatedName("ci.as")
    public static String field1157 = "";

    @ObfuscatedName("ci.bw")
    public static String field1158 = "";

    @ObfuscatedName("ci.bg")
    public static String field1159 = "";

    @ObfuscatedName("ci.bu")
    public static String field1155 = "";

    @ObfuscatedName("ci.bb")
    public static boolean field1166 = false;

    @ObfuscatedName("ci.bf")
    public static boolean field1165 = false;

    @ObfuscatedName("ci.bn")
    public static boolean field1163 = true;

    @ObfuscatedName("ci.bl")
    public static int field1156 = 0;

    @ObfuscatedName("ci.bi")
    public static String field1139 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.bo")
    public static String field1161 = "1234567890";

    @ObfuscatedName("ci.bz")
    public static boolean field1167 = false;

    @ObfuscatedName("ci.by")
    public static int field1168 = -1;

    @ObfuscatedName("ci.bk")
    public static long field1169;

    @ObfuscatedName("ci.cq")
    public static long field1170;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1169 = -1L;
        field1170 = -1L;
    }

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.c(Lih;Lih;B)I")
    public static int method194(class250 arg0, class250 arg1) {
        int var2 = 0;
        if (arg0.method4298("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4298("logo", "")) {
            var2++;
        }
        if (arg1.method4298("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4298("titlebox", "")) {
            var2++;
        }
        if (arg1.method4298("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4298("runes", "")) {
            var2++;
        }
        if (arg1.method4298("title_mute", "")) {
            var2++;
        }
        if (arg1.method4298("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4298("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4298("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4298("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4298("sl_back", "");
        arg1.method4298("sl_flags", "");
        arg1.method4298("sl_arrows", "");
        arg1.method4298("sl_stars", "");
        arg1.method4298("sl_button", "");
        return var2;
    }

    @ObfuscatedName("au.q(I)I")
    public static int method706() {
        return 11;
    }

    @ObfuscatedName("ct.m(Lih;Lih;ZIB)V")
    public static void method1815(class250 arg0, class250 arg1, boolean arg2, int arg3) {
        if (!Statics.field1164) {
            field1154 = arg3;
            class320.method5375();
            byte[] var4 = arg0.method4294("title.jpg", "");
            Object var5 = null;
            class324 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class324(var9, var7, var8);
                    break label144;
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class324(0, 0);
            }
            Statics.field1136 = var11;
            Statics.field2 = Statics.field1136.method5480();
            if ((client.field645 & 0x20000000) == 0) {
                Statics.field1137 = class325.method4194(arg1, "logo", "");
            } else {
                Statics.field1137 = class325.method4194(arg1, "logo_deadman_mode", "");
            }
            Statics.field1133 = class325.method4194(arg1, "titlebox", "");
            Statics.field1134 = class325.method4194(arg1, "titlebutton", "");
            Statics.field1135 = class325.method4472(arg1, "runes", "");
            Statics.field1138 = class325.method4472(arg1, "title_mute", "");
            Statics.field2319 = class325.method4194(arg1, "options_radio_buttons,0", "");
            Statics.field1031 = class325.method4194(arg1, "options_radio_buttons,4", "");
            Statics.field1145 = class325.method4194(arg1, "options_radio_buttons,2", "");
            Statics.field564 = class325.method4194(arg1, "options_radio_buttons,6", "");
            Statics.field3207 = Statics.field2319.field3845;
            Statics.field1947 = Statics.field2319.field3846;
            Statics.field378 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field378[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field378[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field378[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field378[var17 + 192] = 16777215;
            }
            Statics.field370 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field370[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field370[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field370[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field370[var21 + 192] = 16777215;
            }
            Statics.field313 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field313[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field313[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field313[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field313[var25 + 192] = 16777215;
            }
            Statics.field594 = new int[256];
            Statics.field1731 = new int[32768];
            Statics.field1960 = new int[32768];
            method1019((class323) null);
            Statics.field137 = new int[32768];
            Statics.field2436 = new int[32768];
            if (arg2) {
                field1159 = "";
                field1155 = "";
            }
            Statics.field2507 = 0;
            Statics.field93 = "";
            field1163 = true;
            field1167 = false;
            if (Statics.field580.field1019) {
                class220.method286(2);
            } else {
                class252 var26 = Statics.field3168;
                int var27 = var26.method4228("scape main");
                int var28 = var26.method4255(var27, "");
                class220.method2873(2, var26, var27, var28, 255, false);
            }
            class253.method4196(false);
            Statics.field1164 = true;
            field1132 = (Statics.field1983 - 765) / 2;
            field1142 = field1132 + 202;
            Statics.field3869 = field1142 + 180;
            Statics.field1136.method5489(field1132, 0);
            Statics.field2.method5489(field1132 + 382, 0);
            Statics.field1137.method5471(field1132 + 382 - Statics.field1137.field3845 / 2, 18);
        } else if (arg3 == 4) {
            field1154 = 4;
        }
    }

    @ObfuscatedName("a.j(ZZB)Llp;")
    public static class323 method294(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field564 : Statics.field1145) : (arg1 ? Statics.field1031 : Statics.field2319);
    }

    @ObfuscatedName("client.g(I)Ljava/lang/String;")
    public static String method1447() {
        return Statics.field580.field1022 ? class308.method3175(field1159) : field1159;
    }

    @ObfuscatedName("f.i(B)V")
    public static void method451() {
        if (!Statics.field1164) {
            return;
        }
        Statics.field1133 = null;
        Statics.field1134 = null;
        Statics.field1135 = null;
        Statics.field1136 = null;
        Statics.field2 = null;
        Statics.field1137 = null;
        Statics.field1138 = null;
        Statics.field2319 = null;
        Statics.field1145 = null;
        Statics.field320 = null;
        Statics.field1095 = null;
        Statics.field2385 = null;
        Statics.field404 = null;
        Statics.field62 = null;
        Statics.field378 = null;
        Statics.field370 = null;
        Statics.field313 = null;
        Statics.field594 = null;
        Statics.field1731 = null;
        Statics.field1960 = null;
        Statics.field137 = null;
        Statics.field2436 = null;
        class220.method286(2);
        class253.method4196(true);
        Statics.field1164 = false;
    }

    @ObfuscatedName("ex.h(I)V")
    public static void method2863() {
        if (client.field681 && field1159 != null && field1159.length() > 0) {
            field1156 = 1;
        } else {
            field1156 = 0;
        }
    }

    @ObfuscatedName("f.l(Lam;B)V")
    public static void method453(class48 arg0) {
        if (!field1167) {
            if ((class49.field469 == 1 || !Statics.field1393 && class49.field469 == 4) && class49.field475 >= field1132 + 765 - 50 && class49.field478 >= 453) {
                Statics.field580.field1019 = !Statics.field580.field1019;
                class68.method1080();
                if (Statics.field580.field1019) {
                    Statics.field1971.method3852();
                    class220.field2500 = 1;
                    Statics.field1392 = null;
                } else {
                    class252 var6 = Statics.field3168;
                    int var7 = var6.method4228("scape main");
                    int var8 = var6.method4255(var7, "");
                    class220.method88(var6, var7, var8, 255, false);
                }
            }
            if (client.field652 != 5) {
                if (field1169 == -1L) {
                    field1169 = class187.method918() + 1000L;
                }
                long var9 = class187.method918();
                boolean var12;
                if (client.field910 == null || client.field911 >= client.field910.size()) {
                    var12 = true;
                } else {
                    while (true) {
                        if (client.field911 >= client.field910.size()) {
                            var12 = true;
                            break;
                        }
                        class54 var11 = (class54) client.field910.get(client.field911);
                        if (!var11.method956()) {
                            var12 = false;
                            break;
                        }
                        client.field911++;
                    }
                }
                if (var12 && field1170 == -1L) {
                    field1170 = var9;
                    if (field1170 > field1169) {
                        field1169 = field1170;
                    }
                }
                field1160++;
                if (client.field652 == 10 || client.field652 == 11) {
                    if (client.field649 == 0) {
                        if (class49.field469 == 1 || !Statics.field1393 && class49.field469 == 4) {
                            int var13 = field1132 + 5;
                            short var14 = 463;
                            byte var15 = 100;
                            byte var16 = 35;
                            if (class49.field475 >= var13 && class49.field475 <= var13 + var15 && class49.field478 >= var14 && class49.field478 <= var14 + var16) {
                                method376();
                                return;
                            }
                        }
                        if (Statics.field1007 != null) {
                            method376();
                        }
                    }
                    int var17 = class49.field469;
                    int var18 = class49.field475;
                    int var19 = class49.field478;
                    if (var17 == 0) {
                        var18 = class49.field466;
                        var19 = class49.field468;
                    }
                    if (!Statics.field1393 && var17 == 4) {
                        var17 = 1;
                    }
                    if (field1154 == 0) {
                        boolean var20 = false;
                        while (class40.method903()) {
                            if (Statics.field3164 == 84) {
                                var20 = true;
                            }
                        }
                        int var21 = Statics.field3869 - 80;
                        short var22 = 291;
                        if (var17 == 1 && var18 >= var21 - 75 && var18 <= var21 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20) {
                            class46.method3140(client.method4189("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var23 = Statics.field3869 + 80;
                        if (var17 == 1 && var18 >= var23 - 75 && var18 <= var23 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20 || var20) {
                            if ((client.field645 & 0x2000000) != 0) {
                                field1140 = "";
                                field1141 = class240.field3051;
                                field1157 = class240.field3052;
                                field1158 = class240.field3053;
                                field1154 = 1;
                                method2863();
                            } else if ((client.field645 & 0x4) != 0) {
                                if ((client.field645 & 0x400) == 0) {
                                    field1141 = class240.field2994;
                                    field1157 = class240.field3043;
                                    field1158 = class240.field2833;
                                } else {
                                    field1141 = class240.field3077;
                                    field1157 = class240.field2979;
                                    field1158 = class240.field3050;
                                }
                                field1140 = class240.field3041;
                                field1154 = 1;
                                method2863();
                            } else if ((client.field645 & 0x400) == 0) {
                                method540(false);
                            } else {
                                field1141 = class240.field3045;
                                field1157 = class240.field2842;
                                field1158 = class240.field3047;
                                field1140 = class240.field3041;
                                field1154 = 1;
                                method2863();
                            }
                        }
                    } else if (field1154 == 1) {
                        while (class40.method903()) {
                            if (Statics.field3164 == 84) {
                                method540(false);
                            } else if (Statics.field3164 == 13) {
                                field1154 = 0;
                            }
                        }
                        int var24 = Statics.field3869 - 80;
                        short var25 = 321;
                        if (var17 == 1 && var18 >= var24 - 75 && var18 <= var24 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                            method540(false);
                        }
                        int var26 = Statics.field3869 + 80;
                        if (var17 == 1 && var18 >= var26 - 75 && var18 <= var26 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                            field1154 = 0;
                        }
                    } else if (field1154 == 2) {
                        short var27 = 201;
                        int var65 = var27 + 52;
                        if (var17 == 1 && var19 >= var65 - 12 && var19 < var65 + 2) {
                            field1156 = 0;
                        }
                        var65 += 15;
                        if (var17 == 1 && var19 >= var65 - 12 && var19 < var65 + 2) {
                            field1156 = 1;
                        }
                        var65 += 15;
                        short var28 = 361;
                        if (Statics.field298 != null) {
                            int var29 = Statics.field298.field3808 / 2;
                            if (var17 == 1 && var18 >= Statics.field298.field3805 - var29 && var18 <= Statics.field298.field3805 + var29 && var19 >= var28 - 15 && var19 < var28) {
                                switch(field1153) {
                                    case 1:
                                        method1816(class240.field3075, class240.field2971, class240.field3016);
                                        field1154 = 5;
                                        return;
                                    case 2:
                                        class46.method3140("https://support.runescape.com/hc/en-gb", true, false);
                                }
                            }
                        }
                        int var30 = Statics.field3869 - 80;
                        short var31 = 321;
                        if (var17 == 1 && var18 >= var30 - 75 && var18 <= var30 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                            field1159 = field1159.trim();
                            if (field1159.length() == 0) {
                                method1816(class240.field2943, class240.field2944, class240.field2945);
                                return;
                            }
                            if (field1155.length() == 0) {
                                method1816(class240.field2946, class240.field2947, class240.field2948);
                                return;
                            }
                            method1816(class240.field3085, class240.field2935, class240.field2928);
                            client.method43(false);
                            client.method987(20);
                            return;
                        }
                        int var32 = field1142 + 180 + 80;
                        if (var17 == 1 && var18 >= var32 - 75 && var18 <= var32 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                            field1154 = 0;
                            field1159 = "";
                            field1155 = "";
                            Statics.field2507 = 0;
                            Statics.field93 = "";
                            field1163 = true;
                        }
                        int var33 = Statics.field3869 + -117;
                        short var34 = 277;
                        field1166 = var18 >= var33 && var18 < Statics.field3207 + var33 && var19 >= var34 && var19 < Statics.field1947 + var34;
                        if (var17 == 1 && field1166) {
                            client.field681 = !client.field681;
                            if (!client.field681 && Statics.field580.field1016 != null) {
                                Statics.field580.field1016 = null;
                                class68.method1080();
                            }
                        }
                        int var35 = Statics.field3869 + 24;
                        short var36 = 277;
                        field1165 = var18 >= var35 && var18 < Statics.field3207 + var35 && var19 >= var36 && var19 < Statics.field1947 + var36;
                        if (var17 == 1 && field1165) {
                            Statics.field580.field1022 = !Statics.field580.field1022;
                            if (!Statics.field580.field1022) {
                                field1159 = "";
                                Statics.field580.field1016 = null;
                                method2863();
                            }
                            class68.method1080();
                        }
                        while (true) {
                            while (class40.method903()) {
                                boolean var37 = false;
                                for (int var38 = 0; var38 < field1139.length(); var38++) {
                                    if (Statics.field1996 == field1139.charAt(var38)) {
                                        var37 = true;
                                        break;
                                    }
                                }
                                if (Statics.field3164 == 13) {
                                    field1154 = 0;
                                    field1159 = "";
                                    field1155 = "";
                                    Statics.field2507 = 0;
                                    Statics.field93 = "";
                                    field1163 = true;
                                } else if (field1156 == 0) {
                                    if (Statics.field3164 == 85 && field1159.length() > 0) {
                                        field1159 = field1159.substring(0, field1159.length() - 1);
                                    }
                                    if (Statics.field3164 == 84 || Statics.field3164 == 80) {
                                        field1156 = 1;
                                    }
                                    if (var37 && field1159.length() < 320) {
                                        field1159 = field1159 + Statics.field1996;
                                    }
                                } else if (field1156 == 1) {
                                    if (Statics.field3164 == 85 && field1155.length() > 0) {
                                        field1155 = field1155.substring(0, field1155.length() - 1);
                                    }
                                    if (Statics.field3164 == 84 || Statics.field3164 == 80) {
                                        field1156 = 0;
                                    }
                                    if (Statics.field3164 == 84) {
                                        field1159 = field1159.trim();
                                        if (field1159.length() == 0) {
                                            method1816(class240.field2943, class240.field2944, class240.field2945);
                                            return;
                                        }
                                        if (field1155.length() == 0) {
                                            method1816(class240.field2946, class240.field2947, class240.field2948);
                                            return;
                                        }
                                        method1816(class240.field3085, class240.field2935, class240.field2928);
                                        client.method43(false);
                                        client.method987(20);
                                        return;
                                    }
                                    if (var37 && field1155.length() < 20) {
                                        field1155 = field1155 + Statics.field1996;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1154 == 3) {
                        int var39 = field1142 + 180;
                        short var40 = 276;
                        if (var17 == 1 && var18 >= var39 - 75 && var18 <= var39 + 75 && var19 >= var40 - 20 && var19 <= var40 + 20) {
                            method540(false);
                        }
                        int var41 = field1142 + 180;
                        short var42 = 326;
                        if (var17 == 1 && var18 >= var41 - 75 && var18 <= var41 + 75 && var19 >= var42 - 20 && var19 <= var42 + 20) {
                            method1816(class240.field3075, class240.field2971, class240.field3016);
                            field1154 = 5;
                            return;
                        }
                    } else if (field1154 == 4) {
                        int var43 = field1142 + 180 - 80;
                        short var44 = 321;
                        if (var17 == 1 && var18 >= var43 - 75 && var18 <= var43 + 75 && var19 >= var44 - 20 && var19 <= var44 + 20) {
                            Statics.field93.trim();
                            if (Statics.field93.length() != 6) {
                                method1816(class240.field2965, class240.field2934, class240.field2864);
                                return;
                            }
                            Statics.field2507 = Integer.parseInt(Statics.field93);
                            Statics.field93 = "";
                            client.method43(true);
                            method1816(class240.field3085, class240.field2935, class240.field2928);
                            client.method987(20);
                            return;
                        }
                        if (var17 == 1 && var18 >= field1142 + 180 - 9 && var18 <= field1142 + 180 + 130 && var19 >= 263 && var19 <= 296) {
                            field1163 = !field1163;
                        }
                        if (var17 == 1 && var18 >= field1142 + 180 - 34 && var18 <= field1142 + 180 + 34 && var19 >= 351 && var19 <= 363) {
                            class46.method3140(client.method4189("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var45 = field1142 + 180 + 80;
                        if (var17 == 1 && var18 >= var45 - 75 && var18 <= var45 + 75 && var19 >= var44 - 20 && var19 <= var44 + 20) {
                            field1154 = 0;
                            field1159 = "";
                            field1155 = "";
                            Statics.field2507 = 0;
                            Statics.field93 = "";
                        }
                        while (class40.method903()) {
                            boolean var46 = false;
                            for (int var47 = 0; var47 < field1161.length(); var47++) {
                                if (Statics.field1996 == field1161.charAt(var47)) {
                                    var46 = true;
                                    break;
                                }
                            }
                            if (Statics.field3164 == 13) {
                                field1154 = 0;
                                field1159 = "";
                                field1155 = "";
                                Statics.field2507 = 0;
                                Statics.field93 = "";
                            } else {
                                if (Statics.field3164 == 85 && Statics.field93.length() > 0) {
                                    Statics.field93 = Statics.field93.substring(0, Statics.field93.length() - 1);
                                }
                                if (Statics.field3164 == 84) {
                                    Statics.field93.trim();
                                    if (Statics.field93.length() != 6) {
                                        method1816(class240.field2965, class240.field2934, class240.field2864);
                                        return;
                                    }
                                    Statics.field2507 = Integer.parseInt(Statics.field93);
                                    Statics.field93 = "";
                                    client.method43(true);
                                    method1816(class240.field3085, class240.field2935, class240.field2928);
                                    client.method987(20);
                                    return;
                                }
                                if (var46 && Statics.field93.length() < 6) {
                                    Statics.field93 = Statics.field93 + Statics.field1996;
                                }
                            }
                        }
                    } else if (field1154 == 5) {
                        int var48 = field1142 + 180 - 80;
                        short var49 = 321;
                        if (var17 == 1 && var18 >= var48 - 75 && var18 <= var48 + 75 && var19 >= var49 - 20 && var19 <= var49 + 20) {
                            method2638();
                            return;
                        }
                        int var50 = field1142 + 180 + 80;
                        if (var17 == 1 && var18 >= var50 - 75 && var18 <= var50 + 75 && var19 >= var49 - 20 && var19 <= var49 + 20) {
                            method540(true);
                        }
                        while (class40.method903()) {
                            boolean var51 = false;
                            for (int var52 = 0; var52 < field1139.length(); var52++) {
                                if (Statics.field1996 == field1139.charAt(var52)) {
                                    var51 = true;
                                    break;
                                }
                            }
                            if (Statics.field3164 == 13) {
                                method540(true);
                            } else {
                                if (Statics.field3164 == 85 && field1159.length() > 0) {
                                    field1159 = field1159.substring(0, field1159.length() - 1);
                                }
                                if (Statics.field3164 == 84) {
                                    method2638();
                                    return;
                                }
                                if (var51 && field1159.length() < 320) {
                                    field1159 = field1159 + Statics.field1996;
                                }
                            }
                        }
                    } else if (field1154 == 6) {
                        while (true) {
                            do {
                                if (!class40.method903()) {
                                    short var53 = 321;
                                    if (var17 == 1 && var19 >= var53 - 20 && var19 <= var53 + 20) {
                                        method540(true);
                                    }
                                    return;
                                }
                            } while (Statics.field3164 != 84 && Statics.field3164 != 13);
                            method540(true);
                        }
                    } else if (field1154 == 7) {
                        int var54 = field1142 + 180 - 80;
                        short var55 = 321;
                        if (var17 == 1 && var18 >= var54 - 75 && var18 <= var54 + 75 && var19 >= var55 - 20 && var19 <= var55 + 20) {
                            class46.method3140(client.method4189("secure", true) + "m=dob/set_dob.ws", true, false);
                            method1816(class240.field3080, class240.field3026, class240.field3082);
                            field1154 = 6;
                            return;
                        }
                        int var56 = field1142 + 180 + 80;
                        if (var17 == 1 && var18 >= var56 - 75 && var18 <= var56 + 75 && var19 >= var55 - 20 && var19 <= var55 + 20) {
                            method540(true);
                        }
                    } else if (field1154 == 8) {
                        int var57 = field1142 + 180 - 80;
                        short var58 = 321;
                        if (var17 == 1 && var18 >= var57 - 75 && var18 <= var57 + 75 && var19 >= var58 - 20 && var19 <= var58 + 20) {
                            class46.method3140("https://www.jagex.com/terms/privacy/#eight", true, false);
                            method1816(class240.field3080, class240.field3026, class240.field3082);
                            field1154 = 6;
                            return;
                        }
                        int var59 = field1142 + 180 + 80;
                        if (var17 == 1 && var18 >= var59 - 75 && var18 <= var59 + 75 && var19 >= var58 - 20 && var19 <= var58 + 20) {
                            method540(true);
                        }
                    } else if (field1154 == 12) {
                        String var60 = "";
                        switch(field1152) {
                            case 0:
                                var60 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                break;
                            case 1:
                                var60 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                break;
                            default:
                                method540(false);
                        }
                        int var61 = field1142 + 180;
                        short var62 = 276;
                        if (var17 == 1 && var18 >= var61 - 75 && var18 <= var61 + 75 && var19 >= var62 - 20 && var19 <= var62 + 20) {
                            class46.method3140(var60, true, false);
                            method1816(class240.field3080, class240.field3026, class240.field3082);
                            field1154 = 6;
                            return;
                        }
                        int var63 = field1142 + 180;
                        short var64 = 326;
                        if (var17 == 1 && var18 >= var63 - 75 && var18 <= var63 + 75 && var19 >= var64 - 20 && var19 <= var64 + 20) {
                            method540(false);
                        }
                    }
                }
            }
        } else if (class49.field469 == 1 || !Statics.field1393 && class49.field469 == 4) {
            int var1 = field1132 + 280;
            if (class49.field475 >= var1 && class49.field475 <= var1 + 14 && class49.field478 >= 4 && class49.field478 <= 18) {
                class67.method4586(0, 0);
            } else if (class49.field475 >= var1 + 15 && class49.field475 <= var1 + 80 && class49.field478 >= 4 && class49.field478 <= 18) {
                class67.method4586(0, 1);
            } else {
                int var2 = field1132 + 390;
                if (class49.field475 >= var2 && class49.field475 <= var2 + 14 && class49.field478 >= 4 && class49.field478 <= 18) {
                    class67.method4586(1, 0);
                } else if (class49.field475 >= var2 + 15 && class49.field475 <= var2 + 80 && class49.field478 >= 4 && class49.field478 <= 18) {
                    class67.method4586(1, 1);
                } else {
                    int var3 = field1132 + 500;
                    if (class49.field475 >= var3 && class49.field475 <= var3 + 14 && class49.field478 >= 4 && class49.field478 <= 18) {
                        class67.method4586(2, 0);
                    } else if (class49.field475 >= var3 + 15 && class49.field475 <= var3 + 80 && class49.field478 >= 4 && class49.field478 <= 18) {
                        class67.method4586(2, 1);
                    } else {
                        int var4 = field1132 + 610;
                        if (class49.field475 >= var4 && class49.field475 <= var4 + 14 && class49.field478 >= 4 && class49.field478 <= 18) {
                            class67.method4586(3, 0);
                        } else if (class49.field475 >= var4 + 15 && class49.field475 <= var4 + 80 && class49.field478 >= 4 && class49.field478 <= 18) {
                            class67.method4586(3, 1);
                        } else if (class49.field475 >= field1132 + 708 && class49.field478 >= 4 && class49.field475 <= field1132 + 708 + 50 && class49.field478 <= 20) {
                            field1167 = false;
                            Statics.field1136.method5489(field1132, 0);
                            Statics.field2.method5489(field1132 + 382, 0);
                            Statics.field1137.method5471(field1132 + 382 - Statics.field1137.field3845 / 2, 18);
                        } else if (field1168 != -1) {
                            class67 var5 = Statics.field1002[field1168];
                            method1642(var5);
                            field1167 = false;
                            Statics.field1136.method5489(field1132, 0);
                            Statics.field2.method5489(field1132 + 382, 0);
                            Statics.field1137.method5471(field1132 + 382 - Statics.field1137.field3845 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.o(ZI)V")
    public static void method540(boolean arg0) {
        field1141 = class240.field2925;
        field1157 = class240.field2855;
        field1158 = class240.field2874;
        field1154 = 2;
        if (arg0) {
            field1155 = "";
        }
        if (field1159 == null || field1159.length() <= 0) {
            if (Statics.field580.field1016 == null) {
                client.field681 = false;
            } else {
                field1159 = Statics.field580.field1016;
                client.field681 = true;
            }
        }
        method2863();
    }

    @ObfuscatedName("dm.k(S)V")
    public static void method2638() {
        field1159 = field1159.trim();
        if (field1159.length() == 0) {
            method1816(class240.field3075, class240.field2971, class240.field3016);
            return;
        }
        long var0 = class75.method1023();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1159;
            Random var4 = new Random();
            class185 var5 = new class185(128);
            class185 var6 = new class185(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3227(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3230(var4.nextInt());
            }
            var5.method3230(var7[0]);
            var5.method3230(var7[1]);
            var5.method3264(var0);
            var5.method3264(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3230(var4.nextInt());
            }
            var5.method3265(class75.field1099, class75.field1098);
            var6.method3227(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3230(var4.nextInt());
            }
            var6.method3264(var4.nextLong());
            var6.method3231(var4.nextLong());
            if (client.field683 == null) {
                byte[] var11 = new byte[24];
                try {
                    class158.field2015.method2243(0L);
                    class158.field2015.method2244(var11);
                    int var12;
                    for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                    }
                    if (var12 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var35) {
                    for (int var14 = 0; var14 < 24; var14++) {
                        var11[var14] = -1;
                    }
                }
                var6.method3237(var11, 0, var11.length);
            } else {
                var6.method3237(client.field683, 0, client.field683.length);
            }
            var6.method3264(var4.nextLong());
            var6.method3265(class75.field1099, class75.field1098);
            int var17 = class185.method1686(var3);
            if (var17 % 8 != 0) {
                var17 += 8 - var17 % 8;
            }
            class185 var18 = new class185(var17);
            var18.method3234(var3);
            var18.field2386 = var17;
            var18.method3261(var7);
            class185 var19 = new class185(var18.field2386 + var6.field2386 + var5.field2386 + 5);
            var19.method3227(2);
            var19.method3227(var5.field2386);
            var19.method3237(var5.field2388, 0, var5.field2386);
            var19.method3227(var6.field2386);
            var19.method3237(var6.field2388, 0, var6.field2386);
            var19.method3383(var18.field2386);
            var19.method3237(var18.field2388, 0, var18.field2386);
            String var20 = class307.method4205(var19.field2388);
            byte var27;
            try {
                URL var21 = new URL(client.method4189("services", false) + "m=accountappeal/login.ws");
                URLConnection var22 = var21.openConnection();
                var22.setDoInput(true);
                var22.setDoOutput(true);
                var22.setConnectTimeout(5000);
                OutputStreamWriter var23 = new OutputStreamWriter(var22.getOutputStream());
                var23.write("data2=" + class333.method4473(var20) + "&dest=" + class333.method4473("passwordchoice.ws"));
                var23.flush();
                InputStream var24 = var22.getInputStream();
                class185 var25 = new class185(new byte[1000]);
                while (true) {
                    int var26 = var24.read(var25.field2388, var25.field2386, 1000 - var25.field2386);
                    if (var26 == -1) {
                        var23.close();
                        var24.close();
                        String var28 = new String(var25.field2388);
                        if (var28.startsWith("OFFLINE")) {
                            var27 = 4;
                        } else if (var28.startsWith("WRONG")) {
                            var27 = 7;
                        } else if (var28.startsWith("RELOAD")) {
                            var27 = 3;
                        } else if (var28.startsWith("Not permitted for social network accounts.")) {
                            var27 = 6;
                        } else {
                            var25.method3262(var7);
                            while (var25.field2386 > 0 && var25.field2388[var25.field2386 - 1] == 0) {
                                var25.field2386--;
                            }
                            String var29 = new String(var25.field2388, 0, var25.field2386);
                            boolean var30;
                            if (var29 == null) {
                                var30 = false;
                            } else {
                                label106: {
                                    try {
                                        new URL(var29);
                                    } catch (MalformedURLException var33) {
                                        var30 = false;
                                        break label106;
                                    }
                                    var30 = true;
                                }
                            }
                            if (var30) {
                                class46.method3140(var29, true, false);
                                var27 = 2;
                            } else {
                                var27 = 5;
                            }
                        }
                        break;
                    }
                    var25.field2386 += var26;
                    if (var25.field2386 >= 1000) {
                        var27 = 5;
                        break;
                    }
                }
            } catch (Throwable var34) {
                var34.printStackTrace();
                var27 = 5;
            }
            var2 = var27;
        }
        switch(var2) {
            case 2:
                method1816(class240.field3037, class240.field3087, class240.field3088);
                field1154 = 6;
                break;
            case 3:
                method1816(class240.field3089, class240.field2835, class240.field3058);
                break;
            case 4:
                method1816(class240.field3092, class240.field3048, class240.field3094);
                break;
            case 5:
                method1816(class240.field3095, class240.field3096, class240.field3097);
                break;
            case 6:
                method1816(class240.field3098, class240.field3099, class240.field2888);
                break;
            case 7:
                method1816(class240.field3101, class240.field3044, class240.field2927);
        }
    }

    @ObfuscatedName("s.v(Lkh;Lkh;Lkh;ZI)V")
    public static void method123(class301 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg3) {
            field1132 = (Statics.field1983 - 765) / 2;
            field1142 = field1132 + 202;
            Statics.field3869 = field1142 + 180;
        }
        if (field1167) {
            if (Statics.field320 == null) {
                class252 var4 = Statics.field547;
                int var5 = var4.method4228("sl_back");
                int var6 = var4.method4255(var5, "");
                class324[] var7 = class325.method3520(var4, var5, var6);
                Statics.field320 = var7;
            }
            if (Statics.field1095 == null) {
                Statics.field1095 = class325.method4472(Statics.field547, "sl_flags", "");
            }
            if (Statics.field2385 == null) {
                Statics.field2385 = class325.method4472(Statics.field547, "sl_arrows", "");
            }
            if (Statics.field404 == null) {
                Statics.field404 = class325.method4472(Statics.field547, "sl_stars", "");
            }
            class320.method5379(field1132, 23, 765, 480, 0);
            class320.method5380(field1132, 0, 125, 23, 12425273, 9135624);
            class320.method5380(field1132 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5151(class240.field3066, field1132 + 62, 15, 0, -1);
            if (Statics.field404 != null) {
                Statics.field404[1].method5471(field1132 + 140, 1);
                arg1.method5217(class240.field3109, field1132 + 152, 10, 16777215, -1);
                Statics.field404[0].method5471(field1132 + 140, 12);
                arg1.method5217(class240.field3110, field1132 + 152, 21, 16777215, -1);
            }
            if (Statics.field2385 != null) {
                int var8 = field1132 + 280;
                if (class67.field1013[0] == 0 && class67.field1006[0] == 0) {
                    Statics.field2385[2].method5471(var8, 4);
                } else {
                    Statics.field2385[0].method5471(var8, 4);
                }
                if (class67.field1013[0] == 0 && class67.field1006[0] == 1) {
                    Statics.field2385[3].method5471(var8 + 15, 4);
                } else {
                    Statics.field2385[1].method5471(var8 + 15, 4);
                }
                arg0.method5217(class240.field2899, var8 + 32, 17, 16777215, -1);
                int var9 = field1132 + 390;
                if (class67.field1013[0] == 1 && class67.field1006[0] == 0) {
                    Statics.field2385[2].method5471(var9, 4);
                } else {
                    Statics.field2385[0].method5471(var9, 4);
                }
                if (class67.field1013[0] == 1 && class67.field1006[0] == 1) {
                    Statics.field2385[3].method5471(var9 + 15, 4);
                } else {
                    Statics.field2385[1].method5471(var9 + 15, 4);
                }
                arg0.method5217(class240.field3111, var9 + 32, 17, 16777215, -1);
                int var10 = field1132 + 500;
                if (class67.field1013[0] == 2 && class67.field1006[0] == 0) {
                    Statics.field2385[2].method5471(var10, 4);
                } else {
                    Statics.field2385[0].method5471(var10, 4);
                }
                if (class67.field1013[0] == 2 && class67.field1006[0] == 1) {
                    Statics.field2385[3].method5471(var10 + 15, 4);
                } else {
                    Statics.field2385[1].method5471(var10 + 15, 4);
                }
                arg0.method5217(class240.field3113, var10 + 32, 17, 16777215, -1);
                int var11 = field1132 + 610;
                if (class67.field1013[0] == 3 && class67.field1006[0] == 0) {
                    Statics.field2385[2].method5471(var11, 4);
                } else {
                    Statics.field2385[0].method5471(var11, 4);
                }
                if (class67.field1013[0] == 3 && class67.field1006[0] == 1) {
                    Statics.field2385[3].method5471(var11 + 15, 4);
                } else {
                    Statics.field2385[1].method5471(var11 + 15, 4);
                }
                arg0.method5217(class240.field2933, var11 + 32, 17, 16777215, -1);
            }
            class320.method5379(field1132 + 708, 4, 50, 16, 0);
            arg1.method5151(class240.field2866, field1132 + 708 + 25, 16, 16777215, -1);
            field1168 = -1;
            if (Statics.field320 != null) {
                byte var12 = 88;
                byte var13 = 19;
                int var14 = 765 / (var12 + 1);
                int var15 = 480 / (var13 + 1);
                int var16;
                int var17;
                do {
                    var16 = var15;
                    var17 = var14;
                    if ((var14 - 1) * var15 >= class67.field1003) {
                        var14--;
                    }
                    if ((var15 - 1) * var14 >= class67.field1003) {
                        var15--;
                    }
                    if ((var15 - 1) * var14 >= class67.field1003) {
                        var15--;
                    }
                } while (var15 != var16 || var14 != var17);
                int var18 = (765 - var12 * var14) / (var14 + 1);
                if (var18 > 5) {
                    var18 = 5;
                }
                int var19 = (480 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (765 - var12 * var14 - (var14 - 1) * var18) / 2;
                int var21 = (480 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = var21 + 23;
                int var23 = field1132 + var20;
                int var24 = 0;
                boolean var25 = false;
                for (int var26 = 0; var26 < class67.field1003; var26++) {
                    class67 var27 = Statics.field1002[var26];
                    boolean var28 = true;
                    String var29 = Integer.toString(var27.field1010);
                    if (var27.field1010 == -1) {
                        var29 = class240.field2908;
                        var28 = false;
                    } else if (var27.field1010 > 1980) {
                        var29 = class240.field3116;
                        var28 = false;
                    }
                    int var30 = 0;
                    byte var31;
                    if (var27.method1504()) {
                        if (var27.method1487()) {
                            var31 = 7;
                        } else {
                            var31 = 6;
                        }
                    } else if (var27.method1482()) {
                        var30 = 16711680;
                        if (var27.method1487()) {
                            var31 = 5;
                        } else {
                            var31 = 4;
                        }
                    } else if (var27.method1479()) {
                        if (var27.method1487()) {
                            var31 = 3;
                        } else {
                            var31 = 2;
                        }
                    } else if (var27.method1487()) {
                        var31 = 1;
                    } else {
                        var31 = 0;
                    }
                    if (class49.field466 >= var23 && class49.field468 >= var22 && class49.field466 < var12 + var23 && class49.field468 < var13 + var22 && var28) {
                        field1168 = var26;
                        Statics.field320[var31].method5530(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field320[var31].method5489(var23, var22);
                    }
                    if (Statics.field1095 != null) {
                        Statics.field1095[(var27.method1487() ? 8 : 0) + var27.field999].method5471(var23 + 29, var22);
                    }
                    arg0.method5151(Integer.toString(var27.field1008), var23 + 15, var13 / 2 + var22 + 5, var30, -1);
                    arg1.method5151(var29, var23 + 60, var13 / 2 + var22 + 5, 268435455, -1);
                    var22 += var13 + var19;
                    var24++;
                    if (var24 >= var15) {
                        var22 = var21 + 23;
                        var23 += var12 + var18;
                        var24 = 0;
                    }
                }
                if (var25) {
                    int var32 = arg1.method5177(Statics.field1002[field1168].field1012) + 6;
                    int var33 = arg1.field3737 + 8;
                    class320.method5379(class49.field466 - var32 / 2, class49.field468 + 20 + 5, var32, var33, 16777120);
                    class320.method5383(class49.field466 - var32 / 2, class49.field468 + 20 + 5, var32, var33, 0);
                    arg1.method5151(Statics.field1002[field1168].field1012, class49.field466, class49.field468 + 20 + 5 + arg1.field3737 + 4, 0, -1);
                }
            }
            Statics.field1928.method711(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1136.method5489(field1132, 0);
            Statics.field2.method5489(field1132 + 382, 0);
            Statics.field1137.method5471(field1132 + 382 - Statics.field1137.field3845 / 2, 18);
        }
        if (client.field652 == 0 || client.field652 == 5) {
            byte var34 = 20;
            arg0.method5151(class240.field2949, field1142 + 180, 245 - var34, 16777215, -1);
            int var35 = 253 - var34;
            class320.method5383(field1142 + 180 - 152, var35, 304, 34, 9179409);
            class320.method5383(field1142 + 180 - 151, var35 + 1, 302, 32, 0);
            class320.method5379(field1142 + 180 - 150, var35 + 2, field1150 * 3, 30, 9179409);
            class320.method5379(field1150 * 3 + (field1142 + 180 - 150), var35 + 2, 300 - field1150 * 3, 30, 0);
            arg0.method5151(field1151, field1142 + 180, 276 - var34, 16777215, -1);
        }
        if (client.field652 == 20) {
            Statics.field1133.method5471(field1142 + 180 - Statics.field1133.field3845 / 2, 271 - Statics.field1133.field3846 / 2);
            short var36 = 201;
            arg0.method5151(field1141, field1142 + 180, var36, 16776960, 0);
            int var156 = var36 + 15;
            arg0.method5151(field1157, field1142 + 180, var156, 16776960, 0);
            int var157 = var156 + 15;
            arg0.method5151(field1158, field1142 + 180, var157, 16776960, 0);
            int var158 = var157 + 15;
            int var159 = var158 + 7;
            if (field1154 != 4) {
                arg0.method5217(class240.field3059, field1142 + 180 - 110, var159, 16777215, 0);
                short var37 = 200;
                String var38;
                for (var38 = method1447(); arg0.method5177(var38) > var37; var38 = var38.substring(0, var38.length() - 1)) {
                }
                arg0.method5217(class302.method5147(var38), field1142 + 180 - 70, var159, 16777215, 0);
                var156 = var159 + 15;
                arg0.method5217(class240.field3108 + class308.method3175(field1155), field1142 + 180 - 108, var156, 16777215, 0);
                var156 += 15;
            }
        }
        if (client.field652 == 10 || client.field652 == 11) {
            Statics.field1133.method5471(field1142, 171);
            if (field1154 == 0) {
                short var39 = 251;
                arg0.method5151(class240.field3062, field1142 + 180, var39, 16776960, 0);
                int var160 = var39 + 30;
                int var40 = field1142 + 180 - 80;
                short var41 = 291;
                Statics.field1134.method5471(var40 - 73, var41 - 20);
                arg0.method5152(class240.field3063, var40 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var42 = field1142 + 180 + 80;
                Statics.field1134.method5471(var42 - 73, var41 - 20);
                arg0.method5152(class240.field3064, var42 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1154 == 1) {
                arg0.method5151(field1140, field1142 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method5151(field1141, field1142 + 180, var43, 16777215, 0);
                int var161 = var43 + 15;
                arg0.method5151(field1157, field1142 + 180, var161, 16777215, 0);
                int var162 = var161 + 15;
                arg0.method5151(field1158, field1142 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                int var44 = field1142 + 180 - 80;
                short var45 = 321;
                Statics.field1134.method5471(var44 - 73, var45 - 20);
                arg0.method5151(class240.field2829, var44, var45 + 5, 16777215, 0);
                int var46 = field1142 + 180 + 80;
                Statics.field1134.method5471(var46 - 73, var45 - 20);
                arg0.method5151(class240.field2866, var46, var45 + 5, 16777215, 0);
            } else if (field1154 == 2) {
                short var47 = 201;
                arg0.method5151(field1141, Statics.field3869, var47, 16776960, 0);
                int var164 = var47 + 15;
                arg0.method5151(field1157, Statics.field3869, var164, 16776960, 0);
                int var165 = var164 + 15;
                arg0.method5151(field1158, Statics.field3869, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var167 = var166 + 7;
                arg0.method5217(class240.field3059, Statics.field3869 - 110, var167, 16777215, 0);
                short var48 = 200;
                String var49;
                for (var49 = method1447(); arg0.method5177(var49) > var48; var49 = var49.substring(1)) {
                }
                arg0.method5217(class302.method5147(var49) + (field1156 == 0 & client.field654 % 40 < 20 ? class76.method676(16776960) + class76.field1108 : ""), Statics.field3869 - 70, var167, 16777215, 0);
                var164 = var167 + 15;
                arg0.method5217(class240.field3108 + class308.method3175(field1155) + (field1156 == 1 & client.field654 % 40 < 20 ? class76.method676(16776960) + class76.field1108 : ""), Statics.field3869 - 108, var164, 16777215, 0);
                var164 += 15;
                short var50 = 277;
                int var51 = Statics.field3869 + -117;
                class323 var52 = method294(client.field681, field1166);
                var52.method5471(var51, var50);
                int var53 = var52.field3845 + 5 + var51;
                arg1.method5217(class240.field3067, var53, var50 + 13, 16776960, 0);
                int var54 = Statics.field3869 + 24;
                class323 var55 = method294(Statics.field580.field1022, field1165);
                var55.method5471(var54, var50);
                int var56 = var55.field3845 + 5 + var54;
                arg1.method5217(class240.field3068, var56, var50 + 13, 16776960, 0);
                int var168 = var50 + 15;
                int var57 = Statics.field3869 - 80;
                short var58 = 321;
                Statics.field1134.method5471(var57 - 73, var58 - 20);
                arg0.method5151(class240.field3065, var57, var58 + 5, 16777215, 0);
                int var59 = Statics.field3869 + 80;
                Statics.field1134.method5471(var59 - 73, var58 - 20);
                arg0.method5151(class240.field2866, var59, var58 + 5, 16777215, 0);
                short var60 = 357;
                switch(field1153) {
                    case 2:
                        Statics.field1859 = class240.field3079;
                        break;
                    default:
                        Statics.field1859 = class240.field2872;
                }
                Statics.field298 = new class316(Statics.field3869, var60, arg1.method5177(Statics.field1859), 11);
                arg1.method5151(Statics.field1859, Statics.field3869, var60, 16777215, 0);
            } else if (field1154 == 3) {
                short var61 = 201;
                arg0.method5151(class240.field3033, field1142 + 180, var61, 16776960, 0);
                int var169 = var61 + 20;
                arg1.method5151(class240.field2832, field1142 + 180, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg1.method5151(class240.field2870, field1142 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                int var62 = field1142 + 180;
                short var63 = 276;
                Statics.field1134.method5471(var62 - 73, var63 - 20);
                arg2.method5151(class240.field2838, var62, var63 + 5, 16777215, 0);
                int var64 = field1142 + 180;
                short var65 = 326;
                Statics.field1134.method5471(var64 - 73, var65 - 20);
                arg2.method5151(class240.field3038, var64, var65 + 5, 16777215, 0);
            } else if (field1154 == 4) {
                arg0.method5151(class240.field3054, field1142 + 180, 201, 16776960, 0);
                short var66 = 236;
                arg0.method5151(field1141, field1142 + 180, var66, 16777215, 0);
                int var172 = var66 + 15;
                arg0.method5151(field1157, field1142 + 180, var172, 16777215, 0);
                int var173 = var172 + 15;
                arg0.method5151(field1158, field1142 + 180, var173, 16777215, 0);
                int var174 = var173 + 15;
                arg0.method5217(class240.field3061 + class308.method3175(Statics.field93) + (client.field654 % 40 < 20 ? class76.method676(16776960) + class76.field1108 : ""), field1142 + 180 - 108, var174, 16777215, 0);
                int var175 = var174 - 8;
                arg0.method5217(class240.field3021, field1142 + 180 - 9, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg0.method5217(class240.field3039, field1142 + 180 - 9, var176, 16776960, 0);
                int var67 = field1142 + 180 - 9 + arg0.method5177(class240.field3039) + 15;
                int var68 = var176 - arg0.field3737;
                class323 var69;
                if (field1163) {
                    var69 = Statics.field1145;
                } else {
                    var69 = Statics.field2319;
                }
                var69.method5471(var67, var68);
                var172 = var176 + 15;
                int var70 = field1142 + 180 - 80;
                short var71 = 321;
                Statics.field1134.method5471(var70 - 73, var71 - 20);
                arg0.method5151(class240.field2829, var70, var71 + 5, 16777215, 0);
                int var72 = field1142 + 180 + 80;
                Statics.field1134.method5471(var72 - 73, var71 - 20);
                arg0.method5151(class240.field2866, var72, var71 + 5, 16777215, 0);
                arg1.method5151(class240.field2830, field1142 + 180, var71 + 36, 255, 0);
            } else if (field1154 == 5) {
                arg0.method5151(class240.field3072, field1142 + 180, 201, 16776960, 0);
                short var73 = 221;
                arg2.method5151(field1141, field1142 + 180, var73, 16776960, 0);
                int var177 = var73 + 15;
                arg2.method5151(field1157, field1142 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                arg2.method5151(field1158, field1142 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                int var180 = var179 + 14;
                arg0.method5217(class240.field2913, field1142 + 180 - 145, var180, 16777215, 0);
                short var74 = 174;
                String var75;
                for (var75 = method1447(); arg0.method5177(var75) > var74; var75 = var75.substring(1)) {
                }
                arg0.method5217(class302.method5147(var75) + (client.field654 % 40 < 20 ? class76.method676(16776960) + class76.field1108 : ""), field1142 + 180 - 34, var180, 16777215, 0);
                var177 = var180 + 15;
                int var76 = field1142 + 180 - 80;
                short var77 = 321;
                Statics.field1134.method5471(var76 - 73, var77 - 20);
                arg0.method5151(class240.field2931, var76, var77 + 5, 16777215, 0);
                int var78 = field1142 + 180 + 80;
                Statics.field1134.method5471(var78 - 73, var77 - 20);
                arg0.method5151(class240.field3090, var78, var77 + 5, 16777215, 0);
            } else if (field1154 == 6) {
                short var79 = 201;
                arg0.method5151(field1141, field1142 + 180, var79, 16776960, 0);
                int var181 = var79 + 15;
                arg0.method5151(field1157, field1142 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                arg0.method5151(field1158, field1142 + 180, var182, 16776960, 0);
                int var183 = var182 + 15;
                int var80 = field1142 + 180;
                short var81 = 321;
                Statics.field1134.method5471(var80 - 73, var81 - 20);
                arg0.method5151(class240.field3090, var80, var81 + 5, 16777215, 0);
            } else if (field1154 == 7) {
                short var82 = 216;
                arg0.method5151(class240.field3104, field1142 + 180, var82, 16776960, 0);
                int var184 = var82 + 15;
                arg2.method5151(class240.field2998, field1142 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                arg2.method5151(class240.field3106, field1142 + 180, var185, 16776960, 0);
                int var186 = var185 + 15;
                int var83 = field1142 + 180 - 80;
                short var84 = 321;
                Statics.field1134.method5471(var83 - 73, var84 - 20);
                arg0.method5151(class240.field3107, var83, var84 + 5, 16777215, 0);
                int var85 = field1142 + 180 + 80;
                Statics.field1134.method5471(var85 - 73, var84 - 20);
                arg0.method5151(class240.field3090, var85, var84 + 5, 16777215, 0);
            } else if (field1154 == 8) {
                short var86 = 216;
                arg0.method5151(class240.field2961, field1142 + 180, var86, 16776960, 0);
                int var187 = var86 + 15;
                arg2.method5151(class240.field2962, field1142 + 180, var187, 16776960, 0);
                int var188 = var187 + 15;
                arg2.method5151(class240.field2845, field1142 + 180, var188, 16776960, 0);
                int var189 = var188 + 15;
                int var87 = field1142 + 180 - 80;
                short var88 = 321;
                Statics.field1134.method5471(var87 - 73, var88 - 20);
                arg0.method5151(class240.field2964, var87, var88 + 5, 16777215, 0);
                int var89 = field1142 + 180 + 80;
                Statics.field1134.method5471(var89 - 73, var88 - 20);
                arg0.method5151(class240.field3090, var89, var88 + 5, 16777215, 0);
            } else if (field1154 == 12) {
                short var90 = 201;
                String var91 = "";
                String var92 = "";
                String var93 = "";
                switch(field1152) {
                    case 0:
                        var91 = class240.field2877;
                        var92 = class240.field2837;
                        var93 = class240.field2879;
                        break;
                    case 1:
                        var91 = class240.field2916;
                        var92 = class240.field2917;
                        var93 = class240.field3055;
                        break;
                    default:
                        method540(false);
                }
                arg0.method5151(var91, field1142 + 180, var90, 16776960, 0);
                int var190 = var90 + 15;
                arg2.method5151(var92, field1142 + 180, var190, 16776960, 0);
                int var191 = var190 + 15;
                arg2.method5151(var93, field1142 + 180, var191, 16776960, 0);
                int var192 = var191 + 15;
                int var94 = field1142 + 180;
                short var95 = 276;
                Statics.field1134.method5471(var94 - 73, var95 - 20);
                arg0.method5151(class240.field2861, var94, var95 + 5, 16777215, 0);
                int var96 = field1142 + 180;
                short var97 = 326;
                Statics.field1134.method5471(var96 - 73, var97 - 20);
                arg0.method5151(class240.field3090, var96, var97 + 5, 16777215, 0);
            }
        }
        if (field1160 > 0) {
            int var98 = field1160;
            short var99 = 256;
            field1146 += var98 * 128;
            if (field1146 > Statics.field1731.length) {
                field1146 -= Statics.field1731.length;
                int var100 = (int) (Math.random() * 12.0D);
                method1019(Statics.field1135[var100]);
            }
            int var101 = 0;
            int var102 = var98 * 128;
            int var103 = (var99 - var98) * 128;
            for (int var104 = 0; var104 < var103; var104++) {
                int var105 = Statics.field137[var101 + var102] - Statics.field1731[field1146 + var101 & Statics.field1731.length - 1] * var98 / 6;
                if (var105 < 0) {
                    var105 = 0;
                }
                Statics.field137[var101++] = var105;
            }
            for (int var106 = var99 - var98; var106 < var99; var106++) {
                int var107 = var106 * 128;
                for (int var108 = 0; var108 < 128; var108++) {
                    int var109 = (int) (Math.random() * 100.0D);
                    if (var109 < 50 && var108 > 10 && var108 < 118) {
                        Statics.field137[var107 + var108] = 255;
                    } else {
                        Statics.field137[var107 + var108] = 0;
                    }
                }
            }
            if (field1144 > 0) {
                field1144 -= var98 * 4;
            }
            if (field1171 > 0) {
                field1171 -= var98 * 4;
            }
            if (field1144 == 0 && field1171 == 0) {
                int var110 = (int) (Math.random() * (double) (2000 / var98));
                if (var110 == 0) {
                    field1144 = 1024;
                }
                if (var110 == 1) {
                    field1171 = 1024;
                }
            }
            for (int var111 = 0; var111 < var99 - var98; var111++) {
                field1143[var111] = field1143[var98 + var111];
            }
            for (int var112 = var99 - var98; var112 < var99; var112++) {
                field1143[var112] = (int) (Math.sin((double) field1149 / 14.0D) * 16.0D + Math.sin((double) field1149 / 15.0D) * 14.0D + Math.sin((double) field1149 / 16.0D) * 12.0D);
                field1149++;
            }
            field1147 += var98 * 148705857;
            int var113 = ((client.field654 & 0x1) + var98) / 2;
            if (var113 > 0) {
                for (int var114 = 0; var114 < field1147 * -894492828; var114++) {
                    int var115 = (int) (Math.random() * 124.0D) + 2;
                    int var116 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field137[(var116 << 7) + var115] = 192;
                }
                field1147 = 0;
                int var117 = 0;
                label531: while (true) {
                    if (var117 >= var99) {
                        int var121 = 0;
                        while (true) {
                            if (var121 >= 128) {
                                break label531;
                            }
                            int var122 = 0;
                            for (int var123 = -var113; var123 < var99; var123++) {
                                int var124 = var123 * 128;
                                if (var113 + var123 < var99) {
                                    var122 += Statics.field2436[var113 * 128 + var121 + var124];
                                }
                                if (var123 - (var113 + 1) >= 0) {
                                    var122 -= Statics.field2436[var121 + var124 - (var113 + 1) * 128];
                                }
                                if (var123 >= 0) {
                                    Statics.field137[var121 + var124] = var122 / (var113 * 2 + 1);
                                }
                            }
                            var121++;
                        }
                    }
                    int var118 = 0;
                    int var119 = var117 * 128;
                    for (int var120 = -var113; var120 < 128; var120++) {
                        if (var113 + var120 < 128) {
                            var118 += Statics.field137[var119 + var120 + var113];
                        }
                        if (var120 - (var113 + 1) >= 0) {
                            var118 -= Statics.field137[var119 + var120 - (var113 + 1)];
                        }
                        if (var120 >= 0) {
                            Statics.field2436[var119 + var120] = var118 / (var113 * 2 + 1);
                        }
                    }
                    var117++;
                }
            }
            field1160 = 0;
        }
        short var125 = 256;
        if (field1144 > 0) {
            for (int var126 = 0; var126 < 256; var126++) {
                if (field1144 > 768) {
                    Statics.field594[var126] = method191(Statics.field378[var126], Statics.field370[var126], 1024 - field1144);
                } else if (field1144 > 256) {
                    Statics.field594[var126] = Statics.field370[var126];
                } else {
                    Statics.field594[var126] = method191(Statics.field370[var126], Statics.field378[var126], 256 - field1144);
                }
            }
        } else if (field1171 > 0) {
            for (int var127 = 0; var127 < 256; var127++) {
                if (field1171 > 768) {
                    Statics.field594[var127] = method191(Statics.field378[var127], Statics.field313[var127], 1024 - field1171);
                } else if (field1171 > 256) {
                    Statics.field594[var127] = Statics.field313[var127];
                } else {
                    Statics.field594[var127] = method191(Statics.field313[var127], Statics.field378[var127], 256 - field1171);
                }
            }
        } else {
            for (int var128 = 0; var128 < 256; var128++) {
                Statics.field594[var128] = Statics.field378[var128];
            }
        }
        class320.method5371(field1132, 9, field1132 + 128, var125 + 7);
        Statics.field1136.method5489(field1132, 0);
        class320.method5370();
        int var129 = 0;
        int var130 = field1132 + Statics.field1928.field3832 * 9;
        for (int var131 = 1; var131 < var125 - 1; var131++) {
            int var132 = (var125 - var131) * field1143[var131] / var125;
            int var133 = var132 + 22;
            if (var133 < 0) {
                var133 = 0;
            }
            var129 += var133;
            for (int var134 = var133; var134 < 128; var134++) {
                int var135 = Statics.field137[var129++];
                if (var135 == 0) {
                    var130++;
                } else {
                    int var137 = 256 - var135;
                    int var138 = Statics.field594[var135];
                    int var139 = Statics.field1928.field3835[var130];
                    Statics.field1928.field3835[var130++] = ((var138 & 0xFF00) * var135 + (var139 & 0xFF00) * var137 & 0xFF0000) + ((var138 & 0xFF00FF) * var135 + (var139 & 0xFF00FF) * var137 & 0xFF00FF00) >> 8;
                }
            }
            var130 += Statics.field1928.field3832 + var133 - 128;
        }
        class320.method5371(field1132 + 765 - 128, 9, field1132 + 765, var125 + 7);
        Statics.field2.method5489(field1132 + 382, 0);
        class320.method5370();
        int var140 = 0;
        int var141 = field1132 + Statics.field1928.field3832 * 9 + 24 + 637;
        for (int var142 = 1; var142 < var125 - 1; var142++) {
            int var143 = (var125 - var142) * field1143[var142] / var125;
            int var144 = 103 - var143;
            int var145 = var141 + var143;
            for (int var146 = 0; var146 < var144; var146++) {
                int var147 = Statics.field137[var140++];
                if (var147 == 0) {
                    var145++;
                } else {
                    int var149 = 256 - var147;
                    int var150 = Statics.field594[var147];
                    int var151 = Statics.field1928.field3835[var145];
                    Statics.field1928.field3835[var145++] = ((var150 & 0xFF00) * var147 + (var151 & 0xFF00) * var149 & 0xFF0000) + ((var150 & 0xFF00FF) * var147 + (var151 & 0xFF00FF) * var149 & 0xFF00FF00) >> 8;
                }
            }
            var140 += 128 - var144;
            var141 = Statics.field1928.field3832 - var144 - var143 + var145;
        }
        Statics.field1138[Statics.field580.field1019 ? 1 : 0].method5471(field1132 + 765 - 40, 463);
        if (client.field652 <= 5 || client.field649 != 0) {
            return;
        }
        if (Statics.field62 == null) {
            Statics.field62 = class325.method4194(Statics.field547, "sl_button", "");
            return;
        }
        int var152 = field1132 + 5;
        short var153 = 463;
        byte var154 = 100;
        byte var155 = 35;
        Statics.field62.method5471(var152, var153);
        arg0.method5151(class240.field2992 + " " + client.field738, var154 / 2 + var152, var155 / 2 + var153 - 2, 16777215, 0);
        if (Statics.field1007 == null) {
            arg1.method5151(class240.field3118, var154 / 2 + var152, var155 / 2 + var153 + 12, 16777215, 0);
        } else {
            arg1.method5151(class240.field3117, var154 / 2 + var152, var155 / 2 + var153 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ct.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1816(String arg0, String arg1, String arg2) {
        field1141 = arg0;
        field1157 = arg1;
        field1158 = arg2;
    }

    @ObfuscatedName("bq.n(Llp;B)V")
    public static final void method1019(class323 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1731.length; var2++) {
            Statics.field1731[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1731[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1960[var8] = (Statics.field1731[var8 - 1] + Statics.field1731[var8 + 1] + Statics.field1731[var8 - 128] + Statics.field1731[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1731;
            Statics.field1731 = Statics.field1960;
            Statics.field1960 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3846; var11++) {
            for (int var12 = 0; var12 < arg0.field3845; var12++) {
                if (arg0.field3847[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3849;
                    int var14 = var11 + 16 + arg0.field3848;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1731[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("r.t(IIII)I")
    public static final int method191(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bd.r(Lbl;B)V")
    public static void method1642(class67 arg0) {
        if (arg0.method1487() != client.field647) {
            client.field647 = arg0.method1487();
            class272.method2637(arg0.method1487());
        }
        Statics.field141 = arg0.field998;
        client.field738 = arg0.field1008;
        client.field645 = arg0.field1009;
        Statics.field184 = client.field646 == 0 ? 43594 : arg0.field1008 + 40000;
        Statics.field1727 = client.field646 == 0 ? 443 : arg0.field1008 + 50000;
        Statics.field1258 = Statics.field184;
    }

    @ObfuscatedName("y.x(I)V")
    public static void method376() {
        if (class67.method3041()) {
            field1167 = true;
        }
    }
}
