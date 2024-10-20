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
import java.util.Random;

@ObfuscatedName("bb")
public class class69 {

    @ObfuscatedName("bb.m")
    public static int field872 = 0;

    @ObfuscatedName("bb.t")
    public static int field904 = field872 + 202;

    @ObfuscatedName("bb.p")
    public static int field880 = 10;

    @ObfuscatedName("bb.w")
    public static String field881 = "";

    @ObfuscatedName("bb.aj")
    public static int field875 = -1;

    @ObfuscatedName("bb.ac")
    public static int field884 = 1;

    @ObfuscatedName("bb.ah")
    public static int field885 = 0;

    @ObfuscatedName("bb.af")
    public static String field886 = "";

    @ObfuscatedName("bb.ax")
    public static String field887 = "";

    @ObfuscatedName("bb.bd")
    public static String field888 = "";

    @ObfuscatedName("bb.bt")
    public static String field889 = "";

    @ObfuscatedName("bb.bf")
    public static String field890 = "";

    @ObfuscatedName("bb.bp")
    public static String field891 = "";

    @ObfuscatedName("bb.be")
    public static boolean field892 = false;

    @ObfuscatedName("bb.bq")
    public static boolean field905 = false;

    @ObfuscatedName("bb.bk")
    public static boolean field894 = true;

    @ObfuscatedName("bb.bm")
    public static int field895 = 0;

    @ObfuscatedName("bb.bb")
    public static String field874 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bb.bx")
    public static String field897 = "1234567890";

    @ObfuscatedName("bb.bg")
    public static boolean field878 = false;

    @ObfuscatedName("bb.ci")
    public static int field899 = -1;

    @ObfuscatedName("bb.cl")
    public static int field883 = 0;

    @ObfuscatedName("bb.cu")
    public static int field901 = 0;

    @ObfuscatedName("bb.cb")
    public static long field903;

    @ObfuscatedName("bb.cf")
    public static long field876;

    @ObfuscatedName("bb.cc")
    public static String[] field870;

    @ObfuscatedName("bb.cn")
    public static String[] field893;

