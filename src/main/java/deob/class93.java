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
public class class93 {

    @ObfuscatedName("cb.j")
    public static int field1437 = 0;

    @ObfuscatedName("cb.c")
    public static int field1422 = field1437 + 202;

    @ObfuscatedName("cb.x")
    public static int[] field1445 = new int[256];

    @ObfuscatedName("cb.d")
    public static int field1448 = 0;

    @ObfuscatedName("cb.b")
    public static int field1423 = 0;

    @ObfuscatedName("cb.au")
    public static int field1428 = 0;

    @ObfuscatedName("cb.ak")
    public static int field1429 = 0;

    @ObfuscatedName("cb.ap")
    public static int field1430 = 0;

    @ObfuscatedName("cb.ar")
    public static int field1426 = 0;

    @ObfuscatedName("cb.am")
    public static int field1432 = 10;

    @ObfuscatedName("cb.aw")
    public static String field1433 = "";

    @ObfuscatedName("cb.aq")
    public static int field1434 = 0;

    @ObfuscatedName("cb.aa")
    public static String field1435 = "";

    @ObfuscatedName("cb.ag")
    public static String field1436 = "";

    @ObfuscatedName("cb.aj")
    public static String field1442 = "";

    @ObfuscatedName("cb.ax")
    public static String field1418 = "";

    @ObfuscatedName("cb.ad")
    public static String field1439 = "";

    @ObfuscatedName("cb.az")
    public static String field1440 = "";

    @ObfuscatedName("cb.as")
    public static class150 field1431 = class150.field2190;

    @ObfuscatedName("cb.at")
    public static boolean field1447 = true;

    @ObfuscatedName("cb.al")
    public static int field1443 = 0;

    @ObfuscatedName("cb.ah")
    public static String field1444 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cb.an")
    public static String field1441 = "1234567890";

    @ObfuscatedName("cb.ao")
    public static boolean field1424 = false;

