package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("al")
public class class28 {

    @ObfuscatedName("al.p")
    public static int[] field641 = new int[256];

    @ObfuscatedName("al.j")
    public static int field667 = 0;

    @ObfuscatedName("al.b")
    public static int field653 = 0;

    @ObfuscatedName("al.z")
    public static int field658 = 0;

    @ObfuscatedName("al.e")
    public static int field652 = 0;

    @ObfuscatedName("al.av")
    public static int field648 = 0;

    @ObfuscatedName("al.al")
    public static int field649 = 0;

    @ObfuscatedName("al.aq")
    public static int field651 = 10;

    @ObfuscatedName("al.aa")
    public static String field636 = "";

    @ObfuscatedName("al.ah")
    public static int field642 = 0;

    @ObfuscatedName("al.au")
    public static String field643 = "";

    @ObfuscatedName("al.ai")
    public static String field654 = "";

    @ObfuscatedName("al.ab")
    public static String field634 = "";

    @ObfuscatedName("al.ag")
    public static String field656 = "";

    @ObfuscatedName("al.ax")
    public static String field657 = "";

    @ObfuscatedName("al.af")
    public static int field646 = 0;

    @ObfuscatedName("al.ao")
    public static String field659 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("al.aj")
    public static boolean field660 = false;

    @ObfuscatedName("al.az")
    public static int field661 = 0;

