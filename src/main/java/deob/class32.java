package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("an")
public class class32 {

    @ObfuscatedName("an.e")
    public static int field711 = 0;

    @ObfuscatedName("an.v")
    public static int field739 = field711 + 202;

    @ObfuscatedName("an.k")
    public static int[] field733 = new int[256];

    @ObfuscatedName("an.m")
    public static int field730 = 0;

    @ObfuscatedName("an.g")
    public static int field720 = 0;

    @ObfuscatedName("an.aa")
    public static int field717 = 0;

    @ObfuscatedName("an.ay")
    public static int field722 = 0;

    @ObfuscatedName("an.ak")
    public static int field723 = 0;

    @ObfuscatedName("an.an")
    public static int field724 = 0;

    @ObfuscatedName("an.af")
    public static int field725 = 10;

    @ObfuscatedName("an.ao")
    public static String field743 = "";

    @ObfuscatedName("an.as")
    public static int field727 = 0;

    @ObfuscatedName("an.am")
    public static String field728 = "";

    @ObfuscatedName("an.ae")
    public static String field729 = "";

    @ObfuscatedName("an.ax")
    public static String field721 = "";

    @ObfuscatedName("an.aj")
    public static String field731 = "";

    @ObfuscatedName("an.ab")
    public static String field732 = "";

    @ObfuscatedName("an.av")
    public static class159 field744 = class159.field2591;

    @ObfuscatedName("an.ar")
    public static boolean field734 = true;

    @ObfuscatedName("an.az")
    public static int field735 = 0;

    @ObfuscatedName("an.ad")
    public static String field736 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("an.au")
    public static String field737 = "1234567890";

    @ObfuscatedName("an.ag")
    public static boolean field738 = false;

