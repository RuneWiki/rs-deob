package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("aj")
public class class42 {

    @ObfuscatedName("aj.j")
    public static int field847 = 0;

    @ObfuscatedName("aj.r")
    public static int field856 = field847 + 202;

    @ObfuscatedName("aj.i")
    public static int[] field860 = new int[256];

    @ObfuscatedName("aj.p")
    public static int field859 = 0;

    @ObfuscatedName("aj.n")
    public static int field846 = 0;

    @ObfuscatedName("aj.aa")
    public static int field862 = 0;

    @ObfuscatedName("aj.af")
    public static int field880 = 0;

    @ObfuscatedName("aj.ax")
    public static int field864 = 0;

    @ObfuscatedName("aj.ah")
    public static int field863 = 0;

    @ObfuscatedName("aj.az")
    public static int field873 = 10;

    @ObfuscatedName("aj.at")
    public static String field867 = "";

    @ObfuscatedName("aj.ab")
    public static int field866 = 0;

    @ObfuscatedName("aj.ae")
    public static String field871 = "";

    @ObfuscatedName("aj.ao")
    public static String field870 = "";

    @ObfuscatedName("aj.am")
    public static String field857 = "";

    @ObfuscatedName("aj.ak")
    public static String field872 = "";

    @ObfuscatedName("aj.ay")
    public static String field865 = "";

    @ObfuscatedName("aj.aq")
    public static String field874 = "";

    @ObfuscatedName("aj.aj")
    public static class98 field875 = class98.field1641;

    @ObfuscatedName("aj.ac")
    public static boolean field876 = true;

    @ObfuscatedName("aj.av")
    public static int field877 = 0;

    @ObfuscatedName("aj.as")
    public static String field878 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aj.al")
    public static String field879 = "1234567890";

    @ObfuscatedName("aj.aw")
    public static boolean field850 = false;

