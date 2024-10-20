package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;

@ObfuscatedName("ch")
public class class91 {

    @ObfuscatedName("ch.i")
    public static int field1339 = 0;

    @ObfuscatedName("ch.h")
    public static int field1338 = field1339 + 202;

    @ObfuscatedName("ch.n")
    public static int[] field1361 = new int[256];

    @ObfuscatedName("ch.s")
    public static int field1347 = 0;

    @ObfuscatedName("ch.ac")
    public static int field1358 = 0;

    @ObfuscatedName("ch.ak")
    public static int field1350 = 0;

    @ObfuscatedName("ch.as")
    public static int field1366 = 0;

    @ObfuscatedName("ch.aa")
    public static int field1352 = 0;

    @ObfuscatedName("ch.ah")
    public static int field1353 = 0;

    @ObfuscatedName("ch.ao")
    public static int field1354 = 10;

    @ObfuscatedName("ch.am")
    public static String field1355 = "";

    @ObfuscatedName("ch.aq")
    public static int field1356 = 0;

    @ObfuscatedName("ch.ae")
    public static String field1357 = "";

    @ObfuscatedName("ch.af")
    public static String field1372 = "";

    @ObfuscatedName("ch.aw")
    public static String field1359 = "";

    @ObfuscatedName("ch.ax")
    public static String field1344 = "";

    @ObfuscatedName("ch.ag")
    public static String field1375 = "";

    @ObfuscatedName("ch.ay")
    public static String field1351 = "";

    @ObfuscatedName("ch.ad")
    public static boolean field1362 = false;

    @ObfuscatedName("ch.an")
    public static boolean field1365 = false;

    @ObfuscatedName("ch.bv")
    public static boolean field1341 = false;

    @ObfuscatedName("ch.ba")
    public static boolean field1345 = true;

    @ObfuscatedName("ch.bl")
    public static int field1368 = 0;

    @ObfuscatedName("ch.br")
    public static String field1369 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ch.bh")
    public static String field1370 = "1234567890";

    @ObfuscatedName("ch.bu")
    public static boolean field1371 = false;

    @ObfuscatedName("ch.be")
    public static int field1373 = -1;

    @ObfuscatedName("ch.bs")
    public static long field1374;

    @ObfuscatedName("ch.bq")
    public static long field1360;

