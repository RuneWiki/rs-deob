package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("dq")
public class class79 {

    @ObfuscatedName("dq.ak")
    public static int field933 = 0;

    @ObfuscatedName("dq.ax")
    public static int field932 = field933 + 202;

    @ObfuscatedName("dq.al")
    public static int field935 = 10;

    @ObfuscatedName("dq.aa")
    public static String field934 = "";

    @ObfuscatedName("dq.ba")
    public static int field927 = -1;

    @ObfuscatedName("dq.bf")
    public static int field939 = 1;

    @ObfuscatedName("dq.cq")
    public static int field937 = 0;

    @ObfuscatedName("dq.cb")
    public static String field929 = "";

    @ObfuscatedName("dq.cd")
    public static String field942 = "";

    @ObfuscatedName("dq.ci")
    public static String field928 = "";

    @ObfuscatedName("dq.cn")
    public static String field941 = "";

    @ObfuscatedName("dq.co")
    public static String field947 = "";

    @ObfuscatedName("dq.cf")
    public static String field943 = "";

    @ObfuscatedName("dq.cp")
    public static int field931 = 0;

    @ObfuscatedName("dq.cv")
    public static String[] field944 = new String[8];

    @ObfuscatedName("dq.cx")
    public static String field946 = "";

    @ObfuscatedName("dq.cw")
    public static boolean field957 = false;

    @ObfuscatedName("dq.ca")
    public static boolean field948 = false;

    @ObfuscatedName("dq.ck")
    public static boolean field949 = true;

    @ObfuscatedName("dq.dq")
    public static int field950 = 0;

    @ObfuscatedName("dq.dd")
    public static String field951 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("dq.dc")
    public static String field952 = "1234567890";

    @ObfuscatedName("dq.dr")
    public static boolean field953 = false;

    @ObfuscatedName("dq.dt")
    public static int field954 = -1;

    @ObfuscatedName("dq.dx")
    public static int field955 = 0;

    @ObfuscatedName("dq.ds")
    public static int field956 = 0;

    @ObfuscatedName("dq.dv")
    public static long field938;

    @ObfuscatedName("dq.dj")
    public static long field958;

    @ObfuscatedName("dq.dp")
    public static String[] field959;

    @ObfuscatedName("dq.dy")
    public static String[] field960;

    @ObfuscatedName("dq.do")
    public static String[] field961;

