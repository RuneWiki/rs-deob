package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("ca")
public class class86 {

    @ObfuscatedName("ca.t")
    public static int field1152 = 0;

    @ObfuscatedName("ca.r")
    public static int field1158 = field1152 + 202;

    @ObfuscatedName("ca.w")
    public static int field1156 = 10;

    @ObfuscatedName("ca.m")
    public static String field1160 = "";

    @ObfuscatedName("ca.av")
    public static int field1157 = -1;

    @ObfuscatedName("ca.as")
    public static int field1162 = 1;

    @ObfuscatedName("ca.aj")
    public static int field1169 = 0;

    @ObfuscatedName("ca.ab")
    public static String field1161 = "";

    @ObfuscatedName("ca.af")
    public static String field1173 = "";

    @ObfuscatedName("ca.ak")
    public static String field1166 = "";

    @ObfuscatedName("ca.ay")
    public static String field1167 = "";

    @ObfuscatedName("ca.ae")
    public static String field1168 = "";

    @ObfuscatedName("ca.ah")
    public static String field1172 = "";

    @ObfuscatedName("ca.am")
    public static boolean field1170 = false;

    @ObfuscatedName("ca.aw")
    public static boolean field1171 = false;

    @ObfuscatedName("ca.bn")
    public static boolean field1184 = true;

    @ObfuscatedName("ca.bk")
    public static int field1181 = 0;

    @ObfuscatedName("ca.bp")
    public static String field1174 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ca.bu")
    public static String field1151 = "1234567890";

    @ObfuscatedName("ca.bv")
    public static boolean field1177 = false;

    @ObfuscatedName("ca.by")
    public static int field1178 = -1;

    @ObfuscatedName("ca.bh")
    public static int field1179 = 0;

    @ObfuscatedName("ca.bo")
    public static int field1180 = 0;

    @ObfuscatedName("ca.be")
    public static long field1163;

    @ObfuscatedName("ca.bl")
    public static long field1165;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1163 = -1L;
        field1165 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.c(B)I")
    public static int method498() {
        return 11;
    }

    @ObfuscatedName("ii.t(I)Ljava/lang/String;")
    public static String method3999() {
        String var2;
        if (Statics.field928.field1022) {
            String var0 = field1168;
            String var1 = class291.method4152('*', var0.length());
            var2 = var1;
        } else {
            var2 = field1168;
        }
        return var2;
    }

