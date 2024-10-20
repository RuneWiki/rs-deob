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

@ObfuscatedName("cb")
public class class94 {

    @ObfuscatedName("cb.n")
    public static int field1425 = 0;

    @ObfuscatedName("cb.c")
    public static int field1436 = field1425 + 202;

    @ObfuscatedName("cb.a")
    public static int[] field1426 = new int[256];

    @ObfuscatedName("cb.x")
    public static int field1428 = 0;

    @ObfuscatedName("cb.i")
    public static int field1432 = 0;

    @ObfuscatedName("cb.au")
    public static int field1430 = 0;

    @ObfuscatedName("cb.ah")
    public static int field1431 = 0;

    @ObfuscatedName("cb.ao")
    public static int field1427 = 0;

    @ObfuscatedName("cb.al")
    public static int field1433 = 0;

    @ObfuscatedName("cb.ae")
    public static int field1434 = 10;

    @ObfuscatedName("cb.ax")
    public static String field1435 = "";

    @ObfuscatedName("cb.az")
    public static int field1443 = 0;

    @ObfuscatedName("cb.aw")
    public static String field1449 = "";

    @ObfuscatedName("cb.av")
    public static String field1438 = "";

    @ObfuscatedName("cb.ac")
    public static String field1419 = "";

    @ObfuscatedName("cb.ak")
    public static String field1440 = "";

    @ObfuscatedName("cb.ad")
    public static String field1441 = "";

    @ObfuscatedName("cb.at")
    public static String field1451 = "";

    @ObfuscatedName("cb.af")
    public static class151 field1448 = class151.field2185;

    @ObfuscatedName("cb.as")
    public static boolean field1444 = true;

    @ObfuscatedName("cb.ab")
    public static int field1445 = 0;

    @ObfuscatedName("cb.ap")
    public static String field1446 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cb.ai")
    public static String field1447 = "1234567890";

    @ObfuscatedName("cb.ar")
    public static boolean field1424 = false;

