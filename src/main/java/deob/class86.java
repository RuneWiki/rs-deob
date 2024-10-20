package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("ct")
public class class86 {

    @ObfuscatedName("ct.o")
    public static int field1165 = 0;

    @ObfuscatedName("ct.y")
    public static int field1169 = field1165 + 202;

    @ObfuscatedName("ct.b")
    public static int field1170 = 10;

    @ObfuscatedName("ct.r")
    public static String field1171 = "";

    @ObfuscatedName("ct.ax")
    public static int field1166 = -1;

    @ObfuscatedName("ct.ay")
    public static int field1194 = 1;

    @ObfuscatedName("ct.ak")
    public static int field1177 = 0;

    @ObfuscatedName("ct.ac")
    public static String field1178 = "";

    @ObfuscatedName("ct.aw")
    public static String field1179 = "";

    @ObfuscatedName("ct.ar")
    public static String field1183 = "";

    @ObfuscatedName("ct.av")
    public static String field1167 = "";

    @ObfuscatedName("ct.al")
    public static String field1182 = "";

    @ObfuscatedName("ct.ad")
    public static String field1174 = "";

    @ObfuscatedName("ct.ab")
    public static boolean field1184 = false;

    @ObfuscatedName("ct.ap")
    public static boolean field1185 = false;

    @ObfuscatedName("ct.bf")
    public static boolean field1186 = true;

    @ObfuscatedName("ct.bc")
    public static int field1187 = 0;

    @ObfuscatedName("ct.bk")
    public static String field1189 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ct.bb")
    public static String field1175 = "1234567890";

    @ObfuscatedName("ct.bp")
    public static boolean field1190 = false;

    @ObfuscatedName("ct.ba")
    public static int field1191 = -1;

    @ObfuscatedName("ct.bd")
    public static int field1192 = 0;

    @ObfuscatedName("ct.bs")
    public static int field1193 = 0;

    @ObfuscatedName("ct.bh")
    public static long field1181;

    @ObfuscatedName("ct.bg")
    public static long field1195;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1181 = -1L;
        field1195 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gi.c(Lii;Lii;ZII)V")
    public static void method3362(class235 arg0, class235 arg1, boolean arg2, int arg3) {
        if (!Statics.field1164) {
            field1177 = arg3;
            class322.method5586();
            byte[] var4 = arg0.method3914("title.jpg", "");
            Statics.field1172 = class50.method151(var4);
            Statics.field285 = Statics.field1172.method5683();
            if ((client.field774 & 0x20000000) != 0) {
                Statics.field1604 = Statics.method171(arg1, "logo_deadman_mode", "");
            } else if ((client.field774 & 0x40000000) == 0) {
                Statics.field1604 = Statics.method171(arg1, "logo", "");
            } else {
                Statics.field1604 = Statics.method171(arg1, "logo_seasonal_mode", "");
            }
            Statics.field528 = Statics.method171(arg1, "titlebox", "");
            Statics.field1163 = Statics.method171(arg1, "titlebutton", "");
            Statics.field122 = class327.method3064(arg1, "runes", "");
            Statics.field1168 = class327.method3064(arg1, "title_mute", "");
            Statics.field244 = Statics.method171(arg1, "options_radio_buttons,0", "");
            Statics.field548 = Statics.method171(arg1, "options_radio_buttons,4", "");
            Statics.field2505 = Statics.method171(arg1, "options_radio_buttons,2", "");
            Statics.field1754 = Statics.method171(arg1, "options_radio_buttons,6", "");
            Statics.field2560 = Statics.field244.field3863;
            Statics.field191 = Statics.field244.field3864;
            Statics.field134 = new class73(Statics.field122);
            if (arg2) {
                field1182 = "";
                field1174 = "";
            }
            Statics.field1886 = 0;
            Statics.field1027 = "";
            field1186 = true;
            field1190 = false;
            if (Statics.field221.field1046) {
                class198.field2415 = 1;
                Statics.field1982 = null;
                Statics.field2411 = -1;
                Statics.field1150 = -1;
                Statics.field1156 = 0;
                Statics.field402 = false;
                Statics.field2413 = 2;
            } else {
                class198.method169(2, Statics.field484, "scape main", "", 255, false);
            }
            class238.method2569(false);
            Statics.field1164 = true;
            field1165 = (Statics.field3615 - 765) / 2;
            field1169 = field1165 + 202;
            Statics.field1315 = field1169 + 180;
            Statics.field1172.method5692(field1165, 0);
            Statics.field285.method5692(field1165 + 382, 0);
            Statics.field1604.method5663(field1165 + 382 - Statics.field1604.field3863 / 2, 18);
        } else if (arg3 == 4) {
            field1177 = 4;
        }
    }

