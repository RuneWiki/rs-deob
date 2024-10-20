package deob;

import java.net.URL;

@ObfuscatedName("t")
public class class22 {

    @ObfuscatedName("t.w")
    public static int[] field325 = new int[256];

    @ObfuscatedName("t.c")
    public static int field345 = 0;

    @ObfuscatedName("t.k")
    public static int field319 = 0;

    @ObfuscatedName("t.f")
    public static int field315 = 0;

    @ObfuscatedName("t.j")
    public static int field322 = 0;

    @ObfuscatedName("t.af")
    public static int field339 = 0;

    @ObfuscatedName("t.ar")
    public static int field324 = 0;

    @ObfuscatedName("t.ax")
    public static int field318 = 10;

    @ObfuscatedName("t.at")
    public static String field331 = "";

    @ObfuscatedName("t.ah")
    public static int field327 = 0;

    @ObfuscatedName("t.ap")
    public static String field328 = "";

    @ObfuscatedName("t.ay")
    public static String field329 = "";

    @ObfuscatedName("t.ag")
    public static String field330 = "";

    @ObfuscatedName("t.ai")
    public static String field342 = "";

    @ObfuscatedName("t.aw")
    public static String field347 = "";

    @ObfuscatedName("t.am")
    public static int field333 = 0;

    @ObfuscatedName("t.an")
    public static String field334 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("t.au")
    public static boolean field335 = false;

    @ObfuscatedName("t.aa")
    public static int field337 = 0;

    @ObfuscatedName("t.bi")
    public static int[] field336 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("t.bp")
    public static int[] field323 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("t.bg")
    public static int field340 = -1;

