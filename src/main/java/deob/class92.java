package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cq")
public class class92 {

    @ObfuscatedName("cq.x")
    public static int field1355 = 0;

    @ObfuscatedName("cq.s")
    public static int field1368 = field1355 + 202;

    @ObfuscatedName("cq.h")
    public static int[] field1350 = new int[256];

    @ObfuscatedName("cq.a")
    public static int field1352 = 0;

    @ObfuscatedName("cq.ah")
    public static int field1353 = 0;

    @ObfuscatedName("cq.au")
    public static int field1354 = 0;

    @ObfuscatedName("cq.al")
    public static int field1344 = 0;

    @ObfuscatedName("cq.ae")
    public static int field1369 = 0;

    @ObfuscatedName("cq.aj")
    public static int field1371 = 0;

    @ObfuscatedName("cq.as")
    public static int field1356 = 10;

    @ObfuscatedName("cq.am")
    public static String field1359 = "";

    @ObfuscatedName("cq.ag")
    public static int field1360 = 0;

    @ObfuscatedName("cq.aw")
    public static String field1358 = "";

    @ObfuscatedName("cq.ap")
    public static String field1346 = "";

    @ObfuscatedName("cq.ad")
    public static String field1363 = "";

    @ObfuscatedName("cq.an")
    public static String field1364 = "";

    @ObfuscatedName("cq.ai")
    public static String field1362 = "";

    @ObfuscatedName("cq.ay")
    public static String field1366 = "";

    @ObfuscatedName("cq.ar")
    public static boolean field1367 = false;

    @ObfuscatedName("cq.at")
    public static boolean field1365 = false;

    @ObfuscatedName("cq.bj")
    public static boolean field1361 = false;

    @ObfuscatedName("cq.bk")
    public static boolean field1370 = true;

    @ObfuscatedName("cq.bv")
    public static int field1340 = 0;

    @ObfuscatedName("cq.ba")
    public static String field1372 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cq.bs")
    public static String field1373 = "1234567890";

    @ObfuscatedName("cq.bn")
    public static boolean field1374 = false;

