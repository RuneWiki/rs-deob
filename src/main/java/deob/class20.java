package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("j")
public class class20 {

    @ObfuscatedName("j.u")
    public static boolean field326 = false;

    @ObfuscatedName("j.d")
    public static int[] field322 = new int[256];

    @ObfuscatedName("j.j")
    public static int field292 = 0;

    @ObfuscatedName("j.a")
    public static int field309 = 0;

    @ObfuscatedName("j.y")
    public static int field304 = 0;

    @ObfuscatedName("j.au")
    public static int field321 = 0;

    @ObfuscatedName("j.az")
    public static int field306 = 0;

    @ObfuscatedName("j.ak")
    public static int field307 = 0;

    @ObfuscatedName("j.ah")
    public static int field308 = 10;

    @ObfuscatedName("j.aa")
    public static String field298 = "";

    @ObfuscatedName("j.am")
    public static int field318 = 0;

    @ObfuscatedName("j.al")
    public static String field311 = "";

    @ObfuscatedName("j.ae")
    public static String field297 = "";

    @ObfuscatedName("j.ab")
    public static String field313 = "";

    @ObfuscatedName("j.as")
    public static String field314 = "";

    @ObfuscatedName("j.ai")
    public static String field315 = "";

    @ObfuscatedName("j.aj")
    public static int field316 = 0;

    @ObfuscatedName("j.an")
    public static String field317 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("j.af")
    public static boolean field310 = false;

    @ObfuscatedName("j.ar")
    public static int field319 = 0;

