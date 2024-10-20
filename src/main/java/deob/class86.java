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

@ObfuscatedName("ci")
public class class86 {

    @ObfuscatedName("ci.n")
    public static int field1159 = 0;

    @ObfuscatedName("ci.b")
    public static int field1180 = field1159 + 202;

    @ObfuscatedName("ci.f")
    public static int field1164 = 10;

    @ObfuscatedName("ci.g")
    public static String field1165 = "";

    @ObfuscatedName("ci.aq")
    public static int field1157 = -1;

    @ObfuscatedName("ci.ak")
    public static int field1167 = 1;

    @ObfuscatedName("ci.ax")
    public static int field1177 = 0;

    @ObfuscatedName("ci.al")
    public static String field1169 = "";

    @ObfuscatedName("ci.ap")
    public static String field1170 = "";

    @ObfuscatedName("ci.aj")
    public static String field1190 = "";

    @ObfuscatedName("ci.ae")
    public static String field1172 = "";

    @ObfuscatedName("ci.au")
    public static String field1173 = "";

    @ObfuscatedName("ci.ah")
    public static String field1174 = "";

    @ObfuscatedName("ci.ac")
    public static boolean field1160 = false;

    @ObfuscatedName("ci.at")
    public static boolean field1176 = false;

    @ObfuscatedName("ci.bg")
    public static boolean field1178 = true;

    @ObfuscatedName("ci.bc")
    public static int field1179 = 0;

    @ObfuscatedName("ci.bd")
    public static String field1185 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ci.bx")
    public static String field1168 = "1234567890";

    @ObfuscatedName("ci.bh")
    public static boolean field1182 = false;

    @ObfuscatedName("ci.bj")
    public static int field1183 = -1;

    @ObfuscatedName("ci.bm")
    public static int field1184 = 0;

    @ObfuscatedName("ci.bn")
    public static int field1158 = 0;

    @ObfuscatedName("ci.bo")
    public static long field1186;

