package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("au")
public class class28 {

    @ObfuscatedName("au.u")
    public static int[] field658 = new int[256];

    @ObfuscatedName("au.s")
    public static int field659 = 0;

    @ObfuscatedName("au.r")
    public static int field660 = 0;

    @ObfuscatedName("au.ag")
    public static int field661 = 0;

    @ObfuscatedName("au.au")
    public static int field662 = 0;

    @ObfuscatedName("au.ak")
    public static int field672 = 0;

    @ObfuscatedName("au.aw")
    public static int field657 = 0;

    @ObfuscatedName("au.at")
    public static int field665 = 10;

    @ObfuscatedName("au.ah")
    public static String field663 = "";

    @ObfuscatedName("au.aj")
    public static int field667 = 0;

    @ObfuscatedName("au.an")
    public static String field668 = "";

    @ObfuscatedName("au.as")
    public static String field681 = "";

    @ObfuscatedName("au.ap")
    public static String field686 = "";

    @ObfuscatedName("au.ai")
    public static String field675 = "";

    @ObfuscatedName("au.av")
    public static String field671 = "";

    @ObfuscatedName("au.ae")
    public static class144 field673 = class144.field2410;

    @ObfuscatedName("au.az")
    public static boolean field650 = true;

    @ObfuscatedName("au.ad")
    public static int field676 = 0;

    @ObfuscatedName("au.ao")
    public static String field677 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("au.am")
    public static String field652 = "1234567890";

    @ObfuscatedName("au.ac")
    public static boolean field679 = false;

    @ObfuscatedName("au.bb")
    public static int field670 = 0;