    @ObfuscatedName("cq.bf")
    public static int field1375 = -1;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.d(Lid;Lid;B)I")
    public static int method229(class243 arg0, class243 arg1) {
        int var2 = 0;
        if (arg0.method3955("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3955("logo", "")) {
            var2++;
        }
        if (arg1.method3955("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3955("titlebox", "")) {
            var2++;
        }
        if (arg1.method3955("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3955("runes", "")) {
            var2++;
        }
        if (arg1.method3955("title_mute", "")) {
            var2++;
        }
        if (arg1.method3955("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3955("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3955("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3955("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3955("sl_back", "");
        arg1.method3955("sl_flags", "");
        arg1.method3955("sl_arrows", "");
        arg1.method3955("sl_stars", "");
        arg1.method3955("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bn.x(I)I")
    public static int method956() {
        return 11;
    }

    @ObfuscatedName("ak.k(Lid;Lid;ZII)V")
    public static void method205(class243 arg0, class243 arg1, boolean arg2, int arg3) {
        if (!Statics.field1343) {
            field1360 = arg3;
            class291.method4787();
            byte[] var4 = arg0.method3954("title.jpg", "");
            Statics.field2512 = class55.method2263(var4);
            Statics.field1348 = Statics.field2512.method4892();
            if ((client.field874 & 0x20000000) == 0) {
                Statics.field1345 = class296.method1099(arg1, "logo", "");
            } else {
                Statics.field1345 = class296.method1099(arg1, "logo_deadman_mode", "");
            }
            Statics.field1342 = class296.method1099(arg1, "titlebox", "");
            Statics.field1341 = class296.method1099(arg1, "titlebutton", "");
            Statics.field3721 = class296.method3585(arg1, "runes", "");
            Statics.field1357 = class296.method3585(arg1, "title_mute", "");
            Statics.field3695 = class296.method1099(arg1, "options_radio_buttons,0", "");
            Statics.field270 = class296.method1099(arg1, "options_radio_buttons,4", "");
            Statics.field2099 = class296.method1099(arg1, "options_radio_buttons,2", "");
            Statics.field447 = class296.method1099(arg1, "options_radio_buttons,6", "");
            Statics.field738 = Statics.field3695.field3827;
            Statics.field393 = Statics.field3695.field3831;
            Statics.field812 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field812[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field812[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field812[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field812[var8 + 192] = 16777215;
            }
            Statics.field3852 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field3852[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3852[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3852[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3852[var12 + 192] = 16777215;
            }
            Statics.field1351 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1351[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1351[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1351[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1351[var16 + 192] = 16777215;
            }
            Statics.field460 = new int[256];
            Statics.field3221 = new int[32768];
            Statics.field3262 = new int[32768];
            method1618((class294) null);
            Statics.field1275 = new int[32768];
            Statics.field1276 = new int[32768];
            if (arg2) {
                field1362 = "";
                field1366 = "";
            }
            Statics.field391 = 0;
            Statics.field394 = "";
            field1370 = true;
            field1374 = false;
            if (Statics.field632.field1237) {
                class211.method7(2);
            } else {
                class211.method2890(2, Statics.field631, "scape main", "", 255, false);
            }
            class246.method2850(false);
            Statics.field1343 = true;
            field1355 = (Statics.field1308 - 765) / 2;
            field1368 = field1355 + 202;
            Statics.field1349 = field1368 + 180;
            Statics.field2512.method4901(field1355, 0);
            Statics.field1348.method4901(field1355 + 382, 0);
            Statics.field1345.method4880(field1355 + 382 - Statics.field1345.field3827 / 2, 18);
        } else if (arg3 == 4) {
            field1360 = 4;
        }
    }

    @ObfuscatedName("hx.z(B)V")
    public static void method3859() {
        if (field1362 != null && field1362.length() > 0) {
            return;
        }
        if (Statics.field632.field1235 == null) {
            field1367 = false;
        } else {
            field1362 = Statics.field632.field1235;
            field1367 = true;
        }
    }

    @ObfuscatedName("bd.v(I)V")
    public static void method1051() {
        if (field1367 && field1362 != null && field1362.length() > 0) {
            field1340 = 1;
        } else {
            field1340 = 0;
        }
    }

    @ObfuscatedName("o.m(Lbs;I)V")
    public static void method164(class59 arg0) {
        if (field1374) {
            method2(arg0);
            return;
        }
        if ((class60.field709 == 1 || !Statics.field957 && class60.field709 == 4) && class60.field710 >= field1355 + 765 - 50 && class60.field711 >= 453) {
            Statics.field632.field1237 = !Statics.field632.field1237;
            class81.method1010();
            if (Statics.field632.field1237) {
                class211.method1033();
            } else {
                class211.method684(Statics.field631, "scape main", "", 255, false);
            }
        }
        if (client.field879 == 5) {
            return;
        }
        field1369++;
        if (client.field879 != 10 && client.field879 != 11) {
            return;
        }
        if (client.field878 == 0) {
            if (class60.field709 == 1 || !Statics.field957 && class60.field709 == 4) {
                int var1 = field1355 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class60.field710 >= var1 && class60.field710 <= var1 + var3 && class60.field711 >= var2 && class60.field711 <= var2 + var4) {
                    if (class80.method610()) {
                        field1374 = true;
                    }
                    return;
                }
            }
            if (Statics.field747 != null && class80.method610()) {
                field1374 = true;
            }
        }
        int var5 = class60.field709;
        int var6 = class60.field710;
        int var7 = class60.field711;
        if (var5 == 0) {
            var6 = class60.field704;
            var7 = class60.field716 * 10625923;
        }
        if (!Statics.field957 && var5 == 4) {
            var5 = 1;
        }
        if (field1360 == 0) {
            boolean var8 = false;
            while (class51.method1030()) {
                if (Statics.field474 == 84) {
                    var8 = true;
                }
            }
            int var9 = Statics.field1349 - 80;
            short var10 = 291;
            if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                class57.method1039(client.method997("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var11 = Statics.field1349 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20 || var8) {
                if ((client.field874 & 0x2000000) != 0) {
                    field1358 = "";
                    field1346 = class233.field3132;
                    field1363 = class233.field3156;
                    field1364 = class233.field3157;
                    field1360 = 1;
                    method1051();
                } else if ((client.field874 & 0x4) != 0) {
                    if ((client.field874 & 0x400) == 0) {
                        field1346 = class233.field3146;
                        field1363 = class233.field3147;
                        field1364 = class233.field3148;
                    } else {
                        field1346 = class233.field3152;
                        field1363 = class233.field2933;
                        field1364 = class233.field2938;
                    }
                    field1358 = class233.field2956;
                    field1360 = 1;
                    method1051();
                } else if ((client.field874 & 0x400) == 0) {
                    Statics.method4473(false);
                } else {
                    field1346 = class233.field3149;
                    field1363 = class233.field2983;
                    field1364 = class233.field3151;
                    field1358 = class233.field2956;
                    field1360 = 1;
                    method1051();
                }
            }
        } else if (field1360 == 1) {
            while (class51.method1030()) {
                if (Statics.field474 == 84) {
                    Statics.method4473(false);
                } else if (Statics.field474 == 13) {
                    field1360 = 0;
                }
            }
            int var12 = Statics.field1349 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                Statics.method4473(false);
            }
            int var14 = Statics.field1349 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field1360 = 0;
            }
        } else if (field1360 == 2) {
            short var15 = 201;
            int var41 = var15 + 52;
            if (var5 == 1 && var7 >= var41 - 12 && var7 < var41 + 2) {
                field1340 = 0;
            }
            var41 += 15;
            if (var5 == 1 && var7 >= var41 - 12 && var7 < var41 + 2) {
                field1340 = 1;
            }
            var41 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method1614(class233.field3183, class233.field3184, class233.field3185);
                field1360 = 5;
                return;
            }
            int var17 = Statics.field1349 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field1362 = field1362.trim();
                if (field1362.length() == 0) {
                    method1614(class233.field2969, class233.field3049, class233.field3050);
                    return;
                }
                if (field1366.length() == 0) {
                    method1614(class233.field2986, class233.field2932, class233.field3053);
                    return;
                }
                method1614(class233.field3155, class233.field3161, class233.field3162);
                client.method25(false);
                client.method62(20);
                return;
            }
            int var19 = field1368 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field1360 = 0;
                field1362 = "";
                field1366 = "";
                Statics.field391 = 0;
                Statics.field394 = "";
                field1370 = true;
            }
            int var20 = Statics.field1349 + -117;
            short var21 = 277;
            field1365 = var6 >= var20 && var6 < Statics.field738 + var20 && var7 >= var21 && var7 < Statics.field393 + var21;
            if (var5 == 1 && field1365) {
                field1367 = !field1367;
                if (!field1367 && Statics.field632.field1235 != null) {
                    Statics.field632.field1235 = null;
                    class81.method1010();
                }
            }
            int var22 = Statics.field1349 + 24;
            short var23 = 277;
            field1361 = var6 >= var22 && var6 < Statics.field738 + var22 && var7 >= var23 && var7 < Statics.field393 + var23;
            if (var5 == 1 && field1361) {
                Statics.field632.field1238 = !Statics.field632.field1238;
                if (!Statics.field632.field1238) {
                    field1362 = "";
                    Statics.field632.field1235 = null;
                    method1051();
                }
                class81.method1010();
            }
            while (true) {
                while (class51.method1030()) {
                    boolean var24 = false;
                    for (int var25 = 0; var25 < field1372.length(); var25++) {
                        if (Statics.field321 == field1372.charAt(var25)) {
                            var24 = true;
                            break;
                        }
                    }
                    if (Statics.field474 == 13) {
                        field1360 = 0;
                        field1362 = "";
                        field1366 = "";
                        Statics.field391 = 0;
                        Statics.field394 = "";
                        field1370 = true;
                    } else if (field1340 == 0) {
                        if (Statics.field474 == 85 && field1362.length() > 0) {
                            field1362 = field1362.substring(0, field1362.length() - 1);
                        }
                        if (Statics.field474 == 84 || Statics.field474 == 80) {
                            field1340 = 1;
                        }
                        if (var24 && field1362.length() < 320) {
                            field1362 = field1362 + Statics.field321;
                        }
                    } else if (field1340 == 1) {
                        if (Statics.field474 == 85 && field1366.length() > 0) {
                            field1366 = field1366.substring(0, field1366.length() - 1);
                        }
                        if (Statics.field474 == 84 || Statics.field474 == 80) {
                            field1340 = 0;
                        }
                        if (Statics.field474 == 84) {
                            field1362 = field1362.trim();
                            if (field1362.length() == 0) {
                                method1614(class233.field2969, class233.field3049, class233.field3050);
                                return;
                            }
                            if (field1366.length() == 0) {
                                method1614(class233.field2986, class233.field2932, class233.field3053);
                                return;
                            }
                            method1614(class233.field3155, class233.field3161, class233.field3162);
                            client.method25(false);
                            client.method62(20);
                            return;
                        }
                        if (var24 && field1366.length() < 20) {
                            field1366 = field1366 + Statics.field321;
                        }
                    }
                }
                return;
            }
        } else if (field1360 == 3) {
            int var26 = field1368 + 180;
            short var27 = 276;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                Statics.method4473(false);
            }
            int var28 = field1368 + 180;
            short var29 = 326;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var29 - 20 && var7 <= var29 + 20) {
                method1614(class233.field3183, class233.field3184, class233.field3185);
                field1360 = 5;
                return;
            }
        } else if (field1360 == 4) {
            int var30 = field1368 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                Statics.field394.trim();
                if (Statics.field394.length() != 6) {
                    method1614(class233.field2967, class233.field3027, class233.field3110);
                    return;
                }
                Statics.field391 = Integer.parseInt(Statics.field394);
                Statics.field394 = "";
                client.method25(true);
                method1614(class233.field3155, class233.field3161, class233.field3162);
                client.method62(20);
                return;
            }
            if (var5 == 1 && var6 >= field1368 + 180 - 9 && var6 <= field1368 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field1370 = !field1370;
            }
            if (var5 == 1 && var6 >= field1368 + 180 - 34 && var6 <= field1368 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class57.method1039(client.method997("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var32 = field1368 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field1360 = 0;
                field1362 = "";
                field1366 = "";
                Statics.field391 = 0;
                Statics.field394 = "";
            }
            while (class51.method1030()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field1373.length(); var34++) {
                    if (Statics.field321 == field1373.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field474 == 13) {
                    field1360 = 0;
                    field1362 = "";
                    field1366 = "";
                    Statics.field391 = 0;
                    Statics.field394 = "";
                } else {
                    if (Statics.field474 == 85 && Statics.field394.length() > 0) {
                        Statics.field394 = Statics.field394.substring(0, Statics.field394.length() - 1);
                    }
                    if (Statics.field474 == 84) {
                        Statics.field394.trim();
                        if (Statics.field394.length() != 6) {
                            method1614(class233.field2967, class233.field3027, class233.field3110);
                            return;
                        }
                        Statics.field391 = Integer.parseInt(Statics.field394);
                        Statics.field394 = "";
                        client.method25(true);
                        method1614(class233.field3155, class233.field3161, class233.field3162);
                        client.method62(20);
                        return;
                    }
                    if (var33 && Statics.field394.length() < 6) {
                        Statics.field394 = Statics.field394 + Statics.field321;
                    }
                }
            }
        } else if (field1360 == 5) {
            int var35 = field1368 + 180 - 80;
            short var36 = 321;
            if (var5 == 1 && var6 >= var35 - 75 && var6 <= var35 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                method179();
                return;
            }
            int var37 = field1368 + 180 + 80;
            if (var5 == 1 && var6 >= var37 - 75 && var6 <= var37 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                Statics.method4473(true);
            }
            while (class51.method1030()) {
                boolean var38 = false;
                for (int var39 = 0; var39 < field1372.length(); var39++) {
                    if (Statics.field321 == field1372.charAt(var39)) {
                        var38 = true;
                        break;
                    }
                }
                if (Statics.field474 == 13) {
                    Statics.method4473(true);
                } else {
                    if (Statics.field474 == 85 && field1362.length() > 0) {
                        field1362 = field1362.substring(0, field1362.length() - 1);
                    }
                    if (Statics.field474 == 84) {
                        method179();
                        return;
                    }
                    if (var38 && field1362.length() < 320) {
                        field1362 = field1362 + Statics.field321;
                    }
                }
            }
        } else if (field1360 == 6) {
            while (true) {
                do {
                    if (!class51.method1030()) {
                        short var40 = 321;
                        if (var5 == 1 && var7 >= var40 - 20 && var7 <= var40 + 20) {
                            Statics.method4473(true);
                        }
                        return;
                    }
                } while (Statics.field474 != 84 && Statics.field474 != 13);
                Statics.method4473(true);
            }
        }
    }

    @ObfuscatedName("a.t(I)V")
    public static void method179() {
        field1362 = field1362.trim();
        if (field1362.length() == 0) {
            method1614(class233.field3183, class233.field3184, class233.field3185);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method997("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class181 var4 = new class181(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2496, var4.field2498, 1000 - var4.field2498);
                if (var5 == -1) {
                    var4.field2498 = 0;
                    long var8 = var4.method3134();
                    var6 = var8;
                    break;
                }
                var4.field2498 += var5;
                if (var4.field2498 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var40) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1362;
            Random var15 = new Random();
            class181 var16 = new class181(128);
            class181 var17 = new class181(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method3020(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method3149(var15.nextInt());
            }
            var16.method3149(var18[0]);
            var16.method3149(var18[1]);
            var16.method3025(var6);
            var16.method3025(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method3149(var15.nextInt());
            }
            var16.method3203(class87.field1299, class87.field1302);
            var17.method3020(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method3149(var15.nextInt());
            }
            var17.method3025(var15.nextLong());
            var17.method3024(var15.nextLong());
            client.method1637(var17);
            var17.method3025(var15.nextLong());
            var17.method3203(class87.field1299, class87.field1302);
            int var22 = class181.method1954(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class181 var23 = new class181(var22);
            var23.method3027(var14);
            var23.field2498 = var22;
            var23.method3054(var18);
            class181 var24 = new class181(var23.field2498 + var17.field2498 + var16.field2498 + 5);
            var24.method3020(2);
            var24.method3020(var16.field2498);
            var24.method3198(var16.field2496, 0, var16.field2498);
            var24.method3020(var17.field2498);
            var24.method3198(var17.field2496, 0, var17.field2498);
            var24.method3021(var23.field2498);
            var24.method3198(var23.field2496, 0, var23.field2498);
            String var25 = class277.method4694(var24.field2496);
            byte var32;
            try {
                URL var26 = new URL(client.method997("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class303.method1770(var25) + "&dest=" + class303.method1770("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class181 var30 = new class181(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2496, var30.field2498, 1000 - var30.field2498);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2496);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method3055(var18);
                            while (var30.field2498 > 0 && var30.field2496[var30.field2498 - 1] == 0) {
                                var30.field2498--;
                            }
                            String var34 = new String(var30.field2496, 0, var30.field2498);
                            boolean var35;
                            if (var34 == null) {
                                var35 = false;
                            } else {
                                label100: {
                                    try {
                                        new URL(var34);
                                    } catch (MalformedURLException var38) {
                                        var35 = false;
                                        break label100;
                                    }
                                    var35 = true;
                                }
                            }
                            if (var35) {
                                class57.method1039(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2498 += var31;
                    if (var30.field2498 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var39) {
                var39.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method1614(class233.field3186, class233.field3187, class233.field3188);
                field1360 = 6;
                break;
            case 3:
                method1614(class233.field3189, class233.field3190, class233.field3191);
                break;
            case 4:
                method1614(class233.field3192, class233.field3193, class233.field3086);
                break;
            case 5:
                method1614(class233.field3046, class233.field3196, class233.field3197);
                break;
            case 6:
                method1614(class233.field3198, class233.field3199, class233.field3200);
                break;
            case 7:
                method1614(class233.field3201, class233.field3048, class233.field3203);
        }
    }

    @ObfuscatedName("dd.p(Ljp;Ljp;Ljp;ZB)V")
    public static void method2384(class271 arg0, class271 arg1, class271 arg2, boolean arg3) {
        if (arg3) {
            field1355 = (Statics.field1308 - 765) / 2;
            field1368 = field1355 + 202;
            Statics.field1349 = field1368 + 180;
        }
        if (field1374) {
            if (Statics.field571 == null) {
                Statics.field571 = class296.method636(Statics.field1323, "sl_back", "");
            }
            if (Statics.field424 == null) {
                Statics.field424 = class296.method3585(Statics.field1323, "sl_flags", "");
            }
            if (Statics.field249 == null) {
                Statics.field249 = class296.method3585(Statics.field1323, "sl_arrows", "");
            }
            if (Statics.field488 == null) {
                Statics.field488 = class296.method3585(Statics.field1323, "sl_stars", "");
            }
            class291.method4819(field1355, 23, 765, 480, 0);
            class291.method4795(field1355, 0, 125, 23, 12425273, 9135624);
            class291.method4795(field1355 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4608(class233.field3204, field1355 + 62, 15, 0, -1);
            if (Statics.field488 != null) {
                Statics.field488[1].method4880(field1355 + 140, 1);
                arg1.method4584(class233.field3205, field1355 + 152, 10, 16777215, -1);
                Statics.field488[0].method4880(field1355 + 140, 12);
                arg1.method4584(class233.field3206, field1355 + 152, 21, 16777215, -1);
            }
            if (Statics.field249 != null) {
                int var4 = field1355 + 280;
                if (class80.field1221[0] == 0 && class80.field1220[0] == 0) {
                    Statics.field249[2].method4880(var4, 4);
                } else {
                    Statics.field249[0].method4880(var4, 4);
                }
                if (class80.field1221[0] == 0 && class80.field1220[0] == 1) {
                    Statics.field249[3].method4880(var4 + 15, 4);
                } else {
                    Statics.field249[1].method4880(var4 + 15, 4);
                }
                arg0.method4584(class233.field3173, var4 + 32, 17, 16777215, -1);
                int var5 = field1355 + 390;
                if (class80.field1221[0] == 1 && class80.field1220[0] == 0) {
                    Statics.field249[2].method4880(var5, 4);
                } else {
                    Statics.field249[0].method4880(var5, 4);
                }
                if (class80.field1221[0] == 1 && class80.field1220[0] == 1) {
                    Statics.field249[3].method4880(var5 + 15, 4);
                } else {
                    Statics.field249[1].method4880(var5 + 15, 4);
                }
                arg0.method4584(class233.field3208, var5 + 32, 17, 16777215, -1);
                int var6 = field1355 + 500;
                if (class80.field1221[0] == 2 && class80.field1220[0] == 0) {
                    Statics.field249[2].method4880(var6, 4);
                } else {
                    Statics.field249[0].method4880(var6, 4);
                }
                if (class80.field1221[0] == 2 && class80.field1220[0] == 1) {
                    Statics.field249[3].method4880(var6 + 15, 4);
                } else {
                    Statics.field249[1].method4880(var6 + 15, 4);
                }
                arg0.method4584(class233.field3209, var6 + 32, 17, 16777215, -1);
                int var7 = field1355 + 610;
                if (class80.field1221[0] == 3 && class80.field1220[0] == 0) {
                    Statics.field249[2].method4880(var7, 4);
                } else {
                    Statics.field249[0].method4880(var7, 4);
                }
                if (class80.field1221[0] == 3 && class80.field1220[0] == 1) {
                    Statics.field249[3].method4880(var7 + 15, 4);
                } else {
                    Statics.field249[1].method4880(var7 + 15, 4);
                }
                arg0.method4584(class233.field2940, var7 + 32, 17, 16777215, -1);
            }
            class291.method4819(field1355 + 708, 4, 50, 16, 0);
            arg1.method4608(class233.field3170, field1355 + 708 + 25, 16, 16777215, -1);
            field1375 = -1;
            if (Statics.field571 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class80.field1219) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1219) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1219) {
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
                int var19 = field1355 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class80.field1219; var22++) {
                    class80 var23 = Statics.field1230[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1224);
                    if (var23.field1224 == -1) {
                        var25 = class233.field3211;
                        var24 = false;
                    } else if (var23.field1224 > 1980) {
                        var25 = class233.field3212;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1474()) {
                        if (var23.method1499()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1473()) {
                        var26 = 16711680;
                        if (var23.method1499()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1502()) {
                        if (var23.method1499()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1499()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field704 >= var19 && class60.field716 * 10625923 >= var18 && class60.field704 < var8 + var19 && class60.field716 * 10625923 < var9 + var18 && var24) {
                        field1375 = var22;
                        Statics.field571[var27].method4900(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field571[var27].method4901(var19, var18);
                    }
                    if (Statics.field424 != null) {
                        Statics.field424[(var23.method1499() ? 8 : 0) + var23.field1217].method4880(var19 + 29, var18);
                    }
                    arg0.method4608(Integer.toString(var23.field1222), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4608(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4578(Statics.field1230[field1375].field1226) + 6;
                    int var29 = arg1.field3719 + 8;
                    class291.method4819(class60.field704 - var28 / 2, class60.field716 * 10625923 + 20 + 5, var28, var29, 16777120);
                    class291.method4797(class60.field704 - var28 / 2, class60.field716 * 10625923 + 20 + 5, var28, var29, 0);
                    arg1.method4608(Statics.field1230[field1375].field1226, class60.field704, class60.field716 * 10625923 + 20 + 5 + arg1.field3719 + 4, 0, -1);
                }
            }
            Statics.field1310.method756(0, 0);
            return;
        }
        if (arg3) {
            Statics.field2512.method4901(field1355, 0);
            Statics.field1348.method4901(field1355 + 382, 0);
            Statics.field1345.method4880(field1355 + 382 - Statics.field1345.field3827 / 2, 18);
        }
        if (client.field879 == 0 || client.field879 == 5) {
            byte var30 = 20;
            arg0.method4608(class233.field3105, field1368 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class291.method4797(field1368 + 180 - 152, var31, 304, 34, 9179409);
            class291.method4797(field1368 + 180 - 151, var31 + 1, 302, 32, 0);
            class291.method4819(field1368 + 180 - 150, var31 + 2, field1356 * 3, 30, 9179409);
            class291.method4819(field1356 * 3 + (field1368 + 180 - 150), var31 + 2, 300 - field1356 * 3, 30, 0);
            arg0.method4608(field1359, field1368 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field879 == 20) {
            Statics.field1342.method4880(field1368 + 180 - Statics.field1342.field3827 / 2, 271 - Statics.field1342.field3831 / 2);
            short var32 = 201;
            arg0.method4608(field1346, field1368 + 180, var32, 16776960, 0);
            int var112 = var32 + 15;
            arg0.method4608(field1363, field1368 + 180, var112, 16776960, 0);
            int var113 = var112 + 15;
            arg0.method4608(field1364, field1368 + 180, var113, 16776960, 0);
            int var114 = var113 + 15;
            int var115 = var114 + 7;
            if (field1360 != 4) {
                arg0.method4584(class233.field3163, field1368 + 180 - 110, var115, 16777215, 0);
                short var33 = 200;
                String var36;
                if (Statics.field632.field1238) {
                    String var34 = field1362;
                    String var35 = Statics.method4729('*', var34.length());
                    var36 = var35;
                } else {
                    var36 = field1362;
                }
                String var38;
                for (var38 = var36; arg0.method4578(var38) > var33; var38 = var38.substring(0, var38.length() - 1)) {
                }
                arg0.method4584(class272.method4638(var38), field1368 + 180 - 70, var115, 16777215, 0);
                var112 = var115 + 15;
                String var40 = class233.field2960;
                String var41 = field1366;
                String var42 = Statics.method4729('*', var41.length());
                arg0.method4584(var40 + var42, field1368 + 180 - 108, var112, 16777215, 0);
                var112 += 15;
            }
        }
        if (client.field879 == 10 || client.field879 == 11) {
            Statics.field1342.method4880(field1368, 171);
            if (field1360 == 0) {
                short var43 = 251;
                arg0.method4608(class233.field3166, field1368 + 180, var43, 16776960, 0);
                int var116 = var43 + 30;
                int var44 = field1368 + 180 - 80;
                short var45 = 291;
                Statics.field1341.method4880(var44 - 73, var45 - 20);
                arg0.method4588(class233.field3167, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field1368 + 180 + 80;
                Statics.field1341.method4880(var46 - 73, var45 - 20);
                arg0.method4588(class233.field3168, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1360 == 1) {
                arg0.method4608(field1358, field1368 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method4608(field1346, field1368 + 180, var47, 16777215, 0);
                int var117 = var47 + 15;
                arg0.method4608(field1363, field1368 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method4608(field1364, field1368 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                int var48 = field1368 + 180 - 80;
                short var49 = 321;
                Statics.field1341.method4880(var48 - 73, var49 - 20);
                arg0.method4608(class233.field3022, var48, var49 + 5, 16777215, 0);
                int var50 = field1368 + 180 + 80;
                Statics.field1341.method4880(var50 - 73, var49 - 20);
                arg0.method4608(class233.field3170, var50, var49 + 5, 16777215, 0);
            } else if (field1360 == 2) {
                short var51 = 201;
                arg0.method4608(field1346, Statics.field1349, var51, 16776960, 0);
                int var120 = var51 + 15;
                arg0.method4608(field1363, Statics.field1349, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg0.method4608(field1364, Statics.field1349, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var123 = var122 + 7;
                arg0.method4584(class233.field3163, Statics.field1349 - 110, var123, 16777215, 0);
                short var52 = 200;
                String var55;
                if (Statics.field632.field1238) {
                    String var53 = field1362;
                    String var54 = Statics.method4729('*', var53.length());
                    var55 = var54;
                } else {
                    var55 = field1362;
                }
                String var57;
                for (var57 = var55; arg0.method4578(var57) > var52; var57 = var57.substring(1)) {
                }
                arg0.method4584(class272.method4638(var57) + (field1340 == 0 & client.field881 % 40 < 20 ? class88.method3336(16776960) + class88.field1316 : ""), Statics.field1349 - 70, var123, 16777215, 0);
                var120 = var123 + 15;
                String var59 = class233.field2960;
                String var60 = field1366;
                String var61 = Statics.method4729('*', var60.length());
                arg0.method4584(var59 + var61 + (field1340 == 1 & client.field881 % 40 < 20 ? class88.method3336(16776960) + class88.field1316 : ""), Statics.field1349 - 108, var120, 16777215, 0);
                var120 += 15;
                short var62 = 277;
                int var63 = Statics.field1349 + -117;
                boolean var64 = field1367;
                boolean var65 = field1365;
                class294 var66 = var64 ? (var65 ? Statics.field447 : Statics.field2099) : (var65 ? Statics.field270 : Statics.field3695);
                var66.method4880(var63, var62);
                int var68 = var66.field3827 + 5 + var63;
                arg1.method4584(class233.field3195, var68, var62 + 13, 16776960, 0);
                int var69 = Statics.field1349 + 24;
                boolean var70 = Statics.field632.field1238;
                boolean var71 = field1361;
                class294 var72 = var70 ? (var71 ? Statics.field447 : Statics.field2099) : (var71 ? Statics.field270 : Statics.field3695);
                var72.method4880(var69, var62);
                int var74 = var72.field3827 + 5 + var69;
                arg1.method4584(class233.field3019, var74, var62 + 13, 16776960, 0);
                int var124 = var62 + 15;
                int var75 = Statics.field1349 - 80;
                short var76 = 321;
                Statics.field1341.method4880(var75 - 73, var76 - 20);
                arg0.method4608(class233.field3169, var75, var76 + 5, 16777215, 0);
                int var77 = Statics.field1349 + 80;
                Statics.field1341.method4880(var77 - 73, var76 - 20);
                arg0.method4608(class233.field3170, var77, var76 + 5, 16777215, 0);
                short var78 = 357;
                arg1.method4608(class233.field3178, Statics.field1349, var78, 16776960, 0);
            } else if (field1360 == 3) {
                short var79 = 201;
                arg0.method4608(class233.field3008, field1368 + 180, var79, 16776960, 0);
                int var125 = var79 + 20;
                arg1.method4608(class233.field3174, field1368 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg1.method4608(class233.field3175, field1368 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var80 = field1368 + 180;
                short var81 = 276;
                Statics.field1341.method4880(var80 - 73, var81 - 20);
                arg2.method4608(class233.field3176, var80, var81 + 5, 16777215, 0);
                int var82 = field1368 + 180;
                short var83 = 326;
                Statics.field1341.method4880(var82 - 73, var83 - 20);
                arg2.method4608(class233.field3177, var82, var83 + 5, 16777215, 0);
            } else if (field1360 == 4) {
                arg0.method4608(class233.field3158, field1368 + 180, 201, 16776960, 0);
                short var84 = 236;
                arg0.method4608(field1346, field1368 + 180, var84, 16777215, 0);
                int var128 = var84 + 15;
                arg0.method4608(field1363, field1368 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                arg0.method4608(field1364, field1368 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                String var86 = class233.field3165;
                String var87 = Statics.field394;
                String var88 = Statics.method4729('*', var87.length());
                arg0.method4584(var86 + var88 + (client.field881 % 40 < 20 ? class88.method3336(16776960) + class88.field1316 : ""), field1368 + 180 - 108, var130, 16777215, 0);
                int var131 = var130 - 8;
                arg0.method4584(class233.field2939, field1368 + 180 - 9, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg0.method4584(class233.field2961, field1368 + 180 - 9, var132, 16776960, 0);
                int var89 = field1368 + 180 - 9 + arg0.method4578(class233.field2961) + 15;
                int var90 = var132 - arg0.field3719;
                class294 var91;
                if (field1370) {
                    var91 = Statics.field2099;
                } else {
                    var91 = Statics.field3695;
                }
                var91.method4880(var89, var90);
                var128 = var132 + 15;
                int var92 = field1368 + 180 - 80;
                short var93 = 321;
                Statics.field1341.method4880(var92 - 73, var93 - 20);
                arg0.method4608(class233.field3022, var92, var93 + 5, 16777215, 0);
                int var94 = field1368 + 180 + 80;
                Statics.field1341.method4880(var94 - 73, var93 - 20);
                arg0.method4608(class233.field3170, var94, var93 + 5, 16777215, 0);
                arg1.method4608(class233.field2945, field1368 + 180, var93 + 36, 255, 0);
            } else if (field1360 == 5) {
                arg0.method4608(class233.field2959, field1368 + 180, 201, 16776960, 0);
                short var95 = 221;
                arg2.method4608(field1346, field1368 + 180, var95, 16776960, 0);
                int var133 = var95 + 15;
                arg2.method4608(field1363, field1368 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                arg2.method4608(field1364, field1368 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                int var136 = var135 + 14;
                arg0.method4584(class233.field3180, field1368 + 180 - 145, var136, 16777215, 0);
                short var96 = 174;
                String var99;
                if (Statics.field632.field1238) {
                    String var97 = field1362;
                    String var98 = Statics.method4729('*', var97.length());
                    var99 = var98;
                } else {
                    var99 = field1362;
                }
                String var101;
                for (var101 = var99; arg0.method4578(var101) > var96; var101 = var101.substring(1)) {
                }
                arg0.method4584(class272.method4638(var101) + (client.field881 % 40 < 20 ? class88.method3336(16776960) + class88.field1316 : ""), field1368 + 180 - 34, var136, 16777215, 0);
                var133 = var136 + 15;
                int var102 = field1368 + 180 - 80;
                short var103 = 321;
                Statics.field1341.method4880(var102 - 73, var103 - 20);
                arg0.method4608(class233.field2944, var102, var103 + 5, 16777215, 0);
                int var104 = field1368 + 180 + 80;
                Statics.field1341.method4880(var104 - 73, var103 - 20);
                arg0.method4608(class233.field3080, var104, var103 + 5, 16777215, 0);
            } else if (field1360 == 6) {
                short var105 = 201;
                arg0.method4608(field1346, field1368 + 180, var105, 16776960, 0);
                int var137 = var105 + 15;
                arg0.method4608(field1363, field1368 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg0.method4608(field1364, field1368 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var106 = field1368 + 180;
                short var107 = 321;
                Statics.field1341.method4880(var106 - 73, var107 - 20);
                arg0.method4608(class233.field3080, var106, var107 + 5, 16777215, 0);
            }
        }
        if (field1369 > 0) {
            method1758(field1369);
            field1369 = 0;
        }
        method53();
        Statics.field1357[Statics.field632.field1237 ? 1 : 0].method4880(field1355 + 765 - 40, 463);
        if (client.field879 <= 5 || client.field878 != 0) {
            return;
        }
        if (Statics.field14 == null) {
            Statics.field14 = class296.method1099(Statics.field1323, "sl_button", "");
            return;
        }
        int var108 = field1355 + 5;
        short var109 = 463;
        byte var110 = 100;
        byte var111 = 35;
        Statics.field14.method4880(var108, var109);
        arg0.method4608(class233.field3096 + " " + client.field1040, var110 / 2 + var108, var111 / 2 + var109 - 2, 16777215, 0);
        if (Statics.field747 == null) {
            arg1.method4608(class233.field3013, var110 / 2 + var108, var111 / 2 + var109 + 12, 16777215, 0);
        } else {
            arg1.method4608(class233.field3207, var110 / 2 + var108, var111 / 2 + var109 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cj.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1614(String arg0, String arg1, String arg2) {
        field1346 = arg0;
        field1363 = arg1;
        field1364 = arg2;
    }

    @ObfuscatedName("cg.l(Lkl;I)V")
    public static final void method1618(class294 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3221.length; var2++) {
            Statics.field3221[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3221[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3262[var8] = (Statics.field3221[var8 - 1] + Statics.field3221[var8 + 1] + Statics.field3221[var8 - 128] + Statics.field3221[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3221;
            Statics.field3221 = Statics.field3262;
            Statics.field3262 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3831; var11++) {
            for (int var12 = 0; var12 < arg0.field3827; var12++) {
                if (arg0.field3826[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3830;
                    int var14 = var11 + 16 + arg0.field3828;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3221[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ce.u(IB)V")
    public static final void method1758(int arg0) {
        short var1 = 256;
        field1354 += arg0 * 128;
        if (field1354 > Statics.field3221.length) {
            field1354 -= Statics.field3221.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1618(Statics.field3721[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1275[var3 + var4] - Statics.field3221[field1354 + var3 & Statics.field3221.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1275[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1275[var9 + var10] = 255;
                } else {
                    Statics.field1275[var9 + var10] = 0;
                }
            }
        }
        if (field1352 > 0) {
            field1352 -= arg0 * 4;
        }
        if (field1353 > 0) {
            field1353 -= arg0 * 4;
        }
        if (field1352 == 0 && field1353 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1352 = 1024;
            }
            if (var12 == 1) {
                field1353 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1350[var13] = field1350[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1350[var14] = (int) (Math.sin((double) field1371 / 14.0D) * 16.0D + Math.sin((double) field1371 / 15.0D) * 14.0D + Math.sin((double) field1371 / 16.0D) * 12.0D);
            field1371++;
        }
        field1344 += arg0 * -805175041;
        int var15 = ((client.field881 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1344 * -892101732; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1275[(var18 << 7) + var17] = 192;
        }
        field1344 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1275[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1275[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1276[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1276[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1276[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1275[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("fs.c(IIIB)I")
    public static final int method3007(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("l.j(I)V")
    public static final void method53() {
        short var0 = 256;
        if (field1352 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1352 > 768) {
                    Statics.field460[var1] = method3007(Statics.field812[var1], Statics.field3852[var1], 1024 - field1352);
                } else if (field1352 > 256) {
                    Statics.field460[var1] = Statics.field3852[var1];
                } else {
                    Statics.field460[var1] = method3007(Statics.field3852[var1], Statics.field812[var1], 256 - field1352);
                }
            }
        } else if (field1353 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1353 > 768) {
                    Statics.field460[var2] = method3007(Statics.field812[var2], Statics.field1351[var2], 1024 - field1353);
                } else if (field1353 > 256) {
                    Statics.field460[var2] = Statics.field1351[var2];
                } else {
                    Statics.field460[var2] = method3007(Statics.field1351[var2], Statics.field812[var2], 256 - field1353);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field460[var3] = Statics.field812[var3];
            }
        }
        class291.method4800(field1355, 9, field1355 + 128, var0 + 7);
        Statics.field2512.method4901(field1355, 0);
        class291.method4855();
        int var4 = 0;
        int var5 = field1355 + Statics.field1310.field3816 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1350[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1275[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field460[var10];
                    int var14 = Statics.field1310.field3815[var5];
                    Statics.field1310.field3815[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field1310.field3816 + var8 - 128;
        }
        class291.method4800(field1355 + 765 - 128, 9, field1355 + 765, var0 + 7);
        Statics.field1348.method4901(field1355 + 382, 0);
        class291.method4855();
        int var15 = 0;
        int var16 = field1355 + Statics.field1310.field3816 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1350[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1275[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field460[var22];
                    int var26 = Statics.field1310.field3815[var20];
                    Statics.field1310.field3815[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1310.field3816 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("x.f(Lbs;I)V")
    public static void method2(class59 arg0) {
        if (class60.field709 != 1 && Statics.field957 || class60.field709 != 4) {
            return;
        }
        int var1 = field1355 + 280;
        if (class60.field710 >= var1 && class60.field710 <= var1 + 14 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(0, 0);
            return;
        }
        if (class60.field710 >= var1 + 15 && class60.field710 <= var1 + 80 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(0, 1);
            return;
        }
        int var2 = field1355 + 390;
        if (class60.field710 >= var2 && class60.field710 <= var2 + 14 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(1, 0);
            return;
        }
        if (class60.field710 >= var2 + 15 && class60.field710 <= var2 + 80 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(1, 1);
            return;
        }
        int var3 = field1355 + 500;
        if (class60.field710 >= var3 && class60.field710 <= var3 + 14 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(2, 0);
            return;
        }
        if (class60.field710 >= var3 + 15 && class60.field710 <= var3 + 80 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(2, 1);
            return;
        }
        int var4 = field1355 + 610;
        if (class60.field710 >= var4 && class60.field710 <= var4 + 14 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(3, 0);
            return;
        }
        if (class60.field710 >= var4 + 15 && class60.field710 <= var4 + 80 && class60.field711 >= 4 && class60.field711 <= 18) {
            class80.method1093(3, 1);
            return;
        }
        if (class60.field710 >= field1355 + 708 && class60.field711 >= 4 && class60.field710 <= field1355 + 708 + 50 && class60.field711 <= 20) {
            field1374 = false;
            Statics.field2512.method4901(field1355, 0);
            Statics.field1348.method4901(field1355 + 382, 0);
            Statics.field1345.method4880(field1355 + 382 - Statics.field1345.field3827 / 2, 18);
            return;
        }
        if (field1375 == -1) {
            return;
        }
        class80 var5 = Statics.field1230[field1375];
        method1558(var5);
        field1374 = false;
        Statics.field2512.method4901(field1355, 0);
        Statics.field1348.method4901(field1355 + 382, 0);
        Statics.field1345.method4880(field1355 + 382 - Statics.field1345.field3827 / 2, 18);
        return;
    }

    @ObfuscatedName("cs.s(Lcw;B)V")
    public static void method1558(class80 arg0) {
        if (arg0.method1499() != client.field973) {
            client.field973 = arg0.method1499();
            boolean var1 = arg0.method1499();
            if (Statics.field827 != var1) {
                class264.method4234();
                Statics.field827 = var1;
            }
        }
        Statics.field315 = arg0.field1228;
        client.field1040 = arg0.field1222;
        client.field874 = arg0.field1213;
        Statics.field592 = client.field875 == 0 ? 43594 : arg0.field1222 + 40000;
        Statics.field910 = client.field875 == 0 ? 443 : arg0.field1222 + 50000;
        Statics.field2519 = Statics.field592;
    }
}
