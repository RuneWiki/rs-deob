package deob;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("as")
public class class32 {

    @ObfuscatedName("as.q")
    public static int field754 = 0;

    @ObfuscatedName("as.x")
    public static int field741 = field754 + 202;

    @ObfuscatedName("as.w")
    public static int[] field737 = new int[256];

    @ObfuscatedName("as.z")
    public static int field746 = 0;

    @ObfuscatedName("as.e")
    public static int field739 = 0;

    @ObfuscatedName("as.ad")
    public static int field736 = 0;

    @ObfuscatedName("as.af")
    public static int field740 = 0;

    @ObfuscatedName("as.ag")
    public static int field742 = 0;

    @ObfuscatedName("as.as")
    public static int field743 = 0;

    @ObfuscatedName("as.al")
    public static int field744 = 10;

    @ObfuscatedName("as.am")
    public static String field745 = "";

    @ObfuscatedName("as.ar")
    public static int field732 = 0;

    @ObfuscatedName("as.ap")
    public static String field734 = "";

    @ObfuscatedName("as.ac")
    public static String field748 = "";

    @ObfuscatedName("as.ab")
    public static String field749 = "";

    @ObfuscatedName("as.an")
    public static String field750 = "";

    @ObfuscatedName("as.ak")
    public static String field751 = "";

    @ObfuscatedName("as.ay")
    public static class159 field752 = class159.field2587;

    @ObfuscatedName("as.aw")
    public static boolean field753 = true;

    @ObfuscatedName("as.av")
    public static int field747 = 0;

    @ObfuscatedName("as.aq")
    public static String field756 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("as.ax")
    public static String field757 = "1234567890";

    @ObfuscatedName("as.ae")
    public static boolean field733 = false;

