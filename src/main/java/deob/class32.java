package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("av")
public class class32 {

    @ObfuscatedName("av.d")
    public static int field685 = 0;

    @ObfuscatedName("av.z")
    public static int field693 = field685 + 202;

    @ObfuscatedName("av.o")
    public static int[] field692 = new int[256];

    @ObfuscatedName("av.c")
    public static int field695 = 0;

    @ObfuscatedName("av.l")
    public static int field710 = 0;

    @ObfuscatedName("av.ab")
    public static int field697 = 0;

    @ObfuscatedName("av.ac")
    public static int field698 = 0;

    @ObfuscatedName("av.ad")
    public static int field699 = 0;

    @ObfuscatedName("av.av")
    public static int field704 = 0;

    @ObfuscatedName("av.ar")
    public static int field694 = 10;

    @ObfuscatedName("av.al")
    public static String field702 = "";

    @ObfuscatedName("av.aj")
    public static int field703 = 0;

    @ObfuscatedName("av.au")
    public static String field705 = "";

    @ObfuscatedName("av.aw")
    public static String field700 = "";

    @ObfuscatedName("av.ax")
    public static String field706 = "";

    @ObfuscatedName("av.ap")
    public static String field707 = "";

    @ObfuscatedName("av.af")
    public static String field708 = "";

    @ObfuscatedName("av.ag")
    public static class159 field709 = class159.field2582;

    @ObfuscatedName("av.ak")
    public static boolean field720 = true;

    @ObfuscatedName("av.ay")
    public static int field711 = 0;

    @ObfuscatedName("av.ai")
    public static String field701 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("av.am")
    public static String field713 = "1234567890";

    @ObfuscatedName("av.as")
    public static boolean field690 = false;

