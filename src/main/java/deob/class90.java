package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;

@ObfuscatedName("co")
public class class90 {

    @ObfuscatedName("co.i")
    public static int field1302 = 0;

    @ObfuscatedName("co.l")
    public static int field1309 = field1302 + 202;

    @ObfuscatedName("co.e")
    public static int[] field1341 = new int[256];

    @ObfuscatedName("co.c")
    public static int field1312 = 0;

    @ObfuscatedName("co.aa")
    public static int field1313 = 0;

    @ObfuscatedName("co.ax")
    public static int field1314 = 0;

    @ObfuscatedName("co.ae")
    public static int field1315 = 0;

    @ObfuscatedName("co.ah")
    public static int field1335 = 0;

    @ObfuscatedName("co.ai")
    public static int field1311 = 0;

    @ObfuscatedName("co.au")
    public static int field1318 = 10;

    @ObfuscatedName("co.am")
    public static String field1319 = "";

    @ObfuscatedName("co.af")
    public static int field1339 = 0;

    @ObfuscatedName("co.an")
    public static String field1305 = "";

    @ObfuscatedName("co.ag")
    public static String field1331 = "";

    @ObfuscatedName("co.av")
    public static String field1323 = "";

    @ObfuscatedName("co.aw")
    public static String field1324 = "";

    @ObfuscatedName("co.ad")
    public static String field1325 = "";

    @ObfuscatedName("co.ab")
    public static String field1327 = "";

    @ObfuscatedName("co.aq")
    public static boolean field1332 = false;

    @ObfuscatedName("co.al")
    public static boolean field1328 = false;

    @ObfuscatedName("co.bw")
    public static boolean field1329 = false;

    @ObfuscatedName("co.bq")
    public static boolean field1330 = true;

    @ObfuscatedName("co.bf")
    public static int field1301 = 0;

    @ObfuscatedName("co.bp")
    public static String field1320 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("co.bn")
    public static String field1333 = "1234567890";

    @ObfuscatedName("co.bm")
    public static boolean field1326 = false;

    @ObfuscatedName("co.be")
    public static int field1336 = -1;

    @ObfuscatedName("co.bk")
    public static long field1337;

