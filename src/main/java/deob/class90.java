package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("cg")
public class class90 {

    @ObfuscatedName("cg.g")
    public static int field1357 = 0;

    @ObfuscatedName("cg.u")
    public static int field1323 = field1357 + 202;

    @ObfuscatedName("cg.y")
    public static int[] field1326 = new int[256];

    @ObfuscatedName("cg.a")
    public static int field1328 = 0;

    @ObfuscatedName("cg.ad")
    public static int field1356 = 0;

    @ObfuscatedName("cg.af")
    public static int field1329 = 0;

    @ObfuscatedName("cg.as")
    public static int field1348 = 0;

    @ObfuscatedName("cg.ax")
    public static int field1332 = 0;

    @ObfuscatedName("cg.ak")
    public static int field1333 = 0;

    @ObfuscatedName("cg.aw")
    public static int field1334 = 10;

    @ObfuscatedName("cg.ai")
    public static String field1335 = "";

    @ObfuscatedName("cg.ab")
    public static int field1336 = 0;

    @ObfuscatedName("cg.am")
    public static String field1337 = "";

    @ObfuscatedName("cg.ah")
    public static String field1325 = "";

    @ObfuscatedName("cg.ag")
    public static String field1338 = "";

    @ObfuscatedName("cg.az")
    public static String field1319 = "";

    @ObfuscatedName("cg.ae")
    public static String field1341 = "";

    @ObfuscatedName("cg.ao")
    public static String field1342 = "";

    @ObfuscatedName("cg.av")
    public static boolean field1343 = false;

    @ObfuscatedName("cg.ac")
    public static boolean field1345 = false;

    @ObfuscatedName("cg.bj")
    public static boolean field1346 = false;

    @ObfuscatedName("cg.bm")
    public static boolean field1347 = true;

    @ObfuscatedName("cg.bf")
    public static int field1318 = 0;

    @ObfuscatedName("cg.bh")
    public static String field1349 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cg.bt")
    public static String field1350 = "1234567890";

    @ObfuscatedName("cg.bq")
    public static boolean field1351 = false;

    @ObfuscatedName("cg.bl")
    public static int field1354 = -1;

    @ObfuscatedName("cg.bc")
    public static long field1339;

