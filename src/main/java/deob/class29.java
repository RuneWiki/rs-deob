package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ah")
public class class29 {

    @ObfuscatedName("ah.q")
    public static int[] field681 = new int[256];

    @ObfuscatedName("ah.g")
    public static int field659 = 0;

    @ObfuscatedName("ah.y")
    public static int field660 = 0;

    @ObfuscatedName("ah.an")
    public static int field680 = 0;

    @ObfuscatedName("ah.as")
    public static int field687 = 0;

    @ObfuscatedName("ah.ah")
    public static int field662 = 0;

    @ObfuscatedName("ah.ar")
    public static int field657 = 0;

    @ObfuscatedName("ah.ae")
    public static int field666 = 10;

    @ObfuscatedName("ah.av")
    public static String field667 = "";

    @ObfuscatedName("ah.al")
    public static int field668 = 0;

    @ObfuscatedName("ah.aq")
    public static String field664 = "";

    @ObfuscatedName("ah.am")
    public static String field670 = "";

    @ObfuscatedName("ah.ax")
    public static String field663 = "";

    @ObfuscatedName("ah.az")
    public static String field671 = "";

    @ObfuscatedName("ah.ai")
    public static String field673 = "";

    @ObfuscatedName("ah.aa")
    public static class149 field674 = class149.field2439;

    @ObfuscatedName("ah.ao")
    public static boolean field653 = true;

    @ObfuscatedName("ah.ag")
    public static int field676 = 0;

    @ObfuscatedName("ah.ad")
    public static String field677 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.au")
    public static String field675 = "1234567890";

    @ObfuscatedName("ah.aj")
    public static boolean field679 = false;

    @ObfuscatedName("ah.bo")
    public static int field685 = 0;