    @ObfuscatedName("av.bm")
    public static int field715 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.n(Lfm;Lfm;B)I")
    public static int method10(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3028("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3028("logo", "")) {
            var2++;
        }
        if (arg1.method3028("titlebox", "")) {
            var2++;
        }
        if (arg1.method3028("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3028("runes", "")) {
            var2++;
        }
        if (arg1.method3028("title_mute", "")) {
            var2++;
        }
        if (arg1.method3029("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3029("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3028("sl_back", "");
        arg1.method3028("sl_flags", "");
        arg1.method3028("sl_arrows", "");
        arg1.method3028("sl_stars", "");
        arg1.method3028("sl_button", "");
        return var2;
    }

    @ObfuscatedName("w.d(Ljava/awt/Component;Lfm;Lfm;ZIB)V")
    public static void method621(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field717) {
            field703 = arg4;
            class80.method1656();
            byte[] var5 = arg1.method3027("title.jpg", "");
            Statics.field3142 = new class79(var5, arg0);
            Statics.field1340 = Statics.field3142.method1561();
            Statics.field689 = class77.method1203(arg2, "logo", "");
            Statics.field686 = class77.method1203(arg2, "titlebox", "");
            Statics.field687 = class77.method1203(arg2, "titlebutton", "");
            Statics.field716 = class77.method3290(arg2, "runes", "");
            Statics.field696 = class77.method3290(arg2, "title_mute", "");
            Statics.field1071 = class77.method1203(arg2, "options_radio_buttons,0", "");
            Statics.field961 = class77.method1203(arg2, "options_radio_buttons,2", "");
            Statics.field269 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field269[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field269[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field269[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field269[var9 + 192] = 16777215;
            }
            Statics.field2250 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2250[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2250[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2250[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2250[var13 + 192] = 16777215;
            }
            Statics.field1931 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1931[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1931[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1931[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1931[var17 + 192] = 16777215;
            }
            Statics.field959 = new int[256];
            Statics.field1755 = new int[32768];
            Statics.field2008 = new int[32768];
            method929((class81) null);
            Statics.field1020 = new int[32768];
            Statics.field859 = new int[32768];
            if (arg3) {
                field707 = "";
                field708 = "";
            }
            Statics.field141 = 0;
            Statics.field130 = "";
            field720 = true;
            field690 = false;
            if (Statics.field2984.field134) {
                class183.method641(2);
            } else {
                class168 var18 = Statics.field1859;
                int var19 = var18.method3024("scape main");
                int var20 = var18.method3026(var19, "");
                class183.method2275(2, var18, var19, var20, 255, false);
            }
            Statics.method2640(false);
            Statics.field717 = true;
            field685 = (Statics.field1778 - client.field489) / 2;
            field693 = field685 + 202;
            Statics.field3142.method1570(field685, 0);
            Statics.field1340.method1570(field685 + 382, 0);
            Statics.field689.method1715(field685 + 382 - Statics.field689.field1411 / 2, 18);
        } else if (arg4 == 4) {
            field703 = 4;
        }
    }

    @ObfuscatedName("q.s(Lek;I)V")
    public static void method40(class144 arg0) {
        if (field690) {
            method90(arg0);
            return;
        }
        if ((class140.field2141 == 1 || !Statics.field14 && class140.field2141 == 4) && class140.field2144 >= field685 + 765 - 50 && class140.field2135 >= 453) {
            Statics.field2984.field134 = !Statics.field2984.field134;
            class9.method706();
            if (Statics.field2984.field134) {
                Statics.field1965.method3360();
                class183.field2936 = 1;
                Statics.field1440 = null;
            } else {
                class183.method2987(Statics.field1859, "scape main", "", 255, false);
            }
        }
        if (client.field284 == 5) {
            return;
        }
        field699++;
        if (client.field284 != 10 && client.field284 != 11) {
            return;
        }
        if (client.field280 == 0) {
            if (class140.field2141 == 1 || !Statics.field14 && class140.field2141 == 4) {
                int var1 = field685 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class140.field2144 >= var1 && class140.field2144 <= var1 + var3 && class140.field2135 >= var2 && class140.field2135 <= var2 + var4) {
                    if (class26.method700()) {
                        field690 = true;
                    }
                    return;
                }
            }
            if (Statics.field614 != null && class26.method700()) {
                field690 = true;
            }
        }
        int var5 = class140.field2141;
        int var6 = class140.field2144;
        int var7 = class140.field2135;
        if (!Statics.field14 && var5 == 4) {
            var5 = 1;
        }
        if (field703 == 0) {
            int var8 = field693 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class138.method932(client.method107("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field274 & 0x4) != 0) {
                    if ((client.field274 & 0x400) == 0) {
                        field705 = class157.field2510;
                        field700 = class157.field2454;
                        field706 = class157.field2357;
                    } else {
                        field705 = class157.field2516;
                        field700 = class157.field2503;
                        field706 = class157.field2549;
                    }
                    field703 = 1;
                    field711 = 0;
                } else if ((client.field274 & 0x400) == 0) {
                    field705 = class157.field2506;
                    field700 = class157.field2507;
                    field706 = class157.field2508;
                    field703 = 2;
                    field711 = 0;
                } else {
                    field705 = class157.field2513;
                    field700 = class157.field2342;
                    field706 = class157.field2515;
                    field703 = 1;
                    field711 = 0;
                }
            }
        } else if (field703 == 1) {
            while (class137.method2593()) {
                if (Statics.field1581 == 84) {
                    field705 = class157.field2506;
                    field700 = class157.field2507;
                    field706 = class157.field2508;
                    field703 = 2;
                    field711 = 0;
                } else if (Statics.field1581 == 13) {
                    field703 = 0;
                }
            }
            int var11 = field693 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field705 = class157.field2506;
                field700 = class157.field2507;
                field706 = class157.field2508;
                field703 = 2;
                field711 = 0;
            }
            int var13 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field703 = 0;
            }
        } else if (field703 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field711 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field711 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method2761(class157.field2539, class157.field2534, class157.field2346);
                field703 = 5;
                return;
            }
            int var16 = field693 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field707 = field707.trim();
                if (field707.length() == 0) {
                    method2761(class157.field2331, class157.field2413, class157.field2414);
                    return;
                }
                if (field708.length() == 0) {
                    method2761(class157.field2495, class157.field2416, class157.field2417);
                    return;
                }
                method2761(class157.field2521, class157.field2394, class157.field2523);
                field709 = Statics.field2984.field136.containsKey(class163.method3202(field707)) ? class159.field2583 : class159.field2582;
                client.method3240(20);
                return;
            }
            int var18 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field703 = 0;
                field707 = "";
                field708 = "";
                Statics.field141 = 0;
                Statics.field130 = "";
                field720 = true;
            }
            while (true) {
                while (class137.method2593()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field701.length(); var20++) {
                        if (Statics.field1516 == field701.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field1581 == 13) {
                        field703 = 0;
                        field707 = "";
                        field708 = "";
                        Statics.field141 = 0;
                        Statics.field130 = "";
                        field720 = true;
                    } else if (field711 == 0) {
                        if (Statics.field1581 == 85 && field707.length() > 0) {
                            field707 = field707.substring(0, field707.length() - 1);
                        }
                        if (Statics.field1581 == 84 || Statics.field1581 == 80) {
                            field711 = 1;
                        }
                        if (var19 && field707.length() < 320) {
                            field707 = field707 + Statics.field1516;
                        }
                    } else if (field711 == 1) {
                        if (Statics.field1581 == 85 && field708.length() > 0) {
                            field708 = field708.substring(0, field708.length() - 1);
                        }
                        if (Statics.field1581 == 84 || Statics.field1581 == 80) {
                            field711 = 0;
                        }
                        if (Statics.field1581 == 84) {
                            field707 = field707.trim();
                            if (field707.length() == 0) {
                                method2761(class157.field2331, class157.field2413, class157.field2414);
                                return;
                            }
                            if (field708.length() == 0) {
                                method2761(class157.field2495, class157.field2416, class157.field2417);
                                return;
                            }
                            method2761(class157.field2521, class157.field2394, class157.field2523);
                            field709 = Statics.field2984.field136.containsKey(class163.method3202(field707)) ? class159.field2583 : class159.field2582;
                            client.method3240(20);
                            return;
                        }
                        if (var19 && field708.length() < 20) {
                            field708 = field708 + Statics.field1516;
                        }
                    }
                }
                return;
            }
        } else if (field703 == 4) {
            int var21 = field693 + 180 - 80;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field130.trim();
                if (Statics.field130.length() != 6) {
                    method2761(class157.field2309, class157.field2565, class157.field2463);
                    return;
                }
                Statics.field141 = Integer.parseInt(Statics.field130);
                Statics.field130 = "";
                field709 = field720 ? class159.field2581 : class159.field2580;
                method2761(class157.field2521, class157.field2394, class157.field2523);
                client.method3240(20);
                return;
            }
            if (var5 == 1 && var6 >= field693 + 180 - 9 && var6 <= field693 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field720 = !field720;
            }
            if (var5 == 1 && var6 >= field693 + 180 - 34 && var6 <= field693 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class138.method932(client.method107("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var23 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field703 = 0;
                field707 = "";
                field708 = "";
                Statics.field141 = 0;
                Statics.field130 = "";
            }
            while (class137.method2593()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field713.length(); var25++) {
                    if (Statics.field1516 == field713.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field1581 == 13) {
                    field703 = 0;
                    field707 = "";
                    field708 = "";
                    Statics.field141 = 0;
                    Statics.field130 = "";
                } else {
                    if (Statics.field1581 == 85 && Statics.field130.length() > 0) {
                        Statics.field130 = Statics.field130.substring(0, Statics.field130.length() - 1);
                    }
                    if (Statics.field1581 == 84) {
                        Statics.field130.trim();
                        if (Statics.field130.length() != 6) {
                            method2761(class157.field2309, class157.field2565, class157.field2463);
                            return;
                        }
                        Statics.field141 = Integer.parseInt(Statics.field130);
                        Statics.field130 = "";
                        field709 = field720 ? class159.field2581 : class159.field2580;
                        method2761(class157.field2521, class157.field2394, class157.field2523);
                        client.method3240(20);
                        return;
                    }
                    if (var24 && Statics.field130.length() < 6) {
                        Statics.field130 = Statics.field130 + Statics.field1516;
                    }
                }
            }
        } else if (field703 == 5) {
            int var26 = field693 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method46();
                return;
            }
            int var28 = field693 + 180 + 80;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field705 = class157.field2506;
                field700 = class157.field2507;
                field706 = class157.field2508;
                field703 = 2;
                field711 = 0;
                field708 = "";
            }
            while (class137.method2593()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field701.length(); var30++) {
                    if (Statics.field1516 == field701.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field1581 == 13) {
                    field705 = class157.field2506;
                    field700 = class157.field2507;
                    field706 = class157.field2508;
                    field703 = 2;
                    field711 = 0;
                    field708 = "";
                } else {
                    if (Statics.field1581 == 85 && field707.length() > 0) {
                        field707 = field707.substring(0, field707.length() - 1);
                    }
                    if (Statics.field1581 == 84) {
                        method46();
                        return;
                    }
                    if (var29 && field707.length() < 320) {
                        field707 = field707 + Statics.field1516;
                    }
                }
            }
        } else if (field703 == 6) {
            while (true) {
                do {
                    if (!class137.method2593()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field705 = class157.field2506;
                            field700 = class157.field2507;
                            field706 = class157.field2508;
                            field703 = 2;
                            field711 = 0;
                            field708 = "";
                        }
                        return;
                    }
                } while (Statics.field1581 != 84 && Statics.field1581 != 13);
                field705 = class157.field2506;
                field700 = class157.field2507;
                field706 = class157.field2508;
                field703 = 2;
                field711 = 0;
                field708 = "";
            }
        }
    }

