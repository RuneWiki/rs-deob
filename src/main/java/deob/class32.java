package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("aa")
public class class32 {

    @ObfuscatedName("aa.b")
    public static int field726 = 0;

    @ObfuscatedName("aa.x")
    public static int field729 = field726 + 202;

    @ObfuscatedName("aa.r")
    public static int[] field728 = new int[256];

    @ObfuscatedName("aa.e")
    public static int field731 = 0;

    @ObfuscatedName("aa.q")
    public static int field736 = 0;

    @ObfuscatedName("aa.ai")
    public static int field748 = 0;

    @ObfuscatedName("aa.ag")
    public static int field759 = 0;

    @ObfuscatedName("aa.ab")
    public static int field735 = 0;

    @ObfuscatedName("aa.aa")
    public static int field742 = 0;

    @ObfuscatedName("aa.af")
    public static int field730 = 10;

    @ObfuscatedName("aa.al")
    public static String field738 = "";

    @ObfuscatedName("aa.ad")
    public static int field747 = 0;

    @ObfuscatedName("aa.aw")
    public static String field740 = "";

    @ObfuscatedName("aa.an")
    public static String field741 = "";

    @ObfuscatedName("aa.ax")
    public static String field743 = "";

    @ObfuscatedName("aa.aq")
    public static String field750 = "";

    @ObfuscatedName("aa.ae")
    public static String field734 = "";

    @ObfuscatedName("aa.au")
    public static class159 field733 = class159.field2587;

    @ObfuscatedName("aa.am")
    public static boolean field746 = true;

    @ObfuscatedName("aa.av")
    public static int field739 = 0;

    @ObfuscatedName("aa.ap")
    public static String field732 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aa.ah")
    public static String field749 = "1234567890";

    @ObfuscatedName("aa.az")
    public static boolean field753 = false;

    @ObfuscatedName("aa.bo")
    public static int field751 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.g(B)I")
    public static int method2053() {
        return 9;
    }

