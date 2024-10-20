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

@ObfuscatedName("bi")
public class class69 {

    @ObfuscatedName("bi.f")
    public static int field872 = 0;

    @ObfuscatedName("bi.o")
    public static int field881 = field872 + 202;

    @ObfuscatedName("bi.n")
    public static int field882 = 10;

    @ObfuscatedName("bi.u")
    public static String field880 = "";

    @ObfuscatedName("bi.an")
    public static int field885 = -1;

    @ObfuscatedName("bi.aj")
    public static int field870 = 1;

    @ObfuscatedName("bi.ae")
    public static int field888 = 0;

    @ObfuscatedName("bi.ai")
    public static String field889 = "";

    @ObfuscatedName("bi.af")
    public static String field890 = "";

    @ObfuscatedName("bi.bz")
    public static String field887 = "";

    @ObfuscatedName("bi.bt")
    public static String field911 = "";

    @ObfuscatedName("bi.bg")
    public static String field893 = "";

    @ObfuscatedName("bi.bf")
    public static String field875 = "";

    @ObfuscatedName("bi.bm")
    public static boolean field905 = false;

    @ObfuscatedName("bi.bv")
    public static boolean field896 = false;

    @ObfuscatedName("bi.bb")
    public static boolean field901 = true;

    @ObfuscatedName("bi.bh")
    public static int field898 = 0;

    @ObfuscatedName("bi.bi")
    public static String field899 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bi.bq")
    public static String field900 = "1234567890";

    @ObfuscatedName("bi.be")
    public static boolean field894 = false;

    @ObfuscatedName("bi.ct")
    public static int field902 = -1;

    @ObfuscatedName("bi.cy")
    public static int field903 = 0;

    @ObfuscatedName("bi.cg")
    public static int field910 = 0;

    @ObfuscatedName("bi.cx")
    public static long field886;

    @ObfuscatedName("bi.cd")
    public static long field906;

    @ObfuscatedName("bi.cp")
    public static String[] field891;

    @ObfuscatedName("bi.cl")
    public static String[] field908;

