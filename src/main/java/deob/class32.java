package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("at")
public class class32 {

    @ObfuscatedName("at.q")
    public static int field735 = 0;

    @ObfuscatedName("at.b")
    public static int field716 = field735 + 202;

    @ObfuscatedName("at.x")
    public static int[] field715 = new int[256];

    @ObfuscatedName("at.k")
    public static int field718 = 0;

    @ObfuscatedName("at.f")
    public static int field719 = 0;

    @ObfuscatedName("at.ac")
    public static int field721 = 0;

    @ObfuscatedName("at.al")
    public static int field737 = 0;

    @ObfuscatedName("at.aj")
    public static int field723 = 0;

    @ObfuscatedName("at.at")
    public static int field724 = 0;

    @ObfuscatedName("at.ap")
    public static int field725 = 10;

    @ObfuscatedName("at.aa")
    public static String field726 = "";

    @ObfuscatedName("at.ak")
    public static int field730 = 0;

    @ObfuscatedName("at.an")
    public static String field728 = "";

    @ObfuscatedName("at.au")
    public static String field729 = "";

    @ObfuscatedName("at.ai")
    public static String field720 = "";

    @ObfuscatedName("at.az")
    public static String field731 = "";

    @ObfuscatedName("at.ao")
    public static String field722 = "";

    @ObfuscatedName("at.av")
    public static class159 field733 = class159.field2594;

    @ObfuscatedName("at.ax")
    public static boolean field734 = true;

    @ObfuscatedName("at.ae")
    public static int field717 = 0;

    @ObfuscatedName("at.aw")
    public static String field736 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("at.ay")
    public static String field739 = "1234567890";

    @ObfuscatedName("at.ar")
    public static boolean field732 = false;

    @ObfuscatedName("at.bt")
    public static int field708 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.n(B)I")
    public static int method803() {
        return 9;
    }

