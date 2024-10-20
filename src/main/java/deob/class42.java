package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ak")
public class class42 {

    @ObfuscatedName("ak.e")
    public static int field816 = 0;

    @ObfuscatedName("ak.o")
    public static int field823 = field816 + 202;

    @ObfuscatedName("ak.i")
    public static int[] field824 = new int[256];

    @ObfuscatedName("ak.h")
    public static int field817 = 0;

    @ObfuscatedName("ak.u")
    public static int field830 = 0;

    @ObfuscatedName("ak.ae")
    public static int field829 = 0;

    @ObfuscatedName("ak.au")
    public static int field822 = 0;

    @ObfuscatedName("ak.aa")
    public static int field854 = 0;

    @ObfuscatedName("ak.af")
    public static int field832 = 0;

    @ObfuscatedName("ak.at")
    public static int field827 = 10;

    @ObfuscatedName("ak.ap")
    public static String field846 = "";

    @ObfuscatedName("ak.aw")
    public static int field831 = 0;

    @ObfuscatedName("ak.ah")
    public static String field836 = "";

    @ObfuscatedName("ak.ao")
    public static String field837 = "";

    @ObfuscatedName("ak.ag")
    public static String field838 = "";

    @ObfuscatedName("ak.az")
    public static String field839 = "";

    @ObfuscatedName("ak.ai")
    public static String field815 = "";

    @ObfuscatedName("ak.as")
    public static String field826 = "";

    @ObfuscatedName("ak.ak")
    public static class98 field842 = class98.field1628;

    @ObfuscatedName("ak.ab")
    public static boolean field844 = true;

    @ObfuscatedName("ak.ay")
    public static int field845 = 0;

    @ObfuscatedName("ak.am")
    public static String field821 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ak.ar")
    public static String field850 = "1234567890";

    @ObfuscatedName("ak.ax")
    public static boolean field848 = false;

