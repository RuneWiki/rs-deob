package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ap")
public class class28 {

    @ObfuscatedName("ap.t")
    public static int[] field649 = new int[256];

    @ObfuscatedName("ap.m")
    public static int field661 = 0;

    @ObfuscatedName("ap.o")
    public static int field671 = 0;

    @ObfuscatedName("ap.ac")
    public static int field652 = 0;

    @ObfuscatedName("ap.ap")
    public static int field653 = 0;

    @ObfuscatedName("ap.ai")
    public static int field654 = 0;

    @ObfuscatedName("ap.as")
    public static int field641 = 0;

    @ObfuscatedName("ap.aa")
    public static int field656 = 10;

    @ObfuscatedName("ap.aq")
    public static String field657 = "";

    @ObfuscatedName("ap.aw")
    public static int field658 = 0;

    @ObfuscatedName("ap.am")
    public static String field678 = "";

    @ObfuscatedName("ap.av")
    public static String field668 = "";

    @ObfuscatedName("ap.an")
    public static String field659 = "";

    @ObfuscatedName("ap.at")
    public static String field642 = "";

    @ObfuscatedName("ap.ao")
    public static String field663 = "";

    @ObfuscatedName("ap.ag")
    public static class144 field669 = class144.field2416;

    @ObfuscatedName("ap.ab")
    public static boolean field665 = true;

    @ObfuscatedName("ap.al")
    public static int field666 = 0;

    @ObfuscatedName("ap.ae")
    public static String field664 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ap.af")
    public static String field650 = "1234567890";

    @ObfuscatedName("ap.ah")
    public static boolean field645 = false;

    @ObfuscatedName("ap.bo")
    public static int field670 = 0;

    @ObfuscatedName("ap.bn")
    public static int[] field660 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ap.bx")
    public static int[] field667 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ap.by")
    public static int field673 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.g(I)I")
    public static int method101() {
        return 8;
    }

