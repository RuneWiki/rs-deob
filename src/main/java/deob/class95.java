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

@ObfuscatedName("cy")
public class class95 {

    @ObfuscatedName("cy.d")
    public static int field1196 = 0;

    @ObfuscatedName("cy.u")
    public static int field1204 = field1196 + 202;

    @ObfuscatedName("cy.p")
    public static int field1205 = 10;

    @ObfuscatedName("cy.m")
    public static String field1206 = "";

    @ObfuscatedName("cy.ae")
    public static int field1207 = -1;

    @ObfuscatedName("cy.at")
    public static int field1208 = 1;

    @ObfuscatedName("cy.al")
    public static int field1209 = 0;

    @ObfuscatedName("cy.aa")
    public static String field1225 = "";

    @ObfuscatedName("cy.as")
    public static String field1224 = "";

    @ObfuscatedName("cy.aw")
    public static String field1212 = "";

    @ObfuscatedName("cy.az")
    public static String field1213 = "";

    @ObfuscatedName("cy.ah")
    public static String field1226 = "";

    @ObfuscatedName("cy.ap")
    public static String field1215 = "";

    @ObfuscatedName("cy.af")
    public static boolean field1223 = false;

    @ObfuscatedName("cy.av")
    public static boolean field1217 = false;

    @ObfuscatedName("cy.bn")
    public static boolean field1218 = true;

    @ObfuscatedName("cy.bi")
    public static int field1210 = 0;

    @ObfuscatedName("cy.bp")
    public static String field1220 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cy.br")
    public static String field1201 = "1234567890";

    @ObfuscatedName("cy.bx")
    public static boolean field1222 = false;

    @ObfuscatedName("cy.bg")
    public static int field1216 = -1;

    @ObfuscatedName("cy.bm")
    public static int field1194 = 0;

    @ObfuscatedName("cy.bf")
    public static int field1219 = 0;

    @ObfuscatedName("cy.bs")
    public static long field1214;

    @ObfuscatedName("cy.by")
    public static long field1227;

    static {
        new DecimalFormat("##0.00");
        new class172();
        field1214 = -1L;
        field1227 = -1L;
    }

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.n(I)I")
    public static int method263() {
        return 12;
    }

    @ObfuscatedName("be.v(Lig;Lig;ZII)V")
    public static void method1117(class245 arg0, class245 arg1, boolean arg2, int arg3) {
        if (!Statics.field1195) {
            field1209 = arg3;
            class332.method5726();
            byte[] var4 = arg0.method3980("title.jpg", "");
            Statics.field1198 = class59.method326(var4);
            Statics.field1199 = Statics.field1198.method5825();
            int var5 = client.field663;
            if ((var5 & 0x20000000) != 0) {
                Statics.field1200 = class337.method2226(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field1200 = class337.method2226(arg1, "logo", "");
            } else {
                Statics.field1200 = class337.method2226(arg1, "logo_seasonal_mode", "");
            }
            Statics.field114 = class337.method2226(arg1, "titlebox", "");
            Statics.field578 = class337.method2226(arg1, "titlebutton", "");
            Statics.field1197 = class337.method3370(arg1, "runes", "");
            Statics.field1211 = class337.method3370(arg1, "title_mute", "");
            Statics.field571 = class337.method2226(arg1, "options_radio_buttons,0", "");
            Statics.field1957 = class337.method2226(arg1, "options_radio_buttons,4", "");
            Statics.field1202 = class337.method2226(arg1, "options_radio_buttons,2", "");
            Statics.field238 = class337.method2226(arg1, "options_radio_buttons,6", "");
            Statics.field236 = Statics.field571.field3908;
            Statics.field513 = Statics.field571.field3905;
            Statics.field55 = new class82(Statics.field1197);
            if (arg2) {
                field1226 = "";
                field1215 = "";
            }
            Statics.field440 = 0;
            Statics.field5 = "";
            field1218 = true;
            field1222 = false;
            if (Statics.field191.field1077) {
                class207.field2436 = 1;
                Statics.field2438 = null;
                Statics.field2434 = -1;
                Statics.field1454 = -1;
                Statics.field436 = 0;
                Statics.field2439 = false;
                Statics.field43 = 2;
            } else {
                class247 var6 = Statics.field1954;
                int var7 = var6.method4001("scape main");
                int var8 = var6.method4002(var7, "");
                class207.method1238(2, var6, var7, var8, 255, false);
            }
            Statics.method1705(false);
            Statics.field1195 = true;
            field1196 = (Statics.field88 - 765) / 2;
            field1204 = field1196 + 202;
            Statics.field1138 = field1204 + 180;
            Statics.field1198.method5834(field1196, 0);
            Statics.field1199.method5834(field1196 + 382, 0);
            Statics.field1200.method5806(field1196 + 382 - Statics.field1200.field3908 / 2, 18);
        } else if (arg3 == 4) {
            field1209 = 4;
        }
    }

    @ObfuscatedName("ei.d(ZZI)Lly;")
    public static class335 method3214(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field238 : Statics.field1202) : (arg1 ? Statics.field1957 : Statics.field571);
    }

    @ObfuscatedName("az.c(I)Ljava/lang/String;")
    public static String method582() {
        return Statics.field191.field1072 ? class302.method4373(field1226) : field1226;
    }

    @ObfuscatedName("io.y(B)V")
    public static void method4124() {
        if (field1226 != null && field1226.length() > 0) {
            return;
        }
        if (Statics.field191.field1076 == null) {
            client.field701 = false;
        } else {
            field1226 = Statics.field191.field1076;
            client.field701 = true;
        }
    }

    @ObfuscatedName("aa.h(B)V")
    public static void method436() {
        if (!Statics.field1195) {
            return;
        }
        Statics.field114 = null;
        Statics.field578 = null;
        Statics.field1197 = null;
        Statics.field1198 = null;
        Statics.field1199 = null;
        Statics.field1200 = null;
        Statics.field1211 = null;
        Statics.field571 = null;
        Statics.field1202 = null;
        Statics.field294 = null;
        Statics.field358 = null;
        Statics.field433 = null;
        Statics.field1916 = null;
        Statics.field1040 = null;
        Statics.field55.method1764();
        class207.field2436 = 1;
        Statics.field2438 = null;
        Statics.field2434 = -1;
        Statics.field1454 = -1;
        Statics.field436 = 0;
        Statics.field2439 = false;
        Statics.field43 = 2;
        Statics.method1705(true);
        Statics.field1195 = false;
    }

    @ObfuscatedName("q.z(I)V")
    public static void method69() {
        if (client.field701 && field1226 != null && field1226.length() > 0) {
            field1210 = 1;
        } else {
            field1210 = 0;
        }
    }

