package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ay")
public class class34 {

    @ObfuscatedName("ay.q")
    public static int field730 = 0;

    @ObfuscatedName("ay.s")
    public static int field751 = field730 + 202;

    @ObfuscatedName("ay.i")
    public static int[] field738 = new int[256];

    @ObfuscatedName("ay.x")
    public static int field740 = 0;

    @ObfuscatedName("ay.d")
    public static int field741 = 0;

    @ObfuscatedName("ay.av")
    public static int field735 = 0;

    @ObfuscatedName("ay.ad")
    public static int field744 = 0;

    @ObfuscatedName("ay.at")
    public static int field756 = 0;

    @ObfuscatedName("ay.aj")
    public static int field748 = 0;

    @ObfuscatedName("ay.am")
    public static int field745 = 10;

    @ObfuscatedName("ay.ay")
    public static String field743 = "";

    @ObfuscatedName("ay.ag")
    public static int field750 = 0;

    @ObfuscatedName("ay.aa")
    public static String field737 = "";

    @ObfuscatedName("ay.ak")
    public static String field760 = "";

    @ObfuscatedName("ay.ar")
    public static String field752 = "";

    @ObfuscatedName("ay.ax")
    public static String field753 = "";

    @ObfuscatedName("ay.ap")
    public static String field754 = "";

    @ObfuscatedName("ay.ao")
    public static String field755 = "";

    @ObfuscatedName("ay.aw")
    public static class163 field759 = class163.field2643;

    @ObfuscatedName("ay.an")
    public static boolean field758 = true;

    @ObfuscatedName("ay.au")
    public static int field729 = 0;

    @ObfuscatedName("ay.ac")
    public static String field747 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ay.ae")
    public static String field732 = "1234567890";

    @ObfuscatedName("ay.ah")
    public static boolean field762 = false;

    @ObfuscatedName("ay.bg")
    public static int field763 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.k(B)I")
    public static int method157() {
        return 9;
    }

