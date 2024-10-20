package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import javax.imageio.ImageIO;

@ObfuscatedName("cw")
public class class93 {

    @ObfuscatedName("cw.o")
    public static int field1427 = 0;

    @ObfuscatedName("cw.v")
    public static int field1457 = field1427 + 202;

    @ObfuscatedName("cw.w")
    public static int[] field1437 = new int[256];

    @ObfuscatedName("cw.x")
    public static int field1440 = 0;

    @ObfuscatedName("cw.r")
    public static int field1441 = 0;

    @ObfuscatedName("cw.am")
    public static int field1443 = 0;

    @ObfuscatedName("cw.ae")
    public static int field1447 = 0;

    @ObfuscatedName("cw.az")
    public static int field1429 = 0;

    @ObfuscatedName("cw.ar")
    public static int field1446 = 0;

    @ObfuscatedName("cw.ai")
    public static int field1435 = 10;

    @ObfuscatedName("cw.ap")
    public static String field1448 = "";

    @ObfuscatedName("cw.al")
    public static int field1449 = 0;

    @ObfuscatedName("cw.aw")
    public static String field1450 = "";

    @ObfuscatedName("cw.ak")
    public static String field1451 = "";

    @ObfuscatedName("cw.ax")
    public static String field1452 = "";

    @ObfuscatedName("cw.at")
    public static String field1453 = "";

    @ObfuscatedName("cw.ao")
    public static String field1431 = "";

    @ObfuscatedName("cw.aq")
    public static String field1445 = "";

    @ObfuscatedName("cw.ab")
    public static class150 field1456 = class150.field2189;

    @ObfuscatedName("cw.ac")
    public static boolean field1458 = true;

    @ObfuscatedName("cw.ag")
    public static int field1459 = 0;

    @ObfuscatedName("cw.au")
    public static String field1460 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cw.aa")
    public static String field1461 = "1234567890";

    @ObfuscatedName("cw.aj")
    public static boolean field1444 = false;