    @ObfuscatedName("ah.bm")
    public static int[] field686 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ah.bz")
    public static int[] field682 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ah.br")
    public static int field683 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.a(Ljava/awt/Component;Lek;Lek;ZII)V")
    public static void method180(Component arg0, class151 arg1, class151 arg2, boolean arg3, int arg4) {
        if (!Statics.field550) {
            field668 = arg4;
            class74.method1549();
            byte[] var5 = arg1.method2747("title.jpg", "");
            Statics.field1918 = new class73(var5, arg0);
            Statics.field654 = Statics.field1918.method1468();
            Statics.field655 = class71.method132(arg2, "logo", "");
            Statics.field2973 = class71.method132(arg2, "titlebox", "");
            Statics.field658 = class71.method132(arg2, "titlebutton", "");
            Statics.field208 = class71.method2427(arg2, "runes", "");
            Statics.field2974 = class71.method2427(arg2, "title_mute", "");
            Statics.field2010 = class71.method132(arg2, "options_radio_buttons,0", "");
            Statics.field656 = class71.method132(arg2, "options_radio_buttons,2", "");
            Statics.field1508 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1508[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1508[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1508[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1508[var9 + 192] = 16777215;
            }
            Statics.field1844 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1844[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1844[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1844[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1844[var13 + 192] = 16777215;
            }
            Statics.field1353 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1353[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1353[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1353[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1353[var17 + 192] = 16777215;
            }
            Statics.field14 = new int[256];
            Statics.field136 = new int[32768];
            Statics.field3037 = new int[32768];
            Statics.method498((class75) null);
            Statics.field547 = new int[32768];
            Statics.field661 = new int[32768];
            if (arg3) {
                field671 = "";
                field673 = "";
            }
            Statics.field1659 = 0;
            Statics.field901 = "";
            field653 = true;
            field679 = false;
            if (Statics.field101.field147) {
                class166.field2748 = 1;
                Statics.field2749 = null;
                Statics.field3036 = -1;
                Statics.field1950 = -1;
                Statics.field210 = 0;
                Statics.field2751 = false;
                Statics.field2745 = 2;
            } else {
                Statics.method1767(2, Statics.field250, "scape main", "", 255, false);
            }
            class155.method1865(false);
            Statics.field550 = true;
            Statics.field1918.method1427(0, 0);
            Statics.field654.method1427(382, 0);
            Statics.field655.method1573(382 - Statics.field655.field1328 / 2, 18);
        } else if (arg4 == 4) {
            field668 = 4;
        }
    }

    @ObfuscatedName("da.v(Leq;I)V")
    public static void method2460(class135 arg0) {
        if (field679) {
            method162(arg0);
            return;
        }
        if ((class131.field2036 == 1 || !Statics.field1816 && class131.field2036 == 4) && class131.field2024 >= 715 && class131.field2026 >= 453) {
            Statics.field101.field147 = !Statics.field101.field147;
            class9.method531();
            if (Statics.field101.field147) {
                class166.method3();
            } else {
                class152 var1 = Statics.field250;
                int var2 = var1.method2745("scape main");
                int var3 = var1.method2746(var2, "");
                class166.method130(var1, var2, var3, 255, false);
            }
        }
        if (client.field384 == 5) {
            return;
        }
        field662++;
        if (client.field384 != 10 && client.field384 != 11) {
            return;
        }
        if (client.field263 == 0) {
            if (class131.field2036 == 1 || !Statics.field1816 && class131.field2036 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class131.field2024 >= var4 && class131.field2024 <= var4 + var6 && class131.field2026 >= var5 && class131.field2026 <= var5 + var7) {
                    method30();
                    return;
                }
            }
            if (Statics.field1824 != null) {
                method30();
            }
        }
        int var8 = class131.field2036;
        int var9 = class131.field2024;
        int var10 = class131.field2026;
        if (!Statics.field1816 && var8 == 4) {
            var8 = 1;
        }
        if (field668 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class129.method497(client.method527("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field358 & 0x4) != 0) {
                    if ((client.field358 & 0x400) == 0) {
                        field664 = class147.field2281;
                        field670 = class147.field2310;
                        field663 = class147.field2277;
                    } else {
                        field664 = class147.field2402;
                        field670 = class147.field2403;
                        field663 = class147.field2186;
                    }
                    field668 = 1;
                    field676 = 0;
                } else if ((client.field358 & 0x400) == 0) {
                    field664 = class147.field2392;
                    field670 = class147.field2393;
                    field663 = class147.field2394;
                    field668 = 2;
                    field676 = 0;
                } else {
                    field664 = class147.field2399;
                    field670 = class147.field2247;
                    field663 = class147.field2401;
                    field668 = 1;
                    field676 = 0;
                }
            }
        } else if (field668 == 1) {
            while (Statics.method2444()) {
                if (Statics.field626 == 84) {
                    field664 = class147.field2392;
                    field670 = class147.field2393;
                    field663 = class147.field2394;
                    field668 = 2;
                    field676 = 0;
                } else if (Statics.field626 == 13) {
                    field668 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field664 = class147.field2392;
                field670 = class147.field2393;
                field663 = class147.field2394;
                field668 = 2;
                field676 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field668 = 0;
            }
        } else if (field668 == 2) {
            short var17 = 231;
            int var28 = var17 + 30;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field676 = 0;
            }
            var28 += 15;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field676 = 1;
            }
            var28 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field671 = field671.trim();
                if (field671.length() == 0) {
                    method161(class147.field2261, class147.field2342, class147.field2300);
                    return;
                }
                if (field673.length() == 0) {
                    method161(class147.field2301, class147.field2424, class147.field2289);
                    return;
                }
                method161(class147.field2314, class147.field2408, class147.field2409);
                field674 = Statics.field101.field144.containsKey(class213.method534(field671)) ? class149.field2441 : class149.field2439;
                client.method590(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field668 = 0;
                field671 = "";
                field673 = "";
                Statics.field1659 = 0;
                Statics.field901 = "";
                field653 = true;
            }
            while (true) {
                while (Statics.method2444()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field677.length(); var22++) {
                        if (Statics.field579 == field677.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field626 == 13) {
                        field668 = 0;
                        field671 = "";
                        field673 = "";
                        Statics.field1659 = 0;
                        Statics.field901 = "";
                        field653 = true;
                    } else if (field676 == 0) {
                        if (Statics.field626 == 85 && field671.length() > 0) {
                            field671 = field671.substring(0, field671.length() - 1);
                        }
                        if (Statics.field626 == 84 || Statics.field626 == 80) {
                            field676 = 1;
                        }
                        if (var21 && field671.length() < 320) {
                            field671 = field671 + Statics.field579;
                        }
                    } else if (field676 == 1) {
                        if (Statics.field626 == 85 && field673.length() > 0) {
                            field673 = field673.substring(0, field673.length() - 1);
                        }
                        if (Statics.field626 == 84 || Statics.field626 == 80) {
                            field676 = 0;
                        }
                        if (Statics.field626 == 84) {
                            field671 = field671.trim();
                            if (field671.length() == 0) {
                                method161(class147.field2261, class147.field2342, class147.field2300);
                                return;
                            }
                            if (field673.length() == 0) {
                                method161(class147.field2301, class147.field2424, class147.field2289);
                                return;
                            }
                            method161(class147.field2314, class147.field2408, class147.field2409);
                            field674 = Statics.field101.field144.containsKey(class213.method534(field671)) ? class149.field2441 : class149.field2439;
                            client.method590(20);
                            return;
                        }
                        if (var21 && field673.length() < 20) {
                            field673 = field673 + Statics.field579;
                        }
                    }
                }
                return;
            }
        } else if (field668 == 4) {
            short var23 = 302;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                Statics.field901.trim();
                if (Statics.field901.length() != 6) {
                    method161(class147.field2214, class147.field2215, class147.field2216);
                    return;
                }
                Statics.field1659 = Integer.parseInt(Statics.field901);
                Statics.field901 = "";
                field674 = field653 ? class149.field2438 : class149.field2440;
                method161(class147.field2314, class147.field2408, class147.field2409);
                client.method590(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field653 = !field653;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                class129.method497(client.method527("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var25 = 462;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field668 = 0;
                field671 = "";
                field673 = "";
                Statics.field1659 = 0;
                Statics.field901 = "";
            }
            while (Statics.method2444()) {
                boolean var26 = false;
                for (int var27 = 0; var27 < field675.length(); var27++) {
                    if (Statics.field579 == field675.charAt(var27)) {
                        var26 = true;
                        break;
                    }
                }
                if (Statics.field626 == 13) {
                    field668 = 0;
                    field671 = "";
                    field673 = "";
                    Statics.field1659 = 0;
                    Statics.field901 = "";
                } else {
                    if (Statics.field626 == 85 && Statics.field901.length() > 0) {
                        Statics.field901 = Statics.field901.substring(0, Statics.field901.length() - 1);
                    }
                    if (Statics.field626 == 84) {
                        Statics.field901.trim();
                        if (Statics.field901.length() != 6) {
                            method161(class147.field2214, class147.field2215, class147.field2216);
                            return;
                        }
                        Statics.field1659 = Integer.parseInt(Statics.field901);
                        Statics.field901 = "";
                        field674 = field653 ? class149.field2438 : class149.field2440;
                        method161(class147.field2314, class147.field2408, class147.field2409);
                        client.method590(20);
                        return;
                    }
                    if (var26 && Statics.field901.length() < 6) {
                        Statics.field901 = Statics.field901 + Statics.field579;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.i(Lgm;Lgm;I)V")
    public static void method716(class207 arg0, class207 arg1) {
        if (field679) {
            if (Statics.field684 == null) {
                Statics.field684 = class71.method2902(Statics.field2012, "sl_back", "");
            }
            if (Statics.field665 == null) {
                Statics.field665 = class71.method2427(Statics.field2012, "sl_flags", "");
            }
            if (Statics.field168 == null) {
                Statics.field168 = class71.method2427(Statics.field2012, "sl_arrows", "");
            }
            if (Statics.field538 == null) {
                Statics.field538 = class71.method2427(Statics.field2012, "sl_stars", "");
            }
            class74.method1520(0, 23, 765, 480, 0);
            class74.method1521(0, 0, 125, 23, 12425273, 9135624);
            class74.method1521(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3450(class147.field2410, 62, 15, 0, -1);
            if (Statics.field538 != null) {
                Statics.field538[1].method1573(140, 1);
                arg1.method3522(class147.field2202, 152, 10, 16777215, -1);
                Statics.field538[0].method1573(140, 12);
                arg1.method3522(class147.field2420, 152, 21, 16777215, -1);
            }
            if (Statics.field168 != null) {
                short var2 = 280;
                if (field686[0] == 0 && field682[0] == 0) {
                    Statics.field168[2].method1573(var2, 4);
                } else {
                    Statics.field168[0].method1573(var2, 4);
                }
                if (field686[0] == 0 && field682[0] == 1) {
                    Statics.field168[3].method1573(var2 + 15, 4);
                } else {
                    Statics.field168[1].method1573(var2 + 15, 4);
                }
                arg0.method3522(class147.field2205, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field686[0] == 1 && field682[0] == 0) {
                    Statics.field168[2].method1573(var3, 4);
                } else {
                    Statics.field168[0].method1573(var3, 4);
                }
                if (field686[0] == 1 && field682[0] == 1) {
                    Statics.field168[3].method1573(var3 + 15, 4);
                } else {
                    Statics.field168[1].method1573(var3 + 15, 4);
                }
                arg0.method3522(class147.field2422, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field686[0] == 2 && field682[0] == 0) {
                    Statics.field168[2].method1573(var4, 4);
                } else {
                    Statics.field168[0].method1573(var4, 4);
                }
                if (field686[0] == 2 && field682[0] == 1) {
                    Statics.field168[3].method1573(var4 + 15, 4);
                } else {
                    Statics.field168[1].method1573(var4 + 15, 4);
                }
                arg0.method3522(class147.field2423, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field686[0] == 3 && field682[0] == 0) {
                    Statics.field168[2].method1573(var5, 4);
                } else {
                    Statics.field168[0].method1573(var5, 4);
                }
                if (field686[0] == 3 && field682[0] == 1) {
                    Statics.field168[3].method1573(var5 + 15, 4);
                } else {
                    Statics.field168[1].method1573(var5 + 15, 4);
                }
                arg0.method3522(class147.field2363, var5 + 32, 17, 16777215, -1);
            }
            class74.method1520(708, 4, 50, 16, 0);
            arg1.method3450(class147.field2374, 733, 16, 16777215, -1);
            field683 = -1;
            if (Statics.field684 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field685) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field685) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field685) {
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
                for (int var20 = 0; var20 < field685; var20++) {
                    class23 var21 = Statics.field2949[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field593);
                    if (var21.field593 == -1) {
                        var23 = class147.field2425;
                        var22 = false;
                    } else if (var21.field593 > 1980) {
                        var23 = class147.field2426;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method524()) {
                        if (var21.method523()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method523()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class131.field2030 >= var17 && class131.field2031 * -778357537 >= var16 && class131.field2030 < var6 + var17 && class131.field2031 * -778357537 < var7 + var16 && var22) {
                        field683 = var20;
                        Statics.field684[var24].method1433(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field684[var24].method1427(var17, var16);
                    }
                    if (Statics.field665 != null) {
                        Statics.field665[(var21.method523() ? 8 : 0) + var21.field589].method1573(var17 + 29, var16);
                    }
                    arg0.method3450(Integer.toString(var21.field590), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3450(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3443(Statics.field2949[field683].field588) + 6;
                    int var26 = arg1.field2983 + 8;
                    class74.method1520(class131.field2030 - var25 / 2, class131.field2031 * -778357537 + 20 + 5, var25, var26, 16777120);
                    class74.method1522(class131.field2030 - var25 / 2, class131.field2031 * -778357537 + 20 + 5, var25, var26, 0);
                    arg1.method3450(Statics.field2949[field683].field588, class131.field2030, class131.field2031 * -778357537 + 20 + 5 + arg1.field2983 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field2706.getGraphics();
                Statics.field127.method1366(var27, 0, 0);
            } catch (Exception var100) {
                Statics.field2706.repaint();
            }
            return;
        }
        if (client.field384 == 0 || client.field384 == 5) {
            byte var29 = 20;
            arg0.method3450(class147.field2204, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class74.method1522(230, var30, 304, 34, 9179409);
            class74.method1522(231, var30 + 1, 302, 32, 0);
            class74.method1520(232, var30 + 2, field666 * 3, 30, 9179409);
            class74.method1520(field666 * 3 + 232, var30 + 2, 300 - field666 * 3, 30, 0);
            arg0.method3450(field667, 382, 276 - var29, 16777215, -1);
        }
        if (client.field384 == 20) {
            Statics.field2973.method1573(382 - Statics.field2973.field1328 / 2, 271 - Statics.field2973.field1327 / 2);
            short var31 = 211;
            arg0.method3450(field664, 382, var31, 16776960, 0);
            int var102 = var31 + 15;
            arg0.method3450(field670, 382, var102, 16776960, 0);
            int var103 = var102 + 15;
            arg0.method3450(field663, 382, var103, 16776960, 0);
            int var104 = var103 + 15;
            int var105 = var104 + 10;
            if (field668 != 4) {
                arg0.method3522(class147.field2248, 272, var105, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field671; arg0.method3443(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3522(class206.method3447(var33), 312, var105, 16777215, 0);
                var102 = var105 + 15;
                String var35 = class147.field2366;
                String var36 = field673;
                String var37 = class213.method1864('*', var36.length());
                arg0.method3522(var35 + var37, 274, var102, 16777215, 0);
                var102 += 15;
            }
        }
        if (client.field384 == 10 || client.field384 == 11) {
            Statics.field2973.method1573(202, 171);
            if (field668 == 0) {
                short var38 = 251;
                arg0.method3450(class147.field2413, 382, var38, 16776960, 0);
                int var106 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field658.method1573(var39 - 73, var40 - 20);
                arg0.method3451(class147.field2414, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field658.method1573(var41 - 73, var40 - 20);
                arg0.method3451(class147.field2415, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field668 == 1) {
                arg0.method3450(class147.field2395, 382, 211, 16776960, 0);
                short var42 = 236;
                arg0.method3450(field664, 382, var42, 16777215, 0);
                int var107 = var42 + 15;
                arg0.method3450(field670, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method3450(field663, 382, var108, 16777215, 0);
                int var109 = var108 + 15;
                short var43 = 302;
                short var44 = 321;
                Statics.field658.method1573(var43 - 73, var44 - 20);
                arg0.method3450(class147.field2187, var43, var44 + 5, 16777215, 0);
                short var45 = 462;
                Statics.field658.method1573(var45 - 73, var44 - 20);
                arg0.method3450(class147.field2374, var45, var44 + 5, 16777215, 0);
            } else if (field668 == 2) {
                short var46 = 211;
                arg0.method3450(field664, 382, var46, 16776960, 0);
                int var110 = var46 + 15;
                arg0.method3450(field670, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method3450(field663, 382, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var113 = var112 + 10;
                arg0.method3522(class147.field2248, 272, var113, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = field671; arg0.method3443(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method3522(class206.method3447(var48) + (field676 == 0 & client.field266 % 40 < 20 ? class2.method2316(16776960) + class2.field16 : ""), 312, var113, 16777215, 0);
                var110 = var113 + 15;
                String var50 = class147.field2366;
                String var51 = field673;
                String var52 = class213.method1864('*', var51.length());
                arg0.method3522(var50 + var52 + (field676 == 1 & client.field266 % 40 < 20 ? class2.method2316(16776960) + class2.field16 : ""), 274, var110, 16777215, 0);
                var110 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field658.method1573(var53 - 73, var54 - 20);
                arg0.method3450(class147.field2416, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field658.method1573(var55 - 73, var54 - 20);
                arg0.method3450(class147.field2374, var55, var54 + 5, 16777215, 0);
            } else if (field668 == 4) {
                arg0.method3450(class147.field2405, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3450(field664, 382, var56, 16777215, 0);
                int var114 = var56 + 15;
                arg0.method3450(field670, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3450(field663, 382, var115, 16777215, 0);
                int var116 = var115 + 15;
                String var58 = class147.field2373;
                String var59 = Statics.field901;
                String var60 = class213.method1864('*', var59.length());
                arg0.method3522(var58 + var60 + (client.field266 % 40 < 20 ? class2.method2316(16776960) + class2.field16 : ""), 274, var116, 16777215, 0);
                int var117 = var116 - 8;
                arg0.method3522(class147.field2188, 373, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3522(class147.field2189, 373, var118, 16776960, 0);
                int var61 = 373 + arg0.method3443(class147.field2189) + 15;
                int var62 = var118 - arg0.field2983;
                class75 var63;
                if (field653) {
                    var63 = Statics.field656;
                } else {
                    var63 = Statics.field2010;
                }
                var63.method1573(var61, var62);
                var114 = var118 + 15;
                short var64 = 302;
                short var65 = 321;
                Statics.field658.method1573(var64 - 73, var65 - 20);
                arg0.method3450(class147.field2187, var64, var65 + 5, 16777215, 0);
                short var66 = 462;
                Statics.field658.method1573(var66 - 73, var65 - 20);
                arg0.method3450(class147.field2374, var66, var65 + 5, 16777215, 0);
                arg1.method3450(class147.field2406, 382, var65 + 36, 255, 0);
            }
        }
        if (field662 > 0) {
            int var67 = field662;
            short var68 = 256;
            field680 += var67 * 128;
            if (field680 > Statics.field136.length) {
                field680 -= Statics.field136.length;
                int var69 = (int) (Math.random() * 12.0D);
                Statics.method498(Statics.field208[var69]);
            }
            int var70 = 0;
            int var71 = var67 * 128;
            int var72 = (var68 - var67) * 128;
            for (int var73 = 0; var73 < var72; var73++) {
                int var74 = Statics.field547[var70 + var71] - Statics.field136[field680 + var70 & Statics.field136.length - 1] * var67 / 6;
                if (var74 < 0) {
                    var74 = 0;
                }
                Statics.field547[var70++] = var74;
            }
            for (int var75 = var68 - var67; var75 < var68; var75++) {
                int var76 = var75 * 128;
                for (int var77 = 0; var77 < 128; var77++) {
                    int var78 = (int) (Math.random() * 100.0D);
                    if (var78 < 50 && var77 > 10 && var77 < 118) {
                        Statics.field547[var76 + var77] = 255;
                    } else {
                        Statics.field547[var76 + var77] = 0;
                    }
                }
            }
            if (field659 > 0) {
                field659 -= var67 * 4;
            }
            if (field660 > 0) {
                field660 -= var67 * 4;
            }
            if (field659 == 0 && field660 == 0) {
                int var79 = (int) (Math.random() * (double) (2000 / var67));
                if (var79 == 0) {
                    field659 = 1024;
                }
                if (var79 == 1) {
                    field660 = 1024;
                }
            }
            for (int var80 = 0; var80 < var68 - var67; var80++) {
                field681[var80] = field681[var67 + var80];
            }
            for (int var81 = var68 - var67; var81 < var68; var81++) {
                field681[var81] = (int) (Math.sin((double) field657 / 14.0D) * 16.0D + Math.sin((double) field657 / 15.0D) * 14.0D + Math.sin((double) field657 / 16.0D) * 12.0D);
                field657++;
            }
            field687 += var67 * -1587648019;
            int var82 = ((client.field266 & 0x1) + var67) / 2;
            if (var82 > 0) {
                for (int var83 = 0; var83 < field687 * 1400104308; var83++) {
                    int var84 = (int) (Math.random() * 124.0D) + 2;
                    int var85 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field547[(var85 << 7) + var84] = 192;
                }
                field687 = 0;
                int var86 = 0;
                label401: while (true) {
                    if (var86 >= var68) {
                        int var90 = 0;
                        while (true) {
                            if (var90 >= 128) {
                                break label401;
                            }
                            int var91 = 0;
                            for (int var92 = -var82; var92 < var68; var92++) {
                                int var93 = var92 * 128;
                                if (var82 + var92 < var68) {
                                    var91 += Statics.field661[var82 * 128 + var90 + var93];
                                }
                                if (var92 - (var82 + 1) >= 0) {
                                    var91 -= Statics.field661[var90 + var93 - (var82 + 1) * 128];
                                }
                                if (var92 >= 0) {
                                    Statics.field547[var90 + var93] = var91 / (var82 * 2 + 1);
                                }
                            }
                            var90++;
                        }
                    }
                    int var87 = 0;
                    int var88 = var86 * 128;
                    for (int var89 = -var82; var89 < 128; var89++) {
                        if (var82 + var89 < 128) {
                            var87 += Statics.field547[var88 + var89 + var82];
                        }
                        if (var89 - (var82 + 1) >= 0) {
                            var87 -= Statics.field547[var88 + var89 - (var82 + 1)];
                        }
                        if (var89 >= 0) {
                            Statics.field661[var88 + var89] = var87 / (var82 * 2 + 1);
                        }
                    }
                    var86++;
                }
            }
            field662 = 0;
        }
        method1876();
        Statics.field2974[Statics.field101.field147 ? 1 : 0].method1573(725, 463);
        if (client.field384 > 5 && client.field263 == 0) {
            if (Statics.field2122 == null) {
                Statics.field2122 = class71.method132(Statics.field2012, "sl_button", "");
            } else {
                byte var94 = 5;
                short var95 = 463;
                byte var96 = 100;
                byte var97 = 35;
                Statics.field2122.method1573(var94, var95);
                arg0.method3450(class147.field2346 + " " + client.field256, var96 / 2 + var94, var97 / 2 + var95 - 2, 16777215, 0);
                if (Statics.field1824 == null) {
                    arg1.method3450(class147.field2428, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                } else {
                    arg1.method3450(class147.field2427, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var98 = Statics.field2706.getGraphics();
            Statics.field127.method1366(var98, 0, 0);
        } catch (Exception var101) {
            Statics.field2706.repaint();
        }
    }

    @ObfuscatedName("x.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method161(String arg0, String arg1, String arg2) {
        field664 = arg0;
        field670 = arg1;
        field663 = arg2;
    }

    @ObfuscatedName("as.m(IIII)I")
    public static final int method560(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cg.w(B)V")
    public static final void method1876() {
        short var0 = 256;
        if (field659 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field659 > 768) {
                    Statics.field14[var1] = method560(Statics.field1508[var1], Statics.field1844[var1], 1024 - field659);
                } else if (field659 > 256) {
                    Statics.field14[var1] = Statics.field1844[var1];
                } else {
                    Statics.field14[var1] = method560(Statics.field1844[var1], Statics.field1508[var1], 256 - field659);
                }
            }
        } else if (field660 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field660 > 768) {
                    Statics.field14[var2] = method560(Statics.field1508[var2], Statics.field1353[var2], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field14[var2] = Statics.field1353[var2];
                } else {
                    Statics.field14[var2] = method560(Statics.field1353[var2], Statics.field1508[var2], 256 - field660);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field14[var3] = Statics.field1508[var3];
            }
        }
        class74.method1514(0, 9, 128, var0 + 7);
        Statics.field1918.method1427(0, 0);
        class74.method1513();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field681[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field547[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field14[var10];
                    int var14 = Statics.field127.field1299[var5];
                    Statics.field127.field1299[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class74.method1514(637, 9, 765, var0 + 7);
        Statics.field654.method1427(382, 0);
        class74.method1513();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field681[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field547[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field14[var22];
                    int var26 = Statics.field127.field1299[var20];
                    Statics.field127.field1299[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("x.e(Leq;I)V")
    public static void method162(class135 arg0) {
        if (class131.field2036 != 1 && Statics.field1816 || class131.field2036 != 4) {
            return;
        }
        short var1 = 280;
        if (class131.field2024 >= var1 && class131.field2024 <= var1 + 14 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(0, 0);
            return;
        }
        if (class131.field2024 >= var1 + 15 && class131.field2024 <= var1 + 80 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(0, 1);
            return;
        }
        short var2 = 390;
        if (class131.field2024 >= var2 && class131.field2024 <= var2 + 14 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(1, 0);
            return;
        }
        if (class131.field2024 >= var2 + 15 && class131.field2024 <= var2 + 80 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(1, 1);
            return;
        }
        short var3 = 500;
        if (class131.field2024 >= var3 && class131.field2024 <= var3 + 14 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(2, 0);
            return;
        }
        if (class131.field2024 >= var3 + 15 && class131.field2024 <= var3 + 80 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(2, 1);
            return;
        }
        short var4 = 610;
        if (class131.field2024 >= var4 && class131.field2024 <= var4 + 14 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(3, 0);
            return;
        }
        if (class131.field2024 >= var4 + 15 && class131.field2024 <= var4 + 80 && class131.field2026 >= 4 && class131.field2026 <= 18) {
            method2399(3, 1);
            return;
        }
        if (class131.field2024 >= 708 && class131.field2026 >= 4 && class131.field2024 <= 758 && class131.field2026 <= 20) {
            field679 = false;
            Statics.field1918.method1427(0, 0);
            Statics.field654.method1427(382, 0);
            Statics.field655.method1573(382 - Statics.field655.field1328 / 2, 18);
            return;
        }
        if (field683 == -1) {
            return;
        }
        class23 var5 = Statics.field2949[field683];
        method3365(var5);
        field679 = false;
        Statics.field1918.method1427(0, 0);
        Statics.field654.method1427(382, 0);
        Statics.field655.method1573(382 - Statics.field655.field1328 / 2, 18);
        return;
    }

    @ObfuscatedName("gn.n(Lp;I)V")
    public static void method3365(class23 arg0) {
        if (arg0.method523() != client.field261) {
            client.field261 = arg0.method523();
            boolean var1 = arg0.method523();
            if (Statics.field2523 != var1) {
                class46.field1016.method3184();
                class46.field1040.method3184();
                class46.field1018.method3184();
                Statics.field2523 = var1;
            }
        }
        Statics.field2111 = arg0.field587;
        client.field256 = arg0.field590;
        client.field358 = arg0.field585;
        Statics.field1863 = client.field315 == 0 ? 43594 : arg0.field590 + 40000;
        Statics.field695 = client.field315 == 0 ? 443 : arg0.field590 + 50000;
        Statics.field175 = Statics.field1863;
    }

    @ObfuscatedName("i.s(B)V")
    public static void method30() {
        try {
            if (Statics.field1824 == null) {
                Statics.field1824 = new class17(Statics.field1300, new URL(Statics.field1070));
            } else {
                byte[] var0 = Statics.field1824.method179();
                if (var0 != null) {
                    class110 var1 = new class110(var0);
                    field685 = var1.method2282();
                    Statics.field2949 = new class23[field685];
                    int var2 = 0;
                    while (var2 < field685) {
                        class23 var3 = Statics.field2949[var2] = new class23();
                        var3.field590 = var1.method2282();
                        var3.field585 = var1.method2136();
                        var3.field587 = var1.method2139();
                        var3.field588 = var1.method2139();
                        var3.field589 = var1.method2199();
                        var3.field593 = var1.method2134();
                        var3.field586 = var2++;
                    }
                    method535(Statics.field2949, 0, Statics.field2949.length - 1, field686, field682);
                    field679 = true;
                    Statics.field1824 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1824 = null;
        }
    }

    @ObfuscatedName("dw.k(IIB)V")
    public static void method2399(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field686[var5] != arg0) {
                var2[var4] = field686[var5];
                var3[var4] = field682[var5];
                var4++;
            }
        }
        field686 = var2;
        field682 = var3;
        method535(Statics.field2949, 0, Statics.field2949.length - 1, field686, field682);
    }

    @ObfuscatedName("r.f([Lp;II[I[II)V")
    public static void method535(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class23 var8 = arg0[var7];
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
                        var11 = arg0[var6].field586;
                        var12 = var8.field586;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field593;
                        var12 = var8.field593;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method523() ? 1 : 0;
                        var12 = var8.method523() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field590;
                        var12 = var8.field590;
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
                        var15 = arg0[var5].field586;
                        var16 = var8.field586;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field593;
                        var16 = var8.field593;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method523() ? 1 : 0;
                        var16 = var8.method523() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field590;
                        var16 = var8.field590;
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
                class23 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method535(arg0, arg1, var6, arg3, arg4);
        method535(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
