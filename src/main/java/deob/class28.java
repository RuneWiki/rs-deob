package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("aj")
public class class28 {

    @ObfuscatedName("aj.r")
    public static int[] field650 = new int[256];

    @ObfuscatedName("aj.n")
    public static int field652 = 0;

    @ObfuscatedName("aj.d")
    public static int field653 = 0;

    @ObfuscatedName("aj.ah")
    public static int field654 = 0;

    @ObfuscatedName("aj.aj")
    public static int field655 = 0;

    @ObfuscatedName("aj.aq")
    public static int field666 = 0;

    @ObfuscatedName("aj.aa")
    public static int field658 = 0;

    @ObfuscatedName("aj.ar")
    public static int field675 = 10;

    @ObfuscatedName("aj.at")
    public static String field659 = "";

    @ObfuscatedName("aj.av")
    public static int field660 = 0;

    @ObfuscatedName("aj.af")
    public static String field664 = "";

    @ObfuscatedName("aj.ap")
    public static String field662 = "";

    @ObfuscatedName("aj.ao")
    public static String field663 = "";

    @ObfuscatedName("aj.az")
    public static String field657 = "";

    @ObfuscatedName("aj.ac")
    public static String field665 = "";

    @ObfuscatedName("aj.ad")
    public static class145 field648 = class145.field2399;

    @ObfuscatedName("aj.ag")
    public static boolean field667 = true;

    @ObfuscatedName("aj.ak")
    public static int field668 = 0;

    @ObfuscatedName("aj.an")
    public static String field669 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aj.ab")
    public static String field670 = "1234567890";

    @ObfuscatedName("aj.aw")
    public static boolean field671 = false;

    @ObfuscatedName("aj.bg")
    public static int field672 = 0;

