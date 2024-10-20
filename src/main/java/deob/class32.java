package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ac")
public class class32 {

    @ObfuscatedName("ac.l")
    public static int field733 = 0;

    @ObfuscatedName("ac.y")
    public static int field739 = field733 + 202;

    @ObfuscatedName("ac.d")
    public static int[] field717 = new int[256];

    @ObfuscatedName("ac.c")
    public static int field718 = 0;

    @ObfuscatedName("ac.x")
    public static int field708 = 0;

    @ObfuscatedName("ac.am")
    public static int field726 = 0;

    @ObfuscatedName("ac.aw")
    public static int field738 = 0;

    @ObfuscatedName("ac.az")
    public static int field731 = 0;

    @ObfuscatedName("ac.ac")
    public static int field727 = 0;

    @ObfuscatedName("ac.ax")
    public static int field725 = 10;

    @ObfuscatedName("ac.ai")
    public static String field724 = "";

    @ObfuscatedName("ac.ar")
    public static int field723 = 0;

    @ObfuscatedName("ac.aa")
    public static String field712 = "";

    @ObfuscatedName("ac.as")
    public static String field729 = "";

    @ObfuscatedName("ac.ag")
    public static String field730 = "";

    @ObfuscatedName("ac.af")
    public static String field721 = "";

    @ObfuscatedName("ac.ao")
    public static String field732 = "";

    @ObfuscatedName("ac.an")
    public static String field719 = "";

    @ObfuscatedName("ac.at")
    public static class159 field734 = class159.field2608;

    @ObfuscatedName("ac.ae")
    public static boolean field735 = true;

    @ObfuscatedName("ac.ap")
    public static int field736 = 0;

    @ObfuscatedName("ac.ad")
    public static String field728 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ac.au")
    public static String field715 = "1234567890";

    @ObfuscatedName("ac.av")
    public static boolean field722 = false;

    @ObfuscatedName("ac.bg")
    public static int field740 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.j(I)I")
    public static int method2906() {
        return 9;
    }