    @ObfuscatedName("aj.bt")
    public static int field849 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gm.x(Lgk;Lgk;I)I")
    public static int method3251(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3116("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3116("logo", "")) {
            var2++;
        }
        if (arg1.method3116("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3116("titlebox", "")) {
            var2++;
        }
        if (arg1.method3116("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3116("runes", "")) {
            var2++;
        }
        if (arg1.method3116("title_mute", "")) {
            var2++;
        }
        if (arg1.method3117("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3117("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3116("sl_back", "");
        arg1.method3116("sl_flags", "");
        arg1.method3116("sl_arrows", "");
        arg1.method3116("sl_stars", "");
        arg1.method3116("sl_button", "");
        return var2;
    }

    @ObfuscatedName("db.j(Ljava/awt/Component;Lgk;Lgk;ZII)V")
    public static void method1949(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field869) {
            field866 = arg4;
            class220.method3809();
            byte[] var5 = arg1.method3115("title.jpg", "");
            Statics.field881 = new class225(var5, arg0);
            Statics.field851 = Statics.field881.method3957();
            if ((client.field375 & 0x20000000) == 0) {
                Statics.field2764 = class226.method601(arg2, "logo", "");
            } else {
                Statics.field2764 = class226.method601(arg2, "logo_deadman_mode", "");
            }
            Statics.field883 = class226.method601(arg2, "titlebox", "");
            Statics.field848 = class226.method601(arg2, "titlebutton", "");
            Statics.field3096 = class226.method16(arg2, "runes", "");
            Statics.field1311 = class226.method16(arg2, "title_mute", "");
            Statics.field852 = class226.method601(arg2, "options_radio_buttons,0", "");
            Statics.field853 = class226.method601(arg2, "options_radio_buttons,2", "");
            Statics.field84 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field84[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field84[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field84[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field84[var9 + 192] = 16777215;
            }
            Statics.field2649 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2649[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2649[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2649[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2649[var13 + 192] = 16777215;
            }
            Statics.field858 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field858[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field858[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field858[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field858[var17 + 192] = 16777215;
            }
            Statics.field72 = new int[256];
            Statics.field808 = new int[32768];
            Statics.field861 = new int[32768];
            method687((class223) null);
            Statics.field49 = new int[32768];
            Statics.field2131 = new int[32768];
            if (arg3) {
                field865 = "";
                field874 = "";
            }
            Statics.field782 = 0;
            Statics.field2021 = "";
            field876 = true;
            field850 = false;
            if (Statics.field85.field713) {
                class139.method1510(2);
            } else {
                class185 var18 = Statics.field40;
                int var19 = var18.method3113("scape main");
                int var20 = var18.method3114(var19, "");
                class139.field1921 = 1;
                Statics.field1917 = var18;
                Statics.field1923 = var19;
                Statics.field87 = var20;
                Statics.field246 = 255;
                Statics.field1924 = false;
                Statics.field303 = 2;
            }
            Statics.method861(false);
            Statics.field869 = true;
            field847 = (Statics.field1749 - client.field529) / 2;
            field856 = field847 + 202;
            Statics.field881.method3901(field847, 0);
            Statics.field851.method3901(field847 + 382, 0);
            Statics.field2764.method3855(field847 + 382 - Statics.field2764.field3210 / 2, 18);
        } else if (arg4 == 4) {
            field866 = 4;
        }
    }

    @ObfuscatedName("f.c(I)V")
    public static void method214() {
        if (!Statics.field869) {
            return;
        }
        Statics.field883 = null;
        Statics.field848 = null;
        Statics.field3096 = null;
        Statics.field881 = null;
        Statics.field851 = null;
        Statics.field2764 = null;
        Statics.field1311 = null;
        Statics.field852 = null;
        Statics.field853 = null;
        Statics.field80 = null;
        Statics.field1858 = null;
        Statics.field1661 = null;
        Statics.field772 = null;
        Statics.field596 = null;
        Statics.field84 = null;
        Statics.field2649 = null;
        Statics.field858 = null;
        Statics.field72 = null;
        Statics.field808 = null;
        Statics.field861 = null;
        Statics.field49 = null;
        Statics.field2131 = null;
        class139.method1510(2);
        Statics.method861(true);
        Statics.field869 = false;
    }

    @ObfuscatedName("dx.d(Ldx;B)V")
    public static void method2086(class114 arg0) {
        if (!field850) {
            if ((class116.field1814 == 1 || !Statics.field3077 && class116.field1814 == 4) && class116.field1815 >= field847 + 765 - 50 && class116.field1816 >= 453) {
                Statics.field85.field713 = !Statics.field85.field713;
                class31.method11();
                if (Statics.field85.field713) {
                    Statics.field1920.method2378();
                    class139.field1921 = 1;
                    Statics.field1917 = null;
                } else {
                    class185 var6 = Statics.field40;
                    int var7 = var6.method3113("scape main");
                    int var8 = var6.method3114(var7, "");
                    Statics.method808(var6, var7, var8, 255, false);
                }
            }
            if (client.field318 != 5) {
                field864++;
                if (client.field318 == 10 || client.field318 == 11) {
                    if (client.field410 == 0) {
                        if (class116.field1814 == 1 || !Statics.field3077 && class116.field1814 == 4) {
                            int var9 = field847 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class116.field1815 >= var9 && class116.field1815 <= var9 + var11 && class116.field1816 >= var10 && class116.field1816 <= var10 + var12) {
                                if (class30.method1988()) {
                                    field850 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field702 != null) {
                            method1941();
                        }
                    }
                    int var13 = class116.field1814;
                    int var14 = class116.field1815;
                    int var15 = class116.field1816;
                    if (!Statics.field3077 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field866 == 0) {
                        boolean var16 = false;
                        while (class106.method1508()) {
                            if (Statics.field1203 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field856 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            class115.method2013(client.method1511("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var19 = field856 + 180 + 80;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field375 & 0x2000000) != 0) {
                                field871 = "";
                                field870 = class174.field2566;
                                field857 = class174.field2567;
                                field872 = class174.field2623;
                                field866 = 1;
                                field877 = 0;
                            } else if ((client.field375 & 0x4) != 0) {
                                if ((client.field375 & 0x400) == 0) {
                                    field870 = class174.field2557;
                                    field857 = class174.field2350;
                                    field872 = class174.field2559;
                                } else {
                                    field870 = class174.field2563;
                                    field857 = class174.field2564;
                                    field872 = class174.field2538;
                                }
                                field871 = class174.field2556;
                                field866 = 1;
                                field877 = 0;
                            } else if ((client.field375 & 0x400) == 0) {
                                field870 = class174.field2553;
                                field857 = class174.field2554;
                                field872 = class174.field2555;
                                field866 = 2;
                                field877 = 0;
                            } else {
                                field870 = class174.field2560;
                                field857 = class174.field2561;
                                field872 = class174.field2410;
                                field871 = class174.field2556;
                                field866 = 1;
                                field877 = 0;
                            }
                        }
                    } else if (field866 == 1) {
                        while (class106.method1508()) {
                            if (Statics.field1203 == 84) {
                                field870 = class174.field2553;
                                field857 = class174.field2554;
                                field872 = class174.field2555;
                                field866 = 2;
                                field877 = 0;
                            } else if (Statics.field1203 == 13) {
                                field866 = 0;
                            }
                        }
                        int var20 = field856 + 180 - 80;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field870 = class174.field2553;
                            field857 = class174.field2554;
                            field872 = class174.field2555;
                            field866 = 2;
                            field877 = 0;
                        }
                        int var22 = field856 + 180 + 80;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field866 = 0;
                        }
                    } else if (field866 == 2) {
                        short var23 = 231;
                        int var45 = var23 + 30;
                        if (var13 == 1 && var15 >= var45 - 15 && var15 < var45) {
                            field877 = 0;
                        }
                        var45 += 15;
                        if (var13 == 1 && var15 >= var45 - 15 && var15 < var45) {
                            field877 = 1;
                        }
                        var45 += 15;
                        short var24 = 361;
                        if (var13 == 1 && var15 >= var24 - 15 && var15 < var24) {
                            method68(class174.field2468, class174.field2593, class174.field2594);
                            field866 = 5;
                            return;
                        }
                        int var25 = field856 + 180 - 80;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field865 = field865.trim();
                            if (field865.length() == 0) {
                                method68(class174.field2394, class174.field2455, class174.field2344);
                                return;
                            }
                            if (field874.length() == 0) {
                                method68(class174.field2462, class174.field2591, class174.field2590);
                                return;
                            }
                            method68(class174.field2571, class174.field2572, class174.field2609);
                            field875 = Statics.field85.field723.containsKey(class208.method2622(field865)) ? class98.field1639 : class98.field1641;
                            client.method3241(20);
                            return;
                        }
                        int var27 = field856 + 180 + 80;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field866 = 0;
                            field865 = "";
                            field874 = "";
                            Statics.field782 = 0;
                            Statics.field2021 = "";
                            field876 = true;
                        }
                        while (true) {
                            while (class106.method1508()) {
                                boolean var28 = false;
                                for (int var29 = 0; var29 < field878.length(); var29++) {
                                    if (Statics.field2109 == field878.charAt(var29)) {
                                        var28 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1203 == 13) {
                                    field866 = 0;
                                    field865 = "";
                                    field874 = "";
                                    Statics.field782 = 0;
                                    Statics.field2021 = "";
                                    field876 = true;
                                } else if (field877 == 0) {
                                    if (Statics.field1203 == 85 && field865.length() > 0) {
                                        field865 = field865.substring(0, field865.length() - 1);
                                    }
                                    if (Statics.field1203 == 84 || Statics.field1203 == 80) {
                                        field877 = 1;
                                    }
                                    if (var28 && field865.length() < 320) {
                                        field865 = field865 + Statics.field2109;
                                    }
                                } else if (field877 == 1) {
                                    if (Statics.field1203 == 85 && field874.length() > 0) {
                                        field874 = field874.substring(0, field874.length() - 1);
                                    }
                                    if (Statics.field1203 == 84 || Statics.field1203 == 80) {
                                        field877 = 0;
                                    }
                                    if (Statics.field1203 == 84) {
                                        field865 = field865.trim();
                                        if (field865.length() == 0) {
                                            method68(class174.field2394, class174.field2455, class174.field2344);
                                            return;
                                        }
                                        if (field874.length() == 0) {
                                            method68(class174.field2462, class174.field2591, class174.field2590);
                                            return;
                                        }
                                        method68(class174.field2571, class174.field2572, class174.field2609);
                                        field875 = Statics.field85.field723.containsKey(class208.method2622(field865)) ? class98.field1639 : class98.field1641;
                                        client.method3241(20);
                                        return;
                                    }
                                    if (var28 && field874.length() < 20) {
                                        field874 = field874 + Statics.field2109;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field866 == 3) {
                        int var30 = field856 + 180;
                        short var31 = 276;
                        if (var13 == 1 && var14 >= var30 - 75 && var14 <= var30 + 75 && var15 >= var31 - 20 && var15 <= var31 + 20) {
                            field870 = class174.field2553;
                            field857 = class174.field2554;
                            field872 = class174.field2555;
                            field866 = 2;
                            field877 = 0;
                        }
                        int var32 = field856 + 180;
                        short var33 = 326;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var33 - 20 && var15 <= var33 + 20) {
                            method68(class174.field2468, class174.field2593, class174.field2594);
                            field866 = 5;
                            return;
                        }
                    } else if (field866 == 4) {
                        int var34 = field856 + 180 - 80;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            Statics.field2021.trim();
                            if (Statics.field2021.length() != 6) {
                                method68(class174.field2523, class174.field2568, class174.field2380);
                                return;
                            }
                            Statics.field782 = Integer.parseInt(Statics.field2021);
                            Statics.field2021 = "";
                            field875 = field876 ? class98.field1640 : class98.field1646;
                            method68(class174.field2571, class174.field2572, class174.field2609);
                            client.method3241(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field856 + 180 - 9 && var14 <= field856 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field876 = !field876;
                        }
                        if (var13 == 1 && var14 >= field856 + 180 - 34 && var14 <= field856 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class115.method2013(client.method1511("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var36 = field856 + 180 + 80;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field866 = 0;
                            field865 = "";
                            field874 = "";
                            Statics.field782 = 0;
                            Statics.field2021 = "";
                        }
                        while (class106.method1508()) {
                            boolean var37 = false;
                            for (int var38 = 0; var38 < field879.length(); var38++) {
                                if (Statics.field2109 == field879.charAt(var38)) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (Statics.field1203 == 13) {
                                field866 = 0;
                                field865 = "";
                                field874 = "";
                                Statics.field782 = 0;
                                Statics.field2021 = "";
                            } else {
                                if (Statics.field1203 == 85 && Statics.field2021.length() > 0) {
                                    Statics.field2021 = Statics.field2021.substring(0, Statics.field2021.length() - 1);
                                }
                                if (Statics.field1203 == 84) {
                                    Statics.field2021.trim();
                                    if (Statics.field2021.length() != 6) {
                                        method68(class174.field2523, class174.field2568, class174.field2380);
                                        return;
                                    }
                                    Statics.field782 = Integer.parseInt(Statics.field2021);
                                    Statics.field2021 = "";
                                    field875 = field876 ? class98.field1640 : class98.field1646;
                                    method68(class174.field2571, class174.field2572, class174.field2609);
                                    client.method3241(20);
                                    return;
                                }
                                if (var37 && Statics.field2021.length() < 6) {
                                    Statics.field2021 = Statics.field2021 + Statics.field2109;
                                }
                            }
                        }
                    } else if (field866 == 5) {
                        int var39 = field856 + 180 - 80;
                        short var40 = 321;
                        if (var13 == 1 && var14 >= var39 - 75 && var14 <= var39 + 75 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                            method211();
                            return;
                        }
                        int var41 = field856 + 180 + 80;
                        if (var13 == 1 && var14 >= var41 - 75 && var14 <= var41 + 75 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                            field870 = class174.field2553;
                            field857 = class174.field2554;
                            field872 = class174.field2555;
                            field866 = 2;
                            field877 = 0;
                            field874 = "";
                        }
                        while (class106.method1508()) {
                            boolean var42 = false;
                            for (int var43 = 0; var43 < field878.length(); var43++) {
                                if (Statics.field2109 == field878.charAt(var43)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (Statics.field1203 == 13) {
                                field870 = class174.field2553;
                                field857 = class174.field2554;
                                field872 = class174.field2555;
                                field866 = 2;
                                field877 = 0;
                                field874 = "";
                            } else {
                                if (Statics.field1203 == 85 && field865.length() > 0) {
                                    field865 = field865.substring(0, field865.length() - 1);
                                }
                                if (Statics.field1203 == 84) {
                                    method211();
                                    return;
                                }
                                if (var42 && field865.length() < 320) {
                                    field865 = field865 + Statics.field2109;
                                }
                            }
                        }
                    } else if (field866 == 6) {
                        while (true) {
                            do {
                                if (!class106.method1508()) {
                                    short var44 = 321;
                                    if (var13 == 1 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                                        field870 = class174.field2553;
                                        field857 = class174.field2554;
                                        field872 = class174.field2555;
                                        field866 = 2;
                                        field877 = 0;
                                        field874 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field1203 != 84 && Statics.field1203 != 13);
                            field870 = class174.field2553;
                            field857 = class174.field2554;
                            field872 = class174.field2555;
                            field866 = 2;
                            field877 = 0;
                            field874 = "";
                        }
                    }
                }
            }
        } else if (class116.field1814 == 1 || !Statics.field3077 && class116.field1814 == 4) {
            int var1 = field847 + 280;
            if (class116.field1815 >= var1 && class116.field1815 <= var1 + 14 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                class30.method1135(0, 0);
            } else if (class116.field1815 >= var1 + 15 && class116.field1815 <= var1 + 80 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                class30.method1135(0, 1);
            } else {
                int var2 = field847 + 390;
                if (class116.field1815 >= var2 && class116.field1815 <= var2 + 14 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                    class30.method1135(1, 0);
                } else if (class116.field1815 >= var2 + 15 && class116.field1815 <= var2 + 80 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                    class30.method1135(1, 1);
                } else {
                    int var3 = field847 + 500;
                    if (class116.field1815 >= var3 && class116.field1815 <= var3 + 14 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                        class30.method1135(2, 0);
                    } else if (class116.field1815 >= var3 + 15 && class116.field1815 <= var3 + 80 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                        class30.method1135(2, 1);
                    } else {
                        int var4 = field847 + 610;
                        if (class116.field1815 >= var4 && class116.field1815 <= var4 + 14 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                            class30.method1135(3, 0);
                        } else if (class116.field1815 >= var4 + 15 && class116.field1815 <= var4 + 80 && class116.field1816 >= 4 && class116.field1816 <= 18) {
                            class30.method1135(3, 1);
                        } else if (class116.field1815 >= field847 + 708 && class116.field1816 >= 4 && class116.field1815 <= field847 + 708 + 50 && class116.field1816 <= 20) {
                            field850 = false;
                            Statics.field881.method3901(field847, 0);
                            Statics.field851.method3901(field847 + 382, 0);
                            Statics.field2764.method3855(field847 + 382 - Statics.field2764.field3210 / 2, 18);
                        } else if (field849 != -1) {
                            class30 var5 = Statics.field704[field849];
                            method1433(var5);
                            field850 = false;
                            Statics.field881.method3901(field847, 0);
                            Statics.field851.method3901(field847 + 382, 0);
                            Statics.field2764.method3855(field847 + 382 - Statics.field2764.field3210 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.w(I)V")
    public static void method211() {
        field865 = field865.trim();
        if (field865.length() == 0) {
            method68(class174.field2468, class174.field2593, class174.field2594);
            return;
        }
        long var0 = class37.method108();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class37.method171(var0, field865);
        }
        switch(var2) {
            case 2:
                method68(class174.field2595, class174.field2596, class174.field2597);
                field866 = 6;
                break;
            case 3:
                method68(class174.field2598, class174.field2599, class174.field2514);
                break;
            case 4:
                method68(class174.field2608, class174.field2602, class174.field2603);
                break;
            case 5:
                method68(class174.field2604, class174.field2478, class174.field2606);
                break;
            case 6:
                method68(class174.field2607, class174.field2379, class174.field2348);
                break;
            case 7:
                method68(class174.field2610, class174.field2605, class174.field2612);
        }
    }

    @ObfuscatedName("dq.u(Lhf;Lhf;Lhf;ZI)V")
    public static void method2091(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field847 = (Statics.field1749 - client.field529) / 2;
            field856 = field847 + 202;
        }
        if (field850) {
            if (Statics.field80 == null) {
                Statics.field80 = class226.method2540(Statics.field3, "sl_back", "");
            }
            if (Statics.field1858 == null) {
                Statics.field1858 = class226.method16(Statics.field3, "sl_flags", "");
            }
            if (Statics.field1661 == null) {
                Statics.field1661 = class226.method16(Statics.field3, "sl_arrows", "");
            }
            if (Statics.field772 == null) {
                Statics.field772 = class226.method16(Statics.field3, "sl_stars", "");
            }
            class220.method3807(field847, 23, 765, 480, 0);
            class220.method3788(field847, 0, 125, 23, 12425273, 9135624);
            class220.method3788(field847 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3743(class174.field2613, field847 + 62, 15, 0, -1);
            if (Statics.field772 != null) {
                Statics.field772[1].method3855(field847 + 140, 1);
                arg1.method3668(class174.field2562, field847 + 152, 10, 16777215, -1);
                Statics.field772[0].method3855(field847 + 140, 12);
                arg1.method3668(class174.field2443, field847 + 152, 21, 16777215, -1);
            }
            if (Statics.field1661 != null) {
                int var4 = field847 + 280;
                if (class30.field695[0] == 0 && class30.field709[0] == 0) {
                    Statics.field1661[2].method3855(var4, 4);
                } else {
                    Statics.field1661[0].method3855(var4, 4);
                }
                if (class30.field695[0] == 0 && class30.field709[0] == 1) {
                    Statics.field1661[3].method3855(var4 + 15, 4);
                } else {
                    Statics.field1661[1].method3855(var4 + 15, 4);
                }
                arg0.method3668(class174.field2616, var4 + 32, 17, 16777215, -1);
                int var5 = field847 + 390;
                if (class30.field695[0] == 1 && class30.field709[0] == 0) {
                    Statics.field1661[2].method3855(var5, 4);
                } else {
                    Statics.field1661[0].method3855(var5, 4);
                }
                if (class30.field695[0] == 1 && class30.field709[0] == 1) {
                    Statics.field1661[3].method3855(var5 + 15, 4);
                } else {
                    Statics.field1661[1].method3855(var5 + 15, 4);
                }
                arg0.method3668(class174.field2445, var5 + 32, 17, 16777215, -1);
                int var6 = field847 + 500;
                if (class30.field695[0] == 2 && class30.field709[0] == 0) {
                    Statics.field1661[2].method3855(var6, 4);
                } else {
                    Statics.field1661[0].method3855(var6, 4);
                }
                if (class30.field695[0] == 2 && class30.field709[0] == 1) {
                    Statics.field1661[3].method3855(var6 + 15, 4);
                } else {
                    Statics.field1661[1].method3855(var6 + 15, 4);
                }
                arg0.method3668(class174.field2618, var6 + 32, 17, 16777215, -1);
                int var7 = field847 + 610;
                if (class30.field695[0] == 3 && class30.field709[0] == 0) {
                    Statics.field1661[2].method3855(var7, 4);
                } else {
                    Statics.field1661[0].method3855(var7, 4);
                }
                if (class30.field695[0] == 3 && class30.field709[0] == 1) {
                    Statics.field1661[3].method3855(var7 + 15, 4);
                } else {
                    Statics.field1661[1].method3855(var7 + 15, 4);
                }
                arg0.method3668(class174.field2619, var7 + 32, 17, 16777215, -1);
            }
            class220.method3807(field847 + 708, 4, 50, 16, 0);
            arg1.method3743(class174.field2581, field847 + 708 + 25, 16, 16777215, -1);
            field849 = -1;
            if (Statics.field80 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field698) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field698) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field698) {
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
                int var19 = field847 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class30.field698; var22++) {
                    class30 var23 = Statics.field704[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field705);
                    if (var23.field705 == -1) {
                        var25 = class174.field2620;
                        var24 = false;
                    } else if (var23.field705 > 1980) {
                        var25 = class174.field2378;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method630()) {
                        if (var23.method672()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method662()) {
                        var26 = 16711680;
                        if (var23.method672()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method631()) {
                        if (var23.method672()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method672()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1808 >= var19 && class116.field1802 * 1476935015 >= var18 && class116.field1808 < var8 + var19 && class116.field1802 * 1476935015 < var9 + var18 && var24) {
                        field849 = var22;
                        Statics.field80[var27].method3907(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field80[var27].method3901(var19, var18);
                    }
                    if (Statics.field1858 != null) {
                        Statics.field1858[(var23.method672() ? 8 : 0) + var23.field708].method3855(var19 + 29, var18);
                    }
                    arg0.method3743(Integer.toString(var23.field703), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3743(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3663(Statics.field704[field849].field707) + 6;
                    int var29 = arg1.field3121 + 8;
                    class220.method3807(class116.field1808 - var28 / 2, class116.field1802 * 1476935015 + 20 + 5, var28, var29, 16777120);
                    class220.method3789(class116.field1808 - var28 / 2, class116.field1802 * 1476935015 + 20 + 5, var28, var29, 0);
                    arg1.method3743(Statics.field704[field849].field707, class116.field1808, class116.field1802 * 1476935015 + 20 + 5 + arg1.field3121 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field1844.getGraphics();
                Statics.field1580.method3765(var30, 0, 0);
            } catch (Exception var118) {
                Statics.field1844.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field881.method3901(field847, 0);
            Statics.field851.method3901(field847 + 382, 0);
            Statics.field2764.method3855(field847 + 382 - Statics.field2764.field3210 / 2, 18);
        }
        if (client.field318 == 0 || client.field318 == 5) {
            byte var32 = 20;
            arg0.method3743(class174.field2569, field856 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3789(field856 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3789(field856 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3807(field856 + 180 - 150, var33 + 2, field873 * 3, 30, 9179409);
            class220.method3807(field873 * 3 + (field856 + 180 - 150), var33 + 2, 300 - field873 * 3, 30, 0);
            arg0.method3743(field867, field856 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field318 == 20) {
            Statics.field883.method3855(field856 + 180 - Statics.field883.field3210 / 2, 271 - Statics.field883.field3211 / 2);
            short var34 = 211;
            arg0.method3743(field870, field856 + 180, var34, 16776960, 0);
            int var120 = var34 + 15;
            arg0.method3743(field857, field856 + 180, var120, 16776960, 0);
            int var121 = var120 + 15;
            arg0.method3743(field872, field856 + 180, var121, 16776960, 0);
            int var122 = var121 + 15;
            int var123 = var122 + 10;
            if (field866 != 4) {
                arg0.method3668(class174.field2574, field856 + 180 - 110, var123, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field865; arg0.method3663(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3668(class210.method3667(var36), field856 + 180 - 70, var123, 16777215, 0);
                var120 = var123 + 15;
                String var38 = class174.field2388;
                String var39 = field874;
                String var40 = class208.method173('*', var39.length());
                arg0.method3668(var38 + var40, field856 + 180 - 108, var120, 16777215, 0);
                var120 += 15;
            }
        }
        if (client.field318 == 10 || client.field318 == 11) {
            Statics.field883.method3855(field856, 171);
            if (field866 == 0) {
                short var41 = 251;
                arg0.method3743(class174.field2577, field856 + 180, var41, 16776960, 0);
                int var124 = var41 + 30;
                int var42 = field856 + 180 - 80;
                short var43 = 291;
                Statics.field848.method3855(var42 - 73, var43 - 20);
                arg0.method3697(class174.field2470, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field856 + 180 + 80;
                Statics.field848.method3855(var44 - 73, var43 - 20);
                arg0.method3697(class174.field2579, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field866 == 1) {
                arg0.method3743(field871, field856 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3743(field870, field856 + 180, var45, 16777215, 0);
                int var125 = var45 + 15;
                arg0.method3743(field857, field856 + 180, var125, 16777215, 0);
                int var126 = var125 + 15;
                arg0.method3743(field872, field856 + 180, var126, 16777215, 0);
                int var127 = var126 + 15;
                int var46 = field856 + 180 - 80;
                short var47 = 321;
                Statics.field848.method3855(var46 - 73, var47 - 20);
                arg0.method3743(class174.field2375, var46, var47 + 5, 16777215, 0);
                int var48 = field856 + 180 + 80;
                Statics.field848.method3855(var48 - 73, var47 - 20);
                arg0.method3743(class174.field2581, var48, var47 + 5, 16777215, 0);
            } else if (field866 == 2) {
                short var49 = 211;
                arg0.method3743(field870, field856 + 180, var49, 16776960, 0);
                int var128 = var49 + 15;
                arg0.method3743(field857, field856 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3743(field872, field856 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var131 = var130 + 10;
                arg0.method3668(class174.field2574, field856 + 180 - 110, var131, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field865; arg0.method3663(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3668(class210.method3667(var51) + (field877 == 0 & client.field320 % 40 < 20 ? class38.method2134(16776960) + class38.field816 : ""), field856 + 180 - 70, var131, 16777215, 0);
                var128 = var131 + 15;
                String var53 = class174.field2388;
                String var54 = field874;
                String var55 = class208.method173('*', var54.length());
                arg0.method3668(var53 + var55 + (field877 == 1 & client.field320 % 40 < 20 ? class38.method2134(16776960) + class38.field816 : ""), field856 + 180 - 108, var128, 16777215, 0);
                var128 += 15;
                int var56 = field856 + 180 - 80;
                short var57 = 321;
                Statics.field848.method3855(var56 - 73, var57 - 20);
                arg0.method3743(class174.field2580, var56, var57 + 5, 16777215, 0);
                int var58 = field856 + 180 + 80;
                Statics.field848.method3855(var58 - 73, var57 - 20);
                arg0.method3743(class174.field2581, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                arg1.method3743(class174.field2587, field856 + 180, var59, 16776960, 0);
            } else if (field866 == 3) {
                short var60 = 201;
                arg0.method3743(class174.field2422, field856 + 180, var60, 16776960, 0);
                int var132 = var60 + 20;
                arg1.method3743(class174.field2583, field856 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg1.method3743(class174.field2400, field856 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var61 = field856 + 180;
                short var62 = 276;
                Statics.field848.method3855(var61 - 73, var62 - 20);
                arg2.method3743(class174.field2508, var61, var62 + 5, 16777215, 0);
                int var63 = field856 + 180;
                short var64 = 326;
                Statics.field848.method3855(var63 - 73, var64 - 20);
                arg2.method3743(class174.field2493, var63, var64 + 5, 16777215, 0);
            } else if (field866 == 4) {
                arg0.method3743(class174.field2529, field856 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3743(field870, field856 + 180, var65, 16777215, 0);
                int var135 = var65 + 15;
                arg0.method3743(field857, field856 + 180, var135, 16777215, 0);
                int var136 = var135 + 15;
                arg0.method3743(field872, field856 + 180, var136, 16777215, 0);
                int var137 = var136 + 15;
                String var67 = class174.field2576;
                String var68 = Statics.field2021;
                String var69 = class208.method173('*', var68.length());
                arg0.method3668(var67 + var69 + (client.field320 % 40 < 20 ? class38.method2134(16776960) + class38.field816 : ""), field856 + 180 - 108, var137, 16777215, 0);
                int var138 = var137 - 8;
                arg0.method3668(class174.field2352, field856 + 180 - 9, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method3668(class174.field2353, field856 + 180 - 9, var139, 16776960, 0);
                int var70 = field856 + 180 - 9 + arg0.method3663(class174.field2353) + 15;
                int var71 = var139 - arg0.field3121;
                class223 var72;
                if (field876) {
                    var72 = Statics.field853;
                } else {
                    var72 = Statics.field852;
                }
                var72.method3855(var70, var71);
                var135 = var139 + 15;
                int var73 = field856 + 180 - 80;
                short var74 = 321;
                Statics.field848.method3855(var73 - 73, var74 - 20);
                arg0.method3743(class174.field2375, var73, var74 + 5, 16777215, 0);
                int var75 = field856 + 180 + 80;
                Statics.field848.method3855(var75 - 73, var74 - 20);
                arg0.method3743(class174.field2581, var75, var74 + 5, 16777215, 0);
                arg1.method3743(class174.field2463, field856 + 180, var74 + 36, 255, 0);
            } else if (field866 == 5) {
                arg0.method3743(class174.field2588, field856 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3743(field870, field856 + 180, var76, 16776960, 0);
                int var140 = var76 + 15;
                arg2.method3743(field857, field856 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg2.method3743(field872, field856 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var143 = var142 + 14;
                arg0.method3668(class174.field2589, field856 + 180 - 145, var143, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field865; arg0.method3663(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3668(class210.method3667(var78) + (client.field320 % 40 < 20 ? class38.method2134(16776960) + class38.field816 : ""), field856 + 180 - 34, var143, 16777215, 0);
                var140 = var143 + 15;
                int var79 = field856 + 180 - 80;
                short var80 = 321;
                Statics.field848.method3855(var79 - 73, var80 - 20);
                arg0.method3743(class174.field2488, var79, var80 + 5, 16777215, 0);
                int var81 = field856 + 180 + 80;
                Statics.field848.method3855(var81 - 73, var80 - 20);
                arg0.method3743(class174.field2578, var81, var80 + 5, 16777215, 0);
            } else if (field866 == 6) {
                short var82 = 211;
                arg0.method3743(field870, field856 + 180, var82, 16776960, 0);
                int var144 = var82 + 15;
                arg0.method3743(field857, field856 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg0.method3743(field872, field856 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var83 = field856 + 180;
                short var84 = 321;
                Statics.field848.method3855(var83 - 73, var84 - 20);
                arg0.method3743(class174.field2578, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field864 > 0) {
            int var85 = field864;
            short var86 = 256;
            field862 += var85 * 128;
            if (field862 > Statics.field808.length) {
                field862 -= Statics.field808.length;
                int var87 = (int) (Math.random() * 12.0D);
                method687(Statics.field3096[var87]);
            }
            int var88 = 0;
            int var89 = var85 * 128;
            int var90 = (var86 - var85) * 128;
            for (int var91 = 0; var91 < var90; var91++) {
                int var92 = Statics.field49[var88 + var89] - Statics.field808[field862 + var88 & Statics.field808.length - 1] * var85 / 6;
                if (var92 < 0) {
                    var92 = 0;
                }
                Statics.field49[var88++] = var92;
            }
            for (int var93 = var86 - var85; var93 < var86; var93++) {
                int var94 = var93 * 128;
                for (int var95 = 0; var95 < 128; var95++) {
                    int var96 = (int) (Math.random() * 100.0D);
                    if (var96 < 50 && var95 > 10 && var95 < 118) {
                        Statics.field49[var94 + var95] = 255;
                    } else {
                        Statics.field49[var94 + var95] = 0;
                    }
                }
            }
            if (field859 > 0) {
                field859 -= var85 * 4;
            }
            if (field846 > 0) {
                field846 -= var85 * 4;
            }
            if (field859 == 0 && field846 == 0) {
                int var97 = (int) (Math.random() * (double) (2000 / var85));
                if (var97 == 0) {
                    field859 = 1024;
                }
                if (var97 == 1) {
                    field846 = 1024;
                }
            }
            for (int var98 = 0; var98 < var86 - var85; var98++) {
                field860[var98] = field860[var85 + var98];
            }
            for (int var99 = var86 - var85; var99 < var86; var99++) {
                field860[var99] = (int) (Math.sin((double) field863 / 14.0D) * 16.0D + Math.sin((double) field863 / 15.0D) * 14.0D + Math.sin((double) field863 / 16.0D) * 12.0D);
                field863++;
            }
            field880 += var85 * -1400666245;
            int var100 = ((client.field320 & 0x1) + var85) / 2;
            if (var100 > 0) {
                for (int var101 = 0; var101 < field880 * 541385196; var101++) {
                    int var102 = (int) (Math.random() * 124.0D) + 2;
                    int var103 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field49[(var103 << 7) + var102] = 192;
                }
                field880 = 0;
                int var104 = 0;
                label432: while (true) {
                    if (var104 >= var86) {
                        int var108 = 0;
                        while (true) {
                            if (var108 >= 128) {
                                break label432;
                            }
                            int var109 = 0;
                            for (int var110 = -var100; var110 < var86; var110++) {
                                int var111 = var110 * 128;
                                if (var100 + var110 < var86) {
                                    var109 += Statics.field2131[var100 * 128 + var108 + var111];
                                }
                                if (var110 - (var100 + 1) >= 0) {
                                    var109 -= Statics.field2131[var108 + var111 - (var100 + 1) * 128];
                                }
                                if (var110 >= 0) {
                                    Statics.field49[var108 + var111] = var109 / (var100 * 2 + 1);
                                }
                            }
                            var108++;
                        }
                    }
                    int var105 = 0;
                    int var106 = var104 * 128;
                    for (int var107 = -var100; var107 < 128; var107++) {
                        if (var100 + var107 < 128) {
                            var105 += Statics.field49[var106 + var107 + var100];
                        }
                        if (var107 - (var100 + 1) >= 0) {
                            var105 -= Statics.field49[var106 + var107 - (var100 + 1)];
                        }
                        if (var107 >= 0) {
                            Statics.field2131[var106 + var107] = var105 / (var100 * 2 + 1);
                        }
                    }
                    var104++;
                }
            }
            field864 = 0;
        }
        method3063();
        Statics.field1311[Statics.field85.field713 ? 1 : 0].method3855(field847 + 765 - 40, 463);
        if (client.field318 > 5 && client.field410 == 0) {
            if (Statics.field596 == null) {
                Statics.field596 = class226.method601(Statics.field3, "sl_button", "");
            } else {
                int var112 = field847 + 5;
                short var113 = 463;
                byte var114 = 100;
                byte var115 = 35;
                Statics.field596.method3855(var112, var113);
                arg0.method3743(class174.field2440 + " " + client.field583, var114 / 2 + var112, var115 / 2 + var113 - 2, 16777215, 0);
                if (Statics.field702 == null) {
                    arg1.method3743(class174.field2536, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
                } else {
                    arg1.method3743(class174.field2622, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var116 = Statics.field1844.getGraphics();
            Statics.field1580.method3765(var116, 0, 0);
        } catch (Exception var119) {
            Statics.field1844.repaint();
        }
    }

    @ObfuscatedName("h.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method68(String arg0, String arg1, String arg2) {
        field870 = arg0;
        field857 = arg1;
        field872 = arg2;
    }

    @ObfuscatedName("ax.e(Lhv;I)V")
    public static final void method687(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field808.length; var2++) {
            Statics.field808[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field808[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field861[var8] = (Statics.field808[var8 - 1] + Statics.field808[var8 + 1] + Statics.field808[var8 - 128] + Statics.field808[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field808;
            Statics.field808 = Statics.field861;
            Statics.field861 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3211; var11++) {
            for (int var12 = 0; var12 < arg0.field3210; var12++) {
                if (arg0.field3212[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3215;
                    int var14 = var11 + 16 + arg0.field3214;
                    int var15 = (var14 << 7) + var13;
                    Statics.field808[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("az.q(IIII)I")
    public static final int method751(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fj.v(I)V")
    public static final void method3063() {
        short var0 = 256;
        if (field859 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field859 > 768) {
                    Statics.field72[var1] = method751(Statics.field84[var1], Statics.field2649[var1], 1024 - field859);
                } else if (field859 > 256) {
                    Statics.field72[var1] = Statics.field2649[var1];
                } else {
                    Statics.field72[var1] = method751(Statics.field2649[var1], Statics.field84[var1], 256 - field859);
                }
            }
        } else if (field846 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field846 > 768) {
                    Statics.field72[var2] = method751(Statics.field84[var2], Statics.field858[var2], 1024 - field846);
                } else if (field846 > 256) {
                    Statics.field72[var2] = Statics.field858[var2];
                } else {
                    Statics.field72[var2] = method751(Statics.field858[var2], Statics.field84[var2], 256 - field846);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field72[var3] = Statics.field84[var3];
            }
        }
        class220.method3795(field847, 9, field847 + 128, var0 + 7);
        Statics.field881.method3901(field847, 0);
        class220.method3776();
        int var4 = 0;
        int var5 = field847 + Statics.field1580.field3195 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field860[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field49[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field72[var10];
                    int var14 = Statics.field1580.field3196[var5];
                    Statics.field1580.field3196[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field1580.field3195 + var8 - 128;
        }
        class220.method3795(field847 + 765 - 128, 9, field847 + 765, var0 + 7);
        Statics.field851.method3901(field847 + 382, 0);
        class220.method3776();
        int var15 = 0;
        int var16 = field847 + Statics.field1580.field3195 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field860[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field49[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field72[var22];
                    int var26 = Statics.field1580.field3196[var20];
                    Statics.field1580.field3196[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1580.field3195 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("br.l(Laf;I)V")
    public static void method1433(class30 arg0) {
        if (arg0.method672() != client.field314) {
            client.field314 = arg0.method672();
            boolean var1 = arg0.method672();
            if (Statics.field957 != var1) {
                class199.method801();
                Statics.field957 = var1;
            }
        }
        Statics.field1567 = arg0.field706;
        client.field583 = arg0.field703;
        client.field375 = arg0.field700;
        Statics.field239 = client.field382 == 0 ? 43594 : arg0.field703 + 40000;
        Statics.field447 = client.field382 == 0 ? 443 : arg0.field703 + 50000;
        Statics.field1637 = Statics.field239;
    }

    @ObfuscatedName("db.s(I)V")
    public static void method1941() {
        if (class30.method1988()) {
            field850 = true;
        }
    }
}
