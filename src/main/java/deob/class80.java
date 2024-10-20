package deob;

import java.text.DecimalFormat;

@ObfuscatedName("ce")
public class class80 {

    @ObfuscatedName("ce.r")
    public static int field1144 = 0;

    @ObfuscatedName("ce.f")
    public static int field1145 = field1144 + 202;

    @ObfuscatedName("ce.k")
    public static int[] field1163 = new int[256];

    @ObfuscatedName("ce.o")
    public static int field1153 = 0;

    @ObfuscatedName("ce.af")
    public static int field1154 = 0;

    @ObfuscatedName("ce.ac")
    public static int field1161 = 0;

    @ObfuscatedName("ce.az")
    public static int field1174 = 0;

    @ObfuscatedName("ce.aj")
    public static int field1157 = 0;

    @ObfuscatedName("ce.ag")
    public static int field1158 = 0;

    @ObfuscatedName("ce.ab")
    public static int field1159 = 10;

    @ObfuscatedName("ce.ar")
    public static String field1160 = "";

    @ObfuscatedName("ce.al")
    public static int field1143 = -1;

    @ObfuscatedName("ce.am")
    public static int field1162 = 1;

    @ObfuscatedName("ce.ap")
    public static int field1164 = 0;

    @ObfuscatedName("ce.av")
    public static String field1169 = "";

    @ObfuscatedName("ce.au")
    public static String field1166 = "";

    @ObfuscatedName("ce.aq")
    public static String field1167 = "";

    @ObfuscatedName("ce.bs")
    public static String field1168 = "";

    @ObfuscatedName("ce.bz")
    public static String field1181 = "";

    @ObfuscatedName("ce.ba")
    public static String field1170 = "";

    @ObfuscatedName("ce.bk")
    public static boolean field1171 = false;

    @ObfuscatedName("ce.bb")
    public static boolean field1172 = false;

    @ObfuscatedName("ce.bg")
    public static boolean field1173 = true;

    @ObfuscatedName("ce.be")
    public static int field1151 = 0;

    @ObfuscatedName("ce.bj")
    public static String field1155 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ce.bh")
    public static String field1176 = "1234567890";

    @ObfuscatedName("ce.bm")
    public static boolean field1177 = false;

    @ObfuscatedName("ce.br")
    public static int field1165 = -1;

    @ObfuscatedName("ce.bt")
    public static long field1179;

    @ObfuscatedName("ce.cb")
    public static long field1180;

    static {
        new DecimalFormat("##0.00");
        new class151();
        field1179 = -1L;
        field1180 = -1L;
    }

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.g(I)I")
    public static int method1887() {
        return 11;
    }

