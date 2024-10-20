package deob;

import java.awt.Component;
import java.net.URL;

@ObfuscatedName("z")
public class class21 {

    @ObfuscatedName("z.g")
    public static int[] field337 = new int[256];

    @ObfuscatedName("z.k")
    public static int field307 = 0;

    @ObfuscatedName("z.w")
    public static int field336 = 0;

    @ObfuscatedName("z.e")
    public static int field310 = 0;

    @ObfuscatedName("z.y")
    public static int field299 = 0;

    @ObfuscatedName("z.aw")
    public static int field320 = 0;

    @ObfuscatedName("z.ai")
    public static int field324 = 0;

    @ObfuscatedName("z.ah")
    public static int field314 = 10;

    @ObfuscatedName("z.ad")
    public static String field315 = "";

    @ObfuscatedName("z.ak")
    public static int field316 = 0;

    @ObfuscatedName("z.ap")
    public static String field317 = "";

    @ObfuscatedName("z.al")
    public static String field318 = "";

    @ObfuscatedName("z.am")
    public static String field319 = "";

    @ObfuscatedName("z.ab")
    public static String field313 = "";

    @ObfuscatedName("z.ax")
    public static String field321 = "";

    @ObfuscatedName("z.az")
    public static int field322 = 0;

    @ObfuscatedName("z.at")
    public static String field323 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("z.aj")
    public static boolean field312 = false;

    @ObfuscatedName("z.ay")
    public static int field325 = 0;

