package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("az")
public class class32 {

    @ObfuscatedName("az.s")
    public static int field714 = 0;

    @ObfuscatedName("az.z")
    public static int field719 = field714 + 202;

    @ObfuscatedName("az.r")
    public static int[] field720 = new int[256];

    @ObfuscatedName("az.y")
    public static int field713 = 0;

    @ObfuscatedName("az.c")
    public static int field723 = 0;

    @ObfuscatedName("az.au")
    public static int field741 = 0;

    @ObfuscatedName("az.ae")
    public static int field726 = 0;

    @ObfuscatedName("az.ax")
    public static int field727 = 0;

    @ObfuscatedName("az.az")
    public static int field728 = 0;

    @ObfuscatedName("az.aa")
    public static int field729 = 10;

    @ObfuscatedName("az.ak")
    public static String field731 = "";

    @ObfuscatedName("az.ac")
    public static int field733 = 0;

    @ObfuscatedName("az.ar")
    public static String field732 = "";

    @ObfuscatedName("az.ah")
    public static String field737 = "";

    @ObfuscatedName("az.an")
    public static String field734 = "";

    @ObfuscatedName("az.aq")
    public static String field730 = "";

    @ObfuscatedName("az.at")
    public static String field736 = "";

    @ObfuscatedName("az.am")
    public static class159 field747 = class159.field2583;

    @ObfuscatedName("az.ay")
    public static boolean field746 = true;

    @ObfuscatedName("az.aw")
    public static int field740 = 0;

    @ObfuscatedName("az.ap")
    public static String field739 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("az.aj")
    public static String field718 = "1234567890";

    @ObfuscatedName("az.ad")
    public static boolean field744 = false;

    @ObfuscatedName("az.bg")
    public static int field742 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.f(I)I")
    public static int method656() {
        return 9;
    }

