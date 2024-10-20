package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import javax.imageio.ImageIO;

@ObfuscatedName("cr")
public class class92 {

    @ObfuscatedName("cr.w")
    public static int field1352 = 0;

    @ObfuscatedName("cr.i")
    public static int field1342 = field1352 + 202;

    @ObfuscatedName("cr.q")
    public static int[] field1325 = new int[256];

    @ObfuscatedName("cr.p")
    public static int field1324 = 0;

    @ObfuscatedName("cr.ab")
    public static int field1328 = 0;

    @ObfuscatedName("cr.aq")
    public static int field1322 = 0;

    @ObfuscatedName("cr.ax")
    public static int field1351 = 0;

    @ObfuscatedName("cr.at")
    public static int field1331 = 0;

    @ObfuscatedName("cr.ap")
    public static int field1343 = 0;

    @ObfuscatedName("cr.an")
    public static int field1333 = 10;

    @ObfuscatedName("cr.ac")
    public static String field1345 = "";

    @ObfuscatedName("cr.aw")
    public static int field1335 = 0;

    @ObfuscatedName("cr.al")
    public static String field1329 = "";

    @ObfuscatedName("cr.ay")
    public static String field1315 = "";

    @ObfuscatedName("cr.ai")
    public static String field1338 = "";

    @ObfuscatedName("cr.af")
    public static String field1339 = "";

    @ObfuscatedName("cr.ah")
    public static String field1340 = "";

    @ObfuscatedName("cr.az")
    public static String field1341 = "";

    @ObfuscatedName("cr.av")
    public static boolean field1337 = false;

    @ObfuscatedName("cr.au")
    public static boolean field1332 = false;

    @ObfuscatedName("cr.bb")
    public static boolean field1319 = false;

    @ObfuscatedName("cr.bn")
    public static boolean field1347 = true;

    @ObfuscatedName("cr.bg")
    public static int field1346 = 0;

    @ObfuscatedName("cr.bq")
    public static String field1349 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cr.be")
    public static String field1350 = "1234567890";

    @ObfuscatedName("cr.bw")
    public static boolean field1336 = false;

    @ObfuscatedName("cr.bm")
    public static int field1327 = -1;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.a(S)I")
    public static int method1550() {
        return 11;
    }