    @ObfuscatedName("ea.q(Ljava/awt/Component;Lfm;Lfm;ZII)V")
    public static void method2790(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field3143) {
            field730 = arg4;
            class80.method1693();
            byte[] var5 = arg1.method3037("title.jpg", "");
            Statics.field710 = new class79(var5, arg0);
            Statics.field711 = Statics.field710.method1595();
            if ((client.field370 & 0x20000000) == 0) {
                Statics.field712 = class77.method1510(arg2, "logo", "");
            } else {
                Statics.field712 = class77.method1510(arg2, "logo_deadman_mode", "");
            }
            Statics.field707 = class77.method1510(arg2, "titlebox", "");
            Statics.field709 = class77.method1510(arg2, "titlebutton", "");
            Statics.field706 = class77.method3005(arg2, "runes", "");
            Statics.field2633 = class77.method3005(arg2, "title_mute", "");
            Statics.field713 = class77.method1510(arg2, "options_radio_buttons,0", "");
            Statics.field768 = class77.method1510(arg2, "options_radio_buttons,2", "");
            Statics.field1022 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1022[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1022[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1022[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1022[var9 + 192] = 16777215;
            }
            Statics.field2067 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2067[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2067[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2067[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2067[var13 + 192] = 16777215;
            }
            Statics.field2122 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2122[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2122[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2122[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2122[var17 + 192] = 16777215;
            }
            Statics.field577 = new int[256];
            Statics.field2644 = new int[32768];
            Statics.field727 = new int[32768];
            method2850((class81) null);
            Statics.field762 = new int[32768];
            Statics.field3129 = new int[32768];
            if (arg3) {
                field731 = "";
                field722 = "";
            }
            Statics.field2981 = 0;
            Statics.field1523 = "";
            field734 = true;
            field732 = false;
            if (Statics.field133.field146) {
                class183.method118(2);
            } else {
                class168 var18 = Statics.field997;
                int var19 = var18.method3035("scape main");
                int var20 = var18.method3042(var19, "");
                class183.method2244(2, var18, var19, var20, 255, false);
            }
            class171.method2952(false);
            Statics.field3143 = true;
            field735 = (Statics.field963 - client.field348) / 2;
            field716 = field735 + 202;
            Statics.field710.method1617(field735, 0);
            Statics.field711.method1617(field735 + 382, 0);
            Statics.field712.method1752(field735 + 382 - Statics.field712.field1408 / 2, 18);
        } else if (arg4 == 4) {
            field730 = 4;
        }
    }

    @ObfuscatedName("ah.r(B)V")
    public static void method643() {
        field731 = field731.trim();
        if (field731.length() == 0) {
            method1481(class157.field2316, class157.field2545, class157.field2546);
            return;
        }
        long var0 = class10.method199();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field731;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2345(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2348(var4.nextInt());
            }
            var5.method2348(var7[0]);
            var5.method2348(var7[1]);
            var5.method2350(var0);
            var5.method2350(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2348(var4.nextInt());
            }
            var5.method2380(class10.field165, class10.field166);
            var6.method2345(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2348(var4.nextInt());
            }
            var6.method2350(var4.nextLong());
            var6.method2349(var4.nextLong());
            class149.method663(var6);
            var6.method2350(var4.nextLong());
            var6.method2380(class10.field165, class10.field166);
            int var11 = class119.method763(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class119 var12 = new class119(var11);
            var12.method2509(var3);
            var12.field1982 = var11;
            var12.method2376(var7);
            class119 var13 = new class119(var12.field1982 + var6.field1982 + var5.field1982 + 5);
            var13.method2345(2);
            var13.method2345(var5.field1982);
            var13.method2355(var5.field1987, 0, var5.field1982);
            var13.method2345(var6.field1982);
            var13.method2355(var6.field1987, 0, var6.field1982);
            var13.method2346(var12.field1982);
            var13.method2355(var12.field1987, 0, var12.field1982);
            byte[] var14 = var13.field1987;
            String var15 = class161.method147(var14, 0, var14.length);
            String var16 = var15;
            byte var23;
            try {
                URL var17 = new URL(client.method710("services", false) + "m=accountappeal/login.ws");
                URLConnection var18 = var17.openConnection();
                var18.setDoInput(true);
                var18.setDoOutput(true);
                var18.setConnectTimeout(5000);
                OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                var19.write("data2=" + class226.method2919(var16) + "&dest=" + class226.method2919("passwordchoice.ws"));
                var19.flush();
                InputStream var20 = var18.getInputStream();
                class119 var21 = new class119(new byte[1000]);
                while (true) {
                    int var22 = var20.read(var21.field1987, var21.field1982, 1000 - var21.field1982);
                    if (var22 == -1) {
                        var19.close();
                        var20.close();
                        String var24 = new String(var21.field1987);
                        if (var24.startsWith("OFFLINE")) {
                            var23 = 4;
                        } else if (var24.startsWith("WRONG")) {
                            var23 = 7;
                        } else if (var24.startsWith("RELOAD")) {
                            var23 = 3;
                        } else if (var24.startsWith("Not permitted for social network accounts.")) {
                            var23 = 6;
                        } else {
                            var21.method2377(var7);
                            while (var21.field1982 > 0 && var21.field1987[var21.field1982 - 1] == 0) {
                                var21.field1982--;
                            }
                            String var25 = new String(var21.field1987, 0, var21.field1982);
                            boolean var26;
                            if (var25 == null) {
                                var26 = false;
                            } else {
                                label89: {
                                    try {
                                        new URL(var25);
                                    } catch (MalformedURLException var29) {
                                        var26 = false;
                                        break label89;
                                    }
                                    var26 = true;
                                }
                            }
                            if (var26) {
                                class138.method1483(var25, true, false);
                                var23 = 2;
                            } else {
                                var23 = 5;
                            }
                        }
                        break;
                    }
                    var21.field1982 += var22;
                    if (var21.field1982 >= 1000) {
                        var23 = 5;
                        break;
                    }
                }
            } catch (Throwable var30) {
                var30.printStackTrace();
                var23 = 5;
            }
            var2 = var23;
        }
        switch(var2) {
            case 2:
                method1481(class157.field2547, class157.field2548, class157.field2549);
                field730 = 6;
                break;
            case 3:
                method1481(class157.field2550, class157.field2551, class157.field2552);
                break;
            case 4:
                method1481(class157.field2553, class157.field2459, class157.field2555);
                break;
            case 5:
                method1481(class157.field2556, class157.field2557, class157.field2558);
                break;
            case 6:
                method1481(class157.field2559, class157.field2351, class157.field2561);
                break;
            case 7:
                method1481(class157.field2544, class157.field2563, class157.field2564);
        }
    }

    @ObfuscatedName("j.u(Lhz;Lhz;Lhz;ZB)V")
    public static void method101(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field735 = (Statics.field963 - client.field348) / 2;
            field716 = field735 + 202;
        }
        if (field732) {
            if (Statics.field770 == null) {
                Statics.field770 = class77.method166(Statics.field589, "sl_back", "");
            }
            if (Statics.field1958 == null) {
                Statics.field1958 = class77.method3005(Statics.field589, "sl_flags", "");
            }
            if (Statics.field2927 == null) {
                Statics.field2927 = class77.method3005(Statics.field589, "sl_arrows", "");
            }
            if (Statics.field683 == null) {
                Statics.field683 = class77.method3005(Statics.field589, "sl_stars", "");
            }
            class80.method1689(field735, 23, 765, 480, 0);
            class80.method1748(field735, 0, 125, 23, 12425273, 9135624);
            class80.method1748(field735 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3752(class157.field2311, field735 + 62, 15, 0, -1);
            if (Statics.field683 != null) {
                Statics.field683[1].method1752(field735 + 140, 1);
                arg1.method3750(class157.field2566, field735 + 152, 10, 16777215, -1);
                Statics.field683[0].method1752(field735 + 140, 12);
                arg1.method3750(class157.field2567, field735 + 152, 21, 16777215, -1);
            }
            if (Statics.field2927 != null) {
                int var4 = field735 + 280;
                if (class26.field641[0] == 0 && class26.field640[0] == 0) {
                    Statics.field2927[2].method1752(var4, 4);
                } else {
                    Statics.field2927[0].method1752(var4, 4);
                }
                if (class26.field641[0] == 0 && class26.field640[0] == 1) {
                    Statics.field2927[3].method1752(var4 + 15, 4);
                } else {
                    Statics.field2927[1].method1752(var4 + 15, 4);
                }
                arg0.method3750(class157.field2568, var4 + 32, 17, 16777215, -1);
                int var5 = field735 + 390;
                if (class26.field641[0] == 1 && class26.field640[0] == 0) {
                    Statics.field2927[2].method1752(var5, 4);
                } else {
                    Statics.field2927[0].method1752(var5, 4);
                }
                if (class26.field641[0] == 1 && class26.field640[0] == 1) {
                    Statics.field2927[3].method1752(var5 + 15, 4);
                } else {
                    Statics.field2927[1].method1752(var5 + 15, 4);
                }
                arg0.method3750(class157.field2569, var5 + 32, 17, 16777215, -1);
                int var6 = field735 + 500;
                if (class26.field641[0] == 2 && class26.field640[0] == 0) {
                    Statics.field2927[2].method1752(var6, 4);
                } else {
                    Statics.field2927[0].method1752(var6, 4);
                }
                if (class26.field641[0] == 2 && class26.field640[0] == 1) {
                    Statics.field2927[3].method1752(var6 + 15, 4);
                } else {
                    Statics.field2927[1].method1752(var6 + 15, 4);
                }
                arg0.method3750(class157.field2534, var6 + 32, 17, 16777215, -1);
                int var7 = field735 + 610;
                if (class26.field641[0] == 3 && class26.field640[0] == 0) {
                    Statics.field2927[2].method1752(var7, 4);
                } else {
                    Statics.field2927[0].method1752(var7, 4);
                }
                if (class26.field641[0] == 3 && class26.field640[0] == 1) {
                    Statics.field2927[3].method1752(var7 + 15, 4);
                } else {
                    Statics.field2927[1].method1752(var7 + 15, 4);
                }
                arg0.method3750(class157.field2571, var7 + 32, 17, 16777215, -1);
            }
            class80.method1689(field735 + 708, 4, 50, 16, 0);
            arg1.method3752(class157.field2533, field735 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field370 & var9;
            for (int var11 = 0; var11 < class26.field638; var11++) {
                class26 var12 = Statics.field1157[var11];
                if ((var12.field649 & var9) == var10 || (var12.field649 & var9) == 0) {
                    var8++;
                }
            }
            field708 = -1;
            if (Statics.field770 != null) {
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
                int var24 = field735 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field638; var27++) {
                    class26 var28 = Statics.field1157[var27];
                    if ((var28.field649 & var9) == var10 || (var28.field649 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field645);
                        if (var28.field645 == -1) {
                            var30 = class157.field2572;
                            var29 = false;
                        } else if (var28.field645 > 1980) {
                            var30 = class157.field2573;
                            var29 = false;
                        }
                        int var31 = 0;
                        byte var32;
                        if (var28.method609()) {
                            var31 = 16711680;
                            if (var28.method615()) {
                                var32 = 5;
                            } else {
                                var32 = 4;
                            }
                        } else if (var28.method633()) {
                            if (var28.method615()) {
                                var32 = 3;
                            } else {
                                var32 = 2;
                            }
                        } else if (var28.method615()) {
                            var32 = 1;
                        } else {
                            var32 = 0;
                        }
                        if (class140.field2134 >= var24 && class140.field2135 >= var23 && class140.field2134 < var13 + var24 && class140.field2135 < var14 + var23 && var29) {
                            field708 = var27;
                            Statics.field770[var32].method1611(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field770[var32].method1617(var24, var23);
                        }
                        if (Statics.field1958 != null) {
                            Statics.field1958[(var28.method615() ? 8 : 0) + var28.field648].method1752(var24 + 29, var23);
                        }
                        arg0.method3752(Integer.toString(var28.field651), var24 + 15, var14 / 2 + var23 + 5, var31, -1);
                        arg1.method3752(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var33 = arg1.method3745(Statics.field1157[field708].field647) + 6;
                    int var34 = arg1.field3178 + 8;
                    class80.method1689(class140.field2134 - var33 / 2, class140.field2135 + 20 + 5, var33, var34, 16777120);
                    class80.method1694(class140.field2134 - var33 / 2, class140.field2135 + 20 + 5, var33, var34, 0);
                    arg1.method3752(Statics.field1157[field708].field647, class140.field2134, class140.field2135 + 20 + 5 + arg1.field3178 + 4, 0, -1);
                }
            }
            try {
                Graphics var35 = Statics.field1886.getGraphics();
                Statics.field945.method1514(var35, 0, 0);
            } catch (Exception var135) {
                Statics.field1886.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field710.method1617(field735, 0);
            Statics.field711.method1617(field735 + 382, 0);
            Statics.field712.method1752(field735 + 382 - Statics.field712.field1408 / 2, 18);
        }
        if (client.field408 == 0 || client.field408 == 5) {
            byte var37 = 20;
            arg0.method3752(class157.field2507, field716 + 180, 245 - var37, 16777215, -1);
            int var38 = 253 - var37;
            class80.method1694(field716 + 180 - 152, var38, 304, 34, 9179409);
            class80.method1694(field716 + 180 - 151, var38 + 1, 302, 32, 0);
            class80.method1689(field716 + 180 - 150, var38 + 2, field725 * 3, 30, 9179409);
            class80.method1689(field725 * 3 + (field716 + 180 - 150), var38 + 2, 300 - field725 * 3, 30, 0);
            arg0.method3752(field726, field716 + 180, 276 - var37, 16777215, -1);
        }
        if (client.field408 == 20) {
            Statics.field707.method1752(field716 + 180 - Statics.field707.field1408 / 2, 271 - Statics.field707.field1409 / 2);
            short var39 = 211;
            arg0.method3752(field728, field716 + 180, var39, 16776960, 0);
            int var137 = var39 + 15;
            arg0.method3752(field729, field716 + 180, var137, 16776960, 0);
            int var138 = var137 + 15;
            arg0.method3752(field720, field716 + 180, var138, 16776960, 0);
            int var139 = var138 + 15;
            int var140 = var139 + 10;
            if (field730 != 4) {
                arg0.method3750(class157.field2526, field716 + 180 - 110, var140, 16777215, 0);
                short var40 = 200;
                String var41;
                for (var41 = field731; arg0.method3745(var41) > var40; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method3750(class223.method3749(var41), field716 + 180 - 70, var140, 16777215, 0);
                var137 = var140 + 15;
                String var43 = class157.field2352;
                String var44 = field722;
                int var45 = var44.length();
                char[] var46 = new char[var45];
                for (int var47 = 0; var47 < var45; var47++) {
                    var46[var47] = '*';
                }
                String var48 = new String(var46);
                arg0.method3750(var43 + var48, field716 + 180 - 108, var137, 16777215, 0);
                var137 += 15;
            }
        }
        if (client.field408 == 10 || client.field408 == 11) {
            Statics.field707.method1752(field716, 171);
            if (field730 == 0) {
                short var50 = 251;
                arg0.method3752(class157.field2529, field716 + 180, var50, 16776960, 0);
                int var141 = var50 + 30;
                int var51 = field716 + 180 - 80;
                short var52 = 291;
                Statics.field709.method1752(var51 - 73, var52 - 20);
                arg0.method3753(class157.field2562, var51 - 73, var52 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var53 = field716 + 180 + 80;
                Statics.field709.method1752(var53 - 73, var52 - 20);
                arg0.method3753(class157.field2531, var53 - 73, var52 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field730 == 1) {
                arg0.method3752(class157.field2511, field716 + 180, 211, 16776960, 0);
                short var54 = 236;
                arg0.method3752(field728, field716 + 180, var54, 16777215, 0);
                int var142 = var54 + 15;
                arg0.method3752(field729, field716 + 180, var142, 16777215, 0);
                int var143 = var142 + 15;
                arg0.method3752(field720, field716 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                int var55 = field716 + 180 - 80;
                short var56 = 321;
                Statics.field709.method1752(var55 - 73, var56 - 20);
                arg0.method3752(class157.field2305, var55, var56 + 5, 16777215, 0);
                int var57 = field716 + 180 + 80;
                Statics.field709.method1752(var57 - 73, var56 - 20);
                arg0.method3752(class157.field2533, var57, var56 + 5, 16777215, 0);
            } else if (field730 == 2) {
                short var58 = 211;
                arg0.method3752(field728, field716 + 180, var58, 16776960, 0);
                int var145 = var58 + 15;
                arg0.method3752(field729, field716 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                arg0.method3752(field720, field716 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                int var148 = var147 + 10;
                arg0.method3750(class157.field2526, field716 + 180 - 110, var148, 16777215, 0);
                short var59 = 200;
                String var60;
                for (var60 = field731; arg0.method3745(var60) > var59; var60 = var60.substring(1)) {
                }
                arg0.method3750(class223.method3749(var60) + (field717 == 0 & client.field303 % 40 < 20 ? class2.method2295(16776960) + class2.field18 : ""), field716 + 180 - 70, var148, 16777215, 0);
                var145 = var148 + 15;
                String var62 = class157.field2352;
                String var63 = field722;
                int var64 = var63.length();
                char[] var65 = new char[var64];
                for (int var66 = 0; var66 < var64; var66++) {
                    var65[var66] = '*';
                }
                String var67 = new String(var65);
                arg0.method3750(var62 + var67 + (field717 == 1 & client.field303 % 40 < 20 ? class2.method2295(16776960) + class2.field18 : ""), field716 + 180 - 108, var145, 16777215, 0);
                var145 += 15;
                int var69 = field716 + 180 - 80;
                short var70 = 321;
                Statics.field709.method1752(var69 - 73, var70 - 20);
                arg0.method3752(class157.field2532, var69, var70 + 5, 16777215, 0);
                int var71 = field716 + 180 + 80;
                Statics.field709.method1752(var71 - 73, var70 - 20);
                arg0.method3752(class157.field2533, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                arg1.method3752(class157.field2539, field716 + 180, var72, 16776960, 0);
            } else if (field730 == 3) {
                short var73 = 201;
                arg0.method3752(class157.field2410, field716 + 180, var73, 16776960, 0);
                int var149 = var73 + 20;
                arg1.method3752(class157.field2434, field716 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg1.method3752(class157.field2536, field716 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                int var74 = field716 + 180;
                short var75 = 276;
                Statics.field709.method1752(var74 - 73, var75 - 20);
                arg2.method3752(class157.field2537, var74, var75 + 5, 16777215, 0);
                int var76 = field716 + 180;
                short var77 = 326;
                Statics.field709.method1752(var76 - 73, var77 - 20);
                arg2.method3752(class157.field2538, var76, var77 + 5, 16777215, 0);
            } else if (field730 == 4) {
                arg0.method3752(class157.field2521, field716 + 180, 211, 16776960, 0);
                short var78 = 236;
                arg0.method3752(field728, field716 + 180, var78, 16777215, 0);
                int var152 = var78 + 15;
                arg0.method3752(field729, field716 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                arg0.method3752(field720, field716 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                String var80 = class157.field2412;
                String var81 = Statics.field1523;
                int var82 = var81.length();
                char[] var83 = new char[var82];
                for (int var84 = 0; var84 < var82; var84++) {
                    var83[var84] = '*';
                }
                String var85 = new String(var83);
                arg0.method3750(var80 + var85 + (client.field303 % 40 < 20 ? class2.method2295(16776960) + class2.field18 : ""), field716 + 180 - 108, var154, 16777215, 0);
                var152 = var154 - 8;
                arg0.method3750(class157.field2307, field716 + 180 - 9, var152, 16776960, 0);
                var152 += 15;
                arg0.method3750(class157.field2308, field716 + 180 - 9, var152, 16776960, 0);
                int var87 = field716 + 180 - 9 + arg0.method3745(class157.field2308) + 15;
                int var88 = var152 - arg0.field3178;
                class81 var89;
                if (field734) {
                    var89 = Statics.field768;
                } else {
                    var89 = Statics.field713;
                }
                var89.method1752(var87, var88);
                var152 += 15;
                int var90 = field716 + 180 - 80;
                short var91 = 321;
                Statics.field709.method1752(var90 - 73, var91 - 20);
                arg0.method3752(class157.field2305, var90, var91 + 5, 16777215, 0);
                int var92 = field716 + 180 + 80;
                Statics.field709.method1752(var92 - 73, var91 - 20);
                arg0.method3752(class157.field2533, var92, var91 + 5, 16777215, 0);
                arg1.method3752(class157.field2357, field716 + 180, var91 + 36, 255, 0);
            } else if (field730 == 5) {
                arg0.method3752(class157.field2540, field716 + 180, 201, 16776960, 0);
                short var93 = 221;
                arg2.method3752(field728, field716 + 180, var93, 16776960, 0);
                int var155 = var93 + 15;
                arg2.method3752(field729, field716 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg2.method3752(field720, field716 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var158 = var157 + 14;
                arg0.method3750(class157.field2541, field716 + 180 - 145, var158, 16777215, 0);
                short var94 = 174;
                String var95;
                for (var95 = field731; arg0.method3745(var95) > var94; var95 = var95.substring(1)) {
                }
                arg0.method3750(class223.method3749(var95) + (client.field303 % 40 < 20 ? class2.method2295(16776960) + class2.field18 : ""), field716 + 180 - 34, var158, 16777215, 0);
                var155 = var158 + 15;
                int var96 = field716 + 180 - 80;
                short var97 = 321;
                Statics.field709.method1752(var96 - 73, var97 - 20);
                arg0.method3752(class157.field2454, var96, var97 + 5, 16777215, 0);
                int var98 = field716 + 180 + 80;
                Statics.field709.method1752(var98 - 73, var97 - 20);
                arg0.method3752(class157.field2490, var98, var97 + 5, 16777215, 0);
            } else if (field730 == 6) {
                short var99 = 211;
                arg0.method3752(field728, field716 + 180, var99, 16776960, 0);
                int var159 = var99 + 15;
                arg0.method3752(field729, field716 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg0.method3752(field720, field716 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var100 = field716 + 180;
                short var101 = 321;
                Statics.field709.method1752(var100 - 73, var101 - 20);
                arg0.method3752(class157.field2490, var100, var101 + 5, 16777215, 0);
            }
        }
        if (field723 > 0) {
            method161(field723);
            field723 = 0;
        }
        short var102 = 256;
        if (field718 > 0) {
            for (int var103 = 0; var103 < 256; var103++) {
                if (field718 > 768) {
                    Statics.field577[var103] = method996(Statics.field1022[var103], Statics.field2067[var103], 1024 - field718);
                } else if (field718 > 256) {
                    Statics.field577[var103] = Statics.field2067[var103];
                } else {
                    Statics.field577[var103] = method996(Statics.field2067[var103], Statics.field1022[var103], 256 - field718);
                }
            }
        } else if (field719 > 0) {
            for (int var104 = 0; var104 < 256; var104++) {
                if (field719 > 768) {
                    Statics.field577[var104] = method996(Statics.field1022[var104], Statics.field2122[var104], 1024 - field719);
                } else if (field719 > 256) {
                    Statics.field577[var104] = Statics.field2122[var104];
                } else {
                    Statics.field577[var104] = method996(Statics.field2122[var104], Statics.field1022[var104], 256 - field719);
                }
            }
        } else {
            for (int var105 = 0; var105 < 256; var105++) {
                Statics.field577[var105] = Statics.field1022[var105];
            }
        }
        class80.method1686(field735, 9, field735 + 128, var102 + 7);
        Statics.field710.method1617(field735, 0);
        class80.method1692();
        int var106 = 0;
        int var107 = field735 + Statics.field945.field1381 * 9;
        for (int var108 = 1; var108 < var102 - 1; var108++) {
            int var109 = (var102 - var108) * field715[var108] / var102;
            int var110 = var109 + 22;
            if (var110 < 0) {
                var110 = 0;
            }
            var106 += var110;
            for (int var111 = var110; var111 < 128; var111++) {
                int var112 = Statics.field762[var106++];
                if (var112 == 0) {
                    var107++;
                } else {
                    int var114 = 256 - var112;
                    int var115 = Statics.field577[var112];
                    int var116 = Statics.field945.field1384[var107];
                    Statics.field945.field1384[var107++] = ((var115 & 0xFF00FF) * var112 + (var116 & 0xFF00FF) * var114 & 0xFF00FF00) + ((var115 & 0xFF00) * var112 + (var116 & 0xFF00) * var114 & 0xFF0000) >> 8;
                }
            }
            var107 += Statics.field945.field1381 + var110 - 128;
        }
        class80.method1686(field735 + 765 - 128, 9, field735 + 765, var102 + 7);
        Statics.field711.method1617(field735 + 382, 0);
        class80.method1692();
        int var117 = 0;
        int var118 = field735 + Statics.field945.field1381 * 9 + 24 + 637;
        for (int var119 = 1; var119 < var102 - 1; var119++) {
            int var120 = (var102 - var119) * field715[var119] / var102;
            int var121 = 103 - var120;
            int var122 = var118 + var120;
            for (int var123 = 0; var123 < var121; var123++) {
                int var124 = Statics.field762[var117++];
                if (var124 == 0) {
                    var122++;
                } else {
                    int var126 = 256 - var124;
                    int var127 = Statics.field577[var124];
                    int var128 = Statics.field945.field1384[var122];
                    Statics.field945.field1384[var122++] = ((var127 & 0xFF00FF) * var124 + (var128 & 0xFF00FF) * var126 & 0xFF00FF00) + ((var127 & 0xFF00) * var124 + (var128 & 0xFF00) * var126 & 0xFF0000) >> 8;
                }
            }
            var117 += 128 - var121;
            var118 = Statics.field945.field1381 - var121 - var120 + var122;
        }
        Statics.field2633[Statics.field133.field146 ? 1 : 0].method1752(field735 + 765 - 40, 463);
        if (client.field408 > 5 && client.field300 == 0) {
            if (Statics.field105 == null) {
                Statics.field105 = class77.method1510(Statics.field589, "sl_button", "");
            } else {
                int var129 = field735 + 5;
                short var130 = 463;
                byte var131 = 100;
                byte var132 = 35;
                Statics.field105.method1752(var129, var130);
                arg0.method3752(class157.field2463 + " " + client.field295, var131 / 2 + var129, var132 / 2 + var130 - 2, 16777215, 0);
                if (Statics.field642 == null) {
                    arg1.method3752(class157.field2570, var131 / 2 + var129, var132 / 2 + var130 + 12, 16777215, 0);
                } else {
                    arg1.method3752(class157.field2574, var131 / 2 + var129, var132 / 2 + var130 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var133 = Statics.field1886.getGraphics();
            Statics.field945.method1514(var133, 0, 0);
        } catch (Exception var136) {
            Statics.field1886.repaint();
        }
    }

    @ObfuscatedName("bf.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1481(String arg0, String arg1, String arg2) {
        field728 = arg0;
        field729 = arg1;
        field720 = arg2;
    }

    @ObfuscatedName("ed.w(Lcu;I)V")
    public static final void method2850(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2644.length; var2++) {
            Statics.field2644[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2644[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field727[var8] = (Statics.field2644[var8 - 1] + Statics.field2644[var8 + 1] + Statics.field2644[var8 - 128] + Statics.field2644[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2644;
            Statics.field2644 = Statics.field727;
            Statics.field727 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1409; var11++) {
            for (int var12 = 0; var12 < arg0.field1408; var12++) {
                if (arg0.field1407[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1406;
                    int var14 = var11 + 16 + arg0.field1411;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2644[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("p.y(IB)V")
    public static final void method161(int arg0) {
        short var1 = 256;
        field721 += arg0 * 128;
        if (field721 > Statics.field2644.length) {
            field721 -= Statics.field2644.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2850(Statics.field706[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field762[var3 + var4] - Statics.field2644[field721 + var3 & Statics.field2644.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field762[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field762[var9 + var10] = 255;
                } else {
                    Statics.field762[var9 + var10] = 0;
                }
            }
        }
        if (field718 > 0) {
            field718 -= arg0 * 4;
        }
        if (field719 > 0) {
            field719 -= arg0 * 4;
        }
        if (field718 == 0 && field719 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field718 = 1024;
            }
            if (var12 == 1) {
                field719 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field715[var13] = field715[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field715[var14] = (int) (Math.sin((double) field724 / 14.0D) * 16.0D + Math.sin((double) field724 / 15.0D) * 14.0D + Math.sin((double) field724 / 16.0D) * 12.0D);
            field724++;
        }
        field737 += arg0 * -1888087633;
        int var15 = ((client.field303 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field737 * -1568828708; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field762[(var18 << 7) + var17] = 192;
        }
        field737 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field762[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field762[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field3129[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field3129[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field3129[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field762[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ar.o(IIII)I")
    public static final int method996(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("e.h(Lev;I)V")
    public static void method146(class144 arg0) {
        if (class140.field2140 != 1 && Statics.field2634 || class140.field2140 != 4) {
            return;
        }
        int var1 = field735 + 280;
        if (class140.field2128 >= var1 && class140.field2128 <= var1 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(0, 0);
            return;
        }
        if (class140.field2128 >= var1 + 15 && class140.field2128 <= var1 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(0, 1);
            return;
        }
        int var2 = field735 + 390;
        if (class140.field2128 >= var2 && class140.field2128 <= var2 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(1, 0);
            return;
        }
        if (class140.field2128 >= var2 + 15 && class140.field2128 <= var2 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(1, 1);
            return;
        }
        int var3 = field735 + 500;
        if (class140.field2128 >= var3 && class140.field2128 <= var3 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(2, 0);
            return;
        }
        if (class140.field2128 >= var3 + 15 && class140.field2128 <= var3 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(2, 1);
            return;
        }
        int var4 = field735 + 610;
        if (class140.field2128 >= var4 && class140.field2128 <= var4 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(3, 0);
            return;
        }
        if (class140.field2128 >= var4 + 15 && class140.field2128 <= var4 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
            class26.method130(3, 1);
            return;
        }
        if (class140.field2128 >= field735 + 708 && class140.field2143 >= 4 && class140.field2128 <= field735 + 708 + 50 && class140.field2143 <= 20) {
            field732 = false;
            Statics.field710.method1617(field735, 0);
            Statics.field711.method1617(field735 + 382, 0);
            Statics.field712.method1752(field735 + 382 - Statics.field712.field1408 / 2, 18);
            return;
        }
        if (field708 == -1) {
            return;
        }
        class26 var5 = Statics.field1157[field708];
        method38(var5);
        field732 = false;
        Statics.field710.method1617(field735, 0);
        Statics.field711.method1617(field735 + 382, 0);
        Statics.field712.method1752(field735 + 382 - Statics.field712.field1408 / 2, 18);
        return;
    }

    @ObfuscatedName("l.e(Li;B)V")
    public static void method38(class26 arg0) {
        if (arg0.method615() != client.field366) {
            client.field366 = arg0.method615();
            class52.method191(arg0.method615());
        }
        Statics.field79 = arg0.field646;
        client.field295 = arg0.field651;
        client.field370 = arg0.field649;
        Statics.field1949 = client.field297 == 0 ? 43594 : arg0.field651 + 40000;
        Statics.field2000 = client.field297 == 0 ? 443 : arg0.field651 + 50000;
        Statics.field2173 = Statics.field1949;
    }

    @ObfuscatedName("au.v(I)V")
    public static void method746() {
        if (class26.method731()) {
            field732 = true;
        }
    }
}
