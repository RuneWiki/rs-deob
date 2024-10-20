package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("bx")
public class class69 {

    @ObfuscatedName("bx.p")
    public static int field862 = 0;

    @ObfuscatedName("bx.q")
    public static int field887 = field862 + 202;

    @ObfuscatedName("bx.z")
    public static int field868 = 10;

    @ObfuscatedName("bx.i")
    public static String field871 = "";

    @ObfuscatedName("bx.aa")
    public static int field872 = -1;

    @ObfuscatedName("bx.ai")
    public static int field873 = 1;

    @ObfuscatedName("bx.ae")
    public static int field884 = 0;

    @ObfuscatedName("bx.ak")
    public static String field875 = "";

    @ObfuscatedName("bx.ad")
    public static String field876 = "";

    @ObfuscatedName("bx.bp")
    public static String field861 = "";

    @ObfuscatedName("bx.bd")
    public static String field877 = "";

    @ObfuscatedName("bx.ba")
    public static String field869 = "";

    @ObfuscatedName("bx.bq")
    public static String field880 = "";

    @ObfuscatedName("bx.bz")
    public static boolean field881 = false;

    @ObfuscatedName("bx.bu")
    public static boolean field882 = false;

    @ObfuscatedName("bx.bb")
    public static boolean field883 = true;

    @ObfuscatedName("bx.bc")
    public static int field890 = 0;

    @ObfuscatedName("bx.bx")
    public static String field885 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bx.bt")
    public static String field886 = "1234567890";

    @ObfuscatedName("bx.bn")
    public static boolean field878 = false;

    @ObfuscatedName("bx.cl")
    public static int field888 = -1;

    @ObfuscatedName("bx.cp")
    public static int field879 = 0;

    @ObfuscatedName("bx.cd")
    public static int field867 = 0;

    @ObfuscatedName("bx.cg")
    public static long field891;

    @ObfuscatedName("bx.cy")
    public static long field870;

    @ObfuscatedName("bx.cn")
    public static String[] field893;

    @ObfuscatedName("bx.cv")
    public static String[] field894;

