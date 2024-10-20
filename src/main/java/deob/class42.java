package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("al")
public class class42 {

    @ObfuscatedName("al.e")
    public static int field825 = 0;

    @ObfuscatedName("al.r")
    public static int field832 = field825 + 202;

    @ObfuscatedName("al.j")
    public static int[] field833 = new int[256];

    @ObfuscatedName("al.t")
    public static int field837 = 0;

    @ObfuscatedName("al.z")
    public static int field838 = 0;

    @ObfuscatedName("al.aq")
    public static int field839 = 0;

    @ObfuscatedName("al.an")
    public static int field840 = 0;

    @ObfuscatedName("al.ay")
    public static int field846 = 0;

    @ObfuscatedName("al.ap")
    public static int field845 = 0;

    @ObfuscatedName("al.aj")
    public static int field843 = 10;

    @ObfuscatedName("al.aw")
    public static String field844 = "";

    @ObfuscatedName("al.am")
    public static int field853 = 0;

    @ObfuscatedName("al.av")
    public static String field842 = "";

    @ObfuscatedName("al.af")
    public static String field826 = "";

    @ObfuscatedName("al.az")
    public static String field848 = "";

    @ObfuscatedName("al.aa")
    public static String field849 = "";

    @ObfuscatedName("al.ad")
    public static String field850 = "";

    @ObfuscatedName("al.ab")
    public static String field851 = "";

    @ObfuscatedName("al.al")
    public static class98 field852 = class98.field1618;

    @ObfuscatedName("al.at")
    public static boolean field829 = true;

    @ObfuscatedName("al.ax")
    public static int field841 = 0;

    @ObfuscatedName("al.ao")
    public static String field855 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("al.ah")
    public static String field847 = "1234567890";

    @ObfuscatedName("al.ae")
    public static boolean field857 = false;

    @ObfuscatedName("al.ba")
    public static int field859 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.i(B)I")
    public static int method1786() {
        return 9;
    }