    @ObfuscatedName("z.w(Lib;Lib;ZII)V")
    public static void method15(class247 arg0, class247 arg1, boolean arg2, int arg3) {
        if (!Statics.field1348) {
            field1335 = arg3;
            class295.method4703();
            byte[] var4 = arg0.method3978("title.jpg", "");
            Object var5 = null;
            class299 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class299(var9, var7, var8);
                    break label144;
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class299(0, 0);
            }
            Statics.field1316 = var11;
            Statics.field1320 = Statics.field1316.method4884();
            if ((client.field891 & 0x20000000) == 0) {
                Statics.field1321 = class300.method4616(arg1, "logo", "");
            } else {
                Statics.field1321 = class300.method4616(arg1, "logo_deadman_mode", "");
            }
            Statics.field1317 = class300.method4616(arg1, "titlebox", "");
            Statics.field1318 = class300.method4616(arg1, "titlebutton", "");
            Statics.field2952 = class300.method2744(arg1, "runes", "");
            Statics.field3735 = class300.method2744(arg1, "title_mute", "");
            Statics.field1268 = class300.method4616(arg1, "options_radio_buttons,0", "");
            Statics.field2946 = class300.method4616(arg1, "options_radio_buttons,4", "");
            Statics.field1334 = class300.method4616(arg1, "options_radio_buttons,2", "");
            Statics.field493 = class300.method4616(arg1, "options_radio_buttons,6", "");
            Statics.field684 = Statics.field1268.field3847;
            Statics.field240 = Statics.field1268.field3848;
            Statics.field2697 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2697[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2697[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2697[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2697[var17 + 192] = 16777215;
            }
            Statics.field1326 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field1326[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field1326[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field1326[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field1326[var21 + 192] = 16777215;
            }
            Statics.field12 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field12[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field12[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field12[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field12[var25 + 192] = 16777215;
            }
            Statics.field1387 = new int[256];
            Statics.field479 = new int[32768];
            Statics.field2533 = new int[32768];
            method1492((class298) null);
            Statics.field1303 = new int[32768];
            Statics.field239 = new int[32768];
            if (arg2) {
                field1340 = "";
                field1341 = "";
            }
            Statics.field241 = 0;
            Statics.field3246 = "";
            field1347 = true;
            field1336 = false;
            if (Statics.field15.field1212) {
                class215.field2621 = 1;
                Statics.field2624 = null;
                Statics.field693 = -1;
                Statics.field3755 = -1;
                Statics.field2626 = 0;
                Statics.field2182 = false;
                Statics.field2160 = 2;
            } else {
                class249 var26 = Statics.field387;
                int var27 = var26.method3962("scape main");
                int var28 = var26.method3913(var27, "");
                class215.method2856(2, var26, var27, var28, 255, false);
            }
            class250.method199(false);
            Statics.field1348 = true;
            field1352 = (Statics.field2446 - 765) / 2;
            field1342 = field1352 + 202;
            Statics.field1218 = field1342 + 180;
            Statics.field1316.method4810(field1352, 0);
            Statics.field1320.method4810(field1352 + 382, 0);
            Statics.field1321.method4783(field1352 + 382 - Statics.field1321.field3847 / 2, 18);
        } else if (arg3 == 4) {
            field1335 = 4;
        }
    }

    @ObfuscatedName("bx.e(ZZI)Lkg;")
    public static class298 method875(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field493 : Statics.field1334) : (arg1 ? Statics.field2946 : Statics.field1268);
    }

    @ObfuscatedName("b.k(B)Ljava/lang/String;")
    public static String method140() {
        return Statics.field15.field1215 ? class282.method116(field1340) : field1340;
    }

    @ObfuscatedName("hu.u(I)V")
    public static void method3858() {
        if (field1340 != null && field1340.length() > 0) {
            return;
        }
        if (Statics.field15.field1219 == null) {
            field1337 = false;
        } else {
            field1340 = Statics.field15.field1219;
            field1337 = true;
        }
    }

    @ObfuscatedName("bx.t(I)V")
    public static void method860() {
        if (field1337 && field1340 != null && field1340.length() > 0) {
            field1346 = 1;
        } else {
            field1346 = 0;
        }
    }

    @ObfuscatedName("gb.f(Lbe;B)V")
    public static void method3287(class59 arg0) {
        if (field1336) {
            method168(arg0);
            return;
        }
        if ((class60.field679 == 1 || !Statics.field456 && class60.field679 == 4) && class60.field665 >= field1352 + 765 - 50 && class60.field681 >= 453) {
            Statics.field15.field1212 = !Statics.field15.field1212;
            class81.method52();
            if (Statics.field15.field1212) {
                Statics.field3754.method3540();
                class215.field2621 = 1;
                Statics.field2624 = null;
            } else {
                class249 var1 = Statics.field387;
                int var2 = var1.method3962("scape main");
                int var3 = var1.method3913(var2, "");
                class215.method4(var1, var2, var3, 255, false);
            }
        }
        if (client.field982 == 5) {
            return;
        }
        field1331++;
        if (client.field982 != 10 && client.field982 != 11) {
            return;
        }
        if (client.field852 == 0) {
            if (class60.field679 == 1 || !Statics.field456 && class60.field679 == 4) {
                int var4 = field1352 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class60.field665 >= var4 && class60.field665 <= var4 + var6 && class60.field681 >= var5 && class60.field681 <= var5 + var7) {
                    method549();
                    return;
                }
            }
            if (Statics.field2560 != null) {
                method549();
            }
        }
        int var8 = class60.field679;
        int var9 = class60.field665;
        int var10 = class60.field681;
        if (var8 == 0) {
            var9 = class60.field680;
            var10 = class60.field683 * -469125321;
        }
        if (!Statics.field456 && var8 == 4) {
            var8 = 1;
        }
        if (field1335 == 0) {
            boolean var11 = false;
            while (class51.method3857()) {
                if (Statics.field3305 == 84) {
                    var11 = true;
                }
            }
            int var12 = Statics.field1218 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                label665: {
                    String var14 = client.method156("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var14));
                            break label665;
                        } catch (Exception var49) {
                        }
                    }
                    if (class57.field622.startsWith("win")) {
                        class57.method667(var14, 0);
                    } else if (class57.field622.startsWith("mac")) {
                        class57.method456(var14, 1, "openjs");
                    } else {
                        class57.method667(var14, 2);
                    }
                }
            }
            int var16 = Statics.field1218 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field891 & 0x2000000) != 0) {
                    field1329 = "";
                    field1315 = class237.field3240;
                    field1338 = class237.field3074;
                    field1339 = class237.field3185;
                    field1335 = 1;
                    method860();
                } else if ((client.field891 & 0x4) != 0) {
                    if ((client.field891 & 0x400) == 0) {
                        field1315 = class237.field3174;
                        field1338 = class237.field3175;
                        field1339 = class237.field3176;
                    } else {
                        field1315 = class237.field3038;
                        field1338 = class237.field3181;
                        field1339 = class237.field3182;
                    }
                    field1329 = class237.field3173;
                    field1335 = 1;
                    method860();
                } else if ((client.field891 & 0x400) == 0) {
                    method4136(false);
                } else {
                    field1315 = class237.field3177;
                    field1338 = class237.field3178;
                    field1339 = class237.field2989;
                    field1329 = class237.field3173;
                    field1335 = 1;
                    method860();
                }
            }
        } else if (field1335 == 1) {
            while (class51.method3857()) {
                if (Statics.field3305 == 84) {
                    method4136(false);
                } else if (Statics.field3305 == 13) {
                    field1335 = 0;
                }
            }
            int var17 = Statics.field1218 - 80;
            short var18 = 321;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var18 - 20 && var10 <= var18 + 20) {
                method4136(false);
            }
            int var19 = Statics.field1218 + 80;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var18 - 20 && var10 <= var18 + 20) {
                field1335 = 0;
            }
        } else if (field1335 == 2) {
            short var20 = 201;
            int var50 = var20 + 52;
            if (var8 == 1 && var10 >= var50 - 12 && var10 < var50 + 2) {
                field1346 = 0;
            }
            var50 += 15;
            if (var8 == 1 && var10 >= var50 - 12 && var10 < var50 + 2) {
                field1346 = 1;
            }
            var50 += 15;
            short var21 = 361;
            if (var8 == 1 && var10 >= var21 - 15 && var10 < var21) {
                method934(class237.field3211, class237.field3212, class237.field3213);
                field1335 = 5;
                return;
            }
            int var22 = Statics.field1218 - 80;
            short var23 = 321;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var23 - 20 && var10 <= var23 + 20) {
                field1340 = field1340.trim();
                if (field1340.length() == 0) {
                    method934(class237.field3180, class237.field3124, class237.field3078);
                    return;
                }
                if (field1341.length() == 0) {
                    method934(class237.field3079, class237.field3237, class237.field2993);
                    return;
                }
                method934(class237.field3059, class237.field3189, class237.field2970);
                client.method2692(false);
                client.method939(20);
                return;
            }
            int var24 = field1342 + 180 + 80;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var23 - 20 && var10 <= var23 + 20) {
                field1335 = 0;
                field1340 = "";
                field1341 = "";
                Statics.field241 = 0;
                Statics.field3246 = "";
                field1347 = true;
            }
            int var25 = Statics.field1218 + -117;
            short var26 = 277;
            field1332 = var9 >= var25 && var9 < Statics.field684 + var25 && var10 >= var26 && var10 < Statics.field240 + var26;
            if (var8 == 1 && field1332) {
                field1337 = !field1337;
                if (!field1337 && Statics.field15.field1219 != null) {
                    Statics.field15.field1219 = null;
                    class81.method52();
                }
            }
            int var27 = Statics.field1218 + 24;
            short var28 = 277;
            field1319 = var9 >= var27 && var9 < Statics.field684 + var27 && var10 >= var28 && var10 < Statics.field240 + var28;
            if (var8 == 1 && field1319) {
                Statics.field15.field1215 = !Statics.field15.field1215;
                if (!Statics.field15.field1215) {
                    field1340 = "";
                    Statics.field15.field1219 = null;
                    method860();
                }
                class81.method52();
            }
            while (true) {
                while (class51.method3857()) {
                    boolean var29 = false;
                    for (int var30 = 0; var30 < field1349.length(); var30++) {
                        if (Statics.field2187 == field1349.charAt(var30)) {
                            var29 = true;
                            break;
                        }
                    }
                    if (Statics.field3305 == 13) {
                        field1335 = 0;
                        field1340 = "";
                        field1341 = "";
                        Statics.field241 = 0;
                        Statics.field3246 = "";
                        field1347 = true;
                    } else if (field1346 == 0) {
                        if (Statics.field3305 == 85 && field1340.length() > 0) {
                            field1340 = field1340.substring(0, field1340.length() - 1);
                        }
                        if (Statics.field3305 == 84 || Statics.field3305 == 80) {
                            field1346 = 1;
                        }
                        if (var29 && field1340.length() < 320) {
                            field1340 = field1340 + Statics.field2187;
                        }
                    } else if (field1346 == 1) {
                        if (Statics.field3305 == 85 && field1341.length() > 0) {
                            field1341 = field1341.substring(0, field1341.length() - 1);
                        }
                        if (Statics.field3305 == 84 || Statics.field3305 == 80) {
                            field1346 = 0;
                        }
                        if (Statics.field3305 == 84) {
                            field1340 = field1340.trim();
                            if (field1340.length() == 0) {
                                method934(class237.field3180, class237.field3124, class237.field3078);
                                return;
                            }
                            if (field1341.length() == 0) {
                                method934(class237.field3079, class237.field3237, class237.field2993);
                                return;
                            }
                            method934(class237.field3059, class237.field3189, class237.field2970);
                            client.method2692(false);
                            client.method939(20);
                            return;
                        }
                        if (var29 && field1341.length() < 20) {
                            field1341 = field1341 + Statics.field2187;
                        }
                    }
                }
                return;
            }
        } else if (field1335 == 3) {
            int var31 = field1342 + 180;
            short var32 = 276;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                method4136(false);
            }
            int var33 = field1342 + 180;
            short var34 = 326;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                method934(class237.field3211, class237.field3212, class237.field3213);
                field1335 = 5;
                return;
            }
        } else if (field1335 == 4) {
            int var35 = field1342 + 180 - 80;
            short var36 = 321;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var36 - 20 && var10 <= var36 + 20) {
                Statics.field3246.trim();
                if (Statics.field3246.length() != 6) {
                    method934(class237.field2995, class237.field2996, class237.field2997);
                    return;
                }
                Statics.field241 = Integer.parseInt(Statics.field3246);
                Statics.field3246 = "";
                client.method2692(true);
                method934(class237.field3059, class237.field3189, class237.field2970);
                client.method939(20);
                return;
            }
            if (var8 == 1 && var9 >= field1342 + 180 - 9 && var9 <= field1342 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field1347 = !field1347;
            }
            if (var8 == 1 && var9 >= field1342 + 180 - 34 && var9 <= field1342 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                label678: {
                    String var37 = client.method156("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var37));
                            break label678;
                        } catch (Exception var48) {
                        }
                    }
                    if (class57.field622.startsWith("win")) {
                        class57.method667(var37, 0);
                    } else if (class57.field622.startsWith("mac")) {
                        class57.method456(var37, 1, "openjs");
                    } else {
                        class57.method667(var37, 2);
                    }
                }
            }
            int var39 = field1342 + 180 + 80;
            if (var8 == 1 && var9 >= var39 - 75 && var9 <= var39 + 75 && var10 >= var36 - 20 && var10 <= var36 + 20) {
                field1335 = 0;
                field1340 = "";
                field1341 = "";
                Statics.field241 = 0;
                Statics.field3246 = "";
            }
            while (class51.method3857()) {
                boolean var40 = false;
                for (int var41 = 0; var41 < field1350.length(); var41++) {
                    if (Statics.field2187 == field1350.charAt(var41)) {
                        var40 = true;
                        break;
                    }
                }
                if (Statics.field3305 == 13) {
                    field1335 = 0;
                    field1340 = "";
                    field1341 = "";
                    Statics.field241 = 0;
                    Statics.field3246 = "";
                } else {
                    if (Statics.field3305 == 85 && Statics.field3246.length() > 0) {
                        Statics.field3246 = Statics.field3246.substring(0, Statics.field3246.length() - 1);
                    }
                    if (Statics.field3305 == 84) {
                        Statics.field3246.trim();
                        if (Statics.field3246.length() != 6) {
                            method934(class237.field2995, class237.field2996, class237.field2997);
                            return;
                        }
                        Statics.field241 = Integer.parseInt(Statics.field3246);
                        Statics.field3246 = "";
                        client.method2692(true);
                        method934(class237.field3059, class237.field3189, class237.field2970);
                        client.method939(20);
                        return;
                    }
                    if (var40 && Statics.field3246.length() < 6) {
                        Statics.field3246 = Statics.field3246 + Statics.field2187;
                    }
                }
            }
        } else if (field1335 == 5) {
            int var42 = field1342 + 180 - 80;
            short var43 = 321;
            if (var8 == 1 && var9 >= var42 - 75 && var9 <= var42 + 75 && var10 >= var43 - 20 && var10 <= var43 + 20) {
                method14();
                return;
            }
            int var44 = field1342 + 180 + 80;
            if (var8 == 1 && var9 >= var44 - 75 && var9 <= var44 + 75 && var10 >= var43 - 20 && var10 <= var43 + 20) {
                method4136(true);
            }
            while (class51.method3857()) {
                boolean var45 = false;
                for (int var46 = 0; var46 < field1349.length(); var46++) {
                    if (Statics.field2187 == field1349.charAt(var46)) {
                        var45 = true;
                        break;
                    }
                }
                if (Statics.field3305 == 13) {
                    method4136(true);
                } else {
                    if (Statics.field3305 == 85 && field1340.length() > 0) {
                        field1340 = field1340.substring(0, field1340.length() - 1);
                    }
                    if (Statics.field3305 == 84) {
                        method14();
                        return;
                    }
                    if (var45 && field1340.length() < 320) {
                        field1340 = field1340 + Statics.field2187;
                    }
                }
            }
        } else if (field1335 == 6) {
            while (true) {
                do {
                    if (!class51.method3857()) {
                        short var47 = 321;
                        if (var8 == 1 && var10 >= var47 - 20 && var10 <= var47 + 20) {
                            method4136(true);
                        }
                        return;
                    }
                } while (Statics.field3305 != 84 && Statics.field3305 != 13);
                method4136(true);
            }
        }
    }

    @ObfuscatedName("ih.g(ZI)V")
    public static void method4136(boolean arg0) {
        field1315 = class237.field3170;
        field1338 = class237.field3171;
        field1339 = class237.field3172;
        field1335 = 2;
        if (arg0) {
            field1341 = "";
        }
        method3858();
        method860();
    }

    @ObfuscatedName("z.x(I)V")
    public static void method14() {
        field1340 = field1340.trim();
        if (field1340.length() == 0) {
            method934(class237.field3211, class237.field3212, class237.field3213);
            return;
        }
        long var0 = class87.method542();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class87.method4495(var0, field1340);
        }
        switch(var2) {
            case 2:
                method934(class237.field3070, class237.field3217, class237.field3216);
                field1335 = 6;
                break;
            case 3:
                method934(class237.field3131, class237.field3218, class237.field3153);
                break;
            case 4:
                method934(class237.field3183, class237.field3221, class237.field3222);
                break;
            case 5:
                method934(class237.field3231, class237.field3224, class237.field3225);
                break;
            case 6:
                method934(class237.field3226, class237.field3164, class237.field3228);
                break;
            case 7:
                method934(class237.field3229, class237.field3230, class237.field2987);
        }
    }

    @ObfuscatedName("az.c(Ljm;Ljm;Ljm;ZS)V")
    public static void method537(class275 arg0, class275 arg1, class275 arg2, boolean arg3) {
        if (arg3) {
            field1352 = (Statics.field2446 - 765) / 2;
            field1342 = field1352 + 202;
            Statics.field1218 = field1342 + 180;
        }
        if (field1336) {
            method2798(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1316.method4810(field1352, 0);
            Statics.field1320.method4810(field1352 + 382, 0);
            Statics.field1321.method4783(field1352 + 382 - Statics.field1321.field3847 / 2, 18);
        }
        if (client.field982 == 0 || client.field982 == 5) {
            byte var4 = 20;
            arg0.method4507(class237.field3169, field1342 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class295.method4706(field1342 + 180 - 152, var5, 304, 34, 9179409);
            class295.method4706(field1342 + 180 - 151, var5 + 1, 302, 32, 0);
            class295.method4707(field1342 + 180 - 150, var5 + 2, field1333 * 3, 30, 9179409);
            class295.method4707(field1333 * 3 + (field1342 + 180 - 150), var5 + 2, 300 - field1333 * 3, 30, 0);
            arg0.method4507(field1345, field1342 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field982 == 20) {
            Statics.field1317.method4783(field1342 + 180 - Statics.field1317.field3847 / 2, 271 - Statics.field1317.field3848 / 2);
            short var6 = 201;
            arg0.method4507(field1315, field1342 + 180, var6, 16776960, 0);
            int var56 = var6 + 15;
            arg0.method4507(field1338, field1342 + 180, var56, 16776960, 0);
            int var57 = var56 + 15;
            arg0.method4507(field1339, field1342 + 180, var57, 16776960, 0);
            int var58 = var57 + 15;
            int var59 = var58 + 7;
            if (field1335 != 4) {
                arg0.method4514(class237.field3045, field1342 + 180 - 110, var59, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = method140(); arg0.method4509(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4514(class276.method4546(var8), field1342 + 180 - 70, var59, 16777215, 0);
                var56 = var59 + 15;
                arg0.method4514(class237.field3192 + class282.method116(field1341), field1342 + 180 - 108, var56, 16777215, 0);
                var56 += 15;
            }
        }
        if (client.field982 == 10 || client.field982 == 11) {
            Statics.field1317.method4783(field1342, 171);
            if (field1335 == 0) {
                short var9 = 251;
                arg0.method4507(class237.field3194, field1342 + 180, var9, 16776960, 0);
                int var60 = var9 + 30;
                int var10 = field1342 + 180 - 80;
                short var11 = 291;
                Statics.field1318.method4783(var10 - 73, var11 - 20);
                arg0.method4518(class237.field3195, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1342 + 180 + 80;
                Statics.field1318.method4783(var12 - 73, var11 - 20);
                arg0.method4518(class237.field3046, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1335 == 1) {
                arg0.method4507(field1329, field1342 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method4507(field1315, field1342 + 180, var13, 16777215, 0);
                int var61 = var13 + 15;
                arg0.method4507(field1338, field1342 + 180, var61, 16777215, 0);
                int var62 = var61 + 15;
                arg0.method4507(field1339, field1342 + 180, var62, 16777215, 0);
                int var63 = var62 + 15;
                int var14 = field1342 + 180 - 80;
                short var15 = 321;
                Statics.field1318.method4783(var14 - 73, var15 - 20);
                arg0.method4507(class237.field2965, var14, var15 + 5, 16777215, 0);
                int var16 = field1342 + 180 + 80;
                Statics.field1318.method4783(var16 - 73, var15 - 20);
                arg0.method4507(class237.field3198, var16, var15 + 5, 16777215, 0);
            } else if (field1335 == 2) {
                short var17 = 201;
                arg0.method4507(field1315, Statics.field1218, var17, 16776960, 0);
                int var64 = var17 + 15;
                arg0.method4507(field1338, Statics.field1218, var64, 16776960, 0);
                int var65 = var64 + 15;
                arg0.method4507(field1339, Statics.field1218, var65, 16776960, 0);
                int var66 = var65 + 15;
                int var67 = var66 + 7;
                arg0.method4514(class237.field3045, Statics.field1218 - 110, var67, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method140(); arg0.method4509(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4514(class276.method4546(var19) + (field1346 == 0 & client.field963 % 40 < 20 ? class88.method3175(16776960) + class88.field1286 : ""), Statics.field1218 - 70, var67, 16777215, 0);
                var64 = var67 + 15;
                arg0.method4514(class237.field3192 + class282.method116(field1341) + (field1346 == 1 & client.field963 % 40 < 20 ? class88.method3175(16776960) + class88.field1286 : ""), Statics.field1218 - 108, var64, 16777215, 0);
                var64 += 15;
                short var20 = 277;
                int var21 = Statics.field1218 + -117;
                class298 var22 = method875(field1337, field1332);
                var22.method4783(var21, var20);
                int var23 = var22.field3847 + 5 + var21;
                arg1.method4514(class237.field3199, var23, var20 + 13, 16776960, 0);
                int var24 = Statics.field1218 + 24;
                class298 var25 = method875(Statics.field15.field1215, field1319);
                var25.method4783(var24, var20);
                int var26 = var25.field3847 + 5 + var24;
                arg1.method4514(class237.field3200, var26, var20 + 13, 16776960, 0);
                int var68 = var20 + 15;
                int var27 = Statics.field1218 - 80;
                short var28 = 321;
                Statics.field1318.method4783(var27 - 73, var28 - 20);
                arg0.method4507(class237.field3184, var27, var28 + 5, 16777215, 0);
                int var29 = Statics.field1218 + 80;
                Statics.field1318.method4783(var29 - 73, var28 - 20);
                arg0.method4507(class237.field3198, var29, var28 + 5, 16777215, 0);
                short var30 = 357;
                arg1.method4507(class237.field3145, Statics.field1218, var30, 16776960, 0);
            } else if (field1335 == 3) {
                short var31 = 201;
                arg0.method4507(class237.field3129, field1342 + 180, var31, 16776960, 0);
                int var69 = var31 + 20;
                arg1.method4507(class237.field3202, field1342 + 180, var69, 16776960, 0);
                int var70 = var69 + 15;
                arg1.method4507(class237.field3159, field1342 + 180, var70, 16776960, 0);
                int var71 = var70 + 15;
                int var32 = field1342 + 180;
                short var33 = 276;
                Statics.field1318.method4783(var32 - 73, var33 - 20);
                arg2.method4507(class237.field3204, var32, var33 + 5, 16777215, 0);
                int var34 = field1342 + 180;
                short var35 = 326;
                Statics.field1318.method4783(var34 - 73, var35 - 20);
                arg2.method4507(class237.field3205, var34, var35 + 5, 16777215, 0);
            } else if (field1335 == 4) {
                arg0.method4507(class237.field3186, field1342 + 180, 201, 16776960, 0);
                short var36 = 236;
                arg0.method4507(field1315, field1342 + 180, var36, 16777215, 0);
                int var72 = var36 + 15;
                arg0.method4507(field1338, field1342 + 180, var72, 16777215, 0);
                int var73 = var72 + 15;
                arg0.method4507(field1339, field1342 + 180, var73, 16777215, 0);
                int var74 = var73 + 15;
                arg0.method4514(class237.field3193 + class282.method116(Statics.field3246) + (client.field963 % 40 < 20 ? class88.method3175(16776960) + class88.field1286 : ""), field1342 + 180 - 108, var74, 16777215, 0);
                int var75 = var74 - 8;
                arg0.method4514(class237.field2967, field1342 + 180 - 9, var75, 16776960, 0);
                int var76 = var75 + 15;
                arg0.method4514(class237.field2968, field1342 + 180 - 9, var76, 16776960, 0);
                int var37 = field1342 + 180 - 9 + arg0.method4509(class237.field2968) + 15;
                int var38 = var76 - arg0.field3711;
                class298 var39;
                if (field1347) {
                    var39 = Statics.field1334;
                } else {
                    var39 = Statics.field1268;
                }
                var39.method4783(var37, var38);
                var72 = var76 + 15;
                int var40 = field1342 + 180 - 80;
                short var41 = 321;
                Statics.field1318.method4783(var40 - 73, var41 - 20);
                arg0.method4507(class237.field2965, var40, var41 + 5, 16777215, 0);
                int var42 = field1342 + 180 + 80;
                Statics.field1318.method4783(var42 - 73, var41 - 20);
                arg0.method4507(class237.field3198, var42, var41 + 5, 16777215, 0);
                arg1.method4507(class237.field3187, field1342 + 180, var41 + 36, 255, 0);
            } else if (field1335 == 5) {
                arg0.method4507(class237.field3207, field1342 + 180, 201, 16776960, 0);
                short var43 = 221;
                arg2.method4507(field1315, field1342 + 180, var43, 16776960, 0);
                int var77 = var43 + 15;
                arg2.method4507(field1338, field1342 + 180, var77, 16776960, 0);
                int var78 = var77 + 15;
                arg2.method4507(field1339, field1342 + 180, var78, 16776960, 0);
                int var79 = var78 + 15;
                int var80 = var79 + 14;
                arg0.method4514(class237.field3160, field1342 + 180 - 145, var80, 16777215, 0);
                short var44 = 174;
                String var45;
                for (var45 = method140(); arg0.method4509(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4514(class276.method4546(var45) + (client.field963 % 40 < 20 ? class88.method3175(16776960) + class88.field1286 : ""), field1342 + 180 - 34, var80, 16777215, 0);
                var77 = var80 + 15;
                int var46 = field1342 + 180 - 80;
                short var47 = 321;
                Statics.field1318.method4783(var46 - 73, var47 - 20);
                arg0.method4507(class237.field3206, var46, var47 + 5, 16777215, 0);
                int var48 = field1342 + 180 + 80;
                Statics.field1318.method4783(var48 - 73, var47 - 20);
                arg0.method4507(class237.field3081, var48, var47 + 5, 16777215, 0);
            } else if (field1335 == 6) {
                short var49 = 201;
                arg0.method4507(field1315, field1342 + 180, var49, 16776960, 0);
                int var81 = var49 + 15;
                arg0.method4507(field1338, field1342 + 180, var81, 16776960, 0);
                int var82 = var81 + 15;
                arg0.method4507(field1339, field1342 + 180, var82, 16776960, 0);
                int var83 = var82 + 15;
                int var50 = field1342 + 180;
                short var51 = 321;
                Statics.field1318.method4783(var50 - 73, var51 - 20);
                arg0.method4507(class237.field3081, var50, var51 + 5, 16777215, 0);
            }
        }
        if (field1331 > 0) {
            method2673(field1331);
            field1331 = 0;
        }
        method224();
        Statics.field3735[Statics.field15.field1212 ? 1 : 0].method4783(field1352 + 765 - 40, 463);
        if (client.field982 <= 5 || client.field852 != 0) {
            return;
        }
        if (Statics.field2152 == null) {
            Statics.field2152 = class300.method4616(Statics.field539, "sl_button", "");
            return;
        }
        int var52 = field1352 + 5;
        short var53 = 463;
        byte var54 = 100;
        byte var55 = 35;
        Statics.field2152.method4783(var52, var53);
        arg0.method4507(class237.field2964 + " " + client.field847, var54 / 2 + var52, var55 / 2 + var53 - 2, 16777215, 0);
        if (Statics.field2560 == null) {
            arg1.method4507(class237.field3242, var54 / 2 + var52, var55 / 2 + var53 + 12, 16777215, 0);
        } else {
            arg1.method4507(class237.field3203, var54 / 2 + var52, var55 / 2 + var53 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bk.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method934(String arg0, String arg1, String arg2) {
        field1315 = arg0;
        field1338 = arg1;
        field1339 = arg2;
    }

    @ObfuscatedName("cq.y(Lkg;I)V")
    public static final void method1492(class298 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field479.length; var2++) {
            Statics.field479[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field479[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2533[var8] = (Statics.field479[var8 - 1] + Statics.field479[var8 + 1] + Statics.field479[var8 - 128] + Statics.field479[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field479;
            Statics.field479 = Statics.field2533;
            Statics.field2533 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3848; var11++) {
            for (int var12 = 0; var12 < arg0.field3847; var12++) {
                if (arg0.field3849[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3845;
                    int var14 = var11 + 16 + arg0.field3850;
                    int var15 = (var14 << 7) + var13;
                    Statics.field479[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("et.o(II)V")
    public static final void method2673(int arg0) {
        short var1 = 256;
        field1322 += arg0 * 128;
        if (field1322 > Statics.field479.length) {
            field1322 -= Statics.field479.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1492(Statics.field2952[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1303[var3 + var4] - Statics.field479[field1322 + var3 & Statics.field479.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1303[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1303[var9 + var10] = 255;
                } else {
                    Statics.field1303[var9 + var10] = 0;
                }
            }
        }
        if (field1324 > 0) {
            field1324 -= arg0 * 4;
        }
        if (field1328 > 0) {
            field1328 -= arg0 * 4;
        }
        if (field1324 == 0 && field1328 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1324 = 1024;
            }
            if (var12 == 1) {
                field1328 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1325[var13] = field1325[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1325[var14] = (int) (Math.sin((double) field1343 / 14.0D) * 16.0D + Math.sin((double) field1343 / 15.0D) * 14.0D + Math.sin((double) field1343 / 16.0D) * 12.0D);
            field1343++;
        }
        field1351 += arg0 * 700731547;
        int var15 = ((client.field963 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1351 * -2007732884; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1303[(var18 << 7) + var17] = 192;
        }
        field1351 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1303[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1303[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field239[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field239[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field239[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1303[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("gz.r(IIII)I")
    public static final int method3229(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ag.i(I)V")
    public static final void method224() {
        short var0 = 256;
        if (field1324 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1324 > 768) {
                    Statics.field1387[var1] = method3229(Statics.field2697[var1], Statics.field1326[var1], 1024 - field1324);
                } else if (field1324 > 256) {
                    Statics.field1387[var1] = Statics.field1326[var1];
                } else {
                    Statics.field1387[var1] = method3229(Statics.field1326[var1], Statics.field2697[var1], 256 - field1324);
                }
            }
        } else if (field1328 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1328 > 768) {
                    Statics.field1387[var2] = method3229(Statics.field2697[var2], Statics.field12[var2], 1024 - field1328);
                } else if (field1328 > 256) {
                    Statics.field1387[var2] = Statics.field12[var2];
                } else {
                    Statics.field1387[var2] = method3229(Statics.field12[var2], Statics.field2697[var2], 256 - field1328);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1387[var3] = Statics.field2697[var3];
            }
        }
        class295.method4699(field1352, 9, field1352 + 128, var0 + 7);
        Statics.field1316.method4810(field1352, 0);
        class295.method4698();
        int var4 = 0;
        int var5 = field1352 + Statics.field720.field3834 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1325[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1303[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1387[var10];
                    int var14 = Statics.field720.field3835[var5];
                    Statics.field720.field3835[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field720.field3834 + var8 - 128;
        }
        class295.method4699(field1352 + 765 - 128, 9, field1352 + 765, var0 + 7);
        Statics.field1320.method4810(field1352 + 382, 0);
        class295.method4698();
        int var15 = 0;
        int var16 = field1352 + Statics.field720.field3834 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1325[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1303[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1387[var22];
                    int var26 = Statics.field720.field3835[var20];
                    Statics.field720.field3835[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field720.field3834 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("fm.q(Ljm;Ljm;I)V")
    public static void method2798(class275 arg0, class275 arg1) {
        if (Statics.field761 == null) {
            Statics.field761 = class300.method634(Statics.field539, "sl_back", "");
        }
        if (Statics.field2719 == null) {
            Statics.field2719 = class300.method2744(Statics.field539, "sl_flags", "");
        }
        if (Statics.field223 == null) {
            Statics.field223 = class300.method2744(Statics.field539, "sl_arrows", "");
        }
        if (Statics.field481 == null) {
            Statics.field481 = class300.method2744(Statics.field539, "sl_stars", "");
        }
        class295.method4707(field1352, 23, 765, 480, 0);
        class295.method4712(field1352, 0, 125, 23, 12425273, 9135624);
        class295.method4712(field1352 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4507(class237.field3232, field1352 + 62, 15, 0, -1);
        if (Statics.field481 != null) {
            Statics.field481[1].method4783(field1352 + 140, 1);
            arg1.method4514(class237.field3233, field1352 + 152, 10, 16777215, -1);
            Statics.field481[0].method4783(field1352 + 140, 12);
            arg1.method4514(class237.field3234, field1352 + 152, 21, 16777215, -1);
        }
        if (Statics.field223 != null) {
            int var2 = field1352 + 280;
            if (class80.field1204[0] == 0 && class80.field1198[0] == 0) {
                Statics.field223[2].method4783(var2, 4);
            } else {
                Statics.field223[0].method4783(var2, 4);
            }
            if (class80.field1204[0] == 0 && class80.field1198[0] == 1) {
                Statics.field223[3].method4783(var2 + 15, 4);
            } else {
                Statics.field223[1].method4783(var2 + 15, 4);
            }
            arg0.method4514(class237.field2977, var2 + 32, 17, 16777215, -1);
            int var3 = field1352 + 390;
            if (class80.field1204[0] == 1 && class80.field1198[0] == 0) {
                Statics.field223[2].method4783(var3, 4);
            } else {
                Statics.field223[0].method4783(var3, 4);
            }
            if (class80.field1204[0] == 1 && class80.field1198[0] == 1) {
                Statics.field223[3].method4783(var3 + 15, 4);
            } else {
                Statics.field223[1].method4783(var3 + 15, 4);
            }
            arg0.method4514(class237.field3236, var3 + 32, 17, 16777215, -1);
            int var4 = field1352 + 500;
            if (class80.field1204[0] == 2 && class80.field1198[0] == 0) {
                Statics.field223[2].method4783(var4, 4);
            } else {
                Statics.field223[0].method4783(var4, 4);
            }
            if (class80.field1204[0] == 2 && class80.field1198[0] == 1) {
                Statics.field223[3].method4783(var4 + 15, 4);
            } else {
                Statics.field223[1].method4783(var4 + 15, 4);
            }
            arg0.method4514(class237.field2972, var4 + 32, 17, 16777215, -1);
            int var5 = field1352 + 610;
            if (class80.field1204[0] == 3 && class80.field1198[0] == 0) {
                Statics.field223[2].method4783(var5, 4);
            } else {
                Statics.field223[0].method4783(var5, 4);
            }
            if (class80.field1204[0] == 3 && class80.field1198[0] == 1) {
                Statics.field223[3].method4783(var5 + 15, 4);
            } else {
                Statics.field223[1].method4783(var5 + 15, 4);
            }
            arg0.method4514(class237.field3238, var5 + 32, 17, 16777215, -1);
        }
        class295.method4707(field1352 + 708, 4, 50, 16, 0);
        arg1.method4507(class237.field3198, field1352 + 708 + 25, 16, 16777215, -1);
        field1327 = -1;
        if (Statics.field761 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class80.field1192) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class80.field1192) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class80.field1192) {
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
            int var17 = field1352 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class80.field1192; var20++) {
                class80 var21 = Statics.field727[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1202);
                if (var21.field1202 == -1) {
                    var23 = class237.field3239;
                    var22 = false;
                } else if (var21.field1202 > 1980) {
                    var23 = class237.field3146;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1371()) {
                    if (var21.method1391()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1370()) {
                    var24 = 16711680;
                    if (var21.method1391()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1368()) {
                    if (var21.method1391()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1391()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field680 >= var17 && class60.field683 * -469125321 >= var16 && class60.field680 < var6 + var17 && class60.field683 * -469125321 < var7 + var16 && var22) {
                    field1327 = var20;
                    Statics.field761[var25].method4861(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field761[var25].method4810(var17, var16);
                }
                if (Statics.field2719 != null) {
                    Statics.field2719[(var21.method1391() ? 8 : 0) + var21.field1205].method4783(var17 + 29, var16);
                }
                arg0.method4507(Integer.toString(var21.field1206), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4507(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4509(Statics.field727[field1327].field1199) + 6;
                int var27 = arg1.field3711 + 8;
                class295.method4707(class60.field680 - var26 / 2, class60.field683 * -469125321 + 20 + 5, var26, var27, 16777120);
                class295.method4706(class60.field680 - var26 / 2, class60.field683 * -469125321 + 20 + 5, var26, var27, 0);
                arg1.method4507(Statics.field727[field1327].field1199, class60.field680, class60.field683 * -469125321 + 20 + 5 + arg1.field3711 + 4, 0, -1);
            }
        }
        Statics.field720.method693(0, 0);
    }

    @ObfuscatedName("p.b(Lbe;I)V")
    public static void method168(class59 arg0) {
        if (class60.field679 != 1 && Statics.field456 || class60.field679 != 4) {
            return;
        }
        int var1 = field1352 + 280;
        if (class60.field665 >= var1 && class60.field665 <= var1 + 14 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(0, 0);
            return;
        }
        if (class60.field665 >= var1 + 15 && class60.field665 <= var1 + 80 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(0, 1);
            return;
        }
        int var2 = field1352 + 390;
        if (class60.field665 >= var2 && class60.field665 <= var2 + 14 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(1, 0);
            return;
        }
        if (class60.field665 >= var2 + 15 && class60.field665 <= var2 + 80 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(1, 1);
            return;
        }
        int var3 = field1352 + 500;
        if (class60.field665 >= var3 && class60.field665 <= var3 + 14 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(2, 0);
            return;
        }
        if (class60.field665 >= var3 + 15 && class60.field665 <= var3 + 80 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(2, 1);
            return;
        }
        int var4 = field1352 + 610;
        if (class60.field665 >= var4 && class60.field665 <= var4 + 14 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(3, 0);
            return;
        }
        if (class60.field665 >= var4 + 15 && class60.field665 <= var4 + 80 && class60.field681 >= 4 && class60.field681 <= 18) {
            class80.method476(3, 1);
            return;
        }
        if (class60.field665 >= field1352 + 708 && class60.field681 >= 4 && class60.field665 <= field1352 + 708 + 50 && class60.field681 <= 20) {
            field1336 = false;
            Statics.field1316.method4810(field1352, 0);
            Statics.field1320.method4810(field1352 + 382, 0);
            Statics.field1321.method4783(field1352 + 382 - Statics.field1321.field3847 / 2, 18);
            return;
        }
        if (field1327 == -1) {
            return;
        }
        class80 var5 = Statics.field727[field1327];
        method165(var5);
        field1336 = false;
        Statics.field1316.method4810(field1352, 0);
        Statics.field1320.method4810(field1352 + 382, 0);
        Statics.field1321.method4783(field1352 + 382 - Statics.field1321.field3847 / 2, 18);
        return;
    }

    @ObfuscatedName("v.h(Lcp;I)V")
    public static void method165(class80 arg0) {
        if (arg0.method1391() != client.field850) {
            client.field850 = arg0.method1391();
            class268.method1608(arg0.method1391());
        }
        Statics.field261 = arg0.field1203;
        client.field847 = arg0.field1206;
        client.field891 = arg0.field1201;
        Statics.field1263 = client.field849 == 0 ? 43594 : arg0.field1206 + 40000;
        Statics.field1664 = client.field849 == 0 ? 443 : arg0.field1206 + 50000;
        Statics.field3619 = Statics.field1263;
    }

    @ObfuscatedName("av.d(I)V")
    public static void method549() {
        if (class80.method964()) {
            field1336 = true;
        }
    }
}
