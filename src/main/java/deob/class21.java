package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("h")
public class class21 {

    @ObfuscatedName("h.o")
    public static int[] field297 = new int[256];

    @ObfuscatedName("h.m")
    public static int field300 = 0;

    @ObfuscatedName("h.z")
    public static int field301 = 0;

    @ObfuscatedName("h.d")
    public static int field323 = 0;

    @ObfuscatedName("h.y")
    public static int field320 = 0;

    @ObfuscatedName("h.ah")
    public static int field305 = 0;

    @ObfuscatedName("h.ad")
    public static int field291 = 0;

    @ObfuscatedName("h.au")
    public static int field304 = 10;

    @ObfuscatedName("h.as")
    public static String field308 = "";

    @ObfuscatedName("h.ag")
    public static int field298 = 0;

    @ObfuscatedName("h.ab")
    public static String field310 = "";

    @ObfuscatedName("h.aq")
    public static String field311 = "";

    @ObfuscatedName("h.af")
    public static String field324 = "";

    @ObfuscatedName("h.ay")
    public static String field313 = "";

    @ObfuscatedName("h.ax")
    public static String field314 = "";

    @ObfuscatedName("h.aa")
    public static int field315 = 0;

    @ObfuscatedName("h.ak")
    public static String field316 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("h.aj")
    public static boolean field306 = false;

    @ObfuscatedName("h.aw")
    public static int field325 = 0;