    @ObfuscatedName("j.bs")
    public static int[] field312 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("j.bk")
    public static int[] field301 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("j.be")
    public static int field323 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.v(Ley;Ley;I)I")
    public static int method33(class151 arg0, class151 arg1) {
        int var2 = 0;
        if (arg0.method2979("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2979("logo", "")) {
            var2++;
        }
        if (arg1.method2979("titlebox", "")) {
            var2++;
        }
        if (arg1.method2979("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2979("runes", "")) {
            var2++;
        }
        if (arg1.method2979("title_mute", "")) {
            var2++;
        }
        arg1.method2979("sl_back", "");
        arg1.method2979("sl_flags", "");
        arg1.method2979("sl_arrows", "");
        arg1.method2979("sl_stars", "");
        arg1.method2979("sl_button", "");
        return var2;
    }

    @ObfuscatedName("c.f(Ljava/awt/Component;Ley;Ley;I)V")
    public static void method29(Component arg0, class151 arg1, class151 arg2) {
        if (Statics.field320) {
            return;
        }
        class88.method1814();
        byte[] var3 = arg1.method2975("title.jpg", "");
        Statics.field296 = new class85(var3, arg0);
        Statics.field1807 = Statics.field296.method1704();
        Statics.field731 = class83.method689(arg2, "logo", "");
        Statics.field293 = class83.method689(arg2, "titlebox", "");
        Statics.field294 = class83.method689(arg2, "titlebutton", "");
        Statics.field295 = class83.method114(arg2, "runes", "");
        Statics.field194 = class83.method114(arg2, "title_mute", "");
        Statics.field2329 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field2329[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field2329[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field2329[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field2329[var7 + 192] = 16777215;
        }
        Statics.field1491 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1491[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1491[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field1491[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field1491[var11 + 192] = 16777215;
        }
        Statics.field299 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field299[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field299[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field299[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field299[var15 + 192] = 16777215;
        }
        Statics.field738 = new int[256];
        Statics.field1802 = new int[32768];
        Statics.field118 = new int[32768];
        Statics.method134((class86) null);
        Statics.field324 = new int[32768];
        Statics.field303 = new int[32768];
        field318 = 0;
        field314 = "";
        field315 = "";
        field310 = false;
        if (client.field697 == 0) {
            field326 = true;
        } else {
            field326 = false;
        }
        if (field326) {
            class137.field2322 = 1;
            Statics.field2323 = null;
            Statics.field2327 = -1;
            Statics.field2325 = -1;
            Statics.field2326 = 0;
            Statics.field2328 = false;
            Statics.field2332 = 2;
        } else {
            class153 var16 = Statics.field348;
            int var17 = var16.method2976("scape main");
            int var18 = var16.method3004(var17, "");
            class137.method35(2, var16, var17, var18, 255, false);
        }
        class152.method1310(false);
        Statics.field320 = true;
        Statics.field296.method1746(0, 0);
        Statics.field1807.method1746(382, 0);
        Statics.field731.method1794(382 - Statics.field731.field1459 / 2, 18);
    }

    @ObfuscatedName("cy.n(Lbu;I)V")
    public static void method2058(class72 arg0) {
        if (!field310) {
            if (class76.field1375 == 1 && class76.field1382 >= 715 && class76.field1380 >= 453) {
                field326 = !field326;
                if (field326) {
                    class137.method51();
                } else {
                    class137.method162(Statics.field348, "scape main", "", 255, false);
                }
            }
            if (client.field465 != 5) {
                field306++;
                if (client.field465 == 10) {
                    if (client.field463 == 0) {
                        if (class76.field1375 == 1) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class76.field1382 >= var9 && class76.field1382 <= var9 + var11 && class76.field1380 >= var10 && class76.field1380 <= var10 + var12) {
                                method3144();
                                return;
                            }
                        }
                        if (Statics.field1970 != null) {
                            method3144();
                        }
                    }
                    int var13 = class76.field1375;
                    int var14 = class76.field1382;
                    int var15 = class76.field1380;
                    if (field318 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field318 = 3;
                            field316 = 0;
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field311 = class133.field2268;
                            field297 = class133.field2269;
                            field313 = class133.field2270;
                            field318 = 2;
                            field316 = 0;
                        }
                    } else if (field318 == 2) {
                        short var19 = 231;
                        int var28 = var19 + 30;
                        if (var13 == 1 && var15 >= var28 - 15 && var15 < var28) {
                            field316 = 0;
                        }
                        var28 += 15;
                        if (var13 == 1 && var15 >= var28 - 15 && var15 < var28) {
                            field316 = 1;
                        }
                        var28 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field314 = field314.trim();
                            if (field314.length() == 0) {
                                method809(class133.field2184, class133.field2179, class133.field2180);
                                return;
                            }
                            if (field315.length() == 0) {
                                method809(class133.field2181, class133.field2245, class133.field2178);
                                return;
                            }
                            method809(class133.field2271, class133.field2214, class133.field2273);
                            client.method2054(20);
                            return;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field318 = 0;
                            field314 = "";
                            field315 = "";
                        }
                        while (true) {
                            while (class74.method113()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field317.length(); var24++) {
                                    if (Statics.field951 == field317.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (field316 == 0) {
                                    if (Statics.field124 == 85 && field314.length() > 0) {
                                        field314 = field314.substring(0, field314.length() - 1);
                                    }
                                    if (Statics.field124 == 84 || Statics.field124 == 80) {
                                        field316 = 1;
                                    }
                                    if (var23 && field314.length() < 320) {
                                        field314 = field314 + Statics.field951;
                                    }
                                } else if (field316 == 1) {
                                    if (Statics.field124 == 85 && field315.length() > 0) {
                                        field315 = field315.substring(0, field315.length() - 1);
                                    }
                                    if (Statics.field124 == 84 || Statics.field124 == 80) {
                                        field316 = 0;
                                    }
                                    if (client.field459 == 2 && Statics.field124 == 84) {
                                        field314 = field314.trim();
                                        if (field314.length() == 0) {
                                            method809(class133.field2184, class133.field2179, class133.field2180);
                                            return;
                                        }
                                        if (field315.length() == 0) {
                                            method809(class133.field2181, class133.field2245, class133.field2178);
                                            return;
                                        }
                                        method809(class133.field2271, class133.field2214, class133.field2273);
                                        client.method2054(20);
                                        return;
                                    }
                                    if (var23 && field315.length() < 20) {
                                        field315 = field315 + Statics.field951;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field318 == 3) {
                        short var25 = 382;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field318 = 0;
                        }
                    }
                }
            }
        } else if (class76.field1375 == 1) {
            short var1 = 280;
            if (class76.field1382 >= var1 && class76.field1382 <= var1 + 14 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                method103(0, 0);
            } else if (class76.field1382 >= var1 + 15 && class76.field1382 <= var1 + 80 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                method103(0, 1);
            } else {
                short var2 = 390;
                if (class76.field1382 >= var2 && class76.field1382 <= var2 + 14 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                    method103(1, 0);
                } else if (class76.field1382 >= var2 + 15 && class76.field1382 <= var2 + 80 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                    method103(1, 1);
                } else {
                    short var3 = 500;
                    if (class76.field1382 >= var3 && class76.field1382 <= var3 + 14 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                        method103(2, 0);
                    } else if (class76.field1382 >= var3 + 15 && class76.field1382 <= var3 + 80 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                        method103(2, 1);
                    } else {
                        short var4 = 610;
                        if (class76.field1382 >= var4 && class76.field1382 <= var4 + 14 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                            method103(3, 0);
                        } else if (class76.field1382 >= var4 + 15 && class76.field1382 <= var4 + 80 && class76.field1380 >= 4 && class76.field1380 <= 18) {
                            method103(3, 1);
                        } else if (class76.field1382 >= 708 && class76.field1380 >= 4 && class76.field1382 <= 758 && class76.field1380 <= 20) {
                            field310 = false;
                            Statics.field296.method1746(0, 0);
                            Statics.field1807.method1746(382, 0);
                            Statics.field731.method1794(382 - Statics.field731.field1459 / 2, 18);
                        } else if (field323 != -1) {
                            class12 var5 = Statics.field1003[field323];
                            if (client.field567 == var5.field204) {
                                Statics.field2302 = var5.field202;
                                client.field557 = var5.field203;
                                Statics.field1803 = client.field459 == 0 ? 43594 : var5.field203 + 40000;
                                Statics.field494 = client.field459 == 0 ? 443 : var5.field203 + 50000;
                                Statics.field325 = Statics.field1803;
                                field310 = false;
                                Statics.field296.method1746(0, 0);
                                Statics.field1807.method1746(382, 0);
                                Statics.field731.method1794(382 - Statics.field731.field1459 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field459 != 0) {
                                    var6 = ":" + (var5.field203 + 7000);
                                }
                                String var7 = "http://" + var5.field202 + var6 + "/j" + client.field464;
                                try {
                                    arg0.getAppletContext().showDocument(new URL(var7), "_self");
                                } catch (Exception var27) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.c(Lfb;Lfb;B)V")
    public static void method2139(class182 arg0, class182 arg1) {
        if (field310) {
            if (Statics.field742 == null) {
                Statics.field742 = class83.method676(Statics.field2383, "sl_back", "");
            }
            if (Statics.field852 == null) {
                Statics.field852 = class83.method114(Statics.field2383, "sl_flags", "");
            }
            if (Statics.field2500 == null) {
                Statics.field2500 = class83.method114(Statics.field2383, "sl_arrows", "");
            }
            if (Statics.field219 == null) {
                Statics.field219 = class83.method114(Statics.field2383, "sl_stars", "");
            }
            class88.method1816(0, 23, 765, 480, 0);
            class88.method1817(0, 0, 125, 23, 12425273, 9135624);
            class88.method1817(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3363(class133.field2286, 62, 15, 0, -1);
            if (Statics.field219 != null) {
                Statics.field219[1].method1794(140, 1);
                arg1.method3361(class133.field2287, 152, 10, 16777215, -1);
                Statics.field219[0].method1794(140, 12);
                arg1.method3361(class133.field2288, 152, 21, 16777215, -1);
            }
            if (Statics.field2500 != null) {
                short var2 = 280;
                if (field312[0] == 0 && field301[0] == 0) {
                    Statics.field2500[2].method1794(var2, 4);
                } else {
                    Statics.field2500[0].method1794(var2, 4);
                }
                if (field312[0] == 0 && field301[0] == 1) {
                    Statics.field2500[3].method1794(var2 + 15, 4);
                } else {
                    Statics.field2500[1].method1794(var2 + 15, 4);
                }
                arg0.method3361(class133.field2289, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field312[0] == 1 && field301[0] == 0) {
                    Statics.field2500[2].method1794(var3, 4);
                } else {
                    Statics.field2500[0].method1794(var3, 4);
                }
                if (field312[0] == 1 && field301[0] == 1) {
                    Statics.field2500[3].method1794(var3 + 15, 4);
                } else {
                    Statics.field2500[1].method1794(var3 + 15, 4);
                }
                arg0.method3361(class133.field2290, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field312[0] == 2 && field301[0] == 0) {
                    Statics.field2500[2].method1794(var4, 4);
                } else {
                    Statics.field2500[0].method1794(var4, 4);
                }
                if (field312[0] == 2 && field301[0] == 1) {
                    Statics.field2500[3].method1794(var4 + 15, 4);
                } else {
                    Statics.field2500[1].method1794(var4 + 15, 4);
                }
                arg0.method3361(class133.field2148, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field312[0] == 3 && field301[0] == 0) {
                    Statics.field2500[2].method1794(var5, 4);
                } else {
                    Statics.field2500[0].method1794(var5, 4);
                }
                if (field312[0] == 3 && field301[0] == 1) {
                    Statics.field2500[3].method1794(var5 + 15, 4);
                } else {
                    Statics.field2500[1].method1794(var5 + 15, 4);
                }
                arg0.method3361(class133.field2246, var5 + 32, 17, 16777215, -1);
            }
            class88.method1816(708, 4, 50, 16, 0);
            arg1.method3363(class133.field2280, 733, 16, 16777215, -1);
            field323 = -1;
            if (Statics.field742 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field319) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field319) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field319) {
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
                int var17 = var14;
                int var18 = 0;
                for (int var19 = 0; var19 < field319; var19++) {
                    class12 var20 = Statics.field1003[var19];
                    boolean var21 = true;
                    String var22 = Integer.toString(var20.field200);
                    if (var20.field200 == -1) {
                        var22 = class133.field2293;
                        var21 = false;
                    } else if (var20.field200 > 1980) {
                        var22 = class133.field2238;
                        var21 = false;
                    }
                    if (class76.field1376 >= var17 && class76.field1370 >= var16 && class76.field1376 < var6 + var17 && class76.field1370 < var7 + var16 && var21) {
                        field323 = var19;
                        Statics.field742[var20.field204 ? 1 : 0].method1780(var17, var16, 128, 16777215);
                    } else {
                        Statics.field742[var20.field204 ? 1 : 0].method1746(var17, var16);
                    }
                    if (Statics.field852 != null) {
                        Statics.field852[var20.field209 + (var20.field204 ? 8 : 0)].method1794(var17 + 29, var16);
                    }
                    arg0.method3363(Integer.toString(var20.field203), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3363(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
            }
            try {
                Graphics var23 = Statics.field223.getGraphics();
                Statics.field896.method1641(var23, 0, 0);
            } catch (Exception var92) {
                Statics.field223.repaint();
            }
            return;
        }
        if (client.field465 == 0 || client.field465 == 5) {
            byte var25 = 20;
            arg0.method3363(class133.field2092, 382, 245 - var25, 16777215, -1);
            int var26 = 253 - var25;
            class88.method1818(230, var26, 304, 34, 9179409);
            class88.method1818(231, var26 + 1, 302, 32, 0);
            class88.method1816(232, var26 + 2, field308 * 3, 30, 9179409);
            class88.method1816(field308 * 3 + 232, var26 + 2, 300 - field308 * 3, 30, 0);
            arg0.method3363(field298, 382, 276 - var25, 16777215, -1);
        }
        if (client.field465 == 20) {
            Statics.field293.method1794(382 - Statics.field293.field1459 / 2, 271 - Statics.field293.field1458 / 2);
            short var27 = 211;
            arg0.method3363(field311, 382, var27, 16776960, 0);
            int var94 = var27 + 15;
            arg0.method3363(field297, 382, var94, 16776960, 0);
            int var95 = var94 + 15;
            arg0.method3363(field313, 382, var95, 16776960, 0);
            int var96 = var95 + 15;
            int var97 = var96 + 10;
            arg0.method3361(class133.field2267, 272, var97, 16777215, 0);
            short var28 = 200;
            String var29;
            for (var29 = field314; arg0.method3356(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
            }
            arg0.method3361(class184.method3404(var29), 312, var97, 16777215, 0);
            var94 = var97 + 15;
            String var31 = class133.field2275;
            String var32 = field315;
            int var33 = var32.length();
            char[] var34 = new char[var33];
            for (int var35 = 0; var35 < var33; var35++) {
                var34[var35] = '*';
            }
            String var36 = new String(var34);
            arg0.method3361(var31 + var36, 274, var94, 16777215, 0);
            var94 += 15;
        }
        if (client.field465 == 10) {
            Statics.field293.method1794(202, 171);
            if (field318 == 0) {
                short var38 = 251;
                arg0.method3363(class133.field2211, 382, var38, 16776960, 0);
                int var98 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field294.method1794(var39 - 73, var40 - 20);
                arg0.method3364(class133.field2277, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field294.method1794(var41 - 73, var40 - 20);
                arg0.method3364(class133.field2278, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field318 == 2) {
                short var42 = 211;
                arg0.method3363(field311, 382, var42, 16776960, 0);
                int var99 = var42 + 15;
                arg0.method3363(field297, 382, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3363(field313, 382, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 10;
                arg0.method3361(class133.field2267, 272, var102, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field314; arg0.method3356(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3361(class184.method3404(var44) + (field316 == 0 & client.field510 % 40 < 20 ? class2.method699(16776960) + class2.field17 : ""), 312, var102, 16777215, 0);
                var99 = var102 + 15;
                String var46 = class133.field2275;
                String var47 = field315;
                int var48 = var47.length();
                char[] var49 = new char[var48];
                for (int var50 = 0; var50 < var48; var50++) {
                    var49[var50] = '*';
                }
                String var51 = new String(var49);
                arg0.method3361(var46 + var51 + (field316 == 1 & client.field510 % 40 < 20 ? class2.method699(16776960) + class2.field17 : ""), 274, var99, 16777215, 0);
                var99 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field294.method1794(var53 - 73, var54 - 20);
                arg0.method3363(class133.field2279, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field294.method1794(var55 - 73, var54 - 20);
                arg0.method3363(class133.field2280, var55, var54 + 5, 16777215, 0);
            } else if (field318 == 3) {
                arg0.method3363(class133.field2284, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3363(class133.field2282, 382, var56, 16777215, 0);
                int var103 = var56 + 15;
                arg0.method3363(class133.field2283, 382, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3363(class133.field2262, 382, var104, 16777215, 0);
                int var105 = var104 + 15;
                arg0.method3363(class133.field2102, 382, var105, 16777215, 0);
                int var106 = var105 + 15;
                short var57 = 382;
                short var58 = 321;
                Statics.field294.method1794(var57 - 73, var58 - 20);
                arg0.method3363(class133.field2280, var57, var58 + 5, 16777215, 0);
            }
        }
        if (field306 > 0) {
            int var59 = field306;
            short var60 = 256;
            field304 += var59 * 128;
            if (field304 > Statics.field1802.length) {
                field304 -= Statics.field1802.length;
                int var61 = (int) (Math.random() * 12.0D);
                Statics.method134(Statics.field295[var61]);
            }
            int var62 = 0;
            int var63 = var59 * 128;
            int var64 = (var60 - var59) * 128;
            for (int var65 = 0; var65 < var64; var65++) {
                int var66 = Statics.field324[var62 + var63] - Statics.field1802[field304 + var62 & Statics.field1802.length - 1] * var59 / 6;
                if (var66 < 0) {
                    var66 = 0;
                }
                Statics.field324[var62++] = var66;
            }
            for (int var67 = var60 - var59; var67 < var60; var67++) {
                int var68 = var67 * 128;
                for (int var69 = 0; var69 < 128; var69++) {
                    int var70 = (int) (Math.random() * 100.0D);
                    if (var70 < 50 && var69 > 10 && var69 < 118) {
                        Statics.field324[var68 + var69] = 255;
                    } else {
                        Statics.field324[var68 + var69] = 0;
                    }
                }
            }
            if (field292 > 0) {
                field292 -= var59 * 4;
            }
            if (field309 > 0) {
                field309 -= var59 * 4;
            }
            if (field292 == 0 && field309 == 0) {
                int var71 = (int) (Math.random() * (double) (2000 / var59));
                if (var71 == 0) {
                    field292 = 1024;
                }
                if (var71 == 1) {
                    field309 = 1024;
                }
            }
            for (int var72 = 0; var72 < var60 - var59; var72++) {
                field322[var72] = field322[var59 + var72];
            }
            for (int var73 = var60 - var59; var73 < var60; var73++) {
                field322[var73] = (int) (Math.sin((double) field307 / 14.0D) * 16.0D + Math.sin((double) field307 / 15.0D) * 14.0D + Math.sin((double) field307 / 16.0D) * 12.0D);
                field307++;
            }
            field321 += var59 * -96069733;
            int var74 = ((client.field510 & 0x1) + var59) / 2;
            if (var74 > 0) {
                for (int var75 = 0; var75 < field321 * 1698845036; var75++) {
                    int var76 = (int) (Math.random() * 124.0D) + 2;
                    int var77 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field324[(var77 << 7) + var76] = 192;
                }
                field321 = 0;
                int var78 = 0;
                label388: while (true) {
                    if (var78 >= var60) {
                        int var82 = 0;
                        while (true) {
                            if (var82 >= 128) {
                                break label388;
                            }
                            int var83 = 0;
                            for (int var84 = -var74; var84 < var60; var84++) {
                                int var85 = var84 * 128;
                                if (var74 + var84 < var60) {
                                    var83 += Statics.field303[var74 * 128 + var82 + var85];
                                }
                                if (var84 - (var74 + 1) >= 0) {
                                    var83 -= Statics.field303[var82 + var85 - (var74 + 1) * 128];
                                }
                                if (var84 >= 0) {
                                    Statics.field324[var82 + var85] = var83 / (var74 * 2 + 1);
                                }
                            }
                            var82++;
                        }
                    }
                    int var79 = 0;
                    int var80 = var78 * 128;
                    for (int var81 = -var74; var81 < 128; var81++) {
                        if (var74 + var81 < 128) {
                            var79 += Statics.field324[var80 + var81 + var74];
                        }
                        if (var81 - (var74 + 1) >= 0) {
                            var79 -= Statics.field324[var80 + var81 - (var74 + 1)];
                        }
                        if (var81 >= 0) {
                            Statics.field303[var80 + var81] = var79 / (var74 * 2 + 1);
                        }
                    }
                    var78++;
                }
            }
            field306 = 0;
        }
        method1486();
        Statics.field194[field326 ? 1 : 0].method1794(725, 463);
        if (client.field465 > 5 && client.field463 == 0) {
            if (Statics.field2064 == null) {
                Statics.field2064 = class83.method689(Statics.field2383, "sl_button", "");
            } else {
                byte var86 = 5;
                short var87 = 463;
                byte var88 = 100;
                byte var89 = 35;
                Statics.field2064.method1794(var86, var87);
                arg0.method3363(class133.field2222 + " " + client.field557, var88 / 2 + var86, var89 / 2 + var87 - 2, 16777215, 0);
                if (Statics.field1970 == null) {
                    arg1.method3363(class133.field2296, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                } else {
                    arg1.method3363(class133.field2295, var88 / 2 + var86, var89 / 2 + var87 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var90 = Statics.field223.getGraphics();
            Statics.field896.method1641(var90, 0, 0);
        } catch (Exception var93) {
            Statics.field223.repaint();
        }
    }

    @ObfuscatedName("ai.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method809(String arg0, String arg1, String arg2) {
        field311 = arg0;
        field297 = arg1;
        field313 = arg2;
    }

    @ObfuscatedName("f.e(IIII)I")
    public static final int method4(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bu.q(I)V")
    public static final void method1486() {
        short var0 = 256;
        if (field292 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field292 > 768) {
                    Statics.field738[var1] = method4(Statics.field2329[var1], Statics.field1491[var1], 1024 - field292);
                } else if (field292 > 256) {
                    Statics.field738[var1] = Statics.field1491[var1];
                } else {
                    Statics.field738[var1] = method4(Statics.field1491[var1], Statics.field2329[var1], 256 - field292);
                }
            }
        } else if (field309 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field309 > 768) {
                    Statics.field738[var2] = method4(Statics.field2329[var2], Statics.field299[var2], 1024 - field309);
                } else if (field309 > 256) {
                    Statics.field738[var2] = Statics.field299[var2];
                } else {
                    Statics.field738[var2] = method4(Statics.field299[var2], Statics.field2329[var2], 256 - field309);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field738[var3] = Statics.field2329[var3];
            }
        }
        class88.method1858(0, 9, 128, var0 + 7);
        Statics.field296.method1746(0, 0);
        class88.method1807();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field322[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field324[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field738[var10];
                    int var14 = Statics.field896.field1442[var5];
                    Statics.field896.field1442[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class88.method1858(637, 9, 765, var0 + 7);
        Statics.field1807.method1746(382, 0);
        class88.method1807();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field322[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field324[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field738[var22];
                    int var26 = Statics.field896.field1442[var20];
                    Statics.field896.field1442[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ff.u(I)V")
    public static void method3144() {
        try {
            if (Statics.field1970 == null) {
                Statics.field1970 = new class23(Statics.field960, new URL(Statics.field1022));
            } else {
                byte[] var0 = Statics.field1970.method205();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field319 = var1.method2468();
                    Statics.field1003 = new class12[field319];
                    int var2 = 0;
                    while (var2 < field319) {
                        class12 var3 = Statics.field1003[var2] = new class12();
                        int var4 = var1.method2468();
                        var3.field203 = var4 & 0x7FFF;
                        var3.field204 = (var4 & 0x8000) != 0;
                        var3.field202 = var1.method2462();
                        var3.field209 = var1.method2466();
                        var3.field200 = var1.method2469();
                        var3.field199 = var2++;
                    }
                    method2357(Statics.field1003, 0, Statics.field1003.length - 1, field312, field301);
                    field310 = true;
                    Statics.field1970 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1970 = null;
        }
    }

    @ObfuscatedName("s.s(III)V")
    public static void method103(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field312[var5] != arg0) {
                var2[var4] = field312[var5];
                var3[var4] = field301[var5];
                var4++;
            }
        }
        field312 = var2;
        field301 = var3;
        method2357(Statics.field1003, 0, Statics.field1003.length - 1, field312, field301);
    }

    @ObfuscatedName("dc.l([Lo;II[I[II)V")
    public static void method2357(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class12 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field199;
                        var12 = var8.field199;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field200;
                        var12 = var8.field200;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field204 ? 1 : 0;
                        var12 = var8.field204 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field203;
                        var12 = var8.field203;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field199;
                        var16 = var8.field199;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field200;
                        var16 = var8.field200;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field204 ? 1 : 0;
                        var16 = var8.field204 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field203;
                        var16 = var8.field203;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class12 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2357(arg0, arg1, var6, arg3, arg4);
        method2357(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
