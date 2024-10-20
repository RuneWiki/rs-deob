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

@ObfuscatedName("cs")
public class class86 {

    @ObfuscatedName("cs.y")
    public static int field1155 = 0;

    @ObfuscatedName("cs.u")
    public static int field1186 = field1155 + 202;

    @ObfuscatedName("cs.h")
    public static int field1178 = 10;

    @ObfuscatedName("cs.m")
    public static String field1167 = "";

    @ObfuscatedName("cs.as")
    public static int field1168 = -1;

    @ObfuscatedName("cs.ah")
    public static int field1182 = 1;

    @ObfuscatedName("cs.ar")
    public static int field1170 = 0;

    @ObfuscatedName("cs.az")
    public static String field1171 = "";

    @ObfuscatedName("cs.ay")
    public static String field1172 = "";

    @ObfuscatedName("cs.ag")
    public static String field1173 = "";

    @ObfuscatedName("cs.ac")
    public static String field1177 = "";

    @ObfuscatedName("cs.al")
    public static String field1175 = "";

    @ObfuscatedName("cs.ae")
    public static String field1176 = "";

    @ObfuscatedName("cs.ai")
    public static boolean field1187 = false;

    @ObfuscatedName("cs.am")
    public static boolean field1183 = false;

    @ObfuscatedName("cs.bg")
    public static boolean field1179 = true;

    @ObfuscatedName("cs.bw")
    public static int field1180 = 0;

    @ObfuscatedName("cs.bk")
    public static String field1181 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cs.bl")
    public static String field1185 = "1234567890";

    @ObfuscatedName("cs.bx")
    public static boolean field1169 = false;

    @ObfuscatedName("cs.bn")
    public static int field1156 = -1;

    @ObfuscatedName("cs.bb")
    public static int field1157 = 0;

    @ObfuscatedName("cs.bh")
    public static int field1184 = 0;

    @ObfuscatedName("cs.bu")
    public static long field1159;

    @ObfuscatedName("cs.be")
    public static long field1188;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1159 = -1L;
        field1188 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.f(Lhz;Lhz;ZII)V")
    public static void method700(class234 arg0, class234 arg1, boolean arg2, int arg3) {
        if (!Statics.field1174) {
            field1170 = arg3;
            class321.method5545();
            byte[] var4 = arg0.method3773("title.jpg", "");
            Statics.field1926 = class49.method74(var4);
            Statics.field490 = Statics.field1926.method5640();
            if ((client.field632 & 0x20000000) != 0) {
                Statics.field1161 = class326.method716(arg1, "logo_deadman_mode", "");
            } else if ((client.field632 & 0x40000000) == 0) {
                Statics.field1161 = class326.method716(arg1, "logo", "");
            } else {
                Statics.field1161 = class326.method716(arg1, "logo_seasonal_mode", "");
            }
            Statics.field1166 = class326.method716(arg1, "titlebox", "");
            Statics.field1160 = class326.method716(arg1, "titlebutton", "");
            Statics.field1158 = class326.method3348(arg1, "runes", "");
            Statics.field251 = class326.method3348(arg1, "title_mute", "");
            Statics.field2696 = class326.method716(arg1, "options_radio_buttons,0", "");
            Statics.field65 = class326.method716(arg1, "options_radio_buttons,4", "");
            Statics.field1162 = class326.method716(arg1, "options_radio_buttons,2", "");
            Statics.field1163 = class326.method716(arg1, "options_radio_buttons,6", "");
            Statics.field3580 = Statics.field2696.field3860;
            Statics.field1134 = Statics.field2696.field3857;
            Statics.field3279 = new class73(Statics.field1158);
            if (arg2) {
                field1175 = "";
                field1176 = "";
            }
            Statics.field3518 = 0;
            Statics.field1118 = "";
            field1179 = true;
            field1169 = false;
            if (Statics.field1071.field1029) {
                class198.method3013(2);
            } else {
                class198.method518(2, Statics.field26, "scape main", "", 255, false);
            }
            class237.method3089(false);
            Statics.field1174 = true;
            field1155 = (Statics.field45 - 765) / 2;
            field1186 = field1155 + 202;
            Statics.field1270 = field1186 + 180;
            Statics.field1926.method5662(field1155, 0);
            Statics.field490.method5662(field1155 + 382, 0);
            Statics.field1161.method5625(field1155 + 382 - Statics.field1161.field3860 / 2, 18);
        } else if (arg3 == 4) {
            field1170 = 4;
        }
    }

    @ObfuscatedName("eq.i(I)V")
    public static void method3020() {
        if (!Statics.field1174) {
            return;
        }
        Statics.field1166 = null;
        Statics.field1160 = null;
        Statics.field1158 = null;
        Statics.field1926 = null;
        Statics.field490 = null;
        Statics.field1161 = null;
        Statics.field251 = null;
        Statics.field2696 = null;
        Statics.field1162 = null;
        Statics.field2496 = null;
        Statics.field284 = null;
        Statics.field587 = null;
        Statics.field3225 = null;
        Statics.field484 = null;
        Statics.field3279.method1644();
        class198.method3013(2);
        class237.method3089(true);
        Statics.field1174 = false;
    }

    @ObfuscatedName("an.y(B)V")
    public static void method520() {
        if (client.field773 && field1175 != null && field1175.length() > 0) {
            field1180 = 1;
        } else {
            field1180 = 0;
        }
    }