    @ObfuscatedName("dm.v(Ljava/awt/Component;Lec;Lec;ZII)V")
    public static void method2311(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field662) {
            field658 = arg4;
            class73.method1538();
            byte[] var5 = arg1.method2725("title.jpg", "");
            Statics.field644 = new class72(var5, arg0);
            Statics.field1451 = Statics.field644.method1445();
            Statics.field1934 = class70.method1623(arg2, "logo", "");
            Statics.field651 = class70.method1623(arg2, "titlebox", "");
            Statics.field643 = class70.method1623(arg2, "titlebutton", "");
            Statics.field715 = class70.method452(arg2, "runes", "");
            Statics.field180 = class70.method452(arg2, "title_mute", "");
            Statics.field648 = class70.method1623(arg2, "options_radio_buttons,0", "");
            Statics.field1576 = class70.method1623(arg2, "options_radio_buttons,2", "");
            Statics.field179 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field179[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field179[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field179[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field179[var9 + 192] = 16777215;
            }
            Statics.field2009 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2009[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2009[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2009[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2009[var13 + 192] = 16777215;
            }
            Statics.field510 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field510[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field510[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field510[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field510[var17 + 192] = 16777215;
            }
            Statics.field58 = new int[256];
            Statics.field2007 = new int[32768];
            Statics.field1338 = new int[32768];
            method573((class74) null);
            Statics.field1915 = new int[32768];
            Statics.field577 = new int[32768];
            if (arg3) {
                field642 = "";
                field663 = "";
            }
            Statics.field1659 = 0;
            Statics.field2129 = "";
            field665 = true;
            field645 = false;
            if (Statics.field123.field141) {
                class161.method1081(2);
            } else {
                class147 var18 = Statics.field224;
                int var19 = var18.method2709("scape main");
                int var20 = var18.method2724(var19, "");
                class161.field2712 = 1;
                Statics.field2647 = var18;
                Statics.field2716 = var19;
                Statics.field782 = var20;
                Statics.field1821 = 255;
                Statics.field568 = false;
                Statics.field539 = 2;
            }
            class150.method848(false);
            Statics.field662 = true;
            Statics.field644.method1469(0, 0);
            Statics.field1451.method1469(382, 0);
            Statics.field1934.method1595(382 - Statics.field1934.field1316 / 2, 18);
        } else if (arg4 == 4) {
            field658 = 4;
        }
    }

    @ObfuscatedName("ae.z(Ler;I)V")
    public static void method857(class131 arg0) {
        if (field645) {
            method118(arg0);
            return;
        }
        if ((class127.field2033 == 1 || !Statics.field2761 && class127.field2033 == 4) && class127.field2027 >= 715 && class127.field2031 >= 453) {
            Statics.field123.field141 = !Statics.field123.field141;
            class9.method2441();
            if (Statics.field123.field141) {
                Statics.field64.method3041();
                class161.field2712 = 1;
                Statics.field2647 = null;
            } else {
                class161.method2384(Statics.field224, "scape main", "", 255, false);
            }
        }
        if (client.field257 == 5) {
            return;
        }
        field654++;
        if (client.field257 != 10 && client.field257 != 11) {
            return;
        }
        if (client.field256 == 0) {
            if (class127.field2033 == 1 || !Statics.field2761 && class127.field2033 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class127.field2027 >= var1 && class127.field2027 <= var1 + var3 && class127.field2031 >= var2 && class127.field2031 <= var2 + var4) {
                    method30();
                    return;
                }
            }
            if (Statics.field2649 != null) {
                method30();
            }
        }
        int var5 = class127.field2033;
        int var6 = class127.field2027;
        int var7 = class127.field2031;
        if (!Statics.field2761 && var5 == 4) {
            var5 = 1;
        }
        if (field658 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class125.method757(client.method549("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field250 & 0x4) != 0) {
                    if ((client.field250 & 0x400) == 0) {
                        field678 = class142.field2371;
                        field668 = class142.field2372;
                        field659 = class142.field2373;
                    } else {
                        field678 = class142.field2368;
                        field668 = class142.field2378;
                        field659 = class142.field2392;
                    }
                    field658 = 1;
                    field666 = 0;
                } else if ((client.field250 & 0x400) == 0) {
                    field678 = class142.field2367;
                    field668 = class142.field2308;
                    field659 = class142.field2369;
                    field658 = 2;
                    field666 = 0;
                } else {
                    field678 = class142.field2374;
                    field668 = class142.field2375;
                    field659 = class142.field2376;
                    field658 = 1;
                    field666 = 0;
                }
            }
        } else if (field658 == 1) {
            while (class124.method1441()) {
                if (Statics.field1276 == 84) {
                    field678 = class142.field2367;
                    field668 = class142.field2308;
                    field659 = class142.field2369;
                    field658 = 2;
                    field666 = 0;
                } else if (Statics.field1276 == 13) {
                    field658 = 0;
                }
            }
            short var11 = 302;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field678 = class142.field2367;
                field668 = class142.field2308;
                field659 = class142.field2369;
                field658 = 2;
                field666 = 0;
            }
            short var13 = 462;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field658 = 0;
            }
        } else if (field658 == 2) {
            short var14 = 231;
            int var25 = var14 + 30;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field666 = 0;
            }
            var25 += 15;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field666 = 1;
            }
            var25 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field642 = field642.trim();
                if (field642.length() == 0) {
                    method494(class142.field2273, class142.field2274, class142.field2189);
                    return;
                }
                if (field663.length() == 0) {
                    method494(class142.field2303, class142.field2277, class142.field2278);
                    return;
                }
                method494(class142.field2382, class142.field2383, class142.field2301);
                field669 = Statics.field123.field142.containsKey(class199.method1396(field642)) ? class144.field2417 : class144.field2416;
                client.method2374(20);
                return;
            }
            short var17 = 462;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field658 = 0;
                field642 = "";
                field663 = "";
                Statics.field1659 = 0;
                Statics.field2129 = "";
                field665 = true;
            }
            while (true) {
                while (class124.method1441()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field664.length(); var19++) {
                        if (Statics.field1848 == field664.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (Statics.field1276 == 13) {
                        field658 = 0;
                        field642 = "";
                        field663 = "";
                        Statics.field1659 = 0;
                        Statics.field2129 = "";
                        field665 = true;
                    } else if (field666 == 0) {
                        if (Statics.field1276 == 85 && field642.length() > 0) {
                            field642 = field642.substring(0, field642.length() - 1);
                        }
                        if (Statics.field1276 == 84 || Statics.field1276 == 80) {
                            field666 = 1;
                        }
                        if (var18 && field642.length() < 320) {
                            field642 = field642 + Statics.field1848;
                        }
                    } else if (field666 == 1) {
                        if (Statics.field1276 == 85 && field663.length() > 0) {
                            field663 = field663.substring(0, field663.length() - 1);
                        }
                        if (Statics.field1276 == 84 || Statics.field1276 == 80) {
                            field666 = 0;
                        }
                        if (Statics.field1276 == 84) {
                            field642 = field642.trim();
                            if (field642.length() == 0) {
                                method494(class142.field2273, class142.field2274, class142.field2189);
                                return;
                            }
                            if (field663.length() == 0) {
                                method494(class142.field2303, class142.field2277, class142.field2278);
                                return;
                            }
                            method494(class142.field2382, class142.field2383, class142.field2301);
                            field669 = Statics.field123.field142.containsKey(class199.method1396(field642)) ? class144.field2417 : class144.field2416;
                            client.method2374(20);
                            return;
                        }
                        if (var18 && field663.length() < 20) {
                            field663 = field663 + Statics.field1848;
                        }
                    }
                }
                return;
            }
        } else if (field658 == 4) {
            short var20 = 302;
            short var21 = 321;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                Statics.field2129.trim();
                if (Statics.field2129.length() != 6) {
                    method494(class142.field2360, class142.field2190, class142.field2191);
                    return;
                }
                Statics.field1659 = Integer.parseInt(Statics.field2129);
                Statics.field2129 = "";
                field669 = field665 ? class144.field2415 : class144.field2418;
                method494(class142.field2382, class142.field2383, class142.field2301);
                client.method2374(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field665 = !field665;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                class125.method757(client.method549("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var22 = 462;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                field658 = 0;
                field642 = "";
                field663 = "";
                Statics.field1659 = 0;
                Statics.field2129 = "";
            }
            while (class124.method1441()) {
                boolean var23 = false;
                for (int var24 = 0; var24 < field650.length(); var24++) {
                    if (Statics.field1848 == field650.charAt(var24)) {
                        var23 = true;
                        break;
                    }
                }
                if (Statics.field1276 == 13) {
                    field658 = 0;
                    field642 = "";
                    field663 = "";
                    Statics.field1659 = 0;
                    Statics.field2129 = "";
                } else {
                    if (Statics.field1276 == 85 && Statics.field2129.length() > 0) {
                        Statics.field2129 = Statics.field2129.substring(0, Statics.field2129.length() - 1);
                    }
                    if (Statics.field1276 == 84) {
                        Statics.field2129.trim();
                        if (Statics.field2129.length() != 6) {
                            method494(class142.field2360, class142.field2190, class142.field2191);
                            return;
                        }
                        Statics.field1659 = Integer.parseInt(Statics.field2129);
                        Statics.field2129 = "";
                        field669 = field665 ? class144.field2415 : class144.field2418;
                        method494(class142.field2382, class142.field2383, class142.field2301);
                        client.method2374(20);
                        return;
                    }
                    if (var23 && Statics.field2129.length() < 6) {
                        Statics.field2129 = Statics.field2129 + Statics.field1848;
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.h(Lgj;Lgj;I)V")
    public static void method686(class193 arg0, class193 arg1) {
        if (field645) {
            if (Statics.field1493 == null) {
                Statics.field1493 = class70.method70(Statics.field592, "sl_back", "");
            }
            if (Statics.field579 == null) {
                Statics.field579 = class70.method452(Statics.field592, "sl_flags", "");
            }
            if (Statics.field2090 == null) {
                Statics.field2090 = class70.method452(Statics.field592, "sl_arrows", "");
            }
            if (Statics.field1983 == null) {
                Statics.field1983 = class70.method452(Statics.field592, "sl_stars", "");
            }
            class73.method1590(0, 23, 765, 480, 0);
            class73.method1541(0, 0, 125, 23, 12425273, 9135624);
            class73.method1541(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3358(class142.field2157, 62, 15, 0, -1);
            if (Statics.field1983 != null) {
                Statics.field1983[1].method1595(140, 1);
                arg1.method3356(class142.field2394, 152, 10, 16777215, -1);
                Statics.field1983[0].method1595(140, 12);
                arg1.method3356(class142.field2395, 152, 21, 16777215, -1);
            }
            if (Statics.field2090 != null) {
                short var2 = 280;
                if (field660[0] == 0 && field667[0] == 0) {
                    Statics.field2090[2].method1595(var2, 4);
                } else {
                    Statics.field2090[0].method1595(var2, 4);
                }
                if (field660[0] == 0 && field667[0] == 1) {
                    Statics.field2090[3].method1595(var2 + 15, 4);
                } else {
                    Statics.field2090[1].method1595(var2 + 15, 4);
                }
                arg0.method3356(class142.field2396, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field660[0] == 1 && field667[0] == 0) {
                    Statics.field2090[2].method1595(var3, 4);
                } else {
                    Statics.field2090[0].method1595(var3, 4);
                }
                if (field660[0] == 1 && field667[0] == 1) {
                    Statics.field2090[3].method1595(var3 + 15, 4);
                } else {
                    Statics.field2090[1].method1595(var3 + 15, 4);
                }
                arg0.method3356(class142.field2397, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field660[0] == 2 && field667[0] == 0) {
                    Statics.field2090[2].method1595(var4, 4);
                } else {
                    Statics.field2090[0].method1595(var4, 4);
                }
                if (field660[0] == 2 && field667[0] == 1) {
                    Statics.field2090[3].method1595(var4 + 15, 4);
                } else {
                    Statics.field2090[1].method1595(var4 + 15, 4);
                }
                arg0.method3356(class142.field2398, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field660[0] == 3 && field667[0] == 0) {
                    Statics.field2090[2].method1595(var5, 4);
                } else {
                    Statics.field2090[0].method1595(var5, 4);
                }
                if (field660[0] == 3 && field667[0] == 1) {
                    Statics.field2090[3].method1595(var5 + 15, 4);
                } else {
                    Statics.field2090[1].method1595(var5 + 15, 4);
                }
                arg0.method3356(class142.field2399, var5 + 32, 17, 16777215, -1);
            }
            class73.method1590(708, 4, 50, 16, 0);
            arg1.method3358(class142.field2262, 733, 16, 16777215, -1);
            field673 = -1;
            if (Statics.field1493 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field670) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
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
                int var17 = var14;
                int var18 = 0;
                boolean var19 = false;
                for (int var20 = 0; var20 < field670; var20++) {
                    class22 var21 = Statics.field655[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field571);
                    if (var21.field571 == -1) {
                        var23 = class142.field2400;
                        var22 = false;
                    } else if (var21.field571 > 1980) {
                        var23 = class142.field2401;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method488()) {
                        if (var21.method487()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method487()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2023 >= var17 && class127.field2017 * 1105708693 >= var16 && class127.field2023 < var6 + var17 && class127.field2017 * 1105708693 < var7 + var16 && var22) {
                        field673 = var20;
                        Statics.field1493[var24].method1460(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field1493[var24].method1469(var17, var16);
                    }
                    if (Statics.field579 != null) {
                        Statics.field579[(var21.method487() ? 8 : 0) + var21.field575].method1595(var17 + 29, var16);
                    }
                    arg0.method3358(Integer.toString(var21.field581), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3358(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3351(Statics.field655[field673].field574) + 6;
                    int var26 = arg1.field2912 + 8;
                    class73.method1590(class127.field2023 - var25 / 2, class127.field2017 * 1105708693 + 20 + 5, var25, var26, 16777120);
                    class73.method1542(class127.field2023 - var25 / 2, class127.field2017 * 1105708693 + 20 + 5, var25, var26, 0);
                    arg1.method3358(Statics.field655[field673].field574, class127.field2023, class127.field2017 * 1105708693 + 20 + 5 + arg1.field2912 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field632.getGraphics();
                Statics.field1889.method1360(var27, 0, 0);
            } catch (Exception var112) {
                Statics.field632.repaint();
            }
            return;
        }
        if (client.field257 == 0 || client.field257 == 5) {
            byte var29 = 20;
            arg0.method3358(class142.field2366, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1542(230, var30, 304, 34, 9179409);
            class73.method1542(231, var30 + 1, 302, 32, 0);
            class73.method1590(232, var30 + 2, field656 * 3, 30, 9179409);
            class73.method1590(field656 * 3 + 232, var30 + 2, 300 - field656 * 3, 30, 0);
            arg0.method3358(field657, 382, 276 - var29, 16777215, -1);
        }
        if (client.field257 == 20) {
            Statics.field651.method1595(382 - Statics.field651.field1316 / 2, 271 - Statics.field651.field1317 / 2);
            short var31 = 211;
            arg0.method3358(field678, 382, var31, 16776960, 0);
            int var114 = var31 + 15;
            arg0.method3358(field668, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3358(field659, 382, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field658 != 4) {
                arg0.method3356(class142.field2362, 272, var117, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field642; arg0.method3351(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3356(class192.method3355(var33), 312, var117, 16777215, 0);
                var114 = var117 + 15;
                String var35 = class142.field2386;
                String var36 = field663;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3356(var35 + var40, 274, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field257 == 10 || client.field257 == 11) {
            Statics.field651.method1595(202, 171);
            if (field658 == 0) {
                short var42 = 251;
                arg0.method3358(class142.field2388, 382, var42, 16776960, 0);
                int var118 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field643.method1595(var43 - 73, var44 - 20);
                arg0.method3359(class142.field2389, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field643.method1595(var45 - 73, var44 - 20);
                arg0.method3359(class142.field2359, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field658 == 1) {
                arg0.method3358(class142.field2370, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3358(field678, 382, var46, 16777215, 0);
                int var119 = var46 + 15;
                arg0.method3358(field668, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3358(field659, 382, var120, 16777215, 0);
                int var121 = var120 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field643.method1595(var47 - 73, var48 - 20);
                arg0.method3358(class142.field2162, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field643.method1595(var49 - 73, var48 - 20);
                arg0.method3358(class142.field2262, var49, var48 + 5, 16777215, 0);
            } else if (field658 == 2) {
                short var50 = 211;
                arg0.method3358(field678, 382, var50, 16776960, 0);
                int var122 = var50 + 15;
                arg0.method3358(field668, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3358(field659, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3356(class142.field2362, 272, var125, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field642; arg0.method3351(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3356(class192.method3355(var52) + (field666 == 0 & client.field259 % 40 < 20 ? class2.method2078(16776960) + class2.field18 : ""), 312, var125, 16777215, 0);
                var122 = var125 + 15;
                String var54 = class142.field2386;
                String var55 = field663;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3356(var54 + var59 + (field666 == 1 & client.field259 % 40 < 20 ? class2.method2078(16776960) + class2.field18 : ""), 274, var122, 16777215, 0);
                var122 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field643.method1595(var61 - 73, var62 - 20);
                arg0.method3358(class142.field2391, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field643.method1595(var63 - 73, var62 - 20);
                arg0.method3358(class142.field2262, var63, var62 + 5, 16777215, 0);
            } else if (field658 == 4) {
                arg0.method3358(class142.field2380, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3358(field678, 382, var64, 16777215, 0);
                int var126 = var64 + 15;
                arg0.method3358(field668, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3358(field659, 382, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var66 = class142.field2233;
                String var67 = Statics.field2129;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3356(var66 + var71 + (client.field259 % 40 < 20 ? class2.method2078(16776960) + class2.field18 : ""), 274, var128, 16777215, 0);
                var126 = var128 - 8;
                arg0.method3356(class142.field2163, 373, var126, 16776960, 0);
                var126 += 15;
                arg0.method3356(class142.field2184, 373, var126, 16776960, 0);
                int var73 = 373 + arg0.method3351(class142.field2184) + 15;
                int var74 = var126 - arg0.field2912;
                class74 var75;
                if (field665) {
                    var75 = Statics.field1576;
                } else {
                    var75 = Statics.field648;
                }
                var75.method1595(var73, var74);
                var126 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field643.method1595(var76 - 73, var77 - 20);
                arg0.method3358(class142.field2162, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field643.method1595(var78 - 73, var77 - 20);
                arg0.method3358(class142.field2262, var78, var77 + 5, 16777215, 0);
                arg1.method3358(class142.field2381, 382, var77 + 36, 255, 0);
            }
        }
        if (field654 > 0) {
            method1897(field654);
            field654 = 0;
        }
        short var79 = 256;
        if (field661 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field661 > 768) {
                    Statics.field58[var80] = method928(Statics.field179[var80], Statics.field2009[var80], 1024 - field661);
                } else if (field661 > 256) {
                    Statics.field58[var80] = Statics.field2009[var80];
                } else {
                    Statics.field58[var80] = method928(Statics.field2009[var80], Statics.field179[var80], 256 - field661);
                }
            }
        } else if (field671 > 0) {
            for (int var81 = 0; var81 < 256; var81++) {
                if (field671 > 768) {
                    Statics.field58[var81] = method928(Statics.field179[var81], Statics.field510[var81], 1024 - field671);
                } else if (field671 > 256) {
                    Statics.field58[var81] = Statics.field510[var81];
                } else {
                    Statics.field58[var81] = method928(Statics.field510[var81], Statics.field179[var81], 256 - field671);
                }
            }
        } else {
            for (int var82 = 0; var82 < 256; var82++) {
                Statics.field58[var82] = Statics.field179[var82];
            }
        }
        class73.method1539(0, 9, 128, var79 + 7);
        Statics.field644.method1469(0, 0);
        class73.method1533();
        int var83 = 0;
        int var84 = 6885;
        for (int var85 = 1; var85 < var79 - 1; var85++) {
            int var86 = (var79 - var85) * field649[var85] / var79;
            int var87 = var86 + 22;
            if (var87 < 0) {
                var87 = 0;
            }
            var83 += var87;
            for (int var88 = var87; var88 < 128; var88++) {
                int var89 = Statics.field1915[var83++];
                if (var89 == 0) {
                    var84++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field58[var89];
                    int var93 = Statics.field1889.field1287[var84];
                    Statics.field1889.field1287[var84++] = ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) >> 8;
                }
            }
            var84 += var87 + 765 - 128;
        }
        class73.method1539(637, 9, 765, var79 + 7);
        Statics.field1451.method1469(382, 0);
        class73.method1533();
        int var94 = 0;
        int var95 = 7546;
        for (int var96 = 1; var96 < var79 - 1; var96++) {
            int var97 = (var79 - var96) * field649[var96] / var79;
            int var98 = 103 - var97;
            int var99 = var95 + var97;
            for (int var100 = 0; var100 < var98; var100++) {
                int var101 = Statics.field1915[var94++];
                if (var101 == 0) {
                    var99++;
                } else {
                    int var103 = 256 - var101;
                    int var104 = Statics.field58[var101];
                    int var105 = Statics.field1889.field1287[var99];
                    Statics.field1889.field1287[var99++] = ((var104 & 0xFF00FF) * var101 + (var105 & 0xFF00FF) * var103 & 0xFF00FF00) + ((var104 & 0xFF00) * var101 + (var105 & 0xFF00) * var103 & 0xFF0000) >> 8;
                }
            }
            var94 += 128 - var98;
            var95 = 765 - var98 - var97 + var99;
        }
        Statics.field180[Statics.field123.field141 ? 1 : 0].method1595(725, 463);
        if (client.field257 > 5 && client.field256 == 0) {
            if (Statics.field522 == null) {
                Statics.field522 = class70.method1623(Statics.field592, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field522.method1595(var106, var107);
                arg0.method3358(class142.field2321 + " " + client.field249, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field2649 == null) {
                    arg1.method3358(class142.field2403, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3358(class142.field2209, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field632.getGraphics();
            Statics.field1889.method1360(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field632.repaint();
        }
    }

    @ObfuscatedName("o.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method494(String arg0, String arg1, String arg2) {
        field678 = arg0;
        field668 = arg1;
        field659 = arg2;
    }

    @ObfuscatedName("aa.l(Lbt;I)V")
    public static final void method573(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2007.length; var2++) {
            Statics.field2007[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2007[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1338[var8] = (Statics.field2007[var8 - 1] + Statics.field2007[var8 + 1] + Statics.field2007[var8 - 128] + Statics.field2007[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2007;
            Statics.field2007 = Statics.field1338;
            Statics.field1338 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1317; var11++) {
            for (int var12 = 0; var12 < arg0.field1316; var12++) {
                if (arg0.field1320[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1318;
                    int var14 = var11 + 16 + arg0.field1314;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2007[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cn.e(IS)V")
    public static final void method1897(int arg0) {
        short var1 = 256;
        field652 += arg0 * 128;
        if (field652 > Statics.field2007.length) {
            field652 -= Statics.field2007.length;
            int var2 = (int) (Math.random() * 12.0D);
            method573(Statics.field715[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1915[var3 + var4] - Statics.field2007[field652 + var3 & Statics.field2007.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1915[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1915[var9 + var10] = 255;
                } else {
                    Statics.field1915[var9 + var10] = 0;
                }
            }
        }
        if (field661 > 0) {
            field661 -= arg0 * 4;
        }
        if (field671 > 0) {
            field671 -= arg0 * 4;
        }
        if (field661 == 0 && field671 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field661 = 1024;
            }
            if (var12 == 1) {
                field671 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field649[var13] = field649[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field649[var14] = (int) (Math.sin((double) field641 / 14.0D) * 16.0D + Math.sin((double) field641 / 15.0D) * 14.0D + Math.sin((double) field641 / 16.0D) * 12.0D);
            field641++;
        }
        field653 += arg0 * -1061549843;
        int var15 = ((client.field259 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field653 * 379464052; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1915[(var18 << 7) + var17] = 192;
        }
        field653 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1915[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1915[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field577[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field577[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field577[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1915[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("aj.j(IIIB)I")
    public static final int method928(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("a.n(Ler;B)V")
    public static void method118(class131 arg0) {
        if (class127.field2033 != 1 && Statics.field2761 || class127.field2033 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2027 >= var1 && class127.field2027 <= var1 + 14 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(0, 0);
            return;
        }
        if (class127.field2027 >= var1 + 15 && class127.field2027 <= var1 + 80 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2027 >= var2 && class127.field2027 <= var2 + 14 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(1, 0);
            return;
        }
        if (class127.field2027 >= var2 + 15 && class127.field2027 <= var2 + 80 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2027 >= var3 && class127.field2027 <= var3 + 14 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(2, 0);
            return;
        }
        if (class127.field2027 >= var3 + 15 && class127.field2027 <= var3 + 80 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2027 >= var4 && class127.field2027 <= var4 + 14 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(3, 0);
            return;
        }
        if (class127.field2027 >= var4 + 15 && class127.field2027 <= var4 + 80 && class127.field2031 >= 4 && class127.field2031 <= 18) {
            method2704(3, 1);
            return;
        }
        if (class127.field2027 >= 708 && class127.field2031 >= 4 && class127.field2027 <= 758 && class127.field2031 <= 20) {
            field645 = false;
            Statics.field644.method1469(0, 0);
            Statics.field1451.method1469(382, 0);
            Statics.field1934.method1595(382 - Statics.field1934.field1316 / 2, 18);
            return;
        }
        if (field673 == -1) {
            return;
        }
        class22 var5 = Statics.field655[field673];
        method593(var5);
        field645 = false;
        Statics.field644.method1469(0, 0);
        Statics.field1451.method1469(382, 0);
        Statics.field1934.method1595(382 - Statics.field1934.field1316 / 2, 18);
        return;
    }

    @ObfuscatedName("aq.f(Lo;I)V")
    public static void method593(class22 arg0) {
        if (arg0.method487() != client.field254) {
            client.field254 = arg0.method487();
            class45.method1891(arg0.method487());
        }
        Statics.field2075 = arg0.field573;
        client.field249 = arg0.field581;
        client.field250 = arg0.field570;
        Statics.field286 = client.field252 == 0 ? 43594 : arg0.field581 + 40000;
        Statics.field152 = client.field252 == 0 ? 443 : arg0.field581 + 50000;
        Statics.field1938 = Statics.field286;
    }

    @ObfuscatedName("z.a(I)V")
    public static void method30() {
        try {
            if (Statics.field2649 == null) {
                Statics.field2649 = new class17(Statics.field985, new URL(Statics.field1869));
            } else {
                byte[] var0 = Statics.field2649.method155();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field670 = var1.method2141();
                    Statics.field655 = new class22[field670];
                    int var2 = 0;
                    while (var2 < field670) {
                        class22 var3 = Statics.field655[var2] = new class22();
                        var3.field581 = var1.method2141();
                        var3.field570 = var1.method2144();
                        var3.field573 = var1.method2147();
                        var3.field574 = var1.method2147();
                        var3.field575 = var1.method2139();
                        var3.field571 = var1.method2142();
                        var3.field572 = var2++;
                    }
                    method90(Statics.field655, 0, Statics.field655.length - 1, field660, field667);
                    field645 = true;
                    Statics.field2649 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2649 = null;
        }
    }

    @ObfuscatedName("ei.i(IIB)V")
    public static void method2704(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field660[var5] != arg0) {
                var2[var4] = field660[var5];
                var3[var4] = field667[var5];
                var4++;
            }
        }
        field660 = var2;
        field667 = var3;
        method90(Statics.field655, 0, Statics.field655.length - 1, field660, field667);
    }

    @ObfuscatedName("j.y([Lo;II[I[II)V")
    public static void method90(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field572;
                        var12 = var8.field572;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field571;
                        var12 = var8.field571;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method487() ? 1 : 0;
                        var12 = var8.method487() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field581;
                        var12 = var8.field581;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field572;
                        var16 = var8.field572;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field571;
                        var16 = var8.field571;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method487() ? 1 : 0;
                        var16 = var8.method487() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field581;
                        var16 = var8.field581;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method90(arg0, arg1, var6, arg3, arg4);
        method90(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