    @ObfuscatedName("dr.s(Ljava/awt/Component;Lfx;Lfx;ZII)V")
    public static void method2594(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field724) {
            field733 = arg4;
            class80.method1707();
            byte[] var5 = arg1.method3054("title.jpg", "");
            Statics.field227 = new class79(var5, arg0);
            Statics.field1396 = Statics.field227.method1654();
            if ((client.field398 & 0x20000000) == 0) {
                Statics.field680 = class77.method2284(arg2, "logo", "");
            } else {
                Statics.field680 = class77.method2284(arg2, "logo_deadman_mode", "");
            }
            Statics.field715 = class77.method2284(arg2, "titlebox", "");
            Statics.field716 = class77.method2284(arg2, "titlebutton", "");
            Statics.field2622 = class77.method2619(arg2, "runes", "");
            Statics.field1767 = class77.method2619(arg2, "title_mute", "");
            Statics.field1406 = class77.method2284(arg2, "options_radio_buttons,0", "");
            Statics.field2011 = class77.method2284(arg2, "options_radio_buttons,2", "");
            Statics.field2077 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2077[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2077[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2077[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2077[var9 + 192] = 16777215;
            }
            Statics.field277 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field277[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field277[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field277[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field277[var13 + 192] = 16777215;
            }
            Statics.field721 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field721[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field721[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field721[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field721[var17 + 192] = 16777215;
            }
            Statics.field1619 = new int[256];
            Statics.field657 = new int[32768];
            Statics.field76 = new int[32768];
            method2921((class81) null);
            Statics.field725 = new int[32768];
            Statics.field1742 = new int[32768];
            if (arg3) {
                field730 = "";
                field736 = "";
            }
            Statics.field2917 = 0;
            Statics.field738 = "";
            field746 = true;
            field744 = false;
            if (Statics.field2060.field147) {
                class183.field2950 = 1;
                Statics.field2947 = null;
                Statics.field2944 = -1;
                Statics.field1457 = -1;
                Statics.field63 = 0;
                Statics.field673 = false;
                Statics.field2209 = 2;
            } else {
                class168 var18 = Statics.field108;
                int var19 = var18.method3052("scape main");
                int var20 = var18.method3048(var19, "");
                class183.method1534(2, var18, var19, var20, 255, false);
            }
            class171.method2062(false);
            Statics.field724 = true;
            field714 = (Statics.field882 - client.field315) / 2;
            field719 = field714 + 202;
            Statics.field227.method1622(field714, 0);
            Statics.field1396.method1622(field714 + 382, 0);
            Statics.field680.method1759(field714 + 382 - Statics.field680.field1432 / 2, 18);
        } else if (arg4 == 4) {
            field733 = 4;
        }
    }

    @ObfuscatedName("bs.q(B)V")
    public static void method1497() {
        if (!Statics.field724) {
            return;
        }
        Statics.field715 = null;
        Statics.field716 = null;
        Statics.field2622 = null;
        Statics.field227 = null;
        Statics.field1396 = null;
        Statics.field680 = null;
        Statics.field1767 = null;
        Statics.field1406 = null;
        Statics.field2011 = null;
        Statics.field3109 = null;
        Statics.field745 = null;
        Statics.field735 = null;
        Statics.field1629 = null;
        Statics.field201 = null;
        Statics.field2077 = null;
        Statics.field277 = null;
        Statics.field721 = null;
        Statics.field1619 = null;
        Statics.field657 = null;
        Statics.field76 = null;
        Statics.field725 = null;
        Statics.field1742 = null;
        class183.field2950 = 1;
        Statics.field2947 = null;
        Statics.field2944 = -1;
        Statics.field1457 = -1;
        Statics.field63 = 0;
        Statics.field673 = false;
        Statics.field2209 = 2;
        class171.method2062(true);
        Statics.field724 = false;
    }

    @ObfuscatedName("a.g(Lef;B)V")
    public static void method557(class144 arg0) {
        if (field744) {
            method838(arg0);
            return;
        }
        if ((class140.field2150 == 1 || !Statics.field306 && class140.field2150 == 4) && class140.field2151 >= field714 + 765 - 50 && class140.field2152 >= 453) {
            Statics.field2060.field147 = !Statics.field2060.field147;
            class9.method1958();
            if (Statics.field2060.field147) {
                Statics.field3134.method3380();
                class183.field2950 = 1;
                Statics.field2947 = null;
            } else {
                class168 var1 = Statics.field108;
                int var2 = var1.method3052("scape main");
                int var3 = var1.method3048(var2, "");
                class183.method650(var1, var2, var3, 255, false);
            }
        }
        if (client.field305 == 5) {
            return;
        }
        field727++;
        if (client.field305 != 10 && client.field305 != 11) {
            return;
        }
        if (client.field304 == 0) {
            if (class140.field2150 == 1 || !Statics.field306 && class140.field2150 == 4) {
                int var4 = field714 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class140.field2151 >= var4 && class140.field2151 <= var4 + var6 && class140.field2152 >= var5 && class140.field2152 <= var5 + var7) {
                    if (class26.method2234()) {
                        field744 = true;
                    }
                    return;
                }
            }
            if (Statics.field2628 != null && class26.method2234()) {
                field744 = true;
            }
        }
        int var8 = class140.field2150;
        int var9 = class140.field2151;
        int var10 = class140.field2152;
        if (!Statics.field306 && var8 == 4) {
            var8 = 1;
        }
        if (field733 == 0) {
            int var11 = field719 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class138.method149(client.method929("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = field719 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field398 & 0x4) != 0) {
                    if ((client.field398 & 0x400) == 0) {
                        field732 = class157.field2295;
                        field737 = class157.field2512;
                        field734 = class157.field2513;
                    } else {
                        field732 = class157.field2517;
                        field737 = class157.field2420;
                        field734 = class157.field2494;
                    }
                    field733 = 1;
                    field740 = 0;
                } else if ((client.field398 & 0x400) == 0) {
                    field732 = class157.field2507;
                    field737 = class157.field2315;
                    field734 = class157.field2521;
                    field733 = 2;
                    field740 = 0;
                } else {
                    field732 = class157.field2472;
                    field737 = class157.field2515;
                    field734 = class157.field2335;
                    field733 = 1;
                    field740 = 0;
                }
            }
        } else if (field733 == 1) {
            while (class137.method122()) {
                if (Statics.field1949 == 84) {
                    field732 = class157.field2507;
                    field737 = class157.field2315;
                    field734 = class157.field2521;
                    field733 = 2;
                    field740 = 0;
                } else if (Statics.field1949 == 13) {
                    field733 = 0;
                }
            }
            int var14 = field719 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field732 = class157.field2507;
                field737 = class157.field2315;
                field734 = class157.field2521;
                field733 = 2;
                field740 = 0;
            }
            int var16 = field719 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field733 = 0;
            }
        } else if (field733 == 2) {
            short var17 = 231;
            int var35 = var17 + 30;
            if (var8 == 1 && var10 >= var35 - 15 && var10 < var35) {
                field740 = 0;
            }
            var35 += 15;
            if (var8 == 1 && var10 >= var35 - 15 && var10 < var35) {
                field740 = 1;
            }
            var35 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                Statics.method976(class157.field2538, class157.field2539, class157.field2540);
                field733 = 5;
                return;
            }
            int var19 = field719 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field730 = field730.trim();
                if (field730.length() == 0) {
                    Statics.method976(class157.field2413, class157.field2372, class157.field2498);
                    return;
                }
                if (field736.length() == 0) {
                    Statics.method976(class157.field2332, class157.field2417, class157.field2418);
                    return;
                }
                Statics.method976(class157.field2522, class157.field2523, class157.field2524);
                field747 = Statics.field2060.field151.containsKey(class163.method845(field730)) ? class159.field2580 : class159.field2583;
                client.method3288(20);
                return;
            }
            int var21 = field719 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field733 = 0;
                field730 = "";
                field736 = "";
                Statics.field2917 = 0;
                Statics.field738 = "";
                field746 = true;
            }
            while (true) {
                while (class137.method122()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field739.length(); var23++) {
                        if (Statics.field1167 == field739.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field1949 == 13) {
                        field733 = 0;
                        field730 = "";
                        field736 = "";
                        Statics.field2917 = 0;
                        Statics.field738 = "";
                        field746 = true;
                    } else if (field740 == 0) {
                        if (Statics.field1949 == 85 && field730.length() > 0) {
                            field730 = field730.substring(0, field730.length() - 1);
                        }
                        if (Statics.field1949 == 84 || Statics.field1949 == 80) {
                            field740 = 1;
                        }
                        if (var22 && field730.length() < 320) {
                            field730 = field730 + Statics.field1167;
                        }
                    } else if (field740 == 1) {
                        if (Statics.field1949 == 85 && field736.length() > 0) {
                            field736 = field736.substring(0, field736.length() - 1);
                        }
                        if (Statics.field1949 == 84 || Statics.field1949 == 80) {
                            field740 = 0;
                        }
                        if (Statics.field1949 == 84) {
                            field730 = field730.trim();
                            if (field730.length() == 0) {
                                Statics.method976(class157.field2413, class157.field2372, class157.field2498);
                                return;
                            }
                            if (field736.length() == 0) {
                                Statics.method976(class157.field2332, class157.field2417, class157.field2418);
                                return;
                            }
                            Statics.method976(class157.field2522, class157.field2523, class157.field2524);
                            field747 = Statics.field2060.field151.containsKey(class163.method845(field730)) ? class159.field2580 : class159.field2583;
                            client.method3288(20);
                            return;
                        }
                        if (var22 && field736.length() < 20) {
                            field736 = field736 + Statics.field1167;
                        }
                    }
                }
                return;
            }
        } else if (field733 == 4) {
            int var24 = field719 + 180 - 80;
            short var25 = 321;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                Statics.field738.trim();
                if (Statics.field738.length() != 6) {
                    Statics.method976(class157.field2356, class157.field2330, class157.field2331);
                    return;
                }
                Statics.field2917 = Integer.parseInt(Statics.field738);
                Statics.field738 = "";
                field747 = field746 ? class159.field2579 : class159.field2581;
                Statics.method976(class157.field2522, class157.field2523, class157.field2524);
                client.method3288(20);
                return;
            }
            if (var8 == 1 && var9 >= field719 + 180 - 9 && var9 <= field719 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field746 = !field746;
            }
            if (var8 == 1 && var9 >= field719 + 180 - 34 && var9 <= field719 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class138.method149(client.method929("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var26 = field719 + 180 + 80;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field733 = 0;
                field730 = "";
                field736 = "";
                Statics.field2917 = 0;
                Statics.field738 = "";
            }
            while (class137.method122()) {
                boolean var27 = false;
                for (int var28 = 0; var28 < field718.length(); var28++) {
                    if (Statics.field1167 == field718.charAt(var28)) {
                        var27 = true;
                        break;
                    }
                }
                if (Statics.field1949 == 13) {
                    field733 = 0;
                    field730 = "";
                    field736 = "";
                    Statics.field2917 = 0;
                    Statics.field738 = "";
                } else {
                    if (Statics.field1949 == 85 && Statics.field738.length() > 0) {
                        Statics.field738 = Statics.field738.substring(0, Statics.field738.length() - 1);
                    }
                    if (Statics.field1949 == 84) {
                        Statics.field738.trim();
                        if (Statics.field738.length() != 6) {
                            Statics.method976(class157.field2356, class157.field2330, class157.field2331);
                            return;
                        }
                        Statics.field2917 = Integer.parseInt(Statics.field738);
                        Statics.field738 = "";
                        field747 = field746 ? class159.field2579 : class159.field2581;
                        Statics.method976(class157.field2522, class157.field2523, class157.field2524);
                        client.method3288(20);
                        return;
                    }
                    if (var27 && Statics.field738.length() < 6) {
                        Statics.field738 = Statics.field738 + Statics.field1167;
                    }
                }
            }
        } else if (field733 == 5) {
            int var29 = field719 + 180 - 80;
            short var30 = 321;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                method45();
                return;
            }
            int var31 = field719 + 180 + 80;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                field732 = class157.field2507;
                field737 = class157.field2315;
                field734 = class157.field2521;
                field733 = 2;
                field740 = 0;
                field736 = "";
            }
            while (class137.method122()) {
                boolean var32 = false;
                for (int var33 = 0; var33 < field739.length(); var33++) {
                    if (Statics.field1167 == field739.charAt(var33)) {
                        var32 = true;
                        break;
                    }
                }
                if (Statics.field1949 == 13) {
                    field732 = class157.field2507;
                    field737 = class157.field2315;
                    field734 = class157.field2521;
                    field733 = 2;
                    field740 = 0;
                    field736 = "";
                } else {
                    if (Statics.field1949 == 85 && field730.length() > 0) {
                        field730 = field730.substring(0, field730.length() - 1);
                    }
                    if (Statics.field1949 == 84) {
                        method45();
                        return;
                    }
                    if (var32 && field730.length() < 320) {
                        field730 = field730 + Statics.field1167;
                    }
                }
            }
        } else if (field733 == 6) {
            while (true) {
                do {
                    if (!class137.method122()) {
                        short var34 = 321;
                        if (var8 == 1 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                            field732 = class157.field2507;
                            field737 = class157.field2315;
                            field734 = class157.field2521;
                            field733 = 2;
                            field740 = 0;
                            field736 = "";
                        }
                        return;
                    }
                } while (Statics.field1949 != 84 && Statics.field1949 != 13);
                field732 = class157.field2507;
                field737 = class157.field2315;
                field734 = class157.field2521;
                field733 = 2;
                field740 = 0;
                field736 = "";
            }
        }
    }

    @ObfuscatedName("g.m(I)V")
    public static void method45() {
        field730 = field730.trim();
        if (field730.length() == 0) {
            Statics.method976(class157.field2538, class157.field2539, class157.field2540);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method929("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2000, var4.field1994, 1000 - var4.field1994);
                if (var5 == -1) {
                    var4.field1994 = 0;
                    long var8 = var4.method2398();
                    var6 = var8;
                    break;
                }
                var4.field1994 += var5;
                if (var4.field1994 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var42) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field730;
            Random var15 = new Random();
            class119 var16 = new class119(128);
            class119 var17 = new class119(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2426(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2351(var15.nextInt());
            }
            var16.method2351(var18[0]);
            var16.method2351(var18[1]);
            var16.method2442(var6);
            var16.method2442(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2351(var15.nextInt());
            }
            var16.method2383(class10.field164, class10.field163);
            var17.method2426(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2351(var15.nextInt());
            }
            var17.method2442(var15.nextLong());
            var17.method2352(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class149.field2220.method3868(0L);
                class149.field2220.method3870(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var41) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2357(var22, 0, 24);
            var17.method2442(var15.nextLong());
            var17.method2383(class10.field164, class10.field163);
            int var26 = class119.method1572(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class119 var27 = new class119(var26);
            var27.method2354(var14);
            var27.field1994 = var26;
            var27.method2379(var18);
            class119 var28 = new class119(var27.field1994 + var17.field1994 + var16.field1994 + 5);
            var28.method2426(2);
            var28.method2426(var16.field1994);
            var28.method2357(var16.field2000, 0, var16.field1994);
            var28.method2426(var17.field1994);
            var28.method2357(var17.field2000, 0, var17.field1994);
            var28.method2349(var27.field1994);
            var28.method2357(var27.field2000, 0, var27.field1994);
            String var29 = class161.method47(var28.field2000);
            byte var36;
            try {
                URL var30 = new URL(client.method929("services", false) + "m=accountappeal/login.ws");
                URLConnection var31 = var30.openConnection();
                var31.setDoInput(true);
                var31.setDoOutput(true);
                var31.setConnectTimeout(5000);
                OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
                var32.write("data2=" + class226.method2641(var29) + "&dest=" + class226.method2641("passwordchoice.ws"));
                var32.flush();
                InputStream var33 = var31.getInputStream();
                class119 var34 = new class119(new byte[1000]);
                while (true) {
                    int var35 = var33.read(var34.field2000, var34.field1994, 1000 - var34.field1994);
                    if (var35 == -1) {
                        var32.close();
                        var33.close();
                        String var37 = new String(var34.field2000);
                        if (var37.startsWith("OFFLINE")) {
                            var36 = 4;
                        } else if (var37.startsWith("WRONG")) {
                            var36 = 7;
                        } else if (var37.startsWith("RELOAD")) {
                            var36 = 3;
                        } else if (var37.startsWith("Not permitted for social network accounts.")) {
                            var36 = 6;
                        } else {
                            var34.method2516(var18);
                            while (var34.field1994 > 0 && var34.field2000[var34.field1994 - 1] == 0) {
                                var34.field1994--;
                            }
                            String var38 = new String(var34.field2000, 0, var34.field1994);
                            if (class10.method227(var38)) {
                                class138.method149(var38, true, false);
                                var36 = 2;
                            } else {
                                var36 = 5;
                            }
                        }
                        break;
                    }
                    var34.field1994 += var35;
                    if (var34.field1994 >= 1000) {
                        var36 = 5;
                        break;
                    }
                }
            } catch (Throwable var40) {
                var40.printStackTrace();
                var36 = 5;
            }
            var13 = var36;
        }
        switch(var13) {
            case 2:
                Statics.method976(class157.field2541, class157.field2542, class157.field2543);
                field733 = 6;
                break;
            case 3:
                Statics.method976(class157.field2544, class157.field2461, class157.field2546);
                break;
            case 4:
                Statics.method976(class157.field2547, class157.field2548, class157.field2427);
                break;
            case 5:
                Statics.method976(class157.field2550, class157.field2551, class157.field2552);
                break;
            case 6:
                Statics.method976(class157.field2378, class157.field2554, class157.field2555);
                break;
            case 7:
                Statics.method976(class157.field2429, class157.field2557, class157.field2558);
        }
    }

    @ObfuscatedName("client.t(Lhb;Lhb;Lhb;ZI)V")
    public static void method549(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field714 = (Statics.field882 - client.field315) / 2;
            field719 = field714 + 202;
        }
        if (field744) {
            method180(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field227.method1622(field714, 0);
            Statics.field1396.method1622(field714 + 382, 0);
            Statics.field680.method1759(field714 + 382 - Statics.field680.field1432 / 2, 18);
        }
        if (client.field305 == 0 || client.field305 == 5) {
            byte var4 = 20;
            arg0.method3771(class157.field2334, field719 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1714(field719 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1714(field719 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1746(field719 + 180 - 150, var5 + 2, field729 * 3, 30, 9179409);
            class80.method1746(field729 * 3 + (field719 + 180 - 150), var5 + 2, 300 - field729 * 3, 30, 0);
            arg0.method3771(field731, field719 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field305 == 20) {
            Statics.field715.method1759(field719 + 180 - Statics.field715.field1432 / 2, 271 - Statics.field715.field1437 / 2);
            short var6 = 211;
            arg0.method3771(field732, field719 + 180, var6, 16776960, 0);
            int var59 = var6 + 15;
            arg0.method3771(field737, field719 + 180, var59, 16776960, 0);
            int var60 = var59 + 15;
            arg0.method3771(field734, field719 + 180, var60, 16776960, 0);
            int var61 = var60 + 15;
            int var62 = var61 + 10;
            if (field733 != 4) {
                arg0.method3796(class157.field2525, field719 + 180 - 110, var62, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field730; arg0.method3764(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3796(class223.method3774(var8), field719 + 180 - 70, var62, 16777215, 0);
                var59 = var62 + 15;
                String var10 = class157.field2414;
                String var11 = field736;
                String var12 = class163.method1066('*', var11.length());
                arg0.method3796(var10 + var12, field719 + 180 - 108, var59, 16777215, 0);
                var59 += 15;
            }
        }
        if (client.field305 == 10 || client.field305 == 11) {
            Statics.field715.method1759(field719, 171);
            if (field733 == 0) {
                short var13 = 251;
                arg0.method3771(class157.field2528, field719 + 180, var13, 16776960, 0);
                int var63 = var13 + 30;
                int var14 = field719 + 180 - 80;
                short var15 = 291;
                Statics.field716.method1759(var14 - 73, var15 - 20);
                arg0.method3759(class157.field2529, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field719 + 180 + 80;
                Statics.field716.method1759(var16 - 73, var15 - 20);
                arg0.method3759(class157.field2449, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field733 == 1) {
                arg0.method3771(class157.field2510, field719 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3771(field732, field719 + 180, var17, 16777215, 0);
                int var64 = var17 + 15;
                arg0.method3771(field737, field719 + 180, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method3771(field734, field719 + 180, var65, 16777215, 0);
                int var66 = var65 + 15;
                int var18 = field719 + 180 - 80;
                short var19 = 321;
                Statics.field716.method1759(var18 - 73, var19 - 20);
                arg0.method3771(class157.field2301, var18, var19 + 5, 16777215, 0);
                int var20 = field719 + 180 + 80;
                Statics.field716.method1759(var20 - 73, var19 - 20);
                arg0.method3771(class157.field2409, var20, var19 + 5, 16777215, 0);
            } else if (field733 == 2) {
                short var21 = 211;
                arg0.method3771(field732, field719 + 180, var21, 16776960, 0);
                int var67 = var21 + 15;
                arg0.method3771(field737, field719 + 180, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method3771(field734, field719 + 180, var68, 16776960, 0);
                int var69 = var68 + 15;
                int var70 = var69 + 10;
                arg0.method3796(class157.field2525, field719 + 180 - 110, var70, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field730; arg0.method3764(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3796(class223.method3774(var23) + (field740 == 0 & client.field577 % 40 < 20 ? class2.method4(16776960) + class2.field17 : ""), field719 + 180 - 70, var70, 16777215, 0);
                var67 = var70 + 15;
                String var25 = class157.field2414;
                String var26 = field736;
                String var27 = class163.method1066('*', var26.length());
                arg0.method3796(var25 + var27 + (field740 == 1 & client.field577 % 40 < 20 ? class2.method4(16776960) + class2.field17 : ""), field719 + 180 - 108, var67, 16777215, 0);
                var67 += 15;
                int var28 = field719 + 180 - 80;
                short var29 = 321;
                Statics.field716.method1759(var28 - 73, var29 - 20);
                arg0.method3771(class157.field2452, var28, var29 + 5, 16777215, 0);
                int var30 = field719 + 180 + 80;
                Statics.field716.method1759(var30 - 73, var29 - 20);
                arg0.method3771(class157.field2409, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3771(class157.field2533, field719 + 180, var31, 16776960, 0);
            } else if (field733 == 4) {
                arg0.method3771(class157.field2371, field719 + 180, 211, 16776960, 0);
                short var32 = 236;
                arg0.method3771(field732, field719 + 180, var32, 16777215, 0);
                int var71 = var32 + 15;
                arg0.method3771(field737, field719 + 180, var71, 16777215, 0);
                int var72 = var71 + 15;
                arg0.method3771(field734, field719 + 180, var72, 16777215, 0);
                int var73 = var72 + 15;
                String var34 = class157.field2527;
                String var35 = Statics.field738;
                String var36 = class163.method1066('*', var35.length());
                arg0.method3796(var34 + var36 + (client.field577 % 40 < 20 ? class2.method4(16776960) + class2.field17 : ""), field719 + 180 - 108, var73, 16777215, 0);
                int var74 = var73 - 8;
                arg0.method3796(class157.field2303, field719 + 180 - 9, var74, 16776960, 0);
                int var75 = var74 + 15;
                arg0.method3796(class157.field2381, field719 + 180 - 9, var75, 16776960, 0);
                int var37 = field719 + 180 - 9 + arg0.method3764(class157.field2381) + 15;
                int var38 = var75 - arg0.field3175;
                class81 var39;
                if (field746) {
                    var39 = Statics.field2011;
                } else {
                    var39 = Statics.field1406;
                }
                var39.method1759(var37, var38);
                var71 = var75 + 15;
                int var40 = field719 + 180 - 80;
                short var41 = 321;
                Statics.field716.method1759(var40 - 73, var41 - 20);
                arg0.method3771(class157.field2301, var40, var41 + 5, 16777215, 0);
                int var42 = field719 + 180 + 80;
                Statics.field716.method1759(var42 - 73, var41 - 20);
                arg0.method3771(class157.field2409, var42, var41 + 5, 16777215, 0);
                arg1.method3771(class157.field2408, field719 + 180, var41 + 36, 255, 0);
            } else if (field733 == 5) {
                arg0.method3771(class157.field2501, field719 + 180, 201, 16776960, 0);
                short var43 = 221;
                arg2.method3771(field732, field719 + 180, var43, 16776960, 0);
                int var76 = var43 + 15;
                arg2.method3771(field737, field719 + 180, var76, 16776960, 0);
                int var77 = var76 + 15;
                arg2.method3771(field734, field719 + 180, var77, 16776960, 0);
                int var78 = var77 + 15;
                int var79 = var78 + 14;
                arg0.method3796(class157.field2535, field719 + 180 - 145, var79, 16777215, 0);
                short var44 = 174;
                String var45;
                for (var45 = field730; arg0.method3764(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method3796(class223.method3774(var45) + (client.field577 % 40 < 20 ? class2.method4(16776960) + class2.field17 : ""), field719 + 180 - 34, var79, 16777215, 0);
                var76 = var79 + 15;
                int var46 = field719 + 180 - 80;
                short var47 = 321;
                Statics.field716.method1759(var46 - 73, var47 - 20);
                arg0.method3771(class157.field2536, var46, var47 + 5, 16777215, 0);
                int var48 = field719 + 180 + 80;
                Statics.field716.method1759(var48 - 73, var47 - 20);
                arg0.method3771(class157.field2537, var48, var47 + 5, 16777215, 0);
            } else if (field733 == 6) {
                short var49 = 211;
                arg0.method3771(field732, field719 + 180, var49, 16776960, 0);
                int var80 = var49 + 15;
                arg0.method3771(field737, field719 + 180, var80, 16776960, 0);
                int var81 = var80 + 15;
                arg0.method3771(field734, field719 + 180, var81, 16776960, 0);
                int var82 = var81 + 15;
                int var50 = field719 + 180;
                short var51 = 321;
                Statics.field716.method1759(var50 - 73, var51 - 20);
                arg0.method3771(class157.field2537, var50, var51 + 5, 16777215, 0);
            }
        }
        if (field727 > 0) {
            method152(field727);
            field727 = 0;
        }
        method3308();
        Statics.field1767[Statics.field2060.field147 ? 1 : 0].method1759(field714 + 765 - 40, 463);
        if (client.field305 > 5 && client.field304 == 0) {
            if (Statics.field201 == null) {
                Statics.field201 = class77.method2284(Statics.field1751, "sl_button", "");
            } else {
                int var52 = field714 + 5;
                short var53 = 463;
                byte var54 = 100;
                byte var55 = 35;
                Statics.field201.method1759(var52, var53);
                arg0.method3771(class157.field2309 + " " + client.field441, var54 / 2 + var52, var55 / 2 + var53 - 2, 16777215, 0);
                if (Statics.field2628 == null) {
                    arg1.method3771(class157.field2363, var54 / 2 + var52, var55 / 2 + var53 + 12, 16777215, 0);
                } else {
                    arg1.method3771(class157.field2568, var54 / 2 + var52, var55 / 2 + var53 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var56 = Statics.field176.getGraphics();
            Statics.field2056.method1541(var56, 0, 0);
        } catch (Exception var58) {
            Statics.field176.repaint();
        }
    }

    @ObfuscatedName("eo.n(Lcu;I)V")
    public static final void method2921(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field657.length; var2++) {
            Statics.field657[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field657[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field76[var8] = (Statics.field657[var8 - 1] + Statics.field657[var8 + 1] + Statics.field657[var8 - 128] + Statics.field657[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field657;
            Statics.field657 = Statics.field76;
            Statics.field76 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1437; var11++) {
            for (int var12 = 0; var12 < arg0.field1432; var12++) {
                if (arg0.field1435[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1434;
                    int var14 = var11 + 16 + arg0.field1433;
                    int var15 = (var14 << 7) + var13;
                    Statics.field657[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("o.l(II)V")
    public static final void method152(int arg0) {
        short var1 = 256;
        field741 += arg0 * 128;
        if (field741 > Statics.field657.length) {
            field741 -= Statics.field657.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2921(Statics.field2622[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field725[var3 + var4] - Statics.field657[field741 + var3 & Statics.field657.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field725[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field725[var9 + var10] = 255;
                } else {
                    Statics.field725[var9 + var10] = 0;
                }
            }
        }
        if (field713 > 0) {
            field713 -= arg0 * 4;
        }
        if (field723 > 0) {
            field723 -= arg0 * 4;
        }
        if (field713 == 0 && field723 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field713 = 1024;
            }
            if (var12 == 1) {
                field723 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field720[var13] = field720[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field720[var14] = (int) (Math.sin((double) field728 / 14.0D) * 16.0D + Math.sin((double) field728 / 15.0D) * 14.0D + Math.sin((double) field728 / 16.0D) * 12.0D);
            field728++;
        }
        field726 += arg0 * 1836869705;
        int var15 = ((client.field577 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field726 * 1112794436; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field725[(var18 << 7) + var17] = 192;
        }
        field726 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field725[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field725[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1742[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1742[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1742[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field725[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ci.i(IIII)I")
    public static final int method2046(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fn.w(B)V")
    public static final void method3308() {
        short var0 = 256;
        if (field713 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field713 > 768) {
                    Statics.field1619[var1] = method2046(Statics.field2077[var1], Statics.field277[var1], 1024 - field713);
                } else if (field713 > 256) {
                    Statics.field1619[var1] = Statics.field277[var1];
                } else {
                    Statics.field1619[var1] = method2046(Statics.field277[var1], Statics.field2077[var1], 256 - field713);
                }
            }
        } else if (field723 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field723 > 768) {
                    Statics.field1619[var2] = method2046(Statics.field2077[var2], Statics.field721[var2], 1024 - field723);
                } else if (field723 > 256) {
                    Statics.field1619[var2] = Statics.field721[var2];
                } else {
                    Statics.field1619[var2] = method2046(Statics.field721[var2], Statics.field2077[var2], 256 - field723);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1619[var3] = Statics.field2077[var3];
            }
        }
        class80.method1703(field714, 9, field714 + 128, var0 + 7);
        Statics.field227.method1622(field714, 0);
        class80.method1748();
        int var4 = 0;
        int var5 = field714 + Statics.field2056.field1403 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field720[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field725[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1619[var10];
                    int var14 = Statics.field2056.field1404[var5];
                    Statics.field2056.field1404[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field2056.field1403 + var8 - 128;
        }
        class80.method1703(field714 + 765 - 128, 9, field714 + 765, var0 + 7);
        Statics.field1396.method1622(field714 + 382, 0);
        class80.method1748();
        int var15 = 0;
        int var16 = field714 + Statics.field2056.field1403 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field720[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field725[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1619[var22];
                    int var26 = Statics.field2056.field1404[var20];
                    Statics.field2056.field1404[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2056.field1403 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("r.v(Lhb;Lhb;I)V")
    public static void method180(class224 arg0, class224 arg1) {
        if (Statics.field3109 == null) {
            Statics.field3109 = class77.method654(Statics.field1751, "sl_back", "");
        }
        if (Statics.field745 == null) {
            Statics.field745 = class77.method2619(Statics.field1751, "sl_flags", "");
        }
        if (Statics.field735 == null) {
            Statics.field735 = class77.method2619(Statics.field1751, "sl_arrows", "");
        }
        if (Statics.field1629 == null) {
            Statics.field1629 = class77.method2619(Statics.field1751, "sl_stars", "");
        }
        class80.method1746(field714, 23, 765, 480, 0);
        class80.method1709(field714, 0, 125, 23, 12425273, 9135624);
        class80.method1709(field714 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3771(class157.field2456, field714 + 62, 15, 0, -1);
        if (Statics.field1629 != null) {
            Statics.field1629[1].method1759(field714 + 140, 1);
            arg1.method3796(class157.field2560, field714 + 152, 10, 16777215, -1);
            Statics.field1629[0].method1759(field714 + 140, 12);
            arg1.method3796(class157.field2561, field714 + 152, 21, 16777215, -1);
        }
        if (Statics.field735 != null) {
            int var2 = field714 + 280;
            if (class26.field641[0] == 0 && class26.field645[0] == 0) {
                Statics.field735[2].method1759(var2, 4);
            } else {
                Statics.field735[0].method1759(var2, 4);
            }
            if (class26.field641[0] == 0 && class26.field645[0] == 1) {
                Statics.field735[3].method1759(var2 + 15, 4);
            } else {
                Statics.field735[1].method1759(var2 + 15, 4);
            }
            arg0.method3796(class157.field2562, var2 + 32, 17, 16777215, -1);
            int var3 = field714 + 390;
            if (class26.field641[0] == 1 && class26.field645[0] == 0) {
                Statics.field735[2].method1759(var3, 4);
            } else {
                Statics.field735[0].method1759(var3, 4);
            }
            if (class26.field641[0] == 1 && class26.field645[0] == 1) {
                Statics.field735[3].method1759(var3 + 15, 4);
            } else {
                Statics.field735[1].method1759(var3 + 15, 4);
            }
            arg0.method3796(class157.field2440, var3 + 32, 17, 16777215, -1);
            int var4 = field714 + 500;
            if (class26.field641[0] == 2 && class26.field645[0] == 0) {
                Statics.field735[2].method1759(var4, 4);
            } else {
                Statics.field735[0].method1759(var4, 4);
            }
            if (class26.field641[0] == 2 && class26.field645[0] == 1) {
                Statics.field735[3].method1759(var4 + 15, 4);
            } else {
                Statics.field735[1].method1759(var4 + 15, 4);
            }
            arg0.method3796(class157.field2564, var4 + 32, 17, 16777215, -1);
            int var5 = field714 + 610;
            if (class26.field641[0] == 3 && class26.field645[0] == 0) {
                Statics.field735[2].method1759(var5, 4);
            } else {
                Statics.field735[0].method1759(var5, 4);
            }
            if (class26.field641[0] == 3 && class26.field645[0] == 1) {
                Statics.field735[3].method1759(var5 + 15, 4);
            } else {
                Statics.field735[1].method1759(var5 + 15, 4);
            }
            arg0.method3796(class157.field2565, var5 + 32, 17, 16777215, -1);
        }
        class80.method1746(field714 + 708, 4, 50, 16, 0);
        arg1.method3771(class157.field2409, field714 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field398 & var7;
        for (int var9 = 0; var9 < class26.field643; var9++) {
            class26 var10 = Statics.field2727[var9];
            if ((var10.field646 & var7) == var8 || (var10.field646 & var7) == 0) {
                var6++;
            }
        }
        field742 = -1;
        if (Statics.field3109 != null) {
            byte var11 = 88;
            byte var12 = 19;
            int var13 = 765 / (var11 + 1);
            int var14 = 480 / (var12 + 1);
            int var15;
            int var16;
            do {
                var15 = var14;
                var16 = var13;
                if ((var13 - 1) * var14 >= var6) {
                    var13--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
            } while (var14 != var15 || var13 != var16);
            int var17 = (765 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (480 - var12 * var14) / (var14 + 1);
            if (var18 > 5) {
                var18 = 5;
            }
            int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
            int var21 = var20 + 23;
            int var22 = field714 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class26.field643; var25++) {
                class26 var26 = Statics.field2727[var25];
                if ((var26.field646 & var7) == var8 || (var26.field646 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field648);
                    if (var26.field648 == -1) {
                        var28 = class157.field2317;
                        var27 = false;
                    } else if (var26.field648 > 1980) {
                        var28 = class157.field2508;
                        var27 = false;
                    }
                    int var29 = 0;
                    byte var30;
                    if (var26.method592()) {
                        var29 = 16711680;
                        if (var26.method588()) {
                            var30 = 5;
                        } else {
                            var30 = 4;
                        }
                    } else if (var26.method590()) {
                        if (var26.method588()) {
                            var30 = 3;
                        } else {
                            var30 = 2;
                        }
                    } else if (var26.method588()) {
                        var30 = 1;
                    } else {
                        var30 = 0;
                    }
                    if (class140.field2144 >= var22 && class140.field2138 >= var21 && class140.field2144 < var11 + var22 && class140.field2138 < var12 + var21 && var27) {
                        field742 = var25;
                        Statics.field3109[var30].method1628(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        Statics.field3109[var30].method1622(var22, var21);
                    }
                    if (Statics.field745 != null) {
                        Statics.field745[(var26.method588() ? 8 : 0) + var26.field652].method1759(var22 + 29, var21);
                    }
                    arg0.method3771(Integer.toString(var26.field647), var22 + 15, var12 / 2 + var21 + 5, var29, -1);
                    arg1.method3771(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
                    var21 += var12 + var18;
                    var23++;
                    if (var23 >= var14) {
                        var21 = var20 + 23;
                        var22 += var11 + var17;
                        var23 = 0;
                    }
                }
            }
            if (var24) {
                int var31 = arg1.method3764(Statics.field2727[field742].field651) + 6;
                int var32 = arg1.field3175 + 8;
                class80.method1746(class140.field2144 - var31 / 2, class140.field2138 + 20 + 5, var31, var32, 16777120);
                class80.method1714(class140.field2144 - var31 / 2, class140.field2138 + 20 + 5, var31, var32, 0);
                arg1.method3771(Statics.field2727[field742].field651, class140.field2144, class140.field2138 + 20 + 5 + arg1.field3175 + 4, 0, -1);
            }
        }
        try {
            Graphics var33 = Statics.field176.getGraphics();
            Statics.field2056.method1541(var33, 0, 0);
        } catch (Exception var35) {
            Statics.field176.repaint();
        }
    }

    @ObfuscatedName("av.o(Lef;I)V")
    public static void method838(class144 arg0) {
        if (class140.field2150 != 1 && Statics.field306 || class140.field2150 != 4) {
            return;
        }
        int var1 = field714 + 280;
        if (class140.field2151 >= var1 && class140.field2151 <= var1 + 14 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(0, 0);
            return;
        }
        if (class140.field2151 >= var1 + 15 && class140.field2151 <= var1 + 80 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(0, 1);
            return;
        }
        int var2 = field714 + 390;
        if (class140.field2151 >= var2 && class140.field2151 <= var2 + 14 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(1, 0);
            return;
        }
        if (class140.field2151 >= var2 + 15 && class140.field2151 <= var2 + 80 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(1, 1);
            return;
        }
        int var3 = field714 + 500;
        if (class140.field2151 >= var3 && class140.field2151 <= var3 + 14 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(2, 0);
            return;
        }
        if (class140.field2151 >= var3 + 15 && class140.field2151 <= var3 + 80 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(2, 1);
            return;
        }
        int var4 = field714 + 610;
        if (class140.field2151 >= var4 && class140.field2151 <= var4 + 14 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(3, 0);
            return;
        }
        if (class140.field2151 >= var4 + 15 && class140.field2151 <= var4 + 80 && class140.field2152 >= 4 && class140.field2152 <= 18) {
            class26.method2670(3, 1);
            return;
        }
        if (class140.field2151 >= field714 + 708 && class140.field2152 >= 4 && class140.field2151 <= field714 + 708 + 50 && class140.field2152 <= 20) {
            field744 = false;
            Statics.field227.method1622(field714, 0);
            Statics.field1396.method1622(field714 + 382, 0);
            Statics.field680.method1759(field714 + 382 - Statics.field680.field1432 / 2, 18);
            return;
        }
        if (field742 == -1) {
            return;
        }
        class26 var5 = Statics.field2727[field742];
        method2795(var5);
        field744 = false;
        Statics.field227.method1622(field714, 0);
        Statics.field1396.method1622(field714 + 382, 0);
        Statics.field680.method1759(field714 + 382 - Statics.field680.field1432 / 2, 18);
        return;
    }

    @ObfuscatedName("er.p(Le;I)V")
    public static void method2795(class26 arg0) {
        if (arg0.method588() != client.field570) {
            client.field570 = arg0.method588();
            class52.method735(arg0.method588());
        }
        Statics.field2285 = arg0.field642;
        client.field441 = arg0.field647;
        client.field398 = arg0.field646;
        Statics.field1749 = client.field301 == 0 ? 43594 : arg0.field647 + 40000;
        Statics.field198 = client.field301 == 0 ? 443 : arg0.field647 + 50000;
        Statics.field2715 = Statics.field1749;
    }
}
