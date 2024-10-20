package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("t")
public class class21 {

    @ObfuscatedName("t.o")
    public static int[] field320 = new int[256];

    @ObfuscatedName("t.e")
    public static int field322 = 0;

    @ObfuscatedName("t.s")
    public static int field323 = 0;

    @ObfuscatedName("t.n")
    public static int field319 = 0;

    @ObfuscatedName("t.c")
    public static int field317 = 0;

    @ObfuscatedName("t.az")
    public static int field328 = 0;

    @ObfuscatedName("t.ax")
    public static int field343 = 0;

    @ObfuscatedName("t.aq")
    public static int field332 = 10;

    @ObfuscatedName("t.ap")
    public static String field345 = "";

    @ObfuscatedName("t.aa")
    public static int field337 = 0;

    @ObfuscatedName("t.ai")
    public static String field333 = "";

    @ObfuscatedName("t.ar")
    public static String field334 = "";

    @ObfuscatedName("t.ag")
    public static String field335 = "";

    @ObfuscatedName("t.as")
    public static String field336 = "";

    @ObfuscatedName("t.ak")
    public static String field329 = "";

    @ObfuscatedName("t.al")
    public static int field338 = 0;

    @ObfuscatedName("t.am")
    public static String field339 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("t.ah")
    public static boolean field340 = false;

    @ObfuscatedName("t.ac")
    public static int field330 = 0;

    @ObfuscatedName("t.bu")
    public static int[] field342 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("t.bt")
    public static int[] field315 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("t.bm")
    public static int field344 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.i(B)I")
    public static int method245() {
        return 6;
    }