    @ObfuscatedName("k.r(Liu;Liu;ZIB)V")
    public static void method298(class250 arg0, class250 arg1, boolean arg2, int arg3) {
        if (!Statics.field1175) {
            field1164 = arg3;
            class320.method5579();
            byte[] var4 = arg0.method4456("title.jpg", "");
            Statics.field1146 = class44.method1839(var4);
            Statics.field1147 = Statics.field1146.method5678();
            if ((client.field661 & 0x20000000) == 0) {
                Statics.field3402 = class325.method4639(arg1, "logo", "");
            } else {
                Statics.field3402 = class325.method4639(arg1, "logo_deadman_mode", "");
            }
            Statics.field1150 = class325.method4639(arg1, "titlebox", "");
            Statics.field3802 = class325.method4639(arg1, "titlebutton", "");
            int var5 = arg1.method4432("runes");
            int var6 = arg1.method4454(var5, "");
            class323[] var7;
            if (class325.method213(arg1, var5, var6)) {
                var7 = class325.method5499();
            } else {
                var7 = null;
            }
            Statics.field45 = var7;
            int var9 = arg1.method4432("title_mute");
            int var10 = arg1.method4454(var9, "");
            class323[] var11;
            if (class325.method213(arg1, var9, var10)) {
                var11 = class325.method5499();
            } else {
                var11 = null;
            }
            Statics.field1148 = var11;
            Statics.field2418 = class325.method4639(arg1, "options_radio_buttons,0", "");
            Statics.field1149 = class325.method4639(arg1, "options_radio_buttons,4", "");
            Statics.field1862 = class325.method4639(arg1, "options_radio_buttons,2", "");
            Statics.field1926 = class325.method4639(arg1, "options_radio_buttons,6", "");
            Statics.field1051 = Statics.field2418.field3873;
            Statics.field406 = Statics.field2418.field3874;
            Statics.field1152 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1152[var13] = var13 * 262144;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1152[var14 + 64] = var14 * 1024 + 16711680;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1152[var15 + 128] = var15 * 4 + 16776960;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1152[var16 + 192] = 16777215;
            }
            Statics.field584 = new int[256];
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field584[var17] = var17 * 1024;
            }
            for (int var18 = 0; var18 < 64; var18++) {
                Statics.field584[var18 + 64] = var18 * 4 + 65280;
            }
            for (int var19 = 0; var19 < 64; var19++) {
                Statics.field584[var19 + 128] = var19 * 262144 + 65535;
            }
            for (int var20 = 0; var20 < 64; var20++) {
                Statics.field584[var20 + 192] = 16777215;
            }
            Statics.field2049 = new int[256];
            for (int var21 = 0; var21 < 64; var21++) {
                Statics.field2049[var21] = var21 * 4;
            }
            for (int var22 = 0; var22 < 64; var22++) {
                Statics.field2049[var22 + 64] = var22 * 262144 + 255;
            }
            for (int var23 = 0; var23 < 64; var23++) {
                Statics.field2049[var23 + 128] = var23 * 1024 + 16711935;
            }
            for (int var24 = 0; var24 < 64; var24++) {
                Statics.field2049[var24 + 192] = 16777215;
            }
            Statics.field1048 = new int[256];
            Statics.field641 = new int[32768];
            Statics.field323 = new int[32768];
            Statics.method5080((class323) null);
            Statics.field183 = new int[32768];
            Statics.field184 = new int[32768];
            if (arg2) {
                field1181 = "";
                field1170 = "";
            }
            Statics.field605 = 0;
            Statics.field83 = "";
            field1173 = true;
            field1177 = false;
            if (Statics.field436.field1036) {
                class220.method3428(2);
            } else {
                class220.method477(2, Statics.field2118, "scape main", "", 255, false);
            }
            class253.method4273(false);
            Statics.field1175 = true;
            field1144 = (Statics.field1039 - 765) / 2;
            field1145 = field1144 + 202;
            Statics.field104 = field1145 + 180;
            Statics.field1146.method5709(field1144, 0);
            Statics.field1147.method5709(field1144 + 382, 0);
            Statics.field3402.method5668(field1144 + 382 - Statics.field3402.field3873 / 2, 18);
        } else if (arg3 == 4) {
            field1164 = 4;
        }
    }

    @ObfuscatedName("bj.e(Lah;I)V")
    public static void method1638(class48 arg0) {
        if (!field1177) {
            if ((class49.field478 == 1 || !Statics.field133 && class49.field478 == 4) && class49.field479 >= field1144 + 765 - 50 && class49.field468 >= 453) {
                Statics.field436.field1036 = !Statics.field436.field1036;
                class68.method1123();
                if (Statics.field436.field1036) {
                    class220.method323();
                } else {
                    class220.method1857(Statics.field2118, "scape main", "", 255, false);
                }
            }
            if (client.field721 != 5) {
                if (field1179 == -1L) {
                    field1179 = class187.method2664() + 1000L;
                }
                long var6 = class187.method2664();
                boolean var9;
                if (client.field916 == null || client.field766 >= client.field916.size()) {
                    var9 = true;
                } else {
                    while (true) {
                        if (client.field766 >= client.field916.size()) {
                            var9 = true;
                            break;
                        }
                        class54 var8 = (class54) client.field916.get(client.field766);
                        if (!var8.method996()) {
                            var9 = false;
                            break;
                        }
                        client.field766++;
                    }
                }
                if (var9 && field1180 == -1L) {
                    field1180 = var6;
                    if (field1180 > field1179) {
                        field1179 = field1180;
                    }
                }
                field1157++;
                if (client.field721 == 10 || client.field721 == 11) {
                    if (client.field786 == 0) {
                        if (class49.field478 == 1 || !Statics.field133 && class49.field478 == 4) {
                            int var10 = field1144 + 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class49.field479 >= var10 && class49.field479 <= var10 + var12 && class49.field468 >= var11 && class49.field468 <= var11 + var13) {
                                method90();
                                return;
                            }
                        }
                        if (Statics.field1011 != null) {
                            method90();
                        }
                    }
                    int var14 = class49.field478;
                    int var15 = class49.field479;
                    int var16 = class49.field468;
                    if (var14 == 0) {
                        var15 = class49.field474;
                        var16 = class49.field465 * -976212263;
                    }
                    if (!Statics.field133 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field1164 == 0) {
                        boolean var17 = false;
                        while (class40.method5126()) {
                            if (Statics.field599 == 84) {
                                var17 = true;
                            }
                        }
                        int var18 = Statics.field104 - 80;
                        short var19 = 291;
                        if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                            class46.method3067(Statics.method1030("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var20 = Statics.field104 + 80;
                        if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                            if ((client.field661 & 0x2000000) != 0) {
                                field1169 = "";
                                field1166 = class240.field3083;
                                field1167 = class240.field2912;
                                field1168 = class240.field3099;
                                field1164 = 1;
                                if (client.field747 && field1181 != null && field1181.length() > 0) {
                                    field1151 = 1;
                                } else {
                                    field1151 = 0;
                                }
                            } else if ((client.field661 & 0x4) != 0) {
                                if ((client.field661 & 0x400) == 0) {
                                    field1166 = class240.field2879;
                                    field1167 = class240.field3075;
                                    field1168 = class240.field3076;
                                } else {
                                    field1166 = class240.field3146;
                                    field1167 = class240.field3081;
                                    field1168 = class240.field3104;
                                }
                                field1169 = class240.field3073;
                                field1164 = 1;
                                if (client.field747 && field1181 != null && field1181.length() > 0) {
                                    field1151 = 1;
                                } else {
                                    field1151 = 0;
                                }
                            } else if ((client.field661 & 0x400) == 0) {
                                method945(false);
                            } else {
                                field1166 = class240.field3077;
                                field1167 = class240.field2862;
                                field1168 = class240.field3079;
                                field1169 = class240.field3073;
                                field1164 = 1;
                                if (client.field747 && field1181 != null && field1181.length() > 0) {
                                    field1151 = 1;
                                } else {
                                    field1151 = 0;
                                }
                            }
                        }
                    } else if (field1164 == 1) {
                        while (class40.method5126()) {
                            if (Statics.field599 == 84) {
                                method945(false);
                            } else if (Statics.field599 == 13) {
                                field1164 = 0;
                            }
                        }
                        int var21 = Statics.field104 - 80;
                        short var22 = 321;
                        if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            method945(false);
                        }
                        int var23 = Statics.field104 + 80;
                        if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                            field1164 = 0;
                        }
                    } else if (field1164 == 2) {
                        short var24 = 201;
                        int var62 = var24 + 52;
                        if (var14 == 1 && var16 >= var62 - 12 && var16 < var62 + 2) {
                            field1151 = 0;
                        }
                        var62 += 15;
                        if (var14 == 1 && var16 >= var62 - 12 && var16 < var62 + 2) {
                            field1151 = 1;
                        }
                        var62 += 15;
                        short var25 = 361;
                        if (Statics.field1178 != null) {
                            int var26 = Statics.field1178.field3838 / 2;
                            if (var14 == 1 && var15 >= Statics.field1178.field3837 - var26 && var15 <= Statics.field1178.field3837 + var26 && var16 >= var25 - 15 && var16 < var25) {
                                switch(field1162) {
                                    case 1:
                                        method3702(class240.field3115, class240.field3116, class240.field3117);
                                        field1164 = 5;
                                        return;
                                    case 2:
                                        class46.method3067("https://support.runescape.com/hc/en-gb", true, false);
                                }
                            }
                        }
                        int var27 = Statics.field104 - 80;
                        short var28 = 321;
                        if (var14 == 1 && var15 >= var27 - 75 && var15 <= var27 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                            field1181 = field1181.trim();
                            if (field1181.length() == 0) {
                                method3702(class240.field2975, class240.field3097, class240.field2939);
                                return;
                            }
                            if (field1170.length() == 0) {
                                method3702(class240.field2978, class240.field2979, class240.field3003);
                                return;
                            }
                            method3702(class240.field2877, class240.field3089, class240.field3118);
                            client.method538(false);
                            client.method203(20);
                            return;
                        }
                        int var29 = field1145 + 180 + 80;
                        if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                            field1164 = 0;
                            field1181 = "";
                            field1170 = "";
                            Statics.field605 = 0;
                            Statics.field83 = "";
                            field1173 = true;
                        }
                        int var30 = Statics.field104 + -117;
                        short var31 = 277;
                        field1171 = var15 >= var30 && var15 < Statics.field1051 + var30 && var16 >= var31 && var16 < Statics.field406 + var31;
                        if (var14 == 1 && field1171) {
                            client.field747 = !client.field747;
                            if (!client.field747 && Statics.field436.field1035 != null) {
                                Statics.field436.field1035 = null;
                                class68.method1123();
                            }
                        }
                        int var32 = Statics.field104 + 24;
                        short var33 = 277;
                        field1172 = var15 >= var32 && var15 < Statics.field1051 + var32 && var16 >= var33 && var16 < Statics.field406 + var33;
                        if (var14 == 1 && field1172) {
                            Statics.field436.field1034 = !Statics.field436.field1034;
                            if (!Statics.field436.field1034) {
                                field1181 = "";
                                Statics.field436.field1035 = null;
                                if (client.field747 && field1181 != null && field1181.length() > 0) {
                                    field1151 = 1;
                                } else {
                                    field1151 = 0;
                                }
                            }
                            class68.method1123();
                        }
                        while (true) {
                            while (class40.method5126()) {
                                boolean var34 = false;
                                for (int var35 = 0; var35 < field1155.length(); var35++) {
                                    if (Statics.field1857 == field1155.charAt(var35)) {
                                        var34 = true;
                                        break;
                                    }
                                }
                                if (Statics.field599 == 13) {
                                    field1164 = 0;
                                    field1181 = "";
                                    field1170 = "";
                                    Statics.field605 = 0;
                                    Statics.field83 = "";
                                    field1173 = true;
                                } else if (field1151 == 0) {
                                    if (Statics.field599 == 85 && field1181.length() > 0) {
                                        field1181 = field1181.substring(0, field1181.length() - 1);
                                    }
                                    if (Statics.field599 == 84 || Statics.field599 == 80) {
                                        field1151 = 1;
                                    }
                                    if (var34 && field1181.length() < 320) {
                                        field1181 = field1181 + Statics.field1857;
                                    }
                                } else if (field1151 == 1) {
                                    if (Statics.field599 == 85 && field1170.length() > 0) {
                                        field1170 = field1170.substring(0, field1170.length() - 1);
                                    }
                                    if (Statics.field599 == 84 || Statics.field599 == 80) {
                                        field1151 = 0;
                                    }
                                    if (Statics.field599 == 84) {
                                        field1181 = field1181.trim();
                                        if (field1181.length() == 0) {
                                            method3702(class240.field2975, class240.field3097, class240.field2939);
                                            return;
                                        }
                                        if (field1170.length() == 0) {
                                            method3702(class240.field2978, class240.field2979, class240.field3003);
                                            return;
                                        }
                                        method3702(class240.field2877, class240.field3089, class240.field3118);
                                        client.method538(false);
                                        client.method203(20);
                                        return;
                                    }
                                    if (var34 && field1170.length() < 20) {
                                        field1170 = field1170 + Statics.field1857;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1164 == 3) {
                        int var36 = field1145 + 180;
                        short var37 = 276;
                        if (var14 == 1 && var15 >= var36 - 75 && var15 <= var36 + 75 && var16 >= var37 - 20 && var16 <= var37 + 20) {
                            method945(false);
                        }
                        int var38 = field1145 + 180;
                        short var39 = 326;
                        if (var14 == 1 && var15 >= var38 - 75 && var15 <= var38 + 75 && var16 >= var39 - 20 && var16 <= var39 + 20) {
                            method3702(class240.field3115, class240.field3116, class240.field3117);
                            field1164 = 5;
                            return;
                        }
                    } else if (field1164 == 4) {
                        int var40 = field1145 + 180 - 80;
                        short var41 = 321;
                        if (var14 == 1 && var15 >= var40 - 75 && var15 <= var40 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                            Statics.field83.trim();
                            if (Statics.field83.length() != 6) {
                                method3702(class240.field2894, class240.field2895, class240.field2896);
                                return;
                            }
                            Statics.field605 = Integer.parseInt(Statics.field83);
                            Statics.field83 = "";
                            client.method538(true);
                            method3702(class240.field2877, class240.field3089, class240.field3118);
                            client.method203(20);
                            return;
                        }
                        if (var14 == 1 && var15 >= field1145 + 180 - 9 && var15 <= field1145 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                            field1173 = !field1173;
                        }
                        if (var14 == 1 && var15 >= field1145 + 180 - 34 && var15 <= field1145 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                            class46.method3067(Statics.method1030("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var42 = field1145 + 180 + 80;
                        if (var14 == 1 && var15 >= var42 - 75 && var15 <= var42 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                            field1164 = 0;
                            field1181 = "";
                            field1170 = "";
                            Statics.field605 = 0;
                            Statics.field83 = "";
                        }
                        while (class40.method5126()) {
                            boolean var43 = false;
                            for (int var44 = 0; var44 < field1176.length(); var44++) {
                                if (Statics.field1857 == field1176.charAt(var44)) {
                                    var43 = true;
                                    break;
                                }
                            }
                            if (Statics.field599 == 13) {
                                field1164 = 0;
                                field1181 = "";
                                field1170 = "";
                                Statics.field605 = 0;
                                Statics.field83 = "";
                            } else {
                                if (Statics.field599 == 85 && Statics.field83.length() > 0) {
                                    Statics.field83 = Statics.field83.substring(0, Statics.field83.length() - 1);
                                }
                                if (Statics.field599 == 84) {
                                    Statics.field83.trim();
                                    if (Statics.field83.length() != 6) {
                                        method3702(class240.field2894, class240.field2895, class240.field2896);
                                        return;
                                    }
                                    Statics.field605 = Integer.parseInt(Statics.field83);
                                    Statics.field83 = "";
                                    client.method538(true);
                                    method3702(class240.field2877, class240.field3089, class240.field3118);
                                    client.method203(20);
                                    return;
                                }
                                if (var43 && Statics.field83.length() < 6) {
                                    Statics.field83 = Statics.field83 + Statics.field1857;
                                }
                            }
                        }
                    } else if (field1164 == 5) {
                        int var45 = field1145 + 180 - 80;
                        short var46 = 321;
                        if (var14 == 1 && var15 >= var45 - 75 && var15 <= var45 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                            method3272();
                            return;
                        }
                        int var47 = field1145 + 180 + 80;
                        if (var14 == 1 && var15 >= var47 - 75 && var15 <= var47 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                            method945(true);
                        }
                        while (class40.method5126()) {
                            boolean var48 = false;
                            for (int var49 = 0; var49 < field1155.length(); var49++) {
                                if (Statics.field1857 == field1155.charAt(var49)) {
                                    var48 = true;
                                    break;
                                }
                            }
                            if (Statics.field599 == 13) {
                                method945(true);
                            } else {
                                if (Statics.field599 == 85 && field1181.length() > 0) {
                                    field1181 = field1181.substring(0, field1181.length() - 1);
                                }
                                if (Statics.field599 == 84) {
                                    method3272();
                                    return;
                                }
                                if (var48 && field1181.length() < 320) {
                                    field1181 = field1181 + Statics.field1857;
                                }
                            }
                        }
                    } else if (field1164 == 6) {
                        while (true) {
                            do {
                                if (!class40.method5126()) {
                                    short var50 = 321;
                                    if (var14 == 1 && var16 >= var50 - 20 && var16 <= var50 + 20) {
                                        method945(true);
                                    }
                                    return;
                                }
                            } while (Statics.field599 != 84 && Statics.field599 != 13);
                            method945(true);
                        }
                    } else if (field1164 == 7) {
                        int var51 = field1145 + 180 - 80;
                        short var52 = 321;
                        if (var14 == 1 && var15 >= var51 - 75 && var15 <= var51 + 75 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                            class46.method3067(Statics.method1030("secure", true) + "m=dob/set_dob.ws", true, false);
                            method3702(class240.field3112, class240.field3009, class240.field3114);
                            field1164 = 6;
                            return;
                        }
                        int var53 = field1145 + 180 + 80;
                        if (var14 == 1 && var15 >= var53 - 75 && var15 <= var53 + 75 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                            method945(true);
                        }
                    } else if (field1164 == 8) {
                        int var54 = field1145 + 180 - 80;
                        short var55 = 321;
                        if (var14 == 1 && var15 >= var54 - 75 && var15 <= var54 + 75 && var16 >= var55 - 20 && var16 <= var55 + 20) {
                            class46.method3067("https://www.jagex.com/terms/privacy/#eight", true, false);
                            method3702(class240.field3112, class240.field3009, class240.field3114);
                            field1164 = 6;
                            return;
                        }
                        int var56 = field1145 + 180 + 80;
                        if (var14 == 1 && var15 >= var56 - 75 && var15 <= var56 + 75 && var16 >= var55 - 20 && var16 <= var55 + 20) {
                            method945(true);
                        }
                    } else if (field1164 == 12) {
                        String var57 = "";
                        switch(field1143) {
                            case 0:
                                var57 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                break;
                            case 1:
                                var57 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                break;
                            default:
                                method945(false);
                        }
                        int var58 = field1145 + 180;
                        short var59 = 276;
                        if (var14 == 1 && var15 >= var58 - 75 && var15 <= var58 + 75 && var16 >= var59 - 20 && var16 <= var59 + 20) {
                            class46.method3067(var57, true, false);
                            method3702(class240.field3112, class240.field3009, class240.field3114);
                            field1164 = 6;
                            return;
                        }
                        int var60 = field1145 + 180;
                        short var61 = 326;
                        if (var14 == 1 && var15 >= var60 - 75 && var15 <= var60 + 75 && var16 >= var61 - 20 && var16 <= var61 + 20) {
                            method945(false);
                        }
                    }
                }
            }
        } else if (class49.field478 == 1 || !Statics.field133 && class49.field478 == 4) {
            int var1 = field1144 + 280;
            if (class49.field479 >= var1 && class49.field479 <= var1 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                class67.method739(0, 0);
            } else if (class49.field479 >= var1 + 15 && class49.field479 <= var1 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                class67.method739(0, 1);
            } else {
                int var2 = field1144 + 390;
                if (class49.field479 >= var2 && class49.field479 <= var2 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                    class67.method739(1, 0);
                } else if (class49.field479 >= var2 + 15 && class49.field479 <= var2 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                    class67.method739(1, 1);
                } else {
                    int var3 = field1144 + 500;
                    if (class49.field479 >= var3 && class49.field479 <= var3 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                        class67.method739(2, 0);
                    } else if (class49.field479 >= var3 + 15 && class49.field479 <= var3 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                        class67.method739(2, 1);
                    } else {
                        int var4 = field1144 + 610;
                        if (class49.field479 >= var4 && class49.field479 <= var4 + 14 && class49.field468 >= 4 && class49.field468 <= 18) {
                            class67.method739(3, 0);
                        } else if (class49.field479 >= var4 + 15 && class49.field479 <= var4 + 80 && class49.field468 >= 4 && class49.field468 <= 18) {
                            class67.method739(3, 1);
                        } else if (class49.field479 >= field1144 + 708 && class49.field468 >= 4 && class49.field479 <= field1144 + 708 + 50 && class49.field468 <= 20) {
                            field1177 = false;
                            Statics.field1146.method5709(field1144, 0);
                            Statics.field1147.method5709(field1144 + 382, 0);
                            Statics.field3402.method5668(field1144 + 382 - Statics.field3402.field3873 / 2, 18);
                        } else if (field1165 != -1) {
                            class67 var5 = Statics.field1018[field1165];
                            method3068(var5);
                            field1177 = false;
                            Statics.field1146.method5709(field1144, 0);
                            Statics.field1147.method5709(field1144 + 382, 0);
                            Statics.field3402.method5668(field1144 + 382 - Statics.field3402.field3873 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.q(ZI)V")
    public static void method945(boolean arg0) {
        field1166 = class240.field3070;
        field1167 = class240.field3071;
        field1168 = class240.field3072;
        field1164 = 2;
        if (arg0) {
            field1170 = "";
        }
        if (field1181 == null || field1181.length() <= 0) {
            if (Statics.field436.field1035 == null) {
                client.field747 = false;
            } else {
                field1181 = Statics.field436.field1035;
                client.field747 = true;
            }
        }
        if (client.field747 && field1181 != null && field1181.length() > 0) {
            field1151 = 1;
        } else {
            field1151 = 0;
        }
    }

    @ObfuscatedName("fa.c(I)V")
    public static void method3272() {
        field1181 = field1181.trim();
        if (field1181.length() == 0) {
            method3702(class240.field3115, class240.field3116, class240.field3117);
            return;
        }
        long var0 = class75.method4814();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class75.method2566(var0, field1181);
        }
        switch(var2) {
            case 2:
                method3702(class240.field2944, class240.field3119, class240.field3082);
                field1164 = 6;
                break;
            case 3:
                method3702(class240.field3121, class240.field3122, class240.field3123);
                break;
            case 4:
                method3702(class240.field3124, class240.field2871, class240.field3126);
                break;
            case 5:
                method3702(class240.field3127, class240.field3010, class240.field2908);
                break;
            case 6:
                method3702(class240.field2923, class240.field3035, class240.field3132);
                break;
            case 7:
                method3702(class240.field3133, class240.field3134, class240.field3135);
        }
    }

    @ObfuscatedName("em.i(Lkz;Lkz;Lkz;ZB)V")
    public static void method3043(class301 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg3) {
            field1144 = (Statics.field1039 - 765) / 2;
            field1145 = field1144 + 202;
            Statics.field104 = field1145 + 180;
        }
        if (field1177) {
            if (Statics.field1138 == null) {
                Statics.field1138 = class325.method5082(Statics.field2003, "sl_back", "");
            }
            if (Statics.field1491 == null) {
                class252 var4 = Statics.field2003;
                int var5 = var4.method4432("sl_flags");
                int var6 = var4.method4454(var5, "");
                class323[] var7;
                if (class325.method213(var4, var5, var6)) {
                    var7 = class325.method5499();
                } else {
                    var7 = null;
                }
                Statics.field1491 = var7;
            }
            if (Statics.field82 == null) {
                class252 var9 = Statics.field2003;
                int var10 = var9.method4432("sl_arrows");
                int var11 = var9.method4454(var10, "");
                class323[] var12;
                if (class325.method213(var9, var10, var11)) {
                    var12 = class325.method5499();
                } else {
                    var12 = null;
                }
                Statics.field82 = var12;
            }
            if (Statics.field514 == null) {
                class252 var14 = Statics.field2003;
                int var15 = var14.method4432("sl_stars");
                int var16 = var14.method4454(var15, "");
                class323[] var17;
                if (class325.method213(var14, var15, var16)) {
                    var17 = class325.method5499();
                } else {
                    var17 = null;
                }
                Statics.field514 = var17;
            }
            class320.method5583(field1144, 23, 765, 480, 0);
            class320.method5588(field1144, 0, 125, 23, 12425273, 9135624);
            class320.method5588(field1144 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5422(class240.field3001, field1144 + 62, 15, 0, -1);
            if (Statics.field514 != null) {
                Statics.field514[1].method5668(field1144 + 140, 1);
                arg1.method5390(class240.field3141, field1144 + 152, 10, 16777215, -1);
                Statics.field514[0].method5668(field1144 + 140, 12);
                arg1.method5390(class240.field3142, field1144 + 152, 21, 16777215, -1);
            }
            if (Statics.field82 != null) {
                int var19 = field1144 + 280;
                if (class67.field1017[0] == 0 && class67.field1019[0] == 0) {
                    Statics.field82[2].method5668(var19, 4);
                } else {
                    Statics.field82[0].method5668(var19, 4);
                }
                if (class67.field1017[0] == 0 && class67.field1019[0] == 1) {
                    Statics.field82[3].method5668(var19 + 15, 4);
                } else {
                    Statics.field82[1].method5668(var19 + 15, 4);
                }
                arg0.method5390(class240.field3143, var19 + 32, 17, 16777215, -1);
                int var20 = field1144 + 390;
                if (class67.field1017[0] == 1 && class67.field1019[0] == 0) {
                    Statics.field82[2].method5668(var20, 4);
                } else {
                    Statics.field82[0].method5668(var20, 4);
                }
                if (class67.field1017[0] == 1 && class67.field1019[0] == 1) {
                    Statics.field82[3].method5668(var20 + 15, 4);
                } else {
                    Statics.field82[1].method5668(var20 + 15, 4);
                }
                arg0.method5390(class240.field3144, var20 + 32, 17, 16777215, -1);
                int var21 = field1144 + 500;
                if (class67.field1017[0] == 2 && class67.field1019[0] == 0) {
                    Statics.field82[2].method5668(var21, 4);
                } else {
                    Statics.field82[0].method5668(var21, 4);
                }
                if (class67.field1017[0] == 2 && class67.field1019[0] == 1) {
                    Statics.field82[3].method5668(var21 + 15, 4);
                } else {
                    Statics.field82[1].method5668(var21 + 15, 4);
                }
                arg0.method5390(class240.field2864, var21 + 32, 17, 16777215, -1);
                int var22 = field1144 + 610;
                if (class67.field1017[0] == 3 && class67.field1019[0] == 0) {
                    Statics.field82[2].method5668(var22, 4);
                } else {
                    Statics.field82[0].method5668(var22, 4);
                }
                if (class67.field1017[0] == 3 && class67.field1019[0] == 1) {
                    Statics.field82[3].method5668(var22 + 15, 4);
                } else {
                    Statics.field82[1].method5668(var22 + 15, 4);
                }
                arg0.method5390(class240.field2855, var22 + 32, 17, 16777215, -1);
            }
            class320.method5583(field1144 + 708, 4, 50, 16, 0);
            arg1.method5422(class240.field2995, field1144 + 708 + 25, 16, 16777215, -1);
            field1165 = -1;
            if (Statics.field1138 != null) {
                byte var23 = 88;
                byte var24 = 19;
                int var25 = 765 / (var23 + 1);
                int var26 = 480 / (var24 + 1);
                int var27;
                int var28;
                do {
                    var27 = var26;
                    var28 = var25;
                    if ((var25 - 1) * var26 >= class67.field1014) {
                        var25--;
                    }
                    if ((var26 - 1) * var25 >= class67.field1014) {
                        var26--;
                    }
                    if ((var26 - 1) * var25 >= class67.field1014) {
                        var26--;
                    }
                } while (var26 != var27 || var25 != var28);
                int var29 = (765 - var23 * var25) / (var25 + 1);
                if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = (480 - var24 * var26) / (var26 + 1);
                if (var30 > 5) {
                    var30 = 5;
                }
                int var31 = (765 - var23 * var25 - (var25 - 1) * var29) / 2;
                int var32 = (480 - var24 * var26 - (var26 - 1) * var30) / 2;
                int var33 = var32 + 23;
                int var34 = field1144 + var31;
                int var35 = 0;
                boolean var36 = false;
                for (int var37 = 0; var37 < class67.field1014; var37++) {
                    class67 var38 = Statics.field1018[var37];
                    boolean var39 = true;
                    String var40 = Integer.toString(var38.field1021);
                    if (var38.field1021 == -1) {
                        var40 = class240.field3147;
                        var39 = false;
                    } else if (var38.field1021 > 1980) {
                        var40 = class240.field3148;
                        var39 = false;
                    }
                    int var41 = 0;
                    byte var42;
                    if (var38.method1579()) {
                        if (var38.method1577()) {
                            var42 = 7;
                        } else {
                            var42 = 6;
                        }
                    } else if (var38.method1582()) {
                        var41 = 16711680;
                        if (var38.method1577()) {
                            var42 = 5;
                        } else {
                            var42 = 4;
                        }
                    } else if (var38.method1580()) {
                        if (var38.method1577()) {
                            var42 = 3;
                        } else {
                            var42 = 2;
                        }
                    } else if (var38.method1577()) {
                        var42 = 1;
                    } else {
                        var42 = 0;
                    }
                    if (class49.field474 >= var34 && class49.field465 * -976212263 >= var33 && class49.field474 < var23 + var34 && class49.field465 * -976212263 < var24 + var33 && var39) {
                        field1165 = var37;
                        Statics.field1138[var42].method5724(var34, var33, 128, 16777215);
                        var36 = true;
                    } else {
                        Statics.field1138[var42].method5709(var34, var33);
                    }
                    if (Statics.field1491 != null) {
                        Statics.field1491[(var38.method1577() ? 8 : 0) + var38.field1022].method5668(var34 + 29, var33);
                    }
                    arg0.method5422(Integer.toString(var38.field1016), var34 + 15, var24 / 2 + var33 + 5, var41, -1);
                    arg1.method5422(var40, var34 + 60, var24 / 2 + var33 + 5, 268435455, -1);
                    var33 += var24 + var30;
                    var35++;
                    if (var35 >= var26) {
                        var33 = var32 + 23;
                        var34 += var23 + var29;
                        var35 = 0;
                    }
                }
                if (var36) {
                    int var43 = arg1.method5343(Statics.field1018[field1165].field1023) + 6;
                    int var44 = arg1.field3766 + 8;
                    class320.method5583(class49.field474 - var43 / 2, class49.field465 * -976212263 + 20 + 5, var43, var44, 16777120);
                    class320.method5652(class49.field474 - var43 / 2, class49.field465 * -976212263 + 20 + 5, var43, var44, 0);
                    arg1.method5422(Statics.field1018[field1165].field1023, class49.field474, class49.field465 * -976212263 + 20 + 5 + arg1.field3766 + 4, 0, -1);
                }
            }
            Statics.field314.method758(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1146.method5709(field1144, 0);
            Statics.field1147.method5709(field1144 + 382, 0);
            Statics.field3402.method5668(field1144 + 382 - Statics.field3402.field3873 / 2, 18);
        }
        if (client.field721 == 0 || client.field721 == 5) {
            byte var45 = 20;
            arg0.method5422(class240.field3096, field1145 + 180, 245 - var45, 16777215, -1);
            int var46 = 253 - var45;
            class320.method5652(field1145 + 180 - 152, var46, 304, 34, 9179409);
            class320.method5652(field1145 + 180 - 151, var46 + 1, 302, 32, 0);
            class320.method5583(field1145 + 180 - 150, var46 + 2, field1159 * 3, 30, 9179409);
            class320.method5583(field1159 * 3 + (field1145 + 180 - 150), var46 + 2, 300 - field1159 * 3, 30, 0);
            arg0.method5422(field1160, field1145 + 180, 276 - var45, 16777215, -1);
        }
        if (client.field721 == 20) {
            Statics.field1150.method5668(field1145 + 180 - Statics.field1150.field3873 / 2, 271 - Statics.field1150.field3874 / 2);
            short var47 = 201;
            arg0.method5422(field1166, field1145 + 180, var47, 16776960, 0);
            int var176 = var47 + 15;
            arg0.method5422(field1167, field1145 + 180, var176, 16776960, 0);
            int var177 = var176 + 15;
            arg0.method5422(field1168, field1145 + 180, var177, 16776960, 0);
            int var178 = var177 + 15;
            int var179 = var178 + 7;
            if (field1164 != 4) {
                arg0.method5390(class240.field3091, field1145 + 180 - 110, var179, 16777215, 0);
                short var48 = 200;
                String var49 = Statics.field436.field1034 ? class308.method4429(field1181) : field1181;
                String var50;
                for (var50 = var49; arg0.method5343(var50) > var48; var50 = var50.substring(0, var50.length() - 1)) {
                }
                arg0.method5390(class302.method5347(var50), field1145 + 180 - 70, var179, 16777215, 0);
                var176 = var179 + 15;
                arg0.method5390(class240.field3092 + class308.method4429(field1170), field1145 + 180 - 108, var176, 16777215, 0);
                var176 += 15;
            }
        }
        if (client.field721 == 10 || client.field721 == 11) {
            Statics.field1150.method5668(field1145, 171);
            if (field1164 == 0) {
                short var51 = 251;
                arg0.method5422(class240.field3080, field1145 + 180, var51, 16776960, 0);
                int var180 = var51 + 30;
                int var52 = field1145 + 180 - 80;
                short var53 = 291;
                Statics.field3802.method5668(var52 - 73, var53 - 20);
                arg0.method5342(class240.field3095, var52 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var54 = field1145 + 180 + 80;
                Statics.field3802.method5668(var54 - 73, var53 - 20);
                arg0.method5342(class240.field3101, var54 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1164 == 1) {
                arg0.method5422(field1169, field1145 + 180, 201, 16776960, 0);
                short var55 = 236;
                arg0.method5422(field1166, field1145 + 180, var55, 16777215, 0);
                int var181 = var55 + 15;
                arg0.method5422(field1167, field1145 + 180, var181, 16777215, 0);
                int var182 = var181 + 15;
                arg0.method5422(field1168, field1145 + 180, var182, 16777215, 0);
                int var183 = var182 + 15;
                int var56 = field1145 + 180 - 80;
                short var57 = 321;
                Statics.field3802.method5668(var56 - 73, var57 - 20);
                arg0.method5422(class240.field2861, var56, var57 + 5, 16777215, 0);
                int var58 = field1145 + 180 + 80;
                Statics.field3802.method5668(var58 - 73, var57 - 20);
                arg0.method5422(class240.field2995, var58, var57 + 5, 16777215, 0);
            } else if (field1164 == 2) {
                short var59 = 201;
                arg0.method5422(field1166, Statics.field104, var59, 16776960, 0);
                int var184 = var59 + 15;
                arg0.method5422(field1167, Statics.field104, var184, 16776960, 0);
                int var185 = var184 + 15;
                arg0.method5422(field1168, Statics.field104, var185, 16776960, 0);
                int var186 = var185 + 15;
                int var187 = var186 + 7;
                arg0.method5390(class240.field3091, Statics.field104 - 110, var187, 16777215, 0);
                short var60 = 200;
                String var61 = Statics.field436.field1034 ? class308.method4429(field1181) : field1181;
                String var62;
                for (var62 = var61; arg0.method5343(var62) > var60; var62 = var62.substring(1)) {
                }
                arg0.method5390(class302.method5347(var62) + (field1151 == 0 & client.field656 % 40 < 20 ? class76.method3031(16776960) + class76.field1118 : ""), Statics.field104 - 70, var187, 16777215, 0);
                var184 = var187 + 15;
                arg0.method5390(class240.field3092 + class308.method4429(field1170) + (field1151 == 1 & client.field656 % 40 < 20 ? class76.method3031(16776960) + class76.field1118 : ""), Statics.field104 - 108, var184, 16777215, 0);
                var184 += 15;
                short var63 = 277;
                int var64 = Statics.field104 + -117;
                boolean var65 = client.field747;
                boolean var66 = field1171;
                class323 var67 = var65 ? (var66 ? Statics.field1926 : Statics.field1862) : (var66 ? Statics.field1149 : Statics.field2418);
                var67.method5668(var64, var63);
                int var69 = var67.field3873 + 5 + var64;
                arg1.method5390(class240.field2885, var69, var63 + 13, 16776960, 0);
                int var70 = Statics.field104 + 24;
                boolean var71 = Statics.field436.field1034;
                boolean var72 = field1172;
                class323 var73 = var71 ? (var72 ? Statics.field1926 : Statics.field1862) : (var72 ? Statics.field1149 : Statics.field2418);
                var73.method5668(var70, var63);
                int var75 = var73.field3873 + 5 + var70;
                arg1.method5390(class240.field3100, var75, var63 + 13, 16776960, 0);
                int var188 = var63 + 15;
                int var76 = Statics.field104 - 80;
                short var77 = 321;
                Statics.field3802.method5668(var76 - 73, var77 - 20);
                arg0.method5422(class240.field3131, var76, var77 + 5, 16777215, 0);
                int var78 = Statics.field104 + 80;
                Statics.field3802.method5668(var78 - 73, var77 - 20);
                arg0.method5422(class240.field2995, var78, var77 + 5, 16777215, 0);
                short var79 = 357;
                switch(field1162) {
                    case 2:
                        Statics.field2625 = class240.field3111;
                        break;
                    default:
                        Statics.field2625 = class240.field3110;
                }
                Statics.field1178 = new class316(Statics.field104, var79, arg1.method5343(Statics.field2625), 11);
                arg1.method5422(Statics.field2625, Statics.field104, var79, 16777215, 0);
            } else if (field1164 == 3) {
                short var80 = 201;
                arg0.method5422(class240.field2870, field1145 + 180, var80, 16776960, 0);
                int var189 = var80 + 20;
                arg1.method5422(class240.field3102, field1145 + 180, var189, 16776960, 0);
                int var190 = var189 + 15;
                arg1.method5422(class240.field3027, field1145 + 180, var190, 16776960, 0);
                int var191 = var190 + 15;
                int var81 = field1145 + 180;
                short var82 = 276;
                Statics.field3802.method5668(var81 - 73, var82 - 20);
                arg2.method5422(class240.field3068, var81, var82 + 5, 16777215, 0);
                int var83 = field1145 + 180;
                short var84 = 326;
                Statics.field3802.method5668(var83 - 73, var84 - 20);
                arg2.method5422(class240.field3105, var83, var84 + 5, 16777215, 0);
            } else if (field1164 == 4) {
                arg0.method5422(class240.field3086, field1145 + 180, 201, 16776960, 0);
                short var85 = 236;
                arg0.method5422(field1166, field1145 + 180, var85, 16777215, 0);
                int var192 = var85 + 15;
                arg0.method5422(field1167, field1145 + 180, var192, 16777215, 0);
                int var193 = var192 + 15;
                arg0.method5422(field1168, field1145 + 180, var193, 16777215, 0);
                int var194 = var193 + 15;
                arg0.method5390(class240.field3093 + class308.method4429(Statics.field83) + (client.field656 % 40 < 20 ? class76.method3031(16776960) + class76.field1118 : ""), field1145 + 180 - 108, var194, 16777215, 0);
                int var195 = var194 - 8;
                arg0.method5390(class240.field2984, field1145 + 180 - 9, var195, 16776960, 0);
                int var196 = var195 + 15;
                arg0.method5390(class240.field2865, field1145 + 180 - 9, var196, 16776960, 0);
                int var86 = field1145 + 180 - 9 + arg0.method5343(class240.field2865) + 15;
                int var87 = var196 - arg0.field3766;
                class323 var88;
                if (field1173) {
                    var88 = Statics.field1862;
                } else {
                    var88 = Statics.field2418;
                }
                var88.method5668(var86, var87);
                var192 = var196 + 15;
                int var89 = field1145 + 180 - 80;
                short var90 = 321;
                Statics.field3802.method5668(var89 - 73, var90 - 20);
                arg0.method5422(class240.field2861, var89, var90 + 5, 16777215, 0);
                int var91 = field1145 + 180 + 80;
                Statics.field3802.method5668(var91 - 73, var90 - 20);
                arg0.method5422(class240.field2995, var91, var90 + 5, 16777215, 0);
                arg1.method5422(class240.field3128, field1145 + 180, var90 + 36, 255, 0);
            } else if (field1164 == 5) {
                arg0.method5422(class240.field2930, field1145 + 180, 201, 16776960, 0);
                short var92 = 221;
                arg2.method5422(field1166, field1145 + 180, var92, 16776960, 0);
                int var197 = var92 + 15;
                arg2.method5422(field1167, field1145 + 180, var197, 16776960, 0);
                int var198 = var197 + 15;
                arg2.method5422(field1168, field1145 + 180, var198, 16776960, 0);
                int var199 = var198 + 15;
                int var200 = var199 + 14;
                arg0.method5390(class240.field3107, field1145 + 180 - 145, var200, 16777215, 0);
                short var93 = 174;
                String var94 = Statics.field436.field1034 ? class308.method4429(field1181) : field1181;
                String var95;
                for (var95 = var94; arg0.method5343(var95) > var93; var95 = var95.substring(1)) {
                }
                arg0.method5390(class302.method5347(var95) + (client.field656 % 40 < 20 ? class76.method3031(16776960) + class76.field1118 : ""), field1145 + 180 - 34, var200, 16777215, 0);
                var197 = var200 + 15;
                int var96 = field1145 + 180 - 80;
                short var97 = 321;
                Statics.field3802.method5668(var96 - 73, var97 - 20);
                arg0.method5422(class240.field3053, var96, var97 + 5, 16777215, 0);
                int var98 = field1145 + 180 + 80;
                Statics.field3802.method5668(var98 - 73, var97 - 20);
                arg0.method5422(class240.field3109, var98, var97 + 5, 16777215, 0);
            } else if (field1164 == 6) {
                short var99 = 201;
                arg0.method5422(field1166, field1145 + 180, var99, 16776960, 0);
                int var201 = var99 + 15;
                arg0.method5422(field1167, field1145 + 180, var201, 16776960, 0);
                int var202 = var201 + 15;
                arg0.method5422(field1168, field1145 + 180, var202, 16776960, 0);
                int var203 = var202 + 15;
                int var100 = field1145 + 180;
                short var101 = 321;
                Statics.field3802.method5668(var100 - 73, var101 - 20);
                arg0.method5422(class240.field3109, var100, var101 + 5, 16777215, 0);
            } else if (field1164 == 7) {
                short var102 = 216;
                arg0.method5422(class240.field3136, field1145 + 180, var102, 16776960, 0);
                int var204 = var102 + 15;
                arg2.method5422(class240.field3103, field1145 + 180, var204, 16776960, 0);
                int var205 = var204 + 15;
                arg2.method5422(class240.field3138, field1145 + 180, var205, 16776960, 0);
                int var206 = var205 + 15;
                int var103 = field1145 + 180 - 80;
                short var104 = 321;
                Statics.field3802.method5668(var103 - 73, var104 - 20);
                arg0.method5422(class240.field3139, var103, var104 + 5, 16777215, 0);
                int var105 = field1145 + 180 + 80;
                Statics.field3802.method5668(var105 - 73, var104 - 20);
                arg0.method5422(class240.field3109, var105, var104 + 5, 16777215, 0);
            } else if (field1164 == 8) {
                short var106 = 216;
                arg0.method5422(class240.field3129, field1145 + 180, var106, 16776960, 0);
                int var207 = var106 + 15;
                arg2.method5422(class240.field2994, field1145 + 180, var207, 16776960, 0);
                int var208 = var207 + 15;
                arg2.method5422(class240.field3113, field1145 + 180, var208, 16776960, 0);
                int var209 = var208 + 15;
                int var107 = field1145 + 180 - 80;
                short var108 = 321;
                Statics.field3802.method5668(var107 - 73, var108 - 20);
                arg0.method5422(class240.field2996, var107, var108 + 5, 16777215, 0);
                int var109 = field1145 + 180 + 80;
                Statics.field3802.method5668(var109 - 73, var108 - 20);
                arg0.method5422(class240.field3109, var109, var108 + 5, 16777215, 0);
            } else if (field1164 == 12) {
                short var110 = 201;
                String var111 = "";
                String var112 = "";
                String var113 = "";
                switch(field1143) {
                    case 0:
                        var111 = class240.field2909;
                        var112 = class240.field2910;
                        var113 = class240.field2911;
                        break;
                    case 1:
                        var111 = class240.field3032;
                        var112 = class240.field2949;
                        var113 = class240.field2950;
                        break;
                    default:
                        method945(false);
                }
                arg0.method5422(var111, field1145 + 180, var110, 16776960, 0);
                int var210 = var110 + 15;
                arg2.method5422(var112, field1145 + 180, var210, 16776960, 0);
                int var211 = var210 + 15;
                arg2.method5422(var113, field1145 + 180, var211, 16776960, 0);
                int var212 = var211 + 15;
                int var114 = field1145 + 180;
                short var115 = 276;
                Statics.field3802.method5668(var114 - 73, var115 - 20);
                arg0.method5422(class240.field2893, var114, var115 + 5, 16777215, 0);
                int var116 = field1145 + 180;
                short var117 = 326;
                Statics.field3802.method5668(var116 - 73, var117 - 20);
                arg0.method5422(class240.field3109, var116, var117 + 5, 16777215, 0);
            }
        }
        if (field1157 > 0) {
            int var118 = field1157;
            short var119 = 256;
            field1161 += var118 * 128;
            if (field1161 > Statics.field641.length) {
                field1161 -= Statics.field641.length;
                int var120 = (int) (Math.random() * 12.0D);
                Statics.method5080(Statics.field45[var120]);
            }
            int var121 = 0;
            int var122 = var118 * 128;
            int var123 = (var119 - var118) * 128;
            for (int var124 = 0; var124 < var123; var124++) {
                int var125 = Statics.field183[var121 + var122] - Statics.field641[field1161 + var121 & Statics.field641.length - 1] * var118 / 6;
                if (var125 < 0) {
                    var125 = 0;
                }
                Statics.field183[var121++] = var125;
            }
            for (int var126 = var119 - var118; var126 < var119; var126++) {
                int var127 = var126 * 128;
                for (int var128 = 0; var128 < 128; var128++) {
                    int var129 = (int) (Math.random() * 100.0D);
                    if (var129 < 50 && var128 > 10 && var128 < 118) {
                        Statics.field183[var127 + var128] = 255;
                    } else {
                        Statics.field183[var127 + var128] = 0;
                    }
                }
            }
            if (field1153 > 0) {
                field1153 -= var118 * 4;
            }
            if (field1154 > 0) {
                field1154 -= var118 * 4;
            }
            if (field1153 == 0 && field1154 == 0) {
                int var130 = (int) (Math.random() * (double) (2000 / var118));
                if (var130 == 0) {
                    field1153 = 1024;
                }
                if (var130 == 1) {
                    field1154 = 1024;
                }
            }
            for (int var131 = 0; var131 < var119 - var118; var131++) {
                field1163[var131] = field1163[var118 + var131];
            }
            for (int var132 = var119 - var118; var132 < var119; var132++) {
                field1163[var132] = (int) (Math.sin((double) field1158 / 14.0D) * 16.0D + Math.sin((double) field1158 / 15.0D) * 14.0D + Math.sin((double) field1158 / 16.0D) * 12.0D);
                field1158++;
            }
            field1174 += var118 * -756795179;
            int var133 = ((client.field656 & 0x1) + var118) / 2;
            if (var133 > 0) {
                for (int var134 = 0; var134 < field1174 * -1149947692; var134++) {
                    int var135 = (int) (Math.random() * 124.0D) + 2;
                    int var136 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field183[(var136 << 7) + var135] = 192;
                }
                field1174 = 0;
                int var137 = 0;
                label583: while (true) {
                    if (var137 >= var119) {
                        int var141 = 0;
                        while (true) {
                            if (var141 >= 128) {
                                break label583;
                            }
                            int var142 = 0;
                            for (int var143 = -var133; var143 < var119; var143++) {
                                int var144 = var143 * 128;
                                if (var133 + var143 < var119) {
                                    var142 += Statics.field184[var133 * 128 + var141 + var144];
                                }
                                if (var143 - (var133 + 1) >= 0) {
                                    var142 -= Statics.field184[var141 + var144 - (var133 + 1) * 128];
                                }
                                if (var143 >= 0) {
                                    Statics.field183[var141 + var144] = var142 / (var133 * 2 + 1);
                                }
                            }
                            var141++;
                        }
                    }
                    int var138 = 0;
                    int var139 = var137 * 128;
                    for (int var140 = -var133; var140 < 128; var140++) {
                        if (var133 + var140 < 128) {
                            var138 += Statics.field183[var139 + var140 + var133];
                        }
                        if (var140 - (var133 + 1) >= 0) {
                            var138 -= Statics.field183[var139 + var140 - (var133 + 1)];
                        }
                        if (var140 >= 0) {
                            Statics.field184[var139 + var140] = var138 / (var133 * 2 + 1);
                        }
                    }
                    var137++;
                }
            }
            field1157 = 0;
        }
        short var145 = 256;
        if (field1153 > 0) {
            for (int var146 = 0; var146 < 256; var146++) {
                if (field1153 > 768) {
                    Statics.field1048[var146] = method1916(Statics.field1152[var146], Statics.field584[var146], 1024 - field1153);
                } else if (field1153 > 256) {
                    Statics.field1048[var146] = Statics.field584[var146];
                } else {
                    Statics.field1048[var146] = method1916(Statics.field584[var146], Statics.field1152[var146], 256 - field1153);
                }
            }
        } else if (field1154 > 0) {
            for (int var147 = 0; var147 < 256; var147++) {
                if (field1154 > 768) {
                    Statics.field1048[var147] = method1916(Statics.field1152[var147], Statics.field2049[var147], 1024 - field1154);
                } else if (field1154 > 256) {
                    Statics.field1048[var147] = Statics.field2049[var147];
                } else {
                    Statics.field1048[var147] = method1916(Statics.field2049[var147], Statics.field1152[var147], 256 - field1154);
                }
            }
        } else {
            for (int var148 = 0; var148 < 256; var148++) {
                Statics.field1048[var148] = Statics.field1152[var148];
            }
        }
        class320.method5603(field1144, 9, field1144 + 128, var145 + 7);
        Statics.field1146.method5709(field1144, 0);
        class320.method5573();
        int var149 = 0;
        int var150 = field1144 + Statics.field314.field3865 * 9;
        for (int var151 = 1; var151 < var145 - 1; var151++) {
            int var152 = (var145 - var151) * field1163[var151] / var145;
            int var153 = var152 + 22;
            if (var153 < 0) {
                var153 = 0;
            }
            var149 += var153;
            for (int var154 = var153; var154 < 128; var154++) {
                int var155 = Statics.field183[var149++];
                if (var155 == 0) {
                    var150++;
                } else {
                    int var157 = 256 - var155;
                    int var158 = Statics.field1048[var155];
                    int var159 = Statics.field314.field3863[var150];
                    Statics.field314.field3863[var150++] = ((var158 & 0xFF00FF) * var155 + (var159 & 0xFF00FF) * var157 & 0xFF00FF00) + ((var158 & 0xFF00) * var155 + (var159 & 0xFF00) * var157 & 0xFF0000) >> 8;
                }
            }
            var150 += Statics.field314.field3865 + var153 - 128;
        }
        class320.method5603(field1144 + 765 - 128, 9, field1144 + 765, var145 + 7);
        Statics.field1147.method5709(field1144 + 382, 0);
        class320.method5573();
        int var160 = 0;
        int var161 = field1144 + Statics.field314.field3865 * 9 + 24 + 637;
        for (int var162 = 1; var162 < var145 - 1; var162++) {
            int var163 = (var145 - var162) * field1163[var162] / var145;
            int var164 = 103 - var163;
            int var165 = var161 + var163;
            for (int var166 = 0; var166 < var164; var166++) {
                int var167 = Statics.field183[var160++];
                if (var167 == 0) {
                    var165++;
                } else {
                    int var169 = 256 - var167;
                    int var170 = Statics.field1048[var167];
                    int var171 = Statics.field314.field3863[var165];
                    Statics.field314.field3863[var165++] = ((var170 & 0xFF00FF) * var167 + (var171 & 0xFF00FF) * var169 & 0xFF00FF00) + ((var170 & 0xFF00) * var167 + (var171 & 0xFF00) * var169 & 0xFF0000) >> 8;
                }
            }
            var160 += 128 - var164;
            var161 = Statics.field314.field3865 - var164 - var163 + var165;
        }
        Statics.field1148[Statics.field436.field1036 ? 1 : 0].method5668(field1144 + 765 - 40, 463);
        if (client.field721 <= 5 || client.field786 != 0) {
            return;
        }
        if (Statics.field78 == null) {
            Statics.field78 = class325.method4639(Statics.field2003, "sl_button", "");
            return;
        }
        int var172 = field1144 + 5;
        short var173 = 463;
        byte var174 = 100;
        byte var175 = 35;
        Statics.field78.method5668(var172, var173);
        arg0.method5422(class240.field3024 + " " + client.field692, var174 / 2 + var172, var175 / 2 + var173 - 2, 16777215, 0);
        if (Statics.field1011 == null) {
            arg1.method5422(class240.field3150, var174 / 2 + var172, var175 / 2 + var173 + 12, 16777215, 0);
        } else {
            arg1.method5422(class240.field3149, var174 / 2 + var172, var175 / 2 + var173 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("gs.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3702(String arg0, String arg1, String arg2) {
        field1166 = arg0;
        field1167 = arg1;
        field1168 = arg2;
    }

    @ObfuscatedName("ce.d(IIII)I")
    public static final int method1916(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("eg.j(Lbe;I)V")
    public static void method3068(class67 arg0) {
        if (arg0.method1577() != client.field648) {
            client.field648 = arg0.method1577();
            boolean var1 = arg0.method1577();
            if (Statics.field2649 != var1) {
                class272.method2067();
                Statics.field2649 = var1;
            }
        }
        Statics.field80 = arg0.field1020;
        client.field692 = arg0.field1016;
        client.field661 = arg0.field1009;
        Statics.field1929 = client.field646 == 0 ? 43594 : arg0.field1016 + 40000;
        Statics.field24 = client.field646 == 0 ? 443 : arg0.field1016 + 50000;
        Statics.field1948 = Statics.field1929;
    }

    @ObfuscatedName("w.x(I)V")
    public static void method90() {
        if (class67.method122()) {
            field1177 = true;
        }
    }
}
