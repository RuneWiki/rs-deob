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

@ObfuscatedName("ct")
public class class84 {

    @ObfuscatedName("ct.f")
    public static int field1024 = 0;

    @ObfuscatedName("ct.x")
    public static int field1030 = field1024 + 202;

    @ObfuscatedName("ct.w")
    public static int field1031 = 10;

    @ObfuscatedName("ct.t")
    public static String field1050 = "";

    @ObfuscatedName("ct.al")
    public static int field1033 = -1;

    @ObfuscatedName("ct.ar")
    public static int field1040 = 1;

    @ObfuscatedName("ct.aj")
    public static int field1035 = 0;

    @ObfuscatedName("ct.am")
    public static String field1032 = "";

    @ObfuscatedName("ct.az")
    public static String field1037 = "";

    @ObfuscatedName("ct.av")
    public static String field1038 = "";

    @ObfuscatedName("ct.ac")
    public static String field1054 = "";

    @ObfuscatedName("ct.at")
    public static String field1041 = "";

    @ObfuscatedName("ct.ah")
    public static String field1053 = "";

    @ObfuscatedName("ct.aa")
    public static boolean field1042 = false;

    @ObfuscatedName("ct.au")
    public static boolean field1048 = false;

    @ObfuscatedName("ct.bt")
    public static boolean field1044 = true;

    @ObfuscatedName("ct.bq")
    public static int field1045 = 0;

    @ObfuscatedName("ct.bu")
    public static String field1039 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ct.bl")
    public static String field1052 = "1234567890";

    @ObfuscatedName("ct.bm")
    public static boolean field1043 = false;

    @ObfuscatedName("ct.bj")
    public static int field1049 = -1;

    @ObfuscatedName("ct.bx")
    public static int field1036 = 0;

    @ObfuscatedName("ct.bp")
    public static int field1034 = 0;

    @ObfuscatedName("ct.bo")
    public static long field1051;

    @ObfuscatedName("ct.bw")
    public static long field1023;

    static {
        new DecimalFormat("##0.00");
        new class125();
        field1051 = -1L;
        field1023 = -1L;
    }

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ls.v(I)I")
    public static int method5365() {
        return 12;
    }

