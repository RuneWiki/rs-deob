package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ab")
public class class42 {

    @ObfuscatedName("ab.g")
    public static int field819 = 0;

    @ObfuscatedName("ab.i")
    public static int field834 = field819 + 202;

    @ObfuscatedName("ab.n")
    public static int[] field831 = new int[256];

    @ObfuscatedName("ab.l")
    public static int field828 = 0;

    @ObfuscatedName("ab.t")
    public static int field832 = 0;

    @ObfuscatedName("ab.ad")
    public static int field818 = 0;

    @ObfuscatedName("ab.ah")
    public static int field833 = 0;

    @ObfuscatedName("ab.aj")
    public static int field835 = 0;

    @ObfuscatedName("ab.ax")
    public static int field836 = 0;

    @ObfuscatedName("ab.ak")
    public static int field837 = 10;

    @ObfuscatedName("ab.ar")
    public static String field838 = "";

    @ObfuscatedName("ab.aw")
    public static int field841 = 0;

    @ObfuscatedName("ab.ay")
    public static String field823 = "";

    @ObfuscatedName("ab.af")
    public static String field839 = "";

    @ObfuscatedName("ab.av")
    public static String field842 = "";

    @ObfuscatedName("ab.aa")
    public static String field843 = "";

    @ObfuscatedName("ab.ag")
    public static String field844 = "";

    @ObfuscatedName("ab.ao")
    public static String field845 = "";

    @ObfuscatedName("ab.ab")
    public static class98 field846 = class98.field1631;

    @ObfuscatedName("ab.al")
    public static boolean field847 = true;

    @ObfuscatedName("ab.ae")
    public static int field848 = 0;

    @ObfuscatedName("ab.ap")
    public static String field849 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ab.au")
    public static String field829 = "1234567890";

    @ObfuscatedName("ab.at")
    public static boolean field851 = false;