    @ObfuscatedName("kn.g(Lbn;I)V")
    public static void method4927(class54 arg0) {
        if (field1177) {
            while (true) {
                if (!class46.method4702()) {
                    if (class55.field469 != 1 && (Statics.field282 || class55.field469 != 4)) {
                        break;
                    }
                    int var1 = field1152 + 280;
                    if (class55.field470 >= var1 && class55.field470 <= var1 + 14 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(0, 0);
                        break;
                    }
                    if (class55.field470 >= var1 + 15 && class55.field470 <= var1 + 80 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(0, 1);
                        break;
                    }
                    int var2 = field1152 + 390;
                    if (class55.field470 >= var2 && class55.field470 <= var2 + 14 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(1, 0);
                        break;
                    }
                    if (class55.field470 >= var2 + 15 && class55.field470 <= var2 + 80 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(1, 1);
                        break;
                    }
                    int var3 = field1152 + 500;
                    if (class55.field470 >= var3 && class55.field470 <= var3 + 14 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(2, 0);
                        break;
                    }
                    if (class55.field470 >= var3 + 15 && class55.field470 <= var3 + 80 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(2, 1);
                        break;
                    }
                    int var4 = field1152 + 610;
                    if (class55.field470 >= var4 && class55.field470 <= var4 + 14 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(3, 0);
                        break;
                    }
                    if (class55.field470 >= var4 + 15 && class55.field470 <= var4 + 80 && class55.field460 >= 4 && class55.field460 <= 18) {
                        class72.method463(3, 1);
                        break;
                    }
                    if (class55.field470 >= field1152 + 708 && class55.field460 >= 4 && class55.field470 <= field1152 + 708 + 50 && class55.field460 <= 20) {
                        method1106();
                        break;
                    }
                    if (field1178 == -1) {
                        if (field1179 > 0 && Statics.field6 != null && class55.field470 >= 0 && class55.field470 <= Statics.field6.field3865 && class55.field460 >= Statics.field434 / 2 - 50 && class55.field460 <= Statics.field434 / 2 + 50) {
                            field1179--;
                        }
                        if (field1179 < field1180 && Statics.field177 != null && class55.field470 >= Statics.field3796 - Statics.field177.field3865 - 5 && class55.field470 <= Statics.field3796 && class55.field460 >= Statics.field434 / 2 - 50 && class55.field460 <= Statics.field434 / 2 + 50) {
                            field1179++;
                        }
                    } else {
                        class72 var5 = Statics.field988[field1178];
                        method2109(var5);
                        method1106();
                    }
                    break;
                }
                if (Statics.field362 == 13) {
                    method1106();
                    break;
                }
                if (Statics.field362 == 96) {
                    if (field1179 > 0 && Statics.field6 != null) {
                        field1179--;
                    }
                } else if (Statics.field362 == 97 && field1179 < field1180 && Statics.field177 != null) {
                    field1179++;
                }
            }
            return;
        }
        if ((class55.field469 == 1 || !Statics.field282 && class55.field469 == 4) && class55.field470 >= field1152 + 765 - 50 && class55.field460 >= 453) {
            Statics.field928.field1025 = !Statics.field928.field1025;
            class74.method5046();
            if (Statics.field928.field1025) {
                Statics.field2376.method3422();
                class198.field2377 = 1;
                Statics.field2373 = null;
            } else {
                class198.method3137(Statics.field202, "scape main", "", 255, false);
            }
        }
        if (client.field631 == 5) {
            return;
        }
        if (field1163 == -1L) {
            field1163 = Statics.method2303() + 1000L;
        }
        long var6 = Statics.method2303();
        boolean var9;
        if (client.field637 == null || client.field895 >= client.field637.size()) {
            var9 = true;
        } else {
            while (true) {
                if (client.field895 >= client.field637.size()) {
                    var9 = true;
                    break;
                }
                class59 var8 = (class59) client.field637.get(client.field895);
                if (!var8.method969()) {
                    var9 = false;
                    break;
                }
                client.field895++;
            }
        }
        if (var9 && field1165 == -1L) {
            field1165 = var6;
            if (field1165 > field1163) {
                field1163 = field1165;
            }
        }
        if (client.field631 != 10 && client.field631 != 11) {
            return;
        }
        if (Statics.field361 == class191.field2327) {
            if (class55.field469 == 1 || !Statics.field282 && class55.field469 == 4) {
                int var10 = field1152 + 5;
                short var11 = 463;
                byte var12 = 100;
                byte var13 = 35;
                if (class55.field470 >= var10 && class55.field470 <= var10 + var12 && class55.field460 >= var11 && class55.field460 <= var11 + var13) {
                    if (class72.method3337()) {
                        field1177 = true;
                        field1179 = 0;
                        field1180 = 0;
                    }
                    return;
                }
            }
            if (Statics.field2078 != null && class72.method3337()) {
                field1177 = true;
                field1179 = 0;
                field1180 = 0;
            }
        }
        int var14 = class55.field469;
        int var15 = class55.field470;
        int var16 = class55.field460;
        if (var14 == 0) {
            var15 = class55.field462;
            var16 = class55.field463;
        }
        if (!Statics.field282 && var14 == 4) {
            var14 = 1;
        }
        if (field1169 == 0) {
            boolean var17 = false;
            while (class46.method4702()) {
                if (Statics.field362 == 84) {
                    var17 = true;
                }
            }
            int var18 = Statics.field3211 - 80;
            short var19 = 291;
            if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                class52.method183(client.method53("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var20 = Statics.field3211 + 80;
            if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                if ((client.field760 & 0x2000000) != 0) {
                    field1161 = "";
                    field1173 = class225.field2871;
                    field1166 = class225.field2968;
                    field1167 = class225.field2969;
                    field1169 = 1;
                    if (client.field661 && field1168 != null && field1168.length() > 0) {
                        field1181 = 1;
                    } else {
                        field1181 = 0;
                    }
                } else if ((client.field760 & 0x4) != 0) {
                    if ((client.field760 & 0x400) == 0) {
                        field1173 = class225.field2958;
                        field1166 = class225.field2863;
                        field1167 = class225.field2960;
                    } else {
                        field1173 = class225.field2987;
                        field1166 = class225.field2932;
                        field1167 = class225.field2966;
                    }
                    field1161 = class225.field2833;
                    field1169 = 1;
                    if (client.field661 && field1168 != null && field1168.length() > 0) {
                        field1181 = 1;
                    } else {
                        field1181 = 0;
                    }
                } else if ((client.field760 & 0x400) == 0) {
                    method464(false);
                } else {
                    field1173 = class225.field2961;
                    field1166 = class225.field2962;
                    field1167 = class225.field3020;
                    field1161 = class225.field2833;
                    field1169 = 1;
                    if (client.field661 && field1168 != null && field1168.length() > 0) {
                        field1181 = 1;
                    } else {
                        field1181 = 0;
                    }
                }
            }
        } else if (field1169 == 1) {
            while (class46.method4702()) {
                if (Statics.field362 == 84) {
                    method464(false);
                } else if (Statics.field362 == 13) {
                    field1169 = 0;
                }
            }
            int var21 = Statics.field3211 - 80;
            short var22 = 321;
            if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                method464(false);
            }
            int var23 = Statics.field3211 + 80;
            if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                field1169 = 0;
            }
        } else if (field1169 == 2) {
            short var24 = 201;
            int var66 = var24 + 52;
            if (var14 == 1 && var16 >= var66 - 12 && var16 < var66 + 2) {
                field1181 = 0;
            }
            var66 += 15;
            if (var14 == 1 && var16 >= var66 - 12 && var16 < var66 + 2) {
                field1181 = 1;
            }
            var66 += 15;
            short var25 = 361;
            if (Statics.field2370 != null) {
                int var26 = Statics.field2370.field3835 / 2;
                if (var14 == 1 && var15 >= Statics.field2370.field3833 - var26 && var15 <= Statics.field2370.field3833 + var26 && var16 >= var25 - 15 && var16 < var25) {
                    switch(field1162) {
                        case 1:
                            method693(class225.field3006, class225.field3019, class225.field3008);
                            field1169 = 5;
                            return;
                        case 2:
                            class52.method183("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var27 = Statics.field3211 - 80;
            short var28 = 321;
            if (var14 == 1 && var15 >= var27 - 75 && var15 <= var27 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1168 = field1168.trim();
                if (field1168.length() == 0) {
                    method693(class225.field2859, class225.field2860, class225.field2813);
                    return;
                }
                if (field1172.length() == 0) {
                    method693(class225.field2949, class225.field2763, class225.field3013);
                    return;
                }
                method693(class225.field2762, class225.field2922, class225.field2974);
                client.method2087(false);
                client.method178(20);
                return;
            }
            int var29 = field1158 + 180 + 80;
            if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1169 = 0;
                field1168 = "";
                field1172 = "";
                Statics.field2730 = 0;
                Statics.field1125 = "";
                field1184 = true;
            }
            int var30 = Statics.field3211 + -117;
            short var31 = 277;
            field1170 = var15 >= var30 && var15 < Statics.field18 + var30 && var16 >= var31 && var16 < Statics.field3525 + var31;
            if (var14 == 1 && field1170) {
                client.field661 = !client.field661;
                if (!client.field661 && Statics.field928.field1027 != null) {
                    Statics.field928.field1027 = null;
                    class74.method5046();
                }
            }
            int var32 = Statics.field3211 + 24;
            short var33 = 277;
            field1171 = var15 >= var32 && var15 < Statics.field18 + var32 && var16 >= var33 && var16 < Statics.field3525 + var33;
            if (var14 == 1 && field1171) {
                Statics.field928.field1022 = !Statics.field928.field1022;
                if (!Statics.field928.field1022) {
                    field1168 = "";
                    Statics.field928.field1027 = null;
                    if (client.field661 && field1168 != null && field1168.length() > 0) {
                        field1181 = 1;
                    } else {
                        field1181 = 0;
                    }
                }
                class74.method5046();
            }
            while (true) {
                while (class46.method4702()) {
                    boolean var34 = false;
                    for (int var35 = 0; var35 < field1174.length(); var35++) {
                        if (Statics.field127 == field1174.charAt(var35)) {
                            var34 = true;
                            break;
                        }
                    }
                    if (Statics.field362 == 13) {
                        field1169 = 0;
                        field1168 = "";
                        field1172 = "";
                        Statics.field2730 = 0;
                        Statics.field1125 = "";
                        field1184 = true;
                    } else if (field1181 == 0) {
                        if (Statics.field362 == 85 && field1168.length() > 0) {
                            field1168 = field1168.substring(0, field1168.length() - 1);
                        }
                        if (Statics.field362 == 84 || Statics.field362 == 80) {
                            field1181 = 1;
                        }
                        if (var34 && field1168.length() < 320) {
                            field1168 = field1168 + Statics.field127;
                        }
                    } else if (field1181 == 1) {
                        if (Statics.field362 == 85 && field1172.length() > 0) {
                            field1172 = field1172.substring(0, field1172.length() - 1);
                        }
                        if (Statics.field362 == 84 || Statics.field362 == 80) {
                            field1181 = 0;
                        }
                        if (Statics.field362 == 84) {
                            field1168 = field1168.trim();
                            if (field1168.length() == 0) {
                                method693(class225.field2859, class225.field2860, class225.field2813);
                                return;
                            }
                            if (field1172.length() == 0) {
                                method693(class225.field2949, class225.field2763, class225.field3013);
                                return;
                            }
                            method693(class225.field2762, class225.field2922, class225.field2974);
                            client.method2087(false);
                            client.method178(20);
                            return;
                        }
                        if (var34 && field1172.length() < 20) {
                            field1172 = field1172 + Statics.field127;
                        }
                    }
                }
                return;
            }
        } else if (field1169 == 3) {
            int var36 = field1158 + 180;
            short var37 = 276;
            if (var14 == 1 && var15 >= var36 - 75 && var15 <= var36 + 75 && var16 >= var37 - 20 && var16 <= var37 + 20) {
                method464(false);
            }
            int var38 = field1158 + 180;
            short var39 = 326;
            if (var14 == 1 && var15 >= var38 - 75 && var15 <= var38 + 75 && var16 >= var39 - 20 && var16 <= var39 + 20) {
                method693(class225.field3006, class225.field3019, class225.field3008);
                field1169 = 5;
                return;
            }
        } else if (field1169 == 4) {
            int var40 = field1158 + 180 - 80;
            short var41 = 321;
            if (var14 == 1 && var15 >= var40 - 75 && var15 <= var40 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                Statics.field1125.trim();
                if (Statics.field1125.length() != 6) {
                    method693(class225.field2778, class225.field2779, class225.field2780);
                    return;
                }
                Statics.field2730 = Integer.parseInt(Statics.field1125);
                Statics.field1125 = "";
                client.method2087(true);
                method693(class225.field2762, class225.field2922, class225.field2974);
                client.method178(20);
                return;
            }
            if (var14 == 1 && var15 >= field1158 + 180 - 9 && var15 <= field1158 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                field1184 = !field1184;
            }
            if (var14 == 1 && var15 >= field1158 + 180 - 34 && var15 <= field1158 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                class52.method183(client.method53("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var42 = field1158 + 180 + 80;
            if (var14 == 1 && var15 >= var42 - 75 && var15 <= var42 + 75 && var16 >= var41 - 20 && var16 <= var41 + 20) {
                field1169 = 0;
                field1168 = "";
                field1172 = "";
                Statics.field2730 = 0;
                Statics.field1125 = "";
            }
            while (class46.method4702()) {
                boolean var43 = false;
                for (int var44 = 0; var44 < field1151.length(); var44++) {
                    if (Statics.field127 == field1151.charAt(var44)) {
                        var43 = true;
                        break;
                    }
                }
                if (Statics.field362 == 13) {
                    field1169 = 0;
                    field1168 = "";
                    field1172 = "";
                    Statics.field2730 = 0;
                    Statics.field1125 = "";
                } else {
                    if (Statics.field362 == 85 && Statics.field1125.length() > 0) {
                        Statics.field1125 = Statics.field1125.substring(0, Statics.field1125.length() - 1);
                    }
                    if (Statics.field362 == 84) {
                        Statics.field1125.trim();
                        if (Statics.field1125.length() != 6) {
                            method693(class225.field2778, class225.field2779, class225.field2780);
                            return;
                        }
                        Statics.field2730 = Integer.parseInt(Statics.field1125);
                        Statics.field1125 = "";
                        client.method2087(true);
                        method693(class225.field2762, class225.field2922, class225.field2974);
                        client.method178(20);
                        return;
                    }
                    if (var43 && Statics.field1125.length() < 6) {
                        Statics.field1125 = Statics.field1125 + Statics.field127;
                    }
                }
            }
        } else if (field1169 == 5) {
            int var45 = field1158 + 180 - 80;
            short var46 = 321;
            if (var14 == 1 && var15 >= var45 - 75 && var15 <= var45 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                method3793();
                return;
            }
            int var47 = field1158 + 180 + 80;
            if (var14 == 1 && var15 >= var47 - 75 && var15 <= var47 + 75 && var16 >= var46 - 20 && var16 <= var46 + 20) {
                method464(true);
            }
            short var48 = 361;
            if (Statics.field412 != null) {
                int var49 = Statics.field412.field3835 / 2;
                if (var14 == 1 && var15 >= Statics.field412.field3833 - var49 && var15 <= Statics.field412.field3833 + var49 && var16 >= var48 - 15 && var16 < var48) {
                    class52.method183(client.method53("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method4702()) {
                boolean var50 = false;
                for (int var51 = 0; var51 < field1174.length(); var51++) {
                    if (Statics.field127 == field1174.charAt(var51)) {
                        var50 = true;
                        break;
                    }
                }
                if (Statics.field362 == 13) {
                    method464(true);
                } else {
                    if (Statics.field362 == 85 && field1168.length() > 0) {
                        field1168 = field1168.substring(0, field1168.length() - 1);
                    }
                    if (Statics.field362 == 84) {
                        method3793();
                        return;
                    }
                    if (var50 && field1168.length() < 320) {
                        field1168 = field1168 + Statics.field127;
                    }
                }
            }
        } else if (field1169 == 6) {
            while (true) {
                do {
                    if (!class46.method4702()) {
                        short var52 = 321;
                        if (var14 == 1 && var16 >= var52 - 20 && var16 <= var52 + 20) {
                            method464(true);
                        }
                        return;
                    }
                } while (Statics.field362 != 84 && Statics.field362 != 13);
                method464(true);
            }
        } else if (field1169 == 7) {
            int var53 = field1158 + 180 - 80;
            short var54 = 321;
            if (var14 == 1 && var15 >= var53 - 75 && var15 <= var53 + 75 && var16 >= var54 - 20 && var16 <= var54 + 20) {
                class52.method183(client.method53("secure", true) + "m=dob/set_dob.ws", true, false);
                method693(class225.field2861, class225.field2919, class225.field2847);
                field1169 = 6;
                return;
            }
            int var55 = field1158 + 180 + 80;
            if (var14 == 1 && var15 >= var55 - 75 && var15 <= var55 + 75 && var16 >= var54 - 20 && var16 <= var54 + 20) {
                method464(true);
            }
        } else if (field1169 == 8) {
            int var56 = field1158 + 180 - 80;
            short var57 = 321;
            if (var14 == 1 && var15 >= var56 - 75 && var15 <= var56 + 75 && var16 >= var57 - 20 && var16 <= var57 + 20) {
                class52.method183("https://www.jagex.com/terms/privacy/#eight", true, false);
                method693(class225.field2861, class225.field2919, class225.field2847);
                field1169 = 6;
                return;
            }
            int var58 = field1158 + 180 + 80;
            if (var14 == 1 && var15 >= var58 - 75 && var15 <= var58 + 75 && var16 >= var57 - 20 && var16 <= var57 + 20) {
                method464(true);
            }
        } else if (field1169 == 12) {
            String var59 = "";
            switch(field1157) {
                case 0:
                    var59 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var59 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method464(false);
            }
            int var60 = field1158 + 180;
            short var61 = 276;
            if (var14 == 1 && var15 >= var60 - 75 && var15 <= var60 + 75 && var16 >= var61 - 20 && var16 <= var61 + 20) {
                class52.method183(var59, true, false);
                method693(class225.field2861, class225.field2919, class225.field2847);
                field1169 = 6;
                return;
            }
            int var62 = field1158 + 180;
            short var63 = 326;
            if (var14 == 1 && var15 >= var62 - 75 && var15 <= var62 + 75 && var16 >= var63 - 20 && var16 <= var63 + 20) {
                method464(false);
            }
        } else if (field1169 == 24) {
            int var64 = field1158 + 180;
            short var65 = 301;
            if (var14 == 1 && var15 >= var64 - 75 && var15 <= var64 + 75 && var16 >= var65 - 20 && var16 <= var65 + 20) {
                method464(false);
            }
        }
    }

    @ObfuscatedName("al.l(ZI)V")
    public static void method464(boolean arg0) {
        field1173 = class225.field2906;
        field1166 = class225.field2776;
        field1167 = class225.field2956;
        field1169 = 2;
        if (arg0) {
            field1172 = "";
        }
        if (field1168 == null || field1168.length() <= 0) {
            if (Statics.field928.field1027 == null) {
                client.field661 = false;
            } else {
                field1168 = Statics.field928.field1027;
                client.field661 = true;
            }
        }
        if (client.field661 && field1168 != null && field1168.length() > 0) {
            field1181 = 1;
        } else {
            field1181 = 0;
        }
    }

    @ObfuscatedName("ha.u(B)V")
    public static void method3793() {
        field1168 = field1168.trim();
        if (field1168.length() == 0) {
            method693(class225.field3006, class225.field3019, class225.field3008);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method53("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class300 var4 = new class300(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field3694, var4.field3696, 1000 - var4.field3696);
                if (var5 == -1) {
                    var4.field3696 = 0;
                    long var8 = var4.method5143();
                    var6 = var8;
                    break;
                }
                var4.field3696 += var5;
                if (var4.field3696 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var46) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1168;
            Random var15 = new Random();
            class300 var16 = new class300(128);
            class300 var17 = new class300(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method5087(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method5090(var15.nextInt());
            }
            var16.method5090(var18[0]);
            var16.method5090(var18[1]);
            var16.method5173(var6);
            var16.method5173(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method5090(var15.nextInt());
            }
            var16.method5126(class81.field1106, class81.field1107);
            var17.method5087(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method5090(var15.nextInt());
            }
            var17.method5173(var15.nextLong());
            var17.method5091(var15.nextLong());
            client.method4437(var17);
            var17.method5173(var15.nextLong());
            var17.method5126(class81.field1106, class81.field1107);
            int var22 = class300.method2018(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class300 var23 = new class300(var22);
            var23.method5094(var14);
            var23.field3696 = var22;
            var23.method5122(var18);
            class300 var24 = new class300(var23.field3696 + var17.field3696 + var16.field3696 + 5);
            var24.method5087(2);
            var24.method5087(var16.field3696);
            var24.method5169(var16.field3694, 0, var16.field3696);
            var24.method5087(var17.field3696);
            var24.method5169(var17.field3694, 0, var17.field3696);
            var24.method5145(var23.field3696);
            var24.method5169(var23.field3694, 0, var23.field3696);
            byte[] var25 = var24.field3694;
            int var26 = var25.length;
            StringBuilder var27 = new StringBuilder();
            for (int var28 = 0; var28 < var26; var28 += 3) {
                int var29 = var25[var28] & 0xFF;
                var27.append(class290.field3627[var29 >>> 2]);
                if (var28 < var26 - 1) {
                    int var30 = var25[var28 + 1] & 0xFF;
                    var27.append(class290.field3627[(var29 & 0x3) << 4 | var30 >>> 4]);
                    if (var28 < var26 - 2) {
                        int var31 = var25[var28 + 2] & 0xFF;
                        var27.append(class290.field3627[(var30 & 0xF) << 2 | var31 >>> 6]).append(class290.field3627[var31 & 0x3F]);
                    } else {
                        var27.append(class290.field3627[(var30 & 0xF) << 2]).append("=");
                    }
                } else {
                    var27.append(class290.field3627[(var29 & 0x3) << 4]).append("==");
                }
            }
            String var32 = var27.toString();
            String var34 = var32;
            byte var41;
            try {
                URL var35 = new URL(client.method53("services", false) + "m=accountappeal/login.ws");
                URLConnection var36 = var35.openConnection();
                var36.setDoInput(true);
                var36.setDoOutput(true);
                var36.setConnectTimeout(5000);
                OutputStreamWriter var37 = new OutputStreamWriter(var36.getOutputStream());
                var37.write("data2=" + class340.method4813(var34) + "&dest=" + class340.method4813("passwordchoice.ws"));
                var37.flush();
                InputStream var38 = var36.getInputStream();
                class300 var39 = new class300(new byte[1000]);
                while (true) {
                    int var40 = var38.read(var39.field3694, var39.field3696, 1000 - var39.field3696);
                    if (var40 == -1) {
                        var37.close();
                        var38.close();
                        String var42 = new String(var39.field3694);
                        if (var42.startsWith("OFFLINE")) {
                            var41 = 4;
                        } else if (var42.startsWith("WRONG")) {
                            var41 = 7;
                        } else if (var42.startsWith("RELOAD")) {
                            var41 = 3;
                        } else if (var42.startsWith("Not permitted for social network accounts.")) {
                            var41 = 6;
                        } else {
                            var39.method5137(var18);
                            while (var39.field3696 > 0 && var39.field3694[var39.field3696 - 1] == 0) {
                                var39.field3696--;
                            }
                            String var43 = new String(var39.field3694, 0, var39.field3696);
                            if (class81.method1017(var43)) {
                                class52.method183(var43, true, false);
                                var41 = 2;
                            } else {
                                var41 = 5;
                            }
                        }
                        break;
                    }
                    var39.field3696 += var40;
                    if (var39.field3696 >= 1000) {
                        var41 = 5;
                        break;
                    }
                }
            } catch (Throwable var45) {
                var45.printStackTrace();
                var41 = 5;
            }
            var13 = var41;
        }
        switch(var13) {
            case 2:
                method693(class225.field3009, class225.field2967, class225.field2845);
                field1169 = 6;
                break;
            case 3:
                method693(class225.field3012, class225.field2909, class225.field3014);
                break;
            case 4:
                method693(class225.field2895, class225.field3016, class225.field2977);
                break;
            case 5:
                method693(class225.field3018, class225.field3021, class225.field2930);
                break;
            case 6:
                method693(class225.field2953, class225.field3022, class225.field3023);
                break;
            case 7:
                method693(class225.field2852, class225.field3025, class225.field2795);
        }
    }

    @ObfuscatedName("bn.j(Lkf;Lkf;Lkf;I)V")
    public static void method892(class295 arg0, class295 arg1, class295 arg2) {
        field1152 = (Statics.field3796 - 765) / 2;
        field1158 = field1152 + 202;
        Statics.field3211 = field1158 + 180;
        if (field1177) {
            if (Statics.field1981 == null) {
                class236 var3 = Statics.field205;
                int var4 = var3.method3843("sl_back");
                int var5 = var3.method3865(var4, "");
                class325[] var6 = class326.method1555(var3, var4, var5);
                Statics.field1981 = var6;
            }
            if (Statics.field3065 == null) {
                Statics.field3065 = class326.method108(Statics.field205, "sl_flags", "");
            }
            if (Statics.field2022 == null) {
                Statics.field2022 = class326.method108(Statics.field205, "sl_arrows", "");
            }
            if (Statics.field3051 == null) {
                Statics.field3051 = class326.method108(Statics.field205, "sl_stars", "");
            }
            if (Statics.field6 == null) {
                Statics.field6 = class326.method1789(Statics.field205, "leftarrow", "");
            }
            if (Statics.field177 == null) {
                Statics.field177 = class326.method1789(Statics.field205, "rightarrow", "");
            }
            class321.method5565(field1152, 23, 765, 480, 0);
            class321.method5566(field1152, 0, 125, 23, 12425273, 9135624);
            class321.method5566(field1152 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4960(class225.field3031, field1152 + 62, 15, 0, -1);
            if (Statics.field3051 != null) {
                Statics.field3051[1].method5640(field1152 + 140, 1);
                arg1.method4957(class225.field3032, field1152 + 152, 10, 16777215, -1);
                Statics.field3051[0].method5640(field1152 + 140, 12);
                arg1.method4957(class225.field2948, field1152 + 152, 21, 16777215, -1);
            }
            if (Statics.field2022 != null) {
                int var7 = field1152 + 280;
                if (class72.field996[0] == 0 && class72.field991[0] == 0) {
                    Statics.field2022[2].method5640(var7, 4);
                } else {
                    Statics.field2022[0].method5640(var7, 4);
                }
                if (class72.field996[0] == 0 && class72.field991[0] == 1) {
                    Statics.field2022[3].method5640(var7 + 15, 4);
                } else {
                    Statics.field2022[1].method5640(var7 + 15, 4);
                }
                arg0.method4957(class225.field3034, var7 + 32, 17, 16777215, -1);
                int var8 = field1152 + 390;
                if (class72.field996[0] == 1 && class72.field991[0] == 0) {
                    Statics.field2022[2].method5640(var8, 4);
                } else {
                    Statics.field2022[0].method5640(var8, 4);
                }
                if (class72.field996[0] == 1 && class72.field991[0] == 1) {
                    Statics.field2022[3].method5640(var8 + 15, 4);
                } else {
                    Statics.field2022[1].method5640(var8 + 15, 4);
                }
                arg0.method4957(class225.field3035, var8 + 32, 17, 16777215, -1);
                int var9 = field1152 + 500;
                if (class72.field996[0] == 2 && class72.field991[0] == 0) {
                    Statics.field2022[2].method5640(var9, 4);
                } else {
                    Statics.field2022[0].method5640(var9, 4);
                }
                if (class72.field996[0] == 2 && class72.field991[0] == 1) {
                    Statics.field2022[3].method5640(var9 + 15, 4);
                } else {
                    Statics.field2022[1].method5640(var9 + 15, 4);
                }
                arg0.method4957(class225.field3036, var9 + 32, 17, 16777215, -1);
                int var10 = field1152 + 610;
                if (class72.field996[0] == 3 && class72.field991[0] == 0) {
                    Statics.field2022[2].method5640(var10, 4);
                } else {
                    Statics.field2022[0].method5640(var10, 4);
                }
                if (class72.field996[0] == 3 && class72.field991[0] == 1) {
                    Statics.field2022[3].method5640(var10 + 15, 4);
                } else {
                    Statics.field2022[1].method5640(var10 + 15, 4);
                }
                arg0.method4957(class225.field3037, var10 + 32, 17, 16777215, -1);
            }
            class321.method5565(field1152 + 708, 4, 50, 16, 0);
            arg1.method4960(class225.field2857, field1152 + 708 + 25, 16, 16777215, -1);
            field1178 = -1;
            if (Statics.field1981 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class72.field989) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class72.field989) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class72.field989) {
                        var14--;
                    }
                } while (var14 != var15 || var13 != var16);
                int var17 = (765 - var11 * var13) / (var13 + 1);
                if (var17 > 5) {
                    var17 = 5;
                }
                int var18 = (480 - var12 * var14) / (var14 + 1);
                if (var18 > 5) {
                    var18 = 5;
                }
                int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
                int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
                int var21 = (class72.field989 + var14 - 1) / var14;
                field1180 = var21 - var13;
                if (Statics.field6 != null && field1179 > 0) {
                    Statics.field6.method5640(8, Statics.field434 / 2 - Statics.field6.field3861 / 2);
                }
                if (Statics.field177 != null && field1179 < field1180) {
                    Statics.field177.method5640(Statics.field3796 - Statics.field177.field3865 - 8, Statics.field434 / 2 - Statics.field177.field3861 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field1152 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field1179;
                for (int var27 = var14 * var26; var27 < class72.field989 && var26 - field1179 < var13; var27++) {
                    class72 var28 = Statics.field988[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field995);
                    if (var28.field995 == -1) {
                        var30 = class225.field3038;
                        var29 = false;
                    } else if (var28.field995 > 1980) {
                        var30 = class225.field3039;
                        var29 = false;
                    }
                    int var31 = 0;
                    byte var32;
                    if (var28.method1586()) {
                        if (var28.method1581()) {
                            var32 = 7;
                        } else {
                            var32 = 6;
                        }
                    } else if (var28.method1585()) {
                        var31 = 16711680;
                        if (var28.method1581()) {
                            var32 = 5;
                        } else {
                            var32 = 4;
                        }
                    } else if (var28.method1602()) {
                        if (var28.method1581()) {
                            var32 = 3;
                        } else {
                            var32 = 2;
                        }
                    } else if (var28.method1581()) {
                        var32 = 1;
                    } else {
                        var32 = 0;
                    }
                    if (class55.field462 >= var23 && class55.field463 >= var22 && class55.field462 < var11 + var23 && class55.field463 < var12 + var22 && var29) {
                        field1178 = var27;
                        Statics.field1981[var32].method5674(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field1981[var32].method5668(var23, var22);
                    }
                    if (Statics.field3065 != null) {
                        Statics.field3065[(var28.method1581() ? 8 : 0) + var28.field998].method5640(var23 + 29, var22);
                    }
                    arg0.method4960(Integer.toString(var28.field993), var23 + 15, var12 / 2 + var22 + 5, var31, -1);
                    arg1.method4960(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
                    var22 += var12 + var18;
                    var24++;
                    if (var24 >= var14) {
                        var22 = var20 + 23;
                        var23 += var11 + var17;
                        var24 = 0;
                        var26++;
                    }
                }
                if (var25) {
                    int var33 = arg1.method4952(Statics.field988[field1178].field990) + 6;
                    int var34 = arg1.field3665 + 8;
                    int var35 = class55.field463 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class55.field463 - 25 - var34;
                    }
                    class321.method5565(class55.field462 - var33 / 2, var35, var33, var34, 16777120);
                    class321.method5569(class55.field462 - var33 / 2, var35, var33, var34, 0);
                    arg1.method4960(Statics.field988[field1178].field990, class55.field462, arg1.field3665 + var35 + 4, 0, -1);
                }
            }
            Statics.field394.method744(0, 0);
            return;
        }
        Statics.field1153.method5668(field1152, 0);
        Statics.field2336.method5668(field1152 + 382, 0);
        Statics.field1089.method5640(field1152 + 382 - Statics.field1089.field3865 / 2, 18);
        if (client.field631 == 0 || client.field631 == 5) {
            byte var36 = 20;
            arg0.method4960(class225.field2879, field1158 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class321.method5569(field1158 + 180 - 152, var37, 304, 34, 9179409);
            class321.method5569(field1158 + 180 - 151, var37 + 1, 302, 32, 0);
            class321.method5565(field1158 + 180 - 150, var37 + 2, field1156 * 3, 30, 9179409);
            class321.method5565(field1156 * 3 + (field1158 + 180 - 150), var37 + 2, 300 - field1156 * 3, 30, 0);
            arg0.method4960(field1160, field1158 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field631 == 20) {
            Statics.field1159.method5640(field1158 + 180 - Statics.field1159.field3865 / 2, 271 - Statics.field1159.field3861 / 2);
            short var38 = 201;
            arg0.method4960(field1173, field1158 + 180, var38, 16776960, 0);
            int var119 = var38 + 15;
            arg0.method4960(field1166, field1158 + 180, var119, 16776960, 0);
            int var120 = var119 + 15;
            arg0.method4960(field1167, field1158 + 180, var120, 16776960, 0);
            int var121 = var120 + 15;
            int var122 = var121 + 7;
            if (field1169 != 4) {
                arg0.method4957(class225.field2981, field1158 + 180 - 110, var122, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = method3999(); arg0.method4952(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method4957(class296.method4968(var40), field1158 + 180 - 70, var122, 16777215, 0);
                var119 = var122 + 15;
                arg0.method4957(class225.field2982 + class291.method2521(field1172), field1158 + 180 - 108, var119, 16777215, 0);
                var119 += 15;
            }
        }
        if (client.field631 == 10 || client.field631 == 11) {
            Statics.field1159.method5640(field1158, 171);
            if (field1169 == 0) {
                short var41 = 251;
                arg0.method4960(class225.field2984, field1158 + 180, var41, 16776960, 0);
                int var123 = var41 + 30;
                int var42 = field1158 + 180 - 80;
                short var43 = 291;
                Statics.field2333.method5640(var42 - 73, var43 - 20);
                arg0.method4956(class225.field3011, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field1158 + 180 + 80;
                Statics.field2333.method5640(var44 - 73, var43 - 20);
                arg0.method4956(class225.field2986, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1169 == 1) {
                arg0.method4960(field1161, field1158 + 180, 201, 16776960, 0);
                short var45 = 236;
                arg0.method4960(field1173, field1158 + 180, var45, 16777215, 0);
                int var124 = var45 + 15;
                arg0.method4960(field1166, field1158 + 180, var124, 16777215, 0);
                int var125 = var124 + 15;
                arg0.method4960(field1167, field1158 + 180, var125, 16777215, 0);
                int var126 = var125 + 15;
                int var46 = field1158 + 180 - 80;
                short var47 = 321;
                Statics.field2333.method5640(var46 - 73, var47 - 20);
                arg0.method4960(class225.field2745, var46, var47 + 5, 16777215, 0);
                int var48 = field1158 + 180 + 80;
                Statics.field2333.method5640(var48 - 73, var47 - 20);
                arg0.method4960(class225.field2857, var48, var47 + 5, 16777215, 0);
            } else if (field1169 == 2) {
                short var49 = 201;
                arg0.method4960(field1173, Statics.field3211, var49, 16776960, 0);
                int var127 = var49 + 15;
                arg0.method4960(field1166, Statics.field3211, var127, 16776960, 0);
                int var128 = var127 + 15;
                arg0.method4960(field1167, Statics.field3211, var128, 16776960, 0);
                int var129 = var128 + 15;
                int var130 = var129 + 7;
                arg0.method4957(class225.field2981, Statics.field3211 - 110, var130, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = method3999(); arg0.method4952(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method4957(class296.method4968(var51) + (field1181 == 0 & client.field628 % 40 < 20 ? class82.method3142(16776960) + class82.field1120 : ""), Statics.field3211 - 70, var130, 16777215, 0);
                var127 = var130 + 15;
                String var53 = class225.field2982;
                String var54 = field1172;
                String var55 = class291.method4152('*', var54.length());
                arg0.method4957(var53 + var55 + (field1181 == 1 & client.field628 % 40 < 20 ? class82.method3142(16776960) + class82.field1120 : ""), Statics.field3211 - 108, var127, 16777215, 0);
                var127 += 15;
                short var56 = 277;
                int var57 = Statics.field3211 + -117;
                boolean var58 = client.field661;
                boolean var59 = field1170;
                class324 var60 = var58 ? (var59 ? Statics.field203 : Statics.field1150) : (var59 ? Statics.field1154 : Statics.field25);
                var60.method5640(var57, var56);
                int var62 = var60.field3865 + 5 + var57;
                arg1.method4957(class225.field2881, var62, var56 + 13, 16776960, 0);
                int var63 = Statics.field3211 + 24;
                boolean var64 = Statics.field928.field1022;
                boolean var65 = field1171;
                class324 var66 = var64 ? (var65 ? Statics.field203 : Statics.field1150) : (var65 ? Statics.field1154 : Statics.field25);
                var66.method5640(var63, var56);
                int var68 = var66.field3865 + 5 + var63;
                arg1.method4957(class225.field2990, var68, var56 + 13, 16776960, 0);
                int var131 = var56 + 15;
                int var69 = Statics.field3211 - 80;
                short var70 = 321;
                Statics.field2333.method5640(var69 - 73, var70 - 20);
                arg0.method4960(class225.field2893, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field3211 + 80;
                Statics.field2333.method5640(var71 - 73, var70 - 20);
                arg0.method4960(class225.field2857, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                switch(field1162) {
                    case 2:
                        Statics.field406 = class225.field3002;
                        break;
                    default:
                        Statics.field406 = class225.field3000;
                }
                Statics.field2370 = new class319(Statics.field3211, var72, arg1.method4952(Statics.field406), 11);
                Statics.field412 = new class319(Statics.field3211, var72, arg1.method4952(class225.field2760), 11);
                arg1.method4960(Statics.field406, Statics.field3211, var72, 16777215, 0);
            } else if (field1169 == 3) {
                short var73 = 201;
                arg0.method4960(class225.field2991, field1158 + 180, var73, 16776960, 0);
                int var132 = var73 + 20;
                arg1.method4960(class225.field2747, field1158 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg1.method4960(class225.field2862, field1158 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                int var74 = field1158 + 180;
                short var75 = 276;
                Statics.field2333.method5640(var74 - 73, var75 - 20);
                arg2.method4960(class225.field2994, var74, var75 + 5, 16777215, 0);
                int var76 = field1158 + 180;
                short var77 = 326;
                Statics.field2333.method5640(var76 - 73, var77 - 20);
                arg2.method4960(class225.field2995, var76, var77 + 5, 16777215, 0);
            } else if (field1169 == 4) {
                arg0.method4960(class225.field2970, field1158 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method4960(field1173, field1158 + 180, var78, 16777215, 0);
                int var135 = var78 + 15;
                arg0.method4960(field1166, field1158 + 180, var135, 16777215, 0);
                int var136 = var135 + 15;
                arg0.method4960(field1167, field1158 + 180, var136, 16777215, 0);
                int var137 = var136 + 15;
                arg0.method4957(class225.field2983 + class291.method2521(Statics.field1125) + (client.field628 % 40 < 20 ? class82.method3142(16776960) + class82.field1120 : ""), field1158 + 180 - 108, var137, 16777215, 0);
                int var138 = var137 - 8;
                arg0.method4957(class225.field2873, field1158 + 180 - 9, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method4957(class225.field2988, field1158 + 180 - 9, var139, 16776960, 0);
                int var79 = field1158 + 180 - 9 + arg0.method4952(class225.field2988) + 15;
                int var80 = var139 - arg0.field3665;
                class324 var81;
                if (field1184) {
                    var81 = Statics.field1150;
                } else {
                    var81 = Statics.field25;
                }
                var81.method5640(var79, var80);
                var135 = var139 + 15;
                int var82 = field1158 + 180 - 80;
                short var83 = 321;
                Statics.field2333.method5640(var82 - 73, var83 - 20);
                arg0.method4960(class225.field2745, var82, var83 + 5, 16777215, 0);
                int var84 = field1158 + 180 + 80;
                Statics.field2333.method5640(var84 - 73, var83 - 20);
                arg0.method4960(class225.field2857, var84, var83 + 5, 16777215, 0);
                arg1.method4960(class225.field2971, field1158 + 180, var83 + 36, 255, 0);
            } else if (field1169 == 5) {
                arg0.method4960(class225.field2963, field1158 + 180, 201, 16776960, 0);
                short var85 = 221;
                arg2.method4960(field1173, field1158 + 180, var85, 16776960, 0);
                int var140 = var85 + 15;
                arg2.method4960(field1166, field1158 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg2.method4960(field1167, field1158 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var143 = var142 + 14;
                arg0.method4957(class225.field2836, field1158 + 180 - 145, var143, 16777215, 0);
                short var86 = 174;
                String var87;
                for (var87 = method3999(); arg0.method4952(var87) > var86; var87 = var87.substring(1)) {
                }
                arg0.method4957(class296.method4968(var87) + (client.field628 % 40 < 20 ? class82.method3142(16776960) + class82.field1120 : ""), field1158 + 180 - 34, var143, 16777215, 0);
                var140 = var143 + 15;
                int var88 = field1158 + 180 - 80;
                short var89 = 321;
                Statics.field2333.method5640(var88 - 73, var89 - 20);
                arg0.method4960(class225.field2998, var88, var89 + 5, 16777215, 0);
                int var90 = field1158 + 180 + 80;
                Statics.field2333.method5640(var90 - 73, var89 - 20);
                arg0.method4960(class225.field2921, var90, var89 + 5, 16777215, 0);
                short var91 = 356;
                arg1.method4960(class225.field2760, Statics.field3211, var91, 268435455, 0);
            } else if (field1169 == 6) {
                short var92 = 201;
                arg0.method4960(field1173, field1158 + 180, var92, 16776960, 0);
                int var144 = var92 + 15;
                arg0.method4960(field1166, field1158 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg0.method4960(field1167, field1158 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var93 = field1158 + 180;
                short var94 = 321;
                Statics.field2333.method5640(var93 - 73, var94 - 20);
                arg0.method4960(class225.field2921, var93, var94 + 5, 16777215, 0);
            } else if (field1169 == 7) {
                short var95 = 216;
                arg0.method4960(class225.field2822, field1158 + 180, var95, 16776960, 0);
                int var147 = var95 + 15;
                arg2.method4960(class225.field3028, field1158 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg2.method4960(class225.field2751, field1158 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var96 = field1158 + 180 - 80;
                short var97 = 321;
                Statics.field2333.method5640(var96 - 73, var97 - 20);
                arg0.method4960(class225.field2750, var96, var97 + 5, 16777215, 0);
                int var98 = field1158 + 180 + 80;
                Statics.field2333.method5640(var98 - 73, var97 - 20);
                arg0.method4960(class225.field2921, var98, var97 + 5, 16777215, 0);
            } else if (field1169 == 8) {
                short var99 = 216;
                arg0.method4960(class225.field2877, field1158 + 180, var99, 16776960, 0);
                int var150 = var99 + 15;
                arg2.method4960(class225.field2878, field1158 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg2.method4960(class225.field2739, field1158 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var100 = field1158 + 180 - 80;
                short var101 = 321;
                Statics.field2333.method5640(var100 - 73, var101 - 20);
                arg0.method4960(class225.field2880, var100, var101 + 5, 16777215, 0);
                int var102 = field1158 + 180 + 80;
                Statics.field2333.method5640(var102 - 73, var101 - 20);
                arg0.method4960(class225.field2921, var102, var101 + 5, 16777215, 0);
            } else if (field1169 == 12) {
                short var103 = 201;
                String var104 = "";
                String var105 = "";
                String var106 = "";
                switch(field1157) {
                    case 0:
                        var104 = class225.field2793;
                        var105 = class225.field2864;
                        var106 = class225.field2964;
                        break;
                    case 1:
                        var104 = class225.field2832;
                        var105 = class225.field3017;
                        var106 = class225.field2834;
                        break;
                    default:
                        method464(false);
                }
                arg0.method4960(var104, field1158 + 180, var103, 16776960, 0);
                int var153 = var103 + 15;
                arg2.method4960(var105, field1158 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg2.method4960(var106, field1158 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                int var107 = field1158 + 180;
                short var108 = 276;
                Statics.field2333.method5640(var107 - 73, var108 - 20);
                arg0.method4960(class225.field2887, var107, var108 + 5, 16777215, 0);
                int var109 = field1158 + 180;
                short var110 = 326;
                Statics.field2333.method5640(var109 - 73, var110 - 20);
                arg0.method4960(class225.field2921, var109, var110 + 5, 16777215, 0);
            } else if (field1169 == 24) {
                short var111 = 221;
                arg0.method4960(field1173, field1158 + 180, var111, 16777215, 0);
                int var156 = var111 + 15;
                arg0.method4960(field1166, field1158 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                arg0.method4960(field1167, field1158 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                int var112 = field1158 + 180;
                short var113 = 301;
                Statics.field2333.method5640(var112 - 73, var113 - 20);
                arg0.method4960(class225.field2743, var112, var113 + 5, 16777215, 0);
            }
        }
        if (client.field631 >= 10) {
            int[] var114 = new int[4];
            class321.method5560(var114);
            class321.method5558(field1152, 0, field1152 + 765, Statics.field434);
            Statics.field1955.method1636(field1152 - 22, client.field628);
            Statics.field1955.method1636(field1152 + 765 + 22 - 128, client.field628);
            class321.method5561(var114);
        }
        Statics.field2023[Statics.field928.field1025 ? 1 : 0].method5640(field1152 + 765 - 40, 463);
        if (client.field631 <= 5 || Statics.field361 != class191.field2327) {
            return;
        }
        if (Statics.field33 == null) {
            Statics.field33 = class326.method1789(Statics.field205, "sl_button", "");
            return;
        }
        int var115 = field1152 + 5;
        short var116 = 463;
        byte var117 = 100;
        byte var118 = 35;
        Statics.field33.method5640(var115, var116);
        arg0.method4960(class225.field2908 + " " + client.field624, var117 / 2 + var115, var118 / 2 + var116 - 2, 16777215, 0);
        if (Statics.field2078 == null) {
            arg1.method4960(class225.field3041, var117 / 2 + var115, var118 / 2 + var116 + 12, 16777215, 0);
        } else {
            arg1.method4960(class225.field3040, var117 / 2 + var115, var118 / 2 + var116 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ai.v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method693(String arg0, String arg1, String arg2) {
        field1173 = arg0;
        field1166 = arg1;
        field1167 = arg2;
    }

    @ObfuscatedName("cf.d(Lbb;I)V")
    public static void method2109(class72 arg0) {
        if (arg0.method1581() != client.field627) {
            client.field627 = arg0.method1581();
            class255.method2754(arg0.method1581());
        }
        Statics.field508 = arg0.field1000;
        client.field624 = arg0.field993;
        client.field760 = arg0.field999;
        Statics.field276 = client.field626 == 0 ? 43594 : arg0.field993 + 40000;
        Statics.field3896 = client.field626 == 0 ? 443 : arg0.field993 + 50000;
        Statics.field2295 = Statics.field276;
    }

    @ObfuscatedName("bh.z(I)V")
    public static void method1106() {
        field1177 = false;
        Statics.field1153.method5668(field1152, 0);
        Statics.field2336.method5668(field1152 + 382, 0);
        Statics.field1089.method5640(field1152 + 382 - Statics.field1089.field3865 / 2, 18);
    }
}
