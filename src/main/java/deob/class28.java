package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("aw")
public class class28 {

    @ObfuscatedName("aw.b")
    public static int[] field651 = new int[256];

    @ObfuscatedName("aw.j")
    public static int field657 = 0;

    @ObfuscatedName("aw.o")
    public static int field658 = 0;

    @ObfuscatedName("aw.an")
    public static int field663 = 0;

    @ObfuscatedName("aw.aw")
    public static int field660 = 0;

    @ObfuscatedName("aw.at")
    public static int field661 = 0;

    @ObfuscatedName("aw.al")
    public static int field662 = 0;

    @ObfuscatedName("aw.as")
    public static int field682 = 10;

    @ObfuscatedName("aw.ak")
    public static String field678 = "";

    @ObfuscatedName("aw.aa")
    public static int field665 = 0;

    @ObfuscatedName("aw.ao")
    public static String field666 = "";

    @ObfuscatedName("aw.af")
    public static String field667 = "";

    @ObfuscatedName("aw.aj")
    public static String field684 = "";

    @ObfuscatedName("aw.az")
    public static String field669 = "";

    @ObfuscatedName("aw.ae")
    public static String field671 = "";

    @ObfuscatedName("aw.av")
    public static class145 field679 = class145.field2406;

    @ObfuscatedName("aw.aq")
    public static boolean field672 = true;

    @ObfuscatedName("aw.ad")
    public static int field659 = 0;

    @ObfuscatedName("aw.au")
    public static String field674 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aw.ag")
    public static String field655 = "1234567890";

    @ObfuscatedName("aw.am")
    public static boolean field676 = false;

    @ObfuscatedName("aw.bm")
    public static int field645 = 0;

