package deob;

import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ah")
public class class30 {

    @ObfuscatedName("ah.b")
    public static int field665 = 0;

    @ObfuscatedName("ah.u")
    public static int field695 = field665 + 202;

    @ObfuscatedName("ah.k")
    public static int[] field670 = new int[256];

    @ObfuscatedName("ah.m")
    public static int field671 = 0;

    @ObfuscatedName("ah.y")
    public static int field672 = 0;

    @ObfuscatedName("ah.ap")
    public static int field673 = 0;

    @ObfuscatedName("ah.ah")
    public static int field675 = 0;

    @ObfuscatedName("ah.ae")
    public static int field693 = 0;

    @ObfuscatedName("ah.ag")
    public static int field689 = 0;

    @ObfuscatedName("ah.as")
    public static int field677 = 10;

    @ObfuscatedName("ah.at")
    public static String field678 = "";

    @ObfuscatedName("ah.aw")
    public static int field669 = 0;

    @ObfuscatedName("ah.ay")
    public static String field680 = "";

    @ObfuscatedName("ah.ao")
    public static String field681 = "";

    @ObfuscatedName("ah.al")
    public static String field682 = "";

    @ObfuscatedName("ah.ab")
    public static String field664 = "";

    @ObfuscatedName("ah.aj")
    public static String field684 = "";

    @ObfuscatedName("ah.ak")
    public static class150 field685 = class150.field2474;

    @ObfuscatedName("ah.ax")
    public static boolean field686 = true;

    @ObfuscatedName("ah.az")
    public static int field687 = 0;

    @ObfuscatedName("ah.aq")
    public static String field688 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.ad")
    public static String field683 = "1234567890";

    @ObfuscatedName("ah.aa")
    public static boolean field679 = false;

    @ObfuscatedName("ah.bs")
    public static int field692 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.t(I)I")
    public static int method779() {
        return 8;
    }