    @ObfuscatedName("cb.bd")
    public static int field1449 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.a(Lif;Lif;I)I")
    public static int method79(class236 arg0, class236 arg1) {
        int var2 = 0;
        if (arg0.method3781("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3781("logo", "")) {
            var2++;
        }
        if (arg1.method3781("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3781("titlebox", "")) {
            var2++;
        }
        if (arg1.method3781("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3781("runes", "")) {
            var2++;
        }
        if (arg1.method3781("title_mute", "")) {
            var2++;
        }
        if (arg1.method3781("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3781("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3781("sl_back", "");
        arg1.method3781("sl_flags", "");
        arg1.method3781("sl_arrows", "");
        arg1.method3781("sl_stars", "");
        arg1.method3781("sl_button", "");
        return var2;
    }

    @ObfuscatedName("br.j(B)I")
    public static int method974() {
        return 9;
    }

    @ObfuscatedName("fz.n(Lif;Lif;ZIB)V")
    public static void method2743(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1427) {
            field1434 = arg3;
            class282.method4581();
            byte[] var4 = arg0.method3796("title.jpg", "");
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
            Statics.field782 = var11;
            Statics.field246 = Statics.field782.method4623();
            if ((client.field1087 & 0x20000000) == 0) {
                Statics.field2254 = class287.method3147(arg1, "logo", "");
            } else {
                Statics.field2254 = class287.method3147(arg1, "logo_deadman_mode", "");
            }
            Statics.field1420 = class287.method3147(arg1, "titlebox", "");
            Statics.field2596 = class287.method3147(arg1, "titlebutton", "");
            Statics.field2138 = class287.method4435(arg1, "runes", "");
            Statics.field898 = class287.method4435(arg1, "title_mute", "");
            Statics.field2432 = class287.method3147(arg1, "options_radio_buttons,0", "");
            Statics.field3152 = class287.method3147(arg1, "options_radio_buttons,2", "");
            Statics.field1425 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1425[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1425[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1425[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1425[var17 + 192] = 16777215;
            }
            Statics.field865 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field865[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field865[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field865[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field865[var21 + 192] = 16777215;
            }
            Statics.field1288 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field1288[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field1288[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field1288[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field1288[var25 + 192] = 16777215;
            }
            Statics.field1446 = new int[256];
            Statics.field3340 = new int[32768];
            Statics.field324 = new int[32768];
            method967((class285) null);
            Statics.field2341 = new int[32768];
            Statics.field313 = new int[32768];
            if (arg2) {
                field1439 = "";
                field1440 = "";
            }
            Statics.field21 = 0;
            Statics.field2129 = "";
            field1447 = true;
            field1424 = false;
            if (Statics.field344.field1308) {
                class204.field2502 = 1;
                Statics.field2503 = null;
                Statics.field2504 = -1;
                Statics.field2205 = -1;
                Statics.field2505 = 0;
                Statics.field2506 = false;
                Statics.field862 = 2;
            } else {
                class204.method3653(2, Statics.field2438, "scape main", "", 255, false);
            }
            class239.method1351(false);
            Statics.field1427 = true;
            field1437 = (Statics.field1214 - 765) / 2;
            field1422 = field1437 + 202;
            Statics.field782.method4632(field1437, 0);
            Statics.field246.method4632(field1437 + 382, 0);
            Statics.field2254.method4603(field1437 + 382 - Statics.field2254.field3775 / 2, 18);
        } else if (arg3 == 4) {
            field1434 = 4;
        }
    }

    @ObfuscatedName("ak.r(Lbb;I)V")
    public static void method230(class59 arg0) {
        if (!field1424) {
            if ((class60.field729 == 1 || !Statics.field462 && class60.field729 == 4) && class60.field736 >= field1437 + 765 - 50 && class60.field731 >= 453) {
                Statics.field344.field1308 = !Statics.field344.field1308;
                Statics.method1335();
                if (Statics.field344.field1308) {
                    Statics.field2501.method3427();
                    class204.field2502 = 1;
                    Statics.field2503 = null;
                } else {
                    class204.method2144(Statics.field2438, "scape main", "", 255, false);
                }
            }
            if (client.field914 != 5) {
                field1430++;
                if (client.field914 == 10 || client.field914 == 11) {
                    if (client.field913 == 0) {
                        if (class60.field729 == 1 || !Statics.field462 && class60.field729 == 4) {
                            int var6 = field1437 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class60.field736 >= var6 && class60.field736 <= var6 + var8 && class60.field731 >= var7 && class60.field731 <= var7 + var9) {
                                method1416();
                                return;
                            }
                        }
                        if (Statics.field1655 != null) {
                            method1416();
                        }
                    }
                    int var10 = class60.field729;
                    int var11 = class60.field736;
                    int var12 = class60.field731;
                    if (!Statics.field462 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field1434 == 0) {
                        boolean var13 = false;
                        while (class51.method1893()) {
                            if (Statics.field628 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = field1422 + 180 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            Statics.method449(client.method972("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var16 = field1422 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field1087 & 0x2000000) != 0) {
                                field1435 = "";
                                field1436 = class226.field3084;
                                field1442 = class226.field2860;
                                field1418 = class226.field3086;
                                field1434 = 1;
                                field1443 = 0;
                            } else if ((client.field1087 & 0x4) != 0) {
                                if ((client.field1087 & 0x400) == 0) {
                                    field1436 = class226.field3075;
                                    field1442 = class226.field3076;
                                    field1418 = class226.field3077;
                                } else {
                                    field1436 = class226.field2998;
                                    field1442 = class226.field3082;
                                    field1418 = class226.field3036;
                                }
                                field1435 = class226.field3074;
                                field1434 = 1;
                                field1443 = 0;
                            } else if ((client.field1087 & 0x400) == 0) {
                                field1436 = class226.field3071;
                                field1442 = class226.field3072;
                                field1418 = class226.field3073;
                                field1434 = 2;
                                field1443 = 0;
                            } else {
                                field1436 = class226.field3053;
                                field1442 = class226.field3022;
                                field1418 = class226.field2878;
                                field1435 = class226.field3074;
                                field1434 = 1;
                                field1443 = 0;
                            }
                        }
                    } else if (field1434 == 1) {
                        while (class51.method1893()) {
                            if (Statics.field628 == 84) {
                                field1436 = class226.field3071;
                                field1442 = class226.field3072;
                                field1418 = class226.field3073;
                                field1434 = 2;
                                field1443 = 0;
                            } else if (Statics.field628 == 13) {
                                field1434 = 0;
                            }
                        }
                        int var17 = field1422 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1436 = class226.field3071;
                            field1442 = class226.field3072;
                            field1418 = class226.field3073;
                            field1434 = 2;
                            field1443 = 0;
                        }
                        int var19 = field1422 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1434 = 0;
                        }
                    } else if (field1434 == 2) {
                        short var20 = 231;
                        int var42 = var20 + 30;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1443 = 0;
                        }
                        var42 += 15;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1443 = 1;
                        }
                        var42 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method7(class226.field3110, class226.field3111, class226.field3112);
                            field1434 = 5;
                            return;
                        }
                        int var22 = field1422 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1439 = field1439.trim();
                            if (field1439.length() == 0) {
                                method7(class226.field2999, class226.field3034, class226.field2979);
                                return;
                            }
                            if (field1440.length() == 0) {
                                method7(class226.field2914, class226.field2981, class226.field2982);
                                return;
                            }
                            method7(class226.field3135, class226.field3090, class226.field3091);
                            field1431 = Statics.field344.field1310.containsKey(class271.method3757(field1439)) ? class150.field2195 : class150.field2190;
                            client.method471(20);
                            return;
                        }
                        int var24 = field1422 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1434 = 0;
                            field1439 = "";
                            field1440 = "";
                            Statics.field21 = 0;
                            Statics.field2129 = "";
                            field1447 = true;
                        }
                        while (true) {
                            while (class51.method1893()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field1444.length(); var26++) {
                                    if (Statics.field2511 == field1444.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field628 == 13) {
                                    field1434 = 0;
                                    field1439 = "";
                                    field1440 = "";
                                    Statics.field21 = 0;
                                    Statics.field2129 = "";
                                    field1447 = true;
                                } else if (field1443 == 0) {
                                    if (Statics.field628 == 85 && field1439.length() > 0) {
                                        field1439 = field1439.substring(0, field1439.length() - 1);
                                    }
                                    if (Statics.field628 == 84 || Statics.field628 == 80) {
                                        field1443 = 1;
                                    }
                                    if (var25 && field1439.length() < 320) {
                                        field1439 = field1439 + Statics.field2511;
                                    }
                                } else if (field1443 == 1) {
                                    if (Statics.field628 == 85 && field1440.length() > 0) {
                                        field1440 = field1440.substring(0, field1440.length() - 1);
                                    }
                                    if (Statics.field628 == 84 || Statics.field628 == 80) {
                                        field1443 = 0;
                                    }
                                    if (Statics.field628 == 84) {
                                        field1439 = field1439.trim();
                                        if (field1439.length() == 0) {
                                            method7(class226.field2999, class226.field3034, class226.field2979);
                                            return;
                                        }
                                        if (field1440.length() == 0) {
                                            method7(class226.field2914, class226.field2981, class226.field2982);
                                            return;
                                        }
                                        method7(class226.field3135, class226.field3090, class226.field3091);
                                        field1431 = Statics.field344.field1310.containsKey(class271.method3757(field1439)) ? class150.field2195 : class150.field2190;
                                        client.method471(20);
                                        return;
                                    }
                                    if (var25 && field1440.length() < 20) {
                                        field1440 = field1440 + Statics.field2511;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1434 == 3) {
                        int var27 = field1422 + 180;
                        short var28 = 276;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field1436 = class226.field3071;
                            field1442 = class226.field3072;
                            field1418 = class226.field3073;
                            field1434 = 2;
                            field1443 = 0;
                        }
                        int var29 = field1422 + 180;
                        short var30 = 326;
                        if (var10 == 1 && var11 >= var29 - 75 && var11 <= var29 + 75 && var12 >= var30 - 20 && var12 <= var30 + 20) {
                            method7(class226.field3110, class226.field3111, class226.field3112);
                            field1434 = 5;
                            return;
                        }
                    } else if (field1434 == 4) {
                        int var31 = field1422 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            Statics.field2129.trim();
                            if (Statics.field2129.length() != 6) {
                                method7(class226.field3081, class226.field2897, class226.field2898);
                                return;
                            }
                            Statics.field21 = Integer.parseInt(Statics.field2129);
                            Statics.field2129 = "";
                            field1431 = field1447 ? class150.field2191 : class150.field2193;
                            method7(class226.field3135, class226.field3090, class226.field3091);
                            client.method471(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field1422 + 180 - 9 && var11 <= field1422 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field1447 = !field1447;
                        }
                        if (var10 == 1 && var11 >= field1422 + 180 - 34 && var11 <= field1422 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            Statics.method449(client.method972("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var33 = field1422 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field1434 = 0;
                            field1439 = "";
                            field1440 = "";
                            Statics.field21 = 0;
                            Statics.field2129 = "";
                        }
                        while (class51.method1893()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field1441.length(); var35++) {
                                if (Statics.field2511 == field1441.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field628 == 13) {
                                field1434 = 0;
                                field1439 = "";
                                field1440 = "";
                                Statics.field21 = 0;
                                Statics.field2129 = "";
                            } else {
                                if (Statics.field628 == 85 && Statics.field2129.length() > 0) {
                                    Statics.field2129 = Statics.field2129.substring(0, Statics.field2129.length() - 1);
                                }
                                if (Statics.field628 == 84) {
                                    Statics.field2129.trim();
                                    if (Statics.field2129.length() != 6) {
                                        method7(class226.field3081, class226.field2897, class226.field2898);
                                        return;
                                    }
                                    Statics.field21 = Integer.parseInt(Statics.field2129);
                                    Statics.field2129 = "";
                                    field1431 = field1447 ? class150.field2191 : class150.field2193;
                                    method7(class226.field3135, class226.field3090, class226.field3091);
                                    client.method471(20);
                                    return;
                                }
                                if (var34 && Statics.field2129.length() < 6) {
                                    Statics.field2129 = Statics.field2129 + Statics.field2511;
                                }
                            }
                        }
                    } else if (field1434 == 5) {
                        int var36 = field1422 + 180 - 80;
                        short var37 = 321;
                        if (var10 == 1 && var11 >= var36 - 75 && var11 <= var36 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            method1529();
                            return;
                        }
                        int var38 = field1422 + 180 + 80;
                        if (var10 == 1 && var11 >= var38 - 75 && var11 <= var38 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            field1436 = class226.field3071;
                            field1442 = class226.field3072;
                            field1418 = class226.field3073;
                            field1434 = 2;
                            field1443 = 0;
                            field1440 = "";
                        }
                        while (class51.method1893()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field1444.length(); var40++) {
                                if (Statics.field2511 == field1444.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field628 == 13) {
                                field1436 = class226.field3071;
                                field1442 = class226.field3072;
                                field1418 = class226.field3073;
                                field1434 = 2;
                                field1443 = 0;
                                field1440 = "";
                            } else {
                                if (Statics.field628 == 85 && field1439.length() > 0) {
                                    field1439 = field1439.substring(0, field1439.length() - 1);
                                }
                                if (Statics.field628 == 84) {
                                    method1529();
                                    return;
                                }
                                if (var39 && field1439.length() < 320) {
                                    field1439 = field1439 + Statics.field2511;
                                }
                            }
                        }
                    } else if (field1434 == 6) {
                        while (true) {
                            do {
                                if (!class51.method1893()) {
                                    short var41 = 321;
                                    if (var10 == 1 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                                        field1436 = class226.field3071;
                                        field1442 = class226.field3072;
                                        field1418 = class226.field3073;
                                        field1434 = 2;
                                        field1443 = 0;
                                        field1440 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field628 != 84 && Statics.field628 != 13);
                            field1436 = class226.field3071;
                            field1442 = class226.field3072;
                            field1418 = class226.field3073;
                            field1434 = 2;
                            field1443 = 0;
                            field1440 = "";
                        }
                    }
                }
            }
        } else if (class60.field729 == 1 || !Statics.field462 && class60.field729 == 4) {
            int var1 = field1437 + 280;
            if (class60.field736 >= var1 && class60.field736 <= var1 + 14 && class60.field731 >= 4 && class60.field731 <= 18) {
                class81.method231(0, 0);
            } else if (class60.field736 >= var1 + 15 && class60.field736 <= var1 + 80 && class60.field731 >= 4 && class60.field731 <= 18) {
                class81.method231(0, 1);
            } else {
                int var2 = field1437 + 390;
                if (class60.field736 >= var2 && class60.field736 <= var2 + 14 && class60.field731 >= 4 && class60.field731 <= 18) {
                    class81.method231(1, 0);
                } else if (class60.field736 >= var2 + 15 && class60.field736 <= var2 + 80 && class60.field731 >= 4 && class60.field731 <= 18) {
                    class81.method231(1, 1);
                } else {
                    int var3 = field1437 + 500;
                    if (class60.field736 >= var3 && class60.field736 <= var3 + 14 && class60.field731 >= 4 && class60.field731 <= 18) {
                        class81.method231(2, 0);
                    } else if (class60.field736 >= var3 + 15 && class60.field736 <= var3 + 80 && class60.field731 >= 4 && class60.field731 <= 18) {
                        class81.method231(2, 1);
                    } else {
                        int var4 = field1437 + 610;
                        if (class60.field736 >= var4 && class60.field736 <= var4 + 14 && class60.field731 >= 4 && class60.field731 <= 18) {
                            class81.method231(3, 0);
                        } else if (class60.field736 >= var4 + 15 && class60.field736 <= var4 + 80 && class60.field731 >= 4 && class60.field731 <= 18) {
                            class81.method231(3, 1);
                        } else if (class60.field736 >= field1437 + 708 && class60.field731 >= 4 && class60.field736 <= field1437 + 708 + 50 && class60.field731 <= 20) {
                            field1424 = false;
                            Statics.field782.method4632(field1437, 0);
                            Statics.field246.method4632(field1437 + 382, 0);
                            Statics.field2254.method4603(field1437 + 382 - Statics.field2254.field3775 / 2, 18);
                        } else if (field1449 != -1) {
                            class81 var5 = Statics.field1292[field1449];
                            method240(var5);
                            field1424 = false;
                            Statics.field782.method4632(field1437, 0);
                            Statics.field246.method4632(field1437 + 382, 0);
                            Statics.field2254.method4603(field1437 + 382 - Statics.field2254.field3775 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cv.v(B)V")
    public static void method1529() {
        field1439 = field1439.trim();
        if (field1439.length() == 0) {
            method7(class226.field3110, class226.field3111, class226.field3112);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method972("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2391, var4.field2394, 1000 - var4.field2394);
                if (var5 == -1) {
                    var4.field2394 = 0;
                    long var8 = var4.method2877();
                    var6 = var8;
                    break;
                }
                var4.field2394 += var5;
                if (var4.field2394 >= 1000) {
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
            String var14 = field1439;
            Random var15 = new Random();
            class174 var16 = new class174(128);
            class174 var17 = new class174(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2908(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2859(var15.nextInt());
            }
            var16.method2859(var18[0]);
            var16.method2859(var18[1]);
            var16.method2874(var6);
            var16.method2874(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2859(var15.nextInt());
            }
            var16.method2892(class88.field1381, class88.field1379);
            var17.method2908(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2859(var15.nextInt());
            }
            var17.method2874(var15.nextLong());
            var17.method2915(var15.nextLong());
            client.method2633(var17);
            var17.method2874(var15.nextLong());
            var17.method2892(class88.field1381, class88.field1379);
            int var22 = class174.method2644(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class174 var23 = new class174(var22);
            var23.method2862(var14);
            var23.field2394 = var22;
            var23.method2888(var18);
            class174 var24 = new class174(var23.field2394 + var17.field2394 + var16.field2394 + 5);
            var24.method2908(2);
            var24.method2908(var16.field2394);
            var24.method2882(var16.field2391, 0, var16.field2394);
            var24.method2908(var17.field2394);
            var24.method2882(var17.field2391, 0, var17.field2394);
            var24.method2857(var23.field2394);
            var24.method2882(var23.field2391, 0, var23.field2394);
            String var25 = class270.method488(var24.field2391);
            byte var32;
            try {
                URL var26 = new URL(client.method972("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class294.method1546(var25) + "&dest=" + class294.method1546("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class174 var30 = new class174(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2391, var30.field2394, 1000 - var30.field2394);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2391);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2889(var18);
                            while (var30.field2394 > 0 && var30.field2391[var30.field2394 - 1] == 0) {
                                var30.field2394--;
                            }
                            String var34 = new String(var30.field2391, 0, var30.field2394);
                            if (class88.method3714(var34)) {
                                Statics.method449(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2394 += var31;
                    if (var30.field2394 >= 1000) {
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
                method7(class226.field3113, class226.field3007, class226.field3115);
                field1434 = 6;
                break;
            case 3:
                method7(class226.field3038, class226.field3117, class226.field3118);
                break;
            case 4:
                method7(class226.field3119, class226.field2896, class226.field3121);
                break;
            case 5:
                method7(class226.field2863, class226.field3123, class226.field3124);
                break;
            case 6:
                method7(class226.field3125, class226.field3079, class226.field3127);
                break;
            case 7:
                method7(class226.field2924, class226.field2886, class226.field3130);
        }
    }

    @ObfuscatedName("bx.e(Ljc;Ljc;Ljc;ZI)V")
    public static void method1022(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1437 = (Statics.field1214 - 765) / 2;
            field1422 = field1437 + 202;
        }
        if (field1424) {
            if (Statics.field1438 == null) {
                Statics.field1438 = class287.method238(Statics.field312, "sl_back", "");
            }
            if (Statics.field1419 == null) {
                Statics.field1419 = class287.method4435(Statics.field312, "sl_flags", "");
            }
            if (Statics.field2410 == null) {
                Statics.field2410 = class287.method4435(Statics.field312, "sl_arrows", "");
            }
            if (Statics.field264 == null) {
                Statics.field264 = class287.method4435(Statics.field312, "sl_stars", "");
            }
            class282.method4582(field1437, 23, 765, 480, 0);
            class282.method4520(field1437, 0, 125, 23, 12425273, 9135624);
            class282.method4520(field1437 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4396(class226.field3131, field1437 + 62, 15, 0, -1);
            if (Statics.field264 != null) {
                Statics.field264[1].method4603(field1437 + 140, 1);
                arg1.method4387(class226.field3132, field1437 + 152, 10, 16777215, -1);
                Statics.field264[0].method4603(field1437 + 140, 12);
                arg1.method4387(class226.field3133, field1437 + 152, 21, 16777215, -1);
            }
            if (Statics.field2410 != null) {
                int var4 = field1437 + 280;
                if (class81.field1304[0] == 0 && class81.field1289[0] == 0) {
                    Statics.field2410[2].method4603(var4, 4);
                } else {
                    Statics.field2410[0].method4603(var4, 4);
                }
                if (class81.field1304[0] == 0 && class81.field1289[0] == 1) {
                    Statics.field2410[3].method4603(var4 + 15, 4);
                } else {
                    Statics.field2410[1].method4603(var4 + 15, 4);
                }
                arg0.method4387(class226.field3134, var4 + 32, 17, 16777215, -1);
                int var5 = field1437 + 390;
                if (class81.field1304[0] == 1 && class81.field1289[0] == 0) {
                    Statics.field2410[2].method4603(var5, 4);
                } else {
                    Statics.field2410[0].method4603(var5, 4);
                }
                if (class81.field1304[0] == 1 && class81.field1289[0] == 1) {
                    Statics.field2410[3].method4603(var5 + 15, 4);
                } else {
                    Statics.field2410[1].method4603(var5 + 15, 4);
                }
                arg0.method4387(class226.field3032, var5 + 32, 17, 16777215, -1);
                int var6 = field1437 + 500;
                if (class81.field1304[0] == 2 && class81.field1289[0] == 0) {
                    Statics.field2410[2].method4603(var6, 4);
                } else {
                    Statics.field2410[0].method4603(var6, 4);
                }
                if (class81.field1304[0] == 2 && class81.field1289[0] == 1) {
                    Statics.field2410[3].method4603(var6 + 15, 4);
                } else {
                    Statics.field2410[1].method4603(var6 + 15, 4);
                }
                arg0.method4387(class226.field3136, var6 + 32, 17, 16777215, -1);
                int var7 = field1437 + 610;
                if (class81.field1304[0] == 3 && class81.field1289[0] == 0) {
                    Statics.field2410[2].method4603(var7, 4);
                } else {
                    Statics.field2410[0].method4603(var7, 4);
                }
                if (class81.field1304[0] == 3 && class81.field1289[0] == 1) {
                    Statics.field2410[3].method4603(var7 + 15, 4);
                } else {
                    Statics.field2410[1].method4603(var7 + 15, 4);
                }
                arg0.method4387(class226.field3025, var7 + 32, 17, 16777215, -1);
            }
            class282.method4582(field1437 + 708, 4, 50, 16, 0);
            arg1.method4396(class226.field3099, field1437 + 708 + 25, 16, 16777215, -1);
            field1449 = -1;
            if (Statics.field1438 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1284) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1284) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1284) {
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
                int var19 = field1437 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1284; var22++) {
                    class81 var23 = Statics.field1292[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1295);
                    if (var23.field1295 == -1) {
                        var25 = class226.field3048;
                        var24 = false;
                    } else if (var23.field1295 > 1980) {
                        var25 = class226.field2908;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1380()) {
                        if (var23.method1417()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1383()) {
                        var26 = 16711680;
                        if (var23.method1417()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1377()) {
                        if (var23.method1417()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1417()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field723 >= var19 && class60.field724 * -90084053 >= var18 && class60.field723 < var8 + var19 && class60.field724 * -90084053 < var9 + var18 && var24) {
                        field1449 = var22;
                        Statics.field1438[var27].method4638(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1438[var27].method4632(var19, var18);
                    }
                    if (Statics.field1419 != null) {
                        Statics.field1419[(var23.method1417() ? 8 : 0) + var23.field1298].method4603(var19 + 29, var18);
                    }
                    arg0.method4396(Integer.toString(var23.field1293), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4396(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4383(Statics.field1292[field1449].field1287) + 6;
                    int var29 = arg1.field3638 + 8;
                    class282.method4582(class60.field723 - var28 / 2, class60.field724 * -90084053 + 20 + 5, var28, var29, 16777120);
                    class282.method4563(class60.field723 - var28 / 2, class60.field724 * -90084053 + 20 + 5, var28, var29, 0);
                    arg1.method4396(Statics.field1292[field1449].field1287, class60.field723, class60.field724 * -90084053 + 20 + 5 + arg1.field3638 + 4, 0, -1);
                }
            }
            Statics.field2328.method718(0, 0);
            return;
        }
        if (arg3) {
            Statics.field782.method4632(field1437, 0);
            Statics.field246.method4632(field1437 + 382, 0);
            Statics.field2254.method4603(field1437 + 382 - Statics.field2254.field3775 / 2, 18);
        }
        if (client.field914 == 0 || client.field914 == 5) {
            byte var30 = 20;
            arg0.method4396(class226.field2960, field1422 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class282.method4563(field1422 + 180 - 152, var31, 304, 34, 9179409);
            class282.method4563(field1422 + 180 - 151, var31 + 1, 302, 32, 0);
            class282.method4582(field1422 + 180 - 150, var31 + 2, field1432 * 3, 30, 9179409);
            class282.method4582(field1432 * 3 + (field1422 + 180 - 150), var31 + 2, 300 - field1432 * 3, 30, 0);
            arg0.method4396(field1433, field1422 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field914 == 20) {
            Statics.field1420.method4603(field1422 + 180 - Statics.field1420.field3775 / 2, 271 - Statics.field1420.field3776 / 2);
            short var32 = 211;
            arg0.method4396(field1436, field1422 + 180, var32, 16776960, 0);
            int var102 = var32 + 15;
            arg0.method4396(field1442, field1422 + 180, var102, 16776960, 0);
            int var103 = var102 + 15;
            arg0.method4396(field1418, field1422 + 180, var103, 16776960, 0);
            int var104 = var103 + 15;
            int var105 = var104 + 10;
            if (field1434 != 4) {
                arg0.method4387(class226.field3092, field1422 + 180 - 110, var105, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1439; arg0.method4383(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4387(class265.method4344(var34), field1422 + 180 - 70, var105, 16777215, 0);
                var102 = var105 + 15;
                arg0.method4387(class226.field3093 + class271.method3744(field1440), field1422 + 180 - 108, var102, 16777215, 0);
                var102 += 15;
            }
        }
        if (client.field914 == 10 || client.field914 == 11) {
            Statics.field1420.method4603(field1422, 171);
            if (field1434 == 0) {
                short var35 = 251;
                arg0.method4396(class226.field2932, field1422 + 180, var35, 16776960, 0);
                int var106 = var35 + 30;
                int var36 = field1422 + 180 - 80;
                short var37 = 291;
                Statics.field2596.method4603(var36 - 73, var37 - 20);
                arg0.method4349(class226.field2893, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1422 + 180 + 80;
                Statics.field2596.method4603(var38 - 73, var37 - 20);
                arg0.method4349(class226.field3097, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1434 == 1) {
                arg0.method4396(field1435, field1422 + 180, 211, 16776960, 0);
                short var39 = 236;
                arg0.method4396(field1436, field1422 + 180, var39, 16777215, 0);
                int var107 = var39 + 15;
                arg0.method4396(field1442, field1422 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method4396(field1418, field1422 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                int var40 = field1422 + 180 - 80;
                short var41 = 321;
                Statics.field2596.method4603(var40 - 73, var41 - 20);
                arg0.method4396(class226.field2984, var40, var41 + 5, 16777215, 0);
                int var42 = field1422 + 180 + 80;
                Statics.field2596.method4603(var42 - 73, var41 - 20);
                arg0.method4396(class226.field3099, var42, var41 + 5, 16777215, 0);
            } else if (field1434 == 2) {
                short var43 = 211;
                arg0.method4396(field1436, field1422 + 180, var43, 16776960, 0);
                int var110 = var43 + 15;
                arg0.method4396(field1442, field1422 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method4396(field1418, field1422 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var113 = var112 + 10;
                arg0.method4387(class226.field3092, field1422 + 180 - 110, var113, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = field1439; arg0.method4383(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4387(class265.method4344(var45) + (field1443 == 0 & client.field934 % 40 < 20 ? class89.method596(16776960) + class89.field1392 : ""), field1422 + 180 - 70, var113, 16777215, 0);
                var110 = var113 + 15;
                arg0.method4387(class226.field3093 + class271.method3744(field1440) + (field1443 == 1 & client.field934 % 40 < 20 ? class89.method596(16776960) + class89.field1392 : ""), field1422 + 180 - 108, var110, 16777215, 0);
                var110 += 15;
                int var46 = field1422 + 180 - 80;
                short var47 = 321;
                Statics.field2596.method4603(var46 - 73, var47 - 20);
                arg0.method4396(class226.field3098, var46, var47 + 5, 16777215, 0);
                int var48 = field1422 + 180 + 80;
                Statics.field2596.method4603(var48 - 73, var47 - 20);
                arg0.method4396(class226.field3099, var48, var47 + 5, 16777215, 0);
                short var49 = 357;
                arg1.method4396(class226.field3105, field1422 + 180, var49, 16776960, 0);
            } else if (field1434 == 3) {
                short var50 = 201;
                arg0.method4396(class226.field3100, field1422 + 180, var50, 16776960, 0);
                int var114 = var50 + 20;
                arg1.method4396(class226.field3101, field1422 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg1.method4396(class226.field3102, field1422 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var51 = field1422 + 180;
                short var52 = 276;
                Statics.field2596.method4603(var51 - 73, var52 - 20);
                arg2.method4396(class226.field3041, var51, var52 + 5, 16777215, 0);
                int var53 = field1422 + 180;
                short var54 = 326;
                Statics.field2596.method4603(var53 - 73, var54 - 20);
                arg2.method4396(class226.field2866, var53, var54 + 5, 16777215, 0);
            } else if (field1434 == 4) {
                arg0.method4396(class226.field3087, field1422 + 180, 211, 16776960, 0);
                short var55 = 236;
                arg0.method4396(field1436, field1422 + 180, var55, 16777215, 0);
                int var117 = var55 + 15;
                arg0.method4396(field1442, field1422 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method4396(field1418, field1422 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method4387(class226.field3094 + class271.method3744(Statics.field2129) + (client.field934 % 40 < 20 ? class89.method596(16776960) + class89.field1392 : ""), field1422 + 180 - 108, var119, 16777215, 0);
                int var120 = var119 - 8;
                arg0.method4387(class226.field2868, field1422 + 180 - 9, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg0.method4387(class226.field3019, field1422 + 180 - 9, var121, 16776960, 0);
                int var56 = field1422 + 180 - 9 + arg0.method4383(class226.field3019) + 15;
                int var57 = var121 - arg0.field3638;
                class285 var58;
                if (field1447) {
                    var58 = Statics.field3152;
                } else {
                    var58 = Statics.field2432;
                }
                var58.method4603(var56, var57);
                var117 = var121 + 15;
                int var59 = field1422 + 180 - 80;
                short var60 = 321;
                Statics.field2596.method4603(var59 - 73, var60 - 20);
                arg0.method4396(class226.field2984, var59, var60 + 5, 16777215, 0);
                int var61 = field1422 + 180 + 80;
                Statics.field2596.method4603(var61 - 73, var60 - 20);
                arg0.method4396(class226.field3099, var61, var60 + 5, 16777215, 0);
                arg1.method4396(class226.field3088, field1422 + 180, var60 + 36, 255, 0);
            } else if (field1434 == 5) {
                arg0.method4396(class226.field3126, field1422 + 180, 201, 16776960, 0);
                short var62 = 221;
                arg2.method4396(field1436, field1422 + 180, var62, 16776960, 0);
                int var122 = var62 + 15;
                arg2.method4396(field1442, field1422 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg2.method4396(field1418, field1422 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 14;
                arg0.method4387(class226.field2983, field1422 + 180 - 145, var125, 16777215, 0);
                short var63 = 174;
                String var64;
                for (var64 = field1439; arg0.method4383(var64) > var63; var64 = var64.substring(1)) {
                }
                arg0.method4387(class265.method4344(var64) + (client.field934 % 40 < 20 ? class89.method596(16776960) + class89.field1392 : ""), field1422 + 180 - 34, var125, 16777215, 0);
                var122 = var125 + 15;
                int var65 = field1422 + 180 - 80;
                short var66 = 321;
                Statics.field2596.method4603(var65 - 73, var66 - 20);
                arg0.method4396(class226.field3026, var65, var66 + 5, 16777215, 0);
                int var67 = field1422 + 180 + 80;
                Statics.field2596.method4603(var67 - 73, var66 - 20);
                arg0.method4396(class226.field3109, var67, var66 + 5, 16777215, 0);
            } else if (field1434 == 6) {
                short var68 = 211;
                arg0.method4396(field1436, field1422 + 180, var68, 16776960, 0);
                int var126 = var68 + 15;
                arg0.method4396(field1442, field1422 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg0.method4396(field1418, field1422 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var69 = field1422 + 180;
                short var70 = 321;
                Statics.field2596.method4603(var69 - 73, var70 - 20);
                arg0.method4396(class226.field3109, var69, var70 + 5, 16777215, 0);
            }
        }
        if (field1430 > 0) {
            int var71 = field1430;
            short var72 = 256;
            field1428 += var71 * 128;
            if (field1428 > Statics.field3340.length) {
                field1428 -= Statics.field3340.length;
                int var73 = (int) (Math.random() * 12.0D);
                method967(Statics.field2138[var73]);
            }
            int var74 = 0;
            int var75 = var71 * 128;
            int var76 = (var72 - var71) * 128;
            for (int var77 = 0; var77 < var76; var77++) {
                int var78 = Statics.field2341[var74 + var75] - Statics.field3340[field1428 + var74 & Statics.field3340.length - 1] * var71 / 6;
                if (var78 < 0) {
                    var78 = 0;
                }
                Statics.field2341[var74++] = var78;
            }
            for (int var79 = var72 - var71; var79 < var72; var79++) {
                int var80 = var79 * 128;
                for (int var81 = 0; var81 < 128; var81++) {
                    int var82 = (int) (Math.random() * 100.0D);
                    if (var82 < 50 && var81 > 10 && var81 < 118) {
                        Statics.field2341[var80 + var81] = 255;
                    } else {
                        Statics.field2341[var80 + var81] = 0;
                    }
                }
            }
            if (field1448 > 0) {
                field1448 -= var71 * 4;
            }
            if (field1423 > 0) {
                field1423 -= var71 * 4;
            }
            if (field1448 == 0 && field1423 == 0) {
                int var83 = (int) (Math.random() * (double) (2000 / var71));
                if (var83 == 0) {
                    field1448 = 1024;
                }
                if (var83 == 1) {
                    field1423 = 1024;
                }
            }
            for (int var84 = 0; var84 < var72 - var71; var84++) {
                field1445[var84] = field1445[var71 + var84];
            }
            for (int var85 = var72 - var71; var85 < var72; var85++) {
                field1445[var85] = (int) (Math.sin((double) field1426 / 14.0D) * 16.0D + Math.sin((double) field1426 / 15.0D) * 14.0D + Math.sin((double) field1426 / 16.0D) * 12.0D);
                field1426++;
            }
            field1429 += var71 * -898085701;
            int var86 = ((client.field934 & 0x1) + var71) / 2;
            if (var86 > 0) {
                for (int var87 = 0; var87 < field1429 * -1799779092; var87++) {
                    int var88 = (int) (Math.random() * 124.0D) + 2;
                    int var89 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2341[(var89 << 7) + var88] = 192;
                }
                field1429 = 0;
                int var90 = 0;
                label418: while (true) {
                    if (var90 >= var72) {
                        int var94 = 0;
                        while (true) {
                            if (var94 >= 128) {
                                break label418;
                            }
                            int var95 = 0;
                            for (int var96 = -var86; var96 < var72; var96++) {
                                int var97 = var96 * 128;
                                if (var86 + var96 < var72) {
                                    var95 += Statics.field313[var86 * 128 + var94 + var97];
                                }
                                if (var96 - (var86 + 1) >= 0) {
                                    var95 -= Statics.field313[var94 + var97 - (var86 + 1) * 128];
                                }
                                if (var96 >= 0) {
                                    Statics.field2341[var94 + var97] = var95 / (var86 * 2 + 1);
                                }
                            }
                            var94++;
                        }
                    }
                    int var91 = 0;
                    int var92 = var90 * 128;
                    for (int var93 = -var86; var93 < 128; var93++) {
                        if (var86 + var93 < 128) {
                            var91 += Statics.field2341[var92 + var93 + var86];
                        }
                        if (var93 - (var86 + 1) >= 0) {
                            var91 -= Statics.field2341[var92 + var93 - (var86 + 1)];
                        }
                        if (var93 >= 0) {
                            Statics.field313[var92 + var93] = var91 / (var86 * 2 + 1);
                        }
                    }
                    var90++;
                }
            }
            field1430 = 0;
        }
        method489();
        Statics.field898[Statics.field344.field1308 ? 1 : 0].method4603(field1437 + 765 - 40, 463);
        if (client.field914 <= 5 || client.field913 != 0) {
            return;
        }
        if (Statics.field2323 == null) {
            Statics.field2323 = class287.method3147(Statics.field312, "sl_button", "");
            return;
        }
        int var98 = field1437 + 5;
        short var99 = 463;
        byte var100 = 100;
        byte var101 = 35;
        Statics.field2323.method4603(var98, var99);
        arg0.method4396(class226.field2920 + " " + client.field1012, var100 / 2 + var98, var101 / 2 + var99 - 2, 16777215, 0);
        if (Statics.field1655 == null) {
            arg1.method4396(class226.field3095, var100 / 2 + var98, var101 / 2 + var99 + 12, 16777215, 0);
        } else {
            arg1.method4396(class226.field2977, var100 / 2 + var98, var101 / 2 + var99 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("n.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method7(String arg0, String arg1, String arg2) {
        field1436 = arg0;
        field1442 = arg1;
        field1418 = arg2;
    }

    @ObfuscatedName("bt.s(Ljf;B)V")
    public static final void method967(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3340.length; var2++) {
            Statics.field3340[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3340[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field324[var8] = (Statics.field3340[var8 - 1] + Statics.field3340[var8 + 1] + Statics.field3340[var8 - 128] + Statics.field3340[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3340;
            Statics.field3340 = Statics.field324;
            Statics.field324 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3776; var11++) {
            for (int var12 = 0; var12 < arg0.field3775; var12++) {
                if (arg0.field3780[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3779;
                    int var14 = var11 + 16 + arg0.field3778;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3340[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("el.w(IIII)I")
    public static final int method2631(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("az.p(I)V")
    public static final void method489() {
        short var0 = 256;
        if (field1448 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1448 > 768) {
                    Statics.field1446[var1] = method2631(Statics.field1425[var1], Statics.field865[var1], 1024 - field1448);
                } else if (field1448 > 256) {
                    Statics.field1446[var1] = Statics.field865[var1];
                } else {
                    Statics.field1446[var1] = method2631(Statics.field865[var1], Statics.field1425[var1], 256 - field1448);
                }
            }
        } else if (field1423 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1423 > 768) {
                    Statics.field1446[var2] = method2631(Statics.field1425[var2], Statics.field1288[var2], 1024 - field1423);
                } else if (field1423 > 256) {
                    Statics.field1446[var2] = Statics.field1288[var2];
                } else {
                    Statics.field1446[var2] = method2631(Statics.field1288[var2], Statics.field1425[var2], 256 - field1423);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1446[var3] = Statics.field1425[var3];
            }
        }
        class282.method4507(field1437, 9, field1437 + 128, var0 + 7);
        Statics.field782.method4632(field1437, 0);
        class282.method4537();
        int var4 = 0;
        int var5 = field1437 + Statics.field2328.field3764 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1445[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2341[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1446[var10];
                    int var14 = Statics.field2328.field3765[var5];
                    Statics.field2328.field3765[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field2328.field3764 + var8 - 128;
        }
        class282.method4507(field1437 + 765 - 128, 9, field1437 + 765, var0 + 7);
        Statics.field246.method4632(field1437 + 382, 0);
        class282.method4537();
        int var15 = 0;
        int var16 = field1437 + Statics.field2328.field3764 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1445[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2341[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1446[var22];
                    int var26 = Statics.field2328.field3765[var20];
                    Statics.field2328.field3765[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2328.field3764 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ar.m(Lcx;B)V")
    public static void method240(class81 arg0) {
        if (arg0.method1417() != client.field1039) {
            client.field1039 = arg0.method1417();
            class257.method551(arg0.method1417());
        }
        Statics.field322 = arg0.field1297;
        client.field1012 = arg0.field1293;
        client.field1087 = arg0.field1294;
        Statics.field1389 = client.field1021 == 0 ? 43594 : arg0.field1293 + 40000;
        Statics.field2189 = client.field1021 == 0 ? 443 : arg0.field1293 + 50000;
        Statics.field251 = Statics.field1389;
    }

    @ObfuscatedName("cx.u(I)V")
    public static void method1416() {
        if (class81.method3733()) {
            field1424 = true;
        }
    }
}