    @ObfuscatedName("aj.bw")
    public static int[] field678 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aj.bo")
    public static int[] field674 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aj.be")
    public static int field661 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.g(Ljava/awt/Component;Leh;Leh;ZII)V")
    public static void method171(Component arg0, class147 arg1, class147 arg2, boolean arg3, int arg4) {
        if (!Statics.field673) {
            field660 = arg4;
            class73.method1525();
            byte[] var5 = arg1.method2671("title.jpg", "");
            Statics.field1894 = new class72(var5, arg0);
            Statics.field638 = Statics.field1894.method1429();
            Statics.field2127 = class70.method1856(arg2, "logo", "");
            Statics.field644 = class70.method1856(arg2, "titlebox", "");
            Statics.field645 = class70.method1856(arg2, "titlebutton", "");
            Statics.field646 = class70.method3287(arg2, "runes", "");
            Statics.field647 = class70.method3287(arg2, "title_mute", "");
            Statics.field603 = class70.method1856(arg2, "options_radio_buttons,0", "");
            Statics.field700 = class70.method1856(arg2, "options_radio_buttons,2", "");
            Statics.field1856 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1856[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1856[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1856[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1856[var9 + 192] = 16777215;
            }
            Statics.field511 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field511[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field511[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field511[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field511[var13 + 192] = 16777215;
            }
            Statics.field651 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field651[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field651[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field651[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field651[var17 + 192] = 16777215;
            }
            Statics.field185 = new int[256];
            Statics.field2001 = new int[32768];
            Statics.field2002 = new int[32768];
            method540((class74) null);
            Statics.field572 = new int[32768];
            Statics.field1943 = new int[32768];
            if (arg3) {
                field657 = "";
                field665 = "";
            }
            Statics.field1817 = 0;
            Statics.field1891 = "";
            field667 = true;
            field671 = false;
            if (Statics.field1979.field123) {
                class162.field2718 = 1;
                Statics.field560 = null;
                Statics.field2723 = -1;
                Statics.field2663 = -1;
                Statics.field2719 = 0;
                Statics.field2714 = false;
                Statics.field2720 = 2;
            } else {
                class162.method1308(2, Statics.field1569, "scape main", "", 255, false);
            }
            class151.method2232(false);
            Statics.field673 = true;
            Statics.field1894.method1438(0, 0);
            Statics.field638.method1438(382, 0);
            Statics.field2127.method1583(382 - Statics.field2127.field1328 / 2, 18);
        } else if (arg4 == 4) {
            field660 = 4;
        }
    }

    @ObfuscatedName("j.s(Lee;I)V")
    public static void method47(class131 arg0) {
        if (!field671) {
            if ((class127.field1997 == 1 || !Statics.field2473 && class127.field1997 == 4) && class127.field1998 >= 715 && class127.field1999 >= 453) {
                Statics.field1979.field123 = !Statics.field1979.field123;
                class9.method1862();
                if (Statics.field1979.field123) {
                    class162.method1755();
                } else {
                    class162.method739(Statics.field1569, "scape main", "", 255, false);
                }
            }
            if (client.field495 != 5) {
                field666++;
                if (client.field495 == 10 || client.field495 == 11) {
                    if (client.field283 == 0) {
                        if (class127.field1997 == 1 || !Statics.field2473 && class127.field1997 == 4) {
                            byte var6 = 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class127.field1998 >= var6 && class127.field1998 <= var6 + var8 && class127.field1999 >= var7 && class127.field1999 <= var7 + var9) {
                                method486();
                                return;
                            }
                        }
                        if (Statics.field1806 != null) {
                            method486();
                        }
                    }
                    int var10 = class127.field1997;
                    int var11 = class127.field1998;
                    int var12 = class127.field1999;
                    if (!Statics.field2473 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field660 == 0) {
                        short var13 = 302;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class125.method571(client.method30("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        short var15 = 462;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field242 & 0x4) != 0) {
                                if ((client.field242 & 0x400) == 0) {
                                    field664 = class143.field2355;
                                    field662 = class143.field2356;
                                    field663 = class143.field2357;
                                } else {
                                    field664 = class143.field2361;
                                    field662 = class143.field2362;
                                    field663 = class143.field2363;
                                }
                                field660 = 1;
                                field668 = 0;
                            } else if ((client.field242 & 0x400) == 0) {
                                field664 = class143.field2192;
                                field662 = class143.field2352;
                                field663 = class143.field2353;
                                field660 = 2;
                                field668 = 0;
                            } else {
                                field664 = class143.field2151;
                                field662 = class143.field2359;
                                field663 = class143.field2351;
                                field660 = 1;
                                field668 = 0;
                            }
                        }
                    } else if (field660 == 1) {
                        while (class124.method2379()) {
                            if (Statics.field691 == 84) {
                                field664 = class143.field2192;
                                field662 = class143.field2352;
                                field663 = class143.field2353;
                                field660 = 2;
                                field668 = 0;
                            } else if (Statics.field691 == 13) {
                                field660 = 0;
                            }
                        }
                        short var16 = 302;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field664 = class143.field2192;
                            field662 = class143.field2352;
                            field663 = class143.field2353;
                            field660 = 2;
                            field668 = 0;
                        }
                        short var18 = 462;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field660 = 0;
                        }
                    } else if (field660 == 2) {
                        short var19 = 231;
                        int var30 = var19 + 30;
                        if (var10 == 1 && var12 >= var30 - 15 && var12 < var30) {
                            field668 = 0;
                        }
                        var30 += 15;
                        if (var10 == 1 && var12 >= var30 - 15 && var12 < var30) {
                            field668 = 1;
                        }
                        var30 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field657 = field657.trim();
                            if (field657.length() == 0) {
                                method1756(class143.field2218, class143.field2262, class143.field2259);
                                return;
                            }
                            if (field665.length() == 0) {
                                method1756(class143.field2298, class143.field2261, class143.field2268);
                                return;
                            }
                            method1756(class143.field2366, class143.field2367, class143.field2364);
                            field648 = Statics.field1979.field124.containsKey(class200.method2350(field657)) ? class145.field2404 : class145.field2399;
                            client.method2320(20);
                            return;
                        }
                        short var22 = 462;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field660 = 0;
                            field657 = "";
                            field665 = "";
                            Statics.field1817 = 0;
                            Statics.field1891 = "";
                            field667 = true;
                        }
                        while (true) {
                            while (class124.method2379()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field669.length(); var24++) {
                                    if (Statics.field514 == field669.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (Statics.field691 == 13) {
                                    field660 = 0;
                                    field657 = "";
                                    field665 = "";
                                    Statics.field1817 = 0;
                                    Statics.field1891 = "";
                                    field667 = true;
                                } else if (field668 == 0) {
                                    if (Statics.field691 == 85 && field657.length() > 0) {
                                        field657 = field657.substring(0, field657.length() - 1);
                                    }
                                    if (Statics.field691 == 84 || Statics.field691 == 80) {
                                        field668 = 1;
                                    }
                                    if (var23 && field657.length() < 320) {
                                        field657 = field657 + Statics.field514;
                                    }
                                } else if (field668 == 1) {
                                    if (Statics.field691 == 85 && field665.length() > 0) {
                                        field665 = field665.substring(0, field665.length() - 1);
                                    }
                                    if (Statics.field691 == 84 || Statics.field691 == 80) {
                                        field668 = 0;
                                    }
                                    if (Statics.field691 == 84) {
                                        field657 = field657.trim();
                                        if (field657.length() == 0) {
                                            method1756(class143.field2218, class143.field2262, class143.field2259);
                                            return;
                                        }
                                        if (field665.length() == 0) {
                                            method1756(class143.field2298, class143.field2261, class143.field2268);
                                            return;
                                        }
                                        method1756(class143.field2366, class143.field2367, class143.field2364);
                                        field648 = Statics.field1979.field124.containsKey(class200.method2350(field657)) ? class145.field2404 : class145.field2399;
                                        client.method2320(20);
                                        return;
                                    }
                                    if (var23 && field665.length() < 20) {
                                        field665 = field665 + Statics.field514;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field660 == 4) {
                        short var25 = 302;
                        short var26 = 321;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                            Statics.field1891.trim();
                            if (Statics.field1891.length() != 6) {
                                method1756(class143.field2173, class143.field2288, class143.field2175);
                                return;
                            }
                            Statics.field1817 = Integer.parseInt(Statics.field1891);
                            Statics.field1891 = "";
                            field648 = field667 ? class145.field2398 : class145.field2400;
                            method1756(class143.field2366, class143.field2367, class143.field2364);
                            client.method2320(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= 373 && var11 <= 512 && var12 >= 263 && var12 <= 296) {
                            field667 = !field667;
                        }
                        if (var10 == 1 && var11 >= 348 && var11 <= 416 && var12 >= 351 && var12 <= 363) {
                            class125.method571(client.method30("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        short var27 = 462;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                            field660 = 0;
                            field657 = "";
                            field665 = "";
                            Statics.field1817 = 0;
                            Statics.field1891 = "";
                        }
                        while (class124.method2379()) {
                            boolean var28 = false;
                            for (int var29 = 0; var29 < field670.length(); var29++) {
                                if (Statics.field514 == field670.charAt(var29)) {
                                    var28 = true;
                                    break;
                                }
                            }
                            if (Statics.field691 == 13) {
                                field660 = 0;
                                field657 = "";
                                field665 = "";
                                Statics.field1817 = 0;
                                Statics.field1891 = "";
                            } else {
                                if (Statics.field691 == 85 && Statics.field1891.length() > 0) {
                                    Statics.field1891 = Statics.field1891.substring(0, Statics.field1891.length() - 1);
                                }
                                if (Statics.field691 == 84) {
                                    Statics.field1891.trim();
                                    if (Statics.field1891.length() != 6) {
                                        method1756(class143.field2173, class143.field2288, class143.field2175);
                                        return;
                                    }
                                    Statics.field1817 = Integer.parseInt(Statics.field1891);
                                    Statics.field1891 = "";
                                    field648 = field667 ? class145.field2398 : class145.field2400;
                                    method1756(class143.field2366, class143.field2367, class143.field2364);
                                    client.method2320(20);
                                    return;
                                }
                                if (var28 && Statics.field1891.length() < 6) {
                                    Statics.field1891 = Statics.field1891 + Statics.field514;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field1997 == 1 || !Statics.field2473 && class127.field1997 == 4) {
            short var1 = 280;
            if (class127.field1998 >= var1 && class127.field1998 <= var1 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                method566(0, 0);
            } else if (class127.field1998 >= var1 + 15 && class127.field1998 <= var1 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                method566(0, 1);
            } else {
                short var2 = 390;
                if (class127.field1998 >= var2 && class127.field1998 <= var2 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                    method566(1, 0);
                } else if (class127.field1998 >= var2 + 15 && class127.field1998 <= var2 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                    method566(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field1998 >= var3 && class127.field1998 <= var3 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                        method566(2, 0);
                    } else if (class127.field1998 >= var3 + 15 && class127.field1998 <= var3 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                        method566(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field1998 >= var4 && class127.field1998 <= var4 + 14 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                            method566(3, 0);
                        } else if (class127.field1998 >= var4 + 15 && class127.field1998 <= var4 + 80 && class127.field1999 >= 4 && class127.field1999 <= 18) {
                            method566(3, 1);
                        } else if (class127.field1998 >= 708 && class127.field1999 >= 4 && class127.field1998 <= 758 && class127.field1999 <= 20) {
                            field671 = false;
                            Statics.field1894.method1438(0, 0);
                            Statics.field638.method1438(382, 0);
                            Statics.field2127.method1583(382 - Statics.field2127.field1328 / 2, 18);
                        } else if (field661 != -1) {
                            class22 var5 = Statics.field1446[field661];
                            method3002(var5);
                            field671 = false;
                            Statics.field1894.method1438(0, 0);
                            Statics.field638.method1438(382, 0);
                            Statics.field2127.method1583(382 - Statics.field2127.field1328 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1756(String arg0, String arg1, String arg2) {
        field664 = arg0;
        field662 = arg1;
        field663 = arg2;
    }

    @ObfuscatedName("i.u(Lbq;I)V")
    public static final void method540(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2001.length; var2++) {
            Statics.field2001[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2001[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2002[var8] = (Statics.field2001[var8 - 1] + Statics.field2001[var8 + 1] + Statics.field2001[var8 - 128] + Statics.field2001[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2001;
            Statics.field2001 = Statics.field2002;
            Statics.field2002 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1323; var11++) {
            for (int var12 = 0; var12 < arg0.field1328; var12++) {
                if (arg0.field1324[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1325;
                    int var14 = var11 + 16 + arg0.field1321;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2001[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("g.j(II)V")
    public static final void method3(int arg0) {
        short var1 = 256;
        field654 += arg0 * 128;
        if (field654 > Statics.field2001.length) {
            field654 -= Statics.field2001.length;
            int var2 = (int) (Math.random() * 12.0D);
            method540(Statics.field646[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field572[var3 + var4] - Statics.field2001[field654 + var3 & Statics.field2001.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field572[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field572[var9 + var10] = 255;
                } else {
                    Statics.field572[var9 + var10] = 0;
                }
            }
        }
        if (field652 > 0) {
            field652 -= arg0 * 4;
        }
        if (field653 > 0) {
            field653 -= arg0 * 4;
        }
        if (field652 == 0 && field653 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field652 = 1024;
            }
            if (var12 == 1) {
                field653 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field650[var13] = field650[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field650[var14] = (int) (Math.sin((double) field658 / 14.0D) * 16.0D + Math.sin((double) field658 / 15.0D) * 14.0D + Math.sin((double) field658 / 16.0D) * 12.0D);
            field658++;
        }
        field655 += arg0 * 2080056265;
        int var15 = ((client.field251 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field655 * 550504260; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field572[(var18 << 7) + var17] = 192;
        }
        field655 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field572[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field572[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1943[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1943[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1943[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field572[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ak.b(IIII)I")
    public static final int method819(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("am.v(I)V")
    public static final void method890() {
        short var0 = 256;
        if (field652 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field652 > 768) {
                    Statics.field185[var1] = method819(Statics.field1856[var1], Statics.field511[var1], 1024 - field652);
                } else if (field652 > 256) {
                    Statics.field185[var1] = Statics.field511[var1];
                } else {
                    Statics.field185[var1] = method819(Statics.field511[var1], Statics.field1856[var1], 256 - field652);
                }
            }
        } else if (field653 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field653 > 768) {
                    Statics.field185[var2] = method819(Statics.field1856[var2], Statics.field651[var2], 1024 - field653);
                } else if (field653 > 256) {
                    Statics.field185[var2] = Statics.field651[var2];
                } else {
                    Statics.field185[var2] = method819(Statics.field651[var2], Statics.field1856[var2], 256 - field653);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field185[var3] = Statics.field1856[var3];
            }
        }
        class73.method1521(0, 9, 128, var0 + 7);
        Statics.field1894.method1438(0, 0);
        class73.method1557();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field650[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field572[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field185[var10];
                    int var14 = Statics.field1114.field1296[var5];
                    Statics.field1114.field1296[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1521(637, 9, 765, var0 + 7);
        Statics.field638.method1438(382, 0);
        class73.method1557();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field650[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field572[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field185[var22];
                    int var26 = Statics.field1114.field1296[var20];
                    Statics.field1114.field1296[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("r.y(Lge;Lge;I)V")
    public static void method165(class194 arg0, class194 arg1) {
        if (Statics.field2659 == null) {
            Statics.field2659 = class70.method8(Statics.field273, "sl_back", "");
        }
        if (Statics.field2722 == null) {
            Statics.field2722 = class70.method3287(Statics.field273, "sl_flags", "");
        }
        if (Statics.field592 == null) {
            Statics.field592 = class70.method3287(Statics.field273, "sl_arrows", "");
        }
        if (Statics.field1527 == null) {
            Statics.field1527 = class70.method3287(Statics.field273, "sl_stars", "");
        }
        class73.method1527(0, 23, 765, 480, 0);
        class73.method1528(0, 0, 125, 23, 12425273, 9135624);
        class73.method1528(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3321(class143.field2377, 62, 15, 0, -1);
        if (Statics.field1527 != null) {
            Statics.field1527[1].method1583(140, 1);
            arg1.method3319(class143.field2378, 152, 10, 16777215, -1);
            Statics.field1527[0].method1583(140, 12);
            arg1.method3319(class143.field2379, 152, 21, 16777215, -1);
        }
        if (Statics.field592 != null) {
            short var2 = 280;
            if (field678[0] == 0 && field674[0] == 0) {
                Statics.field592[2].method1583(var2, 4);
            } else {
                Statics.field592[0].method1583(var2, 4);
            }
            if (field678[0] == 0 && field674[0] == 1) {
                Statics.field592[3].method1583(var2 + 15, 4);
            } else {
                Statics.field592[1].method1583(var2 + 15, 4);
            }
            arg0.method3319(class143.field2232, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field678[0] == 1 && field674[0] == 0) {
                Statics.field592[2].method1583(var3, 4);
            } else {
                Statics.field592[0].method1583(var3, 4);
            }
            if (field678[0] == 1 && field674[0] == 1) {
                Statics.field592[3].method1583(var3 + 15, 4);
            } else {
                Statics.field592[1].method1583(var3 + 15, 4);
            }
            arg0.method3319(class143.field2381, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field678[0] == 2 && field674[0] == 0) {
                Statics.field592[2].method1583(var4, 4);
            } else {
                Statics.field592[0].method1583(var4, 4);
            }
            if (field678[0] == 2 && field674[0] == 1) {
                Statics.field592[3].method1583(var4 + 15, 4);
            } else {
                Statics.field592[1].method1583(var4 + 15, 4);
            }
            arg0.method3319(class143.field2217, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field678[0] == 3 && field674[0] == 0) {
                Statics.field592[2].method1583(var5, 4);
            } else {
                Statics.field592[0].method1583(var5, 4);
            }
            if (field678[0] == 3 && field674[0] == 1) {
                Statics.field592[3].method1583(var5 + 15, 4);
            } else {
                Statics.field592[1].method1583(var5 + 15, 4);
            }
            arg0.method3319(class143.field2383, var5 + 32, 17, 16777215, -1);
        }
        class73.method1527(708, 4, 50, 16, 0);
        arg1.method3321(class143.field2376, 733, 16, 16777215, -1);
        field661 = -1;
        if (Statics.field2659 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field672) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field672) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field672) {
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
            for (int var20 = 0; var20 < field672; var20++) {
                class22 var21 = Statics.field1446[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field565);
                if (var21.field565 == -1) {
                    var23 = class143.field2384;
                    var22 = false;
                } else if (var21.field565 > 1980) {
                    var23 = class143.field2360;
                    var22 = false;
                }
                byte var24;
                if (var21.method506()) {
                    if (var21.method505()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method505()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field1992 >= var17 && class127.field1988 >= var16 && class127.field1992 < var6 + var17 && class127.field1988 < var7 + var16 && var22) {
                    field661 = var20;
                    Statics.field2659[var24].method1444(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2659[var24].method1438(var17, var16);
                }
                if (Statics.field2722 != null) {
                    Statics.field2722[(var21.method505() ? 8 : 0) + var21.field566].method1583(var17 + 29, var16);
                }
                arg0.method3321(Integer.toString(var21.field564), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3321(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3314(Statics.field1446[field661].field563) + 6;
                int var26 = arg1.field2914 + 8;
                class73.method1527(class127.field1992 - var25 / 2, class127.field1988 + 20 + 5, var25, var26, 16777120);
                class73.method1522(class127.field1992 - var25 / 2, class127.field1988 + 20 + 5, var25, var26, 0);
                arg1.method3321(Statics.field1446[field661].field563, class127.field1992, class127.field1988 + 20 + 5 + arg1.field2914 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2027.getGraphics();
            Statics.field1114.method1351(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2027.repaint();
        }
    }

    @ObfuscatedName("fa.w(Ld;I)V")
    public static void method3002(class22 arg0) {
        if (arg0.method505() != client.field245) {
            client.field245 = arg0.method505();
            class45.method2348(arg0.method505());
        }
        Statics.field2786 = arg0.field568;
        client.field497 = arg0.field564;
        client.field242 = arg0.field567;
        Statics.field1298 = client.field468 == 0 ? 43594 : arg0.field564 + 40000;
        Statics.field1249 = client.field468 == 0 ? 443 : arg0.field564 + 50000;
        Statics.field2394 = Statics.field1298;
    }

    @ObfuscatedName("t.x(B)V")
    public static void method486() {
        try {
            if (Statics.field1806 == null) {
                Statics.field1806 = new class17(Statics.field235, new URL(Statics.field248));
            } else {
                byte[] var0 = Statics.field1806.method170();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field672 = var1.method2166();
                    Statics.field1446 = new class22[field672];
                    int var2 = 0;
                    while (var2 < field672) {
                        class22 var3 = Statics.field1446[var2] = new class22();
                        var3.field564 = var1.method2166();
                        var3.field567 = var1.method2286();
                        var3.field568 = var1.method2137();
                        var3.field563 = var1.method2137();
                        var3.field566 = var1.method2101();
                        var3.field565 = var1.method2104();
                        var3.field569 = var2++;
                    }
                    method1836(Statics.field1446, 0, Statics.field1446.length - 1, field678, field674);
                    field671 = true;
                    Statics.field1806 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1806 = null;
        }
    }

    @ObfuscatedName("aj.k(III)V")
    public static void method566(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field678[var5] != arg0) {
                var2[var4] = field678[var5];
                var3[var4] = field674[var5];
                var4++;
            }
        }
        field678 = var2;
        field674 = var3;
        method1836(Statics.field1446, 0, Statics.field1446.length - 1, field678, field674);
    }

    @ObfuscatedName("cr.o([Ld;II[I[II)V")
    public static void method1836(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field569;
                        var12 = var8.field569;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field565;
                        var12 = var8.field565;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method505() ? 1 : 0;
                        var12 = var8.method505() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field564;
                        var12 = var8.field564;
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
                        var15 = arg0[var5].field569;
                        var16 = var8.field569;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field565;
                        var16 = var8.field565;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method505() ? 1 : 0;
                        var16 = var8.method505() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field564;
                        var16 = var8.field564;
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
        method1836(arg0, arg1, var6, arg3, arg4);
        method1836(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