    static {
        new DecimalFormat("##0.00");
        new class112();
        field903 = -1L;
        field876 = -1L;
        field870 = new String[] { "title.jpg" };
        field893 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.n(Lkk;Lkk;I)I")
    public static int method403(class290 arg0, class290 arg1) {
        int var2 = 0;
        String[] var3 = field870;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method4732(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field893;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method4732(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("gt.c(Lkk;Lkk;ZII)V")
    public static void method3460(class290 arg0, class290 arg1, boolean arg2, int arg3) {
        if (!Statics.field871) {
            if (arg3 == 0) {
                method1778(arg2);
            } else {
                method1040(arg3);
            }
            class409.method6544();
            byte[] var4 = arg0.method4728("title.jpg", "");
            Statics.field3860 = class29.method259(var4);
            Statics.field896 = Statics.field3860.method6616();
            int var5 = client.field482;
            if ((var5 & 0x20000000) != 0) {
                Statics.field4255 = class414.method3520(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field4255 = class414.method3520(arg1, "logo", "");
            } else {
                Statics.field4255 = class414.method3520(arg1, "logo_seasonal_mode", "");
            }
            Statics.field879 = class414.method3520(arg1, "titlebox", "");
            Statics.field900 = class414.method3520(arg1, "titlebutton", "");
            Statics.field1313 = class414.method3520(arg1, "titlebutton_large", "");
            Statics.field70 = class414.method3520(arg1, "play_now_text", "");
            class414.method3520(arg1, "titlebutton_wide42,1", "");
            Statics.field873 = class414.method6166(arg1, "runes", "");
            Statics.field1231 = class414.method6166(arg1, "title_mute", "");
            Statics.field2587 = class414.method3520(arg1, "options_radio_buttons,0", "");
            Statics.field108 = class414.method3520(arg1, "options_radio_buttons,4", "");
            Statics.field769 = class414.method3520(arg1, "options_radio_buttons,2", "");
            Statics.field3020 = class414.method3520(arg1, "options_radio_buttons,6", "");
            Statics.field4 = Statics.field2587.field4361;
            Statics.field3324 = Statics.field2587.field4364;
            Statics.field877 = new class87(Statics.field873);
            if (arg2) {
                field890 = "";
                field891 = "";
            }
            Statics.field3275 = 0;
            Statics.field2196 = "";
            field894 = true;
            field878 = false;
            if (Statics.field1779.field1190) {
                class248.method213(2);
            } else {
                class288 var6 = Statics.field3292;
                int var7 = var6.method4725("scape main");
                int var8 = var6.method4775(var7, "");
                class248.field2901 = 1;
                Statics.field2900 = var6;
                Statics.field2903 = var7;
                Statics.field478 = var8;
                Statics.field2183 = 255;
                Statics.field105 = false;
                Statics.field1486 = 2;
            }
            if (Statics.field3725 != null) {
                try {
                    class400 var9 = new class400(4);
                    var9.method6200(3);
                    var9.method6202(0);
                    Statics.field3725.method2567(var9.field4271, 0, 4);
                } catch (IOException var13) {
                    try {
                        Statics.field3725.method2541();
                    } catch (Exception var12) {
                    }
                    class291.field3735++;
                    Statics.field3725 = null;
                }
            }
            Statics.field871 = true;
            field872 = (Statics.field1611 - 765) / 2;
            field904 = field872 + 202;
            Statics.field57 = field904 + 180;
            Statics.field3860.method6707(field872, 0);
            Statics.field896.method6707(field872 + 382, 0);
            Statics.field4255.method6601(field872 + 382 - Statics.field4255.field4361 / 2, 18);
        } else if (arg3 == 4) {
            method1040(4);
        }
    }

    @ObfuscatedName("gy.m(I)Ljava/lang/String;")
    public static String method3500() {
        return Statics.field1779.field1198 ? class319.method1768(field890) : field890;
    }

    @ObfuscatedName("ep.k(I)V")
    public static void method2458() {
        if (field890 != null && field890.length() > 0) {
            return;
        }
        if (Statics.field1779.field1192 == null) {
            client.field525 = false;
        } else {
            field890 = Statics.field1779.field1192;
            client.field525 = true;
        }
    }

    @ObfuscatedName("w.o(Lat;Llu;I)V")
    public static void method361(class32 arg0, class315 arg1) {
        if (field878) {
            while (true) {
                if (!class24.method2655()) {
                    if (class33.field236 != 1 && (Statics.field949 || class33.field236 != 4)) {
                        break;
                    }
                    int var2 = field872 + 280;
                    if (class33.field241 >= var2 && class33.field241 <= var2 + 14 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(0, 0);
                        break;
                    }
                    if (class33.field241 >= var2 + 15 && class33.field241 <= var2 + 80 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(0, 1);
                        break;
                    }
                    int var3 = field872 + 390;
                    if (class33.field241 >= var3 && class33.field241 <= var3 + 14 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(1, 0);
                        break;
                    }
                    if (class33.field241 >= var3 + 15 && class33.field241 <= var3 + 80 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(1, 1);
                        break;
                    }
                    int var4 = field872 + 500;
                    if (class33.field241 >= var4 && class33.field241 <= var4 + 14 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(2, 0);
                        break;
                    }
                    if (class33.field241 >= var4 + 15 && class33.field241 <= var4 + 80 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(2, 1);
                        break;
                    }
                    int var5 = field872 + 610;
                    if (class33.field241 >= var5 && class33.field241 <= var5 + 14 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(3, 0);
                        break;
                    }
                    if (class33.field241 >= var5 + 15 && class33.field241 <= var5 + 80 && class33.field238 >= 4 && class33.field238 <= 18) {
                        class61.method2835(3, 1);
                        break;
                    }
                    if (class33.field241 >= field872 + 708 && class33.field238 >= 4 && class33.field241 <= field872 + 708 + 50 && class33.field238 <= 20) {
                        field878 = false;
                        Statics.field3860.method6707(field872, 0);
                        Statics.field896.method6707(field872 + 382, 0);
                        Statics.field4255.method6601(field872 + 382 - Statics.field4255.field4361 / 2, 18);
                        break;
                    }
                    if (field899 == -1) {
                        if (field883 > 0 && Statics.field2098 != null && class33.field241 >= 0 && class33.field241 <= Statics.field2098.field4361 && class33.field238 >= Statics.field200 / 2 - 50 && class33.field238 <= Statics.field200 / 2 + 50) {
                            field883--;
                        }
                        if (field883 < field901 && Statics.field3934 != null && class33.field241 >= Statics.field1611 - Statics.field3934.field4361 - 5 && class33.field241 <= Statics.field1611 && class33.field238 >= Statics.field200 / 2 - 50 && class33.field238 <= Statics.field200 / 2 + 50) {
                            field883++;
                        }
                    } else {
                        class61 var6 = Statics.field4253[field899];
                        method1014(var6);
                        field878 = false;
                        Statics.field3860.method6707(field872, 0);
                        Statics.field896.method6707(field872 + 382, 0);
                        Statics.field4255.method6601(field872 + 382 - Statics.field4255.field4361 / 2, 18);
                    }
                    break;
                }
                if (Statics.field2995 == 13) {
                    field878 = false;
                    Statics.field3860.method6707(field872, 0);
                    Statics.field896.method6707(field872 + 382, 0);
                    Statics.field4255.method6601(field872 + 382 - Statics.field4255.field4361 / 2, 18);
                    break;
                }
                if (Statics.field2995 == 96) {
                    if (field883 > 0 && Statics.field2098 != null) {
                        field883--;
                    }
                } else if (Statics.field2995 == 97 && field883 < field901 && Statics.field3934 != null) {
                    field883++;
                }
            }
            return;
        }
        if ((class33.field236 == 1 || !Statics.field949 && class33.field236 == 4) && class33.field241 >= field872 + 765 - 50 && class33.field238 >= 453) {
            Statics.field1779.field1190 = !Statics.field1779.field1190;
            class89.method362();
            if (Statics.field1779.field1190) {
                class248.method366();
            } else {
                class288 var7 = Statics.field3292;
                int var8 = var7.method4725("scape main");
                int var9 = var7.method4775(var8, "");
                class248.method978(var7, var8, var9, 255, false);
            }
        }
        if (client.field490 == 5) {
            return;
        }
        if (field903 == -1L) {
            field903 = class397.method3986() + 1000L;
        }
        long var10 = class397.method3986();
        boolean var12;
        if (client.field762 == null || client.field763 >= client.field762.size()) {
            var12 = true;
        } else {
            while (true) {
                if (client.field763 >= client.field762.size()) {
                    var12 = true;
                    break;
                }
                class77 var13 = (class77) client.field762.get(client.field763);
                if (!var13.method1914()) {
                    var12 = false;
                    break;
                }
                client.field763++;
            }
        }
        if (var12 && field876 == -1L) {
            field876 = var10;
            if (field876 > field903) {
                field903 = field876;
            }
        }
        if (client.field490 != 10 && client.field490 != 11) {
            return;
        }
        if (Statics.field3879 == class305.field3797) {
            if (class33.field236 == 1 || !Statics.field949 && class33.field236 == 4) {
                int var14 = field872 + 5;
                short var15 = 463;
                byte var16 = 100;
                byte var17 = 35;
                if (class33.field241 >= var14 && class33.field241 <= var14 + var16 && class33.field238 >= var15 && class33.field238 <= var15 + var17) {
                    if (class61.method2882()) {
                        field878 = true;
                        field883 = 0;
                        field901 = 0;
                    }
                    return;
                }
            }
            if (Statics.field4104 != null && class61.method2882()) {
                field878 = true;
                field883 = 0;
                field901 = 0;
            }
        }
        int var18 = class33.field236;
        int var19 = class33.field241;
        int var20 = class33.field238;
        if (var18 == 0) {
            var19 = class33.field221;
            var20 = class33.field230;
        }
        if (!Statics.field949 && var18 == 4) {
            var18 = 1;
        }
        if (field885 == 0) {
            boolean var21 = false;
            while (class24.method2655()) {
                if (Statics.field2995 == 84) {
                    var21 = true;
                }
            }
            int var22 = Statics.field57 - 80;
            short var23 = 291;
            if (var18 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                class30.method1762(client.method3433("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var24 = Statics.field57 + 80;
            if (var18 == 1 && var19 >= var24 - 75 && var19 <= var24 + 75 && var20 >= var23 - 20 && var20 <= var23 + 20 || var21) {
                if ((client.field482 & 0x2000000) != 0) {
                    field886 = "";
                    field887 = class283.field3568;
                    field888 = class283.field3569;
                    field889 = class283.field3570;
                    method1040(1);
                    if (client.field525 && field890 != null && field890.length() > 0) {
                        field895 = 1;
                    } else {
                        field895 = 0;
                    }
                } else if ((client.field482 & 0x4) != 0) {
                    if ((client.field482 & 0x400) == 0) {
                        field887 = class283.field3559;
                        field888 = class283.field3523;
                        field889 = class283.field3561;
                    } else {
                        field887 = class283.field3460;
                        field888 = class283.field3566;
                        field889 = class283.field3567;
                    }
                    field886 = class283.field3563;
                    method1040(1);
                    if (client.field525 && field890 != null && field890.length() > 0) {
                        field895 = 1;
                    } else {
                        field895 = 0;
                    }
                } else if ((client.field482 & 0x400) == 0) {
                    method1837(false);
                } else {
                    field887 = class283.field3562;
                    field888 = class283.field3516;
                    field889 = class283.field3557;
                    field886 = class283.field3563;
                    method1040(1);
                    if (client.field525 && field890 != null && field890.length() > 0) {
                        field895 = 1;
                    } else {
                        field895 = 0;
                    }
                }
            }
        } else if (field885 == 1) {
            while (true) {
                if (!class24.method2655()) {
                    int var25 = Statics.field57 - 80;
                    short var26 = 321;
                    if (var18 == 1 && var19 >= var25 - 75 && var19 <= var25 + 75 && var20 >= var26 - 20 && var20 <= var26 + 20) {
                        method1837(false);
                    }
                    int var27 = Statics.field57 + 80;
                    if (var18 == 1 && var19 >= var27 - 75 && var19 <= var27 + 75 && var20 >= var26 - 20 && var20 <= var26 + 20) {
                        method1040(0);
                    }
                    break;
                }
                if (Statics.field2995 == 84) {
                    method1837(false);
                } else if (Statics.field2995 == 13) {
                    method1040(0);
                }
            }
        } else if (field885 == 2) {
            short var28 = 201;
            int var131 = var28 + 52;
            if (var18 == 1 && var20 >= var131 - 12 && var20 < var131 + 2) {
                field895 = 0;
            }
            var131 += 15;
            if (var18 == 1 && var20 >= var131 - 12 && var20 < var131 + 2) {
                field895 = 1;
            }
            var131 += 15;
            short var29 = 361;
            if (Statics.field2126 != null) {
                int var30 = Statics.field2126.field4015 / 2;
                if (var18 == 1 && var19 >= Statics.field2126.field4013 - var30 && var19 <= Statics.field2126.field4013 + var30 && var20 >= var29 - 15 && var20 < var29) {
                    switch(field884) {
                        case 1:
                            method5760(class283.field3607, class283.field3545, class283.field3609);
                            method1040(5);
                            return;
                        case 2:
                            class30.method1762("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var31 = Statics.field57 - 80;
            short var32 = 321;
            if (var18 == 1 && var19 >= var31 - 75 && var19 <= var31 + 75 && var20 >= var32 - 20 && var20 <= var32 + 20) {
                field890 = field890.trim();
                if (field890.length() == 0) {
                    method5760(class283.field3451, class283.field3452, class283.field3599);
                    return;
                }
                if (field891.length() == 0) {
                    method5760(class283.field3448, class283.field3455, class283.field3392);
                    return;
                }
                method5760(class283.field3366, class283.field3429, class283.field3575);
                client.method2178(false);
                client.method2034(20);
                return;
            }
            int var33 = field904 + 180 + 80;
            if (var18 == 1 && var19 >= var33 - 75 && var19 <= var33 + 75 && var20 >= var32 - 20 && var20 <= var32 + 20) {
                method1040(0);
                field890 = "";
                field891 = "";
                Statics.field3275 = 0;
                Statics.field2196 = "";
                field894 = true;
            }
            int var34 = Statics.field57 + -117;
            short var35 = 277;
            field892 = var19 >= var34 && var19 < Statics.field4 + var34 && var20 >= var35 && var20 < Statics.field3324 + var35;
            if (var18 == 1 && field892) {
                client.field525 = !client.field525;
                if (!client.field525 && Statics.field1779.field1192 != null) {
                    Statics.field1779.field1192 = null;
                    class89.method362();
                }
            }
            int var36 = Statics.field57 + 24;
            short var37 = 277;
            field905 = var19 >= var36 && var19 < Statics.field4 + var36 && var20 >= var37 && var20 < Statics.field3324 + var37;
            if (var18 == 1 && field905) {
                Statics.field1779.field1198 = !Statics.field1779.field1198;
                if (!Statics.field1779.field1198) {
                    field890 = "";
                    Statics.field1779.field1192 = null;
                    if (client.field525 && field890 != null && field890.length() > 0) {
                        field895 = 1;
                    } else {
                        field895 = 0;
                    }
                }
                class89.method362();
            }
            while (true) {
                Transferable var39;
                int var40;
                do {
                    while (true) {
                        label1117: do {
                            while (true) {
                                while (class24.method2655()) {
                                    if (Statics.field2995 == 13) {
                                        method1040(0);
                                        field890 = "";
                                        field891 = "";
                                        Statics.field3275 = 0;
                                        Statics.field2196 = "";
                                        field894 = true;
                                    } else {
                                        if (field895 != 0) {
                                            continue label1117;
                                        }
                                        method2866(Statics.field1011);
                                        if (Statics.field2995 == 85 && field890.length() > 0) {
                                            field890 = field890.substring(0, field890.length() - 1);
                                        }
                                        if (Statics.field2995 == 84 || Statics.field2995 == 80) {
                                            field895 = 1;
                                        }
                                        if (method2011(Statics.field1011) && field890.length() < 320) {
                                            field890 = field890 + Statics.field1011;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field895 != 1);
                        if (Statics.field2995 == 85 && field891.length() > 0) {
                            field891 = field891.substring(0, field891.length() - 1);
                        } else if (Statics.field2995 == 84 || Statics.field2995 == 80) {
                            field895 = 0;
                            if (Statics.field2995 == 84) {
                                field890 = field890.trim();
                                if (field890.length() == 0) {
                                    method5760(class283.field3451, class283.field3452, class283.field3599);
                                    return;
                                }
                                if (field891.length() == 0) {
                                    method5760(class283.field3448, class283.field3455, class283.field3392);
                                    return;
                                }
                                method5760(class283.field3366, class283.field3429, class283.field3575);
                                client.method2178(false);
                                client.method2034(20);
                                return;
                            }
                        }
                        if ((class24.field123[82] || class24.field123[87]) && Statics.field2995 == 67) {
                            Clipboard var38 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var39 = var38.getContents(Statics.field3681);
                            var40 = 20 - field891.length();
                            break;
                        }
                        if (class317.method6125(Statics.field1011) && method2011(Statics.field1011) && field891.length() < 20) {
                            field891 = field891 + Statics.field1011;
                        }
                    }
                } while (var40 <= 0);
                try {
                    String var41 = (String) var39.getTransferData(DataFlavor.stringFlavor);
                    int var42 = Math.min(var40, var41.length());
                    for (int var43 = 0; var43 < var42; var43++) {
                        if (!class317.method6125(var41.charAt(var43)) || !method2011(var41.charAt(var43))) {
                            method1040(3);
                            return;
                        }
                    }
                    field891 = field891 + var41.substring(0, var42);
                } catch (UnsupportedFlavorException var129) {
                } catch (IOException var130) {
                }
            }
        } else if (field885 == 3) {
            int var46 = field904 + 180;
            short var47 = 276;
            if (var18 == 1 && var19 >= var46 - 75 && var19 <= var46 + 75 && var20 >= var47 - 20 && var20 <= var47 + 20) {
                method1778(false);
            }
            int var48 = field904 + 180;
            short var49 = 326;
            if (var18 == 1 && var19 >= var48 - 75 && var19 <= var48 + 75 && var20 >= var49 - 20 && var20 <= var49 + 20) {
                method5760(class283.field3607, class283.field3545, class283.field3609);
                method1040(5);
                return;
            }
        } else if (field885 == 4) {
            int var50 = field904 + 180 - 80;
            short var51 = 321;
            if (var18 == 1 && var19 >= var50 - 75 && var19 <= var50 + 75 && var20 >= var51 - 20 && var20 <= var51 + 20) {
                Statics.field2196.trim();
                if (Statics.field2196.length() != 6) {
                    method5760(class283.field3628, class283.field3418, class283.field3372);
                    return;
                }
                Statics.field3275 = Integer.parseInt(Statics.field2196);
                Statics.field2196 = "";
                client.method2178(true);
                method5760(class283.field3366, class283.field3429, class283.field3575);
                client.method2034(20);
                return;
            }
            if (var18 == 1 && var19 >= field904 + 180 - 9 && var19 <= field904 + 180 + 130 && var20 >= 263 && var20 <= 296) {
                field894 = !field894;
            }
            if (var18 == 1 && var19 >= field904 + 180 - 34 && var19 <= field904 + 180 + 34 && var20 >= 351 && var20 <= 363) {
                class30.method1762(client.method3433("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var52 = field904 + 180 + 80;
            if (var18 == 1 && var19 >= var52 - 75 && var19 <= var52 + 75 && var20 >= var51 - 20 && var20 <= var51 + 20) {
                method1040(0);
                field890 = "";
                field891 = "";
                Statics.field3275 = 0;
                Statics.field2196 = "";
            }
            while (class24.method2655()) {
                boolean var53 = false;
                for (int var54 = 0; var54 < field897.length(); var54++) {
                    if (Statics.field1011 == field897.charAt(var54)) {
                        var53 = true;
                        break;
                    }
                }
                if (Statics.field2995 == 13) {
                    method1040(0);
                    field890 = "";
                    field891 = "";
                    Statics.field3275 = 0;
                    Statics.field2196 = "";
                } else {
                    if (Statics.field2995 == 85 && Statics.field2196.length() > 0) {
                        Statics.field2196 = Statics.field2196.substring(0, Statics.field2196.length() - 1);
                    }
                    if (Statics.field2995 == 84) {
                        Statics.field2196.trim();
                        if (Statics.field2196.length() != 6) {
                            method5760(class283.field3628, class283.field3418, class283.field3372);
                            return;
                        }
                        Statics.field3275 = Integer.parseInt(Statics.field2196);
                        Statics.field2196 = "";
                        client.method2178(true);
                        method5760(class283.field3366, class283.field3429, class283.field3575);
                        client.method2034(20);
                        return;
                    }
                    if (var53 && Statics.field2196.length() < 6) {
                        Statics.field2196 = Statics.field2196 + Statics.field1011;
                    }
                }
            }
        } else if (field885 == 5) {
            int var55 = field904 + 180 - 80;
            short var56 = 321;
            if (var18 == 1 && var19 >= var55 - 75 && var19 <= var55 + 75 && var20 >= var56 - 20 && var20 <= var56 + 20) {
                field890 = field890.trim();
                if (field890.length() == 0) {
                    method5760(class283.field3607, class283.field3545, class283.field3609);
                } else {
                    long var63;
                    try {
                        URL var57 = new URL(client.method3433("services", false) + "m=accountappeal/login.ws");
                        URLConnection var58 = var57.openConnection();
                        var58.setRequestProperty("connection", "close");
                        var58.setDoInput(true);
                        var58.setDoOutput(true);
                        var58.setConnectTimeout(5000);
                        OutputStreamWriter var59 = new OutputStreamWriter(var58.getOutputStream());
                        var59.write("data1=req");
                        var59.flush();
                        InputStream var60 = var58.getInputStream();
                        class400 var61 = new class400(new byte[1000]);
                        while (true) {
                            int var62 = var60.read(var61.field4271, var61.field4272, 1000 - var61.field4272);
                            if (var62 == -1) {
                                var61.field4272 = 0;
                                long var65 = var61.method6223();
                                var63 = var65;
                                break;
                            }
                            var61.field4272 += var62;
                            if (var61.field4272 >= 1000) {
                                var63 = 0L;
                                break;
                            }
                        }
                    } catch (Exception var128) {
                        var63 = 0L;
                    }
                    byte var70;
                    if (var63 == 0L) {
                        var70 = 5;
                    } else {
                        String var71 = field890;
                        Random var72 = new Random();
                        class400 var73 = new class400(128);
                        class400 var74 = new class400(128);
                        int[] var75 = new int[] { var72.nextInt(), var72.nextInt(), (int) (var63 >> 32), (int) var63 };
                        var73.method6200(10);
                        for (int var76 = 0; var76 < 4; var76++) {
                            var73.method6203(var72.nextInt());
                        }
                        var73.method6203(var75[0]);
                        var73.method6203(var75[1]);
                        var73.method6205(var63);
                        var73.method6205(0L);
                        for (int var77 = 0; var77 < 4; var77++) {
                            var73.method6203(var72.nextInt());
                        }
                        var73.method6373(class66.field850, class66.field854);
                        var74.method6200(10);
                        for (int var78 = 0; var78 < 3; var78++) {
                            var74.method6203(var72.nextInt());
                        }
                        var74.method6205(var72.nextLong());
                        var74.method6204(var72.nextLong());
                        client.method2084(var74);
                        var74.method6205(var72.nextLong());
                        var74.method6373(class66.field850, class66.field854);
                        int var79 = class400.method5614(var71);
                        if (var79 % 8 != 0) {
                            var79 += 8 - var79 % 8;
                        }
                        class400 var80 = new class400(var79);
                        var80.method6242(var71);
                        var80.field4272 = var79;
                        var80.method6236(var75);
                        class400 var81 = new class400(var80.field4272 + var74.field4272 + var73.field4272 + 5);
                        var81.method6200(2);
                        var81.method6200(var73.field4272);
                        var81.method6210(var73.field4271, 0, var73.field4272);
                        var81.method6200(var74.field4272);
                        var81.method6210(var74.field4271, 0, var74.field4272);
                        var81.method6311(var80.field4272);
                        var81.method6210(var80.field4271, 0, var80.field4272);
                        String var82 = class318.method1031(var81.field4271);
                        byte var89;
                        try {
                            URL var83 = new URL(client.method3433("services", false) + "m=accountappeal/login.ws");
                            URLConnection var84 = var83.openConnection();
                            var84.setDoInput(true);
                            var84.setDoOutput(true);
                            var84.setConnectTimeout(5000);
                            OutputStreamWriter var85 = new OutputStreamWriter(var84.getOutputStream());
                            var85.write("data2=" + class423.method4124(var82) + "&dest=" + class423.method4124("passwordchoice.ws"));
                            var85.flush();
                            InputStream var86 = var84.getInputStream();
                            class400 var87 = new class400(new byte[1000]);
                            while (true) {
                                int var88 = var86.read(var87.field4271, var87.field4272, 1000 - var87.field4272);
                                if (var88 == -1) {
                                    var85.close();
                                    var86.close();
                                    String var90 = new String(var87.field4271);
                                    if (var90.startsWith("OFFLINE")) {
                                        var89 = 4;
                                    } else if (var90.startsWith("WRONG")) {
                                        var89 = 7;
                                    } else if (var90.startsWith("RELOAD")) {
                                        var89 = 3;
                                    } else if (var90.startsWith("Not permitted for social network accounts.")) {
                                        var89 = 6;
                                    } else {
                                        var87.method6392(var75);
                                        while (var87.field4272 > 0 && var87.field4271[var87.field4272 - 1] == 0) {
                                            var87.field4272--;
                                        }
                                        String var91 = new String(var87.field4271, 0, var87.field4272);
                                        if (class66.method3561(var91)) {
                                            class30.method1762(var91, true, false);
                                            var89 = 2;
                                        } else {
                                            var89 = 5;
                                        }
                                    }
                                    break;
                                }
                                var87.field4272 += var88;
                                if (var87.field4272 >= 1000) {
                                    var89 = 5;
                                    break;
                                }
                            }
                        } catch (Throwable var127) {
                            var127.printStackTrace();
                            var89 = 5;
                        }
                        var70 = var89;
                    }
                    switch(var70) {
                        case 2:
                            method5760(class283.field3610, class283.field3611, class283.field3612);
                            method1040(6);
                            break;
                        case 3:
                            method5760(class283.field3613, class283.field3614, class283.field3491);
                            break;
                        case 4:
                            method5760(class283.field3616, class283.field3368, class283.field3650);
                            break;
                        case 5:
                            method5760(class283.field3597, class283.field3620, class283.field3617);
                            break;
                        case 6:
                            method5760(class283.field3622, class283.field3623, class283.field3477);
                            break;
                        case 7:
                            method5760(class283.field3625, class283.field3626, class283.field3393);
                    }
                }
                return;
            }
            int var93 = field904 + 180 + 80;
            if (var18 == 1 && var19 >= var93 - 75 && var19 <= var93 + 75 && var20 >= var56 - 20 && var20 <= var56 + 20) {
                method1837(true);
            }
            short var94 = 361;
            if (Statics.field288 != null) {
                int var95 = Statics.field288.field4015 / 2;
                if (var18 == 1 && var19 >= Statics.field288.field4013 - var95 && var19 <= Statics.field288.field4013 + var95 && var20 >= var94 - 15 && var20 < var94) {
                    class30.method1762(client.method3433("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method2655()) {
                boolean var96 = false;
                for (int var97 = 0; var97 < field874.length(); var97++) {
                    if (Statics.field1011 == field874.charAt(var97)) {
                        var96 = true;
                        break;
                    }
                }
                if (Statics.field2995 == 13) {
                    method1837(true);
                } else {
                    if (Statics.field2995 == 85 && field890.length() > 0) {
                        field890 = field890.substring(0, field890.length() - 1);
                    }
                    if (Statics.field2995 == 84) {
                        method1012();
                        return;
                    }
                    if (var96 && field890.length() < 320) {
                        field890 = field890 + Statics.field1011;
                    }
                }
            }
        } else if (field885 == 6) {
            while (true) {
                do {
                    if (!class24.method2655()) {
                        short var98 = 321;
                        if (var18 == 1 && var20 >= var98 - 20 && var20 <= var98 + 20) {
                            method1837(true);
                        }
                        return;
                    }
                } while (Statics.field2995 != 84 && Statics.field2995 != 13);
                method1837(true);
            }
        } else if (field885 == 7) {
            int var99 = field904 + 180 - 80;
            short var100 = 321;
            if (var18 == 1 && var19 >= var99 - 75 && var19 <= var99 + 75 && var20 >= var100 - 20 && var20 <= var100 + 20) {
                class30.method1762(client.method3433("secure", true) + "m=dob/set_dob.ws", true, false);
                method5760(class283.field3604, class283.field3605, class283.field3488);
                method1040(6);
                return;
            }
            int var101 = field904 + 180 + 80;
            if (var18 == 1 && var19 >= var101 - 75 && var19 <= var101 + 75 && var20 >= var100 - 20 && var20 <= var100 + 20) {
                method1837(true);
            }
        } else if (field885 == 8) {
            int var102 = field904 + 180 - 80;
            short var103 = 321;
            if (var18 == 1 && var19 >= var102 - 75 && var19 <= var102 + 75 && var20 >= var103 - 20 && var20 <= var103 + 20) {
                class30.method1762("https://www.jagex.com/terms/privacy", true, false);
                method5760(class283.field3604, class283.field3605, class283.field3488);
                method1040(6);
                return;
            }
            int var104 = field904 + 180 + 80;
            if (var18 == 1 && var19 >= var104 - 75 && var19 <= var104 + 75 && var20 >= var103 - 20 && var20 <= var103 + 20) {
                method1837(true);
            }
        } else if (field885 == 9) {
            int var105 = field904 + 180;
            short var106 = 311;
            if (Statics.field2995 == 84 || Statics.field2995 == 13 || var18 == 1 && var19 >= var105 - 75 && var19 <= var105 + 75 && var20 >= var106 - 20 && var20 <= var106 + 20) {
                method1778(false);
            }
        } else if (field885 == 10) {
            int var107 = field904 + 180;
            short var108 = 209;
            if (Statics.field2995 == 84 || var18 == 1 && var19 >= var107 - 109 && var19 <= var107 + 109 && var20 >= var108 && var20 <= var108 + 68) {
                method5760(class283.field3366, class283.field3429, class283.field3575);
                client.field520 = class404.field4324;
                client.method2178(false);
                client.method2034(20);
            }
        } else if (field885 == 12) {
            int var109 = Statics.field57;
            short var110 = 233;
            class350 var111 = arg1.method5186(0, 30, class283.field3633, var109, var110);
            class350 var112 = arg1.method5186(32, 32, class283.field3633, var109, var110);
            class350 var113 = arg1.method5186(70, 34, class283.field3633, var109, var110);
            int var132 = var110 + 17;
            class350 var114 = arg1.method5186(0, 34, class283.field3634, var109, var132);
            if (var18 == 1) {
                if (var111.method5634(var19, var20)) {
                    class30.method1762("https://www.jagex.com/terms", true, false);
                } else if (var112.method5634(var19, var20)) {
                    class30.method1762("https://www.jagex.com/terms/privacy", true, false);
                } else if (var113.method5634(var19, var20) || var114.method5634(var19, var20)) {
                    class30.method1762("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var115 = Statics.field57 - 80;
            short var116 = 311;
            if (var18 == 1 && var19 >= var115 - 75 && var19 <= var115 + 75 && var20 >= var116 - 20 && var20 <= var116 + 20) {
                client.method2377();
                if (client.method3557()) {
                    field885 = 0;
                } else {
                    field885 = 12;
                }
            }
            int var117 = Statics.field57 + 80;
            if (var18 == 1 && var19 >= var117 - 75 && var19 <= var117 + 75 && var20 >= var116 - 20 && var20 <= var116 + 20) {
                field885 = 13;
            }
        } else if (field885 == 13) {
            int var118 = Statics.field57;
            short var119 = 321;
            if (var18 == 1 && var19 >= var118 - 75 && var19 <= var118 + 75 && var20 >= var119 - 20 && var20 <= var119 + 20) {
                if (client.method3557()) {
                    field885 = 0;
                } else {
                    field885 = 12;
                }
            }
        } else if (field885 == 14) {
            String var120 = "";
            switch(field875) {
                case 0:
                    var120 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var120 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method1837(false);
            }
            int var121 = field904 + 180;
            short var122 = 276;
            if (var18 == 1 && var19 >= var121 - 75 && var19 <= var121 + 75 && var20 >= var122 - 20 && var20 <= var122 + 20) {
                class30.method1762(var120, true, false);
                method5760(class283.field3604, class283.field3605, class283.field3488);
                method1040(6);
                return;
            }
            int var123 = field904 + 180;
            short var124 = 326;
            if (var18 == 1 && var19 >= var123 - 75 && var19 <= var123 + 75 && var20 >= var124 - 20 && var20 <= var124 + 20) {
                method1837(false);
            }
        } else if (field885 == 24) {
            int var125 = field904 + 180;
            short var126 = 301;
            if (var18 == 1 && var19 >= var125 - 75 && var19 <= var125 + 75 && var20 >= var126 - 20 && var20 <= var126 + 20) {
                method1778(false);
            }
        }
    }

    @ObfuscatedName("fe.g(CI)Z")
    public static boolean method2866(char arg0) {
        for (int var1 = 0; var1 < field874.length(); var1++) {
            if (arg0 == field874.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cb.z(CI)Z")
    public static boolean method2011(char arg0) {
        return field874.indexOf(arg0) != -1;
    }

    @ObfuscatedName("ba.a(ZB)V")
    public static void method1837(boolean arg0) {
        field887 = class283.field3555;
        field888 = class283.field3615;
        field889 = class283.field3443;
        method1040(2);
        if (arg0) {
            field891 = "";
        }
        method2458();
        if (client.field525 && field890 != null && field890.length() > 0) {
            field895 = 1;
        } else {
            field895 = 0;
        }
    }

    @ObfuscatedName("bk.u(ZI)V")
    public static void method1778(boolean arg0) {
        byte var1;
        if (Statics.field3681.method1066()) {
            var1 = 10;
        } else {
            var1 = 0;
        }
        method1040(var1);
        if (arg0) {
            field890 = "";
            field891 = "";
            Statics.field3275 = 0;
            Statics.field2196 = "";
        }
        method2458();
        if (client.field525 && field890 != null && field890.length() > 0) {
            field895 = 1;
        } else {
            field895 = 0;
        }
    }

    @ObfuscatedName("bl.e(I)V")
    public static void method1012() {
        field890 = field890.trim();
        if (field890.length() == 0) {
            method5760(class283.field3607, class283.field3545, class283.field3609);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method3433("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class400 var4 = new class400(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4271, var4.field4272, 1000 - var4.field4272);
                if (var5 == -1) {
                    var4.field4272 = 0;
                    long var8 = var4.method6223();
                    var6 = var8;
                    break;
                }
                var4.field4272 += var5;
                if (var4.field4272 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var37) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field890;
            Random var15 = new Random();
            class400 var16 = new class400(128);
            class400 var17 = new class400(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method6200(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method6203(var15.nextInt());
            }
            var16.method6203(var18[0]);
            var16.method6203(var18[1]);
            var16.method6205(var6);
            var16.method6205(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method6203(var15.nextInt());
            }
            var16.method6373(class66.field850, class66.field854);
            var17.method6200(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method6203(var15.nextInt());
            }
            var17.method6205(var15.nextLong());
            var17.method6204(var15.nextLong());
            client.method2084(var17);
            var17.method6205(var15.nextLong());
            var17.method6373(class66.field850, class66.field854);
            int var22 = class400.method5614(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class400 var23 = new class400(var22);
            var23.method6242(var14);
            var23.field4272 = var22;
            var23.method6236(var18);
            class400 var24 = new class400(var23.field4272 + var17.field4272 + var16.field4272 + 5);
            var24.method6200(2);
            var24.method6200(var16.field4272);
            var24.method6210(var16.field4271, 0, var16.field4272);
            var24.method6200(var17.field4272);
            var24.method6210(var17.field4271, 0, var17.field4272);
            var24.method6311(var23.field4272);
            var24.method6210(var23.field4271, 0, var23.field4272);
            String var25 = class318.method1031(var24.field4271);
            byte var32;
            try {
                URL var26 = new URL(client.method3433("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class423.method4124(var25) + "&dest=" + class423.method4124("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class400 var30 = new class400(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field4271, var30.field4272, 1000 - var30.field4272);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field4271);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method6392(var18);
                            while (var30.field4272 > 0 && var30.field4271[var30.field4272 - 1] == 0) {
                                var30.field4272--;
                            }
                            String var34 = new String(var30.field4271, 0, var30.field4272);
                            if (class66.method3561(var34)) {
                                class30.method1762(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field4272 += var31;
                    if (var30.field4272 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var36) {
                var36.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method5760(class283.field3610, class283.field3611, class283.field3612);
                method1040(6);
                break;
            case 3:
                method5760(class283.field3613, class283.field3614, class283.field3491);
                break;
            case 4:
                method5760(class283.field3616, class283.field3368, class283.field3650);
                break;
            case 5:
                method5760(class283.field3597, class283.field3620, class283.field3617);
                break;
            case 6:
                method5760(class283.field3622, class283.field3623, class283.field3477);
                break;
            case 7:
                method5760(class283.field3625, class283.field3626, class283.field3393);
        }
    }

    @ObfuscatedName("br.l(Llu;Llu;Llu;I)V")
    public static void method1048(class315 arg0, class315 arg1, class315 arg2) {
        field872 = (Statics.field1611 - 765) / 2;
        field904 = field872 + 202;
        Statics.field57 = field904 + 180;
        if (field878) {
            if (Statics.field152 == null) {
                Statics.field152 = class414.method2207(Statics.field787, "sl_back", "");
            }
            if (Statics.field2189 == null) {
                Statics.field2189 = class414.method6166(Statics.field787, "sl_flags", "");
            }
            if (Statics.field781 == null) {
                Statics.field781 = class414.method6166(Statics.field787, "sl_arrows", "");
            }
            if (Statics.field28 == null) {
                Statics.field28 = class414.method6166(Statics.field787, "sl_stars", "");
            }
            if (Statics.field2098 == null) {
                Statics.field2098 = class414.method3520(Statics.field787, "leftarrow", "");
            }
            if (Statics.field3934 == null) {
                Statics.field3934 = class414.method3520(Statics.field787, "rightarrow", "");
            }
            class409.method6556(field872, 23, 765, 480, 0);
            class409.method6530(field872, 0, 125, 23, 12425273, 9135624);
            class409.method6530(field872 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5137(class283.field3640, field872 + 62, 15, 0, -1);
            if (Statics.field28 != null) {
                Statics.field28[1].method6601(field872 + 140, 1);
                arg1.method5174(class283.field3641, field872 + 152, 10, 16777215, -1);
                Statics.field28[0].method6601(field872 + 140, 12);
                arg1.method5174(class283.field3642, field872 + 152, 21, 16777215, -1);
            }
            if (Statics.field781 != null) {
                int var3 = field872 + 280;
                if (class61.field786[0] == 0 && class61.field776[0] == 0) {
                    Statics.field781[2].method6601(var3, 4);
                } else {
                    Statics.field781[0].method6601(var3, 4);
                }
                if (class61.field786[0] == 0 && class61.field776[0] == 1) {
                    Statics.field781[3].method6601(var3 + 15, 4);
                } else {
                    Statics.field781[1].method6601(var3 + 15, 4);
                }
                arg0.method5174(class283.field3643, var3 + 32, 17, 16777215, -1);
                int var4 = field872 + 390;
                if (class61.field786[0] == 1 && class61.field776[0] == 0) {
                    Statics.field781[2].method6601(var4, 4);
                } else {
                    Statics.field781[0].method6601(var4, 4);
                }
                if (class61.field786[0] == 1 && class61.field776[0] == 1) {
                    Statics.field781[3].method6601(var4 + 15, 4);
                } else {
                    Statics.field781[1].method6601(var4 + 15, 4);
                }
                arg0.method5174(class283.field3503, var4 + 32, 17, 16777215, -1);
                int var5 = field872 + 500;
                if (class61.field786[0] == 2 && class61.field776[0] == 0) {
                    Statics.field781[2].method6601(var5, 4);
                } else {
                    Statics.field781[0].method6601(var5, 4);
                }
                if (class61.field786[0] == 2 && class61.field776[0] == 1) {
                    Statics.field781[3].method6601(var5 + 15, 4);
                } else {
                    Statics.field781[1].method6601(var5 + 15, 4);
                }
                arg0.method5174(class283.field3645, var5 + 32, 17, 16777215, -1);
                int var6 = field872 + 610;
                if (class61.field786[0] == 3 && class61.field776[0] == 0) {
                    Statics.field781[2].method6601(var6, 4);
                } else {
                    Statics.field781[0].method6601(var6, 4);
                }
                if (class61.field786[0] == 3 && class61.field776[0] == 1) {
                    Statics.field781[3].method6601(var6 + 15, 4);
                } else {
                    Statics.field781[1].method6601(var6 + 15, 4);
                }
                arg0.method5174(class283.field3646, var6 + 32, 17, 16777215, -1);
            }
            class409.method6556(field872 + 708, 4, 50, 16, 0);
            arg1.method5137(class283.field3601, field872 + 708 + 25, 16, 16777215, -1);
            field899 = -1;
            if (Statics.field152 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class61.field774) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class61.field774) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class61.field774) {
                        var10--;
                    }
                } while (var10 != var11 || var9 != var12);
                int var13 = (765 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (480 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (class61.field774 + var10 - 1) / var10;
                field901 = var17 - var9;
                if (Statics.field2098 != null && field883 > 0) {
                    Statics.field2098.method6601(8, Statics.field200 / 2 - Statics.field2098.field4364 / 2);
                }
                if (Statics.field3934 != null && field883 < field901) {
                    Statics.field3934.method6601(Statics.field1611 - Statics.field3934.field4361 - 8, Statics.field200 / 2 - Statics.field3934.field4364 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field872 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field883;
                for (int var23 = var10 * var22; var23 < class61.field774 && var22 - field883 < var9; var23++) {
                    class61 var24 = Statics.field4253[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field780);
                    if (var24.field780 == -1) {
                        var26 = class283.field3647;
                        var25 = false;
                    } else if (var24.field780 > 1980) {
                        var26 = class283.field3425;
                        var25 = false;
                    }
                    int var27 = 0;
                    byte var28;
                    if (var24.method1519()) {
                        if (var24.method1515()) {
                            var28 = 7;
                        } else {
                            var28 = 6;
                        }
                    } else if (var24.method1530()) {
                        var27 = 16711680;
                        if (var24.method1515()) {
                            var28 = 5;
                        } else {
                            var28 = 4;
                        }
                    } else if (var24.method1518()) {
                        if (var24.method1515()) {
                            var28 = 9;
                        } else {
                            var28 = 8;
                        }
                    } else if (var24.method1517()) {
                        if (var24.method1515()) {
                            var28 = 3;
                        } else {
                            var28 = 2;
                        }
                    } else if (var24.method1515()) {
                        var28 = 1;
                    } else {
                        var28 = 0;
                    }
                    if (class33.field221 >= var19 && class33.field230 >= var18 && class33.field221 < var7 + var19 && class33.field230 < var8 + var18 && var25) {
                        field899 = var23;
                        Statics.field152[var28].method6631(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field152[var28].method6707(var19, var18);
                    }
                    if (Statics.field2189 != null) {
                        Statics.field2189[(var24.method1515() ? 8 : 0) + var24.field783].method6601(var19 + 29, var18);
                    }
                    arg0.method5137(Integer.toString(var24.field778), var19 + 15, var8 / 2 + var18 + 5, var27, -1);
                    arg1.method5137(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
                    var18 += var8 + var14;
                    var20++;
                    if (var20 >= var10) {
                        var18 = var16 + 23;
                        var19 += var7 + var13;
                        var20 = 0;
                        var22++;
                    }
                }
                if (var21) {
                    int var29 = arg1.method5128(Statics.field4253[field899].field782) + 6;
                    int var30 = arg1.field3837 + 8;
                    int var31 = class33.field230 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class33.field230 - 25 - var30;
                    }
                    class409.method6556(class33.field221 - var29 / 2, var31, var29, var30, 16777120);
                    class409.method6531(class33.field221 - var29 / 2, var31, var29, var30, 0);
                    arg1.method5137(Statics.field4253[field899].field782, class33.field221, arg1.field3837 + var31 + 4, 0, -1);
                }
            }
            Statics.field58.method421(0, 0);
            return;
        }
        Statics.field3860.method6707(field872, 0);
        Statics.field896.method6707(field872 + 382, 0);
        Statics.field4255.method6601(field872 + 382 - Statics.field4255.field4361 / 2, 18);
        if (client.field490 == 0 || client.field490 == 5) {
            byte var32 = 20;
            arg0.method5137(class283.field3554, field904 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class409.method6531(field904 + 180 - 152, var33, 304, 34, 9179409);
            class409.method6531(field904 + 180 - 151, var33 + 1, 302, 32, 0);
            class409.method6556(field904 + 180 - 150, var33 + 2, field880 * 3, 30, 9179409);
            class409.method6556(field880 * 3 + (field904 + 180 - 150), var33 + 2, 300 - field880 * 3, 30, 0);
            arg0.method5137(field881, field904 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field490 == 20) {
            Statics.field879.method6601(field904 + 180 - Statics.field879.field4361 / 2, 271 - Statics.field879.field4364 / 2);
            short var34 = 201;
            arg0.method5137(field887, field904 + 180, var34, 16776960, 0);
            int var126 = var34 + 15;
            arg0.method5137(field888, field904 + 180, var126, 16776960, 0);
            int var127 = var126 + 15;
            arg0.method5137(field889, field904 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            int var129 = var128 + 7;
            if (field885 != 4 && field885 != 10) {
                arg0.method5174(class283.field3482, field904 + 180 - 110, var129, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method3500(); arg0.method5128(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method5174(class316.method5207(var36), field904 + 180 - 70, var129, 16777215, 0);
                var126 = var129 + 15;
                String var37;
                for (var37 = class319.method1768(field891); arg0.method5128(var37) > var35; var37 = var37.substring(1)) {
                }
                arg0.method5174(class283.field3583 + var37, field904 + 180 - 108, var126, 16777215, 0);
                var126 += 15;
            }
        }
        if (client.field490 == 10 || client.field490 == 11) {
            Statics.field879.method6601(field904, 171);
            if (field885 == 0) {
                short var38 = 251;
                arg0.method5137(class283.field3585, field904 + 180, var38, 16776960, 0);
                int var130 = var38 + 30;
                int var39 = field904 + 180 - 80;
                short var40 = 291;
                Statics.field900.method6601(var39 - 73, var40 - 20);
                arg0.method5138(class283.field3586, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var41 = field904 + 180 + 80;
                Statics.field900.method6601(var41 - 73, var40 - 20);
                arg0.method5138(class283.field3587, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field885 == 1) {
                arg0.method5137(field886, field904 + 180, 201, 16776960, 0);
                short var42 = 236;
                arg0.method5137(field887, field904 + 180, var42, 16777215, 0);
                int var131 = var42 + 15;
                arg0.method5137(field888, field904 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method5137(field889, field904 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                int var43 = field904 + 180 - 80;
                short var44 = 321;
                Statics.field900.method6601(var43 - 73, var44 - 20);
                arg0.method5137(class283.field3357, var43, var44 + 5, 16777215, 0);
                int var45 = field904 + 180 + 80;
                Statics.field900.method6601(var45 - 73, var44 - 20);
                arg0.method5137(class283.field3601, var45, var44 + 5, 16777215, 0);
            } else if (field885 == 2) {
                short var46 = 201;
                arg0.method5137(field887, Statics.field57, var46, 16776960, 0);
                int var134 = var46 + 15;
                arg0.method5137(field888, Statics.field57, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method5137(field889, Statics.field57, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 7;
                arg0.method5174(class283.field3482, Statics.field57 - 110, var137, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = method3500(); arg0.method5128(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method5174(class316.method5207(var48) + (field895 == 0 & client.field744 % 40 < 20 ? class92.method1001(16776960) + class92.field1217 : ""), Statics.field57 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                String var49;
                for (var49 = class319.method1768(field891); arg0.method5128(var49) > var47; var49 = var49.substring(1)) {
                }
                arg0.method5174(class283.field3583 + var49 + (field895 == 1 & client.field744 % 40 < 20 ? class92.method1001(16776960) + class92.field1217 : ""), Statics.field57 - 108, var134, 16777215, 0);
                var134 += 15;
                short var50 = 277;
                int var51 = Statics.field57 + -117;
                boolean var52 = client.field525;
                boolean var53 = field892;
                class412 var54 = var52 ? (var53 ? Statics.field3020 : Statics.field769) : (var53 ? Statics.field108 : Statics.field2587);
                var54.method6601(var51, var50);
                int var56 = var54.field4361 + 5 + var51;
                arg1.method5174(class283.field3590, var56, var50 + 13, 16776960, 0);
                int var57 = Statics.field57 + 24;
                boolean var58 = Statics.field1779.field1198;
                boolean var59 = field905;
                class412 var60 = var58 ? (var59 ? Statics.field3020 : Statics.field769) : (var59 ? Statics.field108 : Statics.field2587);
                var60.method6601(var57, var50);
                int var62 = var60.field4361 + 5 + var57;
                arg1.method5174(class283.field3532, var62, var50 + 13, 16776960, 0);
                int var138 = var50 + 15;
                int var63 = Statics.field57 - 80;
                short var64 = 321;
                Statics.field900.method6601(var63 - 73, var64 - 20);
                arg0.method5137(class283.field3594, var63, var64 + 5, 16777215, 0);
                int var65 = Statics.field57 + 80;
                Statics.field900.method6601(var65 - 73, var64 - 20);
                arg0.method5137(class283.field3601, var65, var64 + 5, 16777215, 0);
                short var66 = 357;
                switch(field884) {
                    case 2:
                        Statics.field1168 = class283.field3603;
                        break;
                    default:
                        Statics.field1168 = class283.field3547;
                }
                Statics.field2126 = new class350(Statics.field57, var66, arg1.method5128(Statics.field1168), 11);
                Statics.field288 = new class350(Statics.field57, var66, arg1.method5128(class283.field3602), 11);
                arg1.method5137(Statics.field1168, Statics.field57, var66, 16777215, 0);
            } else if (field885 == 3) {
                short var67 = 201;
                arg0.method5137(class283.field3592, field904 + 180, var67, 16776960, 0);
                int var139 = var67 + 20;
                arg1.method5137(class283.field3593, field904 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                arg1.method5137(class283.field3639, field904 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                int var68 = field904 + 180;
                short var69 = 276;
                Statics.field900.method6601(var68 - 73, var69 - 20);
                arg2.method5137(class283.field3595, var68, var69 + 5, 16777215, 0);
                int var70 = field904 + 180;
                short var71 = 326;
                Statics.field900.method6601(var70 - 73, var71 - 20);
                arg2.method5137(class283.field3596, var70, var71 + 5, 16777215, 0);
            } else if (field885 == 4) {
                arg0.method5137(class283.field3571, field904 + 180, 201, 16776960, 0);
                short var72 = 236;
                arg0.method5137(field887, field904 + 180, var72, 16777215, 0);
                int var142 = var72 + 15;
                arg0.method5137(field888, field904 + 180, var142, 16777215, 0);
                int var143 = var142 + 15;
                arg0.method5137(field889, field904 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                arg0.method5174(class283.field3584 + class319.method1768(Statics.field2196) + (client.field744 % 40 < 20 ? class92.method1001(16776960) + class92.field1217 : ""), field904 + 180 - 108, var144, 16777215, 0);
                int var145 = var144 - 8;
                arg0.method5174(class283.field3340, field904 + 180 - 9, var145, 16776960, 0);
                int var146 = var145 + 15;
                arg0.method5174(class283.field3341, field904 + 180 - 9, var146, 16776960, 0);
                int var73 = field904 + 180 - 9 + arg0.method5128(class283.field3341) + 15;
                int var74 = var146 - arg0.field3837;
                class412 var75;
                if (field894) {
                    var75 = Statics.field769;
                } else {
                    var75 = Statics.field2587;
                }
                var75.method6601(var73, var74);
                var142 = var146 + 15;
                int var76 = field904 + 180 - 80;
                short var77 = 321;
                Statics.field900.method6601(var76 - 73, var77 - 20);
                arg0.method5137(class283.field3357, var76, var77 + 5, 16777215, 0);
                int var78 = field904 + 180 + 80;
                Statics.field900.method6601(var78 - 73, var77 - 20);
                arg0.method5137(class283.field3601, var78, var77 + 5, 16777215, 0);
                arg1.method5137(class283.field3572, field904 + 180, var77 + 36, 255, 0);
            } else if (field885 == 5) {
                arg0.method5137(class283.field3362, field904 + 180, 201, 16776960, 0);
                short var79 = 221;
                arg2.method5137(field887, field904 + 180, var79, 16776960, 0);
                int var147 = var79 + 15;
                arg2.method5137(field888, field904 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg2.method5137(field889, field904 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var150 = var149 + 14;
                arg0.method5174(class283.field3598, field904 + 180 - 145, var150, 16777215, 0);
                short var80 = 174;
                String var81;
                for (var81 = method3500(); arg0.method5128(var81) > var80; var81 = var81.substring(1)) {
                }
                arg0.method5174(class316.method5207(var81) + (client.field744 % 40 < 20 ? class92.method1001(16776960) + class92.field1217 : ""), field904 + 180 - 34, var150, 16777215, 0);
                var147 = var150 + 15;
                int var82 = field904 + 180 - 80;
                short var83 = 321;
                Statics.field900.method6601(var82 - 73, var83 - 20);
                arg0.method5137(class283.field3454, var82, var83 + 5, 16777215, 0);
                int var84 = field904 + 180 + 80;
                Statics.field900.method6601(var84 - 73, var83 - 20);
                arg0.method5137(class283.field3564, var84, var83 + 5, 16777215, 0);
                short var85 = 356;
                arg1.method5137(class283.field3602, Statics.field57, var85, 268435455, 0);
            } else if (field885 == 6) {
                short var86 = 201;
                arg0.method5137(field887, field904 + 180, var86, 16776960, 0);
                int var151 = var86 + 15;
                arg0.method5137(field888, field904 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg0.method5137(field889, field904 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var87 = field904 + 180;
                short var88 = 321;
                Statics.field900.method6601(var87 - 73, var88 - 20);
                arg0.method5137(class283.field3564, var87, var88 + 5, 16777215, 0);
            } else if (field885 == 7) {
                short var89 = 216;
                arg0.method5137(class283.field3630, field904 + 180, var89, 16776960, 0);
                int var154 = var89 + 15;
                arg2.method5137(class283.field3629, field904 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg2.method5137(class283.field3536, field904 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var90 = field904 + 180 - 80;
                short var91 = 321;
                Statics.field900.method6601(var90 - 73, var91 - 20);
                arg0.method5137(class283.field3600, var90, var91 + 5, 16777215, 0);
                int var92 = field904 + 180 + 80;
                Statics.field900.method6601(var92 - 73, var91 - 20);
                arg0.method5137(class283.field3564, var92, var91 + 5, 16777215, 0);
            } else if (field885 == 8) {
                short var93 = 216;
                arg0.method5137(class283.field3469, field904 + 180, var93, 16776960, 0);
                int var157 = var93 + 15;
                arg2.method5137(class283.field3388, field904 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                arg2.method5137(class283.field3471, field904 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                int var94 = field904 + 180 - 80;
                short var95 = 321;
                Statics.field900.method6601(var94 - 73, var95 - 20);
                arg0.method5137(class283.field3577, var94, var95 + 5, 16777215, 0);
                int var96 = field904 + 180 + 80;
                Statics.field900.method6601(var96 - 73, var95 - 20);
                arg0.method5137(class283.field3564, var96, var95 + 5, 16777215, 0);
            } else if (field885 == 9) {
                short var97 = 221;
                arg0.method5137(field887, field904 + 180, var97, 16776960, 0);
                int var160 = var97 + 25;
                arg0.method5137(field888, field904 + 180, var160, 16776960, 0);
                int var161 = var160 + 25;
                arg0.method5137(field889, field904 + 180, var161, 16776960, 0);
                int var98 = field904 + 180;
                short var99 = 311;
                Statics.field900.method6601(var98 - 73, var99 - 20);
                arg0.method5137(class283.field3595, var98, var99 + 5, 16777215, 0);
            } else if (field885 == 10) {
                int var100 = field904 + 180;
                short var101 = 209;
                arg0.method5137(class283.field3585, field904 + 180, var101, 16776960, 0);
                int var162 = var101 + 20;
                Statics.field1313.method6601(var100 - 109, var162);
                Statics.field70.method6601(var100 - 48, var162 + 18);
            } else if (field885 == 12) {
                int var102 = Statics.field57;
                short var103 = 216;
                arg2.method5137(class283.field3632, var102, var103, 16777215, 0);
                int var163 = var103 + 17;
                arg2.method5137(class283.field3633, var102, var163, 16777215, 0);
                int var164 = var163 + 17;
                arg2.method5137(class283.field3634, var102, var164, 16777215, 0);
                int var165 = var164 + 17;
                arg2.method5137(class283.field3635, var102, var165, 16777215, 0);
                int var104 = Statics.field57 - 80;
                short var105 = 311;
                Statics.field900.method6601(var104 - 73, var105 - 20);
                arg0.method5137(class283.field3638, var104, var105 + 5, 16777215, 0);
                int var106 = Statics.field57 + 80;
                Statics.field900.method6601(var106 - 73, var105 - 20);
                arg0.method5137(class283.field3573, var106, var105 + 5, 16777215, 0);
            } else if (field885 == 13) {
                short var107 = 231;
                arg2.method5137(class283.field3556, field904 + 180, var107, 16777215, 0);
                int var166 = var107 + 20;
                arg2.method5137(class283.field3637, field904 + 180, var166, 16777215, 0);
                int var108 = field904 + 180;
                short var109 = 311;
                Statics.field900.method6601(var108 - 73, var109 - 20);
                arg0.method5137(class283.field3564, var108, var109 + 5, 16777215, 0);
            } else if (field885 == 14) {
                short var110 = 201;
                String var111 = "";
                String var112 = "";
                String var113 = "";
                switch(field875) {
                    case 0:
                        var111 = class283.field3385;
                        var112 = class283.field3401;
                        var113 = class283.field3522;
                        break;
                    case 1:
                        var111 = class283.field3424;
                        var112 = class283.field3440;
                        var113 = class283.field3426;
                        break;
                    default:
                        method1837(false);
                }
                arg0.method5137(var111, field904 + 180, var110, 16776960, 0);
                int var167 = var110 + 15;
                arg2.method5137(var112, field904 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                arg2.method5137(var113, field904 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                int var114 = field904 + 180;
                short var115 = 276;
                Statics.field900.method6601(var114 - 73, var115 - 20);
                arg0.method5137(class283.field3369, var114, var115 + 5, 16777215, 0);
                int var116 = field904 + 180;
                short var117 = 326;
                Statics.field900.method6601(var116 - 73, var117 - 20);
                arg0.method5137(class283.field3564, var116, var117 + 5, 16777215, 0);
            } else if (field885 == 24) {
                short var118 = 221;
                arg0.method5137(field887, field904 + 180, var118, 16777215, 0);
                int var170 = var118 + 15;
                arg0.method5137(field888, field904 + 180, var170, 16777215, 0);
                int var171 = var170 + 15;
                arg0.method5137(field889, field904 + 180, var171, 16777215, 0);
                int var172 = var171 + 15;
                int var119 = field904 + 180;
                short var120 = 301;
                Statics.field900.method6601(var119 - 73, var120 - 20);
                arg0.method5137(class283.field3591, var119, var120 + 5, 16777215, 0);
            }
        }
        if (client.field490 >= 10) {
            int[] var121 = new int[4];
            class409.method6521(var121);
            class409.method6519(field872, 0, field872 + 765, Statics.field200);
            Statics.field877.method2041(field872 - 22, client.field744);
            Statics.field877.method2041(field872 + 765 + 22 - 128, client.field744);
            class409.method6522(var121);
        }
        Statics.field1231[Statics.field1779.field1190 ? 1 : 0].method6601(field872 + 765 - 40, 463);
        if (client.field490 <= 5 || Statics.field3879 != class305.field3797) {
            return;
        }
        if (Statics.field3282 == null) {
            Statics.field3282 = class414.method3520(Statics.field787, "sl_button", "");
            return;
        }
        int var122 = field872 + 5;
        short var123 = 463;
        byte var124 = 100;
        byte var125 = 35;
        Statics.field3282.method6601(var122, var123);
        arg0.method5137(class283.field3509 + " " + client.field654, var124 / 2 + var122, var125 / 2 + var123 - 2, 16777215, 0);
        if (Statics.field4104 == null) {
            arg1.method5137(class283.field3453, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        } else {
            arg1.method5137(class283.field3649, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("nh.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method5760(String arg0, String arg1, String arg2) {
        field887 = arg0;
        field888 = arg1;
        field889 = arg2;
    }

    @ObfuscatedName("bl.v(Lbh;S)V")
    public static void method1014(class61 arg0) {
        if (arg0.method1515() != client.field682) {
            client.field682 = arg0.method1515();
            boolean var1 = arg0.method1515();
            if (Statics.field3200 != var1) {
                class170.method1237();
                Statics.field3200 = var1;
            }
        }
        if (client.field482 != arg0.field773) {
            class288 var2 = Statics.field787;
            int var3 = arg0.field773;
            if ((var3 & 0x20000000) != 0) {
                Statics.field4255 = class414.method3520(var2, "logo_deadman_mode", "");
            } else if ((var3 & 0x40000000) == 0) {
                Statics.field4255 = class414.method3520(var2, "logo", "");
            } else {
                Statics.field4255 = class414.method3520(var2, "logo_seasonal_mode", "");
            }
        }
        Statics.field3319 = arg0.field772;
        client.field654 = arg0.field778;
        client.field482 = arg0.field773;
        Statics.field3296 = client.field483 == 0 ? 43594 : arg0.field778 + 40000;
        Statics.field2198 = client.field483 == 0 ? 443 : arg0.field778 + 50000;
        Statics.field1187 = Statics.field3296;
    }

    @ObfuscatedName("bc.f(II)V")
    public static void method1040(int arg0) {
        if (field885 != arg0) {
            field885 = arg0;
        }
    }
}
