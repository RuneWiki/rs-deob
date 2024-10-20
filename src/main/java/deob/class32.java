package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("am")
public class class32 {

    @ObfuscatedName("am.e")
    public static int field714 = 0;

    @ObfuscatedName("am.f")
    public static int field722 = field714 + 202;

    @ObfuscatedName("am.s")
    public static int[] field723 = new int[256];

    @ObfuscatedName("am.y")
    public static int field726 = 0;

    @ObfuscatedName("am.d")
    public static int field727 = 0;

    @ObfuscatedName("am.ak")
    public static int field729 = 0;

    @ObfuscatedName("am.au")
    public static int field721 = 0;

    @ObfuscatedName("am.ao")
    public static int field728 = 0;

    @ObfuscatedName("am.am")
    public static int field735 = 0;

    @ObfuscatedName("am.ah")
    public static int field733 = 10;

    @ObfuscatedName("am.aj")
    public static String field747 = "";

    @ObfuscatedName("am.ar")
    public static int field725 = 0;

    @ObfuscatedName("am.ae")
    public static String field736 = "";

    @ObfuscatedName("am.al")
    public static String field745 = "";

    @ObfuscatedName("am.ay")
    public static String field738 = "";

    @ObfuscatedName("am.ag")
    public static String field739 = "";

    @ObfuscatedName("am.ab")
    public static String field740 = "";

    @ObfuscatedName("am.ac")
    public static class159 field741 = class159.field2583;

    @ObfuscatedName("am.ai")
    public static boolean field742 = true;

    @ObfuscatedName("am.an")
    public static int field743 = 0;

    @ObfuscatedName("am.ap")
    public static String field744 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("am.aa")
    public static String field748 = "1234567890";

    @ObfuscatedName("am.av")
    public static boolean field746 = false;

    @ObfuscatedName("am.bf")
    public static int field730 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.l(B)I")
    public static int method893() {
        return 9;
    }

