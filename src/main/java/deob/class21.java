package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("f")
public class class21 {

    @ObfuscatedName("f.x")
    public static int[] field323 = new int[256];

    @ObfuscatedName("f.d")
    public static int field333 = 0;

    @ObfuscatedName("f.m")
    public static int field325 = 0;

    @ObfuscatedName("f.e")
    public static int field327 = 0;

    @ObfuscatedName("f.r")
    public static int field328 = 0;

    @ObfuscatedName("f.av")
    public static int field329 = 0;

    @ObfuscatedName("f.an")
    public static int field331 = 0;

    @ObfuscatedName("f.ae")
    public static int field315 = 10;

    @ObfuscatedName("f.au")
    public static String field335 = "";

    @ObfuscatedName("f.ag")
    public static int field330 = 0;

    @ObfuscatedName("f.at")
    public static String field332 = "";

    @ObfuscatedName("f.ac")
    public static String field334 = "";

    @ObfuscatedName("f.aw")
    public static String field336 = "";

    @ObfuscatedName("f.ah")
    public static String field337 = "";

    @ObfuscatedName("f.ai")
    public static String field341 = "";

    @ObfuscatedName("f.ap")
    public static int field339 = 0;

    @ObfuscatedName("f.ad")
    public static String field340 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("f.az")
    public static boolean field324 = false;

    @ObfuscatedName("f.aq")
    public static int field342 = 0;

