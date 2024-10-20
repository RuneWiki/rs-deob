package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ag")
public class class32 {

    @ObfuscatedName("ag.h")
    public static int field687 = 0;

    @ObfuscatedName("ag.u")
    public static int field694 = field687 + 202;

    @ObfuscatedName("ag.a")
    public static int[] field717 = new int[256];

    @ObfuscatedName("ag.v")
    public static int field696 = 0;

    @ObfuscatedName("ag.s")
    public static int field712 = 0;

    @ObfuscatedName("ag.ay")
    public static int field698 = 0;

    @ObfuscatedName("ag.ad")
    public static int field699 = 0;

    @ObfuscatedName("ag.as")
    public static int field686 = 0;

    @ObfuscatedName("ag.ag")
    public static int field688 = 0;

    @ObfuscatedName("ag.au")
    public static int field702 = 10;

    @ObfuscatedName("ag.ar")
    public static String field703 = "";

    @ObfuscatedName("ag.az")
    public static int field704 = 0;

    @ObfuscatedName("ag.aw")
    public static String field705 = "";

    @ObfuscatedName("ag.at")
    public static String field706 = "";

    @ObfuscatedName("ag.ap")
    public static String field707 = "";

    @ObfuscatedName("ag.al")
    public static String field708 = "";

    @ObfuscatedName("ag.aq")
    public static String field709 = "";

    @ObfuscatedName("ag.aa")
    public static class159 field710 = class159.field2589;

    @ObfuscatedName("ag.av")
    public static boolean field692 = true;

    @ObfuscatedName("ag.af")
    public static int field720 = 0;

    @ObfuscatedName("ag.ai")
    public static String field714 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ag.ak")
    public static String field715 = "1234567890";

    @ObfuscatedName("ag.aj")
    public static boolean field716 = false;

