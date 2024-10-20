package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("aj")
public class class32 {

    @ObfuscatedName("aj.h")
    public static int field697 = 0;

    @ObfuscatedName("aj.q")
    public static int field703 = field697 + 202;

    @ObfuscatedName("aj.t")
    public static int[] field704 = new int[256];

    @ObfuscatedName("aj.k")
    public static int field705 = 0;

    @ObfuscatedName("aj.o")
    public static int field714 = 0;

    @ObfuscatedName("aj.ab")
    public static int field716 = 0;

    @ObfuscatedName("aj.am")
    public static int field708 = 0;

    @ObfuscatedName("aj.an")
    public static int field709 = 0;

    @ObfuscatedName("aj.aj")
    public static int field710 = 0;

    @ObfuscatedName("aj.ay")
    public static int field731 = 10;

    @ObfuscatedName("aj.ao")
    public static String field712 = "";

    @ObfuscatedName("aj.ag")
    public static int field713 = 0;

    @ObfuscatedName("aj.as")
    public static String field720 = "";

    @ObfuscatedName("aj.az")
    public static String field715 = "";

    @ObfuscatedName("aj.av")
    public static String field730 = "";

    @ObfuscatedName("aj.ax")
    public static String field717 = "";

    @ObfuscatedName("aj.aa")
    public static String field699 = "";

    @ObfuscatedName("aj.ah")
    public static String field711 = "";

    @ObfuscatedName("aj.ai")
    public static class160 field728 = class160.field2592;

    @ObfuscatedName("aj.ar")
    public static boolean field722 = true;

    @ObfuscatedName("aj.aw")
    public static int field723 = 0;

    @ObfuscatedName("aj.ac")
    public static String field724 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aj.ap")
    public static String field696 = "1234567890";

    @ObfuscatedName("aj.al")
    public static boolean field727 = false;

    @ObfuscatedName("aj.bx")
    public static int field718 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.j(I)I")
    public static int method2062() {
        return 9;
    }

