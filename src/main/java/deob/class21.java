package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("w")
public class class21 {

    @ObfuscatedName("w.v")
    public static int[] field303 = new int[256];

    @ObfuscatedName("w.m")
    public static int field305 = 0;

    @ObfuscatedName("w.z")
    public static int field306 = 0;

    @ObfuscatedName("w.p")
    public static int field301 = 0;

    @ObfuscatedName("w.i")
    public static int field309 = 0;

    @ObfuscatedName("w.aa")
    public static int field310 = 0;

    @ObfuscatedName("w.ax")
    public static int field311 = 0;

    @ObfuscatedName("w.ad")
    public static int field312 = 10;

    @ObfuscatedName("w.af")
    public static String field313 = "";

    @ObfuscatedName("w.ai")
    public static int field314 = 0;

    @ObfuscatedName("w.ag")
    public static String field297 = "";

    @ObfuscatedName("w.an")
    public static String field331 = "";

    @ObfuscatedName("w.ac")
    public static String field317 = "";

    @ObfuscatedName("w.al")
    public static String field318 = "";

    @ObfuscatedName("w.at")
    public static String field319 = "";

    @ObfuscatedName("w.ah")
    public static int field326 = 0;

    @ObfuscatedName("w.am")
    public static String field321 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("w.aq")
    public static boolean field315 = false;

    @ObfuscatedName("w.ay")
    public static int field323 = 0;