    @ObfuscatedName("cb.ba")
    public static int field1450 = -1;

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.e(Lit;Lit;I)I")
    public static int method1597(class237 arg0, class237 arg1) {
        int var2 = 0;
        if (arg0.method3837("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3837("logo", "")) {
            var2++;
        }
        if (arg1.method3837("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3837("titlebox", "")) {
            var2++;
        }
        if (arg1.method3837("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3837("runes", "")) {
            var2++;
        }
        if (arg1.method3837("title_mute", "")) {
            var2++;
        }
        if (arg1.method3837("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3837("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3837("sl_back", "");
        arg1.method3837("sl_flags", "");
        arg1.method3837("sl_arrows", "");
        arg1.method3837("sl_stars", "");
        arg1.method3837("sl_button", "");
        return var2;
    }

    @ObfuscatedName("aa.n(B)I")
    public static int method677() {
        return 9;
    }

    @ObfuscatedName("cd.g(Lit;Lit;ZIB)V")
    public static void method1608(class237 arg0, class237 arg1, boolean arg2, int arg3) {
        if (!Statics.field1452) {
            field1443 = arg3;
            class283.method4645();
            byte[] var4 = arg0.method3846("title.jpg", "");
            Object var5 = null;
            class287 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class287(var9, var7, var8);
                    break label144;
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class287(0, 0);
            }
            Statics.field1420 = var11;
            Statics.field1323 = Statics.field1420.method4834();
            if ((client.field918 & 0x20000000) == 0) {
                Statics.field851 = class288.method1974(arg1, "logo", "");
            } else {
                Statics.field851 = class288.method1974(arg1, "logo_deadman_mode", "");
            }
            Statics.field1421 = class288.method1974(arg1, "titlebox", "");
            Statics.field1422 = class288.method1974(arg1, "titlebutton", "");
            Statics.field590 = Statics.method49(arg1, "runes", "");
            Statics.field1439 = Statics.method49(arg1, "title_mute", "");
            Statics.field2477 = class288.method1974(arg1, "options_radio_buttons,0", "");
            Statics.field1325 = class288.method1974(arg1, "options_radio_buttons,2", "");
            Statics.field277 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field277[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field277[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field277[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field277[var17 + 192] = 16777215;
            }
            Statics.field1442 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field1442[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field1442[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field1442[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field1442[var21 + 192] = 16777215;
            }
            Statics.field591 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field591[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field591[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field591[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field591[var25 + 192] = 16777215;
            }
            Statics.field1366 = new int[256];
            Statics.field317 = new int[32768];
            Statics.field1504 = new int[32768];
            method1752((class286) null);
            Statics.field848 = new int[32768];
            Statics.field1369 = new int[32768];
            if (arg2) {
                field1441 = "";
                field1451 = "";
            }
            Statics.field604 = 0;
            Statics.field597 = "";
            field1444 = true;
            field1424 = false;
            if (Statics.field2198.field1299) {
                class205.field2488 = 1;
                Statics.field2489 = null;
                Statics.field274 = -1;
                Statics.field2490 = -1;
                Statics.field2491 = 0;
                Statics.field473 = false;
                Statics.field2492 = 2;
            } else {
                class239 var26 = Statics.field3307;
                int var27 = var26.method3829("scape main");
                int var28 = var26.method3834(var27, "");
                class205.field2488 = 1;
                Statics.field2489 = var26;
                Statics.field274 = var27;
                Statics.field2490 = var28;
                Statics.field2491 = 255;
                Statics.field473 = false;
                Statics.field2492 = 2;
            }
            class240.method4567(false);
            Statics.field1452 = true;
            field1425 = (Statics.field1365 - 765) / 2;
            field1436 = field1425 + 202;
            Statics.field1420.method4764(field1425, 0);
            Statics.field1323.method4764(field1425 + 382, 0);
            Statics.field851.method4734(field1425 + 382 - Statics.field851.field3758 / 2, 18);
        } else if (arg3 == 4) {
            field1443 = 4;
        }
    }

    @ObfuscatedName("eq.y(B)V")
    public static void method2701() {
        if (!Statics.field1452) {
            return;
        }
        Statics.field1421 = null;
        Statics.field1422 = null;
        Statics.field590 = null;
        Statics.field1420 = null;
        Statics.field1323 = null;
        Statics.field851 = null;
        Statics.field1439 = null;
        Statics.field2477 = null;
        Statics.field1325 = null;
        Statics.field656 = null;
        Statics.field1423 = null;
        Statics.field1272 = null;
        Statics.field1505 = null;
        Statics.field320 = null;
        Statics.field277 = null;
        Statics.field1442 = null;
        Statics.field591 = null;
        Statics.field1366 = null;
        Statics.field317 = null;
        Statics.field1504 = null;
        Statics.field848 = null;
        Statics.field1369 = null;
        class205.field2488 = 1;
        Statics.field2489 = null;
        Statics.field274 = -1;
        Statics.field2490 = -1;
        Statics.field2491 = 0;
        Statics.field473 = false;
        Statics.field2492 = 2;
        class240.method4567(true);
        Statics.field1452 = false;
    }

    @ObfuscatedName("cl.w(Lbp;B)V")
    public static void method1569(class59 arg0) {
        if (!field1424) {
            if ((class60.field735 == 1 || !Statics.field646 && class60.field735 == 4) && class60.field726 >= field1425 + 765 - 50 && class60.field727 >= 453) {
                Statics.field2198.field1299 = !Statics.field2198.field1299;
                class82.method1649();
                if (Statics.field2198.field1299) {
                    Statics.field2487.method3479();
                    class205.field2488 = 1;
                    Statics.field2489 = null;
                } else {
                    class239 var6 = Statics.field3307;
                    int var7 = var6.method3829("scape main");
                    int var8 = var6.method3834(var7, "");
                    class205.method248(var6, var7, var8, 255, false);
                }
            }
            if (client.field923 != 5) {
                field1427++;
                if (client.field923 == 10 || client.field923 == 11) {
                    if (client.field1014 == 0) {
                        if (class60.field735 == 1 || !Statics.field646 && class60.field735 == 4) {
                            int var9 = field1425 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class60.field726 >= var9 && class60.field726 <= var9 + var11 && class60.field727 >= var10 && class60.field727 <= var10 + var12) {
                                if (class81.method2752()) {
                                    field1424 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1289 != null && class81.method2752()) {
                            field1424 = true;
                        }
                    }
                    int var13 = class60.field735;
                    int var14 = class60.field726;
                    int var15 = class60.field727;
                    if (!Statics.field646 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field1443 == 0) {
                        boolean var16 = false;
                        while (class51.method249()) {
                            if (Statics.field2590 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field1436 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            class57.method43(client.method1603("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var19 = field1436 + 180 + 80;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field918 & 0x2000000) != 0) {
                                field1449 = "";
                                field1438 = class227.field3050;
                                field1419 = class227.field3051;
                                field1440 = class227.field3052;
                                field1443 = 1;
                                field1445 = 0;
                            } else if ((client.field918 & 0x4) != 0) {
                                if ((client.field918 & 0x400) == 0) {
                                    field1438 = class227.field2981;
                                    field1419 = class227.field3042;
                                    field1440 = class227.field2876;
                                } else {
                                    field1438 = class227.field3047;
                                    field1419 = class227.field3048;
                                    field1440 = class227.field3049;
                                }
                                field1449 = class227.field3083;
                                field1443 = 1;
                                field1445 = 0;
                            } else if ((client.field918 & 0x400) == 0) {
                                field1438 = class227.field2930;
                                field1419 = class227.field2841;
                                field1440 = class227.field3039;
                                field1443 = 2;
                                field1445 = 0;
                            } else {
                                field1438 = class227.field3044;
                                field1419 = class227.field2848;
                                field1440 = class227.field2950;
                                field1449 = class227.field3083;
                                field1443 = 1;
                                field1445 = 0;
                            }
                        }
                    } else if (field1443 == 1) {
                        while (class51.method249()) {
                            if (Statics.field2590 == 84) {
                                field1438 = class227.field2930;
                                field1419 = class227.field2841;
                                field1440 = class227.field3039;
                                field1443 = 2;
                                field1445 = 0;
                            } else if (Statics.field2590 == 13) {
                                field1443 = 0;
                            }
                        }
                        int var20 = field1436 + 180 - 80;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field1438 = class227.field2930;
                            field1419 = class227.field2841;
                            field1440 = class227.field3039;
                            field1443 = 2;
                            field1445 = 0;
                        }
                        int var22 = field1436 + 180 + 80;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field1443 = 0;
                        }
                    } else if (field1443 == 2) {
                        short var23 = 231;
                        int var45 = var23 + 30;
                        if (var13 == 1 && var15 >= var45 - 15 && var15 < var45) {
                            field1445 = 0;
                        }
                        var45 += 15;
                        if (var13 == 1 && var15 >= var45 - 15 && var15 < var45) {
                            field1445 = 1;
                        }
                        var45 += 15;
                        short var24 = 361;
                        if (var13 == 1 && var15 >= var24 - 15 && var15 < var24) {
                            method148(class227.field3076, class227.field3077, class227.field3078);
                            field1443 = 5;
                            return;
                        }
                        int var25 = field1436 + 180 - 80;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field1441 = field1441.trim();
                            if (field1441.length() == 0) {
                                method148(class227.field3041, class227.field2944, class227.field2945);
                                return;
                            }
                            if (field1451.length() == 0) {
                                method148(class227.field2946, class227.field2947, class227.field2948);
                                return;
                            }
                            method148(class227.field3059, class227.field3056, class227.field3057);
                            field1448 = Statics.field2198.field1294.containsKey(class272.method4019(field1441)) ? class151.field2186 : class151.field2185;
                            client.method241(20);
                            return;
                        }
                        int var27 = field1436 + 180 + 80;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field1443 = 0;
                            field1441 = "";
                            field1451 = "";
                            Statics.field604 = 0;
                            Statics.field597 = "";
                            field1444 = true;
                        }
                        while (true) {
                            while (class51.method249()) {
                                boolean var28 = false;
                                for (int var29 = 0; var29 < field1446.length(); var29++) {
                                    if (Statics.field1293 == field1446.charAt(var29)) {
                                        var28 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2590 == 13) {
                                    field1443 = 0;
                                    field1441 = "";
                                    field1451 = "";
                                    Statics.field604 = 0;
                                    Statics.field597 = "";
                                    field1444 = true;
                                } else if (field1445 == 0) {
                                    if (Statics.field2590 == 85 && field1441.length() > 0) {
                                        field1441 = field1441.substring(0, field1441.length() - 1);
                                    }
                                    if (Statics.field2590 == 84 || Statics.field2590 == 80) {
                                        field1445 = 1;
                                    }
                                    if (var28 && field1441.length() < 320) {
                                        field1441 = field1441 + Statics.field1293;
                                    }
                                } else if (field1445 == 1) {
                                    if (Statics.field2590 == 85 && field1451.length() > 0) {
                                        field1451 = field1451.substring(0, field1451.length() - 1);
                                    }
                                    if (Statics.field2590 == 84 || Statics.field2590 == 80) {
                                        field1445 = 0;
                                    }
                                    if (Statics.field2590 == 84) {
                                        field1441 = field1441.trim();
                                        if (field1441.length() == 0) {
                                            method148(class227.field3041, class227.field2944, class227.field2945);
                                            return;
                                        }
                                        if (field1451.length() == 0) {
                                            method148(class227.field2946, class227.field2947, class227.field2948);
                                            return;
                                        }
                                        method148(class227.field3059, class227.field3056, class227.field3057);
                                        field1448 = Statics.field2198.field1294.containsKey(class272.method4019(field1441)) ? class151.field2186 : class151.field2185;
                                        client.method241(20);
                                        return;
                                    }
                                    if (var28 && field1451.length() < 20) {
                                        field1451 = field1451 + Statics.field1293;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1443 == 3) {
                        int var30 = field1436 + 180;
                        short var31 = 276;
                        if (var13 == 1 && var14 >= var30 - 75 && var14 <= var30 + 75 && var15 >= var31 - 20 && var15 <= var31 + 20) {
                            field1438 = class227.field2930;
                            field1419 = class227.field2841;
                            field1440 = class227.field3039;
                            field1443 = 2;
                            field1445 = 0;
                        }
                        int var32 = field1436 + 180;
                        short var33 = 326;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var33 - 20 && var15 <= var33 + 20) {
                            method148(class227.field3076, class227.field3077, class227.field3078);
                            field1443 = 5;
                            return;
                        }
                    } else if (field1443 == 4) {
                        int var34 = field1436 + 180 - 80;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            Statics.field597.trim();
                            if (Statics.field597.length() != 6) {
                                method148(class227.field2839, class227.field2935, class227.field2862);
                                return;
                            }
                            Statics.field604 = Integer.parseInt(Statics.field597);
                            Statics.field597 = "";
                            field1448 = field1444 ? class151.field2182 : class151.field2184;
                            method148(class227.field3059, class227.field3056, class227.field3057);
                            client.method241(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field1436 + 180 - 9 && var14 <= field1436 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field1444 = !field1444;
                        }
                        if (var13 == 1 && var14 >= field1436 + 180 - 34 && var14 <= field1436 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class57.method43(client.method1603("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var36 = field1436 + 180 + 80;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field1443 = 0;
                            field1441 = "";
                            field1451 = "";
                            Statics.field604 = 0;
                            Statics.field597 = "";
                        }
                        while (class51.method249()) {
                            boolean var37 = false;
                            for (int var38 = 0; var38 < field1447.length(); var38++) {
                                if (Statics.field1293 == field1447.charAt(var38)) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (Statics.field2590 == 13) {
                                field1443 = 0;
                                field1441 = "";
                                field1451 = "";
                                Statics.field604 = 0;
                                Statics.field597 = "";
                            } else {
                                if (Statics.field2590 == 85 && Statics.field597.length() > 0) {
                                    Statics.field597 = Statics.field597.substring(0, Statics.field597.length() - 1);
                                }
                                if (Statics.field2590 == 84) {
                                    Statics.field597.trim();
                                    if (Statics.field597.length() != 6) {
                                        method148(class227.field2839, class227.field2935, class227.field2862);
                                        return;
                                    }
                                    Statics.field604 = Integer.parseInt(Statics.field597);
                                    Statics.field597 = "";
                                    field1448 = field1444 ? class151.field2182 : class151.field2184;
                                    method148(class227.field3059, class227.field3056, class227.field3057);
                                    client.method241(20);
                                    return;
                                }
                                if (var37 && Statics.field597.length() < 6) {
                                    Statics.field597 = Statics.field597 + Statics.field1293;
                                }
                            }
                        }
                    } else if (field1443 == 5) {
                        int var39 = field1436 + 180 - 80;
                        short var40 = 321;
                        if (var13 == 1 && var14 >= var39 - 75 && var14 <= var39 + 75 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                            method1001();
                            return;
                        }
                        int var41 = field1436 + 180 + 80;
                        if (var13 == 1 && var14 >= var41 - 75 && var14 <= var41 + 75 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                            field1438 = class227.field2930;
                            field1419 = class227.field2841;
                            field1440 = class227.field3039;
                            field1443 = 2;
                            field1445 = 0;
                            field1451 = "";
                        }
                        while (class51.method249()) {
                            boolean var42 = false;
                            for (int var43 = 0; var43 < field1446.length(); var43++) {
                                if (Statics.field1293 == field1446.charAt(var43)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (Statics.field2590 == 13) {
                                field1438 = class227.field2930;
                                field1419 = class227.field2841;
                                field1440 = class227.field3039;
                                field1443 = 2;
                                field1445 = 0;
                                field1451 = "";
                            } else {
                                if (Statics.field2590 == 85 && field1441.length() > 0) {
                                    field1441 = field1441.substring(0, field1441.length() - 1);
                                }
                                if (Statics.field2590 == 84) {
                                    method1001();
                                    return;
                                }
                                if (var42 && field1441.length() < 320) {
                                    field1441 = field1441 + Statics.field1293;
                                }
                            }
                        }
                    } else if (field1443 == 6) {
                        while (true) {
                            do {
                                if (!class51.method249()) {
                                    short var44 = 321;
                                    if (var13 == 1 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                                        field1438 = class227.field2930;
                                        field1419 = class227.field2841;
                                        field1440 = class227.field3039;
                                        field1443 = 2;
                                        field1445 = 0;
                                        field1451 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2590 != 84 && Statics.field2590 != 13);
                            field1438 = class227.field2930;
                            field1419 = class227.field2841;
                            field1440 = class227.field3039;
                            field1443 = 2;
                            field1445 = 0;
                            field1451 = "";
                        }
                    }
                }
            }
        } else if (class60.field735 == 1 || !Statics.field646 && class60.field735 == 4) {
            int var1 = field1425 + 280;
            if (class60.field726 >= var1 && class60.field726 <= var1 + 14 && class60.field727 >= 4 && class60.field727 <= 18) {
                class81.method3787(0, 0);
            } else if (class60.field726 >= var1 + 15 && class60.field726 <= var1 + 80 && class60.field727 >= 4 && class60.field727 <= 18) {
                class81.method3787(0, 1);
            } else {
                int var2 = field1425 + 390;
                if (class60.field726 >= var2 && class60.field726 <= var2 + 14 && class60.field727 >= 4 && class60.field727 <= 18) {
                    class81.method3787(1, 0);
                } else if (class60.field726 >= var2 + 15 && class60.field726 <= var2 + 80 && class60.field727 >= 4 && class60.field727 <= 18) {
                    class81.method3787(1, 1);
                } else {
                    int var3 = field1425 + 500;
                    if (class60.field726 >= var3 && class60.field726 <= var3 + 14 && class60.field727 >= 4 && class60.field727 <= 18) {
                        class81.method3787(2, 0);
                    } else if (class60.field726 >= var3 + 15 && class60.field726 <= var3 + 80 && class60.field727 >= 4 && class60.field727 <= 18) {
                        class81.method3787(2, 1);
                    } else {
                        int var4 = field1425 + 610;
                        if (class60.field726 >= var4 && class60.field726 <= var4 + 14 && class60.field727 >= 4 && class60.field727 <= 18) {
                            class81.method3787(3, 0);
                        } else if (class60.field726 >= var4 + 15 && class60.field726 <= var4 + 80 && class60.field727 >= 4 && class60.field727 <= 18) {
                            class81.method3787(3, 1);
                        } else if (class60.field726 >= field1425 + 708 && class60.field727 >= 4 && class60.field726 <= field1425 + 708 + 50 && class60.field727 <= 20) {
                            field1424 = false;
                            Statics.field1420.method4764(field1425, 0);
                            Statics.field1323.method4764(field1425 + 382, 0);
                            Statics.field851.method4734(field1425 + 382 - Statics.field851.field3758 / 2, 18);
                        } else if (field1450 != -1) {
                            class81 var5 = Statics.field649[field1450];
                            method926(var5);
                            field1424 = false;
                            Statics.field1420.method4764(field1425, 0);
                            Statics.field1323.method4764(field1425 + 382, 0);
                            Statics.field851.method4734(field1425 + 382 - Statics.field851.field3758 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bb.k(I)V")
    public static void method1001() {
        field1441 = field1441.trim();
        if (field1441.length() == 0) {
            method148(class227.field3076, class227.field3077, class227.field3078);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1603("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class175 var4 = new class175(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2376, var4.field2381, 1000 - var4.field2381);
                if (var5 == -1) {
                    var4.field2381 = 0;
                    long var8 = var4.method2934();
                    var6 = var8;
                    break;
                }
                var4.field2381 += var5;
                if (var4.field2381 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var37) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1441;
            Random var15 = new Random();
            class175 var16 = new class175(128);
            class175 var17 = new class175(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2913(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2916(var15.nextInt());
            }
            var16.method2916(var18[0]);
            var16.method2916(var18[1]);
            var16.method3080(var6);
            var16.method3080(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2916(var15.nextInt());
            }
            var16.method2949(class89.field1375, class89.field1370);
            var17.method2913(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2916(var15.nextInt());
            }
            var17.method3080(var15.nextLong());
            var17.method2917(var15.nextLong());
            client.method1037(var17);
            var17.method3080(var15.nextLong());
            var17.method2949(class89.field1375, class89.field1370);
            int var22 = class175.method563(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class175 var23 = new class175(var22);
            var23.method2927(var14);
            var23.field2381 = var22;
            var23.method2945(var18);
            class175 var24 = new class175(var23.field2381 + var17.field2381 + var16.field2381 + 5);
            var24.method2913(2);
            var24.method2913(var16.field2381);
            var24.method3122(var16.field2376, 0, var16.field2381);
            var24.method2913(var17.field2381);
            var24.method3122(var17.field2376, 0, var17.field2381);
            var24.method2914(var23.field2381);
            var24.method3122(var23.field2376, 0, var23.field2381);
            String var25 = class271.method2902(var24.field2376);
            byte var32;
            try {
                URL var26 = new URL(client.method1603("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class295.method3141(var25) + "&dest=" + class295.method3141("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class175 var30 = new class175(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2376, var30.field2381, 1000 - var30.field2381);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2376);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2946(var18);
                            while (var30.field2381 > 0 && var30.field2376[var30.field2381 - 1] == 0) {
                                var30.field2381--;
                            }
                            String var34 = new String(var30.field2376, 0, var30.field2381);
                            if (class89.method302(var34)) {
                                class57.method43(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2381 += var31;
                    if (var30.field2381 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var36) {
                var36.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method148(class227.field3079, class227.field3003, class227.field3081);
                field1443 = 6;
                break;
            case 3:
                method148(class227.field2997, class227.field2909, class227.field3084);
                break;
            case 4:
                method148(class227.field3085, class227.field3086, class227.field3087);
                break;
            case 5:
                method148(class227.field2858, class227.field3089, class227.field2905);
                break;
            case 6:
                method148(class227.field3091, class227.field3092, class227.field2863);
                break;
            case 7:
                method148(class227.field3094, class227.field3095, class227.field3096);
        }
    }

    @ObfuscatedName("y.v(Ljk;Ljk;Ljk;ZI)V")
    public static void method4(class265 arg0, class265 arg1, class265 arg2, boolean arg3) {
        if (arg3) {
            field1425 = (Statics.field1365 - 765) / 2;
            field1436 = field1425 + 202;
        }
        if (field1424) {
            method1076(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1420.method4764(field1425, 0);
            Statics.field1323.method4764(field1425 + 382, 0);
            Statics.field851.method4734(field1425 + 382 - Statics.field851.field3758 / 2, 18);
        }
        if (client.field923 == 0 || client.field923 == 5) {
            byte var4 = 20;
            arg0.method4462(class227.field3036, field1436 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class283.method4656(field1436 + 180 - 152, var5, 304, 34, 9179409);
            class283.method4656(field1436 + 180 - 151, var5 + 1, 302, 32, 0);
            class283.method4649(field1436 + 180 - 150, var5 + 2, field1434 * 3, 30, 9179409);
            class283.method4649(field1434 * 3 + (field1436 + 180 - 150), var5 + 2, 300 - field1434 * 3, 30, 0);
            arg0.method4462(field1435, field1436 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field923 == 20) {
            Statics.field1421.method4734(field1436 + 180 - Statics.field1421.field3758 / 2, 271 - Statics.field1421.field3759 / 2);
            short var6 = 211;
            arg0.method4462(field1438, field1436 + 180, var6, 16776960, 0);
            int var76 = var6 + 15;
            arg0.method4462(field1419, field1436 + 180, var76, 16776960, 0);
            int var77 = var76 + 15;
            arg0.method4462(field1440, field1436 + 180, var77, 16776960, 0);
            int var78 = var77 + 15;
            int var79 = var78 + 10;
            if (field1443 != 4) {
                arg0.method4459(class227.field3058, field1436 + 180 - 110, var79, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field1441; arg0.method4454(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4459(class266.method4458(var8), field1436 + 180 - 70, var79, 16777215, 0);
                var76 = var79 + 15;
                arg0.method4459(class227.field2962 + class272.method2863(field1451), field1436 + 180 - 108, var76, 16777215, 0);
                var76 += 15;
            }
        }
        if (client.field923 == 10 || client.field923 == 11) {
            Statics.field1421.method4734(field1436, 171);
            if (field1443 == 0) {
                short var9 = 251;
                arg0.method4462(class227.field3061, field1436 + 180, var9, 16776960, 0);
                int var80 = var9 + 30;
                int var10 = field1436 + 180 - 80;
                short var11 = 291;
                Statics.field1422.method4734(var10 - 73, var11 - 20);
                arg0.method4463(class227.field3062, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1436 + 180 + 80;
                Statics.field1422.method4734(var12 - 73, var11 - 20);
                arg0.method4463(class227.field2965, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1443 == 1) {
                arg0.method4462(field1449, field1436 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method4462(field1438, field1436 + 180, var13, 16777215, 0);
                int var81 = var13 + 15;
                arg0.method4462(field1419, field1436 + 180, var81, 16777215, 0);
                int var82 = var81 + 15;
                arg0.method4462(field1440, field1436 + 180, var82, 16777215, 0);
                int var83 = var82 + 15;
                int var14 = field1436 + 180 - 80;
                short var15 = 321;
                Statics.field1422.method4734(var14 - 73, var15 - 20);
                arg0.method4462(class227.field2832, var14, var15 + 5, 16777215, 0);
                int var16 = field1436 + 180 + 80;
                Statics.field1422.method4734(var16 - 73, var15 - 20);
                arg0.method4462(class227.field3065, var16, var15 + 5, 16777215, 0);
            } else if (field1443 == 2) {
                short var17 = 211;
                arg0.method4462(field1438, field1436 + 180, var17, 16776960, 0);
                int var84 = var17 + 15;
                arg0.method4462(field1419, field1436 + 180, var84, 16776960, 0);
                int var85 = var84 + 15;
                arg0.method4462(field1440, field1436 + 180, var85, 16776960, 0);
                int var86 = var85 + 15;
                int var87 = var86 + 10;
                arg0.method4459(class227.field3058, field1436 + 180 - 110, var87, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field1441; arg0.method4454(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4459(class266.method4458(var19) + (field1445 == 0 & client.field925 % 40 < 20 ? class90.method2799(16776960) + class90.field1378 : ""), field1436 + 180 - 70, var87, 16777215, 0);
                var84 = var87 + 15;
                arg0.method4459(class227.field2962 + class272.method2863(field1451) + (field1445 == 1 & client.field925 % 40 < 20 ? class90.method2799(16776960) + class90.field1378 : ""), field1436 + 180 - 108, var84, 16777215, 0);
                var84 += 15;
                int var20 = field1436 + 180 - 80;
                short var21 = 321;
                Statics.field1422.method4734(var20 - 73, var21 - 20);
                arg0.method4462(class227.field2991, var20, var21 + 5, 16777215, 0);
                int var22 = field1436 + 180 + 80;
                Statics.field1422.method4734(var22 - 73, var21 - 20);
                arg0.method4462(class227.field3065, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method4462(class227.field2907, field1436 + 180, var23, 16776960, 0);
            } else if (field1443 == 3) {
                short var24 = 201;
                arg0.method4462(class227.field2874, field1436 + 180, var24, 16776960, 0);
                int var88 = var24 + 20;
                arg1.method4462(class227.field3067, field1436 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg1.method4462(class227.field3068, field1436 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var25 = field1436 + 180;
                short var26 = 276;
                Statics.field1422.method4734(var25 - 73, var26 - 20);
                arg2.method4462(class227.field2906, var25, var26 + 5, 16777215, 0);
                int var27 = field1436 + 180;
                short var28 = 326;
                Statics.field1422.method4734(var27 - 73, var28 - 20);
                arg2.method4462(class227.field3070, var27, var28 + 5, 16777215, 0);
            } else if (field1443 == 4) {
                arg0.method4462(class227.field3102, field1436 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method4462(field1438, field1436 + 180, var29, 16777215, 0);
                int var91 = var29 + 15;
                arg0.method4462(field1419, field1436 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method4462(field1440, field1436 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method4459(class227.field3090 + class272.method2863(Statics.field597) + (client.field925 % 40 < 20 ? class90.method2799(16776960) + class90.field1378 : ""), field1436 + 180 - 108, var93, 16777215, 0);
                int var94 = var93 - 8;
                arg0.method4459(class227.field2900, field1436 + 180 - 9, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method4459(class227.field2988, field1436 + 180 - 9, var95, 16776960, 0);
                int var30 = field1436 + 180 - 9 + arg0.method4454(class227.field2988) + 15;
                int var31 = var95 - arg0.field3645;
                class286 var32;
                if (field1444) {
                    var32 = Statics.field1325;
                } else {
                    var32 = Statics.field2477;
                }
                var32.method4734(var30, var31);
                var91 = var95 + 15;
                int var33 = field1436 + 180 - 80;
                short var34 = 321;
                Statics.field1422.method4734(var33 - 73, var34 - 20);
                arg0.method4462(class227.field2832, var33, var34 + 5, 16777215, 0);
                int var35 = field1436 + 180 + 80;
                Statics.field1422.method4734(var35 - 73, var34 - 20);
                arg0.method4462(class227.field3065, var35, var34 + 5, 16777215, 0);
                arg1.method4462(class227.field3054, field1436 + 180, var34 + 36, 255, 0);
            } else if (field1443 == 5) {
                arg0.method4462(class227.field2927, field1436 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method4462(field1438, field1436 + 180, var36, 16776960, 0);
                int var96 = var36 + 15;
                arg2.method4462(field1419, field1436 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                arg2.method4462(field1440, field1436 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                int var99 = var98 + 14;
                arg0.method4459(class227.field3073, field1436 + 180 - 145, var99, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field1441; arg0.method4454(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method4459(class266.method4458(var38) + (client.field925 % 40 < 20 ? class90.method2799(16776960) + class90.field1378 : ""), field1436 + 180 - 34, var99, 16777215, 0);
                var96 = var99 + 15;
                int var39 = field1436 + 180 - 80;
                short var40 = 321;
                Statics.field1422.method4734(var39 - 73, var40 - 20);
                arg0.method4462(class227.field3074, var39, var40 + 5, 16777215, 0);
                int var41 = field1436 + 180 + 80;
                Statics.field1422.method4734(var41 - 73, var40 - 20);
                arg0.method4462(class227.field3075, var41, var40 + 5, 16777215, 0);
            } else if (field1443 == 6) {
                short var42 = 211;
                arg0.method4462(field1438, field1436 + 180, var42, 16776960, 0);
                int var100 = var42 + 15;
                arg0.method4462(field1419, field1436 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                arg0.method4462(field1440, field1436 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                int var43 = field1436 + 180;
                short var44 = 321;
                Statics.field1422.method4734(var43 - 73, var44 - 20);
                arg0.method4462(class227.field3075, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field1427 > 0) {
            int var45 = field1427;
            short var46 = 256;
            field1430 += var45 * 128;
            if (field1430 > Statics.field317.length) {
                field1430 -= Statics.field317.length;
                int var47 = (int) (Math.random() * 12.0D);
                method1752(Statics.field590[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field848[var48 + var49] - Statics.field317[field1430 + var48 & Statics.field317.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field848[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field848[var54 + var55] = 255;
                    } else {
                        Statics.field848[var54 + var55] = 0;
                    }
                }
            }
            if (field1428 > 0) {
                field1428 -= var45 * 4;
            }
            if (field1432 > 0) {
                field1432 -= var45 * 4;
            }
            if (field1428 == 0 && field1432 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field1428 = 1024;
                }
                if (var57 == 1) {
                    field1432 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field1426[var58] = field1426[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field1426[var59] = (int) (Math.sin((double) field1433 / 14.0D) * 16.0D + Math.sin((double) field1433 / 15.0D) * 14.0D + Math.sin((double) field1433 / 16.0D) * 12.0D);
                field1433++;
            }
            field1431 += var45 * -150642831;
            int var60 = ((client.field925 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field1431 * -1178166108; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field848[(var63 << 7) + var62] = 192;
                }
                field1431 = 0;
                int var64 = 0;
                label219: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label219;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field1369[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field1369[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field848[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field848[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field848[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field1369[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field1427 = 0;
        }
        method1579();
        Statics.field1439[Statics.field2198.field1299 ? 1 : 0].method4734(field1425 + 765 - 40, 463);
        if (client.field923 <= 5 || client.field1014 != 0) {
            return;
        }
        if (Statics.field320 == null) {
            Statics.field320 = class288.method1974(Statics.field441, "sl_button", "");
            return;
        }
        int var72 = field1425 + 5;
        short var73 = 463;
        byte var74 = 100;
        byte var75 = 35;
        Statics.field320.method4734(var72, var73);
        arg0.method4462(class227.field3104 + " " + client.field917, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
        if (Statics.field1289 == null) {
            arg1.method4462(class227.field3107, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
        } else {
            arg1.method4462(class227.field3106, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("p.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method148(String arg0, String arg1, String arg2) {
        field1438 = arg0;
        field1419 = arg1;
        field1440 = arg2;
    }

    @ObfuscatedName("cc.r(Ljp;I)V")
    public static final void method1752(class286 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field317.length; var2++) {
            Statics.field317[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field317[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1504[var8] = (Statics.field317[var8 - 1] + Statics.field317[var8 + 1] + Statics.field317[var8 - 128] + Statics.field317[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field317;
            Statics.field317 = Statics.field1504;
            Statics.field1504 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3759; var11++) {
            for (int var12 = 0; var12 < arg0.field3758; var12++) {
                if (arg0.field3761[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3760;
                    int var14 = var11 + 16 + arg0.field3762;
                    int var15 = (var14 << 7) + var13;
                    Statics.field317[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fb.u(IIII)I")
    public static final int method3171(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cg.d(I)V")
    public static final void method1579() {
        short var0 = 256;
        if (field1428 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1428 > 768) {
                    Statics.field1366[var1] = method3171(Statics.field277[var1], Statics.field1442[var1], 1024 - field1428);
                } else if (field1428 > 256) {
                    Statics.field1366[var1] = Statics.field1442[var1];
                } else {
                    Statics.field1366[var1] = method3171(Statics.field1442[var1], Statics.field277[var1], 256 - field1428);
                }
            }
        } else if (field1432 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1432 > 768) {
                    Statics.field1366[var2] = method3171(Statics.field277[var2], Statics.field591[var2], 1024 - field1432);
                } else if (field1432 > 256) {
                    Statics.field1366[var2] = Statics.field591[var2];
                } else {
                    Statics.field1366[var2] = method3171(Statics.field591[var2], Statics.field277[var2], 256 - field1432);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1366[var3] = Statics.field277[var3];
            }
        }
        class283.method4641(field1425, 9, field1425 + 128, var0 + 7);
        Statics.field1420.method4764(field1425, 0);
        class283.method4640();
        int var4 = 0;
        int var5 = field1425 + Statics.field323.field3747 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1426[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field848[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1366[var10];
                    int var14 = Statics.field323.field3746[var5];
                    Statics.field323.field3746[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field323.field3747 + var8 - 128;
        }
        class283.method4641(field1425 + 765 - 128, 9, field1425 + 765, var0 + 7);
        Statics.field1323.method4764(field1425 + 382, 0);
        class283.method4640();
        int var15 = 0;
        int var16 = field1425 + Statics.field323.field3747 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1426[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field848[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1366[var22];
                    int var26 = Statics.field323.field3746[var20];
                    Statics.field323.field3746[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field323.field3747 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bk.o(Ljk;Ljk;I)V")
    public static void method1076(class265 arg0, class265 arg1) {
        if (Statics.field656 == null) {
            Statics.field656 = class288.method3780(Statics.field441, "sl_back", "");
        }
        if (Statics.field1423 == null) {
            Statics.field1423 = Statics.method49(Statics.field441, "sl_flags", "");
        }
        if (Statics.field1272 == null) {
            Statics.field1272 = Statics.method49(Statics.field441, "sl_arrows", "");
        }
        if (Statics.field1505 == null) {
            Statics.field1505 = Statics.method49(Statics.field441, "sl_stars", "");
        }
        class283.method4649(field1425, 23, 765, 480, 0);
        class283.method4654(field1425, 0, 125, 23, 12425273, 9135624);
        class283.method4654(field1425 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4462(class227.field3093, field1425 + 62, 15, 0, -1);
        if (Statics.field1505 != null) {
            Statics.field1505[1].method4734(field1425 + 140, 1);
            arg1.method4459(class227.field3098, field1425 + 152, 10, 16777215, -1);
            Statics.field1505[0].method4734(field1425 + 140, 12);
            arg1.method4459(class227.field3099, field1425 + 152, 21, 16777215, -1);
        }
        if (Statics.field1272 != null) {
            int var2 = field1425 + 280;
            if (class81.field1282[0] == 0 && class81.field1292[0] == 0) {
                Statics.field1272[2].method4734(var2, 4);
            } else {
                Statics.field1272[0].method4734(var2, 4);
            }
            if (class81.field1282[0] == 0 && class81.field1292[0] == 1) {
                Statics.field1272[3].method4734(var2 + 15, 4);
            } else {
                Statics.field1272[1].method4734(var2 + 15, 4);
            }
            arg0.method4459(class227.field3100, var2 + 32, 17, 16777215, -1);
            int var3 = field1425 + 390;
            if (class81.field1282[0] == 1 && class81.field1292[0] == 0) {
                Statics.field1272[2].method4734(var3, 4);
            } else {
                Statics.field1272[0].method4734(var3, 4);
            }
            if (class81.field1282[0] == 1 && class81.field1292[0] == 1) {
                Statics.field1272[3].method4734(var3 + 15, 4);
            } else {
                Statics.field1272[1].method4734(var3 + 15, 4);
            }
            arg0.method4459(class227.field3101, var3 + 32, 17, 16777215, -1);
            int var4 = field1425 + 500;
            if (class81.field1282[0] == 2 && class81.field1292[0] == 0) {
                Statics.field1272[2].method4734(var4, 4);
            } else {
                Statics.field1272[0].method4734(var4, 4);
            }
            if (class81.field1282[0] == 2 && class81.field1292[0] == 1) {
                Statics.field1272[3].method4734(var4 + 15, 4);
            } else {
                Statics.field1272[1].method4734(var4 + 15, 4);
            }
            arg0.method4459(class227.field2970, var4 + 32, 17, 16777215, -1);
            int var5 = field1425 + 610;
            if (class81.field1282[0] == 3 && class81.field1292[0] == 0) {
                Statics.field1272[2].method4734(var5, 4);
            } else {
                Statics.field1272[0].method4734(var5, 4);
            }
            if (class81.field1282[0] == 3 && class81.field1292[0] == 1) {
                Statics.field1272[3].method4734(var5 + 15, 4);
            } else {
                Statics.field1272[1].method4734(var5 + 15, 4);
            }
            arg0.method4459(class227.field3103, var5 + 32, 17, 16777215, -1);
        }
        class283.method4649(field1425 + 708, 4, 50, 16, 0);
        arg1.method4462(class227.field3065, field1425 + 708 + 25, 16, 16777215, -1);
        field1450 = -1;
        if (Statics.field656 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class81.field1279) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class81.field1279) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class81.field1279) {
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
            int var17 = field1425 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class81.field1279; var20++) {
                class81 var21 = Statics.field649[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1286);
                if (var21.field1286 == -1) {
                    var23 = class227.field3043;
                    var22 = false;
                } else if (var21.field1286 > 1980) {
                    var23 = class227.field3105;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1435()) {
                    if (var21.method1430()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1434()) {
                    var24 = 16711680;
                    if (var21.method1430()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1432()) {
                    if (var21.method1430()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1430()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field719 >= var17 && class60.field720 * 752920449 >= var16 && class60.field719 < var6 + var17 && class60.field720 * 752920449 < var7 + var16 && var22) {
                    field1450 = var20;
                    Statics.field656[var25].method4770(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field656[var25].method4764(var17, var16);
                }
                if (Statics.field1423 != null) {
                    Statics.field1423[(var21.method1430() ? 8 : 0) + var21.field1280].method4734(var17 + 29, var16);
                }
                arg0.method4462(Integer.toString(var21.field1284), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4462(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4454(Statics.field649[field1450].field1288) + 6;
                int var27 = arg1.field3645 + 8;
                class283.method4649(class60.field719 - var26 / 2, class60.field720 * 752920449 + 20 + 5, var26, var27, 16777120);
                class283.method4656(class60.field719 - var26 / 2, class60.field720 * 752920449 + 20 + 5, var26, var27, 0);
                arg1.method4462(Statics.field649[field1450].field1288, class60.field719, class60.field720 * 752920449 + 20 + 5 + arg1.field3645 + 4, 0, -1);
            }
        }
        Statics.field323.method727(0, 0);
    }

    @ObfuscatedName("by.s(Lcq;I)V")
    public static void method926(class81 arg0) {
        if (arg0.method1430() != client.field920) {
            client.field920 = arg0.method1430();
            class258.method10(arg0.method1430());
        }
        Statics.field790 = arg0.field1291;
        client.field917 = arg0.field1284;
        client.field918 = arg0.field1285;
        Statics.field2824 = client.field919 == 0 ? 43594 : arg0.field1284 + 40000;
        Statics.field833 = client.field919 == 0 ? 443 : arg0.field1284 + 50000;
        Statics.field420 = Statics.field2824;
    }
}
