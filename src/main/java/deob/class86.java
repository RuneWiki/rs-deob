package deob;

import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("cq")
public class class86 {

    @ObfuscatedName("cq.e")
    public static int field1209 = 0;

    @ObfuscatedName("cq.t")
    public static int field1188 = field1209 + 202;

    @ObfuscatedName("cq.o")
    public static int field1189 = 10;

    @ObfuscatedName("cq.n")
    public static String field1190 = "";

    @ObfuscatedName("cq.aw")
    public static int field1183 = -1;

    @ObfuscatedName("cq.ar")
    public static int field1213 = 1;

    @ObfuscatedName("cq.ao")
    public static int field1210 = 0;

    @ObfuscatedName("cq.aj")
    public static String field1198 = "";

    @ObfuscatedName("cq.at")
    public static String field1211 = "";

    @ObfuscatedName("cq.ac")
    public static String field1196 = "";

    @ObfuscatedName("cq.ap")
    public static String field1197 = "";

    @ObfuscatedName("cq.aq")
    public static String field1181 = "";

    @ObfuscatedName("cq.aa")
    public static String field1199 = "";

    @ObfuscatedName("cq.ay")
    public static boolean field1200 = false;

    @ObfuscatedName("cq.af")
    public static boolean field1185 = false;

    @ObfuscatedName("cq.bz")
    public static boolean field1202 = true;

    @ObfuscatedName("cq.bi")
    public static int field1203 = 0;

    @ObfuscatedName("cq.bg")
    public static String field1192 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cq.bh")
    public static String field1205 = "1234567890";

    @ObfuscatedName("cq.bn")
    public static boolean field1206 = false;

    @ObfuscatedName("cq.bd")
    public static int field1208 = -1;

    @ObfuscatedName("cq.by")
    public static int field1191 = 0;

    @ObfuscatedName("cq.bt")
    public static int field1187 = 0;

    @ObfuscatedName("cq.bq")
    public static long field1194;

    @ObfuscatedName("cq.bu")
    public static long field1212;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1194 = -1L;
        field1212 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.q(I)I")
    public static int method983() {
        return 11;
    }

    @ObfuscatedName("ks.w(Lhp;Lhp;ZII)V")
    public static void method5421(class234 arg0, class234 arg1, boolean arg2, int arg3) {
        if (!Statics.field1180) {
            field1210 = arg3;
            class322.method5549();
            byte[] var4 = arg0.method3794("title.jpg", "");
            Statics.field24 = class50.method3146(var4);
            Statics.field1136 = Statics.field24.method5632();
            if ((client.field654 & 0x20000000) == 0) {
                Statics.field1244 = class327.method3658(arg1, "logo", "");
            } else {
                Statics.field1244 = class327.method3658(arg1, "logo_deadman_mode", "");
            }
            Statics.field1195 = class327.method3658(arg1, "titlebox", "");
            Statics.field3208 = class327.method3658(arg1, "titlebutton", "");
            int var5 = arg1.method3791("runes");
            int var6 = arg1.method3792(var5, "");
            class325[] var7 = Statics.method4862(arg1, var5, var6);
            Statics.field1182 = var7;
            int var8 = arg1.method3791("title_mute");
            int var9 = arg1.method3792(var8, "");
            class325[] var10 = Statics.method4862(arg1, var8, var9);
            Statics.field1184 = var10;
            Statics.field1179 = class327.method3658(arg1, "options_radio_buttons,0", "");
            Statics.field607 = class327.method3658(arg1, "options_radio_buttons,4", "");
            Statics.field1467 = class327.method3658(arg1, "options_radio_buttons,2", "");
            Statics.field1186 = class327.method3658(arg1, "options_radio_buttons,6", "");
            Statics.field3192 = Statics.field1179.field3898;
            Statics.field213 = Statics.field1179.field3894;
            Statics.field3632 = new class73(Statics.field1182);
            if (arg2) {
                field1181 = "";
                field1199 = "";
            }
            Statics.field66 = 0;
            Statics.field329 = "";
            field1202 = true;
            field1206 = false;
            if (Statics.field118.field1064) {
                class198.method612(2);
            } else {
                class198.method477(2, Statics.field254, "scape main", "", 255, false);
            }
            if (Statics.field3177 != null) {
                try {
                    class301 var11 = new class301(4);
                    var11.method5228(3);
                    var11.method5053(0);
                    Statics.field3177.method3210(var11.field3731, 0, 4);
                } catch (IOException var15) {
                    try {
                        Statics.field3177.method3204();
                    } catch (Exception var14) {
                    }
                    class237.field3179++;
                    Statics.field3177 = null;
                }
            }
            Statics.field1180 = true;
            field1209 = (Statics.field47 - 765) / 2;
            field1188 = field1209 + 202;
            Statics.field586 = field1188 + 180;
            Statics.field24.method5641(field1209, 0);
            Statics.field1136.method5641(field1209 + 382, 0);
            Statics.field1244.method5621(field1209 + 382 - Statics.field1244.field3898 / 2, 18);
        } else if (arg3 == 4) {
            field1210 = 4;
        }
    }

    @ObfuscatedName("ay.e(S)V")
    public static void method677() {
        if (field1181 != null && field1181.length() > 0) {
            return;
        }
        if (Statics.field118.field1066 == null) {
            client.field692 = false;
        } else {
            field1181 = Statics.field118.field1066;
            client.field692 = true;
        }
    }

