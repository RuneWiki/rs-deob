package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ab")
public class class28 {

    @ObfuscatedName("ab.d")
    public static int[] field644 = new int[256];

    @ObfuscatedName("ab.z")
    public static int field670 = 0;

    @ObfuscatedName("ab.x")
    public static int field646 = 0;

    @ObfuscatedName("ab.r")
    public static int field660 = 0;

    @ObfuscatedName("ab.h")
    public static int field648 = 0;

    @ObfuscatedName("ab.ak")
    public static int field649 = 0;

    @ObfuscatedName("ab.ab")
    public static int field650 = 0;

    @ObfuscatedName("ab.as")
    public static int field651 = 10;

    @ObfuscatedName("ab.aq")
    public static String field654 = "";

    @ObfuscatedName("ab.ai")
    public static int field653 = 0;

    @ObfuscatedName("ab.aw")
    public static String field671 = "";

    @ObfuscatedName("ab.aj")
    public static String field655 = "";

    @ObfuscatedName("ab.ax")
    public static String field641 = "";

    @ObfuscatedName("ab.ar")
    public static String field657 = "";

    @ObfuscatedName("ab.ac")
    public static String field658 = "";

    @ObfuscatedName("ab.ap")
    public static int field672 = 0;

    @ObfuscatedName("ab.az")
    public static String field647 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ab.ah")
    public static boolean field661 = false;

    @ObfuscatedName("ab.am")
    public static int field665 = 0;