    @ObfuscatedName("do.q(Ljava/awt/Component;Lfo;Lfo;ZIB)V")
    public static void method2349(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field746) {
            field750 = arg4;
            class83.method1764();
            byte[] var5 = arg1.method3089("title.jpg", "");
            Statics.field749 = new class82(var5, arg0);
            Statics.field733 = Statics.field749.method1646();
            if ((client.field367 & 0x20000000) == 0) {
                Statics.field734 = class80.method2134(arg2, "logo", "");
            } else {
                Statics.field734 = class80.method2134(arg2, "logo_deadman_mode", "");
            }
            Statics.field731 = class80.method2134(arg2, "titlebox", "");
            Statics.field3281 = class80.method2134(arg2, "titlebutton", "");
            Statics.field210 = class80.method950(arg2, "runes", "");
            Statics.field77 = class80.method950(arg2, "title_mute", "");
            Statics.field129 = class80.method2134(arg2, "options_radio_buttons,0", "");
            Statics.field1110 = class80.method2134(arg2, "options_radio_buttons,2", "");
            Statics.field595 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field595[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field595[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field595[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field595[var9 + 192] = 16777215;
            }
            Statics.field739 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field739[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field739[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field739[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field739[var13 + 192] = 16777215;
            }
            Statics.field583 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field583[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field583[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field583[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field583[var17 + 192] = 16777215;
            }
            Statics.field2946 = new int[256];
            Statics.field3203 = new int[32768];
            Statics.field716 = new int[32768];
            method151((class84) null);
            Statics.field154 = new int[32768];
            Statics.field742 = new int[32768];
            if (arg3) {
                field754 = "";
                field755 = "";
            }
            Statics.field757 = 0;
            Statics.field599 = "";
            field758 = true;
            field762 = false;
            if (Statics.field2103.field141) {
                class187.method158(2);
            } else {
                class172 var18 = Statics.field424;
                int var19 = var18.method3119("scape main");
                int var20 = var18.method3117(var19, "");
                class187.method2993(2, var18, var19, var20, 255, false);
            }
            class175.method2664(false);
            Statics.field746 = true;
            field730 = (Statics.field1653 - client.field496 * 765) / 2;
            field751 = field730 + 202;
            Statics.field749.method1664(field730, 0);
            Statics.field733.method1664(field730 + 382, 0);
            Statics.field734.method1808(field730 + 382 - Statics.field734.field1477 / 2, 18);
        } else if (arg4 == 4) {
            field750 = 4;
        }
    }

    @ObfuscatedName("m.f(Lez;S)V")
    public static void method92(class148 arg0) {
        if (field762) {
            method168(arg0);
            return;
        }
        if ((class144.field2207 == 1 || !Statics.field2067 && class144.field2207 == 4) && class144.field2208 >= field730 + 765 - 50 && class144.field2197 >= 453) {
            Statics.field2103.field141 = !Statics.field2103.field141;
            class9.method3732();
            if (Statics.field2103.field141) {
                Statics.field3009.method3504();
                class187.field3008 = 1;
                Statics.field2115 = null;
            } else {
                class187.method112(Statics.field424, "scape main", "", 255, false);
            }
        }
        if (client.field287 == 5) {
            return;
        }
        field756++;
        if (client.field287 != 10 && client.field287 != 11) {
            return;
        }
        if (client.field284 == 0) {
            if (class144.field2207 == 1 || !Statics.field2067 && class144.field2207 == 4) {
                int var1 = field730 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class144.field2208 >= var1 && class144.field2208 <= var1 + var3 && class144.field2197 >= var2 && class144.field2197 <= var2 + var4) {
                    if (class28.method51()) {
                        field762 = true;
                    }
                    return;
                }
            }
            if (Statics.field1623 != null && class28.method51()) {
                field762 = true;
            }
        }
        int var5 = class144.field2207;
        int var6 = class144.field2208;
        int var7 = class144.field2197;
        if (!Statics.field2067 && var5 == 4) {
            var5 = 1;
        }
        if (field750 == 0) {
            int var8 = field751 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                label614: {
                    String var10 = Statics.method114("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var10));
                            break label614;
                        } catch (Exception var40) {
                        }
                    }
                    if (class142.field2183.startsWith("win")) {
                        class142.method2970(var10, 0, "openjs");
                    } else if (class142.field2183.startsWith("mac")) {
                        class142.method2970(var10, 1, "openjs");
                    } else {
                        class142.method2970(var10, 2, "openjs");
                    }
                }
            }
            int var12 = field751 + 180 + 80;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field367 & 0x2000000) != 0) {
                    field737 = "";
                    field760 = class161.field2578;
                    field752 = class161.field2579;
                    field753 = class161.field2580;
                    field750 = 1;
                    field729 = 0;
                } else if ((client.field367 & 0x4) != 0) {
                    if ((client.field367 & 0x400) == 0) {
                        field760 = class161.field2569;
                        field752 = class161.field2570;
                        field753 = class161.field2571;
                    } else {
                        field760 = class161.field2469;
                        field752 = class161.field2356;
                        field753 = class161.field2577;
                    }
                    field737 = class161.field2568;
                    field750 = 1;
                    field729 = 0;
                } else if ((client.field367 & 0x400) == 0) {
                    field760 = class161.field2412;
                    field752 = class161.field2566;
                    field753 = class161.field2620;
                    field750 = 2;
                    field729 = 0;
                } else {
                    field760 = class161.field2572;
                    field752 = class161.field2573;
                    field753 = class161.field2430;
                    field737 = class161.field2568;
                    field750 = 1;
                    field729 = 0;
                }
            }
        } else if (field750 == 1) {
            while (class141.method3()) {
                if (Statics.field198 == 84) {
                    field760 = class161.field2412;
                    field752 = class161.field2566;
                    field753 = class161.field2620;
                    field750 = 2;
                    field729 = 0;
                } else if (Statics.field198 == 13) {
                    field750 = 0;
                }
            }
            int var13 = field751 + 180 - 80;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field760 = class161.field2412;
                field752 = class161.field2566;
                field753 = class161.field2620;
                field750 = 2;
                field729 = 0;
            }
            int var15 = field751 + 180 + 80;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field750 = 0;
            }
        } else if (field750 == 2) {
            short var16 = 231;
            int var42 = var16 + 30;
            if (var5 == 1 && var7 >= var42 - 15 && var7 < var42) {
                field729 = 0;
            }
            var42 += 15;
            if (var5 == 1 && var7 >= var42 - 15 && var7 < var42) {
                field729 = 1;
            }
            var42 += 15;
            short var17 = 361;
            if (var5 == 1 && var7 >= var17 - 15 && var7 < var17) {
                method1041(class161.field2604, class161.field2605, class161.field2524);
                field750 = 5;
                return;
            }
            int var18 = field751 + 180 - 80;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field754 = field754.trim();
                if (field754.length() == 0) {
                    method1041(class161.field2471, class161.field2472, class161.field2473);
                    return;
                }
                if (field755.length() == 0) {
                    method1041(class161.field2474, class161.field2434, class161.field2476);
                    return;
                }
                method1041(class161.field2583, class161.field2584, class161.field2585);
                field759 = Statics.field2103.field140.containsKey(class167.method2368(field754)) ? class163.field2647 : class163.field2643;
                client.method2704(20);
                return;
            }
            int var20 = field751 + 180 + 80;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field750 = 0;
                field754 = "";
                field755 = "";
                Statics.field757 = 0;
                Statics.field599 = "";
                field758 = true;
            }
            while (true) {
                while (class141.method3()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field747.length(); var22++) {
                        if (Statics.field1745 == field747.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field198 == 13) {
                        field750 = 0;
                        field754 = "";
                        field755 = "";
                        Statics.field757 = 0;
                        Statics.field599 = "";
                        field758 = true;
                    } else if (field729 == 0) {
                        if (Statics.field198 == 85 && field754.length() > 0) {
                            field754 = field754.substring(0, field754.length() - 1);
                        }
                        if (Statics.field198 == 84 || Statics.field198 == 80) {
                            field729 = 1;
                        }
                        if (var21 && field754.length() < 320) {
                            field754 = field754 + Statics.field1745;
                        }
                    } else if (field729 == 1) {
                        if (Statics.field198 == 85 && field755.length() > 0) {
                            field755 = field755.substring(0, field755.length() - 1);
                        }
                        if (Statics.field198 == 84 || Statics.field198 == 80) {
                            field729 = 0;
                        }
                        if (Statics.field198 == 84) {
                            field754 = field754.trim();
                            if (field754.length() == 0) {
                                method1041(class161.field2471, class161.field2472, class161.field2473);
                                return;
                            }
                            if (field755.length() == 0) {
                                method1041(class161.field2474, class161.field2434, class161.field2476);
                                return;
                            }
                            method1041(class161.field2583, class161.field2584, class161.field2585);
                            field759 = Statics.field2103.field140.containsKey(class167.method2368(field754)) ? class163.field2647 : class163.field2643;
                            client.method2704(20);
                            return;
                        }
                        if (var21 && field755.length() < 20) {
                            field755 = field755 + Statics.field1745;
                        }
                    }
                }
                return;
            }
        } else if (field750 == 3) {
            int var23 = field751 + 180;
            short var24 = 276;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                field760 = class161.field2412;
                field752 = class161.field2566;
                field753 = class161.field2620;
                field750 = 2;
                field729 = 0;
            }
            int var25 = field751 + 180;
            short var26 = 326;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                method1041(class161.field2604, class161.field2605, class161.field2524);
                field750 = 5;
                return;
            }
        } else if (field750 == 4) {
            int var27 = field751 + 180 - 80;
            short var28 = 321;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                Statics.field599.trim();
                if (Statics.field599.length() != 6) {
                    method1041(class161.field2390, class161.field2496, class161.field2392);
                    return;
                }
                Statics.field757 = Integer.parseInt(Statics.field599);
                Statics.field599 = "";
                field759 = field758 ? class163.field2642 : class163.field2645;
                method1041(class161.field2583, class161.field2584, class161.field2585);
                client.method2704(20);
                return;
            }
            if (var5 == 1 && var6 >= field751 + 180 - 9 && var6 <= field751 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field758 = !field758;
            }
            if (var5 == 1 && var6 >= field751 + 180 - 34 && var6 <= field751 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                label629: {
                    String var29 = Statics.method114("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var29));
                            break label629;
                        } catch (Exception var41) {
                        }
                    }
                    if (class142.field2183.startsWith("win")) {
                        class142.method2970(var29, 0, "openjs");
                    } else if (class142.field2183.startsWith("mac")) {
                        class142.method2970(var29, 1, "openjs");
                    } else {
                        class142.method2970(var29, 2, "openjs");
                    }
                }
            }
            int var31 = field751 + 180 + 80;
            if (var5 == 1 && var6 >= var31 - 75 && var6 <= var31 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                field750 = 0;
                field754 = "";
                field755 = "";
                Statics.field757 = 0;
                Statics.field599 = "";
            }
            while (class141.method3()) {
                boolean var32 = false;
                for (int var33 = 0; var33 < field732.length(); var33++) {
                    if (Statics.field1745 == field732.charAt(var33)) {
                        var32 = true;
                        break;
                    }
                }
                if (Statics.field198 == 13) {
                    field750 = 0;
                    field754 = "";
                    field755 = "";
                    Statics.field757 = 0;
                    Statics.field599 = "";
                } else {
                    if (Statics.field198 == 85 && Statics.field599.length() > 0) {
                        Statics.field599 = Statics.field599.substring(0, Statics.field599.length() - 1);
                    }
                    if (Statics.field198 == 84) {
                        Statics.field599.trim();
                        if (Statics.field599.length() != 6) {
                            method1041(class161.field2390, class161.field2496, class161.field2392);
                            return;
                        }
                        Statics.field757 = Integer.parseInt(Statics.field599);
                        Statics.field599 = "";
                        field759 = field758 ? class163.field2642 : class163.field2645;
                        method1041(class161.field2583, class161.field2584, class161.field2585);
                        client.method2704(20);
                        return;
                    }
                    if (var32 && Statics.field599.length() < 6) {
                        Statics.field599 = Statics.field599 + Statics.field1745;
                    }
                }
            }
        } else if (field750 == 5) {
            int var34 = field751 + 180 - 80;
            short var35 = 321;
            if (var5 == 1 && var6 >= var34 - 75 && var6 <= var34 + 75 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                method130();
                return;
            }
            int var36 = field751 + 180 + 80;
            if (var5 == 1 && var6 >= var36 - 75 && var6 <= var36 + 75 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                field760 = class161.field2412;
                field752 = class161.field2566;
                field753 = class161.field2620;
                field750 = 2;
                field729 = 0;
                field755 = "";
            }
            while (class141.method3()) {
                boolean var37 = false;
                for (int var38 = 0; var38 < field747.length(); var38++) {
                    if (Statics.field1745 == field747.charAt(var38)) {
                        var37 = true;
                        break;
                    }
                }
                if (Statics.field198 == 13) {
                    field760 = class161.field2412;
                    field752 = class161.field2566;
                    field753 = class161.field2620;
                    field750 = 2;
                    field729 = 0;
                    field755 = "";
                } else {
                    if (Statics.field198 == 85 && field754.length() > 0) {
                        field754 = field754.substring(0, field754.length() - 1);
                    }
                    if (Statics.field198 == 84) {
                        method130();
                        return;
                    }
                    if (var37 && field754.length() < 320) {
                        field754 = field754 + Statics.field1745;
                    }
                }
            }
        } else if (field750 == 6) {
            while (true) {
                do {
                    if (!class141.method3()) {
                        short var39 = 321;
                        if (var5 == 1 && var7 >= var39 - 20 && var7 <= var39 + 20) {
                            field760 = class161.field2412;
                            field752 = class161.field2566;
                            field753 = class161.field2620;
                            field750 = 2;
                            field729 = 0;
                            field755 = "";
                        }
                        return;
                    }
                } while (Statics.field198 != 84 && Statics.field198 != 13);
                field760 = class161.field2412;
                field752 = class161.field2566;
                field753 = class161.field2620;
                field750 = 2;
                field729 = 0;
                field755 = "";
            }
        }
    }

    @ObfuscatedName("b.c(I)V")
    public static void method130() {
        field754 = field754.trim();
        if (field754.length() == 0) {
            method1041(class161.field2604, class161.field2605, class161.field2524);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(Statics.method114("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class123 var4 = new class123(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2054, var4.field2060, 1000 - var4.field2060);
                if (var5 == -1) {
                    var4.field2060 = 0;
                    long var8 = var4.method2560();
                    var6 = var8;
                    break;
                }
                var4.field2060 += var5;
                if (var4.field2060 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var39) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field754;
            Random var15 = new Random();
            class123 var16 = new class123(128);
            class123 var17 = new class123(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2412(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2415(var15.nextInt());
            }
            var16.method2415(var18[0]);
            var16.method2415(var18[1]);
            var16.method2523(var6);
            var16.method2523(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2415(var15.nextInt());
            }
            var16.method2448(class10.field147, class10.field148);
            var17.method2412(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2415(var15.nextInt());
            }
            var17.method2523(var15.nextLong());
            var17.method2490(var15.nextLong());
            Statics.method2350(var17);
            var17.method2523(var15.nextLong());
            var17.method2448(class10.field147, class10.field148);
            int var22 = class123.method667(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class123 var23 = new class123(var22);
            var23.method2418(var14);
            var23.field2060 = var22;
            var23.method2444(var18);
            class123 var24 = new class123(var23.field2060 + var17.field2060 + var16.field2060 + 5);
            var24.method2412(2);
            var24.method2412(var16.field2060);
            var24.method2421(var16.field2054, 0, var16.field2060);
            var24.method2412(var17.field2060);
            var24.method2421(var17.field2054, 0, var17.field2060);
            var24.method2494(var23.field2060);
            var24.method2421(var23.field2054, 0, var23.field2060);
            String var25 = class165.method2808(var24.field2054);
            byte var32;
            try {
                URL var26 = new URL(Statics.method114("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class230.method996(var25) + "&dest=" + class230.method996("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class123 var30 = new class123(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2054, var30.field2060, 1000 - var30.field2060);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2054);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2445(var18);
                            while (var30.field2060 > 0 && var30.field2054[var30.field2060 - 1] == 0) {
                                var30.field2060--;
                            }
                            String var34 = new String(var30.field2054, 0, var30.field2060);
                            if (class10.method1631(var34)) {
                                label109: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var34));
                                            break label109;
                                        } catch (Exception var37) {
                                        }
                                    }
                                    if (class142.field2183.startsWith("win")) {
                                        class142.method2970(var34, 0, "openjs");
                                    } else if (class142.field2183.startsWith("mac")) {
                                        class142.method2970(var34, 1, "openjs");
                                    } else {
                                        class142.method2970(var34, 2, "openjs");
                                    }
                                }
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2060 += var31;
                    if (var30.field2060 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var38) {
                var38.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method1041(class161.field2607, class161.field2608, class161.field2609);
                field750 = 6;
                break;
            case 3:
                method1041(class161.field2621, class161.field2611, class161.field2363);
                break;
            case 4:
                method1041(class161.field2613, class161.field2463, class161.field2615);
                break;
            case 5:
                method1041(class161.field2616, class161.field2617, class161.field2367);
                break;
            case 6:
                method1041(class161.field2619, class161.field2523, class161.field2548);
                break;
            case 7:
                method1041(class161.field2622, class161.field2623, class161.field2624);
        }
    }

    @ObfuscatedName("ax.v(Lhd;Lhd;Lhd;ZI)V")
    public static void method734(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field730 = (Statics.field1653 - client.field496 * 765) / 2;
            field751 = field730 + 202;
        }
        if (field762) {
            if (Statics.field1829 == null) {
                Statics.field1829 = class80.method2625(Statics.field2093, "sl_back", "");
            }
            if (Statics.field166 == null) {
                Statics.field166 = class80.method950(Statics.field2093, "sl_flags", "");
            }
            if (Statics.field1945 == null) {
                Statics.field1945 = class80.method950(Statics.field2093, "sl_arrows", "");
            }
            if (Statics.field1943 == null) {
                Statics.field1943 = class80.method950(Statics.field2093, "sl_stars", "");
            }
            class83.method1782(field730, 23, 765, 480, 0);
            class83.method1760(field730, 0, 125, 23, 12425273, 9135624);
            class83.method1760(field730 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3811(class161.field2625, field730 + 62, 15, 0, -1);
            if (Statics.field1943 != null) {
                Statics.field1943[1].method1808(field730 + 140, 1);
                arg1.method3870(class161.field2422, field730 + 152, 10, 16777215, -1);
                Statics.field1943[0].method1808(field730 + 140, 12);
                arg1.method3870(class161.field2627, field730 + 152, 21, 16777215, -1);
            }
            if (Statics.field1945 != null) {
                int var4 = field730 + 280;
                if (class28.field646[0] == 0 && class28.field645[0] == 0) {
                    Statics.field1945[2].method1808(var4, 4);
                } else {
                    Statics.field1945[0].method1808(var4, 4);
                }
                if (class28.field646[0] == 0 && class28.field645[0] == 1) {
                    Statics.field1945[3].method1808(var4 + 15, 4);
                } else {
                    Statics.field1945[1].method1808(var4 + 15, 4);
                }
                arg0.method3870(class161.field2628, var4 + 32, 17, 16777215, -1);
                int var5 = field730 + 390;
                if (class28.field646[0] == 1 && class28.field645[0] == 0) {
                    Statics.field1945[2].method1808(var5, 4);
                } else {
                    Statics.field1945[0].method1808(var5, 4);
                }
                if (class28.field646[0] == 1 && class28.field645[0] == 1) {
                    Statics.field1945[3].method1808(var5 + 15, 4);
                } else {
                    Statics.field1945[1].method1808(var5 + 15, 4);
                }
                arg0.method3870(class161.field2507, var5 + 32, 17, 16777215, -1);
                int var6 = field730 + 500;
                if (class28.field646[0] == 2 && class28.field645[0] == 0) {
                    Statics.field1945[2].method1808(var6, 4);
                } else {
                    Statics.field1945[0].method1808(var6, 4);
                }
                if (class28.field646[0] == 2 && class28.field645[0] == 1) {
                    Statics.field1945[3].method1808(var6 + 15, 4);
                } else {
                    Statics.field1945[1].method1808(var6 + 15, 4);
                }
                arg0.method3870(class161.field2630, var6 + 32, 17, 16777215, -1);
                int var7 = field730 + 610;
                if (class28.field646[0] == 3 && class28.field645[0] == 0) {
                    Statics.field1945[2].method1808(var7, 4);
                } else {
                    Statics.field1945[0].method1808(var7, 4);
                }
                if (class28.field646[0] == 3 && class28.field645[0] == 1) {
                    Statics.field1945[3].method1808(var7 + 15, 4);
                } else {
                    Statics.field1945[1].method1808(var7 + 15, 4);
                }
                arg0.method3870(class161.field2433, var7 + 32, 17, 16777215, -1);
            }
            class83.method1782(field730 + 708, 4, 50, 16, 0);
            arg1.method3811(class161.field2593, field730 + 708 + 25, 16, 16777215, -1);
            field763 = -1;
            if (Statics.field1829 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class28.field657) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class28.field657) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class28.field657) {
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
                int var19 = field730 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class28.field657; var22++) {
                    class28 var23 = Statics.field1172[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field656);
                    if (var23.field656 == -1) {
                        var25 = class161.field2632;
                        var24 = false;
                    } else if (var23.field656 > 1980) {
                        var25 = class161.field2633;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method617()) {
                        if (var23.method612()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method616()) {
                        var26 = 16711680;
                        if (var23.method612()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method640()) {
                        if (var23.method612()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method612()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class144.field2201 >= var19 && class144.field2205 * 5099509 >= var18 && class144.field2201 < var8 + var19 && class144.field2205 * 5099509 < var9 + var18 && var24) {
                        field763 = var22;
                        Statics.field1829[var27].method1650(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1829[var27].method1664(var19, var18);
                    }
                    if (Statics.field166 != null) {
                        Statics.field166[(var23.method612() ? 8 : 0) + var23.field655].method1808(var19 + 29, var18);
                    }
                    arg0.method3811(Integer.toString(var23.field647), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3811(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3799(Statics.field1172[field763].field648) + 6;
                    int var29 = arg1.field3241 + 8;
                    class83.method1782(class144.field2201 - var28 / 2, class144.field2205 * 5099509 + 20 + 5, var28, var29, 16777120);
                    class83.method1742(class144.field2201 - var28 / 2, class144.field2205 * 5099509 + 20 + 5, var28, var29, 0);
                    arg1.method3811(Statics.field1172[field763].field648, class144.field2201, class144.field2205 * 5099509 + 20 + 5 + arg1.field3241 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field1697.getGraphics();
                Statics.field1028.method1588(var30, 0, 0);
            } catch (Exception var145) {
                Statics.field1697.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field749.method1664(field730, 0);
            Statics.field733.method1664(field730 + 382, 0);
            Statics.field734.method1808(field730 + 382 - Statics.field734.field1477 / 2, 18);
        }
        if (client.field287 == 0 || client.field287 == 5) {
            byte var32 = 20;
            arg0.method3811(class161.field2561, field751 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class83.method1742(field751 + 180 - 152, var33, 304, 34, 9179409);
            class83.method1742(field751 + 180 - 151, var33 + 1, 302, 32, 0);
            class83.method1782(field751 + 180 - 150, var33 + 2, field745 * 3, 30, 9179409);
            class83.method1782(field745 * 3 + (field751 + 180 - 150), var33 + 2, 300 - field745 * 3, 30, 0);
            arg0.method3811(field743, field751 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field287 == 20) {
            Statics.field731.method1808(field751 + 180 - Statics.field731.field1477 / 2, 271 - Statics.field731.field1478 / 2);
            short var34 = 211;
            arg0.method3811(field760, field751 + 180, var34, 16776960, 0);
            int var147 = var34 + 15;
            arg0.method3811(field752, field751 + 180, var147, 16776960, 0);
            int var148 = var147 + 15;
            arg0.method3811(field753, field751 + 180, var148, 16776960, 0);
            int var149 = var148 + 15;
            int var150 = var149 + 10;
            if (field750 != 4) {
                arg0.method3870(class161.field2586, field751 + 180 - 110, var150, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field754; arg0.method3799(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3870(class227.method3812(var36), field751 + 180 - 70, var150, 16777215, 0);
                var147 = var150 + 15;
                String var38 = class161.field2587;
                String var39 = field755;
                String var40 = class167.method2133('*', var39.length());
                arg0.method3870(var38 + var40, field751 + 180 - 108, var147, 16777215, 0);
                var147 += 15;
            }
        }
        if (client.field287 == 10 || client.field287 == 11) {
            Statics.field731.method1808(field751, 171);
            if (field750 == 0) {
                short var41 = 251;
                arg0.method3811(class161.field2415, field751 + 180, var41, 16776960, 0);
                int var151 = var41 + 30;
                int var42 = field751 + 180 - 80;
                short var43 = 291;
                Statics.field3281.method1808(var42 - 73, var43 - 20);
                arg0.method3807(class161.field2574, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field751 + 180 + 80;
                Statics.field3281.method1808(var44 - 73, var43 - 20);
                arg0.method3807(class161.field2591, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field750 == 1) {
                arg0.method3811(field737, field751 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3811(field760, field751 + 180, var45, 16777215, 0);
                int var152 = var45 + 15;
                arg0.method3811(field752, field751 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                arg0.method3811(field753, field751 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                int var46 = field751 + 180 - 80;
                short var47 = 321;
                Statics.field3281.method1808(var46 - 73, var47 - 20);
                arg0.method3811(class161.field2479, var46, var47 + 5, 16777215, 0);
                int var48 = field751 + 180 + 80;
                Statics.field3281.method1808(var48 - 73, var47 - 20);
                arg0.method3811(class161.field2593, var48, var47 + 5, 16777215, 0);
            } else if (field750 == 2) {
                short var49 = 211;
                arg0.method3811(field760, field751 + 180, var49, 16776960, 0);
                int var155 = var49 + 15;
                arg0.method3811(field752, field751 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method3811(field753, field751 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var158 = var157 + 10;
                arg0.method3870(class161.field2586, field751 + 180 - 110, var158, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field754; arg0.method3799(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3870(class227.method3812(var51) + (field729 == 0 & client.field289 % 40 < 20 ? class2.method2855(16776960) + class2.field26 : ""), field751 + 180 - 70, var158, 16777215, 0);
                var155 = var158 + 15;
                String var53 = class161.field2587;
                String var54 = field755;
                String var55 = class167.method2133('*', var54.length());
                arg0.method3870(var53 + var55 + (field729 == 1 & client.field289 % 40 < 20 ? class2.method2855(16776960) + class2.field26 : ""), field751 + 180 - 108, var155, 16777215, 0);
                var155 += 15;
                int var56 = field751 + 180 - 80;
                short var57 = 321;
                Statics.field3281.method1808(var56 - 73, var57 - 20);
                arg0.method3811(class161.field2592, var56, var57 + 5, 16777215, 0);
                int var58 = field751 + 180 + 80;
                Statics.field3281.method1808(var58 - 73, var57 - 20);
                arg0.method3811(class161.field2593, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                arg1.method3811(class161.field2594, field751 + 180, var59, 16776960, 0);
            } else if (field750 == 3) {
                short var60 = 201;
                arg0.method3811(class161.field2590, field751 + 180, var60, 16776960, 0);
                int var159 = var60 + 20;
                arg1.method3811(class161.field2382, field751 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg1.method3811(class161.field2596, field751 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var61 = field751 + 180;
                short var62 = 276;
                Statics.field3281.method1808(var61 - 73, var62 - 20);
                arg2.method3811(class161.field2597, var61, var62 + 5, 16777215, 0);
                int var63 = field751 + 180;
                short var64 = 326;
                Statics.field3281.method1808(var63 - 73, var64 - 20);
                arg2.method3811(class161.field2598, var63, var64 + 5, 16777215, 0);
            } else if (field750 == 4) {
                arg0.method3811(class161.field2391, field751 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3811(field760, field751 + 180, var65, 16777215, 0);
                int var162 = var65 + 15;
                arg0.method3811(field752, field751 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method3811(field753, field751 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                String var67 = class161.field2588;
                String var68 = Statics.field599;
                String var69 = class167.method2133('*', var68.length());
                arg0.method3870(var67 + var69 + (client.field289 % 40 < 20 ? class2.method2855(16776960) + class2.field26 : ""), field751 + 180 - 108, var164, 16777215, 0);
                int var165 = var164 - 8;
                arg0.method3870(class161.field2626, field751 + 180 - 9, var165, 16776960, 0);
                int var166 = var165 + 15;
                arg0.method3870(class161.field2365, field751 + 180 - 9, var166, 16776960, 0);
                int var70 = field751 + 180 - 9 + arg0.method3799(class161.field2365) + 15;
                int var71 = var166 - arg0.field3241;
                class84 var72;
                if (field758) {
                    var72 = Statics.field1110;
                } else {
                    var72 = Statics.field129;
                }
                var72.method1808(var70, var71);
                var162 = var166 + 15;
                int var73 = field751 + 180 - 80;
                short var74 = 321;
                Statics.field3281.method1808(var73 - 73, var74 - 20);
                arg0.method3811(class161.field2479, var73, var74 + 5, 16777215, 0);
                int var75 = field751 + 180 + 80;
                Statics.field3281.method1808(var75 - 73, var74 - 20);
                arg0.method3811(class161.field2593, var75, var74 + 5, 16777215, 0);
                arg1.method3811(class161.field2582, field751 + 180, var74 + 36, 255, 0);
            } else if (field750 == 5) {
                arg0.method3811(class161.field2600, field751 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3811(field760, field751 + 180, var76, 16776960, 0);
                int var167 = var76 + 15;
                arg2.method3811(field752, field751 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                arg2.method3811(field753, field751 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                int var170 = var169 + 14;
                arg0.method3870(class161.field2601, field751 + 180 - 145, var170, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field754; arg0.method3799(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3870(class227.method3812(var78) + (client.field289 % 40 < 20 ? class2.method2855(16776960) + class2.field26 : ""), field751 + 180 - 34, var170, 16777215, 0);
                var167 = var170 + 15;
                int var79 = field751 + 180 - 80;
                short var80 = 321;
                Statics.field3281.method1808(var79 - 73, var80 - 20);
                arg0.method3811(class161.field2602, var79, var80 + 5, 16777215, 0);
                int var81 = field751 + 180 + 80;
                Statics.field3281.method1808(var81 - 73, var80 - 20);
                arg0.method3811(class161.field2603, var81, var80 + 5, 16777215, 0);
            } else if (field750 == 6) {
                short var82 = 211;
                arg0.method3811(field760, field751 + 180, var82, 16776960, 0);
                int var171 = var82 + 15;
                arg0.method3811(field752, field751 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg0.method3811(field753, field751 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var83 = field751 + 180;
                short var84 = 321;
                Statics.field3281.method1808(var83 - 73, var84 - 20);
                arg0.method3811(class161.field2603, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field756 > 0) {
            int var85 = field756;
            short var86 = 256;
            field735 += var85 * 128;
            if (field735 > Statics.field3203.length) {
                field735 -= Statics.field3203.length;
                int var87 = (int) (Math.random() * 12.0D);
                method151(Statics.field210[var87]);
            }
            int var88 = 0;
            int var89 = var85 * 128;
            int var90 = (var86 - var85) * 128;
            for (int var91 = 0; var91 < var90; var91++) {
                int var92 = Statics.field154[var88 + var89] - Statics.field3203[field735 + var88 & Statics.field3203.length - 1] * var85 / 6;
                if (var92 < 0) {
                    var92 = 0;
                }
                Statics.field154[var88++] = var92;
            }
            for (int var93 = var86 - var85; var93 < var86; var93++) {
                int var94 = var93 * 128;
                for (int var95 = 0; var95 < 128; var95++) {
                    int var96 = (int) (Math.random() * 100.0D);
                    if (var96 < 50 && var95 > 10 && var95 < 118) {
                        Statics.field154[var94 + var95] = 255;
                    } else {
                        Statics.field154[var94 + var95] = 0;
                    }
                }
            }
            if (field740 > 0) {
                field740 -= var85 * 4;
            }
            if (field741 > 0) {
                field741 -= var85 * 4;
            }
            if (field740 == 0 && field741 == 0) {
                int var97 = (int) (Math.random() * (double) (2000 / var85));
                if (var97 == 0) {
                    field740 = 1024;
                }
                if (var97 == 1) {
                    field741 = 1024;
                }
            }
            for (int var98 = 0; var98 < var86 - var85; var98++) {
                field738[var98] = field738[var85 + var98];
            }
            for (int var99 = var86 - var85; var99 < var86; var99++) {
                field738[var99] = (int) (Math.sin((double) field748 / 14.0D) * 16.0D + Math.sin((double) field748 / 15.0D) * 14.0D + Math.sin((double) field748 / 16.0D) * 12.0D);
                field748++;
            }
            field744 += var85 * -2083372593;
            int var100 = ((client.field289 & 0x1) + var85) / 2;
            if (var100 > 0) {
                for (int var101 = 0; var101 < field744 * -2086500772; var101++) {
                    int var102 = (int) (Math.random() * 124.0D) + 2;
                    int var103 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field154[(var103 << 7) + var102] = 192;
                }
                field744 = 0;
                int var104 = 0;
                label525: while (true) {
                    if (var104 >= var86) {
                        int var108 = 0;
                        while (true) {
                            if (var108 >= 128) {
                                break label525;
                            }
                            int var109 = 0;
                            for (int var110 = -var100; var110 < var86; var110++) {
                                int var111 = var110 * 128;
                                if (var100 + var110 < var86) {
                                    var109 += Statics.field742[var100 * 128 + var108 + var111];
                                }
                                if (var110 - (var100 + 1) >= 0) {
                                    var109 -= Statics.field742[var108 + var111 - (var100 + 1) * 128];
                                }
                                if (var110 >= 0) {
                                    Statics.field154[var108 + var111] = var109 / (var100 * 2 + 1);
                                }
                            }
                            var108++;
                        }
                    }
                    int var105 = 0;
                    int var106 = var104 * 128;
                    for (int var107 = -var100; var107 < 128; var107++) {
                        if (var100 + var107 < 128) {
                            var105 += Statics.field154[var106 + var107 + var100];
                        }
                        if (var107 - (var100 + 1) >= 0) {
                            var105 -= Statics.field154[var106 + var107 - (var100 + 1)];
                        }
                        if (var107 >= 0) {
                            Statics.field742[var106 + var107] = var105 / (var100 * 2 + 1);
                        }
                    }
                    var104++;
                }
            }
            field756 = 0;
        }
        short var112 = 256;
        if (field740 > 0) {
            for (int var113 = 0; var113 < 256; var113++) {
                if (field740 > 768) {
                    Statics.field2946[var113] = method1008(Statics.field595[var113], Statics.field739[var113], 1024 - field740);
                } else if (field740 > 256) {
                    Statics.field2946[var113] = Statics.field739[var113];
                } else {
                    Statics.field2946[var113] = method1008(Statics.field739[var113], Statics.field595[var113], 256 - field740);
                }
            }
        } else if (field741 > 0) {
            for (int var114 = 0; var114 < 256; var114++) {
                if (field741 > 768) {
                    Statics.field2946[var114] = method1008(Statics.field595[var114], Statics.field583[var114], 1024 - field741);
                } else if (field741 > 256) {
                    Statics.field2946[var114] = Statics.field583[var114];
                } else {
                    Statics.field2946[var114] = method1008(Statics.field583[var114], Statics.field595[var114], 256 - field741);
                }
            }
        } else {
            for (int var115 = 0; var115 < 256; var115++) {
                Statics.field2946[var115] = Statics.field595[var115];
            }
        }
        class83.method1731(field730, 9, field730 + 128, var112 + 7);
        Statics.field749.method1664(field730, 0);
        class83.method1730();
        int var116 = 0;
        int var117 = field730 + Statics.field1028.field1445 * 9;
        for (int var118 = 1; var118 < var112 - 1; var118++) {
            int var119 = (var112 - var118) * field738[var118] / var112;
            int var120 = var119 + 22;
            if (var120 < 0) {
                var120 = 0;
            }
            var116 += var120;
            for (int var121 = var120; var121 < 128; var121++) {
                int var122 = Statics.field154[var116++];
                if (var122 == 0) {
                    var117++;
                } else {
                    int var124 = 256 - var122;
                    int var125 = Statics.field2946[var122];
                    int var126 = Statics.field1028.field1444[var117];
                    Statics.field1028.field1444[var117++] = ((var125 & 0xFF00) * var122 + (var126 & 0xFF00) * var124 & 0xFF0000) + ((var125 & 0xFF00FF) * var122 + (var126 & 0xFF00FF) * var124 & 0xFF00FF00) >> 8;
                }
            }
            var117 += Statics.field1028.field1445 + var120 - 128;
        }
        class83.method1731(field730 + 765 - 128, 9, field730 + 765, var112 + 7);
        Statics.field733.method1664(field730 + 382, 0);
        class83.method1730();
        int var127 = 0;
        int var128 = field730 + Statics.field1028.field1445 * 9 + 24 + 637;
        for (int var129 = 1; var129 < var112 - 1; var129++) {
            int var130 = (var112 - var129) * field738[var129] / var112;
            int var131 = 103 - var130;
            int var132 = var128 + var130;
            for (int var133 = 0; var133 < var131; var133++) {
                int var134 = Statics.field154[var127++];
                if (var134 == 0) {
                    var132++;
                } else {
                    int var136 = 256 - var134;
                    int var137 = Statics.field2946[var134];
                    int var138 = Statics.field1028.field1444[var132];
                    Statics.field1028.field1444[var132++] = ((var137 & 0xFF00) * var134 + (var138 & 0xFF00) * var136 & 0xFF0000) + ((var137 & 0xFF00FF) * var134 + (var138 & 0xFF00FF) * var136 & 0xFF00FF00) >> 8;
                }
            }
            var127 += 128 - var131;
            var128 = Statics.field1028.field1445 - var131 - var130 + var132;
        }
        Statics.field77[Statics.field2103.field141 ? 1 : 0].method1808(field730 + 765 - 40, 463);
        if (client.field287 > 5 && client.field284 == 0) {
            if (Statics.field60 == null) {
                Statics.field60 = class80.method2134(Statics.field2093, "sl_button", "");
            } else {
                int var139 = field730 + 5;
                short var140 = 463;
                byte var141 = 100;
                byte var142 = 35;
                Statics.field60.method1808(var139, var140);
                arg0.method3811(class161.field2519 + " " + client.field383, var141 / 2 + var139, var142 / 2 + var140 - 2, 16777215, 0);
                if (Statics.field1623 == null) {
                    arg1.method3811(class161.field2393, var141 / 2 + var139, var142 / 2 + var140 + 12, 16777215, 0);
                } else {
                    arg1.method3811(class161.field2634, var141 / 2 + var139, var142 / 2 + var140 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var143 = Statics.field1697.getGraphics();
            Statics.field1028.method1588(var143, 0, 0);
        } catch (Exception var146) {
            Statics.field1697.repaint();
        }
    }

    @ObfuscatedName("ab.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1041(String arg0, String arg1, String arg2) {
        field760 = arg0;
        field752 = arg1;
        field753 = arg2;
    }

    @ObfuscatedName("s.m(Lcu;I)V")
    public static final void method151(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3203.length; var2++) {
            Statics.field3203[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3203[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field716[var8] = (Statics.field3203[var8 - 1] + Statics.field3203[var8 + 1] + Statics.field3203[var8 - 128] + Statics.field3203[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3203;
            Statics.field3203 = Statics.field716;
            Statics.field716 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1478; var11++) {
            for (int var12 = 0; var12 < arg0.field1477; var12++) {
                if (arg0.field1479[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1480;
                    int var14 = var11 + 16 + arg0.field1476;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3203[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("as.y(IIIB)I")
    public static final int method1008(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("i.u(Lez;B)V")
    public static void method168(class148 arg0) {
        if (class144.field2207 != 1 && Statics.field2067 || class144.field2207 != 4) {
            return;
        }
        int var1 = field730 + 280;
        if (class144.field2208 >= var1 && class144.field2208 <= var1 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(0, 0);
            return;
        }
        if (class144.field2208 >= var1 + 15 && class144.field2208 <= var1 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(0, 1);
            return;
        }
        int var2 = field730 + 390;
        if (class144.field2208 >= var2 && class144.field2208 <= var2 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(1, 0);
            return;
        }
        if (class144.field2208 >= var2 + 15 && class144.field2208 <= var2 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(1, 1);
            return;
        }
        int var3 = field730 + 500;
        if (class144.field2208 >= var3 && class144.field2208 <= var3 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(2, 0);
            return;
        }
        if (class144.field2208 >= var3 + 15 && class144.field2208 <= var3 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(2, 1);
            return;
        }
        int var4 = field730 + 610;
        if (class144.field2208 >= var4 && class144.field2208 <= var4 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(3, 0);
            return;
        }
        if (class144.field2208 >= var4 + 15 && class144.field2208 <= var4 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
            class28.method3746(3, 1);
            return;
        }
        if (class144.field2208 >= field730 + 708 && class144.field2197 >= 4 && class144.field2208 <= field730 + 708 + 50 && class144.field2197 <= 20) {
            field762 = false;
            Statics.field749.method1664(field730, 0);
            Statics.field733.method1664(field730 + 382, 0);
            Statics.field734.method1808(field730 + 382 - Statics.field734.field1477 / 2, 18);
            return;
        }
        if (field763 == -1) {
            return;
        }
        class28 var5 = Statics.field1172[field763];
        method2688(var5);
        field762 = false;
        Statics.field749.method1664(field730, 0);
        Statics.field733.method1664(field730 + 382, 0);
        Statics.field734.method1808(field730 + 382 - Statics.field734.field1477 / 2, 18);
        return;
    }

    @ObfuscatedName("dt.h(Lal;I)V")
    public static void method2688(class28 arg0) {
        if (arg0.method612() != client.field282) {
            client.field282 = arg0.method612();
            class56.method2136(arg0.method612());
        }
        Statics.field2069 = arg0.field650;
        client.field383 = arg0.field647;
        client.field367 = arg0.field649;
        Statics.field318 = client.field280 == 0 ? 43594 : arg0.field647 + 40000;
        Statics.field804 = client.field280 == 0 ? 443 : arg0.field647 + 50000;
        Statics.field2042 = Statics.field318;
    }
}
