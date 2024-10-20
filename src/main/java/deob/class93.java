package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("ci")
public class class93 {

    @ObfuscatedName("ci.c")
    public static int field1460 = 0;

    @ObfuscatedName("ci.k")
    public static int field1447 = field1460 + 202;

    @ObfuscatedName("ci.m")
    public static int[] field1448 = new int[256];

    @ObfuscatedName("ci.p")
    public static int field1445 = 0;

    @ObfuscatedName("ci.l")
    public static int field1450 = 0;

    @ObfuscatedName("ci.an")
    public static int field1451 = 0;

    @ObfuscatedName("ci.af")
    public static int field1452 = 0;

    @ObfuscatedName("ci.at")
    public static int field1453 = 0;

    @ObfuscatedName("ci.ah")
    public static int field1454 = 0;

    @ObfuscatedName("ci.ai")
    public static int field1449 = 10;

    @ObfuscatedName("ci.aw")
    public static String field1456 = "";

    @ObfuscatedName("ci.al")
    public static int field1457 = 0;

    @ObfuscatedName("ci.ab")
    public static String field1461 = "";

    @ObfuscatedName("ci.aa")
    public static String field1459 = "";

    @ObfuscatedName("ci.ap")
    public static String field1442 = "";

    @ObfuscatedName("ci.ae")
    public static String field1468 = "";

    @ObfuscatedName("ci.as")
    public static String field1444 = "";

    @ObfuscatedName("ci.av")
    public static String field1463 = "";

    @ObfuscatedName("ci.ag")
    public static class150 field1455 = class150.field2214;

    @ObfuscatedName("ci.ax")
    public static boolean field1465 = true;

    @ObfuscatedName("ci.au")
    public static int field1466 = 0;

    @ObfuscatedName("ci.aj")
    public static String field1467 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.aq")
    public static String field1462 = "1234567890";

    @ObfuscatedName("ci.ak")
    public static boolean field1469 = false;