    @ObfuscatedName("co.bd")
    public static long field1338;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1337 = -1L;
        field1338 = -1L;
    }

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.p(Lik;Lik;I)I")
    public static int method1033(class247 arg0, class247 arg1) {
        int var2 = 0;
        if (arg0.method4053("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4053("logo", "")) {
            var2++;
        }
        if (arg1.method4053("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4053("titlebox", "")) {
            var2++;
        }
        if (arg1.method4053("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4053("runes", "")) {
            var2++;
        }
        if (arg1.method4053("title_mute", "")) {
            var2++;
        }
        if (arg1.method4053("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4053("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4053("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4053("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4053("sl_back", "");
        arg1.method4053("sl_flags", "");
        arg1.method4053("sl_arrows", "");
        arg1.method4053("sl_stars", "");
        arg1.method4053("sl_button", "");
        return var2;
    }

    @ObfuscatedName("fe.i(I)I")
    public static int method3046() {
        return 11;
    }

    @ObfuscatedName("gg.w(Lik;Lik;ZII)V")
    public static void method3342(class247 arg0, class247 arg1, boolean arg2, int arg3) {
        if (!Statics.field1321) {
            field1339 = arg3;
            class306.method4998();
            byte[] var4 = arg0.method4052("title.jpg", "");
            Object var5 = null;
            class310 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class310(var9, var7, var8);
                    break label144;
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class310(0, 0);
            }
            Statics.field1317 = var11;
            Statics.field3781 = Statics.field1317.method5112();
            if ((client.field824 & 0x20000000) == 0) {
                Statics.field226 = class311.method3859(arg1, "logo", "");
            } else {
                Statics.field226 = class311.method3859(arg1, "logo_deadman_mode", "");
            }
            Statics.field1303 = class311.method3859(arg1, "titlebox", "");
            Statics.field1304 = class311.method3859(arg1, "titlebutton", "");
            Statics.field707 = class311.method3987(arg1, "runes", "");
            Statics.field307 = class311.method3987(arg1, "title_mute", "");
            Statics.field1306 = class311.method3859(arg1, "options_radio_buttons,0", "");
            Statics.field1310 = class311.method3859(arg1, "options_radio_buttons,4", "");
            Statics.field1659 = class311.method3859(arg1, "options_radio_buttons,2", "");
            Statics.field762 = class311.method3859(arg1, "options_radio_buttons,6", "");
            Statics.field2681 = Statics.field1306.field3873;
            Statics.field254 = Statics.field1306.field3871;
            Statics.field301 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field301[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field301[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field301[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field301[var17 + 192] = 16777215;
            }
            Statics.field3224 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field3224[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field3224[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field3224[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field3224[var21 + 192] = 16777215;
            }
            Statics.field3237 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field3237[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field3237[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field3237[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field3237[var25 + 192] = 16777215;
            }
            Statics.field285 = new int[256];
            Statics.field709 = new int[32768];
            Statics.field1405 = new int[32768];
            method329((class309) null);
            Statics.field1441 = new int[32768];
            Statics.field1081 = new int[32768];
            if (arg2) {
                field1325 = "";
                field1327 = "";
            }
            Statics.field3690 = 0;
            Statics.field1033 = "";
            field1330 = true;
            field1326 = false;
            if (Statics.field2688.field1185) {
                class215.field2597 = 1;
                Statics.field1370 = null;
                Statics.field2421 = -1;
                Statics.field2506 = -1;
                Statics.field2598 = 0;
                Statics.field2595 = false;
                Statics.field1269 = 2;
            } else {
                class249 var26 = Statics.field2074;
                int var27 = var26.method4117("scape main");
                int var28 = var26.method4050(var27, "");
                class215.field2597 = 1;
                Statics.field1370 = var26;
                Statics.field2421 = var27;
                Statics.field2506 = var28;
                Statics.field2598 = 255;
                Statics.field2595 = false;
                Statics.field1269 = 2;
            }
            class250.method255(false);
            Statics.field1321 = true;
            field1302 = (Statics.field408 - 765) / 2;
            field1309 = field1302 + 202;
            Statics.field1308 = field1309 + 180;
            Statics.field1317.method5121(field1302, 0);
            Statics.field3781.method5121(field1302 + 382, 0);
            Statics.field226.method5091(field1302 + 382 - Statics.field226.field3873 / 2, 18);
        } else if (arg3 == 4) {
            field1339 = 4;
        }
    }

    @ObfuscatedName("bu.s(I)V")
    public static void method964() {
        if (field1325 != null && field1325.length() > 0) {
            return;
        }
        if (Statics.field2688.field1182 == null) {
            field1332 = false;
        } else {
            field1325 = Statics.field2688.field1182;
            field1332 = true;
        }
    }

    @ObfuscatedName("bo.j(I)V")
    public static void method1032() {
        if (!Statics.field1321) {
            return;
        }
        Statics.field1303 = null;
        Statics.field1304 = null;
        Statics.field707 = null;
        Statics.field1317 = null;
        Statics.field3781 = null;
        Statics.field226 = null;
        Statics.field307 = null;
        Statics.field1306 = null;
        Statics.field1659 = null;
        Statics.field619 = null;
        Statics.field2127 = null;
        Statics.field552 = null;
        Statics.field3458 = null;
        Statics.field3435 = null;
        Statics.field301 = null;
        Statics.field3224 = null;
        Statics.field3237 = null;
        Statics.field285 = null;
        Statics.field709 = null;
        Statics.field1405 = null;
        Statics.field1441 = null;
        Statics.field1081 = null;
        class215.field2597 = 1;
        Statics.field1370 = null;
        Statics.field2421 = -1;
        Statics.field2506 = -1;
        Statics.field2598 = 0;
        Statics.field2595 = false;
        Statics.field1269 = 2;
        class250.method255(true);
        Statics.field1321 = false;
    }

    @ObfuscatedName("aw.a(I)V")
    public static void method520() {
        if (field1332 && field1325 != null && field1325.length() > 0) {
            field1301 = 1;
        } else {
            field1301 = 0;
        }
    }

    @ObfuscatedName("a.t(Lbn;B)V")
    public static void method25(class59 arg0) {
        if (!field1326) {
            if ((class60.field677 == 1 || !Statics.field848 && class60.field677 == 4) && class60.field678 >= field1302 + 765 - 50 && class60.field671 >= 453) {
                Statics.field2688.field1185 = !Statics.field2688.field1185;
                class78.method1030();
                if (Statics.field2688.field1185) {
                    Statics.field2596.method3673();
                    class215.field2597 = 1;
                    Statics.field1370 = null;
                } else {
                    class249 var6 = Statics.field2074;
                    int var7 = var6.method4117("scape main");
                    int var8 = var6.method4050(var7, "");
                    class215.method2935(var6, var7, var8, 255, false);
                }
            }
            if (client.field830 != 5) {
                if (field1337 == -1L) {
                    field1337 = class187.method35() + 1000L;
                }
                long var9 = class187.method35();
                boolean var12;
                if (client.field1076 == null || client.field1032 >= client.field1076.size()) {
                    var12 = true;
                } else {
                    while (true) {
                        if (client.field1032 >= client.field1076.size()) {
                            var12 = true;
                            break;
                        }
                        class64 var11 = (class64) client.field1076.get(client.field1032);
                        if (!var11.method961()) {
                            var12 = false;
                            break;
                        }
                        client.field1032++;
                    }
                }
                if (var12 && field1338 == -1L) {
                    field1338 = var9;
                    if (field1338 > field1337) {
                        field1337 = field1338;
                    }
                }
                field1335++;
                if (client.field830 == 10 || client.field830 == 11) {
                    if (client.field828 == 0) {
                        if (class60.field677 == 1 || !Statics.field848 && class60.field677 == 4) {
                            int var13 = field1302 + 5;
                            short var14 = 463;
                            byte var15 = 100;
                            byte var16 = 35;
                            if (class60.field678 >= var13 && class60.field678 <= var13 + var15 && class60.field671 >= var14 && class60.field671 <= var14 + var16) {
                                method62();
                                return;
                            }
                        }
                        if (Statics.field3225 != null) {
                            method62();
                        }
                    }
                    int var17 = class60.field677;
                    int var18 = class60.field678;
                    int var19 = class60.field671;
                    if (var17 == 0) {
                        var18 = class60.field662;
                        var19 = class60.field672;
                    }
                    if (!Statics.field848 && var17 == 4) {
                        var17 = 1;
                    }
                    if (field1339 == 0) {
                        boolean var20 = false;
                        while (class51.method4333()) {
                            if (Statics.field428 == 84) {
                                var20 = true;
                            }
                        }
                        int var21 = Statics.field1308 - 80;
                        short var22 = 291;
                        if (var17 == 1 && var18 >= var21 - 75 && var18 <= var21 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20) {
                            String var23 = client.method3408("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class57.method145(var23, true, "openjs", false);
                        }
                        int var24 = Statics.field1308 + 80;
                        if (var17 == 1 && var18 >= var24 - 75 && var18 <= var24 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20 || var20) {
                            if ((client.field824 & 0x2000000) != 0) {
                                field1305 = "";
                                field1331 = class237.field3065;
                                field1323 = class237.field3159;
                                field1324 = class237.field3160;
                                field1339 = 1;
                                method520();
                            } else if ((client.field824 & 0x4) != 0) {
                                if ((client.field824 & 0x400) == 0) {
                                    field1331 = class237.field3149;
                                    field1323 = class237.field3203;
                                    field1324 = class237.field3151;
                                } else {
                                    field1331 = class237.field3155;
                                    field1323 = class237.field3156;
                                    field1324 = class237.field3157;
                                }
                                field1305 = class237.field3207;
                                field1339 = 1;
                                method520();
                            } else if ((client.field824 & 0x400) == 0) {
                                method2928(false);
                            } else {
                                field1331 = class237.field3152;
                                field1323 = class237.field3153;
                                field1324 = class237.field2956;
                                field1305 = class237.field3207;
                                field1339 = 1;
                                method520();
                            }
                        }
                    } else if (field1339 == 1) {
                        while (class51.method4333()) {
                            if (Statics.field428 == 84) {
                                method2928(false);
                            } else if (Statics.field428 == 13) {
                                field1339 = 0;
                            }
                        }
                        int var25 = Statics.field1308 - 80;
                        short var26 = 321;
                        if (var17 == 1 && var18 >= var25 - 75 && var18 <= var25 + 75 && var19 >= var26 - 20 && var19 <= var26 + 20) {
                            method2928(false);
                        }
                        int var27 = Statics.field1308 + 80;
                        if (var17 == 1 && var18 >= var27 - 75 && var18 <= var27 + 75 && var19 >= var26 - 20 && var19 <= var26 + 20) {
                            field1339 = 0;
                        }
                    } else if (field1339 == 2) {
                        short var28 = 201;
                        int var55 = var28 + 52;
                        if (var17 == 1 && var19 >= var55 - 12 && var19 < var55 + 2) {
                            field1301 = 0;
                        }
                        var55 += 15;
                        if (var17 == 1 && var19 >= var55 - 12 && var19 < var55 + 2) {
                            field1301 = 1;
                        }
                        var55 += 15;
                        short var29 = 361;
                        if (var17 == 1 && var19 >= var29 - 15 && var19 < var29) {
                            method3032(class237.field3186, class237.field3187, class237.field3188);
                            field1339 = 5;
                            return;
                        }
                        int var30 = Statics.field1308 - 80;
                        short var31 = 321;
                        if (var17 == 1 && var18 >= var30 - 75 && var18 <= var30 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                            field1325 = field1325.trim();
                            if (field1325.length() == 0) {
                                method3032(class237.field3193, class237.field3052, class237.field3053);
                                return;
                            }
                            if (field1327.length() == 0) {
                                method3032(class237.field3136, class237.field3055, class237.field3056);
                                return;
                            }
                            method3032(class237.field3163, class237.field3164, class237.field3165);
                            client.method3094(false);
                            client.method22(20);
                            return;
                        }
                        int var32 = field1309 + 180 + 80;
                        if (var17 == 1 && var18 >= var32 - 75 && var18 <= var32 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                            field1339 = 0;
                            field1325 = "";
                            field1327 = "";
                            Statics.field3690 = 0;
                            Statics.field1033 = "";
                            field1330 = true;
                        }
                        int var33 = Statics.field1308 + -117;
                        short var34 = 277;
                        field1328 = var18 >= var33 && var18 < Statics.field2681 + var33 && var19 >= var34 && var19 < Statics.field254 + var34;
                        if (var17 == 1 && field1328) {
                            field1332 = !field1332;
                            if (!field1332 && Statics.field2688.field1182 != null) {
                                Statics.field2688.field1182 = null;
                                class78.method1030();
                            }
                        }
                        int var35 = Statics.field1308 + 24;
                        short var36 = 277;
                        field1329 = var18 >= var35 && var18 < Statics.field2681 + var35 && var19 >= var36 && var19 < Statics.field254 + var36;
                        if (var17 == 1 && field1329) {
                            Statics.field2688.field1186 = !Statics.field2688.field1186;
                            if (!Statics.field2688.field1186) {
                                field1325 = "";
                                Statics.field2688.field1182 = null;
                                method520();
                            }
                            class78.method1030();
                        }
                        while (true) {
                            while (class51.method4333()) {
                                boolean var37 = false;
                                for (int var38 = 0; var38 < field1320.length(); var38++) {
                                    if (Statics.field723 == field1320.charAt(var38)) {
                                        var37 = true;
                                        break;
                                    }
                                }
                                if (Statics.field428 == 13) {
                                    field1339 = 0;
                                    field1325 = "";
                                    field1327 = "";
                                    Statics.field3690 = 0;
                                    Statics.field1033 = "";
                                    field1330 = true;
                                } else if (field1301 == 0) {
                                    if (Statics.field428 == 85 && field1325.length() > 0) {
                                        field1325 = field1325.substring(0, field1325.length() - 1);
                                    }
                                    if (Statics.field428 == 84 || Statics.field428 == 80) {
                                        field1301 = 1;
                                    }
                                    if (var37 && field1325.length() < 320) {
                                        field1325 = field1325 + Statics.field723;
                                    }
                                } else if (field1301 == 1) {
                                    if (Statics.field428 == 85 && field1327.length() > 0) {
                                        field1327 = field1327.substring(0, field1327.length() - 1);
                                    }
                                    if (Statics.field428 == 84 || Statics.field428 == 80) {
                                        field1301 = 0;
                                    }
                                    if (Statics.field428 == 84) {
                                        field1325 = field1325.trim();
                                        if (field1325.length() == 0) {
                                            method3032(class237.field3193, class237.field3052, class237.field3053);
                                            return;
                                        }
                                        if (field1327.length() == 0) {
                                            method3032(class237.field3136, class237.field3055, class237.field3056);
                                            return;
                                        }
                                        method3032(class237.field3163, class237.field3164, class237.field3165);
                                        client.method3094(false);
                                        client.method22(20);
                                        return;
                                    }
                                    if (var37 && field1327.length() < 20) {
                                        field1327 = field1327 + Statics.field723;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1339 == 3) {
                        int var39 = field1309 + 180;
                        short var40 = 276;
                        if (var17 == 1 && var18 >= var39 - 75 && var18 <= var39 + 75 && var19 >= var40 - 20 && var19 <= var40 + 20) {
                            method2928(false);
                        }
                        int var41 = field1309 + 180;
                        short var42 = 326;
                        if (var17 == 1 && var18 >= var41 - 75 && var18 <= var41 + 75 && var19 >= var42 - 20 && var19 <= var42 + 20) {
                            method3032(class237.field3186, class237.field3187, class237.field3188);
                            field1339 = 5;
                            return;
                        }
                    } else if (field1339 == 4) {
                        int var43 = field1309 + 180 - 80;
                        short var44 = 321;
                        if (var17 == 1 && var18 >= var43 - 75 && var18 <= var43 + 75 && var19 >= var44 - 20 && var19 <= var44 + 20) {
                            Statics.field1033.trim();
                            if (Statics.field1033.length() != 6) {
                                method3032(class237.field3183, class237.field2971, class237.field2972);
                                return;
                            }
                            Statics.field3690 = Integer.parseInt(Statics.field1033);
                            Statics.field1033 = "";
                            client.method3094(true);
                            method3032(class237.field3163, class237.field3164, class237.field3165);
                            client.method22(20);
                            return;
                        }
                        if (var17 == 1 && var18 >= field1309 + 180 - 9 && var18 <= field1309 + 180 + 130 && var19 >= 263 && var19 <= 296) {
                            field1330 = !field1330;
                        }
                        if (var17 == 1 && var18 >= field1309 + 180 - 34 && var18 <= field1309 + 180 + 34 && var19 >= 351 && var19 <= 363) {
                            String var45 = client.method3408("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class57.method145(var45, true, "openjs", false);
                        }
                        int var46 = field1309 + 180 + 80;
                        if (var17 == 1 && var18 >= var46 - 75 && var18 <= var46 + 75 && var19 >= var44 - 20 && var19 <= var44 + 20) {
                            field1339 = 0;
                            field1325 = "";
                            field1327 = "";
                            Statics.field3690 = 0;
                            Statics.field1033 = "";
                        }
                        while (class51.method4333()) {
                            boolean var47 = false;
                            for (int var48 = 0; var48 < field1333.length(); var48++) {
                                if (Statics.field723 == field1333.charAt(var48)) {
                                    var47 = true;
                                    break;
                                }
                            }
                            if (Statics.field428 == 13) {
                                field1339 = 0;
                                field1325 = "";
                                field1327 = "";
                                Statics.field3690 = 0;
                                Statics.field1033 = "";
                            } else {
                                if (Statics.field428 == 85 && Statics.field1033.length() > 0) {
                                    Statics.field1033 = Statics.field1033.substring(0, Statics.field1033.length() - 1);
                                }
                                if (Statics.field428 == 84) {
                                    Statics.field1033.trim();
                                    if (Statics.field1033.length() != 6) {
                                        method3032(class237.field3183, class237.field2971, class237.field2972);
                                        return;
                                    }
                                    Statics.field3690 = Integer.parseInt(Statics.field1033);
                                    Statics.field1033 = "";
                                    client.method3094(true);
                                    method3032(class237.field3163, class237.field3164, class237.field3165);
                                    client.method22(20);
                                    return;
                                }
                                if (var47 && Statics.field1033.length() < 6) {
                                    Statics.field1033 = Statics.field1033 + Statics.field723;
                                }
                            }
                        }
                    } else if (field1339 == 5) {
                        int var49 = field1309 + 180 - 80;
                        short var50 = 321;
                        if (var17 == 1 && var18 >= var49 - 75 && var18 <= var49 + 75 && var19 >= var50 - 20 && var19 <= var50 + 20) {
                            method170();
                            return;
                        }
                        int var51 = field1309 + 180 + 80;
                        if (var17 == 1 && var18 >= var51 - 75 && var18 <= var51 + 75 && var19 >= var50 - 20 && var19 <= var50 + 20) {
                            method2928(true);
                        }
                        while (class51.method4333()) {
                            boolean var52 = false;
                            for (int var53 = 0; var53 < field1320.length(); var53++) {
                                if (Statics.field723 == field1320.charAt(var53)) {
                                    var52 = true;
                                    break;
                                }
                            }
                            if (Statics.field428 == 13) {
                                method2928(true);
                            } else {
                                if (Statics.field428 == 85 && field1325.length() > 0) {
                                    field1325 = field1325.substring(0, field1325.length() - 1);
                                }
                                if (Statics.field428 == 84) {
                                    method170();
                                    return;
                                }
                                if (var52 && field1325.length() < 320) {
                                    field1325 = field1325 + Statics.field723;
                                }
                            }
                        }
                    } else if (field1339 == 6) {
                        while (true) {
                            do {
                                if (!class51.method4333()) {
                                    short var54 = 321;
                                    if (var17 == 1 && var19 >= var54 - 20 && var19 <= var54 + 20) {
                                        method2928(true);
                                    }
                                    return;
                                }
                            } while (Statics.field428 != 84 && Statics.field428 != 13);
                            method2928(true);
                        }
                    }
                }
            }
        } else if (class60.field677 == 1 || !Statics.field848 && class60.field677 == 4) {
            int var1 = field1302 + 280;
            if (class60.field678 >= var1 && class60.field678 <= var1 + 14 && class60.field671 >= 4 && class60.field671 <= 18) {
                class77.method23(0, 0);
            } else if (class60.field678 >= var1 + 15 && class60.field678 <= var1 + 80 && class60.field671 >= 4 && class60.field671 <= 18) {
                class77.method23(0, 1);
            } else {
                int var2 = field1302 + 390;
                if (class60.field678 >= var2 && class60.field678 <= var2 + 14 && class60.field671 >= 4 && class60.field671 <= 18) {
                    class77.method23(1, 0);
                } else if (class60.field678 >= var2 + 15 && class60.field678 <= var2 + 80 && class60.field671 >= 4 && class60.field671 <= 18) {
                    class77.method23(1, 1);
                } else {
                    int var3 = field1302 + 500;
                    if (class60.field678 >= var3 && class60.field678 <= var3 + 14 && class60.field671 >= 4 && class60.field671 <= 18) {
                        class77.method23(2, 0);
                    } else if (class60.field678 >= var3 + 15 && class60.field678 <= var3 + 80 && class60.field671 >= 4 && class60.field671 <= 18) {
                        class77.method23(2, 1);
                    } else {
                        int var4 = field1302 + 610;
                        if (class60.field678 >= var4 && class60.field678 <= var4 + 14 && class60.field671 >= 4 && class60.field671 <= 18) {
                            class77.method23(3, 0);
                        } else if (class60.field678 >= var4 + 15 && class60.field678 <= var4 + 80 && class60.field671 >= 4 && class60.field671 <= 18) {
                            class77.method23(3, 1);
                        } else if (class60.field678 >= field1302 + 708 && class60.field671 >= 4 && class60.field678 <= field1302 + 708 + 50 && class60.field671 <= 20) {
                            field1326 = false;
                            Statics.field1317.method5121(field1302, 0);
                            Statics.field3781.method5121(field1302 + 382, 0);
                            Statics.field226.method5091(field1302 + 382 - Statics.field226.field3873 / 2, 18);
                        } else if (field1336 != -1) {
                            class77 var5 = Statics.field1322[field1336];
                            method3011(var5);
                            field1326 = false;
                            Statics.field1317.method5121(field1302, 0);
                            Statics.field3781.method5121(field1302 + 382, 0);
                            Statics.field226.method5091(field1302 + 382 - Statics.field226.field3873 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fl.r(ZI)V")
    public static void method2928(boolean arg0) {
        field1331 = class237.field3095;
        field1323 = class237.field3146;
        field1324 = class237.field3147;
        field1339 = 2;
        if (arg0) {
            field1327 = "";
        }
        method964();
        method520();
    }

    @ObfuscatedName("z.m(I)V")
    public static void method170() {
        field1325 = field1325.trim();
        if (field1325.length() == 0) {
            method3032(class237.field3186, class237.field3187, class237.field3188);
            return;
        }
        long var0 = class85.method1542();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class85.method2367(var0, field1325);
        }
        switch(var2) {
            case 2:
                method3032(class237.field3014, class237.field3190, class237.field3191);
                field1339 = 6;
                break;
            case 3:
                method3032(class237.field3192, class237.field3108, class237.field3194);
                break;
            case 4:
                method3032(class237.field3195, class237.field2967, class237.field3197);
                break;
            case 5:
                method3032(class237.field3198, class237.field3199, class237.field3200);
                break;
            case 6:
                method3032(class237.field3201, class237.field3179, class237.field3168);
                break;
            case 7:
                method3032(class237.field3204, class237.field3205, class237.field3078);
        }
    }

    @ObfuscatedName("ey.h(Lkz;Lkz;Lkz;ZI)V")
    public static void method2614(class287 arg0, class287 arg1, class287 arg2, boolean arg3) {
        if (arg3) {
            field1302 = (Statics.field408 - 765) / 2;
            field1309 = field1302 + 202;
            Statics.field1308 = field1309 + 180;
        }
        if (field1326) {
            if (Statics.field619 == null) {
                Statics.field619 = class311.method55(Statics.field1798, "sl_back", "");
            }
            if (Statics.field2127 == null) {
                Statics.field2127 = class311.method3987(Statics.field1798, "sl_flags", "");
            }
            if (Statics.field552 == null) {
                Statics.field552 = class311.method3987(Statics.field1798, "sl_arrows", "");
            }
            if (Statics.field3458 == null) {
                Statics.field3458 = class311.method3987(Statics.field1798, "sl_stars", "");
            }
            class306.method5002(field1302, 23, 765, 480, 0);
            class306.method5082(field1302, 0, 125, 23, 12425273, 9135624);
            class306.method5082(field1302 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4821(class237.field3041, field1302 + 62, 15, 0, -1);
            if (Statics.field3458 != null) {
                Statics.field3458[1].method5091(field1302 + 140, 1);
                arg1.method4830(class237.field3107, field1302 + 152, 10, 16777215, -1);
                Statics.field3458[0].method5091(field1302 + 140, 12);
                arg1.method4830(class237.field3209, field1302 + 152, 21, 16777215, -1);
            }
            if (Statics.field552 != null) {
                int var4 = field1302 + 280;
                if (class77.field1174[0] == 0 && class77.field1172[0] == 0) {
                    Statics.field552[2].method5091(var4, 4);
                } else {
                    Statics.field552[0].method5091(var4, 4);
                }
                if (class77.field1174[0] == 0 && class77.field1172[0] == 1) {
                    Statics.field552[3].method5091(var4 + 15, 4);
                } else {
                    Statics.field552[1].method5091(var4 + 15, 4);
                }
                arg0.method4830(class237.field3210, var4 + 32, 17, 16777215, -1);
                int var5 = field1302 + 390;
                if (class77.field1174[0] == 1 && class77.field1172[0] == 0) {
                    Statics.field552[2].method5091(var5, 4);
                } else {
                    Statics.field552[0].method5091(var5, 4);
                }
                if (class77.field1174[0] == 1 && class77.field1172[0] == 1) {
                    Statics.field552[3].method5091(var5 + 15, 4);
                } else {
                    Statics.field552[1].method5091(var5 + 15, 4);
                }
                arg0.method4830(class237.field3081, var5 + 32, 17, 16777215, -1);
                int var6 = field1302 + 500;
                if (class77.field1174[0] == 2 && class77.field1172[0] == 0) {
                    Statics.field552[2].method5091(var6, 4);
                } else {
                    Statics.field552[0].method5091(var6, 4);
                }
                if (class77.field1174[0] == 2 && class77.field1172[0] == 1) {
                    Statics.field552[3].method5091(var6 + 15, 4);
                } else {
                    Statics.field552[1].method5091(var6 + 15, 4);
                }
                arg0.method4830(class237.field3212, var6 + 32, 17, 16777215, -1);
                int var7 = field1302 + 610;
                if (class77.field1174[0] == 3 && class77.field1172[0] == 0) {
                    Statics.field552[2].method5091(var7, 4);
                } else {
                    Statics.field552[0].method5091(var7, 4);
                }
                if (class77.field1174[0] == 3 && class77.field1172[0] == 1) {
                    Statics.field552[3].method5091(var7 + 15, 4);
                } else {
                    Statics.field552[1].method5091(var7 + 15, 4);
                }
                arg0.method4830(class237.field3213, var7 + 32, 17, 16777215, -1);
            }
            class306.method5002(field1302 + 708, 4, 50, 16, 0);
            arg1.method4821(class237.field3173, field1302 + 708 + 25, 16, 16777215, -1);
            field1336 = -1;
            if (Statics.field619 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class77.field1171) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class77.field1171) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class77.field1171) {
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
                int var19 = field1302 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class77.field1171; var22++) {
                    class77 var23 = Statics.field1322[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1178);
                    if (var23.field1178 == -1) {
                        var25 = class237.field3214;
                        var24 = false;
                    } else if (var23.field1178 > 1980) {
                        var25 = class237.field2985;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1505()) {
                        if (var23.method1492()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1529()) {
                        var26 = 16711680;
                        if (var23.method1492()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1494()) {
                        if (var23.method1492()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1492()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field662 >= var19 && class60.field672 >= var18 && class60.field662 < var8 + var19 && class60.field672 < var9 + var18 && var24) {
                        field1336 = var22;
                        Statics.field619[var27].method5127(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field619[var27].method5121(var19, var18);
                    }
                    if (Statics.field2127 != null) {
                        Statics.field2127[(var23.method1492() ? 8 : 0) + var23.field1180].method5091(var19 + 29, var18);
                    }
                    arg0.method4821(Integer.toString(var23.field1175), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4821(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4848(Statics.field1322[field1336].field1176) + 6;
                    int var29 = arg1.field3746 + 8;
                    class306.method5002(class60.field662 - var28 / 2, class60.field672 + 20 + 5, var28, var29, 16777120);
                    class306.method5009(class60.field662 - var28 / 2, class60.field672 + 20 + 5, var28, var29, 0);
                    arg1.method4821(Statics.field1322[field1336].field1176, class60.field662, class60.field672 + 20 + 5 + arg1.field3746 + 4, 0, -1);
                }
            }
            Statics.field3432.method712(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1317.method5121(field1302, 0);
            Statics.field3781.method5121(field1302 + 382, 0);
            Statics.field226.method5091(field1302 + 382 - Statics.field226.field3873 / 2, 18);
        }
        if (client.field830 == 0 || client.field830 == 5) {
            byte var30 = 20;
            arg0.method4821(class237.field3074, field1309 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class306.method5009(field1309 + 180 - 152, var31, 304, 34, 9179409);
            class306.method5009(field1309 + 180 - 151, var31 + 1, 302, 32, 0);
            class306.method5002(field1309 + 180 - 150, var31 + 2, field1318 * 3, 30, 9179409);
            class306.method5002(field1318 * 3 + (field1309 + 180 - 150), var31 + 2, 300 - field1318 * 3, 30, 0);
            arg0.method4821(field1319, field1309 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field830 == 20) {
            Statics.field1303.method5091(field1309 + 180 - Statics.field1303.field3873 / 2, 271 - Statics.field1303.field3871 / 2);
            short var32 = 201;
            arg0.method4821(field1331, field1309 + 180, var32, 16776960, 0);
            int var91 = var32 + 15;
            arg0.method4821(field1323, field1309 + 180, var91, 16776960, 0);
            int var92 = var91 + 15;
            arg0.method4821(field1324, field1309 + 180, var92, 16776960, 0);
            int var93 = var92 + 15;
            int var94 = var93 + 7;
            if (field1339 != 4) {
                arg0.method4830(class237.field3166, field1309 + 180 - 110, var94, 16777215, 0);
                short var33 = 200;
                String var34 = Statics.field2688.field1186 ? class294.method1665(field1325) : field1325;
                String var35;
                for (var35 = var34; arg0.method4848(var35) > var33; var35 = var35.substring(0, var35.length() - 1)) {
                }
                arg0.method4830(class288.method4817(var35), field1309 + 180 - 70, var94, 16777215, 0);
                var91 = var94 + 15;
                arg0.method4830(class237.field3167 + class294.method1665(field1327), field1309 + 180 - 108, var91, 16777215, 0);
                var91 += 15;
            }
        }
        if (client.field830 == 10 || client.field830 == 11) {
            Statics.field1303.method5091(field1309, 171);
            if (field1339 == 0) {
                short var36 = 251;
                arg0.method4821(class237.field3169, field1309 + 180, var36, 16776960, 0);
                int var95 = var36 + 30;
                int var37 = field1309 + 180 - 80;
                short var38 = 291;
                Statics.field1304.method5091(var37 - 73, var38 - 20);
                arg0.method4822(class237.field3170, var37 - 73, var38 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var39 = field1309 + 180 + 80;
                Statics.field1304.method5091(var39 - 73, var38 - 20);
                arg0.method4822(class237.field3171, var39 - 73, var38 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1339 == 1) {
                arg0.method4821(field1305, field1309 + 180, 201, 16776960, 0);
                short var40 = 236;
                arg0.method4821(field1331, field1309 + 180, var40, 16777215, 0);
                int var96 = var40 + 15;
                arg0.method4821(field1323, field1309 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method4821(field1324, field1309 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                int var41 = field1309 + 180 - 80;
                short var42 = 321;
                Statics.field1304.method5091(var41 - 73, var42 - 20);
                arg0.method4821(class237.field2942, var41, var42 + 5, 16777215, 0);
                int var43 = field1309 + 180 + 80;
                Statics.field1304.method5091(var43 - 73, var42 - 20);
                arg0.method4821(class237.field3173, var43, var42 + 5, 16777215, 0);
            } else if (field1339 == 2) {
                short var44 = 201;
                arg0.method4821(field1331, Statics.field1308, var44, 16776960, 0);
                int var99 = var44 + 15;
                arg0.method4821(field1323, Statics.field1308, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method4821(field1324, Statics.field1308, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 7;
                arg0.method4830(class237.field3166, Statics.field1308 - 110, var102, 16777215, 0);
                short var45 = 200;
                String var46 = Statics.field2688.field1186 ? class294.method1665(field1325) : field1325;
                String var47;
                for (var47 = var46; arg0.method4848(var47) > var45; var47 = var47.substring(1)) {
                }
                arg0.method4830(class288.method4817(var47) + (field1301 == 0 & client.field832 % 40 < 20 ? class86.method3(16776960) + class86.field1280 : ""), Statics.field1308 - 70, var102, 16777215, 0);
                var99 = var102 + 15;
                arg0.method4830(class237.field3167 + class294.method1665(field1327) + (field1301 == 1 & client.field832 % 40 < 20 ? class86.method3(16776960) + class86.field1280 : ""), Statics.field1308 - 108, var99, 16777215, 0);
                var99 += 15;
                short var48 = 277;
                int var49 = Statics.field1308 + -117;
                boolean var50 = field1332;
                boolean var51 = field1328;
                class309 var52 = var50 ? (var51 ? Statics.field762 : Statics.field1659) : (var51 ? Statics.field1310 : Statics.field1306);
                var52.method5091(var49, var48);
                int var54 = var52.field3873 + 5 + var49;
                arg1.method4830(class237.field3174, var54, var48 + 13, 16776960, 0);
                int var55 = Statics.field1308 + 24;
                boolean var56 = Statics.field2688.field1186;
                boolean var57 = field1329;
                class309 var58 = var56 ? (var57 ? Statics.field762 : Statics.field1659) : (var57 ? Statics.field1310 : Statics.field1306);
                var58.method5091(var55, var48);
                int var60 = var58.field3873 + 5 + var55;
                arg1.method4830(class237.field3175, var60, var48 + 13, 16776960, 0);
                int var103 = var48 + 15;
                int var61 = Statics.field1308 - 80;
                short var62 = 321;
                Statics.field1304.method5091(var61 - 73, var62 - 20);
                arg0.method4821(class237.field3172, var61, var62 + 5, 16777215, 0);
                int var63 = Statics.field1308 + 80;
                Statics.field1304.method5091(var63 - 73, var62 - 20);
                arg0.method4821(class237.field3173, var63, var62 + 5, 16777215, 0);
                short var64 = 357;
                arg1.method4821(class237.field2940, Statics.field1308, var64, 16776960, 0);
            } else if (field1339 == 3) {
                short var65 = 201;
                arg0.method4821(class237.field3176, field1309 + 180, var65, 16776960, 0);
                int var104 = var65 + 20;
                arg1.method4821(class237.field3177, field1309 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                arg1.method4821(class237.field2944, field1309 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                int var66 = field1309 + 180;
                short var67 = 276;
                Statics.field1304.method5091(var66 - 73, var67 - 20);
                arg2.method4821(class237.field3144, var66, var67 + 5, 16777215, 0);
                int var68 = field1309 + 180;
                short var69 = 326;
                Statics.field1304.method5091(var68 - 73, var69 - 20);
                arg2.method4821(class237.field3180, var68, var69 + 5, 16777215, 0);
            } else if (field1339 == 4) {
                arg0.method4821(class237.field3161, field1309 + 180, 201, 16776960, 0);
                short var70 = 236;
                arg0.method4821(field1331, field1309 + 180, var70, 16777215, 0);
                int var107 = var70 + 15;
                arg0.method4821(field1323, field1309 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method4821(field1324, field1309 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method4830(class237.field3015 + class294.method1665(Statics.field1033) + (client.field832 % 40 < 20 ? class86.method3(16776960) + class86.field1280 : ""), field1309 + 180 - 108, var109, 16777215, 0);
                int var110 = var109 - 8;
                arg0.method4830(class237.field3037, field1309 + 180 - 9, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method4830(class237.field2943, field1309 + 180 - 9, var111, 16776960, 0);
                int var71 = field1309 + 180 - 9 + arg0.method4848(class237.field2943) + 15;
                int var72 = var111 - arg0.field3746;
                class309 var73;
                if (field1330) {
                    var73 = Statics.field1659;
                } else {
                    var73 = Statics.field1306;
                }
                var73.method5091(var71, var72);
                var107 = var111 + 15;
                int var74 = field1309 + 180 - 80;
                short var75 = 321;
                Statics.field1304.method5091(var74 - 73, var75 - 20);
                arg0.method4821(class237.field2942, var74, var75 + 5, 16777215, 0);
                int var76 = field1309 + 180 + 80;
                Statics.field1304.method5091(var76 - 73, var75 - 20);
                arg0.method4821(class237.field3173, var76, var75 + 5, 16777215, 0);
                arg1.method4821(class237.field3162, field1309 + 180, var75 + 36, 255, 0);
            } else if (field1339 == 5) {
                arg0.method4821(class237.field3129, field1309 + 180, 201, 16776960, 0);
                short var77 = 221;
                arg2.method4821(field1331, field1309 + 180, var77, 16776960, 0);
                int var112 = var77 + 15;
                arg2.method4821(field1323, field1309 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg2.method4821(field1324, field1309 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var115 = var114 + 14;
                arg0.method4830(class237.field3082, field1309 + 180 - 145, var115, 16777215, 0);
                short var78 = 174;
                String var79 = Statics.field2688.field1186 ? class294.method1665(field1325) : field1325;
                String var80;
                for (var80 = var79; arg0.method4848(var80) > var78; var80 = var80.substring(1)) {
                }
                arg0.method4830(class288.method4817(var80) + (client.field832 % 40 < 20 ? class86.method3(16776960) + class86.field1280 : ""), field1309 + 180 - 34, var115, 16777215, 0);
                var112 = var115 + 15;
                int var81 = field1309 + 180 - 80;
                short var82 = 321;
                Statics.field1304.method5091(var81 - 73, var82 - 20);
                arg0.method4821(class237.field3088, var81, var82 + 5, 16777215, 0);
                int var83 = field1309 + 180 + 80;
                Statics.field1304.method5091(var83 - 73, var82 - 20);
                arg0.method4821(class237.field3185, var83, var82 + 5, 16777215, 0);
            } else if (field1339 == 6) {
                short var84 = 201;
                arg0.method4821(field1331, field1309 + 180, var84, 16776960, 0);
                int var116 = var84 + 15;
                arg0.method4821(field1323, field1309 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method4821(field1324, field1309 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                int var85 = field1309 + 180;
                short var86 = 321;
                Statics.field1304.method5091(var85 - 73, var86 - 20);
                arg0.method4821(class237.field3185, var85, var86 + 5, 16777215, 0);
            }
        }
        if (field1335 > 0) {
            method1784(field1335);
            field1335 = 0;
        }
        method3659();
        Statics.field307[Statics.field2688.field1185 ? 1 : 0].method5091(field1302 + 765 - 40, 463);
        if (client.field830 <= 5 || client.field828 != 0) {
            return;
        }
        if (Statics.field3435 == null) {
            Statics.field3435 = class311.method3859(Statics.field1798, "sl_button", "");
            return;
        }
        int var87 = field1302 + 5;
        short var88 = 463;
        byte var89 = 100;
        byte var90 = 35;
        Statics.field3435.method5091(var87, var88);
        arg0.method4821(class237.field3099 + " " + client.field996, var89 / 2 + var87, var90 / 2 + var88 - 2, 16777215, 0);
        if (Statics.field3225 == null) {
            arg1.method4821(class237.field3123, var89 / 2 + var87, var90 / 2 + var88 + 12, 16777215, 0);
        } else {
            arg1.method4821(class237.field2970, var89 / 2 + var87, var90 / 2 + var88 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("fa.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3032(String arg0, String arg1, String arg2) {
        field1331 = arg0;
        field1323 = arg1;
        field1324 = arg2;
    }

    @ObfuscatedName("ah.x(Lkh;B)V")
    public static final void method329(class309 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field709.length; var2++) {
            Statics.field709[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field709[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1405[var8] = (Statics.field709[var8 - 1] + Statics.field709[var8 + 1] + Statics.field709[var8 - 128] + Statics.field709[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field709;
            Statics.field709 = Statics.field1405;
            Statics.field1405 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3871; var11++) {
            for (int var12 = 0; var12 < arg0.field3873; var12++) {
                if (arg0.field3876[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3875;
                    int var14 = var11 + 16 + arg0.field3878;
                    int var15 = (var14 << 7) + var13;
                    Statics.field709[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cm.q(II)V")
    public static final void method1784(int arg0) {
        short var1 = 256;
        field1314 += arg0 * 128;
        if (field1314 > Statics.field709.length) {
            field1314 -= Statics.field709.length;
            int var2 = (int) (Math.random() * 12.0D);
            method329(Statics.field707[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1441[var3 + var4] - Statics.field709[field1314 + var3 & Statics.field709.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1441[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1441[var9 + var10] = 255;
                } else {
                    Statics.field1441[var9 + var10] = 0;
                }
            }
        }
        if (field1312 > 0) {
            field1312 -= arg0 * 4;
        }
        if (field1313 > 0) {
            field1313 -= arg0 * 4;
        }
        if (field1312 == 0 && field1313 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1312 = 1024;
            }
            if (var12 == 1) {
                field1313 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1341[var13] = field1341[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1341[var14] = (int) (Math.sin((double) field1311 / 14.0D) * 16.0D + Math.sin((double) field1311 / 15.0D) * 14.0D + Math.sin((double) field1311 / 16.0D) * 12.0D);
            field1311++;
        }
        field1315 += arg0 * 1378089727;
        int var15 = ((client.field832 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1315 * 1412297628; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1441[(var18 << 7) + var17] = 192;
        }
        field1315 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1441[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1441[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1081[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1081[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1081[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1441[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("q.d(IIIB)I")
    public static final int method76(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("hr.l(I)V")
    public static final void method3659() {
        short var0 = 256;
        if (field1312 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1312 > 768) {
                    Statics.field285[var1] = method76(Statics.field301[var1], Statics.field3224[var1], 1024 - field1312);
                } else if (field1312 > 256) {
                    Statics.field285[var1] = Statics.field3224[var1];
                } else {
                    Statics.field285[var1] = method76(Statics.field3224[var1], Statics.field301[var1], 256 - field1312);
                }
            }
        } else if (field1313 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1313 > 768) {
                    Statics.field285[var2] = method76(Statics.field301[var2], Statics.field3237[var2], 1024 - field1313);
                } else if (field1313 > 256) {
                    Statics.field285[var2] = Statics.field3237[var2];
                } else {
                    Statics.field285[var2] = method76(Statics.field3237[var2], Statics.field301[var2], 256 - field1313);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field285[var3] = Statics.field301[var3];
            }
        }
        class306.method5029(field1302, 9, field1302 + 128, var0 + 7);
        Statics.field1317.method5121(field1302, 0);
        class306.method4993();
        int var4 = 0;
        int var5 = field1302 + Statics.field3432.field3858 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1341[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1441[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field285[var10];
                    int var14 = Statics.field3432.field3861[var5];
                    Statics.field3432.field3861[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field3432.field3858 + var8 - 128;
        }
        class306.method5029(field1302 + 765 - 128, 9, field1302 + 765, var0 + 7);
        Statics.field3781.method5121(field1302 + 382, 0);
        class306.method4993();
        int var15 = 0;
        int var16 = field1302 + Statics.field3432.field3858 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1341[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1441[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field285[var22];
                    int var26 = Statics.field3432.field3861[var20];
                    Statics.field3432.field3861[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field3432.field3858 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("fu.f(Lbi;I)V")
    public static void method3011(class77 arg0) {
        if (arg0.method1492() != client.field902) {
            client.field902 = arg0.method1492();
            class268.method257(arg0.method1492());
        }
        Statics.field1928 = arg0.field1179;
        client.field996 = arg0.field1175;
        client.field824 = arg0.field1173;
        Statics.field765 = client.field958 == 0 ? 43594 : arg0.field1175 + 40000;
        Statics.field251 = client.field958 == 0 ? 443 : arg0.field1175 + 50000;
        Statics.field726 = Statics.field765;
    }

    @ObfuscatedName("o.k(I)V")
    public static void method62() {
        if (class77.method1769()) {
            field1326 = true;
        }
    }
}
