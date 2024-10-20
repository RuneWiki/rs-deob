package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("av")
public class class32 {

    @ObfuscatedName("av.v")
    public static int field714 = 0;

    @ObfuscatedName("av.l")
    public static int field719 = field714 + 202;

    @ObfuscatedName("av.f")
    public static int[] field721 = new int[256];

    @ObfuscatedName("av.a")
    public static int field724 = 0;

    @ObfuscatedName("av.j")
    public static int field725 = 0;

    @ObfuscatedName("av.ah")
    public static int field715 = 0;

    @ObfuscatedName("av.af")
    public static int field727 = 0;

    @ObfuscatedName("av.az")
    public static int field736 = 0;

    @ObfuscatedName("av.av")
    public static int field729 = 0;

    @ObfuscatedName("av.al")
    public static int field730 = 10;

    @ObfuscatedName("av.aw")
    public static String field726 = "";

    @ObfuscatedName("av.ac")
    public static int field732 = 0;

    @ObfuscatedName("av.ai")
    public static String field733 = "";

    @ObfuscatedName("av.ab")
    public static String field734 = "";

    @ObfuscatedName("av.aj")
    public static String field735 = "";

    @ObfuscatedName("av.an")
    public static String field739 = "";

    @ObfuscatedName("av.ay")
    public static String field737 = "";

    @ObfuscatedName("av.ap")
    public static class159 field738 = class159.field2585;

    @ObfuscatedName("av.ae")
    public static boolean field731 = true;

    @ObfuscatedName("av.ao")
    public static int field740 = 0;

    @ObfuscatedName("av.am")
    public static String field741 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("av.aq")
    public static String field742 = "1234567890";

    @ObfuscatedName("av.at")
    public static boolean field720 = false;

