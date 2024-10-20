package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("r")
public class class21 {

    @ObfuscatedName("r.j")
    public static int[] field326 = new int[256];

    @ObfuscatedName("r.f")
    public static int field317 = 0;

    @ObfuscatedName("r.o")
    public static int field324 = 0;

    @ObfuscatedName("r.p")
    public static int field315 = 0;

    @ObfuscatedName("r.i")
    public static int field327 = 0;

    @ObfuscatedName("r.ap")
    public static int field339 = 0;

    @ObfuscatedName("r.as")
    public static int field333 = 0;

    @ObfuscatedName("r.ak")
    public static int field330 = 10;

    @ObfuscatedName("r.af")
    public static String field331 = "";

    @ObfuscatedName("r.ag")
    public static int field332 = 0;

    @ObfuscatedName("r.aj")
    public static String field320 = "";

    @ObfuscatedName("r.ac")
    public static String field334 = "";

    @ObfuscatedName("r.an")
    public static String field335 = "";

    @ObfuscatedName("r.ad")
    public static String field336 = "";

    @ObfuscatedName("r.ai")
    public static String field337 = "";

    @ObfuscatedName("r.ae")
    public static int field338 = 0;

    @ObfuscatedName("r.au")
    public static String field313 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("r.ax")
    public static boolean field328 = false;

    @ObfuscatedName("r.am")
    public static int field329 = 0;

    @ObfuscatedName("r.bi")
    public static int[] field344 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("r.bf")
    public static int[] field345 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("r.be")
    public static int field346 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.c(I)V")
    public static void method150() {
        if (!Statics.field343) {
            return;
        }
        Statics.field348 = null;
        Statics.field314 = null;
        Statics.field323 = null;
        Statics.field316 = null;
        Statics.field340 = null;
        Statics.field255 = null;
        Statics.field318 = null;
        Statics.field1356 = null;
        Statics.field1484 = null;
        Statics.field93 = null;
        Statics.field275 = null;
        Statics.field29 = null;
        Statics.field123 = null;
        Statics.field2779 = null;
        Statics.field1797 = null;
        Statics.field2054 = null;
        Statics.field1458 = null;
        Statics.field282 = null;
        Statics.field952 = null;
        Statics.field325 = null;
        class139.method244(2);
        class154.method2957(true);
        Statics.field343 = false;
    }

