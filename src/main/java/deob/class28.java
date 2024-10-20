package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ao")
public class class28 {

    @ObfuscatedName("ao.l")
    public static int[] field631 = new int[256];

    @ObfuscatedName("ao.e")
    public static int field613 = 0;

    @ObfuscatedName("ao.v")
    public static int field625 = 0;

    @ObfuscatedName("ao.aq")
    public static int field617 = 0;

    @ObfuscatedName("ao.ao")
    public static int field628 = 0;

    @ObfuscatedName("ao.af")
    public static int field629 = 0;

    @ObfuscatedName("ao.ag")
    public static int field632 = 0;

    @ObfuscatedName("ao.ad")
    public static int field652 = 10;

    @ObfuscatedName("ao.ak")
    public static String field642 = "";

    @ObfuscatedName("ao.aj")
    public static int field633 = 0;

    @ObfuscatedName("ao.as")
    public static String field634 = "";

    @ObfuscatedName("ao.al")
    public static String field635 = "";

    @ObfuscatedName("ao.ai")
    public static String field636 = "";

    @ObfuscatedName("ao.az")
    public static String field620 = "";

    @ObfuscatedName("ao.aw")
    public static String field615 = "";

    @ObfuscatedName("ao.ay")
    public static class144 field648 = class144.field2390;

    @ObfuscatedName("ao.ap")
    public static boolean field640 = true;

    @ObfuscatedName("ao.an")
    public static int field641 = 0;

    @ObfuscatedName("ao.ae")
    public static String field638 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ao.aa")
    public static String field643 = "1234567890";

    @ObfuscatedName("ao.am")
    public static boolean field644 = false;

    @ObfuscatedName("ao.bg")
    public static int field646 = 0;

