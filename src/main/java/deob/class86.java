package deob;

import java.text.DecimalFormat;

@ObfuscatedName("cj")
public class class86 {

    @ObfuscatedName("cj.i")
    public static int field1148 = 0;

    @ObfuscatedName("cj.a")
    public static int field1164 = field1148 + 202;

    @ObfuscatedName("cj.l")
    public static int field1181 = 10;

    @ObfuscatedName("cj.h")
    public static String field1158 = "";

    @ObfuscatedName("cj.af")
    public static int field1161 = -1;

    @ObfuscatedName("cj.an")
    public static int field1162 = 1;

    @ObfuscatedName("cj.ao")
    public static int field1163 = 0;

    @ObfuscatedName("cj.ac")
    public static String field1146 = "";

    @ObfuscatedName("cj.ar")
    public static String field1165 = "";

    @ObfuscatedName("cj.au")
    public static String field1157 = "";

    @ObfuscatedName("cj.ax")
    public static String field1167 = "";

    @ObfuscatedName("cj.ag")
    public static String field1168 = "";

    @ObfuscatedName("cj.aa")
    public static String field1156 = "";

    @ObfuscatedName("cj.ab")
    public static boolean field1170 = false;

    @ObfuscatedName("cj.aw")
    public static boolean field1171 = false;

    @ObfuscatedName("cj.bw")
    public static boolean field1172 = true;

    @ObfuscatedName("cj.bo")
    public static int field1159 = 0;

    @ObfuscatedName("cj.bn")
    public static String field1174 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cj.bp")
    public static String field1183 = "1234567890";

    @ObfuscatedName("cj.bh")
    public static boolean field1169 = false;

    @ObfuscatedName("cj.bd")
    public static int field1177 = -1;

    @ObfuscatedName("cj.br")
    public static int field1178 = 0;

    @ObfuscatedName("cj.bm")
    public static int field1176 = 0;

    @ObfuscatedName("cj.bu")
    public static long field1180;

