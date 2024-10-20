package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ar")
public class class42 {

    @ObfuscatedName("ar.c")
    public static int field822 = 0;

    @ObfuscatedName("ar.e")
    public static int field820 = field822 + 202;

    @ObfuscatedName("ar.i")
    public static int[] field821 = new int[256];

    @ObfuscatedName("ar.f")
    public static int field823 = 0;

    @ObfuscatedName("ar.o")
    public static int field846 = 0;

    @ObfuscatedName("ar.ac")
    public static int field825 = 0;

    @ObfuscatedName("ar.az")
    public static int field839 = 0;

    @ObfuscatedName("ar.ao")
    public static int field827 = 0;

    @ObfuscatedName("ar.ak")
    public static int field829 = 0;

    @ObfuscatedName("ar.aa")
    public static int field818 = 10;

    @ObfuscatedName("ar.aj")
    public static String field830 = "";

    @ObfuscatedName("ar.ay")
    public static int field831 = 0;

    @ObfuscatedName("ar.ae")
    public static String field841 = "";

    @ObfuscatedName("ar.aq")
    public static String field833 = "";

    @ObfuscatedName("ar.av")
    public static String field834 = "";

    @ObfuscatedName("ar.aw")
    public static String field835 = "";

    @ObfuscatedName("ar.ag")
    public static String field828 = "";

    @ObfuscatedName("ar.af")
    public static String field836 = "";

    @ObfuscatedName("ar.ar")
    public static class98 field838 = class98.field1621;

    @ObfuscatedName("ar.ai")
    public static boolean field844 = true;

    @ObfuscatedName("ar.ad")
    public static int field840 = 0;

    @ObfuscatedName("ar.an")
    public static String field819 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.al")
    public static String field842 = "1234567890";

    @ObfuscatedName("ar.ah")
    public static boolean field843 = false;

    @ObfuscatedName("ar.bo")
    public static int field813 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.d(I)I")
    public static int method221() {
        return 9;
    }