    @ObfuscatedName("ao.bq")
    public static int[] field647 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ao.bu")
    public static int[] field619 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ao.bo")
    public static int field649 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.z(Ler;Ler;I)I")
    public static int method624(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2723("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2723("logo", "")) {
            var2++;
        }
        if (arg1.method2723("titlebox", "")) {
            var2++;
        }
        if (arg1.method2723("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2723("runes", "")) {
            var2++;
        }
        if (arg1.method2723("title_mute", "")) {
            var2++;
        }
        if (arg1.method2711("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2711("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2723("sl_back", "");
        arg1.method2723("sl_flags", "");
        arg1.method2723("sl_arrows", "");
        arg1.method2723("sl_stars", "");
        arg1.method2723("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ag.j(Ljava/awt/Component;Ler;Ler;ZIB)V")
    public static void method569(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        field633 = arg4;
        if (Statics.field621) {
            return;
        }
        class73.method1506();
        byte[] var5 = arg1.method2722("title.jpg", "");
        Statics.field66 = new class72(var5, arg0);
        Statics.field624 = Statics.field66.method1411();
        Statics.field618 = class70.method1857(arg2, "logo", "");
        Statics.field614 = class70.method1857(arg2, "titlebox", "");
        Statics.field623 = class70.method1857(arg2, "titlebutton", "");
        Statics.field616 = class70.method1320(arg2, "runes", "");
        Statics.field512 = class70.method1320(arg2, "title_mute", "");
        Statics.field639 = class70.method1857(arg2, "options_radio_buttons,0", "");
        Statics.field627 = class70.method1857(arg2, "options_radio_buttons,2", "");
        Statics.field1904 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field1904[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field1904[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1904[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1904[var9 + 192] = 16777215;
        }
        Statics.field166 = new int[256];
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field166[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field166[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field166[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field166[var13 + 192] = 16777215;
        }
        Statics.field2872 = new int[256];
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field2872[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field2872[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            Statics.field2872[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            Statics.field2872[var17 + 192] = 16777215;
        }
        Statics.field59 = new int[256];
        Statics.field626 = new int[32768];
        Statics.field1531 = new int[32768];
        method155((class74) null);
        Statics.field1325 = new int[32768];
        Statics.field929 = new int[32768];
        if (arg3) {
            field620 = "";
            field615 = "";
        }
        Statics.field2682 = 0;
        Statics.field1641 = "";
        field640 = true;
        field644 = false;
        if (Statics.field57.field141) {
            class161.method156(2);
        } else {
            class161.method2423(2, Statics.field2706, "scape main", "", 255, false);
        }
        class150.method2500(false);
        Statics.field621 = true;
        Statics.field66.method1420(0, 0);
        Statics.field624.method1420(382, 0);
        Statics.field618.method1581(382 - Statics.field618.field1298 / 2, 18);
    }

    @ObfuscatedName("c.a(Lev;B)V")
    public static void method153(class131 arg0) {
        if (!field644) {
            if ((class127.field1996 == 1 || !Statics.field2015 && class127.field1996 == 4) && class127.field1995 >= 715 && class127.field2002 >= 453) {
                Statics.field57.field141 = !Statics.field57.field141;
                class9.method1408();
                if (Statics.field57.field141) {
                    class161.method2880();
                } else {
                    class161.method1773(Statics.field2706, "scape main", "", 255, false);
                }
            }
            if (client.field252 != 5) {
                field629++;
                if (client.field252 == 10 || client.field252 == 11) {
                    if (client.field283 == 0) {
                        if (class127.field1996 == 1 || !Statics.field2015 && class127.field1996 == 4) {
                            byte var6 = 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class127.field1995 >= var6 && class127.field1995 <= var6 + var8 && class127.field2002 >= var7 && class127.field2002 <= var7 + var9) {
                                Statics.method2670();
                                return;
                            }
                        }
                        if (Statics.field645 != null) {
                            Statics.method2670();
                        }
                    }
                    int var10 = class127.field1996;
                    int var11 = class127.field1995;
                    int var12 = class127.field2002;
                    if (!Statics.field2015 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field633 == 0) {
                        short var13 = 302;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class125.method29(client.method465("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        short var15 = 462;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field246 & 0x4) != 0) {
                                if ((client.field246 & 0x400) == 0) {
                                    field634 = class142.field2160;
                                    field635 = class142.field2347;
                                    field636 = class142.field2355;
                                } else {
                                    field634 = class142.field2352;
                                    field635 = class142.field2353;
                                    field636 = class142.field2354;
                                }
                                field633 = 1;
                                field641 = 0;
                            } else if ((client.field246 & 0x400) == 0) {
                                field634 = class142.field2342;
                                field635 = class142.field2343;
                                field636 = class142.field2232;
                                field633 = 2;
                                field641 = 0;
                            } else {
                                field634 = class142.field2349;
                                field635 = class142.field2350;
                                field636 = class142.field2351;
                                field633 = 1;
                                field641 = 0;
                            }
                        }
                    } else if (field633 == 1) {
                        while (class124.method90()) {
                            if (Statics.field1425 == 84) {
                                field634 = class142.field2342;
                                field635 = class142.field2343;
                                field636 = class142.field2232;
                                field633 = 2;
                                field641 = 0;
                            } else if (Statics.field1425 == 13) {
                                field633 = 0;
                            }
                        }
                        short var16 = 302;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field634 = class142.field2342;
                            field635 = class142.field2343;
                            field636 = class142.field2232;
                            field633 = 2;
                            field641 = 0;
                        }
                        short var18 = 462;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field633 = 0;
                        }
                    } else if (field633 == 2) {
                        short var19 = 231;
                        int var30 = var19 + 30;
                        if (var10 == 1 && var12 >= var30 - 15 && var12 < var30) {
                            field641 = 0;
                        }
                        var30 += 15;
                        if (var10 == 1 && var12 >= var30 - 15 && var12 < var30) {
                            field641 = 1;
                        }
                        var30 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field620 = field620.trim();
                            if (field620.length() == 0) {
                                method100(class142.field2367, class142.field2329, class142.field2250);
                                return;
                            }
                            if (field615.length() == 0) {
                                method100(class142.field2275, class142.field2252, class142.field2253);
                                return;
                            }
                            method100(class142.field2357, class142.field2358, class142.field2359);
                            field648 = Statics.field57.field139.containsKey(class197.method3520(field620)) ? class144.field2388 : class144.field2390;
                            client.method2683(20);
                            return;
                        }
                        short var22 = 462;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field633 = 0;
                            field620 = "";
                            field615 = "";
                            Statics.field2682 = 0;
                            Statics.field1641 = "";
                            field640 = true;
                        }
                        while (true) {
                            while (class124.method90()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field638.length(); var24++) {
                                    if (Statics.field1026 == field638.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1425 == 13) {
                                    field633 = 0;
                                    field620 = "";
                                    field615 = "";
                                    Statics.field2682 = 0;
                                    Statics.field1641 = "";
                                    field640 = true;
                                } else if (field641 == 0) {
                                    if (Statics.field1425 == 85 && field620.length() > 0) {
                                        field620 = field620.substring(0, field620.length() - 1);
                                    }
                                    if (Statics.field1425 == 84 || Statics.field1425 == 80) {
                                        field641 = 1;
                                    }
                                    if (var23 && field620.length() < 320) {
                                        field620 = field620 + Statics.field1026;
                                    }
                                } else if (field641 == 1) {
                                    if (Statics.field1425 == 85 && field615.length() > 0) {
                                        field615 = field615.substring(0, field615.length() - 1);
                                    }
                                    if (Statics.field1425 == 84 || Statics.field1425 == 80) {
                                        field641 = 0;
                                    }
                                    if (Statics.field1425 == 84) {
                                        field620 = field620.trim();
                                        if (field620.length() == 0) {
                                            method100(class142.field2367, class142.field2329, class142.field2250);
                                            return;
                                        }
                                        if (field615.length() == 0) {
                                            method100(class142.field2275, class142.field2252, class142.field2253);
                                            return;
                                        }
                                        method100(class142.field2357, class142.field2358, class142.field2359);
                                        field648 = Statics.field57.field139.containsKey(class197.method3520(field620)) ? class144.field2388 : class144.field2390;
                                        client.method2683(20);
                                        return;
                                    }
                                    if (var23 && field615.length() < 20) {
                                        field615 = field615 + Statics.field1026;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field633 == 4) {
                        short var25 = 302;
                        short var26 = 321;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                            Statics.field1641.trim();
                            if (Statics.field1641.length() != 6) {
                                method100(class142.field2164, class142.field2165, class142.field2166);
                                return;
                            }
                            Statics.field2682 = Integer.parseInt(Statics.field1641);
                            Statics.field1641 = "";
                            field648 = field640 ? class144.field2397 : class144.field2391;
                            method100(class142.field2357, class142.field2358, class142.field2359);
                            client.method2683(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= 373 && var11 <= 512 && var12 >= 263 && var12 <= 296) {
                            field640 = !field640;
                        }
                        if (var10 == 1 && var11 >= 348 && var11 <= 416 && var12 >= 351 && var12 <= 363) {
                            class125.method29(client.method465("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        short var27 = 462;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                            field633 = 0;
                            field620 = "";
                            field615 = "";
                            Statics.field2682 = 0;
                            Statics.field1641 = "";
                        }
                        while (class124.method90()) {
                            boolean var28 = false;
                            for (int var29 = 0; var29 < field643.length(); var29++) {
                                if (Statics.field1026 == field643.charAt(var29)) {
                                    var28 = true;
                                    break;
                                }
                            }
                            if (Statics.field1425 == 13) {
                                field633 = 0;
                                field620 = "";
                                field615 = "";
                                Statics.field2682 = 0;
                                Statics.field1641 = "";
                            } else {
                                if (Statics.field1425 == 85 && Statics.field1641.length() > 0) {
                                    Statics.field1641 = Statics.field1641.substring(0, Statics.field1641.length() - 1);
                                }
                                if (Statics.field1425 == 84) {
                                    Statics.field1641.trim();
                                    if (Statics.field1641.length() != 6) {
                                        method100(class142.field2164, class142.field2165, class142.field2166);
                                        return;
                                    }
                                    Statics.field2682 = Integer.parseInt(Statics.field1641);
                                    Statics.field1641 = "";
                                    field648 = field640 ? class144.field2397 : class144.field2391;
                                    method100(class142.field2357, class142.field2358, class142.field2359);
                                    client.method2683(20);
                                    return;
                                }
                                if (var28 && Statics.field1641.length() < 6) {
                                    Statics.field1641 = Statics.field1641 + Statics.field1026;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field1996 == 1 || !Statics.field2015 && class127.field1996 == 4) {
            short var1 = 280;
            if (class127.field1995 >= var1 && class127.field1995 <= var1 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                method116(0, 0);
            } else if (class127.field1995 >= var1 + 15 && class127.field1995 <= var1 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                method116(0, 1);
            } else {
                short var2 = 390;
                if (class127.field1995 >= var2 && class127.field1995 <= var2 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                    method116(1, 0);
                } else if (class127.field1995 >= var2 + 15 && class127.field1995 <= var2 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                    method116(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field1995 >= var3 && class127.field1995 <= var3 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                        method116(2, 0);
                    } else if (class127.field1995 >= var3 + 15 && class127.field1995 <= var3 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                        method116(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field1995 >= var4 && class127.field1995 <= var4 + 14 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                            method116(3, 0);
                        } else if (class127.field1995 >= var4 + 15 && class127.field1995 <= var4 + 80 && class127.field2002 >= 4 && class127.field2002 <= 18) {
                            method116(3, 1);
                        } else if (class127.field1995 >= 708 && class127.field2002 >= 4 && class127.field1995 <= 758 && class127.field2002 <= 20) {
                            field644 = false;
                            Statics.field66.method1420(0, 0);
                            Statics.field624.method1420(382, 0);
                            Statics.field618.method1581(382 - Statics.field618.field1298 / 2, 18);
                        } else if (field649 != -1) {
                            class22 var5 = Statics.field1064[field649];
                            method148(var5);
                            field644 = false;
                            Statics.field66.method1420(0, 0);
                            Statics.field624.method1420(382, 0);
                            Statics.field618.method1581(382 - Statics.field618.field1298 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.y(Lge;Lge;I)V")
    public static void method1400(class191 arg0, class191 arg1) {
        if (field644) {
            method2942(arg0, arg1);
            return;
        }
        if (client.field252 == 0 || client.field252 == 5) {
            byte var2 = 20;
            arg0.method3429(class142.field2364, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1510(230, var3, 304, 34, 9179409);
            class73.method1510(231, var3 + 1, 302, 32, 0);
            class73.method1508(232, var3 + 2, field652 * 3, 30, 9179409);
            class73.method1508(field652 * 3 + 232, var3 + 2, 300 - field652 * 3, 30, 0);
            arg0.method3429(field642, 382, 276 - var2, 16777215, -1);
        }
        if (client.field252 == 20) {
            Statics.field614.method1581(382 - Statics.field614.field1298 / 2, 271 - Statics.field614.field1299 / 2);
            short var4 = 211;
            arg0.method3429(field634, 382, var4, 16776960, 0);
            int var47 = var4 + 15;
            arg0.method3429(field635, 382, var47, 16776960, 0);
            int var48 = var47 + 15;
            arg0.method3429(field636, 382, var48, 16776960, 0);
            int var49 = var48 + 15;
            int var50 = var49 + 10;
            if (field633 != 4) {
                arg0.method3352(class142.field2285, 272, var50, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field620; arg0.method3345(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3352(class190.method3367(var6), 312, var50, 16777215, 0);
                var47 = var50 + 15;
                String var8 = class142.field2361;
                String var9 = field615;
                String var10 = class197.method2478('*', var9.length());
                arg0.method3352(var8 + var10, 274, var47, 16777215, 0);
                var47 += 15;
            }
        }
        if (client.field252 == 10 || client.field252 == 11) {
            Statics.field614.method1581(202, 171);
            if (field633 == 0) {
                short var11 = 251;
                arg0.method3429(class142.field2219, 382, var11, 16776960, 0);
                int var51 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field623.method1581(var12 - 73, var13 - 20);
                arg0.method3421(class142.field2153, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field623.method1581(var14 - 73, var13 - 20);
                arg0.method3421(class142.field2239, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field633 == 1) {
                arg0.method3429(class142.field2242, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3429(field634, 382, var15, 16777215, 0);
                int var52 = var15 + 15;
                arg0.method3429(field635, 382, var52, 16777215, 0);
                int var53 = var52 + 15;
                arg0.method3429(field636, 382, var53, 16777215, 0);
                int var54 = var53 + 15;
                short var16 = 302;
                short var17 = 321;
                Statics.field623.method1581(var16 - 73, var17 - 20);
                arg0.method3429(class142.field2137, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                Statics.field623.method1581(var18 - 73, var17 - 20);
                arg0.method3429(class142.field2341, var18, var17 + 5, 16777215, 0);
            } else if (field633 == 2) {
                short var19 = 211;
                arg0.method3429(field634, 382, var19, 16776960, 0);
                int var55 = var19 + 15;
                arg0.method3429(field635, 382, var55, 16776960, 0);
                int var56 = var55 + 15;
                arg0.method3429(field636, 382, var56, 16776960, 0);
                int var57 = var56 + 15;
                int var58 = var57 + 10;
                arg0.method3352(class142.field2285, 272, var58, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = field620; arg0.method3345(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3352(class190.method3367(var21) + (field641 == 0 & client.field386 % 40 < 20 ? class2.method2(16776960) + class2.field23 : ""), 312, var58, 16777215, 0);
                var55 = var58 + 15;
                String var23 = class142.field2361;
                String var24 = field615;
                String var25 = class197.method2478('*', var24.length());
                arg0.method3352(var23 + var25 + (field641 == 1 & client.field386 % 40 < 20 ? class2.method2(16776960) + class2.field23 : ""), 274, var55, 16777215, 0);
                var55 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field623.method1581(var26 - 73, var27 - 20);
                arg0.method3429(class142.field2159, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field623.method1581(var28 - 73, var27 - 20);
                arg0.method3429(class142.field2341, var28, var27 + 5, 16777215, 0);
            } else if (field633 == 4) {
                arg0.method3429(class142.field2202, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3429(field634, 382, var29, 16777215, 0);
                int var59 = var29 + 15;
                arg0.method3429(field635, 382, var59, 16777215, 0);
                int var60 = var59 + 15;
                arg0.method3429(field636, 382, var60, 16777215, 0);
                int var61 = var60 + 15;
                String var31 = class142.field2325;
                String var32 = Statics.field1641;
                String var33 = class197.method2478('*', var32.length());
                arg0.method3352(var31 + var33 + (client.field386 % 40 < 20 ? class2.method2(16776960) + class2.field23 : ""), 274, var61, 16777215, 0);
                int var62 = var61 - 8;
                arg0.method3352(class142.field2138, 373, var62, 16776960, 0);
                int var63 = var62 + 15;
                arg0.method3352(class142.field2139, 373, var63, 16776960, 0);
                int var34 = 373 + arg0.method3345(class142.field2139) + 15;
                int var35 = var63 - arg0.field2894;
                class74 var36;
                if (field640) {
                    var36 = Statics.field627;
                } else {
                    var36 = Statics.field639;
                }
                var36.method1581(var34, var35);
                var59 = var63 + 15;
                short var37 = 302;
                short var38 = 321;
                Statics.field623.method1581(var37 - 73, var38 - 20);
                arg0.method3429(class142.field2137, var37, var38 + 5, 16777215, 0);
                short var39 = 462;
                Statics.field623.method1581(var39 - 73, var38 - 20);
                arg0.method3429(class142.field2341, var39, var38 + 5, 16777215, 0);
                arg1.method3429(class142.field2356, 382, var38 + 36, 255, 0);
            }
        }
        if (field629 > 0) {
            method528(field629);
            field629 = 0;
        }
        Statics.method513();
        Statics.field512[Statics.field57.field141 ? 1 : 0].method1581(725, 463);
        if (client.field252 > 5 && client.field283 == 0) {
            if (Statics.field560 == null) {
                Statics.field560 = class70.method1857(Statics.field906, "sl_button", "");
            } else {
                byte var40 = 5;
                short var41 = 463;
                byte var42 = 100;
                byte var43 = 35;
                Statics.field560.method1581(var40, var41);
                arg0.method3429(class142.field2331 + " " + client.field245, var42 / 2 + var40, var43 / 2 + var41 - 2, 16777215, 0);
                if (Statics.field645 == null) {
                    arg1.method3429(class142.field2378, var42 / 2 + var40, var43 / 2 + var41 + 12, 16777215, 0);
                } else {
                    arg1.method3429(class142.field2377, var42 / 2 + var40, var43 / 2 + var41 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var44 = Statics.field2676.getGraphics();
            Statics.field1631.method1325(var44, 0, 0);
        } catch (Exception var46) {
            Statics.field2676.repaint();
        }
    }

    @ObfuscatedName("p.i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method100(String arg0, String arg1, String arg2) {
        field634 = arg0;
        field635 = arg1;
        field636 = arg2;
    }

    @ObfuscatedName("c.b(Lbj;I)V")
    public static final void method155(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field626.length; var2++) {
            Statics.field626[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field626[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1531[var8] = (Statics.field626[var8 - 1] + Statics.field626[var8 + 1] + Statics.field626[var8 - 128] + Statics.field626[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field626;
            Statics.field626 = Statics.field1531;
            Statics.field1531 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1299; var11++) {
            for (int var12 = 0; var12 < arg0.field1298; var12++) {
                if (arg0.field1297[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1300;
                    int var14 = var11 + 16 + arg0.field1296;
                    int var15 = (var14 << 7) + var13;
                    Statics.field626[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("aq.s(IB)V")
    public static final void method528(int arg0) {
        short var1 = 256;
        field617 += arg0 * 128;
        if (field617 > Statics.field626.length) {
            field617 -= Statics.field626.length;
            int var2 = (int) (Math.random() * 12.0D);
            method155(Statics.field616[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1325[var3 + var4] - Statics.field626[field617 + var3 & Statics.field626.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1325[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1325[var9 + var10] = 255;
                } else {
                    Statics.field1325[var9 + var10] = 0;
                }
            }
        }
        if (field613 > 0) {
            field613 -= arg0 * 4;
        }
        if (field625 > 0) {
            field625 -= arg0 * 4;
        }
        if (field613 == 0 && field625 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field613 = 1024;
            }
            if (var12 == 1) {
                field625 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field631[var13] = field631[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field631[var14] = (int) (Math.sin((double) field632 / 14.0D) * 16.0D + Math.sin((double) field632 / 15.0D) * 14.0D + Math.sin((double) field632 / 16.0D) * 12.0D);
            field632++;
        }
        field628 += arg0 * -1653003301;
        int var15 = ((client.field386 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field628 * 1025278060; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1325[(var18 << 7) + var17] = 192;
        }
        field628 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1325[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1325[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field929[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field929[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field929[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1325[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("x.q(IIII)I")
    public static final int method462(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fg.h(Lge;Lge;B)V")
    public static void method2942(class191 arg0, class191 arg1) {
        if (Statics.field2861 == null) {
            Statics.field2861 = class70.method2576(Statics.field906, "sl_back", "");
        }
        if (Statics.field2509 == null) {
            Statics.field2509 = class70.method1320(Statics.field906, "sl_flags", "");
        }
        if (Statics.field926 == null) {
            Statics.field926 = class70.method1320(Statics.field906, "sl_arrows", "");
        }
        if (Statics.field90 == null) {
            Statics.field90 = class70.method1320(Statics.field906, "sl_stars", "");
        }
        class73.method1508(0, 23, 765, 480, 0);
        class73.method1553(0, 0, 125, 23, 12425273, 9135624);
        class73.method1553(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3429(class142.field2151, 62, 15, 0, -1);
        if (Statics.field90 != null) {
            Statics.field90[1].method1581(140, 1);
            arg1.method3352(class142.field2318, 152, 10, 16777215, -1);
            Statics.field90[0].method1581(140, 12);
            arg1.method3352(class142.field2370, 152, 21, 16777215, -1);
        }
        if (Statics.field926 != null) {
            short var2 = 280;
            if (field647[0] == 0 && field619[0] == 0) {
                Statics.field926[2].method1581(var2, 4);
            } else {
                Statics.field926[0].method1581(var2, 4);
            }
            if (field647[0] == 0 && field619[0] == 1) {
                Statics.field926[3].method1581(var2 + 15, 4);
            } else {
                Statics.field926[1].method1581(var2 + 15, 4);
            }
            arg0.method3352(class142.field2371, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field647[0] == 1 && field619[0] == 0) {
                Statics.field926[2].method1581(var3, 4);
            } else {
                Statics.field926[0].method1581(var3, 4);
            }
            if (field647[0] == 1 && field619[0] == 1) {
                Statics.field926[3].method1581(var3 + 15, 4);
            } else {
                Statics.field926[1].method1581(var3 + 15, 4);
            }
            arg0.method3352(class142.field2273, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field647[0] == 2 && field619[0] == 0) {
                Statics.field926[2].method1581(var4, 4);
            } else {
                Statics.field926[0].method1581(var4, 4);
            }
            if (field647[0] == 2 && field619[0] == 1) {
                Statics.field926[3].method1581(var4 + 15, 4);
            } else {
                Statics.field926[1].method1581(var4 + 15, 4);
            }
            arg0.method3352(class142.field2373, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field647[0] == 3 && field619[0] == 0) {
                Statics.field926[2].method1581(var5, 4);
            } else {
                Statics.field926[0].method1581(var5, 4);
            }
            if (field647[0] == 3 && field619[0] == 1) {
                Statics.field926[3].method1581(var5 + 15, 4);
            } else {
                Statics.field926[1].method1581(var5 + 15, 4);
            }
            arg0.method3352(class142.field2148, var5 + 32, 17, 16777215, -1);
        }
        class73.method1508(708, 4, 50, 16, 0);
        arg1.method3429(class142.field2341, 733, 16, 16777215, -1);
        field649 = -1;
        if (Statics.field2861 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field646) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field646) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field646) {
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
            for (int var20 = 0; var20 < field646; var20++) {
                class22 var21 = Statics.field1064[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field552);
                if (var21.field552 == -1) {
                    var23 = class142.field2375;
                    var22 = false;
                } else if (var21.field552 > 1980) {
                    var23 = class142.field2208;
                    var22 = false;
                }
                byte var24;
                if (var21.method486()) {
                    if (var21.method490()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method490()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field1988 >= var17 && class127.field1989 * -632739763 >= var16 && class127.field1988 < var6 + var17 && class127.field1989 * -632739763 < var7 + var16 && var22) {
                    field649 = var20;
                    Statics.field2861[var24].method1436(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2861[var24].method1420(var17, var16);
                }
                if (Statics.field2509 != null) {
                    Statics.field2509[(var21.method490() ? 8 : 0) + var21.field550].method1581(var17 + 29, var16);
                }
                arg0.method3429(Integer.toString(var21.field558), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3429(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3345(Statics.field1064[field649].field554) + 6;
                int var26 = arg1.field2894 + 8;
                class73.method1508(class127.field1988 - var25 / 2, class127.field1989 * -632739763 + 20 + 5, var25, var26, 16777120);
                class73.method1510(class127.field1988 - var25 / 2, class127.field1989 * -632739763 + 20 + 5, var25, var26, 0);
                arg1.method3429(Statics.field1064[field649].field554, class127.field1988, class127.field1989 * -632739763 + 20 + 5 + arg1.field2894 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2676.getGraphics();
            Statics.field1631.method1325(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2676.repaint();
        }
    }

    @ObfuscatedName("u.r(Lv;I)V")
    public static void method148(class22 arg0) {
        if (arg0.method490() != client.field249) {
            client.field249 = arg0.method490();
            class45.method529(arg0.method490());
        }
        Statics.field1742 = arg0.field553;
        client.field245 = arg0.field558;
        client.field246 = arg0.field557;
        Statics.field1235 = client.field248 == 0 ? 43594 : arg0.field558 + 40000;
        Statics.field202 = client.field248 == 0 ? 443 : arg0.field558 + 50000;
        Statics.field2489 = Statics.field1235;
    }

    @ObfuscatedName("h.f(III)V")
    public static void method116(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field647[var5] != arg0) {
                var2[var4] = field647[var5];
                var3[var4] = field619[var5];
                var4++;
            }
        }
        field647 = var2;
        field619 = var3;
        method122(Statics.field1064, 0, Statics.field1064.length - 1, field647, field619);
    }

    @ObfuscatedName("o.u([Lv;II[I[IB)V")
    public static void method122(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field556;
                        var12 = var8.field556;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field552;
                        var12 = var8.field552;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method490() ? 1 : 0;
                        var12 = var8.method490() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field558;
                        var12 = var8.field558;
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
                        var15 = arg0[var5].field556;
                        var16 = var8.field556;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field552;
                        var16 = var8.field552;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method490() ? 1 : 0;
                        var16 = var8.method490() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field558;
                        var16 = var8.field558;
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
        method122(arg0, arg1, var6, arg3, arg4);
        method122(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
