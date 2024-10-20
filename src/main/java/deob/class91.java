package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

@ObfuscatedName("cc")
public class class91 {

    @ObfuscatedName("cc.e")
    public static int field1337 = 0;

    @ObfuscatedName("cc.j")
    public static int field1342 = field1337 + 202;

    @ObfuscatedName("cc.k")
    public static int[] field1366 = new int[256];

    @ObfuscatedName("cc.t")
    public static int field1345 = 0;

    @ObfuscatedName("cc.ax")
    public static int field1372 = 0;

    @ObfuscatedName("cc.ay")
    public static int field1361 = 0;

    @ObfuscatedName("cc.as")
    public static int field1348 = 0;

    @ObfuscatedName("cc.av")
    public static int field1371 = 0;

    @ObfuscatedName("cc.ao")
    public static int field1350 = 0;

    @ObfuscatedName("cc.ak")
    public static int field1351 = 10;

    @ObfuscatedName("cc.ad")
    public static String field1352 = "";

    @ObfuscatedName("cc.az")
    public static int field1353 = 0;

    @ObfuscatedName("cc.aa")
    public static String field1357 = "";

    @ObfuscatedName("cc.ab")
    public static String field1356 = "";

    @ObfuscatedName("cc.al")
    public static String field1343 = "";

    @ObfuscatedName("cc.af")
    public static String field1346 = "";

    @ObfuscatedName("cc.ah")
    public static String field1358 = "";

    @ObfuscatedName("cc.au")
    public static String field1359 = "";

    @ObfuscatedName("cc.ap")
    public static boolean field1344 = false;

    @ObfuscatedName("cc.aq")
    public static boolean field1355 = false;

    @ObfuscatedName("cc.bq")
    public static boolean field1354 = false;

    @ObfuscatedName("cc.bj")
    public static boolean field1363 = true;

    @ObfuscatedName("cc.bw")
    public static int field1364 = 0;

    @ObfuscatedName("cc.bp")
    public static String field1365 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cc.bh")
    public static String field1370 = "1234567890";

    @ObfuscatedName("cc.bl")
    public static boolean field1367 = false;

    @ObfuscatedName("cc.bf")
    public static int field1369 = -1;

    @ObfuscatedName("cc.bt")
    public static long field1362;

    @ObfuscatedName("cc.bs")
    public static long field1347;