    @ObfuscatedName("ab.bv")
    public static int[] field639 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ab.bl")
    public static int[] field668 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ab.be")
    public static int field669 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.e(Lec;Lec;I)I")
    public static int method579(class145 arg0, class145 arg1) {
        int var2 = 0;
        if (arg0.method2757("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2757("logo", "")) {
            var2++;
        }
        if (arg1.method2757("titlebox", "")) {
            var2++;
        }
        if (arg1.method2757("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2757("runes", "")) {
            var2++;
        }
        if (arg1.method2757("title_mute", "")) {
            var2++;
        }
        arg1.method2757("sl_back", "");
        arg1.method2757("sl_flags", "");
        arg1.method2757("sl_arrows", "");
        arg1.method2757("sl_stars", "");
        arg1.method2757("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bj.p(Ljava/awt/Component;Lec;Lec;I)V")
    public static void method1424(Component arg0, class145 arg1, class145 arg2) {
        if (Statics.field667) {
            return;
        }
        class73.method1526();
        byte[] var3 = arg1.method2772("title.jpg", "");
        Statics.field144 = new class72(var3, arg0);
        Statics.field1996 = Statics.field144.method1434();
        Statics.field652 = Statics.method585(arg2, "logo", "");
        Statics.field2924 = Statics.method585(arg2, "titlebox", "");
        Statics.field2031 = Statics.method585(arg2, "titlebutton", "");
        Statics.field640 = class70.method2589(arg2, "runes", "");
        Statics.field642 = class70.method2589(arg2, "title_mute", "");
        Statics.field1878 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field1878[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field1878[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field1878[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field1878[var7 + 192] = 16777215;
        }
        Statics.field1498 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1498[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1498[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field1498[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field1498[var11 + 192] = 16777215;
        }
        Statics.field1441 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1441[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1441[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1441[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1441[var15 + 192] = 16777215;
        }
        Statics.field947 = new int[256];
        Statics.field1848 = new int[32768];
        Statics.field679 = new int[32768];
        method1325((class74) null);
        Statics.field160 = new int[32768];
        Statics.field2926 = new int[32768];
        field653 = 0;
        field657 = "";
        field658 = "";
        field661 = false;
        if (Statics.field908.field141) {
            Statics.method2661(2);
        } else {
            class146 var16 = Statics.field2469;
            int var17 = var16.method2781("scape main");
            int var18 = var16.method2732(var17, "");
            class160.field2695 = 1;
            Statics.field997 = var16;
            Statics.field227 = var17;
            Statics.field2692 = var18;
            Statics.field1264 = 255;
            Statics.field709 = false;
            Statics.field2892 = 2;
        }
        class149.method1979(false);
        Statics.field667 = true;
        Statics.field144.method1443(0, 0);
        Statics.field1996.method1443(382, 0);
        Statics.field652.method1579(382 - Statics.field652.field1308 / 2, 18);
    }

    @ObfuscatedName("v.a(I)V")
    public static void method143() {
        if (!Statics.field667) {
            return;
        }
        Statics.field2924 = null;
        Statics.field2031 = null;
        Statics.field640 = null;
        Statics.field144 = null;
        Statics.field1996 = null;
        Statics.field652 = null;
        Statics.field642 = null;
        Statics.field662 = null;
        Statics.field1050 = null;
        Statics.field645 = null;
        Statics.field163 = null;
        Statics.field664 = null;
        Statics.field1878 = null;
        Statics.field1498 = null;
        Statics.field1441 = null;
        Statics.field947 = null;
        Statics.field1848 = null;
        Statics.field679 = null;
        Statics.field160 = null;
        Statics.field2926 = null;
        Statics.method2661(2);
        class149.method1979(true);
        Statics.field667 = false;
    }

    @ObfuscatedName("bp.u(Lgb;Lgb;I)V")
    public static void method1602(class190 arg0, class190 arg1) {
        if (field661) {
            method2362(arg0, arg1);
            return;
        }
        if (client.field263 == 0 || client.field263 == 5) {
            byte var2 = 20;
            arg0.method3334(class142.field2262, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1572(230, var3, 304, 34, 9179409);
            class73.method1572(231, var3 + 1, 302, 32, 0);
            class73.method1532(232, var3 + 2, field651 * 3, 30, 9179409);
            class73.method1532(field651 * 3 + 232, var3 + 2, 300 - field651 * 3, 30, 0);
            arg0.method3334(field654, 382, 276 - var2, 16777215, -1);
        }
        if (client.field263 == 20) {
            Statics.field2924.method1579(382 - Statics.field2924.field1308 / 2, 271 - Statics.field2924.field1315 / 2);
            short var4 = 211;
            arg0.method3334(field671, 382, var4, 16776960, 0);
            int var101 = var4 + 15;
            arg0.method3334(field655, 382, var101, 16776960, 0);
            int var102 = var101 + 15;
            arg0.method3334(field641, 382, var102, 16776960, 0);
            int var103 = var102 + 15;
            int var104 = var103 + 10;
            arg0.method3394(class142.field2360, 272, var104, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field657; arg0.method3327(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3394(class189.method3331(var6), 312, var104, 16777215, 0);
            var101 = var104 + 15;
            String var8 = class142.field2361;
            String var9 = field658;
            int var10 = var9.length();
            char[] var11 = new char[var10];
            for (int var12 = 0; var12 < var10; var12++) {
                var11[var12] = '*';
            }
            String var13 = new String(var11);
            arg0.method3394(var8 + var13, 274, var101, 16777215, 0);
            var101 += 15;
        }
        if (client.field263 == 10) {
            Statics.field2924.method1579(202, 171);
            if (field653 == 0) {
                short var15 = 251;
                arg0.method3334(class142.field2362, 382, var15, 16776960, 0);
                int var105 = var15 + 30;
                short var16 = 302;
                short var17 = 291;
                Statics.field2031.method1579(var16 - 73, var17 - 20);
                arg0.method3335(class142.field2363, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                Statics.field2031.method1579(var18 - 73, var17 - 20);
                arg0.method3335(class142.field2364, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field653 == 1) {
                arg0.method3334(class142.field2347, 382, 211, 16776960, 0);
                short var19 = 236;
                arg0.method3334(field671, 382, var19, 16777215, 0);
                int var106 = var19 + 15;
                arg0.method3334(field655, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3334(field641, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                short var20 = 302;
                short var21 = 321;
                Statics.field2031.method1579(var20 - 73, var21 - 20);
                arg0.method3334(class142.field2150, var20, var21 + 5, 16777215, 0);
                short var22 = 462;
                Statics.field2031.method1579(var22 - 73, var21 - 20);
                arg0.method3334(class142.field2366, var22, var21 + 5, 16777215, 0);
            } else if (field653 == 2) {
                short var23 = 211;
                arg0.method3334(field671, 382, var23, 16776960, 0);
                int var109 = var23 + 15;
                arg0.method3334(field655, 382, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3334(field641, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var112 = var111 + 10;
                arg0.method3394(class142.field2360, 272, var112, 16777215, 0);
                short var24 = 200;
                String var25;
                for (var25 = field657; arg0.method3327(var25) > var24; var25 = var25.substring(1)) {
                }
                arg0.method3394(class189.method3331(var25) + (field672 == 0 & client.field265 % 40 < 20 ? class2.method85(16776960) + class2.field33 : ""), 312, var112, 16777215, 0);
                var109 = var112 + 15;
                String var27 = class142.field2361;
                String var28 = field658;
                int var29 = var28.length();
                char[] var30 = new char[var29];
                for (int var31 = 0; var31 < var29; var31++) {
                    var30[var31] = '*';
                }
                String var32 = new String(var30);
                arg0.method3394(var27 + var32 + (field672 == 1 & client.field265 % 40 < 20 ? class2.method85(16776960) + class2.field33 : ""), 274, var109, 16777215, 0);
                var109 += 15;
                short var34 = 302;
                short var35 = 321;
                Statics.field2031.method1579(var34 - 73, var35 - 20);
                arg0.method3334(class142.field2375, var34, var35 + 5, 16777215, 0);
                short var36 = 462;
                Statics.field2031.method1579(var36 - 73, var35 - 20);
                arg0.method3334(class142.field2366, var36, var35 + 5, 16777215, 0);
            } else if (field653 == 3) {
                arg0.method3334(class142.field2367, 382, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3334(class142.field2145, 382, var37, 16777215, 0);
                int var113 = var37 + 15;
                arg0.method3334(class142.field2165, 382, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3334(class142.field2193, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3334(class142.field2244, 382, var115, 16777215, 0);
                int var116 = var115 + 15;
                short var38 = 382;
                short var39 = 321;
                Statics.field2031.method1579(var38 - 73, var39 - 20);
                arg0.method3334(class142.field2366, var38, var39 + 5, 16777215, 0);
            }
        }
        if (field649 > 0) {
            int var40 = field649;
            short var41 = 256;
            field660 += var40 * 128;
            if (field660 > Statics.field1848.length) {
                field660 -= Statics.field1848.length;
                int var42 = (int) (Math.random() * 12.0D);
                method1325(Statics.field640[var42]);
            }
            int var43 = 0;
            int var44 = var40 * 128;
            int var45 = (var41 - var40) * 128;
            for (int var46 = 0; var46 < var45; var46++) {
                int var47 = Statics.field160[var43 + var44] - Statics.field1848[field660 + var43 & Statics.field1848.length - 1] * var40 / 6;
                if (var47 < 0) {
                    var47 = 0;
                }
                Statics.field160[var43++] = var47;
            }
            for (int var48 = var41 - var40; var48 < var41; var48++) {
                int var49 = var48 * 128;
                for (int var50 = 0; var50 < 128; var50++) {
                    int var51 = (int) (Math.random() * 100.0D);
                    if (var51 < 50 && var50 > 10 && var50 < 118) {
                        Statics.field160[var49 + var50] = 255;
                    } else {
                        Statics.field160[var49 + var50] = 0;
                    }
                }
            }
            if (field670 > 0) {
                field670 -= var40 * 4;
            }
            if (field646 > 0) {
                field646 -= var40 * 4;
            }
            if (field670 == 0 && field646 == 0) {
                int var52 = (int) (Math.random() * (double) (2000 / var40));
                if (var52 == 0) {
                    field670 = 1024;
                }
                if (var52 == 1) {
                    field646 = 1024;
                }
            }
            for (int var53 = 0; var53 < var41 - var40; var53++) {
                field644[var53] = field644[var40 + var53];
            }
            for (int var54 = var41 - var40; var54 < var41; var54++) {
                field644[var54] = (int) (Math.sin((double) field650 / 14.0D) * 16.0D + Math.sin((double) field650 / 15.0D) * 14.0D + Math.sin((double) field650 / 16.0D) * 12.0D);
                field650++;
            }
            field648 += var40 * 542753271;
            int var55 = ((client.field265 & 0x1) + var40) / 2;
            if (var55 > 0) {
                for (int var56 = 0; var56 < field648 * 551758268; var56++) {
                    int var57 = (int) (Math.random() * 124.0D) + 2;
                    int var58 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field160[(var58 << 7) + var57] = 192;
                }
                field648 = 0;
                int var59 = 0;
                label294: while (true) {
                    if (var59 >= var41) {
                        int var63 = 0;
                        while (true) {
                            if (var63 >= 128) {
                                break label294;
                            }
                            int var64 = 0;
                            for (int var65 = -var55; var65 < var41; var65++) {
                                int var66 = var65 * 128;
                                if (var55 + var65 < var41) {
                                    var64 += Statics.field2926[var55 * 128 + var63 + var66];
                                }
                                if (var65 - (var55 + 1) >= 0) {
                                    var64 -= Statics.field2926[var63 + var66 - (var55 + 1) * 128];
                                }
                                if (var65 >= 0) {
                                    Statics.field160[var63 + var66] = var64 / (var55 * 2 + 1);
                                }
                            }
                            var63++;
                        }
                    }
                    int var60 = 0;
                    int var61 = var59 * 128;
                    for (int var62 = -var55; var62 < 128; var62++) {
                        if (var55 + var62 < 128) {
                            var60 += Statics.field160[var61 + var62 + var55];
                        }
                        if (var62 - (var55 + 1) >= 0) {
                            var60 -= Statics.field160[var61 + var62 - (var55 + 1)];
                        }
                        if (var62 >= 0) {
                            Statics.field2926[var61 + var62] = var60 / (var55 * 2 + 1);
                        }
                    }
                    var59++;
                }
            }
            field649 = 0;
        }
        short var67 = 256;
        if (field670 > 0) {
            for (int var68 = 0; var68 < 256; var68++) {
                if (field670 > 768) {
                    Statics.field947[var68] = method494(Statics.field1878[var68], Statics.field1498[var68], 1024 - field670);
                } else if (field670 > 256) {
                    Statics.field947[var68] = Statics.field1498[var68];
                } else {
                    Statics.field947[var68] = method494(Statics.field1498[var68], Statics.field1878[var68], 256 - field670);
                }
            }
        } else if (field646 > 0) {
            for (int var69 = 0; var69 < 256; var69++) {
                if (field646 > 768) {
                    Statics.field947[var69] = method494(Statics.field1878[var69], Statics.field1441[var69], 1024 - field646);
                } else if (field646 > 256) {
                    Statics.field947[var69] = Statics.field1441[var69];
                } else {
                    Statics.field947[var69] = method494(Statics.field1441[var69], Statics.field1878[var69], 256 - field646);
                }
            }
        } else {
            for (int var70 = 0; var70 < 256; var70++) {
                Statics.field947[var70] = Statics.field1878[var70];
            }
        }
        class73.method1530(0, 9, 128, var67 + 7);
        Statics.field144.method1443(0, 0);
        class73.method1522();
        int var71 = 0;
        int var72 = 6885;
        for (int var73 = 1; var73 < var67 - 1; var73++) {
            int var74 = (var67 - var73) * field644[var73] / var67;
            int var75 = var74 + 22;
            if (var75 < 0) {
                var75 = 0;
            }
            var71 += var75;
            for (int var76 = var75; var76 < 128; var76++) {
                int var77 = Statics.field160[var71++];
                if (var77 == 0) {
                    var72++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field947[var77];
                    int var81 = Statics.field857.field1285[var72];
                    Statics.field857.field1285[var72++] = ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) + ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) >> 8;
                }
            }
            var72 += var75 + 765 - 128;
        }
        class73.method1530(637, 9, 765, var67 + 7);
        Statics.field1996.method1443(382, 0);
        class73.method1522();
        int var82 = 0;
        int var83 = 7546;
        for (int var84 = 1; var84 < var67 - 1; var84++) {
            int var85 = (var67 - var84) * field644[var84] / var67;
            int var86 = 103 - var85;
            int var87 = var83 + var85;
            for (int var88 = 0; var88 < var86; var88++) {
                int var89 = Statics.field160[var82++];
                if (var89 == 0) {
                    var87++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field947[var89];
                    int var93 = Statics.field857.field1285[var87];
                    Statics.field857.field1285[var87++] = ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) >> 8;
                }
            }
            var82 += 128 - var86;
            var83 = 765 - var86 - var85 + var87;
        }
        Statics.field642[Statics.field908.field141 ? 1 : 0].method1579(725, 463);
        if (client.field263 > 5 && client.field261 == 0) {
            if (Statics.field664 == null) {
                Statics.field664 = Statics.method585(Statics.field1907, "sl_button", "");
            } else {
                byte var94 = 5;
                short var95 = 463;
                byte var96 = 100;
                byte var97 = 35;
                Statics.field664.method1579(var94, var95);
                arg0.method3334(class142.field2298 + " " + client.field255, var96 / 2 + var94, var97 / 2 + var95 - 2, 16777215, 0);
                if (Statics.field200 == null) {
                    arg1.method3334(class142.field2382, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                } else {
                    arg1.method3334(class142.field2349, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var98 = Statics.field1007.getGraphics();
            Statics.field857.method1358(var98, 0, 0);
        } catch (Exception var100) {
            Statics.field1007.repaint();
        }
    }

    @ObfuscatedName("cb.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1980(String arg0, String arg1, String arg2) {
        field671 = arg0;
        field655 = arg1;
        field641 = arg2;
    }

    @ObfuscatedName("br.m(Lbd;B)V")
    public static final void method1325(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1848.length; var2++) {
            Statics.field1848[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1848[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field679[var8] = (Statics.field1848[var8 - 1] + Statics.field1848[var8 + 1] + Statics.field1848[var8 - 128] + Statics.field1848[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1848;
            Statics.field1848 = Statics.field679;
            Statics.field679 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1315; var11++) {
            for (int var12 = 0; var12 < arg0.field1308; var12++) {
                if (arg0.field1311[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1312;
                    int var14 = var11 + 16 + arg0.field1313;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1848[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("q.t(IIIB)I")
    public static final int method494(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("do.l(Lgb;Lgb;I)V")
    public static void method2362(class190 arg0, class190 arg1) {
        if (Statics.field662 == null) {
            Statics.field662 = class70.method583(Statics.field1907, "sl_back", "");
        }
        if (Statics.field1050 == null) {
            Statics.field1050 = class70.method2589(Statics.field1907, "sl_flags", "");
        }
        if (Statics.field645 == null) {
            Statics.field645 = class70.method2589(Statics.field1907, "sl_arrows", "");
        }
        if (Statics.field163 == null) {
            Statics.field163 = class70.method2589(Statics.field1907, "sl_stars", "");
        }
        class73.method1532(0, 23, 765, 480, 0);
        class73.method1551(0, 0, 125, 23, 12425273, 9135624);
        class73.method1551(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3334(class142.field2372, 62, 15, 0, -1);
        if (Statics.field163 != null) {
            Statics.field163[1].method1579(140, 1);
            arg1.method3394(class142.field2373, 152, 10, 16777215, -1);
            Statics.field163[0].method1579(140, 12);
            arg1.method3394(class142.field2374, 152, 21, 16777215, -1);
        }
        if (Statics.field645 != null) {
            short var2 = 280;
            if (field639[0] == 0 && field668[0] == 0) {
                Statics.field645[2].method1579(var2, 4);
            } else {
                Statics.field645[0].method1579(var2, 4);
            }
            if (field639[0] == 0 && field668[0] == 1) {
                Statics.field645[3].method1579(var2 + 15, 4);
            } else {
                Statics.field645[1].method1579(var2 + 15, 4);
            }
            arg0.method3394(class142.field2216, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field639[0] == 1 && field668[0] == 0) {
                Statics.field645[2].method1579(var3, 4);
            } else {
                Statics.field645[0].method1579(var3, 4);
            }
            if (field639[0] == 1 && field668[0] == 1) {
                Statics.field645[3].method1579(var3 + 15, 4);
            } else {
                Statics.field645[1].method1579(var3 + 15, 4);
            }
            arg0.method3394(class142.field2376, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field639[0] == 2 && field668[0] == 0) {
                Statics.field645[2].method1579(var4, 4);
            } else {
                Statics.field645[0].method1579(var4, 4);
            }
            if (field639[0] == 2 && field668[0] == 1) {
                Statics.field645[3].method1579(var4 + 15, 4);
            } else {
                Statics.field645[1].method1579(var4 + 15, 4);
            }
            arg0.method3394(class142.field2378, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field639[0] == 3 && field668[0] == 0) {
                Statics.field645[2].method1579(var5, 4);
            } else {
                Statics.field645[0].method1579(var5, 4);
            }
            if (field639[0] == 3 && field668[0] == 1) {
                Statics.field645[3].method1579(var5 + 15, 4);
            } else {
                Statics.field645[1].method1579(var5 + 15, 4);
            }
            arg0.method3394(class142.field2277, var5 + 32, 17, 16777215, -1);
        }
        class73.method1532(708, 4, 50, 16, 0);
        arg1.method3334(class142.field2366, 733, 16, 16777215, -1);
        field669 = -1;
        if (Statics.field662 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field665) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field665) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field665) {
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
            for (int var20 = 0; var20 < field665; var20++) {
                class22 var21 = Statics.field606[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field564);
                if (var21.field564 == -1) {
                    var23 = class142.field2339;
                    var22 = false;
                } else if (var21.field564 > 1980) {
                    var23 = class142.field2351;
                    var22 = false;
                }
                byte var24;
                if (var21.method499()) {
                    if (var21.method498()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method498()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field2004 >= var17 && class127.field2001 >= var16 && class127.field2004 < var6 + var17 && class127.field2001 < var7 + var16 && var22) {
                    field669 = var20;
                    Statics.field662[var24].method1506(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field662[var24].method1443(var17, var16);
                }
                if (Statics.field1050 != null) {
                    Statics.field1050[(var21.method498() ? 8 : 0) + var21.field567].method1579(var17 + 29, var16);
                }
                arg0.method3334(Integer.toString(var21.field575), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3334(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3327(Statics.field606[field669].field566) + 6;
                int var26 = arg1.field2890 + 8;
                class73.method1532(class127.field2004 - var25 / 2, class127.field2001 + 20 + 5, var25, var26, 16777120);
                class73.method1572(class127.field2004 - var25 / 2, class127.field2001 + 20 + 5, var25, var26, 0);
                arg1.method3334(Statics.field606[field669].field566, class127.field2004, class127.field2001 + 20 + 5 + arg1.field2890 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1007.getGraphics();
            Statics.field857.method1358(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1007.repaint();
        }
    }

    @ObfuscatedName("ad.f(Lew;B)V")
    public static void method825(class131 arg0) {
        if (class127.field2000 != 1 && Statics.field1475 || class127.field2000 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2013 >= var1 && class127.field2013 <= var1 + 14 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(0, 0);
            return;
        }
        if (class127.field2013 >= var1 + 15 && class127.field2013 <= var1 + 80 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2013 >= var2 && class127.field2013 <= var2 + 14 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(1, 0);
            return;
        }
        if (class127.field2013 >= var2 + 15 && class127.field2013 <= var2 + 80 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2013 >= var3 && class127.field2013 <= var3 + 14 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(2, 0);
            return;
        }
        if (class127.field2013 >= var3 + 15 && class127.field2013 <= var3 + 80 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2013 >= var4 && class127.field2013 <= var4 + 14 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(3, 0);
            return;
        }
        if (class127.field2013 >= var4 + 15 && class127.field2013 <= var4 + 80 && class127.field2014 >= 4 && class127.field2014 <= 18) {
            method2883(3, 1);
            return;
        }
        if (class127.field2013 >= 708 && class127.field2014 >= 4 && class127.field2013 <= 758 && class127.field2014 <= 20) {
            field661 = false;
            Statics.field144.method1443(0, 0);
            Statics.field1996.method1443(382, 0);
            Statics.field652.method1579(382 - Statics.field652.field1308 / 2, 18);
            return;
        }
        if (field669 == -1) {
            return;
        }
        class22 var5 = Statics.field606[field669];
        method582(var5);
        field661 = false;
        Statics.field144.method1443(0, 0);
        Statics.field1996.method1443(382, 0);
        Statics.field652.method1579(382 - Statics.field652.field1308 / 2, 18);
        return;
    }

    @ObfuscatedName("aq.c(Ls;I)V")
    public static void method582(class22 arg0) {
        if (arg0.method498() != client.field259) {
            client.field259 = arg0.method498();
            boolean var1 = arg0.method498();
            if (Statics.field1028 != var1) {
                class45.method71();
                Statics.field1028 = var1;
            }
        }
        Statics.field22 = arg0.field565;
        client.field255 = arg0.field575;
        client.field256 = arg0.field569;
        Statics.field103 = client.field257 == 0 ? 43594 : arg0.field575 + 40000;
        Statics.field1755 = client.field257 == 0 ? 443 : arg0.field575 + 50000;
        Statics.field1278 = Statics.field103;
    }

    @ObfuscatedName("fk.i(I)V")
    public static void method3153() {
        try {
            if (Statics.field200 == null) {
                Statics.field200 = new class17(Statics.field1920, new URL(Statics.field262));
            } else {
                byte[] var0 = Statics.field200.method150();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field665 = var1.method2182();
                    Statics.field606 = new class22[field665];
                    int var2 = 0;
                    while (var2 < field665) {
                        class22 var3 = Statics.field606[var2] = new class22();
                        var3.field575 = var1.method2182();
                        var3.field569 = var1.method2146();
                        var3.field565 = var1.method2149();
                        var3.field566 = var1.method2149();
                        var3.field567 = var1.method2125();
                        var3.field564 = var1.method2144();
                        var3.field562 = var2++;
                    }
                    method1086(Statics.field606, 0, Statics.field606.length - 1, field639, field668);
                    field661 = true;
                    Statics.field200 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field200 = null;
        }
    }

    @ObfuscatedName("ex.o(III)V")
    public static void method2883(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field639[var5] != arg0) {
                var2[var4] = field639[var5];
                var3[var4] = field668[var5];
                var4++;
            }
        }
        field639 = var2;
        field668 = var3;
        method1086(Statics.field606, 0, Statics.field606.length - 1, field639, field668);
    }

    @ObfuscatedName("bv.d([Ls;II[I[II)V")
    public static void method1086(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field562;
                        var12 = var8.field562;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field564;
                        var12 = var8.field564;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method498() ? 1 : 0;
                        var12 = var8.method498() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field575;
                        var12 = var8.field575;
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
                        var15 = arg0[var5].field562;
                        var16 = var8.field562;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field564;
                        var16 = var8.field564;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method498() ? 1 : 0;
                        var16 = var8.method498() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field575;
                        var16 = var8.field575;
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
        method1086(arg0, arg1, var6, arg3, arg4);
        method1086(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
