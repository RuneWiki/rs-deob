package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ar")
public class class42 {

    @ObfuscatedName("ar.m")
    public static int field861 = 0;

    @ObfuscatedName("ar.i")
    public static int field834 = field861 + 202;

    @ObfuscatedName("ar.x")
    public static int[] field852 = new int[256];

    @ObfuscatedName("ar.t")
    public static int field837 = 0;

    @ObfuscatedName("ar.r")
    public static int field849 = 0;

    @ObfuscatedName("ar.au")
    public static int field839 = 0;

    @ObfuscatedName("ar.aa")
    public static int field840 = 0;

    @ObfuscatedName("ar.ae")
    public static int field835 = 0;

    @ObfuscatedName("ar.av")
    public static int field832 = 0;

    @ObfuscatedName("ar.ao")
    public static int field838 = 10;

    @ObfuscatedName("ar.ah")
    public static String field844 = "";

    @ObfuscatedName("ar.ak")
    public static int field860 = 0;

    @ObfuscatedName("ar.ab")
    public static String field846 = "";

    @ObfuscatedName("ar.ay")
    public static String field836 = "";

    @ObfuscatedName("ar.an")
    public static String field848 = "";

    @ObfuscatedName("ar.aw")
    public static String field843 = "";

    @ObfuscatedName("ar.af")
    public static String field850 = "";

    @ObfuscatedName("ar.ac")
    public static String field851 = "";

    @ObfuscatedName("ar.ar")
    public static class98 field845 = class98.field1623;

    @ObfuscatedName("ar.ax")
    public static boolean field853 = true;

    @ObfuscatedName("ar.az")
    public static int field854 = 0;

    @ObfuscatedName("ar.ai")
    public static String field855 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.ap")
    public static String field847 = "1234567890";

    @ObfuscatedName("ar.aq")
    public static boolean field857 = false;

    @ObfuscatedName("ar.bh")
    public static int field858 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.o(I)I")
    public static int method1086() {
        return 9;
    }