    @ObfuscatedName("au.bh")
    public static int[] field682 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("au.bq")
    public static int[] field683 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("au.bc")
    public static int field684 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.k(Ley;Ley;I)I")
    public static int method599(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2715("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2715("logo", "")) {
            var2++;
        }
        if (arg1.method2715("titlebox", "")) {
            var2++;
        }
        if (arg1.method2715("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2715("runes", "")) {
            var2++;
        }
        if (arg1.method2715("title_mute", "")) {
            var2++;
        }
        if (arg1.method2716("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2716("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2715("sl_back", "");
        arg1.method2715("sl_flags", "");
        arg1.method2715("sl_arrows", "");
        arg1.method2715("sl_stars", "");
        arg1.method2715("sl_button", "");
        return var2;
    }

    @ObfuscatedName("be.b(I)I")
    public static int method1415() {
        return 8;
    }

    @ObfuscatedName("cd.e(Ljava/awt/Component;Ley;Ley;ZIB)V")
    public static void method1768(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field666) {
            field667 = arg4;
            class73.method1553();
            byte[] var5 = arg1.method2714("title.jpg", "");
            Statics.field1918 = new class72(var5, arg0);
            Statics.field1462 = Statics.field1918.method1423();
            Statics.field654 = class70.method140(arg2, "logo", "");
            Statics.field651 = class70.method140(arg2, "titlebox", "");
            Statics.field674 = class70.method140(arg2, "titlebutton", "");
            Statics.field653 = Statics.method76(arg2, "runes", "");
            Statics.field655 = Statics.method76(arg2, "title_mute", "");
            Statics.field1904 = class70.method140(arg2, "options_radio_buttons,0", "");
            Statics.field656 = class70.method140(arg2, "options_radio_buttons,2", "");
            Statics.field983 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field983[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field983[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field983[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field983[var9 + 192] = 16777215;
            }
            Statics.field2872 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2872[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2872[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2872[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2872[var13 + 192] = 16777215;
            }
            Statics.field594 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field594[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field594[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field594[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field594[var17 + 192] = 16777215;
            }
            Statics.field588 = new int[256];
            Statics.field535 = new int[32768];
            Statics.field523 = new int[32768];
            method505((class74) null);
            Statics.field1664 = new int[32768];
            Statics.field2000 = new int[32768];
            if (arg3) {
                field675 = "";
                field671 = "";
            }
            Statics.field669 = 0;
            Statics.field563 = "";
            field650 = true;
            field679 = false;
            if (Statics.field30.field138) {
                class161.method2533(2);
            } else {
                class161.method2413(2, Statics.field1251, "scape main", "", 255, false);
            }
            class150.method886(false);
            Statics.field666 = true;
            Statics.field1918.method1432(0, 0);
            Statics.field1462.method1432(382, 0);
            Statics.field654.method1565(382 - Statics.field654.field1327 / 2, 18);
        } else if (arg4 == 4) {
            field667 = 4;
        }
    }

    @ObfuscatedName("ej.i(B)V")
    public static void method2685() {
        if (!Statics.field666) {
            return;
        }
        Statics.field651 = null;
        Statics.field674 = null;
        Statics.field653 = null;
        Statics.field1918 = null;
        Statics.field1462 = null;
        Statics.field654 = null;
        Statics.field655 = null;
        Statics.field1904 = null;
        Statics.field656 = null;
        Statics.field246 = null;
        Statics.field680 = null;
        Statics.field1266 = null;
        Statics.field1523 = null;
        Statics.field206 = null;
        Statics.field983 = null;
        Statics.field2872 = null;
        Statics.field594 = null;
        Statics.field588 = null;
        Statics.field535 = null;
        Statics.field523 = null;
        Statics.field1664 = null;
        Statics.field2000 = null;
        class161.method2533(2);
        class150.method886(true);
        Statics.field666 = false;
    }

    @ObfuscatedName("at.t(Lem;S)V")
    public static void method574(class131 arg0) {
        if (field679) {
            method807(arg0);
            return;
        }
        if ((class127.field2022 == 1 || !Statics.field171 && class127.field2022 == 4) && class127.field2023 >= 715 && class127.field2015 >= 453) {
            Statics.field30.field138 = !Statics.field30.field138;
            class9.method2();
            if (Statics.field30.field138) {
                class161.method1383();
            } else {
                class161.method20(Statics.field1251, "scape main", "", 255, false);
            }
        }
        if (client.field263 == 5) {
            return;
        }
        field672++;
        if (client.field263 != 10 && client.field263 != 11) {
            return;
        }
        if (client.field261 == 0) {
            if (class127.field2022 == 1 || !Statics.field171 && class127.field2022 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class127.field2023 >= var1 && class127.field2023 <= var1 + var3 && class127.field2015 >= var2 && class127.field2015 <= var2 + var4) {
                    method887();
                    return;
                }
            }
            if (Statics.field2893 != null) {
                method887();
            }
        }
        int var5 = class127.field2022;
        int var6 = class127.field2023;
        int var7 = class127.field2015;
        if (!Statics.field171 && var5 == 4) {
            var5 = 1;
        }
        if (field667 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class125.method757(client.method1958("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field255 & 0x4) != 0) {
                    if ((client.field255 & 0x400) == 0) {
                        field668 = class142.field2370;
                        field681 = class142.field2371;
                        field686 = class142.field2401;
                    } else {
                        field668 = class142.field2376;
                        field681 = class142.field2338;
                        field686 = class142.field2378;
                    }
                    field667 = 1;
                    field676 = 0;
                } else if ((client.field255 & 0x400) == 0) {
                    field668 = class142.field2366;
                    field681 = class142.field2268;
                    field686 = class142.field2313;
                    field667 = 2;
                    field676 = 0;
                } else {
                    field668 = class142.field2373;
                    field681 = class142.field2340;
                    field686 = class142.field2375;
                    field667 = 1;
                    field676 = 0;
                }
            }
        } else if (field667 == 1) {
            while (class124.method2056()) {
                if (Statics.field2035 == 84) {
                    field668 = class142.field2366;
                    field681 = class142.field2268;
                    field686 = class142.field2313;
                    field667 = 2;
                    field676 = 0;
                } else if (Statics.field2035 == 13) {
                    field667 = 0;
                }
            }
            short var11 = 302;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field668 = class142.field2366;
                field681 = class142.field2268;
                field686 = class142.field2313;
                field667 = 2;
                field676 = 0;
            }
            short var13 = 462;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field667 = 0;
            }
        } else if (field667 == 2) {
            short var14 = 231;
            int var25 = var14 + 30;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field676 = 0;
            }
            var25 += 15;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field676 = 1;
            }
            var25 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field675 = field675.trim();
                if (field675.length() == 0) {
                    method2681(class142.field2272, class142.field2331, class142.field2274);
                    return;
                }
                if (field671.length() == 0) {
                    method2681(class142.field2289, class142.field2276, class142.field2277);
                    return;
                }
                method2681(class142.field2161, class142.field2358, class142.field2383);
                field673 = Statics.field30.field140.containsKey(class199.method2491(field675)) ? class144.field2413 : class144.field2410;
                client.method1870(20);
                return;
            }
            short var17 = 462;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field667 = 0;
                field675 = "";
                field671 = "";
                Statics.field669 = 0;
                Statics.field563 = "";
                field650 = true;
            }
            while (true) {
                while (class124.method2056()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field677.length(); var19++) {
                        if (Statics.field1536 == field677.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (Statics.field2035 == 13) {
                        field667 = 0;
                        field675 = "";
                        field671 = "";
                        Statics.field669 = 0;
                        Statics.field563 = "";
                        field650 = true;
                    } else if (field676 == 0) {
                        if (Statics.field2035 == 85 && field675.length() > 0) {
                            field675 = field675.substring(0, field675.length() - 1);
                        }
                        if (Statics.field2035 == 84 || Statics.field2035 == 80) {
                            field676 = 1;
                        }
                        if (var18 && field675.length() < 320) {
                            field675 = field675 + Statics.field1536;
                        }
                    } else if (field676 == 1) {
                        if (Statics.field2035 == 85 && field671.length() > 0) {
                            field671 = field671.substring(0, field671.length() - 1);
                        }
                        if (Statics.field2035 == 84 || Statics.field2035 == 80) {
                            field676 = 0;
                        }
                        if (Statics.field2035 == 84) {
                            field675 = field675.trim();
                            if (field675.length() == 0) {
                                method2681(class142.field2272, class142.field2331, class142.field2274);
                                return;
                            }
                            if (field671.length() == 0) {
                                method2681(class142.field2289, class142.field2276, class142.field2277);
                                return;
                            }
                            method2681(class142.field2161, class142.field2358, class142.field2383);
                            field673 = Statics.field30.field140.containsKey(class199.method2491(field675)) ? class144.field2413 : class144.field2410;
                            client.method1870(20);
                            return;
                        }
                        if (var18 && field671.length() < 20) {
                            field671 = field671 + Statics.field1536;
                        }
                    }
                }
                return;
            }
        } else if (field667 == 4) {
            short var20 = 302;
            short var21 = 321;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                Statics.field563.trim();
                if (Statics.field563.length() != 6) {
                    method2681(class142.field2188, class142.field2189, class142.field2390);
                    return;
                }
                Statics.field669 = Integer.parseInt(Statics.field563);
                Statics.field563 = "";
                field673 = field650 ? class144.field2409 : class144.field2412;
                method2681(class142.field2161, class142.field2358, class142.field2383);
                client.method1870(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field650 = !field650;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                class125.method757(client.method1958("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var22 = 462;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                field667 = 0;
                field675 = "";
                field671 = "";
                Statics.field669 = 0;
                Statics.field563 = "";
            }
            while (class124.method2056()) {
                boolean var23 = false;
                for (int var24 = 0; var24 < field652.length(); var24++) {
                    if (Statics.field1536 == field652.charAt(var24)) {
                        var23 = true;
                        break;
                    }
                }
                if (Statics.field2035 == 13) {
                    field667 = 0;
                    field675 = "";
                    field671 = "";
                    Statics.field669 = 0;
                    Statics.field563 = "";
                } else {
                    if (Statics.field2035 == 85 && Statics.field563.length() > 0) {
                        Statics.field563 = Statics.field563.substring(0, Statics.field563.length() - 1);
                    }
                    if (Statics.field2035 == 84) {
                        Statics.field563.trim();
                        if (Statics.field563.length() != 6) {
                            method2681(class142.field2188, class142.field2189, class142.field2390);
                            return;
                        }
                        Statics.field669 = Integer.parseInt(Statics.field563);
                        Statics.field563 = "";
                        field673 = field650 ? class144.field2409 : class144.field2412;
                        method2681(class142.field2161, class142.field2358, class142.field2383);
                        client.method1870(20);
                        return;
                    }
                    if (var23 && Statics.field563.length() < 6) {
                        Statics.field563 = Statics.field563 + Statics.field1536;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.z(Lgj;Lgj;B)V")
    public static void method2671(class193 arg0, class193 arg1) {
        if (field679) {
            if (Statics.field246 == null) {
                Statics.field246 = class70.method813(Statics.field199, "sl_back", "");
            }
            if (Statics.field680 == null) {
                Statics.field680 = Statics.method76(Statics.field199, "sl_flags", "");
            }
            if (Statics.field1266 == null) {
                Statics.field1266 = Statics.method76(Statics.field199, "sl_arrows", "");
            }
            if (Statics.field1523 == null) {
                Statics.field1523 = Statics.method76(Statics.field199, "sl_stars", "");
            }
            class73.method1517(0, 23, 765, 480, 0);
            class73.method1518(0, 0, 125, 23, 12425273, 9135624);
            class73.method1518(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3371(class142.field2392, 62, 15, 0, -1);
            if (Statics.field1523 != null) {
                Statics.field1523[1].method1565(140, 1);
                arg1.method3380(class142.field2393, 152, 10, 16777215, -1);
                Statics.field1523[0].method1565(140, 12);
                arg1.method3380(class142.field2394, 152, 21, 16777215, -1);
            }
            if (Statics.field1266 != null) {
                short var2 = 280;
                if (field682[0] == 0 && field683[0] == 0) {
                    Statics.field1266[2].method1565(var2, 4);
                } else {
                    Statics.field1266[0].method1565(var2, 4);
                }
                if (field682[0] == 0 && field683[0] == 1) {
                    Statics.field1266[3].method1565(var2 + 15, 4);
                } else {
                    Statics.field1266[1].method1565(var2 + 15, 4);
                }
                arg0.method3380(class142.field2288, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field682[0] == 1 && field683[0] == 0) {
                    Statics.field1266[2].method1565(var3, 4);
                } else {
                    Statics.field1266[0].method1565(var3, 4);
                }
                if (field682[0] == 1 && field683[0] == 1) {
                    Statics.field1266[3].method1565(var3 + 15, 4);
                } else {
                    Statics.field1266[1].method1565(var3 + 15, 4);
                }
                arg0.method3380(class142.field2396, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field682[0] == 2 && field683[0] == 0) {
                    Statics.field1266[2].method1565(var4, 4);
                } else {
                    Statics.field1266[0].method1565(var4, 4);
                }
                if (field682[0] == 2 && field683[0] == 1) {
                    Statics.field1266[3].method1565(var4 + 15, 4);
                } else {
                    Statics.field1266[1].method1565(var4 + 15, 4);
                }
                arg0.method3380(class142.field2217, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field682[0] == 3 && field683[0] == 0) {
                    Statics.field1266[2].method1565(var5, 4);
                } else {
                    Statics.field1266[0].method1565(var5, 4);
                }
                if (field682[0] == 3 && field683[0] == 1) {
                    Statics.field1266[3].method1565(var5 + 15, 4);
                } else {
                    Statics.field1266[1].method1565(var5 + 15, 4);
                }
                arg0.method3380(class142.field2398, var5 + 32, 17, 16777215, -1);
            }
            class73.method1517(708, 4, 50, 16, 0);
            arg1.method3371(class142.field2391, 733, 16, 16777215, -1);
            field684 = -1;
            if (Statics.field246 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field670) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
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
                for (int var20 = 0; var20 < field670; var20++) {
                    class22 var21 = Statics.field788[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field582);
                    if (var21.field582 == -1) {
                        var23 = class142.field2399;
                        var22 = false;
                    } else if (var21.field582 > 1980) {
                        var23 = class142.field2400;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method484()) {
                        if (var21.method483()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method483()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2010 >= var17 && class127.field2017 * -991203695 >= var16 && class127.field2010 < var6 + var17 && class127.field2017 * -991203695 < var7 + var16 && var22) {
                        field684 = var20;
                        Statics.field246[var24].method1421(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field246[var24].method1432(var17, var16);
                    }
                    if (Statics.field680 != null) {
                        Statics.field680[(var21.method483() ? 8 : 0) + var21.field580].method1565(var17 + 29, var16);
                    }
                    arg0.method3371(Integer.toString(var21.field587), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3371(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3421(Statics.field788[field684].field584) + 6;
                    int var26 = arg1.field2907 + 8;
                    class73.method1517(class127.field2010 - var25 / 2, class127.field2017 * -991203695 + 20 + 5, var25, var26, 16777120);
                    class73.method1520(class127.field2010 - var25 / 2, class127.field2017 * -991203695 + 20 + 5, var25, var26, 0);
                    arg1.method3371(Statics.field788[field684].field584, class127.field2010, class127.field2017 * -991203695 + 20 + 5 + arg1.field2907 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1657.getGraphics();
                Statics.field1684.method1338(var27, 0, 0);
            } catch (Exception var112) {
                Statics.field1657.repaint();
            }
            return;
        }
        if (client.field263 == 0 || client.field263 == 5) {
            byte var29 = 20;
            arg0.method3371(class142.field2293, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1520(230, var30, 304, 34, 9179409);
            class73.method1520(231, var30 + 1, 302, 32, 0);
            class73.method1517(232, var30 + 2, field665 * 3, 30, 9179409);
            class73.method1517(field665 * 3 + 232, var30 + 2, 300 - field665 * 3, 30, 0);
            arg0.method3371(field663, 382, 276 - var29, 16777215, -1);
        }
        if (client.field263 == 20) {
            Statics.field651.method1565(382 - Statics.field651.field1327 / 2, 271 - Statics.field651.field1325 / 2);
            short var31 = 211;
            arg0.method3371(field668, 382, var31, 16776960, 0);
            int var114 = var31 + 15;
            arg0.method3371(field681, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3371(field686, 382, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field667 != 4) {
                arg0.method3380(class142.field2384, 272, var117, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field675; arg0.method3421(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3380(class192.method3368(var33), 312, var117, 16777215, 0);
                var114 = var117 + 15;
                String var35 = class142.field2385;
                String var36 = field671;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3380(var35 + var40, 274, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field263 == 10 || client.field263 == 11) {
            Statics.field651.method1565(202, 171);
            if (field667 == 0) {
                short var42 = 251;
                arg0.method3371(class142.field2387, 382, var42, 16776960, 0);
                int var118 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field674.method1565(var43 - 73, var44 - 20);
                arg0.method3377(class142.field2388, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field674.method1565(var45 - 73, var44 - 20);
                arg0.method3377(class142.field2389, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field667 == 1) {
                arg0.method3371(class142.field2369, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3371(field668, 382, var46, 16777215, 0);
                int var119 = var46 + 15;
                arg0.method3371(field681, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3371(field686, 382, var120, 16777215, 0);
                int var121 = var120 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field674.method1565(var47 - 73, var48 - 20);
                arg0.method3371(class142.field2260, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field674.method1565(var49 - 73, var48 - 20);
                arg0.method3371(class142.field2391, var49, var48 + 5, 16777215, 0);
            } else if (field667 == 2) {
                short var50 = 211;
                arg0.method3371(field668, 382, var50, 16776960, 0);
                int var122 = var50 + 15;
                arg0.method3371(field681, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3371(field686, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3380(class142.field2384, 272, var125, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field675; arg0.method3421(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3380(class192.method3368(var52) + (field676 == 0 & client.field265 % 40 < 20 ? Statics.method558(16776960) + class2.field22 : ""), 312, var125, 16777215, 0);
                var122 = var125 + 15;
                String var54 = class142.field2385;
                String var55 = field671;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3380(var54 + var59 + (field676 == 1 & client.field265 % 40 < 20 ? Statics.method558(16776960) + class2.field22 : ""), 274, var122, 16777215, 0);
                var122 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field674.method1565(var61 - 73, var62 - 20);
                arg0.method3371(class142.field2275, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field674.method1565(var63 - 73, var62 - 20);
                arg0.method3371(class142.field2391, var63, var62 + 5, 16777215, 0);
            } else if (field667 == 4) {
                arg0.method3371(class142.field2310, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3371(field668, 382, var64, 16777215, 0);
                int var126 = var64 + 15;
                arg0.method3371(field681, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3371(field686, 382, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var66 = class142.field2291;
                String var67 = Statics.field563;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3380(var66 + var71 + (client.field265 % 40 < 20 ? Statics.method558(16776960) + class2.field22 : ""), 274, var128, 16777215, 0);
                var126 = var128 - 8;
                arg0.method3380(class142.field2210, 373, var126, 16776960, 0);
                var126 += 15;
                arg0.method3380(class142.field2292, 373, var126, 16776960, 0);
                int var73 = 373 + arg0.method3421(class142.field2292) + 15;
                int var74 = var126 - arg0.field2907;
                class74 var75;
                if (field650) {
                    var75 = Statics.field656;
                } else {
                    var75 = Statics.field1904;
                }
                var75.method1565(var73, var74);
                var126 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field674.method1565(var76 - 73, var77 - 20);
                arg0.method3371(class142.field2260, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field674.method1565(var78 - 73, var77 - 20);
                arg0.method3371(class142.field2391, var78, var77 + 5, 16777215, 0);
                arg1.method3371(class142.field2380, 382, var77 + 36, 255, 0);
            }
        }
        if (field672 > 0) {
            method177(field672);
            field672 = 0;
        }
        short var79 = 256;
        if (field659 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field659 > 768) {
                    Statics.field588[var80] = method1592(Statics.field983[var80], Statics.field2872[var80], 1024 - field659);
                } else if (field659 > 256) {
                    Statics.field588[var80] = Statics.field2872[var80];
                } else {
                    Statics.field588[var80] = method1592(Statics.field2872[var80], Statics.field983[var80], 256 - field659);
                }
            }
        } else if (field660 > 0) {
            for (int var81 = 0; var81 < 256; var81++) {
                if (field660 > 768) {
                    Statics.field588[var81] = method1592(Statics.field983[var81], Statics.field594[var81], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field588[var81] = Statics.field594[var81];
                } else {
                    Statics.field588[var81] = method1592(Statics.field594[var81], Statics.field983[var81], 256 - field660);
                }
            }
        } else {
            for (int var82 = 0; var82 < 256; var82++) {
                Statics.field588[var82] = Statics.field983[var82];
            }
        }
        class73.method1511(0, 9, 128, var79 + 7);
        Statics.field1918.method1432(0, 0);
        class73.method1510();
        int var83 = 0;
        int var84 = 6885;
        for (int var85 = 1; var85 < var79 - 1; var85++) {
            int var86 = (var79 - var85) * field658[var85] / var79;
            int var87 = var86 + 22;
            if (var87 < 0) {
                var87 = 0;
            }
            var83 += var87;
            for (int var88 = var87; var88 < 128; var88++) {
                int var89 = Statics.field1664[var83++];
                if (var89 == 0) {
                    var84++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field588[var89];
                    int var93 = Statics.field1684.field1303[var84];
                    Statics.field1684.field1303[var84++] = ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) >> 8;
                }
            }
            var84 += var87 + 765 - 128;
        }
        class73.method1511(637, 9, 765, var79 + 7);
        Statics.field1462.method1432(382, 0);
        class73.method1510();
        int var94 = 0;
        int var95 = 7546;
        for (int var96 = 1; var96 < var79 - 1; var96++) {
            int var97 = (var79 - var96) * field658[var96] / var79;
            int var98 = 103 - var97;
            int var99 = var95 + var97;
            for (int var100 = 0; var100 < var98; var100++) {
                int var101 = Statics.field1664[var94++];
                if (var101 == 0) {
                    var99++;
                } else {
                    int var103 = 256 - var101;
                    int var104 = Statics.field588[var101];
                    int var105 = Statics.field1684.field1303[var99];
                    Statics.field1684.field1303[var99++] = ((var104 & 0xFF00) * var101 + (var105 & 0xFF00) * var103 & 0xFF0000) + ((var104 & 0xFF00FF) * var101 + (var105 & 0xFF00FF) * var103 & 0xFF00FF00) >> 8;
                }
            }
            var94 += 128 - var98;
            var95 = 765 - var98 - var97 + var99;
        }
        Statics.field655[Statics.field30.field138 ? 1 : 0].method1565(725, 463);
        if (client.field263 > 5 && client.field261 == 0) {
            if (Statics.field206 == null) {
                Statics.field206 = class70.method140(Statics.field199, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field206.method1565(var106, var107);
                arg0.method3371(class142.field2320 + " " + client.field424, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field2893 == null) {
                    arg1.method3371(class142.field2301, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3371(class142.field2244, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field1657.getGraphics();
            Statics.field1684.method1338(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field1657.repaint();
        }
    }

    @ObfuscatedName("eu.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2681(String arg0, String arg1, String arg2) {
        field668 = arg0;
        field681 = arg1;
        field686 = arg2;
    }

    @ObfuscatedName("d.c(Lbu;B)V")
    public static final void method505(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field535.length; var2++) {
            Statics.field535[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field535[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field523[var8] = (Statics.field535[var8 - 1] + Statics.field535[var8 + 1] + Statics.field535[var8 - 128] + Statics.field535[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field535;
            Statics.field535 = Statics.field523;
            Statics.field523 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1325; var11++) {
            for (int var12 = 0; var12 < arg0.field1327; var12++) {
                if (arg0.field1329[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1331;
                    int var14 = var11 + 16 + arg0.field1330;
                    int var15 = (var14 << 7) + var13;
                    Statics.field535[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("n.o(IS)V")
    public static final void method177(int arg0) {
        short var1 = 256;
        field661 += arg0 * 128;
        if (field661 > Statics.field535.length) {
            field661 -= Statics.field535.length;
            int var2 = (int) (Math.random() * 12.0D);
            method505(Statics.field653[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1664[var3 + var4] - Statics.field535[field661 + var3 & Statics.field535.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1664[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1664[var9 + var10] = 255;
                } else {
                    Statics.field1664[var9 + var10] = 0;
                }
            }
        }
        if (field659 > 0) {
            field659 -= arg0 * 4;
        }
        if (field660 > 0) {
            field660 -= arg0 * 4;
        }
        if (field659 == 0 && field660 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field659 = 1024;
            }
            if (var12 == 1) {
                field660 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field658[var13] = field658[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field658[var14] = (int) (Math.sin((double) field657 / 14.0D) * 16.0D + Math.sin((double) field657 / 15.0D) * 14.0D + Math.sin((double) field657 / 16.0D) * 12.0D);
            field657++;
        }
        field662 += arg0 * -824807013;
        int var15 = ((client.field265 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field662 * 1535568236; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1664[(var18 << 7) + var17] = 192;
        }
        field662 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1664[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1664[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2000[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2000[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2000[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1664[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bz.q(IIII)I")
    public static final int method1592(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("az.w(Lem;I)V")
    public static void method807(class131 arg0) {
        if (class127.field2022 != 1 && Statics.field171 || class127.field2022 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2023 >= var1 && class127.field2023 <= var1 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(0, 0);
            return;
        }
        if (class127.field2023 >= var1 + 15 && class127.field2023 <= var1 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2023 >= var2 && class127.field2023 <= var2 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(1, 0);
            return;
        }
        if (class127.field2023 >= var2 + 15 && class127.field2023 <= var2 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2023 >= var3 && class127.field2023 <= var3 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(2, 0);
            return;
        }
        if (class127.field2023 >= var3 + 15 && class127.field2023 <= var3 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2023 >= var4 && class127.field2023 <= var4 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(3, 0);
            return;
        }
        if (class127.field2023 >= var4 + 15 && class127.field2023 <= var4 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method514(3, 1);
            return;
        }
        if (class127.field2023 >= 708 && class127.field2015 >= 4 && class127.field2023 <= 758 && class127.field2015 <= 20) {
            field679 = false;
            Statics.field1918.method1432(0, 0);
            Statics.field1462.method1432(382, 0);
            Statics.field654.method1565(382 - Statics.field654.field1327 / 2, 18);
            return;
        }
        if (field684 == -1) {
            return;
        }
        class22 var5 = Statics.field788[field684];
        method2419(var5);
        field679 = false;
        Statics.field1918.method1432(0, 0);
        Statics.field1462.method1432(382, 0);
        Statics.field654.method1565(382 - Statics.field654.field1327 / 2, 18);
        return;
    }

    @ObfuscatedName("do.y(Lr;B)V")
    public static void method2419(class22 arg0) {
        if (arg0.method483() != client.field259) {
            client.field259 = arg0.method483();
            class45.method1966(arg0.method483());
        }
        Statics.field291 = arg0.field583;
        client.field424 = arg0.field587;
        client.field255 = arg0.field581;
        Statics.field236 = client.field256 == 0 ? 43594 : arg0.field587 + 40000;
        Statics.field678 = client.field256 == 0 ? 443 : arg0.field587 + 50000;
        Statics.field1889 = Statics.field236;
    }

    @ObfuscatedName("am.p(I)V")
    public static void method887() {
        try {
            if (Statics.field2893 == null) {
                Statics.field2893 = new class17(Statics.field1005, new URL(Statics.field496));
            } else {
                byte[] var0 = Statics.field2893.method174();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field670 = var1.method2117();
                    Statics.field788 = new class22[field670];
                    int var2 = 0;
                    while (var2 < field670) {
                        class22 var3 = Statics.field788[var2] = new class22();
                        var3.field587 = var1.method2117();
                        var3.field581 = var1.method2120();
                        var3.field583 = var1.method2123();
                        var3.field584 = var1.method2123();
                        var3.field580 = var1.method2115();
                        var3.field582 = var1.method2118();
                        var3.field585 = var2++;
                    }
                    method74(Statics.field788, 0, Statics.field788.length - 1, field682, field683);
                    field679 = true;
                    Statics.field2893 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2893 = null;
        }
    }

    @ObfuscatedName("l.m(IIB)V")
    public static void method514(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field682[var5] != arg0) {
                var2[var4] = field682[var5];
                var3[var4] = field683[var5];
                var4++;
            }
        }
        field682 = var2;
        field683 = var3;
        method74(Statics.field788, 0, Statics.field788.length - 1, field682, field683);
    }

    @ObfuscatedName("z.a([Lr;II[I[II)V")
    public static void method74(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
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
                        var11 = arg0[var6].field585;
                        var12 = var8.field585;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field582;
                        var12 = var8.field582;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method483() ? 1 : 0;
                        var12 = var8.method483() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field587;
                        var12 = var8.field587;
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
                        var15 = arg0[var5].field585;
                        var16 = var8.field585;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field582;
                        var16 = var8.field582;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method483() ? 1 : 0;
                        var16 = var8.method483() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field587;
                        var16 = var8.field587;
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
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method74(arg0, arg1, var6, arg3, arg4);
        method74(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