    @ObfuscatedName("z.by")
    public static int[] field326 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("z.ba")
    public static int[] field327 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("z.bb")
    public static int field328 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.j(Ljava/awt/Component;Lew;Lew;I)V")
    public static void method38(Component arg0, class153 arg1, class153 arg2) {
        if (Statics.field308) {
            return;
        }
        class89.method1855();
        byte[] var3 = arg1.method3044("title.jpg", "");
        Statics.field302 = new class86(var3, arg0);
        Statics.field303 = Statics.field302.method1774();
        Statics.field330 = class84.method212(arg2, "logo", "");
        Statics.field306 = class84.method212(arg2, "titlebox", "");
        Statics.field300 = class84.method212(arg2, "titlebutton", "");
        Statics.field298 = class84.method2060(arg2, "runes", "");
        Statics.field2340 = class84.method2060(arg2, "title_mute", "");
        Statics.field311 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field311[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field311[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field311[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field311[var7 + 192] = 16777215;
        }
        Statics.field1525 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1525[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1525[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field1525[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field1525[var11 + 192] = 16777215;
        }
        Statics.field2013 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field2013[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field2013[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field2013[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field2013[var15 + 192] = 16777215;
        }
        Statics.field2353 = new int[256];
        Statics.field2719 = new int[32768];
        Statics.field181 = new int[32768];
        method752((class87) null);
        Statics.field2577 = new int[32768];
        Statics.field196 = new int[32768];
        field316 = 0;
        field313 = "";
        field321 = "";
        field312 = false;
        if (Statics.field219.field192) {
            class139.method102(2);
        } else {
            class139.method1355(2, Statics.field2449, "scape main", "", 255, false);
        }
        class154.method2136(false);
        Statics.field308 = true;
        Statics.field302.method1689(0, 0);
        Statics.field303.method1689(382, 0);
        Statics.field330.method1782(382 - Statics.field330.field1489 / 2, 18);
    }

    @ObfuscatedName("df.f(Lbc;I)V")
    public static void method2213(class73 arg0) {
        if (!field312) {
            if (class77.field1412 == 1 && class77.field1409 >= 715 && class77.field1408 >= 453) {
                Statics.field219.field192 = !Statics.field219.field192;
                class12.method238();
                if (Statics.field219.field192) {
                    Statics.field2345.method2850();
                    class139.field2347 = 1;
                    Statics.field2346 = null;
                } else {
                    class139.method2717(Statics.field2449, "scape main", "", 255, false);
                }
            }
            if (client.field480 != 5) {
                field320++;
                if (client.field480 == 10) {
                    if (client.field712 == 0) {
                        if (class77.field1412 == 1) {
                            byte var7 = 5;
                            short var8 = 463;
                            byte var9 = 100;
                            byte var10 = 35;
                            if (class77.field1409 >= var7 && class77.field1409 <= var7 + var9 && class77.field1408 >= var8 && class77.field1408 <= var8 + var10) {
                                method652();
                                return;
                            }
                        }
                        if (Statics.field9 != null) {
                            method652();
                        }
                    }
                    int var11 = class77.field1412;
                    int var12 = class77.field1409;
                    int var13 = class77.field1408;
                    if (field316 == 0) {
                        short var14 = 302;
                        short var15 = 291;
                        if (var11 == 1 && var12 >= var14 - 75 && var12 <= var14 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            field316 = 3;
                            field322 = 0;
                        }
                        short var16 = 462;
                        if (var11 == 1 && var12 >= var16 - 75 && var12 <= var16 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            field317 = class135.field2122;
                            field318 = class135.field2299;
                            field319 = class135.field2188;
                            field316 = 2;
                            field322 = 0;
                        }
                    } else if (field316 == 2) {
                        short var17 = 231;
                        int var29 = var17 + 30;
                        if (var11 == 1 && var13 >= var29 - 15 && var13 < var29) {
                            field322 = 0;
                        }
                        var29 += 15;
                        if (var11 == 1 && var13 >= var29 - 15 && var13 < var29) {
                            field322 = 1;
                        }
                        var29 += 15;
                        short var18 = 302;
                        short var19 = 321;
                        if (var11 == 1 && var12 >= var18 - 75 && var12 <= var18 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                            field313 = field313.trim();
                            if (field313.length() == 0) {
                                method1878(class135.field2208, class135.field2209, class135.field2210);
                                return;
                            }
                            if (field321.length() == 0) {
                                method1878(class135.field2181, class135.field2212, class135.field2213);
                                return;
                            }
                            method1878(class135.field2132, class135.field2302, class135.field2303);
                            client.method217(20);
                            return;
                        }
                        short var20 = 462;
                        if (var11 == 1 && var12 >= var20 - 75 && var12 <= var20 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                            field316 = 0;
                            field313 = "";
                            field321 = "";
                        }
                        while (true) {
                            while (true) {
                                class75 var21 = class75.field1384;
                                boolean var22;
                                synchronized (class75.field1384) {
                                    if (class75.field1382 == class75.field1380) {
                                        var22 = false;
                                    } else {
                                        Statics.field2464 = class75.field1357[class75.field1380];
                                        Statics.field331 = class75.field1376[class75.field1380];
                                        class75.field1380 = class75.field1380 + 1 & 0x7F;
                                        var22 = true;
                                    }
                                }
                                if (!var22) {
                                    return;
                                }
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field323.length(); var25++) {
                                    if (Statics.field331 == field323.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (field322 == 0) {
                                    if (Statics.field2464 == 85 && field313.length() > 0) {
                                        field313 = field313.substring(0, field313.length() - 1);
                                    }
                                    if (Statics.field2464 == 84 || Statics.field2464 == 80) {
                                        field322 = 1;
                                    }
                                    if (var24 && field313.length() < 320) {
                                        field313 = field313 + Statics.field331;
                                    }
                                } else if (field322 == 1) {
                                    if (Statics.field2464 == 85 && field321.length() > 0) {
                                        field321 = field321.substring(0, field321.length() - 1);
                                    }
                                    if (Statics.field2464 == 84 || Statics.field2464 == 80) {
                                        field322 = 0;
                                    }
                                    if (Statics.field2464 == 84) {
                                        field313 = field313.trim();
                                        if (field313.length() == 0) {
                                            method1878(class135.field2208, class135.field2209, class135.field2210);
                                            return;
                                        }
                                        if (field321.length() == 0) {
                                            method1878(class135.field2181, class135.field2212, class135.field2213);
                                            return;
                                        }
                                        method1878(class135.field2132, class135.field2302, class135.field2303);
                                        client.method217(20);
                                        return;
                                    }
                                    if (var24 && field321.length() < 20) {
                                        field321 = field321 + Statics.field331;
                                    }
                                }
                            }
                        }
                    } else if (field316 == 3) {
                        short var26 = 382;
                        short var27 = 321;
                        if (var11 == 1 && var12 >= var26 - 75 && var12 <= var26 + 75 && var13 >= var27 - 20 && var13 <= var27 + 20) {
                            field316 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1412 == 1) {
            short var1 = 280;
            if (class77.field1409 >= var1 && class77.field1409 <= var1 + 14 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                method1595(0, 0);
            } else if (class77.field1409 >= var1 + 15 && class77.field1409 <= var1 + 80 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                method1595(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1409 >= var2 && class77.field1409 <= var2 + 14 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                    method1595(1, 0);
                } else if (class77.field1409 >= var2 + 15 && class77.field1409 <= var2 + 80 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                    method1595(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1409 >= var3 && class77.field1409 <= var3 + 14 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                        method1595(2, 0);
                    } else if (class77.field1409 >= var3 + 15 && class77.field1409 <= var3 + 80 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                        method1595(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1409 >= var4 && class77.field1409 <= var4 + 14 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                            method1595(3, 0);
                        } else if (class77.field1409 >= var4 + 15 && class77.field1409 <= var4 + 80 && class77.field1408 >= 4 && class77.field1408 <= 18) {
                            method1595(3, 1);
                        } else if (class77.field1409 >= 708 && class77.field1408 >= 4 && class77.field1409 <= 758 && class77.field1408 <= 20) {
                            field312 = false;
                            Statics.field302.method1689(0, 0);
                            Statics.field303.method1689(382, 0);
                            Statics.field330.method1782(382 - Statics.field330.field1489 / 2, 18);
                        } else if (field328 != -1) {
                            class13 var5 = Statics.field861[field328];
                            if (client.field477 != var5.field204) {
                                client.field477 = var5.field204;
                                boolean var6 = var5.field204;
                                if (Statics.field976 != var6) {
                                    class40.method603();
                                    Statics.field976 = var6;
                                }
                            }
                            Statics.field23 = var5.field200;
                            client.field718 = var5.field203;
                            Statics.field1817 = client.field474 == 0 ? 43594 : var5.field203 + 40000;
                            Statics.field1849 = client.field474 == 0 ? 443 : var5.field203 + 50000;
                            Statics.field1272 = Statics.field1817;
                            field312 = false;
                            Statics.field302.method1689(0, 0);
                            Statics.field303.method1689(382, 0);
                            Statics.field330.method1782(382 - Statics.field330.field1489 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1878(String arg0, String arg1, String arg2) {
        field317 = arg0;
        field318 = arg1;
        field319 = arg2;
    }

    @ObfuscatedName("am.u(Lca;I)V")
    public static final void method752(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2719.length; var2++) {
            Statics.field2719[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2719[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field181[var8] = (Statics.field2719[var8 - 1] + Statics.field2719[var8 + 1] + Statics.field2719[var8 - 128] + Statics.field2719[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2719;
            Statics.field2719 = Statics.field181;
            Statics.field181 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1490; var11++) {
            for (int var12 = 0; var12 < arg0.field1489; var12++) {
                if (arg0.field1487[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1492;
                    int var14 = var11 + 16 + arg0.field1491;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2719[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ci.a(IIII)I")
    public static final int method1671(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ak.q(I)V")
    public static void method652() {
        try {
            if (Statics.field9 == null) {
                Statics.field9 = new class24(Statics.field896, new URL(Statics.field1320));
            } else {
                byte[] var0 = Statics.field9.method211();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field325 = var1.method2582();
                    Statics.field861 = new class13[field325];
                    int var2 = 0;
                    while (var2 < field325) {
                        class13 var3 = Statics.field861[var2] = new class13();
                        int var4 = var1.method2582();
                        var3.field203 = var4 & 0x3FFF;
                        var3.field204 = (var4 & 0x8000) != 0;
                        var3.field205 = (var4 & 0x4000) != 0;
                        var3.field200 = var1.method2518();
                        var3.field201 = var1.method2518();
                        var3.field202 = var1.method2464();
                        var3.field199 = var1.method2467();
                        var3.field207 = var2++;
                    }
                    method811(Statics.field861, 0, Statics.field861.length - 1, field326, field327);
                    field312 = true;
                    Statics.field9 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field9 = null;
        }
    }

    @ObfuscatedName("cd.t(IIB)V")
    public static void method1595(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field326[var5] != arg0) {
                var2[var4] = field326[var5];
                var3[var4] = field327[var5];
                var4++;
            }
        }
        field326 = var2;
        field327 = var3;
        method811(Statics.field861, 0, Statics.field861.length - 1, field326, field327);
    }

    @ObfuscatedName("at.n([Lm;II[I[IB)V")
    public static void method811(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field199;
                        var12 = var8.field199;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field204 ? 1 : 0;
                        var12 = var8.field204 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field203;
                        var12 = var8.field203;
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
                        var15 = arg0[var5].field199;
                        var16 = var8.field199;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field204 ? 1 : 0;
                        var16 = var8.field204 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field203;
                        var16 = var8.field203;
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
        method811(arg0, arg1, var6, arg3, arg4);
        method811(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
