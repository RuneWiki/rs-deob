package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("ap")
public class class32 {

    @ObfuscatedName("ap.m")
    public static int field717 = 0;

    @ObfuscatedName("ap.g")
    public static int field726 = field717 + 202;

    @ObfuscatedName("ap.a")
    public static int[] field736 = new int[256];

    @ObfuscatedName("ap.n")
    public static int field729 = 0;

    @ObfuscatedName("ap.j")
    public static int field747 = 0;

    @ObfuscatedName("ap.af")
    public static int field731 = 0;

    @ObfuscatedName("ap.ab")
    public static int field750 = 0;

    @ObfuscatedName("ap.ax")
    public static int field720 = 0;

    @ObfuscatedName("ap.ap")
    public static int field734 = 0;

    @ObfuscatedName("ap.as")
    public static int field735 = 10;

    @ObfuscatedName("ap.av")
    public static String field719 = "";

    @ObfuscatedName("ap.am")
    public static int field737 = 0;

    @ObfuscatedName("ap.aa")
    public static String field738 = "";

    @ObfuscatedName("ap.aq")
    public static String field739 = "";

    @ObfuscatedName("ap.ad")
    public static String field740 = "";

    @ObfuscatedName("ap.ar")
    public static String field741 = "";

    @ObfuscatedName("ap.ag")
    public static String field742 = "";

    @ObfuscatedName("ap.ae")
    public static class159 field743 = class159.field2580;

    @ObfuscatedName("ap.ac")
    public static boolean field745 = true;

    @ObfuscatedName("ap.ay")
    public static int field725 = 0;

    @ObfuscatedName("ap.al")
    public static String field727 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ap.at")
    public static String field754 = "1234567890";

    @ObfuscatedName("ap.aw")
    public static boolean field749 = false;

