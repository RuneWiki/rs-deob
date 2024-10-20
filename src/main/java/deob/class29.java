package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ae")
public class class29 {

    @ObfuscatedName("ae.p")
    public static int[] field661 = new int[256];

    @ObfuscatedName("ae.d")
    public static int field662 = 0;

    @ObfuscatedName("ae.m")
    public static int field668 = 0;

    @ObfuscatedName("ae.at")
    public static int field664 = 0;

    @ObfuscatedName("ae.ag")
    public static int field665 = 0;

    @ObfuscatedName("ae.ae")
    public static int field677 = 0;

    @ObfuscatedName("ae.ak")
    public static int field671 = 0;

    @ObfuscatedName("ae.ap")
    public static int field654 = 10;

    @ObfuscatedName("ae.ao")
    public static String field669 = "";

    @ObfuscatedName("ae.ac")
    public static int field670 = 0;

    @ObfuscatedName("ae.as")
    public static String field655 = "";

    @ObfuscatedName("ae.ai")
    public static String field681 = "";

    @ObfuscatedName("ae.ab")
    public static String field674 = "";

    @ObfuscatedName("ae.an")
    public static String field682 = "";

    @ObfuscatedName("ae.ah")
    public static String field675 = "";

    @ObfuscatedName("ae.ad")
    public static class147 field673 = class147.field2415;

    @ObfuscatedName("ae.am")
    public static boolean field687 = true;

    @ObfuscatedName("ae.ay")
    public static int field678 = 0;

    @ObfuscatedName("ae.au")
    public static String field679 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ae.aa")
    public static String field680 = "1234567890";

    @ObfuscatedName("ae.av")
    public static boolean field663 = false;

    @ObfuscatedName("ae.bh")
    public static int field683 = 0;

    @ObfuscatedName("ae.bq")
    public static int[] field684 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ae.br")
    public static int[] field685 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ae.bw")
    public static int field686 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.c(I)I")
    public static int method489() {
        return 8;
    }