    static {
        new DecimalFormat("##0.00");
        new class112();
        field886 = -1L;
        field906 = -1L;
        field891 = new String[] { "title.jpg" };
        field908 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.l(Lkl;Lkl;I)I")
    public static int method607(class290 arg0, class290 arg1) {
        int var2 = 0;
        String[] var3 = field891;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method4775(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field908;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method4775(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("hb.q(Lkl;Lkl;ZIB)V")
    public static void method4058(class290 arg0, class290 arg1, boolean arg2, int arg3) {
        if (!Statics.field871) {
            if (arg3 == 0) {
                byte var4;
                if (Statics.field107.method1254()) {
                    var4 = 10;
                } else {
                    var4 = 0;
                }
                method2363(var4);
                if (arg2) {
                    field893 = "";
                    field875 = "";
                    Statics.field237 = 0;
                    Statics.field3971 = "";
                }
                method1843();
                method168();
            } else {
                method2363(arg3);
            }
            class410.method6558();
            byte[] var5 = arg0.method4807("title.jpg", "");
            Statics.field892 = class29.method2511(var5);
            Statics.field897 = Statics.field892.method6648();
            int var6 = client.field484;
            if ((var6 & 0x20000000) != 0) {
                Statics.field1393 = class415.method2496(arg1, "logo_deadman_mode", "");
            } else if ((var6 & 0x40000000) == 0) {
                Statics.field1393 = class415.method2496(arg1, "logo", "");
            } else {
                Statics.field1393 = class415.method2496(arg1, "logo_seasonal_mode", "");
            }
            Statics.field311 = class415.method2496(arg1, "titlebox", "");
            Statics.field1492 = class415.method2496(arg1, "titlebutton", "");
            Statics.field874 = class415.method2496(arg1, "titlebutton_large", "");
            Statics.field9 = class415.method2496(arg1, "play_now_text", "");
            class415.method2496(arg1, "titlebutton_wide42,1", "");
            int var7 = arg1.method4771("runes");
            int var8 = arg1.method4848(var7, "");
            class413[] var9 = class415.method2687(arg1, var7, var8);
            Statics.field873 = var9;
            int var10 = arg1.method4771("title_mute");
            int var11 = arg1.method4848(var10, "");
            class413[] var12 = class415.method2687(arg1, var10, var11);
            Statics.field90 = var12;
            Statics.field4283 = class415.method2496(arg1, "options_radio_buttons,0", "");
            Statics.field877 = class415.method2496(arg1, "options_radio_buttons,4", "");
            Statics.field1571 = class415.method2496(arg1, "options_radio_buttons,2", "");
            Statics.field878 = class415.method2496(arg1, "options_radio_buttons,6", "");
            Statics.field3742 = Statics.field4283.field4373;
            Statics.field104 = Statics.field4283.field4375;
            Statics.field879 = new class87(Statics.field873);
            if (arg2) {
                field893 = "";
                field875 = "";
            }
            Statics.field237 = 0;
            Statics.field3971 = "";
            field901 = true;
            field894 = false;
            if (Statics.field3227.field1208) {
                class248.method3162(2);
            } else {
                class248.method3470(2, Statics.field992, "scape main", "", 255, false);
            }
            if (Statics.field3726 != null) {
                try {
                    class401 var13 = new class401(4);
                    var13.method6269(3);
                    var13.method6262(0);
                    Statics.field3726.method2596(var13.field4294, 0, 4);
                } catch (IOException var17) {
                    try {
                        Statics.field3726.method2615();
                    } catch (Exception var16) {
                    }
                    class291.field3732++;
                    Statics.field3726 = null;
                }
            }
            Statics.field871 = true;
            field872 = (Statics.field3203 - 765) / 2;
            field881 = field872 + 202;
            Statics.field1026 = field881 + 180;
            Statics.field892.method6657(field872, 0);
            Statics.field897.method6657(field872 + 382, 0);
            Statics.field1393.method6629(field872 + 382 - Statics.field1393.field4373 / 2, 18);
        } else if (arg3 == 4) {
            method2363(4);
        }
    }

    @ObfuscatedName("be.f(ZZI)Loz;")
    public static class413 method1866(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field878 : Statics.field1571) : (arg1 ? Statics.field877 : Statics.field4283);
    }

    @ObfuscatedName("bi.j(I)V")
    public static void method1843() {
        if (field893 != null && field893.length() > 0) {
            return;
        }
        if (Statics.field3227.field1199 == null) {
            client.field581 = false;
        } else {
            field893 = Statics.field3227.field1199;
            client.field581 = true;
        }
    }

    @ObfuscatedName("a.m(I)V")
    public static void method60() {
        if (!Statics.field871) {
            return;
        }
        Statics.field311 = null;
        Statics.field1492 = null;
        Statics.field873 = null;
        Statics.field892 = null;
        Statics.field897 = null;
        Statics.field1393 = null;
        Statics.field90 = null;
        Statics.field4283 = null;
        Statics.field1571 = null;
        Statics.field2605 = null;
        Statics.field3689 = null;
        Statics.field1704 = null;
        Statics.field3878 = null;
        Statics.field564 = null;
        Statics.field879.method2068();
        class248.method3162(2);
        if (Statics.field3726 != null) {
            try {
                class401 var0 = new class401(4);
                var0.method6269(2);
                var0.method6262(0);
                Statics.field3726.method2596(var0.field4294, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field3726.method2615();
                } catch (Exception var3) {
                }
                class291.field3732++;
                Statics.field3726 = null;
            }
        }
        Statics.field871 = false;
    }

    @ObfuscatedName("s.k(I)V")
    public static void method168() {
        if (client.field581 && field893 != null && field893.length() > 0) {
            field898 = 1;
        } else {
            field898 = 0;
        }
    }

    @ObfuscatedName("cr.t(Lay;Llt;I)V")
    public static void method2100(class32 arg0, class315 arg1) {
        if (field894) {
            method953(arg0);
            return;
        }
        if ((class33.field231 == 1 || !Statics.field1784 && class33.field231 == 4) && class33.field232 >= field872 + 765 - 50 && class33.field214 >= 453) {
            Statics.field3227.field1208 = !Statics.field3227.field1208;
            class89.method1005();
            if (Statics.field3227.field1208) {
                Statics.field2921.method4301();
                class248.field2915 = 1;
                Statics.field1370 = null;
            } else {
                class288 var2 = Statics.field992;
                int var3 = var2.method4771("scape main");
                int var4 = var2.method4848(var3, "");
                class248.method1799(var2, var3, var4, 255, false);
            }
        }
        if (client.field567 == 5) {
            return;
        }
        if (field886 == -1L) {
            field886 = class398.method2299() + 1000L;
        }
        long var5 = class398.method2299();
        boolean var7;
        if (client.field602 == null || client.field766 >= client.field602.size()) {
            var7 = true;
        } else {
            while (true) {
                if (client.field766 >= client.field602.size()) {
                    var7 = true;
                    break;
                }
                class77 var8 = (class77) client.field602.get(client.field766);
                if (!var8.method1947()) {
                    var7 = false;
                    break;
                }
                client.field766++;
            }
        }
        if (var7 && field906 == -1L) {
            field906 = var5;
            if (field906 > field886) {
                field886 = field906;
            }
        }
        if (client.field567 != 10 && client.field567 != 11) {
            return;
        }
        if (Statics.field438 == class305.field3789) {
            if (class33.field231 == 1 || !Statics.field1784 && class33.field231 == 4) {
                int var9 = field872 + 5;
                short var10 = 463;
                byte var11 = 100;
                byte var12 = 35;
                if (class33.field232 >= var9 && class33.field232 <= var9 + var11 && class33.field214 >= var10 && class33.field214 <= var10 + var12) {
                    method41();
                    return;
                }
            }
            if (Statics.field7 != null) {
                method41();
            }
        }
        int var13 = class33.field231;
        int var14 = class33.field232;
        int var15 = class33.field214;
        if (var13 == 0) {
            var14 = class33.field224;
            var15 = class33.field225;
        }
        if (!Statics.field1784 && var13 == 4) {
            var13 = 1;
        }
        if (field888 == 0) {
            boolean var16 = false;
            while (class24.method3164()) {
                if (Statics.field14 == 84) {
                    var16 = true;
                }
            }
            int var17 = Statics.field1026 - 80;
            short var18 = 291;
            if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                class30.method2095(client.method2913("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var19 = Statics.field1026 + 80;
            if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                if ((client.field484 & 0x2000000) != 0) {
                    field889 = "";
                    field890 = class283.field3436;
                    field887 = class283.field3462;
                    field911 = class283.field3413;
                    method2363(1);
                    method168();
                } else if ((client.field484 & 0x4) != 0) {
                    if ((client.field484 & 0x400) == 0) {
                        field890 = class283.field3554;
                        field887 = class283.field3555;
                        field911 = class283.field3556;
                    } else {
                        field890 = class283.field3434;
                        field887 = class283.field3493;
                        field911 = class283.field3562;
                    }
                    field889 = class283.field3564;
                    method2363(1);
                    method168();
                } else if ((client.field484 & 0x400) == 0) {
                    method299(false);
                } else {
                    field890 = class283.field3557;
                    field887 = class283.field3558;
                    field911 = class283.field3371;
                    field889 = class283.field3564;
                    method2363(1);
                    method168();
                }
            }
        } else if (field888 == 1) {
            while (true) {
                if (!class24.method3164()) {
                    int var20 = Statics.field1026 - 80;
                    short var21 = 321;
                    if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                        method299(false);
                    }
                    int var22 = Statics.field1026 + 80;
                    if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                        method2363(0);
                    }
                    break;
                }
                if (Statics.field14 == 84) {
                    method299(false);
                } else if (Statics.field14 == 13) {
                    method2363(0);
                }
            }
        } else if (field888 == 2) {
            short var23 = 201;
            int var96 = var23 + 52;
            if (var13 == 1 && var15 >= var96 - 12 && var15 < var96 + 2) {
                field898 = 0;
            }
            var96 += 15;
            if (var13 == 1 && var15 >= var96 - 12 && var15 < var96 + 2) {
                field898 = 1;
            }
            var96 += 15;
            short var24 = 361;
            if (Statics.field3970 != null) {
                int var25 = Statics.field3970.field4030 / 2;
                if (var13 == 1 && var14 >= Statics.field3970.field4028 - var25 && var14 <= Statics.field3970.field4028 + var25 && var15 >= var24 - 15 && var15 < var24) {
                    switch(field870) {
                        case 1:
                            method260(class283.field3602, class283.field3603, class283.field3499);
                            method2363(5);
                            return;
                        case 2:
                            class30.method2095("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var26 = Statics.field1026 - 80;
            short var27 = 321;
            if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                field893 = field893.trim();
                if (field893.length() == 0) {
                    method260(class283.field3446, class283.field3447, class283.field3337);
                    return;
                }
                if (field875.length() == 0) {
                    method260(class283.field3575, class283.field3552, class283.field3451);
                    return;
                }
                method260(class283.field3568, class283.field3569, class283.field3570);
                client.method58(false);
                client.method5605(20);
                return;
            }
            int var28 = field881 + 180 + 80;
            if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                method2363(0);
                field893 = "";
                field875 = "";
                Statics.field237 = 0;
                Statics.field3971 = "";
                field901 = true;
            }
            int var29 = Statics.field1026 + -117;
            short var30 = 277;
            field905 = var14 >= var29 && var14 < Statics.field3742 + var29 && var15 >= var30 && var15 < Statics.field104 + var30;
            if (var13 == 1 && field905) {
                client.field581 = !client.field581;
                if (!client.field581 && Statics.field3227.field1199 != null) {
                    Statics.field3227.field1199 = null;
                    class89.method1005();
                }
            }
            int var31 = Statics.field1026 + 24;
            short var32 = 277;
            field896 = var14 >= var31 && var14 < Statics.field3742 + var31 && var15 >= var32 && var15 < Statics.field104 + var32;
            if (var13 == 1 && field896) {
                Statics.field3227.field1204 = !Statics.field3227.field1204;
                if (!Statics.field3227.field1204) {
                    field893 = "";
                    Statics.field3227.field1199 = null;
                    method168();
                }
                class89.method1005();
            }
            while (true) {
                Transferable var34;
                int var35;
                do {
                    while (true) {
                        label819: do {
                            while (true) {
                                while (class24.method3164()) {
                                    if (Statics.field14 == 13) {
                                        method2363(0);
                                        field893 = "";
                                        field875 = "";
                                        Statics.field237 = 0;
                                        Statics.field3971 = "";
                                        field901 = true;
                                    } else {
                                        if (field898 != 0) {
                                            continue label819;
                                        }
                                        method2587(Statics.field2377);
                                        if (Statics.field14 == 85 && field893.length() > 0) {
                                            field893 = field893.substring(0, field893.length() - 1);
                                        }
                                        if (Statics.field14 == 84 || Statics.field14 == 80) {
                                            field898 = 1;
                                        }
                                        if (method3204(Statics.field2377) && field893.length() < 320) {
                                            field893 = field893 + Statics.field2377;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field898 != 1);
                        if (Statics.field14 == 85 && field875.length() > 0) {
                            field875 = field875.substring(0, field875.length() - 1);
                        } else if (Statics.field14 == 84 || Statics.field14 == 80) {
                            field898 = 0;
                            if (Statics.field14 == 84) {
                                field893 = field893.trim();
                                if (field893.length() == 0) {
                                    method260(class283.field3446, class283.field3447, class283.field3337);
                                    return;
                                }
                                if (field875.length() == 0) {
                                    method260(class283.field3575, class283.field3552, class283.field3451);
                                    return;
                                }
                                method260(class283.field3568, class283.field3569, class283.field3570);
                                client.method58(false);
                                client.method5605(20);
                                return;
                            }
                        }
                        if ((class24.field118[82] || class24.field118[87]) && Statics.field14 == 67) {
                            Clipboard var33 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var34 = var33.getContents(Statics.field107);
                            var35 = 20 - field875.length();
                            break;
                        }
                        if (class317.method2873(Statics.field2377) && method3204(Statics.field2377) && field875.length() < 20) {
                            field875 = field875 + Statics.field2377;
                        }
                    }
                } while (var35 <= 0);
                try {
                    String var36 = (String) var34.getTransferData(DataFlavor.stringFlavor);
                    int var37 = Math.min(var35, var36.length());
                    for (int var38 = 0; var38 < var37; var38++) {
                        char var39 = var36.charAt(var38);
                        boolean var40;
                        if ((var39 < ' ' || var39 >= 127) && (var39 <= 127 || var39 >= 160) && (var39 <= 160 || var39 > 255)) {
                            label995: {
                                if (var39 != 0) {
                                    char[] var41 = class317.field3864;
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        char var43 = var41[var42];
                                        if (var39 == var43) {
                                            var40 = true;
                                            break label995;
                                        }
                                    }
                                }
                                var40 = false;
                            }
                        } else {
                            var40 = true;
                        }
                        if (!var40 || !method3204(var36.charAt(var38))) {
                            method2363(3);
                            return;
                        }
                    }
                    field875 = field875 + var36.substring(0, var37);
                } catch (UnsupportedFlavorException var94) {
                } catch (IOException var95) {
                }
            }
        } else if (field888 == 3) {
            int var46 = field881 + 180;
            short var47 = 276;
            if (var13 == 1 && var14 >= var46 - 75 && var14 <= var46 + 75 && var15 >= var47 - 20 && var15 <= var47 + 20) {
                byte var48;
                if (Statics.field107.method1254()) {
                    var48 = 10;
                } else {
                    var48 = 0;
                }
                method2363(var48);
                method1843();
                method168();
            }
            int var49 = field881 + 180;
            short var50 = 326;
            if (var13 == 1 && var14 >= var49 - 75 && var14 <= var49 + 75 && var15 >= var50 - 20 && var15 <= var50 + 20) {
                method260(class283.field3602, class283.field3603, class283.field3499);
                method2363(5);
                return;
            }
        } else if (field888 == 4) {
            int var51 = field881 + 180 - 80;
            short var52 = 321;
            if (var13 == 1 && var14 >= var51 - 75 && var14 <= var51 + 75 && var15 >= var52 - 20 && var15 <= var52 + 20) {
                Statics.field3971.trim();
                if (Statics.field3971.length() != 6) {
                    method260(class283.field3365, class283.field3353, class283.field3367);
                    return;
                }
                Statics.field237 = Integer.parseInt(Statics.field3971);
                Statics.field3971 = "";
                client.method58(true);
                method260(class283.field3568, class283.field3569, class283.field3570);
                client.method5605(20);
                return;
            }
            if (var13 == 1 && var14 >= field881 + 180 - 9 && var14 <= field881 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                field901 = !field901;
            }
            if (var13 == 1 && var14 >= field881 + 180 - 34 && var14 <= field881 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                class30.method2095(client.method2913("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var53 = field881 + 180 + 80;
            if (var13 == 1 && var14 >= var53 - 75 && var14 <= var53 + 75 && var15 >= var52 - 20 && var15 <= var52 + 20) {
                method2363(0);
                field893 = "";
                field875 = "";
                Statics.field237 = 0;
                Statics.field3971 = "";
            }
            while (class24.method3164()) {
                boolean var54 = false;
                for (int var55 = 0; var55 < field900.length(); var55++) {
                    if (Statics.field2377 == field900.charAt(var55)) {
                        var54 = true;
                        break;
                    }
                }
                if (Statics.field14 == 13) {
                    method2363(0);
                    field893 = "";
                    field875 = "";
                    Statics.field237 = 0;
                    Statics.field3971 = "";
                } else {
                    if (Statics.field14 == 85 && Statics.field3971.length() > 0) {
                        Statics.field3971 = Statics.field3971.substring(0, Statics.field3971.length() - 1);
                    }
                    if (Statics.field14 == 84) {
                        Statics.field3971.trim();
                        if (Statics.field3971.length() != 6) {
                            method260(class283.field3365, class283.field3353, class283.field3367);
                            return;
                        }
                        Statics.field237 = Integer.parseInt(Statics.field3971);
                        Statics.field3971 = "";
                        client.method58(true);
                        method260(class283.field3568, class283.field3569, class283.field3570);
                        client.method5605(20);
                        return;
                    }
                    if (var54 && Statics.field3971.length() < 6) {
                        Statics.field3971 = Statics.field3971 + Statics.field2377;
                    }
                }
            }
        } else if (field888 == 5) {
            int var56 = field881 + 180 - 80;
            short var57 = 321;
            if (var13 == 1 && var14 >= var56 - 75 && var14 <= var56 + 75 && var15 >= var57 - 20 && var15 <= var57 + 20) {
                method15();
                return;
            }
            int var58 = field881 + 180 + 80;
            if (var13 == 1 && var14 >= var58 - 75 && var14 <= var58 + 75 && var15 >= var57 - 20 && var15 <= var57 + 20) {
                method299(true);
            }
            short var59 = 361;
            if (Statics.field77 != null) {
                int var60 = Statics.field77.field4030 / 2;
                if (var13 == 1 && var14 >= Statics.field77.field4028 - var60 && var14 <= Statics.field77.field4028 + var60 && var15 >= var59 - 15 && var15 < var59) {
                    class30.method2095(client.method2913("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method3164()) {
                boolean var61 = false;
                for (int var62 = 0; var62 < field899.length(); var62++) {
                    if (Statics.field2377 == field899.charAt(var62)) {
                        var61 = true;
                        break;
                    }
                }
                if (Statics.field14 == 13) {
                    method299(true);
                } else {
                    if (Statics.field14 == 85 && field893.length() > 0) {
                        field893 = field893.substring(0, field893.length() - 1);
                    }
                    if (Statics.field14 == 84) {
                        method15();
                        return;
                    }
                    if (var61 && field893.length() < 320) {
                        field893 = field893 + Statics.field2377;
                    }
                }
            }
        } else if (field888 == 6) {
            while (true) {
                do {
                    if (!class24.method3164()) {
                        short var63 = 321;
                        if (var13 == 1 && var15 >= var63 - 20 && var15 <= var63 + 20) {
                            method299(true);
                        }
                        return;
                    }
                } while (Statics.field14 != 84 && Statics.field14 != 13);
                method299(true);
            }
        } else if (field888 == 7) {
            int var64 = field881 + 180 - 80;
            short var65 = 321;
            if (var13 == 1 && var14 >= var64 - 75 && var14 <= var64 + 75 && var15 >= var65 - 20 && var15 <= var65 + 20) {
                class30.method2095(client.method2913("secure", true) + "m=dob/set_dob.ws", true, false);
                method260(class283.field3599, class283.field3600, class283.field3378);
                method2363(6);
                return;
            }
            int var66 = field881 + 180 + 80;
            if (var13 == 1 && var14 >= var66 - 75 && var14 <= var66 + 75 && var15 >= var65 - 20 && var15 <= var65 + 20) {
                method299(true);
            }
        } else if (field888 == 8) {
            int var67 = field881 + 180 - 80;
            short var68 = 321;
            if (var13 == 1 && var14 >= var67 - 75 && var14 <= var67 + 75 && var15 >= var68 - 20 && var15 <= var68 + 20) {
                class30.method2095("https://www.jagex.com/terms/privacy", true, false);
                method260(class283.field3599, class283.field3600, class283.field3378);
                method2363(6);
                return;
            }
            int var69 = field881 + 180 + 80;
            if (var13 == 1 && var14 >= var69 - 75 && var14 <= var69 + 75 && var15 >= var68 - 20 && var15 <= var68 + 20) {
                method299(true);
            }
        } else if (field888 == 9) {
            int var70 = field881 + 180;
            short var71 = 311;
            if (Statics.field14 == 84 || Statics.field14 == 13 || var13 == 1 && var14 >= var70 - 75 && var14 <= var70 + 75 && var15 >= var71 - 20 && var15 <= var71 + 20) {
                byte var72;
                if (Statics.field107.method1254()) {
                    var72 = 10;
                } else {
                    var72 = 0;
                }
                method2363(var72);
                method1843();
                method168();
            }
        } else if (field888 == 10) {
            int var73 = field881 + 180;
            short var74 = 209;
            if (Statics.field14 == 84 || var13 == 1 && var14 >= var73 - 109 && var14 <= var73 + 109 && var15 >= var74 && var15 <= var74 + 68) {
                method260(class283.field3568, class283.field3569, class283.field3570);
                client.field521 = class405.field4349;
                client.method58(false);
                client.method5605(20);
            }
        } else if (field888 == 12) {
            int var75 = Statics.field1026;
            short var76 = 233;
            class351 var77 = arg1.method5206(0, 30, class283.field3628, var75, var76);
            class351 var78 = arg1.method5206(32, 32, class283.field3628, var75, var76);
            class351 var79 = arg1.method5206(70, 34, class283.field3628, var75, var76);
            int var97 = var76 + 17;
            class351 var80 = arg1.method5206(0, 34, class283.field3629, var75, var97);
            if (var13 == 1) {
                if (var77.method5677(var14, var15)) {
                    class30.method2095("https://www.jagex.com/terms", true, false);
                } else if (var78.method5677(var14, var15)) {
                    class30.method2095("https://www.jagex.com/terms/privacy", true, false);
                } else if (var79.method5677(var14, var15) || var80.method5677(var14, var15)) {
                    class30.method2095("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var81 = Statics.field1026 - 80;
            short var82 = 311;
            if (var13 == 1 && var14 >= var81 - 75 && var14 <= var81 + 75 && var15 >= var82 - 20 && var15 <= var82 + 20) {
                client.method2706();
                if (client.method152()) {
                    field888 = 0;
                } else {
                    field888 = 12;
                }
            }
            int var83 = Statics.field1026 + 80;
            if (var13 == 1 && var14 >= var83 - 75 && var14 <= var83 + 75 && var15 >= var82 - 20 && var15 <= var82 + 20) {
                field888 = 13;
            }
        } else if (field888 == 13) {
            int var84 = Statics.field1026;
            short var85 = 321;
            if (var13 == 1 && var14 >= var84 - 75 && var14 <= var84 + 75 && var15 >= var85 - 20 && var15 <= var85 + 20) {
                if (client.method152()) {
                    field888 = 0;
                } else {
                    field888 = 12;
                }
            }
        } else if (field888 == 14) {
            String var86 = "";
            switch(field885) {
                case 0:
                    var86 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var86 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method299(false);
            }
            int var87 = field881 + 180;
            short var88 = 276;
            if (var13 == 1 && var14 >= var87 - 75 && var14 <= var87 + 75 && var15 >= var88 - 20 && var15 <= var88 + 20) {
                class30.method2095(var86, true, false);
                method260(class283.field3599, class283.field3600, class283.field3378);
                method2363(6);
                return;
            }
            int var89 = field881 + 180;
            short var90 = 326;
            if (var13 == 1 && var14 >= var89 - 75 && var14 <= var89 + 75 && var15 >= var90 - 20 && var15 <= var90 + 20) {
                method299(false);
            }
        } else if (field888 == 24) {
            int var91 = field881 + 180;
            short var92 = 301;
            if (var13 == 1 && var14 >= var91 - 75 && var14 <= var91 + 75 && var15 >= var92 - 20 && var15 <= var92 + 20) {
                byte var93;
                if (Statics.field107.method1254()) {
                    var93 = 10;
                } else {
                    var93 = 0;
                }
                method2363(var93);
                method1843();
                method168();
            }
        }
    }

    @ObfuscatedName("ei.a(CI)Z")
    public static boolean method2587(char arg0) {
        for (int var1 = 0; var1 < field899.length(); var1++) {
            if (arg0 == field899.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fv.e(CI)Z")
    public static boolean method3204(char arg0) {
        return field899.indexOf(arg0) != -1;
    }

    @ObfuscatedName("h.i(ZI)V")
    public static void method299(boolean arg0) {
        field890 = class283.field3550;
        field887 = class283.field3551;
        field911 = class283.field3326;
        method2363(2);
        if (arg0) {
            field875 = "";
        }
        method1843();
        method168();
    }

    @ObfuscatedName("q.y(I)V")
    public static void method15() {
        field893 = field893.trim();
        if (field893.length() == 0) {
            method260(class283.field3602, class283.field3603, class283.field3499);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2913("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class401 var4 = new class401(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4294, var4.field4292, 1000 - var4.field4292);
                if (var5 == -1) {
                    var4.field4292 = 0;
                    long var8 = var4.method6275();
                    var6 = var8;
                    break;
                }
                var4.field4292 += var5;
                if (var4.field4292 >= 1000) {
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
            var13 = class66.method2306(var6, field893);
        }
        switch(var13) {
            case 2:
                method260(class283.field3605, class283.field3352, class283.field3607);
                method2363(6);
                break;
            case 3:
                method260(class283.field3608, class283.field3581, class283.field3610);
                break;
            case 4:
                method260(class283.field3396, class283.field3612, class283.field3613);
                break;
            case 5:
                method260(class283.field3614, class283.field3615, class283.field3616);
                break;
            case 6:
                method260(class283.field3617, class283.field3438, class283.field3619);
                break;
            case 7:
                method260(class283.field3620, class283.field3621, class283.field3622);
        }
    }

    @ObfuscatedName("ci.w(Llt;Llt;Llt;B)V")
    public static void method2041(class315 arg0, class315 arg1, class315 arg2) {
        field872 = (Statics.field3203 - 765) / 2;
        field881 = field872 + 202;
        Statics.field1026 = field881 + 180;
        if (field894) {
            if (Statics.field2605 == null) {
                Statics.field2605 = class415.method1881(Statics.field2005, "sl_back", "");
            }
            if (Statics.field3689 == null) {
                class288 var3 = Statics.field2005;
                int var4 = var3.method4771("sl_flags");
                int var5 = var3.method4848(var4, "");
                class413[] var6 = class415.method2687(var3, var4, var5);
                Statics.field3689 = var6;
            }
            if (Statics.field1704 == null) {
                class288 var7 = Statics.field2005;
                int var8 = var7.method4771("sl_arrows");
                int var9 = var7.method4848(var8, "");
                class413[] var10 = class415.method2687(var7, var8, var9);
                Statics.field1704 = var10;
            }
            if (Statics.field3878 == null) {
                class288 var11 = Statics.field2005;
                int var12 = var11.method4771("sl_stars");
                int var13 = var11.method4848(var12, "");
                class413[] var14 = class415.method2687(var11, var12, var13);
                Statics.field3878 = var14;
            }
            if (Statics.field2215 == null) {
                Statics.field2215 = class415.method2496(Statics.field2005, "leftarrow", "");
            }
            if (Statics.field3901 == null) {
                Statics.field3901 = class415.method2496(Statics.field2005, "rightarrow", "");
            }
            class410.method6595(field872, 23, 765, 480, 0);
            class410.method6602(field872, 0, 125, 23, 12425273, 9135624);
            class410.method6602(field872 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5210(class283.field3635, field872 + 62, 15, 0, -1);
            if (Statics.field3878 != null) {
                Statics.field3878[1].method6629(field872 + 140, 1);
                arg1.method5207(class283.field3425, field872 + 152, 10, 16777215, -1);
                Statics.field3878[0].method6629(field872 + 140, 12);
                arg1.method5207(class283.field3494, field872 + 152, 21, 16777215, -1);
            }
            if (Statics.field1704 != null) {
                int var15 = field872 + 280;
                if (class61.field776[0] == 0 && class61.field780[0] == 0) {
                    Statics.field1704[2].method6629(var15, 4);
                } else {
                    Statics.field1704[0].method6629(var15, 4);
                }
                if (class61.field776[0] == 0 && class61.field780[0] == 1) {
                    Statics.field1704[3].method6629(var15 + 15, 4);
                } else {
                    Statics.field1704[1].method6629(var15 + 15, 4);
                }
                arg0.method5207(class283.field3565, var15 + 32, 17, 16777215, -1);
                int var16 = field872 + 390;
                if (class61.field776[0] == 1 && class61.field780[0] == 0) {
                    Statics.field1704[2].method6629(var16, 4);
                } else {
                    Statics.field1704[0].method6629(var16, 4);
                }
                if (class61.field776[0] == 1 && class61.field780[0] == 1) {
                    Statics.field1704[3].method6629(var16 + 15, 4);
                } else {
                    Statics.field1704[1].method6629(var16 + 15, 4);
                }
                arg0.method5207(class283.field3639, var16 + 32, 17, 16777215, -1);
                int var17 = field872 + 500;
                if (class61.field776[0] == 2 && class61.field780[0] == 0) {
                    Statics.field1704[2].method6629(var17, 4);
                } else {
                    Statics.field1704[0].method6629(var17, 4);
                }
                if (class61.field776[0] == 2 && class61.field780[0] == 1) {
                    Statics.field1704[3].method6629(var17 + 15, 4);
                } else {
                    Statics.field1704[1].method6629(var17 + 15, 4);
                }
                arg0.method5207(class283.field3457, var17 + 32, 17, 16777215, -1);
                int var18 = field872 + 610;
                if (class61.field776[0] == 3 && class61.field780[0] == 0) {
                    Statics.field1704[2].method6629(var18, 4);
                } else {
                    Statics.field1704[0].method6629(var18, 4);
                }
                if (class61.field776[0] == 3 && class61.field780[0] == 1) {
                    Statics.field1704[3].method6629(var18 + 15, 4);
                } else {
                    Statics.field1704[1].method6629(var18 + 15, 4);
                }
                arg0.method5207(class283.field3641, var18 + 32, 17, 16777215, -1);
            }
            class410.method6595(field872 + 708, 4, 50, 16, 0);
            arg1.method5210(class283.field3428, field872 + 708 + 25, 16, 16777215, -1);
            field902 = -1;
            if (Statics.field2605 != null) {
                byte var19 = 88;
                byte var20 = 19;
                int var21 = 765 / (var19 + 1) - 1;
                int var22 = 480 / (var20 + 1);
                int var23;
                int var24;
                do {
                    var23 = var22;
                    var24 = var21;
                    if ((var21 - 1) * var22 >= class61.field778) {
                        var21--;
                    }
                    if ((var22 - 1) * var21 >= class61.field778) {
                        var22--;
                    }
                    if ((var22 - 1) * var21 >= class61.field778) {
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
                int var29 = (class61.field778 + var22 - 1) / var22;
                field910 = var29 - var21;
                if (Statics.field2215 != null && field903 > 0) {
                    Statics.field2215.method6629(8, Statics.field1050 / 2 - Statics.field2215.field4375 / 2);
                }
                if (Statics.field3901 != null && field903 < field910) {
                    Statics.field3901.method6629(Statics.field3203 - Statics.field3901.field4373 - 8, Statics.field1050 / 2 - Statics.field3901.field4375 / 2);
                }
                int var30 = var28 + 23;
                int var31 = field872 + var27;
                int var32 = 0;
                boolean var33 = false;
                int var34 = field903;
                for (int var35 = var22 * var34; var35 < class61.field778 && var34 - field903 < var21; var35++) {
                    class61 var36 = Statics.field4253[var35];
                    boolean var37 = true;
                    String var38 = Integer.toString(var36.field783);
                    if (var36.field783 == -1) {
                        var38 = class283.field3642;
                        var37 = false;
                    } else if (var36.field783 > 1980) {
                        var38 = class283.field3643;
                        var37 = false;
                    }
                    int var39 = 0;
                    byte var40;
                    if (var36.method1509()) {
                        if (var36.method1535()) {
                            var40 = 7;
                        } else {
                            var40 = 6;
                        }
                    } else if (var36.method1508()) {
                        var39 = 16711680;
                        if (var36.method1535()) {
                            var40 = 5;
                        } else {
                            var40 = 4;
                        }
                    } else if (var36.method1552()) {
                        if (var36.method1535()) {
                            var40 = 9;
                        } else {
                            var40 = 8;
                        }
                    } else if (var36.method1506()) {
                        if (var36.method1535()) {
                            var40 = 3;
                        } else {
                            var40 = 2;
                        }
                    } else if (var36.method1535()) {
                        var40 = 1;
                    } else {
                        var40 = 0;
                    }
                    if (class33.field224 >= var31 && class33.field225 >= var30 && class33.field224 < var19 + var31 && class33.field225 < var20 + var30 && var37) {
                        field902 = var35;
                        Statics.field2605[var40].method6670(var31, var30, 128, 16777215);
                        var33 = true;
                    } else {
                        Statics.field2605[var40].method6657(var31, var30);
                    }
                    if (Statics.field3689 != null) {
                        Statics.field3689[(var36.method1535() ? 8 : 0) + var36.field787].method6629(var31 + 29, var30);
                    }
                    arg0.method5210(Integer.toString(var36.field790), var31 + 15, var20 / 2 + var30 + 5, var39, -1);
                    arg1.method5210(var38, var31 + 60, var20 / 2 + var30 + 5, 268435455, -1);
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
                    int var41 = arg1.method5201(Statics.field4253[field902].field786) + 6;
                    int var42 = arg1.field3847 + 8;
                    int var43 = class33.field225 + 25;
                    if (var42 + var43 > 480) {
                        var43 = class33.field225 - 25 - var42;
                    }
                    class410.method6595(class33.field224 - var41 / 2, var43, var41, var42, 16777120);
                    class410.method6566(class33.field224 - var41 / 2, var43, var41, var42, 0);
                    arg1.method5210(Statics.field4253[field902].field786, class33.field224, arg1.field3847 + var43 + 4, 0, -1);
                }
            }
            Statics.field2895.method424(0, 0);
            return;
        }
        Statics.field892.method6657(field872, 0);
        Statics.field897.method6657(field872 + 382, 0);
        Statics.field1393.method6629(field872 + 382 - Statics.field1393.field4373 / 2, 18);
        if (client.field567 == 0 || client.field567 == 5) {
            byte var44 = 20;
            arg0.method5210(class283.field3618, field881 + 180, 245 - var44, 16777215, -1);
            int var45 = 253 - var44;
            class410.method6566(field881 + 180 - 152, var45, 304, 34, 9179409);
            class410.method6566(field881 + 180 - 151, var45 + 1, 302, 32, 0);
            class410.method6595(field881 + 180 - 150, var45 + 2, field882 * 3, 30, 9179409);
            class410.method6595(field882 * 3 + (field881 + 180 - 150), var45 + 2, 300 - field882 * 3, 30, 0);
            arg0.method5210(field880, field881 + 180, 276 - var44, 16777215, -1);
        }
        if (client.field567 == 20) {
            Statics.field311.method6629(field881 + 180 - Statics.field311.field4373 / 2, 271 - Statics.field311.field4375 / 2);
            short var46 = 201;
            arg0.method5210(field890, field881 + 180, var46, 16776960, 0);
            int var150 = var46 + 15;
            arg0.method5210(field887, field881 + 180, var150, 16776960, 0);
            int var151 = var150 + 15;
            arg0.method5210(field911, field881 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            int var153 = var152 + 7;
            if (field888 != 4 && field888 != 10) {
                arg0.method5207(class283.field3577, field881 + 180 - 110, var153, 16777215, 0);
                short var47 = 200;
                String var50;
                if (Statics.field3227.field1204) {
                    String var48 = field893;
                    String var49 = class319.method2897('*', var48.length());
                    var50 = var49;
                } else {
                    var50 = field893;
                }
                String var52;
                for (var52 = var50; arg0.method5201(var52) > var47; var52 = var52.substring(0, var52.length() - 1)) {
                }
                arg0.method5207(class316.method5205(var52), field881 + 180 - 70, var153, 16777215, 0);
                var150 = var153 + 15;
                String var53;
                for (var53 = class319.method2487(field875); arg0.method5201(var53) > var47; var53 = var53.substring(1)) {
                }
                arg0.method5207(class283.field3389 + var53, field881 + 180 - 108, var150, 16777215, 0);
                var150 += 15;
            }
        }
        if (client.field567 == 10 || client.field567 == 11) {
            Statics.field311.method6629(field881, 171);
            if (field888 == 0) {
                short var54 = 251;
                arg0.method5210(class283.field3580, field881 + 180, var54, 16776960, 0);
                int var154 = var54 + 30;
                int var55 = field881 + 180 - 80;
                short var56 = 291;
                Statics.field1492.method6629(var55 - 73, var56 - 20);
                arg0.method5263(class283.field3571, var55 - 73, var56 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var57 = field881 + 180 + 80;
                Statics.field1492.method6629(var57 - 73, var56 - 20);
                arg0.method5263(class283.field3582, var57 - 73, var56 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field888 == 1) {
                arg0.method5210(field889, field881 + 180, 201, 16776960, 0);
                short var58 = 236;
                arg0.method5210(field890, field881 + 180, var58, 16777215, 0);
                int var155 = var58 + 15;
                arg0.method5210(field887, field881 + 180, var155, 16777215, 0);
                int var156 = var155 + 15;
                arg0.method5210(field911, field881 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                int var59 = field881 + 180 - 80;
                short var60 = 321;
                Statics.field1492.method6629(var59 - 73, var60 - 20);
                arg0.method5210(class283.field3527, var59, var60 + 5, 16777215, 0);
                int var61 = field881 + 180 + 80;
                Statics.field1492.method6629(var61 - 73, var60 - 20);
                arg0.method5210(class283.field3428, var61, var60 + 5, 16777215, 0);
            } else if (field888 == 2) {
                short var62 = 201;
                arg0.method5210(field890, Statics.field1026, var62, 16776960, 0);
                int var158 = var62 + 15;
                arg0.method5210(field887, Statics.field1026, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg0.method5210(field911, Statics.field1026, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var161 = var160 + 7;
                arg0.method5207(class283.field3577, Statics.field1026 - 110, var161, 16777215, 0);
                short var63 = 200;
                String var66;
                if (Statics.field3227.field1204) {
                    String var64 = field893;
                    String var65 = class319.method2897('*', var64.length());
                    var66 = var65;
                } else {
                    var66 = field893;
                }
                String var68;
                for (var68 = var66; arg0.method5201(var68) > var63; var68 = var68.substring(1)) {
                }
                arg0.method5207(class316.method5205(var68) + (field898 == 0 & client.field494 % 40 < 20 ? class92.method2841(16776960) + class92.field1222 : ""), Statics.field1026 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                String var69 = field875;
                String var70 = class319.method2897('*', var69.length());
                String var71;
                for (var71 = var70; arg0.method5201(var71) > var63; var71 = var71.substring(1)) {
                }
                arg0.method5207(class283.field3389 + var71 + (field898 == 1 & client.field494 % 40 < 20 ? class92.method2841(16776960) + class92.field1222 : ""), Statics.field1026 - 108, var158, 16777215, 0);
                var158 += 15;
                short var72 = 277;
                int var73 = Statics.field1026 + -117;
                class413 var74 = method1866(client.field581, field905);
                var74.method6629(var73, var72);
                int var75 = var74.field4373 + 5 + var73;
                arg1.method5207(class283.field3585, var75, var72 + 13, 16776960, 0);
                int var76 = Statics.field1026 + 24;
                class413 var77 = method1866(Statics.field3227.field1204, field896);
                var77.method6629(var76, var72);
                int var78 = var77.field4373 + 5 + var76;
                arg1.method5207(class283.field3449, var78, var72 + 13, 16776960, 0);
                int var162 = var72 + 15;
                int var79 = Statics.field1026 - 80;
                short var80 = 321;
                Statics.field1492.method6629(var79 - 73, var80 - 20);
                arg0.method5210(class283.field3583, var79, var80 + 5, 16777215, 0);
                int var81 = Statics.field1026 + 80;
                Statics.field1492.method6629(var81 - 73, var80 - 20);
                arg0.method5210(class283.field3428, var81, var80 + 5, 16777215, 0);
                short var82 = 357;
                switch(field870) {
                    case 2:
                        Statics.field895 = class283.field3598;
                        break;
                    default:
                        Statics.field895 = class283.field3359;
                }
                Statics.field3970 = new class351(Statics.field1026, var82, arg1.method5201(Statics.field895), 11);
                Statics.field77 = new class351(Statics.field1026, var82, arg1.method5201(class283.field3597), 11);
                arg1.method5210(Statics.field895, Statics.field1026, var82, 16777215, 0);
            } else if (field888 == 3) {
                short var83 = 201;
                arg0.method5210(class283.field3587, field881 + 180, var83, 16776960, 0);
                int var163 = var83 + 20;
                arg1.method5210(class283.field3588, field881 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                arg1.method5210(class283.field3589, field881 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                int var84 = field881 + 180;
                short var85 = 276;
                Statics.field1492.method6629(var84 - 73, var85 - 20);
                arg2.method5210(class283.field3361, var84, var85 + 5, 16777215, 0);
                int var86 = field881 + 180;
                short var87 = 326;
                Statics.field1492.method6629(var86 - 73, var87 - 20);
                arg2.method5210(class283.field3591, var86, var87 + 5, 16777215, 0);
            } else if (field888 == 4) {
                arg0.method5210(class283.field3566, field881 + 180, 201, 16776960, 0);
                short var88 = 236;
                arg0.method5210(field890, field881 + 180, var88, 16777215, 0);
                int var166 = var88 + 15;
                arg0.method5210(field887, field881 + 180, var166, 16777215, 0);
                int var167 = var166 + 15;
                arg0.method5210(field911, field881 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                String var90 = class283.field3405;
                String var91 = Statics.field3971;
                String var92 = class319.method2897('*', var91.length());
                arg0.method5207(var90 + var92 + (client.field494 % 40 < 20 ? class92.method2841(16776960) + class92.field1222 : ""), field881 + 180 - 108, var168, 16777215, 0);
                int var169 = var168 - 8;
                arg0.method5207(class283.field3573, field881 + 180 - 9, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg0.method5207(class283.field3336, field881 + 180 - 9, var170, 16776960, 0);
                int var93 = field881 + 180 - 9 + arg0.method5201(class283.field3336) + 15;
                int var94 = var170 - arg0.field3847;
                class413 var95;
                if (field901) {
                    var95 = Statics.field1571;
                } else {
                    var95 = Statics.field4283;
                }
                var95.method6629(var93, var94);
                var166 = var170 + 15;
                int var96 = field881 + 180 - 80;
                short var97 = 321;
                Statics.field1492.method6629(var96 - 73, var97 - 20);
                arg0.method5210(class283.field3527, var96, var97 + 5, 16777215, 0);
                int var98 = field881 + 180 + 80;
                Statics.field1492.method6629(var98 - 73, var97 - 20);
                arg0.method5210(class283.field3428, var98, var97 + 5, 16777215, 0);
                arg1.method5210(class283.field3567, field881 + 180, var97 + 36, 255, 0);
            } else if (field888 == 5) {
                arg0.method5210(class283.field3592, field881 + 180, 201, 16776960, 0);
                short var99 = 221;
                arg2.method5210(field890, field881 + 180, var99, 16776960, 0);
                int var171 = var99 + 15;
                arg2.method5210(field887, field881 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg2.method5210(field911, field881 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var174 = var173 + 14;
                arg0.method5207(class283.field3593, field881 + 180 - 145, var174, 16777215, 0);
                short var100 = 174;
                String var103;
                if (Statics.field3227.field1204) {
                    String var101 = field893;
                    String var102 = class319.method2897('*', var101.length());
                    var103 = var102;
                } else {
                    var103 = field893;
                }
                String var105;
                for (var105 = var103; arg0.method5201(var105) > var100; var105 = var105.substring(1)) {
                }
                arg0.method5207(class316.method5205(var105) + (client.field494 % 40 < 20 ? class92.method2841(16776960) + class92.field1222 : ""), field881 + 180 - 34, var174, 16777215, 0);
                var171 = var174 + 15;
                int var106 = field881 + 180 - 80;
                short var107 = 321;
                Statics.field1492.method6629(var106 - 73, var107 - 20);
                arg0.method5210(class283.field3563, var106, var107 + 5, 16777215, 0);
                int var108 = field881 + 180 + 80;
                Statics.field1492.method6629(var108 - 73, var107 - 20);
                arg0.method5210(class283.field3595, var108, var107 + 5, 16777215, 0);
                short var109 = 356;
                arg1.method5210(class283.field3597, Statics.field1026, var109, 268435455, 0);
            } else if (field888 == 6) {
                short var110 = 201;
                arg0.method5210(field890, field881 + 180, var110, 16776960, 0);
                int var175 = var110 + 15;
                arg0.method5210(field887, field881 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg0.method5210(field911, field881 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var111 = field881 + 180;
                short var112 = 321;
                Statics.field1492.method6629(var111 - 73, var112 - 20);
                arg0.method5210(class283.field3595, var111, var112 + 5, 16777215, 0);
            } else if (field888 == 7) {
                short var113 = 216;
                arg0.method5210(class283.field3623, field881 + 180, var113, 16776960, 0);
                int var178 = var113 + 15;
                arg2.method5210(class283.field3624, field881 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                arg2.method5210(class283.field3345, field881 + 180, var179, 16776960, 0);
                int var180 = var179 + 15;
                int var114 = field881 + 180 - 80;
                short var115 = 321;
                Statics.field1492.method6629(var114 - 73, var115 - 20);
                arg0.method5210(class283.field3578, var114, var115 + 5, 16777215, 0);
                int var116 = field881 + 180 + 80;
                Statics.field1492.method6629(var116 - 73, var115 - 20);
                arg0.method5210(class283.field3595, var116, var115 + 5, 16777215, 0);
            } else if (field888 == 8) {
                short var117 = 216;
                arg0.method5210(class283.field3464, field881 + 180, var117, 16776960, 0);
                int var181 = var117 + 15;
                arg2.method5210(class283.field3332, field881 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                arg2.method5210(class283.field3466, field881 + 180, var182, 16776960, 0);
                int var183 = var182 + 15;
                int var118 = field881 + 180 - 80;
                short var119 = 321;
                Statics.field1492.method6629(var118 - 73, var119 - 20);
                arg0.method5210(class283.field3467, var118, var119 + 5, 16777215, 0);
                int var120 = field881 + 180 + 80;
                Statics.field1492.method6629(var120 - 73, var119 - 20);
                arg0.method5210(class283.field3595, var120, var119 + 5, 16777215, 0);
            } else if (field888 == 9) {
                short var121 = 221;
                arg0.method5210(field890, field881 + 180, var121, 16776960, 0);
                int var184 = var121 + 25;
                arg0.method5210(field887, field881 + 180, var184, 16776960, 0);
                int var185 = var184 + 25;
                arg0.method5210(field911, field881 + 180, var185, 16776960, 0);
                int var122 = field881 + 180;
                short var123 = 311;
                Statics.field1492.method6629(var122 - 73, var123 - 20);
                arg0.method5210(class283.field3361, var122, var123 + 5, 16777215, 0);
            } else if (field888 == 10) {
                int var124 = field881 + 180;
                short var125 = 209;
                arg0.method5210(class283.field3580, field881 + 180, var125, 16776960, 0);
                int var186 = var125 + 20;
                Statics.field874.method6629(var124 - 109, var186);
                Statics.field9.method6629(var124 - 48, var186 + 18);
            } else if (field888 == 12) {
                int var126 = Statics.field1026;
                short var127 = 216;
                arg2.method5210(class283.field3373, var126, var127, 16777215, 0);
                int var187 = var127 + 17;
                arg2.method5210(class283.field3628, var126, var187, 16777215, 0);
                int var188 = var187 + 17;
                arg2.method5210(class283.field3629, var126, var188, 16777215, 0);
                int var189 = var188 + 17;
                arg2.method5210(class283.field3630, var126, var189, 16777215, 0);
                int var128 = Statics.field1026 - 80;
                short var129 = 311;
                Statics.field1492.method6629(var128 - 73, var129 - 20);
                arg0.method5210(class283.field3633, var128, var129 + 5, 16777215, 0);
                int var130 = Statics.field1026 + 80;
                Statics.field1492.method6629(var130 - 73, var129 - 20);
                arg0.method5210(class283.field3634, var130, var129 + 5, 16777215, 0);
            } else if (field888 == 13) {
                short var131 = 231;
                arg2.method5210(class283.field3375, field881 + 180, var131, 16777215, 0);
                int var190 = var131 + 20;
                arg2.method5210(class283.field3632, field881 + 180, var190, 16777215, 0);
                int var132 = field881 + 180;
                short var133 = 311;
                Statics.field1492.method6629(var132 - 73, var133 - 20);
                arg0.method5210(class283.field3595, var132, var133 + 5, 16777215, 0);
            } else if (field888 == 14) {
                short var134 = 201;
                String var135 = "";
                String var136 = "";
                String var137 = "";
                switch(field885) {
                    case 0:
                        var135 = class283.field3380;
                        var136 = class283.field3541;
                        var137 = class283.field3382;
                        break;
                    case 1:
                        var135 = class283.field3419;
                        var136 = class283.field3540;
                        var137 = class283.field3421;
                        break;
                    default:
                        method299(false);
                }
                arg0.method5210(var135, field881 + 180, var134, 16776960, 0);
                int var191 = var134 + 15;
                arg2.method5210(var136, field881 + 180, var191, 16776960, 0);
                int var192 = var191 + 15;
                arg2.method5210(var137, field881 + 180, var192, 16776960, 0);
                int var193 = var192 + 15;
                int var138 = field881 + 180;
                short var139 = 276;
                Statics.field1492.method6629(var138 - 73, var139 - 20);
                arg0.method5210(class283.field3364, var138, var139 + 5, 16777215, 0);
                int var140 = field881 + 180;
                short var141 = 326;
                Statics.field1492.method6629(var140 - 73, var141 - 20);
                arg0.method5210(class283.field3595, var140, var141 + 5, 16777215, 0);
            } else if (field888 == 24) {
                short var142 = 221;
                arg0.method5210(field890, field881 + 180, var142, 16777215, 0);
                int var194 = var142 + 15;
                arg0.method5210(field887, field881 + 180, var194, 16777215, 0);
                int var195 = var194 + 15;
                arg0.method5210(field911, field881 + 180, var195, 16777215, 0);
                int var196 = var195 + 15;
                int var143 = field881 + 180;
                short var144 = 301;
                Statics.field1492.method6629(var143 - 73, var144 - 20);
                arg0.method5210(class283.field3330, var143, var144 + 5, 16777215, 0);
            }
        }
        if (client.field567 >= 10) {
            int[] var145 = new int[4];
            class410.method6556(var145);
            class410.method6573(field872, 0, field872 + 765, Statics.field1050);
            Statics.field879.method2070(field872 - 22, client.field494);
            Statics.field879.method2070(field872 + 765 + 22 - 128, client.field494);
            class410.method6557(var145);
        }
        Statics.field90[Statics.field3227.field1208 ? 1 : 0].method6629(field872 + 765 - 40, 463);
        if (client.field567 <= 5 || Statics.field438 != class305.field3789) {
            return;
        }
        if (Statics.field564 == null) {
            Statics.field564 = class415.method2496(Statics.field2005, "sl_button", "");
            return;
        }
        int var146 = field872 + 5;
        short var147 = 463;
        byte var148 = 100;
        byte var149 = 35;
        Statics.field564.method6629(var146, var147);
        arg0.method5210(class283.field3504 + " " + client.field483, var148 / 2 + var146, var149 / 2 + var147 - 2, 16777215, 0);
        if (Statics.field7 == null) {
            arg1.method5210(class283.field3645, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        } else {
            arg1.method5210(class283.field3644, var148 / 2 + var146, var149 / 2 + var147 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("x.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method260(String arg0, String arg1, String arg2) {
        field890 = arg0;
        field887 = arg1;
        field911 = arg2;
    }

    @ObfuscatedName("ai.v(Lay;I)V")
    public static void method953(class32 arg0) {
        while (class24.method3164()) {
            if (Statics.field14 == 13) {
                Statics.method4016();
                return;
            }
            if (Statics.field14 == 96) {
                if (field903 > 0 && Statics.field2215 != null) {
                    field903--;
                }
            } else if (Statics.field14 == 97 && field903 < field910 && Statics.field3901 != null) {
                field903++;
            }
        }
        if (class33.field231 != 1 && Statics.field1784 || class33.field231 != 4) {
            return;
        }
        int var1 = field872 + 280;
        if (class33.field232 >= var1 && class33.field232 <= var1 + 14 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(0, 0);
            return;
        }
        if (class33.field232 >= var1 + 15 && class33.field232 <= var1 + 80 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(0, 1);
            return;
        }
        int var2 = field872 + 390;
        if (class33.field232 >= var2 && class33.field232 <= var2 + 14 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(1, 0);
            return;
        }
        if (class33.field232 >= var2 + 15 && class33.field232 <= var2 + 80 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(1, 1);
            return;
        }
        int var3 = field872 + 500;
        if (class33.field232 >= var3 && class33.field232 <= var3 + 14 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(2, 0);
            return;
        }
        if (class33.field232 >= var3 + 15 && class33.field232 <= var3 + 80 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(2, 1);
            return;
        }
        int var4 = field872 + 610;
        if (class33.field232 >= var4 && class33.field232 <= var4 + 14 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(3, 0);
            return;
        }
        if (class33.field232 >= var4 + 15 && class33.field232 <= var4 + 80 && class33.field214 >= 4 && class33.field214 <= 18) {
            class61.method293(3, 1);
            return;
        }
        if (class33.field232 >= field872 + 708 && class33.field214 >= 4 && class33.field232 <= field872 + 708 + 50 && class33.field214 <= 20) {
            Statics.method4016();
            return;
        }
        if (field902 != -1) {
            class61 var5 = Statics.field4253[field902];
            Statics.method1560(var5);
            Statics.method4016();
            return;
        }
        if (field903 > 0 && Statics.field2215 != null && class33.field232 >= 0 && class33.field232 <= Statics.field2215.field4373 && class33.field214 >= Statics.field1050 / 2 - 50 && class33.field214 <= Statics.field1050 / 2 + 50) {
            field903--;
        }
        if (field903 < field910 && Statics.field3901 != null && class33.field232 >= Statics.field3203 - Statics.field3901.field4373 - 5 && class33.field232 <= Statics.field3203 && class33.field214 >= Statics.field1050 / 2 - 50 && class33.field214 <= Statics.field1050 / 2 + 50) {
            field903++;
        }
    }

    @ObfuscatedName("t.c(I)V")
    public static void method41() {
        if (class61.method3170()) {
            field894 = true;
            field903 = 0;
            field910 = 0;
        }
    }

    @ObfuscatedName("cw.x(B)V")
    public static void method2132() {
        method2363(24);
        method260(class283.field3637, class283.field3424, class283.field3431);
    }

    @ObfuscatedName("dl.p(II)V")
    public static void method2363(int arg0) {
        if (field888 != arg0) {
            field888 = arg0;
        }
    }
}
