package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ao")
public class class28 {

    @ObfuscatedName("ao.h")
    public static int[] field654 = new int[256];

    @ObfuscatedName("ao.o")
    public static int field655 = 0;

    @ObfuscatedName("ao.r")
    public static int field656 = 0;

    @ObfuscatedName("ao.av")
    public static int field657 = 0;

    @ObfuscatedName("ao.ao")
    public static int field675 = 0;

    @ObfuscatedName("ao.am")
    public static int field666 = 0;

    @ObfuscatedName("ao.ac")
    public static int field648 = 0;

    @ObfuscatedName("ao.ak")
    public static int field661 = 10;

    @ObfuscatedName("ao.ag")
    public static String field662 = "";

    @ObfuscatedName("ao.ap")
    public static int field663 = 0;

    @ObfuscatedName("ao.ah")
    public static String field658 = "";

    @ObfuscatedName("ao.an")
    public static String field665 = "";

    @ObfuscatedName("ao.ay")
    public static String field679 = "";

    @ObfuscatedName("ao.af")
    public static String field667 = "";

    @ObfuscatedName("ao.aq")
    public static String field668 = "";

    @ObfuscatedName("ao.aj")
    public static class144 field669 = class144.field2391;

    @ObfuscatedName("ao.ar")
    public static boolean field647 = true;

    @ObfuscatedName("ao.az")
    public static int field664 = 0;

    @ObfuscatedName("ao.au")
    public static String field672 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ao.ai")
    public static String field673 = "1234567890";

    @ObfuscatedName("ao.al")
    public static boolean field674 = false;

    @ObfuscatedName("ao.bb")
    public static int field670 = 0;