    @ObfuscatedName("ia.p(Lbz;I)V")
    public static void method4101(class54 arg0) {
        if (field1206) {
            while (true) {
                if (!class46.method3746()) {
                    if (class55.field494 != 1 && (Statics.field414 || class55.field494 != 4)) {
                        break;
                    }
                    int var1 = field1209 + 280;
                    if (class55.field484 >= var1 && class55.field484 <= var1 + 14 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(0, 0);
                        break;
                    }
                    if (class55.field484 >= var1 + 15 && class55.field484 <= var1 + 80 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(0, 1);
                        break;
                    }
                    int var2 = field1209 + 390;
                    if (class55.field484 >= var2 && class55.field484 <= var2 + 14 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(1, 0);
                        break;
                    }
                    if (class55.field484 >= var2 + 15 && class55.field484 <= var2 + 80 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(1, 1);
                        break;
                    }
                    int var3 = field1209 + 500;
                    if (class55.field484 >= var3 && class55.field484 <= var3 + 14 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(2, 0);
                        break;
                    }
                    if (class55.field484 >= var3 + 15 && class55.field484 <= var3 + 80 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(2, 1);
                        break;
                    }
                    int var4 = field1209 + 610;
                    if (class55.field484 >= var4 && class55.field484 <= var4 + 14 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(3, 0);
                        break;
                    }
                    if (class55.field484 >= var4 + 15 && class55.field484 <= var4 + 80 && class55.field496 >= 4 && class55.field496 <= 18) {
                        class72.method3351(3, 1);
                        break;
                    }
                    if (class55.field484 >= field1209 + 708 && class55.field496 >= 4 && class55.field484 <= field1209 + 708 + 50 && class55.field496 <= 20) {
                        field1206 = false;
                        Statics.field24.method5641(field1209, 0);
                        Statics.field1136.method5641(field1209 + 382, 0);
                        Statics.field1244.method5621(field1209 + 382 - Statics.field1244.field3898 / 2, 18);
                        break;
                    }
                    if (field1208 == -1) {
                        if (field1191 > 0 && Statics.field1207 != null && class55.field484 >= 0 && class55.field484 <= Statics.field1207.field3898 && class55.field496 >= Statics.field3309 / 2 - 50 && class55.field496 <= Statics.field3309 / 2 + 50) {
                            field1191--;
                        }
                        if (field1191 < field1187 && Statics.field3491 != null && class55.field484 >= Statics.field47 - Statics.field3491.field3898 - 5 && class55.field484 <= Statics.field47 && class55.field496 >= Statics.field3309 / 2 - 50 && class55.field496 <= Statics.field3309 / 2 + 50) {
                            field1191++;
                        }
                    } else {
                        class72 var5 = Statics.field1032[field1208];
                        method3552(var5);
                        field1206 = false;
                        Statics.field24.method5641(field1209, 0);
                        Statics.field1136.method5641(field1209 + 382, 0);
                        Statics.field1244.method5621(field1209 + 382 - Statics.field1244.field3898 / 2, 18);
                    }
                    break;
                }
                if (Statics.field1339 == 13) {
                    field1206 = false;
                    Statics.field24.method5641(field1209, 0);
                    Statics.field1136.method5641(field1209 + 382, 0);
                    Statics.field1244.method5621(field1209 + 382 - Statics.field1244.field3898 / 2, 18);
                    break;
                }
                if (Statics.field1339 == 96) {
                    if (field1191 > 0 && Statics.field1207 != null) {
                        field1191--;
                    }
                } else if (Statics.field1339 == 97 && field1191 < field1187 && Statics.field3491 != null) {
                    field1191++;
                }
            }
            return;
        }
        if ((class55.field494 == 1 || !Statics.field414 && class55.field494 == 4) && class55.field484 >= field1209 + 765 - 50 && class55.field496 >= 453) {
            Statics.field118.field1064 = !Statics.field118.field1064;
            class74.method2072();
            if (Statics.field118.field1064) {
                class198.method3235();
            } else {
                class198.method2504(Statics.field254, "scape main", "", 255, false);
            }
        }
        if (client.field663 == 5) {
            return;
        }
        if (field1194 == -1L) {
            field1194 = class298.method3576() + 1000L;
        }
        long var6 = class298.method3576();
        if (client.method3344() && field1212 == -1L) {
            field1212 = var6;
            if (field1212 > field1194) {
                field1194 = field1212;
            }
        }
        if (client.field663 != 10 && client.field663 != 11) {
            return;
        }
        if (Statics.field529 == class191.field2349) {
            if (class55.field494 == 1 || !Statics.field414 && class55.field494 == 4) {
                int var8 = field1209 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class55.field484 >= var8 && class55.field484 <= var8 + var10 && class55.field496 >= var9 && class55.field496 <= var9 + var11) {
                    method2018();
                    return;
                }
            }
            if (Statics.field1028 != null) {
                method2018();
            }
        }
        int var12 = class55.field494;
        int var13 = class55.field484;
        int var14 = class55.field496;
        if (var12 == 0) {
            var13 = class55.field493;
            var14 = class55.field488;
        }
        if (!Statics.field414 && var12 == 4) {
            var12 = 1;
        }
        if (field1210 == 0) {
            boolean var15 = false;
            while (class46.method3746()) {
                if (Statics.field1339 == 84) {
                    var15 = true;
                }
            }
            int var16 = Statics.field586 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class52.method36(client.method3343("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = Statics.field586 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field654 & 0x2000000) != 0) {
                    field1198 = "";
                    field1211 = class225.field2985;
                    field1196 = class225.field2986;
                    field1197 = class225.field2973;
                    field1210 = 1;
                    if (client.field692 && field1181 != null && field1181.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                } else if ((client.field654 & 0x4) != 0) {
                    if ((client.field654 & 0x400) == 0) {
                        field1211 = class225.field2821;
                        field1196 = class225.field2977;
                        field1197 = class225.field2885;
                    } else {
                        field1211 = class225.field2982;
                        field1196 = class225.field2896;
                        field1197 = class225.field2984;
                    }
                    field1198 = class225.field2975;
                    field1210 = 1;
                    if (client.field692 && field1181 != null && field1181.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                } else if ((client.field654 & 0x400) == 0) {
                    method3000(false);
                } else {
                    field1211 = class225.field2979;
                    field1196 = class225.field2843;
                    field1197 = class225.field2918;
                    field1198 = class225.field2975;
                    field1210 = 1;
                    if (client.field692 && field1181 != null && field1181.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                }
            }
        } else if (field1210 == 1) {
            while (class46.method3746()) {
                if (Statics.field1339 == 84) {
                    method3000(false);
                } else if (Statics.field1339 == 13) {
                    field1210 = 0;
                }
            }
            int var19 = Statics.field586 - 80;
            short var20 = 321;
            if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                method3000(false);
            }
            int var21 = Statics.field586 + 80;
            if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                field1210 = 0;
            }
        } else if (field1210 == 2) {
            short var22 = 201;
            int var64 = var22 + 52;
            if (var12 == 1 && var14 >= var64 - 12 && var14 < var64 + 2) {
                field1203 = 0;
            }
            var64 += 15;
            if (var12 == 1 && var14 >= var64 - 12 && var14 < var64 + 2) {
                field1203 = 1;
            }
            var64 += 15;
            short var23 = 361;
            if (Statics.field1326 != null) {
                int var24 = Statics.field1326.field3866 / 2;
                if (var12 == 1 && var13 >= Statics.field1326.field3864 - var24 && var13 <= Statics.field1326.field3864 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(field1213) {
                        case 1:
                            method4603(class225.field3024, class225.field2991, class225.field2959);
                            field1210 = 5;
                            return;
                        case 2:
                            class52.method36("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = Statics.field586 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1181 = field1181.trim();
                if (field1181.length() == 0) {
                    method4603(class225.field2838, class225.field2878, class225.field2893);
                    return;
                }
                if (field1199.length() == 0) {
                    method4603(class225.field2880, class225.field2881, class225.field2987);
                    return;
                }
                method4603(class225.field2990, class225.field2800, class225.field2992);
                client.method85(false);
                Statics.method2069(20);
                return;
            }
            int var27 = field1188 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                field1210 = 0;
                field1181 = "";
                field1199 = "";
                Statics.field66 = 0;
                Statics.field329 = "";
                field1202 = true;
            }
            int var28 = Statics.field586 + -117;
            short var29 = 277;
            field1200 = var13 >= var28 && var13 < Statics.field3192 + var28 && var14 >= var29 && var14 < Statics.field213 + var29;
            if (var12 == 1 && field1200) {
                client.field692 = !client.field692;
                if (!client.field692 && Statics.field118.field1066 != null) {
                    Statics.field118.field1066 = null;
                    class74.method2072();
                }
            }
            int var30 = Statics.field586 + 24;
            short var31 = 277;
            field1185 = var13 >= var30 && var13 < Statics.field3192 + var30 && var14 >= var31 && var14 < Statics.field213 + var31;
            if (var12 == 1 && field1185) {
                Statics.field118.field1067 = !Statics.field118.field1067;
                if (!Statics.field118.field1067) {
                    field1181 = "";
                    Statics.field118.field1066 = null;
                    if (client.field692 && field1181 != null && field1181.length() > 0) {
                        field1203 = 1;
                    } else {
                        field1203 = 0;
                    }
                }
                class74.method2072();
            }
            while (true) {
                while (class46.method3746()) {
                    boolean var32 = false;
                    for (int var33 = 0; var33 < field1192.length(); var33++) {
                        if (Statics.field2509 == field1192.charAt(var33)) {
                            var32 = true;
                            break;
                        }
                    }
                    if (Statics.field1339 == 13) {
                        field1210 = 0;
                        field1181 = "";
                        field1199 = "";
                        Statics.field66 = 0;
                        Statics.field329 = "";
                        field1202 = true;
                    } else if (field1203 == 0) {
                        if (Statics.field1339 == 85 && field1181.length() > 0) {
                            field1181 = field1181.substring(0, field1181.length() - 1);
                        }
                        if (Statics.field1339 == 84 || Statics.field1339 == 80) {
                            field1203 = 1;
                        }
                        if (var32 && field1181.length() < 320) {
                            field1181 = field1181 + Statics.field2509;
                        }
                    } else if (field1203 == 1) {
                        if (Statics.field1339 == 85 && field1199.length() > 0) {
                            field1199 = field1199.substring(0, field1199.length() - 1);
                        }
                        if (Statics.field1339 == 84 || Statics.field1339 == 80) {
                            field1203 = 0;
                        }
                        if (Statics.field1339 == 84) {
                            field1181 = field1181.trim();
                            if (field1181.length() == 0) {
                                method4603(class225.field2838, class225.field2878, class225.field2893);
                                return;
                            }
                            if (field1199.length() == 0) {
                                method4603(class225.field2880, class225.field2881, class225.field2987);
                                return;
                            }
                            method4603(class225.field2990, class225.field2800, class225.field2992);
                            client.method85(false);
                            Statics.method2069(20);
                            return;
                        }
                        if (var32 && field1199.length() < 20) {
                            field1199 = field1199 + Statics.field2509;
                        }
                    }
                }
                return;
            }
        } else if (field1210 == 3) {
            int var34 = field1188 + 180;
            short var35 = 276;
            if (var12 == 1 && var13 >= var34 - 75 && var13 <= var34 + 75 && var14 >= var35 - 20 && var14 <= var35 + 20) {
                method3000(false);
            }
            int var36 = field1188 + 180;
            short var37 = 326;
            if (var12 == 1 && var13 >= var36 - 75 && var13 <= var36 + 75 && var14 >= var37 - 20 && var14 <= var37 + 20) {
                method4603(class225.field3024, class225.field2991, class225.field2959);
                field1210 = 5;
                return;
            }
        } else if (field1210 == 4) {
            int var38 = field1188 + 180 - 80;
            short var39 = 321;
            if (var12 == 1 && var13 >= var38 - 75 && var13 <= var38 + 75 && var14 >= var39 - 20 && var14 <= var39 + 20) {
                Statics.field329.trim();
                if (Statics.field329.length() != 6) {
                    method4603(class225.field2796, class225.field2797, class225.field2798);
                    return;
                }
                Statics.field66 = Integer.parseInt(Statics.field329);
                Statics.field329 = "";
                client.method85(true);
                method4603(class225.field2990, class225.field2800, class225.field2992);
                Statics.method2069(20);
                return;
            }
            if (var12 == 1 && var13 >= field1188 + 180 - 9 && var13 <= field1188 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                field1202 = !field1202;
            }
            if (var12 == 1 && var13 >= field1188 + 180 - 34 && var13 <= field1188 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class52.method36(client.method3343("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var40 = field1188 + 180 + 80;
            if (var12 == 1 && var13 >= var40 - 75 && var13 <= var40 + 75 && var14 >= var39 - 20 && var14 <= var39 + 20) {
                field1210 = 0;
                field1181 = "";
                field1199 = "";
                Statics.field66 = 0;
                Statics.field329 = "";
            }
            while (class46.method3746()) {
                boolean var41 = false;
                for (int var42 = 0; var42 < field1205.length(); var42++) {
                    if (Statics.field2509 == field1205.charAt(var42)) {
                        var41 = true;
                        break;
                    }
                }
                if (Statics.field1339 == 13) {
                    field1210 = 0;
                    field1181 = "";
                    field1199 = "";
                    Statics.field66 = 0;
                    Statics.field329 = "";
                } else {
                    if (Statics.field1339 == 85 && Statics.field329.length() > 0) {
                        Statics.field329 = Statics.field329.substring(0, Statics.field329.length() - 1);
                    }
                    if (Statics.field1339 == 84) {
                        Statics.field329.trim();
                        if (Statics.field329.length() != 6) {
                            method4603(class225.field2796, class225.field2797, class225.field2798);
                            return;
                        }
                        Statics.field66 = Integer.parseInt(Statics.field329);
                        Statics.field329 = "";
                        client.method85(true);
                        method4603(class225.field2990, class225.field2800, class225.field2992);
                        Statics.method2069(20);
                        return;
                    }
                    if (var41 && Statics.field329.length() < 6) {
                        Statics.field329 = Statics.field329 + Statics.field2509;
                    }
                }
            }
        } else if (field1210 == 5) {
            int var43 = field1188 + 180 - 80;
            short var44 = 321;
            if (var12 == 1 && var13 >= var43 - 75 && var13 <= var43 + 75 && var14 >= var44 - 20 && var14 <= var44 + 20) {
                Statics.method3117();
                return;
            }
            int var45 = field1188 + 180 + 80;
            if (var12 == 1 && var13 >= var45 - 75 && var13 <= var45 + 75 && var14 >= var44 - 20 && var14 <= var44 + 20) {
                method3000(true);
            }
            short var46 = 361;
            if (Statics.field333 != null) {
                int var47 = Statics.field333.field3866 / 2;
                if (var12 == 1 && var13 >= Statics.field333.field3864 - var47 && var13 <= Statics.field333.field3864 + var47 && var14 >= var46 - 15 && var14 < var46) {
                    class52.method36(client.method3343("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method3746()) {
                boolean var48 = false;
                for (int var49 = 0; var49 < field1192.length(); var49++) {
                    if (Statics.field2509 == field1192.charAt(var49)) {
                        var48 = true;
                        break;
                    }
                }
                if (Statics.field1339 == 13) {
                    method3000(true);
                } else {
                    if (Statics.field1339 == 85 && field1181.length() > 0) {
                        field1181 = field1181.substring(0, field1181.length() - 1);
                    }
                    if (Statics.field1339 == 84) {
                        Statics.method3117();
                        return;
                    }
                    if (var48 && field1181.length() < 320) {
                        field1181 = field1181 + Statics.field2509;
                    }
                }
            }
        } else if (field1210 == 6) {
            while (true) {
                do {
                    if (!class46.method3746()) {
                        short var50 = 321;
                        if (var12 == 1 && var14 >= var50 - 20 && var14 <= var50 + 20) {
                            method3000(true);
                        }
                        return;
                    }
                } while (Statics.field1339 != 84 && Statics.field1339 != 13);
                method3000(true);
            }
        } else if (field1210 == 7) {
            int var51 = field1188 + 180 - 80;
            short var52 = 321;
            if (var12 == 1 && var13 >= var51 - 75 && var13 <= var51 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                class52.method36(client.method3343("secure", true) + "m=dob/set_dob.ws", true, false);
                method4603(class225.field2888, class225.field3022, class225.field3023);
                field1210 = 6;
                return;
            }
            int var53 = field1188 + 180 + 80;
            if (var12 == 1 && var13 >= var53 - 75 && var13 <= var53 + 75 && var14 >= var52 - 20 && var14 <= var52 + 20) {
                method3000(true);
            }
        } else if (field1210 == 8) {
            int var54 = field1188 + 180 - 80;
            short var55 = 321;
            if (var12 == 1 && var13 >= var54 - 75 && var13 <= var54 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                class52.method36("https://www.jagex.com/terms/privacy/#eight", true, false);
                method4603(class225.field2888, class225.field3022, class225.field3023);
                field1210 = 6;
                return;
            }
            int var56 = field1188 + 180 + 80;
            if (var12 == 1 && var13 >= var56 - 75 && var13 <= var56 + 75 && var14 >= var55 - 20 && var14 <= var55 + 20) {
                method3000(true);
            }
        } else if (field1210 == 12) {
            String var57 = "";
            switch(field1183) {
                case 0:
                    var57 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var57 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method3000(false);
            }
            int var58 = field1188 + 180;
            short var59 = 276;
            if (var12 == 1 && var13 >= var58 - 75 && var13 <= var58 + 75 && var14 >= var59 - 20 && var14 <= var59 + 20) {
                class52.method36(var57, true, false);
                method4603(class225.field2888, class225.field3022, class225.field3023);
                field1210 = 6;
                return;
            }
            int var60 = field1188 + 180;
            short var61 = 326;
            if (var12 == 1 && var13 >= var60 - 75 && var13 <= var60 + 75 && var14 >= var61 - 20 && var14 <= var61 + 20) {
                method3000(false);
            }
        } else if (field1210 == 24) {
            int var62 = field1188 + 180;
            short var63 = 301;
            if (var12 == 1 && var13 >= var62 - 75 && var13 <= var62 + 75 && var14 >= var63 - 20 && var14 <= var63 + 20) {
                method3000(false);
            }
        }
    }

    @ObfuscatedName("en.k(ZI)V")
    public static void method3000(boolean arg0) {
        field1211 = class225.field2972;
        field1196 = class225.field2981;
        field1197 = class225.field2974;
        field1210 = 2;
        if (arg0) {
            field1199 = "";
        }
        method677();
        if (client.field692 && field1181 != null && field1181.length() > 0) {
            field1203 = 1;
        } else {
            field1203 = 0;
        }
    }

    @ObfuscatedName("ge.b(Lke;Lke;Lke;B)V")
    public static void method3333(class296 arg0, class296 arg1, class296 arg2) {
        field1209 = (Statics.field47 - 765) / 2;
        field1188 = field1209 + 202;
        Statics.field586 = field1188 + 180;
        if (field1206) {
            Statics.method3322(arg0, arg1);
            return;
        }
        Statics.field24.method5641(field1209, 0);
        Statics.field1136.method5641(field1209 + 382, 0);
        Statics.field1244.method5621(field1209 + 382 - Statics.field1244.field3898 / 2, 18);
        if (client.field663 == 0 || client.field663 == 5) {
            byte var3 = 20;
            arg0.method4922(class225.field2971, field1188 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class322.method5535(field1188 + 180 - 152, var4, 304, 34, 9179409);
            class322.method5535(field1188 + 180 - 151, var4 + 1, 302, 32, 0);
            class322.method5539(field1188 + 180 - 150, var4 + 2, field1189 * 3, 30, 9179409);
            class322.method5539(field1189 * 3 + (field1188 + 180 - 150), var4 + 2, 300 - field1189 * 3, 30, 0);
            arg0.method4922(field1190, field1188 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field663 == 20) {
            Statics.field1195.method5621(field1188 + 180 - Statics.field1195.field3898 / 2, 271 - Statics.field1195.field3894 / 2);
            short var5 = 201;
            arg0.method4922(field1211, field1188 + 180, var5, 16776960, 0);
            int var85 = var5 + 15;
            arg0.method4922(field1196, field1188 + 180, var85, 16776960, 0);
            int var86 = var85 + 15;
            arg0.method4922(field1197, field1188 + 180, var86, 16776960, 0);
            int var87 = var86 + 15;
            int var88 = var87 + 7;
            if (field1210 != 4) {
                arg0.method4927(class225.field2999, field1188 + 180 - 110, var88, 16777215, 0);
                short var6 = 200;
                String var7 = Statics.field118.field1067 ? class292.method3291(field1181) : field1181;
                String var8;
                for (var8 = var7; arg0.method4990(var8) > var6; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4927(class297.method4941(var8), field1188 + 180 - 70, var88, 16777215, 0);
                var85 = var88 + 15;
                arg0.method4927(class225.field2960 + class292.method3291(field1199), field1188 + 180 - 108, var85, 16777215, 0);
                var85 += 15;
            }
        }
        if (client.field663 == 10 || client.field663 == 11) {
            Statics.field1195.method5621(field1188, 171);
            if (field1210 == 0) {
                short var9 = 251;
                arg0.method4922(class225.field3005, field1188 + 180, var9, 16776960, 0);
                int var89 = var9 + 30;
                int var10 = field1188 + 180 - 80;
                short var11 = 291;
                Statics.field3208.method5621(var10 - 73, var11 - 20);
                arg0.method4931(class225.field2879, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1188 + 180 + 80;
                Statics.field3208.method5621(var12 - 73, var11 - 20);
                arg0.method4931(class225.field3004, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1210 == 1) {
                arg0.method4922(field1198, field1188 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method4922(field1211, field1188 + 180, var13, 16777215, 0);
                int var90 = var13 + 15;
                arg0.method4922(field1196, field1188 + 180, var90, 16777215, 0);
                int var91 = var90 + 15;
                arg0.method4922(field1197, field1188 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                int var14 = field1188 + 180 - 80;
                short var15 = 321;
                Statics.field3208.method5621(var14 - 73, var15 - 20);
                arg0.method4922(class225.field2763, var14, var15 + 5, 16777215, 0);
                int var16 = field1188 + 180 + 80;
                Statics.field3208.method5621(var16 - 73, var15 - 20);
                arg0.method4922(class225.field2995, var16, var15 + 5, 16777215, 0);
            } else if (field1210 == 2) {
                short var17 = 201;
                arg0.method4922(field1211, Statics.field586, var17, 16776960, 0);
                int var93 = var17 + 15;
                arg0.method4922(field1196, Statics.field586, var93, 16776960, 0);
                int var94 = var93 + 15;
                arg0.method4922(field1197, Statics.field586, var94, 16776960, 0);
                int var95 = var94 + 15;
                int var96 = var95 + 7;
                arg0.method4927(class225.field2999, Statics.field586 - 110, var96, 16777215, 0);
                short var18 = 200;
                String var19 = Statics.field118.field1067 ? class292.method3291(field1181) : field1181;
                String var20;
                for (var20 = var19; arg0.method4990(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method4927(class297.method4941(var20) + (field1203 == 0 & client.field882 % 40 < 20 ? class82.method1591(16776960) + class82.field1150 : ""), Statics.field586 - 70, var96, 16777215, 0);
                var93 = var96 + 15;
                arg0.method4927(class225.field2960 + class292.method3291(field1199) + (field1203 == 1 & client.field882 % 40 < 20 ? class82.method1591(16776960) + class82.field1150 : ""), Statics.field586 - 108, var93, 16777215, 0);
                var93 += 15;
                short var21 = 277;
                int var22 = Statics.field586 + -117;
                boolean var23 = client.field692;
                boolean var24 = field1200;
                class325 var25 = var23 ? (var24 ? Statics.field1186 : Statics.field1467) : (var24 ? Statics.field607 : Statics.field1179);
                var25.method5621(var22, var21);
                int var27 = var25.field3898 + 5 + var22;
                arg1.method4927(class225.field3007, var27, var21 + 13, 16776960, 0);
                int var28 = Statics.field586 + 24;
                boolean var29 = Statics.field118.field1067;
                boolean var30 = field1185;
                class325 var31 = var29 ? (var30 ? Statics.field1186 : Statics.field1467) : (var30 ? Statics.field607 : Statics.field1179);
                var31.method5621(var28, var21);
                int var33 = var31.field3898 + 5 + var28;
                arg1.method4927(class225.field2883, var33, var21 + 13, 16776960, 0);
                int var97 = var21 + 15;
                int var34 = Statics.field586 - 80;
                short var35 = 321;
                Statics.field3208.method5621(var34 - 73, var35 - 20);
                arg0.method4922(class225.field2777, var34, var35 + 5, 16777215, 0);
                int var36 = Statics.field586 + 80;
                Statics.field3208.method5621(var36 - 73, var35 - 20);
                arg0.method4922(class225.field2995, var36, var35 + 5, 16777215, 0);
                short var37 = 357;
                switch(field1213) {
                    case 2:
                        Statics.field1987 = class225.field3020;
                        break;
                    default:
                        Statics.field1987 = class225.field3018;
                }
                Statics.field1326 = new class320(Statics.field586, var37, arg1.method4990(Statics.field1987), 11);
                Statics.field333 = new class320(Statics.field586, var37, arg1.method4990(class225.field2774), 11);
                arg1.method4922(Statics.field1987, Statics.field586, var37, 16777215, 0);
            } else if (field1210 == 3) {
                short var38 = 201;
                arg0.method4922(class225.field3009, field1188 + 180, var38, 16776960, 0);
                int var98 = var38 + 20;
                arg1.method4922(class225.field3010, field1188 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                arg1.method4922(class225.field3011, field1188 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                int var39 = field1188 + 180;
                short var40 = 276;
                Statics.field3208.method5621(var39 - 73, var40 - 20);
                arg2.method4922(class225.field3012, var39, var40 + 5, 16777215, 0);
                int var41 = field1188 + 180;
                short var42 = 326;
                Statics.field3208.method5621(var41 - 73, var42 - 20);
                arg2.method4922(class225.field3013, var41, var42 + 5, 16777215, 0);
            } else if (field1210 == 4) {
                arg0.method4922(class225.field2968, field1188 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method4922(field1211, field1188 + 180, var43, 16777215, 0);
                int var101 = var43 + 15;
                arg0.method4922(field1196, field1188 + 180, var101, 16777215, 0);
                int var102 = var101 + 15;
                arg0.method4922(field1197, field1188 + 180, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method4927(class225.field3001 + class292.method3291(Statics.field329) + (client.field882 % 40 < 20 ? class82.method1591(16776960) + class82.field1150 : ""), field1188 + 180 - 108, var103, 16777215, 0);
                int var104 = var103 - 8;
                arg0.method4927(class225.field2835, field1188 + 180 - 9, var104, 16776960, 0);
                int var105 = var104 + 15;
                arg0.method4927(class225.field2767, field1188 + 180 - 9, var105, 16776960, 0);
                int var44 = field1188 + 180 - 9 + arg0.method4990(class225.field2767) + 15;
                int var45 = var105 - arg0.field3710;
                class325 var46;
                if (field1202) {
                    var46 = Statics.field1467;
                } else {
                    var46 = Statics.field1179;
                }
                var46.method5621(var44, var45);
                var101 = var105 + 15;
                int var47 = field1188 + 180 - 80;
                short var48 = 321;
                Statics.field3208.method5621(var47 - 73, var48 - 20);
                arg0.method4922(class225.field2763, var47, var48 + 5, 16777215, 0);
                int var49 = field1188 + 180 + 80;
                Statics.field3208.method5621(var49 - 73, var48 - 20);
                arg0.method4922(class225.field2995, var49, var48 + 5, 16777215, 0);
                arg1.method4922(class225.field2989, field1188 + 180, var48 + 36, 255, 0);
            } else if (field1210 == 5) {
                arg0.method4922(class225.field3014, field1188 + 180, 201, 16776960, 0);
                short var50 = 221;
                arg2.method4922(field1211, field1188 + 180, var50, 16776960, 0);
                int var106 = var50 + 15;
                arg2.method4922(field1196, field1188 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                arg2.method4922(field1197, field1188 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                int var109 = var108 + 14;
                arg0.method4927(class225.field3015, field1188 + 180 - 145, var109, 16777215, 0);
                short var51 = 174;
                String var52 = Statics.field118.field1067 ? class292.method3291(field1181) : field1181;
                String var53;
                for (var53 = var52; arg0.method4990(var53) > var51; var53 = var53.substring(1)) {
                }
                arg0.method4927(class297.method4941(var53) + (client.field882 % 40 < 20 ? class82.method1591(16776960) + class82.field1150 : ""), field1188 + 180 - 34, var109, 16777215, 0);
                var106 = var109 + 15;
                int var54 = field1188 + 180 - 80;
                short var55 = 321;
                Statics.field3208.method5621(var54 - 73, var55 - 20);
                arg0.method4922(class225.field2869, var54, var55 + 5, 16777215, 0);
                int var56 = field1188 + 180 + 80;
                Statics.field3208.method5621(var56 - 73, var55 - 20);
                arg0.method4922(class225.field2860, var56, var55 + 5, 16777215, 0);
                short var57 = 356;
                arg1.method4922(class225.field2774, Statics.field586, var57, 268435455, 0);
            } else if (field1210 == 6) {
                short var58 = 201;
                arg0.method4922(field1211, field1188 + 180, var58, 16776960, 0);
                int var110 = var58 + 15;
                arg0.method4922(field1196, field1188 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method4922(field1197, field1188 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var59 = field1188 + 180;
                short var60 = 321;
                Statics.field3208.method5621(var59 - 73, var60 - 20);
                arg0.method4922(class225.field2860, var59, var60 + 5, 16777215, 0);
            } else if (field1210 == 7) {
                short var61 = 216;
                arg0.method4922(class225.field3045, field1188 + 180, var61, 16776960, 0);
                int var113 = var61 + 15;
                arg2.method4922(class225.field3051, field1188 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg2.method4922(class225.field3031, field1188 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var62 = field1188 + 180 - 80;
                short var63 = 321;
                Statics.field3208.method5621(var62 - 73, var63 - 20);
                arg0.method4922(class225.field2802, var62, var63 + 5, 16777215, 0);
                int var64 = field1188 + 180 + 80;
                Statics.field3208.method5621(var64 - 73, var63 - 20);
                arg0.method4922(class225.field2860, var64, var63 + 5, 16777215, 0);
            } else if (field1210 == 8) {
                short var65 = 216;
                arg0.method4922(class225.field2895, field1188 + 180, var65, 16776960, 0);
                int var116 = var65 + 15;
                arg2.method4922(class225.field3006, field1188 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg2.method4922(class225.field2897, field1188 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                int var66 = field1188 + 180 - 80;
                short var67 = 321;
                Statics.field3208.method5621(var66 - 73, var67 - 20);
                arg0.method4922(class225.field2898, var66, var67 + 5, 16777215, 0);
                int var68 = field1188 + 180 + 80;
                Statics.field3208.method5621(var68 - 73, var67 - 20);
                arg0.method4922(class225.field2860, var68, var67 + 5, 16777215, 0);
            } else if (field1210 == 12) {
                short var69 = 201;
                String var70 = "";
                String var71 = "";
                String var72 = "";
                switch(field1183) {
                    case 0:
                        var70 = class225.field2811;
                        var71 = class225.field2812;
                        var72 = class225.field2813;
                        break;
                    case 1:
                        var70 = class225.field2850;
                        var71 = class225.field2962;
                        var72 = class225.field2791;
                        break;
                    default:
                        method3000(false);
                }
                arg0.method4922(var70, field1188 + 180, var69, 16776960, 0);
                int var119 = var69 + 15;
                arg2.method4922(var71, field1188 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                arg2.method4922(var72, field1188 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                int var73 = field1188 + 180;
                short var74 = 276;
                Statics.field3208.method5621(var73 - 73, var74 - 20);
                arg0.method4922(class225.field2810, var73, var74 + 5, 16777215, 0);
                int var75 = field1188 + 180;
                short var76 = 326;
                Statics.field3208.method5621(var75 - 73, var76 - 20);
                arg0.method4922(class225.field2860, var75, var76 + 5, 16777215, 0);
            } else if (field1210 == 24) {
                short var77 = 221;
                arg0.method4922(field1211, field1188 + 180, var77, 16777215, 0);
                int var122 = var77 + 15;
                arg0.method4922(field1196, field1188 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method4922(field1197, field1188 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                int var78 = field1188 + 180;
                short var79 = 301;
                Statics.field3208.method5621(var78 - 73, var79 - 20);
                arg0.method4922(class225.field2946, var78, var79 + 5, 16777215, 0);
            }
        }
        if (client.field663 >= 10) {
            int[] var80 = new int[4];
            class322.method5526(var80);
            class322.method5524(field1209, 0, field1209 + 765, Statics.field3309);
            Statics.field3632.method1570(field1209 - 22, client.field882);
            Statics.field3632.method1570(field1209 + 765 + 22 - 128, client.field882);
            class322.method5540(var80);
        }
        Statics.field1184[Statics.field118.field1064 ? 1 : 0].method5621(field1209 + 765 - 40, 463);
        if (client.field663 <= 5 || Statics.field529 != class191.field2349) {
            return;
        }
        if (Statics.field265 == null) {
            Statics.field265 = class327.method3658(Statics.field684, "sl_button", "");
            return;
        }
        int var81 = field1209 + 5;
        short var82 = 463;
        byte var83 = 100;
        byte var84 = 35;
        Statics.field265.method5621(var81, var82);
        arg0.method4922(class225.field2823 + " " + client.field808, var83 / 2 + var81, var84 / 2 + var82 - 2, 16777215, 0);
        if (Statics.field1028 == null) {
            arg1.method4922(class225.field2836, var83 / 2 + var81, var84 / 2 + var82 + 12, 16777215, 0);
        } else {
            arg1.method4922(class225.field3058, var83 / 2 + var81, var84 / 2 + var82 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ji.i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4603(String arg0, String arg1, String arg2) {
        field1211 = arg0;
        field1196 = arg1;
        field1197 = arg2;
    }

    @ObfuscatedName("gq.u(Lbw;B)V")
    public static void method3552(class72 arg0) {
        if (arg0.method1515() != client.field656) {
            client.field656 = arg0.method1515();
            boolean var1 = arg0.method1515();
            if (Statics.field1869 != var1) {
                class255.field3408.method3042();
                class255.field3409.method3042();
                class255.field3446.method3042();
                Statics.field1869 = var1;
            }
        }
        Statics.field1069 = arg0.field1030;
        client.field808 = arg0.field1026;
        client.field654 = arg0.field1024;
        Statics.field2359 = client.field704 == 0 ? 43594 : arg0.field1026 + 40000;
        Statics.field1801 = client.field704 == 0 ? 443 : arg0.field1026 + 50000;
        Statics.field1267 = Statics.field2359;
    }

    @ObfuscatedName("bs.x(II)V")
    public static void method999(int arg0) {
        field1210 = 12;
        field1183 = arg0;
    }

    @ObfuscatedName("cs.r(B)V")
    public static void method2018() {
        if (class72.method3139()) {
            field1206 = true;
            field1191 = 0;
            field1187 = 0;
        }
    }

    @ObfuscatedName("bi.v(B)V")
    public static void method901() {
        field1210 = 24;
        method4603(class225.field3003, class225.field2994, class225.field3059);
    }

    @ObfuscatedName("hv.y(B)V")
    public static void method3627() {
        field1210 = 24;
        method4603(class225.field2980, class225.field2997, class225.field2998);
    }
}