    static {
        new DecimalFormat("##0.00");
        new class142();
        field938 = -1L;
        field958 = -1L;
        field959 = new String[] { "title.jpg" };
        field960 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field961 = new String[] { "logo_speedrunning" };
    }

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.ap(Lpe;Lpe;I)I")
    public static int method4348(class392 arg0, class392 arg1) {
        int var2 = 0;
        String[] var3 = field959;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method7014(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field960;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method7014(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field961;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method7010(var11) != -1 && arg1.method7014(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("ka.aw(Lpe;B)I")
    public static int method5220(class392 arg0) {
        int var1 = field960.length + field959.length;
        String[] var2 = field961;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method7010(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("hc.ak(Lpe;Lpe;Ltt;ZII)V")
    public static void method3640(class392 arg0, class392 arg1, class495 arg2, boolean arg3, int arg4) {
        if (!Statics.field940) {
            if (arg4 == 0) {
                method5949(arg3);
            } else {
                method42(arg4);
            }
            class568.method9612();
            byte[] var5 = arg0.method7013("title.jpg", "");
            Statics.field5625 = class31.method8331(var5);
            Statics.field5390 = Statics.field5625.method9730();
            method3121(arg1, client.field503);
            Statics.field2467 = class573.method2923(arg1, "titlebox", "");
            Statics.field288 = class573.method2923(arg1, "titlebutton", "");
            Statics.field2982 = class573.method2923(arg1, "titlebutton_large", "");
            Statics.field945 = class573.method2923(arg1, "play_now_text", "");
            class573.method2923(arg1, "titlebutton_wide42,1", "");
            Statics.field930 = class573.method6944(arg1, "runes", "");
            Statics.field5397 = class573.method6944(arg1, "title_mute", "");
            Statics.field149 = class573.method2923(arg1, "options_radio_buttons,0", "");
            Statics.field920 = class573.method2923(arg1, "options_radio_buttons,4", "");
            Statics.field5013 = class573.method2923(arg1, "options_radio_buttons,2", "");
            Statics.field5626 = class573.method2923(arg1, "options_radio_buttons,6", "");
            Statics.field1574 = Statics.field149.field5549;
            Statics.field3076 = Statics.field149.field5551;
            Statics.field4930 = new class102(Statics.field930, arg2.field5112);
            if (arg3) {
                field947 = "";
                field943 = "";
                field944 = new String[8];
                field931 = 0;
            }
            Statics.field3636 = 0;
            Statics.field4040 = "";
            field949 = true;
            field953 = false;
            if (Statics.field2378.method2790()) {
                class334.method3533(0, 0);
            } else {
                ArrayList var6 = new ArrayList();
                var6.add(new class346(Statics.field205, "scape main", "", 255, false));
                class334.method3888(var6, 0, 0, 0, 100, false);
            }
            class334.method3610();
            class393 var7 = Statics.field4124;
            var7.method7078(false);
            Statics.field940 = true;
            field933 = (Statics.field74 - 765) / 2;
            field932 = field933 + 202;
            Statics.field86 = field932 + 180;
            Statics.field5625.method9740(field933, 0);
            Statics.field5390.method9740(field933 + 382, 0);
            Statics.field5029.method9720(field933 + 382 - Statics.field5029.field5549 / 2, 18);
        } else if (arg4 == 4) {
            method42(4);
        }
    }

    @ObfuscatedName("gi.aj(ZZI)Lvc;")
    public static class571 method3565(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field5626 : Statics.field5013) : (arg1 ? Statics.field920 : Statics.field149);
    }

    @ObfuscatedName("nl.ai(B)V")
    public static void method6860() {
        if (field947 != null && field947.length() > 0) {
            return;
        }
        if (Statics.field2378.method2732() == null) {
            client.field791 = false;
        } else {
            field947 = Statics.field2378.method2732();
            client.field791 = true;
        }
    }

    @ObfuscatedName("ei.ay(Lpe;IB)V")
    public static void method3121(class392 arg0, int arg1) {
        if ((arg1 & class553.field5444.method37()) != 0) {
            Statics.field5029 = class573.method2923(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class553.field5445.method37()) != 0) {
            Statics.field5029 = class573.method2923(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class553.field5423.method37()) == 0) {
            Statics.field5029 = class573.method2923(arg0, "logo", "");
        } else {
            Statics.field5029 = class573.method2923(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("dp.as(I)V")
    public static void method2569() {
        if (client.field791 && field947 != null && field947.length() > 0) {
            field950 = 1;
        } else {
            field950 = 0;
        }
    }

    @ObfuscatedName("oe.ae(Lbz;Lqi;Lqi;B)V")
    public static void method6897(class35 arg0, class436 arg1, class436 arg2) {
        if (field953) {
            method3890(arg0);
            return;
        }
        if ((class36.field197 == 1 || !Statics.field1704 && class36.field197 == 4) && class36.field213 >= field933 + 765 - 50 && class36.field214 >= 453 && class36.field213 < field933 + 765 && class36.field214 < 503) {
            Statics.field2378.method2716(!Statics.field2378.method2790());
            if (Statics.field2378.method2790()) {
                class334.method3533(0, 0);
            } else {
                ArrayList var3 = new ArrayList();
                var3.add(new class346(Statics.field205, "scape main", "", 255, false));
                class334.method3888(var3, 0, 0, 0, 100, false);
            }
            class334.method3610();
        }
        if (client.field551 == 5) {
            return;
        }
        if (field938 == -1L) {
            field938 = class330.method2257() + 1000L;
        }
        long var4 = class330.method2257();
        if (client.method1230() && field958 == -1L) {
            field958 = var4;
            if (field958 > field938) {
                field938 = field958;
            }
        }
        if (client.field551 != 10 && client.field551 != 11) {
            return;
        }
        if (Statics.field3268 == class407.field4696) {
            if (class36.field197 == 1 || !Statics.field1704 && class36.field197 == 4) {
                int var6 = field933 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class36.field213 >= var6 && class36.field213 <= var6 + var8 && class36.field214 >= var7 && class36.field214 <= var7 + var9) {
                    if (class70.method5981()) {
                        field953 = true;
                        field955 = 0;
                        field956 = 0;
                    }
                    return;
                }
            }
            if (Statics.field4999 != null && class70.method5981()) {
                field953 = true;
                field955 = 0;
                field956 = 0;
            }
        }
        int var10 = class36.field197;
        int var11 = class36.field213;
        int var12 = class36.field214;
        if (var10 == 0) {
            var11 = class36.field195;
            var12 = class36.field198;
        }
        if (!Statics.field1704 && var10 == 4) {
            var10 = 1;
        }
        class270 var13 = client.field734;
        class270 var14 = var13;
        if (field937 == 0) {
            boolean var15 = false;
            while (var14.method5242()) {
                if (var14.field2989 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field86 - 80;
            short var17 = 291;
            if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                class32.method7129(client.method3043("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field86 + 80;
            if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20 || var15) {
                method3442();
            }
        } else if (field937 == 1) {
            while (true) {
                if (!var14.method5242()) {
                    int var19 = Statics.field86 - 80;
                    short var20 = 321;
                    if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                        method8936(false);
                    }
                    int var21 = Statics.field86 + 80;
                    if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var20 - 20 && var12 <= var20 + 20) {
                        method42(0);
                    }
                    break;
                }
                if (var14.field2989 == 84) {
                    method8936(false);
                } else if (var14.field2989 == 13) {
                    method42(0);
                }
            }
        } else if (field937 == 2) {
            short var22 = 201;
            int var117 = var22 + 52;
            if (var10 == 1 && var12 >= var117 - 12 && var12 < var117 + 2) {
                field950 = 0;
            }
            var117 += 15;
            if (var10 == 1 && var12 >= var117 - 12 && var12 < var117 + 2) {
                field950 = 1;
            }
            var117 += 15;
            short var23 = 361;
            if (Statics.field447 != null) {
                int var24 = Statics.field447.field4760 / 2;
                if (var10 == 1 && var11 >= Statics.field447.field4758 - var24 && var11 <= Statics.field447.field4758 + var24 && var12 >= var23 - 15 && var12 < var23) {
                    switch(field939) {
                        case 1:
                            class32.method7129(class383.field4493, true, false);
                            return;
                        case 2:
                            class32.method7129("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field86 - 80;
            short var26 = 321;
            if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                method6328();
                return;
            }
            int var27 = field932 + 180 + 80;
            if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var26 - 20 && var12 <= var26 + 20) {
                method42(0);
                field947 = "";
                field943 = "";
                Statics.field3636 = 0;
                Statics.field4040 = "";
                field949 = true;
            }
            int var28 = Statics.field86 + -117;
            short var29 = 277;
            field957 = var11 >= var28 && var11 < Statics.field1574 + var28 && var12 >= var29 && var12 < Statics.field3076 + var29;
            if (var10 == 1 && field957) {
                client.field791 = !client.field791;
                if (!client.field791 && Statics.field2378.method2732() != null) {
                    Statics.field2378.method2766((String) null);
                }
            }
            int var30 = Statics.field86 + 24;
            short var31 = 277;
            field948 = var11 >= var30 && var11 < Statics.field1574 + var30 && var12 >= var31 && var12 < Statics.field3076 + var31;
            if (var10 == 1 && field948) {
                Statics.field2378.method2735(!Statics.field2378.method2757());
                if (!Statics.field2378.method2757()) {
                    field947 = "";
                    Statics.field2378.method2766((String) null);
                    method2569();
                }
            }
            label1009: while (true) {
                Transferable var37;
                int var38;
                do {
                    while (true) {
                        label973: do {
                            while (true) {
                                while (var14.method5242()) {
                                    if (var14.field2989 == 13) {
                                        method42(0);
                                        field947 = "";
                                        field943 = "";
                                        Statics.field3636 = 0;
                                        Statics.field4040 = "";
                                        field949 = true;
                                    } else {
                                        if (field950 != 0) {
                                            continue label973;
                                        }
                                        char var32 = var14.field2997;
                                        for (int var33 = 0; var33 < field951.length() && var32 != field951.charAt(var33); var33++) {
                                        }
                                        if (var14.field2989 == 85 && field947.length() > 0) {
                                            field947 = field947.substring(0, field947.length() - 1);
                                        }
                                        if (var14.field2989 == 84 || var14.field2989 == 80) {
                                            field950 = 1;
                                        }
                                        char var34 = var14.field2997;
                                        boolean var35 = field951.indexOf(var34) != -1;
                                        if (var35 && field947.length() < 320) {
                                            field947 = field947 + var14.field2997;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field950 != 1);
                        if (var14.field2989 == 85 && field943.length() > 0) {
                            field943 = field943.substring(0, field943.length() - 1);
                        } else if (var14.field2989 == 84 || var14.field2989 == 80) {
                            field950 = 0;
                            if (var14.field2989 == 84) {
                                field947 = field947.trim();
                                if (field947.length() == 0) {
                                    method3224(class383.field4300, class383.field4489, class383.field4301);
                                } else if (field943.length() == 0) {
                                    method3224(class383.field4257, class383.field4262, class383.field4192);
                                } else {
                                    method3224(class383.field4287, class383.field4411, class383.field4412);
                                    client.field531 = Statics.field2378.method2738(field947) ? class131.field1530 : class131.field1537;
                                    Statics.method3201(20);
                                }
                                return;
                            }
                        }
                        if ((var14.method5249(82) || var14.method5249(87)) && var14.field2989 == 67) {
                            Clipboard var36 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var37 = var36.getContents(Statics.field995);
                            var38 = 20 - field943.length();
                            break;
                        }
                        if (class418.method6904(var14.field2997)) {
                            char var46 = var14.field2997;
                            boolean var47 = field951.indexOf(var46) != -1;
                            if (var47 && field943.length() < 20) {
                                field943 = field943 + var14.field2997;
                            }
                        }
                    }
                } while (var38 <= 0);
                try {
                    String var39 = (String) var37.getTransferData(DataFlavor.stringFlavor);
                    int var40 = Math.min(var38, var39.length());
                    int var41 = 0;
                    while (true) {
                        if (var41 >= var40) {
                            field943 = field943 + var39.substring(0, var40);
                            continue label1009;
                        }
                        if (!class418.method6904(var39.charAt(var41))) {
                            break;
                        }
                        char var42 = var39.charAt(var41);
                        boolean var43 = field951.indexOf(var42) != -1;
                        if (!var43) {
                            break;
                        }
                        var41++;
                    }
                    method42(3);
                    return;
                } catch (UnsupportedFlavorException var115) {
                } catch (IOException var116) {
                }
            }
        } else if (field937 == 3) {
            int var48 = field932 + 180;
            short var49 = 241;
            class424 var50 = arg1.method7959(25, class383.field4431.length() - 34, class383.field4431, var48, var49);
            if (var10 == 1 && var50.method7508(var11, var12)) {
                class32.method7129(class383.field4432, true, false);
            }
            int var51 = field932 + 180;
            short var52 = 276;
            if (var10 == 1 && var11 >= var51 - 75 && var11 <= var51 + 75 && var12 >= var52 - 20 && var12 <= var52 + 20) {
                method5949(false);
            }
            int var53 = field932 + 180;
            short var54 = 326;
            if (var10 == 1 && var11 >= var53 - 75 && var11 <= var53 + 75 && var12 >= var54 - 20 && var12 <= var54 + 20) {
                class32.method7129(class383.field4493, true, false);
                return;
            }
        } else if (field937 == 4) {
            int var55 = field932 + 180 - 80;
            short var56 = 321;
            if (var10 == 1 && var11 >= var55 - 75 && var11 <= var55 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                method2259();
                return;
            }
            if (var10 == 1 && var11 >= field932 + 180 - 9 && var11 <= field932 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field949 = !field949;
            }
            if (var10 == 1 && var11 >= field932 + 180 - 34 && var11 <= field932 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                class32.method7129(class383.field4493, true, false);
            }
            int var57 = field932 + 180 + 80;
            if (var10 == 1 && var11 >= var57 - 75 && var11 <= var57 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                method42(0);
                field947 = "";
                field943 = "";
                Statics.field3636 = 0;
                Statics.field4040 = "";
            }
            while (var14.method5242()) {
                boolean var58 = false;
                for (int var59 = 0; var59 < field952.length(); var59++) {
                    if (var14.field2997 == field952.charAt(var59)) {
                        var58 = true;
                        break;
                    }
                }
                if (var14.field2989 == 13) {
                    method42(0);
                    field947 = "";
                    field943 = "";
                    Statics.field3636 = 0;
                    Statics.field4040 = "";
                } else {
                    if (var14.field2989 == 85 && Statics.field4040.length() > 0) {
                        Statics.field4040 = Statics.field4040.substring(0, Statics.field4040.length() - 1);
                    }
                    if (var14.field2989 == 84) {
                        Statics.field4040.trim();
                        if (Statics.field4040.length() == 6) {
                            Statics.field3636 = Integer.parseInt(Statics.field4040);
                            Statics.field4040 = "";
                            client.field531 = field949 ? class131.field1531 : class131.field1533;
                            method3224(class383.field4287, class383.field4411, class383.field4412);
                            Statics.method3201(20);
                        } else {
                            method3224(class383.field4219, class383.field4220, class383.field4221);
                        }
                        return;
                    }
                    if (var58 && Statics.field4040.length() < 6) {
                        Statics.field4040 = Statics.field4040 + var14.field2997;
                    }
                }
            }
        } else if (field937 == 5) {
            int var60 = field932 + 180 - 80;
            short var61 = 321;
            if (var10 == 1 && var11 >= var60 - 75 && var11 <= var60 + 75 && var12 >= var61 - 20 && var12 <= var61 + 20) {
                method5766();
                return;
            }
            int var62 = field932 + 180 + 80;
            if (var10 == 1 && var11 >= var62 - 75 && var11 <= var62 + 75 && var12 >= var61 - 20 && var12 <= var61 + 20) {
                method8936(true);
            }
            short var63 = 361;
            if (Statics.field2345 != null) {
                int var64 = Statics.field2345.field4760 / 2;
                if (var10 == 1 && var11 >= Statics.field2345.field4758 - var64 && var11 <= Statics.field2345.field4758 + var64 && var12 >= var63 - 15 && var12 < var63) {
                    class32.method7129(client.method3043("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var14.method5242()) {
                boolean var65 = false;
                for (int var66 = 0; var66 < field951.length(); var66++) {
                    if (var14.field2997 == field951.charAt(var66)) {
                        var65 = true;
                        break;
                    }
                }
                if (var14.field2989 == 13) {
                    method8936(true);
                } else {
                    if (var14.field2989 == 85 && field947.length() > 0) {
                        field947 = field947.substring(0, field947.length() - 1);
                    }
                    if (var14.field2989 == 84) {
                        method5766();
                        return;
                    }
                    if (var65 && field947.length() < 320) {
                        field947 = field947 + var14.field2997;
                    }
                }
            }
        } else if (field937 == 6) {
            while (true) {
                do {
                    if (!var14.method5242()) {
                        short var67 = 321;
                        if (var10 == 1 && var12 >= var67 - 20 && var12 <= var67 + 20) {
                            method8936(true);
                        }
                        return;
                    }
                } while (var14.field2989 != 84 && var14.field2989 != 13);
                method8936(true);
            }
        } else if (field937 == 7) {
            if (Statics.field4742 && !client.field765) {
                int var68 = Statics.field86 - 150;
                int var69 = var68 + 240 + 25 + 40;
                short var70 = 231;
                int var71 = var70 + 40;
                if (var10 == 1 && var11 >= var68 && var11 <= var69 && var12 >= var70 && var12 <= var71) {
                    int var72 = var68;
                    int var73 = 0;
                    int var74;
                    while (true) {
                        if (var73 >= 8) {
                            var74 = 0;
                            break;
                        }
                        if (var11 <= var72 + 30) {
                            var74 = var73;
                            break;
                        }
                        var72 += 30;
                        var72 += var73 == 1 || var73 == 3 ? 20 : 5;
                        var73++;
                    }
                    field931 = var74;
                }
                int var75 = field932 + 180 - 80;
                short var76 = 321;
                if (var10 == 1 && var11 >= var75 - 75 && var11 <= var75 + 75 && var12 >= var76 - 20 && var12 <= var76 + 20) {
                    boolean var77 = method1932();
                    if (var77) {
                        Statics.method3201(50);
                        return;
                    }
                }
                int var78 = field932 + 180 + 80;
                if (var10 == 1 && var11 >= var78 - 75 && var11 <= var78 + 75 && var12 >= var76 - 20 && var12 <= var76 + 20) {
                    field944 = new String[8];
                    method8936(true);
                }
                while (var14.method5242()) {
                    if (var14.field2989 == 101) {
                        field944[field931] = null;
                    }
                    if (var14.field2989 == 85) {
                        if (field944[field931] == null && field931 > 0) {
                            field931--;
                        }
                        field944[field931] = null;
                    }
                    if (var14.field2997 >= '0' && var14.field2997 <= '9') {
                        field944[field931] = "" + var14.field2997;
                        if (field931 < 7) {
                            field931++;
                        }
                    }
                    if (var14.field2989 == 84) {
                        boolean var79 = method1932();
                        if (var79) {
                            Statics.method3201(50);
                        }
                        return;
                    }
                }
            } else {
                int var80 = field932 + 180 - 80;
                short var81 = 321;
                if (var10 == 1 && var11 >= var80 - 75 && var11 <= var80 + 75 && var12 >= var81 - 20 && var12 <= var81 + 20) {
                    class32.method7129(client.method3043("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3224(class383.field4441, class383.field4442, class383.field4451);
                    method42(6);
                    return;
                }
                int var82 = field932 + 180 + 80;
                if (var10 == 1 && var11 >= var82 - 75 && var11 <= var82 + 75 && var12 >= var81 - 20 && var12 <= var81 + 20) {
                    method8936(true);
                }
            }
        } else if (field937 == 8) {
            int var83 = field932 + 180 - 80;
            short var84 = 321;
            if (var10 == 1 && var11 >= var83 - 75 && var11 <= var83 + 75 && var12 >= var84 - 20 && var12 <= var84 + 20) {
                class32.method7129("https://www.jagex.com/terms/privacy", true, false);
                method3224(class383.field4441, class383.field4442, class383.field4451);
                method42(6);
                return;
            }
            int var85 = field932 + 180 + 80;
            if (var10 == 1 && var11 >= var85 - 75 && var11 <= var85 + 75 && var12 >= var84 - 20 && var12 <= var84 + 20) {
                method8936(true);
            }
        } else if (field937 == 9) {
            int var86 = field932 + 180;
            short var87 = 311;
            if (var13.field2989 == 84 || var13.field2989 == 13 || var10 == 1 && var11 >= var86 - 75 && var11 <= var86 + 75 && var12 >= var87 - 20 && var12 <= var87 + 20) {
                method5949(false);
            }
        } else if (field937 == 10) {
            int var88 = field932 + 180;
            short var89 = 209;
            if (var13.field2989 == 84 || var10 == 1 && var11 >= var88 - 109 && var11 <= var88 + 109 && var12 >= var89 && var12 <= var89 + 68) {
                method3224(class383.field4287, class383.field4411, class383.field4412);
                client.field617 = class563.field5518;
                client.field531 = Statics.field2378.method2738(field947) ? class131.field1530 : class131.field1537;
                Statics.method3201(20);
            }
        } else if (field937 == 12) {
            int var90 = Statics.field86;
            short var91 = 233;
            class424 var92 = arg2.method7959(0, 30, class383.field4491, var90, var91);
            class424 var93 = arg2.method7959(32, 32, class383.field4491, var90, var91);
            class424 var94 = arg2.method7959(70, 34, class383.field4491, var90, var91);
            int var118 = var91 + 17;
            class424 var95 = arg2.method7959(0, 34, class383.field4474, var90, var118);
            if (var10 == 1) {
                if (var92.method7508(var11, var12)) {
                    class32.method7129("https://www.jagex.com/terms", true, false);
                } else if (var93.method7508(var11, var12)) {
                    class32.method7129("https://www.jagex.com/terms/privacy", true, false);
                } else if (var94.method7508(var11, var12) || var95.method7508(var11, var12)) {
                    class32.method7129("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var96 = Statics.field86 - 80;
            short var97 = 311;
            if (var10 == 1 && var11 >= var96 - 75 && var11 <= var96 + 75 && var12 >= var97 - 20 && var12 <= var97 + 20) {
                client.method3582();
                method5949(true);
            }
            int var98 = Statics.field86 + 80;
            if (var10 == 1 && var11 >= var98 - 75 && var11 <= var98 + 75 && var12 >= var97 - 20 && var12 <= var97 + 20) {
                field937 = 13;
            }
        } else if (field937 == 13) {
            int var99 = Statics.field86;
            short var100 = 321;
            if (var10 == 1 && var11 >= var99 - 75 && var11 <= var99 + 75 && var12 >= var100 - 20 && var12 <= var100 + 20) {
                method5949(true);
            }
        } else if (field937 == 14) {
            String var101 = "";
            switch(field927) {
                case 0:
                    var101 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var101 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var101 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method8936(false);
            }
            int var102 = field932 + 180;
            short var103 = 276;
            if (var10 == 1 && var11 >= var102 - 75 && var11 <= var102 + 75 && var12 >= var103 - 20 && var12 <= var103 + 20) {
                class32.method7129(var101, true, false);
                method3224(class383.field4441, class383.field4442, class383.field4451);
                method42(6);
                return;
            }
            int var104 = field932 + 180;
            short var105 = 326;
            if (var10 == 1 && var11 >= var104 - 75 && var11 <= var104 + 75 && var12 >= var105 - 20 && var12 <= var105 + 20) {
                method8936(false);
            }
        } else if (field937 == 24) {
            int var106 = field932 + 180;
            short var107 = 301;
            if (var10 == 1 && var11 >= var106 - 75 && var11 <= var106 + 75 && var12 >= var107 - 20 && var12 <= var107 + 20) {
                method5949(false);
            }
        } else if (field937 == 32) {
            int var108 = field932 + 180 - 80;
            short var109 = 321;
            if (var10 == 1 && var11 >= var108 - 75 && var11 <= var108 + 75 && var12 >= var109 - 20 && var12 <= var109 + 20) {
                class32.method7129(client.method3043("secure", true) + "m=dob/set_dob.ws", true, false);
                method3224(class383.field4441, class383.field4442, class383.field4451);
                method42(6);
                return;
            }
            int var110 = field932 + 180 + 80;
            if (var10 == 1 && var11 >= var110 - 75 && var11 <= var110 + 75 && var12 >= var109 - 20 && var12 <= var109 + 20) {
                method8936(true);
            }
        } else if (field937 == 33) {
            int var111 = field932 + 180;
            short var112 = 276;
            if (var10 == 1 && var11 >= var111 - 75 && var11 <= var111 + 75 && var12 >= var112 - 20 && var12 <= var112 + 20) {
                class32.method7129(class383.field4432, true, false);
            }
            int var113 = field932 + 180;
            short var114 = 326;
            if (var10 == 1 && var11 >= var113 - 75 && var11 <= var113 + 75 && var12 >= var114 - 20 && var12 <= var114 + 20) {
                method8936(true);
            }
        }
    }

    @ObfuscatedName("ck.am(I)V")
    public static void method2259() {
        Statics.field4040.trim();
        if (Statics.field4040.length() != 6) {
            method3224(class383.field4219, class383.field4220, class383.field4221);
            return;
        }
        Statics.field3636 = Integer.parseInt(Statics.field4040);
        Statics.field4040 = "";
        client.field531 = field949 ? class131.field1531 : class131.field1533;
        method3224(class383.field4287, class383.field4411, class383.field4412);
        Statics.method3201(20);
    }

    @ObfuscatedName("na.at(B)V")
    public static void method6328() {
        field947 = field947.trim();
        if (field947.length() == 0) {
            method3224(class383.field4300, class383.field4489, class383.field4301);
        } else if (field943.length() == 0) {
            method3224(class383.field4257, class383.field4262, class383.field4192);
        } else {
            method3224(class383.field4287, class383.field4411, class383.field4412);
            client.field531 = Statics.field2378.method2738(field947) ? class131.field1530 : class131.field1537;
            Statics.method3201(20);
        }
    }

    @ObfuscatedName("gn.au(I)V")
    public static void method3442() {
        if ((client.field503 & class553.field5440.method37()) != 0) {
            field929 = "";
            field942 = class383.field4406;
            field928 = class383.field4358;
            field941 = class383.field4297;
            method42(1);
            method2569();
        } else if ((client.field503 & class553.field5417.method37()) != 0) {
            if ((client.field503 & class553.field5425.method37()) == 0) {
                field942 = class383.field4397;
                field928 = class383.field4472;
                field941 = class383.field4304;
            } else {
                field942 = class383.field4403;
                field928 = class383.field4311;
                field941 = class383.field4285;
            }
            field929 = class383.field4396;
            method42(1);
            method2569();
        } else if ((client.field503 & class553.field5425.method37()) == 0) {
            method8936(false);
        } else {
            field942 = class383.field4400;
            field928 = class383.field4208;
            field941 = class383.field4402;
            field929 = class383.field4396;
            method42(1);
            method2569();
        }
    }

    @ObfuscatedName("cc.an(B)Z")
    public static boolean method1932() {
        Date var0;
        try {
            var0 = method5822();
        } catch (ParseException var8) {
            method42(7);
            method3224("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        boolean var2 = method4157(var0);
        Calendar var3 = Calendar.getInstance();
        var3.set(2, 0);
        var3.set(5, 1);
        var3.set(1, 1900);
        Date var4 = var3.getTime();
        boolean var6 = var0.after(var4);
        if (!var6) {
            method42(7);
            method3224("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var2) {
            Statics.field2065 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field2065 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("iw.ao(Ljava/util/Date;I)Z")
    public static boolean method4157(Date arg0) {
        Calendar var1 = Calendar.getInstance();
        var1.set(1, var1.get(1) - 13);
        var1.set(5, var1.get(5) + 1);
        var1.set(11, 0);
        var1.set(12, 0);
        var1.set(13, 0);
        var1.set(14, 0);
        Date var2 = var1.getTime();
        return arg0.before(var2);
    }

    @ObfuscatedName("lt.af(I)Ljava/util/Date;")
    public static Date method5822() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field944;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method42(7);
                method3224("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("us.ar(ZI)V")
    public static void method8936(boolean arg0) {
        if (Statics.field995.method1243() || Statics.field995.method1245() || Statics.field995.method1244()) {
            method42(10);
            return;
        }
        field942 = class383.field4385;
        field928 = class383.field4394;
        field941 = class383.field4395;
        method42(2);
        if (arg0) {
            field943 = "";
        }
        method6860();
        method2569();
    }

    @ObfuscatedName("mm.ab(ZI)V")
    public static void method5949(boolean arg0) {
        byte var1 = 0;
        if (!client.method6362()) {
            var1 = 12;
        } else if (Statics.field995.method1243() || Statics.field995.method1245() || Statics.field995.method1244()) {
            var1 = 10;
        }
        method42(var1);
        if (arg0) {
            field947 = "";
            field943 = "";
            Statics.field3636 = 0;
            Statics.field4040 = "";
        }
        method6860();
        method2569();
    }

    @ObfuscatedName("lg.az(I)V")
    public static void method5766() {
        field947 = field947.trim();
        if (field947.length() == 0) {
            method3224(class383.field4444, class383.field4445, class383.field4206);
            return;
        }
        long var0 = class76.method2708();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class76.method6327(var0, field947);
        }
        switch(var2) {
            case 2:
                method3224(class383.field4238, class383.field4199, class383.field4449);
                method42(6);
                break;
            case 3:
                method3224(class383.field4450, class383.field4339, class383.field4452);
                break;
            case 4:
                method3224(class383.field4453, class383.field4454, class383.field4269);
                break;
            case 5:
                method3224(class383.field4456, class383.field4457, class383.field4458);
                break;
            case 6:
                method3224(class383.field4459, class383.field4343, class383.field4471);
                break;
            case 7:
                method3224(class383.field4216, class383.field4463, class383.field4464);
        }
    }

    @ObfuscatedName("dr.ag(Lqi;Lqi;Lqi;I)V")
    public static void method2373(class436 arg0, class436 arg1, class436 arg2) {
        field933 = (Statics.field74 - 765) / 2;
        field932 = field933 + 202;
        Statics.field86 = field932 + 180;
        if (field953) {
            method3945(arg0, arg1);
            return;
        }
        Statics.field5625.method9740(field933, 0);
        Statics.field5390.method9740(field933 + 382, 0);
        Statics.field5029.method9720(field933 + 382 - Statics.field5029.field5549 / 2, 18);
        if (client.field551 == 0 || client.field551 == 5) {
            byte var3 = 20;
            arg0.method7935(class383.field4392, field932 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class568.method9620(field932 + 180 - 152, var4, 304, 34, 9179409);
            class568.method9620(field932 + 180 - 151, var4 + 1, 302, 32, 0);
            class568.method9616(field932 + 180 - 150, var4 + 2, field935 * 3, 30, 9179409);
            class568.method9616(field935 * 3 + (field932 + 180 - 150), var4 + 2, 300 - field935 * 3, 30, 0);
            arg0.method7935(field934, field932 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field551 == 20) {
            Statics.field2467.method9720(field932 + 180 - Statics.field2467.field5549 / 2, 271 - Statics.field2467.field5551 / 2);
            short var5 = 201;
            arg0.method7935(field942, field932 + 180, var5, 16776960, 0);
            int var110 = var5 + 15;
            arg0.method7935(field928, field932 + 180, var110, 16776960, 0);
            int var111 = var110 + 15;
            arg0.method7935(field941, field932 + 180, var111, 16776960, 0);
            int var112 = var111 + 15;
            int var113 = var112 + 7;
            if (field937 != 4 && field937 != 10) {
                arg0.method7932(class383.field4419, field932 + 180 - 110, var113, 16777215, 0);
                short var6 = 200;
                String var7 = Statics.field2378.method2757() ? class420.method5133(field947) : field947;
                String var8;
                for (var8 = var7; arg0.method7933(var8) > var6; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method7932(class440.method7930(var8), field932 + 180 - 70, var113, 16777215, 0);
                var110 = var113 + 15;
                String var9;
                for (var9 = class420.method5133(field943); arg0.method7933(var9) > var6; var9 = var9.substring(1)) {
                }
                arg0.method7932(class383.field4420 + var9, field932 + 180 - 108, var110, 16777215, 0);
                var110 += 15;
            }
        }
        if (client.field551 == 10 || client.field551 == 11 || client.field551 == 50) {
            Statics.field2467.method9720(field932, 171);
            if (field937 == 0) {
                short var10 = 251;
                arg0.method7935(class383.field4422, field932 + 180, var10, 16776960, 0);
                int var114 = var10 + 30;
                int var11 = field932 + 180 - 80;
                short var12 = 291;
                Statics.field288.method9720(var11 - 73, var12 - 20);
                arg0.method8009(class383.field4423, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field932 + 180 + 80;
                Statics.field288.method9720(var13 - 73, var12 - 20);
                arg0.method8009(class383.field4424, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field937 == 1) {
                arg0.method7935(field929, field932 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method7935(field942, field932 + 180, var14, 16777215, 0);
                int var115 = var14 + 15;
                arg0.method7935(field928, field932 + 180, var115, 16777215, 0);
                int var116 = var115 + 15;
                arg0.method7935(field941, field932 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                int var15 = field932 + 180 - 80;
                short var16 = 321;
                Statics.field288.method9720(var15 - 73, var16 - 20);
                arg0.method7935(class383.field4404, var15, var16 + 5, 16777215, 0);
                int var17 = field932 + 180 + 80;
                Statics.field288.method9720(var17 - 73, var16 - 20);
                arg0.method7935(class383.field4426, var17, var16 + 5, 16777215, 0);
            } else if (field937 == 2) {
                short var18 = 201;
                arg0.method7935(field942, Statics.field86, var18, 16776960, 0);
                int var118 = var18 + 15;
                arg0.method7935(field928, Statics.field86, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg0.method7935(field941, Statics.field86, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var121 = var120 + 7;
                arg0.method7932(class383.field4419, Statics.field86 - 110, var121, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field2378.method2757() ? class420.method5133(field947) : field947;
                String var21;
                for (var21 = var20; arg0.method7933(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method7932(class440.method7930(var21) + (field950 == 0 & client.field518 % 40 < 20 ? class107.method3870(16776960) + class107.field1381 : ""), Statics.field86 - 70, var121, 16777215, 0);
                var118 = var121 + 15;
                String var22;
                for (var22 = class420.method5133(field943); arg0.method7933(var22) > var19; var22 = var22.substring(1)) {
                }
                arg0.method7932(class383.field4420 + var22 + (field950 == 1 & client.field518 % 40 < 20 ? class107.method3870(16776960) + class107.field1381 : ""), Statics.field86 - 108, var118, 16777215, 0);
                var118 += 15;
                short var23 = 277;
                int var24 = Statics.field86 + -117;
                class571 var25 = method3565(client.field791, field957);
                var25.method9720(var24, var23);
                int var26 = var25.field5549 + 5 + var24;
                arg1.method7932(class383.field4254, var26, var23 + 13, 16776960, 0);
                int var27 = Statics.field86 + 24;
                class571 var28 = method3565(Statics.field2378.method2757(), field948);
                var28.method9720(var27, var23);
                int var29 = var28.field5549 + 5 + var27;
                arg1.method7932(class383.field4428, var29, var23 + 13, 16776960, 0);
                int var122 = var23 + 15;
                int var30 = Statics.field86 - 80;
                short var31 = 321;
                Statics.field288.method9720(var30 - 73, var31 - 20);
                arg0.method7935(class383.field4425, var30, var31 + 5, 16777215, 0);
                int var32 = Statics.field86 + 80;
                Statics.field288.method9720(var32 - 73, var31 - 20);
                arg0.method7935(class383.field4426, var32, var31 + 5, 16777215, 0);
                short var33 = 357;
                switch(field939) {
                    case 2:
                        Statics.field2585 = class383.field4313;
                        break;
                    default:
                        Statics.field2585 = class383.field4438;
                }
                Statics.field447 = new class424(Statics.field86, var33, arg1.method7933(Statics.field2585), 11);
                Statics.field2345 = new class424(Statics.field86, var33, arg1.method7933(class383.field4439), 11);
                arg1.method7935(Statics.field2585, Statics.field86, var33, 16777215, 0);
            } else if (field937 == 3) {
                short var34 = 201;
                arg0.method7935(class383.field4429, field932 + 180, var34, 16776960, 0);
                int var123 = var34 + 20;
                arg1.method7935(class383.field4430, field932 + 180, var123, 16776960, 0);
                int var124 = var123 + 20;
                arg1.method7935(class383.field4431, field932 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var35 = field932 + 180;
                short var36 = 276;
                Statics.field288.method9720(var35 - 73, var36 - 20);
                arg2.method7935(class383.field4235, var35, var36 + 5, 16777215, 0);
                int var37 = field932 + 180;
                short var38 = 326;
                Statics.field288.method9720(var37 - 73, var38 - 20);
                arg2.method7935(class383.field4433, var37, var38 + 5, 16777215, 0);
            } else if (field937 == 4) {
                arg0.method7935(class383.field4409, field932 + 180, 201, 16776960, 0);
                short var39 = 236;
                arg0.method7935(field942, field932 + 180, var39, 16777215, 0);
                int var126 = var39 + 15;
                arg0.method7935(field928, field932 + 180, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method7935(field941, field932 + 180, var127, 16777215, 0);
                int var128 = var127 + 15;
                arg0.method7932(class383.field4421 + class420.method5133(Statics.field4040) + (client.field518 % 40 < 20 ? class107.method3870(16776960) + class107.field1381 : ""), field932 + 180 - 108, var128, 16777215, 0);
                int var129 = var128 - 8;
                arg0.method7932(class383.field4189, field932 + 180 - 9, var129, 16776960, 0);
                int var130 = var129 + 15;
                arg0.method7932(class383.field4190, field932 + 180 - 9, var130, 16776960, 0);
                int var40 = field932 + 180 - 9 + arg0.method7933(class383.field4190) + 15;
                int var41 = var130 - arg0.field4851;
                class571 var42;
                if (field949) {
                    var42 = Statics.field5013;
                } else {
                    var42 = Statics.field149;
                }
                var42.method9720(var40, var41);
                var126 = var130 + 15;
                int var43 = field932 + 180 - 80;
                short var44 = 321;
                Statics.field288.method9720(var43 - 73, var44 - 20);
                arg0.method7935(class383.field4404, var43, var44 + 5, 16777215, 0);
                int var45 = field932 + 180 + 80;
                Statics.field288.method9720(var45 - 73, var44 - 20);
                arg0.method7935(class383.field4426, var45, var44 + 5, 16777215, 0);
                arg1.method7935(class383.field4438, field932 + 180, var44 + 36, 16777215, 0);
            } else if (field937 == 5) {
                arg0.method7935(class383.field4434, field932 + 180, 201, 16776960, 0);
                short var46 = 221;
                arg2.method7935(field942, field932 + 180, var46, 16776960, 0);
                int var131 = var46 + 15;
                arg2.method7935(field928, field932 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg2.method7935(field941, field932 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var134 = var133 + 14;
                arg0.method7932(class383.field4435, field932 + 180 - 145, var134, 16777215, 0);
                short var47 = 174;
                String var48 = Statics.field2378.method2757() ? class420.method5133(field947) : field947;
                String var49;
                for (var49 = var48; arg0.method7933(var49) > var47; var49 = var49.substring(1)) {
                }
                arg0.method7932(class440.method7930(var49) + (client.field518 % 40 < 20 ? class107.method3870(16776960) + class107.field1381 : ""), field932 + 180 - 34, var134, 16777215, 0);
                var131 = var134 + 15;
                int var50 = field932 + 180 - 80;
                short var51 = 321;
                Statics.field288.method9720(var50 - 73, var51 - 20);
                arg0.method7935(class383.field4335, var50, var51 + 5, 16777215, 0);
                int var52 = field932 + 180 + 80;
                Statics.field288.method9720(var52 - 73, var51 - 20);
                arg0.method7935(class383.field4455, var52, var51 + 5, 16777215, 0);
                short var53 = 356;
                arg1.method7935(class383.field4439, Statics.field86, var53, 268435455, 0);
            } else if (field937 == 6) {
                short var54 = 201;
                arg0.method7935(field942, field932 + 180, var54, 16776960, 0);
                int var135 = var54 + 15;
                arg0.method7935(field928, field932 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method7935(field941, field932 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var55 = field932 + 180;
                short var56 = 321;
                Statics.field288.method9720(var55 - 73, var56 - 20);
                arg0.method7935(class383.field4455, var55, var56 + 5, 16777215, 0);
            } else if (field937 == 7) {
                if (Statics.field4742 && !client.field765) {
                    short var57 = 201;
                    arg0.method7935(field942, Statics.field86, var57, 16776960, 0);
                    int var138 = var57 + 15;
                    arg0.method7935(field928, Statics.field86, var138, 16776960, 0);
                    int var139 = var138 + 15;
                    arg0.method7935(field941, Statics.field86, var139, 16776960, 0);
                    int var58 = Statics.field86 - 150;
                    int var140 = var139 + 10;
                    for (int var59 = 0; var59 < 8; var59++) {
                        Statics.field288.method9715(var58, var140, 30, 40);
                        boolean var60 = field931 == var59 & client.field518 % 40 < 20;
                        arg0.method7932((field944[var59] == null ? "" : field944[var59]) + (var60 ? class107.method3870(16776960) + class107.field1381 : ""), var58 + 10, var140 + 27, 16777215, 0);
                        if (var59 == 1 || var59 == 3) {
                            var58 += 50;
                            arg0.method7932(class440.method7930("/"), var58 - 13, var140 + 27, 16777215, 0);
                        } else {
                            var58 += 35;
                        }
                    }
                    int var61 = Statics.field86 - 80;
                    short var62 = 321;
                    Statics.field288.method9720(var61 - 73, var62 - 20);
                    arg0.method7935("Submit", var61, var62 + 5, 16777215, 0);
                    int var63 = Statics.field86 + 80;
                    Statics.field288.method9720(var63 - 73, var62 - 20);
                    arg0.method7935(class383.field4426, var63, var62 + 5, 16777215, 0);
                } else {
                    short var64 = 216;
                    arg0.method7935(class383.field4465, field932 + 180, var64, 16776960, 0);
                    int var141 = var64 + 15;
                    arg2.method7935(class383.field4466, field932 + 180, var141, 16776960, 0);
                    int var142 = var141 + 15;
                    arg2.method7935(class383.field4467, field932 + 180, var142, 16776960, 0);
                    int var143 = var142 + 15;
                    int var65 = field932 + 180 - 80;
                    short var66 = 321;
                    Statics.field288.method9720(var65 - 73, var66 - 20);
                    arg0.method7935(class383.field4399, var65, var66 + 5, 16777215, 0);
                    int var67 = field932 + 180 + 80;
                    Statics.field288.method9720(var67 - 73, var66 - 20);
                    arg0.method7935(class383.field4455, var67, var66 + 5, 16777215, 0);
                }
            } else if (field937 == 8) {
                short var68 = 216;
                arg0.method7935(class383.field4492, field932 + 180, var68, 16776960, 0);
                int var144 = var68 + 15;
                arg2.method7935(class383.field4322, field932 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg2.method7935(class383.field4323, field932 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var69 = field932 + 180 - 80;
                short var70 = 321;
                Statics.field288.method9720(var69 - 73, var70 - 20);
                arg0.method7935(class383.field4436, var69, var70 + 5, 16777215, 0);
                int var71 = field932 + 180 + 80;
                Statics.field288.method9720(var71 - 73, var70 - 20);
                arg0.method7935(class383.field4455, var71, var70 + 5, 16777215, 0);
            } else if (field937 == 9) {
                short var72 = 221;
                arg0.method7935(field942, field932 + 180, var72, 16776960, 0);
                int var147 = var72 + 25;
                arg0.method7935(field928, field932 + 180, var147, 16776960, 0);
                int var148 = var147 + 25;
                arg0.method7935(field941, field932 + 180, var148, 16776960, 0);
                int var73 = field932 + 180;
                short var74 = 311;
                Statics.field288.method9720(var73 - 73, var74 - 20);
                arg0.method7935(class383.field4235, var73, var74 + 5, 16777215, 0);
            } else if (field937 == 10) {
                int var75 = field932 + 180;
                short var76 = 209;
                arg0.method7935(class383.field4422, field932 + 180, var76, 16776960, 0);
                int var149 = var76 + 20;
                Statics.field2982.method9720(var75 - 109, var149);
                if (field946.isEmpty()) {
                    Statics.field945.method9720(var75 - 48, var149 + 18);
                } else {
                    Statics.field945.method9720(var75 - 48, var149 + 5);
                    arg0.method7935(field946, var75, var149 + 68 - 15, 16776960, 0);
                }
            } else if (field937 == 12) {
                int var77 = Statics.field86;
                short var78 = 216;
                arg2.method7935(class383.field4321, var77, var78, 16777215, 0);
                int var150 = var78 + 17;
                arg2.method7935(class383.field4491, var77, var150, 16777215, 0);
                int var151 = var150 + 17;
                arg2.method7935(class383.field4474, var77, var151, 16777215, 0);
                int var152 = var151 + 17;
                arg2.method7935(class383.field4475, var77, var152, 16777215, 0);
                int var79 = Statics.field86 - 80;
                short var80 = 311;
                Statics.field288.method9720(var79 - 73, var80 - 20);
                arg0.method7935(class383.field4478, var79, var80 + 5, 16777215, 0);
                int var81 = Statics.field86 + 80;
                Statics.field288.method9720(var81 - 73, var80 - 20);
                arg0.method7935(class383.field4479, var81, var80 + 5, 16777215, 0);
            } else if (field937 == 13) {
                short var82 = 231;
                arg2.method7935(class383.field4476, field932 + 180, var82, 16777215, 0);
                int var153 = var82 + 20;
                arg2.method7935(class383.field4477, field932 + 180, var153, 16777215, 0);
                int var83 = field932 + 180;
                short var84 = 311;
                Statics.field288.method9720(var83 - 73, var84 - 20);
                arg0.method7935(class383.field4455, var83, var84 + 5, 16777215, 0);
            } else if (field937 == 14) {
                short var85 = 201;
                String var86 = "";
                String var87 = "";
                String var88 = "";
                switch(field927) {
                    case 0:
                        var86 = class383.field4401;
                        var87 = class383.field4340;
                        var88 = class383.field4236;
                        break;
                    case 1:
                        var86 = class383.field4273;
                        var87 = class383.field4274;
                        var88 = class383.field4251;
                        break;
                    case 2:
                        var86 = class383.field4309;
                        var87 = class383.field4310;
                        var88 = class383.field4255;
                        break;
                    default:
                        method8936(false);
                }
                arg0.method7935(var86, field932 + 180, var85, 16776960, 0);
                int var154 = var85 + 20;
                arg0.method7935(var87, field932 + 180, var154, 16776960, 0);
                int var155 = var154 + 20;
                arg0.method7935(var88, field932 + 180, var155, 16776960, 0);
                int var89 = field932 + 180;
                short var90 = 276;
                Statics.field288.method9720(var89 - 73, var90 - 20);
                if (field927 == 1) {
                    arg0.method7935(class383.field4443, var89, var90 + 5, 16777215, 0);
                } else {
                    arg0.method7935(class383.field4473, var89, var90 + 5, 16777215, 0);
                }
                int var91 = field932 + 180;
                short var92 = 326;
                Statics.field288.method9720(var91 - 73, var92 - 20);
                arg0.method7935(class383.field4455, var91, var92 + 5, 16777215, 0);
            } else if (field937 == 24) {
                short var93 = 221;
                arg0.method7935(field942, field932 + 180, var93, 16777215, 0);
                int var156 = var93 + 15;
                arg0.method7935(field928, field932 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                arg0.method7935(field941, field932 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                int var94 = field932 + 180;
                short var95 = 301;
                Statics.field288.method9720(var94 - 73, var95 - 20);
                arg0.method7935(class383.field4184, var94, var95 + 5, 16777215, 0);
            } else if (field937 == 32) {
                short var96 = 216;
                arg0.method7935(class383.field4465, field932 + 180, var96, 16776960, 0);
                int var159 = var96 + 15;
                arg2.method7935(class383.field4466, field932 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg2.method7935(class383.field4467, field932 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var97 = field932 + 180 - 80;
                short var98 = 321;
                Statics.field288.method9720(var97 - 73, var98 - 20);
                arg0.method7935(class383.field4399, var97, var98 + 5, 16777215, 0);
                int var99 = field932 + 180 + 80;
                Statics.field288.method9720(var99 - 73, var98 - 20);
                arg0.method7935(class383.field4455, var99, var98 + 5, 16777215, 0);
            } else if (field937 == 33) {
                short var100 = 201;
                arg0.method7935(field942, field932 + 180, var100, 16776960, 0);
                int var162 = var100 + 20;
                arg1.method7935(field928, field932 + 180, var162, 16776960, 0);
                int var163 = var162 + 20;
                arg1.method7935(field941, field932 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                int var101 = field932 + 180;
                short var102 = 276;
                Statics.field288.method9720(var101 - 73, var102 - 20);
                arg2.method7935(class383.field4234, var101, var102 + 5, 16777215, 0);
                int var103 = field932 + 180;
                short var104 = 326;
                Statics.field288.method9720(var103 - 73, var104 - 20);
                arg2.method7935(class383.field4455, var103, var104 + 5, 16777215, 0);
            }
        }
        if (client.field551 >= 10) {
            int[] var105 = new int[4];
            class568.method9665(var105);
            class568.method9608(field933, 0, field933 + 765, Statics.field2983);
            Statics.field4930.method2672(field933 - 22, client.field518);
            Statics.field4930.method2672(field933 + 765 + 22 - 128, client.field518);
            class568.method9611(var105);
        }
        Statics.field5397[Statics.field2378.method2790() ? 1 : 0].method9720(field933 + 765 - 40, 463);
        if (client.field551 <= 5 || Statics.field3268 != class407.field4696) {
            return;
        }
        if (Statics.field1898 == null) {
            Statics.field1898 = class573.method2923(Statics.field4893, "sl_button", "");
            return;
        }
        int var106 = field933 + 5;
        short var107 = 463;
        byte var108 = 100;
        byte var109 = 35;
        Statics.field1898.method9720(var106, var107);
        arg0.method7935(class383.field4354 + " " + client.field502, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
        if (Statics.field4999 == null) {
            arg1.method7935(class383.field4490, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
        } else {
            arg1.method7935(class383.field4178, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("fa.ad(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3224(String arg0, String arg1, String arg2) {
        field942 = arg0;
        field928 = arg1;
        field941 = arg2;
    }

    @ObfuscatedName("hw.ac(Lqi;Lqi;B)V")
    public static void method3945(class436 arg0, class436 arg1) {
        if (Statics.field5030 == null) {
            Statics.field5030 = class573.method3072(Statics.field4893, "sl_back", "");
        }
        if (Statics.field964 == null) {
            Statics.field964 = class573.method6944(Statics.field4893, "sl_flags", "");
        }
        if (Statics.field1800 == null) {
            Statics.field1800 = class573.method6944(Statics.field4893, "sl_arrows", "");
        }
        if (Statics.field464 == null) {
            Statics.field464 = class573.method6944(Statics.field4893, "sl_stars", "");
        }
        if (Statics.field5177 == null) {
            Statics.field5177 = class573.method2923(Statics.field4893, "leftarrow", "");
        }
        if (Statics.field5091 == null) {
            Statics.field5091 = class573.method2923(Statics.field4893, "rightarrow", "");
        }
        class568.method9616(field933, 23, 765, 480, 0);
        class568.method9617(field933, 0, 125, 23, 12425273, 9135624);
        class568.method9617(field933 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method7935(class383.field4480, field933 + 62, 15, 0, -1);
        if (Statics.field464 != null) {
            Statics.field464[1].method9720(field933 + 140, 1);
            arg1.method7932(class383.field4481, field933 + 152, 10, 16777215, -1);
            Statics.field464[0].method9720(field933 + 140, 12);
            arg1.method7932(class383.field4482, field933 + 152, 21, 16777215, -1);
        }
        if (Statics.field1800 != null) {
            int var2 = field933 + 280;
            if (class70.field814[0] == 0 && class70.field806[0] == 0) {
                Statics.field1800[2].method9720(var2, 4);
            } else {
                Statics.field1800[0].method9720(var2, 4);
            }
            if (class70.field814[0] == 0 && class70.field806[0] == 1) {
                Statics.field1800[3].method9720(var2 + 15, 4);
            } else {
                Statics.field1800[1].method9720(var2 + 15, 4);
            }
            arg0.method7932(class383.field4342, var2 + 32, 17, 16777215, -1);
            int var3 = field933 + 390;
            if (class70.field814[0] == 1 && class70.field806[0] == 0) {
                Statics.field1800[2].method9720(var3, 4);
            } else {
                Statics.field1800[0].method9720(var3, 4);
            }
            if (class70.field814[0] == 1 && class70.field806[0] == 1) {
                Statics.field1800[3].method9720(var3 + 15, 4);
            } else {
                Statics.field1800[1].method9720(var3 + 15, 4);
            }
            arg0.method7932(class383.field4484, var3 + 32, 17, 16777215, -1);
            int var4 = field933 + 500;
            if (class70.field814[0] == 2 && class70.field806[0] == 0) {
                Statics.field1800[2].method9720(var4, 4);
            } else {
                Statics.field1800[0].method9720(var4, 4);
            }
            if (class70.field814[0] == 2 && class70.field806[0] == 1) {
                Statics.field1800[3].method9720(var4 + 15, 4);
            } else {
                Statics.field1800[1].method9720(var4 + 15, 4);
            }
            arg0.method7932(class383.field4461, var4 + 32, 17, 16777215, -1);
            int var5 = field933 + 610;
            if (class70.field814[0] == 3 && class70.field806[0] == 0) {
                Statics.field1800[2].method9720(var5, 4);
            } else {
                Statics.field1800[0].method9720(var5, 4);
            }
            if (class70.field814[0] == 3 && class70.field806[0] == 1) {
                Statics.field1800[3].method9720(var5 + 15, 4);
            } else {
                Statics.field1800[1].method9720(var5 + 15, 4);
            }
            arg0.method7932(class383.field4292, var5 + 32, 17, 16777215, -1);
        }
        class568.method9616(field933 + 708, 4, 50, 16, 0);
        arg1.method7935(class383.field4426, field933 + 708 + 25, 16, 16777215, -1);
        field954 = -1;
        if (Statics.field5030 == null) {
            return;
        }
        byte var6 = 88;
        byte var7 = 19;
        int var8 = 765 / (var6 + 1) - 1;
        int var9 = 480 / (var7 + 1);
        int var10;
        int var11;
        do {
            var10 = var9;
            var11 = var8;
            if ((var8 - 1) * var9 >= class70.field811) {
                var8--;
            }
            if ((var9 - 1) * var8 >= class70.field811) {
                var9--;
            }
            if ((var9 - 1) * var8 >= class70.field811) {
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
        int var16 = (class70.field811 + var9 - 1) / var9;
        field956 = var16 - var8;
        if (Statics.field5177 != null && field955 > 0) {
            Statics.field5177.method9720(8, Statics.field2983 / 2 - Statics.field5177.field5551 / 2);
        }
        if (Statics.field5091 != null && field955 < field956) {
            Statics.field5091.method9720(Statics.field74 - Statics.field5091.field5549 - 8, Statics.field2983 / 2 - Statics.field5091.field5551 / 2);
        }
        int var17 = var15 + 23;
        int var18 = field933 + var14;
        int var19 = 0;
        boolean var20 = false;
        int var21 = field955;
        for (int var22 = var9 * var21; var22 < class70.field811 && var21 - field955 < var8; var22++) {
            class70 var23 = Statics.field810[var22];
            boolean var24 = true;
            String var25 = Integer.toString(var23.field817);
            if (var23.field817 == -1) {
                var25 = class383.field4487;
                var24 = false;
            } else if (var23.field817 > 1980) {
                var25 = class383.field4488;
                var24 = false;
            }
            class114 var26 = null;
            int var27 = 0;
            if (var23.method1882()) {
                var26 = var23.method1917() ? class114.field1436 : class114.field1452;
            } else if (var23.method1877()) {
                var26 = var23.method1917() ? class114.field1451 : class114.field1450;
            } else if (var23.method1881()) {
                var27 = 16711680;
                var26 = var23.method1917() ? class114.field1453 : class114.field1445;
            } else if (var23.method1883()) {
                var26 = var23.method1917() ? class114.field1438 : class114.field1444;
            } else if (var23.method1879()) {
                var26 = var23.method1917() ? class114.field1439 : class114.field1443;
            } else if (var23.method1884()) {
                var26 = var23.method1917() ? class114.field1447 : class114.field1446;
            } else if (var23.method1901()) {
                var26 = var23.method1917() ? class114.field1449 : class114.field1448;
            }
            if (var26 == null || var26.field1441 >= Statics.field5030.length) {
                var26 = var23.method1917() ? class114.field1440 : class114.field1442;
            }
            if (class36.field195 >= var18 && class36.field198 >= var17 && class36.field195 < var6 + var18 && class36.field198 < var7 + var17 && var24) {
                field954 = var22;
                Statics.field5030[var26.field1441].method9746(var18, var17, 128, 16777215);
                var20 = true;
            } else {
                Statics.field5030[var26.field1441].method9740(var18, var17);
            }
            if (Statics.field964 != null) {
                Statics.field964[(var23.method1917() ? 8 : 0) + var23.field820].method9720(var18 + 29, var17);
            }
            arg0.method7935(Integer.toString(var23.field813), var18 + 15, var7 / 2 + var17 + 5, var27, -1);
            arg1.method7935(var25, var18 + 60, var7 / 2 + var17 + 5, 268435455, -1);
            var17 += var7 + var13;
            var19++;
            if (var19 >= var9) {
                var17 = var15 + 23;
                var18 += var6 + var12;
                var19 = 0;
                var21++;
            }
        }
        if (!var20) {
            return;
        }
        int var28 = arg1.method7933(Statics.field810[field954].field815) + 6;
        int var29 = arg1.field4851 + 8;
        int var30 = class36.field198 + 25;
        if (var29 + var30 > 480) {
            var30 = class36.field198 - 25 - var29;
        }
        class568.method9616(class36.field195 - var28 / 2, var30, var28, var29, 16777120);
        class568.method9620(class36.field195 - var28 / 2, var30, var28, var29, 0);
        arg1.method7935(Statics.field810[field954].field815, class36.field195, arg1.field4851 + var30 + 4, 0, -1);
    }

    @ObfuscatedName("hb.av(Lbz;I)V")
    public static void method3890(class35 arg0) {
        class270 var1 = client.field734;
        class270 var2 = var1;
        while (var2.method5242()) {
            if (var2.field2989 == 13) {
                field953 = false;
                class568.method9616(0, 0, Statics.field5532, Statics.field5531, 0);
                Statics.field5625.method9740(field933, 0);
                Statics.field5390.method9740(field933 + 382, 0);
                Statics.field5029.method9720(field933 + 382 - Statics.field5029.field5549 / 2, 18);
                return;
            }
            if (var2.field2989 == 96) {
                if (field955 > 0 && Statics.field5177 != null) {
                    field955--;
                }
            } else if (var2.field2989 == 97 && field955 < field956 && Statics.field5091 != null) {
                field955++;
            }
        }
        if (class36.field197 != 1 && Statics.field1704 || class36.field197 != 4) {
            return;
        }
        int var3 = field933 + 280;
        if (class36.field213 >= var3 && class36.field213 <= var3 + 14 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(0, 0);
            return;
        }
        if (class36.field213 >= var3 + 15 && class36.field213 <= var3 + 80 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(0, 1);
            return;
        }
        int var4 = field933 + 390;
        if (class36.field213 >= var4 && class36.field213 <= var4 + 14 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(1, 0);
            return;
        }
        if (class36.field213 >= var4 + 15 && class36.field213 <= var4 + 80 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(1, 1);
            return;
        }
        int var5 = field933 + 500;
        if (class36.field213 >= var5 && class36.field213 <= var5 + 14 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(2, 0);
            return;
        }
        if (class36.field213 >= var5 + 15 && class36.field213 <= var5 + 80 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(2, 1);
            return;
        }
        int var6 = field933 + 610;
        if (class36.field213 >= var6 && class36.field213 <= var6 + 14 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(3, 0);
            return;
        }
        if (class36.field213 >= var6 + 15 && class36.field213 <= var6 + 80 && class36.field214 >= 4 && class36.field214 <= 18) {
            class70.method3526(3, 1);
            return;
        }
        if (class36.field213 >= field933 + 708 && class36.field214 >= 4 && class36.field213 <= field933 + 708 + 50 && class36.field214 <= 20) {
            field953 = false;
            class568.method9616(0, 0, Statics.field5532, Statics.field5531, 0);
            Statics.field5625.method9740(field933, 0);
            Statics.field5390.method9740(field933 + 382, 0);
            Statics.field5029.method9720(field933 + 382 - Statics.field5029.field5549 / 2, 18);
            return;
        }
        if (field954 != -1) {
            class70 var7 = Statics.field810[field954];
            int var8 = client.field503;
            class553 var9 = class553.field5431;
            boolean var10 = (var8 & var9.method37()) != 0;
            boolean var12 = var7.method1877();
            Statics.field720 = var12;
            var7.field822 = var12 ? "beta" : var7.field822;
            Statics.method6905(var7);
            field953 = false;
            class568.method9616(0, 0, Statics.field5532, Statics.field5531, 0);
            Statics.field5625.method9740(field933, 0);
            Statics.field5390.method9740(field933 + 382, 0);
            Statics.field5029.method9720(field933 + 382 - Statics.field5029.field5549 / 2, 18);
            if (var10 != var12) {
                client.method810();
            }
            return;
        }
        if (field955 > 0 && Statics.field5177 != null && class36.field213 >= 0 && class36.field213 <= Statics.field5177.field5549 && class36.field214 >= Statics.field2983 / 2 - 50 && class36.field214 <= Statics.field2983 / 2 + 50) {
            field955--;
        }
        if (field955 < field956 && Statics.field5091 != null && class36.field213 >= Statics.field74 - Statics.field5091.field5549 - 5 && class36.field213 <= Statics.field74 && class36.field214 >= Statics.field2983 / 2 - 50 && class36.field214 <= Statics.field2983 / 2 + 50) {
            field955++;
        }
    }

    @ObfuscatedName("cm.aq(II)V")
    public static void method2117(int arg0) {
        method42(14);
        field927 = arg0;
    }

    @ObfuscatedName("br.al(I)V")
    public static void method695() {
        method42(24);
        method3224(class383.field4413, class383.field4414, class383.field4415);
    }

    @ObfuscatedName("as.aa(IB)V")
    public static void method42(int arg0) {
        if (field937 != arg0) {
            field937 = arg0;
        }
    }

    @ObfuscatedName("gv.bh(Ljava/lang/String;B)V")
    public static void method3527(String arg0) {
        field946 = class536.method8148(arg0);
    }

    @ObfuscatedName("kv.bj(ILjava/lang/String;I)V")
    public static void method5453(int arg0, String arg1) {
        field934 = arg1;
        field935 = arg0;
    }
}
