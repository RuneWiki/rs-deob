package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;

@ObfuscatedName("ci")
public class class91 {

    @ObfuscatedName("ci.q")
    public static int field1324 = 0;

    @ObfuscatedName("ci.z")
    public static int field1356 = field1324 + 202;

    @ObfuscatedName("ci.d")
    public static int[] field1331 = new int[256];

    @ObfuscatedName("ci.m")
    public static int field1333 = 0;

    @ObfuscatedName("ci.ay")
    public static int field1334 = 0;

    @ObfuscatedName("ci.am")
    public static int field1335 = 0;

    @ObfuscatedName("ci.az")
    public static int field1336 = 0;

    @ObfuscatedName("ci.ap")
    public static int field1337 = 0;

    @ObfuscatedName("ci.ah")
    public static int field1339 = 0;

    @ObfuscatedName("ci.au")
    public static int field1342 = 10;

    @ObfuscatedName("ci.ax")
    public static String field1340 = "";

    @ObfuscatedName("ci.ar")
    public static int field1330 = 0;

    @ObfuscatedName("ci.an")
    public static String field1353 = "";

    @ObfuscatedName("ci.ai")
    public static String field1343 = "";

    @ObfuscatedName("ci.al")
    public static String field1344 = "";

    @ObfuscatedName("ci.at")
    public static String field1345 = "";

    @ObfuscatedName("ci.ag")
    public static String field1346 = "";

    @ObfuscatedName("ci.as")
    public static String field1347 = "";

    @ObfuscatedName("ci.aw")
    public static boolean field1348 = false;

    @ObfuscatedName("ci.ad")
    public static boolean field1349 = false;

    @ObfuscatedName("ci.bg")
    public static boolean field1328 = false;

    @ObfuscatedName("ci.bk")
    public static boolean field1351 = true;

    @ObfuscatedName("ci.be")
    public static int field1352 = 0;

    @ObfuscatedName("ci.bc")
    public static String field1338 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.bm")
    public static String field1350 = "1234567890";

    @ObfuscatedName("ci.bs")
    public static boolean field1355 = false;

    @ObfuscatedName("ci.bq")
    public static int field1323 = -1;

    @ObfuscatedName("ci.bz")
    public static long field1357;

    @ObfuscatedName("ci.bx")
    public static long field1358;

