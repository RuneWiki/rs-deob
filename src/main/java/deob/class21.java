package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("e")
public class class21 {

    @ObfuscatedName("e.k")
    public static boolean field304 = false;

    @ObfuscatedName("e.z")
    public static int[] field331 = new int[256];

    @ObfuscatedName("e.i")
    public static int field307 = 0;

    @ObfuscatedName("e.e")
    public static int field314 = 0;

    @ObfuscatedName("e.j")
    public static int field310 = 0;

    @ObfuscatedName("e.ae")
    public static int field337 = 0;

    @ObfuscatedName("e.aq")
    public static int field312 = 0;

    @ObfuscatedName("e.ap")
    public static int field313 = 0;

    @ObfuscatedName("e.ah")
    public static int field338 = 10;

    @ObfuscatedName("e.ax")
    public static String field315 = "";

    @ObfuscatedName("e.ai")
    public static int field316 = 0;

    @ObfuscatedName("e.aa")
    public static String field317 = "";

    @ObfuscatedName("e.ar")
    public static String field318 = "";

    @ObfuscatedName("e.ak")
    public static String field336 = "";

    @ObfuscatedName("e.al")
    public static String field320 = "";

    @ObfuscatedName("e.au")
    public static String field309 = "";

    @ObfuscatedName("e.aj")
    public static int field322 = 0;

    @ObfuscatedName("e.az")
    public static String field299 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("e.ay")
    public static boolean field311 = false;

    @ObfuscatedName("e.ao")
    public static int field327 = 0;