    @ObfuscatedName("q.p(Ljava/awt/Component;Lef;Lef;B)V")
    public static void method42(Component arg0, class152 arg1, class152 arg2) {
        if (Statics.field327) {
            return;
        }
        class89.method1711();
        byte[] var3 = arg1.method2963("title.jpg", "");
        Statics.field1373 = new class86(var3, arg0);
        Statics.field2465 = Statics.field1373.method1615();
        Statics.field1522 = class84.method743(arg2, "logo", "");
        Statics.field316 = class84.method743(arg2, "titlebox", "");
        Statics.field2720 = class84.method743(arg2, "titlebutton", "");
        Statics.field326 = class84.method545(arg2, "runes", "");
        Statics.field202 = class84.method545(arg2, "title_mute", "");
        Statics.field321 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field321[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field321[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field321[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field321[var7 + 192] = 16777215;
        }
        Statics.field270 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field270[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field270[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field270[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field270[var11 + 192] = 16777215;
        }
        Statics.field1365 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1365[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1365[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1365[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1365[var15 + 192] = 16777215;
        }
        Statics.field264 = new int[256];
        Statics.field88 = new int[32768];
        Statics.field324 = new int[32768];
        method1462((class87) null);
        Statics.field2328 = new int[32768];
        Statics.field325 = new int[32768];
        field337 = 0;
        field336 = "";
        field329 = "";
        field340 = false;
        if (Statics.field1048.field201) {
            class138.method2662(2);
        } else {
            class138.method158(2, Statics.field514, "scape main", "", 255, false);
        }
        class153.method2657(false);
        Statics.field327 = true;
        Statics.field1373.method1624(0, 0);
        Statics.field2465.method1624(382, 0);
        Statics.field1522.method1700(382 - Statics.field1522.field1494 / 2, 18);
    }

    @ObfuscatedName("q.a(I)V")
    public static void method43() {
        if (!Statics.field327) {
            return;
        }
        Statics.field316 = null;
        Statics.field2720 = null;
        Statics.field326 = null;
        Statics.field1373 = null;
        Statics.field2465 = null;
        Statics.field1522 = null;
        Statics.field202 = null;
        Statics.field984 = null;
        Statics.field1359 = null;
        Statics.field1928 = null;
        Statics.field144 = null;
        Statics.field1796 = null;
        Statics.field321 = null;
        Statics.field270 = null;
        Statics.field1365 = null;
        Statics.field264 = null;
        Statics.field88 = null;
        Statics.field324 = null;
        Statics.field2328 = null;
        Statics.field325 = null;
        class138.method2662(2);
        class153.method2657(true);
        Statics.field327 = false;
    }

    @ObfuscatedName("bb.l(Lby;B)V")
    public static void method1368(class73 arg0) {
        if (!field340) {
            if (class77.field1412 == 1 && class77.field1415 >= 715 && class77.field1416 >= 453) {
                Statics.field1048.field201 = !Statics.field1048.field201;
                class12.method2917();
                if (Statics.field1048.field201) {
                    Statics.field2346.method2710();
                    class138.field2345 = 1;
                    Statics.field1518 = null;
                } else {
                    class138.method121(Statics.field514, "scape main", "", 255, false);
                }
            }
            if (client.field489 != 5) {
                field328++;
                if (client.field489 == 10) {
                    if (client.field488 == 0) {
                        if (class77.field1412 == 1) {
                            byte var7 = 5;
                            short var8 = 463;
                            byte var9 = 100;
                            byte var10 = 35;
                            if (class77.field1415 >= var7 && class77.field1415 <= var7 + var9 && class77.field1416 >= var8 && class77.field1416 <= var8 + var10) {
                                method151();
                                return;
                            }
                        }
                        if (Statics.field60 != null) {
                            method151();
                        }
                    }
                    int var11 = class77.field1412;
                    int var12 = class77.field1415;
                    int var13 = class77.field1416;
                    if (field337 == 0) {
                        short var14 = 302;
                        short var15 = 291;
                        if (var11 == 1 && var12 >= var14 - 75 && var12 <= var14 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            field337 = 3;
                            field338 = 0;
                        }
                        short var16 = 462;
                        if (var11 == 1 && var12 >= var16 - 75 && var12 <= var16 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            field333 = class134.field2154;
                            field334 = class134.field2289;
                            field335 = class134.field2290;
                            field337 = 2;
                            field338 = 0;
                        }
                    } else if (field337 == 2) {
                        short var17 = 231;
                        int var25 = var17 + 30;
                        if (var11 == 1 && var13 >= var25 - 15 && var13 < var25) {
                            field338 = 0;
                        }
                        var25 += 15;
                        if (var11 == 1 && var13 >= var25 - 15 && var13 < var25) {
                            field338 = 1;
                        }
                        var25 += 15;
                        short var18 = 302;
                        short var19 = 321;
                        if (var11 == 1 && var12 >= var18 - 75 && var12 <= var18 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                            field336 = field336.trim();
                            if (field336.length() == 0) {
                                method2641(class134.field2198, class134.field2199, class134.field2197);
                                return;
                            }
                            if (field329.length() == 0) {
                                method2641(class134.field2201, class134.field2202, class134.field2203);
                                return;
                            }
                            method2641(class134.field2291, class134.field2292, class134.field2293);
                            client.method67(20);
                            return;
                        }
                        short var20 = 462;
                        if (var11 == 1 && var12 >= var20 - 75 && var12 <= var20 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                            field337 = 0;
                            field336 = "";
                            field329 = "";
                        }
                        while (true) {
                            while (class75.method2256()) {
                                boolean var21 = false;
                                for (int var22 = 0; var22 < field339.length(); var22++) {
                                    if (Statics.field2071 == field339.charAt(var22)) {
                                        var21 = true;
                                        break;
                                    }
                                }
                                if (field338 == 0) {
                                    if (Statics.field430 == 85 && field336.length() > 0) {
                                        field336 = field336.substring(0, field336.length() - 1);
                                    }
                                    if (Statics.field430 == 84 || Statics.field430 == 80) {
                                        field338 = 1;
                                    }
                                    if (var21 && field336.length() < 320) {
                                        field336 = field336 + Statics.field2071;
                                    }
                                } else if (field338 == 1) {
                                    if (Statics.field430 == 85 && field329.length() > 0) {
                                        field329 = field329.substring(0, field329.length() - 1);
                                    }
                                    if (Statics.field430 == 84 || Statics.field430 == 80) {
                                        field338 = 0;
                                    }
                                    if (Statics.field430 == 84) {
                                        field336 = field336.trim();
                                        if (field336.length() == 0) {
                                            method2641(class134.field2198, class134.field2199, class134.field2197);
                                            return;
                                        }
                                        if (field329.length() == 0) {
                                            method2641(class134.field2201, class134.field2202, class134.field2203);
                                            return;
                                        }
                                        method2641(class134.field2291, class134.field2292, class134.field2293);
                                        client.method67(20);
                                        return;
                                    }
                                    if (var21 && field329.length() < 20) {
                                        field329 = field329 + Statics.field2071;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field337 == 3) {
                        short var23 = 382;
                        short var24 = 321;
                        if (var11 == 1 && var12 >= var23 - 75 && var12 <= var23 + 75 && var13 >= var24 - 20 && var13 <= var24 + 20) {
                            field337 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1412 == 1) {
            short var1 = 280;
            if (class77.field1415 >= var1 && class77.field1415 <= var1 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                method137(0, 0);
            } else if (class77.field1415 >= var1 + 15 && class77.field1415 <= var1 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                method137(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1415 >= var2 && class77.field1415 <= var2 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                    method137(1, 0);
                } else if (class77.field1415 >= var2 + 15 && class77.field1415 <= var2 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                    method137(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1415 >= var3 && class77.field1415 <= var3 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                        method137(2, 0);
                    } else if (class77.field1415 >= var3 + 15 && class77.field1415 <= var3 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                        method137(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1415 >= var4 && class77.field1415 <= var4 + 14 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                            method137(3, 0);
                        } else if (class77.field1415 >= var4 + 15 && class77.field1415 <= var4 + 80 && class77.field1416 >= 4 && class77.field1416 <= 18) {
                            method137(3, 1);
                        } else if (class77.field1415 >= 708 && class77.field1416 >= 4 && class77.field1415 <= 758 && class77.field1416 <= 20) {
                            field340 = false;
                            Statics.field1373.method1624(0, 0);
                            Statics.field2465.method1624(382, 0);
                            Statics.field1522.method1700(382 - Statics.field1522.field1494 / 2, 18);
                        } else if (field344 != -1) {
                            class13 var5 = Statics.field1279[field344];
                            if (client.field544 != var5.field212) {
                                client.field544 = var5.field212;
                                boolean var6 = var5.field212;
                                if (Statics.field989 != var6) {
                                    class40.field990.method3226();
                                    class40.field991.method3226();
                                    class40.field992.method3226();
                                    Statics.field989 = var6;
                                }
                            }
                            Statics.field1463 = var5.field207;
                            client.field546 = var5.field218;
                            Statics.field524 = client.field483 == 0 ? 43594 : var5.field218 + 40000;
                            Statics.field1347 = client.field483 == 0 ? 443 : var5.field218 + 50000;
                            Statics.field387 = Statics.field524;
                            field340 = false;
                            Statics.field1373.method1624(0, 0);
                            Statics.field2465.method1624(382, 0);
                            Statics.field1522.method1700(382 - Statics.field1522.field1494 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.q(Lgi;Lgi;I)V")
    public static void method45(class183 arg0, class183 arg1) {
        if (field340) {
            if (Statics.field984 == null) {
                Statics.field984 = class84.method2391(Statics.field1758, "sl_back", "");
            }
            if (Statics.field1359 == null) {
                Statics.field1359 = class84.method545(Statics.field1758, "sl_flags", "");
            }
            if (Statics.field1928 == null) {
                Statics.field1928 = class84.method545(Statics.field1758, "sl_arrows", "");
            }
            if (Statics.field144 == null) {
                Statics.field144 = class84.method545(Statics.field1758, "sl_stars", "");
            }
            class89.method1772(0, 23, 765, 480, 0);
            class89.method1721(0, 0, 125, 23, 12425273, 9135624);
            class89.method1721(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3353(class134.field2306, 62, 15, 0, -1);
            if (Statics.field144 != null) {
                Statics.field144[1].method1700(140, 1);
                arg1.method3351(class134.field2179, 152, 10, 16777215, -1);
                Statics.field144[0].method1700(140, 12);
                arg1.method3351(class134.field2308, 152, 21, 16777215, -1);
            }
            if (Statics.field1928 != null) {
                short var2 = 280;
                if (field342[0] == 0 && field315[0] == 0) {
                    Statics.field1928[2].method1700(var2, 4);
                } else {
                    Statics.field1928[0].method1700(var2, 4);
                }
                if (field342[0] == 0 && field315[0] == 1) {
                    Statics.field1928[3].method1700(var2 + 15, 4);
                } else {
                    Statics.field1928[1].method1700(var2 + 15, 4);
                }
                arg0.method3351(class134.field2196, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field342[0] == 1 && field315[0] == 0) {
                    Statics.field1928[2].method1700(var3, 4);
                } else {
                    Statics.field1928[0].method1700(var3, 4);
                }
                if (field342[0] == 1 && field315[0] == 1) {
                    Statics.field1928[3].method1700(var3 + 15, 4);
                } else {
                    Statics.field1928[1].method1700(var3 + 15, 4);
                }
                arg0.method3351(class134.field2183, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field342[0] == 2 && field315[0] == 0) {
                    Statics.field1928[2].method1700(var4, 4);
                } else {
                    Statics.field1928[0].method1700(var4, 4);
                }
                if (field342[0] == 2 && field315[0] == 1) {
                    Statics.field1928[3].method1700(var4 + 15, 4);
                } else {
                    Statics.field1928[1].method1700(var4 + 15, 4);
                }
                arg0.method3351(class134.field2311, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field342[0] == 3 && field315[0] == 0) {
                    Statics.field1928[2].method1700(var5, 4);
                } else {
                    Statics.field1928[0].method1700(var5, 4);
                }
                if (field342[0] == 3 && field315[0] == 1) {
                    Statics.field1928[3].method1700(var5 + 15, 4);
                } else {
                    Statics.field1928[1].method1700(var5 + 15, 4);
                }
                arg0.method3351(class134.field2312, var5 + 32, 17, 16777215, -1);
            }
            class89.method1772(708, 4, 50, 16, 0);
            arg1.method3353(class134.field2300, 733, 16, 16777215, -1);
            field344 = -1;
            if (Statics.field984 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field330) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field330) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field330) {
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
                for (int var20 = 0; var20 < field330; var20++) {
                    class13 var21 = Statics.field1279[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field209);
                    if (var21.field209 == -1) {
                        var23 = class134.field2313;
                        var22 = false;
                    } else if (var21.field209 > 1980) {
                        var23 = class134.field2205;
                        var22 = false;
                    }
                    if (class77.field1408 >= var17 && class77.field1409 >= var16 && class77.field1408 < var6 + var17 && class77.field1409 < var7 + var16 && var22) {
                        field344 = var20;
                        Statics.field984[var21.field212 ? 1 : 0].method1630(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field984[var21.field212 ? 1 : 0].method1624(var17, var16);
                    }
                    if (Statics.field1359 != null) {
                        Statics.field1359[(var21.field212 ? 8 : 0) + var21.field214].method1700(var17 + 29, var16);
                    }
                    arg0.method3353(Integer.toString(var21.field218), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3353(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var24 = arg1.method3346(Statics.field1279[field344].field210) + 6;
                    int var25 = arg1.field2840 + 8;
                    class89.method1772(class77.field1408 - var24 / 2, class77.field1409 + 20 + 5, var24, var25, 16777120);
                    class89.method1722(class77.field1408 - var24 / 2, class77.field1409 + 20 + 5, var24, var25, 0);
                    arg1.method3353(Statics.field1279[field344].field210, class77.field1408, class77.field1409 + 20 + 5 + arg1.field2840 + 4, 0, -1);
                }
            }
            try {
                Graphics var26 = Statics.field962.getGraphics();
                Statics.field379.method1573(var26, 0, 0);
            } catch (Exception var106) {
                Statics.field962.repaint();
            }
            return;
        }
        if (client.field489 == 0 || client.field489 == 5) {
            byte var28 = 20;
            arg0.method3353(class134.field2296, 382, 245 - var28, 16777215, -1);
            int var29 = 253 - var28;
            class89.method1722(230, var29, 304, 34, 9179409);
            class89.method1722(231, var29 + 1, 302, 32, 0);
            class89.method1772(232, var29 + 2, field332 * 3, 30, 9179409);
            class89.method1772(field332 * 3 + 232, var29 + 2, 300 - field332 * 3, 30, 0);
            arg0.method3353(field345, 382, 276 - var28, 16777215, -1);
        }
        if (client.field489 == 20) {
            Statics.field316.method1700(382 - Statics.field316.field1494 / 2, 271 - Statics.field316.field1490 / 2);
            short var30 = 211;
            arg0.method3353(field333, 382, var30, 16776960, 0);
            int var108 = var30 + 15;
            arg0.method3353(field334, 382, var108, 16776960, 0);
            int var109 = var108 + 15;
            arg0.method3353(field335, 382, var109, 16776960, 0);
            int var110 = var109 + 15;
            int var111 = var110 + 10;
            arg0.method3351(class134.field2294, 272, var111, 16777215, 0);
            short var31 = 200;
            String var32;
            for (var32 = field336; arg0.method3346(var32) > var31; var32 = var32.substring(0, var32.length() - 1)) {
            }
            arg0.method3351(class185.method3350(var32), 312, var111, 16777215, 0);
            var108 = var111 + 15;
            arg0.method3351(class134.field2147 + class147.method10(field329), 274, var108, 16777215, 0);
            var108 += 15;
        }
        if (client.field489 == 10) {
            Statics.field316.method1700(202, 171);
            if (field337 == 0) {
                short var33 = 251;
                arg0.method3353(class134.field2273, 382, var33, 16776960, 0);
                int var112 = var33 + 30;
                short var34 = 302;
                short var35 = 291;
                Statics.field2720.method1700(var34 - 73, var35 - 20);
                arg0.method3354(class134.field2263, var34 - 73, var35 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var36 = 462;
                Statics.field2720.method1700(var36 - 73, var35 - 20);
                arg0.method3354(class134.field2298, var36 - 73, var35 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field337 == 2) {
                short var37 = 211;
                arg0.method3353(field333, 382, var37, 16776960, 0);
                int var113 = var37 + 15;
                arg0.method3353(field334, 382, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg0.method3353(field335, 382, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var116 = var115 + 10;
                arg0.method3351(class134.field2294, 272, var116, 16777215, 0);
                short var38 = 200;
                String var39;
                for (var39 = field336; arg0.method3346(var39) > var38; var39 = var39.substring(1)) {
                }
                arg0.method3351(class185.method3350(var39) + (field338 == 0 & client.field491 % 40 < 20 ? class2.method2648(16776960) + class2.field18 : ""), 312, var116, 16777215, 0);
                var113 = var116 + 15;
                arg0.method3351(class134.field2147 + class147.method10(field329) + (field338 == 1 & client.field491 % 40 < 20 ? class2.method2648(16776960) + class2.field18 : ""), 274, var113, 16777215, 0);
                var113 += 15;
                short var40 = 302;
                short var41 = 321;
                Statics.field2720.method1700(var40 - 73, var41 - 20);
                arg0.method3353(class134.field2299, var40, var41 + 5, 16777215, 0);
                short var42 = 462;
                Statics.field2720.method1700(var42 - 73, var41 - 20);
                arg0.method3353(class134.field2300, var42, var41 + 5, 16777215, 0);
            } else if (field337 == 3) {
                arg0.method3353(class134.field2301, 382, 211, 16776960, 0);
                short var43 = 236;
                arg0.method3353(class134.field2302, 382, var43, 16777215, 0);
                int var117 = var43 + 15;
                arg0.method3353(class134.field2303, 382, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method3353(class134.field2231, 382, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method3353(class134.field2305, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                short var44 = 382;
                short var45 = 321;
                Statics.field2720.method1700(var44 - 73, var45 - 20);
                arg0.method3353(class134.field2300, var44, var45 + 5, 16777215, 0);
            }
        }
        if (field328 > 0) {
            int var46 = field328;
            short var47 = 256;
            field319 += var46 * 128;
            if (field319 > Statics.field88.length) {
                field319 -= Statics.field88.length;
                int var48 = (int) (Math.random() * 12.0D);
                method1462(Statics.field326[var48]);
            }
            int var49 = 0;
            int var50 = var46 * 128;
            int var51 = (var47 - var46) * 128;
            for (int var52 = 0; var52 < var51; var52++) {
                int var53 = Statics.field2328[var49 + var50] - Statics.field88[field319 + var49 & Statics.field88.length - 1] * var46 / 6;
                if (var53 < 0) {
                    var53 = 0;
                }
                Statics.field2328[var49++] = var53;
            }
            for (int var54 = var47 - var46; var54 < var47; var54++) {
                int var55 = var54 * 128;
                for (int var56 = 0; var56 < 128; var56++) {
                    int var57 = (int) (Math.random() * 100.0D);
                    if (var57 < 50 && var56 > 10 && var56 < 118) {
                        Statics.field2328[var55 + var56] = 255;
                    } else {
                        Statics.field2328[var55 + var56] = 0;
                    }
                }
            }
            if (field322 > 0) {
                field322 -= var46 * 4;
            }
            if (field323 > 0) {
                field323 -= var46 * 4;
            }
            if (field322 == 0 && field323 == 0) {
                int var58 = (int) (Math.random() * (double) (2000 / var46));
                if (var58 == 0) {
                    field322 = 1024;
                }
                if (var58 == 1) {
                    field323 = 1024;
                }
            }
            for (int var59 = 0; var59 < var47 - var46; var59++) {
                field320[var59] = field320[var46 + var59];
            }
            for (int var60 = var47 - var46; var60 < var47; var60++) {
                field320[var60] = (int) (Math.sin((double) field343 / 14.0D) * 16.0D + Math.sin((double) field343 / 15.0D) * 14.0D + Math.sin((double) field343 / 16.0D) * 12.0D);
                field343++;
            }
            field317 += var46 * -2050629841;
            int var61 = ((client.field491 & 0x1) + var46) / 2;
            if (var61 > 0) {
                for (int var62 = 0; var62 < field317 * 81923292; var62++) {
                    int var63 = (int) (Math.random() * 124.0D) + 2;
                    int var64 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2328[(var64 << 7) + var63] = 192;
                }
                field317 = 0;
                int var65 = 0;
                label479: while (true) {
                    if (var65 >= var47) {
                        int var69 = 0;
                        while (true) {
                            if (var69 >= 128) {
                                break label479;
                            }
                            int var70 = 0;
                            for (int var71 = -var61; var71 < var47; var71++) {
                                int var72 = var71 * 128;
                                if (var61 + var71 < var47) {
                                    var70 += Statics.field325[var61 * 128 + var69 + var72];
                                }
                                if (var71 - (var61 + 1) >= 0) {
                                    var70 -= Statics.field325[var69 + var72 - (var61 + 1) * 128];
                                }
                                if (var71 >= 0) {
                                    Statics.field2328[var69 + var72] = var70 / (var61 * 2 + 1);
                                }
                            }
                            var69++;
                        }
                    }
                    int var66 = 0;
                    int var67 = var65 * 128;
                    for (int var68 = -var61; var68 < 128; var68++) {
                        if (var61 + var68 < 128) {
                            var66 += Statics.field2328[var67 + var68 + var61];
                        }
                        if (var68 - (var61 + 1) >= 0) {
                            var66 -= Statics.field2328[var67 + var68 - (var61 + 1)];
                        }
                        if (var68 >= 0) {
                            Statics.field325[var67 + var68] = var66 / (var61 * 2 + 1);
                        }
                    }
                    var65++;
                }
            }
            field328 = 0;
        }
        short var73 = 256;
        if (field322 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field322 > 768) {
                    Statics.field264[var74] = method226(Statics.field321[var74], Statics.field270[var74], 1024 - field322);
                } else if (field322 > 256) {
                    Statics.field264[var74] = Statics.field270[var74];
                } else {
                    Statics.field264[var74] = method226(Statics.field270[var74], Statics.field321[var74], 256 - field322);
                }
            }
        } else if (field323 > 0) {
            for (int var75 = 0; var75 < 256; var75++) {
                if (field323 > 768) {
                    Statics.field264[var75] = method226(Statics.field321[var75], Statics.field1365[var75], 1024 - field323);
                } else if (field323 > 256) {
                    Statics.field264[var75] = Statics.field1365[var75];
                } else {
                    Statics.field264[var75] = method226(Statics.field1365[var75], Statics.field321[var75], 256 - field323);
                }
            }
        } else {
            for (int var76 = 0; var76 < 256; var76++) {
                Statics.field264[var76] = Statics.field321[var76];
            }
        }
        class89.method1714(0, 9, 128, var73 + 7);
        Statics.field1373.method1624(0, 0);
        class89.method1752();
        int var77 = 0;
        int var78 = 6885;
        for (int var79 = 1; var79 < var73 - 1; var79++) {
            int var80 = (var73 - var79) * field320[var79] / var73;
            int var81 = var80 + 22;
            if (var81 < 0) {
                var81 = 0;
            }
            var77 += var81;
            for (int var82 = var81; var82 < 128; var82++) {
                int var83 = Statics.field2328[var77++];
                if (var83 == 0) {
                    var78++;
                } else {
                    int var85 = 256 - var83;
                    int var86 = Statics.field264[var83];
                    int var87 = Statics.field379.field1472[var78];
                    Statics.field379.field1472[var78++] = ((var86 & 0xFF00) * var83 + (var87 & 0xFF00) * var85 & 0xFF0000) + ((var86 & 0xFF00FF) * var83 + (var87 & 0xFF00FF) * var85 & 0xFF00FF00) >> 8;
                }
            }
            var78 += var81 + 765 - 128;
        }
        class89.method1714(637, 9, 765, var73 + 7);
        Statics.field2465.method1624(382, 0);
        class89.method1752();
        int var88 = 0;
        int var89 = 7546;
        for (int var90 = 1; var90 < var73 - 1; var90++) {
            int var91 = (var73 - var90) * field320[var90] / var73;
            int var92 = 103 - var91;
            int var93 = var89 + var91;
            for (int var94 = 0; var94 < var92; var94++) {
                int var95 = Statics.field2328[var88++];
                if (var95 == 0) {
                    var93++;
                } else {
                    int var97 = 256 - var95;
                    int var98 = Statics.field264[var95];
                    int var99 = Statics.field379.field1472[var93];
                    Statics.field379.field1472[var93++] = ((var98 & 0xFF00) * var95 + (var99 & 0xFF00) * var97 & 0xFF0000) + ((var98 & 0xFF00FF) * var95 + (var99 & 0xFF00FF) * var97 & 0xFF00FF00) >> 8;
                }
            }
            var88 += 128 - var92;
            var89 = 765 - var92 - var91 + var93;
        }
        Statics.field202[Statics.field1048.field201 ? 1 : 0].method1700(725, 463);
        if (client.field489 > 5 && client.field488 == 0) {
            if (Statics.field1796 == null) {
                Statics.field1796 = class84.method743(Statics.field1758, "sl_button", "");
            } else {
                byte var100 = 5;
                short var101 = 463;
                byte var102 = 100;
                byte var103 = 35;
                Statics.field1796.method1700(var100, var101);
                arg0.method3353(class134.field2239 + " " + client.field546, var102 / 2 + var100, var103 / 2 + var101 - 2, 16777215, 0);
                if (Statics.field60 == null) {
                    arg1.method3353(class134.field2316, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                } else {
                    arg1.method3353(class134.field2096, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var104 = Statics.field962.getGraphics();
            Statics.field379.method1573(var104, 0, 0);
        } catch (Exception var107) {
            Statics.field962.repaint();
        }
    }

    @ObfuscatedName("df.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2641(String arg0, String arg1, String arg2) {
        field333 = arg0;
        field334 = arg1;
        field335 = arg2;
    }

    @ObfuscatedName("bo.u(Lcn;I)V")
    public static final void method1462(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field88.length; var2++) {
            Statics.field88[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field88[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field324[var8] = (Statics.field88[var8 - 1] + Statics.field88[var8 + 1] + Statics.field88[var8 - 128] + Statics.field88[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field88;
            Statics.field88 = Statics.field324;
            Statics.field324 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1490; var11++) {
            for (int var12 = 0; var12 < arg0.field1494; var12++) {
                if (arg0.field1489[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1488;
                    int var14 = var11 + 16 + arg0.field1492;
                    int var15 = (var14 << 7) + var13;
                    Statics.field88[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("r.d(IIIB)I")
    public static final int method226(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("y.m(I)V")
    public static void method151() {
        try {
            if (Statics.field60 == null) {
                Statics.field60 = new class24(Statics.field2466, new URL(Statics.field1764));
            } else {
                byte[] var0 = Statics.field60.method240();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field330 = var1.method2413();
                    Statics.field1279 = new class13[field330];
                    int var2 = 0;
                    while (var2 < field330) {
                        class13 var3 = Statics.field1279[var2] = new class13();
                        int var4 = var1.method2413();
                        var3.field218 = var4 & 0x7FFF;
                        var3.field212 = (var4 & 0x8000) != 0;
                        var3.field207 = var1.method2419();
                        var3.field210 = var1.method2419();
                        var3.field214 = var1.method2411();
                        var3.field209 = var1.method2414();
                        var3.field211 = var2++;
                    }
                    method152(Statics.field1279, 0, Statics.field1279.length - 1, field342, field315);
                    field340 = true;
                    Statics.field60 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field60 = null;
        }
    }

    @ObfuscatedName("h.v(III)V")
    public static void method137(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field342[var5] != arg0) {
                var2[var4] = field342[var5];
                var3[var4] = field315[var5];
                var4++;
            }
        }
        field342 = var2;
        field315 = var3;
        method152(Statics.field1279, 0, Statics.field1279.length - 1, field342, field315);
    }

    @ObfuscatedName("y.j([Lh;II[I[II)V")
    public static void method152(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field209;
                        var12 = var8.field209;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field212 ? 1 : 0;
                        var12 = var8.field212 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field218;
                        var12 = var8.field218;
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
                        var15 = arg0[var5].field209;
                        var16 = var8.field209;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field212 ? 1 : 0;
                        var16 = var8.field212 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field218;
                        var16 = var8.field218;
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
        method152(arg0, arg1, var6, arg3, arg4);
        method152(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