    @ObfuscatedName("cg.bz")
    public static long field1355;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1339 = -1L;
        field1355 = -1L;
    }

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.s(Lir;Lir;I)I")
    public static int method1500(class247 arg0, class247 arg1) {
        int var2 = 0;
        if (arg0.method4205("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4205("logo", "")) {
            var2++;
        }
        if (arg1.method4205("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4205("titlebox", "")) {
            var2++;
        }
        if (arg1.method4205("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4205("runes", "")) {
            var2++;
        }
        if (arg1.method4205("title_mute", "")) {
            var2++;
        }
        if (arg1.method4205("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4205("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4205("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4205("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4205("sl_back", "");
        arg1.method4205("sl_flags", "");
        arg1.method4205("sl_arrows", "");
        arg1.method4205("sl_stars", "");
        arg1.method4205("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ck.g(B)I")
    public static int method1824() {
        return 11;
    }

    @ObfuscatedName("bk.m(Lir;Lir;ZIB)V")
    public static void method968(class247 arg0, class247 arg1, boolean arg2, int arg3) {
        if (!Statics.field1330) {
            field1336 = arg3;
            class306.method5178();
            byte[] var4 = arg0.method4191("title.jpg", "");
            Statics.field308 = class55.method2170(var4);
            Statics.field484 = Statics.field308.method5291();
            if ((client.field842 & 0x20000000) == 0) {
                Statics.field1999 = class311.method3059(arg1, "logo", "");
            } else {
                Statics.field1999 = class311.method3059(arg1, "logo_deadman_mode", "");
            }
            Statics.field2532 = class311.method3059(arg1, "titlebox", "");
            Statics.field1320 = class311.method3059(arg1, "titlebutton", "");
            Statics.field1321 = class311.method4160(arg1, "runes", "");
            Statics.field475 = class311.method4160(arg1, "title_mute", "");
            Statics.field351 = class311.method3059(arg1, "options_radio_buttons,0", "");
            Statics.field1293 = class311.method3059(arg1, "options_radio_buttons,4", "");
            Statics.field1322 = class311.method3059(arg1, "options_radio_buttons,2", "");
            Statics.field17 = class311.method3059(arg1, "options_radio_buttons,6", "");
            Statics.field500 = Statics.field351.field3889;
            Statics.field2552 = Statics.field351.field3892;
            Statics.field624 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field624[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field624[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field624[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field624[var8 + 192] = 16777215;
            }
            Statics.field1327 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1327[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1327[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1327[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1327[var12 + 192] = 16777215;
            }
            Statics.field1252 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1252[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1252[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1252[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1252[var16 + 192] = 16777215;
            }
            Statics.field30 = new int[256];
            Statics.field548 = new int[32768];
            Statics.field835 = new int[32768];
            method138((class309) null);
            Statics.field839 = new int[32768];
            Statics.field425 = new int[32768];
            if (arg2) {
                field1341 = "";
                field1342 = "";
            }
            Statics.field688 = 0;
            Statics.field377 = "";
            field1347 = true;
            field1351 = false;
            if (Statics.field263.field1201) {
                class215.method127(2);
            } else {
                class249 var17 = Statics.field2914;
                int var18 = var17.method4201("scape main");
                int var19 = var17.method4217(var18, "");
                Statics.method3219(2, var17, var18, var19, 255, false);
            }
            class250.method3047(false);
            Statics.field1330 = true;
            field1357 = (Statics.field663 - 765) / 2;
            field1323 = field1357 + 202;
            Statics.field1324 = field1323 + 180;
            Statics.field308.method5300(field1357, 0);
            Statics.field484.method5300(field1357 + 382, 0);
            Statics.field1999.method5271(field1357 + 382 - Statics.field1999.field3889 / 2, 18);
        } else if (arg3 == 4) {
            field1336 = 4;
        }
    }

    @ObfuscatedName("bl.h(ZZI)Lkh;")
    public static class309 method971(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field17 : Statics.field1322) : (arg1 ? Statics.field1293 : Statics.field351);
    }

    @ObfuscatedName("g.i(I)V")
    public static void method1() {
        if (field1343 && field1341 != null && field1341.length() > 0) {
            field1318 = 1;
        } else {
            field1318 = 0;
        }
    }

    @ObfuscatedName("fm.w(Lbt;I)V")
    public static void method3136(class59 arg0) {
        if (field1351) {
            method4165(arg0);
            return;
        }
        if ((class60.field697 == 1 || !Statics.field407 && class60.field697 == 4) && class60.field698 >= field1357 + 765 - 50 && class60.field701 >= 453) {
            Statics.field263.field1201 = !Statics.field263.field1201;
            class78.method1502();
            if (Statics.field263.field1201) {
                Statics.field357.method3859();
                class215.field2618 = 1;
                Statics.field2615 = null;
            } else {
                class215.method3058(Statics.field2914, "scape main", "", 255, false);
            }
        }
        if (client.field848 == 5) {
            return;
        }
        if (field1339 == -1L) {
            field1339 = class187.method2705() + 1000L;
        }
        long var1 = class187.method2705();
        boolean var3;
        if (client.field1093 == null || client.field992 >= client.field1093.size()) {
            var3 = true;
        } else {
            while (true) {
                if (client.field992 >= client.field1093.size()) {
                    var3 = true;
                    break;
                }
                class64 var4 = (class64) client.field1093.get(client.field992);
                if (!var4.method943()) {
                    var3 = false;
                    break;
                }
                client.field992++;
            }
        }
        if (var3 && field1355 == -1L) {
            field1355 = var1;
            if (field1355 > field1339) {
                field1339 = field1355;
            }
        }
        field1332++;
        if (client.field848 != 10 && client.field848 != 11) {
            return;
        }
        if (client.field846 == 0) {
            if (class60.field697 == 1 || !Statics.field407 && class60.field697 == 4) {
                int var5 = field1357 + 5;
                short var6 = 463;
                byte var7 = 100;
                byte var8 = 35;
                if (class60.field698 >= var5 && class60.field698 <= var5 + var7 && class60.field701 >= var6 && class60.field701 <= var6 + var8) {
                    if (class77.method644()) {
                        field1351 = true;
                    }
                    return;
                }
            }
            if (Statics.field2165 != null && class77.method644()) {
                field1351 = true;
            }
        }
        int var9 = class60.field697;
        int var10 = class60.field698;
        int var11 = class60.field701;
        if (var9 == 0) {
            var10 = class60.field691;
            var11 = class60.field692;
        }
        if (!Statics.field407 && var9 == 4) {
            var9 = 1;
        }
        if (field1336 == 0) {
            boolean var12 = false;
            while (class51.method2929()) {
                if (Statics.field609 == 84) {
                    var12 = true;
                }
            }
            int var13 = Statics.field1324 - 80;
            short var14 = 291;
            if (var9 == 1 && var10 >= var13 - 75 && var10 <= var13 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20) {
                label677: {
                    String var15 = client.method3127("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var15));
                            break label677;
                        } catch (Exception var47) {
                        }
                    }
                    if (class57.field639.startsWith("win")) {
                        class57.method4815(var15, 0);
                    } else if (class57.field639.startsWith("mac")) {
                        class57.method987(var15, 1, "openjs");
                    } else {
                        class57.method4815(var15, 2);
                    }
                }
            }
            int var17 = Statics.field1324 + 80;
            if (var9 == 1 && var10 >= var17 - 75 && var10 <= var17 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20 || var12) {
                if ((client.field842 & 0x2000000) != 0) {
                    field1337 = "";
                    field1325 = class237.field3176;
                    field1338 = class237.field3177;
                    field1319 = class237.field3175;
                    field1336 = 1;
                    method1();
                } else if ((client.field842 & 0x4) != 0) {
                    if ((client.field842 & 0x400) == 0) {
                        field1325 = class237.field3167;
                        field1338 = class237.field3168;
                        field1319 = class237.field3013;
                    } else {
                        field1325 = class237.field3011;
                        field1338 = class237.field3174;
                        field1319 = class237.field3139;
                    }
                    field1337 = class237.field3166;
                    field1336 = 1;
                    method1();
                } else if ((client.field842 & 0x400) == 0) {
                    method2928(false);
                } else {
                    field1325 = class237.field3170;
                    field1338 = class237.field3171;
                    field1319 = class237.field3082;
                    field1337 = class237.field3166;
                    field1336 = 1;
                    method1();
                }
            }
        } else if (field1336 == 1) {
            while (class51.method2929()) {
                if (Statics.field609 == 84) {
                    method2928(false);
                } else if (Statics.field609 == 13) {
                    field1336 = 0;
                }
            }
            int var18 = Statics.field1324 - 80;
            short var19 = 321;
            if (var9 == 1 && var10 >= var18 - 75 && var10 <= var18 + 75 && var11 >= var19 - 20 && var11 <= var19 + 20) {
                method2928(false);
            }
            int var20 = Statics.field1324 + 80;
            if (var9 == 1 && var10 >= var20 - 75 && var10 <= var20 + 75 && var11 >= var19 - 20 && var11 <= var19 + 20) {
                field1336 = 0;
            }
        } else if (field1336 == 2) {
            short var21 = 201;
            int var48 = var21 + 52;
            if (var9 == 1 && var11 >= var48 - 12 && var11 < var48 + 2) {
                field1318 = 0;
            }
            var48 += 15;
            if (var9 == 1 && var11 >= var48 - 12 && var11 < var48 + 2) {
                field1318 = 1;
            }
            var48 += 15;
            short var22 = 361;
            if (var9 == 1 && var11 >= var22 - 15 && var11 < var22) {
                method609(class237.field3004, class237.field3205, class237.field3206);
                field1336 = 5;
                return;
            }
            int var23 = Statics.field1324 - 80;
            short var24 = 321;
            if (var9 == 1 && var10 >= var23 - 75 && var10 <= var23 + 75 && var11 >= var24 - 20 && var11 <= var24 + 20) {
                field1341 = field1341.trim();
                if (field1341.length() == 0) {
                    method609(class237.field3012, class237.field3070, class237.field3071);
                    return;
                }
                if (field1342.length() == 0) {
                    method609(class237.field3072, class237.field3073, class237.field3074);
                    return;
                }
                method609(class237.field3087, class237.field3182, class237.field3187);
                client.method2916(false);
                client.method1754(20);
                return;
            }
            int var25 = field1323 + 180 + 80;
            if (var9 == 1 && var10 >= var25 - 75 && var10 <= var25 + 75 && var11 >= var24 - 20 && var11 <= var24 + 20) {
                field1336 = 0;
                field1341 = "";
                field1342 = "";
                Statics.field688 = 0;
                Statics.field377 = "";
                field1347 = true;
            }
            int var26 = Statics.field1324 + -117;
            short var27 = 277;
            field1345 = var10 >= var26 && var10 < Statics.field500 + var26 && var11 >= var27 && var11 < Statics.field2552 + var27;
            if (var9 == 1 && field1345) {
                field1343 = !field1343;
                if (!field1343 && Statics.field263.field1205 != null) {
                    Statics.field263.field1205 = null;
                    class78.method1502();
                }
            }
            int var28 = Statics.field1324 + 24;
            short var29 = 277;
            field1346 = var10 >= var28 && var10 < Statics.field500 + var28 && var11 >= var29 && var11 < Statics.field2552 + var29;
            if (var9 == 1 && field1346) {
                Statics.field263.field1204 = !Statics.field263.field1204;
                if (!Statics.field263.field1204) {
                    field1341 = "";
                    Statics.field263.field1205 = null;
                    method1();
                }
                class78.method1502();
            }
            while (true) {
                while (class51.method2929()) {
                    boolean var30 = false;
                    for (int var31 = 0; var31 < field1349.length(); var31++) {
                        if (Statics.field3236 == field1349.charAt(var31)) {
                            var30 = true;
                            break;
                        }
                    }
                    if (Statics.field609 == 13) {
                        field1336 = 0;
                        field1341 = "";
                        field1342 = "";
                        Statics.field688 = 0;
                        Statics.field377 = "";
                        field1347 = true;
                    } else if (field1318 == 0) {
                        if (Statics.field609 == 85 && field1341.length() > 0) {
                            field1341 = field1341.substring(0, field1341.length() - 1);
                        }
                        if (Statics.field609 == 84 || Statics.field609 == 80) {
                            field1318 = 1;
                        }
                        if (var30 && field1341.length() < 320) {
                            field1341 = field1341 + Statics.field3236;
                        }
                    } else if (field1318 == 1) {
                        if (Statics.field609 == 85 && field1342.length() > 0) {
                            field1342 = field1342.substring(0, field1342.length() - 1);
                        }
                        if (Statics.field609 == 84 || Statics.field609 == 80) {
                            field1318 = 0;
                        }
                        if (Statics.field609 == 84) {
                            field1341 = field1341.trim();
                            if (field1341.length() == 0) {
                                method609(class237.field3012, class237.field3070, class237.field3071);
                                return;
                            }
                            if (field1342.length() == 0) {
                                method609(class237.field3072, class237.field3073, class237.field3074);
                                return;
                            }
                            method609(class237.field3087, class237.field3182, class237.field3187);
                            client.method2916(false);
                            client.method1754(20);
                            return;
                        }
                        if (var30 && field1342.length() < 20) {
                            field1342 = field1342 + Statics.field3236;
                        }
                    }
                }
                return;
            }
        } else if (field1336 == 3) {
            int var32 = field1323 + 180;
            short var33 = 276;
            if (var9 == 1 && var10 >= var32 - 75 && var10 <= var32 + 75 && var11 >= var33 - 20 && var11 <= var33 + 20) {
                method2928(false);
            }
            int var34 = field1323 + 180;
            short var35 = 326;
            if (var9 == 1 && var10 >= var34 - 75 && var10 <= var34 + 75 && var11 >= var35 - 20 && var11 <= var35 + 20) {
                method609(class237.field3004, class237.field3205, class237.field3206);
                field1336 = 5;
                return;
            }
        } else if (field1336 == 4) {
            int var36 = field1323 + 180 - 80;
            short var37 = 321;
            if (var9 == 1 && var10 >= var36 - 75 && var10 <= var36 + 75 && var11 >= var37 - 20 && var11 <= var37 + 20) {
                Statics.field377.trim();
                if (Statics.field377.length() != 6) {
                    method609(class237.field3116, class237.field3198, class237.field2954);
                    return;
                }
                Statics.field688 = Integer.parseInt(Statics.field377);
                Statics.field377 = "";
                client.method2916(true);
                method609(class237.field3087, class237.field3182, class237.field3187);
                client.method1754(20);
                return;
            }
            if (var9 == 1 && var10 >= field1323 + 180 - 9 && var10 <= field1323 + 180 + 130 && var11 >= 263 && var11 <= 296) {
                field1347 = !field1347;
            }
            if (var9 == 1 && var10 >= field1323 + 180 - 34 && var10 <= field1323 + 180 + 34 && var11 >= 351 && var11 <= 363) {
                class57.method4161(client.method3127("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var38 = field1323 + 180 + 80;
            if (var9 == 1 && var10 >= var38 - 75 && var10 <= var38 + 75 && var11 >= var37 - 20 && var11 <= var37 + 20) {
                field1336 = 0;
                field1341 = "";
                field1342 = "";
                Statics.field688 = 0;
                Statics.field377 = "";
            }
            while (class51.method2929()) {
                boolean var39 = false;
                for (int var40 = 0; var40 < field1350.length(); var40++) {
                    if (Statics.field3236 == field1350.charAt(var40)) {
                        var39 = true;
                        break;
                    }
                }
                if (Statics.field609 == 13) {
                    field1336 = 0;
                    field1341 = "";
                    field1342 = "";
                    Statics.field688 = 0;
                    Statics.field377 = "";
                } else {
                    if (Statics.field609 == 85 && Statics.field377.length() > 0) {
                        Statics.field377 = Statics.field377.substring(0, Statics.field377.length() - 1);
                    }
                    if (Statics.field609 == 84) {
                        Statics.field377.trim();
                        if (Statics.field377.length() != 6) {
                            method609(class237.field3116, class237.field3198, class237.field2954);
                            return;
                        }
                        Statics.field688 = Integer.parseInt(Statics.field377);
                        Statics.field377 = "";
                        client.method2916(true);
                        method609(class237.field3087, class237.field3182, class237.field3187);
                        client.method1754(20);
                        return;
                    }
                    if (var39 && Statics.field377.length() < 6) {
                        Statics.field377 = Statics.field377 + Statics.field3236;
                    }
                }
            }
        } else if (field1336 == 5) {
            int var41 = field1323 + 180 - 80;
            short var42 = 321;
            if (var9 == 1 && var10 >= var41 - 75 && var10 <= var41 + 75 && var11 >= var42 - 20 && var11 <= var42 + 20) {
                method1636();
                return;
            }
            int var43 = field1323 + 180 + 80;
            if (var9 == 1 && var10 >= var43 - 75 && var10 <= var43 + 75 && var11 >= var42 - 20 && var11 <= var42 + 20) {
                method2928(true);
            }
            while (class51.method2929()) {
                boolean var44 = false;
                for (int var45 = 0; var45 < field1349.length(); var45++) {
                    if (Statics.field3236 == field1349.charAt(var45)) {
                        var44 = true;
                        break;
                    }
                }
                if (Statics.field609 == 13) {
                    method2928(true);
                } else {
                    if (Statics.field609 == 85 && field1341.length() > 0) {
                        field1341 = field1341.substring(0, field1341.length() - 1);
                    }
                    if (Statics.field609 == 84) {
                        method1636();
                        return;
                    }
                    if (var44 && field1341.length() < 320) {
                        field1341 = field1341 + Statics.field3236;
                    }
                }
            }
        } else if (field1336 == 6) {
            while (true) {
                do {
                    if (!class51.method2929()) {
                        short var46 = 321;
                        if (var9 == 1 && var11 >= var46 - 20 && var11 <= var46 + 20) {
                            method2928(true);
                        }
                        return;
                    }
                } while (Statics.field609 != 84 && Statics.field609 != 13);
                method2928(true);
            }
        }
    }

    @ObfuscatedName("ei.t(ZB)V")
    public static void method2928(boolean arg0) {
        field1325 = class237.field3163;
        field1338 = class237.field3088;
        field1319 = class237.field3165;
        field1336 = 2;
        if (arg0) {
            field1342 = "";
        }
        if (field1341 == null || field1341.length() <= 0) {
            if (Statics.field263.field1205 == null) {
                field1343 = false;
            } else {
                field1341 = Statics.field263.field1205;
                field1343 = true;
            }
        }
        method1();
    }

    @ObfuscatedName("cc.d(I)V")
    public static void method1636() {
        field1341 = field1341.trim();
        if (field1341.length() == 0) {
            method609(class237.field3004, class237.field3205, class237.field3206);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method3127("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class185 var4 = new class185(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2512, var4.field2514, 1000 - var4.field2514);
                if (var5 == -1) {
                    var4.field2514 = 0;
                    long var8 = var4.method3405();
                    var6 = var8;
                    break;
                }
                var4.field2514 += var5;
                if (var4.field2514 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var49) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1341;
            Random var15 = new Random();
            class185 var16 = new class185(128);
            class185 var17 = new class185(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method3223(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method3242(var15.nextInt());
            }
            var16.method3242(var18[0]);
            var16.method3242(var18[1]);
            var16.method3303(var6);
            var16.method3303(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method3242(var15.nextInt());
            }
            var16.method3261(class85.field1275, class85.field1276);
            var17.method3223(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method3242(var15.nextInt());
            }
            var17.method3303(var15.nextLong());
            var17.method3227(var15.nextLong());
            if (client.field1007 == null) {
                byte[] var22 = new byte[24];
                try {
                    class158.field2143.method1935(0L);
                    class158.field2143.method1945(var22);
                    int var23;
                    for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                    }
                    if (var23 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var48) {
                    for (int var25 = 0; var25 < 24; var25++) {
                        var22[var25] = -1;
                    }
                }
                var17.method3233(var22, 0, var22.length);
            } else {
                var17.method3233(client.field1007, 0, client.field1007.length);
            }
            var17.method3303(var15.nextLong());
            var17.method3261(class85.field1275, class85.field1276);
            int var28 = class185.method2709(var14);
            if (var28 % 8 != 0) {
                var28 += 8 - var28 % 8;
            }
            class185 var29 = new class185(var28);
            var29.method3230(var14);
            var29.field2514 = var28;
            var29.method3464(var18);
            class185 var30 = new class185(var29.field2514 + var17.field2514 + var16.field2514 + 5);
            var30.method3223(2);
            var30.method3223(var16.field2514);
            var30.method3233(var16.field2512, 0, var16.field2514);
            var30.method3223(var17.field2514);
            var30.method3233(var17.field2512, 0, var17.field2514);
            var30.method3403(var29.field2514);
            var30.method3233(var29.field2512, 0, var29.field2514);
            byte[] var31 = var30.field2512;
            String var32 = class293.method3438(var31, 0, var31.length);
            String var33 = var32;
            byte var40;
            try {
                URL var34 = new URL(client.method3127("services", false) + "m=accountappeal/login.ws");
                URLConnection var35 = var34.openConnection();
                var35.setDoInput(true);
                var35.setDoOutput(true);
                var35.setConnectTimeout(5000);
                OutputStreamWriter var36 = new OutputStreamWriter(var35.getOutputStream());
                var36.write("data2=" + class318.method4912(var33) + "&dest=" + class318.method4912("passwordchoice.ws"));
                var36.flush();
                InputStream var37 = var35.getInputStream();
                class185 var38 = new class185(new byte[1000]);
                while (true) {
                    int var39 = var37.read(var38.field2512, var38.field2514, 1000 - var38.field2514);
                    if (var39 == -1) {
                        var36.close();
                        var37.close();
                        String var41 = new String(var38.field2512);
                        if (var41.startsWith("OFFLINE")) {
                            var40 = 4;
                        } else if (var41.startsWith("WRONG")) {
                            var40 = 7;
                        } else if (var41.startsWith("RELOAD")) {
                            var40 = 3;
                        } else if (var41.startsWith("Not permitted for social network accounts.")) {
                            var40 = 6;
                        } else {
                            var38.method3258(var18);
                            while (var38.field2514 > 0 && var38.field2512[var38.field2514 - 1] == 0) {
                                var38.field2514--;
                            }
                            String var42 = new String(var38.field2512, 0, var38.field2514);
                            boolean var43;
                            if (var42 == null) {
                                var43 = false;
                            } else {
                                label117: {
                                    try {
                                        new URL(var42);
                                    } catch (MalformedURLException var46) {
                                        var43 = false;
                                        break label117;
                                    }
                                    var43 = true;
                                }
                            }
                            if (var43) {
                                class57.method4161(var42, true, false);
                                var40 = 2;
                            } else {
                                var40 = 5;
                            }
                        }
                        break;
                    }
                    var38.field2514 += var39;
                    if (var38.field2514 >= 1000) {
                        var40 = 5;
                        break;
                    }
                }
            } catch (Throwable var47) {
                var47.printStackTrace();
                var40 = 5;
            }
            var13 = var40;
        }
        switch(var13) {
            case 2:
                method609(class237.field3207, class237.field3059, class237.field3181);
                field1336 = 6;
                break;
            case 3:
                method609(class237.field3052, class237.field3222, class237.field3212);
                break;
            case 4:
                method609(class237.field3213, class237.field3214, class237.field3210);
                break;
            case 5:
                method609(class237.field3216, class237.field3217, class237.field3127);
                break;
            case 6:
                method609(class237.field3219, class237.field3180, class237.field3085);
                break;
            case 7:
                method609(class237.field2957, class237.field2952, class237.field2990);
        }
    }

    @ObfuscatedName("iy.z(Lkp;Lkp;Lkp;ZI)V")
    public static void method4177(class287 arg0, class287 arg1, class287 arg2, boolean arg3) {
        if (arg3) {
            field1357 = (Statics.field663 - 765) / 2;
            field1323 = field1357 + 202;
            Statics.field1324 = field1323 + 180;
        }
        if (field1351) {
            method605(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field308.method5300(field1357, 0);
            Statics.field484.method5300(field1357 + 382, 0);
            Statics.field1999.method5271(field1357 + 382 - Statics.field1999.field3889 / 2, 18);
        }
        if (client.field848 == 0 || client.field848 == 5) {
            byte var4 = 20;
            arg0.method5042(class237.field3162, field1323 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class306.method5196(field1323 + 180 - 152, var5, 304, 34, 9179409);
            class306.method5196(field1323 + 180 - 151, var5 + 1, 302, 32, 0);
            class306.method5225(field1323 + 180 - 150, var5 + 2, field1334 * 3, 30, 9179409);
            class306.method5225(field1334 * 3 + (field1323 + 180 - 150), var5 + 2, 300 - field1334 * 3, 30, 0);
            arg0.method5042(field1335, field1323 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field848 == 20) {
            Statics.field2532.method5271(field1323 + 180 - Statics.field2532.field3889 / 2, 271 - Statics.field2532.field3892 / 2);
            short var6 = 201;
            arg0.method5042(field1325, field1323 + 180, var6, 16776960, 0);
            int var86 = var6 + 15;
            arg0.method5042(field1338, field1323 + 180, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method5042(field1319, field1323 + 180, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 7;
            if (field1336 != 4) {
                arg0.method5015(class237.field3196, field1323 + 180 - 110, var89, 16777215, 0);
                short var7 = 200;
                String var8 = Statics.field263.field1204 ? class294.method3129(field1341) : field1341;
                String var9;
                for (var9 = var8; arg0.method4998(var9) > var7; var9 = var9.substring(0, var9.length() - 1)) {
                }
                arg0.method5015(class288.method5002(var9), field1323 + 180 - 70, var89, 16777215, 0);
                var86 = var89 + 15;
                arg0.method5015(class237.field3185 + class294.method3129(field1342), field1323 + 180 - 108, var86, 16777215, 0);
                var86 += 15;
            }
        }
        if (client.field848 == 10 || client.field848 == 11) {
            Statics.field2532.method5271(field1323, 171);
            if (field1336 == 0) {
                short var10 = 251;
                arg0.method5042(class237.field3233, field1323 + 180, var10, 16776960, 0);
                int var90 = var10 + 30;
                int var11 = field1323 + 180 - 80;
                short var12 = 291;
                Statics.field1320.method5271(var11 - 73, var12 - 20);
                arg0.method5007(class237.field3065, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field1323 + 180 + 80;
                Statics.field1320.method5271(var13 - 73, var12 - 20);
                arg0.method5007(class237.field2959, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1336 == 1) {
                arg0.method5042(field1337, field1323 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method5042(field1325, field1323 + 180, var14, 16777215, 0);
                int var91 = var14 + 15;
                arg0.method5042(field1338, field1323 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method5042(field1319, field1323 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                int var15 = field1323 + 180 - 80;
                short var16 = 321;
                Statics.field1320.method5271(var15 - 73, var16 - 20);
                arg0.method5042(class237.field3001, var15, var16 + 5, 16777215, 0);
                int var17 = field1323 + 180 + 80;
                Statics.field1320.method5271(var17 - 73, var16 - 20);
                arg0.method5042(class237.field3062, var17, var16 + 5, 16777215, 0);
            } else if (field1336 == 2) {
                short var18 = 201;
                arg0.method5042(field1325, Statics.field1324, var18, 16776960, 0);
                int var94 = var18 + 15;
                arg0.method5042(field1338, Statics.field1324, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method5042(field1319, Statics.field1324, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 7;
                arg0.method5015(class237.field3196, Statics.field1324 - 110, var97, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field263.field1204 ? class294.method3129(field1341) : field1341;
                String var21;
                for (var21 = var20; arg0.method4998(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method5015(class288.method5002(var21) + (field1318 == 0 & client.field1036 % 40 < 20 ? class86.method1026(16776960) + class86.field1294 : ""), Statics.field1324 - 70, var97, 16777215, 0);
                var94 = var97 + 15;
                arg0.method5015(class237.field3185 + class294.method3129(field1342) + (field1318 == 1 & client.field1036 % 40 < 20 ? class86.method1026(16776960) + class86.field1294 : ""), Statics.field1324 - 108, var94, 16777215, 0);
                var94 += 15;
                short var22 = 277;
                int var23 = Statics.field1324 + -117;
                class309 var24 = method971(field1343, field1345);
                var24.method5271(var23, var22);
                int var25 = var24.field3889 + 5 + var23;
                arg1.method5015(class237.field3010, var25, var22 + 13, 16776960, 0);
                int var26 = Statics.field1324 + 24;
                class309 var27 = method971(Statics.field263.field1204, field1346);
                var27.method5271(var26, var22);
                int var28 = var27.field3889 + 5 + var26;
                arg1.method5015(class237.field3193, var28, var22 + 13, 16776960, 0);
                int var98 = var22 + 15;
                int var29 = Statics.field1324 - 80;
                short var30 = 321;
                Statics.field1320.method5271(var29 - 73, var30 - 20);
                arg0.method5042(class237.field2989, var29, var30 + 5, 16777215, 0);
                int var31 = Statics.field1324 + 80;
                Statics.field1320.method5271(var31 - 73, var30 - 20);
                arg0.method5042(class237.field3062, var31, var30 + 5, 16777215, 0);
                short var32 = 357;
                arg1.method5042(class237.field2974, Statics.field1324, var32, 16776960, 0);
            } else if (field1336 == 3) {
                short var33 = 201;
                arg0.method5042(class237.field3081, field1323 + 180, var33, 16776960, 0);
                int var99 = var33 + 20;
                arg1.method5042(class237.field3195, field1323 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg1.method5042(class237.field3191, field1323 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var34 = field1323 + 180;
                short var35 = 276;
                Statics.field1320.method5271(var34 - 73, var35 - 20);
                arg2.method5042(class237.field3090, var34, var35 + 5, 16777215, 0);
                int var36 = field1323 + 180;
                short var37 = 326;
                Statics.field1320.method5271(var36 - 73, var37 - 20);
                arg2.method5042(class237.field2985, var36, var37 + 5, 16777215, 0);
            } else if (field1336 == 4) {
                arg0.method5042(class237.field3179, field1323 + 180, 201, 16776960, 0);
                short var38 = 236;
                arg0.method5042(field1325, field1323 + 180, var38, 16777215, 0);
                int var102 = var38 + 15;
                arg0.method5042(field1338, field1323 + 180, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method5042(field1319, field1323 + 180, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method5015(class237.field3186 + class294.method3129(Statics.field377) + (client.field1036 % 40 < 20 ? class86.method1026(16776960) + class86.field1294 : ""), field1323 + 180 - 108, var104, 16777215, 0);
                int var105 = var104 - 8;
                arg0.method5015(class237.field2960, field1323 + 180 - 9, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method5015(class237.field2961, field1323 + 180 - 9, var106, 16776960, 0);
                int var39 = field1323 + 180 - 9 + arg0.method4998(class237.field2961) + 15;
                int var40 = var106 - arg0.field3782;
                class309 var41;
                if (field1347) {
                    var41 = Statics.field1322;
                } else {
                    var41 = Statics.field351;
                }
                var41.method5271(var39, var40);
                var102 = var106 + 15;
                int var42 = field1323 + 180 - 80;
                short var43 = 321;
                Statics.field1320.method5271(var42 - 73, var43 - 20);
                arg0.method5042(class237.field3001, var42, var43 + 5, 16777215, 0);
                int var44 = field1323 + 180 + 80;
                Statics.field1320.method5271(var44 - 73, var43 - 20);
                arg0.method5042(class237.field3062, var44, var43 + 5, 16777215, 0);
                arg1.method5042(class237.field2993, field1323 + 180, var43 + 36, 255, 0);
            } else if (field1336 == 5) {
                arg0.method5042(class237.field3200, field1323 + 180, 201, 16776960, 0);
                short var45 = 221;
                arg2.method5042(field1325, field1323 + 180, var45, 16776960, 0);
                int var107 = var45 + 15;
                arg2.method5042(field1338, field1323 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg2.method5042(field1319, field1323 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var110 = var109 + 14;
                arg0.method5015(class237.field3201, field1323 + 180 - 145, var110, 16777215, 0);
                short var46 = 174;
                String var47 = Statics.field263.field1204 ? class294.method3129(field1341) : field1341;
                String var48;
                for (var48 = var47; arg0.method4998(var48) > var46; var48 = var48.substring(1)) {
                }
                arg0.method5015(class288.method5002(var48) + (client.field1036 % 40 < 20 ? class86.method1026(16776960) + class86.field1294 : ""), field1323 + 180 - 34, var110, 16777215, 0);
                var107 = var110 + 15;
                int var49 = field1323 + 180 - 80;
                short var50 = 321;
                Statics.field1320.method5271(var49 - 73, var50 - 20);
                arg0.method5042(class237.field3202, var49, var50 + 5, 16777215, 0);
                int var51 = field1323 + 180 + 80;
                Statics.field1320.method5271(var51 - 73, var50 - 20);
                arg0.method5042(class237.field3203, var51, var50 + 5, 16777215, 0);
            } else if (field1336 == 6) {
                short var52 = 201;
                arg0.method5042(field1325, field1323 + 180, var52, 16776960, 0);
                int var111 = var52 + 15;
                arg0.method5042(field1338, field1323 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method5042(field1319, field1323 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var53 = field1323 + 180;
                short var54 = 321;
                Statics.field1320.method5271(var53 - 73, var54 - 20);
                arg0.method5042(class237.field3203, var53, var54 + 5, 16777215, 0);
            }
        }
        if (field1332 > 0) {
            method1813(field1332);
            field1332 = 0;
        }
        short var55 = 256;
        if (field1328 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (field1328 > 768) {
                    Statics.field30[var56] = method4176(Statics.field624[var56], Statics.field1327[var56], 1024 - field1328);
                } else if (field1328 > 256) {
                    Statics.field30[var56] = Statics.field1327[var56];
                } else {
                    Statics.field30[var56] = method4176(Statics.field1327[var56], Statics.field624[var56], 256 - field1328);
                }
            }
        } else if (field1356 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (field1356 > 768) {
                    Statics.field30[var57] = method4176(Statics.field624[var57], Statics.field1252[var57], 1024 - field1356);
                } else if (field1356 > 256) {
                    Statics.field30[var57] = Statics.field1252[var57];
                } else {
                    Statics.field30[var57] = method4176(Statics.field1252[var57], Statics.field624[var57], 256 - field1356);
                }
            }
        } else {
            for (int var58 = 0; var58 < 256; var58++) {
                Statics.field30[var58] = Statics.field624[var58];
            }
        }
        class306.method5181(field1357, 9, field1357 + 128, var55 + 7);
        Statics.field308.method5300(field1357, 0);
        class306.method5228();
        int var59 = 0;
        int var60 = field1357 + Statics.field336.field3879 * 9;
        for (int var61 = 1; var61 < var55 - 1; var61++) {
            int var62 = (var55 - var61) * field1326[var61] / var55;
            int var63 = var62 + 22;
            if (var63 < 0) {
                var63 = 0;
            }
            var59 += var63;
            for (int var64 = var63; var64 < 128; var64++) {
                int var65 = Statics.field839[var59++];
                if (var65 == 0) {
                    var60++;
                } else {
                    int var67 = 256 - var65;
                    int var68 = Statics.field30[var65];
                    int var69 = Statics.field336.field3878[var60];
                    Statics.field336.field3878[var60++] = ((var68 & 0xFF00FF) * var65 + (var69 & 0xFF00FF) * var67 & 0xFF00FF00) + ((var68 & 0xFF00) * var65 + (var69 & 0xFF00) * var67 & 0xFF0000) >> 8;
                }
            }
            var60 += Statics.field336.field3879 + var63 - 128;
        }
        class306.method5181(field1357 + 765 - 128, 9, field1357 + 765, var55 + 7);
        Statics.field484.method5300(field1357 + 382, 0);
        class306.method5228();
        int var70 = 0;
        int var71 = field1357 + Statics.field336.field3879 * 9 + 24 + 637;
        for (int var72 = 1; var72 < var55 - 1; var72++) {
            int var73 = (var55 - var72) * field1326[var72] / var55;
            int var74 = 103 - var73;
            int var75 = var71 + var73;
            for (int var76 = 0; var76 < var74; var76++) {
                int var77 = Statics.field839[var70++];
                if (var77 == 0) {
                    var75++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field30[var77];
                    int var81 = Statics.field336.field3878[var75];
                    Statics.field336.field3878[var75++] = ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) + ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) >> 8;
                }
            }
            var70 += 128 - var74;
            var71 = Statics.field336.field3879 - var74 - var73 + var75;
        }
        Statics.field475[Statics.field263.field1201 ? 1 : 0].method5271(field1357 + 765 - 40, 463);
        if (client.field848 <= 5 || client.field846 != 0) {
            return;
        }
        if (Statics.field1890 == null) {
            Statics.field1890 = class311.method3059(Statics.field485, "sl_button", "");
            return;
        }
        int var82 = field1357 + 5;
        short var83 = 463;
        byte var84 = 100;
        byte var85 = 35;
        Statics.field1890.method5271(var82, var83);
        arg0.method5042(class237.field3235 + " " + client.field841, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
        if (Statics.field2165 == null) {
            arg1.method5042(class237.field3209, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
        } else {
            arg1.method5042(class237.field3042, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("au.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method609(String arg0, String arg1, String arg2) {
        field1325 = arg0;
        field1338 = arg1;
        field1319 = arg2;
    }

    @ObfuscatedName("b.c(Lkh;B)V")
    public static final void method138(class309 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field548.length; var2++) {
            Statics.field548[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field548[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field835[var8] = (Statics.field548[var8 - 1] + Statics.field548[var8 + 1] + Statics.field548[var8 - 128] + Statics.field548[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field548;
            Statics.field548 = Statics.field835;
            Statics.field835 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3892; var11++) {
            for (int var12 = 0; var12 < arg0.field3889; var12++) {
                if (arg0.field3891[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3893;
                    int var14 = var11 + 16 + arg0.field3896;
                    int var15 = (var14 << 7) + var13;
                    Statics.field548[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cg.o(II)V")
    public static final void method1813(int arg0) {
        short var1 = 256;
        field1329 += arg0 * 128;
        if (field1329 > Statics.field548.length) {
            field1329 -= Statics.field548.length;
            int var2 = (int) (Math.random() * 12.0D);
            method138(Statics.field1321[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field839[var3 + var4] - Statics.field548[field1329 + var3 & Statics.field548.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field839[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field839[var9 + var10] = 255;
                } else {
                    Statics.field839[var9 + var10] = 0;
                }
            }
        }
        if (field1328 > 0) {
            field1328 -= arg0 * 4;
        }
        if (field1356 > 0) {
            field1356 -= arg0 * 4;
        }
        if (field1328 == 0 && field1356 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1328 = 1024;
            }
            if (var12 == 1) {
                field1356 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1326[var13] = field1326[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1326[var14] = (int) (Math.sin((double) field1333 / 14.0D) * 16.0D + Math.sin((double) field1333 / 15.0D) * 14.0D + Math.sin((double) field1333 / 16.0D) * 12.0D);
            field1333++;
        }
        field1348 += arg0 * -568557931;
        int var15 = ((client.field1036 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1348 * 559430100; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field839[(var18 << 7) + var17] = 192;
        }
        field1348 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field839[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field839[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field425[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field425[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field425[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field839[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("iy.l(IIIB)I")
    public static final int method4176(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ap.f(Lkp;Lkp;I)V")
    public static void method605(class287 arg0, class287 arg1) {
        if (Statics.field1292 == null) {
            Statics.field1292 = class311.method459(Statics.field485, "sl_back", "");
        }
        if (Statics.field1352 == null) {
            Statics.field1352 = class311.method4160(Statics.field485, "sl_flags", "");
        }
        if (Statics.field1353 == null) {
            Statics.field1353 = class311.method4160(Statics.field485, "sl_arrows", "");
        }
        if (Statics.field2714 == null) {
            Statics.field2714 = class311.method4160(Statics.field485, "sl_stars", "");
        }
        class306.method5225(field1357, 23, 765, 480, 0);
        class306.method5194(field1357, 0, 125, 23, 12425273, 9135624);
        class306.method5194(field1357 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5042(class237.field3225, field1357 + 62, 15, 0, -1);
        if (Statics.field2714 != null) {
            Statics.field2714[1].method5271(field1357 + 140, 1);
            arg1.method5015(class237.field3226, field1357 + 152, 10, 16777215, -1);
            Statics.field2714[0].method5271(field1357 + 140, 12);
            arg1.method5015(class237.field3227, field1357 + 152, 21, 16777215, -1);
        }
        if (Statics.field1353 != null) {
            int var2 = field1357 + 280;
            if (class77.field1188[0] == 0 && class77.field1187[0] == 0) {
                Statics.field1353[2].method5271(var2, 4);
            } else {
                Statics.field1353[0].method5271(var2, 4);
            }
            if (class77.field1188[0] == 0 && class77.field1187[0] == 1) {
                Statics.field1353[3].method5271(var2 + 15, 4);
            } else {
                Statics.field1353[1].method5271(var2 + 15, 4);
            }
            arg0.method5015(class237.field3228, var2 + 32, 17, 16777215, -1);
            int var3 = field1357 + 390;
            if (class77.field1188[0] == 1 && class77.field1187[0] == 0) {
                Statics.field1353[2].method5271(var3, 4);
            } else {
                Statics.field1353[0].method5271(var3, 4);
            }
            if (class77.field1188[0] == 1 && class77.field1187[0] == 1) {
                Statics.field1353[3].method5271(var3 + 15, 4);
            } else {
                Statics.field1353[1].method5271(var3 + 15, 4);
            }
            arg0.method5015(class237.field3229, var3 + 32, 17, 16777215, -1);
            int var4 = field1357 + 500;
            if (class77.field1188[0] == 2 && class77.field1187[0] == 0) {
                Statics.field1353[2].method5271(var4, 4);
            } else {
                Statics.field1353[0].method5271(var4, 4);
            }
            if (class77.field1188[0] == 2 && class77.field1187[0] == 1) {
                Statics.field1353[3].method5271(var4 + 15, 4);
            } else {
                Statics.field1353[1].method5271(var4 + 15, 4);
            }
            arg0.method5015(class237.field2956, var4 + 32, 17, 16777215, -1);
            int var5 = field1357 + 610;
            if (class77.field1188[0] == 3 && class77.field1187[0] == 0) {
                Statics.field1353[2].method5271(var5, 4);
            } else {
                Statics.field1353[0].method5271(var5, 4);
            }
            if (class77.field1188[0] == 3 && class77.field1187[0] == 1) {
                Statics.field1353[3].method5271(var5 + 15, 4);
            } else {
                Statics.field1353[1].method5271(var5 + 15, 4);
            }
            arg0.method5015(class237.field3028, var5 + 32, 17, 16777215, -1);
        }
        class306.method5225(field1357 + 708, 4, 50, 16, 0);
        arg1.method5042(class237.field3062, field1357 + 708 + 25, 16, 16777215, -1);
        field1354 = -1;
        if (Statics.field1292 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class77.field1185) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class77.field1185) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class77.field1185) {
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
            int var17 = field1357 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class77.field1185; var20++) {
                class77 var21 = Statics.field423[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1191);
                if (var21.field1191 == -1) {
                    var23 = class237.field3232;
                    var22 = false;
                } else if (var21.field1191 > 1980) {
                    var23 = class237.field3041;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1511()) {
                    if (var21.method1505()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1538()) {
                    var24 = 16711680;
                    if (var21.method1505()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1519()) {
                    if (var21.method1505()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1505()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field691 >= var17 && class60.field692 >= var16 && class60.field691 < var6 + var17 && class60.field692 < var7 + var16 && var22) {
                    field1354 = var20;
                    Statics.field1292[var25].method5306(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1292[var25].method5300(var17, var16);
                }
                if (Statics.field1352 != null) {
                    Statics.field1352[(var21.method1505() ? 8 : 0) + var21.field1194].method5271(var17 + 29, var16);
                }
                arg0.method5042(Integer.toString(var21.field1189), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method5042(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4998(Statics.field423[field1354].field1182) + 6;
                int var27 = arg1.field3782 + 8;
                class306.method5225(class60.field691 - var26 / 2, class60.field692 + 20 + 5, var26, var27, 16777120);
                class306.method5196(class60.field691 - var26 / 2, class60.field692 + 20 + 5, var26, var27, 0);
                arg1.method5042(Statics.field423[field1354].field1182, class60.field691, class60.field692 + 20 + 5 + arg1.field3782 + 4, 0, -1);
            }
        }
        Statics.field336.method698(0, 0);
    }

    @ObfuscatedName("ie.q(Lbt;I)V")
    public static void method4165(class59 arg0) {
        if (class60.field697 != 1 && Statics.field407 || class60.field697 != 4) {
            return;
        }
        int var1 = field1357 + 280;
        if (class60.field698 >= var1 && class60.field698 <= var1 + 14 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(0, 0);
            return;
        }
        if (class60.field698 >= var1 + 15 && class60.field698 <= var1 + 80 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(0, 1);
            return;
        }
        int var2 = field1357 + 390;
        if (class60.field698 >= var2 && class60.field698 <= var2 + 14 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(1, 0);
            return;
        }
        if (class60.field698 >= var2 + 15 && class60.field698 <= var2 + 80 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(1, 1);
            return;
        }
        int var3 = field1357 + 500;
        if (class60.field698 >= var3 && class60.field698 <= var3 + 14 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(2, 0);
            return;
        }
        if (class60.field698 >= var3 + 15 && class60.field698 <= var3 + 80 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(2, 1);
            return;
        }
        int var4 = field1357 + 610;
        if (class60.field698 >= var4 && class60.field698 <= var4 + 14 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(3, 0);
            return;
        }
        if (class60.field698 >= var4 + 15 && class60.field698 <= var4 + 80 && class60.field701 >= 4 && class60.field701 <= 18) {
            class77.method957(3, 1);
            return;
        }
        if (class60.field698 >= field1357 + 708 && class60.field701 >= 4 && class60.field698 <= field1357 + 708 + 50 && class60.field701 <= 20) {
            field1351 = false;
            Statics.field308.method5300(field1357, 0);
            Statics.field484.method5300(field1357 + 382, 0);
            Statics.field1999.method5271(field1357 + 382 - Statics.field1999.field3889 / 2, 18);
            return;
        }
        if (field1354 == -1) {
            return;
        }
        class77 var5 = Statics.field423[field1354];
        method682(var5);
        field1351 = false;
        Statics.field308.method5300(field1357, 0);
        Statics.field484.method5300(field1357 + 382, 0);
        Statics.field1999.method5271(field1357 + 382 - Statics.field1999.field3889 / 2, 18);
        return;
    }

    @ObfuscatedName("bf.r(Lbs;I)V")
    public static void method682(class77 arg0) {
        if (arg0.method1505() != client.field958) {
            client.field958 = arg0.method1505();
            class268.method4166(arg0.method1505());
        }
        Statics.field2117 = arg0.field1192;
        client.field841 = arg0.field1189;
        client.field842 = arg0.field1190;
        Statics.field491 = client.field1016 == 0 ? 43594 : arg0.field1189 + 40000;
        Statics.field2019 = client.field1016 == 0 ? 443 : arg0.field1189 + 50000;
        Statics.field545 = Statics.field491;
    }
}
