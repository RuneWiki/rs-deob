package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("ad")
public class class42 {

    @ObfuscatedName("ad.i")
    public static int field860 = 0;

    @ObfuscatedName("ad.y")
    public static int field848 = field860 + 202;

    @ObfuscatedName("ad.v")
    public static int[] field844 = new int[256];

    @ObfuscatedName("ad.k")
    public static int field846 = 0;

    @ObfuscatedName("ad.t")
    public static int field847 = 0;

    @ObfuscatedName("ad.aq")
    public static int field857 = 0;

    @ObfuscatedName("ad.ah")
    public static int field845 = 0;

    @ObfuscatedName("ad.ag")
    public static int field850 = 0;

    @ObfuscatedName("ad.ab")
    public static int field851 = 0;

    @ObfuscatedName("ad.aw")
    public static int field852 = 10;

    @ObfuscatedName("ad.ax")
    public static String field853 = "";

    @ObfuscatedName("ad.ar")
    public static int field854 = 0;

    @ObfuscatedName("ad.ak")
    public static String field855 = "";

    @ObfuscatedName("ad.ai")
    public static String field856 = "";

    @ObfuscatedName("ad.ap")
    public static String field863 = "";

    @ObfuscatedName("ad.au")
    public static String field858 = "";

    @ObfuscatedName("ad.aj")
    public static String field865 = "";

    @ObfuscatedName("ad.at")
    public static String field869 = "";

    @ObfuscatedName("ad.ad")
    public static class98 field859 = class98.field1652;

    @ObfuscatedName("ad.ae")
    public static boolean field862 = true;

    @ObfuscatedName("ad.aa")
    public static int field872 = 0;

    @ObfuscatedName("ad.as")
    public static String field864 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ad.al")
    public static String field836 = "1234567890";

    @ObfuscatedName("ad.ay")
    public static boolean field866 = false;