    @ObfuscatedName("am.l(Ljava/awt/Component;Lff;Lff;ZII)V")
    public static void method650(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field716) {
            field723 = arg4;
            class80.method1672();
            byte[] var5 = arg1.method3052("title.jpg", "");
            Statics.field626 = new class79(var5, arg0);
            Statics.field713 = Statics.field626.method1590();
            if ((client.field288 & 0x20000000) == 0) {
                Statics.field714 = class77.method1034(arg2, "logo", "");
            } else {
                Statics.field714 = class77.method1034(arg2, "logo_deadman_mode", "");
            }
            Statics.field710 = class77.method1034(arg2, "titlebox", "");
            Statics.field711 = class77.method1034(arg2, "titlebutton", "");
            Statics.field737 = class77.method2929(arg2, "runes", "");
            Statics.field2055 = class77.method2929(arg2, "title_mute", "");
            Statics.field2270 = class77.method1034(arg2, "options_radio_buttons,0", "");
            Statics.field65 = class77.method1034(arg2, "options_radio_buttons,2", "");
            Statics.field76 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field76[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field76[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field76[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field76[var9 + 192] = 16777215;
            }
            Statics.field675 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field675[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field675[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field675[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field675[var13 + 192] = 16777215;
            }
            Statics.field618 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field618[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field618[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field618[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field618[var17 + 192] = 16777215;
            }
            Statics.field2086 = new int[256];
            Statics.field166 = new int[32768];
            Statics.field2046 = new int[32768];
            method2741((class81) null);
            Statics.field720 = new int[32768];
            Statics.field2038 = new int[32768];
            if (arg3) {
                field732 = "";
                field719 = "";
            }
            Statics.field22 = 0;
            Statics.field2269 = "";
            field735 = true;
            field722 = false;
            if (Statics.field170.field144) {
                class183.field2958 = 1;
                Statics.field2956 = null;
                Statics.field2044 = -1;
                Statics.field139 = -1;
                Statics.field1389 = 0;
                Statics.field183 = false;
                Statics.field63 = 2;
            } else {
                class183.method42(2, Statics.field2140, "scape main", "", 255, false);
            }
            class171.method2983(false);
            Statics.field716 = true;
            field733 = (Statics.field2191 - client.field504) / 2;
            field739 = field733 + 202;
            Statics.field626.method1642(field733, 0);
            Statics.field713.method1642(field733 + 382, 0);
            Statics.field714.method1736(field733 + 382 - Statics.field714.field1432 / 2, 18);
        } else if (arg4 == 4) {
            field723 = 4;
        }
    }

    @ObfuscatedName("am.a(I)V")
    public static void method651() {
        if (!Statics.field716) {
            return;
        }
        Statics.field710 = null;
        Statics.field711 = null;
        Statics.field737 = null;
        Statics.field626 = null;
        Statics.field713 = null;
        Statics.field714 = null;
        Statics.field2055 = null;
        Statics.field2270 = null;
        Statics.field65 = null;
        Statics.field689 = null;
        Statics.field61 = null;
        Statics.field599 = null;
        Statics.field30 = null;
        Statics.field194 = null;
        Statics.field76 = null;
        Statics.field675 = null;
        Statics.field618 = null;
        Statics.field2086 = null;
        Statics.field166 = null;
        Statics.field2046 = null;
        Statics.field720 = null;
        Statics.field2038 = null;
        class183.field2958 = 1;
        Statics.field2956 = null;
        Statics.field2044 = -1;
        Statics.field139 = -1;
        Statics.field1389 = 0;
        Statics.field183 = false;
        Statics.field63 = 2;
        class171.method2983(true);
        Statics.field716 = false;
    }

    @ObfuscatedName("h.i(Ler;B)V")
    public static void method97(class144 arg0) {
        if (field722) {
            Statics.method85(arg0);
            return;
        }
        if ((class140.field2169 == 1 || !Statics.field1618 && class140.field2169 == 4) && class140.field2170 >= field733 + 765 - 50 && class140.field2164 >= 453) {
            Statics.field170.field144 = !Statics.field170.field144;
            class9.method36();
            if (Statics.field170.field144) {
                class183.method936();
            } else {
                class168 var1 = Statics.field2140;
                int var2 = var1.method3039("scape main");
                int var3 = var1.method3029(var2, "");
                class183.method2247(var1, var2, var3, 255, false);
            }
        }
        if (client.field296 == 5) {
            return;
        }
        field731++;
        if (client.field296 != 10 && client.field296 != 11) {
            return;
        }
        if (client.field473 == 0) {
            if (class140.field2169 == 1 || !Statics.field1618 && class140.field2169 == 4) {
                int var4 = field733 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class140.field2170 >= var4 && class140.field2170 <= var4 + var6 && class140.field2164 >= var5 && class140.field2164 <= var5 + var7) {
                    method229();
                    return;
                }
            }
            if (Statics.field3157 != null) {
                method229();
            }
        }
        int var8 = class140.field2169;
        int var9 = class140.field2170;
        int var10 = class140.field2164;
        if (!Statics.field1618 && var8 == 4) {
            var8 = 1;
        }
        if (field723 == 0) {
            int var11 = field739 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class138.method2982(client.method2694("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = field739 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field288 & 0x2000000) != 0) {
                    field712 = "";
                    field729 = class157.field2409;
                    field730 = class157.field2439;
                    field721 = class157.field2539;
                    field723 = 1;
                    field736 = 0;
                } else if ((client.field288 & 0x4) != 0) {
                    if ((client.field288 & 0x400) == 0) {
                        field729 = class157.field2528;
                        field730 = class157.field2593;
                        field721 = class157.field2530;
                    } else {
                        field729 = class157.field2534;
                        field730 = class157.field2535;
                        field721 = class157.field2536;
                    }
                    field712 = class157.field2527;
                    field723 = 1;
                    field736 = 0;
                } else if ((client.field288 & 0x400) == 0) {
                    field729 = class157.field2524;
                    field730 = class157.field2514;
                    field721 = class157.field2526;
                    field723 = 2;
                    field736 = 0;
                } else {
                    field729 = class157.field2531;
                    field730 = class157.field2532;
                    field721 = class157.field2533;
                    field712 = class157.field2527;
                    field723 = 1;
                    field736 = 0;
                }
            }
        } else if (field723 == 1) {
            while (class137.method3458()) {
                if (Statics.field71 == 84) {
                    field729 = class157.field2524;
                    field730 = class157.field2514;
                    field721 = class157.field2526;
                    field723 = 2;
                    field736 = 0;
                } else if (Statics.field71 == 13) {
                    field723 = 0;
                }
            }
            int var14 = field739 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field729 = class157.field2524;
                field730 = class157.field2514;
                field721 = class157.field2526;
                field723 = 2;
                field736 = 0;
            }
            int var16 = field739 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field723 = 0;
            }
        } else if (field723 == 2) {
            short var17 = 231;
            int var39 = var17 + 30;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field736 = 0;
            }
            var39 += 15;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field736 = 1;
            }
            var39 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                method33(class157.field2563, class157.field2564, class157.field2555);
                field723 = 5;
                return;
            }
            int var19 = field739 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field732 = field732.trim();
                if (field732.length() == 0) {
                    method33(class157.field2430, class157.field2316, class157.field2432);
                    return;
                }
                if (field719.length() == 0) {
                    method33(class157.field2327, class157.field2323, class157.field2435);
                    return;
                }
                method33(class157.field2434, class157.field2543, class157.field2348);
                field734 = Statics.field170.field146.containsKey(class163.method176(field732)) ? class159.field2606 : class159.field2608;
                client.method553(20);
                return;
            }
            int var21 = field739 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field723 = 0;
                field732 = "";
                field719 = "";
                Statics.field22 = 0;
                Statics.field2269 = "";
                field735 = true;
            }
            while (true) {
                while (class137.method3458()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field728.length(); var23++) {
                        if (Statics.field255 == field728.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field71 == 13) {
                        field723 = 0;
                        field732 = "";
                        field719 = "";
                        Statics.field22 = 0;
                        Statics.field2269 = "";
                        field735 = true;
                    } else if (field736 == 0) {
                        if (Statics.field71 == 85 && field732.length() > 0) {
                            field732 = field732.substring(0, field732.length() - 1);
                        }
                        if (Statics.field71 == 84 || Statics.field71 == 80) {
                            field736 = 1;
                        }
                        if (var22 && field732.length() < 320) {
                            field732 = field732 + Statics.field255;
                        }
                    } else if (field736 == 1) {
                        if (Statics.field71 == 85 && field719.length() > 0) {
                            field719 = field719.substring(0, field719.length() - 1);
                        }
                        if (Statics.field71 == 84 || Statics.field71 == 80) {
                            field736 = 0;
                        }
                        if (Statics.field71 == 84) {
                            field732 = field732.trim();
                            if (field732.length() == 0) {
                                method33(class157.field2430, class157.field2316, class157.field2432);
                                return;
                            }
                            if (field719.length() == 0) {
                                method33(class157.field2327, class157.field2323, class157.field2435);
                                return;
                            }
                            method33(class157.field2434, class157.field2543, class157.field2348);
                            field734 = Statics.field170.field146.containsKey(class163.method176(field732)) ? class159.field2606 : class159.field2608;
                            client.method553(20);
                            return;
                        }
                        if (var22 && field719.length() < 20) {
                            field719 = field719 + Statics.field255;
                        }
                    }
                }
                return;
            }
        } else if (field723 == 3) {
            int var24 = field739 + 180;
            short var25 = 276;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field729 = class157.field2524;
                field730 = class157.field2514;
                field721 = class157.field2526;
                field723 = 2;
                field736 = 0;
            }
            int var26 = field739 + 180;
            short var27 = 326;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                method33(class157.field2563, class157.field2564, class157.field2555);
                field723 = 5;
                return;
            }
        } else if (field723 == 4) {
            int var28 = field739 + 180 - 80;
            short var29 = 321;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                Statics.field2269.trim();
                if (Statics.field2269.length() != 6) {
                    method33(class157.field2349, class157.field2350, class157.field2351);
                    return;
                }
                Statics.field22 = Integer.parseInt(Statics.field2269);
                Statics.field2269 = "";
                field734 = field735 ? class159.field2610 : class159.field2609;
                method33(class157.field2434, class157.field2543, class157.field2348);
                client.method553(20);
                return;
            }
            if (var8 == 1 && var9 >= field739 + 180 - 9 && var9 <= field739 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field735 = !field735;
            }
            if (var8 == 1 && var9 >= field739 + 180 - 34 && var9 <= field739 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class138.method2982(client.method2694("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var30 = field739 + 180 + 80;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                field723 = 0;
                field732 = "";
                field719 = "";
                Statics.field22 = 0;
                Statics.field2269 = "";
            }
            while (class137.method3458()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field715.length(); var32++) {
                    if (Statics.field255 == field715.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field71 == 13) {
                    field723 = 0;
                    field732 = "";
                    field719 = "";
                    Statics.field22 = 0;
                    Statics.field2269 = "";
                } else {
                    if (Statics.field71 == 85 && Statics.field2269.length() > 0) {
                        Statics.field2269 = Statics.field2269.substring(0, Statics.field2269.length() - 1);
                    }
                    if (Statics.field71 == 84) {
                        Statics.field2269.trim();
                        if (Statics.field2269.length() != 6) {
                            method33(class157.field2349, class157.field2350, class157.field2351);
                            return;
                        }
                        Statics.field22 = Integer.parseInt(Statics.field2269);
                        Statics.field2269 = "";
                        field734 = field735 ? class159.field2610 : class159.field2609;
                        method33(class157.field2434, class157.field2543, class157.field2348);
                        client.method553(20);
                        return;
                    }
                    if (var31 && Statics.field2269.length() < 6) {
                        Statics.field2269 = Statics.field2269 + Statics.field255;
                    }
                }
            }
        } else if (field723 == 5) {
            int var33 = field739 + 180 - 80;
            short var34 = 321;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                method2542();
                return;
            }
            int var35 = field739 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                field729 = class157.field2524;
                field730 = class157.field2514;
                field721 = class157.field2526;
                field723 = 2;
                field736 = 0;
                field719 = "";
            }
            while (class137.method3458()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field728.length(); var37++) {
                    if (Statics.field255 == field728.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field71 == 13) {
                    field729 = class157.field2524;
                    field730 = class157.field2514;
                    field721 = class157.field2526;
                    field723 = 2;
                    field736 = 0;
                    field719 = "";
                } else {
                    if (Statics.field71 == 85 && field732.length() > 0) {
                        field732 = field732.substring(0, field732.length() - 1);
                    }
                    if (Statics.field71 == 84) {
                        method2542();
                        return;
                    }
                    if (var36 && field732.length() < 320) {
                        field732 = field732 + Statics.field255;
                    }
                }
            }
        } else if (field723 == 6) {
            while (true) {
                do {
                    if (!class137.method3458()) {
                        short var38 = 321;
                        if (var8 == 1 && var10 >= var38 - 20 && var10 <= var38 + 20) {
                            field729 = class157.field2524;
                            field730 = class157.field2514;
                            field721 = class157.field2526;
                            field723 = 2;
                            field736 = 0;
                            field719 = "";
                        }
                        return;
                    }
                } while (Statics.field71 != 84 && Statics.field71 != 13);
                field729 = class157.field2524;
                field730 = class157.field2514;
                field721 = class157.field2526;
                field723 = 2;
                field736 = 0;
                field719 = "";
            }
        }
    }

    @ObfuscatedName("df.f(B)V")
    public static void method2542() {
        field732 = field732.trim();
        if (field732.length() == 0) {
            method33(class157.field2563, class157.field2564, class157.field2555);
            return;
        }
        long var0 = class10.method1();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method182(var0, field732);
        }
        switch(var2) {
            case 2:
                method33(class157.field2566, class157.field2582, class157.field2568);
                field723 = 6;
                break;
            case 3:
                method33(class157.field2569, class157.field2570, class157.field2345);
                break;
            case 4:
                method33(class157.field2572, class157.field2573, class157.field2574);
                break;
            case 5:
                method33(class157.field2575, class157.field2576, class157.field2577);
                break;
            case 6:
                method33(class157.field2578, class157.field2579, class157.field2489);
                break;
            case 7:
                method33(class157.field2358, class157.field2479, class157.field2583);
        }
    }

    @ObfuscatedName("en.m(Lhg;Lhg;Lhg;ZI)V")
    public static void method2662(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field733 = (Statics.field2191 - client.field504) / 2;
            field739 = field733 + 202;
        }
        if (field722) {
            method35(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field626.method1642(field733, 0);
            Statics.field713.method1642(field733 + 382, 0);
            Statics.field714.method1736(field733 + 382 - Statics.field714.field1432 / 2, 18);
        }
        if (client.field296 == 0 || client.field296 == 5) {
            byte var4 = 20;
            arg0.method3794(class157.field2523, field739 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1711(field739 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1711(field739 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1674(field739 + 180 - 150, var5 + 2, field725 * 3, 30, 9179409);
            class80.method1674(field725 * 3 + (field739 + 180 - 150), var5 + 2, 300 - field725 * 3, 30, 0);
            arg0.method3794(field724, field739 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field296 == 20) {
            Statics.field710.method1736(field739 + 180 - Statics.field710.field1432 / 2, 271 - Statics.field710.field1435 / 2);
            short var6 = 211;
            arg0.method3794(field729, field739 + 180, var6, 16776960, 0);
            int var79 = var6 + 15;
            arg0.method3794(field730, field739 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            arg0.method3794(field721, field739 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            int var82 = var81 + 10;
            if (field723 != 4) {
                arg0.method3722(class157.field2545, field739 + 180 - 110, var82, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field732; arg0.method3717(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3722(class223.method3721(var8), field739 + 180 - 70, var82, 16777215, 0);
                var79 = var82 + 15;
                arg0.method3722(class157.field2546 + Statics.method2739(field719), field739 + 180 - 108, var79, 16777215, 0);
                var79 += 15;
            }
        }
        if (client.field296 == 10 || client.field296 == 11) {
            Statics.field710.method1736(field739, 171);
            if (field723 == 0) {
                short var9 = 251;
                arg0.method3794(class157.field2548, field739 + 180, var9, 16776960, 0);
                int var83 = var9 + 30;
                int var10 = field739 + 180 - 80;
                short var11 = 291;
                Statics.field711.method1736(var10 - 73, var11 - 20);
                arg0.method3725(class157.field2549, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field739 + 180 + 80;
                Statics.field711.method1736(var12 - 73, var11 - 20);
                arg0.method3725(class157.field2558, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field723 == 1) {
                arg0.method3794(field712, field739 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3794(field729, field739 + 180, var13, 16777215, 0);
                int var84 = var13 + 15;
                arg0.method3794(field730, field739 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                arg0.method3794(field721, field739 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                int var14 = field739 + 180 - 80;
                short var15 = 321;
                Statics.field711.method1736(var14 - 73, var15 - 20);
                arg0.method3794(class157.field2321, var14, var15 + 5, 16777215, 0);
                int var16 = field739 + 180 + 80;
                Statics.field711.method1736(var16 - 73, var15 - 20);
                arg0.method3794(class157.field2552, var16, var15 + 5, 16777215, 0);
            } else if (field723 == 2) {
                short var17 = 211;
                arg0.method3794(field729, field739 + 180, var17, 16776960, 0);
                int var87 = var17 + 15;
                arg0.method3794(field730, field739 + 180, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3794(field721, field739 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3722(class157.field2545, field739 + 180 - 110, var90, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field732; arg0.method3717(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3722(class223.method3721(var19) + (field736 == 0 & client.field395 % 40 < 20 ? class2.method589(16776960) + class2.field21 : ""), field739 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3722(class157.field2546 + Statics.method2739(field719) + (field736 == 1 & client.field395 % 40 < 20 ? class2.method589(16776960) + class2.field21 : ""), field739 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
                int var20 = field739 + 180 - 80;
                short var21 = 321;
                Statics.field711.method1736(var20 - 73, var21 - 20);
                arg0.method3794(class157.field2551, var20, var21 + 5, 16777215, 0);
                int var22 = field739 + 180 + 80;
                Statics.field711.method1736(var22 - 73, var21 - 20);
                arg0.method3794(class157.field2552, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3794(class157.field2336, field739 + 180, var23, 16776960, 0);
            } else if (field723 == 3) {
                short var24 = 201;
                arg0.method3794(class157.field2553, field739 + 180, var24, 16776960, 0);
                int var91 = var24 + 20;
                arg1.method3794(class157.field2554, field739 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method3794(class157.field2493, field739 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var25 = field739 + 180;
                short var26 = 276;
                Statics.field711.method1736(var25 - 73, var26 - 20);
                arg2.method3794(class157.field2556, var25, var26 + 5, 16777215, 0);
                int var27 = field739 + 180;
                short var28 = 326;
                Statics.field711.method1736(var27 - 73, var28 - 20);
                arg2.method3794(class157.field2557, var27, var28 + 5, 16777215, 0);
            } else if (field723 == 4) {
                arg0.method3794(class157.field2540, field739 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3794(field729, field739 + 180, var29, 16777215, 0);
                int var94 = var29 + 15;
                arg0.method3794(field730, field739 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3794(field721, field739 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3722(class157.field2491 + Statics.method2739(Statics.field2269) + (client.field395 % 40 < 20 ? class2.method589(16776960) + class2.field21 : ""), field739 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method3722(class157.field2436, field739 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3722(class157.field2324, field739 + 180 - 9, var98, 16776960, 0);
                int var30 = field739 + 180 - 9 + arg0.method3717(class157.field2324) + 15;
                int var31 = var98 - arg0.field3183;
                class81 var32;
                if (field735) {
                    var32 = Statics.field65;
                } else {
                    var32 = Statics.field2270;
                }
                var32.method1736(var30, var31);
                var94 = var98 + 15;
                int var33 = field739 + 180 - 80;
                short var34 = 321;
                Statics.field711.method1736(var33 - 73, var34 - 20);
                arg0.method3794(class157.field2321, var33, var34 + 5, 16777215, 0);
                int var35 = field739 + 180 + 80;
                Statics.field711.method1736(var35 - 73, var34 - 20);
                arg0.method3794(class157.field2552, var35, var34 + 5, 16777215, 0);
                arg1.method3794(class157.field2541, field739 + 180, var34 + 36, 255, 0);
            } else if (field723 == 5) {
                arg0.method3794(class157.field2470, field739 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3794(field729, field739 + 180, var36, 16776960, 0);
                int var99 = var36 + 15;
                arg2.method3794(field730, field739 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method3794(field721, field739 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method3722(class157.field2342, field739 + 180 - 145, var102, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field732; arg0.method3717(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3722(class223.method3721(var38) + (client.field395 % 40 < 20 ? class2.method589(16776960) + class2.field21 : ""), field739 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var39 = field739 + 180 - 80;
                short var40 = 321;
                Statics.field711.method1736(var39 - 73, var40 - 20);
                arg0.method3794(class157.field2561, var39, var40 + 5, 16777215, 0);
                int var41 = field739 + 180 + 80;
                Statics.field711.method1736(var41 - 73, var40 - 20);
                arg0.method3794(class157.field2562, var41, var40 + 5, 16777215, 0);
            } else if (field723 == 6) {
                short var42 = 211;
                arg0.method3794(field729, field739 + 180, var42, 16776960, 0);
                int var103 = var42 + 15;
                arg0.method3794(field730, field739 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method3794(field721, field739 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var43 = field739 + 180;
                short var44 = 321;
                Statics.field711.method1736(var43 - 73, var44 - 20);
                arg0.method3794(class157.field2562, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field731 > 0) {
            int var45 = field731;
            short var46 = 256;
            field726 += var45 * 128;
            if (field726 > Statics.field166.length) {
                field726 -= Statics.field166.length;
                int var47 = (int) (Math.random() * 12.0D);
                method2741(Statics.field737[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field720[var48 + var49] - Statics.field166[field726 + var48 & Statics.field166.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field720[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field720[var54 + var55] = 255;
                    } else {
                        Statics.field720[var54 + var55] = 0;
                    }
                }
            }
            if (field718 > 0) {
                field718 -= var45 * 4;
            }
            if (field708 > 0) {
                field708 -= var45 * 4;
            }
            if (field718 == 0 && field708 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field718 = 1024;
                }
                if (var57 == 1) {
                    field708 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field717[var58] = field717[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field717[var59] = (int) (Math.sin((double) field727 / 14.0D) * 16.0D + Math.sin((double) field727 / 15.0D) * 14.0D + Math.sin((double) field727 / 16.0D) * 12.0D);
                field727++;
            }
            field738 += var45 * -1373068663;
            int var60 = ((client.field395 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field738 * -1033292732; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field720[(var63 << 7) + var62] = 192;
                }
                field738 = 0;
                int var64 = 0;
                label226: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label226;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field2038[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field2038[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field720[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field720[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field720[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field2038[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field731 = 0;
        }
        method1941();
        Statics.field2055[Statics.field170.field144 ? 1 : 0].method1736(field733 + 765 - 40, 463);
        if (client.field296 > 5 && client.field473 == 0) {
            if (Statics.field194 == null) {
                Statics.field194 = class77.method1034(Statics.field2596, "sl_button", "");
            } else {
                int var72 = field733 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field194.method1736(var72, var73);
                arg0.method3794(class157.field2478 + " " + client.field287, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field3157 == null) {
                    arg1.method3794(class157.field2581, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3794(class157.field2542, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field2040.getGraphics();
            Statics.field1386.method1518(var76, 0, 0);
        } catch (Exception var78) {
            Statics.field2040.repaint();
        }
    }

    @ObfuscatedName("i.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method33(String arg0, String arg1, String arg2) {
        field729 = arg0;
        field730 = arg1;
        field721 = arg2;
    }

    @ObfuscatedName("eh.h(Lch;B)V")
    public static final void method2741(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field166.length; var2++) {
            Statics.field166[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field166[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2046[var8] = (Statics.field166[var8 - 1] + Statics.field166[var8 + 1] + Statics.field166[var8 - 128] + Statics.field166[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field166;
            Statics.field166 = Statics.field2046;
            Statics.field2046 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1435; var11++) {
            for (int var12 = 0; var12 < arg0.field1432; var12++) {
                if (arg0.field1430[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1434;
                    int var14 = var11 + 16 + arg0.field1431;
                    int var15 = (var14 << 7) + var13;
                    Statics.field166[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("t.n(IIII)I")
    public static final int method572(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cd.k(B)V")
    public static final void method1941() {
        short var0 = 256;
        if (field718 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field718 > 768) {
                    Statics.field2086[var1] = method572(Statics.field76[var1], Statics.field675[var1], 1024 - field718);
                } else if (field718 > 256) {
                    Statics.field2086[var1] = Statics.field675[var1];
                } else {
                    Statics.field2086[var1] = method572(Statics.field675[var1], Statics.field76[var1], 256 - field718);
                }
            }
        } else if (field708 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field708 > 768) {
                    Statics.field2086[var2] = method572(Statics.field76[var2], Statics.field618[var2], 1024 - field708);
                } else if (field708 > 256) {
                    Statics.field2086[var2] = Statics.field618[var2];
                } else {
                    Statics.field2086[var2] = method572(Statics.field618[var2], Statics.field76[var2], 256 - field708);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2086[var3] = Statics.field76[var3];
            }
        }
        class80.method1676(field733, 9, field733 + 128, var0 + 7);
        Statics.field626.method1642(field733, 0);
        class80.method1667();
        int var4 = 0;
        int var5 = field733 + Statics.field1386.field1401 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field717[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field720[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2086[var10];
                    int var14 = Statics.field1386.field1403[var5];
                    Statics.field1386.field1403[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field1386.field1401 + var8 - 128;
        }
        class80.method1676(field733 + 765 - 128, 9, field733 + 765, var0 + 7);
        Statics.field713.method1642(field733 + 382, 0);
        class80.method1667();
        int var15 = 0;
        int var16 = field733 + Statics.field1386.field1401 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field717[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field720[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2086[var22];
                    int var26 = Statics.field1386.field1403[var20];
                    Statics.field1386.field1403[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1386.field1401 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("i.r(Lhg;Lhg;I)V")
    public static void method35(class224 arg0, class224 arg1) {
        if (Statics.field689 == null) {
            Statics.field689 = class77.method2617(Statics.field2596, "sl_back", "");
        }
        if (Statics.field61 == null) {
            Statics.field61 = class77.method2929(Statics.field2596, "sl_flags", "");
        }
        if (Statics.field599 == null) {
            Statics.field599 = class77.method2929(Statics.field2596, "sl_arrows", "");
        }
        if (Statics.field30 == null) {
            Statics.field30 = class77.method2929(Statics.field2596, "sl_stars", "");
        }
        class80.method1674(field733, 23, 765, 480, 0);
        class80.method1675(field733, 0, 125, 23, 12425273, 9135624);
        class80.method1675(field733 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3794(class157.field2584, field733 + 62, 15, 0, -1);
        if (Statics.field30 != null) {
            Statics.field30[1].method1736(field733 + 140, 1);
            arg1.method3722(class157.field2463, field733 + 152, 10, 16777215, -1);
            Statics.field30[0].method1736(field733 + 140, 12);
            arg1.method3722(class157.field2586, field733 + 152, 21, 16777215, -1);
        }
        if (Statics.field599 != null) {
            int var2 = field733 + 280;
            if (class26.field637[0] == 0 && class26.field646[0] == 0) {
                Statics.field599[2].method1736(var2, 4);
            } else {
                Statics.field599[0].method1736(var2, 4);
            }
            if (class26.field637[0] == 0 && class26.field646[0] == 1) {
                Statics.field599[3].method1736(var2 + 15, 4);
            } else {
                Statics.field599[1].method1736(var2 + 15, 4);
            }
            arg0.method3722(class157.field2509, var2 + 32, 17, 16777215, -1);
            int var3 = field733 + 390;
            if (class26.field637[0] == 1 && class26.field646[0] == 0) {
                Statics.field599[2].method1736(var3, 4);
            } else {
                Statics.field599[0].method1736(var3, 4);
            }
            if (class26.field637[0] == 1 && class26.field646[0] == 1) {
                Statics.field599[3].method1736(var3 + 15, 4);
            } else {
                Statics.field599[1].method1736(var3 + 15, 4);
            }
            arg0.method3722(class157.field2588, var3 + 32, 17, 16777215, -1);
            int var4 = field733 + 500;
            if (class26.field637[0] == 2 && class26.field646[0] == 0) {
                Statics.field599[2].method1736(var4, 4);
            } else {
                Statics.field599[0].method1736(var4, 4);
            }
            if (class26.field637[0] == 2 && class26.field646[0] == 1) {
                Statics.field599[3].method1736(var4 + 15, 4);
            } else {
                Statics.field599[1].method1736(var4 + 15, 4);
            }
            arg0.method3722(class157.field2589, var4 + 32, 17, 16777215, -1);
            int var5 = field733 + 610;
            if (class26.field637[0] == 3 && class26.field646[0] == 0) {
                Statics.field599[2].method1736(var5, 4);
            } else {
                Statics.field599[0].method1736(var5, 4);
            }
            if (class26.field637[0] == 3 && class26.field646[0] == 1) {
                Statics.field599[3].method1736(var5 + 15, 4);
            } else {
                Statics.field599[1].method1736(var5 + 15, 4);
            }
            arg0.method3722(class157.field2422, var5 + 32, 17, 16777215, -1);
        }
        class80.method1674(field733 + 708, 4, 50, 16, 0);
        arg1.method3794(class157.field2552, field733 + 708 + 25, 16, 16777215, -1);
        field740 = -1;
        if (Statics.field689 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field634) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field634) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field634) {
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
            int var17 = field733 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field634; var20++) {
                class26 var21 = Statics.field633[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field640);
                if (var21.field640 == -1) {
                    var23 = class157.field2591;
                    var22 = false;
                } else if (var21.field640 > 1980) {
                    var23 = class157.field2592;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method594()) {
                    if (var21.method609()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method598()) {
                    var24 = 16711680;
                    if (var21.method609()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method599()) {
                    if (var21.method609()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method609()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class140.field2163 >= var17 && class140.field2172 * 488798971 >= var16 && class140.field2163 < var6 + var17 && class140.field2172 * 488798971 < var7 + var16 && var22) {
                    field740 = var20;
                    Statics.field689[var25].method1594(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field689[var25].method1642(var17, var16);
                }
                if (Statics.field61 != null) {
                    Statics.field61[(var21.method609() ? 8 : 0) + var21.field636].method1736(var17 + 29, var16);
                }
                arg0.method3794(Integer.toString(var21.field638), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3794(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3717(Statics.field633[field740].field642) + 6;
                int var27 = arg1.field3183 + 8;
                class80.method1674(class140.field2163 - var26 / 2, class140.field2172 * 488798971 + 20 + 5, var26, var27, 16777120);
                class80.method1711(class140.field2163 - var26 / 2, class140.field2172 * 488798971 + 20 + 5, var26, var27, 0);
                arg1.method3794(Statics.field633[field740].field642, class140.field2163, class140.field2172 * 488798971 + 20 + 5 + arg1.field3183 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field2040.getGraphics();
            Statics.field1386.method1518(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field2040.repaint();
        }
    }

    @ObfuscatedName("l.q(Lv;I)V")
    public static void method9(class26 arg0) {
        if (arg0.method609() != client.field292) {
            client.field292 = arg0.method609();
            class52.method3109(arg0.method609());
        }
        Statics.field2180 = arg0.field641;
        client.field287 = arg0.field638;
        client.field288 = arg0.field639;
        Statics.field3153 = client.field289 == 0 ? 43594 : arg0.field638 + 40000;
        Statics.field112 = client.field289 == 0 ? 443 : arg0.field638 + 50000;
        Statics.field573 = Statics.field3153;
    }

    @ObfuscatedName("p.u(I)V")
    public static void method229() {
        if (class26.method1936()) {
            field722 = true;
        }
    }
}
