package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("o")
public class class21 {

    @ObfuscatedName("o.z")
    public static int[] field304 = new int[256];

    @ObfuscatedName("o.x")
    public static int field320 = 0;

    @ObfuscatedName("o.s")
    public static int field316 = 0;

    @ObfuscatedName("o.b")
    public static int field310 = 0;

    @ObfuscatedName("o.c")
    public static int field311 = 0;

    @ObfuscatedName("o.aw")
    public static int field312 = 0;

    @ObfuscatedName("o.ap")
    public static int field321 = 0;

    @ObfuscatedName("o.am")
    public static int field301 = 10;

    @ObfuscatedName("o.az")
    public static String field315 = "";

    @ObfuscatedName("o.ax")
    public static int field324 = 0;

    @ObfuscatedName("o.af")
    public static String field305 = "";

    @ObfuscatedName("o.aa")
    public static String field318 = "";

    @ObfuscatedName("o.ag")
    public static String field319 = "";

    @ObfuscatedName("o.aj")
    public static String field329 = "";

    @ObfuscatedName("o.aq")
    public static String field306 = "";

    @ObfuscatedName("o.ah")
    public static int field307 = 0;

    @ObfuscatedName("o.ae")
    public static String field323 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("o.ab")
    public static boolean field314 = false;

    @ObfuscatedName("o.ak")
    public static int field325 = 0;

