package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("af")
public class class29 {

    @ObfuscatedName("af.f")
    public static int[] field691 = new int[256];

    @ObfuscatedName("af.y")
    public static int field661 = 0;

    @ObfuscatedName("af.o")
    public static int field668 = 0;

    @ObfuscatedName("af.ac")
    public static int field664 = 0;

    @ObfuscatedName("af.ax")
    public static int field679 = 0;

    @ObfuscatedName("af.af")
    public static int field666 = 0;

    @ObfuscatedName("af.am")
    public static int field667 = 0;

    @ObfuscatedName("af.ah")
    public static int field682 = 10;

    @ObfuscatedName("af.ar")
    public static String field658 = "";

    @ObfuscatedName("af.ad")
    public static int field670 = 0;

    @ObfuscatedName("af.ao")
    public static String field660 = "";

    @ObfuscatedName("af.ae")
    public static String field672 = "";

    @ObfuscatedName("af.ab")
    public static String field688 = "";

    @ObfuscatedName("af.ai")
    public static String field674 = "";

    @ObfuscatedName("af.ag")
    public static String field651 = "";

    @ObfuscatedName("af.ap")
    public static class147 field673 = class147.field2424;

    @ObfuscatedName("af.an")
    public static boolean field677 = true;

    @ObfuscatedName("af.ay")
    public static int field678 = 0;

    @ObfuscatedName("af.aw")
    public static String field676 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("af.ak")
    public static String field680 = "1234567890";

    @ObfuscatedName("af.aa")
    public static boolean field681 = false;

    @ObfuscatedName("af.bq")
    public static int field684 = 0;

    @ObfuscatedName("af.bt")
    public static int[] field687 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("af.bz")
    public static int[] field694 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("af.bb")
    public static int field689 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.e(I)I")
    public static int method1589() {
        return 8;
    }

