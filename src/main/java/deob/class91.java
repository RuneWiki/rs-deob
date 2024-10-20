package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;

@ObfuscatedName("cx")
public class class91 {

    @ObfuscatedName("cx.z")
    public static int field1337 = 0;

    @ObfuscatedName("cx.f")
    public static int field1362 = field1337 + 202;

    @ObfuscatedName("cx.j")
    public static int[] field1345 = new int[256];

    @ObfuscatedName("cx.a")
    public static int field1346 = 0;

    @ObfuscatedName("cx.ak")
    public static int field1347 = 0;

    @ObfuscatedName("cx.au")
    public static int field1348 = 0;

    @ObfuscatedName("cx.al")
    public static int field1353 = 0;

    @ObfuscatedName("cx.af")
    public static int field1360 = 0;

    @ObfuscatedName("cx.ai")
    public static int field1351 = 0;

    @ObfuscatedName("cx.az")
    public static int field1352 = 10;

    @ObfuscatedName("cx.aq")
    public static String field1349 = "";

    @ObfuscatedName("cx.ae")
    public static int field1354 = 0;

    @ObfuscatedName("cx.ad")
    public static String field1355 = "";

    @ObfuscatedName("cx.ar")
    public static String field1356 = "";

    @ObfuscatedName("cx.ao")
    public static String field1350 = "";

    @ObfuscatedName("cx.at")
    public static String field1358 = "";

    @ObfuscatedName("cx.ag")
    public static String field1359 = "";

    @ObfuscatedName("cx.an")
    public static String field1366 = "";

    @ObfuscatedName("cx.ax")
    public static boolean field1338 = false;

    @ObfuscatedName("cx.av")
    public static boolean field1336 = false;

    @ObfuscatedName("cx.bc")
    public static boolean field1363 = false;

    @ObfuscatedName("cx.bl")
    public static boolean field1364 = true;

    @ObfuscatedName("cx.bs")
    public static int field1365 = 0;

    @ObfuscatedName("cx.bu")
    public static String field1361 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cx.bz")
    public static String field1367 = "1234567890";

    @ObfuscatedName("cx.bm")
    public static boolean field1368 = false;

    @ObfuscatedName("cx.bw")
    public static int field1369 = -1;

    @ObfuscatedName("cx.bg")
    public static long field1370;

    @ObfuscatedName("cx.bi")
    public static long field1371;

