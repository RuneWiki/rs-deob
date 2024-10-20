package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@ObfuscatedName("cp")
public class class74 {

    @ObfuscatedName("cp.ac")
    public static int field896 = 0;

    @ObfuscatedName("cp.ai")
    public static int field887 = field896 + 202;

    @ObfuscatedName("cp.aa")
    public static int field898 = 10;

    @ObfuscatedName("cp.ah")
    public static String field899 = "";

    @ObfuscatedName("cp.bp")
    public static int field902 = -1;

    @ObfuscatedName("cp.bn")
    public static int field888 = 1;

    @ObfuscatedName("cp.bi")
    public static int field895 = 0;

    @ObfuscatedName("cp.cl")
    public static String field903 = "";

    @ObfuscatedName("cp.ca")
    public static String field886 = "";

    @ObfuscatedName("cp.cb")
    public static String field890 = "";

    @ObfuscatedName("cp.co")
    public static String field907 = "";

    @ObfuscatedName("cp.cj")
    public static String field908 = "";

    @ObfuscatedName("cp.cn")
    public static String field904 = "";

    @ObfuscatedName("cp.cd")
    public static int field910 = 0;

    @ObfuscatedName("cp.cc")
    public static String[] field909 = new String[8];

    @ObfuscatedName("cp.cg")
    public static String field912 = "";

    @ObfuscatedName("cp.cw")
    public static boolean field901 = false;

    @ObfuscatedName("cp.cp")
    public static boolean field914 = false;

    @ObfuscatedName("cp.cv")
    public static boolean field915 = true;

    @ObfuscatedName("cp.cr")
    public static int field916 = 0;

    @ObfuscatedName("cp.du")
    public static String field917 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cp.dg")
    public static String field918 = "1234567890";

    @ObfuscatedName("cp.dp")
    public static boolean field922 = false;

    @ObfuscatedName("cp.dh")
    public static int field920 = -1;

    @ObfuscatedName("cp.dj")
    public static int field921 = 0;

    @ObfuscatedName("cp.da")
    public static int field897 = 0;

    @ObfuscatedName("cp.dw")
    public static long field923;

    @ObfuscatedName("cp.dt")
    public static long field924;

    @ObfuscatedName("cp.db")
    public static String[] field925;

    @ObfuscatedName("cp.dm")
    public static String[] field926;

    @ObfuscatedName("cp.dz")
    public static String[] field927;

    static {
        new DecimalFormat("##0.00");
        new class131();
        field923 = -1L;
        field924 = -1L;
        field925 = new String[] { "title.jpg" };
        field926 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field927 = new String[] { "logo_speedrunning" };
    }