    @ObfuscatedName("w.bg")
    public static int[] field325 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("w.br")
    public static int[] field304 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("w.bw")
    public static int field322 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.f(Leo;Leo;B)I")
    public static int method1567(class153 arg0, class153 arg1) {
        int var2 = 0;
        if (arg0.method3052("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3052("logo", "")) {
            var2++;
        }
        if (arg1.method3052("titlebox", "")) {
            var2++;
        }
        if (arg1.method3052("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3052("runes", "")) {
            var2++;
        }
        if (arg1.method3052("title_mute", "")) {
            var2++;
        }
        arg1.method3052("sl_back", "");
        arg1.method3052("sl_flags", "");
        arg1.method3052("sl_arrows", "");
        arg1.method3052("sl_stars", "");
        arg1.method3052("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ch.t(I)I")
    public static int method2052() {
        return 6;
    }

    @ObfuscatedName("s.n(I)V")
    public static void method131() {
        if (!Statics.field300) {
            return;
        }
        Statics.field308 = null;
        Statics.field298 = null;
        Statics.field62 = null;
        Statics.field299 = null;
        Statics.field296 = null;
        Statics.field1503 = null;
        Statics.field190 = null;
        Statics.field948 = null;
        Statics.field2735 = null;
        Statics.field1253 = null;
        Statics.field742 = null;
        Statics.field2007 = null;
        Statics.field320 = null;
        Statics.field1430 = null;
        Statics.field1986 = null;
        Statics.field1258 = null;
        Statics.field2468 = null;
        Statics.field61 = null;
        Statics.field307 = null;
        Statics.field1378 = null;
        class139.method2345(2);
        class154.method36(true);
        Statics.field300 = false;
    }

    @ObfuscatedName("ds.e(Lbm;I)V")
    public static void method2437(class73 arg0) {
        if (field315) {
            method2724(arg0);
            return;
        }
        if (class77.field1383 == 1 && class77.field1384 >= 715 && class77.field1385 >= 453) {
            Statics.field65.field178 = !Statics.field65.field178;
            class12.method1181();
            if (Statics.field65.field178) {
                class139.method840();
            } else {
                class139.method1327(Statics.field2871, "scape main", "", 255, false);
            }
        }
        if (client.field466 == 5) {
            return;
        }
        field310++;
        if (client.field466 != 10) {
            return;
        }
        if (client.field464 == 0) {
            if (class77.field1383 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class77.field1384 >= var1 && class77.field1384 <= var1 + var3 && class77.field1385 >= var2 && class77.field1385 <= var2 + var4) {
                    method3222();
                    return;
                }
            }
            if (Statics.field862 != null) {
                method3222();
            }
        }
        int var5 = class77.field1383;
        int var6 = class77.field1384;
        int var7 = class77.field1385;
        if (field314 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field314 = 3;
                field326 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field459 & 0x4) != 0) {
                    if ((client.field459 & 0x400) == 0) {
                        field297 = class135.field2296;
                        field331 = class135.field2297;
                        field317 = class135.field2298;
                    } else {
                        field297 = class135.field2123;
                        field331 = class135.field2303;
                        field317 = class135.field2201;
                    }
                    field314 = 1;
                    field326 = 0;
                } else if ((client.field459 & 0x400) == 0) {
                    field297 = class135.field2292;
                    field331 = class135.field2293;
                    field317 = class135.field2294;
                    field314 = 2;
                    field326 = 0;
                } else {
                    field297 = class135.field2249;
                    field331 = class135.field2300;
                    field317 = class135.field2301;
                    field314 = 1;
                    field326 = 0;
                }
            }
        } else if (field314 == 1) {
            while (true) {
                class75 var11 = class75.field1346;
                boolean var12;
                synchronized (class75.field1346) {
                    if (class75.field1355 == class75.field1338) {
                        var12 = false;
                    } else {
                        Statics.field346 = class75.field1352[class75.field1355];
                        Statics.field1301 = class75.field1351[class75.field1355];
                        class75.field1355 = class75.field1355 + 1 & 0x7F;
                        var12 = true;
                    }
                }
                if (!var12) {
                    short var14 = 302;
                    short var15 = 321;
                    if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                        field297 = class135.field2292;
                        field331 = class135.field2293;
                        field317 = class135.field2294;
                        field314 = 2;
                        field326 = 0;
                    }
                    short var16 = 462;
                    if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var15 - 20 && var7 <= var15 + 20) {
                        field314 = 0;
                    }
                    break;
                }
                if (Statics.field346 == 84) {
                    field297 = class135.field2292;
                    field331 = class135.field2293;
                    field317 = class135.field2294;
                    field314 = 2;
                    field326 = 0;
                } else if (Statics.field346 == 13) {
                    field314 = 0;
                }
            }
        } else if (field314 == 2) {
            short var17 = 231;
            int var30 = var17 + 30;
            if (var5 == 1 && var7 >= var30 - 15 && var7 < var30) {
                field326 = 0;
            }
            var30 += 15;
            if (var5 == 1 && var7 >= var30 - 15 && var7 < var30) {
                field326 = 1;
            }
            var30 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field318 = field318.trim();
                if (field318.length() == 0) {
                    method147(class135.field2202, class135.field2205, class135.field2320);
                    return;
                }
                if (field319.length() == 0) {
                    method147(class135.field2113, class135.field2255, class135.field2207);
                    return;
                }
                method147(class135.field2305, class135.field2221, class135.field2307);
                client.method766(20);
                return;
            }
            short var20 = 462;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field314 = 0;
                field318 = "";
                field319 = "";
            }
            while (true) {
                while (true) {
                    class75 var21 = class75.field1346;
                    boolean var22;
                    synchronized (class75.field1346) {
                        if (class75.field1355 == class75.field1338) {
                            var22 = false;
                        } else {
                            Statics.field346 = class75.field1352[class75.field1355];
                            Statics.field1301 = class75.field1351[class75.field1355];
                            class75.field1355 = class75.field1355 + 1 & 0x7F;
                            var22 = true;
                        }
                    }
                    if (!var22) {
                        return;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < field321.length(); var25++) {
                        if (Statics.field1301 == field321.charAt(var25)) {
                            var24 = true;
                            break;
                        }
                    }
                    if (Statics.field346 == 13) {
                        field314 = 0;
                        field318 = "";
                        field319 = "";
                    } else if (field326 == 0) {
                        if (Statics.field346 == 85 && field318.length() > 0) {
                            field318 = field318.substring(0, field318.length() - 1);
                        }
                        if (Statics.field346 == 84 || Statics.field346 == 80) {
                            field326 = 1;
                        }
                        if (var24 && field318.length() < 320) {
                            field318 = field318 + Statics.field1301;
                        }
                    } else if (field326 == 1) {
                        if (Statics.field346 == 85 && field319.length() > 0) {
                            field319 = field319.substring(0, field319.length() - 1);
                        }
                        if (Statics.field346 == 84 || Statics.field346 == 80) {
                            field326 = 0;
                        }
                        if (Statics.field346 == 84) {
                            field318 = field318.trim();
                            if (field318.length() == 0) {
                                method147(class135.field2202, class135.field2205, class135.field2320);
                                return;
                            }
                            if (field319.length() == 0) {
                                method147(class135.field2113, class135.field2255, class135.field2207);
                                return;
                            }
                            method147(class135.field2305, class135.field2221, class135.field2307);
                            client.method766(20);
                            return;
                        }
                        if (var24 && field319.length() < 20) {
                            field319 = field319 + Statics.field1301;
                        }
                    }
                }
            }
        } else if (field314 == 3) {
            short var26 = 382;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field314 = 0;
            }
        }
    }

    @ObfuscatedName("j.l(Lgn;Lgn;I)V")
    public static void method148(class183 arg0, class183 arg1) {
        if (field315) {
            method1251(arg0, arg1);
            return;
        }
        if (client.field466 == 0 || client.field466 == 5) {
            byte var2 = 20;
            arg0.method3406(class135.field2291, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1808(230, var3, 304, 34, 9179409);
            class89.method1808(231, var3 + 1, 302, 32, 0);
            class89.method1801(232, var3 + 2, field312 * 3, 30, 9179409);
            class89.method1801(field312 * 3 + 232, var3 + 2, 300 - field312 * 3, 30, 0);
            arg0.method3406(field313, 382, 276 - var2, 16777215, -1);
        }
        if (client.field466 == 20) {
            Statics.field308.method1788(382 - Statics.field308.field1471 / 2, 271 - Statics.field308.field1472 / 2);
            short var4 = 211;
            arg0.method3406(field297, 382, var4, 16776960, 0);
            int var93 = var4 + 15;
            arg0.method3406(field331, 382, var93, 16776960, 0);
            int var94 = var93 + 15;
            arg0.method3406(field317, 382, var94, 16776960, 0);
            int var95 = var94 + 15;
            int var96 = var95 + 10;
            arg0.method3404(class135.field2119, 272, var96, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field318; arg0.method3400(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3404(class185.method3403(var6), 312, var96, 16777215, 0);
            var93 = var96 + 15;
            String var8 = class135.field2266;
            String var9 = field319;
            String var10 = Statics.method119('*', var9.length());
            arg0.method3404(var8 + var10, 274, var93, 16777215, 0);
            var93 += 15;
        }
        if (client.field466 == 10) {
            Statics.field308.method1788(202, 171);
            if (field314 == 0) {
                short var11 = 251;
                arg0.method3406(class135.field2139, 382, var11, 16776960, 0);
                int var97 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field298.method1788(var12 - 73, var13 - 20);
                arg0.method3464(class135.field2311, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field298.method1788(var14 - 73, var13 - 20);
                arg0.method3464(class135.field2171, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field314 == 1) {
                arg0.method3406(class135.field2295, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3406(field297, 382, var15, 16777215, 0);
                int var98 = var15 + 15;
                arg0.method3406(field331, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3406(field317, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                short var16 = 302;
                short var17 = 321;
                Statics.field298.method1788(var16 - 73, var17 - 20);
                arg0.method3406(class135.field2109, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                Statics.field298.method1788(var18 - 73, var17 - 20);
                arg0.method3406(class135.field2102, var18, var17 + 5, 16777215, 0);
            } else if (field314 == 2) {
                short var19 = 211;
                arg0.method3406(field297, 382, var19, 16776960, 0);
                int var101 = var19 + 15;
                arg0.method3406(field331, 382, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3406(field317, 382, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var104 = var103 + 10;
                arg0.method3404(class135.field2119, 272, var104, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = field318; arg0.method3400(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3404(class185.method3403(var21) + (field326 == 0 & client.field484 % 40 < 20 ? class2.method1391(16776960) + class2.field26 : ""), 312, var104, 16777215, 0);
                var101 = var104 + 15;
                String var23 = class135.field2266;
                String var24 = field319;
                String var25 = Statics.method119('*', var24.length());
                arg0.method3404(var23 + var25 + (field326 == 1 & client.field484 % 40 < 20 ? class2.method1391(16776960) + class2.field26 : ""), 274, var101, 16777215, 0);
                var101 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field298.method1788(var26 - 73, var27 - 20);
                arg0.method3406(class135.field2090, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field298.method1788(var28 - 73, var27 - 20);
                arg0.method3406(class135.field2102, var28, var27 + 5, 16777215, 0);
            } else if (field314 == 3) {
                arg0.method3406(class135.field2315, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3406(class135.field2274, 382, var29, 16777215, 0);
                int var105 = var29 + 15;
                arg0.method3406(class135.field2177, 382, var105, 16777215, 0);
                int var106 = var105 + 15;
                arg0.method3406(class135.field2310, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3406(class135.field2319, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                short var30 = 382;
                short var31 = 321;
                Statics.field298.method1788(var30 - 73, var31 - 20);
                arg0.method3406(class135.field2102, var30, var31 + 5, 16777215, 0);
            }
        }
        if (field310 > 0) {
            int var32 = field310;
            short var33 = 256;
            field301 += var32 * 128;
            if (field301 > Statics.field2468.length) {
                field301 -= Statics.field2468.length;
                int var34 = (int) (Math.random() * 12.0D);
                method805(Statics.field62[var34]);
            }
            int var35 = 0;
            int var36 = var32 * 128;
            int var37 = (var33 - var32) * 128;
            for (int var38 = 0; var38 < var37; var38++) {
                int var39 = Statics.field307[var35 + var36] - Statics.field2468[field301 + var35 & Statics.field2468.length - 1] * var32 / 6;
                if (var39 < 0) {
                    var39 = 0;
                }
                Statics.field307[var35++] = var39;
            }
            for (int var40 = var33 - var32; var40 < var33; var40++) {
                int var41 = var40 * 128;
                for (int var42 = 0; var42 < 128; var42++) {
                    int var43 = (int) (Math.random() * 100.0D);
                    if (var43 < 50 && var42 > 10 && var42 < 118) {
                        Statics.field307[var41 + var42] = 255;
                    } else {
                        Statics.field307[var41 + var42] = 0;
                    }
                }
            }
            if (field305 > 0) {
                field305 -= var32 * 4;
            }
            if (field306 > 0) {
                field306 -= var32 * 4;
            }
            if (field305 == 0 && field306 == 0) {
                int var44 = (int) (Math.random() * (double) (2000 / var32));
                if (var44 == 0) {
                    field305 = 1024;
                }
                if (var44 == 1) {
                    field306 = 1024;
                }
            }
            for (int var45 = 0; var45 < var33 - var32; var45++) {
                field303[var45] = field303[var32 + var45];
            }
            for (int var46 = var33 - var32; var46 < var33; var46++) {
                field303[var46] = (int) (Math.sin((double) field311 / 14.0D) * 16.0D + Math.sin((double) field311 / 15.0D) * 14.0D + Math.sin((double) field311 / 16.0D) * 12.0D);
                field311++;
            }
            field309 += var32 * 1471093185;
            int var47 = ((client.field484 & 0x1) + var32) / 2;
            if (var47 > 0) {
                for (int var48 = 0; var48 < field309 * 1856778596; var48++) {
                    int var49 = (int) (Math.random() * 124.0D) + 2;
                    int var50 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field307[(var50 << 7) + var49] = 192;
                }
                field309 = 0;
                int var51 = 0;
                label288: while (true) {
                    if (var51 >= var33) {
                        int var55 = 0;
                        while (true) {
                            if (var55 >= 128) {
                                break label288;
                            }
                            int var56 = 0;
                            for (int var57 = -var47; var57 < var33; var57++) {
                                int var58 = var57 * 128;
                                if (var47 + var57 < var33) {
                                    var56 += Statics.field1378[var47 * 128 + var55 + var58];
                                }
                                if (var57 - (var47 + 1) >= 0) {
                                    var56 -= Statics.field1378[var55 + var58 - (var47 + 1) * 128];
                                }
                                if (var57 >= 0) {
                                    Statics.field307[var55 + var58] = var56 / (var47 * 2 + 1);
                                }
                            }
                            var55++;
                        }
                    }
                    int var52 = 0;
                    int var53 = var51 * 128;
                    for (int var54 = -var47; var54 < 128; var54++) {
                        if (var47 + var54 < 128) {
                            var52 += Statics.field307[var53 + var54 + var47];
                        }
                        if (var54 - (var47 + 1) >= 0) {
                            var52 -= Statics.field307[var53 + var54 - (var47 + 1)];
                        }
                        if (var54 >= 0) {
                            Statics.field1378[var53 + var54] = var52 / (var47 * 2 + 1);
                        }
                    }
                    var51++;
                }
            }
            field310 = 0;
        }
        short var59 = 256;
        if (field305 > 0) {
            for (int var60 = 0; var60 < 256; var60++) {
                if (field305 > 768) {
                    Statics.field1258[var60] = method128(Statics.field320[var60], Statics.field1430[var60], 1024 - field305);
                } else if (field305 > 256) {
                    Statics.field1258[var60] = Statics.field1430[var60];
                } else {
                    Statics.field1258[var60] = method128(Statics.field1430[var60], Statics.field320[var60], 256 - field305);
                }
            }
        } else if (field306 > 0) {
            for (int var61 = 0; var61 < 256; var61++) {
                if (field306 > 768) {
                    Statics.field1258[var61] = method128(Statics.field320[var61], Statics.field1986[var61], 1024 - field306);
                } else if (field306 > 256) {
                    Statics.field1258[var61] = Statics.field1986[var61];
                } else {
                    Statics.field1258[var61] = method128(Statics.field1986[var61], Statics.field320[var61], 256 - field306);
                }
            }
        } else {
            for (int var62 = 0; var62 < 256; var62++) {
                Statics.field1258[var62] = Statics.field320[var62];
            }
        }
        class89.method1825(0, 9, 128, var59 + 7);
        Statics.field299.method1707(0, 0);
        class89.method1799();
        int var63 = 0;
        int var64 = 6885;
        for (int var65 = 1; var65 < var59 - 1; var65++) {
            int var66 = (var59 - var65) * field303[var65] / var59;
            int var67 = var66 + 22;
            if (var67 < 0) {
                var67 = 0;
            }
            var63 += var67;
            for (int var68 = var67; var68 < 128; var68++) {
                int var69 = Statics.field307[var63++];
                if (var69 == 0) {
                    var64++;
                } else {
                    int var71 = 256 - var69;
                    int var72 = Statics.field1258[var69];
                    int var73 = Statics.field1289.field1455[var64];
                    Statics.field1289.field1455[var64++] = ((var72 & 0xFF00FF) * var69 + (var73 & 0xFF00FF) * var71 & 0xFF00FF00) + ((var72 & 0xFF00) * var69 + (var73 & 0xFF00) * var71 & 0xFF0000) >> 8;
                }
            }
            var64 += var67 + 765 - 128;
        }
        class89.method1825(637, 9, 765, var59 + 7);
        Statics.field296.method1707(382, 0);
        class89.method1799();
        int var74 = 0;
        int var75 = 7546;
        for (int var76 = 1; var76 < var59 - 1; var76++) {
            int var77 = (var59 - var76) * field303[var76] / var59;
            int var78 = 103 - var77;
            int var79 = var75 + var77;
            for (int var80 = 0; var80 < var78; var80++) {
                int var81 = Statics.field307[var74++];
                if (var81 == 0) {
                    var79++;
                } else {
                    int var83 = 256 - var81;
                    int var84 = Statics.field1258[var81];
                    int var85 = Statics.field1289.field1455[var79];
                    Statics.field1289.field1455[var79++] = ((var84 & 0xFF00FF) * var81 + (var85 & 0xFF00FF) * var83 & 0xFF00FF00) + ((var84 & 0xFF00) * var81 + (var85 & 0xFF00) * var83 & 0xFF0000) >> 8;
                }
            }
            var74 += 128 - var78;
            var75 = 765 - var78 - var77 + var79;
        }
        Statics.field190[Statics.field65.field178 ? 1 : 0].method1788(725, 463);
        if (client.field466 > 5 && client.field464 == 0) {
            if (Statics.field2007 == null) {
                Statics.field2007 = class84.method1875(Statics.field130, "sl_button", "");
            } else {
                byte var86 = 5;
                short var87 = 463;
                byte var88 = 100;
                byte var89 = 35;
                Statics.field2007.method1788(var86, var87);
                arg0.method3406(class135.field2179 + " " + client.field638, var88 / 2 + var86, var89 / 2 + var87 - 2, 16777215, 0);
                if (Statics.field862 == null) {
                    arg1.method3406(class135.field2330, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                } else {
                    arg1.method3406(class135.field2329, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var90 = Statics.field268.getGraphics();
            Statics.field1289.method1626(var90, 0, 0);
        } catch (Exception var92) {
            Statics.field268.repaint();
        }
    }

    @ObfuscatedName("j.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method147(String arg0, String arg1, String arg2) {
        field297 = arg0;
        field331 = arg1;
        field317 = arg2;
    }

    @ObfuscatedName("am.r(Lcy;S)V")
    public static final void method805(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2468.length; var2++) {
            Statics.field2468[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2468[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field61[var8] = (Statics.field2468[var8 - 1] + Statics.field2468[var8 + 1] + Statics.field2468[var8 - 128] + Statics.field2468[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2468;
            Statics.field2468 = Statics.field61;
            Statics.field61 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1472; var11++) {
            for (int var12 = 0; var12 < arg0.field1471; var12++) {
                if (arg0.field1470[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1473;
                    int var14 = var11 + 16 + arg0.field1476;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2468[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("s.k(IIII)I")
    public static final int method128(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bw.u(Lgn;Lgn;I)V")
    public static void method1251(class183 arg0, class183 arg1) {
        if (Statics.field948 == null) {
            Statics.field948 = class84.method1601(Statics.field130, "sl_back", "");
        }
        if (Statics.field2735 == null) {
            Statics.field2735 = class84.method23(Statics.field130, "sl_flags", "");
        }
        if (Statics.field1253 == null) {
            Statics.field1253 = class84.method23(Statics.field130, "sl_arrows", "");
        }
        if (Statics.field742 == null) {
            Statics.field742 = class84.method23(Statics.field130, "sl_stars", "");
        }
        class89.method1801(0, 23, 765, 480, 0);
        class89.method1807(0, 0, 125, 23, 12425273, 9135624);
        class89.method1807(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3406(class135.field2147, 62, 15, 0, -1);
        if (Statics.field742 != null) {
            Statics.field742[1].method1788(140, 1);
            arg1.method3404(class135.field2110, 152, 10, 16777215, -1);
            Statics.field742[0].method1788(140, 12);
            arg1.method3404(class135.field2322, 152, 21, 16777215, -1);
        }
        if (Statics.field1253 != null) {
            short var2 = 280;
            if (field325[0] == 0 && field304[0] == 0) {
                Statics.field1253[2].method1788(var2, 4);
            } else {
                Statics.field1253[0].method1788(var2, 4);
            }
            if (field325[0] == 0 && field304[0] == 1) {
                Statics.field1253[3].method1788(var2 + 15, 4);
            } else {
                Statics.field1253[1].method1788(var2 + 15, 4);
            }
            arg0.method3404(class135.field2323, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field325[0] == 1 && field304[0] == 0) {
                Statics.field1253[2].method1788(var3, 4);
            } else {
                Statics.field1253[0].method1788(var3, 4);
            }
            if (field325[0] == 1 && field304[0] == 1) {
                Statics.field1253[3].method1788(var3 + 15, 4);
            } else {
                Statics.field1253[1].method1788(var3 + 15, 4);
            }
            arg0.method3404(class135.field2260, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field325[0] == 2 && field304[0] == 0) {
                Statics.field1253[2].method1788(var4, 4);
            } else {
                Statics.field1253[0].method1788(var4, 4);
            }
            if (field325[0] == 2 && field304[0] == 1) {
                Statics.field1253[3].method1788(var4 + 15, 4);
            } else {
                Statics.field1253[1].method1788(var4 + 15, 4);
            }
            arg0.method3404(class135.field2285, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field325[0] == 3 && field304[0] == 0) {
                Statics.field1253[2].method1788(var5, 4);
            } else {
                Statics.field1253[0].method1788(var5, 4);
            }
            if (field325[0] == 3 && field304[0] == 1) {
                Statics.field1253[3].method1788(var5 + 15, 4);
            } else {
                Statics.field1253[1].method1788(var5 + 15, 4);
            }
            arg0.method3404(class135.field2326, var5 + 32, 17, 16777215, -1);
        }
        class89.method1801(708, 4, 50, 16, 0);
        arg1.method3406(class135.field2102, 733, 16, 16777215, -1);
        field322 = -1;
        if (Statics.field948 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field323) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field323) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field323) {
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
            for (int var20 = 0; var20 < field323; var20++) {
                class13 var21 = Statics.field2731[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field205);
                if (var21.field205 == -1) {
                    var23 = class135.field2327;
                    var22 = false;
                } else if (var21.field205 > 1980) {
                    var23 = class135.field2328;
                    var22 = false;
                }
                byte var24;
                if (var21.method141()) {
                    if (var21.method135()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method135()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class77.field1376 >= var17 && class77.field1375 >= var16 && class77.field1376 < var6 + var17 && class77.field1375 < var7 + var16 && var22) {
                    field322 = var20;
                    Statics.field948[var24].method1713(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field948[var24].method1707(var17, var16);
                }
                if (Statics.field2735 != null) {
                    Statics.field2735[(var21.method135() ? 8 : 0) + var21.field195].method1788(var17 + 29, var16);
                }
                arg0.method3406(Integer.toString(var21.field191), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3406(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3400(Statics.field2731[field322].field196) + 6;
                int var26 = arg1.field2845 + 8;
                class89.method1801(class77.field1376 - var25 / 2, class77.field1375 + 20 + 5, var25, var26, 16777120);
                class89.method1808(class77.field1376 - var25 / 2, class77.field1375 + 20 + 5, var25, var26, 0);
                arg1.method3406(Statics.field2731[field322].field196, class77.field1376, class77.field1375 + 20 + 5 + arg1.field2845 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field268.getGraphics();
            Statics.field1289.method1626(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field268.repaint();
        }
    }

    @ObfuscatedName("ee.o(Lbm;B)V")
    public static void method2724(class73 arg0) {
        if (class77.field1383 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1384 >= var1 && class77.field1384 <= var1 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(0, 0);
            return;
        }
        if (class77.field1384 >= var1 + 15 && class77.field1384 <= var1 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1384 >= var2 && class77.field1384 <= var2 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(1, 0);
            return;
        }
        if (class77.field1384 >= var2 + 15 && class77.field1384 <= var2 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1384 >= var3 && class77.field1384 <= var3 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(2, 0);
            return;
        }
        if (class77.field1384 >= var3 + 15 && class77.field1384 <= var3 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1384 >= var4 && class77.field1384 <= var4 + 14 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(3, 0);
            return;
        }
        if (class77.field1384 >= var4 + 15 && class77.field1384 <= var4 + 80 && class77.field1385 >= 4 && class77.field1385 <= 18) {
            method2220(3, 1);
            return;
        }
        if (class77.field1384 >= 708 && class77.field1385 >= 4 && class77.field1384 <= 758 && class77.field1385 <= 20) {
            field315 = false;
            Statics.field299.method1707(0, 0);
            Statics.field296.method1707(382, 0);
            Statics.field1503.method1788(382 - Statics.field1503.field1471 / 2, 18);
            return;
        }
        if (field322 == -1) {
            return;
        }
        class13 var5 = Statics.field2731[field322];
        if (var5.method135() != client.field618) {
            client.field618 = var5.method135();
            class40.method113(var5.method135());
        }
        Statics.field290 = var5.field193;
        client.field638 = var5.field191;
        client.field459 = var5.field192;
        Statics.field266 = client.field522 == 0 ? 43594 : var5.field191 + 40000;
        Statics.field278 = client.field522 == 0 ? 443 : var5.field191 + 50000;
        Statics.field736 = Statics.field266;
        field315 = false;
        Statics.field299.method1707(0, 0);
        Statics.field296.method1707(382, 0);
        Statics.field1503.method1788(382 - Statics.field1503.field1471 / 2, 18);
        return;
    }

    @ObfuscatedName("fm.g(I)V")
    public static void method3222() {
        try {
            if (Statics.field862 == null) {
                Statics.field862 = new class24(Statics.field1214, new URL(Statics.field465));
            } else {
                byte[] var0 = Statics.field862.method228();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field323 = var1.method2460();
                    Statics.field2731 = new class13[field323];
                    int var2 = 0;
                    while (var2 < field323) {
                        class13 var3 = Statics.field2731[var2] = new class13();
                        var3.field191 = var1.method2460();
                        var3.field192 = var1.method2463();
                        var3.field193 = var1.method2636();
                        var3.field196 = var1.method2636();
                        var3.field195 = var1.method2458();
                        var3.field205 = var1.method2461();
                        var3.field201 = var2++;
                    }
                    method1657(Statics.field2731, 0, Statics.field2731.length - 1, field325, field304);
                    field315 = true;
                    Statics.field862 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field862 = null;
        }
    }

    @ObfuscatedName("dc.s(IIB)V")
    public static void method2220(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field325[var5] != arg0) {
                var2[var4] = field325[var5];
                var3[var4] = field304[var5];
                var4++;
            }
        }
        field325 = var2;
        field304 = var3;
        method1657(Statics.field2731, 0, Statics.field2731.length - 1, field325, field304);
    }

    @ObfuscatedName("cp.b([Lb;II[I[II)V")
    public static void method1657(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field201;
                        var12 = var8.field201;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field205;
                        var12 = var8.field205;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method135() ? 1 : 0;
                        var12 = var8.method135() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field191;
                        var12 = var8.field191;
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
                        var15 = arg0[var5].field201;
                        var16 = var8.field201;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field205;
                        var16 = var8.field205;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method135() ? 1 : 0;
                        var16 = var8.method135() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field191;
                        var16 = var8.field191;
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
        method1657(arg0, arg1, var6, arg3, arg4);
        method1657(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