    static {
        new DecimalFormat("##0.00");
        new class161();
        field1370 = -1L;
        field1371 = -1L;
    }

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.d(Ljk;Ljk;I)I")
    public static int method1521(class262 arg0, class262 arg1) {
        int var2 = 0;
        if (arg0.method4335("title.jpg", "")) {
            var2++;
        }
        if (arg1.method4335("logo", "")) {
            var2++;
        }
        if (arg1.method4335("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method4335("titlebox", "")) {
            var2++;
        }
        if (arg1.method4335("titlebutton", "")) {
            var2++;
        }
        if (arg1.method4335("runes", "")) {
            var2++;
        }
        if (arg1.method4335("title_mute", "")) {
            var2++;
        }
        if (arg1.method4335("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method4335("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method4335("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method4335("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method4335("sl_back", "");
        arg1.method4335("sl_flags", "");
        arg1.method4335("sl_arrows", "");
        arg1.method4335("sl_stars", "");
        arg1.method4335("sl_button", "");
        return var2;
    }

    @ObfuscatedName("n.z(Ljk;Ljk;ZII)V")
    public static void method8(class262 arg0, class262 arg1, boolean arg2, int arg3) {
        if (!Statics.field1344) {
            field1354 = arg3;
            class328.method5383();
            byte[] var4 = arg0.method4294("title.jpg", "");
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
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class332(0, 0);
            }
            Statics.field1339 = var11;
            Statics.field1341 = Statics.field1339.method5445();
            if ((client.field858 & 0x20000000) == 0) {
                Statics.field1342 = class333.method1704(arg1, "logo", "");
            } else {
                Statics.field1342 = class333.method1704(arg1, "logo_deadman_mode", "");
            }
            Statics.field1357 = class333.method1704(arg1, "titlebox", "");
            Statics.field329 = class333.method1704(arg1, "titlebutton", "");
            Statics.field1340 = class333.method4253(arg1, "runes", "");
            Statics.field1467 = class333.method4253(arg1, "title_mute", "");
            Statics.field236 = class333.method1704(arg1, "options_radio_buttons,0", "");
            Statics.field1200 = class333.method1704(arg1, "options_radio_buttons,4", "");
            Statics.field1343 = class333.method1704(arg1, "options_radio_buttons,2", "");
            Statics.field3359 = class333.method1704(arg1, "options_radio_buttons,6", "");
            Statics.field2112 = Statics.field236.field3976;
            Statics.field513 = Statics.field236.field3974;
            Statics.field756 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field756[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field756[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field756[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field756[var17 + 192] = 16777215;
            }
            Statics.field3827 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field3827[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field3827[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field3827[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field3827[var21 + 192] = 16777215;
            }
            Statics.field272 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field272[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field272[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field272[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field272[var25 + 192] = 16777215;
            }
            Statics.field3776 = new int[256];
            Statics.field300 = new int[32768];
            Statics.field2278 = new int[32768];
            method2888((class331) null);
            Statics.field12 = new int[32768];
            Statics.field3867 = new int[32768];
            if (arg2) {
                field1359 = "";
                field1366 = "";
            }
            Statics.field15 = 0;
            Statics.field3753 = "";
            field1364 = true;
            field1368 = false;
            if (Statics.field663.field1223) {
                class230.field2695 = 1;
                Statics.field2688 = null;
                Statics.field2692 = -1;
                Statics.field1332 = -1;
                Statics.field2693 = 0;
                Statics.field507 = false;
                Statics.field3700 = 2;
            } else {
                class264 var26 = Statics.field2129;
                int var27 = var26.method4290("scape main");
                int var28 = var26.method4292(var27, "");
                class230.field2695 = 1;
                Statics.field2688 = var26;
                Statics.field2692 = var27;
                Statics.field1332 = var28;
                Statics.field2693 = 255;
                Statics.field507 = false;
                Statics.field3700 = 2;
            }
            class265.method467(false);
            Statics.field1344 = true;
            field1337 = (Statics.field695 - 765) / 2;
            field1362 = field1337 + 202;
            Statics.field1291 = field1362 + 180;
            Statics.field1339.method5538(field1337, 0);
            Statics.field1341.method5538(field1337 + 382, 0);
            Statics.field1342.method5434(field1337 + 382 - Statics.field1342.field3976 / 2, 18);
        } else if (arg3 == 4) {
            field1354 = 4;
        }
    }

    @ObfuscatedName("v.n(B)Ljava/lang/String;")
    public static String method110() {
        String var6;
        if (Statics.field663.field1228) {
            String var0 = field1359;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1359;
        }
        return var6;
    }

    @ObfuscatedName("bq.r(I)V")
    public static void method1527() {
        if (!Statics.field1344) {
            return;
        }
        Statics.field1357 = null;
        Statics.field329 = null;
        Statics.field1340 = null;
        Statics.field1339 = null;
        Statics.field1341 = null;
        Statics.field1342 = null;
        Statics.field1467 = null;
        Statics.field236 = null;
        Statics.field1343 = null;
        Statics.field1282 = null;
        Statics.field801 = null;
        Statics.field2216 = null;
        Statics.field2284 = null;
        Statics.field3391 = null;
        Statics.field756 = null;
        Statics.field3827 = null;
        Statics.field272 = null;
        Statics.field3776 = null;
        Statics.field300 = null;
        Statics.field2278 = null;
        Statics.field12 = null;
        Statics.field3867 = null;
        class230.field2695 = 1;
        Statics.field2688 = null;
        Statics.field2692 = -1;
        Statics.field1332 = -1;
        Statics.field2693 = 0;
        Statics.field507 = false;
        Statics.field3700 = 2;
        class265.method467(true);
        Statics.field1344 = false;
    }

    @ObfuscatedName("kr.e(I)V")
    public static void method5145() {
        if (field1338 && field1359 != null && field1359.length() > 0) {
            field1365 = 1;
        } else {
            field1365 = 0;
        }
    }

    @ObfuscatedName("ed.y(Lbt;I)V")
    public static void method2909(class60 arg0) {
        if (!field1368) {
            if ((class61.field729 == 1 || !Statics.field3560 && class61.field729 == 4) && class61.field722 >= field1337 + 765 - 50 && class61.field728 >= 453) {
                Statics.field663.field1223 = !Statics.field663.field1223;
                class79.method1027();
                if (Statics.field663.field1223) {
                    class230.method3514();
                } else {
                    class230.method3176(Statics.field2129, "scape main", "", 255, false);
                }
            }
            if (client.field986 != 5) {
                if (field1370 == -1L) {
                    field1370 = class197.method1501() + 1000L;
                }
                long var6 = class197.method1501();
                boolean var9;
                if (client.field1118 == null || client.field1119 >= client.field1118.size()) {
                    var9 = true;
                } else {
                    while (true) {
                        if (client.field1119 >= client.field1118.size()) {
                            var9 = true;
                            break;
                        }
                        class65 var8 = (class65) client.field1118.get(client.field1119);
                        if (!var8.method960()) {
                            var9 = false;
                            break;
                        }
                        client.field1119++;
                    }
                }
                if (var9 && field1371 == -1L) {
                    field1371 = var6;
                    if (field1371 > field1370) {
                        field1370 = field1371;
                    }
                }
                field1360++;
                if (client.field986 == 10 || client.field986 == 11) {
                    if (client.field863 == 0) {
                        if (class61.field729 == 1 || !Statics.field3560 && class61.field729 == 4) {
                            int var10 = field1337 + 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class61.field722 >= var10 && class61.field722 <= var10 + var12 && class61.field728 >= var11 && class61.field728 <= var11 + var13) {
                                method469();
                                return;
                            }
                        }
                        if (Statics.field1208 != null) {
                            method469();
                        }
                    }
                    int var14 = class61.field729;
                    int var15 = class61.field722;
                    int var16 = class61.field728;
                    if (var14 == 0) {
                        var15 = class61.field723;
                        var16 = class61.field715;
                    }
                    if (!Statics.field3560 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field1354 == 0) {
                        boolean var17 = false;
                        while (class52.method181()) {
                            if (Statics.field1570 == 84) {
                                var17 = true;
                            }
                        }
                        int var18 = Statics.field1291 - 80;
                        short var19 = 291;
                        if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                            class58.method89(client.method4701("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var20 = Statics.field1291 + 80;
                        if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                            if ((client.field858 & 0x2000000) != 0) {
                                field1355 = "";
                                field1356 = class252.field3269;
                                field1350 = class252.field3177;
                                field1358 = class252.field3246;
                                field1354 = 1;
                                method5145();
                            } else if ((client.field858 & 0x4) != 0) {
                                if ((client.field858 & 0x400) == 0) {
                                    field1356 = class252.field3089;
                                    field1350 = class252.field3236;
                                    field1358 = class252.field3237;
                                } else {
                                    field1356 = class252.field3241;
                                    field1350 = class252.field3242;
                                    field1358 = class252.field3243;
                                }
                                field1355 = class252.field3234;
                                field1354 = 1;
                                method5145();
                            } else if ((client.field858 & 0x400) == 0) {
                                method144(false);
                            } else {
                                field1356 = class252.field3182;
                                field1350 = class252.field3253;
                                field1358 = class252.field3071;
                                field1355 = class252.field3234;
                                field1354 = 1;
                                method5145();
                            }
                        }
                    } else if (field1354 == 1) {
                        while (class52.method181()) {
                            if (Statics.field1570 == 84) {
                                method144(false);
                            } else if (Statics.field1570 == 13) {
                                field1354 = 0;
                            }
                        }
                        int var21 = Statics.field1291 - 80;
                        short var22 = 321;
                        if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            method144(false);
                        }
                        int var23 = Statics.field1291 + 80;
                        if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            field1354 = 0;
                        }
                    } else if (field1354 == 2) {
                        short var24 = 201;
                        int var50 = var24 + 52;
                        if (var14 == 1 && var16 >= var50 - 12 && var16 < var50 + 2) {
                            field1365 = 0;
                        }
                        var50 += 15;
                        if (var14 == 1 && var16 >= var50 - 12 && var16 < var50 + 2) {
                            field1365 = 1;
                        }
                        var50 += 15;
                        short var25 = 361;
                        if (var14 == 1 && var16 >= var25 - 15 && var16 < var25) {
                            method667(class252.field3272, class252.field3024, class252.field3274);
                            field1354 = 5;
                            return;
                        }
                        int var26 = Statics.field1291 - 80;
                        short var27 = 321;
                        if (var14 == 1 && var15 >= var26 - 75 && var15 <= var26 + 75 && var16 >= var27 - 20 && var16 <= var27 + 20) {
                            field1359 = field1359.trim();
                            if (field1359.length() == 0) {
                                method667(class252.field3137, class252.field3138, class252.field3139);
                                return;
                            }
                            if (field1366.length() == 0) {
                                method667(class252.field3140, class252.field3141, class252.field3273);
                                return;
                            }
                            method667(class252.field3249, class252.field3250, class252.field3251);
                            client.method15(false);
                            client.method4667(20);
                            return;
                        }
                        int var28 = field1362 + 180 + 80;
                        if (var14 == 1 && var15 >= var28 - 75 && var15 <= var28 + 75 && var16 >= var27 - 20 && var16 <= var27 + 20) {
                            field1354 = 0;
                            field1359 = "";
                            field1366 = "";
                            Statics.field15 = 0;
                            Statics.field3753 = "";
                            field1364 = true;
                        }
                        int var29 = Statics.field1291 + -117;
                        short var30 = 277;
                        field1336 = var15 >= var29 && var15 < Statics.field2112 + var29 && var16 >= var30 && var16 < Statics.field513 + var30;
                        if (var14 == 1 && field1336) {
                            field1338 = !field1338;
                            if (!field1338 && Statics.field663.field1227 != null) {
                                Statics.field663.field1227 = null;
                                class79.method1027();
                            }
                        }
                        int var31 = Statics.field1291 + 24;
                        short var32 = 277;
                        field1363 = var15 >= var31 && var15 < Statics.field2112 + var31 && var16 >= var32 && var16 < Statics.field513 + var32;
                        if (var14 == 1 && field1363) {
                            Statics.field663.field1228 = !Statics.field663.field1228;
                            if (!Statics.field663.field1228) {
                                field1359 = "";
                                Statics.field663.field1227 = null;
                                method5145();
                            }
                            class79.method1027();
                        }
                        while (true) {
                            while (class52.method181()) {
                                boolean var33 = false;
                                for (int var34 = 0; var34 < field1361.length(); var34++) {
                                    if (Statics.field352 == field1361.charAt(var34)) {
                                        var33 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1570 == 13) {
                                    field1354 = 0;
                                    field1359 = "";
                                    field1366 = "";
                                    Statics.field15 = 0;
                                    Statics.field3753 = "";
                                    field1364 = true;
                                } else if (field1365 == 0) {
                                    if (Statics.field1570 == 85 && field1359.length() > 0) {
                                        field1359 = field1359.substring(0, field1359.length() - 1);
                                    }
                                    if (Statics.field1570 == 84 || Statics.field1570 == 80) {
                                        field1365 = 1;
                                    }
                                    if (var33 && field1359.length() < 320) {
                                        field1359 = field1359 + Statics.field352;
                                    }
                                } else if (field1365 == 1) {
                                    if (Statics.field1570 == 85 && field1366.length() > 0) {
                                        field1366 = field1366.substring(0, field1366.length() - 1);
                                    }
                                    if (Statics.field1570 == 84 || Statics.field1570 == 80) {
                                        field1365 = 0;
                                    }
                                    if (Statics.field1570 == 84) {
                                        field1359 = field1359.trim();
                                        if (field1359.length() == 0) {
                                            method667(class252.field3137, class252.field3138, class252.field3139);
                                            return;
                                        }
                                        if (field1366.length() == 0) {
                                            method667(class252.field3140, class252.field3141, class252.field3273);
                                            return;
                                        }
                                        method667(class252.field3249, class252.field3250, class252.field3251);
                                        client.method15(false);
                                        client.method4667(20);
                                        return;
                                    }
                                    if (var33 && field1366.length() < 20) {
                                        field1366 = field1366 + Statics.field352;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1354 == 3) {
                        int var35 = field1362 + 180;
                        short var36 = 276;
                        if (var14 == 1 && var15 >= var35 - 75 && var15 <= var35 + 75 && var16 >= var36 - 20 && var16 <= var36 + 20) {
                            method144(false);
                        }
                        int var37 = field1362 + 180;
                        short var38 = 326;
                        if (var14 == 1 && var15 >= var37 - 75 && var15 <= var37 + 75 && var16 >= var38 - 20 && var16 <= var38 + 20) {
                            method667(class252.field3272, class252.field3024, class252.field3274);
                            field1354 = 5;
                            return;
                        }
                    } else if (field1354 == 4) {
                        int var39 = field1362 + 180 - 80;
                        short var40 = 321;
                        if (var14 == 1 && var15 >= var39 - 75 && var15 <= var39 + 75 && var16 >= var40 - 20 && var16 <= var40 + 20) {
                            Statics.field3753.trim();
                            if (Statics.field3753.length() != 6) {
                                method667(class252.field3056, class252.field3057, class252.field3058);
                                return;
                            }
                            Statics.field15 = Integer.parseInt(Statics.field3753);
                            Statics.field3753 = "";
                            client.method15(true);
                            method667(class252.field3249, class252.field3250, class252.field3251);
                            client.method4667(20);
                            return;
                        }
                        if (var14 == 1 && var15 >= field1362 + 180 - 9 && var15 <= field1362 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                            field1364 = !field1364;
                        }
                        if (var14 == 1 && var15 >= field1362 + 180 - 34 && var15 <= field1362 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                            class58.method89(client.method4701("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var41 = field1362 + 180 + 80;
                        if (var14 == 1 && var15 >= var41 - 75 && var15 <= var41 + 75 && var16 >= var40 - 20 && var16 <= var40 + 20) {
                            field1354 = 0;
                            field1359 = "";
                            field1366 = "";
                            Statics.field15 = 0;
                            Statics.field3753 = "";
                        }
                        while (class52.method181()) {
                            boolean var42 = false;
                            for (int var43 = 0; var43 < field1367.length(); var43++) {
                                if (Statics.field352 == field1367.charAt(var43)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (Statics.field1570 == 13) {
                                field1354 = 0;
                                field1359 = "";
                                field1366 = "";
                                Statics.field15 = 0;
                                Statics.field3753 = "";
                            } else {
                                if (Statics.field1570 == 85 && Statics.field3753.length() > 0) {
                                    Statics.field3753 = Statics.field3753.substring(0, Statics.field3753.length() - 1);
                                }
                                if (Statics.field1570 == 84) {
                                    Statics.field3753.trim();
                                    if (Statics.field3753.length() != 6) {
                                        method667(class252.field3056, class252.field3057, class252.field3058);
                                        return;
                                    }
                                    Statics.field15 = Integer.parseInt(Statics.field3753);
                                    Statics.field3753 = "";
                                    client.method15(true);
                                    method667(class252.field3249, class252.field3250, class252.field3251);
                                    client.method4667(20);
                                    return;
                                }
                                if (var42 && Statics.field3753.length() < 6) {
                                    Statics.field3753 = Statics.field3753 + Statics.field352;
                                }
                            }
                        }
                    } else if (field1354 == 5) {
                        int var44 = field1362 + 180 - 80;
                        short var45 = 321;
                        if (var14 == 1 && var15 >= var44 - 75 && var15 <= var44 + 75 && var16 >= var45 - 20 && var16 <= var45 + 20) {
                            method4583();
                            return;
                        }
                        int var46 = field1362 + 180 + 80;
                        if (var14 == 1 && var15 >= var46 - 75 && var15 <= var46 + 75 && var16 >= var45 - 20 && var16 <= var45 + 20) {
                            method144(true);
                        }
                        while (class52.method181()) {
                            boolean var47 = false;
                            for (int var48 = 0; var48 < field1361.length(); var48++) {
                                if (Statics.field352 == field1361.charAt(var48)) {
                                    var47 = true;
                                    break;
                                }
                            }
                            if (Statics.field1570 == 13) {
                                method144(true);
                            } else {
                                if (Statics.field1570 == 85 && field1359.length() > 0) {
                                    field1359 = field1359.substring(0, field1359.length() - 1);
                                }
                                if (Statics.field1570 == 84) {
                                    method4583();
                                    return;
                                }
                                if (var47 && field1359.length() < 320) {
                                    field1359 = field1359 + Statics.field352;
                                }
                            }
                        }
                    } else if (field1354 == 6) {
                        while (true) {
                            do {
                                if (!class52.method181()) {
                                    short var49 = 321;
                                    if (var14 == 1 && var16 >= var49 - 20 && var16 <= var49 + 20) {
                                        method144(true);
                                    }
                                    return;
                                }
                            } while (Statics.field1570 != 84 && Statics.field1570 != 13);
                            method144(true);
                        }
                    }
                }
            }
        } else if (class61.field729 == 1 || !Statics.field3560 && class61.field729 == 4) {
            int var1 = field1337 + 280;
            if (class61.field722 >= var1 && class61.field722 <= var1 + 14 && class61.field728 >= 4 && class61.field728 <= 18) {
                class78.method2506(0, 0);
            } else if (class61.field722 >= var1 + 15 && class61.field722 <= var1 + 80 && class61.field728 >= 4 && class61.field728 <= 18) {
                class78.method2506(0, 1);
            } else {
                int var2 = field1337 + 390;
                if (class61.field722 >= var2 && class61.field722 <= var2 + 14 && class61.field728 >= 4 && class61.field728 <= 18) {
                    class78.method2506(1, 0);
                } else if (class61.field722 >= var2 + 15 && class61.field722 <= var2 + 80 && class61.field728 >= 4 && class61.field728 <= 18) {
                    class78.method2506(1, 1);
                } else {
                    int var3 = field1337 + 500;
                    if (class61.field722 >= var3 && class61.field722 <= var3 + 14 && class61.field728 >= 4 && class61.field728 <= 18) {
                        class78.method2506(2, 0);
                    } else if (class61.field722 >= var3 + 15 && class61.field722 <= var3 + 80 && class61.field728 >= 4 && class61.field728 <= 18) {
                        class78.method2506(2, 1);
                    } else {
                        int var4 = field1337 + 610;
                        if (class61.field722 >= var4 && class61.field722 <= var4 + 14 && class61.field728 >= 4 && class61.field728 <= 18) {
                            class78.method2506(3, 0);
                        } else if (class61.field722 >= var4 + 15 && class61.field722 <= var4 + 80 && class61.field728 >= 4 && class61.field728 <= 18) {
                            class78.method2506(3, 1);
                        } else if (class61.field722 >= field1337 + 708 && class61.field728 >= 4 && class61.field722 <= field1337 + 708 + 50 && class61.field728 <= 20) {
                            field1368 = false;
                            Statics.field1339.method5538(field1337, 0);
                            Statics.field1341.method5538(field1337 + 382, 0);
                            Statics.field1342.method5434(field1337 + 382 - Statics.field1342.field3976 / 2, 18);
                        } else if (field1369 != -1) {
                            class78 var5 = Statics.field1209[field1369];
                            method90(var5);
                            field1368 = false;
                            Statics.field1339.method5538(field1337, 0);
                            Statics.field1341.method5538(field1337 + 382, 0);
                            Statics.field1342.method5434(field1337 + 382 - Statics.field1342.field3976 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.k(ZI)V")
    public static void method144(boolean arg0) {
        field1356 = class252.field3231;
        field1350 = class252.field3232;
        field1358 = class252.field3233;
        field1354 = 2;
        if (arg0) {
            field1366 = "";
        }
        if (field1359 == null || field1359.length() <= 0) {
            if (Statics.field663.field1227 == null) {
                field1338 = false;
            } else {
                field1359 = Statics.field663.field1227;
                field1338 = true;
            }
        }
        method5145();
    }

    @ObfuscatedName("je.s(I)V")
    public static void method4583() {
        field1359 = field1359.trim();
        if (field1359.length() == 0) {
            method667(class252.field3272, class252.field3024, class252.field3274);
            return;
        }
        long var0 = class86.method226();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class86.method2425(var0, field1359);
        }
        switch(var2) {
            case 2:
                method667(class252.field3275, class252.field3276, class252.field3277);
                field1354 = 6;
                break;
            case 3:
                method667(class252.field3278, class252.field3279, class252.field3155);
                break;
            case 4:
                method667(class252.field3168, class252.field3282, class252.field3283);
                break;
            case 5:
                method667(class252.field3284, class252.field3285, class252.field3286);
                break;
            case 6:
                method667(class252.field3287, class252.field3288, class252.field3289);
                break;
            case 7:
                method667(class252.field3209, class252.field3205, class252.field3292);
        }
    }

    @ObfuscatedName("gb.x(Lkw;Lkw;Lkw;ZI)V")
    public static void method3574(class312 arg0, class312 arg1, class312 arg2, boolean arg3) {
        if (arg3) {
            field1337 = (Statics.field695 - 765) / 2;
            field1362 = field1337 + 202;
            Statics.field1291 = field1362 + 180;
        }
        if (field1368) {
            if (Statics.field1282 == null) {
                Statics.field1282 = class333.method250(Statics.field2028, "sl_back", "");
            }
            if (Statics.field801 == null) {
                Statics.field801 = class333.method4253(Statics.field2028, "sl_flags", "");
            }
            if (Statics.field2216 == null) {
                Statics.field2216 = class333.method4253(Statics.field2028, "sl_arrows", "");
            }
            if (Statics.field2284 == null) {
                Statics.field2284 = class333.method4253(Statics.field2028, "sl_stars", "");
            }
            class328.method5381(field1337, 23, 765, 480, 0);
            class328.method5353(field1337, 0, 125, 23, 12425273, 9135624);
            class328.method5353(field1337 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5222(class252.field3293, field1337 + 62, 15, 0, -1);
            if (Statics.field2284 != null) {
                Statics.field2284[1].method5434(field1337 + 140, 1);
                arg1.method5232(class252.field3294, field1337 + 152, 10, 16777215, -1);
                Statics.field2284[0].method5434(field1337 + 140, 12);
                arg1.method5232(class252.field3136, field1337 + 152, 21, 16777215, -1);
            }
            if (Statics.field2216 != null) {
                int var4 = field1337 + 280;
                if (class78.field1210[0] == 0 && class78.field1212[0] == 0) {
                    Statics.field2216[2].method5434(var4, 4);
                } else {
                    Statics.field2216[0].method5434(var4, 4);
                }
                if (class78.field1210[0] == 0 && class78.field1212[0] == 1) {
                    Statics.field2216[3].method5434(var4 + 15, 4);
                } else {
                    Statics.field2216[1].method5434(var4 + 15, 4);
                }
                arg0.method5232(class252.field3208, var4 + 32, 17, 16777215, -1);
                int var5 = field1337 + 390;
                if (class78.field1210[0] == 1 && class78.field1212[0] == 0) {
                    Statics.field2216[2].method5434(var5, 4);
                } else {
                    Statics.field2216[0].method5434(var5, 4);
                }
                if (class78.field1210[0] == 1 && class78.field1212[0] == 1) {
                    Statics.field2216[3].method5434(var5 + 15, 4);
                } else {
                    Statics.field2216[1].method5434(var5 + 15, 4);
                }
                arg0.method5232(class252.field3297, var5 + 32, 17, 16777215, -1);
                int var6 = field1337 + 500;
                if (class78.field1210[0] == 2 && class78.field1212[0] == 0) {
                    Statics.field2216[2].method5434(var6, 4);
                } else {
                    Statics.field2216[0].method5434(var6, 4);
                }
                if (class78.field1210[0] == 2 && class78.field1212[0] == 1) {
                    Statics.field2216[3].method5434(var6 + 15, 4);
                } else {
                    Statics.field2216[1].method5434(var6 + 15, 4);
                }
                arg0.method5232(class252.field3298, var6 + 32, 17, 16777215, -1);
                int var7 = field1337 + 610;
                if (class78.field1210[0] == 3 && class78.field1212[0] == 0) {
                    Statics.field2216[2].method5434(var7, 4);
                } else {
                    Statics.field2216[0].method5434(var7, 4);
                }
                if (class78.field1210[0] == 3 && class78.field1212[0] == 1) {
                    Statics.field2216[3].method5434(var7 + 15, 4);
                } else {
                    Statics.field2216[1].method5434(var7 + 15, 4);
                }
                arg0.method5232(class252.field3203, var7 + 32, 17, 16777215, -1);
            }
            class328.method5381(field1337 + 708, 4, 50, 16, 0);
            arg1.method5222(class252.field3045, field1337 + 708 + 25, 16, 16777215, -1);
            field1369 = -1;
            if (Statics.field1282 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class78.field1221) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class78.field1221) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class78.field1221) {
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
                int var19 = field1337 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class78.field1221; var22++) {
                    class78 var23 = Statics.field1209[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1217);
                    if (var23.field1217 == -1) {
                        var25 = class252.field3300;
                        var24 = false;
                    } else if (var23.field1217 > 1980) {
                        var25 = class252.field3301;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1553()) {
                        if (var23.method1524()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1528()) {
                        var26 = 16711680;
                        if (var23.method1524()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1526()) {
                        if (var23.method1524()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1524()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class61.field723 >= var19 && class61.field715 >= var18 && class61.field723 < var8 + var19 && class61.field715 < var9 + var18 && var24) {
                        field1369 = var22;
                        Statics.field1282[var27].method5460(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1282[var27].method5538(var19, var18);
                    }
                    if (Statics.field801 != null) {
                        Statics.field801[(var23.method1524() ? 8 : 0) + var23.field1220].method5434(var19 + 29, var18);
                    }
                    arg0.method5222(Integer.toString(var23.field1215), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method5222(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method5224(Statics.field1209[field1369].field1219) + 6;
                    int var29 = arg1.field3885 + 8;
                    class328.method5381(class61.field723 - var28 / 2, class61.field715 + 20 + 5, var28, var29, 16777120);
                    class328.method5394(class61.field723 - var28 / 2, class61.field715 + 20 + 5, var28, var29, 0);
                    arg1.method5222(Statics.field1209[field1369].field1219, class61.field723, class61.field715 + 20 + 5 + arg1.field3885 + 4, 0, -1);
                }
            }
            Statics.field340.method733(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1339.method5538(field1337, 0);
            Statics.field1341.method5538(field1337 + 382, 0);
            Statics.field1342.method5434(field1337 + 382 - Statics.field1342.field3976 / 2, 18);
        }
        if (client.field986 == 0 || client.field986 == 5) {
            byte var30 = 20;
            arg0.method5222(class252.field3230, field1362 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class328.method5394(field1362 + 180 - 152, var31, 304, 34, 9179409);
            class328.method5394(field1362 + 180 - 151, var31 + 1, 302, 32, 0);
            class328.method5381(field1362 + 180 - 150, var31 + 2, field1352 * 3, 30, 9179409);
            class328.method5381(field1352 * 3 + (field1362 + 180 - 150), var31 + 2, 300 - field1352 * 3, 30, 0);
            arg0.method5222(field1349, field1362 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field986 == 20) {
            Statics.field1357.method5434(field1362 + 180 - Statics.field1357.field3976 / 2, 271 - Statics.field1357.field3974 / 2);
            short var32 = 201;
            arg0.method5222(field1356, field1362 + 180, var32, 16776960, 0);
            int var112 = var32 + 15;
            arg0.method5222(field1350, field1362 + 180, var112, 16776960, 0);
            int var113 = var112 + 15;
            arg0.method5222(field1358, field1362 + 180, var113, 16776960, 0);
            int var114 = var113 + 15;
            int var115 = var114 + 7;
            if (field1354 != 4) {
                arg0.method5232(class252.field3252, field1362 + 180 - 110, var115, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = method110(); arg0.method5224(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method5232(class313.method5161(var34), field1362 + 180 - 70, var115, 16777215, 0);
                var112 = var115 + 15;
                String var36 = class252.field3204;
                String var37 = field1366;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                arg0.method5232(var36 + var41, field1362 + 180 - 108, var112, 16777215, 0);
                var112 += 15;
            }
        }
        if (client.field986 == 10 || client.field986 == 11) {
            Statics.field1357.method5434(field1362, 171);
            if (field1354 == 0) {
                short var43 = 251;
                arg0.method5222(class252.field3255, field1362 + 180, var43, 16776960, 0);
                int var116 = var43 + 30;
                int var44 = field1362 + 180 - 80;
                short var45 = 291;
                Statics.field329.method5434(var44 - 73, var45 - 20);
                arg0.method5174(class252.field3149, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field1362 + 180 + 80;
                Statics.field329.method5434(var46 - 73, var45 - 20);
                arg0.method5174(class252.field3132, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1354 == 1) {
                arg0.method5222(field1355, field1362 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method5222(field1356, field1362 + 180, var47, 16777215, 0);
                int var117 = var47 + 15;
                arg0.method5222(field1350, field1362 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method5222(field1358, field1362 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                int var48 = field1362 + 180 - 80;
                short var49 = 321;
                Statics.field329.method5434(var48 - 73, var49 - 20);
                arg0.method5222(class252.field3144, var48, var49 + 5, 16777215, 0);
                int var50 = field1362 + 180 + 80;
                Statics.field329.method5434(var50 - 73, var49 - 20);
                arg0.method5222(class252.field3045, var50, var49 + 5, 16777215, 0);
            } else if (field1354 == 2) {
                short var51 = 201;
                arg0.method5222(field1356, Statics.field1291, var51, 16776960, 0);
                int var120 = var51 + 15;
                arg0.method5222(field1350, Statics.field1291, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg0.method5222(field1358, Statics.field1291, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var123 = var122 + 7;
                arg0.method5232(class252.field3252, Statics.field1291 - 110, var123, 16777215, 0);
                short var52 = 200;
                String var53;
                for (var53 = method110(); arg0.method5224(var53) > var52; var53 = var53.substring(1)) {
                }
                arg0.method5232(class313.method5161(var53) + (field1365 == 0 & client.field866 % 40 < 20 ? class87.method3100(16776960) + class87.field1303 : ""), Statics.field1291 - 70, var123, 16777215, 0);
                var120 = var123 + 15;
                String var55 = class252.field3204;
                String var56 = field1366;
                int var57 = var56.length();
                char[] var58 = new char[var57];
                for (int var59 = 0; var59 < var57; var59++) {
                    var58[var59] = '*';
                }
                String var60 = new String(var58);
                arg0.method5232(var55 + var60 + (field1365 == 1 & client.field866 % 40 < 20 ? class87.method3100(16776960) + class87.field1303 : ""), Statics.field1291 - 108, var120, 16777215, 0);
                var120 += 15;
                short var62 = 277;
                int var63 = Statics.field1291 + -117;
                boolean var64 = field1338;
                boolean var65 = field1336;
                class331 var66 = var64 ? (var65 ? Statics.field3359 : Statics.field1343) : (var65 ? Statics.field1200 : Statics.field236);
                var66.method5434(var63, var62);
                int var68 = var66.field3976 + 5 + var63;
                arg1.method5232(class252.field3156, var68, var62 + 13, 16776960, 0);
                int var69 = Statics.field1291 + 24;
                boolean var70 = Statics.field663.field1228;
                boolean var71 = field1363;
                class331 var72 = var70 ? (var71 ? Statics.field3359 : Statics.field1343) : (var71 ? Statics.field1200 : Statics.field236);
                var72.method5434(var69, var62);
                int var74 = var72.field3976 + 5 + var69;
                arg1.method5232(class252.field3261, var74, var62 + 13, 16776960, 0);
                int var124 = var62 + 15;
                int var75 = Statics.field1291 - 80;
                short var76 = 321;
                Statics.field329.method5434(var75 - 73, var76 - 20);
                arg0.method5222(class252.field3258, var75, var76 + 5, 16777215, 0);
                int var77 = Statics.field1291 + 80;
                Statics.field329.method5434(var77 - 73, var76 - 20);
                arg0.method5222(class252.field3045, var77, var76 + 5, 16777215, 0);
                short var78 = 357;
                arg1.method5222(class252.field3267, Statics.field1291, var78, 16776960, 0);
            } else if (field1354 == 3) {
                short var79 = 201;
                arg0.method5222(class252.field3262, field1362 + 180, var79, 16776960, 0);
                int var125 = var79 + 20;
                arg1.method5222(class252.field3263, field1362 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg1.method5222(class252.field3264, field1362 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var80 = field1362 + 180;
                short var81 = 276;
                Statics.field329.method5434(var80 - 73, var81 - 20);
                arg2.method5222(class252.field3265, var80, var81 + 5, 16777215, 0);
                int var82 = field1362 + 180;
                short var83 = 326;
                Statics.field329.method5434(var82 - 73, var83 - 20);
                arg2.method5222(class252.field3266, var82, var83 + 5, 16777215, 0);
            } else if (field1354 == 4) {
                arg0.method5222(class252.field3247, field1362 + 180, 201, 16776960, 0);
                short var84 = 236;
                arg0.method5222(field1356, field1362 + 180, var84, 16777215, 0);
                int var128 = var84 + 15;
                arg0.method5222(field1350, field1362 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                arg0.method5222(field1358, field1362 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                String var86 = class252.field3067;
                String var87 = Statics.field3753;
                int var88 = var87.length();
                char[] var89 = new char[var88];
                for (int var90 = 0; var90 < var88; var90++) {
                    var89[var90] = '*';
                }
                String var91 = new String(var89);
                arg0.method5232(var86 + var91 + (client.field866 % 40 < 20 ? class87.method3100(16776960) + class87.field1303 : ""), field1362 + 180 - 108, var130, 16777215, 0);
                var128 = var130 - 8;
                arg0.method5232(class252.field3028, field1362 + 180 - 9, var128, 16776960, 0);
                var128 += 15;
                arg0.method5232(class252.field3029, field1362 + 180 - 9, var128, 16776960, 0);
                int var93 = field1362 + 180 - 9 + arg0.method5224(class252.field3029) + 15;
                int var94 = var128 - arg0.field3885;
                class331 var95;
                if (field1364) {
                    var95 = Statics.field1343;
                } else {
                    var95 = Statics.field236;
                }
                var95.method5434(var93, var94);
                var128 += 15;
                int var96 = field1362 + 180 - 80;
                short var97 = 321;
                Statics.field329.method5434(var96 - 73, var97 - 20);
                arg0.method5222(class252.field3144, var96, var97 + 5, 16777215, 0);
                int var98 = field1362 + 180 + 80;
                Statics.field329.method5434(var98 - 73, var97 - 20);
                arg0.method5222(class252.field3045, var98, var97 + 5, 16777215, 0);
                arg1.method5222(class252.field3164, field1362 + 180, var97 + 36, 255, 0);
            } else if (field1354 == 5) {
                arg0.method5222(class252.field3268, field1362 + 180, 201, 16776960, 0);
                short var99 = 221;
                arg2.method5222(field1356, field1362 + 180, var99, 16776960, 0);
                int var131 = var99 + 15;
                arg2.method5222(field1350, field1362 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg2.method5222(field1358, field1362 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var134 = var133 + 14;
                arg0.method5232(class252.field3078, field1362 + 180 - 145, var134, 16777215, 0);
                short var100 = 174;
                String var101;
                for (var101 = method110(); arg0.method5224(var101) > var100; var101 = var101.substring(1)) {
                }
                arg0.method5232(class313.method5161(var101) + (client.field866 % 40 < 20 ? class87.method3100(16776960) + class87.field1303 : ""), field1362 + 180 - 34, var134, 16777215, 0);
                var131 = var134 + 15;
                int var102 = field1362 + 180 - 80;
                short var103 = 321;
                Statics.field329.method5434(var102 - 73, var103 - 20);
                arg0.method5222(class252.field3193, var102, var103 + 5, 16777215, 0);
                int var104 = field1362 + 180 + 80;
                Statics.field329.method5434(var104 - 73, var103 - 20);
                arg0.method5222(class252.field3256, var104, var103 + 5, 16777215, 0);
            } else if (field1354 == 6) {
                short var105 = 201;
                arg0.method5222(field1356, field1362 + 180, var105, 16776960, 0);
                int var135 = var105 + 15;
                arg0.method5222(field1350, field1362 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method5222(field1358, field1362 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var106 = field1362 + 180;
                short var107 = 321;
                Statics.field329.method5434(var106 - 73, var107 - 20);
                arg0.method5222(class252.field3256, var106, var107 + 5, 16777215, 0);
            }
        }
        if (field1360 > 0) {
            method1734(field1360);
            field1360 = 0;
        }
        method1640();
        Statics.field1467[Statics.field663.field1223 ? 1 : 0].method5434(field1337 + 765 - 40, 463);
        if (client.field986 <= 5 || client.field863 != 0) {
            return;
        }
        if (Statics.field3391 == null) {
            Statics.field3391 = class333.method1704(Statics.field2028, "sl_button", "");
            return;
        }
        int var108 = field1337 + 5;
        short var109 = 463;
        byte var110 = 100;
        byte var111 = 35;
        Statics.field3391.method5434(var108, var109);
        arg0.method5222(class252.field3185 + " " + client.field1084, var110 / 2 + var108, var111 / 2 + var109 - 2, 16777215, 0);
        if (Statics.field1208 == null) {
            arg1.method5222(class252.field3303, var110 / 2 + var108, var111 / 2 + var109 + 12, 16777215, 0);
        } else {
            arg1.method5222(class252.field3150, var110 / 2 + var108, var111 / 2 + var109 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("av.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method667(String arg0, String arg1, String arg2) {
        field1356 = arg0;
        field1350 = arg1;
        field1358 = arg2;
    }

    @ObfuscatedName("ef.t(Llv;B)V")
    public static final void method2888(class331 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field300.length; var2++) {
            Statics.field300[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field300[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2278[var8] = (Statics.field300[var8 - 1] + Statics.field300[var8 + 1] + Statics.field300[var8 - 128] + Statics.field300[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field300;
            Statics.field300 = Statics.field2278;
            Statics.field2278 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3974; var11++) {
            for (int var12 = 0; var12 < arg0.field3976; var12++) {
                if (arg0.field3971[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3975;
                    int var14 = var11 + 16 + arg0.field3973;
                    int var15 = (var14 << 7) + var13;
                    Statics.field300[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cu.i(II)V")
    public static final void method1734(int arg0) {
        short var1 = 256;
        field1348 += arg0 * 128;
        if (field1348 > Statics.field300.length) {
            field1348 -= Statics.field300.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2888(Statics.field1340[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field12[var3 + var4] - Statics.field300[field1348 + var3 & Statics.field300.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field12[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field12[var9 + var10] = 255;
                } else {
                    Statics.field12[var9 + var10] = 0;
                }
            }
        }
        if (field1346 > 0) {
            field1346 -= arg0 * 4;
        }
        if (field1347 > 0) {
            field1347 -= arg0 * 4;
        }
        if (field1346 == 0 && field1347 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1346 = 1024;
            }
            if (var12 == 1) {
                field1347 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1345[var13] = field1345[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1345[var14] = (int) (Math.sin((double) field1351 / 14.0D) * 16.0D + Math.sin((double) field1351 / 15.0D) * 14.0D + Math.sin((double) field1351 / 16.0D) * 12.0D);
            field1351++;
        }
        field1353 += arg0 * 1906930795;
        int var15 = ((client.field866 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1353 * 1903131180; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field12[(var18 << 7) + var17] = 192;
        }
        field1353 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field12[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field12[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field3867[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field3867[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field3867[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field12[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dv.u(IIII)I")
    public static final int method2504(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cl.q(I)V")
    public static final void method1640() {
        short var0 = 256;
        if (field1346 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1346 > 768) {
                    Statics.field3776[var1] = method2504(Statics.field756[var1], Statics.field3827[var1], 1024 - field1346);
                } else if (field1346 > 256) {
                    Statics.field3776[var1] = Statics.field3827[var1];
                } else {
                    Statics.field3776[var1] = method2504(Statics.field3827[var1], Statics.field756[var1], 256 - field1346);
                }
            }
        } else if (field1347 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1347 > 768) {
                    Statics.field3776[var2] = method2504(Statics.field756[var2], Statics.field272[var2], 1024 - field1347);
                } else if (field1347 > 256) {
                    Statics.field3776[var2] = Statics.field272[var2];
                } else {
                    Statics.field3776[var2] = method2504(Statics.field272[var2], Statics.field756[var2], 256 - field1347);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field3776[var3] = Statics.field756[var3];
            }
        }
        class328.method5340(field1337, 9, field1337 + 128, var0 + 7);
        Statics.field1339.method5538(field1337, 0);
        class328.method5339();
        int var4 = 0;
        int var5 = field1337 + Statics.field340.field3961 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1345[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field12[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field3776[var10];
                    int var14 = Statics.field340.field3962[var5];
                    Statics.field340.field3962[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field340.field3961 + var8 - 128;
        }
        class328.method5340(field1337 + 765 - 128, 9, field1337 + 765, var0 + 7);
        Statics.field1341.method5538(field1337 + 382, 0);
        class328.method5339();
        int var15 = 0;
        int var16 = field1337 + Statics.field340.field3961 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1345[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field12[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field3776[var22];
                    int var26 = Statics.field340.field3962[var20];
                    Statics.field340.field3962[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field340.field3961 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("q.v(Lbq;B)V")
    public static void method90(class78 arg0) {
        if (arg0.method1524() != client.field1031) {
            client.field1031 = arg0.method1524();
            boolean var1 = arg0.method1524();
            if (Statics.field3643 != var1) {
                class284.method143();
                Statics.field3643 = var1;
            }
        }
        Statics.field249 = arg0.field1218;
        client.field1084 = arg0.field1215;
        client.field858 = arg0.field1216;
        Statics.field2760 = client.field860 == 0 ? 43594 : arg0.field1215 + 40000;
        Statics.field574 = client.field860 == 0 ? 443 : arg0.field1215 + 50000;
        Statics.field2996 = Statics.field2760;
    }

    @ObfuscatedName("ae.f(I)V")
    public static void method469() {
        if (class78.method74()) {
            field1368 = true;
        }
    }
}