    @ObfuscatedName("do.e(Ljava/awt/Component;Lfo;Lfo;ZII)V")
    public static void method2298(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field734) {
            field725 = arg4;
            class80.method1741();
            byte[] var5 = arg1.method3066("title.jpg", "");
            Statics.field717 = new class79(var5, arg0);
            Statics.field718 = Statics.field717.method1672();
            if ((client.field431 & 0x20000000) == 0) {
                Statics.field3109 = class77.method599(arg2, "logo", "");
            } else {
                Statics.field3109 = class77.method599(arg2, "logo_deadman_mode", "");
            }
            Statics.field737 = class77.method599(arg2, "titlebox", "");
            Statics.field155 = class77.method599(arg2, "titlebutton", "");
            Statics.field716 = class77.method657(arg2, "runes", "");
            Statics.field719 = class77.method657(arg2, "title_mute", "");
            Statics.field732 = class77.method599(arg2, "options_radio_buttons,0", "");
            Statics.field602 = class77.method599(arg2, "options_radio_buttons,2", "");
            Statics.field720 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field720[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field720[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field720[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field720[var9 + 192] = 16777215;
            }
            Statics.field702 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field702[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field702[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field702[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field702[var13 + 192] = 16777215;
            }
            Statics.field2006 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2006[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2006[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2006[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2006[var17 + 192] = 16777215;
            }
            Statics.field724 = new int[256];
            Statics.field1084 = new int[32768];
            Statics.field2040 = new int[32768];
            method2817((class81) null);
            Statics.field290 = new int[32768];
            Statics.field715 = new int[32768];
            if (arg3) {
                field739 = "";
                field740 = "";
            }
            Statics.field2925 = 0;
            Statics.field1880 = "";
            field742 = true;
            field746 = false;
            if (Statics.field1371.field140) {
                class183.method668(2);
            } else {
                class183.method2943(2, Statics.field1868, "scape main", "", 255, false);
            }
            class171.method577(false);
            Statics.field734 = true;
            field714 = (Statics.field1543 - client.field292 * 765) / 2;
            field722 = field714 + 202;
            Statics.field717.method1616(field714, 0);
            Statics.field718.method1616(field714 + 382, 0);
            Statics.field3109.method1761(field714 + 382 - Statics.field3109.field1411 / 2, 18);
        } else if (arg4 == 4) {
            field725 = 4;
        }
    }

    @ObfuscatedName("t.q(Leb;I)V")
    public static void method107(class144 arg0) {
        if (!field746) {
            if ((class140.field2162 == 1 || !Statics.field592 && class140.field2162 == 4) && class140.field2163 >= field714 + 765 - 50 && class140.field2159 >= 453) {
                Statics.field1371.field140 = !Statics.field1371.field140;
                class9.method3716();
                if (Statics.field1371.field140) {
                    Statics.field2941.method3366();
                    class183.field2945 = 1;
                    Statics.field2579 = null;
                } else {
                    class168 var6 = Statics.field1868;
                    int var7 = var6.method3056("scape main");
                    int var8 = var6.method3091(var7, "");
                    class183.method995(var6, var7, var8, 255, false);
                }
            }
            if (client.field303 != 5) {
                field728++;
                if (client.field303 == 10 || client.field303 == 11) {
                    if (client.field301 == 0) {
                        if (class140.field2162 == 1 || !Statics.field592 && class140.field2162 == 4) {
                            int var9 = field714 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class140.field2163 >= var9 && class140.field2163 <= var9 + var11 && class140.field2159 >= var10 && class140.field2159 <= var10 + var12) {
                                if (class26.method2956()) {
                                    field746 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field2024 != null && class26.method2956()) {
                            field746 = true;
                        }
                    }
                    int var13 = class140.field2162;
                    int var14 = class140.field2163;
                    int var15 = class140.field2159;
                    if (!Statics.field592 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field725 == 0) {
                        int var16 = field722 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class138.method2770(client.method2918("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field722 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field431 & 0x4) != 0) {
                                if ((client.field431 & 0x400) == 0) {
                                    field736 = class157.field2513;
                                    field745 = class157.field2514;
                                    field738 = class157.field2515;
                                } else {
                                    field736 = class157.field2355;
                                    field745 = class157.field2520;
                                    field738 = class157.field2359;
                                }
                                field725 = 1;
                                field743 = 0;
                            } else if ((client.field431 & 0x400) == 0) {
                                field736 = class157.field2509;
                                field745 = class157.field2510;
                                field738 = class157.field2352;
                                field725 = 2;
                                field743 = 0;
                            } else {
                                field736 = class157.field2516;
                                field745 = class157.field2385;
                                field738 = class157.field2518;
                                field725 = 1;
                                field743 = 0;
                            }
                        }
                    } else if (field725 == 1) {
                        while (class137.method654()) {
                            if (Statics.field2037 == 84) {
                                field736 = class157.field2509;
                                field745 = class157.field2510;
                                field738 = class157.field2352;
                                field725 = 2;
                                field743 = 0;
                            } else if (Statics.field2037 == 13) {
                                field725 = 0;
                            }
                        }
                        int var19 = field722 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field736 = class157.field2509;
                            field745 = class157.field2510;
                            field738 = class157.field2352;
                            field725 = 2;
                            field743 = 0;
                        }
                        int var21 = field722 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field725 = 0;
                        }
                    } else if (field725 == 2) {
                        short var22 = 231;
                        int var40 = var22 + 30;
                        if (var13 == 1 && var15 >= var40 - 15 && var15 < var40) {
                            field743 = 0;
                        }
                        var40 += 15;
                        if (var13 == 1 && var15 >= var40 - 15 && var15 < var40) {
                            field743 = 1;
                        }
                        var40 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method2964(class157.field2410, class157.field2391, class157.field2443);
                            field725 = 5;
                            return;
                        }
                        int var24 = field722 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field739 = field739.trim();
                            if (field739.length() == 0) {
                                method2964(class157.field2415, class157.field2527, class157.field2549);
                                return;
                            }
                            if (field740.length() == 0) {
                                method2964(class157.field2544, class157.field2419, class157.field2420);
                                return;
                            }
                            method2964(class157.field2524, class157.field2525, class157.field2526);
                            field741 = Statics.field1371.field137.containsKey(class163.method664(field739)) ? class159.field2586 : class159.field2583;
                            client.method2162(20);
                            return;
                        }
                        int var26 = field722 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field725 = 0;
                            field739 = "";
                            field740 = "";
                            Statics.field2925 = 0;
                            Statics.field1880 = "";
                            field742 = true;
                        }
                        while (true) {
                            while (class137.method654()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field744.length(); var28++) {
                                    if (Statics.field1742 == field744.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2037 == 13) {
                                    field725 = 0;
                                    field739 = "";
                                    field740 = "";
                                    Statics.field2925 = 0;
                                    Statics.field1880 = "";
                                    field742 = true;
                                } else if (field743 == 0) {
                                    if (Statics.field2037 == 85 && field739.length() > 0) {
                                        field739 = field739.substring(0, field739.length() - 1);
                                    }
                                    if (Statics.field2037 == 84 || Statics.field2037 == 80) {
                                        field743 = 1;
                                    }
                                    if (var27 && field739.length() < 320) {
                                        field739 = field739 + Statics.field1742;
                                    }
                                } else if (field743 == 1) {
                                    if (Statics.field2037 == 85 && field740.length() > 0) {
                                        field740 = field740.substring(0, field740.length() - 1);
                                    }
                                    if (Statics.field2037 == 84 || Statics.field2037 == 80) {
                                        field743 = 0;
                                    }
                                    if (Statics.field2037 == 84) {
                                        field739 = field739.trim();
                                        if (field739.length() == 0) {
                                            method2964(class157.field2415, class157.field2527, class157.field2549);
                                            return;
                                        }
                                        if (field740.length() == 0) {
                                            method2964(class157.field2544, class157.field2419, class157.field2420);
                                            return;
                                        }
                                        method2964(class157.field2524, class157.field2525, class157.field2526);
                                        field741 = Statics.field1371.field137.containsKey(class163.method664(field739)) ? class159.field2586 : class159.field2583;
                                        client.method2162(20);
                                        return;
                                    }
                                    if (var27 && field740.length() < 20) {
                                        field740 = field740 + Statics.field1742;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field725 == 4) {
                        int var29 = field722 + 180 - 80;
                        short var30 = 321;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            Statics.field1880.trim();
                            if (Statics.field1880.length() != 6) {
                                method2964(class157.field2331, class157.field2332, class157.field2333);
                                return;
                            }
                            Statics.field2925 = Integer.parseInt(Statics.field1880);
                            Statics.field1880 = "";
                            field741 = field742 ? class159.field2589 : class159.field2584;
                            method2964(class157.field2524, class157.field2525, class157.field2526);
                            client.method2162(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field722 + 180 - 9 && var14 <= field722 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field742 = !field742;
                        }
                        if (var13 == 1 && var14 >= field722 + 180 - 34 && var14 <= field722 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class138.method2770(client.method2918("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var31 = field722 + 180 + 80;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field725 = 0;
                            field739 = "";
                            field740 = "";
                            Statics.field2925 = 0;
                            Statics.field1880 = "";
                        }
                        while (class137.method654()) {
                            boolean var32 = false;
                            for (int var33 = 0; var33 < field748.length(); var33++) {
                                if (Statics.field1742 == field748.charAt(var33)) {
                                    var32 = true;
                                    break;
                                }
                            }
                            if (Statics.field2037 == 13) {
                                field725 = 0;
                                field739 = "";
                                field740 = "";
                                Statics.field2925 = 0;
                                Statics.field1880 = "";
                            } else {
                                if (Statics.field2037 == 85 && Statics.field1880.length() > 0) {
                                    Statics.field1880 = Statics.field1880.substring(0, Statics.field1880.length() - 1);
                                }
                                if (Statics.field2037 == 84) {
                                    Statics.field1880.trim();
                                    if (Statics.field1880.length() != 6) {
                                        method2964(class157.field2331, class157.field2332, class157.field2333);
                                        return;
                                    }
                                    Statics.field2925 = Integer.parseInt(Statics.field1880);
                                    Statics.field1880 = "";
                                    field741 = field742 ? class159.field2589 : class159.field2584;
                                    method2964(class157.field2524, class157.field2525, class157.field2526);
                                    client.method2162(20);
                                    return;
                                }
                                if (var32 && Statics.field1880.length() < 6) {
                                    Statics.field1880 = Statics.field1880 + Statics.field1742;
                                }
                            }
                        }
                    } else if (field725 == 5) {
                        int var34 = field722 + 180 - 80;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method159();
                            return;
                        }
                        int var36 = field722 + 180 + 80;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field736 = class157.field2509;
                            field745 = class157.field2510;
                            field738 = class157.field2352;
                            field725 = 2;
                            field743 = 0;
                            field740 = "";
                        }
                        while (class137.method654()) {
                            boolean var37 = false;
                            for (int var38 = 0; var38 < field744.length(); var38++) {
                                if (Statics.field1742 == field744.charAt(var38)) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (Statics.field2037 == 13) {
                                field736 = class157.field2509;
                                field745 = class157.field2510;
                                field738 = class157.field2352;
                                field725 = 2;
                                field743 = 0;
                                field740 = "";
                            } else {
                                if (Statics.field2037 == 85 && field739.length() > 0) {
                                    field739 = field739.substring(0, field739.length() - 1);
                                }
                                if (Statics.field2037 == 84) {
                                    method159();
                                    return;
                                }
                                if (var37 && field739.length() < 320) {
                                    field739 = field739 + Statics.field1742;
                                }
                            }
                        }
                    } else if (field725 == 6) {
                        while (true) {
                            do {
                                if (!class137.method654()) {
                                    short var39 = 321;
                                    if (var13 == 1 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                                        field736 = class157.field2509;
                                        field745 = class157.field2510;
                                        field738 = class157.field2352;
                                        field725 = 2;
                                        field743 = 0;
                                        field740 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2037 != 84 && Statics.field2037 != 13);
                            field736 = class157.field2509;
                            field745 = class157.field2510;
                            field738 = class157.field2352;
                            field725 = 2;
                            field743 = 0;
                            field740 = "";
                        }
                    }
                }
            }
        } else if (class140.field2162 == 1 || !Statics.field592 && class140.field2162 == 4) {
            int var1 = field714 + 280;
            if (class140.field2163 >= var1 && class140.field2163 <= var1 + 14 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                class26.method974(0, 0);
            } else if (class140.field2163 >= var1 + 15 && class140.field2163 <= var1 + 80 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                class26.method974(0, 1);
            } else {
                int var2 = field714 + 390;
                if (class140.field2163 >= var2 && class140.field2163 <= var2 + 14 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                    class26.method974(1, 0);
                } else if (class140.field2163 >= var2 + 15 && class140.field2163 <= var2 + 80 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                    class26.method974(1, 1);
                } else {
                    int var3 = field714 + 500;
                    if (class140.field2163 >= var3 && class140.field2163 <= var3 + 14 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                        class26.method974(2, 0);
                    } else if (class140.field2163 >= var3 + 15 && class140.field2163 <= var3 + 80 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                        class26.method974(2, 1);
                    } else {
                        int var4 = field714 + 610;
                        if (class140.field2163 >= var4 && class140.field2163 <= var4 + 14 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                            class26.method974(3, 0);
                        } else if (class140.field2163 >= var4 + 15 && class140.field2163 <= var4 + 80 && class140.field2159 >= 4 && class140.field2159 <= 18) {
                            class26.method974(3, 1);
                        } else if (class140.field2163 >= field714 + 708 && class140.field2159 >= 4 && class140.field2163 <= field714 + 708 + 50 && class140.field2159 <= 20) {
                            field746 = false;
                            Statics.field717.method1616(field714, 0);
                            Statics.field718.method1616(field714 + 382, 0);
                            Statics.field3109.method1761(field714 + 382 - Statics.field3109.field1411 / 2, 18);
                        } else if (field730 != -1) {
                            class26 var5 = Statics.field660[field730];
                            method580(var5);
                            field746 = false;
                            Statics.field717.method1616(field714, 0);
                            Statics.field718.method1616(field714 + 382, 0);
                            Statics.field3109.method1761(field714 + 382 - Statics.field3109.field1411 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.o(I)V")
    public static void method159() {
        field739 = field739.trim();
        if (field739.length() == 0) {
            method2964(class157.field2410, class157.field2391, class157.field2443);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2918("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class119 var4 = new class119(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1986, var4.field1988, 1000 - var4.field1988);
                if (var5 == -1) {
                    var4.field1988 = 0;
                    long var8 = var4.method2394();
                    var6 = var8;
                    break;
                }
                var4.field1988 += var5;
                if (var4.field1988 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class10.method2942(var6, field739);
        }
        switch(var13) {
            case 2:
                method2964(class157.field2543, class157.field2297, class157.field2545);
                field725 = 6;
                break;
            case 3:
                method2964(class157.field2546, class157.field2554, class157.field2354);
                break;
            case 4:
                method2964(class157.field2440, class157.field2551, class157.field2433);
                break;
            case 5:
                method2964(class157.field2552, class157.field2363, class157.field2486);
                break;
            case 6:
                method2964(class157.field2310, class157.field2556, class157.field2426);
                break;
            case 7:
                method2964(class157.field2558, class157.field2345, class157.field2430);
        }
    }

    @ObfuscatedName("z.g(Lhd;Lhd;Lhd;ZI)V")
    public static void method148(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field714 = (Statics.field1543 - client.field292 * 765) / 2;
            field722 = field714 + 202;
        }
        if (field746) {
            if (Statics.field2693 == null) {
                Statics.field2693 = class77.method582(Statics.field1143, "sl_back", "");
            }
            if (Statics.field12 == null) {
                Statics.field12 = class77.method657(Statics.field1143, "sl_flags", "");
            }
            if (Statics.field2039 == null) {
                Statics.field2039 = class77.method657(Statics.field1143, "sl_arrows", "");
            }
            if (Statics.field122 == null) {
                Statics.field122 = class77.method657(Statics.field1143, "sl_stars", "");
            }
            class80.method1737(field714, 23, 765, 480, 0);
            class80.method1708(field714, 0, 125, 23, 12425273, 9135624);
            class80.method1708(field714 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3755(class157.field2561, field714 + 62, 15, 0, -1);
            if (Statics.field122 != null) {
                Statics.field122[1].method1761(field714 + 140, 1);
                arg1.method3735(class157.field2562, field714 + 152, 10, 16777215, -1);
                Statics.field122[0].method1761(field714 + 140, 12);
                arg1.method3735(class157.field2563, field714 + 152, 21, 16777215, -1);
            }
            if (Statics.field2039 != null) {
                int var4 = field714 + 280;
                if (class26.field638[0] == 0 && class26.field644[0] == 0) {
                    Statics.field2039[2].method1761(var4, 4);
                } else {
                    Statics.field2039[0].method1761(var4, 4);
                }
                if (class26.field638[0] == 0 && class26.field644[0] == 1) {
                    Statics.field2039[3].method1761(var4 + 15, 4);
                } else {
                    Statics.field2039[1].method1761(var4 + 15, 4);
                }
                arg0.method3735(class157.field2564, var4 + 32, 17, 16777215, -1);
                int var5 = field714 + 390;
                if (class26.field638[0] == 1 && class26.field644[0] == 0) {
                    Statics.field2039[2].method1761(var5, 4);
                } else {
                    Statics.field2039[0].method1761(var5, 4);
                }
                if (class26.field638[0] == 1 && class26.field644[0] == 1) {
                    Statics.field2039[3].method1761(var5 + 15, 4);
                } else {
                    Statics.field2039[1].method1761(var5 + 15, 4);
                }
                arg0.method3735(class157.field2539, var5 + 32, 17, 16777215, -1);
                int var6 = field714 + 500;
                if (class26.field638[0] == 2 && class26.field644[0] == 0) {
                    Statics.field2039[2].method1761(var6, 4);
                } else {
                    Statics.field2039[0].method1761(var6, 4);
                }
                if (class26.field638[0] == 2 && class26.field644[0] == 1) {
                    Statics.field2039[3].method1761(var6 + 15, 4);
                } else {
                    Statics.field2039[1].method1761(var6 + 15, 4);
                }
                arg0.method3735(class157.field2566, var6 + 32, 17, 16777215, -1);
                int var7 = field714 + 610;
                if (class26.field638[0] == 3 && class26.field644[0] == 0) {
                    Statics.field2039[2].method1761(var7, 4);
                } else {
                    Statics.field2039[0].method1761(var7, 4);
                }
                if (class26.field638[0] == 3 && class26.field644[0] == 1) {
                    Statics.field2039[3].method1761(var7 + 15, 4);
                } else {
                    Statics.field2039[1].method1761(var7 + 15, 4);
                }
                arg0.method3735(class157.field2567, var7 + 32, 17, 16777215, -1);
            }
            class80.method1737(field714 + 708, 4, 50, 16, 0);
            arg1.method3755(class157.field2560, field714 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field431 & var9;
            for (int var11 = 0; var11 < class26.field645; var11++) {
                class26 var12 = Statics.field660[var11];
                if ((var12.field642 & var9) == var10 || (var12.field642 & var9) == 0) {
                    var8++;
                }
            }
            field730 = -1;
            if (Statics.field2693 != null) {
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
                for (int var27 = 0; var27 < class26.field645; var27++) {
                    class26 var28 = Statics.field660[var27];
                    if ((var28.field642 & var9) == var10 || (var28.field642 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field648);
                        if (var28.field648 == -1) {
                            var30 = class157.field2568;
                            var29 = false;
                        } else if (var28.field648 > 1980) {
                            var30 = class157.field2569;
                            var29 = false;
                        }
                        int var31 = 0;
                        byte var32;
                        if (var28.method608()) {
                            var31 = 16711680;
                            if (var28.method607()) {
                                var32 = 5;
                            } else {
                                var32 = 4;
                            }
                        } else if (var28.method606()) {
                            if (var28.method607()) {
                                var32 = 3;
                            } else {
                                var32 = 2;
                            }
                        } else if (var28.method607()) {
                            var32 = 1;
                        } else {
                            var32 = 0;
                        }
                        if (class140.field2151 >= var24 && class140.field2152 >= var23 && class140.field2151 < var13 + var24 && class140.field2152 < var14 + var23 && var29) {
                            field730 = var27;
                            Statics.field2693[var32].method1622(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field2693[var32].method1616(var24, var23);
                        }
                        if (Statics.field12 != null) {
                            Statics.field12[(var28.method607() ? 8 : 0) + var28.field651].method1761(var24 + 29, var23);
                        }
                        arg0.method3755(Integer.toString(var28.field646), var24 + 15, var14 / 2 + var23 + 5, var31, -1);
                        arg1.method3755(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var33 = arg1.method3730(Statics.field660[field730].field650) + 6;
                    int var34 = arg1.field3176 + 8;
                    class80.method1737(class140.field2151 - var33 / 2, class140.field2152 + 20 + 5, var33, var34, 16777120);
                    class80.method1709(class140.field2151 - var33 / 2, class140.field2152 + 20 + 5, var33, var34, 0);
                    arg1.method3755(Statics.field660[field730].field650, class140.field2151, class140.field2152 + 20 + 5 + arg1.field3176 + 4, 0, -1);
                }
            }
            try {
                Graphics var35 = Statics.field1652.getGraphics();
                Statics.field157.method1536(var35, 0, 0);
            } catch (Exception var106) {
                Statics.field1652.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field717.method1616(field714, 0);
            Statics.field718.method1616(field714 + 382, 0);
            Statics.field3109.method1761(field714 + 382 - Statics.field3109.field1411 / 2, 18);
        }
        if (client.field303 == 0 || client.field303 == 5) {
            byte var37 = 20;
            arg0.method3755(class157.field2508, field722 + 180, 245 - var37, 16777215, -1);
            int var38 = 253 - var37;
            class80.method1709(field722 + 180 - 152, var38, 304, 34, 9179409);
            class80.method1709(field722 + 180 - 151, var38 + 1, 302, 32, 0);
            class80.method1737(field722 + 180 - 150, var38 + 2, field733 * 3, 30, 9179409);
            class80.method1737(field733 * 3 + (field722 + 180 - 150), var38 + 2, 300 - field733 * 3, 30, 0);
            arg0.method3755(field747, field722 + 180, 276 - var37, 16777215, -1);
        }
        if (client.field303 == 20) {
            Statics.field737.method1761(field722 + 180 - Statics.field737.field1411 / 2, 271 - Statics.field737.field1416 / 2);
            short var39 = 211;
            arg0.method3755(field736, field722 + 180, var39, 16776960, 0);
            int var108 = var39 + 15;
            arg0.method3755(field745, field722 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            arg0.method3755(field738, field722 + 180, var109, 16776960, 0);
            int var110 = var109 + 15;
            int var111 = var110 + 10;
            if (field725 != 4) {
                arg0.method3735(class157.field2428, field722 + 180 - 110, var111, 16777215, 0);
                short var40 = 200;
                String var41;
                for (var41 = field739; arg0.method3730(var41) > var40; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method3735(class223.method3734(var41), field722 + 180 - 70, var111, 16777215, 0);
                var108 = var111 + 15;
                arg0.method3735(class157.field2528 + class163.method179(field740), field722 + 180 - 108, var108, 16777215, 0);
                var108 += 15;
            }
        }
        if (client.field303 == 10 || client.field303 == 11) {
            Statics.field737.method1761(field722, 171);
            if (field725 == 0) {
                short var42 = 251;
                arg0.method3755(class157.field2530, field722 + 180, var42, 16776960, 0);
                int var112 = var42 + 30;
                int var43 = field722 + 180 - 80;
                short var44 = 291;
                Statics.field155.method1761(var43 - 73, var44 - 20);
                arg0.method3738(class157.field2531, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var45 = field722 + 180 + 80;
                Statics.field155.method1761(var45 - 73, var44 - 20);
                arg0.method3738(class157.field2482, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field725 == 1) {
                arg0.method3755(class157.field2512, field722 + 180, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3755(field736, field722 + 180, var46, 16777215, 0);
                int var113 = var46 + 15;
                arg0.method3755(field745, field722 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3755(field738, field722 + 180, var114, 16777215, 0);
                int var115 = var114 + 15;
                int var47 = field722 + 180 - 80;
                short var48 = 321;
                Statics.field155.method1761(var47 - 73, var48 - 20);
                arg0.method3755(class157.field2303, var47, var48 + 5, 16777215, 0);
                int var49 = field722 + 180 + 80;
                Statics.field155.method1761(var49 - 73, var48 - 20);
                arg0.method3755(class157.field2560, var49, var48 + 5, 16777215, 0);
            } else if (field725 == 2) {
                short var50 = 211;
                arg0.method3755(field736, field722 + 180, var50, 16776960, 0);
                int var116 = var50 + 15;
                arg0.method3755(field745, field722 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method3755(field738, field722 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                int var119 = var118 + 10;
                arg0.method3735(class157.field2428, field722 + 180 - 110, var119, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field739; arg0.method3730(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3735(class223.method3734(var52) + (field743 == 0 & client.field548 % 40 < 20 ? class2.method195(16776960) + class2.field16 : ""), field722 + 180 - 70, var119, 16777215, 0);
                var116 = var119 + 15;
                arg0.method3735(class157.field2528 + class163.method179(field740) + (field743 == 1 & client.field548 % 40 < 20 ? class2.method195(16776960) + class2.field16 : ""), field722 + 180 - 108, var116, 16777215, 0);
                var116 += 15;
                int var53 = field722 + 180 - 80;
                short var54 = 321;
                Statics.field155.method1761(var53 - 73, var54 - 20);
                arg0.method3755(class157.field2533, var53, var54 + 5, 16777215, 0);
                int var55 = field722 + 180 + 80;
                Statics.field155.method1761(var55 - 73, var54 - 20);
                arg0.method3755(class157.field2560, var55, var54 + 5, 16777215, 0);
                short var56 = 357;
                arg1.method3755(class157.field2535, field722 + 180, var56, 16776960, 0);
            } else if (field725 == 4) {
                arg0.method3755(class157.field2522, field722 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3755(field736, field722 + 180, var57, 16777215, 0);
                int var120 = var57 + 15;
                arg0.method3755(field745, field722 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method3755(field738, field722 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method3735(class157.field2529 + class163.method179(Statics.field1880) + (client.field548 % 40 < 20 ? class2.method195(16776960) + class2.field16 : ""), field722 + 180 - 108, var122, 16777215, 0);
                int var123 = var122 - 8;
                arg0.method3735(class157.field2312, field722 + 180 - 9, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg0.method3735(class157.field2511, field722 + 180 - 9, var124, 16776960, 0);
                int var58 = field722 + 180 - 9 + arg0.method3730(class157.field2511) + 15;
                int var59 = var124 - arg0.field3176;
                class81 var60;
                if (field742) {
                    var60 = Statics.field602;
                } else {
                    var60 = Statics.field732;
                }
                var60.method1761(var58, var59);
                var120 = var124 + 15;
                int var61 = field722 + 180 - 80;
                short var62 = 321;
                Statics.field155.method1761(var61 - 73, var62 - 20);
                arg0.method3755(class157.field2303, var61, var62 + 5, 16777215, 0);
                int var63 = field722 + 180 + 80;
                Statics.field155.method1761(var63 - 73, var62 - 20);
                arg0.method3755(class157.field2560, var63, var62 + 5, 16777215, 0);
                arg1.method3755(class157.field2523, field722 + 180, var62 + 36, 255, 0);
            } else if (field725 == 5) {
                arg0.method3755(class157.field2536, field722 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3755(field736, field722 + 180, var64, 16776960, 0);
                int var125 = var64 + 15;
                arg2.method3755(field745, field722 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg2.method3755(field738, field722 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var128 = var127 + 14;
                arg0.method3735(class157.field2553, field722 + 180 - 145, var128, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field739; arg0.method3730(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3735(class223.method3734(var66) + (client.field548 % 40 < 20 ? class2.method195(16776960) + class2.field16 : ""), field722 + 180 - 34, var128, 16777215, 0);
                var125 = var128 + 15;
                int var67 = field722 + 180 - 80;
                short var68 = 321;
                Statics.field155.method1761(var67 - 73, var68 - 20);
                arg0.method3755(class157.field2487, var67, var68 + 5, 16777215, 0);
                int var69 = field722 + 180 + 80;
                Statics.field155.method1761(var69 - 73, var68 - 20);
                arg0.method3755(class157.field2306, var69, var68 + 5, 16777215, 0);
            } else if (field725 == 6) {
                short var70 = 211;
                arg0.method3755(field736, field722 + 180, var70, 16776960, 0);
                int var129 = var70 + 15;
                arg0.method3755(field745, field722 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                arg0.method3755(field738, field722 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                int var71 = field722 + 180;
                short var72 = 321;
                Statics.field155.method1761(var71 - 73, var72 - 20);
                arg0.method3755(class157.field2306, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field728 > 0) {
            method1080(field728);
            field728 = 0;
        }
        short var73 = 256;
        if (field726 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field726 > 768) {
                    Statics.field724[var74] = method1592(Statics.field720[var74], Statics.field702[var74], 1024 - field726);
                } else if (field726 > 256) {
                    Statics.field724[var74] = Statics.field702[var74];
                } else {
                    Statics.field724[var74] = method1592(Statics.field702[var74], Statics.field720[var74], 256 - field726);
                }
            }
        } else if (field727 > 0) {
            for (int var75 = 0; var75 < 256; var75++) {
                if (field727 > 768) {
                    Statics.field724[var75] = method1592(Statics.field720[var75], Statics.field2006[var75], 1024 - field727);
                } else if (field727 > 256) {
                    Statics.field724[var75] = Statics.field2006[var75];
                } else {
                    Statics.field724[var75] = method1592(Statics.field2006[var75], Statics.field720[var75], 256 - field727);
                }
            }
        } else {
            for (int var76 = 0; var76 < 256; var76++) {
                Statics.field724[var76] = Statics.field720[var76];
            }
        }
        class80.method1701(field714, 9, field714 + 128, var73 + 7);
        Statics.field717.method1616(field714, 0);
        class80.method1700();
        int var77 = 0;
        int var78 = field714 + Statics.field157.field1383 * 9;
        for (int var79 = 1; var79 < var73 - 1; var79++) {
            int var80 = (var73 - var79) * field723[var79] / var73;
            int var81 = var80 + 22;
            if (var81 < 0) {
                var81 = 0;
            }
            var77 += var81;
            for (int var82 = var81; var82 < 128; var82++) {
                int var83 = Statics.field290[var77++];
                if (var83 == 0) {
                    var78++;
                } else {
                    int var85 = 256 - var83;
                    int var86 = Statics.field724[var83];
                    int var87 = Statics.field157.field1387[var78];
                    Statics.field157.field1387[var78++] = ((var86 & 0xFF00) * var83 + (var87 & 0xFF00) * var85 & 0xFF0000) + ((var86 & 0xFF00FF) * var83 + (var87 & 0xFF00FF) * var85 & 0xFF00FF00) >> 8;
                }
            }
            var78 += Statics.field157.field1383 + var81 - 128;
        }
        class80.method1701(field714 + 765 - 128, 9, field714 + 765, var73 + 7);
        Statics.field718.method1616(field714 + 382, 0);
        class80.method1700();
        int var88 = 0;
        int var89 = field714 + Statics.field157.field1383 * 9 + 24 + 637;
        for (int var90 = 1; var90 < var73 - 1; var90++) {
            int var91 = (var73 - var90) * field723[var90] / var73;
            int var92 = 103 - var91;
            int var93 = var89 + var91;
            for (int var94 = 0; var94 < var92; var94++) {
                int var95 = Statics.field290[var88++];
                if (var95 == 0) {
                    var93++;
                } else {
                    int var97 = 256 - var95;
                    int var98 = Statics.field724[var95];
                    int var99 = Statics.field157.field1387[var93];
                    Statics.field157.field1387[var93++] = ((var98 & 0xFF00) * var95 + (var99 & 0xFF00) * var97 & 0xFF0000) + ((var98 & 0xFF00FF) * var95 + (var99 & 0xFF00FF) * var97 & 0xFF00FF00) >> 8;
                }
            }
            var88 += 128 - var92;
            var89 = Statics.field157.field1383 - var92 - var91 + var93;
        }
        Statics.field719[Statics.field1371.field140 ? 1 : 0].method1761(field714 + 765 - 40, 463);
        if (client.field303 > 5 && client.field301 == 0) {
            if (Statics.field227 == null) {
                Statics.field227 = class77.method599(Statics.field1143, "sl_button", "");
            } else {
                int var100 = field714 + 5;
                short var101 = 463;
                byte var102 = 100;
                byte var103 = 35;
                Statics.field227.method1761(var100, var101);
                arg0.method3755(class157.field2521 + " " + client.field544, var102 / 2 + var100, var103 / 2 + var101 - 2, 16777215, 0);
                if (Statics.field2024 == null) {
                    arg1.method3755(class157.field2571, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                } else {
                    arg1.method3755(class157.field2351, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var104 = Statics.field1652.getGraphics();
            Statics.field157.method1536(var104, 0, 0);
        } catch (Exception var107) {
            Statics.field1652.repaint();
        }
    }

    @ObfuscatedName("fl.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2964(String arg0, String arg1, String arg2) {
        field736 = arg0;
        field745 = arg1;
        field738 = arg2;
    }

    @ObfuscatedName("ea.b(Lco;I)V")
    public static final void method2817(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1084.length; var2++) {
            Statics.field1084[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1084[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2040[var8] = (Statics.field1084[var8 - 1] + Statics.field1084[var8 + 1] + Statics.field1084[var8 - 128] + Statics.field1084[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1084;
            Statics.field1084 = Statics.field2040;
            Statics.field2040 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1416; var11++) {
            for (int var12 = 0; var12 < arg0.field1411; var12++) {
                if (arg0.field1412[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1413;
                    int var14 = var11 + 16 + arg0.field1414;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1084[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bz.p(II)V")
    public static final void method1080(int arg0) {
        short var1 = 256;
        field729 += arg0 * 128;
        if (field729 > Statics.field1084.length) {
            field729 -= Statics.field1084.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2817(Statics.field716[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field290[var3 + var4] - Statics.field1084[field729 + var3 & Statics.field1084.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field290[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field290[var9 + var10] = 255;
                } else {
                    Statics.field290[var9 + var10] = 0;
                }
            }
        }
        if (field726 > 0) {
            field726 -= arg0 * 4;
        }
        if (field727 > 0) {
            field727 -= arg0 * 4;
        }
        if (field726 == 0 && field727 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field726 = 1024;
            }
            if (var12 == 1) {
                field727 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field723[var13] = field723[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field723[var14] = (int) (Math.sin((double) field735 / 14.0D) * 16.0D + Math.sin((double) field735 / 15.0D) * 14.0D + Math.sin((double) field735 / 16.0D) * 12.0D);
            field735++;
        }
        field721 += arg0 * -1898548605;
        int var15 = ((client.field548 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field721 * -1798029108; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field290[(var18 << 7) + var17] = 192;
        }
        field721 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field290[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field290[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field715[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field715[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field715[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field290[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bq.t(IIII)I")
    public static final int method1592(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("h.w(Li;B)V")
    public static void method580(class26 arg0) {
        if (arg0.method607() != client.field504) {
            client.field504 = arg0.method607();
            class52.method160(arg0.method607());
        }
        Statics.field1036 = arg0.field657;
        client.field544 = arg0.field646;
        client.field431 = arg0.field642;
        Statics.field1379 = client.field297 == 0 ? 43594 : arg0.field646 + 40000;
        Statics.field192 = client.field297 == 0 ? 443 : arg0.field646 + 50000;
        Statics.field1967 = Statics.field1379;
    }
}