    @ObfuscatedName("ap.bl")
    public static int field732 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.h(Lfv;Lfv;B)I")
    public static int method2641(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3025("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3025("logo", "")) {
            var2++;
        }
        if (arg1.method3025("titlebox", "")) {
            var2++;
        }
        if (arg1.method3025("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3025("runes", "")) {
            var2++;
        }
        if (arg1.method3025("title_mute", "")) {
            var2++;
        }
        if (arg1.method3009("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3009("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3025("sl_back", "");
        arg1.method3025("sl_flags", "");
        arg1.method3025("sl_arrows", "");
        arg1.method3025("sl_stars", "");
        arg1.method3025("sl_button", "");
        return var2;
    }

    @ObfuscatedName("e.m(Ljava/awt/Component;Lfv;Lfv;ZII)V")
    public static void method602(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field746) {
            field737 = arg4;
            class80.method1697();
            byte[] var5 = arg1.method3049("title.jpg", "");
            Statics.field721 = new class79(var5, arg0);
            Statics.field1044 = Statics.field721.method1566();
            Statics.field627 = class77.method29(arg2, "logo", "");
            Statics.field723 = class77.method29(arg2, "titlebox", "");
            Statics.field728 = class77.method29(arg2, "titlebutton", "");
            Statics.field733 = class77.method45(arg2, "runes", "");
            Statics.field3037 = class77.method45(arg2, "title_mute", "");
            Statics.field722 = class77.method29(arg2, "options_radio_buttons,0", "");
            Statics.field716 = class77.method29(arg2, "options_radio_buttons,2", "");
            Statics.field263 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field263[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field263[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field263[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field263[var9 + 192] = 16777215;
            }
            Statics.field280 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field280[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field280[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field280[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field280[var13 + 192] = 16777215;
            }
            Statics.field718 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field718[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field718[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field718[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field718[var17 + 192] = 16777215;
            }
            Statics.field2903 = new int[256];
            Statics.field2010 = new int[32768];
            Statics.field681 = new int[32768];
            method529((class81) null);
            Statics.field2067 = new int[32768];
            Statics.field186 = new int[32768];
            if (arg3) {
                field741 = "";
                field742 = "";
            }
            Statics.field2069 = 0;
            Statics.field744 = "";
            field745 = true;
            field749 = false;
            if (Statics.field1028.field142) {
                class183.method2633(2);
            } else {
                class183.method1560(2, Statics.field264, "scape main", "", 255, false);
            }
            class171.method556(false);
            Statics.field746 = true;
            field717 = (Statics.field999 - client.field500) / 2;
            field726 = field717 + 202;
            Statics.field721.method1576(field717, 0);
            Statics.field1044.method1576(field717 + 382, 0);
            Statics.field627.method1721(field717 + 382 - Statics.field627.field1431 / 2, 18);
        } else if (arg4 == 4) {
            field737 = 4;
        }
    }

    @ObfuscatedName("ai.i(Lec;I)V")
    public static void method604(class144 arg0) {
        if (field749) {
            method2267(arg0);
            return;
        }
        if ((class140.field2160 == 1 || !Statics.field1954 && class140.field2160 == 4) && class140.field2161 >= field717 + 765 - 50 && class140.field2151 >= 453) {
            Statics.field1028.field142 = !Statics.field1028.field142;
            class9.method2738();
            if (Statics.field1028.field142) {
                Statics.field2944.method3348();
                class183.field2943 = 1;
                Statics.field2942 = null;
            } else {
                class168 var1 = Statics.field264;
                int var2 = var1.method3022("scape main");
                int var3 = var1.method3023(var2, "");
                class183.method3635(var1, var2, var3, 255, false);
            }
        }
        if (client.field536 == 5) {
            return;
        }
        field720++;
        if (client.field536 != 10 && client.field536 != 11) {
            return;
        }
        if (client.field315 == 0) {
            if (class140.field2160 == 1 || !Statics.field1954 && class140.field2160 == 4) {
                int var4 = field717 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class140.field2161 >= var4 && class140.field2161 <= var4 + var6 && class140.field2151 >= var5 && class140.field2151 <= var5 + var7) {
                    method854();
                    return;
                }
            }
            if (Statics.field2652 != null) {
                method854();
            }
        }
        int var8 = class140.field2160;
        int var9 = class140.field2161;
        int var10 = class140.field2151;
        if (!Statics.field1954 && var8 == 4) {
            var8 = 1;
        }
        if (field737 == 0) {
            int var11 = field726 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                String var13 = client.method1932("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class138.method428(var13, true, "openjs", false);
            }
            int var14 = field726 + 180 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field287 & 0x4) != 0) {
                    if ((client.field287 & 0x400) == 0) {
                        field738 = class157.field2358;
                        field739 = class157.field2448;
                        field740 = class157.field2387;
                    } else {
                        field738 = class157.field2517;
                        field739 = class157.field2518;
                        field740 = class157.field2519;
                    }
                    field737 = 1;
                    field725 = 0;
                } else if ((client.field287 & 0x400) == 0) {
                    field738 = class157.field2507;
                    field739 = class157.field2508;
                    field740 = class157.field2509;
                    field737 = 2;
                    field725 = 0;
                } else {
                    field738 = class157.field2514;
                    field739 = class157.field2515;
                    field740 = class157.field2516;
                    field737 = 1;
                    field725 = 0;
                }
            }
        } else if (field737 == 1) {
            while (class137.method93()) {
                if (Statics.field1629 == 84) {
                    field738 = class157.field2507;
                    field739 = class157.field2508;
                    field740 = class157.field2509;
                    field737 = 2;
                    field725 = 0;
                } else if (Statics.field1629 == 13) {
                    field737 = 0;
                }
            }
            int var15 = field726 + 180 - 80;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field738 = class157.field2507;
                field739 = class157.field2508;
                field740 = class157.field2509;
                field737 = 2;
                field725 = 0;
            }
            int var17 = field726 + 180 + 80;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field737 = 0;
            }
        } else if (field737 == 2) {
            short var18 = 231;
            int var37 = var18 + 30;
            if (var8 == 1 && var10 >= var37 - 15 && var10 < var37) {
                field725 = 0;
            }
            var37 += 15;
            if (var8 == 1 && var10 >= var37 - 15 && var10 < var37) {
                field725 = 1;
            }
            var37 += 15;
            short var19 = 361;
            if (var8 == 1 && var10 >= var19 - 15 && var10 < var19) {
                method1557(class157.field2538, class157.field2323, class157.field2540);
                field737 = 5;
                return;
            }
            int var20 = field726 + 180 - 80;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field741 = field741.trim();
                if (field741.length() == 0) {
                    method1557(class157.field2413, class157.field2414, class157.field2468);
                    return;
                }
                if (field742.length() == 0) {
                    method1557(class157.field2416, class157.field2417, class157.field2418);
                    return;
                }
                method1557(class157.field2522, class157.field2523, class157.field2524);
                field743 = Statics.field1028.field144.containsKey(class163.method2195(field741)) ? class159.field2581 : class159.field2580;
                client.method158(20);
                return;
            }
            int var22 = field726 + 180 + 80;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field737 = 0;
                field741 = "";
                field742 = "";
                Statics.field2069 = 0;
                Statics.field744 = "";
                field745 = true;
            }
            while (true) {
                while (class137.method93()) {
                    boolean var23 = false;
                    for (int var24 = 0; var24 < field727.length(); var24++) {
                        if (Statics.field2111 == field727.charAt(var24)) {
                            var23 = true;
                            break;
                        }
                    }
                    if (Statics.field1629 == 13) {
                        field737 = 0;
                        field741 = "";
                        field742 = "";
                        Statics.field2069 = 0;
                        Statics.field744 = "";
                        field745 = true;
                    } else if (field725 == 0) {
                        if (Statics.field1629 == 85 && field741.length() > 0) {
                            field741 = field741.substring(0, field741.length() - 1);
                        }
                        if (Statics.field1629 == 84 || Statics.field1629 == 80) {
                            field725 = 1;
                        }
                        if (var23 && field741.length() < 320) {
                            field741 = field741 + Statics.field2111;
                        }
                    } else if (field725 == 1) {
                        if (Statics.field1629 == 85 && field742.length() > 0) {
                            field742 = field742.substring(0, field742.length() - 1);
                        }
                        if (Statics.field1629 == 84 || Statics.field1629 == 80) {
                            field725 = 0;
                        }
                        if (Statics.field1629 == 84) {
                            field741 = field741.trim();
                            if (field741.length() == 0) {
                                method1557(class157.field2413, class157.field2414, class157.field2468);
                                return;
                            }
                            if (field742.length() == 0) {
                                method1557(class157.field2416, class157.field2417, class157.field2418);
                                return;
                            }
                            method1557(class157.field2522, class157.field2523, class157.field2524);
                            field743 = Statics.field1028.field144.containsKey(class163.method2195(field741)) ? class159.field2581 : class159.field2580;
                            client.method158(20);
                            return;
                        }
                        if (var23 && field742.length() < 20) {
                            field742 = field742 + Statics.field2111;
                        }
                    }
                }
                return;
            }
        } else if (field737 == 4) {
            int var25 = field726 + 180 - 80;
            short var26 = 321;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                Statics.field744.trim();
                if (Statics.field744.length() != 6) {
                    method1557(class157.field2464, class157.field2330, class157.field2331);
                    return;
                }
                Statics.field2069 = Integer.parseInt(Statics.field744);
                Statics.field744 = "";
                field743 = field745 ? class159.field2582 : class159.field2586;
                method1557(class157.field2522, class157.field2523, class157.field2524);
                client.method158(20);
                return;
            }
            if (var8 == 1 && var9 >= field726 + 180 - 9 && var9 <= field726 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field745 = !field745;
            }
            if (var8 == 1 && var9 >= field726 + 180 - 34 && var9 <= field726 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                String var27 = client.method1932("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class138.method428(var27, true, "openjs", false);
            }
            int var28 = field726 + 180 + 80;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                field737 = 0;
                field741 = "";
                field742 = "";
                Statics.field2069 = 0;
                Statics.field744 = "";
            }
            while (class137.method93()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field754.length(); var30++) {
                    if (Statics.field2111 == field754.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field1629 == 13) {
                    field737 = 0;
                    field741 = "";
                    field742 = "";
                    Statics.field2069 = 0;
                    Statics.field744 = "";
                } else {
                    if (Statics.field1629 == 85 && Statics.field744.length() > 0) {
                        Statics.field744 = Statics.field744.substring(0, Statics.field744.length() - 1);
                    }
                    if (Statics.field1629 == 84) {
                        Statics.field744.trim();
                        if (Statics.field744.length() != 6) {
                            method1557(class157.field2464, class157.field2330, class157.field2331);
                            return;
                        }
                        Statics.field2069 = Integer.parseInt(Statics.field744);
                        Statics.field744 = "";
                        field743 = field745 ? class159.field2582 : class159.field2586;
                        method1557(class157.field2522, class157.field2523, class157.field2524);
                        client.method158(20);
                        return;
                    }
                    if (var29 && Statics.field744.length() < 6) {
                        Statics.field744 = Statics.field744 + Statics.field2111;
                    }
                }
            }
        } else if (field737 == 5) {
            int var31 = field726 + 180 - 80;
            short var32 = 321;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                method1035();
                return;
            }
            int var33 = field726 + 180 + 80;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                field738 = class157.field2507;
                field739 = class157.field2508;
                field740 = class157.field2509;
                field737 = 2;
                field725 = 0;
                field742 = "";
            }
            while (class137.method93()) {
                boolean var34 = false;
                for (int var35 = 0; var35 < field727.length(); var35++) {
                    if (Statics.field2111 == field727.charAt(var35)) {
                        var34 = true;
                        break;
                    }
                }
                if (Statics.field1629 == 13) {
                    field738 = class157.field2507;
                    field739 = class157.field2508;
                    field740 = class157.field2509;
                    field737 = 2;
                    field725 = 0;
                    field742 = "";
                } else {
                    if (Statics.field1629 == 85 && field741.length() > 0) {
                        field741 = field741.substring(0, field741.length() - 1);
                    }
                    if (Statics.field1629 == 84) {
                        method1035();
                        return;
                    }
                    if (var34 && field741.length() < 320) {
                        field741 = field741 + Statics.field2111;
                    }
                }
            }
        } else if (field737 == 6) {
            while (true) {
                do {
                    if (!class137.method93()) {
                        short var36 = 321;
                        if (var8 == 1 && var10 >= var36 - 20 && var10 <= var36 + 20) {
                            field738 = class157.field2507;
                            field739 = class157.field2508;
                            field740 = class157.field2509;
                            field737 = 2;
                            field725 = 0;
                            field742 = "";
                        }
                        return;
                    }
                } while (Statics.field1629 != 84 && Statics.field1629 != 13);
                field738 = class157.field2507;
                field739 = class157.field2508;
                field740 = class157.field2509;
                field737 = 2;
                field725 = 0;
                field742 = "";
            }
        }
    }

    @ObfuscatedName("an.q(I)V")
    public static void method1035() {
        field741 = field741.trim();
        if (field741.length() == 0) {
            method1557(class157.field2538, class157.field2323, class157.field2540);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1932("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1989, var4.field1988, 1000 - var4.field1988);
                if (var5 == -1) {
                    var4.field1988 = 0;
                    long var8 = var4.method2325();
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
            var13 = class10.method752(var6, field741);
        }
        switch(var13) {
            case 2:
                method1557(class157.field2530, class157.field2542, class157.field2543);
                field737 = 6;
                break;
            case 3:
                method1557(class157.field2544, class157.field2545, class157.field2546);
                break;
            case 4:
                method1557(class157.field2547, class157.field2548, class157.field2441);
                break;
            case 5:
                method1557(class157.field2550, class157.field2551, class157.field2369);
                break;
            case 6:
                method1557(class157.field2553, class157.field2450, class157.field2555);
                break;
            case 7:
                method1557(class157.field2556, class157.field2557, class157.field2558);
        }
    }

    @ObfuscatedName("ds.p(Lhd;Lhd;Lhd;ZI)V")
    public static void method2256(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field717 = (Statics.field999 - client.field500) / 2;
            field726 = field717 + 202;
        }
        if (field749) {
            if (Statics.field656 == null) {
                Statics.field656 = class77.method102(Statics.field1391, "sl_back", "");
            }
            if (Statics.field136 == null) {
                Statics.field136 = class77.method45(Statics.field1391, "sl_flags", "");
            }
            if (Statics.field132 == null) {
                Statics.field132 = class77.method45(Statics.field1391, "sl_arrows", "");
            }
            if (Statics.field2719 == null) {
                Statics.field2719 = class77.method45(Statics.field1391, "sl_stars", "");
            }
            class80.method1663(field717, 23, 765, 480, 0);
            class80.method1664(field717, 0, 125, 23, 12425273, 9135624);
            class80.method1664(field717 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3788(class157.field2356, field717 + 62, 15, 0, -1);
            if (Statics.field2719 != null) {
                Statics.field2719[1].method1721(field717 + 140, 1);
                arg1.method3734(class157.field2326, field717 + 152, 10, 16777215, -1);
                Statics.field2719[0].method1721(field717 + 140, 12);
                arg1.method3734(class157.field2344, field717 + 152, 21, 16777215, -1);
            }
            if (Statics.field132 != null) {
                int var4 = field717 + 280;
                if (class26.field640[0] == 0 && class26.field643[0] == 0) {
                    Statics.field132[2].method1721(var4, 4);
                } else {
                    Statics.field132[0].method1721(var4, 4);
                }
                if (class26.field640[0] == 0 && class26.field643[0] == 1) {
                    Statics.field132[3].method1721(var4 + 15, 4);
                } else {
                    Statics.field132[1].method1721(var4 + 15, 4);
                }
                arg0.method3734(class157.field2562, var4 + 32, 17, 16777215, -1);
                int var5 = field717 + 390;
                if (class26.field640[0] == 1 && class26.field643[0] == 0) {
                    Statics.field132[2].method1721(var5, 4);
                } else {
                    Statics.field132[0].method1721(var5, 4);
                }
                if (class26.field640[0] == 1 && class26.field643[0] == 1) {
                    Statics.field132[3].method1721(var5 + 15, 4);
                } else {
                    Statics.field132[1].method1721(var5 + 15, 4);
                }
                arg0.method3734(class157.field2563, var5 + 32, 17, 16777215, -1);
                int var6 = field717 + 500;
                if (class26.field640[0] == 2 && class26.field643[0] == 0) {
                    Statics.field132[2].method1721(var6, 4);
                } else {
                    Statics.field132[0].method1721(var6, 4);
                }
                if (class26.field640[0] == 2 && class26.field643[0] == 1) {
                    Statics.field132[3].method1721(var6 + 15, 4);
                } else {
                    Statics.field132[1].method1721(var6 + 15, 4);
                }
                arg0.method3734(class157.field2564, var6 + 32, 17, 16777215, -1);
                int var7 = field717 + 610;
                if (class26.field640[0] == 3 && class26.field643[0] == 0) {
                    Statics.field132[2].method1721(var7, 4);
                } else {
                    Statics.field132[0].method1721(var7, 4);
                }
                if (class26.field640[0] == 3 && class26.field643[0] == 1) {
                    Statics.field132[3].method1721(var7 + 15, 4);
                } else {
                    Statics.field132[1].method1721(var7 + 15, 4);
                }
                arg0.method3734(class157.field2565, var7 + 32, 17, 16777215, -1);
            }
            class80.method1663(field717 + 708, 4, 50, 16, 0);
            arg1.method3788(class157.field2304, field717 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field287 & var9;
            for (int var11 = 0; var11 < class26.field637; var11++) {
                class26 var12 = Statics.field676[var11];
                if ((var12.field642 & var9) == var10 || (var12.field642 & var9) == 0) {
                    var8++;
                }
            }
            field732 = -1;
            if (Statics.field656 != null) {
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
                int var24 = field717 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field637; var27++) {
                    class26 var28 = Statics.field676[var27];
                    if ((var28.field642 & var9) == var10 || (var28.field642 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field653);
                        if (var28.field653 == -1) {
                            var30 = class157.field2566;
                            var29 = false;
                        } else if (var28.field653 > 1980) {
                            var30 = class157.field2567;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method598()) {
                            if (var28.method577()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method577()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class140.field2163 >= var24 && class140.field2155 >= var23 && class140.field2163 < var13 + var24 && class140.field2155 < var14 + var23 && var29) {
                            field732 = var27;
                            Statics.field656[var31].method1599(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field656[var31].method1576(var24, var23);
                        }
                        if (Statics.field136 != null) {
                            Statics.field136[(var28.method577() ? 8 : 0) + var28.field646].method1721(var24 + 29, var23);
                        }
                        arg0.method3788(Integer.toString(var28.field641), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3788(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var32 = arg1.method3729(Statics.field676[field732].field645) + 6;
                    int var33 = arg1.field3164 + 8;
                    class80.method1663(class140.field2163 - var32 / 2, class140.field2155 + 20 + 5, var32, var33, 16777120);
                    class80.method1689(class140.field2163 - var32 / 2, class140.field2155 + 20 + 5, var32, var33, 0);
                    arg1.method3788(Statics.field676[field732].field645, class140.field2163, class140.field2155 + 20 + 5 + arg1.field3164 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field2029.getGraphics();
                Statics.field687.method1518(var34, 0, 0);
            } catch (Exception var105) {
                Statics.field2029.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field721.method1576(field717, 0);
            Statics.field1044.method1576(field717 + 382, 0);
            Statics.field627.method1721(field717 + 382 - Statics.field627.field1431 / 2, 18);
        }
        if (client.field536 == 0 || client.field536 == 5) {
            byte var36 = 20;
            arg0.method3788(class157.field2532, field726 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class80.method1689(field726 + 180 - 152, var37, 304, 34, 9179409);
            class80.method1689(field726 + 180 - 151, var37 + 1, 302, 32, 0);
            class80.method1663(field726 + 180 - 150, var37 + 2, field735 * 3, 30, 9179409);
            class80.method1663(field735 * 3 + (field726 + 180 - 150), var37 + 2, 300 - field735 * 3, 30, 0);
            arg0.method3788(field719, field726 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field536 == 20) {
            Statics.field723.method1721(field726 + 180 - Statics.field723.field1431 / 2, 271 - Statics.field723.field1432 / 2);
            short var38 = 211;
            arg0.method3788(field738, field726 + 180, var38, 16776960, 0);
            int var107 = var38 + 15;
            arg0.method3788(field739, field726 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            arg0.method3788(field740, field726 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            int var110 = var109 + 10;
            if (field737 != 4) {
                arg0.method3734(class157.field2525, field726 + 180 - 110, var110, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field741; arg0.method3729(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3734(class223.method3730(var40), field726 + 180 - 70, var110, 16777215, 0);
                var107 = var110 + 15;
                arg0.method3734(class157.field2526 + class163.method3677(field742), field726 + 180 - 108, var107, 16777215, 0);
                var107 += 15;
            }
        }
        if (client.field536 == 10 || client.field536 == 11) {
            Statics.field723.method1721(field726, 171);
            if (field737 == 0) {
                short var41 = 251;
                arg0.method3788(class157.field2378, field726 + 180, var41, 16776960, 0);
                int var111 = var41 + 30;
                int var42 = field726 + 180 - 80;
                short var43 = 291;
                Statics.field728.method1721(var42 - 73, var43 - 20);
                arg0.method3737(class157.field2529, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field726 + 180 + 80;
                Statics.field728.method1721(var44 - 73, var43 - 20);
                arg0.method3737(class157.field2299, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field737 == 1) {
                arg0.method3788(class157.field2510, field726 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3788(field738, field726 + 180, var45, 16777215, 0);
                int var112 = var45 + 15;
                arg0.method3788(field739, field726 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                arg0.method3788(field740, field726 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                int var46 = field726 + 180 - 80;
                short var47 = 321;
                Statics.field728.method1721(var46 - 73, var47 - 20);
                arg0.method3788(class157.field2301, var46, var47 + 5, 16777215, 0);
                int var48 = field726 + 180 + 80;
                Statics.field728.method1721(var48 - 73, var47 - 20);
                arg0.method3788(class157.field2304, var48, var47 + 5, 16777215, 0);
            } else if (field737 == 2) {
                short var49 = 211;
                arg0.method3788(field738, field726 + 180, var49, 16776960, 0);
                int var115 = var49 + 15;
                arg0.method3788(field739, field726 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3788(field740, field726 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var118 = var117 + 10;
                arg0.method3734(class157.field2525, field726 + 180 - 110, var118, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field741; arg0.method3729(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3734(class223.method3730(var51) + (field725 == 0 & client.field295 % 40 < 20 ? class2.method3047(16776960) + class2.field18 : ""), field726 + 180 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                arg0.method3734(class157.field2526 + class163.method3677(field742) + (field725 == 1 & client.field295 % 40 < 20 ? class2.method3047(16776960) + class2.field18 : ""), field726 + 180 - 108, var115, 16777215, 0);
                var115 += 15;
                int var52 = field726 + 180 - 80;
                short var53 = 321;
                Statics.field728.method1721(var52 - 73, var53 - 20);
                arg0.method3788(class157.field2531, var52, var53 + 5, 16777215, 0);
                int var54 = field726 + 180 + 80;
                Statics.field728.method1721(var54 - 73, var53 - 20);
                arg0.method3788(class157.field2304, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3788(class157.field2309, field726 + 180, var55, 16776960, 0);
            } else if (field737 == 4) {
                arg0.method3788(class157.field2520, field726 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3788(field738, field726 + 180, var56, 16777215, 0);
                int var119 = var56 + 15;
                arg0.method3788(field739, field726 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3788(field740, field726 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method3734(class157.field2527 + class163.method3677(Statics.field744) + (client.field295 % 40 < 20 ? class2.method3047(16776960) + class2.field18 : ""), field726 + 180 - 108, var121, 16777215, 0);
                int var122 = var121 - 8;
                arg0.method3734(class157.field2303, field726 + 180 - 9, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3734(class157.field2322, field726 + 180 - 9, var123, 16776960, 0);
                int var57 = field726 + 180 - 9 + arg0.method3729(class157.field2322) + 15;
                int var58 = var123 - arg0.field3164;
                class81 var59;
                if (field745) {
                    var59 = Statics.field716;
                } else {
                    var59 = Statics.field722;
                }
                var59.method1721(var57, var58);
                var119 = var123 + 15;
                int var60 = field726 + 180 - 80;
                short var61 = 321;
                Statics.field728.method1721(var60 - 73, var61 - 20);
                arg0.method3788(class157.field2301, var60, var61 + 5, 16777215, 0);
                int var62 = field726 + 180 + 80;
                Statics.field728.method1721(var62 - 73, var61 - 20);
                arg0.method3788(class157.field2304, var62, var61 + 5, 16777215, 0);
                arg1.method3788(class157.field2521, field726 + 180, var61 + 36, 255, 0);
            } else if (field737 == 5) {
                arg0.method3788(class157.field2534, field726 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3788(field738, field726 + 180, var63, 16776960, 0);
                int var124 = var63 + 15;
                arg2.method3788(field739, field726 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg2.method3788(field740, field726 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 14;
                arg0.method3734(class157.field2463, field726 + 180 - 145, var127, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field741; arg0.method3729(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3734(class223.method3730(var65) + (client.field295 % 40 < 20 ? class2.method3047(16776960) + class2.field18 : ""), field726 + 180 - 34, var127, 16777215, 0);
                var124 = var127 + 15;
                int var66 = field726 + 180 - 80;
                short var67 = 321;
                Statics.field728.method1721(var66 - 73, var67 - 20);
                arg0.method3788(class157.field2504, var66, var67 + 5, 16777215, 0);
                int var68 = field726 + 180 + 80;
                Statics.field728.method1721(var68 - 73, var67 - 20);
                arg0.method3788(class157.field2537, var68, var67 + 5, 16777215, 0);
            } else if (field737 == 6) {
                short var69 = 211;
                arg0.method3788(field738, field726 + 180, var69, 16776960, 0);
                int var128 = var69 + 15;
                arg0.method3788(field739, field726 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3788(field740, field726 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var70 = field726 + 180;
                short var71 = 321;
                Statics.field728.method1721(var70 - 73, var71 - 20);
                arg0.method3788(class157.field2537, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field720 > 0) {
            method1047(field720);
            field720 = 0;
        }
        short var72 = 256;
        if (field729 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field729 > 768) {
                    Statics.field2903[var73] = method1046(Statics.field263[var73], Statics.field280[var73], 1024 - field729);
                } else if (field729 > 256) {
                    Statics.field2903[var73] = Statics.field280[var73];
                } else {
                    Statics.field2903[var73] = method1046(Statics.field280[var73], Statics.field263[var73], 256 - field729);
                }
            }
        } else if (field747 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field747 > 768) {
                    Statics.field2903[var74] = method1046(Statics.field263[var74], Statics.field718[var74], 1024 - field747);
                } else if (field747 > 256) {
                    Statics.field2903[var74] = Statics.field718[var74];
                } else {
                    Statics.field2903[var74] = method1046(Statics.field718[var74], Statics.field263[var74], 256 - field747);
                }
            }
        } else {
            for (int var75 = 0; var75 < 256; var75++) {
                Statics.field2903[var75] = Statics.field263[var75];
            }
        }
        class80.method1679(field717, 9, field717 + 128, var72 + 7);
        Statics.field721.method1576(field717, 0);
        class80.method1656();
        int var76 = 0;
        int var77 = field717 + Statics.field687.field1398 * 9;
        for (int var78 = 1; var78 < var72 - 1; var78++) {
            int var79 = (var72 - var78) * field736[var78] / var72;
            int var80 = var79 + 22;
            if (var80 < 0) {
                var80 = 0;
            }
            var76 += var80;
            for (int var81 = var80; var81 < 128; var81++) {
                int var82 = Statics.field2067[var76++];
                if (var82 == 0) {
                    var77++;
                } else {
                    int var84 = 256 - var82;
                    int var85 = Statics.field2903[var82];
                    int var86 = Statics.field687.field1400[var77];
                    Statics.field687.field1400[var77++] = ((var85 & 0xFF00FF) * var82 + (var86 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var85 & 0xFF00) * var82 + (var86 & 0xFF00) * var84 & 0xFF0000) >> 8;
                }
            }
            var77 += Statics.field687.field1398 + var80 - 128;
        }
        class80.method1679(field717 + 765 - 128, 9, field717 + 765, var72 + 7);
        Statics.field1044.method1576(field717 + 382, 0);
        class80.method1656();
        int var87 = 0;
        int var88 = field717 + Statics.field687.field1398 * 9 + 24 + 637;
        for (int var89 = 1; var89 < var72 - 1; var89++) {
            int var90 = (var72 - var89) * field736[var89] / var72;
            int var91 = 103 - var90;
            int var92 = var88 + var90;
            for (int var93 = 0; var93 < var91; var93++) {
                int var94 = Statics.field2067[var87++];
                if (var94 == 0) {
                    var92++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field2903[var94];
                    int var98 = Statics.field687.field1400[var92];
                    Statics.field687.field1400[var92++] = ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) + ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) >> 8;
                }
            }
            var87 += 128 - var91;
            var88 = Statics.field687.field1398 - var91 - var90 + var92;
        }
        Statics.field3037[Statics.field1028.field142 ? 1 : 0].method1721(field717 + 765 - 40, 463);
        if (client.field536 > 5 && client.field315 == 0) {
            if (Statics.field187 == null) {
                Statics.field187 = class77.method29(Statics.field1391, "sl_button", "");
            } else {
                int var99 = field717 + 5;
                short var100 = 463;
                byte var101 = 100;
                byte var102 = 35;
                Statics.field187.method1721(var99, var100);
                arg0.method3788(class157.field2461 + " " + client.field357, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
                if (Statics.field2652 == null) {
                    arg1.method3788(class157.field2569, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                } else {
                    arg1.method3788(class157.field2568, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var103 = Statics.field2029.getGraphics();
            Statics.field687.method1518(var103, 0, 0);
        } catch (Exception var106) {
            Statics.field2029.repaint();
        }
    }

    @ObfuscatedName("bn.c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1557(String arg0, String arg1, String arg2) {
        field738 = arg0;
        field739 = arg1;
        field740 = arg2;
    }

    @ObfuscatedName("client.f(Lcn;I)V")
    public static final void method529(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2010.length; var2++) {
            Statics.field2010[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2010[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field681[var8] = (Statics.field2010[var8 - 1] + Statics.field2010[var8 + 1] + Statics.field2010[var8 - 128] + Statics.field2010[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2010;
            Statics.field2010 = Statics.field681;
            Statics.field681 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1432; var11++) {
            for (int var12 = 0; var12 < arg0.field1431; var12++) {
                if (arg0.field1430[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1436;
                    int var14 = var11 + 16 + arg0.field1429;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2010[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bm.y(II)V")
    public static final void method1047(int arg0) {
        short var1 = 256;
        field731 += arg0 * 128;
        if (field731 > Statics.field2010.length) {
            field731 -= Statics.field2010.length;
            int var2 = (int) (Math.random() * 12.0D);
            method529(Statics.field733[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2067[var3 + var4] - Statics.field2010[field731 + var3 & Statics.field2010.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2067[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2067[var9 + var10] = 255;
                } else {
                    Statics.field2067[var9 + var10] = 0;
                }
            }
        }
        if (field729 > 0) {
            field729 -= arg0 * 4;
        }
        if (field747 > 0) {
            field747 -= arg0 * 4;
        }
        if (field729 == 0 && field747 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field729 = 1024;
            }
            if (var12 == 1) {
                field747 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field736[var13] = field736[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field736[var14] = (int) (Math.sin((double) field734 / 14.0D) * 16.0D + Math.sin((double) field734 / 15.0D) * 14.0D + Math.sin((double) field734 / 16.0D) * 12.0D);
            field734++;
        }
        field750 += arg0 * -1568799773;
        int var15 = ((client.field295 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field750 * 2047808332; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2067[(var18 << 7) + var17] = 192;
        }
        field750 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2067[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2067[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field186[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field186[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field186[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2067[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bm.w(IIIB)I")
    public static final int method1046(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dk.l(Lec;I)V")
    public static void method2267(class144 arg0) {
        if (class140.field2160 != 1 && Statics.field1954 || class140.field2160 != 4) {
            return;
        }
        int var1 = field717 + 280;
        if (class140.field2161 >= var1 && class140.field2161 <= var1 + 14 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(0, 0);
            return;
        }
        if (class140.field2161 >= var1 + 15 && class140.field2161 <= var1 + 80 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(0, 1);
            return;
        }
        int var2 = field717 + 390;
        if (class140.field2161 >= var2 && class140.field2161 <= var2 + 14 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(1, 0);
            return;
        }
        if (class140.field2161 >= var2 + 15 && class140.field2161 <= var2 + 80 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(1, 1);
            return;
        }
        int var3 = field717 + 500;
        if (class140.field2161 >= var3 && class140.field2161 <= var3 + 14 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(2, 0);
            return;
        }
        if (class140.field2161 >= var3 + 15 && class140.field2161 <= var3 + 80 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(2, 1);
            return;
        }
        int var4 = field717 + 610;
        if (class140.field2161 >= var4 && class140.field2161 <= var4 + 14 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(3, 0);
            return;
        }
        if (class140.field2161 >= var4 + 15 && class140.field2161 <= var4 + 80 && class140.field2151 >= 4 && class140.field2151 <= 18) {
            class26.method86(3, 1);
            return;
        }
        if (class140.field2161 >= field717 + 708 && class140.field2151 >= 4 && class140.field2161 <= field717 + 708 + 50 && class140.field2151 <= 20) {
            field749 = false;
            Statics.field721.method1576(field717, 0);
            Statics.field1044.method1576(field717 + 382, 0);
            Statics.field627.method1721(field717 + 382 - Statics.field627.field1431 / 2, 18);
            return;
        }
        if (field732 == -1) {
            return;
        }
        class26 var5 = Statics.field676[field732];
        method726(var5);
        field749 = false;
        Statics.field721.method1576(field717, 0);
        Statics.field1044.method1576(field717 + 382, 0);
        Statics.field627.method1721(field717 + 382 - Statics.field627.field1431 / 2, 18);
        return;
    }

    @ObfuscatedName("ag.v(Le;B)V")
    public static void method726(class26 arg0) {
        if (arg0.method577() != client.field290) {
            client.field290 = arg0.method577();
            boolean var1 = arg0.method577();
            if (Statics.field784 != var1) {
                class52.method571();
                Statics.field784 = var1;
            }
        }
        Statics.field2278 = arg0.field644;
        client.field357 = arg0.field641;
        client.field287 = arg0.field642;
        Statics.field2070 = client.field324 == 0 ? 43594 : arg0.field641 + 40000;
        Statics.field322 = client.field324 == 0 ? 443 : arg0.field641 + 50000;
        Statics.field248 = Statics.field2070;
    }

    @ObfuscatedName("az.k(B)V")
    public static void method854() {
        if (class26.method614()) {
            field749 = true;
        }
    }
}
