package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("ch")
public class class91 {

    @ObfuscatedName("ch.s")
    public static int field1414 = 0;

    @ObfuscatedName("ch.b")
    public static int field1448 = field1414 + 202;

    @ObfuscatedName("ch.k")
    public static int[] field1444 = new int[256];

    @ObfuscatedName("ch.f")
    public static int field1424 = 0;

    @ObfuscatedName("ch.ap")
    public static int field1425 = 0;

    @ObfuscatedName("ch.az")
    public static int field1427 = 0;

    @ObfuscatedName("ch.at")
    public static int field1431 = 0;

    @ObfuscatedName("ch.ao")
    public static int field1413 = 0;

    @ObfuscatedName("ch.aq")
    public static int field1430 = 0;

    @ObfuscatedName("ch.ax")
    public static int field1447 = 10;

    @ObfuscatedName("ch.av")
    public static String field1432 = "";

    @ObfuscatedName("ch.al")
    public static int field1433 = 0;

    @ObfuscatedName("ch.ae")
    public static String field1443 = "";

    @ObfuscatedName("ch.ab")
    public static String field1435 = "";

    @ObfuscatedName("ch.aj")
    public static String field1436 = "";

    @ObfuscatedName("ch.ac")
    public static String field1437 = "";

    @ObfuscatedName("ch.ad")
    public static String field1438 = "";

    @ObfuscatedName("ch.am")
    public static String field1452 = "";

    @ObfuscatedName("ch.ah")
    public static boolean field1440 = false;

    @ObfuscatedName("ch.as")
    public static boolean field1451 = false;

    @ObfuscatedName("ch.br")
    public static boolean field1442 = false;

    @ObfuscatedName("ch.bw")
    public static boolean field1439 = true;

    @ObfuscatedName("ch.bs")
    public static int field1423 = 0;

    @ObfuscatedName("ch.bp")
    public static String field1445 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ch.bv")
    public static String field1446 = "1234567890";

    @ObfuscatedName("ch.bz")
    public static boolean field1417 = false;

    @ObfuscatedName("ch.bo")
    public static int field1429 = -1;

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.w(I)I")
    public static int method201() {
        return 11;
    }