    @ObfuscatedName("h.bg")
    public static int[] field319 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("h.bd")
    public static int[] field299 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("h.bo")
    public static int field321 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.a(Lev;Lev;I)I")
    public static int method103(class152 arg0, class152 arg1) {
        int var2 = 0;
        if (arg0.method2961("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2961("logo", "")) {
            var2++;
        }
        if (arg1.method2961("titlebox", "")) {
            var2++;
        }
        if (arg1.method2961("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2961("runes", "")) {
            var2++;
        }
        if (arg1.method2961("title_mute", "")) {
            var2++;
        }
        arg1.method2961("sl_back", "");
        arg1.method2961("sl_flags", "");
        arg1.method2961("sl_arrows", "");
        arg1.method2961("sl_stars", "");
        arg1.method2961("sl_button", "");
        return var2;
    }

    @ObfuscatedName("s.r(Lbs;B)V")
    public static void method121(class73 arg0) {
        if (field306) {
            method1460(arg0);
            return;
        }
        if (class77.field1368 == 1 && class77.field1372 >= 715 && class77.field1373 >= 453) {
            Statics.field1018.field174 = !Statics.field1018.field174;
            class29 var1 = null;
            try {
                var1 = class82.method48("", Statics.field2307.field2063, true);
                class126 var2 = Statics.field1018.method106();
                var1.method509(var2.field2015, 0, var2.field2016);
            } catch (Exception var27) {
            }
            try {
                if (var1 != null) {
                    var1.method514();
                }
            } catch (Exception var26) {
            }
            if (Statics.field1018.field174) {
                class138.method2623();
            } else {
                class154 var5 = Statics.field1289;
                int var6 = var5.method2958("scape main");
                int var7 = var5.method3006(var6, "");
                class138.method1509(var5, var6, var7, 255, false);
            }
        }
        if (client.field605 == 5) {
            return;
        }
        field305++;
        if (client.field605 != 10) {
            return;
        }
        if (client.field462 == 0) {
            if (class77.field1368 == 1) {
                byte var8 = 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class77.field1372 >= var8 && class77.field1372 <= var8 + var10 && class77.field1373 >= var9 && class77.field1373 <= var9 + var11) {
                    method122();
                    return;
                }
            }
            if (Statics.field2548 != null) {
                method122();
            }
        }
        int var12 = class77.field1368;
        int var13 = class77.field1372;
        int var14 = class77.field1373;
        if (field298 == 0) {
            short var15 = 302;
            short var16 = 291;
            if (var12 == 1 && var13 >= var15 - 75 && var13 <= var15 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                field298 = 3;
                field315 = 0;
            }
            short var17 = 462;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                field310 = class134.field2270;
                field311 = class134.field2273;
                field324 = class134.field2099;
                field298 = 2;
                field315 = 0;
            }
        } else if (field298 == 2) {
            short var18 = 231;
            int var28 = var18 + 30;
            if (var12 == 1 && var14 >= var28 - 15 && var14 < var28) {
                field315 = 0;
            }
            var28 += 15;
            if (var12 == 1 && var14 >= var28 - 15 && var14 < var28) {
                field315 = 1;
            }
            var28 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field313 = field313.trim();
                if (field313.length() == 0) {
                    method503(class134.field2180, class134.field2181, class134.field2084);
                    return;
                }
                if (field314.length() == 0) {
                    method503(class134.field2183, class134.field2184, class134.field2185);
                    return;
                }
                method503(class134.field2213, class134.field2274, class134.field2275);
                client.method197(20);
                return;
            }
            short var21 = 462;
            if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field298 = 0;
                field313 = "";
                field314 = "";
            }
            while (true) {
                while (Statics.method14()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field316.length(); var23++) {
                        if (Statics.field2310 == field316.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (field315 == 0) {
                        if (Statics.field858 == 85 && field313.length() > 0) {
                            field313 = field313.substring(0, field313.length() - 1);
                        }
                        if (Statics.field858 == 84 || Statics.field858 == 80) {
                            field315 = 1;
                        }
                        if (var22 && field313.length() < 320) {
                            field313 = field313 + Statics.field2310;
                        }
                    } else if (field315 == 1) {
                        if (Statics.field858 == 85 && field314.length() > 0) {
                            field314 = field314.substring(0, field314.length() - 1);
                        }
                        if (Statics.field858 == 84 || Statics.field858 == 80) {
                            field315 = 0;
                        }
                        if (Statics.field858 == 84) {
                            field313 = field313.trim();
                            if (field313.length() == 0) {
                                method503(class134.field2180, class134.field2181, class134.field2084);
                                return;
                            }
                            if (field314.length() == 0) {
                                method503(class134.field2183, class134.field2184, class134.field2185);
                                return;
                            }
                            method503(class134.field2213, class134.field2274, class134.field2275);
                            client.method197(20);
                            return;
                        }
                        if (var22 && field314.length() < 20) {
                            field314 = field314 + Statics.field2310;
                        }
                    }
                }
                return;
            }
        } else if (field298 == 3) {
            short var24 = 382;
            short var25 = 321;
            if (var12 == 1 && var13 >= var24 - 75 && var13 <= var24 + 75 && var14 >= var25 - 20 && var14 <= var25 + 20) {
                field298 = 0;
            }
        }
    }

    @ObfuscatedName("au.u(Lgd;Lgd;S)V")
    public static void method529(class183 arg0, class183 arg1) {
        if (field306) {
            method36(arg0, arg1);
            return;
        }
        if (client.field605 == 0 || client.field605 == 5) {
            byte var2 = 20;
            arg0.method3345(class134.field2269, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class89.method1733(230, var3, 304, 34, 9179409);
            class89.method1733(231, var3 + 1, 302, 32, 0);
            class89.method1728(232, var3 + 2, field304 * 3, 30, 9179409);
            class89.method1728(field304 * 3 + 232, var3 + 2, 300 - field304 * 3, 30, 0);
            arg0.method3345(field308, 382, 276 - var2, 16777215, -1);
        }
        if (client.field605 == 20) {
            Statics.field292.method1721(382 - Statics.field292.field1459 / 2, 271 - Statics.field292.field1453 / 2);
            short var4 = 211;
            arg0.method3345(field310, 382, var4, 16776960, 0);
            int var54 = var4 + 15;
            arg0.method3345(field311, 382, var54, 16776960, 0);
            int var55 = var54 + 15;
            arg0.method3345(field324, 382, var55, 16776960, 0);
            int var56 = var55 + 15;
            int var57 = var56 + 10;
            arg0.method3415(class134.field2105, 272, var57, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field313; arg0.method3361(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3415(class185.method3346(var6), 312, var57, 16777215, 0);
            var54 = var57 + 15;
            arg0.method3415(class134.field2277 + class147.method1(field314), 274, var54, 16777215, 0);
            var54 += 15;
        }
        if (client.field605 == 10) {
            Statics.field292.method1721(202, 171);
            if (field298 == 0) {
                short var7 = 251;
                arg0.method3345(class134.field2278, 382, var7, 16776960, 0);
                int var58 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field81.method1721(var8 - 73, var9 - 20);
                arg0.method3373(class134.field2279, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field81.method1721(var10 - 73, var9 - 20);
                arg0.method3373(class134.field2240, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field298 == 2) {
                short var11 = 211;
                arg0.method3345(field310, 382, var11, 16776960, 0);
                int var59 = var11 + 15;
                arg0.method3345(field311, 382, var59, 16776960, 0);
                int var60 = var59 + 15;
                arg0.method3345(field324, 382, var60, 16776960, 0);
                int var61 = var60 + 15;
                int var62 = var61 + 10;
                arg0.method3415(class134.field2105, 272, var62, 16777215, 0);
                short var12 = 200;
                String var13;
                for (var13 = field313; arg0.method3361(var13) > var12; var13 = var13.substring(1)) {
                }
                arg0.method3415(class185.method3346(var13) + (field315 == 0 & client.field465 % 40 < 20 ? Statics.method2628(16776960) + class2.field14 : ""), 312, var62, 16777215, 0);
                var59 = var62 + 15;
                arg0.method3415(class134.field2277 + class147.method1(field314) + (field315 == 1 & client.field465 % 40 < 20 ? Statics.method2628(16776960) + class2.field14 : ""), 274, var59, 16777215, 0);
                var59 += 15;
                short var14 = 302;
                short var15 = 321;
                Statics.field81.method1721(var14 - 73, var15 - 20);
                arg0.method3345(class134.field2141, var14, var15 + 5, 16777215, 0);
                short var16 = 462;
                Statics.field81.method1721(var16 - 73, var15 - 20);
                arg0.method3345(class134.field2230, var16, var15 + 5, 16777215, 0);
            } else if (field298 == 3) {
                arg0.method3345(class134.field2283, 382, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3345(class134.field2284, 382, var17, 16777215, 0);
                int var63 = var17 + 15;
                arg0.method3345(class134.field2285, 382, var63, 16777215, 0);
                int var64 = var63 + 15;
                arg0.method3345(class134.field2129, 382, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method3345(class134.field2259, 382, var65, 16777215, 0);
                int var66 = var65 + 15;
                short var18 = 382;
                short var19 = 321;
                Statics.field81.method1721(var18 - 73, var19 - 20);
                arg0.method3345(class134.field2230, var18, var19 + 5, 16777215, 0);
            }
        }
        if (field305 > 0) {
            int var20 = field305;
            short var21 = 256;
            field323 += var20 * 128;
            if (field323 > Statics.field1025.length) {
                field323 -= Statics.field1025.length;
                int var22 = (int) (Math.random() * 12.0D);
                method143(Statics.field380[var22]);
            }
            int var23 = 0;
            int var24 = var20 * 128;
            int var25 = (var21 - var20) * 128;
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = Statics.field941[var23 + var24] - Statics.field1025[field323 + var23 & Statics.field1025.length - 1] * var20 / 6;
                if (var27 < 0) {
                    var27 = 0;
                }
                Statics.field941[var23++] = var27;
            }
            for (int var28 = var21 - var20; var28 < var21; var28++) {
                int var29 = var28 * 128;
                for (int var30 = 0; var30 < 128; var30++) {
                    int var31 = (int) (Math.random() * 100.0D);
                    if (var31 < 50 && var30 > 10 && var30 < 118) {
                        Statics.field941[var29 + var30] = 255;
                    } else {
                        Statics.field941[var29 + var30] = 0;
                    }
                }
            }
            if (field300 > 0) {
                field300 -= var20 * 4;
            }
            if (field301 > 0) {
                field301 -= var20 * 4;
            }
            if (field300 == 0 && field301 == 0) {
                int var32 = (int) (Math.random() * (double) (2000 / var20));
                if (var32 == 0) {
                    field300 = 1024;
                }
                if (var32 == 1) {
                    field301 = 1024;
                }
            }
            for (int var33 = 0; var33 < var21 - var20; var33++) {
                field297[var33] = field297[var20 + var33];
            }
            for (int var34 = var21 - var20; var34 < var21; var34++) {
                field297[var34] = (int) (Math.sin((double) field291 / 14.0D) * 16.0D + Math.sin((double) field291 / 15.0D) * 14.0D + Math.sin((double) field291 / 16.0D) * 12.0D);
                field291++;
            }
            field320 += var20 * -102890245;
            int var35 = ((client.field465 & 0x1) + var20) / 2;
            if (var35 > 0) {
                for (int var36 = 0; var36 < field320 * 343141356; var36++) {
                    int var37 = (int) (Math.random() * 124.0D) + 2;
                    int var38 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field941[(var38 << 7) + var37] = 192;
                }
                field320 = 0;
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
                                    var44 += Statics.field317[var35 * 128 + var43 + var46];
                                }
                                if (var45 - (var35 + 1) >= 0) {
                                    var44 -= Statics.field317[var43 + var46 - (var35 + 1) * 128];
                                }
                                if (var45 >= 0) {
                                    Statics.field941[var43 + var46] = var44 / (var35 * 2 + 1);
                                }
                            }
                            var43++;
                        }
                    }
                    int var40 = 0;
                    int var41 = var39 * 128;
                    for (int var42 = -var35; var42 < 128; var42++) {
                        if (var35 + var42 < 128) {
                            var40 += Statics.field941[var41 + var42 + var35];
                        }
                        if (var42 - (var35 + 1) >= 0) {
                            var40 -= Statics.field941[var41 + var42 - (var35 + 1)];
                        }
                        if (var42 >= 0) {
                            Statics.field317[var41 + var42] = var40 / (var35 * 2 + 1);
                        }
                    }
                    var39++;
                }
            }
            field305 = 0;
        }
        method100();
        Statics.field82[Statics.field1018.field174 ? 1 : 0].method1721(725, 463);
        if (client.field605 > 5 && client.field462 == 0) {
            if (Statics.field392 == null) {
                Statics.field392 = class84.method7(Statics.field227, "sl_button", "");
            } else {
                byte var47 = 5;
                short var48 = 463;
                byte var49 = 100;
                byte var50 = 35;
                Statics.field392.method1721(var47, var48);
                arg0.method3345(class134.field2224 + " " + client.field457, var49 / 2 + var47, var50 / 2 + var48 - 2, 16777215, 0);
                if (Statics.field2548 == null) {
                    arg1.method3345(class134.field2298, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                } else {
                    arg1.method3345(class134.field2297, var49 / 2 + var47, var50 / 2 + var48 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var51 = Statics.field1830.getGraphics();
            Statics.field322.method1543(var51, 0, 0);
        } catch (Exception var53) {
            Statics.field1830.repaint();
        }
    }

    @ObfuscatedName("client.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method503(String arg0, String arg1, String arg2) {
        field310 = arg0;
        field311 = arg1;
        field324 = arg2;
    }

    @ObfuscatedName("z.k(Lcb;I)V")
    public static final void method143(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1025.length; var2++) {
            Statics.field1025[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1025[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field287[var8] = (Statics.field1025[var8 - 1] + Statics.field1025[var8 + 1] + Statics.field1025[var8 - 128] + Statics.field1025[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1025;
            Statics.field1025 = Statics.field287;
            Statics.field287 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1453; var11++) {
            for (int var12 = 0; var12 < arg0.field1459; var12++) {
                if (arg0.field1454[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1457;
                    int var14 = var11 + 16 + arg0.field1458;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1025[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fp.x(IIIB)I")
    public static final int method3109(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("p.v(I)V")
    public static final void method100() {
        short var0 = 256;
        if (field300 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field300 > 768) {
                    Statics.field724[var1] = method3109(Statics.field312[var1], Statics.field302[var1], 1024 - field300);
                } else if (field300 > 256) {
                    Statics.field724[var1] = Statics.field302[var1];
                } else {
                    Statics.field724[var1] = method3109(Statics.field302[var1], Statics.field312[var1], 256 - field300);
                }
            }
        } else if (field301 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field301 > 768) {
                    Statics.field724[var2] = method3109(Statics.field312[var2], Statics.field61[var2], 1024 - field301);
                } else if (field301 > 256) {
                    Statics.field724[var2] = Statics.field61[var2];
                } else {
                    Statics.field724[var2] = method3109(Statics.field61[var2], Statics.field312[var2], 256 - field301);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field724[var3] = Statics.field312[var3];
            }
        }
        class89.method1725(0, 9, 128, var0 + 7);
        Statics.field293.method1631(0, 0);
        class89.method1724();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field297[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field941[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field724[var10];
                    int var14 = Statics.field322.field1438[var5];
                    Statics.field322.field1438[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1725(637, 9, 765, var0 + 7);
        Statics.field303.method1631(382, 0);
        class89.method1724();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field297[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field941[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field724[var22];
                    int var26 = Statics.field322.field1438[var20];
                    Statics.field322.field1438[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("x.g(Lgd;Lgd;I)V")
    public static void method36(class183 arg0, class183 arg1) {
        if (Statics.field1723 == null) {
            Statics.field1723 = class84.method149(Statics.field227, "sl_back", "");
        }
        if (Statics.field1784 == null) {
            Statics.field1784 = class84.method2624(Statics.field227, "sl_flags", "");
        }
        if (Statics.field1409 == null) {
            Statics.field1409 = class84.method2624(Statics.field227, "sl_arrows", "");
        }
        if (Statics.field1984 == null) {
            Statics.field1984 = class84.method2624(Statics.field227, "sl_stars", "");
        }
        class89.method1728(0, 23, 765, 480, 0);
        class89.method1768(0, 0, 125, 23, 12425273, 9135624);
        class89.method1768(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3345(class134.field2153, 62, 15, 0, -1);
        if (Statics.field1984 != null) {
            Statics.field1984[1].method1721(140, 1);
            arg1.method3415(class134.field2289, 152, 10, 16777215, -1);
            Statics.field1984[0].method1721(140, 12);
            arg1.method3415(class134.field2290, 152, 21, 16777215, -1);
        }
        if (Statics.field1409 != null) {
            short var2 = 280;
            if (field319[0] == 0 && field299[0] == 0) {
                Statics.field1409[2].method1721(var2, 4);
            } else {
                Statics.field1409[0].method1721(var2, 4);
            }
            if (field319[0] == 0 && field299[0] == 1) {
                Statics.field1409[3].method1721(var2 + 15, 4);
            } else {
                Statics.field1409[1].method1721(var2 + 15, 4);
            }
            arg0.method3415(class134.field2291, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field319[0] == 1 && field299[0] == 0) {
                Statics.field1409[2].method1721(var3, 4);
            } else {
                Statics.field1409[0].method1721(var3, 4);
            }
            if (field319[0] == 1 && field299[0] == 1) {
                Statics.field1409[3].method1721(var3 + 15, 4);
            } else {
                Statics.field1409[1].method1721(var3 + 15, 4);
            }
            arg0.method3415(class134.field2260, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field319[0] == 2 && field299[0] == 0) {
                Statics.field1409[2].method1721(var4, 4);
            } else {
                Statics.field1409[0].method1721(var4, 4);
            }
            if (field319[0] == 2 && field299[0] == 1) {
                Statics.field1409[3].method1721(var4 + 15, 4);
            } else {
                Statics.field1409[1].method1721(var4 + 15, 4);
            }
            arg0.method3415(class134.field2293, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field319[0] == 3 && field299[0] == 0) {
                Statics.field1409[2].method1721(var5, 4);
            } else {
                Statics.field1409[0].method1721(var5, 4);
            }
            if (field319[0] == 3 && field299[0] == 1) {
                Statics.field1409[3].method1721(var5 + 15, 4);
            } else {
                Statics.field1409[1].method1721(var5 + 15, 4);
            }
            arg0.method3415(class134.field2294, var5 + 32, 17, 16777215, -1);
        }
        class89.method1728(708, 4, 50, 16, 0);
        arg1.method3345(class134.field2230, 733, 16, 16777215, -1);
        field321 = -1;
        if (Statics.field1723 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field325) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field325) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field325) {
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
            for (int var20 = 0; var20 < field325; var20++) {
                class13 var21 = Statics.field2325[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field196);
                if (var21.field196 == -1) {
                    var23 = class134.field2295;
                    var22 = false;
                } else if (var21.field196 > 1980) {
                    var23 = class134.field2140;
                    var22 = false;
                }
                if (class77.field1365 >= var17 && class77.field1366 >= var16 && class77.field1365 < var6 + var17 && class77.field1366 < var7 + var16 && var22) {
                    field321 = var20;
                    Statics.field1723[var21.field193 ? 1 : 0].method1637(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1723[var21.field193 ? 1 : 0].method1631(var17, var16);
                }
                if (Statics.field1784 != null) {
                    Statics.field1784[var21.field185 + (var21.field193 ? 8 : 0)].method1721(var17 + 29, var16);
                }
                arg0.method3345(Integer.toString(var21.field191), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3345(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var24 = arg1.method3361(Statics.field2325[field321].field184) + 6;
                int var25 = arg1.field2838 + 8;
                class89.method1728(class77.field1365 - var24 / 2, class77.field1366 + 20 + 5, var24, var25, 16777120);
                class89.method1733(class77.field1365 - var24 / 2, class77.field1366 + 20 + 5, var24, var25, 0);
                arg1.method3345(Statics.field2325[field321].field184, class77.field1365, class77.field1366 + 20 + 5 + arg1.field2838 + 4, 0, -1);
            }
        }
        try {
            Graphics var26 = Statics.field1830.getGraphics();
            Statics.field322.method1543(var26, 0, 0);
        } catch (Exception var28) {
            Statics.field1830.repaint();
        }
    }

    @ObfuscatedName("bm.n(Lbs;I)V")
    public static void method1460(class73 arg0) {
        if (class77.field1368 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1372 >= var1 && class77.field1372 <= var1 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(0, 0);
            return;
        }
        if (class77.field1372 >= var1 + 15 && class77.field1372 <= var1 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1372 >= var2 && class77.field1372 <= var2 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(1, 0);
            return;
        }
        if (class77.field1372 >= var2 + 15 && class77.field1372 <= var2 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1372 >= var3 && class77.field1372 <= var3 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(2, 0);
            return;
        }
        if (class77.field1372 >= var3 + 15 && class77.field1372 <= var3 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1372 >= var4 && class77.field1372 <= var4 + 14 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(3, 0);
            return;
        }
        if (class77.field1372 >= var4 + 15 && class77.field1372 <= var4 + 80 && class77.field1373 >= 4 && class77.field1373 <= 18) {
            method110(3, 1);
            return;
        }
        if (class77.field1372 >= 708 && class77.field1373 >= 4 && class77.field1372 <= 758 && class77.field1373 <= 20) {
            field306 = false;
            Statics.field293.method1631(0, 0);
            Statics.field303.method1631(382, 0);
            Statics.field2829.method1721(382 - Statics.field2829.field1459 / 2, 18);
            return;
        }
        if (field321 == -1) {
            return;
        }
        class13 var5 = Statics.field2325[field321];
        if (client.field460 != var5.field193) {
            client.field460 = var5.field193;
            class40.method112(var5.field193);
        }
        Statics.field1958 = var5.field183;
        client.field457 = var5.field191;
        Statics.field1388 = client.field458 == 0 ? 43594 : var5.field191 + 40000;
        Statics.field2443 = client.field458 == 0 ? 443 : var5.field191 + 50000;
        Statics.field1795 = Statics.field1388;
        field306 = false;
        Statics.field293.method1631(0, 0);
        Statics.field303.method1631(382, 0);
        Statics.field2829.method1721(382 - Statics.field2829.field1459 / 2, 18);
        return;
    }

    @ObfuscatedName("s.q(I)V")
    public static void method122() {
        try {
            if (Statics.field2548 == null) {
                Statics.field2548 = new class24(Statics.field156, new URL(Statics.field2716));
            } else {
                byte[] var0 = Statics.field2548.method189();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field325 = var1.method2373();
                    Statics.field2325 = new class13[field325];
                    int var2 = 0;
                    while (var2 < field325) {
                        class13 var3 = Statics.field2325[var2] = new class13();
                        int var4 = var1.method2373();
                        var3.field191 = var4 & 0x7FFF;
                        var3.field193 = (var4 & 0x8000) != 0;
                        var3.field183 = var1.method2386();
                        var3.field184 = var1.method2386();
                        var3.field185 = var1.method2481();
                        var3.field196 = var1.method2381();
                        var3.field186 = var2++;
                    }
                    method1318(Statics.field2325, 0, Statics.field2325.length - 1, field319, field299);
                    field306 = true;
                    Statics.field2548 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field2548 = null;
        }
    }

    @ObfuscatedName("e.i(III)V")
    public static void method110(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field319[var5] != arg0) {
                var2[var4] = field319[var5];
                var3[var4] = field299[var5];
                var4++;
            }
        }
        field319 = var2;
        field299 = var3;
        method1318(Statics.field2325, 0, Statics.field2325.length - 1, field319, field299);
    }

    @ObfuscatedName("bi.p([Le;II[I[IB)V")
    public static void method1318(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field186;
                        var12 = var8.field186;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field196;
                        var12 = var8.field196;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field193 ? 1 : 0;
                        var12 = var8.field193 ? 1 : 0;
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
                        var15 = arg0[var5].field186;
                        var16 = var8.field186;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field196;
                        var16 = var8.field196;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field193 ? 1 : 0;
                        var16 = var8.field193 ? 1 : 0;
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
        method1318(arg0, arg1, var6, arg3, arg4);
        method1318(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