    @ObfuscatedName("ag.bm")
    public static int field713 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.h(Ljava/awt/Component;Lfo;Lfo;ZII)V")
    public static void method889(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field697) {
            field704 = arg4;
            class80.method1706();
            byte[] var5 = arg1.method3066("title.jpg", "");
            Statics.field691 = new class79(var5, arg0);
            Statics.field2582 = Statics.field691.method1567();
            if ((client.field406 & 0x20000000) == 0) {
                Statics.field1926 = class77.method2825(arg2, "logo", "");
            } else {
                Statics.field1926 = class77.method2825(arg2, "logo_deadman_mode", "");
            }
            Statics.field718 = class77.method2825(arg2, "titlebox", "");
            Statics.field689 = class77.method2825(arg2, "titlebutton", "");
            Statics.field690 = class77.method118(arg2, "runes", "");
            Statics.field3158 = class77.method118(arg2, "title_mute", "");
            Statics.field261 = class77.method2825(arg2, "options_radio_buttons,0", "");
            Statics.field701 = class77.method2825(arg2, "options_radio_buttons,2", "");
            Statics.field2623 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2623[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2623[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2623[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2623[var9 + 192] = 16777215;
            }
            Statics.field618 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field618[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field618[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field618[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field618[var13 + 192] = 16777215;
            }
            Statics.field157 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field157[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field157[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field157[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field157[var17 + 192] = 16777215;
            }
            Statics.field260 = new int[256];
            Statics.field1078 = new int[32768];
            Statics.field986 = new int[32768];
            method2048((class81) null);
            Statics.field1631 = new int[32768];
            Statics.field279 = new int[32768];
            if (arg3) {
                field708 = "";
                field709 = "";
            }
            Statics.field3200 = 0;
            Statics.field711 = "";
            field692 = true;
            field716 = false;
            if (Statics.field1639.field128) {
                class183.field2943 = 1;
                Statics.field2941 = null;
                Statics.field2945 = -1;
                Statics.field158 = -1;
                Statics.field2946 = 0;
                Statics.field2944 = false;
                Statics.field722 = 2;
            } else {
                class183.method2275(2, Statics.field216, "scape main", "", 255, false);
            }
            class171.method666(false);
            Statics.field697 = true;
            field687 = (Statics.field2038 - client.field408 * 765) / 2;
            field694 = field687 + 202;
            Statics.field691.method1577(field687, 0);
            Statics.field2582.method1577(field687 + 382, 0);
            Statics.field1926.method1727(field687 + 382 - Statics.field1926.field1391 / 2, 18);
        } else if (arg4 == 4) {
            field704 = 4;
        }
    }

    @ObfuscatedName("s.o(B)V")
    public static void method554() {
        if (!Statics.field697) {
            return;
        }
        Statics.field718 = null;
        Statics.field689 = null;
        Statics.field690 = null;
        Statics.field691 = null;
        Statics.field2582 = null;
        Statics.field1926 = null;
        Statics.field3158 = null;
        Statics.field261 = null;
        Statics.field701 = null;
        Statics.field1041 = null;
        Statics.field2234 = null;
        Statics.field165 = null;
        Statics.field13 = null;
        Statics.field1416 = null;
        Statics.field2623 = null;
        Statics.field618 = null;
        Statics.field157 = null;
        Statics.field260 = null;
        Statics.field1078 = null;
        Statics.field986 = null;
        Statics.field1631 = null;
        Statics.field279 = null;
        class183.field2943 = 1;
        Statics.field2941 = null;
        Statics.field2945 = -1;
        Statics.field158 = -1;
        Statics.field2946 = 0;
        Statics.field2944 = false;
        Statics.field722 = 2;
        class171.method666(true);
        Statics.field697 = false;
    }

    @ObfuscatedName("av.z(Ley;I)V")
    public static void method852(class144 arg0) {
        if (!field716) {
            if ((class140.field2131 == 1 || !Statics.field15 && class140.field2131 == 4) && class140.field2127 >= field687 + 765 - 50 && class140.field2114 >= 453) {
                Statics.field1639.field128 = !Statics.field1639.field128;
                class9.method40();
                if (Statics.field1639.field128) {
                    class183.method3505();
                } else {
                    class183.method599(Statics.field216, "scape main", "", 255, false);
                }
            }
            if (client.field293 != 5) {
                field686++;
                if (client.field293 == 10 || client.field293 == 11) {
                    if (client.field392 == 0) {
                        if (class140.field2131 == 1 || !Statics.field15 && class140.field2131 == 4) {
                            int var6 = field687 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class140.field2127 >= var6 && class140.field2127 <= var6 + var8 && class140.field2114 >= var7 && class140.field2114 <= var7 + var9) {
                                method3383();
                                return;
                            }
                        }
                        if (Statics.field245 != null) {
                            method3383();
                        }
                    }
                    int var10 = class140.field2131;
                    int var11 = class140.field2127;
                    int var12 = class140.field2114;
                    if (!Statics.field15 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field704 == 0) {
                        int var13 = field694 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            Statics.method153(client.method144("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field694 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field406 & 0x4) != 0) {
                                if ((client.field406 & 0x400) == 0) {
                                    field705 = class157.field2364;
                                    field706 = class157.field2507;
                                    field707 = class157.field2508;
                                } else {
                                    field705 = class157.field2512;
                                    field706 = class157.field2513;
                                    field707 = class157.field2464;
                                }
                                field704 = 1;
                                field720 = 0;
                            } else if ((client.field406 & 0x400) == 0) {
                                field705 = class157.field2423;
                                field706 = class157.field2503;
                                field707 = class157.field2504;
                                field704 = 2;
                                field720 = 0;
                            } else {
                                field705 = class157.field2509;
                                field706 = class157.field2510;
                                field707 = class157.field2511;
                                field704 = 1;
                                field720 = 0;
                            }
                        }
                    } else if (field704 == 1) {
                        while (class137.method2049()) {
                            if (Statics.field1937 == 84) {
                                field705 = class157.field2423;
                                field706 = class157.field2503;
                                field707 = class157.field2504;
                                field704 = 2;
                                field720 = 0;
                            } else if (Statics.field1937 == 13) {
                                field704 = 0;
                            }
                        }
                        int var16 = field694 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field705 = class157.field2423;
                            field706 = class157.field2503;
                            field707 = class157.field2504;
                            field704 = 2;
                            field720 = 0;
                        }
                        int var18 = field694 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field704 = 0;
                        }
                    } else if (field704 == 2) {
                        short var19 = 231;
                        int var41 = var19 + 30;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field720 = 0;
                        }
                        var41 += 15;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field720 = 1;
                        }
                        var41 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method2688(class157.field2538, class157.field2522, class157.field2471);
                            field704 = 5;
                            return;
                        }
                        int var21 = field694 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field708 = field708.trim();
                            if (field708.length() == 0) {
                                method2688(class157.field2408, class157.field2334, class157.field2363);
                                return;
                            }
                            if (field709.length() == 0) {
                                method2688(class157.field2413, class157.field2412, class157.field2548);
                                return;
                            }
                            method2688(class157.field2517, class157.field2518, class157.field2519);
                            field710 = Statics.field1639.field126.containsKey(class163.method2252(field708)) ? class159.field2579 : class159.field2589;
                            client.method961(20);
                            return;
                        }
                        int var23 = field694 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field704 = 0;
                            field708 = "";
                            field709 = "";
                            Statics.field3200 = 0;
                            Statics.field711 = "";
                            field692 = true;
                        }
                        while (true) {
                            while (class137.method2049()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field714.length(); var25++) {
                                    if (Statics.field133 == field714.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1937 == 13) {
                                    field704 = 0;
                                    field708 = "";
                                    field709 = "";
                                    Statics.field3200 = 0;
                                    Statics.field711 = "";
                                    field692 = true;
                                } else if (field720 == 0) {
                                    if (Statics.field1937 == 85 && field708.length() > 0) {
                                        field708 = field708.substring(0, field708.length() - 1);
                                    }
                                    if (Statics.field1937 == 84 || Statics.field1937 == 80) {
                                        field720 = 1;
                                    }
                                    if (var24 && field708.length() < 320) {
                                        field708 = field708 + Statics.field133;
                                    }
                                } else if (field720 == 1) {
                                    if (Statics.field1937 == 85 && field709.length() > 0) {
                                        field709 = field709.substring(0, field709.length() - 1);
                                    }
                                    if (Statics.field1937 == 84 || Statics.field1937 == 80) {
                                        field720 = 0;
                                    }
                                    if (Statics.field1937 == 84) {
                                        field708 = field708.trim();
                                        if (field708.length() == 0) {
                                            method2688(class157.field2408, class157.field2334, class157.field2363);
                                            return;
                                        }
                                        if (field709.length() == 0) {
                                            method2688(class157.field2413, class157.field2412, class157.field2548);
                                            return;
                                        }
                                        method2688(class157.field2517, class157.field2518, class157.field2519);
                                        field710 = Statics.field1639.field126.containsKey(class163.method2252(field708)) ? class159.field2579 : class159.field2589;
                                        client.method961(20);
                                        return;
                                    }
                                    if (var24 && field709.length() < 20) {
                                        field709 = field709 + Statics.field133;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field704 == 3) {
                        int var26 = field694 + 180;
                        short var27 = 276;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field705 = class157.field2423;
                            field706 = class157.field2503;
                            field707 = class157.field2504;
                            field704 = 2;
                            field720 = 0;
                        }
                        int var28 = field694 + 180;
                        short var29 = 326;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            method2688(class157.field2538, class157.field2522, class157.field2471);
                            field704 = 5;
                            return;
                        }
                    } else if (field704 == 4) {
                        int var30 = field694 + 180 - 80;
                        short var31 = 321;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            Statics.field711.trim();
                            if (Statics.field711.length() != 6) {
                                method2688(class157.field2469, class157.field2328, class157.field2450);
                                return;
                            }
                            Statics.field3200 = Integer.parseInt(Statics.field711);
                            Statics.field711 = "";
                            field710 = field692 ? class159.field2580 : class159.field2585;
                            method2688(class157.field2517, class157.field2518, class157.field2519);
                            client.method961(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field694 + 180 - 9 && var11 <= field694 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field692 = !field692;
                        }
                        if (var10 == 1 && var11 >= field694 + 180 - 34 && var11 <= field694 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            Statics.method153(client.method144("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var32 = field694 + 180 + 80;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            field704 = 0;
                            field708 = "";
                            field709 = "";
                            Statics.field3200 = 0;
                            Statics.field711 = "";
                        }
                        while (class137.method2049()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field715.length(); var34++) {
                                if (Statics.field133 == field715.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field1937 == 13) {
                                field704 = 0;
                                field708 = "";
                                field709 = "";
                                Statics.field3200 = 0;
                                Statics.field711 = "";
                            } else {
                                if (Statics.field1937 == 85 && Statics.field711.length() > 0) {
                                    Statics.field711 = Statics.field711.substring(0, Statics.field711.length() - 1);
                                }
                                if (Statics.field1937 == 84) {
                                    Statics.field711.trim();
                                    if (Statics.field711.length() != 6) {
                                        method2688(class157.field2469, class157.field2328, class157.field2450);
                                        return;
                                    }
                                    Statics.field3200 = Integer.parseInt(Statics.field711);
                                    Statics.field711 = "";
                                    field710 = field692 ? class159.field2580 : class159.field2585;
                                    method2688(class157.field2517, class157.field2518, class157.field2519);
                                    client.method961(20);
                                    return;
                                }
                                if (var33 && Statics.field711.length() < 6) {
                                    Statics.field711 = Statics.field711 + Statics.field133;
                                }
                            }
                        }
                    } else if (field704 == 5) {
                        int var35 = field694 + 180 - 80;
                        short var36 = 321;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            method2946();
                            return;
                        }
                        int var37 = field694 + 180 + 80;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            field705 = class157.field2423;
                            field706 = class157.field2503;
                            field707 = class157.field2504;
                            field704 = 2;
                            field720 = 0;
                            field709 = "";
                        }
                        while (class137.method2049()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field714.length(); var39++) {
                                if (Statics.field133 == field714.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field1937 == 13) {
                                field705 = class157.field2423;
                                field706 = class157.field2503;
                                field707 = class157.field2504;
                                field704 = 2;
                                field720 = 0;
                                field709 = "";
                            } else {
                                if (Statics.field1937 == 85 && field708.length() > 0) {
                                    field708 = field708.substring(0, field708.length() - 1);
                                }
                                if (Statics.field1937 == 84) {
                                    method2946();
                                    return;
                                }
                                if (var38 && field708.length() < 320) {
                                    field708 = field708 + Statics.field133;
                                }
                            }
                        }
                    } else if (field704 == 6) {
                        while (true) {
                            do {
                                if (!class137.method2049()) {
                                    short var40 = 321;
                                    if (var10 == 1 && var12 >= var40 - 20 && var12 <= var40 + 20) {
                                        field705 = class157.field2423;
                                        field706 = class157.field2503;
                                        field707 = class157.field2504;
                                        field704 = 2;
                                        field720 = 0;
                                        field709 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field1937 != 84 && Statics.field1937 != 13);
                            field705 = class157.field2423;
                            field706 = class157.field2503;
                            field707 = class157.field2504;
                            field704 = 2;
                            field720 = 0;
                            field709 = "";
                        }
                    }
                }
            }
        } else if (class140.field2131 == 1 || !Statics.field15 && class140.field2131 == 4) {
            int var1 = field687 + 280;
            if (class140.field2127 >= var1 && class140.field2127 <= var1 + 14 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                class26.method560(0, 0);
            } else if (class140.field2127 >= var1 + 15 && class140.field2127 <= var1 + 80 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                class26.method560(0, 1);
            } else {
                int var2 = field687 + 390;
                if (class140.field2127 >= var2 && class140.field2127 <= var2 + 14 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                    class26.method560(1, 0);
                } else if (class140.field2127 >= var2 + 15 && class140.field2127 <= var2 + 80 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                    class26.method560(1, 1);
                } else {
                    int var3 = field687 + 500;
                    if (class140.field2127 >= var3 && class140.field2127 <= var3 + 14 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                        class26.method560(2, 0);
                    } else if (class140.field2127 >= var3 + 15 && class140.field2127 <= var3 + 80 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                        class26.method560(2, 1);
                    } else {
                        int var4 = field687 + 610;
                        if (class140.field2127 >= var4 && class140.field2127 <= var4 + 14 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                            class26.method560(3, 0);
                        } else if (class140.field2127 >= var4 + 15 && class140.field2127 <= var4 + 80 && class140.field2114 >= 4 && class140.field2114 <= 18) {
                            class26.method560(3, 1);
                        } else if (class140.field2127 >= field687 + 708 && class140.field2114 >= 4 && class140.field2127 <= field687 + 708 + 50 && class140.field2114 <= 20) {
                            field716 = false;
                            Statics.field691.method1577(field687, 0);
                            Statics.field2582.method1577(field687 + 382, 0);
                            Statics.field1926.method1727(field687 + 382 - Statics.field1926.field1391 / 2, 18);
                        } else if (field713 != -1) {
                            class26 var5 = Statics.field3197[field713];
                            method906(var5);
                            field716 = false;
                            Statics.field691.method1577(field687, 0);
                            Statics.field2582.method1577(field687 + 382, 0);
                            Statics.field1926.method1727(field687 + 382 - Statics.field1926.field1391 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.c(I)V")
    public static void method2946() {
        field708 = field708.trim();
        if (field708.length() == 0) {
            method2688(class157.field2538, class157.field2522, class157.field2471);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method144("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class119 var4 = new class119(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1960, var4.field1949, 1000 - var4.field1949);
                if (var5 == -1) {
                    var4.field1949 = 0;
                    long var8 = var4.method2483();
                    var6 = var8;
                    break;
                }
                var4.field1949 += var5;
                if (var4.field1949 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var40) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field708;
            Random var15 = new Random();
            class119 var16 = new class119(128);
            class119 var17 = new class119(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2315(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2318(var15.nextInt());
            }
            var16.method2318(var18[0]);
            var16.method2318(var18[1]);
            var16.method2313(var6);
            var16.method2313(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2318(var15.nextInt());
            }
            var16.method2492(class10.field140, class10.field141);
            var17.method2315(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2318(var15.nextInt());
            }
            var17.method2313(var15.nextLong());
            var17.method2319(var15.nextLong());
            class149.method2650(var17);
            var17.method2313(var15.nextLong());
            var17.method2492(class10.field140, class10.field141);
            int var22 = class119.method1950(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class119 var23 = new class119(var22);
            var23.method2321(var14);
            var23.field1949 = var22;
            var23.method2345(var18);
            class119 var24 = new class119(var23.field1949 + var17.field1949 + var16.field1949 + 5);
            var24.method2315(2);
            var24.method2315(var16.field1949);
            var24.method2320(var16.field1960, 0, var16.field1949);
            var24.method2315(var17.field1949);
            var24.method2320(var17.field1960, 0, var17.field1949);
            var24.method2316(var23.field1949);
            var24.method2320(var23.field1960, 0, var23.field1949);
            String var25 = class161.method923(var24.field1960);
            byte var32;
            try {
                URL var26 = new URL(client.method144("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class226.method3182(var25) + "&dest=" + class226.method3182("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class119 var30 = new class119(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field1960, var30.field1949, 1000 - var30.field1949);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field1960);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2466(var18);
                            while (var30.field1949 > 0 && var30.field1960[var30.field1949 - 1] == 0) {
                                var30.field1949--;
                            }
                            String var34 = new String(var30.field1960, 0, var30.field1949);
                            boolean var35;
                            if (var34 == null) {
                                var35 = false;
                            } else {
                                label100: {
                                    try {
                                        new URL(var34);
                                    } catch (MalformedURLException var38) {
                                        var35 = false;
                                        break label100;
                                    }
                                    var35 = true;
                                }
                            }
                            if (var35) {
                                Statics.method705(var34, true, "openjs", false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field1949 += var31;
                    if (var30.field1949 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var39) {
                var39.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method2688(class157.field2541, class157.field2542, class157.field2543);
                field704 = 6;
                break;
            case 3:
                method2688(class157.field2544, class157.field2545, class157.field2410);
                break;
            case 4:
                method2688(class157.field2336, class157.field2502, class157.field2549);
                break;
            case 5:
                method2688(class157.field2550, class157.field2551, class157.field2324);
                break;
            case 6:
                method2688(class157.field2553, class157.field2554, class157.field2555);
                break;
            case 7:
                method2688(class157.field2319, class157.field2557, class157.field2558);
        }
    }

    @ObfuscatedName("ar.d(Lhz;Lhz;Lhz;ZI)V")
    public static void method669(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field687 = (Statics.field2038 - client.field408 * 765) / 2;
            field694 = field687 + 202;
        }
        if (field716) {
            if (Statics.field1041 == null) {
                Statics.field1041 = class77.method706(Statics.field1369, "sl_back", "");
            }
            if (Statics.field2234 == null) {
                Statics.field2234 = class77.method118(Statics.field1369, "sl_flags", "");
            }
            if (Statics.field165 == null) {
                Statics.field165 = class77.method118(Statics.field1369, "sl_arrows", "");
            }
            if (Statics.field13 == null) {
                Statics.field13 = class77.method118(Statics.field1369, "sl_stars", "");
            }
            class80.method1699(field687, 23, 765, 480, 0);
            class80.method1714(field687, 0, 125, 23, 12425273, 9135624);
            class80.method1714(field687 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3805(class157.field2559, field687 + 62, 15, 0, -1);
            if (Statics.field13 != null) {
                Statics.field13[1].method1727(field687 + 140, 1);
                arg1.method3786(class157.field2560, field687 + 152, 10, 16777215, -1);
                Statics.field13[0].method1727(field687 + 140, 12);
                arg1.method3786(class157.field2561, field687 + 152, 21, 16777215, -1);
            }
            if (Statics.field165 != null) {
                int var4 = field687 + 280;
                if (class26.field625[0] == 0 && class26.field624[0] == 0) {
                    Statics.field165[2].method1727(var4, 4);
                } else {
                    Statics.field165[0].method1727(var4, 4);
                }
                if (class26.field625[0] == 0 && class26.field624[0] == 1) {
                    Statics.field165[3].method1727(var4 + 15, 4);
                } else {
                    Statics.field165[1].method1727(var4 + 15, 4);
                }
                arg0.method3786(class157.field2562, var4 + 32, 17, 16777215, -1);
                int var5 = field687 + 390;
                if (class26.field625[0] == 1 && class26.field624[0] == 0) {
                    Statics.field165[2].method1727(var5, 4);
                } else {
                    Statics.field165[0].method1727(var5, 4);
                }
                if (class26.field625[0] == 1 && class26.field624[0] == 1) {
                    Statics.field165[3].method1727(var5 + 15, 4);
                } else {
                    Statics.field165[1].method1727(var5 + 15, 4);
                }
                arg0.method3786(class157.field2563, var5 + 32, 17, 16777215, -1);
                int var6 = field687 + 500;
                if (class26.field625[0] == 2 && class26.field624[0] == 0) {
                    Statics.field165[2].method1727(var6, 4);
                } else {
                    Statics.field165[0].method1727(var6, 4);
                }
                if (class26.field625[0] == 2 && class26.field624[0] == 1) {
                    Statics.field165[3].method1727(var6 + 15, 4);
                } else {
                    Statics.field165[1].method1727(var6 + 15, 4);
                }
                arg0.method3786(class157.field2406, var6 + 32, 17, 16777215, -1);
                int var7 = field687 + 610;
                if (class26.field625[0] == 3 && class26.field624[0] == 0) {
                    Statics.field165[2].method1727(var7, 4);
                } else {
                    Statics.field165[0].method1727(var7, 4);
                }
                if (class26.field625[0] == 3 && class26.field624[0] == 1) {
                    Statics.field165[3].method1727(var7 + 15, 4);
                } else {
                    Statics.field165[1].method1727(var7 + 15, 4);
                }
                arg0.method3786(class157.field2565, var7 + 32, 17, 16777215, -1);
            }
            class80.method1699(field687 + 708, 4, 50, 16, 0);
            arg1.method3805(class157.field2527, field687 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field406 & var9;
            for (int var11 = 0; var11 < class26.field622; var11++) {
                class26 var12 = Statics.field3197[var11];
                if ((var12.field627 & var9) == var10 || (var12.field627 & var9) == 0) {
                    var8++;
                }
            }
            field713 = -1;
            if (Statics.field1041 != null) {
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
                int var24 = field687 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field622; var27++) {
                    class26 var28 = Statics.field3197[var27];
                    if ((var28.field627 & var9) == var10 || (var28.field627 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field632);
                        if (var28.field632 == -1) {
                            var30 = class157.field2566;
                            var29 = false;
                        } else if (var28.field632 > 1980) {
                            var30 = class157.field2567;
                            var29 = false;
                        }
                        int var31 = 0;
                        byte var32;
                        if (var28.method566()) {
                            var31 = 16711680;
                            if (var28.method562()) {
                                var32 = 5;
                            } else {
                                var32 = 4;
                            }
                        } else if (var28.method564()) {
                            if (var28.method562()) {
                                var32 = 3;
                            } else {
                                var32 = 2;
                            }
                        } else if (var28.method562()) {
                            var32 = 1;
                        } else {
                            var32 = 0;
                        }
                        if (class140.field2120 >= var24 && class140.field2121 * -566087441 >= var23 && class140.field2120 < var13 + var24 && class140.field2121 * -566087441 < var14 + var23 && var29) {
                            field713 = var27;
                            Statics.field1041[var32].method1583(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field1041[var32].method1577(var24, var23);
                        }
                        if (Statics.field2234 != null) {
                            Statics.field2234[(var28.method562() ? 8 : 0) + var28.field631].method1727(var24 + 29, var23);
                        }
                        arg0.method3805(Integer.toString(var28.field626), var24 + 15, var14 / 2 + var23 + 5, var31, -1);
                        arg1.method3805(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var33 = arg1.method3781(Statics.field3197[field713].field628) + 6;
                    int var34 = arg1.field3175 + 8;
                    class80.method1699(class140.field2120 - var33 / 2, class140.field2121 * -566087441 + 20 + 5, var33, var34, 16777120);
                    class80.method1676(class140.field2120 - var33 / 2, class140.field2121 * -566087441 + 20 + 5, var33, var34, 0);
                    arg1.method3805(Statics.field3197[field713].field628, class140.field2120, class140.field2121 * -566087441 + 20 + 5 + arg1.field3175 + 4, 0, -1);
                }
            }
            try {
                Graphics var35 = Statics.field268.getGraphics();
                Statics.field693.method1525(var35, 0, 0);
            } catch (Exception var111) {
                Statics.field268.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field691.method1577(field687, 0);
            Statics.field2582.method1577(field687 + 382, 0);
            Statics.field1926.method1727(field687 + 382 - Statics.field1926.field1391 / 2, 18);
        }
        if (client.field293 == 0 || client.field293 == 5) {
            byte var37 = 20;
            arg0.method3805(class157.field2501, field694 + 180, 245 - var37, 16777215, -1);
            int var38 = 253 - var37;
            class80.method1676(field694 + 180 - 152, var38, 304, 34, 9179409);
            class80.method1676(field694 + 180 - 151, var38 + 1, 302, 32, 0);
            class80.method1699(field694 + 180 - 150, var38 + 2, field702 * 3, 30, 9179409);
            class80.method1699(field702 * 3 + (field694 + 180 - 150), var38 + 2, 300 - field702 * 3, 30, 0);
            arg0.method3805(field703, field694 + 180, 276 - var37, 16777215, -1);
        }
        if (client.field293 == 20) {
            Statics.field718.method1727(field694 + 180 - Statics.field718.field1391 / 2, 271 - Statics.field718.field1392 / 2);
            short var39 = 211;
            arg0.method3805(field705, field694 + 180, var39, 16776960, 0);
            int var113 = var39 + 15;
            arg0.method3805(field706, field694 + 180, var113, 16776960, 0);
            int var114 = var113 + 15;
            arg0.method3805(field707, field694 + 180, var114, 16776960, 0);
            int var115 = var114 + 15;
            int var116 = var115 + 10;
            if (field704 != 4) {
                arg0.method3786(class157.field2520, field694 + 180 - 110, var116, 16777215, 0);
                short var40 = 200;
                String var41;
                for (var41 = field708; arg0.method3781(var41) > var40; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method3786(class223.method3856(var41), field694 + 180 - 70, var116, 16777215, 0);
                var113 = var116 + 15;
                arg0.method3786(class157.field2456 + class163.method3002(field709), field694 + 180 - 108, var113, 16777215, 0);
                var113 += 15;
            }
        }
        if (client.field293 == 10 || client.field293 == 11) {
            Statics.field718.method1727(field694, 171);
            if (field704 == 0) {
                short var42 = 251;
                arg0.method3805(class157.field2523, field694 + 180, var42, 16776960, 0);
                int var117 = var42 + 30;
                int var43 = field694 + 180 - 80;
                short var44 = 291;
                Statics.field689.method1727(var43 - 73, var44 - 20);
                arg0.method3789(class157.field2349, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var45 = field694 + 180 + 80;
                Statics.field689.method1727(var45 - 73, var44 - 20);
                arg0.method3789(class157.field2525, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field704 == 1) {
                arg0.method3805(class157.field2506, field694 + 180, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3805(field705, field694 + 180, var46, 16777215, 0);
                int var118 = var46 + 15;
                arg0.method3805(field706, field694 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method3805(field707, field694 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                int var47 = field694 + 180 - 80;
                short var48 = 321;
                Statics.field689.method1727(var47 - 73, var48 - 20);
                arg0.method3805(class157.field2526, var47, var48 + 5, 16777215, 0);
                int var49 = field694 + 180 + 80;
                Statics.field689.method1727(var49 - 73, var48 - 20);
                arg0.method3805(class157.field2527, var49, var48 + 5, 16777215, 0);
            } else if (field704 == 2) {
                short var50 = 211;
                arg0.method3805(field705, field694 + 180, var50, 16776960, 0);
                int var121 = var50 + 15;
                arg0.method3805(field706, field694 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg0.method3805(field707, field694 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                int var124 = var123 + 10;
                arg0.method3786(class157.field2520, field694 + 180 - 110, var124, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field708; arg0.method3781(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3786(class223.method3856(var52) + (field720 == 0 & client.field312 % 40 < 20 ? class2.method905(16776960) + class2.field19 : ""), field694 + 180 - 70, var124, 16777215, 0);
                var121 = var124 + 15;
                arg0.method3786(class157.field2456 + class163.method3002(field709) + (field720 == 1 & client.field312 % 40 < 20 ? class2.method905(16776960) + class2.field19 : ""), field694 + 180 - 108, var121, 16777215, 0);
                var121 += 15;
                int var53 = field694 + 180 - 80;
                short var54 = 321;
                Statics.field689.method1727(var53 - 73, var54 - 20);
                arg0.method3805(class157.field2521, var53, var54 + 5, 16777215, 0);
                int var55 = field694 + 180 + 80;
                Statics.field689.method1727(var55 - 73, var54 - 20);
                arg0.method3805(class157.field2527, var55, var54 + 5, 16777215, 0);
                short var56 = 357;
                arg1.method3805(class157.field2533, field694 + 180, var56, 16776960, 0);
            } else if (field704 == 3) {
                short var57 = 201;
                arg0.method3805(class157.field2326, field694 + 180, var57, 16776960, 0);
                int var125 = var57 + 20;
                arg1.method3805(class157.field2331, field694 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg1.method3805(class157.field2547, field694 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var58 = field694 + 180;
                short var59 = 276;
                Statics.field689.method1727(var58 - 73, var59 - 20);
                arg2.method3805(class157.field2427, var58, var59 + 5, 16777215, 0);
                int var60 = field694 + 180;
                short var61 = 326;
                Statics.field689.method1727(var60 - 73, var61 - 20);
                arg2.method3805(class157.field2532, var60, var61 + 5, 16777215, 0);
            } else if (field704 == 4) {
                arg0.method3805(class157.field2301, field694 + 180, 211, 16776960, 0);
                short var62 = 236;
                arg0.method3805(field705, field694 + 180, var62, 16777215, 0);
                int var128 = var62 + 15;
                arg0.method3805(field706, field694 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                arg0.method3805(field707, field694 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                arg0.method3786(class157.field2486 + class163.method3002(Statics.field711) + (client.field312 % 40 < 20 ? class2.method905(16776960) + class2.field19 : ""), field694 + 180 - 108, var130, 16777215, 0);
                int var131 = var130 - 8;
                arg0.method3786(class157.field2528, field694 + 180 - 9, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg0.method3786(class157.field2388, field694 + 180 - 9, var132, 16776960, 0);
                int var63 = field694 + 180 - 9 + arg0.method3781(class157.field2388) + 15;
                int var64 = var132 - arg0.field3175;
                class81 var65;
                if (field692) {
                    var65 = Statics.field701;
                } else {
                    var65 = Statics.field261;
                }
                var65.method1727(var63, var64);
                var128 = var132 + 15;
                int var66 = field694 + 180 - 80;
                short var67 = 321;
                Statics.field689.method1727(var66 - 73, var67 - 20);
                arg0.method3805(class157.field2526, var66, var67 + 5, 16777215, 0);
                int var68 = field694 + 180 + 80;
                Statics.field689.method1727(var68 - 73, var67 - 20);
                arg0.method3805(class157.field2527, var68, var67 + 5, 16777215, 0);
                arg1.method3805(class157.field2516, field694 + 180, var67 + 36, 255, 0);
            } else if (field704 == 5) {
                arg0.method3805(class157.field2534, field694 + 180, 201, 16776960, 0);
                short var69 = 221;
                arg2.method3805(field705, field694 + 180, var69, 16776960, 0);
                int var133 = var69 + 15;
                arg2.method3805(field706, field694 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                arg2.method3805(field707, field694 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                int var136 = var135 + 14;
                arg0.method3786(class157.field2383, field694 + 180 - 145, var136, 16777215, 0);
                short var70 = 174;
                String var71;
                for (var71 = field708; arg0.method3781(var71) > var70; var71 = var71.substring(1)) {
                }
                arg0.method3786(class223.method3856(var71) + (client.field312 % 40 < 20 ? class2.method905(16776960) + class2.field19 : ""), field694 + 180 - 34, var136, 16777215, 0);
                var133 = var136 + 15;
                int var72 = field694 + 180 - 80;
                short var73 = 321;
                Statics.field689.method1727(var72 - 73, var73 - 20);
                arg0.method3805(class157.field2536, var72, var73 + 5, 16777215, 0);
                int var74 = field694 + 180 + 80;
                Statics.field689.method1727(var74 - 73, var73 - 20);
                arg0.method3805(class157.field2537, var74, var73 + 5, 16777215, 0);
            } else if (field704 == 6) {
                short var75 = 211;
                arg0.method3805(field705, field694 + 180, var75, 16776960, 0);
                int var137 = var75 + 15;
                arg0.method3805(field706, field694 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg0.method3805(field707, field694 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var76 = field694 + 180;
                short var77 = 321;
                Statics.field689.method1727(var76 - 73, var77 - 20);
                arg0.method3805(class157.field2537, var76, var77 + 5, 16777215, 0);
            }
        }
        if (field686 > 0) {
            method3719(field686);
            field686 = 0;
        }
        short var78 = 256;
        if (field696 > 0) {
            for (int var79 = 0; var79 < 256; var79++) {
                if (field696 > 768) {
                    Statics.field260[var79] = method189(Statics.field2623[var79], Statics.field618[var79], 1024 - field696);
                } else if (field696 > 256) {
                    Statics.field260[var79] = Statics.field618[var79];
                } else {
                    Statics.field260[var79] = method189(Statics.field618[var79], Statics.field2623[var79], 256 - field696);
                }
            }
        } else if (field712 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field712 > 768) {
                    Statics.field260[var80] = method189(Statics.field2623[var80], Statics.field157[var80], 1024 - field712);
                } else if (field712 > 256) {
                    Statics.field260[var80] = Statics.field157[var80];
                } else {
                    Statics.field260[var80] = method189(Statics.field157[var80], Statics.field2623[var80], 256 - field712);
                }
            }
        } else {
            for (int var81 = 0; var81 < 256; var81++) {
                Statics.field260[var81] = Statics.field2623[var81];
            }
        }
        class80.method1668(field687, 9, field687 + 128, var78 + 7);
        Statics.field691.method1577(field687, 0);
        class80.method1667();
        int var82 = 0;
        int var83 = field687 + Statics.field693.field1362 * 9;
        for (int var84 = 1; var84 < var78 - 1; var84++) {
            int var85 = (var78 - var84) * field717[var84] / var78;
            int var86 = var85 + 22;
            if (var86 < 0) {
                var86 = 0;
            }
            var82 += var86;
            for (int var87 = var86; var87 < 128; var87++) {
                int var88 = Statics.field1631[var82++];
                if (var88 == 0) {
                    var83++;
                } else {
                    int var90 = 256 - var88;
                    int var91 = Statics.field260[var88];
                    int var92 = Statics.field693.field1365[var83];
                    Statics.field693.field1365[var83++] = ((var91 & 0xFF00) * var88 + (var92 & 0xFF00) * var90 & 0xFF0000) + ((var91 & 0xFF00FF) * var88 + (var92 & 0xFF00FF) * var90 & 0xFF00FF00) >> 8;
                }
            }
            var83 += Statics.field693.field1362 + var86 - 128;
        }
        class80.method1668(field687 + 765 - 128, 9, field687 + 765, var78 + 7);
        Statics.field2582.method1577(field687 + 382, 0);
        class80.method1667();
        int var93 = 0;
        int var94 = field687 + Statics.field693.field1362 * 9 + 24 + 637;
        for (int var95 = 1; var95 < var78 - 1; var95++) {
            int var96 = (var78 - var95) * field717[var95] / var78;
            int var97 = 103 - var96;
            int var98 = var94 + var96;
            for (int var99 = 0; var99 < var97; var99++) {
                int var100 = Statics.field1631[var93++];
                if (var100 == 0) {
                    var98++;
                } else {
                    int var102 = 256 - var100;
                    int var103 = Statics.field260[var100];
                    int var104 = Statics.field693.field1365[var98];
                    Statics.field693.field1365[var98++] = ((var103 & 0xFF00) * var100 + (var104 & 0xFF00) * var102 & 0xFF0000) + ((var103 & 0xFF00FF) * var100 + (var104 & 0xFF00FF) * var102 & 0xFF00FF00) >> 8;
                }
            }
            var93 += 128 - var97;
            var94 = Statics.field693.field1362 - var97 - var96 + var98;
        }
        Statics.field3158[Statics.field1639.field128 ? 1 : 0].method1727(field687 + 765 - 40, 463);
        if (client.field293 > 5 && client.field392 == 0) {
            if (Statics.field1416 == null) {
                Statics.field1416 = class77.method2825(Statics.field1369, "sl_button", "");
            } else {
                int var105 = field687 + 5;
                short var106 = 463;
                byte var107 = 100;
                byte var108 = 35;
                Statics.field1416.method1727(var105, var106);
                arg0.method3805(class157.field2491 + " " + client.field284, var107 / 2 + var105, var108 / 2 + var106 - 2, 16777215, 0);
                if (Statics.field245 == null) {
                    arg1.method3805(class157.field2569, var107 / 2 + var105, var108 / 2 + var106 + 12, 16777215, 0);
                } else {
                    arg1.method3805(class157.field2568, var107 / 2 + var105, var108 / 2 + var106 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var109 = Statics.field268.getGraphics();
            Statics.field693.method1525(var109, 0, 0);
        } catch (Exception var112) {
            Statics.field268.repaint();
        }
    }

    @ObfuscatedName("el.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2688(String arg0, String arg1, String arg2) {
        field705 = arg0;
        field706 = arg1;
        field707 = arg2;
    }

    @ObfuscatedName("ci.b(Lcj;I)V")
    public static final void method2048(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1078.length; var2++) {
            Statics.field1078[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1078[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field986[var8] = (Statics.field1078[var8 - 1] + Statics.field1078[var8 + 1] + Statics.field1078[var8 - 128] + Statics.field1078[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1078;
            Statics.field1078 = Statics.field986;
            Statics.field986 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1392; var11++) {
            for (int var12 = 0; var12 < arg0.field1391; var12++) {
                if (arg0.field1390[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1393;
                    int var14 = var11 + 16 + arg0.field1389;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1078[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("hb.j(II)V")
    public static final void method3719(int arg0) {
        short var1 = 256;
        field698 += arg0 * 128;
        if (field698 > Statics.field1078.length) {
            field698 -= Statics.field1078.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2048(Statics.field690[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1631[var3 + var4] - Statics.field1078[field698 + var3 & Statics.field1078.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1631[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1631[var9 + var10] = 255;
                } else {
                    Statics.field1631[var9 + var10] = 0;
                }
            }
        }
        if (field696 > 0) {
            field696 -= arg0 * 4;
        }
        if (field712 > 0) {
            field712 -= arg0 * 4;
        }
        if (field696 == 0 && field712 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field696 = 1024;
            }
            if (var12 == 1) {
                field712 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field717[var13] = field717[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field717[var14] = (int) (Math.sin((double) field688 / 14.0D) * 16.0D + Math.sin((double) field688 / 15.0D) * 14.0D + Math.sin((double) field688 / 16.0D) * 12.0D);
            field688++;
        }
        field699 += arg0 * 1015916235;
        int var15 = ((client.field312 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field699 * 588107948; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1631[(var18 << 7) + var17] = 192;
        }
        field699 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1631[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1631[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field279[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field279[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field279[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1631[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("m.f(IIIS)I")
    public static final int method189(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ai.i(Lp;B)V")
    public static void method906(class26 arg0) {
        if (arg0.method562() != client.field289) {
            client.field289 = arg0.method562();
            class52.method2990(arg0.method562());
        }
        Statics.field1070 = arg0.field629;
        client.field284 = arg0.field626;
        client.field406 = arg0.field627;
        Statics.field659 = client.field287 == 0 ? 43594 : arg0.field626 + 40000;
        Statics.field2903 = client.field287 == 0 ? 443 : arg0.field626 + 50000;
        Statics.field1992 = Statics.field659;
    }

    @ObfuscatedName("gr.g(I)V")
    public static void method3383() {
        if (class26.method175()) {
            field716 = true;
        }
    }
}
