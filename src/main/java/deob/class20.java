package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("f")
public class class20 {

    @ObfuscatedName("f.c")
    public static boolean field305 = false;

    @ObfuscatedName("f.m")
    public static int[] field320 = new int[256];

    @ObfuscatedName("f.f")
    public static int field307 = 0;

    @ObfuscatedName("f.a")
    public static int field333 = 0;

    @ObfuscatedName("f.q")
    public static int field334 = 0;

    @ObfuscatedName("f.ae")
    public static int field310 = 0;

    @ObfuscatedName("f.at")
    public static int field319 = 0;

    @ObfuscatedName("f.aj")
    public static int field301 = 0;

    @ObfuscatedName("f.aq")
    public static int field316 = 10;

    @ObfuscatedName("f.ac")
    public static String field313 = "";

    @ObfuscatedName("f.az")
    public static int field318 = 0;

    @ObfuscatedName("f.ao")
    public static String field315 = "";

    @ObfuscatedName("f.am")
    public static String field330 = "";

    @ObfuscatedName("f.ad")
    public static String field321 = "";

    @ObfuscatedName("f.an")
    public static String field322 = "";

    @ObfuscatedName("f.al")
    public static String field323 = "";

    @ObfuscatedName("f.ab")
    public static int field324 = 0;

    @ObfuscatedName("f.af")
    public static String field325 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("f.as")
    public static boolean field326 = false;

    @ObfuscatedName("f.aw")
    public static int field328 = 0;

    @ObfuscatedName("f.bf")
    public static int[] field311 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("f.bz")
    public static int[] field332 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("f.br")
    public static int field331 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.p(B)I")
    public static int method2252() {
        return 6;
    }

    @ObfuscatedName("c.j(I)V")
    public static void method107() {
        if (!Statics.field329) {
            return;
        }
        Statics.field300 = null;
        Statics.field306 = null;
        Statics.field302 = null;
        Statics.field1378 = null;
        Statics.field312 = null;
        Statics.field304 = null;
        Statics.field2558 = null;
        Statics.field327 = null;
        Statics.field265 = null;
        Statics.field758 = null;
        Statics.field873 = null;
        Statics.field1934 = null;
        Statics.field308 = null;
        Statics.field309 = null;
        Statics.field1827 = null;
        Statics.field2823 = null;
        Statics.field2814 = null;
        Statics.field23 = null;
        Statics.field1027 = null;
        Statics.field218 = null;
        class137.field2349 = 1;
        Statics.field2354 = null;
        Statics.field2351 = -1;
        Statics.field1201 = -1;
        Statics.field2452 = 0;
        Statics.field2352 = false;
        Statics.field246 = 2;
        class152.method212(true);
        Statics.field329 = false;
    }

