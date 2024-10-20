package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("aw")
public class class34 {

    @ObfuscatedName("aw.e")
    public static int field721 = 0;

    @ObfuscatedName("aw.d")
    public static int field731 = field721 + 202;

    @ObfuscatedName("aw.j")
    public static int[] field738 = new int[256];

    @ObfuscatedName("aw.p")
    public static int field735 = 0;

    @ObfuscatedName("aw.y")
    public static int field736 = 0;

    @ObfuscatedName("aw.ah")
    public static int field740 = 0;

    @ObfuscatedName("aw.ax")
    public static int field733 = 0;

    @ObfuscatedName("aw.ar")
    public static int field720 = 0;

    @ObfuscatedName("aw.ae")
    public static int field739 = 0;

    @ObfuscatedName("aw.ac")
    public static int field742 = 10;

    @ObfuscatedName("aw.aw")
    public static String field743 = "";

    @ObfuscatedName("aw.am")
    public static int field744 = 0;

    @ObfuscatedName("aw.aq")
    public static String field741 = "";

    @ObfuscatedName("aw.at")
    public static String field746 = "";

    @ObfuscatedName("aw.aa")
    public static String field747 = "";

    @ObfuscatedName("aw.as")
    public static String field748 = "";

    @ObfuscatedName("aw.ao")
    public static String field758 = "";

    @ObfuscatedName("aw.ai")
    public static String field725 = "";

    @ObfuscatedName("aw.ap")
    public static class163 field727 = class163.field2637;

    @ObfuscatedName("aw.az")
    public static boolean field752 = true;

    @ObfuscatedName("aw.au")
    public static int field745 = 0;

    @ObfuscatedName("aw.af")
    public static String field754 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aw.al")
    public static String field755 = "1234567890";

    @ObfuscatedName("aw.ad")
    public static boolean field756 = false;

    @ObfuscatedName("aw.bv")
    public static int field753 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.f(B)I")
    public static int method2996() {
        return 9;
    }

