package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("aq")
public class class30 {

    @ObfuscatedName("aq.l")
    public static int field673 = 0;

    @ObfuscatedName("aq.n")
    public static int field680 = field673 + 202;

    @ObfuscatedName("aq.h")
    public static int[] field705 = new int[256];

    @ObfuscatedName("aq.s")
    public static int field683 = 0;

    @ObfuscatedName("aq.d")
    public static int field706 = 0;

    @ObfuscatedName("aq.ae")
    public static int field685 = 0;

    @ObfuscatedName("aq.aq")
    public static int field687 = 0;

    @ObfuscatedName("aq.ay")
    public static int field676 = 0;

    @ObfuscatedName("aq.ac")
    public static int field689 = 0;

    @ObfuscatedName("aq.ao")
    public static int field688 = 10;

    @ObfuscatedName("aq.ab")
    public static String field691 = "";

    @ObfuscatedName("aq.at")
    public static int field692 = 0;

    @ObfuscatedName("aq.ai")
    public static String field707 = "";

    @ObfuscatedName("aq.aa")
    public static String field694 = "";

    @ObfuscatedName("aq.ap")
    public static String field695 = "";

    @ObfuscatedName("aq.ad")
    public static String field696 = "";

    @ObfuscatedName("aq.aw")
    public static String field697 = "";

    @ObfuscatedName("aq.ax")
    public static class150 field686 = class150.field2484;

    @ObfuscatedName("aq.al")
    public static boolean field700 = true;

    @ObfuscatedName("aq.ak")
    public static int field701 = 0;

    @ObfuscatedName("aq.as")
    public static String field702 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aq.ag")
    public static String field703 = "1234567890";

    @ObfuscatedName("aq.au")
    public static boolean field704 = false;

    @ObfuscatedName("aq.bb")
    public static int field709 = 0;

