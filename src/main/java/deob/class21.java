package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("q")
public class class21 {

    @ObfuscatedName("q.m")
    public static int[] field324 = new int[256];

    @ObfuscatedName("q.j")
    public static int field326 = 0;

    @ObfuscatedName("q.n")
    public static int field353 = 0;

    @ObfuscatedName("q.y")
    public static int field329 = 0;

    @ObfuscatedName("q.x")
    public static int field330 = 0;

    @ObfuscatedName("q.ao")
    public static int field331 = 0;

    @ObfuscatedName("q.ae")
    public static int field332 = 0;

    @ObfuscatedName("q.aa")
    public static int field338 = 10;

    @ObfuscatedName("q.ah")
    public static String field334 = "";

    @ObfuscatedName("q.aw")
    public static int field352 = 0;

    @ObfuscatedName("q.an")
    public static String field317 = "";

    @ObfuscatedName("q.av")
    public static String field337 = "";

    @ObfuscatedName("q.ak")
    public static String field348 = "";

    @ObfuscatedName("q.ax")
    public static String field339 = "";

    @ObfuscatedName("q.ab")
    public static String field340 = "";

    @ObfuscatedName("q.af")
    public static int field341 = 0;

    @ObfuscatedName("q.ai")
    public static String field327 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("q.aq")
    public static boolean field345 = false;

    @ObfuscatedName("q.aj")
    public static int field335 = 0;

