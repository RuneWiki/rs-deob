package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("k")
public class class21 {

    @ObfuscatedName("k.l")
    public static int[] field310 = new int[256];

    @ObfuscatedName("k.j")
    public static int field301 = 0;

    @ObfuscatedName("k.x")
    public static int field315 = 0;

    @ObfuscatedName("k.c")
    public static int field303 = 0;

    @ObfuscatedName("k.u")
    public static int field327 = 0;

    @ObfuscatedName("k.ah")
    public static int field305 = 0;

    @ObfuscatedName("k.az")
    public static int field306 = 0;

    @ObfuscatedName("k.au")
    public static int field307 = 10;

    @ObfuscatedName("k.ae")
    public static String field308 = "";

    @ObfuscatedName("k.aa")
    public static int field309 = 0;

    @ObfuscatedName("k.av")
    public static String field314 = "";

    @ObfuscatedName("k.aq")
    public static String field311 = "";

    @ObfuscatedName("k.ak")
    public static String field321 = "";

    @ObfuscatedName("k.ad")
    public static String field298 = "";

    @ObfuscatedName("k.at")
    public static String field294 = "";

    @ObfuscatedName("k.an")
    public static int field312 = 0;

    @ObfuscatedName("k.aw")
    public static String field300 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("k.af")
    public static boolean field317 = false;

    @ObfuscatedName("k.ai")
    public static int field296 = 0;

