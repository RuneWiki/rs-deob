package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("cg")
public class class84 {

    @ObfuscatedName("cg.u")
    public static int field996 = 0;

    @ObfuscatedName("cg.x")
    public static int field991 = field996 + 202;

    @ObfuscatedName("cg.i")
    public static int field1023 = 10;

    @ObfuscatedName("cg.a")
    public static String field993 = "";

    @ObfuscatedName("cg.ag")
    public static int field994 = -1;

    @ObfuscatedName("cg.aj")
    public static int field995 = 1;

    @ObfuscatedName("cg.as")
    public static int field986 = 0;

    @ObfuscatedName("cg.ad")
    public static String field997 = "";

    @ObfuscatedName("cg.af")
    public static String field1011 = "";

    @ObfuscatedName("cg.ao")
    public static String field999 = "";

    @ObfuscatedName("cg.ai")
    public static String field1000 = "";

    @ObfuscatedName("cg.av")
    public static String field1001 = "";

    @ObfuscatedName("cg.az")
    public static String field1016 = "";

    @ObfuscatedName("cg.an")
    public static boolean field1004 = false;

    @ObfuscatedName("cg.ah")
    public static boolean field1013 = false;

    @ObfuscatedName("cg.br")
    public static boolean field1006 = true;

    @ObfuscatedName("cg.bn")
    public static int field998 = 0;

    @ObfuscatedName("cg.bi")
    public static String field1008 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cg.bb")
    public static String field1009 = "1234567890";

    @ObfuscatedName("cg.bt")
    public static boolean field987 = false;

    @ObfuscatedName("cg.bq")
    public static int field1012 = -1;

    @ObfuscatedName("cg.bf")
    public static int field1018 = 0;

    @ObfuscatedName("cg.bc")
    public static int field1014 = 0;

    @ObfuscatedName("cg.bd")
    public static long field992;

    @ObfuscatedName("cg.bg")
    public static long field1017;

    static {
        new DecimalFormat("##0.00");
        new class125();
        field992 = -1L;
        field1017 = -1L;
    }

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hb.f(I)I")
    public static int method3832() {
        return 12;
    }

    @ObfuscatedName("bx.o(Lir;Lir;ZIS)V")
    public static void method1537(class253 arg0, class253 arg1, boolean arg2, int arg3) {
        if (!Statics.field45) {
            field986 = arg3;
            class391.method6179();
            byte[] var4 = arg0.method3953("title.jpg", "");
            Statics.field882 = class44.method3839(var4);
            Statics.field3242 = Statics.field882.method6228();
            int var5 = client.field601;
            if ((var5 & 0x20000000) != 0) {
                Statics.field1464 = class396.method2753(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field1464 = class396.method2753(arg1, "logo", "");
            } else {
                Statics.field1464 = class396.method2753(arg1, "logo_seasonal_mode", "");
            }
            Statics.field1344 = class396.method2753(arg1, "titlebox", "");
            Statics.field950 = class396.method2753(arg1, "titlebutton", "");
            Statics.field1002 = class396.method1998(arg1, "runes", "");
            Statics.field4134 = class396.method1998(arg1, "title_mute", "");
            Statics.field1348 = class396.method2753(arg1, "options_radio_buttons,0", "");
            Statics.field1401 = class396.method2753(arg1, "options_radio_buttons,4", "");
            Statics.field1930 = class396.method2753(arg1, "options_radio_buttons,2", "");
            Statics.field3430 = class396.method2753(arg1, "options_radio_buttons,6", "");
            Statics.field2778 = Statics.field1348.field4236;
            Statics.field233 = Statics.field1348.field4239;
            Statics.field989 = new class102(Statics.field1002);
            if (arg2) {
                field1001 = "";
                field1016 = "";
            }
            Statics.field1561 = 0;
            Statics.field3917 = "";
            field1006 = true;
            field987 = false;
            if (Statics.field988.field1301) {
                class211.method2082(2);
            } else {
                class211.method2723(2, Statics.field62, "scape main", "", 255, false);
            }
            class254.method3871(false);
            Statics.field45 = true;
            field996 = (Statics.field1143 - 765) / 2;
            field991 = field996 + 202;
            Statics.field964 = field991 + 180;
            Statics.field882.method6237(field996, 0);
            Statics.field3242.method6237(field996 + 382, 0);
            Statics.field1464.method6207(field996 + 382 - Statics.field1464.field4236 / 2, 18);
        } else if (arg3 == 4) {
            field986 = 4;
        }
    }

    @ObfuscatedName("d.u(ZZI)Low;")
    public static class394 method155(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3430 : Statics.field1930) : (arg1 ? Statics.field1401 : Statics.field1348);
    }

    @ObfuscatedName("dq.p(I)Ljava/lang/String;")
    public static String method1997() {
        String var6;
        if (Statics.field988.field1298) {
            String var0 = field1001;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1001;
        }
        return var6;
    }

    @ObfuscatedName("ai.b(I)V")
    public static void method305() {
        if (client.field638 && field1001 != null && field1001.length() > 0) {
            field998 = 1;
        } else {
            field998 = 0;
        }
    }

