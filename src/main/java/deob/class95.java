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

@ObfuscatedName("cx")
public class class95 {

    @ObfuscatedName("cx.s")
    public static int field1223 = 0;

    @ObfuscatedName("cx.j")
    public static int field1207 = field1223 + 202;

    @ObfuscatedName("cx.u")
    public static int field1209 = 10;

    @ObfuscatedName("cx.p")
    public static String field1212 = "";

    @ObfuscatedName("cx.ae")
    public static int field1211 = -1;

    @ObfuscatedName("cx.ap")
    public static int field1214 = 1;

    @ObfuscatedName("cx.at")
    public static int field1205 = 0;

    @ObfuscatedName("cx.aq")
    public static String field1230 = "";

    @ObfuscatedName("cx.al")
    public static String field1217 = "";

    @ObfuscatedName("cx.ah")
    public static String field1218 = "";

    @ObfuscatedName("cx.av")
    public static String field1236 = "";

    @ObfuscatedName("cx.ax")
    public static String field1220 = "";

    @ObfuscatedName("cx.as")
    public static String field1221 = "";

    @ObfuscatedName("cx.af")
    public static boolean field1225 = false;

    @ObfuscatedName("cx.ak")
    public static boolean field1202 = false;

    @ObfuscatedName("cx.bc")
    public static boolean field1224 = true;

    @ObfuscatedName("cx.bz")
    public static int field1203 = 0;

    @ObfuscatedName("cx.bj")
    public static String field1226 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cx.bh")
    public static String field1227 = "1234567890";

    @ObfuscatedName("cx.bg")
    public static boolean field1228 = false;

    @ObfuscatedName("cx.bm")
    public static int field1208 = -1;

    @ObfuscatedName("cx.bd")
    public static int field1219 = 0;

    @ObfuscatedName("cx.bb")
    public static int field1232 = 0;

    @ObfuscatedName("cx.bq")
    public static long field1233;

    @ObfuscatedName("cx.by")
    public static long field1234;

    static {
        new DecimalFormat("##0.00");
        new class172();
        field1233 = -1L;
        field1234 = -1L;
    }

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lt.z(Lic;Lic;ZII)V")
    public static void method5573(class244 arg0, class244 arg1, boolean arg2, int arg3) {
        if (!Statics.field1216) {
            field1205 = arg3;
            class331.method5657();
            byte[] var4 = arg0.method3893("title.jpg", "");
            Statics.field3853 = class59.method982(var4);
            Statics.field1204 = Statics.field3853.method5784();
            if ((client.field781 & 0x20000000) != 0) {
                Statics.field2525 = class336.method3851(arg1, "logo_deadman_mode", "");
            } else if ((client.field781 & 0x40000000) == 0) {
                Statics.field2525 = class336.method3851(arg1, "logo", "");
            } else {
                Statics.field2525 = class336.method3851(arg1, "logo_seasonal_mode", "");
            }
            Statics.field3667 = class336.method3851(arg1, "titlebox", "");
            Statics.field1904 = class336.method3851(arg1, "titlebutton", "");
            int var5 = arg1.method3909("runes");
            int var6 = arg1.method3927(var5, "");
            class334[] var7 = class336.method3244(arg1, var5, var6);
            Statics.field85 = var7;
            int var8 = arg1.method3909("title_mute");
            int var9 = arg1.method3927(var8, "");
            class334[] var10 = class336.method3244(arg1, var8, var9);
            Statics.field1093 = var10;
            Statics.field2751 = class336.method3851(arg1, "options_radio_buttons,0", "");
            Statics.field3135 = class336.method3851(arg1, "options_radio_buttons,4", "");
            Statics.field2425 = class336.method3851(arg1, "options_radio_buttons,2", "");
            Statics.field1222 = class336.method3851(arg1, "options_radio_buttons,6", "");
            Statics.field115 = Statics.field2751.field3893;
            Statics.field1365 = Statics.field2751.field3898;
            Statics.field1297 = new class82(Statics.field85);
            if (arg2) {
                field1220 = "";
                field1221 = "";
            }
            Statics.field1071 = 0;
            Statics.field140 = "";
            field1224 = true;
            field1228 = false;
            if (Statics.field1694.field1084) {
                class207.method771(2);
            } else {
                class246 var11 = Statics.field2133;
                int var12 = var11.method3909("scape main");
                int var13 = var11.method3927(var12, "");
                class207.field2438 = 1;
                Statics.field2421 = var11;
                Statics.field2035 = var12;
                Statics.field2439 = var13;
                Statics.field523 = 255;
                Statics.field2440 = false;
                Statics.field1923 = 2;
            }
            if (Statics.field3195 != null) {
                try {
                    class310 var14 = new class310(4);
                    var14.method5177(3);
                    var14.method5351(0);
                    Statics.field3195.method3315(var14.field3731, 0, 4);
                } catch (IOException var18) {
                    try {
                        Statics.field3195.method3308();
                    } catch (Exception var17) {
                    }
                    class247.field3194++;
                    Statics.field3195 = null;
                }
            }
            Statics.field1216 = true;
            field1223 = (Statics.field1642 - 765) / 2;
            field1207 = field1223 + 202;
            Statics.field3923 = field1207 + 180;
            Statics.field3853.method5770(field1223, 0);
            Statics.field1204.method5770(field1223 + 382, 0);
            Statics.field2525.method5737(field1223 + 382 - Statics.field2525.field3893 / 2, 18);
        } else if (arg3 == 4) {
            field1205 = 4;
        }
    }

    @ObfuscatedName("ba.s(B)V")
    public static void method1048() {
        if (field1220 != null && field1220.length() > 0) {
            return;
        }
        if (Statics.field1694.field1086 == null) {
            client.field678 = false;
        } else {
            field1220 = Statics.field1694.field1086;
            client.field678 = true;
        }
    }

    @ObfuscatedName("hy.t(B)V")
    public static void method3850() {
        if (!Statics.field1216) {
            return;
        }
        Statics.field3667 = null;
        Statics.field1904 = null;
        Statics.field85 = null;
        Statics.field3853 = null;
        Statics.field1204 = null;
        Statics.field2525 = null;
        Statics.field1093 = null;
        Statics.field2751 = null;
        Statics.field2425 = null;
        Statics.field2469 = null;
        Statics.field317 = null;
        Statics.field2491 = null;
        Statics.field1229 = null;
        Statics.field37 = null;
        Statics.field1297.method1735();
        class207.method771(2);
        if (Statics.field3195 != null) {
            try {
                class310 var0 = new class310(4);
                var0.method5177(2);
                var0.method5351(0);
                Statics.field3195.method3315(var0.field3731, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field3195.method3308();
                } catch (Exception var3) {
                }
                class247.field3194++;
                Statics.field3195 = null;
            }
        }
        Statics.field1216 = false;
    }

