package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.w")
    public static int field697 = 0;

    @ObfuscatedName("ah.l")
    public static int field700 = field697 + 202;

    @ObfuscatedName("ah.c")
    public static int[] field709 = new int[256];

    @ObfuscatedName("ah.t")
    public static int field702 = 0;

    @ObfuscatedName("ah.d")
    public static int field694 = 0;

    @ObfuscatedName("ah.ai")
    public static int field698 = 0;

    @ObfuscatedName("ah.ae")
    public static int field710 = 0;

    @ObfuscatedName("ah.az")
    public static int field715 = 0;

    @ObfuscatedName("ah.ah")
    public static int field707 = 0;

    @ObfuscatedName("ah.ar")
    public static int field708 = 10;

    @ObfuscatedName("ah.ab")
    public static String field723 = "";

    @ObfuscatedName("ah.aj")
    public static int field703 = 0;

    @ObfuscatedName("ah.ay")
    public static String field711 = "";

    @ObfuscatedName("ah.ag")
    public static String field712 = "";

    @ObfuscatedName("ah.av")
    public static String field713 = "";

    @ObfuscatedName("ah.af")
    public static String field714 = "";

    @ObfuscatedName("ah.am")
    public static String field704 = "";

    @ObfuscatedName("ah.aw")
    public static String field716 = "";

    @ObfuscatedName("ah.ad")
    public static class160 field717 = class160.field2600;

    @ObfuscatedName("ah.an")
    public static boolean field718 = true;

    @ObfuscatedName("ah.ax")
    public static int field719 = 0;

    @ObfuscatedName("ah.au")
    public static String field720 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.at")
    public static String field699 = "1234567890";

    @ObfuscatedName("ah.al")
    public static boolean field722 = false;

    @ObfuscatedName("ah.br")
    public static int field701 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.e(I)I")
    public static int method2162() {
        return 9;
    }

    @ObfuscatedName("do.w(Ljava/awt/Component;Lft;Lft;ZII)V")
    public static void method2280(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field2651) {
            field703 = arg4;
            class80.method1681();
            byte[] var5 = arg1.method3073("title.jpg", "");
            Statics.field721 = new class79(var5, arg0);
            Statics.field200 = Statics.field721.method1574();
            if ((client.field281 & 0x20000000) == 0) {
                Statics.field705 = class77.method171(arg2, "logo", "");
            } else {
                Statics.field705 = class77.method171(arg2, "logo_deadman_mode", "");
            }
            Statics.field695 = class77.method171(arg2, "titlebox", "");
            Statics.field3045 = class77.method171(arg2, "titlebutton", "");
            Statics.field696 = class77.method2675(arg2, "runes", "");
            Statics.field261 = class77.method2675(arg2, "title_mute", "");
            Statics.field706 = class77.method171(arg2, "options_radio_buttons,0", "");
            Statics.field758 = class77.method171(arg2, "options_radio_buttons,2", "");
            Statics.field656 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field656[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field656[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field656[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field656[var9 + 192] = 16777215;
            }
            Statics.field213 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field213[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field213[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field213[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field213[var13 + 192] = 16777215;
            }
            Statics.field2188 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2188[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2188[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2188[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2188[var17 + 192] = 16777215;
            }
            Statics.field1062 = new int[256];
            Statics.field657 = new int[32768];
            Statics.field1958 = new int[32768];
            method892((class81) null);
            Statics.field1370 = new int[32768];
            Statics.field1048 = new int[32768];
            if (arg3) {
                field704 = "";
                field716 = "";
            }
            Statics.field100 = 0;
            Statics.field154 = "";
            field718 = true;
            field722 = false;
            if (Statics.field866.field146) {
                class184.method45(2);
            } else {
                class184.method3089(2, Statics.field612, "scape main", "", 255, false);
            }
            class172.method578(false);
            Statics.field2651 = true;
            field697 = (Statics.field763 - client.field494 * 765) / 2;
            field700 = field697 + 202;
            Statics.field721.method1615(field697, 0);
            Statics.field200.method1615(field697 + 382, 0);
            Statics.field705.method1754(field697 + 382 - Statics.field705.field1391 / 2, 18);
        } else if (arg4 == 4) {
            field703 = 4;
        }
    }

    @ObfuscatedName("bl.f(Lec;S)V")
    public static void method1178(class145 arg0) {
        if (field722) {
            method2736(arg0);
            return;
        }
        if ((class141.field2147 == 1 || !Statics.field67 && class141.field2147 == 4) && class141.field2136 >= field697 + 765 - 50 && class141.field2149 >= 453) {
            Statics.field866.field146 = !Statics.field866.field146;
            class9.method890();
            if (Statics.field866.field146) {
                class184.method760();
            } else {
                class169 var1 = Statics.field612;
                int var2 = var1.method3023("scape main");
                int var3 = var1.method3039(var2, "");
                class184.method2060(var1, var2, var3, 255, false);
            }
        }
        if (client.field288 == 5) {
            return;
        }
        field715++;
        if (client.field288 != 10 && client.field288 != 11) {
            return;
        }
        if (client.field287 == 0) {
            if (class141.field2147 == 1 || !Statics.field67 && class141.field2147 == 4) {
                int var4 = field697 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class141.field2136 >= var4 && class141.field2136 <= var4 + var6 && class141.field2149 >= var5 && class141.field2149 <= var5 + var7) {
                    method128();
                    return;
                }
            }
            if (Statics.field653 != null) {
                method128();
            }
        }
        int var8 = class141.field2147;
        int var9 = class141.field2136;
        int var10 = class141.field2149;
        if (!Statics.field67 && var8 == 4) {
            var8 = 1;
        }
        if (field703 == 0) {
            int var11 = field700 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class139.method2898(Statics.method624("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = field700 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field281 & 0x2000000) != 0) {
                    field711 = "";
                    field712 = class158.field2529;
                    field713 = class158.field2420;
                    field714 = class158.field2531;
                    field703 = 1;
                    field719 = 0;
                } else if ((client.field281 & 0x4) != 0) {
                    if ((client.field281 & 0x400) == 0) {
                        field712 = class158.field2520;
                        field713 = class158.field2463;
                        field714 = class158.field2522;
                    } else {
                        field712 = class158.field2526;
                        field713 = class158.field2527;
                        field714 = class158.field2528;
                    }
                    field711 = class158.field2347;
                    field703 = 1;
                    field719 = 0;
                } else if ((client.field281 & 0x400) == 0) {
                    field712 = class158.field2516;
                    field713 = class158.field2517;
                    field714 = class158.field2518;
                    field703 = 2;
                    field719 = 0;
                } else {
                    field712 = class158.field2538;
                    field713 = class158.field2524;
                    field714 = class158.field2454;
                    field711 = class158.field2347;
                    field703 = 1;
                    field719 = 0;
                }
            }
        } else if (field703 == 1) {
            while (class138.method2622()) {
                if (Statics.field2159 == 84) {
                    field712 = class158.field2516;
                    field713 = class158.field2517;
                    field714 = class158.field2518;
                    field703 = 2;
                    field719 = 0;
                } else if (Statics.field2159 == 13) {
                    field703 = 0;
                }
            }
            int var14 = field700 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field712 = class158.field2516;
                field713 = class158.field2517;
                field714 = class158.field2518;
                field703 = 2;
                field719 = 0;
            }
            int var16 = field700 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field703 = 0;
            }
        } else if (field703 == 2) {
            short var17 = 231;
            int var39 = var17 + 30;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field719 = 0;
            }
            var39 += 15;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field719 = 1;
            }
            var39 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                method2582(class158.field2555, class158.field2556, class158.field2557);
                field703 = 5;
                return;
            }
            int var19 = field700 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field704 = field704.trim();
                if (field704.length() == 0) {
                    method2582(class158.field2339, class158.field2423, class158.field2424);
                    return;
                }
                if (field716.length() == 0) {
                    method2582(class158.field2425, class158.field2426, class158.field2427);
                    return;
                }
                method2582(class158.field2534, class158.field2535, class158.field2536);
                field717 = Statics.field866.field145.containsKey(class164.method174(field704)) ? class160.field2603 : class160.field2600;
                client.method2795(20);
                return;
            }
            int var21 = field700 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field703 = 0;
                field704 = "";
                field716 = "";
                Statics.field100 = 0;
                Statics.field154 = "";
                field718 = true;
            }
            while (true) {
                while (class138.method2622()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field720.length(); var23++) {
                        if (Statics.field1884 == field720.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field2159 == 13) {
                        field703 = 0;
                        field704 = "";
                        field716 = "";
                        Statics.field100 = 0;
                        Statics.field154 = "";
                        field718 = true;
                    } else if (field719 == 0) {
                        if (Statics.field2159 == 85 && field704.length() > 0) {
                            field704 = field704.substring(0, field704.length() - 1);
                        }
                        if (Statics.field2159 == 84 || Statics.field2159 == 80) {
                            field719 = 1;
                        }
                        if (var22 && field704.length() < 320) {
                            field704 = field704 + Statics.field1884;
                        }
                    } else if (field719 == 1) {
                        if (Statics.field2159 == 85 && field716.length() > 0) {
                            field716 = field716.substring(0, field716.length() - 1);
                        }
                        if (Statics.field2159 == 84 || Statics.field2159 == 80) {
                            field719 = 0;
                        }
                        if (Statics.field2159 == 84) {
                            field704 = field704.trim();
                            if (field704.length() == 0) {
                                method2582(class158.field2339, class158.field2423, class158.field2424);
                                return;
                            }
                            if (field716.length() == 0) {
                                method2582(class158.field2425, class158.field2426, class158.field2427);
                                return;
                            }
                            method2582(class158.field2534, class158.field2535, class158.field2536);
                            field717 = Statics.field866.field145.containsKey(class164.method174(field704)) ? class160.field2603 : class160.field2600;
                            client.method2795(20);
                            return;
                        }
                        if (var22 && field716.length() < 20) {
                            field716 = field716 + Statics.field1884;
                        }
                    }
                }
                return;
            }
        } else if (field703 == 3) {
            int var24 = field700 + 180;
            short var25 = 276;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field712 = class158.field2516;
                field713 = class158.field2517;
                field714 = class158.field2518;
                field703 = 2;
                field719 = 0;
            }
            int var26 = field700 + 180;
            short var27 = 326;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                method2582(class158.field2555, class158.field2556, class158.field2557);
                field703 = 5;
                return;
            }
        } else if (field703 == 4) {
            int var28 = field700 + 180 - 80;
            short var29 = 321;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                Statics.field154.trim();
                if (Statics.field154.length() != 6) {
                    method2582(class158.field2496, class158.field2342, class158.field2341);
                    return;
                }
                Statics.field100 = Integer.parseInt(Statics.field154);
                Statics.field154 = "";
                field717 = field718 ? class160.field2599 : class160.field2598;
                method2582(class158.field2534, class158.field2535, class158.field2536);
                client.method2795(20);
                return;
            }
            if (var8 == 1 && var9 >= field700 + 180 - 9 && var9 <= field700 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field718 = !field718;
            }
            if (var8 == 1 && var9 >= field700 + 180 - 34 && var9 <= field700 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class139.method2898(Statics.method624("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var30 = field700 + 180 + 80;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                field703 = 0;
                field704 = "";
                field716 = "";
                Statics.field100 = 0;
                Statics.field154 = "";
            }
            while (class138.method2622()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field699.length(); var32++) {
                    if (Statics.field1884 == field699.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field2159 == 13) {
                    field703 = 0;
                    field704 = "";
                    field716 = "";
                    Statics.field100 = 0;
                    Statics.field154 = "";
                } else {
                    if (Statics.field2159 == 85 && Statics.field154.length() > 0) {
                        Statics.field154 = Statics.field154.substring(0, Statics.field154.length() - 1);
                    }
                    if (Statics.field2159 == 84) {
                        Statics.field154.trim();
                        if (Statics.field154.length() != 6) {
                            method2582(class158.field2496, class158.field2342, class158.field2341);
                            return;
                        }
                        Statics.field100 = Integer.parseInt(Statics.field154);
                        Statics.field154 = "";
                        field717 = field718 ? class160.field2599 : class160.field2598;
                        method2582(class158.field2534, class158.field2535, class158.field2536);
                        client.method2795(20);
                        return;
                    }
                    if (var31 && Statics.field154.length() < 6) {
                        Statics.field154 = Statics.field154 + Statics.field1884;
                    }
                }
            }
        } else if (field703 == 5) {
            int var33 = field700 + 180 - 80;
            short var34 = 321;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                method1944();
                return;
            }
            int var35 = field700 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                field712 = class158.field2516;
                field713 = class158.field2517;
                field714 = class158.field2518;
                field703 = 2;
                field719 = 0;
                field716 = "";
            }
            while (class138.method2622()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field720.length(); var37++) {
                    if (Statics.field1884 == field720.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field2159 == 13) {
                    field712 = class158.field2516;
                    field713 = class158.field2517;
                    field714 = class158.field2518;
                    field703 = 2;
                    field719 = 0;
                    field716 = "";
                } else {
                    if (Statics.field2159 == 85 && field704.length() > 0) {
                        field704 = field704.substring(0, field704.length() - 1);
                    }
                    if (Statics.field2159 == 84) {
                        method1944();
                        return;
                    }
                    if (var36 && field704.length() < 320) {
                        field704 = field704 + Statics.field1884;
                    }
                }
            }
        } else if (field703 == 6) {
            while (true) {
                do {
                    if (!class138.method2622()) {
                        short var38 = 321;
                        if (var8 == 1 && var10 >= var38 - 20 && var10 <= var38 + 20) {
                            field712 = class158.field2516;
                            field713 = class158.field2517;
                            field714 = class158.field2518;
                            field703 = 2;
                            field719 = 0;
                            field716 = "";
                        }
                        return;
                    }
                } while (Statics.field2159 != 84 && Statics.field2159 != 13);
                field712 = class158.field2516;
                field713 = class158.field2517;
                field714 = class158.field2518;
                field703 = 2;
                field719 = 0;
                field716 = "";
            }
        }
    }

    @ObfuscatedName("cm.s(I)V")
    public static void method1944() {
        field704 = field704.trim();
        if (field704.length() == 0) {
            method2582(class158.field2555, class158.field2556, class158.field2557);
            return;
        }
        long var0 = class10.method1060();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = Statics.method155(var0, field704);
        }
        switch(var2) {
            case 2:
                method2582(class158.field2558, class158.field2559, class158.field2560);
                field703 = 6;
                break;
            case 3:
                method2582(class158.field2561, class158.field2519, class158.field2563);
                break;
            case 4:
                method2582(class158.field2564, class158.field2565, class158.field2506);
                break;
            case 5:
                method2582(class158.field2567, class158.field2568, class158.field2569);
                break;
            case 6:
                method2582(class158.field2393, class158.field2571, class158.field2410);
                break;
            case 7:
                method2582(class158.field2540, class158.field2574, class158.field2575);
        }
    }

    @ObfuscatedName("db.p(Lhu;Lhu;Lhu;ZI)V")
    public static void method2250(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field697 = (Statics.field763 - client.field494 * 765) / 2;
            field700 = field697 + 202;
        }
        if (field722) {
            if (Statics.field1984 == null) {
                Statics.field1984 = class77.method2606(Statics.field247, "sl_back", "");
            }
            if (Statics.field1537 == null) {
                Statics.field1537 = class77.method2675(Statics.field247, "sl_flags", "");
            }
            if (Statics.field183 == null) {
                Statics.field183 = class77.method2675(Statics.field247, "sl_arrows", "");
            }
            if (Statics.field1139 == null) {
                Statics.field1139 = class77.method2675(Statics.field247, "sl_stars", "");
            }
            class80.method1683(field697, 23, 765, 480, 0);
            class80.method1688(field697, 0, 125, 23, 12425273, 9135624);
            class80.method1688(field697 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3729(class158.field2494, field697 + 62, 15, 0, -1);
            if (Statics.field1139 != null) {
                Statics.field1139[1].method1754(field697 + 140, 1);
                arg1.method3738(class158.field2500, field697 + 152, 10, 16777215, -1);
                Statics.field1139[0].method1754(field697 + 140, 12);
                arg1.method3738(class158.field2578, field697 + 152, 21, 16777215, -1);
            }
            if (Statics.field183 != null) {
                int var4 = field697 + 280;
                if (class26.field620[0] == 0 && class26.field619[0] == 0) {
                    Statics.field183[2].method1754(var4, 4);
                } else {
                    Statics.field183[0].method1754(var4, 4);
                }
                if (class26.field620[0] == 0 && class26.field619[0] == 1) {
                    Statics.field183[3].method1754(var4 + 15, 4);
                } else {
                    Statics.field183[1].method1754(var4 + 15, 4);
                }
                arg0.method3738(class158.field2579, var4 + 32, 17, 16777215, -1);
                int var5 = field697 + 390;
                if (class26.field620[0] == 1 && class26.field619[0] == 0) {
                    Statics.field183[2].method1754(var5, 4);
                } else {
                    Statics.field183[0].method1754(var5, 4);
                }
                if (class26.field620[0] == 1 && class26.field619[0] == 1) {
                    Statics.field183[3].method1754(var5 + 15, 4);
                } else {
                    Statics.field183[1].method1754(var5 + 15, 4);
                }
                arg0.method3738(class158.field2385, var5 + 32, 17, 16777215, -1);
                int var6 = field697 + 500;
                if (class26.field620[0] == 2 && class26.field619[0] == 0) {
                    Statics.field183[2].method1754(var6, 4);
                } else {
                    Statics.field183[0].method1754(var6, 4);
                }
                if (class26.field620[0] == 2 && class26.field619[0] == 1) {
                    Statics.field183[3].method1754(var6 + 15, 4);
                } else {
                    Statics.field183[1].method1754(var6 + 15, 4);
                }
                arg0.method3738(class158.field2407, var6 + 32, 17, 16777215, -1);
                int var7 = field697 + 610;
                if (class26.field620[0] == 3 && class26.field619[0] == 0) {
                    Statics.field183[2].method1754(var7, 4);
                } else {
                    Statics.field183[0].method1754(var7, 4);
                }
                if (class26.field620[0] == 3 && class26.field619[0] == 1) {
                    Statics.field183[3].method1754(var7 + 15, 4);
                } else {
                    Statics.field183[1].method1754(var7 + 15, 4);
                }
                arg0.method3738(class158.field2582, var7 + 32, 17, 16777215, -1);
            }
            class80.method1683(field697 + 708, 4, 50, 16, 0);
            arg1.method3729(class158.field2544, field697 + 708 + 25, 16, 16777215, -1);
            field701 = -1;
            if (Statics.field1984 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class26.field617) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class26.field617) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class26.field617) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field697 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class26.field617; var22++) {
                    class26 var23 = Statics.field616[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field623);
                    if (var23.field623 == -1) {
                        var25 = class158.field2422;
                        var24 = false;
                    } else if (var23.field623 > 1980) {
                        var25 = class158.field2367;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method597()) {
                        if (var23.method621()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method593()) {
                        var26 = 16711680;
                        if (var23.method621()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method591()) {
                        if (var23.method621()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method621()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class141.field2141 >= var19 && class141.field2142 * 20354633 >= var18 && class141.field2141 < var8 + var19 && class141.field2142 * 20354633 < var9 + var18 && var24) {
                        field701 = var22;
                        Statics.field1984[var27].method1590(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1984[var27].method1615(var19, var18);
                    }
                    if (Statics.field1537 != null) {
                        Statics.field1537[(var23.method621() ? 8 : 0) + var23.field626].method1754(var19 + 29, var18);
                    }
                    arg0.method3729(Integer.toString(var23.field621), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3729(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3793(Statics.field616[field701].field625) + 6;
                    int var29 = arg1.field3189 + 8;
                    class80.method1683(class141.field2141 - var28 / 2, class141.field2142 * 20354633 + 20 + 5, var28, var29, 16777120);
                    class80.method1675(class141.field2141 - var28 / 2, class141.field2142 * 20354633 + 20 + 5, var28, var29, 0);
                    arg1.method3729(Statics.field616[field701].field625, class141.field2141, class141.field2142 * 20354633 + 20 + 5 + arg1.field3189 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field193.getGraphics();
                Statics.field2071.method1497(var30, 0, 0);
            } catch (Exception var79) {
                Statics.field193.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field721.method1615(field697, 0);
            Statics.field200.method1615(field697 + 382, 0);
            Statics.field705.method1754(field697 + 382 - Statics.field705.field1391 / 2, 18);
        }
        if (client.field288 == 0 || client.field288 == 5) {
            byte var32 = 20;
            arg0.method3729(class158.field2515, field700 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class80.method1675(field700 + 180 - 152, var33, 304, 34, 9179409);
            class80.method1675(field700 + 180 - 151, var33 + 1, 302, 32, 0);
            class80.method1683(field700 + 180 - 150, var33 + 2, field708 * 3, 30, 9179409);
            class80.method1683(field708 * 3 + (field700 + 180 - 150), var33 + 2, 300 - field708 * 3, 30, 0);
            arg0.method3729(field723, field700 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field288 == 20) {
            Statics.field695.method1754(field700 + 180 - Statics.field695.field1391 / 2, 271 - Statics.field695.field1392 / 2);
            short var34 = 211;
            arg0.method3729(field712, field700 + 180, var34, 16776960, 0);
            int var81 = var34 + 15;
            arg0.method3729(field713, field700 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            arg0.method3729(field714, field700 + 180, var82, 16776960, 0);
            int var83 = var82 + 15;
            int var84 = var83 + 10;
            if (field703 != 4) {
                arg0.method3738(class158.field2537, field700 + 180 - 110, var84, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field704; arg0.method3793(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3738(class224.method3791(var36), field700 + 180 - 70, var84, 16777215, 0);
                var81 = var84 + 15;
                arg0.method3738(class158.field2351 + class164.method642(field716), field700 + 180 - 108, var81, 16777215, 0);
                var81 += 15;
            }
        }
        if (client.field288 == 10 || client.field288 == 11) {
            Statics.field695.method1754(field700, 171);
            if (field703 == 0) {
                short var37 = 251;
                arg0.method3729(class158.field2502, field700 + 180, var37, 16776960, 0);
                int var85 = var37 + 30;
                int var38 = field700 + 180 - 80;
                short var39 = 291;
                Statics.field3045.method1754(var38 - 73, var39 - 20);
                arg0.method3741(class158.field2541, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var40 = field700 + 180 + 80;
                Statics.field3045.method1754(var40 - 73, var39 - 20);
                arg0.method3741(class158.field2462, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field703 == 1) {
                arg0.method3729(field711, field700 + 180, 211, 16776960, 0);
                short var41 = 236;
                arg0.method3729(field712, field700 + 180, var41, 16777215, 0);
                int var86 = var41 + 15;
                arg0.method3729(field713, field700 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method3729(field714, field700 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                int var42 = field700 + 180 - 80;
                short var43 = 321;
                Statics.field3045.method1754(var42 - 73, var43 - 20);
                arg0.method3729(class158.field2313, var42, var43 + 5, 16777215, 0);
                int var44 = field700 + 180 + 80;
                Statics.field3045.method1754(var44 - 73, var43 - 20);
                arg0.method3729(class158.field2544, var44, var43 + 5, 16777215, 0);
            } else if (field703 == 2) {
                short var45 = 211;
                arg0.method3729(field712, field700 + 180, var45, 16776960, 0);
                int var89 = var45 + 15;
                arg0.method3729(field713, field700 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method3729(field714, field700 + 180, var90, 16776960, 0);
                int var91 = var90 + 15;
                int var92 = var91 + 10;
                arg0.method3738(class158.field2537, field700 + 180 - 110, var92, 16777215, 0);
                short var46 = 200;
                String var47;
                for (var47 = field704; arg0.method3793(var47) > var46; var47 = var47.substring(1)) {
                }
                arg0.method3738(class224.method3791(var47) + (field719 == 0 & client.field290 % 40 < 20 ? class2.method759(16776960) + class2.field22 : ""), field700 + 180 - 70, var92, 16777215, 0);
                var89 = var92 + 15;
                arg0.method3738(class158.field2351 + class164.method642(field716) + (field719 == 1 & client.field290 % 40 < 20 ? class2.method759(16776960) + class2.field22 : ""), field700 + 180 - 108, var89, 16777215, 0);
                var89 += 15;
                int var48 = field700 + 180 - 80;
                short var49 = 321;
                Statics.field3045.method1754(var48 - 73, var49 - 20);
                arg0.method3729(class158.field2543, var48, var49 + 5, 16777215, 0);
                int var50 = field700 + 180 + 80;
                Statics.field3045.method1754(var50 - 73, var49 - 20);
                arg0.method3729(class158.field2544, var50, var49 + 5, 16777215, 0);
                short var51 = 357;
                arg1.method3729(class158.field2550, field700 + 180, var51, 16776960, 0);
            } else if (field703 == 3) {
                short var52 = 201;
                arg0.method3729(class158.field2545, field700 + 180, var52, 16776960, 0);
                int var93 = var52 + 20;
                arg1.method3729(class158.field2546, field700 + 180, var93, 16776960, 0);
                int var94 = var93 + 15;
                arg1.method3729(class158.field2547, field700 + 180, var94, 16776960, 0);
                int var95 = var94 + 15;
                int var53 = field700 + 180;
                short var54 = 276;
                Statics.field3045.method1754(var53 - 73, var54 - 20);
                arg2.method3729(class158.field2483, var53, var54 + 5, 16777215, 0);
                int var55 = field700 + 180;
                short var56 = 326;
                Statics.field3045.method1754(var55 - 73, var56 - 20);
                arg2.method3729(class158.field2549, var55, var56 + 5, 16777215, 0);
            } else if (field703 == 4) {
                arg0.method3729(class158.field2532, field700 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3729(field712, field700 + 180, var57, 16777215, 0);
                int var96 = var57 + 15;
                arg0.method3729(field713, field700 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method3729(field714, field700 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                arg0.method3738(class158.field2539 + class164.method642(Statics.field154) + (client.field290 % 40 < 20 ? class2.method759(16776960) + class2.field22 : ""), field700 + 180 - 108, var98, 16777215, 0);
                int var99 = var98 - 8;
                arg0.method3738(class158.field2358, field700 + 180 - 9, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3738(class158.field2377, field700 + 180 - 9, var100, 16776960, 0);
                int var58 = field700 + 180 - 9 + arg0.method3793(class158.field2377) + 15;
                int var59 = var100 - arg0.field3189;
                class81 var60;
                if (field718) {
                    var60 = Statics.field758;
                } else {
                    var60 = Statics.field706;
                }
                var60.method1754(var58, var59);
                var96 = var100 + 15;
                int var61 = field700 + 180 - 80;
                short var62 = 321;
                Statics.field3045.method1754(var61 - 73, var62 - 20);
                arg0.method3729(class158.field2313, var61, var62 + 5, 16777215, 0);
                int var63 = field700 + 180 + 80;
                Statics.field3045.method1754(var63 - 73, var62 - 20);
                arg0.method3729(class158.field2544, var63, var62 + 5, 16777215, 0);
                arg1.method3729(class158.field2533, field700 + 180, var62 + 36, 255, 0);
            } else if (field703 == 5) {
                arg0.method3729(class158.field2584, field700 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3729(field712, field700 + 180, var64, 16776960, 0);
                int var101 = var64 + 15;
                arg2.method3729(field713, field700 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg2.method3729(field714, field700 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var104 = var103 + 14;
                arg0.method3738(class158.field2552, field700 + 180 - 145, var104, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field704; arg0.method3793(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3738(class224.method3791(var66) + (client.field290 % 40 < 20 ? class2.method759(16776960) + class2.field22 : ""), field700 + 180 - 34, var104, 16777215, 0);
                var101 = var104 + 15;
                int var67 = field700 + 180 - 80;
                short var68 = 321;
                Statics.field3045.method1754(var67 - 73, var68 - 20);
                arg0.method3729(class158.field2553, var67, var68 + 5, 16777215, 0);
                int var69 = field700 + 180 + 80;
                Statics.field3045.method1754(var69 - 73, var68 - 20);
                arg0.method3729(class158.field2554, var69, var68 + 5, 16777215, 0);
            } else if (field703 == 6) {
                short var70 = 211;
                arg0.method3729(field712, field700 + 180, var70, 16776960, 0);
                int var105 = var70 + 15;
                arg0.method3729(field713, field700 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method3729(field714, field700 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var71 = field700 + 180;
                short var72 = 321;
                Statics.field3045.method1754(var71 - 73, var72 - 20);
                arg0.method3729(class158.field2554, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field715 > 0) {
            method2057(field715);
            field715 = 0;
        }
        method815();
        Statics.field261[Statics.field866.field146 ? 1 : 0].method1754(field697 + 765 - 40, 463);
        if (client.field288 > 5 && client.field287 == 0) {
            if (Statics.field1663 == null) {
                Statics.field1663 = class77.method171(Statics.field247, "sl_button", "");
            } else {
                int var73 = field697 + 5;
                short var74 = 463;
                byte var75 = 100;
                byte var76 = 35;
                Statics.field1663.method1754(var73, var74);
                arg0.method3729(class158.field2470 + " " + client.field280, var75 / 2 + var73, var76 / 2 + var74 - 2, 16777215, 0);
                if (Statics.field653 == null) {
                    arg1.method3729(class158.field2388, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                } else {
                    arg1.method3729(class158.field2585, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var77 = Statics.field193.getGraphics();
            Statics.field2071.method1497(var77, 0, 0);
        } catch (Exception var80) {
            Statics.field193.repaint();
        }
    }

    @ObfuscatedName("ds.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2582(String arg0, String arg1, String arg2) {
        field712 = arg0;
        field713 = arg1;
        field714 = arg2;
    }

    @ObfuscatedName("ac.g(Lcz;I)V")
    public static final void method892(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field657.length; var2++) {
            Statics.field657[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field657[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1958[var8] = (Statics.field657[var8 - 1] + Statics.field657[var8 + 1] + Statics.field657[var8 - 128] + Statics.field657[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field657;
            Statics.field657 = Statics.field1958;
            Statics.field1958 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1392; var11++) {
            for (int var12 = 0; var12 < arg0.field1391; var12++) {
                if (arg0.field1390[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1394;
                    int var14 = var11 + 16 + arg0.field1395;
                    int var15 = (var14 << 7) + var13;
                    Statics.field657[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cj.a(II)V")
    public static final void method2057(int arg0) {
        short var1 = 256;
        field698 += arg0 * 128;
        if (field698 > Statics.field657.length) {
            field698 -= Statics.field657.length;
            int var2 = (int) (Math.random() * 12.0D);
            method892(Statics.field696[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1370[var3 + var4] - Statics.field657[field698 + var3 & Statics.field657.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1370[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1370[var9 + var10] = 255;
                } else {
                    Statics.field1370[var9 + var10] = 0;
                }
            }
        }
        if (field702 > 0) {
            field702 -= arg0 * 4;
        }
        if (field694 > 0) {
            field694 -= arg0 * 4;
        }
        if (field702 == 0 && field694 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field702 = 1024;
            }
            if (var12 == 1) {
                field694 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field709[var13] = field709[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field709[var14] = (int) (Math.sin((double) field707 / 14.0D) * 16.0D + Math.sin((double) field707 / 15.0D) * 14.0D + Math.sin((double) field707 / 16.0D) * 12.0D);
            field707++;
        }
        field710 += arg0 * -1343659207;
        int var15 = ((client.field290 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field710 * -1424191612; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1370[(var18 << 7) + var17] = 192;
        }
        field710 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1370[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1370[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1048[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1048[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1048[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1370[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("go.r(IIII)I")
    public static final int method3462(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ad.k(I)V")
    public static final void method815() {
        short var0 = 256;
        if (field702 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field702 > 768) {
                    Statics.field1062[var1] = method3462(Statics.field656[var1], Statics.field213[var1], 1024 - field702);
                } else if (field702 > 256) {
                    Statics.field1062[var1] = Statics.field213[var1];
                } else {
                    Statics.field1062[var1] = method3462(Statics.field213[var1], Statics.field656[var1], 256 - field702);
                }
            }
        } else if (field694 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field694 > 768) {
                    Statics.field1062[var2] = method3462(Statics.field656[var2], Statics.field2188[var2], 1024 - field694);
                } else if (field694 > 256) {
                    Statics.field1062[var2] = Statics.field2188[var2];
                } else {
                    Statics.field1062[var2] = method3462(Statics.field2188[var2], Statics.field656[var2], 256 - field694);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1062[var3] = Statics.field656[var3];
            }
        }
        class80.method1677(field697, 9, field697 + 128, var0 + 7);
        Statics.field721.method1615(field697, 0);
        class80.method1676();
        int var4 = 0;
        int var5 = field697 + Statics.field2071.field1367 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field709[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1370[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1062[var10];
                    int var14 = Statics.field2071.field1362[var5];
                    Statics.field2071.field1362[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field2071.field1367 + var8 - 128;
        }
        class80.method1677(field697 + 765 - 128, 9, field697 + 765, var0 + 7);
        Statics.field200.method1615(field697 + 382, 0);
        class80.method1676();
        int var15 = 0;
        int var16 = field697 + Statics.field2071.field1367 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field709[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1370[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1062[var22];
                    int var26 = Statics.field2071.field1362[var20];
                    Statics.field2071.field1362[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2071.field1367 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ea.m(Lec;S)V")
    public static void method2736(class145 arg0) {
        if (class141.field2147 != 1 && Statics.field67 || class141.field2147 != 4) {
            return;
        }
        int var1 = field697 + 280;
        if (class141.field2136 >= var1 && class141.field2136 <= var1 + 14 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(0, 0);
            return;
        }
        if (class141.field2136 >= var1 + 15 && class141.field2136 <= var1 + 80 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(0, 1);
            return;
        }
        int var2 = field697 + 390;
        if (class141.field2136 >= var2 && class141.field2136 <= var2 + 14 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(1, 0);
            return;
        }
        if (class141.field2136 >= var2 + 15 && class141.field2136 <= var2 + 80 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(1, 1);
            return;
        }
        int var3 = field697 + 500;
        if (class141.field2136 >= var3 && class141.field2136 <= var3 + 14 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(2, 0);
            return;
        }
        if (class141.field2136 >= var3 + 15 && class141.field2136 <= var3 + 80 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(2, 1);
            return;
        }
        int var4 = field697 + 610;
        if (class141.field2136 >= var4 && class141.field2136 <= var4 + 14 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(3, 0);
            return;
        }
        if (class141.field2136 >= var4 + 15 && class141.field2136 <= var4 + 80 && class141.field2149 >= 4 && class141.field2149 <= 18) {
            class26.method730(3, 1);
            return;
        }
        if (class141.field2136 >= field697 + 708 && class141.field2149 >= 4 && class141.field2136 <= field697 + 708 + 50 && class141.field2149 <= 20) {
            field722 = false;
            Statics.field721.method1615(field697, 0);
            Statics.field200.method1615(field697 + 382, 0);
            Statics.field705.method1754(field697 + 382 - Statics.field705.field1391 / 2, 18);
            return;
        }
        if (field701 == -1) {
            return;
        }
        class26 var5 = Statics.field616[field701];
        method2647(var5);
        field722 = false;
        Statics.field721.method1615(field697, 0);
        Statics.field200.method1615(field697 + 382, 0);
        Statics.field705.method1754(field697 + 382 - Statics.field705.field1391 / 2, 18);
        return;
    }

    @ObfuscatedName("eu.n(Lv;I)V")
    public static void method2647(class26 arg0) {
        if (arg0.method621() != client.field285) {
            client.field285 = arg0.method621();
            boolean var1 = arg0.method621();
            if (Statics.field1101 != var1) {
                class52.field1087.method3479();
                class52.field1088.method3479();
                class52.field1130.method3479();
                Statics.field1101 = var1;
            }
        }
        Statics.field1733 = arg0.field624;
        client.field280 = arg0.field621;
        client.field281 = arg0.field622;
        Statics.field2282 = client.field283 == 0 ? 43594 : arg0.field621 + 40000;
        Statics.field1948 = client.field283 == 0 ? 443 : arg0.field621 + 50000;
        Statics.field1104 = Statics.field2282;
    }

    @ObfuscatedName("k.y(I)V")
    public static void method128() {
        if (class26.method3111()) {
            field722 = true;
        }
    }
}
