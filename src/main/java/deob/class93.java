package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("ct")
public class class93 {

    @ObfuscatedName("ct.m")
    public static int field1415 = 0;

    @ObfuscatedName("ct.v")
    public static int field1422 = field1415 + 202;

    @ObfuscatedName("ct.k")
    public static int[] field1442 = new int[256];

    @ObfuscatedName("ct.x")
    public static int field1443 = 0;

    @ObfuscatedName("ct.b")
    public static int field1425 = 0;

    @ObfuscatedName("ct.af")
    public static int field1426 = 0;

    @ObfuscatedName("ct.ae")
    public static int field1427 = 0;

    @ObfuscatedName("ct.ap")
    public static int field1428 = 0;

    @ObfuscatedName("ct.ak")
    public static int field1429 = 0;

    @ObfuscatedName("ct.al")
    public static int field1430 = 10;

    @ObfuscatedName("ct.ab")
    public static String field1447 = "";

    @ObfuscatedName("ct.am")
    public static int field1432 = 0;

    @ObfuscatedName("ct.ar")
    public static String field1445 = "";

    @ObfuscatedName("ct.ao")
    public static String field1434 = "";

    @ObfuscatedName("ct.ac")
    public static String field1433 = "";

    @ObfuscatedName("ct.aa")
    public static String field1436 = "";

    @ObfuscatedName("ct.ay")
    public static String field1437 = "";

    @ObfuscatedName("ct.aj")
    public static String field1438 = "";

    @ObfuscatedName("ct.ag")
    public static class150 field1439 = class150.field2207;

    @ObfuscatedName("ct.an")
    public static boolean field1431 = true;

    @ObfuscatedName("ct.az")
    public static int field1441 = 0;

    @ObfuscatedName("ct.ai")
    public static String field1414 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ct.aw")
    public static String field1435 = "1234567890";

    @ObfuscatedName("ct.ah")
    public static boolean field1444 = false;

