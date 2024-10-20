package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("an")
public class class30 {

    @ObfuscatedName("an.o")
    public static int field698 = 0;

    @ObfuscatedName("an.b")
    public static int field703 = field698 + 202;

    @ObfuscatedName("an.t")
    public static int[] field717 = new int[256];

    @ObfuscatedName("an.k")
    public static int field705 = 0;

    @ObfuscatedName("an.y")
    public static int field706 = 0;

    @ObfuscatedName("an.aq")
    public static int field707 = 0;

    @ObfuscatedName("an.an")
    public static int field708 = 0;

    @ObfuscatedName("an.ao")
    public static int field709 = 0;

    @ObfuscatedName("an.aj")
    public static int field702 = 0;

    @ObfuscatedName("an.ax")
    public static int field722 = 10;

    @ObfuscatedName("an.ac")
    public static String field712 = "";

    @ObfuscatedName("an.al")
    public static int field713 = 0;

    @ObfuscatedName("an.au")
    public static String field714 = "";

    @ObfuscatedName("an.ap")
    public static String field715 = "";

    @ObfuscatedName("an.ar")
    public static String field716 = "";

    @ObfuscatedName("an.ah")
    public static String field711 = "";

    @ObfuscatedName("an.ae")
    public static String field718 = "";

    @ObfuscatedName("an.ay")
    public static class150 field724 = class150.field2498;

    @ObfuscatedName("an.as")
    public static boolean field731 = true;

    @ObfuscatedName("an.af")
    public static int field721 = 0;

    @ObfuscatedName("an.aa")
    public static String field704 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("an.ad")
    public static String field710 = "1234567890";

    @ObfuscatedName("an.aw")
    public static boolean field725 = false;