    @ObfuscatedName("av.bt")
    public static int field744 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.i(Ljava/awt/Component;Lfe;Lfe;ZIB)V")
    public static void method943(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field743) {
            field732 = arg4;
            class80.method1727();
            byte[] var5 = arg1.method3051("title.jpg", "");
            Statics.field171 = new class79(var5, arg0);
            Statics.field873 = Statics.field171.method1651();
            Statics.field2879 = class77.method671(arg2, "logo", "");
            Statics.field717 = class77.method671(arg2, "titlebox", "");
            Statics.field728 = class77.method671(arg2, "titlebutton", "");
            Statics.field1870 = class77.method44(arg2, "runes", "");
            Statics.field281 = class77.method44(arg2, "title_mute", "");
            Statics.field713 = class77.method671(arg2, "options_radio_buttons,0", "");
            Statics.field247 = class77.method671(arg2, "options_radio_buttons,2", "");
            Statics.field2033 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2033[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2033[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2033[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2033[var9 + 192] = 16777215;
            }
            Statics.field722 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field722[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field722[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field722[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field722[var13 + 192] = 16777215;
            }
            Statics.field723 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field723[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field723[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field723[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field723[var17 + 192] = 16777215;
            }
            Statics.field716 = new int[256];
            Statics.field26 = new int[32768];
            Statics.field198 = new int[32768];
            method1261((class81) null);
            Statics.field1752 = new int[32768];
            Statics.field3059 = new int[32768];
            if (arg3) {
                field739 = "";
                field737 = "";
            }
            Statics.field685 = 0;
            Statics.field1867 = "";
            field731 = true;
            field720 = false;
            if (Statics.field1389.field137) {
                class183.method856(2);
            } else {
                class183.method1263(2, Statics.field1938, "scape main", "", 255, false);
            }
            class171.method2662(false);
            Statics.field743 = true;
            field714 = (Statics.field63 - client.field516 * 765) / 2;
            field719 = field714 + 202;
            Statics.field171.method1595(field714, 0);
            Statics.field873.method1595(field714 + 382, 0);
            Statics.field2879.method1736(field714 + 382 - Statics.field2879.field1424 / 2, 18);
        } else if (arg4 == 4) {
            field732 = 4;
        }
    }

    @ObfuscatedName("dv.v(I)V")
    public static void method2597() {
        if (!Statics.field743) {
            return;
        }
        Statics.field717 = null;
        Statics.field728 = null;
        Statics.field1870 = null;
        Statics.field171 = null;
        Statics.field873 = null;
        Statics.field2879 = null;
        Statics.field281 = null;
        Statics.field713 = null;
        Statics.field247 = null;
        Statics.field248 = null;
        Statics.field585 = null;
        Statics.field586 = null;
        Statics.field1067 = null;
        Statics.field875 = null;
        Statics.field2033 = null;
        Statics.field722 = null;
        Statics.field723 = null;
        Statics.field716 = null;
        Statics.field26 = null;
        Statics.field198 = null;
        Statics.field1752 = null;
        Statics.field3059 = null;
        class183.method856(2);
        class171.method2662(true);
        Statics.field743 = false;
    }

    @ObfuscatedName("fq.r(Ler;I)V")
    public static void method3133(class144 arg0) {
        if (!field720) {
            if ((class140.field2141 == 1 || !Statics.field312 && class140.field2141 == 4) && class140.field2133 >= field714 + 765 - 50 && class140.field2131 >= 453) {
                Statics.field1389.field137 = !Statics.field1389.field137;
                class9.method86();
                if (Statics.field1389.field137) {
                    Statics.field2935.method3386();
                    class183.field2937 = 1;
                    Statics.field3131 = null;
                } else {
                    class168 var6 = Statics.field1938;
                    int var7 = var6.method3049("scape main");
                    int var8 = var6.method3079(var7, "");
                    class183.method121(var6, var7, var8, 255, false);
                }
            }
            if (client.field507 != 5) {
                field736++;
                if (client.field507 == 10 || client.field507 == 11) {
                    if (client.field358 == 0) {
                        if (class140.field2141 == 1 || !Statics.field312 && class140.field2141 == 4) {
                            int var9 = field714 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class140.field2133 >= var9 && class140.field2133 <= var9 + var11 && class140.field2131 >= var10 && class140.field2131 <= var10 + var12) {
                                method1764();
                                return;
                            }
                        }
                        if (Statics.field629 != null) {
                            method1764();
                        }
                    }
                    int var13 = class140.field2141;
                    int var14 = class140.field2133;
                    int var15 = class140.field2131;
                    if (!Statics.field312 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field732 == 0) {
                        int var16 = field719 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            String var18 = client.method728("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class138.method2643(var18, true, "openjs", false);
                        }
                        int var19 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field287 & 0x4) != 0) {
                                if ((client.field287 & 0x400) == 0) {
                                    field733 = class157.field2515;
                                    field734 = class157.field2430;
                                    field735 = class157.field2517;
                                } else {
                                    field733 = class157.field2521;
                                    field734 = class157.field2522;
                                    field735 = class157.field2300;
                                }
                                field732 = 1;
                                field740 = 0;
                            } else if ((client.field287 & 0x400) == 0) {
                                field733 = class157.field2511;
                                field734 = class157.field2512;
                                field735 = class157.field2513;
                                field732 = 2;
                                field740 = 0;
                            } else {
                                field733 = class157.field2518;
                                field734 = class157.field2519;
                                field735 = class157.field2520;
                                field732 = 1;
                                field740 = 0;
                            }
                        }
                    } else if (field732 == 1) {
                        while (class137.method741()) {
                            if (Statics.field584 == 84) {
                                field733 = class157.field2511;
                                field734 = class157.field2512;
                                field735 = class157.field2513;
                                field732 = 2;
                                field740 = 0;
                            } else if (Statics.field584 == 13) {
                                field732 = 0;
                            }
                        }
                        int var20 = field719 + 180 - 80;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field733 = class157.field2511;
                            field734 = class157.field2512;
                            field735 = class157.field2513;
                            field732 = 2;
                            field740 = 0;
                        }
                        int var22 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field732 = 0;
                        }
                    } else if (field732 == 2) {
                        short var23 = 231;
                        int var42 = var23 + 30;
                        if (var13 == 1 && var15 >= var42 - 15 && var15 < var42) {
                            field740 = 0;
                        }
                        var42 += 15;
                        if (var13 == 1 && var15 >= var42 - 15 && var15 < var42) {
                            field740 = 1;
                        }
                        var42 += 15;
                        short var24 = 361;
                        if (var13 == 1 && var15 >= var24 - 15 && var15 < var24) {
                            method420(class157.field2457, class157.field2543, class157.field2346);
                            field732 = 5;
                            return;
                        }
                        int var25 = field719 + 180 - 80;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field739 = field739.trim();
                            if (field739.length() == 0) {
                                method420(class157.field2406, class157.field2407, class157.field2419);
                                return;
                            }
                            if (field737.length() == 0) {
                                method420(class157.field2420, class157.field2421, class157.field2422);
                                return;
                            }
                            method420(class157.field2344, class157.field2527, class157.field2528);
                            field738 = Statics.field1389.field143.containsKey(class163.method1943(field739)) ? class159.field2584 : class159.field2585;
                            client.method1766(20);
                            return;
                        }
                        int var27 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field732 = 0;
                            field739 = "";
                            field737 = "";
                            Statics.field685 = 0;
                            Statics.field1867 = "";
                            field731 = true;
                        }
                        while (true) {
                            while (class137.method741()) {
                                boolean var28 = false;
                                for (int var29 = 0; var29 < field741.length(); var29++) {
                                    if (Statics.field770 == field741.charAt(var29)) {
                                        var28 = true;
                                        break;
                                    }
                                }
                                if (Statics.field584 == 13) {
                                    field732 = 0;
                                    field739 = "";
                                    field737 = "";
                                    Statics.field685 = 0;
                                    Statics.field1867 = "";
                                    field731 = true;
                                } else if (field740 == 0) {
                                    if (Statics.field584 == 85 && field739.length() > 0) {
                                        field739 = field739.substring(0, field739.length() - 1);
                                    }
                                    if (Statics.field584 == 84 || Statics.field584 == 80) {
                                        field740 = 1;
                                    }
                                    if (var28 && field739.length() < 320) {
                                        field739 = field739 + Statics.field770;
                                    }
                                } else if (field740 == 1) {
                                    if (Statics.field584 == 85 && field737.length() > 0) {
                                        field737 = field737.substring(0, field737.length() - 1);
                                    }
                                    if (Statics.field584 == 84 || Statics.field584 == 80) {
                                        field740 = 0;
                                    }
                                    if (Statics.field584 == 84) {
                                        field739 = field739.trim();
                                        if (field739.length() == 0) {
                                            method420(class157.field2406, class157.field2407, class157.field2419);
                                            return;
                                        }
                                        if (field737.length() == 0) {
                                            method420(class157.field2420, class157.field2421, class157.field2422);
                                            return;
                                        }
                                        method420(class157.field2344, class157.field2527, class157.field2528);
                                        field738 = Statics.field1389.field143.containsKey(class163.method1943(field739)) ? class159.field2584 : class159.field2585;
                                        client.method1766(20);
                                        return;
                                    }
                                    if (var28 && field737.length() < 20) {
                                        field737 = field737 + Statics.field770;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field732 == 4) {
                        int var30 = field719 + 180 - 80;
                        short var31 = 321;
                        if (var13 == 1 && var14 >= var30 - 75 && var14 <= var30 + 75 && var15 >= var31 - 20 && var15 <= var31 + 20) {
                            Statics.field1867.trim();
                            if (Statics.field1867.length() != 6) {
                                method420(class157.field2333, class157.field2334, class157.field2462);
                                return;
                            }
                            Statics.field685 = Integer.parseInt(Statics.field1867);
                            Statics.field1867 = "";
                            field738 = field731 ? class159.field2582 : class159.field2590;
                            method420(class157.field2344, class157.field2527, class157.field2528);
                            client.method1766(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field719 + 180 - 9 && var14 <= field719 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field731 = !field731;
                        }
                        if (var13 == 1 && var14 >= field719 + 180 - 34 && var14 <= field719 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            String var32 = client.method728("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class138.method2643(var32, true, "openjs", false);
                        }
                        int var33 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var31 - 20 && var15 <= var31 + 20) {
                            field732 = 0;
                            field739 = "";
                            field737 = "";
                            Statics.field685 = 0;
                            Statics.field1867 = "";
                        }
                        while (class137.method741()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field742.length(); var35++) {
                                if (Statics.field770 == field742.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field584 == 13) {
                                field732 = 0;
                                field739 = "";
                                field737 = "";
                                Statics.field685 = 0;
                                Statics.field1867 = "";
                            } else {
                                if (Statics.field584 == 85 && Statics.field1867.length() > 0) {
                                    Statics.field1867 = Statics.field1867.substring(0, Statics.field1867.length() - 1);
                                }
                                if (Statics.field584 == 84) {
                                    Statics.field1867.trim();
                                    if (Statics.field1867.length() != 6) {
                                        method420(class157.field2333, class157.field2334, class157.field2462);
                                        return;
                                    }
                                    Statics.field685 = Integer.parseInt(Statics.field1867);
                                    Statics.field1867 = "";
                                    field738 = field731 ? class159.field2582 : class159.field2590;
                                    method420(class157.field2344, class157.field2527, class157.field2528);
                                    client.method1766(20);
                                    return;
                                }
                                if (var34 && Statics.field1867.length() < 6) {
                                    Statics.field1867 = Statics.field1867 + Statics.field770;
                                }
                            }
                        }
                    } else if (field732 == 5) {
                        int var36 = field719 + 180 - 80;
                        short var37 = 321;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            method2023();
                            return;
                        }
                        int var38 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            field733 = class157.field2511;
                            field734 = class157.field2512;
                            field735 = class157.field2513;
                            field732 = 2;
                            field740 = 0;
                            field737 = "";
                        }
                        while (class137.method741()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field741.length(); var40++) {
                                if (Statics.field770 == field741.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field584 == 13) {
                                field733 = class157.field2511;
                                field734 = class157.field2512;
                                field735 = class157.field2513;
                                field732 = 2;
                                field740 = 0;
                                field737 = "";
                            } else {
                                if (Statics.field584 == 85 && field739.length() > 0) {
                                    field739 = field739.substring(0, field739.length() - 1);
                                }
                                if (Statics.field584 == 84) {
                                    method2023();
                                    return;
                                }
                                if (var39 && field739.length() < 320) {
                                    field739 = field739 + Statics.field770;
                                }
                            }
                        }
                    } else if (field732 == 6) {
                        while (true) {
                            do {
                                if (!class137.method741()) {
                                    short var41 = 321;
                                    if (var13 == 1 && var15 >= var41 - 20 && var15 <= var41 + 20) {
                                        field733 = class157.field2511;
                                        field734 = class157.field2512;
                                        field735 = class157.field2513;
                                        field732 = 2;
                                        field740 = 0;
                                        field737 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field584 != 84 && Statics.field584 != 13);
                            field733 = class157.field2511;
                            field734 = class157.field2512;
                            field735 = class157.field2513;
                            field732 = 2;
                            field740 = 0;
                            field737 = "";
                        }
                    }
                }
            }
        } else if (class140.field2141 == 1 || !Statics.field312 && class140.field2141 == 4) {
            int var1 = field714 + 280;
            if (class140.field2133 >= var1 && class140.field2133 <= var1 + 14 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                class26.method2609(0, 0);
            } else if (class140.field2133 >= var1 + 15 && class140.field2133 <= var1 + 80 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                class26.method2609(0, 1);
            } else {
                int var2 = field714 + 390;
                if (class140.field2133 >= var2 && class140.field2133 <= var2 + 14 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                    class26.method2609(1, 0);
                } else if (class140.field2133 >= var2 + 15 && class140.field2133 <= var2 + 80 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                    class26.method2609(1, 1);
                } else {
                    int var3 = field714 + 500;
                    if (class140.field2133 >= var3 && class140.field2133 <= var3 + 14 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                        class26.method2609(2, 0);
                    } else if (class140.field2133 >= var3 + 15 && class140.field2133 <= var3 + 80 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                        class26.method2609(2, 1);
                    } else {
                        int var4 = field714 + 610;
                        if (class140.field2133 >= var4 && class140.field2133 <= var4 + 14 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                            class26.method2609(3, 0);
                        } else if (class140.field2133 >= var4 + 15 && class140.field2133 <= var4 + 80 && class140.field2131 >= 4 && class140.field2131 <= 18) {
                            class26.method2609(3, 1);
                        } else if (class140.field2133 >= field714 + 708 && class140.field2131 >= 4 && class140.field2133 <= field714 + 708 + 50 && class140.field2131 <= 20) {
                            field720 = false;
                            Statics.field171.method1595(field714, 0);
                            Statics.field873.method1595(field714 + 382, 0);
                            Statics.field2879.method1736(field714 + 382 - Statics.field2879.field1424 / 2, 18);
                        } else if (field744 != -1) {
                            class26 var5 = Statics.field212[field744];
                            method730(var5);
                            field720 = false;
                            Statics.field171.method1595(field714, 0);
                            Statics.field873.method1595(field714 + 382, 0);
                            Statics.field2879.method1736(field714 + 382 - Statics.field2879.field1424 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.n(I)V")
    public static void method2023() {
        field739 = field739.trim();
        if (field739.length() == 0) {
            method420(class157.field2457, class157.field2543, class157.field2346);
            return;
        }
        long var0 = class10.method3220();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field739;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2436(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2333(var4.nextInt());
            }
            var5.method2333(var7[0]);
            var5.method2333(var7[1]);
            var5.method2335(var0);
            var5.method2335(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2333(var4.nextInt());
            }
            var5.method2401(class10.field151, class10.field152);
            var6.method2436(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2333(var4.nextInt());
            }
            var6.method2335(var4.nextLong());
            var6.method2334(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class149.field2213.method3841(0L);
                class149.field2213.method3835(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var32) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2393(var11, 0, 24);
            var6.method2335(var4.nextLong());
            var6.method2401(class10.field151, class10.field152);
            int var15 = class119.method141(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class119 var16 = new class119(var15);
            var16.method2336(var3);
            var16.field1980 = var15;
            var16.method2361(var7);
            class119 var17 = new class119(var16.field1980 + var6.field1980 + var5.field1980 + 5);
            var17.method2436(2);
            var17.method2436(var5.field1980);
            var17.method2393(var5.field1982, 0, var5.field1980);
            var17.method2436(var6.field1980);
            var17.method2393(var6.field1982, 0, var6.field1980);
            var17.method2331(var16.field1980);
            var17.method2393(var16.field1982, 0, var16.field1980);
            byte[] var18 = var17.field1982;
            String var19 = class161.method600(var18, 0, var18.length);
            String var20 = var19;
            byte var27;
            try {
                URL var21 = new URL(client.method728("services", false) + "m=accountappeal/login.ws");
                URLConnection var22 = var21.openConnection();
                var22.setDoInput(true);
                var22.setDoOutput(true);
                var22.setConnectTimeout(5000);
                OutputStreamWriter var23 = new OutputStreamWriter(var22.getOutputStream());
                var23.write("data2=" + class226.method645(var20) + "&dest=" + class226.method645("passwordchoice.ws"));
                var23.flush();
                InputStream var24 = var22.getInputStream();
                class119 var25 = new class119(new byte[1000]);
                while (true) {
                    int var26 = var24.read(var25.field1982, var25.field1980, 1000 - var25.field1980);
                    if (var26 == -1) {
                        var23.close();
                        var24.close();
                        String var28 = new String(var25.field1982);
                        if (var28.startsWith("OFFLINE")) {
                            var27 = 4;
                        } else if (var28.startsWith("WRONG")) {
                            var27 = 7;
                        } else if (var28.startsWith("RELOAD")) {
                            var27 = 3;
                        } else if (var28.startsWith("Not permitted for social network accounts.")) {
                            var27 = 6;
                        } else {
                            var25.method2362(var7);
                            while (var25.field1980 > 0 && var25.field1982[var25.field1980 - 1] == 0) {
                                var25.field1980--;
                            }
                            String var29 = new String(var25.field1982, 0, var25.field1980);
                            if (Statics.method11(var29)) {
                                class138.method2643(var29, true, "openjs", false);
                                var27 = 2;
                            } else {
                                var27 = 5;
                            }
                        }
                        break;
                    }
                    var25.field1980 += var26;
                    if (var25.field1980 >= 1000) {
                        var27 = 5;
                        break;
                    }
                }
            } catch (Throwable var31) {
                var31.printStackTrace();
                var27 = 5;
            }
            var2 = var27;
        }
        switch(var2) {
            case 2:
                method420(class157.field2414, class157.field2546, class157.field2547);
                field732 = 6;
                break;
            case 3:
                method420(class157.field2548, class157.field2549, class157.field2550);
                break;
            case 4:
                method420(class157.field2363, class157.field2552, class157.field2382);
                break;
            case 5:
                method420(class157.field2554, class157.field2551, class157.field2556);
                break;
            case 6:
                method420(class157.field2557, class157.field2558, class157.field2559);
                break;
            case 7:
                method420(class157.field2535, class157.field2561, class157.field2562);
        }
    }

    @ObfuscatedName("o.x(Lhy;Lhy;Lhy;ZI)V")
    public static void method573(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field714 = (Statics.field63 - client.field516 * 765) / 2;
            field719 = field714 + 202;
        }
        if (field720) {
            if (Statics.field248 == null) {
                Statics.field248 = class77.method725(Statics.field1382, "sl_back", "");
            }
            if (Statics.field585 == null) {
                Statics.field585 = class77.method44(Statics.field1382, "sl_flags", "");
            }
            if (Statics.field586 == null) {
                Statics.field586 = class77.method44(Statics.field1382, "sl_arrows", "");
            }
            if (Statics.field1067 == null) {
                Statics.field1067 = class77.method44(Statics.field1382, "sl_stars", "");
            }
            class80.method1692(field714, 23, 765, 480, 0);
            class80.method1728(field714, 0, 125, 23, 12425273, 9135624);
            class80.method1728(field714 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3735(class157.field2563, field714 + 62, 15, 0, -1);
            if (Statics.field1067 != null) {
                Statics.field1067[1].method1736(field714 + 140, 1);
                arg1.method3733(class157.field2432, field714 + 152, 10, 16777215, -1);
                Statics.field1067[0].method1736(field714 + 140, 12);
                arg1.method3733(class157.field2327, field714 + 152, 21, 16777215, -1);
            }
            if (Statics.field586 != null) {
                int var4 = field714 + 280;
                if (class26.field639[0] == 0 && class26.field638[0] == 0) {
                    Statics.field586[2].method1736(var4, 4);
                } else {
                    Statics.field586[0].method1736(var4, 4);
                }
                if (class26.field639[0] == 0 && class26.field638[0] == 1) {
                    Statics.field586[3].method1736(var4 + 15, 4);
                } else {
                    Statics.field586[1].method1736(var4 + 15, 4);
                }
                arg0.method3733(class157.field2566, var4 + 32, 17, 16777215, -1);
                int var5 = field714 + 390;
                if (class26.field639[0] == 1 && class26.field638[0] == 0) {
                    Statics.field586[2].method1736(var5, 4);
                } else {
                    Statics.field586[0].method1736(var5, 4);
                }
                if (class26.field639[0] == 1 && class26.field638[0] == 1) {
                    Statics.field586[3].method1736(var5 + 15, 4);
                } else {
                    Statics.field586[1].method1736(var5 + 15, 4);
                }
                arg0.method3733(class157.field2458, var5 + 32, 17, 16777215, -1);
                int var6 = field714 + 500;
                if (class26.field639[0] == 2 && class26.field638[0] == 0) {
                    Statics.field586[2].method1736(var6, 4);
                } else {
                    Statics.field586[0].method1736(var6, 4);
                }
                if (class26.field639[0] == 2 && class26.field638[0] == 1) {
                    Statics.field586[3].method1736(var6 + 15, 4);
                } else {
                    Statics.field586[1].method1736(var6 + 15, 4);
                }
                arg0.method3733(class157.field2384, var6 + 32, 17, 16777215, -1);
                int var7 = field714 + 610;
                if (class26.field639[0] == 3 && class26.field638[0] == 0) {
                    Statics.field586[2].method1736(var7, 4);
                } else {
                    Statics.field586[0].method1736(var7, 4);
                }
                if (class26.field639[0] == 3 && class26.field638[0] == 1) {
                    Statics.field586[3].method1736(var7 + 15, 4);
                } else {
                    Statics.field586[1].method1736(var7 + 15, 4);
                }
                arg0.method3733(class157.field2569, var7 + 32, 17, 16777215, -1);
            }
            class80.method1692(field714 + 708, 4, 50, 16, 0);
            arg1.method3735(class157.field2536, field714 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field287 & var9;
            for (int var11 = 0; var11 < class26.field636; var11++) {
                class26 var12 = Statics.field212[var11];
                if ((var12.field650 & var9) == var10 || (var12.field650 & var9) == 0) {
                    var8++;
                }
            }
            field744 = -1;
            if (Statics.field248 != null) {
                byte var13 = 88;
                byte var14 = 19;
                int var15 = 765 / (var13 + 1);
                int var16 = 480 / (var14 + 1);
                int var17;
                int var18;
                do {
                    var17 = var16;
                    var18 = var15;
                    if ((var15 - 1) * var16 >= var8) {
                        var15--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                } while (var16 != var17 || var15 != var18);
                int var19 = (765 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (480 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (765 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = (480 - var14 * var16 - (var16 - 1) * var20) / 2;
                int var23 = var22 + 23;
                int var24 = field714 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field636; var27++) {
                    class26 var28 = Statics.field212[var27];
                    if ((var28.field650 & var9) == var10 || (var28.field650 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field641);
                        if (var28.field641 == -1) {
                            var30 = class157.field2570;
                            var29 = false;
                        } else if (var28.field641 > 1980) {
                            var30 = class157.field2571;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method621()) {
                            if (var28.method606()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method606()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class140.field2146 >= var24 && class140.field2136 >= var23 && class140.field2146 < var13 + var24 && class140.field2136 < var14 + var23 && var29) {
                            field744 = var27;
                            Statics.field248[var31].method1662(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field248[var31].method1595(var24, var23);
                        }
                        if (Statics.field585 != null) {
                            Statics.field585[(var28.method606() ? 8 : 0) + var28.field645].method1736(var24 + 29, var23);
                        }
                        arg0.method3735(Integer.toString(var28.field640), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3735(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
                        var23 += var14 + var20;
                        var25++;
                        if (var25 >= var16) {
                            var23 = var22 + 23;
                            var24 += var13 + var19;
                            var25 = 0;
                        }
                    }
                }
                if (var26) {
                    int var32 = arg1.method3729(Statics.field212[field744].field644) + 6;
                    int var33 = arg1.field3174 + 8;
                    class80.method1692(class140.field2146 - var32 / 2, class140.field2136 + 20 + 5, var32, var33, 16777120);
                    class80.method1694(class140.field2146 - var32 / 2, class140.field2136 + 20 + 5, var32, var33, 0);
                    arg1.method3735(Statics.field212[field744].field644, class140.field2146, class140.field2136 + 20 + 5 + arg1.field3174 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1781.getGraphics();
                Statics.field1379.method1528(var34, 0, 0);
            } catch (Exception var105) {
                Statics.field1781.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field171.method1595(field714, 0);
            Statics.field873.method1595(field714 + 382, 0);
            Statics.field2879.method1736(field714 + 382 - Statics.field2879.field1424 / 2, 18);
        }
        if (client.field507 == 0 || client.field507 == 5) {
            byte var36 = 20;
            arg0.method3735(class157.field2510, field719 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class80.method1694(field719 + 180 - 152, var37, 304, 34, 9179409);
            class80.method1694(field719 + 180 - 151, var37 + 1, 302, 32, 0);
            class80.method1692(field719 + 180 - 150, var37 + 2, field730 * 3, 30, 9179409);
            class80.method1692(field730 * 3 + (field719 + 180 - 150), var37 + 2, 300 - field730 * 3, 30, 0);
            arg0.method3735(field726, field719 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field507 == 20) {
            Statics.field717.method1736(field719 + 180 - Statics.field717.field1424 / 2, 271 - Statics.field717.field1422 / 2);
            short var38 = 211;
            arg0.method3735(field733, field719 + 180, var38, 16776960, 0);
            int var107 = var38 + 15;
            arg0.method3735(field734, field719 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            arg0.method3735(field735, field719 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            int var110 = var109 + 10;
            if (field732 != 4) {
                arg0.method3733(class157.field2349, field719 + 180 - 110, var110, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field739; arg0.method3729(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3733(class223.method3732(var40), field719 + 180 - 70, var110, 16777215, 0);
                var107 = var110 + 15;
                arg0.method3733(class157.field2402 + class163.method727(field737), field719 + 180 - 108, var107, 16777215, 0);
                var107 += 15;
            }
        }
        if (client.field507 == 10 || client.field507 == 11) {
            Statics.field717.method1736(field719, 171);
            if (field732 == 0) {
                short var41 = 251;
                arg0.method3735(class157.field2532, field719 + 180, var41, 16776960, 0);
                int var111 = var41 + 30;
                int var42 = field719 + 180 - 80;
                short var43 = 291;
                Statics.field728.method1736(var42 - 73, var43 - 20);
                arg0.method3736(class157.field2533, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field719 + 180 + 80;
                Statics.field728.method1736(var44 - 73, var43 - 20);
                arg0.method3736(class157.field2534, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field732 == 1) {
                arg0.method3735(class157.field2545, field719 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3735(field733, field719 + 180, var45, 16777215, 0);
                int var112 = var45 + 15;
                arg0.method3735(field734, field719 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                arg0.method3735(field735, field719 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                int var46 = field719 + 180 - 80;
                short var47 = 321;
                Statics.field728.method1736(var46 - 73, var47 - 20);
                arg0.method3735(class157.field2539, var46, var47 + 5, 16777215, 0);
                int var48 = field719 + 180 + 80;
                Statics.field728.method1736(var48 - 73, var47 - 20);
                arg0.method3735(class157.field2536, var48, var47 + 5, 16777215, 0);
            } else if (field732 == 2) {
                short var49 = 211;
                arg0.method3735(field733, field719 + 180, var49, 16776960, 0);
                int var115 = var49 + 15;
                arg0.method3735(field734, field719 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3735(field735, field719 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var118 = var117 + 10;
                arg0.method3733(class157.field2349, field719 + 180 - 110, var118, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field739; arg0.method3729(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3733(class223.method3732(var51) + (field740 == 0 & client.field290 % 40 < 20 ? class2.method2933(16776960) + class2.field19 : ""), field719 + 180 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                arg0.method3733(class157.field2402 + class163.method727(field737) + (field740 == 1 & client.field290 % 40 < 20 ? class2.method2933(16776960) + class2.field19 : ""), field719 + 180 - 108, var115, 16777215, 0);
                var115 += 15;
                int var52 = field719 + 180 - 80;
                short var53 = 321;
                Statics.field728.method1736(var52 - 73, var53 - 20);
                arg0.method3735(class157.field2316, var52, var53 + 5, 16777215, 0);
                int var54 = field719 + 180 + 80;
                Statics.field728.method1736(var54 - 73, var53 - 20);
                arg0.method3735(class157.field2536, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3735(class157.field2537, field719 + 180, var55, 16776960, 0);
            } else if (field732 == 4) {
                arg0.method3735(class157.field2347, field719 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3735(field733, field719 + 180, var56, 16777215, 0);
                int var119 = var56 + 15;
                arg0.method3735(field734, field719 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3735(field735, field719 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method3733(class157.field2531 + class163.method727(Statics.field1867) + (client.field290 % 40 < 20 ? class2.method2933(16776960) + class2.field19 : ""), field719 + 180 - 108, var121, 16777215, 0);
                int var122 = var121 - 8;
                arg0.method3733(class157.field2307, field719 + 180 - 9, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3733(class157.field2308, field719 + 180 - 9, var123, 16776960, 0);
                int var57 = field719 + 180 - 9 + arg0.method3729(class157.field2308) + 15;
                int var58 = var123 - arg0.field3174;
                class81 var59;
                if (field731) {
                    var59 = Statics.field247;
                } else {
                    var59 = Statics.field713;
                }
                var59.method1736(var57, var58);
                var119 = var123 + 15;
                int var60 = field719 + 180 - 80;
                short var61 = 321;
                Statics.field728.method1736(var60 - 73, var61 - 20);
                arg0.method3735(class157.field2539, var60, var61 + 5, 16777215, 0);
                int var62 = field719 + 180 + 80;
                Statics.field728.method1736(var62 - 73, var61 - 20);
                arg0.method3735(class157.field2536, var62, var61 + 5, 16777215, 0);
                arg1.method3735(class157.field2525, field719 + 180, var61 + 36, 255, 0);
            } else if (field732 == 5) {
                arg0.method3735(class157.field2538, field719 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3735(field733, field719 + 180, var63, 16776960, 0);
                int var124 = var63 + 15;
                arg2.method3735(field734, field719 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg2.method3735(field735, field719 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 14;
                arg0.method3733(class157.field2417, field719 + 180 - 145, var127, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field739; arg0.method3729(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3733(class223.method3732(var65) + (client.field290 % 40 < 20 ? class2.method2933(16776960) + class2.field19 : ""), field719 + 180 - 34, var127, 16777215, 0);
                var124 = var127 + 15;
                int var66 = field719 + 180 - 80;
                short var67 = 321;
                Statics.field728.method1736(var66 - 73, var67 - 20);
                arg0.method3735(class157.field2540, var66, var67 + 5, 16777215, 0);
                int var68 = field719 + 180 + 80;
                Statics.field728.method1736(var68 - 73, var67 - 20);
                arg0.method3735(class157.field2541, var68, var67 + 5, 16777215, 0);
            } else if (field732 == 6) {
                short var69 = 211;
                arg0.method3735(field733, field719 + 180, var69, 16776960, 0);
                int var128 = var69 + 15;
                arg0.method3735(field734, field719 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3735(field735, field719 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var70 = field719 + 180;
                short var71 = 321;
                Statics.field728.method1736(var70 - 73, var71 - 20);
                arg0.method3735(class157.field2541, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field736 > 0) {
            method98(field736);
            field736 = 0;
        }
        short var72 = 256;
        if (field724 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field724 > 768) {
                    Statics.field716[var73] = method102(Statics.field2033[var73], Statics.field722[var73], 1024 - field724);
                } else if (field724 > 256) {
                    Statics.field716[var73] = Statics.field722[var73];
                } else {
                    Statics.field716[var73] = method102(Statics.field722[var73], Statics.field2033[var73], 256 - field724);
                }
            }
        } else if (field725 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field725 > 768) {
                    Statics.field716[var74] = method102(Statics.field2033[var74], Statics.field723[var74], 1024 - field725);
                } else if (field725 > 256) {
                    Statics.field716[var74] = Statics.field723[var74];
                } else {
                    Statics.field716[var74] = method102(Statics.field723[var74], Statics.field2033[var74], 256 - field725);
                }
            }
        } else {
            for (int var75 = 0; var75 < 256; var75++) {
                Statics.field716[var75] = Statics.field2033[var75];
            }
        }
        class80.method1734(field714, 9, field714 + 128, var72 + 7);
        Statics.field171.method1595(field714, 0);
        class80.method1686();
        int var76 = 0;
        int var77 = field714 + Statics.field1379.field1394 * 9;
        for (int var78 = 1; var78 < var72 - 1; var78++) {
            int var79 = (var72 - var78) * field721[var78] / var72;
            int var80 = var79 + 22;
            if (var80 < 0) {
                var80 = 0;
            }
            var76 += var80;
            for (int var81 = var80; var81 < 128; var81++) {
                int var82 = Statics.field1752[var76++];
                if (var82 == 0) {
                    var77++;
                } else {
                    int var84 = 256 - var82;
                    int var85 = Statics.field716[var82];
                    int var86 = Statics.field1379.field1401[var77];
                    Statics.field1379.field1401[var77++] = ((var85 & 0xFF00) * var82 + (var86 & 0xFF00) * var84 & 0xFF0000) + ((var85 & 0xFF00FF) * var82 + (var86 & 0xFF00FF) * var84 & 0xFF00FF00) >> 8;
                }
            }
            var77 += Statics.field1379.field1394 + var80 - 128;
        }
        class80.method1734(field714 + 765 - 128, 9, field714 + 765, var72 + 7);
        Statics.field873.method1595(field714 + 382, 0);
        class80.method1686();
        int var87 = 0;
        int var88 = field714 + Statics.field1379.field1394 * 9 + 24 + 637;
        for (int var89 = 1; var89 < var72 - 1; var89++) {
            int var90 = (var72 - var89) * field721[var89] / var72;
            int var91 = 103 - var90;
            int var92 = var88 + var90;
            for (int var93 = 0; var93 < var91; var93++) {
                int var94 = Statics.field1752[var87++];
                if (var94 == 0) {
                    var92++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field716[var94];
                    int var98 = Statics.field1379.field1401[var92];
                    Statics.field1379.field1401[var92++] = ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) + ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) >> 8;
                }
            }
            var87 += 128 - var91;
            var88 = Statics.field1379.field1394 - var91 - var90 + var92;
        }
        Statics.field281[Statics.field1389.field137 ? 1 : 0].method1736(field714 + 765 - 40, 463);
        if (client.field507 > 5 && client.field358 == 0) {
            if (Statics.field875 == null) {
                Statics.field875 = class77.method671(Statics.field1382, "sl_button", "");
            } else {
                int var99 = field714 + 5;
                short var100 = 463;
                byte var101 = 100;
                byte var102 = 35;
                Statics.field875.method1736(var99, var100);
                arg0.method3735(class157.field2465 + " " + client.field460, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
                if (Statics.field629 == null) {
                    arg1.method3735(class157.field2573, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                } else {
                    arg1.method3735(class157.field2572, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var103 = Statics.field1781.getGraphics();
            Statics.field1379.method1528(var103, 0, 0);
        } catch (Exception var106) {
            Statics.field1781.repaint();
        }
    }

    @ObfuscatedName("client.q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method420(String arg0, String arg1, String arg2) {
        field733 = arg0;
        field734 = arg1;
        field735 = arg2;
    }

    @ObfuscatedName("by.h(Lca;B)V")
    public static final void method1261(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field26.length; var2++) {
            Statics.field26[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field26[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field198[var8] = (Statics.field26[var8 - 1] + Statics.field26[var8 + 1] + Statics.field26[var8 - 128] + Statics.field26[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field26;
            Statics.field26 = Statics.field198;
            Statics.field198 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1422; var11++) {
            for (int var12 = 0; var12 < arg0.field1424; var12++) {
                if (arg0.field1428[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1426;
                    int var14 = var11 + 16 + arg0.field1425;
                    int var15 = (var14 << 7) + var13;
                    Statics.field26[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("d.d(II)V")
    public static final void method98(int arg0) {
        short var1 = 256;
        field715 += arg0 * 128;
        if (field715 > Statics.field26.length) {
            field715 -= Statics.field26.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1261(Statics.field1870[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1752[var3 + var4] - Statics.field26[field715 + var3 & Statics.field26.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1752[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1752[var9 + var10] = 255;
                } else {
                    Statics.field1752[var9 + var10] = 0;
                }
            }
        }
        if (field724 > 0) {
            field724 -= arg0 * 4;
        }
        if (field725 > 0) {
            field725 -= arg0 * 4;
        }
        if (field724 == 0 && field725 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field724 = 1024;
            }
            if (var12 == 1) {
                field725 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field721[var13] = field721[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field721[var14] = (int) (Math.sin((double) field729 / 14.0D) * 16.0D + Math.sin((double) field729 / 15.0D) * 14.0D + Math.sin((double) field729 / 16.0D) * 12.0D);
            field729++;
        }
        field727 += arg0 * 199307871;
        int var15 = ((client.field290 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field727 * -891403748; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1752[(var18 << 7) + var17] = 192;
        }
        field727 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1752[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1752[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field3059[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field3059[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field3059[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1752[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("c.c(IIII)I")
    public static final int method102(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("aw.y(Lw;B)V")
    public static void method730(class26 arg0) {
        if (arg0.method606() != client.field361) {
            client.field361 = arg0.method606();
            boolean var1 = arg0.method606();
            if (Statics.field1148 != var1) {
                class52.method648();
                Statics.field1148 = var1;
            }
        }
        Statics.field796 = arg0.field643;
        client.field460 = arg0.field640;
        client.field287 = arg0.field650;
        Statics.field1055 = client.field288 == 0 ? 43594 : arg0.field640 + 40000;
        Statics.field92 = client.field288 == 0 ? 443 : arg0.field640 + 50000;
        Statics.field2283 = Statics.field1055;
    }

    @ObfuscatedName("cy.m(I)V")
    public static void method1764() {
        if (class26.method2288()) {
            field720 = true;
        }
    }
}
