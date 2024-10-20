package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("au")
public class class28 {

    @ObfuscatedName("au.z")
    public static int[] field662 = new int[256];

    @ObfuscatedName("au.f")
    public static int field663 = 0;

    @ObfuscatedName("au.k")
    public static int field690 = 0;

    @ObfuscatedName("au.al")
    public static int field683 = 0;

    @ObfuscatedName("au.au")
    public static int field661 = 0;

    @ObfuscatedName("au.az")
    public static int field667 = 0;

    @ObfuscatedName("au.ag")
    public static int field668 = 0;

    @ObfuscatedName("au.aj")
    public static int field669 = 10;

    @ObfuscatedName("au.af")
    public static String field670 = "";

    @ObfuscatedName("au.am")
    public static int field671 = 0;

    @ObfuscatedName("au.aa")
    public static String field672 = "";

    @ObfuscatedName("au.ab")
    public static String field666 = "";

    @ObfuscatedName("au.ai")
    public static String field674 = "";

    @ObfuscatedName("au.ak")
    public static String field675 = "";

    @ObfuscatedName("au.ao")
    public static String field676 = "";

    @ObfuscatedName("au.ar")
    public static class144 field677 = class144.field2406;

    @ObfuscatedName("au.av")
    public static boolean field685 = true;

    @ObfuscatedName("au.ac")
    public static int field679 = 0;

    @ObfuscatedName("au.ay")
    public static String field680 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("au.ae")
    public static String field659 = "1234567890";

    @ObfuscatedName("au.aw")
    public static boolean field682 = false;

    @ObfuscatedName("au.bw")
    public static int field684 = 0;