    @ObfuscatedName("e.bz")
    public static int[] field328 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("e.bm")
    public static int[] field329 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("e.bq")
    public static int field330 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.d(Ljava/awt/Component;Lej;Lej;I)V")
    public static void method883(Component arg0, class152 arg1, class152 arg2) {
        if (Statics.field302) {
            return;
        }
        class89.method1744();
        byte[] var3 = arg1.method2950("title.jpg", "");
        Statics.field2318 = new class86(var3, arg0);
        Statics.field2466 = Statics.field2318.method1635();
        Statics.field303 = class84.method1391(arg2, "logo", "");
        Statics.field300 = class84.method1391(arg2, "titlebox", "");
        Statics.field301 = class84.method1391(arg2, "titlebutton", "");
        Statics.field305 = class84.method1526(arg2, "runes", "");
        Statics.field269 = class84.method1526(arg2, "title_mute", "");
        Statics.field2582 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field2582[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field2582[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field2582[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field2582[var7 + 192] = 16777215;
        }
        Statics.field2458 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field2458[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field2458[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field2458[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field2458[var11 + 192] = 16777215;
        }
        Statics.field118 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field118[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field118[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field118[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field118[var15 + 192] = 16777215;
        }
        Statics.field1374 = new int[256];
        Statics.field290 = new int[32768];
        Statics.field306 = new int[32768];
        method201((class87) null);
        Statics.field1983 = new int[32768];
        Statics.field80 = new int[32768];
        field316 = 0;
        field320 = "";
        field309 = "";
        field311 = false;
        if (client.field532 == 0) {
            field304 = true;
        } else {
            field304 = false;
        }
        if (field304) {
            class138.field2340 = 1;
            Statics.field2341 = null;
            Statics.field2342 = -1;
            Statics.field2344 = -1;
            Statics.field2012 = 0;
            Statics.field2030 = false;
            Statics.field2038 = 2;
        } else {
            class138.method113(2, Statics.field1512, "scape main", "", 255, false);
        }
        class153.method1539(false);
        Statics.field302 = true;
        Statics.field2318.method1644(0, 0);
        Statics.field2466.method1644(382, 0);
        Statics.field303.method1734(382 - Statics.field303.field1470 / 2, 18);
    }

    @ObfuscatedName("d.g(Lbb;I)V")
    public static void method3(class73 arg0) {
        if (!field311) {
            if (class77.field1399 == 1 && class77.field1400 >= 715 && class77.field1393 >= 453) {
                field304 = !field304;
                if (field304) {
                    class138.method138();
                } else {
                    class154 var9 = Statics.field1512;
                    int var10 = var9.method2948("scape main");
                    int var11 = var9.method3007(var10, "");
                    class138.method574(var9, var10, var11, 255, false);
                }
            }
            if (client.field470 != 5) {
                field312++;
                if (client.field470 == 10) {
                    if (client.field467 == 0) {
                        if (class77.field1399 == 1) {
                            byte var12 = 5;
                            short var13 = 463;
                            byte var14 = 100;
                            byte var15 = 35;
                            if (class77.field1400 >= var12 && class77.field1400 <= var12 + var14 && class77.field1393 >= var13 && class77.field1393 <= var13 + var15) {
                                method133();
                                return;
                            }
                        }
                        if (Statics.field757 != null) {
                            method133();
                        }
                    }
                    int var16 = class77.field1399;
                    int var17 = class77.field1400;
                    int var18 = class77.field1393;
                    if (field316 == 0) {
                        short var19 = 302;
                        short var20 = 291;
                        if (var16 == 1 && var17 >= var19 - 75 && var17 <= var19 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field316 = 3;
                            field322 = 0;
                        }
                        short var21 = 462;
                        if (var16 == 1 && var17 >= var21 - 75 && var17 <= var21 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field317 = class134.field2198;
                            field318 = class134.field2281;
                            field336 = class134.field2282;
                            field316 = 2;
                            field322 = 0;
                        }
                    } else if (field316 == 2) {
                        short var22 = 231;
                        int var35 = var22 + 30;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field322 = 0;
                        }
                        var35 += 15;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field322 = 1;
                        }
                        var35 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var16 == 1 && var17 >= var23 - 75 && var17 <= var23 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field320 = field320.trim();
                            if (field320.length() == 0) {
                                method46(class134.field2190, class134.field2096, class134.field2192);
                                return;
                            }
                            if (field309.length() == 0) {
                                method46(class134.field2193, class134.field2194, class134.field2195);
                                return;
                            }
                            method46(class134.field2272, class134.field2284, class134.field2299);
                            client.method2633(20);
                            return;
                        }
                        short var25 = 462;
                        if (var16 == 1 && var17 >= var25 - 75 && var17 <= var25 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field316 = 0;
                            field320 = "";
                            field309 = "";
                        }
                        while (true) {
                            while (true) {
                                class75 var26 = class75.field1351;
                                boolean var27;
                                synchronized (class75.field1351) {
                                    if (class75.field1368 == class75.field1363) {
                                        var27 = false;
                                    } else {
                                        Statics.field2062 = class75.field1365[class75.field1368];
                                        Statics.field1360 = class75.field1364[class75.field1368];
                                        class75.field1368 = class75.field1368 + 1 & 0x7F;
                                        var27 = true;
                                    }
                                }
                                if (!var27) {
                                    return;
                                }
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field299.length(); var30++) {
                                    if (Statics.field1360 == field299.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (field322 == 0) {
                                    if (Statics.field2062 == 85 && field320.length() > 0) {
                                        field320 = field320.substring(0, field320.length() - 1);
                                    }
                                    if (Statics.field2062 == 84 || Statics.field2062 == 80) {
                                        field322 = 1;
                                    }
                                    if (var29 && field320.length() < 320) {
                                        field320 = field320 + Statics.field1360;
                                    }
                                } else if (field322 == 1) {
                                    if (Statics.field2062 == 85 && field309.length() > 0) {
                                        field309 = field309.substring(0, field309.length() - 1);
                                    }
                                    if (Statics.field2062 == 84 || Statics.field2062 == 80) {
                                        field322 = 0;
                                    }
                                    if (Statics.field2062 == 84) {
                                        field320 = field320.trim();
                                        if (field320.length() == 0) {
                                            method46(class134.field2190, class134.field2096, class134.field2192);
                                            return;
                                        }
                                        if (field309.length() == 0) {
                                            method46(class134.field2193, class134.field2194, class134.field2195);
                                            return;
                                        }
                                        method46(class134.field2272, class134.field2284, class134.field2299);
                                        client.method2633(20);
                                        return;
                                    }
                                    if (var29 && field309.length() < 20) {
                                        field309 = field309 + Statics.field1360;
                                    }
                                }
                            }
                        }
                    } else if (field316 == 3) {
                        short var31 = 382;
                        short var32 = 321;
                        if (var16 == 1 && var17 >= var31 - 75 && var17 <= var31 + 75 && var18 >= var32 - 20 && var18 <= var32 + 20) {
                            field316 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1399 == 1) {
            short var1 = 280;
            if (class77.field1400 >= var1 && class77.field1400 <= var1 + 14 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                method61(0, 0);
            } else if (class77.field1400 >= var1 + 15 && class77.field1400 <= var1 + 80 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                method61(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1400 >= var2 && class77.field1400 <= var2 + 14 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                    method61(1, 0);
                } else if (class77.field1400 >= var2 + 15 && class77.field1400 <= var2 + 80 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                    method61(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1400 >= var3 && class77.field1400 <= var3 + 14 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                        method61(2, 0);
                    } else if (class77.field1400 >= var3 + 15 && class77.field1400 <= var3 + 80 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                        method61(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1400 >= var4 && class77.field1400 <= var4 + 14 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                            method61(3, 0);
                        } else if (class77.field1400 >= var4 + 15 && class77.field1400 <= var4 + 80 && class77.field1393 >= 4 && class77.field1393 <= 18) {
                            method61(3, 1);
                        } else if (class77.field1400 >= 708 && class77.field1393 >= 4 && class77.field1400 <= 758 && class77.field1393 <= 20) {
                            field311 = false;
                            Statics.field2318.method1644(0, 0);
                            Statics.field2466.method1644(382, 0);
                            Statics.field303.method1734(382 - Statics.field303.field1470 / 2, 18);
                        } else if (field330 != -1) {
                            class13 var5 = Statics.field191[field330];
                            if (client.field471 == var5.field200) {
                                Statics.field219 = var5.field197;
                                client.field461 = var5.field199;
                                Statics.field928 = client.field462 == 0 ? 43594 : var5.field199 + 40000;
                                Statics.field2463 = client.field462 == 0 ? 443 : var5.field199 + 50000;
                                Statics.field1752 = Statics.field928;
                                field311 = false;
                                Statics.field2318.method1644(0, 0);
                                Statics.field2466.method1644(382, 0);
                                Statics.field303.method1734(382 - Statics.field303.field1470 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field462 != 0) {
                                    var6 = ":" + (var5.field199 + 7000);
                                }
                                String var7 = "http://" + var5.field197 + var6 + "/j" + client.field468;
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

    @ObfuscatedName("bu.a(Lgc;Lgc;I)V")
    public static void method1342(class183 arg0, class183 arg1) {
        if (field311) {
            if (Statics.field2795 == null) {
                Statics.field2795 = class84.method59(Statics.field1808, "sl_back", "");
            }
            if (Statics.field38 == null) {
                Statics.field38 = class84.method1526(Statics.field1808, "sl_flags", "");
            }
            if (Statics.field2053 == null) {
                Statics.field2053 = class84.method1526(Statics.field1808, "sl_arrows", "");
            }
            if (Statics.field325 == null) {
                Statics.field325 = class84.method1526(Statics.field1808, "sl_stars", "");
            }
            class89.method1748(0, 23, 765, 480, 0);
            class89.method1755(0, 0, 125, 23, 12425273, 9135624);
            class89.method1755(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3365(class134.field2135, 62, 15, 0, -1);
            if (Statics.field325 != null) {
                Statics.field325[1].method1734(140, 1);
                arg1.method3348(class134.field2183, 152, 10, 16777215, -1);
                Statics.field325[0].method1734(140, 12);
                arg1.method3348(class134.field2300, 152, 21, 16777215, -1);
            }
            if (Statics.field2053 != null) {
                short var2 = 280;
                if (field328[0] == 0 && field329[0] == 0) {
                    Statics.field2053[2].method1734(var2, 4);
                } else {
                    Statics.field2053[0].method1734(var2, 4);
                }
                if (field328[0] == 0 && field329[0] == 1) {
                    Statics.field2053[3].method1734(var2 + 15, 4);
                } else {
                    Statics.field2053[1].method1734(var2 + 15, 4);
                }
                arg0.method3348(class134.field2301, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field328[0] == 1 && field329[0] == 0) {
                    Statics.field2053[2].method1734(var3, 4);
                } else {
                    Statics.field2053[0].method1734(var3, 4);
                }
                if (field328[0] == 1 && field329[0] == 1) {
                    Statics.field2053[3].method1734(var3 + 15, 4);
                } else {
                    Statics.field2053[1].method1734(var3 + 15, 4);
                }
                arg0.method3348(class134.field2178, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field328[0] == 2 && field329[0] == 0) {
                    Statics.field2053[2].method1734(var4, 4);
                } else {
                    Statics.field2053[0].method1734(var4, 4);
                }
                if (field328[0] == 2 && field329[0] == 1) {
                    Statics.field2053[3].method1734(var4 + 15, 4);
                } else {
                    Statics.field2053[1].method1734(var4 + 15, 4);
                }
                arg0.method3348(class134.field2303, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field328[0] == 3 && field329[0] == 0) {
                    Statics.field2053[2].method1734(var5, 4);
                } else {
                    Statics.field2053[0].method1734(var5, 4);
                }
                if (field328[0] == 3 && field329[0] == 1) {
                    Statics.field2053[3].method1734(var5 + 15, 4);
                } else {
                    Statics.field2053[1].method1734(var5 + 15, 4);
                }
                arg0.method3348(class134.field2304, var5 + 32, 17, 16777215, -1);
            }
            class89.method1748(708, 4, 50, 16, 0);
            arg1.method3365(class134.field2293, 733, 16, 16777215, -1);
            field330 = -1;
            if (Statics.field2795 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field327) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field327) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field327) {
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
                for (int var19 = 0; var19 < field327; var19++) {
                    class13 var20 = Statics.field191[var19];
                    boolean var21 = true;
                    String var22 = Integer.toString(var20.field204);
                    if (var20.field204 == -1) {
                        var22 = class134.field2275;
                        var21 = false;
                    } else if (var20.field204 > 1980) {
                        var22 = class134.field2285;
                        var21 = false;
                    }
                    if (class77.field1405 >= var17 && class77.field1394 >= var16 && class77.field1405 < var6 + var17 && class77.field1394 < var7 + var16 && var21) {
                        field330 = var19;
                        Statics.field2795[var20.field200 ? 1 : 0].method1650(var17, var16, 128, 16777215);
                    } else {
                        Statics.field2795[var20.field200 ? 1 : 0].method1644(var17, var16);
                    }
                    if (Statics.field38 != null) {
                        Statics.field38[(var20.field200 ? 8 : 0) + var20.field198].method1734(var17 + 29, var16);
                    }
                    arg0.method3365(Integer.toString(var20.field199), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3365(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
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
                Graphics var23 = Statics.field1272.getGraphics();
                Statics.field1022.method1572(var23, 0, 0);
            } catch (Exception var111) {
                Statics.field1272.repaint();
            }
            return;
        }
        if (client.field470 == 0 || client.field470 == 5) {
            byte var25 = 20;
            arg0.method3365(class134.field2279, 382, 245 - var25, 16777215, -1);
            int var26 = 253 - var25;
            class89.method1759(230, var26, 304, 34, 9179409);
            class89.method1759(231, var26 + 1, 302, 32, 0);
            class89.method1748(232, var26 + 2, field338 * 3, 30, 9179409);
            class89.method1748(field338 * 3 + 232, var26 + 2, 300 - field338 * 3, 30, 0);
            arg0.method3365(field315, 382, 276 - var25, 16777215, -1);
        }
        if (client.field470 == 20) {
            Statics.field300.method1734(382 - Statics.field300.field1470 / 2, 271 - Statics.field300.field1473 / 2);
            short var27 = 211;
            arg0.method3365(field317, 382, var27, 16776960, 0);
            int var113 = var27 + 15;
            arg0.method3365(field318, 382, var113, 16776960, 0);
            int var114 = var113 + 15;
            arg0.method3365(field336, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            int var116 = var115 + 10;
            arg0.method3348(class134.field2186, 272, var116, 16777215, 0);
            short var28 = 200;
            String var29;
            for (var29 = field320; arg0.method3343(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
            }
            arg0.method3348(class185.method3363(var29), 312, var116, 16777215, 0);
            var113 = var116 + 15;
            String var31 = class134.field2287;
            String var32 = field309;
            String var33 = class147.method1632('*', var32.length());
            arg0.method3348(var31 + var33, 274, var113, 16777215, 0);
            var113 += 15;
        }
        if (client.field470 == 10) {
            Statics.field300.method1734(202, 171);
            if (field316 == 0) {
                short var34 = 251;
                arg0.method3365(class134.field2288, 382, var34, 16776960, 0);
                int var117 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field301.method1734(var35 - 73, var36 - 20);
                arg0.method3351(class134.field2289, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field301.method1734(var37 - 73, var36 - 20);
                arg0.method3351(class134.field2290, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field316 == 2) {
                short var38 = 211;
                arg0.method3365(field317, 382, var38, 16776960, 0);
                int var118 = var38 + 15;
                arg0.method3365(field318, 382, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg0.method3365(field336, 382, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var121 = var120 + 10;
                arg0.method3348(class134.field2186, 272, var121, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field320; arg0.method3343(var40) > var39; var40 = var40.substring(1)) {
                }
                arg0.method3348(class185.method3363(var40) + (field322 == 0 & client.field472 % 40 < 20 ? class2.method1521(16776960) + class2.field23 : ""), 312, var121, 16777215, 0);
                var118 = var121 + 15;
                String var42 = class134.field2287;
                String var43 = field309;
                String var44 = class147.method1632('*', var43.length());
                arg0.method3348(var42 + var44 + (field322 == 1 & client.field472 % 40 < 20 ? class2.method1521(16776960) + class2.field23 : ""), 274, var118, 16777215, 0);
                var118 += 15;
                short var45 = 302;
                short var46 = 321;
                Statics.field301.method1734(var45 - 73, var46 - 20);
                arg0.method3365(class134.field2117, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                Statics.field301.method1734(var47 - 73, var46 - 20);
                arg0.method3365(class134.field2293, var47, var46 + 5, 16777215, 0);
            } else if (field316 == 3) {
                arg0.method3365(class134.field2286, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3365(class134.field2294, 382, var48, 16777215, 0);
                int var122 = var48 + 15;
                arg0.method3365(class134.field2241, 382, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method3365(class134.field2296, 382, var123, 16777215, 0);
                int var124 = var123 + 15;
                arg0.method3365(class134.field2249, 382, var124, 16777215, 0);
                int var125 = var124 + 15;
                short var49 = 382;
                short var50 = 321;
                Statics.field301.method1734(var49 - 73, var50 - 20);
                arg0.method3365(class134.field2293, var49, var50 + 5, 16777215, 0);
            }
        }
        if (field312 > 0) {
            int var51 = field312;
            short var52 = 256;
            field310 += var51 * 128;
            if (field310 > Statics.field290.length) {
                field310 -= Statics.field290.length;
                int var53 = (int) (Math.random() * 12.0D);
                method201(Statics.field305[var53]);
            }
            int var54 = 0;
            int var55 = var51 * 128;
            int var56 = (var52 - var51) * 128;
            for (int var57 = 0; var57 < var56; var57++) {
                int var58 = Statics.field1983[var54 + var55] - Statics.field290[field310 + var54 & Statics.field290.length - 1] * var51 / 6;
                if (var58 < 0) {
                    var58 = 0;
                }
                Statics.field1983[var54++] = var58;
            }
            for (int var59 = var52 - var51; var59 < var52; var59++) {
                int var60 = var59 * 128;
                for (int var61 = 0; var61 < 128; var61++) {
                    int var62 = (int) (Math.random() * 100.0D);
                    if (var62 < 50 && var61 > 10 && var61 < 118) {
                        Statics.field1983[var60 + var61] = 255;
                    } else {
                        Statics.field1983[var60 + var61] = 0;
                    }
                }
            }
            if (field307 > 0) {
                field307 -= var51 * 4;
            }
            if (field314 > 0) {
                field314 -= var51 * 4;
            }
            if (field307 == 0 && field314 == 0) {
                int var63 = (int) (Math.random() * (double) (2000 / var51));
                if (var63 == 0) {
                    field307 = 1024;
                }
                if (var63 == 1) {
                    field314 = 1024;
                }
            }
            for (int var64 = 0; var64 < var52 - var51; var64++) {
                field331[var64] = field331[var51 + var64];
            }
            for (int var65 = var52 - var51; var65 < var52; var65++) {
                field331[var65] = (int) (Math.sin((double) field313 / 14.0D) * 16.0D + Math.sin((double) field313 / 15.0D) * 14.0D + Math.sin((double) field313 / 16.0D) * 12.0D);
                field313++;
            }
            field337 += var51 * 1337982361;
            int var66 = ((client.field472 & 0x1) + var51) / 2;
            if (var66 > 0) {
                for (int var67 = 0; var67 < field337 * -1992123900; var67++) {
                    int var68 = (int) (Math.random() * 124.0D) + 2;
                    int var69 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1983[(var69 << 7) + var68] = 192;
                }
                field337 = 0;
                int var70 = 0;
                label475: while (true) {
                    if (var70 >= var52) {
                        int var74 = 0;
                        while (true) {
                            if (var74 >= 128) {
                                break label475;
                            }
                            int var75 = 0;
                            for (int var76 = -var66; var76 < var52; var76++) {
                                int var77 = var76 * 128;
                                if (var66 + var76 < var52) {
                                    var75 += Statics.field80[var66 * 128 + var74 + var77];
                                }
                                if (var76 - (var66 + 1) >= 0) {
                                    var75 -= Statics.field80[var74 + var77 - (var66 + 1) * 128];
                                }
                                if (var76 >= 0) {
                                    Statics.field1983[var74 + var77] = var75 / (var66 * 2 + 1);
                                }
                            }
                            var74++;
                        }
                    }
                    int var71 = 0;
                    int var72 = var70 * 128;
                    for (int var73 = -var66; var73 < 128; var73++) {
                        if (var66 + var73 < 128) {
                            var71 += Statics.field1983[var72 + var73 + var66];
                        }
                        if (var73 - (var66 + 1) >= 0) {
                            var71 -= Statics.field1983[var72 + var73 - (var66 + 1)];
                        }
                        if (var73 >= 0) {
                            Statics.field80[var72 + var73] = var71 / (var66 * 2 + 1);
                        }
                    }
                    var70++;
                }
            }
            field312 = 0;
        }
        short var78 = 256;
        if (field307 > 0) {
            for (int var79 = 0; var79 < 256; var79++) {
                if (field307 > 768) {
                    Statics.field1374[var79] = method1323(Statics.field2582[var79], Statics.field2458[var79], 1024 - field307);
                } else if (field307 > 256) {
                    Statics.field1374[var79] = Statics.field2458[var79];
                } else {
                    Statics.field1374[var79] = method1323(Statics.field2458[var79], Statics.field2582[var79], 256 - field307);
                }
            }
        } else if (field314 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field314 > 768) {
                    Statics.field1374[var80] = method1323(Statics.field2582[var80], Statics.field118[var80], 1024 - field314);
                } else if (field314 > 256) {
                    Statics.field1374[var80] = Statics.field118[var80];
                } else {
                    Statics.field1374[var80] = method1323(Statics.field118[var80], Statics.field2582[var80], 256 - field314);
                }
            }
        } else {
            for (int var81 = 0; var81 < 256; var81++) {
                Statics.field1374[var81] = Statics.field2582[var81];
            }
        }
        class89.method1741(0, 9, 128, var78 + 7);
        Statics.field2318.method1644(0, 0);
        class89.method1740();
        int var82 = 0;
        int var83 = 6885;
        for (int var84 = 1; var84 < var78 - 1; var84++) {
            int var85 = (var78 - var84) * field331[var84] / var78;
            int var86 = var85 + 22;
            if (var86 < 0) {
                var86 = 0;
            }
            var82 += var86;
            for (int var87 = var86; var87 < 128; var87++) {
                int var88 = Statics.field1983[var82++];
                if (var88 == 0) {
                    var83++;
                } else {
                    int var90 = 256 - var88;
                    int var91 = Statics.field1374[var88];
                    int var92 = Statics.field1022.field1452[var83];
                    Statics.field1022.field1452[var83++] = ((var91 & 0xFF00) * var88 + (var92 & 0xFF00) * var90 & 0xFF0000) + ((var91 & 0xFF00FF) * var88 + (var92 & 0xFF00FF) * var90 & 0xFF00FF00) >> 8;
                }
            }
            var83 += var86 + 765 - 128;
        }
        class89.method1741(637, 9, 765, var78 + 7);
        Statics.field2466.method1644(382, 0);
        class89.method1740();
        int var93 = 0;
        int var94 = 7546;
        for (int var95 = 1; var95 < var78 - 1; var95++) {
            int var96 = (var78 - var95) * field331[var95] / var78;
            int var97 = 103 - var96;
            int var98 = var94 + var96;
            for (int var99 = 0; var99 < var97; var99++) {
                int var100 = Statics.field1983[var93++];
                if (var100 == 0) {
                    var98++;
                } else {
                    int var102 = 256 - var100;
                    int var103 = Statics.field1374[var100];
                    int var104 = Statics.field1022.field1452[var98];
                    Statics.field1022.field1452[var98++] = ((var103 & 0xFF00FF) * var100 + (var104 & 0xFF00FF) * var102 & 0xFF00FF00) + ((var103 & 0xFF00) * var100 + (var104 & 0xFF00) * var102 & 0xFF0000) >> 8;
                }
            }
            var93 += 128 - var97;
            var94 = 765 - var97 - var96 + var98;
        }
        Statics.field269[field304 ? 1 : 0].method1734(725, 463);
        if (client.field470 > 5 && client.field467 == 0) {
            if (Statics.field326 == null) {
                Statics.field326 = class84.method1391(Statics.field1808, "sl_button", "");
            } else {
                byte var105 = 5;
                short var106 = 463;
                byte var107 = 100;
                byte var108 = 35;
                Statics.field326.method1734(var105, var106);
                arg0.method3365(class134.field2176 + " " + client.field461, var107 / 2 + var105, var108 / 2 + var106 - 2, 16777215, 0);
                if (Statics.field757 == null) {
                    arg1.method3365(class134.field2308, var107 / 2 + var105, var108 / 2 + var106 + 12, 16777215, 0);
                } else {
                    arg1.method3365(class134.field2307, var107 / 2 + var105, var108 / 2 + var106 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var109 = Statics.field1272.getGraphics();
            Statics.field1022.method1572(var109, 0, 0);
        } catch (Exception var112) {
            Statics.field1272.repaint();
        }
    }

    @ObfuscatedName("c.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method46(String arg0, String arg1, String arg2) {
        field317 = arg0;
        field318 = arg1;
        field336 = arg2;
    }

    @ObfuscatedName("n.f(Lck;B)V")
    public static final void method201(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field290.length; var2++) {
            Statics.field290[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field290[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field306[var8] = (Statics.field290[var8 - 1] + Statics.field290[var8 + 1] + Statics.field290[var8 - 128] + Statics.field290[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field290;
            Statics.field290 = Statics.field306;
            Statics.field306 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1473; var11++) {
            for (int var12 = 0; var12 < arg0.field1470; var12++) {
                if (arg0.field1475[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1474;
                    int var14 = var11 + 16 + arg0.field1471;
                    int var15 = (var14 << 7) + var13;
                    Statics.field290[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bu.c(IIIB)I")
    public static final int method1323(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("l.p(B)V")
    public static void method133() {
        try {
            if (Statics.field757 == null) {
                Statics.field757 = new class24(Statics.field1652, new URL(Statics.field469));
            } else {
                byte[] var0 = Statics.field757.method209();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field327 = var1.method2512();
                    Statics.field191 = new class13[field327];
                    int var2 = 0;
                    while (var2 < field327) {
                        class13 var3 = Statics.field191[var2] = new class13();
                        int var4 = var1.method2512();
                        var3.field199 = var4 & 0x7FFF;
                        var3.field200 = (var4 & 0x8000) != 0;
                        var3.field197 = var1.method2408();
                        var3.field198 = var1.method2509();
                        var3.field204 = var1.method2403();
                        var3.field207 = var2++;
                    }
                    method2164(Statics.field191, 0, Statics.field191.length - 1, field328, field329);
                    field311 = true;
                    Statics.field757 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field757 = null;
        }
    }

    @ObfuscatedName("s.s(III)V")
    public static void method61(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field328[var5] != arg0) {
                var2[var4] = field328[var5];
                var3[var4] = field329[var5];
                var4++;
            }
        }
        field328 = var2;
        field329 = var3;
        method2164(Statics.field191, 0, Statics.field191.length - 1, field328, field329);
    }

    @ObfuscatedName("dn.k([Ll;II[I[IB)V")
    public static void method2164(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field204;
                        var12 = var8.field204;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field200 ? 1 : 0;
                        var12 = var8.field200 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field199;
                        var12 = var8.field199;
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
                        var15 = arg0[var5].field204;
                        var16 = var8.field204;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field200 ? 1 : 0;
                        var16 = var8.field200 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field199;
                        var16 = var8.field199;
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
        method2164(arg0, arg1, var6, arg3, arg4);
        method2164(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
