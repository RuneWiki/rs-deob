package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("cy")
public class class90 {

    @ObfuscatedName("cy.q")
    public static int field1325 = 0;

    @ObfuscatedName("cy.m")
    public static int field1304 = field1325 + 202;

    @ObfuscatedName("cy.j")
    public static int[] field1305 = new int[256];

    @ObfuscatedName("cy.i")
    public static int field1331 = 0;

    @ObfuscatedName("cy.av")
    public static int field1307 = 0;

    @ObfuscatedName("cy.af")
    public static int field1309 = 0;

    @ObfuscatedName("cy.ai")
    public static int field1310 = 0;

    @ObfuscatedName("cy.aq")
    public static int field1311 = 0;

    @ObfuscatedName("cy.ak")
    public static int field1336 = 0;

    @ObfuscatedName("cy.al")
    public static int field1306 = 10;

    @ObfuscatedName("cy.as")
    public static String field1314 = "";

    @ObfuscatedName("cy.az")
    public static int field1318 = 0;

    @ObfuscatedName("cy.ax")
    public static String field1327 = "";

    @ObfuscatedName("cy.ad")
    public static String field1328 = "";

    @ObfuscatedName("cy.ar")
    public static String field1315 = "";

    @ObfuscatedName("cy.ag")
    public static String field1319 = "";

    @ObfuscatedName("cy.au")
    public static String field1320 = "";

    @ObfuscatedName("cy.ac")
    public static String field1299 = "";

    @ObfuscatedName("cy.ay")
    public static boolean field1322 = false;

    @ObfuscatedName("cy.an")
    public static boolean field1321 = false;

    @ObfuscatedName("cy.bh")
    public static boolean field1326 = false;

    @ObfuscatedName("cy.bf")
    public static boolean field1313 = true;

    @ObfuscatedName("cy.bp")
    public static int field1332 = 0;

    @ObfuscatedName("cy.bj")
    public static String field1324 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cy.bi")
    public static String field1312 = "1234567890";

    @ObfuscatedName("cy.be")
    public static boolean field1317 = false;

    @ObfuscatedName("cy.bw")
    public static int field1316 = -1;

    @ObfuscatedName("cy.ba")
    public static long field1333;

    @ObfuscatedName("cy.bz")
    public static long field1334;

    static {
        new DecimalFormat("##0.00");
        new class160();
        field1333 = -1L;
        field1334 = -1L;
    }

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.b(B)I")
    public static int method2917() {
        return 11;
    }