    @ObfuscatedName("f.bj")
    public static int[] field344 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("f.bk")
    public static int[] field345 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("f.bm")
    public static int field346 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.b(Leo;Leo;I)I")
    public static int method2326(class153 arg0, class153 arg1) {
        int var2 = 0;
        if (arg0.method2981("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2981("logo", "")) {
            var2++;
        }
        if (arg1.method2981("titlebox", "")) {
            var2++;
        }
        if (arg1.method2981("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2981("runes", "")) {
            var2++;
        }
        if (arg1.method2981("title_mute", "")) {
            var2++;
        }
        arg1.method2981("sl_back", "");
        arg1.method2981("sl_flags", "");
        arg1.method2981("sl_arrows", "");
        arg1.method2981("sl_stars", "");
        arg1.method2981("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ai.c(I)V")
    public static void method749() {
        if (!Statics.field320) {
            return;
        }
        Statics.field316 = null;
        Statics.field317 = null;
        Statics.field318 = null;
        Statics.field319 = null;
        Statics.field322 = null;
        Statics.field321 = null;
        Statics.field2502 = null;
        Statics.field2368 = null;
        Statics.field2010 = null;
        Statics.field1268 = null;
        Statics.field1457 = null;
        Statics.field1281 = null;
        Statics.field348 = null;
        Statics.field1468 = null;
        Statics.field1809 = null;
        Statics.field2792 = null;
        Statics.field1328 = null;
        Statics.field872 = null;
        Statics.field1041 = null;
        Statics.field338 = null;
        class139.field2379 = 1;
        Statics.field2380 = null;
        Statics.field2381 = -1;
        Statics.field2383 = -1;
        Statics.field89 = 0;
        Statics.field1543 = false;
        Statics.field2382 = 2;
        class154.method126(true);
        Statics.field320 = false;
    }

    @ObfuscatedName("l.j(Lbt;S)V")
    public static void method165(class73 arg0) {
        if (!field324) {
            if ((class77.field1425 == 1 || !Statics.field377 && class77.field1425 == 4) && class77.field1421 >= 715 && class77.field1416 >= 453) {
                Statics.field29.field216 = !Statics.field29.field216;
                class29 var6 = null;
                try {
                    var6 = class82.method2167("", Statics.field1217.field2117, true);
                    class127 var7 = Statics.field29.method133();
                    var6.method559(var7.field2056, 0, var7.field2051);
                } catch (Exception var32) {
                }
                try {
                    if (var6 != null) {
                        var6.method541();
                    }
                } catch (Exception var31) {
                }
                if (Statics.field29.field216) {
                    Statics.field68.method2755();
                    class139.field2379 = 1;
                    Statics.field2380 = null;
                } else {
                    class139.method1539(Statics.field509, "scape main", "", 255, false);
                }
            }
            if (client.field487 != 5) {
                field329++;
                if (client.field487 == 10) {
                    if (client.field688 == 0) {
                        if (class77.field1425 == 1 || !Statics.field377 && class77.field1425 == 4) {
                            byte var10 = 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class77.field1421 >= var10 && class77.field1421 <= var10 + var12 && class77.field1416 >= var11 && class77.field1416 <= var11 + var13) {
                                method30();
                                return;
                            }
                        }
                        if (Statics.field2593 != null) {
                            method30();
                        }
                    }
                    int var14 = class77.field1425;
                    int var15 = class77.field1421;
                    int var16 = class77.field1416;
                    if (!Statics.field377 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field330 == 0) {
                        short var17 = 302;
                        short var18 = 291;
                        if (var14 == 1 && var15 >= var17 - 75 && var15 <= var17 + 75 && var16 >= var18 - 20 && var16 <= var18 + 20) {
                            field330 = 3;
                            field339 = 0;
                        }
                        short var19 = 462;
                        if (var14 == 1 && var15 >= var19 - 75 && var15 <= var19 + 75 && var16 >= var18 - 20 && var16 <= var18 + 20) {
                            if ((client.field636 & 0x4) != 0) {
                                if ((client.field636 & 0x400) == 0) {
                                    field332 = class135.field2191;
                                    field334 = class135.field2296;
                                    field336 = class135.field2334;
                                } else {
                                    field332 = class135.field2333;
                                    field334 = class135.field2147;
                                    field336 = class135.field2300;
                                }
                                field330 = 1;
                                field339 = 0;
                            } else if ((client.field636 & 0x400) == 0) {
                                field332 = class135.field2323;
                                field334 = class135.field2324;
                                field336 = class135.field2124;
                                field330 = 2;
                                field339 = 0;
                            } else {
                                field332 = class135.field2229;
                                field334 = class135.field2331;
                                field336 = class135.field2332;
                                field330 = 1;
                                field339 = 0;
                            }
                        }
                    } else if (field330 == 1) {
                        while (class75.method1644()) {
                            if (Statics.field1938 == 84) {
                                field332 = class135.field2323;
                                field334 = class135.field2324;
                                field336 = class135.field2124;
                                field330 = 2;
                                field339 = 0;
                            } else if (Statics.field1938 == 13) {
                                field330 = 0;
                            }
                        }
                        short var20 = 302;
                        short var21 = 321;
                        if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var21 - 20 && var16 <= var21 + 20) {
                            field332 = class135.field2323;
                            field334 = class135.field2324;
                            field336 = class135.field2124;
                            field330 = 2;
                            field339 = 0;
                        }
                        short var22 = 462;
                        if (var14 == 1 && var15 >= var22 - 75 && var15 <= var22 + 75 && var16 >= var21 - 20 && var16 <= var21 + 20) {
                            field330 = 0;
                        }
                    } else if (field330 == 2) {
                        short var23 = 231;
                        int var33 = var23 + 30;
                        if (var14 == 1 && var16 >= var33 - 15 && var16 < var33) {
                            field339 = 0;
                        }
                        var33 += 15;
                        if (var14 == 1 && var16 >= var33 - 15 && var16 < var33) {
                            field339 = 1;
                        }
                        var33 += 15;
                        short var24 = 302;
                        short var25 = 321;
                        if (var14 == 1 && var15 >= var24 - 75 && var15 <= var24 + 75 && var16 >= var25 - 20 && var16 <= var25 + 20) {
                            field337 = field337.trim();
                            if (field337.length() == 0) {
                                method1807(class135.field2233, class135.field2234, class135.field2304);
                                return;
                            }
                            if (field341.length() == 0) {
                                method1807(class135.field2339, class135.field2237, class135.field2238);
                                return;
                            }
                            method1807(class135.field2336, class135.field2337, class135.field2338);
                            client.method222(20);
                            return;
                        }
                        short var26 = 462;
                        if (var14 == 1 && var15 >= var26 - 75 && var15 <= var26 + 75 && var16 >= var25 - 20 && var16 <= var25 + 20) {
                            field330 = 0;
                            field337 = "";
                            field341 = "";
                        }
                        while (true) {
                            while (class75.method1644()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field340.length(); var28++) {
                                    if (Statics.field398 == field340.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1938 == 13) {
                                    field330 = 0;
                                    field337 = "";
                                    field341 = "";
                                } else if (field339 == 0) {
                                    if (Statics.field1938 == 85 && field337.length() > 0) {
                                        field337 = field337.substring(0, field337.length() - 1);
                                    }
                                    if (Statics.field1938 == 84 || Statics.field1938 == 80) {
                                        field339 = 1;
                                    }
                                    if (var27 && field337.length() < 320) {
                                        field337 = field337 + Statics.field398;
                                    }
                                } else if (field339 == 1) {
                                    if (Statics.field1938 == 85 && field341.length() > 0) {
                                        field341 = field341.substring(0, field341.length() - 1);
                                    }
                                    if (Statics.field1938 == 84 || Statics.field1938 == 80) {
                                        field339 = 0;
                                    }
                                    if (Statics.field1938 == 84) {
                                        field337 = field337.trim();
                                        if (field337.length() == 0) {
                                            method1807(class135.field2233, class135.field2234, class135.field2304);
                                            return;
                                        }
                                        if (field341.length() == 0) {
                                            method1807(class135.field2339, class135.field2237, class135.field2238);
                                            return;
                                        }
                                        method1807(class135.field2336, class135.field2337, class135.field2338);
                                        client.method222(20);
                                        return;
                                    }
                                    if (var27 && field341.length() < 20) {
                                        field341 = field341 + Statics.field398;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field330 == 3) {
                        short var29 = 382;
                        short var30 = 321;
                        if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var30 - 20 && var16 <= var30 + 20) {
                            field330 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1425 == 1 || !Statics.field377 && class77.field1425 == 4) {
            short var1 = 280;
            if (class77.field1421 >= var1 && class77.field1421 <= var1 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                method43(0, 0);
            } else if (class77.field1421 >= var1 + 15 && class77.field1421 <= var1 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                method43(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1421 >= var2 && class77.field1421 <= var2 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                    method43(1, 0);
                } else if (class77.field1421 >= var2 + 15 && class77.field1421 <= var2 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                    method43(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1421 >= var3 && class77.field1421 <= var3 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                        method43(2, 0);
                    } else if (class77.field1421 >= var3 + 15 && class77.field1421 <= var3 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                        method43(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1421 >= var4 && class77.field1421 <= var4 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                            method43(3, 0);
                        } else if (class77.field1421 >= var4 + 15 && class77.field1421 <= var4 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                            method43(3, 1);
                        } else if (class77.field1421 >= 708 && class77.field1416 >= 4 && class77.field1421 <= 758 && class77.field1416 <= 20) {
                            field324 = false;
                            Statics.field319.method1657(0, 0);
                            Statics.field322.method1657(382, 0);
                            Statics.field321.method1730(382 - Statics.field321.field1504 / 2, 18);
                        } else if (field346 != -1) {
                            class13 var5 = Statics.field1022[field346];
                            if (var5.method140() != client.field661) {
                                client.field661 = var5.method140();
                                class40.method744(var5.method140());
                            }
                            Statics.field1835 = var5.field221;
                            client.field480 = var5.field222;
                            client.field636 = var5.field226;
                            Statics.field59 = client.field483 == 0 ? 43594 : var5.field222 + 40000;
                            Statics.field207 = client.field483 == 0 ? 443 : var5.field222 + 50000;
                            Statics.field411 = Statics.field59;
                            field324 = false;
                            Statics.field319.method1657(0, 0);
                            Statics.field322.method1657(382, 0);
                            Statics.field321.method1730(382 - Statics.field321.field1504 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.i(Lgw;Lgw;I)V")
    public static void method1460(class183 arg0, class183 arg1) {
        if (field324) {
            if (Statics.field2368 == null) {
                Statics.field2368 = class84.method183(Statics.field950, "sl_back", "");
            }
            if (Statics.field2010 == null) {
                Statics.field2010 = class84.method167(Statics.field950, "sl_flags", "");
            }
            if (Statics.field1268 == null) {
                Statics.field1268 = class84.method167(Statics.field950, "sl_arrows", "");
            }
            if (Statics.field1457 == null) {
                Statics.field1457 = class84.method167(Statics.field950, "sl_stars", "");
            }
            class89.method1770(0, 23, 765, 480, 0);
            class89.method1784(0, 0, 125, 23, 12425273, 9135624);
            class89.method1784(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3326(class135.field2125, 62, 15, 0, -1);
            if (Statics.field1457 != null) {
                Statics.field1457[1].method1730(140, 1);
                arg1.method3367(class135.field2352, 152, 10, 16777215, -1);
                Statics.field1457[0].method1730(140, 12);
                arg1.method3367(class135.field2353, 152, 21, 16777215, -1);
            }
            if (Statics.field1268 != null) {
                short var2 = 280;
                if (field344[0] == 0 && field345[0] == 0) {
                    Statics.field1268[2].method1730(var2, 4);
                } else {
                    Statics.field1268[0].method1730(var2, 4);
                }
                if (field344[0] == 0 && field345[0] == 1) {
                    Statics.field1268[3].method1730(var2 + 15, 4);
                } else {
                    Statics.field1268[1].method1730(var2 + 15, 4);
                }
                arg0.method3367(class135.field2328, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field344[0] == 1 && field345[0] == 0) {
                    Statics.field1268[2].method1730(var3, 4);
                } else {
                    Statics.field1268[0].method1730(var3, 4);
                }
                if (field344[0] == 1 && field345[0] == 1) {
                    Statics.field1268[3].method1730(var3 + 15, 4);
                } else {
                    Statics.field1268[1].method1730(var3 + 15, 4);
                }
                arg0.method3367(class135.field2355, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field344[0] == 2 && field345[0] == 0) {
                    Statics.field1268[2].method1730(var4, 4);
                } else {
                    Statics.field1268[0].method1730(var4, 4);
                }
                if (field344[0] == 2 && field345[0] == 1) {
                    Statics.field1268[3].method1730(var4 + 15, 4);
                } else {
                    Statics.field1268[1].method1730(var4 + 15, 4);
                }
                arg0.method3367(class135.field2358, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field344[0] == 3 && field345[0] == 0) {
                    Statics.field1268[2].method1730(var5, 4);
                } else {
                    Statics.field1268[0].method1730(var5, 4);
                }
                if (field344[0] == 3 && field345[0] == 1) {
                    Statics.field1268[3].method1730(var5 + 15, 4);
                } else {
                    Statics.field1268[1].method1730(var5 + 15, 4);
                }
                arg0.method3367(class135.field2357, var5 + 32, 17, 16777215, -1);
            }
            class89.method1770(708, 4, 50, 16, 0);
            arg1.method3326(class135.field2345, 733, 16, 16777215, -1);
            field346 = -1;
            if (Statics.field2368 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field342) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field342) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field342) {
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
                for (int var20 = 0; var20 < field342; var20++) {
                    class13 var21 = Statics.field1022[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field220);
                    if (var21.field220 == -1) {
                        var23 = class135.field2295;
                        var22 = false;
                    } else if (var21.field220 > 1980) {
                        var23 = class135.field2281;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method145()) {
                        if (var21.method140()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method140()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class77.field1410 >= var17 && class77.field1411 >= var16 && class77.field1410 < var6 + var17 && class77.field1411 < var7 + var16 && var22) {
                        field346 = var20;
                        Statics.field2368[var24].method1652(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field2368[var24].method1657(var17, var16);
                    }
                    if (Statics.field2010 != null) {
                        Statics.field2010[(var21.method140() ? 8 : 0) + var21.field223].method1730(var17 + 29, var16);
                    }
                    arg0.method3326(Integer.toString(var21.field222), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3326(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3321(Statics.field1022[field346].field230) + 6;
                    int var26 = arg1.field2850 + 8;
                    class89.method1770(class77.field1410 - var25 / 2, class77.field1411 + 20 + 5, var25, var26, 16777120);
                    class89.method1759(class77.field1410 - var25 / 2, class77.field1411 + 20 + 5, var25, var26, 0);
                    arg1.method3326(Statics.field1022[field346].field230, class77.field1410, class77.field1411 + 20 + 5 + arg1.field2850 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field869.getGraphics();
                Statics.field1541.method1582(var27, 0, 0);
            } catch (Exception var92) {
                Statics.field869.repaint();
            }
            return;
        }
        if (client.field487 == 0 || client.field487 == 5) {
            byte var29 = 20;
            arg0.method3326(class135.field2135, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class89.method1759(230, var30, 304, 34, 9179409);
            class89.method1759(231, var30 + 1, 302, 32, 0);
            class89.method1770(232, var30 + 2, field315 * 3, 30, 9179409);
            class89.method1770(field315 * 3 + 232, var30 + 2, 300 - field315 * 3, 30, 0);
            arg0.method3326(field335, 382, 276 - var29, 16777215, -1);
        }
        if (client.field487 == 20) {
            Statics.field316.method1730(382 - Statics.field316.field1504 / 2, 271 - Statics.field316.field1506 / 2);
            short var31 = 211;
            arg0.method3326(field332, 382, var31, 16776960, 0);
            int var94 = var31 + 15;
            arg0.method3326(field334, 382, var94, 16776960, 0);
            int var95 = var94 + 15;
            arg0.method3326(field336, 382, var95, 16776960, 0);
            int var96 = var95 + 15;
            int var97 = var96 + 10;
            arg0.method3367(class135.field2241, 272, var97, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field337; arg0.method3321(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3367(class185.method3371(var33), 312, var97, 16777215, 0);
            var94 = var97 + 15;
            arg0.method3367(class135.field2340 + class148.method139(field341), 274, var94, 16777215, 0);
            var94 += 15;
        }
        if (client.field487 == 10) {
            Statics.field316.method1730(202, 171);
            if (field330 == 0) {
                short var34 = 251;
                arg0.method3326(class135.field2313, 382, var34, 16776960, 0);
                int var98 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field317.method1730(var35 - 73, var36 - 20);
                arg0.method3340(class135.field2202, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field317.method1730(var37 - 73, var36 - 20);
                arg0.method3340(class135.field2160, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field330 == 1) {
                arg0.method3326(class135.field2326, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3326(field332, 382, var38, 16777215, 0);
                int var99 = var38 + 15;
                arg0.method3326(field334, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method3326(field336, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var39 = 302;
                short var40 = 321;
                Statics.field317.method1730(var39 - 73, var40 - 20);
                arg0.method3326(class135.field2263, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                Statics.field317.method1730(var41 - 73, var40 - 20);
                arg0.method3326(class135.field2345, var41, var40 + 5, 16777215, 0);
            } else if (field330 == 2) {
                short var42 = 211;
                arg0.method3326(field332, 382, var42, 16776960, 0);
                int var102 = var42 + 15;
                arg0.method3326(field334, 382, var102, 16776960, 0);
                int var103 = var102 + 15;
                arg0.method3326(field336, 382, var103, 16776960, 0);
                int var104 = var103 + 15;
                int var105 = var104 + 10;
                arg0.method3367(class135.field2241, 272, var105, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field337; arg0.method3321(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3367(class185.method3371(var44) + (field339 == 0 & client.field489 % 40 < 20 ? class2.method1344(16776960) + class2.field30 : ""), 312, var105, 16777215, 0);
                var102 = var105 + 15;
                String var46 = class135.field2340;
                String var47 = field341;
                int var48 = var47.length();
                char[] var49 = new char[var48];
                for (int var50 = 0; var50 < var48; var50++) {
                    var49[var50] = '*';
                }
                String var51 = new String(var49);
                arg0.method3367(var46 + var51 + (field339 == 1 & client.field489 % 40 < 20 ? class2.method1344(16776960) + class2.field30 : ""), 274, var102, 16777215, 0);
                var102 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field317.method1730(var53 - 73, var54 - 20);
                arg0.method3326(class135.field2344, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field317.method1730(var55 - 73, var54 - 20);
                arg0.method3326(class135.field2345, var55, var54 + 5, 16777215, 0);
            } else if (field330 == 3) {
                arg0.method3326(class135.field2346, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3326(class135.field2225, 382, var56, 16777215, 0);
                int var106 = var56 + 15;
                arg0.method3326(class135.field2348, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3326(class135.field2218, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method3326(class135.field2350, 382, var108, 16777215, 0);
                int var109 = var108 + 15;
                short var57 = 382;
                short var58 = 321;
                Statics.field317.method1730(var57 - 73, var58 - 20);
                arg0.method3326(class135.field2345, var57, var58 + 5, 16777215, 0);
            }
        }
        if (field329 > 0) {
            method49(field329);
            field329 = 0;
        }
        short var59 = 256;
        if (field333 > 0) {
            for (int var60 = 0; var60 < 256; var60++) {
                if (field333 > 768) {
                    Statics.field2792[var60] = method28(Statics.field348[var60], Statics.field1468[var60], 1024 - field333);
                } else if (field333 > 256) {
                    Statics.field2792[var60] = Statics.field1468[var60];
                } else {
                    Statics.field2792[var60] = method28(Statics.field1468[var60], Statics.field348[var60], 256 - field333);
                }
            }
        } else if (field325 > 0) {
            for (int var61 = 0; var61 < 256; var61++) {
                if (field325 > 768) {
                    Statics.field2792[var61] = method28(Statics.field348[var61], Statics.field1809[var61], 1024 - field325);
                } else if (field325 > 256) {
                    Statics.field2792[var61] = Statics.field1809[var61];
                } else {
                    Statics.field2792[var61] = method28(Statics.field1809[var61], Statics.field348[var61], 256 - field325);
                }
            }
        } else {
            for (int var62 = 0; var62 < 256; var62++) {
                Statics.field2792[var62] = Statics.field348[var62];
            }
        }
        class89.method1743(0, 9, 128, var59 + 7);
        Statics.field319.method1657(0, 0);
        class89.method1742();
        int var63 = 0;
        int var64 = 6885;
        for (int var65 = 1; var65 < var59 - 1; var65++) {
            int var66 = (var59 - var65) * field323[var65] / var59;
            int var67 = var66 + 22;
            if (var67 < 0) {
                var67 = 0;
            }
            var63 += var67;
            for (int var68 = var67; var68 < 128; var68++) {
                int var69 = Statics.field1041[var63++];
                if (var69 == 0) {
                    var64++;
                } else {
                    int var71 = 256 - var69;
                    int var72 = Statics.field2792[var69];
                    int var73 = Statics.field1541.field1486[var64];
                    Statics.field1541.field1486[var64++] = ((var72 & 0xFF00) * var69 + (var73 & 0xFF00) * var71 & 0xFF0000) + ((var72 & 0xFF00FF) * var69 + (var73 & 0xFF00FF) * var71 & 0xFF00FF00) >> 8;
                }
            }
            var64 += var67 + 765 - 128;
        }
        class89.method1743(637, 9, 765, var59 + 7);
        Statics.field322.method1657(382, 0);
        class89.method1742();
        int var74 = 0;
        int var75 = 7546;
        for (int var76 = 1; var76 < var59 - 1; var76++) {
            int var77 = (var59 - var76) * field323[var76] / var59;
            int var78 = 103 - var77;
            int var79 = var75 + var77;
            for (int var80 = 0; var80 < var78; var80++) {
                int var81 = Statics.field1041[var74++];
                if (var81 == 0) {
                    var79++;
                } else {
                    int var83 = 256 - var81;
                    int var84 = Statics.field2792[var81];
                    int var85 = Statics.field1541.field1486[var79];
                    Statics.field1541.field1486[var79++] = ((var84 & 0xFF00) * var81 + (var85 & 0xFF00) * var83 & 0xFF0000) + ((var84 & 0xFF00FF) * var81 + (var85 & 0xFF00FF) * var83 & 0xFF00FF00) >> 8;
                }
            }
            var74 += 128 - var78;
            var75 = 765 - var78 - var77 + var79;
        }
        Statics.field2502[Statics.field29.field216 ? 1 : 0].method1730(725, 463);
        if (client.field487 > 5 && client.field688 == 0) {
            if (Statics.field1281 == null) {
                Statics.field1281 = class84.method806(Statics.field950, "sl_button", "");
            } else {
                byte var86 = 5;
                short var87 = 463;
                byte var88 = 100;
                byte var89 = 35;
                Statics.field1281.method1730(var86, var87);
                arg0.method3326(class135.field2277 + " " + client.field480, var88 / 2 + var86, var89 / 2 + var87 - 2, 16777215, 0);
                if (Statics.field2593 == null) {
                    arg1.method3326(class135.field2226, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                } else {
                    arg1.method3326(class135.field2294, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var90 = Statics.field869.getGraphics();
            Statics.field1541.method1582(var90, 0, 0);
        } catch (Exception var93) {
            Statics.field869.repaint();
        }
    }

    @ObfuscatedName("cz.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1807(String arg0, String arg1, String arg2) {
        field332 = arg0;
        field334 = arg1;
        field336 = arg2;
    }

    @ObfuscatedName("av.q(Lcq;B)V")
    public static final void method266(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1328.length; var2++) {
            Statics.field1328[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1328[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field872[var8] = (Statics.field1328[var8 - 1] + Statics.field1328[var8 + 1] + Statics.field1328[var8 - 128] + Statics.field1328[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1328;
            Statics.field1328 = Statics.field872;
            Statics.field872 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1506; var11++) {
            for (int var12 = 0; var12 < arg0.field1504; var12++) {
                if (arg0.field1503[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1507;
                    int var14 = var11 + 16 + arg0.field1508;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1328[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("q.t(II)V")
    public static final void method49(int arg0) {
        short var1 = 256;
        field327 += arg0 * 128;
        if (field327 > Statics.field1328.length) {
            field327 -= Statics.field1328.length;
            int var2 = (int) (Math.random() * 12.0D);
            method266(Statics.field318[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1041[var3 + var4] - Statics.field1328[field327 + var3 & Statics.field1328.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1041[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1041[var9 + var10] = 255;
                } else {
                    Statics.field1041[var9 + var10] = 0;
                }
            }
        }
        if (field333 > 0) {
            field333 -= arg0 * 4;
        }
        if (field325 > 0) {
            field325 -= arg0 * 4;
        }
        if (field333 == 0 && field325 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field333 = 1024;
            }
            if (var12 == 1) {
                field325 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field323[var13] = field323[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field323[var14] = (int) (Math.sin((double) field331 / 14.0D) * 16.0D + Math.sin((double) field331 / 15.0D) * 14.0D + Math.sin((double) field331 / 16.0D) * 12.0D);
            field331++;
        }
        field328 += arg0 * -301119725;
        int var15 = ((client.field489 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field328 * 2106103436; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1041[(var18 << 7) + var17] = 192;
        }
        field328 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1041[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1041[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field338[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field338[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field338[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1041[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("i.v(IIII)I")
    public static final int method28(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("i.y(B)V")
    public static void method30() {
        try {
            if (Statics.field2593 == null) {
                Statics.field2593 = new class24(Statics.field362, new URL(Statics.field1403));
            } else {
                byte[] var0 = Statics.field2593.method228();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field342 = var1.method2394();
                    Statics.field1022 = new class13[field342];
                    int var2 = 0;
                    while (var2 < field342) {
                        class13 var3 = Statics.field1022[var2] = new class13();
                        var3.field222 = var1.method2394();
                        var3.field226 = var1.method2455();
                        var3.field221 = var1.method2473();
                        var3.field230 = var1.method2473();
                        var3.field223 = var1.method2416();
                        var3.field220 = var1.method2399();
                        var3.field224 = var2++;
                    }
                    method121(Statics.field1022, 0, Statics.field1022.length - 1, field344, field345);
                    field324 = true;
                    Statics.field2593 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2593 = null;
        }
    }

    @ObfuscatedName("k.w(III)V")
    public static void method43(int arg0, int arg1) {
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
        method121(Statics.field1022, 0, Statics.field1022.length - 1, field344, field345);
    }

    @ObfuscatedName("w.g([Ln;II[I[II)V")
    public static void method121(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field224;
                        var12 = var8.field224;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field220;
                        var12 = var8.field220;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method140() ? 1 : 0;
                        var12 = var8.method140() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field222;
                        var12 = var8.field222;
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
                        var15 = arg0[var5].field224;
                        var16 = var8.field224;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field220;
                        var16 = var8.field220;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method140() ? 1 : 0;
                        var16 = var8.method140() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field222;
                        var16 = var8.field222;
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
        method121(arg0, arg1, var6, arg3, arg4);
        method121(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
