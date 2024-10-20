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

@ObfuscatedName("cu")
public class class84 {

    @ObfuscatedName("cu.v")
    public static int field1033 = 0;

    @ObfuscatedName("cu.s")
    public static int field1009 = field1033 + 202;

    @ObfuscatedName("cu.c")
    public static int field1010 = 10;

    @ObfuscatedName("cu.n")
    public static String field1026 = "";

    @ObfuscatedName("cu.at")
    public static int field1012 = -1;

    @ObfuscatedName("cu.ap")
    public static int field1013 = 1;

    @ObfuscatedName("cu.ae")
    public static int field1002 = 0;

    @ObfuscatedName("cu.ao")
    public static String field1037 = "";

    @ObfuscatedName("cu.an")
    public static String field1016 = "";

    @ObfuscatedName("cu.al")
    public static String field1017 = "";

    @ObfuscatedName("cu.aj")
    public static String field1018 = "";

    @ObfuscatedName("cu.ac")
    public static String field1019 = "";

    @ObfuscatedName("cu.as")
    public static String field1028 = "";

    @ObfuscatedName("cu.ax")
    public static boolean field1007 = false;

    @ObfuscatedName("cu.ar")
    public static boolean field1022 = false;

    @ObfuscatedName("cu.bx")
    public static boolean field1023 = true;

    @ObfuscatedName("cu.bi")
    public static int field1024 = 0;

    @ObfuscatedName("cu.bz")
    public static String field1025 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cu.bb")
    public static String field1021 = "1234567890";

    @ObfuscatedName("cu.bc")
    public static boolean field1015 = false;

    @ObfuscatedName("cu.bg")
    public static int field1029 = -1;

    @ObfuscatedName("cu.bm")
    public static int field1014 = 0;

    @ObfuscatedName("cu.bj")
    public static int field1030 = 0;

    @ObfuscatedName("cu.bn")
    public static long field1020;

    @ObfuscatedName("cu.bu")
    public static long field1032;

    static {
        new DecimalFormat("##0.00");
        new class126();
        field1020 = -1L;
        field1032 = -1L;
    }

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mg.f(Ljp;Ljp;ZII)V")
    public static void method5428(class276 arg0, class276 arg1, boolean arg2, int arg3) {
        if (!Statics.field4140) {
            field1002 = arg3;
            class393.method6180();
            byte[] var4 = arg0.method4567("title.jpg", "");
            Statics.field3919 = Statics.method2311(var4);
            Statics.field4141 = Statics.field3919.method6280();
            method205(arg1, client.field621);
            Statics.field2930 = class398.method3835(arg1, "titlebox", "");
            Statics.field3676 = class398.method3835(arg1, "titlebutton", "");
            Statics.field1004 = class398.method2951(arg1, "runes", "");
            Statics.field3626 = class398.method2951(arg1, "title_mute", "");
            Statics.field1003 = class398.method3835(arg1, "options_radio_buttons,0", "");
            Statics.field3578 = class398.method3835(arg1, "options_radio_buttons,4", "");
            Statics.field2129 = class398.method3835(arg1, "options_radio_buttons,2", "");
            Statics.field1006 = class398.method3835(arg1, "options_radio_buttons,6", "");
            Statics.field1478 = Statics.field1003.field4246;
            Statics.field417 = Statics.field1003.field4249;
            Statics.field1205 = new class102(Statics.field1004);
            if (arg2) {
                field1019 = "";
                field1028 = "";
            }
            Statics.field3 = 0;
            Statics.field2162 = "";
            field1023 = true;
            field1015 = false;
            if (Statics.field40.field1315) {
                class234.method682(2);
            } else {
                class274 var5 = Statics.field1081;
                int var6 = var5.method4582("scape main");
                int var7 = var5.method4521(var6, "");
                class234.method2983(2, var5, var6, var7, 255, false);
            }
            class277.method2087(false);
            Statics.field4140 = true;
            field1033 = (Statics.field1350 - 765) / 2;
            field1009 = field1033 + 202;
            Statics.field203 = field1009 + 180;
            Statics.field3919.method6284(field1033, 0);
            Statics.field4141.method6284(field1033 + 382, 0);
            Statics.field1393.method6257(field1033 + 382 - Statics.field1393.field4246 / 2, 18);
        } else if (arg3 == 4) {
            field1002 = 4;
        }
    }