    @ObfuscatedName("am.m(Ljava/awt/Component;Lgl;Lgl;ZII)V")
    public static void method570(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field2046) {
            field860 = arg4;
            class220.method3698();
            byte[] var5 = arg1.method3029("title.jpg", "");
            Statics.field831 = new class225(var5, arg0);
            Statics.field1767 = Statics.field831.method3803();
            if ((client.field457 & 0x20000000) == 0) {
                Statics.field841 = class226.method3667(arg2, "logo", "");
            } else {
                Statics.field841 = class226.method3667(arg2, "logo_deadman_mode", "");
            }
            Statics.field829 = class226.method3667(arg2, "titlebox", "");
            Statics.field973 = class226.method3667(arg2, "titlebutton", "");
            Statics.field830 = class226.method2052(arg2, "runes", "");
            Statics.field1095 = class226.method2052(arg2, "title_mute", "");
            Statics.field770 = class226.method3667(arg2, "options_radio_buttons,0", "");
            Statics.field3281 = class226.method3667(arg2, "options_radio_buttons,2", "");
            Statics.field913 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field913[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field913[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field913[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field913[var9 + 192] = 16777215;
            }
            Statics.field3160 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3160[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3160[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3160[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field3160[var13 + 192] = 16777215;
            }
            Statics.field164 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field164[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field164[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field164[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field164[var17 + 192] = 16777215;
            }
            Statics.field919 = new int[256];
            Statics.field22 = new int[32768];
            Statics.field944 = new int[32768];
            method3565((class223) null);
            Statics.field231 = new int[32768];
            Statics.field932 = new int[32768];
            if (arg3) {
                field850 = "";
                field851 = "";
            }
            Statics.field3092 = 0;
            Statics.field937 = "";
            field853 = true;
            field857 = false;
            if (Statics.field36.field701) {
                class139.method2091(2);
            } else {
                class185 var18 = Statics.field1865;
                int var19 = var18.method3027("scape main");
                int var20 = var18.method3028(var19, "");
                class139.field1930 = 1;
                Statics.field1931 = var18;
                Statics.field1932 = var19;
                Statics.field2712 = var20;
                Statics.field1933 = 255;
                Statics.field666 = false;
                Statics.field187 = 2;
            }
            class186.method202(false);
            Statics.field2046 = true;
            field861 = (Statics.field1201 - client.field500 * 765) / 2;
            field834 = field861 + 202;
            Statics.field831.method3858(field861, 0);
            Statics.field1767.method3858(field861 + 382, 0);
            Statics.field841.method3775(field861 + 382 - Statics.field841.field3194 / 2, 18);
        } else if (arg4 == 4) {
            field860 = 4;
        }
    }

    @ObfuscatedName("cf.b(B)V")
    public static void method1793() {
        if (!Statics.field2046) {
            return;
        }
        Statics.field829 = null;
        Statics.field973 = null;
        Statics.field830 = null;
        Statics.field831 = null;
        Statics.field1767 = null;
        Statics.field841 = null;
        Statics.field1095 = null;
        Statics.field770 = null;
        Statics.field3281 = null;
        Statics.field1992 = null;
        Statics.field2644 = null;
        Statics.field27 = null;
        Statics.field1631 = null;
        Statics.field966 = null;
        Statics.field913 = null;
        Statics.field3160 = null;
        Statics.field164 = null;
        Statics.field919 = null;
        Statics.field22 = null;
        Statics.field944 = null;
        Statics.field231 = null;
        Statics.field932 = null;
        class139.method2091(2);
        class186.method202(true);
        Statics.field2046 = false;
    }

    @ObfuscatedName("u.g(Ldu;B)V")
    public static void method94(class114 arg0) {
        if (field857) {
            method849(arg0);
            return;
        }
        if ((class116.field1821 == 1 || !Statics.field2048 && class116.field1821 == 4) && class116.field1824 >= field861 + 765 - 50 && class116.field1826 >= 453) {
            Statics.field36.field701 = !Statics.field36.field701;
            class31.method2089();
            if (Statics.field36.field701) {
                Statics.field1927.method2333();
                class139.field1930 = 1;
                Statics.field1931 = null;
            } else {
                class139.method17(Statics.field1865, "scape main", "", 255, false);
            }
        }
        if (client.field297 == 5) {
            return;
        }
        field835++;
        if (client.field297 != 10 && client.field297 != 11) {
            return;
        }
        if (client.field510 == 0) {
            if (class116.field1821 == 1 || !Statics.field2048 && class116.field1821 == 4) {
                int var1 = field861 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class116.field1824 >= var1 && class116.field1824 <= var1 + var3 && class116.field1826 >= var2 && class116.field1826 <= var2 + var4) {
                    if (class30.method560()) {
                        field857 = true;
                    }
                    return;
                }
            }
            if (Statics.field686 != null && class30.method560()) {
                field857 = true;
            }
        }
        int var5 = class116.field1821;
        int var6 = class116.field1824;
        int var7 = class116.field1826;
        if (!Statics.field2048 && var5 == 4) {
            var5 = 1;
        }
        if (field860 == 0) {
            int var8 = field834 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class115.method1442(client.method1116("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field457 & 0x2000000) != 0) {
                    field846 = "";
                    field836 = class174.field2633;
                    field848 = class174.field2584;
                    field843 = class174.field2589;
                    field860 = 1;
                    field854 = 0;
                } else if ((client.field457 & 0x4) != 0) {
                    if ((client.field457 & 0x400) == 0) {
                        field836 = class174.field2574;
                        field848 = class174.field2426;
                        field843 = class174.field2576;
                    } else {
                        field836 = class174.field2580;
                        field848 = class174.field2581;
                        field843 = class174.field2582;
                    }
                    field846 = class174.field2573;
                    field860 = 1;
                    field854 = 0;
                } else if ((client.field457 & 0x400) == 0) {
                    field836 = class174.field2570;
                    field848 = class174.field2551;
                    field843 = class174.field2567;
                    field860 = 2;
                    field854 = 0;
                } else {
                    field836 = class174.field2577;
                    field848 = class174.field2578;
                    field843 = class174.field2579;
                    field846 = class174.field2573;
                    field860 = 1;
                    field854 = 0;
                }
            }
        } else if (field860 == 1) {
            while (class106.method148()) {
                if (Statics.field2671 == 84) {
                    field836 = class174.field2570;
                    field848 = class174.field2551;
                    field843 = class174.field2567;
                    field860 = 2;
                    field854 = 0;
                } else if (Statics.field2671 == 13) {
                    field860 = 0;
                }
            }
            int var11 = field834 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field836 = class174.field2570;
                field848 = class174.field2551;
                field843 = class174.field2567;
                field860 = 2;
                field854 = 0;
            }
            int var13 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field860 = 0;
            }
        } else if (field860 == 2) {
            short var14 = 231;
            int var36 = var14 + 30;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field854 = 0;
            }
            var36 += 15;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field854 = 1;
            }
            var36 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method846(class174.field2609, class174.field2610, class174.field2611);
                field860 = 5;
                return;
            }
            int var16 = field834 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field850 = field850.trim();
                if (field850.length() == 0) {
                    method846(class174.field2588, class174.field2555, class174.field2478);
                    return;
                }
                if (field851.length() == 0) {
                    method846(class174.field2473, class174.field2480, class174.field2629);
                    return;
                }
                method846(class174.field2501, class174.field2376, class174.field2523);
                field845 = Statics.field36.field707.containsKey(class208.method173(field850)) ? class98.field1633 : class98.field1623;
                client.method191(20);
                return;
            }
            int var18 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field860 = 0;
                field850 = "";
                field851 = "";
                Statics.field3092 = 0;
                Statics.field937 = "";
                field853 = true;
            }
            while (true) {
                while (class106.method148()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field855.length(); var20++) {
                        if (Statics.field1530 == field855.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field2671 == 13) {
                        field860 = 0;
                        field850 = "";
                        field851 = "";
                        Statics.field3092 = 0;
                        Statics.field937 = "";
                        field853 = true;
                    } else if (field854 == 0) {
                        if (Statics.field2671 == 85 && field850.length() > 0) {
                            field850 = field850.substring(0, field850.length() - 1);
                        }
                        if (Statics.field2671 == 84 || Statics.field2671 == 80) {
                            field854 = 1;
                        }
                        if (var19 && field850.length() < 320) {
                            field850 = field850 + Statics.field1530;
                        }
                    } else if (field854 == 1) {
                        if (Statics.field2671 == 85 && field851.length() > 0) {
                            field851 = field851.substring(0, field851.length() - 1);
                        }
                        if (Statics.field2671 == 84 || Statics.field2671 == 80) {
                            field854 = 0;
                        }
                        if (Statics.field2671 == 84) {
                            field850 = field850.trim();
                            if (field850.length() == 0) {
                                method846(class174.field2588, class174.field2555, class174.field2478);
                                return;
                            }
                            if (field851.length() == 0) {
                                method846(class174.field2473, class174.field2480, class174.field2629);
                                return;
                            }
                            method846(class174.field2501, class174.field2376, class174.field2523);
                            field845 = Statics.field36.field707.containsKey(class208.method173(field850)) ? class98.field1633 : class98.field1623;
                            client.method191(20);
                            return;
                        }
                        if (var19 && field851.length() < 20) {
                            field851 = field851 + Statics.field1530;
                        }
                    }
                }
                return;
            }
        } else if (field860 == 3) {
            int var21 = field834 + 180;
            short var22 = 276;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field836 = class174.field2570;
                field848 = class174.field2551;
                field843 = class174.field2567;
                field860 = 2;
                field854 = 0;
            }
            int var23 = field834 + 180;
            short var24 = 326;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                method846(class174.field2609, class174.field2610, class174.field2611);
                field860 = 5;
                return;
            }
        } else if (field860 == 4) {
            int var25 = field834 + 180 - 80;
            short var26 = 321;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                Statics.field937.trim();
                if (Statics.field937.length() != 6) {
                    method846(class174.field2395, class174.field2396, class174.field2397);
                    return;
                }
                Statics.field3092 = Integer.parseInt(Statics.field937);
                Statics.field937 = "";
                field845 = field853 ? class98.field1629 : class98.field1624;
                method846(class174.field2501, class174.field2376, class174.field2523);
                client.method191(20);
                return;
            }
            if (var5 == 1 && var6 >= field834 + 180 - 9 && var6 <= field834 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field853 = !field853;
            }
            if (var5 == 1 && var6 >= field834 + 180 - 34 && var6 <= field834 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class115.method1442(client.method1116("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var27 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                field860 = 0;
                field850 = "";
                field851 = "";
                Statics.field3092 = 0;
                Statics.field937 = "";
            }
            while (class106.method148()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field847.length(); var29++) {
                    if (Statics.field1530 == field847.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field2671 == 13) {
                    field860 = 0;
                    field850 = "";
                    field851 = "";
                    Statics.field3092 = 0;
                    Statics.field937 = "";
                } else {
                    if (Statics.field2671 == 85 && Statics.field937.length() > 0) {
                        Statics.field937 = Statics.field937.substring(0, Statics.field937.length() - 1);
                    }
                    if (Statics.field2671 == 84) {
                        Statics.field937.trim();
                        if (Statics.field937.length() != 6) {
                            method846(class174.field2395, class174.field2396, class174.field2397);
                            return;
                        }
                        Statics.field3092 = Integer.parseInt(Statics.field937);
                        Statics.field937 = "";
                        field845 = field853 ? class98.field1629 : class98.field1624;
                        method846(class174.field2501, class174.field2376, class174.field2523);
                        client.method191(20);
                        return;
                    }
                    if (var28 && Statics.field937.length() < 6) {
                        Statics.field937 = Statics.field937 + Statics.field1530;
                    }
                }
            }
        } else if (field860 == 5) {
            int var30 = field834 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method2911();
                return;
            }
            int var32 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field836 = class174.field2570;
                field848 = class174.field2551;
                field843 = class174.field2567;
                field860 = 2;
                field854 = 0;
                field851 = "";
            }
            while (class106.method148()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field855.length(); var34++) {
                    if (Statics.field1530 == field855.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field2671 == 13) {
                    field836 = class174.field2570;
                    field848 = class174.field2551;
                    field843 = class174.field2567;
                    field860 = 2;
                    field854 = 0;
                    field851 = "";
                } else {
                    if (Statics.field2671 == 85 && field850.length() > 0) {
                        field850 = field850.substring(0, field850.length() - 1);
                    }
                    if (Statics.field2671 == 84) {
                        method2911();
                        return;
                    }
                    if (var33 && field850.length() < 320) {
                        field850 = field850 + Statics.field1530;
                    }
                }
            }
        } else if (field860 == 6) {
            while (true) {
                do {
                    if (!class106.method148()) {
                        short var35 = 321;
                        if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                            field836 = class174.field2570;
                            field848 = class174.field2551;
                            field843 = class174.field2567;
                            field860 = 2;
                            field854 = 0;
                            field851 = "";
                        }
                        return;
                    }
                } while (Statics.field2671 != 84 && Statics.field2671 != 13);
                field836 = class174.field2570;
                field848 = class174.field2551;
                field843 = class174.field2567;
                field860 = 2;
                field854 = 0;
                field851 = "";
            }
        }
    }

    @ObfuscatedName("fi.l(B)V")
    public static void method2911() {
        field850 = field850.trim();
        if (field850.length() == 0) {
            method846(class174.field2609, class174.field2610, class174.field2611);
            return;
        }
        long var0 = class37.method710();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class37.method566(var0, field850);
        }
        switch(var2) {
            case 2:
                method846(class174.field2612, class174.field2613, class174.field2614);
                field860 = 6;
                break;
            case 3:
                method846(class174.field2615, class174.field2616, class174.field2617);
                break;
            case 4:
                method846(class174.field2618, class174.field2490, class174.field2404);
                break;
            case 5:
                method846(class174.field2621, class174.field2622, class174.field2401);
                break;
            case 6:
                method846(class174.field2362, class174.field2625, class174.field2626);
                break;
            case 7:
                method846(class174.field2627, class174.field2628, class174.field2504);
        }
    }

    @ObfuscatedName("en.c(Lhq;Lhq;Lhq;ZI)V")
    public static void method2496(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field861 = (Statics.field1201 - client.field500 * 765) / 2;
            field834 = field861 + 202;
        }
        if (field857) {
            if (Statics.field1992 == null) {
                Statics.field1992 = Statics.method1794(Statics.field3087, "sl_back", "");
            }
            if (Statics.field2644 == null) {
                Statics.field2644 = class226.method2052(Statics.field3087, "sl_flags", "");
            }
            if (Statics.field27 == null) {
                Statics.field27 = class226.method2052(Statics.field3087, "sl_arrows", "");
            }
            if (Statics.field1631 == null) {
                Statics.field1631 = class226.method2052(Statics.field3087, "sl_stars", "");
            }
            class220.method3696(field861, 23, 765, 480, 0);
            class220.method3707(field861, 0, 125, 23, 12425273, 9135624);
            class220.method3707(field861 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3587(class174.field2630, field861 + 62, 15, 0, -1);
            if (Statics.field1631 != null) {
                Statics.field1631[1].method3775(field861 + 140, 1);
                arg1.method3584(class174.field2435, field861 + 152, 10, 16777215, -1);
                Statics.field1631[0].method3775(field861 + 140, 12);
                arg1.method3584(class174.field2632, field861 + 152, 21, 16777215, -1);
            }
            if (Statics.field27 != null) {
                int var4 = field861 + 280;
                if (class30.field697[0] == 0 && class30.field676[0] == 0) {
                    Statics.field27[2].method3775(var4, 4);
                } else {
                    Statics.field27[0].method3775(var4, 4);
                }
                if (class30.field697[0] == 0 && class30.field676[0] == 1) {
                    Statics.field27[3].method3775(var4 + 15, 4);
                } else {
                    Statics.field27[1].method3775(var4 + 15, 4);
                }
                arg0.method3584(class174.field2394, var4 + 32, 17, 16777215, -1);
                int var5 = field861 + 390;
                if (class30.field697[0] == 1 && class30.field676[0] == 0) {
                    Statics.field27[2].method3775(var5, 4);
                } else {
                    Statics.field27[0].method3775(var5, 4);
                }
                if (class30.field697[0] == 1 && class30.field676[0] == 1) {
                    Statics.field27[3].method3775(var5 + 15, 4);
                } else {
                    Statics.field27[1].method3775(var5 + 15, 4);
                }
                arg0.method3584(class174.field2634, var5 + 32, 17, 16777215, -1);
                int var6 = field861 + 500;
                if (class30.field697[0] == 2 && class30.field676[0] == 0) {
                    Statics.field27[2].method3775(var6, 4);
                } else {
                    Statics.field27[0].method3775(var6, 4);
                }
                if (class30.field697[0] == 2 && class30.field676[0] == 1) {
                    Statics.field27[3].method3775(var6 + 15, 4);
                } else {
                    Statics.field27[1].method3775(var6 + 15, 4);
                }
                arg0.method3584(class174.field2635, var6 + 32, 17, 16777215, -1);
                int var7 = field861 + 610;
                if (class30.field697[0] == 3 && class30.field676[0] == 0) {
                    Statics.field27[2].method3775(var7, 4);
                } else {
                    Statics.field27[0].method3775(var7, 4);
                }
                if (class30.field697[0] == 3 && class30.field676[0] == 1) {
                    Statics.field27[3].method3775(var7 + 15, 4);
                } else {
                    Statics.field27[1].method3775(var7 + 15, 4);
                }
                arg0.method3584(class174.field2636, var7 + 32, 17, 16777215, -1);
            }
            class220.method3696(field861 + 708, 4, 50, 16, 0);
            arg1.method3587(class174.field2419, field861 + 708 + 25, 16, 16777215, -1);
            field858 = -1;
            if (Statics.field1992 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field680) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field680) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field680) {
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
                int var19 = field861 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class30.field680; var22++) {
                    class30 var23 = Statics.field692[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field687);
                    if (var23.field687 == -1) {
                        var25 = class174.field2637;
                        var24 = false;
                    } else if (var23.field687 > 1980) {
                        var25 = class174.field2638;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method609()) {
                        if (var23.method595()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method599()) {
                        var26 = 16711680;
                        if (var23.method595()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method597()) {
                        if (var23.method595()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method595()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1815 >= var19 && class116.field1822 >= var18 && class116.field1815 < var8 + var19 && class116.field1822 < var9 + var18 && var24) {
                        field858 = var22;
                        Statics.field1992[var27].method3818(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1992[var27].method3858(var19, var18);
                    }
                    if (Statics.field2644 != null) {
                        Statics.field2644[(var23.method595() ? 8 : 0) + var23.field690].method3775(var19 + 29, var18);
                    }
                    arg0.method3587(Integer.toString(var23.field685), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3587(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3575(Statics.field692[field858].field689) + 6;
                    int var29 = arg1.field3103 + 8;
                    class220.method3696(class116.field1815 - var28 / 2, class116.field1822 + 20 + 5, var28, var29, 16777120);
                    class220.method3702(class116.field1815 - var28 / 2, class116.field1822 + 20 + 5, var28, var29, 0);
                    arg1.method3587(Statics.field692[field858].field689, class116.field1815, class116.field1822 + 20 + 5 + arg1.field3103 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field782.getGraphics();
                Statics.field1210.method3675(var30, 0, 0);
            } catch (Exception var106) {
                Statics.field782.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field831.method3858(field861, 0);
            Statics.field1767.method3858(field861 + 382, 0);
            Statics.field841.method3775(field861 + 382 - Statics.field841.field3194 / 2, 18);
        }
        if (client.field297 == 0 || client.field297 == 5) {
            byte var32 = 20;
            arg0.method3587(class174.field2569, field834 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3702(field834 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3702(field834 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3696(field834 + 180 - 150, var33 + 2, field838 * 3, 30, 9179409);
            class220.method3696(field838 * 3 + (field834 + 180 - 150), var33 + 2, 300 - field838 * 3, 30, 0);
            arg0.method3587(field844, field834 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field297 == 20) {
            Statics.field829.method3775(field834 + 180 - Statics.field829.field3194 / 2, 271 - Statics.field829.field3199 / 2);
            short var34 = 211;
            arg0.method3587(field836, field834 + 180, var34, 16776960, 0);
            int var108 = var34 + 15;
            arg0.method3587(field848, field834 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            arg0.method3587(field843, field834 + 180, var109, 16776960, 0);
            int var110 = var109 + 15;
            int var111 = var110 + 10;
            if (field860 != 4) {
                arg0.method3584(class174.field2591, field834 + 180 - 110, var111, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field850; arg0.method3575(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3584(class210.method3583(var36), field834 + 180 - 70, var111, 16777215, 0);
                var108 = var111 + 15;
                arg0.method3584(class174.field2603 + class208.method1753(field851), field834 + 180 - 108, var108, 16777215, 0);
                var108 += 15;
            }
        }
        if (client.field297 == 10 || client.field297 == 11) {
            Statics.field829.method3775(field834, 171);
            if (field860 == 0) {
                short var37 = 251;
                arg0.method3587(class174.field2594, field834 + 180, var37, 16776960, 0);
                int var112 = var37 + 30;
                int var38 = field834 + 180 - 80;
                short var39 = 291;
                Statics.field973.method3775(var38 - 73, var39 - 20);
                arg0.method3625(class174.field2595, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var40 = field834 + 180 + 80;
                Statics.field973.method3775(var40 - 73, var39 - 20);
                arg0.method3625(class174.field2399, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field860 == 1) {
                arg0.method3587(field846, field834 + 180, 211, 16776960, 0);
                short var41 = 236;
                arg0.method3587(field836, field834 + 180, var41, 16777215, 0);
                int var113 = var41 + 15;
                arg0.method3587(field848, field834 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3587(field843, field834 + 180, var114, 16777215, 0);
                int var115 = var114 + 15;
                int var42 = field834 + 180 - 80;
                short var43 = 321;
                Statics.field973.method3775(var42 - 73, var43 - 20);
                arg0.method3587(class174.field2624, var42, var43 + 5, 16777215, 0);
                int var44 = field834 + 180 + 80;
                Statics.field973.method3775(var44 - 73, var43 - 20);
                arg0.method3587(class174.field2419, var44, var43 + 5, 16777215, 0);
            } else if (field860 == 2) {
                short var45 = 211;
                arg0.method3587(field836, field834 + 180, var45, 16776960, 0);
                int var116 = var45 + 15;
                arg0.method3587(field848, field834 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method3587(field843, field834 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                int var119 = var118 + 10;
                arg0.method3584(class174.field2591, field834 + 180 - 110, var119, 16777215, 0);
                short var46 = 200;
                String var47;
                for (var47 = field850; arg0.method3575(var47) > var46; var47 = var47.substring(1)) {
                }
                arg0.method3584(class210.method3583(var47) + (field854 == 0 & client.field299 % 40 < 20 ? class38.method183(16776960) + class38.field791 : ""), field834 + 180 - 70, var119, 16777215, 0);
                var116 = var119 + 15;
                arg0.method3584(class174.field2603 + class208.method1753(field851) + (field854 == 1 & client.field299 % 40 < 20 ? class38.method183(16776960) + class38.field791 : ""), field834 + 180 - 108, var116, 16777215, 0);
                var116 += 15;
                int var48 = field834 + 180 - 80;
                short var49 = 321;
                Statics.field973.method3775(var48 - 73, var49 - 20);
                arg0.method3587(class174.field2409, var48, var49 + 5, 16777215, 0);
                int var50 = field834 + 180 + 80;
                Statics.field973.method3775(var50 - 73, var49 - 20);
                arg0.method3587(class174.field2419, var50, var49 + 5, 16777215, 0);
                short var51 = 357;
                arg1.method3587(class174.field2604, field834 + 180, var51, 16776960, 0);
            } else if (field860 == 3) {
                short var52 = 201;
                arg0.method3587(class174.field2599, field834 + 180, var52, 16776960, 0);
                int var120 = var52 + 20;
                arg1.method3587(class174.field2597, field834 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg1.method3587(class174.field2601, field834 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var53 = field834 + 180;
                short var54 = 276;
                Statics.field973.method3775(var53 - 73, var54 - 20);
                arg2.method3587(class174.field2602, var53, var54 + 5, 16777215, 0);
                int var55 = field834 + 180;
                short var56 = 326;
                Statics.field973.method3775(var55 - 73, var56 - 20);
                arg2.method3587(class174.field2536, var55, var56 + 5, 16777215, 0);
            } else if (field860 == 4) {
                arg0.method3587(class174.field2586, field834 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3587(field836, field834 + 180, var57, 16777215, 0);
                int var123 = var57 + 15;
                arg0.method3587(field848, field834 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                arg0.method3587(field843, field834 + 180, var124, 16777215, 0);
                int var125 = var124 + 15;
                arg0.method3584(class174.field2593 + class208.method1753(Statics.field937) + (client.field299 % 40 < 20 ? class38.method183(16776960) + class38.field791 : ""), field834 + 180 - 108, var125, 16777215, 0);
                int var126 = var125 - 8;
                arg0.method3584(class174.field2369, field834 + 180 - 9, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg0.method3584(class174.field2367, field834 + 180 - 9, var127, 16776960, 0);
                int var58 = field834 + 180 - 9 + arg0.method3575(class174.field2367) + 15;
                int var59 = var127 - arg0.field3103;
                class223 var60;
                if (field853) {
                    var60 = Statics.field3281;
                } else {
                    var60 = Statics.field770;
                }
                var60.method3775(var58, var59);
                var123 = var127 + 15;
                int var61 = field834 + 180 - 80;
                short var62 = 321;
                Statics.field973.method3775(var61 - 73, var62 - 20);
                arg0.method3587(class174.field2624, var61, var62 + 5, 16777215, 0);
                int var63 = field834 + 180 + 80;
                Statics.field973.method3775(var63 - 73, var62 - 20);
                arg0.method3587(class174.field2419, var63, var62 + 5, 16777215, 0);
                arg1.method3587(class174.field2477, field834 + 180, var62 + 36, 255, 0);
            } else if (field860 == 5) {
                arg0.method3587(class174.field2411, field834 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3587(field836, field834 + 180, var64, 16776960, 0);
                int var128 = var64 + 15;
                arg2.method3587(field848, field834 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg2.method3587(field843, field834 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var131 = var130 + 14;
                arg0.method3584(class174.field2606, field834 + 180 - 145, var131, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field850; arg0.method3575(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3584(class210.method3583(var66) + (client.field299 % 40 < 20 ? class38.method183(16776960) + class38.field791 : ""), field834 + 180 - 34, var131, 16777215, 0);
                var128 = var131 + 15;
                int var67 = field834 + 180 - 80;
                short var68 = 321;
                Statics.field973.method3775(var67 - 73, var68 - 20);
                arg0.method3587(class174.field2607, var67, var68 + 5, 16777215, 0);
                int var69 = field834 + 180 + 80;
                Statics.field973.method3775(var69 - 73, var68 - 20);
                arg0.method3587(class174.field2608, var69, var68 + 5, 16777215, 0);
            } else if (field860 == 6) {
                short var70 = 211;
                arg0.method3587(field836, field834 + 180, var70, 16776960, 0);
                int var132 = var70 + 15;
                arg0.method3587(field848, field834 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method3587(field843, field834 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var71 = field834 + 180;
                short var72 = 321;
                Statics.field973.method3775(var71 - 73, var72 - 20);
                arg0.method3587(class174.field2608, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field835 > 0) {
            int var73 = field835;
            short var74 = 256;
            field839 += var73 * 128;
            if (field839 > Statics.field22.length) {
                field839 -= Statics.field22.length;
                int var75 = (int) (Math.random() * 12.0D);
                method3565(Statics.field830[var75]);
            }
            int var76 = 0;
            int var77 = var73 * 128;
            int var78 = (var74 - var73) * 128;
            for (int var79 = 0; var79 < var78; var79++) {
                int var80 = Statics.field231[var76 + var77] - Statics.field22[field839 + var76 & Statics.field22.length - 1] * var73 / 6;
                if (var80 < 0) {
                    var80 = 0;
                }
                Statics.field231[var76++] = var80;
            }
            for (int var81 = var74 - var73; var81 < var74; var81++) {
                int var82 = var81 * 128;
                for (int var83 = 0; var83 < 128; var83++) {
                    int var84 = (int) (Math.random() * 100.0D);
                    if (var84 < 50 && var83 > 10 && var83 < 118) {
                        Statics.field231[var82 + var83] = 255;
                    } else {
                        Statics.field231[var82 + var83] = 0;
                    }
                }
            }
            if (field837 > 0) {
                field837 -= var73 * 4;
            }
            if (field849 > 0) {
                field849 -= var73 * 4;
            }
            if (field837 == 0 && field849 == 0) {
                int var85 = (int) (Math.random() * (double) (2000 / var73));
                if (var85 == 0) {
                    field837 = 1024;
                }
                if (var85 == 1) {
                    field849 = 1024;
                }
            }
            for (int var86 = 0; var86 < var74 - var73; var86++) {
                field852[var86] = field852[var73 + var86];
            }
            for (int var87 = var74 - var73; var87 < var74; var87++) {
                field852[var87] = (int) (Math.sin((double) field832 / 14.0D) * 16.0D + Math.sin((double) field832 / 15.0D) * 14.0D + Math.sin((double) field832 / 16.0D) * 12.0D);
                field832++;
            }
            field840 += var73 * -789349829;
            int var88 = ((client.field299 & 0x1) + var73) / 2;
            if (var88 > 0) {
                for (int var89 = 0; var89 < field840 * 305845996; var89++) {
                    int var90 = (int) (Math.random() * 124.0D) + 2;
                    int var91 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field231[(var91 << 7) + var90] = 192;
                }
                field840 = 0;
                int var92 = 0;
                label432: while (true) {
                    if (var92 >= var74) {
                        int var96 = 0;
                        while (true) {
                            if (var96 >= 128) {
                                break label432;
                            }
                            int var97 = 0;
                            for (int var98 = -var88; var98 < var74; var98++) {
                                int var99 = var98 * 128;
                                if (var88 + var98 < var74) {
                                    var97 += Statics.field932[var88 * 128 + var96 + var99];
                                }
                                if (var98 - (var88 + 1) >= 0) {
                                    var97 -= Statics.field932[var96 + var99 - (var88 + 1) * 128];
                                }
                                if (var98 >= 0) {
                                    Statics.field231[var96 + var99] = var97 / (var88 * 2 + 1);
                                }
                            }
                            var96++;
                        }
                    }
                    int var93 = 0;
                    int var94 = var92 * 128;
                    for (int var95 = -var88; var95 < 128; var95++) {
                        if (var88 + var95 < 128) {
                            var93 += Statics.field231[var94 + var95 + var88];
                        }
                        if (var95 - (var88 + 1) >= 0) {
                            var93 -= Statics.field231[var94 + var95 - (var88 + 1)];
                        }
                        if (var95 >= 0) {
                            Statics.field932[var94 + var95] = var93 / (var88 * 2 + 1);
                        }
                    }
                    var92++;
                }
            }
            field835 = 0;
        }
        Statics.method16();
        Statics.field1095[Statics.field36.field701 ? 1 : 0].method3775(field861 + 765 - 40, 463);
        if (client.field297 > 5 && client.field510 == 0) {
            if (Statics.field966 == null) {
                Statics.field966 = class226.method3667(Statics.field3087, "sl_button", "");
            } else {
                int var100 = field861 + 5;
                short var101 = 463;
                byte var102 = 100;
                byte var103 = 35;
                Statics.field966.method3775(var100, var101);
                arg0.method3587(class174.field2524 + " " + client.field290, var102 / 2 + var100, var103 / 2 + var101 - 2, 16777215, 0);
                if (Statics.field686 == null) {
                    arg1.method3587(class174.field2620, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                } else {
                    arg1.method3587(class174.field2639, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var104 = Statics.field782.getGraphics();
            Statics.field1210.method3675(var104, 0, 0);
        } catch (Exception var107) {
            Statics.field782.repaint();
        }
    }

    @ObfuscatedName("ap.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method846(String arg0, String arg1, String arg2) {
        field836 = arg0;
        field848 = arg1;
        field843 = arg2;
    }

    @ObfuscatedName("ge.k(Lhj;I)V")
    public static final void method3565(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field22.length; var2++) {
            Statics.field22[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field22[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field944[var8] = (Statics.field22[var8 - 1] + Statics.field22[var8 + 1] + Statics.field22[var8 - 128] + Statics.field22[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field22;
            Statics.field22 = Statics.field944;
            Statics.field944 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3199; var11++) {
            for (int var12 = 0; var12 < arg0.field3194; var12++) {
                if (arg0.field3195[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3196;
                    int var14 = var11 + 16 + arg0.field3197;
                    int var15 = (var14 << 7) + var13;
                    Statics.field22[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bf.z(IIIB)I")
    public static final int method1048(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ap.j(Ldu;I)V")
    public static void method849(class114 arg0) {
        if (class116.field1821 != 1 && Statics.field2048 || class116.field1821 != 4) {
            return;
        }
        int var1 = field861 + 280;
        if (class116.field1824 >= var1 && class116.field1824 <= var1 + 14 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(0, 0);
            return;
        }
        if (class116.field1824 >= var1 + 15 && class116.field1824 <= var1 + 80 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(0, 1);
            return;
        }
        int var2 = field861 + 390;
        if (class116.field1824 >= var2 && class116.field1824 <= var2 + 14 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(1, 0);
            return;
        }
        if (class116.field1824 >= var2 + 15 && class116.field1824 <= var2 + 80 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(1, 1);
            return;
        }
        int var3 = field861 + 500;
        if (class116.field1824 >= var3 && class116.field1824 <= var3 + 14 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(2, 0);
            return;
        }
        if (class116.field1824 >= var3 + 15 && class116.field1824 <= var3 + 80 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(2, 1);
            return;
        }
        int var4 = field861 + 610;
        if (class116.field1824 >= var4 && class116.field1824 <= var4 + 14 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(3, 0);
            return;
        }
        if (class116.field1824 >= var4 + 15 && class116.field1824 <= var4 + 80 && class116.field1826 >= 4 && class116.field1826 <= 18) {
            class30.method206(3, 1);
            return;
        }
        if (class116.field1824 >= field861 + 708 && class116.field1826 >= 4 && class116.field1824 <= field861 + 708 + 50 && class116.field1826 <= 20) {
            field857 = false;
            Statics.field831.method3858(field861, 0);
            Statics.field1767.method3858(field861 + 382, 0);
            Statics.field841.method3775(field861 + 382 - Statics.field841.field3194 / 2, 18);
            return;
        }
        if (field858 == -1) {
            return;
        }
        class30 var5 = Statics.field692[field858];
        method1847(var5);
        field857 = false;
        Statics.field831.method3858(field861, 0);
        Statics.field1767.method3858(field861 + 382, 0);
        Statics.field841.method3775(field861 + 382 - Statics.field841.field3194 / 2, 18);
        return;
    }

    @ObfuscatedName("dq.f(Laa;B)V")
    public static void method1847(class30 arg0) {
        if (arg0.method595() != client.field294) {
            client.field294 = arg0.method595();
            class199.method150(arg0.method595());
        }
        Statics.field1968 = arg0.field688;
        client.field290 = arg0.field685;
        client.field457 = arg0.field695;
        Statics.field238 = client.field429 == 0 ? 43594 : arg0.field685 + 40000;
        Statics.field813 = client.field429 == 0 ? 443 : arg0.field685 + 50000;
        Statics.field3088 = Statics.field238;
    }
}