    @ObfuscatedName("j.q(I)V")
    public static void method46() {
        field707 = field707.trim();
        if (field707.length() == 0) {
            method2761(class157.field2539, class157.field2534, class157.field2346);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method107("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1981, var4.field1977, 1000 - var4.field1977);
                if (var5 == -1) {
                    var4.field1977 = 0;
                    long var8 = var4.method2344();
                    var6 = var8;
                    break;
                }
                var4.field1977 += var5;
                if (var4.field1977 >= 1000) {
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
            var13 = class10.method2(var6, field707);
        }
        switch(var13) {
            case 2:
                method2761(class157.field2391, class157.field2320, class157.field2542);
                field703 = 6;
                break;
            case 3:
                method2761(class157.field2543, class157.field2544, class157.field2545);
                break;
            case 4:
                method2761(class157.field2546, class157.field2547, class157.field2359);
                break;
            case 5:
                method2761(class157.field2372, class157.field2550, class157.field2551);
                break;
            case 6:
                method2761(class157.field2552, class157.field2553, class157.field2425);
                break;
            case 7:
                method2761(class157.field2318, class157.field2403, class157.field2557);
        }
    }

    @ObfuscatedName("i.j(Lhr;Lhr;Lhr;ZI)V")
    public static void method80(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field685 = (Statics.field1778 - client.field489) / 2;
            field693 = field685 + 202;
        }
        if (field690) {
            method3472(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3142.method1570(field685, 0);
            Statics.field1340.method1570(field685 + 382, 0);
            Statics.field689.method1715(field685 + 382 - Statics.field689.field1411 / 2, 18);
        }
        if (client.field284 == 0 || client.field284 == 5) {
            byte var4 = 20;
            arg0.method3765(class157.field2505, field693 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1660(field693 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1660(field693 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1658(field693 + 180 - 150, var5 + 2, field694 * 3, 30, 9179409);
            class80.method1658(field694 * 3 + (field693 + 180 - 150), var5 + 2, 300 - field694 * 3, 30, 0);
            arg0.method3765(field702, field693 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field284 == 20) {
            Statics.field686.method1715(field693 + 180 - Statics.field686.field1411 / 2, 271 - Statics.field686.field1412 / 2);
            short var6 = 211;
            arg0.method3765(field705, field693 + 180, var6, 16776960, 0);
            int var47 = var6 + 15;
            arg0.method3765(field700, field693 + 180, var47, 16776960, 0);
            int var48 = var47 + 15;
            arg0.method3765(field706, field693 + 180, var48, 16776960, 0);
            int var49 = var48 + 15;
            int var50 = var49 + 10;
            if (field703 != 4) {
                arg0.method3754(class157.field2484, field693 + 180 - 110, var50, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field707; arg0.method3758(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3754(class223.method3792(var8), field693 + 180 - 70, var50, 16777215, 0);
                var47 = var50 + 15;
                arg0.method3754(class157.field2525 + class163.method2116(field708), field693 + 180 - 108, var47, 16777215, 0);
                var47 += 15;
            }
        }
        if (client.field284 == 10 || client.field284 == 11) {
            Statics.field686.method1715(field693, 171);
            if (field703 == 0) {
                short var9 = 251;
                arg0.method3765(class157.field2319, field693 + 180, var9, 16776960, 0);
                int var51 = var9 + 30;
                int var10 = field693 + 180 - 80;
                short var11 = 291;
                Statics.field687.method1715(var10 - 73, var11 - 20);
                arg0.method3766(class157.field2528, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field693 + 180 + 80;
                Statics.field687.method1715(var12 - 73, var11 - 20);
                arg0.method3766(class157.field2322, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field703 == 1) {
                arg0.method3765(class157.field2509, field693 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3765(field705, field693 + 180, var13, 16777215, 0);
                int var52 = var13 + 15;
                arg0.method3765(field700, field693 + 180, var52, 16777215, 0);
                int var53 = var52 + 15;
                arg0.method3765(field706, field693 + 180, var53, 16777215, 0);
                int var54 = var53 + 15;
                int var14 = field693 + 180 - 80;
                short var15 = 321;
                Statics.field687.method1715(var14 - 73, var15 - 20);
                arg0.method3765(class157.field2418, var14, var15 + 5, 16777215, 0);
                int var16 = field693 + 180 + 80;
                Statics.field687.method1715(var16 - 73, var15 - 20);
                arg0.method3765(class157.field2531, var16, var15 + 5, 16777215, 0);
            } else if (field703 == 2) {
                short var17 = 211;
                arg0.method3765(field705, field693 + 180, var17, 16776960, 0);
                int var55 = var17 + 15;
                arg0.method3765(field700, field693 + 180, var55, 16776960, 0);
                int var56 = var55 + 15;
                arg0.method3765(field706, field693 + 180, var56, 16776960, 0);
                int var57 = var56 + 15;
                int var58 = var57 + 10;
                arg0.method3754(class157.field2484, field693 + 180 - 110, var58, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field707; arg0.method3758(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3754(class223.method3792(var19) + (field711 == 0 & client.field347 % 40 < 20 ? class2.method624(16776960) + class2.field18 : ""), field693 + 180 - 70, var58, 16777215, 0);
                var55 = var58 + 15;
                arg0.method3754(class157.field2525 + class163.method2116(field708) + (field711 == 1 & client.field347 % 40 < 20 ? class2.method624(16776960) + class2.field18 : ""), field693 + 180 - 108, var55, 16777215, 0);
                var55 += 15;
                int var20 = field693 + 180 - 80;
                short var21 = 321;
                Statics.field687.method1715(var20 - 73, var21 - 20);
                arg0.method3765(class157.field2530, var20, var21 + 5, 16777215, 0);
                int var22 = field693 + 180 + 80;
                Statics.field687.method1715(var22 - 73, var21 - 20);
                arg0.method3765(class157.field2531, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3765(class157.field2367, field693 + 180, var23, 16776960, 0);
            } else if (field703 == 4) {
                arg0.method3765(class157.field2519, field693 + 180, 211, 16776960, 0);
                short var24 = 236;
                arg0.method3765(field705, field693 + 180, var24, 16777215, 0);
                int var59 = var24 + 15;
                arg0.method3765(field700, field693 + 180, var59, 16777215, 0);
                int var60 = var59 + 15;
                arg0.method3765(field706, field693 + 180, var60, 16777215, 0);
                int var61 = var60 + 15;
                arg0.method3754(class157.field2526 + class163.method2116(Statics.field130) + (client.field347 % 40 < 20 ? class2.method624(16776960) + class2.field18 : ""), field693 + 180 - 108, var61, 16777215, 0);
                int var62 = var61 - 8;
                arg0.method3754(class157.field2302, field693 + 180 - 9, var62, 16776960, 0);
                int var63 = var62 + 15;
                arg0.method3754(class157.field2303, field693 + 180 - 9, var63, 16776960, 0);
                int var25 = field693 + 180 - 9 + arg0.method3758(class157.field2303) + 15;
                int var26 = var63 - arg0.field3175;
                class81 var27;
                if (field720) {
                    var27 = Statics.field961;
                } else {
                    var27 = Statics.field1071;
                }
                var27.method1715(var25, var26);
                var59 = var63 + 15;
                int var28 = field693 + 180 - 80;
                short var29 = 321;
                Statics.field687.method1715(var28 - 73, var29 - 20);
                arg0.method3765(class157.field2418, var28, var29 + 5, 16777215, 0);
                int var30 = field693 + 180 + 80;
                Statics.field687.method1715(var30 - 73, var29 - 20);
                arg0.method3765(class157.field2531, var30, var29 + 5, 16777215, 0);
                arg1.method3765(class157.field2520, field693 + 180, var29 + 36, 255, 0);
            } else if (field703 == 5) {
                arg0.method3765(class157.field2439, field693 + 180, 201, 16776960, 0);
                short var31 = 221;
                arg2.method3765(field705, field693 + 180, var31, 16776960, 0);
                int var64 = var31 + 15;
                arg2.method3765(field700, field693 + 180, var64, 16776960, 0);
                int var65 = var64 + 15;
                arg2.method3765(field706, field693 + 180, var65, 16776960, 0);
                int var66 = var65 + 15;
                int var67 = var66 + 14;
                arg0.method3754(class157.field2334, field693 + 180 - 145, var67, 16777215, 0);
                short var32 = 174;
                String var33;
                for (var33 = field707; arg0.method3758(var33) > var32; var33 = var33.substring(1)) {
                }
                arg0.method3754(class223.method3792(var33) + (client.field347 % 40 < 20 ? class2.method624(16776960) + class2.field18 : ""), field693 + 180 - 34, var67, 16777215, 0);
                var64 = var67 + 15;
                int var34 = field693 + 180 - 80;
                short var35 = 321;
                Statics.field687.method1715(var34 - 73, var35 - 20);
                arg0.method3765(class157.field2446, var34, var35 + 5, 16777215, 0);
                int var36 = field693 + 180 + 80;
                Statics.field687.method1715(var36 - 73, var35 - 20);
                arg0.method3765(class157.field2333, var36, var35 + 5, 16777215, 0);
            } else if (field703 == 6) {
                short var37 = 211;
                arg0.method3765(field705, field693 + 180, var37, 16776960, 0);
                int var68 = var37 + 15;
                arg0.method3765(field700, field693 + 180, var68, 16776960, 0);
                int var69 = var68 + 15;
                arg0.method3765(field706, field693 + 180, var69, 16776960, 0);
                int var70 = var69 + 15;
                int var38 = field693 + 180;
                short var39 = 321;
                Statics.field687.method1715(var38 - 73, var39 - 20);
                arg0.method3765(class157.field2333, var38, var39 + 5, 16777215, 0);
            }
        }
        if (field699 > 0) {
            method573(field699);
            field699 = 0;
        }
        method2539();
        Statics.field696[Statics.field2984.field134 ? 1 : 0].method1715(field685 + 765 - 40, 463);
        if (client.field284 > 5 && client.field280 == 0) {
            if (Statics.field2193 == null) {
                Statics.field2193 = class77.method1203(Statics.field1647, "sl_button", "");
            } else {
                int var40 = field685 + 5;
                short var41 = 463;
                byte var42 = 100;
                byte var43 = 35;
                Statics.field2193.method1715(var40, var41);
                arg0.method3765(class157.field2460 + " " + client.field273, var42 / 2 + var40, var43 / 2 + var41 - 2, 16777215, 0);
                if (Statics.field614 == null) {
                    arg1.method3765(class157.field2351, var42 / 2 + var40, var43 / 2 + var41 + 12, 16777215, 0);
                } else {
                    arg1.method3765(class157.field2567, var42 / 2 + var40, var43 / 2 + var41 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var44 = Statics.field1961.getGraphics();
            Statics.field650.method1482(var44, 0, 0);
        } catch (Exception var46) {
            Statics.field1961.repaint();
        }
    }

    @ObfuscatedName("ef.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2761(String arg0, String arg1, String arg2) {
        field705 = arg0;
        field700 = arg1;
        field706 = arg2;
    }

    @ObfuscatedName("am.i(Lcu;I)V")
    public static final void method929(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1755.length; var2++) {
            Statics.field1755[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1755[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2008[var8] = (Statics.field1755[var8 - 1] + Statics.field1755[var8 + 1] + Statics.field1755[var8 - 128] + Statics.field1755[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1755;
            Statics.field1755 = Statics.field2008;
            Statics.field2008 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1412; var11++) {
            for (int var12 = 0; var12 < arg0.field1411; var12++) {
                if (arg0.field1416[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1409;
                    int var14 = var11 + 16 + arg0.field1414;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1755[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("l.m(II)V")
    public static final void method573(int arg0) {
        short var1 = 256;
        field697 += arg0 * 128;
        if (field697 > Statics.field1755.length) {
            field697 -= Statics.field1755.length;
            int var2 = (int) (Math.random() * 12.0D);
            method929(Statics.field716[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1020[var3 + var4] - Statics.field1755[field697 + var3 & Statics.field1755.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1020[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1020[var9 + var10] = 255;
                } else {
                    Statics.field1020[var9 + var10] = 0;
                }
            }
        }
        if (field695 > 0) {
            field695 -= arg0 * 4;
        }
        if (field710 > 0) {
            field710 -= arg0 * 4;
        }
        if (field695 == 0 && field710 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field695 = 1024;
            }
            if (var12 == 1) {
                field710 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field692[var13] = field692[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field692[var14] = (int) (Math.sin((double) field704 / 14.0D) * 16.0D + Math.sin((double) field704 / 15.0D) * 14.0D + Math.sin((double) field704 / 16.0D) * 12.0D);
            field704++;
        }
        field698 += arg0 * 286245839;
        int var15 = ((client.field347 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field698 * -1419854244; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1020[(var18 << 7) + var17] = 192;
        }
        field698 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1020[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1020[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field859[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field859[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field859[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1020[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dl.p(IIIB)I")
    public static final int method2290(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dq.h(I)V")
    public static final void method2539() {
        short var0 = 256;
        if (field695 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field695 > 768) {
                    Statics.field959[var1] = method2290(Statics.field269[var1], Statics.field2250[var1], 1024 - field695);
                } else if (field695 > 256) {
                    Statics.field959[var1] = Statics.field2250[var1];
                } else {
                    Statics.field959[var1] = method2290(Statics.field2250[var1], Statics.field269[var1], 256 - field695);
                }
            }
        } else if (field710 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field710 > 768) {
                    Statics.field959[var2] = method2290(Statics.field269[var2], Statics.field1931[var2], 1024 - field710);
                } else if (field710 > 256) {
                    Statics.field959[var2] = Statics.field1931[var2];
                } else {
                    Statics.field959[var2] = method2290(Statics.field1931[var2], Statics.field269[var2], 256 - field710);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field959[var3] = Statics.field269[var3];
            }
        }
        class80.method1653(field685, 9, field685 + 128, var0 + 7);
        Statics.field3142.method1570(field685, 0);
        class80.method1652();
        int var4 = 0;
        int var5 = field685 + Statics.field650.field1384 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field692[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1020[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field959[var10];
                    int var14 = Statics.field650.field1377[var5];
                    Statics.field650.field1377[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field650.field1384 + var8 - 128;
        }
        class80.method1653(field685 + 765 - 128, 9, field685 + 765, var0 + 7);
        Statics.field1340.method1570(field685 + 382, 0);
        class80.method1652();
        int var15 = 0;
        int var16 = field685 + Statics.field650.field1384 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field692[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1020[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field959[var22];
                    int var26 = Statics.field650.field1377[var20];
                    Statics.field650.field1377[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field650.field1384 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("gq.e(Lhr;Lhr;I)V")
    public static void method3472(class224 arg0, class224 arg1) {
        if (Statics.field2577 == null) {
            Statics.field2577 = class77.method719(Statics.field1647, "sl_back", "");
        }
        if (Statics.field688 == null) {
            Statics.field688 = class77.method3290(Statics.field1647, "sl_flags", "");
        }
        if (Statics.field1385 == null) {
            Statics.field1385 = class77.method3290(Statics.field1647, "sl_arrows", "");
        }
        if (Statics.field777 == null) {
            Statics.field777 = class77.method3290(Statics.field1647, "sl_stars", "");
        }
        class80.method1658(field685, 23, 765, 480, 0);
        class80.method1659(field685, 0, 125, 23, 12425273, 9135624);
        class80.method1659(field685 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3765(class157.field2350, field685 + 62, 15, 0, -1);
        if (Statics.field777 != null) {
            Statics.field777[1].method1715(field685 + 140, 1);
            arg1.method3754(class157.field2559, field685 + 152, 10, 16777215, -1);
            Statics.field777[0].method1715(field685 + 140, 12);
            arg1.method3754(class157.field2560, field685 + 152, 21, 16777215, -1);
        }
        if (Statics.field1385 != null) {
            int var2 = field685 + 280;
            if (class26.field606[0] == 0 && class26.field612[0] == 0) {
                Statics.field1385[2].method1715(var2, 4);
            } else {
                Statics.field1385[0].method1715(var2, 4);
            }
            if (class26.field606[0] == 0 && class26.field612[0] == 1) {
                Statics.field1385[3].method1715(var2 + 15, 4);
            } else {
                Statics.field1385[1].method1715(var2 + 15, 4);
            }
            arg0.method3754(class157.field2561, var2 + 32, 17, 16777215, -1);
            int var3 = field685 + 390;
            if (class26.field606[0] == 1 && class26.field612[0] == 0) {
                Statics.field1385[2].method1715(var3, 4);
            } else {
                Statics.field1385[0].method1715(var3, 4);
            }
            if (class26.field606[0] == 1 && class26.field612[0] == 1) {
                Statics.field1385[3].method1715(var3 + 15, 4);
            } else {
                Statics.field1385[1].method1715(var3 + 15, 4);
            }
            arg0.method3754(class157.field2562, var3 + 32, 17, 16777215, -1);
            int var4 = field685 + 500;
            if (class26.field606[0] == 2 && class26.field612[0] == 0) {
                Statics.field1385[2].method1715(var4, 4);
            } else {
                Statics.field1385[0].method1715(var4, 4);
            }
            if (class26.field606[0] == 2 && class26.field612[0] == 1) {
                Statics.field1385[3].method1715(var4 + 15, 4);
            } else {
                Statics.field1385[1].method1715(var4 + 15, 4);
            }
            arg0.method3754(class157.field2563, var4 + 32, 17, 16777215, -1);
            int var5 = field685 + 610;
            if (class26.field606[0] == 3 && class26.field612[0] == 0) {
                Statics.field1385[2].method1715(var5, 4);
            } else {
                Statics.field1385[0].method1715(var5, 4);
            }
            if (class26.field606[0] == 3 && class26.field612[0] == 1) {
                Statics.field1385[3].method1715(var5 + 15, 4);
            } else {
                Statics.field1385[1].method1715(var5 + 15, 4);
            }
            arg0.method3754(class157.field2564, var5 + 32, 17, 16777215, -1);
        }
        class80.method1658(field685 + 708, 4, 50, 16, 0);
        arg1.method3765(class157.field2531, field685 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field274 & var7;
        for (int var9 = 0; var9 < class26.field611; var9++) {
            class26 var10 = Statics.field616[var9];
            if ((var10.field610 & var7) == var8 || (var10.field610 & var7) == 0) {
                var6++;
            }
        }
        field715 = -1;
        if (Statics.field2577 != null) {
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
            int var22 = field685 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class26.field611; var25++) {
                class26 var26 = Statics.field616[var25];
                if ((var26.field610 & var7) == var8 || (var26.field610 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field617);
                    if (var26.field617 == -1) {
                        var28 = class157.field2408;
                        var27 = false;
                    } else if (var26.field617 > 1980) {
                        var28 = class157.field2566;
                        var27 = false;
                    }
                    byte var29;
                    if (var26.method589()) {
                        if (var26.method587()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var26.method587()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class140.field2131 >= var22 && class140.field2142 >= var21 && class140.field2131 < var11 + var22 && class140.field2142 < var12 + var21 && var27) {
                        field715 = var25;
                        Statics.field2577[var29].method1576(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        Statics.field2577[var29].method1570(var22, var21);
                    }
                    if (Statics.field688 != null) {
                        Statics.field688[(var26.method587() ? 8 : 0) + var26.field620].method1715(var22 + 29, var21);
                    }
                    arg0.method3765(Integer.toString(var26.field618), var22 + 15, var12 / 2 + var21 + 5, 0, -1);
                    arg1.method3765(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
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
                int var30 = arg1.method3758(Statics.field616[field715].field619) + 6;
                int var31 = arg1.field3175 + 8;
                class80.method1658(class140.field2131 - var30 / 2, class140.field2142 + 20 + 5, var30, var31, 16777120);
                class80.method1660(class140.field2131 - var30 / 2, class140.field2142 + 20 + 5, var30, var31, 0);
                arg1.method3765(Statics.field616[field715].field619, class140.field2131, class140.field2142 + 20 + 5 + arg1.field3175 + 4, 0, -1);
            }
        }
        try {
            Graphics var32 = Statics.field1961.getGraphics();
            Statics.field650.method1482(var32, 0, 0);
        } catch (Exception var34) {
            Statics.field1961.repaint();
        }
    }

    @ObfuscatedName("m.g(Lek;I)V")
    public static void method90(class144 arg0) {
        if (class140.field2141 != 1 && Statics.field14 || class140.field2141 != 4) {
            return;
        }
        int var1 = field685 + 280;
        if (class140.field2144 >= var1 && class140.field2144 <= var1 + 14 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(0, 0);
            return;
        }
        if (class140.field2144 >= var1 + 15 && class140.field2144 <= var1 + 80 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(0, 1);
            return;
        }
        int var2 = field685 + 390;
        if (class140.field2144 >= var2 && class140.field2144 <= var2 + 14 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(1, 0);
            return;
        }
        if (class140.field2144 >= var2 + 15 && class140.field2144 <= var2 + 80 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(1, 1);
            return;
        }
        int var3 = field685 + 500;
        if (class140.field2144 >= var3 && class140.field2144 <= var3 + 14 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(2, 0);
            return;
        }
        if (class140.field2144 >= var3 + 15 && class140.field2144 <= var3 + 80 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(2, 1);
            return;
        }
        int var4 = field685 + 610;
        if (class140.field2144 >= var4 && class140.field2144 <= var4 + 14 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(3, 0);
            return;
        }
        if (class140.field2144 >= var4 + 15 && class140.field2144 <= var4 + 80 && class140.field2135 >= 4 && class140.field2135 <= 18) {
            class26.method756(3, 1);
            return;
        }
        if (class140.field2144 >= field685 + 708 && class140.field2135 >= 4 && class140.field2144 <= field685 + 708 + 50 && class140.field2135 <= 20) {
            field690 = false;
            Statics.field3142.method1570(field685, 0);
            Statics.field1340.method1570(field685 + 382, 0);
            Statics.field689.method1715(field685 + 382 - Statics.field689.field1411 / 2, 18);
            return;
        }
        if (field715 == -1) {
            return;
        }
        class26 var5 = Statics.field616[field715];
        method820(var5);
        field690 = false;
        Statics.field3142.method1570(field685, 0);
        Statics.field1340.method1570(field685 + 382, 0);
        Statics.field689.method1715(field685 + 382 - Statics.field689.field1411 / 2, 18);
        return;
    }

    @ObfuscatedName("ah.b(Lw;I)V")
    public static void method820(class26 arg0) {
        if (arg0.method587() != client.field278) {
            client.field278 = arg0.method587();
            boolean var1 = arg0.method587();
            if (Statics.field1124 != var1) {
                class52.field1099.method3480();
                class52.field1123.method3480();
                class52.field1133.method3480();
                Statics.field1124 = var1;
            }
        }
        Statics.field679 = arg0.field613;
        client.field273 = arg0.field618;
        client.field274 = arg0.field610;
        Statics.field68 = client.field275 == 0 ? 43594 : arg0.field618 + 40000;
        Statics.field1362 = client.field275 == 0 ? 443 : arg0.field618 + 50000;
        Statics.field2254 = Statics.field68;
    }
}