    @ObfuscatedName("cf.f(ZZI)Lop;")
    public static class395 method1808(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field34 : Statics.field3660) : (arg1 ? Statics.field554 : Statics.field952);
    }

    @ObfuscatedName("jt.p(Ljv;IB)V")
    public static void method4612(class275 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field4053 = class397.method2521(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) == 0) {
            Statics.field4053 = class397.method2521(arg0, "logo", "");
        } else {
            Statics.field4053 = class397.method2521(arg0, "logo_seasonal_mode", "");
        }
    }

    @ObfuscatedName("ff.j(Laf;B)V")
    public static void method3247(class47 arg0) {
        if (field1043) {
            method165(arg0);
            return;
        }
        if ((class48.field384 == 1 || !Statics.field666 && class48.field384 == 4) && class48.field368 >= field1024 + 765 - 50 && class48.field378 >= 453) {
            Statics.field1804.field1328 = !Statics.field1804.field1328;
            class103.method2073();
            if (Statics.field1804.field1328) {
                Statics.field1467.method4017();
                class233.field2828 = 1;
                Statics.field2520 = null;
            } else {
                class273 var1 = Statics.field1427;
                int var2 = var1.method4484("scape main");
                int var3 = var1.method4485(var2, "");
                class233.method2018(var1, var2, var3, 255, false);
            }
        }
        if (client.field646 == 5) {
            return;
        }
        if (field1051 == -1L) {
            field1051 = class380.method2744() + 1000L;
        }
        long var4 = class380.method2744();
        boolean var6;
        if (client.field915 == null || client.field713 >= client.field915.size()) {
            var6 = true;
        } else {
            while (true) {
                if (client.field713 >= client.field915.size()) {
                    var6 = true;
                    break;
                }
                class92 var7 = (class92) client.field915.get(client.field713);
                if (!var7.method1869()) {
                    var6 = false;
                    break;
                }
                client.field713++;
            }
        }
        if (var6 && field1023 == -1L) {
            field1023 = var4;
            if (field1023 > field1051) {
                field1051 = field1023;
            }
        }
        if (client.field646 != 10 && client.field646 != 11) {
            return;
        }
        if (Statics.field4141 == class290.field3677) {
            if (class48.field384 == 1 || !Statics.field666 && class48.field384 == 4) {
                int var8 = field1024 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class48.field368 >= var8 && class48.field368 <= var8 + var10 && class48.field378 >= var9 && class48.field378 <= var9 + var11) {
                    method2618();
                    return;
                }
            }
            if (Statics.field1521 != null) {
                method2618();
            }
        }
        int var12 = class48.field384;
        int var13 = class48.field368;
        int var14 = class48.field378;
        if (var12 == 0) {
            var13 = class48.field389;
            var14 = class48.field370;
        }
        if (!Statics.field666 && var12 == 4) {
            var12 = 1;
        }
        if (field1035 == 0) {
            boolean var15 = false;
            while (Statics.method64()) {
                if (Statics.field1860 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field1432 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class45.method2094(client.method2470("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field1432 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field639 & 0x2000000) != 0) {
                    field1032 = "";
                    field1037 = class268.field3462;
                    field1038 = class268.field3366;
                    field1054 = class268.field3529;
                    field1035 = 1;
                    if (client.field678 && field1041 != null && field1041.length() > 0) {
                        field1045 = 1;
                    } else {
                        field1045 = 0;
                    }
                } else if ((client.field639 & 0x4) != 0) {
                    if ((client.field639 & 0x400) == 0) {
                        field1037 = class268.field3415;
                        field1038 = class268.field3454;
                        field1054 = class268.field3339;
                    } else {
                        field1037 = class268.field3336;
                        field1038 = class268.field3441;
                        field1054 = class268.field3461;
                    }
                    field1032 = class268.field3418;
                    field1035 = 1;
                    if (client.field678 && field1041 != null && field1041.length() > 0) {
                        field1045 = 1;
                    } else {
                        field1045 = 0;
                    }
                } else if ((client.field639 & 0x400) == 0) {
                    method61(false);
                } else {
                    field1037 = class268.field3456;
                    field1038 = class268.field3412;
                    field1054 = class268.field3458;
                    field1032 = class268.field3418;
                    field1035 = 1;
                    if (client.field678 && field1041 != null && field1041.length() > 0) {
                        field1045 = 1;
                    } else {
                        field1045 = 0;
                    }
                }
            }
        } else if (field1035 == 1) {
            while (true) {
                if (!Statics.method64()) {
                    int var19 = Statics.field1432 - 80;
                    short var20 = 321;
                    if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        method61(false);
                    }
                    int var21 = Statics.field1432 + 80;
                    if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        field1035 = 0;
                    }
                    break;
                }
                if (Statics.field1860 == 84) {
                    method61(false);
                } else if (Statics.field1860 == 13) {
                    field1035 = 0;
                }
            }
        } else if (field1035 == 2) {
            short var22 = 201;
            int var84 = var22 + 52;
            if (var12 == 1 && var14 >= var84 - 12 && var14 < var84 + 2) {
                field1045 = 0;
            }
            var84 += 15;
            if (var12 == 1 && var14 >= var84 - 12 && var14 < var84 + 2) {
                field1045 = 1;
            }
            var84 += 15;
            short var23 = 361;
            if (Statics.field1108 != null) {
                int var24 = Statics.field1108.field3911 / 2;
                if (var12 == 1 && var13 >= Statics.field1108.field3910 - var24 && var13 <= Statics.field1108.field3910 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(field1040) {
                        case 1:
                            method4400(class268.field3501, class268.field3502, class268.field3473);
                            field1035 = 5;
                            return;
                        case 2:
                            class45.method2094("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field1432 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1041 = field1041.trim();
                if (field1041.length() == 0) {
                    method4400(class268.field3354, class268.field3290, class268.field3356);
                    return;
                }
                if (field1053.length() == 0) {
                    method4400(class268.field3267, class268.field3358, class268.field3359);
                    return;
                }
                method4400(class268.field3467, class268.field3262, class268.field3469);
                client.method2608(false);
                client.method140(20);
                return;
            }
            int var27 = field1030 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1035 = 0;
                field1041 = "";
                field1053 = "";
                Statics.field54 = 0;
                Statics.field2921 = "";
                field1044 = true;
            }
            int var28 = Statics.field1432 + -117;
            short var29 = 277;
            field1042 = var13 >= var28 && var13 < Statics.field2288 + var28 && var14 >= var29 && var14 < Statics.field1938 + var29;
            if (var12 == 1 && field1042) {
                client.field678 = !client.field678;
                if (!client.field678 && Statics.field1804.field1330 != null) {
                    Statics.field1804.field1330 = null;
                    class103.method2073();
                }
            }
            int var30 = Statics.field1432 + 24;
            short var31 = 277;
            field1048 = var13 >= var30 && var13 < Statics.field2288 + var30 && var14 >= var31 && var14 < Statics.field1938 + var31;
            if (var12 == 1 && field1048) {
                Statics.field1804.field1333 = !Statics.field1804.field1333;
                if (!Statics.field1804.field1333) {
                    field1041 = "";
                    Statics.field1804.field1330 = null;
                    if (client.field678 && field1041 != null && field1041.length() > 0) {
                        field1045 = 1;
                    } else {
                        field1045 = 0;
                    }
                }
                class103.method2073();
            }
            while (true) {
                Transferable var35;
                int var36;
                do {
                    while (true) {
                        label748: do {
                            while (true) {
                                while (Statics.method64()) {
                                    if (Statics.field1860 == 13) {
                                        field1035 = 0;
                                        field1041 = "";
                                        field1053 = "";
                                        Statics.field54 = 0;
                                        Statics.field2921 = "";
                                        field1044 = true;
                                    } else {
                                        if (field1045 != 0) {
                                            continue label748;
                                        }
                                        char var32 = Statics.field3117;
                                        for (int var33 = 0; var33 < field1039.length() && var32 != field1039.charAt(var33); var33++) {
                                        }
                                        if (Statics.field1860 == 85 && field1041.length() > 0) {
                                            field1041 = field1041.substring(0, field1041.length() - 1);
                                        }
                                        if (Statics.field1860 == 84 || Statics.field1860 == 80) {
                                            field1045 = 1;
                                        }
                                        if (method286(Statics.field3117) && field1041.length() < 320) {
                                            field1041 = field1041 + Statics.field3117;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1045 != 1);
                        if (Statics.field1860 == 85 && field1053.length() > 0) {
                            field1053 = field1053.substring(0, field1053.length() - 1);
                        } else if (Statics.field1860 == 84 || Statics.field1860 == 80) {
                            field1045 = 0;
                            if (Statics.field1860 == 84) {
                                field1041 = field1041.trim();
                                if (field1041.length() == 0) {
                                    method4400(class268.field3354, class268.field3290, class268.field3356);
                                    return;
                                }
                                if (field1053.length() == 0) {
                                    method4400(class268.field3267, class268.field3358, class268.field3359);
                                    return;
                                }
                                method4400(class268.field3467, class268.field3262, class268.field3469);
                                client.method2608(false);
                                client.method140(20);
                                return;
                            }
                        }
                        if ((class39.field286[82] || class39.field286[87]) && Statics.field1860 == 67) {
                            Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var35 = var34.getContents(Statics.field204);
                            var36 = 20 - field1053.length();
                            break;
                        }
                        char var47 = Statics.field3117;
                        boolean var48;
                        if (var47 >= ' ' && var47 < 127 || var47 > 127 && var47 < 160 || var47 > 160 && var47 <= 255) {
                            var48 = true;
                        } else {
                            label979: {
                                if (var47 != 0) {
                                    char[] var49 = class302.field3741;
                                    for (int var50 = 0; var50 < var49.length; var50++) {
                                        char var51 = var49[var50];
                                        if (var47 == var51) {
                                            var48 = true;
                                            break label979;
                                        }
                                    }
                                }
                                var48 = false;
                            }
                        }
                        if (var48 && method286(Statics.field3117) && field1053.length() < 20) {
                            field1053 = field1053 + Statics.field3117;
                        }
                    }
                } while (var36 <= 0);
                try {
                    String var37 = (String) var35.getTransferData(DataFlavor.stringFlavor);
                    int var38 = Math.min(var36, var37.length());
                    for (int var39 = 0; var39 < var38; var39++) {
                        char var40 = var37.charAt(var39);
                        boolean var41;
                        if (var40 >= ' ' && var40 < 127 || var40 > 127 && var40 < 160 || var40 > 160 && var40 <= 255) {
                            var41 = true;
                        } else {
                            label980: {
                                if (var40 != 0) {
                                    char[] var42 = class302.field3741;
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        char var44 = var42[var43];
                                        if (var40 == var44) {
                                            var41 = true;
                                            break label980;
                                        }
                                    }
                                }
                                var41 = false;
                            }
                        }
                        if (!var41 || !method286(var37.charAt(var39))) {
                            field1035 = 3;
                            return;
                        }
                    }
                    field1053 = field1053 + var37.substring(0, var38);
                } catch (UnsupportedFlavorException var82) {
                } catch (IOException var83) {
                }
            }
        } else if (field1035 == 3) {
            int var52 = field1030 + 180;
            short var53 = 276;
            if (var12 == 1 && var13 >= var52 - 75 && var13 <= var52 + 75 && var14 >= var53 - 20 && var14 <= var53 + 20) {
                method61(false);
            }
            int var54 = field1030 + 180;
            short var55 = 326;
            if (var12 == 1 && var13 >= var54 - 75 && var13 <= var54 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                method4400(class268.field3501, class268.field3502, class268.field3473);
                field1035 = 5;
                return;
            }
        } else if (field1035 == 4) {
            int var56 = field1030 + 180 - 80;
            short var57 = 321;
            if (var12 == 1 && var13 >= var56 - 75 && var13 <= var56 + 75 && var14 >= var57 - 20 && var14 <= var57 + 20) {
                Statics.field2921.trim();
                if (Statics.field2921.length() != 6) {
                    method4400(class268.field3273, class268.field3274, class268.field3275);
                    return;
                }
                Statics.field54 = Integer.parseInt(Statics.field2921);
                Statics.field2921 = "";
                client.method2608(true);
                method4400(class268.field3467, class268.field3262, class268.field3469);
                client.method140(20);
                return;
            }
            if (var12 == 1 && var13 >= field1030 + 180 - 9 && var13 <= field1030 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field1044 = !field1044;
            }
            if (var12 == 1 && var13 >= field1030 + 180 - 34 && var13 <= field1030 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class45.method2094(client.method2470("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var58 = field1030 + 180 + 80;
            if (var12 == 1 && var13 >= var58 - 75 && var13 <= var58 + 75 && var14 >= var57 - 20 && var14 <= var57 + 20) {
                field1035 = 0;
                field1041 = "";
                field1053 = "";
                Statics.field54 = 0;
                Statics.field2921 = "";
            }
            while (Statics.method64()) {
                boolean var59 = false;
                for (int var60 = 0; var60 < field1052.length(); var60++) {
                    if (Statics.field3117 == field1052.charAt(var60)) {
                        var59 = true;
                        break;
                    }
                }
                if (Statics.field1860 == 13) {
                    field1035 = 0;
                    field1041 = "";
                    field1053 = "";
                    Statics.field54 = 0;
                    Statics.field2921 = "";
                } else {
                    if (Statics.field1860 == 85 && Statics.field2921.length() > 0) {
                        Statics.field2921 = Statics.field2921.substring(0, Statics.field2921.length() - 1);
                    }
                    if (Statics.field1860 == 84) {
                        Statics.field2921.trim();
                        if (Statics.field2921.length() != 6) {
                            method4400(class268.field3273, class268.field3274, class268.field3275);
                            return;
                        }
                        Statics.field54 = Integer.parseInt(Statics.field2921);
                        Statics.field2921 = "";
                        client.method2608(true);
                        method4400(class268.field3467, class268.field3262, class268.field3469);
                        client.method140(20);
                        return;
                    }
                    if (var59 && Statics.field2921.length() < 6) {
                        Statics.field2921 = Statics.field2921 + Statics.field3117;
                    }
                }
            }
        } else if (field1035 == 5) {
            int var61 = field1030 + 180 - 80;
            short var62 = 321;
            if (var12 == 1 && var13 >= var61 - 75 && var13 <= var61 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                method5222();
                return;
            }
            int var63 = field1030 + 180 + 80;
            if (var12 == 1 && var13 >= var63 - 75 && var13 <= var63 + 75 && var14 >= var62 - 20 && var14 <= var62 + 20) {
                method61(true);
            }
            short var64 = 361;
            if (Statics.field632 != null) {
                int var65 = Statics.field632.field3911 / 2;
                if (var12 == 1 && var13 >= Statics.field632.field3910 - var65 && var13 <= Statics.field632.field3910 + var65 && var14 >= var64 - 15 && var14 < var64) {
                    class45.method2094(client.method2470("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (Statics.method64()) {
                boolean var66 = false;
                for (int var67 = 0; var67 < field1039.length(); var67++) {
                    if (Statics.field3117 == field1039.charAt(var67)) {
                        var66 = true;
                        break;
                    }
                }
                if (Statics.field1860 == 13) {
                    method61(true);
                } else {
                    if (Statics.field1860 == 85 && field1041.length() > 0) {
                        field1041 = field1041.substring(0, field1041.length() - 1);
                    }
                    if (Statics.field1860 == 84) {
                        method5222();
                        return;
                    }
                    if (var66 && field1041.length() < 320) {
                        field1041 = field1041 + Statics.field3117;
                    }
                }
            }
        } else if (field1035 == 6) {
            while (true) {
                do {
                    if (!Statics.method64()) {
                        short var68 = 321;
                        if (var12 == 1 && var14 >= var68 - 20 && var14 <= var68 + 20) {
                            method61(true);
                        }
                        return;
                    }
                } while (Statics.field1860 != 84 && Statics.field1860 != 13);
                method61(true);
            }
        } else if (field1035 == 7) {
            int var69 = field1030 + 180 - 80;
            short var70 = 321;
            if (var12 == 1 && var13 >= var69 - 75 && var13 <= var69 + 75 && var14 >= var70 - 20 && var14 <= var70 + 20) {
                class45.method2094(client.method2470("secure", true) + "m=dob/set_dob.ws", true, false);
                method4400(class268.field3498, class268.field3460, class268.field3500);
                field1035 = 6;
                return;
            }
            int var71 = field1030 + 180 + 80;
            if (var12 == 1 && var13 >= var71 - 75 && var13 <= var71 + 75 && var14 >= var70 - 20 && var14 <= var70 + 20) {
                method61(true);
            }
        } else if (field1035 == 8) {
            int var72 = field1030 + 180 - 80;
            short var73 = 321;
            if (var12 == 1 && var13 >= var72 - 75 && var13 <= var72 + 75 && var14 >= var73 - 20 && var14 <= var73 + 20) {
                class45.method2094("https://www.jagex.com/terms/privacy", true, false);
                method4400(class268.field3498, class268.field3460, class268.field3500);
                field1035 = 6;
                return;
            }
            int var74 = field1030 + 180 + 80;
            if (var12 == 1 && var13 >= var74 - 75 && var13 <= var74 + 75 && var14 >= var73 - 20 && var14 <= var73 + 20) {
                method61(true);
            }
        } else if (field1035 == 12) {
            String var75 = "";
            switch(field1033) {
                case 0:
                    var75 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var75 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method61(false);
            }
            int var76 = field1030 + 180;
            short var77 = 276;
            if (var12 == 1 && var13 >= var76 - 75 && var13 <= var76 + 75 && var14 >= var77 - 20 && var14 <= var77 + 20) {
                class45.method2094(var75, true, false);
                method4400(class268.field3498, class268.field3460, class268.field3500);
                field1035 = 6;
                return;
            }
            int var78 = field1030 + 180;
            short var79 = 326;
            if (var12 == 1 && var13 >= var78 - 75 && var13 <= var78 + 75 && var14 >= var79 - 20 && var14 <= var79 + 20) {
                method61(false);
            }
        } else if (field1035 == 24) {
            int var80 = field1030 + 180;
            short var81 = 301;
            if (var12 == 1 && var13 >= var80 - 75 && var13 <= var80 + 75 && var14 >= var81 - 20 && var14 <= var81 + 20) {
                method61(false);
            }
        }
    }

    @ObfuscatedName("av.r(CI)Z")
    public static boolean method286(char arg0) {
        return field1039.indexOf(arg0) != -1;
    }

    @ObfuscatedName("s.b(ZB)V")
    public static void method61(boolean arg0) {
        field1037 = class268.field3449;
        field1038 = class268.field3450;
        field1054 = class268.field3451;
        field1035 = 2;
        if (arg0) {
            field1053 = "";
        }
        if (field1041 == null || field1041.length() <= 0) {
            if (Statics.field1804.field1330 == null) {
                client.field678 = false;
            } else {
                field1041 = Statics.field1804.field1330;
                client.field678 = true;
            }
        }
        if (client.field678 && field1041 != null && field1041.length() > 0) {
            field1045 = 1;
        } else {
            field1045 = 0;
        }
    }

    @ObfuscatedName("ll.d(I)V")
    public static void method5222() {
        field1041 = field1041.trim();
        if (field1041.length() == 0) {
            method4400(class268.field3501, class268.field3502, class268.field3473);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2470("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class383 var4 = new class383(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4155, var4.field4158, 1000 - var4.field4158);
                if (var5 == -1) {
                    var4.field4158 = 0;
                    long var8 = var4.method5971();
                    var6 = var8;
                    break;
                }
                var4.field4158 += var5;
                if (var4.field4158 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var53) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1041;
            Random var15 = new Random();
            class383 var16 = new class383(128);
            class383 var17 = new class383(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method6043(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method5951(var15.nextInt());
            }
            var16.method5951(var18[0]);
            var16.method5951(var18[1]);
            var16.method6174(var6);
            var16.method6174(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method5951(var15.nextInt());
            }
            var16.method5988(class81.field1007, class81.field1008);
            var17.method6043(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method5951(var15.nextInt());
            }
            var17.method6174(var15.nextLong());
            var17.method5952(var15.nextLong());
            if (client.field682 == null) {
                byte[] var22 = new byte[24];
                try {
                    class129.field1491.method5825(0L);
                    class129.field1491.method5827(var22);
                    int var23;
                    for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                    }
                    if (var23 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var52) {
                    for (int var25 = 0; var25 < 24; var25++) {
                        var22[var25] = -1;
                    }
                }
                var17.method5995(var22, 0, var22.length);
            } else {
                var17.method5995(client.field682, 0, client.field682.length);
            }
            var17.method6174(var15.nextLong());
            var17.method5988(class81.field1007, class81.field1008);
            int var28 = class383.method1863(var14);
            if (var28 % 8 != 0) {
                var28 += 8 - var28 % 8;
            }
            class383 var29 = new class383(var28);
            var29.method5955(var14);
            var29.field4158 = var28;
            var29.method6065(var18);
            class383 var30 = new class383(var29.field4158 + var17.field4158 + var16.field4158 + 5);
            var30.method6043(2);
            var30.method6043(var16.field4158);
            var30.method5995(var16.field4155, 0, var16.field4158);
            var30.method6043(var17.field4158);
            var30.method5995(var17.field4155, 0, var17.field4158);
            var30.method6166(var29.field4158);
            var30.method5995(var29.field4155, 0, var29.field4158);
            byte[] var31 = var30.field4155;
            int var32 = var31.length;
            StringBuilder var33 = new StringBuilder();
            for (int var34 = 0; var34 < var32; var34 += 3) {
                int var35 = var31[var34] & 0xFF;
                var33.append(class303.field3744[var35 >>> 2]);
                if (var34 < var32 - 1) {
                    int var36 = var31[var34 + 1] & 0xFF;
                    var33.append(class303.field3744[(var35 & 0x3) << 4 | var36 >>> 4]);
                    if (var34 < var32 - 2) {
                        int var37 = var31[var34 + 2] & 0xFF;
                        var33.append(class303.field3744[(var36 & 0xF) << 2 | var37 >>> 6]).append(class303.field3744[var37 & 0x3F]);
                    } else {
                        var33.append(class303.field3744[(var36 & 0xF) << 2]).append("=");
                    }
                } else {
                    var33.append(class303.field3744[(var35 & 0x3) << 4]).append("==");
                }
            }
            String var38 = var33.toString();
            String var40 = var38;
            byte var47;
            try {
                URL var41 = new URL(client.method2470("services", false) + "m=accountappeal/login.ws");
                URLConnection var42 = var41.openConnection();
                var42.setDoInput(true);
                var42.setDoOutput(true);
                var42.setConnectTimeout(5000);
                OutputStreamWriter var43 = new OutputStreamWriter(var42.getOutputStream());
                var43.write("data2=" + Statics.method2598(var40) + "&dest=" + Statics.method2598("passwordchoice.ws"));
                var43.flush();
                InputStream var44 = var42.getInputStream();
                class383 var45 = new class383(new byte[1000]);
                while (true) {
                    int var46 = var44.read(var45.field4155, var45.field4158, 1000 - var45.field4158);
                    if (var46 == -1) {
                        var43.close();
                        var44.close();
                        String var48 = new String(var45.field4155);
                        if (var48.startsWith("OFFLINE")) {
                            var47 = 4;
                        } else if (var48.startsWith("WRONG")) {
                            var47 = 7;
                        } else if (var48.startsWith("RELOAD")) {
                            var47 = 3;
                        } else if (var48.startsWith("Not permitted for social network accounts.")) {
                            var47 = 6;
                        } else {
                            var45.method5985(var18);
                            while (var45.field4158 > 0 && var45.field4155[var45.field4158 - 1] == 0) {
                                var45.field4158--;
                            }
                            String var49 = new String(var45.field4155, 0, var45.field4158);
                            if (class81.method1665(var49)) {
                                class45.method2094(var49, true, false);
                                var47 = 2;
                            } else {
                                var47 = 5;
                            }
                        }
                        break;
                    }
                    var45.field4158 += var46;
                    if (var45.field4158 >= 1000) {
                        var47 = 5;
                        break;
                    }
                }
            } catch (Throwable var51) {
                var51.printStackTrace();
                var47 = 5;
            }
            var13 = var47;
        }
        switch(var13) {
            case 2:
                method4400(class268.field3504, class268.field3505, class268.field3506);
                field1035 = 6;
                break;
            case 3:
                method4400(class268.field3507, class268.field3508, class268.field3509);
                break;
            case 4:
                method4400(class268.field3510, class268.field3360, class268.field3512);
                break;
            case 5:
                method4400(class268.field3268, class268.field3373, class268.field3515);
                break;
            case 6:
                method4400(class268.field3516, class268.field3517, class268.field3518);
                break;
            case 7:
                method4400(class268.field3519, class268.field3348, class268.field3340);
        }
    }

    @ObfuscatedName("by.s(Lkt;Lkt;Lkt;B)V")
    public static void method1562(class300 arg0, class300 arg1, class300 arg2) {
        field1024 = (Statics.field247 - 765) / 2;
        field1030 = field1024 + 202;
        Statics.field1432 = field1030 + 180;
        if (field1043) {
            if (Statics.field3914 == null) {
                Statics.field3914 = class397.method5866(Statics.field3632, "sl_back", "");
            }
            if (Statics.field212 == null) {
                class273 var3 = Statics.field3632;
                int var4 = var3.method4484("sl_flags");
                int var5 = var3.method4485(var4, "");
                class395[] var6 = class397.method2558(var3, var4, var5);
                Statics.field212 = var6;
            }
            if (Statics.field1751 == null) {
                class273 var7 = Statics.field3632;
                int var8 = var7.method4484("sl_arrows");
                int var9 = var7.method4485(var8, "");
                class395[] var10 = class397.method2558(var7, var8, var9);
                Statics.field1751 = var10;
            }
            if (Statics.field155 == null) {
                class273 var11 = Statics.field3632;
                int var12 = var11.method4484("sl_stars");
                int var13 = var11.method4485(var12, "");
                class395[] var14 = class397.method2558(var11, var12, var13);
                Statics.field155 = var14;
            }
            if (Statics.field168 == null) {
                Statics.field168 = class397.method2521(Statics.field3632, "leftarrow", "");
            }
            if (Statics.field2114 == null) {
                Statics.field2114 = class397.method2521(Statics.field3632, "rightarrow", "");
            }
            class392.method6265(field1024, 23, 765, 480, 0);
            class392.method6293(field1024, 0, 125, 23, 12425273, 9135624);
            class392.method6293(field1024 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4894(class268.field3266, field1024 + 62, 15, 0, -1);
            if (Statics.field155 != null) {
                Statics.field155[1].method6324(field1024 + 140, 1);
                arg1.method4891(class268.field3527, field1024 + 152, 10, 16777215, -1);
                Statics.field155[0].method6324(field1024 + 140, 12);
                arg1.method4891(class268.field3238, field1024 + 152, 21, 16777215, -1);
            }
            if (Statics.field1751 != null) {
                int var15 = field1024 + 280;
                if (class76.field928[0] == 0 && class76.field927[0] == 0) {
                    Statics.field1751[2].method6324(var15, 4);
                } else {
                    Statics.field1751[0].method6324(var15, 4);
                }
                if (class76.field928[0] == 0 && class76.field927[0] == 1) {
                    Statics.field1751[3].method6324(var15 + 15, 4);
                } else {
                    Statics.field1751[1].method6324(var15 + 15, 4);
                }
                arg0.method4891(class268.field3513, var15 + 32, 17, 16777215, -1);
                int var16 = field1024 + 390;
                if (class76.field928[0] == 1 && class76.field927[0] == 0) {
                    Statics.field1751[2].method6324(var16, 4);
                } else {
                    Statics.field1751[0].method6324(var16, 4);
                }
                if (class76.field928[0] == 1 && class76.field927[0] == 1) {
                    Statics.field1751[3].method6324(var16 + 15, 4);
                } else {
                    Statics.field1751[1].method6324(var16 + 15, 4);
                }
                arg0.method4891(class268.field3326, var16 + 32, 17, 16777215, -1);
                int var17 = field1024 + 500;
                if (class76.field928[0] == 2 && class76.field927[0] == 0) {
                    Statics.field1751[2].method6324(var17, 4);
                } else {
                    Statics.field1751[0].method6324(var17, 4);
                }
                if (class76.field928[0] == 2 && class76.field927[0] == 1) {
                    Statics.field1751[3].method6324(var17 + 15, 4);
                } else {
                    Statics.field1751[1].method6324(var17 + 15, 4);
                }
                arg0.method4891(class268.field3485, var17 + 32, 17, 16777215, -1);
                int var18 = field1024 + 610;
                if (class76.field928[0] == 3 && class76.field927[0] == 0) {
                    Statics.field1751[2].method6324(var18, 4);
                } else {
                    Statics.field1751[0].method6324(var18, 4);
                }
                if (class76.field928[0] == 3 && class76.field927[0] == 1) {
                    Statics.field1751[3].method6324(var18 + 15, 4);
                } else {
                    Statics.field1751[1].method6324(var18 + 15, 4);
                }
                arg0.method4891(class268.field3279, var18 + 32, 17, 16777215, -1);
            }
            class392.method6265(field1024 + 708, 4, 50, 16, 0);
            arg1.method4894(class268.field3483, field1024 + 708 + 25, 16, 16777215, -1);
            field1049 = -1;
            if (Statics.field3914 != null) {
                byte var19 = 88;
                byte var20 = 19;
                int var21 = 765 / (var19 + 1) - 1;
                int var22 = 480 / (var20 + 1);
                int var23;
                int var24;
                do {
                    var23 = var22;
                    var24 = var21;
                    if ((var21 - 1) * var22 >= class76.field925) {
                        var21--;
                    }
                    if ((var22 - 1) * var21 >= class76.field925) {
                        var22--;
                    }
                    if ((var22 - 1) * var21 >= class76.field925) {
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
                int var29 = (class76.field925 + var22 - 1) / var22;
                field1034 = var29 - var21;
                if (Statics.field168 != null && field1036 > 0) {
                    Statics.field168.method6324(8, Statics.field603 / 2 - Statics.field168.field4237 / 2);
                }
                if (Statics.field2114 != null && field1036 < field1034) {
                    Statics.field2114.method6324(Statics.field247 - Statics.field2114.field4243 - 8, Statics.field603 / 2 - Statics.field2114.field4237 / 2);
                }
                int var30 = var28 + 23;
                int var31 = field1024 + var27;
                int var32 = 0;
                boolean var33 = false;
                int var34 = field1036;
                for (int var35 = var22 * var34; var35 < class76.field925 && var34 - field1036 < var21; var35++) {
                    class76 var36 = Statics.field1133[var35];
                    boolean var37 = true;
                    String var38 = Integer.toString(var36.field926);
                    if (var36.field926 == -1) {
                        var38 = class268.field3533;
                        var37 = false;
                    } else if (var36.field926 > 1980) {
                        var38 = class268.field3380;
                        var37 = false;
                    }
                    int var39 = 0;
                    byte var40;
                    if (var36.method1475()) {
                        if (var36.method1454()) {
                            var40 = 7;
                        } else {
                            var40 = 6;
                        }
                    } else if (var36.method1458()) {
                        var39 = 16711680;
                        if (var36.method1454()) {
                            var40 = 5;
                        } else {
                            var40 = 4;
                        }
                    } else if (var36.method1460()) {
                        if (var36.method1454()) {
                            var40 = 9;
                        } else {
                            var40 = 8;
                        }
                    } else if (var36.method1456()) {
                        if (var36.method1454()) {
                            var40 = 3;
                        } else {
                            var40 = 2;
                        }
                    } else if (var36.method1454()) {
                        var40 = 1;
                    } else {
                        var40 = 0;
                    }
                    if (class48.field389 >= var31 && class48.field370 >= var30 && class48.field389 < var19 + var31 && class48.field370 < var20 + var30 && var37) {
                        field1049 = var35;
                        Statics.field3914[var40].method6359(var31, var30, 128, 16777215);
                        var33 = true;
                    } else {
                        Statics.field3914[var40].method6353(var31, var30);
                    }
                    if (Statics.field212 != null) {
                        Statics.field212[(var36.method1454() ? 8 : 0) + var36.field924].method6324(var31 + 29, var30);
                    }
                    arg0.method4894(Integer.toString(var36.field938), var31 + 15, var20 / 2 + var30 + 5, var39, -1);
                    arg1.method4894(var38, var31 + 60, var20 / 2 + var30 + 5, 268435455, -1);
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
                    int var41 = arg1.method4906(Statics.field1133[field1049].field933) + 6;
                    int var42 = arg1.field3730 + 8;
                    int var43 = class48.field370 + 25;
                    if (var42 + var43 > 480) {
                        var43 = class48.field370 - 25 - var42;
                    }
                    class392.method6265(class48.field389 - var41 / 2, var43, var41, var42, 16777120);
                    class392.method6254(class48.field389 - var41 / 2, var43, var41, var42, 0);
                    arg1.method4894(Statics.field1133[field1049].field933, class48.field389, arg1.field3730 + var43 + 4, 0, -1);
                }
            }
            Statics.field222.method371(0, 0);
            return;
        }
        Statics.field1027.method6353(field1024, 0);
        Statics.field172.method6353(field1024 + 382, 0);
        Statics.field4053.method6324(field1024 + 382 - Statics.field4053.field4243 / 2, 18);
        if (client.field646 == 0 || client.field646 == 5) {
            byte var44 = 20;
            arg0.method4894(class268.field3448, field1030 + 180, 245 - var44, 16777215, -1);
            int var45 = 253 - var44;
            class392.method6254(field1030 + 180 - 152, var45, 304, 34, 9179409);
            class392.method6254(field1030 + 180 - 151, var45 + 1, 302, 32, 0);
            class392.method6265(field1030 + 180 - 150, var45 + 2, field1031 * 3, 30, 9179409);
            class392.method6265(field1031 * 3 + (field1030 + 180 - 150), var45 + 2, 300 - field1031 * 3, 30, 0);
            arg0.method4894(field1050, field1030 + 180, 276 - var44, 16777215, -1);
        }
        if (client.field646 == 20) {
            Statics.field3197.method6324(field1030 + 180 - Statics.field3197.field4243 / 2, 271 - Statics.field3197.field4237 / 2);
            short var46 = 201;
            arg0.method4894(field1037, field1030 + 180, var46, 16776960, 0);
            int var123 = var46 + 15;
            arg0.method4894(field1038, field1030 + 180, var123, 16776960, 0);
            int var124 = var123 + 15;
            arg0.method4894(field1054, field1030 + 180, var124, 16776960, 0);
            int var125 = var124 + 15;
            int var126 = var125 + 7;
            if (field1035 != 4) {
                arg0.method4891(class268.field3361, field1030 + 180 - 110, var126, 16777215, 0);
                short var47 = 200;
                String var48 = Statics.field1804.field1333 ? class304.method53(field1041) : field1041;
                String var49;
                for (var49 = var48; arg0.method4906(var49) > var47; var49 = var49.substring(0, var49.length() - 1)) {
                }
                arg0.method4891(class301.method4890(var49), field1030 + 180 - 70, var126, 16777215, 0);
                var123 = var126 + 15;
                String var50;
                for (var50 = class304.method53(field1053); arg0.method4906(var50) > var47; var50 = var50.substring(1)) {
                }
                arg0.method4891(class268.field3477 + var50, field1030 + 180 - 108, var123, 16777215, 0);
                var123 += 15;
            }
        }
        if (client.field646 == 10 || client.field646 == 11) {
            Statics.field3197.method6324(field1030, 171);
            if (field1035 == 0) {
                short var51 = 251;
                arg0.method4894(class268.field3479, field1030 + 180, var51, 16776960, 0);
                int var127 = var51 + 30;
                int var52 = field1030 + 180 - 80;
                short var53 = 291;
                Statics.field1026.method6324(var52 - 73, var53 - 20);
                arg0.method4905(class268.field3245, var52 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var54 = field1030 + 180 + 80;
                Statics.field1026.method6324(var54 - 73, var53 - 20);
                arg0.method4905(class268.field3481, var54 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1035 == 1) {
                arg0.method4894(field1032, field1030 + 180, 201, 16776960, 0);
                short var55 = 236;
                arg0.method4894(field1037, field1030 + 180, var55, 16777215, 0);
                int var128 = var55 + 15;
                arg0.method4894(field1038, field1030 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                arg0.method4894(field1054, field1030 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                int var56 = field1030 + 180 - 80;
                short var57 = 321;
                Statics.field1026.method6324(var56 - 73, var57 - 20);
                arg0.method4894(class268.field3240, var56, var57 + 5, 16777215, 0);
                int var58 = field1030 + 180 + 80;
                Statics.field1026.method6324(var58 - 73, var57 - 20);
                arg0.method4894(class268.field3483, var58, var57 + 5, 16777215, 0);
            } else if (field1035 == 2) {
                short var59 = 201;
                arg0.method4894(field1037, Statics.field1432, var59, 16776960, 0);
                int var131 = var59 + 15;
                arg0.method4894(field1038, Statics.field1432, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg0.method4894(field1054, Statics.field1432, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var134 = var133 + 7;
                arg0.method4891(class268.field3361, Statics.field1432 - 110, var134, 16777215, 0);
                short var60 = 200;
                String var61;
                for (var61 = Statics.method1895(); arg0.method4906(var61) > var60; var61 = var61.substring(1)) {
                }
                arg0.method4891(class301.method4890(var61) + (field1045 == 0 & client.field650 % 40 < 20 ? class106.method348(16776960) + class106.field1349 : ""), Statics.field1432 - 70, var134, 16777215, 0);
                var131 = var134 + 15;
                String var62;
                for (var62 = class304.method53(field1053); arg0.method4906(var62) > var60; var62 = var62.substring(1)) {
                }
                arg0.method4891(class268.field3477 + var62 + (field1045 == 1 & client.field650 % 40 < 20 ? class106.method348(16776960) + class106.field1349 : ""), Statics.field1432 - 108, var131, 16777215, 0);
                var131 += 15;
                short var63 = 277;
                int var64 = Statics.field1432 + -117;
                boolean var65 = client.field678;
                boolean var66 = field1042;
                class395 var67 = var65 ? (var66 ? Statics.field34 : Statics.field3660) : (var66 ? Statics.field554 : Statics.field952);
                var67.method6324(var64, var63);
                int var69 = var67.field4243 + 5 + var64;
                arg1.method4891(class268.field3349, var69, var63 + 13, 16776960, 0);
                int var70 = Statics.field1432 + 24;
                class395 var71 = method1808(Statics.field1804.field1333, field1048);
                var71.method6324(var70, var63);
                int var72 = var71.field4243 + 5 + var70;
                arg1.method4891(class268.field3528, var72, var63 + 13, 16776960, 0);
                int var135 = var63 + 15;
                int var73 = Statics.field1432 - 80;
                short var74 = 321;
                Statics.field1026.method6324(var73 - 73, var74 - 20);
                arg0.method4894(class268.field3452, var73, var74 + 5, 16777215, 0);
                int var75 = Statics.field1432 + 80;
                Statics.field1026.method6324(var75 - 73, var74 - 20);
                arg0.method4894(class268.field3483, var75, var74 + 5, 16777215, 0);
                short var76 = 357;
                switch(field1040) {
                    case 2:
                        Statics.field2886 = class268.field3497;
                        break;
                    default:
                        Statics.field2886 = class268.field3495;
                }
                Statics.field1108 = new class337(Statics.field1432, var76, arg1.method4906(Statics.field2886), 11);
                Statics.field632 = new class337(Statics.field1432, var76, arg1.method4906(class268.field3496), 11);
                arg1.method4894(Statics.field2886, Statics.field1432, var76, 16777215, 0);
            } else if (field1035 == 3) {
                short var77 = 201;
                arg0.method4894(class268.field3486, field1030 + 180, var77, 16776960, 0);
                int var136 = var77 + 20;
                arg1.method4894(class268.field3487, field1030 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg1.method4894(class268.field3421, field1030 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var78 = field1030 + 180;
                short var79 = 276;
                Statics.field1026.method6324(var78 - 73, var79 - 20);
                arg2.method4894(class268.field3489, var78, var79 + 5, 16777215, 0);
                int var80 = field1030 + 180;
                short var81 = 326;
                Statics.field1026.method6324(var80 - 73, var81 - 20);
                arg2.method4894(class268.field3514, var80, var81 + 5, 16777215, 0);
            } else if (field1035 == 4) {
                arg0.method4894(class268.field3465, field1030 + 180, 201, 16776960, 0);
                short var82 = 236;
                arg0.method4894(field1037, field1030 + 180, var82, 16777215, 0);
                int var139 = var82 + 15;
                arg0.method4894(field1038, field1030 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method4894(field1054, field1030 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                arg0.method4891(class268.field3478 + class304.method53(Statics.field2921) + (client.field650 % 40 < 20 ? class106.method348(16776960) + class106.field1349 : ""), field1030 + 180 - 108, var141, 16777215, 0);
                int var142 = var141 - 8;
                arg0.method4891(class268.field3425, field1030 + 180 - 9, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg0.method4891(class268.field3244, field1030 + 180 - 9, var143, 16776960, 0);
                int var83 = field1030 + 180 - 9 + arg0.method4906(class268.field3244) + 15;
                int var84 = var143 - arg0.field3730;
                class395 var85;
                if (field1044) {
                    var85 = Statics.field3660;
                } else {
                    var85 = Statics.field952;
                }
                var85.method6324(var83, var84);
                var139 = var143 + 15;
                int var86 = field1030 + 180 - 80;
                short var87 = 321;
                Statics.field1026.method6324(var86 - 73, var87 - 20);
                arg0.method4894(class268.field3240, var86, var87 + 5, 16777215, 0);
                int var88 = field1030 + 180 + 80;
                Statics.field1026.method6324(var88 - 73, var87 - 20);
                arg0.method4894(class268.field3483, var88, var87 + 5, 16777215, 0);
                arg1.method4894(class268.field3466, field1030 + 180, var87 + 36, 255, 0);
            } else if (field1035 == 5) {
                arg0.method4894(class268.field3491, field1030 + 180, 201, 16776960, 0);
                short var89 = 221;
                arg2.method4894(field1037, field1030 + 180, var89, 16776960, 0);
                int var144 = var89 + 15;
                arg2.method4894(field1038, field1030 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg2.method4894(field1054, field1030 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var147 = var146 + 14;
                arg0.method4891(class268.field3492, field1030 + 180 - 145, var147, 16777215, 0);
                short var90 = 174;
                String var91;
                for (var91 = Statics.method1895(); arg0.method4906(var91) > var90; var91 = var91.substring(1)) {
                }
                arg0.method4891(class301.method4890(var91) + (client.field650 % 40 < 20 ? class106.method348(16776960) + class106.field1349 : ""), field1030 + 180 - 34, var147, 16777215, 0);
                var144 = var147 + 15;
                int var92 = field1030 + 180 - 80;
                short var93 = 321;
                Statics.field1026.method6324(var92 - 73, var93 - 20);
                arg0.method4894(class268.field3493, var92, var93 + 5, 16777215, 0);
                int var94 = field1030 + 180 + 80;
                Statics.field1026.method6324(var94 - 73, var93 - 20);
                arg0.method4894(class268.field3494, var94, var93 + 5, 16777215, 0);
                short var95 = 356;
                arg1.method4894(class268.field3496, Statics.field1432, var95, 268435455, 0);
            } else if (field1035 == 6) {
                short var96 = 201;
                arg0.method4894(field1037, field1030 + 180, var96, 16776960, 0);
                int var148 = var96 + 15;
                arg0.method4894(field1038, field1030 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg0.method4894(field1054, field1030 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                int var97 = field1030 + 180;
                short var98 = 321;
                Statics.field1026.method6324(var97 - 73, var98 - 20);
                arg0.method4894(class268.field3494, var97, var98 + 5, 16777215, 0);
            } else if (field1035 == 7) {
                short var99 = 216;
                arg0.method4894(class268.field3345, field1030 + 180, var99, 16776960, 0);
                int var151 = var99 + 15;
                arg2.method4894(class268.field3243, field1030 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg2.method4894(class268.field3534, field1030 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var100 = field1030 + 180 - 80;
                short var101 = 321;
                Statics.field1026.method6324(var100 - 73, var101 - 20);
                arg0.method4894(class268.field3327, var100, var101 + 5, 16777215, 0);
                int var102 = field1030 + 180 + 80;
                Statics.field1026.method6324(var102 - 73, var101 - 20);
                arg0.method4894(class268.field3494, var102, var101 + 5, 16777215, 0);
            } else if (field1035 == 8) {
                short var103 = 216;
                arg0.method4894(class268.field3372, field1030 + 180, var103, 16776960, 0);
                int var154 = var103 + 15;
                arg2.method4894(class268.field3405, field1030 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg2.method4894(class268.field3526, field1030 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var104 = field1030 + 180 - 80;
                short var105 = 321;
                Statics.field1026.method6324(var104 - 73, var105 - 20);
                arg0.method4894(class268.field3375, var104, var105 + 5, 16777215, 0);
                int var106 = field1030 + 180 + 80;
                Statics.field1026.method6324(var106 - 73, var105 - 20);
                arg0.method4894(class268.field3494, var106, var105 + 5, 16777215, 0);
            } else if (field1035 == 12) {
                short var107 = 201;
                String var108 = "";
                String var109 = "";
                String var110 = "";
                switch(field1033) {
                    case 0:
                        var108 = class268.field3288;
                        var109 = class268.field3307;
                        var110 = class268.field3304;
                        break;
                    case 1:
                        var108 = class268.field3523;
                        var109 = class268.field3328;
                        var110 = class268.field3329;
                        break;
                    default:
                        method61(false);
                }
                arg0.method4894(var108, field1030 + 180, var107, 16776960, 0);
                int var157 = var107 + 15;
                arg2.method4894(var109, field1030 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                arg2.method4894(var110, field1030 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                int var111 = field1030 + 180;
                short var112 = 276;
                Statics.field1026.method6324(var111 - 73, var112 - 20);
                arg0.method4894(class268.field3272, var111, var112 + 5, 16777215, 0);
                int var113 = field1030 + 180;
                short var114 = 326;
                Statics.field1026.method6324(var113 - 73, var114 - 20);
                arg0.method4894(class268.field3494, var113, var114 + 5, 16777215, 0);
            } else if (field1035 == 24) {
                short var115 = 221;
                arg0.method4894(field1037, field1030 + 180, var115, 16777215, 0);
                int var160 = var115 + 15;
                arg0.method4894(field1038, field1030 + 180, var160, 16777215, 0);
                int var161 = var160 + 15;
                arg0.method4894(field1054, field1030 + 180, var161, 16777215, 0);
                int var162 = var161 + 15;
                int var116 = field1030 + 180;
                short var117 = 301;
                Statics.field1026.method6324(var116 - 73, var117 - 20);
                arg0.method4894(class268.field3378, var116, var117 + 5, 16777215, 0);
            }
        }
        if (client.field646 >= 10) {
            int[] var118 = new int[4];
            class392.method6239(var118);
            class392.method6277(field1024, 0, field1024 + 765, Statics.field603);
            Statics.field210.method2020(field1024 - 22, client.field650);
            Statics.field210.method2020(field1024 + 765 + 22 - 128, client.field650);
            class392.method6273(var118);
        }
        Statics.field550[Statics.field1804.field1328 ? 1 : 0].method6324(field1024 + 765 - 40, 463);
        if (client.field646 <= 5 || Statics.field4141 != class290.field3677) {
            return;
        }
        if (Statics.field598 == null) {
            Statics.field598 = class397.method2521(Statics.field3632, "sl_button", "");
            return;
        }
        int var119 = field1024 + 5;
        short var120 = 463;
        byte var121 = 100;
        byte var122 = 35;
        Statics.field598.method6324(var119, var120);
        arg0.method4894(class268.field3403 + " " + client.field638, var121 / 2 + var119, var122 / 2 + var120 - 2, 16777215, 0);
        if (Statics.field1521 == null) {
            arg1.method4894(class268.field3536, var121 / 2 + var119, var122 / 2 + var120 + 12, 16777215, 0);
        } else {
            arg1.method4894(class268.field3535, var121 / 2 + var119, var122 / 2 + var120 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ji.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method4400(String arg0, String arg1, String arg2) {
        field1037 = arg0;
        field1038 = arg1;
        field1054 = arg2;
    }

    @ObfuscatedName("z.l(Laf;B)V")
    public static void method165(class47 arg0) {
        while (Statics.method64()) {
            if (Statics.field1860 == 13) {
                field1043 = false;
                Statics.field1027.method6353(field1024, 0);
                Statics.field172.method6353(field1024 + 382, 0);
                Statics.field4053.method6324(field1024 + 382 - Statics.field4053.field4243 / 2, 18);
                return;
            }
            if (Statics.field1860 == 96) {
                if (field1036 > 0 && Statics.field168 != null) {
                    field1036--;
                }
            } else if (Statics.field1860 == 97 && field1036 < field1034 && Statics.field2114 != null) {
                field1036++;
            }
        }
        if (class48.field384 != 1 && Statics.field666 || class48.field384 != 4) {
            return;
        }
        int var1 = field1024 + 280;
        if (class48.field368 >= var1 && class48.field368 <= var1 + 14 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(0, 0);
            return;
        }
        if (class48.field368 >= var1 + 15 && class48.field368 <= var1 + 80 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(0, 1);
            return;
        }
        int var2 = field1024 + 390;
        if (class48.field368 >= var2 && class48.field368 <= var2 + 14 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(1, 0);
            return;
        }
        if (class48.field368 >= var2 + 15 && class48.field368 <= var2 + 80 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(1, 1);
            return;
        }
        int var3 = field1024 + 500;
        if (class48.field368 >= var3 && class48.field368 <= var3 + 14 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(2, 0);
            return;
        }
        if (class48.field368 >= var3 + 15 && class48.field368 <= var3 + 80 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(2, 1);
            return;
        }
        int var4 = field1024 + 610;
        if (class48.field368 >= var4 && class48.field368 <= var4 + 14 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(3, 0);
            return;
        }
        if (class48.field368 >= var4 + 15 && class48.field368 <= var4 + 80 && class48.field378 >= 4 && class48.field378 <= 18) {
            class76.method343(3, 1);
            return;
        }
        if (class48.field368 >= field1024 + 708 && class48.field378 >= 4 && class48.field368 <= field1024 + 708 + 50 && class48.field378 <= 20) {
            field1043 = false;
            Statics.field1027.method6353(field1024, 0);
            Statics.field172.method6353(field1024 + 382, 0);
            Statics.field4053.method6324(field1024 + 382 - Statics.field4053.field4243 / 2, 18);
            return;
        }
        if (field1049 != -1) {
            class76 var5 = Statics.field1133[field1049];
            method6(var5);
            field1043 = false;
            Statics.field1027.method6353(field1024, 0);
            Statics.field172.method6353(field1024 + 382, 0);
            Statics.field4053.method6324(field1024 + 382 - Statics.field4053.field4243 / 2, 18);
            return;
        }
        if (field1036 > 0 && Statics.field168 != null && class48.field368 >= 0 && class48.field368 <= Statics.field168.field4243 && class48.field378 >= Statics.field603 / 2 - 50 && class48.field378 <= Statics.field603 / 2 + 50) {
            field1036--;
        }
        if (field1036 < field1034 && Statics.field2114 != null && class48.field368 >= Statics.field247 - Statics.field2114.field4243 - 5 && class48.field368 <= Statics.field247 && class48.field378 >= Statics.field603 / 2 - 50 && class48.field378 <= Statics.field603 / 2 + 50) {
            field1036++;
        }
    }

    @ObfuscatedName("v.o(Lbg;I)V")
    public static void method6(class76 arg0) {
        if (arg0.method1454() != client.field641) {
            client.field641 = arg0.method1454();
            class155.method4395(arg0.method1454());
        }
        if (client.field639 != arg0.field934) {
            method4612(Statics.field3632, arg0.field934);
        }
        Statics.field1004 = arg0.field929;
        client.field638 = arg0.field938;
        client.field639 = arg0.field934;
        Statics.field1931 = client.field851 == 0 ? 43594 : arg0.field938 + 40000;
        Statics.field3630 = client.field851 == 0 ? 443 : arg0.field938 + 50000;
        Statics.field3948 = Statics.field1931;
    }

    @ObfuscatedName("af.c(II)V")
    public static void method473(int arg0) {
        field1035 = 12;
        field1033 = arg0;
    }

    @ObfuscatedName("ee.e(I)V")
    public static void method2618() {
        if (class76.method687()) {
            field1043 = true;
            field1036 = 0;
            field1034 = 0;
        }
    }

    @ObfuscatedName("fg.g(B)V")
    public static void method3284() {
        field1035 = 24;
        method4400(class268.field3470, class268.field3476, class268.field3472);
    }

    @ObfuscatedName("fp.a(I)V")
    public static void method2973() {
        field1035 = 24;
        method4400(class268.field3293, class268.field3413, class268.field3475);
    }
}