    @ObfuscatedName("aq.bo")
    public static int[] field678 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aq.bv")
    public static int[] field674 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aq.bh")
    public static int field708 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.o(Ljava/awt/Component;Lfg;Lfg;ZII)V")
    public static void method2511(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field684) {
            field692 = arg4;
            class75.method1590();
            byte[] var5 = arg1.method2951("title.jpg", "");
            Statics.field675 = new class74(var5, arg0);
            Statics.field693 = Statics.field675.method1485();
            Statics.field572 = class72.method773(arg2, "logo", "");
            Statics.field3060 = class72.method773(arg2, "titlebox", "");
            Statics.field682 = class72.method773(arg2, "titlebutton", "");
            Statics.field1969 = class72.method2690(arg2, "runes", "");
            Statics.field677 = class72.method2690(arg2, "title_mute", "");
            Statics.field698 = class72.method773(arg2, "options_radio_buttons,0", "");
            Statics.field2056 = class72.method773(arg2, "options_radio_buttons,2", "");
            Statics.field3081 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field3081[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field3081[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field3081[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field3081[var9 + 192] = 16777215;
            }
            Statics.field1588 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1588[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1588[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1588[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1588[var13 + 192] = 16777215;
            }
            Statics.field681 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field681[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field681[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field681[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field681[var17 + 192] = 16777215;
            }
            Statics.field170 = new int[256];
            Statics.field1923 = new int[32768];
            Statics.field713 = new int[32768];
            method3069((class76) null);
            Statics.field553 = new int[32768];
            Statics.field1085 = new int[32768];
            if (arg3) {
                field696 = "";
                field697 = "";
            }
            Statics.field699 = 0;
            Statics.field1295 = "";
            field700 = true;
            field704 = false;
            if (Statics.field1877.field133) {
                class174.method553(2);
            } else {
                class174.method3582(2, Statics.field1311, "scape main", "", 255, false);
            }
            class162.method2042(false);
            Statics.field684 = true;
            field673 = (Statics.field3047 - client.field480) / 2;
            field680 = field673 + 202;
            Statics.field675.method1581(field673, 0);
            Statics.field693.method1581(field673 + 382, 0);
            Statics.field572.method1644(field673 + 382 - Statics.field572.field1345 / 2, 18);
        } else if (arg4 == 4) {
            field692 = 4;
        }
    }

    @ObfuscatedName("fk.l(I)V")
    public static void method3121() {
        if (!Statics.field684) {
            return;
        }
        Statics.field3060 = null;
        Statics.field682 = null;
        Statics.field1969 = null;
        Statics.field675 = null;
        Statics.field693 = null;
        Statics.field572 = null;
        Statics.field677 = null;
        Statics.field698 = null;
        Statics.field2056 = null;
        Statics.field2490 = null;
        Statics.field1145 = null;
        Statics.field546 = null;
        Statics.field70 = null;
        Statics.field995 = null;
        Statics.field3081 = null;
        Statics.field1588 = null;
        Statics.field681 = null;
        Statics.field170 = null;
        Statics.field1923 = null;
        Statics.field713 = null;
        Statics.field553 = null;
        Statics.field1085 = null;
        class174.method553(2);
        class162.method2042(true);
        Statics.field684 = false;
    }

    @ObfuscatedName("ag.g(Lea;B)V")
    public static void method977(class136 arg0) {
        if (field704) {
            method179(arg0);
            return;
        }
        if ((class132.field2047 == 1 || !Statics.field1276 && class132.field2047 == 4) && class132.field2049 >= field673 + 765 - 50 && class132.field2055 >= 453) {
            Statics.field1877.field133 = !Statics.field1877.field133;
            class9.method2588();
            if (Statics.field1877.field133) {
                Statics.field2842.method3277();
                class174.field2843 = 1;
                Statics.field2844 = null;
            } else {
                class174.method41(Statics.field1311, "scape main", "", 255, false);
            }
        }
        if (client.field268 == 5) {
            return;
        }
        field676++;
        if (client.field268 != 10 && client.field268 != 11) {
            return;
        }
        if (client.field264 == 0) {
            if (class132.field2047 == 1 || !Statics.field1276 && class132.field2047 == 4) {
                int var1 = field673 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class132.field2049 >= var1 && class132.field2049 <= var1 + var3 && class132.field2055 >= var2 && class132.field2055 <= var2 + var4) {
                    method3585();
                    return;
                }
            }
            if (Statics.field2587 != null) {
                method3585();
            }
        }
        int var5 = class132.field2047;
        int var6 = class132.field2049;
        int var7 = class132.field2055;
        if (!Statics.field1276 && var5 == 4) {
            var5 = 1;
        }
        if (field692 == 0) {
            int var8 = field680 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class130.method863(client.method1953("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field680 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field385 & 0x4) != 0) {
                    if ((client.field385 & 0x400) == 0) {
                        field707 = class148.field2290;
                        field694 = class148.field2320;
                        field695 = class148.field2415;
                    } else {
                        field707 = class148.field2386;
                        field694 = class148.field2420;
                        field695 = class148.field2363;
                    }
                    field692 = 1;
                    field701 = 0;
                } else if ((client.field385 & 0x400) == 0) {
                    field707 = class148.field2264;
                    field694 = class148.field2410;
                    field695 = class148.field2399;
                    field692 = 2;
                    field701 = 0;
                } else {
                    field707 = class148.field2379;
                    field694 = class148.field2417;
                    field695 = class148.field2418;
                    field692 = 1;
                    field701 = 0;
                }
            }
        } else if (field692 == 1) {
            while (class129.method1843()) {
                if (Statics.field2002 == 84) {
                    field707 = class148.field2264;
                    field694 = class148.field2410;
                    field695 = class148.field2399;
                    field692 = 2;
                    field701 = 0;
                } else if (Statics.field2002 == 13) {
                    field692 = 0;
                }
            }
            int var11 = field680 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field707 = class148.field2264;
                field694 = class148.field2410;
                field695 = class148.field2399;
                field692 = 2;
                field701 = 0;
            }
            int var13 = field680 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field692 = 0;
            }
        } else if (field692 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field701 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field701 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method641(class148.field2440, class148.field2273, class148.field2442);
                field692 = 5;
                return;
            }
            int var16 = field680 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field696 = field696.trim();
                if (field696.length() == 0) {
                    method641(class148.field2315, class148.field2316, class148.field2317);
                    return;
                }
                if (field697.length() == 0) {
                    method641(class148.field2318, class148.field2319, class148.field2324);
                    return;
                }
                method641(class148.field2424, class148.field2425, class148.field2262);
                field686 = Statics.field1877.field131.containsKey(class154.method2481(field696)) ? class150.field2489 : class150.field2484;
                client.method2543(20);
                return;
            }
            int var18 = field680 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field692 = 0;
                field696 = "";
                field697 = "";
                Statics.field699 = 0;
                Statics.field1295 = "";
                field700 = true;
            }
            while (true) {
                while (class129.method1843()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field702.length(); var20++) {
                        if (Statics.field1815 == field702.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field2002 == 13) {
                        field692 = 0;
                        field696 = "";
                        field697 = "";
                        Statics.field699 = 0;
                        Statics.field1295 = "";
                        field700 = true;
                    } else if (field701 == 0) {
                        if (Statics.field2002 == 85 && field696.length() > 0) {
                            field696 = field696.substring(0, field696.length() - 1);
                        }
                        if (Statics.field2002 == 84 || Statics.field2002 == 80) {
                            field701 = 1;
                        }
                        if (var19 && field696.length() < 320) {
                            field696 = field696 + Statics.field1815;
                        }
                    } else if (field701 == 1) {
                        if (Statics.field2002 == 85 && field697.length() > 0) {
                            field697 = field697.substring(0, field697.length() - 1);
                        }
                        if (Statics.field2002 == 84 || Statics.field2002 == 80) {
                            field701 = 0;
                        }
                        if (Statics.field2002 == 84) {
                            field696 = field696.trim();
                            if (field696.length() == 0) {
                                method641(class148.field2315, class148.field2316, class148.field2317);
                                return;
                            }
                            if (field697.length() == 0) {
                                method641(class148.field2318, class148.field2319, class148.field2324);
                                return;
                            }
                            method641(class148.field2424, class148.field2425, class148.field2262);
                            field686 = Statics.field1877.field131.containsKey(class154.method2481(field696)) ? class150.field2489 : class150.field2484;
                            client.method2543(20);
                            return;
                        }
                        if (var19 && field697.length() < 20) {
                            field697 = field697 + Statics.field1815;
                        }
                    }
                }
                return;
            }
        } else if (field692 == 4) {
            int var21 = field680 + 180 - 80;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field1295.trim();
                if (Statics.field1295.length() != 6) {
                    method641(class148.field2231, class148.field2374, class148.field2421);
                    return;
                }
                Statics.field699 = Integer.parseInt(Statics.field1295);
                Statics.field1295 = "";
                field686 = field700 ? class150.field2482 : class150.field2485;
                method641(class148.field2424, class148.field2425, class148.field2262);
                client.method2543(20);
                return;
            }
            if (var5 == 1 && var6 >= field680 + 180 - 9 && var6 <= field680 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field700 = !field700;
            }
            if (var5 == 1 && var6 >= field680 + 180 - 34 && var6 <= field680 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class130.method863(client.method1953("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var23 = field680 + 180 + 80;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field692 = 0;
                field696 = "";
                field697 = "";
                Statics.field699 = 0;
                Statics.field1295 = "";
            }
            while (class129.method1843()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field703.length(); var25++) {
                    if (Statics.field1815 == field703.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field2002 == 13) {
                    field692 = 0;
                    field696 = "";
                    field697 = "";
                    Statics.field699 = 0;
                    Statics.field1295 = "";
                } else {
                    if (Statics.field2002 == 85 && Statics.field1295.length() > 0) {
                        Statics.field1295 = Statics.field1295.substring(0, Statics.field1295.length() - 1);
                    }
                    if (Statics.field2002 == 84) {
                        Statics.field1295.trim();
                        if (Statics.field1295.length() != 6) {
                            method641(class148.field2231, class148.field2374, class148.field2421);
                            return;
                        }
                        Statics.field699 = Integer.parseInt(Statics.field1295);
                        Statics.field1295 = "";
                        field686 = field700 ? class150.field2482 : class150.field2485;
                        method641(class148.field2424, class148.field2425, class148.field2262);
                        client.method2543(20);
                        return;
                    }
                    if (var24 && Statics.field1295.length() < 6) {
                        Statics.field1295 = Statics.field1295 + Statics.field1815;
                    }
                }
            }
        } else if (field692 == 5) {
            int var26 = field680 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method3645();
                return;
            }
            int var28 = field680 + 180 + 80;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field707 = class148.field2264;
                field694 = class148.field2410;
                field695 = class148.field2399;
                field692 = 2;
                field701 = 0;
                field697 = "";
            }
            while (class129.method1843()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field702.length(); var30++) {
                    if (Statics.field1815 == field702.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field2002 == 13) {
                    field707 = class148.field2264;
                    field694 = class148.field2410;
                    field695 = class148.field2399;
                    field692 = 2;
                    field701 = 0;
                    field697 = "";
                } else {
                    if (Statics.field2002 == 85 && field696.length() > 0) {
                        field696 = field696.substring(0, field696.length() - 1);
                    }
                    if (Statics.field2002 == 84) {
                        method3645();
                        return;
                    }
                    if (var29 && field696.length() < 320) {
                        field696 = field696 + Statics.field1815;
                    }
                }
            }
        } else if (field692 == 6) {
            while (true) {
                do {
                    if (!class129.method1843()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field707 = class148.field2264;
                            field694 = class148.field2410;
                            field695 = class148.field2399;
                            field692 = 2;
                            field701 = 0;
                            field697 = "";
                        }
                        return;
                    }
                } while (Statics.field2002 != 84 && Statics.field2002 != 13);
                field707 = class148.field2264;
                field694 = class148.field2410;
                field695 = class148.field2399;
                field692 = 2;
                field701 = 0;
                field697 = "";
            }
        }
    }

    @ObfuscatedName("ho.u(I)V")
    public static void method3645() {
        field696 = field696.trim();
        if (field696.length() == 0) {
            method641(class148.field2440, class148.field2273, class148.field2442);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1953("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class111 var4 = new class111(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1860, var4.field1861, 1000 - var4.field1861);
                if (var5 == -1) {
                    var4.field1861 = 0;
                    long var8 = var4.method2292();
                    var6 = var8;
                    break;
                }
                var4.field1861 += var5;
                if (var4.field1861 >= 1000) {
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
            var13 = class10.method2881(var6, field696);
        }
        switch(var13) {
            case 2:
                method641(class148.field2332, class148.field2282, class148.field2445);
                field692 = 6;
                break;
            case 3:
                method641(class148.field2446, class148.field2286, class148.field2405);
                break;
            case 4:
                method641(class148.field2448, class148.field2198, class148.field2451);
                break;
            case 5:
                method641(class148.field2452, class148.field2453, class148.field2454);
                break;
            case 6:
                method641(class148.field2455, class148.field2456, class148.field2457);
                break;
            case 7:
                method641(class148.field2458, class148.field2459, class148.field2460);
        }
    }

    @ObfuscatedName("r.q(Lhd;Lhd;Lhd;ZI)V")
    public static void method60(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field673 = (Statics.field3047 - client.field480) / 2;
            field680 = field673 + 202;
        }
        if (field704) {
            method735(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field675.method1581(field673, 0);
            Statics.field693.method1581(field673 + 382, 0);
            Statics.field572.method1644(field673 + 382 - Statics.field572.field1345 / 2, 18);
        }
        if (client.field268 == 0 || client.field268 == 5) {
            byte var4 = 20;
            arg0.method3658(class148.field2408, field680 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class75.method1640(field680 + 180 - 152, var5, 304, 34, 9179409);
            class75.method1640(field680 + 180 - 151, var5 + 1, 302, 32, 0);
            class75.method1592(field680 + 180 - 150, var5 + 2, field688 * 3, 30, 9179409);
            class75.method1592(field688 * 3 + (field680 + 180 - 150), var5 + 2, 300 - field688 * 3, 30, 0);
            arg0.method3658(field691, field680 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field268 == 20) {
            Statics.field3060.method1644(field680 + 180 - Statics.field3060.field1345 / 2, 271 - Statics.field3060.field1346 / 2);
            short var6 = 211;
            arg0.method3658(field707, field680 + 180, var6, 16776960, 0);
            int var74 = var6 + 15;
            arg0.method3658(field694, field680 + 180, var74, 16776960, 0);
            int var75 = var74 + 15;
            arg0.method3658(field695, field680 + 180, var75, 16776960, 0);
            int var76 = var75 + 15;
            int var77 = var76 + 10;
            if (field692 != 4) {
                arg0.method3656(class148.field2337, field680 + 180 - 110, var77, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field696; arg0.method3651(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3656(class214.method3736(var8), field680 + 180 - 70, var77, 16777215, 0);
                var74 = var77 + 15;
                arg0.method3656(class148.field2428 + class154.method2870(field697), field680 + 180 - 108, var74, 16777215, 0);
                var74 += 15;
            }
        }
        if (client.field268 == 10 || client.field268 == 11) {
            Statics.field3060.method1644(field680, 171);
            if (field692 == 0) {
                short var9 = 251;
                arg0.method3658(class148.field2235, field680 + 180, var9, 16776960, 0);
                int var78 = var9 + 30;
                int var10 = field680 + 180 - 80;
                short var11 = 291;
                Statics.field682.method1644(var10 - 73, var11 - 20);
                arg0.method3734(class148.field2431, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field680 + 180 + 80;
                Statics.field682.method1644(var12 - 73, var11 - 20);
                arg0.method3734(class148.field2432, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field692 == 1) {
                arg0.method3658(class148.field2450, field680 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3658(field707, field680 + 180, var13, 16777215, 0);
                int var79 = var13 + 15;
                arg0.method3658(field694, field680 + 180, var79, 16777215, 0);
                int var80 = var79 + 15;
                arg0.method3658(field695, field680 + 180, var80, 16777215, 0);
                int var81 = var80 + 15;
                int var14 = field680 + 180 - 80;
                short var15 = 321;
                Statics.field682.method1644(var14 - 73, var15 - 20);
                arg0.method3658(class148.field2203, var14, var15 + 5, 16777215, 0);
                int var16 = field680 + 180 + 80;
                Statics.field682.method1644(var16 - 73, var15 - 20);
                arg0.method3658(class148.field2427, var16, var15 + 5, 16777215, 0);
            } else if (field692 == 2) {
                short var17 = 211;
                arg0.method3658(field707, field680 + 180, var17, 16776960, 0);
                int var82 = var17 + 15;
                arg0.method3658(field694, field680 + 180, var82, 16776960, 0);
                int var83 = var82 + 15;
                arg0.method3658(field695, field680 + 180, var83, 16776960, 0);
                int var84 = var83 + 15;
                int var85 = var84 + 10;
                arg0.method3656(class148.field2337, field680 + 180 - 110, var85, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field696; arg0.method3651(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3656(class214.method3736(var19) + (field701 == 0 & client.field270 % 40 < 20 ? class2.method3034(16776960) + class2.field24 : ""), field680 + 180 - 70, var85, 16777215, 0);
                var82 = var85 + 15;
                arg0.method3656(class148.field2428 + class154.method2870(field697) + (field701 == 1 & client.field270 % 40 < 20 ? class2.method3034(16776960) + class2.field24 : ""), field680 + 180 - 108, var82, 16777215, 0);
                var82 += 15;
                int var20 = field680 + 180 - 80;
                short var21 = 321;
                Statics.field682.method1644(var20 - 73, var21 - 20);
                arg0.method3658(class148.field2197, var20, var21 + 5, 16777215, 0);
                int var22 = field680 + 180 + 80;
                Statics.field682.method1644(var22 - 73, var21 - 20);
                arg0.method3658(class148.field2427, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3658(class148.field2378, field680 + 180, var23, 16776960, 0);
            } else if (field692 == 4) {
                arg0.method3658(class148.field2232, field680 + 180, 211, 16776960, 0);
                short var24 = 236;
                arg0.method3658(field707, field680 + 180, var24, 16777215, 0);
                int var86 = var24 + 15;
                arg0.method3658(field694, field680 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method3658(field695, field680 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                arg0.method3656(class148.field2392 + class154.method2870(Statics.field1295) + (client.field270 % 40 < 20 ? class2.method3034(16776960) + class2.field24 : ""), field680 + 180 - 108, var88, 16777215, 0);
                int var89 = var88 - 8;
                arg0.method3656(class148.field2205, field680 + 180 - 9, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method3656(class148.field2206, field680 + 180 - 9, var90, 16776960, 0);
                int var25 = field680 + 180 - 9 + arg0.method3651(class148.field2206) + 15;
                int var26 = var90 - arg0.field3089;
                class76 var27;
                if (field700) {
                    var27 = Statics.field2056;
                } else {
                    var27 = Statics.field698;
                }
                var27.method1644(var25, var26);
                var86 = var90 + 15;
                int var28 = field680 + 180 - 80;
                short var29 = 321;
                Statics.field682.method1644(var28 - 73, var29 - 20);
                arg0.method3658(class148.field2203, var28, var29 + 5, 16777215, 0);
                int var30 = field680 + 180 + 80;
                Statics.field682.method1644(var30 - 73, var29 - 20);
                arg0.method3658(class148.field2427, var30, var29 + 5, 16777215, 0);
                arg1.method3658(class148.field2423, field680 + 180, var29 + 36, 255, 0);
            } else if (field692 == 5) {
                arg0.method3658(class148.field2436, field680 + 180, 201, 16776960, 0);
                short var31 = 221;
                arg2.method3658(field707, field680 + 180, var31, 16776960, 0);
                int var91 = var31 + 15;
                arg2.method3658(field694, field680 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg2.method3658(field695, field680 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var94 = var93 + 14;
                arg0.method3656(class148.field2437, field680 + 180 - 145, var94, 16777215, 0);
                short var32 = 174;
                String var33;
                for (var33 = field696; arg0.method3651(var33) > var32; var33 = var33.substring(1)) {
                }
                arg0.method3656(class214.method3736(var33) + (client.field270 % 40 < 20 ? class2.method3034(16776960) + class2.field24 : ""), field680 + 180 - 34, var94, 16777215, 0);
                var91 = var94 + 15;
                int var34 = field680 + 180 - 80;
                short var35 = 321;
                Statics.field682.method1644(var34 - 73, var35 - 20);
                arg0.method3658(class148.field2438, var34, var35 + 5, 16777215, 0);
                int var36 = field680 + 180 + 80;
                Statics.field682.method1644(var36 - 73, var35 - 20);
                arg0.method3658(class148.field2439, var36, var35 + 5, 16777215, 0);
            } else if (field692 == 6) {
                short var37 = 211;
                arg0.method3658(field707, field680 + 180, var37, 16776960, 0);
                int var95 = var37 + 15;
                arg0.method3658(field694, field680 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method3658(field695, field680 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                int var38 = field680 + 180;
                short var39 = 321;
                Statics.field682.method1644(var38 - 73, var39 - 20);
                arg0.method3658(class148.field2439, var38, var39 + 5, 16777215, 0);
            }
        }
        if (field676 > 0) {
            method2035(field676);
            field676 = 0;
        }
        short var40 = 256;
        if (field683 > 0) {
            for (int var41 = 0; var41 < 256; var41++) {
                if (field683 > 768) {
                    Statics.field170[var41] = method1940(Statics.field3081[var41], Statics.field1588[var41], 1024 - field683);
                } else if (field683 > 256) {
                    Statics.field170[var41] = Statics.field1588[var41];
                } else {
                    Statics.field170[var41] = method1940(Statics.field1588[var41], Statics.field3081[var41], 256 - field683);
                }
            }
        } else if (field706 > 0) {
            for (int var42 = 0; var42 < 256; var42++) {
                if (field706 > 768) {
                    Statics.field170[var42] = method1940(Statics.field3081[var42], Statics.field681[var42], 1024 - field706);
                } else if (field706 > 256) {
                    Statics.field170[var42] = Statics.field681[var42];
                } else {
                    Statics.field170[var42] = method1940(Statics.field681[var42], Statics.field3081[var42], 256 - field706);
                }
            }
        } else {
            for (int var43 = 0; var43 < 256; var43++) {
                Statics.field170[var43] = Statics.field3081[var43];
            }
        }
        class75.method1586(field673, 9, field673 + 128, var40 + 7);
        Statics.field675.method1581(field673, 0);
        class75.method1601();
        int var44 = 0;
        int var45 = field673 + Statics.field816.field1320 * 9;
        for (int var46 = 1; var46 < var40 - 1; var46++) {
            int var47 = (var40 - var46) * field705[var46] / var40;
            int var48 = var47 + 22;
            if (var48 < 0) {
                var48 = 0;
            }
            var44 += var48;
            for (int var49 = var48; var49 < 128; var49++) {
                int var50 = Statics.field553[var44++];
                if (var50 == 0) {
                    var45++;
                } else {
                    int var52 = 256 - var50;
                    int var53 = Statics.field170[var50];
                    int var54 = Statics.field816.field1319[var45];
                    Statics.field816.field1319[var45++] = ((var53 & 0xFF00) * var50 + (var54 & 0xFF00) * var52 & 0xFF0000) + ((var53 & 0xFF00FF) * var50 + (var54 & 0xFF00FF) * var52 & 0xFF00FF00) >> 8;
                }
            }
            var45 += Statics.field816.field1320 + var48 - 128;
        }
        class75.method1586(field673 + 765 - 128, 9, field673 + 765, var40 + 7);
        Statics.field693.method1581(field673 + 382, 0);
        class75.method1601();
        int var55 = 0;
        int var56 = field673 + Statics.field816.field1320 * 9 + 24 + 637;
        for (int var57 = 1; var57 < var40 - 1; var57++) {
            int var58 = (var40 - var57) * field705[var57] / var40;
            int var59 = 103 - var58;
            int var60 = var56 + var58;
            for (int var61 = 0; var61 < var59; var61++) {
                int var62 = Statics.field553[var55++];
                if (var62 == 0) {
                    var60++;
                } else {
                    int var64 = 256 - var62;
                    int var65 = Statics.field170[var62];
                    int var66 = Statics.field816.field1319[var60];
                    Statics.field816.field1319[var60++] = ((var65 & 0xFF00FF) * var62 + (var66 & 0xFF00FF) * var64 & 0xFF00FF00) + ((var65 & 0xFF00) * var62 + (var66 & 0xFF00) * var64 & 0xFF0000) >> 8;
                }
            }
            var55 += 128 - var59;
            var56 = Statics.field816.field1320 - var59 - var58 + var60;
        }
        Statics.field677[Statics.field1877.field133 ? 1 : 0].method1644(field673 + 765 - 40, 463);
        if (client.field268 > 5 && client.field264 == 0) {
            if (Statics.field995 == null) {
                Statics.field995 = class72.method773(Statics.field2964, "sl_button", "");
            } else {
                int var67 = field673 + 5;
                short var68 = 463;
                byte var69 = 100;
                byte var70 = 35;
                Statics.field995.method1644(var67, var68);
                arg0.method3658(class148.field2233 + " " + client.field256, var69 / 2 + var67, var70 / 2 + var68 - 2, 16777215, 0);
                if (Statics.field2587 == null) {
                    arg1.method3658(class148.field2471, var69 / 2 + var67, var70 / 2 + var68 + 12, 16777215, 0);
                } else {
                    arg1.method3658(class148.field2382, var69 / 2 + var67, var70 / 2 + var68 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var71 = Statics.field594.getGraphics();
            Statics.field816.method1408(var71, 0, 0);
        } catch (Exception var73) {
            Statics.field594.repaint();
        }
    }

    @ObfuscatedName("ab.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method641(String arg0, String arg1, String arg2) {
        field707 = arg0;
        field694 = arg1;
        field695 = arg2;
    }

    @ObfuscatedName("fj.v(Lbw;B)V")
    public static final void method3069(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1923.length; var2++) {
            Statics.field1923[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1923[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field713[var8] = (Statics.field1923[var8 - 1] + Statics.field1923[var8 + 1] + Statics.field1923[var8 - 128] + Statics.field1923[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1923;
            Statics.field1923 = Statics.field713;
            Statics.field713 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1346; var11++) {
            for (int var12 = 0; var12 < arg0.field1345; var12++) {
                if (arg0.field1348[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1344;
                    int var14 = var11 + 16 + arg0.field1347;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1923[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cx.y(IB)V")
    public static final void method2035(int arg0) {
        short var1 = 256;
        field685 += arg0 * 128;
        if (field685 > Statics.field1923.length) {
            field685 -= Statics.field1923.length;
            int var2 = (int) (Math.random() * 12.0D);
            method3069(Statics.field1969[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field553[var3 + var4] - Statics.field1923[field685 + var3 & Statics.field1923.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field553[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field553[var9 + var10] = 255;
                } else {
                    Statics.field553[var9 + var10] = 0;
                }
            }
        }
        if (field683 > 0) {
            field683 -= arg0 * 4;
        }
        if (field706 > 0) {
            field706 -= arg0 * 4;
        }
        if (field683 == 0 && field706 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field683 = 1024;
            }
            if (var12 == 1) {
                field706 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field705[var13] = field705[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field705[var14] = (int) (Math.sin((double) field689 / 14.0D) * 16.0D + Math.sin((double) field689 / 15.0D) * 14.0D + Math.sin((double) field689 / 16.0D) * 12.0D);
            field689++;
        }
        field687 += arg0 * -1530086401;
        int var15 = ((client.field270 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field687 * 835096476; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field553[(var18 << 7) + var17] = 192;
        }
        field687 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field553[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field553[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1085[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1085[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1085[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field553[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cn.k(IIII)I")
    public static final int method1940(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ap.c(Lhd;Lhd;B)V")
    public static void method735(class215 arg0, class215 arg1) {
        if (Statics.field2490 == null) {
            Statics.field2490 = class72.method1471(Statics.field2964, "sl_back", "");
        }
        if (Statics.field1145 == null) {
            Statics.field1145 = class72.method2690(Statics.field2964, "sl_flags", "");
        }
        if (Statics.field546 == null) {
            Statics.field546 = class72.method2690(Statics.field2964, "sl_arrows", "");
        }
        if (Statics.field70 == null) {
            Statics.field70 = class72.method2690(Statics.field2964, "sl_stars", "");
        }
        class75.method1592(field673, 23, 765, 480, 0);
        class75.method1593(field673, 0, 125, 23, 12425273, 9135624);
        class75.method1593(field673 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3658(class148.field2461, field673 + 62, 15, 0, -1);
        if (Statics.field70 != null) {
            Statics.field70[1].method1644(field673 + 140, 1);
            arg1.method3656(class148.field2462, field673 + 152, 10, 16777215, -1);
            Statics.field70[0].method1644(field673 + 140, 12);
            arg1.method3656(class148.field2463, field673 + 152, 21, 16777215, -1);
        }
        if (Statics.field546 != null) {
            int var2 = field673 + 280;
            if (field678[0] == 0 && field674[0] == 0) {
                Statics.field546[2].method1644(var2, 4);
            } else {
                Statics.field546[0].method1644(var2, 4);
            }
            if (field678[0] == 0 && field674[0] == 1) {
                Statics.field546[3].method1644(var2 + 15, 4);
            } else {
                Statics.field546[1].method1644(var2 + 15, 4);
            }
            arg0.method3656(class148.field2464, var2 + 32, 17, 16777215, -1);
            int var3 = field673 + 390;
            if (field678[0] == 1 && field674[0] == 0) {
                Statics.field546[2].method1644(var3, 4);
            } else {
                Statics.field546[0].method1644(var3, 4);
            }
            if (field678[0] == 1 && field674[0] == 1) {
                Statics.field546[3].method1644(var3 + 15, 4);
            } else {
                Statics.field546[1].method1644(var3 + 15, 4);
            }
            arg0.method3656(class148.field2433, var3 + 32, 17, 16777215, -1);
            int var4 = field673 + 500;
            if (field678[0] == 2 && field674[0] == 0) {
                Statics.field546[2].method1644(var4, 4);
            } else {
                Statics.field546[0].method1644(var4, 4);
            }
            if (field678[0] == 2 && field674[0] == 1) {
                Statics.field546[3].method1644(var4 + 15, 4);
            } else {
                Statics.field546[1].method1644(var4 + 15, 4);
            }
            arg0.method3656(class148.field2466, var4 + 32, 17, 16777215, -1);
            int var5 = field673 + 610;
            if (field678[0] == 3 && field674[0] == 0) {
                Statics.field546[2].method1644(var5, 4);
            } else {
                Statics.field546[0].method1644(var5, 4);
            }
            if (field678[0] == 3 && field674[0] == 1) {
                Statics.field546[3].method1644(var5 + 15, 4);
            } else {
                Statics.field546[1].method1644(var5 + 15, 4);
            }
            arg0.method3656(class148.field2467, var5 + 32, 17, 16777215, -1);
        }
        class75.method1592(field673 + 708, 4, 50, 16, 0);
        arg1.method3658(class148.field2427, field673 + 708 + 25, 16, 16777215, -1);
        field708 = -1;
        if (Statics.field2490 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field709) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field709) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field709) {
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
            int var17 = field673 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < field709; var20++) {
                class24 var21 = Statics.field1936[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field613);
                if (var21.field613 == -1) {
                    var23 = class148.field2468;
                    var22 = false;
                } else if (var21.field613 > 1980) {
                    var23 = class148.field2469;
                    var22 = false;
                }
                byte var24;
                if (var21.method564()) {
                    if (var21.method561()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method561()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class132.field2041 >= var17 && class132.field2050 >= var16 && class132.field2041 < var6 + var17 && class132.field2050 < var7 + var16 && var22) {
                    field708 = var20;
                    Statics.field2490[var24].method1500(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2490[var24].method1581(var17, var16);
                }
                if (Statics.field1145 != null) {
                    Statics.field1145[(var21.method561() ? 8 : 0) + var21.field616].method1644(var17 + 29, var16);
                }
                arg0.method3658(Integer.toString(var21.field611), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3658(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3651(Statics.field1936[field708].field615) + 6;
                int var26 = arg1.field3089 + 8;
                class75.method1592(class132.field2041 - var25 / 2, class132.field2050 + 20 + 5, var25, var26, 16777120);
                class75.method1640(class132.field2041 - var25 / 2, class132.field2050 + 20 + 5, var25, var26, 0);
                arg1.method3658(Statics.field1936[field708].field615, class132.field2041, class132.field2050 + 20 + 5 + arg1.field3089 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field594.getGraphics();
            Statics.field816.method1408(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field594.repaint();
        }
    }

    @ObfuscatedName("h.j(Lea;I)V")
    public static void method179(class136 arg0) {
        if (class132.field2047 != 1 && Statics.field1276 || class132.field2047 != 4) {
            return;
        }
        int var1 = field673 + 280;
        if (class132.field2049 >= var1 && class132.field2049 <= var1 + 14 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(0, 0);
            return;
        }
        if (class132.field2049 >= var1 + 15 && class132.field2049 <= var1 + 80 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(0, 1);
            return;
        }
        int var2 = field673 + 390;
        if (class132.field2049 >= var2 && class132.field2049 <= var2 + 14 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(1, 0);
            return;
        }
        if (class132.field2049 >= var2 + 15 && class132.field2049 <= var2 + 80 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(1, 1);
            return;
        }
        int var3 = field673 + 500;
        if (class132.field2049 >= var3 && class132.field2049 <= var3 + 14 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(2, 0);
            return;
        }
        if (class132.field2049 >= var3 + 15 && class132.field2049 <= var3 + 80 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(2, 1);
            return;
        }
        int var4 = field673 + 610;
        if (class132.field2049 >= var4 && class132.field2049 <= var4 + 14 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(3, 0);
            return;
        }
        if (class132.field2049 >= var4 + 15 && class132.field2049 <= var4 + 80 && class132.field2055 >= 4 && class132.field2055 <= 18) {
            method713(3, 1);
            return;
        }
        if (class132.field2049 >= field673 + 708 && class132.field2055 >= 4 && class132.field2049 <= field673 + 708 + 50 && class132.field2055 <= 20) {
            field704 = false;
            Statics.field675.method1581(field673, 0);
            Statics.field693.method1581(field673 + 382, 0);
            Statics.field572.method1644(field673 + 382 - Statics.field572.field1345 / 2, 18);
            return;
        }
        if (field708 == -1) {
            return;
        }
        class24 var5 = Statics.field1936[field708];
        method521(var5);
        field704 = false;
        Statics.field675.method1581(field673, 0);
        Statics.field693.method1581(field673 + 382, 0);
        Statics.field572.method1644(field673 + 382 - Statics.field572.field1345 / 2, 18);
        return;
    }

    @ObfuscatedName("client.m(Ld;I)V")
    public static void method521(class24 arg0) {
        if (arg0.method561() != client.field407) {
            client.field407 = arg0.method561();
            class47.method180(arg0.method561());
        }
        Statics.field1306 = arg0.field614;
        client.field256 = arg0.field611;
        client.field385 = arg0.field620;
        Statics.field1878 = client.field455 == 0 ? 43594 : arg0.field611 + 40000;
        Statics.field230 = client.field455 == 0 ? 443 : arg0.field611 + 50000;
        Statics.field2033 = Statics.field1878;
    }

    @ObfuscatedName("gi.a(I)V")
    public static void method3585() {
        try {
            if (Statics.field2587 == null) {
                Statics.field2587 = new class18(Statics.field1007, new URL(Statics.field384));
            } else {
                byte[] var0 = Statics.field2587.method176();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field709 = var1.method2397();
                    Statics.field1936 = new class24[field709];
                    int var2 = 0;
                    while (var2 < field709) {
                        class24 var3 = Statics.field1936[var2] = new class24();
                        var3.field611 = var1.method2397();
                        var3.field620 = var1.method2273();
                        var3.field614 = var1.method2339();
                        var3.field615 = var1.method2339();
                        var3.field616 = var1.method2219();
                        var3.field613 = var1.method2222();
                        var3.field617 = var2++;
                    }
                    Statics.method1472(Statics.field1936, 0, Statics.field1936.length - 1, field678, field674);
                    field704 = true;
                    Statics.field2587 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2587 = null;
        }
    }

    @ObfuscatedName("ap.f(III)V")
    public static void method713(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field678[var5] != arg0) {
                var2[var4] = field678[var5];
                var3[var4] = field674[var5];
                var4++;
            }
        }
        field678 = var2;
        field674 = var3;
        Statics.method1472(Statics.field1936, 0, Statics.field1936.length - 1, field678, field674);
    }
}
