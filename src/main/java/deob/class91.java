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

@ObfuscatedName("cx")
public class class91 {

    @ObfuscatedName("cx.k")
    public static int field1360 = 0;

    @ObfuscatedName("cx.q")
    public static int field1366 = field1360 + 202;

    @ObfuscatedName("cx.b")
    public static int[] field1367 = new int[256];

    @ObfuscatedName("cx.c")
    public static int field1368 = 0;

    @ObfuscatedName("cx.ab")
    public static int field1359 = 0;

    @ObfuscatedName("cx.al")
    public static int field1370 = 0;

    @ObfuscatedName("cx.ah")
    public static int field1371 = 0;

    @ObfuscatedName("cx.af")
    public static int field1372 = 0;

    @ObfuscatedName("cx.aq")
    public static int field1369 = 0;

    @ObfuscatedName("cx.ai")
    public static int field1374 = 10;

    @ObfuscatedName("cx.az")
    public static String field1363 = "";

    @ObfuscatedName("cx.aa")
    public static int field1376 = 0;

    @ObfuscatedName("cx.av")
    public static String field1377 = "";

    @ObfuscatedName("cx.am")
    public static String field1378 = "";

    @ObfuscatedName("cx.ao")
    public static String field1379 = "";

    @ObfuscatedName("cx.ax")
    public static String field1380 = "";

    @ObfuscatedName("cx.ad")
    public static String field1381 = "";

    @ObfuscatedName("cx.au")
    public static String field1393 = "";

    @ObfuscatedName("cx.ar")
    public static boolean field1383 = false;

    @ObfuscatedName("cx.ay")
    public static boolean field1375 = false;

    @ObfuscatedName("cx.bm")
    public static boolean field1385 = false;

    @ObfuscatedName("cx.bf")
    public static boolean field1386 = true;

    @ObfuscatedName("cx.bp")
    public static int field1387 = 0;

    @ObfuscatedName("cx.bs")
    public static String field1373 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cx.bu")
    public static String field1396 = "1234567890";

    @ObfuscatedName("cx.bk")
    public static boolean field1365 = false;

    @ObfuscatedName("cx.bh")
    public static int field1391 = -1;

    @ObfuscatedName("cx.bt")
    public static long field1392;

    @ObfuscatedName("cx.bi")
    public static long field1390;

    static {
        new DecimalFormat("##0.00");
        new class161();
        field1392 = -1L;
        field1390 = -1L;
    }

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.o(I)I")
    public static int method953() {
        return 11;
    }