    static {
        new DecimalFormat("##0.00");
        new class119();
        field891 = -1L;
        field870 = -1L;
        field893 = new String[] { "title.jpg" };
        field894 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hr.c(Lku;Lku;B)I")
    public static int method4148(class302 arg0, class302 arg1) {
        int var2 = 0;
        String[] var3 = field893;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5092(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field894;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5092(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("mj.b(Lku;Lku;ZIS)V")
    public static void method5925(class302 arg0, class302 arg1, boolean arg2, int arg3) {
        if (!Statics.field3173) {
            if (arg3 == 0) {
                method3419(arg2);
            } else {
                method4983(arg3);
            }
            class428.method6939();
            byte[] var4 = arg0.method5069("title.jpg", "");
            Statics.field2768 = class29.method2064(var4);
            Statics.field1213 = Statics.field2768.method7040();
            int var5 = client.field470;
            if ((var5 & 0x20000000) != 0) {
                Statics.field866 = class433.method2193(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field866 = class433.method2193(arg1, "logo", "");
            } else {
                Statics.field866 = class433.method2193(arg1, "logo_seasonal_mode", "");
            }
            Statics.field3165 = class433.method2193(arg1, "titlebox", "");
            Statics.field103 = class433.method2193(arg1, "titlebutton", "");
            Statics.field895 = class433.method2193(arg1, "titlebutton_large", "");
            Statics.field865 = class433.method2193(arg1, "play_now_text", "");
            class433.method2193(arg1, "titlebutton_wide42,1", "");
            int var6 = arg1.method5118("runes");
            int var7 = arg1.method5070(var6, "");
            class431[] var8;
            if (Statics.method2755(arg1, var6, var7)) {
                class431[] var9 = new class431[Statics.field4614];
                for (int var10 = 0; var10 < Statics.field4614; var10++) {
                    class431 var11 = var9[var10] = new class431();
                    var11.field4563 = Statics.field4581;
                    var11.field4564 = Statics.field4578;
                    var11.field4558 = Statics.field1607[var10];
                    var11.field4562 = Statics.field2119[var10];
                    var11.field4559 = Statics.field4579[var10];
                    var11.field4560 = Statics.field4008[var10];
                    var11.field4561 = Statics.field4580;
                    var11.field4557 = Statics.field4218[var10];
                }
                class433.method2406();
                var8 = var9;
            } else {
                var8 = null;
            }
            Statics.field863 = var8;
            int var14 = arg1.method5118("title_mute");
            int var15 = arg1.method5070(var14, "");
            class431[] var16;
            if (Statics.method2755(arg1, var14, var15)) {
                class431[] var17 = new class431[Statics.field4614];
                for (int var18 = 0; var18 < Statics.field4614; var18++) {
                    class431 var19 = var17[var18] = new class431();
                    var19.field4563 = Statics.field4581;
                    var19.field4564 = Statics.field4578;
                    var19.field4558 = Statics.field1607[var18];
                    var19.field4562 = Statics.field2119[var18];
                    var19.field4559 = Statics.field4579[var18];
                    var19.field4560 = Statics.field4008[var18];
                    var19.field4561 = Statics.field4580;
                    var19.field4557 = Statics.field4218[var18];
                }
                class433.method2406();
                var16 = var17;
            } else {
                var16 = null;
            }
            Statics.field874 = var16;
            Statics.field154 = class433.method2193(arg1, "options_radio_buttons,0", "");
            Statics.field1337 = class433.method2193(arg1, "options_radio_buttons,4", "");
            Statics.field4409 = class433.method2193(arg1, "options_radio_buttons,2", "");
            Statics.field889 = class433.method2193(arg1, "options_radio_buttons,6", "");
            Statics.field3919 = Statics.field154.field4559;
            Statics.field3153 = Statics.field154.field4560;
            Statics.field578 = new class87(Statics.field863);
            if (arg2) {
                field869 = "";
                field880 = "";
            }
            Statics.field1652 = 0;
            Statics.field4141 = "";
            field883 = true;
            field878 = false;
            if (Statics.field929.field1203) {
                class261.field3065 = 1;
                Statics.field1487 = null;
                Statics.field1780 = -1;
                Statics.field3066 = -1;
                Statics.field959 = 0;
                Statics.field949 = false;
                Statics.field3067 = 2;
            } else {
                class261.method1948(2, Statics.field2775, "scape main", "", 255, false);
            }
            class303.method2192(false);
            Statics.field3173 = true;
            field862 = (Statics.field2137 - 765) / 2;
            field887 = field862 + 202;
            Statics.field1592 = field887 + 180;
            Statics.field2768.method7049(field862, 0);
            Statics.field1213.method7049(field862 + 382, 0);
            Statics.field866.method7018(field862 + 382 - Statics.field866.field4559 / 2, 18);
        } else if (arg3 == 4) {
            method4983(4);
        }
    }

    @ObfuscatedName("cs.p(I)V")
    public static void method2206() {
        if (field869 != null && field869.length() > 0) {
            return;
        }
        if (Statics.field929.field1197 == null) {
            client.field513 = false;
        } else {
            field869 = Statics.field929.field1197;
            client.field513 = true;
        }
    }

    @ObfuscatedName("aa.m(I)V")
    public static void method793() {
        if (!Statics.field3173) {
            return;
        }
        Statics.field3165 = null;
        Statics.field103 = null;
        Statics.field863 = null;
        Statics.field2768 = null;
        Statics.field1213 = null;
        Statics.field866 = null;
        Statics.field874 = null;
        Statics.field154 = null;
        Statics.field4409 = null;
        Statics.field1654 = null;
        Statics.field3851 = null;
        Statics.field1334 = null;
        Statics.field1365 = null;
        Statics.field119 = null;
        Statics.field578.method2175();
        class261.field3065 = 1;
        Statics.field1487 = null;
        Statics.field1780 = -1;
        Statics.field3066 = -1;
        Statics.field959 = 0;
        Statics.field949 = false;
        Statics.field3067 = 2;
        class303.method2192(true);
        Statics.field3173 = false;
    }

    @ObfuscatedName("hk.t(B)V")
    public static void method4398() {
        if (client.field513 && field869 != null && field869.length() > 0) {
            field890 = 1;
        } else {
            field890 = 0;
        }
    }

    @ObfuscatedName("gi.s(Lam;Llx;I)V")
    public static void method3631(class32 arg0, class327 arg1) {
        if (field878) {
            while (true) {
                if (!class24.method3026()) {
                    if (class33.field234 != 1 && (Statics.field1666 || class33.field234 != 4)) {
                        break;
                    }
                    int var2 = field862 + 280;
                    if (class33.field235 >= var2 && class33.field235 <= var2 + 14 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(0, 0);
                        break;
                    }
                    if (class33.field235 >= var2 + 15 && class33.field235 <= var2 + 80 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(0, 1);
                        break;
                    }
                    int var3 = field862 + 390;
                    if (class33.field235 >= var3 && class33.field235 <= var3 + 14 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(1, 0);
                        break;
                    }
                    if (class33.field235 >= var3 + 15 && class33.field235 <= var3 + 80 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(1, 1);
                        break;
                    }
                    int var4 = field862 + 500;
                    if (class33.field235 >= var4 && class33.field235 <= var4 + 14 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(2, 0);
                        break;
                    }
                    if (class33.field235 >= var4 + 15 && class33.field235 <= var4 + 80 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(2, 1);
                        break;
                    }
                    int var5 = field862 + 610;
                    if (class33.field235 >= var5 && class33.field235 <= var5 + 14 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(3, 0);
                        break;
                    }
                    if (class33.field235 >= var5 + 15 && class33.field235 <= var5 + 80 && class33.field236 >= 4 && class33.field236 <= 18) {
                        class61.method2404(3, 1);
                        break;
                    }
                    if (class33.field235 >= field862 + 708 && class33.field236 >= 4 && class33.field235 <= field862 + 708 + 50 && class33.field236 <= 20) {
                        field878 = false;
                        Statics.field2768.method7049(field862, 0);
                        Statics.field1213.method7049(field862 + 382, 0);
                        Statics.field866.method7018(field862 + 382 - Statics.field866.field4559 / 2, 18);
                        break;
                    }
                    if (field888 == -1) {
                        if (field879 > 0 && Statics.field63 != null && class33.field235 >= 0 && class33.field235 <= Statics.field63.field4559 && class33.field236 >= Statics.field2535 / 2 - 50 && class33.field236 <= Statics.field2535 / 2 + 50) {
                            field879--;
                        }
                        if (field879 < field867 && Statics.field1303 != null && class33.field235 >= Statics.field2137 - Statics.field1303.field4559 - 5 && class33.field235 <= Statics.field2137 && class33.field236 >= Statics.field2535 / 2 - 50 && class33.field236 <= Statics.field2535 / 2 + 50) {
                            field879++;
                        }
                    } else {
                        class61 var6 = Statics.field4019[field888];
                        method3997(var6);
                        field878 = false;
                        Statics.field2768.method7049(field862, 0);
                        Statics.field1213.method7049(field862 + 382, 0);
                        Statics.field866.method7018(field862 + 382 - Statics.field866.field4559 / 2, 18);
                    }
                    break;
                }
                if (Statics.field1248 == 13) {
                    field878 = false;
                    Statics.field2768.method7049(field862, 0);
                    Statics.field1213.method7049(field862 + 382, 0);
                    Statics.field866.method7018(field862 + 382 - Statics.field866.field4559 / 2, 18);
                    break;
                }
                if (Statics.field1248 == 96) {
                    if (field879 > 0 && Statics.field63 != null) {
                        field879--;
                    }
                } else if (Statics.field1248 == 97 && field879 < field867 && Statics.field1303 != null) {
                    field879++;
                }
            }
            return;
        }
        if ((class33.field234 == 1 || !Statics.field1666 && class33.field234 == 4) && class33.field235 >= field862 + 765 - 50 && class33.field236 >= 453) {
            Statics.field929.field1203 = !Statics.field929.field1203;
            class89.method2604();
            if (Statics.field929.field1203) {
                class261.method3135();
            } else {
                class261.method2259(Statics.field2775, "scape main", "", 255, false);
            }
        }
        if (client.field478 == 5) {
            return;
        }
        if (field891 == -1L) {
            field891 = class416.method5860() + 1000L;
        }
        long var7 = class416.method5860();
        boolean var9;
        if (client.field752 == null || client.field753 >= client.field752.size()) {
            var9 = true;
        } else {
            while (true) {
                if (client.field753 >= client.field752.size()) {
                    var9 = true;
                    break;
                }
                class77 var10 = (class77) client.field752.get(client.field753);
                if (!var10.method2022()) {
                    var9 = false;
                    break;
                }
                client.field753++;
            }
        }
        if (var9 && field870 == -1L) {
            field870 = var7;
            if (field870 > field891) {
                field891 = field870;
            }
        }
        if (client.field478 != 10 && client.field478 != 11) {
            return;
        }
        if (Statics.field446 == class317.field3933) {
            if (class33.field234 == 1 || !Statics.field1666 && class33.field234 == 4) {
                int var11 = field862 + 5;
                short var12 = 463;
                byte var13 = 100;
                byte var14 = 35;
                if (class33.field235 >= var11 && class33.field235 <= var11 + var13 && class33.field236 >= var12 && class33.field236 <= var12 + var14) {
                    if (class61.method4858()) {
                        field878 = true;
                        field879 = 0;
                        field867 = 0;
                    }
                    return;
                }
            }
            if (Statics.field1828 != null && class61.method4858()) {
                field878 = true;
                field879 = 0;
                field867 = 0;
            }
        }
        int var15 = class33.field234;
        int var16 = class33.field235;
        int var17 = class33.field236;
        if (var15 == 0) {
            var16 = class33.field227;
            var17 = class33.field228;
        }
        if (!Statics.field1666 && var15 == 4) {
            var15 = 1;
        }
        if (field884 == 0) {
            boolean var18 = false;
            while (class24.method3026()) {
                if (Statics.field1248 == 84) {
                    var18 = true;
                }
            }
            int var19 = Statics.field1592 - 80;
            short var20 = 291;
            if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                class30.method4390(client.method2049("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var21 = Statics.field1592 + 80;
            if (var15 == 1 && var16 >= var21 - 75 && var16 <= var21 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20 || var18) {
                if ((client.field470 & 0x2000000) != 0) {
                    field875 = "";
                    field876 = class295.field3706;
                    field861 = class295.field3707;
                    field877 = class295.field3579;
                    method4983(1);
                    method4398();
                } else if ((client.field470 & 0x4) != 0) {
                    if ((client.field470 & 0x400) == 0) {
                        field876 = class295.field3621;
                        field861 = class295.field3698;
                        field877 = class295.field3699;
                    } else {
                        field876 = class295.field3738;
                        field861 = class295.field3704;
                        field877 = class295.field3755;
                    }
                    field875 = class295.field3696;
                    method4983(1);
                    method4398();
                } else if ((client.field470 & 0x400) == 0) {
                    Statics.method1876(false);
                } else {
                    field876 = class295.field3700;
                    field861 = class295.field3754;
                    field877 = class295.field3702;
                    field875 = class295.field3696;
                    method4983(1);
                    method4398();
                }
            }
        } else if (field884 == 1) {
            while (true) {
                if (!class24.method3026()) {
                    int var22 = Statics.field1592 - 80;
                    short var23 = 321;
                    if (var15 == 1 && var16 >= var22 - 75 && var16 <= var22 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        Statics.method1876(false);
                    }
                    int var24 = Statics.field1592 + 80;
                    if (var15 == 1 && var16 >= var24 - 75 && var16 <= var24 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        method4983(0);
                    }
                    break;
                }
                if (Statics.field1248 == 84) {
                    Statics.method1876(false);
                } else if (Statics.field1248 == 13) {
                    method4983(0);
                }
            }
        } else if (field884 == 2) {
            short var25 = 201;
            int var108 = var25 + 52;
            if (var15 == 1 && var17 >= var108 - 12 && var17 < var108 + 2) {
                field890 = 0;
            }
            var108 += 15;
            if (var15 == 1 && var17 >= var108 - 12 && var17 < var108 + 2) {
                field890 = 1;
            }
            var108 += 15;
            short var26 = 361;
            if (Statics.field2653 != null) {
                int var27 = Statics.field2653.field4177 / 2;
                if (var15 == 1 && var16 >= Statics.field2653.field4178 - var27 && var16 <= Statics.field2653.field4178 + var27 && var17 >= var26 - 15 && var17 < var26) {
                    switch(field873) {
                        case 1:
                            method304(class295.field3661, class295.field3638, class295.field3747);
                            method4983(5);
                            return;
                        case 2:
                            class30.method4390("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var28 = Statics.field1592 - 80;
            short var29 = 321;
            if (var15 == 1 && var16 >= var28 - 75 && var16 <= var28 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                field869 = field869.trim();
                if (field869.length() == 0) {
                    method304(class295.field3589, class295.field3590, class295.field3591);
                    return;
                }
                if (field880.length() == 0) {
                    method304(class295.field3570, class295.field3593, class295.field3667);
                    return;
                }
                method304(class295.field3560, class295.field3712, class295.field3713);
                client.method1704(false);
                client.method3993(20);
                return;
            }
            int var30 = field887 + 180 + 80;
            if (var15 == 1 && var16 >= var30 - 75 && var16 <= var30 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                method4983(0);
                field869 = "";
                field880 = "";
                Statics.field1652 = 0;
                Statics.field4141 = "";
                field883 = true;
            }
            int var31 = Statics.field1592 + -117;
            short var32 = 277;
            field881 = var16 >= var31 && var16 < Statics.field3919 + var31 && var17 >= var32 && var17 < Statics.field3153 + var32;
            if (var15 == 1 && field881) {
                client.field513 = !client.field513;
                if (!client.field513 && Statics.field929.field1197 != null) {
                    Statics.field929.field1197 = null;
                    class89.method2604();
                }
            }
            int var33 = Statics.field1592 + 24;
            short var34 = 277;
            field882 = var16 >= var33 && var16 < Statics.field3919 + var33 && var17 >= var34 && var17 < Statics.field3153 + var34;
            if (var15 == 1 && field882) {
                Statics.field929.field1196 = !Statics.field929.field1196;
                if (!Statics.field929.field1196) {
                    field869 = "";
                    Statics.field929.field1197 = null;
                    method4398();
                }
                class89.method2604();
            }
            label1092: while (true) {
                Transferable var40;
                int var41;
                do {
                    while (true) {
                        label1010: do {
                            while (true) {
                                while (class24.method3026()) {
                                    if (Statics.field1248 == 13) {
                                        method4983(0);
                                        field869 = "";
                                        field880 = "";
                                        Statics.field1652 = 0;
                                        Statics.field4141 = "";
                                        field883 = true;
                                    } else {
                                        if (field890 != 0) {
                                            continue label1010;
                                        }
                                        char var35 = Statics.field3955;
                                        for (int var36 = 0; var36 < field885.length() && var35 != field885.charAt(var36); var36++) {
                                        }
                                        if (Statics.field1248 == 85 && field869.length() > 0) {
                                            field869 = field869.substring(0, field869.length() - 1);
                                        }
                                        if (Statics.field1248 == 84 || Statics.field1248 == 80) {
                                            field890 = 1;
                                        }
                                        char var37 = Statics.field3955;
                                        boolean var38 = field885.indexOf(var37) != -1;
                                        if (var38 && field869.length() < 320) {
                                            field869 = field869 + Statics.field3955;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field890 != 1);
                        if (Statics.field1248 == 85 && field880.length() > 0) {
                            field880 = field880.substring(0, field880.length() - 1);
                        } else if (Statics.field1248 == 84 || Statics.field1248 == 80) {
                            field890 = 0;
                            if (Statics.field1248 == 84) {
                                field869 = field869.trim();
                                if (field869.length() == 0) {
                                    method304(class295.field3589, class295.field3590, class295.field3591);
                                    return;
                                }
                                if (field880.length() == 0) {
                                    method304(class295.field3570, class295.field3593, class295.field3667);
                                    return;
                                }
                                method304(class295.field3560, class295.field3712, class295.field3713);
                                client.method1704(false);
                                client.method3993(20);
                                return;
                            }
                        }
                        if ((class24.field156[82] || class24.field156[87]) && Statics.field1248 == 67) {
                            Clipboard var39 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var40 = var39.getContents(Statics.field3795);
                            var41 = 20 - field880.length();
                            break;
                        }
                        char var54 = Statics.field3955;
                        boolean var55;
                        if ((var54 < ' ' || var54 >= 127) && (var54 <= 127 || var54 >= 160) && (var54 <= 160 || var54 > 255)) {
                            label1221: {
                                if (var54 != 0) {
                                    char[] var56 = class329.field3998;
                                    for (int var57 = 0; var57 < var56.length; var57++) {
                                        char var58 = var56[var57];
                                        if (var54 == var58) {
                                            var55 = true;
                                            break label1221;
                                        }
                                    }
                                }
                                var55 = false;
                            }
                        } else {
                            var55 = true;
                        }
                        if (var55) {
                            char var59 = Statics.field3955;
                            boolean var60 = field885.indexOf(var59) != -1;
                            if (var60 && field880.length() < 20) {
                                field880 = field880 + Statics.field3955;
                            }
                        }
                    }
                } while (var41 <= 0);
                try {
                    String var42 = (String) var40.getTransferData(DataFlavor.stringFlavor);
                    int var43 = Math.min(var41, var42.length());
                    int var44 = 0;
                    while (true) {
                        if (var44 >= var43) {
                            field880 = field880 + var42.substring(0, var43);
                            continue label1092;
                        }
                        char var45 = var42.charAt(var44);
                        boolean var46;
                        if ((var45 < ' ' || var45 >= 127) && (var45 <= 127 || var45 >= 160) && (var45 <= 160 || var45 > 255)) {
                            label1224: {
                                if (var45 != 0) {
                                    char[] var47 = class329.field3998;
                                    for (int var48 = 0; var48 < var47.length; var48++) {
                                        char var49 = var47[var48];
                                        if (var45 == var49) {
                                            var46 = true;
                                            break label1224;
                                        }
                                    }
                                }
                                var46 = false;
                            }
                        } else {
                            var46 = true;
                        }
                        if (!var46) {
                            break;
                        }
                        char var50 = var42.charAt(var44);
                        boolean var51 = field885.indexOf(var50) != -1;
                        if (!var51) {
                            break;
                        }
                        var44++;
                    }
                    method4983(3);
                    return;
                } catch (UnsupportedFlavorException var106) {
                } catch (IOException var107) {
                }
            }
        } else if (field884 == 3) {
            int var61 = field887 + 180;
            short var62 = 276;
            if (var15 == 1 && var16 >= var61 - 75 && var16 <= var61 + 75 && var17 >= var62 - 20 && var17 <= var62 + 20) {
                method3419(false);
            }
            int var63 = field887 + 180;
            short var64 = 326;
            if (var15 == 1 && var16 >= var63 - 75 && var16 <= var63 + 75 && var17 >= var64 - 20 && var17 <= var64 + 20) {
                method304(class295.field3661, class295.field3638, class295.field3747);
                method4983(5);
                return;
            }
        } else if (field884 == 4) {
            int var65 = field887 + 180 - 80;
            short var66 = 321;
            if (var15 == 1 && var16 >= var65 - 75 && var16 <= var65 + 75 && var17 >= var66 - 20 && var17 <= var66 + 20) {
                Statics.field4141.trim();
                if (Statics.field4141.length() != 6) {
                    method304(class295.field3655, class295.field3475, class295.field3510);
                    return;
                }
                Statics.field1652 = Integer.parseInt(Statics.field4141);
                Statics.field4141 = "";
                client.method1704(true);
                method304(class295.field3560, class295.field3712, class295.field3713);
                client.method3993(20);
                return;
            }
            if (var15 == 1 && var16 >= field887 + 180 - 9 && var16 <= field887 + 180 + 130 && var17 >= 263 && var17 <= 296) {
                field883 = !field883;
            }
            if (var15 == 1 && var16 >= field887 + 180 - 34 && var16 <= field887 + 180 + 34 && var17 >= 351 && var17 <= 363) {
                class30.method4390(client.method2049("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var67 = field887 + 180 + 80;
            if (var15 == 1 && var16 >= var67 - 75 && var16 <= var67 + 75 && var17 >= var66 - 20 && var17 <= var66 + 20) {
                method4983(0);
                field869 = "";
                field880 = "";
                Statics.field1652 = 0;
                Statics.field4141 = "";
            }
            while (class24.method3026()) {
                boolean var68 = false;
                for (int var69 = 0; var69 < field886.length(); var69++) {
                    if (Statics.field3955 == field886.charAt(var69)) {
                        var68 = true;
                        break;
                    }
                }
                if (Statics.field1248 == 13) {
                    method4983(0);
                    field869 = "";
                    field880 = "";
                    Statics.field1652 = 0;
                    Statics.field4141 = "";
                } else {
                    if (Statics.field1248 == 85 && Statics.field4141.length() > 0) {
                        Statics.field4141 = Statics.field4141.substring(0, Statics.field4141.length() - 1);
                    }
                    if (Statics.field1248 == 84) {
                        Statics.field4141.trim();
                        if (Statics.field4141.length() != 6) {
                            method304(class295.field3655, class295.field3475, class295.field3510);
                            return;
                        }
                        Statics.field1652 = Integer.parseInt(Statics.field4141);
                        Statics.field4141 = "";
                        client.method1704(true);
                        method304(class295.field3560, class295.field3712, class295.field3713);
                        client.method3993(20);
                        return;
                    }
                    if (var68 && Statics.field4141.length() < 6) {
                        Statics.field4141 = Statics.field4141 + Statics.field3955;
                    }
                }
            }
        } else if (field884 == 5) {
            int var70 = field887 + 180 - 80;
            short var71 = 321;
            if (var15 == 1 && var16 >= var70 - 75 && var16 <= var70 + 75 && var17 >= var71 - 20 && var17 <= var71 + 20) {
                method4386();
                return;
            }
            int var72 = field887 + 180 + 80;
            if (var15 == 1 && var16 >= var72 - 75 && var16 <= var72 + 75 && var17 >= var71 - 20 && var17 <= var71 + 20) {
                Statics.method1876(true);
            }
            short var73 = 361;
            if (Statics.field1045 != null) {
                int var74 = Statics.field1045.field4177 / 2;
                if (var15 == 1 && var16 >= Statics.field1045.field4178 - var74 && var16 <= Statics.field1045.field4178 + var74 && var17 >= var73 - 15 && var17 < var73) {
                    class30.method4390(client.method2049("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method3026()) {
                boolean var75 = false;
                for (int var76 = 0; var76 < field885.length(); var76++) {
                    if (Statics.field3955 == field885.charAt(var76)) {
                        var75 = true;
                        break;
                    }
                }
                if (Statics.field1248 == 13) {
                    Statics.method1876(true);
                } else {
                    if (Statics.field1248 == 85 && field869.length() > 0) {
                        field869 = field869.substring(0, field869.length() - 1);
                    }
                    if (Statics.field1248 == 84) {
                        method4386();
                        return;
                    }
                    if (var75 && field869.length() < 320) {
                        field869 = field869 + Statics.field3955;
                    }
                }
            }
        } else if (field884 == 6) {
            while (true) {
                do {
                    if (!class24.method3026()) {
                        short var77 = 321;
                        if (var15 == 1 && var17 >= var77 - 20 && var17 <= var77 + 20) {
                            Statics.method1876(true);
                        }
                        return;
                    }
                } while (Statics.field1248 != 84 && Statics.field1248 != 13);
                Statics.method1876(true);
            }
        } else if (field884 == 7) {
            int var78 = field887 + 180 - 80;
            short var79 = 321;
            if (var15 == 1 && var16 >= var78 - 75 && var16 <= var78 + 75 && var17 >= var79 - 20 && var17 <= var79 + 20) {
                class30.method4390(client.method2049("secure", true) + "m=dob/set_dob.ws", true, false);
                method304(class295.field3742, class295.field3743, class295.field3744);
                method4983(6);
                return;
            }
            int var80 = field887 + 180 + 80;
            if (var15 == 1 && var16 >= var80 - 75 && var16 <= var80 + 75 && var17 >= var79 - 20 && var17 <= var79 + 20) {
                Statics.method1876(true);
            }
        } else if (field884 == 8) {
            int var81 = field887 + 180 - 80;
            short var82 = 321;
            if (var15 == 1 && var16 >= var81 - 75 && var16 <= var81 + 75 && var17 >= var82 - 20 && var17 <= var82 + 20) {
                class30.method4390("https://www.jagex.com/terms/privacy", true, false);
                method304(class295.field3742, class295.field3743, class295.field3744);
                method4983(6);
                return;
            }
            int var83 = field887 + 180 + 80;
            if (var15 == 1 && var16 >= var83 - 75 && var16 <= var83 + 75 && var17 >= var82 - 20 && var17 <= var82 + 20) {
                Statics.method1876(true);
            }
        } else if (field884 == 9) {
            int var84 = field887 + 180;
            short var85 = 311;
            if (Statics.field1248 == 84 || Statics.field1248 == 13 || var15 == 1 && var16 >= var84 - 75 && var16 <= var84 + 75 && var17 >= var85 - 20 && var17 <= var85 + 20) {
                method3419(false);
            }
        } else if (field884 == 10) {
            int var86 = field887 + 180;
            short var87 = 209;
            if (Statics.field1248 == 84 || var15 == 1 && var16 >= var86 - 109 && var16 <= var86 + 109 && var17 >= var87 && var17 <= var87 + 68) {
                method304(class295.field3560, class295.field3712, class295.field3713);
                client.field509 = class423.field4525;
                client.method1704(false);
                client.method3993(20);
            }
        } else if (field884 == 12) {
            int var88 = Statics.field1592;
            short var89 = 233;
            class363 var90 = arg1.method5521(0, 30, class295.field3771, var88, var89);
            class363 var91 = arg1.method5521(32, 32, class295.field3771, var88, var89);
            class363 var92 = arg1.method5521(70, 34, class295.field3771, var88, var89);
            int var109 = var89 + 17;
            class363 var93 = arg1.method5521(0, 34, class295.field3526, var88, var109);
            if (var15 == 1) {
                if (var90.method5934(var16, var17)) {
                    class30.method4390("https://www.jagex.com/terms", true, false);
                } else if (var91.method5934(var16, var17)) {
                    class30.method4390("https://www.jagex.com/terms/privacy", true, false);
                } else if (var92.method5934(var16, var17) || var93.method5934(var16, var17)) {
                    class30.method4390("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var94 = Statics.field1592 - 80;
            short var95 = 311;
            if (var15 == 1 && var16 >= var94 - 75 && var16 <= var94 + 75 && var17 >= var95 - 20 && var17 <= var95 + 20) {
                client.method2426();
                method3419(true);
            }
            int var96 = Statics.field1592 + 80;
            if (var15 == 1 && var16 >= var96 - 75 && var16 <= var96 + 75 && var17 >= var95 - 20 && var17 <= var95 + 20) {
                field884 = 13;
            }
        } else if (field884 == 13) {
            int var97 = Statics.field1592;
            short var98 = 321;
            if (var15 == 1 && var16 >= var97 - 75 && var16 <= var97 + 75 && var17 >= var98 - 20 && var17 <= var98 + 20) {
                method3419(true);
            }
        } else if (field884 == 14) {
            String var99 = "";
            switch(field872) {
                case 0:
                    var99 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var99 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    Statics.method1876(false);
            }
            int var100 = field887 + 180;
            short var101 = 276;
            if (var15 == 1 && var16 >= var100 - 75 && var16 <= var100 + 75 && var17 >= var101 - 20 && var17 <= var101 + 20) {
                class30.method4390(var99, true, false);
                method304(class295.field3742, class295.field3743, class295.field3744);
                method4983(6);
                return;
            }
            int var102 = field887 + 180;
            short var103 = 326;
            if (var15 == 1 && var16 >= var102 - 75 && var16 <= var102 + 75 && var17 >= var103 - 20 && var17 <= var103 + 20) {
                Statics.method1876(false);
            }
        } else if (field884 == 24) {
            int var104 = field887 + 180;
            short var105 = 301;
            if (var15 == 1 && var16 >= var104 - 75 && var16 <= var104 + 75 && var17 >= var105 - 20 && var17 <= var105 + 20) {
                method3419(false);
            }
        }
    }

    @ObfuscatedName("gj.w(ZI)V")
    public static void method3419(boolean arg0) {
        byte var1 = 0;
        if (!client.method2242()) {
            var1 = 12;
        } else if (Statics.field3795.method1087()) {
            var1 = 10;
        }
        method4983(var1);
        if (arg0) {
            field869 = "";
            field880 = "";
            Statics.field1652 = 0;
            Statics.field4141 = "";
        }
        method2206();
        method4398();
    }

    @ObfuscatedName("hs.n(B)V")
    public static void method4386() {
        field869 = field869.trim();
        if (field869.length() == 0) {
            method304(class295.field3661, class295.field3638, class295.field3747);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2049("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class419 var4 = new class419(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4477, var4.field4475, 1000 - var4.field4475);
                if (var5 == -1) {
                    var4.field4475 = 0;
                    long var8 = var4.method6676();
                    var6 = var8;
                    break;
                }
                var4.field4475 += var5;
                if (var4.field4475 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var42) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field869;
            Random var15 = new Random();
            class419 var16 = new class419(128);
            class419 var17 = new class419(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method6841(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method6656(var15.nextInt());
            }
            var16.method6656(var18[0]);
            var16.method6656(var18[1]);
            var16.method6729(var6);
            var16.method6729(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method6656(var15.nextInt());
            }
            var16.method6694(class66.field842, class66.field843);
            var17.method6841(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method6656(var15.nextInt());
            }
            var17.method6729(var15.nextLong());
            var17.method6653(var15.nextLong());
            client.method1017(var17);
            var17.method6729(var15.nextLong());
            var17.method6694(class66.field842, class66.field843);
            int var22 = class419.method2537(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class419 var23 = new class419(var22);
            var23.method6660(var14);
            var23.field4475 = var22;
            var23.method6690(var18);
            class419 var24 = new class419(var23.field4475 + var17.field4475 + var16.field4475 + 5);
            var24.method6841(2);
            var24.method6841(var16.field4475);
            var24.method6678(var16.field4477, 0, var16.field4475);
            var24.method6841(var17.field4475);
            var24.method6678(var17.field4477, 0, var17.field4475);
            var24.method6654(var23.field4475);
            var24.method6678(var23.field4477, 0, var23.field4475);
            byte[] var25 = var24.field4477;
            String var26 = class330.method2122(var25, 0, var25.length);
            String var27 = var26;
            byte var34;
            try {
                URL var28 = new URL(client.method2049("services", false) + "m=accountappeal/login.ws");
                URLConnection var29 = var28.openConnection();
                var29.setDoInput(true);
                var29.setDoOutput(true);
                var29.setConnectTimeout(5000);
                OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
                var30.write("data2=" + class442.method4593(var27) + "&dest=" + class442.method4593("passwordchoice.ws"));
                var30.flush();
                InputStream var31 = var29.getInputStream();
                class419 var32 = new class419(new byte[1000]);
                while (true) {
                    int var33 = var31.read(var32.field4477, var32.field4475, 1000 - var32.field4475);
                    if (var33 == -1) {
                        var30.close();
                        var31.close();
                        String var35 = new String(var32.field4477);
                        if (var35.startsWith("OFFLINE")) {
                            var34 = 4;
                        } else if (var35.startsWith("WRONG")) {
                            var34 = 7;
                        } else if (var35.startsWith("RELOAD")) {
                            var34 = 3;
                        } else if (var35.startsWith("Not permitted for social network accounts.")) {
                            var34 = 6;
                        } else {
                            var32.method6768(var18);
                            while (var32.field4475 > 0 && var32.field4477[var32.field4475 - 1] == 0) {
                                var32.field4475--;
                            }
                            String var36 = new String(var32.field4477, 0, var32.field4475);
                            boolean var37;
                            if (var36 == null) {
                                var37 = false;
                            } else {
                                label100: {
                                    try {
                                        new URL(var36);
                                    } catch (MalformedURLException var40) {
                                        var37 = false;
                                        break label100;
                                    }
                                    var37 = true;
                                }
                            }
                            if (var37) {
                                class30.method4390(var36, true, false);
                                var34 = 2;
                            } else {
                                var34 = 5;
                            }
                        }
                        break;
                    }
                    var32.field4475 += var33;
                    if (var32.field4475 >= 1000) {
                        var34 = 5;
                        break;
                    }
                }
            } catch (Throwable var41) {
                var41.printStackTrace();
                var34 = 5;
            }
            var13 = var34;
        }
        switch(var13) {
            case 2:
                method304(class295.field3748, class295.field3552, class295.field3750);
                method4983(6);
                break;
            case 3:
                method304(class295.field3478, class295.field3752, class295.field3753);
                break;
            case 4:
                method304(class295.field3657, class295.field3601, class295.field3756);
                break;
            case 5:
                method304(class295.field3627, class295.field3653, class295.field3680);
                break;
            case 6:
                method304(class295.field3760, class295.field3634, class295.field3762);
                break;
            case 7:
                method304(class295.field3763, class295.field3731, class295.field3571);
        }
    }

    @ObfuscatedName("if.r(Llx;Llx;Llx;I)V")
    public static void method4530(class327 arg0, class327 arg1, class327 arg2) {
        field862 = (Statics.field2137 - 765) / 2;
        field887 = field862 + 202;
        Statics.field1592 = field887 + 180;
        if (field878) {
            method5283(arg0, arg1);
            return;
        }
        Statics.field2768.method7049(field862, 0);
        Statics.field1213.method7049(field862 + 382, 0);
        Statics.field866.method7018(field862 + 382 - Statics.field866.field4559 / 2, 18);
        if (client.field478 == 0 || client.field478 == 5) {
            byte var3 = 20;
            arg0.method5454(class295.field3692, field887 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class428.method6994(field887 + 180 - 152, var4, 304, 34, 9179409);
            class428.method6994(field887 + 180 - 151, var4 + 1, 302, 32, 0);
            class428.method6943(field887 + 180 - 150, var4 + 2, field868 * 3, 30, 9179409);
            class428.method6943(field868 * 3 + (field887 + 180 - 150), var4 + 2, 300 - field868 * 3, 30, 0);
            arg0.method5454(field871, field887 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field478 == 20) {
            Statics.field3165.method7018(field887 + 180 - Statics.field3165.field4559 / 2, 271 - Statics.field3165.field4560 / 2);
            short var5 = 201;
            arg0.method5454(field876, field887 + 180, var5, 16776960, 0);
            int var100 = var5 + 15;
            arg0.method5454(field861, field887 + 180, var100, 16776960, 0);
            int var101 = var100 + 15;
            arg0.method5454(field877, field887 + 180, var101, 16776960, 0);
            int var102 = var101 + 15;
            int var103 = var102 + 7;
            if (field884 != 4 && field884 != 10) {
                arg0.method5462(class295.field3720, field887 + 180 - 110, var103, 16777215, 0);
                short var6 = 200;
                String var7 = Statics.field929.field1196 ? class331.method4542(field869) : field869;
                String var8;
                for (var8 = var7; arg0.method5487(var8) > var6; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method5462(class328.method5460(var8), field887 + 180 - 70, var103, 16777215, 0);
                var100 = var103 + 15;
                String var9;
                for (var9 = class331.method4542(field880); arg0.method5487(var9) > var6; var9 = var9.substring(1)) {
                }
                arg0.method5462(class295.field3721 + var9, field887 + 180 - 108, var100, 16777215, 0);
                var100 += 15;
            }
        }
        if (client.field478 == 10 || client.field478 == 11) {
            Statics.field3165.method7018(field887, 171);
            if (field884 == 0) {
                short var10 = 251;
                arg0.method5454(class295.field3723, field887 + 180, var10, 16776960, 0);
                int var104 = var10 + 30;
                int var11 = field887 + 180 - 80;
                short var12 = 291;
                Statics.field103.method7018(var11 - 73, var12 - 20);
                arg0.method5466(class295.field3724, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field887 + 180 + 80;
                Statics.field103.method7018(var13 - 73, var12 - 20);
                arg0.method5466(class295.field3714, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field884 == 1) {
                arg0.method5454(field875, field887 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method5454(field876, field887 + 180, var14, 16777215, 0);
                int var105 = var14 + 15;
                arg0.method5454(field861, field887 + 180, var105, 16777215, 0);
                int var106 = var105 + 15;
                arg0.method5454(field877, field887 + 180, var106, 16777215, 0);
                int var107 = var106 + 15;
                int var15 = field887 + 180 - 80;
                short var16 = 321;
                Statics.field103.method7018(var15 - 73, var16 - 20);
                arg0.method5454(class295.field3539, var15, var16 + 5, 16777215, 0);
                int var17 = field887 + 180 + 80;
                Statics.field103.method7018(var17 - 73, var16 - 20);
                arg0.method5454(class295.field3746, var17, var16 + 5, 16777215, 0);
            } else if (field884 == 2) {
                short var18 = 201;
                arg0.method5454(field876, Statics.field1592, var18, 16776960, 0);
                int var108 = var18 + 15;
                arg0.method5454(field861, Statics.field1592, var108, 16776960, 0);
                int var109 = var108 + 15;
                arg0.method5454(field877, Statics.field1592, var109, 16776960, 0);
                int var110 = var109 + 15;
                int var111 = var110 + 7;
                arg0.method5462(class295.field3720, Statics.field1592 - 110, var111, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field929.field1196 ? class331.method4542(field869) : field869;
                String var21;
                for (var21 = var20; arg0.method5487(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method5462(class328.method5460(var21) + (field890 == 0 & client.field481 % 40 < 20 ? class92.method2397(16776960) + class92.field1216 : ""), Statics.field1592 - 70, var111, 16777215, 0);
                var108 = var111 + 15;
                String var22;
                for (var22 = class331.method4542(field880); arg0.method5487(var22) > var19; var22 = var22.substring(1)) {
                }
                arg0.method5462(class295.field3721 + var22 + (field890 == 1 & client.field481 % 40 < 20 ? class92.method2397(16776960) + class92.field1216 : ""), Statics.field1592 - 108, var108, 16777215, 0);
                var108 += 15;
                short var23 = 277;
                int var24 = Statics.field1592 + -117;
                boolean var25 = client.field513;
                boolean var26 = field881;
                class431 var27 = var25 ? (var26 ? Statics.field889 : Statics.field4409) : (var26 ? Statics.field1337 : Statics.field154);
                var27.method7018(var24, var23);
                int var29 = var27.field4559 + 5 + var24;
                arg1.method5462(class295.field3728, var29, var23 + 13, 16776960, 0);
                int var30 = Statics.field1592 + 24;
                boolean var31 = Statics.field929.field1196;
                boolean var32 = field882;
                class431 var33 = var31 ? (var32 ? Statics.field889 : Statics.field4409) : (var32 ? Statics.field1337 : Statics.field154);
                var33.method7018(var30, var23);
                int var35 = var33.field4559 + 5 + var30;
                arg1.method5462(class295.field3729, var35, var23 + 13, 16776960, 0);
                int var112 = var23 + 15;
                int var36 = Statics.field1592 - 80;
                short var37 = 321;
                Statics.field103.method7018(var36 - 73, var37 - 20);
                arg0.method5454(class295.field3726, var36, var37 + 5, 16777215, 0);
                int var38 = Statics.field1592 + 80;
                Statics.field103.method7018(var38 - 73, var37 - 20);
                arg0.method5454(class295.field3746, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                switch(field873) {
                    case 2:
                        Statics.field59 = class295.field3741;
                        break;
                    default:
                        Statics.field59 = class295.field3739;
                }
                Statics.field2653 = new class363(Statics.field1592, var39, arg1.method5487(Statics.field59), 11);
                Statics.field1045 = new class363(Statics.field1592, var39, arg1.method5487(class295.field3740), 11);
                arg1.method5454(Statics.field59, Statics.field1592, var39, 16777215, 0);
            } else if (field884 == 3) {
                short var40 = 201;
                arg0.method5454(class295.field3730, field887 + 180, var40, 16776960, 0);
                int var113 = var40 + 20;
                arg1.method5454(class295.field3490, field887 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg1.method5454(class295.field3732, field887 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var41 = field887 + 180;
                short var42 = 276;
                Statics.field103.method7018(var41 - 73, var42 - 20);
                arg2.method5454(class295.field3733, var41, var42 + 5, 16777215, 0);
                int var43 = field887 + 180;
                short var44 = 326;
                Statics.field103.method7018(var43 - 73, var44 - 20);
                arg2.method5454(class295.field3734, var43, var44 + 5, 16777215, 0);
            } else if (field884 == 4) {
                arg0.method5454(class295.field3665, field887 + 180, 201, 16776960, 0);
                short var45 = 236;
                arg0.method5454(field876, field887 + 180, var45, 16777215, 0);
                int var116 = var45 + 15;
                arg0.method5454(field861, field887 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                arg0.method5454(field877, field887 + 180, var117, 16777215, 0);
                int var118 = var117 + 15;
                arg0.method5462(class295.field3722 + class331.method4542(Statics.field4141) + (client.field481 % 40 < 20 ? class92.method2397(16776960) + class92.field1216 : ""), field887 + 180 - 108, var118, 16777215, 0);
                int var119 = var118 - 8;
                arg0.method5462(class295.field3535, field887 + 180 - 9, var119, 16776960, 0);
                int var120 = var119 + 15;
                arg0.method5462(class295.field3758, field887 + 180 - 9, var120, 16776960, 0);
                int var46 = field887 + 180 - 9 + arg0.method5487(class295.field3758) + 15;
                int var47 = var120 - arg0.field3989;
                class431 var48;
                if (field883) {
                    var48 = Statics.field4409;
                } else {
                    var48 = Statics.field154;
                }
                var48.method7018(var46, var47);
                var116 = var120 + 15;
                int var49 = field887 + 180 - 80;
                short var50 = 321;
                Statics.field103.method7018(var49 - 73, var50 - 20);
                arg0.method5454(class295.field3539, var49, var50 + 5, 16777215, 0);
                int var51 = field887 + 180 + 80;
                Statics.field103.method7018(var51 - 73, var50 - 20);
                arg0.method5454(class295.field3746, var51, var50 + 5, 16777215, 0);
                arg1.method5454(class295.field3710, field887 + 180, var50 + 36, 255, 0);
            } else if (field884 == 5) {
                arg0.method5454(class295.field3718, field887 + 180, 201, 16776960, 0);
                short var52 = 221;
                arg2.method5454(field876, field887 + 180, var52, 16776960, 0);
                int var121 = var52 + 15;
                arg2.method5454(field861, field887 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg2.method5454(field877, field887 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                int var124 = var123 + 14;
                arg0.method5462(class295.field3736, field887 + 180 - 145, var124, 16777215, 0);
                short var53 = 174;
                String var54 = Statics.field929.field1196 ? class331.method4542(field869) : field869;
                String var55;
                for (var55 = var54; arg0.method5487(var55) > var53; var55 = var55.substring(1)) {
                }
                arg0.method5462(class328.method5460(var55) + (client.field481 % 40 < 20 ? class92.method2397(16776960) + class92.field1216 : ""), field887 + 180 - 34, var124, 16777215, 0);
                var121 = var124 + 15;
                int var56 = field887 + 180 - 80;
                short var57 = 321;
                Statics.field103.method7018(var56 - 73, var57 - 20);
                arg0.method5454(class295.field3737, var56, var57 + 5, 16777215, 0);
                int var58 = field887 + 180 + 80;
                Statics.field103.method7018(var58 - 73, var57 - 20);
                arg0.method5454(class295.field3586, var58, var57 + 5, 16777215, 0);
                short var59 = 356;
                arg1.method5454(class295.field3740, Statics.field1592, var59, 268435455, 0);
            } else if (field884 == 6) {
                short var60 = 201;
                arg0.method5454(field876, field887 + 180, var60, 16776960, 0);
                int var125 = var60 + 15;
                arg0.method5454(field861, field887 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg0.method5454(field877, field887 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var61 = field887 + 180;
                short var62 = 321;
                Statics.field103.method7018(var61 - 73, var62 - 20);
                arg0.method5454(class295.field3586, var61, var62 + 5, 16777215, 0);
            } else if (field884 == 7) {
                short var63 = 216;
                arg0.method5454(class295.field3766, field887 + 180, var63, 16776960, 0);
                int var128 = var63 + 15;
                arg2.method5454(class295.field3767, field887 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg2.method5454(class295.field3768, field887 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var64 = field887 + 180 - 80;
                short var65 = 321;
                Statics.field103.method7018(var64 - 73, var65 - 20);
                arg0.method5454(class295.field3770, var64, var65 + 5, 16777215, 0);
                int var66 = field887 + 180 + 80;
                Statics.field103.method7018(var66 - 73, var65 - 20);
                arg0.method5454(class295.field3586, var66, var65 + 5, 16777215, 0);
            } else if (field884 == 8) {
                short var67 = 216;
                arg0.method5454(class295.field3566, field887 + 180, var67, 16776960, 0);
                int var131 = var67 + 15;
                arg2.method5454(class295.field3608, field887 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg2.method5454(class295.field3609, field887 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var68 = field887 + 180 - 80;
                short var69 = 321;
                Statics.field103.method7018(var68 - 73, var69 - 20);
                arg0.method5454(class295.field3610, var68, var69 + 5, 16777215, 0);
                int var70 = field887 + 180 + 80;
                Statics.field103.method7018(var70 - 73, var69 - 20);
                arg0.method5454(class295.field3586, var70, var69 + 5, 16777215, 0);
            } else if (field884 == 9) {
                short var71 = 221;
                arg0.method5454(field876, field887 + 180, var71, 16776960, 0);
                int var134 = var71 + 25;
                arg0.method5454(field861, field887 + 180, var134, 16776960, 0);
                int var135 = var134 + 25;
                arg0.method5454(field877, field887 + 180, var135, 16776960, 0);
                int var72 = field887 + 180;
                short var73 = 311;
                Statics.field103.method7018(var72 - 73, var73 - 20);
                arg0.method5454(class295.field3733, var72, var73 + 5, 16777215, 0);
            } else if (field884 == 10) {
                int var74 = field887 + 180;
                short var75 = 209;
                arg0.method5454(class295.field3723, field887 + 180, var75, 16776960, 0);
                int var136 = var75 + 20;
                Statics.field895.method7018(var74 - 109, var136);
                Statics.field865.method7018(var74 - 48, var136 + 18);
            } else if (field884 == 12) {
                int var76 = Statics.field1592;
                short var77 = 216;
                arg2.method5454(class295.field3757, var76, var77, 16777215, 0);
                int var137 = var77 + 17;
                arg2.method5454(class295.field3771, var76, var137, 16777215, 0);
                int var138 = var137 + 17;
                arg2.method5454(class295.field3526, var76, var138, 16777215, 0);
                int var139 = var138 + 17;
                arg2.method5454(class295.field3749, var76, var139, 16777215, 0);
                int var78 = Statics.field1592 - 80;
                short var79 = 311;
                Statics.field103.method7018(var78 - 73, var79 - 20);
                arg0.method5454(class295.field3577, var78, var79 + 5, 16777215, 0);
                int var80 = Statics.field1592 + 80;
                Statics.field103.method7018(var80 - 73, var79 - 20);
                arg0.method5454(class295.field3777, var80, var79 + 5, 16777215, 0);
            } else if (field884 == 13) {
                short var81 = 231;
                arg2.method5454(class295.field3774, field887 + 180, var81, 16777215, 0);
                int var140 = var81 + 20;
                arg2.method5454(class295.field3775, field887 + 180, var140, 16777215, 0);
                int var82 = field887 + 180;
                short var83 = 311;
                Statics.field103.method7018(var82 - 73, var83 - 20);
                arg0.method5454(class295.field3586, var82, var83 + 5, 16777215, 0);
            } else if (field884 == 14) {
                short var84 = 201;
                String var85 = "";
                String var86 = "";
                String var87 = "";
                switch(field872) {
                    case 0:
                        var85 = class295.field3523;
                        var86 = class295.field3524;
                        var87 = class295.field3533;
                        break;
                    case 1:
                        var85 = class295.field3562;
                        var86 = class295.field3563;
                        var87 = class295.field3564;
                        break;
                    default:
                        Statics.method1876(false);
                }
                arg0.method5454(var85, field887 + 180, var84, 16776960, 0);
                int var141 = var84 + 15;
                arg2.method5454(var86, field887 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg2.method5454(var87, field887 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var88 = field887 + 180;
                short var89 = 276;
                Statics.field103.method7018(var88 - 73, var89 - 20);
                arg0.method5454(class295.field3664, var88, var89 + 5, 16777215, 0);
                int var90 = field887 + 180;
                short var91 = 326;
                Statics.field103.method7018(var90 - 73, var91 - 20);
                arg0.method5454(class295.field3586, var90, var91 + 5, 16777215, 0);
            } else if (field884 == 24) {
                short var92 = 221;
                arg0.method5454(field876, field887 + 180, var92, 16777215, 0);
                int var144 = var92 + 15;
                arg0.method5454(field861, field887 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                arg0.method5454(field877, field887 + 180, var145, 16777215, 0);
                int var146 = var145 + 15;
                int var93 = field887 + 180;
                short var94 = 301;
                Statics.field103.method7018(var93 - 73, var94 - 20);
                arg0.method5454(class295.field3473, var93, var94 + 5, 16777215, 0);
            }
        }
        if (client.field478 >= 10) {
            int[] var95 = new int[4];
            class428.method6937(var95);
            class428.method6935(field862, 0, field862 + 765, Statics.field2535);
            Statics.field578.method2149(field862 - 22, client.field481);
            Statics.field578.method2149(field862 + 765 + 22 - 128, client.field481);
            class428.method6938(var95);
        }
        Statics.field874[Statics.field929.field1203 ? 1 : 0].method7018(field862 + 765 - 40, 463);
        if (client.field478 <= 5 || Statics.field446 != class317.field3933) {
            return;
        }
        if (Statics.field119 == null) {
            Statics.field119 = class433.method2193(Statics.field1348, "sl_button", "");
            return;
        }
        int var96 = field862 + 5;
        short var97 = 463;
        byte var98 = 100;
        byte var99 = 35;
        Statics.field119.method7018(var96, var97);
        arg0.method5454(class295.field3506 + " " + client.field469, var98 / 2 + var96, var99 / 2 + var97 - 2, 16777215, 0);
        if (Statics.field1828 == null) {
            arg1.method5454(class295.field3788, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
        } else {
            arg1.method5454(class295.field3787, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("f.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method304(String arg0, String arg1, String arg2) {
        field876 = arg0;
        field861 = arg1;
        field877 = arg2;
    }

    @ObfuscatedName("lf.v(Llx;Llx;I)V")
    public static void method5283(class327 arg0, class327 arg1) {
        if (Statics.field1654 == null) {
            class300 var2 = Statics.field1348;
            int var3 = var2.method5118("sl_back");
            int var4 = var2.method5070(var3, "");
            class432[] var5;
            if (Statics.method2755(var2, var3, var4)) {
                class432[] var6 = new class432[Statics.field4614];
                int var7 = 0;
                while (true) {
                    if (var7 >= Statics.field4614) {
                        class433.method2406();
                        var5 = var6;
                        break;
                    }
                    class432 var8 = var6[var7] = new class432();
                    var8.field4570 = Statics.field4581;
                    var8.field4573 = Statics.field4578;
                    var8.field4572 = Statics.field1607[var7];
                    var8.field4569 = Statics.field2119[var7];
                    var8.field4566 = Statics.field4579[var7];
                    var8.field4567 = Statics.field4008[var7];
                    int var9 = var8.field4567 * var8.field4566;
                    byte[] var10 = Statics.field4218[var7];
                    var8.field4571 = new int[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var8.field4571[var11] = Statics.field4580[var10[var11] & 0xFF];
                    }
                    var7++;
                }
            } else {
                var5 = null;
            }
            Statics.field1654 = var5;
        }
        if (Statics.field3851 == null) {
            class300 var14 = Statics.field1348;
            int var15 = var14.method5118("sl_flags");
            int var16 = var14.method5070(var15, "");
            class431[] var17;
            if (Statics.method2755(var14, var15, var16)) {
                class431[] var18 = new class431[Statics.field4614];
                for (int var19 = 0; var19 < Statics.field4614; var19++) {
                    class431 var20 = var18[var19] = new class431();
                    var20.field4563 = Statics.field4581;
                    var20.field4564 = Statics.field4578;
                    var20.field4558 = Statics.field1607[var19];
                    var20.field4562 = Statics.field2119[var19];
                    var20.field4559 = Statics.field4579[var19];
                    var20.field4560 = Statics.field4008[var19];
                    var20.field4561 = Statics.field4580;
                    var20.field4557 = Statics.field4218[var19];
                }
                class433.method2406();
                var17 = var18;
            } else {
                var17 = null;
            }
            Statics.field3851 = var17;
        }
        if (Statics.field1334 == null) {
            class300 var23 = Statics.field1348;
            int var24 = var23.method5118("sl_arrows");
            int var25 = var23.method5070(var24, "");
            class431[] var26;
            if (Statics.method2755(var23, var24, var25)) {
                class431[] var27 = new class431[Statics.field4614];
                for (int var28 = 0; var28 < Statics.field4614; var28++) {
                    class431 var29 = var27[var28] = new class431();
                    var29.field4563 = Statics.field4581;
                    var29.field4564 = Statics.field4578;
                    var29.field4558 = Statics.field1607[var28];
                    var29.field4562 = Statics.field2119[var28];
                    var29.field4559 = Statics.field4579[var28];
                    var29.field4560 = Statics.field4008[var28];
                    var29.field4561 = Statics.field4580;
                    var29.field4557 = Statics.field4218[var28];
                }
                class433.method2406();
                var26 = var27;
            } else {
                var26 = null;
            }
            Statics.field1334 = var26;
        }
        if (Statics.field1365 == null) {
            class300 var32 = Statics.field1348;
            int var33 = var32.method5118("sl_stars");
            int var34 = var32.method5070(var33, "");
            class431[] var35;
            if (Statics.method2755(var32, var33, var34)) {
                class431[] var36 = new class431[Statics.field4614];
                for (int var37 = 0; var37 < Statics.field4614; var37++) {
                    class431 var38 = var36[var37] = new class431();
                    var38.field4563 = Statics.field4581;
                    var38.field4564 = Statics.field4578;
                    var38.field4558 = Statics.field1607[var37];
                    var38.field4562 = Statics.field2119[var37];
                    var38.field4559 = Statics.field4579[var37];
                    var38.field4560 = Statics.field4008[var37];
                    var38.field4561 = Statics.field4580;
                    var38.field4557 = Statics.field4218[var37];
                }
                class433.method2406();
                var35 = var36;
            } else {
                var35 = null;
            }
            Statics.field1365 = var35;
        }
        if (Statics.field63 == null) {
            Statics.field63 = class433.method2193(Statics.field1348, "leftarrow", "");
        }
        if (Statics.field1303 == null) {
            Statics.field1303 = class433.method2193(Statics.field1348, "rightarrow", "");
        }
        class428.method6943(field862, 23, 765, 480, 0);
        class428.method6944(field862, 0, 125, 23, 12425273, 9135624);
        class428.method6944(field862 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5454(class295.field3598, field862 + 62, 15, 0, -1);
        if (Statics.field1365 != null) {
            Statics.field1365[1].method7018(field862 + 140, 1);
            arg1.method5462(class295.field3779, field862 + 152, 10, 16777215, -1);
            Statics.field1365[0].method7018(field862 + 140, 12);
            arg1.method5462(class295.field3780, field862 + 152, 21, 16777215, -1);
        }
        if (Statics.field1334 != null) {
            int var41 = field862 + 280;
            if (class61.field766[0] == 0 && class61.field765[0] == 0) {
                Statics.field1334[2].method7018(var41, 4);
            } else {
                Statics.field1334[0].method7018(var41, 4);
            }
            if (class61.field766[0] == 0 && class61.field765[0] == 1) {
                Statics.field1334[3].method7018(var41 + 15, 4);
            } else {
                Statics.field1334[1].method7018(var41 + 15, 4);
            }
            arg0.method5462(class295.field3781, var41 + 32, 17, 16777215, -1);
            int var42 = field862 + 390;
            if (class61.field766[0] == 1 && class61.field765[0] == 0) {
                Statics.field1334[2].method7018(var42, 4);
            } else {
                Statics.field1334[0].method7018(var42, 4);
            }
            if (class61.field766[0] == 1 && class61.field765[0] == 1) {
                Statics.field1334[3].method7018(var42 + 15, 4);
            } else {
                Statics.field1334[1].method7018(var42 + 15, 4);
            }
            arg0.method5462(class295.field3670, var42 + 32, 17, 16777215, -1);
            int var43 = field862 + 500;
            if (class61.field766[0] == 2 && class61.field765[0] == 0) {
                Statics.field1334[2].method7018(var43, 4);
            } else {
                Statics.field1334[0].method7018(var43, 4);
            }
            if (class61.field766[0] == 2 && class61.field765[0] == 1) {
                Statics.field1334[3].method7018(var43 + 15, 4);
            } else {
                Statics.field1334[1].method7018(var43 + 15, 4);
            }
            arg0.method5462(class295.field3783, var43 + 32, 17, 16777215, -1);
            int var44 = field862 + 610;
            if (class61.field766[0] == 3 && class61.field765[0] == 0) {
                Statics.field1334[2].method7018(var44, 4);
            } else {
                Statics.field1334[0].method7018(var44, 4);
            }
            if (class61.field766[0] == 3 && class61.field765[0] == 1) {
                Statics.field1334[3].method7018(var44 + 15, 4);
            } else {
                Statics.field1334[1].method7018(var44 + 15, 4);
            }
            arg0.method5462(class295.field3784, var44 + 32, 17, 16777215, -1);
        }
        class428.method6943(field862 + 708, 4, 50, 16, 0);
        arg1.method5454(class295.field3746, field862 + 708 + 25, 16, 16777215, -1);
        field888 = -1;
        if (Statics.field1654 != null) {
            byte var45 = 88;
            byte var46 = 19;
            int var47 = 765 / (var45 + 1) - 1;
            int var48 = 480 / (var46 + 1);
            int var49;
            int var50;
            do {
                var49 = var48;
                var50 = var47;
                if ((var47 - 1) * var48 >= class61.field763) {
                    var47--;
                }
                if ((var48 - 1) * var47 >= class61.field763) {
                    var48--;
                }
                if ((var48 - 1) * var47 >= class61.field763) {
                    var48--;
                }
            } while (var48 != var49 || var47 != var50);
            int var51 = (765 - var45 * var47) / (var47 + 1);
            if (var51 > 5) {
                var51 = 5;
            }
            int var52 = (480 - var46 * var48) / (var48 + 1);
            if (var52 > 5) {
                var52 = 5;
            }
            int var53 = (765 - var45 * var47 - (var47 - 1) * var51) / 2;
            int var54 = (480 - var46 * var48 - (var48 - 1) * var52) / 2;
            int var55 = (class61.field763 + var48 - 1) / var48;
            field867 = var55 - var47;
            if (Statics.field63 != null && field879 > 0) {
                Statics.field63.method7018(8, Statics.field2535 / 2 - Statics.field63.field4560 / 2);
            }
            if (Statics.field1303 != null && field879 < field867) {
                Statics.field1303.method7018(Statics.field2137 - Statics.field1303.field4559 - 8, Statics.field2535 / 2 - Statics.field1303.field4560 / 2);
            }
            int var56 = var54 + 23;
            int var57 = field862 + var53;
            int var58 = 0;
            boolean var59 = false;
            int var60 = field879;
            for (int var61 = var48 * var60; var61 < class61.field763 && var60 - field879 < var47; var61++) {
                class61 var62 = Statics.field4019[var61];
                boolean var63 = true;
                String var64 = Integer.toString(var62.field762);
                if (var62.field762 == -1) {
                    var64 = class295.field3482;
                    var63 = false;
                } else if (var62.field762 > 1980) {
                    var64 = class295.field3786;
                    var63 = false;
                }
                int var65 = 0;
                byte var66;
                if (var62.method1591()) {
                    if (var62.method1586()) {
                        var66 = 7;
                    } else {
                        var66 = 6;
                    }
                } else if (var62.method1590()) {
                    var65 = 16711680;
                    if (var62.method1586()) {
                        var66 = 5;
                    } else {
                        var66 = 4;
                    }
                } else if (var62.method1592()) {
                    if (var62.method1586()) {
                        var66 = 9;
                    } else {
                        var66 = 8;
                    }
                } else if (var62.method1588()) {
                    if (var62.method1586()) {
                        var66 = 3;
                    } else {
                        var66 = 2;
                    }
                } else if (var62.method1586()) {
                    var66 = 1;
                } else {
                    var66 = 0;
                }
                if (class33.field227 >= var57 && class33.field228 >= var56 && class33.field227 < var45 + var57 && class33.field228 < var46 + var56 && var63) {
                    field888 = var61;
                    Statics.field1654[var66].method7075(var57, var56, 128, 16777215);
                    var59 = true;
                } else {
                    Statics.field1654[var66].method7049(var57, var56);
                }
                if (Statics.field3851 != null) {
                    Statics.field3851[(var62.method1586() ? 8 : 0) + var62.field772].method7018(var57 + 29, var56);
                }
                arg0.method5454(Integer.toString(var62.field767), var57 + 15, var46 / 2 + var56 + 5, var65, -1);
                arg1.method5454(var64, var57 + 60, var46 / 2 + var56 + 5, 268435455, -1);
                var56 += var46 + var52;
                var58++;
                if (var58 >= var48) {
                    var56 = var54 + 23;
                    var57 += var45 + var51;
                    var58 = 0;
                    var60++;
                }
            }
            if (var59) {
                int var67 = arg1.method5487(Statics.field4019[field888].field771) + 6;
                int var68 = arg1.field3989 + 8;
                int var69 = class33.field228 + 25;
                if (var68 + var69 > 480) {
                    var69 = class33.field228 - 25 - var68;
                }
                class428.method6943(class33.field227 - var67 / 2, var69, var67, var68, 16777120);
                class428.method6994(class33.field227 - var67 / 2, var69, var67, var68, 0);
                arg1.method5454(Statics.field4019[field888].field771, class33.field227, arg1.field3989 + var69 + 4, 0, -1);
            }
        }
        Statics.field107.method452(0, 0);
    }

    @ObfuscatedName("hg.d(Lbw;B)V")
    public static void method3997(class61 arg0) {
        if (arg0.method1586() != client.field601) {
            client.field601 = arg0.method1586();
            class181.method2429(arg0.method1586());
        }
        if (client.field470 != arg0.field775) {
            class300 var1 = Statics.field1348;
            int var2 = arg0.field775;
            if ((var2 & 0x20000000) != 0) {
                Statics.field866 = class433.method2193(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) == 0) {
                Statics.field866 = class433.method2193(var1, "logo", "");
            } else {
                Statics.field866 = class433.method2193(var1, "logo_seasonal_mode", "");
            }
        }
        Statics.field2126 = arg0.field770;
        client.field469 = arg0.field767;
        client.field470 = arg0.field775;
        Statics.field2566 = client.field476 == 0 ? 43594 : arg0.field767 + 40000;
        Statics.field1546 = client.field476 == 0 ? 443 : arg0.field767 + 50000;
        Statics.field1519 = Statics.field2566;
    }

    @ObfuscatedName("kw.h(II)V")
    public static void method4983(int arg0) {
        if (field884 != arg0) {
            field884 = arg0;
        }
    }
}