    @ObfuscatedName("ba.w(Lbh;I)V")
    public static void method1229(class72 arg0) {
        if (!field326) {
            if (class76.field1400 == 1 && class76.field1395 >= 715 && class76.field1394 >= 453) {
                field305 = !field305;
                if (field305) {
                    Statics.field2021.method2752();
                    class137.field2349 = 1;
                    Statics.field2354 = null;
                } else {
                    class153 var9 = Statics.field506;
                    int var10 = var9.method2936("scape main");
                    int var11 = var9.method2929(var10, "");
                    class137.method1378(var9, var10, var11, 255, false);
                }
            }
            if (client.field483 != 5) {
                field319++;
                if (client.field483 == 10) {
                    if (client.field559 == 0) {
                        if (class76.field1400 == 1) {
                            byte var12 = 5;
                            short var13 = 463;
                            byte var14 = 100;
                            byte var15 = 35;
                            if (class76.field1395 >= var12 && class76.field1395 <= var12 + var14 && class76.field1394 >= var13 && class76.field1394 <= var13 + var15) {
                                method138();
                                return;
                            }
                        }
                        if (Statics.field1382 != null) {
                            method138();
                        }
                    }
                    int var16 = class76.field1400;
                    int var17 = class76.field1395;
                    int var18 = class76.field1394;
                    if (field318 == 0) {
                        short var19 = 302;
                        short var20 = 291;
                        if (var16 == 1 && var17 >= var19 - 75 && var17 <= var19 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field318 = 3;
                            field324 = 0;
                        }
                        short var21 = 462;
                        if (var16 == 1 && var17 >= var21 - 75 && var17 <= var21 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field315 = class133.field2292;
                            field330 = class133.field2293;
                            field321 = class133.field2294;
                            field318 = 2;
                            field324 = 0;
                        }
                    } else if (field318 == 2) {
                        short var22 = 231;
                        int var35 = var22 + 30;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field324 = 0;
                        }
                        var35 += 15;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field324 = 1;
                        }
                        var35 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var16 == 1 && var17 >= var23 - 75 && var17 <= var23 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field322 = field322.trim();
                            if (field322.length() == 0) {
                                method1326(class133.field2202, class133.field2190, class133.field2097);
                                return;
                            }
                            if (field323.length() == 0) {
                                method1326(class133.field2205, class133.field2242, class133.field2144);
                                return;
                            }
                            method1326(class133.field2295, class133.field2296, class133.field2114);
                            client.method771(20);
                            return;
                        }
                        short var25 = 462;
                        if (var16 == 1 && var17 >= var25 - 75 && var17 <= var25 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field318 = 0;
                            field322 = "";
                            field323 = "";
                        }
                        while (true) {
                            while (true) {
                                class74 var26 = class74.field1336;
                                boolean var27;
                                synchronized (class74.field1336) {
                                    if (class74.field1370 == class74.field1368) {
                                        var27 = false;
                                    } else {
                                        Statics.field811 = class74.field1365[class74.field1368];
                                        Statics.field469 = class74.field1360[class74.field1368];
                                        class74.field1368 = class74.field1368 + 1 & 0x7F;
                                        var27 = true;
                                    }
                                }
                                if (!var27) {
                                    return;
                                }
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field325.length(); var30++) {
                                    if (Statics.field469 == field325.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (field324 == 0) {
                                    if (Statics.field811 == 85 && field322.length() > 0) {
                                        field322 = field322.substring(0, field322.length() - 1);
                                    }
                                    if (Statics.field811 == 84 || Statics.field811 == 80) {
                                        field324 = 1;
                                    }
                                    if (var29 && field322.length() < 320) {
                                        field322 = field322 + Statics.field469;
                                    }
                                } else if (field324 == 1) {
                                    if (Statics.field811 == 85 && field323.length() > 0) {
                                        field323 = field323.substring(0, field323.length() - 1);
                                    }
                                    if (Statics.field811 == 84 || Statics.field811 == 80) {
                                        field324 = 0;
                                    }
                                    if (client.field612 == 2 && Statics.field811 == 84) {
                                        field322 = field322.trim();
                                        if (field322.length() == 0) {
                                            method1326(class133.field2202, class133.field2190, class133.field2097);
                                            return;
                                        }
                                        if (field323.length() == 0) {
                                            method1326(class133.field2205, class133.field2242, class133.field2144);
                                            return;
                                        }
                                        method1326(class133.field2295, class133.field2296, class133.field2114);
                                        client.method771(20);
                                        return;
                                    }
                                    if (var29 && field323.length() < 20) {
                                        field323 = field323 + Statics.field469;
                                    }
                                }
                            }
                        }
                    } else if (field318 == 3) {
                        short var31 = 382;
                        short var32 = 321;
                        if (var16 == 1 && var17 >= var31 - 75 && var17 <= var31 + 75 && var18 >= var32 - 20 && var18 <= var32 + 20) {
                            field318 = 0;
                        }
                    }
                }
            }
        } else if (class76.field1400 == 1) {
            short var1 = 280;
            if (class76.field1395 >= var1 && class76.field1395 <= var1 + 14 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                method73(0, 0);
            } else if (class76.field1395 >= var1 + 15 && class76.field1395 <= var1 + 80 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                method73(0, 1);
            } else {
                short var2 = 390;
                if (class76.field1395 >= var2 && class76.field1395 <= var2 + 14 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                    method73(1, 0);
                } else if (class76.field1395 >= var2 + 15 && class76.field1395 <= var2 + 80 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                    method73(1, 1);
                } else {
                    short var3 = 500;
                    if (class76.field1395 >= var3 && class76.field1395 <= var3 + 14 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                        method73(2, 0);
                    } else if (class76.field1395 >= var3 + 15 && class76.field1395 <= var3 + 80 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                        method73(2, 1);
                    } else {
                        short var4 = 610;
                        if (class76.field1395 >= var4 && class76.field1395 <= var4 + 14 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                            method73(3, 0);
                        } else if (class76.field1395 >= var4 + 15 && class76.field1395 <= var4 + 80 && class76.field1394 >= 4 && class76.field1394 <= 18) {
                            method73(3, 1);
                        } else if (class76.field1395 >= 708 && class76.field1394 >= 4 && class76.field1395 <= 758 && class76.field1394 <= 20) {
                            field326 = false;
                            Statics.field1378.method1658(0, 0);
                            Statics.field312.method1658(382, 0);
                            Statics.field304.method1744(382 - Statics.field304.field1483 / 2, 18);
                        } else if (field331 != -1) {
                            class12 var5 = Statics.field2001[field331];
                            if (client.field478 == var5.field208) {
                                Statics.field347 = var5.field201;
                                client.field475 = var5.field205;
                                Statics.field351 = client.field612 == 0 ? 43594 : var5.field205 + 40000;
                                Statics.field1995 = client.field612 == 0 ? 443 : var5.field205 + 50000;
                                Statics.field630 = Statics.field351;
                                field326 = false;
                                Statics.field1378.method1658(0, 0);
                                Statics.field312.method1658(382, 0);
                                Statics.field304.method1744(382 - Statics.field304.field1483 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field612 != 0) {
                                    var6 = ":" + (var5.field205 + 7000);
                                }
                                String var7 = "http://" + var5.field201 + var6 + "/j" + client.field481;
                                try {
                                    arg0.getAppletContext().showDocument(new URL(var7), "_self");
                                } catch (Exception var33) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.h(Lfz;Lfz;I)V")
    public static void method129(class182 arg0, class182 arg1) {
        if (field326) {
            method1567(arg0, arg1);
            return;
        }
        if (client.field483 == 0 || client.field483 == 5) {
            byte var2 = 20;
            arg0.method3436(class133.field2308, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class88.method1763(230, var3, 304, 34, 9179409);
            class88.method1763(231, var3 + 1, 302, 32, 0);
            class88.method1761(232, var3 + 2, field316 * 3, 30, 9179409);
            class88.method1761(field316 * 3 + 232, var3 + 2, 300 - field316 * 3, 30, 0);
            arg0.method3436(field313, 382, 276 - var2, 16777215, -1);
        }
        if (client.field483 == 20) {
            Statics.field300.method1744(382 - Statics.field300.field1483 / 2, 271 - Statics.field300.field1485 / 2);
            short var4 = 211;
            arg0.method3436(field315, 382, var4, 16776960, 0);
            int var54 = var4 + 15;
            arg0.method3436(field330, 382, var54, 16776960, 0);
            int var55 = var54 + 15;
            arg0.method3436(field321, 382, var55, 16776960, 0);
            int var56 = var55 + 15;
            int var57 = var56 + 10;
            arg0.method3411(class133.field2251, 272, var57, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field322; arg0.method3357(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3411(class184.method3378(var6), 312, var57, 16777215, 0);
            var54 = var57 + 15;
            arg0.method3411(class133.field2135 + class146.method2625(field323), 274, var54, 16777215, 0);
            var54 += 15;
        }
        if (client.field483 == 10) {
            Statics.field300.method1744(202, 171);
            if (field318 == 0) {
                short var7 = 251;
                arg0.method3436(class133.field2300, 382, var7, 16776960, 0);
                int var58 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field306.method1744(var8 - 73, var9 - 20);
                arg0.method3365(class133.field2113, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field306.method1744(var10 - 73, var9 - 20);
                arg0.method3365(class133.field2302, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field318 == 2) {
                short var11 = 211;
                arg0.method3436(field315, 382, var11, 16776960, 0);
                int var59 = var11 + 15;
                arg0.method3436(field330, 382, var59, 16776960, 0);
                int var60 = var59 + 15;
                arg0.method3436(field321, 382, var60, 16776960, 0);
                int var61 = var60 + 15;
                int var62 = var61 + 10;
                arg0.method3411(class133.field2251, 272, var62, 16777215, 0);
                short var12 = 200;
                String var13;
                for (var13 = field322; arg0.method3357(var13) > var12; var13 = var13.substring(1)) {
                }
                arg0.method3411(class184.method3378(var13) + (field324 == 0 & client.field568 % 40 < 20 ? class2.method217(16776960) + class2.field41 : ""), 312, var62, 16777215, 0);
                var59 = var62 + 15;
                arg0.method3411(class133.field2135 + class146.method2625(field323) + (field324 == 1 & client.field568 % 40 < 20 ? class2.method217(16776960) + class2.field41 : ""), 274, var59, 16777215, 0);
                var59 += 15;
                short var14 = 302;
                short var15 = 321;
                Statics.field306.method1744(var14 - 73, var15 - 20);
                arg0.method3436(class133.field2303, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                Statics.field306.method1744(var16 - 73, var15 - 20);
                arg0.method3436(class133.field2304, var16, var15 + 5, 16777215, 0);
            } else if (field318 == 3) {
                arg0.method3436(class133.field2305, 382, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3436(class133.field2306, 382, var17, 16777215, 0);
                int var63 = var17 + 15;
                arg0.method3436(class133.field2307, 382, var63, 16777215, 0);
                int var64 = var63 + 15;
                arg0.method3436(class133.field2264, 382, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method3436(class133.field2309, 382, var65, 16777215, 0);
                int var66 = var65 + 15;
                short var18 = 382;
                short var19 = 321;
                Statics.field306.method1744(var18 - 73, var19 - 20);
                arg0.method3436(class133.field2304, var18, var19 + 5, 16777215, 0);
            }
        }
        if (field319 > 0) {
            int var20 = field319;
            short var21 = 256;
            field334 += var20 * 128;
            if (field334 > Statics.field2814.length) {
                field334 -= Statics.field2814.length;
                int var22 = (int) (Math.random() * 12.0D);
                method2155(Statics.field302[var22]);
            }
            int var23 = 0;
            int var24 = var20 * 128;
            int var25 = (var21 - var20) * 128;
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = Statics.field1027[var23 + var24] - Statics.field2814[field334 + var23 & Statics.field2814.length - 1] * var20 / 6;
                if (var27 < 0) {
                    var27 = 0;
                }
                Statics.field1027[var23++] = var27;
            }
            for (int var28 = var21 - var20; var28 < var21; var28++) {
                int var29 = var28 * 128;
                for (int var30 = 0; var30 < 128; var30++) {
                    int var31 = (int) (Math.random() * 100.0D);
                    if (var31 < 50 && var30 > 10 && var30 < 118) {
                        Statics.field1027[var29 + var30] = 255;
                    } else {
                        Statics.field1027[var29 + var30] = 0;
                    }
                }
            }
            if (field307 > 0) {
                field307 -= var20 * 4;
            }
            if (field333 > 0) {
                field333 -= var20 * 4;
            }
            if (field307 == 0 && field333 == 0) {
                int var32 = (int) (Math.random() * (double) (2000 / var20));
                if (var32 == 0) {
                    field307 = 1024;
                }
                if (var32 == 1) {
                    field333 = 1024;
                }
            }
            for (int var33 = 0; var33 < var21 - var20; var33++) {
                field320[var33] = field320[var20 + var33];
            }
            for (int var34 = var21 - var20; var34 < var21; var34++) {
                field320[var34] = (int) (Math.sin((double) field301 / 14.0D) * 16.0D + Math.sin((double) field301 / 15.0D) * 14.0D + Math.sin((double) field301 / 16.0D) * 12.0D);
                field301++;
            }
            field310 += var20 * -1360873495;
            int var35 = ((client.field568 & 0x1) + var20) / 2;
            if (var35 > 0) {
                for (int var36 = 0; var36 < field310 * 291791556; var36++) {
                    int var37 = (int) (Math.random() * 124.0D) + 2;
                    int var38 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1027[(var38 << 7) + var37] = 192;
                }
                field310 = 0;
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
                                    var44 += Statics.field218[var35 * 128 + var43 + var46];
                                }
                                if (var45 - (var35 + 1) >= 0) {
                                    var44 -= Statics.field218[var43 + var46 - (var35 + 1) * 128];
                                }
                                if (var45 >= 0) {
                                    Statics.field1027[var43 + var46] = var44 / (var35 * 2 + 1);
                                }
                            }
                            var43++;
                        }
                    }
                    int var40 = 0;
                    int var41 = var39 * 128;
                    for (int var42 = -var35; var42 < 128; var42++) {
                        if (var35 + var42 < 128) {
                            var40 += Statics.field1027[var41 + var42 + var35];
                        }
                        if (var42 - (var35 + 1) >= 0) {
                            var40 -= Statics.field1027[var41 + var42 - (var35 + 1)];
                        }
                        if (var42 >= 0) {
                            Statics.field218[var41 + var42] = var40 / (var35 * 2 + 1);
                        }
                    }
                    var39++;
                }
            }
            field319 = 0;
        }
        method140();
        Statics.field2558[field305 ? 1 : 0].method1744(725, 463);
        if (client.field483 > 5 && client.field559 == 0) {
            if (Statics.field1934 == null) {
                Statics.field1934 = class83.method146(Statics.field127, "sl_button", "");
            } else {
                byte var47 = 5;
                short var48 = 463;
                byte var49 = 100;
                byte var50 = 35;
                Statics.field1934.method1744(var47, var48);
                arg0.method3436(class133.field2246 + " " + client.field475, var49 / 2 + var47, var50 / 2 + var48 - 2, 16777215, 0);
                if (Statics.field1382 == null) {
                    arg1.method3436(class133.field2320, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                } else {
                    arg1.method3436(class133.field2319, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var51 = Statics.field740.getGraphics();
            Statics.field269.method1570(var51, 0, 0);
        } catch (Exception var53) {
            Statics.field740.repaint();
        }
    }

    @ObfuscatedName("bb.v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1326(String arg0, String arg1, String arg2) {
        field315 = arg0;
        field330 = arg1;
        field321 = arg2;
    }

    @ObfuscatedName("dy.k(Lcb;S)V")
    public static final void method2155(class86 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2814.length; var2++) {
            Statics.field2814[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2814[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field23[var8] = (Statics.field2814[var8 - 1] + Statics.field2814[var8 + 1] + Statics.field2814[var8 - 128] + Statics.field2814[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2814;
            Statics.field2814 = Statics.field23;
            Statics.field23 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1485; var11++) {
            for (int var12 = 0; var12 < arg0.field1483; var12++) {
                if (arg0.field1486[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1487;
                    int var14 = var11 + 16 + arg0.field1488;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2814[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("e.g(IIIB)I")
    public static final int method131(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("l.n(I)V")
    public static final void method140() {
        short var0 = 256;
        if (field307 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field307 > 768) {
                    Statics.field2823[var1] = method131(Statics.field308[var1], Statics.field309[var1], 1024 - field307);
                } else if (field307 > 256) {
                    Statics.field2823[var1] = Statics.field309[var1];
                } else {
                    Statics.field2823[var1] = method131(Statics.field309[var1], Statics.field308[var1], 256 - field307);
                }
            }
        } else if (field333 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field333 > 768) {
                    Statics.field2823[var2] = method131(Statics.field308[var2], Statics.field1827[var2], 1024 - field333);
                } else if (field333 > 256) {
                    Statics.field2823[var2] = Statics.field1827[var2];
                } else {
                    Statics.field2823[var2] = method131(Statics.field1827[var2], Statics.field308[var2], 256 - field333);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2823[var3] = Statics.field308[var3];
            }
        }
        class88.method1759(0, 9, 128, var0 + 7);
        Statics.field1378.method1658(0, 0);
        class88.method1754();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field320[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1027[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2823[var10];
                    int var14 = Statics.field269.field1466[var5];
                    Statics.field269.field1466[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class88.method1759(637, 9, 765, var0 + 7);
        Statics.field312.method1658(382, 0);
        class88.method1754();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field320[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1027[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2823[var22];
                    int var26 = Statics.field269.field1466[var20];
                    Statics.field269.field1466[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cq.c(Lfz;Lfz;I)V")
    public static void method1567(class182 arg0, class182 arg1) {
        if (Statics.field327 == null) {
            Statics.field327 = class83.method1566(Statics.field127, "sl_back", "");
        }
        if (Statics.field265 == null) {
            Statics.field265 = class83.method2082(Statics.field127, "sl_flags", "");
        }
        if (Statics.field758 == null) {
            Statics.field758 = class83.method2082(Statics.field127, "sl_arrows", "");
        }
        if (Statics.field873 == null) {
            Statics.field873 = class83.method2082(Statics.field127, "sl_stars", "");
        }
        class88.method1761(0, 23, 765, 480, 0);
        class88.method1762(0, 0, 125, 23, 12425273, 9135624);
        class88.method1762(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3436(class133.field2310, 62, 15, 0, -1);
        if (Statics.field873 != null) {
            Statics.field873[1].method1744(140, 1);
            arg1.method3411(class133.field2311, 152, 10, 16777215, -1);
            Statics.field873[0].method1744(140, 12);
            arg1.method3411(class133.field2312, 152, 21, 16777215, -1);
        }
        if (Statics.field758 != null) {
            short var2 = 280;
            if (field311[0] == 0 && field332[0] == 0) {
                Statics.field758[2].method1744(var2, 4);
            } else {
                Statics.field758[0].method1744(var2, 4);
            }
            if (field311[0] == 0 && field332[0] == 1) {
                Statics.field758[3].method1744(var2 + 15, 4);
            } else {
                Statics.field758[1].method1744(var2 + 15, 4);
            }
            arg0.method3411(class133.field2313, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field311[0] == 1 && field332[0] == 0) {
                Statics.field758[2].method1744(var3, 4);
            } else {
                Statics.field758[0].method1744(var3, 4);
            }
            if (field311[0] == 1 && field332[0] == 1) {
                Statics.field758[3].method1744(var3 + 15, 4);
            } else {
                Statics.field758[1].method1744(var3 + 15, 4);
            }
            arg0.method3411(class133.field2206, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field311[0] == 2 && field332[0] == 0) {
                Statics.field758[2].method1744(var4, 4);
            } else {
                Statics.field758[0].method1744(var4, 4);
            }
            if (field311[0] == 2 && field332[0] == 1) {
                Statics.field758[3].method1744(var4 + 15, 4);
            } else {
                Statics.field758[1].method1744(var4 + 15, 4);
            }
            arg0.method3411(class133.field2116, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field311[0] == 3 && field332[0] == 0) {
                Statics.field758[2].method1744(var5, 4);
            } else {
                Statics.field758[0].method1744(var5, 4);
            }
            if (field311[0] == 3 && field332[0] == 1) {
                Statics.field758[3].method1744(var5 + 15, 4);
            } else {
                Statics.field758[1].method1744(var5 + 15, 4);
            }
            arg0.method3411(class133.field2316, var5 + 32, 17, 16777215, -1);
        }
        class88.method1761(708, 4, 50, 16, 0);
        arg1.method3436(class133.field2304, 733, 16, 16777215, -1);
        field331 = -1;
        if (Statics.field327 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field328) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field328) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field328) {
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
            for (int var19 = 0; var19 < field328; var19++) {
                class12 var20 = Statics.field2001[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field200);
                if (var20.field200 == -1) {
                    var22 = class133.field2317;
                    var21 = false;
                } else if (var20.field200 > 1980) {
                    var22 = class133.field2318;
                    var21 = false;
                }
                if (class76.field1399 >= var17 && class76.field1388 >= var16 && class76.field1399 < var6 + var17 && class76.field1388 < var7 + var16 && var21) {
                    field331 = var19;
                    Statics.field327[var20.field208 ? 1 : 0].method1664(var17, var16, 128, 16777215);
                } else {
                    Statics.field327[var20.field208 ? 1 : 0].method1658(var17, var16);
                }
                if (Statics.field265 != null) {
                    Statics.field265[(var20.field208 ? 8 : 0) + var20.field202].method1744(var17 + 29, var16);
                }
                arg0.method3436(Integer.toString(var20.field205), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3436(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var23 = Statics.field740.getGraphics();
            Statics.field269.method1570(var23, 0, 0);
        } catch (Exception var25) {
            Statics.field740.repaint();
        }
    }

    @ObfuscatedName("l.o(I)V")
    public static void method138() {
        try {
            if (Statics.field1382 == null) {
                Statics.field1382 = new class23(Statics.field1175, new URL(Statics.field635));
            } else {
                byte[] var0 = Statics.field1382.method216();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field328 = var1.method2489();
                    Statics.field2001 = new class12[field328];
                    int var2 = 0;
                    while (var2 < field328) {
                        class12 var3 = Statics.field2001[var2] = new class12();
                        int var4 = var1.method2489();
                        var3.field205 = var4 & 0x7FFF;
                        var3.field208 = (var4 & 0x8000) != 0;
                        var3.field201 = var1.method2383();
                        var3.field202 = var1.method2544();
                        var3.field200 = var1.method2378();
                        var3.field203 = var2++;
                    }
                    method2626(Statics.field2001, 0, Statics.field2001.length - 1, field311, field332);
                    field326 = true;
                    Statics.field1382 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1382 = null;
        }
    }

    @ObfuscatedName("c.u(III)V")
    public static void method73(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field311[var5] != arg0) {
                var2[var4] = field311[var5];
                var3[var4] = field332[var5];
                var4++;
            }
        }
        field311 = var2;
        field332 = var3;
        method2626(Statics.field2001, 0, Statics.field2001.length - 1, field311, field332);
    }

    @ObfuscatedName("eo.z([Lz;II[I[II)V")
    public static void method2626(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class12 var8 = arg0[var7];
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
                        var11 = arg0[var6].field203;
                        var12 = var8.field203;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field200;
                        var12 = var8.field200;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field208 ? 1 : 0;
                        var12 = var8.field208 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field205;
                        var12 = var8.field205;
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
                        var15 = arg0[var5].field203;
                        var16 = var8.field203;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field200;
                        var16 = var8.field200;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field208 ? 1 : 0;
                        var16 = var8.field208 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field205;
                        var16 = var8.field205;
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
                class12 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2626(arg0, arg1, var6, arg3, arg4);
        method2626(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