    @ObfuscatedName("ct.bv")
    public static int field1446 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.p(Lil;Lil;S)I")
    public static int method160(class236 arg0, class236 arg1) {
        int var2 = 0;
        if (arg0.method3735("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3735("logo", "")) {
            var2++;
        }
        if (arg1.method3735("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3735("titlebox", "")) {
            var2++;
        }
        if (arg1.method3735("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3735("runes", "")) {
            var2++;
        }
        if (arg1.method3735("title_mute", "")) {
            var2++;
        }
        if (arg1.method3735("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3735("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3735("sl_back", "");
        arg1.method3735("sl_flags", "");
        arg1.method3735("sl_arrows", "");
        arg1.method3735("sl_stars", "");
        arg1.method3735("sl_button", "");
        return var2;
    }

    @ObfuscatedName("af.m(I)I")
    public static int method216() {
        return 9;
    }

    @ObfuscatedName("ds.e(Lil;Lil;ZII)V")
    public static void method2088(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1423) {
            field1432 = arg3;
            class282.method4511();
            byte[] var4 = arg0.method3723("title.jpg", "");
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
                } catch (IOException var29) {
                } catch (InterruptedException var30) {
                }
                var11 = new class286(0, 0);
            }
            Statics.field520 = var11;
            Statics.field1420 = Statics.field520.method4601();
            if ((client.field903 & 0x20000000) == 0) {
                Statics.field1417 = class287.method4473(arg1, "logo", "");
            } else {
                Statics.field1417 = class287.method4473(arg1, "logo_deadman_mode", "");
            }
            Statics.field1416 = class287.method4473(arg1, "titlebox", "");
            Statics.field1448 = class287.method4473(arg1, "titlebutton", "");
            Statics.field504 = Statics.method964(arg1, "runes", "");
            Statics.field1424 = Statics.method964(arg1, "title_mute", "");
            Statics.field352 = class287.method4473(arg1, "options_radio_buttons,0", "");
            Statics.field2056 = class287.method4473(arg1, "options_radio_buttons,2", "");
            Statics.field630 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field630[var14] = var14 * 262144;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field630[var15 + 64] = var15 * 1024 + 16711680;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field630[var16 + 128] = var16 * 4 + 16776960;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field630[var17 + 192] = 16777215;
            }
            Statics.field584 = new int[256];
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field584[var18] = var18 * 1024;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field584[var19 + 64] = var19 * 4 + 65280;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field584[var20 + 128] = var20 * 262144 + 65535;
            }
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field584[var21 + 192] = 16777215;
            }
            Statics.field898 = new int[256];
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field898[var22] = var22 * 4;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field898[var23 + 64] = var23 * 262144 + 255;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field898[var24 + 128] = var24 * 1024 + 16711935;
            }
            for (int var25 = 0; var25 < 64; var25++) {
                Statics.field898[var25 + 192] = 16777215;
            }
            Statics.field3737 = new int[256];
            Statics.field297 = new int[32768];
            Statics.field1537 = new int[32768];
            method2581((class285) null);
            Statics.field269 = new int[32768];
            Statics.field2361 = new int[32768];
            if (arg2) {
                field1437 = "";
                field1438 = "";
            }
            Statics.field1290 = 0;
            Statics.field1313 = "";
            field1431 = true;
            field1444 = false;
            if (Statics.field1482.field1301) {
                class204.field2518 = 1;
                Statics.field2519 = null;
                Statics.field2520 = -1;
                Statics.field439 = -1;
                Statics.field2456 = 0;
                Statics.field1385 = false;
                Statics.field2305 = 2;
            } else {
                class238 var26 = Statics.field2149;
                int var27 = var26.method3764("scape main");
                int var28 = var26.method3729(var27, "");
                class204.field2518 = 1;
                Statics.field2519 = var26;
                Statics.field2520 = var27;
                Statics.field439 = var28;
                Statics.field2456 = 255;
                Statics.field1385 = false;
                Statics.field2305 = 2;
            }
            class239.method2779(false);
            Statics.field1423 = true;
            field1415 = (Statics.field264 - 765) / 2;
            field1422 = field1415 + 202;
            Statics.field520.method4620(field1415, 0);
            Statics.field1420.method4620(field1415 + 382, 0);
            Statics.field1417.method4594(field1415 + 382 - Statics.field1417.field3774 / 2, 18);
        } else if (arg3 == 4) {
            field1432 = 4;
        }
    }

    @ObfuscatedName("jv.w(S)V")
    public static void method4474() {
        field1437 = field1437.trim();
        if (field1437.length() == 0) {
            method619(class226.field3113, class226.field3114, class226.field2928);
            return;
        }
        long var0 = class88.method1832();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class88.method3802(var0, field1437);
        }
        switch(var2) {
            case 2:
                method619(class226.field3116, class226.field3117, class226.field2877);
                field1432 = 6;
                break;
            case 3:
                method619(class226.field3119, class226.field3120, class226.field3121);
                break;
            case 4:
                method619(class226.field3122, class226.field3123, class226.field3124);
                break;
            case 5:
                method619(class226.field3125, class226.field3126, class226.field2906);
                break;
            case 6:
                method619(class226.field2867, class226.field3056, class226.field3130);
                break;
            case 7:
                method619(class226.field3131, class226.field3042, class226.field3129);
        }
    }

    @ObfuscatedName("ab.z(Ljb;Ljb;Ljb;ZB)V")
    public static void method325(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1415 = (Statics.field264 - 765) / 2;
            field1422 = field1415 + 202;
        }
        if (field1444) {
            if (Statics.field3189 == null) {
                Statics.field3189 = class287.method2607(Statics.field403, "sl_back", "");
            }
            if (Statics.field1419 == null) {
                Statics.field1419 = Statics.method964(Statics.field403, "sl_flags", "");
            }
            if (Statics.field614 == null) {
                Statics.field614 = Statics.method964(Statics.field403, "sl_arrows", "");
            }
            if (Statics.field472 == null) {
                Statics.field472 = Statics.method964(Statics.field403, "sl_stars", "");
            }
            class282.method4510(field1415, 23, 765, 480, 0);
            class282.method4514(field1415, 0, 125, 23, 12425273, 9135624);
            class282.method4514(field1415 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4327(class226.field3134, field1415 + 62, 15, 0, -1);
            if (Statics.field472 != null) {
                Statics.field472[1].method4594(field1415 + 140, 1);
                arg1.method4338(class226.field3135, field1415 + 152, 10, 16777215, -1);
                Statics.field472[0].method4594(field1415 + 140, 12);
                arg1.method4338(class226.field3136, field1415 + 152, 21, 16777215, -1);
            }
            if (Statics.field614 != null) {
                int var4 = field1415 + 280;
                if (class81.field1285[0] == 0 && class81.field1284[0] == 0) {
                    Statics.field614[2].method4594(var4, 4);
                } else {
                    Statics.field614[0].method4594(var4, 4);
                }
                if (class81.field1285[0] == 0 && class81.field1284[0] == 1) {
                    Statics.field614[3].method4594(var4 + 15, 4);
                } else {
                    Statics.field614[1].method4594(var4 + 15, 4);
                }
                arg0.method4338(class226.field2864, var4 + 32, 17, 16777215, -1);
                int var5 = field1415 + 390;
                if (class81.field1285[0] == 1 && class81.field1284[0] == 0) {
                    Statics.field614[2].method4594(var5, 4);
                } else {
                    Statics.field614[0].method4594(var5, 4);
                }
                if (class81.field1285[0] == 1 && class81.field1284[0] == 1) {
                    Statics.field614[3].method4594(var5 + 15, 4);
                } else {
                    Statics.field614[1].method4594(var5 + 15, 4);
                }
                arg0.method4338(class226.field3138, var5 + 32, 17, 16777215, -1);
                int var6 = field1415 + 500;
                if (class81.field1285[0] == 2 && class81.field1284[0] == 0) {
                    Statics.field614[2].method4594(var6, 4);
                } else {
                    Statics.field614[0].method4594(var6, 4);
                }
                if (class81.field1285[0] == 2 && class81.field1284[0] == 1) {
                    Statics.field614[3].method4594(var6 + 15, 4);
                } else {
                    Statics.field614[1].method4594(var6 + 15, 4);
                }
                arg0.method4338(class226.field3139, var6 + 32, 17, 16777215, -1);
                int var7 = field1415 + 610;
                if (class81.field1285[0] == 3 && class81.field1284[0] == 0) {
                    Statics.field614[2].method4594(var7, 4);
                } else {
                    Statics.field614[0].method4594(var7, 4);
                }
                if (class81.field1285[0] == 3 && class81.field1284[0] == 1) {
                    Statics.field614[3].method4594(var7 + 15, 4);
                } else {
                    Statics.field614[1].method4594(var7 + 15, 4);
                }
                arg0.method4338(class226.field2878, var7 + 32, 17, 16777215, -1);
            }
            class282.method4510(field1415 + 708, 4, 50, 16, 0);
            arg1.method4327(class226.field3110, field1415 + 708 + 25, 16, 16777215, -1);
            field1446 = -1;
            if (Statics.field3189 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1282) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1282) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1282) {
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
                int var19 = field1415 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1282; var22++) {
                    class81 var23 = Statics.field1281[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1287);
                    if (var23.field1287 == -1) {
                        var25 = class226.field3141;
                        var24 = false;
                    } else if (var23.field1287 > 1980) {
                        var25 = class226.field3142;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1372()) {
                        if (var23.method1367()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1371()) {
                        var26 = 16711680;
                        if (var23.method1367()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1375()) {
                        if (var23.method1367()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1367()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field731 >= var19 && class60.field732 * -417192073 >= var18 && class60.field731 < var8 + var19 && class60.field732 * -417192073 < var9 + var18 && var24) {
                        field1446 = var22;
                        Statics.field3189[var27].method4615(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field3189[var27].method4620(var19, var18);
                    }
                    if (Statics.field1419 != null) {
                        Statics.field1419[(var23.method1367() ? 8 : 0) + var23.field1292].method4594(var19 + 29, var18);
                    }
                    arg0.method4327(Integer.toString(var23.field1278), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4327(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4381(Statics.field1281[field1446].field1291) + 6;
                    int var29 = arg1.field3644 + 8;
                    class282.method4510(class60.field731 - var28 / 2, class60.field732 * -417192073 + 20 + 5, var28, var29, 16777120);
                    class282.method4572(class60.field731 - var28 / 2, class60.field732 * -417192073 + 20 + 5, var28, var29, 0);
                    arg1.method4327(Statics.field1281[field1446].field1291, class60.field731, class60.field732 * -417192073 + 20 + 5 + arg1.field3644 + 4, 0, -1);
                }
            }
            Statics.field1297.method708(0, 0);
            return;
        }
        if (arg3) {
            Statics.field520.method4620(field1415, 0);
            Statics.field1420.method4620(field1415 + 382, 0);
            Statics.field1417.method4594(field1415 + 382 - Statics.field1417.field3774 / 2, 18);
        }
        if (client.field910 == 0 || client.field910 == 5) {
            byte var30 = 20;
            arg0.method4327(class226.field3073, field1422 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class282.method4572(field1422 + 180 - 152, var31, 304, 34, 9179409);
            class282.method4572(field1422 + 180 - 151, var31 + 1, 302, 32, 0);
            class282.method4510(field1422 + 180 - 150, var31 + 2, field1430 * 3, 30, 9179409);
            class282.method4510(field1430 * 3 + (field1422 + 180 - 150), var31 + 2, 300 - field1430 * 3, 30, 0);
            arg0.method4327(field1447, field1422 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field910 == 20) {
            Statics.field1416.method4594(field1422 + 180 - Statics.field1416.field3774 / 2, 271 - Statics.field1416.field3775 / 2);
            short var32 = 211;
            arg0.method4327(field1434, field1422 + 180, var32, 16776960, 0);
            int var102 = var32 + 15;
            arg0.method4327(field1433, field1422 + 180, var102, 16776960, 0);
            int var103 = var102 + 15;
            arg0.method4327(field1436, field1422 + 180, var103, 16776960, 0);
            int var104 = var103 + 15;
            int var105 = var104 + 10;
            if (field1432 != 4) {
                arg0.method4338(class226.field3095, field1422 + 180 - 110, var105, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1437; arg0.method4381(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4338(class265.method4323(var34), field1422 + 180 - 70, var105, 16777215, 0);
                var102 = var105 + 15;
                arg0.method4338(class226.field2920 + class271.method973(field1438), field1422 + 180 - 108, var102, 16777215, 0);
                var102 += 15;
            }
        }
        if (client.field910 == 10 || client.field910 == 11) {
            Statics.field1416.method4594(field1422, 171);
            if (field1432 == 0) {
                short var35 = 251;
                arg0.method4327(class226.field2868, field1422 + 180, var35, 16776960, 0);
                int var106 = var35 + 30;
                int var36 = field1422 + 180 - 80;
                short var37 = 291;
                Statics.field1448.method4594(var36 - 73, var37 - 20);
                arg0.method4328(class226.field3099, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1422 + 180 + 80;
                Statics.field1448.method4594(var38 - 73, var37 - 20);
                arg0.method4328(class226.field2937, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1432 == 1) {
                arg0.method4327(field1445, field1422 + 180, 211, 16776960, 0);
                short var39 = 236;
                arg0.method4327(field1434, field1422 + 180, var39, 16777215, 0);
                int var107 = var39 + 15;
                arg0.method4327(field1433, field1422 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method4327(field1436, field1422 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                int var40 = field1422 + 180 - 80;
                short var41 = 321;
                Statics.field1448.method4594(var40 - 73, var41 - 20);
                arg0.method4327(class226.field3000, var40, var41 + 5, 16777215, 0);
                int var42 = field1422 + 180 + 80;
                Statics.field1448.method4594(var42 - 73, var41 - 20);
                arg0.method4327(class226.field3110, var42, var41 + 5, 16777215, 0);
            } else if (field1432 == 2) {
                short var43 = 211;
                arg0.method4327(field1434, field1422 + 180, var43, 16776960, 0);
                int var110 = var43 + 15;
                arg0.method4327(field1433, field1422 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method4327(field1436, field1422 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var113 = var112 + 10;
                arg0.method4338(class226.field3095, field1422 + 180 - 110, var113, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = field1437; arg0.method4381(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4338(class265.method4323(var45) + (field1441 == 0 & client.field960 % 40 < 20 ? class89.method96(16776960) + class89.field1380 : ""), field1422 + 180 - 70, var113, 16777215, 0);
                var110 = var113 + 15;
                arg0.method4338(class226.field2920 + class271.method973(field1438) + (field1441 == 1 & client.field960 % 40 < 20 ? class89.method96(16776960) + class89.field1380 : ""), field1422 + 180 - 108, var110, 16777215, 0);
                var110 += 15;
                int var46 = field1422 + 180 - 80;
                short var47 = 321;
                Statics.field1448.method4594(var46 - 73, var47 - 20);
                arg0.method4327(class226.field3101, var46, var47 + 5, 16777215, 0);
                int var48 = field1422 + 180 + 80;
                Statics.field1448.method4594(var48 - 73, var47 - 20);
                arg0.method4327(class226.field3110, var48, var47 + 5, 16777215, 0);
                short var49 = 357;
                arg1.method4327(class226.field3108, field1422 + 180, var49, 16776960, 0);
            } else if (field1432 == 3) {
                short var50 = 201;
                arg0.method4327(class226.field3103, field1422 + 180, var50, 16776960, 0);
                int var114 = var50 + 20;
                arg1.method4327(class226.field3104, field1422 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg1.method4327(class226.field3105, field1422 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var51 = field1422 + 180;
                short var52 = 276;
                Statics.field1448.method4594(var51 - 73, var52 - 20);
                arg2.method4327(class226.field3106, var51, var52 + 5, 16777215, 0);
                int var53 = field1422 + 180;
                short var54 = 326;
                Statics.field1448.method4594(var53 - 73, var54 - 20);
                arg2.method4327(class226.field2988, var53, var54 + 5, 16777215, 0);
            } else if (field1432 == 4) {
                arg0.method4327(class226.field3054, field1422 + 180, 211, 16776960, 0);
                short var55 = 236;
                arg0.method4327(field1434, field1422 + 180, var55, 16777215, 0);
                int var117 = var55 + 15;
                arg0.method4327(field1433, field1422 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method4327(field1436, field1422 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method4338(class226.field3041 + class271.method973(Statics.field1313) + (client.field960 % 40 < 20 ? class89.method96(16776960) + class89.field1380 : ""), field1422 + 180 - 108, var119, 16777215, 0);
                int var120 = var119 - 8;
                arg0.method4338(class226.field2871, field1422 + 180 - 9, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg0.method4338(class226.field2927, field1422 + 180 - 9, var121, 16776960, 0);
                int var56 = field1422 + 180 - 9 + arg0.method4381(class226.field2927) + 15;
                int var57 = var121 - arg0.field3644;
                class285 var58;
                if (field1431) {
                    var58 = Statics.field2056;
                } else {
                    var58 = Statics.field352;
                }
                var58.method4594(var56, var57);
                var117 = var121 + 15;
                int var59 = field1422 + 180 - 80;
                short var60 = 321;
                Statics.field1448.method4594(var59 - 73, var60 - 20);
                arg0.method4327(class226.field3000, var59, var60 + 5, 16777215, 0);
                int var61 = field1422 + 180 + 80;
                Statics.field1448.method4594(var61 - 73, var60 - 20);
                arg0.method4327(class226.field3110, var61, var60 + 5, 16777215, 0);
                arg1.method4327(class226.field3100, field1422 + 180, var60 + 36, 255, 0);
            } else if (field1432 == 5) {
                arg0.method4327(class226.field3109, field1422 + 180, 201, 16776960, 0);
                short var62 = 221;
                arg2.method4327(field1434, field1422 + 180, var62, 16776960, 0);
                int var122 = var62 + 15;
                arg2.method4327(field1433, field1422 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg2.method4327(field1436, field1422 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 14;
                arg0.method4338(class226.field2918, field1422 + 180 - 145, var125, 16777215, 0);
                short var63 = 174;
                String var64;
                for (var64 = field1437; arg0.method4381(var64) > var63; var64 = var64.substring(1)) {
                }
                arg0.method4338(class265.method4323(var64) + (client.field960 % 40 < 20 ? class89.method96(16776960) + class89.field1380 : ""), field1422 + 180 - 34, var125, 16777215, 0);
                var122 = var125 + 15;
                int var65 = field1422 + 180 - 80;
                short var66 = 321;
                Statics.field1448.method4594(var65 - 73, var66 - 20);
                arg0.method4327(class226.field3111, var65, var66 + 5, 16777215, 0);
                int var67 = field1422 + 180 + 80;
                Statics.field1448.method4594(var67 - 73, var66 - 20);
                arg0.method4327(class226.field3118, var67, var66 + 5, 16777215, 0);
            } else if (field1432 == 6) {
                short var68 = 211;
                arg0.method4327(field1434, field1422 + 180, var68, 16776960, 0);
                int var126 = var68 + 15;
                arg0.method4327(field1433, field1422 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg0.method4327(field1436, field1422 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var69 = field1422 + 180;
                short var70 = 321;
                Statics.field1448.method4594(var69 - 73, var70 - 20);
                arg0.method4327(class226.field3118, var69, var70 + 5, 16777215, 0);
            }
        }
        if (field1428 > 0) {
            method861(field1428);
            field1428 = 0;
        }
        short var71 = 256;
        if (field1443 > 0) {
            for (int var72 = 0; var72 < 256; var72++) {
                if (field1443 > 768) {
                    Statics.field3737[var72] = Statics.method4895(Statics.field630[var72], Statics.field584[var72], 1024 - field1443);
                } else if (field1443 > 256) {
                    Statics.field3737[var72] = Statics.field584[var72];
                } else {
                    Statics.field3737[var72] = Statics.method4895(Statics.field584[var72], Statics.field630[var72], 256 - field1443);
                }
            }
        } else if (field1425 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field1425 > 768) {
                    Statics.field3737[var73] = Statics.method4895(Statics.field630[var73], Statics.field898[var73], 1024 - field1425);
                } else if (field1425 > 256) {
                    Statics.field3737[var73] = Statics.field898[var73];
                } else {
                    Statics.field3737[var73] = Statics.method4895(Statics.field898[var73], Statics.field630[var73], 256 - field1425);
                }
            }
        } else {
            for (int var74 = 0; var74 < 256; var74++) {
                Statics.field3737[var74] = Statics.field630[var74];
            }
        }
        class282.method4517(field1415, 9, field1415 + 128, var71 + 7);
        Statics.field520.method4620(field1415, 0);
        class282.method4564();
        int var75 = 0;
        int var76 = field1415 + Statics.field1297.field3761 * 9;
        for (int var77 = 1; var77 < var71 - 1; var77++) {
            int var78 = (var71 - var77) * field1442[var77] / var71;
            int var79 = var78 + 22;
            if (var79 < 0) {
                var79 = 0;
            }
            var75 += var79;
            for (int var80 = var79; var80 < 128; var80++) {
                int var81 = Statics.field269[var75++];
                if (var81 == 0) {
                    var76++;
                } else {
                    int var83 = 256 - var81;
                    int var84 = Statics.field3737[var81];
                    int var85 = Statics.field1297.field3763[var76];
                    Statics.field1297.field3763[var76++] = ((var84 & 0xFF00FF) * var81 + (var85 & 0xFF00FF) * var83 & 0xFF00FF00) + ((var84 & 0xFF00) * var81 + (var85 & 0xFF00) * var83 & 0xFF0000) >> 8;
                }
            }
            var76 += Statics.field1297.field3761 + var79 - 128;
        }
        class282.method4517(field1415 + 765 - 128, 9, field1415 + 765, var71 + 7);
        Statics.field1420.method4620(field1415 + 382, 0);
        class282.method4564();
        int var86 = 0;
        int var87 = field1415 + Statics.field1297.field3761 * 9 + 24 + 637;
        for (int var88 = 1; var88 < var71 - 1; var88++) {
            int var89 = (var71 - var88) * field1442[var88] / var71;
            int var90 = 103 - var89;
            int var91 = var87 + var89;
            for (int var92 = 0; var92 < var90; var92++) {
                int var93 = Statics.field269[var86++];
                if (var93 == 0) {
                    var91++;
                } else {
                    int var95 = 256 - var93;
                    int var96 = Statics.field3737[var93];
                    int var97 = Statics.field1297.field3763[var91];
                    Statics.field1297.field3763[var91++] = ((var96 & 0xFF00FF) * var93 + (var97 & 0xFF00FF) * var95 & 0xFF00FF00) + ((var96 & 0xFF00) * var93 + (var97 & 0xFF00) * var95 & 0xFF0000) >> 8;
                }
            }
            var86 += 128 - var90;
            var87 = Statics.field1297.field3761 - var90 - var89 + var91;
        }
        Statics.field1424[Statics.field1482.field1301 ? 1 : 0].method4594(field1415 + 765 - 40, 463);
        if (client.field910 <= 5 || client.field1121 != 0) {
            return;
        }
        if (Statics.field2254 == null) {
            Statics.field2254 = class287.method4473(Statics.field403, "sl_button", "");
            return;
        }
        int var98 = field1415 + 5;
        short var99 = 463;
        byte var100 = 100;
        byte var101 = 35;
        Statics.field2254.method4594(var98, var99);
        arg0.method4327(class226.field2936 + " " + client.field902, var100 / 2 + var98, var101 / 2 + var99 - 2, 16777215, 0);
        if (Statics.field1283 == null) {
            arg1.method4327(class226.field3144, var100 / 2 + var98, var101 / 2 + var99 + 12, 16777215, 0);
        } else {
            arg1.method4327(class226.field3140, var100 / 2 + var98, var101 / 2 + var99 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("aw.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method619(String arg0, String arg1, String arg2) {
        field1434 = arg0;
        field1433 = arg1;
        field1436 = arg2;
    }

    @ObfuscatedName("el.c(Ljg;I)V")
    public static final void method2581(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field297.length; var2++) {
            Statics.field297[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field297[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1537[var8] = (Statics.field297[var8 - 1] + Statics.field297[var8 + 1] + Statics.field297[var8 - 128] + Statics.field297[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field297;
            Statics.field297 = Statics.field1537;
            Statics.field1537 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3775; var11++) {
            for (int var12 = 0; var12 < arg0.field3774; var12++) {
                if (arg0.field3772[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3776;
                    int var14 = var11 + 16 + arg0.field3777;
                    int var15 = (var14 << 7) + var13;
                    Statics.field297[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bp.o(IB)V")
    public static final void method861(int arg0) {
        short var1 = 256;
        field1426 += arg0 * 128;
        if (field1426 > Statics.field297.length) {
            field1426 -= Statics.field297.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2581(Statics.field504[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field269[var3 + var4] - Statics.field297[field1426 + var3 & Statics.field297.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field269[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field269[var9 + var10] = 255;
                } else {
                    Statics.field269[var9 + var10] = 0;
                }
            }
        }
        if (field1443 > 0) {
            field1443 -= arg0 * 4;
        }
        if (field1425 > 0) {
            field1425 -= arg0 * 4;
        }
        if (field1443 == 0 && field1425 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1443 = 1024;
            }
            if (var12 == 1) {
                field1425 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1442[var13] = field1442[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1442[var14] = (int) (Math.sin((double) field1429 / 14.0D) * 16.0D + Math.sin((double) field1429 / 15.0D) * 14.0D + Math.sin((double) field1429 / 16.0D) * 12.0D);
            field1429++;
        }
        field1427 += arg0 * 396796293;
        int var15 = ((client.field960 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1427 * -2070250988; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field269[(var18 << 7) + var17] = 192;
        }
        field1427 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field269[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field269[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2361[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2361[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2361[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field269[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bf.n(Lbp;S)V")
    public static void method673(class59 arg0) {
        if (class60.field737 != 1 && Statics.field2846 || class60.field737 != 4) {
            return;
        }
        int var1 = field1415 + 280;
        if (class60.field738 >= var1 && class60.field738 <= var1 + 14 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(0, 0);
            return;
        }
        if (class60.field738 >= var1 + 15 && class60.field738 <= var1 + 80 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(0, 1);
            return;
        }
        int var2 = field1415 + 390;
        if (class60.field738 >= var2 && class60.field738 <= var2 + 14 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(1, 0);
            return;
        }
        if (class60.field738 >= var2 + 15 && class60.field738 <= var2 + 80 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(1, 1);
            return;
        }
        int var3 = field1415 + 500;
        if (class60.field738 >= var3 && class60.field738 <= var3 + 14 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(2, 0);
            return;
        }
        if (class60.field738 >= var3 + 15 && class60.field738 <= var3 + 80 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(2, 1);
            return;
        }
        int var4 = field1415 + 610;
        if (class60.field738 >= var4 && class60.field738 <= var4 + 14 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(3, 0);
            return;
        }
        if (class60.field738 >= var4 + 15 && class60.field738 <= var4 + 80 && class60.field733 >= 4 && class60.field733 <= 18) {
            class81.method3328(3, 1);
            return;
        }
        if (class60.field738 >= field1415 + 708 && class60.field733 >= 4 && class60.field738 <= field1415 + 708 + 50 && class60.field733 <= 20) {
            field1444 = false;
            Statics.field520.method4620(field1415, 0);
            Statics.field1420.method4620(field1415 + 382, 0);
            Statics.field1417.method4594(field1415 + 382 - Statics.field1417.field3774 / 2, 18);
            return;
        }
        if (field1446 == -1) {
            return;
        }
        class81 var5 = Statics.field1281[field1446];
        method7(var5);
        field1444 = false;
        Statics.field520.method4620(field1415, 0);
        Statics.field1420.method4620(field1415 + 382, 0);
        Statics.field1417.method4594(field1415 + 382 - Statics.field1417.field3774 / 2, 18);
        return;
    }

    @ObfuscatedName("e.a(Lch;B)V")
    public static void method7(class81 arg0) {
        if (arg0.method1367() != client.field906) {
            client.field906 = arg0.method1367();
            class257.method1569(arg0.method1367());
        }
        Statics.field554 = arg0.field1286;
        client.field902 = arg0.field1278;
        client.field903 = arg0.field1288;
        Statics.field611 = client.field1162 == 0 ? 43594 : arg0.field1278 + 40000;
        Statics.field1374 = client.field1162 == 0 ? 443 : arg0.field1278 + 50000;
        Statics.field2412 = Statics.field611;
    }

    @ObfuscatedName("cr.g(I)V")
    public static void method1556() {
        if (class81.method129()) {
            field1444 = true;
        }
    }
}
