package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("aq")
public class class30 {

    @ObfuscatedName("aq.w")
    public static int field701 = 0;

    @ObfuscatedName("aq.u")
    public static int field693 = field701 + 202;

    @ObfuscatedName("aq.k")
    public static int[] field690 = new int[256];

    @ObfuscatedName("aq.x")
    public static int field692 = 0;

    @ObfuscatedName("aq.d")
    public static int field702 = 0;

    @ObfuscatedName("aq.ar")
    public static int field694 = 0;

    @ObfuscatedName("aq.aq")
    public static int field682 = 0;

    @ObfuscatedName("aq.as")
    public static int field707 = 0;

    @ObfuscatedName("aq.ad")
    public static int field697 = 0;

    @ObfuscatedName("aq.ap")
    public static int field698 = 10;

    @ObfuscatedName("aq.an")
    public static String field699 = "";

    @ObfuscatedName("aq.au")
    public static int field700 = 0;

    @ObfuscatedName("aq.aw")
    public static String field689 = "";

    @ObfuscatedName("aq.ag")
    public static String field703 = "";

    @ObfuscatedName("aq.ah")
    public static String field716 = "";

    @ObfuscatedName("aq.ao")
    public static String field704 = "";

    @ObfuscatedName("aq.ac")
    public static String field695 = "";

    @ObfuscatedName("aq.af")
    public static class150 field706 = class150.field2492;

    @ObfuscatedName("aq.ay")
    public static boolean field691 = true;

    @ObfuscatedName("aq.ak")
    public static int field709 = 0;

    @ObfuscatedName("aq.aj")
    public static String field687 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aq.az")
    public static String field711 = "1234567890";

    @ObfuscatedName("aq.ax")
    public static boolean field712 = false;

