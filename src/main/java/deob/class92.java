package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import javax.imageio.ImageIO;

@ObfuscatedName("ca")
public class class92 {

    @ObfuscatedName("ca.s")
    public static int field1362 = 0;

    @ObfuscatedName("ca.c")
    public static int field1334 = field1362 + 202;

    @ObfuscatedName("ca.i")
    public static int[] field1359 = new int[256];

    @ObfuscatedName("ca.w")
    public static int field1338 = 0;

    @ObfuscatedName("ca.av")
    public static int field1339 = 0;

    @ObfuscatedName("ca.an")
    public static int field1336 = 0;

    @ObfuscatedName("ca.am")
    public static int field1341 = 0;

    @ObfuscatedName("ca.ar")
    public static int field1342 = 0;

    @ObfuscatedName("ca.ao")
    public static int field1343 = 0;

    @ObfuscatedName("ca.at")
    public static int field1337 = 10;

    @ObfuscatedName("ca.ac")
    public static String field1345 = "";

    @ObfuscatedName("ca.as")
    public static int field1346 = 0;

    @ObfuscatedName("ca.ah")
    public static String field1335 = "";

    @ObfuscatedName("ca.aw")
    public static String field1348 = "";

    @ObfuscatedName("ca.al")
    public static String field1349 = "";

    @ObfuscatedName("ca.aj")
    public static String field1350 = "";

    @ObfuscatedName("ca.ap")
    public static String field1351 = "";

    @ObfuscatedName("ca.ag")
    public static String field1340 = "";

    @ObfuscatedName("ca.af")
    public static boolean field1353 = false;

    @ObfuscatedName("ca.ad")
    public static boolean field1347 = false;

    @ObfuscatedName("ca.ba")
    public static boolean field1355 = false;

    @ObfuscatedName("ca.bc")
    public static boolean field1356 = true;

    @ObfuscatedName("ca.bb")
    public static int field1357 = 0;

    @ObfuscatedName("ca.bl")
    public static String field1358 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ca.bt")
    public static String field1354 = "1234567890";

    @ObfuscatedName("ca.by")
    public static boolean field1360 = false;