    @ObfuscatedName("ad.br")
    public static int field867 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.f(Lgb;Lgb;B)I")
    public static int method1358(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3135("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3135("logo", "")) {
            var2++;
        }
        if (arg1.method3135("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3135("titlebox", "")) {
            var2++;
        }
        if (arg1.method3135("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3135("runes", "")) {
            var2++;
        }
        if (arg1.method3135("title_mute", "")) {
            var2++;
        }
        if (arg1.method3146("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3146("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3135("sl_back", "");
        arg1.method3135("sl_flags", "");
        arg1.method3135("sl_arrows", "");
        arg1.method3135("sl_stars", "");
        arg1.method3135("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ag.i(I)I")
    public static int method649() {
        return 9;
    }

    @ObfuscatedName("ab.u(Ljava/awt/Component;Lgb;Lgb;ZIB)V")
    public static void method651(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field861) {
            field854 = arg4;
            class220.method3829();
            byte[] var5 = arg1.method3134("title.jpg", "");
            Statics.field839 = new class225(var5, arg0);
            Statics.field8 = Statics.field839.method3879();
            if ((client.field302 & 0x20000000) == 0) {
                Statics.field840 = class226.method31(arg2, "logo", "");
            } else {
                Statics.field840 = class226.method31(arg2, "logo_deadman_mode", "");
            }
            Statics.field837 = class226.method31(arg2, "titlebox", "");
            Statics.field1562 = class226.method31(arg2, "titlebutton", "");
            Statics.field838 = class226.method3495(arg2, "runes", "");
            Statics.field841 = class226.method3495(arg2, "title_mute", "");
            Statics.field2374 = class226.method31(arg2, "options_radio_buttons,0", "");
            Statics.field952 = class226.method31(arg2, "options_radio_buttons,2", "");
            Statics.field1123 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1123[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1123[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1123[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1123[var9 + 192] = 16777215;
            }
            Statics.field159 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field159[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field159[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field159[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field159[var13 + 192] = 16777215;
            }
            Statics.field868 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field868[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field868[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field868[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field868[var17 + 192] = 16777215;
            }
            Statics.field1934 = new int[256];
            Statics.field160 = new int[32768];
            Statics.field84 = new int[32768];
            method139((class223) null);
            Statics.field604 = new int[32768];
            Statics.field250 = new int[32768];
            if (arg3) {
                field865 = "";
                field869 = "";
            }
            Statics.field684 = 0;
            Statics.field221 = "";
            field862 = true;
            field866 = false;
            if (Statics.field2059.field720) {
                class139.method2188(2);
            } else {
                class185 var18 = Statics.field587;
                int var19 = var18.method3132("scape main");
                int var20 = var18.method3133(var19, "");
                class139.field1941 = 1;
                Statics.field2062 = var18;
                Statics.field1942 = var19;
                Statics.field1778 = var20;
                Statics.field784 = 255;
                Statics.field1939 = false;
                Statics.field1938 = 2;
            }
            class186.method20(false);
            Statics.field861 = true;
            field860 = (Statics.field756 - client.field363 * 765) / 2;
            field848 = field860 + 202;
            Statics.field839.method3889(field860, 0);
            Statics.field8.method3889(field860 + 382, 0);
            Statics.field840.method3846(field860 + 382 - Statics.field840.field3214 / 2, 18);
        } else if (arg4 == 4) {
            field854 = 4;
        }
    }

    @ObfuscatedName("fy.r(I)V")
    public static void method2987() {
        if (!Statics.field861) {
            return;
        }
        Statics.field837 = null;
        Statics.field1562 = null;
        Statics.field838 = null;
        Statics.field839 = null;
        Statics.field8 = null;
        Statics.field840 = null;
        Statics.field841 = null;
        Statics.field2374 = null;
        Statics.field952 = null;
        Statics.field74 = null;
        Statics.field719 = null;
        Statics.field790 = null;
        Statics.field46 = null;
        Statics.field1859 = null;
        Statics.field1123 = null;
        Statics.field159 = null;
        Statics.field868 = null;
        Statics.field1934 = null;
        Statics.field160 = null;
        Statics.field84 = null;
        Statics.field604 = null;
        Statics.field250 = null;
        class139.method2188(2);
        class186.method20(true);
        Statics.field861 = false;
    }

    @ObfuscatedName("eo.o(Ldn;I)V")
    public static void method2863(class114 arg0) {
        if (field866) {
            method27(arg0);
            return;
        }
        if ((class116.field1824 == 1 || !Statics.field2688 && class116.field1824 == 4) && class116.field1826 >= field860 + 765 - 50 && class116.field1814 >= 453) {
            Statics.field2059.field720 = !Statics.field2059.field720;
            class31.method2638();
            if (Statics.field2059.field720) {
                class139.method1399();
            } else {
                class185 var1 = Statics.field587;
                int var2 = var1.method3132("scape main");
                int var3 = var1.method3133(var2, "");
                class139.method1400(var1, var2, var3, 255, false);
            }
        }
        if (client.field362 == 5) {
            return;
        }
        field850++;
        if (client.field362 != 10 && client.field362 != 11) {
            return;
        }
        if (client.field309 == 0) {
            if (class116.field1824 == 1 || !Statics.field2688 && class116.field1824 == 4) {
                int var4 = field860 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class116.field1826 >= var4 && class116.field1826 <= var4 + var6 && class116.field1814 >= var5 && class116.field1814 <= var5 + var7) {
                    method2879();
                    return;
                }
            }
            if (Statics.field177 != null) {
                method2879();
            }
        }
        int var8 = class116.field1824;
        int var9 = class116.field1826;
        int var10 = class116.field1814;
        if (!Statics.field2688 && var8 == 4) {
            var8 = 1;
        }
        if (field854 == 0) {
            boolean var11 = false;
            while (class106.method1404()) {
                if (Statics.field3085 == 84) {
                    var11 = true;
                }
            }
            int var12 = field848 + 180 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                class115.method609(client.method3099("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var14 = field848 + 180 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field302 & 0x2000000) != 0) {
                    field855 = "";
                    field856 = class174.field2437;
                    field863 = class174.field2558;
                    field858 = class174.field2599;
                    field854 = 1;
                    field872 = 0;
                } else if ((client.field302 & 0x4) != 0) {
                    if ((client.field302 & 0x400) == 0) {
                        field856 = class174.field2588;
                        field863 = class174.field2589;
                        field858 = class174.field2652;
                    } else {
                        field856 = class174.field2594;
                        field863 = class174.field2495;
                        field858 = class174.field2650;
                    }
                    field855 = class174.field2583;
                    field854 = 1;
                    field872 = 0;
                } else if ((client.field302 & 0x400) == 0) {
                    field856 = class174.field2584;
                    field863 = class174.field2585;
                    field858 = class174.field2595;
                    field854 = 2;
                    field872 = 0;
                } else {
                    field856 = class174.field2591;
                    field863 = class174.field2614;
                    field858 = class174.field2550;
                    field855 = class174.field2583;
                    field854 = 1;
                    field872 = 0;
                }
            }
        } else if (field854 == 1) {
            while (class106.method1404()) {
                if (Statics.field3085 == 84) {
                    field856 = class174.field2584;
                    field863 = class174.field2585;
                    field858 = class174.field2595;
                    field854 = 2;
                    field872 = 0;
                } else if (Statics.field3085 == 13) {
                    field854 = 0;
                }
            }
            int var15 = field848 + 180 - 80;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field856 = class174.field2584;
                field863 = class174.field2585;
                field858 = class174.field2595;
                field854 = 2;
                field872 = 0;
            }
            int var17 = field848 + 180 + 80;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field854 = 0;
            }
        } else if (field854 == 2) {
            short var18 = 231;
            int var40 = var18 + 30;
            if (var8 == 1 && var10 >= var40 - 15 && var10 < var40) {
                field872 = 0;
            }
            var40 += 15;
            if (var8 == 1 && var10 >= var40 - 15 && var10 < var40) {
                field872 = 1;
            }
            var40 += 15;
            short var19 = 361;
            if (var8 == 1 && var10 >= var19 - 15 && var10 < var19) {
                method1158(class174.field2623, class174.field2624, class174.field2611);
                field854 = 5;
                return;
            }
            int var20 = field848 + 180 - 80;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field865 = field865.trim();
                if (field865.length() == 0) {
                    method1158(class174.field2551, class174.field2639, class174.field2586);
                    return;
                }
                if (field869.length() == 0) {
                    method1158(class174.field2604, class174.field2494, class174.field2481);
                    return;
                }
                method1158(class174.field2602, class174.field2511, class174.field2504);
                field859 = Statics.field2059.field716.containsKey(class208.method1969(field865)) ? class98.field1656 : class98.field1652;
                client.method1850(20);
                return;
            }
            int var22 = field848 + 180 + 80;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field854 = 0;
                field865 = "";
                field869 = "";
                Statics.field684 = 0;
                Statics.field221 = "";
                field862 = true;
            }
            while (true) {
                while (class106.method1404()) {
                    boolean var23 = false;
                    for (int var24 = 0; var24 < field864.length(); var24++) {
                        if (Statics.field811 == field864.charAt(var24)) {
                            var23 = true;
                            break;
                        }
                    }
                    if (Statics.field3085 == 13) {
                        field854 = 0;
                        field865 = "";
                        field869 = "";
                        Statics.field684 = 0;
                        Statics.field221 = "";
                        field862 = true;
                    } else if (field872 == 0) {
                        if (Statics.field3085 == 85 && field865.length() > 0) {
                            field865 = field865.substring(0, field865.length() - 1);
                        }
                        if (Statics.field3085 == 84 || Statics.field3085 == 80) {
                            field872 = 1;
                        }
                        if (var23 && field865.length() < 320) {
                            field865 = field865 + Statics.field811;
                        }
                    } else if (field872 == 1) {
                        if (Statics.field3085 == 85 && field869.length() > 0) {
                            field869 = field869.substring(0, field869.length() - 1);
                        }
                        if (Statics.field3085 == 84 || Statics.field3085 == 80) {
                            field872 = 0;
                        }
                        if (Statics.field3085 == 84) {
                            field865 = field865.trim();
                            if (field865.length() == 0) {
                                method1158(class174.field2551, class174.field2639, class174.field2586);
                                return;
                            }
                            if (field869.length() == 0) {
                                method1158(class174.field2604, class174.field2494, class174.field2481);
                                return;
                            }
                            method1158(class174.field2602, class174.field2511, class174.field2504);
                            field859 = Statics.field2059.field716.containsKey(class208.method1969(field865)) ? class98.field1656 : class98.field1652;
                            client.method1850(20);
                            return;
                        }
                        if (var23 && field869.length() < 20) {
                            field869 = field869 + Statics.field811;
                        }
                    }
                }
                return;
            }
        } else if (field854 == 3) {
            int var25 = field848 + 180;
            short var26 = 276;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                field856 = class174.field2584;
                field863 = class174.field2585;
                field858 = class174.field2595;
                field854 = 2;
                field872 = 0;
            }
            int var27 = field848 + 180;
            short var28 = 326;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var28 - 20 && var10 <= var28 + 20) {
                method1158(class174.field2623, class174.field2624, class174.field2611);
                field854 = 5;
                return;
            }
        } else if (field854 == 4) {
            int var29 = field848 + 180 - 80;
            short var30 = 321;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                Statics.field221.trim();
                if (Statics.field221.length() != 6) {
                    method1158(class174.field2409, class174.field2410, class174.field2411);
                    return;
                }
                Statics.field684 = Integer.parseInt(Statics.field221);
                Statics.field221 = "";
                field859 = field862 ? class98.field1651 : class98.field1650;
                method1158(class174.field2602, class174.field2511, class174.field2504);
                client.method1850(20);
                return;
            }
            if (var8 == 1 && var9 >= field848 + 180 - 9 && var9 <= field848 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field862 = !field862;
            }
            if (var8 == 1 && var9 >= field848 + 180 - 34 && var9 <= field848 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class115.method609(client.method3099("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var31 = field848 + 180 + 80;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                field854 = 0;
                field865 = "";
                field869 = "";
                Statics.field684 = 0;
                Statics.field221 = "";
            }
            while (class106.method1404()) {
                boolean var32 = false;
                for (int var33 = 0; var33 < field836.length(); var33++) {
                    if (Statics.field811 == field836.charAt(var33)) {
                        var32 = true;
                        break;
                    }
                }
                if (Statics.field3085 == 13) {
                    field854 = 0;
                    field865 = "";
                    field869 = "";
                    Statics.field684 = 0;
                    Statics.field221 = "";
                } else {
                    if (Statics.field3085 == 85 && Statics.field221.length() > 0) {
                        Statics.field221 = Statics.field221.substring(0, Statics.field221.length() - 1);
                    }
                    if (Statics.field3085 == 84) {
                        Statics.field221.trim();
                        if (Statics.field221.length() != 6) {
                            method1158(class174.field2409, class174.field2410, class174.field2411);
                            return;
                        }
                        Statics.field684 = Integer.parseInt(Statics.field221);
                        Statics.field221 = "";
                        field859 = field862 ? class98.field1651 : class98.field1650;
                        method1158(class174.field2602, class174.field2511, class174.field2504);
                        client.method1850(20);
                        return;
                    }
                    if (var32 && Statics.field221.length() < 6) {
                        Statics.field221 = Statics.field221 + Statics.field811;
                    }
                }
            }
        } else if (field854 == 5) {
            int var34 = field848 + 180 - 80;
            short var35 = 321;
            if (var8 == 1 && var9 >= var34 - 75 && var9 <= var34 + 75 && var10 >= var35 - 20 && var10 <= var35 + 20) {
                method172();
                return;
            }
            int var36 = field848 + 180 + 80;
            if (var8 == 1 && var9 >= var36 - 75 && var9 <= var36 + 75 && var10 >= var35 - 20 && var10 <= var35 + 20) {
                field856 = class174.field2584;
                field863 = class174.field2585;
                field858 = class174.field2595;
                field854 = 2;
                field872 = 0;
                field869 = "";
            }
            while (class106.method1404()) {
                boolean var37 = false;
                for (int var38 = 0; var38 < field864.length(); var38++) {
                    if (Statics.field811 == field864.charAt(var38)) {
                        var37 = true;
                        break;
                    }
                }
                if (Statics.field3085 == 13) {
                    field856 = class174.field2584;
                    field863 = class174.field2585;
                    field858 = class174.field2595;
                    field854 = 2;
                    field872 = 0;
                    field869 = "";
                } else {
                    if (Statics.field3085 == 85 && field865.length() > 0) {
                        field865 = field865.substring(0, field865.length() - 1);
                    }
                    if (Statics.field3085 == 84) {
                        method172();
                        return;
                    }
                    if (var37 && field865.length() < 320) {
                        field865 = field865 + Statics.field811;
                    }
                }
            }
        } else if (field854 == 6) {
            while (true) {
                do {
                    if (!class106.method1404()) {
                        short var39 = 321;
                        if (var8 == 1 && var10 >= var39 - 20 && var10 <= var39 + 20) {
                            field856 = class174.field2584;
                            field863 = class174.field2585;
                            field858 = class174.field2595;
                            field854 = 2;
                            field872 = 0;
                            field869 = "";
                        }
                        return;
                    }
                } while (Statics.field3085 != 84 && Statics.field3085 != 13);
                field856 = class174.field2584;
                field863 = class174.field2585;
                field858 = class174.field2595;
                field854 = 2;
                field872 = 0;
                field869 = "";
            }
        }
    }

    @ObfuscatedName("a.l(I)V")
    public static void method172() {
        field865 = field865.trim();
        if (field865.length() == 0) {
            method1158(class174.field2623, class174.field2624, class174.field2611);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method3099("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2114, var4.field2111, 1000 - var4.field2111);
                if (var5 == -1) {
                    var4.field2111 = 0;
                    long var8 = var4.method2726();
                    var6 = var8;
                    break;
                }
                var4.field2111 += var5;
                if (var4.field2111 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class37.method3037(var6, field865);
        }
        switch(var13) {
            case 2:
                method1158(class174.field2626, class174.field2493, class174.field2543);
                field854 = 6;
                break;
            case 3:
                method1158(class174.field2629, class174.field2630, class174.field2631);
                break;
            case 4:
                method1158(class174.field2605, class174.field2628, class174.field2460);
                break;
            case 5:
                method1158(class174.field2439, class174.field2570, class174.field2637);
                break;
            case 6:
                method1158(class174.field2638, class174.field2575, class174.field2640);
                break;
            case 7:
                method1158(class174.field2634, class174.field2642, class174.field2381);
        }
    }

    @ObfuscatedName("fs.n(Lhg;Lhg;Lhg;ZI)V")
    public static void method3101(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field860 = (Statics.field756 - client.field363 * 765) / 2;
            field848 = field860 + 202;
        }
        if (field866) {
            if (Statics.field74 == null) {
                Statics.field74 = class226.method1862(Statics.field1218, "sl_back", "");
            }
            if (Statics.field719 == null) {
                Statics.field719 = class226.method3495(Statics.field1218, "sl_flags", "");
            }
            if (Statics.field790 == null) {
                Statics.field790 = class226.method3495(Statics.field1218, "sl_arrows", "");
            }
            if (Statics.field46 == null) {
                Statics.field46 = class226.method3495(Statics.field1218, "sl_stars", "");
            }
            class220.method3779(field860, 23, 765, 480, 0);
            class220.method3784(field860, 0, 125, 23, 12425273, 9135624);
            class220.method3784(field860 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3735(class174.field2644, field860 + 62, 15, 0, -1);
            if (Statics.field46 != null) {
                Statics.field46[1].method3846(field860 + 140, 1);
                arg1.method3702(class174.field2645, field860 + 152, 10, 16777215, -1);
                Statics.field46[0].method3846(field860 + 140, 12);
                arg1.method3702(class174.field2646, field860 + 152, 21, 16777215, -1);
            }
            if (Statics.field790 != null) {
                int var4 = field860 + 280;
                if (class30.field700[0] == 0 && class30.field699[0] == 0) {
                    Statics.field790[2].method3846(var4, 4);
                } else {
                    Statics.field790[0].method3846(var4, 4);
                }
                if (class30.field700[0] == 0 && class30.field699[0] == 1) {
                    Statics.field790[3].method3846(var4 + 15, 4);
                } else {
                    Statics.field790[1].method3846(var4 + 15, 4);
                }
                arg0.method3702(class174.field2647, var4 + 32, 17, 16777215, -1);
                int var5 = field860 + 390;
                if (class30.field700[0] == 1 && class30.field699[0] == 0) {
                    Statics.field790[2].method3846(var5, 4);
                } else {
                    Statics.field790[0].method3846(var5, 4);
                }
                if (class30.field700[0] == 1 && class30.field699[0] == 1) {
                    Statics.field790[3].method3846(var5 + 15, 4);
                } else {
                    Statics.field790[1].method3846(var5 + 15, 4);
                }
                arg0.method3702(class174.field2648, var5 + 32, 17, 16777215, -1);
                int var6 = field860 + 500;
                if (class30.field700[0] == 2 && class30.field699[0] == 0) {
                    Statics.field790[2].method3846(var6, 4);
                } else {
                    Statics.field790[0].method3846(var6, 4);
                }
                if (class30.field700[0] == 2 && class30.field699[0] == 1) {
                    Statics.field790[3].method3846(var6 + 15, 4);
                } else {
                    Statics.field790[1].method3846(var6 + 15, 4);
                }
                arg0.method3702(class174.field2641, var6 + 32, 17, 16777215, -1);
                int var7 = field860 + 610;
                if (class30.field700[0] == 3 && class30.field699[0] == 0) {
                    Statics.field790[2].method3846(var7, 4);
                } else {
                    Statics.field790[0].method3846(var7, 4);
                }
                if (class30.field700[0] == 3 && class30.field699[0] == 1) {
                    Statics.field790[3].method3846(var7 + 15, 4);
                } else {
                    Statics.field790[1].method3846(var7 + 15, 4);
                }
                arg0.method3702(class174.field2552, var7 + 32, 17, 16777215, -1);
            }
            class220.method3779(field860 + 708, 4, 50, 16, 0);
            arg1.method3735(class174.field2612, field860 + 708 + 25, 16, 16777215, -1);
            field867 = -1;
            if (Statics.field74 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field709) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field709) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field709) {
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
                int var19 = field860 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class30.field709; var22++) {
                    class30 var23 = Statics.field703[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field702);
                    if (var23.field702 == -1) {
                        var25 = class174.field2627;
                        var24 = false;
                    } else if (var23.field702 > 1980) {
                        var25 = class174.field2427;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method616()) {
                        if (var23.method629()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method597()) {
                        var26 = 16711680;
                        if (var23.method629()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method595()) {
                        if (var23.method629()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method629()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1818 >= var19 && class116.field1819 >= var18 && class116.field1818 < var8 + var19 && class116.field1819 < var9 + var18 && var24) {
                        field867 = var22;
                        Statics.field74[var27].method3901(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field74[var27].method3889(var19, var18);
                    }
                    if (Statics.field719 != null) {
                        Statics.field719[(var23.method629() ? 8 : 0) + var23.field706].method3846(var19 + 29, var18);
                    }
                    arg0.method3735(Integer.toString(var23.field701), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3735(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3672(Statics.field703[field867].field705) + 6;
                    int var29 = arg1.field3118 + 8;
                    class220.method3779(class116.field1818 - var28 / 2, class116.field1819 + 20 + 5, var28, var29, 16777120);
                    class220.method3785(class116.field1818 - var28 / 2, class116.field1819 + 20 + 5, var28, var29, 0);
                    arg1.method3735(Statics.field703[field867].field705, class116.field1818, class116.field1819 + 20 + 5 + arg1.field3118 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field900.getGraphics();
                Statics.field1828.method3762(var30, 0, 0);
            } catch (Exception var114) {
                Statics.field900.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field839.method3889(field860, 0);
            Statics.field8.method3889(field860 + 382, 0);
            Statics.field840.method3846(field860 + 382 - Statics.field840.field3214 / 2, 18);
        }
        if (client.field362 == 0 || client.field362 == 5) {
            byte var32 = 20;
            arg0.method3735(class174.field2633, field848 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3785(field848 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3785(field848 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3779(field848 + 180 - 150, var33 + 2, field852 * 3, 30, 9179409);
            class220.method3779(field852 * 3 + (field848 + 180 - 150), var33 + 2, 300 - field852 * 3, 30, 0);
            arg0.method3735(field853, field848 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field362 == 20) {
            Statics.field837.method3846(field848 + 180 - Statics.field837.field3214 / 2, 271 - Statics.field837.field3211 / 2);
            short var34 = 211;
            arg0.method3735(field856, field848 + 180, var34, 16776960, 0);
            int var116 = var34 + 15;
            arg0.method3735(field863, field848 + 180, var116, 16776960, 0);
            int var117 = var116 + 15;
            arg0.method3735(field858, field848 + 180, var117, 16776960, 0);
            int var118 = var117 + 15;
            int var119 = var118 + 10;
            if (field854 != 4) {
                arg0.method3702(class174.field2465, field848 + 180 - 110, var119, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field865; arg0.method3672(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3702(class210.method3675(var36), field848 + 180 - 70, var119, 16777215, 0);
                var116 = var119 + 15;
                String var38 = class174.field2606;
                String var39 = field869;
                String var40 = class208.method2986('*', var39.length());
                arg0.method3702(var38 + var40, field848 + 180 - 108, var116, 16777215, 0);
                var116 += 15;
            }
        }
        if (client.field362 == 10 || client.field362 == 11) {
            Statics.field837.method3846(field848, 171);
            if (field854 == 0) {
                short var41 = 251;
                arg0.method3735(class174.field2608, field848 + 180, var41, 16776960, 0);
                int var120 = var41 + 30;
                int var42 = field848 + 180 - 80;
                short var43 = 291;
                Statics.field1562.method3846(var42 - 73, var43 - 20);
                arg0.method3680(class174.field2609, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field848 + 180 + 80;
                Statics.field1562.method3846(var44 - 73, var43 - 20);
                arg0.method3680(class174.field2610, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field854 == 1) {
                arg0.method3735(field855, field848 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3735(field856, field848 + 180, var45, 16777215, 0);
                int var121 = var45 + 15;
                arg0.method3735(field863, field848 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method3735(field858, field848 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                int var46 = field848 + 180 - 80;
                short var47 = 321;
                Statics.field1562.method3846(var46 - 73, var47 - 20);
                arg0.method3735(class174.field2545, var46, var47 + 5, 16777215, 0);
                int var48 = field848 + 180 + 80;
                Statics.field1562.method3846(var48 - 73, var47 - 20);
                arg0.method3735(class174.field2612, var48, var47 + 5, 16777215, 0);
            } else if (field854 == 2) {
                short var49 = 211;
                arg0.method3735(field856, field848 + 180, var49, 16776960, 0);
                int var124 = var49 + 15;
                arg0.method3735(field863, field848 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method3735(field858, field848 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 10;
                arg0.method3702(class174.field2465, field848 + 180 - 110, var127, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field865; arg0.method3672(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3702(class210.method3675(var51) + (field872 == 0 & client.field312 % 40 < 20 ? class38.method154(16776960) + class38.field804 : ""), field848 + 180 - 70, var127, 16777215, 0);
                var124 = var127 + 15;
                arg0.method3702(class174.field2606 + class208.method3755(field869) + (field872 == 1 & client.field312 % 40 < 20 ? class38.method154(16776960) + class38.field804 : ""), field848 + 180 - 108, var124, 16777215, 0);
                var124 += 15;
                int var52 = field848 + 180 - 80;
                short var53 = 321;
                Statics.field1562.method3846(var52 - 73, var53 - 20);
                arg0.method3735(class174.field2487, var52, var53 + 5, 16777215, 0);
                int var54 = field848 + 180 + 80;
                Statics.field1562.method3846(var54 - 73, var53 - 20);
                arg0.method3735(class174.field2612, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3735(class174.field2618, field848 + 180, var55, 16776960, 0);
            } else if (field854 == 3) {
                short var56 = 201;
                arg0.method3735(class174.field2613, field848 + 180, var56, 16776960, 0);
                int var128 = var56 + 20;
                arg1.method3735(class174.field2501, field848 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg1.method3735(class174.field2615, field848 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var57 = field848 + 180;
                short var58 = 276;
                Statics.field1562.method3846(var57 - 73, var58 - 20);
                arg2.method3735(class174.field2616, var57, var58 + 5, 16777215, 0);
                int var59 = field848 + 180;
                short var60 = 326;
                Statics.field1562.method3846(var59 - 73, var60 - 20);
                arg2.method3735(class174.field2617, var59, var60 + 5, 16777215, 0);
            } else if (field854 == 4) {
                arg0.method3735(class174.field2490, field848 + 180, 211, 16776960, 0);
                short var61 = 236;
                arg0.method3735(field856, field848 + 180, var61, 16777215, 0);
                int var131 = var61 + 15;
                arg0.method3735(field863, field848 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method3735(field858, field848 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                String var63 = class174.field2607;
                String var64 = Statics.field221;
                String var65 = class208.method2986('*', var64.length());
                arg0.method3702(var63 + var65 + (client.field312 % 40 < 20 ? class38.method154(16776960) + class38.field804 : ""), field848 + 180 - 108, var133, 16777215, 0);
                int var134 = var133 - 8;
                arg0.method3702(class174.field2383, field848 + 180 - 9, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method3702(class174.field2384, field848 + 180 - 9, var135, 16776960, 0);
                int var66 = field848 + 180 - 9 + arg0.method3672(class174.field2384) + 15;
                int var67 = var135 - arg0.field3118;
                class223 var68;
                if (field862) {
                    var68 = Statics.field952;
                } else {
                    var68 = Statics.field2374;
                }
                var68.method3846(var66, var67);
                var131 = var135 + 15;
                int var69 = field848 + 180 - 80;
                short var70 = 321;
                Statics.field1562.method3846(var69 - 73, var70 - 20);
                arg0.method3735(class174.field2545, var69, var70 + 5, 16777215, 0);
                int var71 = field848 + 180 + 80;
                Statics.field1562.method3846(var71 - 73, var70 - 20);
                arg0.method3735(class174.field2612, var71, var70 + 5, 16777215, 0);
                arg1.method3735(class174.field2513, field848 + 180, var70 + 36, 255, 0);
            } else if (field854 == 5) {
                arg0.method3735(class174.field2619, field848 + 180, 201, 16776960, 0);
                short var72 = 221;
                arg2.method3735(field856, field848 + 180, var72, 16776960, 0);
                int var136 = var72 + 15;
                arg2.method3735(field863, field848 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg2.method3735(field858, field848 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var139 = var138 + 14;
                arg0.method3702(class174.field2539, field848 + 180 - 145, var139, 16777215, 0);
                short var73 = 174;
                String var74;
                for (var74 = field865; arg0.method3672(var74) > var73; var74 = var74.substring(1)) {
                }
                arg0.method3702(class210.method3675(var74) + (client.field312 % 40 < 20 ? class38.method154(16776960) + class38.field804 : ""), field848 + 180 - 34, var139, 16777215, 0);
                var136 = var139 + 15;
                int var75 = field848 + 180 - 80;
                short var76 = 321;
                Statics.field1562.method3846(var75 - 73, var76 - 20);
                arg0.method3735(class174.field2514, var75, var76 + 5, 16777215, 0);
                int var77 = field848 + 180 + 80;
                Statics.field1562.method3846(var77 - 73, var76 - 20);
                arg0.method3735(class174.field2622, var77, var76 + 5, 16777215, 0);
            } else if (field854 == 6) {
                short var78 = 211;
                arg0.method3735(field856, field848 + 180, var78, 16776960, 0);
                int var140 = var78 + 15;
                arg0.method3735(field863, field848 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg0.method3735(field858, field848 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var79 = field848 + 180;
                short var80 = 321;
                Statics.field1562.method3846(var79 - 73, var80 - 20);
                arg0.method3735(class174.field2622, var79, var80 + 5, 16777215, 0);
            }
        }
        if (field850 > 0) {
            method1478(field850);
            field850 = 0;
        }
        short var81 = 256;
        if (field846 > 0) {
            for (int var82 = 0; var82 < 256; var82++) {
                if (field846 > 768) {
                    Statics.field1934[var82] = method1579(Statics.field1123[var82], Statics.field159[var82], 1024 - field846);
                } else if (field846 > 256) {
                    Statics.field1934[var82] = Statics.field159[var82];
                } else {
                    Statics.field1934[var82] = method1579(Statics.field159[var82], Statics.field1123[var82], 256 - field846);
                }
            }
        } else if (field847 > 0) {
            for (int var83 = 0; var83 < 256; var83++) {
                if (field847 > 768) {
                    Statics.field1934[var83] = method1579(Statics.field1123[var83], Statics.field868[var83], 1024 - field847);
                } else if (field847 > 256) {
                    Statics.field1934[var83] = Statics.field868[var83];
                } else {
                    Statics.field1934[var83] = method1579(Statics.field868[var83], Statics.field1123[var83], 256 - field847);
                }
            }
        } else {
            for (int var84 = 0; var84 < 256; var84++) {
                Statics.field1934[var84] = Statics.field1123[var84];
            }
        }
        class220.method3773(field860, 9, field860 + 128, var81 + 7);
        Statics.field839.method3889(field860, 0);
        class220.method3772();
        int var85 = 0;
        int var86 = field860 + Statics.field1828.field3199 * 9;
        for (int var87 = 1; var87 < var81 - 1; var87++) {
            int var88 = (var81 - var87) * field844[var87] / var81;
            int var89 = var88 + 22;
            if (var89 < 0) {
                var89 = 0;
            }
            var85 += var89;
            for (int var90 = var89; var90 < 128; var90++) {
                int var91 = Statics.field604[var85++];
                if (var91 == 0) {
                    var86++;
                } else {
                    int var93 = 256 - var91;
                    int var94 = Statics.field1934[var91];
                    int var95 = Statics.field1828.field3197[var86];
                    Statics.field1828.field3197[var86++] = ((var94 & 0xFF00FF) * var91 + (var95 & 0xFF00FF) * var93 & 0xFF00FF00) + ((var94 & 0xFF00) * var91 + (var95 & 0xFF00) * var93 & 0xFF0000) >> 8;
                }
            }
            var86 += Statics.field1828.field3199 + var89 - 128;
        }
        class220.method3773(field860 + 765 - 128, 9, field860 + 765, var81 + 7);
        Statics.field8.method3889(field860 + 382, 0);
        class220.method3772();
        int var96 = 0;
        int var97 = field860 + Statics.field1828.field3199 * 9 + 24 + 637;
        for (int var98 = 1; var98 < var81 - 1; var98++) {
            int var99 = (var81 - var98) * field844[var98] / var81;
            int var100 = 103 - var99;
            int var101 = var97 + var99;
            for (int var102 = 0; var102 < var100; var102++) {
                int var103 = Statics.field604[var96++];
                if (var103 == 0) {
                    var101++;
                } else {
                    int var105 = 256 - var103;
                    int var106 = Statics.field1934[var103];
                    int var107 = Statics.field1828.field3197[var101];
                    Statics.field1828.field3197[var101++] = ((var106 & 0xFF00) * var103 + (var107 & 0xFF00) * var105 & 0xFF0000) + ((var106 & 0xFF00FF) * var103 + (var107 & 0xFF00FF) * var105 & 0xFF00FF00) >> 8;
                }
            }
            var96 += 128 - var100;
            var97 = Statics.field1828.field3199 - var100 - var99 + var101;
        }
        Statics.field841[Statics.field2059.field720 ? 1 : 0].method3846(field860 + 765 - 40, 463);
        if (client.field362 > 5 && client.field309 == 0) {
            if (Statics.field1859 == null) {
                Statics.field1859 = class226.method31(Statics.field1218, "sl_button", "");
            } else {
                int var108 = field860 + 5;
                short var109 = 463;
                byte var110 = 100;
                byte var111 = 35;
                Statics.field1859.method3846(var108, var109);
                arg0.method3735(class174.field2538 + " " + client.field301, var110 / 2 + var108, var111 / 2 + var109 - 2, 16777215, 0);
                if (Statics.field177 == null) {
                    arg1.method3735(class174.field2654, var110 / 2 + var108, var111 / 2 + var109 + 12, 16777215, 0);
                } else {
                    arg1.method3735(class174.field2653, var110 / 2 + var108, var111 / 2 + var109 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var112 = Statics.field900.getGraphics();
            Statics.field1828.method3762(var112, 0, 0);
        } catch (Exception var115) {
            Statics.field900.repaint();
        }
    }

    @ObfuscatedName("be.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1158(String arg0, String arg1, String arg2) {
        field856 = arg0;
        field863 = arg1;
        field858 = arg2;
    }

    @ObfuscatedName("j.w(Lhy;I)V")
    public static final void method139(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field160.length; var2++) {
            Statics.field160[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field160[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field84[var8] = (Statics.field160[var8 - 1] + Statics.field160[var8 + 1] + Statics.field160[var8 - 128] + Statics.field160[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field160;
            Statics.field160 = Statics.field84;
            Statics.field84 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3211; var11++) {
            for (int var12 = 0; var12 < arg0.field3214; var12++) {
                if (arg0.field3208[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3212;
                    int var14 = var11 + 16 + arg0.field3210;
                    int var15 = (var14 << 7) + var13;
                    Statics.field160[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cl.j(II)V")
    public static final void method1478(int arg0) {
        short var1 = 256;
        field857 += arg0 * 128;
        if (field857 > Statics.field160.length) {
            field857 -= Statics.field160.length;
            int var2 = (int) (Math.random() * 12.0D);
            method139(Statics.field838[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field604[var3 + var4] - Statics.field160[field857 + var3 & Statics.field160.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field604[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field604[var9 + var10] = 255;
                } else {
                    Statics.field604[var9 + var10] = 0;
                }
            }
        }
        if (field846 > 0) {
            field846 -= arg0 * 4;
        }
        if (field847 > 0) {
            field847 -= arg0 * 4;
        }
        if (field846 == 0 && field847 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field846 = 1024;
            }
            if (var12 == 1) {
                field847 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field844[var13] = field844[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field844[var14] = (int) (Math.sin((double) field851 / 14.0D) * 16.0D + Math.sin((double) field851 / 15.0D) * 14.0D + Math.sin((double) field851 / 16.0D) * 12.0D);
            field851++;
        }
        field845 += arg0 * -3166747;
        int var15 = ((client.field312 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field845 * 1794775188; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field604[(var18 << 7) + var17] = 192;
        }
        field845 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field604[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field604[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field250[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field250[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field250[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field604[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cg.s(IIIB)I")
    public static final int method1579(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("h.q(Ldn;B)V")
    public static void method27(class114 arg0) {
        if (class116.field1824 != 1 && Statics.field2688 || class116.field1824 != 4) {
            return;
        }
        int var1 = field860 + 280;
        if (class116.field1826 >= var1 && class116.field1826 <= var1 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(0, 0);
            return;
        }
        if (class116.field1826 >= var1 + 15 && class116.field1826 <= var1 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(0, 1);
            return;
        }
        int var2 = field860 + 390;
        if (class116.field1826 >= var2 && class116.field1826 <= var2 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(1, 0);
            return;
        }
        if (class116.field1826 >= var2 + 15 && class116.field1826 <= var2 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(1, 1);
            return;
        }
        int var3 = field860 + 500;
        if (class116.field1826 >= var3 && class116.field1826 <= var3 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(2, 0);
            return;
        }
        if (class116.field1826 >= var3 + 15 && class116.field1826 <= var3 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(2, 1);
            return;
        }
        int var4 = field860 + 610;
        if (class116.field1826 >= var4 && class116.field1826 <= var4 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(3, 0);
            return;
        }
        if (class116.field1826 >= var4 + 15 && class116.field1826 <= var4 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
            class30.method187(3, 1);
            return;
        }
        if (class116.field1826 >= field860 + 708 && class116.field1814 >= 4 && class116.field1826 <= field860 + 708 + 50 && class116.field1814 <= 20) {
            field866 = false;
            Statics.field839.method3889(field860, 0);
            Statics.field8.method3889(field860 + 382, 0);
            Statics.field840.method3846(field860 + 382 - Statics.field840.field3214 / 2, 18);
            return;
        }
        if (field867 == -1) {
            return;
        }
        class30 var5 = Statics.field703[field867];
        method2568(var5);
        field866 = false;
        Statics.field839.method3889(field860, 0);
        Statics.field8.method3889(field860 + 382, 0);
        Statics.field840.method3846(field860 + 382 - Statics.field840.field3214 / 2, 18);
        return;
    }

    @ObfuscatedName("eh.d(Lah;I)V")
    public static void method2568(class30 arg0) {
        if (arg0.method629() != client.field306) {
            client.field306 = arg0.method629();
            class199.method3323(arg0.method629());
        }
        Statics.field34 = arg0.field704;
        client.field301 = arg0.field701;
        client.field302 = arg0.field692;
        Statics.field1672 = client.field581 == 0 ? 43594 : arg0.field701 + 40000;
        Statics.field5 = client.field581 == 0 ? 443 : arg0.field701 + 50000;
        Statics.field432 = Statics.field1672;
    }

    @ObfuscatedName("fx.p(I)V")
    public static void method2879() {
        if (class30.method717()) {
            field866 = true;
        }
    }
}