    static {
        new DecimalFormat("##0.00");
        new class161();
        field1374 = -1L;
        field1360 = -1L;
    }

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.c(Ljm;Ljm;B)I")
    public static int method352(class262 arg0, class262 arg1) {
        int var2 = 0;
        if (arg0.method4276("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4276("logo", "")) {
            var2++;
        }
        if (arg1.method4276("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4276("titlebox", "")) {
            var2++;
        }
        if (arg1.method4276("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4276("runes", "")) {
            var2++;
        }
        if (arg1.method4276("title_mute", "")) {
            var2++;
        }
        if (arg1.method4276("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4276("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4276("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4276("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4276("sl_back", "");
        arg1.method4276("sl_flags", "");
        arg1.method4276("sl_arrows", "");
        arg1.method4276("sl_stars", "");
        arg1.method4276("sl_button", "");
        return var2;
    }

    @ObfuscatedName("fn.i(Ljm;Ljm;ZII)V")
    public static void method3121(class262 arg0, class262 arg1, boolean arg2, int arg3) {
        if (!Statics.field1346) {
            field1356 = arg3;
            class328.method5380();
            byte[] var4 = arg0.method4211("title.jpg", "");
            Object var5 = null;
            class332 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class332(var9, var7, var8);
                    break label144;
                } catch (IOException var26) {
                } catch (InterruptedException var27) {
                }
                var11 = new class332(0, 0);
            }
            Statics.field3927 = var11;
            Statics.field716 = Statics.field3927.method5497();
            if ((client.field859 & 0x20000000) == 0) {
                Statics.field1342 = class333.method572(arg1, "logo", "");
            } else {
                Statics.field1342 = class333.method572(arg1, "logo_deadman_mode", "");
            }
            Statics.field1340 = class333.method572(arg1, "titlebox", "");
            Statics.field2606 = class333.method572(arg1, "titlebutton", "");
            Statics.field1348 = class333.method3473(arg1, "runes", "");
            Statics.field492 = class333.method3473(arg1, "title_mute", "");
            Statics.field1692 = class333.method572(arg1, "options_radio_buttons,0", "");
            Statics.field1343 = class333.method572(arg1, "options_radio_buttons,4", "");
            Statics.field2128 = class333.method572(arg1, "options_radio_buttons,2", "");
            Statics.field3849 = class333.method572(arg1, "options_radio_buttons,6", "");
            Statics.field1364 = Statics.field1692.field3972;
            Statics.field416 = Statics.field1692.field3973;
            Statics.field490 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field490[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field490[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field490[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field490[var17 + 192] = 16777215;
            }
            Statics.field232 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field232[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field232[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field232[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field232[var21 + 192] = 16777215;
            }
            Statics.field481 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field481[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field481[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field481[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field481[var25 + 192] = 16777215;
            }
            Statics.field1409 = new int[256];
            Statics.field31 = new int[32768];
            Statics.field35 = new int[32768];
            method159((class331) null);
            Statics.field1363 = new int[32768];
            Statics.field2182 = new int[32768];
            if (arg2) {
                field1375 = "";
                field1351 = "";
            }
            Statics.field1146 = 0;
            Statics.field521 = "";
            field1345 = true;
            field1371 = false;
            if (Statics.field565.field1243) {
                class230.method4299(2);
            } else {
                class230.method2954(2, Statics.field13, "scape main", "", 255, false);
            }
            class265.method3187(false);
            Statics.field1346 = true;
            field1339 = (Statics.field3766 - 765) / 2;
            field1338 = field1339 + 202;
            Statics.field631 = field1338 + 180;
            Statics.field3927.method5441(field1339, 0);
            Statics.field716.method5441(field1339 + 382, 0);
            Statics.field1342.method5415(field1339 + 382 - Statics.field1342.field3972 / 2, 18);
        } else if (arg3 == 4) {
            field1356 = 4;
        }
    }

    @ObfuscatedName("kd.o(ZZB)Llq;")
    public static class331 method5089(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3849 : Statics.field2128) : (arg1 ? Statics.field1343 : Statics.field1692);
    }

    @ObfuscatedName("ki.j(B)V")
    public static void method5073() {
        if (!Statics.field1346) {
            return;
        }
        Statics.field1340 = null;
        Statics.field2606 = null;
        Statics.field1348 = null;
        Statics.field3927 = null;
        Statics.field716 = null;
        Statics.field1342 = null;
        Statics.field492 = null;
        Statics.field1692 = null;
        Statics.field2128 = null;
        Statics.field357 = null;
        Statics.field1349 = null;
        Statics.field1570 = null;
        Statics.field2146 = null;
        Statics.field3765 = null;
        Statics.field490 = null;
        Statics.field232 = null;
        Statics.field481 = null;
        Statics.field1409 = null;
        Statics.field31 = null;
        Statics.field35 = null;
        Statics.field1363 = null;
        Statics.field2182 = null;
        class230.method4299(2);
        class265.method3187(true);
        Statics.field1346 = false;
    }

    @ObfuscatedName("s.k(I)V")
    public static void method190() {
        if (field1362 && field1375 != null && field1375.length() > 0) {
            field1368 = 1;
        } else {
            field1368 = 0;
        }
    }

    @ObfuscatedName("m.x(Lbf;I)V")
    public static void method98(class60 arg0) {
        if (field1371) {
            method3444(arg0);
            return;
        }
        if ((class61.field709 == 1 || !Statics.field441 && class61.field709 == 4) && class61.field712 >= field1339 + 765 - 50 && class61.field711 >= 453) {
            Statics.field565.field1243 = !Statics.field565.field1243;
            class79.method612();
            if (Statics.field565.field1243) {
                Statics.field2680.method3836();
                class230.field2681 = 1;
                Statics.field715 = null;
            } else {
                class264 var1 = Statics.field13;
                int var2 = var1.method4245("scape main");
                int var3 = var1.method4207(var2, "");
                class230.method1857(var1, var2, var3, 255, false);
            }
        }
        if (client.field873 == 5) {
            return;
        }
        if (field1374 == -1L) {
            field1374 = class197.method26() + 1000L;
        }
        long var4 = class197.method26();
        if (client.method88() && field1360 == -1L) {
            field1360 = var4;
            if (field1360 > field1374) {
                field1374 = field1360;
            }
        }
        field1352++;
        if (client.field873 != 10 && client.field873 != 11) {
            return;
        }
        if (client.field864 == 0) {
            if (class61.field709 == 1 || !Statics.field441 && class61.field709 == 4) {
                int var6 = field1339 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class61.field712 >= var6 && class61.field712 <= var6 + var8 && class61.field711 >= var7 && class61.field711 <= var7 + var9) {
                    if (class78.method4354()) {
                        field1371 = true;
                    }
                    return;
                }
            }
            if (Statics.field325 != null && class78.method4354()) {
                field1371 = true;
            }
        }
        int var10 = class61.field709;
        int var11 = class61.field712;
        int var12 = class61.field711;
        if (var10 == 0) {
            var11 = class61.field701;
            var12 = class61.field694;
        }
        if (!Statics.field441 && var10 == 4) {
            var10 = 1;
        }
        if (field1356 == 0) {
            boolean var13 = false;
            while (Statics.method483()) {
                if (Statics.field1840 == 84) {
                    var13 = true;
                }
            }
            int var14 = Statics.field631 - 80;
            short var15 = 291;
            if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                label683: {
                    String var16 = Statics.method3127("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var16));
                            break label683;
                        } catch (Exception var51) {
                        }
                    }
                    if (class58.field647.startsWith("win")) {
                        class58.method2368(var16, 0);
                    } else if (class58.field647.startsWith("mac")) {
                        class58.method498(var16, 1, "openjs");
                    } else {
                        class58.method2368(var16, 2);
                    }
                }
            }
            int var18 = Statics.field631 + 80;
            if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                if ((client.field859 & 0x2000000) != 0) {
                    field1357 = "";
                    field1372 = class252.field3237;
                    field1359 = class252.field3238;
                    field1344 = class252.field3038;
                    field1356 = 1;
                    method190();
                } else if ((client.field859 & 0x4) != 0) {
                    if ((client.field859 & 0x400) == 0) {
                        field1372 = class252.field3228;
                        field1359 = class252.field3229;
                        field1344 = class252.field3282;
                    } else {
                        field1372 = class252.field3234;
                        field1359 = class252.field3235;
                        field1344 = class252.field3236;
                    }
                    field1357 = class252.field3057;
                    field1356 = 1;
                    method190();
                } else if ((client.field859 & 0x400) == 0) {
                    method3467(false);
                } else {
                    field1372 = class252.field3231;
                    field1359 = class252.field3291;
                    field1344 = class252.field3233;
                    field1357 = class252.field3057;
                    field1356 = 1;
                    method190();
                }
            }
        } else if (field1356 == 1) {
            while (Statics.method483()) {
                if (Statics.field1840 == 84) {
                    method3467(false);
                } else if (Statics.field1840 == 13) {
                    field1356 = 0;
                }
            }
            int var19 = Statics.field631 - 80;
            short var20 = 321;
            if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                method3467(false);
            }
            int var21 = Statics.field631 + 80;
            if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                field1356 = 0;
            }
        } else if (field1356 == 2) {
            short var22 = 201;
            int var52 = var22 + 52;
            if (var10 == 1 && var12 >= var52 - 12 && var12 < var52 + 2) {
                field1368 = 0;
            }
            var52 += 15;
            if (var10 == 1 && var12 >= var52 - 12 && var12 < var52 + 2) {
                field1368 = 1;
            }
            var52 += 15;
            short var23 = 361;
            if (var10 == 1 && var12 >= var23 - 15 && var12 < var23) {
                method349(class252.field3265, class252.field3266, class252.field3267);
                field1356 = 5;
                return;
            }
            int var24 = Statics.field631 - 80;
            short var25 = 321;
            if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                field1375 = field1375.trim();
                if (field1375.length() == 0) {
                    method349(class252.field3227, class252.field3131, class252.field3132);
                    return;
                }
                if (field1351.length() == 0) {
                    method349(class252.field3133, class252.field3134, class252.field3136);
                    return;
                }
                method349(class252.field3106, class252.field3258, class252.field3261);
                client.method953(false);
                client.method666(20);
                return;
            }
            int var26 = field1338 + 180 + 80;
            if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                field1356 = 0;
                field1375 = "";
                field1351 = "";
                Statics.field1146 = 0;
                Statics.field521 = "";
                field1345 = true;
            }
            int var27 = Statics.field631 + -117;
            short var28 = 277;
            field1365 = var11 >= var27 && var11 < Statics.field1364 + var27 && var12 >= var28 && var12 < Statics.field416 + var28;
            if (var10 == 1 && field1365) {
                field1362 = !field1362;
                if (!field1362 && Statics.field565.field1235 != null) {
                    Statics.field565.field1235 = null;
                    class79.method612();
                }
            }
            int var29 = Statics.field631 + 24;
            short var30 = 277;
            field1341 = var11 >= var29 && var11 < Statics.field1364 + var29 && var12 >= var30 && var12 < Statics.field416 + var30;
            if (var10 == 1 && field1341) {
                Statics.field565.field1241 = !Statics.field565.field1241;
                if (!Statics.field565.field1241) {
                    field1375 = "";
                    Statics.field565.field1235 = null;
                    method190();
                }
                class79.method612();
            }
            while (true) {
                while (Statics.method483()) {
                    boolean var31 = false;
                    for (int var32 = 0; var32 < field1369.length(); var32++) {
                        if (Statics.field3347 == field1369.charAt(var32)) {
                            var31 = true;
                            break;
                        }
                    }
                    if (Statics.field1840 == 13) {
                        field1356 = 0;
                        field1375 = "";
                        field1351 = "";
                        Statics.field1146 = 0;
                        Statics.field521 = "";
                        field1345 = true;
                    } else if (field1368 == 0) {
                        if (Statics.field1840 == 85 && field1375.length() > 0) {
                            field1375 = field1375.substring(0, field1375.length() - 1);
                        }
                        if (Statics.field1840 == 84 || Statics.field1840 == 80) {
                            field1368 = 1;
                        }
                        if (var31 && field1375.length() < 320) {
                            field1375 = field1375 + Statics.field3347;
                        }
                    } else if (field1368 == 1) {
                        if (Statics.field1840 == 85 && field1351.length() > 0) {
                            field1351 = field1351.substring(0, field1351.length() - 1);
                        }
                        if (Statics.field1840 == 84 || Statics.field1840 == 80) {
                            field1368 = 0;
                        }
                        if (Statics.field1840 == 84) {
                            field1375 = field1375.trim();
                            if (field1375.length() == 0) {
                                method349(class252.field3227, class252.field3131, class252.field3132);
                                return;
                            }
                            if (field1351.length() == 0) {
                                method349(class252.field3133, class252.field3134, class252.field3136);
                                return;
                            }
                            method349(class252.field3106, class252.field3258, class252.field3261);
                            client.method953(false);
                            client.method666(20);
                            return;
                        }
                        if (var31 && field1351.length() < 20) {
                            field1351 = field1351 + Statics.field3347;
                        }
                    }
                }
                return;
            }
        } else if (field1356 == 3) {
            int var33 = field1338 + 180;
            short var34 = 276;
            if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                method3467(false);
            }
            int var35 = field1338 + 180;
            short var36 = 326;
            if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                method349(class252.field3265, class252.field3266, class252.field3267);
                field1356 = 5;
                return;
            }
        } else if (field1356 == 4) {
            int var37 = field1338 + 180 - 80;
            short var38 = 321;
            if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                Statics.field521.trim();
                if (Statics.field521.length() != 6) {
                    method349(class252.field3270, class252.field3147, class252.field3204);
                    return;
                }
                Statics.field1146 = Integer.parseInt(Statics.field521);
                Statics.field521 = "";
                client.method953(true);
                method349(class252.field3106, class252.field3258, class252.field3261);
                client.method666(20);
                return;
            }
            if (var10 == 1 && var11 >= field1338 + 180 - 9 && var11 <= field1338 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field1345 = !field1345;
            }
            if (var10 == 1 && var11 >= field1338 + 180 - 34 && var11 <= field1338 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                label696: {
                    String var39 = Statics.method3127("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var39));
                            break label696;
                        } catch (Exception var50) {
                        }
                    }
                    if (class58.field647.startsWith("win")) {
                        class58.method2368(var39, 0);
                    } else if (class58.field647.startsWith("mac")) {
                        class58.method498(var39, 1, "openjs");
                    } else {
                        class58.method2368(var39, 2);
                    }
                }
            }
            int var41 = field1338 + 180 + 80;
            if (var10 == 1 && var11 >= var41 - 75 && var11 <= var41 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                field1356 = 0;
                field1375 = "";
                field1351 = "";
                Statics.field1146 = 0;
                Statics.field521 = "";
            }
            while (Statics.method483()) {
                boolean var42 = false;
                for (int var43 = 0; var43 < field1370.length(); var43++) {
                    if (Statics.field3347 == field1370.charAt(var43)) {
                        var42 = true;
                        break;
                    }
                }
                if (Statics.field1840 == 13) {
                    field1356 = 0;
                    field1375 = "";
                    field1351 = "";
                    Statics.field1146 = 0;
                    Statics.field521 = "";
                } else {
                    if (Statics.field1840 == 85 && Statics.field521.length() > 0) {
                        Statics.field521 = Statics.field521.substring(0, Statics.field521.length() - 1);
                    }
                    if (Statics.field1840 == 84) {
                        Statics.field521.trim();
                        if (Statics.field521.length() != 6) {
                            method349(class252.field3270, class252.field3147, class252.field3204);
                            return;
                        }
                        Statics.field1146 = Integer.parseInt(Statics.field521);
                        Statics.field521 = "";
                        client.method953(true);
                        method349(class252.field3106, class252.field3258, class252.field3261);
                        client.method666(20);
                        return;
                    }
                    if (var42 && Statics.field521.length() < 6) {
                        Statics.field521 = Statics.field521 + Statics.field3347;
                    }
                }
            }
        } else if (field1356 == 5) {
            int var44 = field1338 + 180 - 80;
            short var45 = 321;
            if (var10 == 1 && var11 >= var44 - 75 && var11 <= var44 + 75 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                method4549();
                return;
            }
            int var46 = field1338 + 180 + 80;
            if (var10 == 1 && var11 >= var46 - 75 && var11 <= var46 + 75 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                method3467(true);
            }
            while (Statics.method483()) {
                boolean var47 = false;
                for (int var48 = 0; var48 < field1369.length(); var48++) {
                    if (Statics.field3347 == field1369.charAt(var48)) {
                        var47 = true;
                        break;
                    }
                }
                if (Statics.field1840 == 13) {
                    method3467(true);
                } else {
                    if (Statics.field1840 == 85 && field1375.length() > 0) {
                        field1375 = field1375.substring(0, field1375.length() - 1);
                    }
                    if (Statics.field1840 == 84) {
                        method4549();
                        return;
                    }
                    if (var47 && field1375.length() < 320) {
                        field1375 = field1375 + Statics.field3347;
                    }
                }
            }
        } else if (field1356 == 6) {
            while (true) {
                do {
                    if (!Statics.method483()) {
                        short var49 = 321;
                        if (var10 == 1 && var12 >= var49 - 20 && var12 <= var49 + 20) {
                            method3467(true);
                        }
                        return;
                    }
                } while (Statics.field1840 != 84 && Statics.field1840 != 13);
                method3467(true);
            }
        }
    }

    @ObfuscatedName("gh.z(ZI)V")
    public static void method3467(boolean arg0) {
        field1372 = class252.field3020;
        field1359 = class252.field3225;
        field1344 = class252.field3142;
        field1356 = 2;
        if (arg0) {
            field1351 = "";
        }
        if (field1375 == null || field1375.length() <= 0) {
            if (Statics.field565.field1235 == null) {
                field1362 = false;
            } else {
                field1375 = Statics.field565.field1235;
                field1362 = true;
            }
        }
        method190();
    }

    @ObfuscatedName("jy.p(I)V")
    public static void method4549() {
        field1375 = field1375.trim();
        if (field1375.length() == 0) {
            method349(class252.field3265, class252.field3266, class252.field3267);
            return;
        }
        long var0 = class86.method351();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class86.method4014(var0, field1375);
        }
        switch(var2) {
            case 2:
                method349(class252.field3073, class252.field3123, class252.field3247);
                field1356 = 6;
                break;
            case 3:
                method349(class252.field3271, class252.field3109, class252.field3273);
                break;
            case 4:
                method349(class252.field3262, class252.field3275, class252.field3077);
                break;
            case 5:
                method349(class252.field3277, class252.field3146, class252.field3279);
                break;
            case 6:
                method349(class252.field3280, class252.field3242, class252.field3176);
                break;
            case 7:
                method349(class252.field3283, class252.field3284, class252.field3285);
        }
    }

    @ObfuscatedName("u.w(Lkw;Lkw;Lkw;ZI)V")
    public static void method164(class312 arg0, class312 arg1, class312 arg2, boolean arg3) {
        if (arg3) {
            field1339 = (Statics.field3766 - 765) / 2;
            field1338 = field1339 + 202;
            Statics.field631 = field1338 + 180;
        }
        if (field1371) {
            method1709(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3927.method5441(field1339, 0);
            Statics.field716.method5441(field1339 + 382, 0);
            Statics.field1342.method5415(field1339 + 382 - Statics.field1342.field3972 / 2, 18);
        }
        if (client.field873 == 0 || client.field873 == 5) {
            byte var4 = 20;
            arg0.method5113(class252.field3223, field1338 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class328.method5330(field1338 + 180 - 152, var5, 304, 34, 9179409);
            class328.method5330(field1338 + 180 - 151, var5 + 1, 302, 32, 0);
            class328.method5392(field1338 + 180 - 150, var5 + 2, field1354 * 3, 30, 9179409);
            class328.method5392(field1354 * 3 + (field1338 + 180 - 150), var5 + 2, 300 - field1354 * 3, 30, 0);
            arg0.method5113(field1355, field1338 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field873 == 20) {
            Statics.field1340.method5415(field1338 + 180 - Statics.field1340.field3972 / 2, 271 - Statics.field1340.field3973 / 2);
            short var6 = 201;
            arg0.method5113(field1372, field1338 + 180, var6, 16776960, 0);
            int var70 = var6 + 15;
            arg0.method5113(field1359, field1338 + 180, var70, 16776960, 0);
            int var71 = var70 + 15;
            arg0.method5113(field1344, field1338 + 180, var71, 16776960, 0);
            int var72 = var71 + 15;
            int var73 = var72 + 7;
            if (field1356 != 4) {
                arg0.method5111(class252.field3152, field1338 + 180 - 110, var73, 16777215, 0);
                short var7 = 200;
                String var8 = Statics.field565.field1241 ? class319.method1447(field1375) : field1375;
                String var9;
                for (var9 = var8; arg0.method5173(var9) > var7; var9 = var9.substring(0, var9.length() - 1)) {
                }
                arg0.method5111(class313.method5110(var9), field1338 + 180 - 70, var73, 16777215, 0);
                var70 = var73 + 15;
                String var11 = class252.field3021;
                String var12 = field1351;
                String var13 = class319.method4856('*', var12.length());
                arg0.method5111(var11 + var13, field1338 + 180 - 108, var70, 16777215, 0);
                var70 += 15;
            }
        }
        if (client.field873 == 10 || client.field873 == 11) {
            Statics.field1340.method5415(field1338, 171);
            if (field1356 == 0) {
                short var14 = 251;
                arg0.method5113(class252.field3248, field1338 + 180, var14, 16776960, 0);
                int var74 = var14 + 30;
                int var15 = field1338 + 180 - 80;
                short var16 = 291;
                Statics.field2606.method5415(var15 - 73, var16 - 20);
                arg0.method5114(class252.field3249, var15 - 73, var16 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var17 = field1338 + 180 + 80;
                Statics.field2606.method5415(var17 - 73, var16 - 20);
                arg0.method5114(class252.field3250, var17 - 73, var16 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1356 == 1) {
                arg0.method5113(field1357, field1338 + 180, 201, 16776960, 0);
                short var18 = 236;
                arg0.method5113(field1372, field1338 + 180, var18, 16777215, 0);
                int var75 = var18 + 15;
                arg0.method5113(field1359, field1338 + 180, var75, 16777215, 0);
                int var76 = var75 + 15;
                arg0.method5113(field1344, field1338 + 180, var76, 16777215, 0);
                int var77 = var76 + 15;
                int var19 = field1338 + 180 - 80;
                short var20 = 321;
                Statics.field2606.method5415(var19 - 73, var20 - 20);
                arg0.method5113(class252.field3018, var19, var20 + 5, 16777215, 0);
                int var21 = field1338 + 180 + 80;
                Statics.field2606.method5415(var21 - 73, var20 - 20);
                arg0.method5113(class252.field3252, var21, var20 + 5, 16777215, 0);
            } else if (field1356 == 2) {
                short var22 = 201;
                arg0.method5113(field1372, Statics.field631, var22, 16776960, 0);
                int var78 = var22 + 15;
                arg0.method5113(field1359, Statics.field631, var78, 16776960, 0);
                int var79 = var78 + 15;
                arg0.method5113(field1344, Statics.field631, var79, 16776960, 0);
                int var80 = var79 + 15;
                int var81 = var80 + 7;
                arg0.method5111(class252.field3152, Statics.field631 - 110, var81, 16777215, 0);
                short var23 = 200;
                String var24 = Statics.field565.field1241 ? class319.method1447(field1375) : field1375;
                String var25;
                for (var25 = var24; arg0.method5173(var25) > var23; var25 = var25.substring(1)) {
                }
                arg0.method5111(class313.method5110(var25) + (field1368 == 0 & client.field867 % 40 < 20 ? class87.method3053(16776960) + class87.field1310 : ""), Statics.field631 - 70, var81, 16777215, 0);
                var78 = var81 + 15;
                String var27 = class252.field3021;
                String var28 = field1351;
                String var29 = class319.method4856('*', var28.length());
                arg0.method5111(var27 + var29 + (field1368 == 1 & client.field867 % 40 < 20 ? class87.method3053(16776960) + class87.field1310 : ""), Statics.field631 - 108, var78, 16777215, 0);
                var78 += 15;
                short var30 = 277;
                int var31 = Statics.field631 + -117;
                class331 var32 = method5089(field1362, field1365);
                var32.method5415(var31, var30);
                int var33 = var32.field3972 + 5 + var31;
                arg1.method5111(class252.field3253, var33, var30 + 13, 16776960, 0);
                int var34 = Statics.field631 + 24;
                class331 var35 = method5089(Statics.field565.field1241, field1341);
                var35.method5415(var34, var30);
                int var36 = var35.field3972 + 5 + var34;
                arg1.method5111(class252.field3254, var36, var30 + 13, 16776960, 0);
                int var82 = var30 + 15;
                int var37 = Statics.field631 - 80;
                short var38 = 321;
                Statics.field2606.method5415(var37 - 73, var38 - 20);
                arg0.method5113(class252.field3251, var37, var38 + 5, 16777215, 0);
                int var39 = Statics.field631 + 80;
                Statics.field2606.method5415(var39 - 73, var38 - 20);
                arg0.method5113(class252.field3252, var39, var38 + 5, 16777215, 0);
                short var40 = 357;
                arg1.method5113(class252.field3260, Statics.field631, var40, 16776960, 0);
            } else if (field1356 == 3) {
                short var41 = 201;
                arg0.method5113(class252.field3135, field1338 + 180, var41, 16776960, 0);
                int var83 = var41 + 20;
                arg1.method5113(class252.field3256, field1338 + 180, var83, 16776960, 0);
                int var84 = var83 + 15;
                arg1.method5113(class252.field3257, field1338 + 180, var84, 16776960, 0);
                int var85 = var84 + 15;
                int var42 = field1338 + 180;
                short var43 = 276;
                Statics.field2606.method5415(var42 - 73, var43 - 20);
                arg2.method5113(class252.field3215, var42, var43 + 5, 16777215, 0);
                int var44 = field1338 + 180;
                short var45 = 326;
                Statics.field2606.method5415(var44 - 73, var45 - 20);
                arg2.method5113(class252.field3268, var44, var45 + 5, 16777215, 0);
            } else if (field1356 == 4) {
                arg0.method5113(class252.field3240, field1338 + 180, 201, 16776960, 0);
                short var46 = 236;
                arg0.method5113(field1372, field1338 + 180, var46, 16777215, 0);
                int var86 = var46 + 15;
                arg0.method5113(field1359, field1338 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method5113(field1344, field1338 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                arg0.method5111(class252.field3276 + class319.method1447(Statics.field521) + (client.field867 % 40 < 20 ? class87.method3053(16776960) + class87.field1310 : ""), field1338 + 180 - 108, var88, 16777215, 0);
                int var89 = var88 - 8;
                arg0.method5111(class252.field3046, field1338 + 180 - 9, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method5111(class252.field3022, field1338 + 180 - 9, var90, 16776960, 0);
                int var47 = field1338 + 180 - 9 + arg0.method5173(class252.field3022) + 15;
                int var48 = var90 - arg0.field3892;
                class331 var49;
                if (field1345) {
                    var49 = Statics.field2128;
                } else {
                    var49 = Statics.field1692;
                }
                var49.method5415(var47, var48);
                var86 = var90 + 15;
                int var50 = field1338 + 180 - 80;
                short var51 = 321;
                Statics.field2606.method5415(var50 - 73, var51 - 20);
                arg0.method5113(class252.field3018, var50, var51 + 5, 16777215, 0);
                int var52 = field1338 + 180 + 80;
                Statics.field2606.method5415(var52 - 73, var51 - 20);
                arg0.method5113(class252.field3252, var52, var51 + 5, 16777215, 0);
                arg1.method5113(class252.field3241, field1338 + 180, var51 + 36, 255, 0);
            } else if (field1356 == 5) {
                arg0.method5113(class252.field3061, field1338 + 180, 201, 16776960, 0);
                short var53 = 221;
                arg2.method5113(field1372, field1338 + 180, var53, 16776960, 0);
                int var91 = var53 + 15;
                arg2.method5113(field1359, field1338 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg2.method5113(field1344, field1338 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var94 = var93 + 14;
                arg0.method5111(class252.field3126, field1338 + 180 - 145, var94, 16777215, 0);
                short var54 = 174;
                String var57;
                if (Statics.field565.field1241) {
                    String var55 = field1375;
                    String var56 = class319.method4856('*', var55.length());
                    var57 = var56;
                } else {
                    var57 = field1375;
                }
                String var59;
                for (var59 = var57; arg0.method5173(var59) > var54; var59 = var59.substring(1)) {
                }
                arg0.method5111(class313.method5110(var59) + (client.field867 % 40 < 20 ? class87.method3053(16776960) + class87.field1310 : ""), field1338 + 180 - 34, var94, 16777215, 0);
                var91 = var94 + 15;
                int var60 = field1338 + 180 - 80;
                short var61 = 321;
                Statics.field2606.method5415(var60 - 73, var61 - 20);
                arg0.method5113(class252.field3149, var60, var61 + 5, 16777215, 0);
                int var62 = field1338 + 180 + 80;
                Statics.field2606.method5415(var62 - 73, var61 - 20);
                arg0.method5113(class252.field3264, var62, var61 + 5, 16777215, 0);
            } else if (field1356 == 6) {
                short var63 = 201;
                arg0.method5113(field1372, field1338 + 180, var63, 16776960, 0);
                int var95 = var63 + 15;
                arg0.method5113(field1359, field1338 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method5113(field1344, field1338 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                int var64 = field1338 + 180;
                short var65 = 321;
                Statics.field2606.method5415(var64 - 73, var65 - 20);
                arg0.method5113(class252.field3264, var64, var65 + 5, 16777215, 0);
            }
        }
        if (field1352 > 0) {
            method3460(field1352);
            field1352 = 0;
        }
        method2910();
        Statics.field492[Statics.field565.field1243 ? 1 : 0].method5415(field1339 + 765 - 40, 463);
        if (client.field873 <= 5 || client.field864 != 0) {
            return;
        }
        if (Statics.field3765 == null) {
            Statics.field3765 = class333.method572(Statics.field550, "sl_button", "");
            return;
        }
        int var66 = field1339 + 5;
        short var67 = 463;
        byte var68 = 100;
        byte var69 = 35;
        Statics.field3765.method5415(var66, var67);
        arg0.method5113(class252.field3185 + " " + client.field858, var68 / 2 + var66, var69 / 2 + var67 - 2, 16777215, 0);
        if (Statics.field325 == null) {
            arg1.method5113(class252.field3296, var68 / 2 + var66, var69 / 2 + var67 + 12, 16777215, 0);
        } else {
            arg1.method5113(class252.field3295, var68 / 2 + var66, var69 / 2 + var67 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("aa.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method349(String arg0, String arg1, String arg2) {
        field1372 = arg0;
        field1359 = arg1;
        field1344 = arg2;
    }

    @ObfuscatedName("n.d(Llq;I)V")
    public static final void method159(class331 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field31.length; var2++) {
            Statics.field31[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field31[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field35[var8] = (Statics.field31[var8 - 1] + Statics.field31[var8 + 1] + Statics.field31[var8 - 128] + Statics.field31[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field31;
            Statics.field31 = Statics.field35;
            Statics.field35 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3973; var11++) {
            for (int var12 = 0; var12 < arg0.field3972; var12++) {
                if (arg0.field3974[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3970;
                    int var14 = var11 + 16 + arg0.field3977;
                    int var15 = (var14 << 7) + var13;
                    Statics.field31[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("gm.a(II)V")
    public static final void method3460(int arg0) {
        short var1 = 256;
        field1350 += arg0 * 128;
        if (field1350 > Statics.field31.length) {
            field1350 -= Statics.field31.length;
            int var2 = (int) (Math.random() * 12.0D);
            method159(Statics.field1348[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1363[var3 + var4] - Statics.field31[field1350 + var3 & Statics.field31.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1363[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1363[var9 + var10] = 255;
                } else {
                    Statics.field1363[var9 + var10] = 0;
                }
            }
        }
        if (field1347 > 0) {
            field1347 -= arg0 * 4;
        }
        if (field1358 > 0) {
            field1358 -= arg0 * 4;
        }
        if (field1347 == 0 && field1358 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1347 = 1024;
            }
            if (var12 == 1) {
                field1358 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1361[var13] = field1361[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1361[var14] = (int) (Math.sin((double) field1353 / 14.0D) * 16.0D + Math.sin((double) field1353 / 15.0D) * 14.0D + Math.sin((double) field1353 / 16.0D) * 12.0D);
            field1353++;
        }
        field1366 += arg0 * -1055904909;
        int var15 = ((client.field867 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1366 * 415919372; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1363[(var18 << 7) + var17] = 192;
        }
        field1366 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1363[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1363[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2182[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2182[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2182[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1363[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cp.b(IIIB)I")
    public static final int method1871(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("eb.h(I)V")
    public static final void method2910() {
        short var0 = 256;
        if (field1347 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1347 > 768) {
                    Statics.field1409[var1] = method1871(Statics.field490[var1], Statics.field232[var1], 1024 - field1347);
                } else if (field1347 > 256) {
                    Statics.field1409[var1] = Statics.field232[var1];
                } else {
                    Statics.field1409[var1] = method1871(Statics.field232[var1], Statics.field490[var1], 256 - field1347);
                }
            }
        } else if (field1358 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1358 > 768) {
                    Statics.field1409[var2] = method1871(Statics.field490[var2], Statics.field481[var2], 1024 - field1358);
                } else if (field1358 > 256) {
                    Statics.field1409[var2] = Statics.field481[var2];
                } else {
                    Statics.field1409[var2] = method1871(Statics.field481[var2], Statics.field490[var2], 256 - field1358);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1409[var3] = Statics.field490[var3];
            }
        }
        class328.method5315(field1339, 9, field1339 + 128, var0 + 7);
        Statics.field3927.method5441(field1339, 0);
        class328.method5314();
        int var4 = 0;
        int var5 = field1339 + Statics.field3942.field3961 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1361[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1363[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1409[var10];
                    int var14 = Statics.field3942.field3962[var5];
                    Statics.field3942.field3962[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field3942.field3961 + var8 - 128;
        }
        class328.method5315(field1339 + 765 - 128, 9, field1339 + 765, var0 + 7);
        Statics.field716.method5441(field1339 + 382, 0);
        class328.method5314();
        int var15 = 0;
        int var16 = field1339 + Statics.field3942.field3961 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1361[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1363[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1409[var22];
                    int var26 = Statics.field3942.field3962[var20];
                    Statics.field3942.field3962[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field3942.field3961 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cg.n(Lkw;Lkw;I)V")
    public static void method1709(class312 arg0, class312 arg1) {
        if (Statics.field357 == null) {
            Statics.field357 = class333.method5221(Statics.field550, "sl_back", "");
        }
        if (Statics.field1349 == null) {
            Statics.field1349 = class333.method3473(Statics.field550, "sl_flags", "");
        }
        if (Statics.field1570 == null) {
            Statics.field1570 = class333.method3473(Statics.field550, "sl_arrows", "");
        }
        if (Statics.field2146 == null) {
            Statics.field2146 = class333.method3473(Statics.field550, "sl_stars", "");
        }
        class328.method5392(field1339, 23, 765, 480, 0);
        class328.method5328(field1339, 0, 125, 23, 12425273, 9135624);
        class328.method5328(field1339 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5113(class252.field3212, field1339 + 62, 15, 0, -1);
        if (Statics.field2146 != null) {
            Statics.field2146[1].method5415(field1339 + 140, 1);
            arg1.method5111(class252.field3287, field1339 + 152, 10, 16777215, -1);
            Statics.field2146[0].method5415(field1339 + 140, 12);
            arg1.method5111(class252.field3288, field1339 + 152, 21, 16777215, -1);
        }
        if (Statics.field1570 != null) {
            int var2 = field1339 + 280;
            if (class78.field1221[0] == 0 && class78.field1225[0] == 0) {
                Statics.field1570[2].method5415(var2, 4);
            } else {
                Statics.field1570[0].method5415(var2, 4);
            }
            if (class78.field1221[0] == 0 && class78.field1225[0] == 1) {
                Statics.field1570[3].method5415(var2 + 15, 4);
            } else {
                Statics.field1570[1].method5415(var2 + 15, 4);
            }
            arg0.method5111(class252.field3289, var2 + 32, 17, 16777215, -1);
            int var3 = field1339 + 390;
            if (class78.field1221[0] == 1 && class78.field1225[0] == 0) {
                Statics.field1570[2].method5415(var3, 4);
            } else {
                Statics.field1570[0].method5415(var3, 4);
            }
            if (class78.field1221[0] == 1 && class78.field1225[0] == 1) {
                Statics.field1570[3].method5415(var3 + 15, 4);
            } else {
                Statics.field1570[1].method5415(var3 + 15, 4);
            }
            arg0.method5111(class252.field3290, var3 + 32, 17, 16777215, -1);
            int var4 = field1339 + 500;
            if (class78.field1221[0] == 2 && class78.field1225[0] == 0) {
                Statics.field1570[2].method5415(var4, 4);
            } else {
                Statics.field1570[0].method5415(var4, 4);
            }
            if (class78.field1221[0] == 2 && class78.field1225[0] == 1) {
                Statics.field1570[3].method5415(var4 + 15, 4);
            } else {
                Statics.field1570[1].method5415(var4 + 15, 4);
            }
            arg0.method5111(class252.field3197, var4 + 32, 17, 16777215, -1);
            int var5 = field1339 + 610;
            if (class78.field1221[0] == 3 && class78.field1225[0] == 0) {
                Statics.field1570[2].method5415(var5, 4);
            } else {
                Statics.field1570[0].method5415(var5, 4);
            }
            if (class78.field1221[0] == 3 && class78.field1225[0] == 1) {
                Statics.field1570[3].method5415(var5 + 15, 4);
            } else {
                Statics.field1570[1].method5415(var5 + 15, 4);
            }
            arg0.method5111(class252.field3292, var5 + 32, 17, 16777215, -1);
        }
        class328.method5392(field1339 + 708, 4, 50, 16, 0);
        arg1.method5113(class252.field3252, field1339 + 708 + 25, 16, 16777215, -1);
        field1373 = -1;
        if (Statics.field357 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class78.field1223) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class78.field1223) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class78.field1223) {
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
            int var17 = field1339 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class78.field1223; var20++) {
                class78 var21 = Statics.field2059[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1229);
                if (var21.field1229 == -1) {
                    var23 = class252.field3293;
                    var22 = false;
                } else if (var21.field1229 > 1980) {
                    var23 = class252.field3294;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1477()) {
                    if (var21.method1478()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1476()) {
                    var24 = 16711680;
                    if (var21.method1478()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1474()) {
                    if (var21.method1478()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1478()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class61.field701 >= var17 && class61.field694 >= var16 && class61.field701 < var6 + var17 && class61.field694 < var7 + var16 && var22) {
                    field1373 = var20;
                    Statics.field357[var25].method5446(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field357[var25].method5441(var17, var16);
                }
                if (Statics.field1349 != null) {
                    Statics.field1349[(var21.method1478() ? 8 : 0) + var21.field1232].method5415(var17 + 29, var16);
                }
                arg0.method5113(Integer.toString(var21.field1231), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method5113(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method5173(Statics.field2059[field1373].field1226) + 6;
                int var27 = arg1.field3892 + 8;
                class328.method5392(class61.field701 - var26 / 2, class61.field694 + 20 + 5, var26, var27, 16777120);
                class328.method5330(class61.field701 - var26 / 2, class61.field694 + 20 + 5, var26, var27, 0);
                arg1.method5113(Statics.field2059[field1373].field1226, class61.field701, class61.field694 + 20 + 5 + arg1.field3892 + 4, 0, -1);
            }
        }
        Statics.field3942.method764(0, 0);
    }

    @ObfuscatedName("gp.u(Lbf;I)V")
    public static void method3444(class60 arg0) {
        if (class61.field709 != 1 && Statics.field441 || class61.field709 != 4) {
            return;
        }
        int var1 = field1339 + 280;
        if (class61.field712 >= var1 && class61.field712 <= var1 + 14 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(0, 0);
            return;
        }
        if (class61.field712 >= var1 + 15 && class61.field712 <= var1 + 80 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(0, 1);
            return;
        }
        int var2 = field1339 + 390;
        if (class61.field712 >= var2 && class61.field712 <= var2 + 14 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(1, 0);
            return;
        }
        if (class61.field712 >= var2 + 15 && class61.field712 <= var2 + 80 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(1, 1);
            return;
        }
        int var3 = field1339 + 500;
        if (class61.field712 >= var3 && class61.field712 <= var3 + 14 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(2, 0);
            return;
        }
        if (class61.field712 >= var3 + 15 && class61.field712 <= var3 + 80 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(2, 1);
            return;
        }
        int var4 = field1339 + 610;
        if (class61.field712 >= var4 && class61.field712 <= var4 + 14 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(3, 0);
            return;
        }
        if (class61.field712 >= var4 + 15 && class61.field712 <= var4 + 80 && class61.field711 >= 4 && class61.field711 <= 18) {
            class78.method3456(3, 1);
            return;
        }
        if (class61.field712 >= field1339 + 708 && class61.field711 >= 4 && class61.field712 <= field1339 + 708 + 50 && class61.field711 <= 20) {
            field1371 = false;
            Statics.field3927.method5441(field1339, 0);
            Statics.field716.method5441(field1339 + 382, 0);
            Statics.field1342.method5415(field1339 + 382 - Statics.field1342.field3972 / 2, 18);
            return;
        }
        if (field1373 == -1) {
            return;
        }
        class78 var5 = Statics.field2059[field1373];
        method1591(var5);
        field1371 = false;
        Statics.field3927.method5441(field1339, 0);
        Statics.field716.method5441(field1339 + 382, 0);
        Statics.field1342.method5415(field1339 + 382 - Statics.field1342.field3972 / 2, 18);
        return;
    }

    @ObfuscatedName("ck.q(Lbz;I)V")
    public static void method1591(class78 arg0) {
        if (arg0.method1478() != client.field856) {
            client.field856 = arg0.method1478();
            boolean var1 = arg0.method1478();
            if (Statics.field2135 != var1) {
                class284.method663();
                Statics.field2135 = var1;
            }
        }
        Statics.field1066 = arg0.field1228;
        client.field858 = arg0.field1231;
        client.field859 = arg0.field1219;
        Statics.field462 = client.field956 == 0 ? 43594 : arg0.field1231 + 40000;
        Statics.field3879 = client.field956 == 0 ? 443 : arg0.field1231 + 50000;
        Statics.field850 = Statics.field462;
    }
}