    @ObfuscatedName("u.e(Ljava/awt/Component;Lgq;Lgq;ZII)V")
    public static void method181(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field836) {
            field853 = arg4;
            class220.method3734();
            byte[] var5 = arg1.method3031("title.jpg", "");
            Statics.field173 = new class225(var5, arg0);
            Statics.field862 = Statics.field173.method3783();
            if ((client.field401 & 0x20000000) == 0) {
                Statics.field1640 = class226.method1928(arg2, "logo", "");
            } else {
                Statics.field1640 = class226.method1928(arg2, "logo_deadman_mode", "");
            }
            Statics.field2121 = class226.method1928(arg2, "titlebox", "");
            Statics.field827 = class226.method1928(arg2, "titlebutton", "");
            Statics.field828 = class226.method176(arg2, "runes", "");
            Statics.field3114 = class226.method176(arg2, "title_mute", "");
            Statics.field1997 = class226.method1928(arg2, "options_radio_buttons,0", "");
            Statics.field149 = class226.method1928(arg2, "options_radio_buttons,2", "");
            Statics.field182 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field182[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field182[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field182[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field182[var9 + 192] = 16777215;
            }
            Statics.field835 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field835[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field835[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field835[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field835[var13 + 192] = 16777215;
            }
            Statics.field854 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field854[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field854[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field854[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field854[var17 + 192] = 16777215;
            }
            Statics.field834 = new int[256];
            Statics.field45 = new int[32768];
            Statics.field3256 = new int[32768];
            method1895((class223) null);
            Statics.field1614 = new int[32768];
            Statics.field1851 = new int[32768];
            if (arg3) {
                field850 = "";
                field851 = "";
            }
            Statics.field3049 = 0;
            Statics.field1429 = "";
            field829 = true;
            field857 = false;
            if (Statics.field2045.field693) {
                class139.field1915 = 1;
                Statics.field2015 = null;
                Statics.field694 = -1;
                Statics.field1916 = -1;
                Statics.field1221 = 0;
                Statics.field1222 = false;
                Statics.field1917 = 2;
            } else {
                class139.method679(2, Statics.field3080, "scape main", "", 255, false);
            }
            class186.method3154(false);
            Statics.field836 = true;
            field825 = (Statics.field1224 - client.field502) / 2;
            field832 = field825 + 202;
            Statics.field173.method3834(field825, 0);
            Statics.field862.method3834(field825 + 382, 0);
            Statics.field1640.method3753(field825 + 382 - Statics.field1640.field3194 / 2, 18);
        } else if (arg4 == 4) {
            field853 = 4;
        }
    }

    @ObfuscatedName("bz.f(Ldc;B)V")
    public static void method1309(class114 arg0) {
        if (field857) {
            method2893(arg0);
            return;
        }
        if ((class116.field1803 == 1 || !Statics.field1663 && class116.field1803 == 4) && class116.field1804 >= field825 + 765 - 50 && class116.field1805 >= 453) {
            Statics.field2045.field693 = !Statics.field2045.field693;
            class31.method748();
            if (Statics.field2045.field693) {
                class139.method2987();
            } else {
                class139.method191(Statics.field3080, "scape main", "", 255, false);
            }
        }
        if (client.field292 == 5) {
            return;
        }
        field846++;
        if (client.field292 != 10 && client.field292 != 11) {
            return;
        }
        if (client.field291 == 0) {
            if (class116.field1803 == 1 || !Statics.field1663 && class116.field1803 == 4) {
                int var1 = field825 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class116.field1804 >= var1 && class116.field1804 <= var1 + var3 && class116.field1805 >= var2 && class116.field1805 <= var2 + var4) {
                    if (class30.method1358()) {
                        field857 = true;
                    }
                    return;
                }
            }
            if (Statics.field65 != null && class30.method1358()) {
                field857 = true;
            }
        }
        int var5 = class116.field1803;
        int var6 = class116.field1804;
        int var7 = class116.field1805;
        if (!Statics.field1663 && var5 == 4) {
            var5 = 1;
        }
        if (field853 == 0) {
            int var8 = field832 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                label614: {
                    String var10 = client.method86("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var10));
                            break label614;
                        } catch (Exception var40) {
                        }
                    }
                    if (class115.field1785.startsWith("win")) {
                        class115.method1450(var10, 0);
                    } else if (class115.field1785.startsWith("mac")) {
                        class115.method678(var10, 1, "openjs");
                    } else {
                        class115.method1450(var10, 2);
                    }
                }
            }
            int var12 = field832 + 180 + 80;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field401 & 0x2000000) != 0) {
                    field842 = "";
                    field826 = class174.field2585;
                    field848 = class174.field2586;
                    field849 = class174.field2587;
                    field853 = 1;
                    field841 = 0;
                } else if ((client.field401 & 0x4) != 0) {
                    if ((client.field401 & 0x400) == 0) {
                        field826 = class174.field2474;
                        field848 = class174.field2462;
                        field849 = class174.field2387;
                    } else {
                        field826 = class174.field2601;
                        field848 = class174.field2557;
                        field849 = class174.field2584;
                    }
                    field842 = class174.field2575;
                    field853 = 1;
                    field841 = 0;
                } else if ((client.field401 & 0x400) == 0) {
                    field826 = class174.field2572;
                    field848 = class174.field2573;
                    field849 = class174.field2574;
                    field853 = 2;
                    field841 = 0;
                } else {
                    field826 = class174.field2579;
                    field848 = class174.field2580;
                    field849 = class174.field2545;
                    field842 = class174.field2575;
                    field853 = 1;
                    field841 = 0;
                }
            }
        } else if (field853 == 1) {
            while (class106.method767()) {
                if (Statics.field1353 == 84) {
                    field826 = class174.field2572;
                    field848 = class174.field2573;
                    field849 = class174.field2574;
                    field853 = 2;
                    field841 = 0;
                } else if (Statics.field1353 == 13) {
                    field853 = 0;
                }
            }
            int var13 = field832 + 180 - 80;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field826 = class174.field2572;
                field848 = class174.field2573;
                field849 = class174.field2574;
                field853 = 2;
                field841 = 0;
            }
            int var15 = field832 + 180 + 80;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field853 = 0;
            }
        } else if (field853 == 2) {
            short var16 = 231;
            int var42 = var16 + 30;
            if (var5 == 1 && var7 >= var42 - 15 && var7 < var42) {
                field841 = 0;
            }
            var42 += 15;
            if (var5 == 1 && var7 >= var42 - 15 && var7 < var42) {
                field841 = 1;
            }
            var42 += 15;
            short var17 = 361;
            if (var5 == 1 && var7 >= var17 - 15 && var7 < var17) {
                method205(class174.field2506, class174.field2612, class174.field2609);
                field853 = 5;
                return;
            }
            int var18 = field832 + 180 - 80;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field850 = field850.trim();
                if (field850.length() == 0) {
                    method205(class174.field2478, class174.field2449, class174.field2480);
                    return;
                }
                if (field851.length() == 0) {
                    method205(class174.field2481, class174.field2482, class174.field2483);
                    return;
                }
                method205(class174.field2522, class174.field2591, class174.field2534);
                field852 = Statics.field2045.field688.containsKey(class208.method1932(field850)) ? class98.field1620 : class98.field1618;
                client.method59(20);
                return;
            }
            int var20 = field832 + 180 + 80;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field853 = 0;
                field850 = "";
                field851 = "";
                Statics.field3049 = 0;
                Statics.field1429 = "";
                field829 = true;
            }
            while (true) {
                while (class106.method767()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field855.length(); var22++) {
                        if (Statics.field276 == field855.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1353 == 13) {
                        field853 = 0;
                        field850 = "";
                        field851 = "";
                        Statics.field3049 = 0;
                        Statics.field1429 = "";
                        field829 = true;
                    } else if (field841 == 0) {
                        if (Statics.field1353 == 85 && field850.length() > 0) {
                            field850 = field850.substring(0, field850.length() - 1);
                        }
                        if (Statics.field1353 == 84 || Statics.field1353 == 80) {
                            field841 = 1;
                        }
                        if (var21 && field850.length() < 320) {
                            field850 = field850 + Statics.field276;
                        }
                    } else if (field841 == 1) {
                        if (Statics.field1353 == 85 && field851.length() > 0) {
                            field851 = field851.substring(0, field851.length() - 1);
                        }
                        if (Statics.field1353 == 84 || Statics.field1353 == 80) {
                            field841 = 0;
                        }
                        if (Statics.field1353 == 84) {
                            field850 = field850.trim();
                            if (field850.length() == 0) {
                                method205(class174.field2478, class174.field2449, class174.field2480);
                                return;
                            }
                            if (field851.length() == 0) {
                                method205(class174.field2481, class174.field2482, class174.field2483);
                                return;
                            }
                            method205(class174.field2522, class174.field2591, class174.field2534);
                            field852 = Statics.field2045.field688.containsKey(class208.method1932(field850)) ? class98.field1620 : class98.field1618;
                            client.method59(20);
                            return;
                        }
                        if (var21 && field851.length() < 20) {
                            field851 = field851 + Statics.field276;
                        }
                    }
                }
                return;
            }
        } else if (field853 == 3) {
            int var23 = field832 + 180;
            short var24 = 276;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                field826 = class174.field2572;
                field848 = class174.field2573;
                field849 = class174.field2574;
                field853 = 2;
                field841 = 0;
            }
            int var25 = field832 + 180;
            short var26 = 326;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                method205(class174.field2506, class174.field2612, class174.field2609);
                field853 = 5;
                return;
            }
        } else if (field853 == 4) {
            int var27 = field832 + 180 - 80;
            short var28 = 321;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                Statics.field1429.trim();
                if (Statics.field1429.length() != 6) {
                    method205(class174.field2408, class174.field2553, class174.field2437);
                    return;
                }
                Statics.field3049 = Integer.parseInt(Statics.field1429);
                Statics.field1429 = "";
                field852 = field829 ? class98.field1619 : class98.field1621;
                method205(class174.field2522, class174.field2591, class174.field2534);
                client.method59(20);
                return;
            }
            if (var5 == 1 && var6 >= field832 + 180 - 9 && var6 <= field832 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field829 = !field829;
            }
            if (var5 == 1 && var6 >= field832 + 180 - 34 && var6 <= field832 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                label629: {
                    String var29 = client.method86("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var29));
                            break label629;
                        } catch (Exception var41) {
                        }
                    }
                    if (class115.field1785.startsWith("win")) {
                        class115.method1450(var29, 0);
                    } else if (class115.field1785.startsWith("mac")) {
                        class115.method678(var29, 1, "openjs");
                    } else {
                        class115.method1450(var29, 2);
                    }
                }
            }
            int var31 = field832 + 180 + 80;
            if (var5 == 1 && var6 >= var31 - 75 && var6 <= var31 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                field853 = 0;
                field850 = "";
                field851 = "";
                Statics.field3049 = 0;
                Statics.field1429 = "";
            }
            while (class106.method767()) {
                boolean var32 = false;
                for (int var33 = 0; var33 < field847.length(); var33++) {
                    if (Statics.field276 == field847.charAt(var33)) {
                        var32 = true;
                        break;
                    }
                }
                if (Statics.field1353 == 13) {
                    field853 = 0;
                    field850 = "";
                    field851 = "";
                    Statics.field3049 = 0;
                    Statics.field1429 = "";
                } else {
                    if (Statics.field1353 == 85 && Statics.field1429.length() > 0) {
                        Statics.field1429 = Statics.field1429.substring(0, Statics.field1429.length() - 1);
                    }
                    if (Statics.field1353 == 84) {
                        Statics.field1429.trim();
                        if (Statics.field1429.length() != 6) {
                            method205(class174.field2408, class174.field2553, class174.field2437);
                            return;
                        }
                        Statics.field3049 = Integer.parseInt(Statics.field1429);
                        Statics.field1429 = "";
                        field852 = field829 ? class98.field1619 : class98.field1621;
                        method205(class174.field2522, class174.field2591, class174.field2534);
                        client.method59(20);
                        return;
                    }
                    if (var32 && Statics.field1429.length() < 6) {
                        Statics.field1429 = Statics.field1429 + Statics.field276;
                    }
                }
            }
        } else if (field853 == 5) {
            int var34 = field832 + 180 - 80;
            short var35 = 321;
            if (var5 == 1 && var6 >= var34 - 75 && var6 <= var34 + 75 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                method849();
                return;
            }
            int var36 = field832 + 180 + 80;
            if (var5 == 1 && var6 >= var36 - 75 && var6 <= var36 + 75 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                field826 = class174.field2572;
                field848 = class174.field2573;
                field849 = class174.field2574;
                field853 = 2;
                field841 = 0;
                field851 = "";
            }
            while (class106.method767()) {
                boolean var37 = false;
                for (int var38 = 0; var38 < field855.length(); var38++) {
                    if (Statics.field276 == field855.charAt(var38)) {
                        var37 = true;
                        break;
                    }
                }
                if (Statics.field1353 == 13) {
                    field826 = class174.field2572;
                    field848 = class174.field2573;
                    field849 = class174.field2574;
                    field853 = 2;
                    field841 = 0;
                    field851 = "";
                } else {
                    if (Statics.field1353 == 85 && field850.length() > 0) {
                        field850 = field850.substring(0, field850.length() - 1);
                    }
                    if (Statics.field1353 == 84) {
                        method849();
                        return;
                    }
                    if (var37 && field850.length() < 320) {
                        field850 = field850 + Statics.field276;
                    }
                }
            }
        } else if (field853 == 6) {
            while (true) {
                do {
                    if (!class106.method767()) {
                        short var39 = 321;
                        if (var5 == 1 && var7 >= var39 - 20 && var7 <= var39 + 20) {
                            field826 = class174.field2572;
                            field848 = class174.field2573;
                            field849 = class174.field2574;
                            field853 = 2;
                            field841 = 0;
                            field851 = "";
                        }
                        return;
                    }
                } while (Statics.field1353 != 84 && Statics.field1353 != 13);
                field826 = class174.field2572;
                field848 = class174.field2573;
                field849 = class174.field2574;
                field853 = 2;
                field841 = 0;
                field851 = "";
            }
        }
    }

    @ObfuscatedName("ae.k(I)V")
    public static void method849() {
        field850 = field850.trim();
        if (field850.length() == 0) {
            method205(class174.field2506, class174.field2612, class174.field2609);
            return;
        }
        long var0 = class37.method2021();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = Statics.method186(var0, field850);
        }
        switch(var2) {
            case 2:
                method205(class174.field2614, class174.field2615, class174.field2616);
                field853 = 6;
                break;
            case 3:
                method205(class174.field2617, class174.field2618, class174.field2619);
                break;
            case 4:
                method205(class174.field2472, class174.field2621, class174.field2622);
                break;
            case 5:
                method205(class174.field2623, class174.field2502, class174.field2625);
                break;
            case 6:
                method205(class174.field2626, class174.field2627, class174.field2628);
                break;
            case 7:
                method205(class174.field2640, class174.field2630, class174.field2631);
        }
    }

    @ObfuscatedName("ae.a(Lhw;Lhw;Lhw;ZI)V")
    public static void method846(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field825 = (Statics.field1224 - client.field502) / 2;
            field832 = field825 + 202;
        }
        if (field857) {
            method763(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field173.method3834(field825, 0);
            Statics.field862.method3834(field825 + 382, 0);
            Statics.field1640.method3753(field825 + 382 - Statics.field1640.field3194 / 2, 18);
        }
        if (client.field292 == 0 || client.field292 == 5) {
            byte var4 = 20;
            arg0.method3576(class174.field2505, field832 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class220.method3719(field832 + 180 - 152, var5, 304, 34, 9179409);
            class220.method3719(field832 + 180 - 151, var5 + 1, 302, 32, 0);
            class220.method3697(field832 + 180 - 150, var5 + 2, field843 * 3, 30, 9179409);
            class220.method3697(field843 * 3 + (field832 + 180 - 150), var5 + 2, 300 - field843 * 3, 30, 0);
            arg0.method3576(field844, field832 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field292 == 20) {
            Statics.field2121.method3753(field832 + 180 - Statics.field2121.field3194 / 2, 271 - Statics.field2121.field3198 / 2);
            short var6 = 211;
            arg0.method3576(field826, field832 + 180, var6, 16776960, 0);
            int var64 = var6 + 15;
            arg0.method3576(field848, field832 + 180, var64, 16776960, 0);
            int var65 = var64 + 15;
            arg0.method3576(field849, field832 + 180, var65, 16776960, 0);
            int var66 = var65 + 15;
            int var67 = var66 + 10;
            if (field853 != 4) {
                arg0.method3573(class174.field2593, field832 + 180 - 110, var67, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field850; arg0.method3568(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3573(class210.method3572(var8), field832 + 180 - 70, var67, 16777215, 0);
                var64 = var67 + 15;
                String var10 = class174.field2594;
                String var11 = field851;
                String var12 = class208.method3189('*', var11.length());
                arg0.method3573(var10 + var12, field832 + 180 - 108, var64, 16777215, 0);
                var64 += 15;
            }
        }
        if (client.field292 == 10 || client.field292 == 11) {
            Statics.field2121.method3753(field832, 171);
            if (field853 == 0) {
                short var13 = 251;
                arg0.method3576(class174.field2603, field832 + 180, var13, 16776960, 0);
                int var68 = var13 + 30;
                int var14 = field832 + 180 - 80;
                short var15 = 291;
                Statics.field827.method3753(var14 - 73, var15 - 20);
                arg0.method3567(class174.field2597, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field832 + 180 + 80;
                Statics.field827.method3753(var16 - 73, var15 - 20);
                arg0.method3567(class174.field2598, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field853 == 1) {
                arg0.method3576(field842, field832 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3576(field826, field832 + 180, var17, 16777215, 0);
                int var69 = var17 + 15;
                arg0.method3576(field848, field832 + 180, var69, 16777215, 0);
                int var70 = var69 + 15;
                arg0.method3576(field849, field832 + 180, var70, 16777215, 0);
                int var71 = var70 + 15;
                int var18 = field832 + 180 - 80;
                short var19 = 321;
                Statics.field827.method3753(var18 - 73, var19 - 20);
                arg0.method3576(class174.field2369, var18, var19 + 5, 16777215, 0);
                int var20 = field832 + 180 + 80;
                Statics.field827.method3753(var20 - 73, var19 - 20);
                arg0.method3576(class174.field2600, var20, var19 + 5, 16777215, 0);
            } else if (field853 == 2) {
                short var21 = 211;
                arg0.method3576(field826, field832 + 180, var21, 16776960, 0);
                int var72 = var21 + 15;
                arg0.method3576(field848, field832 + 180, var72, 16776960, 0);
                int var73 = var72 + 15;
                arg0.method3576(field849, field832 + 180, var73, 16776960, 0);
                int var74 = var73 + 15;
                int var75 = var74 + 10;
                arg0.method3573(class174.field2593, field832 + 180 - 110, var75, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field850; arg0.method3568(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3573(class210.method3572(var23) + (field841 == 0 & client.field294 % 40 < 20 ? class38.method2763(16776960) + class38.field791 : ""), field832 + 180 - 70, var75, 16777215, 0);
                var72 = var75 + 15;
                String var25 = class174.field2594;
                String var26 = field851;
                String var27 = class208.method3189('*', var26.length());
                arg0.method3573(var25 + var27 + (field841 == 1 & client.field294 % 40 < 20 ? class38.method2763(16776960) + class38.field791 : ""), field832 + 180 - 108, var72, 16777215, 0);
                var72 += 15;
                int var28 = field832 + 180 - 80;
                short var29 = 321;
                Statics.field827.method3753(var28 - 73, var29 - 20);
                arg0.method3576(class174.field2525, var28, var29 + 5, 16777215, 0);
                int var30 = field832 + 180 + 80;
                Statics.field827.method3753(var30 - 73, var29 - 20);
                arg0.method3576(class174.field2600, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3576(class174.field2606, field832 + 180, var31, 16776960, 0);
            } else if (field853 == 3) {
                short var32 = 201;
                arg0.method3576(class174.field2595, field832 + 180, var32, 16776960, 0);
                int var76 = var32 + 20;
                arg1.method3576(class174.field2602, field832 + 180, var76, 16776960, 0);
                int var77 = var76 + 15;
                arg1.method3576(class174.field2548, field832 + 180, var77, 16776960, 0);
                int var78 = var77 + 15;
                int var33 = field832 + 180;
                short var34 = 276;
                Statics.field827.method3753(var33 - 73, var34 - 20);
                arg2.method3576(class174.field2604, var33, var34 + 5, 16777215, 0);
                int var35 = field832 + 180;
                short var36 = 326;
                Statics.field827.method3753(var35 - 73, var36 - 20);
                arg2.method3576(class174.field2605, var35, var36 + 5, 16777215, 0);
            } else if (field853 == 4) {
                arg0.method3576(class174.field2588, field832 + 180, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3576(field826, field832 + 180, var37, 16777215, 0);
                int var79 = var37 + 15;
                arg0.method3576(field848, field832 + 180, var79, 16777215, 0);
                int var80 = var79 + 15;
                arg0.method3576(field849, field832 + 180, var80, 16777215, 0);
                int var81 = var80 + 15;
                String var39 = class174.field2583;
                String var40 = Statics.field1429;
                String var41 = class208.method3189('*', var40.length());
                arg0.method3573(var39 + var41 + (client.field294 % 40 < 20 ? class38.method2763(16776960) + class38.field791 : ""), field832 + 180 - 108, var81, 16777215, 0);
                int var82 = var81 - 8;
                arg0.method3573(class174.field2371, field832 + 180 - 9, var82, 16776960, 0);
                int var83 = var82 + 15;
                arg0.method3573(class174.field2372, field832 + 180 - 9, var83, 16776960, 0);
                int var42 = field832 + 180 - 9 + arg0.method3568(class174.field2372) + 15;
                int var43 = var83 - arg0.field3098;
                class223 var44;
                if (field829) {
                    var44 = Statics.field149;
                } else {
                    var44 = Statics.field1997;
                }
                var44.method3753(var42, var43);
                var79 = var83 + 15;
                int var45 = field832 + 180 - 80;
                short var46 = 321;
                Statics.field827.method3753(var45 - 73, var46 - 20);
                arg0.method3576(class174.field2369, var45, var46 + 5, 16777215, 0);
                int var47 = field832 + 180 + 80;
                Statics.field827.method3753(var47 - 73, var46 - 20);
                arg0.method3576(class174.field2600, var47, var46 + 5, 16777215, 0);
                arg1.method3576(class174.field2589, field832 + 180, var46 + 36, 255, 0);
            } else if (field853 == 5) {
                arg0.method3576(class174.field2386, field832 + 180, 201, 16776960, 0);
                short var48 = 221;
                arg2.method3576(field826, field832 + 180, var48, 16776960, 0);
                int var84 = var48 + 15;
                arg2.method3576(field848, field832 + 180, var84, 16776960, 0);
                int var85 = var84 + 15;
                arg2.method3576(field849, field832 + 180, var85, 16776960, 0);
                int var86 = var85 + 15;
                int var87 = var86 + 14;
                arg0.method3573(class174.field2608, field832 + 180 - 145, var87, 16777215, 0);
                short var49 = 174;
                String var50;
                for (var50 = field850; arg0.method3568(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method3573(class210.method3572(var50) + (client.field294 % 40 < 20 ? class38.method2763(16776960) + class38.field791 : ""), field832 + 180 - 34, var87, 16777215, 0);
                var84 = var87 + 15;
                int var51 = field832 + 180 - 80;
                short var52 = 321;
                Statics.field827.method3753(var51 - 73, var52 - 20);
                arg0.method3576(class174.field2451, var51, var52 + 5, 16777215, 0);
                int var53 = field832 + 180 + 80;
                Statics.field827.method3753(var53 - 73, var52 - 20);
                arg0.method3576(class174.field2610, var53, var52 + 5, 16777215, 0);
            } else if (field853 == 6) {
                short var54 = 211;
                arg0.method3576(field826, field832 + 180, var54, 16776960, 0);
                int var88 = var54 + 15;
                arg0.method3576(field848, field832 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg0.method3576(field849, field832 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var55 = field832 + 180;
                short var56 = 321;
                Statics.field827.method3753(var55 - 73, var56 - 20);
                arg0.method3576(class174.field2610, var55, var56 + 5, 16777215, 0);
            }
        }
        if (field846 > 0) {
            method2991(field846);
            field846 = 0;
        }
        method2421();
        Statics.field3114[Statics.field2045.field693 ? 1 : 0].method3753(field825 + 765 - 40, 463);
        if (client.field292 > 5 && client.field291 == 0) {
            if (Statics.field790 == null) {
                Statics.field790 = class226.method1928(Statics.field315, "sl_button", "");
            } else {
                int var57 = field825 + 5;
                short var58 = 463;
                byte var59 = 100;
                byte var60 = 35;
                Statics.field790.method3753(var57, var58);
                arg0.method3576(class174.field2499 + " " + client.field500, var59 / 2 + var57, var60 / 2 + var58 - 2, 16777215, 0);
                if (Statics.field65 == null) {
                    arg1.method3576(class174.field2642, var59 / 2 + var57, var60 / 2 + var58 + 12, 16777215, 0);
                } else {
                    arg1.method3576(class174.field2363, var59 / 2 + var57, var60 / 2 + var58 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var61 = Statics.field1748.getGraphics();
            Statics.field935.method3669(var61, 0, 0);
        } catch (Exception var63) {
            Statics.field1748.repaint();
        }
    }

    @ObfuscatedName("t.q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method205(String arg0, String arg1, String arg2) {
        field826 = arg0;
        field848 = arg1;
        field849 = arg2;
    }

    @ObfuscatedName("de.w(Lhr;B)V")
    public static final void method1895(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field45.length; var2++) {
            Statics.field45[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field45[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3256[var8] = (Statics.field45[var8 - 1] + Statics.field45[var8 + 1] + Statics.field45[var8 - 128] + Statics.field45[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field45;
            Statics.field45 = Statics.field3256;
            Statics.field3256 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3198; var11++) {
            for (int var12 = 0; var12 < arg0.field3194; var12++) {
                if (arg0.field3199[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3196;
                    int var14 = var11 + 16 + arg0.field3197;
                    int var15 = (var14 << 7) + var13;
                    Statics.field45[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fd.v(II)V")
    public static final void method2991(int arg0) {
        short var1 = 256;
        field839 += arg0 * 128;
        if (field839 > Statics.field45.length) {
            field839 -= Statics.field45.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1895(Statics.field828[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1614[var3 + var4] - Statics.field45[field839 + var3 & Statics.field45.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1614[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1614[var9 + var10] = 255;
                } else {
                    Statics.field1614[var9 + var10] = 0;
                }
            }
        }
        if (field837 > 0) {
            field837 -= arg0 * 4;
        }
        if (field838 > 0) {
            field838 -= arg0 * 4;
        }
        if (field837 == 0 && field838 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field837 = 1024;
            }
            if (var12 == 1) {
                field838 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field833[var13] = field833[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field833[var14] = (int) (Math.sin((double) field845 / 14.0D) * 16.0D + Math.sin((double) field845 / 15.0D) * 14.0D + Math.sin((double) field845 / 16.0D) * 12.0D);
            field845++;
        }
        field840 += arg0 * -843133487;
        int var15 = ((client.field294 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field840 * 205709092; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1614[(var18 << 7) + var17] = 192;
        }
        field840 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1614[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1614[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1851[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1851[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1851[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1614[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("fw.h(IIII)I")
    public static final int method2820(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("eh.p(I)V")
    public static final void method2421() {
        short var0 = 256;
        if (field837 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field837 > 768) {
                    Statics.field834[var1] = method2820(Statics.field182[var1], Statics.field835[var1], 1024 - field837);
                } else if (field837 > 256) {
                    Statics.field834[var1] = Statics.field835[var1];
                } else {
                    Statics.field834[var1] = method2820(Statics.field835[var1], Statics.field182[var1], 256 - field837);
                }
            }
        } else if (field838 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field838 > 768) {
                    Statics.field834[var2] = method2820(Statics.field182[var2], Statics.field854[var2], 1024 - field838);
                } else if (field838 > 256) {
                    Statics.field834[var2] = Statics.field854[var2];
                } else {
                    Statics.field834[var2] = method2820(Statics.field854[var2], Statics.field182[var2], 256 - field838);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field834[var3] = Statics.field182[var3];
            }
        }
        class220.method3676(field825, 9, field825 + 128, var0 + 7);
        Statics.field173.method3834(field825, 0);
        class220.method3675();
        int var4 = 0;
        int var5 = field825 + Statics.field935.field3180 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field833[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1614[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field834[var10];
                    int var14 = Statics.field935.field3182[var5];
                    Statics.field935.field3182[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field935.field3180 + var8 - 128;
        }
        class220.method3676(field825 + 765 - 128, 9, field825 + 765, var0 + 7);
        Statics.field862.method3834(field825 + 382, 0);
        class220.method3675();
        int var15 = 0;
        int var16 = field825 + Statics.field935.field3180 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field833[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1614[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field834[var22];
                    int var26 = Statics.field935.field3182[var20];
                    Statics.field935.field3182[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field935.field3180 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ar.l(Lhw;Lhw;I)V")
    public static void method763(class209 arg0, class209 arg1) {
        if (Statics.field861 == null) {
            Statics.field861 = class226.method1007(Statics.field315, "sl_back", "");
        }
        if (Statics.field3 == null) {
            Statics.field3 = class226.method176(Statics.field315, "sl_flags", "");
        }
        if (Statics.field2744 == null) {
            Statics.field2744 = class226.method176(Statics.field315, "sl_arrows", "");
        }
        if (Statics.field217 == null) {
            Statics.field217 = class226.method176(Statics.field315, "sl_stars", "");
        }
        class220.method3697(field825, 23, 765, 480, 0);
        class220.method3687(field825, 0, 125, 23, 12425273, 9135624);
        class220.method3687(field825 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3576(class174.field2632, field825 + 62, 15, 0, -1);
        if (Statics.field217 != null) {
            Statics.field217[1].method3753(field825 + 140, 1);
            arg1.method3573(class174.field2633, field825 + 152, 10, 16777215, -1);
            Statics.field217[0].method3753(field825 + 140, 12);
            arg1.method3573(class174.field2634, field825 + 152, 21, 16777215, -1);
        }
        if (Statics.field2744 != null) {
            int var2 = field825 + 280;
            if (class30.field679[0] == 0 && class30.field675[0] == 0) {
                Statics.field2744[2].method3753(var2, 4);
            } else {
                Statics.field2744[0].method3753(var2, 4);
            }
            if (class30.field679[0] == 0 && class30.field675[0] == 1) {
                Statics.field2744[3].method3753(var2 + 15, 4);
            } else {
                Statics.field2744[1].method3753(var2 + 15, 4);
            }
            arg0.method3573(class174.field2635, var2 + 32, 17, 16777215, -1);
            int var3 = field825 + 390;
            if (class30.field679[0] == 1 && class30.field675[0] == 0) {
                Statics.field2744[2].method3753(var3, 4);
            } else {
                Statics.field2744[0].method3753(var3, 4);
            }
            if (class30.field679[0] == 1 && class30.field675[0] == 1) {
                Statics.field2744[3].method3753(var3 + 15, 4);
            } else {
                Statics.field2744[1].method3753(var3 + 15, 4);
            }
            arg0.method3573(class174.field2636, var3 + 32, 17, 16777215, -1);
            int var4 = field825 + 500;
            if (class30.field679[0] == 2 && class30.field675[0] == 0) {
                Statics.field2744[2].method3753(var4, 4);
            } else {
                Statics.field2744[0].method3753(var4, 4);
            }
            if (class30.field679[0] == 2 && class30.field675[0] == 1) {
                Statics.field2744[3].method3753(var4 + 15, 4);
            } else {
                Statics.field2744[1].method3753(var4 + 15, 4);
            }
            arg0.method3573(class174.field2571, var4 + 32, 17, 16777215, -1);
            int var5 = field825 + 610;
            if (class30.field679[0] == 3 && class30.field675[0] == 0) {
                Statics.field2744[2].method3753(var5, 4);
            } else {
                Statics.field2744[0].method3753(var5, 4);
            }
            if (class30.field679[0] == 3 && class30.field675[0] == 1) {
                Statics.field2744[3].method3753(var5 + 15, 4);
            } else {
                Statics.field2744[1].method3753(var5 + 15, 4);
            }
            arg0.method3573(class174.field2638, var5 + 32, 17, 16777215, -1);
        }
        class220.method3697(field825 + 708, 4, 50, 16, 0);
        arg1.method3576(class174.field2600, field825 + 708 + 25, 16, 16777215, -1);
        field859 = -1;
        if (Statics.field861 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field673) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field673) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field673) {
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
            int var17 = field825 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field673; var20++) {
                class30 var21 = Statics.field1713[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field677);
                if (var21.field677 == -1) {
                    var23 = class174.field2639;
                    var22 = false;
                } else if (var21.field677 > 1980) {
                    var23 = class174.field2515;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method593()) {
                    if (var21.method588()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method592()) {
                    var24 = 16711680;
                    if (var21.method588()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method590()) {
                    if (var21.method588()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method588()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1795 >= var17 && class116.field1798 >= var16 && class116.field1795 < var6 + var17 && class116.field1798 < var7 + var16 && var22) {
                    field859 = var20;
                    Statics.field861[var25].method3848(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field861[var25].method3834(var17, var16);
                }
                if (Statics.field3 != null) {
                    Statics.field3[(var21.method588() ? 8 : 0) + var21.field676].method3753(var17 + 29, var16);
                }
                arg0.method3576(Integer.toString(var21.field687), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3576(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3568(Statics.field1713[field859].field681) + 6;
                int var27 = arg1.field3098 + 8;
                class220.method3697(class116.field1795 - var26 / 2, class116.field1798 + 20 + 5, var26, var27, 16777120);
                class220.method3719(class116.field1795 - var26 / 2, class116.field1798 + 20 + 5, var26, var27, 0);
                arg1.method3576(Statics.field1713[field859].field681, class116.field1795, class116.field1798 + 20 + 5 + arg1.field3098 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1748.getGraphics();
            Statics.field935.method3669(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1748.repaint();
        }
    }

    @ObfuscatedName("fe.c(Ldc;I)V")
    public static void method2893(class114 arg0) {
        if (class116.field1803 != 1 && Statics.field1663 || class116.field1803 != 4) {
            return;
        }
        int var1 = field825 + 280;
        if (class116.field1804 >= var1 && class116.field1804 <= var1 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(0, 0);
            return;
        }
        if (class116.field1804 >= var1 + 15 && class116.field1804 <= var1 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(0, 1);
            return;
        }
        int var2 = field825 + 390;
        if (class116.field1804 >= var2 && class116.field1804 <= var2 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(1, 0);
            return;
        }
        if (class116.field1804 >= var2 + 15 && class116.field1804 <= var2 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(1, 1);
            return;
        }
        int var3 = field825 + 500;
        if (class116.field1804 >= var3 && class116.field1804 <= var3 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(2, 0);
            return;
        }
        if (class116.field1804 >= var3 + 15 && class116.field1804 <= var3 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(2, 1);
            return;
        }
        int var4 = field825 + 610;
        if (class116.field1804 >= var4 && class116.field1804 <= var4 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(3, 0);
            return;
        }
        if (class116.field1804 >= var4 + 15 && class116.field1804 <= var4 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
            class30.method2015(3, 1);
            return;
        }
        if (class116.field1804 >= field825 + 708 && class116.field1805 >= 4 && class116.field1804 <= field825 + 708 + 50 && class116.field1805 <= 20) {
            field857 = false;
            Statics.field173.method3834(field825, 0);
            Statics.field862.method3834(field825 + 382, 0);
            Statics.field1640.method3753(field825 + 382 - Statics.field1640.field3194 / 2, 18);
            return;
        }
        if (field859 == -1) {
            return;
        }
        class30 var5 = Statics.field1713[field859];
        method839(var5);
        field857 = false;
        Statics.field173.method3834(field825, 0);
        Statics.field862.method3834(field825 + 382, 0);
        Statics.field1640.method3753(field825 + 382 - Statics.field1640.field3194 / 2, 18);
        return;
    }

    @ObfuscatedName("ah.m(Lan;I)V")
    public static void method839(class30 arg0) {
        if (arg0.method588() != client.field289) {
            client.field289 = arg0.method588();
            boolean var1 = arg0.method588();
            if (Statics.field758 != var1) {
                class199.field2950.method2155();
                class199.field2951.method2155();
                class199.field2952.method2155();
                Statics.field758 = var1;
            }
        }
        Statics.field55 = arg0.field680;
        client.field500 = arg0.field687;
        client.field401 = arg0.field678;
        Statics.field88 = client.field288 == 0 ? 43594 : arg0.field687 + 40000;
        Statics.field67 = client.field288 == 0 ? 443 : arg0.field687 + 50000;
        Statics.field2190 = Statics.field88;
    }
}
