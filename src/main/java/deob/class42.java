package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("af")
public class class42 {

    @ObfuscatedName("af.c")
    public static int field815 = 0;

    @ObfuscatedName("af.p")
    public static int field840 = field815 + 202;

    @ObfuscatedName("af.i")
    public static int[] field821 = new int[256];

    @ObfuscatedName("af.q")
    public static int field830 = 0;

    @ObfuscatedName("af.y")
    public static int field824 = 0;

    @ObfuscatedName("af.ad")
    public static int field825 = 0;

    @ObfuscatedName("af.aa")
    public static int field839 = 0;

    @ObfuscatedName("af.ao")
    public static int field827 = 0;

    @ObfuscatedName("af.ax")
    public static int field828 = 0;

    @ObfuscatedName("af.ae")
    public static int field829 = 10;

    @ObfuscatedName("af.al")
    public static String field823 = "";

    @ObfuscatedName("af.an")
    public static int field831 = 0;

    @ObfuscatedName("af.aw")
    public static String field832 = "";

    @ObfuscatedName("af.ah")
    public static String field833 = "";

    @ObfuscatedName("af.ar")
    public static String field837 = "";

    @ObfuscatedName("af.ay")
    public static String field835 = "";

    @ObfuscatedName("af.as")
    public static String field836 = "";

    @ObfuscatedName("af.aq")
    public static String field811 = "";

    @ObfuscatedName("af.af")
    public static class98 field848 = class98.field1637;

    @ObfuscatedName("af.ac")
    public static boolean field838 = true;

    @ObfuscatedName("af.at")
    public static int field834 = 0;

    @ObfuscatedName("af.av")
    public static String field842 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("af.am")
    public static String field843 = "1234567890";

    @ObfuscatedName("af.au")
    public static boolean field845 = false;