    @ObfuscatedName("k.bp")
    public static int[] field329 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("k.bm")
    public static int[] field322 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("k.ba")
    public static int field323 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.g(Lbo;B)V")
    public static void method86(class73 arg0) {
        if (field317) {
            method2342(arg0);
            return;
        }
        if (class77.field1390 == 1 && class77.field1391 >= 715 && class77.field1398 >= 453) {
            Statics.field2014.field177 = !Statics.field2014.field177;
            class12.method2818();
            if (Statics.field2014.field177) {
                Statics.field1752.method2712();
                class138.field2324 = 1;
                Statics.field2320 = null;
            } else {
                class154 var1 = Statics.field652;
                int var2 = var1.method3015("scape main");
                int var3 = var1.method2984(var2, "");
                class138.method98(var1, var2, var3, 255, false);
            }
        }
        if (client.field474 == 5) {
            return;
        }
        field305++;
        if (client.field474 != 10) {
            return;
        }
        if (client.field573 == 0) {
            if (class77.field1390 == 1) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class77.field1391 >= var4 && class77.field1391 <= var4 + var6 && class77.field1398 >= var5 && class77.field1398 <= var5 + var7) {
                    method29();
                    return;
                }
            }
            if (Statics.field2817 != null) {
                method29();
            }
        }
        int var8 = class77.field1390;
        int var9 = class77.field1391;
        int var10 = class77.field1398;
        if (field309 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field309 = 3;
                field312 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field314 = class134.field2269;
                field311 = class134.field2273;
                field321 = class134.field2271;
                field309 = 2;
                field312 = 0;
            }
        } else if (field309 == 2) {
            short var14 = 231;
            int var22 = var14 + 30;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field312 = 0;
            }
            var22 += 15;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field312 = 1;
            }
            var22 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field298 = field298.trim();
                if (field298.length() == 0) {
                    method129(class134.field2127, class134.field2180, class134.field2181);
                    return;
                }
                if (field294.length() == 0) {
                    method129(class134.field2102, class134.field2101, class134.field2184);
                    return;
                }
                method129(class134.field2274, class134.field2106, class134.field2256);
                client.method541(20);
                return;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field309 = 0;
                field298 = "";
                field294 = "";
            }
            while (true) {
                while (class75.method2640()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field300.length(); var19++) {
                        if (Statics.field1257 == field300.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (field312 == 0) {
                        if (Statics.field1354 == 85 && field298.length() > 0) {
                            field298 = field298.substring(0, field298.length() - 1);
                        }
                        if (Statics.field1354 == 84 || Statics.field1354 == 80) {
                            field312 = 1;
                        }
                        if (var18 && field298.length() < 320) {
                            field298 = field298 + Statics.field1257;
                        }
                    } else if (field312 == 1) {
                        if (Statics.field1354 == 85 && field294.length() > 0) {
                            field294 = field294.substring(0, field294.length() - 1);
                        }
                        if (Statics.field1354 == 84 || Statics.field1354 == 80) {
                            field312 = 0;
                        }
                        if (Statics.field1354 == 84) {
                            field298 = field298.trim();
                            if (field298.length() == 0) {
                                method129(class134.field2127, class134.field2180, class134.field2181);
                                return;
                            }
                            if (field294.length() == 0) {
                                method129(class134.field2102, class134.field2101, class134.field2184);
                                return;
                            }
                            method129(class134.field2274, class134.field2106, class134.field2256);
                            client.method541(20);
                            return;
                        }
                        if (var18 && field294.length() < 20) {
                            field294 = field294 + Statics.field1257;
                        }
                    }
                }
                return;
            }
        } else if (field309 == 3) {
            short var20 = 382;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field309 = 0;
            }
        }
    }

    @ObfuscatedName("dj.m(Lgb;Lgb;I)V")
    public static void method2188(class183 arg0, class183 arg1) {
        if (field317) {
            method1552(arg0, arg1);
            return;
        }
        if (client.field474 == 0 || client.field474 == 5) {
            byte var2 = 20;
            arg0.method3433(class134.field2268, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1775(230, var3, 304, 34, 9179409);
            class89.method1775(231, var3 + 1, 302, 32, 0);
            class89.method1819(232, var3 + 2, field307 * 3, 30, 9179409);
            class89.method1819(field307 * 3 + 232, var3 + 2, 300 - field307 * 3, 30, 0);
            arg0.method3433(field308, 382, 276 - var2, 16777215, -1);
        }
        if (client.field474 == 20) {
            Statics.field293.method1755(382 - Statics.field293.field1483 / 2, 271 - Statics.field293.field1479 / 2);
            short var4 = 211;
            arg0.method3433(field314, 382, var4, 16776960, 0);
            int var58 = var4 + 15;
            arg0.method3433(field311, 382, var58, 16776960, 0);
            int var59 = var58 + 15;
            arg0.method3433(field321, 382, var59, 16776960, 0);
            int var60 = var59 + 15;
            int var61 = var60 + 10;
            arg0.method3390(class134.field2275, 272, var61, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field298; arg0.method3465(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3390(class185.method3389(var6), 312, var61, 16777215, 0);
            var58 = var61 + 15;
            arg0.method3390(class134.field2135 + class147.method1412(field294), 274, var58, 16777215, 0);
            var58 += 15;
        }
        if (client.field474 == 10) {
            Statics.field293.method1755(202, 171);
            if (field309 == 0) {
                short var7 = 251;
                arg0.method3433(class134.field2199, 382, var7, 16776960, 0);
                int var62 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field295.method1755(var8 - 73, var9 - 20);
                arg0.method3446(class134.field2278, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field295.method1755(var10 - 73, var9 - 20);
                arg0.method3446(class134.field2168, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field309 == 2) {
                short var11 = 211;
                arg0.method3433(field314, 382, var11, 16776960, 0);
                int var63 = var11 + 15;
                arg0.method3433(field311, 382, var63, 16776960, 0);
                int var64 = var63 + 15;
                arg0.method3433(field321, 382, var64, 16776960, 0);
                int var65 = var64 + 15;
                int var66 = var65 + 10;
                arg0.method3390(class134.field2275, 272, var66, 16777215, 0);
                short var12 = 200;
                String var13;
                for (var13 = field298; arg0.method3465(var13) > var12; var13 = var13.substring(1)) {
                }
                arg0.method3390(class185.method3389(var13) + (field312 == 0 & client.field476 % 40 < 20 ? class2.method2814(16776960) + class2.field22 : ""), 312, var66, 16777215, 0);
                var63 = var66 + 15;
                arg0.method3390(class134.field2135 + class147.method1412(field294) + (field312 == 1 & client.field476 % 40 < 20 ? class2.method2814(16776960) + class2.field22 : ""), 274, var63, 16777215, 0);
                var63 += 15;
                short var14 = 302;
                short var15 = 321;
                Statics.field295.method1755(var14 - 73, var15 - 20);
                arg0.method3433(class134.field2280, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                Statics.field295.method1755(var16 - 73, var15 - 20);
                arg0.method3433(class134.field2187, var16, var15 + 5, 16777215, 0);
            } else if (field309 == 3) {
                arg0.method3433(class134.field2282, 382, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3433(class134.field2080, 382, var17, 16777215, 0);
                int var67 = var17 + 15;
                arg0.method3433(class134.field2267, 382, var67, 16777215, 0);
                int var68 = var67 + 15;
                arg0.method3433(class134.field2205, 382, var68, 16777215, 0);
                int var69 = var68 + 15;
                arg0.method3433(class134.field2286, 382, var69, 16777215, 0);
                int var70 = var69 + 15;
                short var18 = 382;
                short var19 = 321;
                Statics.field295.method1755(var18 - 73, var19 - 20);
                arg0.method3433(class134.field2187, var18, var19 + 5, 16777215, 0);
            }
        }
        if (field305 > 0) {
            int var20 = field305;
            short var21 = 256;
            field303 += var20 * 128;
            if (field303 > Statics.field2313.length) {
                field303 -= Statics.field2313.length;
                int var22 = (int) (Math.random() * 12.0D);
                method812(Statics.field316[var22]);
            }
            int var23 = 0;
            int var24 = var20 * 128;
            int var25 = (var21 - var20) * 128;
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = Statics.field2055[var23 + var24] - Statics.field2313[field303 + var23 & Statics.field2313.length - 1] * var20 / 6;
                if (var27 < 0) {
                    var27 = 0;
                }
                Statics.field2055[var23++] = var27;
            }
            for (int var28 = var21 - var20; var28 < var21; var28++) {
                int var29 = var28 * 128;
                for (int var30 = 0; var30 < 128; var30++) {
                    int var31 = (int) (Math.random() * 100.0D);
                    if (var31 < 50 && var30 > 10 && var30 < 118) {
                        Statics.field2055[var29 + var30] = 255;
                    } else {
                        Statics.field2055[var29 + var30] = 0;
                    }
                }
            }
            if (field301 > 0) {
                field301 -= var20 * 4;
            }
            if (field315 > 0) {
                field315 -= var20 * 4;
            }
            if (field301 == 0 && field315 == 0) {
                int var32 = (int) (Math.random() * (double) (2000 / var20));
                if (var32 == 0) {
                    field301 = 1024;
                }
                if (var32 == 1) {
                    field315 = 1024;
                }
            }
            for (int var33 = 0; var33 < var21 - var20; var33++) {
                field310[var33] = field310[var20 + var33];
            }
            for (int var34 = var21 - var20; var34 < var21; var34++) {
                field310[var34] = (int) (Math.sin((double) field306 / 14.0D) * 16.0D + Math.sin((double) field306 / 15.0D) * 14.0D + Math.sin((double) field306 / 16.0D) * 12.0D);
                field306++;
            }
            field327 += var20 * -731607119;
            int var35 = ((client.field476 & 0x1) + var20) / 2;
            if (var35 > 0) {
                for (int var36 = 0; var36 < field327 * -1421155420; var36++) {
                    int var37 = (int) (Math.random() * 124.0D) + 2;
                    int var38 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2055[(var38 << 7) + var37] = 192;
                }
                field327 = 0;
                int var39 = 0;
                label193: while (true) {
                    if (var39 >= var21) {
                        int var43 = 0;
                        while (true) {
                            if (var43 >= 128) {
                                break label193;
                            }
                            int var44 = 0;
                            for (int var45 = -var35; var45 < var21; var45++) {
                                int var46 = var45 * 128;
                                if (var35 + var45 < var21) {
                                    var44 += Statics.field109[var35 * 128 + var43 + var46];
                                }
                                if (var45 - (var35 + 1) >= 0) {
                                    var44 -= Statics.field109[var43 + var46 - (var35 + 1) * 128];
                                }
                                if (var45 >= 0) {
                                    Statics.field2055[var43 + var46] = var44 / (var35 * 2 + 1);
                                }
                            }
                            var43++;
                        }
                    }
                    int var40 = 0;
                    int var41 = var39 * 128;
                    for (int var42 = -var35; var42 < 128; var42++) {
                        if (var35 + var42 < 128) {
                            var40 += Statics.field2055[var41 + var42 + var35];
                        }
                        if (var42 - (var35 + 1) >= 0) {
                            var40 -= Statics.field2055[var41 + var42 - (var35 + 1)];
                        }
                        if (var42 >= 0) {
                            Statics.field109[var41 + var42] = var40 / (var35 * 2 + 1);
                        }
                    }
                    var39++;
                }
            }
            field305 = 0;
        }
        method692();
        Statics.field304[Statics.field2014.field177 ? 1 : 0].method1755(725, 463);
        if (client.field474 > 5 && client.field573 == 0) {
            if (Statics.field237 == null) {
                class154 var51 = Statics.field1022;
                int var52 = var51.method3015("sl_button");
                int var53 = var51.method2984(var52, "");
                class87 var54 = Statics.method235(var51, var52, var53);
                Statics.field237 = var54;
            } else {
                byte var47 = 5;
                short var48 = 463;
                byte var49 = 100;
                byte var50 = 35;
                Statics.field237.method1755(var47, var48);
                arg0.method3433(class134.field2158 + " " + client.field639, var49 / 2 + var47, var50 / 2 + var48 - 2, 16777215, 0);
                if (Statics.field2817 == null) {
                    arg1.method3433(class134.field2152, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                } else {
                    arg1.method3433(class134.field2296, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var55 = Statics.field2330.getGraphics();
            Statics.field2704.method1587(var55, 0, 0);
        } catch (Exception var57) {
            Statics.field2330.repaint();
        }
    }

    @ObfuscatedName("p.v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method129(String arg0, String arg1, String arg2) {
        field314 = arg0;
        field311 = arg1;
        field321 = arg2;
    }

    @ObfuscatedName("am.r(Lcp;I)V")
    public static final void method812(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2313.length; var2++) {
            Statics.field2313[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2313[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field60[var8] = (Statics.field2313[var8 - 1] + Statics.field2313[var8 + 1] + Statics.field2313[var8 - 128] + Statics.field2313[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2313;
            Statics.field2313 = Statics.field60;
            Statics.field60 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1479; var11++) {
            for (int var12 = 0; var12 < arg0.field1483; var12++) {
                if (arg0.field1482[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1480;
                    int var14 = var11 + 16 + arg0.field1481;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2313[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("x.n(IIII)I")
    public static final int method158(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("aq.i(I)V")
    public static final void method692() {
        short var0 = 256;
        if (field301 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field301 > 768) {
                    Statics.field168[var1] = method158(Statics.field255[var1], Statics.field248[var1], 1024 - field301);
                } else if (field301 > 256) {
                    Statics.field168[var1] = Statics.field248[var1];
                } else {
                    Statics.field168[var1] = method158(Statics.field248[var1], Statics.field255[var1], 256 - field301);
                }
            }
        } else if (field315 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field315 > 768) {
                    Statics.field168[var2] = method158(Statics.field255[var2], Statics.field1662[var2], 1024 - field315);
                } else if (field315 > 256) {
                    Statics.field168[var2] = Statics.field1662[var2];
                } else {
                    Statics.field168[var2] = method158(Statics.field1662[var2], Statics.field255[var2], 256 - field315);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field168[var3] = Statics.field255[var3];
            }
        }
        class89.method1799(0, 9, 128, var0 + 7);
        Statics.field297.method1677(0, 0);
        class89.method1815();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field310[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2055[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field168[var10];
                    int var14 = Statics.field2704.field1462[var5];
                    Statics.field2704.field1462[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1799(637, 9, 765, var0 + 7);
        Statics.field2818.method1677(382, 0);
        class89.method1815();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field310[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2055[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field168[var22];
                    int var26 = Statics.field2704.field1462[var20];
                    Statics.field2704.field1462[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bb.s(Lgb;Lgb;I)V")
    public static void method1552(class183 arg0, class183 arg1) {
        if (Statics.field957 == null) {
            Statics.field957 = Statics.method2184(Statics.field1022, "sl_back", "");
        }
        if (Statics.field318 == null) {
            Statics.field318 = Statics.method186(Statics.field1022, "sl_flags", "");
        }
        if (Statics.field939 == null) {
            Statics.field939 = Statics.method186(Statics.field1022, "sl_arrows", "");
        }
        if (Statics.field1334 == null) {
            Statics.field1334 = Statics.method186(Statics.field1022, "sl_stars", "");
        }
        class89.method1819(0, 23, 765, 480, 0);
        class89.method1774(0, 0, 125, 23, 12425273, 9135624);
        class89.method1774(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3433(class134.field2069, 62, 15, 0, -1);
        if (Statics.field1334 != null) {
            Statics.field1334[1].method1755(140, 1);
            arg1.method3390(class134.field2288, 152, 10, 16777215, -1);
            Statics.field1334[0].method1755(140, 12);
            arg1.method3390(class134.field2289, 152, 21, 16777215, -1);
        }
        if (Statics.field939 != null) {
            short var2 = 280;
            if (field329[0] == 0 && field322[0] == 0) {
                Statics.field939[2].method1755(var2, 4);
            } else {
                Statics.field939[0].method1755(var2, 4);
            }
            if (field329[0] == 0 && field322[0] == 1) {
                Statics.field939[3].method1755(var2 + 15, 4);
            } else {
                Statics.field939[1].method1755(var2 + 15, 4);
            }
            arg0.method3390(class134.field2290, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field329[0] == 1 && field322[0] == 0) {
                Statics.field939[2].method1755(var3, 4);
            } else {
                Statics.field939[0].method1755(var3, 4);
            }
            if (field329[0] == 1 && field322[0] == 1) {
                Statics.field939[3].method1755(var3 + 15, 4);
            } else {
                Statics.field939[1].method1755(var3 + 15, 4);
            }
            arg0.method3390(class134.field2291, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field329[0] == 2 && field322[0] == 0) {
                Statics.field939[2].method1755(var4, 4);
            } else {
                Statics.field939[0].method1755(var4, 4);
            }
            if (field329[0] == 2 && field322[0] == 1) {
                Statics.field939[3].method1755(var4 + 15, 4);
            } else {
                Statics.field939[1].method1755(var4 + 15, 4);
            }
            arg0.method3390(class134.field2292, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field329[0] == 3 && field322[0] == 0) {
                Statics.field939[2].method1755(var5, 4);
            } else {
                Statics.field939[0].method1755(var5, 4);
            }
            if (field329[0] == 3 && field322[0] == 1) {
                Statics.field939[3].method1755(var5 + 15, 4);
            } else {
                Statics.field939[1].method1755(var5 + 15, 4);
            }
            arg0.method3390(class134.field2293, var5 + 32, 17, 16777215, -1);
        }
        class89.method1819(708, 4, 50, 16, 0);
        arg1.method3433(class134.field2187, 733, 16, 16777215, -1);
        field323 = -1;
        if (Statics.field957 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field296) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field296) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field296) {
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
            for (int var20 = 0; var20 < field296; var20++) {
                class13 var21 = Statics.field1825[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field184);
                if (var21.field184 == -1) {
                    var23 = class134.field2160;
                    var22 = false;
                } else if (var21.field184 > 1980) {
                    var23 = class134.field2295;
                    var22 = false;
                }
                if (class77.field1384 >= var17 && class77.field1385 >= var16 && class77.field1384 < var6 + var17 && class77.field1385 < var7 + var16 && var22) {
                    field323 = var20;
                    Statics.field957[var21.field189 ? 1 : 0].method1661(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field957[var21.field189 ? 1 : 0].method1677(var17, var16);
                }
                if (Statics.field318 != null) {
                    Statics.field318[(var21.field189 ? 8 : 0) + var21.field194].method1755(var17 + 29, var16);
                }
                arg0.method3433(Integer.toString(var21.field185), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
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
                int var24 = arg1.method3465(Statics.field1825[field323].field183) + 6;
                int var25 = arg1.field2841 + 8;
                class89.method1819(class77.field1384 - var24 / 2, class77.field1385 + 20 + 5, var24, var25, 16777120);
                class89.method1775(class77.field1384 - var24 / 2, class77.field1385 + 20 + 5, var24, var25, 0);
                arg1.method3433(Statics.field1825[field323].field183, class77.field1384, class77.field1385 + 20 + 5 + arg1.field2841 + 4, 0, -1);
            }
        }
        try {
            Graphics var26 = Statics.field2330.getGraphics();
            Statics.field2704.method1587(var26, 0, 0);
        } catch (Exception var28) {
            Statics.field2330.repaint();
        }
    }

    @ObfuscatedName("dd.w(Lbo;I)V")
    public static void method2342(class73 arg0) {
        if (class77.field1390 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1391 >= var1 && class77.field1391 <= var1 + 14 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(0, 0);
            return;
        }
        if (class77.field1391 >= var1 + 15 && class77.field1391 <= var1 + 80 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1391 >= var2 && class77.field1391 <= var2 + 14 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(1, 0);
            return;
        }
        if (class77.field1391 >= var2 + 15 && class77.field1391 <= var2 + 80 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1391 >= var3 && class77.field1391 <= var3 + 14 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(2, 0);
            return;
        }
        if (class77.field1391 >= var3 + 15 && class77.field1391 <= var3 + 80 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1391 >= var4 && class77.field1391 <= var4 + 14 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(3, 0);
            return;
        }
        if (class77.field1391 >= var4 + 15 && class77.field1391 <= var4 + 80 && class77.field1398 >= 4 && class77.field1398 <= 18) {
            method149(3, 1);
            return;
        }
        if (class77.field1391 >= 708 && class77.field1398 >= 4 && class77.field1391 <= 758 && class77.field1398 <= 20) {
            field317 = false;
            Statics.field297.method1677(0, 0);
            Statics.field2818.method1677(382, 0);
            Statics.field1171.method1755(382 - Statics.field1171.field1483 / 2, 18);
            return;
        }
        if (field323 == -1) {
            return;
        }
        class13 var5 = Statics.field1825[field323];
        if (client.field714 != var5.field189) {
            client.field714 = var5.field189;
            boolean var6 = var5.field189;
            if (Statics.field978 != var6) {
                class40.field979.method3251();
                class40.field980.method3251();
                class40.field981.method3251();
                Statics.field978 = var6;
            }
        }
        Statics.field245 = var5.field196;
        client.field639 = var5.field185;
        Statics.field734 = client.field469 == 0 ? 43594 : var5.field185 + 40000;
        Statics.field127 = client.field469 == 0 ? 443 : var5.field185 + 50000;
        Statics.field87 = Statics.field734;
        field317 = false;
        Statics.field297.method1677(0, 0);
        Statics.field2818.method1677(382, 0);
        Statics.field1171.method1755(382 - Statics.field1171.field1483 / 2, 18);
        return;
    }

    @ObfuscatedName("v.d(I)V")
    public static void method29() {
        try {
            if (Statics.field2817 == null) {
                Statics.field2817 = new class24(Statics.field1457, new URL(Statics.field176));
            } else {
                byte[] var0 = Statics.field2817.method197();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field296 = var1.method2416();
                    Statics.field1825 = new class13[field296];
                    int var2 = 0;
                    while (var2 < field296) {
                        class13 var3 = Statics.field1825[var2] = new class13();
                        int var4 = var1.method2416();
                        var3.field185 = var4 & 0x7FFF;
                        var3.field189 = (var4 & 0x8000) != 0;
                        var3.field196 = var1.method2422();
                        var3.field183 = var1.method2422();
                        var3.field194 = var1.method2414();
                        var3.field184 = var1.method2480();
                        var3.field188 = var2++;
                    }
                    method3054(Statics.field1825, 0, Statics.field1825.length - 1, field329, field322);
                    field317 = true;
                    Statics.field2817 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field2817 = null;
        }
    }

    @ObfuscatedName("j.t(IIS)V")
    public static void method149(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field329[var5] != arg0) {
                var2[var4] = field329[var5];
                var3[var4] = field322[var5];
                var4++;
            }
        }
        field329 = var2;
        field322 = var3;
        method3054(Statics.field1825, 0, Statics.field1825.length - 1, field329, field322);
    }

    @ObfuscatedName("ed.f([Lz;II[I[IB)V")
    public static void method3054(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field188;
                        var12 = var8.field188;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field184;
                        var12 = var8.field184;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field189 ? 1 : 0;
                        var12 = var8.field189 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field185;
                        var12 = var8.field185;
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
                        var15 = arg0[var5].field188;
                        var16 = var8.field188;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field184;
                        var16 = var8.field184;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field189 ? 1 : 0;
                        var16 = var8.field189 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field185;
                        var16 = var8.field185;
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
        method3054(arg0, arg1, var6, arg3, arg4);
        method3054(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