    @ObfuscatedName("ao.p(Lez;I)V")
    public static void method712(class136 arg0) {
        if (!field679) {
            if ((class132.field2033 == 1 || !Statics.field87 && class132.field2033 == 4) && class132.field2034 >= field665 + 765 - 50 && class132.field2035 >= 453) {
                Statics.field2092.field125 = !Statics.field2092.field125;
                class9.method2116();
                if (Statics.field2092.field125) {
                    Statics.field2525.method3217();
                    class174.field2850 = 1;
                    Statics.field2852 = null;
                } else {
                    class174.method1417(Statics.field535, "scape main", "", 255, false);
                }
            }
            if (client.field371 != 5) {
                field693++;
                if (client.field371 == 10 || client.field371 == 11) {
                    if (client.field252 == 0) {
                        if (class132.field2033 == 1 || !Statics.field87 && class132.field2033 == 4) {
                            int var6 = field665 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class132.field2034 >= var6 && class132.field2034 <= var6 + var8 && class132.field2035 >= var7 && class132.field2035 <= var7 + var9) {
                                if (class24.method162()) {
                                    field679 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field579 != null && class24.method162()) {
                            field679 = true;
                        }
                    }
                    int var10 = class132.field2033;
                    int var11 = class132.field2034;
                    int var12 = class132.field2035;
                    if (!Statics.field87 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field669 == 0) {
                        int var13 = field695 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class130.method3544(client.method112("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field695 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field364 & 0x4) != 0) {
                                if ((client.field364 & 0x400) == 0) {
                                    field680 = class148.field2402;
                                    field681 = class148.field2375;
                                    field682 = class148.field2260;
                                } else {
                                    field680 = class148.field2408;
                                    field681 = class148.field2409;
                                    field682 = class148.field2410;
                                }
                                field669 = 1;
                                field687 = 0;
                            } else if ((client.field364 & 0x400) == 0) {
                                field680 = class148.field2398;
                                field681 = class148.field2399;
                                field682 = class148.field2400;
                                field669 = 2;
                                field687 = 0;
                            } else {
                                field680 = class148.field2405;
                                field681 = class148.field2406;
                                field682 = class148.field2407;
                                field669 = 1;
                                field687 = 0;
                            }
                        }
                    } else if (field669 == 1) {
                        while (class129.method1464()) {
                            if (Statics.field2005 == 84) {
                                field680 = class148.field2398;
                                field681 = class148.field2399;
                                field682 = class148.field2400;
                                field669 = 2;
                                field687 = 0;
                            } else if (Statics.field2005 == 13) {
                                field669 = 0;
                            }
                        }
                        int var16 = field695 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field680 = class148.field2398;
                            field681 = class148.field2399;
                            field682 = class148.field2400;
                            field669 = 2;
                            field687 = 0;
                        }
                        int var18 = field695 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field669 = 0;
                        }
                    } else if (field669 == 2) {
                        short var19 = 231;
                        int var37 = var19 + 30;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            field687 = 0;
                        }
                        var37 += 15;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            field687 = 1;
                        }
                        var37 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method755(class148.field2377, class148.field2265, class148.field2431);
                            field669 = 5;
                            return;
                        }
                        int var21 = field695 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field664 = field664.trim();
                            if (field664.length() == 0) {
                                method755(class148.field2304, class148.field2292, class148.field2306);
                                return;
                            }
                            if (field684.length() == 0) {
                                method755(class148.field2307, class148.field2308, class148.field2309);
                                return;
                            }
                            method755(class148.field2413, class148.field2414, class148.field2286);
                            field685 = Statics.field2092.field127.containsKey(class154.method2418(field664)) ? class150.field2473 : class150.field2474;
                            client.method125(20);
                            return;
                        }
                        int var23 = field695 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field669 = 0;
                            field664 = "";
                            field684 = "";
                            Statics.field1295 = 0;
                            Statics.field2470 = "";
                            field686 = true;
                        }
                        while (true) {
                            while (class129.method1464()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field688.length(); var25++) {
                                    if (Statics.field1445 == field688.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2005 == 13) {
                                    field669 = 0;
                                    field664 = "";
                                    field684 = "";
                                    Statics.field1295 = 0;
                                    Statics.field2470 = "";
                                    field686 = true;
                                } else if (field687 == 0) {
                                    if (Statics.field2005 == 85 && field664.length() > 0) {
                                        field664 = field664.substring(0, field664.length() - 1);
                                    }
                                    if (Statics.field2005 == 84 || Statics.field2005 == 80) {
                                        field687 = 1;
                                    }
                                    if (var24 && field664.length() < 320) {
                                        field664 = field664 + Statics.field1445;
                                    }
                                } else if (field687 == 1) {
                                    if (Statics.field2005 == 85 && field684.length() > 0) {
                                        field684 = field684.substring(0, field684.length() - 1);
                                    }
                                    if (Statics.field2005 == 84 || Statics.field2005 == 80) {
                                        field687 = 0;
                                    }
                                    if (Statics.field2005 == 84) {
                                        field664 = field664.trim();
                                        if (field664.length() == 0) {
                                            method755(class148.field2304, class148.field2292, class148.field2306);
                                            return;
                                        }
                                        if (field684.length() == 0) {
                                            method755(class148.field2307, class148.field2308, class148.field2309);
                                            return;
                                        }
                                        method755(class148.field2413, class148.field2414, class148.field2286);
                                        field685 = Statics.field2092.field127.containsKey(class154.method2418(field664)) ? class150.field2473 : class150.field2474;
                                        client.method125(20);
                                        return;
                                    }
                                    if (var24 && field684.length() < 20) {
                                        field684 = field684 + Statics.field1445;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field669 == 4) {
                        int var26 = field695 + 180 - 80;
                        short var27 = 321;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            Statics.field2470.trim();
                            if (Statics.field2470.length() != 6) {
                                method755(class148.field2220, class148.field2221, class148.field2222);
                                return;
                            }
                            Statics.field1295 = Integer.parseInt(Statics.field2470);
                            Statics.field2470 = "";
                            field685 = field686 ? class150.field2479 : class150.field2472;
                            method755(class148.field2413, class148.field2414, class148.field2286);
                            client.method125(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field695 + 180 - 9 && var11 <= field695 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field686 = !field686;
                        }
                        if (var10 == 1 && var11 >= field695 + 180 - 34 && var11 <= field695 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class130.method3544(client.method112("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var28 = field695 + 180 + 80;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field669 = 0;
                            field664 = "";
                            field684 = "";
                            Statics.field1295 = 0;
                            Statics.field2470 = "";
                        }
                        while (class129.method1464()) {
                            boolean var29 = false;
                            for (int var30 = 0; var30 < field683.length(); var30++) {
                                if (Statics.field1445 == field683.charAt(var30)) {
                                    var29 = true;
                                    break;
                                }
                            }
                            if (Statics.field2005 == 13) {
                                field669 = 0;
                                field664 = "";
                                field684 = "";
                                Statics.field1295 = 0;
                                Statics.field2470 = "";
                            } else {
                                if (Statics.field2005 == 85 && Statics.field2470.length() > 0) {
                                    Statics.field2470 = Statics.field2470.substring(0, Statics.field2470.length() - 1);
                                }
                                if (Statics.field2005 == 84) {
                                    Statics.field2470.trim();
                                    if (Statics.field2470.length() != 6) {
                                        method755(class148.field2220, class148.field2221, class148.field2222);
                                        return;
                                    }
                                    Statics.field1295 = Integer.parseInt(Statics.field2470);
                                    Statics.field2470 = "";
                                    field685 = field686 ? class150.field2479 : class150.field2472;
                                    method755(class148.field2413, class148.field2414, class148.field2286);
                                    client.method125(20);
                                    return;
                                }
                                if (var29 && Statics.field2470.length() < 6) {
                                    Statics.field2470 = Statics.field2470 + Statics.field1445;
                                }
                            }
                        }
                    } else if (field669 == 5) {
                        int var31 = field695 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            method2488();
                            return;
                        }
                        int var33 = field695 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field680 = class148.field2398;
                            field681 = class148.field2399;
                            field682 = class148.field2400;
                            field669 = 2;
                            field687 = 0;
                            field684 = "";
                        }
                        while (class129.method1464()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field688.length(); var35++) {
                                if (Statics.field1445 == field688.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field2005 == 13) {
                                field680 = class148.field2398;
                                field681 = class148.field2399;
                                field682 = class148.field2400;
                                field669 = 2;
                                field687 = 0;
                                field684 = "";
                            } else {
                                if (Statics.field2005 == 85 && field664.length() > 0) {
                                    field664 = field664.substring(0, field664.length() - 1);
                                }
                                if (Statics.field2005 == 84) {
                                    method2488();
                                    return;
                                }
                                if (var34 && field664.length() < 320) {
                                    field664 = field664 + Statics.field1445;
                                }
                            }
                        }
                    } else if (field669 == 6) {
                        while (true) {
                            do {
                                if (!class129.method1464()) {
                                    short var36 = 321;
                                    if (var10 == 1 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                                        field680 = class148.field2398;
                                        field681 = class148.field2399;
                                        field682 = class148.field2400;
                                        field669 = 2;
                                        field687 = 0;
                                        field684 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2005 != 84 && Statics.field2005 != 13);
                            field680 = class148.field2398;
                            field681 = class148.field2399;
                            field682 = class148.field2400;
                            field669 = 2;
                            field687 = 0;
                            field684 = "";
                        }
                    }
                }
            }
        } else if (class132.field2033 == 1 || !Statics.field87 && class132.field2033 == 4) {
            int var1 = field665 + 280;
            if (class132.field2034 >= var1 && class132.field2034 <= var1 + 14 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                class24.method138(0, 0);
            } else if (class132.field2034 >= var1 + 15 && class132.field2034 <= var1 + 80 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                class24.method138(0, 1);
            } else {
                int var2 = field665 + 390;
                if (class132.field2034 >= var2 && class132.field2034 <= var2 + 14 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                    class24.method138(1, 0);
                } else if (class132.field2034 >= var2 + 15 && class132.field2034 <= var2 + 80 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                    class24.method138(1, 1);
                } else {
                    int var3 = field665 + 500;
                    if (class132.field2034 >= var3 && class132.field2034 <= var3 + 14 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                        class24.method138(2, 0);
                    } else if (class132.field2034 >= var3 + 15 && class132.field2034 <= var3 + 80 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                        class24.method138(2, 1);
                    } else {
                        int var4 = field665 + 610;
                        if (class132.field2034 >= var4 && class132.field2034 <= var4 + 14 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                            class24.method138(3, 0);
                        } else if (class132.field2034 >= var4 + 15 && class132.field2034 <= var4 + 80 && class132.field2035 >= 4 && class132.field2035 <= 18) {
                            class24.method138(3, 1);
                        } else if (class132.field2034 >= field665 + 708 && class132.field2035 >= 4 && class132.field2034 <= field665 + 708 + 50 && class132.field2035 <= 20) {
                            field679 = false;
                            Statics.field667.method1486(field665, 0);
                            Statics.field668.method1486(field665 + 382, 0);
                            Statics.field1690.method1623(field665 + 382 - Statics.field1690.field1335 / 2, 18);
                        } else if (field692 != -1) {
                            class24 var5 = Statics.field587[field692];
                            method822(var5);
                            field679 = false;
                            Statics.field667.method1486(field665, 0);
                            Statics.field668.method1486(field665 + 382, 0);
                            Statics.field1690.method1623(field665 + 382 - Statics.field1690.field1335 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.e(I)V")
    public static void method2488() {
        field664 = field664.trim();
        if (field664.length() == 0) {
            method755(class148.field2377, class148.field2265, class148.field2431);
            return;
        }
        long var0 = class10.method756();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field664;
            Random var4 = new Random();
            class111 var5 = new class111(128);
            class111 var6 = new class111(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2158(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2174(var4.nextInt());
            }
            var5.method2174(var7[0]);
            var5.method2174(var7[1]);
            var5.method2224(var0);
            var5.method2224(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2174(var4.nextInt());
            }
            var5.method2365(class10.field139, class10.field140);
            var6.method2158(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2174(var4.nextInt());
            }
            var6.method2224(var4.nextLong());
            var6.method2161(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class141.field2118.method3735(0L);
                class141.field2118.method3736(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var39) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2166(var11, 0, 24);
            var6.method2224(var4.nextLong());
            var6.method2365(class10.field139, class10.field140);
            int var15 = class111.method1926(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class111 var16 = new class111(var15);
            var16.method2163(var3);
            var16.field1867 = var15;
            var16.method2188(var7);
            class111 var17 = new class111(var16.field1867 + var6.field1867 + var5.field1867 + 5);
            var17.method2158(2);
            var17.method2158(var5.field1867);
            var17.method2166(var5.field1869, 0, var5.field1867);
            var17.method2158(var6.field1867);
            var17.method2166(var6.field1869, 0, var6.field1867);
            var17.method2159(var16.field1867);
            var17.method2166(var16.field1869, 0, var16.field1867);
            byte[] var18 = var17.field1869;
            int var19 = var18.length;
            StringBuilder var20 = new StringBuilder();
            for (int var21 = 0; var21 < var19; var21 += 3) {
                int var22 = var18[var21] & 0xFF;
                var20.append(class152.field2520[var22 >>> 2]);
                if (var21 < var19 - 1) {
                    int var23 = var18[var21 + 1] & 0xFF;
                    var20.append(class152.field2520[(var22 & 0x3) << 4 | var23 >>> 4]);
                    if (var21 < var19 - 2) {
                        int var24 = var18[var21 + 2] & 0xFF;
                        var20.append(class152.field2520[(var23 & 0xF) << 2 | var24 >>> 6]).append(class152.field2520[var24 & 0x3F]);
                    } else {
                        var20.append(class152.field2520[(var23 & 0xF) << 2]).append("=");
                    }
                } else {
                    var20.append(class152.field2520[(var22 & 0x3) << 4]).append("==");
                }
            }
            String var25 = var20.toString();
            String var27 = var25;
            byte var34;
            try {
                URL var28 = new URL(client.method112("services", false) + "m=accountappeal/login.ws");
                URLConnection var29 = var28.openConnection();
                var29.setDoInput(true);
                var29.setDoOutput(true);
                var29.setConnectTimeout(5000);
                OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
                var30.write("data2=" + class217.method890(var27) + "&dest=" + class217.method890("passwordchoice.ws"));
                var30.flush();
                InputStream var31 = var29.getInputStream();
                class111 var32 = new class111(new byte[1000]);
                while (true) {
                    int var33 = var31.read(var32.field1869, var32.field1867, 1000 - var32.field1867);
                    if (var33 == -1) {
                        var30.close();
                        var31.close();
                        String var35 = new String(var32.field1869);
                        if (var35.startsWith("OFFLINE")) {
                            var34 = 4;
                        } else if (var35.startsWith("WRONG")) {
                            var34 = 7;
                        } else if (var35.startsWith("RELOAD")) {
                            var34 = 3;
                        } else if (var35.startsWith("Not permitted for social network accounts.")) {
                            var34 = 6;
                        } else {
                            var32.method2189(var7);
                            while (var32.field1867 > 0 && var32.field1869[var32.field1867 - 1] == 0) {
                                var32.field1867--;
                            }
                            String var36 = new String(var32.field1869, 0, var32.field1867);
                            if (class10.method2456(var36)) {
                                class130.method3544(var36, true, false);
                                var34 = 2;
                            } else {
                                var34 = 5;
                            }
                        }
                        break;
                    }
                    var32.field1867 += var33;
                    if (var32.field1867 >= 1000) {
                        var34 = 5;
                        break;
                    }
                }
            } catch (Throwable var38) {
                var38.printStackTrace();
                var34 = 5;
            }
            var2 = var34;
        }
        switch(var2) {
            case 2:
                method755(class148.field2432, class148.field2422, class148.field2434);
                field669 = 6;
                break;
            case 3:
                method755(class148.field2253, class148.field2436, class148.field2298);
                break;
            case 4:
                method755(class148.field2438, class148.field2439, class148.field2440);
                break;
            case 5:
                method755(class148.field2441, class148.field2442, class148.field2243);
                break;
            case 6:
                method755(class148.field2444, class148.field2215, class148.field2446);
                break;
            case 7:
                method755(class148.field2447, class148.field2448, class148.field2208);
        }
    }

    @ObfuscatedName("v.i(Lhq;Lhq;Lhq;ZI)V")
    public static void method139(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field665 = (Statics.field1015 - client.field467) / 2;
            field695 = field665 + 202;
        }
        if (field679) {
            if (Statics.field190 == null) {
                Statics.field190 = class72.method2445(Statics.field1441, "sl_back", "");
            }
            if (Statics.field205 == null) {
                Statics.field205 = class72.method989(Statics.field1441, "sl_flags", "");
            }
            if (Statics.field159 == null) {
                Statics.field159 = class72.method989(Statics.field1441, "sl_arrows", "");
            }
            if (Statics.field676 == null) {
                Statics.field676 = class72.method989(Statics.field1441, "sl_stars", "");
            }
            class75.method1578(field665, 23, 765, 480, 0);
            class75.method1611(field665, 0, 125, 23, 12425273, 9135624);
            class75.method1611(field665 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3645(class148.field2450, field665 + 62, 15, 0, -1);
            if (Statics.field676 != null) {
                Statics.field676[1].method1623(field665 + 140, 1);
                arg1.method3612(class148.field2451, field665 + 152, 10, 16777215, -1);
                Statics.field676[0].method1623(field665 + 140, 12);
                arg1.method3612(class148.field2452, field665 + 152, 21, 16777215, -1);
            }
            if (Statics.field159 != null) {
                int var4 = field665 + 280;
                if (class24.field595[0] == 0 && class24.field594[0] == 0) {
                    Statics.field159[2].method1623(var4, 4);
                } else {
                    Statics.field159[0].method1623(var4, 4);
                }
                if (class24.field595[0] == 0 && class24.field594[0] == 1) {
                    Statics.field159[3].method1623(var4 + 15, 4);
                } else {
                    Statics.field159[1].method1623(var4 + 15, 4);
                }
                arg0.method3612(class148.field2428, var4 + 32, 17, 16777215, -1);
                int var5 = field665 + 390;
                if (class24.field595[0] == 1 && class24.field594[0] == 0) {
                    Statics.field159[2].method1623(var5, 4);
                } else {
                    Statics.field159[0].method1623(var5, 4);
                }
                if (class24.field595[0] == 1 && class24.field594[0] == 1) {
                    Statics.field159[3].method1623(var5 + 15, 4);
                } else {
                    Statics.field159[1].method1623(var5 + 15, 4);
                }
                arg0.method3612(class148.field2255, var5 + 32, 17, 16777215, -1);
                int var6 = field665 + 500;
                if (class24.field595[0] == 2 && class24.field594[0] == 0) {
                    Statics.field159[2].method1623(var6, 4);
                } else {
                    Statics.field159[0].method1623(var6, 4);
                }
                if (class24.field595[0] == 2 && class24.field594[0] == 1) {
                    Statics.field159[3].method1623(var6 + 15, 4);
                } else {
                    Statics.field159[1].method1623(var6 + 15, 4);
                }
                arg0.method3612(class148.field2455, var6 + 32, 17, 16777215, -1);
                int var7 = field665 + 610;
                if (class24.field595[0] == 3 && class24.field594[0] == 0) {
                    Statics.field159[2].method1623(var7, 4);
                } else {
                    Statics.field159[0].method1623(var7, 4);
                }
                if (class24.field595[0] == 3 && class24.field594[0] == 1) {
                    Statics.field159[3].method1623(var7 + 15, 4);
                } else {
                    Statics.field159[1].method1623(var7 + 15, 4);
                }
                arg0.method3612(class148.field2456, var7 + 32, 17, 16777215, -1);
            }
            class75.method1578(field665 + 708, 4, 50, 16, 0);
            arg1.method3645(class148.field2331, field665 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field364 & var9;
            for (int var11 = 0; var11 < class24.field592; var11++) {
                class24 var12 = Statics.field587[var11];
                if ((var12.field597 & var9) == var10 || (var12.field597 & var9) == 0) {
                    var8++;
                }
            }
            field692 = -1;
            if (Statics.field190 != null) {
                byte var13 = 88;
                byte var14 = 19;
                int var15 = 765 / (var13 + 1);
                int var16 = 480 / (var14 + 1);
                int var17;
                int var18;
                do {
                    var17 = var16;
                    var18 = var15;
                    if ((var15 - 1) * var16 >= var8) {
                        var15--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                } while (var16 != var17 || var15 != var18);
                int var19 = (765 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (480 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (765 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = (480 - var14 * var16 - (var16 - 1) * var20) / 2;
                int var23 = var22 + 23;
                int var24 = field665 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class24.field592; var27++) {
                    class24 var28 = Statics.field587[var27];
                    if ((var28.field597 & var9) == var10 || (var28.field597 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field598);
                        if (var28.field598 == -1) {
                            var30 = class148.field2457;
                            var29 = false;
                        } else if (var28.field598 > 1980) {
                            var30 = class148.field2458;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method577()) {
                            if (var28.method558()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method558()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class132.field2027 >= var24 && class132.field2038 >= var23 && class132.field2027 < var13 + var24 && class132.field2038 < var14 + var23 && var29) {
                            field692 = var27;
                            Statics.field190[var31].method1484(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field190[var31].method1486(var24, var23);
                        }
                        if (Statics.field205 != null) {
                            Statics.field205[(var28.method558() ? 8 : 0) + var28.field590].method1623(var24 + 29, var23);
                        }
                        arg0.method3645(Integer.toString(var28.field604), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3645(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
                        var23 += var14 + var20;
                        var25++;
                        if (var25 >= var16) {
                            var23 = var22 + 23;
                            var24 += var13 + var19;
                            var25 = 0;
                        }
                    }
                }
                if (var26) {
                    int var32 = arg1.method3607(Statics.field587[field692].field600) + 6;
                    int var33 = arg1.field3087 + 8;
                    class75.method1578(class132.field2027 - var32 / 2, class132.field2038 + 20 + 5, var32, var33, 16777120);
                    class75.method1582(class132.field2027 - var32 / 2, class132.field2038 + 20 + 5, var32, var33, 0);
                    arg1.method3645(Statics.field587[field692].field600, class132.field2027, class132.field2038 + 20 + 5 + arg1.field3087 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1309.getGraphics();
                Statics.field2888.method1419(var34, 0, 0);
            } catch (Exception var132) {
                Statics.field1309.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field667.method1486(field665, 0);
            Statics.field668.method1486(field665 + 382, 0);
            Statics.field1690.method1623(field665 + 382 - Statics.field1690.field1335 / 2, 18);
        }
        if (client.field371 == 0 || client.field371 == 5) {
            byte var36 = 20;
            arg0.method3645(class148.field2397, field695 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class75.method1582(field695 + 180 - 152, var37, 304, 34, 9179409);
            class75.method1582(field695 + 180 - 151, var37 + 1, 302, 32, 0);
            class75.method1578(field695 + 180 - 150, var37 + 2, field677 * 3, 30, 9179409);
            class75.method1578(field677 * 3 + (field695 + 180 - 150), var37 + 2, 300 - field677 * 3, 30, 0);
            arg0.method3645(field678, field695 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field371 == 20) {
            Statics.field3108.method1623(field695 + 180 - Statics.field3108.field1335 / 2, 271 - Statics.field3108.field1336 / 2);
            short var38 = 211;
            arg0.method3645(field680, field695 + 180, var38, 16776960, 0);
            int var134 = var38 + 15;
            arg0.method3645(field681, field695 + 180, var134, 16776960, 0);
            int var135 = var134 + 15;
            arg0.method3645(field682, field695 + 180, var135, 16776960, 0);
            int var136 = var135 + 15;
            int var137 = var136 + 10;
            if (field669 != 4) {
                arg0.method3612(class148.field2417, field695 + 180 - 110, var137, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field664; arg0.method3607(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3612(class214.method3611(var40), field695 + 180 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                arg0.method3612(class148.field2340 + class154.method171(field684), field695 + 180 - 108, var134, 16777215, 0);
                var134 += 15;
            }
        }
        if (client.field371 == 10 || client.field371 == 11) {
            Statics.field3108.method1623(field695, 171);
            if (field669 == 0) {
                short var41 = 251;
                arg0.method3645(class148.field2419, field695 + 180, var41, 16776960, 0);
                int var138 = var41 + 30;
                int var42 = field695 + 180 - 80;
                short var43 = 291;
                Statics.field690.method1623(var42 - 73, var43 - 20);
                arg0.method3669(class148.field2420, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field695 + 180 + 80;
                Statics.field690.method1623(var44 - 73, var43 - 20);
                arg0.method3669(class148.field2421, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field669 == 1) {
                arg0.method3645(class148.field2401, field695 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3645(field680, field695 + 180, var45, 16777215, 0);
                int var139 = var45 + 15;
                arg0.method3645(field681, field695 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method3645(field682, field695 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                int var46 = field695 + 180 - 80;
                short var47 = 321;
                Statics.field690.method1623(var46 - 73, var47 - 20);
                arg0.method3645(class148.field2192, var46, var47 + 5, 16777215, 0);
                int var48 = field695 + 180 + 80;
                Statics.field690.method1623(var48 - 73, var47 - 20);
                arg0.method3645(class148.field2331, var48, var47 + 5, 16777215, 0);
            } else if (field669 == 2) {
                short var49 = 211;
                arg0.method3645(field680, field695 + 180, var49, 16776960, 0);
                int var142 = var49 + 15;
                arg0.method3645(field681, field695 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg0.method3645(field682, field695 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                int var145 = var144 + 10;
                arg0.method3612(class148.field2417, field695 + 180 - 110, var145, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field664; arg0.method3607(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3612(class214.method3611(var51) + (field687 == 0 & client.field256 % 40 < 20 ? class2.method281(16776960) + class2.field16 : ""), field695 + 180 - 70, var145, 16777215, 0);
                var142 = var145 + 15;
                arg0.method3612(class148.field2340 + class154.method171(field684) + (field687 == 1 & client.field256 % 40 < 20 ? class2.method281(16776960) + class2.field16 : ""), field695 + 180 - 108, var142, 16777215, 0);
                var142 += 15;
                int var52 = field695 + 180 - 80;
                short var53 = 321;
                Statics.field690.method1623(var52 - 73, var53 - 20);
                arg0.method3645(class148.field2437, var52, var53 + 5, 16777215, 0);
                int var54 = field695 + 180 + 80;
                Statics.field690.method1623(var54 - 73, var53 - 20);
                arg0.method3645(class148.field2331, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3645(class148.field2424, field695 + 180, var55, 16776960, 0);
            } else if (field669 == 4) {
                arg0.method3645(class148.field2411, field695 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3645(field680, field695 + 180, var56, 16777215, 0);
                int var146 = var56 + 15;
                arg0.method3645(field681, field695 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method3645(field682, field695 + 180, var147, 16777215, 0);
                int var148 = var147 + 15;
                arg0.method3612(class148.field2324 + class154.method171(Statics.field2470) + (client.field256 % 40 < 20 ? class2.method281(16776960) + class2.field16 : ""), field695 + 180 - 108, var148, 16777215, 0);
                int var149 = var148 - 8;
                arg0.method3612(class148.field2194, field695 + 180 - 9, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method3612(class148.field2195, field695 + 180 - 9, var150, 16776960, 0);
                int var57 = field695 + 180 - 9 + arg0.method3607(class148.field2195) + 15;
                int var58 = var150 - arg0.field3087;
                class76 var59;
                if (field686) {
                    var59 = Statics.field1682;
                } else {
                    var59 = Statics.field2827;
                }
                var59.method1623(var57, var58);
                var146 = var150 + 15;
                int var60 = field695 + 180 - 80;
                short var61 = 321;
                Statics.field690.method1623(var60 - 73, var61 - 20);
                arg0.method3645(class148.field2192, var60, var61 + 5, 16777215, 0);
                int var62 = field695 + 180 + 80;
                Statics.field690.method1623(var62 - 73, var61 - 20);
                arg0.method3645(class148.field2331, var62, var61 + 5, 16777215, 0);
                arg1.method3645(class148.field2313, field695 + 180, var61 + 36, 255, 0);
            } else if (field669 == 5) {
                arg0.method3645(class148.field2425, field695 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3645(field680, field695 + 180, var63, 16776960, 0);
                int var151 = var63 + 15;
                arg2.method3645(field681, field695 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg2.method3645(field682, field695 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var154 = var153 + 14;
                arg0.method3612(class148.field2426, field695 + 180 - 145, var154, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field664; arg0.method3607(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3612(class214.method3611(var65) + (client.field256 % 40 < 20 ? class2.method281(16776960) + class2.field16 : ""), field695 + 180 - 34, var154, 16777215, 0);
                var151 = var154 + 15;
                int var66 = field695 + 180 - 80;
                short var67 = 321;
                Statics.field690.method1623(var66 - 73, var67 - 20);
                arg0.method3645(class148.field2427, var66, var67 + 5, 16777215, 0);
                int var68 = field695 + 180 + 80;
                Statics.field690.method1623(var68 - 73, var67 - 20);
                arg0.method3645(class148.field2379, var68, var67 + 5, 16777215, 0);
            } else if (field669 == 6) {
                short var69 = 211;
                arg0.method3645(field680, field695 + 180, var69, 16776960, 0);
                int var155 = var69 + 15;
                arg0.method3645(field681, field695 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method3645(field682, field695 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var70 = field695 + 180;
                short var71 = 321;
                Statics.field690.method1623(var70 - 73, var71 - 20);
                arg0.method3645(class148.field2379, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field693 > 0) {
            int var72 = field693;
            short var73 = 256;
            field673 += var72 * 128;
            if (field673 > Statics.field1835.length) {
                field673 -= Statics.field1835.length;
                int var74 = (int) (Math.random() * 12.0D);
                method88(Statics.field666[var74]);
            }
            int var75 = 0;
            int var76 = var72 * 128;
            int var77 = (var73 - var72) * 128;
            for (int var78 = 0; var78 < var77; var78++) {
                int var79 = Statics.field2797[var75 + var76] - Statics.field1835[field673 + var75 & Statics.field1835.length - 1] * var72 / 6;
                if (var79 < 0) {
                    var79 = 0;
                }
                Statics.field2797[var75++] = var79;
            }
            for (int var80 = var73 - var72; var80 < var73; var80++) {
                int var81 = var80 * 128;
                for (int var82 = 0; var82 < 128; var82++) {
                    int var83 = (int) (Math.random() * 100.0D);
                    if (var83 < 50 && var82 > 10 && var82 < 118) {
                        Statics.field2797[var81 + var82] = 255;
                    } else {
                        Statics.field2797[var81 + var82] = 0;
                    }
                }
            }
            if (field671 > 0) {
                field671 -= var72 * 4;
            }
            if (field672 > 0) {
                field672 -= var72 * 4;
            }
            if (field671 == 0 && field672 == 0) {
                int var84 = (int) (Math.random() * (double) (2000 / var72));
                if (var84 == 0) {
                    field671 = 1024;
                }
                if (var84 == 1) {
                    field672 = 1024;
                }
            }
            for (int var85 = 0; var85 < var73 - var72; var85++) {
                field670[var85] = field670[var72 + var85];
            }
            for (int var86 = var73 - var72; var86 < var73; var86++) {
                field670[var86] = (int) (Math.sin((double) field689 / 14.0D) * 16.0D + Math.sin((double) field689 / 15.0D) * 14.0D + Math.sin((double) field689 / 16.0D) * 12.0D);
                field689++;
            }
            field675 += var72 * -401498817;
            int var87 = ((client.field256 & 0x1) + var72) / 2;
            if (var87 > 0) {
                for (int var88 = 0; var88 < field675 * 1738166940; var88++) {
                    int var89 = (int) (Math.random() * 124.0D) + 2;
                    int var90 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2797[(var90 << 7) + var89] = 192;
                }
                field675 = 0;
                int var91 = 0;
                label533: while (true) {
                    if (var91 >= var73) {
                        int var95 = 0;
                        while (true) {
                            if (var95 >= 128) {
                                break label533;
                            }
                            int var96 = 0;
                            for (int var97 = -var87; var97 < var73; var97++) {
                                int var98 = var97 * 128;
                                if (var87 + var97 < var73) {
                                    var96 += Statics.field1893[var87 * 128 + var95 + var98];
                                }
                                if (var97 - (var87 + 1) >= 0) {
                                    var96 -= Statics.field1893[var95 + var98 - (var87 + 1) * 128];
                                }
                                if (var97 >= 0) {
                                    Statics.field2797[var95 + var98] = var96 / (var87 * 2 + 1);
                                }
                            }
                            var95++;
                        }
                    }
                    int var92 = 0;
                    int var93 = var91 * 128;
                    for (int var94 = -var87; var94 < 128; var94++) {
                        if (var87 + var94 < 128) {
                            var92 += Statics.field2797[var93 + var94 + var87];
                        }
                        if (var94 - (var87 + 1) >= 0) {
                            var92 -= Statics.field2797[var93 + var94 - (var87 + 1)];
                        }
                        if (var94 >= 0) {
                            Statics.field1893[var93 + var94] = var92 / (var87 * 2 + 1);
                        }
                    }
                    var91++;
                }
            }
            field693 = 0;
        }
        short var99 = 256;
        if (field671 > 0) {
            for (int var100 = 0; var100 < 256; var100++) {
                if (field671 > 768) {
                    Statics.field3102[var100] = method3046(Statics.field694[var100], Statics.field1481[var100], 1024 - field671);
                } else if (field671 > 256) {
                    Statics.field3102[var100] = Statics.field1481[var100];
                } else {
                    Statics.field3102[var100] = method3046(Statics.field1481[var100], Statics.field694[var100], 256 - field671);
                }
            }
        } else if (field672 > 0) {
            for (int var101 = 0; var101 < 256; var101++) {
                if (field672 > 768) {
                    Statics.field3102[var101] = method3046(Statics.field694[var101], Statics.field581[var101], 1024 - field672);
                } else if (field672 > 256) {
                    Statics.field3102[var101] = Statics.field581[var101];
                } else {
                    Statics.field3102[var101] = method3046(Statics.field581[var101], Statics.field694[var101], 256 - field672);
                }
            }
        } else {
            for (int var102 = 0; var102 < 256; var102++) {
                Statics.field3102[var102] = Statics.field694[var102];
            }
        }
        class75.method1572(field665, 9, field665 + 128, var99 + 7);
        Statics.field667.method1486(field665, 0);
        class75.method1573();
        int var103 = 0;
        int var104 = field665 + Statics.field2888.field1300 * 9;
        for (int var105 = 1; var105 < var99 - 1; var105++) {
            int var106 = (var99 - var105) * field670[var105] / var99;
            int var107 = var106 + 22;
            if (var107 < 0) {
                var107 = 0;
            }
            var103 += var107;
            for (int var108 = var107; var108 < 128; var108++) {
                int var109 = Statics.field2797[var103++];
                if (var109 == 0) {
                    var104++;
                } else {
                    int var111 = 256 - var109;
                    int var112 = Statics.field3102[var109];
                    int var113 = Statics.field2888.field1311[var104];
                    Statics.field2888.field1311[var104++] = ((var112 & 0xFF00) * var109 + (var113 & 0xFF00) * var111 & 0xFF0000) + ((var112 & 0xFF00FF) * var109 + (var113 & 0xFF00FF) * var111 & 0xFF00FF00) >> 8;
                }
            }
            var104 += Statics.field2888.field1300 + var107 - 128;
        }
        class75.method1572(field665 + 765 - 128, 9, field665 + 765, var99 + 7);
        Statics.field668.method1486(field665 + 382, 0);
        class75.method1573();
        int var114 = 0;
        int var115 = field665 + Statics.field2888.field1300 * 9 + 24 + 637;
        for (int var116 = 1; var116 < var99 - 1; var116++) {
            int var117 = (var99 - var116) * field670[var116] / var99;
            int var118 = 103 - var117;
            int var119 = var115 + var117;
            for (int var120 = 0; var120 < var118; var120++) {
                int var121 = Statics.field2797[var114++];
                if (var121 == 0) {
                    var119++;
                } else {
                    int var123 = 256 - var121;
                    int var124 = Statics.field3102[var121];
                    int var125 = Statics.field2888.field1311[var119];
                    Statics.field2888.field1311[var119++] = ((var124 & 0xFF00) * var121 + (var125 & 0xFF00) * var123 & 0xFF0000) + ((var124 & 0xFF00FF) * var121 + (var125 & 0xFF00FF) * var123 & 0xFF00FF00) >> 8;
                }
            }
            var114 += 128 - var118;
            var115 = Statics.field2888.field1300 - var118 - var117 + var119;
        }
        Statics.field183[Statics.field2092.field125 ? 1 : 0].method1623(field665 + 765 - 40, 463);
        if (client.field371 > 5 && client.field252 == 0) {
            if (Statics.field2825 == null) {
                Statics.field2825 = class72.method2546(Statics.field1441, "sl_button", "");
            } else {
                int var126 = field665 + 5;
                short var127 = 463;
                byte var128 = 100;
                byte var129 = 35;
                Statics.field2825.method1623(var126, var127);
                arg0.method3645(class148.field2191 + " " + client.field247, var128 / 2 + var126, var129 / 2 + var127 - 2, 16777215, 0);
                if (Statics.field579 == null) {
                    arg1.method3645(class148.field2232, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
                } else {
                    arg1.method3645(class148.field2459, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var130 = Statics.field1309.getGraphics();
            Statics.field2888.method1419(var130, 0, 0);
        } catch (Exception var133) {
            Statics.field1309.repaint();
        }
    }

    @ObfuscatedName("al.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method755(String arg0, String arg1, String arg2) {
        field680 = arg0;
        field681 = arg1;
        field682 = arg2;
    }

    @ObfuscatedName("f.f(Lbd;B)V")
    public static final void method88(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1835.length; var2++) {
            Statics.field1835[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1835[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2966[var8] = (Statics.field1835[var8 - 1] + Statics.field1835[var8 + 1] + Statics.field1835[var8 - 128] + Statics.field1835[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1835;
            Statics.field1835 = Statics.field2966;
            Statics.field2966 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1336; var11++) {
            for (int var12 = 0; var12 < arg0.field1335; var12++) {
                if (arg0.field1338[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1337;
                    int var14 = var11 + 16 + arg0.field1339;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1835[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fi.d(IIIB)I")
    public static final int method3046(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("aj.j(Ly;I)V")
    public static void method822(class24 arg0) {
        if (arg0.method558() != client.field250) {
            client.field250 = arg0.method558();
            boolean var1 = arg0.method558();
            if (Statics.field1027 != var1) {
                class47.method1921();
                Statics.field1027 = var1;
            }
        }
        Statics.field2093 = arg0.field599;
        client.field247 = arg0.field604;
        client.field364 = arg0.field597;
        Statics.field2949 = client.field249 == 0 ? 43594 : arg0.field604 + 40000;
        Statics.field2173 = client.field249 == 0 ? 443 : arg0.field604 + 50000;
        Statics.field585 = Statics.field2949;
    }
}