    @ObfuscatedName("t.i(Lbw;I)V")
    public static void method40(class63 arg0) {
        if (field1228) {
            method3859(arg0);
            return;
        }
        if ((class64.field496 == 1 || !Statics.field587 && class64.field496 == 4) && class64.field512 >= field1223 + 765 - 50 && class64.field513 >= 453) {
            Statics.field1694.field1084 = !Statics.field1694.field1084;
            class83.method658();
            if (Statics.field1694.field1084) {
                Statics.field2437.method3499();
                class207.field2438 = 1;
                Statics.field2421 = null;
            } else {
                class246 var1 = Statics.field2133;
                int var2 = var1.method3909("scape main");
                int var3 = var1.method3927(var2, "");
                class207.method2136(var1, var2, var3, 255, false);
            }
        }
        if (client.field707 == 5) {
            return;
        }
        if (field1233 == -1L) {
            field1233 = class307.method2184() + 1000L;
        }
        long var4 = class307.method2184();
        if (client.method173() && field1234 == -1L) {
            field1234 = var4;
            if (field1234 > field1233) {
                field1233 = field1234;
            }
        }
        if (client.field707 != 10 && client.field707 != 11) {
            return;
        }
        if (Statics.field441 == class200.field2386) {
            if (class64.field496 == 1 || !Statics.field587 && class64.field496 == 4) {
                int var6 = field1223 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class64.field512 >= var6 && class64.field512 <= var6 + var8 && class64.field513 >= var7 && class64.field513 <= var7 + var9) {
                    if (class81.method1049()) {
                        field1228 = true;
                        field1219 = 0;
                        field1232 = 0;
                    }
                    return;
                }
            }
            if (Statics.field370 != null && class81.method1049()) {
                field1228 = true;
                field1219 = 0;
                field1232 = 0;
            }
        }
        int var10 = class64.field496;
        int var11 = class64.field512;
        int var12 = class64.field513;
        if (var10 == 0) {
            var11 = class64.field504;
            var12 = class64.field505;
        }
        if (!Statics.field587 && var10 == 4) {
            var10 = 1;
        }
        if (field1205 == 0) {
            boolean var13 = false;
            while (class55.method801()) {
                if (Statics.field2582 == 84) {
                    var13 = true;
                }
            }
            int var14 = Statics.field3923 - 80;
            short var15 = 291;
            if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                class61.method4704(client.method4179("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var16 = Statics.field3923 + 80;
            if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                if ((client.field781 & 0x2000000) != 0) {
                    field1230 = "";
                    field1217 = class234.field3026;
                    field1218 = class234.field3027;
                    field1236 = class234.field3028;
                    field1205 = 1;
                    if (client.field678 && field1220 != null && field1220.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                } else if ((client.field781 & 0x4) != 0) {
                    if ((client.field781 & 0x400) == 0) {
                        field1217 = class234.field3017;
                        field1218 = class234.field3018;
                        field1236 = class234.field2995;
                    } else {
                        field1217 = class234.field2994;
                        field1218 = class234.field3024;
                        field1236 = class234.field3025;
                    }
                    field1230 = class234.field2933;
                    field1205 = 1;
                    if (client.field678 && field1220 != null && field1220.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                } else if ((client.field781 & 0x400) == 0) {
                    method547(false);
                } else {
                    field1217 = class234.field3020;
                    field1218 = class234.field3021;
                    field1236 = class234.field3022;
                    field1230 = class234.field2933;
                    field1205 = 1;
                    if (client.field678 && field1220 != null && field1220.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                }
            }
        } else if (field1205 == 1) {
            while (true) {
                if (!class55.method801()) {
                    int var17 = Statics.field3923 - 80;
                    short var18 = 321;
                    if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                        method547(false);
                    }
                    int var19 = Statics.field3923 + 80;
                    if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                        field1205 = 0;
                    }
                    break;
                }
                if (Statics.field2582 == 84) {
                    method547(false);
                } else if (Statics.field2582 == 13) {
                    field1205 = 0;
                }
            }
        } else if (field1205 == 2) {
            short var20 = 201;
            int var136 = var20 + 52;
            if (var10 == 1 && var12 >= var136 - 12 && var12 < var136 + 2) {
                field1203 = 0;
            }
            var136 += 15;
            if (var10 == 1 && var12 >= var136 - 12 && var12 < var136 + 2) {
                field1203 = 1;
            }
            var136 += 15;
            short var21 = 361;
            if (Statics.field113 != null) {
                int var22 = Statics.field113.field3871 / 2;
                if (var10 == 1 && var11 >= Statics.field113.field3874 - var22 && var11 <= Statics.field113.field3874 + var22 && var12 >= var21 - 15 && var12 < var21) {
                    switch(field1214) {
                        case 1:
                            method3154(class234.field3065, class234.field3066, class234.field3096);
                            field1205 = 5;
                            return;
                        case 2:
                            class61.method4704("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var23 = Statics.field3923 - 80;
            short var24 = 321;
            if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                field1220 = field1220.trim();
                if (field1220.length() == 0) {
                    method3154(class234.field2918, class234.field2919, class234.field2920);
                    return;
                }
                if (field1221.length() == 0) {
                    method3154(class234.field2921, class234.field3003, class234.field2923);
                    return;
                }
                method3154(class234.field3031, class234.field3032, class234.field3033);
                client.method211(false);
                client.method3372(20);
                return;
            }
            int var25 = field1207 + 180 + 80;
            if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                field1205 = 0;
                field1220 = "";
                field1221 = "";
                Statics.field1071 = 0;
                Statics.field140 = "";
                field1224 = true;
            }
            int var26 = Statics.field3923 + -117;
            short var27 = 277;
            field1225 = var11 >= var26 && var11 < Statics.field115 + var26 && var12 >= var27 && var12 < Statics.field1365 + var27;
            if (var10 == 1 && field1225) {
                client.field678 = !client.field678;
                if (!client.field678 && Statics.field1694.field1086 != null) {
                    Statics.field1694.field1086 = null;
                    class83.method658();
                }
            }
            int var28 = Statics.field3923 + 24;
            short var29 = 277;
            field1202 = var11 >= var28 && var11 < Statics.field115 + var28 && var12 >= var29 && var12 < Statics.field1365 + var29;
            if (var10 == 1 && field1202) {
                Statics.field1694.field1091 = !Statics.field1694.field1091;
                if (!Statics.field1694.field1091) {
                    field1220 = "";
                    Statics.field1694.field1086 = null;
                    if (client.field678 && field1220 != null && field1220.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                }
                class83.method658();
            }
            label1017: while (true) {
                Transferable var35;
                int var36;
                do {
                    while (true) {
                        label981: do {
                            while (true) {
                                while (class55.method801()) {
                                    if (Statics.field2582 == 13) {
                                        field1205 = 0;
                                        field1220 = "";
                                        field1221 = "";
                                        Statics.field1071 = 0;
                                        Statics.field140 = "";
                                        field1224 = true;
                                    } else {
                                        if (field1203 != 0) {
                                            continue label981;
                                        }
                                        char var30 = Statics.field1351;
                                        for (int var31 = 0; var31 < field1226.length() && var30 != field1226.charAt(var31); var31++) {
                                        }
                                        if (Statics.field2582 == 85 && field1220.length() > 0) {
                                            field1220 = field1220.substring(0, field1220.length() - 1);
                                        }
                                        if (Statics.field2582 == 84 || Statics.field2582 == 80) {
                                            field1203 = 1;
                                        }
                                        char var32 = Statics.field1351;
                                        boolean var33 = field1226.indexOf(var32) != -1;
                                        if (var33 && field1220.length() < 320) {
                                            field1220 = field1220 + Statics.field1351;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1203 != 1);
                        if (Statics.field2582 == 85 && field1221.length() > 0) {
                            field1221 = field1221.substring(0, field1221.length() - 1);
                        } else if (Statics.field2582 == 84 || Statics.field2582 == 80) {
                            field1203 = 0;
                            if (Statics.field2582 == 84) {
                                field1220 = field1220.trim();
                                if (field1220.length() == 0) {
                                    method3154(class234.field2918, class234.field2919, class234.field2920);
                                    return;
                                }
                                if (field1221.length() == 0) {
                                    method3154(class234.field2921, class234.field3003, class234.field2923);
                                    return;
                                }
                                method3154(class234.field3031, class234.field3032, class234.field3033);
                                client.method211(false);
                                client.method3372(20);
                                return;
                            }
                        }
                        if ((class55.field416[82] || class55.field416[87]) && Statics.field2582 == 67) {
                            Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var35 = var34.getContents(Statics.field9);
                            var36 = 20 - field1221.length();
                            break;
                        }
                        if (class298.method1043(Statics.field1351)) {
                            char var44 = Statics.field1351;
                            boolean var45 = field1226.indexOf(var44) != -1;
                            if (var45 && field1221.length() < 20) {
                                field1221 = field1221 + Statics.field1351;
                            }
                        }
                    }
                } while (var36 <= 0);
                try {
                    String var37 = (String) var35.getTransferData(DataFlavor.stringFlavor);
                    int var38 = Math.min(var36, var37.length());
                    int var39 = 0;
                    while (true) {
                        if (var39 >= var38) {
                            field1221 = field1221 + var37.substring(0, var38);
                            continue label1017;
                        }
                        if (!class298.method1043(var37.charAt(var39))) {
                            break;
                        }
                        char var40 = var37.charAt(var39);
                        boolean var41 = field1226.indexOf(var40) != -1;
                        if (!var41) {
                            break;
                        }
                        var39++;
                    }
                    field1205 = 3;
                    return;
                } catch (UnsupportedFlavorException var134) {
                } catch (IOException var135) {
                }
            }
        } else if (field1205 == 3) {
            int var46 = field1207 + 180;
            short var47 = 276;
            if (var10 == 1 && var11 >= var46 - 75 && var11 <= var46 + 75 && var12 >= var47 - 20 && var12 <= var47 + 20) {
                method547(false);
            }
            int var48 = field1207 + 180;
            short var49 = 326;
            if (var10 == 1 && var11 >= var48 - 75 && var11 <= var48 + 75 && var12 >= var49 - 20 && var12 <= var49 + 20) {
                method3154(class234.field3065, class234.field3066, class234.field3096);
                field1205 = 5;
                return;
            }
        } else if (field1205 == 4) {
            int var50 = field1207 + 180 - 80;
            short var51 = 321;
            if (var10 == 1 && var11 >= var50 - 75 && var11 <= var50 + 75 && var12 >= var51 - 20 && var12 <= var51 + 20) {
                Statics.field140.trim();
                if (Statics.field140.length() != 6) {
                    method3154(class234.field2803, class234.field2892, class234.field2938);
                    return;
                }
                Statics.field1071 = Integer.parseInt(Statics.field140);
                Statics.field140 = "";
                client.method211(true);
                method3154(class234.field3031, class234.field3032, class234.field3033);
                client.method3372(20);
                return;
            }
            if (var10 == 1 && var11 >= field1207 + 180 - 9 && var11 <= field1207 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field1224 = !field1224;
            }
            if (var10 == 1 && var11 >= field1207 + 180 - 34 && var11 <= field1207 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                class61.method4704(client.method4179("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var52 = field1207 + 180 + 80;
            if (var10 == 1 && var11 >= var52 - 75 && var11 <= var52 + 75 && var12 >= var51 - 20 && var12 <= var51 + 20) {
                field1205 = 0;
                field1220 = "";
                field1221 = "";
                Statics.field1071 = 0;
                Statics.field140 = "";
            }
            while (class55.method801()) {
                boolean var53 = false;
                for (int var54 = 0; var54 < field1227.length(); var54++) {
                    if (Statics.field1351 == field1227.charAt(var54)) {
                        var53 = true;
                        break;
                    }
                }
                if (Statics.field2582 == 13) {
                    field1205 = 0;
                    field1220 = "";
                    field1221 = "";
                    Statics.field1071 = 0;
                    Statics.field140 = "";
                } else {
                    if (Statics.field2582 == 85 && Statics.field140.length() > 0) {
                        Statics.field140 = Statics.field140.substring(0, Statics.field140.length() - 1);
                    }
                    if (Statics.field2582 == 84) {
                        Statics.field140.trim();
                        if (Statics.field140.length() != 6) {
                            method3154(class234.field2803, class234.field2892, class234.field2938);
                            return;
                        }
                        Statics.field1071 = Integer.parseInt(Statics.field140);
                        Statics.field140 = "";
                        client.method211(true);
                        method3154(class234.field3031, class234.field3032, class234.field3033);
                        client.method3372(20);
                        return;
                    }
                    if (var53 && Statics.field140.length() < 6) {
                        Statics.field140 = Statics.field140 + Statics.field1351;
                    }
                }
            }
        } else if (field1205 == 5) {
            int var55 = field1207 + 180 - 80;
            short var56 = 321;
            if (var10 == 1 && var11 >= var55 - 75 && var11 <= var55 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                field1220 = field1220.trim();
                if (field1220.length() == 0) {
                    method3154(class234.field3065, class234.field3066, class234.field3096);
                } else {
                    long var57 = class90.method100();
                    byte var59;
                    if (var57 == 0L) {
                        var59 = 5;
                    } else {
                        String var60 = field1220;
                        Random var61 = new Random();
                        class310 var62 = new class310(128);
                        class310 var63 = new class310(128);
                        int[] var64 = new int[] { var61.nextInt(), var61.nextInt(), (int) (var57 >> 32), (int) var57 };
                        var62.method5177(10);
                        for (int var65 = 0; var65 < 4; var65++) {
                            var62.method5295(var61.nextInt());
                        }
                        var62.method5295(var64[0]);
                        var62.method5295(var64[1]);
                        var62.method5182(var57);
                        var62.method5182(0L);
                        for (int var66 = 0; var66 < 4; var66++) {
                            var62.method5295(var61.nextInt());
                        }
                        var62.method5216(class90.field1162, class90.field1165);
                        var63.method5177(10);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var63.method5295(var61.nextInt());
                        }
                        var63.method5182(var61.nextLong());
                        var63.method5283(var61.nextLong());
                        client.method657(var63);
                        var63.method5182(var61.nextLong());
                        var63.method5216(class90.field1162, class90.field1165);
                        int var68 = class310.method2409(var60);
                        if (var68 % 8 != 0) {
                            var68 += 8 - var68 % 8;
                        }
                        class310 var69 = new class310(var68);
                        var69.method5322(var60);
                        var69.field3734 = var68;
                        var69.method5212(var64);
                        class310 var70 = new class310(var69.field3734 + var63.field3734 + var62.field3734 + 5);
                        var70.method5177(2);
                        var70.method5177(var62.field3734);
                        var70.method5186(var62.field3731, 0, var62.field3734);
                        var70.method5177(var63.field3734);
                        var70.method5186(var63.field3731, 0, var63.field3734);
                        var70.method5178(var69.field3734);
                        var70.method5186(var69.field3731, 0, var69.field3734);
                        String var71 = class300.method23(var70.field3731);
                        byte var78;
                        try {
                            URL var72 = new URL(client.method4179("services", false) + "m=accountappeal/login.ws");
                            URLConnection var73 = var72.openConnection();
                            var73.setDoInput(true);
                            var73.setDoOutput(true);
                            var73.setConnectTimeout(5000);
                            OutputStreamWriter var74 = new OutputStreamWriter(var73.getOutputStream());
                            var74.write("data2=" + Statics.method4970(var71) + "&dest=" + Statics.method4970("passwordchoice.ws"));
                            var74.flush();
                            InputStream var75 = var73.getInputStream();
                            class310 var76 = new class310(new byte[1000]);
                            while (true) {
                                int var77 = var75.read(var76.field3731, var76.field3734, 1000 - var76.field3734);
                                if (var77 == -1) {
                                    var74.close();
                                    var75.close();
                                    String var79 = new String(var76.field3731);
                                    if (var79.startsWith("OFFLINE")) {
                                        var78 = 4;
                                    } else if (var79.startsWith("WRONG")) {
                                        var78 = 7;
                                    } else if (var79.startsWith("RELOAD")) {
                                        var78 = 3;
                                    } else if (var79.startsWith("Not permitted for social network accounts.")) {
                                        var78 = 6;
                                    } else {
                                        var76.method5213(var64);
                                        while (var76.field3734 > 0 && var76.field3731[var76.field3734 - 1] == 0) {
                                            var76.field3734--;
                                        }
                                        String var80 = new String(var76.field3731, 0, var76.field3734);
                                        boolean var81;
                                        if (var80 == null) {
                                            var81 = false;
                                        } else {
                                            label1140: {
                                                try {
                                                    new URL(var80);
                                                } catch (MalformedURLException var130) {
                                                    var81 = false;
                                                    break label1140;
                                                }
                                                var81 = true;
                                            }
                                        }
                                        if (var81) {
                                            class61.method4704(var80, true, false);
                                            var78 = 2;
                                        } else {
                                            var78 = 5;
                                        }
                                    }
                                    break;
                                }
                                var76.field3734 += var77;
                                if (var76.field3734 >= 1000) {
                                    var78 = 5;
                                    break;
                                }
                            }
                        } catch (Throwable var131) {
                            var131.printStackTrace();
                            var78 = 5;
                        }
                        var59 = var78;
                    }
                    switch(var59) {
                        case 2:
                            method3154(class234.field3068, class234.field3016, class234.field3070);
                            field1205 = 6;
                            break;
                        case 3:
                            method3154(class234.field3071, class234.field2814, class234.field3073);
                            break;
                        case 4:
                            method3154(class234.field2935, class234.field3075, class234.field3076);
                            break;
                        case 5:
                            method3154(class234.field3077, class234.field2996, class234.field3079);
                            break;
                        case 6:
                            method3154(class234.field3080, class234.field3081, class234.field3082);
                            break;
                        case 7:
                            method3154(class234.field3083, class234.field3084, class234.field3085);
                    }
                }
                return;
            }
            int var84 = field1207 + 180 + 80;
            if (var10 == 1 && var11 >= var84 - 75 && var11 <= var84 + 75 && var12 >= var56 - 20 && var12 <= var56 + 20) {
                method547(true);
            }
            short var85 = 361;
            if (Statics.field2520 != null) {
                int var86 = Statics.field2520.field3871 / 2;
                if (var10 == 1 && var11 >= Statics.field2520.field3874 - var86 && var11 <= Statics.field2520.field3874 + var86 && var12 >= var85 - 15 && var12 < var85) {
                    class61.method4704(client.method4179("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class55.method801()) {
                boolean var87 = false;
                for (int var88 = 0; var88 < field1226.length(); var88++) {
                    if (Statics.field1351 == field1226.charAt(var88)) {
                        var87 = true;
                        break;
                    }
                }
                if (Statics.field2582 == 13) {
                    method547(true);
                } else {
                    if (Statics.field2582 == 85 && field1220.length() > 0) {
                        field1220 = field1220.substring(0, field1220.length() - 1);
                    }
                    if (Statics.field2582 == 84) {
                        field1220 = field1220.trim();
                        if (field1220.length() == 0) {
                            method3154(class234.field3065, class234.field3066, class234.field3096);
                        } else {
                            long var89 = class90.method100();
                            byte var91;
                            if (var89 == 0L) {
                                var91 = 5;
                            } else {
                                String var92 = field1220;
                                Random var93 = new Random();
                                class310 var94 = new class310(128);
                                class310 var95 = new class310(128);
                                int[] var96 = new int[] { var93.nextInt(), var93.nextInt(), (int) (var89 >> 32), (int) var89 };
                                var94.method5177(10);
                                for (int var97 = 0; var97 < 4; var97++) {
                                    var94.method5295(var93.nextInt());
                                }
                                var94.method5295(var96[0]);
                                var94.method5295(var96[1]);
                                var94.method5182(var89);
                                var94.method5182(0L);
                                for (int var98 = 0; var98 < 4; var98++) {
                                    var94.method5295(var93.nextInt());
                                }
                                var94.method5216(class90.field1162, class90.field1165);
                                var95.method5177(10);
                                for (int var99 = 0; var99 < 3; var99++) {
                                    var95.method5295(var93.nextInt());
                                }
                                var95.method5182(var93.nextLong());
                                var95.method5283(var93.nextLong());
                                client.method657(var95);
                                var95.method5182(var93.nextLong());
                                var95.method5216(class90.field1162, class90.field1165);
                                int var100 = class310.method2409(var92);
                                if (var100 % 8 != 0) {
                                    var100 += 8 - var100 % 8;
                                }
                                class310 var101 = new class310(var100);
                                var101.method5322(var92);
                                var101.field3734 = var100;
                                var101.method5212(var96);
                                class310 var102 = new class310(var101.field3734 + var95.field3734 + var94.field3734 + 5);
                                var102.method5177(2);
                                var102.method5177(var94.field3734);
                                var102.method5186(var94.field3731, 0, var94.field3734);
                                var102.method5177(var95.field3734);
                                var102.method5186(var95.field3731, 0, var95.field3734);
                                var102.method5178(var101.field3734);
                                var102.method5186(var101.field3731, 0, var101.field3734);
                                String var103 = class300.method23(var102.field3731);
                                byte var110;
                                try {
                                    URL var104 = new URL(client.method4179("services", false) + "m=accountappeal/login.ws");
                                    URLConnection var105 = var104.openConnection();
                                    var105.setDoInput(true);
                                    var105.setDoOutput(true);
                                    var105.setConnectTimeout(5000);
                                    OutputStreamWriter var106 = new OutputStreamWriter(var105.getOutputStream());
                                    var106.write("data2=" + Statics.method4970(var103) + "&dest=" + Statics.method4970("passwordchoice.ws"));
                                    var106.flush();
                                    InputStream var107 = var105.getInputStream();
                                    class310 var108 = new class310(new byte[1000]);
                                    while (true) {
                                        int var109 = var107.read(var108.field3731, var108.field3734, 1000 - var108.field3734);
                                        if (var109 == -1) {
                                            var106.close();
                                            var107.close();
                                            String var111 = new String(var108.field3731);
                                            if (var111.startsWith("OFFLINE")) {
                                                var110 = 4;
                                            } else if (var111.startsWith("WRONG")) {
                                                var110 = 7;
                                            } else if (var111.startsWith("RELOAD")) {
                                                var110 = 3;
                                            } else if (var111.startsWith("Not permitted for social network accounts.")) {
                                                var110 = 6;
                                            } else {
                                                var108.method5213(var96);
                                                while (var108.field3734 > 0 && var108.field3731[var108.field3734 - 1] == 0) {
                                                    var108.field3734--;
                                                }
                                                String var112 = new String(var108.field3731, 0, var108.field3734);
                                                boolean var113;
                                                if (var112 == null) {
                                                    var113 = false;
                                                } else {
                                                    label1142: {
                                                        try {
                                                            new URL(var112);
                                                        } catch (MalformedURLException var132) {
                                                            var113 = false;
                                                            break label1142;
                                                        }
                                                        var113 = true;
                                                    }
                                                }
                                                if (var113) {
                                                    class61.method4704(var112, true, false);
                                                    var110 = 2;
                                                } else {
                                                    var110 = 5;
                                                }
                                            }
                                            break;
                                        }
                                        var108.field3734 += var109;
                                        if (var108.field3734 >= 1000) {
                                            var110 = 5;
                                            break;
                                        }
                                    }
                                } catch (Throwable var133) {
                                    var133.printStackTrace();
                                    var110 = 5;
                                }
                                var91 = var110;
                            }
                            switch(var91) {
                                case 2:
                                    method3154(class234.field3068, class234.field3016, class234.field3070);
                                    field1205 = 6;
                                    break;
                                case 3:
                                    method3154(class234.field3071, class234.field2814, class234.field3073);
                                    break;
                                case 4:
                                    method3154(class234.field2935, class234.field3075, class234.field3076);
                                    break;
                                case 5:
                                    method3154(class234.field3077, class234.field2996, class234.field3079);
                                    break;
                                case 6:
                                    method3154(class234.field3080, class234.field3081, class234.field3082);
                                    break;
                                case 7:
                                    method3154(class234.field3083, class234.field3084, class234.field3085);
                            }
                        }
                        return;
                    }
                    if (var87 && field1220.length() < 320) {
                        field1220 = field1220 + Statics.field1351;
                    }
                }
            }
        } else if (field1205 == 6) {
            while (true) {
                do {
                    if (!class55.method801()) {
                        short var116 = 321;
                        if (var10 == 1 && var12 >= var116 - 20 && var12 <= var116 + 20) {
                            method547(true);
                        }
                        return;
                    }
                } while (Statics.field2582 != 84 && Statics.field2582 != 13);
                method547(true);
            }
        } else if (field1205 == 7) {
            int var117 = field1207 + 180 - 80;
            short var118 = 321;
            if (var10 == 1 && var11 >= var117 - 75 && var11 <= var117 + 75 && var12 >= var118 - 20 && var12 <= var118 + 20) {
                class61.method4704(client.method4179("secure", true) + "m=dob/set_dob.ws", true, false);
                method3154(class234.field3062, class234.field3063, class234.field3064);
                field1205 = 6;
                return;
            }
            int var119 = field1207 + 180 + 80;
            if (var10 == 1 && var11 >= var119 - 75 && var11 <= var119 + 75 && var12 >= var118 - 20 && var12 <= var118 + 20) {
                method547(true);
            }
        } else if (field1205 == 8) {
            int var120 = field1207 + 180 - 80;
            short var121 = 321;
            if (var10 == 1 && var11 >= var120 - 75 && var11 <= var120 + 75 && var12 >= var121 - 20 && var12 <= var121 + 20) {
                class61.method4704("https://www.jagex.com/terms/privacy", true, false);
                method3154(class234.field3062, class234.field3063, class234.field3064);
                field1205 = 6;
                return;
            }
            int var122 = field1207 + 180 + 80;
            if (var10 == 1 && var11 >= var122 - 75 && var11 <= var122 + 75 && var12 >= var121 - 20 && var12 <= var121 + 20) {
                method547(true);
            }
        } else if (field1205 == 12) {
            String var123 = "";
            switch(field1211) {
                case 0:
                    var123 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var123 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method547(false);
            }
            int var124 = field1207 + 180;
            short var125 = 276;
            if (var10 == 1 && var11 >= var124 - 75 && var11 <= var124 + 75 && var12 >= var125 - 20 && var12 <= var125 + 20) {
                class61.method4704(var123, true, false);
                method3154(class234.field3062, class234.field3063, class234.field3064);
                field1205 = 6;
                return;
            }
            int var126 = field1207 + 180;
            short var127 = 326;
            if (var10 == 1 && var11 >= var126 - 75 && var11 <= var126 + 75 && var12 >= var127 - 20 && var12 <= var127 + 20) {
                method547(false);
            }
        } else if (field1205 == 24) {
            int var128 = field1207 + 180;
            short var129 = 301;
            if (var10 == 1 && var11 >= var128 - 75 && var11 <= var128 + 75 && var12 >= var129 - 20 && var12 <= var129 + 20) {
                method547(false);
            }
        }
    }

    @ObfuscatedName("ax.o(ZI)V")
    public static void method547(boolean arg0) {
        field1217 = class234.field3013;
        field1218 = class234.field3014;
        field1236 = class234.field3015;
        field1205 = 2;
        if (arg0) {
            field1221 = "";
        }
        method1048();
        if (client.field678 && field1220 != null && field1220.length() > 0) {
            field1203 = 1;
        } else {
            field1203 = 0;
        }
    }

    @ObfuscatedName("bf.x(Lkr;Lkr;Lkr;B)V")
    public static void method1181(class305 arg0, class305 arg1, class305 arg2) {
        field1223 = (Statics.field1642 - 765) / 2;
        field1207 = field1223 + 202;
        Statics.field3923 = field1207 + 180;
        if (field1228) {
            method4439(arg0, arg1);
            return;
        }
        Statics.field3853.method5770(field1223, 0);
        Statics.field1204.method5770(field1223 + 382, 0);
        Statics.field2525.method5737(field1223 + 382 - Statics.field2525.field3893 / 2, 18);
        if (client.field707 == 0 || client.field707 == 5) {
            byte var3 = 20;
            arg0.method5056(class234.field3012, field1207 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class331.method5665(field1207 + 180 - 152, var4, 304, 34, 9179409);
            class331.method5665(field1207 + 180 - 151, var4 + 1, 302, 32, 0);
            class331.method5661(field1207 + 180 - 150, var4 + 2, field1209 * 3, 30, 9179409);
            class331.method5661(field1209 * 3 + (field1207 + 180 - 150), var4 + 2, 300 - field1209 * 3, 30, 0);
            arg0.method5056(field1212, field1207 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field707 == 20) {
            Statics.field3667.method5737(field1207 + 180 - Statics.field3667.field3893 / 2, 271 - Statics.field3667.field3898 / 2);
            short var5 = 201;
            arg0.method5056(field1217, field1207 + 180, var5, 16776960, 0);
            int var84 = var5 + 15;
            arg0.method5056(field1218, field1207 + 180, var84, 16776960, 0);
            int var85 = var84 + 15;
            arg0.method5056(field1236, field1207 + 180, var85, 16776960, 0);
            int var86 = var85 + 15;
            int var87 = var86 + 7;
            if (field1205 != 4) {
                arg0.method5053(class234.field3040, field1207 + 180 - 110, var87, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = Statics.method316(); arg0.method5127(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method5053(class306.method5054(var7), field1207 + 180 - 70, var87, 16777215, 0);
                var84 = var87 + 15;
                String var8;
                for (var8 = class301.method5029(field1221); arg0.method5127(var8) > var6; var8 = var8.substring(1)) {
                }
                arg0.method5053(class234.field3041 + var8, field1207 + 180 - 108, var84, 16777215, 0);
                var84 += 15;
            }
        }
        if (client.field707 == 10 || client.field707 == 11) {
            Statics.field3667.method5737(field1207, 171);
            if (field1205 == 0) {
                short var9 = 251;
                arg0.method5056(class234.field3094, field1207 + 180, var9, 16776960, 0);
                int var88 = var9 + 30;
                int var10 = field1207 + 180 - 80;
                short var11 = 291;
                Statics.field1904.method5737(var10 - 73, var11 - 20);
                arg0.method5107(class234.field3044, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1207 + 180 + 80;
                Statics.field1904.method5737(var12 - 73, var11 - 20);
                arg0.method5107(class234.field3045, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1205 == 1) {
                arg0.method5056(field1230, field1207 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method5056(field1217, field1207 + 180, var13, 16777215, 0);
                int var89 = var13 + 15;
                arg0.method5056(field1218, field1207 + 180, var89, 16777215, 0);
                int var90 = var89 + 15;
                arg0.method5056(field1236, field1207 + 180, var90, 16777215, 0);
                int var91 = var90 + 15;
                int var14 = field1207 + 180 - 80;
                short var15 = 321;
                Statics.field1904.method5737(var14 - 73, var15 - 20);
                arg0.method5056(class234.field2873, var14, var15 + 5, 16777215, 0);
                int var16 = field1207 + 180 + 80;
                Statics.field1904.method5737(var16 - 73, var15 - 20);
                arg0.method5056(class234.field3023, var16, var15 + 5, 16777215, 0);
            } else if (field1205 == 2) {
                short var17 = 201;
                arg0.method5056(field1217, Statics.field3923, var17, 16776960, 0);
                int var92 = var17 + 15;
                arg0.method5056(field1218, Statics.field3923, var92, 16776960, 0);
                int var93 = var92 + 15;
                arg0.method5056(field1236, Statics.field3923, var93, 16776960, 0);
                int var94 = var93 + 15;
                int var95 = var94 + 7;
                arg0.method5053(class234.field3040, Statics.field3923 - 110, var95, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = Statics.method316(); arg0.method5127(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method5053(class306.method5054(var19) + (field1203 == 0 & client.field674 % 40 < 20 ? class91.method631(16776960) + class91.field1170 : ""), Statics.field3923 - 70, var95, 16777215, 0);
                var92 = var95 + 15;
                String var20;
                for (var20 = class301.method5029(field1221); arg0.method5127(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method5053(class234.field3041 + var20 + (field1203 == 1 & client.field674 % 40 < 20 ? class91.method631(16776960) + class91.field1170 : ""), Statics.field3923 - 108, var92, 16777215, 0);
                var92 += 15;
                short var21 = 277;
                int var22 = Statics.field3923 + -117;
                boolean var23 = client.field678;
                boolean var24 = field1225;
                class334 var25 = var23 ? (var24 ? Statics.field1222 : Statics.field2425) : (var24 ? Statics.field3135 : Statics.field2751);
                var25.method5737(var22, var21);
                int var27 = var25.field3893 + 5 + var22;
                arg1.method5053(class234.field2852, var27, var21 + 13, 16776960, 0);
                int var28 = Statics.field3923 + 24;
                boolean var29 = Statics.field1694.field1091;
                boolean var30 = field1202;
                class334 var31 = var29 ? (var30 ? Statics.field1222 : Statics.field2425) : (var30 ? Statics.field3135 : Statics.field2751);
                var31.method5737(var28, var21);
                int var33 = var31.field3893 + 5 + var28;
                arg1.method5053(class234.field3049, var33, var21 + 13, 16776960, 0);
                int var96 = var21 + 15;
                int var34 = Statics.field3923 - 80;
                short var35 = 321;
                Statics.field1904.method5737(var34 - 73, var35 - 20);
                arg0.method5056(class234.field2838, var34, var35 + 5, 16777215, 0);
                int var36 = Statics.field3923 + 80;
                Statics.field1904.method5737(var36 - 73, var35 - 20);
                arg0.method5056(class234.field3023, var36, var35 + 5, 16777215, 0);
                short var37 = 357;
                switch(field1214) {
                    case 2:
                        Statics.field1905 = class234.field3061;
                        break;
                    default:
                        Statics.field1905 = class234.field3060;
                }
                Statics.field113 = new class329(Statics.field3923, var37, arg1.method5127(Statics.field1905), 11);
                Statics.field2520 = new class329(Statics.field3923, var37, arg1.method5127(class234.field2856), 11);
                arg1.method5056(Statics.field1905, Statics.field3923, var37, 16777215, 0);
            } else if (field1205 == 3) {
                short var38 = 201;
                arg0.method5056(class234.field3050, field1207 + 180, var38, 16776960, 0);
                int var97 = var38 + 20;
                arg1.method5056(class234.field2954, field1207 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg1.method5056(class234.field3052, field1207 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                int var39 = field1207 + 180;
                short var40 = 276;
                Statics.field1904.method5737(var39 - 73, var40 - 20);
                arg2.method5056(class234.field3053, var39, var40 + 5, 16777215, 0);
                int var41 = field1207 + 180;
                short var42 = 326;
                Statics.field1904.method5737(var41 - 73, var42 - 20);
                arg2.method5056(class234.field3054, var41, var42 + 5, 16777215, 0);
            } else if (field1205 == 4) {
                arg0.method5056(class234.field3029, field1207 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method5056(field1217, field1207 + 180, var43, 16777215, 0);
                int var100 = var43 + 15;
                arg0.method5056(field1218, field1207 + 180, var100, 16777215, 0);
                int var101 = var100 + 15;
                arg0.method5056(field1236, field1207 + 180, var101, 16777215, 0);
                int var102 = var101 + 15;
                arg0.method5053(class234.field3042 + class301.method5029(Statics.field140) + (client.field674 % 40 < 20 ? class91.method631(16776960) + class91.field1170 : ""), field1207 + 180 - 108, var102, 16777215, 0);
                int var103 = var102 - 8;
                arg0.method5053(class234.field2807, field1207 + 180 - 9, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method5053(class234.field2808, field1207 + 180 - 9, var104, 16776960, 0);
                int var44 = field1207 + 180 - 9 + arg0.method5127(class234.field2808) + 15;
                int var45 = var104 - arg0.field3707;
                class334 var46;
                if (field1224) {
                    var46 = Statics.field2425;
                } else {
                    var46 = Statics.field2751;
                }
                var46.method5737(var44, var45);
                var100 = var104 + 15;
                int var47 = field1207 + 180 - 80;
                short var48 = 321;
                Statics.field1904.method5737(var47 - 73, var48 - 20);
                arg0.method5056(class234.field2873, var47, var48 + 5, 16777215, 0);
                int var49 = field1207 + 180 + 80;
                Statics.field1904.method5737(var49 - 73, var48 - 20);
                arg0.method5056(class234.field3023, var49, var48 + 5, 16777215, 0);
                arg1.method5056(class234.field3030, field1207 + 180, var48 + 36, 255, 0);
            } else if (field1205 == 5) {
                arg0.method5056(class234.field3055, field1207 + 180, 201, 16776960, 0);
                short var50 = 221;
                arg2.method5056(field1217, field1207 + 180, var50, 16776960, 0);
                int var105 = var50 + 15;
                arg2.method5056(field1218, field1207 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg2.method5056(field1236, field1207 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var108 = var107 + 14;
                arg0.method5053(class234.field2908, field1207 + 180 - 145, var108, 16777215, 0);
                short var51 = 174;
                String var52;
                for (var52 = Statics.method316(); arg0.method5127(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method5053(class306.method5054(var52) + (client.field674 % 40 < 20 ? class91.method631(16776960) + class91.field1170 : ""), field1207 + 180 - 34, var108, 16777215, 0);
                var105 = var108 + 15;
                int var53 = field1207 + 180 - 80;
                short var54 = 321;
                Statics.field1904.method5737(var53 - 73, var54 - 20);
                arg0.method5056(class234.field2843, var53, var54 + 5, 16777215, 0);
                int var55 = field1207 + 180 + 80;
                Statics.field1904.method5737(var55 - 73, var54 - 20);
                arg0.method5056(class234.field3058, var55, var54 + 5, 16777215, 0);
                short var56 = 356;
                arg1.method5056(class234.field2856, Statics.field3923, var56, 268435455, 0);
            } else if (field1205 == 6) {
                short var57 = 201;
                arg0.method5056(field1217, field1207 + 180, var57, 16776960, 0);
                int var109 = var57 + 15;
                arg0.method5056(field1218, field1207 + 180, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method5056(field1236, field1207 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var58 = field1207 + 180;
                short var59 = 321;
                Statics.field1904.method5737(var58 - 73, var59 - 20);
                arg0.method5056(class234.field3058, var58, var59 + 5, 16777215, 0);
            } else if (field1205 == 7) {
                short var60 = 216;
                arg0.method5056(class234.field3086, field1207 + 180, var60, 16776960, 0);
                int var112 = var60 + 15;
                arg2.method5056(class234.field2960, field1207 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg2.method5056(class234.field2850, field1207 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var61 = field1207 + 180 - 80;
                short var62 = 321;
                Statics.field1904.method5737(var61 - 73, var62 - 20);
                arg0.method5056(class234.field2875, var61, var62 + 5, 16777215, 0);
                int var63 = field1207 + 180 + 80;
                Statics.field1904.method5737(var63 - 73, var62 - 20);
                arg0.method5056(class234.field3058, var63, var62 + 5, 16777215, 0);
            } else if (field1205 == 8) {
                short var64 = 216;
                arg0.method5056(class234.field2897, field1207 + 180, var64, 16776960, 0);
                int var115 = var64 + 15;
                arg2.method5056(class234.field2810, field1207 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg2.method5056(class234.field2988, field1207 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var65 = field1207 + 180 - 80;
                short var66 = 321;
                Statics.field1904.method5737(var65 - 73, var66 - 20);
                arg0.method5056(class234.field2939, var65, var66 + 5, 16777215, 0);
                int var67 = field1207 + 180 + 80;
                Statics.field1904.method5737(var67 - 73, var66 - 20);
                arg0.method5056(class234.field3058, var67, var66 + 5, 16777215, 0);
            } else if (field1205 == 12) {
                short var68 = 201;
                String var69 = "";
                String var70 = "";
                String var71 = "";
                switch(field1211) {
                    case 0:
                        var69 = class234.field2941;
                        var70 = class234.field2989;
                        var71 = class234.field2854;
                        break;
                    case 1:
                        var69 = class234.field2891;
                        var70 = class234.field2937;
                        var71 = class234.field2887;
                        break;
                    default:
                        method547(false);
                }
                arg0.method5056(var69, field1207 + 180, var68, 16776960, 0);
                int var118 = var68 + 15;
                arg2.method5056(var70, field1207 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg2.method5056(var71, field1207 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var72 = field1207 + 180;
                short var73 = 276;
                Statics.field1904.method5737(var72 - 73, var73 - 20);
                arg0.method5056(class234.field2833, var72, var73 + 5, 16777215, 0);
                int var74 = field1207 + 180;
                short var75 = 326;
                Statics.field1904.method5737(var74 - 73, var75 - 20);
                arg0.method5056(class234.field3058, var74, var75 + 5, 16777215, 0);
            } else if (field1205 == 24) {
                short var76 = 221;
                arg0.method5056(field1217, field1207 + 180, var76, 16777215, 0);
                int var121 = var76 + 15;
                arg0.method5056(field1218, field1207 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method5056(field1236, field1207 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                int var77 = field1207 + 180;
                short var78 = 301;
                Statics.field1904.method5737(var77 - 73, var78 - 20);
                arg0.method5056(class234.field2802, var77, var78 + 5, 16777215, 0);
            }
        }
        if (client.field707 >= 10) {
            int[] var79 = new int[4];
            class331.method5685(var79);
            class331.method5653(field1223, 0, field1223 + 765, Statics.field475);
            Statics.field1297.method1706(field1223 - 22, client.field674);
            Statics.field1297.method1706(field1223 + 765 + 22 - 128, client.field674);
            class331.method5656(var79);
        }
        Statics.field1093[Statics.field1694.field1084 ? 1 : 0].method5737(field1223 + 765 - 40, 463);
        if (client.field707 <= 5 || Statics.field441 != class200.field2386) {
            return;
        }
        if (Statics.field37 == null) {
            Statics.field37 = class336.method3851(Statics.field2545, "sl_button", "");
            return;
        }
        int var80 = field1223 + 5;
        short var81 = 463;
        byte var82 = 100;
        byte var83 = 35;
        Statics.field37.method5737(var80, var81);
        arg0.method5056(class234.field2859 + " " + client.field672, var82 / 2 + var80, var83 / 2 + var81 - 2, 16777215, 0);
        if (Statics.field370 == null) {
            arg1.method5056(class234.field3100, var82 / 2 + var80, var83 / 2 + var81 + 12, 16777215, 0);
        } else {
            arg1.method5056(class234.field3099, var82 / 2 + var80, var83 / 2 + var81 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ev.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3154(String arg0, String arg1, String arg2) {
        field1217 = arg0;
        field1218 = arg1;
        field1236 = arg2;
    }

    @ObfuscatedName("jq.g(Lkr;Lkr;I)V")
    public static void method4439(class305 arg0, class305 arg1) {
        if (Statics.field2469 == null) {
            class246 var2 = Statics.field2545;
            int var3 = var2.method3909("sl_back");
            int var4 = var2.method3927(var3, "");
            class335[] var5 = class336.method3856(var2, var3, var4);
            Statics.field2469 = var5;
        }
        if (Statics.field317 == null) {
            class246 var6 = Statics.field2545;
            int var7 = var6.method3909("sl_flags");
            int var8 = var6.method3927(var7, "");
            class334[] var9 = class336.method3244(var6, var7, var8);
            Statics.field317 = var9;
        }
        if (Statics.field2491 == null) {
            class246 var10 = Statics.field2545;
            int var11 = var10.method3909("sl_arrows");
            int var12 = var10.method3927(var11, "");
            class334[] var13 = class336.method3244(var10, var11, var12);
            Statics.field2491 = var13;
        }
        if (Statics.field1229 == null) {
            class246 var14 = Statics.field2545;
            int var15 = var14.method3909("sl_stars");
            int var16 = var14.method3927(var15, "");
            class334[] var17 = class336.method3244(var14, var15, var16);
            Statics.field1229 = var17;
        }
        if (Statics.field157 == null) {
            Statics.field157 = class336.method3851(Statics.field2545, "leftarrow", "");
        }
        if (Statics.field3182 == null) {
            Statics.field3182 = class336.method3851(Statics.field2545, "rightarrow", "");
        }
        class331.method5661(field1223, 23, 765, 480, 0);
        class331.method5719(field1223, 0, 125, 23, 12425273, 9135624);
        class331.method5719(field1223 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5056(class234.field2901, field1223 + 62, 15, 0, -1);
        if (Statics.field1229 != null) {
            Statics.field1229[1].method5737(field1223 + 140, 1);
            arg1.method5053(class234.field3089, field1223 + 152, 10, 16777215, -1);
            Statics.field1229[0].method5737(field1223 + 140, 12);
            arg1.method5053(class234.field3092, field1223 + 152, 21, 16777215, -1);
        }
        if (Statics.field2491 != null) {
            int var18 = field1223 + 280;
            if (class81.field1049[0] == 0 && class81.field1050[0] == 0) {
                Statics.field2491[2].method5737(var18, 4);
            } else {
                Statics.field2491[0].method5737(var18, 4);
            }
            if (class81.field1049[0] == 0 && class81.field1050[0] == 1) {
                Statics.field2491[3].method5737(var18 + 15, 4);
            } else {
                Statics.field2491[1].method5737(var18 + 15, 4);
            }
            arg0.method5053(class234.field3093, var18 + 32, 17, 16777215, -1);
            int var19 = field1223 + 390;
            if (class81.field1049[0] == 1 && class81.field1050[0] == 0) {
                Statics.field2491[2].method5737(var19, 4);
            } else {
                Statics.field2491[0].method5737(var19, 4);
            }
            if (class81.field1049[0] == 1 && class81.field1050[0] == 1) {
                Statics.field2491[3].method5737(var19 + 15, 4);
            } else {
                Statics.field2491[1].method5737(var19 + 15, 4);
            }
            arg0.method5053(class234.field3088, var19 + 32, 17, 16777215, -1);
            int var20 = field1223 + 500;
            if (class81.field1049[0] == 2 && class81.field1050[0] == 0) {
                Statics.field2491[2].method5737(var20, 4);
            } else {
                Statics.field2491[0].method5737(var20, 4);
            }
            if (class81.field1049[0] == 2 && class81.field1050[0] == 1) {
                Statics.field2491[3].method5737(var20 + 15, 4);
            } else {
                Statics.field2491[1].method5737(var20 + 15, 4);
            }
            arg0.method5053(class234.field3095, var20 + 32, 17, 16777215, -1);
            int var21 = field1223 + 610;
            if (class81.field1049[0] == 3 && class81.field1050[0] == 0) {
                Statics.field2491[2].method5737(var21, 4);
            } else {
                Statics.field2491[0].method5737(var21, 4);
            }
            if (class81.field1049[0] == 3 && class81.field1050[0] == 1) {
                Statics.field2491[3].method5737(var21 + 15, 4);
            } else {
                Statics.field2491[1].method5737(var21 + 15, 4);
            }
            arg0.method5053(class234.field2922, var21 + 32, 17, 16777215, -1);
        }
        class331.method5661(field1223 + 708, 4, 50, 16, 0);
        arg1.method5056(class234.field3023, field1223 + 708 + 25, 16, 16777215, -1);
        field1208 = -1;
        if (Statics.field2469 != null) {
            byte var22 = 88;
            byte var23 = 19;
            int var24 = 765 / (var22 + 1) - 1;
            int var25 = 480 / (var23 + 1);
            int var26;
            int var27;
            do {
                var26 = var25;
                var27 = var24;
                if ((var24 - 1) * var25 >= class81.field1057) {
                    var24--;
                }
                if ((var25 - 1) * var24 >= class81.field1057) {
                    var25--;
                }
                if ((var25 - 1) * var24 >= class81.field1057) {
                    var25--;
                }
            } while (var25 != var26 || var24 != var27);
            int var28 = (765 - var22 * var24) / (var24 + 1);
            if (var28 > 5) {
                var28 = 5;
            }
            int var29 = (480 - var23 * var25) / (var25 + 1);
            if (var29 > 5) {
                var29 = 5;
            }
            int var30 = (765 - var22 * var24 - (var24 - 1) * var28) / 2;
            int var31 = (480 - var23 * var25 - (var25 - 1) * var29) / 2;
            int var32 = (class81.field1057 + var25 - 1) / var25;
            field1232 = var32 - var24;
            if (Statics.field157 != null && field1219 > 0) {
                Statics.field157.method5737(8, Statics.field475 / 2 - Statics.field157.field3898 / 2);
            }
            if (Statics.field3182 != null && field1219 < field1232) {
                Statics.field3182.method5737(Statics.field1642 - Statics.field3182.field3893 - 8, Statics.field475 / 2 - Statics.field3182.field3898 / 2);
            }
            int var33 = var31 + 23;
            int var34 = field1223 + var30;
            int var35 = 0;
            boolean var36 = false;
            int var37 = field1219;
            for (int var38 = var25 * var37; var38 < class81.field1057 && var37 - field1219 < var24; var38++) {
                class81 var39 = Statics.field2523[var38];
                boolean var40 = true;
                String var41 = Integer.toString(var39.field1053);
                if (var39.field1053 == -1) {
                    var41 = class234.field2955;
                    var40 = false;
                } else if (var39.field1053 > 1980) {
                    var41 = class234.field3098;
                    var40 = false;
                }
                int var42 = 0;
                byte var43;
                if (var39.method1656()) {
                    if (var39.method1650()) {
                        var43 = 7;
                    } else {
                        var43 = 6;
                    }
                } else if (var39.method1687()) {
                    var42 = 16711680;
                    if (var39.method1650()) {
                        var43 = 5;
                    } else {
                        var43 = 4;
                    }
                } else if (var39.method1657()) {
                    if (var39.method1650()) {
                        var43 = 9;
                    } else {
                        var43 = 8;
                    }
                } else if (var39.method1697()) {
                    if (var39.method1650()) {
                        var43 = 3;
                    } else {
                        var43 = 2;
                    }
                } else if (var39.method1650()) {
                    var43 = 1;
                } else {
                    var43 = 0;
                }
                if (class64.field504 >= var34 && class64.field505 >= var33 && class64.field504 < var22 + var34 && class64.field505 < var23 + var33 && var40) {
                    field1208 = var38;
                    Statics.field2469[var43].method5807(var34, var33, 128, 16777215);
                    var36 = true;
                } else {
                    Statics.field2469[var43].method5770(var34, var33);
                }
                if (Statics.field317 != null) {
                    Statics.field317[(var39.method1650() ? 8 : 0) + var39.field1056].method5737(var34 + 29, var33);
                }
                arg0.method5056(Integer.toString(var39.field1044), var34 + 15, var23 / 2 + var33 + 5, var42, -1);
                arg1.method5056(var41, var34 + 60, var23 / 2 + var33 + 5, 268435455, -1);
                var33 += var23 + var29;
                var35++;
                if (var35 >= var25) {
                    var33 = var31 + 23;
                    var34 += var22 + var28;
                    var35 = 0;
                    var37++;
                }
            }
            if (var36) {
                int var44 = arg1.method5127(Statics.field2523[field1208].field1055) + 6;
                int var45 = arg1.field3707 + 8;
                int var46 = class64.field505 + 25;
                if (var45 + var46 > 480) {
                    var46 = class64.field505 - 25 - var45;
                }
                class331.method5661(class64.field504 - var44 / 2, var46, var44, var45, 16777120);
                class331.method5665(class64.field504 - var44 / 2, var46, var44, var45, 0);
                arg1.method5056(Statics.field2523[field1208].field1055, class64.field504, arg1.field3707 + var46 + 4, 0, -1);
            }
        }
        Statics.field251.method812(0, 0);
    }

    @ObfuscatedName("ij.m(Lbw;B)V")
    public static void method3859(class63 arg0) {
        while (class55.method801()) {
            if (Statics.field2582 == 13) {
                method3432();
                return;
            }
            if (Statics.field2582 == 96) {
                if (field1219 > 0 && Statics.field157 != null) {
                    field1219--;
                }
            } else if (Statics.field2582 == 97 && field1219 < field1232 && Statics.field3182 != null) {
                field1219++;
            }
        }
        if (class64.field496 != 1 && Statics.field587 || class64.field496 != 4) {
            return;
        }
        int var1 = field1223 + 280;
        if (class64.field512 >= var1 && class64.field512 <= var1 + 14 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(0, 0);
            return;
        }
        if (class64.field512 >= var1 + 15 && class64.field512 <= var1 + 80 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(0, 1);
            return;
        }
        int var2 = field1223 + 390;
        if (class64.field512 >= var2 && class64.field512 <= var2 + 14 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(1, 0);
            return;
        }
        if (class64.field512 >= var2 + 15 && class64.field512 <= var2 + 80 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(1, 1);
            return;
        }
        int var3 = field1223 + 500;
        if (class64.field512 >= var3 && class64.field512 <= var3 + 14 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(2, 0);
            return;
        }
        if (class64.field512 >= var3 + 15 && class64.field512 <= var3 + 80 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(2, 1);
            return;
        }
        int var4 = field1223 + 610;
        if (class64.field512 >= var4 && class64.field512 <= var4 + 14 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(3, 0);
            return;
        }
        if (class64.field512 >= var4 + 15 && class64.field512 <= var4 + 80 && class64.field513 >= 4 && class64.field513 <= 18) {
            class81.method314(3, 1);
            return;
        }
        if (class64.field512 >= field1223 + 708 && class64.field513 >= 4 && class64.field512 <= field1223 + 708 + 50 && class64.field513 <= 20) {
            method3432();
            return;
        }
        if (field1208 != -1) {
            class81 var5 = Statics.field2523[field1208];
            method760(var5);
            method3432();
            return;
        }
        if (field1219 > 0 && Statics.field157 != null && class64.field512 >= 0 && class64.field512 <= Statics.field157.field3893 && class64.field513 >= Statics.field475 / 2 - 50 && class64.field513 <= Statics.field475 / 2 + 50) {
            field1219--;
        }
        if (field1219 < field1232 && Statics.field3182 != null && class64.field512 >= Statics.field1642 - Statics.field3182.field3893 - 5 && class64.field512 <= Statics.field1642 && class64.field513 >= Statics.field475 / 2 - 50 && class64.field513 <= Statics.field475 / 2 + 50) {
            field1219++;
        }
    }

    @ObfuscatedName("bi.n(Lct;B)V")
    public static void method760(class81 arg0) {
        if (arg0.method1650() != client.field675) {
            client.field675 = arg0.method1650();
            class265.method621(arg0.method1650());
        }
        Statics.field560 = arg0.field1054;
        client.field672 = arg0.field1044;
        client.field781 = arg0.field1052;
        Statics.field955 = client.field905 == 0 ? 43594 : arg0.field1044 + 40000;
        Statics.field126 = client.field905 == 0 ? 443 : arg0.field1044 + 50000;
        Statics.field369 = Statics.field955;
    }

    @ObfuscatedName("cq.d(II)V")
    public static void method1954(int arg0) {
        field1205 = 12;
        field1211 = arg0;
    }

    @ObfuscatedName("gb.h(I)V")
    public static void method3432() {
        field1228 = false;
        Statics.field3853.method5770(field1223, 0);
        Statics.field1204.method5770(field1223 + 382, 0);
        Statics.field2525.method5737(field1223 + 382 - Statics.field2525.field3893 / 2, 18);
    }

    @ObfuscatedName("y.a(I)V")
    public static void method135() {
        field1205 = 24;
        method3154(class234.field2886, class234.field3035, class234.field3036);
    }
}
