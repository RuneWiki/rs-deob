package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ao")
public class class28 {

    @ObfuscatedName("ao.r")
    public static int[] field637 = new int[256];

    @ObfuscatedName("ao.d")
    public static int field645 = 0;

    @ObfuscatedName("ao.j")
    public static int field646 = 0;

    @ObfuscatedName("ao.al")
    public static int field647 = 0;

    @ObfuscatedName("ao.ao")
    public static int field648 = 0;

    @ObfuscatedName("ao.ap")
    public static int field634 = 0;

    @ObfuscatedName("ao.aa")
    public static int field650 = 0;

    @ObfuscatedName("ao.ak")
    public static int field651 = 10;

    @ObfuscatedName("ao.ah")
    public static String field635 = "";

    @ObfuscatedName("ao.as")
    public static int field653 = 0;

    @ObfuscatedName("ao.aw")
    public static String field638 = "";

    @ObfuscatedName("ao.aj")
    public static String field655 = "";

    @ObfuscatedName("ao.af")
    public static String field654 = "";

    @ObfuscatedName("ao.am")
    public static String field641 = "";

    @ObfuscatedName("ao.ab")
    public static String field658 = "";

    @ObfuscatedName("ao.ai")
    public static class144 field659 = class144.field2380;

    @ObfuscatedName("ao.au")
    public static boolean field661 = true;

    @ObfuscatedName("ao.av")
    public static int field662 = 0;

    @ObfuscatedName("ao.at")
    public static String field640 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ao.ax")
    public static String field657 = "1234567890";

    @ObfuscatedName("ao.az")
    public static boolean field665 = false;

    @ObfuscatedName("ao.bl")
    public static int field660 = 0;

    @ObfuscatedName("ao.bq")
    public static int[] field669 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ao.bk")
    public static int[] field667 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ao.bv")
    public static int field670 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.t(I)I")
    public static int method154() {
        return 8;
    }