    @ObfuscatedName("cj.bb")
    public static long field1151;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1180 = -1L;
        field1151 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gk.s(Lhz;Lhz;B)I")
    public static int method3366(class234 arg0, class234 arg1) {
        int var2 = 0;
        if (arg0.method3781("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3781("logo", "")) {
            var2++;
        }
        if (arg1.method3781("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3781("titlebox", "")) {
            var2++;
        }
        if (arg1.method3781("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3781("runes", "")) {
            var2++;
        }
        if (arg1.method3781("title_mute", "")) {
            var2++;
        }
        if (arg1.method3781("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3781("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3781("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3781("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3781("sl_back", "");
        arg1.method3781("sl_flags", "");
        arg1.method3781("sl_arrows", "");
        arg1.method3781("sl_stars", "");
        arg1.method3781("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bb.j(B)I")
    public static int method1578() {
        return 11;
    }

    @ObfuscatedName("ey.i(Lhz;Lhz;ZII)V")
    public static void method3025(class234 arg0, class234 arg1, boolean arg2, int arg3) {
        if (!Statics.field1147) {
            field1163 = arg3;
            class321.method5506();
            byte[] var4 = arg0.method3785("title.jpg", "");
            Statics.field1179 = class50.method179(var4);
            Statics.field1152 = Statics.field1179.method5632();
            if ((client.field626 & 0x20000000) == 0) {
                Statics.field408 = class326.method2742(arg1, "logo", "");
            } else {
                Statics.field408 = class326.method2742(arg1, "logo_deadman_mode", "");
            }
            Statics.field1149 = class326.method2742(arg1, "titlebox", "");
            Statics.field1150 = class326.method2742(arg1, "titlebutton", "");
            int var5 = arg1.method3775("runes");
            int var6 = arg1.method3786(var5, "");
            class324[] var7;
            if (class326.method1599(arg1, var5, var6)) {
                class324[] var8 = new class324[Statics.field3885];
                for (int var9 = 0; var9 < Statics.field3885; var9++) {
                    class324 var10 = var8[var9] = new class324();
                    var10.field3871 = Statics.field72;
                    var10.field3872 = Statics.field3888;
                    var10.field3869 = Statics.field3886[var9];
                    var10.field3870 = Statics.field3887[var9];
                    var10.field3867 = Statics.field3889[var9];
                    var10.field3868 = Statics.field3042[var9];
                    var10.field3865 = Statics.field3890;
                    var10.field3866 = Statics.field283[var9];
                }
                class326.method3139();
                var7 = var8;
            } else {
                var7 = null;
            }
            Statics.field3435 = var7;
            int var13 = arg1.method3775("title_mute");
            int var14 = arg1.method3786(var13, "");
            class324[] var15;
            if (class326.method1599(arg1, var13, var14)) {
                class324[] var16 = new class324[Statics.field3885];
                for (int var17 = 0; var17 < Statics.field3885; var17++) {
                    class324 var18 = var16[var17] = new class324();
                    var18.field3871 = Statics.field72;
                    var18.field3872 = Statics.field3888;
                    var18.field3869 = Statics.field3886[var17];
                    var18.field3870 = Statics.field3887[var17];
                    var18.field3867 = Statics.field3889[var17];
                    var18.field3868 = Statics.field3042[var17];
                    var18.field3865 = Statics.field3890;
                    var18.field3866 = Statics.field283[var17];
                }
                class326.method3139();
                var15 = var16;
            } else {
                var15 = null;
            }
            Statics.field1852 = var15;
            Statics.field1153 = class326.method2742(arg1, "options_radio_buttons,0", "");
            Statics.field1137 = class326.method2742(arg1, "options_radio_buttons,4", "");
            Statics.field1154 = class326.method2742(arg1, "options_radio_buttons,2", "");
            Statics.field1304 = class326.method2742(arg1, "options_radio_buttons,6", "");
            Statics.field1958 = Statics.field1153.field3867;
            Statics.field2080 = Statics.field1153.field3868;
            Statics.field3844 = new class73(Statics.field3435);
            if (arg2) {
                field1168 = "";
                field1156 = "";
            }
            Statics.field501 = 0;
            Statics.field278 = "";
            field1172 = true;
            field1169 = false;
            if (Statics.field69.field1037) {
                class198.method670(2);
            } else {
                class236 var21 = Statics.field47;
                int var22 = var21.method3775("scape main");
                int var23 = var21.method3786(var22, "");
                class198.method1920(2, var21, var22, var23, 255, false);
            }
            class237.method1863(false);
            Statics.field1147 = true;
            field1148 = (Statics.field3255 - 765) / 2;
            field1164 = field1148 + 202;
            Statics.field1173 = field1164 + 180;
            Statics.field1179.method5596(field1148, 0);
            Statics.field1152.method5596(field1148 + 382, 0);
            Statics.field408.method5576(field1148 + 382 - Statics.field408.field3867 / 2, 18);
        } else if (arg3 == 4) {
            field1163 = 4;
        }
    }

    @ObfuscatedName("bv.k(B)V")
    public static void method997() {
        if (field1168 != null && field1168.length() > 0) {
            return;
        }
        if (Statics.field69.field1033 == null) {
            client.field663 = false;
        } else {
            field1168 = Statics.field69.field1033;
            client.field663 = true;
        }
    }

    @ObfuscatedName("cl.u(I)V")
    public static void method2028() {
        if (!Statics.field1147) {
            return;
        }
        Statics.field1149 = null;
        Statics.field1150 = null;
        Statics.field3435 = null;
        Statics.field1179 = null;
        Statics.field1152 = null;
        Statics.field408 = null;
        Statics.field1852 = null;
        Statics.field1153 = null;
        Statics.field1154 = null;
        Statics.field1420 = null;
        Statics.field1 = null;
        Statics.field1442 = null;
        Statics.field3096 = null;
        Statics.field2369 = null;
        Statics.field3844.method1626();
        class198.method670(2);
        class237.method1863(true);
        Statics.field1147 = false;
    }

    @ObfuscatedName("o.n(Lbw;B)V")
    public static void method268(class54 arg0) {
        if (field1169) {
            method3508(arg0);
            return;
        }
        if ((class55.field462 == 1 || !Statics.field1048 && class55.field462 == 4) && class55.field468 >= field1148 + 765 - 50 && class55.field469 >= 453) {
            Statics.field69.field1037 = !Statics.field69.field1037;
            class74.method135();
            if (Statics.field69.field1037) {
                Statics.field2382.method3404();
                class198.field2379 = 1;
                Statics.field195 = null;
            } else {
                class236 var1 = Statics.field47;
                int var2 = var1.method3775("scape main");
                int var3 = var1.method3786(var2, "");
                class198.method3335(var1, var2, var3, 255, false);
            }
        }
        if (client.field632 == 5) {
            return;
        }
        if (field1180 == -1L) {
            field1180 = class297.method4369() + 1000L;
        }
        long var4 = class297.method4369();
        boolean var7;
        if (client.field894 == null || client.field895 >= client.field894.size()) {
            var7 = true;
        } else {
            while (true) {
                if (client.field895 >= client.field894.size()) {
                    var7 = true;
                    break;
                }
                class59 var6 = (class59) client.field894.get(client.field895);
                if (!var6.method974()) {
                    var7 = false;
                    break;
                }
                client.field895++;
            }
        }
        if (var7 && field1151 == -1L) {
            field1151 = var4;
            if (field1151 > field1180) {
                field1180 = field1151;
            }
        }
        if (client.field632 != 10 && client.field632 != 11) {
            return;
        }
        if (Statics.field523 == class191.field2337) {
            if (class55.field462 == 1 || !Statics.field1048 && class55.field462 == 4) {
                int var8 = field1148 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class55.field468 >= var8 && class55.field468 <= var8 + var10 && class55.field469 >= var9 && class55.field469 <= var9 + var11) {
                    method3144();
                    return;
                }
            }
            if (Statics.field3577 != null) {
                method3144();
            }
        }
        int var12 = class55.field462;
        int var13 = class55.field468;
        int var14 = class55.field469;
        if (var12 == 0) {
            var13 = class55.field464;
            var14 = class55.field461;
        }
        if (!Statics.field1048 && var12 == 4) {
            var12 = 1;
        }
        if (field1163 == 0) {
            boolean var15 = false;
            while (class46.method4883()) {
                if (Statics.field1308 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field1173 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class52.method3044(client.method3295("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field1173 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field626 & 0x2000000) != 0) {
                    field1146 = "";
                    field1165 = class225.field2863;
                    field1157 = class225.field3020;
                    field1167 = class225.field2968;
                    field1163 = 1;
                    if (client.field663 && field1168 != null && field1168.length() > 0) {
                        field1159 = 1;
                    } else {
                        field1159 = 0;
                    }
                } else if ((client.field626 & 0x4) != 0) {
                    if ((client.field626 & 0x400) == 0) {
                        field1165 = class225.field2957;
                        field1157 = class225.field2881;
                        field1167 = class225.field2799;
                    } else {
                        field1165 = class225.field2963;
                        field1157 = class225.field2964;
                        field1167 = class225.field2965;
                    }
                    field1146 = class225.field2956;
                    field1163 = 1;
                    if (client.field663 && field1168 != null && field1168.length() > 0) {
                        field1159 = 1;
                    } else {
                        field1159 = 0;
                    }
                } else if ((client.field626 & 0x400) == 0) {
                    method5979(false);
                } else {
                    field1165 = class225.field2960;
                    field1157 = class225.field2961;
                    field1167 = class225.field2962;
                    field1146 = class225.field2956;
                    field1163 = 1;
                    if (client.field663 && field1168 != null && field1168.length() > 0) {
                        field1159 = 1;
                    } else {
                        field1159 = 0;
                    }
                }
            }
        } else if (field1163 == 1) {
            while (class46.method4883()) {
                if (Statics.field1308 == 84) {
                    method5979(false);
                } else if (Statics.field1308 == 13) {
                    field1163 = 0;
                }
            }
            int var19 = Statics.field1173 - 80;
            short var20 = 321;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                method5979(false);
            }
            int var21 = Statics.field1173 + 80;
            if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field1163 = 0;
            }
        } else if (field1163 == 2) {
            short var22 = 201;
            int var64 = var22 + 52;
            if (var12 == 1 && var14 >= var64 - 12 && var14 < var64 + 2) {
                field1159 = 0;
            }
            var64 += 15;
            if (var12 == 1 && var14 >= var64 - 12 && var14 < var64 + 2) {
                field1159 = 1;
            }
            var64 += 15;
            short var23 = 361;
            if (Statics.field1444 != null) {
                int var24 = Statics.field1444.field3842 / 2;
                if (var12 == 1 && var13 >= Statics.field1444.field3843 - var24 && var13 <= Statics.field1444.field3843 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(field1162) {
                        case 1:
                            method1110(class225.field3005, class225.field3006, class225.field2919);
                            field1163 = 5;
                            return;
                        case 2:
                            class52.method3044("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field1173 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1168 = field1168.trim();
                if (field1168.length() == 0) {
                    method1110(class225.field2858, class225.field2859, class225.field2860);
                    return;
                }
                if (field1156.length() == 0) {
                    method1110(class225.field2915, class225.field2862, class225.field2773);
                    return;
                }
                method1110(class225.field2971, class225.field2806, class225.field2973);
                client.method300(false);
                client.method2603(20);
                return;
            }
            int var27 = field1164 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1163 = 0;
                field1168 = "";
                field1156 = "";
                Statics.field501 = 0;
                Statics.field278 = "";
                field1172 = true;
            }
            int var28 = Statics.field1173 + -117;
            short var29 = 277;
            field1170 = var13 >= var28 && var13 < Statics.field1958 + var28 && var14 >= var29 && var14 < Statics.field2080 + var29;
            if (var12 == 1 && field1170) {
                client.field663 = !client.field663;
                if (!client.field663 && Statics.field69.field1033 != null) {
                    Statics.field69.field1033 = null;
                    class74.method135();
                }
            }
            int var30 = Statics.field1173 + 24;
            short var31 = 277;
            field1171 = var13 >= var30 && var13 < Statics.field1958 + var30 && var14 >= var31 && var14 < Statics.field2080 + var31;
            if (var12 == 1 && field1171) {
                Statics.field69.field1034 = !Statics.field69.field1034;
                if (!Statics.field69.field1034) {
                    field1168 = "";
                    Statics.field69.field1033 = null;
                    if (client.field663 && field1168 != null && field1168.length() > 0) {
                        field1159 = 1;
                    } else {
                        field1159 = 0;
                    }
                }
                class74.method135();
            }
            while (true) {
                while (class46.method4883()) {
                    boolean var32 = false;
                    for (int var33 = 0; var33 < field1174.length(); var33++) {
                        if (Statics.field2500 == field1174.charAt(var33)) {
                            var32 = true;
                            break;
                        }
                    }
                    if (Statics.field1308 == 13) {
                        field1163 = 0;
                        field1168 = "";
                        field1156 = "";
                        Statics.field501 = 0;
                        Statics.field278 = "";
                        field1172 = true;
                    } else if (field1159 == 0) {
                        if (Statics.field1308 == 85 && field1168.length() > 0) {
                            field1168 = field1168.substring(0, field1168.length() - 1);
                        }
                        if (Statics.field1308 == 84 || Statics.field1308 == 80) {
                            field1159 = 1;
                        }
                        if (var32 && field1168.length() < 320) {
                            field1168 = field1168 + Statics.field2500;
                        }
                    } else if (field1159 == 1) {
                        if (Statics.field1308 == 85 && field1156.length() > 0) {
                            field1156 = field1156.substring(0, field1156.length() - 1);
                        }
                        if (Statics.field1308 == 84 || Statics.field1308 == 80) {
                            field1159 = 0;
                        }
                        if (Statics.field1308 == 84) {
                            field1168 = field1168.trim();
                            if (field1168.length() == 0) {
                                method1110(class225.field2858, class225.field2859, class225.field2860);
                                return;
                            }
                            if (field1156.length() == 0) {
                                method1110(class225.field2915, class225.field2862, class225.field2773);
                                return;
                            }
                            method1110(class225.field2971, class225.field2806, class225.field2973);
                            client.method300(false);
                            client.method2603(20);
                            return;
                        }
                        if (var32 && field1156.length() < 20) {
                            field1156 = field1156 + Statics.field2500;
                        }
                    }
                }
                return;
            }
        } else if (field1163 == 3) {
            int var34 = field1164 + 180;
            short var35 = 276;
            if (var12 == 1 && var13 >= var34 - 75 && var13 <= var34 + 75 && var14 >= var35 - 20 && var14 <= var35 + 20) {
                method5979(false);
            }
            int var36 = field1164 + 180;
            short var37 = 326;
            if (var12 == 1 && var13 >= var36 - 75 && var13 <= var36 + 75 && var14 >= var37 - 20 && var14 <= var37 + 20) {
                method1110(class225.field3005, class225.field3006, class225.field2919);
                field1163 = 5;
                return;
            }
        } else if (field1163 == 4) {
            int var38 = field1164 + 180 - 80;
            short var39 = 321;
            if (var12 == 1 && var13 >= var38 - 75 && var13 <= var38 + 75 && var14 >= var39 - 20 && var14 <= var39 + 20) {
                Statics.field278.trim();
                if (Statics.field278.length() != 6) {
                    method1110(class225.field2777, class225.field2778, class225.field2779);
                    return;
                }
                Statics.field501 = Integer.parseInt(Statics.field278);
                Statics.field278 = "";
                client.method300(true);
                method1110(class225.field2971, class225.field2806, class225.field2973);
                client.method2603(20);
                return;
            }
            if (var12 == 1 && var13 >= field1164 + 180 - 9 && var13 <= field1164 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field1172 = !field1172;
            }
            if (var12 == 1 && var13 >= field1164 + 180 - 34 && var13 <= field1164 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class52.method3044(client.method3295("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var40 = field1164 + 180 + 80;
            if (var12 == 1 && var13 >= var40 - 75 && var13 <= var40 + 75 && var14 >= var39 - 20 && var14 <= var39 + 20) {
                field1163 = 0;
                field1168 = "";
                field1156 = "";
                Statics.field501 = 0;
                Statics.field278 = "";
            }
            while (class46.method4883()) {
                boolean var41 = false;
                for (int var42 = 0; var42 < field1183.length(); var42++) {
                    if (Statics.field2500 == field1183.charAt(var42)) {
                        var41 = true;
                        break;
                    }
                }
                if (Statics.field1308 == 13) {
                    field1163 = 0;
                    field1168 = "";
                    field1156 = "";
                    Statics.field501 = 0;
                    Statics.field278 = "";
                } else {
                    if (Statics.field1308 == 85 && Statics.field278.length() > 0) {
                        Statics.field278 = Statics.field278.substring(0, Statics.field278.length() - 1);
                    }
                    if (Statics.field1308 == 84) {
                        Statics.field278.trim();
                        if (Statics.field278.length() != 6) {
                            method1110(class225.field2777, class225.field2778, class225.field2779);
                            return;
                        }
                        Statics.field501 = Integer.parseInt(Statics.field278);
                        Statics.field278 = "";
                        client.method300(true);
                        method1110(class225.field2971, class225.field2806, class225.field2973);
                        client.method2603(20);
                        return;
                    }
                    if (var41 && Statics.field278.length() < 6) {
                        Statics.field278 = Statics.field278 + Statics.field2500;
                    }
                }
            }
        } else if (field1163 == 5) {
            int var43 = field1164 + 180 - 80;
            short var44 = 321;
            if (var12 == 1 && var13 >= var43 - 75 && var13 <= var43 + 75 && var14 >= var44 - 20 && var14 <= var44 + 20) {
                Statics.method995();
                return;
            }
            int var45 = field1164 + 180 + 80;
            if (var12 == 1 && var13 >= var45 - 75 && var13 <= var45 + 75 && var14 >= var44 - 20 && var14 <= var44 + 20) {
                method5979(true);
            }
            short var46 = 361;
            if (Statics.field2467 != null) {
                int var47 = Statics.field2467.field3842 / 2;
                if (var12 == 1 && var13 >= Statics.field2467.field3843 - var47 && var13 <= Statics.field2467.field3843 + var47 && var14 >= var46 - 15 && var14 < var46) {
                    class52.method3044(client.method3295("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method4883()) {
                boolean var48 = false;
                for (int var49 = 0; var49 < field1174.length(); var49++) {
                    if (Statics.field2500 == field1174.charAt(var49)) {
                        var48 = true;
                        break;
                    }
                }
                if (Statics.field1308 == 13) {
                    method5979(true);
                } else {
                    if (Statics.field1308 == 85 && field1168.length() > 0) {
                        field1168 = field1168.substring(0, field1168.length() - 1);
                    }
                    if (Statics.field1308 == 84) {
                        Statics.method995();
                        return;
                    }
                    if (var48 && field1168.length() < 320) {
                        field1168 = field1168 + Statics.field2500;
                    }
                }
            }
        } else if (field1163 == 6) {
            while (true) {
                do {
                    if (!class46.method4883()) {
                        short var50 = 321;
                        if (var12 == 1 && var14 >= var50 - 20 && var14 <= var50 + 20) {
                            method5979(true);
                        }
                        return;
                    }
                } while (Statics.field1308 != 84 && Statics.field1308 != 13);
                method5979(true);
            }
        } else if (field1163 == 7) {
            int var51 = field1164 + 180 - 80;
            short var52 = 321;
            if (var12 == 1 && var13 >= var51 - 75 && var13 <= var51 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                class52.method3044(client.method3295("secure", true) + "m=dob/set_dob.ws", true, false);
                method1110(class225.field2866, class225.field3003, class225.field3004);
                field1163 = 6;
                return;
            }
            int var53 = field1164 + 180 + 80;
            if (var12 == 1 && var13 >= var53 - 75 && var13 <= var53 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                method5979(true);
            }
        } else if (field1163 == 8) {
            int var54 = field1164 + 180 - 80;
            short var55 = 321;
            if (var12 == 1 && var13 >= var54 - 75 && var13 <= var54 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                class52.method3044("https://www.jagex.com/terms/privacy/#eight", true, false);
                method1110(class225.field2866, class225.field3003, class225.field3004);
                field1163 = 6;
                return;
            }
            int var56 = field1164 + 180 + 80;
            if (var12 == 1 && var13 >= var56 - 75 && var13 <= var56 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                method5979(true);
            }
        } else if (field1163 == 12) {
            String var57 = "";
            switch(field1161) {
                case 0:
                    var57 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var57 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method5979(false);
            }
            int var58 = field1164 + 180;
            short var59 = 276;
            if (var12 == 1 && var13 >= var58 - 75 && var13 <= var58 + 75 && var14 >= var59 - 20 && var14 <= var59 + 20) {
                class52.method3044(var57, true, false);
                method1110(class225.field2866, class225.field3003, class225.field3004);
                field1163 = 6;
                return;
            }
            int var60 = field1164 + 180;
            short var61 = 326;
            if (var12 == 1 && var13 >= var60 - 75 && var13 <= var60 + 75 && var14 >= var61 - 20 && var14 <= var61 + 20) {
                method5979(false);
            }
        } else if (field1163 == 24) {
            int var62 = field1164 + 180;
            short var63 = 301;
            if (var12 == 1 && var13 >= var62 - 75 && var13 <= var62 + 75 && var14 >= var63 - 20 && var14 <= var63 + 20) {
                method5979(false);
            }
        }
    }

    @ObfuscatedName("lc.t(ZI)V")
    public static void method5979(boolean arg0) {
        field1165 = class225.field2953;
        field1157 = class225.field2954;
        field1167 = class225.field2955;
        field1163 = 2;
        if (arg0) {
            field1156 = "";
        }
        method997();
        if (client.field663 && field1168 != null && field1168.length() > 0) {
            field1159 = 1;
        } else {
            field1159 = 0;
        }
    }

    @ObfuscatedName("q.x(Lkb;Lkb;Lkb;B)V")
    public static void method64(class295 arg0, class295 arg1, class295 arg2) {
        field1148 = (Statics.field3255 - 765) / 2;
        field1164 = field1148 + 202;
        Statics.field1173 = field1164 + 180;
        if (field1169) {
            if (Statics.field1420 == null) {
                Statics.field1420 = class326.method477(Statics.field11, "sl_back", "");
            }
            if (Statics.field1 == null) {
                class236 var3 = Statics.field11;
                int var4 = var3.method3775("sl_flags");
                int var5 = var3.method3786(var4, "");
                class324[] var6;
                if (class326.method1599(var3, var4, var5)) {
                    class324[] var7 = new class324[Statics.field3885];
                    for (int var8 = 0; var8 < Statics.field3885; var8++) {
                        class324 var9 = var7[var8] = new class324();
                        var9.field3871 = Statics.field72;
                        var9.field3872 = Statics.field3888;
                        var9.field3869 = Statics.field3886[var8];
                        var9.field3870 = Statics.field3887[var8];
                        var9.field3867 = Statics.field3889[var8];
                        var9.field3868 = Statics.field3042[var8];
                        var9.field3865 = Statics.field3890;
                        var9.field3866 = Statics.field283[var8];
                    }
                    class326.method3139();
                    var6 = var7;
                } else {
                    var6 = null;
                }
                Statics.field1 = var6;
            }
            if (Statics.field1442 == null) {
                class236 var12 = Statics.field11;
                int var13 = var12.method3775("sl_arrows");
                int var14 = var12.method3786(var13, "");
                class324[] var15;
                if (class326.method1599(var12, var13, var14)) {
                    class324[] var16 = new class324[Statics.field3885];
                    for (int var17 = 0; var17 < Statics.field3885; var17++) {
                        class324 var18 = var16[var17] = new class324();
                        var18.field3871 = Statics.field72;
                        var18.field3872 = Statics.field3888;
                        var18.field3869 = Statics.field3886[var17];
                        var18.field3870 = Statics.field3887[var17];
                        var18.field3867 = Statics.field3889[var17];
                        var18.field3868 = Statics.field3042[var17];
                        var18.field3865 = Statics.field3890;
                        var18.field3866 = Statics.field283[var17];
                    }
                    class326.method3139();
                    var15 = var16;
                } else {
                    var15 = null;
                }
                Statics.field1442 = var15;
            }
            if (Statics.field3096 == null) {
                class236 var21 = Statics.field11;
                int var22 = var21.method3775("sl_stars");
                int var23 = var21.method3786(var22, "");
                class324[] var24;
                if (class326.method1599(var21, var22, var23)) {
                    class324[] var25 = new class324[Statics.field3885];
                    for (int var26 = 0; var26 < Statics.field3885; var26++) {
                        class324 var27 = var25[var26] = new class324();
                        var27.field3871 = Statics.field72;
                        var27.field3872 = Statics.field3888;
                        var27.field3869 = Statics.field3886[var26];
                        var27.field3870 = Statics.field3887[var26];
                        var27.field3867 = Statics.field3889[var26];
                        var27.field3868 = Statics.field3042[var26];
                        var27.field3865 = Statics.field3890;
                        var27.field3866 = Statics.field283[var26];
                    }
                    class326.method3139();
                    var24 = var25;
                } else {
                    var24 = null;
                }
                Statics.field3096 = var24;
            }
            if (Statics.field286 == null) {
                Statics.field286 = class326.method2742(Statics.field11, "leftarrow", "");
            }
            if (Statics.field3618 == null) {
                Statics.field3618 = class326.method2742(Statics.field11, "rightarrow", "");
            }
            class321.method5485(field1148, 23, 765, 480, 0);
            class321.method5486(field1148, 0, 125, 23, 12425273, 9135624);
            class321.method5486(field1148 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4965(class225.field3030, field1148 + 62, 15, 0, -1);
            if (Statics.field3096 != null) {
                Statics.field3096[1].method5576(field1148 + 140, 1);
                arg1.method4982(class225.field3031, field1148 + 152, 10, 16777215, -1);
                Statics.field3096[0].method5576(field1148 + 140, 12);
                arg1.method4982(class225.field3032, field1148 + 152, 21, 16777215, -1);
            }
            if (Statics.field1442 != null) {
                int var30 = field1148 + 280;
                if (class72.field1003[0] == 0 && class72.field1007[0] == 0) {
                    Statics.field1442[2].method5576(var30, 4);
                } else {
                    Statics.field1442[0].method5576(var30, 4);
                }
                if (class72.field1003[0] == 0 && class72.field1007[0] == 1) {
                    Statics.field1442[3].method5576(var30 + 15, 4);
                } else {
                    Statics.field1442[1].method5576(var30 + 15, 4);
                }
                arg0.method4982(class225.field2763, var30 + 32, 17, 16777215, -1);
                int var31 = field1148 + 390;
                if (class72.field1003[0] == 1 && class72.field1007[0] == 0) {
                    Statics.field1442[2].method5576(var31, 4);
                } else {
                    Statics.field1442[0].method5576(var31, 4);
                }
                if (class72.field1003[0] == 1 && class72.field1007[0] == 1) {
                    Statics.field1442[3].method5576(var31 + 15, 4);
                } else {
                    Statics.field1442[1].method5576(var31 + 15, 4);
                }
                arg0.method4982(class225.field2762, var31 + 32, 17, 16777215, -1);
                int var32 = field1148 + 500;
                if (class72.field1003[0] == 2 && class72.field1007[0] == 0) {
                    Statics.field1442[2].method5576(var32, 4);
                } else {
                    Statics.field1442[0].method5576(var32, 4);
                }
                if (class72.field1003[0] == 2 && class72.field1007[0] == 1) {
                    Statics.field1442[3].method5576(var32 + 15, 4);
                } else {
                    Statics.field1442[1].method5576(var32 + 15, 4);
                }
                arg0.method4982(class225.field2750, var32 + 32, 17, 16777215, -1);
                int var33 = field1148 + 610;
                if (class72.field1003[0] == 3 && class72.field1007[0] == 0) {
                    Statics.field1442[2].method5576(var33, 4);
                } else {
                    Statics.field1442[0].method5576(var33, 4);
                }
                if (class72.field1003[0] == 3 && class72.field1007[0] == 1) {
                    Statics.field1442[3].method5576(var33 + 15, 4);
                } else {
                    Statics.field1442[1].method5576(var33 + 15, 4);
                }
                arg0.method4982(class225.field3036, var33 + 32, 17, 16777215, -1);
            }
            class321.method5485(field1148 + 708, 4, 50, 16, 0);
            arg1.method4965(class225.field2987, field1148 + 708 + 25, 16, 16777215, -1);
            field1177 = -1;
            if (Statics.field1420 != null) {
                byte var34 = 88;
                byte var35 = 19;
                int var36 = 765 / (var34 + 1) - 1;
                int var37 = 480 / (var35 + 1);
                int var38;
                int var39;
                do {
                    var38 = var37;
                    var39 = var36;
                    if ((var36 - 1) * var37 >= class72.field993) {
                        var36--;
                    }
                    if ((var37 - 1) * var36 >= class72.field993) {
                        var37--;
                    }
                    if ((var37 - 1) * var36 >= class72.field993) {
                        var37--;
                    }
                } while (var37 != var38 || var36 != var39);
                int var40 = (765 - var34 * var36) / (var36 + 1);
                if (var40 > 5) {
                    var40 = 5;
                }
                int var41 = (480 - var35 * var37) / (var37 + 1);
                if (var41 > 5) {
                    var41 = 5;
                }
                int var42 = (765 - var34 * var36 - (var36 - 1) * var40) / 2;
                int var43 = (480 - var35 * var37 - (var37 - 1) * var41) / 2;
                int var44 = (class72.field993 + var37 - 1) / var37;
                field1176 = var44 - var36;
                if (Statics.field286 != null && field1178 > 0) {
                    Statics.field286.method5576(8, Statics.field256 / 2 - Statics.field286.field3868 / 2);
                }
                if (Statics.field3618 != null && field1178 < field1176) {
                    Statics.field3618.method5576(Statics.field3255 - Statics.field3618.field3867 - 8, Statics.field256 / 2 - Statics.field3618.field3868 / 2);
                }
                int var45 = var43 + 23;
                int var46 = field1148 + var42;
                int var47 = 0;
                boolean var48 = false;
                int var49 = field1178;
                for (int var50 = var37 * var49; var50 < class72.field993 && var49 - field1178 < var36; var50++) {
                    class72 var51 = Statics.field1284[var50];
                    boolean var52 = true;
                    String var53 = Integer.toString(var51.field999);
                    if (var51.field999 == -1) {
                        var53 = class225.field3037;
                        var52 = false;
                    } else if (var51.field999 > 1980) {
                        var53 = class225.field3002;
                        var52 = false;
                    }
                    int var54 = 0;
                    byte var55;
                    if (var51.method1586()) {
                        if (var51.method1620()) {
                            var55 = 7;
                        } else {
                            var55 = 6;
                        }
                    } else if (var51.method1618()) {
                        var54 = 16711680;
                        if (var51.method1620()) {
                            var55 = 5;
                        } else {
                            var55 = 4;
                        }
                    } else if (var51.method1583()) {
                        if (var51.method1620()) {
                            var55 = 3;
                        } else {
                            var55 = 2;
                        }
                    } else if (var51.method1620()) {
                        var55 = 1;
                    } else {
                        var55 = 0;
                    }
                    if (class55.field464 >= var46 && class55.field461 >= var45 && class55.field464 < var34 + var46 && class55.field461 < var35 + var45 && var52) {
                        field1177 = var50;
                        Statics.field1420[var55].method5600(var46, var45, 128, 16777215);
                        var48 = true;
                    } else {
                        Statics.field1420[var55].method5596(var46, var45);
                    }
                    if (Statics.field1 != null) {
                        Statics.field1[(var51.method1620() ? 8 : 0) + var51.field1002].method5576(var46 + 29, var45);
                    }
                    arg0.method4965(Integer.toString(var51.field997), var46 + 15, var35 / 2 + var45 + 5, var54, -1);
                    arg1.method4965(var53, var46 + 60, var35 / 2 + var45 + 5, 268435455, -1);
                    var45 += var35 + var41;
                    var47++;
                    if (var47 >= var37) {
                        var45 = var43 + 23;
                        var46 += var34 + var40;
                        var47 = 0;
                        var49++;
                    }
                }
                if (var48) {
                    int var56 = arg1.method4909(Statics.field1284[field1177].field1001) + 6;
                    int var57 = arg1.field3688 + 8;
                    int var58 = class55.field461 + 25;
                    if (var57 + var58 > 480) {
                        var58 = class55.field461 - 25 - var57;
                    }
                    class321.method5485(class55.field464 - var56 / 2, var58, var56, var57, 16777120);
                    class321.method5489(class55.field464 - var56 / 2, var58, var56, var57, 0);
                    arg1.method4965(Statics.field1284[field1177].field1001, class55.field464, arg1.field3688 + var58 + 4, 0, -1);
                }
            }
            Statics.field3235.method729(0, 0);
            return;
        }
        Statics.field1179.method5596(field1148, 0);
        Statics.field1152.method5596(field1148 + 382, 0);
        Statics.field408.method5576(field1148 + 382 - Statics.field408.field3867 / 2, 18);
        if (client.field632 == 0 || client.field632 == 5) {
            byte var59 = 20;
            arg0.method4965(class225.field2952, field1164 + 180, 245 - var59, 16777215, -1);
            int var60 = 253 - var59;
            class321.method5489(field1164 + 180 - 152, var60, 304, 34, 9179409);
            class321.method5489(field1164 + 180 - 151, var60 + 1, 302, 32, 0);
            class321.method5485(field1164 + 180 - 150, var60 + 2, field1181 * 3, 30, 9179409);
            class321.method5485(field1181 * 3 + (field1164 + 180 - 150), var60 + 2, 300 - field1181 * 3, 30, 0);
            arg0.method4965(field1158, field1164 + 180, 276 - var59, 16777215, -1);
        }
        if (client.field632 == 20) {
            Statics.field1149.method5576(field1164 + 180 - Statics.field1149.field3867 / 2, 271 - Statics.field1149.field3868 / 2);
            short var61 = 201;
            arg0.method4965(field1165, field1164 + 180, var61, 16776960, 0);
            int var141 = var61 + 15;
            arg0.method4965(field1157, field1164 + 180, var141, 16776960, 0);
            int var142 = var141 + 15;
            arg0.method4965(field1167, field1164 + 180, var142, 16776960, 0);
            int var143 = var142 + 15;
            int var144 = var143 + 7;
            if (field1163 != 4) {
                arg0.method4982(class225.field2980, field1164 + 180 - 110, var144, 16777215, 0);
                short var62 = 200;
                String var63 = Statics.field69.field1034 ? class291.method3615(field1168) : field1168;
                String var64;
                for (var64 = var63; arg0.method4909(var64) > var62; var64 = var64.substring(0, var64.length() - 1)) {
                }
                arg0.method4982(class296.method4987(var64), field1164 + 180 - 70, var144, 16777215, 0);
                var141 = var144 + 15;
                arg0.method4982(class225.field2981 + class291.method3615(field1156), field1164 + 180 - 108, var141, 16777215, 0);
                var141 += 15;
            }
        }
        if (client.field632 == 10 || client.field632 == 11) {
            Statics.field1149.method5576(field1164, 171);
            if (field1163 == 0) {
                short var65 = 251;
                arg0.method4965(class225.field2983, field1164 + 180, var65, 16776960, 0);
                int var145 = var65 + 30;
                int var66 = field1164 + 180 - 80;
                short var67 = 291;
                Statics.field1150.method5576(var66 - 73, var67 - 20);
                arg0.method4918(class225.field2796, var66 - 73, var67 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var68 = field1164 + 180 + 80;
                Statics.field1150.method5576(var68 - 73, var67 - 20);
                arg0.method4918(class225.field3033, var68 - 73, var67 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1163 == 1) {
                arg0.method4965(field1146, field1164 + 180, 201, 16776960, 0);
                short var69 = 236;
                arg0.method4965(field1165, field1164 + 180, var69, 16777215, 0);
                int var146 = var69 + 15;
                arg0.method4965(field1157, field1164 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method4965(field1167, field1164 + 180, var147, 16777215, 0);
                int var148 = var147 + 15;
                int var70 = field1164 + 180 - 80;
                short var71 = 321;
                Statics.field1150.method5576(var70 - 73, var71 - 20);
                arg0.method4965(class225.field2744, var70, var71 + 5, 16777215, 0);
                int var72 = field1164 + 180 + 80;
                Statics.field1150.method5576(var72 - 73, var71 - 20);
                arg0.method4965(class225.field2987, var72, var71 + 5, 16777215, 0);
            } else if (field1163 == 2) {
                short var73 = 201;
                arg0.method4965(field1165, Statics.field1173, var73, 16776960, 0);
                int var149 = var73 + 15;
                arg0.method4965(field1157, Statics.field1173, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method4965(field1167, Statics.field1173, var150, 16776960, 0);
                int var151 = var150 + 15;
                int var152 = var151 + 7;
                arg0.method4982(class225.field2980, Statics.field1173 - 110, var152, 16777215, 0);
                short var74 = 200;
                String var75 = Statics.field69.field1034 ? class291.method3615(field1168) : field1168;
                String var76;
                for (var76 = var75; arg0.method4909(var76) > var74; var76 = var76.substring(1)) {
                }
                arg0.method4982(class296.method4987(var76) + (field1159 == 0 & client.field635 % 40 < 20 ? class82.method159(16776960) + class82.field1122 : ""), Statics.field1173 - 70, var152, 16777215, 0);
                var149 = var152 + 15;
                arg0.method4982(class225.field2981 + class291.method3615(field1156) + (field1159 == 1 & client.field635 % 40 < 20 ? class82.method159(16776960) + class82.field1122 : ""), Statics.field1173 - 108, var149, 16777215, 0);
                var149 += 15;
                short var77 = 277;
                int var78 = Statics.field1173 + -117;
                boolean var79 = client.field663;
                boolean var80 = field1170;
                class324 var81 = var79 ? (var80 ? Statics.field1304 : Statics.field1154) : (var80 ? Statics.field1137 : Statics.field1153);
                var81.method5576(var78, var77);
                int var83 = var81.field3867 + 5 + var78;
                arg1.method4982(class225.field2988, var83, var77 + 13, 16776960, 0);
                int var84 = Statics.field1173 + 24;
                boolean var85 = Statics.field69.field1034;
                boolean var86 = field1171;
                class324 var87 = var85 ? (var86 ? Statics.field1304 : Statics.field1154) : (var86 ? Statics.field1137 : Statics.field1153);
                var87.method5576(var84, var77);
                int var89 = var87.field3867 + 5 + var84;
                arg1.method4982(class225.field2890, var89, var77 + 13, 16776960, 0);
                int var153 = var77 + 15;
                int var90 = Statics.field1173 - 80;
                short var91 = 321;
                Statics.field1150.method5576(var90 - 73, var91 - 20);
                arg0.method4965(class225.field2986, var90, var91 + 5, 16777215, 0);
                int var92 = Statics.field1173 + 80;
                Statics.field1150.method5576(var92 - 73, var91 - 20);
                arg0.method4965(class225.field2987, var92, var91 + 5, 16777215, 0);
                short var93 = 357;
                switch(field1162) {
                    case 2:
                        Statics.field1269 = class225.field2847;
                        break;
                    default:
                        Statics.field1269 = class225.field2755;
                }
                Statics.field1444 = new class319(Statics.field1173, var93, arg1.method4909(Statics.field1269), 11);
                Statics.field2467 = new class319(Statics.field1173, var93, arg1.method4909(class225.field3000), 11);
                arg1.method4965(Statics.field1269, Statics.field1173, var93, 16777215, 0);
            } else if (field1163 == 3) {
                short var94 = 201;
                arg0.method4965(class225.field2878, field1164 + 180, var94, 16776960, 0);
                int var154 = var94 + 20;
                arg1.method4965(class225.field2991, field1164 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg1.method4965(class225.field2992, field1164 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var95 = field1164 + 180;
                short var96 = 276;
                Statics.field1150.method5576(var95 - 73, var96 - 20);
                arg2.method4965(class225.field3014, var95, var96 + 5, 16777215, 0);
                int var97 = field1164 + 180;
                short var98 = 326;
                Statics.field1150.method5576(var97 - 73, var98 - 20);
                arg2.method4965(class225.field2826, var97, var98 + 5, 16777215, 0);
            } else if (field1163 == 4) {
                arg0.method4965(class225.field2969, field1164 + 180, 201, 16776960, 0);
                short var99 = 236;
                arg0.method4965(field1165, field1164 + 180, var99, 16777215, 0);
                int var157 = var99 + 15;
                arg0.method4965(field1157, field1164 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                arg0.method4965(field1167, field1164 + 180, var158, 16777215, 0);
                int var159 = var158 + 15;
                arg0.method4982(class225.field2982 + class291.method3615(Statics.field278) + (client.field635 % 40 < 20 ? class82.method159(16776960) + class82.field1122 : ""), field1164 + 180 - 108, var159, 16777215, 0);
                int var160 = var159 - 8;
                arg0.method4982(class225.field2805, field1164 + 180 - 9, var160, 16776960, 0);
                int var161 = var160 + 15;
                arg0.method4982(class225.field2748, field1164 + 180 - 9, var161, 16776960, 0);
                int var100 = field1164 + 180 - 9 + arg0.method4909(class225.field2748) + 15;
                int var101 = var161 - arg0.field3688;
                class324 var102;
                if (field1172) {
                    var102 = Statics.field1154;
                } else {
                    var102 = Statics.field1153;
                }
                var102.method5576(var100, var101);
                var157 = var161 + 15;
                int var103 = field1164 + 180 - 80;
                short var104 = 321;
                Statics.field1150.method5576(var103 - 73, var104 - 20);
                arg0.method4965(class225.field2744, var103, var104 + 5, 16777215, 0);
                int var105 = field1164 + 180 + 80;
                Statics.field1150.method5576(var105 - 73, var104 - 20);
                arg0.method4965(class225.field2987, var105, var104 + 5, 16777215, 0);
                arg1.method4965(class225.field2861, field1164 + 180, var104 + 36, 255, 0);
            } else if (field1163 == 5) {
                arg0.method4965(class225.field2995, field1164 + 180, 201, 16776960, 0);
                short var106 = 221;
                arg2.method4965(field1165, field1164 + 180, var106, 16776960, 0);
                int var162 = var106 + 15;
                arg2.method4965(field1157, field1164 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                arg2.method4965(field1167, field1164 + 180, var163, 16776960, 0);
                int var164 = var163 + 15;
                int var165 = var164 + 14;
                arg0.method4982(class225.field2931, field1164 + 180 - 145, var165, 16777215, 0);
                short var107 = 174;
                String var108 = Statics.field69.field1034 ? class291.method3615(field1168) : field1168;
                String var109;
                for (var109 = var108; arg0.method4909(var109) > var107; var109 = var109.substring(1)) {
                }
                arg0.method4982(class296.method4987(var109) + (client.field635 % 40 < 20 ? class82.method159(16776960) + class82.field1122 : ""), field1164 + 180 - 34, var165, 16777215, 0);
                var162 = var165 + 15;
                int var110 = field1164 + 180 - 80;
                short var111 = 321;
                Statics.field1150.method5576(var110 - 73, var111 - 20);
                arg0.method4965(class225.field2906, var110, var111 + 5, 16777215, 0);
                int var112 = field1164 + 180 + 80;
                Statics.field1150.method5576(var112 - 73, var111 - 20);
                arg0.method4965(class225.field2798, var112, var111 + 5, 16777215, 0);
                short var113 = 356;
                arg1.method4965(class225.field3000, Statics.field1173, var113, 268435455, 0);
            } else if (field1163 == 6) {
                short var114 = 201;
                arg0.method4965(field1165, field1164 + 180, var114, 16776960, 0);
                int var166 = var114 + 15;
                arg0.method4965(field1157, field1164 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg0.method4965(field1167, field1164 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                int var115 = field1164 + 180;
                short var116 = 321;
                Statics.field1150.method5576(var115 - 73, var116 - 20);
                arg0.method4965(class225.field2798, var115, var116 + 5, 16777215, 0);
            } else if (field1163 == 7) {
                short var117 = 216;
                arg0.method4965(class225.field2746, field1164 + 180, var117, 16776960, 0);
                int var169 = var117 + 15;
                arg2.method4965(class225.field2974, field1164 + 180, var169, 16776960, 0);
                int var170 = var169 + 15;
                arg2.method4965(class225.field3028, field1164 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                int var118 = field1164 + 180 - 80;
                short var119 = 321;
                Statics.field1150.method5576(var118 - 73, var119 - 20);
                arg0.method4965(class225.field3029, var118, var119 + 5, 16777215, 0);
                int var120 = field1164 + 180 + 80;
                Statics.field1150.method5576(var120 - 73, var119 - 20);
                arg0.method4965(class225.field2798, var120, var119 + 5, 16777215, 0);
            } else if (field1163 == 8) {
                short var121 = 216;
                arg0.method4965(class225.field2876, field1164 + 180, var121, 16776960, 0);
                int var172 = var121 + 15;
                arg2.method4965(class225.field2877, field1164 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                arg2.method4965(class225.field2793, field1164 + 180, var173, 16776960, 0);
                int var174 = var173 + 15;
                int var122 = field1164 + 180 - 80;
                short var123 = 321;
                Statics.field1150.method5576(var122 - 73, var123 - 20);
                arg0.method4965(class225.field2879, var122, var123 + 5, 16777215, 0);
                int var124 = field1164 + 180 + 80;
                Statics.field1150.method5576(var124 - 73, var123 - 20);
                arg0.method4965(class225.field2798, var124, var123 + 5, 16777215, 0);
            } else if (field1163 == 12) {
                short var125 = 201;
                String var126 = "";
                String var127 = "";
                String var128 = "";
                switch(field1161) {
                    case 0:
                        var126 = class225.field2829;
                        var127 = class225.field2993;
                        var128 = class225.field2794;
                        break;
                    case 1:
                        var126 = class225.field2831;
                        var127 = class225.field2832;
                        var128 = class225.field2833;
                        break;
                    default:
                        method5979(false);
                }
                arg0.method4965(var126, field1164 + 180, var125, 16776960, 0);
                int var175 = var125 + 15;
                arg2.method4965(var127, field1164 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                arg2.method4965(var128, field1164 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var129 = field1164 + 180;
                short var130 = 276;
                Statics.field1150.method5576(var129 - 73, var130 - 20);
                arg0.method4965(class225.field2776, var129, var130 + 5, 16777215, 0);
                int var131 = field1164 + 180;
                short var132 = 326;
                Statics.field1150.method5576(var131 - 73, var132 - 20);
                arg0.method4965(class225.field2798, var131, var132 + 5, 16777215, 0);
            } else if (field1163 == 24) {
                short var133 = 221;
                arg0.method4965(field1165, field1164 + 180, var133, 16777215, 0);
                int var178 = var133 + 15;
                arg0.method4965(field1157, field1164 + 180, var178, 16777215, 0);
                int var179 = var178 + 15;
                arg0.method4965(field1167, field1164 + 180, var179, 16777215, 0);
                int var180 = var179 + 15;
                int var134 = field1164 + 180;
                short var135 = 301;
                Statics.field1150.method5576(var134 - 73, var135 - 20);
                arg0.method4965(class225.field2742, var134, var135 + 5, 16777215, 0);
            }
        }
        if (client.field632 >= 10) {
            int[] var136 = new int[4];
            class321.method5481(var136);
            class321.method5483(field1148, 0, field1148 + 765, Statics.field256);
            Statics.field3844.method1627(field1148 - 22, client.field635);
            Statics.field3844.method1627(field1148 + 765 + 22 - 128, client.field635);
            class321.method5511(var136);
        }
        Statics.field1852[Statics.field69.field1037 ? 1 : 0].method5576(field1148 + 765 - 40, 463);
        if (client.field632 <= 5 || Statics.field523 != class191.field2337) {
            return;
        }
        if (Statics.field2369 == null) {
            Statics.field2369 = class326.method2742(Statics.field11, "sl_button", "");
            return;
        }
        int var137 = field1148 + 5;
        short var138 = 463;
        byte var139 = 100;
        byte var140 = 35;
        Statics.field2369.method5576(var137, var138);
        arg0.method4965(class225.field2789 + " " + client.field872, var139 / 2 + var137, var140 / 2 + var138 - 2, 16777215, 0);
        if (Statics.field3577 == null) {
            arg1.method4965(class225.field3040, var139 / 2 + var137, var140 / 2 + var138 + 12, 16777215, 0);
        } else {
            arg1.method4965(class225.field3039, var139 / 2 + var137, var140 / 2 + var138 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("br.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1110(String arg0, String arg1, String arg2) {
        field1165 = arg0;
        field1157 = arg1;
        field1167 = arg2;
    }

    @ObfuscatedName("gd.f(Lbw;I)V")
    public static void method3508(class54 arg0) {
        while (class46.method4883()) {
            if (Statics.field1308 == 13) {
                method140();
                return;
            }
            if (Statics.field1308 == 96) {
                if (field1178 > 0 && Statics.field286 != null) {
                    field1178--;
                }
            } else if (Statics.field1308 == 97 && field1178 < field1176 && Statics.field3618 != null) {
                field1178++;
            }
        }
        if (class55.field462 != 1 && Statics.field1048 || class55.field462 != 4) {
            return;
        }
        int var1 = field1148 + 280;
        if (class55.field468 >= var1 && class55.field468 <= var1 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(0, 0);
            return;
        }
        if (class55.field468 >= var1 + 15 && class55.field468 <= var1 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(0, 1);
            return;
        }
        int var2 = field1148 + 390;
        if (class55.field468 >= var2 && class55.field468 <= var2 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(1, 0);
            return;
        }
        if (class55.field468 >= var2 + 15 && class55.field468 <= var2 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(1, 1);
            return;
        }
        int var3 = field1148 + 500;
        if (class55.field468 >= var3 && class55.field468 <= var3 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(2, 0);
            return;
        }
        if (class55.field468 >= var3 + 15 && class55.field468 <= var3 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(2, 1);
            return;
        }
        int var4 = field1148 + 610;
        if (class55.field468 >= var4 && class55.field468 <= var4 + 14 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(3, 0);
            return;
        }
        if (class55.field468 >= var4 + 15 && class55.field468 <= var4 + 80 && class55.field469 >= 4 && class55.field469 <= 18) {
            class72.method1058(3, 1);
            return;
        }
        if (class55.field468 >= field1148 + 708 && class55.field469 >= 4 && class55.field468 <= field1148 + 708 + 50 && class55.field469 <= 20) {
            method140();
            return;
        }
        if (field1177 != -1) {
            class72 var5 = Statics.field1284[field1177];
            method1052(var5);
            method140();
            return;
        }
        if (field1178 > 0 && Statics.field286 != null && class55.field468 >= 0 && class55.field468 <= Statics.field286.field3867 && class55.field469 >= Statics.field256 / 2 - 50 && class55.field469 <= Statics.field256 / 2 + 50) {
            field1178--;
        }
        if (field1178 < field1176 && Statics.field3618 != null && class55.field468 >= Statics.field3255 - Statics.field3618.field3867 - 5 && class55.field468 <= Statics.field3255 && class55.field469 >= Statics.field256 / 2 - 50 && class55.field469 <= Statics.field256 / 2 + 50) {
            field1178++;
        }
    }

    @ObfuscatedName("bf.c(Lbl;I)V")
    public static void method1052(class72 arg0) {
        if (arg0.method1620() != client.field637) {
            client.field637 = arg0.method1620();
            boolean var1 = arg0.method1620();
            if (Statics.field1928 != var1) {
                class255.method2518();
                Statics.field1928 = var1;
            }
        }
        Statics.field3102 = arg0.field1000;
        client.field872 = arg0.field997;
        client.field626 = arg0.field998;
        Statics.field165 = client.field627 == 0 ? 43594 : arg0.field997 + 40000;
        Statics.field1597 = client.field627 == 0 ? 443 : arg0.field997 + 50000;
        Statics.field497 = Statics.field165;
    }

    @ObfuscatedName("ev.r(B)V")
    public static void method3144() {
        if (class72.method3291()) {
            field1169 = true;
            field1178 = 0;
            field1176 = 0;
        }
    }

    @ObfuscatedName("y.y(I)V")
    public static void method140() {
        field1169 = false;
        Statics.field1179.method5596(field1148, 0);
        Statics.field1152.method5596(field1148 + 382, 0);
        Statics.field408.method5576(field1148 + 382 - Statics.field408.field3867 / 2, 18);
    }

    @ObfuscatedName("bm.p(I)V")
    public static void method1560() {
        field1163 = 24;
        method1110(class225.field2977, class225.field2897, class225.field3034);
    }
}