    static {
        new DecimalFormat("##0.00");
        new class161();
        field1357 = -1L;
        field1358 = -1L;
    }

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.q(Ljc;Ljc;ZIB)V")
    public static void method68(class262 arg0, class262 arg1, boolean arg2, int arg3) {
        if (!Statics.field1341) {
            field1330 = arg3;
            class328.method5294();
            byte[] var4 = arg0.method4213("title.jpg", "");
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
            Statics.field1388 = var11;
            Statics.field2774 = Statics.field1388.method5387();
            if ((client.field851 & 0x20000000) == 0) {
                Statics.field3307 = class333.method2825(arg1, "logo", "");
            } else {
                Statics.field3307 = class333.method2825(arg1, "logo_deadman_mode", "");
            }
            Statics.field1325 = class333.method2825(arg1, "titlebox", "");
            Statics.field3015 = class333.method2825(arg1, "titlebutton", "");
            Statics.field2806 = class333.method291(arg1, "runes", "");
            Statics.field1326 = class333.method291(arg1, "title_mute", "");
            Statics.field2036 = class333.method2825(arg1, "options_radio_buttons,0", "");
            Statics.field2133 = class333.method2825(arg1, "options_radio_buttons,4", "");
            Statics.field1327 = class333.method2825(arg1, "options_radio_buttons,2", "");
            Statics.field1332 = class333.method2825(arg1, "options_radio_buttons,6", "");
            Statics.field222 = Statics.field2036.field3978;
            Statics.field3555 = Statics.field2036.field3977;
            Statics.field449 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field449[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field449[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field449[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field449[var17 + 192] = 16777215;
            }
            Statics.field2755 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field2755[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field2755[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field2755[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field2755[var21 + 192] = 16777215;
            }
            Statics.field2141 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field2141[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field2141[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field2141[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field2141[var25 + 192] = 16777215;
            }
            Statics.field751 = new int[256];
            Statics.field366 = new int[32768];
            Statics.field1944 = new int[32768];
            method4443((class331) null);
            Statics.field2671 = new int[32768];
            Statics.field627 = new int[32768];
            if (arg2) {
                field1346 = "";
                field1347 = "";
            }
            Statics.field1252 = 0;
            Statics.field2780 = "";
            field1351 = true;
            field1355 = false;
            if (Statics.field521.field1224) {
                class230.field2675 = 1;
                Statics.field2673 = null;
                Statics.field2200 = -1;
                Statics.field2677 = -1;
                Statics.field2678 = 0;
                Statics.field1295 = false;
                Statics.field14 = 2;
            } else {
                class230.method1022(2, Statics.field3547, "scape main", "", 255, false);
            }
            class265.method4183(false);
            Statics.field1341 = true;
            field1324 = (Statics.field2021 - 765) / 2;
            field1356 = field1324 + 202;
            Statics.field2779 = field1356 + 180;
            Statics.field1388.method5386(field1324, 0);
            Statics.field2774.method5386(field1324 + 382, 0);
            Statics.field3307.method5362(field1324 + 382 - Statics.field3307.field3978 / 2, 18);
        } else if (arg3 == 4) {
            field1330 = 4;
        }
    }

    @ObfuscatedName("eb.a(B)V")
    public static void method2462() {
        if (field1346 != null && field1346.length() > 0) {
            return;
        }
        if (Statics.field521.field1226 == null) {
            field1348 = false;
        } else {
            field1346 = Statics.field521.field1226;
            field1348 = true;
        }
    }

    @ObfuscatedName("gc.l(Lbh;B)V")
    public static void method3467(class60 arg0) {
        if (!field1355) {
            if ((class61.field679 == 1 || !Statics.field2112 && class61.field679 == 4) && class61.field692 >= field1324 + 765 - 50 && class61.field693 >= 453) {
                Statics.field521.field1224 = !Statics.field521.field1224;
                class79.method499();
                if (Statics.field521.field1224) {
                    class230.method1013();
                } else {
                    class230.method3133(Statics.field3547, "scape main", "", 255, false);
                }
            }
            if (client.field857 != 5) {
                if (field1357 == -1L) {
                    field1357 = Statics.method426() + 1000L;
                }
                long var6 = Statics.method426();
                boolean var9;
                if (client.field1024 == null || client.field1117 >= client.field1024.size()) {
                    var9 = true;
                } else {
                    while (true) {
                        if (client.field1117 >= client.field1024.size()) {
                            var9 = true;
                            break;
                        }
                        class65 var8 = (class65) client.field1024.get(client.field1117);
                        if (!var8.method1018()) {
                            var9 = false;
                            break;
                        }
                        client.field1117++;
                    }
                }
                if (var9 && field1358 == -1L) {
                    field1358 = var6;
                    if (field1358 > field1357) {
                        field1357 = field1358;
                    }
                }
                field1337++;
                if (client.field857 == 10 || client.field857 == 11) {
                    if (client.field856 == 0) {
                        if (class61.field679 == 1 || !Statics.field2112 && class61.field679 == 4) {
                            int var10 = field1324 + 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class61.field692 >= var10 && class61.field692 <= var10 + var12 && class61.field693 >= var11 && class61.field693 <= var11 + var13) {
                                if (class78.method2920()) {
                                    field1355 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1214 != null && class78.method2920()) {
                            field1355 = true;
                        }
                    }
                    int var14 = class61.field679;
                    int var15 = class61.field692;
                    int var16 = class61.field693;
                    if (var14 == 0) {
                        var15 = class61.field685;
                        var16 = class61.field686;
                    }
                    if (!Statics.field2112 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field1330 == 0) {
                        boolean var17 = false;
                        while (class52.method4806()) {
                            if (Statics.field1296 == 84) {
                                var17 = true;
                            }
                        }
                        int var18 = Statics.field2779 - 80;
                        short var19 = 291;
                        if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                            class58.method979(client.method4836("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var20 = Statics.field2779 + 80;
                        if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                            if ((client.field851 & 0x2000000) != 0) {
                                field1353 = "";
                                field1343 = class252.field3246;
                                field1344 = class252.field3061;
                                field1345 = class252.field3248;
                                field1330 = 1;
                                if (field1348 && field1346 != null && field1346.length() > 0) {
                                    field1352 = 1;
                                } else {
                                    field1352 = 0;
                                }
                            } else if ((client.field851 & 0x4) != 0) {
                                if ((client.field851 & 0x400) == 0) {
                                    field1343 = class252.field3142;
                                    field1344 = class252.field3139;
                                    field1345 = class252.field3239;
                                } else {
                                    field1343 = class252.field3243;
                                    field1344 = class252.field3073;
                                    field1345 = class252.field3237;
                                }
                                field1353 = class252.field3124;
                                field1330 = 1;
                                if (field1348 && field1346 != null && field1346.length() > 0) {
                                    field1352 = 1;
                                } else {
                                    field1352 = 0;
                                }
                            } else if ((client.field851 & 0x400) == 0) {
                                method665(false);
                            } else {
                                field1343 = class252.field3290;
                                field1344 = class252.field3241;
                                field1345 = class252.field3242;
                                field1353 = class252.field3124;
                                field1330 = 1;
                                if (field1348 && field1346 != null && field1346.length() > 0) {
                                    field1352 = 1;
                                } else {
                                    field1352 = 0;
                                }
                            }
                        }
                    } else if (field1330 == 1) {
                        while (class52.method4806()) {
                            if (Statics.field1296 == 84) {
                                method665(false);
                            } else if (Statics.field1296 == 13) {
                                field1330 = 0;
                            }
                        }
                        int var21 = Statics.field2779 - 80;
                        short var22 = 321;
                        if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            method665(false);
                        }
                        int var23 = Statics.field2779 + 80;
                        if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            field1330 = 0;
                        }
                    } else if (field1330 == 2) {
                        short var24 = 201;
                        int var50 = var24 + 52;
                        if (var14 == 1 && var16 >= var50 - 12 && var16 < var50 + 2) {
                            field1352 = 0;
                        }
                        var50 += 15;
                        if (var14 == 1 && var16 >= var50 - 12 && var16 < var50 + 2) {
                            field1352 = 1;
                        }
                        var50 += 15;
                        short var25 = 361;
                        if (var14 == 1 && var16 >= var25 - 15 && var16 < var25) {
                            method1819(class252.field3274, class252.field3247, class252.field3120);
                            field1330 = 5;
                            return;
                        }
                        int var26 = Statics.field2779 - 80;
                        short var27 = 321;
                        if (var14 == 1 && var15 >= var26 - 75 && var15 <= var26 + 75 && var16 >= var27 - 20 && var16 <= var27 + 20) {
                            field1346 = field1346.trim();
                            if (field1346.length() == 0) {
                                method1819(class252.field3296, class252.field3140, class252.field3141);
                                return;
                            }
                            if (field1347.length() == 0) {
                                method1819(class252.field3060, class252.field3143, class252.field3182);
                                return;
                            }
                            method1819(class252.field3302, class252.field3252, class252.field3176);
                            client.method1107(false);
                            client.method153(20);
                            return;
                        }
                        int var28 = field1356 + 180 + 80;
                        if (var14 == 1 && var15 >= var28 - 75 && var15 <= var28 + 75 && var16 >= var27 - 20 && var16 <= var27 + 20) {
                            field1330 = 0;
                            field1346 = "";
                            field1347 = "";
                            Statics.field1252 = 0;
                            Statics.field2780 = "";
                            field1351 = true;
                        }
                        int var29 = Statics.field2779 + -117;
                        short var30 = 277;
                        field1349 = var15 >= var29 && var15 < Statics.field222 + var29 && var16 >= var30 && var16 < Statics.field3555 + var30;
                        if (var14 == 1 && field1349) {
                            field1348 = !field1348;
                            if (!field1348 && Statics.field521.field1226 != null) {
                                Statics.field521.field1226 = null;
                                class79.method499();
                            }
                        }
                        int var31 = Statics.field2779 + 24;
                        short var32 = 277;
                        field1328 = var15 >= var31 && var15 < Statics.field222 + var31 && var16 >= var32 && var16 < Statics.field3555 + var32;
                        if (var14 == 1 && field1328) {
                            Statics.field521.field1225 = !Statics.field521.field1225;
                            if (!Statics.field521.field1225) {
                                field1346 = "";
                                Statics.field521.field1226 = null;
                                if (field1348 && field1346 != null && field1346.length() > 0) {
                                    field1352 = 1;
                                } else {
                                    field1352 = 0;
                                }
                            }
                            class79.method499();
                        }
                        while (true) {
                            while (class52.method4806()) {
                                boolean var33 = false;
                                for (int var34 = 0; var34 < field1338.length(); var34++) {
                                    if (Statics.field342 == field1338.charAt(var34)) {
                                        var33 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1296 == 13) {
                                    field1330 = 0;
                                    field1346 = "";
                                    field1347 = "";
                                    Statics.field1252 = 0;
                                    Statics.field2780 = "";
                                    field1351 = true;
                                } else if (field1352 == 0) {
                                    if (Statics.field1296 == 85 && field1346.length() > 0) {
                                        field1346 = field1346.substring(0, field1346.length() - 1);
                                    }
                                    if (Statics.field1296 == 84 || Statics.field1296 == 80) {
                                        field1352 = 1;
                                    }
                                    if (var33 && field1346.length() < 320) {
                                        field1346 = field1346 + Statics.field342;
                                    }
                                } else if (field1352 == 1) {
                                    if (Statics.field1296 == 85 && field1347.length() > 0) {
                                        field1347 = field1347.substring(0, field1347.length() - 1);
                                    }
                                    if (Statics.field1296 == 84 || Statics.field1296 == 80) {
                                        field1352 = 0;
                                    }
                                    if (Statics.field1296 == 84) {
                                        field1346 = field1346.trim();
                                        if (field1346.length() == 0) {
                                            method1819(class252.field3296, class252.field3140, class252.field3141);
                                            return;
                                        }
                                        if (field1347.length() == 0) {
                                            method1819(class252.field3060, class252.field3143, class252.field3182);
                                            return;
                                        }
                                        method1819(class252.field3302, class252.field3252, class252.field3176);
                                        client.method1107(false);
                                        client.method153(20);
                                        return;
                                    }
                                    if (var33 && field1347.length() < 20) {
                                        field1347 = field1347 + Statics.field342;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1330 == 3) {
                        int var35 = field1356 + 180;
                        short var36 = 276;
                        if (var14 == 1 && var15 >= var35 - 75 && var15 <= var35 + 75 && var16 >= var36 - 20 && var16 <= var36 + 20) {
                            method665(false);
                        }
                        int var37 = field1356 + 180;
                        short var38 = 326;
                        if (var14 == 1 && var15 >= var37 - 75 && var15 <= var37 + 75 && var16 >= var38 - 20 && var16 <= var38 + 20) {
                            method1819(class252.field3274, class252.field3247, class252.field3120);
                            field1330 = 5;
                            return;
                        }
                    } else if (field1330 == 4) {
                        int var39 = field1356 + 180 - 80;
                        short var40 = 321;
                        if (var14 == 1 && var15 >= var39 - 75 && var15 <= var39 + 75 && var16 >= var40 - 20 && var16 <= var40 + 20) {
                            Statics.field2780.trim();
                            if (Statics.field2780.length() != 6) {
                                method1819(class252.field3058, class252.field3046, class252.field3041);
                                return;
                            }
                            Statics.field1252 = Integer.parseInt(Statics.field2780);
                            Statics.field2780 = "";
                            client.method1107(true);
                            method1819(class252.field3302, class252.field3252, class252.field3176);
                            client.method153(20);
                            return;
                        }
                        if (var14 == 1 && var15 >= field1356 + 180 - 9 && var15 <= field1356 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                            field1351 = !field1351;
                        }
                        if (var14 == 1 && var15 >= field1356 + 180 - 34 && var15 <= field1356 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                            class58.method979(client.method4836("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var41 = field1356 + 180 + 80;
                        if (var14 == 1 && var15 >= var41 - 75 && var15 <= var41 + 75 && var16 >= var40 - 20 && var16 <= var40 + 20) {
                            field1330 = 0;
                            field1346 = "";
                            field1347 = "";
                            Statics.field1252 = 0;
                            Statics.field2780 = "";
                        }
                        while (class52.method4806()) {
                            boolean var42 = false;
                            for (int var43 = 0; var43 < field1350.length(); var43++) {
                                if (Statics.field342 == field1350.charAt(var43)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (Statics.field1296 == 13) {
                                field1330 = 0;
                                field1346 = "";
                                field1347 = "";
                                Statics.field1252 = 0;
                                Statics.field2780 = "";
                            } else {
                                if (Statics.field1296 == 85 && Statics.field2780.length() > 0) {
                                    Statics.field2780 = Statics.field2780.substring(0, Statics.field2780.length() - 1);
                                }
                                if (Statics.field1296 == 84) {
                                    Statics.field2780.trim();
                                    if (Statics.field2780.length() != 6) {
                                        method1819(class252.field3058, class252.field3046, class252.field3041);
                                        return;
                                    }
                                    Statics.field1252 = Integer.parseInt(Statics.field2780);
                                    Statics.field2780 = "";
                                    client.method1107(true);
                                    method1819(class252.field3302, class252.field3252, class252.field3176);
                                    client.method153(20);
                                    return;
                                }
                                if (var42 && Statics.field2780.length() < 6) {
                                    Statics.field2780 = Statics.field2780 + Statics.field342;
                                }
                            }
                        }
                    } else if (field1330 == 5) {
                        int var44 = field1356 + 180 - 80;
                        short var45 = 321;
                        if (var14 == 1 && var15 >= var44 - 75 && var15 <= var44 + 75 && var16 >= var45 - 20 && var16 <= var45 + 20) {
                            method2452();
                            return;
                        }
                        int var46 = field1356 + 180 + 80;
                        if (var14 == 1 && var15 >= var46 - 75 && var15 <= var46 + 75 && var16 >= var45 - 20 && var16 <= var45 + 20) {
                            method665(true);
                        }
                        while (class52.method4806()) {
                            boolean var47 = false;
                            for (int var48 = 0; var48 < field1338.length(); var48++) {
                                if (Statics.field342 == field1338.charAt(var48)) {
                                    var47 = true;
                                    break;
                                }
                            }
                            if (Statics.field1296 == 13) {
                                method665(true);
                            } else {
                                if (Statics.field1296 == 85 && field1346.length() > 0) {
                                    field1346 = field1346.substring(0, field1346.length() - 1);
                                }
                                if (Statics.field1296 == 84) {
                                    method2452();
                                    return;
                                }
                                if (var47 && field1346.length() < 320) {
                                    field1346 = field1346 + Statics.field342;
                                }
                            }
                        }
                    } else if (field1330 == 6) {
                        while (true) {
                            do {
                                if (!class52.method4806()) {
                                    short var49 = 321;
                                    if (var14 == 1 && var16 >= var49 - 20 && var16 <= var49 + 20) {
                                        method665(true);
                                    }
                                    return;
                                }
                            } while (Statics.field1296 != 84 && Statics.field1296 != 13);
                            method665(true);
                        }
                    }
                }
            }
        } else if (class61.field679 == 1 || !Statics.field2112 && class61.field679 == 4) {
            int var1 = field1324 + 280;
            if (class61.field692 >= var1 && class61.field692 <= var1 + 14 && class61.field693 >= 4 && class61.field693 <= 18) {
                class78.method1510(0, 0);
            } else if (class61.field692 >= var1 + 15 && class61.field692 <= var1 + 80 && class61.field693 >= 4 && class61.field693 <= 18) {
                class78.method1510(0, 1);
            } else {
                int var2 = field1324 + 390;
                if (class61.field692 >= var2 && class61.field692 <= var2 + 14 && class61.field693 >= 4 && class61.field693 <= 18) {
                    class78.method1510(1, 0);
                } else if (class61.field692 >= var2 + 15 && class61.field692 <= var2 + 80 && class61.field693 >= 4 && class61.field693 <= 18) {
                    class78.method1510(1, 1);
                } else {
                    int var3 = field1324 + 500;
                    if (class61.field692 >= var3 && class61.field692 <= var3 + 14 && class61.field693 >= 4 && class61.field693 <= 18) {
                        class78.method1510(2, 0);
                    } else if (class61.field692 >= var3 + 15 && class61.field692 <= var3 + 80 && class61.field693 >= 4 && class61.field693 <= 18) {
                        class78.method1510(2, 1);
                    } else {
                        int var4 = field1324 + 610;
                        if (class61.field692 >= var4 && class61.field692 <= var4 + 14 && class61.field693 >= 4 && class61.field693 <= 18) {
                            class78.method1510(3, 0);
                        } else if (class61.field692 >= var4 + 15 && class61.field692 <= var4 + 80 && class61.field693 >= 4 && class61.field693 <= 18) {
                            class78.method1510(3, 1);
                        } else if (class61.field692 >= field1324 + 708 && class61.field693 >= 4 && class61.field692 <= field1324 + 708 + 50 && class61.field693 <= 20) {
                            field1355 = false;
                            Statics.field1388.method5386(field1324, 0);
                            Statics.field2774.method5386(field1324 + 382, 0);
                            Statics.field3307.method5362(field1324 + 382 - Statics.field3307.field3978 / 2, 18);
                        } else if (field1323 != -1) {
                            class78 var5 = Statics.field1207[field1323];
                            method603(var5);
                            field1355 = false;
                            Statics.field1388.method5386(field1324, 0);
                            Statics.field2774.method5386(field1324 + 382, 0);
                            Statics.field3307.method5362(field1324 + 382 - Statics.field3307.field3978 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.b(ZS)V")
    public static void method665(boolean arg0) {
        field1343 = class252.field3233;
        field1344 = class252.field3287;
        field1345 = class252.field3235;
        field1330 = 2;
        if (arg0) {
            field1347 = "";
        }
        method2462();
        if (field1348 && field1346 != null && field1346.length() > 0) {
            field1352 = 1;
        } else {
            field1352 = 0;
        }
    }

    @ObfuscatedName("dz.e(I)V")
    public static void method2452() {
        field1346 = field1346.trim();
        if (field1346.length() == 0) {
            method1819(class252.field3274, class252.field3247, class252.field3120);
            return;
        }
        long var0 = class86.method46();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class86.method1512(var0, field1346);
        }
        switch(var2) {
            case 2:
                method1819(class252.field3277, class252.field3278, class252.field3279);
                field1330 = 6;
                break;
            case 3:
                method1819(class252.field3280, class252.field3281, class252.field3147);
                break;
            case 4:
                method1819(class252.field3283, class252.field3202, class252.field3285);
                break;
            case 5:
                method1819(class252.field3240, class252.field3051, class252.field3288);
                break;
            case 6:
                method1819(class252.field3289, class252.field3219, class252.field3108);
                break;
            case 7:
                method1819(class252.field3292, class252.field3293, class252.field3303);
        }
    }

    @ObfuscatedName("ab.x(Lkm;Lkm;Lkm;ZI)V")
    public static void method677(class312 arg0, class312 arg1, class312 arg2, boolean arg3) {
        if (arg3) {
            field1324 = (Statics.field2021 - 765) / 2;
            field1356 = field1324 + 202;
            Statics.field2779 = field1356 + 180;
        }
        if (field1355) {
            if (Statics.field3431 == null) {
                Statics.field3431 = class333.method4483(Statics.field452, "sl_back", "");
            }
            if (Statics.field2201 == null) {
                Statics.field2201 = class333.method291(Statics.field452, "sl_flags", "");
            }
            if (Statics.field381 == null) {
                Statics.field381 = class333.method291(Statics.field452, "sl_arrows", "");
            }
            if (Statics.field506 == null) {
                Statics.field506 = class333.method291(Statics.field452, "sl_stars", "");
            }
            class328.method5275(field1324, 23, 765, 480, 0);
            class328.method5293(field1324, 0, 125, 23, 12425273, 9135624);
            class328.method5293(field1324 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5076(class252.field3295, field1324 + 62, 15, 0, -1);
            if (Statics.field506 != null) {
                Statics.field506[1].method5362(field1324 + 140, 1);
                arg1.method5073(class252.field3198, field1324 + 152, 10, 16777215, -1);
                Statics.field506[0].method5362(field1324 + 140, 12);
                arg1.method5073(class252.field3172, field1324 + 152, 21, 16777215, -1);
            }
            if (Statics.field381 != null) {
                int var4 = field1324 + 280;
                if (class78.field1211[0] == 0 && class78.field1205[0] == 0) {
                    Statics.field381[2].method5362(var4, 4);
                } else {
                    Statics.field381[0].method5362(var4, 4);
                }
                if (class78.field1211[0] == 0 && class78.field1205[0] == 1) {
                    Statics.field381[3].method5362(var4 + 15, 4);
                } else {
                    Statics.field381[1].method5362(var4 + 15, 4);
                }
                arg0.method5073(class252.field3126, var4 + 32, 17, 16777215, -1);
                int var5 = field1324 + 390;
                if (class78.field1211[0] == 1 && class78.field1205[0] == 0) {
                    Statics.field381[2].method5362(var5, 4);
                } else {
                    Statics.field381[0].method5362(var5, 4);
                }
                if (class78.field1211[0] == 1 && class78.field1205[0] == 1) {
                    Statics.field381[3].method5362(var5 + 15, 4);
                } else {
                    Statics.field381[1].method5362(var5 + 15, 4);
                }
                arg0.method5073(class252.field3299, var5 + 32, 17, 16777215, -1);
                int var6 = field1324 + 500;
                if (class78.field1211[0] == 2 && class78.field1205[0] == 0) {
                    Statics.field381[2].method5362(var6, 4);
                } else {
                    Statics.field381[0].method5362(var6, 4);
                }
                if (class78.field1211[0] == 2 && class78.field1205[0] == 1) {
                    Statics.field381[3].method5362(var6 + 15, 4);
                } else {
                    Statics.field381[1].method5362(var6 + 15, 4);
                }
                arg0.method5073(class252.field3300, var6 + 32, 17, 16777215, -1);
                int var7 = field1324 + 610;
                if (class78.field1211[0] == 3 && class78.field1205[0] == 0) {
                    Statics.field381[2].method5362(var7, 4);
                } else {
                    Statics.field381[0].method5362(var7, 4);
                }
                if (class78.field1211[0] == 3 && class78.field1205[0] == 1) {
                    Statics.field381[3].method5362(var7 + 15, 4);
                } else {
                    Statics.field381[1].method5362(var7 + 15, 4);
                }
                arg0.method5073(class252.field3301, var7 + 32, 17, 16777215, -1);
            }
            class328.method5275(field1324 + 708, 4, 50, 16, 0);
            arg1.method5076(class252.field3261, field1324 + 708 + 25, 16, 16777215, -1);
            field1323 = -1;
            if (Statics.field3431 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class78.field1208) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class78.field1208) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class78.field1208) {
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
                int var19 = field1324 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class78.field1208; var22++) {
                    class78 var23 = Statics.field1207[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1215);
                    if (var23.field1215 == -1) {
                        var25 = class252.field3188;
                        var24 = false;
                    } else if (var23.field1215 > 1980) {
                        var25 = class252.field3081;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1535()) {
                        if (var23.method1549()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1531()) {
                        var26 = 16711680;
                        if (var23.method1549()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1532()) {
                        if (var23.method1549()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1549()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class61.field685 >= var19 && class61.field686 >= var18 && class61.field685 < var8 + var19 && class61.field686 < var9 + var18 && var24) {
                        field1323 = var22;
                        Statics.field3431[var27].method5405(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field3431[var27].method5386(var19, var18);
                    }
                    if (Statics.field2201 != null) {
                        Statics.field2201[(var23.method1549() ? 8 : 0) + var23.field1210].method5362(var19 + 29, var18);
                    }
                    arg0.method5076(Integer.toString(var23.field1213), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method5076(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method5068(Statics.field1207[field1323].field1218) + 6;
                    int var29 = arg1.field3893 + 8;
                    class328.method5275(class61.field685 - var28 / 2, class61.field686 + 20 + 5, var28, var29, 16777120);
                    class328.method5282(class61.field685 - var28 / 2, class61.field686 + 20 + 5, var28, var29, 0);
                    arg1.method5076(Statics.field1207[field1323].field1218, class61.field685, class61.field686 + 20 + 5 + arg1.field3893 + 4, 0, -1);
                }
            }
            Statics.field605.method780(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1388.method5386(field1324, 0);
            Statics.field2774.method5386(field1324 + 382, 0);
            Statics.field3307.method5362(field1324 + 382 - Statics.field3307.field3978 / 2, 18);
        }
        if (client.field857 == 0 || client.field857 == 5) {
            byte var30 = 20;
            arg0.method5076(class252.field3163, field1356 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class328.method5282(field1356 + 180 - 152, var31, 304, 34, 9179409);
            class328.method5282(field1356 + 180 - 151, var31 + 1, 302, 32, 0);
            class328.method5275(field1356 + 180 - 150, var31 + 2, field1342 * 3, 30, 9179409);
            class328.method5275(field1342 * 3 + (field1356 + 180 - 150), var31 + 2, 300 - field1342 * 3, 30, 0);
            arg0.method5076(field1340, field1356 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field857 == 20) {
            Statics.field1325.method5362(field1356 + 180 - Statics.field1325.field3978 / 2, 271 - Statics.field1325.field3977 / 2);
            short var32 = 201;
            arg0.method5076(field1343, field1356 + 180, var32, 16776960, 0);
            int var115 = var32 + 15;
            arg0.method5076(field1344, field1356 + 180, var115, 16776960, 0);
            int var116 = var115 + 15;
            arg0.method5076(field1345, field1356 + 180, var116, 16776960, 0);
            int var117 = var116 + 15;
            int var118 = var117 + 7;
            if (field1330 != 4) {
                arg0.method5073(class252.field3254, field1356 + 180 - 110, var118, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = Statics.method4187(); arg0.method5068(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method5073(class313.method5072(var34), field1356 + 180 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                arg0.method5073(class252.field3255 + Statics.method5056(field1347), field1356 + 180 - 108, var115, 16777215, 0);
                var115 += 15;
            }
        }
        if (client.field857 == 10 || client.field857 == 11) {
            Statics.field1325.method5362(field1356, 171);
            if (field1330 == 0) {
                short var35 = 251;
                arg0.method5076(class252.field3033, field1356 + 180, var35, 16776960, 0);
                int var119 = var35 + 30;
                int var36 = field1356 + 180 - 80;
                short var37 = 291;
                Statics.field3015.method5362(var36 - 73, var37 - 20);
                arg0.method5077(class252.field3258, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1356 + 180 + 80;
                Statics.field3015.method5362(var38 - 73, var37 - 20);
                arg0.method5077(class252.field3229, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1330 == 1) {
                arg0.method5076(field1353, field1356 + 180, 201, 16776960, 0);
                short var39 = 236;
                arg0.method5076(field1343, field1356 + 180, var39, 16777215, 0);
                int var120 = var39 + 15;
                arg0.method5076(field1344, field1356 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method5076(field1345, field1356 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                int var40 = field1356 + 180 - 80;
                short var41 = 321;
                Statics.field3015.method5362(var40 - 73, var41 - 20);
                arg0.method5076(class252.field3122, var40, var41 + 5, 16777215, 0);
                int var42 = field1356 + 180 + 80;
                Statics.field3015.method5362(var42 - 73, var41 - 20);
                arg0.method5076(class252.field3261, var42, var41 + 5, 16777215, 0);
            } else if (field1330 == 2) {
                short var43 = 201;
                arg0.method5076(field1343, Statics.field2779, var43, 16776960, 0);
                int var123 = var43 + 15;
                arg0.method5076(field1344, Statics.field2779, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg0.method5076(field1345, Statics.field2779, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var126 = var125 + 7;
                arg0.method5073(class252.field3254, Statics.field2779 - 110, var126, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = Statics.method4187(); arg0.method5068(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method5073(class313.method5072(var45) + (field1352 == 0 & client.field1108 % 40 < 20 ? class87.method501(16776960) + class87.field1299 : ""), Statics.field2779 - 70, var126, 16777215, 0);
                var123 = var126 + 15;
                arg0.method5073(class252.field3255 + Statics.method5056(field1347) + (field1352 == 1 & client.field1108 % 40 < 20 ? class87.method501(16776960) + class87.field1299 : ""), Statics.field2779 - 108, var123, 16777215, 0);
                var123 += 15;
                short var46 = 277;
                int var47 = Statics.field2779 + -117;
                boolean var48 = field1348;
                boolean var49 = field1349;
                class331 var50 = var48 ? (var49 ? Statics.field1332 : Statics.field1327) : (var49 ? Statics.field2133 : Statics.field2036);
                var50.method5362(var47, var46);
                int var52 = var50.field3978 + 5 + var47;
                arg1.method5073(class252.field3262, var52, var46 + 13, 16776960, 0);
                int var53 = Statics.field2779 + 24;
                boolean var54 = Statics.field521.field1225;
                boolean var55 = field1328;
                class331 var56 = var54 ? (var55 ? Statics.field1332 : Statics.field1327) : (var55 ? Statics.field2133 : Statics.field2036);
                var56.method5362(var53, var46);
                int var58 = var56.field3978 + 5 + var53;
                arg1.method5073(class252.field3263, var58, var46 + 13, 16776960, 0);
                int var127 = var46 + 15;
                int var59 = Statics.field2779 - 80;
                short var60 = 321;
                Statics.field3015.method5362(var59 - 73, var60 - 20);
                arg0.method5076(class252.field3260, var59, var60 + 5, 16777215, 0);
                int var61 = Statics.field2779 + 80;
                Statics.field3015.method5362(var61 - 73, var60 - 20);
                arg0.method5076(class252.field3261, var61, var60 + 5, 16777215, 0);
                short var62 = 357;
                arg1.method5076(class252.field3269, Statics.field2779, var62, 16776960, 0);
            } else if (field1330 == 3) {
                short var63 = 201;
                arg0.method5076(class252.field3264, field1356 + 180, var63, 16776960, 0);
                int var128 = var63 + 20;
                arg1.method5076(class252.field3265, field1356 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg1.method5076(class252.field3266, field1356 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var64 = field1356 + 180;
                short var65 = 276;
                Statics.field3015.method5362(var64 - 73, var65 - 20);
                arg2.method5076(class252.field3029, var64, var65 + 5, 16777215, 0);
                int var66 = field1356 + 180;
                short var67 = 326;
                Statics.field3015.method5362(var66 - 73, var67 - 20);
                arg2.method5076(class252.field3268, var66, var67 + 5, 16777215, 0);
            } else if (field1330 == 4) {
                arg0.method5076(class252.field3257, field1356 + 180, 201, 16776960, 0);
                short var68 = 236;
                arg0.method5076(field1343, field1356 + 180, var68, 16777215, 0);
                int var131 = var68 + 15;
                arg0.method5076(field1344, field1356 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method5076(field1345, field1356 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method5073(class252.field3256 + Statics.method5056(Statics.field2780) + (client.field1108 % 40 < 20 ? class87.method501(16776960) + class87.field1299 : ""), field1356 + 180 - 108, var133, 16777215, 0);
                int var134 = var133 - 8;
                arg0.method5073(class252.field3030, field1356 + 180 - 9, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method5073(class252.field3031, field1356 + 180 - 9, var135, 16776960, 0);
                int var69 = field1356 + 180 - 9 + arg0.method5068(class252.field3031) + 15;
                int var70 = var135 - arg0.field3893;
                class331 var71;
                if (field1351) {
                    var71 = Statics.field1327;
                } else {
                    var71 = Statics.field2036;
                }
                var71.method5362(var69, var70);
                var131 = var135 + 15;
                int var72 = field1356 + 180 - 80;
                short var73 = 321;
                Statics.field3015.method5362(var72 - 73, var73 - 20);
                arg0.method5076(class252.field3122, var72, var73 + 5, 16777215, 0);
                int var74 = field1356 + 180 + 80;
                Statics.field3015.method5362(var74 - 73, var73 - 20);
                arg0.method5076(class252.field3261, var74, var73 + 5, 16777215, 0);
                arg1.method5076(class252.field3230, field1356 + 180, var73 + 36, 255, 0);
            } else if (field1330 == 5) {
                arg0.method5076(class252.field3049, field1356 + 180, 201, 16776960, 0);
                short var75 = 221;
                arg2.method5076(field1343, field1356 + 180, var75, 16776960, 0);
                int var136 = var75 + 15;
                arg2.method5076(field1344, field1356 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg2.method5076(field1345, field1356 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var139 = var138 + 14;
                arg0.method5073(class252.field3271, field1356 + 180 - 145, var139, 16777215, 0);
                short var76 = 174;
                String var77;
                for (var77 = Statics.method4187(); arg0.method5068(var77) > var76; var77 = var77.substring(1)) {
                }
                arg0.method5073(class313.method5072(var77) + (client.field1108 % 40 < 20 ? class87.method501(16776960) + class87.field1299 : ""), field1356 + 180 - 34, var139, 16777215, 0);
                var136 = var139 + 15;
                int var78 = field1356 + 180 - 80;
                short var79 = 321;
                Statics.field3015.method5362(var78 - 73, var79 - 20);
                arg0.method5076(class252.field3272, var78, var79 + 5, 16777215, 0);
                int var80 = field1356 + 180 + 80;
                Statics.field3015.method5362(var80 - 73, var79 - 20);
                arg0.method5076(class252.field3273, var80, var79 + 5, 16777215, 0);
            } else if (field1330 == 6) {
                short var81 = 201;
                arg0.method5076(field1343, field1356 + 180, var81, 16776960, 0);
                int var140 = var81 + 15;
                arg0.method5076(field1344, field1356 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg0.method5076(field1345, field1356 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var82 = field1356 + 180;
                short var83 = 321;
                Statics.field3015.method5362(var82 - 73, var83 - 20);
                arg0.method5076(class252.field3273, var82, var83 + 5, 16777215, 0);
            }
        }
        if (field1337 > 0) {
            method980(field1337);
            field1337 = 0;
        }
        short var84 = 256;
        if (field1333 > 0) {
            for (int var85 = 0; var85 < 256; var85++) {
                if (field1333 > 768) {
                    Statics.field751[var85] = method939(Statics.field449[var85], Statics.field2755[var85], 1024 - field1333);
                } else if (field1333 > 256) {
                    Statics.field751[var85] = Statics.field2755[var85];
                } else {
                    Statics.field751[var85] = method939(Statics.field2755[var85], Statics.field449[var85], 256 - field1333);
                }
            }
        } else if (field1334 > 0) {
            for (int var86 = 0; var86 < 256; var86++) {
                if (field1334 > 768) {
                    Statics.field751[var86] = method939(Statics.field449[var86], Statics.field2141[var86], 1024 - field1334);
                } else if (field1334 > 256) {
                    Statics.field751[var86] = Statics.field2141[var86];
                } else {
                    Statics.field751[var86] = method939(Statics.field2141[var86], Statics.field449[var86], 256 - field1334);
                }
            }
        } else {
            for (int var87 = 0; var87 < 256; var87++) {
                Statics.field751[var87] = Statics.field449[var87];
            }
        }
        class328.method5320(field1324, 9, field1324 + 128, var84 + 7);
        Statics.field1388.method5386(field1324, 0);
        class328.method5303();
        int var88 = 0;
        int var89 = field1324 + Statics.field605.field3965 * 9;
        for (int var90 = 1; var90 < var84 - 1; var90++) {
            int var91 = (var84 - var90) * field1331[var90] / var84;
            int var92 = var91 + 22;
            if (var92 < 0) {
                var92 = 0;
            }
            var88 += var92;
            for (int var93 = var92; var93 < 128; var93++) {
                int var94 = Statics.field2671[var88++];
                if (var94 == 0) {
                    var89++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field751[var94];
                    int var98 = Statics.field605.field3967[var89];
                    Statics.field605.field3967[var89++] = ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) >> 8;
                }
            }
            var89 += Statics.field605.field3965 + var92 - 128;
        }
        class328.method5320(field1324 + 765 - 128, 9, field1324 + 765, var84 + 7);
        Statics.field2774.method5386(field1324 + 382, 0);
        class328.method5303();
        int var99 = 0;
        int var100 = field1324 + Statics.field605.field3965 * 9 + 24 + 637;
        for (int var101 = 1; var101 < var84 - 1; var101++) {
            int var102 = (var84 - var101) * field1331[var101] / var84;
            int var103 = 103 - var102;
            int var104 = var100 + var102;
            for (int var105 = 0; var105 < var103; var105++) {
                int var106 = Statics.field2671[var99++];
                if (var106 == 0) {
                    var104++;
                } else {
                    int var108 = 256 - var106;
                    int var109 = Statics.field751[var106];
                    int var110 = Statics.field605.field3967[var104];
                    Statics.field605.field3967[var104++] = ((var109 & 0xFF00FF) * var106 + (var110 & 0xFF00FF) * var108 & 0xFF00FF00) + ((var109 & 0xFF00) * var106 + (var110 & 0xFF00) * var108 & 0xFF0000) >> 8;
                }
            }
            var99 += 128 - var103;
            var100 = Statics.field605.field3965 - var103 - var102 + var104;
        }
        Statics.field1326[Statics.field521.field1224 ? 1 : 0].method5362(field1324 + 765 - 40, 463);
        if (client.field857 <= 5 || client.field856 != 0) {
            return;
        }
        if (Statics.field2118 == null) {
            Statics.field2118 = class333.method2825(Statics.field452, "sl_button", "");
            return;
        }
        int var111 = field1324 + 5;
        short var112 = 463;
        byte var113 = 100;
        byte var114 = 35;
        Statics.field2118.method5362(var111, var112);
        arg0.method5076(class252.field3187 + " " + client.field850, var113 / 2 + var111, var114 / 2 + var112 - 2, 16777215, 0);
        if (Statics.field1214 == null) {
            arg1.method5076(class252.field3305, var113 / 2 + var111, var114 / 2 + var112 + 12, 16777215, 0);
        } else {
            arg1.method5076(class252.field3304, var113 / 2 + var111, var114 / 2 + var112 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cx.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1819(String arg0, String arg1, String arg2) {
        field1343 = arg0;
        field1344 = arg1;
        field1345 = arg2;
    }

    @ObfuscatedName("js.o(Llk;I)V")
    public static final void method4443(class331 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field366.length; var2++) {
            Statics.field366[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field366[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1944[var8] = (Statics.field366[var8 - 1] + Statics.field366[var8 + 1] + Statics.field366[var8 - 128] + Statics.field366[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field366;
            Statics.field366 = Statics.field1944;
            Statics.field1944 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3977; var11++) {
            for (int var12 = 0; var12 < arg0.field3978; var12++) {
                if (arg0.field3975[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3979;
                    int var14 = var11 + 16 + arg0.field3980;
                    int var15 = (var14 << 7) + var13;
                    Statics.field366[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bs.c(IB)V")
    public static final void method980(int arg0) {
        short var1 = 256;
        field1335 += arg0 * 128;
        if (field1335 > Statics.field366.length) {
            field1335 -= Statics.field366.length;
            int var2 = (int) (Math.random() * 12.0D);
            method4443(Statics.field2806[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2671[var3 + var4] - Statics.field366[field1335 + var3 & Statics.field366.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2671[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2671[var9 + var10] = 255;
                } else {
                    Statics.field2671[var9 + var10] = 0;
                }
            }
        }
        if (field1333 > 0) {
            field1333 -= arg0 * 4;
        }
        if (field1334 > 0) {
            field1334 -= arg0 * 4;
        }
        if (field1333 == 0 && field1334 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1333 = 1024;
            }
            if (var12 == 1) {
                field1334 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1331[var13] = field1331[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1331[var14] = (int) (Math.sin((double) field1339 / 14.0D) * 16.0D + Math.sin((double) field1339 / 15.0D) * 14.0D + Math.sin((double) field1339 / 16.0D) * 12.0D);
            field1339++;
        }
        field1336 += arg0 * 509361351;
        int var15 = ((client.field1108 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1336 * 1390997628; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2671[(var18 << 7) + var17] = 192;
        }
        field1336 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2671[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2671[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field627[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field627[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field627[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2671[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bh.u(IIIB)I")
    public static final int method939(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("aq.k(Lbd;I)V")
    public static void method603(class78 arg0) {
        if (arg0.method1549() != client.field854) {
            client.field854 = arg0.method1549();
            class284.method4092(arg0.method1549());
        }
        Statics.field277 = arg0.field1209;
        client.field850 = arg0.field1213;
        client.field851 = arg0.field1217;
        Statics.field1575 = client.field907 == 0 ? 43594 : arg0.field1213 + 40000;
        Statics.field844 = client.field907 == 0 ? 443 : arg0.field1213 + 50000;
        Statics.field1289 = Statics.field1575;
    }
}