    @ObfuscatedName("ep.v(Ljava/awt/Component;Lep;Lep;ZII)V")
    public static void method2750(Component arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (!Statics.field662) {
            field670 = arg4;
            class74.method1531();
            byte[] var5 = arg1.method2779("title.jpg", "");
            Statics.field653 = new class73(var5, arg0);
            Statics.field654 = Statics.field653.method1424();
            Statics.field655 = class71.method31(arg2, "logo", "");
            Statics.field3010 = class71.method31(arg2, "titlebox", "");
            Statics.field3009 = class71.method31(arg2, "titlebutton", "");
            Statics.field652 = class71.method134(arg2, "runes", "");
            Statics.field1316 = class71.method134(arg2, "title_mute", "");
            Statics.field196 = class71.method31(arg2, "options_radio_buttons,0", "");
            Statics.field1882 = class71.method31(arg2, "options_radio_buttons,2", "");
            Statics.field2676 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2676[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2676[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2676[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2676[var9 + 192] = 16777215;
            }
            Statics.field1467 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1467[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1467[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1467[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1467[var13 + 192] = 16777215;
            }
            Statics.field675 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field675[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field675[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field675[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field675[var17 + 192] = 16777215;
            }
            Statics.field659 = new int[256];
            Statics.field648 = new int[32768];
            Statics.field2539 = new int[32768];
            method150((class75) null);
            Statics.field663 = new int[32768];
            Statics.field1891 = new int[32768];
            if (arg3) {
                field674 = "";
                field651 = "";
            }
            Statics.field1994 = 0;
            Statics.field181 = "";
            field677 = true;
            field681 = false;
            if (Statics.field1296.field136) {
                class164.method750(2);
            } else {
                class164.method749(2, Statics.field2711, "scape main", "", 255, false);
            }
            class153.method809(false);
            Statics.field662 = true;
            Statics.field653.method1433(0, 0);
            Statics.field654.method1433(382, 0);
            Statics.field655.method1565(382 - Statics.field655.field1339 / 2, 18);
        } else if (arg4 == 4) {
            field670 = 4;
        }
    }

    @ObfuscatedName("ax.k(I)V")
    public static void method510() {
        if (!Statics.field662) {
            return;
        }
        Statics.field3010 = null;
        Statics.field3009 = null;
        Statics.field652 = null;
        Statics.field653 = null;
        Statics.field654 = null;
        Statics.field655 = null;
        Statics.field1316 = null;
        Statics.field196 = null;
        Statics.field1882 = null;
        Statics.field2145 = null;
        Statics.field656 = null;
        Statics.field683 = null;
        Statics.field2996 = null;
        Statics.field1018 = null;
        Statics.field2676 = null;
        Statics.field1467 = null;
        Statics.field675 = null;
        Statics.field659 = null;
        Statics.field648 = null;
        Statics.field2539 = null;
        Statics.field663 = null;
        Statics.field1891 = null;
        class164.method750(2);
        class153.method809(true);
        Statics.field662 = false;
    }

    @ObfuscatedName("dw.g(Lem;I)V")
    public static void method2410(class133 arg0) {
        if (!field681) {
            if ((class129.field2009 == 1 || !Statics.field330 && class129.field2009 == 4) && class129.field2010 >= 715 && class129.field1997 >= 453) {
                Statics.field1296.field136 = !Statics.field1296.field136;
                class9.method27();
                if (Statics.field1296.field136) {
                    Statics.field2730.method3062();
                    class164.field2732 = 1;
                    Statics.field1022 = null;
                } else {
                    class164.method2049(Statics.field2711, "scape main", "", 255, false);
                }
            }
            if (client.field270 != 5) {
                field666++;
                if (client.field270 == 10 || client.field270 == 11) {
                    if (client.field321 == 0) {
                        if (class129.field2009 == 1 || !Statics.field330 && class129.field2009 == 4) {
                            byte var6 = 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class129.field2010 >= var6 && class129.field2010 <= var6 + var8 && class129.field1997 >= var7 && class129.field1997 <= var7 + var9) {
                                method2039();
                                return;
                            }
                        }
                        if (Statics.field585 != null) {
                            method2039();
                        }
                    }
                    int var10 = class129.field2009;
                    int var11 = class129.field2010;
                    int var12 = class129.field1997;
                    if (!Statics.field330 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field670 == 0) {
                        short var13 = 302;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class127.method570(client.method2512("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        short var15 = 462;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field313 & 0x4) != 0) {
                                if ((client.field313 & 0x400) == 0) {
                                    field660 = class145.field2328;
                                    field672 = class145.field2226;
                                    field688 = class145.field2382;
                                } else {
                                    field660 = class145.field2386;
                                    field672 = class145.field2387;
                                    field688 = class145.field2388;
                                }
                                field670 = 1;
                                field678 = 0;
                            } else if ((client.field313 & 0x400) == 0) {
                                field660 = class145.field2376;
                                field672 = class145.field2209;
                                field688 = class145.field2279;
                                field670 = 2;
                                field678 = 0;
                            } else {
                                field660 = class145.field2358;
                                field672 = class145.field2384;
                                field688 = class145.field2385;
                                field670 = 1;
                                field678 = 0;
                            }
                        }
                    } else if (field670 == 1) {
                        while (class126.method475()) {
                            if (Statics.field15 == 84) {
                                field660 = class145.field2376;
                                field672 = class145.field2209;
                                field688 = class145.field2279;
                                field670 = 2;
                                field678 = 0;
                            } else if (Statics.field15 == 13) {
                                field670 = 0;
                            }
                        }
                        short var16 = 302;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field660 = class145.field2376;
                            field672 = class145.field2209;
                            field688 = class145.field2279;
                            field670 = 2;
                            field678 = 0;
                        }
                        short var18 = 462;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field670 = 0;
                        }
                    } else if (field670 == 2) {
                        short var19 = 231;
                        int var30 = var19 + 30;
                        if (var10 == 1 && var12 >= var30 - 15 && var12 < var30) {
                            field678 = 0;
                        }
                        var30 += 15;
                        if (var10 == 1 && var12 >= var30 - 15 && var12 < var30) {
                            field678 = 1;
                        }
                        var30 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field674 = field674.trim();
                            if (field674.length() == 0) {
                                method63(class145.field2282, class145.field2283, class145.field2169);
                                return;
                            }
                            if (field651.length() == 0) {
                                method63(class145.field2285, class145.field2357, class145.field2287);
                                return;
                            }
                            method63(class145.field2391, class145.field2392, class145.field2393);
                            field673 = Statics.field1296.field135.containsKey(class211.method1386(field674)) ? class147.field2429 : class147.field2424;
                            client.method2355(20);
                            return;
                        }
                        short var22 = 462;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field670 = 0;
                            field674 = "";
                            field651 = "";
                            Statics.field1994 = 0;
                            Statics.field181 = "";
                            field677 = true;
                        }
                        while (true) {
                            while (class126.method475()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field676.length(); var24++) {
                                    if (Statics.field2164 == field676.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (Statics.field15 == 13) {
                                    field670 = 0;
                                    field674 = "";
                                    field651 = "";
                                    Statics.field1994 = 0;
                                    Statics.field181 = "";
                                    field677 = true;
                                } else if (field678 == 0) {
                                    if (Statics.field15 == 85 && field674.length() > 0) {
                                        field674 = field674.substring(0, field674.length() - 1);
                                    }
                                    if (Statics.field15 == 84 || Statics.field15 == 80) {
                                        field678 = 1;
                                    }
                                    if (var23 && field674.length() < 320) {
                                        field674 = field674 + Statics.field2164;
                                    }
                                } else if (field678 == 1) {
                                    if (Statics.field15 == 85 && field651.length() > 0) {
                                        field651 = field651.substring(0, field651.length() - 1);
                                    }
                                    if (Statics.field15 == 84 || Statics.field15 == 80) {
                                        field678 = 0;
                                    }
                                    if (Statics.field15 == 84) {
                                        field674 = field674.trim();
                                        if (field674.length() == 0) {
                                            method63(class145.field2282, class145.field2283, class145.field2169);
                                            return;
                                        }
                                        if (field651.length() == 0) {
                                            method63(class145.field2285, class145.field2357, class145.field2287);
                                            return;
                                        }
                                        method63(class145.field2391, class145.field2392, class145.field2393);
                                        field673 = Statics.field1296.field135.containsKey(class211.method1386(field674)) ? class147.field2429 : class147.field2424;
                                        client.method2355(20);
                                        return;
                                    }
                                    if (var23 && field651.length() < 20) {
                                        field651 = field651 + Statics.field2164;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field670 == 4) {
                        short var25 = 302;
                        short var26 = 321;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                            Statics.field181.trim();
                            if (Statics.field181.length() != 6) {
                                method63(class145.field2198, class145.field2199, class145.field2378);
                                return;
                            }
                            Statics.field1994 = Integer.parseInt(Statics.field181);
                            Statics.field181 = "";
                            field673 = field677 ? class147.field2422 : class147.field2425;
                            method63(class145.field2391, class145.field2392, class145.field2393);
                            client.method2355(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= 373 && var11 <= 512 && var12 >= 263 && var12 <= 296) {
                            field677 = !field677;
                        }
                        if (var10 == 1 && var11 >= 348 && var11 <= 416 && var12 >= 351 && var12 <= 363) {
                            class127.method570(client.method2512("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        short var27 = 462;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                            field670 = 0;
                            field674 = "";
                            field651 = "";
                            Statics.field1994 = 0;
                            Statics.field181 = "";
                        }
                        while (class126.method475()) {
                            boolean var28 = false;
                            for (int var29 = 0; var29 < field680.length(); var29++) {
                                if (Statics.field2164 == field680.charAt(var29)) {
                                    var28 = true;
                                    break;
                                }
                            }
                            if (Statics.field15 == 13) {
                                field670 = 0;
                                field674 = "";
                                field651 = "";
                                Statics.field1994 = 0;
                                Statics.field181 = "";
                            } else {
                                if (Statics.field15 == 85 && Statics.field181.length() > 0) {
                                    Statics.field181 = Statics.field181.substring(0, Statics.field181.length() - 1);
                                }
                                if (Statics.field15 == 84) {
                                    Statics.field181.trim();
                                    if (Statics.field181.length() != 6) {
                                        method63(class145.field2198, class145.field2199, class145.field2378);
                                        return;
                                    }
                                    Statics.field1994 = Integer.parseInt(Statics.field181);
                                    Statics.field181 = "";
                                    field673 = field677 ? class147.field2422 : class147.field2425;
                                    method63(class145.field2391, class145.field2392, class145.field2393);
                                    client.method2355(20);
                                    return;
                                }
                                if (var28 && Statics.field181.length() < 6) {
                                    Statics.field181 = Statics.field181 + Statics.field2164;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class129.field2009 == 1 || !Statics.field330 && class129.field2009 == 4) {
            short var1 = 280;
            if (class129.field2010 >= var1 && class129.field2010 <= var1 + 14 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                method100(0, 0);
            } else if (class129.field2010 >= var1 + 15 && class129.field2010 <= var1 + 80 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                method100(0, 1);
            } else {
                short var2 = 390;
                if (class129.field2010 >= var2 && class129.field2010 <= var2 + 14 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                    method100(1, 0);
                } else if (class129.field2010 >= var2 + 15 && class129.field2010 <= var2 + 80 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                    method100(1, 1);
                } else {
                    short var3 = 500;
                    if (class129.field2010 >= var3 && class129.field2010 <= var3 + 14 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                        method100(2, 0);
                    } else if (class129.field2010 >= var3 + 15 && class129.field2010 <= var3 + 80 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                        method100(2, 1);
                    } else {
                        short var4 = 610;
                        if (class129.field2010 >= var4 && class129.field2010 <= var4 + 14 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                            method100(3, 0);
                        } else if (class129.field2010 >= var4 + 15 && class129.field2010 <= var4 + 80 && class129.field1997 >= 4 && class129.field1997 <= 18) {
                            method100(3, 1);
                        } else if (class129.field2010 >= 708 && class129.field1997 >= 4 && class129.field2010 <= 758 && class129.field1997 <= 20) {
                            field681 = false;
                            Statics.field653.method1433(0, 0);
                            Statics.field654.method1433(382, 0);
                            Statics.field655.method1565(382 - Statics.field655.field1339 / 2, 18);
                        } else if (field689 != -1) {
                            class23 var5 = Statics.field1955[field689];
                            method500(var5);
                            field681 = false;
                            Statics.field653.method1433(0, 0);
                            Statics.field654.method1433(382, 0);
                            Statics.field655.method1565(382 - Statics.field655.field1339 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.q(Lgw;Lgw;I)V")
    public static void method80(class205 arg0, class205 arg1) {
        if (field681) {
            method799(arg0, arg1);
            return;
        }
        if (client.field270 == 0 || client.field270 == 5) {
            byte var2 = 20;
            arg0.method3428(class145.field2338, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class74.method1515(230, var3, 304, 34, 9179409);
            class74.method1515(231, var3 + 1, 302, 32, 0);
            class74.method1513(232, var3 + 2, field682 * 3, 30, 9179409);
            class74.method1513(field682 * 3 + 232, var3 + 2, 300 - field682 * 3, 30, 0);
            arg0.method3428(field658, 382, 276 - var2, 16777215, -1);
        }
        if (client.field270 == 20) {
            Statics.field3010.method1565(382 - Statics.field3010.field1339 / 2, 271 - Statics.field3010.field1343 / 2);
            short var4 = 211;
            arg0.method3428(field660, 382, var4, 16776960, 0);
            int var101 = var4 + 15;
            arg0.method3428(field672, 382, var101, 16776960, 0);
            int var102 = var101 + 15;
            arg0.method3428(field688, 382, var102, 16776960, 0);
            int var103 = var102 + 15;
            int var104 = var103 + 10;
            if (field670 != 4) {
                arg0.method3483(class145.field2347, 272, var104, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field674; arg0.method3477(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3483(class204.method3425(var6), 312, var104, 16777215, 0);
                var101 = var104 + 15;
                String var8 = class145.field2210;
                String var9 = field651;
                String var10 = class211.method2888('*', var9.length());
                arg0.method3483(var8 + var10, 274, var101, 16777215, 0);
                var101 += 15;
            }
        }
        if (client.field270 == 10 || client.field270 == 11) {
            Statics.field3010.method1565(202, 171);
            if (field670 == 0) {
                short var11 = 251;
                arg0.method3428(class145.field2397, 382, var11, 16776960, 0);
                int var105 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field3009.method1565(var12 - 73, var13 - 20);
                arg0.method3419(class145.field2166, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field3009.method1565(var14 - 73, var13 - 20);
                arg0.method3419(class145.field2321, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field670 == 1) {
                arg0.method3428(class145.field2379, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3428(field660, 382, var15, 16777215, 0);
                int var106 = var15 + 15;
                arg0.method3428(field672, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3428(field688, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                short var16 = 302;
                short var17 = 321;
                Statics.field3009.method1565(var16 - 73, var17 - 20);
                arg0.method3428(class145.field2171, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                Statics.field3009.method1565(var18 - 73, var17 - 20);
                arg0.method3428(class145.field2401, var18, var17 + 5, 16777215, 0);
            } else if (field670 == 2) {
                short var19 = 211;
                arg0.method3428(field660, 382, var19, 16776960, 0);
                int var109 = var19 + 15;
                arg0.method3428(field672, 382, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3428(field688, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var112 = var111 + 10;
                arg0.method3483(class145.field2347, 272, var112, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = field674; arg0.method3477(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3483(class204.method3425(var21) + (field678 == 0 & client.field418 % 40 < 20 ? class2.method2540(16776960) + class2.field20 : ""), 312, var112, 16777215, 0);
                var109 = var112 + 15;
                String var23 = class145.field2210;
                String var24 = field651;
                String var25 = class211.method2888('*', var24.length());
                arg0.method3483(var23 + var25 + (field678 == 1 & client.field418 % 40 < 20 ? class2.method2540(16776960) + class2.field20 : ""), 274, var109, 16777215, 0);
                var109 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field3009.method1565(var26 - 73, var27 - 20);
                arg0.method3428(class145.field2307, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field3009.method1565(var28 - 73, var27 - 20);
                arg0.method3428(class145.field2401, var28, var27 + 5, 16777215, 0);
            } else if (field670 == 4) {
                arg0.method3428(class145.field2325, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3428(field660, 382, var29, 16777215, 0);
                int var113 = var29 + 15;
                arg0.method3428(field672, 382, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3428(field688, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                String var31 = class145.field2175;
                String var32 = Statics.field181;
                String var33 = class211.method2888('*', var32.length());
                arg0.method3483(var31 + var33 + (client.field418 % 40 < 20 ? class2.method2540(16776960) + class2.field20 : ""), 274, var115, 16777215, 0);
                int var116 = var115 - 8;
                arg0.method3483(class145.field2172, 373, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method3483(class145.field2399, 373, var117, 16776960, 0);
                int var34 = 373 + arg0.method3477(class145.field2399) + 15;
                int var35 = var117 - arg0.field2958;
                class75 var36;
                if (field677) {
                    var36 = Statics.field1882;
                } else {
                    var36 = Statics.field196;
                }
                var36.method1565(var34, var35);
                var113 = var117 + 15;
                short var37 = 302;
                short var38 = 321;
                Statics.field3009.method1565(var37 - 73, var38 - 20);
                arg0.method3428(class145.field2171, var37, var38 + 5, 16777215, 0);
                short var39 = 462;
                Statics.field3009.method1565(var39 - 73, var38 - 20);
                arg0.method3428(class145.field2401, var39, var38 + 5, 16777215, 0);
                arg1.method3428(class145.field2390, 382, var38 + 36, 255, 0);
            }
        }
        if (field666 > 0) {
            int var40 = field666;
            short var41 = 256;
            field664 += var40 * 128;
            if (field664 > Statics.field648.length) {
                field664 -= Statics.field648.length;
                int var42 = (int) (Math.random() * 12.0D);
                method150(Statics.field652[var42]);
            }
            int var43 = 0;
            int var44 = var40 * 128;
            int var45 = (var41 - var40) * 128;
            for (int var46 = 0; var46 < var45; var46++) {
                int var47 = Statics.field663[var43 + var44] - Statics.field648[field664 + var43 & Statics.field648.length - 1] * var40 / 6;
                if (var47 < 0) {
                    var47 = 0;
                }
                Statics.field663[var43++] = var47;
            }
            for (int var48 = var41 - var40; var48 < var41; var48++) {
                int var49 = var48 * 128;
                for (int var50 = 0; var50 < 128; var50++) {
                    int var51 = (int) (Math.random() * 100.0D);
                    if (var51 < 50 && var50 > 10 && var50 < 118) {
                        Statics.field663[var49 + var50] = 255;
                    } else {
                        Statics.field663[var49 + var50] = 0;
                    }
                }
            }
            if (field661 > 0) {
                field661 -= var40 * 4;
            }
            if (field668 > 0) {
                field668 -= var40 * 4;
            }
            if (field661 == 0 && field668 == 0) {
                int var52 = (int) (Math.random() * (double) (2000 / var40));
                if (var52 == 0) {
                    field661 = 1024;
                }
                if (var52 == 1) {
                    field668 = 1024;
                }
            }
            for (int var53 = 0; var53 < var41 - var40; var53++) {
                field691[var53] = field691[var40 + var53];
            }
            for (int var54 = var41 - var40; var54 < var41; var54++) {
                field691[var54] = (int) (Math.sin((double) field667 / 14.0D) * 16.0D + Math.sin((double) field667 / 15.0D) * 14.0D + Math.sin((double) field667 / 16.0D) * 12.0D);
                field667++;
            }
            field679 += var40 * -1219414393;
            int var55 = ((client.field418 & 0x1) + var40) / 2;
            if (var55 > 0) {
                for (int var56 = 0; var56 < field679 * -1784123012; var56++) {
                    int var57 = (int) (Math.random() * 124.0D) + 2;
                    int var58 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field663[(var58 << 7) + var57] = 192;
                }
                field679 = 0;
                int var59 = 0;
                label300: while (true) {
                    if (var59 >= var41) {
                        int var63 = 0;
                        while (true) {
                            if (var63 >= 128) {
                                break label300;
                            }
                            int var64 = 0;
                            for (int var65 = -var55; var65 < var41; var65++) {
                                int var66 = var65 * 128;
                                if (var55 + var65 < var41) {
                                    var64 += Statics.field1891[var55 * 128 + var63 + var66];
                                }
                                if (var65 - (var55 + 1) >= 0) {
                                    var64 -= Statics.field1891[var63 + var66 - (var55 + 1) * 128];
                                }
                                if (var65 >= 0) {
                                    Statics.field663[var63 + var66] = var64 / (var55 * 2 + 1);
                                }
                            }
                            var63++;
                        }
                    }
                    int var60 = 0;
                    int var61 = var59 * 128;
                    for (int var62 = -var55; var62 < 128; var62++) {
                        if (var55 + var62 < 128) {
                            var60 += Statics.field663[var61 + var62 + var55];
                        }
                        if (var62 - (var55 + 1) >= 0) {
                            var60 -= Statics.field663[var61 + var62 - (var55 + 1)];
                        }
                        if (var62 >= 0) {
                            Statics.field1891[var61 + var62] = var60 / (var55 * 2 + 1);
                        }
                    }
                    var59++;
                }
            }
            field666 = 0;
        }
        short var67 = 256;
        if (field661 > 0) {
            for (int var68 = 0; var68 < 256; var68++) {
                if (field661 > 768) {
                    Statics.field659[var68] = method2695(Statics.field2676[var68], Statics.field1467[var68], 1024 - field661);
                } else if (field661 > 256) {
                    Statics.field659[var68] = Statics.field1467[var68];
                } else {
                    Statics.field659[var68] = method2695(Statics.field1467[var68], Statics.field2676[var68], 256 - field661);
                }
            }
        } else if (field668 > 0) {
            for (int var69 = 0; var69 < 256; var69++) {
                if (field668 > 768) {
                    Statics.field659[var69] = method2695(Statics.field2676[var69], Statics.field675[var69], 1024 - field668);
                } else if (field668 > 256) {
                    Statics.field659[var69] = Statics.field675[var69];
                } else {
                    Statics.field659[var69] = method2695(Statics.field675[var69], Statics.field2676[var69], 256 - field668);
                }
            }
        } else {
            for (int var70 = 0; var70 < 256; var70++) {
                Statics.field659[var70] = Statics.field2676[var70];
            }
        }
        class74.method1526(0, 9, 128, var67 + 7);
        Statics.field653.method1433(0, 0);
        class74.method1506();
        int var71 = 0;
        int var72 = 6885;
        for (int var73 = 1; var73 < var67 - 1; var73++) {
            int var74 = (var67 - var73) * field691[var73] / var67;
            int var75 = var74 + 22;
            if (var75 < 0) {
                var75 = 0;
            }
            var71 += var75;
            for (int var76 = var75; var76 < 128; var76++) {
                int var77 = Statics.field663[var71++];
                if (var77 == 0) {
                    var72++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field659[var77];
                    int var81 = Statics.field1877.field1312[var72];
                    Statics.field1877.field1312[var72++] = ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) + ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) >> 8;
                }
            }
            var72 += var75 + 765 - 128;
        }
        class74.method1526(637, 9, 765, var67 + 7);
        Statics.field654.method1433(382, 0);
        class74.method1506();
        int var82 = 0;
        int var83 = 7546;
        for (int var84 = 1; var84 < var67 - 1; var84++) {
            int var85 = (var67 - var84) * field691[var84] / var67;
            int var86 = 103 - var85;
            int var87 = var83 + var85;
            for (int var88 = 0; var88 < var86; var88++) {
                int var89 = Statics.field663[var82++];
                if (var89 == 0) {
                    var87++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field659[var89];
                    int var93 = Statics.field1877.field1312[var87];
                    Statics.field1877.field1312[var87++] = ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) + ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) >> 8;
                }
            }
            var82 += 128 - var86;
            var83 = 765 - var86 - var85 + var87;
        }
        Statics.field1316[Statics.field1296.field136 ? 1 : 0].method1565(725, 463);
        if (client.field270 > 5 && client.field321 == 0) {
            if (Statics.field1018 == null) {
                Statics.field1018 = class71.method31(Statics.field276, "sl_button", "");
            } else {
                byte var94 = 5;
                short var95 = 463;
                byte var96 = 100;
                byte var97 = 35;
                Statics.field1018.method1565(var94, var95);
                arg0.method3428(class145.field2330 + " " + client.field244, var96 / 2 + var94, var97 / 2 + var95 - 2, 16777215, 0);
                if (Statics.field585 == null) {
                    arg1.method3428(class145.field2310, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                } else {
                    arg1.method3428(class145.field2301, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var98 = Statics.field2154.getGraphics();
            Statics.field1877.method1377(var98, 0, 0);
        } catch (Exception var100) {
            Statics.field2154.repaint();
        }
    }

    @ObfuscatedName("l.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method63(String arg0, String arg1, String arg2) {
        field660 = arg0;
        field672 = arg1;
        field688 = arg2;
    }

    @ObfuscatedName("f.a(Lbf;B)V")
    public static final void method150(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field648.length; var2++) {
            Statics.field648[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field648[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2539[var8] = (Statics.field648[var8 - 1] + Statics.field648[var8 + 1] + Statics.field648[var8 - 128] + Statics.field648[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field648;
            Statics.field648 = Statics.field2539;
            Statics.field2539 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1343; var11++) {
            for (int var12 = 0; var12 < arg0.field1339; var12++) {
                if (arg0.field1344[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1341;
                    int var14 = var11 + 16 + arg0.field1342;
                    int var15 = (var14 << 7) + var13;
                    Statics.field648[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ea.b(IIIB)I")
    public static final int method2695(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("an.z(Lgw;Lgw;I)V")
    public static void method799(class205 arg0, class205 arg1) {
        if (Statics.field2145 == null) {
            Statics.field2145 = Statics.method87(Statics.field276, "sl_back", "");
        }
        if (Statics.field656 == null) {
            Statics.field656 = class71.method134(Statics.field276, "sl_flags", "");
        }
        if (Statics.field683 == null) {
            Statics.field683 = class71.method134(Statics.field276, "sl_arrows", "");
        }
        if (Statics.field2996 == null) {
            Statics.field2996 = class71.method134(Statics.field276, "sl_stars", "");
        }
        class74.method1513(0, 23, 765, 480, 0);
        class74.method1555(0, 0, 125, 23, 12425273, 9135624);
        class74.method1555(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3428(class145.field2290, 62, 15, 0, -1);
        if (Statics.field2996 != null) {
            Statics.field2996[1].method1565(140, 1);
            arg1.method3483(class145.field2320, 152, 10, 16777215, -1);
            Statics.field2996[0].method1565(140, 12);
            arg1.method3483(class145.field2404, 152, 21, 16777215, -1);
        }
        if (Statics.field683 != null) {
            short var2 = 280;
            if (field687[0] == 0 && field694[0] == 0) {
                Statics.field683[2].method1565(var2, 4);
            } else {
                Statics.field683[0].method1565(var2, 4);
            }
            if (field687[0] == 0 && field694[0] == 1) {
                Statics.field683[3].method1565(var2 + 15, 4);
            } else {
                Statics.field683[1].method1565(var2 + 15, 4);
            }
            arg0.method3483(class145.field2213, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field687[0] == 1 && field694[0] == 0) {
                Statics.field683[2].method1565(var3, 4);
            } else {
                Statics.field683[0].method1565(var3, 4);
            }
            if (field687[0] == 1 && field694[0] == 1) {
                Statics.field683[3].method1565(var3 + 15, 4);
            } else {
                Statics.field683[1].method1565(var3 + 15, 4);
            }
            arg0.method3483(class145.field2406, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field687[0] == 2 && field694[0] == 0) {
                Statics.field683[2].method1565(var4, 4);
            } else {
                Statics.field683[0].method1565(var4, 4);
            }
            if (field687[0] == 2 && field694[0] == 1) {
                Statics.field683[3].method1565(var4 + 15, 4);
            } else {
                Statics.field683[1].method1565(var4 + 15, 4);
            }
            arg0.method3483(class145.field2407, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field687[0] == 3 && field694[0] == 0) {
                Statics.field683[2].method1565(var5, 4);
            } else {
                Statics.field683[0].method1565(var5, 4);
            }
            if (field687[0] == 3 && field694[0] == 1) {
                Statics.field683[3].method1565(var5 + 15, 4);
            } else {
                Statics.field683[1].method1565(var5 + 15, 4);
            }
            arg0.method3483(class145.field2408, var5 + 32, 17, 16777215, -1);
        }
        class74.method1513(708, 4, 50, 16, 0);
        arg1.method3428(class145.field2401, 733, 16, 16777215, -1);
        field689 = -1;
        if (Statics.field2145 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field684) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field684) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field684) {
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
            for (int var20 = 0; var20 < field684; var20++) {
                class23 var21 = Statics.field1955[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field576);
                if (var21.field576 == -1) {
                    var23 = class145.field2409;
                    var22 = false;
                } else if (var21.field576 > 1980) {
                    var23 = class145.field2410;
                    var22 = false;
                }
                byte var24;
                if (var21.method484()) {
                    if (var21.method477()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method477()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class129.field2003 >= var17 && class129.field2004 >= var16 && class129.field2003 < var6 + var17 && class129.field2004 < var7 + var16 && var22) {
                    field689 = var20;
                    Statics.field2145[var24].method1439(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2145[var24].method1433(var17, var16);
                }
                if (Statics.field656 != null) {
                    Statics.field656[(var21.method477() ? 8 : 0) + var21.field580].method1565(var17 + 29, var16);
                }
                arg0.method3428(Integer.toString(var21.field577), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3428(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3477(Statics.field1955[field689].field575) + 6;
                int var26 = arg1.field2958 + 8;
                class74.method1513(class129.field2003 - var25 / 2, class129.field2004 + 20 + 5, var25, var26, 16777120);
                class74.method1515(class129.field2003 - var25 / 2, class129.field2004 + 20 + 5, var25, var26, 0);
                arg1.method3428(Statics.field1955[field689].field575, class129.field2003, class129.field2004 + 20 + 5 + arg1.field2958 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2154.getGraphics();
            Statics.field1877.method1377(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2154.repaint();
        }
    }

    @ObfuscatedName("ac.w(Lm;B)V")
    public static void method500(class23 arg0) {
        if (arg0.method477() != client.field508) {
            client.field508 = arg0.method477();
            boolean var1 = arg0.method477();
            if (Statics.field1042 != var1) {
                class46.field1059.method3157();
                class46.field1030.method3157();
                class46.field1031.method3157();
                Statics.field1042 = var1;
            }
        }
        Statics.field198 = arg0.field578;
        client.field244 = arg0.field577;
        client.field313 = arg0.field579;
        Statics.field1827 = client.field423 == 0 ? 43594 : arg0.field577 + 40000;
        Statics.field1522 = client.field423 == 0 ? 443 : arg0.field577 + 50000;
        Statics.field256 = Statics.field1827;
    }

    @ObfuscatedName("cg.j(B)V")
    public static void method2039() {
        try {
            if (Statics.field585 == null) {
                Statics.field585 = new class17(Statics.field2056, new URL(Statics.field465));
            } else {
                byte[] var0 = Statics.field585.method152();
                if (var0 != null) {
                    class108 var1 = new class108(var0);
                    field684 = var1.method2124();
                    Statics.field1955 = new class23[field684];
                    int var2 = 0;
                    while (var2 < field684) {
                        class23 var3 = Statics.field1955[var2] = new class23();
                        var3.field577 = var1.method2124();
                        var3.field579 = var1.method2127();
                        var3.field578 = var1.method2130();
                        var3.field575 = var1.method2130();
                        var3.field580 = var1.method2122();
                        var3.field576 = var1.method2125();
                        var3.field581 = var2++;
                    }
                    method3340(Statics.field1955, 0, Statics.field1955.length - 1, field687, field694);
                    field681 = true;
                    Statics.field585 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field585 = null;
        }
    }

    @ObfuscatedName("z.p(III)V")
    public static void method100(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field687[var5] != arg0) {
                var2[var4] = field687[var5];
                var3[var4] = field694[var5];
                var4++;
            }
        }
        field687 = var2;
        field694 = var3;
        method3340(Statics.field1955, 0, Statics.field1955.length - 1, field687, field694);
    }

    @ObfuscatedName("gd.n([Lm;II[I[IB)V")
    public static void method3340(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class23 var8 = arg0[var7];
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
                        var11 = arg0[var6].field581;
                        var12 = var8.field581;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field576;
                        var12 = var8.field576;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method477() ? 1 : 0;
                        var12 = var8.method477() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field577;
                        var12 = var8.field577;
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
                        var15 = arg0[var5].field581;
                        var16 = var8.field581;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field576;
                        var16 = var8.field576;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method477() ? 1 : 0;
                        var16 = var8.method477() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field577;
                        var16 = var8.field577;
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
                class23 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3340(arg0, arg1, var6, arg3, arg4);
        method3340(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
