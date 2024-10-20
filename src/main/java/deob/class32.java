package deob;

import java.awt.Graphics;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.r")
    public static int field717 = 0;

    @ObfuscatedName("ah.u")
    public static int field722 = field717 + 202;

    @ObfuscatedName("ah.b")
    public static int[] field723 = new int[256];

    @ObfuscatedName("ah.q")
    public static int field726 = 0;

    @ObfuscatedName("ah.w")
    public static int field733 = 0;

    @ObfuscatedName("ah.aw")
    public static int field728 = 0;

    @ObfuscatedName("ah.ax")
    public static int field729 = 0;

    @ObfuscatedName("ah.ak")
    public static int field749 = 0;

    @ObfuscatedName("ah.ah")
    public static int field731 = 0;

    @ObfuscatedName("ah.ac")
    public static int field751 = 10;

    @ObfuscatedName("ah.as")
    public static String field741 = "";

    @ObfuscatedName("ah.ao")
    public static int field734 = 0;

    @ObfuscatedName("ah.am")
    public static String field735 = "";

    @ObfuscatedName("ah.ai")
    public static String field736 = "";

    @ObfuscatedName("ah.ab")
    public static String field737 = "";

    @ObfuscatedName("ah.al")
    public static String field738 = "";

    @ObfuscatedName("ah.ar")
    public static String field743 = "";

    @ObfuscatedName("ah.aa")
    public static String field727 = "";

    @ObfuscatedName("ah.ag")
    public static class159 field716 = class159.field2585;

    @ObfuscatedName("ah.aj")
    public static boolean field732 = true;

    @ObfuscatedName("ah.ap")
    public static int field739 = 0;

    @ObfuscatedName("ah.aq")
    public static String field744 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.af")
    public static String field745 = "1234567890";

    @ObfuscatedName("ah.au")
    public static boolean field742 = false;

    @ObfuscatedName("ah.bp")
    public static int field748 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.a(Lfz;Lfz;I)I")
    public static int method206(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3043("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3043("logo", "")) {
            var2++;
        }
        if (arg1.method3043("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3043("titlebox", "")) {
            var2++;
        }
        if (arg1.method3043("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3043("runes", "")) {
            var2++;
        }
        if (arg1.method3043("title_mute", "")) {
            var2++;
        }
        if (arg1.method3037("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3037("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3043("sl_back", "");
        arg1.method3043("sl_flags", "");
        arg1.method3043("sl_arrows", "");
        arg1.method3043("sl_stars", "");
        arg1.method3043("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ek.f(Lel;B)V")
    public static void method2675(class144 arg0) {
        if (field742) {
            method2809(arg0);
            return;
        }
        if ((class140.field2146 == 1 || !Statics.field3150 && class140.field2146 == 4) && class140.field2147 >= field717 + 765 - 50 && class140.field2148 >= 453) {
            Statics.field1549.field133 = !Statics.field1549.field133;
            class9.method2269();
            if (Statics.field1549.field133) {
                Statics.field2943.method3382();
                class183.field2948 = 1;
                Statics.field2947 = null;
            } else {
                class168 var1 = Statics.field2055;
                int var2 = var1.method3040("scape main");
                int var3 = var1.method3090(var2, "");
                class183.method1958(var1, var2, var3, 255, false);
            }
        }
        if (client.field553 == 5) {
            return;
        }
        field749++;
        if (client.field553 != 10 && client.field553 != 11) {
            return;
        }
        if (client.field299 == 0) {
            if (class140.field2146 == 1 || !Statics.field3150 && class140.field2146 == 4) {
                int var4 = field717 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class140.field2147 >= var4 && class140.field2147 <= var4 + var6 && class140.field2148 >= var5 && class140.field2148 <= var5 + var7) {
                    if (class26.method100()) {
                        field742 = true;
                    }
                    return;
                }
            }
            if (Statics.field1880 != null && class26.method100()) {
                field742 = true;
            }
        }
        int var8 = class140.field2146;
        int var9 = class140.field2147;
        int var10 = class140.field2148;
        if (!Statics.field3150 && var8 == 4) {
            var8 = 1;
        }
        if (field734 == 0) {
            int var11 = field722 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class138.method695(client.method2044("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = field722 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field507 & 0x2000000) != 0) {
                    field735 = "";
                    field736 = class157.field2313;
                    field737 = class157.field2373;
                    field738 = class157.field2329;
                    field734 = 1;
                    field739 = 0;
                } else if ((client.field507 & 0x4) != 0) {
                    if ((client.field507 & 0x400) == 0) {
                        field736 = class157.field2299;
                        field737 = class157.field2507;
                        field738 = class157.field2332;
                    } else {
                        field736 = class157.field2512;
                        field737 = class157.field2513;
                        field738 = class157.field2514;
                    }
                    field735 = class157.field2349;
                    field734 = 1;
                    field739 = 0;
                } else if ((client.field507 & 0x400) == 0) {
                    field736 = class157.field2437;
                    field737 = class157.field2503;
                    field738 = class157.field2504;
                    field734 = 2;
                    field739 = 0;
                } else {
                    field736 = class157.field2509;
                    field737 = class157.field2510;
                    field738 = class157.field2511;
                    field735 = class157.field2349;
                    field734 = 1;
                    field739 = 0;
                }
            }
        } else if (field734 == 1) {
            while (class137.method700()) {
                if (Statics.field202 == 84) {
                    field736 = class157.field2437;
                    field737 = class157.field2503;
                    field738 = class157.field2504;
                    field734 = 2;
                    field739 = 0;
                } else if (Statics.field202 == 13) {
                    field734 = 0;
                }
            }
            int var14 = field722 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field736 = class157.field2437;
                field737 = class157.field2503;
                field738 = class157.field2504;
                field734 = 2;
                field739 = 0;
            }
            int var16 = field722 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field734 = 0;
            }
        } else if (field734 == 2) {
            short var17 = 231;
            int var39 = var17 + 30;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field739 = 0;
            }
            var39 += 15;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field739 = 1;
            }
            var39 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                Statics.method57(class157.field2541, class157.field2342, class157.field2447);
                field734 = 5;
                return;
            }
            int var19 = field722 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field743 = field743.trim();
                if (field743.length() == 0) {
                    Statics.method57(class157.field2505, class157.field2409, class157.field2410);
                    return;
                }
                if (field727.length() == 0) {
                    Statics.method57(class157.field2434, class157.field2530, class157.field2413);
                    return;
                }
                Statics.method57(class157.field2535, class157.field2521, class157.field2522);
                field716 = Statics.field1549.field135.containsKey(class163.method2656(field743)) ? class159.field2586 : class159.field2585;
                client.method10(20);
                return;
            }
            int var21 = field722 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field734 = 0;
                field743 = "";
                field727 = "";
                Statics.field2900 = 0;
                Statics.field670 = "";
                field732 = true;
            }
            while (true) {
                while (class137.method700()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field744.length(); var23++) {
                        if (Statics.field1949 == field744.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field202 == 13) {
                        field734 = 0;
                        field743 = "";
                        field727 = "";
                        Statics.field2900 = 0;
                        Statics.field670 = "";
                        field732 = true;
                    } else if (field739 == 0) {
                        if (Statics.field202 == 85 && field743.length() > 0) {
                            field743 = field743.substring(0, field743.length() - 1);
                        }
                        if (Statics.field202 == 84 || Statics.field202 == 80) {
                            field739 = 1;
                        }
                        if (var22 && field743.length() < 320) {
                            field743 = field743 + Statics.field1949;
                        }
                    } else if (field739 == 1) {
                        if (Statics.field202 == 85 && field727.length() > 0) {
                            field727 = field727.substring(0, field727.length() - 1);
                        }
                        if (Statics.field202 == 84 || Statics.field202 == 80) {
                            field739 = 0;
                        }
                        if (Statics.field202 == 84) {
                            field743 = field743.trim();
                            if (field743.length() == 0) {
                                Statics.method57(class157.field2505, class157.field2409, class157.field2410);
                                return;
                            }
                            if (field727.length() == 0) {
                                Statics.method57(class157.field2434, class157.field2530, class157.field2413);
                                return;
                            }
                            Statics.method57(class157.field2535, class157.field2521, class157.field2522);
                            field716 = Statics.field1549.field135.containsKey(class163.method2656(field743)) ? class159.field2586 : class159.field2585;
                            client.method10(20);
                            return;
                        }
                        if (var22 && field727.length() < 20) {
                            field727 = field727 + Statics.field1949;
                        }
                    }
                }
                return;
            }
        } else if (field734 == 3) {
            int var24 = field722 + 180;
            short var25 = 276;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field736 = class157.field2437;
                field737 = class157.field2503;
                field738 = class157.field2504;
                field734 = 2;
                field739 = 0;
            }
            int var26 = field722 + 180;
            short var27 = 326;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                Statics.method57(class157.field2541, class157.field2342, class157.field2447);
                field734 = 5;
                return;
            }
        } else if (field734 == 4) {
            int var28 = field722 + 180 - 80;
            short var29 = 321;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                Statics.field670.trim();
                if (Statics.field670.length() != 6) {
                    Statics.method57(class157.field2424, class157.field2328, class157.field2418);
                    return;
                }
                Statics.field2900 = Integer.parseInt(Statics.field670);
                Statics.field670 = "";
                field716 = field732 ? class159.field2584 : class159.field2587;
                Statics.method57(class157.field2535, class157.field2521, class157.field2522);
                client.method10(20);
                return;
            }
            if (var8 == 1 && var9 >= field722 + 180 - 9 && var9 <= field722 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field732 = !field732;
            }
            if (var8 == 1 && var9 >= field722 + 180 - 34 && var9 <= field722 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class138.method695(client.method2044("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var30 = field722 + 180 + 80;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                field734 = 0;
                field743 = "";
                field727 = "";
                Statics.field2900 = 0;
                Statics.field670 = "";
            }
            while (class137.method700()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field745.length(); var32++) {
                    if (Statics.field1949 == field745.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field202 == 13) {
                    field734 = 0;
                    field743 = "";
                    field727 = "";
                    Statics.field2900 = 0;
                    Statics.field670 = "";
                } else {
                    if (Statics.field202 == 85 && Statics.field670.length() > 0) {
                        Statics.field670 = Statics.field670.substring(0, Statics.field670.length() - 1);
                    }
                    if (Statics.field202 == 84) {
                        Statics.field670.trim();
                        if (Statics.field670.length() != 6) {
                            Statics.method57(class157.field2424, class157.field2328, class157.field2418);
                            return;
                        }
                        Statics.field2900 = Integer.parseInt(Statics.field670);
                        Statics.field670 = "";
                        field716 = field732 ? class159.field2584 : class159.field2587;
                        Statics.method57(class157.field2535, class157.field2521, class157.field2522);
                        client.method10(20);
                        return;
                    }
                    if (var31 && Statics.field670.length() < 6) {
                        Statics.field670 = Statics.field670 + Statics.field1949;
                    }
                }
            }
        } else if (field734 == 5) {
            int var33 = field722 + 180 - 80;
            short var34 = 321;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                method960();
                return;
            }
            int var35 = field722 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                field736 = class157.field2437;
                field737 = class157.field2503;
                field738 = class157.field2504;
                field734 = 2;
                field739 = 0;
                field727 = "";
            }
            while (class137.method700()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field744.length(); var37++) {
                    if (Statics.field1949 == field744.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field202 == 13) {
                    field736 = class157.field2437;
                    field737 = class157.field2503;
                    field738 = class157.field2504;
                    field734 = 2;
                    field739 = 0;
                    field727 = "";
                } else {
                    if (Statics.field202 == 85 && field743.length() > 0) {
                        field743 = field743.substring(0, field743.length() - 1);
                    }
                    if (Statics.field202 == 84) {
                        method960();
                        return;
                    }
                    if (var36 && field743.length() < 320) {
                        field743 = field743 + Statics.field1949;
                    }
                }
            }
        } else if (field734 == 6) {
            while (true) {
                do {
                    if (!class137.method700()) {
                        short var38 = 321;
                        if (var8 == 1 && var10 >= var38 - 20 && var10 <= var38 + 20) {
                            field736 = class157.field2437;
                            field737 = class157.field2503;
                            field738 = class157.field2504;
                            field734 = 2;
                            field739 = 0;
                            field727 = "";
                        }
                        return;
                    }
                } while (Statics.field202 != 84 && Statics.field202 != 13);
                field736 = class157.field2437;
                field737 = class157.field2503;
                field738 = class157.field2504;
                field734 = 2;
                field739 = 0;
                field727 = "";
            }
        }
    }

    @ObfuscatedName("aq.s(B)V")
    public static void method960() {
        field743 = field743.trim();
        if (field743.length() == 0) {
            Statics.method57(class157.field2541, class157.field2342, class157.field2447);
            return;
        }
        long var0 = class10.method711();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method2151(var0, field743);
        }
        switch(var2) {
            case 2:
                Statics.method57(class157.field2544, class157.field2545, class157.field2546);
                field734 = 6;
                break;
            case 3:
                Statics.method57(class157.field2539, class157.field2412, class157.field2435);
                break;
            case 4:
                Statics.method57(class157.field2525, class157.field2551, class157.field2552);
                break;
            case 5:
                Statics.method57(class157.field2488, class157.field2554, class157.field2392);
                break;
            case 6:
                Statics.method57(class157.field2536, class157.field2557, class157.field2482);
                break;
            case 7:
                Statics.method57(class157.field2559, class157.field2560, class157.field2543);
        }
    }

    @ObfuscatedName("bm.y(Lht;Lht;Lht;ZB)V")
    public static void method1571(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field717 = (Statics.field108 - client.field418) / 2;
            field722 = field717 + 202;
        }
        if (field742) {
            method2811(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field718.method1617(field717, 0);
            Statics.field719.method1617(field717 + 382, 0);
            Statics.field160.method1757(field717 + 382 - Statics.field160.field1419 / 2, 18);
        }
        if (client.field553 == 0 || client.field553 == 5) {
            byte var4 = 20;
            arg0.method3774(class157.field2501, field722 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1727(field722 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1727(field722 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1704(field722 + 180 - 150, var5 + 2, field751 * 3, 30, 9179409);
            class80.method1704(field751 * 3 + (field722 + 180 - 150), var5 + 2, 300 - field751 * 3, 30, 0);
            arg0.method3774(field741, field722 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field553 == 20) {
            Statics.field2039.method1757(field722 + 180 - Statics.field2039.field1419 / 2, 271 - Statics.field2039.field1418 / 2);
            short var6 = 211;
            arg0.method3774(field736, field722 + 180, var6, 16776960, 0);
            int var106 = var6 + 15;
            arg0.method3774(field737, field722 + 180, var106, 16776960, 0);
            int var107 = var106 + 15;
            arg0.method3774(field738, field722 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            int var109 = var108 + 10;
            if (field734 != 4) {
                arg0.method3772(class157.field2401, field722 + 180 - 110, var109, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field743; arg0.method3767(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3772(class223.method3845(var8), field722 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                arg0.method3772(class157.field2524 + class163.method2775(field727), field722 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
            }
        }
        if (client.field553 == 10 || client.field553 == 11) {
            Statics.field2039.method1757(field722, 171);
            if (field734 == 0) {
                short var9 = 251;
                arg0.method3774(class157.field2526, field722 + 180, var9, 16776960, 0);
                int var110 = var9 + 30;
                int var10 = field722 + 180 - 80;
                short var11 = 291;
                Statics.field3113.method1757(var10 - 73, var11 - 20);
                arg0.method3810(class157.field2527, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field722 + 180 + 80;
                Statics.field3113.method1757(var12 - 73, var11 - 20);
                arg0.method3810(class157.field2528, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field734 == 1) {
                arg0.method3774(field735, field722 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3774(field736, field722 + 180, var13, 16777215, 0);
                int var111 = var13 + 15;
                arg0.method3774(field737, field722 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                arg0.method3774(field738, field722 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                int var14 = field722 + 180 - 80;
                short var15 = 321;
                Statics.field3113.method1757(var14 - 73, var15 - 20);
                arg0.method3774(class157.field2442, var14, var15 + 5, 16777215, 0);
                int var16 = field722 + 180 + 80;
                Statics.field3113.method1757(var16 - 73, var15 - 20);
                arg0.method3774(class157.field2547, var16, var15 + 5, 16777215, 0);
            } else if (field734 == 2) {
                short var17 = 211;
                arg0.method3774(field736, field722 + 180, var17, 16776960, 0);
                int var114 = var17 + 15;
                arg0.method3774(field737, field722 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg0.method3774(field738, field722 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var117 = var116 + 10;
                arg0.method3772(class157.field2401, field722 + 180 - 110, var117, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field743; arg0.method3767(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3772(class223.method3845(var19) + (field739 == 0 & client.field304 % 40 < 20 ? class2.method1065(16776960) + class2.field16 : ""), field722 + 180 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                arg0.method3772(class157.field2524 + class163.method2775(field727) + (field739 == 1 & client.field304 % 40 < 20 ? class2.method1065(16776960) + class2.field16 : ""), field722 + 180 - 108, var114, 16777215, 0);
                var114 += 15;
                int var20 = field722 + 180 - 80;
                short var21 = 321;
                Statics.field3113.method1757(var20 - 73, var21 - 20);
                arg0.method3774(class157.field2529, var20, var21 + 5, 16777215, 0);
                int var22 = field722 + 180 + 80;
                Statics.field3113.method1757(var22 - 73, var21 - 20);
                arg0.method3774(class157.field2547, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3774(class157.field2321, field722 + 180, var23, 16776960, 0);
            } else if (field734 == 3) {
                short var24 = 201;
                arg0.method3774(class157.field2531, field722 + 180, var24, 16776960, 0);
                int var118 = var24 + 20;
                arg1.method3774(class157.field2405, field722 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg1.method3774(class157.field2456, field722 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var25 = field722 + 180;
                short var26 = 276;
                Statics.field3113.method1757(var25 - 73, var26 - 20);
                arg2.method3774(class157.field2534, var25, var26 + 5, 16777215, 0);
                int var27 = field722 + 180;
                short var28 = 326;
                Statics.field3113.method1757(var27 - 73, var28 - 20);
                arg2.method3774(class157.field2515, var27, var28 + 5, 16777215, 0);
            } else if (field734 == 4) {
                arg0.method3774(class157.field2441, field722 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3774(field736, field722 + 180, var29, 16777215, 0);
                int var121 = var29 + 15;
                arg0.method3774(field737, field722 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method3774(field738, field722 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method3772(class157.field2508 + class163.method2775(Statics.field670) + (client.field304 % 40 < 20 ? class2.method1065(16776960) + class2.field16 : ""), field722 + 180 - 108, var123, 16777215, 0);
                int var124 = var123 - 8;
                arg0.method3772(class157.field2301, field722 + 180 - 9, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method3772(class157.field2302, field722 + 180 - 9, var125, 16776960, 0);
                int var30 = field722 + 180 - 9 + arg0.method3767(class157.field2302) + 15;
                int var31 = var125 - arg0.field3194;
                class81 var32;
                if (field732) {
                    var32 = Statics.field720;
                } else {
                    var32 = Statics.field1394;
                }
                var32.method1757(var30, var31);
                var121 = var125 + 15;
                int var33 = field722 + 180 - 80;
                short var34 = 321;
                Statics.field3113.method1757(var33 - 73, var34 - 20);
                arg0.method3774(class157.field2442, var33, var34 + 5, 16777215, 0);
                int var35 = field722 + 180 + 80;
                Statics.field3113.method1757(var35 - 73, var34 - 20);
                arg0.method3774(class157.field2547, var35, var34 + 5, 16777215, 0);
                arg1.method3774(class157.field2519, field722 + 180, var34 + 36, 255, 0);
            } else if (field734 == 5) {
                arg0.method3774(class157.field2537, field722 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3774(field736, field722 + 180, var36, 16776960, 0);
                int var126 = var36 + 15;
                arg2.method3774(field737, field722 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg2.method3774(field738, field722 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var129 = var128 + 14;
                arg0.method3772(class157.field2538, field722 + 180 - 145, var129, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field743; arg0.method3767(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3772(class223.method3845(var38) + (client.field304 % 40 < 20 ? class2.method1065(16776960) + class2.field16 : ""), field722 + 180 - 34, var129, 16777215, 0);
                var126 = var129 + 15;
                int var39 = field722 + 180 - 80;
                short var40 = 321;
                Statics.field3113.method1757(var39 - 73, var40 - 20);
                arg0.method3774(class157.field2466, var39, var40 + 5, 16777215, 0);
                int var41 = field722 + 180 + 80;
                Statics.field3113.method1757(var41 - 73, var40 - 20);
                arg0.method3774(class157.field2540, var41, var40 + 5, 16777215, 0);
            } else if (field734 == 6) {
                short var42 = 211;
                arg0.method3774(field736, field722 + 180, var42, 16776960, 0);
                int var130 = var42 + 15;
                arg0.method3774(field737, field722 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method3774(field738, field722 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var43 = field722 + 180;
                short var44 = 321;
                Statics.field3113.method1757(var43 - 73, var44 - 20);
                arg0.method3774(class157.field2540, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field749 > 0) {
            int var45 = field749;
            short var46 = 256;
            field728 += var45 * 128;
            if (field728 > Statics.field591.length) {
                field728 -= Statics.field591.length;
                int var47 = (int) (Math.random() * 12.0D);
                method3487(Statics.field3139[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field1385[var48 + var49] - Statics.field591[field728 + var48 & Statics.field591.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field1385[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field1385[var54 + var55] = 255;
                    } else {
                        Statics.field1385[var54 + var55] = 0;
                    }
                }
            }
            if (field726 > 0) {
                field726 -= var45 * 4;
            }
            if (field733 > 0) {
                field733 -= var45 * 4;
            }
            if (field726 == 0 && field733 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field726 = 1024;
                }
                if (var57 == 1) {
                    field733 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field723[var58] = field723[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field723[var59] = (int) (Math.sin((double) field731 / 14.0D) * 16.0D + Math.sin((double) field731 / 15.0D) * 14.0D + Math.sin((double) field731 / 16.0D) * 12.0D);
                field731++;
            }
            field729 += var45 * -567029311;
            int var60 = ((client.field304 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field729 * -1620815516; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1385[(var63 << 7) + var62] = 192;
                }
                field729 = 0;
                int var64 = 0;
                label319: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label319;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field776[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field776[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field1385[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field1385[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field1385[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field776[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field749 = 0;
        }
        short var72 = 256;
        if (field726 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field726 > 768) {
                    Statics.field724[var73] = method994(Statics.field257[var73], Statics.field725[var73], 1024 - field726);
                } else if (field726 > 256) {
                    Statics.field724[var73] = Statics.field725[var73];
                } else {
                    Statics.field724[var73] = method994(Statics.field725[var73], Statics.field257[var73], 256 - field726);
                }
            }
        } else if (field733 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field733 > 768) {
                    Statics.field724[var74] = method994(Statics.field257[var74], Statics.field173[var74], 1024 - field733);
                } else if (field733 > 256) {
                    Statics.field724[var74] = Statics.field173[var74];
                } else {
                    Statics.field724[var74] = method994(Statics.field173[var74], Statics.field257[var74], 256 - field733);
                }
            }
        } else {
            for (int var75 = 0; var75 < 256; var75++) {
                Statics.field724[var75] = Statics.field257[var75];
            }
        }
        class80.method1726(field717, 9, field717 + 128, var72 + 7);
        Statics.field718.method1617(field717, 0);
        class80.method1747();
        int var76 = 0;
        int var77 = field717 + Statics.field2150.field1396 * 9;
        for (int var78 = 1; var78 < var72 - 1; var78++) {
            int var79 = (var72 - var78) * field723[var78] / var72;
            int var80 = var79 + 22;
            if (var80 < 0) {
                var80 = 0;
            }
            var76 += var80;
            for (int var81 = var80; var81 < 128; var81++) {
                int var82 = Statics.field1385[var76++];
                if (var82 == 0) {
                    var77++;
                } else {
                    int var84 = 256 - var82;
                    int var85 = Statics.field724[var82];
                    int var86 = Statics.field2150.field1395[var77];
                    Statics.field2150.field1395[var77++] = ((var85 & 0xFF00) * var82 + (var86 & 0xFF00) * var84 & 0xFF0000) + ((var85 & 0xFF00FF) * var82 + (var86 & 0xFF00FF) * var84 & 0xFF00FF00) >> 8;
                }
            }
            var77 += Statics.field2150.field1396 + var80 - 128;
        }
        class80.method1726(field717 + 765 - 128, 9, field717 + 765, var72 + 7);
        Statics.field719.method1617(field717 + 382, 0);
        class80.method1747();
        int var87 = 0;
        int var88 = field717 + Statics.field2150.field1396 * 9 + 24 + 637;
        for (int var89 = 1; var89 < var72 - 1; var89++) {
            int var90 = (var72 - var89) * field723[var89] / var72;
            int var91 = 103 - var90;
            int var92 = var88 + var90;
            for (int var93 = 0; var93 < var91; var93++) {
                int var94 = Statics.field1385[var87++];
                if (var94 == 0) {
                    var92++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field724[var94];
                    int var98 = Statics.field2150.field1395[var92];
                    Statics.field2150.field1395[var92++] = ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) >> 8;
                }
            }
            var87 += 128 - var91;
            var88 = Statics.field2150.field1396 - var91 - var90 + var92;
        }
        Statics.field1161[Statics.field1549.field133 ? 1 : 0].method1757(field717 + 765 - 40, 463);
        if (client.field553 > 5 && client.field299 == 0) {
            if (Statics.field747 == null) {
                Statics.field747 = class77.method992(Statics.field128, "sl_button", "");
            } else {
                int var99 = field717 + 5;
                short var100 = 463;
                byte var101 = 100;
                byte var102 = 35;
                Statics.field747.method1757(var99, var100);
                arg0.method3774(class157.field2520 + " " + client.field528, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
                if (Statics.field1880 == null) {
                    arg1.method3774(class157.field2533, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                } else {
                    arg1.method3774(class157.field2571, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var103 = Statics.field1043.getGraphics();
            Statics.field2150.method1525(var103, 0, 0);
        } catch (Exception var105) {
            Statics.field1043.repaint();
        }
    }

    @ObfuscatedName("gu.g(Lcj;I)V")
    public static final void method3487(class81 arg0) {
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
                    Statics.field2230[var8] = (Statics.field591[var8 - 1] + Statics.field591[var8 + 1] + Statics.field591[var8 - 128] + Statics.field591[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field591;
            Statics.field591 = Statics.field2230;
            Statics.field2230 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1418; var11++) {
            for (int var12 = 0; var12 < arg0.field1419; var12++) {
                if (arg0.field1424[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1420;
                    int var14 = var11 + 16 + arg0.field1422;
                    int var15 = (var14 << 7) + var13;
                    Statics.field591[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ay.m(IIII)I")
    public static final int method994(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ex.j(Lht;Lht;S)V")
    public static void method2811(class224 arg0, class224 arg1) {
        if (Statics.field701 == null) {
            Statics.field701 = class77.method1520(Statics.field128, "sl_back", "");
        }
        if (Statics.field881 == null) {
            Statics.field881 = class77.method649(Statics.field128, "sl_flags", "");
        }
        if (Statics.field1095 == null) {
            Statics.field1095 = class77.method649(Statics.field128, "sl_arrows", "");
        }
        if (Statics.field1588 == null) {
            Statics.field1588 = class77.method649(Statics.field128, "sl_stars", "");
        }
        class80.method1704(field717, 23, 765, 480, 0);
        class80.method1705(field717, 0, 125, 23, 12425273, 9135624);
        class80.method1705(field717 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3774(class157.field2358, field717 + 62, 15, 0, -1);
        if (Statics.field1588 != null) {
            Statics.field1588[1].method1757(field717 + 140, 1);
            arg1.method3772(class157.field2563, field717 + 152, 10, 16777215, -1);
            Statics.field1588[0].method1757(field717 + 140, 12);
            arg1.method3772(class157.field2564, field717 + 152, 21, 16777215, -1);
        }
        if (Statics.field1095 != null) {
            int var2 = field717 + 280;
            if (class26.field638[0] == 0 && class26.field637[0] == 0) {
                Statics.field1095[2].method1757(var2, 4);
            } else {
                Statics.field1095[0].method1757(var2, 4);
            }
            if (class26.field638[0] == 0 && class26.field637[0] == 1) {
                Statics.field1095[3].method1757(var2 + 15, 4);
            } else {
                Statics.field1095[1].method1757(var2 + 15, 4);
            }
            arg0.method3772(class157.field2565, var2 + 32, 17, 16777215, -1);
            int var3 = field717 + 390;
            if (class26.field638[0] == 1 && class26.field637[0] == 0) {
                Statics.field1095[2].method1757(var3, 4);
            } else {
                Statics.field1095[0].method1757(var3, 4);
            }
            if (class26.field638[0] == 1 && class26.field637[0] == 1) {
                Statics.field1095[3].method1757(var3 + 15, 4);
            } else {
                Statics.field1095[1].method1757(var3 + 15, 4);
            }
            arg0.method3772(class157.field2440, var3 + 32, 17, 16777215, -1);
            int var4 = field717 + 500;
            if (class26.field638[0] == 2 && class26.field637[0] == 0) {
                Statics.field1095[2].method1757(var4, 4);
            } else {
                Statics.field1095[0].method1757(var4, 4);
            }
            if (class26.field638[0] == 2 && class26.field637[0] == 1) {
                Statics.field1095[3].method1757(var4 + 15, 4);
            } else {
                Statics.field1095[1].method1757(var4 + 15, 4);
            }
            arg0.method3772(class157.field2567, var4 + 32, 17, 16777215, -1);
            int var5 = field717 + 610;
            if (class26.field638[0] == 3 && class26.field637[0] == 0) {
                Statics.field1095[2].method1757(var5, 4);
            } else {
                Statics.field1095[0].method1757(var5, 4);
            }
            if (class26.field638[0] == 3 && class26.field637[0] == 1) {
                Statics.field1095[3].method1757(var5 + 15, 4);
            } else {
                Statics.field1095[1].method1757(var5 + 15, 4);
            }
            arg0.method3772(class157.field2343, var5 + 32, 17, 16777215, -1);
        }
        class80.method1704(field717 + 708, 4, 50, 16, 0);
        arg1.method3774(class157.field2547, field717 + 708 + 25, 16, 16777215, -1);
        field748 = -1;
        if (Statics.field701 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field635) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field635) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field635) {
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
            int var17 = field717 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field635; var20++) {
                class26 var21 = Statics.field634[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field636);
                if (var21.field636 == -1) {
                    var23 = class157.field2569;
                    var22 = false;
                } else if (var21.field636 > 1980) {
                    var23 = class157.field2570;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method591()) {
                    if (var21.method592()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method597()) {
                    var24 = 16711680;
                    if (var21.method592()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method594()) {
                    if (var21.method592()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method592()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class140.field2141 >= var17 && class140.field2136 >= var16 && class140.field2141 < var6 + var17 && class140.field2136 < var7 + var16 && var22) {
                    field748 = var20;
                    Statics.field701[var25].method1620(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field701[var25].method1617(var17, var16);
                }
                if (Statics.field881 != null) {
                    Statics.field881[(var21.method592() ? 8 : 0) + var21.field645].method1757(var17 + 29, var16);
                }
                arg0.method3774(Integer.toString(var21.field639), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3774(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3767(Statics.field634[field748].field644) + 6;
                int var27 = arg1.field3194 + 8;
                class80.method1704(class140.field2141 - var26 / 2, class140.field2136 + 20 + 5, var26, var27, 16777120);
                class80.method1727(class140.field2141 - var26 / 2, class140.field2136 + 20 + 5, var26, var27, 0);
                arg1.method3774(Statics.field634[field748].field644, class140.field2141, class140.field2136 + 20 + 5 + arg1.field3194 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1043.getGraphics();
            Statics.field2150.method1525(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1043.repaint();
        }
    }

    @ObfuscatedName("en.n(Lel;I)V")
    public static void method2809(class144 arg0) {
        if (class140.field2146 != 1 && Statics.field3150 || class140.field2146 != 4) {
            return;
        }
        int var1 = field717 + 280;
        if (class140.field2147 >= var1 && class140.field2147 <= var1 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(0, 0);
            return;
        }
        if (class140.field2147 >= var1 + 15 && class140.field2147 <= var1 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(0, 1);
            return;
        }
        int var2 = field717 + 390;
        if (class140.field2147 >= var2 && class140.field2147 <= var2 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(1, 0);
            return;
        }
        if (class140.field2147 >= var2 + 15 && class140.field2147 <= var2 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(1, 1);
            return;
        }
        int var3 = field717 + 500;
        if (class140.field2147 >= var3 && class140.field2147 <= var3 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(2, 0);
            return;
        }
        if (class140.field2147 >= var3 + 15 && class140.field2147 <= var3 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(2, 1);
            return;
        }
        int var4 = field717 + 610;
        if (class140.field2147 >= var4 && class140.field2147 <= var4 + 14 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(3, 0);
            return;
        }
        if (class140.field2147 >= var4 + 15 && class140.field2147 <= var4 + 80 && class140.field2148 >= 4 && class140.field2148 <= 18) {
            class26.method183(3, 1);
            return;
        }
        if (class140.field2147 >= field717 + 708 && class140.field2148 >= 4 && class140.field2147 <= field717 + 708 + 50 && class140.field2148 <= 20) {
            field742 = false;
            Statics.field718.method1617(field717, 0);
            Statics.field719.method1617(field717 + 382, 0);
            Statics.field160.method1757(field717 + 382 - Statics.field160.field1419 / 2, 18);
            return;
        }
        if (field748 == -1) {
            return;
        }
        class26 var5 = Statics.field634[field748];
        method204(var5);
        field742 = false;
        Statics.field718.method1617(field717, 0);
        Statics.field719.method1617(field717 + 382, 0);
        Statics.field160.method1757(field717 + 382 - Statics.field160.field1419 / 2, 18);
        return;
    }

    @ObfuscatedName("c.l(Lo;B)V")
    public static void method204(class26 arg0) {
        if (arg0.method592() != client.field297) {
            client.field297 = arg0.method592();
            boolean var1 = arg0.method592();
            if (Statics.field1110 != var1) {
                class52.field1138.method3515();
                class52.field1112.method3515();
                class52.field1156.method3515();
                Statics.field1110 = var1;
            }
        }
        Statics.field769 = arg0.field631;
        client.field528 = arg0.field639;
        client.field507 = arg0.field640;
        Statics.field1351 = client.field296 == 0 ? 43594 : arg0.field639 + 40000;
        Statics.field1613 = client.field296 == 0 ? 443 : arg0.field639 + 50000;
        Statics.field801 = Statics.field1351;
    }
}