    @ObfuscatedName("an.bb")
    public static int field726 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.n(Ljava/awt/Component;Lfd;Lfd;ZII)V")
    public static void method661(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field719) {
            field713 = arg4;
            class75.method1603();
            byte[] var5 = arg1.method2940("title.jpg", "");
            Statics.field3109 = new class74(var5, arg0);
            Statics.field701 = Statics.field3109.method1550();
            Statics.field2809 = class72.method1967(arg2, "logo", "");
            Statics.field699 = class72.method1967(arg2, "titlebox", "");
            Statics.field700 = class72.method1967(arg2, "titlebutton", "");
            Statics.field1088 = class72.method2158(arg2, "runes", "");
            Statics.field3035 = class72.method2158(arg2, "title_mute", "");
            Statics.field697 = class72.method1967(arg2, "options_radio_buttons,0", "");
            Statics.field561 = class72.method1967(arg2, "options_radio_buttons,2", "");
            Statics.field1604 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1604[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1604[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1604[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1604[var9 + 192] = 16777215;
            }
            Statics.field616 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field616[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field616[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field616[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field616[var13 + 192] = 16777215;
            }
            Statics.field554 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field554[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field554[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field554[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field554[var17 + 192] = 16777215;
            }
            Statics.field1854 = new int[256];
            Statics.field1952 = new int[32768];
            Statics.field3141 = new int[32768];
            method3((class76) null);
            Statics.field653 = new int[32768];
            Statics.field108 = new int[32768];
            if (arg3) {
                field711 = "";
                field718 = "";
            }
            Statics.field2975 = 0;
            Statics.field840 = "";
            field731 = true;
            field725 = false;
            if (Statics.field1306.field137) {
                class174.method3017(2);
            } else {
                class159 var18 = Statics.field241;
                int var19 = var18.method2944("scape main");
                int var20 = var18.method2939(var19, "");
                class174.field2863 = 1;
                Statics.field2866 = var18;
                Statics.field2868 = var19;
                Statics.field2867 = var20;
                Statics.field2859 = 255;
                Statics.field2819 = false;
                Statics.field1482 = 2;
            }
            class162.method249(false);
            Statics.field719 = true;
            field698 = (Statics.field696 - client.field492 * 765) / 2;
            field703 = field698 + 202;
            Statics.field3109.method1526(field698, 0);
            Statics.field701.method1526(field698 + 382, 0);
            Statics.field2809.method1669(field698 + 382 - Statics.field2809.field1366 / 2, 18);
        } else if (arg4 == 4) {
            field713 = 4;
        }
    }

    @ObfuscatedName("bb.a(I)V")
    public static void method1136() {
        field711 = field711.trim();
        if (field711.length() == 0) {
            method735(class148.field2454, class148.field2351, class148.field2456);
            return;
        }
        long var0 = class10.method2665();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field711;
            Random var4 = new Random();
            class111 var5 = new class111(128);
            class111 var6 = new class111(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2219(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2222(var4.nextInt());
            }
            var5.method2222(var7[0]);
            var5.method2222(var7[1]);
            var5.method2224(var0);
            var5.method2224(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2222(var4.nextInt());
            }
            var5.method2339(class10.field147, class10.field154);
            var6.method2219(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2222(var4.nextInt());
            }
            var6.method2224(var4.nextLong());
            var6.method2223(var4.nextLong());
            class141.method2559(var6);
            var6.method2224(var4.nextLong());
            var6.method2339(class10.field147, class10.field154);
            int var11 = Statics.method2179(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class111 var12 = new class111(var11);
            var12.method2225(var3);
            var12.field1890 = var11;
            var12.method2250(var7);
            class111 var13 = new class111(var12.field1890 + var6.field1890 + var5.field1890 + 5);
            var13.method2219(2);
            var13.method2219(var5.field1890);
            var13.method2285(var5.field1889, 0, var5.field1890);
            var13.method2219(var6.field1890);
            var13.method2285(var6.field1889, 0, var6.field1890);
            var13.method2220(var12.field1890);
            var13.method2285(var12.field1889, 0, var12.field1890);
            byte[] var14 = var13.field1889;
            String var15 = class152.method1142(var14, 0, var14.length);
            String var16 = var15;
            byte var23;
            try {
                URL var17 = new URL(client.method2("services", false) + "m=accountappeal/login.ws");
                URLConnection var18 = var17.openConnection();
                var18.setDoInput(true);
                var18.setDoOutput(true);
                var18.setConnectTimeout(5000);
                OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                var19.write("data2=" + class217.method1872(var16) + "&dest=" + class217.method1872("passwordchoice.ws"));
                var19.flush();
                InputStream var20 = var18.getInputStream();
                class111 var21 = new class111(new byte[1000]);
                while (true) {
                    int var22 = var20.read(var21.field1889, var21.field1890, 1000 - var21.field1890);
                    if (var22 == -1) {
                        var19.close();
                        var20.close();
                        String var24 = new String(var21.field1889);
                        if (var24.startsWith("OFFLINE")) {
                            var23 = 4;
                        } else if (var24.startsWith("WRONG")) {
                            var23 = 7;
                        } else if (var24.startsWith("RELOAD")) {
                            var23 = 3;
                        } else if (var24.startsWith("Not permitted for social network accounts.")) {
                            var23 = 6;
                        } else {
                            var21.method2431(var7);
                            while (var21.field1890 > 0 && var21.field1889[var21.field1890 - 1] == 0) {
                                var21.field1890--;
                            }
                            String var25 = new String(var21.field1889, 0, var21.field1890);
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
                                class130.method2884(var25, true, false);
                                var23 = 2;
                            } else {
                                var23 = 5;
                            }
                        }
                        break;
                    }
                    var21.field1890 += var22;
                    if (var21.field1890 >= 1000) {
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
                method735(class148.field2223, class148.field2458, class148.field2459);
                field713 = 6;
                break;
            case 3:
                method735(class148.field2460, class148.field2461, class148.field2462);
                break;
            case 4:
                method735(class148.field2416, class148.field2464, class148.field2465);
                break;
            case 5:
                method735(class148.field2466, class148.field2467, class148.field2289);
                break;
            case 6:
                method735(class148.field2469, class148.field2470, class148.field2471);
                break;
            case 7:
                method735(class148.field2472, class148.field2473, class148.field2295);
        }
    }

    @ObfuscatedName("dt.w(Lhe;Lhe;Lhe;ZB)V")
    public static void method2599(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field698 = (Statics.field696 - client.field492 * 765) / 2;
            field703 = field698 + 202;
        }
        if (field725) {
            Statics.method572(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3109.method1526(field698, 0);
            Statics.field701.method1526(field698 + 382, 0);
            Statics.field2809.method1669(field698 + 382 - Statics.field2809.field1366 / 2, 18);
        }
        if (client.field278 == 0 || client.field278 == 5) {
            byte var4 = 20;
            arg0.method3705(class148.field2237, field703 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class75.method1607(field703 + 180 - 152, var5, 304, 34, 9179409);
            class75.method1607(field703 + 180 - 151, var5 + 1, 302, 32, 0);
            class75.method1605(field703 + 180 - 150, var5 + 2, field722 * 3, 30, 9179409);
            class75.method1605(field722 * 3 + (field703 + 180 - 150), var5 + 2, 300 - field722 * 3, 30, 0);
            arg0.method3705(field712, field703 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field278 == 20) {
            Statics.field699.method1669(field703 + 180 - Statics.field699.field1366 / 2, 271 - Statics.field699.field1363 / 2);
            short var6 = 211;
            arg0.method3705(field714, field703 + 180, var6, 16776960, 0);
            int var98 = var6 + 15;
            arg0.method3705(field715, field703 + 180, var98, 16776960, 0);
            int var99 = var98 + 15;
            arg0.method3705(field716, field703 + 180, var99, 16776960, 0);
            int var100 = var99 + 15;
            int var101 = var100 + 10;
            if (field713 != 4) {
                arg0.method3640(class148.field2227, field703 + 180 - 110, var101, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field711; arg0.method3635(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3640(class214.method3639(var8), field703 + 180 - 70, var101, 16777215, 0);
                var98 = var101 + 15;
                String var10 = class148.field2233;
                String var11 = field718;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3640(var10 + var15, field703 + 180 - 108, var98, 16777215, 0);
                var98 += 15;
            }
        }
        if (client.field278 == 10 || client.field278 == 11) {
            Statics.field699.method1669(field703, 171);
            if (field713 == 0) {
                short var17 = 251;
                arg0.method3705(class148.field2444, field703 + 180, var17, 16776960, 0);
                int var102 = var17 + 30;
                int var18 = field703 + 180 - 80;
                short var19 = 291;
                Statics.field700.method1669(var18 - 73, var19 - 20);
                arg0.method3670(class148.field2445, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field703 + 180 + 80;
                Statics.field700.method1669(var20 - 73, var19 - 20);
                arg0.method3670(class148.field2483, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field713 == 1) {
                arg0.method3705(class148.field2392, field703 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3705(field714, field703 + 180, var21, 16777215, 0);
                int var103 = var21 + 15;
                arg0.method3705(field715, field703 + 180, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3705(field716, field703 + 180, var104, 16777215, 0);
                int var105 = var104 + 15;
                int var22 = field703 + 180 - 80;
                short var23 = 321;
                Statics.field700.method1669(var22 - 73, var23 - 20);
                arg0.method3705(class148.field2217, var22, var23 + 5, 16777215, 0);
                int var24 = field703 + 180 + 80;
                Statics.field700.method1669(var24 - 73, var23 - 20);
                arg0.method3705(class148.field2401, var24, var23 + 5, 16777215, 0);
            } else if (field713 == 2) {
                short var25 = 211;
                arg0.method3705(field714, field703 + 180, var25, 16776960, 0);
                int var106 = var25 + 15;
                arg0.method3705(field715, field703 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                arg0.method3705(field716, field703 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                int var109 = var108 + 10;
                arg0.method3640(class148.field2227, field703 + 180 - 110, var109, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field711; arg0.method3635(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3640(class214.method3639(var27) + (field721 == 0 & client.field280 % 40 < 20 ? class2.method2073(16776960) + class2.field17 : ""), field703 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                String var29 = class148.field2233;
                String var30 = field718;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3640(var29 + var34 + (field721 == 1 & client.field280 % 40 < 20 ? class2.method2073(16776960) + class2.field17 : ""), field703 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
                int var36 = field703 + 180 - 80;
                short var37 = 321;
                Statics.field700.method1669(var36 - 73, var37 - 20);
                arg0.method3705(class148.field2354, var36, var37 + 5, 16777215, 0);
                int var38 = field703 + 180 + 80;
                Statics.field700.method1669(var38 - 73, var37 - 20);
                arg0.method3705(class148.field2401, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3705(class148.field2449, field703 + 180, var39, 16776960, 0);
            } else if (field713 == 4) {
                arg0.method3705(class148.field2451, field703 + 180, 211, 16776960, 0);
                short var40 = 236;
                arg0.method3705(field714, field703 + 180, var40, 16777215, 0);
                int var110 = var40 + 15;
                arg0.method3705(field715, field703 + 180, var110, 16777215, 0);
                int var111 = var110 + 15;
                arg0.method3705(field716, field703 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                String var42 = class148.field2443;
                String var43 = Statics.field840;
                int var44 = var43.length();
                char[] var45 = new char[var44];
                for (int var46 = 0; var46 < var44; var46++) {
                    var45[var46] = '*';
                }
                String var47 = new String(var45);
                arg0.method3640(var42 + var47 + (client.field280 % 40 < 20 ? class2.method2073(16776960) + class2.field17 : ""), field703 + 180 - 108, var112, 16777215, 0);
                var110 = var112 - 8;
                arg0.method3640(class148.field2219, field703 + 180 - 9, var110, 16776960, 0);
                var110 += 15;
                arg0.method3640(class148.field2220, field703 + 180 - 9, var110, 16776960, 0);
                int var49 = field703 + 180 - 9 + arg0.method3635(class148.field2220) + 15;
                int var50 = var110 - arg0.field3100;
                class76 var51;
                if (field731) {
                    var51 = Statics.field561;
                } else {
                    var51 = Statics.field697;
                }
                var51.method1669(var49, var50);
                var110 += 15;
                int var52 = field703 + 180 - 80;
                short var53 = 321;
                Statics.field700.method1669(var52 - 73, var53 - 20);
                arg0.method3705(class148.field2217, var52, var53 + 5, 16777215, 0);
                int var54 = field703 + 180 + 80;
                Statics.field700.method1669(var54 - 73, var53 - 20);
                arg0.method3705(class148.field2401, var54, var53 + 5, 16777215, 0);
                arg1.method3705(class148.field2437, field703 + 180, var53 + 36, 255, 0);
            } else if (field713 == 5) {
                arg0.method3705(class148.field2450, field703 + 180, 201, 16776960, 0);
                short var55 = 221;
                arg2.method3705(field714, field703 + 180, var55, 16776960, 0);
                int var113 = var55 + 15;
                arg2.method3705(field715, field703 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg2.method3705(field716, field703 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var116 = var115 + 14;
                arg0.method3640(class148.field2455, field703 + 180 - 145, var116, 16777215, 0);
                short var56 = 174;
                String var57;
                for (var57 = field711; arg0.method3635(var57) > var56; var57 = var57.substring(1)) {
                }
                arg0.method3640(class214.method3639(var57) + (client.field280 % 40 < 20 ? class2.method2073(16776960) + class2.field17 : ""), field703 + 180 - 34, var116, 16777215, 0);
                var113 = var116 + 15;
                int var58 = field703 + 180 - 80;
                short var59 = 321;
                Statics.field700.method1669(var58 - 73, var59 - 20);
                arg0.method3705(class148.field2452, var58, var59 + 5, 16777215, 0);
                int var60 = field703 + 180 + 80;
                Statics.field700.method1669(var60 - 73, var59 - 20);
                arg0.method3705(class148.field2381, var60, var59 + 5, 16777215, 0);
            } else if (field713 == 6) {
                short var61 = 211;
                arg0.method3705(field714, field703 + 180, var61, 16776960, 0);
                int var117 = var61 + 15;
                arg0.method3705(field715, field703 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3705(field716, field703 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                int var62 = field703 + 180;
                short var63 = 321;
                Statics.field700.method1669(var62 - 73, var63 - 20);
                arg0.method3705(class148.field2381, var62, var63 + 5, 16777215, 0);
            }
        }
        if (field709 > 0) {
            method2605(field709);
            field709 = 0;
        }
        short var64 = 256;
        if (field705 > 0) {
            for (int var65 = 0; var65 < 256; var65++) {
                if (field705 > 768) {
                    Statics.field1854[var65] = method624(Statics.field1604[var65], Statics.field616[var65], 1024 - field705);
                } else if (field705 > 256) {
                    Statics.field1854[var65] = Statics.field616[var65];
                } else {
                    Statics.field1854[var65] = method624(Statics.field616[var65], Statics.field1604[var65], 256 - field705);
                }
            }
        } else if (field706 > 0) {
            for (int var66 = 0; var66 < 256; var66++) {
                if (field706 > 768) {
                    Statics.field1854[var66] = method624(Statics.field1604[var66], Statics.field554[var66], 1024 - field706);
                } else if (field706 > 256) {
                    Statics.field1854[var66] = Statics.field554[var66];
                } else {
                    Statics.field1854[var66] = method624(Statics.field554[var66], Statics.field1604[var66], 256 - field706);
                }
            }
        } else {
            for (int var67 = 0; var67 < 256; var67++) {
                Statics.field1854[var67] = Statics.field1604[var67];
            }
        }
        class75.method1658(field698, 9, field698 + 128, var64 + 7);
        Statics.field3109.method1526(field698, 0);
        class75.method1598();
        int var68 = 0;
        int var69 = field698 + Statics.field1967.field1335 * 9;
        for (int var70 = 1; var70 < var64 - 1; var70++) {
            int var71 = (var64 - var70) * field717[var70] / var64;
            int var72 = var71 + 22;
            if (var72 < 0) {
                var72 = 0;
            }
            var68 += var72;
            for (int var73 = var72; var73 < 128; var73++) {
                int var74 = Statics.field653[var68++];
                if (var74 == 0) {
                    var69++;
                } else {
                    int var76 = 256 - var74;
                    int var77 = Statics.field1854[var74];
                    int var78 = Statics.field1967.field1336[var69];
                    Statics.field1967.field1336[var69++] = ((var77 & 0xFF00FF) * var74 + (var78 & 0xFF00FF) * var76 & 0xFF00FF00) + ((var77 & 0xFF00) * var74 + (var78 & 0xFF00) * var76 & 0xFF0000) >> 8;
                }
            }
            var69 += Statics.field1967.field1335 + var72 - 128;
        }
        class75.method1658(field698 + 765 - 128, 9, field698 + 765, var64 + 7);
        Statics.field701.method1526(field698 + 382, 0);
        class75.method1598();
        int var79 = 0;
        int var80 = field698 + Statics.field1967.field1335 * 9 + 24 + 637;
        for (int var81 = 1; var81 < var64 - 1; var81++) {
            int var82 = (var64 - var81) * field717[var81] / var64;
            int var83 = 103 - var82;
            int var84 = var80 + var82;
            for (int var85 = 0; var85 < var83; var85++) {
                int var86 = Statics.field653[var79++];
                if (var86 == 0) {
                    var84++;
                } else {
                    int var88 = 256 - var86;
                    int var89 = Statics.field1854[var86];
                    int var90 = Statics.field1967.field1336[var84];
                    Statics.field1967.field1336[var84++] = ((var89 & 0xFF00) * var86 + (var90 & 0xFF00) * var88 & 0xFF0000) + ((var89 & 0xFF00FF) * var86 + (var90 & 0xFF00FF) * var88 & 0xFF00FF00) >> 8;
                }
            }
            var79 += 128 - var83;
            var80 = Statics.field1967.field1335 - var83 - var82 + var84;
        }
        Statics.field3035[Statics.field1306.field137 ? 1 : 0].method1669(field698 + 765 - 40, 463);
        if (client.field278 > 5 && client.field275 == 0) {
            if (Statics.field2002 == null) {
                Statics.field2002 = class72.method1967(Statics.field1329, "sl_button", "");
            } else {
                int var91 = field698 + 5;
                short var92 = 463;
                byte var93 = 100;
                byte var94 = 35;
                Statics.field2002.method1669(var91, var92);
                arg0.method3705(class148.field2377 + " " + client.field282, var93 / 2 + var91, var94 / 2 + var92 - 2, 16777215, 0);
                if (Statics.field190 == null) {
                    arg1.method3705(class148.field2485, var93 / 2 + var91, var94 / 2 + var92 + 12, 16777215, 0);
                } else {
                    arg1.method3705(class148.field2339, var93 / 2 + var91, var94 / 2 + var92 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var95 = Statics.field1850.getGraphics();
            Statics.field1967.method1435(var95, 0, 0);
        } catch (Exception var97) {
            Statics.field1850.repaint();
        }
    }

    @ObfuscatedName("ah.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method735(String arg0, String arg1, String arg2) {
        field714 = arg0;
        field715 = arg1;
        field716 = arg2;
    }

    @ObfuscatedName("n.h(Lbc;S)V")
    public static final void method3(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1952.length; var2++) {
            Statics.field1952[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1952[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3141[var8] = (Statics.field1952[var8 - 1] + Statics.field1952[var8 + 1] + Statics.field1952[var8 - 128] + Statics.field1952[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1952;
            Statics.field1952 = Statics.field3141;
            Statics.field3141 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1363; var11++) {
            for (int var12 = 0; var12 < arg0.field1366; var12++) {
                if (arg0.field1367[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1364;
                    int var14 = var11 + 16 + arg0.field1365;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1952[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dk.i(II)V")
    public static final void method2605(int arg0) {
        short var1 = 256;
        field707 += arg0 * 128;
        if (field707 > Statics.field1952.length) {
            field707 -= Statics.field1952.length;
            int var2 = (int) (Math.random() * 12.0D);
            method3(Statics.field1088[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field653[var3 + var4] - Statics.field1952[field707 + var3 & Statics.field1952.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field653[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field653[var9 + var10] = 255;
                } else {
                    Statics.field653[var9 + var10] = 0;
                }
            }
        }
        if (field705 > 0) {
            field705 -= arg0 * 4;
        }
        if (field706 > 0) {
            field706 -= arg0 * 4;
        }
        if (field705 == 0 && field706 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field705 = 1024;
            }
            if (var12 == 1) {
                field706 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field717[var13] = field717[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field717[var14] = (int) (Math.sin((double) field702 / 14.0D) * 16.0D + Math.sin((double) field702 / 15.0D) * 14.0D + Math.sin((double) field702 / 16.0D) * 12.0D);
            field702++;
        }
        field708 += arg0 * -903418597;
        int var15 = ((client.field280 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field708 * -1921483924; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field653[(var18 << 7) + var17] = 192;
        }
        field708 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field653[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field653[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field108[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field108[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field108[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field653[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ax.r(IIII)I")
    public static final int method624(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("df.f(Ly;I)V")
    public static void method2182(class24 arg0) {
        if (arg0.method527() != client.field273) {
            client.field273 = arg0.method527();
            class47.method2814(arg0.method527());
        }
        Statics.field1319 = arg0.field609;
        client.field282 = arg0.field613;
        client.field270 = arg0.field614;
        Statics.field869 = client.field271 == 0 ? 43594 : arg0.field613 + 40000;
        Statics.field1003 = client.field271 == 0 ? 443 : arg0.field613 + 50000;
        Statics.field622 = Statics.field869;
    }
}
