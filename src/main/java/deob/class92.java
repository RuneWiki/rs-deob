package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("cz")
public class class92 {

    @ObfuscatedName("cz.v")
    public static int field1337 = 0;

    @ObfuscatedName("cz.i")
    public static int field1344 = field1337 + 202;

    @ObfuscatedName("cz.l")
    public static int[] field1353 = new int[256];

    @ObfuscatedName("cz.q")
    public static int field1347 = 0;

    @ObfuscatedName("cz.ac")
    public static int field1351 = 0;

    @ObfuscatedName("cz.af")
    public static int field1349 = 0;

    @ObfuscatedName("cz.az")
    public static int field1354 = 0;

    @ObfuscatedName("cz.ae")
    public static int field1367 = 0;

    @ObfuscatedName("cz.av")
    public static int field1352 = 0;

    @ObfuscatedName("cz.am")
    public static int field1363 = 10;

    @ObfuscatedName("cz.ax")
    public static String field1370 = "";

    @ObfuscatedName("cz.ah")
    public static int field1355 = 0;

    @ObfuscatedName("cz.ab")
    public static String field1356 = "";

    @ObfuscatedName("cz.aj")
    public static String field1357 = "";

    @ObfuscatedName("cz.aa")
    public static String field1359 = "";

    @ObfuscatedName("cz.ao")
    public static String field1365 = "";

    @ObfuscatedName("cz.al")
    public static String field1360 = "";

    @ObfuscatedName("cz.ay")
    public static String field1361 = "";

    @ObfuscatedName("cz.aq")
    public static boolean field1362 = false;

    @ObfuscatedName("cz.ar")
    public static boolean field1336 = false;

    @ObfuscatedName("cz.bg")
    public static boolean field1364 = false;

    @ObfuscatedName("cz.by")
    public static boolean field1368 = true;

    @ObfuscatedName("cz.bz")
    public static int field1348 = 0;

    @ObfuscatedName("cz.bj")
    public static String field1346 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cz.bd")
    public static String field1366 = "1234567890";

    @ObfuscatedName("cz.bo")
    public static boolean field1369 = false;

    @ObfuscatedName("cz.bw")
    public static int field1350 = -1;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.n(B)I")
    public static int method1019() {
        return 11;
    }