    @ObfuscatedName("af.bs")
    public static int field847 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.s(Lgp;Lgp;I)I")
    public static int method1771(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3042("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3042("logo", "")) {
            var2++;
        }
        if (arg1.method3042("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3042("titlebox", "")) {
            var2++;
        }
        if (arg1.method3042("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3042("runes", "")) {
            var2++;
        }
        if (arg1.method3042("title_mute", "")) {
            var2++;
        }
        if (arg1.method3052("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3052("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3042("sl_back", "");
        arg1.method3042("sl_flags", "");
        arg1.method3042("sl_arrows", "");
        arg1.method3042("sl_stars", "");
        arg1.method3042("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ao.c(Ljava/awt/Component;Lgp;Lgp;ZII)V")
    public static void method645(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field813) {
            field831 = arg4;
            class220.method3659();
            byte[] var5 = arg1.method3003("title.jpg", "");
            Statics.field816 = new class225(var5, arg0);
            Statics.field799 = Statics.field816.method3792();
            if ((client.field376 & 0x20000000) == 0) {
                Statics.field817 = class226.method1746(arg2, "logo", "");
            } else {
                Statics.field817 = class226.method1746(arg2, "logo_deadman_mode", "");
            }
            Statics.field820 = class226.method1746(arg2, "titlebox", "");
            Statics.field841 = class226.method1746(arg2, "titlebutton", "");
            Statics.field812 = class226.method1749(arg2, "runes", "");
            Statics.field2130 = class226.method1749(arg2, "title_mute", "");
            Statics.field818 = class226.method1746(arg2, "options_radio_buttons,0", "");
            Statics.field819 = class226.method1746(arg2, "options_radio_buttons,2", "");
            Statics.field1631 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1631[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1631[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1631[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1631[var9 + 192] = 16777215;
            }
            Statics.field1465 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1465[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1465[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1465[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1465[var13 + 192] = 16777215;
            }
            Statics.field822 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field822[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field822[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field822[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field822[var17 + 192] = 16777215;
            }
            Statics.field2032 = new int[256];
            Statics.field772 = new int[32768];
            Statics.field3194 = new int[32768];
            method147((class223) null);
            Statics.field3077 = new int[32768];
            Statics.field1471 = new int[32768];
            if (arg3) {
                field836 = "";
                field811 = "";
            }
            Statics.field109 = 0;
            Statics.field826 = "";
            field838 = true;
            field845 = false;
            if (Statics.field795.field703) {
                class139.method1747(2);
            } else {
                class185 var18 = Statics.field2171;
                int var19 = var18.method3001("scape main");
                int var20 = var18.method3002(var19, "");
                class139.field1934 = 1;
                Statics.field968 = var18;
                Statics.field1299 = var19;
                Statics.field3098 = var20;
                Statics.field1922 = 255;
                Statics.field1928 = false;
                Statics.field1927 = 2;
            }
            class186.method3070(false);
            Statics.field813 = true;
            field815 = (Statics.field187 - client.field356 * 765) / 2;
            field840 = field815 + 202;
            Statics.field816.method3742(field815, 0);
            Statics.field799.method3742(field815 + 382, 0);
            Statics.field817.method3699(field815 + 382 - Statics.field817.field3198 / 2, 18);
        } else if (arg4 == 4) {
            field831 = 4;
        }
    }

    @ObfuscatedName("ao.f(S)V")
    public static void method647() {
        if (!Statics.field813) {
            return;
        }
        Statics.field820 = null;
        Statics.field841 = null;
        Statics.field812 = null;
        Statics.field816 = null;
        Statics.field799 = null;
        Statics.field817 = null;
        Statics.field2130 = null;
        Statics.field818 = null;
        Statics.field819 = null;
        Statics.field223 = null;
        Statics.field1463 = null;
        Statics.field1427 = null;
        Statics.field846 = null;
        Statics.field2772 = null;
        Statics.field1631 = null;
        Statics.field1465 = null;
        Statics.field822 = null;
        Statics.field2032 = null;
        Statics.field772 = null;
        Statics.field3194 = null;
        Statics.field3077 = null;
        Statics.field1471 = null;
        class139.method1747(2);
        class186.method3070(true);
        Statics.field813 = false;
    }

    @ObfuscatedName("r.k(I)V")
    public static void method121() {
        field836 = field836.trim();
        if (field836.length() == 0) {
            method9(class174.field2539, class174.field2616, class174.field2617);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2483("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class154 var4 = new class154(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2100, var4.field2098, 1000 - var4.field2098);
                if (var5 == -1) {
                    var4.field2098 = 0;
                    long var8 = var4.method2551();
                    var6 = var8;
                    break;
                }
                var4.field2098 += var5;
                if (var4.field2098 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var48) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field836;
            Random var15 = new Random();
            class154 var16 = new class154(128);
            class154 var17 = new class154(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2531(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2534(var15.nextInt());
            }
            var16.method2534(var18[0]);
            var16.method2534(var18[1]);
            var16.method2536(var6);
            var16.method2536(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2534(var15.nextInt());
            }
            var16.method2566(class37.field767, class37.field768);
            var17.method2531(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2534(var15.nextInt());
            }
            var17.method2536(var15.nextLong());
            var17.method2535(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class105.field1685.method1273(0L);
                class105.field1685.method1272(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var47) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2570(var22, 0, 24);
            var17.method2536(var15.nextLong());
            var17.method2566(class37.field767, class37.field768);
            int var26 = var14.length() + 1;
            int var27 = var26;
            if (var26 % 8 != 0) {
                var27 = 8 - var26 % 8 + var26;
            }
            class154 var28 = new class154(var27);
            var28.method2537(var14);
            var28.field2098 = var27;
            var28.method2562(var18);
            class154 var29 = new class154(var28.field2098 + var17.field2098 + var16.field2098 + 5);
            var29.method2531(2);
            var29.method2531(var16.field2098);
            var29.method2570(var16.field2100, 0, var16.field2098);
            var29.method2531(var17.field2098);
            var29.method2570(var17.field2100, 0, var17.field2098);
            var29.method2532(var28.field2098);
            var29.method2570(var28.field2100, 0, var28.field2098);
            byte[] var30 = var29.field2100;
            String var31 = class207.method2961(var30, 0, var30.length);
            String var32 = var31;
            byte var39;
            try {
                URL var33 = new URL(client.method2483("services", false) + "m=accountappeal/login.ws");
                URLConnection var34 = var33.openConnection();
                var34.setDoInput(true);
                var34.setDoOutput(true);
                var34.setConnectTimeout(5000);
                OutputStreamWriter var35 = new OutputStreamWriter(var34.getOutputStream());
                var35.write("data2=" + class232.method2076(var32) + "&dest=" + class232.method2076("passwordchoice.ws"));
                var35.flush();
                InputStream var36 = var34.getInputStream();
                class154 var37 = new class154(new byte[1000]);
                while (true) {
                    int var38 = var36.read(var37.field2100, var37.field2098, 1000 - var37.field2098);
                    if (var38 == -1) {
                        var35.close();
                        var36.close();
                        String var40 = new String(var37.field2100);
                        if (var40.startsWith("OFFLINE")) {
                            var39 = 4;
                        } else if (var40.startsWith("WRONG")) {
                            var39 = 7;
                        } else if (var40.startsWith("RELOAD")) {
                            var39 = 3;
                        } else if (var40.startsWith("Not permitted for social network accounts.")) {
                            var39 = 6;
                        } else {
                            var37.method2569(var18);
                            while (var37.field2098 > 0 && var37.field2100[var37.field2098 - 1] == 0) {
                                var37.field2098--;
                            }
                            String var41 = new String(var37.field2100, 0, var37.field2098);
                            boolean var42;
                            if (var41 == null) {
                                var42 = false;
                            } else {
                                label114: {
                                    try {
                                        new URL(var41);
                                    } catch (MalformedURLException var45) {
                                        var42 = false;
                                        break label114;
                                    }
                                    var42 = true;
                                }
                            }
                            if (var42) {
                                class115.method833(var41, true, false);
                                var39 = 2;
                            } else {
                                var39 = 5;
                            }
                        }
                        break;
                    }
                    var37.field2098 += var38;
                    if (var37.field2098 >= 1000) {
                        var39 = 5;
                        break;
                    }
                }
            } catch (Throwable var46) {
                var46.printStackTrace();
                var39 = 5;
            }
            var13 = var39;
        }
        switch(var13) {
            case 2:
                method9(class174.field2618, class174.field2628, class174.field2620);
                field831 = 6;
                break;
            case 3:
                method9(class174.field2621, class174.field2551, class174.field2623);
                break;
            case 4:
                method9(class174.field2624, class174.field2374, class174.field2626);
                break;
            case 5:
                method9(class174.field2627, class174.field2563, class174.field2385);
                break;
            case 6:
                method9(class174.field2516, class174.field2511, class174.field2632);
                break;
            case 7:
                method9(class174.field2633, class174.field2634, class174.field2635);
        }
    }

    @ObfuscatedName("ct.u(Lhi;Lhi;Lhi;ZI)V")
    public static void method1576(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field815 = (Statics.field187 - client.field356 * 765) / 2;
            field840 = field815 + 202;
        }
        if (field845) {
            method2081(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field816.method3742(field815, 0);
            Statics.field799.method3742(field815 + 382, 0);
            Statics.field817.method3699(field815 + 382 - Statics.field817.field3198 / 2, 18);
        }
        if (client.field302 == 0 || client.field302 == 5) {
            byte var4 = 20;
            arg0.method3534(class174.field2615, field840 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class220.method3654(field840 + 180 - 152, var5, 304, 34, 9179409);
            class220.method3654(field840 + 180 - 151, var5 + 1, 302, 32, 0);
            class220.method3667(field840 + 180 - 150, var5 + 2, field829 * 3, 30, 9179409);
            class220.method3667(field829 * 3 + (field840 + 180 - 150), var5 + 2, 300 - field829 * 3, 30, 0);
            arg0.method3534(field823, field840 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field302 == 20) {
            Statics.field820.method3699(field840 + 180 - Statics.field820.field3198 / 2, 271 - Statics.field820.field3199 / 2);
            short var6 = 211;
            arg0.method3534(field833, field840 + 180, var6, 16776960, 0);
            int var91 = var6 + 15;
            arg0.method3534(field837, field840 + 180, var91, 16776960, 0);
            int var92 = var91 + 15;
            arg0.method3534(field835, field840 + 180, var92, 16776960, 0);
            int var93 = var92 + 15;
            int var94 = var93 + 10;
            if (field831 != 4) {
                arg0.method3523(class174.field2597, field840 + 180 - 110, var94, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field836; arg0.method3518(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3523(class210.method3522(var8), field840 + 180 - 70, var94, 16777215, 0);
                var91 = var94 + 15;
                String var10 = class174.field2598;
                String var11 = field811;
                String var12 = class208.method716('*', var11.length());
                arg0.method3523(var10 + var12, field840 + 180 - 108, var91, 16777215, 0);
                var91 += 15;
            }
        }
        if (client.field302 == 10 || client.field302 == 11) {
            Statics.field820.method3699(field840, 171);
            if (field831 == 0) {
                short var13 = 251;
                arg0.method3534(class174.field2600, field840 + 180, var13, 16776960, 0);
                int var95 = var13 + 30;
                int var14 = field840 + 180 - 80;
                short var15 = 291;
                Statics.field841.method3699(var14 - 73, var15 - 20);
                arg0.method3527(class174.field2476, var14 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var16 = field840 + 180 + 80;
                Statics.field841.method3699(var16 - 73, var15 - 20);
                arg0.method3527(class174.field2388, var16 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field831 == 1) {
                arg0.method3534(field832, field840 + 180, 211, 16776960, 0);
                short var17 = 236;
                arg0.method3534(field833, field840 + 180, var17, 16777215, 0);
                int var96 = var17 + 15;
                arg0.method3534(field837, field840 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method3534(field835, field840 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                int var18 = field840 + 180 - 80;
                short var19 = 321;
                Statics.field841.method3699(var18 - 73, var19 - 20);
                arg0.method3534(class174.field2373, var18, var19 + 5, 16777215, 0);
                int var20 = field840 + 180 + 80;
                Statics.field841.method3699(var20 - 73, var19 - 20);
                arg0.method3534(class174.field2604, var20, var19 + 5, 16777215, 0);
            } else if (field831 == 2) {
                short var21 = 211;
                arg0.method3534(field833, field840 + 180, var21, 16776960, 0);
                int var99 = var21 + 15;
                arg0.method3534(field837, field840 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3534(field835, field840 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 10;
                arg0.method3523(class174.field2597, field840 + 180 - 110, var102, 16777215, 0);
                short var22 = 200;
                String var23;
                for (var23 = field836; arg0.method3518(var23) > var22; var23 = var23.substring(1)) {
                }
                arg0.method3523(class210.method3522(var23) + (field834 == 0 & client.field304 % 40 < 20 ? class38.method575(16776960) + class38.field786 : ""), field840 + 180 - 70, var102, 16777215, 0);
                var99 = var102 + 15;
                String var25 = class174.field2598;
                String var26 = field811;
                String var27 = class208.method716('*', var26.length());
                arg0.method3523(var25 + var27 + (field834 == 1 & client.field304 % 40 < 20 ? class38.method575(16776960) + class38.field786 : ""), field840 + 180 - 108, var99, 16777215, 0);
                var99 += 15;
                int var28 = field840 + 180 - 80;
                short var29 = 321;
                Statics.field841.method3699(var28 - 73, var29 - 20);
                arg0.method3534(class174.field2603, var28, var29 + 5, 16777215, 0);
                int var30 = field840 + 180 + 80;
                Statics.field841.method3699(var30 - 73, var29 - 20);
                arg0.method3534(class174.field2604, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3534(class174.field2481, field840 + 180, var31, 16776960, 0);
            } else if (field831 == 3) {
                short var32 = 201;
                arg0.method3534(class174.field2452, field840 + 180, var32, 16776960, 0);
                int var103 = var32 + 20;
                arg1.method3534(class174.field2567, field840 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg1.method3534(class174.field2607, field840 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var33 = field840 + 180;
                short var34 = 276;
                Statics.field841.method3699(var33 - 73, var34 - 20);
                arg2.method3534(class174.field2608, var33, var34 + 5, 16777215, 0);
                int var35 = field840 + 180;
                short var36 = 326;
                Statics.field841.method3699(var35 - 73, var36 - 20);
                arg2.method3534(class174.field2609, var35, var36 + 5, 16777215, 0);
            } else if (field831 == 4) {
                arg0.method3534(class174.field2592, field840 + 180, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3534(field833, field840 + 180, var37, 16777215, 0);
                int var106 = var37 + 15;
                arg0.method3534(field837, field840 + 180, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3534(field835, field840 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                String var39 = class174.field2599;
                String var40 = Statics.field826;
                String var41 = class208.method716('*', var40.length());
                arg0.method3523(var39 + var41 + (client.field304 % 40 < 20 ? class38.method575(16776960) + class38.field786 : ""), field840 + 180 - 108, var108, 16777215, 0);
                int var109 = var108 - 8;
                arg0.method3523(class174.field2375, field840 + 180 - 9, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3523(class174.field2497, field840 + 180 - 9, var110, 16776960, 0);
                int var42 = field840 + 180 - 9 + arg0.method3518(class174.field2497) + 15;
                int var43 = var110 - arg0.field3103;
                class223 var44;
                if (field838) {
                    var44 = Statics.field819;
                } else {
                    var44 = Statics.field818;
                }
                var44.method3699(var42, var43);
                var106 = var110 + 15;
                int var45 = field840 + 180 - 80;
                short var46 = 321;
                Statics.field841.method3699(var45 - 73, var46 - 20);
                arg0.method3534(class174.field2373, var45, var46 + 5, 16777215, 0);
                int var47 = field840 + 180 + 80;
                Statics.field841.method3699(var47 - 73, var46 - 20);
                arg0.method3534(class174.field2604, var47, var46 + 5, 16777215, 0);
                arg1.method3534(class174.field2526, field840 + 180, var46 + 36, 255, 0);
            } else if (field831 == 5) {
                arg0.method3534(class174.field2611, field840 + 180, 201, 16776960, 0);
                short var48 = 221;
                arg2.method3534(field833, field840 + 180, var48, 16776960, 0);
                int var111 = var48 + 15;
                arg2.method3534(field837, field840 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg2.method3534(field835, field840 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 14;
                arg0.method3523(class174.field2612, field840 + 180 - 145, var114, 16777215, 0);
                short var49 = 174;
                String var50;
                for (var50 = field836; arg0.method3518(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method3523(class210.method3522(var50) + (client.field304 % 40 < 20 ? class38.method575(16776960) + class38.field786 : ""), field840 + 180 - 34, var114, 16777215, 0);
                var111 = var114 + 15;
                int var51 = field840 + 180 - 80;
                short var52 = 321;
                Statics.field841.method3699(var51 - 73, var52 - 20);
                arg0.method3534(class174.field2613, var51, var52 + 5, 16777215, 0);
                int var53 = field840 + 180 + 80;
                Statics.field841.method3699(var53 - 73, var52 - 20);
                arg0.method3534(class174.field2614, var53, var52 + 5, 16777215, 0);
            } else if (field831 == 6) {
                short var54 = 211;
                arg0.method3534(field833, field840 + 180, var54, 16776960, 0);
                int var115 = var54 + 15;
                arg0.method3534(field837, field840 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3534(field835, field840 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var55 = field840 + 180;
                short var56 = 321;
                Statics.field841.method3699(var55 - 73, var56 - 20);
                arg0.method3534(class174.field2614, var55, var56 + 5, 16777215, 0);
            }
        }
        if (field827 > 0) {
            method40(field827);
            field827 = 0;
        }
        short var57 = 256;
        if (field830 > 0) {
            for (int var58 = 0; var58 < 256; var58++) {
                if (field830 > 768) {
                    Statics.field2032[var58] = method81(Statics.field1631[var58], Statics.field1465[var58], 1024 - field830);
                } else if (field830 > 256) {
                    Statics.field2032[var58] = Statics.field1465[var58];
                } else {
                    Statics.field2032[var58] = method81(Statics.field1465[var58], Statics.field1631[var58], 256 - field830);
                }
            }
        } else if (field824 > 0) {
            for (int var59 = 0; var59 < 256; var59++) {
                if (field824 > 768) {
                    Statics.field2032[var59] = method81(Statics.field1631[var59], Statics.field822[var59], 1024 - field824);
                } else if (field824 > 256) {
                    Statics.field2032[var59] = Statics.field822[var59];
                } else {
                    Statics.field2032[var59] = method81(Statics.field822[var59], Statics.field1631[var59], 256 - field824);
                }
            }
        } else {
            for (int var60 = 0; var60 < 256; var60++) {
                Statics.field2032[var60] = Statics.field1631[var60];
            }
        }
        class220.method3635(field815, 9, field815 + 128, var57 + 7);
        Statics.field816.method3742(field815, 0);
        class220.method3634();
        int var61 = 0;
        int var62 = field815 + Statics.field1059.field3183 * 9;
        for (int var63 = 1; var63 < var57 - 1; var63++) {
            int var64 = (var57 - var63) * field821[var63] / var57;
            int var65 = var64 + 22;
            if (var65 < 0) {
                var65 = 0;
            }
            var61 += var65;
            for (int var66 = var65; var66 < 128; var66++) {
                int var67 = Statics.field3077[var61++];
                if (var67 == 0) {
                    var62++;
                } else {
                    int var69 = 256 - var67;
                    int var70 = Statics.field2032[var67];
                    int var71 = Statics.field1059.field3182[var62];
                    Statics.field1059.field3182[var62++] = ((var70 & 0xFF00) * var67 + (var71 & 0xFF00) * var69 & 0xFF0000) + ((var70 & 0xFF00FF) * var67 + (var71 & 0xFF00FF) * var69 & 0xFF00FF00) >> 8;
                }
            }
            var62 += Statics.field1059.field3183 + var65 - 128;
        }
        class220.method3635(field815 + 765 - 128, 9, field815 + 765, var57 + 7);
        Statics.field799.method3742(field815 + 382, 0);
        class220.method3634();
        int var72 = 0;
        int var73 = field815 + Statics.field1059.field3183 * 9 + 24 + 637;
        for (int var74 = 1; var74 < var57 - 1; var74++) {
            int var75 = (var57 - var74) * field821[var74] / var57;
            int var76 = 103 - var75;
            int var77 = var73 + var75;
            for (int var78 = 0; var78 < var76; var78++) {
                int var79 = Statics.field3077[var72++];
                if (var79 == 0) {
                    var77++;
                } else {
                    int var81 = 256 - var79;
                    int var82 = Statics.field2032[var79];
                    int var83 = Statics.field1059.field3182[var77];
                    Statics.field1059.field3182[var77++] = ((var82 & 0xFF00FF) * var79 + (var83 & 0xFF00FF) * var81 & 0xFF00FF00) + ((var82 & 0xFF00) * var79 + (var83 & 0xFF00) * var81 & 0xFF0000) >> 8;
                }
            }
            var72 += 128 - var76;
            var73 = Statics.field1059.field3183 - var76 - var75 + var77;
        }
        Statics.field2130[Statics.field795.field703 ? 1 : 0].method3699(field815 + 765 - 40, 463);
        if (client.field302 > 5 && client.field301 == 0) {
            if (Statics.field2772 == null) {
                Statics.field2772 = class226.method1746(Statics.field808, "sl_button", "");
            } else {
                int var84 = field815 + 5;
                short var85 = 463;
                byte var86 = 100;
                byte var87 = 35;
                Statics.field2772.method3699(var84, var85);
                arg0.method3534(class174.field2530 + " " + client.field512, var86 / 2 + var84, var87 / 2 + var85 - 2, 16777215, 0);
                if (Statics.field675 == null) {
                    arg1.method3534(class174.field2646, var86 / 2 + var84, var87 / 2 + var85 + 12, 16777215, 0);
                } else {
                    arg1.method3534(class174.field2645, var86 / 2 + var84, var87 / 2 + var85 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var88 = Statics.field578.getGraphics();
            Statics.field1059.method3625(var88, 0, 0);
        } catch (Exception var90) {
            Statics.field578.repaint();
        }
    }

    @ObfuscatedName("c.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method9(String arg0, String arg1, String arg2) {
        field833 = arg0;
        field837 = arg1;
        field835 = arg2;
    }

    @ObfuscatedName("m.x(Lhl;I)V")
    public static final void method147(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field772.length; var2++) {
            Statics.field772[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field772[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3194[var8] = (Statics.field772[var8 - 1] + Statics.field772[var8 + 1] + Statics.field772[var8 - 128] + Statics.field772[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field772;
            Statics.field772 = Statics.field3194;
            Statics.field3194 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3199; var11++) {
            for (int var12 = 0; var12 < arg0.field3198; var12++) {
                if (arg0.field3202[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3200;
                    int var14 = var11 + 16 + arg0.field3201;
                    int var15 = (var14 << 7) + var13;
                    Statics.field772[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("h.r(IB)V")
    public static final void method40(int arg0) {
        short var1 = 256;
        field825 += arg0 * 128;
        if (field825 > Statics.field772.length) {
            field825 -= Statics.field772.length;
            int var2 = (int) (Math.random() * 12.0D);
            method147(Statics.field812[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field3077[var3 + var4] - Statics.field772[field825 + var3 & Statics.field772.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field3077[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field3077[var9 + var10] = 255;
                } else {
                    Statics.field3077[var9 + var10] = 0;
                }
            }
        }
        if (field830 > 0) {
            field830 -= arg0 * 4;
        }
        if (field824 > 0) {
            field824 -= arg0 * 4;
        }
        if (field830 == 0 && field824 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field830 = 1024;
            }
            if (var12 == 1) {
                field824 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field821[var13] = field821[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field821[var14] = (int) (Math.sin((double) field828 / 14.0D) * 16.0D + Math.sin((double) field828 / 15.0D) * 14.0D + Math.sin((double) field828 / 16.0D) * 12.0D);
            field828++;
        }
        field839 += arg0 * -824875435;
        int var15 = ((client.field304 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field839 * -1917306156; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field3077[(var18 << 7) + var17] = 192;
        }
        field839 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field3077[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field3077[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1471[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1471[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1471[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field3077[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("k.n(IIII)I")
    public static final int method81(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dv.m(Lhi;Lhi;B)V")
    public static void method2081(class209 arg0, class209 arg1) {
        if (Statics.field223 == null) {
            Statics.field223 = class226.method3620(Statics.field808, "sl_back", "");
        }
        if (Statics.field1463 == null) {
            Statics.field1463 = class226.method1749(Statics.field808, "sl_flags", "");
        }
        if (Statics.field1427 == null) {
            Statics.field1427 = class226.method1749(Statics.field808, "sl_arrows", "");
        }
        if (Statics.field846 == null) {
            Statics.field846 = class226.method1749(Statics.field808, "sl_stars", "");
        }
        class220.method3667(field815, 23, 765, 480, 0);
        class220.method3646(field815, 0, 125, 23, 12425273, 9135624);
        class220.method3646(field815 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3534(class174.field2636, field815 + 62, 15, 0, -1);
        if (Statics.field846 != null) {
            Statics.field846[1].method3699(field815 + 140, 1);
            arg1.method3523(class174.field2472, field815 + 152, 10, 16777215, -1);
            Statics.field846[0].method3699(field815 + 140, 12);
            arg1.method3523(class174.field2606, field815 + 152, 21, 16777215, -1);
        }
        if (Statics.field1427 != null) {
            int var2 = field815 + 280;
            if (class30.field681[0] == 0 && class30.field674[0] == 0) {
                Statics.field1427[2].method3699(var2, 4);
            } else {
                Statics.field1427[0].method3699(var2, 4);
            }
            if (class30.field681[0] == 0 && class30.field674[0] == 1) {
                Statics.field1427[3].method3699(var2 + 15, 4);
            } else {
                Statics.field1427[1].method3699(var2 + 15, 4);
            }
            arg0.method3523(class174.field2639, var2 + 32, 17, 16777215, -1);
            int var3 = field815 + 390;
            if (class30.field681[0] == 1 && class30.field674[0] == 0) {
                Statics.field1427[2].method3699(var3, 4);
            } else {
                Statics.field1427[0].method3699(var3, 4);
            }
            if (class30.field681[0] == 1 && class30.field674[0] == 1) {
                Statics.field1427[3].method3699(var3 + 15, 4);
            } else {
                Statics.field1427[1].method3699(var3 + 15, 4);
            }
            arg0.method3523(class174.field2370, var3 + 32, 17, 16777215, -1);
            int var4 = field815 + 500;
            if (class30.field681[0] == 2 && class30.field674[0] == 0) {
                Statics.field1427[2].method3699(var4, 4);
            } else {
                Statics.field1427[0].method3699(var4, 4);
            }
            if (class30.field681[0] == 2 && class30.field674[0] == 1) {
                Statics.field1427[3].method3699(var4 + 15, 4);
            } else {
                Statics.field1427[1].method3699(var4 + 15, 4);
            }
            arg0.method3523(class174.field2641, var4 + 32, 17, 16777215, -1);
            int var5 = field815 + 610;
            if (class30.field681[0] == 3 && class30.field674[0] == 0) {
                Statics.field1427[2].method3699(var5, 4);
            } else {
                Statics.field1427[0].method3699(var5, 4);
            }
            if (class30.field681[0] == 3 && class30.field674[0] == 1) {
                Statics.field1427[3].method3699(var5 + 15, 4);
            } else {
                Statics.field1427[1].method3699(var5 + 15, 4);
            }
            arg0.method3523(class174.field2642, var5 + 32, 17, 16777215, -1);
        }
        class220.method3667(field815 + 708, 4, 50, 16, 0);
        arg1.method3534(class174.field2604, field815 + 708 + 25, 16, 16777215, -1);
        field847 = -1;
        if (Statics.field223 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field683) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field683) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field683) {
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
            int var17 = field815 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field683; var20++) {
                class30 var21 = Statics.field677[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field685);
                if (var21.field685 == -1) {
                    var23 = class174.field2643;
                    var22 = false;
                } else if (var21.field685 > 1980) {
                    var23 = class174.field2644;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method607()) {
                    if (var21.method619()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method632()) {
                    var24 = 16711680;
                    if (var21.method619()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method597()) {
                    if (var21.method619()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method619()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1811 >= var17 && class116.field1804 >= var16 && class116.field1811 < var6 + var17 && class116.field1804 < var7 + var16 && var22) {
                    field847 = var20;
                    Statics.field223[var25].method3748(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field223[var25].method3742(var17, var16);
                }
                if (Statics.field1463 != null) {
                    Statics.field1463[(var21.method619() ? 8 : 0) + var21.field688].method3699(var17 + 29, var16);
                }
                arg0.method3534(Integer.toString(var21.field682), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3534(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3518(Statics.field677[field847].field678) + 6;
                int var27 = arg1.field3103 + 8;
                class220.method3667(class116.field1811 - var26 / 2, class116.field1804 + 20 + 5, var26, var27, 16777120);
                class220.method3654(class116.field1811 - var26 / 2, class116.field1804 + 20 + 5, var26, var27, 0);
                arg1.method3534(Statics.field677[field847].field678, class116.field1811, class116.field1804 + 20 + 5 + arg1.field3103 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field578.getGraphics();
            Statics.field1059.method3625(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field578.repaint();
        }
    }

    @ObfuscatedName("bb.j(Lde;I)V")
    public static void method1025(class114 arg0) {
        if (class116.field1808 != 1 && Statics.field111 || class116.field1808 != 4) {
            return;
        }
        int var1 = field815 + 280;
        if (class116.field1810 >= var1 && class116.field1810 <= var1 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(0, 0);
            return;
        }
        if (class116.field1810 >= var1 + 15 && class116.field1810 <= var1 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(0, 1);
            return;
        }
        int var2 = field815 + 390;
        if (class116.field1810 >= var2 && class116.field1810 <= var2 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(1, 0);
            return;
        }
        if (class116.field1810 >= var2 + 15 && class116.field1810 <= var2 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(1, 1);
            return;
        }
        int var3 = field815 + 500;
        if (class116.field1810 >= var3 && class116.field1810 <= var3 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(2, 0);
            return;
        }
        if (class116.field1810 >= var3 + 15 && class116.field1810 <= var3 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(2, 1);
            return;
        }
        int var4 = field815 + 610;
        if (class116.field1810 >= var4 && class116.field1810 <= var4 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(3, 0);
            return;
        }
        if (class116.field1810 >= var4 + 15 && class116.field1810 <= var4 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
            class30.method2772(3, 1);
            return;
        }
        if (class116.field1810 >= field815 + 708 && class116.field1797 >= 4 && class116.field1810 <= field815 + 708 + 50 && class116.field1797 <= 20) {
            field845 = false;
            Statics.field816.method3742(field815, 0);
            Statics.field799.method3742(field815 + 382, 0);
            Statics.field817.method3699(field815 + 382 - Statics.field817.field3198 / 2, 18);
            return;
        }
        if (field847 == -1) {
            return;
        }
        class30 var5 = Statics.field677[field847];
        if (var5.method619() != client.field299) {
            client.field299 = var5.method619();
            boolean var6 = var5.method619();
            if (Statics.field2989 != var6) {
                class199.field2987.method2124();
                class199.field2956.method2124();
                class199.field2957.method2124();
                Statics.field2989 = var6;
            }
        }
        Statics.field2688 = var5.field686;
        client.field512 = var5.field682;
        client.field376 = var5.field684;
        Statics.field7 = client.field298 == 0 ? 43594 : var5.field682 + 40000;
        Statics.field2844 = client.field298 == 0 ? 443 : var5.field682 + 50000;
        Statics.field603 = Statics.field7;
        field845 = false;
        Statics.field816.method3742(field815, 0);
        Statics.field799.method3742(field815 + 382, 0);
        Statics.field817.method3699(field815 + 382 - Statics.field817.field3198 / 2, 18);
        return;
    }
}