    @ObfuscatedName("cm.t(ZZI)Lli;")
    public static class325 method1979(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1754 : Statics.field2505) : (arg1 ? Statics.field548 : Statics.field244);
    }

    @ObfuscatedName("cd.o(I)Ljava/lang/String;")
    public static String method1931() {
        return Statics.field221.field1051 ? class292.method273(field1182) : field1182;
    }

    @ObfuscatedName("co.e(I)V")
    public static void method1918() {
        if (client.field685 && field1182 != null && field1182.length() > 0) {
            field1187 = 1;
        } else {
            field1187 = 0;
        }
    }

    @ObfuscatedName("d.i(Lbf;I)V")
    public static void method64(class54 arg0) {
        if (field1190) {
            method3643(arg0);
            return;
        }
        if ((class55.field496 == 1 || !Statics.field540 && class55.field496 == 4) && class55.field497 >= field1165 + 765 - 50 && class55.field489 >= 453) {
            Statics.field221.field1046 = !Statics.field221.field1046;
            class74.method586();
            if (Statics.field221.field1046) {
                Statics.field2409.method3439();
                class198.field2415 = 1;
                Statics.field1982 = null;
            } else {
                class198.method3221(Statics.field484, "scape main", "", 255, false);
            }
        }
        if (client.field773 == 5) {
            return;
        }
        if (field1181 == -1L) {
            field1181 = Statics.method184() + 1000L;
        }
        long var1 = Statics.method184();
        if (client.method5657() && field1195 == -1L) {
            field1195 = var1;
            if (field1195 > field1181) {
                field1181 = field1195;
            }
        }
        if (client.field773 != 10 && client.field773 != 11) {
            return;
        }
        if (Statics.field3632 == class191.field2364) {
            if (class55.field496 == 1 || !Statics.field540 && class55.field496 == 4) {
                int var3 = field1165 + 5;
                short var4 = 463;
                byte var5 = 100;
                byte var6 = 35;
                if (class55.field497 >= var3 && class55.field497 <= var3 + var5 && class55.field489 >= var4 && class55.field489 <= var4 + var6) {
                    method1592();
                    return;
                }
            }
            if (Statics.field1013 != null) {
                method1592();
            }
        }
        int var7 = class55.field496;
        int var8 = class55.field497;
        int var9 = class55.field489;
        if (var7 == 0) {
            var8 = class55.field494;
            var9 = class55.field492;
        }
        if (!Statics.field540 && var7 == 4) {
            var7 = 1;
        }
        if (field1177 == 0) {
            boolean var10 = false;
            while (class46.method2342()) {
                if (Statics.field2103 == 84) {
                    var10 = true;
                }
            }
            int var11 = Statics.field1315 - 80;
            short var12 = 291;
            if (var7 == 1 && var8 >= var11 - 75 && var8 <= var11 + 75 && var9 >= var12 - 20 && var9 <= var12 + 20) {
                class52.method3723(client.method663("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = Statics.field1315 + 80;
            if (var7 == 1 && var8 >= var13 - 75 && var8 <= var13 + 75 && var9 >= var12 - 20 && var9 <= var12 + 20 || var10) {
                if ((client.field774 & 0x2000000) != 0) {
                    field1178 = "";
                    field1179 = class225.field2833;
                    field1183 = class225.field2996;
                    field1167 = class225.field2997;
                    field1177 = 1;
                    method1918();
                } else if ((client.field774 & 0x4) != 0) {
                    if ((client.field774 & 0x400) == 0) {
                        field1179 = class225.field3000;
                        field1183 = class225.field2987;
                        field1167 = class225.field2988;
                    } else {
                        field1179 = class225.field2913;
                        field1183 = class225.field2993;
                        field1167 = class225.field2994;
                    }
                    field1178 = class225.field2822;
                    field1177 = 1;
                    method1918();
                } else if ((client.field774 & 0x400) == 0) {
                    method2794(false);
                } else {
                    field1179 = class225.field2989;
                    field1183 = class225.field3066;
                    field1167 = class225.field2991;
                    field1178 = class225.field2822;
                    field1177 = 1;
                    method1918();
                }
            }
        } else if (field1177 == 1) {
            while (true) {
                if (!class46.method2342()) {
                    int var14 = Statics.field1315 - 80;
                    short var15 = 321;
                    if (var7 == 1 && var8 >= var14 - 75 && var8 <= var14 + 75 && var9 >= var15 - 20 && var9 <= var15 + 20) {
                        method2794(false);
                    }
                    int var16 = Statics.field1315 + 80;
                    if (var7 == 1 && var8 >= var16 - 75 && var8 <= var16 + 75 && var9 >= var15 - 20 && var9 <= var15 + 20) {
                        field1177 = 0;
                    }
                    break;
                }
                if (Statics.field2103 == 84) {
                    method2794(false);
                } else if (Statics.field2103 == 13) {
                    field1177 = 0;
                }
            }
        } else if (field1177 == 2) {
            short var17 = 201;
            int var67 = var17 + 52;
            if (var7 == 1 && var9 >= var67 - 12 && var9 < var67 + 2) {
                field1187 = 0;
            }
            var67 += 15;
            if (var7 == 1 && var9 >= var67 - 12 && var9 < var67 + 2) {
                field1187 = 1;
            }
            var67 += 15;
            short var18 = 361;
            if (Statics.field1176 != null) {
                int var19 = Statics.field1176.field3838 / 2;
                if (var7 == 1 && var8 >= Statics.field1176.field3837 - var19 && var8 <= Statics.field1176.field3837 + var19 && var9 >= var18 - 15 && var9 < var18) {
                    switch(field1194) {
                        case 1:
                            method1010(class225.field2799, class225.field3035, class225.field3036);
                            field1177 = 5;
                            return;
                        case 2:
                            class52.method3723("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var20 = Statics.field1315 - 80;
            short var21 = 321;
            if (var7 == 1 && var8 >= var20 - 75 && var8 <= var20 + 75 && var9 >= var21 - 20 && var9 <= var21 + 20) {
                field1182 = field1182.trim();
                if (field1182.length() == 0) {
                    method1010(class225.field2887, class225.field2888, class225.field2794);
                    return;
                }
                if (field1174.length() == 0) {
                    method1010(class225.field2890, class225.field2891, class225.field2892);
                    return;
                }
                method1010(class225.field2938, class225.field3001, class225.field2935);
                client.method3198(false);
                client.method1969(20);
                return;
            }
            int var22 = field1169 + 180 + 80;
            if (var7 == 1 && var8 >= var22 - 75 && var8 <= var22 + 75 && var9 >= var21 - 20 && var9 <= var21 + 20) {
                field1177 = 0;
                field1182 = "";
                field1174 = "";
                Statics.field1886 = 0;
                Statics.field1027 = "";
                field1186 = true;
            }
            int var23 = Statics.field1315 + -117;
            short var24 = 277;
            field1184 = var8 >= var23 && var8 < Statics.field2560 + var23 && var9 >= var24 && var9 < Statics.field191 + var24;
            if (var7 == 1 && field1184) {
                client.field685 = !client.field685;
                if (!client.field685 && Statics.field221.field1047 != null) {
                    Statics.field221.field1047 = null;
                    class74.method586();
                }
            }
            int var25 = Statics.field1315 + 24;
            short var26 = 277;
            field1185 = var8 >= var25 && var8 < Statics.field2560 + var25 && var9 >= var26 && var9 < Statics.field191 + var26;
            if (var7 == 1 && field1185) {
                Statics.field221.field1051 = !Statics.field221.field1051;
                if (!Statics.field221.field1051) {
                    field1182 = "";
                    Statics.field221.field1047 = null;
                    method1918();
                }
                class74.method586();
            }
            while (true) {
                Transferable var28;
                int var29;
                do {
                    while (true) {
                        label671: do {
                            while (true) {
                                while (class46.method2342()) {
                                    if (Statics.field2103 == 13) {
                                        field1177 = 0;
                                        field1182 = "";
                                        field1174 = "";
                                        Statics.field1886 = 0;
                                        Statics.field1027 = "";
                                        field1186 = true;
                                    } else {
                                        if (field1187 != 0) {
                                            continue label671;
                                        }
                                        method3634(Statics.field433);
                                        if (Statics.field2103 == 85 && field1182.length() > 0) {
                                            field1182 = field1182.substring(0, field1182.length() - 1);
                                        }
                                        if (Statics.field2103 == 84 || Statics.field2103 == 80) {
                                            field1187 = 1;
                                        }
                                        if (method4018(Statics.field433) && field1182.length() < 320) {
                                            field1182 = field1182 + Statics.field433;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1187 != 1);
                        if (Statics.field2103 == 85 && field1174.length() > 0) {
                            field1174 = field1174.substring(0, field1174.length() - 1);
                        } else if (Statics.field2103 == 84 || Statics.field2103 == 80) {
                            field1187 = 0;
                            if (Statics.field2103 == 84) {
                                field1182 = field1182.trim();
                                if (field1182.length() == 0) {
                                    method1010(class225.field2887, class225.field2888, class225.field2794);
                                    return;
                                }
                                if (field1174.length() == 0) {
                                    method1010(class225.field2890, class225.field2891, class225.field2892);
                                    return;
                                }
                                method1010(class225.field2938, class225.field3001, class225.field2935);
                                client.method3198(false);
                                client.method1969(20);
                                return;
                            }
                        }
                        if ((class46.field399[82] || class46.field399[87]) && Statics.field2103 == 67) {
                            Clipboard var27 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var28 = var27.getContents(Statics.field3618);
                            var29 = 20 - field1174.length();
                            break;
                        }
                        if (class289.method3211(Statics.field433) && method4018(Statics.field433) && field1174.length() < 20) {
                            field1174 = field1174 + Statics.field433;
                        }
                    }
                } while (var29 <= 0);
                try {
                    String var30 = (String) var28.getTransferData(DataFlavor.stringFlavor);
                    int var31 = Math.min(var29, var30.length());
                    for (int var32 = 0; var32 < var31; var32++) {
                        if (!class289.method3211(var30.charAt(var32)) || !method4018(var30.charAt(var32))) {
                            field1177 = 3;
                            return;
                        }
                    }
                    field1174 = field1174 + var30.substring(0, var31);
                } catch (UnsupportedFlavorException var65) {
                } catch (IOException var66) {
                }
            }
        } else if (field1177 == 3) {
            int var35 = field1169 + 180;
            short var36 = 276;
            if (var7 == 1 && var8 >= var35 - 75 && var8 <= var35 + 75 && var9 >= var36 - 20 && var9 <= var36 + 20) {
                method2794(false);
            }
            int var37 = field1169 + 180;
            short var38 = 326;
            if (var7 == 1 && var8 >= var37 - 75 && var8 <= var37 + 75 && var9 >= var38 - 20 && var9 <= var38 + 20) {
                method1010(class225.field2799, class225.field3035, class225.field3036);
                field1177 = 5;
                return;
            }
        } else if (field1177 == 4) {
            int var39 = field1169 + 180 - 80;
            short var40 = 321;
            if (var7 == 1 && var8 >= var39 - 75 && var8 <= var39 + 75 && var9 >= var40 - 20 && var9 <= var40 + 20) {
                Statics.field1027.trim();
                if (Statics.field1027.length() != 6) {
                    method1010(class225.field2841, class225.field2807, class225.field2808);
                    return;
                }
                Statics.field1886 = Integer.parseInt(Statics.field1027);
                Statics.field1027 = "";
                client.method3198(true);
                method1010(class225.field2938, class225.field3001, class225.field2935);
                client.method1969(20);
                return;
            }
            if (var7 == 1 && var8 >= field1169 + 180 - 9 && var8 <= field1169 + 180 + 130 && var9 >= 263 && var9 <= 296) {
                field1186 = !field1186;
            }
            if (var7 == 1 && var8 >= field1169 + 180 - 34 && var8 <= field1169 + 180 + 34 && var9 >= 351 && var9 <= 363) {
                class52.method3723(client.method663("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var41 = field1169 + 180 + 80;
            if (var7 == 1 && var8 >= var41 - 75 && var8 <= var41 + 75 && var9 >= var40 - 20 && var9 <= var40 + 20) {
                field1177 = 0;
                field1182 = "";
                field1174 = "";
                Statics.field1886 = 0;
                Statics.field1027 = "";
            }
            while (class46.method2342()) {
                boolean var42 = false;
                for (int var43 = 0; var43 < field1175.length(); var43++) {
                    if (Statics.field433 == field1175.charAt(var43)) {
                        var42 = true;
                        break;
                    }
                }
                if (Statics.field2103 == 13) {
                    field1177 = 0;
                    field1182 = "";
                    field1174 = "";
                    Statics.field1886 = 0;
                    Statics.field1027 = "";
                } else {
                    if (Statics.field2103 == 85 && Statics.field1027.length() > 0) {
                        Statics.field1027 = Statics.field1027.substring(0, Statics.field1027.length() - 1);
                    }
                    if (Statics.field2103 == 84) {
                        Statics.field1027.trim();
                        if (Statics.field1027.length() != 6) {
                            method1010(class225.field2841, class225.field2807, class225.field2808);
                            return;
                        }
                        Statics.field1886 = Integer.parseInt(Statics.field1027);
                        Statics.field1027 = "";
                        client.method3198(true);
                        method1010(class225.field2938, class225.field3001, class225.field2935);
                        client.method1969(20);
                        return;
                    }
                    if (var42 && Statics.field1027.length() < 6) {
                        Statics.field1027 = Statics.field1027 + Statics.field433;
                    }
                }
            }
        } else if (field1177 == 5) {
            int var44 = field1169 + 180 - 80;
            short var45 = 321;
            if (var7 == 1 && var8 >= var44 - 75 && var8 <= var44 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                method282();
                return;
            }
            int var46 = field1169 + 180 + 80;
            if (var7 == 1 && var8 >= var46 - 75 && var8 <= var46 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                method2794(true);
            }
            short var47 = 361;
            if (Statics.field316 != null) {
                int var48 = Statics.field316.field3838 / 2;
                if (var7 == 1 && var8 >= Statics.field316.field3837 - var48 && var8 <= Statics.field316.field3837 + var48 && var9 >= var47 - 15 && var9 < var47) {
                    class52.method3723(client.method663("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method2342()) {
                boolean var49 = false;
                for (int var50 = 0; var50 < field1189.length(); var50++) {
                    if (Statics.field433 == field1189.charAt(var50)) {
                        var49 = true;
                        break;
                    }
                }
                if (Statics.field2103 == 13) {
                    method2794(true);
                } else {
                    if (Statics.field2103 == 85 && field1182.length() > 0) {
                        field1182 = field1182.substring(0, field1182.length() - 1);
                    }
                    if (Statics.field2103 == 84) {
                        method282();
                        return;
                    }
                    if (var49 && field1182.length() < 320) {
                        field1182 = field1182 + Statics.field433;
                    }
                }
            }
        } else if (field1177 == 6) {
            while (true) {
                do {
                    if (!class46.method2342()) {
                        short var51 = 321;
                        if (var7 == 1 && var9 >= var51 - 20 && var9 <= var51 + 20) {
                            method2794(true);
                        }
                        return;
                    }
                } while (Statics.field2103 != 84 && Statics.field2103 != 13);
                method2794(true);
            }
        } else if (field1177 == 7) {
            int var52 = field1169 + 180 - 80;
            short var53 = 321;
            if (var7 == 1 && var8 >= var52 - 75 && var8 <= var52 + 75 && var9 >= var53 - 20 && var9 <= var53 + 20) {
                class52.method3723(client.method663("secure", true) + "m=dob/set_dob.ws", true, false);
                method1010(class225.field2977, class225.field3032, class225.field2903);
                field1177 = 6;
                return;
            }
            int var54 = field1169 + 180 + 80;
            if (var7 == 1 && var8 >= var54 - 75 && var8 <= var54 + 75 && var9 >= var53 - 20 && var9 <= var53 + 20) {
                method2794(true);
            }
        } else if (field1177 == 8) {
            int var55 = field1169 + 180 - 80;
            short var56 = 321;
            if (var7 == 1 && var8 >= var55 - 75 && var8 <= var55 + 75 && var9 >= var56 - 20 && var9 <= var56 + 20) {
                class52.method3723("https://www.jagex.com/terms/privacy", true, false);
                method1010(class225.field2977, class225.field3032, class225.field2903);
                field1177 = 6;
                return;
            }
            int var57 = field1169 + 180 + 80;
            if (var7 == 1 && var8 >= var57 - 75 && var8 <= var57 + 75 && var9 >= var56 - 20 && var9 <= var56 + 20) {
                method2794(true);
            }
        } else if (field1177 == 12) {
            String var58 = "";
            switch(field1166) {
                case 0:
                    var58 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var58 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method2794(false);
            }
            int var59 = field1169 + 180;
            short var60 = 276;
            if (var7 == 1 && var8 >= var59 - 75 && var8 <= var59 + 75 && var9 >= var60 - 20 && var9 <= var60 + 20) {
                class52.method3723(var58, true, false);
                method1010(class225.field2977, class225.field3032, class225.field2903);
                field1177 = 6;
                return;
            }
            int var61 = field1169 + 180;
            short var62 = 326;
            if (var7 == 1 && var8 >= var61 - 75 && var8 <= var61 + 75 && var9 >= var62 - 20 && var9 <= var62 + 20) {
                method2794(false);
            }
        } else if (field1177 == 24) {
            int var63 = field1169 + 180;
            short var64 = 301;
            if (var7 == 1 && var8 >= var63 - 75 && var8 <= var63 + 75 && var9 >= var64 - 20 && var9 <= var64 + 20) {
                method2794(false);
            }
        }
    }

    @ObfuscatedName("gc.g(CI)Z")
    public static boolean method3634(char arg0) {
        for (int var1 = 0; var1 < field1189.length(); var1++) {
            if (arg0 == field1189.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("in.d(CI)Z")
    public static boolean method4018(char arg0) {
        return field1189.indexOf(arg0) != -1;
    }

    @ObfuscatedName("da.l(ZI)V")
    public static void method2794(boolean arg0) {
        field1179 = class225.field2982;
        field1183 = class225.field2801;
        field1167 = class225.field2984;
        field1177 = 2;
        if (arg0) {
            field1174 = "";
        }
        if (field1182 == null || field1182.length() <= 0) {
            if (Statics.field221.field1047 == null) {
                client.field685 = false;
            } else {
                field1182 = Statics.field221.field1047;
                client.field685 = true;
            }
        }
        method1918();
    }

    @ObfuscatedName("a.j(I)V")
    public static void method282() {
        field1182 = field1182.trim();
        if (field1182.length() == 0) {
            method1010(class225.field2799, class225.field3035, class225.field3036);
            return;
        }
        long var0 = class81.method505();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class81.method1887(var0, field1182);
        }
        switch(var2) {
            case 2:
                method1010(class225.field3037, class225.field3038, class225.field2934);
                field1177 = 6;
                break;
            case 3:
                method1010(class225.field3040, class225.field3041, class225.field3042);
                break;
            case 4:
                method1010(class225.field2942, class225.field3044, class225.field3045);
                break;
            case 5:
                method1010(class225.field2905, class225.field2839, class225.field3048);
                break;
            case 6:
                method1010(class225.field2990, class225.field3050, class225.field2864);
                break;
            case 7:
                method1010(class225.field3052, class225.field3053, class225.field3029);
        }
    }

    @ObfuscatedName("bk.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1010(String arg0, String arg1, String arg2) {
        field1179 = arg0;
        field1183 = arg1;
        field1167 = arg2;
    }

    @ObfuscatedName("ht.h(Lbf;B)V")
    public static void method3643(class54 arg0) {
        while (class46.method2342()) {
            if (Statics.field2103 == 13) {
                field1190 = false;
                Statics.field1172.method5692(field1165, 0);
                Statics.field285.method5692(field1165 + 382, 0);
                Statics.field1604.method5663(field1165 + 382 - Statics.field1604.field3863 / 2, 18);
                return;
            }
            if (Statics.field2103 == 96) {
                if (field1192 > 0 && Statics.field48 != null) {
                    field1192--;
                }
            } else if (Statics.field2103 == 97 && field1192 < field1193 && Statics.field286 != null) {
                field1192++;
            }
        }
        if (class55.field496 != 1 && Statics.field540 || class55.field496 != 4) {
            return;
        }
        int var1 = field1165 + 280;
        if (class55.field497 >= var1 && class55.field497 <= var1 + 14 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(0, 0);
            return;
        }
        if (class55.field497 >= var1 + 15 && class55.field497 <= var1 + 80 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(0, 1);
            return;
        }
        int var2 = field1165 + 390;
        if (class55.field497 >= var2 && class55.field497 <= var2 + 14 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(1, 0);
            return;
        }
        if (class55.field497 >= var2 + 15 && class55.field497 <= var2 + 80 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(1, 1);
            return;
        }
        int var3 = field1165 + 500;
        if (class55.field497 >= var3 && class55.field497 <= var3 + 14 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(2, 0);
            return;
        }
        if (class55.field497 >= var3 + 15 && class55.field497 <= var3 + 80 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(2, 1);
            return;
        }
        int var4 = field1165 + 610;
        if (class55.field497 >= var4 && class55.field497 <= var4 + 14 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(3, 0);
            return;
        }
        if (class55.field497 >= var4 + 15 && class55.field497 <= var4 + 80 && class55.field489 >= 4 && class55.field489 <= 18) {
            class72.method2317(3, 1);
            return;
        }
        if (class55.field497 >= field1165 + 708 && class55.field489 >= 4 && class55.field497 <= field1165 + 708 + 50 && class55.field489 <= 20) {
            field1190 = false;
            Statics.field1172.method5692(field1165, 0);
            Statics.field285.method5692(field1165 + 382, 0);
            Statics.field1604.method5663(field1165 + 382 - Statics.field1604.field3863 / 2, 18);
            return;
        }
        if (field1191 != -1) {
            class72 var5 = Statics.field1313[field1191];
            method58(var5);
            field1190 = false;
            Statics.field1172.method5692(field1165, 0);
            Statics.field285.method5692(field1165 + 382, 0);
            Statics.field1604.method5663(field1165 + 382 - Statics.field1604.field3863 / 2, 18);
            return;
        }
        if (field1192 > 0 && Statics.field48 != null && class55.field497 >= 0 && class55.field497 <= Statics.field48.field3863 && class55.field489 >= Statics.field345 / 2 - 50 && class55.field489 <= Statics.field345 / 2 + 50) {
            field1192--;
        }
        if (field1192 < field1193 && Statics.field286 != null && class55.field497 >= Statics.field3615 - Statics.field286.field3863 - 5 && class55.field497 <= Statics.field3615 && class55.field489 >= Statics.field345 / 2 - 50 && class55.field489 <= Statics.field345 / 2 + 50) {
            field1192++;
        }
    }

    @ObfuscatedName("d.v(Lbg;I)V")
    public static void method58(class72 arg0) {
        if (arg0.method1595() != client.field695) {
            client.field695 = arg0.method1595();
            class256.method177(arg0.method1595());
        }
        Statics.field2072 = arg0.field1020;
        client.field646 = arg0.field1014;
        client.field774 = arg0.field1017;
        Statics.field139 = client.field816 == 0 ? 43594 : arg0.field1014 + 40000;
        Statics.field916 = client.field816 == 0 ? 443 : arg0.field1014 + 50000;
        Statics.field209 = Statics.field139;
    }

    @ObfuscatedName("bg.n(I)V")
    public static void method1592() {
        if (class72.method3170()) {
            field1190 = true;
            field1192 = 0;
            field1193 = 0;
        }
    }

    @ObfuscatedName("cg.x(I)V")
    public static void method1903() {
        field1177 = 24;
        method1010(class225.field3003, class225.field2902, class225.field2836);
    }

    @ObfuscatedName("as.w(I)V")
    public static void method536() {
        field1177 = 24;
        method1010(class225.field2768, class225.field3007, class225.field3014);
    }
}