    @ObfuscatedName("v.e(Ljava/awt/Component;Lfj;Lfj;ZIB)V")
    public static void method51(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field722) {
            field744 = arg4;
            class83.method1751();
            byte[] var5 = arg1.method3088("title.jpg", "");
            Statics.field732 = new class82(var5, arg0);
            Statics.field726 = Statics.field732.method1722();
            if ((client.field356 & 0x20000000) == 0) {
                Statics.field750 = class80.method48(arg2, "logo", "");
            } else {
                Statics.field750 = class80.method48(arg2, "logo_deadman_mode", "");
            }
            Statics.field749 = class80.method48(arg2, "titlebox", "");
            Statics.field723 = class80.method48(arg2, "titlebutton", "");
            Statics.field724 = class80.method1042(arg2, "runes", "");
            Statics.field2700 = class80.method1042(arg2, "title_mute", "");
            Statics.field728 = class80.method48(arg2, "options_radio_buttons,0", "");
            Statics.field729 = class80.method48(arg2, "options_radio_buttons,2", "");
            Statics.field1436 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1436[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1436[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1436[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1436[var9 + 192] = 16777215;
            }
            Statics.field212 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field212[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field212[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field212[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field212[var13 + 192] = 16777215;
            }
            Statics.field71 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field71[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field71[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field71[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field71[var17 + 192] = 16777215;
            }
            Statics.field734 = new int[256];
            Statics.field686 = new int[32768];
            Statics.field3047 = new int[32768];
            method997((class84) null);
            Statics.field737 = new int[32768];
            Statics.field3210 = new int[32768];
            if (arg3) {
                field758 = "";
                field725 = "";
            }
            Statics.field1050 = 0;
            Statics.field578 = "";
            field752 = true;
            field756 = false;
            if (Statics.field233.field139) {
                class187.method141(2);
            } else {
                class172 var18 = Statics.field1051;
                int var19 = var18.method3102("scape main");
                int var20 = var18.method3164(var19, "");
                class187.method3021(2, var18, var19, var20, 255, false);
            }
            class175.method169(false);
            Statics.field722 = true;
            field721 = (Statics.field2297 - client.field437) / 2;
            field731 = field721 + 202;
            Statics.field732.method1668(field721, 0);
            Statics.field726.method1668(field721 + 382, 0);
            Statics.field750.method1820(field721 + 382 - Statics.field750.field1476 / 2, 18);
        } else if (arg4 == 4) {
            field744 = 4;
        }
    }

    @ObfuscatedName("dp.n(Lex;S)V")
    public static void method2333(class148 arg0) {
        if (!field756) {
            if ((class144.field2199 == 1 || !Statics.field277 && class144.field2199 == 4) && class144.field2198 >= field721 + 765 - 50 && class144.field2208 >= 453) {
                Statics.field233.field139 = !Statics.field233.field139;
                class9.method188();
                if (Statics.field233.field139) {
                    class187.method2981();
                } else {
                    class172 var6 = Statics.field1051;
                    int var7 = var6.method3102("scape main");
                    int var8 = var6.method3164(var7, "");
                    class187.method17(var6, var7, var8, 255, false);
                }
            }
            if (client.field289 != 5) {
                field720++;
                if (client.field289 == 10 || client.field289 == 11) {
                    if (client.field288 == 0) {
                        if (class144.field2199 == 1 || !Statics.field277 && class144.field2199 == 4) {
                            int var9 = field721 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class144.field2198 >= var9 && class144.field2198 <= var9 + var11 && class144.field2208 >= var10 && class144.field2208 <= var10 + var12) {
                                method713();
                                return;
                            }
                        }
                        if (Statics.field191 != null) {
                            method713();
                        }
                    }
                    int var13 = class144.field2199;
                    int var14 = class144.field2198;
                    int var15 = class144.field2208;
                    if (!Statics.field277 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field744 == 0) {
                        int var16 = field731 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            label696: {
                                String var18 = client.method2684("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var18));
                                        break label696;
                                    } catch (Exception var46) {
                                    }
                                }
                                if (class142.field2181.startsWith("win")) {
                                    class142.method560(var18, 0);
                                } else if (class142.field2181.startsWith("mac")) {
                                    class142.method1586(var18, 1, "openjs");
                                } else {
                                    class142.method560(var18, 2);
                                }
                            }
                        }
                        int var20 = field731 + 180 + 80;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field356 & 0x2000000) != 0) {
                                field741 = "";
                                field746 = class161.field2591;
                                field747 = class161.field2571;
                                field748 = class161.field2572;
                                field744 = 1;
                                field745 = 0;
                            } else if ((client.field356 & 0x4) != 0) {
                                if ((client.field356 & 0x400) == 0) {
                                    field746 = class161.field2596;
                                    field747 = class161.field2427;
                                    field748 = class161.field2563;
                                } else {
                                    field746 = class161.field2502;
                                    field747 = class161.field2568;
                                    field748 = class161.field2569;
                                }
                                field741 = class161.field2560;
                                field744 = 1;
                                field745 = 0;
                            } else if ((client.field356 & 0x400) == 0) {
                                field746 = class161.field2489;
                                field747 = class161.field2558;
                                field748 = class161.field2429;
                                field744 = 2;
                                field745 = 0;
                            } else {
                                field746 = class161.field2564;
                                field747 = class161.field2565;
                                field748 = class161.field2588;
                                field741 = class161.field2560;
                                field744 = 1;
                                field745 = 0;
                            }
                        }
                    } else if (field744 == 1) {
                        while (class141.method3786()) {
                            if (Statics.field2162 == 84) {
                                field746 = class161.field2489;
                                field747 = class161.field2558;
                                field748 = class161.field2429;
                                field744 = 2;
                                field745 = 0;
                            } else if (Statics.field2162 == 13) {
                                field744 = 0;
                            }
                        }
                        int var21 = field731 + 180 - 80;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field746 = class161.field2489;
                            field747 = class161.field2558;
                            field748 = class161.field2429;
                            field744 = 2;
                            field745 = 0;
                        }
                        int var23 = field731 + 180 + 80;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field744 = 0;
                        }
                    } else if (field744 == 2) {
                        short var24 = 231;
                        int var47 = var24 + 30;
                        if (var13 == 1 && var15 >= var47 - 15 && var15 < var47) {
                            field745 = 0;
                        }
                        var47 += 15;
                        if (var13 == 1 && var15 >= var47 - 15 && var15 < var47) {
                            field745 = 1;
                        }
                        var47 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            method1253(class161.field2526, class161.field2454, class161.field2598);
                            field744 = 5;
                            return;
                        }
                        int var26 = field731 + 180 - 80;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field758 = field758.trim();
                            if (field758.length() == 0) {
                                method1253(class161.field2463, class161.field2464, class161.field2348);
                                return;
                            }
                            if (field725.length() == 0) {
                                method1253(class161.field2466, class161.field2626, class161.field2468);
                                return;
                            }
                            method1253(class161.field2575, class161.field2576, class161.field2577);
                            field727 = Statics.field233.field141.containsKey(class167.method1582(field758)) ? class163.field2639 : class163.field2637;
                            client.method919(20);
                            return;
                        }
                        int var28 = field731 + 180 + 80;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field744 = 0;
                            field758 = "";
                            field725 = "";
                            Statics.field1050 = 0;
                            Statics.field578 = "";
                            field752 = true;
                        }
                        while (true) {
                            while (class141.method3786()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field754.length(); var30++) {
                                    if (Statics.field2164 == field754.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2162 == 13) {
                                    field744 = 0;
                                    field758 = "";
                                    field725 = "";
                                    Statics.field1050 = 0;
                                    Statics.field578 = "";
                                    field752 = true;
                                } else if (field745 == 0) {
                                    if (Statics.field2162 == 85 && field758.length() > 0) {
                                        field758 = field758.substring(0, field758.length() - 1);
                                    }
                                    if (Statics.field2162 == 84 || Statics.field2162 == 80) {
                                        field745 = 1;
                                    }
                                    if (var29 && field758.length() < 320) {
                                        field758 = field758 + Statics.field2164;
                                    }
                                } else if (field745 == 1) {
                                    if (Statics.field2162 == 85 && field725.length() > 0) {
                                        field725 = field725.substring(0, field725.length() - 1);
                                    }
                                    if (Statics.field2162 == 84 || Statics.field2162 == 80) {
                                        field745 = 0;
                                    }
                                    if (Statics.field2162 == 84) {
                                        field758 = field758.trim();
                                        if (field758.length() == 0) {
                                            method1253(class161.field2463, class161.field2464, class161.field2348);
                                            return;
                                        }
                                        if (field725.length() == 0) {
                                            method1253(class161.field2466, class161.field2626, class161.field2468);
                                            return;
                                        }
                                        method1253(class161.field2575, class161.field2576, class161.field2577);
                                        field727 = Statics.field233.field141.containsKey(class167.method1582(field758)) ? class163.field2639 : class163.field2637;
                                        client.method919(20);
                                        return;
                                    }
                                    if (var29 && field725.length() < 20) {
                                        field725 = field725 + Statics.field2164;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field744 == 3) {
                        int var31 = field731 + 180;
                        short var32 = 276;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field746 = class161.field2489;
                            field747 = class161.field2558;
                            field748 = class161.field2429;
                            field744 = 2;
                            field745 = 0;
                        }
                        int var33 = field731 + 180;
                        short var34 = 326;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            method1253(class161.field2526, class161.field2454, class161.field2598);
                            field744 = 5;
                            return;
                        }
                    } else if (field744 == 4) {
                        int var35 = field731 + 180 - 80;
                        short var36 = 321;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            Statics.field578.trim();
                            if (Statics.field578.length() != 6) {
                                method1253(class161.field2420, class161.field2383, class161.field2384);
                                return;
                            }
                            Statics.field1050 = Integer.parseInt(Statics.field578);
                            Statics.field578 = "";
                            field727 = field752 ? class163.field2636 : class163.field2638;
                            method1253(class161.field2575, class161.field2576, class161.field2577);
                            client.method919(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field731 + 180 - 9 && var14 <= field731 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field752 = !field752;
                        }
                        if (var13 == 1 && var14 >= field731 + 180 - 34 && var14 <= field731 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class142.method2275(client.method2684("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var37 = field731 + 180 + 80;
                        if (var13 == 1 && var14 >= var37 - 75 && var14 <= var37 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            field744 = 0;
                            field758 = "";
                            field725 = "";
                            Statics.field1050 = 0;
                            Statics.field578 = "";
                        }
                        while (class141.method3786()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field755.length(); var39++) {
                                if (Statics.field2164 == field755.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field2162 == 13) {
                                field744 = 0;
                                field758 = "";
                                field725 = "";
                                Statics.field1050 = 0;
                                Statics.field578 = "";
                            } else {
                                if (Statics.field2162 == 85 && Statics.field578.length() > 0) {
                                    Statics.field578 = Statics.field578.substring(0, Statics.field578.length() - 1);
                                }
                                if (Statics.field2162 == 84) {
                                    Statics.field578.trim();
                                    if (Statics.field578.length() != 6) {
                                        method1253(class161.field2420, class161.field2383, class161.field2384);
                                        return;
                                    }
                                    Statics.field1050 = Integer.parseInt(Statics.field578);
                                    Statics.field578 = "";
                                    field727 = field752 ? class163.field2636 : class163.field2638;
                                    method1253(class161.field2575, class161.field2576, class161.field2577);
                                    client.method919(20);
                                    return;
                                }
                                if (var38 && Statics.field578.length() < 6) {
                                    Statics.field578 = Statics.field578 + Statics.field2164;
                                }
                            }
                        }
                    } else if (field744 == 5) {
                        int var40 = field731 + 180 - 80;
                        short var41 = 321;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var41 - 20 && var15 <= var41 + 20) {
                            method2990();
                            return;
                        }
                        int var42 = field731 + 180 + 80;
                        if (var13 == 1 && var14 >= var42 - 75 && var14 <= var42 + 75 && var15 >= var41 - 20 && var15 <= var41 + 20) {
                            field746 = class161.field2489;
                            field747 = class161.field2558;
                            field748 = class161.field2429;
                            field744 = 2;
                            field745 = 0;
                            field725 = "";
                        }
                        while (class141.method3786()) {
                            boolean var43 = false;
                            for (int var44 = 0; var44 < field754.length(); var44++) {
                                if (Statics.field2164 == field754.charAt(var44)) {
                                    var43 = true;
                                    break;
                                }
                            }
                            if (Statics.field2162 == 13) {
                                field746 = class161.field2489;
                                field747 = class161.field2558;
                                field748 = class161.field2429;
                                field744 = 2;
                                field745 = 0;
                                field725 = "";
                            } else {
                                if (Statics.field2162 == 85 && field758.length() > 0) {
                                    field758 = field758.substring(0, field758.length() - 1);
                                }
                                if (Statics.field2162 == 84) {
                                    method2990();
                                    return;
                                }
                                if (var43 && field758.length() < 320) {
                                    field758 = field758 + Statics.field2164;
                                }
                            }
                        }
                    } else if (field744 == 6) {
                        while (true) {
                            do {
                                if (!class141.method3786()) {
                                    short var45 = 321;
                                    if (var13 == 1 && var15 >= var45 - 20 && var15 <= var45 + 20) {
                                        field746 = class161.field2489;
                                        field747 = class161.field2558;
                                        field748 = class161.field2429;
                                        field744 = 2;
                                        field745 = 0;
                                        field725 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2162 != 84 && Statics.field2162 != 13);
                            field746 = class161.field2489;
                            field747 = class161.field2558;
                            field748 = class161.field2429;
                            field744 = 2;
                            field745 = 0;
                            field725 = "";
                        }
                    }
                }
            }
        } else if (class144.field2199 == 1 || !Statics.field277 && class144.field2199 == 4) {
            int var1 = field721 + 280;
            if (class144.field2198 >= var1 && class144.field2198 <= var1 + 14 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                class28.method8(0, 0);
            } else if (class144.field2198 >= var1 + 15 && class144.field2198 <= var1 + 80 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                class28.method8(0, 1);
            } else {
                int var2 = field721 + 390;
                if (class144.field2198 >= var2 && class144.field2198 <= var2 + 14 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                    class28.method8(1, 0);
                } else if (class144.field2198 >= var2 + 15 && class144.field2198 <= var2 + 80 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                    class28.method8(1, 1);
                } else {
                    int var3 = field721 + 500;
                    if (class144.field2198 >= var3 && class144.field2198 <= var3 + 14 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                        class28.method8(2, 0);
                    } else if (class144.field2198 >= var3 + 15 && class144.field2198 <= var3 + 80 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                        class28.method8(2, 1);
                    } else {
                        int var4 = field721 + 610;
                        if (class144.field2198 >= var4 && class144.field2198 <= var4 + 14 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                            class28.method8(3, 0);
                        } else if (class144.field2198 >= var4 + 15 && class144.field2198 <= var4 + 80 && class144.field2208 >= 4 && class144.field2208 <= 18) {
                            class28.method8(3, 1);
                        } else if (class144.field2198 >= field721 + 708 && class144.field2208 >= 4 && class144.field2198 <= field721 + 708 + 50 && class144.field2208 <= 20) {
                            field756 = false;
                            Statics.field732.method1668(field721, 0);
                            Statics.field726.method1668(field721 + 382, 0);
                            Statics.field750.method1820(field721 + 382 - Statics.field750.field1476 / 2, 18);
                        } else if (field753 != -1) {
                            class28 var5 = Statics.field650[field753];
                            method209(var5);
                            field756 = false;
                            Statics.field732.method1668(field721, 0);
                            Statics.field726.method1668(field721 + 382, 0);
                            Statics.field750.method1820(field721 + 382 - Statics.field750.field1476 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.t(B)V")
    public static void method2990() {
        field758 = field758.trim();
        if (field758.length() == 0) {
            method1253(class161.field2526, class161.field2454, class161.field2598);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2684("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2053, var4.field2052, 1000 - var4.field2052);
                if (var5 == -1) {
                    var4.field2052 = 0;
                    long var8 = var4.method2405();
                    var6 = var8;
                    break;
                }
                var4.field2052 += var5;
                if (var4.field2052 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var45) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field758;
            Random var15 = new Random();
            class123 var16 = new class123(128);
            class123 var17 = new class123(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2384(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2387(var15.nextInt());
            }
            var16.method2387(var18[0]);
            var16.method2387(var18[1]);
            var16.method2389(var6);
            var16.method2389(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2387(var15.nextInt());
            }
            var16.method2420(class10.field155, class10.field162);
            var17.method2384(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2387(var15.nextInt());
            }
            var17.method2389(var15.nextLong());
            var17.method2388(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class153.field2276.method3963(0L);
                class153.field2276.method3980(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var44) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2393(var22, 0, 24);
            var17.method2389(var15.nextLong());
            var17.method2420(class10.field155, class10.field162);
            int var26 = class123.method1542(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class123 var27 = new class123(var26);
            var27.method2390(var14);
            var27.field2052 = var26;
            var27.method2416(var18);
            class123 var28 = new class123(var27.field2052 + var17.field2052 + var16.field2052 + 5);
            var28.method2384(2);
            var28.method2384(var16.field2052);
            var28.method2393(var16.field2053, 0, var16.field2052);
            var28.method2384(var17.field2052);
            var28.method2393(var17.field2053, 0, var17.field2052);
            var28.method2385(var27.field2052);
            var28.method2393(var27.field2053, 0, var27.field2052);
            String var29 = class165.method2110(var28.field2053);
            byte var36;
            try {
                URL var30 = new URL(client.method2684("services", false) + "m=accountappeal/login.ws");
                URLConnection var31 = var30.openConnection();
                var31.setDoInput(true);
                var31.setDoOutput(true);
                var31.setConnectTimeout(5000);
                OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
                var32.write("data2=" + class230.method3001(var29) + "&dest=" + class230.method3001("passwordchoice.ws"));
                var32.flush();
                InputStream var33 = var31.getInputStream();
                class123 var34 = new class123(new byte[1000]);
                while (true) {
                    int var35 = var33.read(var34.field2053, var34.field2052, 1000 - var34.field2052);
                    if (var35 == -1) {
                        var32.close();
                        var33.close();
                        String var37 = new String(var34.field2053);
                        if (var37.startsWith("OFFLINE")) {
                            var36 = 4;
                        } else if (var37.startsWith("WRONG")) {
                            var36 = 7;
                        } else if (var37.startsWith("RELOAD")) {
                            var36 = 3;
                        } else if (var37.startsWith("Not permitted for social network accounts.")) {
                            var36 = 6;
                        } else {
                            var34.method2417(var18);
                            while (var34.field2052 > 0 && var34.field2053[var34.field2052 - 1] == 0) {
                                var34.field2052--;
                            }
                            String var38 = new String(var34.field2053, 0, var34.field2052);
                            boolean var39;
                            if (var38 == null) {
                                var39 = false;
                            } else {
                                label114: {
                                    try {
                                        new URL(var38);
                                    } catch (MalformedURLException var42) {
                                        var39 = false;
                                        break label114;
                                    }
                                    var39 = true;
                                }
                            }
                            if (var39) {
                                class142.method2275(var38, true, false);
                                var36 = 2;
                            } else {
                                var36 = 5;
                            }
                        }
                        break;
                    }
                    var34.field2052 += var35;
                    if (var34.field2052 >= 1000) {
                        var36 = 5;
                        break;
                    }
                }
            } catch (Throwable var43) {
                var43.printStackTrace();
                var36 = 5;
            }
            var13 = var36;
        }
        switch(var13) {
            case 2:
                method1253(class161.field2599, class161.field2600, class161.field2601);
                field744 = 6;
                break;
            case 3:
                method1253(class161.field2602, class161.field2393, class161.field2507);
                break;
            case 4:
                method1253(class161.field2605, class161.field2501, class161.field2607);
                break;
            case 5:
                method1253(class161.field2608, class161.field2451, class161.field2610);
                break;
            case 6:
                method1253(class161.field2541, class161.field2612, class161.field2623);
                break;
            case 7:
                method1253(class161.field2625, class161.field2615, class161.field2616);
        }
    }

    @ObfuscatedName("eh.v(Lhq;Lhq;Lhq;ZI)V")
    public static void method2858(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field721 = (Statics.field2297 - client.field437) / 2;
            field731 = field721 + 202;
        }
        if (field756) {
            method611(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field732.method1668(field721, 0);
            Statics.field726.method1668(field721 + 382, 0);
            Statics.field750.method1820(field721 + 382 - Statics.field750.field1476 / 2, 18);
        }
        if (client.field289 == 0 || client.field289 == 5) {
            byte var4 = 20;
            arg0.method3855(class161.field2556, field731 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class83.method1759(field731 + 180 - 152, var5, 304, 34, 9179409);
            class83.method1759(field731 + 180 - 151, var5 + 1, 302, 32, 0);
            class83.method1768(field731 + 180 - 150, var5 + 2, field742 * 3, 30, 9179409);
            class83.method1768(field742 * 3 + (field731 + 180 - 150), var5 + 2, 300 - field742 * 3, 30, 0);
            arg0.method3855(field743, field731 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field289 == 20) {
            Statics.field749.method1820(field731 + 180 - Statics.field749.field1476 / 2, 271 - Statics.field749.field1474 / 2);
            short var6 = 211;
            arg0.method3855(field746, field731 + 180, var6, 16776960, 0);
            int var52 = var6 + 15;
            arg0.method3855(field747, field731 + 180, var52, 16776960, 0);
            int var53 = var52 + 15;
            arg0.method3855(field748, field731 + 180, var53, 16776960, 0);
            int var54 = var53 + 15;
            int var55 = var54 + 10;
            if (field744 != 4) {
                arg0.method3852(class161.field2578, field731 + 180 - 110, var55, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field758; arg0.method3847(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3852(class227.method3926(var8), field731 + 180 - 70, var55, 16777215, 0);
                var52 = var55 + 15;
                arg0.method3852(class161.field2579 + class167.method2787(field725), field731 + 180 - 108, var52, 16777215, 0);
                var52 += 15;
            }
        }
        if (client.field289 == 10 || client.field289 == 11) {
            Statics.field749.method1820(field731, 171);
            if (field744 == 0) {
                short var9 = 251;
                arg0.method3855(class161.field2581, field731 + 180, var9, 16776960, 0);
                int var56 = var9 + 30;
                int var10 = field731 + 180 - 80;
                short var11 = 291;
                Statics.field723.method1820(var10 - 73, var11 - 20);
                arg0.method3881(class161.field2582, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field731 + 180 + 80;
                Statics.field723.method1820(var12 - 73, var11 - 20);
                arg0.method3881(class161.field2583, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field744 == 1) {
                arg0.method3855(field741, field731 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3855(field746, field731 + 180, var13, 16777215, 0);
                int var57 = var13 + 15;
                arg0.method3855(field747, field731 + 180, var57, 16777215, 0);
                int var58 = var57 + 15;
                arg0.method3855(field748, field731 + 180, var58, 16777215, 0);
                int var59 = var58 + 15;
                int var14 = field731 + 180 - 80;
                short var15 = 321;
                Statics.field723.method1820(var14 - 73, var15 - 20);
                arg0.method3855(class161.field2597, var14, var15 + 5, 16777215, 0);
                int var16 = field731 + 180 + 80;
                Statics.field723.method1820(var16 - 73, var15 - 20);
                arg0.method3855(class161.field2375, var16, var15 + 5, 16777215, 0);
            } else if (field744 == 2) {
                short var17 = 211;
                arg0.method3855(field746, field731 + 180, var17, 16776960, 0);
                int var60 = var17 + 15;
                arg0.method3855(field747, field731 + 180, var60, 16776960, 0);
                int var61 = var60 + 15;
                arg0.method3855(field748, field731 + 180, var61, 16776960, 0);
                int var62 = var61 + 15;
                int var63 = var62 + 10;
                arg0.method3852(class161.field2578, field731 + 180 - 110, var63, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field758; arg0.method3847(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3852(class227.method3926(var19) + (field745 == 0 & client.field291 % 40 < 20 ? class2.method2017(16776960) + class2.field21 : ""), field731 + 180 - 70, var63, 16777215, 0);
                var60 = var63 + 15;
                arg0.method3852(class161.field2579 + class167.method2787(field725) + (field745 == 1 & client.field291 % 40 < 20 ? class2.method2017(16776960) + class2.field21 : ""), field731 + 180 - 108, var60, 16777215, 0);
                var60 += 15;
                int var20 = field731 + 180 - 80;
                short var21 = 321;
                Statics.field723.method1820(var20 - 73, var21 - 20);
                arg0.method3855(class161.field2584, var20, var21 + 5, 16777215, 0);
                int var22 = field731 + 180 + 80;
                Statics.field723.method1820(var22 - 73, var21 - 20);
                arg0.method3855(class161.field2375, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3855(class161.field2471, field731 + 180, var23, 16776960, 0);
            } else if (field744 == 3) {
                short var24 = 201;
                arg0.method3855(class161.field2586, field731 + 180, var24, 16776960, 0);
                int var64 = var24 + 20;
                arg1.method3855(class161.field2587, field731 + 180, var64, 16776960, 0);
                int var65 = var64 + 15;
                arg1.method3855(class161.field2473, field731 + 180, var65, 16776960, 0);
                int var66 = var65 + 15;
                int var25 = field731 + 180;
                short var26 = 276;
                Statics.field723.method1820(var25 - 73, var26 - 20);
                arg2.method3855(class161.field2358, var25, var26 + 5, 16777215, 0);
                int var27 = field731 + 180;
                short var28 = 326;
                Statics.field723.method1820(var27 - 73, var28 - 20);
                arg2.method3855(class161.field2590, var27, var28 + 5, 16777215, 0);
            } else if (field744 == 4) {
                arg0.method3855(class161.field2573, field731 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3855(field746, field731 + 180, var29, 16777215, 0);
                int var67 = var29 + 15;
                arg0.method3855(field747, field731 + 180, var67, 16777215, 0);
                int var68 = var67 + 15;
                arg0.method3855(field748, field731 + 180, var68, 16777215, 0);
                int var69 = var68 + 15;
                arg0.method3852(class161.field2580 + class167.method2787(Statics.field578) + (client.field291 % 40 < 20 ? class2.method2017(16776960) + class2.field21 : ""), field731 + 180 - 108, var69, 16777215, 0);
                int var70 = var69 - 8;
                arg0.method3852(class161.field2356, field731 + 180 - 9, var70, 16776960, 0);
                int var71 = var70 + 15;
                arg0.method3852(class161.field2515, field731 + 180 - 9, var71, 16776960, 0);
                int var30 = field731 + 180 - 9 + arg0.method3847(class161.field2515) + 15;
                int var31 = var71 - arg0.field3246;
                class84 var32;
                if (field752) {
                    var32 = Statics.field729;
                } else {
                    var32 = Statics.field728;
                }
                var32.method1820(var30, var31);
                var67 = var71 + 15;
                int var33 = field731 + 180 - 80;
                short var34 = 321;
                Statics.field723.method1820(var33 - 73, var34 - 20);
                arg0.method3855(class161.field2597, var33, var34 + 5, 16777215, 0);
                int var35 = field731 + 180 + 80;
                Statics.field723.method1820(var35 - 73, var34 - 20);
                arg0.method3855(class161.field2375, var35, var34 + 5, 16777215, 0);
                arg1.method3855(class161.field2603, field731 + 180, var34 + 36, 255, 0);
            } else if (field744 == 5) {
                arg0.method3855(class161.field2592, field731 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3855(field746, field731 + 180, var36, 16776960, 0);
                int var72 = var36 + 15;
                arg2.method3855(field747, field731 + 180, var72, 16776960, 0);
                int var73 = var72 + 15;
                arg2.method3855(field748, field731 + 180, var73, 16776960, 0);
                int var74 = var73 + 15;
                int var75 = var74 + 14;
                arg0.method3852(class161.field2414, field731 + 180 - 145, var75, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field758; arg0.method3847(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3852(class227.method3926(var38) + (client.field291 % 40 < 20 ? class2.method2017(16776960) + class2.field21 : ""), field731 + 180 - 34, var75, 16777215, 0);
                var72 = var75 + 15;
                int var39 = field731 + 180 - 80;
                short var40 = 321;
                Statics.field723.method1820(var39 - 73, var40 - 20);
                arg0.method3855(class161.field2381, var39, var40 + 5, 16777215, 0);
                int var41 = field731 + 180 + 80;
                Statics.field723.method1820(var41 - 73, var40 - 20);
                arg0.method3855(class161.field2618, var41, var40 + 5, 16777215, 0);
            } else if (field744 == 6) {
                short var42 = 211;
                arg0.method3855(field746, field731 + 180, var42, 16776960, 0);
                int var76 = var42 + 15;
                arg0.method3855(field747, field731 + 180, var76, 16776960, 0);
                int var77 = var76 + 15;
                arg0.method3855(field748, field731 + 180, var77, 16776960, 0);
                int var78 = var77 + 15;
                int var43 = field731 + 180;
                short var44 = 321;
                Statics.field723.method1820(var43 - 73, var44 - 20);
                arg0.method3855(class161.field2618, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field720 > 0) {
            method3313(field720);
            field720 = 0;
        }
        method1080();
        Statics.field2700[Statics.field233.field139 ? 1 : 0].method1820(field721 + 765 - 40, 463);
        if (client.field289 > 5 && client.field288 == 0) {
            if (Statics.field143 == null) {
                Statics.field143 = class80.method48(Statics.field691, "sl_button", "");
            } else {
                int var45 = field721 + 5;
                short var46 = 463;
                byte var47 = 100;
                byte var48 = 35;
                Statics.field143.method1820(var45, var46);
                arg0.method3855(class161.field2557 + " " + client.field492, var47 / 2 + var45, var48 / 2 + var46 - 2, 16777215, 0);
                if (Statics.field191 == null) {
                    arg1.method3855(class161.field2561, var47 / 2 + var45, var48 / 2 + var46 + 12, 16777215, 0);
                } else {
                    arg1.method3855(class161.field2391, var47 / 2 + var45, var48 / 2 + var46 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var49 = Statics.field1722.getGraphics();
            Statics.field636.method1610(var49, 0, 0);
        } catch (Exception var51) {
            Statics.field1722.repaint();
        }
    }

    @ObfuscatedName("bo.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1253(String arg0, String arg1, String arg2) {
        field746 = arg0;
        field747 = arg1;
        field748 = arg2;
    }

    @ObfuscatedName("an.m(Lcl;B)V")
    public static final void method997(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field686.length; var2++) {
            Statics.field686[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field686[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3047[var8] = (Statics.field686[var8 - 1] + Statics.field686[var8 + 1] + Statics.field686[var8 - 128] + Statics.field686[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field686;
            Statics.field686 = Statics.field3047;
            Statics.field3047 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1474; var11++) {
            for (int var12 = 0; var12 < arg0.field1476; var12++) {
                if (arg0.field1478[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1475;
                    int var14 = var11 + 16 + arg0.field1471;
                    int var15 = (var14 << 7) + var13;
                    Statics.field686[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fh.k(II)V")
    public static final void method3313(int arg0) {
        short var1 = 256;
        field740 += arg0 * 128;
        if (field740 > Statics.field686.length) {
            field740 -= Statics.field686.length;
            int var2 = (int) (Math.random() * 12.0D);
            method997(Statics.field724[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field737[var3 + var4] - Statics.field686[field740 + var3 & Statics.field686.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field737[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field737[var9 + var10] = 255;
                } else {
                    Statics.field737[var9 + var10] = 0;
                }
            }
        }
        if (field735 > 0) {
            field735 -= arg0 * 4;
        }
        if (field736 > 0) {
            field736 -= arg0 * 4;
        }
        if (field735 == 0 && field736 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field735 = 1024;
            }
            if (var12 == 1) {
                field736 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field738[var13] = field738[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field738[var14] = (int) (Math.sin((double) field739 / 14.0D) * 16.0D + Math.sin((double) field739 / 15.0D) * 14.0D + Math.sin((double) field739 / 16.0D) * 12.0D);
            field739++;
        }
        field733 += arg0 * -201984327;
        int var15 = ((client.field291 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field733 * 1893634436; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field737[(var18 << 7) + var17] = 192;
        }
        field733 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field737[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field737[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field3210[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field3210[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field3210[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field737[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ha.c(IIIB)I")
    public static final int method3781(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bs.w(B)V")
    public static final void method1080() {
        short var0 = 256;
        if (field735 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field735 > 768) {
                    Statics.field734[var1] = method3781(Statics.field1436[var1], Statics.field212[var1], 1024 - field735);
                } else if (field735 > 256) {
                    Statics.field734[var1] = Statics.field212[var1];
                } else {
                    Statics.field734[var1] = method3781(Statics.field212[var1], Statics.field1436[var1], 256 - field735);
                }
            }
        } else if (field736 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field736 > 768) {
                    Statics.field734[var2] = method3781(Statics.field1436[var2], Statics.field71[var2], 1024 - field736);
                } else if (field736 > 256) {
                    Statics.field734[var2] = Statics.field71[var2];
                } else {
                    Statics.field734[var2] = method3781(Statics.field71[var2], Statics.field1436[var2], 256 - field736);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field734[var3] = Statics.field1436[var3];
            }
        }
        class83.method1802(field721, 9, field721 + 128, var0 + 7);
        Statics.field732.method1668(field721, 0);
        class83.method1746();
        int var4 = 0;
        int var5 = field721 + Statics.field636.field1444 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field738[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field737[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field734[var10];
                    int var14 = Statics.field636.field1447[var5];
                    Statics.field636.field1447[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field636.field1444 + var8 - 128;
        }
        class83.method1802(field721 + 765 - 128, 9, field721 + 765, var0 + 7);
        Statics.field726.method1668(field721 + 382, 0);
        class83.method1746();
        int var15 = 0;
        int var16 = field721 + Statics.field636.field1444 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field738[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field737[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field734[var22];
                    int var26 = Statics.field636.field1447[var20];
                    Statics.field636.field1447[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field636.field1444 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ay.l(Lhq;Lhq;B)V")
    public static void method611(class228 arg0, class228 arg1) {
        if (Statics.field260 == null) {
            Statics.field260 = class80.method2994(Statics.field691, "sl_back", "");
        }
        if (Statics.field1046 == null) {
            Statics.field1046 = class80.method1042(Statics.field691, "sl_flags", "");
        }
        if (Statics.field757 == null) {
            Statics.field757 = class80.method1042(Statics.field691, "sl_arrows", "");
        }
        if (Statics.field214 == null) {
            Statics.field214 = class80.method1042(Statics.field691, "sl_stars", "");
        }
        class83.method1768(field721, 23, 765, 480, 0);
        class83.method1758(field721, 0, 125, 23, 12425273, 9135624);
        class83.method1758(field721 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3855(class161.field2617, field721 + 62, 15, 0, -1);
        if (Statics.field214 != null) {
            Statics.field214[1].method1820(field721 + 140, 1);
            arg1.method3852(class161.field2462, field721 + 152, 10, 16777215, -1);
            Statics.field214[0].method1820(field721 + 140, 12);
            arg1.method3852(class161.field2613, field721 + 152, 21, 16777215, -1);
        }
        if (Statics.field757 != null) {
            int var2 = field721 + 280;
            if (class28.field655[0] == 0 && class28.field664[0] == 0) {
                Statics.field757[2].method1820(var2, 4);
            } else {
                Statics.field757[0].method1820(var2, 4);
            }
            if (class28.field655[0] == 0 && class28.field664[0] == 1) {
                Statics.field757[3].method1820(var2 + 15, 4);
            } else {
                Statics.field757[1].method1820(var2 + 15, 4);
            }
            arg0.method3852(class161.field2620, var2 + 32, 17, 16777215, -1);
            int var3 = field721 + 390;
            if (class28.field655[0] == 1 && class28.field664[0] == 0) {
                Statics.field757[2].method1820(var3, 4);
            } else {
                Statics.field757[0].method1820(var3, 4);
            }
            if (class28.field655[0] == 1 && class28.field664[0] == 1) {
                Statics.field757[3].method1820(var3 + 15, 4);
            } else {
                Statics.field757[1].method1820(var3 + 15, 4);
            }
            arg0.method3852(class161.field2524, var3 + 32, 17, 16777215, -1);
            int var4 = field721 + 500;
            if (class28.field655[0] == 2 && class28.field664[0] == 0) {
                Statics.field757[2].method1820(var4, 4);
            } else {
                Statics.field757[0].method1820(var4, 4);
            }
            if (class28.field655[0] == 2 && class28.field664[0] == 1) {
                Statics.field757[3].method1820(var4 + 15, 4);
            } else {
                Statics.field757[1].method1820(var4 + 15, 4);
            }
            arg0.method3852(class161.field2621, var4 + 32, 17, 16777215, -1);
            int var5 = field721 + 610;
            if (class28.field655[0] == 3 && class28.field664[0] == 0) {
                Statics.field757[2].method1820(var5, 4);
            } else {
                Statics.field757[0].method1820(var5, 4);
            }
            if (class28.field655[0] == 3 && class28.field664[0] == 1) {
                Statics.field757[3].method1820(var5 + 15, 4);
            } else {
                Statics.field757[1].method1820(var5 + 15, 4);
            }
            arg0.method3852(class161.field2434, var5 + 32, 17, 16777215, -1);
        }
        class83.method1768(field721 + 708, 4, 50, 16, 0);
        arg1.method3855(class161.field2375, field721 + 708 + 25, 16, 16777215, -1);
        field753 = -1;
        if (Statics.field260 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class28.field652) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class28.field652) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class28.field652) {
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
            int var17 = field721 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class28.field652; var20++) {
                class28 var21 = Statics.field650[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field653);
                if (var21.field653 == -1) {
                    var23 = class161.field2624;
                    var22 = false;
                } else if (var21.field653 > 1980) {
                    var23 = class161.field2421;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method633()) {
                    if (var21.method631()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method615()) {
                    var24 = 16711680;
                    if (var21.method631()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method613()) {
                    if (var21.method631()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method631()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class144.field2193 >= var17 && class144.field2200 >= var16 && class144.field2193 < var6 + var17 && class144.field2200 < var7 + var16 && var22) {
                    field753 = var20;
                    Statics.field260[var25].method1673(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field260[var25].method1668(var17, var16);
                }
                if (Statics.field1046 != null) {
                    Statics.field1046[(var21.method631() ? 8 : 0) + var21.field661].method1820(var17 + 29, var16);
                }
                arg0.method3855(Integer.toString(var21.field651), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3855(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3847(Statics.field650[field753].field667) + 6;
                int var27 = arg1.field3246 + 8;
                class83.method1768(class144.field2193 - var26 / 2, class144.field2200 + 20 + 5, var26, var27, 16777120);
                class83.method1759(class144.field2193 - var26 / 2, class144.field2200 + 20 + 5, var26, var27, 0);
                arg1.method3855(Statics.field650[field753].field667, class144.field2193, class144.field2200 + 20 + 5 + arg1.field3246 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1722.getGraphics();
            Statics.field636.method1610(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1722.repaint();
        }
    }

    @ObfuscatedName("r.h(Lay;B)V")
    public static void method209(class28 arg0) {
        if (arg0.method631() != client.field286) {
            client.field286 = arg0.method631();
            boolean var1 = arg0.method631();
            if (Statics.field1155 != var1) {
                class56.method2345();
                Statics.field1155 = var1;
            }
        }
        Statics.field648 = arg0.field659;
        client.field492 = arg0.field651;
        client.field356 = arg0.field657;
        Statics.field674 = client.field344 == 0 ? 43594 : arg0.field651 + 40000;
        Statics.field782 = client.field344 == 0 ? 443 : arg0.field651 + 50000;
        Statics.field2014 = Statics.field674;
    }

    @ObfuscatedName("am.i(I)V")
    public static void method713() {
        if (Statics.method725()) {
            field756 = true;
        }
    }
}