    @ObfuscatedName("be.v(Lil;Lil;ZII)V")
    public static void method1003(class247 arg0, class247 arg1, boolean arg2, int arg3) {
        if (!Statics.field1342) {
            field1355 = arg3;
            class295.method4746();
            byte[] var4 = arg0.method3977("title.jpg", "");
            Object var5 = null;
            class299 var11;
            label144: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class299(var9, var7, var8);
                    break label144;
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class299(0, 0);
            }
            Statics.field1340 = var11;
            Statics.field270 = Statics.field1340.method4848();
            if ((client.field1126 & 0x20000000) == 0) {
                Statics.field1341 = class300.method3770(arg1, "logo", "");
            } else {
                Statics.field1341 = class300.method3770(arg1, "logo_deadman_mode", "");
            }
            Statics.field1338 = class300.method3770(arg1, "titlebox", "");
            Statics.field3745 = class300.method3770(arg1, "titlebutton", "");
            Statics.field1339 = class300.method4825(arg1, "runes", "");
            Statics.field758 = class300.method4825(arg1, "title_mute", "");
            Statics.field813 = class300.method3770(arg1, "options_radio_buttons,0", "");
            Statics.field1443 = class300.method3770(arg1, "options_radio_buttons,4", "");
            Statics.field12 = class300.method3770(arg1, "options_radio_buttons,2", "");
            Statics.field1343 = class300.method3770(arg1, "options_radio_buttons,6", "");
            Statics.field3302 = Statics.field813.field3855;
            Statics.field2129 = Statics.field813.field3851;
            Statics.field778 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field778[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field778[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field778[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field778[var17 + 192] = 16777215;
            }
            Statics.field297 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field297[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field297[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field297[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field297[var21 + 192] = 16777215;
            }
            Statics.field452 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field452[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field452[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field452[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field452[var25 + 192] = 16777215;
            }
            Statics.field516 = new int[256];
            Statics.field1959 = new int[32768];
            Statics.field834 = new int[32768];
            method464((class298) null);
            Statics.field283 = new int[32768];
            Statics.field1572 = new int[32768];
            if (arg2) {
                field1360 = "";
                field1361 = "";
            }
            Statics.field3364 = 0;
            Statics.field3328 = "";
            field1368 = true;
            field1369 = false;
            if (Statics.field2727.field1236) {
                class215.field2632 = 1;
                Statics.field2633 = null;
                Statics.field811 = -1;
                Statics.field3475 = -1;
                Statics.field478 = 0;
                Statics.field2628 = false;
                Statics.field3712 = 2;
            } else {
                class249 var26 = Statics.field355;
                int var27 = var26.method4007("scape main");
                int var28 = var26.method4009(var27, "");
                class215.field2632 = 1;
                Statics.field2633 = var26;
                Statics.field811 = var27;
                Statics.field3475 = var28;
                Statics.field478 = 255;
                Statics.field2628 = false;
                Statics.field3712 = 2;
            }
            Statics.method4472(false);
            Statics.field1342 = true;
            field1337 = (Statics.field1320 - 765) / 2;
            field1344 = field1337 + 202;
            Statics.field1345 = field1344 + 180;
            Statics.field1340.method4864(field1337, 0);
            Statics.field270.method4864(field1337 + 382, 0);
            Statics.field1341.method4830(field1337 + 382 - Statics.field1341.field3855 / 2, 18);
        } else if (arg3 == 4) {
            field1355 = 4;
        }
    }

    @ObfuscatedName("hr.y(ZZI)Lkm;")
    public static class298 method3755(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1343 : Statics.field12) : (arg1 ? Statics.field1443 : Statics.field813);
    }

    @ObfuscatedName("aq.r(B)Ljava/lang/String;")
    public static String method544() {
        String var6;
        if (Statics.field2727.field1239) {
            String var0 = field1360;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1360;
        }
        return var6;
    }

    @ObfuscatedName("cb.h(I)V")
    public static void method1573() {
        if (field1360 != null && field1360.length() > 0) {
            return;
        }
        if (Statics.field2727.field1238 == null) {
            field1362 = false;
        } else {
            field1360 = Statics.field2727.field1238;
            field1362 = true;
        }
    }

    @ObfuscatedName("an.d(B)V")
    public static void method622() {
        if (field1362 && field1360 != null && field1360.length() > 0) {
            field1348 = 1;
        } else {
            field1348 = 0;
        }
    }

    @ObfuscatedName("cl.s(Lbd;B)V")
    public static void method1512(class59 arg0) {
        if (field1369) {
            method40(arg0);
            return;
        }
        if ((class60.field711 == 1 || !Statics.field565 && class60.field711 == 4) && class60.field710 >= field1337 + 765 - 50 && class60.field714 >= 453) {
            Statics.field2727.field1236 = !Statics.field2727.field1236;
            class81.method1488();
            if (Statics.field2727.field1236) {
                Statics.field2631.method3576();
                class215.field2632 = 1;
                Statics.field2633 = null;
            } else {
                class215.method2344(Statics.field355, "scape main", "", 255, false);
            }
        }
        if (client.field880 == 5) {
            return;
        }
        field1367++;
        if (client.field880 != 10 && client.field880 != 11) {
            return;
        }
        if (client.field972 == 0) {
            if (class60.field711 == 1 || !Statics.field565 && class60.field711 == 4) {
                int var1 = field1337 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class60.field710 >= var1 && class60.field710 <= var1 + var3 && class60.field714 >= var2 && class60.field714 <= var2 + var4) {
                    method1588();
                    return;
                }
            }
            if (Statics.field490 != null) {
                method1588();
            }
        }
        int var5 = class60.field711;
        int var6 = class60.field710;
        int var7 = class60.field714;
        if (var5 == 0) {
            var6 = class60.field705;
            var7 = class60.field706;
        }
        if (!Statics.field565 && var5 == 4) {
            var5 = 1;
        }
        if (field1355 == 0) {
            boolean var8 = false;
            while (class51.method312()) {
                if (Statics.field1684 == 84) {
                    var8 = true;
                }
            }
            int var9 = Statics.field1345 - 80;
            short var10 = 291;
            if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                class57.method2716(client.method1445("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var11 = Statics.field1345 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20 || var8) {
                if ((client.field1126 & 0x2000000) != 0) {
                    field1356 = "";
                    field1357 = class237.field3186;
                    field1359 = class237.field3168;
                    field1365 = class237.field3188;
                    field1355 = 1;
                    method622();
                } else if ((client.field1126 & 0x4) != 0) {
                    if ((client.field1126 & 0x400) == 0) {
                        field1357 = class237.field3177;
                        field1359 = class237.field3181;
                        field1365 = class237.field3179;
                    } else {
                        field1357 = class237.field3054;
                        field1359 = class237.field3184;
                        field1365 = class237.field3017;
                    }
                    field1356 = class237.field3176;
                    field1355 = 1;
                    method622();
                } else if ((client.field1126 & 0x400) == 0) {
                    method540(false);
                } else {
                    field1357 = class237.field3078;
                    field1359 = class237.field3154;
                    field1365 = class237.field3012;
                    field1356 = class237.field3176;
                    field1355 = 1;
                    method622();
                }
            }
        } else if (field1355 == 1) {
            while (class51.method312()) {
                if (Statics.field1684 == 84) {
                    method540(false);
                } else if (Statics.field1684 == 13) {
                    field1355 = 0;
                }
            }
            int var12 = Statics.field1345 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                method540(false);
            }
            int var14 = Statics.field1345 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field1355 = 0;
            }
        } else if (field1355 == 2) {
            short var15 = 201;
            int var42 = var15 + 52;
            if (var5 == 1 && var7 >= var42 - 12 && var7 < var42 + 2) {
                field1348 = 0;
            }
            var42 += 15;
            if (var5 == 1 && var7 >= var42 - 12 && var7 < var42 + 2) {
                field1348 = 1;
            }
            var42 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method1073(class237.field3200, class237.field3215, class237.field3216);
                field1355 = 5;
                return;
            }
            int var17 = Statics.field1345 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field1360 = field1360.trim();
                if (field1360.length() == 0) {
                    method1073(class237.field3079, class237.field3080, class237.field3081);
                    return;
                }
                if (field1361.length() == 0) {
                    method1073(class237.field3082, class237.field3083, class237.field3098);
                    return;
                }
                method1073(class237.field3110, class237.field3190, class237.field3193);
                client.method625(false);
                client.method1076(20);
                return;
            }
            int var19 = field1344 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field1355 = 0;
                field1360 = "";
                field1361 = "";
                Statics.field3364 = 0;
                Statics.field3328 = "";
                field1368 = true;
            }
            int var20 = Statics.field1345 + -117;
            short var21 = 277;
            field1336 = var6 >= var20 && var6 < Statics.field3302 + var20 && var7 >= var21 && var7 < Statics.field2129 + var21;
            if (var5 == 1 && field1336) {
                field1362 = !field1362;
                if (!field1362 && Statics.field2727.field1238 != null) {
                    Statics.field2727.field1238 = null;
                    class81.method1488();
                }
            }
            int var22 = Statics.field1345 + 24;
            short var23 = 277;
            field1364 = var6 >= var22 && var6 < Statics.field3302 + var22 && var7 >= var23 && var7 < Statics.field2129 + var23;
            if (var5 == 1 && field1364) {
                Statics.field2727.field1239 = !Statics.field2727.field1239;
                if (!Statics.field2727.field1239) {
                    field1360 = "";
                    Statics.field2727.field1238 = null;
                    method622();
                }
                class81.method1488();
            }
            while (true) {
                while (class51.method312()) {
                    boolean var24 = false;
                    for (int var25 = 0; var25 < field1346.length(); var25++) {
                        if (Statics.field492 == field1346.charAt(var25)) {
                            var24 = true;
                            break;
                        }
                    }
                    if (Statics.field1684 == 13) {
                        field1355 = 0;
                        field1360 = "";
                        field1361 = "";
                        Statics.field3364 = 0;
                        Statics.field3328 = "";
                        field1368 = true;
                    } else if (field1348 == 0) {
                        if (Statics.field1684 == 85 && field1360.length() > 0) {
                            field1360 = field1360.substring(0, field1360.length() - 1);
                        }
                        if (Statics.field1684 == 84 || Statics.field1684 == 80) {
                            field1348 = 1;
                        }
                        if (var24 && field1360.length() < 320) {
                            field1360 = field1360 + Statics.field492;
                        }
                    } else if (field1348 == 1) {
                        if (Statics.field1684 == 85 && field1361.length() > 0) {
                            field1361 = field1361.substring(0, field1361.length() - 1);
                        }
                        if (Statics.field1684 == 84 || Statics.field1684 == 80) {
                            field1348 = 0;
                        }
                        if (Statics.field1684 == 84) {
                            field1360 = field1360.trim();
                            if (field1360.length() == 0) {
                                method1073(class237.field3079, class237.field3080, class237.field3081);
                                return;
                            }
                            if (field1361.length() == 0) {
                                method1073(class237.field3082, class237.field3083, class237.field3098);
                                return;
                            }
                            method1073(class237.field3110, class237.field3190, class237.field3193);
                            client.method625(false);
                            client.method1076(20);
                            return;
                        }
                        if (var24 && field1361.length() < 20) {
                            field1361 = field1361 + Statics.field492;
                        }
                    }
                }
                return;
            }
        } else if (field1355 == 3) {
            int var26 = field1344 + 180;
            short var27 = 276;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method540(false);
            }
            int var28 = field1344 + 180;
            short var29 = 326;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var29 - 20 && var7 <= var29 + 20) {
                method1073(class237.field3200, class237.field3215, class237.field3216);
                field1355 = 5;
                return;
            }
        } else if (field1355 == 4) {
            int var30 = field1344 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                Statics.field3328.trim();
                if (Statics.field3328.length() != 6) {
                    method1073(class237.field2998, class237.field2999, class237.field3000);
                    return;
                }
                Statics.field3364 = Integer.parseInt(Statics.field3328);
                Statics.field3328 = "";
                client.method625(true);
                method1073(class237.field3110, class237.field3190, class237.field3193);
                client.method1076(20);
                return;
            }
            if (var5 == 1 && var6 >= field1344 + 180 - 9 && var6 <= field1344 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field1368 = !field1368;
            }
            if (var5 == 1 && var6 >= field1344 + 180 - 34 && var6 <= field1344 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                String var32 = client.method1445("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class57.method484(var32, true, "openjs", false);
            }
            int var33 = field1344 + 180 + 80;
            if (var5 == 1 && var6 >= var33 - 75 && var6 <= var33 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field1355 = 0;
                field1360 = "";
                field1361 = "";
                Statics.field3364 = 0;
                Statics.field3328 = "";
            }
            while (class51.method312()) {
                boolean var34 = false;
                for (int var35 = 0; var35 < field1366.length(); var35++) {
                    if (Statics.field492 == field1366.charAt(var35)) {
                        var34 = true;
                        break;
                    }
                }
                if (Statics.field1684 == 13) {
                    field1355 = 0;
                    field1360 = "";
                    field1361 = "";
                    Statics.field3364 = 0;
                    Statics.field3328 = "";
                } else {
                    if (Statics.field1684 == 85 && Statics.field3328.length() > 0) {
                        Statics.field3328 = Statics.field3328.substring(0, Statics.field3328.length() - 1);
                    }
                    if (Statics.field1684 == 84) {
                        Statics.field3328.trim();
                        if (Statics.field3328.length() != 6) {
                            method1073(class237.field2998, class237.field2999, class237.field3000);
                            return;
                        }
                        Statics.field3364 = Integer.parseInt(Statics.field3328);
                        Statics.field3328 = "";
                        client.method625(true);
                        method1073(class237.field3110, class237.field3190, class237.field3193);
                        client.method1076(20);
                        return;
                    }
                    if (var34 && Statics.field3328.length() < 6) {
                        Statics.field3328 = Statics.field3328 + Statics.field492;
                    }
                }
            }
        } else if (field1355 == 5) {
            int var36 = field1344 + 180 - 80;
            short var37 = 321;
            if (var5 == 1 && var6 >= var36 - 75 && var6 <= var36 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                method458();
                return;
            }
            int var38 = field1344 + 180 + 80;
            if (var5 == 1 && var6 >= var38 - 75 && var6 <= var38 + 75 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                method540(true);
            }
            while (class51.method312()) {
                boolean var39 = false;
                for (int var40 = 0; var40 < field1346.length(); var40++) {
                    if (Statics.field492 == field1346.charAt(var40)) {
                        var39 = true;
                        break;
                    }
                }
                if (Statics.field1684 == 13) {
                    method540(true);
                } else {
                    if (Statics.field1684 == 85 && field1360.length() > 0) {
                        field1360 = field1360.substring(0, field1360.length() - 1);
                    }
                    if (Statics.field1684 == 84) {
                        method458();
                        return;
                    }
                    if (var39 && field1360.length() < 320) {
                        field1360 = field1360 + Statics.field492;
                    }
                }
            }
        } else if (field1355 == 6) {
            while (true) {
                do {
                    if (!class51.method312()) {
                        short var41 = 321;
                        if (var5 == 1 && var7 >= var41 - 20 && var7 <= var41 + 20) {
                            method540(true);
                        }
                        return;
                    }
                } while (Statics.field1684 != 84 && Statics.field1684 != 13);
                method540(true);
            }
        }
    }

    @ObfuscatedName("aq.b(ZI)V")
    public static void method540(boolean arg0) {
        field1357 = class237.field3206;
        field1359 = class237.field3174;
        field1365 = class237.field3175;
        field1355 = 2;
        if (arg0) {
            field1361 = "";
        }
        method1573();
        method622();
    }

    @ObfuscatedName("ax.e(B)V")
    public static void method458() {
        field1360 = field1360.trim();
        if (field1360.length() == 0) {
            method1073(class237.field3200, class237.field3215, class237.field3216);
            return;
        }
        long var0 = class87.method2741();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class87.method1040(var0, field1360);
        }
        switch(var2) {
            case 2:
                method1073(class237.field3217, class237.field3218, class237.field3219);
                field1355 = 6;
                break;
            case 3:
                method1073(class237.field3220, class237.field3221, class237.field3222);
                break;
            case 4:
                method1073(class237.field3223, class237.field3224, class237.field3225);
                break;
            case 5:
                method1073(class237.field3226, class237.field3227, class237.field3028);
                break;
            case 6:
                method1073(class237.field3132, class237.field3230, class237.field3231);
                break;
            case 7:
                method1073(class237.field3141, class237.field3233, class237.field3234);
        }
    }

    @ObfuscatedName("gn.f(Ljz;Ljz;Ljz;ZB)V")
    public static void method3278(class275 arg0, class275 arg1, class275 arg2, boolean arg3) {
        if (arg3) {
            field1337 = (Statics.field1320 - 765) / 2;
            field1344 = field1337 + 202;
            Statics.field1345 = field1344 + 180;
        }
        if (field1369) {
            if (Statics.field2710 == null) {
                Statics.field2710 = class300.method17(Statics.field2027, "sl_back", "");
            }
            if (Statics.field1691 == null) {
                Statics.field1691 = class300.method4825(Statics.field2027, "sl_flags", "");
            }
            if (Statics.field430 == null) {
                Statics.field430 = class300.method4825(Statics.field2027, "sl_arrows", "");
            }
            if (Statics.field543 == null) {
                Statics.field543 = class300.method4825(Statics.field2027, "sl_stars", "");
            }
            class295.method4752(field1337, 23, 765, 480, 0);
            class295.method4751(field1337, 0, 125, 23, 12425273, 9135624);
            class295.method4751(field1337 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4549(class237.field3235, field1337 + 62, 15, 0, -1);
            if (Statics.field543 != null) {
                Statics.field543[1].method4830(field1337 + 140, 1);
                arg1.method4546(class237.field3236, field1337 + 152, 10, 16777215, -1);
                Statics.field543[0].method4830(field1337 + 140, 12);
                arg1.method4546(class237.field3051, field1337 + 152, 21, 16777215, -1);
            }
            if (Statics.field430 != null) {
                int var4 = field1337 + 280;
                if (class80.field1225[0] == 0 && class80.field1224[0] == 0) {
                    Statics.field430[2].method4830(var4, 4);
                } else {
                    Statics.field430[0].method4830(var4, 4);
                }
                if (class80.field1225[0] == 0 && class80.field1224[0] == 1) {
                    Statics.field430[3].method4830(var4 + 15, 4);
                } else {
                    Statics.field430[1].method4830(var4 + 15, 4);
                }
                arg0.method4546(class237.field3238, var4 + 32, 17, 16777215, -1);
                int var5 = field1337 + 390;
                if (class80.field1225[0] == 1 && class80.field1224[0] == 0) {
                    Statics.field430[2].method4830(var5, 4);
                } else {
                    Statics.field430[0].method4830(var5, 4);
                }
                if (class80.field1225[0] == 1 && class80.field1224[0] == 1) {
                    Statics.field430[3].method4830(var5 + 15, 4);
                } else {
                    Statics.field430[1].method4830(var5 + 15, 4);
                }
                arg0.method4546(class237.field3239, var5 + 32, 17, 16777215, -1);
                int var6 = field1337 + 500;
                if (class80.field1225[0] == 2 && class80.field1224[0] == 0) {
                    Statics.field430[2].method4830(var6, 4);
                } else {
                    Statics.field430[0].method4830(var6, 4);
                }
                if (class80.field1225[0] == 2 && class80.field1224[0] == 1) {
                    Statics.field430[3].method4830(var6 + 15, 4);
                } else {
                    Statics.field430[1].method4830(var6 + 15, 4);
                }
                arg0.method4546(class237.field3240, var6 + 32, 17, 16777215, -1);
                int var7 = field1337 + 610;
                if (class80.field1225[0] == 3 && class80.field1224[0] == 0) {
                    Statics.field430[2].method4830(var7, 4);
                } else {
                    Statics.field430[0].method4830(var7, 4);
                }
                if (class80.field1225[0] == 3 && class80.field1224[0] == 1) {
                    Statics.field430[3].method4830(var7 + 15, 4);
                } else {
                    Statics.field430[1].method4830(var7 + 15, 4);
                }
                arg0.method4546(class237.field3241, var7 + 32, 17, 16777215, -1);
            }
            class295.method4752(field1337 + 708, 4, 50, 16, 0);
            arg1.method4549(class237.field3063, field1337 + 708 + 25, 16, 16777215, -1);
            field1350 = -1;
            if (Statics.field2710 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class80.field1222) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1222) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1222) {
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
                for (int var22 = 0; var22 < class80.field1222; var22++) {
                    class80 var23 = Statics.field1221[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1228);
                    if (var23.field1228 == -1) {
                        var25 = class237.field3242;
                        var24 = false;
                    } else if (var23.field1228 > 1980) {
                        var25 = class237.field3243;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1455()) {
                        if (var23.method1464()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1461()) {
                        var26 = 16711680;
                        if (var23.method1464()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1452()) {
                        if (var23.method1464()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1464()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field705 >= var19 && class60.field706 >= var18 && class60.field705 < var8 + var19 && class60.field706 < var9 + var18 && var24) {
                        field1350 = var22;
                        Statics.field2710[var27].method4863(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field2710[var27].method4864(var19, var18);
                    }
                    if (Statics.field1691 != null) {
                        Statics.field1691[(var23.method1464() ? 8 : 0) + var23.field1227].method4830(var19 + 29, var18);
                    }
                    arg0.method4549(Integer.toString(var23.field1226), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4549(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4541(Statics.field1221[field1350].field1223) + 6;
                    int var29 = arg1.field3722 + 8;
                    class295.method4752(class60.field705 - var28 / 2, class60.field706 + 20 + 5, var28, var29, 16777120);
                    class295.method4769(class60.field705 - var28 / 2, class60.field706 + 20 + 5, var28, var29, 0);
                    arg1.method4549(Statics.field1221[field1350].field1223, class60.field705, class60.field706 + 20 + 5 + arg1.field3722 + 4, 0, -1);
                }
            }
            Statics.field475.method717(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1340.method4864(field1337, 0);
            Statics.field270.method4864(field1337 + 382, 0);
            Statics.field1341.method4830(field1337 + 382 - Statics.field1341.field3855 / 2, 18);
        }
        if (client.field880 == 0 || client.field880 == 5) {
            byte var30 = 20;
            arg0.method4549(class237.field3172, field1344 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class295.method4769(field1344 + 180 - 152, var31, 304, 34, 9179409);
            class295.method4769(field1344 + 180 - 151, var31 + 1, 302, 32, 0);
            class295.method4752(field1344 + 180 - 150, var31 + 2, field1363 * 3, 30, 9179409);
            class295.method4752(field1363 * 3 + (field1344 + 180 - 150), var31 + 2, 300 - field1363 * 3, 30, 0);
            arg0.method4549(field1370, field1344 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field880 == 20) {
            Statics.field1338.method4830(field1344 + 180 - Statics.field1338.field3855 / 2, 271 - Statics.field1338.field3851 / 2);
            short var32 = 201;
            arg0.method4549(field1357, field1344 + 180, var32, 16776960, 0);
            int var133 = var32 + 15;
            arg0.method4549(field1359, field1344 + 180, var133, 16776960, 0);
            int var134 = var133 + 15;
            arg0.method4549(field1365, field1344 + 180, var134, 16776960, 0);
            int var135 = var134 + 15;
            int var136 = var135 + 7;
            if (field1355 != 4) {
                arg0.method4546(class237.field3194, field1344 + 180 - 110, var136, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = method544(); arg0.method4541(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4546(class276.method4581(var34), field1344 + 180 - 70, var136, 16777215, 0);
                var133 = var136 + 15;
                String var36 = class237.field3195;
                String var37 = field1361;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                arg0.method4546(var36 + var41, field1344 + 180 - 108, var133, 16777215, 0);
                var133 += 15;
            }
        }
        if (client.field880 == 10 || client.field880 == 11) {
            Statics.field1338.method4830(field1344, 171);
            if (field1355 == 0) {
                short var43 = 251;
                arg0.method4549(class237.field3197, field1344 + 180, var43, 16776960, 0);
                int var137 = var43 + 30;
                int var44 = field1344 + 180 - 80;
                short var45 = 291;
                Statics.field3745.method4830(var44 - 73, var45 - 20);
                arg0.method4550(class237.field3070, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field1344 + 180 + 80;
                Statics.field3745.method4830(var46 - 73, var45 - 20);
                arg0.method4550(class237.field3199, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1355 == 1) {
                arg0.method4549(field1356, field1344 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method4549(field1357, field1344 + 180, var47, 16777215, 0);
                int var138 = var47 + 15;
                arg0.method4549(field1359, field1344 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                arg0.method4549(field1365, field1344 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                int var48 = field1344 + 180 - 80;
                short var49 = 321;
                Statics.field3745.method4830(var48 - 73, var49 - 20);
                arg0.method4549(class237.field3191, var48, var49 + 5, 16777215, 0);
                int var50 = field1344 + 180 + 80;
                Statics.field3745.method4830(var50 - 73, var49 - 20);
                arg0.method4549(class237.field3063, var50, var49 + 5, 16777215, 0);
            } else if (field1355 == 2) {
                short var51 = 201;
                arg0.method4549(field1357, Statics.field1345, var51, 16776960, 0);
                int var141 = var51 + 15;
                arg0.method4549(field1359, Statics.field1345, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method4549(field1365, Statics.field1345, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var144 = var143 + 7;
                arg0.method4546(class237.field3194, Statics.field1345 - 110, var144, 16777215, 0);
                short var52 = 200;
                String var53;
                for (var53 = method544(); arg0.method4541(var53) > var52; var53 = var53.substring(1)) {
                }
                arg0.method4546(class276.method4581(var53) + (field1348 == 0 & client.field883 % 40 < 20 ? class88.method683(16776960) + class88.field1313 : ""), Statics.field1345 - 70, var144, 16777215, 0);
                var141 = var144 + 15;
                String var55 = class237.field3195;
                String var56 = field1361;
                int var57 = var56.length();
                char[] var58 = new char[var57];
                for (int var59 = 0; var59 < var57; var59++) {
                    var58[var59] = '*';
                }
                String var60 = new String(var58);
                arg0.method4546(var55 + var60 + (field1348 == 1 & client.field883 % 40 < 20 ? class88.method683(16776960) + class88.field1313 : ""), Statics.field1345 - 108, var141, 16777215, 0);
                var141 += 15;
                short var62 = 277;
                int var63 = Statics.field1345 + -117;
                class298 var64 = method3755(field1362, field1336);
                var64.method4830(var63, var62);
                int var65 = var64.field3855 + 5 + var63;
                arg1.method4546(class237.field3202, var65, var62 + 13, 16776960, 0);
                int var66 = Statics.field1345 + 24;
                class298 var67 = method3755(Statics.field2727.field1239, field1364);
                var67.method4830(var66, var62);
                int var68 = var67.field3855 + 5 + var66;
                arg1.method4546(class237.field3203, var68, var62 + 13, 16776960, 0);
                int var145 = var62 + 15;
                int var69 = Statics.field1345 - 80;
                short var70 = 321;
                Statics.field3745.method4830(var69 - 73, var70 - 20);
                arg0.method4549(class237.field3192, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field1345 + 80;
                Statics.field3745.method4830(var71 - 73, var70 - 20);
                arg0.method4549(class237.field3063, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                arg1.method4549(class237.field3209, Statics.field1345, var72, 16776960, 0);
            } else if (field1355 == 3) {
                short var73 = 201;
                arg0.method4549(class237.field3100, field1344 + 180, var73, 16776960, 0);
                int var146 = var73 + 20;
                arg1.method4549(class237.field3205, field1344 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg1.method4549(class237.field3032, field1344 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                int var74 = field1344 + 180;
                short var75 = 276;
                Statics.field3745.method4830(var74 - 73, var75 - 20);
                arg2.method4549(class237.field3094, var74, var75 + 5, 16777215, 0);
                int var76 = field1344 + 180;
                short var77 = 326;
                Statics.field3745.method4830(var76 - 73, var77 - 20);
                arg2.method4549(class237.field3208, var76, var77 + 5, 16777215, 0);
            } else if (field1355 == 4) {
                arg0.method4549(class237.field3099, field1344 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method4549(field1357, field1344 + 180, var78, 16777215, 0);
                int var149 = var78 + 15;
                arg0.method4549(field1359, field1344 + 180, var149, 16777215, 0);
                int var150 = var149 + 15;
                arg0.method4549(field1365, field1344 + 180, var150, 16777215, 0);
                int var151 = var150 + 15;
                String var80 = class237.field3005;
                String var81 = Statics.field3328;
                int var82 = var81.length();
                char[] var83 = new char[var82];
                for (int var84 = 0; var84 < var82; var84++) {
                    var83[var84] = '*';
                }
                String var85 = new String(var83);
                arg0.method4546(var80 + var85 + (client.field883 % 40 < 20 ? class88.method683(16776960) + class88.field1313 : ""), field1344 + 180 - 108, var151, 16777215, 0);
                var149 = var151 - 8;
                arg0.method4546(class237.field2973, field1344 + 180 - 9, var149, 16776960, 0);
                var149 += 15;
                arg0.method4546(class237.field2971, field1344 + 180 - 9, var149, 16776960, 0);
                int var87 = field1344 + 180 - 9 + arg0.method4541(class237.field2971) + 15;
                int var88 = var149 - arg0.field3722;
                class298 var89;
                if (field1368) {
                    var89 = Statics.field12;
                } else {
                    var89 = Statics.field813;
                }
                var89.method4830(var87, var88);
                var149 += 15;
                int var90 = field1344 + 180 - 80;
                short var91 = 321;
                Statics.field3745.method4830(var90 - 73, var91 - 20);
                arg0.method4549(class237.field3191, var90, var91 + 5, 16777215, 0);
                int var92 = field1344 + 180 + 80;
                Statics.field3745.method4830(var92 - 73, var91 - 20);
                arg0.method4549(class237.field3063, var92, var91 + 5, 16777215, 0);
                arg1.method4549(class237.field3021, field1344 + 180, var91 + 36, 255, 0);
            } else if (field1355 == 5) {
                arg0.method4549(class237.field3033, field1344 + 180, 201, 16776960, 0);
                short var93 = 221;
                arg2.method4549(field1357, field1344 + 180, var93, 16776960, 0);
                int var152 = var93 + 15;
                arg2.method4549(field1359, field1344 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                arg2.method4549(field1365, field1344 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                int var155 = var154 + 14;
                arg0.method4546(class237.field3211, field1344 + 180 - 145, var155, 16777215, 0);
                short var94 = 174;
                String var95;
                for (var95 = method544(); arg0.method4541(var95) > var94; var95 = var95.substring(1)) {
                }
                arg0.method4546(class276.method4581(var95) + (client.field883 % 40 < 20 ? class88.method683(16776960) + class88.field1313 : ""), field1344 + 180 - 34, var155, 16777215, 0);
                var152 = var155 + 15;
                int var96 = field1344 + 180 - 80;
                short var97 = 321;
                Statics.field3745.method4830(var96 - 73, var97 - 20);
                arg0.method4549(class237.field3212, var96, var97 + 5, 16777215, 0);
                int var98 = field1344 + 180 + 80;
                Statics.field3745.method4830(var98 - 73, var97 - 20);
                arg0.method4549(class237.field3065, var98, var97 + 5, 16777215, 0);
            } else if (field1355 == 6) {
                short var99 = 201;
                arg0.method4549(field1357, field1344 + 180, var99, 16776960, 0);
                int var156 = var99 + 15;
                arg0.method4549(field1359, field1344 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                arg0.method4549(field1365, field1344 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                int var100 = field1344 + 180;
                short var101 = 321;
                Statics.field3745.method4830(var100 - 73, var101 - 20);
                arg0.method4549(class237.field3065, var100, var101 + 5, 16777215, 0);
            }
        }
        if (field1367 > 0) {
            int var102 = field1367;
            short var103 = 256;
            field1349 += var102 * 128;
            if (field1349 > Statics.field1959.length) {
                field1349 -= Statics.field1959.length;
                int var104 = (int) (Math.random() * 12.0D);
                method464(Statics.field1339[var104]);
            }
            int var105 = 0;
            int var106 = var102 * 128;
            int var107 = (var103 - var102) * 128;
            for (int var108 = 0; var108 < var107; var108++) {
                int var109 = Statics.field283[var105 + var106] - Statics.field1959[field1349 + var105 & Statics.field1959.length - 1] * var102 / 6;
                if (var109 < 0) {
                    var109 = 0;
                }
                Statics.field283[var105++] = var109;
            }
            for (int var110 = var103 - var102; var110 < var103; var110++) {
                int var111 = var110 * 128;
                for (int var112 = 0; var112 < 128; var112++) {
                    int var113 = (int) (Math.random() * 100.0D);
                    if (var113 < 50 && var112 > 10 && var112 < 118) {
                        Statics.field283[var111 + var112] = 255;
                    } else {
                        Statics.field283[var111 + var112] = 0;
                    }
                }
            }
            if (field1347 > 0) {
                field1347 -= var102 * 4;
            }
            if (field1351 > 0) {
                field1351 -= var102 * 4;
            }
            if (field1347 == 0 && field1351 == 0) {
                int var114 = (int) (Math.random() * (double) (2000 / var102));
                if (var114 == 0) {
                    field1347 = 1024;
                }
                if (var114 == 1) {
                    field1351 = 1024;
                }
            }
            for (int var115 = 0; var115 < var103 - var102; var115++) {
                field1353[var115] = field1353[var102 + var115];
            }
            for (int var116 = var103 - var102; var116 < var103; var116++) {
                field1353[var116] = (int) (Math.sin((double) field1352 / 14.0D) * 16.0D + Math.sin((double) field1352 / 15.0D) * 14.0D + Math.sin((double) field1352 / 16.0D) * 12.0D);
                field1352++;
            }
            field1354 += var102 * -2037119975;
            int var117 = ((client.field883 & 0x1) + var102) / 2;
            if (var117 > 0) {
                for (int var118 = 0; var118 < field1354 * 934113284; var118++) {
                    int var119 = (int) (Math.random() * 124.0D) + 2;
                    int var120 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field283[(var120 << 7) + var119] = 192;
                }
                field1354 = 0;
                int var121 = 0;
                label427: while (true) {
                    if (var121 >= var103) {
                        int var125 = 0;
                        while (true) {
                            if (var125 >= 128) {
                                break label427;
                            }
                            int var126 = 0;
                            for (int var127 = -var117; var127 < var103; var127++) {
                                int var128 = var127 * 128;
                                if (var117 + var127 < var103) {
                                    var126 += Statics.field1572[var117 * 128 + var125 + var128];
                                }
                                if (var127 - (var117 + 1) >= 0) {
                                    var126 -= Statics.field1572[var125 + var128 - (var117 + 1) * 128];
                                }
                                if (var127 >= 0) {
                                    Statics.field283[var125 + var128] = var126 / (var117 * 2 + 1);
                                }
                            }
                            var125++;
                        }
                    }
                    int var122 = 0;
                    int var123 = var121 * 128;
                    for (int var124 = -var117; var124 < 128; var124++) {
                        if (var117 + var124 < 128) {
                            var122 += Statics.field283[var123 + var124 + var117];
                        }
                        if (var124 - (var117 + 1) >= 0) {
                            var122 -= Statics.field283[var123 + var124 - (var117 + 1)];
                        }
                        if (var124 >= 0) {
                            Statics.field1572[var123 + var124] = var122 / (var117 * 2 + 1);
                        }
                    }
                    var121++;
                }
            }
            field1367 = 0;
        }
        method1013();
        Statics.field758[Statics.field2727.field1236 ? 1 : 0].method4830(field1337 + 765 - 40, 463);
        if (client.field880 <= 5 || client.field972 != 0) {
            return;
        }
        if (Statics.field551 == null) {
            Statics.field551 = class300.method3770(Statics.field2027, "sl_button", "");
            return;
        }
        int var129 = field1337 + 5;
        short var130 = 463;
        byte var131 = 100;
        byte var132 = 35;
        Statics.field551.method4830(var129, var130);
        arg0.method4549(class237.field3011 + " " + client.field874, var131 / 2 + var129, var132 / 2 + var130 - 2, 16777215, 0);
        if (Statics.field490 == null) {
            arg1.method4549(class237.field3183, var131 / 2 + var129, var132 / 2 + var130 + 12, 16777215, 0);
        } else {
            arg1.method4549(class237.field3244, var131 / 2 + var129, var132 / 2 + var130 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("br.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1073(String arg0, String arg1, String arg2) {
        field1357 = arg0;
        field1359 = arg1;
        field1365 = arg2;
    }

    @ObfuscatedName("ah.t(Lkm;I)V")
    public static final void method464(class298 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1959.length; var2++) {
            Statics.field1959[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1959[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field834[var8] = (Statics.field1959[var8 - 1] + Statics.field1959[var8 + 1] + Statics.field1959[var8 - 128] + Statics.field1959[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1959;
            Statics.field1959 = Statics.field834;
            Statics.field834 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3851; var11++) {
            for (int var12 = 0; var12 < arg0.field3855; var12++) {
                if (arg0.field3853[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3852;
                    int var14 = var11 + 16 + arg0.field3849;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1959[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("x.o(IIII)I")
    public static final int method143(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bn.a(I)V")
    public static final void method1013() {
        short var0 = 256;
        if (field1347 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1347 > 768) {
                    Statics.field516[var1] = method143(Statics.field778[var1], Statics.field297[var1], 1024 - field1347);
                } else if (field1347 > 256) {
                    Statics.field516[var1] = Statics.field297[var1];
                } else {
                    Statics.field516[var1] = method143(Statics.field297[var1], Statics.field778[var1], 256 - field1347);
                }
            }
        } else if (field1351 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1351 > 768) {
                    Statics.field516[var2] = method143(Statics.field778[var2], Statics.field452[var2], 1024 - field1351);
                } else if (field1351 > 256) {
                    Statics.field516[var2] = Statics.field452[var2];
                } else {
                    Statics.field516[var2] = method143(Statics.field452[var2], Statics.field778[var2], 256 - field1351);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field516[var3] = Statics.field778[var3];
            }
        }
        class295.method4810(field1337, 9, field1337 + 128, var0 + 7);
        Statics.field1340.method4864(field1337, 0);
        class295.method4756();
        int var4 = 0;
        int var5 = field1337 + Statics.field475.field3839 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1353[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field283[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field516[var10];
                    int var14 = Statics.field475.field3838[var5];
                    Statics.field475.field3838[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field475.field3839 + var8 - 128;
        }
        class295.method4810(field1337 + 765 - 128, 9, field1337 + 765, var0 + 7);
        Statics.field270.method4864(field1337 + 382, 0);
        class295.method4756();
        int var15 = 0;
        int var16 = field1337 + Statics.field475.field3839 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1353[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field283[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field516[var22];
                    int var26 = Statics.field475.field3838[var20];
                    Statics.field475.field3838[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field475.field3839 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("f.i(Lbd;B)V")
    public static void method40(class59 arg0) {
        if (class60.field711 != 1 && Statics.field565 || class60.field711 != 4) {
            return;
        }
        int var1 = field1337 + 280;
        if (class60.field710 >= var1 && class60.field710 <= var1 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(0, 0);
            return;
        }
        if (class60.field710 >= var1 + 15 && class60.field710 <= var1 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(0, 1);
            return;
        }
        int var2 = field1337 + 390;
        if (class60.field710 >= var2 && class60.field710 <= var2 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(1, 0);
            return;
        }
        if (class60.field710 >= var2 + 15 && class60.field710 <= var2 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(1, 1);
            return;
        }
        int var3 = field1337 + 500;
        if (class60.field710 >= var3 && class60.field710 <= var3 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(2, 0);
            return;
        }
        if (class60.field710 >= var3 + 15 && class60.field710 <= var3 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(2, 1);
            return;
        }
        int var4 = field1337 + 610;
        if (class60.field710 >= var4 && class60.field710 <= var4 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(3, 0);
            return;
        }
        if (class60.field710 >= var4 + 15 && class60.field710 <= var4 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
            class80.method4(3, 1);
            return;
        }
        if (class60.field710 >= field1337 + 708 && class60.field714 >= 4 && class60.field710 <= field1337 + 708 + 50 && class60.field714 <= 20) {
            field1369 = false;
            Statics.field1340.method4864(field1337, 0);
            Statics.field270.method4864(field1337 + 382, 0);
            Statics.field1341.method4830(field1337 + 382 - Statics.field1341.field3855 / 2, 18);
            return;
        }
        if (field1350 == -1) {
            return;
        }
        class80 var5 = Statics.field1221[field1350];
        method1605(var5);
        field1369 = false;
        Statics.field1340.method4864(field1337, 0);
        Statics.field270.method4864(field1337 + 382, 0);
        Statics.field1341.method4830(field1337 + 382 - Statics.field1341.field3855 / 2, 18);
        return;
    }

    @ObfuscatedName("cr.m(Lch;I)V")
    public static void method1605(class80 arg0) {
        if (arg0.method1464() != client.field875) {
            client.field875 = arg0.method1464();
            boolean var1 = arg0.method1464();
            if (Statics.field3577 != var1) {
                class268.method2710();
                Statics.field3577 = var1;
            }
        }
        Statics.field2188 = arg0.field1229;
        client.field874 = arg0.field1226;
        client.field1126 = arg0.field1220;
        Statics.field2046 = client.field995 == 0 ? 43594 : arg0.field1226 + 40000;
        Statics.field2111 = client.field995 == 0 ? 443 : arg0.field1226 + 50000;
        Statics.field2481 = Statics.field2046;
    }

    @ObfuscatedName("cx.x(I)V")
    public static void method1588() {
        if (class80.method454()) {
            field1369 = true;
        }
    }
}
