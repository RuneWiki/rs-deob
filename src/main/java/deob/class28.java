package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("aw")
public class class28 {

    @ObfuscatedName("aw.q")
    public static int[] field635 = new int[256];

    @ObfuscatedName("aw.k")
    public static int field637 = 0;

    @ObfuscatedName("aw.b")
    public static int field638 = 0;

    @ObfuscatedName("aw.ak")
    public static int field641 = 0;

    @ObfuscatedName("aw.aw")
    public static int field654 = 0;

    @ObfuscatedName("aw.af")
    public static int field643 = 0;

    @ObfuscatedName("aw.ab")
    public static int field644 = 0;

    @ObfuscatedName("aw.ao")
    public static int field645 = 10;

    @ObfuscatedName("aw.ah")
    public static String field632 = "";

    @ObfuscatedName("aw.ae")
    public static int field647 = 0;

    @ObfuscatedName("aw.ax")
    public static String field648 = "";

    @ObfuscatedName("aw.ar")
    public static String field649 = "";

    @ObfuscatedName("aw.aq")
    public static String field650 = "";

    @ObfuscatedName("aw.am")
    public static String field651 = "";

    @ObfuscatedName("aw.az")
    public static String field652 = "";

    @ObfuscatedName("aw.an")
    public static class144 field666 = class144.field2394;

    @ObfuscatedName("aw.aa")
    public static boolean field660 = true;

    @ObfuscatedName("aw.ag")
    public static int field656 = 0;

    @ObfuscatedName("aw.au")
    public static String field657 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aw.aj")
    public static String field658 = "1234567890";

    @ObfuscatedName("aw.ac")
    public static boolean field659 = false;

    @ObfuscatedName("aw.bu")
    public static int field669 = 0;