    @ObfuscatedName("bx.q(Lie;Lie;ZII)V")
    public static void method707(class256 arg0, class256 arg1, boolean arg2, int arg3) {
        if (!Statics.field31) {
            field1318 = arg3;
            class319.method5216();
            byte[] var4 = arg0.method4180("title.jpg", "");
            Statics.field2760 = Statics.method3002(var4);
            Statics.field3807 = Statics.field2760.method5333();
            if ((client.field823 & 0x20000000) == 0) {
                Statics.field1302 = class324.method2828(arg1, "logo", "");
            } else {
                Statics.field1302 = class324.method2828(arg1, "logo_deadman_mode", "");
            }
            Statics.field1300 = class324.method2828(arg1, "titlebox", "");
            Statics.field1265 = class324.method2828(arg1, "titlebutton", "");
            Statics.field1301 = class324.method3228(arg1, "runes", "");
            Statics.field1542 = class324.method3228(arg1, "title_mute", "");
            Statics.field260 = class324.method2828(arg1, "options_radio_buttons,0", "");
            Statics.field505 = class324.method2828(arg1, "options_radio_buttons,4", "");
            Statics.field1303 = class324.method2828(arg1, "options_radio_buttons,2", "");
            Statics.field3703 = class324.method2828(arg1, "options_radio_buttons,6", "");
            Statics.field2551 = Statics.field260.field3895;
            Statics.field1366 = Statics.field260.field3896;
            Statics.field386 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field386[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field386[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field386[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field386[var8 + 192] = 16777215;
            }
            Statics.field2094 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2094[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2094[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2094[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2094[var12 + 192] = 16777215;
            }
            Statics.field371 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field371[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field371[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field371[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field371[var16 + 192] = 16777215;
            }
            Statics.field1430 = new int[256];
            Statics.field472 = new int[32768];
            Statics.field468 = new int[32768];
            method4150((class322) null);
            Statics.field1308 = new int[32768];
            Statics.field1423 = new int[32768];
            if (arg2) {
                field1320 = "";
                field1299 = "";
            }
            Statics.field254 = 0;
            Statics.field741 = "";
            field1313 = true;
            field1317 = false;
            if (Statics.field1072.field1183) {
                class224.method4151(2);
            } else {
                class258 var17 = Statics.field2107;
                int var18 = var17.method4177("scape main");
                int var19 = var17.method4228(var18, "");
                class224.field2647 = 1;
                Statics.field2472 = var17;
                Statics.field2649 = var18;
                Statics.field1659 = var19;
                Statics.field2646 = 255;
                Statics.field2648 = false;
                Statics.field1889 = 2;
            }
            class259.method4013(false);
            Statics.field31 = true;
            field1325 = (Statics.field9 - 765) / 2;
            field1304 = field1325 + 202;
            Statics.field2642 = field1304 + 180;
            Statics.field2760.method5342(field1325, 0);
            Statics.field3807.method5342(field1325 + 382, 0);
            Statics.field1302.method5316(field1325 + 382 - Statics.field1302.field3895 / 2, 18);
        } else if (arg3 == 4) {
            field1318 = 4;
        }
    }

    @ObfuscatedName("jm.o(ZZI)Llv;")
    public static class322 method4462(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3703 : Statics.field1303) : (arg1 ? Statics.field505 : Statics.field260);
    }

    @ObfuscatedName("fd.a(Lbi;I)V")
    public static void method3136(class59 arg0) {
        if (!field1317) {
            if ((class60.field673 == 1 || !Statics.field333 && class60.field673 == 4) && class60.field672 >= field1325 + 765 - 50 && class60.field675 >= 453) {
                Statics.field1072.field1183 = !Statics.field1072.field1183;
                class78.method2590();
                if (Statics.field1072.field1183) {
                    Statics.field2106.method3828();
                    class224.field2647 = 1;
                    Statics.field2472 = null;
                } else {
                    class258 var6 = Statics.field2107;
                    int var7 = var6.method4177("scape main");
                    int var8 = var6.method4228(var7, "");
                    class224.method2898(var6, var7, var8, 255, false);
                }
            }
            if (client.field828 != 5) {
                if (field1333 == -1L) {
                    field1333 = class196.method3211() + 1000L;
                }
                long var9 = class196.method3211();
                boolean var12;
                if (client.field933 == null || client.field1076 >= client.field933.size()) {
                    var12 = true;
                } else {
                    while (true) {
                        if (client.field1076 >= client.field933.size()) {
                            var12 = true;
                            break;
                        }
                        class64 var11 = (class64) client.field933.get(client.field1076);
                        if (!var11.method1009()) {
                            var12 = false;
                            break;
                        }
                        client.field1076++;
                    }
                }
                if (var12 && field1334 == -1L) {
                    field1334 = var9;
                    if (field1334 > field1333) {
                        field1333 = field1334;
                    }
                }
                field1311++;
                if (client.field828 == 10 || client.field828 == 11) {
                    if (client.field827 == 0) {
                        if (class60.field673 == 1 || !Statics.field333 && class60.field673 == 4) {
                            int var13 = field1325 + 5;
                            short var14 = 463;
                            byte var15 = 100;
                            byte var16 = 35;
                            if (class60.field672 >= var13 && class60.field672 <= var13 + var15 && class60.field675 >= var14 && class60.field675 <= var14 + var16) {
                                if (class77.method1569()) {
                                    field1317 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1171 != null && class77.method1569()) {
                            field1317 = true;
                        }
                    }
                    int var17 = class60.field673;
                    int var18 = class60.field672;
                    int var19 = class60.field675;
                    if (var17 == 0) {
                        var18 = class60.field670;
                        var19 = class60.field668;
                    }
                    if (!Statics.field333 && var17 == 4) {
                        var17 = 1;
                    }
                    if (field1318 == 0) {
                        boolean var20 = false;
                        while (class51.method635()) {
                            if (Statics.field1564 == 84) {
                                var20 = true;
                            }
                        }
                        int var21 = Statics.field2642 - 80;
                        short var22 = 291;
                        if (var17 == 1 && var18 >= var21 - 75 && var18 <= var21 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20) {
                            class57.method3129(client.method1039("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var23 = Statics.field2642 + 80;
                        if (var17 == 1 && var18 >= var23 - 75 && var18 <= var23 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20 || var20) {
                            if ((client.field823 & 0x2000000) != 0) {
                                field1327 = "";
                                field1328 = class246.field3196;
                                field1315 = class246.field3197;
                                field1319 = class246.field3195;
                                field1318 = 1;
                                Statics.method1715();
                            } else if ((client.field823 & 0x4) != 0) {
                                if ((client.field823 & 0x400) == 0) {
                                    field1328 = class246.field3187;
                                    field1315 = class246.field3188;
                                    field1319 = class246.field3029;
                                } else {
                                    field1328 = class246.field3193;
                                    field1315 = class246.field2990;
                                    field1319 = class246.field3153;
                                }
                                field1327 = class246.field3248;
                                field1318 = 1;
                                Statics.method1715();
                            } else if ((client.field823 & 0x400) == 0) {
                                method191(false);
                            } else {
                                field1328 = class246.field3190;
                                field1315 = class246.field3191;
                                field1319 = class246.field3192;
                                field1327 = class246.field3248;
                                field1318 = 1;
                                Statics.method1715();
                            }
                        }
                    } else if (field1318 == 1) {
                        while (class51.method635()) {
                            if (Statics.field1564 == 84) {
                                method191(false);
                            } else if (Statics.field1564 == 13) {
                                field1318 = 0;
                            }
                        }
                        int var24 = Statics.field2642 - 80;
                        short var25 = 321;
                        if (var17 == 1 && var18 >= var24 - 75 && var18 <= var24 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                            method191(false);
                        }
                        int var26 = Statics.field2642 + 80;
                        if (var17 == 1 && var18 >= var26 - 75 && var18 <= var26 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                            field1318 = 0;
                        }
                    } else if (field1318 == 2) {
                        short var27 = 201;
                        int var53 = var27 + 52;
                        if (var17 == 1 && var19 >= var53 - 12 && var19 < var53 + 2) {
                            field1332 = 0;
                        }
                        var53 += 15;
                        if (var17 == 1 && var19 >= var53 - 12 && var19 < var53 + 2) {
                            field1332 = 1;
                        }
                        var53 += 15;
                        short var28 = 361;
                        if (var17 == 1 && var19 >= var28 - 15 && var19 < var28) {
                            method3494(class246.field3224, class246.field3225, class246.field3226);
                            field1318 = 5;
                            return;
                        }
                        int var29 = Statics.field2642 - 80;
                        short var30 = 321;
                        if (var17 == 1 && var18 >= var29 - 75 && var18 <= var29 + 75 && var19 >= var30 - 20 && var19 <= var30 + 20) {
                            field1320 = field1320.trim();
                            if (field1320.length() == 0) {
                                method3494(class246.field3208, class246.field3090, class246.field3091);
                                return;
                            }
                            if (field1299.length() == 0) {
                                method3494(class246.field3204, class246.field3009, class246.field3094);
                                return;
                            }
                            method3494(class246.field3201, class246.field3202, class246.field3240);
                            client.method71(false);
                            client.method262(20);
                            return;
                        }
                        int var31 = field1304 + 180 + 80;
                        if (var17 == 1 && var18 >= var31 - 75 && var18 <= var31 + 75 && var19 >= var30 - 20 && var19 <= var30 + 20) {
                            field1318 = 0;
                            field1320 = "";
                            field1299 = "";
                            Statics.field254 = 0;
                            Statics.field741 = "";
                            field1313 = true;
                        }
                        int var32 = Statics.field2642 + -117;
                        short var33 = 277;
                        field1321 = var18 >= var32 && var18 < Statics.field2551 + var32 && var19 >= var33 && var19 < Statics.field1366 + var33;
                        if (var17 == 1 && field1321) {
                            field1322 = !field1322;
                            if (!field1322 && Statics.field1072.field1185 != null) {
                                Statics.field1072.field1185 = null;
                                class78.method2590();
                            }
                        }
                        int var34 = Statics.field2642 + 24;
                        short var35 = 277;
                        field1326 = var18 >= var34 && var18 < Statics.field2551 + var34 && var19 >= var35 && var19 < Statics.field1366 + var35;
                        if (var17 == 1 && field1326) {
                            Statics.field1072.field1186 = !Statics.field1072.field1186;
                            if (!Statics.field1072.field1186) {
                                field1320 = "";
                                Statics.field1072.field1185 = null;
                                Statics.method1715();
                            }
                            class78.method2590();
                        }
                        while (true) {
                            while (class51.method635()) {
                                boolean var36 = false;
                                for (int var37 = 0; var37 < field1324.length(); var37++) {
                                    if (Statics.field30 == field1324.charAt(var37)) {
                                        var36 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1564 == 13) {
                                    field1318 = 0;
                                    field1320 = "";
                                    field1299 = "";
                                    Statics.field254 = 0;
                                    Statics.field741 = "";
                                    field1313 = true;
                                } else if (field1332 == 0) {
                                    if (Statics.field1564 == 85 && field1320.length() > 0) {
                                        field1320 = field1320.substring(0, field1320.length() - 1);
                                    }
                                    if (Statics.field1564 == 84 || Statics.field1564 == 80) {
                                        field1332 = 1;
                                    }
                                    if (var36 && field1320.length() < 320) {
                                        field1320 = field1320 + Statics.field30;
                                    }
                                } else if (field1332 == 1) {
                                    if (Statics.field1564 == 85 && field1299.length() > 0) {
                                        field1299 = field1299.substring(0, field1299.length() - 1);
                                    }
                                    if (Statics.field1564 == 84 || Statics.field1564 == 80) {
                                        field1332 = 0;
                                    }
                                    if (Statics.field1564 == 84) {
                                        field1320 = field1320.trim();
                                        if (field1320.length() == 0) {
                                            method3494(class246.field3208, class246.field3090, class246.field3091);
                                            return;
                                        }
                                        if (field1299.length() == 0) {
                                            method3494(class246.field3204, class246.field3009, class246.field3094);
                                            return;
                                        }
                                        method3494(class246.field3201, class246.field3202, class246.field3240);
                                        client.method71(false);
                                        client.method262(20);
                                        return;
                                    }
                                    if (var36 && field1299.length() < 20) {
                                        field1299 = field1299 + Statics.field30;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1318 == 3) {
                        int var38 = field1304 + 180;
                        short var39 = 276;
                        if (var17 == 1 && var18 >= var38 - 75 && var18 <= var38 + 75 && var19 >= var39 - 20 && var19 <= var39 + 20) {
                            method191(false);
                        }
                        int var40 = field1304 + 180;
                        short var41 = 326;
                        if (var17 == 1 && var18 >= var40 - 75 && var18 <= var40 + 75 && var19 >= var41 - 20 && var19 <= var41 + 20) {
                            method3494(class246.field3224, class246.field3225, class246.field3226);
                            field1318 = 5;
                            return;
                        }
                    } else if (field1318 == 4) {
                        int var42 = field1304 + 180 - 80;
                        short var43 = 321;
                        if (var17 == 1 && var18 >= var42 - 75 && var18 <= var42 + 75 && var19 >= var43 - 20 && var19 <= var43 + 20) {
                            Statics.field741.trim();
                            if (Statics.field741.length() != 6) {
                                method3494(class246.field3067, class246.field3019, class246.field3251);
                                return;
                            }
                            Statics.field254 = Integer.parseInt(Statics.field741);
                            Statics.field741 = "";
                            client.method71(true);
                            method3494(class246.field3201, class246.field3202, class246.field3240);
                            client.method262(20);
                            return;
                        }
                        if (var17 == 1 && var18 >= field1304 + 180 - 9 && var18 <= field1304 + 180 + 130 && var19 >= 263 && var19 <= 296) {
                            field1313 = !field1313;
                        }
                        if (var17 == 1 && var18 >= field1304 + 180 - 34 && var18 <= field1304 + 180 + 34 && var19 >= 351 && var19 <= 363) {
                            class57.method3129(client.method1039("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var44 = field1304 + 180 + 80;
                        if (var17 == 1 && var18 >= var44 - 75 && var18 <= var44 + 75 && var19 >= var43 - 20 && var19 <= var43 + 20) {
                            field1318 = 0;
                            field1320 = "";
                            field1299 = "";
                            Statics.field254 = 0;
                            Statics.field741 = "";
                        }
                        while (class51.method635()) {
                            boolean var45 = false;
                            for (int var46 = 0; var46 < field1312.length(); var46++) {
                                if (Statics.field30 == field1312.charAt(var46)) {
                                    var45 = true;
                                    break;
                                }
                            }
                            if (Statics.field1564 == 13) {
                                field1318 = 0;
                                field1320 = "";
                                field1299 = "";
                                Statics.field254 = 0;
                                Statics.field741 = "";
                            } else {
                                if (Statics.field1564 == 85 && Statics.field741.length() > 0) {
                                    Statics.field741 = Statics.field741.substring(0, Statics.field741.length() - 1);
                                }
                                if (Statics.field1564 == 84) {
                                    Statics.field741.trim();
                                    if (Statics.field741.length() != 6) {
                                        method3494(class246.field3067, class246.field3019, class246.field3251);
                                        return;
                                    }
                                    Statics.field254 = Integer.parseInt(Statics.field741);
                                    Statics.field741 = "";
                                    client.method71(true);
                                    method3494(class246.field3201, class246.field3202, class246.field3240);
                                    client.method262(20);
                                    return;
                                }
                                if (var45 && Statics.field741.length() < 6) {
                                    Statics.field741 = Statics.field741 + Statics.field30;
                                }
                            }
                        }
                    } else if (field1318 == 5) {
                        int var47 = field1304 + 180 - 80;
                        short var48 = 321;
                        if (var17 == 1 && var18 >= var47 - 75 && var18 <= var47 + 75 && var19 >= var48 - 20 && var19 <= var48 + 20) {
                            method3151();
                            return;
                        }
                        int var49 = field1304 + 180 + 80;
                        if (var17 == 1 && var18 >= var49 - 75 && var18 <= var49 + 75 && var19 >= var48 - 20 && var19 <= var48 + 20) {
                            method191(true);
                        }
                        while (class51.method635()) {
                            boolean var50 = false;
                            for (int var51 = 0; var51 < field1324.length(); var51++) {
                                if (Statics.field30 == field1324.charAt(var51)) {
                                    var50 = true;
                                    break;
                                }
                            }
                            if (Statics.field1564 == 13) {
                                method191(true);
                            } else {
                                if (Statics.field1564 == 85 && field1320.length() > 0) {
                                    field1320 = field1320.substring(0, field1320.length() - 1);
                                }
                                if (Statics.field1564 == 84) {
                                    method3151();
                                    return;
                                }
                                if (var50 && field1320.length() < 320) {
                                    field1320 = field1320 + Statics.field30;
                                }
                            }
                        }
                    } else if (field1318 == 6) {
                        while (true) {
                            do {
                                if (!class51.method635()) {
                                    short var52 = 321;
                                    if (var17 == 1 && var19 >= var52 - 20 && var19 <= var52 + 20) {
                                        method191(true);
                                    }
                                    return;
                                }
                            } while (Statics.field1564 != 84 && Statics.field1564 != 13);
                            method191(true);
                        }
                    }
                }
            }
        } else if (class60.field673 == 1 || !Statics.field333 && class60.field673 == 4) {
            int var1 = field1325 + 280;
            if (class60.field672 >= var1 && class60.field672 <= var1 + 14 && class60.field675 >= 4 && class60.field675 <= 18) {
                class77.method502(0, 0);
            } else if (class60.field672 >= var1 + 15 && class60.field672 <= var1 + 80 && class60.field675 >= 4 && class60.field675 <= 18) {
                class77.method502(0, 1);
            } else {
                int var2 = field1325 + 390;
                if (class60.field672 >= var2 && class60.field672 <= var2 + 14 && class60.field675 >= 4 && class60.field675 <= 18) {
                    class77.method502(1, 0);
                } else if (class60.field672 >= var2 + 15 && class60.field672 <= var2 + 80 && class60.field675 >= 4 && class60.field675 <= 18) {
                    class77.method502(1, 1);
                } else {
                    int var3 = field1325 + 500;
                    if (class60.field672 >= var3 && class60.field672 <= var3 + 14 && class60.field675 >= 4 && class60.field675 <= 18) {
                        class77.method502(2, 0);
                    } else if (class60.field672 >= var3 + 15 && class60.field672 <= var3 + 80 && class60.field675 >= 4 && class60.field675 <= 18) {
                        class77.method502(2, 1);
                    } else {
                        int var4 = field1325 + 610;
                        if (class60.field672 >= var4 && class60.field672 <= var4 + 14 && class60.field675 >= 4 && class60.field675 <= 18) {
                            class77.method502(3, 0);
                        } else if (class60.field672 >= var4 + 15 && class60.field672 <= var4 + 80 && class60.field675 >= 4 && class60.field675 <= 18) {
                            class77.method502(3, 1);
                        } else if (class60.field672 >= field1325 + 708 && class60.field675 >= 4 && class60.field672 <= field1325 + 708 + 50 && class60.field675 <= 20) {
                            field1317 = false;
                            Statics.field2760.method5342(field1325, 0);
                            Statics.field3807.method5342(field1325 + 382, 0);
                            Statics.field1302.method5316(field1325 + 382 - Statics.field1302.field3895 / 2, 18);
                        } else if (field1316 != -1) {
                            class77 var5 = Statics.field1179[field1316];
                            method579(var5);
                            field1317 = false;
                            Statics.field2760.method5342(field1325, 0);
                            Statics.field3807.method5342(field1325 + 382, 0);
                            Statics.field1302.method5316(field1325 + 382 - Statics.field1302.field3895 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.h(ZI)V")
    public static void method191(boolean arg0) {
        field1328 = class246.field3085;
        field1315 = class246.field3184;
        field1319 = class246.field3044;
        field1318 = 2;
        if (arg0) {
            field1299 = "";
        }
        if (field1320 == null || field1320.length() <= 0) {
            if (Statics.field1072.field1185 == null) {
                field1322 = false;
            } else {
                field1320 = Statics.field1072.field1185;
                field1322 = true;
            }
        }
        Statics.method1715();
    }

    @ObfuscatedName("gr.l(I)V")
    public static void method3151() {
        field1320 = field1320.trim();
        if (field1320.length() == 0) {
            method3494(class246.field3224, class246.field3225, class246.field3226);
            return;
        }
        long var0 = class85.method1015();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1320;
            Random var4 = new Random();
            class194 var5 = new class194(128);
            class194 var6 = new class194(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3232(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3235(var4.nextInt());
            }
            var5.method3235(var7[0]);
            var5.method3235(var7[1]);
            var5.method3246(var0);
            var5.method3246(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3235(var4.nextInt());
            }
            var5.method3269(class85.field1264, class85.field1259);
            var6.method3232(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3235(var4.nextInt());
            }
            var6.method3246(var4.nextLong());
            var6.method3465(var4.nextLong());
            if (client.field858 == null) {
                byte[] var11 = class167.method2923();
                var6.method3242(var11, 0, var11.length);
            } else {
                var6.method3242(client.field858, 0, client.field858.length);
            }
            var6.method3246(var4.nextLong());
            var6.method3269(class85.field1264, class85.field1259);
            int var12 = class194.method564(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class194 var13 = new class194(var12);
            var13.method3239(var3);
            var13.field2538 = var12;
            var13.method3438(var7);
            class194 var14 = new class194(var13.field2538 + var6.field2538 + var5.field2538 + 5);
            var14.method3232(2);
            var14.method3232(var5.field2538);
            var14.method3242(var5.field2541, 0, var5.field2538);
            var14.method3232(var6.field2538);
            var14.method3242(var6.field2541, 0, var6.field2538);
            var14.method3233(var13.field2538);
            var14.method3242(var13.field2541, 0, var13.field2538);
            String var15 = class304.method1793(var14.field2541);
            byte var22;
            try {
                URL var16 = new URL(client.method1039("services", false) + "m=accountappeal/login.ws");
                URLConnection var17 = var16.openConnection();
                var17.setDoInput(true);
                var17.setDoOutput(true);
                var17.setConnectTimeout(5000);
                OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
                var18.write("data2=" + class331.method3131(var15) + "&dest=" + class331.method3131("passwordchoice.ws"));
                var18.flush();
                InputStream var19 = var17.getInputStream();
                class194 var20 = new class194(new byte[1000]);
                while (true) {
                    int var21 = var19.read(var20.field2541, var20.field2538, 1000 - var20.field2538);
                    if (var21 == -1) {
                        var18.close();
                        var19.close();
                        String var23 = new String(var20.field2541);
                        if (var23.startsWith("OFFLINE")) {
                            var22 = 4;
                        } else if (var23.startsWith("WRONG")) {
                            var22 = 7;
                        } else if (var23.startsWith("RELOAD")) {
                            var22 = 3;
                        } else if (var23.startsWith("Not permitted for social network accounts.")) {
                            var22 = 6;
                        } else {
                            var20.method3244(var7);
                            while (var20.field2538 > 0 && var20.field2541[var20.field2538 - 1] == 0) {
                                var20.field2538--;
                            }
                            String var24 = new String(var20.field2541, 0, var20.field2538);
                            if (class85.method949(var24)) {
                                class57.method3129(var24, true, false);
                                var22 = 2;
                            } else {
                                var22 = 5;
                            }
                        }
                        break;
                    }
                    var20.field2538 += var21;
                    if (var20.field2538 >= 1000) {
                        var22 = 5;
                        break;
                    }
                }
            } catch (Throwable var26) {
                var26.printStackTrace();
                var22 = 5;
            }
            var2 = var22;
        }
        switch(var2) {
            case 2:
                method3494(class246.field3237, class246.field3228, class246.field3007);
                field1318 = 6;
                break;
            case 3:
                method3494(class246.field3198, class246.field3231, class246.field2988);
                break;
            case 4:
                method3494(class246.field3011, class246.field3234, class246.field3235);
                break;
            case 5:
                method3494(class246.field3236, class246.field3004, class246.field3238);
                break;
            case 6:
                method3494(class246.field3057, class246.field3130, class246.field3241);
                break;
            case 7:
                method3494(class246.field3215, class246.field3243, class246.field3244);
        }
    }

    @ObfuscatedName("af.y(Lkt;Lkt;Lkt;ZB)V")
    public static void method265(class298 arg0, class298 arg1, class298 arg2, boolean arg3) {
        if (arg3) {
            field1325 = (Statics.field9 - 765) / 2;
            field1304 = field1325 + 202;
            Statics.field2642 = field1304 + 180;
        }
        if (field1317) {
            if (Statics.field606 == null) {
                Statics.field606 = class324.method4575(Statics.field776, "sl_back", "");
            }
            if (Statics.field3344 == null) {
                Statics.field3344 = class324.method3228(Statics.field776, "sl_flags", "");
            }
            if (Statics.field435 == null) {
                Statics.field435 = class324.method3228(Statics.field776, "sl_arrows", "");
            }
            if (Statics.field248 == null) {
                Statics.field248 = class324.method3228(Statics.field776, "sl_stars", "");
            }
            class319.method5232(field1325, 23, 765, 480, 0);
            class319.method5256(field1325, 0, 125, 23, 12425273, 9135624);
            class319.method5256(field1325 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5006(class246.field3245, field1325 + 62, 15, 0, -1);
            if (Statics.field248 != null) {
                Statics.field248[1].method5316(field1325 + 140, 1);
                arg1.method5003(class246.field3246, field1325 + 152, 10, 16777215, -1);
                Statics.field248[0].method5316(field1325 + 140, 12);
                arg1.method5003(class246.field3092, field1325 + 152, 21, 16777215, -1);
            }
            if (Statics.field435 != null) {
                int var4 = field1325 + 280;
                if (class77.field1167[0] == 0 && class77.field1169[0] == 0) {
                    Statics.field435[2].method5316(var4, 4);
                } else {
                    Statics.field435[0].method5316(var4, 4);
                }
                if (class77.field1167[0] == 0 && class77.field1169[0] == 1) {
                    Statics.field435[3].method5316(var4 + 15, 4);
                } else {
                    Statics.field435[1].method5316(var4 + 15, 4);
                }
                arg0.method5003(class246.field2972, var4 + 32, 17, 16777215, -1);
                int var5 = field1325 + 390;
                if (class77.field1167[0] == 1 && class77.field1169[0] == 0) {
                    Statics.field435[2].method5316(var5, 4);
                } else {
                    Statics.field435[0].method5316(var5, 4);
                }
                if (class77.field1167[0] == 1 && class77.field1169[0] == 1) {
                    Statics.field435[3].method5316(var5 + 15, 4);
                } else {
                    Statics.field435[1].method5316(var5 + 15, 4);
                }
                arg0.method5003(class246.field3249, var5 + 32, 17, 16777215, -1);
                int var6 = field1325 + 500;
                if (class77.field1167[0] == 2 && class77.field1169[0] == 0) {
                    Statics.field435[2].method5316(var6, 4);
                } else {
                    Statics.field435[0].method5316(var6, 4);
                }
                if (class77.field1167[0] == 2 && class77.field1169[0] == 1) {
                    Statics.field435[3].method5316(var6 + 15, 4);
                } else {
                    Statics.field435[1].method5316(var6 + 15, 4);
                }
                arg0.method5003(class246.field2997, var6 + 32, 17, 16777215, -1);
                int var7 = field1325 + 610;
                if (class77.field1167[0] == 3 && class77.field1169[0] == 0) {
                    Statics.field435[2].method5316(var7, 4);
                } else {
                    Statics.field435[0].method5316(var7, 4);
                }
                if (class77.field1167[0] == 3 && class77.field1169[0] == 1) {
                    Statics.field435[3].method5316(var7 + 15, 4);
                } else {
                    Statics.field435[1].method5316(var7 + 15, 4);
                }
                arg0.method5003(class246.field2993, var7 + 32, 17, 16777215, -1);
            }
            class319.method5232(field1325 + 708, 4, 50, 16, 0);
            arg1.method5006(class246.field3054, field1325 + 708 + 25, 16, 16777215, -1);
            field1316 = -1;
            if (Statics.field606 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class77.field1180) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class77.field1180) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class77.field1180) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field1325 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class77.field1180; var22++) {
                    class77 var23 = Statics.field1179[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1174);
                    if (var23.field1174 == -1) {
                        var25 = class246.field3194;
                        var24 = false;
                    } else if (var23.field1174 > 1980) {
                        var25 = class246.field3088;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1543()) {
                        if (var23.method1522()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1533()) {
                        var26 = 16711680;
                        if (var23.method1522()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1524()) {
                        if (var23.method1522()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1522()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field670 >= var19 && class60.field668 >= var18 && class60.field670 < var8 + var19 && class60.field668 < var9 + var18 && var24) {
                        field1316 = var22;
                        Statics.field606[var27].method5347(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field606[var27].method5342(var19, var18);
                    }
                    if (Statics.field3344 != null) {
                        Statics.field3344[(var23.method1522() ? 8 : 0) + var23.field1177].method5316(var19 + 29, var18);
                    }
                    arg0.method5006(Integer.toString(var23.field1163), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method5006(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method5018(Statics.field1179[field1316].field1176) + 6;
                    int var29 = arg1.field3771 + 8;
                    class319.method5232(class60.field670 - var28 / 2, class60.field668 + 20 + 5, var28, var29, 16777120);
                    class319.method5227(class60.field670 - var28 / 2, class60.field668 + 20 + 5, var28, var29, 0);
                    arg1.method5006(Statics.field1179[field1316].field1176, class60.field670, class60.field668 + 20 + 5 + arg1.field3771 + 4, 0, -1);
                }
            }
            Statics.field3926.method751(0, 0);
            return;
        }
        if (arg3) {
            Statics.field2760.method5342(field1325, 0);
            Statics.field3807.method5342(field1325 + 382, 0);
            Statics.field1302.method5316(field1325 + 382 - Statics.field1302.field3895 / 2, 18);
        }
        if (client.field828 == 0 || client.field828 == 5) {
            byte var30 = 20;
            arg0.method5006(class246.field2984, field1304 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class319.method5227(field1304 + 180 - 152, var31, 304, 34, 9179409);
            class319.method5227(field1304 + 180 - 151, var31 + 1, 302, 32, 0);
            class319.method5232(field1304 + 180 - 150, var31 + 2, field1306 * 3, 30, 9179409);
            class319.method5232(field1306 * 3 + (field1304 + 180 - 150), var31 + 2, 300 - field1306 * 3, 30, 0);
            arg0.method5006(field1314, field1304 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field828 == 20) {
            Statics.field1300.method5316(field1304 + 180 - Statics.field1300.field3895 / 2, 271 - Statics.field1300.field3896 / 2);
            short var32 = 201;
            arg0.method5006(field1328, field1304 + 180, var32, 16776960, 0);
            int var85 = var32 + 15;
            arg0.method5006(field1315, field1304 + 180, var85, 16776960, 0);
            int var86 = var85 + 15;
            arg0.method5006(field1319, field1304 + 180, var86, 16776960, 0);
            int var87 = var86 + 15;
            int var88 = var87 + 7;
            if (field1318 != 4) {
                arg0.method5003(class246.field3168, field1304 + 180 - 110, var88, 16777215, 0);
                short var33 = 200;
                String var34 = Statics.field1072.field1186 ? class305.method1915(field1320) : field1320;
                String var35;
                for (var35 = var34; arg0.method5018(var35) > var33; var35 = var35.substring(0, var35.length() - 1)) {
                }
                arg0.method5003(class299.method5037(var35), field1304 + 180 - 70, var88, 16777215, 0);
                var85 = var88 + 15;
                arg0.method5003(class246.field3205 + class305.method1915(field1299), field1304 + 180 - 108, var85, 16777215, 0);
                var85 += 15;
            }
        }
        if (client.field828 == 10 || client.field828 == 11) {
            Statics.field1300.method5316(field1304, 171);
            if (field1318 == 0) {
                short var36 = 251;
                arg0.method5006(class246.field3039, field1304 + 180, var36, 16776960, 0);
                int var89 = var36 + 30;
                int var37 = field1304 + 180 - 80;
                short var38 = 291;
                Statics.field1265.method5316(var37 - 73, var38 - 20);
                arg0.method5007(class246.field3227, var37 - 73, var38 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var39 = field1304 + 180 + 80;
                Statics.field1265.method5316(var39 - 73, var38 - 20);
                arg0.method5007(class246.field3209, var39 - 73, var38 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1318 == 1) {
                arg0.method5006(field1327, field1304 + 180, 201, 16776960, 0);
                short var40 = 236;
                arg0.method5006(field1328, field1304 + 180, var40, 16777215, 0);
                int var90 = var40 + 15;
                arg0.method5006(field1315, field1304 + 180, var90, 16777215, 0);
                int var91 = var90 + 15;
                arg0.method5006(field1319, field1304 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                int var41 = field1304 + 180 - 80;
                short var42 = 321;
                Statics.field1265.method5316(var41 - 73, var42 - 20);
                arg0.method5006(class246.field2978, var41, var42 + 5, 16777215, 0);
                int var43 = field1304 + 180 + 80;
                Statics.field1265.method5316(var43 - 73, var42 - 20);
                arg0.method5006(class246.field3054, var43, var42 + 5, 16777215, 0);
            } else if (field1318 == 2) {
                short var44 = 201;
                arg0.method5006(field1328, Statics.field2642, var44, 16776960, 0);
                int var93 = var44 + 15;
                arg0.method5006(field1315, Statics.field2642, var93, 16776960, 0);
                int var94 = var93 + 15;
                arg0.method5006(field1319, Statics.field2642, var94, 16776960, 0);
                int var95 = var94 + 15;
                int var96 = var95 + 7;
                arg0.method5003(class246.field3168, Statics.field2642 - 110, var96, 16777215, 0);
                short var45 = 200;
                String var46 = Statics.field1072.field1186 ? class305.method1915(field1320) : field1320;
                String var47;
                for (var47 = var46; arg0.method5018(var47) > var45; var47 = var47.substring(1)) {
                }
                arg0.method5003(class299.method5037(var47) + (field1332 == 0 & client.field830 % 40 < 20 ? class86.method38(16776960) + class86.field1269 : ""), Statics.field2642 - 70, var96, 16777215, 0);
                var93 = var96 + 15;
                arg0.method5003(class246.field3205 + class305.method1915(field1299) + (field1332 == 1 & client.field830 % 40 < 20 ? class86.method38(16776960) + class86.field1269 : ""), Statics.field2642 - 108, var93, 16777215, 0);
                var93 += 15;
                short var48 = 277;
                int var49 = Statics.field2642 + -117;
                class322 var50 = method4462(field1322, field1321);
                var50.method5316(var49, var48);
                int var51 = var50.field3895 + 5 + var49;
                arg1.method5003(class246.field2973, var51, var48 + 13, 16776960, 0);
                int var52 = Statics.field2642 + 24;
                class322 var53 = method4462(Statics.field1072.field1186, field1326);
                var53.method5316(var52, var48);
                int var54 = var53.field3895 + 5 + var52;
                arg1.method5003(class246.field3230, var54, var48 + 13, 16776960, 0);
                int var97 = var48 + 15;
                int var55 = Statics.field2642 - 80;
                short var56 = 321;
                Statics.field1265.method5316(var55 - 73, var56 - 20);
                arg0.method5006(class246.field3210, var55, var56 + 5, 16777215, 0);
                int var57 = Statics.field2642 + 80;
                Statics.field1265.method5316(var57 - 73, var56 - 20);
                arg0.method5006(class246.field3054, var57, var56 + 5, 16777215, 0);
                short var58 = 357;
                arg1.method5006(class246.field3219, Statics.field2642, var58, 16776960, 0);
            } else if (field1318 == 3) {
                short var59 = 201;
                arg0.method5006(class246.field3214, field1304 + 180, var59, 16776960, 0);
                int var98 = var59 + 20;
                arg1.method5006(class246.field3111, field1304 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg1.method5006(class246.field3181, field1304 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var60 = field1304 + 180;
                short var61 = 276;
                Statics.field1265.method5316(var60 - 73, var61 - 20);
                arg2.method5006(class246.field3217, var60, var61 + 5, 16777215, 0);
                int var62 = field1304 + 180;
                short var63 = 326;
                Statics.field1265.method5316(var62 - 73, var63 - 20);
                arg2.method5006(class246.field3218, var62, var63 + 5, 16777215, 0);
            } else if (field1318 == 4) {
                arg0.method5006(class246.field3008, field1304 + 180, 201, 16776960, 0);
                short var64 = 236;
                arg0.method5006(field1328, field1304 + 180, var64, 16777215, 0);
                int var101 = var64 + 15;
                arg0.method5006(field1315, field1304 + 180, var101, 16777215, 0);
                int var102 = var101 + 15;
                arg0.method5006(field1319, field1304 + 180, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method5003(class246.field3206 + class305.method1915(Statics.field741) + (client.field830 % 40 < 20 ? class86.method38(16776960) + class86.field1269 : ""), field1304 + 180 - 108, var103, 16777215, 0);
                int var104 = var103 - 8;
                arg0.method5003(class246.field2980, field1304 + 180 - 9, var104, 16776960, 0);
                int var105 = var104 + 15;
                arg0.method5003(class246.field2981, field1304 + 180 - 9, var105, 16776960, 0);
                int var65 = field1304 + 180 - 9 + arg0.method5018(class246.field2981) + 15;
                int var66 = var105 - arg0.field3771;
                class322 var67;
                if (field1313) {
                    var67 = Statics.field1303;
                } else {
                    var67 = Statics.field260;
                }
                var67.method5316(var65, var66);
                var101 = var105 + 15;
                int var68 = field1304 + 180 - 80;
                short var69 = 321;
                Statics.field1265.method5316(var68 - 73, var69 - 20);
                arg0.method5006(class246.field2978, var68, var69 + 5, 16777215, 0);
                int var70 = field1304 + 180 + 80;
                Statics.field1265.method5316(var70 - 73, var69 - 20);
                arg0.method5006(class246.field3054, var70, var69 + 5, 16777215, 0);
                arg1.method5006(class246.field3189, field1304 + 180, var69 + 36, 255, 0);
            } else if (field1318 == 5) {
                arg0.method5006(class246.field3220, field1304 + 180, 201, 16776960, 0);
                short var71 = 221;
                arg2.method5006(field1328, field1304 + 180, var71, 16776960, 0);
                int var106 = var71 + 15;
                arg2.method5006(field1315, field1304 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                arg2.method5006(field1319, field1304 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                int var109 = var108 + 14;
                arg0.method5003(class246.field3089, field1304 + 180 - 145, var109, 16777215, 0);
                short var72 = 174;
                String var73 = Statics.field1072.field1186 ? class305.method1915(field1320) : field1320;
                String var74;
                for (var74 = var73; arg0.method5018(var74) > var72; var74 = var74.substring(1)) {
                }
                arg0.method5003(class299.method5037(var74) + (client.field830 % 40 < 20 ? class86.method38(16776960) + class86.field1269 : ""), field1304 + 180 - 34, var109, 16777215, 0);
                var106 = var109 + 15;
                int var75 = field1304 + 180 - 80;
                short var76 = 321;
                Statics.field1265.method5316(var75 - 73, var76 - 20);
                arg0.method5006(class246.field3222, var75, var76 + 5, 16777215, 0);
                int var77 = field1304 + 180 + 80;
                Statics.field1265.method5316(var77 - 73, var76 - 20);
                arg0.method5006(class246.field3223, var77, var76 + 5, 16777215, 0);
            } else if (field1318 == 6) {
                short var78 = 201;
                arg0.method5006(field1328, field1304 + 180, var78, 16776960, 0);
                int var110 = var78 + 15;
                arg0.method5006(field1315, field1304 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method5006(field1319, field1304 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var79 = field1304 + 180;
                short var80 = 321;
                Statics.field1265.method5316(var79 - 73, var80 - 20);
                arg0.method5006(class246.field3223, var79, var80 + 5, 16777215, 0);
            }
        }
        if (field1311 > 0) {
            method132(field1311);
            field1311 = 0;
        }
        method737();
        Statics.field1542[Statics.field1072.field1183 ? 1 : 0].method5316(field1325 + 765 - 40, 463);
        if (client.field828 <= 5 || client.field827 != 0) {
            return;
        }
        if (Statics.field407 == null) {
            Statics.field407 = class324.method2828(Statics.field776, "sl_button", "");
            return;
        }
        int var81 = field1325 + 5;
        short var82 = 463;
        byte var83 = 100;
        byte var84 = 35;
        Statics.field407.method5316(var81, var82);
        arg0.method5006(class246.field3137 + " " + client.field1043, var83 / 2 + var81, var84 / 2 + var82 - 2, 16777215, 0);
        if (Statics.field1171 == null) {
            arg1.method5006(class246.field3255, var83 / 2 + var81, var84 / 2 + var82 + 12, 16777215, 0);
        } else {
            arg1.method5006(class246.field3254, var83 / 2 + var81, var84 / 2 + var82 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("gz.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3494(String arg0, String arg1, String arg2) {
        field1328 = arg0;
        field1315 = arg1;
        field1319 = arg2;
    }

    @ObfuscatedName("id.c(Llv;B)V")
    public static final void method4150(class322 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field472.length; var2++) {
            Statics.field472[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field472[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field468[var8] = (Statics.field472[var8 - 1] + Statics.field472[var8 + 1] + Statics.field472[var8 - 128] + Statics.field472[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field472;
            Statics.field472 = Statics.field468;
            Statics.field468 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3896; var11++) {
            for (int var12 = 0; var12 < arg0.field3895; var12++) {
                if (arg0.field3894[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3897;
                    int var14 = var11 + 16 + arg0.field3898;
                    int var15 = (var14 << 7) + var13;
                    Statics.field472[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("x.u(II)V")
    public static final void method132(int arg0) {
        short var1 = 256;
        field1309 += arg0 * 128;
        if (field1309 > Statics.field472.length) {
            field1309 -= Statics.field472.length;
            int var2 = (int) (Math.random() * 12.0D);
            method4150(Statics.field1301[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1308[var3 + var4] - Statics.field472[field1309 + var3 & Statics.field472.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1308[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1308[var9 + var10] = 255;
                } else {
                    Statics.field1308[var9 + var10] = 0;
                }
            }
        }
        if (field1331 > 0) {
            field1331 -= arg0 * 4;
        }
        if (field1307 > 0) {
            field1307 -= arg0 * 4;
        }
        if (field1331 == 0 && field1307 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1331 = 1024;
            }
            if (var12 == 1) {
                field1307 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1305[var13] = field1305[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1305[var14] = (int) (Math.sin((double) field1336 / 14.0D) * 16.0D + Math.sin((double) field1336 / 15.0D) * 14.0D + Math.sin((double) field1336 / 16.0D) * 12.0D);
            field1336++;
        }
        field1310 += arg0 * 833263141;
        int var15 = ((client.field830 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1310 * -1403095148; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1308[(var18 << 7) + var17] = 192;
        }
        field1310 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1308[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1308[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1423[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1423[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1423[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1308[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("kh.t(IIIB)I")
    public static final int method5143(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bp.f(B)V")
    public static final void method737() {
        short var0 = 256;
        if (field1331 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1331 > 768) {
                    Statics.field1430[var1] = method5143(Statics.field386[var1], Statics.field2094[var1], 1024 - field1331);
                } else if (field1331 > 256) {
                    Statics.field1430[var1] = Statics.field2094[var1];
                } else {
                    Statics.field1430[var1] = method5143(Statics.field2094[var1], Statics.field386[var1], 256 - field1331);
                }
            }
        } else if (field1307 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1307 > 768) {
                    Statics.field1430[var2] = method5143(Statics.field386[var2], Statics.field371[var2], 1024 - field1307);
                } else if (field1307 > 256) {
                    Statics.field1430[var2] = Statics.field371[var2];
                } else {
                    Statics.field1430[var2] = method5143(Statics.field371[var2], Statics.field386[var2], 256 - field1307);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1430[var3] = Statics.field386[var3];
            }
        }
        class319.method5212(field1325, 9, field1325 + 128, var0 + 7);
        Statics.field2760.method5342(field1325, 0);
        class319.method5211();
        int var4 = 0;
        int var5 = field1325 + Statics.field3926.field3883 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1305[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1308[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1430[var10];
                    int var14 = Statics.field3926.field3884[var5];
                    Statics.field3926.field3884[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field3926.field3883 + var8 - 128;
        }
        class319.method5212(field1325 + 765 - 128, 9, field1325 + 765, var0 + 7);
        Statics.field3807.method5342(field1325 + 382, 0);
        class319.method5211();
        int var15 = 0;
        int var16 = field1325 + Statics.field3926.field3883 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1305[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1308[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1430[var22];
                    int var26 = Statics.field3926.field3884[var20];
                    Statics.field3926.field3884[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field3926.field3883 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ay.m(Lbs;B)V")
    public static void method579(class77 arg0) {
        if (arg0.method1522() != client.field825) {
            client.field825 = arg0.method1522();
            class277.method4149(arg0.method1522());
        }
        Statics.field500 = arg0.field1175;
        client.field1043 = arg0.field1163;
        client.field823 = arg0.field1173;
        Statics.field1218 = client.field824 == 0 ? 43594 : arg0.field1163 + 40000;
        Statics.field18 = client.field824 == 0 ? 443 : arg0.field1163 + 50000;
        Statics.field756 = Statics.field1218;
    }
}
