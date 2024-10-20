package deob;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("h")
public class class21 {

    @ObfuscatedName("h.c")
    public static boolean field302 = false;

    @ObfuscatedName("h.u")
    public static int[] field306 = new int[256];

    @ObfuscatedName("h.j")
    public static int field309 = 0;

    @ObfuscatedName("h.h")
    public static int field299 = 0;

    @ObfuscatedName("h.z")
    public static int field312 = 0;

    @ObfuscatedName("h.at")
    public static int field324 = 0;

    @ObfuscatedName("h.ay")
    public static int field314 = 0;

    @ObfuscatedName("h.ae")
    public static int field315 = 0;

    @ObfuscatedName("h.af")
    public static int field316 = 10;

    @ObfuscatedName("h.ao")
    public static String field317 = "";

    @ObfuscatedName("h.ad")
    public static int field318 = 0;

    @ObfuscatedName("h.aj")
    public static String field326 = "";

    @ObfuscatedName("h.ah")
    public static String field320 = "";

    @ObfuscatedName("h.aq")
    public static String field321 = "";

    @ObfuscatedName("h.ar")
    public static String field333 = "";

    @ObfuscatedName("h.aa")
    public static String field323 = "";

    @ObfuscatedName("h.an")
    public static int field296 = 0;

    @ObfuscatedName("h.ab")
    public static String field325 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("h.ac")
    public static boolean field304 = false;

    @ObfuscatedName("h.aw")
    public static int field328 = 0;