    public class74() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qe.aj(Lne;Lne;I)I")
    public static int method7150(class340 arg0, class340 arg1) {
        int var2 = 0;
        String[] var3 = field925;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5857(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field926;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5857(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field927;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method5875(var11) != -1 && arg1.method5857(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("gg.al(Lne;I)I")
    public static int method3209(class340 arg0) {
        int var1 = field926.length + field925.length;
        String[] var2 = field927;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method5875(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("lc.ac(Lne;Lne;ZII)V")
    public static void method5230(class340 arg0, class340 arg1, boolean arg2, int arg3) {
        if (!Statics.field894) {
            if (arg3 == 0) {
                method420(arg2);
            } else {
                method167(arg3);
            }
            class488.method8283();
            byte[] var4 = arg0.method5878("title.jpg", "");
            Statics.field891 = class31.method2942(var4);
            Statics.field4596 = Statics.field891.method8313();
            method4885(arg1, client.field542);
            Statics.field2971 = class493.method6337(arg1, "titlebox", "");
            Statics.field913 = class493.method6337(arg1, "titlebutton", "");
            Statics.field479 = class493.method6337(arg1, "titlebutton_large", "");
            Statics.field883 = class493.method6337(arg1, "play_now_text", "");
            class493.method6337(arg1, "titlebutton_wide42,1", "");
            int var5 = arg1.method5875("runes");
            int var6 = arg1.method5876(var5, "");
            class491[] var7 = class493.method7638(arg1, var5, var6);
            Statics.field889 = var7;
            int var8 = arg1.method5875("title_mute");
            int var9 = arg1.method5876(var8, "");
            class491[] var10 = class493.method7638(arg1, var8, var9);
            Statics.field1613 = var10;
            Statics.field893 = class493.method6337(arg1, "options_radio_buttons,0", "");
            Statics.field1018 = class493.method6337(arg1, "options_radio_buttons,4", "");
            Statics.field905 = class493.method6337(arg1, "options_radio_buttons,2", "");
            Statics.field1942 = class493.method6337(arg1, "options_radio_buttons,6", "");
            Statics.field467 = Statics.field893.field4992;
            Statics.field4858 = Statics.field893.field4987;
            Statics.field4164 = new class95(Statics.field889);
            if (arg2) {
                field908 = "";
                field904 = "";
                field909 = new String[8];
                field910 = 0;
            }
            Statics.field801 = 0;
            Statics.field4184 = "";
            field915 = true;
            field922 = false;
            if (Statics.field2929.method2331()) {
                class294.field3330 = 1;
                Statics.field4333 = null;
                Statics.field5045 = -1;
                Statics.field3334 = -1;
                Statics.field4346 = 0;
                Statics.field3327 = false;
                Statics.field4981 = 2;
            } else {
                Statics.method2498(2, Statics.field3456, "scape main", "", 255, false);
            }
            class341.method3104(false);
            Statics.field894 = true;
            field896 = (Statics.field208 - 765) / 2;
            field887 = field896 + 202;
            Statics.field906 = field887 + 180;
            Statics.field891.method8323(field896, 0);
            Statics.field4596.method8323(field896 + 382, 0);
            Statics.field892.method8308(field896 + 382 - Statics.field892.field4992 / 2, 18);
        } else if (arg3 == 4) {
            method167(4);
        }
    }

    @ObfuscatedName("ec.ab(B)Ljava/lang/String;")
    public static String method2734() {
        String var6;
        if (Statics.field2929.method2315()) {
            String var0 = field908;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field908;
        }
        return var6;
    }

    @ObfuscatedName("nm.an(B)V")
    public static void method6074() {
        if (!Statics.field894) {
            return;
        }
        Statics.field2971 = null;
        Statics.field913 = null;
        Statics.field889 = null;
        Statics.field891 = null;
        Statics.field4596 = null;
        Statics.field892 = null;
        Statics.field1613 = null;
        Statics.field893 = null;
        Statics.field905 = null;
        Statics.field2839 = null;
        Statics.field3053 = null;
        Statics.field4286 = null;
        Statics.field3332 = null;
        Statics.field802 = null;
        Statics.field4164.method2304();
        class294.field3330 = 1;
        Statics.field4333 = null;
        Statics.field5045 = -1;
        Statics.field3334 = -1;
        Statics.field4346 = 0;
        Statics.field3327 = false;
        Statics.field4981 = 2;
        class341.method3104(true);
        Statics.field894 = false;
    }

    @ObfuscatedName("kw.ao(Lne;II)V")
    public static void method4885(class340 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field892 = class493.method6337(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) != 0) {
            Statics.field892 = class493.method6337(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & 0x100) == 0) {
            Statics.field892 = class493.method6337(arg0, "logo", "");
        } else {
            Statics.field892 = class493.method6337(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("bq.av(I)V")
    public static void method672() {
        if (client.field624 && field908 != null && field908.length() > 0) {
            field916 = 1;
        } else {
            field916 = 0;
        }
    }

    @ObfuscatedName("lv.aq(Lbr;Loe;Loe;B)V")
    public static void method4968(class35 arg0, class375 arg1, class375 arg2) {
        if (field922) {
            class209 var3 = client.method5740();
            while (true) {
                if (!var3.method3745()) {
                    if (class36.field235 != 1 && (Statics.field3700 || class36.field235 != 4)) {
                        break;
                    }
                    int var4 = field896 + 280;
                    if (class36.field236 >= var4 && class36.field236 <= var4 + 14 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(0, 0);
                        break;
                    }
                    if (class36.field236 >= var4 + 15 && class36.field236 <= var4 + 80 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(0, 1);
                        break;
                    }
                    int var5 = field896 + 390;
                    if (class36.field236 >= var5 && class36.field236 <= var5 + 14 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(1, 0);
                        break;
                    }
                    if (class36.field236 >= var5 + 15 && class36.field236 <= var5 + 80 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(1, 1);
                        break;
                    }
                    int var6 = field896 + 500;
                    if (class36.field236 >= var6 && class36.field236 <= var6 + 14 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(2, 0);
                        break;
                    }
                    if (class36.field236 >= var6 + 15 && class36.field236 <= var6 + 80 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(2, 1);
                        break;
                    }
                    int var7 = field896 + 610;
                    if (class36.field236 >= var7 && class36.field236 <= var7 + 14 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(3, 0);
                        break;
                    }
                    if (class36.field236 >= var7 + 15 && class36.field236 <= var7 + 80 && class36.field237 >= 4 && class36.field237 <= 18) {
                        class65.method4994(3, 1);
                        break;
                    }
                    if (class36.field236 >= field896 + 708 && class36.field237 >= 4 && class36.field236 <= field896 + 708 + 50 && class36.field237 <= 20) {
                        method2186();
                        break;
                    }
                    if (field920 == -1) {
                        if (field921 > 0 && Statics.field56 != null && class36.field236 >= 0 && class36.field236 <= Statics.field56.field4992 && class36.field237 >= Statics.field1637 / 2 - 50 && class36.field237 <= Statics.field1637 / 2 + 50) {
                            field921--;
                        }
                        if (field921 < field897 && Statics.field2304 != null && class36.field236 >= Statics.field208 - Statics.field2304.field4992 - 5 && class36.field236 <= Statics.field208 && class36.field237 >= Statics.field1637 / 2 - 50 && class36.field237 <= Statics.field1637 / 2 + 50) {
                            field921++;
                        }
                    } else {
                        class65 var8 = Statics.field2996[field920];
                        method3438(var8);
                        field922 = false;
                        Statics.field891.method8323(field896, 0);
                        Statics.field4596.method8323(field896 + 382, 0);
                        Statics.field892.method8308(field896 + 382 - Statics.field892.field4992 / 2, 18);
                    }
                    break;
                }
                if (var3.field2300 == 13) {
                    field922 = false;
                    Statics.field891.method8323(field896, 0);
                    Statics.field4596.method8323(field896 + 382, 0);
                    Statics.field892.method8308(field896 + 382 - Statics.field892.field4992 / 2, 18);
                    break;
                }
                if (var3.field2300 == 96) {
                    if (field921 > 0 && Statics.field56 != null) {
                        field921--;
                    }
                } else if (var3.field2300 == 97 && field921 < field897 && Statics.field2304 != null) {
                    field921++;
                }
            }
            return;
        }
        if ((class36.field235 == 1 || !Statics.field3700 && class36.field235 == 4) && class36.field236 >= field896 + 765 - 50 && class36.field237 >= 453) {
            Statics.field2929.method2386(!Statics.field2929.method2331());
            if (Statics.field2929.method2331()) {
                class294.method4792();
            } else {
                class338 var9 = Statics.field3456;
                int var10 = var9.method5875("scape main");
                int var11 = var9.method5876(var10, "");
                class294.method3085(var9, var10, var11, 255, false);
            }
        }
        if (client.field529 == 5) {
            return;
        }
        if (field923 == -1L) {
            field923 = class290.method4466() + 1000L;
        }
        long var12 = class290.method4466();
        boolean var14;
        if (client.field771 == null || client.field770 >= client.field771.size()) {
            var14 = true;
        } else {
            while (true) {
                if (client.field770 >= client.field771.size()) {
                    var14 = true;
                    break;
                }
                class82 var15 = (class82) client.field771.get(client.field770);
                if (!var15.method2131()) {
                    var14 = false;
                    break;
                }
                client.field770++;
            }
        }
        if (var14 && field924 == -1L) {
            field924 = var12;
            if (field924 > field923) {
                field923 = field924;
            }
        }
        if (client.field529 != 10 && client.field529 != 11) {
            return;
        }
        if (Statics.field860 == class355.field4294) {
            if (class36.field235 == 1 || !Statics.field3700 && class36.field235 == 4) {
                int var16 = field896 + 5;
                short var17 = 463;
                byte var18 = 100;
                byte var19 = 35;
                if (class36.field236 >= var16 && class36.field236 <= var16 + var18 && class36.field237 >= var17 && class36.field237 <= var17 + var19) {
                    method1680();
                    return;
                }
            }
            if (Statics.field85 != null) {
                method1680();
            }
        }
        int var20 = class36.field235;
        int var21 = class36.field236;
        int var22 = class36.field237;
        if (var20 == 0) {
            var21 = class36.field228;
            var22 = class36.field227;
        }
        if (!Statics.field3700 && var20 == 4) {
            var20 = 1;
        }
        class209 var23 = client.method5740();
        if (field895 == 0) {
            boolean var24 = false;
            while (var23.method3745()) {
                if (var23.field2300 == 84) {
                    var24 = true;
                }
            }
            int var25 = Statics.field906 - 80;
            short var26 = 291;
            if (var20 == 1 && var21 >= var25 - 75 && var21 <= var25 + 75 && var22 >= var26 - 20 && var22 <= var26 + 20) {
                class32.method367(client.method3051("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var27 = Statics.field906 + 80;
            if (var20 == 1 && var21 >= var27 - 75 && var21 <= var27 + 75 && var22 >= var26 - 20 && var22 <= var26 + 20 || var24) {
                if ((client.field542 & 0x2000000) != 0) {
                    field903 = "";
                    field886 = class333.field4039;
                    field890 = class333.field4040;
                    field907 = class333.field3912;
                    method167(1);
                    method672();
                } else if ((client.field542 & 0x4) != 0) {
                    if ((client.field542 & 0x400) == 0) {
                        field886 = class333.field4030;
                        field890 = class333.field3867;
                        field907 = class333.field4032;
                    } else {
                        field886 = class333.field4113;
                        field890 = class333.field4037;
                        field907 = class333.field4038;
                    }
                    field903 = class333.field3873;
                    method167(1);
                    method672();
                } else if ((client.field542 & 0x400) == 0) {
                    method7571(false);
                } else {
                    field886 = class333.field4033;
                    field890 = class333.field4034;
                    field907 = class333.field4098;
                    field903 = class333.field3873;
                    method167(1);
                    method672();
                }
            }
        } else if (field895 == 1) {
            while (true) {
                if (!var23.method3745()) {
                    int var28 = Statics.field906 - 80;
                    short var29 = 321;
                    if (var20 == 1 && var21 >= var28 - 75 && var21 <= var28 + 75 && var22 >= var29 - 20 && var22 <= var29 + 20) {
                        method7571(false);
                    }
                    int var30 = Statics.field906 + 80;
                    if (var20 == 1 && var21 >= var30 - 75 && var21 <= var30 + 75 && var22 >= var29 - 20 && var22 <= var29 + 20) {
                        method167(0);
                    }
                    break;
                }
                if (var23.field2300 == 84) {
                    method7571(false);
                } else if (var23.field2300 == 13) {
                    method167(0);
                }
            }
        } else if (field895 == 2) {
            short var31 = 201;
            int var150 = var31 + 52;
            if (var20 == 1 && var22 >= var150 - 12 && var22 < var150 + 2) {
                field916 = 0;
            }
            var150 += 15;
            if (var20 == 1 && var22 >= var150 - 12 && var22 < var150 + 2) {
                field916 = 1;
            }
            var150 += 15;
            short var32 = 361;
            if (Statics.field2933 != null) {
                int var33 = Statics.field2933.field4589 / 2;
                if (var20 == 1 && var21 >= Statics.field2933.field4587 - var33 && var21 <= Statics.field2933.field4587 + var33 && var22 >= var32 - 15 && var22 < var32) {
                    switch(field888) {
                        case 1:
                            Statics.method3906(class333.field4078, class333.field4079, class333.field4080);
                            method167(5);
                            return;
                        case 2:
                            class32.method367("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var34 = Statics.field906 - 80;
            short var35 = 321;
            if (var20 == 1 && var21 >= var34 - 75 && var21 <= var34 + 75 && var22 >= var35 - 20 && var22 <= var35 + 20) {
                field908 = field908.trim();
                if (field908.length() == 0) {
                    Statics.method3906(class333.field3922, class333.field3923, class333.field3962);
                    return;
                }
                if (field904.length() == 0) {
                    Statics.method3906(class333.field3925, class333.field3926, class333.field3801);
                    return;
                }
                Statics.method3906(class333.field4044, class333.field3951, class333.field3914);
                client.method2887(false);
                client.method274(20);
                return;
            }
            int var36 = field887 + 180 + 80;
            if (var20 == 1 && var21 >= var36 - 75 && var21 <= var36 + 75 && var22 >= var35 - 20 && var22 <= var35 + 20) {
                method167(0);
                field908 = "";
                field904 = "";
                Statics.field801 = 0;
                Statics.field4184 = "";
                field915 = true;
            }
            int var37 = Statics.field906 + -117;
            short var38 = 277;
            field901 = var21 >= var37 && var21 < Statics.field467 + var37 && var22 >= var38 && var22 < Statics.field4858 + var38;
            if (var20 == 1 && field901) {
                client.field624 = !client.field624;
                if (!client.field624 && Statics.field2929.method2332() != null) {
                    Statics.field2929.method2325((String) null);
                }
            }
            int var39 = Statics.field906 + 24;
            short var40 = 277;
            field914 = var21 >= var39 && var21 < Statics.field467 + var39 && var22 >= var40 && var22 < Statics.field4858 + var40;
            if (var20 == 1 && field914) {
                Statics.field2929.method2345(!Statics.field2929.method2315());
                if (!Statics.field2929.method2315()) {
                    field908 = "";
                    Statics.field2929.method2325((String) null);
                    method672();
                }
            }
            label1212: while (true) {
                Transferable var44;
                int var45;
                do {
                    while (true) {
                        label1176: do {
                            while (true) {
                                while (var23.method3745()) {
                                    if (var23.field2300 == 13) {
                                        method167(0);
                                        field908 = "";
                                        field904 = "";
                                        Statics.field801 = 0;
                                        Statics.field4184 = "";
                                        field915 = true;
                                    } else {
                                        if (field916 != 0) {
                                            continue label1176;
                                        }
                                        method1933(var23.field2301);
                                        if (var23.field2300 == 85 && field908.length() > 0) {
                                            field908 = field908.substring(0, field908.length() - 1);
                                        }
                                        if (var23.field2300 == 84 || var23.field2300 == 80) {
                                            field916 = 1;
                                        }
                                        char var41 = var23.field2301;
                                        boolean var42 = field917.indexOf(var41) != -1;
                                        if (var42 && field908.length() < 320) {
                                            field908 = field908 + var23.field2301;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field916 != 1);
                        if (var23.field2300 == 85 && field904.length() > 0) {
                            field904 = field904.substring(0, field904.length() - 1);
                        } else if (var23.field2300 == 84 || var23.field2300 == 80) {
                            field916 = 0;
                            if (var23.field2300 == 84) {
                                field908 = field908.trim();
                                if (field908.length() == 0) {
                                    Statics.method3906(class333.field3922, class333.field3923, class333.field3962);
                                    return;
                                }
                                if (field904.length() == 0) {
                                    Statics.method3906(class333.field3925, class333.field3926, class333.field3801);
                                    return;
                                }
                                Statics.method3906(class333.field4044, class333.field3951, class333.field3914);
                                client.method2887(false);
                                client.method274(20);
                                return;
                            }
                        }
                        if ((var23.method3741(82) || var23.method3741(87)) && var23.field2300 == 67) {
                            Clipboard var43 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var44 = var43.getContents(Statics.field4480);
                            var45 = 20 - field904.length();
                            break;
                        }
                        if (class366.method674(var23.field2301)) {
                            char var53 = var23.field2301;
                            boolean var54 = field917.indexOf(var53) != -1;
                            if (var54 && field904.length() < 20) {
                                field904 = field904 + var23.field2301;
                            }
                        }
                    }
                } while (var45 <= 0);
                try {
                    String var46 = (String) var44.getTransferData(DataFlavor.stringFlavor);
                    int var47 = Math.min(var45, var46.length());
                    int var48 = 0;
                    while (true) {
                        if (var48 >= var47) {
                            field904 = field904 + var46.substring(0, var47);
                            continue label1212;
                        }
                        if (!class366.method674(var46.charAt(var48))) {
                            break;
                        }
                        char var49 = var46.charAt(var48);
                        boolean var50 = field917.indexOf(var49) != -1;
                        if (!var50) {
                            break;
                        }
                        var48++;
                    }
                    method167(3);
                    return;
                } catch (UnsupportedFlavorException var148) {
                } catch (IOException var149) {
                }
            }
        } else if (field895 == 3) {
            int var55 = field887 + 180;
            short var56 = 241;
            class417 var57 = arg1.method6556(0, class333.field4065.length(), class333.field4065, var55, var56);
            if (var20 == 1 && var57.method7109(var21, var22)) {
                class32.method367("https://oldschool.runescape.com/launcher", true, false);
            }
            int var58 = field887 + 180;
            short var59 = 276;
            if (var20 == 1 && var21 >= var58 - 75 && var21 <= var58 + 75 && var22 >= var59 - 20 && var22 <= var59 + 20) {
                method420(false);
            }
            int var60 = field887 + 180;
            short var61 = 326;
            if (var20 == 1 && var21 >= var60 - 75 && var21 <= var60 + 75 && var22 >= var61 - 20 && var22 <= var61 + 20) {
                Statics.method3906(class333.field4078, class333.field4079, class333.field4080);
                method167(5);
                return;
            }
        } else if (field895 == 4) {
            int var62 = field887 + 180 - 80;
            short var63 = 321;
            if (var20 == 1 && var21 >= var62 - 75 && var21 <= var62 + 75 && var22 >= var63 - 20 && var22 <= var63 + 20) {
                Statics.field4184.trim();
                if (Statics.field4184.length() != 6) {
                    Statics.method3906(class333.field3966, class333.field3842, class333.field3843);
                    return;
                }
                Statics.field801 = Integer.parseInt(Statics.field4184);
                Statics.field4184 = "";
                client.method2887(true);
                Statics.method3906(class333.field4044, class333.field3951, class333.field3914);
                client.method274(20);
                return;
            }
            if (var20 == 1 && var21 >= field887 + 180 - 9 && var21 <= field887 + 180 + 130 && var22 >= 263 && var22 <= 296) {
                field915 = !field915;
            }
            if (var20 == 1 && var21 >= field887 + 180 - 34 && var21 <= field887 + 180 + 34 && var22 >= 351 && var22 <= 363) {
                class32.method367(client.method3051("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var64 = field887 + 180 + 80;
            if (var20 == 1 && var21 >= var64 - 75 && var21 <= var64 + 75 && var22 >= var63 - 20 && var22 <= var63 + 20) {
                method167(0);
                field908 = "";
                field904 = "";
                Statics.field801 = 0;
                Statics.field4184 = "";
            }
            while (var23.method3745()) {
                boolean var65 = false;
                for (int var66 = 0; var66 < field918.length(); var66++) {
                    if (var23.field2301 == field918.charAt(var66)) {
                        var65 = true;
                        break;
                    }
                }
                if (var23.field2300 == 13) {
                    method167(0);
                    field908 = "";
                    field904 = "";
                    Statics.field801 = 0;
                    Statics.field4184 = "";
                } else {
                    if (var23.field2300 == 85 && Statics.field4184.length() > 0) {
                        Statics.field4184 = Statics.field4184.substring(0, Statics.field4184.length() - 1);
                    }
                    if (var23.field2300 == 84) {
                        Statics.field4184.trim();
                        if (Statics.field4184.length() != 6) {
                            Statics.method3906(class333.field3966, class333.field3842, class333.field3843);
                            return;
                        }
                        Statics.field801 = Integer.parseInt(Statics.field4184);
                        Statics.field4184 = "";
                        client.method2887(true);
                        Statics.method3906(class333.field4044, class333.field3951, class333.field3914);
                        client.method274(20);
                        return;
                    }
                    if (var65 && Statics.field4184.length() < 6) {
                        Statics.field4184 = Statics.field4184 + var23.field2301;
                    }
                }
            }
        } else if (field895 == 5) {
            int var67 = field887 + 180 - 80;
            short var68 = 321;
            if (var20 == 1 && var21 >= var67 - 75 && var21 <= var67 + 75 && var22 >= var68 - 20 && var22 <= var68 + 20) {
                method4398();
                return;
            }
            int var69 = field887 + 180 + 80;
            if (var20 == 1 && var21 >= var69 - 75 && var21 <= var69 + 75 && var22 >= var68 - 20 && var22 <= var68 + 20) {
                method7571(true);
            }
            short var70 = 361;
            if (Statics.field119 != null) {
                int var71 = Statics.field119.field4589 / 2;
                if (var20 == 1 && var21 >= Statics.field119.field4587 - var71 && var21 <= Statics.field119.field4587 + var71 && var22 >= var70 - 15 && var22 < var70) {
                    class32.method367(client.method3051("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var23.method3745()) {
                boolean var72 = false;
                for (int var73 = 0; var73 < field917.length(); var73++) {
                    if (var23.field2301 == field917.charAt(var73)) {
                        var72 = true;
                        break;
                    }
                }
                if (var23.field2300 == 13) {
                    method7571(true);
                } else {
                    if (var23.field2300 == 85 && field908.length() > 0) {
                        field908 = field908.substring(0, field908.length() - 1);
                    }
                    if (var23.field2300 == 84) {
                        method4398();
                        return;
                    }
                    if (var72 && field908.length() < 320) {
                        field908 = field908 + var23.field2301;
                    }
                }
            }
        } else if (field895 == 6) {
            while (true) {
                do {
                    if (!var23.method3745()) {
                        short var74 = 321;
                        if (var20 == 1 && var22 >= var74 - 20 && var22 <= var74 + 20) {
                            method7571(true);
                        }
                        return;
                    }
                } while (var23.field2300 != 84 && var23.field2300 != 13);
                method7571(true);
            }
        } else if (field895 == 7) {
            if (Statics.field1743 && !client.field490) {
                int var75 = Statics.field906 - 150;
                int var76 = var75 + 240 + 25 + 40;
                short var77 = 231;
                int var78 = var77 + 40;
                if (var20 == 1 && var21 >= var75 && var21 <= var76 && var22 >= var77 && var22 <= var78) {
                    int var79 = var75;
                    int var80 = 0;
                    int var81;
                    while (true) {
                        if (var80 >= 8) {
                            var81 = 0;
                            break;
                        }
                        if (var21 <= var79 + 30) {
                            var81 = var80;
                            break;
                        }
                        var79 += 30;
                        var79 += var80 == 1 || var80 == 3 ? 20 : 5;
                        var80++;
                    }
                    field910 = var81;
                }
                int var82 = field887 + 180 - 80;
                short var83 = 321;
                if (var20 == 1 && var21 >= var82 - 75 && var21 <= var82 + 75 && var22 >= var83 - 20 && var22 <= var83 + 20) {
                    boolean var92;
                    label1055: {
                        Date var90;
                        try {
                            SimpleDateFormat var84 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var84.setLenient(false);
                            StringBuilder var85 = new StringBuilder();
                            String[] var86 = field909;
                            int var87 = 0;
                            while (true) {
                                Date var89;
                                if (var87 < var86.length) {
                                    String var88 = var86[var87];
                                    if (var88 != null) {
                                        var85.append(var88);
                                        var87++;
                                        continue;
                                    }
                                    Statics.method4966("Date not valid.", "Please ensure all characters are populated.", "");
                                    var89 = null;
                                } else {
                                    var85.append("12");
                                    var89 = var84.parse(var85.toString());
                                }
                                var90 = var89;
                                break;
                            }
                        } catch (ParseException var147) {
                            Statics.method4966("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var92 = false;
                            break label1055;
                        }
                        if (var90 == null) {
                            var92 = false;
                        } else {
                            Calendar var93 = Calendar.getInstance();
                            var93.set(1, var93.get(1) - 13);
                            var93.set(5, var93.get(5) + 1);
                            var93.set(11, 0);
                            var93.set(12, 0);
                            var93.set(13, 0);
                            var93.set(14, 0);
                            Date var94 = var93.getTime();
                            boolean var95 = var90.before(var94);
                            boolean var97 = method2153(var90);
                            if (var97) {
                                if (var95) {
                                    Statics.field168 = (int) (var90.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field168 = 8388607;
                                }
                                var92 = true;
                            } else {
                                Statics.method4966("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var92 = false;
                            }
                        }
                    }
                    if (var92) {
                        client.method274(50);
                        return;
                    }
                }
                int var99 = field887 + 180 + 80;
                if (var20 == 1 && var21 >= var99 - 75 && var21 <= var99 + 75 && var22 >= var83 - 20 && var22 <= var83 + 20) {
                    field909 = new String[8];
                    method7571(true);
                }
                while (var23.method3745()) {
                    if (var23.field2300 == 101) {
                        field909[field910] = null;
                    }
                    if (var23.field2300 == 85) {
                        if (field909[field910] == null && field910 > 0) {
                            field910--;
                        }
                        field909[field910] = null;
                    }
                    if (var23.field2301 >= '0' && var23.field2301 <= '9') {
                        field909[field910] = "" + var23.field2301;
                        if (field910 < 7) {
                            field910++;
                        }
                    }
                    if (var23.field2300 == 84) {
                        boolean var108;
                        label984: {
                            Date var106;
                            try {
                                SimpleDateFormat var100 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var100.setLenient(false);
                                StringBuilder var101 = new StringBuilder();
                                String[] var102 = field909;
                                int var103 = 0;
                                while (true) {
                                    Date var105;
                                    if (var103 < var102.length) {
                                        String var104 = var102[var103];
                                        if (var104 != null) {
                                            var101.append(var104);
                                            var103++;
                                            continue;
                                        }
                                        Statics.method4966("Date not valid.", "Please ensure all characters are populated.", "");
                                        var105 = null;
                                    } else {
                                        var101.append("12");
                                        var105 = var100.parse(var101.toString());
                                    }
                                    var106 = var105;
                                    break;
                                }
                            } catch (ParseException var146) {
                                Statics.method4966("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var108 = false;
                                break label984;
                            }
                            if (var106 == null) {
                                var108 = false;
                            } else {
                                Calendar var109 = Calendar.getInstance();
                                var109.set(1, var109.get(1) - 13);
                                var109.set(5, var109.get(5) + 1);
                                var109.set(11, 0);
                                var109.set(12, 0);
                                var109.set(13, 0);
                                var109.set(14, 0);
                                Date var110 = var109.getTime();
                                boolean var111 = var106.before(var110);
                                boolean var113 = method2153(var106);
                                if (var113) {
                                    if (var111) {
                                        Statics.field168 = (int) (var106.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field168 = 8388607;
                                    }
                                    var108 = true;
                                } else {
                                    Statics.method4966("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var108 = false;
                                }
                            }
                        }
                        if (var108) {
                            client.method274(50);
                        }
                        return;
                    }
                }
            } else {
                int var115 = field887 + 180 - 80;
                short var116 = 321;
                if (var20 == 1 && var21 >= var115 - 75 && var21 <= var115 + 75 && var22 >= var116 - 20 && var22 <= var116 + 20) {
                    class32.method367(client.method3051("secure", true) + "m=dob/set_dob.ws", true, false);
                    Statics.method3906(class333.field4075, class333.field4076, class333.field3815);
                    method167(6);
                    return;
                }
                int var117 = field887 + 180 + 80;
                if (var20 == 1 && var21 >= var117 - 75 && var21 <= var117 + 75 && var22 >= var116 - 20 && var22 <= var116 + 20) {
                    method7571(true);
                }
            }
        } else if (field895 == 8) {
            int var118 = field887 + 180 - 80;
            short var119 = 321;
            if (var20 == 1 && var21 >= var118 - 75 && var21 <= var118 + 75 && var22 >= var119 - 20 && var22 <= var119 + 20) {
                class32.method367("https://www.jagex.com/terms/privacy", true, false);
                Statics.method3906(class333.field4075, class333.field4076, class333.field3815);
                method167(6);
                return;
            }
            int var120 = field887 + 180 + 80;
            if (var20 == 1 && var21 >= var120 - 75 && var21 <= var120 + 75 && var22 >= var119 - 20 && var22 <= var119 + 20) {
                method7571(true);
            }
        } else if (field895 == 9) {
            int var121 = field887 + 180;
            short var122 = 311;
            if (var23.field2300 == 84 || var23.field2300 == 13 || var20 == 1 && var21 >= var121 - 75 && var21 <= var121 + 75 && var22 >= var122 - 20 && var22 <= var122 + 20) {
                method420(false);
            }
        } else if (field895 == 10) {
            int var123 = field887 + 180;
            short var124 = 209;
            if (var23.field2300 == 84 || var20 == 1 && var21 >= var123 - 109 && var21 <= var123 + 109 && var22 >= var124 && var22 <= var124 + 68) {
                Statics.method3906(class333.field4044, class333.field3951, class333.field3914);
                client.field520 = class483.field4957;
                client.method2887(false);
                client.method274(20);
            }
        } else if (field895 == 12) {
            int var125 = Statics.field906;
            short var126 = 233;
            class417 var127 = arg2.method6556(0, 30, class333.field4107, var125, var126);
            class417 var128 = arg2.method6556(32, 32, class333.field4107, var125, var126);
            class417 var129 = arg2.method6556(70, 34, class333.field4107, var125, var126);
            int var151 = var126 + 17;
            class417 var130 = arg2.method6556(0, 34, class333.field4094, var125, var151);
            if (var20 == 1) {
                if (var127.method7109(var21, var22)) {
                    class32.method367("https://www.jagex.com/terms", true, false);
                } else if (var128.method7109(var21, var22)) {
                    class32.method367("https://www.jagex.com/terms/privacy", true, false);
                } else if (var129.method7109(var21, var22) || var130.method7109(var21, var22)) {
                    class32.method367("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var131 = Statics.field906 - 80;
            short var132 = 311;
            if (var20 == 1 && var21 >= var131 - 75 && var21 <= var131 + 75 && var22 >= var132 - 20 && var22 <= var132 + 20) {
                Statics.field2929.method2333(client.field487);
                method420(true);
            }
            int var133 = Statics.field906 + 80;
            if (var20 == 1 && var21 >= var133 - 75 && var21 <= var133 + 75 && var22 >= var132 - 20 && var22 <= var132 + 20) {
                field895 = 13;
            }
        } else if (field895 == 13) {
            int var134 = Statics.field906;
            short var135 = 321;
            if (var20 == 1 && var21 >= var134 - 75 && var21 <= var134 + 75 && var22 >= var135 - 20 && var22 <= var135 + 20) {
                method420(true);
            }
        } else if (field895 == 14) {
            String var136 = "";
            switch(field902) {
                case 0:
                    var136 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var136 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var136 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method7571(false);
            }
            int var137 = field887 + 180;
            short var138 = 276;
            if (var20 == 1 && var21 >= var137 - 75 && var21 <= var137 + 75 && var22 >= var138 - 20 && var22 <= var138 + 20) {
                class32.method367(var136, true, false);
                Statics.method3906(class333.field4075, class333.field4076, class333.field3815);
                method167(6);
                return;
            }
            int var139 = field887 + 180;
            short var140 = 326;
            if (var20 == 1 && var21 >= var139 - 75 && var21 <= var139 + 75 && var22 >= var140 - 20 && var22 <= var140 + 20) {
                method7571(false);
            }
        } else if (field895 == 24) {
            int var141 = field887 + 180;
            short var142 = 301;
            if (var20 == 1 && var21 >= var141 - 75 && var21 <= var141 + 75 && var22 >= var142 - 20 && var22 <= var142 + 20) {
                method420(false);
            }
        } else if (field895 == 26) {
            int var143 = field887 + 180 - 80;
            short var144 = 321;
            if (var20 == 1 && var21 >= var143 - 75 && var21 <= var143 + 75 && var22 >= var144 - 20 && var22 <= var144 + 20) {
                class32.method367(client.method3051("secure", true) + "m=dob/set_dob.ws", true, false);
                Statics.method3906(class333.field4075, class333.field4076, class333.field3815);
                method167(6);
                return;
            }
            int var145 = field887 + 180 + 80;
            if (var20 == 1 && var21 >= var145 - 75 && var21 <= var145 + 75 && var22 >= var144 - 20 && var22 <= var144 + 20) {
                method7571(true);
            }
        }
    }

    @ObfuscatedName("dr.ap(Ljava/util/Date;I)Z")
    public static boolean method2153(Date arg0) {
        Date var1 = method4749();
        return arg0.after(var1);
    }

    @ObfuscatedName("jz.ar(I)Ljava/util/Date;")
    public static Date method4749() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("cs.ax(CI)Z")
    public static boolean method1933(char arg0) {
        for (int var1 = 0; var1 < field917.length(); var1++) {
            if (arg0 == field917.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ry.as(ZI)V")
    public static void method7571(boolean arg0) {
        if (Statics.field4480.method1149() || Statics.field4480.method1420() || Statics.field4480.method1150()) {
            method167(10);
            return;
        }
        field886 = class333.field4109;
        field890 = class333.field4027;
        field907 = class333.field4028;
        method167(2);
        if (arg0) {
            field904 = "";
        }
        if (field908 == null || field908.length() <= 0) {
            if (Statics.field2929.method2332() == null) {
                client.field624 = false;
            } else {
                field908 = Statics.field2929.method2332();
                client.field624 = true;
            }
        }
        method672();
    }

    @ObfuscatedName("bo.ay(ZB)V")
    public static void method420(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field2929.method2334() >= client.field487;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field4480.method1149() || Statics.field4480.method1420() || Statics.field4480.method1150()) {
            var1 = 10;
        }
        method167(var1);
        if (arg0) {
            field908 = "";
            field904 = "";
            Statics.field801 = 0;
            Statics.field4184 = "";
        }
        if (field908 == null || field908.length() <= 0) {
            if (Statics.field2929.method2332() == null) {
                client.field624 = false;
            } else {
                field908 = Statics.field2929.method2332();
                client.field624 = true;
            }
        }
        method672();
    }

    @ObfuscatedName("jg.am(I)V")
    public static void method4398() {
        field908 = field908.trim();
        if (field908.length() == 0) {
            Statics.method3906(class333.field4078, class333.field4079, class333.field4080);
            return;
        }
        long var0 = class71.method6891();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field908;
            Random var4 = new Random();
            class478 var5 = new class478(128);
            class478 var6 = new class478(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method7886(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method7957(var4.nextInt());
            }
            var5.method7957(var7[0]);
            var5.method7957(var7[1]);
            var5.method7891(var0);
            var5.method7891(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method7957(var4.nextInt());
            }
            var5.method7929(class71.field864, class71.field868);
            var6.method7886(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method7957(var4.nextInt());
            }
            var6.method7891(var4.nextLong());
            var6.method7890(var4.nextLong());
            if (client.field536 == null) {
                byte[] var11 = new byte[24];
                try {
                    class171.field1822.method7684(0L);
                    class171.field1822.method7686(var11);
                    int var12;
                    for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                    }
                    if (var12 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var32) {
                    for (int var14 = 0; var14 < 24; var14++) {
                        var11[var14] = -1;
                    }
                }
                var6.method7896(var11, 0, var11.length);
            } else {
                var6.method7896(client.field536, 0, client.field536.length);
            }
            var6.method7891(var4.nextLong());
            var6.method7929(class71.field864, class71.field868);
            int var17 = class478.method4789(var3);
            if (var17 % 8 != 0) {
                var17 += 8 - var17 % 8;
            }
            class478 var18 = new class478(var17);
            var18.method7893(var3);
            var18.field4904 = var17;
            var18.method8010(var7);
            class478 var19 = new class478(var18.field4904 + var6.field4904 + var5.field4904 + 5);
            var19.method7886(2);
            var19.method7886(var5.field4904);
            var19.method7896(var5.field4906, 0, var5.field4904);
            var19.method7886(var6.field4904);
            var19.method7896(var6.field4906, 0, var6.field4904);
            var19.method7887(var18.field4904);
            var19.method7896(var18.field4906, 0, var18.field4904);
            String var20 = class367.method5955(var19.field4906);
            byte var27;
            try {
                URL var21 = new URL(client.method3051("services", false) + "m=accountappeal/login.ws");
                URLConnection var22 = var21.openConnection();
                var22.setDoInput(true);
                var22.setDoOutput(true);
                var22.setConnectTimeout(5000);
                OutputStreamWriter var23 = new OutputStreamWriter(var22.getOutputStream());
                var23.write("data2=" + class503.method7300(var20) + "&dest=" + class503.method7300("passwordchoice.ws"));
                var23.flush();
                InputStream var24 = var22.getInputStream();
                class478 var25 = new class478(new byte[1000]);
                while (true) {
                    int var26 = var24.read(var25.field4906, var25.field4904, 1000 - var25.field4904);
                    if (var26 == -1) {
                        var23.close();
                        var24.close();
                        String var28 = new String(var25.field4906);
                        if (var28.startsWith("OFFLINE")) {
                            var27 = 4;
                        } else if (var28.startsWith("WRONG")) {
                            var27 = 7;
                        } else if (var28.startsWith("RELOAD")) {
                            var27 = 3;
                        } else if (var28.startsWith("Not permitted for social network accounts.")) {
                            var27 = 6;
                        } else {
                            var25.method7984(var7);
                            while (var25.field4904 > 0 && var25.field4906[var25.field4904 - 1] == 0) {
                                var25.field4904--;
                            }
                            String var29 = new String(var25.field4906, 0, var25.field4904);
                            if (class71.method156(var29)) {
                                class32.method367(var29, true, false);
                                var27 = 2;
                            } else {
                                var27 = 5;
                            }
                        }
                        break;
                    }
                    var25.field4904 += var26;
                    if (var25.field4904 >= 1000) {
                        var27 = 5;
                        break;
                    }
                }
            } catch (Throwable var31) {
                var31.printStackTrace();
                var27 = 5;
            }
            var2 = var27;
        }
        switch(var2) {
            case 2:
                Statics.method3906(class333.field3853, class333.field4082, class333.field4083);
                method167(6);
                break;
            case 3:
                Statics.method3906(class333.field3995, class333.field4085, class333.field4035);
                break;
            case 4:
                Statics.method3906(class333.field4087, class333.field4088, class333.field4089);
                break;
            case 5:
                Statics.method3906(class333.field4090, class333.field4091, class333.field3919);
                break;
            case 6:
                Statics.method3906(class333.field3984, class333.field3870, class333.field4095);
                break;
            case 7:
                Statics.method3906(class333.field4096, class333.field4097, class333.field3850);
        }
    }

    @ObfuscatedName("fv.az(Loe;Loe;Loe;B)V")
    public static void method2946(class375 arg0, class375 arg1, class375 arg2) {
        field896 = (Statics.field208 - 765) / 2;
        field887 = field896 + 202;
        Statics.field906 = field887 + 180;
        if (field922) {
            if (Statics.field2839 == null) {
                Statics.field2839 = class493.method4941(Statics.field1639, "sl_back", "");
            }
            if (Statics.field3053 == null) {
                class338 var3 = Statics.field1639;
                int var4 = var3.method5875("sl_flags");
                int var5 = var3.method5876(var4, "");
                class491[] var6 = class493.method7638(var3, var4, var5);
                Statics.field3053 = var6;
            }
            if (Statics.field4286 == null) {
                class338 var7 = Statics.field1639;
                int var8 = var7.method5875("sl_arrows");
                int var9 = var7.method5876(var8, "");
                class491[] var10 = class493.method7638(var7, var8, var9);
                Statics.field4286 = var10;
            }
            if (Statics.field3332 == null) {
                class338 var11 = Statics.field1639;
                int var12 = var11.method5875("sl_stars");
                int var13 = var11.method5876(var12, "");
                class491[] var14 = class493.method7638(var11, var12, var13);
                Statics.field3332 = var14;
            }
            if (Statics.field56 == null) {
                Statics.field56 = class493.method6337(Statics.field1639, "leftarrow", "");
            }
            if (Statics.field2304 == null) {
                Statics.field2304 = class493.method6337(Statics.field1639, "rightarrow", "");
            }
            class488.method8241(field896, 23, 765, 480, 0);
            class488.method8286(field896, 0, 125, 23, 12425273, 9135624);
            class488.method8286(field896 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method6560(class333.field4036, field896 + 62, 15, 0, -1);
            if (Statics.field3332 != null) {
                Statics.field3332[1].method8308(field896 + 140, 1);
                arg1.method6578(class333.field4115, field896 + 152, 10, 16777215, -1);
                Statics.field3332[0].method8308(field896 + 140, 12);
                arg1.method6578(class333.field4116, field896 + 152, 21, 16777215, -1);
            }
            if (Statics.field4286 != null) {
                int var15 = field896 + 280;
                if (class65.field784[0] == 0 && class65.field777[0] == 0) {
                    Statics.field4286[2].method8308(var15, 4);
                } else {
                    Statics.field4286[0].method8308(var15, 4);
                }
                if (class65.field784[0] == 0 && class65.field777[0] == 1) {
                    Statics.field4286[3].method8308(var15 + 15, 4);
                } else {
                    Statics.field4286[1].method8308(var15 + 15, 4);
                }
                arg0.method6578(class333.field4117, var15 + 32, 17, 16777215, -1);
                int var16 = field896 + 390;
                if (class65.field784[0] == 1 && class65.field777[0] == 0) {
                    Statics.field4286[2].method8308(var16, 4);
                } else {
                    Statics.field4286[0].method8308(var16, 4);
                }
                if (class65.field784[0] == 1 && class65.field777[0] == 1) {
                    Statics.field4286[3].method8308(var16 + 15, 4);
                } else {
                    Statics.field4286[1].method8308(var16 + 15, 4);
                }
                arg0.method6578(class333.field4055, var16 + 32, 17, 16777215, -1);
                int var17 = field896 + 500;
                if (class65.field784[0] == 2 && class65.field777[0] == 0) {
                    Statics.field4286[2].method8308(var17, 4);
                } else {
                    Statics.field4286[0].method8308(var17, 4);
                }
                if (class65.field784[0] == 2 && class65.field777[0] == 1) {
                    Statics.field4286[3].method8308(var17 + 15, 4);
                } else {
                    Statics.field4286[1].method8308(var17 + 15, 4);
                }
                arg0.method6578(class333.field4119, var17 + 32, 17, 16777215, -1);
                int var18 = field896 + 610;
                if (class65.field784[0] == 3 && class65.field777[0] == 0) {
                    Statics.field4286[2].method8308(var18, 4);
                } else {
                    Statics.field4286[0].method8308(var18, 4);
                }
                if (class65.field784[0] == 3 && class65.field777[0] == 1) {
                    Statics.field4286[3].method8308(var18 + 15, 4);
                } else {
                    Statics.field4286[1].method8308(var18 + 15, 4);
                }
                arg0.method6578(class333.field4120, var18 + 32, 17, 16777215, -1);
            }
            class488.method8241(field896 + 708, 4, 50, 16, 0);
            arg1.method6560(class333.field4060, field896 + 708 + 25, 16, 16777215, -1);
            field920 = -1;
            if (Statics.field2839 != null) {
                byte var19 = 88;
                byte var20 = 19;
                int var21 = 765 / (var19 + 1) - 1;
                int var22 = 480 / (var20 + 1);
                int var23;
                int var24;
                do {
                    var23 = var22;
                    var24 = var21;
                    if ((var21 - 1) * var22 >= class65.field782) {
                        var21--;
                    }
                    if ((var22 - 1) * var21 >= class65.field782) {
                        var22--;
                    }
                    if ((var22 - 1) * var21 >= class65.field782) {
                        var22--;
                    }
                } while (var22 != var23 || var21 != var24);
                int var25 = (765 - var19 * var21) / (var21 + 1);
                if (var25 > 5) {
                    var25 = 5;
                }
                int var26 = (480 - var20 * var22) / (var22 + 1);
                if (var26 > 5) {
                    var26 = 5;
                }
                int var27 = (765 - var19 * var21 - (var21 - 1) * var25) / 2;
                int var28 = (480 - var20 * var22 - (var22 - 1) * var26) / 2;
                int var29 = (class65.field782 + var22 - 1) / var22;
                field897 = var29 - var21;
                if (Statics.field56 != null && field921 > 0) {
                    Statics.field56.method8308(8, Statics.field1637 / 2 - Statics.field56.field4987 / 2);
                }
                if (Statics.field2304 != null && field921 < field897) {
                    Statics.field2304.method8308(Statics.field208 - Statics.field2304.field4992 - 8, Statics.field1637 / 2 - Statics.field2304.field4987 / 2);
                }
                int var30 = var28 + 23;
                int var31 = field896 + var27;
                int var32 = 0;
                boolean var33 = false;
                int var34 = field921;
                for (int var35 = var22 * var34; var35 < class65.field782 && var34 - field921 < var21; var35++) {
                    class65 var36 = Statics.field2996[var35];
                    boolean var37 = true;
                    String var38 = Integer.toString(var36.field787);
                    if (var36.field787 == -1) {
                        var38 = class333.field4121;
                        var37 = false;
                    } else if (var36.field787 > 1980) {
                        var38 = class333.field4122;
                        var37 = false;
                    }
                    int var39 = -1;
                    int var40 = 0;
                    if (var36.method1693()) {
                        if (var36.method1688()) {
                            var39 = class106.field1361.field1353;
                        } else {
                            var39 = class106.field1356.field1353;
                        }
                    } else if (var36.method1692()) {
                        var40 = 16711680;
                        if (var36.method1688()) {
                            var39 = class106.field1351.field1353;
                        } else {
                            var39 = class106.field1350.field1353;
                        }
                    } else if (var36.method1726()) {
                        if (var36.method1688()) {
                            var39 = class106.field1346.field1353;
                        } else {
                            var39 = class106.field1354.field1353;
                        }
                    } else if (var36.method1690()) {
                        if (var36.method1688()) {
                            var39 = class106.field1355.field1353;
                        } else {
                            var39 = class106.field1348.field1353;
                        }
                    } else if (var36.method1695()) {
                        if (var36.method1688()) {
                            var39 = class106.field1357.field1353;
                        } else {
                            var39 = class106.field1349.field1353;
                        }
                    } else if (var36.method1696()) {
                        if (var36.method1688()) {
                            var39 = class106.field1352.field1353;
                        } else {
                            var39 = class106.field1358.field1353;
                        }
                    }
                    if (var39 == -1 || var39 >= Statics.field2839.length) {
                        if (var36.method1688()) {
                            var39 = class106.field1359.field1353;
                        } else {
                            var39 = class106.field1360.field1353;
                        }
                    }
                    if (class36.field228 >= var31 && class36.field227 >= var30 && class36.field228 < var19 + var31 && class36.field227 < var20 + var30 && var37) {
                        field920 = var35;
                        Statics.field2839[var39].method8405(var31, var30, 128, 16777215);
                        var33 = true;
                    } else {
                        Statics.field2839[var39].method8323(var31, var30);
                    }
                    if (Statics.field3053 != null) {
                        Statics.field3053[(var36.method1688() ? 8 : 0) + var36.field790].method8308(var31 + 29, var30);
                    }
                    arg0.method6560(Integer.toString(var36.field785), var31 + 15, var20 / 2 + var30 + 5, var40, -1);
                    arg1.method6560(var38, var31 + 60, var20 / 2 + var30 + 5, 268435455, -1);
                    var30 += var20 + var26;
                    var32++;
                    if (var32 >= var22) {
                        var30 = var28 + 23;
                        var31 += var19 + var25;
                        var32 = 0;
                        var34++;
                    }
                }
                if (var33) {
                    int var41 = arg1.method6551(Statics.field2996[field920].field789) + 6;
                    int var42 = arg1.field4389 + 8;
                    int var43 = class36.field227 + 25;
                    if (var42 + var43 > 480) {
                        var43 = class36.field227 - 25 - var42;
                    }
                    class488.method8241(class36.field228 - var41 / 2, var43, var41, var42, 16777120);
                    class488.method8271(class36.field228 - var41 / 2, var43, var41, var42, 0);
                    arg1.method6560(Statics.field2996[field920].field789, class36.field228, arg1.field4389 + var43 + 4, 0, -1);
                }
            }
            Statics.field3785.method452(0, 0);
            return;
        }
        Statics.field891.method8323(field896, 0);
        Statics.field4596.method8323(field896 + 382, 0);
        Statics.field892.method8308(field896 + 382 - Statics.field892.field4992 / 2, 18);
        if (client.field529 == 0 || client.field529 == 5) {
            byte var44 = 20;
            arg0.method6560(class333.field4025, field887 + 180, 245 - var44, 16777215, -1);
            int var45 = 253 - var44;
            class488.method8271(field887 + 180 - 152, var45, 304, 34, 9179409);
            class488.method8271(field887 + 180 - 151, var45 + 1, 302, 32, 0);
            class488.method8241(field887 + 180 - 150, var45 + 2, field898 * 3, 30, 9179409);
            class488.method8241(field898 * 3 + (field887 + 180 - 150), var45 + 2, 300 - field898 * 3, 30, 0);
            arg0.method6560(field899, field887 + 180, 276 - var44, 16777215, -1);
        }
        if (client.field529 == 20) {
            Statics.field2971.method8308(field887 + 180 - Statics.field2971.field4992 / 2, 271 - Statics.field2971.field4987 / 2);
            short var46 = 201;
            arg0.method6560(field886, field887 + 180, var46, 16776960, 0);
            int var177 = var46 + 15;
            arg0.method6560(field890, field887 + 180, var177, 16776960, 0);
            int var178 = var177 + 15;
            arg0.method6560(field907, field887 + 180, var178, 16776960, 0);
            int var179 = var178 + 15;
            int var180 = var179 + 7;
            if (field895 != 4 && field895 != 10) {
                arg0.method6578(class333.field4053, field887 + 180 - 110, var180, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = method2734(); arg0.method6551(var48) > var47; var48 = var48.substring(0, var48.length() - 1)) {
                }
                arg0.method6578(class379.method6555(var48), field887 + 180 - 70, var180, 16777215, 0);
                var177 = var180 + 15;
                String var49 = field904;
                int var50 = var49.length();
                char[] var51 = new char[var50];
                for (int var52 = 0; var52 < var50; var52++) {
                    var51[var52] = '*';
                }
                String var53 = new String(var51);
                String var55;
                for (var55 = var53; arg0.method6551(var55) > var47; var55 = var55.substring(1)) {
                }
                arg0.method6578(class333.field4054 + var55, field887 + 180 - 108, var177, 16777215, 0);
                var177 += 15;
            }
        }
        if (client.field529 == 10 || client.field529 == 11 || client.field529 == 50) {
            Statics.field2971.method8308(field887, 171);
            if (field895 == 0) {
                short var56 = 251;
                arg0.method6560(class333.field3953, field887 + 180, var56, 16776960, 0);
                int var181 = var56 + 30;
                int var57 = field887 + 180 - 80;
                short var58 = 291;
                Statics.field913.method8308(var57 - 73, var58 - 20);
                arg0.method6575(class333.field4057, var57 - 73, var58 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var59 = field887 + 180 + 80;
                Statics.field913.method8308(var59 - 73, var58 - 20);
                arg0.method6575(class333.field4058, var59 - 73, var58 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field895 == 1) {
                arg0.method6560(field903, field887 + 180, 201, 16776960, 0);
                short var60 = 236;
                arg0.method6560(field886, field887 + 180, var60, 16777215, 0);
                int var182 = var60 + 15;
                arg0.method6560(field890, field887 + 180, var182, 16777215, 0);
                int var183 = var182 + 15;
                arg0.method6560(field907, field887 + 180, var183, 16777215, 0);
                int var184 = var183 + 15;
                int var61 = field887 + 180 - 80;
                short var62 = 321;
                Statics.field913.method8308(var61 - 73, var62 - 20);
                arg0.method6560(class333.field3941, var61, var62 + 5, 16777215, 0);
                int var63 = field887 + 180 + 80;
                Statics.field913.method8308(var63 - 73, var62 - 20);
                arg0.method6560(class333.field4060, var63, var62 + 5, 16777215, 0);
            } else if (field895 == 2) {
                short var64 = 201;
                arg0.method6560(field886, Statics.field906, var64, 16776960, 0);
                int var185 = var64 + 15;
                arg0.method6560(field890, Statics.field906, var185, 16776960, 0);
                int var186 = var185 + 15;
                arg0.method6560(field907, Statics.field906, var186, 16776960, 0);
                int var187 = var186 + 15;
                int var188 = var187 + 7;
                arg0.method6578(class333.field4053, Statics.field906 - 110, var188, 16777215, 0);
                short var65 = 200;
                String var72;
                if (Statics.field2929.method2315()) {
                    String var66 = field908;
                    int var67 = var66.length();
                    char[] var68 = new char[var67];
                    for (int var69 = 0; var69 < var67; var69++) {
                        var68[var69] = '*';
                    }
                    String var70 = new String(var68);
                    var72 = var70;
                } else {
                    var72 = field908;
                }
                String var74;
                for (var74 = var72; arg0.method6551(var74) > var65; var74 = var74.substring(1)) {
                }
                arg0.method6578(class379.method6555(var74) + (field916 == 0 & client.field494 % 40 < 20 ? class99.method308(16776960) + class99.field1295 : ""), Statics.field906 - 70, var188, 16777215, 0);
                var185 = var188 + 15;
                String var75 = field904;
                int var76 = var75.length();
                char[] var77 = new char[var76];
                for (int var78 = 0; var78 < var76; var78++) {
                    var77[var78] = '*';
                }
                String var79 = new String(var77);
                String var81;
                for (var81 = var79; arg0.method6551(var81) > var65; var81 = var81.substring(1)) {
                }
                arg0.method6578(class333.field4054 + var81 + (field916 == 1 & client.field494 % 40 < 20 ? class99.method308(16776960) + class99.field1295 : ""), Statics.field906 - 108, var185, 16777215, 0);
                var185 += 15;
                short var82 = 277;
                int var83 = Statics.field906 + -117;
                boolean var84 = client.field624;
                boolean var85 = field901;
                class491 var86 = var84 ? (var85 ? Statics.field1942 : Statics.field905) : (var85 ? Statics.field1018 : Statics.field893);
                var86.method8308(var83, var82);
                int var88 = var86.field4992 + 5 + var83;
                arg1.method6578(class333.field4100, var88, var82 + 13, 16776960, 0);
                int var89 = Statics.field906 + 24;
                boolean var90 = Statics.field2929.method2315();
                boolean var91 = field914;
                class491 var92 = var90 ? (var91 ? Statics.field1942 : Statics.field905) : (var91 ? Statics.field1018 : Statics.field893);
                var92.method8308(var89, var82);
                int var94 = var92.field4992 + 5 + var89;
                arg1.method6578(class333.field4062, var94, var82 + 13, 16776960, 0);
                int var189 = var82 + 15;
                int var95 = Statics.field906 - 80;
                short var96 = 321;
                Statics.field913.method8308(var95 - 73, var96 - 20);
                arg0.method6560(class333.field4101, var95, var96 + 5, 16777215, 0);
                int var97 = Statics.field906 + 80;
                Statics.field913.method8308(var97 - 73, var96 - 20);
                arg0.method6560(class333.field4060, var97, var96 + 5, 16777215, 0);
                short var98 = 357;
                switch(field888) {
                    case 2:
                        Statics.field1885 = class333.field3877;
                        break;
                    default:
                        Statics.field1885 = class333.field4072;
                }
                Statics.field2933 = new class417(Statics.field906, var98, arg1.method6551(Statics.field1885), 11);
                Statics.field119 = new class417(Statics.field906, var98, arg1.method6551(class333.field4073), 11);
                arg1.method6560(Statics.field1885, Statics.field906, var98, 16777215, 0);
            } else if (field895 == 3) {
                short var99 = 201;
                arg0.method6560(class333.field3813, field887 + 180, var99, 16776960, 0);
                int var190 = var99 + 20;
                arg1.method6560(class333.field4064, field887 + 180, var190, 16776960, 0);
                int var191 = var190 + 20;
                arg1.method6560(class333.field4065, field887 + 180, var191, 16776960, 0);
                int var192 = var191 + 15;
                int var100 = field887 + 180;
                short var101 = 276;
                Statics.field913.method8308(var100 - 73, var101 - 20);
                arg2.method6560(class333.field4066, var100, var101 + 5, 16777215, 0);
                int var102 = field887 + 180;
                short var103 = 326;
                Statics.field913.method8308(var102 - 73, var103 - 20);
                arg2.method6560(class333.field4067, var102, var103 + 5, 16777215, 0);
            } else if (field895 == 4) {
                arg0.method6560(class333.field4042, field887 + 180, 201, 16776960, 0);
                short var104 = 236;
                arg0.method6560(field886, field887 + 180, var104, 16777215, 0);
                int var193 = var104 + 15;
                arg0.method6560(field890, field887 + 180, var193, 16777215, 0);
                int var194 = var193 + 15;
                arg0.method6560(field907, field887 + 180, var194, 16777215, 0);
                int var195 = var194 + 15;
                String var106 = class333.field4074;
                String var107 = Statics.field4184;
                int var108 = var107.length();
                char[] var109 = new char[var108];
                for (int var110 = 0; var110 < var108; var110++) {
                    var109[var110] = '*';
                }
                String var111 = new String(var109);
                arg0.method6578(var106 + var111 + (client.field494 % 40 < 20 ? class99.method308(16776960) + class99.field1295 : ""), field887 + 180 - 108, var195, 16777215, 0);
                var193 = var195 - 8;
                arg0.method6578(class333.field3936, field887 + 180 - 9, var193, 16776960, 0);
                var193 += 15;
                arg0.method6578(class333.field3811, field887 + 180 - 9, var193, 16776960, 0);
                int var113 = field887 + 180 - 9 + arg0.method6551(class333.field3811) + 15;
                int var114 = var193 - arg0.field4389;
                class491 var115;
                if (field915) {
                    var115 = Statics.field905;
                } else {
                    var115 = Statics.field893;
                }
                var115.method8308(var113, var114);
                var193 += 15;
                int var116 = field887 + 180 - 80;
                short var117 = 321;
                Statics.field913.method8308(var116 - 73, var117 - 20);
                arg0.method6560(class333.field3941, var116, var117 + 5, 16777215, 0);
                int var118 = field887 + 180 + 80;
                Statics.field913.method8308(var118 - 73, var117 - 20);
                arg0.method6560(class333.field4060, var118, var117 + 5, 16777215, 0);
                arg1.method6560(class333.field4043, field887 + 180, var117 + 36, 255, 0);
            } else if (field895 == 5) {
                arg0.method6560(class333.field4068, field887 + 180, 201, 16776960, 0);
                short var119 = 221;
                arg2.method6560(field886, field887 + 180, var119, 16776960, 0);
                int var196 = var119 + 15;
                arg2.method6560(field890, field887 + 180, var196, 16776960, 0);
                int var197 = var196 + 15;
                arg2.method6560(field907, field887 + 180, var197, 16776960, 0);
                int var198 = var197 + 15;
                int var199 = var198 + 14;
                arg0.method6578(class333.field3918, field887 + 180 - 145, var199, 16777215, 0);
                short var120 = 174;
                String var121;
                for (var121 = method2734(); arg0.method6551(var121) > var120; var121 = var121.substring(1)) {
                }
                arg0.method6578(class379.method6555(var121) + (client.field494 % 40 < 20 ? class99.method308(16776960) + class99.field1295 : ""), field887 + 180 - 34, var199, 16777215, 0);
                var196 = var199 + 15;
                int var122 = field887 + 180 - 80;
                short var123 = 321;
                Statics.field913.method8308(var122 - 73, var123 - 20);
                arg0.method6560(class333.field4070, var122, var123 + 5, 16777215, 0);
                int var124 = field887 + 180 + 80;
                Statics.field913.method8308(var124 - 73, var123 - 20);
                arg0.method6560(class333.field4071, var124, var123 + 5, 16777215, 0);
                short var125 = 356;
                arg1.method6560(class333.field4073, Statics.field906, var125, 268435455, 0);
            } else if (field895 == 6) {
                short var126 = 201;
                arg0.method6560(field886, field887 + 180, var126, 16776960, 0);
                int var200 = var126 + 15;
                arg0.method6560(field890, field887 + 180, var200, 16776960, 0);
                int var201 = var200 + 15;
                arg0.method6560(field907, field887 + 180, var201, 16776960, 0);
                int var202 = var201 + 15;
                int var127 = field887 + 180;
                short var128 = 321;
                Statics.field913.method8308(var127 - 73, var128 - 20);
                arg0.method6560(class333.field4071, var127, var128 + 5, 16777215, 0);
            } else if (field895 == 7) {
                if (Statics.field1743 && !client.field490) {
                    short var129 = 201;
                    arg0.method6560(field886, Statics.field906, var129, 16776960, 0);
                    int var203 = var129 + 15;
                    arg0.method6560(field890, Statics.field906, var203, 16776960, 0);
                    int var204 = var203 + 15;
                    arg0.method6560(field907, Statics.field906, var204, 16776960, 0);
                    int var130 = Statics.field906 - 150;
                    int var205 = var204 + 10;
                    for (int var131 = 0; var131 < 8; var131++) {
                        Statics.field913.method8299(var130, var205, 30, 40);
                        boolean var132 = field910 == var131 & client.field494 % 40 < 20;
                        arg0.method6578((field909[var131] == null ? "" : field909[var131]) + (var132 ? class99.method308(16776960) + class99.field1295 : ""), var130 + 10, var205 + 27, 16777215, 0);
                        if (var131 == 1 || var131 == 3) {
                            var130 += 50;
                            arg0.method6578(class379.method6555("/"), var130 - 13, var205 + 27, 16777215, 0);
                        } else {
                            var130 += 35;
                        }
                    }
                    int var133 = Statics.field906 - 80;
                    short var134 = 321;
                    Statics.field913.method8308(var133 - 73, var134 - 20);
                    arg0.method6560("Submit", var133, var134 + 5, 16777215, 0);
                    int var135 = Statics.field906 + 80;
                    Statics.field913.method8308(var135 - 73, var134 - 20);
                    arg0.method6560(class333.field4060, var135, var134 + 5, 16777215, 0);
                } else {
                    short var136 = 216;
                    arg0.method6560(class333.field4099, field887 + 180, var136, 16776960, 0);
                    int var206 = var136 + 15;
                    arg2.method6560(class333.field3881, field887 + 180, var206, 16776960, 0);
                    int var207 = var206 + 15;
                    arg2.method6560(class333.field3959, field887 + 180, var207, 16776960, 0);
                    int var208 = var207 + 15;
                    int var137 = field887 + 180 - 80;
                    short var138 = 321;
                    Statics.field913.method8308(var137 - 73, var138 - 20);
                    arg0.method6560(class333.field4102, var137, var138 + 5, 16777215, 0);
                    int var139 = field887 + 180 + 80;
                    Statics.field913.method8308(var139 - 73, var138 - 20);
                    arg0.method6560(class333.field4071, var139, var138 + 5, 16777215, 0);
                }
            } else if (field895 == 8) {
                short var140 = 216;
                arg0.method6560(class333.field3906, field887 + 180, var140, 16776960, 0);
                int var209 = var140 + 15;
                arg2.method6560(class333.field4114, field887 + 180, var209, 16776960, 0);
                int var210 = var209 + 15;
                arg2.method6560(class333.field3942, field887 + 180, var210, 16776960, 0);
                int var211 = var210 + 15;
                int var141 = field887 + 180 - 80;
                short var142 = 321;
                Statics.field913.method8308(var141 - 73, var142 - 20);
                arg0.method6560(class333.field4061, var141, var142 + 5, 16777215, 0);
                int var143 = field887 + 180 + 80;
                Statics.field913.method8308(var143 - 73, var142 - 20);
                arg0.method6560(class333.field4071, var143, var142 + 5, 16777215, 0);
            } else if (field895 == 9) {
                short var144 = 221;
                arg0.method6560(field886, field887 + 180, var144, 16776960, 0);
                int var212 = var144 + 25;
                arg0.method6560(field890, field887 + 180, var212, 16776960, 0);
                int var213 = var212 + 25;
                arg0.method6560(field907, field887 + 180, var213, 16776960, 0);
                int var145 = field887 + 180;
                short var146 = 311;
                Statics.field913.method8308(var145 - 73, var146 - 20);
                arg0.method6560(class333.field4066, var145, var146 + 5, 16777215, 0);
            } else if (field895 == 10) {
                int var147 = field887 + 180;
                short var148 = 209;
                arg0.method6560(class333.field3953, field887 + 180, var148, 16776960, 0);
                int var214 = var148 + 20;
                Statics.field479.method8308(var147 - 109, var214);
                if (field912.isEmpty()) {
                    Statics.field883.method8308(var147 - 48, var214 + 18);
                } else {
                    Statics.field883.method8308(var147 - 48, var214 + 5);
                    arg0.method6560(field912, var147, var214 + 68 - 15, 16776960, 0);
                }
            } else if (field895 == 12) {
                int var149 = Statics.field906;
                short var150 = 216;
                arg2.method6560(class333.field4005, var149, var150, 16777215, 0);
                int var215 = var150 + 17;
                arg2.method6560(class333.field4107, var149, var215, 16777215, 0);
                int var216 = var215 + 17;
                arg2.method6560(class333.field4094, var149, var216, 16777215, 0);
                int var217 = var216 + 17;
                arg2.method6560(class333.field3852, var149, var217, 16777215, 0);
                int var151 = Statics.field906 - 80;
                short var152 = 311;
                Statics.field913.method8308(var151 - 73, var152 - 20);
                arg0.method6560(class333.field4048, var151, var152 + 5, 16777215, 0);
                int var153 = Statics.field906 + 80;
                Statics.field913.method8308(var153 - 73, var152 - 20);
                arg0.method6560(class333.field4031, var153, var152 + 5, 16777215, 0);
            } else if (field895 == 13) {
                short var154 = 231;
                arg2.method6560(class333.field4110, field887 + 180, var154, 16777215, 0);
                int var218 = var154 + 20;
                arg2.method6560(class333.field4111, field887 + 180, var218, 16777215, 0);
                int var155 = field887 + 180;
                short var156 = 311;
                Statics.field913.method8308(var155 - 73, var156 - 20);
                arg0.method6560(class333.field4071, var155, var156 + 5, 16777215, 0);
            } else if (field895 == 14) {
                short var157 = 201;
                String var158 = "";
                String var159 = "";
                String var160 = "";
                switch(field902) {
                    case 0:
                        var158 = class333.field3856;
                        var159 = class333.field3857;
                        var160 = class333.field3858;
                        break;
                    case 1:
                        var158 = class333.field4016;
                        var159 = class333.field3896;
                        var160 = class333.field3869;
                        break;
                    case 2:
                        var158 = class333.field3931;
                        var159 = class333.field3924;
                        var160 = class333.field3883;
                        break;
                    default:
                        method7571(false);
                }
                arg0.method6560(var158, field887 + 180, var157, 16776960, 0);
                int var219 = var157 + 20;
                arg0.method6560(var159, field887 + 180, var219, 16776960, 0);
                int var220 = var219 + 20;
                arg0.method6560(var160, field887 + 180, var220, 16776960, 0);
                int var161 = field887 + 180;
                short var162 = 276;
                Statics.field913.method8308(var161 - 73, var162 - 20);
                if (field902 == 1) {
                    arg0.method6560(class333.field4084, var161, var162 + 5, 16777215, 0);
                } else {
                    arg0.method6560(class333.field3839, var161, var162 + 5, 16777215, 0);
                }
                int var163 = field887 + 180;
                short var164 = 326;
                Statics.field913.method8308(var163 - 73, var164 - 20);
                arg0.method6560(class333.field4071, var163, var164 + 5, 16777215, 0);
            } else if (field895 == 24) {
                short var165 = 221;
                arg0.method6560(field886, field887 + 180, var165, 16777215, 0);
                int var221 = var165 + 15;
                arg0.method6560(field890, field887 + 180, var221, 16777215, 0);
                int var222 = var221 + 15;
                arg0.method6560(field907, field887 + 180, var222, 16777215, 0);
                int var223 = var222 + 15;
                int var166 = field887 + 180;
                short var167 = 301;
                Statics.field913.method8308(var166 - 73, var167 - 20);
                arg0.method6560(class333.field3805, var166, var167 + 5, 16777215, 0);
            } else if (field895 == 26) {
                short var168 = 216;
                arg0.method6560(class333.field4099, field887 + 180, var168, 16776960, 0);
                int var224 = var168 + 15;
                arg2.method6560(class333.field3881, field887 + 180, var224, 16776960, 0);
                int var225 = var224 + 15;
                arg2.method6560(class333.field3959, field887 + 180, var225, 16776960, 0);
                int var226 = var225 + 15;
                int var169 = field887 + 180 - 80;
                short var170 = 321;
                Statics.field913.method8308(var169 - 73, var170 - 20);
                arg0.method6560(class333.field4102, var169, var170 + 5, 16777215, 0);
                int var171 = field887 + 180 + 80;
                Statics.field913.method8308(var171 - 73, var170 - 20);
                arg0.method6560(class333.field4071, var171, var170 + 5, 16777215, 0);
            }
        }
        if (client.field529 >= 10) {
            int[] var172 = new int[4];
            class488.method8235(var172);
            class488.method8233(field896, 0, field896 + 765, Statics.field1637);
            Statics.field4164.method2274(field896 - 22, client.field494);
            Statics.field4164.method2274(field896 + 765 + 22 - 128, client.field494);
            class488.method8236(var172);
        }
        Statics.field1613[Statics.field2929.method2331() ? 1 : 0].method8308(field896 + 765 - 40, 463);
        if (client.field529 <= 5 || Statics.field860 != class355.field4294) {
            return;
        }
        if (Statics.field802 == null) {
            Statics.field802 = class493.method6337(Statics.field1639, "sl_button", "");
            return;
        }
        int var173 = field896 + 5;
        short var174 = 463;
        byte var175 = 100;
        byte var176 = 35;
        Statics.field802.method8308(var173, var174);
        arg0.method6560(class333.field3980 + " " + client.field482, var175 / 2 + var173, var176 / 2 + var174 - 2, 16777215, 0);
        if (Statics.field85 == null) {
            arg1.method6560(class333.field3903, var175 / 2 + var173, var176 / 2 + var174 + 12, 16777215, 0);
        } else {
            arg1.method6560(class333.field4123, var175 / 2 + var173, var176 / 2 + var174 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("hq.au(Lcz;I)V")
    public static void method3438(class65 arg0) {
        if (arg0.method1688() != client.field485) {
            client.field485 = arg0.method1688();
            boolean var1 = arg0.method1688();
            if (Statics.field1927 != var1) {
                class204.field2210.method4930();
                class204.field2180.method4930();
                class204.field2230.method4930();
                Statics.field1927 = var1;
            }
        }
        if (client.field542 != arg0.field778) {
            method4885(Statics.field1639, arg0.field778);
        }
        Statics.field1962 = arg0.field788;
        client.field482 = arg0.field785;
        client.field542 = arg0.field778;
        Statics.field3309 = client.field484 == 0 ? 43594 : arg0.field785 + 40000;
        Statics.field3694 = client.field484 == 0 ? 443 : arg0.field785 + 50000;
        Statics.field1714 = Statics.field3309;
    }

    @ObfuscatedName("client.ag(I)V")
    public static void method1680() {
        if (class65.method6855()) {
            field922 = true;
            field921 = 0;
            field897 = 0;
        }
    }

    @ObfuscatedName("dv.at(I)V")
    public static void method2186() {
        field922 = false;
        Statics.field891.method8323(field896, 0);
        Statics.field4596.method8323(field896 + 382, 0);
        Statics.field892.method8308(field896 + 382 - Statics.field892.field4992 / 2, 18);
    }

    @ObfuscatedName("am.af(II)V")
    public static void method167(int arg0) {
        if (field895 != arg0) {
            field895 = arg0;
        }
    }

    @ObfuscatedName("co.ai(I)I")
    public static int method1041() {
        return field895;
    }
}