    @ObfuscatedName("al.bw")
    public static int[] field663 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("al.bq")
    public static int[] field664 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("al.bl")
    public static int field665 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.y(Ljava/awt/Component;Lev;Lev;B)V")
    public static void method2557(Component arg0, class145 arg1, class145 arg2) {
        if (Statics.field655) {
            return;
        }
        class73.method1512();
        byte[] var3 = arg1.method2721("title.jpg", "");
        Statics.field638 = new class72(var3, arg0);
        Statics.field598 = Statics.field638.method1416();
        Statics.field2024 = class70.method732(arg2, "logo", "");
        Statics.field635 = class70.method732(arg2, "titlebox", "");
        Statics.field650 = class70.method732(arg2, "titlebutton", "");
        Statics.field637 = class70.method1010(arg2, "runes", "");
        Statics.field668 = class70.method1010(arg2, "title_mute", "");
        Statics.field2916 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field2916[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field2916[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field2916[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field2916[var7 + 192] = 16777215;
        }
        Statics.field2130 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field2130[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field2130[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field2130[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field2130[var11 + 192] = 16777215;
        }
        Statics.field1893 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1893[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1893[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1893[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1893[var15 + 192] = 16777215;
        }
        Statics.field2845 = new int[256];
        Statics.field644 = new int[32768];
        Statics.field948 = new int[32768];
        method2349((class74) null);
        Statics.field2786 = new int[32768];
        Statics.field645 = new int[32768];
        field642 = 0;
        field656 = "";
        field657 = "";
        field660 = false;
        if (Statics.field559.field142) {
            class160.field2683 = 1;
            Statics.field558 = null;
            Statics.field2686 = -1;
            Statics.field1890 = -1;
            Statics.field2684 = 0;
            Statics.field1891 = false;
            Statics.field2677 = 2;
        } else {
            class160.method1854(2, Statics.field158, "scape main", "", 255, false);
        }
        class149.method3378(false);
        Statics.field655 = true;
        Statics.field638.method1413(0, 0);
        Statics.field598.method1413(382, 0);
        Statics.field2024.method1564(382 - Statics.field2024.field1307 / 2, 18);
    }

    @ObfuscatedName("z.u(I)V")
    public static void method495() {
        if (!Statics.field655) {
            return;
        }
        Statics.field635 = null;
        Statics.field650 = null;
        Statics.field637 = null;
        Statics.field638 = null;
        Statics.field598 = null;
        Statics.field2024 = null;
        Statics.field668 = null;
        Statics.field2134 = null;
        Statics.field1273 = null;
        Statics.field2488 = null;
        Statics.field876 = null;
        Statics.field673 = null;
        Statics.field2916 = null;
        Statics.field2130 = null;
        Statics.field1893 = null;
        Statics.field2845 = null;
        Statics.field644 = null;
        Statics.field948 = null;
        Statics.field2786 = null;
        Statics.field645 = null;
        class160.field2683 = 1;
        Statics.field558 = null;
        Statics.field2686 = -1;
        Statics.field1890 = -1;
        Statics.field2684 = 0;
        Statics.field1891 = false;
        Statics.field2677 = 2;
        class149.method3378(true);
        Statics.field655 = false;
    }

    @ObfuscatedName("j.k(Lel;I)V")
    public static void method436(class131 arg0) {
        if (!field660) {
            if ((class127.field2011 == 1 || !Statics.field144 && class127.field2011 == 4) && class127.field2013 >= 715 && class127.field2015 >= 453) {
                Statics.field559.field142 = !Statics.field559.field142;
                class9.method564();
                if (Statics.field559.field142) {
                    Statics.field2679.method3050();
                    class160.field2683 = 1;
                    Statics.field558 = null;
                } else {
                    class160.method2810(Statics.field158, "scape main", "", 255, false);
                }
            }
            if (client.field260 != 5) {
                field648++;
                if (client.field260 == 10) {
                    if (client.field497 == 0) {
                        if (class127.field2011 == 1 || !Statics.field144 && class127.field2011 == 4) {
                            byte var6 = 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class127.field2013 >= var6 && class127.field2013 <= var6 + var8 && class127.field2015 >= var7 && class127.field2015 <= var7 + var9) {
                                method453();
                                return;
                            }
                        }
                        if (Statics.field1666 != null) {
                            method453();
                        }
                    }
                    int var10 = class127.field2011;
                    int var11 = class127.field2013;
                    int var12 = class127.field2015;
                    if (!Statics.field144 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field642 == 0) {
                        short var13 = 302;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            String var15 = "secure";
                            String var16 = "https://";
                            if (client.field255 == 1) {
                                var15 = var15 + "-wtrc";
                            } else if (client.field255 == 2) {
                                var15 = var15 + "-wtqa";
                            } else if (client.field255 == 3) {
                                var15 = var15 + "-wtwip";
                            } else if (client.field255 == 5) {
                                var15 = var15 + "-wti";
                            } else if (client.field255 == 4) {
                                var15 = "local";
                            }
                            String var17 = "runescape.com";
                            String var18 = var16 + var15 + "." + var17 + "/l=" + client.field497 + "/";
                            class125.method497(var18 + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        short var19 = 462;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field431 & 0x4) != 0) {
                                if ((client.field431 & 0x400) == 0) {
                                    field643 = class142.field2355;
                                    field654 = class142.field2356;
                                    field634 = class142.field2357;
                                } else {
                                    field643 = class142.field2361;
                                    field654 = class142.field2362;
                                    field634 = class142.field2363;
                                }
                                field642 = 1;
                                field646 = 0;
                            } else if ((client.field431 & 0x400) == 0) {
                                field643 = class142.field2351;
                                field654 = class142.field2352;
                                field634 = class142.field2353;
                                field642 = 2;
                                field646 = 0;
                            } else {
                                field643 = class142.field2231;
                                field654 = class142.field2269;
                                field634 = class142.field2360;
                                field642 = 1;
                                field646 = 0;
                            }
                        }
                    } else if (field642 == 1) {
                        while (class124.method494()) {
                            if (Statics.field1662 == 84) {
                                field643 = class142.field2351;
                                field654 = class142.field2352;
                                field634 = class142.field2353;
                                field642 = 2;
                                field646 = 0;
                            } else if (Statics.field1662 == 13) {
                                field642 = 0;
                            }
                        }
                        short var20 = 302;
                        short var21 = 321;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field643 = class142.field2351;
                            field654 = class142.field2352;
                            field634 = class142.field2353;
                            field642 = 2;
                            field646 = 0;
                        }
                        short var22 = 462;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var21 - 20 && var12 <= var21 + 20) {
                            field642 = 0;
                        }
                    } else if (field642 == 2) {
                        short var23 = 231;
                        int var29 = var23 + 30;
                        if (var10 == 1 && var12 >= var29 - 15 && var12 < var29) {
                            field646 = 0;
                        }
                        var29 += 15;
                        if (var10 == 1 && var12 >= var29 - 15 && var12 < var29) {
                            field646 = 1;
                        }
                        var29 += 15;
                        short var24 = 302;
                        short var25 = 321;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                            field656 = field656.trim();
                            if (field656.length() == 0) {
                                method125(class142.field2263, class142.field2264, class142.field2163);
                                return;
                            }
                            if (field657.length() == 0) {
                                method125(class142.field2266, class142.field2300, class142.field2268);
                                return;
                            }
                            method125(class142.field2364, class142.field2365, class142.field2366);
                            client.method547(20);
                            return;
                        }
                        short var26 = 462;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var25 - 20 && var12 <= var25 + 20) {
                            field642 = 0;
                            field656 = "";
                            field657 = "";
                        }
                        while (true) {
                            while (class124.method494()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field659.length(); var28++) {
                                    if (Statics.field666 == field659.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1662 == 13) {
                                    field642 = 0;
                                    field656 = "";
                                    field657 = "";
                                } else if (field646 == 0) {
                                    if (Statics.field1662 == 85 && field656.length() > 0) {
                                        field656 = field656.substring(0, field656.length() - 1);
                                    }
                                    if (Statics.field1662 == 84 || Statics.field1662 == 80) {
                                        field646 = 1;
                                    }
                                    if (var27 && field656.length() < 320) {
                                        field656 = field656 + Statics.field666;
                                    }
                                } else if (field646 == 1) {
                                    if (Statics.field1662 == 85 && field657.length() > 0) {
                                        field657 = field657.substring(0, field657.length() - 1);
                                    }
                                    if (Statics.field1662 == 84 || Statics.field1662 == 80) {
                                        field646 = 0;
                                    }
                                    if (Statics.field1662 == 84) {
                                        field656 = field656.trim();
                                        if (field656.length() == 0) {
                                            method125(class142.field2263, class142.field2264, class142.field2163);
                                            return;
                                        }
                                        if (field657.length() == 0) {
                                            method125(class142.field2266, class142.field2300, class142.field2268);
                                            return;
                                        }
                                        method125(class142.field2364, class142.field2365, class142.field2366);
                                        client.method547(20);
                                        return;
                                    }
                                    if (var27 && field657.length() < 20) {
                                        field657 = field657 + Statics.field666;
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
            }
        } else if (class127.field2011 == 1 || !Statics.field144 && class127.field2011 == 4) {
            short var1 = 280;
            if (class127.field2013 >= var1 && class127.field2013 <= var1 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                method2371(0, 0);
            } else if (class127.field2013 >= var1 + 15 && class127.field2013 <= var1 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                method2371(0, 1);
            } else {
                short var2 = 390;
                if (class127.field2013 >= var2 && class127.field2013 <= var2 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                    method2371(1, 0);
                } else if (class127.field2013 >= var2 + 15 && class127.field2013 <= var2 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                    method2371(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field2013 >= var3 && class127.field2013 <= var3 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                        method2371(2, 0);
                    } else if (class127.field2013 >= var3 + 15 && class127.field2013 <= var3 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                        method2371(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field2013 >= var4 && class127.field2013 <= var4 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                            method2371(3, 0);
                        } else if (class127.field2013 >= var4 + 15 && class127.field2013 <= var4 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
                            method2371(3, 1);
                        } else if (class127.field2013 >= 708 && class127.field2015 >= 4 && class127.field2013 <= 758 && class127.field2015 <= 20) {
                            field660 = false;
                            Statics.field638.method1413(0, 0);
                            Statics.field598.method1413(382, 0);
                            Statics.field2024.method1564(382 - Statics.field2024.field1307 / 2, 18);
                        } else if (field665 != -1) {
                            class22 var5 = Statics.field2007[field665];
                            method2672(var5);
                            field660 = false;
                            Statics.field638.method1413(0, 0);
                            Statics.field598.method1413(382, 0);
                            Statics.field2024.method1564(382 - Statics.field2024.field1307 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.v(Lgc;Lgc;B)V")
    public static void method2117(class190 arg0, class190 arg1) {
        if (field660) {
            method479(arg0, arg1);
            return;
        }
        if (client.field260 == 0 || client.field260 == 5) {
            byte var2 = 20;
            arg0.method3305(class142.field2247, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1516(230, var3, 304, 34, 9179409);
            class73.method1516(231, var3 + 1, 302, 32, 0);
            class73.method1514(232, var3 + 2, field651 * 3, 30, 9179409);
            class73.method1514(field651 * 3 + 232, var3 + 2, 300 - field651 * 3, 30, 0);
            arg0.method3305(field636, 382, 276 - var2, 16777215, -1);
        }
        if (client.field260 == 20) {
            Statics.field635.method1564(382 - Statics.field635.field1307 / 2, 271 - Statics.field635.field1310 / 2);
            short var4 = 211;
            arg0.method3305(field643, 382, var4, 16776960, 0);
            int var90 = var4 + 15;
            arg0.method3305(field654, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            arg0.method3305(field634, 382, var91, 16776960, 0);
            int var92 = var91 + 15;
            int var93 = var92 + 10;
            arg0.method3303(class142.field2350, 272, var93, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field656; arg0.method3298(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method3303(class189.method3302(var6), 312, var93, 16777215, 0);
            var90 = var93 + 15;
            String var8 = class142.field2189;
            String var9 = field657;
            String var10 = class196.method2834('*', var9.length());
            arg0.method3303(var8 + var10, 274, var90, 16777215, 0);
            var90 += 15;
        }
        if (client.field260 == 10) {
            Statics.field635.method1564(202, 171);
            if (field642 == 0) {
                short var11 = 251;
                arg0.method3305(class142.field2383, 382, var11, 16776960, 0);
                int var94 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field650.method1564(var12 - 73, var13 - 20);
                arg0.method3306(class142.field2255, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field650.method1564(var14 - 73, var13 - 20);
                arg0.method3306(class142.field2371, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field642 == 1) {
                arg0.method3305(class142.field2354, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3305(field643, 382, var15, 16777215, 0);
                int var95 = var15 + 15;
                arg0.method3305(field654, 382, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3305(field634, 382, var96, 16777215, 0);
                int var97 = var96 + 15;
                short var16 = 302;
                short var17 = 321;
                Statics.field650.method1564(var16 - 73, var17 - 20);
                arg0.method3305(class142.field2157, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                Statics.field650.method1564(var18 - 73, var17 - 20);
                arg0.method3305(class142.field2228, var18, var17 + 5, 16777215, 0);
            } else if (field642 == 2) {
                short var19 = 211;
                arg0.method3305(field643, 382, var19, 16776960, 0);
                int var98 = var19 + 15;
                arg0.method3305(field654, 382, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg0.method3305(field634, 382, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var101 = var100 + 10;
                arg0.method3303(class142.field2350, 272, var101, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = field656; arg0.method3298(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3303(class189.method3302(var21) + (field646 == 0 & client.field262 % 40 < 20 ? class2.method793(16776960) + class2.field23 : ""), 312, var101, 16777215, 0);
                var98 = var101 + 15;
                String var23 = class142.field2189;
                String var24 = field657;
                String var25 = class196.method2834('*', var24.length());
                arg0.method3303(var23 + var25 + (field646 == 1 & client.field262 % 40 < 20 ? class2.method793(16776960) + class2.field23 : ""), 274, var98, 16777215, 0);
                var98 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field650.method1564(var26 - 73, var27 - 20);
                arg0.method3305(class142.field2372, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field650.method1564(var28 - 73, var27 - 20);
                arg0.method3305(class142.field2228, var28, var27 + 5, 16777215, 0);
            }
        }
        if (field648 > 0) {
            int var29 = field648;
            short var30 = 256;
            field658 += var29 * 128;
            if (field658 > Statics.field644.length) {
                field658 -= Statics.field644.length;
                int var31 = (int) (Math.random() * 12.0D);
                method2349(Statics.field637[var31]);
            }
            int var32 = 0;
            int var33 = var29 * 128;
            int var34 = (var30 - var29) * 128;
            for (int var35 = 0; var35 < var34; var35++) {
                int var36 = Statics.field2786[var32 + var33] - Statics.field644[field658 + var32 & Statics.field644.length - 1] * var29 / 6;
                if (var36 < 0) {
                    var36 = 0;
                }
                Statics.field2786[var32++] = var36;
            }
            for (int var37 = var30 - var29; var37 < var30; var37++) {
                int var38 = var37 * 128;
                for (int var39 = 0; var39 < 128; var39++) {
                    int var40 = (int) (Math.random() * 100.0D);
                    if (var40 < 50 && var39 > 10 && var39 < 118) {
                        Statics.field2786[var38 + var39] = 255;
                    } else {
                        Statics.field2786[var38 + var39] = 0;
                    }
                }
            }
            if (field667 > 0) {
                field667 -= var29 * 4;
            }
            if (field653 > 0) {
                field653 -= var29 * 4;
            }
            if (field667 == 0 && field653 == 0) {
                int var41 = (int) (Math.random() * (double) (2000 / var29));
                if (var41 == 0) {
                    field667 = 1024;
                }
                if (var41 == 1) {
                    field653 = 1024;
                }
            }
            for (int var42 = 0; var42 < var30 - var29; var42++) {
                field641[var42] = field641[var29 + var42];
            }
            for (int var43 = var30 - var29; var43 < var30; var43++) {
                field641[var43] = (int) (Math.sin((double) field649 / 14.0D) * 16.0D + Math.sin((double) field649 / 15.0D) * 14.0D + Math.sin((double) field649 / 16.0D) * 12.0D);
                field649++;
            }
            field652 += var29 * 1558181039;
            int var44 = ((client.field262 & 0x1) + var29) / 2;
            if (var44 > 0) {
                for (int var45 = 0; var45 < field652 * -407607588; var45++) {
                    int var46 = (int) (Math.random() * 124.0D) + 2;
                    int var47 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2786[(var47 << 7) + var46] = 192;
                }
                field652 = 0;
                int var48 = 0;
                label285: while (true) {
                    if (var48 >= var30) {
                        int var52 = 0;
                        while (true) {
                            if (var52 >= 128) {
                                break label285;
                            }
                            int var53 = 0;
                            for (int var54 = -var44; var54 < var30; var54++) {
                                int var55 = var54 * 128;
                                if (var44 + var54 < var30) {
                                    var53 += Statics.field645[var44 * 128 + var52 + var55];
                                }
                                if (var54 - (var44 + 1) >= 0) {
                                    var53 -= Statics.field645[var52 + var55 - (var44 + 1) * 128];
                                }
                                if (var54 >= 0) {
                                    Statics.field2786[var52 + var55] = var53 / (var44 * 2 + 1);
                                }
                            }
                            var52++;
                        }
                    }
                    int var49 = 0;
                    int var50 = var48 * 128;
                    for (int var51 = -var44; var51 < 128; var51++) {
                        if (var44 + var51 < 128) {
                            var49 += Statics.field2786[var50 + var51 + var44];
                        }
                        if (var51 - (var44 + 1) >= 0) {
                            var49 -= Statics.field2786[var50 + var51 - (var44 + 1)];
                        }
                        if (var51 >= 0) {
                            Statics.field645[var50 + var51] = var49 / (var44 * 2 + 1);
                        }
                    }
                    var48++;
                }
            }
            field648 = 0;
        }
        short var56 = 256;
        if (field667 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (field667 > 768) {
                    Statics.field2845[var57] = method1958(Statics.field2916[var57], Statics.field2130[var57], 1024 - field667);
                } else if (field667 > 256) {
                    Statics.field2845[var57] = Statics.field2130[var57];
                } else {
                    Statics.field2845[var57] = method1958(Statics.field2130[var57], Statics.field2916[var57], 256 - field667);
                }
            }
        } else if (field653 > 0) {
            for (int var58 = 0; var58 < 256; var58++) {
                if (field653 > 768) {
                    Statics.field2845[var58] = method1958(Statics.field2916[var58], Statics.field1893[var58], 1024 - field653);
                } else if (field653 > 256) {
                    Statics.field2845[var58] = Statics.field1893[var58];
                } else {
                    Statics.field2845[var58] = method1958(Statics.field1893[var58], Statics.field2916[var58], 256 - field653);
                }
            }
        } else {
            for (int var59 = 0; var59 < 256; var59++) {
                Statics.field2845[var59] = Statics.field2916[var59];
            }
        }
        class73.method1532(0, 9, 128, var56 + 7);
        Statics.field638.method1413(0, 0);
        class73.method1507();
        int var60 = 0;
        int var61 = 6885;
        for (int var62 = 1; var62 < var56 - 1; var62++) {
            int var63 = (var56 - var62) * field641[var62] / var56;
            int var64 = var63 + 22;
            if (var64 < 0) {
                var64 = 0;
            }
            var60 += var64;
            for (int var65 = var64; var65 < 128; var65++) {
                int var66 = Statics.field2786[var60++];
                if (var66 == 0) {
                    var61++;
                } else {
                    int var68 = 256 - var66;
                    int var69 = Statics.field2845[var66];
                    int var70 = Statics.field1822.field1283[var61];
                    Statics.field1822.field1283[var61++] = ((var69 & 0xFF00FF) * var66 + (var70 & 0xFF00FF) * var68 & 0xFF00FF00) + ((var69 & 0xFF00) * var66 + (var70 & 0xFF00) * var68 & 0xFF0000) >> 8;
                }
            }
            var61 += var64 + 765 - 128;
        }
        class73.method1532(637, 9, 765, var56 + 7);
        Statics.field598.method1413(382, 0);
        class73.method1507();
        int var71 = 0;
        int var72 = 7546;
        for (int var73 = 1; var73 < var56 - 1; var73++) {
            int var74 = (var56 - var73) * field641[var73] / var56;
            int var75 = 103 - var74;
            int var76 = var72 + var74;
            for (int var77 = 0; var77 < var75; var77++) {
                int var78 = Statics.field2786[var71++];
                if (var78 == 0) {
                    var76++;
                } else {
                    int var80 = 256 - var78;
                    int var81 = Statics.field2845[var78];
                    int var82 = Statics.field1822.field1283[var76];
                    Statics.field1822.field1283[var76++] = ((var81 & 0xFF00FF) * var78 + (var82 & 0xFF00FF) * var80 & 0xFF00FF00) + ((var81 & 0xFF00) * var78 + (var82 & 0xFF00) * var80 & 0xFF0000) >> 8;
                }
            }
            var71 += 128 - var75;
            var72 = 765 - var75 - var74 + var76;
        }
        Statics.field668[Statics.field559.field142 ? 1 : 0].method1564(725, 463);
        if (client.field260 > 5 && client.field497 == 0) {
            if (Statics.field673 == null) {
                Statics.field673 = class70.method732(Statics.field17, "sl_button", "");
            } else {
                byte var83 = 5;
                short var84 = 463;
                byte var85 = 100;
                byte var86 = 35;
                Statics.field673.method1564(var83, var84);
                arg0.method3305(class142.field2305 + " " + client.field402, var85 / 2 + var83, var86 / 2 + var84 - 2, 16777215, 0);
                if (Statics.field1666 == null) {
                    arg1.method3305(class142.field2384, var85 / 2 + var83, var86 / 2 + var84 + 12, 16777215, 0);
                } else {
                    arg1.method3305(class142.field2213, var85 / 2 + var83, var86 / 2 + var84 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var87 = Statics.field1523.getGraphics();
            Statics.field1822.method1332(var87, 0, 0);
        } catch (Exception var89) {
            Statics.field1523.repaint();
        }
    }

    @ObfuscatedName("f.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method125(String arg0, String arg1, String arg2) {
        field643 = arg0;
        field654 = arg1;
        field634 = arg2;
    }

    @ObfuscatedName("dt.g(Lbg;I)V")
    public static final void method2349(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field644.length; var2++) {
            Statics.field644[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field644[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field948[var8] = (Statics.field644[var8 - 1] + Statics.field644[var8 + 1] + Statics.field644[var8 - 128] + Statics.field644[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field644;
            Statics.field644 = Statics.field948;
            Statics.field948 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1310; var11++) {
            for (int var12 = 0; var12 < arg0.field1307; var12++) {
                if (arg0.field1312[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1311;
                    int var14 = var11 + 16 + arg0.field1309;
                    int var15 = (var14 << 7) + var13;
                    Statics.field644[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cb.a(IIII)I")
    public static final int method1958(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("q.x(Lgc;Lgc;I)V")
    public static void method479(class190 arg0, class190 arg1) {
        if (Statics.field2134 == null) {
            Statics.field2134 = class70.method491(Statics.field17, "sl_back", "");
        }
        if (Statics.field1273 == null) {
            Statics.field1273 = class70.method1010(Statics.field17, "sl_flags", "");
        }
        if (Statics.field2488 == null) {
            Statics.field2488 = class70.method1010(Statics.field17, "sl_arrows", "");
        }
        if (Statics.field876 == null) {
            Statics.field876 = class70.method1010(Statics.field17, "sl_stars", "");
        }
        class73.method1514(0, 23, 765, 480, 0);
        class73.method1515(0, 0, 125, 23, 12425273, 9135624);
        class73.method1515(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3305(class142.field2374, 62, 15, 0, -1);
        if (Statics.field876 != null) {
            Statics.field876[1].method1564(140, 1);
            arg1.method3303(class142.field2375, 152, 10, 16777215, -1);
            Statics.field876[0].method1564(140, 12);
            arg1.method3303(class142.field2376, 152, 21, 16777215, -1);
        }
        if (Statics.field2488 != null) {
            short var2 = 280;
            if (field663[0] == 0 && field664[0] == 0) {
                Statics.field2488[2].method1564(var2, 4);
            } else {
                Statics.field2488[0].method1564(var2, 4);
            }
            if (field663[0] == 0 && field664[0] == 1) {
                Statics.field2488[3].method1564(var2 + 15, 4);
            } else {
                Statics.field2488[1].method1564(var2 + 15, 4);
            }
            arg0.method3303(class142.field2232, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field663[0] == 1 && field664[0] == 0) {
                Statics.field2488[2].method1564(var3, 4);
            } else {
                Statics.field2488[0].method1564(var3, 4);
            }
            if (field663[0] == 1 && field664[0] == 1) {
                Statics.field2488[3].method1564(var3 + 15, 4);
            } else {
                Statics.field2488[1].method1564(var3 + 15, 4);
            }
            arg0.method3303(class142.field2176, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field663[0] == 2 && field664[0] == 0) {
                Statics.field2488[2].method1564(var4, 4);
            } else {
                Statics.field2488[0].method1564(var4, 4);
            }
            if (field663[0] == 2 && field664[0] == 1) {
                Statics.field2488[3].method1564(var4 + 15, 4);
            } else {
                Statics.field2488[1].method1564(var4 + 15, 4);
            }
            arg0.method3303(class142.field2153, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field663[0] == 3 && field664[0] == 0) {
                Statics.field2488[2].method1564(var5, 4);
            } else {
                Statics.field2488[0].method1564(var5, 4);
            }
            if (field663[0] == 3 && field664[0] == 1) {
                Statics.field2488[3].method1564(var5 + 15, 4);
            } else {
                Statics.field2488[1].method1564(var5 + 15, 4);
            }
            arg0.method3303(class142.field2380, var5 + 32, 17, 16777215, -1);
        }
        class73.method1514(708, 4, 50, 16, 0);
        arg1.method3305(class142.field2228, 733, 16, 16777215, -1);
        field665 = -1;
        if (Statics.field2134 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field661) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field661) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field661) {
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
            boolean var19 = false;
            for (int var20 = 0; var20 < field661; var20++) {
                class22 var21 = Statics.field2007[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field564);
                if (var21.field564 == -1) {
                    var23 = class142.field2190;
                    var22 = false;
                } else if (var21.field564 > 1980) {
                    var23 = class142.field2382;
                    var22 = false;
                }
                byte var24;
                if (var21.method463()) {
                    if (var21.method466()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method466()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field2005 >= var17 && class127.field2006 >= var16 && class127.field2005 < var6 + var17 && class127.field2006 < var7 + var16 && var22) {
                    field665 = var20;
                    Statics.field2134[var24].method1433(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2134[var24].method1413(var17, var16);
                }
                if (Statics.field1273 != null) {
                    Statics.field1273[(var21.method466() ? 8 : 0) + var21.field567].method1564(var17 + 29, var16);
                }
                arg0.method3305(Integer.toString(var21.field570), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3305(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3298(Statics.field2007[field665].field566) + 6;
                int var26 = arg1.field2871 + 8;
                class73.method1514(class127.field2005 - var25 / 2, class127.field2006 + 20 + 5, var25, var26, 16777120);
                class73.method1516(class127.field2005 - var25 / 2, class127.field2006 + 20 + 5, var25, var26, 0);
                arg1.method3305(Statics.field2007[field665].field566, class127.field2005, class127.field2006 + 20 + 5 + arg1.field2871 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1523.getGraphics();
            Statics.field1822.method1332(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1523.repaint();
        }
    }

    @ObfuscatedName("eh.r(Lh;B)V")
    public static void method2672(class22 arg0) {
        if (arg0.method466() != client.field256) {
            client.field256 = arg0.method466();
            boolean var1 = arg0.method466();
            if (Statics.field995 != var1) {
                class45.field996.method3141();
                class45.field1037.method3141();
                class45.field998.method3141();
                Statics.field995 = var1;
            }
        }
        Statics.field2921 = arg0.field568;
        client.field402 = arg0.field570;
        client.field431 = arg0.field563;
        Statics.field60 = client.field255 == 0 ? 43594 : arg0.field570 + 40000;
        Statics.field147 = client.field255 == 0 ? 443 : arg0.field570 + 50000;
        Statics.field168 = Statics.field60;
    }

    @ObfuscatedName("b.w(I)V")
    public static void method453() {
        try {
            if (Statics.field1666 == null) {
                Statics.field1666 = new class17(Statics.field708, new URL(Statics.field500));
            } else {
                byte[] var0 = Statics.field1666.method150();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field661 = var1.method2111();
                    Statics.field2007 = new class22[field661];
                    int var2 = 0;
                    while (var2 < field661) {
                        class22 var3 = Statics.field2007[var2] = new class22();
                        var3.field570 = var1.method2111();
                        var3.field563 = var1.method2114();
                        var3.field568 = var1.method2126();
                        var3.field566 = var1.method2126();
                        var3.field567 = var1.method2109();
                        var3.field564 = var1.method2112();
                        var3.field565 = var2++;
                    }
                    method121(Statics.field2007, 0, Statics.field2007.length - 1, field663, field664);
                    field660 = true;
                    Statics.field1666 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1666 = null;
        }
    }

    @ObfuscatedName("da.c(III)V")
    public static void method2371(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field663[var5] != arg0) {
                var2[var4] = field663[var5];
                var3[var4] = field664[var5];
                var4++;
            }
        }
        field663 = var2;
        field664 = var3;
        method121(Statics.field2007, 0, Statics.field2007.length - 1, field663, field664);
    }

    @ObfuscatedName("f.f([Lh;II[I[IB)V")
    public static void method121(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
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
                        var11 = arg0[var6].field565;
                        var12 = var8.field565;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field564;
                        var12 = var8.field564;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method466() ? 1 : 0;
                        var12 = var8.method466() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field570;
                        var12 = var8.field570;
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
                        var15 = arg0[var5].field565;
                        var16 = var8.field565;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field564;
                        var16 = var8.field564;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method466() ? 1 : 0;
                        var16 = var8.method466() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field570;
                        var16 = var8.field570;
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
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method121(arg0, arg1, var6, arg3, arg4);
        method121(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