    @ObfuscatedName("p.s(Lip;Lip;ZII)V")
    public static void method24(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1441) {
            field1433 = arg3;
            class283.method4700();
            byte[] var4 = arg0.method3951("title.jpg", "");
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
                } catch (IOException var26) {
                } catch (InterruptedException var27) {
                }
                var11 = new class287(0, 0);
            }
            Statics.field1428 = var11;
            Statics.field251 = Statics.field1428.method4811();
            if ((client.field925 & 0x20000000) == 0) {
                Statics.field434 = class288.method4020(arg1, "logo", "");
            } else {
                Statics.field434 = class288.method4020(arg1, "logo_deadman_mode", "");
            }
            Statics.field1415 = class288.method4020(arg1, "titlebox", "");
            Statics.field1294 = class288.method4020(arg1, "titlebutton", "");
            Statics.field1416 = class288.method3837(arg1, "runes", "");
            Statics.field3394 = class288.method3837(arg1, "title_mute", "");
            Statics.field1418 = class288.method4020(arg1, "options_radio_buttons,0", "");
            Statics.field1419 = class288.method4020(arg1, "options_radio_buttons,4", "");
            Statics.field431 = class288.method4020(arg1, "options_radio_buttons,2", "");
            Statics.field1420 = class288.method4020(arg1, "options_radio_buttons,6", "");
            Statics.field2326 = Statics.field1418.field3788;
            Statics.field587 = Statics.field1418.field3786;
            Statics.field3917 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field3917[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field3917[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field3917[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field3917[var17 + 192] = 16777215;
            }
            Statics.field323 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field323[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field323[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field323[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field323[var21 + 192] = 16777215;
            }
            Statics.field2790 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field2790[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field2790[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field2790[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field2790[var25 + 192] = 16777215;
            }
            Statics.field2232 = new int[256];
            Statics.field2126 = new int[32768];
            Statics.field2313 = new int[32768];
            method3274((class286) null);
            Statics.field1426 = new int[32768];
            Statics.field1286 = new int[32768];
            if (arg2) {
                field1438 = "";
                field1452 = "";
            }
            Statics.field586 = 0;
            Statics.field2347 = "";
            field1439 = true;
            field1417 = false;
            if (Statics.field869.field1303) {
                class204.method2891(2);
            } else {
                class204.method39(2, Statics.field528, "scape main", "", 255, false);
            }
            class239.method443(false);
            Statics.field1441 = true;
            field1414 = (Statics.field2255 - 765) / 2;
            field1448 = field1414 + 202;
            Statics.field3146 = field1448 + 180;
            Statics.field1428.method4820(field1414, 0);
            Statics.field251.method4820(field1414 + 382, 0);
            Statics.field434.method4795(field1414 + 382 - Statics.field434.field3788 / 2, 18);
        } else if (arg3 == 4) {
            field1433 = 4;
        }
    }

    @ObfuscatedName("bj.q(ZZI)Ljo;")
    public static class286 method689(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1420 : Statics.field431) : (arg1 ? Statics.field1419 : Statics.field1418);
    }

    @ObfuscatedName("fy.o(I)Ljava/lang/String;")
    public static String method2784() {
        return Statics.field869.field1306 ? class271.method584(field1438) : field1438;
    }

    @ObfuscatedName("y.g(I)V")
    public static void method139() {
        if (!Statics.field1441) {
            return;
        }
        Statics.field1415 = null;
        Statics.field1294 = null;
        Statics.field1416 = null;
        Statics.field1428 = null;
        Statics.field251 = null;
        Statics.field434 = null;
        Statics.field3394 = null;
        Statics.field1418 = null;
        Statics.field431 = null;
        Statics.field275 = null;
        Statics.field264 = null;
        Statics.field698 = null;
        Statics.field439 = null;
        Statics.field2392 = null;
        Statics.field3917 = null;
        Statics.field323 = null;
        Statics.field2790 = null;
        Statics.field2232 = null;
        Statics.field2126 = null;
        Statics.field2313 = null;
        Statics.field1426 = null;
        Statics.field1286 = null;
        class204.method2891(2);
        class239.method443(true);
        Statics.field1441 = false;
    }

    @ObfuscatedName("bg.v(I)V")
    public static void method1016() {
        if (field1440 && field1438 != null && field1438.length() > 0) {
            field1423 = 1;
        } else {
            field1423 = 0;
        }
    }

    @ObfuscatedName("ev.p(Lbv;I)V")
    public static void method2351(class59 arg0) {
        if (!field1417) {
            if ((class60.field744 == 1 || !Statics.field245 && class60.field744 == 4) && class60.field758 >= field1414 + 765 - 50 && class60.field759 >= 453) {
                Statics.field869.field1303 = !Statics.field869.field1303;
                class80.method204();
                if (Statics.field869.field1303) {
                    class204.method2740();
                } else {
                    class204.method1005(Statics.field528, "scape main", "", 255, false);
                }
            }
            if (client.field1128 != 5) {
                field1413++;
                if (client.field1128 == 10 || client.field1128 == 11) {
                    if (client.field929 == 0) {
                        if (class60.field744 == 1 || !Statics.field245 && class60.field744 == 4) {
                            int var6 = field1414 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class60.field758 >= var6 && class60.field758 <= var6 + var8 && class60.field759 >= var7 && class60.field759 <= var7 + var9) {
                                method625();
                                return;
                            }
                        }
                        if (Statics.field865 != null) {
                            method625();
                        }
                    }
                    int var10 = class60.field744;
                    int var11 = class60.field758;
                    int var12 = class60.field759;
                    if (var10 == 0) {
                        var11 = class60.field757;
                        var12 = class60.field742;
                    }
                    if (!Statics.field245 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field1433 == 0) {
                        boolean var13 = false;
                        while (class51.method2946()) {
                            if (Statics.field3631 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = Statics.field3146 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            class57.method2765(client.method60("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var16 = Statics.field3146 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field925 & 0x2000000) != 0) {
                                field1443 = "";
                                field1435 = class226.field3075;
                                field1436 = class226.field3076;
                                field1437 = class226.field2986;
                                field1433 = 1;
                                method1016();
                            } else if ((client.field925 & 0x4) != 0) {
                                if ((client.field925 & 0x400) == 0) {
                                    field1435 = class226.field3066;
                                    field1436 = class226.field2989;
                                    field1437 = class226.field3068;
                                } else {
                                    field1435 = class226.field3032;
                                    field1436 = class226.field3080;
                                    field1437 = class226.field3074;
                                }
                                field1443 = class226.field3065;
                                field1433 = 1;
                                method1016();
                            } else if ((client.field925 & 0x400) == 0) {
                                Statics.method633(false);
                            } else {
                                field1435 = class226.field2935;
                                field1436 = class226.field2858;
                                field1437 = class226.field3071;
                                field1443 = class226.field3065;
                                field1433 = 1;
                                method1016();
                            }
                        }
                    } else if (field1433 == 1) {
                        while (class51.method2946()) {
                            if (Statics.field3631 == 84) {
                                Statics.method633(false);
                            } else if (Statics.field3631 == 13) {
                                field1433 = 0;
                            }
                        }
                        int var17 = Statics.field3146 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            Statics.method633(false);
                        }
                        int var19 = Statics.field3146 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1433 = 0;
                        }
                    } else if (field1433 == 2) {
                        short var20 = 201;
                        int var46 = var20 + 52;
                        if (var10 == 1 && var12 >= var46 - 12 && var12 < var46 + 2) {
                            field1423 = 0;
                        }
                        var46 += 15;
                        if (var10 == 1 && var12 >= var46 - 12 && var12 < var46 + 2) {
                            field1423 = 1;
                        }
                        var46 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method448(class226.field3013, class226.field3077, class226.field3031);
                            field1433 = 5;
                            return;
                        }
                        int var22 = Statics.field3146 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1438 = field1438.trim();
                            if (field1438.length() == 0) {
                                method448(class226.field2968, class226.field2969, class226.field2970);
                                return;
                            }
                            if (field1452.length() == 0) {
                                method448(class226.field2971, class226.field2972, class226.field2973);
                                return;
                            }
                            method448(class226.field3097, class226.field3131, class226.field3082);
                            Statics.method1463(false);
                            client.method1026(20);
                            return;
                        }
                        int var24 = field1448 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1433 = 0;
                            field1438 = "";
                            field1452 = "";
                            Statics.field586 = 0;
                            Statics.field2347 = "";
                            field1439 = true;
                        }
                        int var25 = Statics.field3146 + -117;
                        short var26 = 277;
                        field1451 = var11 >= var25 && var11 < Statics.field2326 + var25 && var12 >= var26 && var12 < Statics.field587 + var26;
                        if (var10 == 1 && field1451) {
                            field1440 = !field1440;
                            if (!field1440 && Statics.field869.field1300 != null) {
                                Statics.field869.field1300 = null;
                                class80.method204();
                            }
                        }
                        int var27 = Statics.field3146 + 24;
                        short var28 = 277;
                        field1442 = var11 >= var27 && var11 < Statics.field2326 + var27 && var12 >= var28 && var12 < Statics.field587 + var28;
                        if (var10 == 1 && field1442) {
                            Statics.field869.field1306 = !Statics.field869.field1306;
                            if (!Statics.field869.field1306) {
                                field1438 = "";
                                Statics.field869.field1300 = null;
                                method1016();
                            }
                            class80.method204();
                        }
                        while (true) {
                            while (class51.method2946()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field1445.length(); var30++) {
                                    if (Statics.field619 == field1445.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field3631 == 13) {
                                    field1433 = 0;
                                    field1438 = "";
                                    field1452 = "";
                                    Statics.field586 = 0;
                                    Statics.field2347 = "";
                                    field1439 = true;
                                } else if (field1423 == 0) {
                                    if (Statics.field3631 == 85 && field1438.length() > 0) {
                                        field1438 = field1438.substring(0, field1438.length() - 1);
                                    }
                                    if (Statics.field3631 == 84 || Statics.field3631 == 80) {
                                        field1423 = 1;
                                    }
                                    if (var29 && field1438.length() < 320) {
                                        field1438 = field1438 + Statics.field619;
                                    }
                                } else if (field1423 == 1) {
                                    if (Statics.field3631 == 85 && field1452.length() > 0) {
                                        field1452 = field1452.substring(0, field1452.length() - 1);
                                    }
                                    if (Statics.field3631 == 84 || Statics.field3631 == 80) {
                                        field1423 = 0;
                                    }
                                    if (Statics.field3631 == 84) {
                                        field1438 = field1438.trim();
                                        if (field1438.length() == 0) {
                                            method448(class226.field2968, class226.field2969, class226.field2970);
                                            return;
                                        }
                                        if (field1452.length() == 0) {
                                            method448(class226.field2971, class226.field2972, class226.field2973);
                                            return;
                                        }
                                        method448(class226.field3097, class226.field3131, class226.field3082);
                                        Statics.method1463(false);
                                        client.method1026(20);
                                        return;
                                    }
                                    if (var29 && field1452.length() < 20) {
                                        field1452 = field1452 + Statics.field619;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1433 == 3) {
                        int var31 = field1448 + 180;
                        short var32 = 276;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            Statics.method633(false);
                        }
                        int var33 = field1448 + 180;
                        short var34 = 326;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                            method448(class226.field3013, class226.field3077, class226.field3031);
                            field1433 = 5;
                            return;
                        }
                    } else if (field1433 == 4) {
                        int var35 = field1448 + 180 - 80;
                        short var36 = 321;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            Statics.field2347.trim();
                            if (Statics.field2347.length() != 6) {
                                method448(class226.field2887, class226.field2888, class226.field2889);
                                return;
                            }
                            Statics.field586 = Integer.parseInt(Statics.field2347);
                            Statics.field2347 = "";
                            Statics.method1463(true);
                            method448(class226.field3097, class226.field3131, class226.field3082);
                            client.method1026(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field1448 + 180 - 9 && var11 <= field1448 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field1439 = !field1439;
                        }
                        if (var10 == 1 && var11 >= field1448 + 180 - 34 && var11 <= field1448 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class57.method2765(client.method60("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var37 = field1448 + 180 + 80;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            field1433 = 0;
                            field1438 = "";
                            field1452 = "";
                            Statics.field586 = 0;
                            Statics.field2347 = "";
                        }
                        while (class51.method2946()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field1446.length(); var39++) {
                                if (Statics.field619 == field1446.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field3631 == 13) {
                                field1433 = 0;
                                field1438 = "";
                                field1452 = "";
                                Statics.field586 = 0;
                                Statics.field2347 = "";
                            } else {
                                if (Statics.field3631 == 85 && Statics.field2347.length() > 0) {
                                    Statics.field2347 = Statics.field2347.substring(0, Statics.field2347.length() - 1);
                                }
                                if (Statics.field3631 == 84) {
                                    Statics.field2347.trim();
                                    if (Statics.field2347.length() != 6) {
                                        method448(class226.field2887, class226.field2888, class226.field2889);
                                        return;
                                    }
                                    Statics.field586 = Integer.parseInt(Statics.field2347);
                                    Statics.field2347 = "";
                                    Statics.method1463(true);
                                    method448(class226.field3097, class226.field3131, class226.field3082);
                                    client.method1026(20);
                                    return;
                                }
                                if (var38 && Statics.field2347.length() < 6) {
                                    Statics.field2347 = Statics.field2347 + Statics.field619;
                                }
                            }
                        }
                    } else if (field1433 == 5) {
                        int var40 = field1448 + 180 - 80;
                        short var41 = 321;
                        if (var10 == 1 && var11 >= var40 - 75 && var11 <= var40 + 75 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                            method3706();
                            return;
                        }
                        int var42 = field1448 + 180 + 80;
                        if (var10 == 1 && var11 >= var42 - 75 && var11 <= var42 + 75 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                            Statics.method633(true);
                        }
                        while (class51.method2946()) {
                            boolean var43 = false;
                            for (int var44 = 0; var44 < field1445.length(); var44++) {
                                if (Statics.field619 == field1445.charAt(var44)) {
                                    var43 = true;
                                    break;
                                }
                            }
                            if (Statics.field3631 == 13) {
                                Statics.method633(true);
                            } else {
                                if (Statics.field3631 == 85 && field1438.length() > 0) {
                                    field1438 = field1438.substring(0, field1438.length() - 1);
                                }
                                if (Statics.field3631 == 84) {
                                    method3706();
                                    return;
                                }
                                if (var43 && field1438.length() < 320) {
                                    field1438 = field1438 + Statics.field619;
                                }
                            }
                        }
                    } else if (field1433 == 6) {
                        while (true) {
                            do {
                                if (!class51.method2946()) {
                                    short var45 = 321;
                                    if (var10 == 1 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                                        Statics.method633(true);
                                    }
                                    return;
                                }
                            } while (Statics.field3631 != 84 && Statics.field3631 != 13);
                            Statics.method633(true);
                        }
                    }
                }
            }
        } else if (class60.field744 == 1 || !Statics.field245 && class60.field744 == 4) {
            int var1 = field1414 + 280;
            if (class60.field758 >= var1 && class60.field758 <= var1 + 14 && class60.field759 >= 4 && class60.field759 <= 18) {
                class79.method995(0, 0);
            } else if (class60.field758 >= var1 + 15 && class60.field758 <= var1 + 80 && class60.field759 >= 4 && class60.field759 <= 18) {
                class79.method995(0, 1);
            } else {
                int var2 = field1414 + 390;
                if (class60.field758 >= var2 && class60.field758 <= var2 + 14 && class60.field759 >= 4 && class60.field759 <= 18) {
                    class79.method995(1, 0);
                } else if (class60.field758 >= var2 + 15 && class60.field758 <= var2 + 80 && class60.field759 >= 4 && class60.field759 <= 18) {
                    class79.method995(1, 1);
                } else {
                    int var3 = field1414 + 500;
                    if (class60.field758 >= var3 && class60.field758 <= var3 + 14 && class60.field759 >= 4 && class60.field759 <= 18) {
                        class79.method995(2, 0);
                    } else if (class60.field758 >= var3 + 15 && class60.field758 <= var3 + 80 && class60.field759 >= 4 && class60.field759 <= 18) {
                        class79.method995(2, 1);
                    } else {
                        int var4 = field1414 + 610;
                        if (class60.field758 >= var4 && class60.field758 <= var4 + 14 && class60.field759 >= 4 && class60.field759 <= 18) {
                            class79.method995(3, 0);
                        } else if (class60.field758 >= var4 + 15 && class60.field758 <= var4 + 80 && class60.field759 >= 4 && class60.field759 <= 18) {
                            class79.method995(3, 1);
                        } else if (class60.field758 >= field1414 + 708 && class60.field759 >= 4 && class60.field758 <= field1414 + 708 + 50 && class60.field759 <= 20) {
                            field1417 = false;
                            Statics.field1428.method4820(field1414, 0);
                            Statics.field251.method4820(field1414 + 382, 0);
                            Statics.field434.method4795(field1414 + 382 - Statics.field434.field3788 / 2, 18);
                        } else if (field1429 != -1) {
                            class79 var5 = Statics.field3665[field1429];
                            method1568(var5);
                            field1417 = false;
                            Statics.field1428.method4820(field1414, 0);
                            Statics.field251.method4820(field1414 + 382, 0);
                            Statics.field434.method4795(field1414 + 382 - Statics.field434.field3788 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hh.d(B)V")
    public static void method3706() {
        field1438 = field1438.trim();
        if (field1438.length() == 0) {
            method448(class226.field3013, class226.field3077, class226.field3031);
            return;
        }
        long var0 = class86.method206();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class86.method4084(var0, field1438);
        }
        switch(var2) {
            case 2:
                method448(class226.field3106, class226.field3107, class226.field3108);
                field1433 = 6;
                break;
            case 3:
                method448(class226.field3109, class226.field3110, class226.field3111);
                break;
            case 4:
                method448(class226.field2909, class226.field3113, class226.field2963);
                break;
            case 5:
                method448(class226.field3115, class226.field2885, class226.field2990);
                break;
            case 6:
                method448(class226.field3118, class226.field2872, class226.field3120);
                break;
            case 7:
                method448(class226.field3025, class226.field3122, class226.field2987);
        }
    }

    @ObfuscatedName("v.x(Ljh;Ljh;Ljh;ZI)V")
    public static void method17(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1414 = (Statics.field2255 - 765) / 2;
            field1448 = field1414 + 202;
            Statics.field3146 = field1448 + 180;
        }
        if (field1417) {
            method133(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1428.method4820(field1414, 0);
            Statics.field251.method4820(field1414 + 382, 0);
            Statics.field434.method4795(field1414 + 382 - Statics.field434.field3788 / 2, 18);
        }
        if (client.field1128 == 0 || client.field1128 == 5) {
            byte var4 = 20;
            arg0.method4511(class226.field3126, field1448 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class283.method4741(field1448 + 180 - 152, var5, 304, 34, 9179409);
            class283.method4741(field1448 + 180 - 151, var5 + 1, 302, 32, 0);
            class283.method4704(field1448 + 180 - 150, var5 + 2, field1447 * 3, 30, 9179409);
            class283.method4704(field1447 * 3 + (field1448 + 180 - 150), var5 + 2, 300 - field1447 * 3, 30, 0);
            arg0.method4511(field1432, field1448 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field1128 == 20) {
            Statics.field1415.method4795(field1448 + 180 - Statics.field1415.field3788 / 2, 271 - Statics.field1415.field3786 / 2);
            short var6 = 201;
            arg0.method4511(field1435, field1448 + 180, var6, 16776960, 0);
            int var83 = var6 + 15;
            arg0.method4511(field1436, field1448 + 180, var83, 16776960, 0);
            int var84 = var83 + 15;
            arg0.method4511(field1437, field1448 + 180, var84, 16776960, 0);
            int var85 = var84 + 15;
            int var86 = var85 + 7;
            if (field1433 != 4) {
                arg0.method4508(class226.field3083, field1448 + 180 - 110, var86, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = method2784(); arg0.method4514(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4508(class265.method4522(var8), field1448 + 180 - 70, var86, 16777215, 0);
                var83 = var86 + 15;
                arg0.method4508(class226.field3084 + class271.method584(field1452), field1448 + 180 - 108, var83, 16777215, 0);
                var83 += 15;
            }
        }
        if (client.field1128 == 10 || client.field1128 == 11) {
            Statics.field1415.method4795(field1448, 171);
            if (field1433 == 0) {
                short var9 = 251;
                arg0.method4511(class226.field3086, field1448 + 180, var9, 16776960, 0);
                int var87 = var9 + 30;
                int var10 = field1448 + 180 - 80;
                short var11 = 291;
                Statics.field1294.method4795(var10 - 73, var11 - 20);
                arg0.method4574(class226.field2902, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1448 + 180 + 80;
                Statics.field1294.method4795(var12 - 73, var11 - 20);
                arg0.method4574(class226.field3088, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1433 == 1) {
                arg0.method4511(field1443, field1448 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method4511(field1435, field1448 + 180, var13, 16777215, 0);
                int var88 = var13 + 15;
                arg0.method4511(field1436, field1448 + 180, var88, 16777215, 0);
                int var89 = var88 + 15;
                arg0.method4511(field1437, field1448 + 180, var89, 16777215, 0);
                int var90 = var89 + 15;
                int var14 = field1448 + 180 - 80;
                short var15 = 321;
                Statics.field1294.method4795(var14 - 73, var15 - 20);
                arg0.method4511(class226.field2977, var14, var15 + 5, 16777215, 0);
                int var16 = field1448 + 180 + 80;
                Statics.field1294.method4795(var16 - 73, var15 - 20);
                arg0.method4511(class226.field3090, var16, var15 + 5, 16777215, 0);
            } else if (field1433 == 2) {
                short var17 = 201;
                arg0.method4511(field1435, Statics.field3146, var17, 16776960, 0);
                int var91 = var17 + 15;
                arg0.method4511(field1436, Statics.field3146, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg0.method4511(field1437, Statics.field3146, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var94 = var93 + 7;
                arg0.method4508(class226.field3083, Statics.field3146 - 110, var94, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method2784(); arg0.method4514(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4508(class265.method4522(var19) + (field1423 == 0 & client.field933 % 40 < 20 ? class87.method166(16776960) + class87.field1380 : ""), Statics.field3146 - 70, var94, 16777215, 0);
                var91 = var94 + 15;
                arg0.method4508(class226.field3084 + class271.method584(field1452) + (field1423 == 1 & client.field933 % 40 < 20 ? class87.method166(16776960) + class87.field1380 : ""), Statics.field3146 - 108, var91, 16777215, 0);
                var91 += 15;
                short var20 = 277;
                int var21 = Statics.field3146 + -117;
                class286 var22 = method689(field1440, field1451);
                var22.method4795(var21, var20);
                int var23 = var22.field3788 + 5 + var21;
                arg1.method4508(class226.field3034, var23, var20 + 13, 16776960, 0);
                int var24 = Statics.field3146 + 24;
                class286 var25 = method689(Statics.field869.field1306, field1442);
                var25.method4795(var24, var20);
                int var26 = var25.field3788 + 5 + var24;
                arg1.method4508(class226.field3092, var26, var20 + 13, 16776960, 0);
                int var95 = var20 + 15;
                int var27 = Statics.field3146 - 80;
                short var28 = 321;
                Statics.field1294.method4795(var27 - 73, var28 - 20);
                arg0.method4511(class226.field2851, var27, var28 + 5, 16777215, 0);
                int var29 = Statics.field3146 + 80;
                Statics.field1294.method4795(var29 - 73, var28 - 20);
                arg0.method4511(class226.field3090, var29, var28 + 5, 16777215, 0);
                short var30 = 357;
                arg1.method4511(class226.field3098, Statics.field3146, var30, 16776960, 0);
            } else if (field1433 == 3) {
                short var31 = 201;
                arg0.method4511(class226.field3093, field1448 + 180, var31, 16776960, 0);
                int var96 = var31 + 20;
                arg1.method4511(class226.field3094, field1448 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                arg1.method4511(class226.field3095, field1448 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                int var32 = field1448 + 180;
                short var33 = 276;
                Statics.field1294.method4795(var32 - 73, var33 - 20);
                arg2.method4511(class226.field2878, var32, var33 + 5, 16777215, 0);
                int var34 = field1448 + 180;
                short var35 = 326;
                Statics.field1294.method4795(var34 - 73, var35 - 20);
                arg2.method4511(class226.field3121, var34, var35 + 5, 16777215, 0);
            } else if (field1433 == 4) {
                arg0.method4511(class226.field3078, field1448 + 180, 201, 16776960, 0);
                short var36 = 236;
                arg0.method4511(field1435, field1448 + 180, var36, 16777215, 0);
                int var99 = var36 + 15;
                arg0.method4511(field1436, field1448 + 180, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method4511(field1437, field1448 + 180, var100, 16777215, 0);
                int var101 = var100 + 15;
                arg0.method4508(class226.field3085 + class271.method584(Statics.field2347) + (client.field933 % 40 < 20 ? class87.method166(16776960) + class87.field1380 : ""), field1448 + 180 - 108, var101, 16777215, 0);
                int var102 = var101 - 8;
                arg0.method4508(class226.field2859, field1448 + 180 - 9, var102, 16776960, 0);
                int var103 = var102 + 15;
                arg0.method4508(class226.field3006, field1448 + 180 - 9, var103, 16776960, 0);
                int var37 = field1448 + 180 - 9 + arg0.method4514(class226.field3006) + 15;
                int var38 = var103 - arg0.field3646;
                class286 var39;
                if (field1439) {
                    var39 = Statics.field431;
                } else {
                    var39 = Statics.field1418;
                }
                var39.method4795(var37, var38);
                var99 = var103 + 15;
                int var40 = field1448 + 180 - 80;
                short var41 = 321;
                Statics.field1294.method4795(var40 - 73, var41 - 20);
                arg0.method4511(class226.field2977, var40, var41 + 5, 16777215, 0);
                int var42 = field1448 + 180 + 80;
                Statics.field1294.method4795(var42 - 73, var41 - 20);
                arg0.method4511(class226.field3090, var42, var41 + 5, 16777215, 0);
                arg1.method4511(class226.field2862, field1448 + 180, var41 + 36, 255, 0);
            } else if (field1433 == 5) {
                arg0.method4511(class226.field3099, field1448 + 180, 201, 16776960, 0);
                short var43 = 221;
                arg2.method4511(field1435, field1448 + 180, var43, 16776960, 0);
                int var104 = var43 + 15;
                arg2.method4511(field1436, field1448 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                arg2.method4511(field1437, field1448 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                int var107 = var106 + 14;
                arg0.method4508(class226.field2881, field1448 + 180 - 145, var107, 16777215, 0);
                short var44 = 174;
                String var45;
                for (var45 = method2784(); arg0.method4514(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4508(class265.method4522(var45) + (client.field933 % 40 < 20 ? class87.method166(16776960) + class87.field1380 : ""), field1448 + 180 - 34, var107, 16777215, 0);
                var104 = var107 + 15;
                int var46 = field1448 + 180 - 80;
                short var47 = 321;
                Statics.field1294.method4795(var46 - 73, var47 - 20);
                arg0.method4511(class226.field3101, var46, var47 + 5, 16777215, 0);
                int var48 = field1448 + 180 + 80;
                Statics.field1294.method4795(var48 - 73, var47 - 20);
                arg0.method4511(class226.field3102, var48, var47 + 5, 16777215, 0);
            } else if (field1433 == 6) {
                short var49 = 201;
                arg0.method4511(field1435, field1448 + 180, var49, 16776960, 0);
                int var108 = var49 + 15;
                arg0.method4511(field1436, field1448 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                arg0.method4511(field1437, field1448 + 180, var109, 16776960, 0);
                int var110 = var109 + 15;
                int var50 = field1448 + 180;
                short var51 = 321;
                Statics.field1294.method4795(var50 - 73, var51 - 20);
                arg0.method4511(class226.field3102, var50, var51 + 5, 16777215, 0);
            }
        }
        if (field1413 > 0) {
            int var52 = field1413;
            short var53 = 256;
            field1427 += var52 * 128;
            if (field1427 > Statics.field2126.length) {
                field1427 -= Statics.field2126.length;
                int var54 = (int) (Math.random() * 12.0D);
                method3274(Statics.field1416[var54]);
            }
            int var55 = 0;
            int var56 = var52 * 128;
            int var57 = (var53 - var52) * 128;
            for (int var58 = 0; var58 < var57; var58++) {
                int var59 = Statics.field1426[var55 + var56] - Statics.field2126[field1427 + var55 & Statics.field2126.length - 1] * var52 / 6;
                if (var59 < 0) {
                    var59 = 0;
                }
                Statics.field1426[var55++] = var59;
            }
            for (int var60 = var53 - var52; var60 < var53; var60++) {
                int var61 = var60 * 128;
                for (int var62 = 0; var62 < 128; var62++) {
                    int var63 = (int) (Math.random() * 100.0D);
                    if (var63 < 50 && var62 > 10 && var62 < 118) {
                        Statics.field1426[var61 + var62] = 255;
                    } else {
                        Statics.field1426[var61 + var62] = 0;
                    }
                }
            }
            if (field1424 > 0) {
                field1424 -= var52 * 4;
            }
            if (field1425 > 0) {
                field1425 -= var52 * 4;
            }
            if (field1424 == 0 && field1425 == 0) {
                int var64 = (int) (Math.random() * (double) (2000 / var52));
                if (var64 == 0) {
                    field1424 = 1024;
                }
                if (var64 == 1) {
                    field1425 = 1024;
                }
            }
            for (int var65 = 0; var65 < var53 - var52; var65++) {
                field1444[var65] = field1444[var52 + var65];
            }
            for (int var66 = var53 - var52; var66 < var53; var66++) {
                field1444[var66] = (int) (Math.sin((double) field1430 / 14.0D) * 16.0D + Math.sin((double) field1430 / 15.0D) * 14.0D + Math.sin((double) field1430 / 16.0D) * 12.0D);
                field1430++;
            }
            field1431 += var52 * 890213473;
            int var67 = ((client.field933 & 0x1) + var52) / 2;
            if (var67 > 0) {
                for (int var68 = 0; var68 < field1431 * -1546773788; var68++) {
                    int var69 = (int) (Math.random() * 124.0D) + 2;
                    int var70 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1426[(var70 << 7) + var69] = 192;
                }
                field1431 = 0;
                int var71 = 0;
                label219: while (true) {
                    if (var71 >= var53) {
                        int var75 = 0;
                        while (true) {
                            if (var75 >= 128) {
                                break label219;
                            }
                            int var76 = 0;
                            for (int var77 = -var67; var77 < var53; var77++) {
                                int var78 = var77 * 128;
                                if (var67 + var77 < var53) {
                                    var76 += Statics.field1286[var67 * 128 + var75 + var78];
                                }
                                if (var77 - (var67 + 1) >= 0) {
                                    var76 -= Statics.field1286[var75 + var78 - (var67 + 1) * 128];
                                }
                                if (var77 >= 0) {
                                    Statics.field1426[var75 + var78] = var76 / (var67 * 2 + 1);
                                }
                            }
                            var75++;
                        }
                    }
                    int var72 = 0;
                    int var73 = var71 * 128;
                    for (int var74 = -var67; var74 < 128; var74++) {
                        if (var67 + var74 < 128) {
                            var72 += Statics.field1426[var73 + var74 + var67];
                        }
                        if (var74 - (var67 + 1) >= 0) {
                            var72 -= Statics.field1426[var73 + var74 - (var67 + 1)];
                        }
                        if (var74 >= 0) {
                            Statics.field1286[var73 + var74] = var72 / (var67 * 2 + 1);
                        }
                    }
                    var71++;
                }
            }
            field1413 = 0;
        }
        method10();
        Statics.field3394[Statics.field869.field1303 ? 1 : 0].method4795(field1414 + 765 - 40, 463);
        if (client.field1128 <= 5 || client.field929 != 0) {
            return;
        }
        if (Statics.field2392 == null) {
            Statics.field2392 = class288.method4020(Statics.field29, "sl_button", "");
            return;
        }
        int var79 = field1414 + 5;
        short var80 = 463;
        byte var81 = 100;
        byte var82 = 35;
        Statics.field2392.method4795(var79, var80);
        arg0.method4511(class226.field3016 + " " + client.field1074, var81 / 2 + var79, var82 / 2 + var80 - 2, 16777215, 0);
        if (Statics.field865 == null) {
            arg1.method4511(class226.field3134, var81 / 2 + var79, var82 / 2 + var80 + 12, 16777215, 0);
        } else {
            arg1.method4511(class226.field3133, var81 / 2 + var79, var82 / 2 + var80 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("av.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method448(String arg0, String arg1, String arg2) {
        field1435 = arg0;
        field1436 = arg1;
        field1437 = arg2;
    }

    @ObfuscatedName("gr.i(Ljo;I)V")
    public static final void method3274(class286 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2126.length; var2++) {
            Statics.field2126[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2126[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2313[var8] = (Statics.field2126[var8 - 1] + Statics.field2126[var8 + 1] + Statics.field2126[var8 - 128] + Statics.field2126[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2126;
            Statics.field2126 = Statics.field2313;
            Statics.field2313 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3786; var11++) {
            for (int var12 = 0; var12 < arg0.field3788; var12++) {
                if (arg0.field3791[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3789;
                    int var14 = var11 + 16 + arg0.field3793;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2126[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("aq.h(IIII)I")
    public static final int method442(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("g.b(I)V")
    public static final void method10() {
        short var0 = 256;
        if (field1424 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1424 > 768) {
                    Statics.field2232[var1] = method442(Statics.field3917[var1], Statics.field323[var1], 1024 - field1424);
                } else if (field1424 > 256) {
                    Statics.field2232[var1] = Statics.field323[var1];
                } else {
                    Statics.field2232[var1] = method442(Statics.field323[var1], Statics.field3917[var1], 256 - field1424);
                }
            }
        } else if (field1425 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1425 > 768) {
                    Statics.field2232[var2] = method442(Statics.field3917[var2], Statics.field2790[var2], 1024 - field1425);
                } else if (field1425 > 256) {
                    Statics.field2232[var2] = Statics.field2790[var2];
                } else {
                    Statics.field2232[var2] = method442(Statics.field2790[var2], Statics.field3917[var2], 256 - field1425);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2232[var3] = Statics.field3917[var3];
            }
        }
        class283.method4723(field1414, 9, field1414 + 128, var0 + 7);
        Statics.field1428.method4820(field1414, 0);
        class283.method4759();
        int var4 = 0;
        int var5 = field1414 + Statics.field734.field3776 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1444[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1426[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2232[var10];
                    int var14 = Statics.field734.field3778[var5];
                    Statics.field734.field3778[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field734.field3776 + var8 - 128;
        }
        class283.method4723(field1414 + 765 - 128, 9, field1414 + 765, var0 + 7);
        Statics.field251.method4820(field1414 + 382, 0);
        class283.method4759();
        int var15 = 0;
        int var16 = field1414 + Statics.field734.field3776 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1444[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1426[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2232[var22];
                    int var26 = Statics.field734.field3778[var20];
                    Statics.field734.field3778[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field734.field3776 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("y.j(Ljh;Ljh;I)V")
    public static void method133(class264 arg0, class264 arg1) {
        if (Statics.field275 == null) {
            Statics.field275 = class288.method2514(Statics.field29, "sl_back", "");
        }
        if (Statics.field264 == null) {
            Statics.field264 = class288.method3837(Statics.field29, "sl_flags", "");
        }
        if (Statics.field698 == null) {
            Statics.field698 = class288.method3837(Statics.field29, "sl_arrows", "");
        }
        if (Statics.field439 == null) {
            Statics.field439 = class288.method3837(Statics.field29, "sl_stars", "");
        }
        class283.method4704(field1414, 23, 765, 480, 0);
        class283.method4711(field1414, 0, 125, 23, 12425273, 9135624);
        class283.method4711(field1414 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4511(class226.field3124, field1414 + 62, 15, 0, -1);
        if (Statics.field439 != null) {
            Statics.field439[1].method4795(field1414 + 140, 1);
            arg1.method4508(class226.field3125, field1414 + 152, 10, 16777215, -1);
            Statics.field439[0].method4795(field1414 + 140, 12);
            arg1.method4508(class226.field3087, field1414 + 152, 21, 16777215, -1);
        }
        if (Statics.field698 != null) {
            int var2 = field1414 + 280;
            if (class79.field1287[0] == 0 && class79.field1285[0] == 0) {
                Statics.field698[2].method4795(var2, 4);
            } else {
                Statics.field698[0].method4795(var2, 4);
            }
            if (class79.field1287[0] == 0 && class79.field1285[0] == 1) {
                Statics.field698[3].method4795(var2 + 15, 4);
            } else {
                Statics.field698[1].method4795(var2 + 15, 4);
            }
            arg0.method4508(class226.field3127, var2 + 32, 17, 16777215, -1);
            int var3 = field1414 + 390;
            if (class79.field1287[0] == 1 && class79.field1285[0] == 0) {
                Statics.field698[2].method4795(var3, 4);
            } else {
                Statics.field698[0].method4795(var3, 4);
            }
            if (class79.field1287[0] == 1 && class79.field1285[0] == 1) {
                Statics.field698[3].method4795(var3 + 15, 4);
            } else {
                Statics.field698[1].method4795(var3 + 15, 4);
            }
            arg0.method4508(class226.field3128, var3 + 32, 17, 16777215, -1);
            int var4 = field1414 + 500;
            if (class79.field1287[0] == 2 && class79.field1285[0] == 0) {
                Statics.field698[2].method4795(var4, 4);
            } else {
                Statics.field698[0].method4795(var4, 4);
            }
            if (class79.field1287[0] == 2 && class79.field1285[0] == 1) {
                Statics.field698[3].method4795(var4 + 15, 4);
            } else {
                Statics.field698[1].method4795(var4 + 15, 4);
            }
            arg0.method4508(class226.field3000, var4 + 32, 17, 16777215, -1);
            int var5 = field1414 + 610;
            if (class79.field1287[0] == 3 && class79.field1285[0] == 0) {
                Statics.field698[2].method4795(var5, 4);
            } else {
                Statics.field698[0].method4795(var5, 4);
            }
            if (class79.field1287[0] == 3 && class79.field1285[0] == 1) {
                Statics.field698[3].method4795(var5 + 15, 4);
            } else {
                Statics.field698[1].method4795(var5 + 15, 4);
            }
            arg0.method4508(class226.field3130, var5 + 32, 17, 16777215, -1);
        }
        class283.method4704(field1414 + 708, 4, 50, 16, 0);
        arg1.method4511(class226.field3090, field1414 + 708 + 25, 16, 16777215, -1);
        field1429 = -1;
        if (Statics.field275 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class79.field1283) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class79.field1283) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class79.field1283) {
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
            int var17 = field1414 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class79.field1283; var20++) {
                class79 var21 = Statics.field3665[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1289);
                if (var21.field1289 == -1) {
                    var23 = class226.field2868;
                    var22 = false;
                } else if (var21.field1289 > 1980) {
                    var23 = class226.field2865;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1437()) {
                    if (var21.method1432()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1436()) {
                    var24 = 16711680;
                    if (var21.method1432()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1434()) {
                    if (var21.method1432()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1432()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field757 >= var17 && class60.field742 >= var16 && class60.field757 < var6 + var17 && class60.field742 < var7 + var16 && var22) {
                    field1429 = var20;
                    Statics.field275[var25].method4825(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field275[var25].method4820(var17, var16);
                }
                if (Statics.field264 != null) {
                    Statics.field264[(var21.method1432() ? 8 : 0) + var21.field1292].method4795(var17 + 29, var16);
                }
                arg0.method4511(Integer.toString(var21.field1282), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4511(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4514(Statics.field3665[field1429].field1291) + 6;
                int var27 = arg1.field3646 + 8;
                class283.method4704(class60.field757 - var26 / 2, class60.field742 + 20 + 5, var26, var27, 16777120);
                class283.method4741(class60.field757 - var26 / 2, class60.field742 + 20 + 5, var26, var27, 0);
                arg1.method4511(Statics.field3665[field1429].field1291, class60.field757, class60.field742 + 20 + 5 + arg1.field3646 + 4, 0, -1);
            }
        }
        Statics.field734.method738(0, 0);
    }

    @ObfuscatedName("cg.y(Lco;I)V")
    public static void method1568(class79 arg0) {
        if (arg0.method1432() != client.field1105) {
            client.field1105 = arg0.method1432();
            boolean var1 = arg0.method1432();
            if (Statics.field3515 != var1) {
                class257.method3695();
                Statics.field3515 = var1;
            }
        }
        Statics.field506 = arg0.field1290;
        client.field1074 = arg0.field1282;
        client.field925 = arg0.field1280;
        Statics.field2121 = client.field1145 == 0 ? 43594 : arg0.field1282 + 40000;
        Statics.field2231 = client.field1145 == 0 ? 443 : arg0.field1282 + 50000;
        Statics.field678 = Statics.field2121;
    }

    @ObfuscatedName("ar.c(B)V")
    public static void method625() {
        if (class79.method1017()) {
            field1417 = true;
        }
    }
}