    @ObfuscatedName("aw.be")
    public static int[] field667 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aw.bp")
    public static int[] field663 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aw.bc")
    public static int field646 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.t(Leg;Leg;B)I")
    public static int method161(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2711("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2711("logo", "")) {
            var2++;
        }
        if (arg1.method2711("titlebox", "")) {
            var2++;
        }
        if (arg1.method2711("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2711("runes", "")) {
            var2++;
        }
        if (arg1.method2711("title_mute", "")) {
            var2++;
        }
        if (arg1.method2728("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2728("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2711("sl_back", "");
        arg1.method2711("sl_flags", "");
        arg1.method2711("sl_arrows", "");
        arg1.method2711("sl_stars", "");
        arg1.method2711("sl_button", "");
        return var2;
    }

    @ObfuscatedName("at.s(I)I")
    public static int method771() {
        return 8;
    }

    @ObfuscatedName("p.f(Ljava/awt/Component;Leg;Leg;ZII)V")
    public static void method457(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field631) {
            field647 = arg4;
            class73.method1504();
            byte[] var5 = arg1.method2726("title.jpg", "");
            Statics.field655 = new class72(var5, arg0);
            Statics.field2960 = Statics.field655.method1399();
            Statics.field1874 = class70.method506(arg2, "logo", "");
            Statics.field2892 = class70.method506(arg2, "titlebox", "");
            Statics.field629 = class70.method506(arg2, "titlebutton", "");
            Statics.field662 = class70.method508(arg2, "runes", "");
            Statics.field1919 = class70.method508(arg2, "title_mute", "");
            Statics.field2894 = class70.method506(arg2, "options_radio_buttons,0", "");
            Statics.field633 = class70.method506(arg2, "options_radio_buttons,2", "");
            Statics.field2937 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2937[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2937[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2937[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2937[var9 + 192] = 16777215;
            }
            Statics.field2510 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2510[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2510[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2510[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2510[var13 + 192] = 16777215;
            }
            Statics.field636 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field636[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field636[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field636[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field636[var17 + 192] = 16777215;
            }
            Statics.field678 = new int[256];
            Statics.field639 = new int[32768];
            Statics.field224 = new int[32768];
            method866((class74) null);
            Statics.field226 = new int[32768];
            Statics.field640 = new int[32768];
            if (arg3) {
                field651 = "";
                field652 = "";
            }
            Statics.field506 = 0;
            Statics.field664 = "";
            field660 = true;
            field659 = false;
            if (Statics.field1815.field137) {
                class161.method1742(2);
            } else {
                class161.method2687(2, Statics.field2401, "scape main", "", 255, false);
            }
            class150.method2692(false);
            Statics.field631 = true;
            Statics.field655.method1408(0, 0);
            Statics.field2960.method1408(382, 0);
            Statics.field1874.method1547(382 - Statics.field1874.field1308 / 2, 18);
        } else if (arg4 == 4) {
            field647 = 4;
        }
    }

    @ObfuscatedName("cy.e(I)V")
    public static void method2030() {
        if (!Statics.field631) {
            return;
        }
        Statics.field2892 = null;
        Statics.field629 = null;
        Statics.field662 = null;
        Statics.field655 = null;
        Statics.field2960 = null;
        Statics.field1874 = null;
        Statics.field1919 = null;
        Statics.field2894 = null;
        Statics.field633 = null;
        Statics.field1664 = null;
        Statics.field1441 = null;
        Statics.field2868 = null;
        Statics.field1431 = null;
        Statics.field523 = null;
        Statics.field2937 = null;
        Statics.field2510 = null;
        Statics.field636 = null;
        Statics.field678 = null;
        Statics.field639 = null;
        Statics.field224 = null;
        Statics.field226 = null;
        Statics.field640 = null;
        class161.method1742(2);
        class150.method2692(true);
        Statics.field631 = false;
    }

    @ObfuscatedName("av.d(Leh;I)V")
    public static void method780(class131 arg0) {
        if (!field659) {
            if ((class127.field2004 == 1 || !Statics.field776 && class127.field2004 == 4) && class127.field1993 >= 715 && class127.field2006 >= 453) {
                Statics.field1815.field137 = !Statics.field1815.field137;
                class9.method2668();
                if (Statics.field1815.field137) {
                    class161.method2434();
                } else {
                    class147 var6 = Statics.field2401;
                    int var7 = var6.method2724("scape main");
                    int var8 = var6.method2725(var7, "");
                    class161.method1932(var6, var7, var8, 255, false);
                }
            }
            if (client.field248 != 5) {
                field643++;
                if (client.field248 == 10 || client.field248 == 11) {
                    if (client.field247 == 0) {
                        if (class127.field2004 == 1 || !Statics.field776 && class127.field2004 == 4) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class127.field1993 >= var9 && class127.field1993 <= var9 + var11 && class127.field2006 >= var10 && class127.field2006 <= var10 + var12) {
                                method2429();
                                return;
                            }
                        }
                        if (Statics.field2104 != null) {
                            method2429();
                        }
                    }
                    int var13 = class127.field2004;
                    int var14 = class127.field1993;
                    int var15 = class127.field2006;
                    if (!Statics.field776 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field647 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class125.method2029(client.method1327("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field242 & 0x4) != 0) {
                                if ((client.field242 & 0x400) == 0) {
                                    field648 = class142.field2351;
                                    field649 = class142.field2352;
                                    field650 = class142.field2312;
                                } else {
                                    field648 = class142.field2353;
                                    field649 = class142.field2220;
                                    field650 = class142.field2359;
                                }
                                field647 = 1;
                                field656 = 0;
                            } else if ((client.field242 & 0x400) == 0) {
                                field648 = class142.field2347;
                                field649 = class142.field2348;
                                field650 = class142.field2219;
                                field647 = 2;
                                field656 = 0;
                            } else {
                                field648 = class142.field2354;
                                field649 = class142.field2355;
                                field650 = class142.field2356;
                                field647 = 1;
                                field656 = 0;
                            }
                        }
                    } else if (field647 == 1) {
                        while (class124.method458()) {
                            if (Statics.field2017 == 84) {
                                field648 = class142.field2347;
                                field649 = class142.field2348;
                                field650 = class142.field2219;
                                field647 = 2;
                                field656 = 0;
                            } else if (Statics.field2017 == 13) {
                                field647 = 0;
                            }
                        }
                        short var19 = 302;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field648 = class142.field2347;
                            field649 = class142.field2348;
                            field650 = class142.field2219;
                            field647 = 2;
                            field656 = 0;
                        }
                        short var21 = 462;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field647 = 0;
                        }
                    } else if (field647 == 2) {
                        short var22 = 231;
                        int var33 = var22 + 30;
                        if (var13 == 1 && var15 >= var33 - 15 && var15 < var33) {
                            field656 = 0;
                        }
                        var33 += 15;
                        if (var13 == 1 && var15 >= var33 - 15 && var15 < var33) {
                            field656 = 1;
                        }
                        var33 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var24 - 20 && var15 <= var24 + 20) {
                            field651 = field651.trim();
                            if (field651.length() == 0) {
                                Statics.method13(class142.field2258, class142.field2254, class142.field2246);
                                return;
                            }
                            if (field652.length() == 0) {
                                Statics.method13(class142.field2256, class142.field2152, class142.field2313);
                                return;
                            }
                            Statics.method13(class142.field2249, class142.field2255, class142.field2217);
                            field666 = Statics.field1815.field133.containsKey(class199.method550(field651)) ? class144.field2392 : class144.field2394;
                            client.method565(20);
                            return;
                        }
                        short var25 = 462;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var24 - 20 && var15 <= var24 + 20) {
                            field647 = 0;
                            field651 = "";
                            field652 = "";
                            Statics.field506 = 0;
                            Statics.field664 = "";
                            field660 = true;
                        }
                        while (true) {
                            while (class124.method458()) {
                                boolean var26 = false;
                                for (int var27 = 0; var27 < field657.length(); var27++) {
                                    if (Statics.field1334 == field657.charAt(var27)) {
                                        var26 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2017 == 13) {
                                    field647 = 0;
                                    field651 = "";
                                    field652 = "";
                                    Statics.field506 = 0;
                                    Statics.field664 = "";
                                    field660 = true;
                                } else if (field656 == 0) {
                                    if (Statics.field2017 == 85 && field651.length() > 0) {
                                        field651 = field651.substring(0, field651.length() - 1);
                                    }
                                    if (Statics.field2017 == 84 || Statics.field2017 == 80) {
                                        field656 = 1;
                                    }
                                    if (var26 && field651.length() < 320) {
                                        field651 = field651 + Statics.field1334;
                                    }
                                } else if (field656 == 1) {
                                    if (Statics.field2017 == 85 && field652.length() > 0) {
                                        field652 = field652.substring(0, field652.length() - 1);
                                    }
                                    if (Statics.field2017 == 84 || Statics.field2017 == 80) {
                                        field656 = 0;
                                    }
                                    if (Statics.field2017 == 84) {
                                        field651 = field651.trim();
                                        if (field651.length() == 0) {
                                            Statics.method13(class142.field2258, class142.field2254, class142.field2246);
                                            return;
                                        }
                                        if (field652.length() == 0) {
                                            Statics.method13(class142.field2256, class142.field2152, class142.field2313);
                                            return;
                                        }
                                        Statics.method13(class142.field2249, class142.field2255, class142.field2217);
                                        field666 = Statics.field1815.field133.containsKey(class199.method550(field651)) ? class144.field2392 : class144.field2394;
                                        client.method565(20);
                                        return;
                                    }
                                    if (var26 && field652.length() < 20) {
                                        field652 = field652 + Statics.field1334;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field647 == 4) {
                        short var28 = 302;
                        short var29 = 321;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var29 - 20 && var15 <= var29 + 20) {
                            Statics.field664.trim();
                            if (Statics.field664.length() != 6) {
                                Statics.method13(class142.field2169, class142.field2274, class142.field2171);
                                return;
                            }
                            Statics.field506 = Integer.parseInt(Statics.field664);
                            Statics.field664 = "";
                            field666 = field660 ? class144.field2393 : class144.field2395;
                            Statics.method13(class142.field2249, class142.field2255, class142.field2217);
                            client.method565(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= 373 && var14 <= 512 && var15 >= 263 && var15 <= 296) {
                            field660 = !field660;
                        }
                        if (var13 == 1 && var14 >= 348 && var14 <= 416 && var15 >= 351 && var15 <= 363) {
                            class125.method2029(client.method1327("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        short var30 = 462;
                        if (var13 == 1 && var14 >= var30 - 75 && var14 <= var30 + 75 && var15 >= var29 - 20 && var15 <= var29 + 20) {
                            field647 = 0;
                            field651 = "";
                            field652 = "";
                            Statics.field506 = 0;
                            Statics.field664 = "";
                        }
                        while (class124.method458()) {
                            boolean var31 = false;
                            for (int var32 = 0; var32 < field658.length(); var32++) {
                                if (Statics.field1334 == field658.charAt(var32)) {
                                    var31 = true;
                                    break;
                                }
                            }
                            if (Statics.field2017 == 13) {
                                field647 = 0;
                                field651 = "";
                                field652 = "";
                                Statics.field506 = 0;
                                Statics.field664 = "";
                            } else {
                                if (Statics.field2017 == 85 && Statics.field664.length() > 0) {
                                    Statics.field664 = Statics.field664.substring(0, Statics.field664.length() - 1);
                                }
                                if (Statics.field2017 == 84) {
                                    Statics.field664.trim();
                                    if (Statics.field664.length() != 6) {
                                        Statics.method13(class142.field2169, class142.field2274, class142.field2171);
                                        return;
                                    }
                                    Statics.field506 = Integer.parseInt(Statics.field664);
                                    Statics.field664 = "";
                                    field666 = field660 ? class144.field2393 : class144.field2395;
                                    Statics.method13(class142.field2249, class142.field2255, class142.field2217);
                                    client.method565(20);
                                    return;
                                }
                                if (var31 && Statics.field664.length() < 6) {
                                    Statics.field664 = Statics.field664 + Statics.field1334;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field2004 == 1 || !Statics.field776 && class127.field2004 == 4) {
            short var1 = 280;
            if (class127.field1993 >= var1 && class127.field1993 <= var1 + 14 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                method463(0, 0);
            } else if (class127.field1993 >= var1 + 15 && class127.field1993 <= var1 + 80 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                method463(0, 1);
            } else {
                short var2 = 390;
                if (class127.field1993 >= var2 && class127.field1993 <= var2 + 14 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                    method463(1, 0);
                } else if (class127.field1993 >= var2 + 15 && class127.field1993 <= var2 + 80 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                    method463(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field1993 >= var3 && class127.field1993 <= var3 + 14 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                        method463(2, 0);
                    } else if (class127.field1993 >= var3 + 15 && class127.field1993 <= var3 + 80 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                        method463(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field1993 >= var4 && class127.field1993 <= var4 + 14 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                            method463(3, 0);
                        } else if (class127.field1993 >= var4 + 15 && class127.field1993 <= var4 + 80 && class127.field2006 >= 4 && class127.field2006 <= 18) {
                            method463(3, 1);
                        } else if (class127.field1993 >= 708 && class127.field2006 >= 4 && class127.field1993 <= 758 && class127.field2006 <= 20) {
                            field659 = false;
                            Statics.field655.method1408(0, 0);
                            Statics.field2960.method1408(382, 0);
                            Statics.field1874.method1547(382 - Statics.field1874.field1308 / 2, 18);
                        } else if (field646 != -1) {
                            class22 var5 = Statics.field536[field646];
                            method141(var5);
                            field659 = false;
                            Statics.field655.method1408(0, 0);
                            Statics.field2960.method1408(382, 0);
                            Statics.field1874.method1547(382 - Statics.field1874.field1308 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.n(Lgv;Lgv;I)V")
    public static void method27(class193 arg0, class193 arg1) {
        if (field659) {
            Statics.method93(arg0, arg1);
            return;
        }
        if (client.field248 == 0 || client.field248 == 5) {
            byte var2 = 20;
            arg0.method3407(class142.field2289, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1526(230, var3, 304, 34, 9179409);
            class73.method1526(231, var3 + 1, 302, 32, 0);
            class73.method1497(232, var3 + 2, field645 * 3, 30, 9179409);
            class73.method1497(field645 * 3 + 232, var3 + 2, 300 - field645 * 3, 30, 0);
            arg0.method3407(field632, 382, 276 - var2, 16777215, -1);
        }
        if (client.field248 == 20) {
            Statics.field2892.method1547(382 - Statics.field2892.field1308 / 2, 271 - Statics.field2892.field1309 / 2);
            short var4 = 211;
            arg0.method3407(field648, 382, var4, 16776960, 0);
            int var62 = var4 + 15;
            arg0.method3407(field649, 382, var62, 16776960, 0);
            int var63 = var62 + 15;
            arg0.method3407(field650, 382, var63, 16776960, 0);
            int var64 = var63 + 15;
            int var65 = var64 + 10;
            if (field647 != 4) {
                arg0.method3341(class142.field2365, 272, var65, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field651; arg0.method3345(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3341(class192.method3388(var6), 312, var65, 16777215, 0);
                var62 = var65 + 15;
                arg0.method3341(class142.field2380 + class199.method6(field652), 274, var62, 16777215, 0);
                var62 += 15;
            }
        }
        if (client.field248 == 10 || client.field248 == 11) {
            Statics.field2892.method1547(202, 171);
            if (field647 == 0) {
                short var7 = 251;
                arg0.method3407(class142.field2368, 382, var7, 16776960, 0);
                int var66 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field629.method1547(var8 - 73, var9 - 20);
                arg0.method3353(class142.field2257, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field629.method1547(var10 - 73, var9 - 20);
                arg0.method3353(class142.field2262, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field647 == 1) {
                arg0.method3407(class142.field2187, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3407(field648, 382, var11, 16777215, 0);
                int var67 = var11 + 15;
                arg0.method3407(field649, 382, var67, 16777215, 0);
                int var68 = var67 + 15;
                arg0.method3407(field650, 382, var68, 16777215, 0);
                int var69 = var68 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field629.method1547(var12 - 73, var13 - 20);
                arg0.method3407(class142.field2142, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field629.method1547(var14 - 73, var13 - 20);
                arg0.method3407(class142.field2372, var14, var13 + 5, 16777215, 0);
            } else if (field647 == 2) {
                short var15 = 211;
                arg0.method3407(field648, 382, var15, 16776960, 0);
                int var70 = var15 + 15;
                arg0.method3407(field649, 382, var70, 16776960, 0);
                int var71 = var70 + 15;
                arg0.method3407(field650, 382, var71, 16776960, 0);
                int var72 = var71 + 15;
                int var73 = var72 + 10;
                arg0.method3341(class142.field2365, 272, var73, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field651; arg0.method3345(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3341(class192.method3388(var17) + (field656 == 0 & client.field250 % 40 < 20 ? class2.method584(16776960) + class2.field21 : ""), 312, var73, 16777215, 0);
                var70 = var73 + 15;
                arg0.method3341(class142.field2380 + class199.method6(field652) + (field656 == 1 & client.field250 % 40 < 20 ? class2.method584(16776960) + class2.field21 : ""), 274, var70, 16777215, 0);
                var70 += 15;
                short var18 = 302;
                short var19 = 321;
                Statics.field629.method1547(var18 - 73, var19 - 20);
                arg0.method3407(class142.field2197, var18, var19 + 5, 16777215, 0);
                short var20 = 462;
                Statics.field629.method1547(var20 - 73, var19 - 20);
                arg0.method3407(class142.field2372, var20, var19 + 5, 16777215, 0);
            } else if (field647 == 4) {
                arg0.method3407(class142.field2223, 382, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3407(field648, 382, var21, 16777215, 0);
                int var74 = var21 + 15;
                arg0.method3407(field649, 382, var74, 16777215, 0);
                int var75 = var74 + 15;
                arg0.method3407(field650, 382, var75, 16777215, 0);
                int var76 = var75 + 15;
                arg0.method3341(class142.field2367 + class199.method6(Statics.field664) + (client.field250 % 40 < 20 ? class2.method584(16776960) + class2.field21 : ""), 274, var76, 16777215, 0);
                int var77 = var76 - 8;
                arg0.method3341(class142.field2143, 373, var77, 16776960, 0);
                int var78 = var77 + 15;
                arg0.method3341(class142.field2144, 373, var78, 16776960, 0);
                int var22 = 373 + arg0.method3345(class142.field2144) + 15;
                int var23 = var78 - arg0.field2917;
                class74 var24;
                if (field660) {
                    var24 = Statics.field633;
                } else {
                    var24 = Statics.field2894;
                }
                var24.method1547(var22, var23);
                var74 = var78 + 15;
                short var25 = 302;
                short var26 = 321;
                Statics.field629.method1547(var25 - 73, var26 - 20);
                arg0.method3407(class142.field2142, var25, var26 + 5, 16777215, 0);
                short var27 = 462;
                Statics.field629.method1547(var27 - 73, var26 - 20);
                arg0.method3407(class142.field2372, var27, var26 + 5, 16777215, 0);
                arg1.method3407(class142.field2226, 382, var26 + 36, 255, 0);
            }
        }
        if (field643 > 0) {
            int var28 = field643;
            short var29 = 256;
            field641 += var28 * 128;
            if (field641 > Statics.field639.length) {
                field641 -= Statics.field639.length;
                int var30 = (int) (Math.random() * 12.0D);
                method866(Statics.field662[var30]);
            }
            int var31 = 0;
            int var32 = var28 * 128;
            int var33 = (var29 - var28) * 128;
            for (int var34 = 0; var34 < var33; var34++) {
                int var35 = Statics.field226[var31 + var32] - Statics.field639[field641 + var31 & Statics.field639.length - 1] * var28 / 6;
                if (var35 < 0) {
                    var35 = 0;
                }
                Statics.field226[var31++] = var35;
            }
            for (int var36 = var29 - var28; var36 < var29; var36++) {
                int var37 = var36 * 128;
                for (int var38 = 0; var38 < 128; var38++) {
                    int var39 = (int) (Math.random() * 100.0D);
                    if (var39 < 50 && var38 > 10 && var38 < 118) {
                        Statics.field226[var37 + var38] = 255;
                    } else {
                        Statics.field226[var37 + var38] = 0;
                    }
                }
            }
            if (field637 > 0) {
                field637 -= var28 * 4;
            }
            if (field638 > 0) {
                field638 -= var28 * 4;
            }
            if (field637 == 0 && field638 == 0) {
                int var40 = (int) (Math.random() * (double) (2000 / var28));
                if (var40 == 0) {
                    field637 = 1024;
                }
                if (var40 == 1) {
                    field638 = 1024;
                }
            }
            for (int var41 = 0; var41 < var29 - var28; var41++) {
                field635[var41] = field635[var28 + var41];
            }
            for (int var42 = var29 - var28; var42 < var29; var42++) {
                field635[var42] = (int) (Math.sin((double) field644 / 14.0D) * 16.0D + Math.sin((double) field644 / 15.0D) * 14.0D + Math.sin((double) field644 / 16.0D) * 12.0D);
                field644++;
            }
            field654 += var28 * 2119994461;
            int var43 = ((client.field250 & 0x1) + var28) / 2;
            if (var43 > 0) {
                for (int var44 = 0; var44 < field654 * -559572044; var44++) {
                    int var45 = (int) (Math.random() * 124.0D) + 2;
                    int var46 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field226[(var46 << 7) + var45] = 192;
                }
                field654 = 0;
                int var47 = 0;
                label207: while (true) {
                    if (var47 >= var29) {
                        int var51 = 0;
                        while (true) {
                            if (var51 >= 128) {
                                break label207;
                            }
                            int var52 = 0;
                            for (int var53 = -var43; var53 < var29; var53++) {
                                int var54 = var53 * 128;
                                if (var43 + var53 < var29) {
                                    var52 += Statics.field640[var43 * 128 + var51 + var54];
                                }
                                if (var53 - (var43 + 1) >= 0) {
                                    var52 -= Statics.field640[var51 + var54 - (var43 + 1) * 128];
                                }
                                if (var53 >= 0) {
                                    Statics.field226[var51 + var54] = var52 / (var43 * 2 + 1);
                                }
                            }
                            var51++;
                        }
                    }
                    int var48 = 0;
                    int var49 = var47 * 128;
                    for (int var50 = -var43; var50 < 128; var50++) {
                        if (var43 + var50 < 128) {
                            var48 += Statics.field226[var49 + var50 + var43];
                        }
                        if (var50 - (var43 + 1) >= 0) {
                            var48 -= Statics.field226[var49 + var50 - (var43 + 1)];
                        }
                        if (var50 >= 0) {
                            Statics.field640[var49 + var50] = var48 / (var43 * 2 + 1);
                        }
                    }
                    var47++;
                }
            }
            field643 = 0;
        }
        method172();
        Statics.field1919[Statics.field1815.field137 ? 1 : 0].method1547(725, 463);
        if (client.field248 > 5 && client.field247 == 0) {
            if (Statics.field523 == null) {
                Statics.field523 = class70.method506(Statics.field2441, "sl_button", "");
            } else {
                byte var55 = 5;
                short var56 = 463;
                byte var57 = 100;
                byte var58 = 35;
                Statics.field523.method1547(var55, var56);
                arg0.method3407(class142.field2301 + " " + client.field241, var57 / 2 + var55, var58 / 2 + var56 - 2, 16777215, 0);
                if (Statics.field2104 == null) {
                    arg1.method3407(class142.field2383, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                } else {
                    arg1.method3407(class142.field2382, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var59 = Statics.field510.getGraphics();
            Statics.field1333.method1330(var59, 0, 0);
        } catch (Exception var61) {
            Statics.field510.repaint();
        }
    }

    @ObfuscatedName("aj.z(Lbj;B)V")
    public static final void method866(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field639.length; var2++) {
            Statics.field639[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field639[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field224[var8] = (Statics.field639[var8 - 1] + Statics.field639[var8 + 1] + Statics.field639[var8 - 128] + Statics.field639[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field639;
            Statics.field639 = Statics.field224;
            Statics.field224 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1309; var11++) {
            for (int var12 = 0; var12 < arg0.field1308; var12++) {
                if (arg0.field1311[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1310;
                    int var14 = var11 + 16 + arg0.field1307;
                    int var15 = (var14 << 7) + var13;
                    Statics.field639[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("af.j(IIIS)I")
    public static final int method549(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("x.u(I)V")
    public static final void method172() {
        short var0 = 256;
        if (field637 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field637 > 768) {
                    Statics.field678[var1] = method549(Statics.field2937[var1], Statics.field2510[var1], 1024 - field637);
                } else if (field637 > 256) {
                    Statics.field678[var1] = Statics.field2510[var1];
                } else {
                    Statics.field678[var1] = method549(Statics.field2510[var1], Statics.field2937[var1], 256 - field637);
                }
            }
        } else if (field638 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field638 > 768) {
                    Statics.field678[var2] = method549(Statics.field2937[var2], Statics.field636[var2], 1024 - field638);
                } else if (field638 > 256) {
                    Statics.field678[var2] = Statics.field636[var2];
                } else {
                    Statics.field678[var2] = method549(Statics.field636[var2], Statics.field2937[var2], 256 - field638);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field678[var3] = Statics.field2937[var3];
            }
        }
        class73.method1531(0, 9, 128, var0 + 7);
        Statics.field655.method1408(0, 0);
        class73.method1490();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field635[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field226[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field678[var10];
                    int var14 = Statics.field1333.field1281[var5];
                    Statics.field1333.field1281[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1531(637, 9, 765, var0 + 7);
        Statics.field2960.method1408(382, 0);
        class73.method1490();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field635[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field226[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field678[var22];
                    int var26 = Statics.field1333.field1281[var20];
                    Statics.field1333.field1281[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("c.a(Lb;B)V")
    public static void method141(class22 arg0) {
        if (arg0.method479() != client.field245) {
            client.field245 = arg0.method479();
            boolean var1 = arg0.method479();
            if (Statics.field998 != var1) {
                class45.field999.method3171();
                class45.field1000.method3171();
                class45.field1011.method3171();
                Statics.field998 = var1;
            }
        }
        Statics.field928 = arg0.field566;
        client.field241 = arg0.field563;
        client.field242 = arg0.field565;
        Statics.field1567 = client.field244 == 0 ? 43594 : arg0.field563 + 40000;
        Statics.field2102 = client.field244 == 0 ? 443 : arg0.field563 + 50000;
        Statics.field623 = Statics.field1567;
    }

    @ObfuscatedName("di.c(I)V")
    public static void method2429() {
        try {
            if (Statics.field2104 == null) {
                Statics.field2104 = new class17(Statics.field2036, new URL(Statics.field2922));
            } else {
                byte[] var0 = Statics.field2104.method169();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field669 = var1.method2103();
                    Statics.field536 = new class22[field669];
                    int var2 = 0;
                    while (var2 < field669) {
                        class22 var3 = Statics.field536[var2] = new class22();
                        var3.field563 = var1.method2103();
                        var3.field565 = var1.method2106();
                        var3.field566 = var1.method2109();
                        var3.field567 = var1.method2109();
                        var3.field568 = var1.method2101();
                        var3.field564 = var1.method2104();
                        var3.field569 = var2++;
                    }
                    method2341(Statics.field536, 0, Statics.field536.length - 1, field667, field663);
                    field659 = true;
                    Statics.field2104 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2104 = null;
        }
    }

    @ObfuscatedName("y.w(III)V")
    public static void method463(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field667[var5] != arg0) {
                var2[var4] = field667[var5];
                var3[var4] = field663[var5];
                var4++;
            }
        }
        field667 = var2;
        field663 = var3;
        method2341(Statics.field536, 0, Statics.field536.length - 1, field667, field663);
    }

    @ObfuscatedName("da.l([Lb;II[I[II)V")
    public static void method2341(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field564;
                        var12 = var8.field564;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method479() ? 1 : 0;
                        var12 = var8.method479() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field563;
                        var12 = var8.field563;
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
                        var15 = arg0[var5].field564;
                        var16 = var8.field564;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method479() ? 1 : 0;
                        var16 = var8.method479() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field563;
                        var16 = var8.field563;
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
        method2341(arg0, arg1, var6, arg3, arg4);
        method2341(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