    @ObfuscatedName("gc.c(Ljava/awt/Component;Lgd;Lgd;ZII)V")
    public static void method3398(Component arg0, class185 arg1, class185 arg2, boolean arg3, int arg4) {
        if (!Statics.field837) {
            field831 = arg4;
            class224.method3900();
            byte[] var5 = arg1.method3103("title.jpg", "");
            Statics.field816 = new class229(var5, arg0);
            Statics.field817 = Statics.field816.method3969();
            if ((client.field436 & 0x20000000) == 0) {
                Statics.field845 = class230.method3058(arg2, "logo", "");
            } else {
                Statics.field845 = class230.method3058(arg2, "logo_deadman_mode", "");
            }
            Statics.field814 = class230.method3058(arg2, "titlebox", "");
            Statics.field815 = class230.method3058(arg2, "titlebutton", "");
            Statics.field1910 = class230.method3788(arg2, "runes", "");
            Statics.field144 = class230.method3788(arg2, "title_mute", "");
            Statics.field798 = class230.method3058(arg2, "options_radio_buttons,0", "");
            Statics.field832 = class230.method3058(arg2, "options_radio_buttons,2", "");
            Statics.field698 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field698[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field698[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field698[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field698[var9 + 192] = 16777215;
            }
            Statics.field812 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field812[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field812[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field812[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field812[var13 + 192] = 16777215;
            }
            Statics.field2707 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2707[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2707[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2707[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2707[var17 + 192] = 16777215;
            }
            Statics.field1073 = new int[256];
            Statics.field1581 = new int[32768];
            Statics.field730 = new int[32768];
            Statics.method1110((class227) null);
            Statics.field25 = new int[32768];
            Statics.field1984 = new int[32768];
            if (arg3) {
                field828 = "";
                field836 = "";
            }
            Statics.field1889 = 0;
            Statics.field1565 = "";
            field844 = true;
            field843 = false;
            if (Statics.field657.field692) {
                class160.method2052(2);
            } else {
                class187 var18 = Statics.field200;
                int var19 = var18.method3088("scape main");
                int var20 = var18.method3102(var19, "");
                class160.field2064 = 1;
                Statics.field2068 = var18;
                Statics.field1990 = var19;
                Statics.field2792 = var20;
                Statics.field2070 = 255;
                Statics.field165 = false;
                Statics.field1544 = 2;
            }
            Statics.method1980(false);
            Statics.field837 = true;
            field822 = (Statics.field2761 - client.field294 * 765) / 2;
            field820 = field822 + 202;
            Statics.field816.method4046(field822, 0);
            Statics.field817.method4046(field822 + 382, 0);
            Statics.field845.method3932(field822 + 382 - Statics.field845.field3233 / 2, 18);
        } else if (arg4 == 4) {
            field831 = 4;
        }
    }

    @ObfuscatedName("h.n(Ldf;I)V")
    public static void method214(class114 arg0) {
        if (!field843) {
            if ((class116.field1812 == 1 || !Statics.field663 && class116.field1812 == 4) && class116.field1803 >= field822 + 765 - 50 && class116.field1814 >= 453) {
                Statics.field657.field692 = !Statics.field657.field692;
                class31.method1810();
                if (Statics.field657.field692) {
                    class160.method219();
                } else {
                    class160.method2500(Statics.field200, "scape main", "", 255, false);
                }
            }
            if (client.field289 != 5) {
                field827++;
                if (client.field289 == 10 || client.field289 == 11) {
                    if (client.field287 == 0) {
                        if (class116.field1812 == 1 || !Statics.field663 && class116.field1812 == 4) {
                            int var6 = field822 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class116.field1803 >= var6 && class116.field1803 <= var6 + var8 && class116.field1814 >= var7 && class116.field1814 <= var7 + var9) {
                                if (class30.method3393()) {
                                    field843 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1979 != null && class30.method3393()) {
                            field843 = true;
                        }
                    }
                    int var10 = class116.field1812;
                    int var11 = class116.field1803;
                    int var12 = class116.field1814;
                    if (!Statics.field663 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field831 == 0) {
                        boolean var13 = false;
                        while (class106.method897()) {
                            if (Statics.field2653 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = field820 + 180 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            String var16 = client.method185("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class115.method2213(var16, true, "openjs", false);
                        }
                        int var17 = field820 + 180 + 80;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field436 & 0x2000000) != 0) {
                                field841 = "";
                                field833 = class176.field2517;
                                field834 = class176.field2581;
                                field835 = class176.field2582;
                                field831 = 1;
                                field840 = 0;
                            } else if ((client.field436 & 0x4) != 0) {
                                if ((client.field436 & 0x400) == 0) {
                                    field833 = class176.field2571;
                                    field834 = class176.field2613;
                                    field835 = class176.field2425;
                                } else {
                                    field833 = class176.field2466;
                                    field834 = class176.field2578;
                                    field835 = class176.field2579;
                                }
                                field841 = class176.field2623;
                                field831 = 1;
                                field840 = 0;
                            } else if ((client.field436 & 0x400) == 0) {
                                field833 = class176.field2567;
                                field834 = class176.field2451;
                                field835 = class176.field2399;
                                field831 = 2;
                                field840 = 0;
                            } else {
                                field833 = class176.field2574;
                                field834 = class176.field2575;
                                field835 = class176.field2358;
                                field841 = class176.field2623;
                                field831 = 1;
                                field840 = 0;
                            }
                        }
                    } else if (field831 == 1) {
                        while (class106.method897()) {
                            if (Statics.field2653 == 84) {
                                field833 = class176.field2567;
                                field834 = class176.field2451;
                                field835 = class176.field2399;
                                field831 = 2;
                                field840 = 0;
                            } else if (Statics.field2653 == 13) {
                                field831 = 0;
                            }
                        }
                        int var18 = field820 + 180 - 80;
                        short var19 = 321;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field833 = class176.field2567;
                            field834 = class176.field2451;
                            field835 = class176.field2399;
                            field831 = 2;
                            field840 = 0;
                        }
                        int var20 = field820 + 180 + 80;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field831 = 0;
                        }
                    } else if (field831 == 2) {
                        short var21 = 231;
                        int var44 = var21 + 30;
                        if (var10 == 1 && var12 >= var44 - 15 && var12 < var44) {
                            field840 = 0;
                        }
                        var44 += 15;
                        if (var10 == 1 && var12 >= var44 - 15 && var12 < var44) {
                            field840 = 1;
                        }
                        var44 += 15;
                        short var22 = 361;
                        if (var10 == 1 && var12 >= var22 - 15 && var12 < var22) {
                            Statics.method831(class176.field2606, class176.field2608, class176.field2592);
                            field831 = 5;
                            return;
                        }
                        int var23 = field820 + 180 - 80;
                        short var24 = 321;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field828 = field828.trim();
                            if (field828.length() == 0) {
                                Statics.method831(class176.field2473, class176.field2408, class176.field2475);
                                return;
                            }
                            if (field836.length() == 0) {
                                Statics.method831(class176.field2444, class176.field2477, class176.field2396);
                                return;
                            }
                            Statics.method831(class176.field2478, class176.field2586, class176.field2587);
                            field838 = Statics.field657.field694.containsKey(class215.method742(field828)) ? class98.field1622 : class98.field1621;
                            client.method112(20);
                            return;
                        }
                        int var25 = field820 + 180 + 80;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field831 = 0;
                            field828 = "";
                            field836 = "";
                            Statics.field1889 = 0;
                            Statics.field1565 = "";
                            field844 = true;
                        }
                        while (true) {
                            while (class106.method897()) {
                                boolean var26 = false;
                                for (int var27 = 0; var27 < field819.length(); var27++) {
                                    if (Statics.field572 == field819.charAt(var27)) {
                                        var26 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2653 == 13) {
                                    field831 = 0;
                                    field828 = "";
                                    field836 = "";
                                    Statics.field1889 = 0;
                                    Statics.field1565 = "";
                                    field844 = true;
                                } else if (field840 == 0) {
                                    if (Statics.field2653 == 85 && field828.length() > 0) {
                                        field828 = field828.substring(0, field828.length() - 1);
                                    }
                                    if (Statics.field2653 == 84 || Statics.field2653 == 80) {
                                        field840 = 1;
                                    }
                                    if (var26 && field828.length() < 320) {
                                        field828 = field828 + Statics.field572;
                                    }
                                } else if (field840 == 1) {
                                    if (Statics.field2653 == 85 && field836.length() > 0) {
                                        field836 = field836.substring(0, field836.length() - 1);
                                    }
                                    if (Statics.field2653 == 84 || Statics.field2653 == 80) {
                                        field840 = 0;
                                    }
                                    if (Statics.field2653 == 84) {
                                        field828 = field828.trim();
                                        if (field828.length() == 0) {
                                            Statics.method831(class176.field2473, class176.field2408, class176.field2475);
                                            return;
                                        }
                                        if (field836.length() == 0) {
                                            Statics.method831(class176.field2444, class176.field2477, class176.field2396);
                                            return;
                                        }
                                        Statics.method831(class176.field2478, class176.field2586, class176.field2587);
                                        field838 = Statics.field657.field694.containsKey(class215.method742(field828)) ? class98.field1622 : class98.field1621;
                                        client.method112(20);
                                        return;
                                    }
                                    if (var26 && field836.length() < 20) {
                                        field836 = field836 + Statics.field572;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field831 == 3) {
                        int var28 = field820 + 180;
                        short var29 = 276;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            field833 = class176.field2567;
                            field834 = class176.field2451;
                            field835 = class176.field2399;
                            field831 = 2;
                            field840 = 0;
                        }
                        int var30 = field820 + 180;
                        short var31 = 326;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            Statics.method831(class176.field2606, class176.field2608, class176.field2592);
                            field831 = 5;
                            return;
                        }
                    } else if (field831 == 4) {
                        int var32 = field820 + 180 - 80;
                        short var33 = 321;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var33 - 20 && var12 <= var33 + 20) {
                            Statics.field1565.trim();
                            if (Statics.field1565.length() != 6) {
                                Statics.method831(class176.field2392, class176.field2520, class176.field2474);
                                return;
                            }
                            Statics.field1889 = Integer.parseInt(Statics.field1565);
                            Statics.field1565 = "";
                            field838 = field844 ? class98.field1620 : class98.field1627;
                            Statics.method831(class176.field2478, class176.field2586, class176.field2587);
                            client.method112(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field820 + 180 - 9 && var11 <= field820 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field844 = !field844;
                        }
                        if (var10 == 1 && var11 >= field820 + 180 - 34 && var11 <= field820 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            String var34 = client.method185("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class115.method2213(var34, true, "openjs", false);
                        }
                        int var35 = field820 + 180 + 80;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var33 - 20 && var12 <= var33 + 20) {
                            field831 = 0;
                            field828 = "";
                            field836 = "";
                            Statics.field1889 = 0;
                            Statics.field1565 = "";
                        }
                        while (class106.method897()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field842.length(); var37++) {
                                if (Statics.field572 == field842.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field2653 == 13) {
                                field831 = 0;
                                field828 = "";
                                field836 = "";
                                Statics.field1889 = 0;
                                Statics.field1565 = "";
                            } else {
                                if (Statics.field2653 == 85 && Statics.field1565.length() > 0) {
                                    Statics.field1565 = Statics.field1565.substring(0, Statics.field1565.length() - 1);
                                }
                                if (Statics.field2653 == 84) {
                                    Statics.field1565.trim();
                                    if (Statics.field1565.length() != 6) {
                                        Statics.method831(class176.field2392, class176.field2520, class176.field2474);
                                        return;
                                    }
                                    Statics.field1889 = Integer.parseInt(Statics.field1565);
                                    Statics.field1565 = "";
                                    field838 = field844 ? class98.field1620 : class98.field1627;
                                    Statics.method831(class176.field2478, class176.field2586, class176.field2587);
                                    client.method112(20);
                                    return;
                                }
                                if (var36 && Statics.field1565.length() < 6) {
                                    Statics.field1565 = Statics.field1565 + Statics.field572;
                                }
                            }
                        }
                    } else if (field831 == 5) {
                        int var38 = field820 + 180 - 80;
                        short var39 = 321;
                        if (var10 == 1 && var11 >= var38 - 75 && var11 <= var38 + 75 && var12 >= var39 - 20 && var12 <= var39 + 20) {
                            method1983();
                            return;
                        }
                        int var40 = field820 + 180 + 80;
                        if (var10 == 1 && var11 >= var40 - 75 && var11 <= var40 + 75 && var12 >= var39 - 20 && var12 <= var39 + 20) {
                            field833 = class176.field2567;
                            field834 = class176.field2451;
                            field835 = class176.field2399;
                            field831 = 2;
                            field840 = 0;
                            field836 = "";
                        }
                        while (class106.method897()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field819.length(); var42++) {
                                if (Statics.field572 == field819.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field2653 == 13) {
                                field833 = class176.field2567;
                                field834 = class176.field2451;
                                field835 = class176.field2399;
                                field831 = 2;
                                field840 = 0;
                                field836 = "";
                            } else {
                                if (Statics.field2653 == 85 && field828.length() > 0) {
                                    field828 = field828.substring(0, field828.length() - 1);
                                }
                                if (Statics.field2653 == 84) {
                                    method1983();
                                    return;
                                }
                                if (var41 && field828.length() < 320) {
                                    field828 = field828 + Statics.field572;
                                }
                            }
                        }
                    } else if (field831 == 6) {
                        while (true) {
                            do {
                                if (!class106.method897()) {
                                    short var43 = 321;
                                    if (var10 == 1 && var12 >= var43 - 20 && var12 <= var43 + 20) {
                                        field833 = class176.field2567;
                                        field834 = class176.field2451;
                                        field835 = class176.field2399;
                                        field831 = 2;
                                        field840 = 0;
                                        field836 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2653 != 84 && Statics.field2653 != 13);
                            field833 = class176.field2567;
                            field834 = class176.field2451;
                            field835 = class176.field2399;
                            field831 = 2;
                            field840 = 0;
                            field836 = "";
                        }
                    }
                }
            }
        } else if (class116.field1812 == 1 || !Statics.field663 && class116.field1812 == 4) {
            int var1 = field822 + 280;
            if (class116.field1803 >= var1 && class116.field1803 <= var1 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                class30.method195(0, 0);
            } else if (class116.field1803 >= var1 + 15 && class116.field1803 <= var1 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                class30.method195(0, 1);
            } else {
                int var2 = field822 + 390;
                if (class116.field1803 >= var2 && class116.field1803 <= var2 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                    class30.method195(1, 0);
                } else if (class116.field1803 >= var2 + 15 && class116.field1803 <= var2 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                    class30.method195(1, 1);
                } else {
                    int var3 = field822 + 500;
                    if (class116.field1803 >= var3 && class116.field1803 <= var3 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                        class30.method195(2, 0);
                    } else if (class116.field1803 >= var3 + 15 && class116.field1803 <= var3 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                        class30.method195(2, 1);
                    } else {
                        int var4 = field822 + 610;
                        if (class116.field1803 >= var4 && class116.field1803 <= var4 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                            class30.method195(3, 0);
                        } else if (class116.field1803 >= var4 + 15 && class116.field1803 <= var4 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                            class30.method195(3, 1);
                        } else if (class116.field1803 >= field822 + 708 && class116.field1814 >= 4 && class116.field1803 <= field822 + 708 + 50 && class116.field1814 <= 20) {
                            field843 = false;
                            Statics.field816.method4046(field822, 0);
                            Statics.field817.method4046(field822 + 382, 0);
                            Statics.field845.method3932(field822 + 382 - Statics.field845.field3233 / 2, 18);
                        } else if (field813 != -1) {
                            class30 var5 = Statics.field673[field813];
                            method101(var5);
                            field843 = false;
                            Statics.field816.method4046(field822, 0);
                            Statics.field817.method4046(field822 + 382, 0);
                            Statics.field845.method3932(field822 + 382 - Statics.field845.field3233 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.q(I)V")
    public static void method1983() {
        field828 = field828.trim();
        if (field828.length() == 0) {
            Statics.method831(class176.field2606, class176.field2608, class176.field2592);
            return;
        }
        long var0 = class37.method2139();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field828;
            Random var4 = new Random();
            class130 var5 = new class130(128);
            class130 var6 = new class130(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2215(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2218(var4.nextInt());
            }
            var5.method2218(var7[0]);
            var5.method2218(var7[1]);
            var5.method2220(var0);
            var5.method2220(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2218(var4.nextInt());
            }
            var5.method2330(class37.field765, class37.field766);
            var6.method2215(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2218(var4.nextInt());
            }
            var6.method2220(var4.nextLong());
            var6.method2219(var4.nextLong());
            client.method1150(var6);
            var6.method2220(var4.nextLong());
            var6.method2330(class37.field765, class37.field766);
            int var11 = class130.method740(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class130 var12 = new class130(var11);
            var12.method2351(var3);
            var12.field1956 = var11;
            var12.method2352(var7);
            class130 var13 = new class130(var12.field1956 + var6.field1956 + var5.field1956 + 5);
            var13.method2215(2);
            var13.method2215(var5.field1956);
            var13.method2255(var5.field1955, 0, var5.field1956);
            var13.method2215(var6.field1956);
            var13.method2255(var6.field1955, 0, var6.field1956);
            var13.method2216(var12.field1956);
            var13.method2255(var12.field1955, 0, var12.field1956);
            byte[] var14 = var13.field1955;
            int var15 = var14.length;
            StringBuilder var16 = new StringBuilder();
            for (int var17 = 0; var17 < var15; var17 += 3) {
                int var18 = var14[var17] & 0xFF;
                var16.append(class214.field3145[var18 >>> 2]);
                if (var17 < var15 - 1) {
                    int var19 = var14[var17 + 1] & 0xFF;
                    var16.append(class214.field3145[(var18 & 0x3) << 4 | var19 >>> 4]);
                    if (var17 < var15 - 2) {
                        int var20 = var14[var17 + 2] & 0xFF;
                        var16.append(class214.field3145[(var19 & 0xF) << 2 | var20 >>> 6]).append(class214.field3145[var20 & 0x3F]);
                    } else {
                        var16.append(class214.field3145[(var19 & 0xF) << 2]).append("=");
                    }
                } else {
                    var16.append(class214.field3145[(var18 & 0x3) << 4]).append("==");
                }
            }
            String var21 = var16.toString();
            String var23 = var21;
            byte var30;
            try {
                URL var24 = new URL(client.method185("services", false) + "m=accountappeal/login.ws");
                URLConnection var25 = var24.openConnection();
                var25.setDoInput(true);
                var25.setDoOutput(true);
                var25.setConnectTimeout(5000);
                OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
                var26.write("data2=" + class236.method3840(var23) + "&dest=" + class236.method3840("passwordchoice.ws"));
                var26.flush();
                InputStream var27 = var25.getInputStream();
                class130 var28 = new class130(new byte[1000]);
                while (true) {
                    int var29 = var27.read(var28.field1955, var28.field1956, 1000 - var28.field1956);
                    if (var29 == -1) {
                        var26.close();
                        var27.close();
                        String var31 = new String(var28.field1955);
                        if (var31.startsWith("OFFLINE")) {
                            var30 = 4;
                        } else if (var31.startsWith("WRONG")) {
                            var30 = 7;
                        } else if (var31.startsWith("RELOAD")) {
                            var30 = 3;
                        } else if (var31.startsWith("Not permitted for social network accounts.")) {
                            var30 = 6;
                        } else {
                            var28.method2445(var7);
                            while (var28.field1956 > 0 && var28.field1955[var28.field1956 - 1] == 0) {
                                var28.field1956--;
                            }
                            String var32 = new String(var28.field1955, 0, var28.field1956);
                            if (class37.method598(var32)) {
                                class115.method2213(var32, true, "openjs", false);
                                var30 = 2;
                            } else {
                                var30 = 5;
                            }
                        }
                        break;
                    }
                    var28.field1956 += var29;
                    if (var28.field1956 >= 1000) {
                        var30 = 5;
                        break;
                    }
                }
            } catch (Throwable var34) {
                var34.printStackTrace();
                var30 = 5;
            }
            var2 = var30;
        }
        switch(var2) {
            case 2:
                Statics.method831(class176.field2499, class176.field2610, class176.field2611);
                field831 = 6;
                break;
            case 3:
                Statics.method831(class176.field2629, class176.field2381, class176.field2614);
                break;
            case 4:
                Statics.method831(class176.field2597, class176.field2616, class176.field2617);
                break;
            case 5:
                Statics.method831(class176.field2637, class176.field2619, class176.field2620);
                break;
            case 6:
                Statics.method831(class176.field2621, class176.field2636, class176.field2438);
                break;
            case 7:
                Statics.method831(class176.field2624, class176.field2625, class176.field2441);
        }
    }

    @ObfuscatedName("v.t(Lgo;Lgo;Lgo;ZB)V")
    public static void method111(class208 arg0, class208 arg1, class208 arg2, boolean arg3) {
        if (arg3) {
            field822 = (Statics.field2761 - client.field294 * 765) / 2;
            field820 = field822 + 202;
        }
        if (field843) {
            method41(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field816.method4046(field822, 0);
            Statics.field817.method4046(field822 + 382, 0);
            Statics.field845.method3932(field822 + 382 - Statics.field845.field3233 / 2, 18);
        }
        if (client.field289 == 0 || client.field289 == 5) {
            byte var4 = 20;
            arg0.method3724(class176.field2566, field820 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class224.method3872(field820 + 180 - 152, var5, 304, 34, 9179409);
            class224.method3872(field820 + 180 - 151, var5 + 1, 302, 32, 0);
            class224.method3866(field820 + 180 - 150, var5 + 2, field818 * 3, 30, 9179409);
            class224.method3866(field818 * 3 + (field820 + 180 - 150), var5 + 2, 300 - field818 * 3, 30, 0);
            arg0.method3724(field830, field820 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field289 == 20) {
            Statics.field814.method3932(field820 + 180 - Statics.field814.field3233 / 2, 271 - Statics.field814.field3230 / 2);
            short var6 = 211;
            arg0.method3724(field833, field820 + 180, var6, 16776960, 0);
            int var91 = var6 + 15;
            arg0.method3724(field834, field820 + 180, var91, 16776960, 0);
            int var92 = var91 + 15;
            arg0.method3724(field835, field820 + 180, var92, 16776960, 0);
            int var93 = var92 + 15;
            int var94 = var93 + 10;
            if (field831 != 4) {
                arg0.method3701(class176.field2588, field820 + 180 - 110, var94, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field828; arg0.method3691(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3701(class209.method3700(var8), field820 + 180 - 70, var94, 16777215, 0);
                var91 = var94 + 15;
                String var10 = class176.field2589;
                String var11 = field836;
                String var12 = class215.method2161('*', var11.length());
                arg0.method3701(var10 + var12, field820 + 180 - 108, var91, 16777215, 0);
                var91 += 15;
            }
        }
        if (client.field289 == 10 || client.field289 == 11) {
            Statics.field814.method3932(field820, 171);
            if (field831 == 0) {
                short var13 = 251;
                arg0.method3724(class176.field2591, field820 + 180, var13, 16776960, 0);
                int var95 = var13 + 30;
                int var14 = field820 + 180 - 80;
                short var15 = 291;
                Statics.field815.method3932(var14 - 73, var15 - 20);
                arg0.method3692(class176.field2410, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field820 + 180 + 80;
                Statics.field815.method3932(var16 - 73, var15 - 20);
                arg0.method3692(class176.field2593, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field831 == 1) {
                arg0.method3724(field841, field820 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3724(field833, field820 + 180, var17, 16777215, 0);
                int var96 = var17 + 15;
                arg0.method3724(field834, field820 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method3724(field835, field820 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                int var18 = field820 + 180 - 80;
                short var19 = 321;
                Statics.field815.method3932(var18 - 73, var19 - 20);
                arg0.method3724(class176.field2364, var18, var19 + 5, 16777215, 0);
                int var20 = field820 + 180 + 80;
                Statics.field815.method3932(var20 - 73, var19 - 20);
                arg0.method3724(class176.field2532, var20, var19 + 5, 16777215, 0);
            } else if (field831 == 2) {
                short var21 = 211;
                arg0.method3724(field833, field820 + 180, var21, 16776960, 0);
                int var99 = var21 + 15;
                arg0.method3724(field834, field820 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3724(field835, field820 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 10;
                arg0.method3701(class176.field2588, field820 + 180 - 110, var102, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field828; arg0.method3691(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3701(class209.method3700(var23) + (field840 == 0 & client.field291 % 40 < 20 ? class38.method3814(16776960) + class38.field778 : ""), field820 + 180 - 70, var102, 16777215, 0);
                var99 = var102 + 15;
                String var25 = class176.field2589;
                String var26 = field836;
                String var27 = class215.method2161('*', var26.length());
                arg0.method3701(var25 + var27 + (field840 == 1 & client.field291 % 40 < 20 ? class38.method3814(16776960) + class38.field778 : ""), field820 + 180 - 108, var99, 16777215, 0);
                var99 += 15;
                int var28 = field820 + 180 - 80;
                short var29 = 321;
                Statics.field815.method3932(var28 - 73, var29 - 20);
                arg0.method3724(class176.field2594, var28, var29 + 5, 16777215, 0);
                int var30 = field820 + 180 + 80;
                Statics.field815.method3932(var30 - 73, var29 - 20);
                arg0.method3724(class176.field2532, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3724(class176.field2607, field820 + 180, var31, 16776960, 0);
            } else if (field831 == 3) {
                short var32 = 201;
                arg0.method3724(class176.field2596, field820 + 180, var32, 16776960, 0);
                int var103 = var32 + 20;
                arg1.method3724(class176.field2552, field820 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg1.method3724(class176.field2598, field820 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var33 = field820 + 180;
                short var34 = 276;
                Statics.field815.method3932(var33 - 73, var34 - 20);
                arg2.method3724(class176.field2599, var33, var34 + 5, 16777215, 0);
                int var35 = field820 + 180;
                short var36 = 326;
                Statics.field815.method3932(var35 - 73, var36 - 20);
                arg2.method3724(class176.field2600, var35, var36 + 5, 16777215, 0);
            } else if (field831 == 4) {
                arg0.method3724(class176.field2583, field820 + 180, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3724(field833, field820 + 180, var37, 16777215, 0);
                int var106 = var37 + 15;
                arg0.method3724(field834, field820 + 180, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3724(field835, field820 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                String var39 = class176.field2572;
                String var40 = Statics.field1565;
                String var41 = class215.method2161('*', var40.length());
                arg0.method3701(var39 + var41 + (client.field291 % 40 < 20 ? class38.method3814(16776960) + class38.field778 : ""), field820 + 180 - 108, var108, 16777215, 0);
                int var109 = var108 - 8;
                arg0.method3701(class176.field2366, field820 + 180 - 9, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3701(class176.field2375, field820 + 180 - 9, var110, 16776960, 0);
                int var42 = field820 + 180 - 9 + arg0.method3691(class176.field2375) + 15;
                int var43 = var110 - arg0.field3112;
                class227 var44;
                if (field844) {
                    var44 = Statics.field832;
                } else {
                    var44 = Statics.field798;
                }
                var44.method3932(var42, var43);
                var106 = var110 + 15;
                int var45 = field820 + 180 - 80;
                short var46 = 321;
                Statics.field815.method3932(var45 - 73, var46 - 20);
                arg0.method3724(class176.field2364, var45, var46 + 5, 16777215, 0);
                int var47 = field820 + 180 + 80;
                Statics.field815.method3932(var47 - 73, var46 - 20);
                arg0.method3724(class176.field2532, var47, var46 + 5, 16777215, 0);
                arg1.method3724(class176.field2584, field820 + 180, var46 + 36, 255, 0);
            } else if (field831 == 5) {
                arg0.method3724(class176.field2631, field820 + 180, 201, 16776960, 0);
                short var48 = 221;
                arg2.method3724(field833, field820 + 180, var48, 16776960, 0);
                int var111 = var48 + 15;
                arg2.method3724(field834, field820 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg2.method3724(field835, field820 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 14;
                arg0.method3701(class176.field2603, field820 + 180 - 145, var114, 16777215, 0);
                short var49 = 174;
                String var50;
                for (var50 = field828; arg0.method3691(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method3701(class209.method3700(var50) + (client.field291 % 40 < 20 ? class38.method3814(16776960) + class38.field778 : ""), field820 + 180 - 34, var114, 16777215, 0);
                var111 = var114 + 15;
                int var51 = field820 + 180 - 80;
                short var52 = 321;
                Statics.field815.method3932(var51 - 73, var52 - 20);
                arg0.method3724(class176.field2556, var51, var52 + 5, 16777215, 0);
                int var53 = field820 + 180 + 80;
                Statics.field815.method3932(var53 - 73, var52 - 20);
                arg0.method3724(class176.field2605, var53, var52 + 5, 16777215, 0);
            } else if (field831 == 6) {
                short var54 = 211;
                arg0.method3724(field833, field820 + 180, var54, 16776960, 0);
                int var115 = var54 + 15;
                arg0.method3724(field834, field820 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3724(field835, field820 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var55 = field820 + 180;
                short var56 = 321;
                Statics.field815.method3932(var55 - 73, var56 - 20);
                arg0.method3724(class176.field2605, var55, var56 + 5, 16777215, 0);
            }
        }
        if (field827 > 0) {
            method182(field827);
            field827 = 0;
        }
        short var57 = 256;
        if (field823 > 0) {
            for (int var58 = 0; var58 < 256; var58++) {
                if (field823 > 768) {
                    Statics.field1073[var58] = method2451(Statics.field698[var58], Statics.field812[var58], 1024 - field823);
                } else if (field823 > 256) {
                    Statics.field1073[var58] = Statics.field812[var58];
                } else {
                    Statics.field1073[var58] = method2451(Statics.field812[var58], Statics.field698[var58], 256 - field823);
                }
            }
        } else if (field846 > 0) {
            for (int var59 = 0; var59 < 256; var59++) {
                if (field846 > 768) {
                    Statics.field1073[var59] = method2451(Statics.field698[var59], Statics.field2707[var59], 1024 - field846);
                } else if (field846 > 256) {
                    Statics.field1073[var59] = Statics.field2707[var59];
                } else {
                    Statics.field1073[var59] = method2451(Statics.field2707[var59], Statics.field698[var59], 256 - field846);
                }
            }
        } else {
            for (int var60 = 0; var60 < 256; var60++) {
                Statics.field1073[var60] = Statics.field698[var60];
            }
        }
        class224.method3860(field822, 9, field822 + 128, var57 + 7);
        Statics.field816.method4046(field822, 0);
        class224.method3859();
        int var61 = 0;
        int var62 = field822 + Statics.field1527.field3219 * 9;
        for (int var63 = 1; var63 < var57 - 1; var63++) {
            int var64 = (var57 - var63) * field821[var63] / var57;
            int var65 = var64 + 22;
            if (var65 < 0) {
                var65 = 0;
            }
            var61 += var65;
            for (int var66 = var65; var66 < 128; var66++) {
                int var67 = Statics.field25[var61++];
                if (var67 == 0) {
                    var62++;
                } else {
                    int var69 = 256 - var67;
                    int var70 = Statics.field1073[var67];
                    int var71 = Statics.field1527.field3217[var62];
                    Statics.field1527.field3217[var62++] = ((var70 & 0xFF00FF) * var67 + (var71 & 0xFF00FF) * var69 & 0xFF00FF00) + ((var70 & 0xFF00) * var67 + (var71 & 0xFF00) * var69 & 0xFF0000) >> 8;
                }
            }
            var62 += Statics.field1527.field3219 + var65 - 128;
        }
        class224.method3860(field822 + 765 - 128, 9, field822 + 765, var57 + 7);
        Statics.field817.method4046(field822 + 382, 0);
        class224.method3859();
        int var72 = 0;
        int var73 = field822 + Statics.field1527.field3219 * 9 + 24 + 637;
        for (int var74 = 1; var74 < var57 - 1; var74++) {
            int var75 = (var57 - var74) * field821[var74] / var57;
            int var76 = 103 - var75;
            int var77 = var73 + var75;
            for (int var78 = 0; var78 < var76; var78++) {
                int var79 = Statics.field25[var72++];
                if (var79 == 0) {
                    var77++;
                } else {
                    int var81 = 256 - var79;
                    int var82 = Statics.field1073[var79];
                    int var83 = Statics.field1527.field3217[var77];
                    Statics.field1527.field3217[var77++] = ((var82 & 0xFF00FF) * var79 + (var83 & 0xFF00FF) * var81 & 0xFF00FF00) + ((var82 & 0xFF00) * var79 + (var83 & 0xFF00) * var81 & 0xFF0000) >> 8;
                }
            }
            var72 += 128 - var76;
            var73 = Statics.field1527.field3219 - var76 - var75 + var77;
        }
        Statics.field144[Statics.field657.field692 ? 1 : 0].method3932(field822 + 765 - 40, 463);
        if (client.field289 > 5 && client.field287 == 0) {
            if (Statics.field929 == null) {
                Statics.field929 = class230.method3058(Statics.field1534, "sl_button", "");
            } else {
                int var84 = field822 + 5;
                short var85 = 463;
                byte var86 = 100;
                byte var87 = 35;
                Statics.field929.method3932(var84, var85);
                arg0.method3724(class176.field2370 + " " + client.field282, var86 / 2 + var84, var87 / 2 + var85 - 2, 16777215, 0);
                if (Statics.field1979 == null) {
                    arg1.method3724(class176.field2449, var86 / 2 + var84, var87 / 2 + var85 + 12, 16777215, 0);
                } else {
                    arg1.method3724(class176.field2540, var86 / 2 + var84, var87 / 2 + var85 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var88 = Statics.field1090.getGraphics();
            Statics.field1527.method3848(var88, 0, 0);
        } catch (Exception var90) {
            Statics.field1090.repaint();
        }
    }

    @ObfuscatedName("k.w(II)V")
    public static final void method182(int arg0) {
        short var1 = 256;
        field825 += arg0 * 128;
        if (field825 > Statics.field1581.length) {
            field825 -= Statics.field1581.length;
            int var2 = (int) (Math.random() * 12.0D);
            Statics.method1110(Statics.field1910[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field25[var3 + var4] - Statics.field1581[field825 + var3 & Statics.field1581.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field25[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field25[var9 + var10] = 255;
                } else {
                    Statics.field25[var9 + var10] = 0;
                }
            }
        }
        if (field823 > 0) {
            field823 -= arg0 * 4;
        }
        if (field846 > 0) {
            field846 -= arg0 * 4;
        }
        if (field823 == 0 && field846 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field823 = 1024;
            }
            if (var12 == 1) {
                field846 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field821[var13] = field821[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field821[var14] = (int) (Math.sin((double) field829 / 14.0D) * 16.0D + Math.sin((double) field829 / 15.0D) * 14.0D + Math.sin((double) field829 / 16.0D) * 12.0D);
            field829++;
        }
        field839 += arg0 * -995700479;
        int var15 = ((client.field291 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field839 * 1639603300; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field25[(var18 << 7) + var17] = 192;
        }
        field839 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field25[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field25[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1984[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1984[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1984[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field25[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("eg.r(IIIB)I")
    public static final int method2451(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("q.s(Lgo;Lgo;I)V")
    public static void method41(class208 arg0, class208 arg1) {
        if (Statics.field570 == null) {
            Statics.field570 = class230.method3521(Statics.field1534, "sl_back", "");
        }
        if (Statics.field745 == null) {
            Statics.field745 = class230.method3788(Statics.field1534, "sl_flags", "");
        }
        if (Statics.field1736 == null) {
            Statics.field1736 = class230.method3788(Statics.field1534, "sl_arrows", "");
        }
        if (Statics.field1841 == null) {
            Statics.field1841 = class230.method3788(Statics.field1534, "sl_stars", "");
        }
        class224.method3866(field822, 23, 765, 480, 0);
        class224.method3871(field822, 0, 125, 23, 12425273, 9135624);
        class224.method3871(field822 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3724(class176.field2627, field822 + 62, 15, 0, -1);
        if (Statics.field1841 != null) {
            Statics.field1841[1].method3932(field822 + 140, 1);
            arg1.method3701(class176.field2628, field822 + 152, 10, 16777215, -1);
            Statics.field1841[0].method3932(field822 + 140, 12);
            arg1.method3701(class176.field2373, field822 + 152, 21, 16777215, -1);
        }
        if (Statics.field1736 != null) {
            int var2 = field822 + 280;
            if (class30.field677[0] == 0 && class30.field676[0] == 0) {
                Statics.field1736[2].method3932(var2, 4);
            } else {
                Statics.field1736[0].method3932(var2, 4);
            }
            if (class30.field677[0] == 0 && class30.field676[0] == 1) {
                Statics.field1736[3].method3932(var2 + 15, 4);
            } else {
                Statics.field1736[1].method3932(var2 + 15, 4);
            }
            arg0.method3701(class176.field2417, var2 + 32, 17, 16777215, -1);
            int var3 = field822 + 390;
            if (class30.field677[0] == 1 && class30.field676[0] == 0) {
                Statics.field1736[2].method3932(var3, 4);
            } else {
                Statics.field1736[0].method3932(var3, 4);
            }
            if (class30.field677[0] == 1 && class30.field676[0] == 1) {
                Statics.field1736[3].method3932(var3 + 15, 4);
            } else {
                Statics.field1736[1].method3932(var3 + 15, 4);
            }
            arg0.method3701(class176.field2398, var3 + 32, 17, 16777215, -1);
            int var4 = field822 + 500;
            if (class30.field677[0] == 2 && class30.field676[0] == 0) {
                Statics.field1736[2].method3932(var4, 4);
            } else {
                Statics.field1736[0].method3932(var4, 4);
            }
            if (class30.field677[0] == 2 && class30.field676[0] == 1) {
                Statics.field1736[3].method3932(var4 + 15, 4);
            } else {
                Statics.field1736[1].method3932(var4 + 15, 4);
            }
            arg0.method3701(class176.field2580, var4 + 32, 17, 16777215, -1);
            int var5 = field822 + 610;
            if (class30.field677[0] == 3 && class30.field676[0] == 0) {
                Statics.field1736[2].method3932(var5, 4);
            } else {
                Statics.field1736[0].method3932(var5, 4);
            }
            if (class30.field677[0] == 3 && class30.field676[0] == 1) {
                Statics.field1736[3].method3932(var5 + 15, 4);
            } else {
                Statics.field1736[1].method3932(var5 + 15, 4);
            }
            arg0.method3701(class176.field2633, var5 + 32, 17, 16777215, -1);
        }
        class224.method3866(field822 + 708, 4, 50, 16, 0);
        arg1.method3724(class176.field2532, field822 + 708 + 25, 16, 16777215, -1);
        field813 = -1;
        if (Statics.field570 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field670) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field670) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field670) {
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
            int var17 = field822 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field670; var20++) {
                class30 var21 = Statics.field673[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field672);
                if (var21.field672 == -1) {
                    var23 = class176.field2528;
                    var22 = false;
                } else if (var21.field672 > 1980) {
                    var23 = class176.field2635;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method607()) {
                    if (var21.method602()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method617()) {
                    var24 = 16711680;
                    if (var21.method602()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method604()) {
                    if (var21.method602()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method602()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1806 >= var17 && class116.field1807 >= var16 && class116.field1806 < var6 + var17 && class116.field1807 < var7 + var16 && var22) {
                    field813 = var20;
                    Statics.field570[var25].method3985(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field570[var25].method4046(var17, var16);
                }
                if (Statics.field745 != null) {
                    Statics.field745[(var21.method602() ? 8 : 0) + var21.field683].method3932(var17 + 29, var16);
                }
                arg0.method3724(Integer.toString(var21.field681), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3724(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3691(Statics.field673[field813].field674) + 6;
                int var27 = arg1.field3112 + 8;
                class224.method3866(class116.field1806 - var26 / 2, class116.field1807 + 20 + 5, var26, var27, 16777120);
                class224.method3872(class116.field1806 - var26 / 2, class116.field1807 + 20 + 5, var26, var27, 0);
                arg1.method3724(Statics.field673[field813].field674, class116.field1806, class116.field1807 + 20 + 5 + arg1.field3112 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1090.getGraphics();
            Statics.field1527.method3848(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1090.repaint();
        }
    }

    @ObfuscatedName("z.k(Laz;I)V")
    public static void method101(class30 arg0) {
        if (arg0.method602() != client.field285) {
            client.field285 = arg0.method602();
            Statics.method815(arg0.method602());
        }
        Statics.field941 = arg0.field680;
        client.field282 = arg0.field681;
        client.field436 = arg0.field679;
        Statics.field195 = client.field284 == 0 ? 43594 : arg0.field681 + 40000;
        Statics.field1748 = client.field284 == 0 ? 443 : arg0.field681 + 50000;
        Statics.field1737 = Statics.field195;
    }
}