    @ObfuscatedName("ak.b(Ljava/awt/Component;Lfc;Lfc;ZII)V")
    public static void method657(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field737) {
            field747 = arg4;
            class80.method1711();
            byte[] var5 = arg1.method3095("title.jpg", "");
            Statics.field1958 = new class79(var5, arg0);
            Statics.field3166 = Statics.field1958.method1617();
            if ((client.field576 & 0x20000000) == 0) {
                Statics.field1754 = class77.method2309(arg2, "logo", "");
            } else {
                Statics.field1754 = class77.method2309(arg2, "logo_deadman_mode", "");
            }
            Statics.field727 = class77.method2309(arg2, "titlebox", "");
            Statics.field2170 = class77.method2309(arg2, "titlebutton", "");
            Statics.field745 = class77.method1533(arg2, "runes", "");
            Statics.field2922 = class77.method1533(arg2, "title_mute", "");
            Statics.field755 = class77.method2309(arg2, "options_radio_buttons,0", "");
            Statics.field597 = class77.method2309(arg2, "options_radio_buttons,2", "");
            Statics.field223 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field223[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field223[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field223[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field223[var9 + 192] = 16777215;
            }
            Statics.field1947 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1947[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1947[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1947[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1947[var13 + 192] = 16777215;
            }
            Statics.field200 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field200[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field200[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field200[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field200[var17 + 192] = 16777215;
            }
            Statics.field797 = new int[256];
            Statics.field591 = new int[32768];
            Statics.field653 = new int[32768];
            method3005((class81) null);
            Statics.field1618 = new int[32768];
            Statics.field2263 = new int[32768];
            if (arg3) {
                field750 = "";
                field734 = "";
            }
            Statics.field3140 = 0;
            Statics.field274 = "";
            field746 = true;
            field753 = false;
            if (Statics.field783.field147) {
                Statics.method3179(2);
            } else {
                class183.method157(2, Statics.field1370, "scape main", "", 255, false);
            }
            class171.method659(false);
            Statics.field737 = true;
            field726 = (Statics.field2014 - client.field509 * 765) / 2;
            field729 = field726 + 202;
            Statics.field1958.method1627(field726, 0);
            Statics.field3166.method1627(field726 + 382, 0);
            Statics.field1754.method1764(field726 + 382 - Statics.field1754.field1421 / 2, 18);
        } else if (arg4 == 4) {
            field747 = 4;
        }
    }

    @ObfuscatedName("g.w(Lem;B)V")
    public static void method1(class144 arg0) {
        if (!field753) {
            if ((class140.field2150 == 1 || !Statics.field1395 && class140.field2150 == 4) && class140.field2142 >= field726 + 765 - 50 && class140.field2148 >= 453) {
                Statics.field783.field147 = !Statics.field783.field147;
                class9.method2298();
                if (Statics.field783.field147) {
                    class183.method749();
                } else {
                    class168 var6 = Statics.field1370;
                    int var7 = var6.method3079("scape main");
                    int var8 = var6.method3094(var7, "");
                    class183.method2057(var6, var7, var8, 255, false);
                }
            }
            if (client.field300 != 5) {
                field735++;
                if (client.field300 == 10 || client.field300 == 11) {
                    if (client.field299 == 0) {
                        if (class140.field2150 == 1 || !Statics.field1395 && class140.field2150 == 4) {
                            int var9 = field726 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class140.field2142 >= var9 && class140.field2142 <= var9 + var11 && class140.field2148 >= var10 && class140.field2148 <= var10 + var12) {
                                method1787();
                                return;
                            }
                        }
                        if (Statics.field2693 != null) {
                            method1787();
                        }
                    }
                    int var13 = class140.field2150;
                    int var14 = class140.field2142;
                    int var15 = class140.field2148;
                    if (!Statics.field1395 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field747 == 0) {
                        int var16 = field729 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            label692: {
                                String var18 = client.method200("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var18));
                                        break label692;
                                    } catch (Exception var44) {
                                    }
                                }
                                if (class138.field2128.startsWith("win")) {
                                    class138.method1029(var18, 0);
                                } else if (class138.field2128.startsWith("mac")) {
                                    class138.method728(var18, 1, "openjs");
                                } else {
                                    class138.method1029(var18, 2);
                                }
                            }
                        }
                        int var20 = field729 + 180 + 80;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field576 & 0x4) != 0) {
                                if ((client.field576 & 0x400) == 0) {
                                    field740 = class157.field2424;
                                    field741 = class157.field2462;
                                    field743 = class157.field2515;
                                } else {
                                    field740 = class157.field2519;
                                    field741 = class157.field2445;
                                    field743 = class157.field2521;
                                }
                                field747 = 1;
                                field739 = 0;
                            } else if ((client.field576 & 0x400) == 0) {
                                field740 = class157.field2509;
                                field741 = class157.field2510;
                                field743 = class157.field2378;
                                field747 = 2;
                                field739 = 0;
                            } else {
                                field740 = class157.field2417;
                                field741 = class157.field2517;
                                field743 = class157.field2485;
                                field747 = 1;
                                field739 = 0;
                            }
                        }
                    } else if (field747 == 1) {
                        while (class137.method3259()) {
                            if (Statics.field19 == 84) {
                                field740 = class157.field2509;
                                field741 = class157.field2510;
                                field743 = class157.field2378;
                                field747 = 2;
                                field739 = 0;
                            } else if (Statics.field19 == 13) {
                                field747 = 0;
                            }
                        }
                        int var21 = field729 + 180 - 80;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field740 = class157.field2509;
                            field741 = class157.field2510;
                            field743 = class157.field2378;
                            field747 = 2;
                            field739 = 0;
                        }
                        int var23 = field729 + 180 + 80;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field747 = 0;
                        }
                    } else if (field747 == 2) {
                        short var24 = 231;
                        int var46 = var24 + 30;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field739 = 0;
                        }
                        var46 += 15;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field739 = 1;
                        }
                        var46 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            method760(class157.field2361, class157.field2541, class157.field2542);
                            field747 = 5;
                            return;
                        }
                        int var26 = field729 + 180 - 80;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field750 = field750.trim();
                            if (field750.length() == 0) {
                                method760(class157.field2415, class157.field2416, class157.field2563);
                                return;
                            }
                            if (field734.length() == 0) {
                                method760(class157.field2330, class157.field2419, class157.field2420);
                                return;
                            }
                            method760(class157.field2524, class157.field2525, class157.field2526);
                            field733 = Statics.field783.field149.containsKey(class163.method3712(field750)) ? class159.field2585 : class159.field2587;
                            client.method43(20);
                            return;
                        }
                        int var28 = field729 + 180 + 80;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field747 = 0;
                            field750 = "";
                            field734 = "";
                            Statics.field3140 = 0;
                            Statics.field274 = "";
                            field746 = true;
                        }
                        while (true) {
                            while (class137.method3259()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field732.length(); var30++) {
                                    if (Statics.field1042 == field732.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field19 == 13) {
                                    field747 = 0;
                                    field750 = "";
                                    field734 = "";
                                    Statics.field3140 = 0;
                                    Statics.field274 = "";
                                    field746 = true;
                                } else if (field739 == 0) {
                                    if (Statics.field19 == 85 && field750.length() > 0) {
                                        field750 = field750.substring(0, field750.length() - 1);
                                    }
                                    if (Statics.field19 == 84 || Statics.field19 == 80) {
                                        field739 = 1;
                                    }
                                    if (var29 && field750.length() < 320) {
                                        field750 = field750 + Statics.field1042;
                                    }
                                } else if (field739 == 1) {
                                    if (Statics.field19 == 85 && field734.length() > 0) {
                                        field734 = field734.substring(0, field734.length() - 1);
                                    }
                                    if (Statics.field19 == 84 || Statics.field19 == 80) {
                                        field739 = 0;
                                    }
                                    if (Statics.field19 == 84) {
                                        field750 = field750.trim();
                                        if (field750.length() == 0) {
                                            method760(class157.field2415, class157.field2416, class157.field2563);
                                            return;
                                        }
                                        if (field734.length() == 0) {
                                            method760(class157.field2330, class157.field2419, class157.field2420);
                                            return;
                                        }
                                        method760(class157.field2524, class157.field2525, class157.field2526);
                                        field733 = Statics.field783.field149.containsKey(class163.method3712(field750)) ? class159.field2585 : class159.field2587;
                                        client.method43(20);
                                        return;
                                    }
                                    if (var29 && field734.length() < 20) {
                                        field734 = field734 + Statics.field1042;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field747 == 4) {
                        int var31 = field729 + 180 - 80;
                        short var32 = 321;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            Statics.field274.trim();
                            if (Statics.field274.length() != 6) {
                                method760(class157.field2331, class157.field2540, class157.field2333);
                                return;
                            }
                            Statics.field3140 = Integer.parseInt(Statics.field274);
                            Statics.field274 = "";
                            field733 = field746 ? class159.field2596 : class159.field2586;
                            method760(class157.field2524, class157.field2525, class157.field2526);
                            client.method43(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field729 + 180 - 9 && var14 <= field729 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field746 = !field746;
                        }
                        if (var13 == 1 && var14 >= field729 + 180 - 34 && var14 <= field729 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            label707: {
                                String var33 = client.method200("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var33));
                                        break label707;
                                    } catch (Exception var45) {
                                    }
                                }
                                if (class138.field2128.startsWith("win")) {
                                    class138.method1029(var33, 0);
                                } else if (class138.field2128.startsWith("mac")) {
                                    class138.method728(var33, 1, "openjs");
                                } else {
                                    class138.method1029(var33, 2);
                                }
                            }
                        }
                        int var35 = field729 + 180 + 80;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field747 = 0;
                            field750 = "";
                            field734 = "";
                            Statics.field3140 = 0;
                            Statics.field274 = "";
                        }
                        while (class137.method3259()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field749.length(); var37++) {
                                if (Statics.field1042 == field749.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field19 == 13) {
                                field747 = 0;
                                field750 = "";
                                field734 = "";
                                Statics.field3140 = 0;
                                Statics.field274 = "";
                            } else {
                                if (Statics.field19 == 85 && Statics.field274.length() > 0) {
                                    Statics.field274 = Statics.field274.substring(0, Statics.field274.length() - 1);
                                }
                                if (Statics.field19 == 84) {
                                    Statics.field274.trim();
                                    if (Statics.field274.length() != 6) {
                                        method760(class157.field2331, class157.field2540, class157.field2333);
                                        return;
                                    }
                                    Statics.field3140 = Integer.parseInt(Statics.field274);
                                    Statics.field274 = "";
                                    field733 = field746 ? class159.field2596 : class159.field2586;
                                    method760(class157.field2524, class157.field2525, class157.field2526);
                                    client.method43(20);
                                    return;
                                }
                                if (var36 && Statics.field274.length() < 6) {
                                    Statics.field274 = Statics.field274 + Statics.field1042;
                                }
                            }
                        }
                    } else if (field747 == 5) {
                        int var38 = field729 + 180 - 80;
                        short var39 = 321;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            method602();
                            return;
                        }
                        int var40 = field729 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            field740 = class157.field2509;
                            field741 = class157.field2510;
                            field743 = class157.field2378;
                            field747 = 2;
                            field739 = 0;
                            field734 = "";
                        }
                        while (class137.method3259()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field732.length(); var42++) {
                                if (Statics.field1042 == field732.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field19 == 13) {
                                field740 = class157.field2509;
                                field741 = class157.field2510;
                                field743 = class157.field2378;
                                field747 = 2;
                                field739 = 0;
                                field734 = "";
                            } else {
                                if (Statics.field19 == 85 && field750.length() > 0) {
                                    field750 = field750.substring(0, field750.length() - 1);
                                }
                                if (Statics.field19 == 84) {
                                    method602();
                                    return;
                                }
                                if (var41 && field750.length() < 320) {
                                    field750 = field750 + Statics.field1042;
                                }
                            }
                        }
                    } else if (field747 == 6) {
                        while (true) {
                            do {
                                if (!class137.method3259()) {
                                    short var43 = 321;
                                    if (var13 == 1 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                                        field740 = class157.field2509;
                                        field741 = class157.field2510;
                                        field743 = class157.field2378;
                                        field747 = 2;
                                        field739 = 0;
                                        field734 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field19 != 84 && Statics.field19 != 13);
                            field740 = class157.field2509;
                            field741 = class157.field2510;
                            field743 = class157.field2378;
                            field747 = 2;
                            field739 = 0;
                            field734 = "";
                        }
                    }
                }
            }
        } else if (class140.field2150 == 1 || !Statics.field1395 && class140.field2150 == 4) {
            int var1 = field726 + 280;
            if (class140.field2142 >= var1 && class140.field2142 <= var1 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                class26.method95(0, 0);
            } else if (class140.field2142 >= var1 + 15 && class140.field2142 <= var1 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                class26.method95(0, 1);
            } else {
                int var2 = field726 + 390;
                if (class140.field2142 >= var2 && class140.field2142 <= var2 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                    class26.method95(1, 0);
                } else if (class140.field2142 >= var2 + 15 && class140.field2142 <= var2 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                    class26.method95(1, 1);
                } else {
                    int var3 = field726 + 500;
                    if (class140.field2142 >= var3 && class140.field2142 <= var3 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                        class26.method95(2, 0);
                    } else if (class140.field2142 >= var3 + 15 && class140.field2142 <= var3 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                        class26.method95(2, 1);
                    } else {
                        int var4 = field726 + 610;
                        if (class140.field2142 >= var4 && class140.field2142 <= var4 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                            class26.method95(3, 0);
                        } else if (class140.field2142 >= var4 + 15 && class140.field2142 <= var4 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
                            class26.method95(3, 1);
                        } else if (class140.field2142 >= field726 + 708 && class140.field2148 >= 4 && class140.field2142 <= field726 + 708 + 50 && class140.field2148 <= 20) {
                            field753 = false;
                            Statics.field1958.method1627(field726, 0);
                            Statics.field3166.method1627(field726 + 382, 0);
                            Statics.field1754.method1764(field726 + 382 - Statics.field1754.field1421 / 2, 18);
                        } else if (field751 != -1) {
                            class26 var5 = Statics.field647[field751];
                            method567(var5);
                            field753 = false;
                            Statics.field1958.method1627(field726, 0);
                            Statics.field3166.method1627(field726 + 382, 0);
                            Statics.field1754.method1764(field726 + 382 - Statics.field1754.field1421 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.d(I)V")
    public static void method602() {
        field750 = field750.trim();
        if (field750.length() == 0) {
            method760(class157.field2361, class157.field2541, class157.field2542);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method200("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1986, var4.field1977, 1000 - var4.field1977);
                if (var5 == -1) {
                    var4.field1977 = 0;
                    long var8 = var4.method2564();
                    var6 = var8;
                    break;
                }
                var4.field1977 += var5;
                if (var4.field1977 >= 1000) {
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
            String var14 = field750;
            Random var15 = new Random();
            class119 var16 = new class119(128);
            class119 var17 = new class119(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2476(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2351(var15.nextInt());
            }
            var16.method2351(var18[0]);
            var16.method2351(var18[1]);
            var16.method2353(var6);
            var16.method2353(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2351(var15.nextInt());
            }
            var16.method2416(class10.field156, class10.field158);
            var17.method2476(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2351(var15.nextInt());
            }
            var17.method2353(var15.nextLong());
            var17.method2352(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class149.field2235.method3936(0L);
                class149.field2235.method3923(var22);
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
            var17.method2382(var22, 0, 24);
            var17.method2353(var15.nextLong());
            var17.method2416(class10.field156, class10.field158);
            int var26 = class119.method50(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class119 var27 = new class119(var26);
            var27.method2354(var14);
            var27.field1977 = var26;
            var27.method2430(var18);
            class119 var28 = new class119(var27.field1977 + var17.field1977 + var16.field1977 + 5);
            var28.method2476(2);
            var28.method2476(var16.field1977);
            var28.method2382(var16.field1986, 0, var16.field1977);
            var28.method2476(var17.field1977);
            var28.method2382(var17.field1986, 0, var17.field1977);
            var28.method2349(var27.field1977);
            var28.method2382(var27.field1986, 0, var27.field1977);
            String var29 = class161.method961(var28.field1986);
            byte var36;
            try {
                URL var30 = new URL(client.method200("services", false) + "m=accountappeal/login.ws");
                URLConnection var31 = var30.openConnection();
                var31.setDoInput(true);
                var31.setDoOutput(true);
                var31.setConnectTimeout(5000);
                OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
                var32.write("data2=" + class226.method3180(var29) + "&dest=" + class226.method3180("passwordchoice.ws"));
                var32.flush();
                InputStream var33 = var31.getInputStream();
                class119 var34 = new class119(new byte[1000]);
                while (true) {
                    int var35 = var33.read(var34.field1986, var34.field1977, 1000 - var34.field1977);
                    if (var35 == -1) {
                        var32.close();
                        var33.close();
                        String var37 = new String(var34.field1986);
                        if (var37.startsWith("OFFLINE")) {
                            var36 = 4;
                        } else if (var37.startsWith("WRONG")) {
                            var36 = 7;
                        } else if (var37.startsWith("RELOAD")) {
                            var36 = 3;
                        } else if (var37.startsWith("Not permitted for social network accounts.")) {
                            var36 = 6;
                        } else {
                            var34.method2495(var18);
                            while (var34.field1977 > 0 && var34.field1986[var34.field1977 - 1] == 0) {
                                var34.field1977--;
                            }
                            String var38 = new String(var34.field1986, 0, var34.field1977);
                            if (class10.method662(var38)) {
                                label123: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var38));
                                            break label123;
                                        } catch (Exception var41) {
                                        }
                                    }
                                    if (class138.field2128.startsWith("win")) {
                                        class138.method1029(var38, 0);
                                    } else if (class138.field2128.startsWith("mac")) {
                                        class138.method728(var38, 1, "openjs");
                                    } else {
                                        class138.method1029(var38, 2);
                                    }
                                }
                                var36 = 2;
                            } else {
                                var36 = 5;
                            }
                        }
                        break;
                    }
                    var34.field1977 += var35;
                    if (var34.field1977 >= 1000) {
                        var36 = 5;
                        break;
                    }
                }
            } catch (Throwable var42) {
                var42.printStackTrace();
                var36 = 5;
            }
            var13 = var36;
        }
        switch(var13) {
            case 2:
                method760(class157.field2372, class157.field2544, class157.field2545);
                field747 = 6;
                break;
            case 3:
                method760(class157.field2481, class157.field2455, class157.field2548);
                break;
            case 4:
                method760(class157.field2549, class157.field2550, class157.field2551);
                break;
            case 5:
                method760(class157.field2315, class157.field2553, class157.field2554);
                break;
            case 6:
                method760(class157.field2555, class157.field2513, class157.field2557);
                break;
            case 7:
                method760(class157.field2558, class157.field2523, class157.field2305);
        }
    }

    @ObfuscatedName("ap.z(Lhq;Lhq;Lhq;ZI)V")
    public static void method960(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field726 = (Statics.field2014 - client.field509 * 765) / 2;
            field729 = field726 + 202;
        }
        if (field753) {
            if (Statics.field2648 == null) {
                Statics.field2648 = class77.method995(Statics.field1768, "sl_back", "");
            }
            if (Statics.field1051 == null) {
                Statics.field1051 = class77.method1533(Statics.field1768, "sl_flags", "");
            }
            if (Statics.field2071 == null) {
                Statics.field2071 = class77.method1533(Statics.field1768, "sl_arrows", "");
            }
            if (Statics.field2903 == null) {
                Statics.field2903 = class77.method1533(Statics.field1768, "sl_stars", "");
            }
            class80.method1713(field726, 23, 765, 480, 0);
            class80.method1714(field726, 0, 125, 23, 12425273, 9135624);
            class80.method1714(field726 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3812(class157.field2561, field726 + 62, 15, 0, -1);
            if (Statics.field2903 != null) {
                Statics.field2903[1].method1764(field726 + 140, 1);
                arg1.method3810(class157.field2562, field726 + 152, 10, 16777215, -1);
                Statics.field2903[0].method1764(field726 + 140, 12);
                arg1.method3810(class157.field2546, field726 + 152, 21, 16777215, -1);
            }
            if (Statics.field2071 != null) {
                int var4 = field726 + 280;
                if (class26.field645[0] == 0 && class26.field644[0] == 0) {
                    Statics.field2071[2].method1764(var4, 4);
                } else {
                    Statics.field2071[0].method1764(var4, 4);
                }
                if (class26.field645[0] == 0 && class26.field644[0] == 1) {
                    Statics.field2071[3].method1764(var4 + 15, 4);
                } else {
                    Statics.field2071[1].method1764(var4 + 15, 4);
                }
                arg0.method3810(class157.field2564, var4 + 32, 17, 16777215, -1);
                int var5 = field726 + 390;
                if (class26.field645[0] == 1 && class26.field644[0] == 0) {
                    Statics.field2071[2].method1764(var5, 4);
                } else {
                    Statics.field2071[0].method1764(var5, 4);
                }
                if (class26.field645[0] == 1 && class26.field644[0] == 1) {
                    Statics.field2071[3].method1764(var5 + 15, 4);
                } else {
                    Statics.field2071[1].method1764(var5 + 15, 4);
                }
                arg0.method3810(class157.field2565, var5 + 32, 17, 16777215, -1);
                int var6 = field726 + 500;
                if (class26.field645[0] == 2 && class26.field644[0] == 0) {
                    Statics.field2071[2].method1764(var6, 4);
                } else {
                    Statics.field2071[0].method1764(var6, 4);
                }
                if (class26.field645[0] == 2 && class26.field644[0] == 1) {
                    Statics.field2071[3].method1764(var6 + 15, 4);
                } else {
                    Statics.field2071[1].method1764(var6 + 15, 4);
                }
                arg0.method3810(class157.field2443, var6 + 32, 17, 16777215, -1);
                int var7 = field726 + 610;
                if (class26.field645[0] == 3 && class26.field644[0] == 0) {
                    Statics.field2071[2].method1764(var7, 4);
                } else {
                    Statics.field2071[0].method1764(var7, 4);
                }
                if (class26.field645[0] == 3 && class26.field644[0] == 1) {
                    Statics.field2071[3].method1764(var7 + 15, 4);
                } else {
                    Statics.field2071[1].method1764(var7 + 15, 4);
                }
                arg0.method3810(class157.field2567, var7 + 32, 17, 16777215, -1);
            }
            class80.method1713(field726 + 708, 4, 50, 16, 0);
            arg1.method3812(class157.field2533, field726 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field576 & var9;
            for (int var11 = 0; var11 < class26.field642; var11++) {
                class26 var12 = Statics.field647[var11];
                if ((var12.field650 & var9) == var10 || (var12.field650 & var9) == 0) {
                    var8++;
                }
            }
            field751 = -1;
            if (Statics.field2648 != null) {
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
                int var24 = field726 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field642; var27++) {
                    class26 var28 = Statics.field647[var27];
                    if ((var28.field650 & var9) == var10 || (var28.field650 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field641);
                        if (var28.field641 == -1) {
                            var30 = class157.field2568;
                            var29 = false;
                        } else if (var28.field641 > 1980) {
                            var30 = class157.field2569;
                            var29 = false;
                        }
                        int var31 = 0;
                        byte var32;
                        if (var28.method614()) {
                            var31 = 16711680;
                            if (var28.method631()) {
                                var32 = 5;
                            } else {
                                var32 = 4;
                            }
                        } else if (var28.method612()) {
                            if (var28.method631()) {
                                var32 = 3;
                            } else {
                                var32 = 2;
                            }
                        } else if (var28.method631()) {
                            var32 = 1;
                        } else {
                            var32 = 0;
                        }
                        if (class140.field2139 >= var24 && class140.field2145 >= var23 && class140.field2139 < var13 + var24 && class140.field2145 < var14 + var23 && var29) {
                            field751 = var27;
                            Statics.field2648[var32].method1633(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field2648[var32].method1627(var24, var23);
                        }
                        if (Statics.field1051 != null) {
                            Statics.field1051[(var28.method631() ? 8 : 0) + var28.field640].method1764(var24 + 29, var23);
                        }
                        arg0.method3812(Integer.toString(var28.field646), var24 + 15, var14 / 2 + var23 + 5, var31, -1);
                        arg1.method3812(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var33 = arg1.method3888(Statics.field647[field751].field658) + 6;
                    int var34 = arg1.field3172 + 8;
                    class80.method1713(class140.field2139 - var33 / 2, class140.field2145 + 20 + 5, var33, var34, 16777120);
                    class80.method1751(class140.field2139 - var33 / 2, class140.field2145 + 20 + 5, var33, var34, 0);
                    arg1.method3812(Statics.field647[field751].field658, class140.field2139, class140.field2145 + 20 + 5 + arg1.field3172 + 4, 0, -1);
                }
            }
            try {
                Graphics var35 = Statics.field1362.getGraphics();
                Statics.field137.method1542(var35, 0, 0);
            } catch (Exception var79) {
                Statics.field1362.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field1958.method1627(field726, 0);
            Statics.field3166.method1627(field726 + 382, 0);
            Statics.field1754.method1764(field726 + 382 - Statics.field1754.field1421 / 2, 18);
        }
        if (client.field300 == 0 || client.field300 == 5) {
            byte var37 = 20;
            arg0.method3812(class157.field2446, field729 + 180, 245 - var37, 16777215, -1);
            int var38 = 253 - var37;
            class80.method1751(field729 + 180 - 152, var38, 304, 34, 9179409);
            class80.method1751(field729 + 180 - 151, var38 + 1, 302, 32, 0);
            class80.method1713(field729 + 180 - 150, var38 + 2, field730 * 3, 30, 9179409);
            class80.method1713(field730 * 3 + (field729 + 180 - 150), var38 + 2, 300 - field730 * 3, 30, 0);
            arg0.method3812(field738, field729 + 180, 276 - var37, 16777215, -1);
        }
        if (client.field300 == 20) {
            Statics.field727.method1764(field729 + 180 - Statics.field727.field1421 / 2, 271 - Statics.field727.field1419 / 2);
            short var39 = 211;
            arg0.method3812(field740, field729 + 180, var39, 16776960, 0);
            int var81 = var39 + 15;
            arg0.method3812(field741, field729 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            arg0.method3812(field743, field729 + 180, var82, 16776960, 0);
            int var83 = var82 + 15;
            int var84 = var83 + 10;
            if (field747 != 4) {
                arg0.method3810(class157.field2527, field729 + 180 - 110, var84, 16777215, 0);
                short var40 = 200;
                String var41;
                for (var41 = field750; arg0.method3888(var41) > var40; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method3810(class223.method3887(var41), field729 + 180 - 70, var84, 16777215, 0);
                var81 = var84 + 15;
                arg0.method3810(class157.field2337 + class163.method949(field734), field729 + 180 - 108, var81, 16777215, 0);
                var81 += 15;
            }
        }
        if (client.field300 == 10 || client.field300 == 11) {
            Statics.field727.method1764(field729, 171);
            if (field747 == 0) {
                short var42 = 251;
                arg0.method3812(class157.field2530, field729 + 180, var42, 16776960, 0);
                int var85 = var42 + 30;
                int var43 = field729 + 180 - 80;
                short var44 = 291;
                Statics.field2170.method1764(var43 - 73, var44 - 20);
                arg0.method3813(class157.field2531, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var45 = field729 + 180 + 80;
                Statics.field2170.method1764(var45 - 73, var44 - 20);
                arg0.method3813(class157.field2532, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field747 == 1) {
                arg0.method3812(class157.field2512, field729 + 180, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3812(field740, field729 + 180, var46, 16777215, 0);
                int var86 = var46 + 15;
                arg0.method3812(field741, field729 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method3812(field743, field729 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                int var47 = field729 + 180 - 80;
                short var48 = 321;
                Statics.field2170.method1764(var47 - 73, var48 - 20);
                arg0.method3812(class157.field2396, var47, var48 + 5, 16777215, 0);
                int var49 = field729 + 180 + 80;
                Statics.field2170.method1764(var49 - 73, var48 - 20);
                arg0.method3812(class157.field2533, var49, var48 + 5, 16777215, 0);
            } else if (field747 == 2) {
                short var50 = 211;
                arg0.method3812(field740, field729 + 180, var50, 16776960, 0);
                int var89 = var50 + 15;
                arg0.method3812(field741, field729 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method3812(field743, field729 + 180, var90, 16776960, 0);
                int var91 = var90 + 15;
                int var92 = var91 + 10;
                arg0.method3810(class157.field2527, field729 + 180 - 110, var92, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field750; arg0.method3888(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3810(class223.method3887(var52) + (field739 == 0 & client.field302 % 40 < 20 ? class2.method3003(16776960) + class2.field23 : ""), field729 + 180 - 70, var92, 16777215, 0);
                var89 = var92 + 15;
                arg0.method3810(class157.field2337 + class163.method949(field734) + (field739 == 1 & client.field302 % 40 < 20 ? class2.method3003(16776960) + class2.field23 : ""), field729 + 180 - 108, var89, 16777215, 0);
                var89 += 15;
                int var53 = field729 + 180 - 80;
                short var54 = 321;
                Statics.field2170.method1764(var53 - 73, var54 - 20);
                arg0.method3812(class157.field2431, var53, var54 + 5, 16777215, 0);
                int var55 = field729 + 180 + 80;
                Statics.field2170.method1764(var55 - 73, var54 - 20);
                arg0.method3812(class157.field2533, var55, var54 + 5, 16777215, 0);
                short var56 = 357;
                arg1.method3812(class157.field2535, field729 + 180, var56, 16776960, 0);
            } else if (field747 == 4) {
                arg0.method3812(class157.field2522, field729 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3812(field740, field729 + 180, var57, 16777215, 0);
                int var93 = var57 + 15;
                arg0.method3812(field741, field729 + 180, var93, 16777215, 0);
                int var94 = var93 + 15;
                arg0.method3812(field743, field729 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3810(class157.field2529 + class163.method949(Statics.field274) + (client.field302 % 40 < 20 ? class2.method3003(16776960) + class2.field23 : ""), field729 + 180 - 108, var95, 16777215, 0);
                int var96 = var95 - 8;
                arg0.method3810(class157.field2493, field729 + 180 - 9, var96, 16776960, 0);
                int var97 = var96 + 15;
                arg0.method3810(class157.field2478, field729 + 180 - 9, var97, 16776960, 0);
                int var58 = field729 + 180 - 9 + arg0.method3888(class157.field2478) + 15;
                int var59 = var97 - arg0.field3172;
                class81 var60;
                if (field746) {
                    var60 = Statics.field597;
                } else {
                    var60 = Statics.field755;
                }
                var60.method1764(var58, var59);
                var93 = var97 + 15;
                int var61 = field729 + 180 - 80;
                short var62 = 321;
                Statics.field2170.method1764(var61 - 73, var62 - 20);
                arg0.method3812(class157.field2396, var61, var62 + 5, 16777215, 0);
                int var63 = field729 + 180 + 80;
                Statics.field2170.method1764(var63 - 73, var62 - 20);
                arg0.method3812(class157.field2533, var63, var62 + 5, 16777215, 0);
                arg1.method3812(class157.field2356, field729 + 180, var62 + 36, 255, 0);
            } else if (field747 == 5) {
                arg0.method3812(class157.field2536, field729 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3812(field740, field729 + 180, var64, 16776960, 0);
                int var98 = var64 + 15;
                arg2.method3812(field741, field729 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg2.method3812(field743, field729 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var101 = var100 + 14;
                arg0.method3810(class157.field2537, field729 + 180 - 145, var101, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field750; arg0.method3888(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3810(class223.method3887(var66) + (client.field302 % 40 < 20 ? class2.method3003(16776960) + class2.field23 : ""), field729 + 180 - 34, var101, 16777215, 0);
                var98 = var101 + 15;
                int var67 = field729 + 180 - 80;
                short var68 = 321;
                Statics.field2170.method1764(var67 - 73, var68 - 20);
                arg0.method3812(class157.field2507, var67, var68 + 5, 16777215, 0);
                int var69 = field729 + 180 + 80;
                Statics.field2170.method1764(var69 - 73, var68 - 20);
                arg0.method3812(class157.field2303, var69, var68 + 5, 16777215, 0);
            } else if (field747 == 6) {
                short var70 = 211;
                arg0.method3812(field740, field729 + 180, var70, 16776960, 0);
                int var102 = var70 + 15;
                arg0.method3812(field741, field729 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                arg0.method3812(field743, field729 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                int var71 = field729 + 180;
                short var72 = 321;
                Statics.field2170.method1764(var71 - 73, var72 - 20);
                arg0.method3812(class157.field2303, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field735 > 0) {
            method720(field735);
            field735 = 0;
        }
        method1981();
        Statics.field2922[Statics.field783.field147 ? 1 : 0].method1764(field726 + 765 - 40, 463);
        if (client.field300 > 5 && client.field299 == 0) {
            if (Statics.field2037 == null) {
                Statics.field2037 = class77.method2309(Statics.field1768, "sl_button", "");
            } else {
                int var73 = field726 + 5;
                short var74 = 463;
                byte var75 = 100;
                byte var76 = 35;
                Statics.field2037.method1764(var73, var74);
                arg0.method3812(class157.field2463 + " " + client.field348, var75 / 2 + var73, var76 / 2 + var74 - 2, 16777215, 0);
                if (Statics.field2693 == null) {
                    arg1.method3812(class157.field2571, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                } else {
                    arg1.method3812(class157.field2570, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var77 = Statics.field1362.getGraphics();
            Statics.field137.method1542(var77, 0, 0);
        } catch (Exception var80) {
            Statics.field1362.repaint();
        }
    }

    @ObfuscatedName("ax.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method760(String arg0, String arg1, String arg2) {
        field740 = arg0;
        field741 = arg1;
        field743 = arg2;
    }

    @ObfuscatedName("fi.m(Lco;I)V")
    public static final void method3005(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field591.length; var2++) {
            Statics.field591[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field591[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field653[var8] = (Statics.field591[var8 - 1] + Statics.field591[var8 + 1] + Statics.field591[var8 - 128] + Statics.field591[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field591;
            Statics.field591 = Statics.field653;
            Statics.field653 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1419; var11++) {
            for (int var12 = 0; var12 < arg0.field1421; var12++) {
                if (arg0.field1416[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1420;
                    int var14 = var11 + 16 + arg0.field1418;
                    int var15 = (var14 << 7) + var13;
                    Statics.field591[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("al.p(II)V")
    public static final void method720(int arg0) {
        short var1 = 256;
        field748 += arg0 * 128;
        if (field748 > Statics.field591.length) {
            field748 -= Statics.field591.length;
            int var2 = (int) (Math.random() * 12.0D);
            method3005(Statics.field745[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1618[var3 + var4] - Statics.field591[field748 + var3 & Statics.field591.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1618[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1618[var9 + var10] = 255;
                } else {
                    Statics.field1618[var9 + var10] = 0;
                }
            }
        }
        if (field731 > 0) {
            field731 -= arg0 * 4;
        }
        if (field736 > 0) {
            field736 -= arg0 * 4;
        }
        if (field731 == 0 && field736 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field731 = 1024;
            }
            if (var12 == 1) {
                field736 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field728[var13] = field728[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field728[var14] = (int) (Math.sin((double) field742 / 14.0D) * 16.0D + Math.sin((double) field742 / 15.0D) * 14.0D + Math.sin((double) field742 / 16.0D) * 12.0D);
            field742++;
        }
        field759 += arg0 * 1776666339;
        int var15 = ((client.field302 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field759 * 635455308; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1618[(var18 << 7) + var17] = 192;
        }
        field759 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1618[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1618[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2263[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2263[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2263[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1618[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("f.u(IIII)I")
    public static final int method163(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ci.c(I)V")
    public static final void method1981() {
        short var0 = 256;
        if (field731 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field731 > 768) {
                    Statics.field797[var1] = method163(Statics.field223[var1], Statics.field1947[var1], 1024 - field731);
                } else if (field731 > 256) {
                    Statics.field797[var1] = Statics.field1947[var1];
                } else {
                    Statics.field797[var1] = method163(Statics.field1947[var1], Statics.field223[var1], 256 - field731);
                }
            }
        } else if (field736 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field736 > 768) {
                    Statics.field797[var2] = method163(Statics.field223[var2], Statics.field200[var2], 1024 - field736);
                } else if (field736 > 256) {
                    Statics.field797[var2] = Statics.field200[var2];
                } else {
                    Statics.field797[var2] = method163(Statics.field200[var2], Statics.field223[var2], 256 - field736);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field797[var3] = Statics.field223[var3];
            }
        }
        class80.method1738(field726, 9, field726 + 128, var0 + 7);
        Statics.field1958.method1627(field726, 0);
        class80.method1706();
        int var4 = 0;
        int var5 = field726 + Statics.field137.field1388 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field728[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1618[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field797[var10];
                    int var14 = Statics.field137.field1396[var5];
                    Statics.field137.field1396[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field137.field1388 + var8 - 128;
        }
        class80.method1738(field726 + 765 - 128, 9, field726 + 765, var0 + 7);
        Statics.field3166.method1627(field726 + 382, 0);
        class80.method1706();
        int var15 = 0;
        int var16 = field726 + Statics.field137.field1388 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field728[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1618[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field797[var22];
                    int var26 = Statics.field137.field1396[var20];
                    Statics.field137.field1396[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field137.field1388 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("client.v(Lh;I)V")
    public static void method567(class26 arg0) {
        if (arg0.method631() != client.field577) {
            client.field577 = arg0.method631();
            class52.method2684(arg0.method631());
        }
        Statics.field3042 = arg0.field639;
        client.field348 = arg0.field646;
        client.field576 = arg0.field650;
        Statics.field1159 = client.field475 == 0 ? 43594 : arg0.field646 + 40000;
        Statics.field1046 = client.field475 == 0 ? 443 : arg0.field646 + 50000;
        Statics.field17 = Statics.field1159;
    }

    @ObfuscatedName("ch.o(I)V")
    public static void method1787() {
        if (class26.method183()) {
            field753 = true;
        }
    }
}