    @ObfuscatedName("ak.q(Lbw;I)V")
    public static void method550(class73 arg0) {
        if (field328) {
            Statics.method2817(arg0);
            return;
        }
        if ((class77.field1403 == 1 || !Statics.field1273 && class77.field1403 == 4) && class77.field1410 >= 715 && class77.field1413 >= 453) {
            Statics.field1472.field192 = !Statics.field1472.field192;
            class29 var1 = null;
            try {
                var1 = class82.method1326("", Statics.field714.field2109, true);
                class127 var2 = Statics.field1472.method113();
                var1.method527(var2.field2057, 0, var2.field2052);
            } catch (Exception var27) {
            }
            try {
                if (var1 != null) {
                    var1.method528();
                }
            } catch (Exception var26) {
            }
            if (Statics.field1472.field192) {
                Statics.field409.method2686();
                class139.field2378 = 1;
                Statics.field2599 = null;
            } else {
                class139.method2199(Statics.field951, "scape main", "", 255, false);
            }
        }
        if (client.field501 == 5) {
            return;
        }
        field339++;
        if (client.field501 != 10) {
            return;
        }
        if (client.field623 == 0) {
            if (class77.field1403 == 1 || !Statics.field1273 && class77.field1403 == 4) {
                byte var5 = 5;
                short var6 = 463;
                byte var7 = 100;
                byte var8 = 35;
                if (class77.field1410 >= var5 && class77.field1410 <= var5 + var7 && class77.field1413 >= var6 && class77.field1413 <= var6 + var8) {
                    method36();
                    return;
                }
            }
            if (Statics.field970 != null) {
                method36();
            }
        }
        int var9 = class77.field1403;
        int var10 = class77.field1410;
        int var11 = class77.field1413;
        if (!Statics.field1273 && var9 == 4) {
            var9 = 1;
        }
        if (field332 == 0) {
            short var12 = 302;
            short var13 = 291;
            if (var9 == 1 && var10 >= var12 - 75 && var10 <= var12 + 75 && var11 >= var13 - 20 && var11 <= var13 + 20) {
                field332 = 3;
                field338 = 0;
            }
            short var14 = 462;
            if (var9 == 1 && var10 >= var14 - 75 && var10 <= var14 + 75 && var11 >= var13 - 20 && var11 <= var13 + 20) {
                if ((client.field619 & 0x4) != 0) {
                    if ((client.field619 & 0x400) == 0) {
                        field320 = class135.field2321;
                        field334 = class135.field2322;
                        field335 = class135.field2323;
                    } else {
                        field320 = class135.field2123;
                        field334 = class135.field2341;
                        field335 = class135.field2331;
                    }
                    field332 = 1;
                    field338 = 0;
                } else if ((client.field619 & 0x400) == 0) {
                    field320 = class135.field2317;
                    field334 = class135.field2255;
                    field335 = class135.field2179;
                    field332 = 2;
                    field338 = 0;
                } else {
                    field320 = class135.field2295;
                    field334 = class135.field2198;
                    field335 = class135.field2326;
                    field332 = 1;
                    field338 = 0;
                }
            }
        } else if (field332 == 1) {
            while (class75.method2733()) {
                if (Statics.field879 == 84) {
                    field320 = class135.field2317;
                    field334 = class135.field2255;
                    field335 = class135.field2179;
                    field332 = 2;
                    field338 = 0;
                } else if (Statics.field879 == 13) {
                    field332 = 0;
                }
            }
            short var15 = 302;
            short var16 = 321;
            if (var9 == 1 && var10 >= var15 - 75 && var10 <= var15 + 75 && var11 >= var16 - 20 && var11 <= var16 + 20) {
                field320 = class135.field2317;
                field334 = class135.field2255;
                field335 = class135.field2179;
                field332 = 2;
                field338 = 0;
            }
            short var17 = 462;
            if (var9 == 1 && var10 >= var17 - 75 && var10 <= var17 + 75 && var11 >= var16 - 20 && var11 <= var16 + 20) {
                field332 = 0;
            }
        } else if (field332 == 2) {
            short var18 = 231;
            int var28 = var18 + 30;
            if (var9 == 1 && var11 >= var28 - 15 && var11 < var28) {
                field338 = 0;
            }
            var28 += 15;
            if (var9 == 1 && var11 >= var28 - 15 && var11 < var28) {
                field338 = 1;
            }
            var28 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var9 == 1 && var10 >= var19 - 75 && var10 <= var19 + 75 && var11 >= var20 - 20 && var11 <= var20 + 20) {
                field336 = field336.trim();
                if (field336.length() == 0) {
                    method25(class135.field2308, class135.field2247, class135.field2229);
                    return;
                }
                if (field337.length() == 0) {
                    method25(class135.field2230, class135.field2231, class135.field2232);
                    return;
                }
                method25(class135.field2330, class135.field2233, class135.field2245);
                client.method22(20);
                return;
            }
            short var21 = 462;
            if (var9 == 1 && var10 >= var21 - 75 && var10 <= var21 + 75 && var11 >= var20 - 20 && var11 <= var20 + 20) {
                field332 = 0;
                field336 = "";
                field337 = "";
            }
            while (true) {
                while (class75.method2733()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field313.length(); var23++) {
                        if (Statics.field783 == field313.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field879 == 13) {
                        field332 = 0;
                        field336 = "";
                        field337 = "";
                    } else if (field338 == 0) {
                        if (Statics.field879 == 85 && field336.length() > 0) {
                            field336 = field336.substring(0, field336.length() - 1);
                        }
                        if (Statics.field879 == 84 || Statics.field879 == 80) {
                            field338 = 1;
                        }
                        if (var22 && field336.length() < 320) {
                            field336 = field336 + Statics.field783;
                        }
                    } else if (field338 == 1) {
                        if (Statics.field879 == 85 && field337.length() > 0) {
                            field337 = field337.substring(0, field337.length() - 1);
                        }
                        if (Statics.field879 == 84 || Statics.field879 == 80) {
                            field338 = 0;
                        }
                        if (Statics.field879 == 84) {
                            field336 = field336.trim();
                            if (field336.length() == 0) {
                                method25(class135.field2308, class135.field2247, class135.field2229);
                                return;
                            }
                            if (field337.length() == 0) {
                                method25(class135.field2230, class135.field2231, class135.field2232);
                                return;
                            }
                            method25(class135.field2330, class135.field2233, class135.field2245);
                            client.method22(20);
                            return;
                        }
                        if (var22 && field337.length() < 20) {
                            field337 = field337 + Statics.field783;
                        }
                    }
                }
                return;
            }
        } else if (field332 == 3) {
            short var24 = 382;
            short var25 = 321;
            if (var9 == 1 && var10 >= var24 - 75 && var10 <= var24 + 75 && var11 >= var25 - 20 && var11 <= var25 + 20) {
                field332 = 0;
            }
        }
    }

    @ObfuscatedName("ak.y(Lge;Lge;I)V")
    public static void method531(class183 arg0, class183 arg1) {
        if (field328) {
            method1182(arg0, arg1);
            return;
        }
        if (client.field501 == 0 || client.field501 == 5) {
            byte var2 = 20;
            arg0.method3286(class135.field2171, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1713(230, var3, 304, 34, 9179409);
            class89.method1713(231, var3 + 1, 302, 32, 0);
            class89.method1711(232, var3 + 2, field330 * 3, 30, 9179409);
            class89.method1711(field330 * 3 + 232, var3 + 2, 300 - field330 * 3, 30, 0);
            arg0.method3286(field331, 382, 276 - var2, 16777215, -1);
        }
        if (client.field501 == 20) {
            Statics.field348.method1693(382 - Statics.field348.field1503 / 2, 271 - Statics.field348.field1504 / 2);
            short var4 = 211;
            arg0.method3286(field320, 382, var4, 16776960, 0);
            int var101 = var4 + 15;
            arg0.method3286(field334, 382, var101, 16776960, 0);
            int var102 = var101 + 15;
            arg0.method3286(field335, 382, var102, 16776960, 0);
            int var103 = var102 + 15;
            int var104 = var103 + 10;
            arg0.method3232(class135.field2333, 272, var104, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field336; arg0.method3228(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3232(class185.method3231(var6), 312, var104, 16777215, 0);
            var101 = var104 + 15;
            String var8 = class135.field2334;
            String var9 = field337;
            int var10 = var9.length();
            char[] var11 = new char[var10];
            for (int var12 = 0; var12 < var10; var12++) {
                var11[var12] = '*';
            }
            String var13 = new String(var11);
            arg0.method3232(var8 + var13, 274, var101, 16777215, 0);
            var101 += 15;
        }
        if (client.field501 == 10) {
            Statics.field348.method1693(202, 171);
            if (field332 == 0) {
                short var15 = 251;
                arg0.method3286(class135.field2335, 382, var15, 16776960, 0);
                int var105 = var15 + 30;
                short var16 = 302;
                short var17 = 291;
                Statics.field314.method1693(var16 - 73, var17 - 20);
                arg0.method3295(class135.field2336, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                Statics.field314.method1693(var18 - 73, var17 - 20);
                arg0.method3295(class135.field2337, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field332 == 1) {
                arg0.method3286(class135.field2306, 382, 211, 16776960, 0);
                short var19 = 236;
                arg0.method3286(field320, 382, var19, 16777215, 0);
                int var106 = var19 + 15;
                arg0.method3286(field334, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3286(field335, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                short var20 = 302;
                short var21 = 321;
                Statics.field314.method1693(var20 - 73, var21 - 20);
                arg0.method3286(class135.field2254, var20, var21 + 5, 16777215, 0);
                short var22 = 462;
                Statics.field314.method1693(var22 - 73, var21 - 20);
                arg0.method3286(class135.field2339, var22, var21 + 5, 16777215, 0);
            } else if (field332 == 2) {
                short var23 = 211;
                arg0.method3286(field320, 382, var23, 16776960, 0);
                int var109 = var23 + 15;
                arg0.method3286(field334, 382, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3286(field335, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var112 = var111 + 10;
                arg0.method3232(class135.field2333, 272, var112, 16777215, 0);
                short var24 = 200;
                String var25;
                for (var25 = field336; arg0.method3228(var25) > var24; var25 = var25.substring(1)) {
                }
                arg0.method3232(class185.method3231(var25) + (field338 == 0 & client.field503 % 40 < 20 ? class2.method1311(16776960) + class2.field17 : ""), 312, var112, 16777215, 0);
                var109 = var112 + 15;
                String var27 = class135.field2334;
                String var28 = field337;
                int var29 = var28.length();
                char[] var30 = new char[var29];
                for (int var31 = 0; var31 < var29; var31++) {
                    var30[var31] = '*';
                }
                String var32 = new String(var30);
                arg0.method3232(var27 + var32 + (field338 == 1 & client.field503 % 40 < 20 ? class2.method1311(16776960) + class2.field17 : ""), 274, var109, 16777215, 0);
                var109 += 15;
                short var34 = 302;
                short var35 = 321;
                Statics.field314.method1693(var34 - 73, var35 - 20);
                arg0.method3286(class135.field2211, var34, var35 + 5, 16777215, 0);
                short var36 = 462;
                Statics.field314.method1693(var36 - 73, var35 - 20);
                arg0.method3286(class135.field2339, var36, var35 + 5, 16777215, 0);
            } else if (field332 == 3) {
                arg0.method3286(class135.field2142, 382, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3286(class135.field2342, 382, var37, 16777215, 0);
                int var113 = var37 + 15;
                arg0.method3286(class135.field2290, 382, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3286(class135.field2343, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3286(class135.field2348, 382, var115, 16777215, 0);
                int var116 = var115 + 15;
                short var38 = 382;
                short var39 = 321;
                Statics.field314.method1693(var38 - 73, var39 - 20);
                arg0.method3286(class135.field2339, var38, var39 + 5, 16777215, 0);
            }
        }
        if (field339 > 0) {
            int var40 = field339;
            short var41 = 256;
            field315 += var40 * 128;
            if (field315 > Statics.field1458.length) {
                field315 -= Statics.field1458.length;
                int var42 = (int) (Math.random() * 12.0D);
                method35(Statics.field323[var42]);
            }
            int var43 = 0;
            int var44 = var40 * 128;
            int var45 = (var41 - var40) * 128;
            for (int var46 = 0; var46 < var45; var46++) {
                int var47 = Statics.field952[var43 + var44] - Statics.field1458[field315 + var43 & Statics.field1458.length - 1] * var40 / 6;
                if (var47 < 0) {
                    var47 = 0;
                }
                Statics.field952[var43++] = var47;
            }
            for (int var48 = var41 - var40; var48 < var41; var48++) {
                int var49 = var48 * 128;
                for (int var50 = 0; var50 < 128; var50++) {
                    int var51 = (int) (Math.random() * 100.0D);
                    if (var51 < 50 && var50 > 10 && var50 < 118) {
                        Statics.field952[var49 + var50] = 255;
                    } else {
                        Statics.field952[var49 + var50] = 0;
                    }
                }
            }
            if (field317 > 0) {
                field317 -= var40 * 4;
            }
            if (field324 > 0) {
                field324 -= var40 * 4;
            }
            if (field317 == 0 && field324 == 0) {
                int var52 = (int) (Math.random() * (double) (2000 / var40));
                if (var52 == 0) {
                    field317 = 1024;
                }
                if (var52 == 1) {
                    field324 = 1024;
                }
            }
            for (int var53 = 0; var53 < var41 - var40; var53++) {
                field326[var53] = field326[var40 + var53];
            }
            for (int var54 = var41 - var40; var54 < var41; var54++) {
                field326[var54] = (int) (Math.sin((double) field333 / 14.0D) * 16.0D + Math.sin((double) field333 / 15.0D) * 14.0D + Math.sin((double) field333 / 16.0D) * 12.0D);
                field333++;
            }
            field327 += var40 * -285122993;
            int var55 = ((client.field503 & 0x1) + var40) / 2;
            if (var55 > 0) {
                for (int var56 = 0; var56 < field327 * 688989276; var56++) {
                    int var57 = (int) (Math.random() * 124.0D) + 2;
                    int var58 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field952[(var58 << 7) + var57] = 192;
                }
                field327 = 0;
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
                                    var64 += Statics.field325[var55 * 128 + var63 + var66];
                                }
                                if (var65 - (var55 + 1) >= 0) {
                                    var64 -= Statics.field325[var63 + var66 - (var55 + 1) * 128];
                                }
                                if (var65 >= 0) {
                                    Statics.field952[var63 + var66] = var64 / (var55 * 2 + 1);
                                }
                            }
                            var63++;
                        }
                    }
                    int var60 = 0;
                    int var61 = var59 * 128;
                    for (int var62 = -var55; var62 < 128; var62++) {
                        if (var55 + var62 < 128) {
                            var60 += Statics.field952[var61 + var62 + var55];
                        }
                        if (var62 - (var55 + 1) >= 0) {
                            var60 -= Statics.field952[var61 + var62 - (var55 + 1)];
                        }
                        if (var62 >= 0) {
                            Statics.field325[var61 + var62] = var60 / (var55 * 2 + 1);
                        }
                    }
                    var59++;
                }
            }
            field339 = 0;
        }
        short var67 = 256;
        if (field317 > 0) {
            for (int var68 = 0; var68 < 256; var68++) {
                if (field317 > 768) {
                    Statics.field2054[var68] = method41(Statics.field123[var68], Statics.field2779[var68], 1024 - field317);
                } else if (field317 > 256) {
                    Statics.field2054[var68] = Statics.field2779[var68];
                } else {
                    Statics.field2054[var68] = method41(Statics.field2779[var68], Statics.field123[var68], 256 - field317);
                }
            }
        } else if (field324 > 0) {
            for (int var69 = 0; var69 < 256; var69++) {
                if (field324 > 768) {
                    Statics.field2054[var69] = method41(Statics.field123[var69], Statics.field1797[var69], 1024 - field324);
                } else if (field324 > 256) {
                    Statics.field2054[var69] = Statics.field1797[var69];
                } else {
                    Statics.field2054[var69] = method41(Statics.field1797[var69], Statics.field123[var69], 256 - field324);
                }
            }
        } else {
            for (int var70 = 0; var70 < 256; var70++) {
                Statics.field2054[var70] = Statics.field123[var70];
            }
        }
        class89.method1705(0, 9, 128, var67 + 7);
        Statics.field316.method1678(0, 0);
        class89.method1764();
        int var71 = 0;
        int var72 = 6885;
        for (int var73 = 1; var73 < var67 - 1; var73++) {
            int var74 = (var67 - var73) * field326[var73] / var67;
            int var75 = var74 + 22;
            if (var75 < 0) {
                var75 = 0;
            }
            var71 += var75;
            for (int var76 = var75; var76 < 128; var76++) {
                int var77 = Statics.field952[var71++];
                if (var77 == 0) {
                    var72++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field2054[var77];
                    int var81 = Statics.field1197.field1477[var72];
                    Statics.field1197.field1477[var72++] = ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) + ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) >> 8;
                }
            }
            var72 += var75 + 765 - 128;
        }
        class89.method1705(637, 9, 765, var67 + 7);
        Statics.field340.method1678(382, 0);
        class89.method1764();
        int var82 = 0;
        int var83 = 7546;
        for (int var84 = 1; var84 < var67 - 1; var84++) {
            int var85 = (var67 - var84) * field326[var84] / var67;
            int var86 = 103 - var85;
            int var87 = var83 + var85;
            for (int var88 = 0; var88 < var86; var88++) {
                int var89 = Statics.field952[var82++];
                if (var89 == 0) {
                    var87++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field2054[var89];
                    int var93 = Statics.field1197.field1477[var87];
                    Statics.field1197.field1477[var87++] = ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) + ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) >> 8;
                }
            }
            var82 += 128 - var86;
            var83 = 765 - var86 - var85 + var87;
        }
        Statics.field318[Statics.field1472.field192 ? 1 : 0].method1693(725, 463);
        if (client.field501 > 5 && client.field623 == 0) {
            if (Statics.field29 == null) {
                Statics.field29 = class84.method207(Statics.field289, "sl_button", "");
            } else {
                byte var94 = 5;
                short var95 = 463;
                byte var96 = 100;
                byte var97 = 35;
                Statics.field29.method1693(var94, var95);
                arg0.method3286(class135.field2271 + " " + client.field494, var96 / 2 + var94, var97 / 2 + var95 - 2, 16777215, 0);
                if (Statics.field970 == null) {
                    arg1.method3286(class135.field2355, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                } else {
                    arg1.method3286(class135.field2354, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var98 = Statics.field1394.getGraphics();
            Statics.field1197.method1533(var98, 0, 0);
        } catch (Exception var100) {
            Statics.field1394.repaint();
        }
    }

    @ObfuscatedName("y.v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method25(String arg0, String arg1, String arg2) {
        field320 = arg0;
        field334 = arg1;
        field335 = arg2;
    }

    @ObfuscatedName("g.g(Lcw;I)V")
    public static final void method35(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1458.length; var2++) {
            Statics.field1458[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1458[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field282[var8] = (Statics.field1458[var8 - 1] + Statics.field1458[var8 + 1] + Statics.field1458[var8 - 128] + Statics.field1458[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1458;
            Statics.field1458 = Statics.field282;
            Statics.field282 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1504; var11++) {
            for (int var12 = 0; var12 < arg0.field1503; var12++) {
                if (arg0.field1505[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1506;
                    int var14 = var11 + 16 + arg0.field1501;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1458[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("u.x(IIIB)I")
    public static final int method41(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("be.u(Lge;Lge;I)V")
    public static void method1182(class183 arg0, class183 arg1) {
        if (Statics.field1356 == null) {
            Statics.field1356 = class84.method2998(Statics.field289, "sl_back", "");
        }
        if (Statics.field1484 == null) {
            Statics.field1484 = class84.method2112(Statics.field289, "sl_flags", "");
        }
        if (Statics.field93 == null) {
            Statics.field93 = class84.method2112(Statics.field289, "sl_arrows", "");
        }
        if (Statics.field275 == null) {
            Statics.field275 = class84.method2112(Statics.field289, "sl_stars", "");
        }
        class89.method1711(0, 23, 765, 480, 0);
        class89.method1712(0, 0, 125, 23, 12425273, 9135624);
        class89.method1712(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3286(class135.field2214, 62, 15, 0, -1);
        if (Statics.field275 != null) {
            Statics.field275[1].method1693(140, 1);
            arg1.method3232(class135.field2346, 152, 10, 16777215, -1);
            Statics.field275[0].method1693(140, 12);
            arg1.method3232(class135.field2347, 152, 21, 16777215, -1);
        }
        if (Statics.field93 != null) {
            short var2 = 280;
            if (field344[0] == 0 && field345[0] == 0) {
                Statics.field93[2].method1693(var2, 4);
            } else {
                Statics.field93[0].method1693(var2, 4);
            }
            if (field344[0] == 0 && field345[0] == 1) {
                Statics.field93[3].method1693(var2 + 15, 4);
            } else {
                Statics.field93[1].method1693(var2 + 15, 4);
            }
            arg0.method3232(class135.field2213, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field344[0] == 1 && field345[0] == 0) {
                Statics.field93[2].method1693(var3, 4);
            } else {
                Statics.field93[0].method1693(var3, 4);
            }
            if (field344[0] == 1 && field345[0] == 1) {
                Statics.field93[3].method1693(var3 + 15, 4);
            } else {
                Statics.field93[1].method1693(var3 + 15, 4);
            }
            arg0.method3232(class135.field2349, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field344[0] == 2 && field345[0] == 0) {
                Statics.field93[2].method1693(var4, 4);
            } else {
                Statics.field93[0].method1693(var4, 4);
            }
            if (field344[0] == 2 && field345[0] == 1) {
                Statics.field93[3].method1693(var4 + 15, 4);
            } else {
                Statics.field93[1].method1693(var4 + 15, 4);
            }
            arg0.method3232(class135.field2350, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field344[0] == 3 && field345[0] == 0) {
                Statics.field93[2].method1693(var5, 4);
            } else {
                Statics.field93[0].method1693(var5, 4);
            }
            if (field344[0] == 3 && field345[0] == 1) {
                Statics.field93[3].method1693(var5 + 15, 4);
            } else {
                Statics.field93[1].method1693(var5 + 15, 4);
            }
            arg0.method3232(class135.field2351, var5 + 32, 17, 16777215, -1);
        }
        class89.method1711(708, 4, 50, 16, 0);
        arg1.method3286(class135.field2339, 733, 16, 16777215, -1);
        field346 = -1;
        if (Statics.field1356 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field329) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field329) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field329) {
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
            for (int var20 = 0; var20 < field329; var20++) {
                class13 var21 = Statics.field786[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field203);
                if (var21.field203 == -1) {
                    var23 = class135.field2352;
                    var22 = false;
                } else if (var21.field203 > 1980) {
                    var23 = class135.field2319;
                    var22 = false;
                }
                byte var24;
                if (var21.method123()) {
                    if (var21.method127()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method127()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class77.field1397 >= var17 && class77.field1404 >= var16 && class77.field1397 < var6 + var17 && class77.field1404 < var7 + var16 && var22) {
                    field346 = var20;
                    Statics.field1356[var24].method1626(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1356[var24].method1678(var17, var16);
                }
                if (Statics.field1484 != null) {
                    Statics.field1484[(var21.method127() ? 8 : 0) + var21.field208].method1693(var17 + 29, var16);
                }
                arg0.method3286(Integer.toString(var21.field215), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3286(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3228(Statics.field786[field346].field205) + 6;
                int var26 = arg1.field2843 + 8;
                class89.method1711(class77.field1397 - var25 / 2, class77.field1404 + 20 + 5, var25, var26, 16777120);
                class89.method1713(class77.field1397 - var25 / 2, class77.field1404 + 20 + 5, var25, var26, 0);
                arg1.method3286(Statics.field786[field346].field205, class77.field1397, class77.field1404 + 20 + 5 + arg1.field2843 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1394.getGraphics();
            Statics.field1197.method1533(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1394.repaint();
        }
    }

    @ObfuscatedName("client.a(Ls;I)V")
    public static void method455(class13 arg0) {
        if (arg0.method127() != client.field602) {
            client.field602 = arg0.method127();
            boolean var1 = arg0.method127();
            if (Statics.field2841 != var1) {
                class40.field1026.method3093();
                class40.field1007.method3093();
                class40.field998.method3093();
                Statics.field2841 = var1;
            }
        }
        Statics.field90 = arg0.field204;
        client.field494 = arg0.field215;
        client.field619 = arg0.field211;
        Statics.field1940 = client.field496 == 0 ? 43594 : arg0.field215 + 40000;
        Statics.field206 = client.field496 == 0 ? 443 : arg0.field215 + 50000;
        Statics.field365 = Statics.field1940;
    }

    @ObfuscatedName("g.h(I)V")
    public static void method36() {
        try {
            if (Statics.field970 == null) {
                Statics.field970 = new class24(Statics.field271, new URL(Statics.field2737));
            } else {
                byte[] var0 = Statics.field970.method205();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field329 = var1.method2327();
                    Statics.field786 = new class13[field329];
                    int var2 = 0;
                    while (var2 < field329) {
                        class13 var3 = Statics.field786[var2] = new class13();
                        var3.field215 = var1.method2327();
                        var3.field211 = var1.method2323();
                        var3.field204 = var1.method2315();
                        var3.field205 = var1.method2315();
                        var3.field208 = var1.method2383();
                        var3.field203 = var1.method2321();
                        var3.field207 = var2++;
                    }
                    method1509(Statics.field786, 0, Statics.field786.length - 1, field344, field345);
                    field328 = true;
                    Statics.field970 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field970 = null;
        }
    }

    @ObfuscatedName("be.t(III)V")
    public static void method1177(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field344[var5] != arg0) {
                var2[var4] = field344[var5];
                var3[var4] = field345[var5];
                var4++;
            }
        }
        field344 = var2;
        field345 = var3;
        method1509(Statics.field786, 0, Statics.field786.length - 1, field344, field345);
    }

    @ObfuscatedName("ce.m([Ls;II[I[II)V")
    public static void method1509(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field207;
                        var12 = var8.field207;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field203;
                        var12 = var8.field203;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method127() ? 1 : 0;
                        var12 = var8.method127() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field215;
                        var12 = var8.field215;
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
                        var15 = arg0[var5].field207;
                        var16 = var8.field207;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field203;
                        var16 = var8.field203;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method127() ? 1 : 0;
                        var16 = var8.method127() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field215;
                        var16 = var8.field215;
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
        method1509(arg0, arg1, var6, arg3, arg4);
        method1509(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