    @ObfuscatedName("aw.h(Ljava/awt/Component;Lfy;Lfy;ZII)V")
    public static void method935(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field700) {
            field713 = arg4;
            class80.method1680();
            byte[] var5 = arg1.method3028("title.jpg", "");
            Statics.field3011 = new class79(var5, arg0);
            Statics.field701 = Statics.field3011.method1646();
            if ((client.field493 & 0x20000000) == 0) {
                Statics.field702 = class77.method2146(arg2, "logo", "");
            } else {
                Statics.field702 = class77.method2146(arg2, "logo_deadman_mode", "");
            }
            Statics.field732 = class77.method2146(arg2, "titlebox", "");
            Statics.field706 = class77.method2146(arg2, "titlebutton", "");
            Statics.field698 = class77.method712(arg2, "runes", "");
            Statics.field2112 = class77.method712(arg2, "title_mute", "");
            Statics.field1380 = class77.method2146(arg2, "options_radio_buttons,0", "");
            Statics.field22 = class77.method2146(arg2, "options_radio_buttons,2", "");
            Statics.field648 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field648[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field648[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field648[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field648[var9 + 192] = 16777215;
            }
            Statics.field3158 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3158[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3158[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3158[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field3158[var13 + 192] = 16777215;
            }
            Statics.field1413 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1413[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1413[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1413[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1413[var17 + 192] = 16777215;
            }
            Statics.field770 = new int[256];
            Statics.field1166 = new int[32768];
            Statics.field153 = new int[32768];
            method110((class81) null);
            Statics.field87 = new int[32768];
            Statics.field2908 = new int[32768];
            if (arg3) {
                field699 = "";
                field711 = "";
            }
            Statics.field721 = 0;
            Statics.field1740 = "";
            field722 = true;
            field727 = false;
            if (Statics.field76.field144) {
                class184.field2960 = 1;
                Statics.field1371 = null;
                Statics.field2961 = -1;
                Statics.field2962 = -1;
                Statics.field2958 = 0;
                Statics.field2965 = false;
                Statics.field2964 = 2;
            } else {
                class184.method1585(2, Statics.field2070, "scape main", "", 255, false);
            }
            class172.method70(false);
            Statics.field700 = true;
            field697 = (Statics.field103 - client.field489) / 2;
            field703 = field697 + 202;
            Statics.field3011.method1597(field697, 0);
            Statics.field701.method1597(field697 + 382, 0);
            Statics.field702.method1766(field697 + 382 - Statics.field702.field1404 / 2, 18);
        } else if (arg4 == 4) {
            field713 = 4;
        }
    }

    @ObfuscatedName("j.m(Led;I)V")
    public static void method2(class145 arg0) {
        if (field727) {
            method1538(arg0);
            return;
        }
        if ((class141.field2135 == 1 || !Statics.field2117 && class141.field2135 == 4) && class141.field2136 >= field697 + 765 - 50 && class141.field2137 >= 453) {
            Statics.field76.field144 = !Statics.field76.field144;
            class9.method933();
            if (Statics.field76.field144) {
                class184.method3118();
            } else {
                class169 var1 = Statics.field2070;
                int var2 = var1.method3026("scape main");
                int var3 = var1.method3027(var2, "");
                class184.method2638(var1, var2, var3, 255, false);
            }
        }
        if (client.field284 == 5) {
            return;
        }
        field709++;
        if (client.field284 != 10 && client.field284 != 11) {
            return;
        }
        if (client.field293 == 0) {
            if (class141.field2135 == 1 || !Statics.field2117 && class141.field2135 == 4) {
                int var4 = field697 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class141.field2136 >= var4 && class141.field2136 <= var4 + var6 && class141.field2137 >= var5 && class141.field2137 <= var5 + var7) {
                    if (class26.method1578()) {
                        field727 = true;
                    }
                    return;
                }
            }
            if (Statics.field246 != null && class26.method1578()) {
                field727 = true;
            }
        }
        int var8 = class141.field2135;
        int var9 = class141.field2136;
        int var10 = class141.field2137;
        if (!Statics.field2117 && var8 == 4) {
            var8 = 1;
        }
        if (field713 == 0) {
            int var11 = field703 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class139.method957(client.method1212("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = field703 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field493 & 0x2000000) != 0) {
                    field720 = "";
                    field715 = class158.field2556;
                    field730 = class158.field2522;
                    field717 = class158.field2523;
                    field713 = 1;
                    field723 = 0;
                } else if ((client.field493 & 0x4) != 0) {
                    if ((client.field493 & 0x400) == 0) {
                        field715 = class158.field2458;
                        field730 = class158.field2513;
                        field717 = class158.field2514;
                    } else {
                        field715 = class158.field2518;
                        field730 = class158.field2519;
                        field717 = class158.field2520;
                    }
                    field720 = class158.field2493;
                    field713 = 1;
                    field723 = 0;
                } else if ((client.field493 & 0x400) == 0) {
                    field715 = class158.field2434;
                    field730 = class158.field2509;
                    field717 = class158.field2429;
                    field713 = 2;
                    field723 = 0;
                } else {
                    field715 = class158.field2515;
                    field730 = class158.field2547;
                    field717 = class158.field2517;
                    field720 = class158.field2493;
                    field713 = 1;
                    field723 = 0;
                }
            }
        } else if (field713 == 1) {
            while (class138.method30()) {
                if (Statics.field3057 == 84) {
                    field715 = class158.field2434;
                    field730 = class158.field2509;
                    field717 = class158.field2429;
                    field713 = 2;
                    field723 = 0;
                } else if (Statics.field3057 == 13) {
                    field713 = 0;
                }
            }
            int var14 = field703 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field715 = class158.field2434;
                field730 = class158.field2509;
                field717 = class158.field2429;
                field713 = 2;
                field723 = 0;
            }
            int var16 = field703 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field713 = 0;
            }
        } else if (field713 == 2) {
            short var17 = 231;
            int var39 = var17 + 30;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field723 = 0;
            }
            var39 += 15;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                field723 = 1;
            }
            var39 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                method2297(class158.field2318, class158.field2548, class158.field2549);
                field713 = 5;
                return;
            }
            int var19 = field703 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field699 = field699.trim();
                if (field699.length() == 0) {
                    method2297(class158.field2414, class158.field2415, class158.field2476);
                    return;
                }
                if (field711.length() == 0) {
                    method2297(class158.field2417, class158.field2418, class158.field2419);
                    return;
                }
                method2297(class158.field2511, class158.field2527, class158.field2409);
                field728 = Statics.field76.field143.containsKey(class164.method1968(field699)) ? class160.field2596 : class160.field2592;
                client.method159(20);
                return;
            }
            int var21 = field703 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field713 = 0;
                field699 = "";
                field711 = "";
                Statics.field721 = 0;
                Statics.field1740 = "";
                field722 = true;
            }
            while (true) {
                while (class138.method30()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field724.length(); var23++) {
                        if (Statics.field2082 == field724.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field3057 == 13) {
                        field713 = 0;
                        field699 = "";
                        field711 = "";
                        Statics.field721 = 0;
                        Statics.field1740 = "";
                        field722 = true;
                    } else if (field723 == 0) {
                        if (Statics.field3057 == 85 && field699.length() > 0) {
                            field699 = field699.substring(0, field699.length() - 1);
                        }
                        if (Statics.field3057 == 84 || Statics.field3057 == 80) {
                            field723 = 1;
                        }
                        if (var22 && field699.length() < 320) {
                            field699 = field699 + Statics.field2082;
                        }
                    } else if (field723 == 1) {
                        if (Statics.field3057 == 85 && field711.length() > 0) {
                            field711 = field711.substring(0, field711.length() - 1);
                        }
                        if (Statics.field3057 == 84 || Statics.field3057 == 80) {
                            field723 = 0;
                        }
                        if (Statics.field3057 == 84) {
                            field699 = field699.trim();
                            if (field699.length() == 0) {
                                method2297(class158.field2414, class158.field2415, class158.field2476);
                                return;
                            }
                            if (field711.length() == 0) {
                                method2297(class158.field2417, class158.field2418, class158.field2419);
                                return;
                            }
                            method2297(class158.field2511, class158.field2527, class158.field2409);
                            field728 = Statics.field76.field143.containsKey(class164.method1968(field699)) ? class160.field2596 : class160.field2592;
                            client.method159(20);
                            return;
                        }
                        if (var22 && field711.length() < 20) {
                            field711 = field711 + Statics.field2082;
                        }
                    }
                }
                return;
            }
        } else if (field713 == 3) {
            int var24 = field703 + 180;
            short var25 = 276;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field715 = class158.field2434;
                field730 = class158.field2509;
                field717 = class158.field2429;
                field713 = 2;
                field723 = 0;
            }
            int var26 = field703 + 180;
            short var27 = 326;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                method2297(class158.field2318, class158.field2548, class158.field2549);
                field713 = 5;
                return;
            }
        } else if (field713 == 4) {
            int var28 = field703 + 180 - 80;
            short var29 = 321;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                Statics.field1740.trim();
                if (Statics.field1740.length() != 6) {
                    method2297(class158.field2299, class158.field2334, class158.field2338);
                    return;
                }
                Statics.field721 = Integer.parseInt(Statics.field1740);
                Statics.field1740 = "";
                field728 = field722 ? class160.field2591 : class160.field2593;
                method2297(class158.field2511, class158.field2527, class158.field2409);
                client.method159(20);
                return;
            }
            if (var8 == 1 && var9 >= field703 + 180 - 9 && var9 <= field703 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field722 = !field722;
            }
            if (var8 == 1 && var9 >= field703 + 180 - 34 && var9 <= field703 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class139.method957(client.method1212("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var30 = field703 + 180 + 80;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                field713 = 0;
                field699 = "";
                field711 = "";
                Statics.field721 = 0;
                Statics.field1740 = "";
            }
            while (class138.method30()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < field696.length(); var32++) {
                    if (Statics.field2082 == field696.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field3057 == 13) {
                    field713 = 0;
                    field699 = "";
                    field711 = "";
                    Statics.field721 = 0;
                    Statics.field1740 = "";
                } else {
                    if (Statics.field3057 == 85 && Statics.field1740.length() > 0) {
                        Statics.field1740 = Statics.field1740.substring(0, Statics.field1740.length() - 1);
                    }
                    if (Statics.field3057 == 84) {
                        Statics.field1740.trim();
                        if (Statics.field1740.length() != 6) {
                            method2297(class158.field2299, class158.field2334, class158.field2338);
                            return;
                        }
                        Statics.field721 = Integer.parseInt(Statics.field1740);
                        Statics.field1740 = "";
                        field728 = field722 ? class160.field2591 : class160.field2593;
                        method2297(class158.field2511, class158.field2527, class158.field2409);
                        client.method159(20);
                        return;
                    }
                    if (var31 && Statics.field1740.length() < 6) {
                        Statics.field1740 = Statics.field1740 + Statics.field2082;
                    }
                }
            }
        } else if (field713 == 5) {
            int var33 = field703 + 180 - 80;
            short var34 = 321;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                method3143();
                return;
            }
            int var35 = field703 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                field715 = class158.field2434;
                field730 = class158.field2509;
                field717 = class158.field2429;
                field713 = 2;
                field723 = 0;
                field711 = "";
            }
            while (class138.method30()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field724.length(); var37++) {
                    if (Statics.field2082 == field724.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field3057 == 13) {
                    field715 = class158.field2434;
                    field730 = class158.field2509;
                    field717 = class158.field2429;
                    field713 = 2;
                    field723 = 0;
                    field711 = "";
                } else {
                    if (Statics.field3057 == 85 && field699.length() > 0) {
                        field699 = field699.substring(0, field699.length() - 1);
                    }
                    if (Statics.field3057 == 84) {
                        method3143();
                        return;
                    }
                    if (var36 && field699.length() < 320) {
                        field699 = field699 + Statics.field2082;
                    }
                }
            }
        } else if (field713 == 6) {
            while (true) {
                do {
                    if (!class138.method30()) {
                        short var38 = 321;
                        if (var8 == 1 && var10 >= var38 - 20 && var10 <= var38 + 20) {
                            field715 = class158.field2434;
                            field730 = class158.field2509;
                            field717 = class158.field2429;
                            field713 = 2;
                            field723 = 0;
                            field711 = "";
                        }
                        return;
                    }
                } while (Statics.field3057 != 84 && Statics.field3057 != 13);
                field715 = class158.field2434;
                field730 = class158.field2509;
                field717 = class158.field2429;
                field713 = 2;
                field723 = 0;
                field711 = "";
            }
        }
    }

    @ObfuscatedName("fg.z(B)V")
    public static void method3143() {
        field699 = field699.trim();
        if (field699.length() == 0) {
            method2297(class158.field2318, class158.field2548, class158.field2549);
            return;
        }
        long var0 = class10.method556();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method1537(var0, field699);
        }
        switch(var2) {
            case 2:
                method2297(class158.field2397, class158.field2551, class158.field2568);
                field713 = 6;
                break;
            case 3:
                method2297(class158.field2342, class158.field2554, class158.field2538);
                break;
            case 4:
                method2297(class158.field2360, class158.field2557, class158.field2558);
                break;
            case 5:
                method2297(class158.field2528, class158.field2560, class158.field2561);
                break;
            case 6:
                method2297(class158.field2562, class158.field2563, class158.field2564);
                break;
            case 7:
                method2297(class158.field2565, class158.field2566, class158.field2567);
        }
    }

    @ObfuscatedName("dr.x(Lhf;Lhf;Lhf;ZI)V")
    public static void method2623(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field697 = (Statics.field103 - client.field489) / 2;
            field703 = field697 + 202;
        }
        if (field727) {
            method152(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3011.method1597(field697, 0);
            Statics.field701.method1597(field697 + 382, 0);
            Statics.field702.method1766(field697 + 382 - Statics.field702.field1404 / 2, 18);
        }
        if (client.field284 == 0 || client.field284 == 5) {
            byte var4 = 20;
            arg0.method3763(class158.field2507, field703 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1700(field703 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1700(field703 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1682(field703 + 180 - 150, var5 + 2, field731 * 3, 30, 9179409);
            class80.method1682(field731 * 3 + (field703 + 180 - 150), var5 + 2, 300 - field731 * 3, 30, 0);
            arg0.method3763(field712, field703 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field284 == 20) {
            Statics.field732.method1766(field703 + 180 - Statics.field732.field1404 / 2, 271 - Statics.field732.field1402 / 2);
            short var6 = 211;
            arg0.method3763(field715, field703 + 180, var6, 16776960, 0);
            int var79 = var6 + 15;
            arg0.method3763(field730, field703 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            arg0.method3763(field717, field703 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            int var82 = var81 + 10;
            if (field713 != 4) {
                arg0.method3762(class158.field2362, field703 + 180 - 110, var82, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field699; arg0.method3758(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3762(class224.method3761(var8), field703 + 180 - 70, var82, 16777215, 0);
                var79 = var82 + 15;
                arg0.method3762(class158.field2530 + class164.method897(field711), field703 + 180 - 108, var79, 16777215, 0);
                var79 += 15;
            }
        }
        if (client.field284 == 10 || client.field284 == 11) {
            Statics.field732.method1766(field703, 171);
            if (field713 == 0) {
                short var9 = 251;
                arg0.method3763(class158.field2532, field703 + 180, var9, 16776960, 0);
                int var83 = var9 + 30;
                int var10 = field703 + 180 - 80;
                short var11 = 291;
                Statics.field706.method1766(var10 - 73, var11 - 20);
                arg0.method3764(class158.field2447, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field703 + 180 + 80;
                Statics.field706.method1766(var12 - 73, var11 - 20);
                arg0.method3764(class158.field2308, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field713 == 1) {
                arg0.method3763(field720, field703 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3763(field715, field703 + 180, var13, 16777215, 0);
                int var84 = var13 + 15;
                arg0.method3763(field730, field703 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                arg0.method3763(field717, field703 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                int var14 = field703 + 180 - 80;
                short var15 = 321;
                Statics.field706.method1766(var14 - 73, var15 - 20);
                arg0.method3763(class158.field2305, var14, var15 + 5, 16777215, 0);
                int var16 = field703 + 180 + 80;
                Statics.field706.method1766(var16 - 73, var15 - 20);
                arg0.method3763(class158.field2456, var16, var15 + 5, 16777215, 0);
            } else if (field713 == 2) {
                short var17 = 211;
                arg0.method3763(field715, field703 + 180, var17, 16776960, 0);
                int var87 = var17 + 15;
                arg0.method3763(field730, field703 + 180, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3763(field717, field703 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3762(class158.field2362, field703 + 180 - 110, var90, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field699; arg0.method3758(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3762(class224.method3761(var19) + (field723 == 0 & client.field286 % 40 < 20 ? class2.method3724(16776960) + class2.field33 : ""), field703 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3762(class158.field2530 + class164.method897(field711) + (field723 == 1 & client.field286 % 40 < 20 ? class2.method3724(16776960) + class2.field33 : ""), field703 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
                int var20 = field703 + 180 - 80;
                short var21 = 321;
                Statics.field706.method1766(var20 - 73, var21 - 20);
                arg0.method3763(class158.field2460, var20, var21 + 5, 16777215, 0);
                int var22 = field703 + 180 + 80;
                Statics.field706.method1766(var22 - 73, var21 - 20);
                arg0.method3763(class158.field2456, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3763(class158.field2542, field703 + 180, var23, 16776960, 0);
            } else if (field713 == 3) {
                short var24 = 201;
                arg0.method3763(class158.field2537, field703 + 180, var24, 16776960, 0);
                int var91 = var24 + 20;
                arg1.method3763(class158.field2464, field703 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method3763(class158.field2489, field703 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var25 = field703 + 180;
                short var26 = 276;
                Statics.field706.method1766(var25 - 73, var26 - 20);
                arg2.method3763(class158.field2368, var25, var26 + 5, 16777215, 0);
                int var27 = field703 + 180;
                short var28 = 326;
                Statics.field706.method1766(var27 - 73, var28 - 20);
                arg2.method3763(class158.field2541, var27, var28 + 5, 16777215, 0);
            } else if (field713 == 4) {
                arg0.method3763(class158.field2559, field703 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3763(field715, field703 + 180, var29, 16777215, 0);
                int var94 = var29 + 15;
                arg0.method3763(field730, field703 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3763(field717, field703 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3762(class158.field2531 + class164.method897(Statics.field1740) + (client.field286 % 40 < 20 ? class2.method3724(16776960) + class2.field33 : ""), field703 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method3762(class158.field2307, field703 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3762(class158.field2300, field703 + 180 - 9, var98, 16776960, 0);
                int var30 = field703 + 180 - 9 + arg0.method3758(class158.field2300) + 15;
                int var31 = var98 - arg0.field3193;
                class81 var32;
                if (field722) {
                    var32 = Statics.field22;
                } else {
                    var32 = Statics.field1380;
                }
                var32.method1766(var30, var31);
                var94 = var98 + 15;
                int var33 = field703 + 180 - 80;
                short var34 = 321;
                Statics.field706.method1766(var33 - 73, var34 - 20);
                arg0.method3763(class158.field2305, var33, var34 + 5, 16777215, 0);
                int var35 = field703 + 180 + 80;
                Statics.field706.method1766(var35 - 73, var34 - 20);
                arg0.method3763(class158.field2456, var35, var34 + 5, 16777215, 0);
                arg1.method3763(class158.field2525, field703 + 180, var34 + 36, 255, 0);
            } else if (field713 == 5) {
                arg0.method3763(class158.field2543, field703 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3763(field715, field703 + 180, var36, 16776960, 0);
                int var99 = var36 + 15;
                arg2.method3763(field730, field703 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method3763(field717, field703 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method3762(class158.field2544, field703 + 180 - 145, var102, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field699; arg0.method3758(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3762(class224.method3761(var38) + (client.field286 % 40 < 20 ? class2.method3724(16776960) + class2.field33 : ""), field703 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var39 = field703 + 180 - 80;
                short var40 = 321;
                Statics.field706.method1766(var39 - 73, var40 - 20);
                arg0.method3763(class158.field2545, var39, var40 + 5, 16777215, 0);
                int var41 = field703 + 180 + 80;
                Statics.field706.method1766(var41 - 73, var40 - 20);
                arg0.method3763(class158.field2546, var41, var40 + 5, 16777215, 0);
            } else if (field713 == 6) {
                short var42 = 211;
                arg0.method3763(field715, field703 + 180, var42, 16776960, 0);
                int var103 = var42 + 15;
                arg0.method3763(field730, field703 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method3763(field717, field703 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var43 = field703 + 180;
                short var44 = 321;
                Statics.field706.method1766(var43 - 73, var44 - 20);
                arg0.method3763(class158.field2546, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field709 > 0) {
            int var45 = field709;
            short var46 = 256;
            field716 += var45 * 128;
            if (field716 > Statics.field1166.length) {
                field716 -= Statics.field1166.length;
                int var47 = (int) (Math.random() * 12.0D);
                method110(Statics.field698[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field87[var48 + var49] - Statics.field1166[field716 + var48 & Statics.field1166.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field87[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field87[var54 + var55] = 255;
                    } else {
                        Statics.field87[var54 + var55] = 0;
                    }
                }
            }
            if (field705 > 0) {
                field705 -= var45 * 4;
            }
            if (field714 > 0) {
                field714 -= var45 * 4;
            }
            if (field705 == 0 && field714 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field705 = 1024;
                }
                if (var57 == 1) {
                    field714 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field704[var58] = field704[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field704[var59] = (int) (Math.sin((double) field710 / 14.0D) * 16.0D + Math.sin((double) field710 / 15.0D) * 14.0D + Math.sin((double) field710 / 16.0D) * 12.0D);
                field710++;
            }
            field708 += var45 * 1025374963;
            int var60 = ((client.field286 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field708 * 1284247308; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field87[(var63 << 7) + var62] = 192;
                }
                field708 = 0;
                int var64 = 0;
                label226: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label226;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field2908[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field2908[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field87[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field87[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field87[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field2908[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field709 = 0;
        }
        method157();
        Statics.field2112[Statics.field76.field144 ? 1 : 0].method1766(field697 + 765 - 40, 463);
        if (client.field284 > 5 && client.field293 == 0) {
            if (Statics.field163 == null) {
                Statics.field163 = class77.method2146(Statics.field2918, "sl_button", "");
            } else {
                int var72 = field697 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field163.method1766(var72, var73);
                arg0.method3763(class158.field2462 + " " + client.field275, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field246 == null) {
                    arg1.method3763(class158.field2578, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3763(class158.field2471, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field67.getGraphics();
            Statics.field1364.method1515(var76, 0, 0);
        } catch (Exception var78) {
            Statics.field67.repaint();
        }
    }

    @ObfuscatedName("du.e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2297(String arg0, String arg1, String arg2) {
        field715 = arg0;
        field730 = arg1;
        field717 = arg2;
    }

    @ObfuscatedName("n.i(Lcr;I)V")
    public static final void method110(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1166.length; var2++) {
            Statics.field1166[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1166[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field153[var8] = (Statics.field1166[var8 - 1] + Statics.field1166[var8 + 1] + Statics.field1166[var8 - 128] + Statics.field1166[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1166;
            Statics.field1166 = Statics.field153;
            Statics.field153 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1402; var11++) {
            for (int var12 = 0; var12 < arg0.field1404; var12++) {
                if (arg0.field1403[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1407;
                    int var14 = var11 + 16 + arg0.field1405;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1166[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("u.c(IIII)I")
    public static final int method135(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("a.n(B)V")
    public static final void method157() {
        short var0 = 256;
        if (field705 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field705 > 768) {
                    Statics.field770[var1] = method135(Statics.field648[var1], Statics.field3158[var1], 1024 - field705);
                } else if (field705 > 256) {
                    Statics.field770[var1] = Statics.field3158[var1];
                } else {
                    Statics.field770[var1] = method135(Statics.field3158[var1], Statics.field648[var1], 256 - field705);
                }
            }
        } else if (field714 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field714 > 768) {
                    Statics.field770[var2] = method135(Statics.field648[var2], Statics.field1413[var2], 1024 - field714);
                } else if (field714 > 256) {
                    Statics.field770[var2] = Statics.field1413[var2];
                } else {
                    Statics.field770[var2] = method135(Statics.field1413[var2], Statics.field648[var2], 256 - field714);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field770[var3] = Statics.field648[var3];
            }
        }
        class80.method1676(field697, 9, field697 + 128, var0 + 7);
        Statics.field3011.method1597(field697, 0);
        class80.method1675();
        int var4 = 0;
        int var5 = field697 + Statics.field1364.field1374 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field704[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field87[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field770[var10];
                    int var14 = Statics.field1364.field1377[var5];
                    Statics.field1364.field1377[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field1364.field1374 + var8 - 128;
        }
        class80.method1676(field697 + 765 - 128, 9, field697 + 765, var0 + 7);
        Statics.field701.method1597(field697 + 382, 0);
        class80.method1675();
        int var15 = 0;
        int var16 = field697 + Statics.field1364.field1374 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field704[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field87[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field770[var22];
                    int var26 = Statics.field1364.field1377[var20];
                    Statics.field1364.field1377[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1364.field1374 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("r.l(Lhf;Lhf;I)V")
    public static void method152(class225 arg0, class225 arg1) {
        if (Statics.field719 == null) {
            Statics.field719 = class77.method2058(Statics.field2918, "sl_back", "");
        }
        if (Statics.field69 == null) {
            Statics.field69 = class77.method712(Statics.field2918, "sl_flags", "");
        }
        if (Statics.field1360 == null) {
            Statics.field1360 = class77.method712(Statics.field2918, "sl_arrows", "");
        }
        if (Statics.field643 == null) {
            Statics.field643 = class77.method712(Statics.field2918, "sl_stars", "");
        }
        class80.method1682(field697, 23, 765, 480, 0);
        class80.method1687(field697, 0, 125, 23, 12425273, 9135624);
        class80.method1687(field697 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3763(class158.field2306, field697 + 62, 15, 0, -1);
        if (Statics.field643 != null) {
            Statics.field643[1].method1766(field697 + 140, 1);
            arg1.method3762(class158.field2526, field697 + 152, 10, 16777215, -1);
            Statics.field643[0].method1766(field697 + 140, 12);
            arg1.method3762(class158.field2570, field697 + 152, 21, 16777215, -1);
        }
        if (Statics.field1360 != null) {
            int var2 = field697 + 280;
            if (class26.field618[0] == 0 && class26.field623[0] == 0) {
                Statics.field1360[2].method1766(var2, 4);
            } else {
                Statics.field1360[0].method1766(var2, 4);
            }
            if (class26.field618[0] == 0 && class26.field623[0] == 1) {
                Statics.field1360[3].method1766(var2 + 15, 4);
            } else {
                Statics.field1360[1].method1766(var2 + 15, 4);
            }
            arg0.method3762(class158.field2571, var2 + 32, 17, 16777215, -1);
            int var3 = field697 + 390;
            if (class26.field618[0] == 1 && class26.field623[0] == 0) {
                Statics.field1360[2].method1766(var3, 4);
            } else {
                Statics.field1360[0].method1766(var3, 4);
            }
            if (class26.field618[0] == 1 && class26.field623[0] == 1) {
                Statics.field1360[3].method1766(var3 + 15, 4);
            } else {
                Statics.field1360[1].method1766(var3 + 15, 4);
            }
            arg0.method3762(class158.field2572, var3 + 32, 17, 16777215, -1);
            int var4 = field697 + 500;
            if (class26.field618[0] == 2 && class26.field623[0] == 0) {
                Statics.field1360[2].method1766(var4, 4);
            } else {
                Statics.field1360[0].method1766(var4, 4);
            }
            if (class26.field618[0] == 2 && class26.field623[0] == 1) {
                Statics.field1360[3].method1766(var4 + 15, 4);
            } else {
                Statics.field1360[1].method1766(var4 + 15, 4);
            }
            arg0.method3762(class158.field2401, var4 + 32, 17, 16777215, -1);
            int var5 = field697 + 610;
            if (class26.field618[0] == 3 && class26.field623[0] == 0) {
                Statics.field1360[2].method1766(var5, 4);
            } else {
                Statics.field1360[0].method1766(var5, 4);
            }
            if (class26.field618[0] == 3 && class26.field623[0] == 1) {
                Statics.field1360[3].method1766(var5 + 15, 4);
            } else {
                Statics.field1360[1].method1766(var5 + 15, 4);
            }
            arg0.method3762(class158.field2574, var5 + 32, 17, 16777215, -1);
        }
        class80.method1682(field697 + 708, 4, 50, 16, 0);
        arg1.method3763(class158.field2456, field697 + 708 + 25, 16, 16777215, -1);
        field718 = -1;
        if (Statics.field719 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field615) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field615) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field615) {
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
            int var17 = field697 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field615; var20++) {
                class26 var21 = Statics.field617[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field626);
                if (var21.field626 == -1) {
                    var23 = class158.field2575;
                    var22 = false;
                } else if (var21.field626 > 1980) {
                    var23 = class158.field2411;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method601()) {
                    if (var21.method596()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method617()) {
                    var24 = 16711680;
                    if (var21.method596()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method602()) {
                    if (var21.method596()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method596()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class141.field2129 >= var17 && class141.field2127 >= var16 && class141.field2129 < var6 + var17 && class141.field2127 < var7 + var16 && var22) {
                    field718 = var20;
                    Statics.field719[var25].method1603(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field719[var25].method1597(var17, var16);
                }
                if (Statics.field69 != null) {
                    Statics.field69[(var21.method596() ? 8 : 0) + var21.field624].method1766(var17 + 29, var16);
                }
                arg0.method3763(Integer.toString(var21.field619), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3763(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3758(Statics.field617[field718].field621) + 6;
                int var27 = arg1.field3193 + 8;
                class80.method1682(class141.field2129 - var26 / 2, class141.field2127 + 20 + 5, var26, var27, 16777120);
                class80.method1700(class141.field2129 - var26 / 2, class141.field2127 + 20 + 5, var26, var27, 0);
                arg1.method3763(Statics.field617[field718].field621, class141.field2129, class141.field2127 + 20 + 5 + arg1.field3193 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field67.getGraphics();
            Statics.field1364.method1515(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field67.repaint();
        }
    }

    @ObfuscatedName("bk.u(Led;I)V")
    public static void method1538(class145 arg0) {
        if (class141.field2135 != 1 && Statics.field2117 || class141.field2135 != 4) {
            return;
        }
        int var1 = field697 + 280;
        if (class141.field2136 >= var1 && class141.field2136 <= var1 + 14 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(0, 0);
            return;
        }
        if (class141.field2136 >= var1 + 15 && class141.field2136 <= var1 + 80 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(0, 1);
            return;
        }
        int var2 = field697 + 390;
        if (class141.field2136 >= var2 && class141.field2136 <= var2 + 14 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(1, 0);
            return;
        }
        if (class141.field2136 >= var2 + 15 && class141.field2136 <= var2 + 80 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(1, 1);
            return;
        }
        int var3 = field697 + 500;
        if (class141.field2136 >= var3 && class141.field2136 <= var3 + 14 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(2, 0);
            return;
        }
        if (class141.field2136 >= var3 + 15 && class141.field2136 <= var3 + 80 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(2, 1);
            return;
        }
        int var4 = field697 + 610;
        if (class141.field2136 >= var4 && class141.field2136 <= var4 + 14 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(3, 0);
            return;
        }
        if (class141.field2136 >= var4 + 15 && class141.field2136 <= var4 + 80 && class141.field2137 >= 4 && class141.field2137 <= 18) {
            class26.method2303(3, 1);
            return;
        }
        if (class141.field2136 >= field697 + 708 && class141.field2137 >= 4 && class141.field2136 <= field697 + 708 + 50 && class141.field2137 <= 20) {
            field727 = false;
            Statics.field3011.method1597(field697, 0);
            Statics.field701.method1597(field697 + 382, 0);
            Statics.field702.method1766(field697 + 382 - Statics.field702.field1404 / 2, 18);
            return;
        }
        if (field718 == -1) {
            return;
        }
        class26 var5 = Statics.field617[field718];
        method569(var5);
        field727 = false;
        Statics.field3011.method1597(field697, 0);
        Statics.field701.method1597(field697 + 382, 0);
        Statics.field702.method1766(field697 + 382 - Statics.field702.field1404 / 2, 18);
        return;
    }

    @ObfuscatedName("s.r(Lf;B)V")
    public static void method569(class26 arg0) {
        if (arg0.method596() != client.field280) {
            client.field280 = arg0.method596();
            class52.method2804(arg0.method596());
        }
        Statics.field313 = arg0.field628;
        client.field275 = arg0.field619;
        client.field493 = arg0.field614;
        Statics.field904 = client.field432 == 0 ? 43594 : arg0.field619 + 40000;
        Statics.field2021 = client.field432 == 0 ? 443 : arg0.field619 + 50000;
        Statics.field1056 = Statics.field904;
    }
}