    @ObfuscatedName("ca.bp")
    public static int field1361 = -1;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.b(Lij;Lij;ZIB)V")
    public static void method105(class243 arg0, class243 arg1, boolean arg2, int arg3) {
        if (!Statics.field257) {
            field1346 = arg3;
            class291.method4667();
            byte[] var4 = arg0.method3850("title.jpg", "");
            Object var5 = null;
            class295 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class295(var9, var7, var8);
                    break label144;
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class295(0, 0);
            }
            Statics.field3293 = var11;
            Statics.field2911 = Statics.field3293.method4784();
            if ((client.field871 & 0x20000000) == 0) {
                Statics.field767 = class296.method979(arg1, "logo", "");
            } else {
                Statics.field767 = class296.method979(arg1, "logo_deadman_mode", "");
            }
            Statics.field1332 = class296.method979(arg1, "titlebox", "");
            Statics.field3712 = class296.method979(arg1, "titlebutton", "");
            Statics.field1333 = class296.method448(arg1, "runes", "");
            Statics.field3679 = class296.method448(arg1, "title_mute", "");
            Statics.field1352 = class296.method979(arg1, "options_radio_buttons,0", "");
            Statics.field3242 = class296.method979(arg1, "options_radio_buttons,4", "");
            Statics.field618 = class296.method979(arg1, "options_radio_buttons,2", "");
            Statics.field1454 = class296.method979(arg1, "options_radio_buttons,6", "");
            Statics.field289 = Statics.field1352.field3828;
            Statics.field2208 = Statics.field1352.field3826;
            Statics.field1266 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1266[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1266[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1266[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1266[var17 + 192] = 16777215;
            }
            Statics.field1331 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field1331[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field1331[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field1331[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field1331[var21 + 192] = 16777215;
            }
            Statics.field541 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field541[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field541[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field541[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field541[var25 + 192] = 16777215;
            }
            Statics.field759 = new int[256];
            Statics.field2209 = new int[32768];
            Statics.field1365 = new int[32768];
            method4157((class294) null);
            Statics.field313 = new int[32768];
            Statics.field1296 = new int[32768];
            if (arg2) {
                field1351 = "";
                field1340 = "";
            }
            Statics.field610 = 0;
            Statics.field539 = "";
            field1356 = true;
            field1360 = false;
            if (Statics.field801.field1231) {
                class211.field2586 = 1;
                Statics.field803 = null;
                Statics.field2587 = -1;
                Statics.field415 = -1;
                Statics.field2910 = 0;
                Statics.field2906 = false;
                Statics.field1953 = 2;
            } else {
                class245 var26 = Statics.field542;
                int var27 = var26.method3832("scape main");
                int var28 = var26.method3833(var27, "");
                class211.method661(2, var26, var27, var28, 255, false);
            }
            Statics.method5(false);
            Statics.field257 = true;
            field1362 = (Statics.field764 - 765) / 2;
            field1334 = field1362 + 202;
            Statics.field3427 = field1334 + 180;
            Statics.field3293.method4819(field1362, 0);
            Statics.field2911.method4819(field1362 + 382, 0);
            Statics.field767.method4778(field1362 + 382 - Statics.field767.field3828 / 2, 18);
        } else if (arg3 == 4) {
            field1346 = 4;
        }
    }

    @ObfuscatedName("bv.s(ZZI)Lks;")
    public static class294 method959(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1454 : Statics.field618) : (arg1 ? Statics.field3242 : Statics.field1352);
    }

    @ObfuscatedName("ao.r(I)Ljava/lang/String;")
    public static String method393() {
        String var6;
        if (Statics.field801.field1236) {
            String var0 = field1351;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1351;
        }
        return var6;
    }

    @ObfuscatedName("bp.g(I)V")
    public static void method940() {
        if (!Statics.field257) {
            return;
        }
        Statics.field1332 = null;
        Statics.field3712 = null;
        Statics.field1333 = null;
        Statics.field3293 = null;
        Statics.field2911 = null;
        Statics.field767 = null;
        Statics.field3679 = null;
        Statics.field1352 = null;
        Statics.field618 = null;
        Statics.field2677 = null;
        Statics.field1830 = null;
        Statics.field2041 = null;
        Statics.field528 = null;
        Statics.field308 = null;
        Statics.field1266 = null;
        Statics.field1331 = null;
        Statics.field541 = null;
        Statics.field759 = null;
        Statics.field2209 = null;
        Statics.field1365 = null;
        Statics.field313 = null;
        Statics.field1296 = null;
        class211.method1679(2);
        Statics.method5(true);
        Statics.field257 = false;
    }

    @ObfuscatedName("by.x(I)V")
    public static void method887() {
        if (field1353 && field1351 != null && field1351.length() > 0) {
            field1357 = 1;
        } else {
            field1357 = 0;
        }
    }

    @ObfuscatedName("cd.f(Lbt;I)V")
    public static void method1551(class59 arg0) {
        if (field1360) {
            method51(arg0);
            return;
        }
        if ((class60.field688 == 1 || !Statics.field2143 && class60.field688 == 4) && class60.field675 >= field1362 + 765 - 50 && class60.field689 >= 453) {
            Statics.field801.field1231 = !Statics.field801.field1231;
            class81.method842();
            if (Statics.field801.field1231) {
                class211.method290();
            } else {
                class211.method154(Statics.field542, "scape main", "", 255, false);
            }
        }
        if (client.field870 == 5) {
            return;
        }
        field1342++;
        if (client.field870 != 10 && client.field870 != 11) {
            return;
        }
        if (client.field1092 == 0) {
            if (class60.field688 == 1 || !Statics.field2143 && class60.field688 == 4) {
                int var1 = field1362 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class60.field675 >= var1 && class60.field675 <= var1 + var3 && class60.field689 >= var2 && class60.field689 <= var2 + var4) {
                    method915();
                    return;
                }
            }
            if (Statics.field1572 != null) {
                method915();
            }
        }
        int var5 = class60.field688;
        int var6 = class60.field675;
        int var7 = class60.field689;
        if (var5 == 0) {
            var6 = class60.field682;
            var7 = class60.field677;
        }
        if (!Statics.field2143 && var5 == 4) {
            var5 = 1;
        }
        if (field1346 == 0) {
            boolean var8 = false;
            while (class51.method4004()) {
                if (Statics.field1427 == 84) {
                    var8 = true;
                }
            }
            int var9 = Statics.field3427 - 80;
            short var10 = 291;
            if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                label665: {
                    String var11 = client.method2889("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var11));
                            break label665;
                        } catch (Exception var46) {
                        }
                    }
                    if (class57.field630.startsWith("win")) {
                        class57.method1447(var11, 0);
                    } else if (class57.field630.startsWith("mac")) {
                        class57.method917(var11, 1, "openjs");
                    } else {
                        class57.method1447(var11, 2);
                    }
                }
            }
            int var13 = Statics.field3427 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20 || var8) {
                if ((client.field871 & 0x2000000) != 0) {
                    field1335 = "";
                    field1348 = class233.field3141;
                    field1349 = class233.field3015;
                    field1350 = class233.field3143;
                    field1346 = 1;
                    method887();
                } else if ((client.field871 & 0x4) != 0) {
                    if ((client.field871 & 0x400) == 0) {
                        field1348 = class233.field3132;
                        field1349 = class233.field3102;
                        field1350 = class233.field3134;
                    } else {
                        field1348 = class233.field3138;
                        field1349 = class233.field3139;
                        field1350 = class233.field2963;
                    }
                    field1335 = class233.field2934;
                    field1346 = 1;
                    method887();
                } else if ((client.field871 & 0x400) == 0) {
                    method138(false);
                } else {
                    field1348 = class233.field3135;
                    field1349 = class233.field3136;
                    field1350 = class233.field3137;
                    field1335 = class233.field2934;
                    field1346 = 1;
                    method887();
                }
            }
        } else if (field1346 == 1) {
            while (class51.method4004()) {
                if (Statics.field1427 == 84) {
                    method138(false);
                } else if (Statics.field1427 == 13) {
                    field1346 = 0;
                }
            }
            int var14 = Statics.field3427 - 80;
            short var15 = 321;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                method138(false);
            }
            int var16 = Statics.field3427 + 80;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                field1346 = 0;
            }
        } else if (field1346 == 2) {
            short var17 = 201;
            int var47 = var17 + 52;
            if (var5 == 1 && var7 >= var47 - 12 && var7 < var47 + 2) {
                field1357 = 0;
            }
            var47 += 15;
            if (var5 == 1 && var7 >= var47 - 12 && var7 < var47 + 2) {
                field1357 = 1;
            }
            var47 += 15;
            short var18 = 361;
            if (var5 == 1 && var7 >= var18 - 15 && var7 < var18) {
                method15(class233.field3169, class233.field3170, class233.field3171);
                field1346 = 5;
                return;
            }
            int var19 = Statics.field3427 - 80;
            short var20 = 321;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var20 - 20 && var7 <= var20 + 20) {
                field1351 = field1351.trim();
                if (field1351.length() == 0) {
                    method15(class233.field3034, class233.field3011, class233.field3036);
                    return;
                }
                if (field1340.length() == 0) {
                    method15(class233.field2937, class233.field3152, class233.field3039);
                    return;
                }
                method15(class233.field3146, class233.field3121, class233.field3148);
                Statics.method163(false);
                client.method2(20);
                return;
            }
            int var21 = field1334 + 180 + 80;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var20 - 20 && var7 <= var20 + 20) {
                field1346 = 0;
                field1351 = "";
                field1340 = "";
                Statics.field610 = 0;
                Statics.field539 = "";
                field1356 = true;
            }
            int var22 = Statics.field3427 + -117;
            short var23 = 277;
            field1347 = var6 >= var22 && var6 < Statics.field289 + var22 && var7 >= var23 && var7 < Statics.field2208 + var23;
            if (var5 == 1 && field1347) {
                field1353 = !field1353;
                if (!field1353 && Statics.field801.field1233 != null) {
                    Statics.field801.field1233 = null;
                    class81.method842();
                }
            }
            int var24 = Statics.field3427 + 24;
            short var25 = 277;
            field1355 = var6 >= var24 && var6 < Statics.field289 + var24 && var7 >= var25 && var7 < Statics.field2208 + var25;
            if (var5 == 1 && field1355) {
                Statics.field801.field1236 = !Statics.field801.field1236;
                if (!Statics.field801.field1236) {
                    field1351 = "";
                    Statics.field801.field1233 = null;
                    method887();
                }
                class81.method842();
            }
            while (true) {
                while (class51.method4004()) {
                    boolean var26 = false;
                    for (int var27 = 0; var27 < field1358.length(); var27++) {
                        if (Statics.field3201 == field1358.charAt(var27)) {
                            var26 = true;
                            break;
                        }
                    }
                    if (Statics.field1427 == 13) {
                        field1346 = 0;
                        field1351 = "";
                        field1340 = "";
                        Statics.field610 = 0;
                        Statics.field539 = "";
                        field1356 = true;
                    } else if (field1357 == 0) {
                        if (Statics.field1427 == 85 && field1351.length() > 0) {
                            field1351 = field1351.substring(0, field1351.length() - 1);
                        }
                        if (Statics.field1427 == 84 || Statics.field1427 == 80) {
                            field1357 = 1;
                        }
                        if (var26 && field1351.length() < 320) {
                            field1351 = field1351 + Statics.field3201;
                        }
                    } else if (field1357 == 1) {
                        if (Statics.field1427 == 85 && field1340.length() > 0) {
                            field1340 = field1340.substring(0, field1340.length() - 1);
                        }
                        if (Statics.field1427 == 84 || Statics.field1427 == 80) {
                            field1357 = 0;
                        }
                        if (Statics.field1427 == 84) {
                            field1351 = field1351.trim();
                            if (field1351.length() == 0) {
                                method15(class233.field3034, class233.field3011, class233.field3036);
                                return;
                            }
                            if (field1340.length() == 0) {
                                method15(class233.field2937, class233.field3152, class233.field3039);
                                return;
                            }
                            method15(class233.field3146, class233.field3121, class233.field3148);
                            Statics.method163(false);
                            client.method2(20);
                            return;
                        }
                        if (var26 && field1340.length() < 20) {
                            field1340 = field1340 + Statics.field3201;
                        }
                    }
                }
                return;
            }
        } else if (field1346 == 3) {
            int var28 = field1334 + 180;
            short var29 = 276;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var29 - 20 && var7 <= var29 + 20) {
                method138(false);
            }
            int var30 = field1334 + 180;
            short var31 = 326;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method15(class233.field3169, class233.field3170, class233.field3171);
                field1346 = 5;
                return;
            }
        } else if (field1346 == 4) {
            int var32 = field1334 + 180 - 80;
            short var33 = 321;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                Statics.field539.trim();
                if (Statics.field539.length() != 6) {
                    method15(class233.field2953, class233.field2954, class233.field3195);
                    return;
                }
                Statics.field610 = Integer.parseInt(Statics.field539);
                Statics.field539 = "";
                Statics.method163(true);
                method15(class233.field3146, class233.field3121, class233.field3148);
                client.method2(20);
                return;
            }
            if (var5 == 1 && var6 >= field1334 + 180 - 9 && var6 <= field1334 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field1356 = !field1356;
            }
            if (var5 == 1 && var6 >= field1334 + 180 - 34 && var6 <= field1334 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                label678: {
                    String var34 = client.method2889("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var34));
                            break label678;
                        } catch (Exception var45) {
                        }
                    }
                    if (class57.field630.startsWith("win")) {
                        class57.method1447(var34, 0);
                    } else if (class57.field630.startsWith("mac")) {
                        class57.method917(var34, 1, "openjs");
                    } else {
                        class57.method1447(var34, 2);
                    }
                }
            }
            int var36 = field1334 + 180 + 80;
            if (var5 == 1 && var6 >= var36 - 75 && var6 <= var36 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                field1346 = 0;
                field1351 = "";
                field1340 = "";
                Statics.field610 = 0;
                Statics.field539 = "";
            }
            while (class51.method4004()) {
                boolean var37 = false;
                for (int var38 = 0; var38 < field1354.length(); var38++) {
                    if (Statics.field3201 == field1354.charAt(var38)) {
                        var37 = true;
                        break;
                    }
                }
                if (Statics.field1427 == 13) {
                    field1346 = 0;
                    field1351 = "";
                    field1340 = "";
                    Statics.field610 = 0;
                    Statics.field539 = "";
                } else {
                    if (Statics.field1427 == 85 && Statics.field539.length() > 0) {
                        Statics.field539 = Statics.field539.substring(0, Statics.field539.length() - 1);
                    }
                    if (Statics.field1427 == 84) {
                        Statics.field539.trim();
                        if (Statics.field539.length() != 6) {
                            method15(class233.field2953, class233.field2954, class233.field3195);
                            return;
                        }
                        Statics.field610 = Integer.parseInt(Statics.field539);
                        Statics.field539 = "";
                        Statics.method163(true);
                        method15(class233.field3146, class233.field3121, class233.field3148);
                        client.method2(20);
                        return;
                    }
                    if (var37 && Statics.field539.length() < 6) {
                        Statics.field539 = Statics.field539 + Statics.field3201;
                    }
                }
            }
        } else if (field1346 == 5) {
            int var39 = field1334 + 180 - 80;
            short var40 = 321;
            if (var5 == 1 && var6 >= var39 - 75 && var6 <= var39 + 75 && var7 >= var40 - 20 && var7 <= var40 + 20) {
                method144();
                return;
            }
            int var41 = field1334 + 180 + 80;
            if (var5 == 1 && var6 >= var41 - 75 && var6 <= var41 + 75 && var7 >= var40 - 20 && var7 <= var40 + 20) {
                method138(true);
            }
            while (class51.method4004()) {
                boolean var42 = false;
                for (int var43 = 0; var43 < field1358.length(); var43++) {
                    if (Statics.field3201 == field1358.charAt(var43)) {
                        var42 = true;
                        break;
                    }
                }
                if (Statics.field1427 == 13) {
                    method138(true);
                } else {
                    if (Statics.field1427 == 85 && field1351.length() > 0) {
                        field1351 = field1351.substring(0, field1351.length() - 1);
                    }
                    if (Statics.field1427 == 84) {
                        method144();
                        return;
                    }
                    if (var42 && field1351.length() < 320) {
                        field1351 = field1351 + Statics.field3201;
                    }
                }
            }
        } else if (field1346 == 6) {
            while (true) {
                do {
                    if (!class51.method4004()) {
                        short var44 = 321;
                        if (var5 == 1 && var7 >= var44 - 20 && var7 <= var44 + 20) {
                            method138(true);
                        }
                        return;
                    }
                } while (Statics.field1427 != 84 && Statics.field1427 != 13);
                method138(true);
            }
        }
    }

    @ObfuscatedName("i.u(ZI)V")
    public static void method138(boolean arg0) {
        field1348 = class233.field3128;
        field1349 = class233.field3129;
        field1350 = class233.field2952;
        field1346 = 2;
        if (arg0) {
            field1340 = "";
        }
        if (field1351 == null || field1351.length() <= 0) {
            if (Statics.field801.field1233 == null) {
                field1353 = false;
            } else {
                field1351 = Statics.field801.field1233;
                field1353 = true;
            }
        }
        method887();
    }

    @ObfuscatedName("l.t(I)V")
    public static void method144() {
        field1351 = field1351.trim();
        if (field1351.length() == 0) {
            method15(class233.field3169, class233.field3170, class233.field3171);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2889("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2495, var4.field2488, 1000 - var4.field2488);
                if (var5 == -1) {
                    var4.field2488 = 0;
                    long var8 = var4.method2951();
                    var6 = var8;
                    break;
                }
                var4.field2488 += var5;
                if (var4.field2488 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var51) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1351;
            Random var15 = new Random();
            class181 var16 = new class181(128);
            class181 var17 = new class181(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2929(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2977(var15.nextInt());
            }
            var16.method2977(var18[0]);
            var16.method2977(var18[1]);
            var16.method2934(var6);
            var16.method2934(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2977(var15.nextInt());
            }
            var16.method3142(class87.field1291, class87.field1294);
            var17.method2929(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2977(var15.nextInt());
            }
            var17.method2934(var15.nextLong());
            var17.method3108(var15.nextLong());
            client.method3808(var17);
            var17.method2934(var15.nextLong());
            var17.method3142(class87.field1291, class87.field1294);
            int var22 = class181.method157(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class181 var23 = new class181(var22);
            var23.method2936(var14);
            var23.field2488 = var22;
            var23.method3145(var18);
            class181 var24 = new class181(var23.field2488 + var17.field2488 + var16.field2488 + 5);
            var24.method2929(2);
            var24.method2929(var16.field2488);
            var24.method2939(var16.field2495, 0, var16.field2488);
            var24.method2929(var17.field2488);
            var24.method2939(var17.field2495, 0, var17.field2488);
            var24.method2930(var23.field2488);
            var24.method2939(var23.field2495, 0, var23.field2488);
            byte[] var25 = var24.field2495;
            int var26 = var25.length;
            StringBuilder var27 = new StringBuilder();
            for (int var28 = 0; var28 < var26; var28 += 3) {
                int var29 = var25[var28] & 0xFF;
                var27.append(class277.field3725[var29 >>> 2]);
                if (var28 < var26 - 1) {
                    int var30 = var25[var28 + 1] & 0xFF;
                    var27.append(class277.field3725[(var29 & 0x3) << 4 | var30 >>> 4]);
                    if (var28 < var26 - 2) {
                        int var31 = var25[var28 + 2] & 0xFF;
                        var27.append(class277.field3725[(var30 & 0xF) << 2 | var31 >>> 6]).append(class277.field3725[var31 & 0x3F]);
                    } else {
                        var27.append(class277.field3725[(var30 & 0xF) << 2]).append("=");
                    }
                } else {
                    var27.append(class277.field3725[(var29 & 0x3) << 4]).append("==");
                }
            }
            String var32 = var27.toString();
            String var34 = var32;
            byte var41;
            try {
                URL var35 = new URL(client.method2889("services", false) + "m=accountappeal/login.ws");
                URLConnection var36 = var35.openConnection();
                var36.setDoInput(true);
                var36.setDoOutput(true);
                var36.setConnectTimeout(5000);
                OutputStreamWriter var37 = new OutputStreamWriter(var36.getOutputStream());
                var37.write("data2=" + class303.method2722(var34) + "&dest=" + class303.method2722("passwordchoice.ws"));
                var37.flush();
                InputStream var38 = var36.getInputStream();
                class181 var39 = new class181(new byte[1000]);
                while (true) {
                    int var40 = var38.read(var39.field2495, var39.field2488, 1000 - var39.field2488);
                    if (var40 == -1) {
                        var37.close();
                        var38.close();
                        String var42 = new String(var39.field2495);
                        if (var42.startsWith("OFFLINE")) {
                            var41 = 4;
                        } else if (var42.startsWith("WRONG")) {
                            var41 = 7;
                        } else if (var42.startsWith("RELOAD")) {
                            var41 = 3;
                        } else if (var42.startsWith("Not permitted for social network accounts.")) {
                            var41 = 6;
                        } else {
                            var39.method2963(var18);
                            while (var39.field2488 > 0 && var39.field2495[var39.field2488 - 1] == 0) {
                                var39.field2488--;
                            }
                            String var43 = new String(var39.field2495, 0, var39.field2488);
                            boolean var44;
                            if (var43 == null) {
                                var44 = false;
                            } else {
                                label135: {
                                    try {
                                        new URL(var43);
                                    } catch (MalformedURLException var49) {
                                        var44 = false;
                                        break label135;
                                    }
                                    var44 = true;
                                }
                            }
                            if (var44) {
                                label130: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var43));
                                            break label130;
                                        } catch (Exception var48) {
                                        }
                                    }
                                    if (class57.field630.startsWith("win")) {
                                        class57.method1447(var43, 0);
                                    } else if (class57.field630.startsWith("mac")) {
                                        class57.method917(var43, 1, "openjs");
                                    } else {
                                        class57.method1447(var43, 2);
                                    }
                                }
                                var41 = 2;
                            } else {
                                var41 = 5;
                            }
                        }
                        break;
                    }
                    var39.field2488 += var40;
                    if (var39.field2488 >= 1000) {
                        var41 = 5;
                        break;
                    }
                }
            } catch (Throwable var50) {
                var50.printStackTrace();
                var41 = 5;
            }
            var13 = var41;
        }
        switch(var13) {
            case 2:
                method15(class233.field3172, class233.field3176, class233.field3090);
                field1346 = 6;
                break;
            case 3:
                method15(class233.field3175, class233.field2982, class233.field3177);
                break;
            case 4:
                method15(class233.field3178, class233.field3179, class233.field3180);
                break;
            case 5:
                method15(class233.field3181, class233.field3182, class233.field3057);
                break;
            case 6:
                method15(class233.field3184, class233.field3185, class233.field3186);
                break;
            case 7:
                method15(class233.field3187, class233.field3188, class233.field3189);
        }
    }

    @ObfuscatedName("c.k(Ljn;Ljn;Ljn;ZI)V")
    public static void method115(class271 arg0, class271 arg1, class271 arg2, boolean arg3) {
        if (arg3) {
            field1362 = (Statics.field764 - 765) / 2;
            field1334 = field1362 + 202;
            Statics.field3427 = field1334 + 180;
        }
        if (field1360) {
            if (Statics.field2677 == null) {
                Statics.field2677 = class296.method524(Statics.field2134, "sl_back", "");
            }
            if (Statics.field1830 == null) {
                Statics.field1830 = class296.method448(Statics.field2134, "sl_flags", "");
            }
            if (Statics.field2041 == null) {
                Statics.field2041 = class296.method448(Statics.field2134, "sl_arrows", "");
            }
            if (Statics.field528 == null) {
                Statics.field528 = class296.method448(Statics.field2134, "sl_stars", "");
            }
            class291.method4671(field1362, 23, 765, 480, 0);
            class291.method4691(field1362, 0, 125, 23, 12425273, 9135624);
            class291.method4691(field1362 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4467(class233.field3190, field1362 + 62, 15, 0, -1);
            if (Statics.field528 != null) {
                Statics.field528[1].method4778(field1362 + 140, 1);
                arg1.method4464(class233.field3191, field1362 + 152, 10, 16777215, -1);
                Statics.field528[0].method4778(field1362 + 140, 12);
                arg1.method4464(class233.field3192, field1362 + 152, 21, 16777215, -1);
            }
            if (Statics.field2041 != null) {
                int var4 = field1362 + 280;
                if (class80.field1212[0] == 0 && class80.field1218[0] == 0) {
                    Statics.field2041[2].method4778(var4, 4);
                } else {
                    Statics.field2041[0].method4778(var4, 4);
                }
                if (class80.field1212[0] == 0 && class80.field1218[0] == 1) {
                    Statics.field2041[3].method4778(var4 + 15, 4);
                } else {
                    Statics.field2041[1].method4778(var4 + 15, 4);
                }
                arg0.method4464(class233.field3193, var4 + 32, 17, 16777215, -1);
                int var5 = field1362 + 390;
                if (class80.field1212[0] == 1 && class80.field1218[0] == 0) {
                    Statics.field2041[2].method4778(var5, 4);
                } else {
                    Statics.field2041[0].method4778(var5, 4);
                }
                if (class80.field1212[0] == 1 && class80.field1218[0] == 1) {
                    Statics.field2041[3].method4778(var5 + 15, 4);
                } else {
                    Statics.field2041[1].method4778(var5 + 15, 4);
                }
                arg0.method4464(class233.field3070, var5 + 32, 17, 16777215, -1);
                int var6 = field1362 + 500;
                if (class80.field1212[0] == 2 && class80.field1218[0] == 0) {
                    Statics.field2041[2].method4778(var6, 4);
                } else {
                    Statics.field2041[0].method4778(var6, 4);
                }
                if (class80.field1212[0] == 2 && class80.field1218[0] == 1) {
                    Statics.field2041[3].method4778(var6 + 15, 4);
                } else {
                    Statics.field2041[1].method4778(var6 + 15, 4);
                }
                arg0.method4464(class233.field2988, var6 + 32, 17, 16777215, -1);
                int var7 = field1362 + 610;
                if (class80.field1212[0] == 3 && class80.field1218[0] == 0) {
                    Statics.field2041[2].method4778(var7, 4);
                } else {
                    Statics.field2041[0].method4778(var7, 4);
                }
                if (class80.field1212[0] == 3 && class80.field1218[0] == 1) {
                    Statics.field2041[3].method4778(var7 + 15, 4);
                } else {
                    Statics.field2041[1].method4778(var7 + 15, 4);
                }
                arg0.method4464(class233.field3196, var7 + 32, 17, 16777215, -1);
            }
            class291.method4671(field1362 + 708, 4, 50, 16, 0);
            arg1.method4467(class233.field3156, field1362 + 708 + 25, 16, 16777215, -1);
            field1361 = -1;
            if (Statics.field2677 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class80.field1216) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1216) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1216) {
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
                int var19 = field1362 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class80.field1216; var22++) {
                    class80 var23 = Statics.field623[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1222);
                    if (var23.field1222 == -1) {
                        var25 = class233.field2987;
                        var24 = false;
                    } else if (var23.field1222 > 1980) {
                        var25 = class233.field3131;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1407()) {
                        if (var23.method1402()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1406()) {
                        var26 = 16711680;
                        if (var23.method1402()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1405()) {
                        if (var23.method1402()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1402()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field682 >= var19 && class60.field677 >= var18 && class60.field682 < var8 + var19 && class60.field677 < var9 + var18 && var24) {
                        field1361 = var22;
                        Statics.field2677[var27].method4817(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field2677[var27].method4819(var19, var18);
                    }
                    if (Statics.field1830 != null) {
                        Statics.field1830[(var23.method1402() ? 8 : 0) + var23.field1215].method4778(var19 + 29, var18);
                    }
                    arg0.method4467(Integer.toString(var23.field1220), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4467(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4482(Statics.field623[field1361].field1227) + 6;
                    int var29 = arg1.field3692 + 8;
                    class291.method4671(class60.field682 - var28 / 2, class60.field677 + 20 + 5, var28, var29, 16777120);
                    class291.method4678(class60.field682 - var28 / 2, class60.field677 + 20 + 5, var28, var29, 0);
                    arg1.method4467(Statics.field623[field1361].field1227, class60.field682, class60.field677 + 20 + 5 + arg1.field3692 + 4, 0, -1);
                }
            }
            Statics.field3228.method704(0, 0);
            return;
        }
        if (arg3) {
            Statics.field3293.method4819(field1362, 0);
            Statics.field2911.method4819(field1362 + 382, 0);
            Statics.field767.method4778(field1362 + 382 - Statics.field767.field3828 / 2, 18);
        }
        if (client.field870 == 0 || client.field870 == 5) {
            byte var30 = 20;
            arg0.method4467(class233.field3127, field1334 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class291.method4678(field1334 + 180 - 152, var31, 304, 34, 9179409);
            class291.method4678(field1334 + 180 - 151, var31 + 1, 302, 32, 0);
            class291.method4671(field1334 + 180 - 150, var31 + 2, field1337 * 3, 30, 9179409);
            class291.method4671(field1337 * 3 + (field1334 + 180 - 150), var31 + 2, 300 - field1337 * 3, 30, 0);
            arg0.method4467(field1345, field1334 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field870 == 20) {
            Statics.field1332.method4778(field1334 + 180 - Statics.field1332.field3828 / 2, 271 - Statics.field1332.field3826 / 2);
            short var32 = 201;
            arg0.method4467(field1348, field1334 + 180, var32, 16776960, 0);
            int var106 = var32 + 15;
            arg0.method4467(field1349, field1334 + 180, var106, 16776960, 0);
            int var107 = var106 + 15;
            arg0.method4467(field1350, field1334 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            int var109 = var108 + 7;
            if (field1346 != 4) {
                arg0.method4464(class233.field3149, field1334 + 180 - 110, var109, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = method393(); arg0.method4482(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4464(class272.method4463(var34), field1334 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                String var36 = class233.field3150;
                String var37 = field1340;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                arg0.method4464(var36 + var41, field1334 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
            }
        }
        if (client.field870 == 10 || client.field870 == 11) {
            Statics.field1332.method4778(field1334, 171);
            if (field1346 == 0) {
                short var43 = 251;
                arg0.method4467(class233.field3119, field1334 + 180, var43, 16776960, 0);
                int var110 = var43 + 30;
                int var44 = field1334 + 180 - 80;
                short var45 = 291;
                Statics.field3712.method4778(var44 - 73, var45 - 20);
                arg0.method4468(class233.field2960, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field1334 + 180 + 80;
                Statics.field3712.method4778(var46 - 73, var45 - 20);
                arg0.method4468(class233.field3062, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1346 == 1) {
                arg0.method4467(field1335, field1334 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method4467(field1348, field1334 + 180, var47, 16777215, 0);
                int var111 = var47 + 15;
                arg0.method4467(field1349, field1334 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                arg0.method4467(field1350, field1334 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                int var48 = field1334 + 180 - 80;
                short var49 = 321;
                Statics.field3712.method4778(var48 - 73, var49 - 20);
                arg0.method4467(class233.field2923, var48, var49 + 5, 16777215, 0);
                int var50 = field1334 + 180 + 80;
                Statics.field3712.method4778(var50 - 73, var49 - 20);
                arg0.method4467(class233.field3156, var50, var49 + 5, 16777215, 0);
            } else if (field1346 == 2) {
                short var51 = 201;
                arg0.method4467(field1348, Statics.field3427, var51, 16776960, 0);
                int var114 = var51 + 15;
                arg0.method4467(field1349, Statics.field3427, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg0.method4467(field1350, Statics.field3427, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var117 = var116 + 7;
                arg0.method4464(class233.field3149, Statics.field3427 - 110, var117, 16777215, 0);
                short var52 = 200;
                String var53;
                for (var53 = method393(); arg0.method4482(var53) > var52; var53 = var53.substring(1)) {
                }
                arg0.method4464(class272.method4463(var53) + (field1357 == 0 & client.field872 % 40 < 20 ? class88.method3736(16776960) + class88.field1308 : ""), Statics.field3427 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                String var55 = class233.field3150;
                String var56 = field1340;
                int var57 = var56.length();
                char[] var58 = new char[var57];
                for (int var59 = 0; var59 < var57; var59++) {
                    var58[var59] = '*';
                }
                String var60 = new String(var58);
                arg0.method4464(var55 + var60 + (field1357 == 1 & client.field872 % 40 < 20 ? class88.method3736(16776960) + class88.field1308 : ""), Statics.field3427 - 108, var114, 16777215, 0);
                var114 += 15;
                short var62 = 277;
                int var63 = Statics.field3427 + -117;
                class294 var64 = method959(field1353, field1347);
                var64.method4778(var63, var62);
                int var65 = var64.field3828 + 5 + var63;
                arg1.method4464(class233.field3157, var65, var62 + 13, 16776960, 0);
                int var66 = Statics.field3427 + 24;
                class294 var67 = method959(Statics.field801.field1236, field1355);
                var67.method4778(var66, var62);
                int var68 = var67.field3828 + 5 + var66;
                arg1.method4464(class233.field3158, var68, var62 + 13, 16776960, 0);
                int var118 = var62 + 15;
                int var69 = Statics.field3427 - 80;
                short var70 = 321;
                Statics.field3712.method4778(var69 - 73, var70 - 20);
                arg0.method4467(class233.field3155, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field3427 + 80;
                Statics.field3712.method4778(var71 - 73, var70 - 20);
                arg0.method4467(class233.field3156, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                arg1.method4467(class233.field3164, Statics.field3427, var72, 16776960, 0);
            } else if (field1346 == 3) {
                short var73 = 201;
                arg0.method4467(class233.field3159, field1334 + 180, var73, 16776960, 0);
                int var119 = var73 + 20;
                arg1.method4467(class233.field3160, field1334 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                arg1.method4467(class233.field3161, field1334 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                int var74 = field1334 + 180;
                short var75 = 276;
                Statics.field3712.method4778(var74 - 73, var75 - 20);
                arg2.method4467(class233.field3061, var74, var75 + 5, 16777215, 0);
                int var76 = field1334 + 180;
                short var77 = 326;
                Statics.field3712.method4778(var76 - 73, var77 - 20);
                arg2.method4467(class233.field3163, var76, var77 + 5, 16777215, 0);
            } else if (field1346 == 4) {
                arg0.method4467(class233.field2978, field1334 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method4467(field1348, field1334 + 180, var78, 16777215, 0);
                int var122 = var78 + 15;
                arg0.method4467(field1349, field1334 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method4467(field1350, field1334 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                String var80 = class233.field3151;
                String var81 = Statics.field539;
                int var82 = var81.length();
                char[] var83 = new char[var82];
                for (int var84 = 0; var84 < var82; var84++) {
                    var83[var84] = '*';
                }
                String var85 = new String(var83);
                arg0.method4464(var80 + var85 + (client.field872 % 40 < 20 ? class88.method3736(16776960) + class88.field1308 : ""), field1334 + 180 - 108, var124, 16777215, 0);
                var122 = var124 - 8;
                arg0.method4464(class233.field2925, field1334 + 180 - 9, var122, 16776960, 0);
                var122 += 15;
                arg0.method4464(class233.field2926, field1334 + 180 - 9, var122, 16776960, 0);
                int var87 = field1334 + 180 - 9 + arg0.method4482(class233.field2926) + 15;
                int var88 = var122 - arg0.field3692;
                class294 var89;
                if (field1356) {
                    var89 = Statics.field618;
                } else {
                    var89 = Statics.field1352;
                }
                var89.method4778(var87, var88);
                var122 += 15;
                int var90 = field1334 + 180 - 80;
                short var91 = 321;
                Statics.field3712.method4778(var90 - 73, var91 - 20);
                arg0.method4467(class233.field2923, var90, var91 + 5, 16777215, 0);
                int var92 = field1334 + 180 + 80;
                Statics.field3712.method4778(var92 - 73, var91 - 20);
                arg0.method4467(class233.field3156, var92, var91 + 5, 16777215, 0);
                arg1.method4467(class233.field3002, field1334 + 180, var91 + 36, 255, 0);
            } else if (field1346 == 5) {
                arg0.method4467(class233.field3174, field1334 + 180, 201, 16776960, 0);
                short var93 = 221;
                arg2.method4467(field1348, field1334 + 180, var93, 16776960, 0);
                int var125 = var93 + 15;
                arg2.method4467(field1349, field1334 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg2.method4467(field1350, field1334 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var128 = var127 + 14;
                arg0.method4464(class233.field3113, field1334 + 180 - 145, var128, 16777215, 0);
                short var94 = 174;
                String var95;
                for (var95 = method393(); arg0.method4482(var95) > var94; var95 = var95.substring(1)) {
                }
                arg0.method4464(class272.method4463(var95) + (client.field872 % 40 < 20 ? class88.method3736(16776960) + class88.field1308 : ""), field1334 + 180 - 34, var128, 16777215, 0);
                var125 = var128 + 15;
                int var96 = field1334 + 180 - 80;
                short var97 = 321;
                Statics.field3712.method4778(var96 - 73, var97 - 20);
                arg0.method4467(class233.field3165, var96, var97 + 5, 16777215, 0);
                int var98 = field1334 + 180 + 80;
                Statics.field3712.method4778(var98 - 73, var97 - 20);
                arg0.method4467(class233.field3168, var98, var97 + 5, 16777215, 0);
            } else if (field1346 == 6) {
                short var99 = 201;
                arg0.method4467(field1348, field1334 + 180, var99, 16776960, 0);
                int var129 = var99 + 15;
                arg0.method4467(field1349, field1334 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                arg0.method4467(field1350, field1334 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                int var100 = field1334 + 180;
                short var101 = 321;
                Statics.field3712.method4778(var100 - 73, var101 - 20);
                arg0.method4467(class233.field3168, var100, var101 + 5, 16777215, 0);
            }
        }
        if (field1342 > 0) {
            method3653(field1342);
            field1342 = 0;
        }
        method2842();
        Statics.field3679[Statics.field801.field1231 ? 1 : 0].method4778(field1362 + 765 - 40, 463);
        if (client.field870 <= 5 || client.field1092 != 0) {
            return;
        }
        if (Statics.field308 == null) {
            Statics.field308 = class296.method979(Statics.field2134, "sl_button", "");
            return;
        }
        int var102 = field1362 + 5;
        short var103 = 463;
        byte var104 = 100;
        byte var105 = 35;
        Statics.field308.method4778(var102, var103);
        arg0.method4467(class233.field3082 + " " + client.field940, var104 / 2 + var102, var105 / 2 + var103 - 2, 16777215, 0);
        if (Statics.field1572 == null) {
            arg1.method4467(class233.field2917, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
        } else {
            arg1.method4467(class233.field3199, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("x.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method15(String arg0, String arg1, String arg2) {
        field1348 = arg0;
        field1349 = arg1;
        field1350 = arg2;
    }

    @ObfuscatedName("in.d(Lks;B)V")
    public static final void method4157(class294 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2209.length; var2++) {
            Statics.field2209[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2209[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1365[var8] = (Statics.field2209[var8 - 1] + Statics.field2209[var8 + 1] + Statics.field2209[var8 - 128] + Statics.field2209[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2209;
            Statics.field2209 = Statics.field1365;
            Statics.field1365 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3826; var11++) {
            for (int var12 = 0; var12 < arg0.field3828; var12++) {
                if (arg0.field3833[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3832;
                    int var14 = var11 + 16 + arg0.field3829;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2209[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ho.o(II)V")
    public static final void method3653(int arg0) {
        short var1 = 256;
        field1336 += arg0 * 128;
        if (field1336 > Statics.field2209.length) {
            field1336 -= Statics.field2209.length;
            int var2 = (int) (Math.random() * 12.0D);
            method4157(Statics.field1333[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field313[var3 + var4] - Statics.field2209[field1336 + var3 & Statics.field2209.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field313[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field313[var9 + var10] = 255;
                } else {
                    Statics.field313[var9 + var10] = 0;
                }
            }
        }
        if (field1338 > 0) {
            field1338 -= arg0 * 4;
        }
        if (field1339 > 0) {
            field1339 -= arg0 * 4;
        }
        if (field1338 == 0 && field1339 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1338 = 1024;
            }
            if (var12 == 1) {
                field1339 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1359[var13] = field1359[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1359[var14] = (int) (Math.sin((double) field1343 / 14.0D) * 16.0D + Math.sin((double) field1343 / 15.0D) * 14.0D + Math.sin((double) field1343 / 16.0D) * 12.0D);
            field1343++;
        }
        field1341 += arg0 * -553968635;
        int var15 = ((client.field872 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1341 * 1934856212; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field313[(var18 << 7) + var17] = 192;
        }
        field1341 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field313[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field313[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1296[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1296[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1296[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field313[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("h.a(IIII)I")
    public static final int method104(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fr.q(I)V")
    public static final void method2842() {
        short var0 = 256;
        if (field1338 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1338 > 768) {
                    Statics.field759[var1] = method104(Statics.field1266[var1], Statics.field1331[var1], 1024 - field1338);
                } else if (field1338 > 256) {
                    Statics.field759[var1] = Statics.field1331[var1];
                } else {
                    Statics.field759[var1] = method104(Statics.field1331[var1], Statics.field1266[var1], 256 - field1338);
                }
            }
        } else if (field1339 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1339 > 768) {
                    Statics.field759[var2] = method104(Statics.field1266[var2], Statics.field541[var2], 1024 - field1339);
                } else if (field1339 > 256) {
                    Statics.field759[var2] = Statics.field541[var2];
                } else {
                    Statics.field759[var2] = method104(Statics.field541[var2], Statics.field1266[var2], 256 - field1339);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field759[var3] = Statics.field1266[var3];
            }
        }
        class291.method4712(field1362, 9, field1362 + 128, var0 + 7);
        Statics.field3293.method4819(field1362, 0);
        class291.method4662();
        int var4 = 0;
        int var5 = field1362 + Statics.field3228.field3814 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1359[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field313[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field759[var10];
                    int var14 = Statics.field3228.field3816[var5];
                    Statics.field3228.field3816[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field3228.field3814 + var8 - 128;
        }
        class291.method4712(field1362 + 765 - 128, 9, field1362 + 765, var0 + 7);
        Statics.field2911.method4819(field1362 + 382, 0);
        class291.method4662();
        int var15 = 0;
        int var16 = field1362 + Statics.field3228.field3814 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1359[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field313[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field759[var22];
                    int var26 = Statics.field3228.field3816[var20];
                    Statics.field3228.field3816[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field3228.field3814 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("d.j(Lbt;I)V")
    public static void method51(class59 arg0) {
        if (class60.field688 != 1 && Statics.field2143 || class60.field688 != 4) {
            return;
        }
        int var1 = field1362 + 280;
        if (class60.field675 >= var1 && class60.field675 <= var1 + 14 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(0, 0);
            return;
        }
        if (class60.field675 >= var1 + 15 && class60.field675 <= var1 + 80 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(0, 1);
            return;
        }
        int var2 = field1362 + 390;
        if (class60.field675 >= var2 && class60.field675 <= var2 + 14 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(1, 0);
            return;
        }
        if (class60.field675 >= var2 + 15 && class60.field675 <= var2 + 80 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(1, 1);
            return;
        }
        int var3 = field1362 + 500;
        if (class60.field675 >= var3 && class60.field675 <= var3 + 14 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(2, 0);
            return;
        }
        if (class60.field675 >= var3 + 15 && class60.field675 <= var3 + 80 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(2, 1);
            return;
        }
        int var4 = field1362 + 610;
        if (class60.field675 >= var4 && class60.field675 <= var4 + 14 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(3, 0);
            return;
        }
        if (class60.field675 >= var4 + 15 && class60.field675 <= var4 + 80 && class60.field689 >= 4 && class60.field689 <= 18) {
            class80.method444(3, 1);
            return;
        }
        if (class60.field675 >= field1362 + 708 && class60.field689 >= 4 && class60.field675 <= field1362 + 708 + 50 && class60.field689 <= 20) {
            field1360 = false;
            Statics.field3293.method4819(field1362, 0);
            Statics.field2911.method4819(field1362 + 382, 0);
            Statics.field767.method4778(field1362 + 382 - Statics.field767.field3828 / 2, 18);
            return;
        }
        if (field1361 == -1) {
            return;
        }
        class80 var5 = Statics.field623[field1361];
        method167(var5);
        field1360 = false;
        Statics.field3293.method4819(field1362, 0);
        Statics.field2911.method4819(field1362 + 382, 0);
        Statics.field767.method4778(field1362 + 382 - Statics.field767.field3828 / 2, 18);
        return;
    }

    @ObfuscatedName("v.c(Lcg;I)V")
    public static void method167(class80 arg0) {
        if (arg0.method1402() != client.field1058) {
            client.field1058 = arg0.method1402();
            boolean var1 = arg0.method1402();
            if (Statics.field3543 != var1) {
                class264.field3544.method3333();
                class264.field3576.method3333();
                class264.field3546.method3333();
                Statics.field3543 = var1;
            }
        }
        Statics.field1413 = arg0.field1224;
        client.field940 = arg0.field1220;
        client.field871 = arg0.field1223;
        Statics.field791 = client.field900 == 0 ? 43594 : arg0.field1220 + 40000;
        Statics.field258 = client.field900 == 0 ? 443 : arg0.field1220 + 50000;
        Statics.field799 = Statics.field791;
    }

    @ObfuscatedName("br.i(I)V")
    public static void method915() {
        if (class80.method881()) {
            field1360 = true;
        }
    }
}