    @ObfuscatedName("l.e(Lbt;I)V")
    public static void method91(class63 arg0) {
        if (field1222) {
            method583(arg0);
            return;
        }
        if ((class64.field509 == 1 || !Statics.field47 && class64.field509 == 4) && class64.field510 >= field1196 + 765 - 50 && class64.field511 >= 453) {
            Statics.field191.field1077 = !Statics.field191.field1077;
            class83.method213();
            if (Statics.field191.field1077) {
                class207.method1134();
            } else {
                class247 var1 = Statics.field1954;
                int var2 = var1.method4001("scape main");
                int var3 = var1.method4002(var2, "");
                class207.method2270(var1, var2, var3, 255, false);
            }
        }
        if (client.field670 == 5) {
            return;
        }
        if (field1214 == -1L) {
            field1214 = class308.method1082() + 1000L;
        }
        long var4 = class308.method1082();
        if (client.method4157() && field1227 == -1L) {
            field1227 = var4;
            if (field1227 > field1214) {
                field1214 = field1227;
            }
        }
        if (client.field670 != 10 && client.field670 != 11) {
            return;
        }
        if (Statics.field3535 == class200.field2387) {
            if (class64.field509 == 1 || !Statics.field47 && class64.field509 == 4) {
                int var6 = field1196 + 5;
                short var7 = 463;
                byte var8 = 100;
                byte var9 = 35;
                if (class64.field510 >= var6 && class64.field510 <= var6 + var8 && class64.field511 >= var7 && class64.field511 <= var7 + var9) {
                    method2498();
                    return;
                }
            }
            if (Statics.field1982 != null) {
                method2498();
            }
        }
        int var10 = class64.field509;
        int var11 = class64.field510;
        int var12 = class64.field511;
        if (var10 == 0) {
            var11 = class64.field502;
            var12 = class64.field503;
        }
        if (!Statics.field47 && var10 == 4) {
            var10 = 1;
        }
        if (field1209 == 0) {
            boolean var13 = false;
            while (class55.method2169()) {
                if (Statics.field2418 == 84) {
                    var13 = true;
                }
            }
            int var14 = Statics.field1138 - 80;
            short var15 = 291;
            if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                class61.method324(client.method186("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var16 = Statics.field1138 + 80;
            if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                if ((client.field663 & 0x2000000) != 0) {
                    field1225 = "";
                    field1224 = class234.field3015;
                    field1212 = class234.field2823;
                    field1213 = class234.field2959;
                    field1209 = 1;
                    method69();
                } else if ((client.field663 & 0x4) != 0) {
                    if ((client.field663 & 0x400) == 0) {
                        field1224 = class234.field3006;
                        field1212 = class234.field3007;
                        field1213 = class234.field3044;
                    } else {
                        field1224 = class234.field3012;
                        field1212 = class234.field3065;
                        field1213 = class234.field3014;
                    }
                    field1225 = class234.field3005;
                    field1209 = 1;
                    method69();
                } else if ((client.field663 & 0x400) == 0) {
                    method1239(false);
                } else {
                    field1224 = class234.field3009;
                    field1212 = class234.field2984;
                    field1213 = class234.field3011;
                    field1225 = class234.field3005;
                    field1209 = 1;
                    method69();
                }
            }
        } else if (field1209 == 1) {
            while (true) {
                if (!class55.method2169()) {
                    int var17 = Statics.field1138 - 80;
                    short var18 = 321;
                    if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                        method1239(false);
                    }
                    int var19 = Statics.field1138 + 80;
                    if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                        field1209 = 0;
                    }
                    break;
                }
                if (Statics.field2418 == 84) {
                    method1239(false);
                } else if (Statics.field2418 == 13) {
                    field1209 = 0;
                }
            }
        } else if (field1209 == 2) {
            short var20 = 201;
            int var86 = var20 + 52;
            if (var10 == 1 && var12 >= var86 - 12 && var12 < var86 + 2) {
                field1210 = 0;
            }
            var86 += 15;
            if (var10 == 1 && var12 >= var86 - 12 && var12 < var86 + 2) {
                field1210 = 1;
            }
            var86 += 15;
            short var21 = 361;
            if (Statics.field1191 != null) {
                int var22 = Statics.field1191.field3881 / 2;
                if (var10 == 1 && var11 >= Statics.field1191.field3879 - var22 && var11 <= Statics.field1191.field3879 + var22 && var12 >= var21 - 15 && var12 < var21) {
                    switch(field1208) {
                        case 1:
                            method4156(class234.field2899, class234.field3055, class234.field3056);
                            field1209 = 5;
                            return;
                        case 2:
                            class61.method324("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var23 = Statics.field1138 - 80;
            short var24 = 321;
            if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                field1226 = field1226.trim();
                if (field1226.length() == 0) {
                    method4156(class234.field2802, class234.field2908, class234.field2909);
                    return;
                }
                if (field1215.length() == 0) {
                    method4156(class234.field2910, class234.field2911, class234.field2912);
                    return;
                }
                method4156(class234.field3020, class234.field3021, class234.field3022);
                client.method211(false);
                client.method1104(20);
                return;
            }
            int var25 = field1204 + 180 + 80;
            if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                field1209 = 0;
                field1226 = "";
                field1215 = "";
                Statics.field440 = 0;
                Statics.field5 = "";
                field1218 = true;
            }
            int var26 = Statics.field1138 + -117;
            short var27 = 277;
            field1223 = var11 >= var26 && var11 < Statics.field236 + var26 && var12 >= var27 && var12 < Statics.field513 + var27;
            if (var10 == 1 && field1223) {
                client.field701 = !client.field701;
                if (!client.field701 && Statics.field191.field1076 != null) {
                    Statics.field191.field1076 = null;
                    class83.method213();
                }
            }
            int var28 = Statics.field1138 + 24;
            short var29 = 277;
            field1217 = var11 >= var28 && var11 < Statics.field236 + var28 && var12 >= var29 && var12 < Statics.field513 + var29;
            if (var10 == 1 && field1217) {
                Statics.field191.field1072 = !Statics.field191.field1072;
                if (!Statics.field191.field1072) {
                    field1226 = "";
                    Statics.field191.field1076 = null;
                    method69();
                }
                class83.method213();
            }
            label802: while (true) {
                Transferable var33;
                int var34;
                do {
                    while (true) {
                        label716: do {
                            while (true) {
                                while (class55.method2169()) {
                                    if (Statics.field2418 == 13) {
                                        field1209 = 0;
                                        field1226 = "";
                                        field1215 = "";
                                        Statics.field440 = 0;
                                        Statics.field5 = "";
                                        field1218 = true;
                                    } else {
                                        if (field1210 != 0) {
                                            continue label716;
                                        }
                                        method590(Statics.field300);
                                        if (Statics.field2418 == 85 && field1226.length() > 0) {
                                            field1226 = field1226.substring(0, field1226.length() - 1);
                                        }
                                        if (Statics.field2418 == 84 || Statics.field2418 == 80) {
                                            field1210 = 1;
                                        }
                                        char var30 = Statics.field300;
                                        boolean var31 = field1220.indexOf(var30) != -1;
                                        if (var31 && field1226.length() < 320) {
                                            field1226 = field1226 + Statics.field300;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1210 != 1);
                        if (Statics.field2418 == 85 && field1215.length() > 0) {
                            field1215 = field1215.substring(0, field1215.length() - 1);
                        } else if (Statics.field2418 == 84 || Statics.field2418 == 80) {
                            field1210 = 0;
                            if (Statics.field2418 == 84) {
                                field1226 = field1226.trim();
                                if (field1226.length() == 0) {
                                    method4156(class234.field2802, class234.field2908, class234.field2909);
                                    return;
                                }
                                if (field1215.length() == 0) {
                                    method4156(class234.field2910, class234.field2911, class234.field2912);
                                    return;
                                }
                                method4156(class234.field3020, class234.field3021, class234.field3022);
                                client.method211(false);
                                client.method1104(20);
                                return;
                            }
                        }
                        if ((class55.field416[82] || class55.field416[87]) && Statics.field2418 == 67) {
                            Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var33 = var32.getContents(Statics.field7);
                            var34 = 20 - field1215.length();
                            break;
                        }
                        char var47 = Statics.field300;
                        boolean var48;
                        if (var47 >= ' ' && var47 < 127 || var47 > 127 && var47 < 160 || var47 > 160 && var47 <= 255) {
                            var48 = true;
                        } else {
                            label926: {
                                if (var47 != 0) {
                                    char[] var49 = class299.field3681;
                                    for (int var50 = 0; var50 < var49.length; var50++) {
                                        char var51 = var49[var50];
                                        if (var47 == var51) {
                                            var48 = true;
                                            break label926;
                                        }
                                    }
                                }
                                var48 = false;
                            }
                        }
                        if (var48) {
                            char var52 = Statics.field300;
                            boolean var53 = field1220.indexOf(var52) != -1;
                            if (var53 && field1215.length() < 20) {
                                field1215 = field1215 + Statics.field300;
                            }
                        }
                    }
                } while (var34 <= 0);
                try {
                    String var35 = (String) var33.getTransferData(DataFlavor.stringFlavor);
                    int var36 = Math.min(var34, var35.length());
                    int var37 = 0;
                    while (true) {
                        if (var37 >= var36) {
                            field1215 = field1215 + var35.substring(0, var36);
                            continue label802;
                        }
                        char var38 = var35.charAt(var37);
                        boolean var39;
                        if (var38 >= ' ' && var38 < 127 || var38 > 127 && var38 < 160 || var38 > 160 && var38 <= 255) {
                            var39 = true;
                        } else {
                            label927: {
                                if (var38 != 0) {
                                    char[] var40 = class299.field3681;
                                    for (int var41 = 0; var41 < var40.length; var41++) {
                                        char var42 = var40[var41];
                                        if (var38 == var42) {
                                            var39 = true;
                                            break label927;
                                        }
                                    }
                                }
                                var39 = false;
                            }
                        }
                        if (!var39) {
                            break;
                        }
                        char var43 = var35.charAt(var37);
                        boolean var44 = field1220.indexOf(var43) != -1;
                        if (!var44) {
                            break;
                        }
                        var37++;
                    }
                    field1209 = 3;
                    return;
                } catch (UnsupportedFlavorException var84) {
                } catch (IOException var85) {
                }
            }
        } else if (field1209 == 3) {
            int var54 = field1204 + 180;
            short var55 = 276;
            if (var10 == 1 && var11 >= var54 - 75 && var11 <= var54 + 75 && var12 >= var55 - 20 && var12 <= var55 + 20) {
                method1239(false);
            }
            int var56 = field1204 + 180;
            short var57 = 326;
            if (var10 == 1 && var11 >= var56 - 75 && var11 <= var56 + 75 && var12 >= var57 - 20 && var12 <= var57 + 20) {
                method4156(class234.field2899, class234.field3055, class234.field3056);
                field1209 = 5;
                return;
            }
        } else if (field1209 == 4) {
            int var58 = field1204 + 180 - 80;
            short var59 = 321;
            if (var10 == 1 && var11 >= var58 - 75 && var11 <= var58 + 75 && var12 >= var59 - 20 && var12 <= var59 + 20) {
                Statics.field5.trim();
                if (Statics.field5.length() != 6) {
                    method4156(class234.field2900, class234.field2827, class234.field2891);
                    return;
                }
                Statics.field440 = Integer.parseInt(Statics.field5);
                Statics.field5 = "";
                client.method211(true);
                method4156(class234.field3020, class234.field3021, class234.field3022);
                client.method1104(20);
                return;
            }
            if (var10 == 1 && var11 >= field1204 + 180 - 9 && var11 <= field1204 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                field1218 = !field1218;
            }
            if (var10 == 1 && var11 >= field1204 + 180 - 34 && var11 <= field1204 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                class61.method324(client.method186("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var60 = field1204 + 180 + 80;
            if (var10 == 1 && var11 >= var60 - 75 && var11 <= var60 + 75 && var12 >= var59 - 20 && var12 <= var59 + 20) {
                field1209 = 0;
                field1226 = "";
                field1215 = "";
                Statics.field440 = 0;
                Statics.field5 = "";
            }
            while (class55.method2169()) {
                boolean var61 = false;
                for (int var62 = 0; var62 < field1201.length(); var62++) {
                    if (Statics.field300 == field1201.charAt(var62)) {
                        var61 = true;
                        break;
                    }
                }
                if (Statics.field2418 == 13) {
                    field1209 = 0;
                    field1226 = "";
                    field1215 = "";
                    Statics.field440 = 0;
                    Statics.field5 = "";
                } else {
                    if (Statics.field2418 == 85 && Statics.field5.length() > 0) {
                        Statics.field5 = Statics.field5.substring(0, Statics.field5.length() - 1);
                    }
                    if (Statics.field2418 == 84) {
                        Statics.field5.trim();
                        if (Statics.field5.length() != 6) {
                            method4156(class234.field2900, class234.field2827, class234.field2891);
                            return;
                        }
                        Statics.field440 = Integer.parseInt(Statics.field5);
                        Statics.field5 = "";
                        client.method211(true);
                        method4156(class234.field3020, class234.field3021, class234.field3022);
                        client.method1104(20);
                        return;
                    }
                    if (var61 && Statics.field5.length() < 6) {
                        Statics.field5 = Statics.field5 + Statics.field300;
                    }
                }
            }
        } else if (field1209 == 5) {
            int var63 = field1204 + 180 - 80;
            short var64 = 321;
            if (var10 == 1 && var11 >= var63 - 75 && var11 <= var63 + 75 && var12 >= var64 - 20 && var12 <= var64 + 20) {
                method643();
                return;
            }
            int var65 = field1204 + 180 + 80;
            if (var10 == 1 && var11 >= var65 - 75 && var11 <= var65 + 75 && var12 >= var64 - 20 && var12 <= var64 + 20) {
                method1239(true);
            }
            short var66 = 361;
            if (Statics.field410 != null) {
                int var67 = Statics.field410.field3881 / 2;
                if (var10 == 1 && var11 >= Statics.field410.field3879 - var67 && var11 <= Statics.field410.field3879 + var67 && var12 >= var66 - 15 && var12 < var66) {
                    class61.method324(client.method186("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class55.method2169()) {
                boolean var68 = false;
                for (int var69 = 0; var69 < field1220.length(); var69++) {
                    if (Statics.field300 == field1220.charAt(var69)) {
                        var68 = true;
                        break;
                    }
                }
                if (Statics.field2418 == 13) {
                    method1239(true);
                } else {
                    if (Statics.field2418 == 85 && field1226.length() > 0) {
                        field1226 = field1226.substring(0, field1226.length() - 1);
                    }
                    if (Statics.field2418 == 84) {
                        method643();
                        return;
                    }
                    if (var68 && field1226.length() < 320) {
                        field1226 = field1226 + Statics.field300;
                    }
                }
            }
        } else if (field1209 == 6) {
            while (true) {
                do {
                    if (!class55.method2169()) {
                        short var70 = 321;
                        if (var10 == 1 && var12 >= var70 - 20 && var12 <= var70 + 20) {
                            method1239(true);
                        }
                        return;
                    }
                } while (Statics.field2418 != 84 && Statics.field2418 != 13);
                method1239(true);
            }
        } else if (field1209 == 7) {
            int var71 = field1204 + 180 - 80;
            short var72 = 321;
            if (var10 == 1 && var11 >= var71 - 75 && var11 <= var71 + 75 && var12 >= var72 - 20 && var12 <= var72 + 20) {
                class61.method324(client.method186("secure", true) + "m=dob/set_dob.ws", true, false);
                method4156(class234.field3051, class234.field3052, class234.field3053);
                field1209 = 6;
                return;
            }
            int var73 = field1204 + 180 + 80;
            if (var10 == 1 && var11 >= var73 - 75 && var11 <= var73 + 75 && var12 >= var72 - 20 && var12 <= var72 + 20) {
                method1239(true);
            }
        } else if (field1209 == 8) {
            int var74 = field1204 + 180 - 80;
            short var75 = 321;
            if (var10 == 1 && var11 >= var74 - 75 && var11 <= var74 + 75 && var12 >= var75 - 20 && var12 <= var75 + 20) {
                class61.method324("https://www.jagex.com/terms/privacy", true, false);
                method4156(class234.field3051, class234.field3052, class234.field3053);
                field1209 = 6;
                return;
            }
            int var76 = field1204 + 180 + 80;
            if (var10 == 1 && var11 >= var76 - 75 && var11 <= var76 + 75 && var12 >= var75 - 20 && var12 <= var75 + 20) {
                method1239(true);
            }
        } else if (field1209 == 12) {
            String var77 = "";
            switch(field1207) {
                case 0:
                    var77 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var77 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method1239(false);
            }
            int var78 = field1204 + 180;
            short var79 = 276;
            if (var10 == 1 && var11 >= var78 - 75 && var11 <= var78 + 75 && var12 >= var79 - 20 && var12 <= var79 + 20) {
                class61.method324(var77, true, false);
                method4156(class234.field3051, class234.field3052, class234.field3053);
                field1209 = 6;
                return;
            }
            int var80 = field1204 + 180;
            short var81 = 326;
            if (var10 == 1 && var11 >= var80 - 75 && var11 <= var80 + 75 && var12 >= var81 - 20 && var12 <= var81 + 20) {
                method1239(false);
            }
        } else if (field1209 == 24) {
            int var82 = field1204 + 180;
            short var83 = 301;
            if (var10 == 1 && var11 >= var82 - 75 && var11 <= var82 + 75 && var12 >= var83 - 20 && var12 <= var83 + 20) {
                method1239(false);
            }
        }
    }

    @ObfuscatedName("ap.q(CB)Z")
    public static boolean method590(char arg0) {
        for (int var1 = 0; var1 < field1220.length(); var1++) {
            if (arg0 == field1220.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bu.l(ZI)V")
    public static void method1239(boolean arg0) {
        field1224 = class234.field3002;
        field1212 = class234.field3003;
        field1213 = class234.field3038;
        field1209 = 2;
        if (arg0) {
            field1215 = "";
        }
        method4124();
        method69();
    }

    @ObfuscatedName("ai.s(B)V")
    public static void method643() {
        field1226 = field1226.trim();
        if (field1226.length() == 0) {
            method4156(class234.field2899, class234.field3055, class234.field3056);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method186("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class311 var4 = new class311(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field3746, var4.field3747, 1000 - var4.field3747);
                if (var5 == -1) {
                    var4.field3747 = 0;
                    long var8 = var4.method5251();
                    var6 = var8;
                    break;
                }
                var4.field3747 += var5;
                if (var4.field3747 >= 1000) {
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
            String var14 = field1226;
            Random var15 = new Random();
            class311 var16 = new class311(128);
            class311 var17 = new class311(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method5279(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method5231(var15.nextInt());
            }
            var16.method5231(var18[0]);
            var16.method5231(var18[1]);
            var16.method5233(var6);
            var16.method5233(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method5231(var15.nextInt());
            }
            var16.method5341(class90.field1156, class90.field1155);
            var17.method5279(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method5231(var15.nextInt());
            }
            var17.method5233(var15.nextLong());
            var17.method5232(var15.nextLong());
            client.method1240(var17);
            var17.method5233(var15.nextLong());
            var17.method5341(class90.field1156, class90.field1155);
            int var22 = class311.method235(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class311 var23 = new class311(var22);
            var23.method5257(var14);
            var23.field3747 = var22;
            var23.method5264(var18);
            class311 var24 = new class311(var23.field3747 + var17.field3747 + var16.field3747 + 5);
            var24.method5279(2);
            var24.method5279(var16.field3747);
            var24.method5238(var16.field3746, 0, var16.field3747);
            var24.method5279(var17.field3747);
            var24.method5238(var17.field3746, 0, var17.field3747);
            var24.method5229(var23.field3747);
            var24.method5238(var23.field3746, 0, var23.field3747);
            String var25 = class301.method2923(var24.field3746);
            byte var32;
            try {
                URL var26 = new URL(client.method186("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class351.method3188(var25) + "&dest=" + class351.method3188("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class311 var30 = new class311(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field3746, var30.field3747, 1000 - var30.field3747);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field3746);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method5265(var18);
                            while (var30.field3747 > 0 && var30.field3746[var30.field3747 - 1] == 0) {
                                var30.field3747--;
                            }
                            String var34 = new String(var30.field3746, 0, var30.field3747);
                            if (class90.method2272(var34)) {
                                class61.method324(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field3747 += var31;
                    if (var30.field3747 >= 1000) {
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
                method4156(class234.field3057, class234.field3058, class234.field3059);
                field1209 = 6;
                break;
            case 3:
                method4156(class234.field2877, class234.field2810, class234.field2936);
                break;
            case 4:
                method4156(class234.field3083, class234.field3084, class234.field2904);
                break;
            case 5:
                method4156(class234.field3066, class234.field3076, class234.field2929);
                break;
            case 6:
                method4156(class234.field3069, class234.field2958, class234.field3071);
                break;
            case 7:
                method4156(class234.field3072, class234.field2864, class234.field3074);
        }
    }

    @ObfuscatedName("fz.b(Lkl;Lkl;Lkl;I)V")
    public static void method3369(class306 arg0, class306 arg1, class306 arg2) {
        field1196 = (Statics.field88 - 765) / 2;
        field1204 = field1196 + 202;
        Statics.field1138 = field1204 + 180;
        if (field1222) {
            if (Statics.field294 == null) {
                Statics.field294 = class337.method585(Statics.field2419, "sl_back", "");
            }
            if (Statics.field358 == null) {
                Statics.field358 = class337.method3370(Statics.field2419, "sl_flags", "");
            }
            if (Statics.field433 == null) {
                Statics.field433 = class337.method3370(Statics.field2419, "sl_arrows", "");
            }
            if (Statics.field1916 == null) {
                Statics.field1916 = class337.method3370(Statics.field2419, "sl_stars", "");
            }
            if (Statics.field39 == null) {
                Statics.field39 = class337.method2226(Statics.field2419, "leftarrow", "");
            }
            if (Statics.field9 == null) {
                Statics.field9 = class337.method2226(Statics.field2419, "rightarrow", "");
            }
            class332.method5763(field1196, 23, 765, 480, 0);
            class332.method5738(field1196, 0, 125, 23, 12425273, 9135624);
            class332.method5738(field1196 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5092(class234.field2956, field1196 + 62, 15, 0, -1);
            if (Statics.field1916 != null) {
                Statics.field1916[1].method5806(field1196 + 140, 1);
                arg1.method5093(class234.field3080, field1196 + 152, 10, 16777215, -1);
                Statics.field1916[0].method5806(field1196 + 140, 12);
                arg1.method5093(class234.field3081, field1196 + 152, 21, 16777215, -1);
            }
            if (Statics.field433 != null) {
                int var3 = field1196 + 280;
                if (class81.field1031[0] == 0 && class81.field1036[0] == 0) {
                    Statics.field433[2].method5806(var3, 4);
                } else {
                    Statics.field433[0].method5806(var3, 4);
                }
                if (class81.field1031[0] == 0 && class81.field1036[0] == 1) {
                    Statics.field433[3].method5806(var3 + 15, 4);
                } else {
                    Statics.field433[1].method5806(var3 + 15, 4);
                }
                arg0.method5093(class234.field3082, var3 + 32, 17, 16777215, -1);
                int var4 = field1196 + 390;
                if (class81.field1031[0] == 1 && class81.field1036[0] == 0) {
                    Statics.field433[2].method5806(var4, 4);
                } else {
                    Statics.field433[0].method5806(var4, 4);
                }
                if (class81.field1031[0] == 1 && class81.field1036[0] == 1) {
                    Statics.field433[3].method5806(var4 + 15, 4);
                } else {
                    Statics.field433[1].method5806(var4 + 15, 4);
                }
                arg0.method5093(class234.field2840, var4 + 32, 17, 16777215, -1);
                int var5 = field1196 + 500;
                if (class81.field1031[0] == 2 && class81.field1036[0] == 0) {
                    Statics.field433[2].method5806(var5, 4);
                } else {
                    Statics.field433[0].method5806(var5, 4);
                }
                if (class81.field1031[0] == 2 && class81.field1036[0] == 1) {
                    Statics.field433[3].method5806(var5 + 15, 4);
                } else {
                    Statics.field433[1].method5806(var5 + 15, 4);
                }
                arg0.method5093(class234.field3060, var5 + 32, 17, 16777215, -1);
                int var6 = field1196 + 610;
                if (class81.field1031[0] == 3 && class81.field1036[0] == 0) {
                    Statics.field433[2].method5806(var6, 4);
                } else {
                    Statics.field433[0].method5806(var6, 4);
                }
                if (class81.field1031[0] == 3 && class81.field1036[0] == 1) {
                    Statics.field433[3].method5806(var6 + 15, 4);
                } else {
                    Statics.field433[1].method5806(var6 + 15, 4);
                }
                arg0.method5093(class234.field3085, var6 + 32, 17, 16777215, -1);
            }
            class332.method5763(field1196 + 708, 4, 50, 16, 0);
            arg1.method5092(class234.field3036, field1196 + 708 + 25, 16, 16777215, -1);
            field1216 = -1;
            if (Statics.field294 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class81.field1042) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class81.field1042) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class81.field1042) {
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
                int var17 = (class81.field1042 + var10 - 1) / var10;
                field1219 = var17 - var9;
                if (Statics.field39 != null && field1194 > 0) {
                    Statics.field39.method5806(8, Statics.field145 / 2 - Statics.field39.field3905 / 2);
                }
                if (Statics.field9 != null && field1194 < field1219) {
                    Statics.field9.method5806(Statics.field88 - Statics.field9.field3908 - 8, Statics.field145 / 2 - Statics.field9.field3905 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field1196 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field1194;
                for (int var23 = var10 * var22; var23 < class81.field1042 && var22 - field1194 < var9; var23++) {
                    class81 var24 = Statics.field1030[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field1034);
                    if (var24.field1034 == -1) {
                        var26 = class234.field3086;
                        var25 = false;
                    } else if (var24.field1034 > 1980) {
                        var26 = class234.field3087;
                        var25 = false;
                    }
                    int var27 = 0;
                    byte var28;
                    if (var24.method1750()) {
                        if (var24.method1715()) {
                            var28 = 7;
                        } else {
                            var28 = 6;
                        }
                    } else if (var24.method1719()) {
                        var27 = 16711680;
                        if (var24.method1715()) {
                            var28 = 5;
                        } else {
                            var28 = 4;
                        }
                    } else if (var24.method1721()) {
                        if (var24.method1715()) {
                            var28 = 9;
                        } else {
                            var28 = 8;
                        }
                    } else if (var24.method1717()) {
                        if (var24.method1715()) {
                            var28 = 3;
                        } else {
                            var28 = 2;
                        }
                    } else if (var24.method1715()) {
                        var28 = 1;
                    } else {
                        var28 = 0;
                    }
                    if (class64.field502 >= var19 && class64.field503 >= var18 && class64.field502 < var7 + var19 && class64.field503 < var8 + var18 && var25) {
                        field1216 = var23;
                        Statics.field294[var28].method5837(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field294[var28].method5834(var19, var18);
                    }
                    if (Statics.field358 != null) {
                        Statics.field358[(var24.method1715() ? 8 : 0) + var24.field1027].method5806(var19 + 29, var18);
                    }
                    arg0.method5092(Integer.toString(var24.field1033), var19 + 15, var8 / 2 + var18 + 5, var27, -1);
                    arg1.method5092(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
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
                    int var29 = arg1.method5084(Statics.field1030[field1216].field1032) + 6;
                    int var30 = arg1.field3712 + 8;
                    int var31 = class64.field503 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class64.field503 - 25 - var30;
                    }
                    class332.method5763(class64.field502 - var29 / 2, var31, var29, var30, 16777120);
                    class332.method5741(class64.field502 - var29 / 2, var31, var29, var30, 0);
                    arg1.method5092(Statics.field1030[field1216].field1032, class64.field502, arg1.field3712 + var31 + 4, 0, -1);
                }
            }
            Statics.field2072.method838(0, 0);
            return;
        }
        Statics.field1198.method5834(field1196, 0);
        Statics.field1199.method5834(field1196 + 382, 0);
        Statics.field1200.method5806(field1196 + 382 - Statics.field1200.field3908 / 2, 18);
        if (client.field670 == 0 || client.field670 == 5) {
            byte var32 = 20;
            arg0.method5092(class234.field3001, field1204 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class332.method5741(field1204 + 180 - 152, var33, 304, 34, 9179409);
            class332.method5741(field1204 + 180 - 151, var33 + 1, 302, 32, 0);
            class332.method5763(field1204 + 180 - 150, var33 + 2, field1205 * 3, 30, 9179409);
            class332.method5763(field1205 * 3 + (field1204 + 180 - 150), var33 + 2, 300 - field1205 * 3, 30, 0);
            arg0.method5092(field1206, field1204 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field670 == 20) {
            Statics.field114.method5806(field1204 + 180 - Statics.field114.field3908 / 2, 271 - Statics.field114.field3905 / 2);
            short var34 = 201;
            arg0.method5092(field1224, field1204 + 180, var34, 16776960, 0);
            int var107 = var34 + 15;
            arg0.method5092(field1212, field1204 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            arg0.method5092(field1213, field1204 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            int var110 = var109 + 7;
            if (field1209 != 4) {
                arg0.method5093(class234.field3029, field1204 + 180 - 110, var110, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method582(); arg0.method5084(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method5093(class307.method5122(var36), field1204 + 180 - 70, var110, 16777215, 0);
                var107 = var110 + 15;
                String var37;
                for (var37 = class302.method4373(field1215); arg0.method5084(var37) > var35; var37 = var37.substring(1)) {
                }
                arg0.method5093(class234.field3023 + var37, field1204 + 180 - 108, var107, 16777215, 0);
                var107 += 15;
            }
        }
        if (client.field670 == 10 || client.field670 == 11) {
            Statics.field114.method5806(field1204, 171);
            if (field1209 == 0) {
                short var38 = 251;
                arg0.method5092(class234.field3032, field1204 + 180, var38, 16776960, 0);
                int var111 = var38 + 30;
                int var39 = field1204 + 180 - 80;
                short var40 = 291;
                Statics.field578.method5806(var39 - 73, var40 - 20);
                arg0.method5160(class234.field3033, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var41 = field1204 + 180 + 80;
                Statics.field578.method5806(var41 - 73, var40 - 20);
                arg0.method5160(class234.field2913, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1209 == 1) {
                arg0.method5092(field1225, field1204 + 180, 201, 16776960, 0);
                short var42 = 236;
                arg0.method5092(field1224, field1204 + 180, var42, 16777215, 0);
                int var112 = var42 + 15;
                arg0.method5092(field1212, field1204 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                arg0.method5092(field1213, field1204 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                int var43 = field1204 + 180 - 80;
                short var44 = 321;
                Statics.field578.method5806(var43 - 73, var44 - 20);
                arg0.method5092(class234.field2981, var43, var44 + 5, 16777215, 0);
                int var45 = field1204 + 180 + 80;
                Statics.field578.method5806(var45 - 73, var44 - 20);
                arg0.method5092(class234.field3036, var45, var44 + 5, 16777215, 0);
            } else if (field1209 == 2) {
                short var46 = 201;
                arg0.method5092(field1224, Statics.field1138, var46, 16776960, 0);
                int var115 = var46 + 15;
                arg0.method5092(field1212, Statics.field1138, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method5092(field1213, Statics.field1138, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var118 = var117 + 7;
                arg0.method5093(class234.field3029, Statics.field1138 - 110, var118, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = method582(); arg0.method5084(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method5093(class307.method5122(var48) + (field1210 == 0 & client.field729 % 40 < 20 ? class91.method3410(16776960) + class91.field1161 : ""), Statics.field1138 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                String var49;
                for (var49 = class302.method4373(field1215); arg0.method5084(var49) > var47; var49 = var49.substring(1)) {
                }
                arg0.method5093(class234.field3023 + var49 + (field1210 == 1 & client.field729 % 40 < 20 ? class91.method3410(16776960) + class91.field1161 : ""), Statics.field1138 - 108, var115, 16777215, 0);
                var115 += 15;
                short var50 = 277;
                int var51 = Statics.field1138 + -117;
                class335 var52 = method3214(client.field701, field1223);
                var52.method5806(var51, var50);
                int var53 = var52.field3908 + 5 + var51;
                arg1.method5093(class234.field3037, var53, var50 + 13, 16776960, 0);
                int var54 = Statics.field1138 + 24;
                class335 var55 = method3214(Statics.field191.field1072, field1217);
                var55.method5806(var54, var50);
                int var56 = var55.field3908 + 5 + var54;
                arg1.method5093(class234.field2914, var56, var50 + 13, 16776960, 0);
                int var119 = var50 + 15;
                int var57 = Statics.field1138 - 80;
                short var58 = 321;
                Statics.field578.method5806(var57 - 73, var58 - 20);
                arg0.method5092(class234.field3035, var57, var58 + 5, 16777215, 0);
                int var59 = Statics.field1138 + 80;
                Statics.field578.method5806(var59 - 73, var58 - 20);
                arg0.method5092(class234.field3036, var59, var58 + 5, 16777215, 0);
                short var60 = 357;
                switch(field1208) {
                    case 2:
                        Statics.field434 = class234.field2792;
                        break;
                    default:
                        Statics.field434 = class234.field3048;
                }
                Statics.field1191 = new class330(Statics.field1138, var60, arg1.method5084(Statics.field434), 11);
                Statics.field410 = new class330(Statics.field1138, var60, arg1.method5084(class234.field3049), 11);
                arg1.method5092(Statics.field434, Statics.field1138, var60, 16777215, 0);
            } else if (field1209 == 3) {
                short var61 = 201;
                arg0.method5092(class234.field2807, field1204 + 180, var61, 16776960, 0);
                int var120 = var61 + 20;
                arg1.method5092(class234.field2962, field1204 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                arg1.method5092(class234.field3041, field1204 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                int var62 = field1204 + 180;
                short var63 = 276;
                Statics.field578.method5806(var62 - 73, var63 - 20);
                arg2.method5092(class234.field3042, var62, var63 + 5, 16777215, 0);
                int var64 = field1204 + 180;
                short var65 = 326;
                Statics.field578.method5806(var64 - 73, var65 - 20);
                arg2.method5092(class234.field3062, var64, var65 + 5, 16777215, 0);
            } else if (field1209 == 4) {
                arg0.method5092(class234.field3018, field1204 + 180, 201, 16776960, 0);
                short var66 = 236;
                arg0.method5092(field1224, field1204 + 180, var66, 16777215, 0);
                int var123 = var66 + 15;
                arg0.method5092(field1212, field1204 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                arg0.method5092(field1213, field1204 + 180, var124, 16777215, 0);
                int var125 = var124 + 15;
                arg0.method5093(class234.field2856 + class302.method4373(Statics.field5) + (client.field729 % 40 < 20 ? class91.method3410(16776960) + class91.field1161 : ""), field1204 + 180 - 108, var125, 16777215, 0);
                int var126 = var125 - 8;
                arg0.method5093(class234.field2796, field1204 + 180 - 9, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg0.method5093(class234.field2797, field1204 + 180 - 9, var127, 16776960, 0);
                int var67 = field1204 + 180 - 9 + arg0.method5084(class234.field2797) + 15;
                int var68 = var127 - arg0.field3712;
                class335 var69;
                if (field1218) {
                    var69 = Statics.field1202;
                } else {
                    var69 = Statics.field571;
                }
                var69.method5806(var67, var68);
                var123 = var127 + 15;
                int var70 = field1204 + 180 - 80;
                short var71 = 321;
                Statics.field578.method5806(var70 - 73, var71 - 20);
                arg0.method5092(class234.field2981, var70, var71 + 5, 16777215, 0);
                int var72 = field1204 + 180 + 80;
                Statics.field578.method5806(var72 - 73, var71 - 20);
                arg0.method5092(class234.field3036, var72, var71 + 5, 16777215, 0);
                arg1.method5092(class234.field3019, field1204 + 180, var71 + 36, 255, 0);
            } else if (field1209 == 5) {
                arg0.method5092(class234.field3034, field1204 + 180, 201, 16776960, 0);
                short var73 = 221;
                arg2.method5092(field1224, field1204 + 180, var73, 16776960, 0);
                int var128 = var73 + 15;
                arg2.method5092(field1212, field1204 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg2.method5092(field1213, field1204 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var131 = var130 + 14;
                arg0.method5093(class234.field3045, field1204 + 180 - 145, var131, 16777215, 0);
                short var74 = 174;
                String var75;
                for (var75 = method582(); arg0.method5084(var75) > var74; var75 = var75.substring(1)) {
                }
                arg0.method5093(class307.method5122(var75) + (client.field729 % 40 < 20 ? class91.method3410(16776960) + class91.field1161 : ""), field1204 + 180 - 34, var131, 16777215, 0);
                var128 = var131 + 15;
                int var76 = field1204 + 180 - 80;
                short var77 = 321;
                Statics.field578.method5806(var76 - 73, var77 - 20);
                arg0.method5092(class234.field3073, var76, var77 + 5, 16777215, 0);
                int var78 = field1204 + 180 + 80;
                Statics.field578.method5806(var78 - 73, var77 - 20);
                arg0.method5092(class234.field2890, var78, var77 + 5, 16777215, 0);
                short var79 = 356;
                arg1.method5092(class234.field3049, Statics.field1138, var79, 268435455, 0);
            } else if (field1209 == 6) {
                short var80 = 201;
                arg0.method5092(field1224, field1204 + 180, var80, 16776960, 0);
                int var132 = var80 + 15;
                arg0.method5092(field1212, field1204 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method5092(field1213, field1204 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var81 = field1204 + 180;
                short var82 = 321;
                Statics.field578.method5806(var81 - 73, var82 - 20);
                arg0.method5092(class234.field2890, var81, var82 + 5, 16777215, 0);
            } else if (field1209 == 7) {
                short var83 = 216;
                arg0.method5092(class234.field2824, field1204 + 180, var83, 16776960, 0);
                int var135 = var83 + 15;
                arg2.method5092(class234.field2975, field1204 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg2.method5092(class234.field3077, field1204 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var84 = field1204 + 180 - 80;
                short var85 = 321;
                Statics.field578.method5806(var84 - 73, var85 - 20);
                arg0.method5092(class234.field3078, var84, var85 + 5, 16777215, 0);
                int var86 = field1204 + 180 + 80;
                Statics.field578.method5806(var86 - 73, var85 - 20);
                arg0.method5092(class234.field2890, var86, var85 + 5, 16777215, 0);
            } else if (field1209 == 8) {
                short var87 = 216;
                arg0.method5092(class234.field2925, field1204 + 180, var87, 16776960, 0);
                int var138 = var87 + 15;
                arg2.method5092(class234.field2926, field1204 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg2.method5092(class234.field2927, field1204 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var88 = field1204 + 180 - 80;
                short var89 = 321;
                Statics.field578.method5806(var88 - 73, var89 - 20);
                arg0.method5092(class234.field2928, var88, var89 + 5, 16777215, 0);
                int var90 = field1204 + 180 + 80;
                Statics.field578.method5806(var90 - 73, var89 - 20);
                arg0.method5092(class234.field2890, var90, var89 + 5, 16777215, 0);
            } else if (field1209 == 12) {
                short var91 = 201;
                String var92 = "";
                String var93 = "";
                String var94 = "";
                switch(field1207) {
                    case 0:
                        var92 = class234.field2841;
                        var93 = class234.field2842;
                        var94 = class234.field2843;
                        break;
                    case 1:
                        var92 = class234.field2880;
                        var93 = class234.field2919;
                        var94 = class234.field2882;
                        break;
                    default:
                        method1239(false);
                }
                arg0.method5092(var92, field1204 + 180, var91, 16776960, 0);
                int var141 = var91 + 15;
                arg2.method5092(var93, field1204 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg2.method5092(var94, field1204 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var95 = field1204 + 180;
                short var96 = 276;
                Statics.field578.method5806(var95 - 73, var96 - 20);
                arg0.method5092(class234.field2825, var95, var96 + 5, 16777215, 0);
                int var97 = field1204 + 180;
                short var98 = 326;
                Statics.field578.method5806(var97 - 73, var98 - 20);
                arg0.method5092(class234.field2890, var97, var98 + 5, 16777215, 0);
            } else if (field1209 == 24) {
                short var99 = 221;
                arg0.method5092(field1224, field1204 + 180, var99, 16777215, 0);
                int var144 = var99 + 15;
                arg0.method5092(field1212, field1204 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                arg0.method5092(field1213, field1204 + 180, var145, 16777215, 0);
                int var146 = var145 + 15;
                int var100 = field1204 + 180;
                short var101 = 301;
                Statics.field578.method5806(var100 - 73, var101 - 20);
                arg0.method5092(class234.field2980, var100, var101 + 5, 16777215, 0);
            }
        }
        if (client.field670 >= 10) {
            int[] var102 = new int[4];
            class332.method5762(var102);
            class332.method5729(field1196, 0, field1196 + 765, Statics.field145);
            Statics.field55.method1767(field1196 - 22, client.field729);
            Statics.field55.method1767(field1196 + 765 + 22 - 128, client.field729);
            class332.method5732(var102);
        }
        Statics.field1211[Statics.field191.field1077 ? 1 : 0].method5806(field1196 + 765 - 40, 463);
        if (client.field670 <= 5 || Statics.field3535 != class200.field2387) {
            return;
        }
        if (Statics.field1040 == null) {
            Statics.field1040 = class337.method2226(Statics.field2419, "sl_button", "");
            return;
        }
        int var103 = field1196 + 5;
        short var104 = 463;
        byte var105 = 100;
        byte var106 = 35;
        Statics.field1040.method5806(var103, var104);
        arg0.method5092(class234.field2837 + " " + client.field844, var105 / 2 + var103, var106 / 2 + var104 - 2, 16777215, 0);
        if (Statics.field1982 == null) {
            arg1.method5092(class234.field3031, var105 / 2 + var103, var106 / 2 + var104 + 12, 16777215, 0);
        } else {
            arg1.method5092(class234.field3088, var105 / 2 + var103, var106 / 2 + var104 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ij.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4156(String arg0, String arg1, String arg2) {
        field1224 = arg0;
        field1212 = arg1;
        field1213 = arg2;
    }

    @ObfuscatedName("az.w(Lbt;I)V")
    public static void method583(class63 arg0) {
        while (class55.method2169()) {
            if (Statics.field2418 == 13) {
                method3293();
                return;
            }
            if (Statics.field2418 == 96) {
                if (field1194 > 0 && Statics.field39 != null) {
                    field1194--;
                }
            } else if (Statics.field2418 == 97 && field1194 < field1219 && Statics.field9 != null) {
                field1194++;
            }
        }
        if (class64.field509 != 1 && Statics.field47 || class64.field509 != 4) {
            return;
        }
        int var1 = field1196 + 280;
        if (class64.field510 >= var1 && class64.field510 <= var1 + 14 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(0, 0);
            return;
        }
        if (class64.field510 >= var1 + 15 && class64.field510 <= var1 + 80 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(0, 1);
            return;
        }
        int var2 = field1196 + 390;
        if (class64.field510 >= var2 && class64.field510 <= var2 + 14 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(1, 0);
            return;
        }
        if (class64.field510 >= var2 + 15 && class64.field510 <= var2 + 80 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(1, 1);
            return;
        }
        int var3 = field1196 + 500;
        if (class64.field510 >= var3 && class64.field510 <= var3 + 14 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(2, 0);
            return;
        }
        if (class64.field510 >= var3 + 15 && class64.field510 <= var3 + 80 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(2, 1);
            return;
        }
        int var4 = field1196 + 610;
        if (class64.field510 >= var4 && class64.field510 <= var4 + 14 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(3, 0);
            return;
        }
        if (class64.field510 >= var4 + 15 && class64.field510 <= var4 + 80 && class64.field511 >= 4 && class64.field511 <= 18) {
            class81.method9(3, 1);
            return;
        }
        if (class64.field510 >= field1196 + 708 && class64.field511 >= 4 && class64.field510 <= field1196 + 708 + 50 && class64.field511 <= 20) {
            method3293();
            return;
        }
        if (field1216 != -1) {
            class81 var5 = Statics.field1030[field1216];
            method2224(var5);
            method3293();
            return;
        }
        if (field1194 > 0 && Statics.field39 != null && class64.field510 >= 0 && class64.field510 <= Statics.field39.field3908 && class64.field511 >= Statics.field145 / 2 - 50 && class64.field511 <= Statics.field145 / 2 + 50) {
            field1194--;
        }
        if (field1194 < field1219 && Statics.field9 != null && class64.field510 >= Statics.field88 - Statics.field9.field3908 - 5 && class64.field510 <= Statics.field88 && class64.field511 >= Statics.field145 / 2 - 50 && class64.field511 <= Statics.field145 / 2 + 50) {
            field1194++;
        }
    }

    @ObfuscatedName("ct.k(Lcq;I)V")
    public static void method2224(class81 arg0) {
        if (arg0.method1715() != client.field665) {
            client.field665 = arg0.method1715();
            boolean var1 = arg0.method1715();
            if (Statics.field3880 != var1) {
                class266.field3437.method3218();
                class266.field3485.method3218();
                class266.field3467.method3218();
                Statics.field3880 = var1;
            }
        }
        if (client.field663 != arg0.field1028) {
            class247 var2 = Statics.field2419;
            int var3 = arg0.field1028;
            if ((var3 & 0x20000000) != 0) {
                Statics.field1200 = class337.method2226(var2, "logo_deadman_mode", "");
            } else if ((var3 & 0x40000000) == 0) {
                Statics.field1200 = class337.method2226(var2, "logo", "");
            } else {
                Statics.field1200 = class337.method2226(var2, "logo_seasonal_mode", "");
            }
        }
        Statics.field2471 = arg0.field1035;
        client.field844 = arg0.field1033;
        client.field663 = arg0.field1028;
        Statics.field603 = client.field664 == 0 ? 43594 : arg0.field1033 + 40000;
        Statics.field2020 = client.field664 == 0 ? 443 : arg0.field1033 + 50000;
        Statics.field1313 = Statics.field603;
    }

    @ObfuscatedName("ax.i(II)V")
    public static void method343(int arg0) {
        field1209 = 12;
        field1207 = arg0;
    }

    @ObfuscatedName("dq.x(I)V")
    public static void method2498() {
        if (class81.method220()) {
            field1222 = true;
            field1194 = 0;
            field1219 = 0;
        }
    }

    @ObfuscatedName("fn.g(I)V")
    public static void method3293() {
        field1222 = false;
        Statics.field1198.method5834(field1196, 0);
        Statics.field1199.method5834(field1196 + 382, 0);
        Statics.field1200.method5806(field1196 + 382 - Statics.field1200.field3908 / 2, 18);
    }
}