    @ObfuscatedName("q.bh")
    public static int[] field347 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("q.ba")
    public static int[] field336 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("q.bn")
    public static int field349 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.i(Lbs;B)V")
    public static void method177(class73 arg0) {
        if (field345) {
            method233(arg0);
            return;
        }
        if (class77.field1390 == 1 && class77.field1398 >= 715 && class77.field1385 >= 453) {
            Statics.field156.field190 = !Statics.field156.field190;
            class12.method174();
            if (Statics.field156.field190) {
                Statics.field2342.method2747();
                class138.field2338 = 1;
                Statics.field2343 = null;
            } else {
                class138.method24(Statics.field1034, "scape main", "", 255, false);
            }
        }
        if (client.field641 == 5) {
            return;
        }
        field331++;
        if (client.field641 != 10) {
            return;
        }
        if (client.field488 == 0) {
            if (class77.field1390 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class77.field1398 >= var1 && class77.field1398 <= var1 + var3 && class77.field1385 >= var2 && class77.field1385 <= var2 + var4) {
                    method827();
                    return;
                }
            }
            if (Statics.field172 != null) {
                method827();
            }
        }
        int var5 = class77.field1390;
        int var6 = class77.field1398;
        int var7 = class77.field1385;
        if (field352 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field352 = 3;
                field341 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field317 = class134.field2109;
                field337 = class134.field2267;
                field348 = class134.field2156;
                field352 = 2;
                field341 = 0;
            }
        } else if (field352 == 2) {
            short var11 = 231;
            int var19 = var11 + 30;
            if (var5 == 1 && var7 >= var19 - 15 && var7 < var19) {
                field341 = 0;
            }
            var19 += 15;
            if (var5 == 1 && var7 >= var19 - 15 && var7 < var19) {
                field341 = 1;
            }
            var19 += 15;
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field339 = field339.trim();
                if (field339.length() == 0) {
                    method601(class134.field2203, class134.field2204, class134.field2205);
                    return;
                }
                if (field340.length() == 0) {
                    method601(class134.field2262, class134.field2135, class134.field2208);
                    return;
                }
                method601(class134.field2296, class134.field2297, class134.field2257);
                client.method241(20);
                return;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field352 = 0;
                field339 = "";
                field340 = "";
            }
            while (true) {
                while (class75.method507()) {
                    boolean var15 = false;
                    for (int var16 = 0; var16 < field327.length(); var16++) {
                        if (Statics.field2001 == field327.charAt(var16)) {
                            var15 = true;
                            break;
                        }
                    }
                    if (field341 == 0) {
                        if (Statics.field967 == 85 && field339.length() > 0) {
                            field339 = field339.substring(0, field339.length() - 1);
                        }
                        if (Statics.field967 == 84 || Statics.field967 == 80) {
                            field341 = 1;
                        }
                        if (var15 && field339.length() < 320) {
                            field339 = field339 + Statics.field2001;
                        }
                    } else if (field341 == 1) {
                        if (Statics.field967 == 85 && field340.length() > 0) {
                            field340 = field340.substring(0, field340.length() - 1);
                        }
                        if (Statics.field967 == 84 || Statics.field967 == 80) {
                            field341 = 0;
                        }
                        if (Statics.field967 == 84) {
                            field339 = field339.trim();
                            if (field339.length() == 0) {
                                method601(class134.field2203, class134.field2204, class134.field2205);
                                return;
                            }
                            if (field340.length() == 0) {
                                method601(class134.field2262, class134.field2135, class134.field2208);
                                return;
                            }
                            method601(class134.field2296, class134.field2297, class134.field2257);
                            client.method241(20);
                            return;
                        }
                        if (var15 && field340.length() < 20) {
                            field340 = field340 + Statics.field2001;
                        }
                    }
                }
                return;
            }
        } else if (field352 == 3) {
            short var17 = 382;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field352 = 0;
            }
        }
    }

    @ObfuscatedName("t.w(Lgj;Lgj;I)V")
    public static void method33(class183 arg0, class183 arg1) {
        if (field345) {
            method54(arg0, arg1);
            return;
        }
        if (client.field641 == 0 || client.field641 == 5) {
            byte var2 = 20;
            arg0.method3433(class134.field2127, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1829(230, var3, 304, 34, 9179409);
            class89.method1829(231, var3 + 1, 302, 32, 0);
            class89.method1796(232, var3 + 2, field338 * 3, 30, 9179409);
            class89.method1796(field338 * 3 + 232, var3 + 2, 300 - field338 * 3, 30, 0);
            arg0.method3433(field334, 382, 276 - var2, 16777215, -1);
        }
        if (client.field641 == 20) {
            Statics.field315.method1781(382 - Statics.field315.field1476 / 2, 271 - Statics.field315.field1478 / 2);
            short var4 = 211;
            arg0.method3433(field317, 382, var4, 16776960, 0);
            int var81 = var4 + 15;
            arg0.method3433(field337, 382, var81, 16776960, 0);
            int var82 = var81 + 15;
            arg0.method3433(field348, 382, var82, 16776960, 0);
            int var83 = var82 + 15;
            int var84 = var83 + 10;
            arg0.method3385(class134.field2299, 272, var84, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field339; arg0.method3361(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3385(class185.method3365(var6), 312, var84, 16777215, 0);
            var81 = var84 + 15;
            arg0.method3385(class134.field2300 + class147.method2320(field340), 274, var81, 16777215, 0);
            var81 += 15;
        }
        if (client.field641 == 10) {
            Statics.field315.method1781(202, 171);
            if (field352 == 0) {
                short var7 = 251;
                arg0.method3433(class134.field2301, 382, var7, 16776960, 0);
                int var85 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field316.method1781(var8 - 73, var9 - 20);
                arg0.method3369(class134.field2313, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field316.method1781(var10 - 73, var9 - 20);
                arg0.method3369(class134.field2303, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field352 == 2) {
                short var11 = 211;
                arg0.method3433(field317, 382, var11, 16776960, 0);
                int var86 = var11 + 15;
                arg0.method3433(field337, 382, var86, 16776960, 0);
                int var87 = var86 + 15;
                arg0.method3433(field348, 382, var87, 16776960, 0);
                int var88 = var87 + 15;
                int var89 = var88 + 10;
                arg0.method3385(class134.field2299, 272, var89, 16777215, 0);
                short var12 = 200;
                String var13;
                for (var13 = field339; arg0.method3361(var13) > var12; var13 = var13.substring(1)) {
                }
                arg0.method3385(class185.method3365(var13) + (field341 == 0 & client.field491 % 40 < 20 ? class2.method1(16776960) + class2.field18 : ""), 312, var89, 16777215, 0);
                var86 = var89 + 15;
                arg0.method3385(class134.field2300 + class147.method2320(field340) + (field341 == 1 & client.field491 % 40 < 20 ? class2.method1(16776960) + class2.field18 : ""), 274, var86, 16777215, 0);
                var86 += 15;
                short var14 = 302;
                short var15 = 321;
                Statics.field316.method1781(var14 - 73, var15 - 20);
                arg0.method3433(class134.field2304, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                Statics.field316.method1781(var16 - 73, var15 - 20);
                arg0.method3433(class134.field2195, var16, var15 + 5, 16777215, 0);
            } else if (field352 == 3) {
                arg0.method3433(class134.field2306, 382, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3433(class134.field2307, 382, var17, 16777215, 0);
                int var90 = var17 + 15;
                arg0.method3433(class134.field2308, 382, var90, 16777215, 0);
                int var91 = var90 + 15;
                arg0.method3433(class134.field2309, 382, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3433(class134.field2310, 382, var92, 16777215, 0);
                int var93 = var92 + 15;
                short var18 = 382;
                short var19 = 321;
                Statics.field316.method1781(var18 - 73, var19 - 20);
                arg0.method3433(class134.field2195, var18, var19 + 5, 16777215, 0);
            }
        }
        if (field331 > 0) {
            int var20 = field331;
            short var21 = 256;
            field329 += var20 * 128;
            if (field329 > Statics.field59.length) {
                field329 -= Statics.field59.length;
                int var22 = (int) (Math.random() * 12.0D);
                method170(Statics.field342[var22]);
            }
            int var23 = 0;
            int var24 = var20 * 128;
            int var25 = (var21 - var20) * 128;
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = Statics.field2006[var23 + var24] - Statics.field59[field329 + var23 & Statics.field59.length - 1] * var20 / 6;
                if (var27 < 0) {
                    var27 = 0;
                }
                Statics.field2006[var23++] = var27;
            }
            for (int var28 = var21 - var20; var28 < var21; var28++) {
                int var29 = var28 * 128;
                for (int var30 = 0; var30 < 128; var30++) {
                    int var31 = (int) (Math.random() * 100.0D);
                    if (var31 < 50 && var30 > 10 && var30 < 118) {
                        Statics.field2006[var29 + var30] = 255;
                    } else {
                        Statics.field2006[var29 + var30] = 0;
                    }
                }
            }
            if (field326 > 0) {
                field326 -= var20 * 4;
            }
            if (field353 > 0) {
                field353 -= var20 * 4;
            }
            if (field326 == 0 && field353 == 0) {
                int var32 = (int) (Math.random() * (double) (2000 / var20));
                if (var32 == 0) {
                    field326 = 1024;
                }
                if (var32 == 1) {
                    field353 = 1024;
                }
            }
            for (int var33 = 0; var33 < var21 - var20; var33++) {
                field324[var33] = field324[var20 + var33];
            }
            for (int var34 = var21 - var20; var34 < var21; var34++) {
                field324[var34] = (int) (Math.sin((double) field332 / 14.0D) * 16.0D + Math.sin((double) field332 / 15.0D) * 14.0D + Math.sin((double) field332 / 16.0D) * 12.0D);
                field332++;
            }
            field330 += var20 * -131566331;
            int var35 = ((client.field491 & 0x1) + var20) / 2;
            if (var35 > 0) {
                for (int var36 = 0; var36 < field330 * 49425428; var36++) {
                    int var37 = (int) (Math.random() * 124.0D) + 2;
                    int var38 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2006[(var38 << 7) + var37] = 192;
                }
                field330 = 0;
                int var39 = 0;
                label286: while (true) {
                    if (var39 >= var21) {
                        int var43 = 0;
                        while (true) {
                            if (var43 >= 128) {
                                break label286;
                            }
                            int var44 = 0;
                            for (int var45 = -var35; var45 < var21; var45++) {
                                int var46 = var45 * 128;
                                if (var35 + var45 < var21) {
                                    var44 += Statics.field328[var35 * 128 + var43 + var46];
                                }
                                if (var45 - (var35 + 1) >= 0) {
                                    var44 -= Statics.field328[var43 + var46 - (var35 + 1) * 128];
                                }
                                if (var45 >= 0) {
                                    Statics.field2006[var43 + var46] = var44 / (var35 * 2 + 1);
                                }
                            }
                            var43++;
                        }
                    }
                    int var40 = 0;
                    int var41 = var39 * 128;
                    for (int var42 = -var35; var42 < 128; var42++) {
                        if (var35 + var42 < 128) {
                            var40 += Statics.field2006[var41 + var42 + var35];
                        }
                        if (var42 - (var35 + 1) >= 0) {
                            var40 -= Statics.field2006[var41 + var42 - (var35 + 1)];
                        }
                        if (var42 >= 0) {
                            Statics.field328[var41 + var42] = var40 / (var35 * 2 + 1);
                        }
                    }
                    var39++;
                }
            }
            field331 = 0;
        }
        short var47 = 256;
        if (field326 > 0) {
            for (int var48 = 0; var48 < 256; var48++) {
                if (field326 > 768) {
                    Statics.field2041[var48] = method40(Statics.field130[var48], Statics.field325[var48], 1024 - field326);
                } else if (field326 > 256) {
                    Statics.field2041[var48] = Statics.field325[var48];
                } else {
                    Statics.field2041[var48] = method40(Statics.field325[var48], Statics.field130[var48], 256 - field326);
                }
            }
        } else if (field353 > 0) {
            for (int var49 = 0; var49 < 256; var49++) {
                if (field353 > 768) {
                    Statics.field2041[var49] = method40(Statics.field130[var49], Statics.field23[var49], 1024 - field353);
                } else if (field353 > 256) {
                    Statics.field2041[var49] = Statics.field23[var49];
                } else {
                    Statics.field2041[var49] = method40(Statics.field23[var49], Statics.field130[var49], 256 - field353);
                }
            }
        } else {
            for (int var50 = 0; var50 < 256; var50++) {
                Statics.field2041[var50] = Statics.field130[var50];
            }
        }
        class89.method1787(0, 9, 128, var47 + 7);
        Statics.field318.method1680(0, 0);
        class89.method1786();
        int var51 = 0;
        int var52 = 6885;
        for (int var53 = 1; var53 < var47 - 1; var53++) {
            int var54 = (var47 - var53) * field324[var53] / var47;
            int var55 = var54 + 22;
            if (var55 < 0) {
                var55 = 0;
            }
            var51 += var55;
            for (int var56 = var55; var56 < 128; var56++) {
                int var57 = Statics.field2006[var51++];
                if (var57 == 0) {
                    var52++;
                } else {
                    int var59 = 256 - var57;
                    int var60 = Statics.field2041[var57];
                    int var61 = Statics.field263.field1457[var52];
                    Statics.field263.field1457[var52++] = ((var60 & 0xFF00) * var57 + (var61 & 0xFF00) * var59 & 0xFF0000) + ((var60 & 0xFF00FF) * var57 + (var61 & 0xFF00FF) * var59 & 0xFF00FF00) >> 8;
                }
            }
            var52 += var55 + 765 - 128;
        }
        class89.method1787(637, 9, 765, var47 + 7);
        Statics.field333.method1680(382, 0);
        class89.method1786();
        int var62 = 0;
        int var63 = 7546;
        for (int var64 = 1; var64 < var47 - 1; var64++) {
            int var65 = (var47 - var64) * field324[var64] / var47;
            int var66 = 103 - var65;
            int var67 = var63 + var65;
            for (int var68 = 0; var68 < var66; var68++) {
                int var69 = Statics.field2006[var62++];
                if (var69 == 0) {
                    var67++;
                } else {
                    int var71 = 256 - var69;
                    int var72 = Statics.field2041[var69];
                    int var73 = Statics.field263.field1457[var67];
                    Statics.field263.field1457[var67++] = ((var72 & 0xFF00FF) * var69 + (var73 & 0xFF00FF) * var71 & 0xFF00FF00) + ((var72 & 0xFF00) * var69 + (var73 & 0xFF00) * var71 & 0xFF0000) >> 8;
                }
            }
            var62 += 128 - var66;
            var63 = 765 - var66 - var65 + var67;
        }
        Statics.field1274[Statics.field156.field190 ? 1 : 0].method1781(725, 463);
        if (client.field641 > 5 && client.field488 == 0) {
            if (Statics.field2016 == null) {
                Statics.field2016 = class84.method1474(Statics.field254, "sl_button", "");
            } else {
                byte var74 = 5;
                short var75 = 463;
                byte var76 = 100;
                byte var77 = 35;
                Statics.field2016.method1781(var74, var75);
                arg0.method3433(class134.field2247 + " " + client.field702, var76 / 2 + var74, var77 / 2 + var75 - 2, 16777215, 0);
                if (Statics.field172 == null) {
                    arg1.method3433(class134.field2321, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
                } else {
                    arg1.method3433(class134.field2320, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var78 = Statics.field132.getGraphics();
            Statics.field263.method1587(var78, 0, 0);
        } catch (Exception var80) {
            Statics.field132.repaint();
        }
    }

    @ObfuscatedName("ah.f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method601(String arg0, String arg1, String arg2) {
        field317 = arg0;
        field337 = arg1;
        field348 = arg2;
    }

    @ObfuscatedName("o.e(Lcu;B)V")
    public static final void method170(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field59.length; var2++) {
            Statics.field59[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field59[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2035[var8] = (Statics.field59[var8 - 1] + Statics.field59[var8 + 1] + Statics.field59[var8 - 128] + Statics.field59[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field59;
            Statics.field59 = Statics.field2035;
            Statics.field2035 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1478; var11++) {
            for (int var12 = 0; var12 < arg0.field1476; var12++) {
                if (arg0.field1479[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1477;
                    int var14 = var11 + 16 + arg0.field1475;
                    int var15 = (var14 << 7) + var13;
                    Statics.field59[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("d.t(IIIB)I")
    public static final int method40(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("p.d(Lgj;Lgj;I)V")
    public static void method54(class183 arg0, class183 arg1) {
        if (Statics.field31 == null) {
            Statics.field31 = class84.method1359(Statics.field254, "sl_back", "");
        }
        if (Statics.field344 == null) {
            Statics.field344 = class84.method53(Statics.field254, "sl_flags", "");
        }
        if (Statics.field1305 == null) {
            Statics.field1305 = class84.method53(Statics.field254, "sl_arrows", "");
        }
        if (Statics.field2702 == null) {
            Statics.field2702 = class84.method53(Statics.field254, "sl_stars", "");
        }
        class89.method1796(0, 23, 765, 480, 0);
        class89.method1794(0, 0, 125, 23, 12425273, 9135624);
        class89.method1794(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3433(class134.field2311, 62, 15, 0, -1);
        if (Statics.field2702 != null) {
            Statics.field2702[1].method1781(140, 1);
            arg1.method3385(class134.field2312, 152, 10, 16777215, -1);
            Statics.field2702[0].method1781(140, 12);
            arg1.method3385(class134.field2218, 152, 21, 16777215, -1);
        }
        if (Statics.field1305 != null) {
            short var2 = 280;
            if (field347[0] == 0 && field336[0] == 0) {
                Statics.field1305[2].method1781(var2, 4);
            } else {
                Statics.field1305[0].method1781(var2, 4);
            }
            if (field347[0] == 0 && field336[0] == 1) {
                Statics.field1305[3].method1781(var2 + 15, 4);
            } else {
                Statics.field1305[1].method1781(var2 + 15, 4);
            }
            arg0.method3385(class134.field2201, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field347[0] == 1 && field336[0] == 0) {
                Statics.field1305[2].method1781(var3, 4);
            } else {
                Statics.field1305[0].method1781(var3, 4);
            }
            if (field347[0] == 1 && field336[0] == 1) {
                Statics.field1305[3].method1781(var3 + 15, 4);
            } else {
                Statics.field1305[1].method1781(var3 + 15, 4);
            }
            arg0.method3385(class134.field2315, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field347[0] == 2 && field336[0] == 0) {
                Statics.field1305[2].method1781(var4, 4);
            } else {
                Statics.field1305[0].method1781(var4, 4);
            }
            if (field347[0] == 2 && field336[0] == 1) {
                Statics.field1305[3].method1781(var4 + 15, 4);
            } else {
                Statics.field1305[1].method1781(var4 + 15, 4);
            }
            arg0.method3385(class134.field2316, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field347[0] == 3 && field336[0] == 0) {
                Statics.field1305[2].method1781(var5, 4);
            } else {
                Statics.field1305[0].method1781(var5, 4);
            }
            if (field347[0] == 3 && field336[0] == 1) {
                Statics.field1305[3].method1781(var5 + 15, 4);
            } else {
                Statics.field1305[1].method1781(var5 + 15, 4);
            }
            arg0.method3385(class134.field2317, var5 + 32, 17, 16777215, -1);
        }
        class89.method1796(708, 4, 50, 16, 0);
        arg1.method3433(class134.field2195, 733, 16, 16777215, -1);
        field349 = -1;
        if (Statics.field31 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field335) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field335) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field335) {
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
            for (int var20 = 0; var20 < field335; var20++) {
                class13 var21 = Statics.field2059[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field196);
                if (var21.field196 == -1) {
                    var23 = class134.field2318;
                    var22 = false;
                } else if (var21.field196 > 1980) {
                    var23 = class134.field2319;
                    var22 = false;
                }
                byte var24;
                if (var21.field202) {
                    if (var21.field198) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.field198) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class77.field1391 >= var17 && class77.field1396 >= var16 && class77.field1391 < var6 + var17 && class77.field1396 < var7 + var16 && var22) {
                    field349 = var20;
                    Statics.field31[var24].method1682(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field31[var24].method1680(var17, var16);
                }
                if (Statics.field344 != null) {
                    Statics.field344[(var21.field198 ? 8 : 0) + var21.field199].method1781(var17 + 29, var16);
                }
                arg0.method3433(Integer.toString(var21.field212), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3433(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3361(Statics.field2059[field349].field206) + 6;
                int var26 = arg1.field2855 + 8;
                class89.method1796(class77.field1391 - var25 / 2, class77.field1396 + 20 + 5, var25, var26, 16777120);
                class89.method1829(class77.field1391 - var25 / 2, class77.field1396 + 20 + 5, var25, var26, 0);
                arg1.method3433(Statics.field2059[field349].field206, class77.field1391, class77.field1396 + 20 + 5 + arg1.field2855 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field132.getGraphics();
            Statics.field263.method1587(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field132.repaint();
        }
    }

    @ObfuscatedName("b.p(Lbs;I)V")
    public static void method233(class73 arg0) {
        if (class77.field1390 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1398 >= var1 && class77.field1398 <= var1 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(0, 0);
            return;
        }
        if (class77.field1398 >= var1 + 15 && class77.field1398 <= var1 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1398 >= var2 && class77.field1398 <= var2 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(1, 0);
            return;
        }
        if (class77.field1398 >= var2 + 15 && class77.field1398 <= var2 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1398 >= var3 && class77.field1398 <= var3 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(2, 0);
            return;
        }
        if (class77.field1398 >= var3 + 15 && class77.field1398 <= var3 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1398 >= var4 && class77.field1398 <= var4 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(3, 0);
            return;
        }
        if (class77.field1398 >= var4 + 15 && class77.field1398 <= var4 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method550(3, 1);
            return;
        }
        if (class77.field1398 >= 708 && class77.field1385 >= 4 && class77.field1398 <= 758 && class77.field1385 <= 20) {
            field345 = false;
            Statics.field318.method1680(0, 0);
            Statics.field333.method1680(382, 0);
            Statics.field320.method1781(382 - Statics.field320.field1476 / 2, 18);
            return;
        }
        if (field349 == -1) {
            return;
        }
        class13 var5 = Statics.field2059[field349];
        if (client.field654 != var5.field198) {
            client.field654 = var5.field198;
            class40.method168(var5.field198);
        }
        Statics.field1186 = var5.field197;
        client.field702 = var5.field212;
        Statics.field260 = client.field484 == 0 ? 43594 : var5.field212 + 40000;
        Statics.field516 = client.field484 == 0 ? 443 : var5.field212 + 50000;
        Statics.field1440 = Statics.field260;
        field345 = false;
        Statics.field318.method1680(0, 0);
        Statics.field333.method1680(382, 0);
        Statics.field320.method1781(382 - Statics.field320.field1476 / 2, 18);
        return;
    }

    @ObfuscatedName("at.k(I)V")
    public static void method827() {
        try {
            if (Statics.field172 == null) {
                Statics.field172 = new class24(Statics.field293, new URL(Statics.field1523));
            } else {
                byte[] var0 = Statics.field172.method234();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field335 = var1.method2615();
                    Statics.field2059 = new class13[field335];
                    int var2 = 0;
                    while (var2 < field335) {
                        class13 var3 = Statics.field2059[var2] = new class13();
                        int var4 = var1.method2615();
                        var3.field212 = var4 & 0x3FFF;
                        var3.field198 = (var4 & 0x8000) != 0;
                        var3.field202 = (var4 & 0x4000) != 0;
                        var3.field197 = var1.method2460();
                        var3.field206 = var1.method2460();
                        var3.field199 = var1.method2472();
                        var3.field196 = var1.method2455();
                        var3.field211 = var2++;
                    }
                    method1576(Statics.field2059, 0, Statics.field2059.length - 1, field347, field336);
                    field345 = true;
                    Statics.field172 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field172 = null;
        }
    }

    @ObfuscatedName("aa.r(IIB)V")
    public static void method550(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field347[var5] != arg0) {
                var2[var4] = field347[var5];
                var3[var4] = field336[var5];
                var4++;
            }
        }
        field347 = var2;
        field336 = var3;
        method1576(Statics.field2059, 0, Statics.field2059.length - 1, field347, field336);
    }

    @ObfuscatedName("cq.l([Ls;II[I[IS)V")
    public static void method1576(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class13 var8 = arg0[var7];
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
                        var11 = arg0[var6].field211;
                        var12 = var8.field211;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field196;
                        var12 = var8.field196;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field198 ? 1 : 0;
                        var12 = var8.field198 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field212;
                        var12 = var8.field212;
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
                        var15 = arg0[var5].field211;
                        var16 = var8.field211;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field196;
                        var16 = var8.field196;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field198 ? 1 : 0;
                        var16 = var8.field198 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field212;
                        var16 = var8.field212;
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
                class13 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1576(arg0, arg1, var6, arg3, arg4);
        method1576(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