    @ObfuscatedName("ci.bo")
    public static int field1470 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.i(Liw;Liw;ZII)V")
    public static void method80(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field335) {
            field1457 = arg3;
            class282.method4557();
            byte[] var4 = arg0.method3830("title.jpg", "");
            Statics.field475 = class55.method407(var4);
            Statics.field2610 = Statics.field475.method4665();
            if ((client.field931 & 0x20000000) == 0) {
                Statics.field1458 = class287.method1534(arg1, "logo", "");
            } else {
                Statics.field1458 = class287.method1534(arg1, "logo_deadman_mode", "");
            }
            Statics.field1443 = class287.method1534(arg1, "titlebox", "");
            Statics.field1783 = class287.method1534(arg1, "titlebutton", "");
            Statics.field1471 = class287.method2800(arg1, "runes", "");
            Statics.field693 = class287.method2800(arg1, "title_mute", "");
            Statics.field29 = class287.method1534(arg1, "options_radio_buttons,0", "");
            Statics.field1238 = class287.method1534(arg1, "options_radio_buttons,2", "");
            Statics.field3684 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field3684[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field3684[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field3684[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field3684[var8 + 192] = 16777215;
            }
            Statics.field1784 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1784[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1784[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1784[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1784[var12 + 192] = 16777215;
            }
            Statics.field1425 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1425[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1425[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1425[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1425[var16 + 192] = 16777215;
            }
            Statics.field1559 = new int[256];
            Statics.field259 = new int[32768];
            Statics.field363 = new int[32768];
            Statics.method1403((class285) null);
            Statics.field345 = new int[32768];
            Statics.field328 = new int[32768];
            if (arg2) {
                field1444 = "";
                field1463 = "";
            }
            Statics.field2018 = 0;
            Statics.field3183 = "";
            field1465 = true;
            field1469 = false;
            if (Statics.field304.field1333) {
                class204.method1536(2);
            } else {
                class204.method25(2, Statics.field341, "scape main", "", 255, false);
            }
            class239.method1465(false);
            Statics.field335 = true;
            field1460 = (Statics.field2021 - 765) / 2;
            field1447 = field1460 + 202;
            Statics.field475.method4674(field1460, 0);
            Statics.field2610.method4674(field1460 + 382, 0);
            Statics.field1458.method4646(field1460 + 382 - Statics.field1458.field3772 / 2, 18);
        } else if (arg3 == 4) {
            field1457 = 4;
        }
    }

    @ObfuscatedName("ab.c(Lbf;I)V")
    public static void method445(class59 arg0) {
        if (field1469) {
            method1556(arg0);
            return;
        }
        if ((class60.field733 == 1 || !Statics.field3203 && class60.field733 == 4) && class60.field746 >= field1460 + 765 - 50 && class60.field751 >= 453) {
            Statics.field304.field1333 = !Statics.field304.field1333;
            class82.method943();
            if (Statics.field304.field1333) {
                class204.method2789();
            } else {
                class238 var1 = Statics.field341;
                int var2 = var1.method3785("scape main");
                int var3 = var1.method3786(var2, "");
                class204.method876(var1, var2, var3, 255, false);
            }
        }
        if (client.field936 == 5) {
            return;
        }
        field1453++;
        if (client.field936 != 10 && client.field936 != 11) {
            return;
        }
        if (client.field1078 == 0) {
            if (class60.field733 == 1 || !Statics.field3203 && class60.field733 == 4) {
                int var4 = field1460 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class60.field746 >= var4 && class60.field746 <= var4 + var6 && class60.field751 >= var5 && class60.field751 <= var5 + var7) {
                    method1552();
                    return;
                }
            }
            if (Statics.field504 != null) {
                method1552();
            }
        }
        int var8 = class60.field733;
        int var9 = class60.field746;
        int var10 = class60.field751;
        if (!Statics.field3203 && var8 == 4) {
            var8 = 1;
        }
        if (field1457 == 0) {
            boolean var11 = false;
            while (class51.method1416()) {
                if (Statics.field28 == 84) {
                    var11 = true;
                }
            }
            int var12 = field1447 + 180 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                label626: {
                    String var14 = client.method898("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var14));
                            break label626;
                        } catch (Exception var45) {
                        }
                    }
                    if (class57.field691.startsWith("win")) {
                        class57.method475(var14, 0, "openjs");
                    } else if (class57.field691.startsWith("mac")) {
                        class57.method475(var14, 1, "openjs");
                    } else {
                        class57.method475(var14, 2, "openjs");
                    }
                }
            }
            int var16 = field1447 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field931 & 0x2000000) != 0) {
                    field1461 = "";
                    field1459 = class226.field2957;
                    field1442 = class226.field2892;
                    field1468 = class226.field3079;
                    field1457 = 1;
                    field1466 = 0;
                } else if ((client.field931 & 0x4) != 0) {
                    if ((client.field931 & 0x400) == 0) {
                        field1459 = class226.field3063;
                        field1442 = class226.field2945;
                        field1468 = class226.field3070;
                    } else {
                        field1459 = class226.field3074;
                        field1442 = class226.field3007;
                        field1468 = class226.field3076;
                    }
                    field1461 = class226.field3067;
                    field1457 = 1;
                    field1466 = 0;
                } else if ((client.field931 & 0x400) == 0) {
                    field1459 = class226.field3064;
                    field1442 = class226.field2947;
                    field1468 = class226.field3066;
                    field1457 = 2;
                    field1466 = 0;
                } else {
                    field1459 = class226.field3071;
                    field1442 = class226.field2938;
                    field1468 = class226.field3073;
                    field1461 = class226.field3067;
                    field1457 = 1;
                    field1466 = 0;
                }
            }
        } else if (field1457 == 1) {
            while (class51.method1416()) {
                if (Statics.field28 == 84) {
                    field1459 = class226.field3064;
                    field1442 = class226.field2947;
                    field1468 = class226.field3066;
                    field1457 = 2;
                    field1466 = 0;
                } else if (Statics.field28 == 13) {
                    field1457 = 0;
                }
            }
            int var17 = field1447 + 180 - 80;
            short var18 = 321;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var18 - 20 && var10 <= var18 + 20) {
                field1459 = class226.field3064;
                field1442 = class226.field2947;
                field1468 = class226.field3066;
                field1457 = 2;
                field1466 = 0;
            }
            int var19 = field1447 + 180 + 80;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var18 - 20 && var10 <= var18 + 20) {
                field1457 = 0;
            }
        } else if (field1457 == 2) {
            short var20 = 231;
            int var46 = var20 + 30;
            if (var8 == 1 && var10 >= var46 - 15 && var10 < var46) {
                field1466 = 0;
            }
            var46 += 15;
            if (var8 == 1 && var10 >= var46 - 15 && var10 < var46) {
                field1466 = 1;
            }
            var46 += 15;
            short var21 = 361;
            if (var8 == 1 && var10 >= var21 - 15 && var10 < var21) {
                method456(class226.field3103, class226.field3104, class226.field3105);
                field1457 = 5;
                return;
            }
            int var22 = field1447 + 180 - 80;
            short var23 = 321;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var23 - 20 && var10 <= var23 + 20) {
                field1444 = field1444.trim();
                if (field1444.length() == 0) {
                    method456(class226.field2970, class226.field2971, class226.field2972);
                    return;
                }
                if (field1463.length() == 0) {
                    method456(class226.field2973, class226.field2974, class226.field3123);
                    return;
                }
                method456(class226.field3082, class226.field3083, class226.field3084);
                field1455 = Statics.field304.field1338.containsKey(class271.method5(field1444)) ? class150.field2218 : class150.field2214;
                client.method4071(20);
                return;
            }
            int var24 = field1447 + 180 + 80;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var23 - 20 && var10 <= var23 + 20) {
                field1457 = 0;
                field1444 = "";
                field1463 = "";
                Statics.field2018 = 0;
                Statics.field3183 = "";
                field1465 = true;
            }
            while (true) {
                while (class51.method1416()) {
                    boolean var25 = false;
                    for (int var26 = 0; var26 < field1467.length(); var26++) {
                        if (Statics.field643 == field1467.charAt(var26)) {
                            var25 = true;
                            break;
                        }
                    }
                    if (Statics.field28 == 13) {
                        field1457 = 0;
                        field1444 = "";
                        field1463 = "";
                        Statics.field2018 = 0;
                        Statics.field3183 = "";
                        field1465 = true;
                    } else if (field1466 == 0) {
                        if (Statics.field28 == 85 && field1444.length() > 0) {
                            field1444 = field1444.substring(0, field1444.length() - 1);
                        }
                        if (Statics.field28 == 84 || Statics.field28 == 80) {
                            field1466 = 1;
                        }
                        if (var25 && field1444.length() < 320) {
                            field1444 = field1444 + Statics.field643;
                        }
                    } else if (field1466 == 1) {
                        if (Statics.field28 == 85 && field1463.length() > 0) {
                            field1463 = field1463.substring(0, field1463.length() - 1);
                        }
                        if (Statics.field28 == 84 || Statics.field28 == 80) {
                            field1466 = 0;
                        }
                        if (Statics.field28 == 84) {
                            field1444 = field1444.trim();
                            if (field1444.length() == 0) {
                                method456(class226.field2970, class226.field2971, class226.field2972);
                                return;
                            }
                            if (field1463.length() == 0) {
                                method456(class226.field2973, class226.field2974, class226.field3123);
                                return;
                            }
                            method456(class226.field3082, class226.field3083, class226.field3084);
                            field1455 = Statics.field304.field1338.containsKey(class271.method5(field1444)) ? class150.field2218 : class150.field2214;
                            client.method4071(20);
                            return;
                        }
                        if (var25 && field1463.length() < 20) {
                            field1463 = field1463 + Statics.field643;
                        }
                    }
                }
                return;
            }
        } else if (field1457 == 3) {
            int var27 = field1447 + 180;
            short var28 = 276;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var28 - 20 && var10 <= var28 + 20) {
                field1459 = class226.field3064;
                field1442 = class226.field2947;
                field1468 = class226.field3066;
                field1457 = 2;
                field1466 = 0;
            }
            int var29 = field1447 + 180;
            short var30 = 326;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                method456(class226.field3103, class226.field3104, class226.field3105);
                field1457 = 5;
                return;
            }
        } else if (field1457 == 4) {
            int var31 = field1447 + 180 - 80;
            short var32 = 321;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                Statics.field3183.trim();
                if (Statics.field3183.length() != 6) {
                    method456(class226.field2889, class226.field2890, class226.field2891);
                    return;
                }
                Statics.field2018 = Integer.parseInt(Statics.field3183);
                Statics.field3183 = "";
                field1455 = field1465 ? class150.field2215 : class150.field2217;
                method456(class226.field3082, class226.field3083, class226.field3084);
                client.method4071(20);
                return;
            }
            if (var8 == 1 && var9 >= field1447 + 180 - 9 && var9 <= field1447 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field1465 = !field1465;
            }
            if (var8 == 1 && var9 >= field1447 + 180 - 34 && var9 <= field1447 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                label641: {
                    String var33 = client.method898("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var33));
                            break label641;
                        } catch (Exception var44) {
                        }
                    }
                    if (class57.field691.startsWith("win")) {
                        class57.method475(var33, 0, "openjs");
                    } else if (class57.field691.startsWith("mac")) {
                        class57.method475(var33, 1, "openjs");
                    } else {
                        class57.method475(var33, 2, "openjs");
                    }
                }
            }
            int var35 = field1447 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                field1457 = 0;
                field1444 = "";
                field1463 = "";
                Statics.field2018 = 0;
                Statics.field3183 = "";
            }
            while (class51.method1416()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field1462.length(); var37++) {
                    if (Statics.field643 == field1462.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field28 == 13) {
                    field1457 = 0;
                    field1444 = "";
                    field1463 = "";
                    Statics.field2018 = 0;
                    Statics.field3183 = "";
                } else {
                    if (Statics.field28 == 85 && Statics.field3183.length() > 0) {
                        Statics.field3183 = Statics.field3183.substring(0, Statics.field3183.length() - 1);
                    }
                    if (Statics.field28 == 84) {
                        Statics.field3183.trim();
                        if (Statics.field3183.length() != 6) {
                            method456(class226.field2889, class226.field2890, class226.field2891);
                            return;
                        }
                        Statics.field2018 = Integer.parseInt(Statics.field3183);
                        Statics.field3183 = "";
                        field1455 = field1465 ? class150.field2215 : class150.field2217;
                        method456(class226.field3082, class226.field3083, class226.field3084);
                        client.method4071(20);
                        return;
                    }
                    if (var36 && Statics.field3183.length() < 6) {
                        Statics.field3183 = Statics.field3183 + Statics.field643;
                    }
                }
            }
        } else if (field1457 == 5) {
            int var38 = field1447 + 180 - 80;
            short var39 = 321;
            if (var8 == 1 && var9 >= var38 - 75 && var9 <= var38 + 75 && var10 >= var39 - 20 && var10 <= var39 + 20) {
                method3760();
                return;
            }
            int var40 = field1447 + 180 + 80;
            if (var8 == 1 && var9 >= var40 - 75 && var9 <= var40 + 75 && var10 >= var39 - 20 && var10 <= var39 + 20) {
                field1459 = class226.field3064;
                field1442 = class226.field2947;
                field1468 = class226.field3066;
                field1457 = 2;
                field1466 = 0;
                field1463 = "";
            }
            while (class51.method1416()) {
                boolean var41 = false;
                for (int var42 = 0; var42 < field1467.length(); var42++) {
                    if (Statics.field643 == field1467.charAt(var42)) {
                        var41 = true;
                        break;
                    }
                }
                if (Statics.field28 == 13) {
                    field1459 = class226.field3064;
                    field1442 = class226.field2947;
                    field1468 = class226.field3066;
                    field1457 = 2;
                    field1466 = 0;
                    field1463 = "";
                } else {
                    if (Statics.field28 == 85 && field1444.length() > 0) {
                        field1444 = field1444.substring(0, field1444.length() - 1);
                    }
                    if (Statics.field28 == 84) {
                        method3760();
                        return;
                    }
                    if (var41 && field1444.length() < 320) {
                        field1444 = field1444 + Statics.field643;
                    }
                }
            }
        } else if (field1457 == 6) {
            while (true) {
                do {
                    if (!class51.method1416()) {
                        short var43 = 321;
                        if (var8 == 1 && var10 >= var43 - 20 && var10 <= var43 + 20) {
                            field1459 = class226.field3064;
                            field1442 = class226.field2947;
                            field1468 = class226.field3066;
                            field1457 = 2;
                            field1466 = 0;
                            field1463 = "";
                        }
                        return;
                    }
                } while (Statics.field28 != 84 && Statics.field28 != 13);
                field1459 = class226.field3064;
                field1442 = class226.field2947;
                field1468 = class226.field3066;
                field1457 = 2;
                field1466 = 0;
                field1463 = "";
            }
        }
    }

    @ObfuscatedName("hg.e(I)V")
    public static void method3760() {
        field1444 = field1444.trim();
        if (field1444.length() == 0) {
            method456(class226.field3103, class226.field3104, class226.field3105);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method898("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2415, var4.field2407, 1000 - var4.field2407);
                if (var5 == -1) {
                    var4.field2407 = 0;
                    long var8 = var4.method2876();
                    var6 = var8;
                    break;
                }
                var4.field2407 += var5;
                if (var4.field2407 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class88.method293(var6, field1444);
        }
        switch(var13) {
            case 2:
                method456(class226.field3106, class226.field3107, class226.field2862);
                field1457 = 6;
                break;
            case 3:
                method456(class226.field3109, class226.field3110, class226.field3111);
                break;
            case 4:
                method456(class226.field3061, class226.field3113, class226.field3114);
                break;
            case 5:
                method456(class226.field3115, class226.field3128, class226.field2966);
                break;
            case 6:
                method456(class226.field3118, class226.field2918, class226.field3120);
                break;
            case 7:
                method456(class226.field3121, class226.field3122, class226.field3131);
        }
    }

    @ObfuscatedName("cl.v(Lji;Lji;Lji;ZI)V")
    public static void method1567(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1460 = (Statics.field2021 - 765) / 2;
            field1447 = field1460 + 202;
        }
        if (field1469) {
            method530(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field475.method4674(field1460, 0);
            Statics.field2610.method4674(field1460 + 382, 0);
            Statics.field1458.method4646(field1460 + 382 - Statics.field1458.field3772 / 2, 18);
        }
        if (client.field936 == 0 || client.field936 == 5) {
            byte var4 = 20;
            arg0.method4382(class226.field2900, field1447 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class282.method4583(field1447 + 180 - 152, var5, 304, 34, 9179409);
            class282.method4583(field1447 + 180 - 151, var5 + 1, 302, 32, 0);
            class282.method4561(field1447 + 180 - 150, var5 + 2, field1449 * 3, 30, 9179409);
            class282.method4561(field1449 * 3 + (field1447 + 180 - 150), var5 + 2, 300 - field1449 * 3, 30, 0);
            arg0.method4382(field1456, field1447 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field936 == 20) {
            Statics.field1443.method4646(field1447 + 180 - Statics.field1443.field3772 / 2, 271 - Statics.field1443.field3774 / 2);
            short var6 = 211;
            arg0.method4382(field1459, field1447 + 180, var6, 16776960, 0);
            int var103 = var6 + 15;
            arg0.method4382(field1442, field1447 + 180, var103, 16776960, 0);
            int var104 = var103 + 15;
            arg0.method4382(field1468, field1447 + 180, var104, 16776960, 0);
            int var105 = var104 + 15;
            int var106 = var105 + 10;
            if (field1457 != 4) {
                arg0.method4383(class226.field3085, field1447 + 180 - 110, var106, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field1444; arg0.method4374(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4383(class265.method4415(var8), field1447 + 180 - 70, var106, 16777215, 0);
                var103 = var106 + 15;
                arg0.method4383(class226.field3086 + class271.method42(field1463), field1447 + 180 - 108, var103, 16777215, 0);
                var103 += 15;
            }
        }
        if (client.field936 == 10 || client.field936 == 11) {
            Statics.field1443.method4646(field1447, 171);
            if (field1457 == 0) {
                short var9 = 251;
                arg0.method4382(class226.field2986, field1447 + 180, var9, 16776960, 0);
                int var107 = var9 + 30;
                int var10 = field1447 + 180 - 80;
                short var11 = 291;
                Statics.field1783.method4646(var10 - 73, var11 - 20);
                arg0.method4390(class226.field3089, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1447 + 180 + 80;
                Statics.field1783.method4646(var12 - 73, var11 - 20);
                arg0.method4390(class226.field3090, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1457 == 1) {
                arg0.method4382(field1461, field1447 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method4382(field1459, field1447 + 180, var13, 16777215, 0);
                int var108 = var13 + 15;
                arg0.method4382(field1442, field1447 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method4382(field1468, field1447 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                int var14 = field1447 + 180 - 80;
                short var15 = 321;
                Statics.field1783.method4646(var14 - 73, var15 - 20);
                arg0.method4382(class226.field2859, var14, var15 + 5, 16777215, 0);
                int var16 = field1447 + 180 + 80;
                Statics.field1783.method4646(var16 - 73, var15 - 20);
                arg0.method4382(class226.field3092, var16, var15 + 5, 16777215, 0);
            } else if (field1457 == 2) {
                short var17 = 211;
                arg0.method4382(field1459, field1447 + 180, var17, 16776960, 0);
                int var111 = var17 + 15;
                arg0.method4382(field1442, field1447 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method4382(field1468, field1447 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 10;
                arg0.method4383(class226.field3085, field1447 + 180 - 110, var114, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field1444; arg0.method4374(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4383(class265.method4415(var19) + (field1466 == 0 & client.field938 % 40 < 20 ? class89.method303(16776960) + class89.field1411 : ""), field1447 + 180 - 70, var114, 16777215, 0);
                var111 = var114 + 15;
                arg0.method4383(class226.field3086 + class271.method42(field1463) + (field1466 == 1 & client.field938 % 40 < 20 ? class89.method303(16776960) + class89.field1411 : ""), field1447 + 180 - 108, var111, 16777215, 0);
                var111 += 15;
                int var20 = field1447 + 180 - 80;
                short var21 = 321;
                Statics.field1783.method4646(var20 - 73, var21 - 20);
                arg0.method4382(class226.field3091, var20, var21 + 5, 16777215, 0);
                int var22 = field1447 + 180 + 80;
                Statics.field1783.method4646(var22 - 73, var21 - 20);
                arg0.method4382(class226.field3092, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method4382(class226.field3023, field1447 + 180, var23, 16776960, 0);
            } else if (field1457 == 3) {
                short var24 = 201;
                arg0.method4382(class226.field3093, field1447 + 180, var24, 16776960, 0);
                int var115 = var24 + 20;
                arg1.method4382(class226.field3094, field1447 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg1.method4382(class226.field3095, field1447 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var25 = field1447 + 180;
                short var26 = 276;
                Statics.field1783.method4646(var25 - 73, var26 - 20);
                arg2.method4382(class226.field3096, var25, var26 + 5, 16777215, 0);
                int var27 = field1447 + 180;
                short var28 = 326;
                Statics.field1783.method4646(var27 - 73, var28 - 20);
                arg2.method4382(class226.field3028, var27, var28 + 5, 16777215, 0);
            } else if (field1457 == 4) {
                arg0.method4382(class226.field3080, field1447 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method4382(field1459, field1447 + 180, var29, 16777215, 0);
                int var118 = var29 + 15;
                arg0.method4382(field1442, field1447 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method4382(field1468, field1447 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method4383(class226.field3000 + class271.method42(Statics.field3183) + (client.field938 % 40 < 20 ? class89.method303(16776960) + class89.field1411 : ""), field1447 + 180 - 108, var120, 16777215, 0);
                int var121 = var120 - 8;
                arg0.method4383(class226.field2905, field1447 + 180 - 9, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg0.method4383(class226.field2878, field1447 + 180 - 9, var122, 16776960, 0);
                int var30 = field1447 + 180 - 9 + arg0.method4374(class226.field2878) + 15;
                int var31 = var122 - arg0.field3653;
                class285 var32;
                if (field1465) {
                    var32 = Statics.field1238;
                } else {
                    var32 = Statics.field29;
                }
                var32.method4646(var30, var31);
                var118 = var122 + 15;
                int var33 = field1447 + 180 - 80;
                short var34 = 321;
                Statics.field1783.method4646(var33 - 73, var34 - 20);
                arg0.method4382(class226.field2859, var33, var34 + 5, 16777215, 0);
                int var35 = field1447 + 180 + 80;
                Statics.field1783.method4646(var35 - 73, var34 - 20);
                arg0.method4382(class226.field3092, var35, var34 + 5, 16777215, 0);
                arg1.method4382(class226.field3078, field1447 + 180, var34 + 36, 255, 0);
            } else if (field1457 == 5) {
                arg0.method4382(class226.field2879, field1447 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method4382(field1459, field1447 + 180, var36, 16776960, 0);
                int var123 = var36 + 15;
                arg2.method4382(field1442, field1447 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg2.method4382(field1468, field1447 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var126 = var125 + 14;
                arg0.method4383(class226.field2988, field1447 + 180 - 145, var126, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field1444; arg0.method4374(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method4383(class265.method4415(var38) + (client.field938 % 40 < 20 ? class89.method303(16776960) + class89.field1411 : ""), field1447 + 180 - 34, var126, 16777215, 0);
                var123 = var126 + 15;
                int var39 = field1447 + 180 - 80;
                short var40 = 321;
                Statics.field1783.method4646(var39 - 73, var40 - 20);
                arg0.method4382(class226.field3101, var39, var40 + 5, 16777215, 0);
                int var41 = field1447 + 180 + 80;
                Statics.field1783.method4646(var41 - 73, var40 - 20);
                arg0.method4382(class226.field3102, var41, var40 + 5, 16777215, 0);
            } else if (field1457 == 6) {
                short var42 = 211;
                arg0.method4382(field1459, field1447 + 180, var42, 16776960, 0);
                int var127 = var42 + 15;
                arg0.method4382(field1442, field1447 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                arg0.method4382(field1468, field1447 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                int var43 = field1447 + 180;
                short var44 = 321;
                Statics.field1783.method4646(var43 - 73, var44 - 20);
                arg0.method4382(class226.field3102, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field1453 > 0) {
            int var45 = field1453;
            short var46 = 256;
            field1451 += var45 * 128;
            if (field1451 > Statics.field259.length) {
                field1451 -= Statics.field259.length;
                int var47 = (int) (Math.random() * 12.0D);
                Statics.method1403(Statics.field1471[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field345[var48 + var49] - Statics.field259[field1451 + var48 & Statics.field259.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field345[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field345[var54 + var55] = 255;
                    } else {
                        Statics.field345[var54 + var55] = 0;
                    }
                }
            }
            if (field1445 > 0) {
                field1445 -= var45 * 4;
            }
            if (field1450 > 0) {
                field1450 -= var45 * 4;
            }
            if (field1445 == 0 && field1450 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field1445 = 1024;
                }
                if (var57 == 1) {
                    field1450 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field1448[var58] = field1448[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field1448[var59] = (int) (Math.sin((double) field1454 / 14.0D) * 16.0D + Math.sin((double) field1454 / 15.0D) * 14.0D + Math.sin((double) field1454 / 16.0D) * 12.0D);
                field1454++;
            }
            field1452 += var45 * 16927293;
            int var60 = ((client.field938 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field1452 * 955735092; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field345[(var63 << 7) + var62] = 192;
                }
                field1452 = 0;
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
                                    var69 += Statics.field328[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field328[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field345[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field345[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field345[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field328[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field1453 = 0;
        }
        short var72 = 256;
        if (field1445 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field1445 > 768) {
                    Statics.field1559[var73] = method740(Statics.field3684[var73], Statics.field1784[var73], 1024 - field1445);
                } else if (field1445 > 256) {
                    Statics.field1559[var73] = Statics.field1784[var73];
                } else {
                    Statics.field1559[var73] = method740(Statics.field1784[var73], Statics.field3684[var73], 256 - field1445);
                }
            }
        } else if (field1450 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field1450 > 768) {
                    Statics.field1559[var74] = method740(Statics.field3684[var74], Statics.field1425[var74], 1024 - field1450);
                } else if (field1450 > 256) {
                    Statics.field1559[var74] = Statics.field1425[var74];
                } else {
                    Statics.field1559[var74] = method740(Statics.field1425[var74], Statics.field3684[var74], 256 - field1450);
                }
            }
        } else {
            for (int var75 = 0; var75 < 256; var75++) {
                Statics.field1559[var75] = Statics.field3684[var75];
            }
        }
        class282.method4578(field1460, 9, field1460 + 128, var72 + 7);
        Statics.field475.method4674(field1460, 0);
        class282.method4552();
        int var76 = 0;
        int var77 = field1460 + Statics.field2344.field3760 * 9;
        for (int var78 = 1; var78 < var72 - 1; var78++) {
            int var79 = (var72 - var78) * field1448[var78] / var72;
            int var80 = var79 + 22;
            if (var80 < 0) {
                var80 = 0;
            }
            var76 += var80;
            for (int var81 = var80; var81 < 128; var81++) {
                int var82 = Statics.field345[var76++];
                if (var82 == 0) {
                    var77++;
                } else {
                    int var84 = 256 - var82;
                    int var85 = Statics.field1559[var82];
                    int var86 = Statics.field2344.field3761[var77];
                    Statics.field2344.field3761[var77++] = ((var85 & 0xFF00) * var82 + (var86 & 0xFF00) * var84 & 0xFF0000) + ((var85 & 0xFF00FF) * var82 + (var86 & 0xFF00FF) * var84 & 0xFF00FF00) >> 8;
                }
            }
            var77 += Statics.field2344.field3760 + var80 - 128;
        }
        class282.method4578(field1460 + 765 - 128, 9, field1460 + 765, var72 + 7);
        Statics.field2610.method4674(field1460 + 382, 0);
        class282.method4552();
        int var87 = 0;
        int var88 = field1460 + Statics.field2344.field3760 * 9 + 24 + 637;
        for (int var89 = 1; var89 < var72 - 1; var89++) {
            int var90 = (var72 - var89) * field1448[var89] / var72;
            int var91 = 103 - var90;
            int var92 = var88 + var90;
            for (int var93 = 0; var93 < var91; var93++) {
                int var94 = Statics.field345[var87++];
                if (var94 == 0) {
                    var92++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field1559[var94];
                    int var98 = Statics.field2344.field3761[var92];
                    Statics.field2344.field3761[var92++] = ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) + ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) >> 8;
                }
            }
            var87 += 128 - var91;
            var88 = Statics.field2344.field3760 - var91 - var90 + var92;
        }
        Statics.field693[Statics.field304.field1333 ? 1 : 0].method4646(field1460 + 765 - 40, 463);
        if (client.field936 <= 5 || client.field1078 != 0) {
            return;
        }
        if (Statics.field1408 == null) {
            Statics.field1408 = class287.method1534(Statics.field3626, "sl_button", "");
            return;
        }
        int var99 = field1460 + 5;
        short var100 = 463;
        byte var101 = 100;
        byte var102 = 35;
        Statics.field1408.method4646(var99, var100);
        arg0.method4382(class226.field3018 + " " + client.field930, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
        if (Statics.field504 == null) {
            arg1.method4382(class226.field3134, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
        } else {
            arg1.method4382(class226.field3005, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ae.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method456(String arg0, String arg1, String arg2) {
        field1459 = arg0;
        field1442 = arg1;
        field1468 = arg2;
    }

    @ObfuscatedName("bf.h(IIII)I")
    public static final int method740(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("au.x(Lji;Lji;I)V")
    public static void method530(class264 arg0, class264 arg1) {
        if (Statics.field333 == null) {
            Statics.field333 = class287.method2788(Statics.field3626, "sl_back", "");
        }
        if (Statics.field888 == null) {
            Statics.field888 = class287.method2800(Statics.field3626, "sl_flags", "");
        }
        if (Statics.field250 == null) {
            Statics.field250 = class287.method2800(Statics.field3626, "sl_arrows", "");
        }
        if (Statics.field286 == null) {
            Statics.field286 = class287.method2800(Statics.field3626, "sl_stars", "");
        }
        class282.method4561(field1460, 23, 765, 480, 0);
        class282.method4625(field1460, 0, 125, 23, 12425273, 9135624);
        class282.method4625(field1460 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4382(class226.field2997, field1460 + 62, 15, 0, -1);
        if (Statics.field286 != null) {
            Statics.field286[1].method4646(field1460 + 140, 1);
            arg1.method4383(class226.field3125, field1460 + 152, 10, 16777215, -1);
            Statics.field286[0].method4646(field1460 + 140, 12);
            arg1.method4383(class226.field3098, field1460 + 152, 21, 16777215, -1);
        }
        if (Statics.field250 != null) {
            int var2 = field1460 + 280;
            if (class81.field1329[0] == 0 && class81.field1319[0] == 0) {
                Statics.field250[2].method4646(var2, 4);
            } else {
                Statics.field250[0].method4646(var2, 4);
            }
            if (class81.field1329[0] == 0 && class81.field1319[0] == 1) {
                Statics.field250[3].method4646(var2 + 15, 4);
            } else {
                Statics.field250[1].method4646(var2 + 15, 4);
            }
            arg0.method4383(class226.field3127, var2 + 32, 17, 16777215, -1);
            int var3 = field1460 + 390;
            if (class81.field1329[0] == 1 && class81.field1319[0] == 0) {
                Statics.field250[2].method4646(var3, 4);
            } else {
                Statics.field250[0].method4646(var3, 4);
            }
            if (class81.field1329[0] == 1 && class81.field1319[0] == 1) {
                Statics.field250[3].method4646(var3 + 15, 4);
            } else {
                Statics.field250[1].method4646(var3 + 15, 4);
            }
            arg0.method4383(class226.field3075, var3 + 32, 17, 16777215, -1);
            int var4 = field1460 + 500;
            if (class81.field1329[0] == 2 && class81.field1319[0] == 0) {
                Statics.field250[2].method4646(var4, 4);
            } else {
                Statics.field250[0].method4646(var4, 4);
            }
            if (class81.field1329[0] == 2 && class81.field1319[0] == 1) {
                Statics.field250[3].method4646(var4 + 15, 4);
            } else {
                Statics.field250[1].method4646(var4 + 15, 4);
            }
            arg0.method4383(class226.field3129, var4 + 32, 17, 16777215, -1);
            int var5 = field1460 + 610;
            if (class81.field1329[0] == 3 && class81.field1319[0] == 0) {
                Statics.field250[2].method4646(var5, 4);
            } else {
                Statics.field250[0].method4646(var5, 4);
            }
            if (class81.field1329[0] == 3 && class81.field1319[0] == 1) {
                Statics.field250[3].method4646(var5 + 15, 4);
            } else {
                Statics.field250[1].method4646(var5 + 15, 4);
            }
            arg0.method4383(class226.field3130, var5 + 32, 17, 16777215, -1);
        }
        class282.method4561(field1460 + 708, 4, 50, 16, 0);
        arg1.method4382(class226.field3092, field1460 + 708 + 25, 16, 16777215, -1);
        field1470 = -1;
        if (Statics.field333 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class81.field1327) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class81.field1327) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class81.field1327) {
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
            int var17 = field1460 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class81.field1327; var20++) {
                class81 var21 = Statics.field1316[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1320);
                if (var21.field1320 == -1) {
                    var23 = class226.field3077;
                    var22 = false;
                } else if (var21.field1320 > 1980) {
                    var23 = class226.field2864;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1421()) {
                    if (var21.method1437()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1420()) {
                    var24 = 16711680;
                    if (var21.method1437()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1418()) {
                    if (var21.method1437()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1437()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field738 >= var17 && class60.field739 >= var16 && class60.field738 < var6 + var17 && class60.field739 < var7 + var16 && var22) {
                    field1470 = var20;
                    Statics.field333[var25].method4679(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field333[var25].method4674(var17, var16);
                }
                if (Statics.field888 != null) {
                    Statics.field888[(var21.method1437() ? 8 : 0) + var21.field1326].method4646(var17 + 29, var16);
                }
                arg0.method4382(Integer.toString(var21.field1328), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4382(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4374(Statics.field1316[field1470].field1325) + 6;
                int var27 = arg1.field3653 + 8;
                class282.method4561(class60.field738 - var26 / 2, class60.field739 + 20 + 5, var26, var27, 16777120);
                class282.method4583(class60.field738 - var26 / 2, class60.field739 + 20 + 5, var26, var27, 0);
                arg1.method4382(Statics.field1316[field1470].field1325, class60.field738, class60.field739 + 20 + 5 + arg1.field3653 + 4, 0, -1);
            }
        }
        Statics.field2344.method703(0, 0);
    }

    @ObfuscatedName("co.f(Lbf;I)V")
    public static void method1556(class59 arg0) {
        if (class60.field733 != 1 && Statics.field3203 || class60.field733 != 4) {
            return;
        }
        int var1 = field1460 + 280;
        if (class60.field746 >= var1 && class60.field746 <= var1 + 14 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(0, 0);
            return;
        }
        if (class60.field746 >= var1 + 15 && class60.field746 <= var1 + 80 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(0, 1);
            return;
        }
        int var2 = field1460 + 390;
        if (class60.field746 >= var2 && class60.field746 <= var2 + 14 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(1, 0);
            return;
        }
        if (class60.field746 >= var2 + 15 && class60.field746 <= var2 + 80 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(1, 1);
            return;
        }
        int var3 = field1460 + 500;
        if (class60.field746 >= var3 && class60.field746 <= var3 + 14 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(2, 0);
            return;
        }
        if (class60.field746 >= var3 + 15 && class60.field746 <= var3 + 80 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(2, 1);
            return;
        }
        int var4 = field1460 + 610;
        if (class60.field746 >= var4 && class60.field746 <= var4 + 14 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(3, 0);
            return;
        }
        if (class60.field746 >= var4 + 15 && class60.field746 <= var4 + 80 && class60.field751 >= 4 && class60.field751 <= 18) {
            class81.method193(3, 1);
            return;
        }
        if (class60.field746 >= field1460 + 708 && class60.field751 >= 4 && class60.field746 <= field1460 + 708 + 50 && class60.field751 <= 20) {
            field1469 = false;
            Statics.field475.method4674(field1460, 0);
            Statics.field2610.method4674(field1460 + 382, 0);
            Statics.field1458.method4646(field1460 + 382 - Statics.field1458.field3772 / 2, 18);
            return;
        }
        if (field1470 == -1) {
            return;
        }
        class81 var5 = Statics.field1316[field1470];
        method146(var5);
        field1469 = false;
        Statics.field475.method4674(field1460, 0);
        Statics.field2610.method4674(field1460 + 382, 0);
        Statics.field1458.method4646(field1460 + 382 - Statics.field1458.field3772 / 2, 18);
        return;
    }

    @ObfuscatedName("p.n(Lck;B)V")
    public static void method146(class81 arg0) {
        if (arg0.method1437() != client.field1002) {
            client.field1002 = arg0.method1437();
            class257.method574(arg0.method1437());
        }
        Statics.field966 = arg0.field1324;
        client.field930 = arg0.field1328;
        client.field931 = arg0.field1322;
        Statics.field280 = client.field932 == 0 ? 43594 : arg0.field1328 + 40000;
        Statics.field791 = client.field932 == 0 ? 443 : arg0.field1328 + 50000;
        Statics.field2291 = Statics.field280;
    }

    @ObfuscatedName("co.a(I)V")
    public static void method1552() {
        if (class81.method180()) {
            field1469 = true;
        }
    }
}
