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

@ObfuscatedName("ci")
public class class93 {

    @ObfuscatedName("ci.p")
    public static int field1418 = 0;

    @ObfuscatedName("ci.r")
    public static int field1429 = field1418 + 202;

    @ObfuscatedName("ci.s")
    public static int[] field1426 = new int[256];

    @ObfuscatedName("ci.q")
    public static int field1438 = 0;

    @ObfuscatedName("ci.k")
    public static int field1428 = 0;

    @ObfuscatedName("ci.ad")
    public static int field1448 = 0;

    @ObfuscatedName("ci.aa")
    public static int field1430 = 0;

    @ObfuscatedName("ci.aw")
    public static int field1452 = 0;

    @ObfuscatedName("ci.an")
    public static int field1445 = 0;

    @ObfuscatedName("ci.al")
    public static int field1417 = 10;

    @ObfuscatedName("ci.at")
    public static String field1434 = "";

    @ObfuscatedName("ci.au")
    public static int field1435 = 0;

    @ObfuscatedName("ci.ak")
    public static String field1436 = "";

    @ObfuscatedName("ci.as")
    public static String field1437 = "";

    @ObfuscatedName("ci.ah")
    public static String field1425 = "";

    @ObfuscatedName("ci.ab")
    public static String field1432 = "";

    @ObfuscatedName("ci.am")
    public static String field1440 = "";

    @ObfuscatedName("ci.ac")
    public static String field1427 = "";

    @ObfuscatedName("ci.ax")
    public static class150 field1442 = class150.field2209;

    @ObfuscatedName("ci.af")
    public static boolean field1443 = true;

    @ObfuscatedName("ci.ag")
    public static int field1439 = 0;

    @ObfuscatedName("ci.ar")
    public static String field1451 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.aj")
    public static String field1446 = "1234567890";

    @ObfuscatedName("ci.ap")
    public static boolean field1447 = false;