    @ObfuscatedName("aq.bw")
    public static int field713 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.n(Ljava/awt/Component;Lfd;Lfd;ZIB)V")
    public static void method363(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field2568) {
            field700 = arg4;
            class75.method1532();
            byte[] var5 = arg1.method2875("title.jpg", "");
            Statics.field2944 = new class74(var5, arg0);
            Statics.field48 = Statics.field2944.method1457();
            Statics.field686 = class72.method2092(arg2, "logo", "");
            Statics.field683 = class72.method2092(arg2, "titlebox", "");
            Statics.field684 = class72.method2092(arg2, "titlebutton", "");
            Statics.field685 = class72.method23(arg2, "runes", "");
            Statics.field636 = class72.method23(arg2, "title_mute", "");
            Statics.field2811 = class72.method2092(arg2, "options_radio_buttons,0", "");
            Statics.field705 = class72.method2092(arg2, "options_radio_buttons,2", "");
            Statics.field1699 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1699[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1699[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1699[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1699[var9 + 192] = 16777215;
            }
            Statics.field2148 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2148[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2148[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2148[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2148[var13 + 192] = 16777215;
            }
            Statics.field696 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field696[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field696[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field696[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field696[var17 + 192] = 16777215;
            }
            Statics.field722 = new int[256];
            Statics.field927 = new int[32768];
            Statics.field2818 = new int[32768];
            method736((class76) null);
            Statics.field1618 = new int[32768];
            Statics.field3030 = new int[32768];
            if (arg3) {
                field704 = "";
                field695 = "";
            }
            Statics.field710 = 0;
            Statics.field670 = "";
            field691 = true;
            field712 = false;
            if (Statics.field1691.field125) {
                class174.field2858 = 1;
                Statics.field2859 = null;
                Statics.field1085 = -1;
                Statics.field1522 = -1;
                Statics.field2860 = 0;
                Statics.field1284 = false;
                Statics.field2137 = 2;
            } else {
                class174.method1877(2, Statics.field819, "scape main", "", 255, false);
            }
            class162.method794(false);
            Statics.field2568 = true;
            field701 = (Statics.field1984 - client.field382) / 2;
            field693 = field701 + 202;
            Statics.field2944.method1509(field701, 0);
            Statics.field48.method1509(field701 + 382, 0);
            Statics.field686.method1595(field701 + 382 - Statics.field686.field1351 / 2, 18);
        } else if (arg4 == 4) {
            field700 = 4;
        }
    }

    @ObfuscatedName("fc.w(Leo;B)V")
    public static void method2968(class136 arg0) {
        if (field712) {
            method72(arg0);
            return;
        }
        if ((class132.field2043 == 1 || !Statics.field121 && class132.field2043 == 4) && class132.field2034 >= field701 + 765 - 50 && class132.field2045 >= 453) {
            Statics.field1691.field125 = !Statics.field1691.field125;
            class9.method2360();
            if (Statics.field1691.field125) {
                class174.method2070();
            } else {
                class174.method161(Statics.field819, "scape main", "", 255, false);
            }
        }
        if (client.field266 == 5) {
            return;
        }
        field707++;
        if (client.field266 != 10 && client.field266 != 11) {
            return;
        }
        if (client.field423 == 0) {
            if (class132.field2043 == 1 || !Statics.field121 && class132.field2043 == 4) {
                int var1 = field701 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class132.field2034 >= var1 && class132.field2034 <= var1 + var3 && class132.field2045 >= var2 && class132.field2045 <= var2 + var4) {
                    method2608();
                    return;
                }
            }
            if (Statics.field2833 != null && class24.method3165()) {
                field712 = true;
            }
        }
        int var5 = class132.field2043;
        int var6 = class132.field2034;
        int var7 = class132.field2045;
        if (!Statics.field121 && var5 == 4) {
            var5 = 1;
        }
        if (field700 == 0) {
            int var8 = field693 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class130.method493(client.method552("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field295 & 0x4) != 0) {
                    if ((client.field295 & 0x400) == 0) {
                        field689 = class148.field2417;
                        field703 = class148.field2418;
                        field716 = class148.field2419;
                    } else {
                        field689 = class148.field2423;
                        field703 = class148.field2424;
                        field716 = class148.field2454;
                    }
                    field700 = 1;
                    field709 = 0;
                } else if ((client.field295 & 0x400) == 0) {
                    field689 = class148.field2413;
                    field703 = class148.field2245;
                    field716 = class148.field2415;
                    field700 = 2;
                    field709 = 0;
                } else {
                    field689 = class148.field2329;
                    field703 = class148.field2421;
                    field716 = class148.field2392;
                    field700 = 1;
                    field709 = 0;
                }
            }
        } else if (field700 == 1) {
            while (class129.method841()) {
                if (Statics.field204 == 84) {
                    field689 = class148.field2413;
                    field703 = class148.field2245;
                    field716 = class148.field2415;
                    field700 = 2;
                    field709 = 0;
                } else if (Statics.field204 == 13) {
                    field700 = 0;
                }
            }
            int var11 = field693 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field689 = class148.field2413;
                field703 = class148.field2245;
                field716 = class148.field2415;
                field700 = 2;
                field709 = 0;
            }
            int var13 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field700 = 0;
            }
        } else if (field700 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field709 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field709 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method1986(class148.field2444, class148.field2416, class148.field2446);
                field700 = 5;
                return;
            }
            int var16 = field693 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field704 = field704.trim();
                if (field704.length() == 0) {
                    method1986(class148.field2319, class148.field2320, class148.field2321);
                    return;
                }
                if (field695.length() == 0) {
                    method1986(class148.field2322, class148.field2310, class148.field2393);
                    return;
                }
                method1986(class148.field2428, class148.field2324, class148.field2430);
                field706 = Statics.field1691.field129.containsKey(class154.method882(field704)) ? class150.field2501 : class150.field2492;
                client.method873(20);
                return;
            }
            int var18 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field700 = 0;
                field704 = "";
                field695 = "";
                Statics.field710 = 0;
                Statics.field670 = "";
                field691 = true;
            }
            while (true) {
                while (class129.method841()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field687.length(); var20++) {
                        if (Statics.field1860 == field687.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field204 == 13) {
                        field700 = 0;
                        field704 = "";
                        field695 = "";
                        Statics.field710 = 0;
                        Statics.field670 = "";
                        field691 = true;
                    } else if (field709 == 0) {
                        if (Statics.field204 == 85 && field704.length() > 0) {
                            field704 = field704.substring(0, field704.length() - 1);
                        }
                        if (Statics.field204 == 84 || Statics.field204 == 80) {
                            field709 = 1;
                        }
                        if (var19 && field704.length() < 320) {
                            field704 = field704 + Statics.field1860;
                        }
                    } else if (field709 == 1) {
                        if (Statics.field204 == 85 && field695.length() > 0) {
                            field695 = field695.substring(0, field695.length() - 1);
                        }
                        if (Statics.field204 == 84 || Statics.field204 == 80) {
                            field709 = 0;
                        }
                        if (Statics.field204 == 84) {
                            field704 = field704.trim();
                            if (field704.length() == 0) {
                                method1986(class148.field2319, class148.field2320, class148.field2321);
                                return;
                            }
                            if (field695.length() == 0) {
                                method1986(class148.field2322, class148.field2310, class148.field2393);
                                return;
                            }
                            method1986(class148.field2428, class148.field2324, class148.field2430);
                            field706 = Statics.field1691.field129.containsKey(class154.method882(field704)) ? class150.field2501 : class150.field2492;
                            client.method873(20);
                            return;
                        }
                        if (var19 && field695.length() < 20) {
                            field695 = field695 + Statics.field1860;
                        }
                    }
                }
                return;
            }
        } else if (field700 == 4) {
            int var21 = field693 + 180 - 80;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field670.trim();
                if (Statics.field670.length() != 6) {
                    method1986(class148.field2233, class148.field2397, class148.field2457);
                    return;
                }
                Statics.field710 = Integer.parseInt(Statics.field670);
                Statics.field670 = "";
                field706 = field691 ? class150.field2491 : class150.field2493;
                method1986(class148.field2428, class148.field2324, class148.field2430);
                client.method873(20);
                return;
            }
            if (var5 == 1 && var6 >= field693 + 180 - 9 && var6 <= field693 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field691 = !field691;
            }
            if (var5 == 1 && var6 >= field693 + 180 - 34 && var6 <= field693 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class130.method493(client.method552("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var23 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field700 = 0;
                field704 = "";
                field695 = "";
                Statics.field710 = 0;
                Statics.field670 = "";
            }
            while (class129.method841()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field711.length(); var25++) {
                    if (Statics.field1860 == field711.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field204 == 13) {
                    field700 = 0;
                    field704 = "";
                    field695 = "";
                    Statics.field710 = 0;
                    Statics.field670 = "";
                } else {
                    if (Statics.field204 == 85 && Statics.field670.length() > 0) {
                        Statics.field670 = Statics.field670.substring(0, Statics.field670.length() - 1);
                    }
                    if (Statics.field204 == 84) {
                        Statics.field670.trim();
                        if (Statics.field670.length() != 6) {
                            method1986(class148.field2233, class148.field2397, class148.field2457);
                            return;
                        }
                        Statics.field710 = Integer.parseInt(Statics.field670);
                        Statics.field670 = "";
                        field706 = field691 ? class150.field2491 : class150.field2493;
                        method1986(class148.field2428, class148.field2324, class148.field2430);
                        client.method873(20);
                        return;
                    }
                    if (var24 && Statics.field670.length() < 6) {
                        Statics.field670 = Statics.field670 + Statics.field1860;
                    }
                }
            }
        } else if (field700 == 5) {
            int var26 = field693 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method112();
                return;
            }
            int var28 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field689 = class148.field2413;
                field703 = class148.field2245;
                field716 = class148.field2415;
                field700 = 2;
                field709 = 0;
                field695 = "";
            }
            while (class129.method841()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field687.length(); var30++) {
                    if (Statics.field1860 == field687.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field204 == 13) {
                    field689 = class148.field2413;
                    field703 = class148.field2245;
                    field716 = class148.field2415;
                    field700 = 2;
                    field709 = 0;
                    field695 = "";
                } else {
                    if (Statics.field204 == 85 && field704.length() > 0) {
                        field704 = field704.substring(0, field704.length() - 1);
                    }
                    if (Statics.field204 == 84) {
                        method112();
                        return;
                    }
                    if (var29 && field704.length() < 320) {
                        field704 = field704 + Statics.field1860;
                    }
                }
            }
        } else if (field700 == 6) {
            while (true) {
                do {
                    if (!class129.method841()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field689 = class148.field2413;
                            field703 = class148.field2245;
                            field716 = class148.field2415;
                            field700 = 2;
                            field709 = 0;
                            field695 = "";
                        }
                        return;
                    }
                } while (Statics.field204 != 84 && Statics.field204 != 13);
                field689 = class148.field2413;
                field703 = class148.field2245;
                field716 = class148.field2415;
                field700 = 2;
                field709 = 0;
                field695 = "";
            }
        }
    }

    @ObfuscatedName("m.i(S)V")
    public static void method112() {
        field704 = field704.trim();
        if (field704.length() == 0) {
            method1986(class148.field2444, class148.field2416, class148.field2446);
            return;
        }
        long var0 = class10.method891();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field704;
            Random var4 = new Random();
            class111 var5 = new class111(128);
            class111 var6 = new class111(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2140(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2143(var4.nextInt());
            }
            var5.method2143(var7[0]);
            var5.method2143(var7[1]);
            var5.method2145(var0);
            var5.method2145(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2143(var4.nextInt());
            }
            var5.method2175(class10.field135, class10.field132);
            var6.method2140(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2143(var4.nextInt());
            }
            var6.method2145(var4.nextLong());
            var6.method2144(var4.nextLong());
            class141.method570(var6);
            var6.method2145(var4.nextLong());
            var6.method2175(class10.field135, class10.field132);
            int var11 = var3.length() + 1;
            int var12 = var11;
            if (var11 % 8 != 0) {
                var12 = 8 - var11 % 8 + var11;
            }
            class111 var13 = new class111(var12);
            var13.method2146(var3);
            var13.field1888 = var12;
            var13.method2171(var7);
            class111 var14 = new class111(var13.field1888 + var6.field1888 + var5.field1888 + 5);
            var14.method2140(2);
            var14.method2140(var5.field1888);
            var14.method2318(var5.field1886, 0, var5.field1888);
            var14.method2140(var6.field1888);
            var14.method2318(var6.field1886, 0, var6.field1888);
            var14.method2322(var13.field1888);
            var14.method2318(var13.field1886, 0, var13.field1888);
            byte[] var15 = var14.field1886;
            String var16 = Statics.method1341(var15, 0, var15.length);
            String var17 = var16;
            byte var24;
            try {
                URL var18 = new URL(client.method552("services", false) + "m=accountappeal/login.ws");
                URLConnection var19 = var18.openConnection();
                var19.setDoInput(true);
                var19.setDoOutput(true);
                var19.setConnectTimeout(5000);
                OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
                var20.write("data2=" + class217.method892(var17) + "&dest=" + class217.method892("passwordchoice.ws"));
                var20.flush();
                InputStream var21 = var19.getInputStream();
                class111 var22 = new class111(new byte[1000]);
                while (true) {
                    int var23 = var21.read(var22.field1886, var22.field1888, 1000 - var22.field1888);
                    if (var23 == -1) {
                        var20.close();
                        var21.close();
                        String var25 = new String(var22.field1886);
                        if (var25.startsWith("OFFLINE")) {
                            var24 = 4;
                        } else if (var25.startsWith("WRONG")) {
                            var24 = 7;
                        } else if (var25.startsWith("RELOAD")) {
                            var24 = 3;
                        } else if (var25.startsWith("Not permitted for social network accounts.")) {
                            var24 = 6;
                        } else {
                            var22.method2172(var7);
                            while (var22.field1888 > 0 && var22.field1886[var22.field1888 - 1] == 0) {
                                var22.field1888--;
                            }
                            String var26 = new String(var22.field1886, 0, var22.field1888);
                            if (class10.method2788(var26)) {
                                class130.method493(var26, true, false);
                                var24 = 2;
                            } else {
                                var24 = 5;
                            }
                        }
                        break;
                    }
                    var22.field1888 += var23;
                    if (var22.field1888 >= 1000) {
                        var24 = 5;
                        break;
                    }
                }
            } catch (Throwable var28) {
                var28.printStackTrace();
                var24 = 5;
            }
            var2 = var24;
        }
        switch(var2) {
            case 2:
                method1986(class148.field2447, class148.field2448, class148.field2462);
                field700 = 6;
                break;
            case 3:
                method1986(class148.field2426, class148.field2451, class148.field2452);
                break;
            case 4:
                method1986(class148.field2453, class148.field2316, class148.field2455);
                break;
            case 5:
                method1986(class148.field2456, class148.field2307, class148.field2458);
                break;
            case 6:
                method1986(class148.field2459, class148.field2460, class148.field2288);
                break;
            case 7:
                method1986(class148.field2227, class148.field2463, class148.field2464);
        }
    }

    @ObfuscatedName("ao.e(Lhg;Lhg;Lhg;ZI)V")
    public static void method735(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field701 = (Statics.field1984 - client.field382) / 2;
            field693 = field701 + 202;
        }
        if (field712) {
            if (Statics.field1872 == null) {
                Statics.field1872 = class72.method1443(Statics.field56, "sl_back", "");
            }
            if (Statics.field1615 == null) {
                Statics.field1615 = class72.method23(Statics.field56, "sl_flags", "");
            }
            if (Statics.field1976 == null) {
                Statics.field1976 = class72.method23(Statics.field56, "sl_arrows", "");
            }
            if (Statics.field2023 == null) {
                Statics.field2023 = class72.method23(Statics.field56, "sl_stars", "");
            }
            class75.method1567(field701, 23, 765, 480, 0);
            class75.method1542(field701, 0, 125, 23, 12425273, 9135624);
            class75.method1542(field701 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3666(class148.field2465, field701 + 62, 15, 0, -1);
            if (Statics.field2023 != null) {
                Statics.field2023[1].method1595(field701 + 140, 1);
                arg1.method3592(class148.field2466, field701 + 152, 10, 16777215, -1);
                Statics.field2023[0].method1595(field701 + 140, 12);
                arg1.method3592(class148.field2323, field701 + 152, 21, 16777215, -1);
            }
            if (Statics.field1976 != null) {
                int var4 = field701 + 280;
                if (class24.field607[0] == 0 && class24.field611[0] == 0) {
                    Statics.field1976[2].method1595(var4, 4);
                } else {
                    Statics.field1976[0].method1595(var4, 4);
                }
                if (class24.field607[0] == 0 && class24.field611[0] == 1) {
                    Statics.field1976[3].method1595(var4 + 15, 4);
                } else {
                    Statics.field1976[1].method1595(var4 + 15, 4);
                }
                arg0.method3592(class148.field2468, var4 + 32, 17, 16777215, -1);
                int var5 = field701 + 390;
                if (class24.field607[0] == 1 && class24.field611[0] == 0) {
                    Statics.field1976[2].method1595(var5, 4);
                } else {
                    Statics.field1976[0].method1595(var5, 4);
                }
                if (class24.field607[0] == 1 && class24.field611[0] == 1) {
                    Statics.field1976[3].method1595(var5 + 15, 4);
                } else {
                    Statics.field1976[1].method1595(var5 + 15, 4);
                }
                arg0.method3592(class148.field2360, var5 + 32, 17, 16777215, -1);
                int var6 = field701 + 500;
                if (class24.field607[0] == 2 && class24.field611[0] == 0) {
                    Statics.field1976[2].method1595(var6, 4);
                } else {
                    Statics.field1976[0].method1595(var6, 4);
                }
                if (class24.field607[0] == 2 && class24.field611[0] == 1) {
                    Statics.field1976[3].method1595(var6 + 15, 4);
                } else {
                    Statics.field1976[1].method1595(var6 + 15, 4);
                }
                arg0.method3592(class148.field2470, var6 + 32, 17, 16777215, -1);
                int var7 = field701 + 610;
                if (class24.field607[0] == 3 && class24.field611[0] == 0) {
                    Statics.field1976[2].method1595(var7, 4);
                } else {
                    Statics.field1976[0].method1595(var7, 4);
                }
                if (class24.field607[0] == 3 && class24.field611[0] == 1) {
                    Statics.field1976[3].method1595(var7 + 15, 4);
                } else {
                    Statics.field1976[1].method1595(var7 + 15, 4);
                }
                arg0.method3592(class148.field2210, var7 + 32, 17, 16777215, -1);
            }
            class75.method1567(field701 + 708, 4, 50, 16, 0);
            arg1.method3666(class148.field2289, field701 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field295 & var9;
            for (int var11 = 0; var11 < class24.field609; var11++) {
                class24 var12 = Statics.field544[var11];
                if ((var12.field614 & var9) == var10) {
                    var8++;
                }
            }
            field713 = -1;
            if (Statics.field1872 != null) {
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
                int var24 = field701 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class24.field609; var27++) {
                    class24 var28 = Statics.field544[var27];
                    if ((var28.field614 & var9) == var10) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field615);
                        if (var28.field615 == -1) {
                            var30 = class148.field2472;
                            var29 = false;
                        } else if (var28.field615 > 1980) {
                            var30 = class148.field2473;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method540()) {
                            if (var28.method522()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method522()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class132.field2037 >= var24 && class132.field2038 >= var23 && class132.field2037 < var13 + var24 && class132.field2038 < var14 + var23 && var29) {
                            field713 = var27;
                            Statics.field1872[var31].method1471(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field1872[var31].method1509(var24, var23);
                        }
                        if (Statics.field1615 != null) {
                            Statics.field1615[(var28.method522() ? 8 : 0) + var28.field618].method1595(var24 + 29, var23);
                        }
                        arg0.method3666(Integer.toString(var28.field608), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3666(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var32 = arg1.method3674(Statics.field544[field713].field617) + 6;
                    int var33 = arg1.field3104 + 8;
                    class75.method1567(class132.field2037 - var32 / 2, class132.field2038 + 20 + 5, var32, var33, 16777120);
                    class75.method1543(class132.field2037 - var32 / 2, class132.field2038 + 20 + 5, var32, var33, 0);
                    arg1.method3666(Statics.field544[field713].field617, class132.field2037, class132.field2038 + 20 + 5 + arg1.field3104 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1869.getGraphics();
                Statics.field999.method1367(var34, 0, 0);
            } catch (Exception var156) {
                Statics.field1869.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2944.method1509(field701, 0);
            Statics.field48.method1509(field701 + 382, 0);
            Statics.field686.method1595(field701 + 382 - Statics.field686.field1351 / 2, 18);
        }
        if (client.field266 == 0 || client.field266 == 5) {
            byte var36 = 20;
            arg0.method3666(class148.field2467, field693 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class75.method1543(field693 + 180 - 152, var37, 304, 34, 9179409);
            class75.method1543(field693 + 180 - 151, var37 + 1, 302, 32, 0);
            class75.method1567(field693 + 180 - 150, var37 + 2, field698 * 3, 30, 9179409);
            class75.method1567(field698 * 3 + (field693 + 180 - 150), var37 + 2, 300 - field698 * 3, 30, 0);
            arg0.method3666(field699, field693 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field266 == 20) {
            Statics.field683.method1595(field693 + 180 - Statics.field683.field1351 / 2, 271 - Statics.field683.field1352 / 2);
            short var38 = 211;
            arg0.method3666(field689, field693 + 180, var38, 16776960, 0);
            int var158 = var38 + 15;
            arg0.method3666(field703, field693 + 180, var158, 16776960, 0);
            int var159 = var158 + 15;
            arg0.method3666(field716, field693 + 180, var159, 16776960, 0);
            int var160 = var159 + 15;
            int var161 = var160 + 10;
            if (field700 != 4) {
                arg0.method3592(class148.field2431, field693 + 180 - 110, var161, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field704; arg0.method3674(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3592(class214.method3658(var40), field693 + 180 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                String var42 = class148.field2332;
                String var43 = field695;
                int var44 = var43.length();
                char[] var45 = new char[var44];
                for (int var46 = 0; var46 < var44; var46++) {
                    var45[var46] = '*';
                }
                String var47 = new String(var45);
                arg0.method3592(var42 + var47, field693 + 180 - 108, var158, 16777215, 0);
                var158 += 15;
            }
        }
        if (client.field266 == 10 || client.field266 == 11) {
            Statics.field683.method1595(field693, 171);
            if (field700 == 0) {
                short var49 = 251;
                arg0.method3666(class148.field2215, field693 + 180, var49, 16776960, 0);
                int var162 = var49 + 30;
                int var50 = field693 + 180 - 80;
                short var51 = 291;
                Statics.field684.method1595(var50 - 73, var51 - 20);
                arg0.method3631(class148.field2435, var50 - 73, var51 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var52 = field693 + 180 + 80;
                Statics.field684.method1595(var52 - 73, var51 - 20);
                arg0.method3631(class148.field2317, var52 - 73, var51 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field700 == 1) {
                arg0.method3666(class148.field2333, field693 + 180, 211, 16776960, 0);
                short var53 = 236;
                arg0.method3666(field689, field693 + 180, var53, 16777215, 0);
                int var163 = var53 + 15;
                arg0.method3666(field703, field693 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                arg0.method3666(field716, field693 + 180, var164, 16777215, 0);
                int var165 = var164 + 15;
                int var54 = field693 + 180 - 80;
                short var55 = 321;
                Statics.field684.method1595(var54 - 73, var55 - 20);
                arg0.method3666(class148.field2207, var54, var55 + 5, 16777215, 0);
                int var56 = field693 + 180 + 80;
                Statics.field684.method1595(var56 - 73, var55 - 20);
                arg0.method3666(class148.field2289, var56, var55 + 5, 16777215, 0);
            } else if (field700 == 2) {
                short var57 = 211;
                arg0.method3666(field689, field693 + 180, var57, 16776960, 0);
                int var166 = var57 + 15;
                arg0.method3666(field703, field693 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg0.method3666(field716, field693 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                int var169 = var168 + 10;
                arg0.method3592(class148.field2431, field693 + 180 - 110, var169, 16777215, 0);
                short var58 = 200;
                String var59;
                for (var59 = field704; arg0.method3674(var59) > var58; var59 = var59.substring(1)) {
                }
                arg0.method3592(class214.method3658(var59) + (field709 == 0 & client.field268 % 40 < 20 ? class2.method2712(16776960) + class2.field23 : ""), field693 + 180 - 70, var169, 16777215, 0);
                var166 = var169 + 15;
                String var61 = class148.field2332;
                String var62 = field695;
                int var63 = var62.length();
                char[] var64 = new char[var63];
                for (int var65 = 0; var65 < var63; var65++) {
                    var64[var65] = '*';
                }
                String var66 = new String(var64);
                arg0.method3592(var61 + var66 + (field709 == 1 & client.field268 % 40 < 20 ? class2.method2712(16776960) + class2.field23 : ""), field693 + 180 - 108, var166, 16777215, 0);
                var166 += 15;
                int var68 = field693 + 180 - 80;
                short var69 = 321;
                Statics.field684.method1595(var68 - 73, var69 - 20);
                arg0.method3666(class148.field2356, var68, var69 + 5, 16777215, 0);
                int var70 = field693 + 180 + 80;
                Statics.field684.method1595(var70 - 73, var69 - 20);
                arg0.method3666(class148.field2289, var70, var69 + 5, 16777215, 0);
                short var71 = 357;
                arg1.method3666(class148.field2223, field693 + 180, var71, 16776960, 0);
            } else if (field700 == 4) {
                arg0.method3666(class148.field2314, field693 + 180, 211, 16776960, 0);
                short var72 = 236;
                arg0.method3666(field689, field693 + 180, var72, 16777215, 0);
                int var170 = var72 + 15;
                arg0.method3666(field703, field693 + 180, var170, 16777215, 0);
                int var171 = var170 + 15;
                arg0.method3666(field716, field693 + 180, var171, 16777215, 0);
                int var172 = var171 + 15;
                String var74 = class148.field2433;
                String var75 = Statics.field670;
                int var76 = var75.length();
                char[] var77 = new char[var76];
                for (int var78 = 0; var78 < var76; var78++) {
                    var77[var78] = '*';
                }
                String var79 = new String(var77);
                arg0.method3592(var74 + var79 + (client.field268 % 40 < 20 ? class2.method2712(16776960) + class2.field23 : ""), field693 + 180 - 108, var172, 16777215, 0);
                var170 = var172 - 8;
                arg0.method3592(class148.field2209, field693 + 180 - 9, var170, 16776960, 0);
                var170 += 15;
                arg0.method3592(class148.field2239, field693 + 180 - 9, var170, 16776960, 0);
                int var81 = field693 + 180 - 9 + arg0.method3674(class148.field2239) + 15;
                int var82 = var170 - arg0.field3104;
                class76 var83;
                if (field691) {
                    var83 = Statics.field705;
                } else {
                    var83 = Statics.field2811;
                }
                var83.method1595(var81, var82);
                var170 += 15;
                int var84 = field693 + 180 - 80;
                short var85 = 321;
                Statics.field684.method1595(var84 - 73, var85 - 20);
                arg0.method3666(class148.field2207, var84, var85 + 5, 16777215, 0);
                int var86 = field693 + 180 + 80;
                Statics.field684.method1595(var86 - 73, var85 - 20);
                arg0.method3666(class148.field2289, var86, var85 + 5, 16777215, 0);
                arg1.method3666(class148.field2427, field693 + 180, var85 + 36, 255, 0);
            } else if (field700 == 5) {
                arg0.method3666(class148.field2440, field693 + 180, 201, 16776960, 0);
                short var87 = 221;
                arg2.method3666(field689, field693 + 180, var87, 16776960, 0);
                int var173 = var87 + 15;
                arg2.method3666(field703, field693 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                arg2.method3666(field716, field693 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                int var176 = var175 + 14;
                arg0.method3592(class148.field2441, field693 + 180 - 145, var176, 16777215, 0);
                short var88 = 174;
                String var89;
                for (var89 = field704; arg0.method3674(var89) > var88; var89 = var89.substring(1)) {
                }
                arg0.method3592(class214.method3658(var89) + (client.field268 % 40 < 20 ? class2.method2712(16776960) + class2.field23 : ""), field693 + 180 - 34, var176, 16777215, 0);
                var173 = var176 + 15;
                int var90 = field693 + 180 - 80;
                short var91 = 321;
                Statics.field684.method1595(var90 - 73, var91 - 20);
                arg0.method3666(class148.field2442, var90, var91 + 5, 16777215, 0);
                int var92 = field693 + 180 + 80;
                Statics.field684.method1595(var92 - 73, var91 - 20);
                arg0.method3666(class148.field2258, var92, var91 + 5, 16777215, 0);
            } else if (field700 == 6) {
                short var93 = 211;
                arg0.method3666(field689, field693 + 180, var93, 16776960, 0);
                int var177 = var93 + 15;
                arg0.method3666(field703, field693 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                arg0.method3666(field716, field693 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                int var94 = field693 + 180;
                short var95 = 321;
                Statics.field684.method1595(var94 - 73, var95 - 20);
                arg0.method3666(class148.field2258, var94, var95 + 5, 16777215, 0);
            }
        }
        if (field707 > 0) {
            int var96 = field707;
            short var97 = 256;
            field694 += var96 * 128;
            if (field694 > Statics.field927.length) {
                field694 -= Statics.field927.length;
                int var98 = (int) (Math.random() * 12.0D);
                method736(Statics.field685[var98]);
            }
            int var99 = 0;
            int var100 = var96 * 128;
            int var101 = (var97 - var96) * 128;
            for (int var102 = 0; var102 < var101; var102++) {
                int var103 = Statics.field1618[var99 + var100] - Statics.field927[field694 + var99 & Statics.field927.length - 1] * var96 / 6;
                if (var103 < 0) {
                    var103 = 0;
                }
                Statics.field1618[var99++] = var103;
            }
            for (int var104 = var97 - var96; var104 < var97; var104++) {
                int var105 = var104 * 128;
                for (int var106 = 0; var106 < 128; var106++) {
                    int var107 = (int) (Math.random() * 100.0D);
                    if (var107 < 50 && var106 > 10 && var106 < 118) {
                        Statics.field1618[var105 + var106] = 255;
                    } else {
                        Statics.field1618[var105 + var106] = 0;
                    }
                }
            }
            if (field692 > 0) {
                field692 -= var96 * 4;
            }
            if (field702 > 0) {
                field702 -= var96 * 4;
            }
            if (field692 == 0 && field702 == 0) {
                int var108 = (int) (Math.random() * (double) (2000 / var96));
                if (var108 == 0) {
                    field692 = 1024;
                }
                if (var108 == 1) {
                    field702 = 1024;
                }
            }
            for (int var109 = 0; var109 < var97 - var96; var109++) {
                field690[var109] = field690[var96 + var109];
            }
            for (int var110 = var97 - var96; var110 < var97; var110++) {
                field690[var110] = (int) (Math.sin((double) field697 / 14.0D) * 16.0D + Math.sin((double) field697 / 15.0D) * 14.0D + Math.sin((double) field697 / 16.0D) * 12.0D);
                field697++;
            }
            field682 += var96 * -1836198563;
            int var111 = ((client.field268 & 0x1) + var96) / 2;
            if (var111 > 0) {
                for (int var112 = 0; var112 < field682 * -1690617932; var112++) {
                    int var113 = (int) (Math.random() * 124.0D) + 2;
                    int var114 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1618[(var114 << 7) + var113] = 192;
                }
                field682 = 0;
                int var115 = 0;
                label538: while (true) {
                    if (var115 >= var97) {
                        int var119 = 0;
                        while (true) {
                            if (var119 >= 128) {
                                break label538;
                            }
                            int var120 = 0;
                            for (int var121 = -var111; var121 < var97; var121++) {
                                int var122 = var121 * 128;
                                if (var111 + var121 < var97) {
                                    var120 += Statics.field3030[var111 * 128 + var119 + var122];
                                }
                                if (var121 - (var111 + 1) >= 0) {
                                    var120 -= Statics.field3030[var119 + var122 - (var111 + 1) * 128];
                                }
                                if (var121 >= 0) {
                                    Statics.field1618[var119 + var122] = var120 / (var111 * 2 + 1);
                                }
                            }
                            var119++;
                        }
                    }
                    int var116 = 0;
                    int var117 = var115 * 128;
                    for (int var118 = -var111; var118 < 128; var118++) {
                        if (var111 + var118 < 128) {
                            var116 += Statics.field1618[var117 + var118 + var111];
                        }
                        if (var118 - (var111 + 1) >= 0) {
                            var116 -= Statics.field1618[var117 + var118 - (var111 + 1)];
                        }
                        if (var118 >= 0) {
                            Statics.field3030[var117 + var118] = var116 / (var111 * 2 + 1);
                        }
                    }
                    var115++;
                }
            }
            field707 = 0;
        }
        short var123 = 256;
        if (field692 > 0) {
            for (int var124 = 0; var124 < 256; var124++) {
                if (field692 > 768) {
                    Statics.field722[var124] = method1804(Statics.field1699[var124], Statics.field2148[var124], 1024 - field692);
                } else if (field692 > 256) {
                    Statics.field722[var124] = Statics.field2148[var124];
                } else {
                    Statics.field722[var124] = method1804(Statics.field2148[var124], Statics.field1699[var124], 256 - field692);
                }
            }
        } else if (field702 > 0) {
            for (int var125 = 0; var125 < 256; var125++) {
                if (field702 > 768) {
                    Statics.field722[var125] = method1804(Statics.field1699[var125], Statics.field696[var125], 1024 - field702);
                } else if (field702 > 256) {
                    Statics.field722[var125] = Statics.field696[var125];
                } else {
                    Statics.field722[var125] = method1804(Statics.field696[var125], Statics.field1699[var125], 256 - field702);
                }
            }
        } else {
            for (int var126 = 0; var126 < 256; var126++) {
                Statics.field722[var126] = Statics.field1699[var126];
            }
        }
        class75.method1566(field701, 9, field701 + 128, var123 + 7);
        Statics.field2944.method1509(field701, 0);
        class75.method1534();
        int var127 = 0;
        int var128 = field701 + Statics.field999.field1321 * 9;
        for (int var129 = 1; var129 < var123 - 1; var129++) {
            int var130 = (var123 - var129) * field690[var129] / var123;
            int var131 = var130 + 22;
            if (var131 < 0) {
                var131 = 0;
            }
            var127 += var131;
            for (int var132 = var131; var132 < 128; var132++) {
                int var133 = Statics.field1618[var127++];
                if (var133 == 0) {
                    var128++;
                } else {
                    int var135 = 256 - var133;
                    int var136 = Statics.field722[var133];
                    int var137 = Statics.field999.field1320[var128];
                    Statics.field999.field1320[var128++] = ((var136 & 0xFF00FF) * var133 + (var137 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var136 & 0xFF00) * var133 + (var137 & 0xFF00) * var135 & 0xFF0000) >> 8;
                }
            }
            var128 += Statics.field999.field1321 + var131 - 128;
        }
        class75.method1566(field701 + 765 - 128, 9, field701 + 765, var123 + 7);
        Statics.field48.method1509(field701 + 382, 0);
        class75.method1534();
        int var138 = 0;
        int var139 = field701 + Statics.field999.field1321 * 9 + 24 + 637;
        for (int var140 = 1; var140 < var123 - 1; var140++) {
            int var141 = (var123 - var140) * field690[var140] / var123;
            int var142 = 103 - var141;
            int var143 = var139 + var141;
            for (int var144 = 0; var144 < var142; var144++) {
                int var145 = Statics.field1618[var138++];
                if (var145 == 0) {
                    var143++;
                } else {
                    int var147 = 256 - var145;
                    int var148 = Statics.field722[var145];
                    int var149 = Statics.field999.field1320[var143];
                    Statics.field999.field1320[var143++] = ((var148 & 0xFF00) * var145 + (var149 & 0xFF00) * var147 & 0xFF0000) + ((var148 & 0xFF00FF) * var145 + (var149 & 0xFF00FF) * var147 & 0xFF00FF00) >> 8;
                }
            }
            var138 += 128 - var142;
            var139 = Statics.field999.field1321 - var142 - var141 + var143;
        }
        Statics.field636[Statics.field1691.field125 ? 1 : 0].method1595(field701 + 765 - 40, 463);
        if (client.field266 > 5 && client.field423 == 0) {
            if (Statics.field2146 == null) {
                Statics.field2146 = class72.method2092(Statics.field56, "sl_button", "");
            } else {
                int var150 = field701 + 5;
                short var151 = 463;
                byte var152 = 100;
                byte var153 = 35;
                Statics.field2146.method1595(var150, var151);
                arg0.method3666(class148.field2367 + " " + client.field257, var152 / 2 + var150, var153 / 2 + var151 - 2, 16777215, 0);
                if (Statics.field2833 == null) {
                    arg1.method3666(class148.field2439, var152 / 2 + var150, var153 / 2 + var151 + 12, 16777215, 0);
                } else {
                    arg1.method3666(class148.field2326, var152 / 2 + var150, var153 / 2 + var151 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var154 = Statics.field1869.getGraphics();
            Statics.field999.method1367(var154, 0, 0);
        } catch (Exception var157) {
            Statics.field1869.repaint();
        }
    }

    @ObfuscatedName("ct.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1986(String arg0, String arg1, String arg2) {
        field689 = arg0;
        field703 = arg1;
        field716 = arg2;
    }

    @ObfuscatedName("ao.q(Lbk;B)V")
    public static final void method736(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field927.length; var2++) {
            Statics.field927[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field927[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2818[var8] = (Statics.field927[var8 - 1] + Statics.field927[var8 + 1] + Statics.field927[var8 - 128] + Statics.field927[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field927;
            Statics.field927 = Statics.field2818;
            Statics.field2818 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1352; var11++) {
            for (int var12 = 0; var12 < arg0.field1351; var12++) {
                if (arg0.field1347[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1350;
                    int var14 = var11 + 16 + arg0.field1349;
                    int var15 = (var14 << 7) + var13;
                    Statics.field927[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ck.l(IIII)I")
    public static final int method1804(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("q.c(Leo;B)V")
    public static void method72(class136 arg0) {
        if (class132.field2043 != 1 && Statics.field121 || class132.field2043 != 4) {
            return;
        }
        int var1 = field701 + 280;
        if (class132.field2034 >= var1 && class132.field2034 <= var1 + 14 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(0, 0);
            return;
        }
        if (class132.field2034 >= var1 + 15 && class132.field2034 <= var1 + 80 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(0, 1);
            return;
        }
        int var2 = field701 + 390;
        if (class132.field2034 >= var2 && class132.field2034 <= var2 + 14 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(1, 0);
            return;
        }
        if (class132.field2034 >= var2 + 15 && class132.field2034 <= var2 + 80 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(1, 1);
            return;
        }
        int var3 = field701 + 500;
        if (class132.field2034 >= var3 && class132.field2034 <= var3 + 14 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(2, 0);
            return;
        }
        if (class132.field2034 >= var3 + 15 && class132.field2034 <= var3 + 80 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(2, 1);
            return;
        }
        int var4 = field701 + 610;
        if (class132.field2034 >= var4 && class132.field2034 <= var4 + 14 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(3, 0);
            return;
        }
        if (class132.field2034 >= var4 + 15 && class132.field2034 <= var4 + 80 && class132.field2045 >= 4 && class132.field2045 <= 18) {
            class24.method166(3, 1);
            return;
        }
        if (class132.field2034 >= field701 + 708 && class132.field2045 >= 4 && class132.field2034 <= field701 + 708 + 50 && class132.field2045 <= 20) {
            field712 = false;
            Statics.field2944.method1509(field701, 0);
            Statics.field48.method1509(field701 + 382, 0);
            Statics.field686.method1595(field701 + 382 - Statics.field686.field1351 / 2, 18);
            return;
        }
        if (field713 == -1) {
            return;
        }
        class24 var5 = Statics.field544[field713];
        method564(var5);
        field712 = false;
        Statics.field2944.method1509(field701, 0);
        Statics.field48.method1509(field701 + 382, 0);
        Statics.field686.method1595(field701 + 382 - Statics.field686.field1351 / 2, 18);
        return;
    }

    @ObfuscatedName("r.f(Ld;I)V")
    public static void method564(class24 arg0) {
        if (arg0.method522() != client.field455) {
            client.field455 = arg0.method522();
            class47.method507(arg0.method522());
        }
        Statics.field992 = arg0.field616;
        client.field257 = arg0.field608;
        client.field295 = arg0.field614;
        Statics.field723 = client.field493 == 0 ? 43594 : arg0.field608 + 40000;
        Statics.field836 = client.field493 == 0 ? 443 : arg0.field608 + 50000;
        Statics.field195 = Statics.field723;
    }

    @ObfuscatedName("eh.s(I)V")
    public static void method2608() {
        if (class24.method3165()) {
            field712 = true;
        }
    }
}