    @ObfuscatedName("ec.w(Lbj;I)V")
    public static void method3057(class53 arg0) {
        if (field1169) {
            method3329(arg0);
            return;
        }
        if ((class54.field473 == 1 || !Statics.field3102 && class54.field473 == 4) && class54.field474 >= field1155 + 765 - 50 && class54.field475 >= 453) {
            Statics.field1071.field1029 = !Statics.field1071.field1029;
            class74.method1733();
            if (Statics.field1071.field1029) {
                class198.method1587();
            } else {
                class236 var1 = Statics.field26;
                int var2 = var1.method3847("scape main");
                int var3 = var1.method3846(var2, "");
                class198.method3259(var1, var2, var3, 255, false);
            }
        }
        if (client.field645 == 5) {
            return;
        }
        if (field1159 == -1L) {
            field1159 = class297.method481() + 1000L;
        }
        long var4 = class297.method481();
        boolean var6;
        if (client.field900 == null || client.field686 >= client.field900.size()) {
            var6 = true;
        } else {
            while (true) {
                if (client.field686 >= client.field900.size()) {
                    var6 = true;
                    break;
                }
                class59 var7 = (class59) client.field900.get(client.field686);
                if (!var7.method1013()) {
                    var6 = false;
                    break;
                }
                client.field686++;
            }
        }
        if (var6 && field1188 == -1L) {
            field1188 = var4;
            if (field1188 > field1159) {
                field1159 = field1188;
            }
        }
        if (client.field645 != 10 && client.field645 != 11) {
            return;
        }
        if (Statics.field2515 == class191.field2336) {
            if (class54.field473 == 1 || !Statics.field3102 && class54.field473 == 4) {
                int var8 = field1155 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class54.field474 >= var8 && class54.field474 <= var8 + var10 && class54.field475 >= var9 && class54.field475 <= var9 + var11) {
                    method3727();
                    return;
                }
            }
            if (Statics.field1190 != null) {
                method3727();
            }
        }
        int var12 = class54.field473;
        int var13 = class54.field474;
        int var14 = class54.field475;
        if (var12 == 0) {
            var13 = class54.field466;
            var14 = class54.field477;
        }
        if (!Statics.field3102 && var12 == 4) {
            var12 = 1;
        }
        if (field1170 == 0) {
            boolean var15 = false;
            while (class45.method695()) {
                if (Statics.field1733 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field1270 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class51.method129(client.method3748("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field1270 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field632 & 0x2000000) != 0) {
                    field1171 = "";
                    field1172 = class225.field2972;
                    field1173 = class225.field3028;
                    field1177 = class225.field2974;
                    field1170 = 1;
                    method520();
                } else if ((client.field632 & 0x4) != 0) {
                    if ((client.field632 & 0x400) == 0) {
                        field1172 = class225.field2963;
                        field1173 = class225.field2964;
                        field1177 = class225.field2858;
                    } else {
                        field1172 = class225.field2969;
                        field1173 = class225.field2970;
                        field1177 = class225.field2971;
                    }
                    field1171 = class225.field2962;
                    field1170 = 1;
                    method520();
                } else if ((client.field632 & 0x400) == 0) {
                    method4266(false);
                } else {
                    field1172 = class225.field2966;
                    field1173 = class225.field2967;
                    field1177 = class225.field2968;
                    field1171 = class225.field2962;
                    field1170 = 1;
                    method520();
                }
            }
        } else if (field1170 == 1) {
            while (true) {
                if (!class45.method695()) {
                    int var19 = Statics.field1270 - 80;
                    short var20 = 321;
                    if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        method4266(false);
                    }
                    int var21 = Statics.field1270 + 80;
                    if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        field1170 = 0;
                    }
                    break;
                }
                if (Statics.field1733 == 84) {
                    method4266(false);
                } else if (Statics.field1733 == 13) {
                    field1170 = 0;
                }
            }
        } else if (field1170 == 2) {
            short var22 = 201;
            int var141 = var22 + 52;
            if (var12 == 1 && var14 >= var141 - 12 && var14 < var141 + 2) {
                field1180 = 0;
            }
            var141 += 15;
            if (var12 == 1 && var14 >= var141 - 12 && var14 < var141 + 2) {
                field1180 = 1;
            }
            var141 += 15;
            short var23 = 361;
            if (Statics.field3522 != null) {
                int var24 = Statics.field3522.field3835 / 2;
                if (var12 == 1 && var13 >= Statics.field3522.field3837 - var24 && var13 <= Statics.field3522.field3837 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(field1182) {
                        case 1:
                            method242(class225.field2820, class225.field3012, class225.field3013);
                            field1170 = 5;
                            return;
                        case 2:
                            class51.method129("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field1270 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1175 = field1175.trim();
                if (field1175.length() == 0) {
                    method242(class225.field2864, class225.field2865, class225.field2946);
                    return;
                }
                if (field1176.length() == 0) {
                    method242(class225.field2867, class225.field2868, class225.field2935);
                    return;
                }
                method242(class225.field2977, class225.field2978, class225.field2979);
                client.method515(false);
                client.method3347(20);
                return;
            }
            int var27 = field1186 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1170 = 0;
                field1175 = "";
                field1176 = "";
                Statics.field3518 = 0;
                Statics.field1118 = "";
                field1179 = true;
            }
            int var28 = Statics.field1270 + -117;
            short var29 = 277;
            field1187 = var13 >= var28 && var13 < Statics.field3580 + var28 && var14 >= var29 && var14 < Statics.field1134 + var29;
            if (var12 == 1 && field1187) {
                client.field773 = !client.field773;
                if (!client.field773 && Statics.field1071.field1031 != null) {
                    Statics.field1071.field1031 = null;
                    class74.method1733();
                }
            }
            int var30 = Statics.field1270 + 24;
            short var31 = 277;
            field1183 = var13 >= var30 && var13 < Statics.field3580 + var30 && var14 >= var31 && var14 < Statics.field1134 + var31;
            if (var12 == 1 && field1183) {
                Statics.field1071.field1030 = !Statics.field1071.field1030;
                if (!Statics.field1071.field1030) {
                    field1175 = "";
                    Statics.field1071.field1031 = null;
                    method520();
                }
                class74.method1733();
            }
            while (true) {
                Transferable var33;
                int var34;
                do {
                    while (true) {
                        label952: do {
                            while (true) {
                                while (class45.method695()) {
                                    if (Statics.field1733 == 13) {
                                        field1170 = 0;
                                        field1175 = "";
                                        field1176 = "";
                                        Statics.field3518 = 0;
                                        Statics.field1118 = "";
                                        field1179 = true;
                                    } else {
                                        if (field1180 != 0) {
                                            continue label952;
                                        }
                                        method56(Statics.field1522);
                                        if (Statics.field1733 == 85 && field1175.length() > 0) {
                                            field1175 = field1175.substring(0, field1175.length() - 1);
                                        }
                                        if (Statics.field1733 == 84 || Statics.field1733 == 80) {
                                            field1180 = 1;
                                        }
                                        if (method3739(Statics.field1522) && field1175.length() < 320) {
                                            field1175 = field1175 + Statics.field1522;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1180 != 1);
                        if (Statics.field1733 == 85 && field1176.length() > 0) {
                            field1176 = field1176.substring(0, field1176.length() - 1);
                        } else if (Statics.field1733 == 84 || Statics.field1733 == 80) {
                            field1180 = 0;
                            if (Statics.field1733 == 84) {
                                field1175 = field1175.trim();
                                if (field1175.length() == 0) {
                                    method242(class225.field2864, class225.field2865, class225.field2946);
                                    return;
                                }
                                if (field1176.length() == 0) {
                                    method242(class225.field2867, class225.field2868, class225.field2935);
                                    return;
                                }
                                method242(class225.field2977, class225.field2978, class225.field2979);
                                client.method515(false);
                                client.method3347(20);
                                return;
                            }
                        }
                        if ((class45.field367[82] || class45.field367[87]) && Statics.field1733 == 67) {
                            Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var33 = var32.getContents(Statics.field2488);
                            var34 = 20 - field1176.length();
                            break;
                        }
                        char var40 = Statics.field1522;
                        boolean var41;
                        if (var40 >= ' ' && var40 < 127 || var40 > 127 && var40 < 160 || var40 > 160 && var40 <= 255) {
                            var41 = true;
                        } else {
                            label1153: {
                                if (var40 != 0) {
                                    char[] var42 = class288.field3630;
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        char var44 = var42[var43];
                                        if (var40 == var44) {
                                            var41 = true;
                                            break label1153;
                                        }
                                    }
                                }
                                var41 = false;
                            }
                        }
                        if (var41 && method3739(Statics.field1522) && field1176.length() < 20) {
                            field1176 = field1176 + Statics.field1522;
                        }
                    }
                } while (var34 <= 0);
                try {
                    String var35 = (String) var33.getTransferData(DataFlavor.stringFlavor);
                    int var36 = Math.min(var34, var35.length());
                    for (int var37 = 0; var37 < var36; var37++) {
                        if (!class288.method3277(var35.charAt(var37)) || !method3739(var35.charAt(var37))) {
                            field1170 = 3;
                            return;
                        }
                    }
                    field1176 = field1176 + var35.substring(0, var36);
                } catch (UnsupportedFlavorException var139) {
                } catch (IOException var140) {
                }
            }
        } else if (field1170 == 3) {
            int var45 = field1186 + 180;
            short var46 = 276;
            if (var12 == 1 && var13 >= var45 - 75 && var13 <= var45 + 75 && var14 >= var46 - 20 && var14 <= var46 + 20) {
                method4266(false);
            }
            int var47 = field1186 + 180;
            short var48 = 326;
            if (var12 == 1 && var13 >= var47 - 75 && var13 <= var47 + 75 && var14 >= var48 - 20 && var14 <= var48 + 20) {
                method242(class225.field2820, class225.field3012, class225.field3013);
                field1170 = 5;
                return;
            }
        } else if (field1170 == 4) {
            int var49 = field1186 + 180 - 80;
            short var50 = 321;
            if (var12 == 1 && var13 >= var49 - 75 && var13 <= var49 + 75 && var14 >= var50 - 20 && var14 <= var50 + 20) {
                Statics.field1118.trim();
                if (Statics.field1118.length() != 6) {
                    method242(class225.field2783, class225.field2784, class225.field2785);
                    return;
                }
                Statics.field3518 = Integer.parseInt(Statics.field1118);
                Statics.field1118 = "";
                client.method515(true);
                method242(class225.field2977, class225.field2978, class225.field2979);
                client.method3347(20);
                return;
            }
            if (var12 == 1 && var13 >= field1186 + 180 - 9 && var13 <= field1186 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field1179 = !field1179;
            }
            if (var12 == 1 && var13 >= field1186 + 180 - 34 && var13 <= field1186 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class51.method129(client.method3748("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var51 = field1186 + 180 + 80;
            if (var12 == 1 && var13 >= var51 - 75 && var13 <= var51 + 75 && var14 >= var50 - 20 && var14 <= var50 + 20) {
                field1170 = 0;
                field1175 = "";
                field1176 = "";
                Statics.field3518 = 0;
                Statics.field1118 = "";
            }
            while (class45.method695()) {
                boolean var52 = false;
                for (int var53 = 0; var53 < field1185.length(); var53++) {
                    if (Statics.field1522 == field1185.charAt(var53)) {
                        var52 = true;
                        break;
                    }
                }
                if (Statics.field1733 == 13) {
                    field1170 = 0;
                    field1175 = "";
                    field1176 = "";
                    Statics.field3518 = 0;
                    Statics.field1118 = "";
                } else {
                    if (Statics.field1733 == 85 && Statics.field1118.length() > 0) {
                        Statics.field1118 = Statics.field1118.substring(0, Statics.field1118.length() - 1);
                    }
                    if (Statics.field1733 == 84) {
                        Statics.field1118.trim();
                        if (Statics.field1118.length() != 6) {
                            method242(class225.field2783, class225.field2784, class225.field2785);
                            return;
                        }
                        Statics.field3518 = Integer.parseInt(Statics.field1118);
                        Statics.field1118 = "";
                        client.method515(true);
                        method242(class225.field2977, class225.field2978, class225.field2979);
                        client.method3347(20);
                        return;
                    }
                    if (var52 && Statics.field1118.length() < 6) {
                        Statics.field1118 = Statics.field1118 + Statics.field1522;
                    }
                }
            }
        } else if (field1170 == 5) {
            int var54 = field1186 + 180 - 80;
            short var55 = 321;
            if (var12 == 1 && var13 >= var54 - 75 && var13 <= var54 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                field1175 = field1175.trim();
                if (field1175.length() == 0) {
                    method242(class225.field2820, class225.field3012, class225.field3013);
                } else {
                    long var56 = class81.method1015();
                    byte var58;
                    if (var56 == 0L) {
                        var58 = 5;
                    } else {
                        String var59 = field1175;
                        Random var60 = new Random();
                        class300 var61 = new class300(128);
                        class300 var62 = new class300(128);
                        int[] var63 = new int[] { var60.nextInt(), var60.nextInt(), (int) (var56 >> 32), (int) var56 };
                        var61.method5094(10);
                        for (int var64 = 0; var64 < 4; var64++) {
                            var61.method5097(var60.nextInt());
                        }
                        var61.method5097(var63[0]);
                        var61.method5097(var63[1]);
                        var61.method5137(var56);
                        var61.method5137(0L);
                        for (int var65 = 0; var65 < 4; var65++) {
                            var61.method5097(var60.nextInt());
                        }
                        var61.method5133(class81.field1110, class81.field1113);
                        var62.method5094(10);
                        for (int var66 = 0; var66 < 3; var66++) {
                            var62.method5097(var60.nextInt());
                        }
                        var62.method5137(var60.nextLong());
                        var62.method5098(var60.nextLong());
                        if (client.field670 == null) {
                            byte[] var67 = class168.method1892();
                            var62.method5104(var67, 0, var67.length);
                        } else {
                            var62.method5104(client.field670, 0, client.field670.length);
                        }
                        var62.method5137(var60.nextLong());
                        var62.method5133(class81.field1110, class81.field1113);
                        int var68 = class300.method2738(var59);
                        if (var68 % 8 != 0) {
                            var68 += 8 - var68 % 8;
                        }
                        class300 var69 = new class300(var68);
                        var69.method5101(var59);
                        var69.field3703 = var68;
                        var69.method5129(var63);
                        class300 var70 = new class300(var69.field3703 + var62.field3703 + var61.field3703 + 5);
                        var70.method5094(2);
                        var70.method5094(var61.field3703);
                        var70.method5104(var61.field3704, 0, var61.field3703);
                        var70.method5094(var62.field3703);
                        var70.method5104(var62.field3704, 0, var62.field3703);
                        var70.method5095(var69.field3703);
                        var70.method5104(var69.field3704, 0, var69.field3703);
                        byte[] var71 = var70.field3704;
                        String var72 = class290.method3327(var71, 0, var71.length);
                        String var73 = var72;
                        byte var80;
                        try {
                            URL var74 = new URL(client.method3748("services", false) + "m=accountappeal/login.ws");
                            URLConnection var75 = var74.openConnection();
                            var75.setDoInput(true);
                            var75.setDoOutput(true);
                            var75.setConnectTimeout(5000);
                            OutputStreamWriter var76 = new OutputStreamWriter(var75.getOutputStream());
                            var76.write("data2=" + class340.method3079(var73) + "&dest=" + class340.method3079("passwordchoice.ws"));
                            var76.flush();
                            InputStream var77 = var75.getInputStream();
                            class300 var78 = new class300(new byte[1000]);
                            while (true) {
                                int var79 = var77.read(var78.field3704, var78.field3703, 1000 - var78.field3703);
                                if (var79 == -1) {
                                    var76.close();
                                    var77.close();
                                    String var81 = new String(var78.field3704);
                                    if (var81.startsWith("OFFLINE")) {
                                        var80 = 4;
                                    } else if (var81.startsWith("WRONG")) {
                                        var80 = 7;
                                    } else if (var81.startsWith("RELOAD")) {
                                        var80 = 3;
                                    } else if (var81.startsWith("Not permitted for social network accounts.")) {
                                        var80 = 6;
                                    } else {
                                        var78.method5258(var63);
                                        while (var78.field3703 > 0 && var78.field3704[var78.field3703 - 1] == 0) {
                                            var78.field3703--;
                                        }
                                        String var82 = new String(var78.field3704, 0, var78.field3703);
                                        boolean var83;
                                        if (var82 == null) {
                                            var83 = false;
                                        } else {
                                            label1128: {
                                                try {
                                                    new URL(var82);
                                                } catch (MalformedURLException var135) {
                                                    var83 = false;
                                                    break label1128;
                                                }
                                                var83 = true;
                                            }
                                        }
                                        if (var83) {
                                            class51.method129(var82, true, false);
                                            var80 = 2;
                                        } else {
                                            var80 = 5;
                                        }
                                    }
                                    break;
                                }
                                var78.field3703 += var79;
                                if (var78.field3703 >= 1000) {
                                    var80 = 5;
                                    break;
                                }
                            }
                        } catch (Throwable var136) {
                            var136.printStackTrace();
                            var80 = 5;
                        }
                        var58 = var80;
                    }
                    switch(var58) {
                        case 2:
                            method242(class225.field2835, class225.field3015, class225.field3016);
                            field1170 = 6;
                            break;
                        case 3:
                            method242(class225.field3017, class225.field3018, class225.field2766);
                            break;
                        case 4:
                            method242(class225.field3020, class225.field2985, class225.field3022);
                            break;
                        case 5:
                            method242(class225.field3023, class225.field3024, class225.field3025);
                            break;
                        case 6:
                            method242(class225.field2936, class225.field3027, class225.field2814);
                            break;
                        case 7:
                            method242(class225.field3029, class225.field3030, class225.field2807);
                    }
                }
                return;
            }
            int var86 = field1186 + 180 + 80;
            if (var12 == 1 && var13 >= var86 - 75 && var13 <= var86 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                method4266(true);
            }
            short var87 = 361;
            if (Statics.field2398 != null) {
                int var88 = Statics.field2398.field3835 / 2;
                if (var12 == 1 && var13 >= Statics.field2398.field3837 - var88 && var13 <= Statics.field2398.field3837 + var88 && var14 >= var87 - 15 && var14 < var87) {
                    class51.method129(client.method3748("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class45.method695()) {
                boolean var89 = false;
                for (int var90 = 0; var90 < field1181.length(); var90++) {
                    if (Statics.field1522 == field1181.charAt(var90)) {
                        var89 = true;
                        break;
                    }
                }
                if (Statics.field1733 == 13) {
                    method4266(true);
                } else {
                    if (Statics.field1733 == 85 && field1175.length() > 0) {
                        field1175 = field1175.substring(0, field1175.length() - 1);
                    }
                    if (Statics.field1733 == 84) {
                        field1175 = field1175.trim();
                        if (field1175.length() == 0) {
                            method242(class225.field2820, class225.field3012, class225.field3013);
                        } else {
                            long var91 = class81.method1015();
                            byte var93;
                            if (var91 == 0L) {
                                var93 = 5;
                            } else {
                                String var94 = field1175;
                                Random var95 = new Random();
                                class300 var96 = new class300(128);
                                class300 var97 = new class300(128);
                                int[] var98 = new int[] { var95.nextInt(), var95.nextInt(), (int) (var91 >> 32), (int) var91 };
                                var96.method5094(10);
                                for (int var99 = 0; var99 < 4; var99++) {
                                    var96.method5097(var95.nextInt());
                                }
                                var96.method5097(var98[0]);
                                var96.method5097(var98[1]);
                                var96.method5137(var91);
                                var96.method5137(0L);
                                for (int var100 = 0; var100 < 4; var100++) {
                                    var96.method5097(var95.nextInt());
                                }
                                var96.method5133(class81.field1110, class81.field1113);
                                var97.method5094(10);
                                for (int var101 = 0; var101 < 3; var101++) {
                                    var97.method5097(var95.nextInt());
                                }
                                var97.method5137(var95.nextLong());
                                var97.method5098(var95.nextLong());
                                if (client.field670 == null) {
                                    byte[] var102 = class168.method1892();
                                    var97.method5104(var102, 0, var102.length);
                                } else {
                                    var97.method5104(client.field670, 0, client.field670.length);
                                }
                                var97.method5137(var95.nextLong());
                                var97.method5133(class81.field1110, class81.field1113);
                                int var103 = class300.method2738(var94);
                                if (var103 % 8 != 0) {
                                    var103 += 8 - var103 % 8;
                                }
                                class300 var104 = new class300(var103);
                                var104.method5101(var94);
                                var104.field3703 = var103;
                                var104.method5129(var98);
                                class300 var105 = new class300(var104.field3703 + var97.field3703 + var96.field3703 + 5);
                                var105.method5094(2);
                                var105.method5094(var96.field3703);
                                var105.method5104(var96.field3704, 0, var96.field3703);
                                var105.method5094(var97.field3703);
                                var105.method5104(var97.field3704, 0, var97.field3703);
                                var105.method5095(var104.field3703);
                                var105.method5104(var104.field3704, 0, var104.field3703);
                                byte[] var106 = var105.field3704;
                                String var107 = class290.method3327(var106, 0, var106.length);
                                String var108 = var107;
                                byte var115;
                                try {
                                    URL var109 = new URL(client.method3748("services", false) + "m=accountappeal/login.ws");
                                    URLConnection var110 = var109.openConnection();
                                    var110.setDoInput(true);
                                    var110.setDoOutput(true);
                                    var110.setConnectTimeout(5000);
                                    OutputStreamWriter var111 = new OutputStreamWriter(var110.getOutputStream());
                                    var111.write("data2=" + class340.method3079(var108) + "&dest=" + class340.method3079("passwordchoice.ws"));
                                    var111.flush();
                                    InputStream var112 = var110.getInputStream();
                                    class300 var113 = new class300(new byte[1000]);
                                    while (true) {
                                        int var114 = var112.read(var113.field3704, var113.field3703, 1000 - var113.field3703);
                                        if (var114 == -1) {
                                            var111.close();
                                            var112.close();
                                            String var116 = new String(var113.field3704);
                                            if (var116.startsWith("OFFLINE")) {
                                                var115 = 4;
                                            } else if (var116.startsWith("WRONG")) {
                                                var115 = 7;
                                            } else if (var116.startsWith("RELOAD")) {
                                                var115 = 3;
                                            } else if (var116.startsWith("Not permitted for social network accounts.")) {
                                                var115 = 6;
                                            } else {
                                                var113.method5258(var98);
                                                while (var113.field3703 > 0 && var113.field3704[var113.field3703 - 1] == 0) {
                                                    var113.field3703--;
                                                }
                                                String var117 = new String(var113.field3704, 0, var113.field3703);
                                                boolean var118;
                                                if (var117 == null) {
                                                    var118 = false;
                                                } else {
                                                    label1130: {
                                                        try {
                                                            new URL(var117);
                                                        } catch (MalformedURLException var137) {
                                                            var118 = false;
                                                            break label1130;
                                                        }
                                                        var118 = true;
                                                    }
                                                }
                                                if (var118) {
                                                    class51.method129(var117, true, false);
                                                    var115 = 2;
                                                } else {
                                                    var115 = 5;
                                                }
                                            }
                                            break;
                                        }
                                        var113.field3703 += var114;
                                        if (var113.field3703 >= 1000) {
                                            var115 = 5;
                                            break;
                                        }
                                    }
                                } catch (Throwable var138) {
                                    var138.printStackTrace();
                                    var115 = 5;
                                }
                                var93 = var115;
                            }
                            switch(var93) {
                                case 2:
                                    method242(class225.field2835, class225.field3015, class225.field3016);
                                    field1170 = 6;
                                    break;
                                case 3:
                                    method242(class225.field3017, class225.field3018, class225.field2766);
                                    break;
                                case 4:
                                    method242(class225.field3020, class225.field2985, class225.field3022);
                                    break;
                                case 5:
                                    method242(class225.field3023, class225.field3024, class225.field3025);
                                    break;
                                case 6:
                                    method242(class225.field2936, class225.field3027, class225.field2814);
                                    break;
                                case 7:
                                    method242(class225.field3029, class225.field3030, class225.field2807);
                            }
                        }
                        return;
                    }
                    if (var89 && field1175.length() < 320) {
                        field1175 = field1175 + Statics.field1522;
                    }
                }
            }
        } else if (field1170 == 6) {
            while (true) {
                do {
                    if (!class45.method695()) {
                        short var121 = 321;
                        if (var12 == 1 && var14 >= var121 - 20 && var14 <= var121 + 20) {
                            method4266(true);
                        }
                        return;
                    }
                } while (Statics.field1733 != 84 && Statics.field1733 != 13);
                method4266(true);
            }
        } else if (field1170 == 7) {
            int var122 = field1186 + 180 - 80;
            short var123 = 321;
            if (var12 == 1 && var13 >= var122 - 75 && var13 <= var122 + 75 && var14 >= var123 - 20 && var14 <= var123 + 20) {
                class51.method129(client.method3748("secure", true) + "m=dob/set_dob.ws", true, false);
                method242(class225.field3008, class225.field2755, class225.field3010);
                field1170 = 6;
                return;
            }
            int var124 = field1186 + 180 + 80;
            if (var12 == 1 && var13 >= var124 - 75 && var13 <= var124 + 75 && var14 >= var123 - 20 && var14 <= var123 + 20) {
                method4266(true);
            }
        } else if (field1170 == 8) {
            int var125 = field1186 + 180 - 80;
            short var126 = 321;
            if (var12 == 1 && var13 >= var125 - 75 && var13 <= var125 + 75 && var14 >= var126 - 20 && var14 <= var126 + 20) {
                class51.method129("https://www.jagex.com/terms/privacy/#eight", true, false);
                method242(class225.field3008, class225.field2755, class225.field3010);
                field1170 = 6;
                return;
            }
            int var127 = field1186 + 180 + 80;
            if (var12 == 1 && var13 >= var127 - 75 && var13 <= var127 + 75 && var14 >= var126 - 20 && var14 <= var126 + 20) {
                method4266(true);
            }
        } else if (field1170 == 12) {
            String var128 = "";
            switch(field1168) {
                case 0:
                    var128 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var128 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method4266(false);
            }
            int var129 = field1186 + 180;
            short var130 = 276;
            if (var12 == 1 && var13 >= var129 - 75 && var13 <= var129 + 75 && var14 >= var130 - 20 && var14 <= var130 + 20) {
                class51.method129(var128, true, false);
                method242(class225.field3008, class225.field2755, class225.field3010);
                field1170 = 6;
                return;
            }
            int var131 = field1186 + 180;
            short var132 = 326;
            if (var12 == 1 && var13 >= var131 - 75 && var13 <= var131 + 75 && var14 >= var132 - 20 && var14 <= var132 + 20) {
                method4266(false);
            }
        } else if (field1170 == 24) {
            int var133 = field1186 + 180;
            short var134 = 301;
            if (var12 == 1 && var13 >= var133 - 75 && var13 <= var133 + 75 && var14 >= var134 - 20 && var14 <= var134 + 20) {
                method4266(false);
            }
        }
    }

    @ObfuscatedName("e.p(CB)Z")
    public static boolean method56(char arg0) {
        for (int var1 = 0; var1 < field1181.length(); var1++) {
            if (arg0 == field1181.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("hk.b(CI)Z")
    public static boolean method3739(char arg0) {
        return field1181.indexOf(arg0) != -1;
    }

    @ObfuscatedName("ii.e(ZB)V")
    public static void method4266(boolean arg0) {
        field1172 = class225.field2959;
        field1173 = class225.field2960;
        field1177 = class225.field2961;
        field1170 = 2;
        if (arg0) {
            field1176 = "";
        }
        if (field1175 == null || field1175.length() <= 0) {
            if (Statics.field1071.field1031 == null) {
                client.field773 = false;
            } else {
                field1175 = Statics.field1071.field1031;
                client.field773 = true;
            }
        }
        method520();
    }

    @ObfuscatedName("gm.x(Lko;Lko;Lko;I)V")
    public static void method3471(class294 arg0, class294 arg1, class294 arg2) {
        field1155 = (Statics.field45 - 765) / 2;
        field1186 = field1155 + 202;
        Statics.field1270 = field1186 + 180;
        if (field1169) {
            method645(arg0, arg1);
            return;
        }
        Statics.field1926.method5662(field1155, 0);
        Statics.field490.method5662(field1155 + 382, 0);
        Statics.field1161.method5625(field1155 + 382 - Statics.field1161.field3860 / 2, 18);
        if (client.field645 == 0 || client.field645 == 5) {
            byte var3 = 20;
            arg0.method4988(class225.field2956, field1186 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class321.method5553(field1186 + 180 - 152, var4, 304, 34, 9179409);
            class321.method5553(field1186 + 180 - 151, var4 + 1, 302, 32, 0);
            class321.method5589(field1186 + 180 - 150, var4 + 2, field1178 * 3, 30, 9179409);
            class321.method5589(field1178 * 3 + (field1186 + 180 - 150), var4 + 2, 300 - field1178 * 3, 30, 0);
            arg0.method4988(field1167, field1186 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field645 == 20) {
            Statics.field1166.method5625(field1186 + 180 - Statics.field1166.field3860 / 2, 271 - Statics.field1166.field3857 / 2);
            short var5 = 201;
            arg0.method4988(field1172, field1186 + 180, var5, 16776960, 0);
            int var99 = var5 + 15;
            arg0.method4988(field1173, field1186 + 180, var99, 16776960, 0);
            int var100 = var99 + 15;
            arg0.method4988(field1177, field1186 + 180, var100, 16776960, 0);
            int var101 = var100 + 15;
            int var102 = var101 + 7;
            if (field1170 != 4) {
                arg0.method4966(class225.field2869, field1186 + 180 - 110, var102, 16777215, 0);
                short var6 = 200;
                String var9;
                if (Statics.field1071.field1030) {
                    String var7 = field1175;
                    String var8 = class291.method3097('*', var7.length());
                    var9 = var8;
                } else {
                    var9 = field1175;
                }
                String var11;
                for (var11 = var9; arg0.method4962(var11) > var6; var11 = var11.substring(0, var11.length() - 1)) {
                }
                arg0.method4966(class295.method4965(var11), field1186 + 180 - 70, var102, 16777215, 0);
                var99 = var102 + 15;
                String var12 = field1176;
                String var13 = class291.method3097('*', var12.length());
                String var14;
                for (var14 = var13; arg0.method4962(var14) > var6; var14 = var14.substring(1)) {
                }
                arg0.method4966(class225.field2897 + var14, field1186 + 180 - 108, var99, 16777215, 0);
                var99 += 15;
            }
        }
        if (client.field645 == 10 || client.field645 == 11) {
            Statics.field1166.method5625(field1186, 171);
            if (field1170 == 0) {
                short var15 = 251;
                arg0.method4988(class225.field2830, field1186 + 180, var15, 16776960, 0);
                int var103 = var15 + 30;
                int var16 = field1186 + 180 - 80;
                short var17 = 291;
                Statics.field1160.method5625(var16 - 73, var17 - 20);
                arg0.method4970(class225.field2990, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var18 = field1186 + 180 + 80;
                Statics.field1160.method5625(var18 - 73, var17 - 20);
                arg0.method4970(class225.field2991, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1170 == 1) {
                arg0.method4988(field1171, field1186 + 180, 201, 16776960, 0);
                short var19 = 236;
                arg0.method4988(field1172, field1186 + 180, var19, 16777215, 0);
                int var104 = var19 + 15;
                arg0.method4988(field1173, field1186 + 180, var104, 16777215, 0);
                int var105 = var104 + 15;
                arg0.method4988(field1177, field1186 + 180, var105, 16777215, 0);
                int var106 = var105 + 15;
                int var20 = field1186 + 180 - 80;
                short var21 = 321;
                Statics.field1160.method5625(var20 - 73, var21 - 20);
                arg0.method4988(class225.field2750, var20, var21 + 5, 16777215, 0);
                int var22 = field1186 + 180 + 80;
                Statics.field1160.method5625(var22 - 73, var21 - 20);
                arg0.method4988(class225.field2993, var22, var21 + 5, 16777215, 0);
            } else if (field1170 == 2) {
                short var23 = 201;
                arg0.method4988(field1172, Statics.field1270, var23, 16776960, 0);
                int var107 = var23 + 15;
                arg0.method4988(field1173, Statics.field1270, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg0.method4988(field1177, Statics.field1270, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var110 = var109 + 7;
                arg0.method4966(class225.field2869, Statics.field1270 - 110, var110, 16777215, 0);
                short var24 = 200;
                String var25 = Statics.field1071.field1030 ? class291.method4164(field1175) : field1175;
                String var26;
                for (var26 = var25; arg0.method4962(var26) > var24; var26 = var26.substring(1)) {
                }
                arg0.method4966(class295.method4965(var26) + (field1180 == 0 & client.field641 % 40 < 20 ? class82.method1876(16776960) + class82.field1123 : ""), Statics.field1270 - 70, var110, 16777215, 0);
                var107 = var110 + 15;
                String var27;
                for (var27 = class291.method4164(field1176); arg0.method4962(var27) > var24; var27 = var27.substring(1)) {
                }
                arg0.method4966(class225.field2897 + var27 + (field1180 == 1 & client.field641 % 40 < 20 ? class82.method1876(16776960) + class82.field1123 : ""), Statics.field1270 - 108, var107, 16777215, 0);
                var107 += 15;
                short var28 = 277;
                int var29 = Statics.field1270 + -117;
                boolean var30 = client.field773;
                boolean var31 = field1187;
                class324 var32 = var30 ? (var31 ? Statics.field1163 : Statics.field1162) : (var31 ? Statics.field65 : Statics.field2696);
                var32.method5625(var29, var28);
                int var34 = var32.field3860 + 5 + var29;
                arg1.method4966(class225.field2879, var34, var28 + 13, 16776960, 0);
                int var35 = Statics.field1270 + 24;
                boolean var36 = Statics.field1071.field1030;
                boolean var37 = field1183;
                class324 var38 = var36 ? (var37 ? Statics.field1163 : Statics.field1162) : (var37 ? Statics.field65 : Statics.field2696);
                var38.method5625(var35, var28);
                int var40 = var38.field3860 + 5 + var35;
                arg1.method4966(class225.field2836, var40, var28 + 13, 16776960, 0);
                int var111 = var28 + 15;
                int var41 = Statics.field1270 - 80;
                short var42 = 321;
                Statics.field1160.method5625(var41 - 73, var42 - 20);
                arg0.method4988(class225.field2992, var41, var42 + 5, 16777215, 0);
                int var43 = Statics.field1270 + 80;
                Statics.field1160.method5625(var43 - 73, var42 - 20);
                arg0.method4988(class225.field2993, var43, var42 + 5, 16777215, 0);
                short var44 = 357;
                switch(field1182) {
                    case 2:
                        Statics.field392 = class225.field3007;
                        break;
                    default:
                        Statics.field392 = class225.field3005;
                }
                Statics.field3522 = new class319(Statics.field1270, var44, arg1.method4962(Statics.field392), 11);
                Statics.field2398 = new class319(Statics.field1270, var44, arg1.method4962(class225.field3006), 11);
                arg1.method4988(Statics.field392, Statics.field1270, var44, 16777215, 0);
            } else if (field1170 == 3) {
                short var45 = 201;
                arg0.method4988(class225.field2996, field1186 + 180, var45, 16776960, 0);
                int var112 = var45 + 20;
                arg1.method4988(class225.field2983, field1186 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg1.method4988(class225.field2998, field1186 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var46 = field1186 + 180;
                short var47 = 276;
                Statics.field1160.method5625(var46 - 73, var47 - 20);
                arg2.method4988(class225.field2752, var46, var47 + 5, 16777215, 0);
                int var48 = field1186 + 180;
                short var49 = 326;
                Statics.field1160.method5625(var48 - 73, var49 - 20);
                arg2.method4988(class225.field3000, var48, var49 + 5, 16777215, 0);
            } else if (field1170 == 4) {
                arg0.method4988(class225.field2975, field1186 + 180, 201, 16776960, 0);
                short var50 = 236;
                arg0.method4988(field1172, field1186 + 180, var50, 16777215, 0);
                int var115 = var50 + 15;
                arg0.method4988(field1173, field1186 + 180, var115, 16777215, 0);
                int var116 = var115 + 15;
                arg0.method4988(field1177, field1186 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                String var52 = class225.field2932;
                String var53 = Statics.field1118;
                String var54 = class291.method3097('*', var53.length());
                arg0.method4966(var52 + var54 + (client.field641 % 40 < 20 ? class82.method1876(16776960) + class82.field1123 : ""), field1186 + 180 - 108, var117, 16777215, 0);
                int var118 = var117 - 8;
                arg0.method4966(class225.field2958, field1186 + 180 - 9, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg0.method4966(class225.field2795, field1186 + 180 - 9, var119, 16776960, 0);
                int var55 = field1186 + 180 - 9 + arg0.method4962(class225.field2795) + 15;
                int var56 = var119 - arg0.field3666;
                class324 var57;
                if (field1179) {
                    var57 = Statics.field1162;
                } else {
                    var57 = Statics.field2696;
                }
                var57.method5625(var55, var56);
                var115 = var119 + 15;
                int var58 = field1186 + 180 - 80;
                short var59 = 321;
                Statics.field1160.method5625(var58 - 73, var59 - 20);
                arg0.method4988(class225.field2750, var58, var59 + 5, 16777215, 0);
                int var60 = field1186 + 180 + 80;
                Statics.field1160.method5625(var60 - 73, var59 - 20);
                arg0.method4988(class225.field2993, var60, var59 + 5, 16777215, 0);
                arg1.method4988(class225.field2866, field1186 + 180, var59 + 36, 255, 0);
            } else if (field1170 == 5) {
                arg0.method4988(class225.field2921, field1186 + 180, 201, 16776960, 0);
                short var61 = 221;
                arg2.method4988(field1172, field1186 + 180, var61, 16776960, 0);
                int var120 = var61 + 15;
                arg2.method4988(field1173, field1186 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg2.method4988(field1177, field1186 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var123 = var122 + 14;
                arg0.method4966(class225.field2789, field1186 + 180 - 145, var123, 16777215, 0);
                short var62 = 174;
                String var65;
                if (Statics.field1071.field1030) {
                    String var63 = field1175;
                    String var64 = class291.method3097('*', var63.length());
                    var65 = var64;
                } else {
                    var65 = field1175;
                }
                String var67;
                for (var67 = var65; arg0.method4962(var67) > var62; var67 = var67.substring(1)) {
                }
                arg0.method4966(class295.method4965(var67) + (client.field641 % 40 < 20 ? class82.method1876(16776960) + class82.field1123 : ""), field1186 + 180 - 34, var123, 16777215, 0);
                var120 = var123 + 15;
                int var68 = field1186 + 180 - 80;
                short var69 = 321;
                Statics.field1160.method5625(var68 - 73, var69 - 20);
                arg0.method4988(class225.field3003, var68, var69 + 5, 16777215, 0);
                int var70 = field1186 + 180 + 80;
                Statics.field1160.method5625(var70 - 73, var69 - 20);
                arg0.method4988(class225.field3004, var70, var69 + 5, 16777215, 0);
                short var71 = 356;
                arg1.method4988(class225.field3006, Statics.field1270, var71, 268435455, 0);
            } else if (field1170 == 6) {
                short var72 = 201;
                arg0.method4988(field1172, field1186 + 180, var72, 16776960, 0);
                int var124 = var72 + 15;
                arg0.method4988(field1173, field1186 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method4988(field1177, field1186 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var73 = field1186 + 180;
                short var74 = 321;
                Statics.field1160.method5625(var73 - 73, var74 - 20);
                arg0.method4988(class225.field3004, var73, var74 + 5, 16777215, 0);
            } else if (field1170 == 7) {
                short var75 = 216;
                arg0.method4988(class225.field2965, field1186 + 180, var75, 16776960, 0);
                int var127 = var75 + 15;
                arg2.method4988(class225.field3033, field1186 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                arg2.method4988(class225.field3034, field1186 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                int var76 = field1186 + 180 - 80;
                short var77 = 321;
                Statics.field1160.method5625(var76 - 73, var77 - 20);
                arg0.method4988(class225.field2806, var76, var77 + 5, 16777215, 0);
                int var78 = field1186 + 180 + 80;
                Statics.field1160.method5625(var78 - 73, var77 - 20);
                arg0.method4988(class225.field3004, var78, var77 + 5, 16777215, 0);
            } else if (field1170 == 8) {
                short var79 = 216;
                arg0.method4988(class225.field2882, field1186 + 180, var79, 16776960, 0);
                int var130 = var79 + 15;
                arg2.method4988(class225.field2883, field1186 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg2.method4988(class225.field2884, field1186 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var80 = field1186 + 180 - 80;
                short var81 = 321;
                Statics.field1160.method5625(var80 - 73, var81 - 20);
                arg0.method4988(class225.field2885, var80, var81 + 5, 16777215, 0);
                int var82 = field1186 + 180 + 80;
                Statics.field1160.method5625(var82 - 73, var81 - 20);
                arg0.method4988(class225.field3004, var82, var81 + 5, 16777215, 0);
            } else if (field1170 == 12) {
                short var83 = 201;
                String var84 = "";
                String var85 = "";
                String var86 = "";
                switch(field1168) {
                    case 0:
                        var84 = class225.field2798;
                        var85 = class225.field2799;
                        var86 = class225.field2880;
                        break;
                    case 1:
                        var84 = class225.field2828;
                        var85 = class225.field2838;
                        var86 = class225.field2839;
                        break;
                    default:
                        method4266(false);
                }
                arg0.method4988(var84, field1186 + 180, var83, 16776960, 0);
                int var133 = var83 + 15;
                arg2.method4988(var85, field1186 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                arg2.method4988(var86, field1186 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                int var87 = field1186 + 180;
                short var88 = 276;
                Statics.field1160.method5625(var87 - 73, var88 - 20);
                arg0.method4988(class225.field2782, var87, var88 + 5, 16777215, 0);
                int var89 = field1186 + 180;
                short var90 = 326;
                Statics.field1160.method5625(var89 - 73, var90 - 20);
                arg0.method4988(class225.field3004, var89, var90 + 5, 16777215, 0);
            } else if (field1170 == 24) {
                short var91 = 221;
                arg0.method4988(field1172, field1186 + 180, var91, 16777215, 0);
                int var136 = var91 + 15;
                arg0.method4988(field1173, field1186 + 180, var136, 16777215, 0);
                int var137 = var136 + 15;
                arg0.method4988(field1177, field1186 + 180, var137, 16777215, 0);
                int var138 = var137 + 15;
                int var92 = field1186 + 180;
                short var93 = 301;
                Statics.field1160.method5625(var92 - 73, var93 - 20);
                arg0.method4988(class225.field2748, var92, var93 + 5, 16777215, 0);
            }
        }
        if (client.field645 >= 10) {
            int[] var94 = new int[4];
            class321.method5593(var94);
            class321.method5541(field1155, 0, field1155 + 765, Statics.field1152);
            Statics.field3279.method1638(field1155 - 22, client.field641);
            Statics.field3279.method1638(field1155 + 765 + 22 - 128, client.field641);
            class321.method5544(var94);
        }
        Statics.field251[Statics.field1071.field1029 ? 1 : 0].method5625(field1155 + 765 - 40, 463);
        if (client.field645 <= 5 || Statics.field2515 != class191.field2336) {
            return;
        }
        if (Statics.field484 == null) {
            Statics.field484 = class326.method716(Statics.field15, "sl_button", "");
            return;
        }
        int var95 = field1155 + 5;
        short var96 = 463;
        byte var97 = 100;
        byte var98 = 35;
        Statics.field484.method5625(var95, var96);
        arg0.method4988(class225.field2802 + " " + client.field829, var97 / 2 + var95, var98 / 2 + var96 - 2, 16777215, 0);
        if (Statics.field1190 == null) {
            arg1.method4988(class225.field3046, var97 / 2 + var95, var98 / 2 + var96 + 12, 16777215, 0);
        } else {
            arg1.method4988(class225.field3045, var97 / 2 + var95, var98 / 2 + var96 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("h.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method242(String arg0, String arg1, String arg2) {
        field1172 = arg0;
        field1173 = arg1;
        field1177 = arg2;
    }

    @ObfuscatedName("ae.d(Lko;Lko;S)V")
    public static void method645(class294 arg0, class294 arg1) {
        if (Statics.field2496 == null) {
            Statics.field2496 = class326.method1882(Statics.field15, "sl_back", "");
        }
        if (Statics.field284 == null) {
            Statics.field284 = class326.method3348(Statics.field15, "sl_flags", "");
        }
        if (Statics.field587 == null) {
            Statics.field587 = class326.method3348(Statics.field15, "sl_arrows", "");
        }
        if (Statics.field3225 == null) {
            Statics.field3225 = class326.method3348(Statics.field15, "sl_stars", "");
        }
        if (Statics.field43 == null) {
            Statics.field43 = class326.method716(Statics.field15, "leftarrow", "");
        }
        if (Statics.field3587 == null) {
            Statics.field3587 = class326.method716(Statics.field15, "rightarrow", "");
        }
        class321.method5589(field1155, 23, 765, 480, 0);
        class321.method5587(field1155, 0, 125, 23, 12425273, 9135624);
        class321.method5587(field1155 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4988(class225.field2754, field1155 + 62, 15, 0, -1);
        if (Statics.field3225 != null) {
            Statics.field3225[1].method5625(field1155 + 140, 1);
            arg1.method4966(class225.field3037, field1155 + 152, 10, 16777215, -1);
            Statics.field3225[0].method5625(field1155 + 140, 12);
            arg1.method4966(class225.field3038, field1155 + 152, 21, 16777215, -1);
        }
        if (Statics.field587 != null) {
            int var2 = field1155 + 280;
            if (class72.field998[0] == 0 && class72.field997[0] == 0) {
                Statics.field587[2].method5625(var2, 4);
            } else {
                Statics.field587[0].method5625(var2, 4);
            }
            if (class72.field998[0] == 0 && class72.field997[0] == 1) {
                Statics.field587[3].method5625(var2 + 15, 4);
            } else {
                Statics.field587[1].method5625(var2 + 15, 4);
            }
            arg0.method4966(class225.field3039, var2 + 32, 17, 16777215, -1);
            int var3 = field1155 + 390;
            if (class72.field998[0] == 1 && class72.field997[0] == 0) {
                Statics.field587[2].method5625(var3, 4);
            } else {
                Statics.field587[0].method5625(var3, 4);
            }
            if (class72.field998[0] == 1 && class72.field997[0] == 1) {
                Statics.field587[3].method5625(var3 + 15, 4);
            } else {
                Statics.field587[1].method5625(var3 + 15, 4);
            }
            arg0.method4966(class225.field3040, var3 + 32, 17, 16777215, -1);
            int var4 = field1155 + 500;
            if (class72.field998[0] == 2 && class72.field997[0] == 0) {
                Statics.field587[2].method5625(var4, 4);
            } else {
                Statics.field587[0].method5625(var4, 4);
            }
            if (class72.field998[0] == 2 && class72.field997[0] == 1) {
                Statics.field587[3].method5625(var4 + 15, 4);
            } else {
                Statics.field587[1].method5625(var4 + 15, 4);
            }
            arg0.method4966(class225.field3041, var4 + 32, 17, 16777215, -1);
            int var5 = field1155 + 610;
            if (class72.field998[0] == 3 && class72.field997[0] == 0) {
                Statics.field587[2].method5625(var5, 4);
            } else {
                Statics.field587[0].method5625(var5, 4);
            }
            if (class72.field998[0] == 3 && class72.field997[0] == 1) {
                Statics.field587[3].method5625(var5 + 15, 4);
            } else {
                Statics.field587[1].method5625(var5 + 15, 4);
            }
            arg0.method4966(class225.field2761, var5 + 32, 17, 16777215, -1);
        }
        class321.method5589(field1155 + 708, 4, 50, 16, 0);
        arg1.method4988(class225.field2993, field1155 + 708 + 25, 16, 16777215, -1);
        field1156 = -1;
        if (Statics.field2496 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1) - 1;
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class72.field995) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class72.field995) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class72.field995) {
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
            int var16 = (class72.field995 + var9 - 1) / var9;
            field1184 = var16 - var8;
            if (Statics.field43 != null && field1157 > 0) {
                Statics.field43.method5625(8, Statics.field1152 / 2 - Statics.field43.field3857 / 2);
            }
            if (Statics.field3587 != null && field1157 < field1184) {
                Statics.field3587.method5625(Statics.field45 - Statics.field3587.field3860 - 8, Statics.field1152 / 2 - Statics.field3587.field3857 / 2);
            }
            int var17 = var15 + 23;
            int var18 = field1155 + var14;
            int var19 = 0;
            boolean var20 = false;
            int var21 = field1157;
            for (int var22 = var9 * var21; var22 < class72.field995 && var21 - field1157 < var8; var22++) {
                class72 var23 = Statics.field1994[var22];
                boolean var24 = true;
                String var25 = Integer.toString(var23.field999);
                if (var23.field999 == -1) {
                    var25 = class225.field3042;
                    var24 = false;
                } else if (var23.field999 > 1980) {
                    var25 = class225.field3044;
                    var24 = false;
                }
                int var26 = 0;
                byte var27;
                if (var23.method1598()) {
                    if (var23.method1596()) {
                        var27 = 7;
                    } else {
                        var27 = 6;
                    }
                } else if (var23.method1597()) {
                    var26 = 16711680;
                    if (var23.method1596()) {
                        var27 = 5;
                    } else {
                        var27 = 4;
                    }
                } else if (var23.method1607()) {
                    if (var23.method1596()) {
                        var27 = 9;
                    } else {
                        var27 = 8;
                    }
                } else if (var23.method1595()) {
                    if (var23.method1596()) {
                        var27 = 3;
                    } else {
                        var27 = 2;
                    }
                } else if (var23.method1596()) {
                    var27 = 1;
                } else {
                    var27 = 0;
                }
                if (class54.field466 >= var18 && class54.field477 >= var17 && class54.field466 < var6 + var18 && class54.field477 < var7 + var17 && var24) {
                    field1156 = var22;
                    Statics.field2496[var27].method5714(var18, var17, 128, 16777215);
                    var20 = true;
                } else {
                    Statics.field2496[var27].method5662(var18, var17);
                }
                if (Statics.field284 != null) {
                    Statics.field284[(var23.method1596() ? 8 : 0) + var23.field991].method5625(var18 + 29, var17);
                }
                arg0.method4988(Integer.toString(var23.field1005), var18 + 15, var7 / 2 + var17 + 5, var26, -1);
                arg1.method4988(var25, var18 + 60, var7 / 2 + var17 + 5, 268435455, -1);
                var17 += var7 + var13;
                var19++;
                if (var19 >= var9) {
                    var17 = var15 + 23;
                    var18 += var6 + var12;
                    var19 = 0;
                    var21++;
                }
            }
            if (var20) {
                int var28 = arg1.method4962(Statics.field1994[field1156].field1004) + 6;
                int var29 = arg1.field3666 + 8;
                int var30 = class54.field477 + 25;
                if (var29 + var30 > 480) {
                    var30 = class54.field477 - 25 - var29;
                }
                class321.method5589(class54.field466 - var28 / 2, var30, var28, var29, 16777120);
                class321.method5553(class54.field466 - var28 / 2, var30, var28, var29, 0);
                arg1.method4988(Statics.field1994[field1156].field1004, class54.field466, arg1.field3666 + var30 + 4, 0, -1);
            }
        }
        Statics.field3579.method763(0, 0);
    }

    @ObfuscatedName("gd.c(Lbj;I)V")
    public static void method3329(class53 arg0) {
        while (class45.method695()) {
            if (Statics.field1733 == 13) {
                field1169 = false;
                Statics.field1926.method5662(field1155, 0);
                Statics.field490.method5662(field1155 + 382, 0);
                Statics.field1161.method5625(field1155 + 382 - Statics.field1161.field3860 / 2, 18);
                return;
            }
            if (Statics.field1733 == 96) {
                if (field1157 > 0 && Statics.field43 != null) {
                    field1157--;
                }
            } else if (Statics.field1733 == 97 && field1157 < field1184 && Statics.field3587 != null) {
                field1157++;
            }
        }
        if (class54.field473 != 1 && Statics.field3102 || class54.field473 != 4) {
            return;
        }
        int var1 = field1155 + 280;
        if (class54.field474 >= var1 && class54.field474 <= var1 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(0, 0);
            return;
        }
        if (class54.field474 >= var1 + 15 && class54.field474 <= var1 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(0, 1);
            return;
        }
        int var2 = field1155 + 390;
        if (class54.field474 >= var2 && class54.field474 <= var2 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(1, 0);
            return;
        }
        if (class54.field474 >= var2 + 15 && class54.field474 <= var2 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(1, 1);
            return;
        }
        int var3 = field1155 + 500;
        if (class54.field474 >= var3 && class54.field474 <= var3 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(2, 0);
            return;
        }
        if (class54.field474 >= var3 + 15 && class54.field474 <= var3 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(2, 1);
            return;
        }
        int var4 = field1155 + 610;
        if (class54.field474 >= var4 && class54.field474 <= var4 + 14 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(3, 0);
            return;
        }
        if (class54.field474 >= var4 + 15 && class54.field474 <= var4 + 80 && class54.field475 >= 4 && class54.field475 <= 18) {
            class72.method2271(3, 1);
            return;
        }
        if (class54.field474 >= field1155 + 708 && class54.field475 >= 4 && class54.field474 <= field1155 + 708 + 50 && class54.field475 <= 20) {
            field1169 = false;
            Statics.field1926.method5662(field1155, 0);
            Statics.field490.method5662(field1155 + 382, 0);
            Statics.field1161.method5625(field1155 + 382 - Statics.field1161.field3860 / 2, 18);
            return;
        }
        if (field1156 != -1) {
            class72 var5 = Statics.field1994[field1156];
            Statics.method692(var5);
            field1169 = false;
            Statics.field1926.method5662(field1155, 0);
            Statics.field490.method5662(field1155 + 382, 0);
            Statics.field1161.method5625(field1155 + 382 - Statics.field1161.field3860 / 2, 18);
            return;
        }
        if (field1157 > 0 && Statics.field43 != null && class54.field474 >= 0 && class54.field474 <= Statics.field43.field3860 && class54.field475 >= Statics.field1152 / 2 - 50 && class54.field475 <= Statics.field1152 / 2 + 50) {
            field1157--;
        }
        if (field1157 < field1184 && Statics.field3587 != null && class54.field474 >= Statics.field45 - Statics.field3587.field3860 - 5 && class54.field474 <= Statics.field45 && class54.field475 >= Statics.field1152 / 2 - 50 && class54.field475 <= Statics.field1152 / 2 + 50) {
            field1157++;
        }
    }

    @ObfuscatedName("hc.l(I)V")
    public static void method3727() {
        if (class72.method1048()) {
            field1169 = true;
            field1157 = 0;
            field1184 = 0;
        }
    }
}