    @ObfuscatedName("bz.k(Ljf;Ljf;ZII)V")
    public static void method1117(class262 arg0, class262 arg1, boolean arg2, int arg3) {
        if (!Statics.field1388) {
            field1376 = arg3;
            class328.method5360();
            byte[] var4 = arg0.method4178("title.jpg", "");
            Statics.field3939 = class56.method3136(var4);
            Statics.field1382 = Statics.field3939.method5408();
            if ((client.field935 & 0x20000000) == 0) {
                Statics.field467 = class333.method1643(arg1, "logo", "");
            } else {
                Statics.field467 = class333.method1643(arg1, "logo_deadman_mode", "");
            }
            Statics.field3399 = class333.method1643(arg1, "titlebox", "");
            Statics.field1389 = class333.method1643(arg1, "titlebutton", "");
            Statics.field1362 = class333.method562(arg1, "runes", "");
            Statics.field674 = class333.method562(arg1, "title_mute", "");
            Statics.field1364 = class333.method1643(arg1, "options_radio_buttons,0", "");
            Statics.field2075 = class333.method1643(arg1, "options_radio_buttons,4", "");
            Statics.field1394 = class333.method1643(arg1, "options_radio_buttons,2", "");
            Statics.field2980 = class333.method1643(arg1, "options_radio_buttons,6", "");
            Statics.field1319 = Statics.field1364.field3975;
            Statics.field2617 = Statics.field1364.field3977;
            Statics.field348 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field348[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field348[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field348[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field348[var8 + 192] = 16777215;
            }
            Statics.field763 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field763[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field763[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field763[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field763[var12 + 192] = 16777215;
            }
            Statics.field299 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field299[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field299[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field299[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field299[var16 + 192] = 16777215;
            }
            Statics.field345 = new int[256];
            Statics.field820 = new int[32768];
            Statics.field288 = new int[32768];
            method575((class331) null);
            Statics.field2514 = new int[32768];
            Statics.field1586 = new int[32768];
            if (arg2) {
                field1381 = "";
                field1393 = "";
            }
            Statics.field370 = 0;
            Statics.field502 = "";
            field1386 = true;
            field1365 = false;
            if (Statics.field1142.field1247) {
                class230.field2688 = 1;
                Statics.field2512 = null;
                Statics.field1932 = -1;
                Statics.field285 = -1;
                Statics.field1331 = 0;
                Statics.field2693 = false;
                Statics.field12 = 2;
            } else {
                class264 var17 = Statics.field2606;
                int var18 = var17.method4175("scape main");
                int var19 = var17.method4176(var18, "");
                class230.method2958(2, var17, var18, var19, 255, false);
            }
            class265.method1708(false);
            Statics.field1388 = true;
            field1360 = (Statics.field472 - 765) / 2;
            field1366 = field1360 + 202;
            Statics.field280 = field1366 + 180;
            Statics.field3939.method5417(field1360, 0);
            Statics.field1382.method5417(field1360 + 382, 0);
            Statics.field467.method5386(field1360 + 382 - Statics.field467.field3975 / 2, 18);
        } else if (arg3 == 4) {
            field1376 = 4;
        }
    }

    @ObfuscatedName("gn.d(I)V")
    public static void method3432() {
        if (field1383 && field1381 != null && field1381.length() > 0) {
            field1387 = 1;
        } else {
            field1387 = 0;
        }
    }

    @ObfuscatedName("fa.h(Lbr;B)V")
    public static void method3039(class60 arg0) {
        if (!field1365) {
            if ((class61.field730 == 1 || !Statics.field590 && class61.field730 == 4) && class61.field731 >= field1360 + 765 - 50 && class61.field732 >= 453) {
                Statics.field1142.field1247 = !Statics.field1142.field1247;
                class79.method949();
                if (Statics.field1142.field1247) {
                    class230.method2916();
                } else {
                    class264 var6 = Statics.field2606;
                    int var7 = var6.method4175("scape main");
                    int var8 = var6.method4176(var7, "");
                    class230.method3130(var6, var7, var8, 255, false);
                }
            }
            if (client.field880 != 5) {
                if (field1392 == -1L) {
                    field1392 = class197.method1005() + 1000L;
                }
                long var9 = class197.method1005();
                boolean var11;
                if (client.field872 == null || client.field936 >= client.field872.size()) {
                    var11 = true;
                } else {
                    while (true) {
                        if (client.field936 >= client.field872.size()) {
                            var11 = true;
                            break;
                        }
                        class65 var12 = (class65) client.field872.get(client.field936);
                        if (!var12.method1004()) {
                            var11 = false;
                            break;
                        }
                        client.field936++;
                    }
                }
                if (var11 && field1390 == -1L) {
                    field1390 = var9;
                    if (field1390 > field1392) {
                        field1392 = field1390;
                    }
                }
                field1372++;
                if (client.field880 == 10 || client.field880 == 11) {
                    if (client.field980 == 0) {
                        if (class61.field730 == 1 || !Statics.field590 && class61.field730 == 4) {
                            int var13 = field1360 + 5;
                            short var14 = 463;
                            byte var15 = 100;
                            byte var16 = 35;
                            if (class61.field731 >= var13 && class61.field731 <= var13 + var15 && class61.field732 >= var14 && class61.field732 <= var14 + var16) {
                                method1032();
                                return;
                            }
                        }
                        if (Statics.field2069 != null) {
                            method1032();
                        }
                    }
                    int var17 = class61.field730;
                    int var18 = class61.field731;
                    int var19 = class61.field732;
                    if (var17 == 0) {
                        var18 = class61.field717;
                        var19 = class61.field715;
                    }
                    if (!Statics.field590 && var17 == 4) {
                        var17 = 1;
                    }
                    if (field1376 == 0) {
                        boolean var20 = false;
                        while (class52.method2932()) {
                            if (Statics.field1425 == 84) {
                                var20 = true;
                            }
                        }
                        int var21 = Statics.field280 - 80;
                        short var22 = 291;
                        if (var17 == 1 && var18 >= var21 - 75 && var18 <= var21 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20) {
                            label809: {
                                String var23 = client.method4329("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var23));
                                        break label809;
                                    } catch (Exception var58) {
                                    }
                                }
                                if (class58.field668.startsWith("win")) {
                                    class58.method3415(var23, 0);
                                } else if (class58.field668.startsWith("mac")) {
                                    class58.method1716(var23, 1, "openjs");
                                } else {
                                    class58.method3415(var23, 2);
                                }
                            }
                        }
                        int var25 = Statics.field280 + 80;
                        if (var17 == 1 && var18 >= var25 - 75 && var18 <= var25 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20 || var20) {
                            if ((client.field935 & 0x2000000) != 0) {
                                field1377 = "";
                                field1378 = class252.field3249;
                                field1379 = class252.field3250;
                                field1380 = class252.field3298;
                                field1376 = 1;
                                method3432();
                            } else if ((client.field935 & 0x4) != 0) {
                                if ((client.field935 & 0x400) == 0) {
                                    field1378 = class252.field3240;
                                    field1379 = class252.field3213;
                                    field1380 = class252.field3242;
                                } else {
                                    field1378 = class252.field3186;
                                    field1379 = class252.field3247;
                                    field1380 = class252.field3248;
                                }
                                field1377 = class252.field3286;
                                field1376 = 1;
                                method3432();
                            } else if ((client.field935 & 0x400) == 0) {
                                method701(false);
                            } else {
                                field1378 = class252.field3243;
                                field1379 = class252.field3244;
                                field1380 = class252.field3245;
                                field1377 = class252.field3286;
                                field1376 = 1;
                                method3432();
                            }
                        }
                    } else if (field1376 == 1) {
                        while (class52.method2932()) {
                            if (Statics.field1425 == 84) {
                                method701(false);
                            } else if (Statics.field1425 == 13) {
                                field1376 = 0;
                            }
                        }
                        int var26 = Statics.field280 - 80;
                        short var27 = 321;
                        if (var17 == 1 && var18 >= var26 - 75 && var18 <= var26 + 75 && var19 >= var27 - 20 && var19 <= var27 + 20) {
                            method701(false);
                        }
                        int var28 = Statics.field280 + 80;
                        if (var17 == 1 && var18 >= var28 - 75 && var18 <= var28 + 75 && var19 >= var27 - 20 && var19 <= var27 + 20) {
                            field1376 = 0;
                        }
                    } else if (field1376 == 2) {
                        short var29 = 201;
                        int var59 = var29 + 52;
                        if (var17 == 1 && var19 >= var59 - 12 && var19 < var59 + 2) {
                            field1387 = 0;
                        }
                        var59 += 15;
                        if (var17 == 1 && var19 >= var59 - 12 && var19 < var59 + 2) {
                            field1387 = 1;
                        }
                        var59 += 15;
                        short var30 = 361;
                        if (var17 == 1 && var19 >= var30 - 15 && var19 < var30) {
                            method42(class252.field3277, class252.field3278, class252.field3263);
                            field1376 = 5;
                            return;
                        }
                        int var31 = Statics.field280 - 80;
                        short var32 = 321;
                        if (var17 == 1 && var18 >= var31 - 75 && var18 <= var31 + 75 && var19 >= var32 - 20 && var19 <= var32 + 20) {
                            field1381 = field1381.trim();
                            if (field1381.length() == 0) {
                                method42(class252.field3142, class252.field3143, class252.field3262);
                                return;
                            }
                            if (field1393.length() == 0) {
                                method42(class252.field3172, class252.field3227, class252.field3147);
                                return;
                            }
                            method42(class252.field3254, class252.field3105, class252.field3030);
                            client.method221(false);
                            client.method1003(20);
                            return;
                        }
                        int var33 = field1366 + 180 + 80;
                        if (var17 == 1 && var18 >= var33 - 75 && var18 <= var33 + 75 && var19 >= var32 - 20 && var19 <= var32 + 20) {
                            field1376 = 0;
                            field1381 = "";
                            field1393 = "";
                            Statics.field370 = 0;
                            Statics.field502 = "";
                            field1386 = true;
                        }
                        int var34 = Statics.field280 + -117;
                        short var35 = 277;
                        field1375 = var18 >= var34 && var18 < Statics.field1319 + var34 && var19 >= var35 && var19 < Statics.field2617 + var35;
                        if (var17 == 1 && field1375) {
                            field1383 = !field1383;
                            if (!field1383 && Statics.field1142.field1246 != null) {
                                Statics.field1142.field1246 = null;
                                class79.method949();
                            }
                        }
                        int var36 = Statics.field280 + 24;
                        short var37 = 277;
                        field1385 = var18 >= var36 && var18 < Statics.field1319 + var36 && var19 >= var37 && var19 < Statics.field2617 + var37;
                        if (var17 == 1 && field1385) {
                            Statics.field1142.field1243 = !Statics.field1142.field1243;
                            if (!Statics.field1142.field1243) {
                                field1381 = "";
                                Statics.field1142.field1246 = null;
                                method3432();
                            }
                            class79.method949();
                        }
                        while (true) {
                            while (class52.method2932()) {
                                boolean var38 = false;
                                for (int var39 = 0; var39 < field1373.length(); var39++) {
                                    if (Statics.field508 == field1373.charAt(var39)) {
                                        var38 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1425 == 13) {
                                    field1376 = 0;
                                    field1381 = "";
                                    field1393 = "";
                                    Statics.field370 = 0;
                                    Statics.field502 = "";
                                    field1386 = true;
                                } else if (field1387 == 0) {
                                    if (Statics.field1425 == 85 && field1381.length() > 0) {
                                        field1381 = field1381.substring(0, field1381.length() - 1);
                                    }
                                    if (Statics.field1425 == 84 || Statics.field1425 == 80) {
                                        field1387 = 1;
                                    }
                                    if (var38 && field1381.length() < 320) {
                                        field1381 = field1381 + Statics.field508;
                                    }
                                } else if (field1387 == 1) {
                                    if (Statics.field1425 == 85 && field1393.length() > 0) {
                                        field1393 = field1393.substring(0, field1393.length() - 1);
                                    }
                                    if (Statics.field1425 == 84 || Statics.field1425 == 80) {
                                        field1387 = 0;
                                    }
                                    if (Statics.field1425 == 84) {
                                        field1381 = field1381.trim();
                                        if (field1381.length() == 0) {
                                            method42(class252.field3142, class252.field3143, class252.field3262);
                                            return;
                                        }
                                        if (field1393.length() == 0) {
                                            method42(class252.field3172, class252.field3227, class252.field3147);
                                            return;
                                        }
                                        method42(class252.field3254, class252.field3105, class252.field3030);
                                        client.method221(false);
                                        client.method1003(20);
                                        return;
                                    }
                                    if (var38 && field1393.length() < 20) {
                                        field1393 = field1393 + Statics.field508;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1376 == 3) {
                        int var40 = field1366 + 180;
                        short var41 = 276;
                        if (var17 == 1 && var18 >= var40 - 75 && var18 <= var40 + 75 && var19 >= var41 - 20 && var19 <= var41 + 20) {
                            method701(false);
                        }
                        int var42 = field1366 + 180;
                        short var43 = 326;
                        if (var17 == 1 && var18 >= var42 - 75 && var18 <= var42 + 75 && var19 >= var43 - 20 && var19 <= var43 + 20) {
                            method42(class252.field3277, class252.field3278, class252.field3263);
                            field1376 = 5;
                            return;
                        }
                    } else if (field1376 == 4) {
                        int var44 = field1366 + 180 - 80;
                        short var45 = 321;
                        if (var17 == 1 && var18 >= var44 - 75 && var18 <= var44 + 75 && var19 >= var45 - 20 && var19 <= var45 + 20) {
                            Statics.field502.trim();
                            if (Statics.field502.length() != 6) {
                                method42(class252.field3260, class252.field3203, class252.field3063);
                                return;
                            }
                            Statics.field370 = Integer.parseInt(Statics.field502);
                            Statics.field502 = "";
                            client.method221(true);
                            method42(class252.field3254, class252.field3105, class252.field3030);
                            client.method1003(20);
                            return;
                        }
                        if (var17 == 1 && var18 >= field1366 + 180 - 9 && var18 <= field1366 + 180 + 130 && var19 >= 263 && var19 <= 296) {
                            field1386 = !field1386;
                        }
                        if (var17 == 1 && var18 >= field1366 + 180 - 34 && var18 <= field1366 + 180 + 34 && var19 >= 351 && var19 <= 363) {
                            label822: {
                                String var46 = client.method4329("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var46));
                                        break label822;
                                    } catch (Exception var57) {
                                    }
                                }
                                if (class58.field668.startsWith("win")) {
                                    class58.method3415(var46, 0);
                                } else if (class58.field668.startsWith("mac")) {
                                    class58.method1716(var46, 1, "openjs");
                                } else {
                                    class58.method3415(var46, 2);
                                }
                            }
                        }
                        int var48 = field1366 + 180 + 80;
                        if (var17 == 1 && var18 >= var48 - 75 && var18 <= var48 + 75 && var19 >= var45 - 20 && var19 <= var45 + 20) {
                            field1376 = 0;
                            field1381 = "";
                            field1393 = "";
                            Statics.field370 = 0;
                            Statics.field502 = "";
                        }
                        while (class52.method2932()) {
                            boolean var49 = false;
                            for (int var50 = 0; var50 < field1396.length(); var50++) {
                                if (Statics.field508 == field1396.charAt(var50)) {
                                    var49 = true;
                                    break;
                                }
                            }
                            if (Statics.field1425 == 13) {
                                field1376 = 0;
                                field1381 = "";
                                field1393 = "";
                                Statics.field370 = 0;
                                Statics.field502 = "";
                            } else {
                                if (Statics.field1425 == 85 && Statics.field502.length() > 0) {
                                    Statics.field502 = Statics.field502.substring(0, Statics.field502.length() - 1);
                                }
                                if (Statics.field1425 == 84) {
                                    Statics.field502.trim();
                                    if (Statics.field502.length() != 6) {
                                        method42(class252.field3260, class252.field3203, class252.field3063);
                                        return;
                                    }
                                    Statics.field370 = Integer.parseInt(Statics.field502);
                                    Statics.field502 = "";
                                    client.method221(true);
                                    method42(class252.field3254, class252.field3105, class252.field3030);
                                    client.method1003(20);
                                    return;
                                }
                                if (var49 && Statics.field502.length() < 6) {
                                    Statics.field502 = Statics.field502 + Statics.field508;
                                }
                            }
                        }
                    } else if (field1376 == 5) {
                        int var51 = field1366 + 180 - 80;
                        short var52 = 321;
                        if (var17 == 1 && var18 >= var51 - 75 && var18 <= var51 + 75 && var19 >= var52 - 20 && var19 <= var52 + 20) {
                            method58();
                            return;
                        }
                        int var53 = field1366 + 180 + 80;
                        if (var17 == 1 && var18 >= var53 - 75 && var18 <= var53 + 75 && var19 >= var52 - 20 && var19 <= var52 + 20) {
                            method701(true);
                        }
                        while (class52.method2932()) {
                            boolean var54 = false;
                            for (int var55 = 0; var55 < field1373.length(); var55++) {
                                if (Statics.field508 == field1373.charAt(var55)) {
                                    var54 = true;
                                    break;
                                }
                            }
                            if (Statics.field1425 == 13) {
                                method701(true);
                            } else {
                                if (Statics.field1425 == 85 && field1381.length() > 0) {
                                    field1381 = field1381.substring(0, field1381.length() - 1);
                                }
                                if (Statics.field1425 == 84) {
                                    method58();
                                    return;
                                }
                                if (var54 && field1381.length() < 320) {
                                    field1381 = field1381 + Statics.field508;
                                }
                            }
                        }
                    } else if (field1376 == 6) {
                        while (true) {
                            do {
                                if (!class52.method2932()) {
                                    short var56 = 321;
                                    if (var17 == 1 && var19 >= var56 - 20 && var19 <= var56 + 20) {
                                        method701(true);
                                    }
                                    return;
                                }
                            } while (Statics.field1425 != 84 && Statics.field1425 != 13);
                            method701(true);
                        }
                    }
                }
            }
        } else if (class61.field730 == 1 || !Statics.field590 && class61.field730 == 4) {
            int var1 = field1360 + 280;
            if (class61.field731 >= var1 && class61.field731 <= var1 + 14 && class61.field732 >= 4 && class61.field732 <= 18) {
                class78.method1855(0, 0);
            } else if (class61.field731 >= var1 + 15 && class61.field731 <= var1 + 80 && class61.field732 >= 4 && class61.field732 <= 18) {
                class78.method1855(0, 1);
            } else {
                int var2 = field1360 + 390;
                if (class61.field731 >= var2 && class61.field731 <= var2 + 14 && class61.field732 >= 4 && class61.field732 <= 18) {
                    class78.method1855(1, 0);
                } else if (class61.field731 >= var2 + 15 && class61.field731 <= var2 + 80 && class61.field732 >= 4 && class61.field732 <= 18) {
                    class78.method1855(1, 1);
                } else {
                    int var3 = field1360 + 500;
                    if (class61.field731 >= var3 && class61.field731 <= var3 + 14 && class61.field732 >= 4 && class61.field732 <= 18) {
                        class78.method1855(2, 0);
                    } else if (class61.field731 >= var3 + 15 && class61.field731 <= var3 + 80 && class61.field732 >= 4 && class61.field732 <= 18) {
                        class78.method1855(2, 1);
                    } else {
                        int var4 = field1360 + 610;
                        if (class61.field731 >= var4 && class61.field731 <= var4 + 14 && class61.field732 >= 4 && class61.field732 <= 18) {
                            class78.method1855(3, 0);
                        } else if (class61.field731 >= var4 + 15 && class61.field731 <= var4 + 80 && class61.field732 >= 4 && class61.field732 <= 18) {
                            class78.method1855(3, 1);
                        } else if (class61.field731 >= field1360 + 708 && class61.field732 >= 4 && class61.field731 <= field1360 + 708 + 50 && class61.field732 <= 20) {
                            field1365 = false;
                            Statics.field3939.method5417(field1360, 0);
                            Statics.field1382.method5417(field1360 + 382, 0);
                            Statics.field467.method5386(field1360 + 382 - Statics.field467.field3975 / 2, 18);
                        } else if (field1391 != -1) {
                            class78 var5 = Statics.field1227[field1391];
                            method587(var5);
                            field1365 = false;
                            Statics.field3939.method5417(field1360, 0);
                            Statics.field1382.method5417(field1360 + 382, 0);
                            Statics.field467.method5386(field1360 + 382 - Statics.field467.field3975 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.m(ZB)V")
    public static void method701(boolean arg0) {
        field1378 = class252.field3188;
        field1379 = class252.field3106;
        field1380 = class252.field3238;
        field1376 = 2;
        if (arg0) {
            field1393 = "";
        }
        if (field1381 == null || field1381.length() <= 0) {
            if (Statics.field1142.field1246 == null) {
                field1383 = false;
            } else {
                field1381 = Statics.field1142.field1246;
                field1383 = true;
            }
        }
        method3432();
    }

    @ObfuscatedName("w.z(I)V")
    public static void method58() {
        field1381 = field1381.trim();
        if (field1381.length() == 0) {
            method42(class252.field3277, class252.field3278, class252.field3263);
            return;
        }
        long var0 = class86.method78();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1381;
            Random var4 = new Random();
            class195 var5 = new class195(128);
            class195 var6 = new class195(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3189(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3405(var4.nextInt());
            }
            var5.method3405(var7[0]);
            var5.method3405(var7[1]);
            var5.method3194(var0);
            var5.method3194(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3405(var4.nextInt());
            }
            var5.method3372(class86.field1323, class86.field1324);
            var6.method3189(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3405(var4.nextInt());
            }
            var6.method3194(var4.nextLong());
            var6.method3359(var4.nextLong());
            if (client.field909 == null) {
                byte[] var11 = class168.method2938();
                var6.method3345(var11, 0, var11.length);
            } else {
                var6.method3345(client.field909, 0, client.field909.length);
            }
            var6.method3194(var4.nextLong());
            var6.method3372(class86.field1323, class86.field1324);
            int var12 = class195.method451(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class195 var13 = new class195(var12);
            var13.method3214(var3);
            var13.field2575 = var12;
            var13.method3223(var7);
            class195 var14 = new class195(var13.field2575 + var6.field2575 + var5.field2575 + 5);
            var14.method3189(2);
            var14.method3189(var5.field2575);
            var14.method3345(var5.field2574, 0, var5.field2575);
            var14.method3189(var6.field2575);
            var14.method3345(var6.field2574, 0, var6.field2575);
            var14.method3190(var13.field2575);
            var14.method3345(var13.field2574, 0, var13.field2575);
            String var15 = class318.method703(var14.field2574);
            byte var22;
            try {
                URL var16 = new URL(client.method4329("services", false) + "m=accountappeal/login.ws");
                URLConnection var17 = var16.openConnection();
                var17.setDoInput(true);
                var17.setDoOutput(true);
                var17.setConnectTimeout(5000);
                OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
                var18.write("data2=" + class340.method4902(var15) + "&dest=" + class340.method4902("passwordchoice.ws"));
                var18.flush();
                InputStream var19 = var17.getInputStream();
                class195 var20 = new class195(new byte[1000]);
                while (true) {
                    int var21 = var19.read(var20.field2574, var20.field2575, 1000 - var20.field2575);
                    if (var21 == -1) {
                        var18.close();
                        var19.close();
                        String var23 = new String(var20.field2574);
                        if (var23.startsWith("OFFLINE")) {
                            var22 = 4;
                        } else if (var23.startsWith("WRONG")) {
                            var22 = 7;
                        } else if (var23.startsWith("RELOAD")) {
                            var22 = 3;
                        } else if (var23.startsWith("Not permitted for social network accounts.")) {
                            var22 = 6;
                        } else {
                            var20.method3224(var7);
                            while (var20.field2575 > 0 && var20.field2574[var20.field2575 - 1] == 0) {
                                var20.field2575--;
                            }
                            String var24 = new String(var20.field2574, 0, var20.field2575);
                            boolean var25;
                            if (var24 == null) {
                                var25 = false;
                            } else {
                                label114: {
                                    try {
                                        new URL(var24);
                                    } catch (MalformedURLException var30) {
                                        var25 = false;
                                        break label114;
                                    }
                                    var25 = true;
                                }
                            }
                            if (var25) {
                                label109: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var24));
                                            break label109;
                                        } catch (Exception var29) {
                                        }
                                    }
                                    if (class58.field668.startsWith("win")) {
                                        class58.method3415(var24, 0);
                                    } else if (class58.field668.startsWith("mac")) {
                                        class58.method1716(var24, 1, "openjs");
                                    } else {
                                        class58.method3415(var24, 2);
                                    }
                                }
                                var22 = 2;
                            } else {
                                var22 = 5;
                            }
                        }
                        break;
                    }
                    var20.field2575 += var21;
                    if (var20.field2575 >= 1000) {
                        var22 = 5;
                        break;
                    }
                }
            } catch (Throwable var31) {
                var31.printStackTrace();
                var22 = 5;
            }
            var2 = var22;
        }
        switch(var2) {
            case 2:
                method42(class252.field3280, class252.field3092, class252.field3237);
                field1376 = 6;
                break;
            case 3:
                method42(class252.field3283, class252.field3120, class252.field3285);
                break;
            case 4:
                method42(class252.field3231, class252.field3287, class252.field3288);
                break;
            case 5:
                method42(class252.field3289, class252.field3089, class252.field3291);
                break;
            case 6:
                method42(class252.field3061, class252.field3206, class252.field3294);
                break;
            case 7:
                method42(class252.field3295, class252.field3296, class252.field3297);
        }
    }

    @ObfuscatedName("iw.i(Lki;Lki;Lki;ZI)V")
    public static void method3974(class312 arg0, class312 arg1, class312 arg2, boolean arg3) {
        if (arg3) {
            field1360 = (Statics.field472 - 765) / 2;
            field1366 = field1360 + 202;
            Statics.field280 = field1366 + 180;
        }
        if (field1365) {
            method504(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3939.method5417(field1360, 0);
            Statics.field1382.method5417(field1360 + 382, 0);
            Statics.field467.method5386(field1360 + 382 - Statics.field467.field3975 / 2, 18);
        }
        if (client.field880 == 0 || client.field880 == 5) {
            byte var4 = 20;
            arg0.method5091(class252.field3199, field1366 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class328.method5302(field1366 + 180 - 152, var5, 304, 34, 9179409);
            class328.method5302(field1366 + 180 - 151, var5 + 1, 302, 32, 0);
            class328.method5295(field1366 + 180 - 150, var5 + 2, field1374 * 3, 30, 9179409);
            class328.method5295(field1374 * 3 + (field1366 + 180 - 150), var5 + 2, 300 - field1374 * 3, 30, 0);
            arg0.method5091(field1363, field1366 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field880 == 20) {
            Statics.field3399.method5386(field1366 + 180 - Statics.field3399.field3975 / 2, 271 - Statics.field3399.field3977 / 2);
            short var6 = 201;
            arg0.method5091(field1378, field1366 + 180, var6, 16776960, 0);
            int var86 = var6 + 15;
            arg0.method5091(field1379, field1366 + 180, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method5091(field1380, field1366 + 180, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 7;
            if (field1376 != 4) {
                arg0.method5088(class252.field3257, field1366 + 180 - 110, var89, 16777215, 0);
                short var7 = 200;
                String var8 = Statics.field1142.field1243 ? class319.method4572(field1381) : field1381;
                String var9;
                for (var9 = var8; arg0.method5144(var9) > var7; var9 = var9.substring(0, var9.length() - 1)) {
                }
                arg0.method5088(class313.method5087(var9), field1366 + 180 - 70, var89, 16777215, 0);
                var86 = var89 + 15;
                arg0.method5088(class252.field3258 + class319.method4572(field1393), field1366 + 180 - 108, var86, 16777215, 0);
                var86 += 15;
            }
        }
        if (client.field880 == 10 || client.field880 == 11) {
            Statics.field3399.method5386(field1366, 171);
            if (field1376 == 0) {
                short var10 = 251;
                arg0.method5091(class252.field3157, field1366 + 180, var10, 16776960, 0);
                int var90 = var10 + 30;
                int var11 = field1366 + 180 - 80;
                short var12 = 291;
                Statics.field1389.method5386(var11 - 73, var12 - 20);
                arg0.method5092(class252.field3261, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field1366 + 180 + 80;
                Statics.field1389.method5386(var13 - 73, var12 - 20);
                arg0.method5092(class252.field3163, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1376 == 1) {
                arg0.method5091(field1377, field1366 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method5091(field1378, field1366 + 180, var14, 16777215, 0);
                int var91 = var14 + 15;
                arg0.method5091(field1379, field1366 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method5091(field1380, field1366 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                int var15 = field1366 + 180 - 80;
                short var16 = 321;
                Statics.field1389.method5386(var15 - 73, var16 - 20);
                arg0.method5091(class252.field3079, var15, var16 + 5, 16777215, 0);
                int var17 = field1366 + 180 + 80;
                Statics.field1389.method5386(var17 - 73, var16 - 20);
                arg0.method5091(class252.field3187, var17, var16 + 5, 16777215, 0);
            } else if (field1376 == 2) {
                short var18 = 201;
                arg0.method5091(field1378, Statics.field280, var18, 16776960, 0);
                int var94 = var18 + 15;
                arg0.method5091(field1379, Statics.field280, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method5091(field1380, Statics.field280, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 7;
                arg0.method5088(class252.field3257, Statics.field280 - 110, var97, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field1142.field1243 ? class319.method4572(field1381) : field1381;
                String var21;
                for (var21 = var20; arg0.method5144(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method5088(class313.method5087(var21) + (field1387 == 0 & client.field929 % 40 < 20 ? class87.method585(16776960) + class87.field1336 : ""), Statics.field280 - 70, var97, 16777215, 0);
                var94 = var97 + 15;
                arg0.method5088(class252.field3258 + class319.method4572(field1393) + (field1387 == 1 & client.field929 % 40 < 20 ? class87.method585(16776960) + class87.field1336 : ""), Statics.field280 - 108, var94, 16777215, 0);
                var94 += 15;
                short var22 = 277;
                int var23 = Statics.field280 + -117;
                class331 var24 = Statics.method2551(field1383, field1375);
                var24.method5386(var23, var22);
                int var25 = var24.field3975 + 5 + var23;
                arg1.method5088(class252.field3265, var25, var22 + 13, 16776960, 0);
                int var26 = Statics.field280 + 24;
                class331 var27 = Statics.method2551(Statics.field1142.field1243, field1385);
                var27.method5386(var26, var22);
                int var28 = var27.field3975 + 5 + var26;
                arg1.method5088(class252.field3266, var28, var22 + 13, 16776960, 0);
                int var98 = var22 + 15;
                int var29 = Statics.field280 - 80;
                short var30 = 321;
                Statics.field1389.method5386(var29 - 73, var30 - 20);
                arg0.method5091(class252.field3218, var29, var30 + 5, 16777215, 0);
                int var31 = Statics.field280 + 80;
                Statics.field1389.method5386(var31 - 73, var30 - 20);
                arg0.method5091(class252.field3187, var31, var30 + 5, 16777215, 0);
                short var32 = 357;
                arg1.method5091(class252.field3272, Statics.field280, var32, 16776960, 0);
            } else if (field1376 == 3) {
                short var33 = 201;
                arg0.method5091(class252.field3267, field1366 + 180, var33, 16776960, 0);
                int var99 = var33 + 20;
                arg1.method5091(class252.field3050, field1366 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg1.method5091(class252.field3256, field1366 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var34 = field1366 + 180;
                short var35 = 276;
                Statics.field1389.method5386(var34 - 73, var35 - 20);
                arg2.method5091(class252.field3270, var34, var35 + 5, 16777215, 0);
                int var36 = field1366 + 180;
                short var37 = 326;
                Statics.field1389.method5386(var36 - 73, var37 - 20);
                arg2.method5091(class252.field3271, var36, var37 + 5, 16777215, 0);
            } else if (field1376 == 4) {
                arg0.method5091(class252.field3252, field1366 + 180, 201, 16776960, 0);
                short var38 = 236;
                arg0.method5091(field1378, field1366 + 180, var38, 16777215, 0);
                int var102 = var38 + 15;
                arg0.method5091(field1379, field1366 + 180, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method5091(field1380, field1366 + 180, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method5088(class252.field3140 + class319.method4572(Statics.field502) + (client.field929 % 40 < 20 ? class87.method585(16776960) + class87.field1336 : ""), field1366 + 180 - 108, var104, 16777215, 0);
                int var105 = var104 - 8;
                arg0.method5088(class252.field3033, field1366 + 180 - 9, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method5088(class252.field3034, field1366 + 180 - 9, var106, 16776960, 0);
                int var39 = field1366 + 180 - 9 + arg0.method5144(class252.field3034) + 15;
                int var40 = var106 - arg0.field3896;
                class331 var41;
                if (field1386) {
                    var41 = Statics.field1394;
                } else {
                    var41 = Statics.field1364;
                }
                var41.method5386(var39, var40);
                var102 = var106 + 15;
                int var42 = field1366 + 180 - 80;
                short var43 = 321;
                Statics.field1389.method5386(var42 - 73, var43 - 20);
                arg0.method5091(class252.field3079, var42, var43 + 5, 16777215, 0);
                int var44 = field1366 + 180 + 80;
                Statics.field1389.method5386(var44 - 73, var43 - 20);
                arg0.method5091(class252.field3187, var44, var43 + 5, 16777215, 0);
                arg1.method5091(class252.field3253, field1366 + 180, var43 + 36, 255, 0);
            } else if (field1376 == 5) {
                arg0.method5091(class252.field3273, field1366 + 180, 201, 16776960, 0);
                short var45 = 221;
                arg2.method5091(field1378, field1366 + 180, var45, 16776960, 0);
                int var107 = var45 + 15;
                arg2.method5091(field1379, field1366 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg2.method5091(field1380, field1366 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var110 = var109 + 14;
                arg0.method5088(class252.field3274, field1366 + 180 - 145, var110, 16777215, 0);
                short var46 = 174;
                String var47 = Statics.field1142.field1243 ? class319.method4572(field1381) : field1381;
                String var48;
                for (var48 = var47; arg0.method5144(var48) > var46; var48 = var48.substring(1)) {
                }
                arg0.method5088(class313.method5087(var48) + (client.field929 % 40 < 20 ? class87.method585(16776960) + class87.field1336 : ""), field1366 + 180 - 34, var110, 16777215, 0);
                var107 = var110 + 15;
                int var49 = field1366 + 180 - 80;
                short var50 = 321;
                Statics.field1389.method5386(var49 - 73, var50 - 20);
                arg0.method5091(class252.field3275, var49, var50 + 5, 16777215, 0);
                int var51 = field1366 + 180 + 80;
                Statics.field1389.method5386(var51 - 73, var50 - 20);
                arg0.method5091(class252.field3042, var51, var50 + 5, 16777215, 0);
            } else if (field1376 == 6) {
                short var52 = 201;
                arg0.method5091(field1378, field1366 + 180, var52, 16776960, 0);
                int var111 = var52 + 15;
                arg0.method5091(field1379, field1366 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method5091(field1380, field1366 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var53 = field1366 + 180;
                short var54 = 321;
                Statics.field1389.method5386(var53 - 73, var54 - 20);
                arg0.method5091(class252.field3042, var53, var54 + 5, 16777215, 0);
            }
        }
        if (field1372 > 0) {
            method1071(field1372);
            field1372 = 0;
        }
        short var55 = 256;
        if (field1368 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (field1368 > 768) {
                    Statics.field345[var56] = method505(Statics.field348[var56], Statics.field763[var56], 1024 - field1368);
                } else if (field1368 > 256) {
                    Statics.field345[var56] = Statics.field763[var56];
                } else {
                    Statics.field345[var56] = method505(Statics.field763[var56], Statics.field348[var56], 256 - field1368);
                }
            }
        } else if (field1359 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (field1359 > 768) {
                    Statics.field345[var57] = method505(Statics.field348[var57], Statics.field299[var57], 1024 - field1359);
                } else if (field1359 > 256) {
                    Statics.field345[var57] = Statics.field299[var57];
                } else {
                    Statics.field345[var57] = method505(Statics.field299[var57], Statics.field348[var57], 256 - field1359);
                }
            }
        } else {
            for (int var58 = 0; var58 < 256; var58++) {
                Statics.field345[var58] = Statics.field348[var58];
            }
        }
        class328.method5287(field1360, 9, field1360 + 128, var55 + 7);
        Statics.field3939.method5417(field1360, 0);
        class328.method5286();
        int var59 = 0;
        int var60 = field1360 + Statics.field535.field3965 * 9;
        for (int var61 = 1; var61 < var55 - 1; var61++) {
            int var62 = (var55 - var61) * field1367[var61] / var55;
            int var63 = var62 + 22;
            if (var63 < 0) {
                var63 = 0;
            }
            var59 += var63;
            for (int var64 = var63; var64 < 128; var64++) {
                int var65 = Statics.field2514[var59++];
                if (var65 == 0) {
                    var60++;
                } else {
                    int var67 = 256 - var65;
                    int var68 = Statics.field345[var65];
                    int var69 = Statics.field535.field3964[var60];
                    Statics.field535.field3964[var60++] = ((var68 & 0xFF00FF) * var65 + (var69 & 0xFF00FF) * var67 & 0xFF00FF00) + ((var68 & 0xFF00) * var65 + (var69 & 0xFF00) * var67 & 0xFF0000) >> 8;
                }
            }
            var60 += Statics.field535.field3965 + var63 - 128;
        }
        class328.method5287(field1360 + 765 - 128, 9, field1360 + 765, var55 + 7);
        Statics.field1382.method5417(field1360 + 382, 0);
        class328.method5286();
        int var70 = 0;
        int var71 = field1360 + Statics.field535.field3965 * 9 + 24 + 637;
        for (int var72 = 1; var72 < var55 - 1; var72++) {
            int var73 = (var55 - var72) * field1367[var72] / var55;
            int var74 = 103 - var73;
            int var75 = var71 + var73;
            for (int var76 = 0; var76 < var74; var76++) {
                int var77 = Statics.field2514[var70++];
                if (var77 == 0) {
                    var75++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field345[var77];
                    int var81 = Statics.field535.field3964[var75];
                    Statics.field535.field3964[var75++] = ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) + ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) >> 8;
                }
            }
            var70 += 128 - var74;
            var71 = Statics.field535.field3965 - var74 - var73 + var75;
        }
        Statics.field674[Statics.field1142.field1247 ? 1 : 0].method5386(field1360 + 765 - 40, 463);
        if (client.field880 <= 5 || client.field980 != 0) {
            return;
        }
        if (Statics.field2224 == null) {
            Statics.field2224 = class333.method1643(Statics.field2147, "sl_button", "");
            return;
        }
        int var82 = field1360 + 5;
        short var83 = 463;
        byte var84 = 100;
        byte var85 = 35;
        Statics.field2224.method5386(var82, var83);
        arg0.method5091(class252.field3046 + " " + client.field871, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
        if (Statics.field2069 == null) {
            arg1.method5091(class252.field3293, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
        } else {
            arg1.method5091(class252.field3307, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("a.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method42(String arg0, String arg1, String arg2) {
        field1378 = arg0;
        field1379 = arg1;
        field1380 = arg2;
    }

    @ObfuscatedName("ar.x(Lll;I)V")
    public static final void method575(class331 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field820.length; var2++) {
            Statics.field820[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field820[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field288[var8] = (Statics.field820[var8 - 1] + Statics.field820[var8 + 1] + Statics.field820[var8 - 128] + Statics.field820[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field820;
            Statics.field820 = Statics.field288;
            Statics.field288 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3977; var11++) {
            for (int var12 = 0; var12 < arg0.field3975; var12++) {
                if (arg0.field3980[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3978;
                    int var14 = var11 + 16 + arg0.field3979;
                    int var15 = (var14 << 7) + var13;
                    Statics.field820[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("by.y(IB)V")
    public static final void method1071(int arg0) {
        short var1 = 256;
        field1370 += arg0 * 128;
        if (field1370 > Statics.field820.length) {
            field1370 -= Statics.field820.length;
            int var2 = (int) (Math.random() * 12.0D);
            method575(Statics.field1362[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2514[var3 + var4] - Statics.field820[field1370 + var3 & Statics.field820.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2514[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2514[var9 + var10] = 255;
                } else {
                    Statics.field2514[var9 + var10] = 0;
                }
            }
        }
        if (field1368 > 0) {
            field1368 -= arg0 * 4;
        }
        if (field1359 > 0) {
            field1359 -= arg0 * 4;
        }
        if (field1368 == 0 && field1359 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1368 = 1024;
            }
            if (var12 == 1) {
                field1359 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1367[var13] = field1367[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1367[var14] = (int) (Math.sin((double) field1369 / 14.0D) * 16.0D + Math.sin((double) field1369 / 15.0D) * 14.0D + Math.sin((double) field1369 / 16.0D) * 12.0D);
            field1369++;
        }
        field1371 += arg0 * 839063623;
        int var15 = ((client.field929 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1371 * 532337276; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2514[(var18 << 7) + var17] = 192;
        }
        field1371 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2514[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2514[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1586[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1586[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1586[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2514[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("aa.a(IIII)I")
    public static final int method505(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("aa.v(Lki;Lki;I)V")
    public static void method504(class312 arg0, class312 arg1) {
        if (Statics.field41 == null) {
            Statics.field41 = class333.method4256(Statics.field2147, "sl_back", "");
        }
        if (Statics.field277 == null) {
            Statics.field277 = class333.method562(Statics.field2147, "sl_flags", "");
        }
        if (Statics.field2781 == null) {
            Statics.field2781 = class333.method562(Statics.field2147, "sl_arrows", "");
        }
        if (Statics.field1226 == null) {
            Statics.field1226 = class333.method562(Statics.field2147, "sl_stars", "");
        }
        class328.method5295(field1360, 23, 765, 480, 0);
        class328.method5300(field1360, 0, 125, 23, 12425273, 9135624);
        class328.method5300(field1360 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5091(class252.field3178, field1360 + 62, 15, 0, -1);
        if (Statics.field1226 != null) {
            Statics.field1226[1].method5386(field1360 + 140, 1);
            arg1.method5088(class252.field3299, field1360 + 152, 10, 16777215, -1);
            Statics.field1226[0].method5386(field1360 + 140, 12);
            arg1.method5088(class252.field3221, field1360 + 152, 21, 16777215, -1);
        }
        if (Statics.field2781 != null) {
            int var2 = field1360 + 280;
            if (class78.field1231[0] == 0 && class78.field1230[0] == 0) {
                Statics.field2781[2].method5386(var2, 4);
            } else {
                Statics.field2781[0].method5386(var2, 4);
            }
            if (class78.field1231[0] == 0 && class78.field1230[0] == 1) {
                Statics.field2781[3].method5386(var2 + 15, 4);
            } else {
                Statics.field2781[1].method5386(var2 + 15, 4);
            }
            arg0.method5088(class252.field3301, var2 + 32, 17, 16777215, -1);
            int var3 = field1360 + 390;
            if (class78.field1231[0] == 1 && class78.field1230[0] == 0) {
                Statics.field2781[2].method5386(var3, 4);
            } else {
                Statics.field2781[0].method5386(var3, 4);
            }
            if (class78.field1231[0] == 1 && class78.field1230[0] == 1) {
                Statics.field2781[3].method5386(var3 + 15, 4);
            } else {
                Statics.field2781[1].method5386(var3 + 15, 4);
            }
            arg0.method5088(class252.field3302, var3 + 32, 17, 16777215, -1);
            int var4 = field1360 + 500;
            if (class78.field1231[0] == 2 && class78.field1230[0] == 0) {
                Statics.field2781[2].method5386(var4, 4);
            } else {
                Statics.field2781[0].method5386(var4, 4);
            }
            if (class78.field1231[0] == 2 && class78.field1230[0] == 1) {
                Statics.field2781[3].method5386(var4 + 15, 4);
            } else {
                Statics.field2781[1].method5386(var4 + 15, 4);
            }
            arg0.method5088(class252.field3281, var4 + 32, 17, 16777215, -1);
            int var5 = field1360 + 610;
            if (class78.field1231[0] == 3 && class78.field1230[0] == 0) {
                Statics.field2781[2].method5386(var5, 4);
            } else {
                Statics.field2781[0].method5386(var5, 4);
            }
            if (class78.field1231[0] == 3 && class78.field1230[0] == 1) {
                Statics.field2781[3].method5386(var5 + 15, 4);
            } else {
                Statics.field2781[1].method5386(var5 + 15, 4);
            }
            arg0.method5088(class252.field3304, var5 + 32, 17, 16777215, -1);
        }
        class328.method5295(field1360 + 708, 4, 50, 16, 0);
        arg1.method5091(class252.field3187, field1360 + 708 + 25, 16, 16777215, -1);
        field1391 = -1;
        if (Statics.field41 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class78.field1228) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class78.field1228) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class78.field1228) {
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
            int var17 = field1360 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class78.field1228; var20++) {
                class78 var21 = Statics.field1227[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1233);
                if (var21.field1233 == -1) {
                    var23 = class252.field3177;
                    var22 = false;
                } else if (var21.field1233 > 1980) {
                    var23 = class252.field3306;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1543()) {
                    if (var21.method1538()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1542()) {
                    var24 = 16711680;
                    if (var21.method1538()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1540()) {
                    if (var21.method1538()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1538()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class61.field717 >= var17 && class61.field715 >= var16 && class61.field717 < var6 + var17 && class61.field715 < var7 + var16 && var22) {
                    field1391 = var20;
                    Statics.field41[var25].method5423(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field41[var25].method5417(var17, var16);
                }
                if (Statics.field277 != null) {
                    Statics.field277[(var21.method1538() ? 8 : 0) + var21.field1224].method5386(var17 + 29, var16);
                }
                arg0.method5091(Integer.toString(var21.field1236), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method5091(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method5144(Statics.field1227[field1391].field1239) + 6;
                int var27 = arg1.field3896 + 8;
                class328.method5295(class61.field717 - var26 / 2, class61.field715 + 20 + 5, var26, var27, 16777120);
                class328.method5302(class61.field717 - var26 / 2, class61.field715 + 20 + 5, var26, var27, 0);
                arg1.method5091(Statics.field1227[field1391].field1239, class61.field717, class61.field715 + 20 + 5 + arg1.field3896 + 4, 0, -1);
            }
        }
        Statics.field535.method762(0, 0);
    }

    @ObfuscatedName("an.q(Lbg;S)V")
    public static void method587(class78 arg0) {
        if (arg0.method1538() != client.field874) {
            client.field874 = arg0.method1538();
            class284.method1579(arg0.method1538());
        }
        Statics.field1423 = arg0.field1235;
        client.field871 = arg0.field1236;
        client.field935 = arg0.field1234;
        Statics.field2687 = client.field873 == 0 ? 43594 : arg0.field1236 + 40000;
        Statics.field2961 = client.field873 == 0 ? 443 : arg0.field1236 + 50000;
        Statics.field2050 = Statics.field2687;
    }

    @ObfuscatedName("bc.r(I)V")
    public static void method1032() {
        if (class78.method4132()) {
            field1365 = true;
        }
    }
}
