package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("q")
public class class21 {

    @ObfuscatedName("q.e")
    public static int[] field330 = new int[256];

    @ObfuscatedName("q.b")
    public static int field324 = 0;

    @ObfuscatedName("q.n")
    public static int field343 = 0;

    @ObfuscatedName("q.t")
    public static int field338 = 0;

    @ObfuscatedName("q.s")
    public static int field333 = 0;

    @ObfuscatedName("q.ah")
    public static int field337 = 0;

    @ObfuscatedName("q.ar")
    public static int field329 = 0;

    @ObfuscatedName("q.ac")
    public static int field340 = 10;

    @ObfuscatedName("q.as")
    public static String field331 = "";

    @ObfuscatedName("q.ag")
    public static int field332 = 0;

    @ObfuscatedName("q.ak")
    public static String field328 = "";

    @ObfuscatedName("q.am")
    public static String field323 = "";

    @ObfuscatedName("q.ap")
    public static String field335 = "";

    @ObfuscatedName("q.au")
    public static String field336 = "";

    @ObfuscatedName("q.aq")
    public static String field316 = "";

    @ObfuscatedName("q.at")
    public static int field334 = 0;

    @ObfuscatedName("q.aw")
    public static String field339 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("q.ae")
    public static boolean field345 = false;

    @ObfuscatedName("q.aj")
    public static int field341 = 0;

    @ObfuscatedName("q.be")
    public static int[] field319 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("q.bc")
    public static int[] field326 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("q.br")
    public static int field344 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.v(B)I")
    public static int method228() {
        return 6;
    }

