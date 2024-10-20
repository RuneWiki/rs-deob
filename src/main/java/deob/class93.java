package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import javax.imageio.ImageIO;

@ObfuscatedName("cu")
public class class93 {

    @ObfuscatedName("cu.o")
    public static int field1418 = 0;

    @ObfuscatedName("cu.a")
    public static int field1404 = field1418 + 202;

    @ObfuscatedName("cu.y")
    public static int[] field1424 = new int[256];

    @ObfuscatedName("cu.n")
    public static int field1396 = 0;

    @ObfuscatedName("cu.z")
    public static int field1408 = 0;

    @ObfuscatedName("cu.am")
    public static int field1411 = 0;

    @ObfuscatedName("cu.ag")
    public static int field1412 = 0;

    @ObfuscatedName("cu.av")
    public static int field1413 = 0;

    @ObfuscatedName("cu.al")
    public static int field1414 = 0;

    @ObfuscatedName("cu.ab")
    public static int field1399 = 10;

    @ObfuscatedName("cu.af")
    public static String field1416 = "";

    @ObfuscatedName("cu.ak")
    public static int field1417 = 0;

    @ObfuscatedName("cu.ar")
    public static String field1420 = "";

    @ObfuscatedName("cu.an")
    public static String field1419 = "";

    @ObfuscatedName("cu.at")
    public static String field1430 = "";

    @ObfuscatedName("cu.aw")
    public static String field1421 = "";

    @ObfuscatedName("cu.ad")
    public static String field1422 = "";

    @ObfuscatedName("cu.ac")
    public static String field1405 = "";

    @ObfuscatedName("cu.ae")
    public static class150 field1423 = class150.field2162;

    @ObfuscatedName("cu.ai")
    public static boolean field1425 = true;

    @ObfuscatedName("cu.aa")
    public static int field1426 = 0;

    @ObfuscatedName("cu.aq")
    public static String field1429 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cu.as")
    public static String field1428 = "1234567890";

    @ObfuscatedName("cu.az")
    public static boolean field1402 = false;