    @ObfuscatedName("cw.bh")
    public static int field1463 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.e(Lin;Lin;I)I")
    public static int method1653(class236 arg0, class236 arg1) {
        int var2 = 0;
        if (arg0.method3780("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3780("logo", "")) {
            var2++;
        }
        if (arg1.method3780("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3780("titlebox", "")) {
            var2++;
        }
        if (arg1.method3780("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3780("runes", "")) {
            var2++;
        }
        if (arg1.method3780("title_mute", "")) {
            var2++;
        }
        if (arg1.method3780("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3780("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3780("sl_back", "");
        arg1.method3780("sl_flags", "");
        arg1.method3780("sl_arrows", "");
        arg1.method3780("sl_stars", "");
        arg1.method3780("sl_button", "");
        return var2;
    }

    @ObfuscatedName("dv.o(I)I")
    public static int method2260() {
        return 9;
    }

    @ObfuscatedName("ga.m(Lin;Lin;ZIB)V")
    public static void method3403(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1428) {
            field1449 = arg3;
            class282.method4568();
            byte[] var4 = arg0.method3785("title.jpg", "");
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
            Statics.field1439 = var11;
            Statics.field1462 = Statics.field1439.method4688();
            if ((client.field919 & 0x20000000) == 0) {
                Statics.field1430 = Statics.method4509(arg1, "logo", "");
            } else {
                Statics.field1430 = Statics.method4509(arg1, "logo_deadman_mode", "");
            }
            Statics.field1455 = Statics.method4509(arg1, "titlebox", "");
            Statics.field3661 = Statics.method4509(arg1, "titlebutton", "");
            Statics.field2118 = class287.method3748(arg1, "runes", "");
            Statics.field1432 = class287.method3748(arg1, "title_mute", "");
            Statics.field1433 = Statics.method4509(arg1, "options_radio_buttons,0", "");
            Statics.field2008 = Statics.method4509(arg1, "options_radio_buttons,2", "");
            Statics.field1436 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1436[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1436[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1436[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1436[var17 + 192] = 16777215;
            }
            Statics.field475 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field475[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field475[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field475[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field475[var21 + 192] = 16777215;
            }
            Statics.field3765 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field3765[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field3765[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field3765[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field3765[var25 + 192] = 16777215;
            }
            Statics.field1438 = new int[256];
            Statics.field3701 = new int[32768];
            Statics.field1442 = new int[32768];
            method3734((class285) null);
            Statics.field389 = new int[32768];
            Statics.field447 = new int[32768];
            if (arg2) {
                field1431 = "";
                field1445 = "";
            }
            Statics.field1426 = 0;
            Statics.field2615 = "";
            field1458 = true;
            field1444 = false;
            if (Statics.field527.field1319) {
                class204.field2487 = 1;
                Statics.field2488 = null;
                Statics.field2489 = -1;
                Statics.field2483 = -1;
                Statics.field2043 = 0;
                Statics.field1383 = false;
                Statics.field2135 = 2;
            } else {
                class204.method2176(2, Statics.field316, "scape main", "", 255, false);
            }
            class239.method1600(false);
            Statics.field1428 = true;
            field1427 = (Statics.field413 - 765) / 2;
            field1457 = field1427 + 202;
            Statics.field1439.method4696(field1427, 0);
            Statics.field1462.method4696(field1427 + 382, 0);
            Statics.field1430.method4666(field1427 + 382 - Statics.field1430.field3768 / 2, 18);
        } else if (arg3 == 4) {
            field1449 = 4;
        }
    }

    @ObfuscatedName("fa.g(Lbd;B)V")
    public static void method2802(class59 arg0) {
        if (field1444) {
            method907(arg0);
            return;
        }
        if ((class60.field737 == 1 || !Statics.field264 && class60.field737 == 4) && class60.field736 >= field1427 + 765 - 50 && class60.field735 >= 453) {
            Statics.field527.field1319 = !Statics.field527.field1319;
            class82.method1400();
            if (Statics.field527.field1319) {
                Statics.field2486.method3457();
                class204.field2487 = 1;
                Statics.field2488 = null;
            } else {
                class238 var1 = Statics.field316;
                int var2 = var1.method3776("scape main");
                int var3 = var1.method3777(var2, "");
                class204.method4508(var1, var2, var3, 255, false);
            }
        }
        if (client.field927 == 5) {
            return;
        }
        field1429++;
        if (client.field927 != 10 && client.field927 != 11) {
            return;
        }
        if (client.field925 == 0) {
            if (class60.field737 == 1 || !Statics.field264 && class60.field737 == 4) {
                int var4 = field1427 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class60.field736 >= var4 && class60.field736 <= var4 + var6 && class60.field735 >= var5 && class60.field735 <= var5 + var7) {
                    if (class81.method19()) {
                        field1444 = true;
                    }
                    return;
                }
            }
            if (Statics.field2246 != null && class81.method19()) {
                field1444 = true;
            }
        }
        int var8 = class60.field737;
        int var9 = class60.field736;
        int var10 = class60.field735;
        if (!Statics.field264 && var8 == 4) {
            var8 = 1;
        }
        if (field1449 == 0) {
            boolean var11 = false;
            while (class51.method1521()) {
                if (Statics.field3360 == 84) {
                    var11 = true;
                }
            }
            int var12 = field1457 + 180 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                class57.method2717(Statics.method2696("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var14 = field1457 + 180 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field919 & 0x2000000) != 0) {
                    field1450 = "";
                    field1451 = class226.field3058;
                    field1452 = class226.field3059;
                    field1453 = class226.field3060;
                    field1449 = 1;
                    field1459 = 0;
                } else if ((client.field919 & 0x4) != 0) {
                    if ((client.field919 & 0x400) == 0) {
                        field1451 = class226.field2975;
                        field1452 = class226.field2922;
                        field1453 = class226.field3051;
                    } else {
                        field1451 = class226.field3102;
                        field1452 = class226.field2884;
                        field1453 = class226.field3057;
                    }
                    field1450 = class226.field3048;
                    field1449 = 1;
                    field1459 = 0;
                } else if ((client.field919 & 0x400) == 0) {
                    field1451 = class226.field2983;
                    field1452 = class226.field3046;
                    field1453 = class226.field3047;
                    field1449 = 2;
                    field1459 = 0;
                } else {
                    field1451 = class226.field3081;
                    field1452 = class226.field3042;
                    field1453 = class226.field3054;
                    field1450 = class226.field3048;
                    field1449 = 1;
                    field1459 = 0;
                }
            }
        } else if (field1449 == 1) {
            while (class51.method1521()) {
                if (Statics.field3360 == 84) {
                    field1451 = class226.field2983;
                    field1452 = class226.field3046;
                    field1453 = class226.field3047;
                    field1449 = 2;
                    field1459 = 0;
                } else if (Statics.field3360 == 13) {
                    field1449 = 0;
                }
            }
            int var15 = field1457 + 180 - 80;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field1451 = class226.field2983;
                field1452 = class226.field3046;
                field1453 = class226.field3047;
                field1449 = 2;
                field1459 = 0;
            }
            int var17 = field1457 + 180 + 80;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field1449 = 0;
            }
        } else if (field1449 == 2) {
            short var18 = 231;
            int var40 = var18 + 30;
            if (var8 == 1 && var10 >= var40 - 15 && var10 < var40) {
                field1459 = 0;
            }
            var40 += 15;
            if (var8 == 1 && var10 >= var40 - 15 && var10 < var40) {
                field1459 = 1;
            }
            var40 += 15;
            short var19 = 361;
            if (var8 == 1 && var10 >= var19 - 15 && var10 < var19) {
                method229(class226.field3084, class226.field3085, class226.field3086);
                field1449 = 5;
                return;
            }
            int var20 = field1457 + 180 - 80;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field1431 = field1431.trim();
                if (field1431.length() == 0) {
                    method229(class226.field3111, class226.field2952, class226.field2866);
                    return;
                }
                if (field1445.length() == 0) {
                    method229(class226.field2954, class226.field2955, class226.field3099);
                    return;
                }
                method229(class226.field3063, class226.field3064, class226.field3028);
                field1456 = Statics.field527.field1312.containsKey(class271.method959(field1431)) ? class150.field2187 : class150.field2189;
                client.method116(20);
                return;
            }
            int var22 = field1457 + 180 + 80;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field1449 = 0;
                field1431 = "";
                field1445 = "";
                Statics.field1426 = 0;
                Statics.field2615 = "";
                field1458 = true;
            }
            while (true) {
                while (class51.method1521()) {
                    boolean var23 = false;
                    for (int var24 = 0; var24 < field1460.length(); var24++) {
                        if (Statics.field593 == field1460.charAt(var24)) {
                            var23 = true;
                            break;
                        }
                    }
                    if (Statics.field3360 == 13) {
                        field1449 = 0;
                        field1431 = "";
                        field1445 = "";
                        Statics.field1426 = 0;
                        Statics.field2615 = "";
                        field1458 = true;
                    } else if (field1459 == 0) {
                        if (Statics.field3360 == 85 && field1431.length() > 0) {
                            field1431 = field1431.substring(0, field1431.length() - 1);
                        }
                        if (Statics.field3360 == 84 || Statics.field3360 == 80) {
                            field1459 = 1;
                        }
                        if (var23 && field1431.length() < 320) {
                            field1431 = field1431 + Statics.field593;
                        }
                    } else if (field1459 == 1) {
                        if (Statics.field3360 == 85 && field1445.length() > 0) {
                            field1445 = field1445.substring(0, field1445.length() - 1);
                        }
                        if (Statics.field3360 == 84 || Statics.field3360 == 80) {
                            field1459 = 0;
                        }
                        if (Statics.field3360 == 84) {
                            field1431 = field1431.trim();
                            if (field1431.length() == 0) {
                                method229(class226.field3111, class226.field2952, class226.field2866);
                                return;
                            }
                            if (field1445.length() == 0) {
                                method229(class226.field2954, class226.field2955, class226.field3099);
                                return;
                            }
                            method229(class226.field3063, class226.field3064, class226.field3028);
                            field1456 = Statics.field527.field1312.containsKey(class271.method959(field1431)) ? class150.field2187 : class150.field2189;
                            client.method116(20);
                            return;
                        }
                        if (var23 && field1445.length() < 20) {
                            field1445 = field1445 + Statics.field593;
                        }
                    }
                }
                return;
            }
        } else if (field1449 == 3) {
            int var25 = field1457 + 180;
            short var26 = 276;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                field1451 = class226.field2983;
                field1452 = class226.field3046;
                field1453 = class226.field3047;
                field1449 = 2;
                field1459 = 0;
            }
            int var27 = field1457 + 180;
            short var28 = 326;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var28 - 20 && var10 <= var28 + 20) {
                method229(class226.field3084, class226.field3085, class226.field3086);
                field1449 = 5;
                return;
            }
        } else if (field1449 == 4) {
            int var29 = field1457 + 180 - 80;
            short var30 = 321;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                Statics.field2615.trim();
                if (Statics.field2615.length() != 6) {
                    method229(class226.field2870, class226.field2871, class226.field2872);
                    return;
                }
                Statics.field1426 = Integer.parseInt(Statics.field2615);
                Statics.field2615 = "";
                field1456 = field1458 ? class150.field2190 : class150.field2192;
                method229(class226.field3063, class226.field3064, class226.field3028);
                client.method116(20);
                return;
            }
            if (var8 == 1 && var9 >= field1457 + 180 - 9 && var9 <= field1457 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field1458 = !field1458;
            }
            if (var8 == 1 && var9 >= field1457 + 180 - 34 && var9 <= field1457 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class57.method2717(Statics.method2696("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var31 = field1457 + 180 + 80;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                field1449 = 0;
                field1431 = "";
                field1445 = "";
                Statics.field1426 = 0;
                Statics.field2615 = "";
            }
            while (class51.method1521()) {
                boolean var32 = false;
                for (int var33 = 0; var33 < field1461.length(); var33++) {
                    if (Statics.field593 == field1461.charAt(var33)) {
                        var32 = true;
                        break;
                    }
                }
                if (Statics.field3360 == 13) {
                    field1449 = 0;
                    field1431 = "";
                    field1445 = "";
                    Statics.field1426 = 0;
                    Statics.field2615 = "";
                } else {
                    if (Statics.field3360 == 85 && Statics.field2615.length() > 0) {
                        Statics.field2615 = Statics.field2615.substring(0, Statics.field2615.length() - 1);
                    }
                    if (Statics.field3360 == 84) {
                        Statics.field2615.trim();
                        if (Statics.field2615.length() != 6) {
                            method229(class226.field2870, class226.field2871, class226.field2872);
                            return;
                        }
                        Statics.field1426 = Integer.parseInt(Statics.field2615);
                        Statics.field2615 = "";
                        field1456 = field1458 ? class150.field2190 : class150.field2192;
                        method229(class226.field3063, class226.field3064, class226.field3028);
                        client.method116(20);
                        return;
                    }
                    if (var32 && Statics.field2615.length() < 6) {
                        Statics.field2615 = Statics.field2615 + Statics.field593;
                    }
                }
            }
        } else if (field1449 == 5) {
            int var34 = field1457 + 180 - 80;
            short var35 = 321;
            if (var8 == 1 && var9 >= var34 - 75 && var9 <= var34 + 75 && var10 >= var35 - 20 && var10 <= var35 + 20) {
                method473();
                return;
            }
            int var36 = field1457 + 180 + 80;
            if (var8 == 1 && var9 >= var36 - 75 && var9 <= var36 + 75 && var10 >= var35 - 20 && var10 <= var35 + 20) {
                field1451 = class226.field2983;
                field1452 = class226.field3046;
                field1453 = class226.field3047;
                field1449 = 2;
                field1459 = 0;
                field1445 = "";
            }
            while (class51.method1521()) {
                boolean var37 = false;
                for (int var38 = 0; var38 < field1460.length(); var38++) {
                    if (Statics.field593 == field1460.charAt(var38)) {
                        var37 = true;
                        break;
                    }
                }
                if (Statics.field3360 == 13) {
                    field1451 = class226.field2983;
                    field1452 = class226.field3046;
                    field1453 = class226.field3047;
                    field1449 = 2;
                    field1459 = 0;
                    field1445 = "";
                } else {
                    if (Statics.field3360 == 85 && field1431.length() > 0) {
                        field1431 = field1431.substring(0, field1431.length() - 1);
                    }
                    if (Statics.field3360 == 84) {
                        method473();
                        return;
                    }
                    if (var37 && field1431.length() < 320) {
                        field1431 = field1431 + Statics.field593;
                    }
                }
            }
        } else if (field1449 == 6) {
            while (true) {
                do {
                    if (!class51.method1521()) {
                        short var39 = 321;
                        if (var8 == 1 && var10 >= var39 - 20 && var10 <= var39 + 20) {
                            field1451 = class226.field2983;
                            field1452 = class226.field3046;
                            field1453 = class226.field3047;
                            field1449 = 2;
                            field1459 = 0;
                            field1445 = "";
                        }
                        return;
                    }
                } while (Statics.field3360 != 84 && Statics.field3360 != 13);
                field1451 = class226.field2983;
                field1452 = class226.field3046;
                field1453 = class226.field3047;
                field1449 = 2;
                field1459 = 0;
                field1445 = "";
            }
        }
    }

    @ObfuscatedName("at.d(B)V")
    public static void method473() {
        field1431 = field1431.trim();
        if (field1431.length() == 0) {
            method229(class226.field3084, class226.field3085, class226.field3086);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(Statics.method2696("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2373, var4.field2370, 1000 - var4.field2370);
                if (var5 == -1) {
                    var4.field2370 = 0;
                    long var8 = var4.method2897();
                    var6 = var8;
                    break;
                }
                var4.field2370 += var5;
                if (var4.field2370 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var56) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1431;
            Random var15 = new Random();
            class174 var16 = new class174(128);
            class174 var17 = new class174(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2876(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method3055(var15.nextInt());
            }
            var16.method3055(var18[0]);
            var16.method3055(var18[1]);
            var16.method2881(var6);
            var16.method2881(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method3055(var15.nextInt());
            }
            var16.method2911(class88.field1388, class88.field1389);
            var17.method2876(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method3055(var15.nextInt());
            }
            var17.method2881(var15.nextLong());
            var17.method2940(var15.nextLong());
            if (client.field957 == null) {
                byte[] var22 = new byte[24];
                try {
                    class156.field2235.method2127(0L);
                    class156.field2235.method2113(var22);
                    int var23;
                    for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                    }
                    if (var23 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var55) {
                    for (int var25 = 0; var25 < 24; var25++) {
                        var22[var25] = -1;
                    }
                }
                var17.method2882(var22, 0, var22.length);
            } else {
                var17.method2882(client.field957, 0, client.field957.length);
            }
            var17.method2881(var15.nextLong());
            var17.method2911(class88.field1388, class88.field1389);
            int var28 = class174.method2750(var14);
            if (var28 % 8 != 0) {
                var28 += 8 - var28 % 8;
            }
            class174 var29 = new class174(var28);
            var29.method2936(var14);
            var29.field2370 = var28;
            var29.method2991(var18);
            class174 var30 = new class174(var29.field2370 + var17.field2370 + var16.field2370 + 5);
            var30.method2876(2);
            var30.method2876(var16.field2370);
            var30.method2882(var16.field2373, 0, var16.field2370);
            var30.method2876(var17.field2370);
            var30.method2882(var17.field2373, 0, var17.field2370);
            var30.method2877(var29.field2370);
            var30.method2882(var29.field2373, 0, var29.field2370);
            byte[] var31 = var30.field2373;
            int var32 = var31.length;
            StringBuilder var33 = new StringBuilder();
            for (int var34 = 0; var34 < var32; var34 += 3) {
                int var35 = var31[var34] & 0xFF;
                var33.append(class270.field3662[var35 >>> 2]);
                if (var34 < var32 - 1) {
                    int var36 = var31[var34 + 1] & 0xFF;
                    var33.append(class270.field3662[(var35 & 0x3) << 4 | var36 >>> 4]);
                    if (var34 < var32 - 2) {
                        int var37 = var31[var34 + 2] & 0xFF;
                        var33.append(class270.field3662[(var36 & 0xF) << 2 | var37 >>> 6]).append(class270.field3662[var37 & 0x3F]);
                    } else {
                        var33.append(class270.field3662[(var36 & 0xF) << 2]).append("=");
                    }
                } else {
                    var33.append(class270.field3662[(var35 & 0x3) << 4]).append("==");
                }
            }
            String var38 = var33.toString();
            String var40 = var38;
            byte var47;
            try {
                URL var41 = new URL(Statics.method2696("services", false) + "m=accountappeal/login.ws");
                URLConnection var42 = var41.openConnection();
                var42.setDoInput(true);
                var42.setDoOutput(true);
                var42.setConnectTimeout(5000);
                OutputStreamWriter var43 = new OutputStreamWriter(var42.getOutputStream());
                var43.write("data2=" + Statics.method3659(var40) + "&dest=" + Statics.method3659("passwordchoice.ws"));
                var43.flush();
                InputStream var44 = var42.getInputStream();
                class174 var45 = new class174(new byte[1000]);
                while (true) {
                    int var46 = var44.read(var45.field2373, var45.field2370, 1000 - var45.field2370);
                    if (var46 == -1) {
                        var43.close();
                        var44.close();
                        String var48 = new String(var45.field2373);
                        if (var48.startsWith("OFFLINE")) {
                            var47 = 4;
                        } else if (var48.startsWith("WRONG")) {
                            var47 = 7;
                        } else if (var48.startsWith("RELOAD")) {
                            var47 = 3;
                        } else if (var48.startsWith("Not permitted for social network accounts.")) {
                            var47 = 6;
                        } else {
                            var45.method2909(var18);
                            while (var45.field2370 > 0 && var45.field2373[var45.field2370 - 1] == 0) {
                                var45.field2370--;
                            }
                            String var49 = new String(var45.field2373, 0, var45.field2370);
                            boolean var50;
                            if (var49 == null) {
                                var50 = false;
                            } else {
                                label131: {
                                    try {
                                        new URL(var49);
                                    } catch (MalformedURLException var53) {
                                        var50 = false;
                                        break label131;
                                    }
                                    var50 = true;
                                }
                            }
                            if (var50) {
                                class57.method2717(var49, true, false);
                                var47 = 2;
                            } else {
                                var47 = 5;
                            }
                        }
                        break;
                    }
                    var45.field2370 += var46;
                    if (var45.field2370 >= 1000) {
                        var47 = 5;
                        break;
                    }
                }
            } catch (Throwable var54) {
                var54.printStackTrace();
                var47 = 5;
            }
            var13 = var47;
        }
        switch(var13) {
            case 2:
                method229(class226.field3087, class226.field3088, class226.field2855);
                field1449 = 6;
                break;
            case 3:
                method229(class226.field3090, class226.field3091, class226.field3092);
                break;
            case 4:
                method229(class226.field3093, class226.field3094, class226.field3095);
                break;
            case 5:
                method229(class226.field3096, class226.field3097, class226.field2942);
                break;
            case 6:
                method229(class226.field3101, class226.field3112, class226.field2964);
                break;
            case 7:
                method229(class226.field3009, class226.field3001, class226.field2839);
        }
    }

    @ObfuscatedName("client.b(Ljf;Ljf;Ljf;ZI)V")
    public static void method1373(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1427 = (Statics.field413 - 765) / 2;
            field1457 = field1427 + 202;
        }
        if (field1444) {
            method958(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1439.method4696(field1427, 0);
            Statics.field1462.method4696(field1427 + 382, 0);
            Statics.field1430.method4666(field1427 + 382 - Statics.field1430.field3768 / 2, 18);
        }
        if (client.field927 == 0 || client.field927 == 5) {
            byte var4 = 20;
            arg0.method4432(class226.field3044, field1457 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class282.method4589(field1457 + 180 - 152, var5, 304, 34, 9179409);
            class282.method4589(field1457 + 180 - 151, var5 + 1, 302, 32, 0);
            class282.method4607(field1457 + 180 - 150, var5 + 2, field1435 * 3, 30, 9179409);
            class282.method4607(field1435 * 3 + (field1457 + 180 - 150), var5 + 2, 300 - field1435 * 3, 30, 0);
            arg0.method4432(field1448, field1457 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field927 == 20) {
            Statics.field1455.method4666(field1457 + 180 - Statics.field1455.field3768 / 2, 271 - Statics.field1455.field3769 / 2);
            short var6 = 211;
            arg0.method4432(field1451, field1457 + 180, var6, 16776960, 0);
            int var49 = var6 + 15;
            arg0.method4432(field1452, field1457 + 180, var49, 16776960, 0);
            int var50 = var49 + 15;
            arg0.method4432(field1453, field1457 + 180, var50, 16776960, 0);
            int var51 = var50 + 15;
            int var52 = var51 + 10;
            if (field1449 != 4) {
                arg0.method4401(class226.field3066, field1457 + 180 - 110, var52, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field1431; arg0.method4446(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4401(class265.method4400(var8), field1457 + 180 - 70, var52, 16777215, 0);
                var49 = var52 + 15;
                arg0.method4401(class226.field3067 + class271.method980(field1445), field1457 + 180 - 108, var49, 16777215, 0);
                var49 += 15;
            }
        }
        if (client.field927 == 10 || client.field927 == 11) {
            Statics.field1455.method4666(field1457, 171);
            if (field1449 == 0) {
                short var9 = 251;
                arg0.method4432(class226.field2914, field1457 + 180, var9, 16776960, 0);
                int var53 = var9 + 30;
                int var10 = field1457 + 180 - 80;
                short var11 = 291;
                Statics.field3661.method4666(var10 - 73, var11 - 20);
                arg0.method4435(class226.field3070, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1457 + 180 + 80;
                Statics.field3661.method4666(var12 - 73, var11 - 20);
                arg0.method4435(class226.field3071, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1449 == 1) {
                arg0.method4432(field1450, field1457 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method4432(field1451, field1457 + 180, var13, 16777215, 0);
                int var54 = var13 + 15;
                arg0.method4432(field1452, field1457 + 180, var54, 16777215, 0);
                int var55 = var54 + 15;
                arg0.method4432(field1453, field1457 + 180, var55, 16777215, 0);
                int var56 = var55 + 15;
                int var14 = field1457 + 180 - 80;
                short var15 = 321;
                Statics.field3661.method4666(var14 - 73, var15 - 20);
                arg0.method4432(class226.field2840, var14, var15 + 5, 16777215, 0);
                int var16 = field1457 + 180 + 80;
                Statics.field3661.method4666(var16 - 73, var15 - 20);
                arg0.method4432(class226.field3073, var16, var15 + 5, 16777215, 0);
            } else if (field1449 == 2) {
                short var17 = 211;
                arg0.method4432(field1451, field1457 + 180, var17, 16776960, 0);
                int var57 = var17 + 15;
                arg0.method4432(field1452, field1457 + 180, var57, 16776960, 0);
                int var58 = var57 + 15;
                arg0.method4432(field1453, field1457 + 180, var58, 16776960, 0);
                int var59 = var58 + 15;
                int var60 = var59 + 10;
                arg0.method4401(class226.field3066, field1457 + 180 - 110, var60, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field1431; arg0.method4446(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4401(class265.method4400(var19) + (field1459 == 0 & client.field929 % 40 < 20 ? class89.method2665(16776960) + class89.field1393 : ""), field1457 + 180 - 70, var60, 16777215, 0);
                var57 = var60 + 15;
                arg0.method4401(class226.field3067 + class271.method980(field1445) + (field1459 == 1 & client.field929 % 40 < 20 ? class89.method2665(16776960) + class89.field1393 : ""), field1457 + 180 - 108, var57, 16777215, 0);
                var57 += 15;
                int var20 = field1457 + 180 - 80;
                short var21 = 321;
                Statics.field3661.method4666(var20 - 73, var21 - 20);
                arg0.method4432(class226.field2944, var20, var21 + 5, 16777215, 0);
                int var22 = field1457 + 180 + 80;
                Statics.field3661.method4666(var22 - 73, var21 - 20);
                arg0.method4432(class226.field3073, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method4432(class226.field3079, field1457 + 180, var23, 16776960, 0);
            } else if (field1449 == 3) {
                short var24 = 201;
                arg0.method4432(class226.field2996, field1457 + 180, var24, 16776960, 0);
                int var61 = var24 + 20;
                arg1.method4432(class226.field3075, field1457 + 180, var61, 16776960, 0);
                int var62 = var61 + 15;
                arg1.method4432(class226.field3076, field1457 + 180, var62, 16776960, 0);
                int var63 = var62 + 15;
                int var25 = field1457 + 180;
                short var26 = 276;
                Statics.field3661.method4666(var25 - 73, var26 - 20);
                arg2.method4432(class226.field2852, var25, var26 + 5, 16777215, 0);
                int var27 = field1457 + 180;
                short var28 = 326;
                Statics.field3661.method4666(var27 - 73, var28 - 20);
                arg2.method4432(class226.field2937, var27, var28 + 5, 16777215, 0);
            } else if (field1449 == 4) {
                arg0.method4432(class226.field3100, field1457 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method4432(field1451, field1457 + 180, var29, 16777215, 0);
                int var64 = var29 + 15;
                arg0.method4432(field1452, field1457 + 180, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method4432(field1453, field1457 + 180, var65, 16777215, 0);
                int var66 = var65 + 15;
                arg0.method4401(class226.field3068 + class271.method980(Statics.field2615) + (client.field929 % 40 < 20 ? class89.method2665(16776960) + class89.field1393 : ""), field1457 + 180 - 108, var66, 16777215, 0);
                int var67 = var66 - 8;
                arg0.method4401(class226.field3103, field1457 + 180 - 9, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method4401(class226.field2843, field1457 + 180 - 9, var68, 16776960, 0);
                int var30 = field1457 + 180 - 9 + arg0.method4446(class226.field2843) + 15;
                int var31 = var68 - arg0.field3627;
                class285 var32;
                if (field1458) {
                    var32 = Statics.field2008;
                } else {
                    var32 = Statics.field1433;
                }
                var32.method4666(var30, var31);
                var64 = var68 + 15;
                int var33 = field1457 + 180 - 80;
                short var34 = 321;
                Statics.field3661.method4666(var33 - 73, var34 - 20);
                arg0.method4432(class226.field2840, var33, var34 + 5, 16777215, 0);
                int var35 = field1457 + 180 + 80;
                Statics.field3661.method4666(var35 - 73, var34 - 20);
                arg0.method4432(class226.field3073, var35, var34 + 5, 16777215, 0);
                arg1.method4432(class226.field3062, field1457 + 180, var34 + 36, 255, 0);
            } else if (field1449 == 5) {
                arg0.method4432(class226.field3080, field1457 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method4432(field1451, field1457 + 180, var36, 16776960, 0);
                int var69 = var36 + 15;
                arg2.method4432(field1452, field1457 + 180, var69, 16776960, 0);
                int var70 = var69 + 15;
                arg2.method4432(field1453, field1457 + 180, var70, 16776960, 0);
                int var71 = var70 + 15;
                int var72 = var71 + 14;
                arg0.method4401(class226.field3027, field1457 + 180 - 145, var72, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field1431; arg0.method4446(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method4401(class265.method4400(var38) + (client.field929 % 40 < 20 ? class89.method2665(16776960) + class89.field1393 : ""), field1457 + 180 - 34, var72, 16777215, 0);
                var69 = var72 + 15;
                int var39 = field1457 + 180 - 80;
                short var40 = 321;
                Statics.field3661.method4666(var39 - 73, var40 - 20);
                arg0.method4432(class226.field3082, var39, var40 + 5, 16777215, 0);
                int var41 = field1457 + 180 + 80;
                Statics.field3661.method4666(var41 - 73, var40 - 20);
                arg0.method4432(class226.field3083, var41, var40 + 5, 16777215, 0);
            } else if (field1449 == 6) {
                short var42 = 211;
                arg0.method4432(field1451, field1457 + 180, var42, 16776960, 0);
                int var73 = var42 + 15;
                arg0.method4432(field1452, field1457 + 180, var73, 16776960, 0);
                int var74 = var73 + 15;
                arg0.method4432(field1453, field1457 + 180, var74, 16776960, 0);
                int var75 = var74 + 15;
                int var43 = field1457 + 180;
                short var44 = 321;
                Statics.field3661.method4666(var43 - 73, var44 - 20);
                arg0.method4432(class226.field3083, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field1429 > 0) {
            method460(field1429);
            field1429 = 0;
        }
        Statics.method985();
        Statics.field1432[Statics.field527.field1319 ? 1 : 0].method4666(field1427 + 765 - 40, 463);
        if (client.field927 > 5 && client.field925 == 0) {
            if (Statics.field371 == null) {
                Statics.field371 = Statics.method4509(Statics.field311, "sl_button", "");
            } else {
                int var45 = field1427 + 5;
                short var46 = 463;
                byte var47 = 100;
                byte var48 = 35;
                Statics.field371.method4666(var45, var46);
                arg0.method4432(class226.field2876 + " " + client.field918, var47 / 2 + var45, var48 / 2 + var46 - 2, 16777215, 0);
                if (Statics.field2246 == null) {
                    arg1.method4432(class226.field3115, var47 / 2 + var45, var48 / 2 + var46 + 12, 16777215, 0);
                } else {
                    arg1.method4432(class226.field3114, var47 / 2 + var45, var48 / 2 + var46 + 12, 16777215, 0);
                }
            }
        }
        Statics.field844.method718(0, 0);
    }

    @ObfuscatedName("ar.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method229(String arg0, String arg1, String arg2) {
        field1451 = arg0;
        field1452 = arg1;
        field1453 = arg2;
    }

    @ObfuscatedName("ha.q(Ljh;I)V")
    public static final void method3734(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3701.length; var2++) {
            Statics.field3701[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3701[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1442[var8] = (Statics.field3701[var8 - 1] + Statics.field3701[var8 + 1] + Statics.field3701[var8 - 128] + Statics.field3701[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3701;
            Statics.field3701 = Statics.field1442;
            Statics.field1442 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3769; var11++) {
            for (int var12 = 0; var12 < arg0.field3768; var12++) {
                if (arg0.field3766[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3771;
                    int var14 = var11 + 16 + arg0.field3770;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3701[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("aw.h(II)V")
    public static final void method460(int arg0) {
        short var1 = 256;
        field1443 += arg0 * 128;
        if (field1443 > Statics.field3701.length) {
            field1443 -= Statics.field3701.length;
            int var2 = (int) (Math.random() * 12.0D);
            method3734(Statics.field2118[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field389[var3 + var4] - Statics.field3701[field1443 + var3 & Statics.field3701.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field389[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field389[var9 + var10] = 255;
                } else {
                    Statics.field389[var9 + var10] = 0;
                }
            }
        }
        if (field1440 > 0) {
            field1440 -= arg0 * 4;
        }
        if (field1441 > 0) {
            field1441 -= arg0 * 4;
        }
        if (field1440 == 0 && field1441 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1440 = 1024;
            }
            if (var12 == 1) {
                field1441 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1437[var13] = field1437[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1437[var14] = (int) (Math.sin((double) field1446 / 14.0D) * 16.0D + Math.sin((double) field1446 / 15.0D) * 14.0D + Math.sin((double) field1446 / 16.0D) * 12.0D);
            field1446++;
        }
        field1447 += arg0 * -2039248867;
        int var15 = ((client.field929 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1447 * -2032419660; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field389[(var18 << 7) + var17] = 192;
        }
        field1447 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field389[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field389[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field447[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field447[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field447[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field389[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bj.i(IIIB)I")
    public static final int method1000(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bb.n(Ljf;Ljf;I)V")
    public static void method958(class264 arg0, class264 arg1) {
        if (Statics.field247 == null) {
            Statics.field247 = class287.method26(Statics.field311, "sl_back", "");
        }
        if (Statics.field380 == null) {
            Statics.field380 = class287.method3748(Statics.field311, "sl_flags", "");
        }
        if (Statics.field2206 == null) {
            Statics.field2206 = class287.method3748(Statics.field311, "sl_arrows", "");
        }
        if (Statics.field773 == null) {
            Statics.field773 = class287.method3748(Statics.field311, "sl_stars", "");
        }
        class282.method4607(field1427, 23, 765, 480, 0);
        class282.method4577(field1427, 0, 125, 23, 12425273, 9135624);
        class282.method4577(field1427 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4432(class226.field2967, field1427 + 62, 15, 0, -1);
        if (Statics.field773 != null) {
            Statics.field773[1].method4666(field1427 + 140, 1);
            arg1.method4401(class226.field3106, field1427 + 152, 10, 16777215, -1);
            Statics.field773[0].method4666(field1427 + 140, 12);
            arg1.method4401(class226.field3107, field1427 + 152, 21, 16777215, -1);
        }
        if (Statics.field2206 != null) {
            int var2 = field1427 + 280;
            if (class81.field1300[0] == 0 && class81.field1293[0] == 0) {
                Statics.field2206[2].method4666(var2, 4);
            } else {
                Statics.field2206[0].method4666(var2, 4);
            }
            if (class81.field1300[0] == 0 && class81.field1293[0] == 1) {
                Statics.field2206[3].method4666(var2 + 15, 4);
            } else {
                Statics.field2206[1].method4666(var2 + 15, 4);
            }
            arg0.method4401(class226.field3108, var2 + 32, 17, 16777215, -1);
            int var3 = field1427 + 390;
            if (class81.field1300[0] == 1 && class81.field1293[0] == 0) {
                Statics.field2206[2].method4666(var3, 4);
            } else {
                Statics.field2206[0].method4666(var3, 4);
            }
            if (class81.field1300[0] == 1 && class81.field1293[0] == 1) {
                Statics.field2206[3].method4666(var3 + 15, 4);
            } else {
                Statics.field2206[1].method4666(var3 + 15, 4);
            }
            arg0.method4401(class226.field3089, var3 + 32, 17, 16777215, -1);
            int var4 = field1427 + 500;
            if (class81.field1300[0] == 2 && class81.field1293[0] == 0) {
                Statics.field2206[2].method4666(var4, 4);
            } else {
                Statics.field2206[0].method4666(var4, 4);
            }
            if (class81.field1300[0] == 2 && class81.field1293[0] == 1) {
                Statics.field2206[3].method4666(var4 + 15, 4);
            } else {
                Statics.field2206[1].method4666(var4 + 15, 4);
            }
            arg0.method4401(class226.field3110, var4 + 32, 17, 16777215, -1);
            int var5 = field1427 + 610;
            if (class81.field1300[0] == 3 && class81.field1293[0] == 0) {
                Statics.field2206[2].method4666(var5, 4);
            } else {
                Statics.field2206[0].method4666(var5, 4);
            }
            if (class81.field1300[0] == 3 && class81.field1293[0] == 1) {
                Statics.field2206[3].method4666(var5 + 15, 4);
            } else {
                Statics.field2206[1].method4666(var5 + 15, 4);
            }
            arg0.method4401(class226.field3002, var5 + 32, 17, 16777215, -1);
        }
        class282.method4607(field1427 + 708, 4, 50, 16, 0);
        arg1.method4432(class226.field3073, field1427 + 708 + 25, 16, 16777215, -1);
        field1463 = -1;
        if (Statics.field247 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class81.field1297) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class81.field1297) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class81.field1297) {
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
            int var17 = field1427 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class81.field1297; var20++) {
                class81 var21 = Statics.field1296[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1303);
                if (var21.field1303 == -1) {
                    var23 = class226.field2925;
                    var22 = false;
                } else if (var21.field1303 > 1980) {
                    var23 = class226.field3003;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1436()) {
                    if (var21.method1403()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1406()) {
                    var24 = 16711680;
                    if (var21.method1403()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1405()) {
                    if (var21.method1403()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1403()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field729 >= var17 && class60.field726 >= var16 && class60.field729 < var6 + var17 && class60.field726 < var7 + var16 && var22) {
                    field1463 = var20;
                    Statics.field247[var25].method4729(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field247[var25].method4696(var17, var16);
                }
                if (Statics.field380 != null) {
                    Statics.field380[(var21.method1403() ? 8 : 0) + var21.field1294].method4666(var17 + 29, var16);
                }
                arg0.method4432(Integer.toString(var21.field1301), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4432(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4446(Statics.field1296[field1463].field1306) + 6;
                int var27 = arg1.field3627 + 8;
                class282.method4607(class60.field729 - var26 / 2, class60.field726 + 20 + 5, var26, var27, 16777120);
                class282.method4589(class60.field729 - var26 / 2, class60.field726 + 20 + 5, var26, var27, 0);
                arg1.method4432(Statics.field1296[field1463].field1306, class60.field729, class60.field726 + 20 + 5 + arg1.field3627 + 4, 0, -1);
            }
        }
        Statics.field844.method718(0, 0);
    }

    @ObfuscatedName("bn.c(Lbd;B)V")
    public static void method907(class59 arg0) {
        if (class60.field737 != 1 && Statics.field264 || class60.field737 != 4) {
            return;
        }
        int var1 = field1427 + 280;
        if (class60.field736 >= var1 && class60.field736 <= var1 + 14 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(0, 0);
            return;
        }
        if (class60.field736 >= var1 + 15 && class60.field736 <= var1 + 80 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(0, 1);
            return;
        }
        int var2 = field1427 + 390;
        if (class60.field736 >= var2 && class60.field736 <= var2 + 14 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(1, 0);
            return;
        }
        if (class60.field736 >= var2 + 15 && class60.field736 <= var2 + 80 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(1, 1);
            return;
        }
        int var3 = field1427 + 500;
        if (class60.field736 >= var3 && class60.field736 <= var3 + 14 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(2, 0);
            return;
        }
        if (class60.field736 >= var3 + 15 && class60.field736 <= var3 + 80 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(2, 1);
            return;
        }
        int var4 = field1427 + 610;
        if (class60.field736 >= var4 && class60.field736 <= var4 + 14 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(3, 0);
            return;
        }
        if (class60.field736 >= var4 + 15 && class60.field736 <= var4 + 80 && class60.field735 >= 4 && class60.field735 <= 18) {
            class81.method1375(3, 1);
            return;
        }
        if (class60.field736 >= field1427 + 708 && class60.field735 >= 4 && class60.field736 <= field1427 + 708 + 50 && class60.field735 <= 20) {
            field1444 = false;
            Statics.field1439.method4696(field1427, 0);
            Statics.field1462.method4696(field1427 + 382, 0);
            Statics.field1430.method4666(field1427 + 382 - Statics.field1430.field3768 / 2, 18);
            return;
        }
        if (field1463 == -1) {
            return;
        }
        class81 var5 = Statics.field1296[field1463];
        method4378(var5);
        field1444 = false;
        Statics.field1439.method4696(field1427, 0);
        Statics.field1462.method4696(field1427 + 382, 0);
        Statics.field1430.method4666(field1427 + 382 - Statics.field1430.field3768 / 2, 18);
        return;
    }

    @ObfuscatedName("jn.v(Lcf;B)V")
    public static void method4378(class81 arg0) {
        if (arg0.method1403() != client.field1031) {
            client.field1031 = arg0.method1403();
            Statics.method11(arg0.method1403());
        }
        Statics.field235 = arg0.field1302;
        client.field918 = arg0.field1301;
        client.field919 = arg0.field1299;
        Statics.field657 = client.field921 == 0 ? 43594 : arg0.field1301 + 40000;
        Statics.field526 = client.field921 == 0 ? 443 : arg0.field1301 + 50000;
        Statics.field793 = Statics.field657;
    }
}