    @ObfuscatedName("eu.m(Ljava/awt/Component;Ler;Ler;B)V")
    public static void method3009(Component arg0, class152 arg1, class152 arg2) {
        if (Statics.field327) {
            return;
        }
        class89.method1832();
        byte[] var3 = arg1.method3093("title.jpg", "");
        Statics.field2709 = new class86(var3, arg0);
        Statics.field1441 = Statics.field2709.method1765();
        Statics.field325 = class84.method692(arg2, "logo", "");
        Statics.field2820 = class84.method692(arg2, "titlebox", "");
        Statics.field317 = class84.method692(arg2, "titlebutton", "");
        Statics.field318 = class84.method4(arg2, "runes", "");
        Statics.field320 = class84.method4(arg2, "title_mute", "");
        Statics.field1452 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field1452[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field1452[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field1452[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field1452[var7 + 192] = 16777215;
        }
        Statics.field247 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field247[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field247[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field247[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field247[var11 + 192] = 16777215;
        }
        Statics.field76 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field76[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field76[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field76[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field76[var15 + 192] = 16777215;
        }
        Statics.field261 = new int[256];
        Statics.field2460 = new int[32768];
        Statics.field360 = new int[32768];
        method50((class87) null);
        Statics.field908 = new int[32768];
        Statics.field1375 = new int[32768];
        field332 = 0;
        field336 = "";
        field316 = "";
        field345 = false;
        if (Statics.field193.field197) {
            class138.method2426(2);
        } else {
            class138.method1885(2, Statics.field1028, "scape main", "", 255, false);
        }
        class153.method2427(false);
        Statics.field327 = true;
        Statics.field2709.method1719(0, 0);
        Statics.field1441.method1719(382, 0);
        Statics.field325.method1808(382 - Statics.field325.field1486 / 2, 18);
    }

    @ObfuscatedName("client.j(Lbz;I)V")
    public static void method563(class73 arg0) {
        if (field345) {
            method2166(arg0);
            return;
        }
        if (class77.field1398 == 1 && class77.field1399 >= 715 && class77.field1387 >= 453) {
            Statics.field193.field197 = !Statics.field193.field197;
            class12.method6();
            if (Statics.field193.field197) {
                class138.method2252();
            } else {
                class154 var1 = Statics.field1028;
                int var2 = var1.method3047("scape main");
                int var3 = var1.method3048(var2, "");
                class138.method2756(var1, var2, var3, 255, false);
            }
        }
        if (client.field489 == 5) {
            return;
        }
        field337++;
        if (client.field489 != 10) {
            return;
        }
        if (client.field487 == 0) {
            if (class77.field1398 == 1) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class77.field1399 >= var4 && class77.field1399 <= var4 + var6 && class77.field1387 >= var5 && class77.field1387 <= var5 + var7) {
                    method1702();
                    return;
                }
            }
            if (Statics.field416 != null) {
                method1702();
            }
        }
        int var8 = class77.field1398;
        int var9 = class77.field1399;
        int var10 = class77.field1387;
        if (field332 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field332 = 3;
                field334 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field328 = class134.field2285;
                field323 = class134.field2286;
                field335 = class134.field2155;
                field332 = 2;
                field334 = 0;
            }
        } else if (field332 == 2) {
            short var14 = 231;
            int var22 = var14 + 30;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field334 = 0;
            }
            var22 += 15;
            if (var8 == 1 && var10 >= var22 - 15 && var10 < var22) {
                field334 = 1;
            }
            var22 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field336 = field336.trim();
                if (field336.length() == 0) {
                    method2078(class134.field2123, class134.field2169, class134.field2096);
                    return;
                }
                if (field316.length() == 0) {
                    method2078(class134.field2198, class134.field2199, class134.field2200);
                    return;
                }
                method2078(class134.field2107, class134.field2289, class134.field2290);
                client.method828(20);
                return;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field332 = 0;
                field336 = "";
                field316 = "";
            }
            while (true) {
                while (class75.method1438()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field339.length(); var19++) {
                        if (Statics.field1187 == field339.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (field334 == 0) {
                        if (Statics.field1555 == 85 && field336.length() > 0) {
                            field336 = field336.substring(0, field336.length() - 1);
                        }
                        if (Statics.field1555 == 84 || Statics.field1555 == 80) {
                            field334 = 1;
                        }
                        if (var18 && field336.length() < 320) {
                            field336 = field336 + Statics.field1187;
                        }
                    } else if (field334 == 1) {
                        if (Statics.field1555 == 85 && field316.length() > 0) {
                            field316 = field316.substring(0, field316.length() - 1);
                        }
                        if (Statics.field1555 == 84 || Statics.field1555 == 80) {
                            field334 = 0;
                        }
                        if (Statics.field1555 == 84) {
                            field336 = field336.trim();
                            if (field336.length() == 0) {
                                method2078(class134.field2123, class134.field2169, class134.field2096);
                                return;
                            }
                            if (field316.length() == 0) {
                                method2078(class134.field2198, class134.field2199, class134.field2200);
                                return;
                            }
                            method2078(class134.field2107, class134.field2289, class134.field2290);
                            client.method828(20);
                            return;
                        }
                        if (var18 && field316.length() < 20) {
                            field316 = field316 + Statics.field1187;
                        }
                    }
                }
                return;
            }
        } else if (field332 == 3) {
            short var20 = 382;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field332 = 0;
            }
        }
    }

    @ObfuscatedName("ay.o(Lgb;Lgb;I)V")
    public static void method932(class183 arg0, class183 arg1) {
        if (field345) {
            method221(arg0, arg1);
            return;
        }
        if (client.field489 == 0 || client.field489 == 5) {
            byte var2 = 20;
            arg0.method3500(class134.field2284, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1828(230, var3, 304, 34, 9179409);
            class89.method1828(231, var3 + 1, 302, 32, 0);
            class89.method1826(232, var3 + 2, field340 * 3, 30, 9179409);
            class89.method1826(field340 * 3 + 232, var3 + 2, 300 - field340 * 3, 30, 0);
            arg0.method3500(field331, 382, 276 - var2, 16777215, -1);
        }
        if (client.field489 == 20) {
            Statics.field2820.method1808(382 - Statics.field2820.field1486 / 2, 271 - Statics.field2820.field1487 / 2);
            short var4 = 211;
            arg0.method3500(field328, 382, var4, 16776960, 0);
            int var35 = var4 + 15;
            arg0.method3500(field323, 382, var35, 16776960, 0);
            int var36 = var35 + 15;
            arg0.method3500(field335, 382, var36, 16776960, 0);
            int var37 = var36 + 15;
            int var38 = var37 + 10;
            arg0.method3440(class134.field2291, 272, var38, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field336; arg0.method3468(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3440(class185.method3511(var6), 312, var38, 16777215, 0);
            var35 = var38 + 15;
            String var8 = class134.field2292;
            String var9 = field316;
            String var10 = class147.method114('*', var9.length());
            arg0.method3440(var8 + var10, 274, var35, 16777215, 0);
            var35 += 15;
        }
        if (client.field489 == 10) {
            Statics.field2820.method1808(202, 171);
            if (field332 == 0) {
                short var11 = 251;
                arg0.method3500(class134.field2295, 382, var11, 16776960, 0);
                int var39 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field317.method1808(var12 - 73, var13 - 20);
                arg0.method3456(class134.field2294, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field317.method1808(var14 - 73, var13 - 20);
                arg0.method3456(class134.field2175, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field332 == 2) {
                short var15 = 211;
                arg0.method3500(field328, 382, var15, 16776960, 0);
                int var40 = var15 + 15;
                arg0.method3500(field323, 382, var40, 16776960, 0);
                int var41 = var40 + 15;
                arg0.method3500(field335, 382, var41, 16776960, 0);
                int var42 = var41 + 15;
                int var43 = var42 + 10;
                arg0.method3440(class134.field2291, 272, var43, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field336; arg0.method3468(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3440(class185.method3511(var17) + (field334 == 0 & client.field491 % 40 < 20 ? class2.method149(16776960) + class2.field21 : ""), 312, var43, 16777215, 0);
                var40 = var43 + 15;
                String var19 = class134.field2292;
                String var20 = field316;
                String var21 = class147.method114('*', var20.length());
                arg0.method3440(var19 + var21 + (field334 == 1 & client.field491 % 40 < 20 ? class2.method149(16776960) + class2.field21 : ""), 274, var40, 16777215, 0);
                var40 += 15;
                short var22 = 302;
                short var23 = 321;
                Statics.field317.method1808(var22 - 73, var23 - 20);
                arg0.method3500(class134.field2196, var22, var23 + 5, 16777215, 0);
                short var24 = 462;
                Statics.field317.method1808(var24 - 73, var23 - 20);
                arg0.method3500(class134.field2297, var24, var23 + 5, 16777215, 0);
            } else if (field332 == 3) {
                arg0.method3500(class134.field2298, 382, 211, 16776960, 0);
                short var25 = 236;
                arg0.method3500(class134.field2299, 382, var25, 16777215, 0);
                int var44 = var25 + 15;
                arg0.method3500(class134.field2300, 382, var44, 16777215, 0);
                int var45 = var44 + 15;
                arg0.method3500(class134.field2301, 382, var45, 16777215, 0);
                int var46 = var45 + 15;
                arg0.method3500(class134.field2180, 382, var46, 16777215, 0);
                int var47 = var46 + 15;
                short var26 = 382;
                short var27 = 321;
                Statics.field317.method1808(var26 - 73, var27 - 20);
                arg0.method3500(class134.field2297, var26, var27 + 5, 16777215, 0);
            }
        }
        if (field337 > 0) {
            method1479(field337);
            field337 = 0;
        }
        method818();
        Statics.field320[Statics.field193.field197 ? 1 : 0].method1808(725, 463);
        if (client.field489 > 5 && client.field487 == 0) {
            if (Statics.field897 == null) {
                Statics.field897 = class84.method692(Statics.field1458, "sl_button", "");
            } else {
                byte var28 = 5;
                short var29 = 463;
                byte var30 = 100;
                byte var31 = 35;
                Statics.field897.method1808(var28, var29);
                arg0.method3500(class134.field2239 + " " + client.field591, var30 / 2 + var28, var31 / 2 + var29 - 2, 16777215, 0);
                if (Statics.field416 == null) {
                    arg1.method3500(class134.field2313, var30 / 2 + var28, var31 / 2 + var29 + 12, 16777215, 0);
                } else {
                    arg1.method3500(class134.field2166, var30 / 2 + var28, var31 / 2 + var29 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var32 = Statics.field310.getGraphics();
            Statics.field819.method1621(var32, 0, 0);
        } catch (Exception var34) {
            Statics.field310.repaint();
        }
    }

    @ObfuscatedName("cg.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2078(String arg0, String arg1, String arg2) {
        field328 = arg0;
        field323 = arg1;
        field335 = arg2;
    }

    @ObfuscatedName("w.g(Lcj;I)V")
    public static final void method50(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2460.length; var2++) {
            Statics.field2460[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2460[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field360[var8] = (Statics.field2460[var8 - 1] + Statics.field2460[var8 + 1] + Statics.field2460[var8 - 128] + Statics.field2460[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2460;
            Statics.field2460 = Statics.field360;
            Statics.field360 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1487; var11++) {
            for (int var12 = 0; var12 < arg0.field1486; var12++) {
                if (arg0.field1490[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1485;
                    int var14 = var11 + 16 + arg0.field1489;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2460[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bz.w(II)V")
    public static final void method1479(int arg0) {
        short var1 = 256;
        field338 += arg0 * 128;
        if (field338 > Statics.field2460.length) {
            field338 -= Statics.field2460.length;
            int var2 = (int) (Math.random() * 12.0D);
            method50(Statics.field318[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field908[var3 + var4] - Statics.field2460[field338 + var3 & Statics.field2460.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field908[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field908[var9 + var10] = 255;
                } else {
                    Statics.field908[var9 + var10] = 0;
                }
            }
        }
        if (field324 > 0) {
            field324 -= arg0 * 4;
        }
        if (field343 > 0) {
            field343 -= arg0 * 4;
        }
        if (field324 == 0 && field343 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field324 = 1024;
            }
            if (var12 == 1) {
                field343 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field330[var13] = field330[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field330[var14] = (int) (Math.sin((double) field329 / 14.0D) * 16.0D + Math.sin((double) field329 / 15.0D) * 14.0D + Math.sin((double) field329 / 16.0D) * 12.0D);
            field329++;
        }
        field333 += arg0 * -1262041195;
        int var15 = ((client.field491 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field333 * -770337324; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field908[(var18 << 7) + var17] = 192;
        }
        field333 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field908[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field908[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1375[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1375[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1375[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field908[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("n.c(IIII)I")
    public static final int method173(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("at.z(I)V")
    public static final void method818() {
        short var0 = 256;
        if (field324 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field324 > 768) {
                    Statics.field261[var1] = method173(Statics.field1452[var1], Statics.field247[var1], 1024 - field324);
                } else if (field324 > 256) {
                    Statics.field261[var1] = Statics.field247[var1];
                } else {
                    Statics.field261[var1] = method173(Statics.field247[var1], Statics.field1452[var1], 256 - field324);
                }
            }
        } else if (field343 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field343 > 768) {
                    Statics.field261[var2] = method173(Statics.field1452[var2], Statics.field76[var2], 1024 - field343);
                } else if (field343 > 256) {
                    Statics.field261[var2] = Statics.field76[var2];
                } else {
                    Statics.field261[var2] = method173(Statics.field76[var2], Statics.field1452[var2], 256 - field343);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field261[var3] = Statics.field1452[var3];
            }
        }
        class89.method1820(0, 9, 128, var0 + 7);
        Statics.field2709.method1719(0, 0);
        class89.method1819();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field330[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field908[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field261[var10];
                    int var14 = Statics.field819.field1467[var5];
                    Statics.field819.field1467[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1820(637, 9, 765, var0 + 7);
        Statics.field1441.method1719(382, 0);
        class89.method1819();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field330[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field908[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field261[var22];
                    int var26 = Statics.field819.field1467[var20];
                    Statics.field819.field1467[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("r.f(Lgb;Lgb;I)V")
    public static void method221(class183 arg0, class183 arg1) {
        if (Statics.field1839 == null) {
            Statics.field1839 = class84.method217(Statics.field1458, "sl_back", "");
        }
        if (Statics.field83 == null) {
            Statics.field83 = class84.method4(Statics.field1458, "sl_flags", "");
        }
        if (Statics.field1431 == null) {
            Statics.field1431 = class84.method4(Statics.field1458, "sl_arrows", "");
        }
        if (Statics.field152 == null) {
            Statics.field152 = class84.method4(Statics.field1458, "sl_stars", "");
        }
        class89.method1826(0, 23, 765, 480, 0);
        class89.method1827(0, 0, 125, 23, 12425273, 9135624);
        class89.method1827(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3500(class134.field2118, 62, 15, 0, -1);
        if (Statics.field152 != null) {
            Statics.field152[1].method1808(140, 1);
            arg1.method3440(class134.field2304, 152, 10, 16777215, -1);
            Statics.field152[0].method1808(140, 12);
            arg1.method3440(class134.field2305, 152, 21, 16777215, -1);
        }
        if (Statics.field1431 != null) {
            short var2 = 280;
            if (field319[0] == 0 && field326[0] == 0) {
                Statics.field1431[2].method1808(var2, 4);
            } else {
                Statics.field1431[0].method1808(var2, 4);
            }
            if (field319[0] == 0 && field326[0] == 1) {
                Statics.field1431[3].method1808(var2 + 15, 4);
            } else {
                Statics.field1431[1].method1808(var2 + 15, 4);
            }
            arg0.method3440(class134.field2306, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field319[0] == 1 && field326[0] == 0) {
                Statics.field1431[2].method1808(var3, 4);
            } else {
                Statics.field1431[0].method1808(var3, 4);
            }
            if (field319[0] == 1 && field326[0] == 1) {
                Statics.field1431[3].method1808(var3 + 15, 4);
            } else {
                Statics.field1431[1].method1808(var3 + 15, 4);
            }
            arg0.method3440(class134.field2135, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field319[0] == 2 && field326[0] == 0) {
                Statics.field1431[2].method1808(var4, 4);
            } else {
                Statics.field1431[0].method1808(var4, 4);
            }
            if (field319[0] == 2 && field326[0] == 1) {
                Statics.field1431[3].method1808(var4 + 15, 4);
            } else {
                Statics.field1431[1].method1808(var4 + 15, 4);
            }
            arg0.method3440(class134.field2161, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field319[0] == 3 && field326[0] == 0) {
                Statics.field1431[2].method1808(var5, 4);
            } else {
                Statics.field1431[0].method1808(var5, 4);
            }
            if (field319[0] == 3 && field326[0] == 1) {
                Statics.field1431[3].method1808(var5 + 15, 4);
            } else {
                Statics.field1431[1].method1808(var5 + 15, 4);
            }
            arg0.method3440(class134.field2147, var5 + 32, 17, 16777215, -1);
        }
        class89.method1826(708, 4, 50, 16, 0);
        arg1.method3500(class134.field2297, 733, 16, 16777215, -1);
        field344 = -1;
        if (Statics.field1839 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field341) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field341) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field341) {
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
            for (int var20 = 0; var20 < field341; var20++) {
                class13 var21 = Statics.field2823[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field206);
                if (var21.field206 == -1) {
                    var23 = class134.field2310;
                    var22 = false;
                } else if (var21.field206 > 1980) {
                    var23 = class134.field2311;
                    var22 = false;
                }
                if (class77.field1392 >= var17 && class77.field1393 >= var16 && class77.field1392 < var6 + var17 && class77.field1393 < var7 + var16 && var22) {
                    field344 = var20;
                    Statics.field1839[var21.field210 ? 1 : 0].method1784(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1839[var21.field210 ? 1 : 0].method1719(var17, var16);
                }
                if (Statics.field83 != null) {
                    Statics.field83[(var21.field210 ? 8 : 0) + var21.field208].method1808(var17 + 29, var16);
                }
                arg0.method3500(Integer.toString(var21.field215), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3500(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var24 = arg1.method3468(Statics.field2823[field344].field209) + 6;
                int var25 = arg1.field2852 + 8;
                class89.method1826(class77.field1392 - var24 / 2, class77.field1393 + 20 + 5, var24, var25, 16777120);
                class89.method1828(class77.field1392 - var24 / 2, class77.field1393 + 20 + 5, var24, var25, 0);
                arg1.method3500(Statics.field2823[field344].field209, class77.field1392, class77.field1393 + 20 + 5 + arg1.field2852 + 4, 0, -1);
            }
        }
        try {
            Graphics var26 = Statics.field310.getGraphics();
            Statics.field819.method1621(var26, 0, 0);
        } catch (Exception var28) {
            Statics.field310.repaint();
        }
    }

    @ObfuscatedName("cc.a(Lbz;I)V")
    public static void method2166(class73 arg0) {
        if (class77.field1398 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1399 >= var1 && class77.field1399 <= var1 + 14 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(0, 0);
            return;
        }
        if (class77.field1399 >= var1 + 15 && class77.field1399 <= var1 + 80 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1399 >= var2 && class77.field1399 <= var2 + 14 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(1, 0);
            return;
        }
        if (class77.field1399 >= var2 + 15 && class77.field1399 <= var2 + 80 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1399 >= var3 && class77.field1399 <= var3 + 14 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(2, 0);
            return;
        }
        if (class77.field1399 >= var3 + 15 && class77.field1399 <= var3 + 80 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1399 >= var4 && class77.field1399 <= var4 + 14 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(3, 0);
            return;
        }
        if (class77.field1399 >= var4 + 15 && class77.field1399 <= var4 + 80 && class77.field1387 >= 4 && class77.field1387 <= 18) {
            method2425(3, 1);
            return;
        }
        if (class77.field1399 >= 708 && class77.field1387 >= 4 && class77.field1399 <= 758 && class77.field1387 <= 20) {
            field345 = false;
            Statics.field2709.method1719(0, 0);
            Statics.field1441.method1719(382, 0);
            Statics.field325.method1808(382 - Statics.field325.field1486 / 2, 18);
            return;
        }
        if (field344 == -1) {
            return;
        }
        class13 var5 = Statics.field2823[field344];
        if (client.field524 != var5.field210) {
            client.field524 = var5.field210;
            class40.method898(var5.field210);
        }
        Statics.field521 = var5.field205;
        client.field591 = var5.field215;
        Statics.field194 = client.field482 == 0 ? 43594 : var5.field215 + 40000;
        Statics.field902 = client.field482 == 0 ? 443 : var5.field215 + 50000;
        Statics.field1994 = Statics.field194;
        field345 = false;
        Statics.field2709.method1719(0, 0);
        Statics.field1441.method1719(382, 0);
        Statics.field325.method1808(382 - Statics.field325.field1486 / 2, 18);
        return;
    }

    @ObfuscatedName("cx.d(I)V")
    public static void method1702() {
        try {
            if (Statics.field416 == null) {
                Statics.field416 = new class24(Statics.field1325, new URL(Statics.field656));
            } else {
                byte[] var0 = Statics.field416.method229();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field341 = var1.method2493();
                    Statics.field2823 = new class13[field341];
                    int var2 = 0;
                    while (var2 < field341) {
                        class13 var3 = Statics.field2823[var2] = new class13();
                        int var4 = var1.method2493();
                        var3.field215 = var4 & 0x7FFF;
                        var3.field210 = (var4 & 0x8000) != 0;
                        var3.field205 = var1.method2500();
                        var3.field209 = var1.method2500();
                        var3.field208 = var1.method2491();
                        var3.field206 = var1.method2529();
                        var3.field204 = var2++;
                    }
                    method134(Statics.field2823, 0, Statics.field2823.length - 1, field319, field326);
                    field345 = true;
                    Statics.field416 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field416 = null;
        }
    }

    @ObfuscatedName("ds.e(III)V")
    public static void method2425(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field319[var5] != arg0) {
                var2[var4] = field319[var5];
                var3[var4] = field326[var5];
                var4++;
            }
        }
        field319 = var2;
        field326 = var3;
        method134(Statics.field2823, 0, Statics.field2823.length - 1, field319, field326);
    }

    @ObfuscatedName("k.y([Ld;II[I[IS)V")
    public static void method134(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field204;
                        var12 = var8.field204;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field206;
                        var12 = var8.field206;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field210 ? 1 : 0;
                        var12 = var8.field210 ? 1 : 0;
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
                        var15 = arg0[var5].field204;
                        var16 = var8.field204;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field206;
                        var16 = var8.field206;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field210 ? 1 : 0;
                        var16 = var8.field210 ? 1 : 0;
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
        method134(arg0, arg1, var6, arg3, arg4);
        method134(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