    @ObfuscatedName("ai.o(Ljava/awt/Component;Ley;Ley;ZIB)V")
    public static void method757(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field664) {
            field653 = arg4;
            class73.method1502();
            byte[] var5 = arg1.method2684("title.jpg", "");
            Statics.field656 = new class72(var5, arg0);
            Statics.field663 = Statics.field656.method1407();
            Statics.field2643 = class70.method4(arg2, "logo", "");
            Statics.field652 = class70.method4(arg2, "titlebox", "");
            Statics.field636 = class70.method4(arg2, "titlebutton", "");
            Statics.field2656 = class70.method569(arg2, "runes", "");
            Statics.field639 = class70.method569(arg2, "title_mute", "");
            Statics.field1272 = class70.method4(arg2, "options_radio_buttons,0", "");
            Statics.field2960 = class70.method4(arg2, "options_radio_buttons,2", "");
            Statics.field644 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field644[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field644[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field644[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field644[var9 + 192] = 16777215;
            }
            Statics.field2954 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2954[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2954[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2954[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2954[var13 + 192] = 16777215;
            }
            Statics.field674 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field674[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field674[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field674[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field674[var17 + 192] = 16777215;
            }
            Statics.field2892 = new int[256];
            Statics.field1276 = new int[32768];
            Statics.field1872 = new int[32768];
            method565((class74) null);
            Statics.field2826 = new int[32768];
            Statics.field557 = new int[32768];
            if (arg3) {
                field641 = "";
                field658 = "";
            }
            Statics.field1504 = 0;
            Statics.field668 = "";
            field661 = true;
            field665 = false;
            if (Statics.field1998.field135) {
                class161.method1966(2);
            } else {
                Statics.method493(2, Statics.field2083, "scape main", "", 255, false);
            }
            class150.method2636(false);
            Statics.field664 = true;
            Statics.field656.method1416(0, 0);
            Statics.field663.method1416(382, 0);
            Statics.field2643.method1560(382 - Statics.field2643.field1318 / 2, 18);
        } else if (arg4 == 4) {
            field653 = 4;
        }
    }

    @ObfuscatedName("b.i(I)V")
    public static void method140() {
        if (!Statics.field664) {
            return;
        }
        Statics.field652 = null;
        Statics.field636 = null;
        Statics.field2656 = null;
        Statics.field656 = null;
        Statics.field663 = null;
        Statics.field2643 = null;
        Statics.field639 = null;
        Statics.field1272 = null;
        Statics.field2960 = null;
        Statics.field61 = null;
        Statics.field666 = null;
        Statics.field860 = null;
        Statics.field1349 = null;
        Statics.field600 = null;
        Statics.field644 = null;
        Statics.field2954 = null;
        Statics.field674 = null;
        Statics.field2892 = null;
        Statics.field1276 = null;
        Statics.field1872 = null;
        Statics.field2826 = null;
        Statics.field557 = null;
        class161.method1966(2);
        class150.method2636(true);
        Statics.field664 = false;
    }

    @ObfuscatedName("r.p(Len;I)V")
    public static void method149(class131 arg0) {
        if (!field665) {
            if ((class127.field1975 == 1 || !Statics.field549 && class127.field1975 == 4) && class127.field1980 >= 715 && class127.field1988 >= 453) {
                Statics.field1998.field135 = !Statics.field1998.field135;
                class9.method84();
                if (Statics.field1998.field135) {
                    Statics.field2703.method3035();
                    class161.field2704 = 1;
                    Statics.field1000 = null;
                } else {
                    class161.method890(Statics.field2083, "scape main", "", 255, false);
                }
            }
            if (client.field260 != 5) {
                field634++;
                if (client.field260 == 10 || client.field260 == 11) {
                    if (client.field367 == 0) {
                        if (class127.field1975 == 1 || !Statics.field549 && class127.field1975 == 4) {
                            byte var7 = 5;
                            short var8 = 463;
                            byte var9 = 100;
                            byte var10 = 35;
                            if (class127.field1980 >= var7 && class127.field1980 <= var7 + var9 && class127.field1988 >= var8 && class127.field1988 <= var8 + var10) {
                                method155();
                                return;
                            }
                        }
                        if (Statics.field2685 != null) {
                            method155();
                        }
                    }
                    int var11 = class127.field1975;
                    int var12 = class127.field1980;
                    int var13 = class127.field1988;
                    if (!Statics.field549 && var11 == 4) {
                        var11 = 1;
                    }
                    if (field653 == 0) {
                        short var14 = 302;
                        short var15 = 291;
                        if (var11 == 1 && var12 >= var14 - 75 && var12 <= var14 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            class125.method2432(client.method467("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        short var16 = 462;
                        if (var11 == 1 && var12 >= var16 - 75 && var12 <= var16 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            if ((client.field253 & 0x4) != 0) {
                                if ((client.field253 & 0x400) == 0) {
                                    field638 = class142.field2333;
                                    field655 = class142.field2334;
                                    field654 = class142.field2335;
                                } else {
                                    field638 = class142.field2150;
                                    field655 = class142.field2340;
                                    field654 = class142.field2347;
                                }
                                field653 = 1;
                                field662 = 0;
                            } else if ((client.field253 & 0x400) == 0) {
                                field638 = class142.field2329;
                                field655 = class142.field2135;
                                field654 = class142.field2331;
                                field653 = 2;
                                field662 = 0;
                            } else {
                                field638 = class142.field2336;
                                field655 = class142.field2304;
                                field654 = class142.field2123;
                                field653 = 1;
                                field662 = 0;
                            }
                        }
                    } else if (field653 == 1) {
                        while (Statics.method1856()) {
                            if (Statics.field987 == 84) {
                                field638 = class142.field2329;
                                field655 = class142.field2135;
                                field654 = class142.field2331;
                                field653 = 2;
                                field662 = 0;
                            } else if (Statics.field987 == 13) {
                                field653 = 0;
                            }
                        }
                        short var17 = 302;
                        short var18 = 321;
                        if (var11 == 1 && var12 >= var17 - 75 && var12 <= var17 + 75 && var13 >= var18 - 20 && var13 <= var18 + 20) {
                            field638 = class142.field2329;
                            field655 = class142.field2135;
                            field654 = class142.field2331;
                            field653 = 2;
                            field662 = 0;
                        }
                        short var19 = 462;
                        if (var11 == 1 && var12 >= var19 - 75 && var12 <= var19 + 75 && var13 >= var18 - 20 && var13 <= var18 + 20) {
                            field653 = 0;
                        }
                    } else if (field653 == 2) {
                        short var20 = 231;
                        int var31 = var20 + 30;
                        if (var11 == 1 && var13 >= var31 - 15 && var13 < var31) {
                            field662 = 0;
                        }
                        var31 += 15;
                        if (var11 == 1 && var13 >= var31 - 15 && var13 < var31) {
                            field662 = 1;
                        }
                        var31 += 15;
                        short var21 = 302;
                        short var22 = 321;
                        if (var11 == 1 && var12 >= var21 - 75 && var12 <= var21 + 75 && var13 >= var22 - 20 && var13 <= var22 + 20) {
                            field641 = field641.trim();
                            if (field641.length() == 0) {
                                method1767(class142.field2235, class142.field2236, class142.field2196);
                                return;
                            }
                            if (field658.length() == 0) {
                                method1767(class142.field2148, class142.field2239, class142.field2240);
                                return;
                            }
                            method1767(class142.field2344, class142.field2243, class142.field2346);
                            field659 = Statics.field1998.field139.containsKey(class199.method144(field641)) ? class144.field2378 : class144.field2380;
                            client.method482(20);
                            return;
                        }
                        short var23 = 462;
                        if (var11 == 1 && var12 >= var23 - 75 && var12 <= var23 + 75 && var13 >= var22 - 20 && var13 <= var22 + 20) {
                            field653 = 0;
                            field641 = "";
                            field658 = "";
                            Statics.field1504 = 0;
                            Statics.field668 = "";
                            field661 = true;
                        }
                        while (true) {
                            while (Statics.method1856()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field640.length(); var25++) {
                                    if (Statics.field235 == field640.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field987 == 13) {
                                    field653 = 0;
                                    field641 = "";
                                    field658 = "";
                                    Statics.field1504 = 0;
                                    Statics.field668 = "";
                                    field661 = true;
                                } else if (field662 == 0) {
                                    if (Statics.field987 == 85 && field641.length() > 0) {
                                        field641 = field641.substring(0, field641.length() - 1);
                                    }
                                    if (Statics.field987 == 84 || Statics.field987 == 80) {
                                        field662 = 1;
                                    }
                                    if (var24 && field641.length() < 320) {
                                        field641 = field641 + Statics.field235;
                                    }
                                } else if (field662 == 1) {
                                    if (Statics.field987 == 85 && field658.length() > 0) {
                                        field658 = field658.substring(0, field658.length() - 1);
                                    }
                                    if (Statics.field987 == 84 || Statics.field987 == 80) {
                                        field662 = 0;
                                    }
                                    if (Statics.field987 == 84) {
                                        field641 = field641.trim();
                                        if (field641.length() == 0) {
                                            method1767(class142.field2235, class142.field2236, class142.field2196);
                                            return;
                                        }
                                        if (field658.length() == 0) {
                                            method1767(class142.field2148, class142.field2239, class142.field2240);
                                            return;
                                        }
                                        method1767(class142.field2344, class142.field2243, class142.field2346);
                                        field659 = Statics.field1998.field139.containsKey(class199.method144(field641)) ? class144.field2378 : class144.field2380;
                                        client.method482(20);
                                        return;
                                    }
                                    if (var24 && field658.length() < 20) {
                                        field658 = field658 + Statics.field235;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field653 == 4) {
                        short var26 = 302;
                        short var27 = 321;
                        if (var11 == 1 && var12 >= var26 - 75 && var12 <= var26 + 75 && var13 >= var27 - 20 && var13 <= var27 + 20) {
                            Statics.field668.trim();
                            if (Statics.field668.length() != 6) {
                                method1767(class142.field2151, class142.field2152, class142.field2153);
                                return;
                            }
                            Statics.field1504 = Integer.parseInt(Statics.field668);
                            Statics.field668 = "";
                            field659 = field661 ? class144.field2379 : class144.field2381;
                            method1767(class142.field2344, class142.field2243, class142.field2346);
                            client.method482(20);
                            return;
                        }
                        if (var11 == 1 && var12 >= 373 && var12 <= 512 && var13 >= 263 && var13 <= 296) {
                            field661 = !field661;
                        }
                        if (var11 == 1 && var12 >= 348 && var12 <= 416 && var13 >= 351 && var13 <= 363) {
                            class125.method2432(client.method467("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        short var28 = 462;
                        if (var11 == 1 && var12 >= var28 - 75 && var12 <= var28 + 75 && var13 >= var27 - 20 && var13 <= var27 + 20) {
                            field653 = 0;
                            field641 = "";
                            field658 = "";
                            Statics.field1504 = 0;
                            Statics.field668 = "";
                        }
                        while (Statics.method1856()) {
                            boolean var29 = false;
                            for (int var30 = 0; var30 < field657.length(); var30++) {
                                if (Statics.field235 == field657.charAt(var30)) {
                                    var29 = true;
                                    break;
                                }
                            }
                            if (Statics.field987 == 13) {
                                field653 = 0;
                                field641 = "";
                                field658 = "";
                                Statics.field1504 = 0;
                                Statics.field668 = "";
                            } else {
                                if (Statics.field987 == 85 && Statics.field668.length() > 0) {
                                    Statics.field668 = Statics.field668.substring(0, Statics.field668.length() - 1);
                                }
                                if (Statics.field987 == 84) {
                                    Statics.field668.trim();
                                    if (Statics.field668.length() != 6) {
                                        method1767(class142.field2151, class142.field2152, class142.field2153);
                                        return;
                                    }
                                    Statics.field1504 = Integer.parseInt(Statics.field668);
                                    Statics.field668 = "";
                                    field659 = field661 ? class144.field2379 : class144.field2381;
                                    method1767(class142.field2344, class142.field2243, class142.field2346);
                                    client.method482(20);
                                    return;
                                }
                                if (var29 && Statics.field668.length() < 6) {
                                    Statics.field668 = Statics.field668 + Statics.field235;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field1975 == 1 || !Statics.field549 && class127.field1975 == 4) {
            short var1 = 280;
            if (class127.field1980 >= var1 && class127.field1980 <= var1 + 14 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                method483(0, 0);
            } else if (class127.field1980 >= var1 + 15 && class127.field1980 <= var1 + 80 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                method483(0, 1);
            } else {
                short var2 = 390;
                if (class127.field1980 >= var2 && class127.field1980 <= var2 + 14 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                    method483(1, 0);
                } else if (class127.field1980 >= var2 + 15 && class127.field1980 <= var2 + 80 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                    method483(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field1980 >= var3 && class127.field1980 <= var3 + 14 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                        method483(2, 0);
                    } else if (class127.field1980 >= var3 + 15 && class127.field1980 <= var3 + 80 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                        method483(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field1980 >= var4 && class127.field1980 <= var4 + 14 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                            method483(3, 0);
                        } else if (class127.field1980 >= var4 + 15 && class127.field1980 <= var4 + 80 && class127.field1988 >= 4 && class127.field1988 <= 18) {
                            method483(3, 1);
                        } else if (class127.field1980 >= 708 && class127.field1988 >= 4 && class127.field1980 <= 758 && class127.field1988 <= 20) {
                            field665 = false;
                            Statics.field656.method1416(0, 0);
                            Statics.field663.method1416(382, 0);
                            Statics.field2643.method1560(382 - Statics.field2643.field1318 / 2, 18);
                        } else if (field670 != -1) {
                            class22 var5 = Statics.field2111[field670];
                            if (var5.method485() != client.field257) {
                                client.field257 = var5.method485();
                                boolean var6 = var5.method485();
                                if (Statics.field685 != var6) {
                                    class45.method1852();
                                    Statics.field685 = var6;
                                }
                            }
                            Statics.field2086 = var5.field563;
                            client.field311 = var5.field565;
                            client.field253 = var5.field560;
                            Statics.field943 = client.field254 == 0 ? 43594 : var5.field565 + 40000;
                            Statics.field621 = client.field254 == 0 ? 443 : var5.field565 + 50000;
                            Statics.field123 = Statics.field943;
                            field665 = false;
                            Statics.field656.method1416(0, 0);
                            Statics.field663.method1416(382, 0);
                            Statics.field2643.method1560(382 - Statics.field2643.field1318 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.c(Lgu;Lgu;I)V")
    public static void method1580(class193 arg0, class193 arg1) {
        if (field665) {
            method516(arg0, arg1);
            return;
        }
        if (client.field260 == 0 || client.field260 == 5) {
            byte var2 = 20;
            arg0.method3304(class142.field2328, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1506(230, var3, 304, 34, 9179409);
            class73.method1506(231, var3 + 1, 302, 32, 0);
            class73.method1504(232, var3 + 2, field651 * 3, 30, 9179409);
            class73.method1504(field651 * 3 + 232, var3 + 2, 300 - field651 * 3, 30, 0);
            arg0.method3304(field635, 382, 276 - var2, 16777215, -1);
        }
        if (client.field260 == 20) {
            Statics.field652.method1560(382 - Statics.field652.field1318 / 2, 271 - Statics.field652.field1316 / 2);
            short var4 = 211;
            arg0.method3304(field638, 382, var4, 16776960, 0);
            int var62 = var4 + 15;
            arg0.method3304(field655, 382, var62, 16776960, 0);
            int var63 = var62 + 15;
            arg0.method3304(field654, 382, var63, 16776960, 0);
            int var64 = var63 + 15;
            int var65 = var64 + 10;
            if (field653 != 4) {
                arg0.method3295(class142.field2264, 272, var65, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field641; arg0.method3297(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3295(class192.method3301(var6), 312, var65, 16777215, 0);
                var62 = var65 + 15;
                arg0.method3295(class142.field2144 + class199.method2772(field658), 274, var62, 16777215, 0);
                var62 += 15;
            }
        }
        if (client.field260 == 10 || client.field260 == 11) {
            Statics.field652.method1560(202, 171);
            if (field653 == 0) {
                short var7 = 251;
                arg0.method3304(class142.field2350, 382, var7, 16776960, 0);
                int var66 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field636.method1560(var8 - 73, var9 - 20);
                arg0.method3326(class142.field2351, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field636.method1560(var10 - 73, var9 - 20);
                arg0.method3326(class142.field2352, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field653 == 1) {
                arg0.method3304(class142.field2332, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3304(field638, 382, var11, 16777215, 0);
                int var67 = var11 + 15;
                arg0.method3304(field655, 382, var67, 16777215, 0);
                int var68 = var67 + 15;
                arg0.method3304(field654, 382, var68, 16777215, 0);
                int var69 = var68 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field636.method1560(var12 - 73, var13 - 20);
                arg0.method3304(class142.field2227, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field636.method1560(var14 - 73, var13 - 20);
                arg0.method3304(class142.field2354, var14, var13 + 5, 16777215, 0);
            } else if (field653 == 2) {
                short var15 = 211;
                arg0.method3304(field638, 382, var15, 16776960, 0);
                int var70 = var15 + 15;
                arg0.method3304(field655, 382, var70, 16776960, 0);
                int var71 = var70 + 15;
                arg0.method3304(field654, 382, var71, 16776960, 0);
                int var72 = var71 + 15;
                int var73 = var72 + 10;
                arg0.method3295(class142.field2264, 272, var73, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field641; arg0.method3297(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3295(class192.method3301(var17) + (field662 == 0 & client.field274 % 40 < 20 ? class2.method2647(16776960) + class2.field18 : ""), 312, var73, 16777215, 0);
                var70 = var73 + 15;
                arg0.method3295(class142.field2144 + class199.method2772(field658) + (field662 == 1 & client.field274 % 40 < 20 ? class2.method2647(16776960) + class2.field18 : ""), 274, var70, 16777215, 0);
                var70 += 15;
                short var18 = 302;
                short var19 = 321;
                Statics.field636.method1560(var18 - 73, var19 - 20);
                arg0.method3304(class142.field2316, var18, var19 + 5, 16777215, 0);
                short var20 = 462;
                Statics.field636.method1560(var20 - 73, var19 - 20);
                arg0.method3304(class142.field2354, var20, var19 + 5, 16777215, 0);
            } else if (field653 == 4) {
                arg0.method3304(class142.field2127, 382, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3304(field638, 382, var21, 16777215, 0);
                int var74 = var21 + 15;
                arg0.method3304(field655, 382, var74, 16777215, 0);
                int var75 = var74 + 15;
                arg0.method3304(field654, 382, var75, 16777215, 0);
                int var76 = var75 + 15;
                arg0.method3295(class142.field2187 + class199.method2772(Statics.field668) + (client.field274 % 40 < 20 ? class2.method2647(16776960) + class2.field18 : ""), 274, var76, 16777215, 0);
                int var77 = var76 - 8;
                arg0.method3295(class142.field2125, 373, var77, 16776960, 0);
                int var78 = var77 + 15;
                arg0.method3295(class142.field2221, 373, var78, 16776960, 0);
                int var22 = 373 + arg0.method3297(class142.field2221) + 15;
                int var23 = var78 - arg0.field2902;
                class74 var24;
                if (field661) {
                    var24 = Statics.field2960;
                } else {
                    var24 = Statics.field1272;
                }
                var24.method1560(var22, var23);
                var74 = var78 + 15;
                short var25 = 302;
                short var26 = 321;
                Statics.field636.method1560(var25 - 73, var26 - 20);
                arg0.method3304(class142.field2227, var25, var26 + 5, 16777215, 0);
                short var27 = 462;
                Statics.field636.method1560(var27 - 73, var26 - 20);
                arg0.method3304(class142.field2354, var27, var26 + 5, 16777215, 0);
                arg1.method3304(class142.field2168, 382, var26 + 36, 255, 0);
            }
        }
        if (field634 > 0) {
            int var28 = field634;
            short var29 = 256;
            field647 += var28 * 128;
            if (field647 > Statics.field1276.length) {
                field647 -= Statics.field1276.length;
                int var30 = (int) (Math.random() * 12.0D);
                method565(Statics.field2656[var30]);
            }
            int var31 = 0;
            int var32 = var28 * 128;
            int var33 = (var29 - var28) * 128;
            for (int var34 = 0; var34 < var33; var34++) {
                int var35 = Statics.field2826[var31 + var32] - Statics.field1276[field647 + var31 & Statics.field1276.length - 1] * var28 / 6;
                if (var35 < 0) {
                    var35 = 0;
                }
                Statics.field2826[var31++] = var35;
            }
            for (int var36 = var29 - var28; var36 < var29; var36++) {
                int var37 = var36 * 128;
                for (int var38 = 0; var38 < 128; var38++) {
                    int var39 = (int) (Math.random() * 100.0D);
                    if (var39 < 50 && var38 > 10 && var38 < 118) {
                        Statics.field2826[var37 + var38] = 255;
                    } else {
                        Statics.field2826[var37 + var38] = 0;
                    }
                }
            }
            if (field645 > 0) {
                field645 -= var28 * 4;
            }
            if (field646 > 0) {
                field646 -= var28 * 4;
            }
            if (field645 == 0 && field646 == 0) {
                int var40 = (int) (Math.random() * (double) (2000 / var28));
                if (var40 == 0) {
                    field645 = 1024;
                }
                if (var40 == 1) {
                    field646 = 1024;
                }
            }
            for (int var41 = 0; var41 < var29 - var28; var41++) {
                field637[var41] = field637[var28 + var41];
            }
            for (int var42 = var29 - var28; var42 < var29; var42++) {
                field637[var42] = (int) (Math.sin((double) field650 / 14.0D) * 16.0D + Math.sin((double) field650 / 15.0D) * 14.0D + Math.sin((double) field650 / 16.0D) * 12.0D);
                field650++;
            }
            field648 += var28 * 2009450825;
            int var43 = ((client.field274 & 0x1) + var28) / 2;
            if (var43 > 0) {
                for (int var44 = 0; var44 < field648 * 1065566532; var44++) {
                    int var45 = (int) (Math.random() * 124.0D) + 2;
                    int var46 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2826[(var46 << 7) + var45] = 192;
                }
                field648 = 0;
                int var47 = 0;
                label207: while (true) {
                    if (var47 >= var29) {
                        int var51 = 0;
                        while (true) {
                            if (var51 >= 128) {
                                break label207;
                            }
                            int var52 = 0;
                            for (int var53 = -var43; var53 < var29; var53++) {
                                int var54 = var53 * 128;
                                if (var43 + var53 < var29) {
                                    var52 += Statics.field557[var43 * 128 + var51 + var54];
                                }
                                if (var53 - (var43 + 1) >= 0) {
                                    var52 -= Statics.field557[var51 + var54 - (var43 + 1) * 128];
                                }
                                if (var53 >= 0) {
                                    Statics.field2826[var51 + var54] = var52 / (var43 * 2 + 1);
                                }
                            }
                            var51++;
                        }
                    }
                    int var48 = 0;
                    int var49 = var47 * 128;
                    for (int var50 = -var43; var50 < 128; var50++) {
                        if (var43 + var50 < 128) {
                            var48 += Statics.field2826[var49 + var50 + var43];
                        }
                        if (var50 - (var43 + 1) >= 0) {
                            var48 -= Statics.field2826[var49 + var50 - (var43 + 1)];
                        }
                        if (var50 >= 0) {
                            Statics.field557[var49 + var50] = var48 / (var43 * 2 + 1);
                        }
                    }
                    var47++;
                }
            }
            field634 = 0;
        }
        method878();
        Statics.field639[Statics.field1998.field135 ? 1 : 0].method1560(725, 463);
        if (client.field260 > 5 && client.field367 == 0) {
            if (Statics.field600 == null) {
                Statics.field600 = class70.method4(Statics.field87, "sl_button", "");
            } else {
                byte var55 = 5;
                short var56 = 463;
                byte var57 = 100;
                byte var58 = 35;
                Statics.field600.method1560(var55, var56);
                arg0.method3304(class142.field2283 + " " + client.field311, var57 / 2 + var55, var58 / 2 + var56 - 2, 16777215, 0);
                if (Statics.field2685 == null) {
                    arg1.method3304(class142.field2365, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                } else {
                    arg1.method3304(class142.field2364, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var59 = Statics.field2015.getGraphics();
            Statics.field1952.method1363(var59, 0, 0);
        } catch (Exception var61) {
            Statics.field2015.repaint();
        }
    }

    @ObfuscatedName("cc.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1767(String arg0, String arg1, String arg2) {
        field638 = arg0;
        field655 = arg1;
        field654 = arg2;
    }

    @ObfuscatedName("ap.g(Lbg;B)V")
    public static final void method565(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1276.length; var2++) {
            Statics.field1276[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1276[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1872[var8] = (Statics.field1276[var8 - 1] + Statics.field1276[var8 + 1] + Statics.field1276[var8 - 128] + Statics.field1276[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1276;
            Statics.field1276 = Statics.field1872;
            Statics.field1872 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1316; var11++) {
            for (int var12 = 0; var12 < arg0.field1318; var12++) {
                if (arg0.field1319[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1320;
                    int var14 = var11 + 16 + arg0.field1322;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1276[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bz.l(IIIS)I")
    public static final int method1304(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ax.h(I)V")
    public static final void method878() {
        short var0 = 256;
        if (field645 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field645 > 768) {
                    Statics.field2892[var1] = method1304(Statics.field644[var1], Statics.field2954[var1], 1024 - field645);
                } else if (field645 > 256) {
                    Statics.field2892[var1] = Statics.field2954[var1];
                } else {
                    Statics.field2892[var1] = method1304(Statics.field2954[var1], Statics.field644[var1], 256 - field645);
                }
            }
        } else if (field646 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field646 > 768) {
                    Statics.field2892[var2] = method1304(Statics.field644[var2], Statics.field674[var2], 1024 - field646);
                } else if (field646 > 256) {
                    Statics.field2892[var2] = Statics.field674[var2];
                } else {
                    Statics.field2892[var2] = method1304(Statics.field674[var2], Statics.field644[var2], 256 - field646);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2892[var3] = Statics.field644[var3];
            }
        }
        class73.method1536(0, 9, 128, var0 + 7);
        Statics.field656.method1416(0, 0);
        class73.method1497();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field637[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2826[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2892[var10];
                    int var14 = Statics.field1952.field1292[var5];
                    Statics.field1952.field1292[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1536(637, 9, 765, var0 + 7);
        Statics.field663.method1416(382, 0);
        class73.method1497();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field637[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2826[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2892[var22];
                    int var26 = Statics.field1952.field1292[var20];
                    Statics.field1952.field1292[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("f.n(Lgu;Lgu;B)V")
    public static void method516(class193 arg0, class193 arg1) {
        if (Statics.field61 == null) {
            Statics.field61 = class70.method32(Statics.field87, "sl_back", "");
        }
        if (Statics.field666 == null) {
            Statics.field666 = class70.method569(Statics.field87, "sl_flags", "");
        }
        if (Statics.field860 == null) {
            Statics.field860 = class70.method569(Statics.field87, "sl_arrows", "");
        }
        if (Statics.field1349 == null) {
            Statics.field1349 = class70.method569(Statics.field87, "sl_stars", "");
        }
        class73.method1504(0, 23, 765, 480, 0);
        class73.method1505(0, 0, 125, 23, 12425273, 9135624);
        class73.method1505(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3304(class142.field2355, 62, 15, 0, -1);
        if (Statics.field1349 != null) {
            Statics.field1349[1].method1560(140, 1);
            arg1.method3295(class142.field2356, 152, 10, 16777215, -1);
            Statics.field1349[0].method1560(140, 12);
            arg1.method3295(class142.field2357, 152, 21, 16777215, -1);
        }
        if (Statics.field860 != null) {
            short var2 = 280;
            if (field669[0] == 0 && field667[0] == 0) {
                Statics.field860[2].method1560(var2, 4);
            } else {
                Statics.field860[0].method1560(var2, 4);
            }
            if (field669[0] == 0 && field667[0] == 1) {
                Statics.field860[3].method1560(var2 + 15, 4);
            } else {
                Statics.field860[1].method1560(var2 + 15, 4);
            }
            arg0.method3295(class142.field2358, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field669[0] == 1 && field667[0] == 0) {
                Statics.field860[2].method1560(var3, 4);
            } else {
                Statics.field860[0].method1560(var3, 4);
            }
            if (field669[0] == 1 && field667[0] == 1) {
                Statics.field860[3].method1560(var3 + 15, 4);
            } else {
                Statics.field860[1].method1560(var3 + 15, 4);
            }
            arg0.method3295(class142.field2341, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field669[0] == 2 && field667[0] == 0) {
                Statics.field860[2].method1560(var4, 4);
            } else {
                Statics.field860[0].method1560(var4, 4);
            }
            if (field669[0] == 2 && field667[0] == 1) {
                Statics.field860[3].method1560(var4 + 15, 4);
            } else {
                Statics.field860[1].method1560(var4 + 15, 4);
            }
            arg0.method3295(class142.field2360, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field669[0] == 3 && field667[0] == 0) {
                Statics.field860[2].method1560(var5, 4);
            } else {
                Statics.field860[0].method1560(var5, 4);
            }
            if (field669[0] == 3 && field667[0] == 1) {
                Statics.field860[3].method1560(var5 + 15, 4);
            } else {
                Statics.field860[1].method1560(var5 + 15, 4);
            }
            arg0.method3295(class142.field2361, var5 + 32, 17, 16777215, -1);
        }
        class73.method1504(708, 4, 50, 16, 0);
        arg1.method3304(class142.field2354, 733, 16, 16777215, -1);
        field670 = -1;
        if (Statics.field61 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field660) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field660) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field660) {
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
            for (int var20 = 0; var20 < field660; var20++) {
                class22 var21 = Statics.field2111[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field569);
                if (var21.field569 == -1) {
                    var23 = class142.field2362;
                    var22 = false;
                } else if (var21.field569 > 1980) {
                    var23 = class142.field2213;
                    var22 = false;
                }
                byte var24;
                if (var21.method486()) {
                    if (var21.method485()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method485()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field1974 >= var17 && class127.field1981 >= var16 && class127.field1974 < var6 + var17 && class127.field1981 < var7 + var16 && var22) {
                    field670 = var20;
                    Statics.field61[var24].method1422(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field61[var24].method1416(var17, var16);
                }
                if (Statics.field666 != null) {
                    Statics.field666[(var21.method485() ? 8 : 0) + var21.field562].method1560(var17 + 29, var16);
                }
                arg0.method3304(Integer.toString(var21.field565), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3304(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3297(Statics.field2111[field670].field564) + 6;
                int var26 = arg1.field2902 + 8;
                class73.method1504(class127.field1974 - var25 / 2, class127.field1981 + 20 + 5, var25, var26, 16777120);
                class73.method1506(class127.field1974 - var25 / 2, class127.field1981 + 20 + 5, var25, var26, 0);
                arg1.method3304(Statics.field2111[field670].field564, class127.field1974, class127.field1981 + 20 + 5 + arg1.field2902 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2015.getGraphics();
            Statics.field1952.method1363(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2015.repaint();
        }
    }

    @ObfuscatedName("dl.w(Lj;B)V")
    public static void method2467(class22 arg0) {
        if (arg0.method485() != client.field257) {
            client.field257 = arg0.method485();
            boolean var1 = arg0.method485();
            if (Statics.field685 != var1) {
                class45.method1852();
                Statics.field685 = var1;
            }
        }
        Statics.field2086 = arg0.field563;
        client.field311 = arg0.field565;
        client.field253 = arg0.field560;
        Statics.field943 = client.field254 == 0 ? 43594 : arg0.field565 + 40000;
        Statics.field621 = client.field254 == 0 ? 443 : arg0.field565 + 50000;
        Statics.field123 = Statics.field943;
    }

    @ObfuscatedName("r.m(I)V")
    public static void method155() {
        try {
            if (Statics.field2685 == null) {
                Statics.field2685 = new class17(Statics.field777, new URL(Statics.field976));
            } else {
                byte[] var0 = Statics.field2685.method156();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field660 = var1.method2120();
                    Statics.field2111 = new class22[field660];
                    int var2 = 0;
                    while (var2 < field660) {
                        class22 var3 = Statics.field2111[var2] = new class22();
                        var3.field565 = var1.method2120();
                        var3.field560 = var1.method2152();
                        var3.field563 = var1.method2126();
                        var3.field564 = var1.method2126();
                        var3.field562 = var1.method2118();
                        var3.field569 = var1.method2252();
                        var3.field566 = var2++;
                    }
                    method602(Statics.field2111, 0, Statics.field2111.length - 1, field669, field667);
                    field665 = true;
                    Statics.field2685 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2685 = null;
        }
    }

    @ObfuscatedName("d.x(IIB)V")
    public static void method483(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field669[var5] != arg0) {
                var2[var4] = field669[var5];
                var3[var4] = field667[var5];
                var4++;
            }
        }
        field669 = var2;
        field667 = var3;
        method602(Statics.field2111, 0, Statics.field2111.length - 1, field669, field667);
    }

    @ObfuscatedName("aw.b([Lj;II[I[II)V")
    public static void method602(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field566;
                        var12 = var8.field566;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field569;
                        var12 = var8.field569;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method485() ? 1 : 0;
                        var12 = var8.method485() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field565;
                        var12 = var8.field565;
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
                        var15 = arg0[var5].field566;
                        var16 = var8.field566;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field569;
                        var16 = var8.field569;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method485() ? 1 : 0;
                        var16 = var8.method485() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field565;
                        var16 = var8.field565;
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
        method602(arg0, arg1, var6, arg3, arg4);
        method602(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