    @ObfuscatedName("jf.e(ZZI)Lof;")
    public static class396 method4458(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1006 : Statics.field2129) : (arg1 ? Statics.field3578 : Statics.field1003);
    }

    @ObfuscatedName("u.v(B)Ljava/lang/String;")
    public static String method163() {
        return Statics.field40.field1317 ? class305.method190(field1019) : field1019;
    }

    @ObfuscatedName("ak.y(Ljp;IB)V")
    public static void method205(class276 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field1393 = class398.method3835(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) == 0) {
            Statics.field1393 = class398.method3835(arg0, "logo", "");
        } else {
            Statics.field1393 = class398.method3835(arg0, "logo_seasonal_mode", "");
        }
    }

    @ObfuscatedName("hf.j(I)V")
    public static void method3952() {
        if (client.field659 && field1019 != null && field1019.length() > 0) {
            field1024 = 1;
        } else {
            field1024 = 0;
        }
    }

    @ObfuscatedName("c.o(Laa;I)V")
    public static void method185(class47 arg0) {
        if (field1015) {
            method3221(arg0);
            return;
        }
        if ((class48.field356 == 1 || !Statics.field1450 && class48.field356 == 4) && class48.field361 >= field1033 + 765 - 50 && class48.field352 >= 453) {
            Statics.field40.field1315 = !Statics.field40.field1315;
            class103.method2003();
            if (Statics.field40.field1315) {
                class234.method940();
            } else {
                class274 var1 = Statics.field1081;
                int var2 = var1.method4582("scape main");
                int var3 = var1.method4521(var2, "");
                class234.method2086(var1, var2, var3, 255, false);
            }
        }
        if (client.field628 == 5) {
            return;
        }
        if (field1020 == -1L) {
            field1020 = class381.method4000() + 1000L;
        }
        long var4 = class381.method4000();
        boolean var6;
        if (client.field757 == null || client.field898 >= client.field757.size()) {
            var6 = true;
        } else {
            while (true) {
                if (client.field898 >= client.field757.size()) {
                    var6 = true;
                    break;
                }
                class92 var7 = (class92) client.field757.get(client.field898);
                if (!var7.method1902()) {
                    var6 = false;
                    break;
                }
                client.field898++;
            }
        }
        if (var6 && field1032 == -1L) {
            field1032 = var4;
            if (field1032 > field1020) {
                field1020 = field1032;
            }
        }
        if (client.field628 != 10 && client.field628 != 11) {
            return;
        }
        if (Statics.field3594 == class291.field3685) {
            if (class48.field356 == 1 || !Statics.field1450 && class48.field356 == 4) {
                int var8 = field1033 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class48.field361 >= var8 && class48.field361 <= var8 + var10 && class48.field352 >= var9 && class48.field352 <= var9 + var11) {
                    if (class76.method3794()) {
                        field1015 = true;
                        field1014 = 0;
                        field1030 = 0;
                    }
                    return;
                }
            }
            if (Statics.field912 != null) {
                method1002();
            }
        }
        int var12 = class48.field356;
        int var13 = class48.field361;
        int var14 = class48.field352;
        if (var12 == 0) {
            var13 = class48.field368;
            var14 = class48.field362;
        }
        if (!Statics.field1450 && var12 == 4) {
            var12 = 1;
        }
        if (field1002 == 0) {
            boolean var15 = false;
            while (class39.method1900()) {
                if (Statics.field447 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field203 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class45.method2107(client.method179("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field203 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field621 & 0x2000000) != 0) {
                    field1037 = "";
                    field1016 = class269.field3458;
                    field1017 = class269.field3467;
                    field1018 = class269.field3460;
                    field1002 = 1;
                    method3952();
                } else if ((client.field621 & 0x4) != 0) {
                    if ((client.field621 & 0x400) == 0) {
                        field1016 = class269.field3265;
                        field1017 = class269.field3392;
                        field1018 = class269.field3478;
                    } else {
                        field1016 = class269.field3455;
                        field1017 = class269.field3456;
                        field1018 = class269.field3311;
                    }
                    field1037 = class269.field3256;
                    field1002 = 1;
                    method3952();
                } else if ((client.field621 & 0x400) == 0) {
                    method987(false);
                } else {
                    field1016 = class269.field3491;
                    field1017 = class269.field3453;
                    field1018 = class269.field3454;
                    field1037 = class269.field3256;
                    field1002 = 1;
                    method3952();
                }
            }
        } else if (field1002 == 1) {
            while (true) {
                if (!class39.method1900()) {
                    int var19 = Statics.field203 - 80;
                    short var20 = 321;
                    if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        method987(false);
                    }
                    int var21 = Statics.field203 + 80;
                    if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        field1002 = 0;
                    }
                    break;
                }
                if (Statics.field447 == 84) {
                    method987(false);
                } else if (Statics.field447 == 13) {
                    field1002 = 0;
                }
            }
        } else if (field1002 == 2) {
            short var22 = 201;
            int var76 = var22 + 52;
            if (var12 == 1 && var14 >= var76 - 12 && var14 < var76 + 2) {
                field1024 = 0;
            }
            var76 += 15;
            if (var12 == 1 && var14 >= var76 - 12 && var14 < var76 + 2) {
                field1024 = 1;
            }
            var76 += 15;
            short var23 = 361;
            if (Statics.field904 != null) {
                int var24 = Statics.field904.field3907 / 2;
                if (var12 == 1 && var13 >= Statics.field904.field3906 - var24 && var13 <= Statics.field904.field3906 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(field1013) {
                        case 1:
                            Statics.method2923(class269.field3529, class269.field3498, class269.field3499);
                            field1002 = 5;
                            return;
                        case 2:
                            class45.method2107("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field203 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1019 = field1019.trim();
                if (field1019.length() == 0) {
                    Statics.method2923(class269.field3350, class269.field3351, class269.field3451);
                    return;
                }
                if (field1028.length() == 0) {
                    Statics.method2923(class269.field3353, class269.field3354, class269.field3355);
                    return;
                }
                Statics.method2923(class269.field3435, class269.field3464, class269.field3465);
                client.method177(false);
                client.method1814(20);
                return;
            }
            int var27 = field1009 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1002 = 0;
                field1019 = "";
                field1028 = "";
                Statics.field3 = 0;
                Statics.field2162 = "";
                field1023 = true;
            }
            int var28 = Statics.field203 + -117;
            short var29 = 277;
            field1007 = var13 >= var28 && var13 < Statics.field1478 + var28 && var14 >= var29 && var14 < Statics.field417 + var29;
            if (var12 == 1 && field1007) {
                client.field659 = !client.field659;
                if (!client.field659 && Statics.field40.field1319 != null) {
                    Statics.field40.field1319 = null;
                    class103.method2003();
                }
            }
            int var30 = Statics.field203 + 24;
            short var31 = 277;
            field1022 = var13 >= var30 && var13 < Statics.field1478 + var30 && var14 >= var31 && var14 < Statics.field417 + var31;
            if (var12 == 1 && field1022) {
                Statics.field40.field1317 = !Statics.field40.field1317;
                if (!Statics.field40.field1317) {
                    field1019 = "";
                    Statics.field40.field1319 = null;
                    method3952();
                }
                class103.method2003();
            }
            while (true) {
                Transferable var37;
                int var38;
                do {
                    while (true) {
                        label702: do {
                            while (true) {
                                while (class39.method1900()) {
                                    if (Statics.field447 == 13) {
                                        field1002 = 0;
                                        field1019 = "";
                                        field1028 = "";
                                        Statics.field3 = 0;
                                        Statics.field2162 = "";
                                        field1023 = true;
                                    } else {
                                        if (field1024 != 0) {
                                            continue label702;
                                        }
                                        char var32 = Statics.field3781;
                                        for (int var33 = 0; var33 < field1025.length() && var32 != field1025.charAt(var33); var33++) {
                                        }
                                        if (Statics.field447 == 85 && field1019.length() > 0) {
                                            field1019 = field1019.substring(0, field1019.length() - 1);
                                        }
                                        if (Statics.field447 == 84 || Statics.field447 == 80) {
                                            field1024 = 1;
                                        }
                                        char var34 = Statics.field3781;
                                        boolean var35 = field1025.indexOf(var34) != -1;
                                        if (var35 && field1019.length() < 320) {
                                            field1019 = field1019 + Statics.field3781;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1024 != 1);
                        if (Statics.field447 == 85 && field1028.length() > 0) {
                            field1028 = field1028.substring(0, field1028.length() - 1);
                        } else if (Statics.field447 == 84 || Statics.field447 == 80) {
                            field1024 = 0;
                            if (Statics.field447 == 84) {
                                field1019 = field1019.trim();
                                if (field1019.length() == 0) {
                                    Statics.method2923(class269.field3350, class269.field3351, class269.field3451);
                                    return;
                                }
                                if (field1028.length() == 0) {
                                    Statics.method2923(class269.field3353, class269.field3354, class269.field3355);
                                    return;
                                }
                                Statics.method2923(class269.field3435, class269.field3464, class269.field3465);
                                client.method177(false);
                                client.method1814(20);
                                return;
                            }
                        }
                        if ((class39.field259[82] || class39.field259[87]) && Statics.field447 == 67) {
                            Clipboard var36 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var37 = var36.getContents(Statics.field11);
                            var38 = 20 - field1028.length();
                            break;
                        }
                        if (class303.method1920(Statics.field3781) && method2218(Statics.field3781) && field1028.length() < 20) {
                            field1028 = field1028 + Statics.field3781;
                        }
                    }
                } while (var38 <= 0);
                try {
                    String var39 = (String) var37.getTransferData(DataFlavor.stringFlavor);
                    int var40 = Math.min(var38, var39.length());
                    for (int var41 = 0; var41 < var40; var41++) {
                        if (!class303.method1920(var39.charAt(var41)) || !method2218(var39.charAt(var41))) {
                            field1002 = 3;
                            return;
                        }
                    }
                    field1028 = field1028 + var39.substring(0, var40);
                } catch (UnsupportedFlavorException var74) {
                } catch (IOException var75) {
                }
            }
        } else if (field1002 == 3) {
            int var44 = field1009 + 180;
            short var45 = 276;
            if (var12 == 1 && var13 >= var44 - 75 && var13 <= var44 + 75 && var14 >= var45 - 20 && var14 <= var45 + 20) {
                method987(false);
            }
            int var46 = field1009 + 180;
            short var47 = 326;
            if (var12 == 1 && var13 >= var46 - 75 && var13 <= var46 + 75 && var14 >= var47 - 20 && var14 <= var47 + 20) {
                Statics.method2923(class269.field3529, class269.field3498, class269.field3499);
                field1002 = 5;
                return;
            }
        } else if (field1002 == 4) {
            int var48 = field1009 + 180 - 80;
            short var49 = 321;
            if (var12 == 1 && var13 >= var48 - 75 && var13 <= var48 + 75 && var14 >= var49 - 20 && var14 <= var49 + 20) {
                Statics.field2162.trim();
                if (Statics.field2162.length() != 6) {
                    Statics.method2923(class269.field3269, class269.field3270, class269.field3271);
                    return;
                }
                Statics.field3 = Integer.parseInt(Statics.field2162);
                Statics.field2162 = "";
                client.method177(true);
                Statics.method2923(class269.field3435, class269.field3464, class269.field3465);
                client.method1814(20);
                return;
            }
            if (var12 == 1 && var13 >= field1009 + 180 - 9 && var13 <= field1009 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field1023 = !field1023;
            }
            if (var12 == 1 && var13 >= field1009 + 180 - 34 && var13 <= field1009 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class45.method2107(client.method179("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var50 = field1009 + 180 + 80;
            if (var12 == 1 && var13 >= var50 - 75 && var13 <= var50 + 75 && var14 >= var49 - 20 && var14 <= var49 + 20) {
                field1002 = 0;
                field1019 = "";
                field1028 = "";
                Statics.field3 = 0;
                Statics.field2162 = "";
            }
            while (class39.method1900()) {
                boolean var51 = false;
                for (int var52 = 0; var52 < field1021.length(); var52++) {
                    if (Statics.field3781 == field1021.charAt(var52)) {
                        var51 = true;
                        break;
                    }
                }
                if (Statics.field447 == 13) {
                    field1002 = 0;
                    field1019 = "";
                    field1028 = "";
                    Statics.field3 = 0;
                    Statics.field2162 = "";
                } else {
                    if (Statics.field447 == 85 && Statics.field2162.length() > 0) {
                        Statics.field2162 = Statics.field2162.substring(0, Statics.field2162.length() - 1);
                    }
                    if (Statics.field447 == 84) {
                        Statics.field2162.trim();
                        if (Statics.field2162.length() != 6) {
                            Statics.method2923(class269.field3269, class269.field3270, class269.field3271);
                            return;
                        }
                        Statics.field3 = Integer.parseInt(Statics.field2162);
                        Statics.field2162 = "";
                        client.method177(true);
                        Statics.method2923(class269.field3435, class269.field3464, class269.field3465);
                        client.method1814(20);
                        return;
                    }
                    if (var51 && Statics.field2162.length() < 6) {
                        Statics.field2162 = Statics.field2162 + Statics.field3781;
                    }
                }
            }
        } else if (field1002 == 5) {
            int var53 = field1009 + 180 - 80;
            short var54 = 321;
            if (var12 == 1 && var13 >= var53 - 75 && var13 <= var53 + 75 && var14 >= var54 - 20 && var14 <= var54 + 20) {
                method2507();
                return;
            }
            int var55 = field1009 + 180 + 80;
            if (var12 == 1 && var13 >= var55 - 75 && var13 <= var55 + 75 && var14 >= var54 - 20 && var14 <= var54 + 20) {
                method987(true);
            }
            short var56 = 361;
            if (Statics.field3892 != null) {
                int var57 = Statics.field3892.field3907 / 2;
                if (var12 == 1 && var13 >= Statics.field3892.field3906 - var57 && var13 <= Statics.field3892.field3906 + var57 && var14 >= var56 - 15 && var14 < var56) {
                    class45.method2107(client.method179("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class39.method1900()) {
                boolean var58 = false;
                for (int var59 = 0; var59 < field1025.length(); var59++) {
                    if (Statics.field3781 == field1025.charAt(var59)) {
                        var58 = true;
                        break;
                    }
                }
                if (Statics.field447 == 13) {
                    method987(true);
                } else {
                    if (Statics.field447 == 85 && field1019.length() > 0) {
                        field1019 = field1019.substring(0, field1019.length() - 1);
                    }
                    if (Statics.field447 == 84) {
                        method2507();
                        return;
                    }
                    if (var58 && field1019.length() < 320) {
                        field1019 = field1019 + Statics.field3781;
                    }
                }
            }
        } else if (field1002 == 6) {
            while (true) {
                do {
                    if (!class39.method1900()) {
                        short var60 = 321;
                        if (var12 == 1 && var14 >= var60 - 20 && var14 <= var60 + 20) {
                            method987(true);
                        }
                        return;
                    }
                } while (Statics.field447 != 84 && Statics.field447 != 13);
                method987(true);
            }
        } else if (field1002 == 7) {
            int var61 = field1009 + 180 - 80;
            short var62 = 321;
            if (var12 == 1 && var13 >= var61 - 75 && var13 <= var61 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                class45.method2107(client.method179("secure", true) + "m=dob/set_dob.ws", true, false);
                Statics.method2923(class269.field3494, class269.field3495, class269.field3308);
                field1002 = 6;
                return;
            }
            int var63 = field1009 + 180 + 80;
            if (var12 == 1 && var13 >= var63 - 75 && var13 <= var63 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                method987(true);
            }
        } else if (field1002 == 8) {
            int var64 = field1009 + 180 - 80;
            short var65 = 321;
            if (var12 == 1 && var13 >= var64 - 75 && var13 <= var64 + 75 && var14 >= var65 - 20 && var14 <= var65 + 20) {
                class45.method2107("https://www.jagex.com/terms/privacy", true, false);
                Statics.method2923(class269.field3494, class269.field3495, class269.field3308);
                field1002 = 6;
                return;
            }
            int var66 = field1009 + 180 + 80;
            if (var12 == 1 && var13 >= var66 - 75 && var13 <= var66 + 75 && var14 >= var65 - 20 && var14 <= var65 + 20) {
                method987(true);
            }
        } else if (field1002 == 12) {
            String var67 = "";
            switch(field1012) {
                case 0:
                    var67 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var67 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method987(false);
            }
            int var68 = field1009 + 180;
            short var69 = 276;
            if (var12 == 1 && var13 >= var68 - 75 && var13 <= var68 + 75 && var14 >= var69 - 20 && var14 <= var69 + 20) {
                class45.method2107(var67, true, false);
                Statics.method2923(class269.field3494, class269.field3495, class269.field3308);
                field1002 = 6;
                return;
            }
            int var70 = field1009 + 180;
            short var71 = 326;
            if (var12 == 1 && var13 >= var70 - 75 && var13 <= var70 + 75 && var14 >= var71 - 20 && var14 <= var71 + 20) {
                method987(false);
            }
        } else if (field1002 == 24) {
            int var72 = field1009 + 180;
            short var73 = 301;
            if (var12 == 1 && var13 >= var72 - 75 && var13 <= var72 + 75 && var14 >= var73 - 20 && var14 <= var73 + 20) {
                method987(false);
            }
        }
    }

    @ObfuscatedName("dq.m(CI)Z")
    public static boolean method2218(char arg0) {
        return field1025.indexOf(arg0) != -1;
    }

    @ObfuscatedName("bo.r(ZI)V")
    public static void method987(boolean arg0) {
        field1016 = class269.field3445;
        field1017 = class269.field3446;
        field1018 = class269.field3447;
        field1002 = 2;
        if (arg0) {
            field1028 = "";
        }
        if (field1019 == null || field1019.length() <= 0) {
            if (Statics.field40.field1319 == null) {
                client.field659 = false;
            } else {
                field1019 = Statics.field40.field1319;
                client.field659 = true;
            }
        }
        method3952();
    }

    @ObfuscatedName("eg.h(I)V")
    public static void method2507() {
        field1019 = field1019.trim();
        if (field1019.length() == 0) {
            Statics.method2923(class269.field3529, class269.field3498, class269.field3499);
            return;
        }
        long var0 = class81.method2418();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1019;
            Random var4 = new Random();
            class384 var5 = new class384(128);
            class384 var6 = new class384(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method5880(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method5883(var4.nextInt());
            }
            var5.method5883(var7[0]);
            var5.method5883(var7[1]);
            var5.method5885(var0);
            var5.method5885(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method5883(var4.nextInt());
            }
            var5.method5920(class81.field984, class81.field985);
            var6.method5880(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method5883(var4.nextInt());
            }
            var6.method5885(var4.nextLong());
            var6.method5884(var4.nextLong());
            if (client.field663 == null) {
                byte[] var11 = class130.method5434();
                var6.method5878(var11, 0, var11.length);
            } else {
                var6.method5878(client.field663, 0, client.field663.length);
            }
            var6.method5885(var4.nextLong());
            var6.method5920(class81.field984, class81.field985);
            int var12 = class384.method376(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class384 var13 = new class384(var12);
            var13.method6068(var3);
            var13.field4161 = var12;
            var13.method5947(var7);
            class384 var14 = new class384(var13.field4161 + var6.field4161 + var5.field4161 + 5);
            var14.method5880(2);
            var14.method5880(var5.field4161);
            var14.method5878(var5.field4160, 0, var5.field4161);
            var14.method5880(var6.field4161);
            var14.method5878(var6.field4160, 0, var6.field4161);
            var14.method5881(var13.field4161);
            var14.method5878(var13.field4160, 0, var13.field4161);
            byte[] var15 = var14.field4160;
            int var16 = var15.length;
            StringBuilder var17 = new StringBuilder();
            for (int var18 = 0; var18 < var16; var18 += 3) {
                int var19 = var15[var18] & 0xFF;
                var17.append(class304.field3748[var19 >>> 2]);
                if (var18 < var16 - 1) {
                    int var20 = var15[var18 + 1] & 0xFF;
                    var17.append(class304.field3748[(var19 & 0x3) << 4 | var20 >>> 4]);
                    if (var18 < var16 - 2) {
                        int var21 = var15[var18 + 2] & 0xFF;
                        var17.append(class304.field3748[(var20 & 0xF) << 2 | var21 >>> 6]).append(class304.field3748[var21 & 0x3F]);
                    } else {
                        var17.append(class304.field3748[(var20 & 0xF) << 2]).append("=");
                    }
                } else {
                    var17.append(class304.field3748[(var19 & 0x3) << 4]).append("==");
                }
            }
            String var22 = var17.toString();
            String var24 = var22;
            byte var31;
            try {
                URL var25 = new URL(client.method179("services", false) + "m=accountappeal/login.ws");
                URLConnection var26 = var25.openConnection();
                var26.setDoInput(true);
                var26.setDoOutput(true);
                var26.setConnectTimeout(5000);
                OutputStreamWriter var27 = new OutputStreamWriter(var26.getOutputStream());
                var27.write("data2=" + class406.method3791(var24) + "&dest=" + class406.method3791("passwordchoice.ws"));
                var27.flush();
                InputStream var28 = var26.getInputStream();
                class384 var29 = new class384(new byte[1000]);
                while (true) {
                    int var30 = var28.read(var29.field4160, var29.field4161, 1000 - var29.field4161);
                    if (var30 == -1) {
                        var27.close();
                        var28.close();
                        String var32 = new String(var29.field4160);
                        if (var32.startsWith("OFFLINE")) {
                            var31 = 4;
                        } else if (var32.startsWith("WRONG")) {
                            var31 = 7;
                        } else if (var32.startsWith("RELOAD")) {
                            var31 = 3;
                        } else if (var32.startsWith("Not permitted for social network accounts.")) {
                            var31 = 6;
                        } else {
                            var29.method6062(var7);
                            while (var29.field4161 > 0 && var29.field4160[var29.field4161 - 1] == 0) {
                                var29.field4161--;
                            }
                            String var33 = new String(var29.field4160, 0, var29.field4161);
                            if (class81.method2528(var33)) {
                                class45.method2107(var33, true, false);
                                var31 = 2;
                            } else {
                                var31 = 5;
                            }
                        }
                        break;
                    }
                    var29.field4161 += var30;
                    if (var29.field4161 >= 1000) {
                        var31 = 5;
                        break;
                    }
                }
            } catch (Throwable var35) {
                var35.printStackTrace();
                var31 = 5;
            }
            var2 = var31;
        }
        switch(var2) {
            case 2:
                Statics.method2923(class269.field3500, class269.field3501, class269.field3287);
                field1002 = 6;
                break;
            case 3:
                Statics.method2923(class269.field3387, class269.field3525, class269.field3343);
                break;
            case 4:
                Statics.method2923(class269.field3506, class269.field3507, class269.field3508);
                break;
            case 5:
                Statics.method2923(class269.field3509, class269.field3430, class269.field3511);
                break;
            case 6:
                Statics.method2923(class269.field3512, class269.field3513, class269.field3230);
                break;
            case 7:
                Statics.method2923(class269.field3326, class269.field3516, class269.field3517);
        }
    }

    @ObfuscatedName("jq.d(Lkj;Lkj;Lkj;I)V")
    public static void method4500(class301 arg0, class301 arg1, class301 arg2) {
        field1033 = (Statics.field1350 - 765) / 2;
        field1009 = field1033 + 202;
        Statics.field203 = field1009 + 180;
        if (field1015) {
            method203(arg0, arg1);
            return;
        }
        Statics.field3919.method6284(field1033, 0);
        Statics.field4141.method6284(field1033 + 382, 0);
        Statics.field1393.method6257(field1033 + 382 - Statics.field1393.field4246 / 2, 18);
        if (client.field628 == 0 || client.field628 == 5) {
            byte var3 = 20;
            arg0.method4884(class269.field3520, field1009 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class393.method6192(field1009 + 180 - 152, var4, 304, 34, 9179409);
            class393.method6192(field1009 + 180 - 151, var4 + 1, 302, 32, 0);
            class393.method6184(field1009 + 180 - 150, var4 + 2, field1010 * 3, 30, 9179409);
            class393.method6184(field1010 * 3 + (field1009 + 180 - 150), var4 + 2, 300 - field1010 * 3, 30, 0);
            arg0.method4884(field1026, field1009 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field628 == 20) {
            Statics.field2930.method6257(field1009 + 180 - Statics.field2930.field4246 / 2, 271 - Statics.field2930.field4249 / 2);
            short var5 = 201;
            arg0.method4884(field1016, field1009 + 180, var5, 16776960, 0);
            int var78 = var5 + 15;
            arg0.method4884(field1017, field1009 + 180, var78, 16776960, 0);
            int var79 = var78 + 15;
            arg0.method4884(field1018, field1009 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            int var81 = var80 + 7;
            if (field1002 != 4) {
                arg0.method4924(class269.field3440, field1009 + 180 - 110, var81, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method163(); arg0.method4889(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method4924(class302.method4893(var7), field1009 + 180 - 70, var81, 16777215, 0);
                var78 = var81 + 15;
                String var8;
                for (var8 = class305.method190(field1028); arg0.method4889(var8) > var6; var8 = var8.substring(1)) {
                }
                arg0.method4924(class269.field3473 + var8, field1009 + 180 - 108, var78, 16777215, 0);
                var78 += 15;
            }
        }
        if (client.field628 == 10 || client.field628 == 11) {
            Statics.field2930.method6257(field1009, 171);
            if (field1002 == 0) {
                short var9 = 251;
                arg0.method4884(class269.field3475, field1009 + 180, var9, 16776960, 0);
                int var82 = var9 + 30;
                int var10 = field1009 + 180 - 80;
                short var11 = 291;
                Statics.field3676.method6257(var10 - 73, var11 - 20);
                arg0.method4897(class269.field3252, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1009 + 180 + 80;
                Statics.field3676.method6257(var12 - 73, var11 - 20);
                arg0.method4897(class269.field3477, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1002 == 1) {
                arg0.method4884(field1037, field1009 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method4884(field1016, field1009 + 180, var13, 16777215, 0);
                int var83 = var13 + 15;
                arg0.method4884(field1017, field1009 + 180, var83, 16777215, 0);
                int var84 = var83 + 15;
                arg0.method4884(field1018, field1009 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                int var14 = field1009 + 180 - 80;
                short var15 = 321;
                Statics.field3676.method6257(var14 - 73, var15 - 20);
                arg0.method4884(class269.field3236, var14, var15 + 5, 16777215, 0);
                int var16 = field1009 + 180 + 80;
                Statics.field3676.method6257(var16 - 73, var15 - 20);
                arg0.method4884(class269.field3397, var16, var15 + 5, 16777215, 0);
            } else if (field1002 == 2) {
                short var17 = 201;
                arg0.method4884(field1016, Statics.field203, var17, 16776960, 0);
                int var86 = var17 + 15;
                arg0.method4884(field1017, Statics.field203, var86, 16776960, 0);
                int var87 = var86 + 15;
                arg0.method4884(field1018, Statics.field203, var87, 16776960, 0);
                int var88 = var87 + 15;
                int var89 = var88 + 7;
                arg0.method4924(class269.field3440, Statics.field203 - 110, var89, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method163(); arg0.method4889(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4924(class302.method4893(var19) + (field1024 == 0 & client.field631 % 40 < 20 ? class106.method1825(16776960) + class106.field1332 : ""), Statics.field203 - 70, var89, 16777215, 0);
                var86 = var89 + 15;
                String var20;
                for (var20 = class305.method190(field1028); arg0.method4889(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method4924(class269.field3473 + var20 + (field1024 == 1 & client.field631 % 40 < 20 ? class106.method1825(16776960) + class106.field1332 : ""), Statics.field203 - 108, var86, 16777215, 0);
                var86 += 15;
                short var21 = 277;
                int var22 = Statics.field203 + -117;
                class396 var23 = method4458(client.field659, field1007);
                var23.method6257(var22, var21);
                int var24 = var23.field4246 + 5 + var22;
                arg1.method4924(class269.field3515, var24, var21 + 13, 16776960, 0);
                int var25 = Statics.field203 + 24;
                class396 var26 = method4458(Statics.field40.field1317, field1022);
                var26.method6257(var25, var21);
                int var27 = var26.field4246 + 5 + var25;
                arg1.method4924(class269.field3481, var27, var21 + 13, 16776960, 0);
                int var90 = var21 + 15;
                int var28 = Statics.field203 - 80;
                short var29 = 321;
                Statics.field3676.method6257(var28 - 73, var29 - 20);
                arg0.method4884(class269.field3406, var28, var29 + 5, 16777215, 0);
                int var30 = Statics.field203 + 80;
                Statics.field3676.method6257(var30 - 73, var29 - 20);
                arg0.method4884(class269.field3397, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                switch(field1013) {
                    case 2:
                        Statics.field2558 = class269.field3493;
                        break;
                    default:
                        Statics.field2558 = class269.field3444;
                }
                Statics.field904 = new class338(Statics.field203, var31, arg1.method4889(Statics.field2558), 11);
                Statics.field3892 = new class338(Statics.field203, var31, arg1.method4889(class269.field3247), 11);
                arg1.method4884(Statics.field2558, Statics.field203, var31, 16777215, 0);
            } else if (field1002 == 3) {
                short var32 = 201;
                arg0.method4884(class269.field3469, field1009 + 180, var32, 16776960, 0);
                int var91 = var32 + 20;
                arg1.method4884(class269.field3405, field1009 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method4884(class269.field3484, field1009 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var33 = field1009 + 180;
                short var34 = 276;
                Statics.field3676.method6257(var33 - 73, var34 - 20);
                arg2.method4884(class269.field3485, var33, var34 + 5, 16777215, 0);
                int var35 = field1009 + 180;
                short var36 = 326;
                Statics.field3676.method6257(var35 - 73, var36 - 20);
                arg2.method4884(class269.field3486, var35, var36 + 5, 16777215, 0);
            } else if (field1002 == 4) {
                arg0.method4884(class269.field3461, field1009 + 180, 201, 16776960, 0);
                short var37 = 236;
                arg0.method4884(field1016, field1009 + 180, var37, 16777215, 0);
                int var94 = var37 + 15;
                arg0.method4884(field1017, field1009 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method4884(field1018, field1009 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method4924(class269.field3474 + class305.method190(Statics.field2162) + (client.field631 % 40 < 20 ? class106.method1825(16776960) + class106.field1332 : ""), field1009 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method4924(class269.field3239, field1009 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method4924(class269.field3472, field1009 + 180 - 9, var98, 16776960, 0);
                int var38 = field1009 + 180 - 9 + arg0.method4889(class269.field3472) + 15;
                int var39 = var98 - arg0.field3728;
                class396 var40;
                if (field1023) {
                    var40 = Statics.field2129;
                } else {
                    var40 = Statics.field1003;
                }
                var40.method6257(var38, var39);
                var94 = var98 + 15;
                int var41 = field1009 + 180 - 80;
                short var42 = 321;
                Statics.field3676.method6257(var41 - 73, var42 - 20);
                arg0.method4884(class269.field3236, var41, var42 + 5, 16777215, 0);
                int var43 = field1009 + 180 + 80;
                Statics.field3676.method6257(var43 - 73, var42 - 20);
                arg0.method4884(class269.field3397, var43, var42 + 5, 16777215, 0);
                arg1.method4884(class269.field3462, field1009 + 180, var42 + 36, 255, 0);
            } else if (field1002 == 5) {
                arg0.method4884(class269.field3415, field1009 + 180, 201, 16776960, 0);
                short var44 = 221;
                arg2.method4884(field1016, field1009 + 180, var44, 16776960, 0);
                int var99 = var44 + 15;
                arg2.method4884(field1017, field1009 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method4884(field1018, field1009 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method4924(class269.field3488, field1009 + 180 - 145, var102, 16777215, 0);
                short var45 = 174;
                String var46;
                for (var46 = method163(); arg0.method4889(var46) > var45; var46 = var46.substring(1)) {
                }
                arg0.method4924(class302.method4893(var46) + (client.field631 % 40 < 20 ? class106.method1825(16776960) + class106.field1332 : ""), field1009 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var47 = field1009 + 180 - 80;
                short var48 = 321;
                Statics.field3676.method6257(var47 - 73, var48 - 20);
                arg0.method4884(class269.field3489, var47, var48 + 5, 16777215, 0);
                int var49 = field1009 + 180 + 80;
                Statics.field3676.method6257(var49 - 73, var48 - 20);
                arg0.method4884(class269.field3490, var49, var48 + 5, 16777215, 0);
                short var50 = 356;
                arg1.method4884(class269.field3247, Statics.field203, var50, 268435455, 0);
            } else if (field1002 == 6) {
                short var51 = 201;
                arg0.method4884(field1016, field1009 + 180, var51, 16776960, 0);
                int var103 = var51 + 15;
                arg0.method4884(field1017, field1009 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method4884(field1018, field1009 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var52 = field1009 + 180;
                short var53 = 321;
                Statics.field3676.method6257(var52 - 73, var53 - 20);
                arg0.method4884(class269.field3490, var52, var53 + 5, 16777215, 0);
            } else if (field1002 == 7) {
                short var54 = 216;
                arg0.method4884(class269.field3518, field1009 + 180, var54, 16776960, 0);
                int var106 = var54 + 15;
                arg2.method4884(class269.field3487, field1009 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                arg2.method4884(class269.field3346, field1009 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                int var55 = field1009 + 180 - 80;
                short var56 = 321;
                Statics.field3676.method6257(var55 - 73, var56 - 20);
                arg0.method4884(class269.field3402, var55, var56 + 5, 16777215, 0);
                int var57 = field1009 + 180 + 80;
                Statics.field3676.method6257(var57 - 73, var56 - 20);
                arg0.method4884(class269.field3490, var57, var56 + 5, 16777215, 0);
            } else if (field1002 == 8) {
                short var58 = 216;
                arg0.method4884(class269.field3368, field1009 + 180, var58, 16776960, 0);
                int var109 = var58 + 15;
                arg2.method4884(class269.field3369, field1009 + 180, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg2.method4884(class269.field3527, field1009 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var59 = field1009 + 180 - 80;
                short var60 = 321;
                Statics.field3676.method6257(var59 - 73, var60 - 20);
                arg0.method4884(class269.field3371, var59, var60 + 5, 16777215, 0);
                int var61 = field1009 + 180 + 80;
                Statics.field3676.method6257(var61 - 73, var60 - 20);
                arg0.method4884(class269.field3490, var61, var60 + 5, 16777215, 0);
            } else if (field1002 == 12) {
                short var62 = 201;
                String var63 = "";
                String var64 = "";
                String var65 = "";
                switch(field1012) {
                    case 0:
                        var63 = class269.field3284;
                        var64 = class269.field3285;
                        var65 = class269.field3286;
                        break;
                    case 1:
                        var63 = class269.field3323;
                        var64 = class269.field3530;
                        var65 = class269.field3325;
                        break;
                    default:
                        method987(false);
                }
                arg0.method4884(var63, field1009 + 180, var62, 16776960, 0);
                int var112 = var62 + 15;
                arg2.method4884(var64, field1009 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg2.method4884(var65, field1009 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var66 = field1009 + 180;
                short var67 = 276;
                Statics.field3676.method6257(var66 - 73, var67 - 20);
                arg0.method4884(class269.field3263, var66, var67 + 5, 16777215, 0);
                int var68 = field1009 + 180;
                short var69 = 326;
                Statics.field3676.method6257(var68 - 73, var69 - 20);
                arg0.method4884(class269.field3490, var68, var69 + 5, 16777215, 0);
            } else if (field1002 == 24) {
                short var70 = 221;
                arg0.method4884(field1016, field1009 + 180, var70, 16777215, 0);
                int var115 = var70 + 15;
                arg0.method4884(field1017, field1009 + 180, var115, 16777215, 0);
                int var116 = var115 + 15;
                arg0.method4884(field1018, field1009 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                int var71 = field1009 + 180;
                short var72 = 301;
                Statics.field3676.method6257(var71 - 73, var72 - 20);
                arg0.method4884(class269.field3234, var71, var72 + 5, 16777215, 0);
            }
        }
        if (client.field628 >= 10) {
            int[] var73 = new int[4];
            class393.method6175(var73);
            class393.method6217(field1033, 0, field1033 + 765, Statics.field5);
            Statics.field1205.method2038(field1033 - 22, client.field631);
            Statics.field1205.method2038(field1033 + 765 + 22 - 128, client.field631);
            class393.method6179(var73);
        }
        Statics.field3626[Statics.field40.field1315 ? 1 : 0].method6257(field1033 + 765 - 40, 463);
        if (client.field628 <= 5 || Statics.field3594 != class291.field3685) {
            return;
        }
        if (Statics.field245 == null) {
            Statics.field245 = class398.method3835(Statics.field3706, "sl_button", "");
            return;
        }
        int var74 = field1033 + 5;
        short var75 = 463;
        byte var76 = 100;
        byte var77 = 35;
        Statics.field245.method6257(var74, var75);
        arg0.method4884(class269.field3240 + " " + client.field804, var76 / 2 + var74, var77 / 2 + var75 - 2, 16777215, 0);
        if (Statics.field912 == null) {
            arg1.method4884(class269.field3360, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
        } else {
            arg1.method4884(class269.field3531, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ak.b(Lkj;Lkj;B)V")
    public static void method203(class301 arg0, class301 arg1) {
        if (Statics.field1386 == null) {
            class274 var2 = Statics.field3706;
            int var3 = var2.method4582("sl_back");
            int var4 = var2.method4521(var3, "");
            class397[] var5;
            if (class398.method1034(var2, var3, var4)) {
                class397[] var6 = new class397[Statics.field4266];
                int var7 = 0;
                while (true) {
                    if (var7 >= Statics.field4266) {
                        class398.method5320();
                        var5 = var6;
                        break;
                    }
                    class397 var8 = var6[var7] = new class397();
                    var8.field4259 = Statics.field4267;
                    var8.field4260 = Statics.field2933;
                    var8.field4257 = Statics.field4268[var7];
                    var8.field4258 = Statics.field208[var7];
                    var8.field4262 = Statics.field301[var7];
                    var8.field4254 = Statics.field1538[var7];
                    int var9 = var8.field4262 * var8.field4254;
                    byte[] var10 = Statics.field1480[var7];
                    var8.field4263 = new int[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var8.field4263[var11] = Statics.field4269[var10[var11] & 0xFF];
                    }
                    var7++;
                }
            } else {
                var5 = null;
            }
            Statics.field1386 = var5;
        }
        if (Statics.field4079 == null) {
            Statics.field4079 = class398.method2951(Statics.field3706, "sl_flags", "");
        }
        if (Statics.field78 == null) {
            Statics.field78 = class398.method2951(Statics.field3706, "sl_arrows", "");
        }
        if (Statics.field3113 == null) {
            Statics.field3113 = class398.method2951(Statics.field3706, "sl_stars", "");
        }
        if (Statics.field3622 == null) {
            Statics.field3622 = class398.method3835(Statics.field3706, "leftarrow", "");
        }
        if (Statics.field114 == null) {
            Statics.field114 = class398.method3835(Statics.field3706, "rightarrow", "");
        }
        class393.method6184(field1033, 23, 765, 480, 0);
        class393.method6200(field1033, 0, 125, 23, 12425273, 9135624);
        class393.method6200(field1033 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4884(class269.field3522, field1033 + 62, 15, 0, -1);
        if (Statics.field3113 != null) {
            Statics.field3113[1].method6257(field1033 + 140, 1);
            arg1.method4924(class269.field3523, field1033 + 152, 10, 16777215, -1);
            Statics.field3113[0].method6257(field1033 + 140, 12);
            arg1.method4924(class269.field3524, field1033 + 152, 21, 16777215, -1);
        }
        if (Statics.field78 != null) {
            int var14 = field1033 + 280;
            if (class76.field911[0] == 0 && class76.field914[0] == 0) {
                Statics.field78[2].method6257(var14, 4);
            } else {
                Statics.field78[0].method6257(var14, 4);
            }
            if (class76.field911[0] == 0 && class76.field914[0] == 1) {
                Statics.field78[3].method6257(var14 + 15, 4);
            } else {
                Statics.field78[1].method6257(var14 + 15, 4);
            }
            arg0.method4924(class269.field3304, var14 + 32, 17, 16777215, -1);
            int var15 = field1033 + 390;
            if (class76.field911[0] == 1 && class76.field914[0] == 0) {
                Statics.field78[2].method6257(var15, 4);
            } else {
                Statics.field78[0].method6257(var15, 4);
            }
            if (class76.field911[0] == 1 && class76.field914[0] == 1) {
                Statics.field78[3].method6257(var15 + 15, 4);
            } else {
                Statics.field78[1].method6257(var15 + 15, 4);
            }
            arg0.method4924(class269.field3377, var15 + 32, 17, 16777215, -1);
            int var16 = field1033 + 500;
            if (class76.field911[0] == 2 && class76.field914[0] == 0) {
                Statics.field78[2].method6257(var16, 4);
            } else {
                Statics.field78[0].method6257(var16, 4);
            }
            if (class76.field911[0] == 2 && class76.field914[0] == 1) {
                Statics.field78[3].method6257(var16 + 15, 4);
            } else {
                Statics.field78[1].method6257(var16 + 15, 4);
            }
            arg0.method4924(class269.field3463, var16 + 32, 17, 16777215, -1);
            int var17 = field1033 + 610;
            if (class76.field911[0] == 3 && class76.field914[0] == 0) {
                Statics.field78[2].method6257(var17, 4);
            } else {
                Statics.field78[0].method6257(var17, 4);
            }
            if (class76.field911[0] == 3 && class76.field914[0] == 1) {
                Statics.field78[3].method6257(var17 + 15, 4);
            } else {
                Statics.field78[1].method6257(var17 + 15, 4);
            }
            arg0.method4924(class269.field3528, var17 + 32, 17, 16777215, -1);
        }
        class393.method6184(field1033 + 708, 4, 50, 16, 0);
        arg1.method4884(class269.field3397, field1033 + 708 + 25, 16, 16777215, -1);
        field1029 = -1;
        if (Statics.field1386 != null) {
            byte var18 = 88;
            byte var19 = 19;
            int var20 = 765 / (var18 + 1) - 1;
            int var21 = 480 / (var19 + 1);
            int var22;
            int var23;
            do {
                var22 = var21;
                var23 = var20;
                if ((var20 - 1) * var21 >= class76.field910) {
                    var20--;
                }
                if ((var21 - 1) * var20 >= class76.field910) {
                    var21--;
                }
                if ((var21 - 1) * var20 >= class76.field910) {
                    var21--;
                }
            } while (var21 != var22 || var20 != var23);
            int var24 = (765 - var18 * var20) / (var20 + 1);
            if (var24 > 5) {
                var24 = 5;
            }
            int var25 = (480 - var19 * var21) / (var21 + 1);
            if (var25 > 5) {
                var25 = 5;
            }
            int var26 = (765 - var18 * var20 - (var20 - 1) * var24) / 2;
            int var27 = (480 - var19 * var21 - (var21 - 1) * var25) / 2;
            int var28 = (class76.field910 + var21 - 1) / var21;
            field1030 = var28 - var20;
            if (Statics.field3622 != null && field1014 > 0) {
                Statics.field3622.method6257(8, Statics.field5 / 2 - Statics.field3622.field4249 / 2);
            }
            if (Statics.field114 != null && field1014 < field1030) {
                Statics.field114.method6257(Statics.field1350 - Statics.field114.field4246 - 8, Statics.field5 / 2 - Statics.field114.field4249 / 2);
            }
            int var29 = var27 + 23;
            int var30 = field1033 + var26;
            int var31 = 0;
            boolean var32 = false;
            int var33 = field1014;
            for (int var34 = var21 * var33; var34 < class76.field910 && var33 - field1014 < var20; var34++) {
                class76 var35 = Statics.field907[var34];
                boolean var36 = true;
                String var37 = Integer.toString(var35.field906);
                if (var35.field906 == -1) {
                    var37 = class269.field3264;
                    var36 = false;
                } else if (var35.field906 > 1980) {
                    var37 = class269.field3428;
                    var36 = false;
                }
                int var38 = 0;
                byte var39;
                if (var35.method1532()) {
                    if (var35.method1530()) {
                        var39 = 7;
                    } else {
                        var39 = 6;
                    }
                } else if (var35.method1519()) {
                    var38 = 16711680;
                    if (var35.method1530()) {
                        var39 = 5;
                    } else {
                        var39 = 4;
                    }
                } else if (var35.method1521()) {
                    if (var35.method1530()) {
                        var39 = 9;
                    } else {
                        var39 = 8;
                    }
                } else if (var35.method1493()) {
                    if (var35.method1530()) {
                        var39 = 3;
                    } else {
                        var39 = 2;
                    }
                } else if (var35.method1530()) {
                    var39 = 1;
                } else {
                    var39 = 0;
                }
                if (class48.field368 >= var30 && class48.field362 >= var29 && class48.field368 < var18 + var30 && class48.field362 < var19 + var29 && var36) {
                    field1029 = var34;
                    Statics.field1386[var39].method6340(var30, var29, 128, 16777215);
                    var32 = true;
                } else {
                    Statics.field1386[var39].method6284(var30, var29);
                }
                if (Statics.field4079 != null) {
                    Statics.field4079[(var35.method1530() ? 8 : 0) + var35.field918].method6257(var30 + 29, var29);
                }
                arg0.method4884(Integer.toString(var35.field913), var30 + 15, var19 / 2 + var29 + 5, var38, -1);
                arg1.method4884(var37, var30 + 60, var19 / 2 + var29 + 5, 268435455, -1);
                var29 += var19 + var25;
                var31++;
                if (var31 >= var21) {
                    var29 = var27 + 23;
                    var30 += var18 + var24;
                    var31 = 0;
                    var33++;
                }
            }
            if (var32) {
                int var40 = arg1.method4889(Statics.field907[field1029].field908) + 6;
                int var41 = arg1.field3728 + 8;
                int var42 = class48.field362 + 25;
                if (var41 + var42 > 480) {
                    var42 = class48.field362 - 25 - var41;
                }
                class393.method6184(class48.field368 - var40 / 2, var42, var40, var41, 16777120);
                class393.method6192(class48.field368 - var40 / 2, var42, var40, var41, 0);
                arg1.method4884(Statics.field907[field1029].field908, class48.field368, arg1.field3728 + var42 + 4, 0, -1);
            }
        }
        Statics.field2061.method380(0, 0);
    }

    @ObfuscatedName("ft.i(Laa;I)V")
    public static void method3221(class47 arg0) {
        while (class39.method1900()) {
            if (Statics.field447 == 13) {
                field1015 = false;
                Statics.field3919.method6284(field1033, 0);
                Statics.field4141.method6284(field1033 + 382, 0);
                Statics.field1393.method6257(field1033 + 382 - Statics.field1393.field4246 / 2, 18);
                return;
            }
            if (Statics.field447 == 96) {
                if (field1014 > 0 && Statics.field3622 != null) {
                    field1014--;
                }
            } else if (Statics.field447 == 97 && field1014 < field1030 && Statics.field114 != null) {
                field1014++;
            }
        }
        if (class48.field356 != 1 && Statics.field1450 || class48.field356 != 4) {
            return;
        }
        int var1 = field1033 + 280;
        if (class48.field361 >= var1 && class48.field361 <= var1 + 14 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(0, 0);
            return;
        }
        if (class48.field361 >= var1 + 15 && class48.field361 <= var1 + 80 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(0, 1);
            return;
        }
        int var2 = field1033 + 390;
        if (class48.field361 >= var2 && class48.field361 <= var2 + 14 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(1, 0);
            return;
        }
        if (class48.field361 >= var2 + 15 && class48.field361 <= var2 + 80 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(1, 1);
            return;
        }
        int var3 = field1033 + 500;
        if (class48.field361 >= var3 && class48.field361 <= var3 + 14 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(2, 0);
            return;
        }
        if (class48.field361 >= var3 + 15 && class48.field361 <= var3 + 80 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(2, 1);
            return;
        }
        int var4 = field1033 + 610;
        if (class48.field361 >= var4 && class48.field361 <= var4 + 14 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(3, 0);
            return;
        }
        if (class48.field361 >= var4 + 15 && class48.field361 <= var4 + 80 && class48.field352 >= 4 && class48.field352 <= 18) {
            class76.method1545(3, 1);
            return;
        }
        if (class48.field361 >= field1033 + 708 && class48.field352 >= 4 && class48.field361 <= field1033 + 708 + 50 && class48.field352 <= 20) {
            field1015 = false;
            Statics.field3919.method6284(field1033, 0);
            Statics.field4141.method6284(field1033 + 382, 0);
            Statics.field1393.method6257(field1033 + 382 - Statics.field1393.field4246 / 2, 18);
            return;
        }
        if (field1029 != -1) {
            class76 var5 = Statics.field907[field1029];
            method4628(var5);
            field1015 = false;
            Statics.field3919.method6284(field1033, 0);
            Statics.field4141.method6284(field1033 + 382, 0);
            Statics.field1393.method6257(field1033 + 382 - Statics.field1393.field4246 / 2, 18);
            return;
        }
        if (field1014 > 0 && Statics.field3622 != null && class48.field361 >= 0 && class48.field361 <= Statics.field3622.field4246 && class48.field352 >= Statics.field5 / 2 - 50 && class48.field352 <= Statics.field5 / 2 + 50) {
            field1014--;
        }
        if (field1014 < field1030 && Statics.field114 != null && class48.field361 >= Statics.field1350 - Statics.field114.field4246 - 5 && class48.field361 <= Statics.field1350 && class48.field352 >= Statics.field5 / 2 - 50 && class48.field352 <= Statics.field5 / 2 + 50) {
            field1014++;
        }
    }

    @ObfuscatedName("jy.k(Lbk;I)V")
    public static void method4628(class76 arg0) {
        if (arg0.method1530() != client.field623) {
            client.field623 = arg0.method1530();
            boolean var1 = arg0.method1530();
            if (Statics.field1849 != var1) {
                class156.method1816();
                Statics.field1849 = var1;
            }
        }
        if (client.field621 != arg0.field916) {
            method205(Statics.field3706, arg0.field916);
        }
        Statics.field896 = arg0.field917;
        client.field804 = arg0.field913;
        client.field621 = arg0.field916;
        Statics.field1441 = client.field816 == 0 ? 43594 : arg0.field913 + 40000;
        Statics.field1173 = client.field816 == 0 ? 443 : arg0.field913 + 50000;
        Statics.field4223 = Statics.field1441;
    }

    @ObfuscatedName("bu.g(I)V")
    public static void method1002() {
        if (class76.method3794()) {
            field1015 = true;
            field1014 = 0;
            field1030 = 0;
        }
    }

    @ObfuscatedName("hf.t(I)V")
    public static void method3951() {
        field1002 = 24;
        Statics.method2923(class269.field3466, class269.field3322, class269.field3468);
    }
}