    @ObfuscatedName("ab.br")
    public static int field853 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.p(Ljava/awt/Component;Lgp;Lgp;ZII)V")
    public static void method721(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field827) {
            field841 = arg4;
            class220.method3735();
            byte[] var5 = arg1.method3047("title.jpg", "");
            Statics.field822 = new class225(var5, arg0);
            Statics.field659 = Statics.field822.method3851();
            if ((client.field281 & 0x20000000) == 0) {
                Statics.field820 = class226.method2885(arg2, "logo", "");
            } else {
                Statics.field820 = class226.method2885(arg2, "logo_deadman_mode", "");
            }
            Statics.field852 = class226.method2885(arg2, "titlebox", "");
            Statics.field821 = class226.method2885(arg2, "titlebutton", "");
            Statics.field3125 = class226.method117(arg2, "runes", "");
            Statics.field824 = class226.method117(arg2, "title_mute", "");
            Statics.field825 = class226.method2885(arg2, "options_radio_buttons,0", "");
            Statics.field826 = class226.method2885(arg2, "options_radio_buttons,2", "");
            Statics.field4 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field4[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field4[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field4[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field4[var9 + 192] = 16777215;
            }
            Statics.field32 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field32[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field32[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field32[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field32[var13 + 192] = 16777215;
            }
            Statics.field2019 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2019[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2019[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2019[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2019[var17 + 192] = 16777215;
            }
            Statics.field830 = new int[256];
            Statics.field1842 = new int[32768];
            Statics.field1192 = new int[32768];
            Statics.method116((class223) null);
            Statics.field807 = new int[32768];
            Statics.field102 = new int[32768];
            if (arg3) {
                field844 = "";
                field845 = "";
            }
            Statics.field714 = 0;
            Statics.field919 = "";
            field847 = true;
            field851 = false;
            if (Statics.field1734.field694) {
                class139.field1922 = 1;
                Statics.field888 = null;
                Statics.field2696 = -1;
                Statics.field1570 = -1;
                Statics.field1722 = 0;
                Statics.field1923 = false;
                Statics.field1927 = 2;
            } else {
                class139.method1595(2, Statics.field3229, "scape main", "", 255, false);
            }
            Statics.method2123(false);
            Statics.field827 = true;
            field819 = (Statics.field578 - client.field493) / 2;
            field834 = field819 + 202;
            Statics.field822.method3862(field819, 0);
            Statics.field659.method3862(field819 + 382, 0);
            Statics.field820.method3814(field819 + 382 - Statics.field820.field3199 / 2, 18);
        } else if (arg4 == 4) {
            field841 = 4;
        }
    }

    @ObfuscatedName("x.g(Ldz;I)V")
    public static void method29(class114 arg0) {
        if (field851) {
            method195(arg0);
            return;
        }
        if ((class116.field1814 == 1 || !Statics.field938 && class116.field1814 == 4) && class116.field1812 >= field819 + 765 - 50 && class116.field1813 >= 453) {
            Statics.field1734.field694 = !Statics.field1734.field694;
            class31.method1596();
            if (Statics.field1734.field694) {
                Statics.field1921.method2338();
                class139.field1922 = 1;
                Statics.field888 = null;
            } else {
                class139.method1815(Statics.field3229, "scape main", "", 255, false);
            }
        }
        if (client.field287 == 5) {
            return;
        }
        field835++;
        if (client.field287 != 10 && client.field287 != 11) {
            return;
        }
        if (client.field354 == 0) {
            if (class116.field1814 == 1 || !Statics.field938 && class116.field1814 == 4) {
                int var1 = field819 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class116.field1812 >= var1 && class116.field1812 <= var1 + var3 && class116.field1813 >= var2 && class116.field1813 <= var2 + var4) {
                    if (class30.method193()) {
                        field851 = true;
                    }
                    return;
                }
            }
            if (Statics.field139 != null && class30.method193()) {
                field851 = true;
            }
        }
        int var5 = class116.field1814;
        int var6 = class116.field1812;
        int var7 = class116.field1813;
        if (!Statics.field938 && var5 == 4) {
            var5 = 1;
        }
        if (field841 == 0) {
            int var8 = field834 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class115.method702(client.method204("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field281 & 0x2000000) != 0) {
                    field823 = "";
                    field839 = class174.field2574;
                    field842 = class174.field2575;
                    field843 = class174.field2576;
                    field841 = 1;
                    field848 = 0;
                } else if ((client.field281 & 0x4) != 0) {
                    if ((client.field281 & 0x400) == 0) {
                        field839 = class174.field2565;
                        field842 = class174.field2566;
                        field843 = class174.field2509;
                    } else {
                        field839 = class174.field2571;
                        field842 = class174.field2572;
                        field843 = class174.field2573;
                    }
                    field823 = class174.field2564;
                    field841 = 1;
                    field848 = 0;
                } else if ((client.field281 & 0x400) == 0) {
                    field839 = class174.field2363;
                    field842 = class174.field2562;
                    field843 = class174.field2608;
                    field841 = 2;
                    field848 = 0;
                } else {
                    field839 = class174.field2568;
                    field842 = class174.field2569;
                    field843 = class174.field2424;
                    field823 = class174.field2564;
                    field841 = 1;
                    field848 = 0;
                }
            }
        } else if (field841 == 1) {
            while (class106.method1094()) {
                if (Statics.field1745 == 84) {
                    field839 = class174.field2363;
                    field842 = class174.field2562;
                    field843 = class174.field2608;
                    field841 = 2;
                    field848 = 0;
                } else if (Statics.field1745 == 13) {
                    field841 = 0;
                }
            }
            int var11 = field834 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field839 = class174.field2363;
                field842 = class174.field2562;
                field843 = class174.field2608;
                field841 = 2;
                field848 = 0;
            }
            int var13 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field841 = 0;
            }
        } else if (field841 == 2) {
            short var14 = 231;
            int var36 = var14 + 30;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field848 = 0;
            }
            var36 += 15;
            if (var5 == 1 && var7 >= var36 - 15 && var7 < var36) {
                field848 = 1;
            }
            var36 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method205(class174.field2506, class174.field2601, class174.field2602);
                field841 = 5;
                return;
            }
            int var16 = field834 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field844 = field844.trim();
                if (field844.length() == 0) {
                    method205(class174.field2361, class174.field2468, class174.field2352);
                    return;
                }
                if (field845.length() == 0) {
                    method205(class174.field2512, class174.field2419, class174.field2472);
                    return;
                }
                method205(class174.field2426, class174.field2580, class174.field2374);
                field846 = Statics.field1734.field689.containsKey(class208.method3161(field844)) ? class98.field1634 : class98.field1631;
                client.method3704(20);
                return;
            }
            int var18 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field841 = 0;
                field844 = "";
                field845 = "";
                Statics.field714 = 0;
                Statics.field919 = "";
                field847 = true;
            }
            while (true) {
                while (class106.method1094()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field849.length(); var20++) {
                        if (Statics.field1425 == field849.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field1745 == 13) {
                        field841 = 0;
                        field844 = "";
                        field845 = "";
                        Statics.field714 = 0;
                        Statics.field919 = "";
                        field847 = true;
                    } else if (field848 == 0) {
                        if (Statics.field1745 == 85 && field844.length() > 0) {
                            field844 = field844.substring(0, field844.length() - 1);
                        }
                        if (Statics.field1745 == 84 || Statics.field1745 == 80) {
                            field848 = 1;
                        }
                        if (var19 && field844.length() < 320) {
                            field844 = field844 + Statics.field1425;
                        }
                    } else if (field848 == 1) {
                        if (Statics.field1745 == 85 && field845.length() > 0) {
                            field845 = field845.substring(0, field845.length() - 1);
                        }
                        if (Statics.field1745 == 84 || Statics.field1745 == 80) {
                            field848 = 0;
                        }
                        if (Statics.field1745 == 84) {
                            field844 = field844.trim();
                            if (field844.length() == 0) {
                                method205(class174.field2361, class174.field2468, class174.field2352);
                                return;
                            }
                            if (field845.length() == 0) {
                                method205(class174.field2512, class174.field2419, class174.field2472);
                                return;
                            }
                            method205(class174.field2426, class174.field2580, class174.field2374);
                            field846 = Statics.field1734.field689.containsKey(class208.method3161(field844)) ? class98.field1634 : class98.field1631;
                            client.method3704(20);
                            return;
                        }
                        if (var19 && field845.length() < 20) {
                            field845 = field845 + Statics.field1425;
                        }
                    }
                }
                return;
            }
        } else if (field841 == 3) {
            int var21 = field834 + 180;
            short var22 = 276;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field839 = class174.field2363;
                field842 = class174.field2562;
                field843 = class174.field2608;
                field841 = 2;
                field848 = 0;
            }
            int var23 = field834 + 180;
            short var24 = 326;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                method205(class174.field2506, class174.field2601, class174.field2602);
                field841 = 5;
                return;
            }
        } else if (field841 == 4) {
            int var25 = field834 + 180 - 80;
            short var26 = 321;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                Statics.field919.trim();
                if (Statics.field919.length() != 6) {
                    method205(class174.field2436, class174.field2492, class174.field2388);
                    return;
                }
                Statics.field714 = Integer.parseInt(Statics.field919);
                Statics.field919 = "";
                field846 = field847 ? class98.field1630 : class98.field1632;
                method205(class174.field2426, class174.field2580, class174.field2374);
                client.method3704(20);
                return;
            }
            if (var5 == 1 && var6 >= field834 + 180 - 9 && var6 <= field834 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field847 = !field847;
            }
            if (var5 == 1 && var6 >= field834 + 180 - 34 && var6 <= field834 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class115.method702(client.method204("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var27 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                field841 = 0;
                field844 = "";
                field845 = "";
                Statics.field714 = 0;
                Statics.field919 = "";
            }
            while (class106.method1094()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field829.length(); var29++) {
                    if (Statics.field1425 == field829.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field1745 == 13) {
                    field841 = 0;
                    field844 = "";
                    field845 = "";
                    Statics.field714 = 0;
                    Statics.field919 = "";
                } else {
                    if (Statics.field1745 == 85 && Statics.field919.length() > 0) {
                        Statics.field919 = Statics.field919.substring(0, Statics.field919.length() - 1);
                    }
                    if (Statics.field1745 == 84) {
                        Statics.field919.trim();
                        if (Statics.field919.length() != 6) {
                            method205(class174.field2436, class174.field2492, class174.field2388);
                            return;
                        }
                        Statics.field714 = Integer.parseInt(Statics.field919);
                        Statics.field919 = "";
                        field846 = field847 ? class98.field1630 : class98.field1632;
                        method205(class174.field2426, class174.field2580, class174.field2374);
                        client.method3704(20);
                        return;
                    }
                    if (var28 && Statics.field919.length() < 6) {
                        Statics.field919 = Statics.field919 + Statics.field1425;
                    }
                }
            }
        } else if (field841 == 5) {
            int var30 = field834 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method600();
                return;
            }
            int var32 = field834 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field839 = class174.field2363;
                field842 = class174.field2562;
                field843 = class174.field2608;
                field841 = 2;
                field848 = 0;
                field845 = "";
            }
            while (class106.method1094()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field849.length(); var34++) {
                    if (Statics.field1425 == field849.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field1745 == 13) {
                    field839 = class174.field2363;
                    field842 = class174.field2562;
                    field843 = class174.field2608;
                    field841 = 2;
                    field848 = 0;
                    field845 = "";
                } else {
                    if (Statics.field1745 == 85 && field844.length() > 0) {
                        field844 = field844.substring(0, field844.length() - 1);
                    }
                    if (Statics.field1745 == 84) {
                        method600();
                        return;
                    }
                    if (var33 && field844.length() < 320) {
                        field844 = field844 + Statics.field1425;
                    }
                }
            }
        } else if (field841 == 6) {
            while (true) {
                do {
                    if (!class106.method1094()) {
                        short var35 = 321;
                        if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                            field839 = class174.field2363;
                            field842 = class174.field2562;
                            field843 = class174.field2608;
                            field841 = 2;
                            field848 = 0;
                            field845 = "";
                        }
                        return;
                    }
                } while (Statics.field1745 != 84 && Statics.field1745 != 13);
                field839 = class174.field2363;
                field842 = class174.field2562;
                field843 = class174.field2608;
                field841 = 2;
                field848 = 0;
                field845 = "";
            }
        }
    }

    @ObfuscatedName("ad.x(I)V")
    public static void method600() {
        field844 = field844.trim();
        if (field844.length() == 0) {
            method205(class174.field2506, class174.field2601, class174.field2602);
            return;
        }
        long var0 = class37.method651();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class37.method2983(var0, field844);
        }
        switch(var2) {
            case 2:
                method205(class174.field2460, class174.field2604, class174.field2579);
                field841 = 6;
                break;
            case 3:
                method205(class174.field2606, class174.field2607, class174.field2543);
                break;
            case 4:
                method205(class174.field2609, class174.field2610, class174.field2611);
                break;
            case 5:
                method205(class174.field2612, class174.field2613, class174.field2614);
                break;
            case 6:
                method205(class174.field2615, class174.field2616, class174.field2617);
                break;
            case 7:
                method205(class174.field2570, class174.field2567, class174.field2620);
        }
    }

    @ObfuscatedName("j.q(Lha;Lha;Lha;ZI)V")
    public static void method93(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field819 = (Statics.field578 - client.field493) / 2;
            field834 = field819 + 202;
        }
        if (field851) {
            if (Statics.field3067 == null) {
                Statics.field3067 = class226.method758(Statics.field2740, "sl_back", "");
            }
            if (Statics.field840 == null) {
                Statics.field840 = class226.method117(Statics.field2740, "sl_flags", "");
            }
            if (Statics.field1852 == null) {
                Statics.field1852 = class226.method117(Statics.field2740, "sl_arrows", "");
            }
            if (Statics.field711 == null) {
                Statics.field711 = class226.method117(Statics.field2740, "sl_stars", "");
            }
            class220.method3766(field819, 23, 765, 480, 0);
            class220.method3742(field819, 0, 125, 23, 12425273, 9135624);
            class220.method3742(field819 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3657(class174.field2621, field819 + 62, 15, 0, -1);
            if (Statics.field711 != null) {
                Statics.field711[1].method3814(field819 + 140, 1);
                arg1.method3628(class174.field2622, field819 + 152, 10, 16777215, -1);
                Statics.field711[0].method3814(field819 + 140, 12);
                arg1.method3628(class174.field2477, field819 + 152, 21, 16777215, -1);
            }
            if (Statics.field1852 != null) {
                int var4 = field819 + 280;
                if (class30.field672[0] == 0 && class30.field671[0] == 0) {
                    Statics.field1852[2].method3814(var4, 4);
                } else {
                    Statics.field1852[0].method3814(var4, 4);
                }
                if (class30.field672[0] == 0 && class30.field671[0] == 1) {
                    Statics.field1852[3].method3814(var4 + 15, 4);
                } else {
                    Statics.field1852[1].method3814(var4 + 15, 4);
                }
                arg0.method3628(class174.field2624, var4 + 32, 17, 16777215, -1);
                int var5 = field819 + 390;
                if (class30.field672[0] == 1 && class30.field671[0] == 0) {
                    Statics.field1852[2].method3814(var5, 4);
                } else {
                    Statics.field1852[0].method3814(var5, 4);
                }
                if (class30.field672[0] == 1 && class30.field671[0] == 1) {
                    Statics.field1852[3].method3814(var5 + 15, 4);
                } else {
                    Statics.field1852[1].method3814(var5 + 15, 4);
                }
                arg0.method3628(class174.field2625, var5 + 32, 17, 16777215, -1);
                int var6 = field819 + 500;
                if (class30.field672[0] == 2 && class30.field671[0] == 0) {
                    Statics.field1852[2].method3814(var6, 4);
                } else {
                    Statics.field1852[0].method3814(var6, 4);
                }
                if (class30.field672[0] == 2 && class30.field671[0] == 1) {
                    Statics.field1852[3].method3814(var6 + 15, 4);
                } else {
                    Statics.field1852[1].method3814(var6 + 15, 4);
                }
                arg0.method3628(class174.field2626, var6 + 32, 17, 16777215, -1);
                int var7 = field819 + 610;
                if (class30.field672[0] == 3 && class30.field671[0] == 0) {
                    Statics.field1852[2].method3814(var7, 4);
                } else {
                    Statics.field1852[0].method3814(var7, 4);
                }
                if (class30.field672[0] == 3 && class30.field671[0] == 1) {
                    Statics.field1852[3].method3814(var7 + 15, 4);
                } else {
                    Statics.field1852[1].method3814(var7 + 15, 4);
                }
                arg0.method3628(class174.field2627, var7 + 32, 17, 16777215, -1);
            }
            class220.method3766(field819 + 708, 4, 50, 16, 0);
            arg1.method3657(class174.field2379, field819 + 708 + 25, 16, 16777215, -1);
            field853 = -1;
            if (Statics.field3067 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field669) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field669) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field669) {
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
                int var19 = field819 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class30.field669; var22++) {
                    class30 var23 = Statics.field53[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field680);
                    if (var23.field680 == -1) {
                        var25 = class174.field2589;
                        var24 = false;
                    } else if (var23.field680 > 1980) {
                        var25 = class174.field2629;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method612()) {
                        if (var23.method650()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method611()) {
                        var26 = 16711680;
                        if (var23.method650()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method626()) {
                        if (var23.method650()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method650()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1806 >= var19 && class116.field1815 * -693183961 >= var18 && class116.field1806 < var8 + var19 && class116.field1815 * -693183961 < var9 + var18 && var24) {
                        field853 = var22;
                        Statics.field3067[var27].method3933(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field3067[var27].method3862(var19, var18);
                    }
                    if (Statics.field840 != null) {
                        Statics.field840[(var23.method650() ? 8 : 0) + var23.field678].method3814(var19 + 29, var18);
                    }
                    arg0.method3657(Integer.toString(var23.field665), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3657(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3623(Statics.field53[field853].field668) + 6;
                    int var29 = arg1.field3101 + 8;
                    class220.method3766(class116.field1806 - var28 / 2, class116.field1815 * -693183961 + 20 + 5, var28, var29, 16777120);
                    class220.method3743(class116.field1806 - var28 / 2, class116.field1815 * -693183961 + 20 + 5, var28, var29, 0);
                    arg1.method3657(Statics.field53[field853].field668, class116.field1806, class116.field1815 * -693183961 + 20 + 5 + arg1.field3101 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field2118.getGraphics();
                Statics.field1063.method3719(var30, 0, 0);
            } catch (Exception var118) {
                Statics.field2118.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field822.method3862(field819, 0);
            Statics.field659.method3862(field819 + 382, 0);
            Statics.field820.method3814(field819 + 382 - Statics.field820.field3199 / 2, 18);
        }
        if (client.field287 == 0 || client.field287 == 5) {
            byte var32 = 20;
            arg0.method3657(class174.field2523, field834 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3743(field834 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3743(field834 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3766(field834 + 180 - 150, var33 + 2, field837 * 3, 30, 9179409);
            class220.method3766(field837 * 3 + (field834 + 180 - 150), var33 + 2, 300 - field837 * 3, 30, 0);
            arg0.method3657(field838, field834 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field287 == 20) {
            Statics.field852.method3814(field834 + 180 - Statics.field852.field3199 / 2, 271 - Statics.field852.field3195 / 2);
            short var34 = 211;
            arg0.method3657(field839, field834 + 180, var34, 16776960, 0);
            int var120 = var34 + 15;
            arg0.method3657(field842, field834 + 180, var120, 16776960, 0);
            int var121 = var120 + 15;
            arg0.method3657(field843, field834 + 180, var121, 16776960, 0);
            int var122 = var121 + 15;
            int var123 = var122 + 10;
            if (field841 != 4) {
                arg0.method3628(class174.field2582, field834 + 180 - 110, var123, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field844; arg0.method3623(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3628(class210.method3665(var36), field834 + 180 - 70, var123, 16777215, 0);
                var120 = var123 + 15;
                String var38 = class174.field2583;
                String var39 = field845;
                String var40 = class208.method2887('*', var39.length());
                arg0.method3628(var38 + var40, field834 + 180 - 108, var120, 16777215, 0);
                var120 += 15;
            }
        }
        if (client.field287 == 10 || client.field287 == 11) {
            Statics.field852.method3814(field834, 171);
            if (field841 == 0) {
                short var41 = 251;
                arg0.method3657(class174.field2548, field834 + 180, var41, 16776960, 0);
                int var124 = var41 + 30;
                int var42 = field834 + 180 - 80;
                short var43 = 291;
                Statics.field821.method3814(var42 - 73, var43 - 20);
                arg0.method3619(class174.field2597, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field834 + 180 + 80;
                Statics.field821.method3814(var44 - 73, var43 - 20);
                arg0.method3619(class174.field2587, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field841 == 1) {
                arg0.method3657(field823, field834 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3657(field839, field834 + 180, var45, 16777215, 0);
                int var125 = var45 + 15;
                arg0.method3657(field842, field834 + 180, var125, 16777215, 0);
                int var126 = var125 + 15;
                arg0.method3657(field843, field834 + 180, var126, 16777215, 0);
                int var127 = var126 + 15;
                int var46 = field834 + 180 - 80;
                short var47 = 321;
                Statics.field821.method3814(var46 - 73, var47 - 20);
                arg0.method3657(class174.field2507, var46, var47 + 5, 16777215, 0);
                int var48 = field834 + 180 + 80;
                Statics.field821.method3814(var48 - 73, var47 - 20);
                arg0.method3657(class174.field2379, var48, var47 + 5, 16777215, 0);
            } else if (field841 == 2) {
                short var49 = 211;
                arg0.method3657(field839, field834 + 180, var49, 16776960, 0);
                int var128 = var49 + 15;
                arg0.method3657(field842, field834 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3657(field843, field834 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var131 = var130 + 10;
                arg0.method3628(class174.field2582, field834 + 180 - 110, var131, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field844; arg0.method3623(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3628(class210.method3665(var51) + (field848 == 0 & client.field289 % 40 < 20 ? class38.method569(16776960) + class38.field778 : ""), field834 + 180 - 70, var131, 16777215, 0);
                var128 = var131 + 15;
                String var53 = class174.field2583;
                String var54 = field845;
                String var55 = class208.method2887('*', var54.length());
                arg0.method3628(var53 + var55 + (field848 == 1 & client.field289 % 40 < 20 ? class38.method569(16776960) + class38.field778 : ""), field834 + 180 - 108, var128, 16777215, 0);
                var128 += 15;
                int var56 = field834 + 180 - 80;
                short var57 = 321;
                Statics.field821.method3814(var56 - 73, var57 - 20);
                arg0.method3657(class174.field2605, var56, var57 + 5, 16777215, 0);
                int var58 = field834 + 180 + 80;
                Statics.field821.method3814(var58 - 73, var57 - 20);
                arg0.method3657(class174.field2379, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                arg1.method3657(class174.field2476, field834 + 180, var59, 16776960, 0);
            } else if (field841 == 3) {
                short var60 = 201;
                arg0.method3657(class174.field2590, field834 + 180, var60, 16776960, 0);
                int var132 = var60 + 20;
                arg1.method3657(class174.field2591, field834 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg1.method3657(class174.field2556, field834 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var61 = field834 + 180;
                short var62 = 276;
                Statics.field821.method3814(var61 - 73, var62 - 20);
                arg2.method3657(class174.field2593, var61, var62 + 5, 16777215, 0);
                int var63 = field834 + 180;
                short var64 = 326;
                Statics.field821.method3814(var63 - 73, var64 - 20);
                arg2.method3657(class174.field2537, var63, var64 + 5, 16777215, 0);
            } else if (field841 == 4) {
                arg0.method3657(class174.field2577, field834 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3657(field839, field834 + 180, var65, 16777215, 0);
                int var135 = var65 + 15;
                arg0.method3657(field842, field834 + 180, var135, 16777215, 0);
                int var136 = var135 + 15;
                arg0.method3657(field843, field834 + 180, var136, 16777215, 0);
                int var137 = var136 + 15;
                String var67 = class174.field2584;
                String var68 = Statics.field919;
                String var69 = class208.method2887('*', var68.length());
                arg0.method3628(var67 + var69 + (client.field289 % 40 < 20 ? class38.method569(16776960) + class38.field778 : ""), field834 + 180 - 108, var137, 16777215, 0);
                int var138 = var137 - 8;
                arg0.method3628(class174.field2360, field834 + 180 - 9, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method3628(class174.field2405, field834 + 180 - 9, var139, 16776960, 0);
                int var70 = field834 + 180 - 9 + arg0.method3623(class174.field2405) + 15;
                int var71 = var139 - arg0.field3101;
                class223 var72;
                if (field847) {
                    var72 = Statics.field826;
                } else {
                    var72 = Statics.field825;
                }
                var72.method3814(var70, var71);
                var135 = var139 + 15;
                int var73 = field834 + 180 - 80;
                short var74 = 321;
                Statics.field821.method3814(var73 - 73, var74 - 20);
                arg0.method3657(class174.field2507, var73, var74 + 5, 16777215, 0);
                int var75 = field834 + 180 + 80;
                Statics.field821.method3814(var75 - 73, var74 - 20);
                arg0.method3657(class174.field2379, var75, var74 + 5, 16777215, 0);
                arg1.method3657(class174.field2561, field834 + 180, var74 + 36, 255, 0);
            } else if (field841 == 5) {
                arg0.method3657(class174.field2596, field834 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3657(field839, field834 + 180, var76, 16776960, 0);
                int var140 = var76 + 15;
                arg2.method3657(field842, field834 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg2.method3657(field843, field834 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var143 = var142 + 14;
                arg0.method3628(class174.field2588, field834 + 180 - 145, var143, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field844; arg0.method3623(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3628(class210.method3665(var78) + (client.field289 % 40 < 20 ? class38.method569(16776960) + class38.field778 : ""), field834 + 180 - 34, var143, 16777215, 0);
                var140 = var143 + 15;
                int var79 = field834 + 180 - 80;
                short var80 = 321;
                Statics.field821.method3814(var79 - 73, var80 - 20);
                arg0.method3657(class174.field2598, var79, var80 + 5, 16777215, 0);
                int var81 = field834 + 180 + 80;
                Statics.field821.method3814(var81 - 73, var80 - 20);
                arg0.method3657(class174.field2449, var81, var80 + 5, 16777215, 0);
            } else if (field841 == 6) {
                short var82 = 211;
                arg0.method3657(field839, field834 + 180, var82, 16776960, 0);
                int var144 = var82 + 15;
                arg0.method3657(field842, field834 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg0.method3657(field843, field834 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var83 = field834 + 180;
                short var84 = 321;
                Statics.field821.method3814(var83 - 73, var84 - 20);
                arg0.method3657(class174.field2449, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field835 > 0) {
            int var85 = field835;
            short var86 = 256;
            field818 += var85 * 128;
            if (field818 > Statics.field1842.length) {
                field818 -= Statics.field1842.length;
                int var87 = (int) (Math.random() * 12.0D);
                Statics.method116(Statics.field3125[var87]);
            }
            int var88 = 0;
            int var89 = var85 * 128;
            int var90 = (var86 - var85) * 128;
            for (int var91 = 0; var91 < var90; var91++) {
                int var92 = Statics.field807[var88 + var89] - Statics.field1842[field818 + var88 & Statics.field1842.length - 1] * var85 / 6;
                if (var92 < 0) {
                    var92 = 0;
                }
                Statics.field807[var88++] = var92;
            }
            for (int var93 = var86 - var85; var93 < var86; var93++) {
                int var94 = var93 * 128;
                for (int var95 = 0; var95 < 128; var95++) {
                    int var96 = (int) (Math.random() * 100.0D);
                    if (var96 < 50 && var95 > 10 && var95 < 118) {
                        Statics.field807[var94 + var95] = 255;
                    } else {
                        Statics.field807[var94 + var95] = 0;
                    }
                }
            }
            if (field828 > 0) {
                field828 -= var85 * 4;
            }
            if (field832 > 0) {
                field832 -= var85 * 4;
            }
            if (field828 == 0 && field832 == 0) {
                int var97 = (int) (Math.random() * (double) (2000 / var85));
                if (var97 == 0) {
                    field828 = 1024;
                }
                if (var97 == 1) {
                    field832 = 1024;
                }
            }
            for (int var98 = 0; var98 < var86 - var85; var98++) {
                field831[var98] = field831[var85 + var98];
            }
            for (int var99 = var86 - var85; var99 < var86; var99++) {
                field831[var99] = (int) (Math.sin((double) field836 / 14.0D) * 16.0D + Math.sin((double) field836 / 15.0D) * 14.0D + Math.sin((double) field836 / 16.0D) * 12.0D);
                field836++;
            }
            field833 += var85 * 113965671;
            int var100 = ((client.field289 & 0x1) + var85) / 2;
            if (var100 > 0) {
                for (int var101 = 0; var101 < field833 * -422148612; var101++) {
                    int var102 = (int) (Math.random() * 124.0D) + 2;
                    int var103 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field807[(var103 << 7) + var102] = 192;
                }
                field833 = 0;
                int var104 = 0;
                label432: while (true) {
                    if (var104 >= var86) {
                        int var108 = 0;
                        while (true) {
                            if (var108 >= 128) {
                                break label432;
                            }
                            int var109 = 0;
                            for (int var110 = -var100; var110 < var86; var110++) {
                                int var111 = var110 * 128;
                                if (var100 + var110 < var86) {
                                    var109 += Statics.field102[var100 * 128 + var108 + var111];
                                }
                                if (var110 - (var100 + 1) >= 0) {
                                    var109 -= Statics.field102[var108 + var111 - (var100 + 1) * 128];
                                }
                                if (var110 >= 0) {
                                    Statics.field807[var108 + var111] = var109 / (var100 * 2 + 1);
                                }
                            }
                            var108++;
                        }
                    }
                    int var105 = 0;
                    int var106 = var104 * 128;
                    for (int var107 = -var100; var107 < 128; var107++) {
                        if (var100 + var107 < 128) {
                            var105 += Statics.field807[var106 + var107 + var100];
                        }
                        if (var107 - (var100 + 1) >= 0) {
                            var105 -= Statics.field807[var106 + var107 - (var100 + 1)];
                        }
                        if (var107 >= 0) {
                            Statics.field102[var106 + var107] = var105 / (var100 * 2 + 1);
                        }
                    }
                    var104++;
                }
            }
            field835 = 0;
        }
        method61();
        Statics.field824[Statics.field1734.field694 ? 1 : 0].method3814(field819 + 765 - 40, 463);
        if (client.field287 > 5 && client.field354 == 0) {
            if (Statics.field960 == null) {
                Statics.field960 = class226.method2885(Statics.field2740, "sl_button", "");
            } else {
                int var112 = field819 + 5;
                short var113 = 463;
                byte var114 = 100;
                byte var115 = 35;
                Statics.field960.method3814(var112, var113);
                arg0.method3657(class174.field2619 + " " + client.field280, var114 / 2 + var112, var115 / 2 + var113 - 2, 16777215, 0);
                if (Statics.field139 == null) {
                    arg1.method3657(class174.field2631, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
                } else {
                    arg1.method3657(class174.field2630, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var116 = Statics.field2118.getGraphics();
            Statics.field1063.method3719(var116, 0, 0);
        } catch (Exception var119) {
            Statics.field2118.repaint();
        }
    }

    @ObfuscatedName("f.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method205(String arg0, String arg1, String arg2) {
        field839 = arg0;
        field842 = arg1;
        field843 = arg2;
    }

    @ObfuscatedName("fc.j(IIIB)I")
    public static final int method2798(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("d.s(B)V")
    public static final void method61() {
        short var0 = 256;
        if (field828 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field828 > 768) {
                    Statics.field830[var1] = method2798(Statics.field4[var1], Statics.field32[var1], 1024 - field828);
                } else if (field828 > 256) {
                    Statics.field830[var1] = Statics.field32[var1];
                } else {
                    Statics.field830[var1] = method2798(Statics.field32[var1], Statics.field4[var1], 256 - field828);
                }
            }
        } else if (field832 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field832 > 768) {
                    Statics.field830[var2] = method2798(Statics.field4[var2], Statics.field2019[var2], 1024 - field832);
                } else if (field832 > 256) {
                    Statics.field830[var2] = Statics.field2019[var2];
                } else {
                    Statics.field830[var2] = method2798(Statics.field2019[var2], Statics.field4[var2], 256 - field832);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field830[var3] = Statics.field4[var3];
            }
        }
        class220.method3754(field819, 9, field819 + 128, var0 + 7);
        Statics.field822.method3862(field819, 0);
        class220.method3783();
        int var4 = 0;
        int var5 = field819 + Statics.field1063.field3181 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field831[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field807[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field830[var10];
                    int var14 = Statics.field1063.field3183[var5];
                    Statics.field1063.field3183[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field1063.field3181 + var8 - 128;
        }
        class220.method3754(field819 + 765 - 128, 9, field819 + 765, var0 + 7);
        Statics.field659.method3862(field819 + 382, 0);
        class220.method3783();
        int var15 = 0;
        int var16 = field819 + Statics.field1063.field3181 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field831[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field807[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field830[var22];
                    int var26 = Statics.field1063.field3183[var20];
                    Statics.field1063.field3183[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1063.field3181 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("y.o(Ldz;I)V")
    public static void method195(class114 arg0) {
        if (class116.field1814 != 1 && Statics.field938 || class116.field1814 != 4) {
            return;
        }
        int var1 = field819 + 280;
        if (class116.field1812 >= var1 && class116.field1812 <= var1 + 14 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(0, 0);
            return;
        }
        if (class116.field1812 >= var1 + 15 && class116.field1812 <= var1 + 80 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(0, 1);
            return;
        }
        int var2 = field819 + 390;
        if (class116.field1812 >= var2 && class116.field1812 <= var2 + 14 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(1, 0);
            return;
        }
        if (class116.field1812 >= var2 + 15 && class116.field1812 <= var2 + 80 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(1, 1);
            return;
        }
        int var3 = field819 + 500;
        if (class116.field1812 >= var3 && class116.field1812 <= var3 + 14 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(2, 0);
            return;
        }
        if (class116.field1812 >= var3 + 15 && class116.field1812 <= var3 + 80 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(2, 1);
            return;
        }
        int var4 = field819 + 610;
        if (class116.field1812 >= var4 && class116.field1812 <= var4 + 14 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(3, 0);
            return;
        }
        if (class116.field1812 >= var4 + 15 && class116.field1812 <= var4 + 80 && class116.field1813 >= 4 && class116.field1813 <= 18) {
            class30.method89(3, 1);
            return;
        }
        if (class116.field1812 >= field819 + 708 && class116.field1813 >= 4 && class116.field1812 <= field819 + 708 + 50 && class116.field1813 <= 20) {
            field851 = false;
            Statics.field822.method3862(field819, 0);
            Statics.field659.method3862(field819 + 382, 0);
            Statics.field820.method3814(field819 + 382 - Statics.field820.field3199 / 2, 18);
            return;
        }
        if (field853 == -1) {
            return;
        }
        class30 var5 = Statics.field53[field853];
        method2312(var5);
        field851 = false;
        Statics.field822.method3862(field819, 0);
        Statics.field659.method3862(field819 + 382, 0);
        Statics.field820.method3814(field819 + 382 - Statics.field820.field3199 / 2, 18);
        return;
    }

    @ObfuscatedName("eq.a(Lah;I)V")
    public static void method2312(class30 arg0) {
        if (arg0.method650() != client.field283) {
            client.field283 = arg0.method650();
            class199.method2564(arg0.method650());
        }
        Statics.field224 = arg0.field676;
        client.field280 = arg0.field665;
        client.field281 = arg0.field675;
        Statics.field964 = client.field425 == 0 ? 43594 : arg0.field665 + 40000;
        Statics.field2638 = client.field425 == 0 ? 443 : arg0.field665 + 50000;
        Statics.field1677 = Statics.field964;
    }
}