    @ObfuscatedName("u.j(Ljava/awt/Component;Ler;Ler;ZII)V")
    public static void method470(Component arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (!Statics.field1879) {
            field670 = arg4;
            class74.method1528();
            byte[] var5 = arg1.method2763("title.jpg", "");
            Statics.field2932 = new class73(var5, arg0);
            Statics.field2950 = Statics.field2932.method1426();
            Statics.field1928 = class71.method107(arg2, "logo", "");
            Statics.field676 = class71.method107(arg2, "titlebox", "");
            Statics.field660 = class71.method107(arg2, "titlebutton", "");
            Statics.field656 = class71.method2728(arg2, "runes", "");
            Statics.field657 = class71.method2728(arg2, "title_mute", "");
            Statics.field658 = class71.method107(arg2, "options_radio_buttons,0", "");
            Statics.field2659 = class71.method107(arg2, "options_radio_buttons,2", "");
            Statics.field1808 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1808[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1808[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1808[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1808[var9 + 192] = 16777215;
            }
            Statics.field1892 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1892[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1892[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1892[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1892[var13 + 192] = 16777215;
            }
            Statics.field918 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field918[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field918[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field918[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field918[var17 + 192] = 16777215;
            }
            Statics.field1980 = new int[256];
            Statics.field1842 = new int[32768];
            Statics.field1866 = new int[32768];
            method792((class75) null);
            Statics.field585 = new int[32768];
            Statics.field1496 = new int[32768];
            if (arg3) {
                field682 = "";
                field675 = "";
            }
            Statics.field543 = 0;
            Statics.field1878 = "";
            field687 = true;
            field663 = false;
            if (Statics.field2103.field136) {
                Statics.method2551(2);
            } else {
                class164.method2548(2, Statics.field1503, "scape main", "", 255, false);
            }
            class153.method1802(false);
            Statics.field1879 = true;
            Statics.field2932.method1495(0, 0);
            Statics.field2950.method1495(382, 0);
            Statics.field1928.method1587(382 - Statics.field1928.field1315 / 2, 18);
        } else if (arg4 == 4) {
            field670 = 4;
        }
    }

    @ObfuscatedName("cg.y(B)V")
    public static void method1618() {
        if (!Statics.field1879) {
            return;
        }
        Statics.field676 = null;
        Statics.field660 = null;
        Statics.field656 = null;
        Statics.field2932 = null;
        Statics.field2950 = null;
        Statics.field1928 = null;
        Statics.field657 = null;
        Statics.field658 = null;
        Statics.field2659 = null;
        Statics.field2674 = null;
        Statics.field587 = null;
        Statics.field2470 = null;
        Statics.field184 = null;
        Statics.field1982 = null;
        Statics.field1808 = null;
        Statics.field1892 = null;
        Statics.field918 = null;
        Statics.field1980 = null;
        Statics.field1842 = null;
        Statics.field1866 = null;
        Statics.field585 = null;
        Statics.field1496 = null;
        Statics.method2551(2);
        class153.method1802(true);
        Statics.field1879 = false;
    }

    @ObfuscatedName("at.r(Len;I)V")
    public static void method530(class133 arg0) {
        if (!field663) {
            if ((class129.field1986 == 1 || !Statics.field2089 && class129.field1986 == 4) && class129.field1999 >= 715 && class129.field2000 >= 453) {
                Statics.field2103.field136 = !Statics.field2103.field136;
                class9.method669();
                if (Statics.field2103.field136) {
                    Statics.field2675.method3107();
                    class164.field2727 = 1;
                    Statics.field2734 = null;
                } else {
                    class150 var6 = Statics.field1503;
                    int var7 = var6.method2761("scape main");
                    int var8 = var6.method2762(var7, "");
                    class164.method1981(var6, var7, var8, 255, false);
                }
            }
            if (client.field257 != 5) {
                field677++;
                if (client.field257 == 10 || client.field257 == 11) {
                    if (client.field256 == 0) {
                        if (class129.field1986 == 1 || !Statics.field2089 && class129.field1986 == 4) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class129.field1999 >= var9 && class129.field1999 <= var9 + var11 && class129.field2000 >= var10 && class129.field2000 <= var10 + var12) {
                                method526();
                                return;
                            }
                        }
                        if (Statics.field1559 != null) {
                            method526();
                        }
                    }
                    int var13 = class129.field1986;
                    int var14 = class129.field1999;
                    int var15 = class129.field2000;
                    if (!Statics.field2089 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field670 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            String var18 = client.method806("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class127.method1801(var18, true, "openjs", false);
                        }
                        short var19 = 462;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field249 & 0x4) != 0) {
                                if ((client.field249 & 0x400) == 0) {
                                    field655 = class145.field2365;
                                    field681 = class145.field2366;
                                    field674 = class145.field2367;
                                } else {
                                    field655 = class145.field2232;
                                    field681 = class145.field2372;
                                    field674 = class145.field2373;
                                }
                                field670 = 1;
                                field678 = 0;
                            } else if ((client.field249 & 0x400) == 0) {
                                field655 = class145.field2361;
                                field681 = class145.field2241;
                                field674 = class145.field2363;
                                field670 = 2;
                                field678 = 0;
                            } else {
                                field655 = class145.field2368;
                                field681 = class145.field2291;
                                field674 = class145.field2154;
                                field670 = 1;
                                field678 = 0;
                            }
                        }
                    } else if (field670 == 1) {
                        while (class126.method2412()) {
                            if (Statics.field1266 == 84) {
                                field655 = class145.field2361;
                                field681 = class145.field2241;
                                field674 = class145.field2363;
                                field670 = 2;
                                field678 = 0;
                            } else if (Statics.field1266 == 13) {
                                field670 = 0;
                            }
                        }
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field655 = class145.field2361;
                            field681 = class145.field2241;
                            field674 = class145.field2363;
                            field670 = 2;
                            field678 = 0;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field670 = 0;
                        }
                    } else if (field670 == 2) {
                        short var23 = 231;
                        int var35 = var23 + 30;
                        if (var13 == 1 && var15 >= var35 - 15 && var15 < var35) {
                            field678 = 0;
                        }
                        var35 += 15;
                        if (var13 == 1 && var15 >= var35 - 15 && var15 < var35) {
                            field678 = 1;
                        }
                        var35 += 15;
                        short var24 = 302;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field682 = field682.trim();
                            if (field682.length() == 0) {
                                method25(class145.field2267, class145.field2268, class145.field2269);
                                return;
                            }
                            if (field675.length() == 0) {
                                method25(class145.field2270, class145.field2271, class145.field2272);
                                return;
                            }
                            method25(class145.field2283, class145.field2250, class145.field2378);
                            field673 = Statics.field2103.field145.containsKey(class211.method1008(field682)) ? class147.field2411 : class147.field2415;
                            client.method127(20);
                            return;
                        }
                        short var26 = 462;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field670 = 0;
                            field682 = "";
                            field675 = "";
                            Statics.field543 = 0;
                            Statics.field1878 = "";
                            field687 = true;
                        }
                        while (true) {
                            while (class126.method2412()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field679.length(); var28++) {
                                    if (Statics.field75 == field679.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1266 == 13) {
                                    field670 = 0;
                                    field682 = "";
                                    field675 = "";
                                    Statics.field543 = 0;
                                    Statics.field1878 = "";
                                    field687 = true;
                                } else if (field678 == 0) {
                                    if (Statics.field1266 == 85 && field682.length() > 0) {
                                        field682 = field682.substring(0, field682.length() - 1);
                                    }
                                    if (Statics.field1266 == 84 || Statics.field1266 == 80) {
                                        field678 = 1;
                                    }
                                    if (var27 && field682.length() < 320) {
                                        field682 = field682 + Statics.field75;
                                    }
                                } else if (field678 == 1) {
                                    if (Statics.field1266 == 85 && field675.length() > 0) {
                                        field675 = field675.substring(0, field675.length() - 1);
                                    }
                                    if (Statics.field1266 == 84 || Statics.field1266 == 80) {
                                        field678 = 0;
                                    }
                                    if (Statics.field1266 == 84) {
                                        field682 = field682.trim();
                                        if (field682.length() == 0) {
                                            method25(class145.field2267, class145.field2268, class145.field2269);
                                            return;
                                        }
                                        if (field675.length() == 0) {
                                            method25(class145.field2270, class145.field2271, class145.field2272);
                                            return;
                                        }
                                        method25(class145.field2283, class145.field2250, class145.field2378);
                                        field673 = Statics.field2103.field145.containsKey(class211.method1008(field682)) ? class147.field2411 : class147.field2415;
                                        client.method127(20);
                                        return;
                                    }
                                    if (var27 && field675.length() < 20) {
                                        field675 = field675 + Statics.field75;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field670 == 4) {
                        short var29 = 302;
                        short var30 = 321;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            Statics.field1878.trim();
                            if (Statics.field1878.length() != 6) {
                                method25(class145.field2377, class145.field2184, class145.field2185);
                                return;
                            }
                            Statics.field543 = Integer.parseInt(Statics.field1878);
                            Statics.field1878 = "";
                            field673 = field687 ? class147.field2410 : class147.field2416;
                            method25(class145.field2283, class145.field2250, class145.field2378);
                            client.method127(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= 373 && var14 <= 512 && var15 >= 263 && var15 <= 296) {
                            field687 = !field687;
                        }
                        if (var13 == 1 && var14 >= 348 && var14 <= 416 && var15 >= 351 && var15 <= 363) {
                            String var31 = client.method806("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class127.method1801(var31, true, "openjs", false);
                        }
                        short var32 = 462;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field670 = 0;
                            field682 = "";
                            field675 = "";
                            Statics.field543 = 0;
                            Statics.field1878 = "";
                        }
                        while (class126.method2412()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field680.length(); var34++) {
                                if (Statics.field75 == field680.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field1266 == 13) {
                                field670 = 0;
                                field682 = "";
                                field675 = "";
                                Statics.field543 = 0;
                                Statics.field1878 = "";
                            } else {
                                if (Statics.field1266 == 85 && Statics.field1878.length() > 0) {
                                    Statics.field1878 = Statics.field1878.substring(0, Statics.field1878.length() - 1);
                                }
                                if (Statics.field1266 == 84) {
                                    Statics.field1878.trim();
                                    if (Statics.field1878.length() != 6) {
                                        method25(class145.field2377, class145.field2184, class145.field2185);
                                        return;
                                    }
                                    Statics.field543 = Integer.parseInt(Statics.field1878);
                                    Statics.field1878 = "";
                                    field673 = field687 ? class147.field2410 : class147.field2416;
                                    method25(class145.field2283, class145.field2250, class145.field2378);
                                    client.method127(20);
                                    return;
                                }
                                if (var33 && Statics.field1878.length() < 6) {
                                    Statics.field1878 = Statics.field1878 + Statics.field75;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class129.field1986 == 1 || !Statics.field2089 && class129.field1986 == 4) {
            short var1 = 280;
            if (class129.field1999 >= var1 && class129.field1999 <= var1 + 14 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                method493(0, 0);
            } else if (class129.field1999 >= var1 + 15 && class129.field1999 <= var1 + 80 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                method493(0, 1);
            } else {
                short var2 = 390;
                if (class129.field1999 >= var2 && class129.field1999 <= var2 + 14 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                    method493(1, 0);
                } else if (class129.field1999 >= var2 + 15 && class129.field1999 <= var2 + 80 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                    method493(1, 1);
                } else {
                    short var3 = 500;
                    if (class129.field1999 >= var3 && class129.field1999 <= var3 + 14 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                        method493(2, 0);
                    } else if (class129.field1999 >= var3 + 15 && class129.field1999 <= var3 + 80 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                        method493(2, 1);
                    } else {
                        short var4 = 610;
                        if (class129.field1999 >= var4 && class129.field1999 <= var4 + 14 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                            method493(3, 0);
                        } else if (class129.field1999 >= var4 + 15 && class129.field1999 <= var4 + 80 && class129.field2000 >= 4 && class129.field2000 <= 18) {
                            method493(3, 1);
                        } else if (class129.field1999 >= 708 && class129.field2000 >= 4 && class129.field1999 <= 758 && class129.field2000 <= 20) {
                            field663 = false;
                            Statics.field2932.method1495(0, 0);
                            Statics.field2950.method1495(382, 0);
                            Statics.field1928.method1587(382 - Statics.field1928.field1315 / 2, 18);
                        } else if (field686 != -1) {
                            class23 var5 = Statics.field1746[field686];
                            method503(var5);
                            field663 = false;
                            Statics.field2932.method1495(0, 0);
                            Statics.field2950.method1495(382, 0);
                            Statics.field1928.method1587(382 - Statics.field1928.field1315 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.f(Lgt;Lgt;I)V")
    public static void method1899(class205 arg0, class205 arg1) {
        if (field663) {
            if (Statics.field2674 == null) {
                Statics.field2674 = class71.method488(Statics.field1004, "sl_back", "");
            }
            if (Statics.field587 == null) {
                Statics.field587 = class71.method2728(Statics.field1004, "sl_flags", "");
            }
            if (Statics.field2470 == null) {
                Statics.field2470 = class71.method2728(Statics.field1004, "sl_arrows", "");
            }
            if (Statics.field184 == null) {
                Statics.field184 = class71.method2728(Statics.field1004, "sl_stars", "");
            }
            class74.method1530(0, 23, 765, 480, 0);
            class74.method1531(0, 0, 125, 23, 12425273, 9135624);
            class74.method1531(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3513(class145.field2387, 62, 15, 0, -1);
            if (Statics.field184 != null) {
                Statics.field184[1].method1587(140, 1);
                arg1.method3497(class145.field2314, 152, 10, 16777215, -1);
                Statics.field184[0].method1587(140, 12);
                arg1.method3497(class145.field2389, 152, 21, 16777215, -1);
            }
            if (Statics.field2470 != null) {
                short var2 = 280;
                if (field684[0] == 0 && field685[0] == 0) {
                    Statics.field2470[2].method1587(var2, 4);
                } else {
                    Statics.field2470[0].method1587(var2, 4);
                }
                if (field684[0] == 0 && field685[0] == 1) {
                    Statics.field2470[3].method1587(var2 + 15, 4);
                } else {
                    Statics.field2470[1].method1587(var2 + 15, 4);
                }
                arg0.method3497(class145.field2260, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field684[0] == 1 && field685[0] == 0) {
                    Statics.field2470[2].method1587(var3, 4);
                } else {
                    Statics.field2470[0].method1587(var3, 4);
                }
                if (field684[0] == 1 && field685[0] == 1) {
                    Statics.field2470[3].method1587(var3 + 15, 4);
                } else {
                    Statics.field2470[1].method1587(var3 + 15, 4);
                }
                arg0.method3497(class145.field2391, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field684[0] == 2 && field685[0] == 0) {
                    Statics.field2470[2].method1587(var4, 4);
                } else {
                    Statics.field2470[0].method1587(var4, 4);
                }
                if (field684[0] == 2 && field685[0] == 1) {
                    Statics.field2470[3].method1587(var4 + 15, 4);
                } else {
                    Statics.field2470[1].method1587(var4 + 15, 4);
                }
                arg0.method3497(class145.field2175, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field684[0] == 3 && field685[0] == 0) {
                    Statics.field2470[2].method1587(var5, 4);
                } else {
                    Statics.field2470[0].method1587(var5, 4);
                }
                if (field684[0] == 3 && field685[0] == 1) {
                    Statics.field2470[3].method1587(var5 + 15, 4);
                } else {
                    Statics.field2470[1].method1587(var5 + 15, 4);
                }
                arg0.method3497(class145.field2393, var5 + 32, 17, 16777215, -1);
            }
            class74.method1530(708, 4, 50, 16, 0);
            arg1.method3513(class145.field2394, 733, 16, 16777215, -1);
            field686 = -1;
            if (Statics.field2674 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field683) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field683) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field683) {
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
                for (int var20 = 0; var20 < field683; var20++) {
                    class23 var21 = Statics.field1746[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field580);
                    if (var21.field580 == -1) {
                        var23 = class145.field2325;
                        var22 = false;
                    } else if (var21.field580 > 1980) {
                        var23 = class145.field2376;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method495()) {
                        if (var21.method494()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method494()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class129.field1987 >= var17 && class129.field1988 >= var16 && class129.field1987 < var6 + var17 && class129.field1988 < var7 + var16 && var22) {
                        field686 = var20;
                        Statics.field2674[var24].method1441(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field2674[var24].method1495(var17, var16);
                    }
                    if (Statics.field587 != null) {
                        Statics.field587[(var21.method494() ? 8 : 0) + var21.field583].method1587(var17 + 29, var16);
                    }
                    arg0.method3513(Integer.toString(var21.field584), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3513(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3439(Statics.field1746[field686].field582) + 6;
                    int var26 = arg1.field2961 + 8;
                    class74.method1530(class129.field1987 - var25 / 2, class129.field1988 + 20 + 5, var25, var26, 16777120);
                    class74.method1538(class129.field1987 - var25 / 2, class129.field1988 + 20 + 5, var25, var26, 0);
                    arg1.method3513(Statics.field1746[field686].field582, class129.field1987, class129.field1988 + 20 + 5 + arg1.field2961 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1007.getGraphics();
                Statics.field1120.method1367(var27, 0, 0);
            } catch (Exception var139) {
                Statics.field1007.repaint();
            }
            return;
        }
        if (client.field257 == 0 || client.field257 == 5) {
            byte var29 = 20;
            arg0.method3513(class145.field2318, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class74.method1538(230, var30, 304, 34, 9179409);
            class74.method1538(231, var30 + 1, 302, 32, 0);
            class74.method1530(232, var30 + 2, field654 * 3, 30, 9179409);
            class74.method1530(field654 * 3 + 232, var30 + 2, 300 - field654 * 3, 30, 0);
            arg0.method3513(field669, 382, 276 - var29, 16777215, -1);
        }
        if (client.field257 == 20) {
            Statics.field676.method1587(382 - Statics.field676.field1315 / 2, 271 - Statics.field676.field1316 / 2);
            short var31 = 211;
            arg0.method3513(field655, 382, var31, 16776960, 0);
            int var141 = var31 + 15;
            arg0.method3513(field681, 382, var141, 16776960, 0);
            int var142 = var141 + 15;
            arg0.method3513(field674, 382, var142, 16776960, 0);
            int var143 = var142 + 15;
            int var144 = var143 + 10;
            if (field670 != 4) {
                arg0.method3497(class145.field2379, 272, var144, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field682; arg0.method3439(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3497(class204.method3443(var33), 312, var144, 16777215, 0);
                var141 = var144 + 15;
                String var35 = class145.field2380;
                String var36 = field675;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3497(var35 + var40, 274, var141, 16777215, 0);
                var141 += 15;
            }
        }
        if (client.field257 == 10 || client.field257 == 11) {
            Statics.field676.method1587(202, 171);
            if (field670 == 0) {
                short var42 = 251;
                arg0.method3513(class145.field2382, 382, var42, 16776960, 0);
                int var145 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field660.method1587(var43 - 73, var44 - 20);
                arg0.method3447(class145.field2383, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field660.method1587(var45 - 73, var44 - 20);
                arg0.method3447(class145.field2369, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field670 == 1) {
                arg0.method3513(class145.field2364, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3513(field655, 382, var46, 16777215, 0);
                int var146 = var46 + 15;
                arg0.method3513(field681, 382, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method3513(field674, 382, var147, 16777215, 0);
                int var148 = var147 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field660.method1587(var47 - 73, var48 - 20);
                arg0.method3513(class145.field2156, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field660.method1587(var49 - 73, var48 - 20);
                arg0.method3513(class145.field2394, var49, var48 + 5, 16777215, 0);
            } else if (field670 == 2) {
                short var50 = 211;
                arg0.method3513(field655, 382, var50, 16776960, 0);
                int var149 = var50 + 15;
                arg0.method3513(field681, 382, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method3513(field674, 382, var150, 16776960, 0);
                int var151 = var150 + 15;
                int var152 = var151 + 10;
                arg0.method3497(class145.field2379, 272, var152, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field682; arg0.method3439(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3497(class204.method3443(var52) + (field678 == 0 & client.field493 % 40 < 20 ? class2.method2597(16776960) + class2.field18 : ""), 312, var152, 16777215, 0);
                var149 = var152 + 15;
                String var54 = class145.field2380;
                String var55 = field675;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3497(var54 + var59 + (field678 == 1 & client.field493 % 40 < 20 ? class2.method2597(16776960) + class2.field18 : ""), 274, var149, 16777215, 0);
                var149 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field660.method1587(var61 - 73, var62 - 20);
                arg0.method3513(class145.field2385, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field660.method1587(var63 - 73, var62 - 20);
                arg0.method3513(class145.field2394, var63, var62 + 5, 16777215, 0);
            } else if (field670 == 4) {
                arg0.method3513(class145.field2374, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3513(field655, 382, var64, 16777215, 0);
                int var153 = var64 + 15;
                arg0.method3513(field681, 382, var153, 16777215, 0);
                int var154 = var153 + 15;
                arg0.method3513(field674, 382, var154, 16777215, 0);
                int var155 = var154 + 15;
                String var66 = class145.field2190;
                String var67 = Statics.field1878;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3497(var66 + var71 + (client.field493 % 40 < 20 ? class2.method2597(16776960) + class2.field18 : ""), 274, var155, 16777215, 0);
                var153 = var155 - 8;
                arg0.method3497(class145.field2157, 373, var153, 16776960, 0);
                var153 += 15;
                arg0.method3497(class145.field2158, 373, var153, 16776960, 0);
                int var73 = 373 + arg0.method3439(class145.field2158) + 15;
                int var74 = var153 - arg0.field2961;
                class75 var75;
                if (field687) {
                    var75 = Statics.field2659;
                } else {
                    var75 = Statics.field658;
                }
                var75.method1587(var73, var74);
                var153 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field660.method1587(var76 - 73, var77 - 20);
                arg0.method3513(class145.field2156, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field660.method1587(var78 - 73, var77 - 20);
                arg0.method3513(class145.field2394, var78, var77 + 5, 16777215, 0);
                arg1.method3513(class145.field2375, 382, var77 + 36, 255, 0);
            }
        }
        if (field677 > 0) {
            int var79 = field677;
            short var80 = 256;
            field664 += var79 * 128;
            if (field664 > Statics.field1842.length) {
                field664 -= Statics.field1842.length;
                int var81 = (int) (Math.random() * 12.0D);
                method792(Statics.field656[var81]);
            }
            int var82 = 0;
            int var83 = var79 * 128;
            int var84 = (var80 - var79) * 128;
            for (int var85 = 0; var85 < var84; var85++) {
                int var86 = Statics.field585[var82 + var83] - Statics.field1842[field664 + var82 & Statics.field1842.length - 1] * var79 / 6;
                if (var86 < 0) {
                    var86 = 0;
                }
                Statics.field585[var82++] = var86;
            }
            for (int var87 = var80 - var79; var87 < var80; var87++) {
                int var88 = var87 * 128;
                for (int var89 = 0; var89 < 128; var89++) {
                    int var90 = (int) (Math.random() * 100.0D);
                    if (var90 < 50 && var89 > 10 && var89 < 118) {
                        Statics.field585[var88 + var89] = 255;
                    } else {
                        Statics.field585[var88 + var89] = 0;
                    }
                }
            }
            if (field662 > 0) {
                field662 -= var79 * 4;
            }
            if (field668 > 0) {
                field668 -= var79 * 4;
            }
            if (field662 == 0 && field668 == 0) {
                int var91 = (int) (Math.random() * (double) (2000 / var79));
                if (var91 == 0) {
                    field662 = 1024;
                }
                if (var91 == 1) {
                    field668 = 1024;
                }
            }
            for (int var92 = 0; var92 < var80 - var79; var92++) {
                field661[var92] = field661[var79 + var92];
            }
            for (int var93 = var80 - var79; var93 < var80; var93++) {
                field661[var93] = (int) (Math.sin((double) field671 / 14.0D) * 16.0D + Math.sin((double) field671 / 15.0D) * 14.0D + Math.sin((double) field671 / 16.0D) * 12.0D);
                field671++;
            }
            field665 += var79 * -1747813389;
            int var94 = ((client.field493 & 0x1) + var79) / 2;
            if (var94 > 0) {
                for (int var95 = 0; var95 < field665 * 392579852; var95++) {
                    int var96 = (int) (Math.random() * 124.0D) + 2;
                    int var97 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field585[(var97 << 7) + var96] = 192;
                }
                field665 = 0;
                int var98 = 0;
                label502: while (true) {
                    if (var98 >= var80) {
                        int var102 = 0;
                        while (true) {
                            if (var102 >= 128) {
                                break label502;
                            }
                            int var103 = 0;
                            for (int var104 = -var94; var104 < var80; var104++) {
                                int var105 = var104 * 128;
                                if (var94 + var104 < var80) {
                                    var103 += Statics.field1496[var94 * 128 + var102 + var105];
                                }
                                if (var104 - (var94 + 1) >= 0) {
                                    var103 -= Statics.field1496[var102 + var105 - (var94 + 1) * 128];
                                }
                                if (var104 >= 0) {
                                    Statics.field585[var102 + var105] = var103 / (var94 * 2 + 1);
                                }
                            }
                            var102++;
                        }
                    }
                    int var99 = 0;
                    int var100 = var98 * 128;
                    for (int var101 = -var94; var101 < 128; var101++) {
                        if (var94 + var101 < 128) {
                            var99 += Statics.field585[var100 + var101 + var94];
                        }
                        if (var101 - (var94 + 1) >= 0) {
                            var99 -= Statics.field585[var100 + var101 - (var94 + 1)];
                        }
                        if (var101 >= 0) {
                            Statics.field1496[var100 + var101] = var99 / (var94 * 2 + 1);
                        }
                    }
                    var98++;
                }
            }
            field677 = 0;
        }
        short var106 = 256;
        if (field662 > 0) {
            for (int var107 = 0; var107 < 256; var107++) {
                if (field662 > 768) {
                    Statics.field1980[var107] = method3161(Statics.field1808[var107], Statics.field1892[var107], 1024 - field662);
                } else if (field662 > 256) {
                    Statics.field1980[var107] = Statics.field1892[var107];
                } else {
                    Statics.field1980[var107] = method3161(Statics.field1892[var107], Statics.field1808[var107], 256 - field662);
                }
            }
        } else if (field668 > 0) {
            for (int var108 = 0; var108 < 256; var108++) {
                if (field668 > 768) {
                    Statics.field1980[var108] = method3161(Statics.field1808[var108], Statics.field918[var108], 1024 - field668);
                } else if (field668 > 256) {
                    Statics.field1980[var108] = Statics.field918[var108];
                } else {
                    Statics.field1980[var108] = method3161(Statics.field918[var108], Statics.field1808[var108], 256 - field668);
                }
            }
        } else {
            for (int var109 = 0; var109 < 256; var109++) {
                Statics.field1980[var109] = Statics.field1808[var109];
            }
        }
        class74.method1524(0, 9, 128, var106 + 7);
        Statics.field2932.method1495(0, 0);
        class74.method1566();
        int var110 = 0;
        int var111 = 6885;
        for (int var112 = 1; var112 < var106 - 1; var112++) {
            int var113 = (var106 - var112) * field661[var112] / var106;
            int var114 = var113 + 22;
            if (var114 < 0) {
                var114 = 0;
            }
            var110 += var114;
            for (int var115 = var114; var115 < 128; var115++) {
                int var116 = Statics.field585[var110++];
                if (var116 == 0) {
                    var111++;
                } else {
                    int var118 = 256 - var116;
                    int var119 = Statics.field1980[var116];
                    int var120 = Statics.field1120.field1288[var111];
                    Statics.field1120.field1288[var111++] = ((var119 & 0xFF00) * var116 + (var120 & 0xFF00) * var118 & 0xFF0000) + ((var119 & 0xFF00FF) * var116 + (var120 & 0xFF00FF) * var118 & 0xFF00FF00) >> 8;
                }
            }
            var111 += var114 + 765 - 128;
        }
        class74.method1524(637, 9, 765, var106 + 7);
        Statics.field2950.method1495(382, 0);
        class74.method1566();
        int var121 = 0;
        int var122 = 7546;
        for (int var123 = 1; var123 < var106 - 1; var123++) {
            int var124 = (var106 - var123) * field661[var123] / var106;
            int var125 = 103 - var124;
            int var126 = var122 + var124;
            for (int var127 = 0; var127 < var125; var127++) {
                int var128 = Statics.field585[var121++];
                if (var128 == 0) {
                    var126++;
                } else {
                    int var130 = 256 - var128;
                    int var131 = Statics.field1980[var128];
                    int var132 = Statics.field1120.field1288[var126];
                    Statics.field1120.field1288[var126++] = ((var131 & 0xFF00) * var128 + (var132 & 0xFF00) * var130 & 0xFF0000) + ((var131 & 0xFF00FF) * var128 + (var132 & 0xFF00FF) * var130 & 0xFF00FF00) >> 8;
                }
            }
            var121 += 128 - var125;
            var122 = 765 - var125 - var124 + var126;
        }
        Statics.field657[Statics.field2103.field136 ? 1 : 0].method1587(725, 463);
        if (client.field257 > 5 && client.field256 == 0) {
            if (Statics.field1982 == null) {
                Statics.field1982 = class71.method107(Statics.field1004, "sl_button", "");
            } else {
                byte var133 = 5;
                short var134 = 463;
                byte var135 = 100;
                byte var136 = 35;
                Statics.field1982.method1587(var133, var134);
                arg0.method3513(class145.field2315 + " " + client.field248, var135 / 2 + var133, var136 / 2 + var134 - 2, 16777215, 0);
                if (Statics.field1559 == null) {
                    arg1.method3513(class145.field2240, var135 / 2 + var133, var136 / 2 + var134 + 12, 16777215, 0);
                } else {
                    arg1.method3513(class145.field2229, var135 / 2 + var133, var136 / 2 + var134 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var137 = Statics.field1007.getGraphics();
            Statics.field1120.method1367(var137, 0, 0);
        } catch (Exception var140) {
            Statics.field1007.repaint();
        }
    }

    @ObfuscatedName("f.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method25(String arg0, String arg1, String arg2) {
        field655 = arg0;
        field681 = arg1;
        field674 = arg2;
    }

    @ObfuscatedName("am.b(Lbs;B)V")
    public static final void method792(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1842.length; var2++) {
            Statics.field1842[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1842[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1866[var8] = (Statics.field1842[var8 - 1] + Statics.field1842[var8 + 1] + Statics.field1842[var8 - 128] + Statics.field1842[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1842;
            Statics.field1842 = Statics.field1866;
            Statics.field1866 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1316; var11++) {
            for (int var12 = 0; var12 < arg0.field1315; var12++) {
                if (arg0.field1313[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1314;
                    int var14 = var11 + 16 + arg0.field1317;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1842[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fz.k(IIIS)I")
    public static final int method3161(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("q.g(Lq;I)V")
    public static void method503(class23 arg0) {
        if (arg0.method494() != client.field250) {
            client.field250 = arg0.method494();
            boolean var1 = arg0.method494();
            if (Statics.field1017 != var1) {
                class46.field1018.method3168();
                class46.field1019.method3168();
                class46.field1020.method3168();
                Statics.field1017 = var1;
            }
        }
        Statics.field174 = arg0.field581;
        client.field248 = arg0.field584;
        client.field249 = arg0.field589;
        Statics.field835 = client.field251 == 0 ? 43594 : arg0.field584 + 40000;
        Statics.field1891 = client.field251 == 0 ? 443 : arg0.field584 + 50000;
        Statics.field2765 = Statics.field835;
    }

    @ObfuscatedName("at.v(I)V")
    public static void method526() {
        try {
            if (Statics.field1559 == null) {
                Statics.field1559 = new class17(Statics.field122, new URL(Statics.field1867));
            } else {
                byte[] var0 = Statics.field1559.method139();
                if (var0 != null) {
                    class108 var1 = new class108(var0);
                    field683 = var1.method2136();
                    Statics.field1746 = new class23[field683];
                    int var2 = 0;
                    while (var2 < field683) {
                        class23 var3 = Statics.field1746[var2] = new class23();
                        var3.field584 = var1.method2136();
                        var3.field589 = var1.method2144();
                        var3.field581 = var1.method2216();
                        var3.field582 = var1.method2216();
                        var3.field583 = var1.method2134();
                        var3.field580 = var1.method2137();
                        var3.field579 = var2++;
                    }
                    method8(Statics.field1746, 0, Statics.field1746.length - 1, field684, field685);
                    field663 = true;
                    Statics.field1559 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1559 = null;
        }
    }

    @ObfuscatedName("q.i(IIB)V")
    public static void method493(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field684[var5] != arg0) {
                var2[var4] = field684[var5];
                var3[var4] = field685[var5];
                var4++;
            }
        }
        field684 = var2;
        field685 = var3;
        method8(Statics.field1746, 0, Statics.field1746.length - 1, field684, field685);
    }

    @ObfuscatedName("j.x([Lq;II[I[II)V")
    public static void method8(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field579;
                        var12 = var8.field579;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field580;
                        var12 = var8.field580;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method494() ? 1 : 0;
                        var12 = var8.method494() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field584;
                        var12 = var8.field584;
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
                        var15 = arg0[var5].field579;
                        var16 = var8.field579;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field580;
                        var16 = var8.field580;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method494() ? 1 : 0;
                        var16 = var8.method494() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field584;
                        var16 = var8.field584;
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
        method8(arg0, arg1, var6, arg3, arg4);
        method8(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