    @ObfuscatedName("ci.bj")
    public static int field1444 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.n(Lis;Lis;ZIB)V")
    public static void method2316(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1431) {
            field1435 = arg3;
            class282.method4646();
            byte[] var4 = arg0.method3849("title.jpg", "");
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
            Statics.field1421 = var11;
            Statics.field1422 = Statics.field1421.method4797();
            if ((client.field987 & 0x20000000) == 0) {
                Statics.field846 = class287.method2706(arg1, "logo", "");
            } else {
                Statics.field846 = class287.method2706(arg1, "logo_deadman_mode", "");
            }
            Statics.field1419 = class287.method2706(arg1, "titlebox", "");
            Statics.field821 = class287.method2706(arg1, "titlebutton", "");
            Statics.field1420 = class287.method531(arg1, "runes", "");
            Statics.field2427 = class287.method531(arg1, "title_mute", "");
            Statics.field479 = class287.method2706(arg1, "options_radio_buttons,0", "");
            Statics.field1423 = class287.method2706(arg1, "options_radio_buttons,2", "");
            Statics.field642 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field642[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field642[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field642[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field642[var17 + 192] = 16777215;
            }
            Statics.field2275 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field2275[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field2275[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field2275[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field2275[var21 + 192] = 16777215;
            }
            Statics.field564 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field564[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field564[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field564[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field564[var25 + 192] = 16777215;
            }
            Statics.field2185 = new int[256];
            Statics.field13 = new int[32768];
            Statics.field2287 = new int[32768];
            method617((class285) null);
            Statics.field510 = new int[32768];
            Statics.field861 = new int[32768];
            if (arg2) {
                field1440 = "";
                field1427 = "";
            }
            Statics.field2412 = 0;
            Statics.field763 = "";
            field1443 = true;
            field1447 = false;
            if (Statics.field802.field1317) {
                class204.field2516 = 1;
                Statics.field2517 = null;
                Statics.field2276 = -1;
                Statics.field3731 = -1;
                Statics.field1775 = 0;
                Statics.field3691 = false;
                Statics.field2262 = 2;
            } else {
                class204.method59(2, Statics.field657, "scape main", "", 255, false);
            }
            class239.method3806(false);
            Statics.field1431 = true;
            field1418 = (Statics.field2409 - 765) / 2;
            field1429 = field1418 + 202;
            Statics.field1421.method4837(field1418, 0);
            Statics.field1422.method4837(field1418 + 382, 0);
            Statics.field846.method4739(field1418 + 382 - Statics.field846.field3773 / 2, 18);
        } else if (arg3 == 4) {
            field1435 = 4;
        }
    }

    @ObfuscatedName("h.p(Lbn;I)V")
    public static void method49(class59 arg0) {
        if (field1447) {
            method974(arg0);
            return;
        }
        if ((class60.field714 == 1 || !Statics.field1799 && class60.field714 == 4) && class60.field724 >= field1418 + 765 - 50 && class60.field725 >= 453) {
            Statics.field802.field1317 = !Statics.field802.field1317;
            class82.method220();
            if (Statics.field802.field1317) {
                Statics.field2518.method3477();
                class204.field2516 = 1;
                Statics.field2517 = null;
            } else {
                class204.method52(Statics.field657, "scape main", "", 255, false);
            }
        }
        if (client.field970 == 5) {
            return;
        }
        field1452++;
        if (client.field970 != 10 && client.field970 != 11) {
            return;
        }
        if (client.field920 == 0) {
            if (class60.field714 == 1 || !Statics.field1799 && class60.field714 == 4) {
                int var1 = field1418 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class60.field724 >= var1 && class60.field724 <= var1 + var3 && class60.field725 >= var2 && class60.field725 <= var2 + var4) {
                    if (class81.method494()) {
                        field1447 = true;
                    }
                    return;
                }
            }
            if (Statics.field787 != null && class81.method494()) {
                field1447 = true;
            }
        }
        int var5 = class60.field714;
        int var6 = class60.field724;
        int var7 = class60.field725;
        if (!Statics.field1799 && var5 == 4) {
            var5 = 1;
        }
        if (field1435 == 0) {
            boolean var8 = false;
            while (Statics.method194()) {
                if (Statics.field1338 == 84) {
                    var8 = true;
                }
            }
            int var9 = field1429 + 180 - 80;
            short var10 = 291;
            if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                String var11 = client.method491("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class57.method42(var11, true, "openjs", false);
            }
            int var12 = field1429 + 180 + 80;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20 || var8) {
                if ((client.field987 & 0x2000000) != 0) {
                    field1436 = "";
                    field1437 = class226.field3078;
                    field1425 = class226.field3079;
                    field1432 = class226.field3080;
                    field1435 = 1;
                    field1439 = 0;
                } else if ((client.field987 & 0x4) != 0) {
                    if ((client.field987 & 0x400) == 0) {
                        field1437 = class226.field3069;
                        field1425 = class226.field2962;
                        field1432 = class226.field3071;
                    } else {
                        field1437 = class226.field3075;
                        field1425 = class226.field2859;
                        field1432 = class226.field3077;
                    }
                    field1436 = class226.field3068;
                    field1435 = 1;
                    field1439 = 0;
                } else if ((client.field987 & 0x400) == 0) {
                    field1437 = class226.field3065;
                    field1425 = class226.field2877;
                    field1432 = class226.field3067;
                    field1435 = 2;
                    field1439 = 0;
                } else {
                    field1437 = class226.field3072;
                    field1425 = class226.field3073;
                    field1432 = class226.field3109;
                    field1436 = class226.field3068;
                    field1435 = 1;
                    field1439 = 0;
                }
            }
        } else if (field1435 == 1) {
            while (Statics.method194()) {
                if (Statics.field1338 == 84) {
                    field1437 = class226.field3065;
                    field1425 = class226.field2877;
                    field1432 = class226.field3067;
                    field1435 = 2;
                    field1439 = 0;
                } else if (Statics.field1338 == 13) {
                    field1435 = 0;
                }
            }
            int var13 = field1429 + 180 - 80;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field1437 = class226.field3065;
                field1425 = class226.field2877;
                field1432 = class226.field3067;
                field1435 = 2;
                field1439 = 0;
            }
            int var15 = field1429 + 180 + 80;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field1435 = 0;
            }
        } else if (field1435 == 2) {
            short var16 = 231;
            int var39 = var16 + 30;
            if (var5 == 1 && var7 >= var39 - 15 && var7 < var39) {
                field1439 = 0;
            }
            var39 += 15;
            if (var5 == 1 && var7 >= var39 - 15 && var7 < var39) {
                field1439 = 1;
            }
            var39 += 15;
            short var17 = 361;
            if (var5 == 1 && var7 >= var17 - 15 && var7 < var17) {
                method103(class226.field3104, class226.field3105, class226.field3106);
                field1435 = 5;
                return;
            }
            int var18 = field1429 + 180 - 80;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field1440 = field1440.trim();
                if (field1440.length() == 0) {
                    method103(class226.field2884, class226.field2972, class226.field2970);
                    return;
                }
                if (field1427.length() == 0) {
                    method103(class226.field2974, class226.field2940, class226.field2976);
                    return;
                }
                method103(class226.field3083, class226.field2939, class226.field3085);
                field1442 = Statics.field802.field1314.containsKey(class271.method1714(field1440)) ? class150.field2213 : class150.field2209;
                client.method9(20);
                return;
            }
            int var20 = field1429 + 180 + 80;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field1435 = 0;
                field1440 = "";
                field1427 = "";
                Statics.field2412 = 0;
                Statics.field763 = "";
                field1443 = true;
            }
            while (true) {
                while (Statics.method194()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field1451.length(); var22++) {
                        if (Statics.field536 == field1451.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1338 == 13) {
                        field1435 = 0;
                        field1440 = "";
                        field1427 = "";
                        Statics.field2412 = 0;
                        Statics.field763 = "";
                        field1443 = true;
                    } else if (field1439 == 0) {
                        if (Statics.field1338 == 85 && field1440.length() > 0) {
                            field1440 = field1440.substring(0, field1440.length() - 1);
                        }
                        if (Statics.field1338 == 84 || Statics.field1338 == 80) {
                            field1439 = 1;
                        }
                        if (var21 && field1440.length() < 320) {
                            field1440 = field1440 + Statics.field536;
                        }
                    } else if (field1439 == 1) {
                        if (Statics.field1338 == 85 && field1427.length() > 0) {
                            field1427 = field1427.substring(0, field1427.length() - 1);
                        }
                        if (Statics.field1338 == 84 || Statics.field1338 == 80) {
                            field1439 = 0;
                        }
                        if (Statics.field1338 == 84) {
                            field1440 = field1440.trim();
                            if (field1440.length() == 0) {
                                method103(class226.field2884, class226.field2972, class226.field2970);
                                return;
                            }
                            if (field1427.length() == 0) {
                                method103(class226.field2974, class226.field2940, class226.field2976);
                                return;
                            }
                            method103(class226.field3083, class226.field2939, class226.field3085);
                            field1442 = Statics.field802.field1314.containsKey(class271.method1714(field1440)) ? class150.field2213 : class150.field2209;
                            client.method9(20);
                            return;
                        }
                        if (var21 && field1427.length() < 20) {
                            field1427 = field1427 + Statics.field536;
                        }
                    }
                }
                return;
            }
        } else if (field1435 == 3) {
            int var23 = field1429 + 180;
            short var24 = 276;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                field1437 = class226.field3065;
                field1425 = class226.field2877;
                field1432 = class226.field3067;
                field1435 = 2;
                field1439 = 0;
            }
            int var25 = field1429 + 180;
            short var26 = 326;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                method103(class226.field3104, class226.field3105, class226.field3106);
                field1435 = 5;
                return;
            }
        } else if (field1435 == 4) {
            int var27 = field1429 + 180 - 80;
            short var28 = 321;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                Statics.field763.trim();
                if (Statics.field763.length() != 6) {
                    method103(class226.field2890, class226.field2961, class226.field2892);
                    return;
                }
                Statics.field2412 = Integer.parseInt(Statics.field763);
                Statics.field763 = "";
                field1442 = field1443 ? class150.field2208 : class150.field2210;
                method103(class226.field3083, class226.field2939, class226.field3085);
                client.method9(20);
                return;
            }
            if (var5 == 1 && var6 >= field1429 + 180 - 9 && var6 <= field1429 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field1443 = !field1443;
            }
            if (var5 == 1 && var6 >= field1429 + 180 - 34 && var6 <= field1429 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                String var29 = client.method491("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class57.method42(var29, true, "openjs", false);
            }
            int var30 = field1429 + 180 + 80;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                field1435 = 0;
                field1440 = "";
                field1427 = "";
                Statics.field2412 = 0;
                Statics.field763 = "";
            }
            while (Statics.method194()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field1446.length(); var32++) {
                    if (Statics.field536 == field1446.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field1338 == 13) {
                    field1435 = 0;
                    field1440 = "";
                    field1427 = "";
                    Statics.field2412 = 0;
                    Statics.field763 = "";
                } else {
                    if (Statics.field1338 == 85 && Statics.field763.length() > 0) {
                        Statics.field763 = Statics.field763.substring(0, Statics.field763.length() - 1);
                    }
                    if (Statics.field1338 == 84) {
                        Statics.field763.trim();
                        if (Statics.field763.length() != 6) {
                            method103(class226.field2890, class226.field2961, class226.field2892);
                            return;
                        }
                        Statics.field2412 = Integer.parseInt(Statics.field763);
                        Statics.field763 = "";
                        field1442 = field1443 ? class150.field2208 : class150.field2210;
                        method103(class226.field3083, class226.field2939, class226.field3085);
                        client.method9(20);
                        return;
                    }
                    if (var31 && Statics.field763.length() < 6) {
                        Statics.field763 = Statics.field763 + Statics.field536;
                    }
                }
            }
        } else if (field1435 == 5) {
            int var33 = field1429 + 180 - 80;
            short var34 = 321;
            if (var5 == 1 && var6 >= var33 - 75 && var6 <= var33 + 75 && var7 >= var34 - 20 && var7 <= var34 + 20) {
                method71();
                return;
            }
            int var35 = field1429 + 180 + 80;
            if (var5 == 1 && var6 >= var35 - 75 && var6 <= var35 + 75 && var7 >= var34 - 20 && var7 <= var34 + 20) {
                field1437 = class226.field3065;
                field1425 = class226.field2877;
                field1432 = class226.field3067;
                field1435 = 2;
                field1439 = 0;
                field1427 = "";
            }
            while (Statics.method194()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field1451.length(); var37++) {
                    if (Statics.field536 == field1451.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field1338 == 13) {
                    field1437 = class226.field3065;
                    field1425 = class226.field2877;
                    field1432 = class226.field3067;
                    field1435 = 2;
                    field1439 = 0;
                    field1427 = "";
                } else {
                    if (Statics.field1338 == 85 && field1440.length() > 0) {
                        field1440 = field1440.substring(0, field1440.length() - 1);
                    }
                    if (Statics.field1338 == 84) {
                        method71();
                        return;
                    }
                    if (var36 && field1440.length() < 320) {
                        field1440 = field1440 + Statics.field536;
                    }
                }
            }
        } else if (field1435 == 6) {
            while (true) {
                do {
                    if (!Statics.method194()) {
                        short var38 = 321;
                        if (var5 == 1 && var7 >= var38 - 20 && var7 <= var38 + 20) {
                            field1437 = class226.field3065;
                            field1425 = class226.field2877;
                            field1432 = class226.field3067;
                            field1435 = 2;
                            field1439 = 0;
                            field1427 = "";
                        }
                        return;
                    }
                } while (Statics.field1338 != 84 && Statics.field1338 != 13);
                field1437 = class226.field3065;
                field1425 = class226.field2877;
                field1432 = class226.field3067;
                field1435 = 2;
                field1439 = 0;
                field1427 = "";
            }
        }
    }

    @ObfuscatedName("x.i(B)V")
    public static void method71() {
        field1440 = field1440.trim();
        if (field1440.length() == 0) {
            method103(class226.field3104, class226.field3105, class226.field3106);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method491("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2401, var4.field2400, 1000 - var4.field2400);
                if (var5 == -1) {
                    var4.field2400 = 0;
                    long var8 = var4.method2927();
                    var6 = var8;
                    break;
                }
                var4.field2400 += var5;
                if (var4.field2400 >= 1000) {
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
            String var14 = field1440;
            Random var15 = new Random();
            class174 var16 = new class174(128);
            class174 var17 = new class174(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2906(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2909(var15.nextInt());
            }
            var16.method2909(var18[0]);
            var16.method2909(var18[1]);
            var16.method2911(var6);
            var16.method2911(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2909(var15.nextInt());
            }
            var16.method2942(class88.field1384, class88.field1383);
            var17.method2906(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2909(var15.nextInt());
            }
            var17.method2911(var15.nextLong());
            var17.method2936(var15.nextLong());
            client.method3801(var17);
            var17.method2911(var15.nextLong());
            var17.method2942(class88.field1384, class88.field1383);
            int var22 = Statics.method1708(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class174 var23 = new class174(var22);
            var23.method2912(var14);
            var23.field2400 = var22;
            var23.method2972(var18);
            class174 var24 = new class174(var23.field2400 + var17.field2400 + var16.field2400 + 5);
            var24.method2906(2);
            var24.method2906(var16.field2400);
            var24.method2989(var16.field2401, 0, var16.field2400);
            var24.method2906(var17.field2400);
            var24.method2989(var17.field2401, 0, var17.field2400);
            var24.method2907(var23.field2400);
            var24.method2989(var23.field2401, 0, var23.field2400);
            String var25 = class270.method3817(var24.field2401);
            byte var32;
            try {
                URL var26 = new URL(client.method491("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class294.method2481(var25) + "&dest=" + class294.method2481("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class174 var30 = new class174(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2401, var30.field2400, 1000 - var30.field2400);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2401);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2939(var18);
                            while (var30.field2400 > 0 && var30.field2401[var30.field2400 - 1] == 0) {
                                var30.field2400--;
                            }
                            String var34 = new String(var30.field2401, 0, var30.field2400);
                            if (class88.method1029(var34)) {
                                class57.method42(var34, true, "openjs", false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2400 += var31;
                    if (var30.field2400 >= 1000) {
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
                method103(class226.field3107, class226.field3108, class226.field3134);
                field1435 = 6;
                break;
            case 3:
                method103(class226.field3110, class226.field3044, class226.field2923);
                break;
            case 4:
                method103(class226.field3113, class226.field3114, class226.field3115);
                break;
            case 5:
                method103(class226.field3076, class226.field3020, class226.field3118);
                break;
            case 6:
                method103(class226.field3119, class226.field3120, class226.field3121);
                break;
            case 7:
                method103(class226.field3122, class226.field3092, class226.field3124);
        }
    }

    @ObfuscatedName("j.j(Ljz;Ljz;Ljz;ZB)V")
    public static void method10(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1418 = (Statics.field2409 - 765) / 2;
            field1429 = field1418 + 202;
        }
        if (field1447) {
            method960(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1421.method4837(field1418, 0);
            Statics.field1422.method4837(field1418 + 382, 0);
            Statics.field846.method4739(field1418 + 382 - Statics.field846.field3773 / 2, 18);
        }
        if (client.field970 == 0 || client.field970 == 5) {
            byte var4 = 20;
            arg0.method4507(class226.field3064, field1429 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class282.method4658(field1429 + 180 - 152, var5, 304, 34, 9179409);
            class282.method4658(field1429 + 180 - 151, var5 + 1, 302, 32, 0);
            class282.method4722(field1429 + 180 - 150, var5 + 2, field1417 * 3, 30, 9179409);
            class282.method4722(field1417 * 3 + (field1429 + 180 - 150), var5 + 2, 300 - field1417 * 3, 30, 0);
            arg0.method4507(field1434, field1429 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field970 == 20) {
            Statics.field1419.method4739(field1429 + 180 - Statics.field1419.field3773 / 2, 271 - Statics.field1419.field3775 / 2);
            short var6 = 211;
            arg0.method4507(field1437, field1429 + 180, var6, 16776960, 0);
            int var103 = var6 + 15;
            arg0.method4507(field1425, field1429 + 180, var103, 16776960, 0);
            int var104 = var103 + 15;
            arg0.method4507(field1432, field1429 + 180, var104, 16776960, 0);
            int var105 = var104 + 15;
            int var106 = var105 + 10;
            if (field1435 != 4) {
                arg0.method4472(class226.field3086, field1429 + 180 - 110, var106, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field1440; arg0.method4467(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4472(class265.method4497(var8), field1429 + 180 - 70, var106, 16777215, 0);
                var103 = var106 + 15;
                arg0.method4472(class226.field3087 + class271.method623(field1427), field1429 + 180 - 108, var103, 16777215, 0);
                var103 += 15;
            }
        }
        if (client.field970 == 10 || client.field970 == 11) {
            Statics.field1419.method4739(field1429, 171);
            if (field1435 == 0) {
                short var9 = 251;
                arg0.method4507(class226.field3111, field1429 + 180, var9, 16776960, 0);
                int var107 = var9 + 30;
                int var10 = field1429 + 180 - 80;
                short var11 = 291;
                Statics.field821.method4739(var10 - 73, var11 - 20);
                arg0.method4478(class226.field3090, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1429 + 180 + 80;
                Statics.field821.method4739(var12 - 73, var11 - 20);
                arg0.method4478(class226.field2967, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1435 == 1) {
                arg0.method4507(field1436, field1429 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method4507(field1437, field1429 + 180, var13, 16777215, 0);
                int var108 = var13 + 15;
                arg0.method4507(field1425, field1429 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method4507(field1432, field1429 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                int var14 = field1429 + 180 - 80;
                short var15 = 321;
                Statics.field821.method4739(var14 - 73, var15 - 20);
                arg0.method4507(class226.field2969, var14, var15 + 5, 16777215, 0);
                int var16 = field1429 + 180 + 80;
                Statics.field821.method4739(var16 - 73, var15 - 20);
                arg0.method4507(class226.field3030, var16, var15 + 5, 16777215, 0);
            } else if (field1435 == 2) {
                short var17 = 211;
                arg0.method4507(field1437, field1429 + 180, var17, 16776960, 0);
                int var111 = var17 + 15;
                arg0.method4507(field1425, field1429 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method4507(field1432, field1429 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 10;
                arg0.method4472(class226.field3086, field1429 + 180 - 110, var114, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field1440; arg0.method4467(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4472(class265.method4497(var19) + (field1439 == 0 & client.field923 % 40 < 20 ? class89.method909(16776960) + class89.field1390 : ""), field1429 + 180 - 70, var114, 16777215, 0);
                var111 = var114 + 15;
                arg0.method4472(class226.field3087 + class271.method623(field1427) + (field1439 == 1 & client.field923 % 40 < 20 ? class89.method909(16776960) + class89.field1390 : ""), field1429 + 180 - 108, var111, 16777215, 0);
                var111 += 15;
                int var20 = field1429 + 180 - 80;
                short var21 = 321;
                Statics.field821.method4739(var20 - 73, var21 - 20);
                arg0.method4507(class226.field3002, var20, var21 + 5, 16777215, 0);
                int var22 = field1429 + 180 + 80;
                Statics.field821.method4739(var22 - 73, var21 - 20);
                arg0.method4507(class226.field3030, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method4507(class226.field3099, field1429 + 180, var23, 16776960, 0);
            } else if (field1435 == 3) {
                short var24 = 201;
                arg0.method4507(class226.field2891, field1429 + 180, var24, 16776960, 0);
                int var115 = var24 + 20;
                arg1.method4507(class226.field3095, field1429 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg1.method4507(class226.field3096, field1429 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var25 = field1429 + 180;
                short var26 = 276;
                Statics.field821.method4739(var25 - 73, var26 - 20);
                arg2.method4507(class226.field3063, var25, var26 + 5, 16777215, 0);
                int var27 = field1429 + 180;
                short var28 = 326;
                Statics.field821.method4739(var27 - 73, var28 - 20);
                arg2.method4507(class226.field3098, var27, var28 + 5, 16777215, 0);
            } else if (field1435 == 4) {
                arg0.method4507(class226.field3081, field1429 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method4507(field1437, field1429 + 180, var29, 16777215, 0);
                int var118 = var29 + 15;
                arg0.method4507(field1425, field1429 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method4507(field1432, field1429 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method4472(class226.field3088 + class271.method623(Statics.field763) + (client.field923 % 40 < 20 ? class89.method909(16776960) + class89.field1390 : ""), field1429 + 180 - 108, var120, 16777215, 0);
                int var121 = var120 - 8;
                arg0.method4472(class226.field3070, field1429 + 180 - 9, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg0.method4472(class226.field2863, field1429 + 180 - 9, var122, 16776960, 0);
                int var30 = field1429 + 180 - 9 + arg0.method4467(class226.field2863) + 15;
                int var31 = var122 - arg0.field3653;
                class285 var32;
                if (field1443) {
                    var32 = Statics.field1423;
                } else {
                    var32 = Statics.field479;
                }
                var32.method4739(var30, var31);
                var118 = var122 + 15;
                int var33 = field1429 + 180 - 80;
                short var34 = 321;
                Statics.field821.method4739(var33 - 73, var34 - 20);
                arg0.method4507(class226.field2969, var33, var34 + 5, 16777215, 0);
                int var35 = field1429 + 180 + 80;
                Statics.field821.method4739(var35 - 73, var34 - 20);
                arg0.method4507(class226.field3030, var35, var34 + 5, 16777215, 0);
                arg1.method4507(class226.field3082, field1429 + 180, var34 + 36, 255, 0);
            } else if (field1435 == 5) {
                arg0.method4507(class226.field3100, field1429 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method4507(field1437, field1429 + 180, var36, 16776960, 0);
                int var123 = var36 + 15;
                arg2.method4507(field1425, field1429 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg2.method4507(field1432, field1429 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var126 = var125 + 14;
                arg0.method4472(class226.field3101, field1429 + 180 - 145, var126, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field1440; arg0.method4467(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method4472(class265.method4497(var38) + (client.field923 % 40 < 20 ? class89.method909(16776960) + class89.field1390 : ""), field1429 + 180 - 34, var126, 16777215, 0);
                var123 = var126 + 15;
                int var39 = field1429 + 180 - 80;
                short var40 = 321;
                Statics.field821.method4739(var39 - 73, var40 - 20);
                arg0.method4507(class226.field2903, var39, var40 + 5, 16777215, 0);
                int var41 = field1429 + 180 + 80;
                Statics.field821.method4739(var41 - 73, var40 - 20);
                arg0.method4507(class226.field3103, var41, var40 + 5, 16777215, 0);
            } else if (field1435 == 6) {
                short var42 = 211;
                arg0.method4507(field1437, field1429 + 180, var42, 16776960, 0);
                int var127 = var42 + 15;
                arg0.method4507(field1425, field1429 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                arg0.method4507(field1432, field1429 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                int var43 = field1429 + 180;
                short var44 = 321;
                Statics.field821.method4739(var43 - 73, var44 - 20);
                arg0.method4507(class226.field3103, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field1452 > 0) {
            int var45 = field1452;
            short var46 = 256;
            field1448 += var45 * 128;
            if (field1448 > Statics.field13.length) {
                field1448 -= Statics.field13.length;
                int var47 = (int) (Math.random() * 12.0D);
                method617(Statics.field1420[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field510[var48 + var49] - Statics.field13[field1448 + var48 & Statics.field13.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field510[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field510[var54 + var55] = 255;
                    } else {
                        Statics.field510[var54 + var55] = 0;
                    }
                }
            }
            if (field1438 > 0) {
                field1438 -= var45 * 4;
            }
            if (field1428 > 0) {
                field1428 -= var45 * 4;
            }
            if (field1438 == 0 && field1428 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field1438 = 1024;
                }
                if (var57 == 1) {
                    field1428 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field1426[var58] = field1426[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field1426[var59] = (int) (Math.sin((double) field1445 / 14.0D) * 16.0D + Math.sin((double) field1445 / 15.0D) * 14.0D + Math.sin((double) field1445 / 16.0D) * 12.0D);
                field1445++;
            }
            field1430 += var45 * 1560691029;
            int var60 = ((client.field923 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field1430 * 1531072212; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field510[(var63 << 7) + var62] = 192;
                }
                field1430 = 0;
                int var64 = 0;
                label312: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label312;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field861[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field861[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field510[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field510[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field510[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field861[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field1452 = 0;
        }
        short var72 = 256;
        if (field1438 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field1438 > 768) {
                    Statics.field2185[var73] = method1540(Statics.field642[var73], Statics.field2275[var73], 1024 - field1438);
                } else if (field1438 > 256) {
                    Statics.field2185[var73] = Statics.field2275[var73];
                } else {
                    Statics.field2185[var73] = method1540(Statics.field2275[var73], Statics.field642[var73], 256 - field1438);
                }
            }
        } else if (field1428 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field1428 > 768) {
                    Statics.field2185[var74] = method1540(Statics.field642[var74], Statics.field564[var74], 1024 - field1428);
                } else if (field1428 > 256) {
                    Statics.field2185[var74] = Statics.field564[var74];
                } else {
                    Statics.field2185[var74] = method1540(Statics.field564[var74], Statics.field642[var74], 256 - field1428);
                }
            }
        } else {
            for (int var75 = 0; var75 < 256; var75++) {
                Statics.field2185[var75] = Statics.field642[var75];
            }
        }
        class282.method4643(field1418, 9, field1418 + 128, var72 + 7);
        Statics.field1421.method4837(field1418, 0);
        class282.method4642();
        int var76 = 0;
        int var77 = field1418 + Statics.field602.field3761 * 9;
        for (int var78 = 1; var78 < var72 - 1; var78++) {
            int var79 = (var72 - var78) * field1426[var78] / var72;
            int var80 = var79 + 22;
            if (var80 < 0) {
                var80 = 0;
            }
            var76 += var80;
            for (int var81 = var80; var81 < 128; var81++) {
                int var82 = Statics.field510[var76++];
                if (var82 == 0) {
                    var77++;
                } else {
                    int var84 = 256 - var82;
                    int var85 = Statics.field2185[var82];
                    int var86 = Statics.field602.field3762[var77];
                    Statics.field602.field3762[var77++] = ((var85 & 0xFF00) * var82 + (var86 & 0xFF00) * var84 & 0xFF0000) + ((var85 & 0xFF00FF) * var82 + (var86 & 0xFF00FF) * var84 & 0xFF00FF00) >> 8;
                }
            }
            var77 += Statics.field602.field3761 + var80 - 128;
        }
        class282.method4643(field1418 + 765 - 128, 9, field1418 + 765, var72 + 7);
        Statics.field1422.method4837(field1418 + 382, 0);
        class282.method4642();
        int var87 = 0;
        int var88 = field1418 + Statics.field602.field3761 * 9 + 24 + 637;
        for (int var89 = 1; var89 < var72 - 1; var89++) {
            int var90 = (var72 - var89) * field1426[var89] / var72;
            int var91 = 103 - var90;
            int var92 = var88 + var90;
            for (int var93 = 0; var93 < var91; var93++) {
                int var94 = Statics.field510[var87++];
                if (var94 == 0) {
                    var92++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field2185[var94];
                    int var98 = Statics.field602.field3762[var92];
                    Statics.field602.field3762[var92++] = ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) >> 8;
                }
            }
            var87 += 128 - var91;
            var88 = Statics.field602.field3761 - var91 - var90 + var92;
        }
        Statics.field2427[Statics.field802.field1317 ? 1 : 0].method4739(field1418 + 765 - 40, 463);
        if (client.field970 <= 5 || client.field920 != 0) {
            return;
        }
        if (Statics.field837 == null) {
            Statics.field837 = class287.method2706(Statics.field945, "sl_button", "");
            return;
        }
        int var99 = field1418 + 5;
        short var100 = 463;
        byte var101 = 100;
        byte var102 = 35;
        Statics.field837.method4739(var99, var100);
        arg0.method4507(class226.field2868 + " " + client.field914, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
        if (Statics.field787 == null) {
            arg1.method4507(class226.field2896, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
        } else {
            arg1.method4507(class226.field3046, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("r.f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method103(String arg0, String arg1, String arg2) {
        field1437 = arg0;
        field1425 = arg1;
        field1432 = arg2;
    }

    @ObfuscatedName("aj.m(Lje;I)V")
    public static final void method617(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field13.length; var2++) {
            Statics.field13[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field13[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2287[var8] = (Statics.field13[var8 - 1] + Statics.field13[var8 + 1] + Statics.field13[var8 - 128] + Statics.field13[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field13;
            Statics.field13 = Statics.field2287;
            Statics.field2287 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3775; var11++) {
            for (int var12 = 0; var12 < arg0.field3773; var12++) {
                if (arg0.field3776[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3771;
                    int var14 = var11 + 16 + arg0.field3774;
                    int var15 = (var14 << 7) + var13;
                    Statics.field13[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cv.c(IIII)I")
    public static final int method1540(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bs.z(Ljz;Ljz;I)V")
    public static void method960(class264 arg0, class264 arg1) {
        if (Statics.field600 == null) {
            Statics.field600 = class287.method4619(Statics.field945, "sl_back", "");
        }
        if (Statics.field395 == null) {
            Statics.field395 = class287.method531(Statics.field945, "sl_flags", "");
        }
        if (Statics.field39 == null) {
            Statics.field39 = class287.method531(Statics.field945, "sl_arrows", "");
        }
        if (Statics.field1406 == null) {
            Statics.field1406 = class287.method531(Statics.field945, "sl_stars", "");
        }
        class282.method4722(field1418, 23, 765, 480, 0);
        class282.method4656(field1418, 0, 125, 23, 12425273, 9135624);
        class282.method4656(field1418 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4507(class226.field3125, field1418 + 62, 15, 0, -1);
        if (Statics.field1406 != null) {
            Statics.field1406[1].method4739(field1418 + 140, 1);
            arg1.method4472(class226.field3126, field1418 + 152, 10, 16777215, -1);
            Statics.field1406[0].method4739(field1418 + 140, 12);
            arg1.method4472(class226.field3127, field1418 + 152, 21, 16777215, -1);
        }
        if (Statics.field39 != null) {
            int var2 = field1418 + 280;
            if (class81.field1295[0] == 0 && class81.field1300[0] == 0) {
                Statics.field39[2].method4739(var2, 4);
            } else {
                Statics.field39[0].method4739(var2, 4);
            }
            if (class81.field1295[0] == 0 && class81.field1300[0] == 1) {
                Statics.field39[3].method4739(var2 + 15, 4);
            } else {
                Statics.field39[1].method4739(var2 + 15, 4);
            }
            arg0.method4472(class226.field3128, var2 + 32, 17, 16777215, -1);
            int var3 = field1418 + 390;
            if (class81.field1295[0] == 1 && class81.field1300[0] == 0) {
                Statics.field39[2].method4739(var3, 4);
            } else {
                Statics.field39[0].method4739(var3, 4);
            }
            if (class81.field1295[0] == 1 && class81.field1300[0] == 1) {
                Statics.field39[3].method4739(var3 + 15, 4);
            } else {
                Statics.field39[1].method4739(var3 + 15, 4);
            }
            arg0.method4472(class226.field2902, var3 + 32, 17, 16777215, -1);
            int var4 = field1418 + 500;
            if (class81.field1295[0] == 2 && class81.field1300[0] == 0) {
                Statics.field39[2].method4739(var4, 4);
            } else {
                Statics.field39[0].method4739(var4, 4);
            }
            if (class81.field1295[0] == 2 && class81.field1300[0] == 1) {
                Statics.field39[3].method4739(var4 + 15, 4);
            } else {
                Statics.field39[1].method4739(var4 + 15, 4);
            }
            arg0.method4472(class226.field3130, var4 + 32, 17, 16777215, -1);
            int var5 = field1418 + 610;
            if (class81.field1295[0] == 3 && class81.field1300[0] == 0) {
                Statics.field39[2].method4739(var5, 4);
            } else {
                Statics.field39[0].method4739(var5, 4);
            }
            if (class81.field1295[0] == 3 && class81.field1300[0] == 1) {
                Statics.field39[3].method4739(var5 + 15, 4);
            } else {
                Statics.field39[1].method4739(var5 + 15, 4);
            }
            arg0.method4472(class226.field3131, var5 + 32, 17, 16777215, -1);
        }
        class282.method4722(field1418 + 708, 4, 50, 16, 0);
        arg1.method4507(class226.field3030, field1418 + 708 + 25, 16, 16777215, -1);
        field1444 = -1;
        if (Statics.field600 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class81.field1298) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class81.field1298) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class81.field1298) {
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
            int var17 = field1418 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class81.field1298; var20++) {
                class81 var21 = Statics.field1297[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1304);
                if (var21.field1304 == -1) {
                    var23 = class226.field3132;
                    var22 = false;
                } else if (var21.field1304 > 1980) {
                    var23 = class226.field3133;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1449()) {
                    if (var21.method1407()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1411()) {
                    var24 = 16711680;
                    if (var21.method1407()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1443()) {
                    if (var21.method1407()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1407()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field730 >= var17 && class60.field716 * 1327680731 >= var16 && class60.field730 < var6 + var17 && class60.field716 * 1327680731 < var7 + var16 && var22) {
                    field1444 = var20;
                    Statics.field600[var25].method4782(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field600[var25].method4837(var17, var16);
                }
                if (Statics.field395 != null) {
                    Statics.field395[(var21.method1407() ? 8 : 0) + var21.field1307].method4739(var17 + 29, var16);
                }
                arg0.method4507(Integer.toString(var21.field1308), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
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
                int var26 = arg1.method4467(Statics.field1297[field1444].field1306) + 6;
                int var27 = arg1.field3653 + 8;
                class282.method4722(class60.field730 - var26 / 2, class60.field716 * 1327680731 + 20 + 5, var26, var27, 16777120);
                class282.method4658(class60.field730 - var26 / 2, class60.field716 * 1327680731 + 20 + 5, var26, var27, 0);
                arg1.method4507(Statics.field1297[field1444].field1306, class60.field730, class60.field716 * 1327680731 + 20 + 5 + arg1.field3653 + 4, 0, -1);
            }
        }
        Statics.field602.method727(0, 0);
    }

    @ObfuscatedName("be.h(Lbn;B)V")
    public static void method974(class59 arg0) {
        if (class60.field714 != 1 && Statics.field1799 || class60.field714 != 4) {
            return;
        }
        int var1 = field1418 + 280;
        if (class60.field724 >= var1 && class60.field724 <= var1 + 14 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(0, 0);
            return;
        }
        if (class60.field724 >= var1 + 15 && class60.field724 <= var1 + 80 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(0, 1);
            return;
        }
        int var2 = field1418 + 390;
        if (class60.field724 >= var2 && class60.field724 <= var2 + 14 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(1, 0);
            return;
        }
        if (class60.field724 >= var2 + 15 && class60.field724 <= var2 + 80 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(1, 1);
            return;
        }
        int var3 = field1418 + 500;
        if (class60.field724 >= var3 && class60.field724 <= var3 + 14 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(2, 0);
            return;
        }
        if (class60.field724 >= var3 + 15 && class60.field724 <= var3 + 80 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(2, 1);
            return;
        }
        int var4 = field1418 + 610;
        if (class60.field724 >= var4 && class60.field724 <= var4 + 14 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(3, 0);
            return;
        }
        if (class60.field724 >= var4 + 15 && class60.field724 <= var4 + 80 && class60.field725 >= 4 && class60.field725 <= 18) {
            class81.method1932(3, 1);
            return;
        }
        if (class60.field724 >= field1418 + 708 && class60.field725 >= 4 && class60.field724 <= field1418 + 708 + 50 && class60.field725 <= 20) {
            field1447 = false;
            Statics.field1421.method4837(field1418, 0);
            Statics.field1422.method4837(field1418 + 382, 0);
            Statics.field846.method4739(field1418 + 382 - Statics.field846.field3773 / 2, 18);
            return;
        }
        if (field1444 == -1) {
            return;
        }
        class81 var5 = Statics.field1297[field1444];
        method993(var5);
        field1447 = false;
        Statics.field1421.method4837(field1418, 0);
        Statics.field1422.method4837(field1418 + 382, 0);
        Statics.field846.method4739(field1418 + 382 - Statics.field846.field3773 / 2, 18);
        return;
    }

    @ObfuscatedName("br.g(Lcw;I)V")
    public static void method993(class81 arg0) {
        if (arg0.method1407() != client.field918) {
            client.field918 = arg0.method1407();
            boolean var1 = arg0.method1407();
            if (Statics.field3500 != var1) {
                class257.field3502.method3286();
                class257.field3503.method3286();
                class257.field3504.method3286();
                Statics.field3500 = var1;
            }
        }
        Statics.field2140 = arg0.field1313;
        client.field914 = arg0.field1308;
        client.field987 = arg0.field1309;
        Statics.field507 = client.field916 == 0 ? 43594 : arg0.field1308 + 40000;
        Statics.field2424 = client.field916 == 0 ? 443 : arg0.field1308 + 50000;
        Statics.field804 = Statics.field507;
    }
}