    @ObfuscatedName("ci.bk")
    public static long field1187;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1186 = -1L;
        field1187 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.a(Lhq;Lhq;B)I")
    public static int method150(class234 arg0, class234 arg1) {
        int var2 = 0;
        if (arg0.method3895("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3895("logo", "")) {
            var2++;
        }
        if (arg1.method3895("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3895("logo_seasonal_mode", "")) {
            var2++;
        }
        if (arg1.method3895("titlebox", "")) {
            var2++;
        }
        if (arg1.method3895("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3895("runes", "")) {
            var2++;
        }
        if (arg1.method3895("title_mute", "")) {
            var2++;
        }
        if (arg1.method3895("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3895("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3895("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3895("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3895("sl_back", "");
        arg1.method3895("sl_flags", "");
        arg1.method3895("sl_arrows", "");
        arg1.method3895("sl_stars", "");
        arg1.method3895("sl_button", "");
        return var2;
    }

    @ObfuscatedName("gz.t(S)I")
    public static int method3645() {
        return 12;
    }

    @ObfuscatedName("cr.n(Lhq;Lhq;ZIS)V")
    public static void method1997(class234 arg0, class234 arg1, boolean arg2, int arg3) {
        if (!Statics.field1189) {
            field1177 = arg3;
            class321.method5582();
            byte[] var4 = arg0.method3878("title.jpg", "");
            Statics.field1171 = class50.method545(var4);
            Statics.field3651 = Statics.field1171.method5684();
            if ((client.field768 & 0x20000000) != 0) {
                Statics.field501 = class326.method3399(arg1, "logo_deadman_mode", "");
            } else if ((client.field768 & 0x40000000) == 0) {
                Statics.field501 = class326.method3399(arg1, "logo", "");
            } else {
                Statics.field501 = class326.method3399(arg1, "logo_seasonal_mode", "");
            }
            Statics.field1112 = class326.method3399(arg1, "titlebox", "");
            Statics.field1958 = class326.method3399(arg1, "titlebutton", "");
            Statics.field2485 = class326.method3743(arg1, "runes", "");
            Statics.field1437 = class326.method3743(arg1, "title_mute", "");
            Statics.field1964 = class326.method3399(arg1, "options_radio_buttons,0", "");
            Statics.field413 = class326.method3399(arg1, "options_radio_buttons,4", "");
            Statics.field1163 = class326.method3399(arg1, "options_radio_buttons,2", "");
            Statics.field24 = class326.method3399(arg1, "options_radio_buttons,6", "");
            Statics.field1175 = Statics.field1964.field3854;
            Statics.field2329 = Statics.field1964.field3857;
            Statics.field1162 = new class73(Statics.field2485);
            if (arg2) {
                field1173 = "";
                field1174 = "";
            }
            Statics.field2492 = 0;
            Statics.field3549 = "";
            field1178 = true;
            field1182 = false;
            if (Statics.field562.field1034) {
                class198.method1977(2);
            } else {
                class236 var5 = Statics.field2532;
                int var6 = var5.method3891("scape main");
                int var7 = var5.method3870(var6, "");
                Statics.method221(2, var5, var6, var7, 255, false);
            }
            class237.method3110(false);
            Statics.field1189 = true;
            field1159 = (Statics.field3628 - 765) / 2;
            field1180 = field1159 + 202;
            Statics.field2357 = field1180 + 180;
            Statics.field1171.method5693(field1159, 0);
            Statics.field3651.method5693(field1159 + 382, 0);
            Statics.field501.method5658(field1159 + 382 - Statics.field501.field3854 / 2, 18);
        } else if (arg3 == 4) {
            field1177 = 4;
        }
    }

    @ObfuscatedName("bi.q(I)Ljava/lang/String;")
    public static String method1103() {
        String var6;
        if (Statics.field562.field1038) {
            String var0 = field1173;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1173;
        }
        return var6;
    }

    @ObfuscatedName("hf.v(I)V")
    public static void method3727() {
        if (!Statics.field1189) {
            return;
        }
        Statics.field1112 = null;
        Statics.field1958 = null;
        Statics.field2485 = null;
        Statics.field1171 = null;
        Statics.field3651 = null;
        Statics.field501 = null;
        Statics.field1437 = null;
        Statics.field1964 = null;
        Statics.field1163 = null;
        Statics.field41 = null;
        Statics.field2030 = null;
        Statics.field3100 = null;
        Statics.field1084 = null;
        Statics.field588 = null;
        Statics.field1162.method1747();
        class198.method1977(2);
        class237.method3110(true);
        Statics.field1189 = false;
    }

    @ObfuscatedName("gf.l(Lbg;I)V")
    public static void method3433(class54 arg0) {
        if (field1182) {
            while (true) {
                if (!class46.method4057()) {
                    if (class55.field473 != 1 && (Statics.field113 || class55.field473 != 4)) {
                        break;
                    }
                    int var1 = field1159 + 280;
                    if (class55.field464 >= var1 && class55.field464 <= var1 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(0, 0);
                        break;
                    }
                    if (class55.field464 >= var1 + 15 && class55.field464 <= var1 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(0, 1);
                        break;
                    }
                    int var2 = field1159 + 390;
                    if (class55.field464 >= var2 && class55.field464 <= var2 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(1, 0);
                        break;
                    }
                    if (class55.field464 >= var2 + 15 && class55.field464 <= var2 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(1, 1);
                        break;
                    }
                    int var3 = field1159 + 500;
                    if (class55.field464 >= var3 && class55.field464 <= var3 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(2, 0);
                        break;
                    }
                    if (class55.field464 >= var3 + 15 && class55.field464 <= var3 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(2, 1);
                        break;
                    }
                    int var4 = field1159 + 610;
                    if (class55.field464 >= var4 && class55.field464 <= var4 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(3, 0);
                        break;
                    }
                    if (class55.field464 >= var4 + 15 && class55.field464 <= var4 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
                        class72.method3107(3, 1);
                        break;
                    }
                    if (class55.field464 >= field1159 + 708 && class55.field469 >= 4 && class55.field464 <= field1159 + 708 + 50 && class55.field469 <= 20) {
                        field1182 = false;
                        Statics.field1171.method5693(field1159, 0);
                        Statics.field3651.method5693(field1159 + 382, 0);
                        Statics.field501.method5658(field1159 + 382 - Statics.field501.field3854 / 2, 18);
                        break;
                    }
                    if (field1183 == -1) {
                        if (field1184 > 0 && Statics.field3635 != null && class55.field464 >= 0 && class55.field464 <= Statics.field3635.field3854 && class55.field469 >= Statics.field3243 / 2 - 50 && class55.field469 <= Statics.field3243 / 2 + 50) {
                            field1184--;
                        }
                        if (field1184 < field1158 && Statics.field188 != null && class55.field464 >= Statics.field3628 - Statics.field188.field3854 - 5 && class55.field464 <= Statics.field3628 && class55.field469 >= Statics.field3243 / 2 - 50 && class55.field469 <= Statics.field3243 / 2 + 50) {
                            field1184++;
                        }
                    } else {
                        class72 var5 = Statics.field3608[field1183];
                        method1104(var5);
                        field1182 = false;
                        Statics.field1171.method5693(field1159, 0);
                        Statics.field3651.method5693(field1159 + 382, 0);
                        Statics.field501.method5658(field1159 + 382 - Statics.field501.field3854 / 2, 18);
                    }
                    break;
                }
                if (Statics.field230 == 13) {
                    field1182 = false;
                    Statics.field1171.method5693(field1159, 0);
                    Statics.field3651.method5693(field1159 + 382, 0);
                    Statics.field501.method5658(field1159 + 382 - Statics.field501.field3854 / 2, 18);
                    break;
                }
                if (Statics.field230 == 96) {
                    if (field1184 > 0 && Statics.field3635 != null) {
                        field1184--;
                    }
                } else if (Statics.field230 == 97 && field1184 < field1158 && Statics.field188 != null) {
                    field1184++;
                }
            }
            return;
        }
        if ((class55.field473 == 1 || !Statics.field113 && class55.field473 == 4) && class55.field464 >= field1159 + 765 - 50 && class55.field469 >= 453) {
            Statics.field562.field1034 = !Statics.field562.field1034;
            class74.method4291();
            if (Statics.field562.field1034) {
                class198.method2208();
            } else {
                class198.method290(Statics.field2532, "scape main", "", 255, false);
            }
        }
        if (client.field640 == 5) {
            return;
        }
        if (field1186 == -1L) {
            field1186 = class297.method3777() + 1000L;
        }
        long var6 = class297.method3777();
        boolean var8;
        if (client.field691 == null || client.field903 >= client.field691.size()) {
            var8 = true;
        } else {
            while (true) {
                if (client.field903 >= client.field691.size()) {
                    var8 = true;
                    break;
                }
                class59 var9 = (class59) client.field691.get(client.field903);
                if (!var9.method1067()) {
                    var8 = false;
                    break;
                }
                client.field903++;
            }
        }
        if (var8 && field1187 == -1L) {
            field1187 = var6;
            if (field1187 > field1186) {
                field1186 = field1187;
            }
        }
        if (client.field640 != 10 && client.field640 != 11) {
            return;
        }
        if (Statics.field281 == class191.field2332) {
            if (class55.field473 == 1 || !Statics.field113 && class55.field473 == 4) {
                int var10 = field1159 + 5;
                short var11 = 463;
                byte var12 = 100;
                byte var13 = 35;
                if (class55.field464 >= var10 && class55.field464 <= var10 + var12 && class55.field469 >= var11 && class55.field469 <= var11 + var13) {
                    method1996();
                    return;
                }
            }
            if (Statics.field1299 != null) {
                method1996();
            }
        }
        int var14 = class55.field473;
        int var15 = class55.field464;
        int var16 = class55.field469;
        if (var14 == 0) {
            var15 = class55.field466;
            var16 = class55.field467;
        }
        if (!Statics.field113 && var14 == 4) {
            var14 = 1;
        }
        if (field1177 == 0) {
            boolean var17 = false;
            while (class46.method4057()) {
                if (Statics.field230 == 84) {
                    var17 = true;
                }
            }
            int var18 = Statics.field2357 - 80;
            short var19 = 291;
            if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                class52.method27(client.method4102("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var20 = Statics.field2357 + 80;
            if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                if ((client.field768 & 0x2000000) != 0) {
                    field1169 = "";
                    field1170 = class225.field2971;
                    field1190 = class225.field2972;
                    field1172 = class225.field2973;
                    field1177 = 1;
                    if (client.field671 && field1173 != null && field1173.length() > 0) {
                        field1179 = 1;
                    } else {
                        field1179 = 0;
                    }
                } else if ((client.field768 & 0x4) != 0) {
                    if ((client.field768 & 0x400) == 0) {
                        field1170 = class225.field2942;
                        field1190 = class225.field2963;
                        field1172 = class225.field2891;
                    } else {
                        field1170 = class225.field2790;
                        field1190 = class225.field2890;
                        field1172 = class225.field2970;
                    }
                    field1169 = class225.field2999;
                    field1177 = 1;
                    if (client.field671 && field1173 != null && field1173.length() > 0) {
                        field1179 = 1;
                    } else {
                        field1179 = 0;
                    }
                } else if ((client.field768 & 0x400) == 0) {
                    method3230(false);
                } else {
                    field1170 = class225.field2965;
                    field1190 = class225.field2906;
                    field1172 = class225.field2967;
                    field1169 = class225.field2999;
                    field1177 = 1;
                    if (client.field671 && field1173 != null && field1173.length() > 0) {
                        field1179 = 1;
                    } else {
                        field1179 = 0;
                    }
                }
            }
        } else if (field1177 == 1) {
            while (true) {
                if (!class46.method4057()) {
                    int var21 = Statics.field2357 - 80;
                    short var22 = 321;
                    if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                        method3230(false);
                    }
                    int var23 = Statics.field2357 + 80;
                    if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                        field1177 = 0;
                    }
                    break;
                }
                if (Statics.field230 == 84) {
                    method3230(false);
                } else if (Statics.field230 == 13) {
                    field1177 = 0;
                }
            }
        } else if (field1177 == 2) {
            short var24 = 201;
            int var74 = var24 + 52;
            if (var14 == 1 && var16 >= var74 - 12 && var16 < var74 + 2) {
                field1179 = 0;
            }
            var74 += 15;
            if (var14 == 1 && var16 >= var74 - 12 && var16 < var74 + 2) {
                field1179 = 1;
            }
            var74 += 15;
            short var25 = 361;
            if (Statics.field226 != null) {
                int var26 = Statics.field226.field3828 / 2;
                if (var14 == 1 && var15 >= Statics.field226.field3830 - var26 && var15 <= Statics.field226.field3830 + var26 && var16 >= var25 - 15 && var16 < var25) {
                    switch(field1167) {
                        case 1:
                            method118(class225.field3010, class225.field2968, class225.field3012);
                            field1177 = 5;
                            return;
                        case 2:
                            class52.method27("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var27 = Statics.field2357 - 80;
            short var28 = 321;
            if (var14 == 1 && var15 >= var27 - 75 && var15 <= var27 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1173 = field1173.trim();
                if (field1173.length() == 0) {
                    method118(class225.field2863, class225.field2864, class225.field2865);
                    return;
                }
                if (field1174.length() == 0) {
                    method118(class225.field2866, class225.field2867, class225.field2868);
                    return;
                }
                method118(class225.field2947, class225.field2977, class225.field2978);
                client.method203(false);
                client.method2725(20);
                return;
            }
            int var29 = field1180 + 180 + 80;
            if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1177 = 0;
                field1173 = "";
                field1174 = "";
                Statics.field2492 = 0;
                Statics.field3549 = "";
                field1178 = true;
            }
            int var30 = Statics.field2357 + -117;
            short var31 = 277;
            field1160 = var15 >= var30 && var15 < Statics.field1175 + var30 && var16 >= var31 && var16 < Statics.field2329 + var31;
            if (var14 == 1 && field1160) {
                client.field671 = !client.field671;
                if (!client.field671 && Statics.field562.field1036 != null) {
                    Statics.field562.field1036 = null;
                    class74.method4291();
                }
            }
            int var32 = Statics.field2357 + 24;
            short var33 = 277;
            field1176 = var15 >= var32 && var15 < Statics.field1175 + var32 && var16 >= var33 && var16 < Statics.field2329 + var33;
            if (var14 == 1 && field1176) {
                Statics.field562.field1038 = !Statics.field562.field1038;
                if (!Statics.field562.field1038) {
                    field1173 = "";
                    Statics.field562.field1036 = null;
                    if (client.field671 && field1173 != null && field1173.length() > 0) {
                        field1179 = 1;
                    } else {
                        field1179 = 0;
                    }
                }
                class74.method4291();
            }
            while (true) {
                Transferable var35;
                int var36;
                do {
                    while (true) {
                        label867: do {
                            while (true) {
                                while (class46.method4057()) {
                                    if (Statics.field230 == 13) {
                                        field1177 = 0;
                                        field1173 = "";
                                        field1174 = "";
                                        Statics.field2492 = 0;
                                        Statics.field3549 = "";
                                        field1178 = true;
                                    } else {
                                        if (field1179 != 0) {
                                            continue label867;
                                        }
                                        method611(Statics.field396);
                                        if (Statics.field230 == 85 && field1173.length() > 0) {
                                            field1173 = field1173.substring(0, field1173.length() - 1);
                                        }
                                        if (Statics.field230 == 84 || Statics.field230 == 80) {
                                            field1179 = 1;
                                        }
                                        if (method562(Statics.field396) && field1173.length() < 320) {
                                            field1173 = field1173 + Statics.field396;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1179 != 1);
                        if (Statics.field230 == 85 && field1174.length() > 0) {
                            field1174 = field1174.substring(0, field1174.length() - 1);
                        } else if (Statics.field230 == 84 || Statics.field230 == 80) {
                            field1179 = 0;
                            if (Statics.field230 == 84) {
                                field1173 = field1173.trim();
                                if (field1173.length() == 0) {
                                    method118(class225.field2863, class225.field2864, class225.field2865);
                                    return;
                                }
                                if (field1174.length() == 0) {
                                    method118(class225.field2866, class225.field2867, class225.field2868);
                                    return;
                                }
                                method118(class225.field2947, class225.field2977, class225.field2978);
                                client.method203(false);
                                client.method2725(20);
                                return;
                            }
                        }
                        if ((class46.field387[82] || class46.field387[87]) && Statics.field230 == 67) {
                            Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var35 = var34.getContents(Statics.field257);
                            var36 = 20 - field1174.length();
                            break;
                        }
                        if (class288.method2383(Statics.field396) && method562(Statics.field396) && field1174.length() < 20) {
                            field1174 = field1174 + Statics.field396;
                        }
                    }
                } while (var36 <= 0);
                try {
                    String var37 = (String) var35.getTransferData(DataFlavor.stringFlavor);
                    int var38 = Math.min(var36, var37.length());
                    for (int var39 = 0; var39 < var38; var39++) {
                        if (!class288.method2383(var37.charAt(var39)) || !method562(var37.charAt(var39))) {
                            field1177 = 3;
                            return;
                        }
                    }
                    field1174 = field1174 + var37.substring(0, var38);
                } catch (UnsupportedFlavorException var72) {
                } catch (IOException var73) {
                }
            }
        } else if (field1177 == 3) {
            int var42 = field1180 + 180;
            short var43 = 276;
            if (var14 == 1 && var15 >= var42 - 75 && var15 <= var42 + 75 && var16 >= var43 - 20 && var16 <= var43 + 20) {
                method3230(false);
            }
            int var44 = field1180 + 180;
            short var45 = 326;
            if (var14 == 1 && var15 >= var44 - 75 && var15 <= var44 + 75 && var16 >= var45 - 20 && var16 <= var45 + 20) {
                method118(class225.field3010, class225.field2968, class225.field3012);
                field1177 = 5;
                return;
            }
        } else if (field1177 == 4) {
            int var46 = field1180 + 180 - 80;
            short var47 = 321;
            if (var14 == 1 && var15 >= var46 - 75 && var15 <= var46 + 75 && var16 >= var47 - 20 && var16 <= var47 + 20) {
                Statics.field3549.trim();
                if (Statics.field3549.length() != 6) {
                    method118(class225.field2782, class225.field2783, class225.field2784);
                    return;
                }
                Statics.field2492 = Integer.parseInt(Statics.field3549);
                Statics.field3549 = "";
                client.method203(true);
                method118(class225.field2947, class225.field2977, class225.field2978);
                client.method2725(20);
                return;
            }
            if (var14 == 1 && var15 >= field1180 + 180 - 9 && var15 <= field1180 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                field1178 = !field1178;
            }
            if (var14 == 1 && var15 >= field1180 + 180 - 34 && var15 <= field1180 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                class52.method27(client.method4102("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var48 = field1180 + 180 + 80;
            if (var14 == 1 && var15 >= var48 - 75 && var15 <= var48 + 75 && var16 >= var47 - 20 && var16 <= var47 + 20) {
                field1177 = 0;
                field1173 = "";
                field1174 = "";
                Statics.field2492 = 0;
                Statics.field3549 = "";
            }
            while (class46.method4057()) {
                boolean var49 = false;
                for (int var50 = 0; var50 < field1168.length(); var50++) {
                    if (Statics.field396 == field1168.charAt(var50)) {
                        var49 = true;
                        break;
                    }
                }
                if (Statics.field230 == 13) {
                    field1177 = 0;
                    field1173 = "";
                    field1174 = "";
                    Statics.field2492 = 0;
                    Statics.field3549 = "";
                } else {
                    if (Statics.field230 == 85 && Statics.field3549.length() > 0) {
                        Statics.field3549 = Statics.field3549.substring(0, Statics.field3549.length() - 1);
                    }
                    if (Statics.field230 == 84) {
                        Statics.field3549.trim();
                        if (Statics.field3549.length() != 6) {
                            method118(class225.field2782, class225.field2783, class225.field2784);
                            return;
                        }
                        Statics.field2492 = Integer.parseInt(Statics.field3549);
                        Statics.field3549 = "";
                        client.method203(true);
                        method118(class225.field2947, class225.field2977, class225.field2978);
                        client.method2725(20);
                        return;
                    }
                    if (var49 && Statics.field3549.length() < 6) {
                        Statics.field3549 = Statics.field3549 + Statics.field396;
                    }
                }
            }
        } else if (field1177 == 5) {
            int var51 = field1180 + 180 - 80;
            short var52 = 321;
            if (var14 == 1 && var15 >= var51 - 75 && var15 <= var51 + 75 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                method3403();
                return;
            }
            int var53 = field1180 + 180 + 80;
            if (var14 == 1 && var15 >= var53 - 75 && var15 <= var53 + 75 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                method3230(true);
            }
            short var54 = 361;
            if (Statics.field320 != null) {
                int var55 = Statics.field320.field3828 / 2;
                if (var14 == 1 && var15 >= Statics.field320.field3830 - var55 && var15 <= Statics.field320.field3830 + var55 && var16 >= var54 - 15 && var16 < var54) {
                    class52.method27(client.method4102("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method4057()) {
                boolean var56 = false;
                for (int var57 = 0; var57 < field1185.length(); var57++) {
                    if (Statics.field396 == field1185.charAt(var57)) {
                        var56 = true;
                        break;
                    }
                }
                if (Statics.field230 == 13) {
                    method3230(true);
                } else {
                    if (Statics.field230 == 85 && field1173.length() > 0) {
                        field1173 = field1173.substring(0, field1173.length() - 1);
                    }
                    if (Statics.field230 == 84) {
                        method3403();
                        return;
                    }
                    if (var56 && field1173.length() < 320) {
                        field1173 = field1173 + Statics.field396;
                    }
                }
            }
        } else if (field1177 == 6) {
            while (true) {
                do {
                    if (!class46.method4057()) {
                        short var58 = 321;
                        if (var14 == 1 && var16 >= var58 - 20 && var16 <= var58 + 20) {
                            method3230(true);
                        }
                        return;
                    }
                } while (Statics.field230 != 84 && Statics.field230 != 13);
                method3230(true);
            }
        } else if (field1177 == 7) {
            int var59 = field1180 + 180 - 80;
            short var60 = 321;
            if (var14 == 1 && var15 >= var59 - 75 && var15 <= var59 + 75 && var16 >= var60 - 20 && var16 <= var60 + 20) {
                class52.method27(client.method4102("secure", true) + "m=dob/set_dob.ws", true, false);
                method118(class225.field2946, class225.field2910, class225.field3009);
                field1177 = 6;
                return;
            }
            int var61 = field1180 + 180 + 80;
            if (var14 == 1 && var15 >= var61 - 75 && var15 <= var61 + 75 && var16 >= var60 - 20 && var16 <= var60 + 20) {
                method3230(true);
            }
        } else if (field1177 == 8) {
            int var62 = field1180 + 180 - 80;
            short var63 = 321;
            if (var14 == 1 && var15 >= var62 - 75 && var15 <= var62 + 75 && var16 >= var63 - 20 && var16 <= var63 + 20) {
                class52.method27("https://www.jagex.com/terms/privacy/#eight", true, false);
                method118(class225.field2946, class225.field2910, class225.field3009);
                field1177 = 6;
                return;
            }
            int var64 = field1180 + 180 + 80;
            if (var14 == 1 && var15 >= var64 - 75 && var15 <= var64 + 75 && var16 >= var63 - 20 && var16 <= var63 + 20) {
                method3230(true);
            }
        } else if (field1177 == 12) {
            String var65 = "";
            switch(field1157) {
                case 0:
                    var65 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var65 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method3230(false);
            }
            int var66 = field1180 + 180;
            short var67 = 276;
            if (var14 == 1 && var15 >= var66 - 75 && var15 <= var66 + 75 && var16 >= var67 - 20 && var16 <= var67 + 20) {
                class52.method27(var65, true, false);
                method118(class225.field2946, class225.field2910, class225.field3009);
                field1177 = 6;
                return;
            }
            int var68 = field1180 + 180;
            short var69 = 326;
            if (var14 == 1 && var15 >= var68 - 75 && var15 <= var68 + 75 && var16 >= var69 - 20 && var16 <= var69 + 20) {
                method3230(false);
            }
        } else if (field1177 == 24) {
            int var70 = field1180 + 180;
            short var71 = 301;
            if (var14 == 1 && var15 >= var70 - 75 && var15 <= var70 + 75 && var16 >= var71 - 20 && var16 <= var71 + 20) {
                method3230(false);
            }
        }
    }

    @ObfuscatedName("ap.c(CI)Z")
    public static boolean method611(char arg0) {
        for (int var1 = 0; var1 < field1185.length(); var1++) {
            if (arg0 == field1185.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("am.o(CI)Z")
    public static boolean method562(char arg0) {
        return field1185.indexOf(arg0) != -1;
    }

    @ObfuscatedName("fe.i(ZB)V")
    public static void method3230(boolean arg0) {
        field1170 = class225.field2989;
        field1190 = class225.field2777;
        field1172 = class225.field2960;
        field1177 = 2;
        if (arg0) {
            field1174 = "";
        }
        if (field1173 == null || field1173.length() <= 0) {
            if (Statics.field562.field1036 == null) {
                client.field671 = false;
            } else {
                field1173 = Statics.field562.field1036;
                client.field671 = true;
            }
        }
        if (client.field671 && field1173 != null && field1173.length() > 0) {
            field1179 = 1;
        } else {
            field1179 = 0;
        }
    }

    @ObfuscatedName("gx.d(I)V")
    public static void method3403() {
        field1173 = field1173.trim();
        if (field1173.length() == 0) {
            method118(class225.field3010, class225.field2968, class225.field3012);
            return;
        }
        long var0 = class81.method1051();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1173;
            Random var4 = new Random();
            class300 var5 = new class300(128);
            class300 var6 = new class300(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method5253(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method5262(var4.nextInt());
            }
            var5.method5262(var7[0]);
            var5.method5262(var7[1]);
            var5.method5208(var0);
            var5.method5208(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method5262(var4.nextInt());
            }
            var5.method5145(class81.field1120, class81.field1121);
            var6.method5253(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method5262(var4.nextInt());
            }
            var6.method5208(var4.nextLong());
            var6.method5243(var4.nextLong());
            if (client.field673 == null) {
                byte[] var11 = new byte[24];
                try {
                    class168.field2026.method6147(0L);
                    class168.field2026.method6152(var11);
                    int var12;
                    for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                    }
                    if (var12 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var34) {
                    for (int var14 = 0; var14 < 24; var14++) {
                        var11[var14] = -1;
                    }
                }
                var6.method5238(var11, 0, var11.length);
            } else {
                var6.method5238(client.field673, 0, client.field673.length);
            }
            var6.method5208(var4.nextLong());
            var6.method5145(class81.field1120, class81.field1121);
            int var17 = Statics.method3242(var3);
            if (var17 % 8 != 0) {
                var17 += 8 - var17 % 8;
            }
            class300 var18 = new class300(var17);
            var18.method5114(var3);
            var18.field3694 = var17;
            var18.method5141(var7);
            class300 var19 = new class300(var18.field3694 + var6.field3694 + var5.field3694 + 5);
            var19.method5253(2);
            var19.method5253(var5.field3694);
            var19.method5238(var5.field3699, 0, var5.field3694);
            var19.method5253(var6.field3694);
            var19.method5238(var6.field3699, 0, var6.field3694);
            var19.method5128(var18.field3694);
            var19.method5238(var18.field3699, 0, var18.field3694);
            byte[] var20 = var19.field3699;
            String var21 = class290.method1078(var20, 0, var20.length);
            String var22 = var21;
            byte var29;
            try {
                URL var23 = new URL(client.method4102("services", false) + "m=accountappeal/login.ws");
                URLConnection var24 = var23.openConnection();
                var24.setDoInput(true);
                var24.setDoOutput(true);
                var24.setConnectTimeout(5000);
                OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
                var25.write("data2=" + class340.method5475(var22) + "&dest=" + class340.method5475("passwordchoice.ws"));
                var25.flush();
                InputStream var26 = var24.getInputStream();
                class300 var27 = new class300(new byte[1000]);
                while (true) {
                    int var28 = var26.read(var27.field3699, var27.field3694, 1000 - var27.field3694);
                    if (var28 == -1) {
                        var25.close();
                        var26.close();
                        String var30 = new String(var27.field3699);
                        if (var30.startsWith("OFFLINE")) {
                            var29 = 4;
                        } else if (var30.startsWith("WRONG")) {
                            var29 = 7;
                        } else if (var30.startsWith("RELOAD")) {
                            var29 = 3;
                        } else if (var30.startsWith("Not permitted for social network accounts.")) {
                            var29 = 6;
                        } else {
                            var27.method5119(var7);
                            while (var27.field3694 > 0 && var27.field3699[var27.field3694 - 1] == 0) {
                                var27.field3694--;
                            }
                            String var31 = new String(var27.field3699, 0, var27.field3694);
                            if (class81.method4486(var31)) {
                                class52.method27(var31, true, false);
                                var29 = 2;
                            } else {
                                var29 = 5;
                            }
                        }
                        break;
                    }
                    var27.field3694 += var28;
                    if (var27.field3694 >= 1000) {
                        var29 = 5;
                        break;
                    }
                }
            } catch (Throwable var33) {
                var33.printStackTrace();
                var29 = 5;
            }
            var2 = var29;
        }
        switch(var2) {
            case 2:
                method118(class225.field2895, class225.field3014, class225.field3015);
                field1177 = 6;
                break;
            case 3:
                method118(class225.field3016, class225.field2799, class225.field2908);
                break;
            case 4:
                method118(class225.field3019, class225.field3020, class225.field2893);
                break;
            case 5:
                method118(class225.field3022, class225.field3023, class225.field2751);
                break;
            case 6:
                method118(class225.field3038, class225.field3026, class225.field3027);
                break;
            case 7:
                method118(class225.field3028, class225.field3029, class225.field3030);
        }
    }

    @ObfuscatedName("t.m(Lks;Lks;Lks;I)V")
    public static void method12(class295 arg0, class295 arg1, class295 arg2) {
        field1159 = (Statics.field3628 - 765) / 2;
        field1180 = field1159 + 202;
        Statics.field2357 = field1180 + 180;
        if (field1182) {
            Statics.method3112(arg0, arg1);
            return;
        }
        Statics.field1171.method5693(field1159, 0);
        Statics.field3651.method5693(field1159 + 382, 0);
        Statics.field501.method5658(field1159 + 382 - Statics.field501.field3854 / 2, 18);
        if (client.field640 == 0 || client.field640 == 5) {
            byte var3 = 20;
            arg0.method5042(class225.field2957, field1180 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class321.method5620(field1180 + 180 - 152, var4, 304, 34, 9179409);
            class321.method5620(field1180 + 180 - 151, var4 + 1, 302, 32, 0);
            class321.method5585(field1180 + 180 - 150, var4 + 2, field1164 * 3, 30, 9179409);
            class321.method5585(field1164 * 3 + (field1180 + 180 - 150), var4 + 2, 300 - field1164 * 3, 30, 0);
            arg0.method5042(field1165, field1180 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field640 == 20) {
            Statics.field1112.method5658(field1180 + 180 - Statics.field1112.field3854 / 2, 271 - Statics.field1112.field3857 / 2);
            short var5 = 201;
            arg0.method5042(field1170, field1180 + 180, var5, 16776960, 0);
            int var104 = var5 + 15;
            arg0.method5042(field1190, field1180 + 180, var104, 16776960, 0);
            int var105 = var104 + 15;
            arg0.method5042(field1172, field1180 + 180, var105, 16776960, 0);
            int var106 = var105 + 15;
            int var107 = var106 + 7;
            if (field1177 != 4) {
                arg0.method4987(class225.field2985, field1180 + 180 - 110, var107, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method1103(); arg0.method4982(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method4987(class296.method5037(var7), field1180 + 180 - 70, var107, 16777215, 0);
                var104 = var107 + 15;
                String var8 = field1174;
                int var9 = var8.length();
                char[] var10 = new char[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var10[var11] = '*';
                }
                String var12 = new String(var10);
                String var14;
                for (var14 = var12; arg0.method4982(var14) > var6; var14 = var14.substring(1)) {
                }
                arg0.method4987(class225.field2986 + var14, field1180 + 180 - 108, var104, 16777215, 0);
                var104 += 15;
            }
        }
        if (client.field640 == 10 || client.field640 == 11) {
            Statics.field1112.method5658(field1180, 171);
            if (field1177 == 0) {
                short var15 = 251;
                arg0.method5042(class225.field2856, field1180 + 180, var15, 16776960, 0);
                int var108 = var15 + 30;
                int var16 = field1180 + 180 - 80;
                short var17 = 291;
                Statics.field1958.method5658(var16 - 73, var17 - 20);
                arg0.method4992(class225.field2949, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var18 = field1180 + 180 + 80;
                Statics.field1958.method5658(var18 - 73, var17 - 20);
                arg0.method4992(class225.field2966, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1177 == 1) {
                arg0.method5042(field1169, field1180 + 180, 201, 16776960, 0);
                short var19 = 236;
                arg0.method5042(field1170, field1180 + 180, var19, 16777215, 0);
                int var109 = var19 + 15;
                arg0.method5042(field1190, field1180 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                arg0.method5042(field1172, field1180 + 180, var110, 16777215, 0);
                int var111 = var110 + 15;
                int var20 = field1180 + 180 - 80;
                short var21 = 321;
                Statics.field1958.method5658(var20 - 73, var21 - 20);
                arg0.method5042(class225.field2775, var20, var21 + 5, 16777215, 0);
                int var22 = field1180 + 180 + 80;
                Statics.field1958.method5658(var22 - 73, var21 - 20);
                arg0.method5042(class225.field2842, var22, var21 + 5, 16777215, 0);
            } else if (field1177 == 2) {
                short var23 = 201;
                arg0.method5042(field1170, Statics.field2357, var23, 16776960, 0);
                int var112 = var23 + 15;
                arg0.method5042(field1190, Statics.field2357, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg0.method5042(field1172, Statics.field2357, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var115 = var114 + 7;
                arg0.method4987(class225.field2985, Statics.field2357 - 110, var115, 16777215, 0);
                short var24 = 200;
                String var25;
                for (var25 = method1103(); arg0.method4982(var25) > var24; var25 = var25.substring(1)) {
                }
                arg0.method4987(class296.method5037(var25) + (field1179 == 0 & client.field643 % 40 < 20 ? class82.method3907(16776960) + class82.field1129 : ""), Statics.field2357 - 70, var115, 16777215, 0);
                var112 = var115 + 15;
                String var26 = field1174;
                int var27 = var26.length();
                char[] var28 = new char[var27];
                for (int var29 = 0; var29 < var27; var29++) {
                    var28[var29] = '*';
                }
                String var30 = new String(var28);
                String var32;
                for (var32 = var30; arg0.method4982(var32) > var24; var32 = var32.substring(1)) {
                }
                arg0.method4987(class225.field2986 + var32 + (field1179 == 1 & client.field643 % 40 < 20 ? class82.method3907(16776960) + class82.field1129 : ""), Statics.field2357 - 108, var112, 16777215, 0);
                var112 += 15;
                short var33 = 277;
                int var34 = Statics.field2357 + -117;
                boolean var35 = client.field671;
                boolean var36 = field1160;
                class324 var37 = var35 ? (var36 ? Statics.field24 : Statics.field1163) : (var36 ? Statics.field413 : Statics.field1964);
                var37.method5658(var34, var33);
                int var39 = var37.field3854 + 5 + var34;
                arg1.method4987(class225.field2993, var39, var33 + 13, 16776960, 0);
                int var40 = Statics.field2357 + 24;
                boolean var41 = Statics.field562.field1038;
                boolean var42 = field1176;
                class324 var43 = var41 ? (var42 ? Statics.field24 : Statics.field1163) : (var42 ? Statics.field413 : Statics.field1964);
                var43.method5658(var40, var33);
                int var45 = var43.field3854 + 5 + var40;
                arg1.method4987(class225.field2994, var45, var33 + 13, 16776960, 0);
                int var116 = var33 + 15;
                int var46 = Statics.field2357 - 80;
                short var47 = 321;
                Statics.field1958.method5658(var46 - 73, var47 - 20);
                arg0.method5042(class225.field2991, var46, var47 + 5, 16777215, 0);
                int var48 = Statics.field2357 + 80;
                Statics.field1958.method5658(var48 - 73, var47 - 20);
                arg0.method5042(class225.field2842, var48, var47 + 5, 16777215, 0);
                short var49 = 357;
                switch(field1167) {
                    case 2:
                        Statics.field3289 = class225.field3006;
                        break;
                    default:
                        Statics.field3289 = class225.field2761;
                }
                Statics.field226 = new class319(Statics.field2357, var49, arg1.method4982(Statics.field3289), 11);
                Statics.field320 = new class319(Statics.field2357, var49, arg1.method4982(class225.field2871), 11);
                arg1.method5042(Statics.field3289, Statics.field2357, var49, 16777215, 0);
            } else if (field1177 == 3) {
                short var50 = 201;
                arg0.method5042(class225.field2995, field1180 + 180, var50, 16776960, 0);
                int var117 = var50 + 20;
                arg1.method5042(class225.field3017, field1180 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg1.method5042(class225.field2997, field1180 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                int var51 = field1180 + 180;
                short var52 = 276;
                Statics.field1958.method5658(var51 - 73, var52 - 20);
                arg2.method5042(class225.field2998, var51, var52 + 5, 16777215, 0);
                int var53 = field1180 + 180;
                short var54 = 326;
                Statics.field1958.method5658(var53 - 73, var54 - 20);
                arg2.method5042(class225.field3013, var53, var54 + 5, 16777215, 0);
            } else if (field1177 == 4) {
                arg0.method5042(class225.field2779, field1180 + 180, 201, 16776960, 0);
                short var55 = 236;
                arg0.method5042(field1170, field1180 + 180, var55, 16777215, 0);
                int var120 = var55 + 15;
                arg0.method5042(field1190, field1180 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method5042(field1172, field1180 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                String var57 = class225.field2926;
                String var58 = Statics.field3549;
                int var59 = var58.length();
                char[] var60 = new char[var59];
                for (int var61 = 0; var61 < var59; var61++) {
                    var60[var61] = '*';
                }
                String var62 = new String(var60);
                arg0.method4987(var57 + var62 + (client.field643 % 40 < 20 ? class82.method3907(16776960) + class82.field1129 : ""), field1180 + 180 - 108, var122, 16777215, 0);
                var120 = var122 - 8;
                arg0.method4987(class225.field2752, field1180 + 180 - 9, var120, 16776960, 0);
                var120 += 15;
                arg0.method4987(class225.field2753, field1180 + 180 - 9, var120, 16776960, 0);
                int var64 = field1180 + 180 - 9 + arg0.method4982(class225.field2753) + 15;
                int var65 = var120 - arg0.field3661;
                class324 var66;
                if (field1178) {
                    var66 = Statics.field1163;
                } else {
                    var66 = Statics.field1964;
                }
                var66.method5658(var64, var65);
                var120 += 15;
                int var67 = field1180 + 180 - 80;
                short var68 = 321;
                Statics.field1958.method5658(var67 - 73, var68 - 20);
                arg0.method5042(class225.field2775, var67, var68 + 5, 16777215, 0);
                int var69 = field1180 + 180 + 80;
                Statics.field1958.method5658(var69 - 73, var68 - 20);
                arg0.method5042(class225.field2842, var69, var68 + 5, 16777215, 0);
                arg1.method5042(class225.field2975, field1180 + 180, var68 + 36, 255, 0);
            } else if (field1177 == 5) {
                arg0.method5042(class225.field3000, field1180 + 180, 201, 16776960, 0);
                short var70 = 221;
                arg2.method5042(field1170, field1180 + 180, var70, 16776960, 0);
                int var123 = var70 + 15;
                arg2.method5042(field1190, field1180 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg2.method5042(field1172, field1180 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var126 = var125 + 14;
                arg0.method4987(class225.field2828, field1180 + 180 - 145, var126, 16777215, 0);
                short var71 = 174;
                String var72;
                for (var72 = method1103(); arg0.method4982(var72) > var71; var72 = var72.substring(1)) {
                }
                arg0.method4987(class296.method5037(var72) + (client.field643 % 40 < 20 ? class82.method3907(16776960) + class82.field1129 : ""), field1180 + 180 - 34, var126, 16777215, 0);
                var123 = var126 + 15;
                int var73 = field1180 + 180 - 80;
                short var74 = 321;
                Statics.field1958.method5658(var73 - 73, var74 - 20);
                arg0.method5042(class225.field3002, var73, var74 + 5, 16777215, 0);
                int var75 = field1180 + 180 + 80;
                Statics.field1958.method5658(var75 - 73, var74 - 20);
                arg0.method5042(class225.field3003, var75, var74 + 5, 16777215, 0);
                short var76 = 356;
                arg1.method5042(class225.field2871, Statics.field2357, var76, 268435455, 0);
            } else if (field1177 == 6) {
                short var77 = 201;
                arg0.method5042(field1170, field1180 + 180, var77, 16776960, 0);
                int var127 = var77 + 15;
                arg0.method5042(field1190, field1180 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                arg0.method5042(field1172, field1180 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                int var78 = field1180 + 180;
                short var79 = 321;
                Statics.field1958.method5658(var78 - 73, var79 - 20);
                arg0.method5042(class225.field3003, var78, var79 + 5, 16777215, 0);
            } else if (field1177 == 7) {
                short var80 = 216;
                arg0.method5042(class225.field2918, field1180 + 180, var80, 16776960, 0);
                int var130 = var80 + 15;
                arg2.method5042(class225.field3032, field1180 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg2.method5042(class225.field2793, field1180 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var81 = field1180 + 180 - 80;
                short var82 = 321;
                Statics.field1958.method5658(var81 - 73, var82 - 20);
                arg0.method5042(class225.field3034, var81, var82 + 5, 16777215, 0);
                int var83 = field1180 + 180 + 80;
                Statics.field1958.method5658(var83 - 73, var82 - 20);
                arg0.method5042(class225.field3003, var83, var82 + 5, 16777215, 0);
            } else if (field1177 == 8) {
                short var84 = 216;
                arg0.method5042(class225.field2969, field1180 + 180, var84, 16776960, 0);
                int var133 = var84 + 15;
                arg2.method5042(class225.field2776, field1180 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                arg2.method5042(class225.field2962, field1180 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                int var85 = field1180 + 180 - 80;
                short var86 = 321;
                Statics.field1958.method5658(var85 - 73, var86 - 20);
                arg0.method5042(class225.field3031, var85, var86 + 5, 16777215, 0);
                int var87 = field1180 + 180 + 80;
                Statics.field1958.method5658(var87 - 73, var86 - 20);
                arg0.method5042(class225.field3003, var87, var86 + 5, 16777215, 0);
            } else if (field1177 == 12) {
                short var88 = 201;
                String var89 = "";
                String var90 = "";
                String var91 = "";
                switch(field1157) {
                    case 0:
                        var89 = class225.field2797;
                        var90 = class225.field2798;
                        var91 = class225.field2815;
                        break;
                    case 1:
                        var89 = class225.field2922;
                        var90 = class225.field3007;
                        var91 = class225.field2838;
                        break;
                    default:
                        method3230(false);
                }
                arg0.method5042(var89, field1180 + 180, var88, 16776960, 0);
                int var136 = var88 + 15;
                arg2.method5042(var90, field1180 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg2.method5042(var91, field1180 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var92 = field1180 + 180;
                short var93 = 276;
                Statics.field1958.method5658(var92 - 73, var93 - 20);
                arg0.method5042(class225.field2923, var92, var93 + 5, 16777215, 0);
                int var94 = field1180 + 180;
                short var95 = 326;
                Statics.field1958.method5658(var94 - 73, var95 - 20);
                arg0.method5042(class225.field3003, var94, var95 + 5, 16777215, 0);
            } else if (field1177 == 24) {
                short var96 = 221;
                arg0.method5042(field1170, field1180 + 180, var96, 16777215, 0);
                int var139 = var96 + 15;
                arg0.method5042(field1190, field1180 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method5042(field1172, field1180 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                int var97 = field1180 + 180;
                short var98 = 301;
                Statics.field1958.method5658(var97 - 73, var98 - 20);
                arg0.method5042(class225.field2747, var97, var98 + 5, 16777215, 0);
            }
        }
        if (client.field640 >= 10) {
            int[] var99 = new int[4];
            class321.method5618(var99);
            class321.method5578(field1159, 0, field1159 + 765, Statics.field3243);
            Statics.field1162.method1718(field1159 - 22, client.field643);
            Statics.field1162.method1718(field1159 + 765 + 22 - 128, client.field643);
            class321.method5594(var99);
        }
        Statics.field1437[Statics.field562.field1034 ? 1 : 0].method5658(field1159 + 765 - 40, 463);
        if (client.field640 <= 5 || Statics.field281 != class191.field2332) {
            return;
        }
        if (Statics.field588 == null) {
            Statics.field588 = class326.method3399(Statics.field70, "sl_button", "");
            return;
        }
        int var100 = field1159 + 5;
        short var101 = 463;
        byte var102 = 100;
        byte var103 = 35;
        Statics.field588.method5658(var100, var101);
        arg0.method5042(class225.field2743 + " " + client.field701, var102 / 2 + var100, var103 / 2 + var101 - 2, 16777215, 0);
        if (Statics.field1299 == null) {
            arg1.method5042(class225.field3045, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
        } else {
            arg1.method5042(class225.field3044, var102 / 2 + var100, var103 / 2 + var101 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("d.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method118(String arg0, String arg1, String arg2) {
        field1170 = arg0;
        field1190 = arg1;
        field1172 = arg2;
    }

    @ObfuscatedName("be.k(Lbk;I)V")
    public static void method1104(class72 arg0) {
        if (arg0.method1674() != client.field636) {
            client.field636 = arg0.method1674();
            boolean var1 = arg0.method1674();
            if (Statics.field3394 != var1) {
                class255.method1830();
                Statics.field3394 = var1;
            }
        }
        Statics.field328 = arg0.field1002;
        client.field701 = arg0.field999;
        client.field768 = arg0.field1000;
        Statics.field2738 = client.field635 == 0 ? 43594 : arg0.field999 + 40000;
        Statics.field1435 = client.field635 == 0 ? 443 : arg0.field999 + 50000;
        Statics.field71 = Statics.field2738;
    }

    @ObfuscatedName("cr.x(I)V")
    public static void method1996() {
        if (Statics.method709()) {
            field1182 = true;
            field1184 = 0;
            field1158 = 0;
        }
    }

    @ObfuscatedName("cu.j(B)V")
    public static void method2071() {
        field1177 = 24;
        method118(class225.field2979, class225.field2980, class225.field2981);
    }
}