    @ObfuscatedName("h.bs")
    public static int[] field329 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("h.be")
    public static int[] field330 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("h.ba")
    public static int field331 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.p(Ljava/awt/Component;Lep;Lep;I)V")
    public static void method241(Component arg0, class152 arg1, class152 arg2) {
        if (Statics.field313) {
            return;
        }
        class89.method1857();
        byte[] var3 = arg1.method3015("title.jpg", "");
        Statics.field298 = new class86(var3, arg0);
        Statics.field303 = Statics.field298.method1782();
        Statics.field305 = class84.method206(arg2, "logo", "");
        Statics.field322 = class84.method206(arg2, "titlebox", "");
        Statics.field2028 = class84.method206(arg2, "titlebutton", "");
        Statics.field297 = class84.method300(arg2, "runes", "");
        Statics.field301 = class84.method300(arg2, "title_mute", "");
        Statics.field954 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field954[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field954[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field954[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field954[var7 + 192] = 16777215;
        }
        Statics.field308 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field308[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field308[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field308[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field308[var11 + 192] = 16777215;
        }
        Statics.field1673 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1673[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1673[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1673[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1673[var15 + 192] = 16777215;
        }
        Statics.field307 = new int[256];
        Statics.field311 = new int[32768];
        Statics.field2792 = new int[32768];
        method1305((class87) null);
        Statics.field82 = new int[32768];
        Statics.field873 = new int[32768];
        field318 = 0;
        field333 = "";
        field323 = "";
        field304 = false;
        if (client.field617 == 0) {
            field302 = true;
        } else {
            field302 = false;
        }
        if (field302) {
            class138.field2347 = 1;
            Statics.field746 = null;
            Statics.field108 = -1;
            Statics.field264 = -1;
            Statics.field2346 = 0;
            Statics.field1628 = false;
            Statics.field874 = 2;
        } else {
            class138.method1623(2, Statics.field1211, "scape main", "", 255, false);
        }
        if (Statics.field2526 != null) {
            try {
                class127 var16 = new class127(4);
                var16.method2474(3);
                var16.method2476(0);
                Statics.field2526.method1414(var16.field2037, 0, 4);
            } catch (IOException var20) {
                try {
                    Statics.field2526.method1410();
                } catch (Exception var19) {
                }
                class153.field2525++;
                Statics.field2526 = null;
            }
        }
        Statics.field313 = true;
        Statics.field298.method1729(0, 0);
        Statics.field303.method1729(382, 0);
        Statics.field305.method1830(382 - Statics.field305.field1485 / 2, 18);
    }

    @ObfuscatedName("ab.i(B)V")
    public static void method854() {
        if (!Statics.field313) {
            return;
        }
        Statics.field322 = null;
        Statics.field2028 = null;
        Statics.field297 = null;
        Statics.field298 = null;
        Statics.field303 = null;
        Statics.field305 = null;
        Statics.field301 = null;
        Statics.field327 = null;
        Statics.field2017 = null;
        Statics.field176 = null;
        Statics.field2457 = null;
        Statics.field350 = null;
        Statics.field954 = null;
        Statics.field308 = null;
        Statics.field1673 = null;
        Statics.field307 = null;
        Statics.field311 = null;
        Statics.field2792 = null;
        Statics.field82 = null;
        Statics.field873 = null;
        class138.field2347 = 1;
        Statics.field746 = null;
        Statics.field108 = -1;
        Statics.field264 = -1;
        Statics.field2346 = 0;
        Statics.field1628 = false;
        Statics.field874 = 2;
        if (Statics.field2526 != null) {
            try {
                class127 var0 = new class127(4);
                var0.method2474(2);
                var0.method2476(0);
                Statics.field2526.method1414(var0.field2037, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field2526.method1410();
                } catch (Exception var3) {
                }
                class153.field2525++;
                Statics.field2526 = null;
            }
        }
        Statics.field313 = false;
    }

    @ObfuscatedName("da.o(Lbt;B)V")
    public static void method2350(class73 arg0) {
        if (field304) {
            method61(arg0);
            return;
        }
        if (class77.field1402 == 1 && class77.field1395 >= 715 && class77.field1404 >= 453) {
            field302 = !field302;
            if (field302) {
                Statics.field2341.method2773();
                class138.field2347 = 1;
                Statics.field746 = null;
            } else {
                class138.method2071(Statics.field1211, "scape main", "", 255, false);
            }
        }
        if (client.field479 == 5) {
            return;
        }
        field314++;
        if (client.field479 != 10) {
            return;
        }
        if (client.field478 == 0) {
            if (class77.field1402 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class77.field1395 >= var1 && class77.field1395 <= var1 + var3 && class77.field1404 >= var2 && class77.field1404 <= var2 + var4) {
                    method831();
                    return;
                }
            }
            if (Statics.field1264 != null) {
                method831();
            }
        }
        int var5 = class77.field1402;
        int var6 = class77.field1395;
        int var7 = class77.field1404;
        if (field318 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field318 = 3;
                field296 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field326 = class134.field2290;
                field320 = class134.field2291;
                field321 = class134.field2175;
                field318 = 2;
                field296 = 0;
            }
        } else if (field318 == 2) {
            short var11 = 231;
            int var19 = var11 + 30;
            if (var5 == 1 && var7 >= var19 - 15 && var7 < var19) {
                field296 = 0;
            }
            var19 += 15;
            if (var5 == 1 && var7 >= var19 - 15 && var7 < var19) {
                field296 = 1;
            }
            var19 += 15;
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field333 = field333.trim();
                if (field333.length() == 0) {
                    method2263(class134.field2200, class134.field2302, class134.field2202);
                    return;
                }
                if (field323.length() == 0) {
                    method2263(class134.field2203, class134.field2204, class134.field2205);
                    return;
                }
                method2263(class134.field2136, class134.field2207, class134.field2295);
                client.method22(20);
                return;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field318 = 0;
                field333 = "";
                field323 = "";
            }
            while (true) {
                while (class75.method2730()) {
                    boolean var15 = false;
                    for (int var16 = 0; var16 < field325.length(); var16++) {
                        if (Statics.field384 == field325.charAt(var16)) {
                            var15 = true;
                            break;
                        }
                    }
                    if (field296 == 0) {
                        if (Statics.field1178 == 85 && field333.length() > 0) {
                            field333 = field333.substring(0, field333.length() - 1);
                        }
                        if (Statics.field1178 == 84 || Statics.field1178 == 80) {
                            field296 = 1;
                        }
                        if (var15 && field333.length() < 320) {
                            field333 = field333 + Statics.field384;
                        }
                    } else if (field296 == 1) {
                        if (Statics.field1178 == 85 && field323.length() > 0) {
                            field323 = field323.substring(0, field323.length() - 1);
                        }
                        if (Statics.field1178 == 84 || Statics.field1178 == 80) {
                            field296 = 0;
                        }
                        if (Statics.field1178 == 84) {
                            field333 = field333.trim();
                            if (field333.length() == 0) {
                                method2263(class134.field2200, class134.field2302, class134.field2202);
                                return;
                            }
                            if (field323.length() == 0) {
                                method2263(class134.field2203, class134.field2204, class134.field2205);
                                return;
                            }
                            method2263(class134.field2136, class134.field2207, class134.field2295);
                            client.method22(20);
                            return;
                        }
                        if (var15 && field323.length() < 20) {
                            field323 = field323 + Statics.field384;
                        }
                    }
                }
                return;
            }
        } else if (field318 == 3) {
            short var17 = 382;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field318 = 0;
            }
        }
    }

    @ObfuscatedName("do.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2263(String arg0, String arg1, String arg2) {
        field326 = arg0;
        field320 = arg1;
        field321 = arg2;
    }

    @ObfuscatedName("bb.v(Lcu;I)V")
    public static final void method1305(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field311.length; var2++) {
            Statics.field311[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field311[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2792[var8] = (Statics.field311[var8 - 1] + Statics.field311[var8 + 1] + Statics.field311[var8 - 128] + Statics.field311[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field311;
            Statics.field311 = Statics.field2792;
            Statics.field2792 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1481; var11++) {
            for (int var12 = 0; var12 < arg0.field1485; var12++) {
                if (arg0.field1487[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1484;
                    int var14 = var11 + 16 + arg0.field1486;
                    int var15 = (var14 << 7) + var13;
                    Statics.field311[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ai.g(IIII)I")
    public static final int method887(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ak.x(I)V")
    public static final void method922() {
        short var0 = 256;
        if (field309 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field309 > 768) {
                    Statics.field307[var1] = method887(Statics.field954[var1], Statics.field308[var1], 1024 - field309);
                } else if (field309 > 256) {
                    Statics.field307[var1] = Statics.field308[var1];
                } else {
                    Statics.field307[var1] = method887(Statics.field308[var1], Statics.field954[var1], 256 - field309);
                }
            }
        } else if (field299 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field299 > 768) {
                    Statics.field307[var2] = method887(Statics.field954[var2], Statics.field1673[var2], 1024 - field299);
                } else if (field299 > 256) {
                    Statics.field307[var2] = Statics.field1673[var2];
                } else {
                    Statics.field307[var2] = method887(Statics.field1673[var2], Statics.field954[var2], 256 - field299);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field307[var3] = Statics.field954[var3];
            }
        }
        class89.method1841(0, 9, 128, var0 + 7);
        Statics.field298.method1729(0, 0);
        class89.method1838();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field306[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field82[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field307[var10];
                    int var14 = Statics.field1381.field1463[var5];
                    Statics.field1381.field1463[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class89.method1841(637, 9, 765, var0 + 7);
        Statics.field303.method1729(382, 0);
        class89.method1838();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field306[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field82[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field307[var22];
                    int var26 = Statics.field1381.field1463[var20];
                    Statics.field1381.field1463[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("x.c(Lbt;I)V")
    public static void method61(class73 arg0) {
        if (class77.field1402 != 1) {
            return;
        }
        short var1 = 280;
        if (class77.field1395 >= var1 && class77.field1395 <= var1 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(0, 0);
            return;
        }
        if (class77.field1395 >= var1 + 15 && class77.field1395 <= var1 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(0, 1);
            return;
        }
        short var2 = 390;
        if (class77.field1395 >= var2 && class77.field1395 <= var2 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(1, 0);
            return;
        }
        if (class77.field1395 >= var2 + 15 && class77.field1395 <= var2 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(1, 1);
            return;
        }
        short var3 = 500;
        if (class77.field1395 >= var3 && class77.field1395 <= var3 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(2, 0);
            return;
        }
        if (class77.field1395 >= var3 + 15 && class77.field1395 <= var3 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(2, 1);
            return;
        }
        short var4 = 610;
        if (class77.field1395 >= var4 && class77.field1395 <= var4 + 14 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(3, 0);
            return;
        }
        if (class77.field1395 >= var4 + 15 && class77.field1395 <= var4 + 80 && class77.field1404 >= 4 && class77.field1404 <= 18) {
            method19(3, 1);
            return;
        }
        if (class77.field1395 >= 708 && class77.field1404 >= 4 && class77.field1395 <= 758 && class77.field1404 <= 20) {
            field304 = false;
            Statics.field298.method1729(0, 0);
            Statics.field303.method1729(382, 0);
            Statics.field305.method1830(382 - Statics.field305.field1485 / 2, 18);
            return;
        }
        if (field331 == -1) {
            return;
        }
        class13 var5 = Statics.field10[field331];
        if (client.field476 != var5.field194) {
            client.field476 = var5.field194;
            boolean var6 = var5.field194;
            if (Statics.field987 != var6) {
                class40.method813();
                Statics.field987 = var6;
            }
        }
        Statics.field1238 = var5.field200;
        client.field563 = var5.field202;
        Statics.field1424 = client.field669 == 0 ? 43594 : var5.field202 + 40000;
        Statics.field408 = client.field669 == 0 ? 443 : var5.field202 + 50000;
        Statics.field1797 = Statics.field1424;
        field304 = false;
        Statics.field298.method1729(0, 0);
        Statics.field303.method1729(382, 0);
        Statics.field305.method1830(382 - Statics.field305.field1485 / 2, 18);
        return;
    }

    @ObfuscatedName("aa.f(I)V")
    public static void method831() {
        try {
            if (Statics.field1264 == null) {
                Statics.field1264 = new class24(Statics.field895, new URL(Statics.field13));
            } else {
                byte[] var0 = Statics.field1264.method220();
                if (var0 != null) {
                    class127 var1 = new class127(var0);
                    field328 = var1.method2652();
                    Statics.field10 = new class13[field328];
                    int var2 = 0;
                    while (var2 < field328) {
                        class13 var3 = Statics.field10[var2] = new class13();
                        int var4 = var1.method2652();
                        var3.field202 = var4 & 0x7FFF;
                        var3.field194 = (var4 & 0x8000) != 0;
                        var3.field200 = var1.method2490();
                        var3.field191 = var1.method2490();
                        var3.field192 = var1.method2659();
                        var3.field190 = var1.method2588();
                        var3.field193 = var2++;
                    }
                    Statics.method41(Statics.field10, 0, Statics.field10.length - 1, field329, field330);
                    field304 = true;
                    Statics.field1264 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1264 = null;
        }
    }

    @ObfuscatedName("i.r(IIB)V")
    public static void method19(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field329[var5] != arg0) {
                var2[var4] = field329[var5];
                var3[var4] = field330[var5];
                var4++;
            }
        }
        field329 = var2;
        field330 = var3;
        Statics.method41(Statics.field10, 0, Statics.field10.length - 1, field329, field330);
    }
}