    public class22() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.i(Leg;Leg;B)I")
    public static int method196(class155 arg0, class155 arg1) {
        int var2 = 0;
        if (arg0.method3060("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3060("logo", "")) {
            var2++;
        }
        if (arg1.method3060("titlebox", "")) {
            var2++;
        }
        if (arg1.method3060("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3060("runes", "")) {
            var2++;
        }
        if (arg1.method3060("title_mute", "")) {
            var2++;
        }
        arg1.method3060("sl_back", "");
        arg1.method3060("sl_flags", "");
        arg1.method3060("sl_arrows", "");
        arg1.method3060("sl_stars", "");
        arg1.method3060("sl_button", "");
        return var2;
    }

    @ObfuscatedName("eh.b(I)I")
    public static int method2767() {
        return 6;
    }

    @ObfuscatedName("p.r(B)V")
    public static void method156() {
        if (!Statics.field2036) {
            return;
        }
        Statics.field2484 = null;
        Statics.field326 = null;
        Statics.field2018 = null;
        Statics.field2374 = null;
        Statics.field282 = null;
        Statics.field312 = null;
        Statics.field304 = null;
        Statics.field1825 = null;
        Statics.field67 = null;
        Statics.field341 = null;
        Statics.field1287 = null;
        Statics.field1208 = null;
        Statics.field338 = null;
        Statics.field274 = null;
        Statics.field317 = null;
        Statics.field1800 = null;
        Statics.field747 = null;
        Statics.field1933 = null;
        Statics.field320 = null;
        Statics.field1532 = null;
        class141.method3226(2);
        class156.method2052(true);
        Statics.field2036 = false;
    }

    @ObfuscatedName("bl.l(Lbx;I)V")
    public static void method1311(class74 arg0) {
        if (!field335) {
            if ((class78.field1416 == 1 || !Statics.field1668 && class78.field1416 == 4) && class78.field1417 >= 715 && class78.field1418 >= 453) {
                Statics.field247.field182 = !Statics.field247.field182;
                class12.method38();
                if (Statics.field247.field182) {
                    Statics.field2381.method2791();
                    class141.field2382 = 1;
                    Statics.field2380 = null;
                } else {
                    class141.method1412(Statics.field2033, "scape main", "", 255, false);
                }
            }
            if (client.field487 != 5) {
                field339++;
                if (client.field487 == 10) {
                    if (client.field486 == 0) {
                        if (class78.field1416 == 1 || !Statics.field1668 && class78.field1416 == 4) {
                            byte var6 = 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class78.field1417 >= var6 && class78.field1417 <= var6 + var8 && class78.field1418 >= var7 && class78.field1418 <= var7 + var9) {
                                method886();
                                return;
                            }
                        }
                        if (Statics.field368 != null) {
                            method886();
                        }
                    }
                    int var10 = class78.field1416;
                    int var11 = class78.field1417;
                    int var12 = class78.field1418;
                    if (!Statics.field1668 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field327 == 0) {
                        short var13 = 302;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            field327 = 3;
                            field333 = 0;
                        }
                        short var15 = 462;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field480 & 0x4) != 0) {
                                if ((client.field480 & 0x400) == 0) {
                                    field328 = class137.field2326;
                                    field329 = class137.field2327;
                                    field330 = class137.field2169;
                                } else {
                                    field328 = class137.field2332;
                                    field329 = class137.field2159;
                                    field330 = class137.field2144;
                                }
                                field327 = 1;
                                field333 = 0;
                            } else if ((client.field480 & 0x400) == 0) {
                                field328 = class137.field2248;
                                field329 = class137.field2323;
                                field330 = class137.field2324;
                                field327 = 2;
                                field333 = 0;
                            } else {
                                field328 = class137.field2201;
                                field329 = class137.field2234;
                                field330 = class137.field2176;
                                field327 = 1;
                                field333 = 0;
                            }
                        }
                    } else if (field327 == 1) {
                        while (true) {
                            class76 var16 = class76.field1391;
                            boolean var17;
                            synchronized (class76.field1391) {
                                if (class76.field1388 == class76.field1386) {
                                    var17 = false;
                                } else {
                                    Statics.field306 = class76.field1383[class76.field1386];
                                    Statics.field1382 = class76.field1361[class76.field1386];
                                    class76.field1386 = class76.field1386 + 1 & 0x7F;
                                    var17 = true;
                                }
                            }
                            if (!var17) {
                                short var19 = 302;
                                short var20 = 321;
                                if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                                    field328 = class137.field2248;
                                    field329 = class137.field2323;
                                    field330 = class137.field2324;
                                    field327 = 2;
                                    field333 = 0;
                                }
                                short var21 = 462;
                                if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                                    field327 = 0;
                                }
                                break;
                            }
                            if (Statics.field306 == 84) {
                                field328 = class137.field2248;
                                field329 = class137.field2323;
                                field330 = class137.field2324;
                                field327 = 2;
                                field333 = 0;
                            } else if (Statics.field306 == 13) {
                                field327 = 0;
                            }
                        }
                    } else if (field327 == 2) {
                        short var22 = 231;
                        int var35 = var22 + 30;
                        if (var10 == 1 && var12 >= var35 - 15 && var12 < var35) {
                            field333 = 0;
                        }
                        var35 += 15;
                        if (var10 == 1 && var12 >= var35 - 15 && var12 < var35) {
                            field333 = 1;
                        }
                        var35 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field342 = field342.trim();
                            if (field342.length() == 0) {
                                method1875(class137.field2231, class137.field2235, class137.field2236);
                                return;
                            }
                            if (field347.length() == 0) {
                                method1875(class137.field2321, class137.field2238, class137.field2359);
                                return;
                            }
                            method1875(class137.field2335, class137.field2336, class137.field2329);
                            client.method882(20);
                            return;
                        }
                        short var25 = 462;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field327 = 0;
                            field342 = "";
                            field347 = "";
                        }
                        while (true) {
                            while (true) {
                                class76 var26 = class76.field1391;
                                boolean var27;
                                synchronized (class76.field1391) {
                                    if (class76.field1388 == class76.field1386) {
                                        var27 = false;
                                    } else {
                                        Statics.field306 = class76.field1383[class76.field1386];
                                        Statics.field1382 = class76.field1361[class76.field1386];
                                        class76.field1386 = class76.field1386 + 1 & 0x7F;
                                        var27 = true;
                                    }
                                }
                                if (!var27) {
                                    return;
                                }
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field334.length(); var30++) {
                                    if (Statics.field1382 == field334.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field306 == 13) {
                                    field327 = 0;
                                    field342 = "";
                                    field347 = "";
                                } else if (field333 == 0) {
                                    if (Statics.field306 == 85 && field342.length() > 0) {
                                        field342 = field342.substring(0, field342.length() - 1);
                                    }
                                    if (Statics.field306 == 84 || Statics.field306 == 80) {
                                        field333 = 1;
                                    }
                                    if (var29 && field342.length() < 320) {
                                        field342 = field342 + Statics.field1382;
                                    }
                                } else if (field333 == 1) {
                                    if (Statics.field306 == 85 && field347.length() > 0) {
                                        field347 = field347.substring(0, field347.length() - 1);
                                    }
                                    if (Statics.field306 == 84 || Statics.field306 == 80) {
                                        field333 = 0;
                                    }
                                    if (Statics.field306 == 84) {
                                        field342 = field342.trim();
                                        if (field342.length() == 0) {
                                            method1875(class137.field2231, class137.field2235, class137.field2236);
                                            return;
                                        }
                                        if (field347.length() == 0) {
                                            method1875(class137.field2321, class137.field2238, class137.field2359);
                                            return;
                                        }
                                        method1875(class137.field2335, class137.field2336, class137.field2329);
                                        client.method882(20);
                                        return;
                                    }
                                    if (var29 && field347.length() < 20) {
                                        field347 = field347 + Statics.field1382;
                                    }
                                }
                            }
                        }
                    } else if (field327 == 3) {
                        short var31 = 382;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field327 = 0;
                        }
                    }
                }
            }
        } else if (class78.field1416 == 1 || !Statics.field1668 && class78.field1416 == 4) {
            short var1 = 280;
            if (class78.field1417 >= var1 && class78.field1417 <= var1 + 14 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                method2733(0, 0);
            } else if (class78.field1417 >= var1 + 15 && class78.field1417 <= var1 + 80 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                method2733(0, 1);
            } else {
                short var2 = 390;
                if (class78.field1417 >= var2 && class78.field1417 <= var2 + 14 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                    method2733(1, 0);
                } else if (class78.field1417 >= var2 + 15 && class78.field1417 <= var2 + 80 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                    method2733(1, 1);
                } else {
                    short var3 = 500;
                    if (class78.field1417 >= var3 && class78.field1417 <= var3 + 14 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                        method2733(2, 0);
                    } else if (class78.field1417 >= var3 + 15 && class78.field1417 <= var3 + 80 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                        method2733(2, 1);
                    } else {
                        short var4 = 610;
                        if (class78.field1417 >= var4 && class78.field1417 <= var4 + 14 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                            method2733(3, 0);
                        } else if (class78.field1417 >= var4 + 15 && class78.field1417 <= var4 + 80 && class78.field1418 >= 4 && class78.field1418 <= 18) {
                            method2733(3, 1);
                        } else if (class78.field1417 >= 708 && class78.field1418 >= 4 && class78.field1417 <= 758 && class78.field1418 <= 20) {
                            field335 = false;
                            Statics.field2374.method1696(0, 0);
                            Statics.field282.method1696(382, 0);
                            Statics.field312.method1782(382 - Statics.field312.field1498 / 2, 18);
                        } else if (field340 != -1) {
                            class13 var5 = Statics.field13[field340];
                            method2739(var5);
                            field335 = false;
                            Statics.field2374.method1696(0, 0);
                            Statics.field282.method1696(382, 0);
                            Statics.field312.method1782(382 - Statics.field312.field1498 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1875(String arg0, String arg1, String arg2) {
        field328 = arg0;
        field329 = arg1;
        field330 = arg2;
    }

    @ObfuscatedName("c.e(Lck;I)V")
    public static final void method183(class88 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field747.length; var2++) {
            Statics.field747[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field747[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1933[var8] = (Statics.field747[var8 - 1] + Statics.field747[var8 + 1] + Statics.field747[var8 - 128] + Statics.field747[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field747;
            Statics.field747 = Statics.field1933;
            Statics.field1933 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1502; var11++) {
            for (int var12 = 0; var12 < arg0.field1498; var12++) {
                if (arg0.field1499[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1500;
                    int var14 = var11 + 16 + arg0.field1501;
                    int var15 = (var14 << 7) + var13;
                    Statics.field747[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dk.u(II)V")
    public static final void method2229(int arg0) {
        short var1 = 256;
        field315 += arg0 * 128;
        if (field315 > Statics.field747.length) {
            field315 -= Statics.field747.length;
            int var2 = (int) (Math.random() * 12.0D);
            method183(Statics.field2018[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field320[var3 + var4] - Statics.field747[field315 + var3 & Statics.field747.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field320[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field320[var9 + var10] = 255;
                } else {
                    Statics.field320[var9 + var10] = 0;
                }
            }
        }
        if (field345 > 0) {
            field345 -= arg0 * 4;
        }
        if (field319 > 0) {
            field319 -= arg0 * 4;
        }
        if (field345 == 0 && field319 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field345 = 1024;
            }
            if (var12 == 1) {
                field319 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field325[var13] = field325[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field325[var14] = (int) (Math.sin((double) field324 / 14.0D) * 16.0D + Math.sin((double) field324 / 15.0D) * 14.0D + Math.sin((double) field324 / 16.0D) * 12.0D);
            field324++;
        }
        field322 += arg0 * -274092291;
        int var15 = ((client.field735 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field322 * 1430575412; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field320[(var18 << 7) + var17] = 192;
        }
        field322 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field320[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field320[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1532[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1532[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1532[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field320[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("b.q(IIII)I")
    public static final int method11(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ev.o(I)V")
    public static final void method2744() {
        short var0 = 256;
        if (field345 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field345 > 768) {
                    Statics.field1800[var1] = method11(Statics.field338[var1], Statics.field274[var1], 1024 - field345);
                } else if (field345 > 256) {
                    Statics.field1800[var1] = Statics.field274[var1];
                } else {
                    Statics.field1800[var1] = method11(Statics.field274[var1], Statics.field338[var1], 256 - field345);
                }
            }
        } else if (field319 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field319 > 768) {
                    Statics.field1800[var2] = method11(Statics.field338[var2], Statics.field317[var2], 1024 - field319);
                } else if (field319 > 256) {
                    Statics.field1800[var2] = Statics.field317[var2];
                } else {
                    Statics.field1800[var2] = method11(Statics.field317[var2], Statics.field338[var2], 256 - field319);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1800[var3] = Statics.field338[var3];
            }
        }
        class90.method1798(0, 9, 128, var0 + 7);
        Statics.field2374.method1696(0, 0);
        class90.method1797();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field325[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field320[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1800[var10];
                    int var14 = Statics.field200.field1479[var5];
                    Statics.field200.field1479[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class90.method1798(637, 9, 765, var0 + 7);
        Statics.field282.method1696(382, 0);
        class90.method1797();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field325[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field320[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1800[var22];
                    int var26 = Statics.field200.field1479[var20];
                    Statics.field200.field1479[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ef.v(Lx;I)V")
    public static void method2739(class13 arg0) {
        if (arg0.method137() != client.field484) {
            client.field484 = arg0.method137();
            boolean var1 = arg0.method137();
            if (Statics.field1013 != var1) {
                Statics.method2050();
                Statics.field1013 = var1;
            }
        }
        Statics.field2579 = arg0.field195;
        client.field552 = arg0.field202;
        client.field480 = arg0.field199;
        Statics.field1693 = client.field481 == 0 ? 43594 : arg0.field202 + 40000;
        Statics.field1034 = client.field481 == 0 ? 443 : arg0.field202 + 50000;
        Statics.field2072 = Statics.field1693;
    }

    @ObfuscatedName("ac.m(I)V")
    public static void method886() {
        try {
            if (Statics.field368 == null) {
                Statics.field368 = new class25(Statics.field1483, new URL(Statics.field296));
            } else {
                byte[] var0 = Statics.field368.method248();
                if (var0 != null) {
                    class128 var1 = new class128(var0);
                    field337 = var1.method2473();
                    Statics.field13 = new class13[field337];
                    int var2 = 0;
                    while (var2 < field337) {
                        class13 var3 = Statics.field13[var2] = new class13();
                        var3.field202 = var1.method2473();
                        var3.field199 = var1.method2468();
                        var3.field195 = var1.method2618();
                        var3.field196 = var1.method2618();
                        var3.field201 = var1.method2531();
                        var3.field194 = var1.method2487();
                        var3.field198 = var2++;
                    }
                    method163(Statics.field13, 0, Statics.field13.length - 1, field336, field323);
                    field335 = true;
                    Statics.field368 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field368 = null;
        }
    }

    @ObfuscatedName("eo.x(IIB)V")
    public static void method2733(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field336[var5] != arg0) {
                var2[var4] = field336[var5];
                var3[var4] = field323[var5];
                var4++;
            }
        }
        field336 = var2;
        field323 = var3;
        method163(Statics.field13, 0, Statics.field13.length - 1, field336, field323);
    }

    @ObfuscatedName("z.w([Lx;II[I[IB)V")
    public static void method163(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field198;
                        var12 = var8.field198;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field194;
                        var12 = var8.field194;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method137() ? 1 : 0;
                        var12 = var8.method137() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field202;
                        var12 = var8.field202;
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
                        var15 = arg0[var5].field198;
                        var16 = var8.field198;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field194;
                        var16 = var8.field194;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method137() ? 1 : 0;
                        var16 = var8.method137() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field202;
                        var16 = var8.field202;
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
        method163(arg0, arg1, var6, arg3, arg4);
        method163(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