    @ObfuscatedName("aw.bn")
    public static int[] field680 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aw.bt")
    public static int[] field675 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aw.bz")
    public static int field668 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.p(Ler;Ler;I)I")
    public static int method481(class147 arg0, class147 arg1) {
        int var2 = 0;
        if (arg0.method2837("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2837("logo", "")) {
            var2++;
        }
        if (arg1.method2837("titlebox", "")) {
            var2++;
        }
        if (arg1.method2837("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2837("runes", "")) {
            var2++;
        }
        if (arg1.method2837("title_mute", "")) {
            var2++;
        }
        if (arg1.method2808("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2808("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2837("sl_back", "");
        arg1.method2837("sl_flags", "");
        arg1.method2837("sl_arrows", "");
        arg1.method2837("sl_stars", "");
        arg1.method2837("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ek.g(B)I")
    public static int method2865() {
        return 8;
    }

    @ObfuscatedName("x.c(Lef;B)V")
    public static void method35(class131 arg0) {
        if (field676) {
            method1937(arg0);
            return;
        }
        if ((class127.field2003 == 1 || !Statics.field2084 && class127.field2003 == 4) && class127.field1988 >= 715 && class127.field2002 >= 453) {
            Statics.field813.field144 = !Statics.field813.field144;
            class9.method2015();
            if (Statics.field813.field144) {
                Statics.field697.method3109();
                class162.field2720 = 1;
                Statics.field1897 = null;
            } else {
                class162.method512(Statics.field195, "scape main", "", 255, false);
            }
        }
        if (client.field398 == 5) {
            return;
        }
        field661++;
        if (client.field398 != 10 && client.field398 != 11) {
            return;
        }
        if (client.field261 == 0) {
            if (class127.field2003 == 1 || !Statics.field2084 && class127.field2003 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class127.field1988 >= var1 && class127.field1988 <= var1 + var3 && class127.field2002 >= var2 && class127.field2002 <= var2 + var4) {
                    method91();
                    return;
                }
            }
            if (Statics.field677 != null) {
                method91();
            }
        }
        int var5 = class127.field2003;
        int var6 = class127.field1988;
        int var7 = class127.field2002;
        if (!Statics.field2084 && var5 == 4) {
            var5 = 1;
        }
        if (field665 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                String var10 = client.method2017("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class125.method39(var10, true, "openjs", false);
            }
            short var11 = 462;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field256 & 0x4) != 0) {
                    if ((client.field256 & 0x400) == 0) {
                        field666 = class143.field2337;
                        field667 = class143.field2363;
                        field684 = class143.field2187;
                    } else {
                        field666 = class143.field2368;
                        field667 = class143.field2291;
                        field684 = class143.field2370;
                    }
                    field665 = 1;
                    field659 = 0;
                } else if ((client.field256 & 0x400) == 0) {
                    field666 = class143.field2273;
                    field667 = class143.field2365;
                    field684 = class143.field2360;
                    field665 = 2;
                    field659 = 0;
                } else {
                    field666 = class143.field2257;
                    field667 = class143.field2366;
                    field684 = class143.field2367;
                    field665 = 1;
                    field659 = 0;
                }
            }
        } else if (field665 == 1) {
            while (class124.method2476()) {
                if (Statics.field49 == 84) {
                    field666 = class143.field2273;
                    field667 = class143.field2365;
                    field684 = class143.field2360;
                    field665 = 2;
                    field659 = 0;
                } else if (Statics.field49 == 13) {
                    field665 = 0;
                }
            }
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field666 = class143.field2273;
                field667 = class143.field2365;
                field684 = class143.field2360;
                field665 = 2;
                field659 = 0;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field665 = 0;
            }
        } else if (field665 == 2) {
            short var15 = 231;
            int var27 = var15 + 30;
            if (var5 == 1 && var7 >= var27 - 15 && var7 < var27) {
                field659 = 0;
            }
            var27 += 15;
            if (var5 == 1 && var7 >= var27 - 15 && var7 < var27) {
                field659 = 1;
            }
            var27 += 15;
            short var16 = 302;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field669 = field669.trim();
                if (field669.length() == 0) {
                    method2107(class143.field2264, class143.field2265, class143.field2266);
                    return;
                }
                if (field671.length() == 0) {
                    method2107(class143.field2378, class143.field2268, class143.field2269);
                    return;
                }
                method2107(class143.field2343, class143.field2374, class143.field2284);
                field679 = Statics.field813.field147.containsKey(class200.method2025(field669)) ? class145.field2404 : class145.field2406;
                client.method2490(20);
                return;
            }
            short var18 = 462;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field665 = 0;
                field669 = "";
                field671 = "";
                Statics.field131 = 0;
                Statics.field611 = "";
                field672 = true;
            }
            while (true) {
                while (class124.method2476()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field674.length(); var20++) {
                        if (Statics.field2496 == field674.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field49 == 13) {
                        field665 = 0;
                        field669 = "";
                        field671 = "";
                        Statics.field131 = 0;
                        Statics.field611 = "";
                        field672 = true;
                    } else if (field659 == 0) {
                        if (Statics.field49 == 85 && field669.length() > 0) {
                            field669 = field669.substring(0, field669.length() - 1);
                        }
                        if (Statics.field49 == 84 || Statics.field49 == 80) {
                            field659 = 1;
                        }
                        if (var19 && field669.length() < 320) {
                            field669 = field669 + Statics.field2496;
                        }
                    } else if (field659 == 1) {
                        if (Statics.field49 == 85 && field671.length() > 0) {
                            field671 = field671.substring(0, field671.length() - 1);
                        }
                        if (Statics.field49 == 84 || Statics.field49 == 80) {
                            field659 = 0;
                        }
                        if (Statics.field49 == 84) {
                            field669 = field669.trim();
                            if (field669.length() == 0) {
                                method2107(class143.field2264, class143.field2265, class143.field2266);
                                return;
                            }
                            if (field671.length() == 0) {
                                method2107(class143.field2378, class143.field2268, class143.field2269);
                                return;
                            }
                            method2107(class143.field2343, class143.field2374, class143.field2284);
                            field679 = Statics.field813.field147.containsKey(class200.method2025(field669)) ? class145.field2404 : class145.field2406;
                            client.method2490(20);
                            return;
                        }
                        if (var19 && field671.length() < 20) {
                            field671 = field671 + Statics.field2496;
                        }
                    }
                }
                return;
            }
        } else if (field665 == 4) {
            short var21 = 302;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field611.trim();
                if (Statics.field611.length() != 6) {
                    method2107(class143.field2180, class143.field2158, class143.field2302);
                    return;
                }
                Statics.field131 = Integer.parseInt(Statics.field611);
                Statics.field611 = "";
                field679 = field672 ? class145.field2405 : class145.field2407;
                method2107(class143.field2343, class143.field2374, class143.field2284);
                client.method2490(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field672 = !field672;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                String var23 = client.method2017("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class125.method39(var23, true, "openjs", false);
            }
            short var24 = 462;
            if (var5 == 1 && var6 >= var24 - 75 && var6 <= var24 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field665 = 0;
                field669 = "";
                field671 = "";
                Statics.field131 = 0;
                Statics.field611 = "";
            }
            while (class124.method2476()) {
                boolean var25 = false;
                for (int var26 = 0; var26 < field655.length(); var26++) {
                    if (Statics.field2496 == field655.charAt(var26)) {
                        var25 = true;
                        break;
                    }
                }
                if (Statics.field49 == 13) {
                    field665 = 0;
                    field669 = "";
                    field671 = "";
                    Statics.field131 = 0;
                    Statics.field611 = "";
                } else {
                    if (Statics.field49 == 85 && Statics.field611.length() > 0) {
                        Statics.field611 = Statics.field611.substring(0, Statics.field611.length() - 1);
                    }
                    if (Statics.field49 == 84) {
                        Statics.field611.trim();
                        if (Statics.field611.length() != 6) {
                            method2107(class143.field2180, class143.field2158, class143.field2302);
                            return;
                        }
                        Statics.field131 = Integer.parseInt(Statics.field611);
                        Statics.field611 = "";
                        field679 = field672 ? class145.field2405 : class145.field2407;
                        method2107(class143.field2343, class143.field2374, class143.field2284);
                        client.method2490(20);
                        return;
                    }
                    if (var25 && Statics.field611.length() < 6) {
                        Statics.field611 = Statics.field611 + Statics.field2496;
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.n(Lgk;Lgk;B)V")
    public static void method41(class194 arg0, class194 arg1) {
        if (field676) {
            if (Statics.field204 == null) {
                Statics.field204 = class70.method1426(Statics.field709, "sl_back", "");
            }
            if (Statics.field2410 == null) {
                Statics.field2410 = class70.method2023(Statics.field709, "sl_flags", "");
            }
            if (Statics.field1695 == null) {
                Statics.field1695 = class70.method2023(Statics.field709, "sl_arrows", "");
            }
            if (Statics.field635 == null) {
                Statics.field635 = class70.method2023(Statics.field709, "sl_stars", "");
            }
            class73.method1605(0, 23, 765, 480, 0);
            class73.method1563(0, 0, 125, 23, 12425273, 9135624);
            class73.method1563(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3415(class143.field2331, 62, 15, 0, -1);
            if (Statics.field635 != null) {
                Statics.field635[1].method1615(140, 1);
                arg1.method3397(class143.field2385, 152, 10, 16777215, -1);
                Statics.field635[0].method1615(140, 12);
                arg1.method3397(class143.field2217, 152, 21, 16777215, -1);
            }
            if (Statics.field1695 != null) {
                short var2 = 280;
                if (field680[0] == 0 && field675[0] == 0) {
                    Statics.field1695[2].method1615(var2, 4);
                } else {
                    Statics.field1695[0].method1615(var2, 4);
                }
                if (field680[0] == 0 && field675[0] == 1) {
                    Statics.field1695[3].method1615(var2 + 15, 4);
                } else {
                    Statics.field1695[1].method1615(var2 + 15, 4);
                }
                arg0.method3397(class143.field2387, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field680[0] == 1 && field675[0] == 0) {
                    Statics.field1695[2].method1615(var3, 4);
                } else {
                    Statics.field1695[0].method1615(var3, 4);
                }
                if (field680[0] == 1 && field675[0] == 1) {
                    Statics.field1695[3].method1615(var3 + 15, 4);
                } else {
                    Statics.field1695[1].method1615(var3 + 15, 4);
                }
                arg0.method3397(class143.field2323, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field680[0] == 2 && field675[0] == 0) {
                    Statics.field1695[2].method1615(var4, 4);
                } else {
                    Statics.field1695[0].method1615(var4, 4);
                }
                if (field680[0] == 2 && field675[0] == 1) {
                    Statics.field1695[3].method1615(var4 + 15, 4);
                } else {
                    Statics.field1695[1].method1615(var4 + 15, 4);
                }
                arg0.method3397(class143.field2389, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field680[0] == 3 && field675[0] == 0) {
                    Statics.field1695[2].method1615(var5, 4);
                } else {
                    Statics.field1695[0].method1615(var5, 4);
                }
                if (field680[0] == 3 && field675[0] == 1) {
                    Statics.field1695[3].method1615(var5 + 15, 4);
                } else {
                    Statics.field1695[1].method1615(var5 + 15, 4);
                }
                arg0.method3397(class143.field2153, var5 + 32, 17, 16777215, -1);
            }
            class73.method1605(708, 4, 50, 16, 0);
            arg1.method3415(class143.field2369, 733, 16, 16777215, -1);
            field668 = -1;
            if (Statics.field204 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field645) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field645) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field645) {
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
                for (int var20 = 0; var20 < field645; var20++) {
                    class22 var21 = Statics.field1353[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field571);
                    if (var21.field571 == -1) {
                        var23 = class143.field2391;
                        var22 = false;
                    } else if (var21.field571 > 1980) {
                        var23 = class143.field2392;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method517()) {
                        if (var21.method520()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method520()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field1990 >= var17 && class127.field1995 >= var16 && class127.field1990 < var6 + var17 && class127.field1995 < var7 + var16 && var22) {
                        field668 = var20;
                        Statics.field204[var24].method1547(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field204[var24].method1476(var17, var16);
                    }
                    if (Statics.field2410 != null) {
                        Statics.field2410[(var21.method520() ? 8 : 0) + var21.field585].method1615(var17 + 29, var16);
                    }
                    arg0.method3415(Integer.toString(var21.field576), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3415(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3401(Statics.field1353[field668].field573) + 6;
                    int var26 = arg1.field2926 + 8;
                    class73.method1605(class127.field1990 - var25 / 2, class127.field1995 + 20 + 5, var25, var26, 16777120);
                    class73.method1564(class127.field1990 - var25 / 2, class127.field1995 + 20 + 5, var25, var26, 0);
                    arg1.method3415(Statics.field1353[field668].field573, class127.field1990, class127.field1995 + 20 + 5 + arg1.field2926 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1272.getGraphics();
                Statics.field2011.method1398(var27, 0, 0);
            } catch (Exception var88) {
                Statics.field1272.repaint();
            }
            return;
        }
        if (client.field398 == 0 || client.field398 == 5) {
            byte var29 = 20;
            arg0.method3415(class143.field2357, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1564(230, var30, 304, 34, 9179409);
            class73.method1564(231, var30 + 1, 302, 32, 0);
            class73.method1605(232, var30 + 2, field682 * 3, 30, 9179409);
            class73.method1605(field682 * 3 + 232, var30 + 2, 300 - field682 * 3, 30, 0);
            arg0.method3415(field678, 382, 276 - var29, 16777215, -1);
        }
        if (client.field398 == 20) {
            Statics.field646.method1615(382 - Statics.field646.field1329 / 2, 271 - Statics.field646.field1326 / 2);
            short var31 = 211;
            arg0.method3415(field666, 382, var31, 16776960, 0);
            int var90 = var31 + 15;
            arg0.method3415(field667, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            arg0.method3415(field684, 382, var91, 16776960, 0);
            int var92 = var91 + 15;
            int var93 = var92 + 10;
            if (field665 != 4) {
                arg0.method3397(class143.field2359, 272, var93, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field669; arg0.method3401(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3397(class193.method3405(var33), 312, var93, 16777215, 0);
                var90 = var93 + 15;
                arg0.method3397(class143.field2377 + class200.method712(field671), 274, var90, 16777215, 0);
                var90 += 15;
            }
        }
        if (client.field398 == 10 || client.field398 == 11) {
            Statics.field646.method1615(202, 171);
            if (field665 == 0) {
                short var34 = 251;
                arg0.method3415(class143.field2379, 382, var34, 16776960, 0);
                int var94 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field647.method1615(var35 - 73, var36 - 20);
                arg0.method3399(class143.field2380, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field647.method1615(var37 - 73, var36 - 20);
                arg0.method3399(class143.field2282, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field665 == 1) {
                arg0.method3415(class143.field2361, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3415(field666, 382, var38, 16777215, 0);
                int var95 = var38 + 15;
                arg0.method3415(field667, 382, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3415(field684, 382, var96, 16777215, 0);
                int var97 = var96 + 15;
                short var39 = 302;
                short var40 = 321;
                Statics.field647.method1615(var39 - 73, var40 - 20);
                arg0.method3415(class143.field2375, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                Statics.field647.method1615(var41 - 73, var40 - 20);
                arg0.method3415(class143.field2369, var41, var40 + 5, 16777215, 0);
            } else if (field665 == 2) {
                short var42 = 211;
                arg0.method3415(field666, 382, var42, 16776960, 0);
                int var98 = var42 + 15;
                arg0.method3415(field667, 382, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg0.method3415(field684, 382, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var101 = var100 + 10;
                arg0.method3397(class143.field2359, 272, var101, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field669; arg0.method3401(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3397(class193.method3405(var44) + (field659 == 0 & client.field343 % 40 < 20 ? class2.method660(16776960) + class2.field20 : ""), 312, var101, 16777215, 0);
                var98 = var101 + 15;
                arg0.method3397(class143.field2377 + class200.method712(field671) + (field659 == 1 & client.field343 % 40 < 20 ? class2.method660(16776960) + class2.field20 : ""), 274, var98, 16777215, 0);
                var98 += 15;
                short var45 = 302;
                short var46 = 321;
                Statics.field647.method1615(var45 - 73, var46 - 20);
                arg0.method3415(class143.field2382, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                Statics.field647.method1615(var47 - 73, var46 - 20);
                arg0.method3415(class143.field2369, var47, var46 + 5, 16777215, 0);
            } else if (field665 == 4) {
                arg0.method3415(class143.field2371, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3415(field666, 382, var48, 16777215, 0);
                int var102 = var48 + 15;
                arg0.method3415(field667, 382, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method3415(field684, 382, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3397(class143.field2256 + class200.method712(Statics.field611) + (client.field343 % 40 < 20 ? class2.method660(16776960) + class2.field20 : ""), 274, var104, 16777215, 0);
                int var105 = var104 - 8;
                arg0.method3397(class143.field2154, 373, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method3397(class143.field2261, 373, var106, 16776960, 0);
                int var49 = 373 + arg0.method3401(class143.field2261) + 15;
                int var50 = var106 - arg0.field2926;
                class74 var51;
                if (field672) {
                    var51 = Statics.field1282;
                } else {
                    var51 = Statics.field653;
                }
                var51.method1615(var49, var50);
                var102 = var106 + 15;
                short var52 = 302;
                short var53 = 321;
                Statics.field647.method1615(var52 - 73, var53 - 20);
                arg0.method3415(class143.field2375, var52, var53 + 5, 16777215, 0);
                short var54 = 462;
                Statics.field647.method1615(var54 - 73, var53 - 20);
                arg0.method3415(class143.field2369, var54, var53 + 5, 16777215, 0);
                arg1.method3415(class143.field2317, 382, var53 + 36, 255, 0);
            }
        }
        if (field661 > 0) {
            int var55 = field661;
            short var56 = 256;
            field663 += var55 * 128;
            if (field663 > Statics.field76.length) {
                field663 -= Statics.field76.length;
                int var57 = (int) (Math.random() * 12.0D);
                method1425(Statics.field648[var57]);
            }
            int var58 = 0;
            int var59 = var55 * 128;
            int var60 = (var56 - var55) * 128;
            for (int var61 = 0; var61 < var60; var61++) {
                int var62 = Statics.field12[var58 + var59] - Statics.field76[field663 + var58 & Statics.field76.length - 1] * var55 / 6;
                if (var62 < 0) {
                    var62 = 0;
                }
                Statics.field12[var58++] = var62;
            }
            for (int var63 = var56 - var55; var63 < var56; var63++) {
                int var64 = var63 * 128;
                for (int var65 = 0; var65 < 128; var65++) {
                    int var66 = (int) (Math.random() * 100.0D);
                    if (var66 < 50 && var65 > 10 && var65 < 118) {
                        Statics.field12[var64 + var65] = 255;
                    } else {
                        Statics.field12[var64 + var65] = 0;
                    }
                }
            }
            if (field657 > 0) {
                field657 -= var55 * 4;
            }
            if (field658 > 0) {
                field658 -= var55 * 4;
            }
            if (field657 == 0 && field658 == 0) {
                int var67 = (int) (Math.random() * (double) (2000 / var55));
                if (var67 == 0) {
                    field657 = 1024;
                }
                if (var67 == 1) {
                    field658 = 1024;
                }
            }
            for (int var68 = 0; var68 < var56 - var55; var68++) {
                field651[var68] = field651[var55 + var68];
            }
            for (int var69 = var56 - var55; var69 < var56; var69++) {
                field651[var69] = (int) (Math.sin((double) field662 / 14.0D) * 16.0D + Math.sin((double) field662 / 15.0D) * 14.0D + Math.sin((double) field662 / 16.0D) * 12.0D);
                field662++;
            }
            field660 += var55 * 1133320075;
            int var70 = ((client.field343 & 0x1) + var55) / 2;
            if (var70 > 0) {
                for (int var71 = 0; var71 < field660 * -1270190676; var71++) {
                    int var72 = (int) (Math.random() * 124.0D) + 2;
                    int var73 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field12[(var73 << 7) + var72] = 192;
                }
                field660 = 0;
                int var74 = 0;
                label401: while (true) {
                    if (var74 >= var56) {
                        int var78 = 0;
                        while (true) {
                            if (var78 >= 128) {
                                break label401;
                            }
                            int var79 = 0;
                            for (int var80 = -var70; var80 < var56; var80++) {
                                int var81 = var80 * 128;
                                if (var70 + var80 < var56) {
                                    var79 += Statics.field619[var70 * 128 + var78 + var81];
                                }
                                if (var80 - (var70 + 1) >= 0) {
                                    var79 -= Statics.field619[var78 + var81 - (var70 + 1) * 128];
                                }
                                if (var80 >= 0) {
                                    Statics.field12[var78 + var81] = var79 / (var70 * 2 + 1);
                                }
                            }
                            var78++;
                        }
                    }
                    int var75 = 0;
                    int var76 = var74 * 128;
                    for (int var77 = -var70; var77 < 128; var77++) {
                        if (var70 + var77 < 128) {
                            var75 += Statics.field12[var76 + var77 + var70];
                        }
                        if (var77 - (var70 + 1) >= 0) {
                            var75 -= Statics.field12[var76 + var77 - (var70 + 1)];
                        }
                        if (var77 >= 0) {
                            Statics.field619[var76 + var77] = var75 / (var70 * 2 + 1);
                        }
                    }
                    var74++;
                }
            }
            field661 = 0;
        }
        method30();
        Statics.field652[Statics.field813.field144 ? 1 : 0].method1615(725, 463);
        if (client.field398 > 5 && client.field261 == 0) {
            if (Statics.field1817 == null) {
                Statics.field1817 = class70.method1939(Statics.field709, "sl_button", "");
            } else {
                byte var82 = 5;
                short var83 = 463;
                byte var84 = 100;
                byte var85 = 35;
                Statics.field1817.method1615(var82, var83);
                arg0.method3415(class143.field2312 + " " + client.field320, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
                if (Statics.field677 == null) {
                    arg1.method3415(class143.field2394, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                } else {
                    arg1.method3415(class143.field2393, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var86 = Statics.field1272.getGraphics();
            Statics.field2011.method1398(var86, 0, 0);
        } catch (Exception var89) {
            Statics.field1272.repaint();
        }
    }

    @ObfuscatedName("ck.s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2107(String arg0, String arg1, String arg2) {
        field666 = arg0;
        field667 = arg1;
        field684 = arg2;
    }

    @ObfuscatedName("bx.r(Lbu;B)V")
    public static final void method1425(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field76.length; var2++) {
            Statics.field76[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field76[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field643[var8] = (Statics.field76[var8 - 1] + Statics.field76[var8 + 1] + Statics.field76[var8 - 128] + Statics.field76[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field76;
            Statics.field76 = Statics.field643;
            Statics.field643 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1326; var11++) {
            for (int var12 = 0; var12 < arg0.field1329; var12++) {
                if (arg0.field1325[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1327;
                    int var14 = var11 + 16 + arg0.field1328;
                    int var15 = (var14 << 7) + var13;
                    Statics.field76[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("o.w(IIIB)I")
    public static final int method521(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("x.u(B)V")
    public static final void method30() {
        short var0 = 256;
        if (field657 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field657 > 768) {
                    Statics.field2022[var1] = method521(Statics.field656[var1], Statics.field1987[var1], 1024 - field657);
                } else if (field657 > 256) {
                    Statics.field2022[var1] = Statics.field1987[var1];
                } else {
                    Statics.field2022[var1] = method521(Statics.field1987[var1], Statics.field656[var1], 256 - field657);
                }
            }
        } else if (field658 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field658 > 768) {
                    Statics.field2022[var2] = method521(Statics.field656[var2], Statics.field724[var2], 1024 - field658);
                } else if (field658 > 256) {
                    Statics.field2022[var2] = Statics.field724[var2];
                } else {
                    Statics.field2022[var2] = method521(Statics.field724[var2], Statics.field656[var2], 256 - field658);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2022[var3] = Statics.field656[var3];
            }
        }
        class73.method1554(0, 9, 128, var0 + 7);
        Statics.field649.method1476(0, 0);
        class73.method1556();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field651[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field12[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2022[var10];
                    int var14 = Statics.field2011.field1298[var5];
                    Statics.field2011.field1298[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1554(637, 9, 765, var0 + 7);
        Statics.field650.method1476(382, 0);
        class73.method1556();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field651[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field12[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2022[var22];
                    int var26 = Statics.field2011.field1298[var20];
                    Statics.field2011.field1298[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cj.d(Lef;I)V")
    public static void method1937(class131 arg0) {
        if (class127.field2003 != 1 && Statics.field2084 || class127.field2003 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field1988 >= var1 && class127.field1988 <= var1 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(0, 0);
            return;
        }
        if (class127.field1988 >= var1 + 15 && class127.field1988 <= var1 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field1988 >= var2 && class127.field1988 <= var2 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(1, 0);
            return;
        }
        if (class127.field1988 >= var2 + 15 && class127.field1988 <= var2 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field1988 >= var3 && class127.field1988 <= var3 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(2, 0);
            return;
        }
        if (class127.field1988 >= var3 + 15 && class127.field1988 <= var3 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field1988 >= var4 && class127.field1988 <= var4 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(3, 0);
            return;
        }
        if (class127.field1988 >= var4 + 15 && class127.field1988 <= var4 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
            method490(3, 1);
            return;
        }
        if (class127.field1988 >= 708 && class127.field2002 >= 4 && class127.field1988 <= 758 && class127.field2002 <= 20) {
            field676 = false;
            Statics.field649.method1476(0, 0);
            Statics.field650.method1476(382, 0);
            Statics.field670.method1615(382 - Statics.field670.field1329 / 2, 18);
            return;
        }
        if (field668 == -1) {
            return;
        }
        class22 var5 = Statics.field1353[field668];
        method2101(var5);
        field676 = false;
        Statics.field649.method1476(0, 0);
        Statics.field650.method1476(382, 0);
        Statics.field670.method1615(382 - Statics.field670.field1329 / 2, 18);
        return;
    }

    @ObfuscatedName("cv.h(Lo;B)V")
    public static void method2101(class22 arg0) {
        if (arg0.method520() != client.field513) {
            client.field513 = arg0.method520();
            class45.method539(arg0.method520());
        }
        Statics.field612 = arg0.field572;
        client.field320 = arg0.field576;
        client.field256 = arg0.field569;
        Statics.field59 = client.field418 == 0 ? 43594 : arg0.field576 + 40000;
        Statics.field1884 = client.field418 == 0 ? 443 : arg0.field576 + 50000;
        Statics.field603 = Statics.field59;
    }

    @ObfuscatedName("w.a(I)V")
    public static void method91() {
        try {
            if (Statics.field677 == null) {
                Statics.field677 = new class17(Statics.field2680, new URL(Statics.field989));
            } else {
                byte[] var0 = Statics.field677.method157();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field645 = var1.method2175();
                    Statics.field1353 = new class22[field645];
                    int var2 = 0;
                    while (var2 < field645) {
                        class22 var3 = Statics.field1353[var2] = new class22();
                        var3.field576 = var1.method2175();
                        var3.field569 = var1.method2305();
                        var3.field572 = var1.method2351();
                        var3.field573 = var1.method2351();
                        var3.field585 = var1.method2173();
                        var3.field571 = var1.method2176();
                        var3.field575 = var2++;
                    }
                    method3585(Statics.field1353, 0, Statics.field1353.length - 1, field680, field675);
                    field676 = true;
                    Statics.field677 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field677 = null;
        }
    }

    @ObfuscatedName("t.y(III)V")
    public static void method490(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field680[var5] != arg0) {
                var2[var4] = field680[var5];
                var3[var4] = field675[var5];
                var4++;
            }
        }
        field680 = var2;
        field675 = var3;
        method3585(Statics.field1353, 0, Statics.field1353.length - 1, field680, field675);
    }

    @ObfuscatedName("gp.v([Lo;II[I[II)V")
    public static void method3585(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field575;
                        var12 = var8.field575;
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
                        var11 = arg0[var6].method520() ? 1 : 0;
                        var12 = var8.method520() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field576;
                        var12 = var8.field576;
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
                        var15 = arg0[var5].field575;
                        var16 = var8.field575;
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
                        var15 = arg0[var5].method520() ? 1 : 0;
                        var16 = var8.method520() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field576;
                        var16 = var8.field576;
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
        method3585(arg0, arg1, var6, arg3, arg4);
        method3585(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