    @ObfuscatedName("au.bk")
    public static int[] field665 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("au.bu")
    public static int[] field664 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("au.br")
    public static int field688 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.i(Ler;Ler;I)I")
    public static int method572(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2758("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2758("logo", "")) {
            var2++;
        }
        if (arg1.method2758("titlebox", "")) {
            var2++;
        }
        if (arg1.method2758("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2758("runes", "")) {
            var2++;
        }
        if (arg1.method2758("title_mute", "")) {
            var2++;
        }
        if (arg1.method2794("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2794("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2758("sl_back", "");
        arg1.method2758("sl_flags", "");
        arg1.method2758("sl_arrows", "");
        arg1.method2758("sl_stars", "");
        arg1.method2758("sl_button", "");
        return var2;
    }

    @ObfuscatedName("k.c(I)I")
    public static int method490() {
        return 8;
    }

    @ObfuscatedName("y.h(Ljava/awt/Component;Ler;Ler;ZIB)V")
    public static void method118(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field689) {
            field671 = arg4;
            class73.method1543();
            byte[] var5 = arg1.method2757("title.jpg", "");
            Statics.field658 = new class72(var5, arg0);
            Statics.field692 = Statics.field658.method1481();
            Statics.field660 = class70.method156(arg2, "logo", "");
            Statics.field655 = class70.method156(arg2, "titlebox", "");
            Statics.field681 = class70.method156(arg2, "titlebutton", "");
            Statics.field687 = class70.method595(arg2, "runes", "");
            Statics.field66 = class70.method595(arg2, "title_mute", "");
            Statics.field678 = class70.method156(arg2, "options_radio_buttons,0", "");
            Statics.field2882 = class70.method156(arg2, "options_radio_buttons,2", "");
            Statics.field1825 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1825[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1825[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1825[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1825[var9 + 192] = 16777215;
            }
            Statics.field731 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field731[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field731[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field731[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field731[var13 + 192] = 16777215;
            }
            Statics.field244 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field244[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field244[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field244[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field244[var17 + 192] = 16777215;
            }
            Statics.field1885 = new int[256];
            Statics.field613 = new int[32768];
            Statics.field29 = new int[32768];
            method517((class74) null);
            Statics.field129 = new int[32768];
            Statics.field2112 = new int[32768];
            if (arg3) {
                field675 = "";
                field676 = "";
            }
            Statics.field587 = 0;
            Statics.field1303 = "";
            field685 = true;
            field682 = false;
            if (Statics.field1357.field147) {
                class161.field2710 = 1;
                Statics.field1805 = null;
                Statics.field1978 = -1;
                Statics.field2714 = -1;
                Statics.field2715 = 0;
                Statics.field1822 = false;
                Statics.field68 = 2;
            } else {
                class161.method521(2, Statics.field2899, "scape main", "", 255, false);
            }
            class150.method2734(false);
            Statics.field689 = true;
            Statics.field658.method1451(0, 0);
            Statics.field692.method1451(382, 0);
            Statics.field660.method1599(382 - Statics.field660.field1328 / 2, 18);
        } else if (arg4 == 4) {
            field671 = 4;
        }
    }

    @ObfuscatedName("gv.v(B)V")
    public static void method3337() {
        if (!Statics.field689) {
            return;
        }
        Statics.field655 = null;
        Statics.field681 = null;
        Statics.field687 = null;
        Statics.field658 = null;
        Statics.field692 = null;
        Statics.field660 = null;
        Statics.field66 = null;
        Statics.field678 = null;
        Statics.field2882 = null;
        Statics.field188 = null;
        Statics.field618 = null;
        Statics.field594 = null;
        Statics.field657 = null;
        Statics.field605 = null;
        Statics.field1825 = null;
        Statics.field731 = null;
        Statics.field244 = null;
        Statics.field1885 = null;
        Statics.field613 = null;
        Statics.field29 = null;
        Statics.field129 = null;
        Statics.field2112 = null;
        class161.field2710 = 1;
        Statics.field1805 = null;
        Statics.field1978 = -1;
        Statics.field2714 = -1;
        Statics.field2715 = 0;
        Statics.field1822 = false;
        Statics.field68 = 2;
        class150.method2734(true);
        Statics.field689 = false;
    }

    @ObfuscatedName("cl.q(Leo;I)V")
    public static void method2094(class131 arg0) {
        if (!field682) {
            if ((class127.field2002 == 1 || !Statics.field346 && class127.field2002 == 4) && class127.field2003 >= 715 && class127.field1999 >= 453) {
                Statics.field1357.field147 = !Statics.field1357.field147;
                class9.method2552();
                if (Statics.field1357.field147) {
                    class161.method1028();
                } else {
                    class147 var6 = Statics.field2899;
                    int var7 = var6.method2815("scape main");
                    int var8 = var6.method2756(var7, "");
                    class161.method2666(var6, var7, var8, 255, false);
                }
            }
            if (client.field264 != 5) {
                field667++;
                if (client.field264 == 10 || client.field264 == 11) {
                    if (client.field265 == 0) {
                        if (class127.field2002 == 1 || !Statics.field346 && class127.field2002 == 4) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class127.field2003 >= var9 && class127.field2003 <= var9 + var11 && class127.field1999 >= var10 && class127.field1999 <= var10 + var12) {
                                method795();
                                return;
                            }
                        }
                        if (Statics.field646 != null) {
                            method795();
                        }
                    }
                    int var13 = class127.field2002;
                    int var14 = class127.field2003;
                    int var15 = class127.field1999;
                    if (!Statics.field346 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field671 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            String var18 = client.method3179("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class125.method502(var18, true, "openjs", false);
                        }
                        short var19 = 462;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field259 & 0x4) != 0) {
                                if ((client.field259 & 0x400) == 0) {
                                    field672 = class142.field2356;
                                    field666 = class142.field2357;
                                    field674 = class142.field2358;
                                } else {
                                    field672 = class142.field2362;
                                    field666 = class142.field2363;
                                    field674 = class142.field2364;
                                }
                                field671 = 1;
                                field679 = 0;
                            } else if ((client.field259 & 0x400) == 0) {
                                field672 = class142.field2352;
                                field666 = class142.field2353;
                                field674 = class142.field2149;
                                field671 = 2;
                                field679 = 0;
                            } else {
                                field672 = class142.field2232;
                                field666 = class142.field2179;
                                field674 = class142.field2361;
                                field671 = 1;
                                field679 = 0;
                            }
                        }
                    } else if (field671 == 1) {
                        while (class124.method708()) {
                            if (Statics.field2409 == 84) {
                                field672 = class142.field2352;
                                field666 = class142.field2353;
                                field674 = class142.field2149;
                                field671 = 2;
                                field679 = 0;
                            } else if (Statics.field2409 == 13) {
                                field671 = 0;
                            }
                        }
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field672 = class142.field2352;
                            field666 = class142.field2353;
                            field674 = class142.field2149;
                            field671 = 2;
                            field679 = 0;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field671 = 0;
                        }
                    } else if (field671 == 2) {
                        short var23 = 231;
                        int var35 = var23 + 30;
                        if (var13 == 1 && var15 >= var35 - 15 && var15 < var35) {
                            field679 = 0;
                        }
                        var35 += 15;
                        if (var13 == 1 && var15 >= var35 - 15 && var15 < var35) {
                            field679 = 1;
                        }
                        var35 += 15;
                        short var24 = 302;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field675 = field675.trim();
                            if (field675.length() == 0) {
                                method2410(class142.field2250, class142.field2155, class142.field2260);
                                return;
                            }
                            if (field676.length() == 0) {
                                method2410(class142.field2261, class142.field2262, class142.field2263);
                                return;
                            }
                            method2410(class142.field2367, class142.field2185, class142.field2348);
                            field677 = Statics.field1357.field158.containsKey(class199.method3177(field675)) ? class144.field2407 : class144.field2406;
                            client.method131(20);
                            return;
                        }
                        short var26 = 462;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field671 = 0;
                            field675 = "";
                            field676 = "";
                            Statics.field587 = 0;
                            Statics.field1303 = "";
                            field685 = true;
                        }
                        while (true) {
                            while (class124.method708()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field680.length(); var28++) {
                                    if (Statics.field1059 == field680.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2409 == 13) {
                                    field671 = 0;
                                    field675 = "";
                                    field676 = "";
                                    Statics.field587 = 0;
                                    Statics.field1303 = "";
                                    field685 = true;
                                } else if (field679 == 0) {
                                    if (Statics.field2409 == 85 && field675.length() > 0) {
                                        field675 = field675.substring(0, field675.length() - 1);
                                    }
                                    if (Statics.field2409 == 84 || Statics.field2409 == 80) {
                                        field679 = 1;
                                    }
                                    if (var27 && field675.length() < 320) {
                                        field675 = field675 + Statics.field1059;
                                    }
                                } else if (field679 == 1) {
                                    if (Statics.field2409 == 85 && field676.length() > 0) {
                                        field676 = field676.substring(0, field676.length() - 1);
                                    }
                                    if (Statics.field2409 == 84 || Statics.field2409 == 80) {
                                        field679 = 0;
                                    }
                                    if (Statics.field2409 == 84) {
                                        field675 = field675.trim();
                                        if (field675.length() == 0) {
                                            method2410(class142.field2250, class142.field2155, class142.field2260);
                                            return;
                                        }
                                        if (field676.length() == 0) {
                                            method2410(class142.field2261, class142.field2262, class142.field2263);
                                            return;
                                        }
                                        method2410(class142.field2367, class142.field2185, class142.field2348);
                                        field677 = Statics.field1357.field158.containsKey(class199.method3177(field675)) ? class144.field2407 : class144.field2406;
                                        client.method131(20);
                                        return;
                                    }
                                    if (var27 && field676.length() < 20) {
                                        field676 = field676 + Statics.field1059;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field671 == 4) {
                        short var29 = 302;
                        short var30 = 321;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            Statics.field1303.trim();
                            if (Statics.field1303.length() != 6) {
                                method2410(class142.field2174, class142.field2175, class142.field2176);
                                return;
                            }
                            Statics.field587 = Integer.parseInt(Statics.field1303);
                            Statics.field1303 = "";
                            field677 = field685 ? class144.field2405 : class144.field2403;
                            method2410(class142.field2367, class142.field2185, class142.field2348);
                            client.method131(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= 373 && var14 <= 512 && var15 >= 263 && var15 <= 296) {
                            field685 = !field685;
                        }
                        if (var13 == 1 && var14 >= 348 && var14 <= 416 && var15 >= 351 && var15 <= 363) {
                            String var31 = client.method3179("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class125.method502(var31, true, "openjs", false);
                        }
                        short var32 = 462;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field671 = 0;
                            field675 = "";
                            field676 = "";
                            Statics.field587 = 0;
                            Statics.field1303 = "";
                        }
                        while (class124.method708()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field659.length(); var34++) {
                                if (Statics.field1059 == field659.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field2409 == 13) {
                                field671 = 0;
                                field675 = "";
                                field676 = "";
                                Statics.field587 = 0;
                                Statics.field1303 = "";
                            } else {
                                if (Statics.field2409 == 85 && Statics.field1303.length() > 0) {
                                    Statics.field1303 = Statics.field1303.substring(0, Statics.field1303.length() - 1);
                                }
                                if (Statics.field2409 == 84) {
                                    Statics.field1303.trim();
                                    if (Statics.field1303.length() != 6) {
                                        method2410(class142.field2174, class142.field2175, class142.field2176);
                                        return;
                                    }
                                    Statics.field587 = Integer.parseInt(Statics.field1303);
                                    Statics.field1303 = "";
                                    field677 = field685 ? class144.field2405 : class144.field2403;
                                    method2410(class142.field2367, class142.field2185, class142.field2348);
                                    client.method131(20);
                                    return;
                                }
                                if (var33 && Statics.field1303.length() < 6) {
                                    Statics.field1303 = Statics.field1303 + Statics.field1059;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field2002 == 1 || !Statics.field346 && class127.field2002 == 4) {
            short var1 = 280;
            if (class127.field2003 >= var1 && class127.field2003 <= var1 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                method164(0, 0);
            } else if (class127.field2003 >= var1 + 15 && class127.field2003 <= var1 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                method164(0, 1);
            } else {
                short var2 = 390;
                if (class127.field2003 >= var2 && class127.field2003 <= var2 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                    method164(1, 0);
                } else if (class127.field2003 >= var2 + 15 && class127.field2003 <= var2 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                    method164(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field2003 >= var3 && class127.field2003 <= var3 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                        method164(2, 0);
                    } else if (class127.field2003 >= var3 + 15 && class127.field2003 <= var3 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                        method164(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field2003 >= var4 && class127.field2003 <= var4 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                            method164(3, 0);
                        } else if (class127.field2003 >= var4 + 15 && class127.field2003 <= var4 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                            method164(3, 1);
                        } else if (class127.field2003 >= 708 && class127.field1999 >= 4 && class127.field2003 <= 758 && class127.field1999 <= 20) {
                            field682 = false;
                            Statics.field658.method1451(0, 0);
                            Statics.field692.method1451(382, 0);
                            Statics.field660.method1599(382 - Statics.field660.field1328 / 2, 18);
                        } else if (field688 != -1) {
                            class22 var5 = Statics.field1859[field688];
                            method2718(var5);
                            field682 = false;
                            Statics.field658.method1451(0, 0);
                            Statics.field692.method1451(382, 0);
                            Statics.field660.method1599(382 - Statics.field660.field1328 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2410(String arg0, String arg1, String arg2) {
        field672 = arg0;
        field666 = arg1;
        field674 = arg2;
    }

    @ObfuscatedName("j.u(Lbb;I)V")
    public static final void method517(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field613.length; var2++) {
            Statics.field613[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field613[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field29[var8] = (Statics.field613[var8 - 1] + Statics.field613[var8 + 1] + Statics.field613[var8 - 128] + Statics.field613[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field613;
            Statics.field613 = Statics.field29;
            Statics.field29 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1326; var11++) {
            for (int var12 = 0; var12 < arg0.field1328; var12++) {
                if (arg0.field1333[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1330;
                    int var14 = var11 + 16 + arg0.field1331;
                    int var15 = (var14 << 7) + var13;
                    Statics.field613[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("y.d(IIII)I")
    public static final int method119(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("q.y(B)V")
    public static final void method31() {
        short var0 = 256;
        if (field663 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field663 > 768) {
                    Statics.field1885[var1] = method119(Statics.field1825[var1], Statics.field731[var1], 1024 - field663);
                } else if (field663 > 256) {
                    Statics.field1885[var1] = Statics.field731[var1];
                } else {
                    Statics.field1885[var1] = method119(Statics.field731[var1], Statics.field1825[var1], 256 - field663);
                }
            }
        } else if (field690 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field690 > 768) {
                    Statics.field1885[var2] = method119(Statics.field1825[var2], Statics.field244[var2], 1024 - field690);
                } else if (field690 > 256) {
                    Statics.field1885[var2] = Statics.field244[var2];
                } else {
                    Statics.field1885[var2] = method119(Statics.field244[var2], Statics.field1825[var2], 256 - field690);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1885[var3] = Statics.field1825[var3];
            }
        }
        class73.method1539(0, 9, 128, var0 + 7);
        Statics.field658.method1451(0, 0);
        class73.method1538();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field662[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field129[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1885[var10];
                    int var14 = Statics.field1280.field1299[var5];
                    Statics.field1280.field1299[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1539(637, 9, 765, var0 + 7);
        Statics.field692.method1451(382, 0);
        class73.method1538();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field662[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field129[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1885[var22];
                    int var26 = Statics.field1280.field1299[var20];
                    Statics.field1280.field1299[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("fu.e(Lgi;Lgi;I)V")
    public static void method2973(class193 arg0, class193 arg1) {
        if (Statics.field188 == null) {
            Statics.field188 = class70.method602(Statics.field1759, "sl_back", "");
        }
        if (Statics.field618 == null) {
            Statics.field618 = class70.method595(Statics.field1759, "sl_flags", "");
        }
        if (Statics.field594 == null) {
            Statics.field594 = class70.method595(Statics.field1759, "sl_arrows", "");
        }
        if (Statics.field657 == null) {
            Statics.field657 = class70.method595(Statics.field1759, "sl_stars", "");
        }
        class73.method1545(0, 23, 765, 480, 0);
        class73.method1546(0, 0, 125, 23, 12425273, 9135624);
        class73.method1546(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3389(class142.field2378, 62, 15, 0, -1);
        if (Statics.field657 != null) {
            Statics.field657[1].method1599(140, 1);
            arg1.method3392(class142.field2229, 152, 10, 16777215, -1);
            Statics.field657[0].method1599(140, 12);
            arg1.method3392(class142.field2154, 152, 21, 16777215, -1);
        }
        if (Statics.field594 != null) {
            short var2 = 280;
            if (field665[0] == 0 && field664[0] == 0) {
                Statics.field594[2].method1599(var2, 4);
            } else {
                Statics.field594[0].method1599(var2, 4);
            }
            if (field665[0] == 0 && field664[0] == 1) {
                Statics.field594[3].method1599(var2 + 15, 4);
            } else {
                Statics.field594[1].method1599(var2 + 15, 4);
            }
            arg0.method3392(class142.field2258, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field665[0] == 1 && field664[0] == 0) {
                Statics.field594[2].method1599(var3, 4);
            } else {
                Statics.field594[0].method1599(var3, 4);
            }
            if (field665[0] == 1 && field664[0] == 1) {
                Statics.field594[3].method1599(var3 + 15, 4);
            } else {
                Statics.field594[1].method1599(var3 + 15, 4);
            }
            arg0.method3392(class142.field2360, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field665[0] == 2 && field664[0] == 0) {
                Statics.field594[2].method1599(var4, 4);
            } else {
                Statics.field594[0].method1599(var4, 4);
            }
            if (field665[0] == 2 && field664[0] == 1) {
                Statics.field594[3].method1599(var4 + 15, 4);
            } else {
                Statics.field594[1].method1599(var4 + 15, 4);
            }
            arg0.method3392(class142.field2383, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field665[0] == 3 && field664[0] == 0) {
                Statics.field594[2].method1599(var5, 4);
            } else {
                Statics.field594[0].method1599(var5, 4);
            }
            if (field665[0] == 3 && field664[0] == 1) {
                Statics.field594[3].method1599(var5 + 15, 4);
            } else {
                Statics.field594[1].method1599(var5 + 15, 4);
            }
            arg0.method3392(class142.field2384, var5 + 32, 17, 16777215, -1);
        }
        class73.method1545(708, 4, 50, 16, 0);
        arg1.method3389(class142.field2377, 733, 16, 16777215, -1);
        field688 = -1;
        if (Statics.field188 != null) {
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
                class22 var21 = Statics.field1859[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field581);
                if (var21.field581 == -1) {
                    var23 = class142.field2385;
                    var22 = false;
                } else if (var21.field581 > 1980) {
                    var23 = class142.field2386;
                    var22 = false;
                }
                byte var24;
                if (var21.method492()) {
                    if (var21.method491()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method491()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field1996 >= var17 && class127.field1997 * -153904067 >= var16 && class127.field1996 < var6 + var17 && class127.field1997 * -153904067 < var7 + var16 && var22) {
                    field688 = var20;
                    Statics.field188[var24].method1456(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field188[var24].method1451(var17, var16);
                }
                if (Statics.field618 != null) {
                    Statics.field618[(var21.method491() ? 8 : 0) + var21.field582].method1599(var17 + 29, var16);
                }
                arg0.method3389(Integer.toString(var21.field588), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3389(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3352(Statics.field1859[field688].field589) + 6;
                int var26 = arg1.field2909 + 8;
                class73.method1545(class127.field1996 - var25 / 2, class127.field1997 * -153904067 + 20 + 5, var25, var26, 16777120);
                class73.method1548(class127.field1996 - var25 / 2, class127.field1997 * -153904067 + 20 + 5, var25, var26, 0);
                arg1.method3389(Statics.field1859[field688].field589, class127.field1996, class127.field1997 * -153904067 + 20 + 5 + arg1.field2909 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2018.getGraphics();
            Statics.field1280.method1355(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2018.repaint();
        }
    }

    @ObfuscatedName("eg.l(Lk;I)V")
    public static void method2718(class22 arg0) {
        if (arg0.method491() != client.field263) {
            client.field263 = arg0.method491();
            class45.method1878(arg0.method491());
        }
        Statics.field2665 = arg0.field591;
        client.field403 = arg0.field588;
        client.field259 = arg0.field580;
        Statics.field13 = client.field260 == 0 ? 43594 : arg0.field588 + 40000;
        Statics.field2883 = client.field260 == 0 ? 443 : arg0.field588 + 50000;
        Statics.field408 = Statics.field13;
    }

    @ObfuscatedName("aq.o(I)V")
    public static void method795() {
        try {
            if (Statics.field646 == null) {
                Statics.field646 = new class17(Statics.field649, new URL(Statics.field449));
            } else {
                byte[] var0 = Statics.field646.method160();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field684 = var1.method2313();
                    Statics.field1859 = new class22[field684];
                    int var2 = 0;
                    while (var2 < field684) {
                        class22 var3 = Statics.field1859[var2] = new class22();
                        var3.field588 = var1.method2313();
                        var3.field580 = var1.method2156();
                        var3.field591 = var1.method2159();
                        var3.field589 = var1.method2159();
                        var3.field582 = var1.method2151();
                        var3.field581 = var1.method2221();
                        var3.field585 = var2++;
                    }
                    method563(Statics.field1859, 0, Statics.field1859.length - 1, field665, field664);
                    field682 = true;
                    Statics.field646 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field646 = null;
        }
    }

    @ObfuscatedName("b.w(IIB)V")
    public static void method164(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field665[var5] != arg0) {
                var2[var4] = field665[var5];
                var3[var4] = field664[var5];
                var4++;
            }
        }
        field665 = var2;
        field664 = var3;
        method563(Statics.field1859, 0, Statics.field1859.length - 1, field665, field664);
    }

    @ObfuscatedName("au.t([Lk;II[I[II)V")
    public static void method563(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field581;
                        var12 = var8.field581;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method491() ? 1 : 0;
                        var12 = var8.method491() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field588;
                        var12 = var8.field588;
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
                        var15 = arg0[var5].field581;
                        var16 = var8.field581;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method491() ? 1 : 0;
                        var16 = var8.method491() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field588;
                        var16 = var8.field588;
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
        method563(arg0, arg1, var6, arg3, arg4);
        method563(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