    @ObfuscatedName("cu.bh")
    public static int field1427 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.c(Lip;Lip;I)I")
    public static int method1386(class236 arg0, class236 arg1) {
        int var2 = 0;
        if (arg0.method3734("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3734("logo", "")) {
            var2++;
        }
        if (arg1.method3734("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3734("titlebox", "")) {
            var2++;
        }
        if (arg1.method3734("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3734("runes", "")) {
            var2++;
        }
        if (arg1.method3734("title_mute", "")) {
            var2++;
        }
        if (arg1.method3734("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3734("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3734("sl_back", "");
        arg1.method3734("sl_flags", "");
        arg1.method3734("sl_arrows", "");
        arg1.method3734("sl_stars", "");
        arg1.method3734("sl_button", "");
        return var2;
    }

    @ObfuscatedName("fp.o(I)I")
    public static int method3068() {
        return 9;
    }

    @ObfuscatedName("v.i(Lip;Lip;ZII)V")
    public static void method48(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1415) {
            field1417 = arg3;
            class282.method4506();
            byte[] var4 = arg0.method3733("title.jpg", "");
            Object var5 = null;
            class286 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class286(var9, var7, var8);
                    break label144;
                } catch (IOException var26) {
                } catch (InterruptedException var27) {
                }
                var11 = new class286(0, 0);
            }
            Statics.field1395 = var11;
            Statics.field1400 = Statics.field1395.method4620();
            if ((client.field916 & 0x20000000) == 0) {
                Statics.field1401 = class287.method2615(arg1, "logo", "");
            } else {
                Statics.field1401 = class287.method2615(arg1, "logo_deadman_mode", "");
            }
            Statics.field1397 = class287.method2615(arg1, "titlebox", "");
            Statics.field1398 = class287.method2615(arg1, "titlebutton", "");
            Statics.field494 = class287.method4440(arg1, "runes", "");
            Statics.field2376 = class287.method4440(arg1, "title_mute", "");
            Statics.field2383 = class287.method2615(arg1, "options_radio_buttons,0", "");
            Statics.field414 = class287.method2615(arg1, "options_radio_buttons,2", "");
            Statics.field432 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field432[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field432[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field432[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field432[var17 + 192] = 16777215;
            }
            Statics.field1406 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field1406[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field1406[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field1406[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field1406[var21 + 192] = 16777215;
            }
            Statics.field1971 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field1971[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field1971[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field1971[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field1971[var25 + 192] = 16777215;
            }
            Statics.field817 = new int[256];
            Statics.field1407 = new int[32768];
            Statics.field1410 = new int[32768];
            method143((class285) null);
            Statics.field349 = new int[32768];
            Statics.field1272 = new int[32768];
            if (arg2) {
                field1422 = "";
                field1405 = "";
            }
            Statics.field847 = 0;
            Statics.field2123 = "";
            field1425 = true;
            field1402 = false;
            if (Statics.field479.field1301) {
                class204.method1869(2);
            } else {
                class204.method3705(2, Statics.field232, "scape main", "", 255, false);
            }
            class239.method1512(false);
            Statics.field1415 = true;
            field1418 = (Statics.field584 - 765) / 2;
            field1404 = field1418 + 202;
            Statics.field1395.method4629(field1418, 0);
            Statics.field1400.method4629(field1418 + 382, 0);
            Statics.field1401.method4614(field1418 + 382 - Statics.field1401.field3762 / 2, 18);
        } else if (arg3 == 4) {
            field1417 = 4;
        }
    }

    @ObfuscatedName("bs.u(I)V")
    public static void method948() {
        if (!Statics.field1415) {
            return;
        }
        Statics.field1397 = null;
        Statics.field1398 = null;
        Statics.field494 = null;
        Statics.field1395 = null;
        Statics.field1400 = null;
        Statics.field1401 = null;
        Statics.field2376 = null;
        Statics.field2383 = null;
        Statics.field414 = null;
        Statics.field341 = null;
        Statics.field2369 = null;
        Statics.field522 = null;
        Statics.field2281 = null;
        Statics.field523 = null;
        Statics.field432 = null;
        Statics.field1406 = null;
        Statics.field1971 = null;
        Statics.field817 = null;
        Statics.field1407 = null;
        Statics.field1410 = null;
        Statics.field349 = null;
        Statics.field1272 = null;
        class204.method1869(2);
        class239.method1512(true);
        Statics.field1415 = false;
    }

    @ObfuscatedName("ew.g(Lbo;I)V")
    public static void method2664(class59 arg0) {
        if (!field1402) {
            if ((class60.field730 == 1 || !Statics.field700 && class60.field730 == 4) && class60.field738 >= field1418 + 765 - 50 && class60.field724 >= 453) {
                Statics.field479.field1301 = !Statics.field479.field1301;
                class82.method43();
                if (Statics.field479.field1301) {
                    class204.method1347();
                } else {
                    class204.method1498(Statics.field232, "scape main", "", 255, false);
                }
            }
            if (client.field922 != 5) {
                field1413++;
                if (client.field922 == 10 || client.field922 == 11) {
                    if (client.field920 == 0) {
                        if (class60.field730 == 1 || !Statics.field700 && class60.field730 == 4) {
                            int var6 = field1418 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class60.field738 >= var6 && class60.field738 <= var6 + var8 && class60.field724 >= var7 && class60.field724 <= var7 + var9) {
                                method3710();
                                return;
                            }
                        }
                        if (Statics.field3642 != null) {
                            method3710();
                        }
                    }
                    int var10 = class60.field730;
                    int var11 = class60.field738;
                    int var12 = class60.field724;
                    if (!Statics.field700 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field1417 == 0) {
                        boolean var13 = false;
                        while (class51.method455()) {
                            if (Statics.field2772 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = field1404 + 180 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            class57.method457(client.method316("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var16 = field1404 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field916 & 0x2000000) != 0) {
                                field1420 = "";
                                field1419 = class226.field3049;
                                field1430 = class226.field3050;
                                field1421 = class226.field2931;
                                field1417 = 1;
                                field1426 = 0;
                            } else if ((client.field916 & 0x4) != 0) {
                                if ((client.field916 & 0x400) == 0) {
                                    field1419 = class226.field3040;
                                    field1430 = class226.field3041;
                                    field1421 = class226.field3042;
                                } else {
                                    field1419 = class226.field3087;
                                    field1430 = class226.field3047;
                                    field1421 = class226.field2892;
                                }
                                field1420 = class226.field2907;
                                field1417 = 1;
                                field1426 = 0;
                            } else if ((client.field916 & 0x400) == 0) {
                                field1419 = class226.field3036;
                                field1430 = class226.field3037;
                                field1421 = class226.field3038;
                                field1417 = 2;
                                field1426 = 0;
                            } else {
                                field1419 = class226.field3010;
                                field1430 = class226.field3083;
                                field1421 = class226.field3045;
                                field1420 = class226.field2907;
                                field1417 = 1;
                                field1426 = 0;
                            }
                        }
                    } else if (field1417 == 1) {
                        while (class51.method455()) {
                            if (Statics.field2772 == 84) {
                                field1419 = class226.field3036;
                                field1430 = class226.field3037;
                                field1421 = class226.field3038;
                                field1417 = 2;
                                field1426 = 0;
                            } else if (Statics.field2772 == 13) {
                                field1417 = 0;
                            }
                        }
                        int var17 = field1404 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1419 = class226.field3036;
                            field1430 = class226.field3037;
                            field1421 = class226.field3038;
                            field1417 = 2;
                            field1426 = 0;
                        }
                        int var19 = field1404 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1417 = 0;
                        }
                    } else if (field1417 == 2) {
                        short var20 = 231;
                        int var42 = var20 + 30;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1426 = 0;
                        }
                        var42 += 15;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1426 = 1;
                        }
                        var42 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method157(class226.field3054, class226.field3076, class226.field3095);
                            field1417 = 5;
                            return;
                        }
                        int var22 = field1404 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1422 = field1422.trim();
                            if (field1422.length() == 0) {
                                method157(class226.field2942, class226.field2987, class226.field2956);
                                return;
                            }
                            if (field1405.length() == 0) {
                                method157(class226.field2945, class226.field2876, class226.field2947);
                                return;
                            }
                            method157(class226.field2904, class226.field2881, class226.field2926);
                            field1423 = Statics.field479.field1303.containsKey(Statics.method3916(field1422)) ? class150.field2158 : class150.field2162;
                            client.method2630(20);
                            return;
                        }
                        int var24 = field1404 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1417 = 0;
                            field1422 = "";
                            field1405 = "";
                            Statics.field847 = 0;
                            Statics.field2123 = "";
                            field1425 = true;
                        }
                        while (true) {
                            while (class51.method455()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field1429.length(); var26++) {
                                    if (Statics.field3119 == field1429.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2772 == 13) {
                                    field1417 = 0;
                                    field1422 = "";
                                    field1405 = "";
                                    Statics.field847 = 0;
                                    Statics.field2123 = "";
                                    field1425 = true;
                                } else if (field1426 == 0) {
                                    if (Statics.field2772 == 85 && field1422.length() > 0) {
                                        field1422 = field1422.substring(0, field1422.length() - 1);
                                    }
                                    if (Statics.field2772 == 84 || Statics.field2772 == 80) {
                                        field1426 = 1;
                                    }
                                    if (var25 && field1422.length() < 320) {
                                        field1422 = field1422 + Statics.field3119;
                                    }
                                } else if (field1426 == 1) {
                                    if (Statics.field2772 == 85 && field1405.length() > 0) {
                                        field1405 = field1405.substring(0, field1405.length() - 1);
                                    }
                                    if (Statics.field2772 == 84 || Statics.field2772 == 80) {
                                        field1426 = 0;
                                    }
                                    if (Statics.field2772 == 84) {
                                        field1422 = field1422.trim();
                                        if (field1422.length() == 0) {
                                            method157(class226.field2942, class226.field2987, class226.field2956);
                                            return;
                                        }
                                        if (field1405.length() == 0) {
                                            method157(class226.field2945, class226.field2876, class226.field2947);
                                            return;
                                        }
                                        method157(class226.field2904, class226.field2881, class226.field2926);
                                        field1423 = Statics.field479.field1303.containsKey(Statics.method3916(field1422)) ? class150.field2158 : class150.field2162;
                                        client.method2630(20);
                                        return;
                                    }
                                    if (var25 && field1405.length() < 20) {
                                        field1405 = field1405 + Statics.field3119;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1417 == 3) {
                        int var27 = field1404 + 180;
                        short var28 = 276;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field1419 = class226.field3036;
                            field1430 = class226.field3037;
                            field1421 = class226.field3038;
                            field1417 = 2;
                            field1426 = 0;
                        }
                        int var29 = field1404 + 180;
                        short var30 = 326;
                        if (var10 == 1 && var11 >= var29 - 75 && var11 <= var29 + 75 && var12 >= var30 - 20 && var12 <= var30 + 20) {
                            method157(class226.field3054, class226.field3076, class226.field3095);
                            field1417 = 5;
                            return;
                        }
                    } else if (field1417 == 4) {
                        int var31 = field1404 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            Statics.field2123.trim();
                            if (Statics.field2123.length() != 6) {
                                method157(class226.field2861, class226.field2828, class226.field2997);
                                return;
                            }
                            Statics.field847 = Integer.parseInt(Statics.field2123);
                            Statics.field2123 = "";
                            field1423 = field1425 ? class150.field2159 : class150.field2161;
                            method157(class226.field2904, class226.field2881, class226.field2926);
                            client.method2630(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field1404 + 180 - 9 && var11 <= field1404 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field1425 = !field1425;
                        }
                        if (var10 == 1 && var11 >= field1404 + 180 - 34 && var11 <= field1404 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class57.method457(client.method316("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var33 = field1404 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field1417 = 0;
                            field1422 = "";
                            field1405 = "";
                            Statics.field847 = 0;
                            Statics.field2123 = "";
                        }
                        while (class51.method455()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field1428.length(); var35++) {
                                if (Statics.field3119 == field1428.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field2772 == 13) {
                                field1417 = 0;
                                field1422 = "";
                                field1405 = "";
                                Statics.field847 = 0;
                                Statics.field2123 = "";
                            } else {
                                if (Statics.field2772 == 85 && Statics.field2123.length() > 0) {
                                    Statics.field2123 = Statics.field2123.substring(0, Statics.field2123.length() - 1);
                                }
                                if (Statics.field2772 == 84) {
                                    Statics.field2123.trim();
                                    if (Statics.field2123.length() != 6) {
                                        method157(class226.field2861, class226.field2828, class226.field2997);
                                        return;
                                    }
                                    Statics.field847 = Integer.parseInt(Statics.field2123);
                                    Statics.field2123 = "";
                                    field1423 = field1425 ? class150.field2159 : class150.field2161;
                                    method157(class226.field2904, class226.field2881, class226.field2926);
                                    client.method2630(20);
                                    return;
                                }
                                if (var34 && Statics.field2123.length() < 6) {
                                    Statics.field2123 = Statics.field2123 + Statics.field3119;
                                }
                            }
                        }
                    } else if (field1417 == 5) {
                        int var36 = field1404 + 180 - 80;
                        short var37 = 321;
                        if (var10 == 1 && var11 >= var36 - 75 && var11 <= var36 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            method3129();
                            return;
                        }
                        int var38 = field1404 + 180 + 80;
                        if (var10 == 1 && var11 >= var38 - 75 && var11 <= var38 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            field1419 = class226.field3036;
                            field1430 = class226.field3037;
                            field1421 = class226.field3038;
                            field1417 = 2;
                            field1426 = 0;
                            field1405 = "";
                        }
                        while (class51.method455()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field1429.length(); var40++) {
                                if (Statics.field3119 == field1429.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field2772 == 13) {
                                field1419 = class226.field3036;
                                field1430 = class226.field3037;
                                field1421 = class226.field3038;
                                field1417 = 2;
                                field1426 = 0;
                                field1405 = "";
                            } else {
                                if (Statics.field2772 == 85 && field1422.length() > 0) {
                                    field1422 = field1422.substring(0, field1422.length() - 1);
                                }
                                if (Statics.field2772 == 84) {
                                    method3129();
                                    return;
                                }
                                if (var39 && field1422.length() < 320) {
                                    field1422 = field1422 + Statics.field3119;
                                }
                            }
                        }
                    } else if (field1417 == 6) {
                        while (true) {
                            do {
                                if (!class51.method455()) {
                                    short var41 = 321;
                                    if (var10 == 1 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                                        field1419 = class226.field3036;
                                        field1430 = class226.field3037;
                                        field1421 = class226.field3038;
                                        field1417 = 2;
                                        field1426 = 0;
                                        field1405 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2772 != 84 && Statics.field2772 != 13);
                            field1419 = class226.field3036;
                            field1430 = class226.field3037;
                            field1421 = class226.field3038;
                            field1417 = 2;
                            field1426 = 0;
                            field1405 = "";
                        }
                    }
                }
            }
        } else if (class60.field730 == 1 || !Statics.field700 && class60.field730 == 4) {
            int var1 = field1418 + 280;
            if (class60.field738 >= var1 && class60.field738 <= var1 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                class81.method877(0, 0);
            } else if (class60.field738 >= var1 + 15 && class60.field738 <= var1 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                class81.method877(0, 1);
            } else {
                int var2 = field1418 + 390;
                if (class60.field738 >= var2 && class60.field738 <= var2 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                    class81.method877(1, 0);
                } else if (class60.field738 >= var2 + 15 && class60.field738 <= var2 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                    class81.method877(1, 1);
                } else {
                    int var3 = field1418 + 500;
                    if (class60.field738 >= var3 && class60.field738 <= var3 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                        class81.method877(2, 0);
                    } else if (class60.field738 >= var3 + 15 && class60.field738 <= var3 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                        class81.method877(2, 1);
                    } else {
                        int var4 = field1418 + 610;
                        if (class60.field738 >= var4 && class60.field738 <= var4 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                            class81.method877(3, 0);
                        } else if (class60.field738 >= var4 + 15 && class60.field738 <= var4 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                            class81.method877(3, 1);
                        } else if (class60.field738 >= field1418 + 708 && class60.field724 >= 4 && class60.field738 <= field1418 + 708 + 50 && class60.field724 <= 20) {
                            field1402 = false;
                            Statics.field1395.method4629(field1418, 0);
                            Statics.field1400.method4629(field1418 + 382, 0);
                            Statics.field1401.method4614(field1418 + 382 - Statics.field1401.field3762 / 2, 18);
                        } else if (field1427 != -1) {
                            class81 var5 = Statics.field797[field1427];
                            method3758(var5);
                            field1402 = false;
                            Statics.field1395.method4629(field1418, 0);
                            Statics.field1400.method4629(field1418 + 382, 0);
                            Statics.field1401.method4614(field1418 + 382 - Statics.field1401.field3762 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ft.m(I)V")
    public static void method3129() {
        field1422 = field1422.trim();
        if (field1422.length() == 0) {
            method157(class226.field3054, class226.field3076, class226.field3095);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method316("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class174 var4 = new class174(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2355, var4.field2357, 1000 - var4.field2357);
                if (var5 == -1) {
                    var4.field2357 = 0;
                    long var8 = var4.method2865();
                    var6 = var8;
                    break;
                }
                var4.field2357 += var5;
                if (var4.field2357 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var53) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1422;
            Random var15 = new Random();
            class174 var16 = new class174(128);
            class174 var17 = new class174(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2922(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method3024(var15.nextInt());
            }
            var16.method3024(var18[0]);
            var16.method3024(var18[1]);
            var16.method2919(var6);
            var16.method2919(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method3024(var15.nextInt());
            }
            var16.method2880(class88.field1363, class88.field1364);
            var17.method2922(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method3024(var15.nextInt());
            }
            var17.method2919(var15.nextLong());
            var17.method2992(var15.nextLong());
            if (client.field952 == null) {
                byte[] var22 = new byte[24];
                try {
                    class156.field2208.method2063(0L);
                    class156.field2208.method2071(var22);
                    int var23;
                    for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                    }
                    if (var23 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var52) {
                    for (int var25 = 0; var25 < 24; var25++) {
                        var22[var25] = -1;
                    }
                }
                var17.method2957(var22, 0, var22.length);
            } else {
                var17.method2957(client.field952, 0, client.field952.length);
            }
            var17.method2919(var15.nextLong());
            var17.method2880(class88.field1363, class88.field1364);
            int var28 = class174.method84(var14);
            if (var28 % 8 != 0) {
                var28 += 8 - var28 % 8;
            }
            class174 var29 = new class174(var28);
            var29.method2851(var14);
            var29.field2357 = var28;
            var29.method2876(var18);
            class174 var30 = new class174(var29.field2357 + var17.field2357 + var16.field2357 + 5);
            var30.method2922(2);
            var30.method2922(var16.field2357);
            var30.method2957(var16.field2355, 0, var16.field2357);
            var30.method2922(var17.field2357);
            var30.method2957(var17.field2355, 0, var17.field2357);
            var30.method2846(var29.field2357);
            var30.method2957(var29.field2355, 0, var29.field2357);
            byte[] var31 = var30.field2355;
            int var32 = var31.length;
            StringBuilder var33 = new StringBuilder();
            for (int var34 = 0; var34 < var32; var34 += 3) {
                int var35 = var31[var34] & 0xFF;
                var33.append(class270.field3661[var35 >>> 2]);
                if (var34 < var32 - 1) {
                    int var36 = var31[var34 + 1] & 0xFF;
                    var33.append(class270.field3661[(var35 & 0x3) << 4 | var36 >>> 4]);
                    if (var34 < var32 - 2) {
                        int var37 = var31[var34 + 2] & 0xFF;
                        var33.append(class270.field3661[(var36 & 0xF) << 2 | var37 >>> 6]).append(class270.field3661[var37 & 0x3F]);
                    } else {
                        var33.append(class270.field3661[(var36 & 0xF) << 2]).append("=");
                    }
                } else {
                    var33.append(class270.field3661[(var35 & 0x3) << 4]).append("==");
                }
            }
            String var38 = var33.toString();
            String var40 = var38;
            byte var47;
            try {
                URL var41 = new URL(client.method316("services", false) + "m=accountappeal/login.ws");
                URLConnection var42 = var41.openConnection();
                var42.setDoInput(true);
                var42.setDoOutput(true);
                var42.setConnectTimeout(5000);
                OutputStreamWriter var43 = new OutputStreamWriter(var42.getOutputStream());
                var43.write("data2=" + class294.method1348(var40) + "&dest=" + class294.method1348("passwordchoice.ws"));
                var43.flush();
                InputStream var44 = var42.getInputStream();
                class174 var45 = new class174(new byte[1000]);
                while (true) {
                    int var46 = var44.read(var45.field2355, var45.field2357, 1000 - var45.field2357);
                    if (var46 == -1) {
                        var43.close();
                        var44.close();
                        String var48 = new String(var45.field2355);
                        if (var48.startsWith("OFFLINE")) {
                            var47 = 4;
                        } else if (var48.startsWith("WRONG")) {
                            var47 = 7;
                        } else if (var48.startsWith("RELOAD")) {
                            var47 = 3;
                        } else if (var48.startsWith("Not permitted for social network accounts.")) {
                            var47 = 6;
                        } else {
                            var45.method2958(var18);
                            while (var45.field2357 > 0 && var45.field2355[var45.field2357 - 1] == 0) {
                                var45.field2357--;
                            }
                            String var49 = new String(var45.field2355, 0, var45.field2357);
                            if (class88.method646(var49)) {
                                class57.method457(var49, true, false);
                                var47 = 2;
                            } else {
                                var47 = 5;
                            }
                        }
                        break;
                    }
                    var45.field2357 += var46;
                    if (var45.field2357 >= 1000) {
                        var47 = 5;
                        break;
                    }
                }
            } catch (Throwable var51) {
                var51.printStackTrace();
                var47 = 5;
            }
            var13 = var47;
        }
        switch(var13) {
            case 2:
                method157(class226.field3078, class226.field2890, class226.field3080);
                field1417 = 6;
                break;
            case 3:
                method157(class226.field3081, class226.field3011, class226.field2869);
                break;
            case 4:
                method157(class226.field3070, class226.field3085, class226.field3086);
                break;
            case 5:
                method157(class226.field2866, class226.field3088, class226.field3089);
                break;
            case 6:
                method157(class226.field3090, class226.field3077, class226.field3092);
                break;
            case 7:
                method157(class226.field3093, class226.field2962, class226.field3099);
        }
    }

    @ObfuscatedName("hn.s(Ljt;Ljt;Ljt;ZI)V")
    public static void method3704(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1418 = (Statics.field584 - 765) / 2;
            field1404 = field1418 + 202;
        }
        if (field1402) {
            if (Statics.field341 == null) {
                Statics.field341 = class287.method4441(Statics.field3670, "sl_back", "");
            }
            if (Statics.field2369 == null) {
                Statics.field2369 = class287.method4440(Statics.field3670, "sl_flags", "");
            }
            if (Statics.field522 == null) {
                Statics.field522 = class287.method4440(Statics.field3670, "sl_arrows", "");
            }
            if (Statics.field2281 == null) {
                Statics.field2281 = class287.method4440(Statics.field3670, "sl_stars", "");
            }
            class282.method4510(field1418, 23, 765, 480, 0);
            class282.method4515(field1418, 0, 125, 23, 12425273, 9135624);
            class282.method4515(field1418 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4334(class226.field3096, field1418 + 62, 15, 0, -1);
            if (Statics.field2281 != null) {
                Statics.field2281[1].method4614(field1418 + 140, 1);
                arg1.method4331(class226.field3017, field1418 + 152, 10, 16777215, -1);
                Statics.field2281[0].method4614(field1418 + 140, 12);
                arg1.method4331(class226.field3098, field1418 + 152, 21, 16777215, -1);
            }
            if (Statics.field522 != null) {
                int var4 = field1418 + 280;
                if (class81.field1282[0] == 0 && class81.field1286[0] == 0) {
                    Statics.field522[2].method4614(var4, 4);
                } else {
                    Statics.field522[0].method4614(var4, 4);
                }
                if (class81.field1282[0] == 0 && class81.field1286[0] == 1) {
                    Statics.field522[3].method4614(var4 + 15, 4);
                } else {
                    Statics.field522[1].method4614(var4 + 15, 4);
                }
                arg0.method4331(class226.field3019, var4 + 32, 17, 16777215, -1);
                int var5 = field1418 + 390;
                if (class81.field1282[0] == 1 && class81.field1286[0] == 0) {
                    Statics.field522[2].method4614(var5, 4);
                } else {
                    Statics.field522[0].method4614(var5, 4);
                }
                if (class81.field1282[0] == 1 && class81.field1286[0] == 1) {
                    Statics.field522[3].method4614(var5 + 15, 4);
                } else {
                    Statics.field522[1].method4614(var5 + 15, 4);
                }
                arg0.method4331(class226.field3100, var5 + 32, 17, 16777215, -1);
                int var6 = field1418 + 500;
                if (class81.field1282[0] == 2 && class81.field1286[0] == 0) {
                    Statics.field522[2].method4614(var6, 4);
                } else {
                    Statics.field522[0].method4614(var6, 4);
                }
                if (class81.field1282[0] == 2 && class81.field1286[0] == 1) {
                    Statics.field522[3].method4614(var6 + 15, 4);
                } else {
                    Statics.field522[1].method4614(var6 + 15, 4);
                }
                arg0.method4331(class226.field3101, var6 + 32, 17, 16777215, -1);
                int var7 = field1418 + 610;
                if (class81.field1282[0] == 3 && class81.field1286[0] == 0) {
                    Statics.field522[2].method4614(var7, 4);
                } else {
                    Statics.field522[0].method4614(var7, 4);
                }
                if (class81.field1282[0] == 3 && class81.field1286[0] == 1) {
                    Statics.field522[3].method4614(var7 + 15, 4);
                } else {
                    Statics.field522[1].method4614(var7 + 15, 4);
                }
                arg0.method4331(class226.field3102, var7 + 32, 17, 16777215, -1);
            }
            class282.method4510(field1418 + 708, 4, 50, 16, 0);
            arg1.method4334(class226.field2842, field1418 + 708 + 25, 16, 16777215, -1);
            field1427 = -1;
            if (Statics.field341 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1295) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1295) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1295) {
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
                int var19 = field1418 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1295; var22++) {
                    class81 var23 = Statics.field797[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1287);
                    if (var23.field1287 == -1) {
                        var25 = class226.field2899;
                        var24 = false;
                    } else if (var23.field1287 > 1980) {
                        var25 = class226.field3024;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1389()) {
                        if (var23.method1390()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1394()) {
                        var26 = 16711680;
                        if (var23.method1390()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1395()) {
                        if (var23.method1390()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1390()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field731 >= var19 && class60.field732 >= var18 && class60.field731 < var8 + var19 && class60.field732 < var9 + var18 && var24) {
                        field1427 = var22;
                        Statics.field341[var27].method4660(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field341[var27].method4629(var19, var18);
                    }
                    if (Statics.field2369 != null) {
                        Statics.field2369[(var23.method1390() ? 8 : 0) + var23.field1280].method4614(var19 + 29, var18);
                    }
                    arg0.method4334(Integer.toString(var23.field1288), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4334(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4326(Statics.field797[field1427].field1292) + 6;
                    int var29 = arg1.field3626 + 8;
                    class282.method4510(class60.field731 - var28 / 2, class60.field732 + 20 + 5, var28, var29, 16777120);
                    class282.method4523(class60.field731 - var28 / 2, class60.field732 + 20 + 5, var28, var29, 0);
                    arg1.method4334(Statics.field797[field1427].field1292, class60.field731, class60.field732 + 20 + 5 + arg1.field3626 + 4, 0, -1);
                }
            }
            Statics.field418.method700(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1395.method4629(field1418, 0);
            Statics.field1400.method4629(field1418 + 382, 0);
            Statics.field1401.method4614(field1418 + 382 - Statics.field1401.field3762 / 2, 18);
        }
        if (client.field922 == 0 || client.field922 == 5) {
            byte var30 = 20;
            arg0.method4334(class226.field3035, field1404 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class282.method4523(field1404 + 180 - 152, var31, 304, 34, 9179409);
            class282.method4523(field1404 + 180 - 151, var31 + 1, 302, 32, 0);
            class282.method4510(field1404 + 180 - 150, var31 + 2, field1399 * 3, 30, 9179409);
            class282.method4510(field1399 * 3 + (field1404 + 180 - 150), var31 + 2, 300 - field1399 * 3, 30, 0);
            arg0.method4334(field1416, field1404 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field922 == 20) {
            Statics.field1397.method4614(field1404 + 180 - Statics.field1397.field3762 / 2, 271 - Statics.field1397.field3761 / 2);
            short var32 = 211;
            arg0.method4334(field1419, field1404 + 180, var32, 16776960, 0);
            int var106 = var32 + 15;
            arg0.method4334(field1430, field1404 + 180, var106, 16776960, 0);
            int var107 = var106 + 15;
            arg0.method4334(field1421, field1404 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            int var109 = var108 + 10;
            if (field1417 != 4) {
                arg0.method4331(class226.field3057, field1404 + 180 - 110, var109, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1422; arg0.method4326(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4331(class265.method4330(var34), field1404 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                arg0.method4331(class226.field3058 + class271.method1360(field1405), field1404 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
            }
        }
        if (client.field922 == 10 || client.field922 == 11) {
            Statics.field1397.method4614(field1404, 171);
            if (field1417 == 0) {
                short var35 = 251;
                arg0.method4334(class226.field3060, field1404 + 180, var35, 16776960, 0);
                int var110 = var35 + 30;
                int var36 = field1404 + 180 - 80;
                short var37 = 291;
                Statics.field1398.method4614(var36 - 73, var37 - 20);
                arg0.method4335(class226.field3061, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1404 + 180 + 80;
                Statics.field1398.method4614(var38 - 73, var37 - 20);
                arg0.method4335(class226.field3062, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1417 == 1) {
                arg0.method4334(field1420, field1404 + 180, 211, 16776960, 0);
                short var39 = 236;
                arg0.method4334(field1419, field1404 + 180, var39, 16777215, 0);
                int var111 = var39 + 15;
                arg0.method4334(field1430, field1404 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                arg0.method4334(field1421, field1404 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                int var40 = field1404 + 180 - 80;
                short var41 = 321;
                Statics.field1398.method4614(var40 - 73, var41 - 20);
                arg0.method4334(class226.field3066, var40, var41 + 5, 16777215, 0);
                int var42 = field1404 + 180 + 80;
                Statics.field1398.method4614(var42 - 73, var41 - 20);
                arg0.method4334(class226.field2842, var42, var41 + 5, 16777215, 0);
            } else if (field1417 == 2) {
                short var43 = 211;
                arg0.method4334(field1419, field1404 + 180, var43, 16776960, 0);
                int var114 = var43 + 15;
                arg0.method4334(field1430, field1404 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg0.method4334(field1421, field1404 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var117 = var116 + 10;
                arg0.method4331(class226.field3057, field1404 + 180 - 110, var117, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = field1422; arg0.method4326(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4331(class265.method4330(var45) + (field1426 == 0 & client.field929 % 40 < 20 ? class89.method40(16776960) + class89.field1371 : ""), field1404 + 180 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                arg0.method4331(class226.field3058 + class271.method1360(field1405) + (field1426 == 1 & client.field929 % 40 < 20 ? class89.method40(16776960) + class89.field1371 : ""), field1404 + 180 - 108, var114, 16777215, 0);
                var114 += 15;
                int var46 = field1404 + 180 - 80;
                short var47 = 321;
                Statics.field1398.method4614(var46 - 73, var47 - 20);
                arg0.method4334(class226.field3063, var46, var47 + 5, 16777215, 0);
                int var48 = field1404 + 180 + 80;
                Statics.field1398.method4614(var48 - 73, var47 - 20);
                arg0.method4334(class226.field2842, var48, var47 + 5, 16777215, 0);
                short var49 = 357;
                arg1.method4334(class226.field2918, field1404 + 180, var49, 16776960, 0);
            } else if (field1417 == 3) {
                short var50 = 201;
                arg0.method4334(class226.field3065, field1404 + 180, var50, 16776960, 0);
                int var118 = var50 + 20;
                arg1.method4334(class226.field2908, field1404 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg1.method4334(class226.field3067, field1404 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var51 = field1404 + 180;
                short var52 = 276;
                Statics.field1398.method4614(var51 - 73, var52 - 20);
                arg2.method4334(class226.field3068, var51, var52 + 5, 16777215, 0);
                int var53 = field1404 + 180;
                short var54 = 326;
                Statics.field1398.method4614(var53 - 73, var54 - 20);
                arg2.method4334(class226.field2831, var53, var54 + 5, 16777215, 0);
            } else if (field1417 == 4) {
                arg0.method4334(class226.field3044, field1404 + 180, 211, 16776960, 0);
                short var55 = 236;
                arg0.method4334(field1419, field1404 + 180, var55, 16777215, 0);
                int var121 = var55 + 15;
                arg0.method4334(field1430, field1404 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method4334(field1421, field1404 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                String var57 = class226.field3059;
                String var58 = Statics.field2123;
                String var59 = class271.method883('*', var58.length());
                arg0.method4331(var57 + var59 + (client.field929 % 40 < 20 ? class89.method40(16776960) + class89.field1371 : ""), field1404 + 180 - 108, var123, 16777215, 0);
                int var124 = var123 - 8;
                arg0.method4331(class226.field2833, field1404 + 180 - 9, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method4331(class226.field2834, field1404 + 180 - 9, var125, 16776960, 0);
                int var60 = field1404 + 180 - 9 + arg0.method4326(class226.field2834) + 15;
                int var61 = var125 - arg0.field3626;
                class285 var62;
                if (field1425) {
                    var62 = Statics.field414;
                } else {
                    var62 = Statics.field2383;
                }
                var62.method4614(var60, var61);
                var121 = var125 + 15;
                int var63 = field1404 + 180 - 80;
                short var64 = 321;
                Statics.field1398.method4614(var63 - 73, var64 - 20);
                arg0.method4334(class226.field3066, var63, var64 + 5, 16777215, 0);
                int var65 = field1404 + 180 + 80;
                Statics.field1398.method4614(var65 - 73, var64 - 20);
                arg0.method4334(class226.field2842, var65, var64 + 5, 16777215, 0);
                arg1.method4334(class226.field3097, field1404 + 180, var64 + 36, 255, 0);
            } else if (field1417 == 5) {
                arg0.method4334(class226.field3071, field1404 + 180, 201, 16776960, 0);
                short var66 = 221;
                arg2.method4334(field1419, field1404 + 180, var66, 16776960, 0);
                int var126 = var66 + 15;
                arg2.method4334(field1430, field1404 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg2.method4334(field1421, field1404 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var129 = var128 + 14;
                arg0.method4331(class226.field3072, field1404 + 180 - 145, var129, 16777215, 0);
                short var67 = 174;
                String var68;
                for (var68 = field1422; arg0.method4326(var68) > var67; var68 = var68.substring(1)) {
                }
                arg0.method4331(class265.method4330(var68) + (client.field929 % 40 < 20 ? class89.method40(16776960) + class89.field1371 : ""), field1404 + 180 - 34, var129, 16777215, 0);
                var126 = var129 + 15;
                int var69 = field1404 + 180 - 80;
                short var70 = 321;
                Statics.field1398.method4614(var69 - 73, var70 - 20);
                arg0.method4334(class226.field3073, var69, var70 + 5, 16777215, 0);
                int var71 = field1404 + 180 + 80;
                Statics.field1398.method4614(var71 - 73, var70 - 20);
                arg0.method4334(class226.field3074, var71, var70 + 5, 16777215, 0);
            } else if (field1417 == 6) {
                short var72 = 211;
                arg0.method4334(field1419, field1404 + 180, var72, 16776960, 0);
                int var130 = var72 + 15;
                arg0.method4334(field1430, field1404 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method4334(field1421, field1404 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var73 = field1404 + 180;
                short var74 = 321;
                Statics.field1398.method4614(var73 - 73, var74 - 20);
                arg0.method4334(class226.field3074, var73, var74 + 5, 16777215, 0);
            }
        }
        if (field1413 > 0) {
            int var75 = field1413;
            short var76 = 256;
            field1411 += var75 * 128;
            if (field1411 > Statics.field1407.length) {
                field1411 -= Statics.field1407.length;
                int var77 = (int) (Math.random() * 12.0D);
                method143(Statics.field494[var77]);
            }
            int var78 = 0;
            int var79 = var75 * 128;
            int var80 = (var76 - var75) * 128;
            for (int var81 = 0; var81 < var80; var81++) {
                int var82 = Statics.field349[var78 + var79] - Statics.field1407[field1411 + var78 & Statics.field1407.length - 1] * var75 / 6;
                if (var82 < 0) {
                    var82 = 0;
                }
                Statics.field349[var78++] = var82;
            }
            for (int var83 = var76 - var75; var83 < var76; var83++) {
                int var84 = var83 * 128;
                for (int var85 = 0; var85 < 128; var85++) {
                    int var86 = (int) (Math.random() * 100.0D);
                    if (var86 < 50 && var85 > 10 && var85 < 118) {
                        Statics.field349[var84 + var85] = 255;
                    } else {
                        Statics.field349[var84 + var85] = 0;
                    }
                }
            }
            if (field1396 > 0) {
                field1396 -= var75 * 4;
            }
            if (field1408 > 0) {
                field1408 -= var75 * 4;
            }
            if (field1396 == 0 && field1408 == 0) {
                int var87 = (int) (Math.random() * (double) (2000 / var75));
                if (var87 == 0) {
                    field1396 = 1024;
                }
                if (var87 == 1) {
                    field1408 = 1024;
                }
            }
            for (int var88 = 0; var88 < var76 - var75; var88++) {
                field1424[var88] = field1424[var75 + var88];
            }
            for (int var89 = var76 - var75; var89 < var76; var89++) {
                field1424[var89] = (int) (Math.sin((double) field1414 / 14.0D) * 16.0D + Math.sin((double) field1414 / 15.0D) * 14.0D + Math.sin((double) field1414 / 16.0D) * 12.0D);
                field1414++;
            }
            field1412 += var75 * -336833311;
            int var90 = ((client.field929 & 0x1) + var75) / 2;
            if (var90 > 0) {
                for (int var91 = 0; var91 < field1412 * 657025252; var91++) {
                    int var92 = (int) (Math.random() * 124.0D) + 2;
                    int var93 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field349[(var93 << 7) + var92] = 192;
                }
                field1412 = 0;
                int var94 = 0;
                label418: while (true) {
                    if (var94 >= var76) {
                        int var98 = 0;
                        while (true) {
                            if (var98 >= 128) {
                                break label418;
                            }
                            int var99 = 0;
                            for (int var100 = -var90; var100 < var76; var100++) {
                                int var101 = var100 * 128;
                                if (var90 + var100 < var76) {
                                    var99 += Statics.field1272[var90 * 128 + var98 + var101];
                                }
                                if (var100 - (var90 + 1) >= 0) {
                                    var99 -= Statics.field1272[var98 + var101 - (var90 + 1) * 128];
                                }
                                if (var100 >= 0) {
                                    Statics.field349[var98 + var101] = var99 / (var90 * 2 + 1);
                                }
                            }
                            var98++;
                        }
                    }
                    int var95 = 0;
                    int var96 = var94 * 128;
                    for (int var97 = -var90; var97 < 128; var97++) {
                        if (var90 + var97 < 128) {
                            var95 += Statics.field349[var96 + var97 + var90];
                        }
                        if (var97 - (var90 + 1) >= 0) {
                            var95 -= Statics.field349[var96 + var97 - (var90 + 1)];
                        }
                        if (var97 >= 0) {
                            Statics.field1272[var96 + var97] = var95 / (var90 * 2 + 1);
                        }
                    }
                    var94++;
                }
            }
            field1413 = 0;
        }
        method2659();
        Statics.field2376[Statics.field479.field1301 ? 1 : 0].method4614(field1418 + 765 - 40, 463);
        if (client.field922 <= 5 || client.field920 != 0) {
            return;
        }
        if (Statics.field523 == null) {
            Statics.field523 = class287.method2615(Statics.field3670, "sl_button", "");
            return;
        }
        int var102 = field1418 + 5;
        short var103 = 463;
        byte var104 = 100;
        byte var105 = 35;
        Statics.field523.method4614(var102, var103);
        arg0.method4334(class226.field2990 + " " + client.field915, var104 / 2 + var102, var105 / 2 + var103 - 2, 16777215, 0);
        if (Statics.field3642 == null) {
            arg1.method4334(class226.field3106, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
        } else {
            arg1.method4334(class226.field3091, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("n.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method157(String arg0, String arg1, String arg2) {
        field1419 = arg0;
        field1430 = arg1;
        field1421 = arg2;
    }

    @ObfuscatedName("f.p(Ljx;I)V")
    public static final void method143(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1407.length; var2++) {
            Statics.field1407[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1407[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1410[var8] = (Statics.field1407[var8 - 1] + Statics.field1407[var8 + 1] + Statics.field1407[var8 - 128] + Statics.field1407[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1407;
            Statics.field1407 = Statics.field1410;
            Statics.field1410 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3761; var11++) {
            for (int var12 = 0; var12 < arg0.field3762; var12++) {
                if (arg0.field3767[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3763;
                    int var14 = var11 + 16 + arg0.field3765;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1407[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bk.k(IIII)I")
    public static final int method929(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ew.r(I)V")
    public static final void method2659() {
        short var0 = 256;
        if (field1396 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1396 > 768) {
                    Statics.field817[var1] = method929(Statics.field432[var1], Statics.field1406[var1], 1024 - field1396);
                } else if (field1396 > 256) {
                    Statics.field817[var1] = Statics.field1406[var1];
                } else {
                    Statics.field817[var1] = method929(Statics.field1406[var1], Statics.field432[var1], 256 - field1396);
                }
            }
        } else if (field1408 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1408 > 768) {
                    Statics.field817[var2] = method929(Statics.field432[var2], Statics.field1971[var2], 1024 - field1408);
                } else if (field1408 > 256) {
                    Statics.field817[var2] = Statics.field1971[var2];
                } else {
                    Statics.field817[var2] = method929(Statics.field1971[var2], Statics.field432[var2], 256 - field1408);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field817[var3] = Statics.field432[var3];
            }
        }
        class282.method4528(field1418, 9, field1418 + 128, var0 + 7);
        Statics.field1395.method4629(field1418, 0);
        class282.method4501();
        int var4 = 0;
        int var5 = field1418 + Statics.field418.field3748 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1424[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field349[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field817[var10];
                    int var14 = Statics.field418.field3749[var5];
                    Statics.field418.field3749[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field418.field3748 + var8 - 128;
        }
        class282.method4528(field1418 + 765 - 128, 9, field1418 + 765, var0 + 7);
        Statics.field1400.method4629(field1418 + 382, 0);
        class282.method4501();
        int var15 = 0;
        int var16 = field1418 + Statics.field418.field3748 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1424[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field349[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field817[var22];
                    int var26 = Statics.field418.field3749[var20];
                    Statics.field418.field3749[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field418.field3748 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ip.w(Lcw;I)V")
    public static void method3758(class81 arg0) {
        if (arg0.method1390() != client.field996) {
            client.field996 = arg0.method1390();
            class257.method3695(arg0.method1390());
        }
        Statics.field1521 = arg0.field1291;
        client.field915 = arg0.field1288;
        client.field916 = arg0.field1289;
        Statics.field828 = client.field949 == 0 ? 43594 : arg0.field1288 + 40000;
        Statics.field457 = client.field949 == 0 ? 443 : arg0.field1288 + 50000;
        Statics.field311 = Statics.field828;
    }

    @ObfuscatedName("im.v(B)V")
    public static void method3710() {
        if (class81.method953()) {
            field1402 = true;
        }
    }
}