    @ObfuscatedName("as.bq")
    public static int field738 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.h(Lfv;Lfv;I)I")
    public static int method2980(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3098("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3098("logo", "")) {
            var2++;
        }
        if (arg1.method3098("titlebox", "")) {
            var2++;
        }
        if (arg1.method3098("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3098("runes", "")) {
            var2++;
        }
        if (arg1.method3098("title_mute", "")) {
            var2++;
        }
        if (arg1.method3087("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3087("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3098("sl_back", "");
        arg1.method3098("sl_flags", "");
        arg1.method3098("sl_arrows", "");
        arg1.method3098("sl_stars", "");
        arg1.method3098("sl_button", "");
        return var2;
    }

    @ObfuscatedName("al.q(I)I")
    public static int method691() {
        return 8;
    }

    @ObfuscatedName("dh.n(Ley;B)V")
    public static void method2323(class144 arg0) {
        if (!field733) {
            if ((class140.field2140 == 1 || !Statics.field2584 && class140.field2140 == 4) && class140.field2146 >= field754 + 765 - 50 && class140.field2132 >= 453) {
                Statics.field2871.field154 = !Statics.field2871.field154;
                class9.method2589();
                if (Statics.field2871.field154) {
                    Statics.field2926.method3426();
                    class183.field2927 = 1;
                    Statics.field174 = null;
                } else {
                    class168 var6 = Statics.field2019;
                    int var7 = var6.method3084("scape main");
                    int var8 = var6.method3076(var7, "");
                    class183.method3296(var6, var7, var8, 255, false);
                }
            }
            if (client.field304 != 5) {
                field742++;
                if (client.field304 == 10 || client.field304 == 11) {
                    if (client.field302 == 0) {
                        if (class140.field2140 == 1 || !Statics.field2584 && class140.field2140 == 4) {
                            int var9 = field754 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class140.field2146 >= var9 && class140.field2146 <= var9 + var11 && class140.field2132 >= var10 && class140.field2132 <= var10 + var12) {
                                if (class26.method689()) {
                                    field733 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field2265 != null && class26.method689()) {
                            field733 = true;
                        }
                    }
                    int var13 = class140.field2140;
                    int var14 = class140.field2146;
                    int var15 = class140.field2132;
                    if (!Statics.field2584 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field732 == 0) {
                        int var16 = field741 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            label698: {
                                String var18 = client.method955("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var18));
                                        break label698;
                                    } catch (Exception var44) {
                                    }
                                }
                                if (class138.field2120.startsWith("win")) {
                                    Statics.method764(var18, 0);
                                } else if (class138.field2120.startsWith("mac")) {
                                    class138.method1054(var18, 1, "openjs");
                                } else {
                                    Statics.method764(var18, 2);
                                }
                            }
                        }
                        int var20 = field741 + 180 + 80;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field467 & 0x4) != 0) {
                                if ((client.field467 & 0x400) == 0) {
                                    field734 = class157.field2519;
                                    field748 = class157.field2337;
                                    field749 = class157.field2521;
                                } else {
                                    field734 = class157.field2525;
                                    field748 = class157.field2526;
                                    field749 = class157.field2527;
                                }
                                field732 = 1;
                                field747 = 0;
                            } else if ((client.field467 & 0x400) == 0) {
                                field734 = class157.field2537;
                                field748 = class157.field2462;
                                field749 = class157.field2517;
                                field732 = 2;
                                field747 = 0;
                            } else {
                                field734 = class157.field2522;
                                field748 = class157.field2523;
                                field749 = class157.field2524;
                                field732 = 1;
                                field747 = 0;
                            }
                        }
                    } else if (field732 == 1) {
                        while (class137.method2692()) {
                            if (Statics.field802 == 84) {
                                field734 = class157.field2537;
                                field748 = class157.field2462;
                                field749 = class157.field2517;
                                field732 = 2;
                                field747 = 0;
                            } else if (Statics.field802 == 13) {
                                field732 = 0;
                            }
                        }
                        int var21 = field741 + 180 - 80;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field734 = class157.field2537;
                            field748 = class157.field2462;
                            field749 = class157.field2517;
                            field732 = 2;
                            field747 = 0;
                        }
                        int var23 = field741 + 180 + 80;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field732 = 0;
                        }
                    } else if (field732 == 2) {
                        short var24 = 231;
                        int var46 = var24 + 30;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field747 = 0;
                        }
                        var46 += 15;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field747 = 1;
                        }
                        var46 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            method2171(class157.field2546, class157.field2547, class157.field2532);
                            field732 = 5;
                            return;
                        }
                        int var26 = field741 + 180 - 80;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field750 = field750.trim();
                            if (field750.length() == 0) {
                                method2171(class157.field2421, class157.field2422, class157.field2423);
                                return;
                            }
                            if (field751.length() == 0) {
                                method2171(class157.field2436, class157.field2425, class157.field2497);
                                return;
                            }
                            method2171(class157.field2303, class157.field2345, class157.field2567);
                            field752 = Statics.field2871.field155.containsKey(class163.method2327(field750)) ? class159.field2585 : class159.field2587;
                            client.method2652(20);
                            return;
                        }
                        int var28 = field741 + 180 + 80;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field732 = 0;
                            field750 = "";
                            field751 = "";
                            Statics.field2865 = 0;
                            Statics.field755 = "";
                            field753 = true;
                        }
                        while (true) {
                            while (class137.method2692()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field756.length(); var30++) {
                                    if (Statics.field590 == field756.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field802 == 13) {
                                    field732 = 0;
                                    field750 = "";
                                    field751 = "";
                                    Statics.field2865 = 0;
                                    Statics.field755 = "";
                                    field753 = true;
                                } else if (field747 == 0) {
                                    if (Statics.field802 == 85 && field750.length() > 0) {
                                        field750 = field750.substring(0, field750.length() - 1);
                                    }
                                    if (Statics.field802 == 84 || Statics.field802 == 80) {
                                        field747 = 1;
                                    }
                                    if (var29 && field750.length() < 320) {
                                        field750 = field750 + Statics.field590;
                                    }
                                } else if (field747 == 1) {
                                    if (Statics.field802 == 85 && field751.length() > 0) {
                                        field751 = field751.substring(0, field751.length() - 1);
                                    }
                                    if (Statics.field802 == 84 || Statics.field802 == 80) {
                                        field747 = 0;
                                    }
                                    if (Statics.field802 == 84) {
                                        field750 = field750.trim();
                                        if (field750.length() == 0) {
                                            method2171(class157.field2421, class157.field2422, class157.field2423);
                                            return;
                                        }
                                        if (field751.length() == 0) {
                                            method2171(class157.field2436, class157.field2425, class157.field2497);
                                            return;
                                        }
                                        method2171(class157.field2303, class157.field2345, class157.field2567);
                                        field752 = Statics.field2871.field155.containsKey(class163.method2327(field750)) ? class159.field2585 : class159.field2587;
                                        client.method2652(20);
                                        return;
                                    }
                                    if (var29 && field751.length() < 20) {
                                        field751 = field751 + Statics.field590;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field732 == 4) {
                        int var31 = field741 + 180 - 80;
                        short var32 = 321;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            Statics.field755.trim();
                            if (Statics.field755.length() != 6) {
                                method2171(class157.field2390, class157.field2338, class157.field2339);
                                return;
                            }
                            Statics.field2865 = Integer.parseInt(Statics.field755);
                            Statics.field755 = "";
                            field752 = field753 ? class159.field2586 : class159.field2588;
                            method2171(class157.field2303, class157.field2345, class157.field2567);
                            client.method2652(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field741 + 180 - 9 && var14 <= field741 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field753 = !field753;
                        }
                        if (var13 == 1 && var14 >= field741 + 180 - 34 && var14 <= field741 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            label713: {
                                String var33 = client.method955("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var33));
                                        break label713;
                                    } catch (Exception var45) {
                                    }
                                }
                                if (class138.field2120.startsWith("win")) {
                                    Statics.method764(var33, 0);
                                } else if (class138.field2120.startsWith("mac")) {
                                    class138.method1054(var33, 1, "openjs");
                                } else {
                                    Statics.method764(var33, 2);
                                }
                            }
                        }
                        int var35 = field741 + 180 + 80;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field732 = 0;
                            field750 = "";
                            field751 = "";
                            Statics.field2865 = 0;
                            Statics.field755 = "";
                        }
                        while (class137.method2692()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field757.length(); var37++) {
                                if (Statics.field590 == field757.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field802 == 13) {
                                field732 = 0;
                                field750 = "";
                                field751 = "";
                                Statics.field2865 = 0;
                                Statics.field755 = "";
                            } else {
                                if (Statics.field802 == 85 && Statics.field755.length() > 0) {
                                    Statics.field755 = Statics.field755.substring(0, Statics.field755.length() - 1);
                                }
                                if (Statics.field802 == 84) {
                                    Statics.field755.trim();
                                    if (Statics.field755.length() != 6) {
                                        method2171(class157.field2390, class157.field2338, class157.field2339);
                                        return;
                                    }
                                    Statics.field2865 = Integer.parseInt(Statics.field755);
                                    Statics.field755 = "";
                                    field752 = field753 ? class159.field2586 : class159.field2588;
                                    method2171(class157.field2303, class157.field2345, class157.field2567);
                                    client.method2652(20);
                                    return;
                                }
                                if (var36 && Statics.field755.length() < 6) {
                                    Statics.field755 = Statics.field755 + Statics.field590;
                                }
                            }
                        }
                    } else if (field732 == 5) {
                        int var38 = field741 + 180 - 80;
                        short var39 = 321;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            method109();
                            return;
                        }
                        int var40 = field741 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            field734 = class157.field2537;
                            field748 = class157.field2462;
                            field749 = class157.field2517;
                            field732 = 2;
                            field747 = 0;
                            field751 = "";
                        }
                        while (class137.method2692()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field756.length(); var42++) {
                                if (Statics.field590 == field756.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field802 == 13) {
                                field734 = class157.field2537;
                                field748 = class157.field2462;
                                field749 = class157.field2517;
                                field732 = 2;
                                field747 = 0;
                                field751 = "";
                            } else {
                                if (Statics.field802 == 85 && field750.length() > 0) {
                                    field750 = field750.substring(0, field750.length() - 1);
                                }
                                if (Statics.field802 == 84) {
                                    method109();
                                    return;
                                }
                                if (var41 && field750.length() < 320) {
                                    field750 = field750 + Statics.field590;
                                }
                            }
                        }
                    } else if (field732 == 6) {
                        while (true) {
                            do {
                                if (!class137.method2692()) {
                                    short var43 = 321;
                                    if (var13 == 1 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                                        field734 = class157.field2537;
                                        field748 = class157.field2462;
                                        field749 = class157.field2517;
                                        field732 = 2;
                                        field747 = 0;
                                        field751 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field802 != 84 && Statics.field802 != 13);
                            field734 = class157.field2537;
                            field748 = class157.field2462;
                            field749 = class157.field2517;
                            field732 = 2;
                            field747 = 0;
                            field751 = "";
                        }
                    }
                }
            }
        } else if (class140.field2140 == 1 || !Statics.field2584 && class140.field2140 == 4) {
            int var1 = field754 + 280;
            if (class140.field2146 >= var1 && class140.field2146 <= var1 + 14 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                class26.method107(0, 0);
            } else if (class140.field2146 >= var1 + 15 && class140.field2146 <= var1 + 80 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                class26.method107(0, 1);
            } else {
                int var2 = field754 + 390;
                if (class140.field2146 >= var2 && class140.field2146 <= var2 + 14 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                    class26.method107(1, 0);
                } else if (class140.field2146 >= var2 + 15 && class140.field2146 <= var2 + 80 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                    class26.method107(1, 1);
                } else {
                    int var3 = field754 + 500;
                    if (class140.field2146 >= var3 && class140.field2146 <= var3 + 14 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                        class26.method107(2, 0);
                    } else if (class140.field2146 >= var3 + 15 && class140.field2146 <= var3 + 80 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                        class26.method107(2, 1);
                    } else {
                        int var4 = field754 + 610;
                        if (class140.field2146 >= var4 && class140.field2146 <= var4 + 14 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                            class26.method107(3, 0);
                        } else if (class140.field2146 >= var4 + 15 && class140.field2146 <= var4 + 80 && class140.field2132 >= 4 && class140.field2132 <= 18) {
                            class26.method107(3, 1);
                        } else if (class140.field2146 >= field754 + 708 && class140.field2132 >= 4 && class140.field2146 <= field754 + 708 + 50 && class140.field2132 <= 20) {
                            field733 = false;
                            Statics.field886.method1598(field754, 0);
                            Statics.field87.method1598(field754 + 382, 0);
                            Statics.field2687.method1767(field754 + 382 - Statics.field2687.field1426 / 2, 18);
                        } else if (field738 != -1) {
                            class26 var5 = Statics.field651[field738];
                            method643(var5);
                            field733 = false;
                            Statics.field886.method1598(field754, 0);
                            Statics.field87.method1598(field754 + 382, 0);
                            Statics.field2687.method1767(field754 + 382 - Statics.field2687.field1426 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.f(I)V")
    public static void method109() {
        field750 = field750.trim();
        if (field750.length() == 0) {
            method2171(class157.field2546, class157.field2547, class157.field2532);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method955("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1978, var4.field1973, 1000 - var4.field1973);
                if (var5 == -1) {
                    var4.field1973 = 0;
                    long var8 = var4.method2389();
                    var6 = var8;
                    break;
                }
                var4.field1973 += var5;
                if (var4.field1973 >= 1000) {
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
            var13 = class10.method2286(var6, field750);
        }
        switch(var13) {
            case 2:
                method2171(class157.field2549, class157.field2483, class157.field2512);
                field732 = 6;
                break;
            case 3:
                method2171(class157.field2552, class157.field2553, class157.field2311);
                break;
            case 4:
                method2171(class157.field2555, class157.field2543, class157.field2557);
                break;
            case 5:
                method2171(class157.field2558, class157.field2559, class157.field2560);
                break;
            case 6:
                method2171(class157.field2561, class157.field2562, class157.field2520);
                break;
            case 7:
                method2171(class157.field2564, class157.field2565, class157.field2566);
        }
    }

    @ObfuscatedName("y.g(Lhu;Lhu;Lhu;ZB)V")
    public static void method587(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field754 = (Statics.field2115 - client.field514 * 765) / 2;
            field741 = field754 + 202;
        }
        if (field733) {
            if (Statics.field1604 == null) {
                Statics.field1604 = class77.method553(Statics.field642, "sl_back", "");
            }
            if (Statics.field1373 == null) {
                Statics.field1373 = class77.method1490(Statics.field642, "sl_flags", "");
            }
            if (Statics.field288 == null) {
                Statics.field288 = class77.method1490(Statics.field642, "sl_arrows", "");
            }
            if (Statics.field208 == null) {
                Statics.field208 = class77.method1490(Statics.field642, "sl_stars", "");
            }
            class80.method1716(field754, 23, 765, 480, 0);
            class80.method1705(field754, 0, 125, 23, 12425273, 9135624);
            class80.method1705(field754 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3903(class157.field2396, field754 + 62, 15, 0, -1);
            if (Statics.field208 != null) {
                Statics.field208[1].method1767(field754 + 140, 1);
                arg1.method3844(class157.field2330, field754 + 152, 10, 16777215, -1);
                Statics.field208[0].method1767(field754 + 140, 12);
                arg1.method3844(class157.field2569, field754 + 152, 21, 16777215, -1);
            }
            if (Statics.field288 != null) {
                int var4 = field754 + 280;
                if (class26.field658[0] == 0 && class26.field665[0] == 0) {
                    Statics.field288[2].method1767(var4, 4);
                } else {
                    Statics.field288[0].method1767(var4, 4);
                }
                if (class26.field658[0] == 0 && class26.field665[0] == 1) {
                    Statics.field288[3].method1767(var4 + 15, 4);
                } else {
                    Statics.field288[1].method1767(var4 + 15, 4);
                }
                arg0.method3844(class157.field2570, var4 + 32, 17, 16777215, -1);
                int var5 = field754 + 390;
                if (class26.field658[0] == 1 && class26.field665[0] == 0) {
                    Statics.field288[2].method1767(var5, 4);
                } else {
                    Statics.field288[0].method1767(var5, 4);
                }
                if (class26.field658[0] == 1 && class26.field665[0] == 1) {
                    Statics.field288[3].method1767(var5 + 15, 4);
                } else {
                    Statics.field288[1].method1767(var5 + 15, 4);
                }
                arg0.method3844(class157.field2571, var5 + 32, 17, 16777215, -1);
                int var6 = field754 + 500;
                if (class26.field658[0] == 2 && class26.field665[0] == 0) {
                    Statics.field288[2].method1767(var6, 4);
                } else {
                    Statics.field288[0].method1767(var6, 4);
                }
                if (class26.field658[0] == 2 && class26.field665[0] == 1) {
                    Statics.field288[3].method1767(var6 + 15, 4);
                } else {
                    Statics.field288[1].method1767(var6 + 15, 4);
                }
                arg0.method3844(class157.field2540, var6 + 32, 17, 16777215, -1);
                int var7 = field754 + 610;
                if (class26.field658[0] == 3 && class26.field665[0] == 0) {
                    Statics.field288[2].method1767(var7, 4);
                } else {
                    Statics.field288[0].method1767(var7, 4);
                }
                if (class26.field658[0] == 3 && class26.field665[0] == 1) {
                    Statics.field288[3].method1767(var7 + 15, 4);
                } else {
                    Statics.field288[1].method1767(var7 + 15, 4);
                }
                arg0.method3844(class157.field2573, var7 + 32, 17, 16777215, -1);
            }
            class80.method1716(field754 + 708, 4, 50, 16, 0);
            arg1.method3903(class157.field2471, field754 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field467 & var9;
            for (int var11 = 0; var11 < class26.field654; var11++) {
                class26 var12 = Statics.field651[var11];
                if ((var12.field660 & var9) == var10 || (var12.field660 & var9) == 0) {
                    var8++;
                }
            }
            field738 = -1;
            if (Statics.field1604 != null) {
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
                int var24 = field754 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field654; var27++) {
                    class26 var28 = Statics.field651[var27];
                    if ((var28.field660 & var9) == var10 || (var28.field660 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field661);
                        if (var28.field661 == -1) {
                            var30 = class157.field2574;
                            var29 = false;
                        } else if (var28.field661 > 1980) {
                            var30 = class157.field2575;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method610()) {
                            if (var28.method590()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method590()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class140.field2134 >= var24 && class140.field2135 * 782474221 >= var23 && class140.field2134 < var13 + var24 && class140.field2135 * 782474221 < var14 + var23 && var29) {
                            field738 = var27;
                            Statics.field1604[var31].method1615(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field1604[var31].method1598(var24, var23);
                        }
                        if (Statics.field1373 != null) {
                            Statics.field1373[(var28.method590() ? 8 : 0) + var28.field664].method1767(var24 + 29, var23);
                        }
                        arg0.method3903(Integer.toString(var28.field655), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3903(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var32 = arg1.method3827(Statics.field651[field738].field663) + 6;
                    int var33 = arg1.field3177 + 8;
                    class80.method1716(class140.field2134 - var32 / 2, class140.field2135 * 782474221 + 20 + 5, var32, var33, 16777120);
                    class80.method1711(class140.field2134 - var32 / 2, class140.field2135 * 782474221 + 20 + 5, var32, var33, 0);
                    arg1.method3903(Statics.field651[field738].field663, class140.field2134, class140.field2135 * 782474221 + 20 + 5 + arg1.field3177 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field2897.getGraphics();
                Statics.field2075.method1520(var34, 0, 0);
            } catch (Exception var132) {
                Statics.field2897.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field886.method1598(field754, 0);
            Statics.field87.method1598(field754 + 382, 0);
            Statics.field2687.method1767(field754 + 382 - Statics.field2687.field1426 / 2, 18);
        }
        if (client.field304 == 0 || client.field304 == 5) {
            byte var36 = 20;
            arg0.method3903(class157.field2514, field741 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class80.method1711(field741 + 180 - 152, var37, 304, 34, 9179409);
            class80.method1711(field741 + 180 - 151, var37 + 1, 302, 32, 0);
            class80.method1716(field741 + 180 - 150, var37 + 2, field744 * 3, 30, 9179409);
            class80.method1716(field744 * 3 + (field741 + 180 - 150), var37 + 2, 300 - field744 * 3, 30, 0);
            arg0.method3903(field745, field741 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field304 == 20) {
            Statics.field759.method1767(field741 + 180 - Statics.field759.field1426 / 2, 271 - Statics.field759.field1424 / 2);
            short var38 = 211;
            arg0.method3903(field734, field741 + 180, var38, 16776960, 0);
            int var134 = var38 + 15;
            arg0.method3903(field748, field741 + 180, var134, 16776960, 0);
            int var135 = var134 + 15;
            arg0.method3903(field749, field741 + 180, var135, 16776960, 0);
            int var136 = var135 + 15;
            int var137 = var136 + 10;
            if (field732 != 4) {
                arg0.method3844(class157.field2533, field741 + 180 - 110, var137, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field750; arg0.method3827(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3844(class223.method3831(var40), field741 + 180 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                arg0.method3844(class157.field2515 + class163.method2861(field751), field741 + 180 - 108, var134, 16777215, 0);
                var134 += 15;
            }
        }
        if (client.field304 == 10 || client.field304 == 11) {
            Statics.field759.method1767(field741, 171);
            if (field732 == 0) {
                short var41 = 251;
                arg0.method3903(class157.field2375, field741 + 180, var41, 16776960, 0);
                int var138 = var41 + 30;
                int var42 = field741 + 180 - 80;
                short var43 = 291;
                Statics.field735.method1767(var42 - 73, var43 - 20);
                arg0.method3834(class157.field2511, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field741 + 180 + 80;
                Statics.field735.method1767(var44 - 73, var43 - 20);
                arg0.method3834(class157.field2315, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field732 == 1) {
                arg0.method3903(class157.field2518, field741 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3903(field734, field741 + 180, var45, 16777215, 0);
                int var139 = var45 + 15;
                arg0.method3903(field748, field741 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method3903(field749, field741 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                int var46 = field741 + 180 - 80;
                short var47 = 321;
                Statics.field735.method1767(var46 - 73, var47 - 20);
                arg0.method3903(class157.field2309, var46, var47 + 5, 16777215, 0);
                int var48 = field741 + 180 + 80;
                Statics.field735.method1767(var48 - 73, var47 - 20);
                arg0.method3903(class157.field2471, var48, var47 + 5, 16777215, 0);
            } else if (field732 == 2) {
                short var49 = 211;
                arg0.method3903(field734, field741 + 180, var49, 16776960, 0);
                int var142 = var49 + 15;
                arg0.method3903(field748, field741 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg0.method3903(field749, field741 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                int var145 = var144 + 10;
                arg0.method3844(class157.field2533, field741 + 180 - 110, var145, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field750; arg0.method3827(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3844(class223.method3831(var51) + (field747 == 0 & client.field303 % 40 < 20 ? class2.method951(16776960) + class2.field17 : ""), field741 + 180 - 70, var145, 16777215, 0);
                var142 = var145 + 15;
                arg0.method3844(class157.field2515 + class163.method2861(field751) + (field747 == 1 & client.field303 % 40 < 20 ? class2.method951(16776960) + class2.field17 : ""), field741 + 180 - 108, var142, 16777215, 0);
                var142 += 15;
                int var52 = field741 + 180 - 80;
                short var53 = 321;
                Statics.field735.method1767(var52 - 73, var53 - 20);
                arg0.method3903(class157.field2487, var52, var53 + 5, 16777215, 0);
                int var54 = field741 + 180 + 80;
                Statics.field735.method1767(var54 - 73, var53 - 20);
                arg0.method3903(class157.field2471, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3903(class157.field2541, field741 + 180, var55, 16776960, 0);
            } else if (field732 == 4) {
                arg0.method3903(class157.field2528, field741 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3903(field734, field741 + 180, var56, 16777215, 0);
                int var146 = var56 + 15;
                arg0.method3903(field748, field741 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method3903(field749, field741 + 180, var147, 16777215, 0);
                int var148 = var147 + 15;
                arg0.method3844(class157.field2535 + class163.method2861(Statics.field755) + (client.field303 % 40 < 20 ? class2.method951(16776960) + class2.field17 : ""), field741 + 180 - 108, var148, 16777215, 0);
                int var149 = var148 - 8;
                arg0.method3844(class157.field2424, field741 + 180 - 9, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method3844(class157.field2312, field741 + 180 - 9, var150, 16776960, 0);
                int var57 = field741 + 180 - 9 + arg0.method3827(class157.field2312) + 15;
                int var58 = var150 - arg0.field3177;
                class81 var59;
                if (field753) {
                    var59 = Statics.field80;
                } else {
                    var59 = Statics.field287;
                }
                var59.method1767(var57, var58);
                var146 = var150 + 15;
                int var60 = field741 + 180 - 80;
                short var61 = 321;
                Statics.field735.method1767(var60 - 73, var61 - 20);
                arg0.method3903(class157.field2309, var60, var61 + 5, 16777215, 0);
                int var62 = field741 + 180 + 80;
                Statics.field735.method1767(var62 - 73, var61 - 20);
                arg0.method3903(class157.field2471, var62, var61 + 5, 16777215, 0);
                arg1.method3903(class157.field2529, field741 + 180, var61 + 36, 255, 0);
            } else if (field732 == 5) {
                arg0.method3903(class157.field2542, field741 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3903(field734, field741 + 180, var63, 16776960, 0);
                int var151 = var63 + 15;
                arg2.method3903(field748, field741 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg2.method3903(field749, field741 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var154 = var153 + 14;
                arg0.method3844(class157.field2403, field741 + 180 - 145, var154, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field750; arg0.method3827(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3844(class223.method3831(var65) + (client.field303 % 40 < 20 ? class2.method951(16776960) + class2.field17 : ""), field741 + 180 - 34, var154, 16777215, 0);
                var151 = var154 + 15;
                int var66 = field741 + 180 - 80;
                short var67 = 321;
                Statics.field735.method1767(var66 - 73, var67 - 20);
                arg0.method3903(class157.field2563, var66, var67 + 5, 16777215, 0);
                int var68 = field741 + 180 + 80;
                Statics.field735.method1767(var68 - 73, var67 - 20);
                arg0.method3903(class157.field2545, var68, var67 + 5, 16777215, 0);
            } else if (field732 == 6) {
                short var69 = 211;
                arg0.method3903(field734, field741 + 180, var69, 16776960, 0);
                int var155 = var69 + 15;
                arg0.method3903(field748, field741 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method3903(field749, field741 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var70 = field741 + 180;
                short var71 = 321;
                Statics.field735.method1767(var70 - 73, var71 - 20);
                arg0.method3903(class157.field2545, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field742 > 0) {
            int var72 = field742;
            short var73 = 256;
            field736 += var72 * 128;
            if (field736 > Statics.field727.length) {
                field736 -= Statics.field727.length;
                int var74 = (int) (Math.random() * 12.0D);
                method2328(Statics.field3108[var74]);
            }
            int var75 = 0;
            int var76 = var72 * 128;
            int var77 = (var73 - var72) * 128;
            for (int var78 = 0; var78 < var77; var78++) {
                int var79 = Statics.field184[var75 + var76] - Statics.field727[field736 + var75 & Statics.field727.length - 1] * var72 / 6;
                if (var79 < 0) {
                    var79 = 0;
                }
                Statics.field184[var75++] = var79;
            }
            for (int var80 = var73 - var72; var80 < var73; var80++) {
                int var81 = var80 * 128;
                for (int var82 = 0; var82 < 128; var82++) {
                    int var83 = (int) (Math.random() * 100.0D);
                    if (var83 < 50 && var82 > 10 && var82 < 118) {
                        Statics.field184[var81 + var82] = 255;
                    } else {
                        Statics.field184[var81 + var82] = 0;
                    }
                }
            }
            if (field746 > 0) {
                field746 -= var72 * 4;
            }
            if (field739 > 0) {
                field739 -= var72 * 4;
            }
            if (field746 == 0 && field739 == 0) {
                int var84 = (int) (Math.random() * (double) (2000 / var72));
                if (var84 == 0) {
                    field746 = 1024;
                }
                if (var84 == 1) {
                    field739 = 1024;
                }
            }
            for (int var85 = 0; var85 < var73 - var72; var85++) {
                field737[var85] = field737[var72 + var85];
            }
            for (int var86 = var73 - var72; var86 < var73; var86++) {
                field737[var86] = (int) (Math.sin((double) field743 / 14.0D) * 16.0D + Math.sin((double) field743 / 15.0D) * 14.0D + Math.sin((double) field743 / 16.0D) * 12.0D);
                field743++;
            }
            field740 += var72 * -56851743;
            int var87 = ((client.field303 & 0x1) + var72) / 2;
            if (var87 > 0) {
                for (int var88 = 0; var88 < field740 * -1887866652; var88++) {
                    int var89 = (int) (Math.random() * 124.0D) + 2;
                    int var90 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field184[(var90 << 7) + var89] = 192;
                }
                field740 = 0;
                int var91 = 0;
                label533: while (true) {
                    if (var91 >= var73) {
                        int var95 = 0;
                        while (true) {
                            if (var95 >= 128) {
                                break label533;
                            }
                            int var96 = 0;
                            for (int var97 = -var87; var97 < var73; var97++) {
                                int var98 = var97 * 128;
                                if (var87 + var97 < var73) {
                                    var96 += Statics.field687[var87 * 128 + var95 + var98];
                                }
                                if (var97 - (var87 + 1) >= 0) {
                                    var96 -= Statics.field687[var95 + var98 - (var87 + 1) * 128];
                                }
                                if (var97 >= 0) {
                                    Statics.field184[var95 + var98] = var96 / (var87 * 2 + 1);
                                }
                            }
                            var95++;
                        }
                    }
                    int var92 = 0;
                    int var93 = var91 * 128;
                    for (int var94 = -var87; var94 < 128; var94++) {
                        if (var87 + var94 < 128) {
                            var92 += Statics.field184[var93 + var94 + var87];
                        }
                        if (var94 - (var87 + 1) >= 0) {
                            var92 -= Statics.field184[var93 + var94 - (var87 + 1)];
                        }
                        if (var94 >= 0) {
                            Statics.field687[var93 + var94] = var92 / (var87 * 2 + 1);
                        }
                    }
                    var91++;
                }
            }
            field742 = 0;
        }
        short var99 = 256;
        if (field746 > 0) {
            for (int var100 = 0; var100 < 256; var100++) {
                if (field746 > 768) {
                    Statics.field2878[var100] = method1166(Statics.field143[var100], Statics.field10[var100], 1024 - field746);
                } else if (field746 > 256) {
                    Statics.field2878[var100] = Statics.field10[var100];
                } else {
                    Statics.field2878[var100] = method1166(Statics.field10[var100], Statics.field143[var100], 256 - field746);
                }
            }
        } else if (field739 > 0) {
            for (int var101 = 0; var101 < 256; var101++) {
                if (field739 > 768) {
                    Statics.field2878[var101] = method1166(Statics.field143[var101], Statics.field1095[var101], 1024 - field739);
                } else if (field739 > 256) {
                    Statics.field2878[var101] = Statics.field1095[var101];
                } else {
                    Statics.field2878[var101] = method1166(Statics.field1095[var101], Statics.field143[var101], 256 - field739);
                }
            }
        } else {
            for (int var102 = 0; var102 < 256; var102++) {
                Statics.field2878[var102] = Statics.field143[var102];
            }
        }
        class80.method1710(field754, 9, field754 + 128, var99 + 7);
        Statics.field886.method1598(field754, 0);
        class80.method1702();
        int var103 = 0;
        int var104 = field754 + Statics.field2075.field1396 * 9;
        for (int var105 = 1; var105 < var99 - 1; var105++) {
            int var106 = (var99 - var105) * field737[var105] / var99;
            int var107 = var106 + 22;
            if (var107 < 0) {
                var107 = 0;
            }
            var103 += var107;
            for (int var108 = var107; var108 < 128; var108++) {
                int var109 = Statics.field184[var103++];
                if (var109 == 0) {
                    var104++;
                } else {
                    int var111 = 256 - var109;
                    int var112 = Statics.field2878[var109];
                    int var113 = Statics.field2075.field1398[var104];
                    Statics.field2075.field1398[var104++] = ((var112 & 0xFF00) * var109 + (var113 & 0xFF00) * var111 & 0xFF0000) + ((var112 & 0xFF00FF) * var109 + (var113 & 0xFF00FF) * var111 & 0xFF00FF00) >> 8;
                }
            }
            var104 += Statics.field2075.field1396 + var107 - 128;
        }
        class80.method1710(field754 + 765 - 128, 9, field754 + 765, var99 + 7);
        Statics.field87.method1598(field754 + 382, 0);
        class80.method1702();
        int var114 = 0;
        int var115 = field754 + Statics.field2075.field1396 * 9 + 24 + 637;
        for (int var116 = 1; var116 < var99 - 1; var116++) {
            int var117 = (var99 - var116) * field737[var116] / var99;
            int var118 = 103 - var117;
            int var119 = var115 + var117;
            for (int var120 = 0; var120 < var118; var120++) {
                int var121 = Statics.field184[var114++];
                if (var121 == 0) {
                    var119++;
                } else {
                    int var123 = 256 - var121;
                    int var124 = Statics.field2878[var121];
                    int var125 = Statics.field2075.field1398[var119];
                    Statics.field2075.field1398[var119++] = ((var124 & 0xFF00FF) * var121 + (var125 & 0xFF00FF) * var123 & 0xFF00FF00) + ((var124 & 0xFF00) * var121 + (var125 & 0xFF00) * var123 & 0xFF0000) >> 8;
                }
            }
            var114 += 128 - var118;
            var115 = Statics.field2075.field1396 - var118 - var117 + var119;
        }
        Statics.field77[Statics.field2871.field154 ? 1 : 0].method1767(field754 + 765 - 40, 463);
        if (client.field304 > 5 && client.field302 == 0) {
            if (Statics.field239 == null) {
                Statics.field239 = class77.method2308(Statics.field642, "sl_button", "");
            } else {
                int var126 = field754 + 5;
                short var127 = 463;
                byte var128 = 100;
                byte var129 = 35;
                Statics.field239.method1767(var126, var127);
                arg0.method3903(class157.field2469 + " " + client.field296, var128 / 2 + var126, var129 / 2 + var127 - 2, 16777215, 0);
                if (Statics.field2265 == null) {
                    arg1.method3903(class157.field2577, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
                } else {
                    arg1.method3903(class157.field2576, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var130 = Statics.field2897.getGraphics();
            Statics.field2075.method1520(var130, 0, 0);
        } catch (Exception var133) {
            Statics.field2897.repaint();
        }
    }

    @ObfuscatedName("cw.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2171(String arg0, String arg1, String arg2) {
        field734 = arg0;
        field748 = arg1;
        field749 = arg2;
    }

    @ObfuscatedName("ds.s(Lcj;I)V")
    public static final void method2328(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field727.length; var2++) {
            Statics.field727[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field727[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field59[var8] = (Statics.field727[var8 - 1] + Statics.field727[var8 + 1] + Statics.field727[var8 - 128] + Statics.field727[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field727;
            Statics.field727 = Statics.field59;
            Statics.field59 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1424; var11++) {
            for (int var12 = 0; var12 < arg0.field1426; var12++) {
                if (arg0.field1422[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1425;
                    int var14 = var11 + 16 + arg0.field1427;
                    int var15 = (var14 << 7) + var13;
                    Statics.field727[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bi.k(IIII)I")
    public static final int method1166(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("af.b(La;B)V")
    public static void method643(class26 arg0) {
        if (arg0.method590() != client.field300) {
            client.field300 = arg0.method590();
            class52.method919(arg0.method590());
        }
        Statics.field1094 = arg0.field662;
        client.field296 = arg0.field655;
        client.field467 = arg0.field660;
        Statics.field392 = client.field298 == 0 ? 43594 : arg0.field655 + 40000;
        Statics.field64 = client.field298 == 0 ? 443 : arg0.field655 + 50000;
        Statics.field334 = Statics.field392;
    }
}