    @ObfuscatedName("dh.e(Lal;B)V")
    public static void method2150(class47 arg0) {
        if (field987) {
            method3723(arg0);
            return;
        }
        if ((class48.field355 == 1 || !Statics.field360 && class48.field355 == 4) && class48.field343 >= field996 + 765 - 50 && class48.field348 >= 453) {
            Statics.field988.field1301 = !Statics.field988.field1301;
            class103.method964();
            if (Statics.field988.field1301) {
                Statics.field2486.method3453();
                class211.field2483 = 1;
                Statics.field2484 = null;
            } else {
                class251 var1 = Statics.field62;
                int var2 = var1.method3950("scape main");
                int var3 = var1.method3951(var2, "");
                class211.method3417(var1, var2, var3, 255, false);
            }
        }
        if (client.field755 == 5) {
            return;
        }
        if (field992 == -1L) {
            field992 = class379.method1540() + 1000L;
        }
        long var4 = class379.method1540();
        if (client.method54() && field1017 == -1L) {
            field1017 = var4;
            if (field1017 > field992) {
                field992 = field1017;
            }
        }
        if (client.field755 != 10 && client.field755 != 11) {
            return;
        }
        if (Statics.field242 == class268.field3357) {
            if (class48.field355 == 1 || !Statics.field360 && class48.field355 == 4) {
                int var6 = field996 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class48.field343 >= var6 && class48.field343 <= var6 + var8 && class48.field348 >= var7 && class48.field348 <= var7 + var9) {
                    method169();
                    return;
                }
            }
            if (Statics.field893 != null) {
                method169();
            }
        }
        int var10 = class48.field355;
        int var11 = class48.field343;
        int var12 = class48.field348;
        if (var10 == 0) {
            var11 = class48.field342;
            var12 = class48.field357;
        }
        if (!Statics.field360 && var10 == 4) {
            var10 = 1;
        }
        if (field986 == 0) {
            boolean var13 = false;
            while (class39.method3835()) {
                if (Statics.field147 == 84) {
                    var13 = true;
                }
            }
            int var14 = Statics.field964 - 80;
            short var15 = 291;
            if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                class45.method4915(client.method5608("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var16 = Statics.field964 + 80;
            if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                if ((client.field601 & 0x2000000) != 0) {
                    field997 = "";
                    field1011 = class246.field3077;
                    field999 = class246.field3122;
                    field1000 = class246.field3142;
                    field986 = 1;
                    method305();
                } else if ((client.field601 & 0x4) != 0) {
                    if ((client.field601 & 0x400) == 0) {
                        field1011 = class246.field3131;
                        field999 = class246.field3132;
                        field1000 = class246.field3133;
                    } else {
                        field1011 = class246.field3137;
                        field999 = class246.field3138;
                        field1000 = class246.field3070;
                    }
                    field997 = class246.field3130;
                    field986 = 1;
                    method305();
                } else if ((client.field601 & 0x400) == 0) {
                    method202(false);
                } else {
                    field1011 = class246.field3134;
                    field999 = class246.field3197;
                    field1000 = class246.field3136;
                    field997 = class246.field3130;
                    field986 = 1;
                    method305();
                }
            }
        } else if (field986 == 1) {
            while (true) {
                if (!class39.method3835()) {
                    int var17 = Statics.field964 - 80;
                    short var18 = 321;
                    if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                        method202(false);
                    }
                    int var19 = Statics.field964 + 80;
                    if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                        field986 = 0;
                    }
                    break;
                }
                if (Statics.field147 == 84) {
                    method202(false);
                } else if (Statics.field147 == 13) {
                    field986 = 0;
                }
            }
        } else if (field986 == 2) {
            short var20 = 201;
            int var72 = var20 + 52;
            if (var10 == 1 && var12 >= var72 - 12 && var12 < var72 + 2) {
                field998 = 0;
            }
            var72 += 15;
            if (var10 == 1 && var12 >= var72 - 12 && var12 < var72 + 2) {
                field998 = 1;
            }
            var72 += 15;
            short var21 = 361;
            if (Statics.field1085 != null) {
                int var22 = Statics.field1085.field3911 / 2;
                if (var10 == 1 && var11 >= Statics.field1085.field3916 - var22 && var11 <= Statics.field1085.field3916 + var22 && var12 >= var21 - 15 && var12 < var21) {
                    switch(field995) {
                        case 1:
                            method80(class246.field3174, class246.field3212, class246.field3181);
                            field986 = 5;
                            return;
                        case 2:
                            class45.method4915("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var23 = Statics.field964 - 80;
            short var24 = 321;
            if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                field1001 = field1001.trim();
                if (field1001.length() == 0) {
                    method80(class246.field3032, class246.field3082, class246.field3068);
                    return;
                }
                if (field1016.length() == 0) {
                    method80(class246.field3035, class246.field3036, class246.field3037);
                    return;
                }
                method80(class246.field3145, class246.field2989, class246.field3200);
                client.method5199(false);
                client.method184(20);
                return;
            }
            int var25 = field991 + 180 + 80;
            if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                field986 = 0;
                field1001 = "";
                field1016 = "";
                Statics.field1561 = 0;
                Statics.field3917 = "";
                field1006 = true;
            }
            int var26 = Statics.field964 + -117;
            short var27 = 277;
            field1004 = var11 >= var26 && var11 < Statics.field2778 + var26 && var12 >= var27 && var12 < Statics.field233 + var27;
            if (var10 == 1 && field1004) {
                client.field638 = !client.field638;
                if (!client.field638 && Statics.field988.field1300 != null) {
                    Statics.field988.field1300 = null;
                    class103.method964();
                }
            }
            int var28 = Statics.field964 + 24;
            short var29 = 277;
            field1013 = var11 >= var28 && var11 < Statics.field2778 + var28 && var12 >= var29 && var12 < Statics.field233 + var29;
            if (var10 == 1 && field1013) {
                Statics.field988.field1298 = !Statics.field988.field1298;
                if (!Statics.field988.field1298) {
                    field1001 = "";
                    Statics.field988.field1300 = null;
                    method305();
                }
                class103.method964();
            }
            while (true) {
                Transferable var33;
                int var34;
                do {
                    while (true) {
                        label685: do {
                            while (true) {
                                while (class39.method3835()) {
                                    if (Statics.field147 == 13) {
                                        field986 = 0;
                                        field1001 = "";
                                        field1016 = "";
                                        Statics.field1561 = 0;
                                        Statics.field3917 = "";
                                        field1006 = true;
                                    } else {
                                        if (field998 != 0) {
                                            continue label685;
                                        }
                                        char var30 = Statics.field592;
                                        for (int var31 = 0; var31 < field1008.length() && var30 != field1008.charAt(var31); var31++) {
                                        }
                                        if (Statics.field147 == 85 && field1001.length() > 0) {
                                            field1001 = field1001.substring(0, field1001.length() - 1);
                                        }
                                        if (Statics.field147 == 84 || Statics.field147 == 80) {
                                            field998 = 1;
                                        }
                                        if (method57(Statics.field592) && field1001.length() < 320) {
                                            field1001 = field1001 + Statics.field592;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field998 != 1);
                        if (Statics.field147 == 85 && field1016.length() > 0) {
                            field1016 = field1016.substring(0, field1016.length() - 1);
                        } else if (Statics.field147 == 84 || Statics.field147 == 80) {
                            field998 = 0;
                            if (Statics.field147 == 84) {
                                field1001 = field1001.trim();
                                if (field1001.length() == 0) {
                                    method80(class246.field3032, class246.field3082, class246.field3068);
                                    return;
                                }
                                if (field1016.length() == 0) {
                                    method80(class246.field3035, class246.field3036, class246.field3037);
                                    return;
                                }
                                method80(class246.field3145, class246.field2989, class246.field3200);
                                client.method5199(false);
                                client.method184(20);
                                return;
                            }
                        }
                        if ((class39.field247[82] || class39.field247[87]) && Statics.field147 == 67) {
                            Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var33 = var32.getContents(Statics.field75);
                            var34 = 20 - field1016.length();
                            break;
                        }
                        if (class301.method2001(Statics.field592) && method57(Statics.field592) && field1016.length() < 20) {
                            field1016 = field1016 + Statics.field592;
                        }
                    }
                } while (var34 <= 0);
                try {
                    String var35 = (String) var33.getTransferData(DataFlavor.stringFlavor);
                    int var36 = Math.min(var34, var35.length());
                    for (int var37 = 0; var37 < var36; var37++) {
                        if (!class301.method2001(var35.charAt(var37)) || !method57(var35.charAt(var37))) {
                            field986 = 3;
                            return;
                        }
                    }
                    field1016 = field1016 + var35.substring(0, var36);
                } catch (UnsupportedFlavorException var70) {
                } catch (IOException var71) {
                }
            }
        } else if (field986 == 3) {
            int var40 = field991 + 180;
            short var41 = 276;
            if (var10 == 1 && var11 >= var40 - 75 && var11 <= var40 + 75 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                method202(false);
            }
            int var42 = field991 + 180;
            short var43 = 326;
            if (var10 == 1 && var11 >= var42 - 75 && var11 <= var42 + 75 && var12 >= var43 - 20 && var12 <= var43 + 20) {
                method80(class246.field3174, class246.field3212, class246.field3181);
                field986 = 5;
                return;
            }
        } else if (field986 == 4) {
            int var44 = field991 + 180 - 80;
            short var45 = 321;
            if (var10 == 1 && var11 >= var44 - 75 && var11 <= var44 + 75 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                Statics.field3917.trim();
                if (Statics.field3917.length() != 6) {
                    method80(class246.field2951, class246.field2952, class246.field3113);
                    return;
                }
                Statics.field1561 = Integer.parseInt(Statics.field3917);
                Statics.field3917 = "";
                client.method5199(true);
                method80(class246.field3145, class246.field2989, class246.field3200);
                client.method184(20);
                return;
            }
            if (var10 == 1 && var11 >= field991 + 180 - 9 && var11 <= field991 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field1006 = !field1006;
            }
            if (var10 == 1 && var11 >= field991 + 180 - 34 && var11 <= field991 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                class45.method4915(client.method5608("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var46 = field991 + 180 + 80;
            if (var10 == 1 && var11 >= var46 - 75 && var11 <= var46 + 75 && var12 >= var45 - 20 && var12 <= var45 + 20) {
                field986 = 0;
                field1001 = "";
                field1016 = "";
                Statics.field1561 = 0;
                Statics.field3917 = "";
            }
            while (class39.method3835()) {
                boolean var47 = false;
                for (int var48 = 0; var48 < field1009.length(); var48++) {
                    if (Statics.field592 == field1009.charAt(var48)) {
                        var47 = true;
                        break;
                    }
                }
                if (Statics.field147 == 13) {
                    field986 = 0;
                    field1001 = "";
                    field1016 = "";
                    Statics.field1561 = 0;
                    Statics.field3917 = "";
                } else {
                    if (Statics.field147 == 85 && Statics.field3917.length() > 0) {
                        Statics.field3917 = Statics.field3917.substring(0, Statics.field3917.length() - 1);
                    }
                    if (Statics.field147 == 84) {
                        Statics.field3917.trim();
                        if (Statics.field3917.length() != 6) {
                            method80(class246.field2951, class246.field2952, class246.field3113);
                            return;
                        }
                        Statics.field1561 = Integer.parseInt(Statics.field3917);
                        Statics.field3917 = "";
                        client.method5199(true);
                        method80(class246.field3145, class246.field2989, class246.field3200);
                        client.method184(20);
                        return;
                    }
                    if (var47 && Statics.field3917.length() < 6) {
                        Statics.field3917 = Statics.field3917 + Statics.field592;
                    }
                }
            }
        } else if (field986 == 5) {
            int var49 = field991 + 180 - 80;
            short var50 = 321;
            if (var10 == 1 && var11 >= var49 - 75 && var11 <= var49 + 75 && var12 >= var50 - 20 && var12 <= var50 + 20) {
                method168();
                return;
            }
            int var51 = field991 + 180 + 80;
            if (var10 == 1 && var11 >= var51 - 75 && var11 <= var51 + 75 && var12 >= var50 - 20 && var12 <= var50 + 20) {
                method202(true);
            }
            short var52 = 361;
            if (Statics.field3379 != null) {
                int var53 = Statics.field3379.field3911 / 2;
                if (var10 == 1 && var11 >= Statics.field3379.field3916 - var53 && var11 <= Statics.field3379.field3916 + var53 && var12 >= var52 - 15 && var12 < var52) {
                    class45.method4915(client.method5608("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class39.method3835()) {
                boolean var54 = false;
                for (int var55 = 0; var55 < field1008.length(); var55++) {
                    if (Statics.field592 == field1008.charAt(var55)) {
                        var54 = true;
                        break;
                    }
                }
                if (Statics.field147 == 13) {
                    method202(true);
                } else {
                    if (Statics.field147 == 85 && field1001.length() > 0) {
                        field1001 = field1001.substring(0, field1001.length() - 1);
                    }
                    if (Statics.field147 == 84) {
                        method168();
                        return;
                    }
                    if (var54 && field1001.length() < 320) {
                        field1001 = field1001 + Statics.field592;
                    }
                }
            }
        } else if (field986 == 6) {
            while (true) {
                do {
                    if (!class39.method3835()) {
                        short var56 = 321;
                        if (var10 == 1 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                            method202(true);
                        }
                        return;
                    }
                } while (Statics.field147 != 84 && Statics.field147 != 13);
                method202(true);
            }
        } else if (field986 == 7) {
            int var57 = field991 + 180 - 80;
            short var58 = 321;
            if (var10 == 1 && var11 >= var57 - 75 && var11 <= var57 + 75 && var12 >= var58 - 20 && var12 <= var58 + 20) {
                class45.method4915(client.method5608("secure", true) + "m=dob/set_dob.ws", true, false);
                method80(class246.field3176, class246.field3177, class246.field3178);
                field986 = 6;
                return;
            }
            int var59 = field991 + 180 + 80;
            if (var10 == 1 && var11 >= var59 - 75 && var11 <= var59 + 75 && var12 >= var58 - 20 && var12 <= var58 + 20) {
                method202(true);
            }
        } else if (field986 == 8) {
            int var60 = field991 + 180 - 80;
            short var61 = 321;
            if (var10 == 1 && var11 >= var60 - 75 && var11 <= var60 + 75 && var12 >= var61 - 20 && var12 <= var61 + 20) {
                class45.method4915("https://www.jagex.com/terms/privacy", true, false);
                method80(class246.field3176, class246.field3177, class246.field3178);
                field986 = 6;
                return;
            }
            int var62 = field991 + 180 + 80;
            if (var10 == 1 && var11 >= var62 - 75 && var11 <= var62 + 75 && var12 >= var61 - 20 && var12 <= var61 + 20) {
                method202(true);
            }
        } else if (field986 == 12) {
            String var63 = "";
            switch(field994) {
                case 0:
                    var63 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var63 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method202(false);
            }
            int var64 = field991 + 180;
            short var65 = 276;
            if (var10 == 1 && var11 >= var64 - 75 && var11 <= var64 + 75 && var12 >= var65 - 20 && var12 <= var65 + 20) {
                class45.method4915(var63, true, false);
                method80(class246.field3176, class246.field3177, class246.field3178);
                field986 = 6;
                return;
            }
            int var66 = field991 + 180;
            short var67 = 326;
            if (var10 == 1 && var11 >= var66 - 75 && var11 <= var66 + 75 && var12 >= var67 - 20 && var12 <= var67 + 20) {
                method202(false);
            }
        } else if (field986 == 24) {
            int var68 = field991 + 180;
            short var69 = 301;
            if (var10 == 1 && var11 >= var68 - 75 && var11 <= var68 + 75 && var12 >= var69 - 20 && var12 <= var69 + 20) {
                method202(false);
            }
        }
    }

    @ObfuscatedName("b.k(CI)Z")
    public static boolean method57(char arg0) {
        return field1008.indexOf(arg0) != -1;
    }

    @ObfuscatedName("y.g(ZB)V")
    public static void method202(boolean arg0) {
        field1011 = class246.field3127;
        field999 = class246.field3128;
        field1000 = class246.field3024;
        field986 = 2;
        if (arg0) {
            field1016 = "";
        }
        if (field1001 == null || field1001.length() <= 0) {
            if (Statics.field988.field1300 == null) {
                client.field638 = false;
            } else {
                field1001 = Statics.field988.field1300;
                client.field638 = true;
            }
        }
        method305();
    }

    @ObfuscatedName("v.h(B)V")
    public static void method168() {
        field1001 = field1001.trim();
        if (field1001.length() == 0) {
            method80(class246.field3174, class246.field3212, class246.field3181);
            return;
        }
        long var0 = class81.method1539();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class81.method183(var0, field1001);
        }
        switch(var2) {
            case 2:
                method80(class246.field2962, class246.field2956, class246.field3184);
                field986 = 6;
                break;
            case 3:
                method80(class246.field3185, class246.field3067, class246.field3058);
                break;
            case 4:
                method80(class246.field3210, class246.field3189, class246.field3190);
                break;
            case 5:
                method80(class246.field3191, class246.field3139, class246.field3087);
                break;
            case 6:
                method80(class246.field3214, class246.field3195, class246.field3090);
                break;
            case 7:
                method80(class246.field3002, class246.field3192, class246.field3199);
        }
    }

    @ObfuscatedName("aj.n(Lkq;Lkq;Lkq;I)V")
    public static void method216(class299 arg0, class299 arg1, class299 arg2) {
        field996 = (Statics.field1143 - 765) / 2;
        field991 = field996 + 202;
        Statics.field964 = field991 + 180;
        if (field987) {
            if (Statics.field1871 == null) {
                Statics.field1871 = class396.method2206(Statics.field423, "sl_back", "");
            }
            if (Statics.field3764 == null) {
                Statics.field3764 = class396.method1998(Statics.field423, "sl_flags", "");
            }
            if (Statics.field51 == null) {
                Statics.field51 = class396.method1998(Statics.field423, "sl_arrows", "");
            }
            if (Statics.field116 == null) {
                Statics.field116 = class396.method1998(Statics.field423, "sl_stars", "");
            }
            if (Statics.field902 == null) {
                Statics.field902 = class396.method2753(Statics.field423, "leftarrow", "");
            }
            if (Statics.field949 == null) {
                Statics.field949 = class396.method2753(Statics.field423, "rightarrow", "");
            }
            class391.method6191(field996, 23, 765, 480, 0);
            class391.method6128(field996, 0, 125, 23, 12425273, 9135624);
            class391.method6128(field996 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4788(class246.field3204, field996 + 62, 15, 0, -1);
            if (Statics.field116 != null) {
                Statics.field116[1].method6207(field996 + 140, 1);
                arg1.method4785(class246.field3205, field996 + 152, 10, 16777215, -1);
                Statics.field116[0].method6207(field996 + 140, 12);
                arg1.method4785(class246.field2912, field996 + 152, 21, 16777215, -1);
            }
            if (Statics.field51 != null) {
                int var3 = field996 + 280;
                if (class76.field901[0] == 0 && class76.field895[0] == 0) {
                    Statics.field51[2].method6207(var3, 4);
                } else {
                    Statics.field51[0].method6207(var3, 4);
                }
                if (class76.field901[0] == 0 && class76.field895[0] == 1) {
                    Statics.field51[3].method6207(var3 + 15, 4);
                } else {
                    Statics.field51[1].method6207(var3 + 15, 4);
                }
                arg0.method4785(class246.field3207, var3 + 32, 17, 16777215, -1);
                int var4 = field996 + 390;
                if (class76.field901[0] == 1 && class76.field895[0] == 0) {
                    Statics.field51[2].method6207(var4, 4);
                } else {
                    Statics.field51[0].method6207(var4, 4);
                }
                if (class76.field901[0] == 1 && class76.field895[0] == 1) {
                    Statics.field51[3].method6207(var4 + 15, 4);
                } else {
                    Statics.field51[1].method6207(var4 + 15, 4);
                }
                arg0.method4785(class246.field3208, var4 + 32, 17, 16777215, -1);
                int var5 = field996 + 500;
                if (class76.field901[0] == 2 && class76.field895[0] == 0) {
                    Statics.field51[2].method6207(var5, 4);
                } else {
                    Statics.field51[0].method6207(var5, 4);
                }
                if (class76.field901[0] == 2 && class76.field895[0] == 1) {
                    Statics.field51[3].method6207(var5 + 15, 4);
                } else {
                    Statics.field51[1].method6207(var5 + 15, 4);
                }
                arg0.method4785(class246.field3209, var5 + 32, 17, 16777215, -1);
                int var6 = field996 + 610;
                if (class76.field901[0] == 3 && class76.field895[0] == 0) {
                    Statics.field51[2].method6207(var6, 4);
                } else {
                    Statics.field51[0].method6207(var6, 4);
                }
                if (class76.field901[0] == 3 && class76.field895[0] == 1) {
                    Statics.field51[3].method6207(var6 + 15, 4);
                } else {
                    Statics.field51[1].method6207(var6 + 15, 4);
                }
                arg0.method4785(class246.field3182, var6 + 32, 17, 16777215, -1);
            }
            class391.method6191(field996 + 708, 4, 50, 16, 0);
            arg1.method4788(class246.field2969, field996 + 708 + 25, 16, 16777215, -1);
            field1012 = -1;
            if (Statics.field1871 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class76.field892) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class76.field892) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class76.field892) {
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
                int var17 = (class76.field892 + var10 - 1) / var10;
                field1014 = var17 - var9;
                if (Statics.field902 != null && field1018 > 0) {
                    Statics.field902.method6207(8, Statics.field320 / 2 - Statics.field902.field4239 / 2);
                }
                if (Statics.field949 != null && field1018 < field1014) {
                    Statics.field949.method6207(Statics.field1143 - Statics.field949.field4236 - 8, Statics.field320 / 2 - Statics.field949.field4239 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field996 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field1018;
                for (int var23 = var10 * var22; var23 < class76.field892 && var22 - field1018 < var9; var23++) {
                    class76 var24 = Statics.field69[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field896);
                    if (var24.field896 == -1) {
                        var26 = class246.field3186;
                        var25 = false;
                    } else if (var24.field896 > 1980) {
                        var26 = class246.field2961;
                        var25 = false;
                    }
                    int var27 = 0;
                    byte var28;
                    if (var24.method1417()) {
                        if (var24.method1458()) {
                            var28 = 7;
                        } else {
                            var28 = 6;
                        }
                    } else if (var24.method1416()) {
                        var27 = 16711680;
                        if (var24.method1458()) {
                            var28 = 5;
                        } else {
                            var28 = 4;
                        }
                    } else if (var24.method1418()) {
                        if (var24.method1458()) {
                            var28 = 9;
                        } else {
                            var28 = 8;
                        }
                    } else if (var24.method1423()) {
                        if (var24.method1458()) {
                            var28 = 3;
                        } else {
                            var28 = 2;
                        }
                    } else if (var24.method1458()) {
                        var28 = 1;
                    } else {
                        var28 = 0;
                    }
                    if (class48.field342 >= var19 && class48.field357 >= var18 && class48.field342 < var7 + var19 && class48.field357 < var8 + var18 && var25) {
                        field1012 = var23;
                        Statics.field1871[var28].method6267(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1871[var28].method6237(var19, var18);
                    }
                    if (Statics.field3764 != null) {
                        Statics.field3764[(var24.method1458() ? 8 : 0) + var24.field899].method6207(var19 + 29, var18);
                    }
                    arg0.method4788(Integer.toString(var24.field900), var19 + 15, var8 / 2 + var18 + 5, var27, -1);
                    arg1.method4788(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
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
                    int var29 = arg1.method4781(Statics.field69[field1012].field898) + 6;
                    int var30 = arg1.field3732 + 8;
                    int var31 = class48.field357 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class48.field357 - 25 - var30;
                    }
                    class391.method6191(class48.field342 - var29 / 2, var31, var29, var30, 16777120);
                    class391.method6131(class48.field342 - var29 / 2, var31, var29, var30, 0);
                    arg1.method4788(Statics.field69[field1012].field898, class48.field342, arg1.field3732 + var31 + 4, 0, -1);
                }
            }
            Statics.field330.method355(0, 0);
            return;
        }
        Statics.field882.method6237(field996, 0);
        Statics.field3242.method6237(field996 + 382, 0);
        Statics.field1464.method6207(field996 + 382 - Statics.field1464.field4236 / 2, 18);
        if (client.field755 == 0 || client.field755 == 5) {
            byte var32 = 20;
            arg0.method4788(class246.field3126, field991 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class391.method6131(field991 + 180 - 152, var33, 304, 34, 9179409);
            class391.method6131(field991 + 180 - 151, var33 + 1, 302, 32, 0);
            class391.method6191(field991 + 180 - 150, var33 + 2, field1023 * 3, 30, 9179409);
            class391.method6191(field1023 * 3 + (field991 + 180 - 150), var33 + 2, 300 - field1023 * 3, 30, 0);
            arg0.method4788(field993, field991 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field755 == 20) {
            Statics.field1344.method6207(field991 + 180 - Statics.field1344.field4236 / 2, 271 - Statics.field1344.field4239 / 2);
            short var34 = 201;
            arg0.method4788(field1011, field991 + 180, var34, 16776960, 0);
            int var127 = var34 + 15;
            arg0.method4788(field999, field991 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            arg0.method4788(field1000, field991 + 180, var128, 16776960, 0);
            int var129 = var128 + 15;
            int var130 = var129 + 7;
            if (field986 != 4) {
                arg0.method4785(class246.field3188, field991 + 180 - 110, var130, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method1997(); arg0.method4781(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method4785(class300.method4804(var36), field991 + 180 - 70, var130, 16777215, 0);
                var127 = var130 + 15;
                String var37 = field1016;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                String var43;
                for (var43 = var41; arg0.method4781(var43) > var35; var43 = var43.substring(1)) {
                }
                arg0.method4785(class246.field3155 + var43, field991 + 180 - 108, var127, 16777215, 0);
                var127 += 15;
            }
        }
        if (client.field755 == 10 || client.field755 == 11) {
            Statics.field1344.method6207(field991, 171);
            if (field986 == 0) {
                short var44 = 251;
                arg0.method4788(class246.field3166, field991 + 180, var44, 16776960, 0);
                int var131 = var44 + 30;
                int var45 = field991 + 180 - 80;
                short var46 = 291;
                Statics.field950.method6207(var45 - 73, var46 - 20);
                arg0.method4789(class246.field3065, var45 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var47 = field991 + 180 + 80;
                Statics.field950.method6207(var47 - 73, var46 - 20);
                arg0.method4789(class246.field3159, var47 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field986 == 1) {
                arg0.method4788(field997, field991 + 180, 201, 16776960, 0);
                short var48 = 236;
                arg0.method4788(field1011, field991 + 180, var48, 16777215, 0);
                int var132 = var48 + 15;
                arg0.method4788(field999, field991 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method4788(field1000, field991 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                int var49 = field991 + 180 - 80;
                short var50 = 321;
                Statics.field950.method6207(var49 - 73, var50 - 20);
                arg0.method4788(class246.field2918, var49, var50 + 5, 16777215, 0);
                int var51 = field991 + 180 + 80;
                Statics.field950.method6207(var51 - 73, var50 - 20);
                arg0.method4788(class246.field2969, var51, var50 + 5, 16777215, 0);
            } else if (field986 == 2) {
                short var52 = 201;
                arg0.method4788(field1011, Statics.field964, var52, 16776960, 0);
                int var135 = var52 + 15;
                arg0.method4788(field999, Statics.field964, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method4788(field1000, Statics.field964, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var138 = var137 + 7;
                arg0.method4785(class246.field3188, Statics.field964 - 110, var138, 16777215, 0);
                short var53 = 200;
                String var54;
                for (var54 = method1997(); arg0.method4781(var54) > var53; var54 = var54.substring(1)) {
                }
                arg0.method4785(class300.method4804(var54) + (field998 == 0 & client.field611 % 40 < 20 ? class106.method5281(16776960) + class106.field1322 : ""), Statics.field964 - 70, var138, 16777215, 0);
                var135 = var138 + 15;
                String var55 = field1016;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                String var61;
                for (var61 = var59; arg0.method4781(var61) > var53; var61 = var61.substring(1)) {
                }
                arg0.method4785(class246.field3155 + var61 + (field998 == 1 & client.field611 % 40 < 20 ? class106.method5281(16776960) + class106.field1322 : ""), Statics.field964 - 108, var135, 16777215, 0);
                var135 += 15;
                short var62 = 277;
                int var63 = Statics.field964 + -117;
                class394 var64 = method155(client.field638, field1004);
                var64.method6207(var63, var62);
                int var65 = var64.field4236 + 5 + var63;
                arg1.method4785(class246.field3012, var65, var62 + 13, 16776960, 0);
                int var66 = Statics.field964 + 24;
                class394 var67 = method155(Statics.field988.field1298, field1013);
                var67.method6207(var66, var62);
                int var68 = var67.field4236 + 5 + var66;
                arg1.method4785(class246.field3163, var68, var62 + 13, 16776960, 0);
                int var139 = var62 + 15;
                int var69 = Statics.field964 - 80;
                short var70 = 321;
                Statics.field950.method6207(var69 - 73, var70 - 20);
                arg0.method4788(class246.field3160, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field964 + 80;
                Statics.field950.method6207(var71 - 73, var70 - 20);
                arg0.method4788(class246.field2969, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                switch(field995) {
                    case 2:
                        Statics.field230 = class246.field2936;
                        break;
                    default:
                        Statics.field230 = class246.field3173;
                }
                Statics.field1085 = new class336(Statics.field964, var72, arg1.method4781(Statics.field230), 11);
                Statics.field3379 = new class336(Statics.field964, var72, arg1.method4781(class246.field3057), 11);
                arg1.method4788(Statics.field230, Statics.field964, var72, 16777215, 0);
            } else if (field986 == 3) {
                short var73 = 201;
                arg0.method4788(class246.field2960, field991 + 180, var73, 16776960, 0);
                int var140 = var73 + 20;
                arg1.method4788(class246.field3022, field991 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg1.method4788(class246.field3084, field991 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var74 = field991 + 180;
                short var75 = 276;
                Statics.field950.method6207(var74 - 73, var75 - 20);
                arg2.method4788(class246.field3167, var74, var75 + 5, 16777215, 0);
                int var76 = field991 + 180;
                short var77 = 326;
                Statics.field950.method6207(var76 - 73, var77 - 20);
                arg2.method4788(class246.field3031, var76, var77 + 5, 16777215, 0);
            } else if (field986 == 4) {
                arg0.method4788(class246.field3143, field991 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method4788(field1011, field991 + 180, var78, 16777215, 0);
                int var143 = var78 + 15;
                arg0.method4788(field999, field991 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                arg0.method4788(field1000, field991 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                String var80 = class246.field3156;
                String var81 = Statics.field3917;
                int var82 = var81.length();
                char[] var83 = new char[var82];
                for (int var84 = 0; var84 < var82; var84++) {
                    var83[var84] = '*';
                }
                String var85 = new String(var83);
                arg0.method4785(var80 + var85 + (client.field611 % 40 < 20 ? class106.method5281(16776960) + class106.field1322 : ""), field991 + 180 - 108, var145, 16777215, 0);
                var143 = var145 - 8;
                arg0.method4785(class246.field2921, field991 + 180 - 9, var143, 16776960, 0);
                var143 += 15;
                arg0.method4785(class246.field2922, field991 + 180 - 9, var143, 16776960, 0);
                int var87 = field991 + 180 - 9 + arg0.method4781(class246.field2922) + 15;
                int var88 = var143 - arg0.field3732;
                class394 var89;
                if (field1006) {
                    var89 = Statics.field1930;
                } else {
                    var89 = Statics.field1348;
                }
                var89.method6207(var87, var88);
                var143 += 15;
                int var90 = field991 + 180 - 80;
                short var91 = 321;
                Statics.field950.method6207(var90 - 73, var91 - 20);
                arg0.method4788(class246.field2918, var90, var91 + 5, 16777215, 0);
                int var92 = field991 + 180 + 80;
                Statics.field950.method6207(var92 - 73, var91 - 20);
                arg0.method4788(class246.field2969, var92, var91 + 5, 16777215, 0);
                arg1.method4788(class246.field3144, field991 + 180, var91 + 36, 255, 0);
            } else if (field986 == 5) {
                arg0.method4788(class246.field3169, field991 + 180, 201, 16776960, 0);
                short var93 = 221;
                arg2.method4788(field1011, field991 + 180, var93, 16776960, 0);
                int var146 = var93 + 15;
                arg2.method4788(field999, field991 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg2.method4788(field1000, field991 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                int var149 = var148 + 14;
                arg0.method4785(class246.field3170, field991 + 180 - 145, var149, 16777215, 0);
                short var94 = 174;
                String var95;
                for (var95 = method1997(); arg0.method4781(var95) > var94; var95 = var95.substring(1)) {
                }
                arg0.method4785(class300.method4804(var95) + (client.field611 % 40 < 20 ? class106.method5281(16776960) + class106.field1322 : ""), field991 + 180 - 34, var149, 16777215, 0);
                var146 = var149 + 15;
                int var96 = field991 + 180 - 80;
                short var97 = 321;
                Statics.field950.method6207(var96 - 73, var97 - 20);
                arg0.method4788(class246.field3114, var96, var97 + 5, 16777215, 0);
                int var98 = field991 + 180 + 80;
                Statics.field950.method6207(var98 - 73, var97 - 20);
                arg0.method4788(class246.field3172, var98, var97 + 5, 16777215, 0);
                short var99 = 356;
                arg1.method4788(class246.field3057, Statics.field964, var99, 268435455, 0);
            } else if (field986 == 6) {
                short var100 = 201;
                arg0.method4788(field1011, field991 + 180, var100, 16776960, 0);
                int var150 = var100 + 15;
                arg0.method4788(field999, field991 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg0.method4788(field1000, field991 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var101 = field991 + 180;
                short var102 = 321;
                Statics.field950.method6207(var101 - 73, var102 - 20);
                arg0.method4788(class246.field3172, var101, var102 + 5, 16777215, 0);
            } else if (field986 == 7) {
                short var103 = 216;
                arg0.method4788(class246.field3033, field991 + 180, var103, 16776960, 0);
                int var153 = var103 + 15;
                arg2.method4788(class246.field3198, field991 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg2.method4788(class246.field3202, field991 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                int var104 = field991 + 180 - 80;
                short var105 = 321;
                Statics.field950.method6207(var104 - 73, var105 - 20);
                arg0.method4788(class246.field3203, var104, var105 + 5, 16777215, 0);
                int var106 = field991 + 180 + 80;
                Statics.field950.method6207(var106 - 73, var105 - 20);
                arg0.method4788(class246.field3172, var106, var105 + 5, 16777215, 0);
            } else if (field986 == 8) {
                short var107 = 216;
                arg0.method4788(class246.field3141, field991 + 180, var107, 16776960, 0);
                int var156 = var107 + 15;
                arg2.method4788(class246.field3051, field991 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                arg2.method4788(class246.field3052, field991 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                int var108 = field991 + 180 - 80;
                short var109 = 321;
                Statics.field950.method6207(var108 - 73, var109 - 20);
                arg0.method4788(class246.field3053, var108, var109 + 5, 16777215, 0);
                int var110 = field991 + 180 + 80;
                Statics.field950.method6207(var110 - 73, var109 - 20);
                arg0.method4788(class246.field3172, var110, var109 + 5, 16777215, 0);
            } else if (field986 == 12) {
                short var111 = 201;
                String var112 = "";
                String var113 = "";
                String var114 = "";
                switch(field994) {
                    case 0:
                        var112 = class246.field2966;
                        var113 = class246.field2967;
                        var114 = class246.field2968;
                        break;
                    case 1:
                        var112 = class246.field3005;
                        var113 = class246.field3006;
                        var114 = class246.field3007;
                        break;
                    default:
                        method202(false);
                }
                arg0.method4788(var112, field991 + 180, var111, 16776960, 0);
                int var159 = var111 + 15;
                arg2.method4788(var113, field991 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg2.method4788(var114, field991 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var115 = field991 + 180;
                short var116 = 276;
                Statics.field950.method6207(var115 - 73, var116 - 20);
                arg0.method4788(class246.field3161, var115, var116 + 5, 16777215, 0);
                int var117 = field991 + 180;
                short var118 = 326;
                Statics.field950.method6207(var117 - 73, var118 - 20);
                arg0.method4788(class246.field3172, var117, var118 + 5, 16777215, 0);
            } else if (field986 == 24) {
                short var119 = 221;
                arg0.method4788(field1011, field991 + 180, var119, 16777215, 0);
                int var162 = var119 + 15;
                arg0.method4788(field999, field991 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method4788(field1000, field991 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                int var120 = field991 + 180;
                short var121 = 301;
                Statics.field950.method6207(var120 - 73, var121 - 20);
                arg0.method4788(class246.field3117, var120, var121 + 5, 16777215, 0);
            }
        }
        if (client.field755 >= 10) {
            int[] var122 = new int[4];
            class391.method6136(var122);
            class391.method6119(field996, 0, field996 + 765, Statics.field320);
            Statics.field989.method1917(field996 - 22, client.field611);
            Statics.field989.method1917(field996 + 765 + 22 - 128, client.field611);
            class391.method6122(var122);
        }
        Statics.field4134[Statics.field988.field1301 ? 1 : 0].method6207(field996 + 765 - 40, 463);
        if (client.field755 <= 5 || Statics.field242 != class268.field3357) {
            return;
        }
        if (Statics.field2901 == null) {
            Statics.field2901 = class396.method2753(Statics.field423, "sl_button", "");
            return;
        }
        int var123 = field996 + 5;
        short var124 = 463;
        byte var125 = 100;
        byte var126 = 35;
        Statics.field2901.method6207(var123, var124);
        arg0.method4788(class246.field3081 + " " + client.field600, var125 / 2 + var123, var126 / 2 + var124 - 2, 16777215, 0);
        if (Statics.field893 == null) {
            arg1.method4788(class246.field2937, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        } else {
            arg1.method4788(class246.field3213, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("n.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method80(String arg0, String arg1, String arg2) {
        field1011 = arg0;
        field999 = arg1;
        field1000 = arg2;
    }

    @ObfuscatedName("hi.m(Lal;B)V")
    public static void method3723(class47 arg0) {
        while (class39.method3835()) {
            if (Statics.field147 == 13) {
                field987 = false;
                Statics.field882.method6237(field996, 0);
                Statics.field3242.method6237(field996 + 382, 0);
                Statics.field1464.method6207(field996 + 382 - Statics.field1464.field4236 / 2, 18);
                return;
            }
            if (Statics.field147 == 96) {
                if (field1018 > 0 && Statics.field902 != null) {
                    field1018--;
                }
            } else if (Statics.field147 == 97 && field1018 < field1014 && Statics.field949 != null) {
                field1018++;
            }
        }
        if (class48.field355 != 1 && Statics.field360 || class48.field355 != 4) {
            return;
        }
        int var1 = field996 + 280;
        if (class48.field343 >= var1 && class48.field343 <= var1 + 14 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(0, 0);
            return;
        }
        if (class48.field343 >= var1 + 15 && class48.field343 <= var1 + 80 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(0, 1);
            return;
        }
        int var2 = field996 + 390;
        if (class48.field343 >= var2 && class48.field343 <= var2 + 14 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(1, 0);
            return;
        }
        if (class48.field343 >= var2 + 15 && class48.field343 <= var2 + 80 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(1, 1);
            return;
        }
        int var3 = field996 + 500;
        if (class48.field343 >= var3 && class48.field343 <= var3 + 14 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(2, 0);
            return;
        }
        if (class48.field343 >= var3 + 15 && class48.field343 <= var3 + 80 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(2, 1);
            return;
        }
        int var4 = field996 + 610;
        if (class48.field343 >= var4 && class48.field343 <= var4 + 14 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(3, 0);
            return;
        }
        if (class48.field343 >= var4 + 15 && class48.field343 <= var4 + 80 && class48.field348 >= 4 && class48.field348 <= 18) {
            class76.method2123(3, 1);
            return;
        }
        if (class48.field343 >= field996 + 708 && class48.field348 >= 4 && class48.field343 <= field996 + 708 + 50 && class48.field348 <= 20) {
            field987 = false;
            Statics.field882.method6237(field996, 0);
            Statics.field3242.method6237(field996 + 382, 0);
            Statics.field1464.method6207(field996 + 382 - Statics.field1464.field4236 / 2, 18);
            return;
        }
        if (field1012 != -1) {
            class76 var5 = Statics.field69[field1012];
            method2680(var5);
            field987 = false;
            Statics.field882.method6237(field996, 0);
            Statics.field3242.method6237(field996 + 382, 0);
            Statics.field1464.method6207(field996 + 382 - Statics.field1464.field4236 / 2, 18);
            return;
        }
        if (field1018 > 0 && Statics.field902 != null && class48.field343 >= 0 && class48.field343 <= Statics.field902.field4236 && class48.field348 >= Statics.field320 / 2 - 50 && class48.field348 <= Statics.field320 / 2 + 50) {
            field1018--;
        }
        if (field1018 < field1014 && Statics.field949 != null && class48.field343 >= Statics.field1143 - Statics.field949.field4236 - 5 && class48.field343 <= Statics.field1143 && class48.field348 >= Statics.field320 / 2 - 50 && class48.field348 <= Statics.field320 / 2 + 50) {
            field1018++;
        }
    }

    @ObfuscatedName("er.d(Lbu;S)V")
    public static void method2680(class76 arg0) {
        if (arg0.method1458() != client.field599) {
            client.field599 = arg0.method1458();
            class296.method1901(arg0.method1458());
        }
        if (client.field601 != arg0.field889) {
            class251 var1 = Statics.field423;
            int var2 = arg0.field889;
            if ((var2 & 0x20000000) != 0) {
                Statics.field1464 = class396.method2753(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) == 0) {
                Statics.field1464 = class396.method2753(var1, "logo", "");
            } else {
                Statics.field1464 = class396.method2753(var1, "logo_seasonal_mode", "");
            }
        }
        Statics.field2541 = arg0.field897;
        client.field600 = arg0.field900;
        client.field601 = arg0.field889;
        Statics.field1335 = client.field786 == 0 ? 43594 : arg0.field900 + 40000;
        Statics.field2796 = client.field786 == 0 ? 443 : arg0.field900 + 50000;
        Statics.field40 = Statics.field1335;
    }

    @ObfuscatedName("cv.c(II)V")
    public static void method1831(int arg0) {
        field986 = 12;
        field994 = arg0;
    }

    @ObfuscatedName("v.j(B)V")
    public static void method169() {
        if (class76.method2785()) {
            field987 = true;
            field1018 = 0;
            field1014 = 0;
        }
    }

    @ObfuscatedName("l.r(B)V")
    public static void method82() {
        field986 = 24;
        method80(class246.field3148, class246.field3149, class246.field3150);
    }
}