    @ObfuscatedName("an.bw")
    public static int field741 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.o(Ljava/awt/Component;Lfq;Lfq;ZII)V")
    public static void method602(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field710) {
            field727 = arg4;
            class80.method1654();
            byte[] var5 = arg1.method3074("title.jpg", "");
            Statics.field1949 = new class79(var5, arg0);
            Statics.field712 = Statics.field1949.method1606();
            if ((client.field435 & 0x20000000) == 0) {
                Statics.field713 = class77.method2985(arg2, "logo", "");
            } else {
                Statics.field713 = class77.method2985(arg2, "logo_deadman_mode", "");
            }
            Statics.field129 = class77.method2985(arg2, "titlebox", "");
            Statics.field215 = class77.method2985(arg2, "titlebutton", "");
            Statics.field2033 = class77.method604(arg2, "runes", "");
            Statics.field714 = class77.method604(arg2, "title_mute", "");
            Statics.field662 = class77.method2985(arg2, "options_radio_buttons,0", "");
            Statics.field191 = class77.method2985(arg2, "options_radio_buttons,2", "");
            Statics.field2933 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2933[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2933[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2933[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2933[var9 + 192] = 16777215;
            }
            Statics.field1610 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1610[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1610[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1610[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1610[var13 + 192] = 16777215;
            }
            Statics.field204 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field204[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field204[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field204[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field204[var17 + 192] = 16777215;
            }
            Statics.field2031 = new int[256];
            Statics.field1016 = new int[32768];
            Statics.field1343 = new int[32768];
            method2038((class81) null);
            Statics.field2633 = new int[32768];
            Statics.field1736 = new int[32768];
            if (arg3) {
                field731 = "";
                field732 = "";
            }
            Statics.field1959 = 0;
            Statics.field12 = "";
            field734 = true;
            field738 = false;
            if (Statics.field2908.field134) {
                class183.method1(2);
            } else {
                class168 var18 = Statics.field2277;
                int var19 = var18.method3072("scape main");
                int var20 = var18.method3073(var19, "");
                class183.field2951 = 1;
                Statics.field2952 = var18;
                Statics.field2953 = var19;
                Statics.field2654 = var20;
                Statics.field673 = 255;
                Statics.field2957 = false;
                Statics.field2955 = 2;
            }
            class171.method3035(false);
            Statics.field710 = true;
            field711 = (Statics.field1146 - client.field402) / 2;
            field739 = field711 + 202;
            Statics.field1949.method1565(field711, 0);
            Statics.field712.method1565(field711 + 382, 0);
            Statics.field713.method1714(field711 + 382 - Statics.field713.field1411 / 2, 18);
        } else if (arg4 == 4) {
            field727 = 4;
        }
    }

    @ObfuscatedName("bp.e(I)V")
    public static void method1033() {
        if (!Statics.field710) {
            return;
        }
        Statics.field129 = null;
        Statics.field215 = null;
        Statics.field2033 = null;
        Statics.field1949 = null;
        Statics.field712 = null;
        Statics.field713 = null;
        Statics.field714 = null;
        Statics.field662 = null;
        Statics.field191 = null;
        Statics.field791 = null;
        Statics.field1347 = null;
        Statics.field1993 = null;
        Statics.field1986 = null;
        Statics.field235 = null;
        Statics.field2933 = null;
        Statics.field1610 = null;
        Statics.field204 = null;
        Statics.field2031 = null;
        Statics.field1016 = null;
        Statics.field1343 = null;
        Statics.field2633 = null;
        Statics.field1736 = null;
        class183.method1(2);
        class171.method3035(true);
        Statics.field710 = false;
    }

    @ObfuscatedName("q.u(Leo;B)V")
    public static void method162(class144 arg0) {
        if (!field738) {
            if ((class140.field2150 == 1 || !Statics.field977 && class140.field2150 == 4) && class140.field2151 >= field711 + 765 - 50 && class140.field2154 >= 453) {
                Statics.field2908.field134 = !Statics.field2908.field134;
                class9.method96();
                if (Statics.field2908.field134) {
                    class183.method2250();
                } else {
                    class168 var6 = Statics.field2277;
                    int var7 = var6.method3072("scape main");
                    int var8 = var6.method3073(var7, "");
                    class183.method2959(var6, var7, var8, 255, false);
                }
            }
            if (client.field546 != 5) {
                field723++;
                if (client.field546 == 10 || client.field546 == 11) {
                    if (client.field284 == 0) {
                        if (class140.field2150 == 1 || !Statics.field977 && class140.field2150 == 4) {
                            int var9 = field711 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class140.field2151 >= var9 && class140.field2151 <= var9 + var11 && class140.field2154 >= var10 && class140.field2154 <= var10 + var12) {
                                Statics.method2213();
                                return;
                            }
                        }
                        if (Statics.field3154 != null) {
                            Statics.method2213();
                        }
                    }
                    int var13 = class140.field2150;
                    int var14 = class140.field2151;
                    int var15 = class140.field2154;
                    if (!Statics.field977 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field727 == 0) {
                        int var16 = field739 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class138.method49(client.method2953("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field739 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field435 & 0x4) != 0) {
                                if ((client.field435 & 0x400) == 0) {
                                    field728 = class157.field2510;
                                    field729 = class157.field2368;
                                    field721 = class157.field2440;
                                } else {
                                    field728 = class157.field2480;
                                    field729 = class157.field2529;
                                    field721 = class157.field2530;
                                }
                                field727 = 1;
                                field735 = 0;
                            } else if ((client.field435 & 0x400) == 0) {
                                field728 = class157.field2518;
                                field729 = class157.field2519;
                                field721 = class157.field2520;
                                field727 = 2;
                                field735 = 0;
                            } else {
                                field728 = class157.field2525;
                                field729 = class157.field2421;
                                field721 = class157.field2573;
                                field727 = 1;
                                field735 = 0;
                            }
                        }
                    } else if (field727 == 1) {
                        while (class137.method712()) {
                            if (Statics.field2025 == 84) {
                                field728 = class157.field2518;
                                field729 = class157.field2519;
                                field721 = class157.field2520;
                                field727 = 2;
                                field735 = 0;
                            } else if (Statics.field2025 == 13) {
                                field727 = 0;
                            }
                        }
                        int var19 = field739 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field728 = class157.field2518;
                            field729 = class157.field2519;
                            field721 = class157.field2520;
                            field727 = 2;
                            field735 = 0;
                        }
                        int var21 = field739 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field727 = 0;
                        }
                    } else if (field727 == 2) {
                        short var22 = 231;
                        int var40 = var22 + 30;
                        if (var13 == 1 && var15 >= var40 - 15 && var15 < var40) {
                            field735 = 0;
                        }
                        var40 += 15;
                        if (var13 == 1 && var15 >= var40 - 15 && var15 < var40) {
                            field735 = 1;
                        }
                        var40 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method2807(class157.field2446, class157.field2550, class157.field2551);
                            field727 = 5;
                            return;
                        }
                        int var24 = field739 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field731 = field731.trim();
                            if (field731.length() == 0) {
                                method2807(class157.field2424, class157.field2523, class157.field2426);
                                return;
                            }
                            if (field732.length() == 0) {
                                method2807(class157.field2507, class157.field2428, class157.field2429);
                                return;
                            }
                            method2807(class157.field2533, class157.field2346, class157.field2535);
                            field744 = Statics.field2908.field136.containsKey(class163.method2943(field731)) ? class159.field2593 : class159.field2591;
                            client.method633(20);
                            return;
                        }
                        int var26 = field739 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field727 = 0;
                            field731 = "";
                            field732 = "";
                            Statics.field1959 = 0;
                            Statics.field12 = "";
                            field734 = true;
                        }
                        while (true) {
                            while (class137.method712()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field736.length(); var28++) {
                                    if (Statics.field1922 == field736.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2025 == 13) {
                                    field727 = 0;
                                    field731 = "";
                                    field732 = "";
                                    Statics.field1959 = 0;
                                    Statics.field12 = "";
                                    field734 = true;
                                } else if (field735 == 0) {
                                    if (Statics.field2025 == 85 && field731.length() > 0) {
                                        field731 = field731.substring(0, field731.length() - 1);
                                    }
                                    if (Statics.field2025 == 84 || Statics.field2025 == 80) {
                                        field735 = 1;
                                    }
                                    if (var27 && field731.length() < 320) {
                                        field731 = field731 + Statics.field1922;
                                    }
                                } else if (field735 == 1) {
                                    if (Statics.field2025 == 85 && field732.length() > 0) {
                                        field732 = field732.substring(0, field732.length() - 1);
                                    }
                                    if (Statics.field2025 == 84 || Statics.field2025 == 80) {
                                        field735 = 0;
                                    }
                                    if (Statics.field2025 == 84) {
                                        field731 = field731.trim();
                                        if (field731.length() == 0) {
                                            method2807(class157.field2424, class157.field2523, class157.field2426);
                                            return;
                                        }
                                        if (field732.length() == 0) {
                                            method2807(class157.field2507, class157.field2428, class157.field2429);
                                            return;
                                        }
                                        method2807(class157.field2533, class157.field2346, class157.field2535);
                                        field744 = Statics.field2908.field136.containsKey(class163.method2943(field731)) ? class159.field2593 : class159.field2591;
                                        client.method633(20);
                                        return;
                                    }
                                    if (var27 && field732.length() < 20) {
                                        field732 = field732 + Statics.field1922;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field727 == 4) {
                        int var29 = field739 + 180 - 80;
                        short var30 = 321;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            Statics.field12.trim();
                            if (Statics.field12.length() != 6) {
                                method2807(class157.field2451, class157.field2484, class157.field2571);
                                return;
                            }
                            Statics.field1959 = Integer.parseInt(Statics.field12);
                            Statics.field12 = "";
                            field744 = field734 ? class159.field2596 : class159.field2589;
                            method2807(class157.field2533, class157.field2346, class157.field2535);
                            client.method633(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field739 + 180 - 9 && var14 <= field739 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field734 = !field734;
                        }
                        if (var13 == 1 && var14 >= field739 + 180 - 34 && var14 <= field739 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class138.method49(client.method2953("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var31 = field739 + 180 + 80;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field727 = 0;
                            field731 = "";
                            field732 = "";
                            Statics.field1959 = 0;
                            Statics.field12 = "";
                        }
                        while (class137.method712()) {
                            boolean var32 = false;
                            for (int var33 = 0; var33 < field737.length(); var33++) {
                                if (Statics.field1922 == field737.charAt(var33)) {
                                    var32 = true;
                                    break;
                                }
                            }
                            if (Statics.field2025 == 13) {
                                field727 = 0;
                                field731 = "";
                                field732 = "";
                                Statics.field1959 = 0;
                                Statics.field12 = "";
                            } else {
                                if (Statics.field2025 == 85 && Statics.field12.length() > 0) {
                                    Statics.field12 = Statics.field12.substring(0, Statics.field12.length() - 1);
                                }
                                if (Statics.field2025 == 84) {
                                    Statics.field12.trim();
                                    if (Statics.field12.length() != 6) {
                                        method2807(class157.field2451, class157.field2484, class157.field2571);
                                        return;
                                    }
                                    Statics.field1959 = Integer.parseInt(Statics.field12);
                                    Statics.field12 = "";
                                    field744 = field734 ? class159.field2596 : class159.field2589;
                                    method2807(class157.field2533, class157.field2346, class157.field2535);
                                    client.method633(20);
                                    return;
                                }
                                if (var32 && Statics.field12.length() < 6) {
                                    Statics.field12 = Statics.field12 + Statics.field1922;
                                }
                            }
                        }
                    } else if (field727 == 5) {
                        int var34 = field739 + 180 - 80;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method877();
                            return;
                        }
                        int var36 = field739 + 180 + 80;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field728 = class157.field2518;
                            field729 = class157.field2519;
                            field721 = class157.field2520;
                            field727 = 2;
                            field735 = 0;
                            field732 = "";
                        }
                        while (class137.method712()) {
                            boolean var37 = false;
                            for (int var38 = 0; var38 < field736.length(); var38++) {
                                if (Statics.field1922 == field736.charAt(var38)) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (Statics.field2025 == 13) {
                                field728 = class157.field2518;
                                field729 = class157.field2519;
                                field721 = class157.field2520;
                                field727 = 2;
                                field735 = 0;
                                field732 = "";
                            } else {
                                if (Statics.field2025 == 85 && field731.length() > 0) {
                                    field731 = field731.substring(0, field731.length() - 1);
                                }
                                if (Statics.field2025 == 84) {
                                    method877();
                                    return;
                                }
                                if (var37 && field731.length() < 320) {
                                    field731 = field731 + Statics.field1922;
                                }
                            }
                        }
                    } else if (field727 == 6) {
                        while (true) {
                            do {
                                if (!class137.method712()) {
                                    short var39 = 321;
                                    if (var13 == 1 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                                        field728 = class157.field2518;
                                        field729 = class157.field2519;
                                        field721 = class157.field2520;
                                        field727 = 2;
                                        field735 = 0;
                                        field732 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2025 != 84 && Statics.field2025 != 13);
                            field728 = class157.field2518;
                            field729 = class157.field2519;
                            field721 = class157.field2520;
                            field727 = 2;
                            field735 = 0;
                            field732 = "";
                        }
                    }
                }
            }
        } else if (class140.field2150 == 1 || !Statics.field977 && class140.field2150 == 4) {
            int var1 = field711 + 280;
            if (class140.field2151 >= var1 && class140.field2151 <= var1 + 14 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                class26.method2216(0, 0);
            } else if (class140.field2151 >= var1 + 15 && class140.field2151 <= var1 + 80 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                class26.method2216(0, 1);
            } else {
                int var2 = field711 + 390;
                if (class140.field2151 >= var2 && class140.field2151 <= var2 + 14 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                    class26.method2216(1, 0);
                } else if (class140.field2151 >= var2 + 15 && class140.field2151 <= var2 + 80 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                    class26.method2216(1, 1);
                } else {
                    int var3 = field711 + 500;
                    if (class140.field2151 >= var3 && class140.field2151 <= var3 + 14 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                        class26.method2216(2, 0);
                    } else if (class140.field2151 >= var3 + 15 && class140.field2151 <= var3 + 80 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                        class26.method2216(2, 1);
                    } else {
                        int var4 = field711 + 610;
                        if (class140.field2151 >= var4 && class140.field2151 <= var4 + 14 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                            class26.method2216(3, 0);
                        } else if (class140.field2151 >= var4 + 15 && class140.field2151 <= var4 + 80 && class140.field2154 >= 4 && class140.field2154 <= 18) {
                            class26.method2216(3, 1);
                        } else if (class140.field2151 >= field711 + 708 && class140.field2154 >= 4 && class140.field2151 <= field711 + 708 + 50 && class140.field2154 <= 20) {
                            field738 = false;
                            Statics.field1949.method1565(field711, 0);
                            Statics.field712.method1565(field711 + 382, 0);
                            Statics.field713.method1714(field711 + 382 - Statics.field713.field1411 / 2, 18);
                        } else if (field741 != -1) {
                            class26 var5 = Statics.field638[field741];
                            method117(var5);
                            field738 = false;
                            Statics.field1949.method1565(field711, 0);
                            Statics.field712.method1565(field711 + 382, 0);
                            Statics.field713.method1714(field711 + 382 - Statics.field713.field1411 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.b(B)V")
    public static void method877() {
        field731 = field731.trim();
        if (field731.length() == 0) {
            method2807(class157.field2446, class157.field2550, class157.field2551);
            return;
        }
        long var0 = class10.method2939();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field731;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2322(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2327(var4.nextInt());
            }
            var5.method2327(var7[0]);
            var5.method2327(var7[1]);
            var5.method2367(var0);
            var5.method2367(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2327(var4.nextInt());
            }
            var5.method2498(class10.field147, class10.field153);
            var6.method2322(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2327(var4.nextInt());
            }
            var6.method2367(var4.nextLong());
            var6.method2406(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class149.field2237.method3887(0L);
                class149.field2237.method3908(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var30) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2331(var11, 0, 24);
            var6.method2367(var4.nextLong());
            var6.method2498(class10.field147, class10.field153);
            int var15 = Statics.method2215(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class119 var16 = new class119(var15);
            var16.method2328(var3);
            var16.field1974 = var15;
            var16.method2443(var7);
            class119 var17 = new class119(var16.field1974 + var6.field1974 + var5.field1974 + 5);
            var17.method2322(2);
            var17.method2322(var5.field1974);
            var17.method2331(var5.field1977, 0, var5.field1974);
            var17.method2322(var6.field1974);
            var17.method2331(var6.field1977, 0, var6.field1974);
            var17.method2481(var16.field1974);
            var17.method2331(var16.field1977, 0, var16.field1974);
            String var18 = class161.method747(var17.field1977);
            byte var25;
            try {
                URL var19 = new URL(client.method2953("services", false) + "m=accountappeal/login.ws");
                URLConnection var20 = var19.openConnection();
                var20.setDoInput(true);
                var20.setDoOutput(true);
                var20.setConnectTimeout(5000);
                OutputStreamWriter var21 = new OutputStreamWriter(var20.getOutputStream());
                var21.write("data2=" + class226.method3703(var18) + "&dest=" + class226.method3703("passwordchoice.ws"));
                var21.flush();
                InputStream var22 = var20.getInputStream();
                class119 var23 = new class119(new byte[1000]);
                while (true) {
                    int var24 = var22.read(var23.field1977, var23.field1974, 1000 - var23.field1974);
                    if (var24 == -1) {
                        var21.close();
                        var22.close();
                        String var26 = new String(var23.field1977);
                        if (var26.startsWith("OFFLINE")) {
                            var25 = 4;
                        } else if (var26.startsWith("WRONG")) {
                            var25 = 7;
                        } else if (var26.startsWith("RELOAD")) {
                            var25 = 3;
                        } else if (var26.startsWith("Not permitted for social network accounts.")) {
                            var25 = 6;
                        } else {
                            var23.method2354(var7);
                            while (var23.field1974 > 0 && var23.field1977[var23.field1974 - 1] == 0) {
                                var23.field1974--;
                            }
                            String var27 = new String(var23.field1977, 0, var23.field1974);
                            if (class10.method2114(var27)) {
                                class138.method49(var27, true, false);
                                var25 = 2;
                            } else {
                                var25 = 5;
                            }
                        }
                        break;
                    }
                    var23.field1974 += var24;
                    if (var23.field1974 >= 1000) {
                        var25 = 5;
                        break;
                    }
                }
            } catch (Throwable var29) {
                var29.printStackTrace();
                var25 = 5;
            }
            var2 = var25;
        }
        switch(var2) {
            case 2:
                method2807(class157.field2345, class157.field2307, class157.field2554);
                field727 = 6;
                break;
            case 3:
                method2807(class157.field2547, class157.field2556, class157.field2565);
                break;
            case 4:
                method2807(class157.field2558, class157.field2373, class157.field2560);
                break;
            case 5:
                method2807(class157.field2561, class157.field2419, class157.field2563);
                break;
            case 6:
                method2807(class157.field2524, class157.field2395, class157.field2566);
                break;
            case 7:
                method2807(class157.field2567, class157.field2568, class157.field2569);
        }
    }

    @ObfuscatedName("d.p(Lhp;Lhp;Lhp;ZB)V")
    public static void method129(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field711 = (Statics.field1146 - client.field402) / 2;
            field739 = field711 + 202;
        }
        if (field738) {
            method180(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1949.method1565(field711, 0);
            Statics.field712.method1565(field711 + 382, 0);
            Statics.field713.method1714(field711 + 382 - Statics.field713.field1411 / 2, 18);
        }
        if (client.field546 == 0 || client.field546 == 5) {
            byte var4 = 20;
            arg0.method3788(class157.field2452, field739 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1656(field739 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1656(field739 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1697(field739 + 180 - 150, var5 + 2, field725 * 3, 30, 9179409);
            class80.method1697(field725 * 3 + (field739 + 180 - 150), var5 + 2, 300 - field725 * 3, 30, 0);
            arg0.method3788(field743, field739 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field546 == 20) {
            Statics.field129.method1714(field739 + 180 - Statics.field129.field1411 / 2, 271 - Statics.field129.field1412 / 2);
            short var6 = 211;
            arg0.method3788(field728, field739 + 180, var6, 16776960, 0);
            int var86 = var6 + 15;
            arg0.method3788(field729, field739 + 180, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method3788(field721, field739 + 180, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 10;
            if (field727 != 4) {
                arg0.method3785(class157.field2488, field739 + 180 - 110, var89, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field731; arg0.method3842(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3785(class223.method3770(var8), field739 + 180 - 70, var89, 16777215, 0);
                var86 = var89 + 15;
                String var10 = class157.field2562;
                String var11 = field732;
                String var12 = Statics.method727('*', var11.length());
                arg0.method3785(var10 + var12, field739 + 180 - 108, var86, 16777215, 0);
                var86 += 15;
            }
        }
        if (client.field546 == 10 || client.field546 == 11) {
            Statics.field129.method1714(field739, 171);
            if (field727 == 0) {
                short var13 = 251;
                arg0.method3788(class157.field2340, field739 + 180, var13, 16776960, 0);
                int var90 = var13 + 30;
                int var14 = field739 + 180 - 80;
                short var15 = 291;
                Statics.field215.method1714(var14 - 73, var15 - 20);
                arg0.method3774(class157.field2540, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field739 + 180 + 80;
                Statics.field215.method1714(var16 - 73, var15 - 20);
                arg0.method3774(class157.field2471, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field727 == 1) {
                arg0.method3788(class157.field2445, field739 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3788(field728, field739 + 180, var17, 16777215, 0);
                int var91 = var17 + 15;
                arg0.method3788(field729, field739 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3788(field721, field739 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                int var18 = field739 + 180 - 80;
                short var19 = 321;
                Statics.field215.method1714(var18 - 73, var19 - 20);
                arg0.method3788(class157.field2312, var18, var19 + 5, 16777215, 0);
                int var20 = field739 + 180 + 80;
                Statics.field215.method1714(var20 - 73, var19 - 20);
                arg0.method3788(class157.field2543, var20, var19 + 5, 16777215, 0);
            } else if (field727 == 2) {
                short var21 = 211;
                arg0.method3788(field728, field739 + 180, var21, 16776960, 0);
                int var94 = var21 + 15;
                arg0.method3788(field729, field739 + 180, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method3788(field721, field739 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method3785(class157.field2488, field739 + 180 - 110, var97, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field731; arg0.method3842(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3785(class223.method3770(var23) + (field735 == 0 & client.field288 % 40 < 20 ? Statics.method2947(16776960) + class2.field22 : ""), field739 + 180 - 70, var97, 16777215, 0);
                var94 = var97 + 15;
                String var25 = class157.field2562;
                String var26 = field732;
                String var27 = Statics.method727('*', var26.length());
                arg0.method3785(var25 + var27 + (field735 == 1 & client.field288 % 40 < 20 ? Statics.method2947(16776960) + class2.field22 : ""), field739 + 180 - 108, var94, 16777215, 0);
                var94 += 15;
                int var28 = field739 + 180 - 80;
                short var29 = 321;
                Statics.field215.method1714(var28 - 73, var29 - 20);
                arg0.method3788(class157.field2542, var28, var29 + 5, 16777215, 0);
                int var30 = field739 + 180 + 80;
                Statics.field215.method1714(var30 - 73, var29 - 20);
                arg0.method3788(class157.field2543, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3788(class157.field2381, field739 + 180, var31, 16776960, 0);
            } else if (field727 == 4) {
                arg0.method3788(class157.field2531, field739 + 180, 211, 16776960, 0);
                short var32 = 236;
                arg0.method3788(field728, field739 + 180, var32, 16777215, 0);
                int var98 = var32 + 15;
                arg0.method3788(field729, field739 + 180, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3788(field721, field739 + 180, var99, 16777215, 0);
                int var100 = var99 + 15;
                String var34 = class157.field2538;
                String var35 = Statics.field12;
                String var36 = Statics.method727('*', var35.length());
                arg0.method3785(var34 + var36 + (client.field288 % 40 < 20 ? Statics.method2947(16776960) + class2.field22 : ""), field739 + 180 - 108, var100, 16777215, 0);
                int var101 = var100 - 8;
                arg0.method3785(class157.field2508, field739 + 180 - 9, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3785(class157.field2315, field739 + 180 - 9, var102, 16776960, 0);
                int var37 = field739 + 180 - 9 + arg0.method3842(class157.field2315) + 15;
                int var38 = var102 - arg0.field3170;
                class81 var39;
                if (field734) {
                    var39 = Statics.field191;
                } else {
                    var39 = Statics.field662;
                }
                var39.method1714(var37, var38);
                var98 = var102 + 15;
                int var40 = field739 + 180 - 80;
                short var41 = 321;
                Statics.field215.method1714(var40 - 73, var41 - 20);
                arg0.method3788(class157.field2312, var40, var41 + 5, 16777215, 0);
                int var42 = field739 + 180 + 80;
                Statics.field215.method1714(var42 - 73, var41 - 20);
                arg0.method3788(class157.field2543, var42, var41 + 5, 16777215, 0);
                arg1.method3788(class157.field2532, field739 + 180, var41 + 36, 255, 0);
            } else if (field727 == 5) {
                arg0.method3788(class157.field2545, field739 + 180, 201, 16776960, 0);
                short var43 = 221;
                arg2.method3788(field728, field739 + 180, var43, 16776960, 0);
                int var103 = var43 + 15;
                arg2.method3788(field729, field739 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg2.method3788(field721, field739 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var106 = var105 + 14;
                arg0.method3785(class157.field2546, field739 + 180 - 145, var106, 16777215, 0);
                short var44 = 174;
                String var45;
                for (var45 = field731; arg0.method3842(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method3785(class223.method3770(var45) + (client.field288 % 40 < 20 ? Statics.method2947(16776960) + class2.field22 : ""), field739 + 180 - 34, var106, 16777215, 0);
                var103 = var106 + 15;
                int var46 = field739 + 180 - 80;
                short var47 = 321;
                Statics.field215.method1714(var46 - 73, var47 - 20);
                arg0.method3788(class157.field2537, var46, var47 + 5, 16777215, 0);
                int var48 = field739 + 180 + 80;
                Statics.field215.method1714(var48 - 73, var47 - 20);
                arg0.method3788(class157.field2548, var48, var47 + 5, 16777215, 0);
            } else if (field727 == 6) {
                short var49 = 211;
                arg0.method3788(field728, field739 + 180, var49, 16776960, 0);
                int var107 = var49 + 15;
                arg0.method3788(field729, field739 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg0.method3788(field721, field739 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var50 = field739 + 180;
                short var51 = 321;
                Statics.field215.method1714(var50 - 73, var51 - 20);
                arg0.method3788(class157.field2548, var50, var51 + 5, 16777215, 0);
            }
        }
        if (field723 > 0) {
            method699(field723);
            field723 = 0;
        }
        short var52 = 256;
        if (field730 > 0) {
            for (int var53 = 0; var53 < 256; var53++) {
                if (field730 > 768) {
                    Statics.field2031[var53] = method3753(Statics.field2933[var53], Statics.field1610[var53], 1024 - field730);
                } else if (field730 > 256) {
                    Statics.field2031[var53] = Statics.field1610[var53];
                } else {
                    Statics.field2031[var53] = method3753(Statics.field1610[var53], Statics.field2933[var53], 256 - field730);
                }
            }
        } else if (field720 > 0) {
            for (int var54 = 0; var54 < 256; var54++) {
                if (field720 > 768) {
                    Statics.field2031[var54] = method3753(Statics.field2933[var54], Statics.field204[var54], 1024 - field720);
                } else if (field720 > 256) {
                    Statics.field2031[var54] = Statics.field204[var54];
                } else {
                    Statics.field2031[var54] = method3753(Statics.field204[var54], Statics.field2933[var54], 256 - field720);
                }
            }
        } else {
            for (int var55 = 0; var55 < 256; var55++) {
                Statics.field2031[var55] = Statics.field2933[var55];
            }
        }
        class80.method1645(field711, 9, field711 + 128, var52 + 7);
        Statics.field1949.method1565(field711, 0);
        class80.method1647();
        int var56 = 0;
        int var57 = field711 + Statics.field2138.field1384 * 9;
        for (int var58 = 1; var58 < var52 - 1; var58++) {
            int var59 = (var52 - var58) * field733[var58] / var52;
            int var60 = var59 + 22;
            if (var60 < 0) {
                var60 = 0;
            }
            var56 += var60;
            for (int var61 = var60; var61 < 128; var61++) {
                int var62 = Statics.field2633[var56++];
                if (var62 == 0) {
                    var57++;
                } else {
                    int var64 = 256 - var62;
                    int var65 = Statics.field2031[var62];
                    int var66 = Statics.field2138.field1385[var57];
                    Statics.field2138.field1385[var57++] = ((var65 & 0xFF00FF) * var62 + (var66 & 0xFF00FF) * var64 & 0xFF00FF00) + ((var65 & 0xFF00) * var62 + (var66 & 0xFF00) * var64 & 0xFF0000) >> 8;
                }
            }
            var57 += Statics.field2138.field1384 + var60 - 128;
        }
        class80.method1645(field711 + 765 - 128, 9, field711 + 765, var52 + 7);
        Statics.field712.method1565(field711 + 382, 0);
        class80.method1647();
        int var67 = 0;
        int var68 = field711 + Statics.field2138.field1384 * 9 + 24 + 637;
        for (int var69 = 1; var69 < var52 - 1; var69++) {
            int var70 = (var52 - var69) * field733[var69] / var52;
            int var71 = 103 - var70;
            int var72 = var68 + var70;
            for (int var73 = 0; var73 < var71; var73++) {
                int var74 = Statics.field2633[var67++];
                if (var74 == 0) {
                    var72++;
                } else {
                    int var76 = 256 - var74;
                    int var77 = Statics.field2031[var74];
                    int var78 = Statics.field2138.field1385[var72];
                    Statics.field2138.field1385[var72++] = ((var77 & 0xFF00) * var74 + (var78 & 0xFF00) * var76 & 0xFF0000) + ((var77 & 0xFF00FF) * var74 + (var78 & 0xFF00FF) * var76 & 0xFF00FF00) >> 8;
                }
            }
            var67 += 128 - var71;
            var68 = Statics.field2138.field1384 - var71 - var70 + var72;
        }
        Statics.field714[Statics.field2908.field134 ? 1 : 0].method1714(field711 + 765 - 40, 463);
        if (client.field546 > 5 && client.field284 == 0) {
            if (Statics.field235 == null) {
                Statics.field235 = class77.method2985(Statics.field1147, "sl_button", "");
            } else {
                int var79 = field711 + 5;
                short var80 = 463;
                byte var81 = 100;
                byte var82 = 35;
                Statics.field235.method1714(var79, var80);
                arg0.method3788(class157.field2472 + " " + client.field543, var81 / 2 + var79, var82 / 2 + var80 - 2, 16777215, 0);
                if (Statics.field3154 == null) {
                    arg1.method3788(class157.field2427, var81 / 2 + var79, var82 / 2 + var80 + 12, 16777215, 0);
                } else {
                    arg1.method3788(class157.field2579, var81 / 2 + var79, var82 / 2 + var80 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var83 = Statics.field60.getGraphics();
            Statics.field2138.method1479(var83, 0, 0);
        } catch (Exception var85) {
            Statics.field60.repaint();
        }
    }

    @ObfuscatedName("em.s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2807(String arg0, String arg1, String arg2) {
        field728 = arg0;
        field729 = arg1;
        field721 = arg2;
    }

    @ObfuscatedName("cd.y(Lce;B)V")
    public static final void method2038(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1016.length; var2++) {
            Statics.field1016[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1016[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1343[var8] = (Statics.field1016[var8 - 1] + Statics.field1016[var8 + 1] + Statics.field1016[var8 - 128] + Statics.field1016[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1016;
            Statics.field1016 = Statics.field1343;
            Statics.field1343 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1412; var11++) {
            for (int var12 = 0; var12 < arg0.field1411; var12++) {
                if (arg0.field1414[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1410;
                    int var14 = var11 + 16 + arg0.field1409;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1016[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("an.t(IB)V")
    public static final void method699(int arg0) {
        short var1 = 256;
        field717 += arg0 * 128;
        if (field717 > Statics.field1016.length) {
            field717 -= Statics.field1016.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2038(Statics.field2033[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2633[var3 + var4] - Statics.field1016[field717 + var3 & Statics.field1016.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2633[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2633[var9 + var10] = 255;
                } else {
                    Statics.field2633[var9 + var10] = 0;
                }
            }
        }
        if (field730 > 0) {
            field730 -= arg0 * 4;
        }
        if (field720 > 0) {
            field720 -= arg0 * 4;
        }
        if (field730 == 0 && field720 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field730 = 1024;
            }
            if (var12 == 1) {
                field720 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field733[var13] = field733[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field733[var14] = (int) (Math.sin((double) field724 / 14.0D) * 16.0D + Math.sin((double) field724 / 15.0D) * 14.0D + Math.sin((double) field724 / 16.0D) * 12.0D);
            field724++;
        }
        field722 += arg0 * -276688455;
        int var15 = ((client.field288 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field722 * -1217903228; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2633[(var18 << 7) + var17] = 192;
        }
        field722 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2633[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2633[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1736[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1736[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1736[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2633[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("hu.w(IIII)I")
    public static final int method3753(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("v.h(Lhp;Lhp;I)V")
    public static void method180(class224 arg0, class224 arg1) {
        if (Statics.field791 == null) {
            Statics.field791 = class77.method350(Statics.field1147, "sl_back", "");
        }
        if (Statics.field1347 == null) {
            Statics.field1347 = class77.method604(Statics.field1147, "sl_flags", "");
        }
        if (Statics.field1993 == null) {
            Statics.field1993 = class77.method604(Statics.field1147, "sl_arrows", "");
        }
        if (Statics.field1986 == null) {
            Statics.field1986 = class77.method604(Statics.field1147, "sl_stars", "");
        }
        class80.method1697(field711, 23, 765, 480, 0);
        class80.method1655(field711, 0, 125, 23, 12425273, 9135624);
        class80.method1655(field711 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3788(class157.field2570, field711 + 62, 15, 0, -1);
        if (Statics.field1986 != null) {
            Statics.field1986[1].method1714(field711 + 140, 1);
            arg1.method3785(class157.field2330, field711 + 152, 10, 16777215, -1);
            Statics.field1986[0].method1714(field711 + 140, 12);
            arg1.method3785(class157.field2572, field711 + 152, 21, 16777215, -1);
        }
        if (Statics.field1993 != null) {
            int var2 = field711 + 280;
            if (class26.field639[0] == 0 && class26.field632[0] == 0) {
                Statics.field1993[2].method1714(var2, 4);
            } else {
                Statics.field1993[0].method1714(var2, 4);
            }
            if (class26.field639[0] == 0 && class26.field632[0] == 1) {
                Statics.field1993[3].method1714(var2 + 15, 4);
            } else {
                Statics.field1993[1].method1714(var2 + 15, 4);
            }
            arg0.method3785(class157.field2526, var2 + 32, 17, 16777215, -1);
            int var3 = field711 + 390;
            if (class26.field639[0] == 1 && class26.field632[0] == 0) {
                Statics.field1993[2].method1714(var3, 4);
            } else {
                Statics.field1993[0].method1714(var3, 4);
            }
            if (class26.field639[0] == 1 && class26.field632[0] == 1) {
                Statics.field1993[3].method1714(var3 + 15, 4);
            } else {
                Statics.field1993[1].method1714(var3 + 15, 4);
            }
            arg0.method3785(class157.field2574, var3 + 32, 17, 16777215, -1);
            int var4 = field711 + 500;
            if (class26.field639[0] == 2 && class26.field632[0] == 0) {
                Statics.field1993[2].method1714(var4, 4);
            } else {
                Statics.field1993[0].method1714(var4, 4);
            }
            if (class26.field639[0] == 2 && class26.field632[0] == 1) {
                Statics.field1993[3].method1714(var4 + 15, 4);
            } else {
                Statics.field1993[1].method1714(var4 + 15, 4);
            }
            arg0.method3785(class157.field2575, var4 + 32, 17, 16777215, -1);
            int var5 = field711 + 610;
            if (class26.field639[0] == 3 && class26.field632[0] == 0) {
                Statics.field1993[2].method1714(var5, 4);
            } else {
                Statics.field1993[0].method1714(var5, 4);
            }
            if (class26.field639[0] == 3 && class26.field632[0] == 1) {
                Statics.field1993[3].method1714(var5 + 15, 4);
            } else {
                Statics.field1993[1].method1714(var5 + 15, 4);
            }
            arg0.method3785(class157.field2576, var5 + 32, 17, 16777215, -1);
        }
        class80.method1697(field711 + 708, 4, 50, 16, 0);
        arg1.method3788(class157.field2543, field711 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field435 & var7;
        for (int var9 = 0; var9 < class26.field648; var9++) {
            class26 var10 = Statics.field638[var9];
            if ((var10.field641 & var7) == var8 || (var10.field641 & var7) == 0) {
                var6++;
            }
        }
        field741 = -1;
        if (Statics.field791 != null) {
            byte var11 = 88;
            byte var12 = 19;
            int var13 = 765 / (var11 + 1);
            int var14 = 480 / (var12 + 1);
            int var15;
            int var16;
            do {
                var15 = var14;
                var16 = var13;
                if ((var13 - 1) * var14 >= var6) {
                    var13--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
            } while (var14 != var15 || var13 != var16);
            int var17 = (765 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (480 - var12 * var14) / (var14 + 1);
            if (var18 > 5) {
                var18 = 5;
            }
            int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
            int var21 = var20 + 23;
            int var22 = field711 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class26.field648; var25++) {
                class26 var26 = Statics.field638[var25];
                if ((var26.field641 & var7) == var8 || (var26.field641 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field642);
                    if (var26.field642 == -1) {
                        var28 = class157.field2577;
                        var27 = false;
                    } else if (var26.field642 > 1980) {
                        var28 = class157.field2578;
                        var27 = false;
                    }
                    int var29 = 0;
                    byte var30;
                    if (var26.method609()) {
                        var29 = 16711680;
                        if (var26.method606()) {
                            var30 = 5;
                        } else {
                            var30 = 4;
                        }
                    } else if (var26.method635()) {
                        if (var26.method606()) {
                            var30 = 3;
                        } else {
                            var30 = 2;
                        }
                    } else if (var26.method606()) {
                        var30 = 1;
                    } else {
                        var30 = 0;
                    }
                    if (class140.field2144 >= var22 && class140.field2145 >= var21 && class140.field2144 < var11 + var22 && class140.field2145 < var12 + var21 && var27) {
                        field741 = var25;
                        Statics.field791[var30].method1571(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        Statics.field791[var30].method1565(var22, var21);
                    }
                    if (Statics.field1347 != null) {
                        Statics.field1347[(var26.method606() ? 8 : 0) + var26.field645].method1714(var22 + 29, var21);
                    }
                    arg0.method3788(Integer.toString(var26.field653), var22 + 15, var12 / 2 + var21 + 5, var29, -1);
                    arg1.method3788(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
                    var21 += var12 + var18;
                    var23++;
                    if (var23 >= var14) {
                        var21 = var20 + 23;
                        var22 += var11 + var17;
                        var23 = 0;
                    }
                }
            }
            if (var24) {
                int var31 = arg1.method3842(Statics.field638[field741].field644) + 6;
                int var32 = arg1.field3170 + 8;
                class80.method1697(class140.field2144 - var31 / 2, class140.field2145 + 20 + 5, var31, var32, 16777120);
                class80.method1656(class140.field2144 - var31 / 2, class140.field2145 + 20 + 5, var31, var32, 0);
                arg1.method3788(Statics.field638[field741].field644, class140.field2144, class140.field2145 + 20 + 5 + arg1.field3170 + 4, 0, -1);
            }
        }
        try {
            Graphics var33 = Statics.field60.getGraphics();
            Statics.field2138.method1479(var33, 0, 0);
        } catch (Exception var35) {
            Statics.field60.repaint();
        }
    }

    @ObfuscatedName("w.d(Lx;I)V")
    public static void method117(class26 arg0) {
        if (arg0.method606() != client.field282) {
            client.field282 = arg0.method606();
            class52.method673(arg0.method606());
        }
        Statics.field902 = arg0.field636;
        client.field543 = arg0.field653;
        client.field435 = arg0.field641;
        Statics.field1667 = client.field280 == 0 ? 43594 : arg0.field653 + 40000;
        Statics.field119 = client.field280 == 0 ? 443 : arg0.field653 + 50000;
        Statics.field122 = Statics.field1667;
    }
}