    @ObfuscatedName("ak.bo")
    public static int field840 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.b(Ljava/awt/Component;Lgv;Lgv;ZIB)V")
    public static void method1155(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field833) {
            field831 = arg4;
            class220.method3813();
            byte[] var5 = arg1.method3142("title.jpg", "");
            Statics.field819 = new class225(var5, arg0);
            Statics.field1566 = Statics.field819.method3925();
            if ((client.field288 & 0x20000000) == 0) {
                Statics.field820 = class226.method3482(arg2, "logo", "");
            } else {
                Statics.field820 = class226.method3482(arg2, "logo_deadman_mode", "");
            }
            Statics.field835 = class226.method3482(arg2, "titlebox", "");
            Statics.field818 = class226.method3482(arg2, "titlebutton", "");
            Statics.field2356 = class226.method1899(arg2, "runes", "");
            Statics.field1726 = class226.method1899(arg2, "title_mute", "");
            Statics.field841 = class226.method3482(arg2, "options_radio_buttons,0", "");
            Statics.field834 = class226.method3482(arg2, "options_radio_buttons,2", "");
            Statics.field54 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field54[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field54[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field54[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field54[var9 + 192] = 16777215;
            }
            Statics.field825 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field825[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field825[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field825[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field825[var13 + 192] = 16777215;
            }
            Statics.field3138 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field3138[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field3138[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field3138[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field3138[var17 + 192] = 16777215;
            }
            Statics.field666 = new int[256];
            Statics.field97 = new int[32768];
            Statics.field828 = new int[32768];
            method746((class223) null);
            Statics.field36 = new int[32768];
            Statics.field244 = new int[32768];
            if (arg3) {
                field815 = "";
                field826 = "";
            }
            Statics.field843 = 0;
            Statics.field2675 = "";
            field844 = true;
            field848 = false;
            if (Statics.field2073.field688) {
                class139.field1903 = 1;
                Statics.field889 = null;
                Statics.field1906 = -1;
                Statics.field1899 = -1;
                Statics.field1909 = 0;
                Statics.field135 = false;
                Statics.field1904 = 2;
            } else {
                class139.method1137(2, Statics.field931, "scape main", "", 255, false);
            }
            class186.method2021(false);
            Statics.field833 = true;
            field816 = (Statics.field1559 - client.field566) / 2;
            field823 = field816 + 202;
            Statics.field819.method3935(field816, 0);
            Statics.field1566.method3935(field816 + 382, 0);
            Statics.field820.method3895(field816 + 382 - Statics.field820.field3210 / 2, 18);
        } else if (arg4 == 4) {
            field831 = 4;
        }
    }

    @ObfuscatedName("ay.e(I)V")
    public static void method842() {
        if (!Statics.field833) {
            return;
        }
        Statics.field835 = null;
        Statics.field818 = null;
        Statics.field2356 = null;
        Statics.field819 = null;
        Statics.field1566 = null;
        Statics.field820 = null;
        Statics.field1726 = null;
        Statics.field841 = null;
        Statics.field834 = null;
        Statics.field2116 = null;
        Statics.field156 = null;
        Statics.field1731 = null;
        Statics.field593 = null;
        Statics.field691 = null;
        Statics.field54 = null;
        Statics.field825 = null;
        Statics.field3138 = null;
        Statics.field666 = null;
        Statics.field97 = null;
        Statics.field828 = null;
        Statics.field36 = null;
        Statics.field244 = null;
        class139.field1903 = 1;
        Statics.field889 = null;
        Statics.field1906 = -1;
        Statics.field1899 = -1;
        Statics.field1909 = 0;
        Statics.field135 = false;
        Statics.field1904 = 2;
        class186.method2021(true);
        Statics.field833 = false;
    }

    @ObfuscatedName("ft.c(Ldu;B)V")
    public static void method2919(class114 arg0) {
        if (field848) {
            method194(arg0);
            return;
        }
        if ((class116.field1793 == 1 || !Statics.field1832 && class116.field1793 == 4) && class116.field1782 >= field816 + 765 - 50 && class116.field1781 >= 453) {
            Statics.field2073.field688 = !Statics.field2073.field688;
            class31.method1576();
            if (Statics.field2073.field688) {
                Statics.field1902.method2414();
                class139.field1903 = 1;
                Statics.field889 = null;
            } else {
                class185 var1 = Statics.field931;
                int var2 = var1.method3141("scape main");
                int var3 = var1.method3138(var2, "");
                class139.method1859(var1, var2, var3, 255, false);
            }
        }
        if (client.field295 == 5) {
            return;
        }
        field854++;
        if (client.field295 != 10 && client.field295 != 11) {
            return;
        }
        if (client.field314 == 0) {
            if (class116.field1793 == 1 || !Statics.field1832 && class116.field1793 == 4) {
                int var4 = field816 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class116.field1782 >= var4 && class116.field1782 <= var4 + var6 && class116.field1781 >= var5 && class116.field1781 <= var5 + var7) {
                    if (class30.method604()) {
                        field848 = true;
                    }
                    return;
                }
            }
            if (Statics.field1476 != null && class30.method604()) {
                field848 = true;
            }
        }
        int var8 = class116.field1793;
        int var9 = class116.field1782;
        int var10 = class116.field1781;
        if (!Statics.field1832 && var8 == 4) {
            var8 = 1;
        }
        if (field831 == 0) {
            boolean var11 = false;
            while (class106.method1136()) {
                if (Statics.field1101 == 84) {
                    var11 = true;
                }
            }
            int var12 = field823 + 180 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                class115.method603(client.method1856("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var14 = field823 + 180 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field288 & 0x2000000) != 0) {
                    field836 = "";
                    field837 = class174.field2582;
                    field838 = class174.field2583;
                    field839 = class174.field2584;
                    field831 = 1;
                    field845 = 0;
                } else if ((client.field288 & 0x4) != 0) {
                    if ((client.field288 & 0x400) == 0) {
                        field837 = class174.field2573;
                        field838 = class174.field2574;
                        field839 = class174.field2575;
                    } else {
                        field837 = class174.field2579;
                        field838 = class174.field2580;
                        field839 = class174.field2581;
                    }
                    field836 = class174.field2572;
                    field831 = 1;
                    field845 = 0;
                } else if ((client.field288 & 0x400) == 0) {
                    field837 = class174.field2477;
                    field838 = class174.field2523;
                    field839 = class174.field2571;
                    field831 = 2;
                    field845 = 0;
                } else {
                    field837 = class174.field2576;
                    field838 = class174.field2577;
                    field839 = class174.field2578;
                    field836 = class174.field2572;
                    field831 = 1;
                    field845 = 0;
                }
            }
        } else if (field831 == 1) {
            while (class106.method1136()) {
                if (Statics.field1101 == 84) {
                    field837 = class174.field2477;
                    field838 = class174.field2523;
                    field839 = class174.field2571;
                    field831 = 2;
                    field845 = 0;
                } else if (Statics.field1101 == 13) {
                    field831 = 0;
                }
            }
            int var15 = field823 + 180 - 80;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field837 = class174.field2477;
                field838 = class174.field2523;
                field839 = class174.field2571;
                field831 = 2;
                field845 = 0;
            }
            int var17 = field823 + 180 + 80;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field831 = 0;
            }
        } else if (field831 == 2) {
            short var18 = 231;
            int var40 = var18 + 30;
            if (var8 == 1 && var10 >= var40 - 15 && var10 < var40) {
                field845 = 0;
            }
            var40 += 15;
            if (var8 == 1 && var10 >= var40 - 15 && var10 < var40) {
                field845 = 1;
            }
            var40 += 15;
            short var19 = 361;
            if (var8 == 1 && var10 >= var19 - 15 && var10 < var19) {
                method1845(class174.field2554, class174.field2609, class174.field2610);
                field831 = 5;
                return;
            }
            int var20 = field823 + 180 - 80;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field815 = field815.trim();
                if (field815.length() == 0) {
                    method1845(class174.field2539, class174.field2476, class174.field2615);
                    return;
                }
                if (field826.length() == 0) {
                    method1845(class174.field2478, class174.field2479, class174.field2480);
                    return;
                }
                method1845(class174.field2587, class174.field2588, class174.field2532);
                field842 = Statics.field2073.field690.containsKey(class208.method3215(field815)) ? class98.field1629 : class98.field1628;
                client.method2950(20);
                return;
            }
            int var22 = field823 + 180 + 80;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field831 = 0;
                field815 = "";
                field826 = "";
                Statics.field843 = 0;
                Statics.field2675 = "";
                field844 = true;
            }
            while (true) {
                while (class106.method1136()) {
                    boolean var23 = false;
                    for (int var24 = 0; var24 < field821.length(); var24++) {
                        if (Statics.field1359 == field821.charAt(var24)) {
                            var23 = true;
                            break;
                        }
                    }
                    if (Statics.field1101 == 13) {
                        field831 = 0;
                        field815 = "";
                        field826 = "";
                        Statics.field843 = 0;
                        Statics.field2675 = "";
                        field844 = true;
                    } else if (field845 == 0) {
                        if (Statics.field1101 == 85 && field815.length() > 0) {
                            field815 = field815.substring(0, field815.length() - 1);
                        }
                        if (Statics.field1101 == 84 || Statics.field1101 == 80) {
                            field845 = 1;
                        }
                        if (var23 && field815.length() < 320) {
                            field815 = field815 + Statics.field1359;
                        }
                    } else if (field845 == 1) {
                        if (Statics.field1101 == 85 && field826.length() > 0) {
                            field826 = field826.substring(0, field826.length() - 1);
                        }
                        if (Statics.field1101 == 84 || Statics.field1101 == 80) {
                            field845 = 0;
                        }
                        if (Statics.field1101 == 84) {
                            field815 = field815.trim();
                            if (field815.length() == 0) {
                                method1845(class174.field2539, class174.field2476, class174.field2615);
                                return;
                            }
                            if (field826.length() == 0) {
                                method1845(class174.field2478, class174.field2479, class174.field2480);
                                return;
                            }
                            method1845(class174.field2587, class174.field2588, class174.field2532);
                            field842 = Statics.field2073.field690.containsKey(class208.method3215(field815)) ? class98.field1629 : class98.field1628;
                            client.method2950(20);
                            return;
                        }
                        if (var23 && field826.length() < 20) {
                            field826 = field826 + Statics.field1359;
                        }
                    }
                }
                return;
            }
        } else if (field831 == 3) {
            int var25 = field823 + 180;
            short var26 = 276;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                field837 = class174.field2477;
                field838 = class174.field2523;
                field839 = class174.field2571;
                field831 = 2;
                field845 = 0;
            }
            int var27 = field823 + 180;
            short var28 = 326;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var28 - 20 && var10 <= var28 + 20) {
                method1845(class174.field2554, class174.field2609, class174.field2610);
                field831 = 5;
                return;
            }
        } else if (field831 == 4) {
            int var29 = field823 + 180 - 80;
            short var30 = 321;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                Statics.field2675.trim();
                if (Statics.field2675.length() != 6) {
                    method1845(class174.field2394, class174.field2380, class174.field2608);
                    return;
                }
                Statics.field843 = Integer.parseInt(Statics.field2675);
                Statics.field2675 = "";
                field842 = field844 ? class98.field1625 : class98.field1624;
                method1845(class174.field2587, class174.field2588, class174.field2532);
                client.method2950(20);
                return;
            }
            if (var8 == 1 && var9 >= field823 + 180 - 9 && var9 <= field823 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field844 = !field844;
            }
            if (var8 == 1 && var9 >= field823 + 180 - 34 && var9 <= field823 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class115.method603(client.method1856("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var31 = field823 + 180 + 80;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                field831 = 0;
                field815 = "";
                field826 = "";
                Statics.field843 = 0;
                Statics.field2675 = "";
            }
            while (class106.method1136()) {
                boolean var32 = false;
                for (int var33 = 0; var33 < field850.length(); var33++) {
                    if (Statics.field1359 == field850.charAt(var33)) {
                        var32 = true;
                        break;
                    }
                }
                if (Statics.field1101 == 13) {
                    field831 = 0;
                    field815 = "";
                    field826 = "";
                    Statics.field843 = 0;
                    Statics.field2675 = "";
                } else {
                    if (Statics.field1101 == 85 && Statics.field2675.length() > 0) {
                        Statics.field2675 = Statics.field2675.substring(0, Statics.field2675.length() - 1);
                    }
                    if (Statics.field1101 == 84) {
                        Statics.field2675.trim();
                        if (Statics.field2675.length() != 6) {
                            method1845(class174.field2394, class174.field2380, class174.field2608);
                            return;
                        }
                        Statics.field843 = Integer.parseInt(Statics.field2675);
                        Statics.field2675 = "";
                        field842 = field844 ? class98.field1625 : class98.field1624;
                        method1845(class174.field2587, class174.field2588, class174.field2532);
                        client.method2950(20);
                        return;
                    }
                    if (var32 && Statics.field2675.length() < 6) {
                        Statics.field2675 = Statics.field2675 + Statics.field1359;
                    }
                }
            }
        } else if (field831 == 5) {
            int var34 = field823 + 180 - 80;
            short var35 = 321;
            if (var8 == 1 && var9 >= var34 - 75 && var9 <= var34 + 75 && var10 >= var35 - 20 && var10 <= var35 + 20) {
                method747();
                return;
            }
            int var36 = field823 + 180 + 80;
            if (var8 == 1 && var9 >= var36 - 75 && var9 <= var36 + 75 && var10 >= var35 - 20 && var10 <= var35 + 20) {
                field837 = class174.field2477;
                field838 = class174.field2523;
                field839 = class174.field2571;
                field831 = 2;
                field845 = 0;
                field826 = "";
            }
            while (class106.method1136()) {
                boolean var37 = false;
                for (int var38 = 0; var38 < field821.length(); var38++) {
                    if (Statics.field1359 == field821.charAt(var38)) {
                        var37 = true;
                        break;
                    }
                }
                if (Statics.field1101 == 13) {
                    field837 = class174.field2477;
                    field838 = class174.field2523;
                    field839 = class174.field2571;
                    field831 = 2;
                    field845 = 0;
                    field826 = "";
                } else {
                    if (Statics.field1101 == 85 && field815.length() > 0) {
                        field815 = field815.substring(0, field815.length() - 1);
                    }
                    if (Statics.field1101 == 84) {
                        method747();
                        return;
                    }
                    if (var37 && field815.length() < 320) {
                        field815 = field815 + Statics.field1359;
                    }
                }
            }
        } else if (field831 == 6) {
            while (true) {
                do {
                    if (!class106.method1136()) {
                        short var39 = 321;
                        if (var8 == 1 && var10 >= var39 - 20 && var10 <= var39 + 20) {
                            field837 = class174.field2477;
                            field838 = class174.field2523;
                            field839 = class174.field2571;
                            field831 = 2;
                            field845 = 0;
                            field826 = "";
                        }
                        return;
                    }
                } while (Statics.field1101 != 84 && Statics.field1101 != 13);
                field837 = class174.field2477;
                field838 = class174.field2523;
                field839 = class174.field2571;
                field831 = 2;
                field845 = 0;
                field826 = "";
            }
        }
    }

    @ObfuscatedName("ao.l(I)V")
    public static void method747() {
        field815 = field815.trim();
        if (field815.length() == 0) {
            method1845(class174.field2554, class174.field2609, class174.field2610);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1856("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class154 var4 = new class154(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2084, var4.field2079, 1000 - var4.field2079);
                if (var5 == -1) {
                    var4.field2079 = 0;
                    long var8 = var4.method2675();
                    var6 = var8;
                    break;
                }
                var4.field2079 += var5;
                if (var4.field2079 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var44) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field815;
            Random var15 = new Random();
            class154 var16 = new class154(128);
            class154 var17 = new class154(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2780(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2658(var15.nextInt());
            }
            var16.method2658(var18[0]);
            var16.method2658(var18[1]);
            var16.method2729(var6);
            var16.method2729(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2658(var15.nextInt());
            }
            var16.method2690(class37.field765, class37.field764);
            var17.method2780(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2658(var15.nextInt());
            }
            var17.method2729(var15.nextLong());
            var17.method2679(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class105.field1678.method1351(0L);
                class105.field1678.method1329(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var43) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2663(var22, 0, 24);
            var17.method2729(var15.nextLong());
            var17.method2690(class37.field765, class37.field764);
            int var26 = class154.method2198(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class154 var27 = new class154(var26);
            var27.method2764(var14);
            var27.field2079 = var26;
            var27.method2877(var18);
            class154 var28 = new class154(var27.field2079 + var17.field2079 + var16.field2079 + 5);
            var28.method2780(2);
            var28.method2780(var16.field2079);
            var28.method2663(var16.field2084, 0, var16.field2079);
            var28.method2780(var17.field2079);
            var28.method2663(var17.field2084, 0, var17.field2079);
            var28.method2793(var27.field2079);
            var28.method2663(var27.field2084, 0, var27.field2079);
            byte[] var29 = var28.field2084;
            String var30 = class207.method2169(var29, 0, var29.length);
            String var31 = var30;
            byte var38;
            try {
                URL var32 = new URL(client.method1856("services", false) + "m=accountappeal/login.ws");
                URLConnection var33 = var32.openConnection();
                var33.setDoInput(true);
                var33.setDoOutput(true);
                var33.setConnectTimeout(5000);
                OutputStreamWriter var34 = new OutputStreamWriter(var33.getOutputStream());
                var34.write("data2=" + class232.method3793(var31) + "&dest=" + class232.method3793("passwordchoice.ws"));
                var34.flush();
                InputStream var35 = var33.getInputStream();
                class154 var36 = new class154(new byte[1000]);
                while (true) {
                    int var37 = var35.read(var36.field2084, var36.field2079, 1000 - var36.field2079);
                    if (var37 == -1) {
                        var34.close();
                        var35.close();
                        String var39 = new String(var36.field2084);
                        if (var39.startsWith("OFFLINE")) {
                            var38 = 4;
                        } else if (var39.startsWith("WRONG")) {
                            var38 = 7;
                        } else if (var39.startsWith("RELOAD")) {
                            var38 = 3;
                        } else if (var39.startsWith("Not permitted for social network accounts.")) {
                            var38 = 6;
                        } else {
                            var36.method2687(var18);
                            while (var36.field2079 > 0 && var36.field2084[var36.field2079 - 1] == 0) {
                                var36.field2079--;
                            }
                            String var40 = new String(var36.field2084, 0, var36.field2079);
                            if (class37.method1853(var40)) {
                                class115.method3109(var40, true, "openjs", false);
                                var38 = 2;
                            } else {
                                var38 = 5;
                            }
                        }
                        break;
                    }
                    var36.field2079 += var37;
                    if (var36.field2079 >= 1000) {
                        var38 = 5;
                        break;
                    }
                }
            } catch (Throwable var42) {
                var42.printStackTrace();
                var38 = 5;
            }
            var13 = var38;
        }
        switch(var13) {
            case 2:
                method1845(class174.field2611, class174.field2504, class174.field2613);
                field831 = 6;
                break;
            case 3:
                method1845(class174.field2614, class174.field2450, class174.field2616);
                break;
            case 4:
                method1845(class174.field2617, class174.field2531, class174.field2619);
                break;
            case 5:
                method1845(class174.field2620, class174.field2618, class174.field2622);
                break;
            case 6:
                method1845(class174.field2623, class174.field2624, class174.field2625);
                break;
            case 7:
                method1845(class174.field2626, class174.field2627, class174.field2628);
        }
    }

    @ObfuscatedName("bx.y(Lhj;Lhj;Lhj;ZI)V")
    public static void method1376(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field816 = (Statics.field1559 - client.field566) / 2;
            field823 = field816 + 202;
        }
        if (field848) {
            method2016(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field819.method3935(field816, 0);
            Statics.field1566.method3935(field816 + 382, 0);
            Statics.field820.method3895(field816 + 382 - Statics.field820.field3210 / 2, 18);
        }
        if (client.field295 == 0 || client.field295 == 5) {
            byte var4 = 20;
            arg0.method3710(class174.field2447, field823 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class220.method3821(field823 + 180 - 152, var5, 304, 34, 9179409);
            class220.method3821(field823 + 180 - 151, var5 + 1, 302, 32, 0);
            class220.method3815(field823 + 180 - 150, var5 + 2, field827 * 3, 30, 9179409);
            class220.method3815(field827 * 3 + (field823 + 180 - 150), var5 + 2, 300 - field827 * 3, 30, 0);
            arg0.method3710(field846, field823 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field295 == 20) {
            Statics.field835.method3895(field823 + 180 - Statics.field835.field3210 / 2, 271 - Statics.field835.field3209 / 2);
            short var6 = 211;
            arg0.method3710(field837, field823 + 180, var6, 16776960, 0);
            int var60 = var6 + 15;
            arg0.method3710(field838, field823 + 180, var60, 16776960, 0);
            int var61 = var60 + 15;
            arg0.method3710(field839, field823 + 180, var61, 16776960, 0);
            int var62 = var61 + 15;
            int var63 = var62 + 10;
            if (field831 != 4) {
                arg0.method3701(class174.field2590, field823 + 180 - 110, var63, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field815; arg0.method3727(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3701(class210.method3706(var8), field823 + 180 - 70, var63, 16777215, 0);
                var60 = var63 + 15;
                String var10 = class174.field2591;
                String var11 = field826;
                String var12 = class208.method3377('*', var11.length());
                arg0.method3701(var10 + var12, field823 + 180 - 108, var60, 16777215, 0);
                var60 += 15;
            }
        }
        if (client.field295 == 10 || client.field295 == 11) {
            Statics.field835.method3895(field823, 171);
            if (field831 == 0) {
                short var13 = 251;
                arg0.method3710(class174.field2518, field823 + 180, var13, 16776960, 0);
                int var64 = var13 + 30;
                int var14 = field823 + 180 - 80;
                short var15 = 291;
                Statics.field818.method3895(var14 - 73, var15 - 20);
                arg0.method3711(class174.field2594, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field823 + 180 + 80;
                Statics.field818.method3895(var16 - 73, var15 - 20);
                arg0.method3711(class174.field2595, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field831 == 1) {
                arg0.method3710(field836, field823 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3710(field837, field823 + 180, var17, 16777215, 0);
                int var65 = var17 + 15;
                arg0.method3710(field838, field823 + 180, var65, 16777215, 0);
                int var66 = var65 + 15;
                arg0.method3710(field839, field823 + 180, var66, 16777215, 0);
                int var67 = var66 + 15;
                int var18 = field823 + 180 - 80;
                short var19 = 321;
                Statics.field818.method3895(var18 - 73, var19 - 20);
                arg0.method3710(class174.field2548, var18, var19 + 5, 16777215, 0);
                int var20 = field823 + 180 + 80;
                Statics.field818.method3895(var20 - 73, var19 - 20);
                arg0.method3710(class174.field2468, var20, var19 + 5, 16777215, 0);
            } else if (field831 == 2) {
                short var21 = 211;
                arg0.method3710(field837, field823 + 180, var21, 16776960, 0);
                int var68 = var21 + 15;
                arg0.method3710(field838, field823 + 180, var68, 16776960, 0);
                int var69 = var68 + 15;
                arg0.method3710(field839, field823 + 180, var69, 16776960, 0);
                int var70 = var69 + 15;
                int var71 = var70 + 10;
                arg0.method3701(class174.field2590, field823 + 180 - 110, var71, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field815; arg0.method3727(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3701(class210.method3706(var23) + (field845 == 0 & client.field489 % 40 < 20 ? class38.method3030(16776960) + class38.field786 : ""), field823 + 180 - 70, var71, 16777215, 0);
                var68 = var71 + 15;
                arg0.method3701(class174.field2591 + class208.method3891(field826) + (field845 == 1 & client.field489 % 40 < 20 ? class38.method3030(16776960) + class38.field786 : ""), field823 + 180 - 108, var68, 16777215, 0);
                var68 += 15;
                int var24 = field823 + 180 - 80;
                short var25 = 321;
                Statics.field818.method3895(var24 - 73, var25 - 20);
                arg0.method3710(class174.field2463, var24, var25 + 5, 16777215, 0);
                int var26 = field823 + 180 + 80;
                Statics.field818.method3895(var26 - 73, var25 - 20);
                arg0.method3710(class174.field2468, var26, var25 + 5, 16777215, 0);
                short var27 = 357;
                arg1.method3710(class174.field2522, field823 + 180, var27, 16776960, 0);
            } else if (field831 == 3) {
                short var28 = 201;
                arg0.method3710(class174.field2458, field823 + 180, var28, 16776960, 0);
                int var72 = var28 + 20;
                arg1.method3710(class174.field2599, field823 + 180, var72, 16776960, 0);
                int var73 = var72 + 15;
                arg1.method3710(class174.field2612, field823 + 180, var73, 16776960, 0);
                int var74 = var73 + 15;
                int var29 = field823 + 180;
                short var30 = 276;
                Statics.field818.method3895(var29 - 73, var30 - 20);
                arg2.method3710(class174.field2601, var29, var30 + 5, 16777215, 0);
                int var31 = field823 + 180;
                short var32 = 326;
                Statics.field818.method3895(var31 - 73, var32 - 20);
                arg2.method3710(class174.field2365, var31, var32 + 5, 16777215, 0);
            } else if (field831 == 4) {
                arg0.method3710(class174.field2585, field823 + 180, 211, 16776960, 0);
                short var33 = 236;
                arg0.method3710(field837, field823 + 180, var33, 16777215, 0);
                int var75 = var33 + 15;
                arg0.method3710(field838, field823 + 180, var75, 16777215, 0);
                int var76 = var75 + 15;
                arg0.method3710(field839, field823 + 180, var76, 16777215, 0);
                int var77 = var76 + 15;
                String var35 = class174.field2592;
                String var36 = Statics.field2675;
                String var37 = class208.method3377('*', var36.length());
                arg0.method3701(var35 + var37 + (client.field489 % 40 < 20 ? class38.method3030(16776960) + class38.field786 : ""), field823 + 180 - 108, var77, 16777215, 0);
                int var78 = var77 - 8;
                arg0.method3701(class174.field2368, field823 + 180 - 9, var78, 16776960, 0);
                int var79 = var78 + 15;
                arg0.method3701(class174.field2369, field823 + 180 - 9, var79, 16776960, 0);
                int var38 = field823 + 180 - 9 + arg0.method3727(class174.field2369) + 15;
                int var39 = var79 - arg0.field3118;
                class223 var40;
                if (field844) {
                    var40 = Statics.field834;
                } else {
                    var40 = Statics.field841;
                }
                var40.method3895(var38, var39);
                var75 = var79 + 15;
                int var41 = field823 + 180 - 80;
                short var42 = 321;
                Statics.field818.method3895(var41 - 73, var42 - 20);
                arg0.method3710(class174.field2548, var41, var42 + 5, 16777215, 0);
                int var43 = field823 + 180 + 80;
                Statics.field818.method3895(var43 - 73, var42 - 20);
                arg0.method3710(class174.field2468, var43, var42 + 5, 16777215, 0);
                arg1.method3710(class174.field2586, field823 + 180, var42 + 36, 255, 0);
            } else if (field831 == 5) {
                arg0.method3710(class174.field2604, field823 + 180, 201, 16776960, 0);
                short var44 = 221;
                arg2.method3710(field837, field823 + 180, var44, 16776960, 0);
                int var80 = var44 + 15;
                arg2.method3710(field838, field823 + 180, var80, 16776960, 0);
                int var81 = var80 + 15;
                arg2.method3710(field839, field823 + 180, var81, 16776960, 0);
                int var82 = var81 + 15;
                int var83 = var82 + 14;
                arg0.method3701(class174.field2605, field823 + 180 - 145, var83, 16777215, 0);
                short var45 = 174;
                String var46;
                for (var46 = field815; arg0.method3727(var46) > var45; var46 = var46.substring(1)) {
                }
                arg0.method3701(class210.method3706(var46) + (client.field489 % 40 < 20 ? class38.method3030(16776960) + class38.field786 : ""), field823 + 180 - 34, var83, 16777215, 0);
                var80 = var83 + 15;
                int var47 = field823 + 180 - 80;
                short var48 = 321;
                Statics.field818.method3895(var47 - 73, var48 - 20);
                arg0.method3710(class174.field2565, var47, var48 + 5, 16777215, 0);
                int var49 = field823 + 180 + 80;
                Statics.field818.method3895(var49 - 73, var48 - 20);
                arg0.method3710(class174.field2466, var49, var48 + 5, 16777215, 0);
            } else if (field831 == 6) {
                short var50 = 211;
                arg0.method3710(field837, field823 + 180, var50, 16776960, 0);
                int var84 = var50 + 15;
                arg0.method3710(field838, field823 + 180, var84, 16776960, 0);
                int var85 = var84 + 15;
                arg0.method3710(field839, field823 + 180, var85, 16776960, 0);
                int var86 = var85 + 15;
                int var51 = field823 + 180;
                short var52 = 321;
                Statics.field818.method3895(var51 - 73, var52 - 20);
                arg0.method3710(class174.field2466, var51, var52 + 5, 16777215, 0);
            }
        }
        if (field854 > 0) {
            method2166(field854);
            field854 = 0;
        }
        method3237();
        Statics.field1726[Statics.field2073.field688 ? 1 : 0].method3895(field816 + 765 - 40, 463);
        if (client.field295 > 5 && client.field314 == 0) {
            if (Statics.field691 == null) {
                Statics.field691 = class226.method3482(Statics.field852, "sl_button", "");
            } else {
                int var53 = field816 + 5;
                short var54 = 463;
                byte var55 = 100;
                byte var56 = 35;
                Statics.field691.method3895(var53, var54);
                arg0.method3710(class174.field2453 + " " + client.field287, var55 / 2 + var53, var56 / 2 + var54 - 2, 16777215, 0);
                if (Statics.field1476 == null) {
                    arg1.method3710(class174.field2639, var55 / 2 + var53, var56 / 2 + var54 + 12, 16777215, 0);
                } else {
                    arg1.method3710(class174.field2638, var55 / 2 + var53, var56 / 2 + var54 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var57 = Statics.field1995.getGraphics();
            Statics.field2010.method3798(var57, 0, 0);
        } catch (Exception var59) {
            Statics.field1995.repaint();
        }
    }

    @ObfuscatedName("ck.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1845(String arg0, String arg1, String arg2) {
        field837 = arg0;
        field838 = arg1;
        field839 = arg2;
    }

    @ObfuscatedName("ah.t(Lhw;I)V")
    public static final void method746(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field97.length; var2++) {
            Statics.field97[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field97[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field828[var8] = (Statics.field97[var8 - 1] + Statics.field97[var8 + 1] + Statics.field97[var8 - 128] + Statics.field97[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field97;
            Statics.field97 = Statics.field828;
            Statics.field828 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3209; var11++) {
            for (int var12 = 0; var12 < arg0.field3210; var12++) {
                if (arg0.field3206[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3208;
                    int var14 = var11 + 16 + arg0.field3211;
                    int var15 = (var14 << 7) + var13;
                    Statics.field97[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dj.k(II)V")
    public static final void method2166(int arg0) {
        short var1 = 256;
        field829 += arg0 * 128;
        if (field829 > Statics.field97.length) {
            field829 -= Statics.field97.length;
            int var2 = (int) (Math.random() * 12.0D);
            method746(Statics.field2356[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field36[var3 + var4] - Statics.field97[field829 + var3 & Statics.field97.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field36[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field36[var9 + var10] = 255;
                } else {
                    Statics.field36[var9 + var10] = 0;
                }
            }
        }
        if (field817 > 0) {
            field817 -= arg0 * 4;
        }
        if (field830 > 0) {
            field830 -= arg0 * 4;
        }
        if (field817 == 0 && field830 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field817 = 1024;
            }
            if (var12 == 1) {
                field830 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field824[var13] = field824[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field824[var14] = (int) (Math.sin((double) field832 / 14.0D) * 16.0D + Math.sin((double) field832 / 15.0D) * 14.0D + Math.sin((double) field832 / 16.0D) * 12.0D);
            field832++;
        }
        field822 += arg0 * 1516302941;
        int var15 = ((client.field489 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field822 * 1511031732; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field36[(var18 << 7) + var17] = 192;
        }
        field822 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field36[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field36[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field244[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field244[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field244[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field36[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("u.f(IIII)I")
    public static final int method264(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("gz.a(I)V")
    public static final void method3237() {
        short var0 = 256;
        if (field817 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field817 > 768) {
                    Statics.field666[var1] = method264(Statics.field54[var1], Statics.field825[var1], 1024 - field817);
                } else if (field817 > 256) {
                    Statics.field666[var1] = Statics.field825[var1];
                } else {
                    Statics.field666[var1] = method264(Statics.field825[var1], Statics.field54[var1], 256 - field817);
                }
            }
        } else if (field830 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field830 > 768) {
                    Statics.field666[var2] = method264(Statics.field54[var2], Statics.field3138[var2], 1024 - field830);
                } else if (field830 > 256) {
                    Statics.field666[var2] = Statics.field3138[var2];
                } else {
                    Statics.field666[var2] = method264(Statics.field3138[var2], Statics.field54[var2], 256 - field830);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field666[var3] = Statics.field54[var3];
            }
        }
        class220.method3809(field816, 9, field816 + 128, var0 + 7);
        Statics.field819.method3935(field816, 0);
        class220.method3850();
        int var4 = 0;
        int var5 = field816 + Statics.field2010.field3195 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field824[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field36[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field666[var10];
                    int var14 = Statics.field2010.field3193[var5];
                    Statics.field2010.field3193[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field2010.field3195 + var8 - 128;
        }
        class220.method3809(field816 + 765 - 128, 9, field816 + 765, var0 + 7);
        Statics.field1566.method3935(field816 + 382, 0);
        class220.method3850();
        int var15 = 0;
        int var16 = field816 + Statics.field2010.field3195 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field824[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field36[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field666[var22];
                    int var26 = Statics.field2010.field3193[var20];
                    Statics.field2010.field3193[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2010.field3195 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("dx.v(Lhj;Lhj;B)V")
    public static void method2016(class209 arg0, class209 arg1) {
        if (Statics.field2116 == null) {
            Statics.field2116 = class226.method663(Statics.field852, "sl_back", "");
        }
        if (Statics.field156 == null) {
            Statics.field156 = class226.method1899(Statics.field852, "sl_flags", "");
        }
        if (Statics.field1731 == null) {
            Statics.field1731 = class226.method1899(Statics.field852, "sl_arrows", "");
        }
        if (Statics.field593 == null) {
            Statics.field593 = class226.method1899(Statics.field852, "sl_stars", "");
        }
        class220.method3815(field816, 23, 765, 480, 0);
        class220.method3827(field816, 0, 125, 23, 12425273, 9135624);
        class220.method3827(field816 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3710(class174.field2629, field816 + 62, 15, 0, -1);
        if (Statics.field593 != null) {
            Statics.field593[1].method3895(field816 + 140, 1);
            arg1.method3701(class174.field2630, field816 + 152, 10, 16777215, -1);
            Statics.field593[0].method3895(field816 + 140, 12);
            arg1.method3701(class174.field2631, field816 + 152, 21, 16777215, -1);
        }
        if (Statics.field1731 != null) {
            int var2 = field816 + 280;
            if (class30.field678[0] == 0 && class30.field672[0] == 0) {
                Statics.field1731[2].method3895(var2, 4);
            } else {
                Statics.field1731[0].method3895(var2, 4);
            }
            if (class30.field678[0] == 0 && class30.field672[0] == 1) {
                Statics.field1731[3].method3895(var2 + 15, 4);
            } else {
                Statics.field1731[1].method3895(var2 + 15, 4);
            }
            arg0.method3701(class174.field2632, var2 + 32, 17, 16777215, -1);
            int var3 = field816 + 390;
            if (class30.field678[0] == 1 && class30.field672[0] == 0) {
                Statics.field1731[2].method3895(var3, 4);
            } else {
                Statics.field1731[0].method3895(var3, 4);
            }
            if (class30.field678[0] == 1 && class30.field672[0] == 1) {
                Statics.field1731[3].method3895(var3 + 15, 4);
            } else {
                Statics.field1731[1].method3895(var3 + 15, 4);
            }
            arg0.method3701(class174.field2633, var3 + 32, 17, 16777215, -1);
            int var4 = field816 + 500;
            if (class30.field678[0] == 2 && class30.field672[0] == 0) {
                Statics.field1731[2].method3895(var4, 4);
            } else {
                Statics.field1731[0].method3895(var4, 4);
            }
            if (class30.field678[0] == 2 && class30.field672[0] == 1) {
                Statics.field1731[3].method3895(var4 + 15, 4);
            } else {
                Statics.field1731[1].method3895(var4 + 15, 4);
            }
            arg0.method3701(class174.field2634, var4 + 32, 17, 16777215, -1);
            int var5 = field816 + 610;
            if (class30.field678[0] == 3 && class30.field672[0] == 0) {
                Statics.field1731[2].method3895(var5, 4);
            } else {
                Statics.field1731[0].method3895(var5, 4);
            }
            if (class30.field678[0] == 3 && class30.field672[0] == 1) {
                Statics.field1731[3].method3895(var5 + 15, 4);
            } else {
                Statics.field1731[1].method3895(var5 + 15, 4);
            }
            arg0.method3701(class174.field2635, var5 + 32, 17, 16777215, -1);
        }
        class220.method3815(field816 + 708, 4, 50, 16, 0);
        arg1.method3710(class174.field2468, field816 + 708 + 25, 16, 16777215, -1);
        field840 = -1;
        if (Statics.field2116 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field671) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field671) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field671) {
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
            int var17 = field816 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field671; var20++) {
                class30 var21 = Statics.field61[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field669);
                if (var21.field669 == -1) {
                    var23 = class174.field2421;
                    var22 = false;
                } else if (var21.field669 > 1980) {
                    var23 = class174.field2637;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method634()) {
                    if (var21.method608()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method612()) {
                    var24 = 16711680;
                    if (var21.method608()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method610()) {
                    if (var21.method608()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method608()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1787 >= var17 && class116.field1783 * -667823397 >= var16 && class116.field1787 < var6 + var17 && class116.field1783 * -667823397 < var7 + var16 && var22) {
                    field840 = var20;
                    Statics.field2116[var25].method3941(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2116[var25].method3935(var17, var16);
                }
                if (Statics.field156 != null) {
                    Statics.field156[(var21.method608() ? 8 : 0) + var21.field668].method3895(var17 + 29, var16);
                }
                arg0.method3710(Integer.toString(var21.field676), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3710(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3727(Statics.field61[field840].field680) + 6;
                int var27 = arg1.field3118 + 8;
                class220.method3815(class116.field1787 - var26 / 2, class116.field1783 * -667823397 + 20 + 5, var26, var27, 16777120);
                class220.method3821(class116.field1787 - var26 / 2, class116.field1783 * -667823397 + 20 + 5, var26, var27, 0);
                arg1.method3710(Statics.field61[field840].field680, class116.field1787, class116.field1783 * -667823397 + 20 + 5 + arg1.field3118 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1995.getGraphics();
            Statics.field2010.method3798(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1995.repaint();
        }
    }

    @ObfuscatedName("d.d(Ldu;B)V")
    public static void method194(class114 arg0) {
        if (class116.field1793 != 1 && Statics.field1832 || class116.field1793 != 4) {
            return;
        }
        int var1 = field816 + 280;
        if (class116.field1782 >= var1 && class116.field1782 <= var1 + 14 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(0, 0);
            return;
        }
        if (class116.field1782 >= var1 + 15 && class116.field1782 <= var1 + 80 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(0, 1);
            return;
        }
        int var2 = field816 + 390;
        if (class116.field1782 >= var2 && class116.field1782 <= var2 + 14 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(1, 0);
            return;
        }
        if (class116.field1782 >= var2 + 15 && class116.field1782 <= var2 + 80 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(1, 1);
            return;
        }
        int var3 = field816 + 500;
        if (class116.field1782 >= var3 && class116.field1782 <= var3 + 14 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(2, 0);
            return;
        }
        if (class116.field1782 >= var3 + 15 && class116.field1782 <= var3 + 80 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(2, 1);
            return;
        }
        int var4 = field816 + 610;
        if (class116.field1782 >= var4 && class116.field1782 <= var4 + 14 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(3, 0);
            return;
        }
        if (class116.field1782 >= var4 + 15 && class116.field1782 <= var4 + 80 && class116.field1781 >= 4 && class116.field1781 <= 18) {
            class30.method226(3, 1);
            return;
        }
        if (class116.field1782 >= field816 + 708 && class116.field1781 >= 4 && class116.field1782 <= field816 + 708 + 50 && class116.field1781 <= 20) {
            field848 = false;
            Statics.field819.method3935(field816, 0);
            Statics.field1566.method3935(field816 + 382, 0);
            Statics.field820.method3895(field816 + 382 - Statics.field820.field3210 / 2, 18);
            return;
        }
        if (field840 == -1) {
            return;
        }
        class30 var5 = Statics.field61[field840];
        method33(var5);
        field848 = false;
        Statics.field819.method3935(field816, 0);
        Statics.field1566.method3935(field816 + 382, 0);
        Statics.field820.method3895(field816 + 382 - Statics.field820.field3210 / 2, 18);
        return;
    }

    @ObfuscatedName("c.o(Lau;I)V")
    public static void method33(class30 arg0) {
        if (arg0.method608() != client.field356) {
            client.field356 = arg0.method608();
            class199.method2891(arg0.method608());
        }
        Statics.field2030 = arg0.field679;
        client.field287 = arg0.field676;
        client.field288 = arg0.field677;
        Statics.field2688 = client.field562 == 0 ? 43594 : arg0.field676 + 40000;
        Statics.field183 = client.field562 == 0 ? 443 : arg0.field676 + 50000;
        Statics.field901 = Statics.field2688;
    }
}