    @ObfuscatedName("o.bg")
    public static int[] field326 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("o.bl")
    public static int[] field327 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("o.bn")
    public static int field328 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.p(Leu;Leu;I)I")
    public static int method621(class153 arg0, class153 arg1) {
        int var2 = 0;
        if (arg0.method3066("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3066("logo", "")) {
            var2++;
        }
        if (arg1.method3066("titlebox", "")) {
            var2++;
        }
        if (arg1.method3066("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3066("runes", "")) {
            var2++;
        }
        if (arg1.method3066("title_mute", "")) {
            var2++;
        }
        arg1.method3066("sl_back", "");
        arg1.method3066("sl_flags", "");
        arg1.method3066("sl_arrows", "");
        arg1.method3066("sl_stars", "");
        arg1.method3066("sl_button", "");
        return var2;
    }

    @ObfuscatedName("v.e(B)I")
    public static int method143() {
        return 6;
    }

    @ObfuscatedName("c.a(Ljava/awt/Component;Leu;Leu;I)V")
    public static void method237(Component arg0, class153 arg1, class153 arg2) {
        if (Statics.field308) {
            return;
        }
        class89.method1814();
        byte[] var3 = arg1.method3065("title.jpg", "");
        Statics.field1756 = new class86(var3, arg0);
        Statics.field1287 = Statics.field1756.method1709();
        Statics.field1232 = class84.method619(arg2, "logo", "");
        Statics.field2727 = class84.method619(arg2, "titlebox", "");
        Statics.field302 = class84.method619(arg2, "titlebutton", "");
        Statics.field1285 = class84.method1513(arg2, "runes", "");
        Statics.field1277 = class84.method1513(arg2, "title_mute", "");
        Statics.field190 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field190[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field190[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field190[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field190[var7 + 192] = 16777215;
        }
        Statics.field955 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field955[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field955[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field955[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field955[var11 + 192] = 16777215;
        }
        Statics.field2726 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field2726[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field2726[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field2726[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field2726[var15 + 192] = 16777215;
        }
        Statics.field1629 = new int[256];
        Statics.field317 = new int[32768];
        Statics.field6 = new int[32768];
        method44((class87) null);
        Statics.field309 = new int[32768];
        Statics.field2081 = new int[32768];
        field324 = 0;
        field329 = "";
        field306 = "";
        field314 = false;
        if (Statics.field29.field183) {
            class139.method799(2);
        } else {
            class155 var16 = Statics.field244;
            int var17 = var16.method3063("scape main");
            int var18 = var16.method3114(var17, "");
            class139.field2353 = 1;
            Statics.field1029 = var16;
            Statics.field1820 = var17;
            Statics.field1311 = var18;
            Statics.field1821 = 255;
            Statics.field2356 = false;
            Statics.field2355 = 2;
        }
        class154.method555(false);
        Statics.field308 = true;
        Statics.field1756.method1718(0, 0);
        Statics.field1287.method1718(382, 0);
        Statics.field1232.method1795(382 - Statics.field1232.field1489 / 2, 18);
    }

    @ObfuscatedName("cb.h(I)V")
    public static void method1707() {
        if (!Statics.field308) {
            return;
        }
        Statics.field2727 = null;
        Statics.field302 = null;
        Statics.field1285 = null;
        Statics.field1756 = null;
        Statics.field1287 = null;
        Statics.field1232 = null;
        Statics.field1277 = null;
        Statics.field1255 = null;
        Statics.field1230 = null;
        Statics.field1926 = null;
        Statics.field1446 = null;
        Statics.field13 = null;
        Statics.field190 = null;
        Statics.field955 = null;
        Statics.field2726 = null;
        Statics.field1629 = null;
        Statics.field317 = null;
        Statics.field6 = null;
        Statics.field309 = null;
        Statics.field2081 = null;
        class139.method799(2);
        class154.method555(true);
        Statics.field308 = false;
    }

    @ObfuscatedName("aq.y(Lbx;I)V")
    public static void method797(class73 arg0) {
        if (field314) {
            method46(arg0);
            return;
        }
        if (class77.field1394 == 1 && class77.field1400 >= 715 && class77.field1404 >= 453) {
            Statics.field29.field183 = !Statics.field29.field183;
            class29 var1 = null;
            try {
                var1 = class82.method1392("", Statics.field660.field2091, true);
                class127 var2 = Statics.field29.method128();
                var1.method561(var2.field2033, 0, var2.field2029);
            } catch (Exception var31) {
            }
            try {
                if (var1 != null) {
                    var1.method559();
                }
            } catch (Exception var30) {
            }
            if (Statics.field29.field183) {
                Statics.field2815.method2909();
                class139.field2353 = 1;
                Statics.field1029 = null;
            } else {
                class155 var5 = Statics.field244;
                int var6 = var5.method3063("scape main");
                int var7 = var5.method3114(var6, "");
                class139.method2150(var5, var6, var7, 255, false);
            }
        }
        if (client.field474 == 5) {
            return;
        }
        field312++;
        if (client.field474 != 10) {
            return;
        }
        if (client.field472 == 0) {
            if (class77.field1394 == 1) {
                byte var8 = 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class77.field1400 >= var8 && class77.field1400 <= var8 + var10 && class77.field1404 >= var9 && class77.field1404 <= var9 + var11) {
                    method126();
                    return;
                }
            }
            if (Statics.field1227 != null) {
                method126();
            }
        }
        int var12 = class77.field1394;
        int var13 = class77.field1400;
        int var14 = class77.field1404;
        if (field324 == 0) {
            short var15 = 302;
            short var16 = 291;
            if (var12 == 1 && var13 >= var15 - 75 && var13 <= var15 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                field324 = 3;
                field307 = 0;
            }
            short var17 = 462;
            if (var12 == 1 && var13 >= var17 - 75 && var13 <= var17 + 75 && var14 >= var16 - 20 && var14 <= var16 + 20) {
                field305 = class135.field2300;
                field318 = class135.field2301;
                field319 = class135.field2123;
                field324 = 2;
                field307 = 0;
            }
        } else if (field324 == 2) {
            short var18 = 231;
            int var32 = var18 + 30;
            if (var12 == 1 && var14 >= var32 - 15 && var14 < var32) {
                field307 = 0;
            }
            var32 += 15;
            if (var12 == 1 && var14 >= var32 - 15 && var14 < var32) {
                field307 = 1;
            }
            var32 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field329 = field329.trim();
                if (field329.length() == 0) {
                    method228(class135.field2210, class135.field2193, class135.field2166);
                    return;
                }
                if (field306.length() == 0) {
                    method228(class135.field2213, class135.field2214, class135.field2215);
                    return;
                }
                method228(class135.field2289, class135.field2118, class135.field2305);
                client.method176(20);
                return;
            }
            short var21 = 462;
            if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field324 = 0;
                field329 = "";
                field306 = "";
            }
            while (true) {
                while (true) {
                    class75 var22 = class75.field1360;
                    boolean var23;
                    synchronized (class75.field1360) {
                        if (class75.field1376 == class75.field1374) {
                            var23 = false;
                        } else {
                            Statics.field2045 = class75.field1371[class75.field1374];
                            Statics.field1848 = class75.field1375[class75.field1374];
                            class75.field1374 = class75.field1374 + 1 & 0x7F;
                            var23 = true;
                        }
                    }
                    if (!var23) {
                        return;
                    }
                    boolean var25 = false;
                    for (int var26 = 0; var26 < field323.length(); var26++) {
                        if (Statics.field1848 == field323.charAt(var26)) {
                            var25 = true;
                            break;
                        }
                    }
                    if (field307 == 0) {
                        if (Statics.field2045 == 85 && field329.length() > 0) {
                            field329 = field329.substring(0, field329.length() - 1);
                        }
                        if (Statics.field2045 == 84 || Statics.field2045 == 80) {
                            field307 = 1;
                        }
                        if (var25 && field329.length() < 320) {
                            field329 = field329 + Statics.field1848;
                        }
                    } else if (field307 == 1) {
                        if (Statics.field2045 == 85 && field306.length() > 0) {
                            field306 = field306.substring(0, field306.length() - 1);
                        }
                        if (Statics.field2045 == 84 || Statics.field2045 == 80) {
                            field307 = 0;
                        }
                        if (Statics.field2045 == 84) {
                            field329 = field329.trim();
                            if (field329.length() == 0) {
                                method228(class135.field2210, class135.field2193, class135.field2166);
                                return;
                            }
                            if (field306.length() == 0) {
                                method228(class135.field2213, class135.field2214, class135.field2215);
                                return;
                            }
                            method228(class135.field2289, class135.field2118, class135.field2305);
                            client.method176(20);
                            return;
                        }
                        if (var25 && field306.length() < 20) {
                            field306 = field306 + Statics.field1848;
                        }
                    }
                }
            }
        } else if (field324 == 3) {
            short var27 = 382;
            short var28 = 321;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var28 - 20 && var14 <= var28 + 20) {
                field324 = 0;
            }
        }
    }

    @ObfuscatedName("g.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method228(String arg0, String arg1, String arg2) {
        field305 = arg0;
        field318 = arg1;
        field319 = arg2;
    }

    @ObfuscatedName("y.f(Lcw;I)V")
    public static final void method44(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field317.length; var2++) {
            Statics.field317[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field317[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field6[var8] = (Statics.field317[var8 - 1] + Statics.field317[var8 + 1] + Statics.field317[var8 - 128] + Statics.field317[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field317;
            Statics.field317 = Statics.field6;
            Statics.field6 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1490; var11++) {
            for (int var12 = 0; var12 < arg0.field1489; var12++) {
                if (arg0.field1491[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1494;
                    int var14 = var11 + 16 + arg0.field1492;
                    int var15 = (var14 << 7) + var13;
                    Statics.field317[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ac.n(II)V")
    public static final void method915(int arg0) {
        short var1 = 256;
        field310 += arg0 * 128;
        if (field310 > Statics.field317.length) {
            field310 -= Statics.field317.length;
            int var2 = (int) (Math.random() * 12.0D);
            method44(Statics.field1285[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field309[var3 + var4] - Statics.field317[field310 + var3 & Statics.field317.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field309[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field309[var9 + var10] = 255;
                } else {
                    Statics.field309[var9 + var10] = 0;
                }
            }
        }
        if (field320 > 0) {
            field320 -= arg0 * 4;
        }
        if (field316 > 0) {
            field316 -= arg0 * 4;
        }
        if (field320 == 0 && field316 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field320 = 1024;
            }
            if (var12 == 1) {
                field316 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field304[var13] = field304[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field304[var14] = (int) (Math.sin((double) field321 / 14.0D) * 16.0D + Math.sin((double) field321 / 15.0D) * 14.0D + Math.sin((double) field321 / 16.0D) * 12.0D);
            field321++;
        }
        field311 += arg0 * 1134126199;
        int var15 = ((client.field476 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field311 * 1129500604; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field309[(var18 << 7) + var17] = 192;
        }
        field311 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field309[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field309[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2081[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2081[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2081[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field309[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bx.k(IIIB)I")
    public static final int method1512(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("i.q(B)V")
    public static final void method164() {
        short var0 = 256;
        if (field320 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field320 > 768) {
                    Statics.field1629[var1] = method1512(Statics.field190[var1], Statics.field955[var1], 1024 - field320);
                } else if (field320 > 256) {
                    Statics.field1629[var1] = Statics.field955[var1];
                } else {
                    Statics.field1629[var1] = method1512(Statics.field955[var1], Statics.field190[var1], 256 - field320);
                }
            }
        } else if (field316 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field316 > 768) {
                    Statics.field1629[var2] = method1512(Statics.field190[var2], Statics.field2726[var2], 1024 - field316);
                } else if (field316 > 256) {
                    Statics.field1629[var2] = Statics.field2726[var2];
                } else {
                    Statics.field1629[var2] = method1512(Statics.field2726[var2], Statics.field190[var2], 256 - field316);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1629[var3] = Statics.field190[var3];
            }
        }
        class89.method1819(0, 9, 128, var0 + 7);
        Statics.field1756.method1718(0, 0);
        class89.method1809();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field304[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field309[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1629[var10];
                    int var14 = Statics.field1469.field1474[var5];
                    Statics.field1469.field1474[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1819(637, 9, 765, var0 + 7);
        Statics.field1287.method1718(382, 0);
        class89.method1809();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field304[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field309[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1629[var22];
                    int var26 = Statics.field1469.field1474[var20];
                    Statics.field1469.field1474[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("am.w(Lgs;Lgs;B)V")
    public static void method566(class183 arg0, class183 arg1) {
        if (Statics.field1255 == null) {
            Statics.field1255 = class84.method693(Statics.field497, "sl_back", "");
        }
        if (Statics.field1230 == null) {
            Statics.field1230 = class84.method1513(Statics.field497, "sl_flags", "");
        }
        if (Statics.field1926 == null) {
            Statics.field1926 = class84.method1513(Statics.field497, "sl_arrows", "");
        }
        if (Statics.field1446 == null) {
            Statics.field1446 = class84.method1513(Statics.field497, "sl_stars", "");
        }
        class89.method1816(0, 23, 765, 480, 0);
        class89.method1817(0, 0, 125, 23, 12425273, 9135624);
        class89.method1817(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3407(class135.field2318, 62, 15, 0, -1);
        if (Statics.field1446 != null) {
            Statics.field1446[1].method1795(140, 1);
            arg1.method3405(class135.field2271, 152, 10, 16777215, -1);
            Statics.field1446[0].method1795(140, 12);
            arg1.method3405(class135.field2253, 152, 21, 16777215, -1);
        }
        if (Statics.field1926 != null) {
            short var2 = 280;
            if (field326[0] == 0 && field327[0] == 0) {
                Statics.field1926[2].method1795(var2, 4);
            } else {
                Statics.field1926[0].method1795(var2, 4);
            }
            if (field326[0] == 0 && field327[0] == 1) {
                Statics.field1926[3].method1795(var2 + 15, 4);
            } else {
                Statics.field1926[1].method1795(var2 + 15, 4);
            }
            arg0.method3405(class135.field2284, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field326[0] == 1 && field327[0] == 0) {
                Statics.field1926[2].method1795(var3, 4);
            } else {
                Statics.field1926[0].method1795(var3, 4);
            }
            if (field326[0] == 1 && field327[0] == 1) {
                Statics.field1926[3].method1795(var3 + 15, 4);
            } else {
                Statics.field1926[1].method1795(var3 + 15, 4);
            }
            arg0.method3405(class135.field2326, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field326[0] == 2 && field327[0] == 0) {
                Statics.field1926[2].method1795(var4, 4);
            } else {
                Statics.field1926[0].method1795(var4, 4);
            }
            if (field326[0] == 2 && field327[0] == 1) {
                Statics.field1926[3].method1795(var4 + 15, 4);
            } else {
                Statics.field1926[1].method1795(var4 + 15, 4);
            }
            arg0.method3405(class135.field2220, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field326[0] == 3 && field327[0] == 0) {
                Statics.field1926[2].method1795(var5, 4);
            } else {
                Statics.field1926[0].method1795(var5, 4);
            }
            if (field326[0] == 3 && field327[0] == 1) {
                Statics.field1926[3].method1795(var5 + 15, 4);
            } else {
                Statics.field1926[1].method1795(var5 + 15, 4);
            }
            arg0.method3405(class135.field2321, var5 + 32, 17, 16777215, -1);
        }
        class89.method1816(708, 4, 50, 16, 0);
        arg1.method3407(class135.field2262, 733, 16, 16777215, -1);
        field328 = -1;
        if (Statics.field1255 != null) {
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
                class13 var21 = Statics.field1627[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field192);
                if (var21.field192 == -1) {
                    var23 = class135.field2325;
                    var22 = false;
                } else if (var21.field192 > 1980) {
                    var23 = class135.field2129;
                    var22 = false;
                }
                byte var24;
                if (var21.field198) {
                    if (var21.field197) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.field197) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class77.field1396 >= var17 && class77.field1397 >= var16 && class77.field1396 < var6 + var17 && class77.field1397 < var7 + var16 && var22) {
                    field328 = var20;
                    Statics.field1255[var24].method1724(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1255[var24].method1718(var17, var16);
                }
                if (Statics.field1230 != null) {
                    Statics.field1230[var21.field195 + (var21.field197 ? 8 : 0)].method1795(var17 + 29, var16);
                }
                arg0.method3407(Integer.toString(var21.field201), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3407(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3400(Statics.field1627[field328].field194) + 6;
                int var26 = arg1.field2832 + 8;
                class89.method1816(class77.field1396 - var25 / 2, class77.field1397 + 20 + 5, var25, var26, 16777120);
                class89.method1818(class77.field1396 - var25 / 2, class77.field1397 + 20 + 5, var25, var26, 0);
                arg1.method3407(Statics.field1627[field328].field194, class77.field1396, class77.field1397 + 20 + 5 + arg1.field2832 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field351.getGraphics();
            Statics.field1469.method1625(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field351.repaint();
        }
    }

    @ObfuscatedName("j.v(Lbx;I)V")
    public static void method46(class73 arg0) {
        if (class77.field1394 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1400 >= var1 && class77.field1400 <= var1 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(0, 0);
            return;
        }
        if (class77.field1400 >= var1 + 15 && class77.field1400 <= var1 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1400 >= var2 && class77.field1400 <= var2 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(1, 0);
            return;
        }
        if (class77.field1400 >= var2 + 15 && class77.field1400 <= var2 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1400 >= var3 && class77.field1400 <= var3 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(2, 0);
            return;
        }
        if (class77.field1400 >= var3 + 15 && class77.field1400 <= var3 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1400 >= var4 && class77.field1400 <= var4 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(3, 0);
            return;
        }
        if (class77.field1400 >= var4 + 15 && class77.field1400 <= var4 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method182(3, 1);
            return;
        }
        if (class77.field1400 >= 708 && class77.field1404 >= 4 && class77.field1400 <= 758 && class77.field1404 <= 20) {
            field314 = false;
            Statics.field1756.method1718(0, 0);
            Statics.field1287.method1718(382, 0);
            Statics.field1232.method1795(382 - Statics.field1232.field1489 / 2, 18);
            return;
        }
        if (field328 == -1) {
            return;
        }
        class13 var5 = Statics.field1627[field328];
        if (client.field636 != var5.field197) {
            client.field636 = var5.field197;
            class40.method239(var5.field197);
        }
        Statics.field1267 = var5.field193;
        client.field635 = var5.field201;
        Statics.field1792 = client.field467 == 0 ? 43594 : var5.field201 + 40000;
        Statics.field300 = client.field467 == 0 ? 443 : var5.field201 + 50000;
        Statics.field1816 = Statics.field1792;
        field314 = false;
        Statics.field1756.method1718(0, 0);
        Statics.field1287.method1718(382, 0);
        Statics.field1232.method1795(382 - Statics.field1232.field1489 / 2, 18);
        return;
    }

    @ObfuscatedName("q.z(I)V")
    public static void method126() {
        try {
            if (Statics.field1227 == null) {
                Statics.field1227 = new class24(Statics.field441, new URL(Statics.field473));
            } else {
                byte[] var0 = Statics.field1227.method230();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field325 = var1.method2496();
                    Statics.field1627 = new class13[field325];
                    int var2 = 0;
                    while (var2 < field325) {
                        class13 var3 = Statics.field1627[var2] = new class13();
                        int var4 = var1.method2496();
                        var3.field201 = var4 & 0x3FFF;
                        var3.field197 = (var4 & 0x8000) != 0;
                        var3.field198 = (var4 & 0x4000) != 0;
                        var3.field193 = var1.method2502();
                        var3.field194 = var1.method2502();
                        var3.field195 = var1.method2494();
                        var3.field192 = var1.method2582();
                        var3.field196 = var2++;
                    }
                    method845(Statics.field1627, 0, Statics.field1627.length - 1, field326, field327);
                    field314 = true;
                    Statics.field1227 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1227 = null;
        }
    }

    @ObfuscatedName("s.m(IIB)V")
    public static void method182(int arg0, int arg1) {
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
        method845(Statics.field1627, 0, Statics.field1627.length - 1, field326, field327);
    }

    @ObfuscatedName("ar.r([Lv;II[I[II)V")
    public static void method845(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field196;
                        var12 = var8.field196;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field192;
                        var12 = var8.field192;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field197 ? 1 : 0;
                        var12 = var8.field197 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field201;
                        var12 = var8.field201;
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
                        var15 = arg0[var5].field196;
                        var16 = var8.field196;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field192;
                        var16 = var8.field192;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field197 ? 1 : 0;
                        var16 = var8.field197 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field201;
                        var16 = var8.field201;
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
        method845(arg0, arg1, var6, arg3, arg4);
        method845(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