    static {
        new DecimalFormat("##0.00");
        new class161();
        field1362 = -1L;
        field1347 = -1L;
    }

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.g(Ljr;Ljr;ZIS)V")
    public static void method230(class262 arg0, class262 arg1, boolean arg2, int arg3) {
        if (!Statics.field1336) {
            field1353 = arg3;
            class328.method5358();
            byte[] var4 = arg0.method4271("title.jpg", "");
            Statics.field1360 = class56.method4423(var4);
            Statics.field1341 = Statics.field1360.method5450();
            if ((client.field854 & 0x20000000) == 0) {
                Statics.field304 = class333.method1033(arg1, "logo", "");
            } else {
                Statics.field304 = class333.method1033(arg1, "logo_deadman_mode", "");
            }
            Statics.field1338 = class333.method1033(arg1, "titlebox", "");
            Statics.field2107 = class333.method1033(arg1, "titlebutton", "");
            Statics.field1340 = class333.method4242(arg1, "runes", "");
            Statics.field1299 = class333.method4242(arg1, "title_mute", "");
            Statics.field34 = class333.method1033(arg1, "options_radio_buttons,0", "");
            Statics.field263 = class333.method1033(arg1, "options_radio_buttons,4", "");
            Statics.field340 = class333.method1033(arg1, "options_radio_buttons,2", "");
            Statics.field812 = class333.method1033(arg1, "options_radio_buttons,6", "");
            Statics.field2572 = Statics.field34.field3981;
            Statics.field771 = Statics.field34.field3983;
            Statics.field502 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field502[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field502[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field502[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field502[var8 + 192] = 16777215;
            }
            Statics.field3927 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field3927[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3927[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3927[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3927[var12 + 192] = 16777215;
            }
            Statics.field19 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field19[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field19[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field19[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field19[var16 + 192] = 16777215;
            }
            Statics.field1339 = new int[256];
            Statics.field2605 = new int[32768];
            Statics.field460 = new int[32768];
            method1810((class331) null);
            Statics.field790 = new int[32768];
            Statics.field560 = new int[32768];
            if (arg2) {
                field1358 = "";
                field1359 = "";
            }
            Statics.field339 = 0;
            Statics.field768 = "";
            field1363 = true;
            field1367 = false;
            if (Statics.field1117.field1227) {
                class230.field2695 = 1;
                Statics.field1906 = null;
                Statics.field3941 = -1;
                Statics.field1898 = -1;
                Statics.field1335 = 0;
                Statics.field2194 = false;
                Statics.field336 = 2;
            } else {
                class230.method4463(2, Statics.field235, "scape main", "", 255, false);
            }
            class265.method141(false);
            Statics.field1336 = true;
            field1337 = (Statics.field2039 - 765) / 2;
            field1342 = field1337 + 202;
            Statics.field294 = field1342 + 180;
            Statics.field1360.method5460(field1337, 0);
            Statics.field1341.method5460(field1337 + 382, 0);
            Statics.field304.method5443(field1337 + 382 - Statics.field304.field3981 / 2, 18);
        } else if (arg3 == 4) {
            field1353 = 4;
        }
    }

    @ObfuscatedName("bk.e(I)V")
    public static void method1034() {
        if (field1358 != null && field1358.length() > 0) {
            return;
        }
        if (Statics.field1117.field1231 == null) {
            field1344 = false;
        } else {
            field1358 = Statics.field1117.field1231;
            field1344 = true;
        }
    }

    @ObfuscatedName("ek.b(I)V")
    public static void method2958() {
        if (field1344 && field1358 != null && field1358.length() > 0) {
            field1364 = 1;
        } else {
            field1364 = 0;
        }
    }

    @ObfuscatedName("a.z(Lbz;I)V")
    public static void method170(class60 arg0) {
        if (!field1367) {
            if ((class61.field711 == 1 || !Statics.field2061 && class61.field711 == 4) && class61.field715 >= field1337 + 765 - 50 && class61.field716 >= 453) {
                Statics.field1117.field1227 = !Statics.field1117.field1227;
                class79.method4185();
                if (Statics.field1117.field1227) {
                    class230.method609();
                } else {
                    class264 var6 = Statics.field235;
                    int var7 = var6.method4306("scape main");
                    int var8 = var6.method4295(var7, "");
                    class230.method3043(var6, var7, var8, 255, false);
                }
            }
            if (client.field1111 != 5) {
                if (field1362 == -1L) {
                    field1362 = class197.method4873() + 1000L;
                }
                long var9 = class197.method4873();
                if (client.method1041() && field1347 == -1L) {
                    field1347 = var9;
                    if (field1347 > field1362) {
                        field1362 = field1347;
                    }
                }
                field1371++;
                if (client.field1111 == 10 || client.field1111 == 11) {
                    if (client.field1020 == 0) {
                        if (class61.field711 == 1 || !Statics.field2061 && class61.field711 == 4) {
                            int var11 = field1337 + 5;
                            short var12 = 463;
                            byte var13 = 100;
                            byte var14 = 35;
                            if (class61.field715 >= var11 && class61.field715 <= var11 + var13 && class61.field716 >= var12 && class61.field716 <= var12 + var14) {
                                method3314();
                                return;
                            }
                        }
                        if (Statics.field370 != null) {
                            method3314();
                        }
                    }
                    int var15 = class61.field711;
                    int var16 = class61.field715;
                    int var17 = class61.field716;
                    if (var15 == 0) {
                        var16 = class61.field708;
                        var17 = class61.field709;
                    }
                    if (!Statics.field2061 && var15 == 4) {
                        var15 = 1;
                    }
                    if (field1353 == 0) {
                        boolean var18 = false;
                        while (class52.method4967()) {
                            if (Statics.field3860 == 84) {
                                var18 = true;
                            }
                        }
                        int var19 = Statics.field294 - 80;
                        short var20 = 291;
                        if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                            class58.method3072(client.method4403("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var21 = Statics.field294 + 80;
                        if (var15 == 1 && var16 >= var21 - 75 && var16 <= var21 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20 || var18) {
                            if ((client.field854 & 0x2000000) != 0) {
                                field1357 = "";
                                field1356 = class252.field3245;
                                field1343 = class252.field3246;
                                field1346 = class252.field3247;
                                field1353 = 1;
                                method2958();
                            } else if ((client.field854 & 0x4) != 0) {
                                if ((client.field854 & 0x400) == 0) {
                                    field1356 = class252.field3236;
                                    field1343 = class252.field3237;
                                    field1346 = class252.field3238;
                                } else {
                                    field1356 = class252.field3242;
                                    field1343 = class252.field3274;
                                    field1346 = class252.field3054;
                                }
                                field1357 = class252.field3235;
                                field1353 = 1;
                                method2958();
                            } else if ((client.field854 & 0x400) == 0) {
                                method97(false);
                            } else {
                                field1356 = class252.field3239;
                                field1343 = class252.field3061;
                                field1346 = class252.field3241;
                                field1357 = class252.field3235;
                                field1353 = 1;
                                method2958();
                            }
                        }
                    } else if (field1353 == 1) {
                        while (class52.method4967()) {
                            if (Statics.field3860 == 84) {
                                method97(false);
                            } else if (Statics.field3860 == 13) {
                                field1353 = 0;
                            }
                        }
                        int var22 = Statics.field294 - 80;
                        short var23 = 321;
                        if (var15 == 1 && var16 >= var22 - 75 && var16 <= var22 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                            method97(false);
                        }
                        int var24 = Statics.field294 + 80;
                        if (var15 == 1 && var16 >= var24 - 75 && var16 <= var24 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                            field1353 = 0;
                        }
                    } else if (field1353 == 2) {
                        short var25 = 201;
                        int var51 = var25 + 52;
                        if (var15 == 1 && var17 >= var51 - 12 && var17 < var51 + 2) {
                            field1364 = 0;
                        }
                        var51 += 15;
                        if (var15 == 1 && var17 >= var51 - 12 && var17 < var51 + 2) {
                            field1364 = 1;
                        }
                        var51 += 15;
                        short var26 = 361;
                        if (var15 == 1 && var17 >= var26 - 15 && var17 < var26) {
                            method4439(class252.field3105, class252.field3072, class252.field3275);
                            field1353 = 5;
                            return;
                        }
                        int var27 = Statics.field294 - 80;
                        short var28 = 321;
                        if (var15 == 1 && var16 >= var27 - 75 && var16 <= var27 + 75 && var17 >= var28 - 20 && var17 <= var28 + 20) {
                            field1358 = field1358.trim();
                            if (field1358.length() == 0) {
                                method4439(class252.field3138, class252.field3139, class252.field3140);
                                return;
                            }
                            if (field1359.length() == 0) {
                                method4439(class252.field3141, class252.field3290, class252.field3143);
                                return;
                            }
                            method4439(class252.field3250, class252.field3251, class252.field3063);
                            client.method22(false);
                            client.method751(20);
                            return;
                        }
                        int var29 = field1342 + 180 + 80;
                        if (var15 == 1 && var16 >= var29 - 75 && var16 <= var29 + 75 && var17 >= var28 - 20 && var17 <= var28 + 20) {
                            field1353 = 0;
                            field1358 = "";
                            field1359 = "";
                            Statics.field339 = 0;
                            Statics.field768 = "";
                            field1363 = true;
                        }
                        int var30 = Statics.field294 + -117;
                        short var31 = 277;
                        field1355 = var16 >= var30 && var16 < Statics.field2572 + var30 && var17 >= var31 && var17 < Statics.field771 + var31;
                        if (var15 == 1 && field1355) {
                            field1344 = !field1344;
                            if (!field1344 && Statics.field1117.field1231 != null) {
                                Statics.field1117.field1231 = null;
                                class79.method4185();
                            }
                        }
                        int var32 = Statics.field294 + 24;
                        short var33 = 277;
                        field1354 = var16 >= var32 && var16 < Statics.field2572 + var32 && var17 >= var33 && var17 < Statics.field771 + var33;
                        if (var15 == 1 && field1354) {
                            Statics.field1117.field1232 = !Statics.field1117.field1232;
                            if (!Statics.field1117.field1232) {
                                field1358 = "";
                                Statics.field1117.field1231 = null;
                                method2958();
                            }
                            class79.method4185();
                        }
                        while (true) {
                            while (class52.method4967()) {
                                boolean var34 = false;
                                for (int var35 = 0; var35 < field1365.length(); var35++) {
                                    if (Statics.field244 == field1365.charAt(var35)) {
                                        var34 = true;
                                        break;
                                    }
                                }
                                if (Statics.field3860 == 13) {
                                    field1353 = 0;
                                    field1358 = "";
                                    field1359 = "";
                                    Statics.field339 = 0;
                                    Statics.field768 = "";
                                    field1363 = true;
                                } else if (field1364 == 0) {
                                    if (Statics.field3860 == 85 && field1358.length() > 0) {
                                        field1358 = field1358.substring(0, field1358.length() - 1);
                                    }
                                    if (Statics.field3860 == 84 || Statics.field3860 == 80) {
                                        field1364 = 1;
                                    }
                                    if (var34 && field1358.length() < 320) {
                                        field1358 = field1358 + Statics.field244;
                                    }
                                } else if (field1364 == 1) {
                                    if (Statics.field3860 == 85 && field1359.length() > 0) {
                                        field1359 = field1359.substring(0, field1359.length() - 1);
                                    }
                                    if (Statics.field3860 == 84 || Statics.field3860 == 80) {
                                        field1364 = 0;
                                    }
                                    if (Statics.field3860 == 84) {
                                        field1358 = field1358.trim();
                                        if (field1358.length() == 0) {
                                            method4439(class252.field3138, class252.field3139, class252.field3140);
                                            return;
                                        }
                                        if (field1359.length() == 0) {
                                            method4439(class252.field3141, class252.field3290, class252.field3143);
                                            return;
                                        }
                                        method4439(class252.field3250, class252.field3251, class252.field3063);
                                        client.method22(false);
                                        client.method751(20);
                                        return;
                                    }
                                    if (var34 && field1359.length() < 20) {
                                        field1359 = field1359 + Statics.field244;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1353 == 3) {
                        int var36 = field1342 + 180;
                        short var37 = 276;
                        if (var15 == 1 && var16 >= var36 - 75 && var16 <= var36 + 75 && var17 >= var37 - 20 && var17 <= var37 + 20) {
                            method97(false);
                        }
                        int var38 = field1342 + 180;
                        short var39 = 326;
                        if (var15 == 1 && var16 >= var38 - 75 && var16 <= var38 + 75 && var17 >= var39 - 20 && var17 <= var39 + 20) {
                            method4439(class252.field3105, class252.field3072, class252.field3275);
                            field1353 = 5;
                            return;
                        }
                    } else if (field1353 == 4) {
                        int var40 = field1342 + 180 - 80;
                        short var41 = 321;
                        if (var15 == 1 && var16 >= var40 - 75 && var16 <= var40 + 75 && var17 >= var41 - 20 && var17 <= var41 + 20) {
                            Statics.field768.trim();
                            if (Statics.field768.length() != 6) {
                                method4439(class252.field3222, class252.field3058, class252.field3122);
                                return;
                            }
                            Statics.field339 = Integer.parseInt(Statics.field768);
                            Statics.field768 = "";
                            client.method22(true);
                            method4439(class252.field3250, class252.field3251, class252.field3063);
                            client.method751(20);
                            return;
                        }
                        if (var15 == 1 && var16 >= field1342 + 180 - 9 && var16 <= field1342 + 180 + 130 && var17 >= 263 && var17 <= 296) {
                            field1363 = !field1363;
                        }
                        if (var15 == 1 && var16 >= field1342 + 180 - 34 && var16 <= field1342 + 180 + 34 && var17 >= 351 && var17 <= 363) {
                            class58.method3072(client.method4403("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var42 = field1342 + 180 + 80;
                        if (var15 == 1 && var16 >= var42 - 75 && var16 <= var42 + 75 && var17 >= var41 - 20 && var17 <= var41 + 20) {
                            field1353 = 0;
                            field1358 = "";
                            field1359 = "";
                            Statics.field339 = 0;
                            Statics.field768 = "";
                        }
                        while (class52.method4967()) {
                            boolean var43 = false;
                            for (int var44 = 0; var44 < field1370.length(); var44++) {
                                if (Statics.field244 == field1370.charAt(var44)) {
                                    var43 = true;
                                    break;
                                }
                            }
                            if (Statics.field3860 == 13) {
                                field1353 = 0;
                                field1358 = "";
                                field1359 = "";
                                Statics.field339 = 0;
                                Statics.field768 = "";
                            } else {
                                if (Statics.field3860 == 85 && Statics.field768.length() > 0) {
                                    Statics.field768 = Statics.field768.substring(0, Statics.field768.length() - 1);
                                }
                                if (Statics.field3860 == 84) {
                                    Statics.field768.trim();
                                    if (Statics.field768.length() != 6) {
                                        method4439(class252.field3222, class252.field3058, class252.field3122);
                                        return;
                                    }
                                    Statics.field339 = Integer.parseInt(Statics.field768);
                                    Statics.field768 = "";
                                    client.method22(true);
                                    method4439(class252.field3250, class252.field3251, class252.field3063);
                                    client.method751(20);
                                    return;
                                }
                                if (var43 && Statics.field768.length() < 6) {
                                    Statics.field768 = Statics.field768 + Statics.field244;
                                }
                            }
                        }
                    } else if (field1353 == 5) {
                        int var45 = field1342 + 180 - 80;
                        short var46 = 321;
                        if (var15 == 1 && var16 >= var45 - 75 && var16 <= var45 + 75 && var17 >= var46 - 20 && var17 <= var46 + 20) {
                            method4458();
                            return;
                        }
                        int var47 = field1342 + 180 + 80;
                        if (var15 == 1 && var16 >= var47 - 75 && var16 <= var47 + 75 && var17 >= var46 - 20 && var17 <= var46 + 20) {
                            method97(true);
                        }
                        while (class52.method4967()) {
                            boolean var48 = false;
                            for (int var49 = 0; var49 < field1365.length(); var49++) {
                                if (Statics.field244 == field1365.charAt(var49)) {
                                    var48 = true;
                                    break;
                                }
                            }
                            if (Statics.field3860 == 13) {
                                method97(true);
                            } else {
                                if (Statics.field3860 == 85 && field1358.length() > 0) {
                                    field1358 = field1358.substring(0, field1358.length() - 1);
                                }
                                if (Statics.field3860 == 84) {
                                    method4458();
                                    return;
                                }
                                if (var48 && field1358.length() < 320) {
                                    field1358 = field1358 + Statics.field244;
                                }
                            }
                        }
                    } else if (field1353 == 6) {
                        while (true) {
                            do {
                                if (!class52.method4967()) {
                                    short var50 = 321;
                                    if (var15 == 1 && var17 >= var50 - 20 && var17 <= var50 + 20) {
                                        method97(true);
                                    }
                                    return;
                                }
                            } while (Statics.field3860 != 84 && Statics.field3860 != 13);
                            method97(true);
                        }
                    }
                }
            }
        } else if (class61.field711 == 1 || !Statics.field2061 && class61.field711 == 4) {
            int var1 = field1337 + 280;
            if (class61.field715 >= var1 && class61.field715 <= var1 + 14 && class61.field716 >= 4 && class61.field716 <= 18) {
                class78.method207(0, 0);
            } else if (class61.field715 >= var1 + 15 && class61.field715 <= var1 + 80 && class61.field716 >= 4 && class61.field716 <= 18) {
                class78.method207(0, 1);
            } else {
                int var2 = field1337 + 390;
                if (class61.field715 >= var2 && class61.field715 <= var2 + 14 && class61.field716 >= 4 && class61.field716 <= 18) {
                    class78.method207(1, 0);
                } else if (class61.field715 >= var2 + 15 && class61.field715 <= var2 + 80 && class61.field716 >= 4 && class61.field716 <= 18) {
                    class78.method207(1, 1);
                } else {
                    int var3 = field1337 + 500;
                    if (class61.field715 >= var3 && class61.field715 <= var3 + 14 && class61.field716 >= 4 && class61.field716 <= 18) {
                        class78.method207(2, 0);
                    } else if (class61.field715 >= var3 + 15 && class61.field715 <= var3 + 80 && class61.field716 >= 4 && class61.field716 <= 18) {
                        class78.method207(2, 1);
                    } else {
                        int var4 = field1337 + 610;
                        if (class61.field715 >= var4 && class61.field715 <= var4 + 14 && class61.field716 >= 4 && class61.field716 <= 18) {
                            class78.method207(3, 0);
                        } else if (class61.field715 >= var4 + 15 && class61.field715 <= var4 + 80 && class61.field716 >= 4 && class61.field716 <= 18) {
                            class78.method207(3, 1);
                        } else if (class61.field715 >= field1337 + 708 && class61.field716 >= 4 && class61.field715 <= field1337 + 708 + 50 && class61.field716 <= 20) {
                            field1367 = false;
                            Statics.field1360.method5460(field1337, 0);
                            Statics.field1341.method5460(field1337 + 382, 0);
                            Statics.field304.method5443(field1337 + 382 - Statics.field304.field3981 / 2, 18);
                        } else if (field1369 != -1) {
                            class78 var5 = Statics.field2216[field1369];
                            method523(var5);
                            field1367 = false;
                            Statics.field1360.method5460(field1337, 0);
                            Statics.field1341.method5460(field1337 + 382, 0);
                            Statics.field304.method5443(field1337 + 382 - Statics.field304.field3981 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.n(ZI)V")
    public static void method97(boolean arg0) {
        field1356 = class252.field3232;
        field1343 = class252.field3226;
        field1346 = class252.field3101;
        field1353 = 2;
        if (arg0) {
            field1359 = "";
        }
        method1034();
        method2958();
    }

    @ObfuscatedName("jk.l(I)V")
    public static void method4458() {
        field1358 = field1358.trim();
        if (field1358.length() == 0) {
            method4439(class252.field3105, class252.field3072, class252.field3275);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method4403("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class195 var4 = new class195(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2563, var4.field2562, 1000 - var4.field2562);
                if (var5 == -1) {
                    var4.field2562 = 0;
                    long var8 = var4.method3381();
                    var6 = var8;
                    break;
                }
                var4.field2562 += var5;
                if (var4.field2562 >= 1000) {
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
            var13 = class86.method784(var6, field1358);
        }
        switch(var13) {
            case 2:
                method4439(class252.field3075, class252.field3277, class252.field3170);
                field1353 = 6;
                break;
            case 3:
                method4439(class252.field3279, class252.field3289, class252.field3181);
                break;
            case 4:
                method4439(class252.field3243, class252.field3283, class252.field3284);
                break;
            case 5:
                method4439(class252.field3281, class252.field3286, class252.field3287);
                break;
            case 6:
                method4439(class252.field3288, class252.field3175, class252.field3048);
                break;
            case 7:
                method4439(class252.field3291, class252.field3292, class252.field3159);
        }
    }

    @ObfuscatedName("ay.s(Lkh;Lkh;Lkh;ZB)V")
    public static void method241(class312 arg0, class312 arg1, class312 arg2, boolean arg3) {
        if (arg3) {
            field1337 = (Statics.field2039 - 765) / 2;
            field1342 = field1337 + 202;
            Statics.field294 = field1342 + 180;
        }
        if (field1367) {
            if (Statics.field745 == null) {
                Statics.field745 = class333.method235(Statics.field313, "sl_back", "");
            }
            if (Statics.field1368 == null) {
                Statics.field1368 = class333.method4242(Statics.field313, "sl_flags", "");
            }
            if (Statics.field18 == null) {
                Statics.field18 = class333.method4242(Statics.field313, "sl_arrows", "");
            }
            if (Statics.field452 == null) {
                Statics.field452 = class333.method4242(Statics.field313, "sl_stars", "");
            }
            class328.method5362(field1337, 23, 765, 480, 0);
            class328.method5398(field1337, 0, 125, 23, 12425273, 9135624);
            class328.method5398(field1337 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5137(class252.field3294, field1337 + 62, 15, 0, -1);
            if (Statics.field452 != null) {
                Statics.field452[1].method5443(field1337 + 140, 1);
                arg1.method5186(class252.field3295, field1337 + 152, 10, 16777215, -1);
                Statics.field452[0].method5443(field1337 + 140, 12);
                arg1.method5186(class252.field3296, field1337 + 152, 21, 16777215, -1);
            }
            if (Statics.field18 != null) {
                int var4 = field1337 + 280;
                if (class78.field1214[0] == 0 && class78.field1211[0] == 0) {
                    Statics.field18[2].method5443(var4, 4);
                } else {
                    Statics.field18[0].method5443(var4, 4);
                }
                if (class78.field1214[0] == 0 && class78.field1211[0] == 1) {
                    Statics.field18[3].method5443(var4 + 15, 4);
                } else {
                    Statics.field18[1].method5443(var4 + 15, 4);
                }
                arg0.method5186(class252.field3079, var4 + 32, 17, 16777215, -1);
                int var5 = field1337 + 390;
                if (class78.field1214[0] == 1 && class78.field1211[0] == 0) {
                    Statics.field18[2].method5443(var5, 4);
                } else {
                    Statics.field18[0].method5443(var5, 4);
                }
                if (class78.field1214[0] == 1 && class78.field1211[0] == 1) {
                    Statics.field18[3].method5443(var5 + 15, 4);
                } else {
                    Statics.field18[1].method5443(var5 + 15, 4);
                }
                arg0.method5186(class252.field3298, var5 + 32, 17, 16777215, -1);
                int var6 = field1337 + 500;
                if (class78.field1214[0] == 2 && class78.field1211[0] == 0) {
                    Statics.field18[2].method5443(var6, 4);
                } else {
                    Statics.field18[0].method5443(var6, 4);
                }
                if (class78.field1214[0] == 2 && class78.field1211[0] == 1) {
                    Statics.field18[3].method5443(var6 + 15, 4);
                } else {
                    Statics.field18[1].method5443(var6 + 15, 4);
                }
                arg0.method5186(class252.field3299, var6 + 32, 17, 16777215, -1);
                int var7 = field1337 + 610;
                if (class78.field1214[0] == 3 && class78.field1211[0] == 0) {
                    Statics.field18[2].method5443(var7, 4);
                } else {
                    Statics.field18[0].method5443(var7, 4);
                }
                if (class78.field1214[0] == 3 && class78.field1211[0] == 1) {
                    Statics.field18[3].method5443(var7 + 15, 4);
                } else {
                    Statics.field18[1].method5443(var7 + 15, 4);
                }
                arg0.method5186(class252.field3300, var7 + 32, 17, 16777215, -1);
            }
            class328.method5362(field1337 + 708, 4, 50, 16, 0);
            arg1.method5137(class252.field3264, field1337 + 708 + 25, 16, 16777215, -1);
            field1369 = -1;
            if (Statics.field745 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class78.field1216) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class78.field1216) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class78.field1216) {
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
                int var19 = field1337 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class78.field1216; var22++) {
                    class78 var23 = Statics.field2216[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1217);
                    if (var23.field1217 == -1) {
                        var25 = class252.field3301;
                        var24 = false;
                    } else if (var23.field1217 > 1980) {
                        var25 = class252.field3302;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1607()) {
                        if (var23.method1608()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1627()) {
                        var26 = 16711680;
                        if (var23.method1608()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1610()) {
                        if (var23.method1608()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1608()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class61.field708 >= var19 && class61.field709 >= var18 && class61.field708 < var8 + var19 && class61.field709 < var9 + var18 && var24) {
                        field1369 = var22;
                        Statics.field745[var27].method5464(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field745[var27].method5460(var19, var18);
                    }
                    if (Statics.field1368 != null) {
                        Statics.field1368[(var23.method1608() ? 8 : 0) + var23.field1220].method5443(var19 + 29, var18);
                    }
                    arg0.method5137(Integer.toString(var23.field1215), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method5137(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method5129(Statics.field2216[field1369].field1219) + 6;
                    int var29 = arg1.field3910 + 8;
                    class328.method5362(class61.field708 - var28 / 2, class61.field709 + 20 + 5, var28, var29, 16777120);
                    class328.method5368(class61.field708 - var28 / 2, class61.field709 + 20 + 5, var28, var29, 0);
                    arg1.method5137(Statics.field2216[field1369].field1219, class61.field708, class61.field709 + 20 + 5 + arg1.field3910 + 4, 0, -1);
                }
            }
            Statics.field309.method791(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1360.method5460(field1337, 0);
            Statics.field1341.method5460(field1337 + 382, 0);
            Statics.field304.method5443(field1337 + 382 - Statics.field304.field3981 / 2, 18);
        }
        if (client.field1111 == 0 || client.field1111 == 5) {
            byte var30 = 20;
            arg0.method5137(class252.field3278, field1342 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class328.method5368(field1342 + 180 - 152, var31, 304, 34, 9179409);
            class328.method5368(field1342 + 180 - 151, var31 + 1, 302, 32, 0);
            class328.method5362(field1342 + 180 - 150, var31 + 2, field1351 * 3, 30, 9179409);
            class328.method5362(field1351 * 3 + (field1342 + 180 - 150), var31 + 2, 300 - field1351 * 3, 30, 0);
            arg0.method5137(field1352, field1342 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field1111 == 20) {
            Statics.field1338.method5443(field1342 + 180 - Statics.field1338.field3981 / 2, 271 - Statics.field1338.field3983 / 2);
            short var32 = 201;
            arg0.method5137(field1356, field1342 + 180, var32, 16776960, 0);
            int var156 = var32 + 15;
            arg0.method5137(field1343, field1342 + 180, var156, 16776960, 0);
            int var157 = var156 + 15;
            arg0.method5137(field1346, field1342 + 180, var157, 16776960, 0);
            int var158 = var157 + 15;
            int var159 = var158 + 7;
            if (field1353 != 4) {
                arg0.method5186(class252.field3253, field1342 + 180 - 110, var159, 16777215, 0);
                short var33 = 200;
                String var40;
                if (Statics.field1117.field1232) {
                    String var34 = field1358;
                    int var35 = var34.length();
                    char[] var36 = new char[var35];
                    for (int var37 = 0; var37 < var35; var37++) {
                        var36[var37] = '*';
                    }
                    String var38 = new String(var36);
                    var40 = var38;
                } else {
                    var40 = field1358;
                }
                String var42;
                for (var42 = var40; arg0.method5129(var42) > var33; var42 = var42.substring(0, var42.length() - 1)) {
                }
                arg0.method5186(class313.method5133(var42), field1342 + 180 - 70, var159, 16777215, 0);
                var156 = var159 + 15;
                String var44 = class252.field3077;
                String var45 = field1359;
                int var46 = var45.length();
                char[] var47 = new char[var46];
                for (int var48 = 0; var48 < var46; var48++) {
                    var47[var48] = '*';
                }
                String var49 = new String(var47);
                arg0.method5186(var44 + var49, field1342 + 180 - 108, var156, 16777215, 0);
                var156 += 15;
            }
        }
        if (client.field1111 == 10 || client.field1111 == 11) {
            Statics.field1338.method5443(field1342, 171);
            if (field1353 == 0) {
                short var51 = 251;
                arg0.method5137(class252.field3256, field1342 + 180, var51, 16776960, 0);
                int var160 = var51 + 30;
                int var52 = field1342 + 180 - 80;
                short var53 = 291;
                Statics.field2107.method5443(var52 - 73, var53 - 20);
                arg0.method5138(class252.field3176, var52 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var54 = field1342 + 180 + 80;
                Statics.field2107.method5443(var54 - 73, var53 - 20);
                arg0.method5138(class252.field3258, var54 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1353 == 1) {
                arg0.method5137(field1357, field1342 + 180, 201, 16776960, 0);
                short var55 = 236;
                arg0.method5137(field1356, field1342 + 180, var55, 16777215, 0);
                int var161 = var55 + 15;
                arg0.method5137(field1343, field1342 + 180, var161, 16777215, 0);
                int var162 = var161 + 15;
                arg0.method5137(field1346, field1342 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                int var56 = field1342 + 180 - 80;
                short var57 = 321;
                Statics.field2107.method5443(var56 - 73, var57 - 20);
                arg0.method5137(class252.field3257, var56, var57 + 5, 16777215, 0);
                int var58 = field1342 + 180 + 80;
                Statics.field2107.method5443(var58 - 73, var57 - 20);
                arg0.method5137(class252.field3264, var58, var57 + 5, 16777215, 0);
            } else if (field1353 == 2) {
                short var59 = 201;
                arg0.method5137(field1356, Statics.field294, var59, 16776960, 0);
                int var164 = var59 + 15;
                arg0.method5137(field1343, Statics.field294, var164, 16776960, 0);
                int var165 = var164 + 15;
                arg0.method5137(field1346, Statics.field294, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var167 = var166 + 7;
                arg0.method5186(class252.field3253, Statics.field294 - 110, var167, 16777215, 0);
                short var60 = 200;
                String var67;
                if (Statics.field1117.field1232) {
                    String var61 = field1358;
                    int var62 = var61.length();
                    char[] var63 = new char[var62];
                    for (int var64 = 0; var64 < var62; var64++) {
                        var63[var64] = '*';
                    }
                    String var65 = new String(var63);
                    var67 = var65;
                } else {
                    var67 = field1358;
                }
                String var69;
                for (var69 = var67; arg0.method5129(var69) > var60; var69 = var69.substring(1)) {
                }
                arg0.method5186(class313.method5133(var69) + (field1364 == 0 & client.field913 % 40 < 20 ? class87.method1978(16776960) + class87.field1311 : ""), Statics.field294 - 70, var167, 16777215, 0);
                var164 = var167 + 15;
                String var71 = class252.field3077;
                String var72 = field1359;
                int var73 = var72.length();
                char[] var74 = new char[var73];
                for (int var75 = 0; var75 < var73; var75++) {
                    var74[var75] = '*';
                }
                String var76 = new String(var74);
                arg0.method5186(var71 + var76 + (field1364 == 1 & client.field913 % 40 < 20 ? class87.method1978(16776960) + class87.field1311 : ""), Statics.field294 - 108, var164, 16777215, 0);
                var164 += 15;
                short var78 = 277;
                int var79 = Statics.field294 + -117;
                boolean var80 = field1344;
                boolean var81 = field1355;
                class331 var82 = var80 ? (var81 ? Statics.field812 : Statics.field340) : (var81 ? Statics.field263 : Statics.field34);
                var82.method5443(var79, var78);
                int var84 = var82.field3981 + 5 + var79;
                arg1.method5186(class252.field3261, var84, var78 + 13, 16776960, 0);
                int var85 = Statics.field294 + 24;
                boolean var86 = Statics.field1117.field1232;
                boolean var87 = field1354;
                class331 var88 = var86 ? (var87 ? Statics.field812 : Statics.field340) : (var87 ? Statics.field263 : Statics.field34);
                var88.method5443(var85, var78);
                int var90 = var88.field3981 + 5 + var85;
                arg1.method5186(class252.field3142, var90, var78 + 13, 16776960, 0);
                int var168 = var78 + 15;
                int var91 = Statics.field294 - 80;
                short var92 = 321;
                Statics.field2107.method5443(var91 - 73, var92 - 20);
                arg0.method5137(class252.field3259, var91, var92 + 5, 16777215, 0);
                int var93 = Statics.field294 + 80;
                Statics.field2107.method5443(var93 - 73, var92 - 20);
                arg0.method5137(class252.field3264, var93, var92 + 5, 16777215, 0);
                short var94 = 357;
                arg1.method5137(class252.field3268, Statics.field294, var94, 16776960, 0);
            } else if (field1353 == 3) {
                short var95 = 201;
                arg0.method5137(class252.field3263, field1342 + 180, var95, 16776960, 0);
                int var169 = var95 + 20;
                arg1.method5137(class252.field3092, field1342 + 180, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg1.method5137(class252.field3265, field1342 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                int var96 = field1342 + 180;
                short var97 = 276;
                Statics.field2107.method5443(var96 - 73, var97 - 20);
                arg2.method5137(class252.field3084, var96, var97 + 5, 16777215, 0);
                int var98 = field1342 + 180;
                short var99 = 326;
                Statics.field2107.method5443(var98 - 73, var99 - 20);
                arg2.method5137(class252.field3267, var98, var99 + 5, 16777215, 0);
            } else if (field1353 == 4) {
                arg0.method5137(class252.field3025, field1342 + 180, 201, 16776960, 0);
                short var100 = 236;
                arg0.method5137(field1356, field1342 + 180, var100, 16777215, 0);
                int var172 = var100 + 15;
                arg0.method5137(field1343, field1342 + 180, var172, 16777215, 0);
                int var173 = var172 + 15;
                arg0.method5137(field1346, field1342 + 180, var173, 16777215, 0);
                int var174 = var173 + 15;
                String var102 = class252.field3211;
                String var103 = Statics.field768;
                int var104 = var103.length();
                char[] var105 = new char[var104];
                for (int var106 = 0; var106 < var104; var106++) {
                    var105[var106] = '*';
                }
                String var107 = new String(var105);
                arg0.method5186(var102 + var107 + (client.field913 % 40 < 20 ? class87.method1978(16776960) + class87.field1311 : ""), field1342 + 180 - 108, var174, 16777215, 0);
                var172 = var174 - 8;
                arg0.method5186(class252.field3203, field1342 + 180 - 9, var172, 16776960, 0);
                var172 += 15;
                arg0.method5186(class252.field3020, field1342 + 180 - 9, var172, 16776960, 0);
                int var109 = field1342 + 180 - 9 + arg0.method5129(class252.field3020) + 15;
                int var110 = var172 - arg0.field3910;
                class331 var111;
                if (field1363) {
                    var111 = Statics.field340;
                } else {
                    var111 = Statics.field34;
                }
                var111.method5443(var109, var110);
                var172 += 15;
                int var112 = field1342 + 180 - 80;
                short var113 = 321;
                Statics.field2107.method5443(var112 - 73, var113 - 20);
                arg0.method5137(class252.field3257, var112, var113 + 5, 16777215, 0);
                int var114 = field1342 + 180 + 80;
                Statics.field2107.method5443(var114 - 73, var113 - 20);
                arg0.method5137(class252.field3264, var114, var113 + 5, 16777215, 0);
                arg1.method5137(class252.field3156, field1342 + 180, var113 + 36, 255, 0);
            } else if (field1353 == 5) {
                arg0.method5137(class252.field3269, field1342 + 180, 201, 16776960, 0);
                short var115 = 221;
                arg2.method5137(field1356, field1342 + 180, var115, 16776960, 0);
                int var175 = var115 + 15;
                arg2.method5137(field1343, field1342 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg2.method5137(field1346, field1342 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var178 = var177 + 14;
                arg0.method5186(class252.field3262, field1342 + 180 - 145, var178, 16777215, 0);
                short var116 = 174;
                String var117 = Statics.field1117.field1232 ? class319.method607(field1358) : field1358;
                String var118;
                for (var118 = var117; arg0.method5129(var118) > var116; var118 = var118.substring(1)) {
                }
                arg0.method5186(class313.method5133(var118) + (client.field913 % 40 < 20 ? class87.method1978(16776960) + class87.field1311 : ""), field1342 + 180 - 34, var178, 16777215, 0);
                var175 = var178 + 15;
                int var119 = field1342 + 180 - 80;
                short var120 = 321;
                Statics.field2107.method5443(var119 - 73, var120 - 20);
                arg0.method5137(class252.field3271, var119, var120 + 5, 16777215, 0);
                int var121 = field1342 + 180 + 80;
                Statics.field2107.method5443(var121 - 73, var120 - 20);
                arg0.method5137(class252.field3272, var121, var120 + 5, 16777215, 0);
            } else if (field1353 == 6) {
                short var122 = 201;
                arg0.method5137(field1356, field1342 + 180, var122, 16776960, 0);
                int var179 = var122 + 15;
                arg0.method5137(field1343, field1342 + 180, var179, 16776960, 0);
                int var180 = var179 + 15;
                arg0.method5137(field1346, field1342 + 180, var180, 16776960, 0);
                int var181 = var180 + 15;
                int var123 = field1342 + 180;
                short var124 = 321;
                Statics.field2107.method5443(var123 - 73, var124 - 20);
                arg0.method5137(class252.field3272, var123, var124 + 5, 16777215, 0);
            }
        }
        if (field1371 > 0) {
            method1052(field1371);
            field1371 = 0;
        }
        short var125 = 256;
        if (field1345 > 0) {
            for (int var126 = 0; var126 < 256; var126++) {
                if (field1345 > 768) {
                    Statics.field1339[var126] = method2994(Statics.field502[var126], Statics.field3927[var126], 1024 - field1345);
                } else if (field1345 > 256) {
                    Statics.field1339[var126] = Statics.field3927[var126];
                } else {
                    Statics.field1339[var126] = method2994(Statics.field3927[var126], Statics.field502[var126], 256 - field1345);
                }
            }
        } else if (field1372 > 0) {
            for (int var127 = 0; var127 < 256; var127++) {
                if (field1372 > 768) {
                    Statics.field1339[var127] = method2994(Statics.field502[var127], Statics.field19[var127], 1024 - field1372);
                } else if (field1372 > 256) {
                    Statics.field1339[var127] = Statics.field19[var127];
                } else {
                    Statics.field1339[var127] = method2994(Statics.field19[var127], Statics.field502[var127], 256 - field1372);
                }
            }
        } else {
            for (int var128 = 0; var128 < 256; var128++) {
                Statics.field1339[var128] = Statics.field502[var128];
            }
        }
        class328.method5354(field1337, 9, field1337 + 128, var125 + 7);
        Statics.field1360.method5460(field1337, 0);
        class328.method5353();
        int var129 = 0;
        int var130 = field1337 + Statics.field309.field3967 * 9;
        for (int var131 = 1; var131 < var125 - 1; var131++) {
            int var132 = (var125 - var131) * field1366[var131] / var125;
            int var133 = var132 + 22;
            if (var133 < 0) {
                var133 = 0;
            }
            var129 += var133;
            for (int var134 = var133; var134 < 128; var134++) {
                int var135 = Statics.field790[var129++];
                if (var135 == 0) {
                    var130++;
                } else {
                    int var137 = 256 - var135;
                    int var138 = Statics.field1339[var135];
                    int var139 = Statics.field309.field3969[var130];
                    Statics.field309.field3969[var130++] = ((var138 & 0xFF00FF) * var135 + (var139 & 0xFF00FF) * var137 & 0xFF00FF00) + ((var138 & 0xFF00) * var135 + (var139 & 0xFF00) * var137 & 0xFF0000) >> 8;
                }
            }
            var130 += Statics.field309.field3967 + var133 - 128;
        }
        class328.method5354(field1337 + 765 - 128, 9, field1337 + 765, var125 + 7);
        Statics.field1341.method5460(field1337 + 382, 0);
        class328.method5353();
        int var140 = 0;
        int var141 = field1337 + Statics.field309.field3967 * 9 + 24 + 637;
        for (int var142 = 1; var142 < var125 - 1; var142++) {
            int var143 = (var125 - var142) * field1366[var142] / var125;
            int var144 = 103 - var143;
            int var145 = var141 + var143;
            for (int var146 = 0; var146 < var144; var146++) {
                int var147 = Statics.field790[var140++];
                if (var147 == 0) {
                    var145++;
                } else {
                    int var149 = 256 - var147;
                    int var150 = Statics.field1339[var147];
                    int var151 = Statics.field309.field3969[var145];
                    Statics.field309.field3969[var145++] = ((var150 & 0xFF00) * var147 + (var151 & 0xFF00) * var149 & 0xFF0000) + ((var150 & 0xFF00FF) * var147 + (var151 & 0xFF00FF) * var149 & 0xFF00FF00) >> 8;
                }
            }
            var140 += 128 - var144;
            var141 = Statics.field309.field3967 - var144 - var143 + var145;
        }
        Statics.field1299[Statics.field1117.field1227 ? 1 : 0].method5443(field1337 + 765 - 40, 463);
        if (client.field1111 <= 5 || client.field1020 != 0) {
            return;
        }
        if (Statics.field2108 == null) {
            Statics.field2108 = class333.method1033(Statics.field313, "sl_button", "");
            return;
        }
        int var152 = field1337 + 5;
        short var153 = 463;
        byte var154 = 100;
        byte var155 = 35;
        Statics.field2108.method5443(var152, var153);
        arg0.method5137(class252.field3276 + " " + client.field994, var154 / 2 + var152, var155 / 2 + var153 - 2, 16777215, 0);
        if (Statics.field370 == null) {
            arg1.method5137(class252.field3304, var154 / 2 + var152, var155 / 2 + var153 + 12, 16777215, 0);
        } else {
            arg1.method5137(class252.field3303, var154 / 2 + var152, var155 / 2 + var153 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ja.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method4439(String arg0, String arg1, String arg2) {
        field1356 = arg0;
        field1343 = arg1;
        field1346 = arg2;
    }

    @ObfuscatedName("cf.c(Llh;I)V")
    public static final void method1810(class331 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2605.length; var2++) {
            Statics.field2605[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2605[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field460[var8] = (Statics.field2605[var8 - 1] + Statics.field2605[var8 + 1] + Statics.field2605[var8 - 128] + Statics.field2605[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2605;
            Statics.field2605 = Statics.field460;
            Statics.field460 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3983; var11++) {
            for (int var12 = 0; var12 < arg0.field3981; var12++) {
                if (arg0.field3980[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3982;
                    int var14 = var11 + 16 + arg0.field3985;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2605[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bc.o(II)V")
    public static final void method1052(int arg0) {
        short var1 = 256;
        field1361 += arg0 * 128;
        if (field1361 > Statics.field2605.length) {
            field1361 -= Statics.field2605.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1810(Statics.field1340[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field790[var3 + var4] - Statics.field2605[field1361 + var3 & Statics.field2605.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field790[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field790[var9 + var10] = 255;
                } else {
                    Statics.field790[var9 + var10] = 0;
                }
            }
        }
        if (field1345 > 0) {
            field1345 -= arg0 * 4;
        }
        if (field1372 > 0) {
            field1372 -= arg0 * 4;
        }
        if (field1345 == 0 && field1372 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1345 = 1024;
            }
            if (var12 == 1) {
                field1372 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1366[var13] = field1366[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1366[var14] = (int) (Math.sin((double) field1350 / 14.0D) * 16.0D + Math.sin((double) field1350 / 15.0D) * 14.0D + Math.sin((double) field1350 / 16.0D) * 12.0D);
            field1350++;
        }
        field1348 += arg0 * 1070677439;
        int var15 = ((client.field913 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1348 * -1042702180; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field790[(var18 << 7) + var17] = 192;
        }
        field1348 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field790[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field790[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field560[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field560[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field560[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field790[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("em.d(IIIB)I")
    public static final int method2994(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ab.r(Lbx;B)V")
    public static void method523(class78 arg0) {
        if (arg0.method1608() != client.field856) {
            client.field856 = arg0.method1608();
            boolean var1 = arg0.method1608();
            if (Statics.field3646 != var1) {
                class284.field3650.method3709();
                class284.field3670.method3709();
                class284.field3652.method3709();
                Statics.field3646 = var1;
            }
        }
        Statics.field2498 = arg0.field1221;
        client.field994 = arg0.field1215;
        client.field854 = arg0.field1208;
        Statics.field319 = client.field855 == 0 ? 43594 : arg0.field1215 + 40000;
        Statics.field324 = client.field855 == 0 ? 443 : arg0.field1215 + 50000;
        Statics.field579 = Statics.field319;
    }

    @ObfuscatedName("gg.p(B)V")
    public static void method3314() {
        if (class78.method1068()) {
            field1367 = true;
        }
    }
}