    @ObfuscatedName("ao.bl")
    public static int[] field653 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ao.bp")
    public static int[] field677 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ao.bw")
    public static int field678 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.e(Ljava/awt/Component;Les;Les;ZIB)V")
    public static void method1955(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field659) {
            field663 = arg4;
            class73.method1513();
            byte[] var5 = arg1.method2712("title.jpg", "");
            Statics.field1826 = new class72(var5, arg0);
            Statics.field1758 = Statics.field1826.method1410();
            Statics.field651 = class70.method1298(arg2, "logo", "");
            Statics.field671 = class70.method1298(arg2, "titlebox", "");
            Statics.field649 = class70.method1298(arg2, "titlebutton", "");
            Statics.field650 = class70.method517(arg2, "runes", "");
            Statics.field2022 = class70.method517(arg2, "title_mute", "");
            Statics.field544 = class70.method1298(arg2, "options_radio_buttons,0", "");
            Statics.field1047 = class70.method1298(arg2, "options_radio_buttons,2", "");
            Statics.field2403 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2403[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2403[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2403[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2403[var9 + 192] = 16777215;
            }
            Statics.field628 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field628[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field628[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field628[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field628[var13 + 192] = 16777215;
            }
            Statics.field1417 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1417[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1417[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1417[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1417[var17 + 192] = 16777215;
            }
            Statics.field152 = new int[256];
            Statics.field634 = new int[32768];
            Statics.field1765 = new int[32768];
            method806((class74) null);
            Statics.field1522 = new int[32768];
            Statics.field194 = new int[32768];
            if (arg3) {
                field667 = "";
                field668 = "";
            }
            Statics.field1973 = 0;
            Statics.field968 = "";
            field647 = true;
            field674 = false;
            if (Statics.field75.field146) {
                class161.method1875(2);
            } else {
                class161.method2046(2, Statics.field532, "scape main", "", 255, false);
            }
            class150.method556(false);
            Statics.field659 = true;
            Statics.field1826.method1421(0, 0);
            Statics.field1758.method1421(382, 0);
            Statics.field651.method1583(382 - Statics.field651.field1317 / 2, 18);
        } else if (arg4 == 4) {
            field663 = 4;
        }
    }

    @ObfuscatedName("dx.v(B)V")
    public static void method2511() {
        if (!Statics.field659) {
            return;
        }
        Statics.field671 = null;
        Statics.field649 = null;
        Statics.field650 = null;
        Statics.field1826 = null;
        Statics.field1758 = null;
        Statics.field651 = null;
        Statics.field2022 = null;
        Statics.field544 = null;
        Statics.field1047 = null;
        Statics.field2021 = null;
        Statics.field1654 = null;
        Statics.field2014 = null;
        Statics.field1007 = null;
        Statics.field16 = null;
        Statics.field2403 = null;
        Statics.field628 = null;
        Statics.field1417 = null;
        Statics.field152 = null;
        Statics.field634 = null;
        Statics.field1765 = null;
        Statics.field1522 = null;
        Statics.field194 = null;
        class161.method1875(2);
        class150.method556(true);
        Statics.field659 = false;
    }

    @ObfuscatedName("ap.g(Lgy;Lgy;B)V")
    public static void method591(class193 arg0, class193 arg1) {
        if (field674) {
            if (Statics.field2021 == null) {
                Statics.field2021 = class70.method455(Statics.field292, "sl_back", "");
            }
            if (Statics.field1654 == null) {
                Statics.field1654 = class70.method517(Statics.field292, "sl_flags", "");
            }
            if (Statics.field2014 == null) {
                Statics.field2014 = class70.method517(Statics.field292, "sl_arrows", "");
            }
            if (Statics.field1007 == null) {
                Statics.field1007 = class70.method517(Statics.field292, "sl_stars", "");
            }
            class73.method1515(0, 23, 765, 480, 0);
            class73.method1567(0, 0, 125, 23, 12425273, 9135624);
            class73.method1567(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3333(class142.field2371, 62, 15, 0, -1);
            if (Statics.field1007 != null) {
                Statics.field1007[1].method1583(140, 1);
                arg1.method3308(class142.field2298, 152, 10, 16777215, -1);
                Statics.field1007[0].method1583(140, 12);
                arg1.method3308(class142.field2373, 152, 21, 16777215, -1);
            }
            if (Statics.field2014 != null) {
                short var2 = 280;
                if (field653[0] == 0 && field677[0] == 0) {
                    Statics.field2014[2].method1583(var2, 4);
                } else {
                    Statics.field2014[0].method1583(var2, 4);
                }
                if (field653[0] == 0 && field677[0] == 1) {
                    Statics.field2014[3].method1583(var2 + 15, 4);
                } else {
                    Statics.field2014[1].method1583(var2 + 15, 4);
                }
                arg0.method3308(class142.field2374, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field653[0] == 1 && field677[0] == 0) {
                    Statics.field2014[2].method1583(var3, 4);
                } else {
                    Statics.field2014[0].method1583(var3, 4);
                }
                if (field653[0] == 1 && field677[0] == 1) {
                    Statics.field2014[3].method1583(var3 + 15, 4);
                } else {
                    Statics.field2014[1].method1583(var3 + 15, 4);
                }
                arg0.method3308(class142.field2375, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field653[0] == 2 && field677[0] == 0) {
                    Statics.field2014[2].method1583(var4, 4);
                } else {
                    Statics.field2014[0].method1583(var4, 4);
                }
                if (field653[0] == 2 && field677[0] == 1) {
                    Statics.field2014[3].method1583(var4 + 15, 4);
                } else {
                    Statics.field2014[1].method1583(var4 + 15, 4);
                }
                arg0.method3308(class142.field2320, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field653[0] == 3 && field677[0] == 0) {
                    Statics.field2014[2].method1583(var5, 4);
                } else {
                    Statics.field2014[0].method1583(var5, 4);
                }
                if (field653[0] == 3 && field677[0] == 1) {
                    Statics.field2014[3].method1583(var5 + 15, 4);
                } else {
                    Statics.field2014[1].method1583(var5 + 15, 4);
                }
                arg0.method3308(class142.field2175, var5 + 32, 17, 16777215, -1);
            }
            class73.method1515(708, 4, 50, 16, 0);
            arg1.method3333(class142.field2268, 733, 16, 16777215, -1);
            field678 = -1;
            if (Statics.field2021 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field670) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
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
                int var17 = var14;
                int var18 = 0;
                boolean var19 = false;
                for (int var20 = 0; var20 < field670; var20++) {
                    class22 var21 = Statics.field635[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field580);
                    if (var21.field580 == -1) {
                        var23 = class142.field2378;
                        var22 = false;
                    } else if (var21.field580 > 1980) {
                        var23 = class142.field2169;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method485()) {
                        if (var21.method492()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method492()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2007 >= var17 && class127.field1997 >= var16 && class127.field2007 < var6 + var17 && class127.field1997 < var7 + var16 && var22) {
                        field678 = var20;
                        Statics.field2021[var24].method1425(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field2021[var24].method1421(var17, var16);
                    }
                    if (Statics.field1654 != null) {
                        Statics.field1654[(var21.method492() ? 8 : 0) + var21.field583].method1583(var17 + 29, var16);
                    }
                    arg0.method3333(Integer.toString(var21.field589), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3333(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3322(Statics.field635[field678].field578) + 6;
                    int var26 = arg1.field2901 + 8;
                    class73.method1515(class127.field2007 - var25 / 2, class127.field1997 + 20 + 5, var25, var26, 16777120);
                    class73.method1517(class127.field2007 - var25 / 2, class127.field1997 + 20 + 5, var25, var26, 0);
                    arg1.method3333(Statics.field635[field678].field578, class127.field2007, class127.field1997 + 20 + 5 + arg1.field2901 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field2040.getGraphics();
                Statics.field977.method1339(var27, 0, 0);
            } catch (Exception var112) {
                Statics.field2040.repaint();
            }
            return;
        }
        if (client.field269 == 0 || client.field269 == 5) {
            byte var29 = 20;
            arg0.method3333(class142.field2344, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1517(230, var30, 304, 34, 9179409);
            class73.method1517(231, var30 + 1, 302, 32, 0);
            class73.method1515(232, var30 + 2, field661 * 3, 30, 9179409);
            class73.method1515(field661 * 3 + 232, var30 + 2, 300 - field661 * 3, 30, 0);
            arg0.method3333(field662, 382, 276 - var29, 16777215, -1);
        }
        if (client.field269 == 20) {
            Statics.field671.method1583(382 - Statics.field671.field1317 / 2, 271 - Statics.field671.field1319 / 2);
            short var31 = 211;
            arg0.method3333(field658, 382, var31, 16776960, 0);
            int var114 = var31 + 15;
            arg0.method3333(field665, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3333(field679, 382, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field663 != 4) {
                arg0.method3308(class142.field2363, 272, var117, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field667; arg0.method3322(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3308(class192.method3380(var33), 312, var117, 16777215, 0);
                var114 = var117 + 15;
                String var35 = class142.field2329;
                String var36 = field668;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3308(var35 + var40, 274, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field269 == 10 || client.field269 == 11) {
            Statics.field671.method1583(202, 171);
            if (field663 == 0) {
                short var42 = 251;
                arg0.method3333(class142.field2366, 382, var42, 16776960, 0);
                int var118 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field649.method1583(var43 - 73, var44 - 20);
                arg0.method3311(class142.field2367, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field649.method1583(var45 - 73, var44 - 20);
                arg0.method3311(class142.field2324, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field663 == 1) {
                arg0.method3333(class142.field2137, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3333(field658, 382, var46, 16777215, 0);
                int var119 = var46 + 15;
                arg0.method3333(field665, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3333(field679, 382, var120, 16777215, 0);
                int var121 = var120 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field649.method1583(var47 - 73, var48 - 20);
                arg0.method3333(class142.field2153, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field649.method1583(var49 - 73, var48 - 20);
                arg0.method3333(class142.field2268, var49, var48 + 5, 16777215, 0);
            } else if (field663 == 2) {
                short var50 = 211;
                arg0.method3333(field658, 382, var50, 16776960, 0);
                int var122 = var50 + 15;
                arg0.method3333(field665, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3333(field679, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3308(class142.field2363, 272, var125, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field667; arg0.method3322(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3308(class192.method3380(var52) + (field664 == 0 & client.field442 % 40 < 20 ? class2.method2043(16776960) + class2.field18 : ""), 312, var125, 16777215, 0);
                var122 = var125 + 15;
                String var54 = class142.field2329;
                String var55 = field668;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3308(var54 + var59 + (field664 == 1 & client.field442 % 40 < 20 ? class2.method2043(16776960) + class2.field18 : ""), 274, var122, 16777215, 0);
                var122 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field649.method1583(var61 - 73, var62 - 20);
                arg0.method3333(class142.field2369, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field649.method1583(var63 - 73, var62 - 20);
                arg0.method3333(class142.field2268, var63, var62 + 5, 16777215, 0);
            } else if (field663 == 4) {
                arg0.method3333(class142.field2256, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3333(field658, 382, var64, 16777215, 0);
                int var126 = var64 + 15;
                arg0.method3333(field665, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3333(field679, 382, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var66 = class142.field2350;
                String var67 = Statics.field968;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3308(var66 + var71 + (client.field442 % 40 < 20 ? class2.method2043(16776960) + class2.field18 : ""), 274, var128, 16777215, 0);
                var126 = var128 - 8;
                arg0.method3308(class142.field2295, 373, var126, 16776960, 0);
                var126 += 15;
                arg0.method3308(class142.field2142, 373, var126, 16776960, 0);
                int var73 = 373 + arg0.method3322(class142.field2142) + 15;
                int var74 = var126 - arg0.field2901;
                class74 var75;
                if (field647) {
                    var75 = Statics.field1047;
                } else {
                    var75 = Statics.field544;
                }
                var75.method1583(var73, var74);
                var126 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field649.method1583(var76 - 73, var77 - 20);
                arg0.method3333(class142.field2153, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field649.method1583(var78 - 73, var77 - 20);
                arg0.method3333(class142.field2268, var78, var77 + 5, 16777215, 0);
                arg1.method3333(class142.field2359, 382, var77 + 36, 255, 0);
            }
        }
        if (field666 > 0) {
            int var79 = field666;
            short var80 = 256;
            field657 += var79 * 128;
            if (field657 > Statics.field634.length) {
                field657 -= Statics.field634.length;
                int var81 = (int) (Math.random() * 12.0D);
                method806(Statics.field650[var81]);
            }
            int var82 = 0;
            int var83 = var79 * 128;
            int var84 = (var80 - var79) * 128;
            for (int var85 = 0; var85 < var84; var85++) {
                int var86 = Statics.field1522[var82 + var83] - Statics.field634[field657 + var82 & Statics.field634.length - 1] * var79 / 6;
                if (var86 < 0) {
                    var86 = 0;
                }
                Statics.field1522[var82++] = var86;
            }
            for (int var87 = var80 - var79; var87 < var80; var87++) {
                int var88 = var87 * 128;
                for (int var89 = 0; var89 < 128; var89++) {
                    int var90 = (int) (Math.random() * 100.0D);
                    if (var90 < 50 && var89 > 10 && var89 < 118) {
                        Statics.field1522[var88 + var89] = 255;
                    } else {
                        Statics.field1522[var88 + var89] = 0;
                    }
                }
            }
            if (field655 > 0) {
                field655 -= var79 * 4;
            }
            if (field656 > 0) {
                field656 -= var79 * 4;
            }
            if (field655 == 0 && field656 == 0) {
                int var91 = (int) (Math.random() * (double) (2000 / var79));
                if (var91 == 0) {
                    field655 = 1024;
                }
                if (var91 == 1) {
                    field656 = 1024;
                }
            }
            for (int var92 = 0; var92 < var80 - var79; var92++) {
                field654[var92] = field654[var79 + var92];
            }
            for (int var93 = var80 - var79; var93 < var80; var93++) {
                field654[var93] = (int) (Math.sin((double) field648 / 14.0D) * 16.0D + Math.sin((double) field648 / 15.0D) * 14.0D + Math.sin((double) field648 / 16.0D) * 12.0D);
                field648++;
            }
            field675 += var79 * 126130977;
            int var94 = ((client.field442 & 0x1) + var79) / 2;
            if (var94 > 0) {
                for (int var95 = 0; var95 < field675 * 1981413348; var95++) {
                    int var96 = (int) (Math.random() * 124.0D) + 2;
                    int var97 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1522[(var97 << 7) + var96] = 192;
                }
                field675 = 0;
                int var98 = 0;
                label409: while (true) {
                    if (var98 >= var80) {
                        int var102 = 0;
                        while (true) {
                            if (var102 >= 128) {
                                break label409;
                            }
                            int var103 = 0;
                            for (int var104 = -var94; var104 < var80; var104++) {
                                int var105 = var104 * 128;
                                if (var94 + var104 < var80) {
                                    var103 += Statics.field194[var94 * 128 + var102 + var105];
                                }
                                if (var104 - (var94 + 1) >= 0) {
                                    var103 -= Statics.field194[var102 + var105 - (var94 + 1) * 128];
                                }
                                if (var104 >= 0) {
                                    Statics.field1522[var102 + var105] = var103 / (var94 * 2 + 1);
                                }
                            }
                            var102++;
                        }
                    }
                    int var99 = 0;
                    int var100 = var98 * 128;
                    for (int var101 = -var94; var101 < 128; var101++) {
                        if (var94 + var101 < 128) {
                            var99 += Statics.field1522[var100 + var101 + var94];
                        }
                        if (var101 - (var94 + 1) >= 0) {
                            var99 -= Statics.field1522[var100 + var101 - (var94 + 1)];
                        }
                        if (var101 >= 0) {
                            Statics.field194[var100 + var101] = var99 / (var94 * 2 + 1);
                        }
                    }
                    var98++;
                }
            }
            field666 = 0;
        }
        method2662();
        Statics.field2022[Statics.field75.field146 ? 1 : 0].method1583(725, 463);
        if (client.field269 > 5 && client.field267 == 0) {
            if (Statics.field16 == null) {
                Statics.field16 = class70.method1298(Statics.field292, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field16.method1583(var106, var107);
                arg0.method3333(class142.field2299 + " " + client.field262, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field1817 == null) {
                    arg1.method3333(class142.field2156, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3333(class142.field2230, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field2040.getGraphics();
            Statics.field977.method1339(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field2040.repaint();
        }
    }

    @ObfuscatedName("ew.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2684(String arg0, String arg1, String arg2) {
        field658 = arg0;
        field665 = arg1;
        field679 = arg2;
    }

    @ObfuscatedName("ar.b(Lba;I)V")
    public static final void method806(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field634.length; var2++) {
            Statics.field634[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field634[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1765[var8] = (Statics.field634[var8 - 1] + Statics.field634[var8 + 1] + Statics.field634[var8 - 128] + Statics.field634[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field634;
            Statics.field634 = Statics.field1765;
            Statics.field1765 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1319; var11++) {
            for (int var12 = 0; var12 < arg0.field1317; var12++) {
                if (arg0.field1320[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1321;
                    int var14 = var11 + 16 + arg0.field1322;
                    int var15 = (var14 << 7) + var13;
                    Statics.field634[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("l.q(IIIB)I")
    public static final int method87(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("el.l(I)V")
    public static final void method2662() {
        short var0 = 256;
        if (field655 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field655 > 768) {
                    Statics.field152[var1] = method87(Statics.field2403[var1], Statics.field628[var1], 1024 - field655);
                } else if (field655 > 256) {
                    Statics.field152[var1] = Statics.field628[var1];
                } else {
                    Statics.field152[var1] = method87(Statics.field628[var1], Statics.field2403[var1], 256 - field655);
                }
            }
        } else if (field656 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field656 > 768) {
                    Statics.field152[var2] = method87(Statics.field2403[var2], Statics.field1417[var2], 1024 - field656);
                } else if (field656 > 256) {
                    Statics.field152[var2] = Statics.field1417[var2];
                } else {
                    Statics.field152[var2] = method87(Statics.field1417[var2], Statics.field2403[var2], 256 - field656);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field152[var3] = Statics.field2403[var3];
            }
        }
        class73.method1535(0, 9, 128, var0 + 7);
        Statics.field1826.method1421(0, 0);
        class73.method1514();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field654[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1522[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field152[var10];
                    int var14 = Statics.field977.field1294[var5];
                    Statics.field977.field1294[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1535(637, 9, 765, var0 + 7);
        Statics.field1758.method1421(382, 0);
        class73.method1514();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field654[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1522[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field152[var22];
                    int var26 = Statics.field977.field1294[var20];
                    Statics.field977.field1294[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("eo.m(Lr;I)V")
    public static void method2811(class22 arg0) {
        if (arg0.method492() != client.field401) {
            client.field401 = arg0.method492();
            boolean var1 = arg0.method492();
            if (Statics.field76 != var1) {
                class45.field994.method3128();
                class45.field996.method3128();
                class45.field997.method3128();
                Statics.field76 = var1;
            }
        }
        Statics.field1814 = arg0.field581;
        client.field262 = arg0.field589;
        client.field263 = arg0.field579;
        Statics.field645 = client.field265 == 0 ? 43594 : arg0.field589 + 40000;
        Statics.field550 = client.field265 == 0 ? 443 : arg0.field589 + 50000;
        Statics.field716 = Statics.field645;
    }

    @ObfuscatedName("cc.s(III)V")
    public static void method2067(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field653[var5] != arg0) {
                var2[var4] = field653[var5];
                var3[var4] = field677[var5];
                var4++;
            }
        }
        field653 = var2;
        field677 = var3;
        method1855(Statics.field635, 0, Statics.field635.length - 1, field653, field677);
    }

    @ObfuscatedName("ch.f([Lr;II[I[II)V")
    public static void method1855(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field591;
                        var12 = var8.field591;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field580;
                        var12 = var8.field580;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method492() ? 1 : 0;
                        var12 = var8.method492() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field589;
                        var12 = var8.field589;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field591;
                        var16 = var8.field591;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field580;
                        var16 = var8.field580;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method492() ? 1 : 0;
                        var16 = var8.method492() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field589;
                        var16 = var8.field589;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1855(arg0, arg1, var6, arg3, arg4);
        method1855(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
